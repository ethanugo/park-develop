package com.upto.park.dao.model.push;

/**
 * 账单推送实体类
 */
public class BillPush {
    /**
     * 业务代码
     */
    private String bussCd;

    /**
     * 账单编号
     */
    private String billNo;

    /**
     * 车牌号
     */
    private String usrNum;

    /**
     * 停车场编号
     */
    private String parkNo;

    /**
     * 停车场名称
     */
    private String parkName;

    /**
     * 账单金额，单位：分
     */
    private Integer billAt;

    /**
     * 实际支付金额，单位：分
     */
    private Integer payAt;

    /**
     * 入停车场时间
     */
    private String startTime;

    /**
     * 出停车场时间
     */
    private String payTime;

    /**
     * 保留字段
     */
    private String reserve;

    /**
     * 签名
     */
    private String sign;

    public BillPush() {
    }

    public String getBussCd() {
        return bussCd;
    }

    public void setBussCd(String bussCd) {
        this.bussCd = bussCd;
    }

    public String getBillNo() {
        return billNo;
    }

    public void setBillNo(String billNo) {
        this.billNo = billNo;
    }

    public String getUsrNum() {
        return usrNum;
    }

    public void setUsrNum(String usrNum) {
        this.usrNum = usrNum;
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

    public Integer getBillAt() {
        return billAt;
    }

    public void setBillAt(Integer billAt) {
        this.billAt = billAt;
    }

    public Integer getPayAt() {
        return payAt;
    }

    public void setPayAt(Integer payAt) {
        this.payAt = payAt;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getPayTime() {
        return payTime;
    }

    public void setPayTime(String payTime) {
        this.payTime = payTime;
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
        return "BillPush{" +
                "bussCd='" + bussCd + '\'' +
                ", billNo='" + billNo + '\'' +
                ", usrNum='" + usrNum + '\'' +
                ", parkNo='" + parkNo + '\'' +
                ", parkName='" + parkName + '\'' +
                ", billAt=" + billAt +
                ", payAt=" + payAt +
                ", startTime='" + startTime + '\'' +
                ", payTime='" + payTime + '\'' +
                ", reserve='" + reserve + '\'' +
                ", sign='" + sign + '\'' +
                '}';
    }
}
