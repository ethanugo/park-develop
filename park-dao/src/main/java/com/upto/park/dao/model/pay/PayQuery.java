package com.upto.park.dao.model.pay;

import java.util.Date;

/**
 * 无感支付查询实体类
 */
public class PayQuery {

    /**
     * 无感支付查询数据编号
     */
    private String payQueryNumber;

    /**
     * 业务代码
     */
    private String bussCd;

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
     * 保留字段
     */
    private String reserve;

    /**
     * 签名
     */
    private String sign;

    /**
     * 是否删除 0：未删除 1：已删除
     */
    private Integer isDelete;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 修改时间
     */
    private Date modifiedTime;

    public PayQuery() {
    }

    public String getPayQueryNumber() {
        return payQueryNumber;
    }

    public void setPayQueryNumber(String payQueryNumber) {
        this.payQueryNumber = payQueryNumber;
    }

    public String getBussCd() {
        return bussCd;
    }

    public void setBussCd(String bussCd) {
        this.bussCd = bussCd;
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

    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getModifiedTime() {
        return modifiedTime;
    }

    public void setModifiedTime(Date modifiedTime) {
        this.modifiedTime = modifiedTime;
    }

    @Override
    public String toString() {
        return "PayQuery{" +
                "payQueryNumber='" + payQueryNumber + '\'' +
                ", bussCd='" + bussCd + '\'' +
                ", usrNum='" + usrNum + '\'' +
                ", parkNo='" + parkNo + '\'' +
                ", parkName='" + parkName + '\'' +
                ", reserve='" + reserve + '\'' +
                ", sign='" + sign + '\'' +
                ", isDelete=" + isDelete +
                ", createTime=" + createTime +
                ", modifiedTime=" + modifiedTime +
                '}';
    }
}
