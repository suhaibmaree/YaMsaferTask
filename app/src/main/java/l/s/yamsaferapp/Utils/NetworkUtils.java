package l.s.yamsaferapp.Utils;

import android.content.Context;
import android.graphics.Movie;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.Log;
import android.widget.Toast;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;

import l.s.yamsaferapp.Accommodations.Accommodation;

/**
 * Created by suhaib on 9/11/18.
 */

public class NetworkUtils {

    private static final String TAG = "addingObject";

    public static ArrayList<Accommodation> fetchData(String url) throws IOException {
        ArrayList<Accommodation> accommodations = new ArrayList<Accommodation>();
        URL new_url = new URL(url);
        HttpURLConnection connection = (HttpURLConnection) new_url.openConnection();
        try {

            InputStream in = connection.getInputStream();
            Scanner scanner = new Scanner(in);
            scanner.useDelimiter("\\A");
            boolean hasInput = scanner.hasNext();
            if (hasInput) {
                String results = scanner.next();
                parseJson(results, accommodations);
            } else {
                return null;
            }
        } finally {
            connection.disconnect();
        }
        return accommodations;
    }

    public static void parseJson(String data, ArrayList<Accommodation> list) {

        try {

            JSONObject mainObject = new JSONObject(data);
            JSONArray resArray = mainObject.getJSONArray("accommodations");

            for (int i = 0; i < resArray.length(); i++) {
                JSONObject jsonObject = resArray.getJSONObject(i);
                Accommodation accommodation = new Accommodation(); //New Accommmodation object
                accommodation.setId(jsonObject.getInt("id"));
                accommodation.setName(jsonObject.getString("name"));
                accommodation.setDescription(jsonObject.getString("description"));
                accommodation.setCoverImage(jsonObject.getString("cover_image"));
                accommodation.setAllotment(jsonObject.getInt("allotment"));

                //Adding a new accommodations object into ArrayList
                Log.d(TAG, ""+accommodation.getName());
                list.add(accommodation);
            }

        } catch (JSONException e) {
            e.printStackTrace();
            Log.e(TAG, "Error occurred during JSON Parsing", e);
        }
    }//end parsJson

    public static Boolean networkStatus(Context context){
        ConnectivityManager manager = (ConnectivityManager)
                context.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = manager.getActiveNetworkInfo();
        if (networkInfo != null && networkInfo.isConnected()){
            return true;
        }
        Toast.makeText(context,"No Internet Connection",Toast.LENGTH_LONG).show();
        return false;
    }

}

