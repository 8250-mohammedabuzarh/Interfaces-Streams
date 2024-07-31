package insuranceapplication;

public class insurancepolicy {
    private String policyNumber;
    private String policyHolderName;
    private Double premiumAmount;

    public insurancepolicy(String policyNumber, String policyHolderName, Double premiumAmount) {
        this.policyNumber = policyNumber;
        this.policyHolderName = policyHolderName;
        this.premiumAmount = premiumAmount;
    }

    public String getPolicyNumber() {
        return policyNumber;
    }

    public void setPolicyNumber(String policyNumber) {
        this.policyNumber = policyNumber;
    }

    public String getPolicyHolderName() {
        return policyHolderName;
    }

    public void setPolicyHolderName(String policyHolderName) {
        this.policyHolderName = policyHolderName;
    }

    public Double getPremiumAmount() {
        return premiumAmount;
    }

    public void setPremiumAmount(Double premiumAmount) {
        this.premiumAmount = premiumAmount;
    }

    @Override
    public String toString() {
        return "insurancepolicy{" +
                "policyNumber='" + policyNumber + '\'' +
                ", policyHolderName='" + policyHolderName + '\'' +
                ", premiumAmount=" + premiumAmount +
                '}';
    }
}
