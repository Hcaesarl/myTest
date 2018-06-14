package com.klaus.entity;

public class Work {
    private int id;
    private String name;
    private String planning;
    private String city;
    private String address;
    private String type;
    private String longitude;
    private String latitude;
    private String cellName;
    private String carrier;
    private String dbm;
    private String PDCCH;
    private String PA;
    private String PB;
    private String cellID;
    private String PCI;
    private String VOLTE;
    private String SRVCC;
    private String voiceA2;
    private String voiceB2;
    private String Band;
    private String point;
    private String bandwidth;
    private String sequence;
    private String subframe;
    private String SpecialSubframes;
    private User user;
    private String date;
    private String result;

    public Work() {
    }

    public Work(String name, String planning, String city, String address, String type, String longitude, String latitude, String cellName, String carrier, String dbm, String PDCCH, String PA, String PB, String cellID, String PCI, String VOLTE, String SRVCC, String voiceA2, String voiceB2, String band, String point, String bandwidth, String sequence, String subframe, String specialSubframes, User user, String date) {
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

    public Work(int id, String name, String planning, String city, String address, String type, String longitude, String latitude, String cellName, String carrier, String dbm, String PDCCH, String PA, String PB, String cellID, String PCI, String VOLTE, String SRVCC, String voiceA2, String voiceB2, String band, String point, String bandwidth, String sequence, String subframe, String specialSubframes, User user, String date, String result) {
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

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getCellName() {
        return cellName;
    }

    public void setCellName(String cellName) {
        this.cellName = cellName;
    }

    public String getCarrier() {
        return carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    public String getDbm() {
        return dbm;
    }

    public void setDbm(String dbm) {
        this.dbm = dbm;
    }

    public String getPDCCH() {
        return PDCCH;
    }

    public void setPDCCH(String PDCCH) {
        this.PDCCH = PDCCH;
    }

    public String getPA() {
        return PA;
    }

    public void setPA(String PA) {
        this.PA = PA;
    }

    public String getPB() {
        return PB;
    }

    public void setPB(String PB) {
        this.PB = PB;
    }

    public String getCellID() {
        return cellID;
    }

    public void setCellID(String cellID) {
        this.cellID = cellID;
    }

    public String getPCI() {
        return PCI;
    }

    public void setPCI(String PCI) {
        this.PCI = PCI;
    }

    public String getVOLTE() {
        return VOLTE;
    }

    public void setVOLTE(String VOLTE) {
        this.VOLTE = VOLTE;
    }

    public String getSRVCC() {
        return SRVCC;
    }

    public void setSRVCC(String SRVCC) {
        this.SRVCC = SRVCC;
    }

    public String getVoiceA2() {
        return voiceA2;
    }

    public void setVoiceA2(String voiceA2) {
        this.voiceA2 = voiceA2;
    }

    public String getVoiceB2() {
        return voiceB2;
    }

    public void setVoiceB2(String voiceB2) {
        this.voiceB2 = voiceB2;
    }

    public String getBand() {
        return Band;
    }

    public void setBand(String band) {
        Band = band;
    }

    public String getPoint() {
        return point;
    }

    public void setPoint(String point) {
        this.point = point;
    }

    public String getBandwidth() {
        return bandwidth;
    }

    public void setBandwidth(String bandwidth) {
        this.bandwidth = bandwidth;
    }

    public String getSequence() {
        return sequence;
    }

    public void setSequence(String sequence) {
        this.sequence = sequence;
    }

    public String getSubframe() {
        return subframe;
    }

    public void setSubframe(String subframe) {
        this.subframe = subframe;
    }

    public String getSpecialSubframes() {
        return SpecialSubframes;
    }

    public void setSpecialSubframes(String specialSubframes) {
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
                ", longitude='" + longitude + '\'' +
                ", latitude='" + latitude + '\'' +
                ", cellName='" + cellName + '\'' +
                ", carrier='" + carrier + '\'' +
                ", dbm='" + dbm + '\'' +
                ", PDCCH='" + PDCCH + '\'' +
                ", PA='" + PA + '\'' +
                ", PB='" + PB + '\'' +
                ", cellID='" + cellID + '\'' +
                ", PCI='" + PCI + '\'' +
                ", VOLTE='" + VOLTE + '\'' +
                ", SRVCC='" + SRVCC + '\'' +
                ", voiceA2='" + voiceA2 + '\'' +
                ", voiceB2='" + voiceB2 + '\'' +
                ", Band='" + Band + '\'' +
                ", point='" + point + '\'' +
                ", bandwidth='" + bandwidth + '\'' +
                ", sequence='" + sequence + '\'' +
                ", subframe='" + subframe + '\'' +
                ", SpecialSubframes='" + SpecialSubframes + '\'' +
                ", user=" + user +
                ", date='" + date + '\'' +
                ", result='" + result + '\'' +
                '}';
    }
}
