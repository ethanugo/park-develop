package com.upto.park.dao.model.leave;

/**
 * 车辆离场信息实体类
 */
public class LeaveInfo {
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
    private String exitTime;

    /**
     * 保留字段
     */
    private String reserve;

    /**
     * 签名
     */
    private String sign;

    public LeaveInfo() {
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

    public String getExitTime() {
        return exitTime;
    }

    public void setExitTime(String exitTime) {
        this.exitTime = exitTime;
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
        return "LeaveInfo{" +
                "usrNum='" + usrNum + '\'' +
                ", bussCd='" + bussCd + '\'' +
                ", parkNo='" + parkNo + '\'' +
                ", parkName='" + parkName + '\'' +
                ", refNo='" + refNo + '\'' +
                ", exitTime='" + exitTime + '\'' +
                ", reserve='" + reserve + '\'' +
                ", sign='" + sign + '\'' +
                '}';
    }
}
