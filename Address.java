public class Address {
    private String cityName;
    private String districtName;
    private String pinCode;
    private String colonyNo;

    public Address(String cityName,String districtName,String pinCode,String colonyNo){
        this.cityName=cityName;
        this.districtName=districtName;
        this.pinCode=pinCode;
        this.colonyNo=colonyNo;

    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getDistrictName() {
        return districtName;
    }

    public void setDistrictName(String districtName) {
        this.districtName = districtName;
    }

    public String getPinCode() {
        return pinCode;
    }

    public void setPinCode(String pinCode) {
        this.pinCode = pinCode;
    }

    public String getColonyNo() {
        return colonyNo;
    }

    public void setColonyNo(String colonyNo) {
        this.colonyNo = colonyNo;
    }
}
