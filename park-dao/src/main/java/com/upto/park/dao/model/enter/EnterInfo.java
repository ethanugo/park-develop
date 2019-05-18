package com.upto.park.dao.model.enter;


/**
 * 车辆入场信息实体类
 */
public class EnterInfo {
    /**
     * 车牌号
     */
    private String usrNum;

    /**
     * 业务号码
     */
    private String bussCd;

    /**
     * 停车场编号
     */
    private String parkNo;

    /**
     * 停车场名称
     */
    private String parkName;

    /**
     * 停车流水号
     */
    private String refNo;

    /**
     * 时间戳
     */
    private String entryTime;

    /**
     * 保留字段
     */
    private String reserve;

    /**
     * 签名
     */
    private String sign;

    public EnterInfo() {
    }

    public String getUsrNum() {
        return usrNum;
    }

    public void setUsrNum(String usrNum) {
        this.usrNum = usrNum;
    }

    public String getBussCd() {
        return bussCd;
    }

    public void setBussCd(String bussCd) {
        this.bussCd = bussCd;
    }

    public String getParkNo() {
        return parkNo;
    }

    public void setParkNo(String parkNo) {
        this.parkNo = parkNo;
    }

    public String getParkName() {
        return parkName;
    }

    public void setParkName(String parkName) {
        this.parkName = parkName;
    }

    public String getRefNo() {
        return refNo;
    }

    public void setRefNo(String refNo) {
        this.refNo = refNo;
    }

    public String getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(String entryTime) {
        this.entryTime = entryTime;
    }

    public String getReserve() {
        return reserve;
    }

    public void setReserve(String reserve) {
        this.reserve = reserve;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    @Override
    public String toString() {
        return "EnterInfo{" +
                "usrNum='" + usrNum + '\'' +
                ", bussCd='" + bussCd + '\'' +
                ", parkNo='" + parkNo + '\'' +
                ", parkName='" + parkName + '\'' +
                ", refNo='" + refNo + '\'' +
                ", entryTime='" + entryTime + '\'' +
                ", reserve='" + reserve + '\'' +
                ", sign='" + sign + '\'' +
                '}';
    }
}
