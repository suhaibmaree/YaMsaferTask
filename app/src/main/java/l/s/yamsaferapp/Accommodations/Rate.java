
package l.s.yamsaferapp.Accommodations;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Rate {

    private String rateIdentifier;
    private String rateKey;
    private String code;
    private Integer accommodationId;
    private Double baseRate;
    private Double taxedRate;
    private Double promotionRate;
    private Double rateBeforeTax;
    private Boolean isPromotion;
    private String promoDescription;
    private Integer discountPercentage;
    private Integer adults;
    private Integer children;
    private Integer maxChildAge;
    private String childrenAges;
    private List<NightlyRate> nightlyRates = null;
    private Integer extraFeeCharge;
    private List<Tax> taxes = null;
    private Integer taxesType;
    private List<Object> feesObjects = null;
    private List<String> benefits = null;
    private Boolean isRefundable;
    private String checkinInstructions;
    private String cancellationPolicy;
    private CancelPolicyList cancelPolicyList;
    private Boolean isHoldable;
    private Integer chargeableRate;
    private String currency;
    private Boolean isPrepaid;
    private Boolean isPackage;
    private Boolean isHotDeal;
    private Boolean depositRequired;
    private Boolean isCardless;
    private Boolean isActive;
    private Boolean isFenced;
    private String remarks;
    private String ruleAction;
    private Wallet wallet;
    private SupplierAttributes supplierAttributes;
    private String uniqueAdultRateId;
    private String uniquePriceRateId;
    private String uniqueChildrenRateId;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public String getRateIdentifier() {
        return rateIdentifier;
    }

    public void setRateIdentifier(String rateIdentifier) {
        this.rateIdentifier = rateIdentifier;
    }

    public String getRateKey() {
        return rateKey;
    }

    public void setRateKey(String rateKey) {
        this.rateKey = rateKey;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Integer getAccommodationId() {
        return accommodationId;
    }

    public void setAccommodationId(Integer accommodationId) {
        this.accommodationId = accommodationId;
    }

    public Double getBaseRate() {
        return baseRate;
    }

    public void setBaseRate(Double baseRate) {
        this.baseRate = baseRate;
    }

    public Double getTaxedRate() {
        return taxedRate;
    }

    public void setTaxedRate(Double taxedRate) {
        this.taxedRate = taxedRate;
    }

    public Double getPromotionRate() {
        return promotionRate;
    }

    public void setPromotionRate(Double promotionRate) {
        this.promotionRate = promotionRate;
    }

    public Double getRateBeforeTax() {
        return rateBeforeTax;
    }

    public void setRateBeforeTax(Double rateBeforeTax) {
        this.rateBeforeTax = rateBeforeTax;
    }

    public Boolean getIsPromotion() {
        return isPromotion;
    }

    public void setIsPromotion(Boolean isPromotion) {
        this.isPromotion = isPromotion;
    }

    public String getPromoDescription() {
        return promoDescription;
    }

    public void setPromoDescription(String promoDescription) {
        this.promoDescription = promoDescription;
    }

    public Integer getDiscountPercentage() {
        return discountPercentage;
    }

    public void setDiscountPercentage(Integer discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    public Integer getAdults() {
        return adults;
    }

    public void setAdults(Integer adults) {
        this.adults = adults;
    }

    public Integer getChildren() {
        return children;
    }

    public void setChildren(Integer children) {
        this.children = children;
    }

    public Integer getMaxChildAge() {
        return maxChildAge;
    }

    public void setMaxChildAge(Integer maxChildAge) {
        this.maxChildAge = maxChildAge;
    }

    public String getChildrenAges() {
        return childrenAges;
    }

    public void setChildrenAges(String childrenAges) {
        this.childrenAges = childrenAges;
    }

    public List<NightlyRate> getNightlyRates() {
        return nightlyRates;
    }

    public void setNightlyRates(List<NightlyRate> nightlyRates) {
        this.nightlyRates = nightlyRates;
    }

    public Integer getExtraFeeCharge() {
        return extraFeeCharge;
    }

    public void setExtraFeeCharge(Integer extraFeeCharge) {
        this.extraFeeCharge = extraFeeCharge;
    }

    public List<Tax> getTaxes() {
        return taxes;
    }

    public void setTaxes(List<Tax> taxes) {
        this.taxes = taxes;
    }

    public Integer getTaxesType() {
        return taxesType;
    }

    public void setTaxesType(Integer taxesType) {
        this.taxesType = taxesType;
    }

    public List<Object> getFeesObjects() {
        return feesObjects;
    }

    public void setFeesObjects(List<Object> feesObjects) {
        this.feesObjects = feesObjects;
    }

    public List<String> getBenefits() {
        return benefits;
    }

    public void setBenefits(List<String> benefits) {
        this.benefits = benefits;
    }

    public Boolean getIsRefundable() {
        return isRefundable;
    }

    public void setIsRefundable(Boolean isRefundable) {
        this.isRefundable = isRefundable;
    }

    public String getCheckinInstructions() {
        return checkinInstructions;
    }

    public void setCheckinInstructions(String checkinInstructions) {
        this.checkinInstructions = checkinInstructions;
    }

    public String getCancellationPolicy() {
        return cancellationPolicy;
    }

    public void setCancellationPolicy(String cancellationPolicy) {
        this.cancellationPolicy = cancellationPolicy;
    }

    public CancelPolicyList getCancelPolicyList() {
        return cancelPolicyList;
    }

    public void setCancelPolicyList(CancelPolicyList cancelPolicyList) {
        this.cancelPolicyList = cancelPolicyList;
    }

    public Boolean getIsHoldable() {
        return isHoldable;
    }

    public void setIsHoldable(Boolean isHoldable) {
        this.isHoldable = isHoldable;
    }

    public Integer getChargeableRate() {
        return chargeableRate;
    }

    public void setChargeableRate(Integer chargeableRate) {
        this.chargeableRate = chargeableRate;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Boolean getIsPrepaid() {
        return isPrepaid;
    }

    public void setIsPrepaid(Boolean isPrepaid) {
        this.isPrepaid = isPrepaid;
    }

    public Boolean getIsPackage() {
        return isPackage;
    }

    public void setIsPackage(Boolean isPackage) {
        this.isPackage = isPackage;
    }

    public Boolean getIsHotDeal() {
        return isHotDeal;
    }

    public void setIsHotDeal(Boolean isHotDeal) {
        this.isHotDeal = isHotDeal;
    }

    public Boolean getDepositRequired() {
        return depositRequired;
    }

    public void setDepositRequired(Boolean depositRequired) {
        this.depositRequired = depositRequired;
    }

    public Boolean getIsCardless() {
        return isCardless;
    }

    public void setIsCardless(Boolean isCardless) {
        this.isCardless = isCardless;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

    public Boolean getIsFenced() {
        return isFenced;
    }

    public void setIsFenced(Boolean isFenced) {
        this.isFenced = isFenced;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getRuleAction() {
        return ruleAction;
    }

    public void setRuleAction(String ruleAction) {
        this.ruleAction = ruleAction;
    }

    public Wallet getWallet() {
        return wallet;
    }

    public void setWallet(Wallet wallet) {
        this.wallet = wallet;
    }

    public SupplierAttributes getSupplierAttributes() {
        return supplierAttributes;
    }

    public void setSupplierAttributes(SupplierAttributes supplierAttributes) {
        this.supplierAttributes = supplierAttributes;
    }

    public String getUniqueAdultRateId() {
        return uniqueAdultRateId;
    }

    public void setUniqueAdultRateId(String uniqueAdultRateId) {
        this.uniqueAdultRateId = uniqueAdultRateId;
    }

    public String getUniquePriceRateId() {
        return uniquePriceRateId;
    }

    public void setUniquePriceRateId(String uniquePriceRateId) {
        this.uniquePriceRateId = uniquePriceRateId;
    }

    public String getUniqueChildrenRateId() {
        return uniqueChildrenRateId;
    }

    public void setUniqueChildrenRateId(String uniqueChildrenRateId) {
        this.uniqueChildrenRateId = uniqueChildrenRateId;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
