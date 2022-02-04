package com.thuan.coronavirustracker.model;

public class LocationStats {
    private String province;
    private String country;
    private int latestTotalCases;
    private int previousTotalCases;

    public LocationStats(String province, String country, int latestTotalCases, int previousTotalCases) {
        this.province = province;
        this.country = country;
        this.latestTotalCases = latestTotalCases;
        this.previousTotalCases = previousTotalCases;
    }

    @Override
    public String toString() {
        return "LocationStats{" +
                "province='" + province + '\'' +
                ", country='" + country + '\'' +
                ", latestTotalCases=" + latestTotalCases +
                ", previousTotalCases=" + previousTotalCases +
                '}';
    }

    public int getPreviousTotalCases() {
        return previousTotalCases;
    }

    public void setPreviousTotalCases(int previousTotalCases) {
        this.previousTotalCases = previousTotalCases;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getLatestTotalCases() {
        return latestTotalCases;
    }

    public void setLatestTotalCases(int latestTotalCases) {
        this.latestTotalCases = latestTotalCases;
    }
}
