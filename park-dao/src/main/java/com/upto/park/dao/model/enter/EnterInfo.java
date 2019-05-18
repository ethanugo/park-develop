package com.upto.park.dao.model.enter;


import java.util.Date;

/**
 * 车辆入场信息实体类
 */
public class EnterInfo {
    /**
     * 车辆入场数据编号
     */
    private String enterInfoNumber;

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

    public EnterInfo() {
    }

    public String getEnterInfoNumber() {
        return enterInfoNumber;
    }

    public void setEnterInfoNumber(String enterInfoNumber) {
        this.enterInfoNumber = enterInfoNumber;
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
        return "EnterInfo{" +
                "enterInfoNumber='" + enterInfoNumber + '\'' +
                ", usrNum='" + usrNum + '\'' +
                ", bussCd='" + bussCd + '\'' +
                ", parkNo='" + parkNo + '\'' +
                ", parkName='" + parkName + '\'' +
                ", refNo='" + refNo + '\'' +
                ", entryTime='" + entryTime + '\'' +
                ", reserve='" + reserve + '\'' +
                ", sign='" + sign + '\'' +
                ", isDelete=" + isDelete +
                ", createTime=" + createTime +
                ", modifiedTime=" + modifiedTime +
                '}';
    }
}
