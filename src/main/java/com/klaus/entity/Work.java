package com.klaus.entity;

public class Work {
    private int id;
    private String name;
    private String planning;
    private String city;
    private String address;
    private String type;
    private double longitude;
    private double latitude;
    private String cellName;
    private int carrier;
    private int dbm;
    private int PDCCH;
    private int PA;
    private int PB;
    private int cellID;
    private int PCI;
    private int VOLTE;
    private int SRVCC;
    private int voiceA2;
    private int voiceB2;
    private String Band;
    private int point;
    private int bandwidth;
    private int sequence;
    private double subframe;
    private double SpecialSubframes;
    private User user;
    private String date;
    private String result;

    public Work() {
    }

    public Work(int id, String name, String planning, String city, String address, String type, double longitude, double latitude, String cellName, int carrier, int dbm, int PDCCH, int PA, int PB, int cellID, int PCI, int VOLTE, int SRVCC, int voiceA2, int voiceB2, String band, int point, int bandwidth, int sequence, double subframe, double specialSubframes, User user, String date, String result) {

        this.id = id;
        this.name = name;
        this.planning = planning;
        this.city = city;
        this.address = address;
        this.type = type;
        this.longitude = longitude;
        this.latitude = latitude;
        this.cellName = cellName;
        this.carrier = carrier;
        this.dbm = dbm;
        this.PDCCH = PDCCH;
        this.PA = PA;
        this.PB = PB;
        this.cellID = cellID;
        this.PCI = PCI;
        this.VOLTE = VOLTE;
        this.SRVCC = SRVCC;
        this.voiceA2 = voiceA2;
        this.voiceB2 = voiceB2;
        Band = band;
        this.point = point;
        this.bandwidth = bandwidth;
        this.sequence = sequence;
        this.subframe = subframe;
        SpecialSubframes = specialSubframes;
        this.user = user;
        this.date = date;
        this.result = result;
    }

    public int getId() {

        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlanning() {
        return planning;
    }

    public void setPlanning(String planning) {
        this.planning = planning;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public String getCellName() {
        return cellName;
    }

    public void setCellName(String cellName) {
        this.cellName = cellName;
    }

    public int getCarrier() {
        return carrier;
    }

    public void setCarrier(int carrier) {
        this.carrier = carrier;
    }

    public int getDbm() {
        return dbm;
    }

    public void setDbm(int dbm) {
        this.dbm = dbm;
    }

    public int getPDCCH() {
        return PDCCH;
    }

    public void setPDCCH(int PDCCH) {
        this.PDCCH = PDCCH;
    }

    public int getPA() {
        return PA;
    }

    public void setPA(int PA) {
        this.PA = PA;
    }

    public int getPB() {
        return PB;
    }

    public void setPB(int PB) {
        this.PB = PB;
    }

    public int getCellID() {
        return cellID;
    }

    public void setCellID(int cellID) {
        this.cellID = cellID;
    }

    public int getPCI() {
        return PCI;
    }

    public void setPCI(int PCI) {
        this.PCI = PCI;
    }

    public int getVOLTE() {
        return VOLTE;
    }

    public void setVOLTE(int VOLTE) {
        this.VOLTE = VOLTE;
    }

    public int getSRVCC() {
        return SRVCC;
    }

    public void setSRVCC(int SRVCC) {
        this.SRVCC = SRVCC;
    }

    public int getVoiceA2() {
        return voiceA2;
    }

    public void setVoiceA2(int voiceA2) {
        this.voiceA2 = voiceA2;
    }

    public int getVoiceB2() {
        return voiceB2;
    }

    public void setVoiceB2(int voiceB2) {
        this.voiceB2 = voiceB2;
    }

    public String getBand() {
        return Band;
    }

    public void setBand(String band) {
        Band = band;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public int getBandwidth() {
        return bandwidth;
    }

    public void setBandwidth(int bandwidth) {
        this.bandwidth = bandwidth;
    }

    public int getSequence() {
        return sequence;
    }

    public void setSequence(int sequence) {
        this.sequence = sequence;
    }

    public double getSubframe() {
        return subframe;
    }

    public void setSubframe(double subframe) {
        this.subframe = subframe;
    }

    public double getSpecialSubframes() {
        return SpecialSubframes;
    }

    public void setSpecialSubframes(double specialSubframes) {
        SpecialSubframes = specialSubframes;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "Work{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", planning='" + planning + '\'' +
                ", city='" + city + '\'' +
                ", address='" + address + '\'' +
                ", type='" + type + '\'' +
                ", longitude=" + longitude +
                ", latitude=" + latitude +
                ", cellName='" + cellName + '\'' +
                ", carrier=" + carrier +
                ", dbm=" + dbm +
                ", PDCCH=" + PDCCH +
                ", PA=" + PA +
                ", PB=" + PB +
                ", cellID=" + cellID +
                ", PCI=" + PCI +
                ", VOLTE=" + VOLTE +
                ", SRVCC=" + SRVCC +
                ", voiceA2=" + voiceA2 +
                ", voiceB2=" + voiceB2 +
                ", Band='" + Band + '\'' +
                ", point=" + point +
                ", bandwidth=" + bandwidth +
                ", sequence=" + sequence +
                ", subframe=" + subframe +
                ", SpecialSubframes=" + SpecialSubframes +
                ", user=" + user +
                ", date='" + date + '\'' +
                ", result='" + result + '\'' +
                '}';
    }
}
