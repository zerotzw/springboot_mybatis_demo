package com.example.mybatis.demo.entity;

import java.io.Serializable;
import java.util.Date;

public class ThirdUserAccount implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column third_user_account.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column third_user_account.mobile
     *
     * @mbg.generated
     */
    private String mobile;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column third_user_account.area
     *
     * @mbg.generated
     */
    private String area;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column third_user_account.account_id
     *
     * @mbg.generated
     */
    private String accountId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column third_user_account.is_del
     *
     * @mbg.generated
     */
    private Byte isDel;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column third_user_account.create_time
     *
     * @mbg.generated
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column third_user_account.update_time
     *
     * @mbg.generated
     */
    private Date updateTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column third_user_account.bak_1
     *
     * @mbg.generated
     */
    private String bak1;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column third_user_account.bak_2
     *
     * @mbg.generated
     */
    private String bak2;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column third_user_account.zhs_user_id
     *
     * @mbg.generated
     */
    private Integer zhsUserId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column third_user_account.account_type
     *
     * @mbg.generated
     */
    private Byte accountType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table third_user_account
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column third_user_account.id
     *
     * @return the value of third_user_account.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column third_user_account.id
     *
     * @param id the value for third_user_account.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column third_user_account.mobile
     *
     * @return the value of third_user_account.mobile
     *
     * @mbg.generated
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column third_user_account.mobile
     *
     * @param mobile the value for third_user_account.mobile
     *
     * @mbg.generated
     */
    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column third_user_account.area
     *
     * @return the value of third_user_account.area
     *
     * @mbg.generated
     */
    public String getArea() {
        return area;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column third_user_account.area
     *
     * @param area the value for third_user_account.area
     *
     * @mbg.generated
     */
    public void setArea(String area) {
        this.area = area == null ? null : area.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column third_user_account.account_id
     *
     * @return the value of third_user_account.account_id
     *
     * @mbg.generated
     */
    public String getAccountId() {
        return accountId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column third_user_account.account_id
     *
     * @param accountId the value for third_user_account.account_id
     *
     * @mbg.generated
     */
    public void setAccountId(String accountId) {
        this.accountId = accountId == null ? null : accountId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column third_user_account.is_del
     *
     * @return the value of third_user_account.is_del
     *
     * @mbg.generated
     */
    public Byte getIsDel() {
        return isDel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column third_user_account.is_del
     *
     * @param isDel the value for third_user_account.is_del
     *
     * @mbg.generated
     */
    public void setIsDel(Byte isDel) {
        this.isDel = isDel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column third_user_account.create_time
     *
     * @return the value of third_user_account.create_time
     *
     * @mbg.generated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column third_user_account.create_time
     *
     * @param createTime the value for third_user_account.create_time
     *
     * @mbg.generated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column third_user_account.update_time
     *
     * @return the value of third_user_account.update_time
     *
     * @mbg.generated
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column third_user_account.update_time
     *
     * @param updateTime the value for third_user_account.update_time
     *
     * @mbg.generated
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column third_user_account.bak_1
     *
     * @return the value of third_user_account.bak_1
     *
     * @mbg.generated
     */
    public String getBak1() {
        return bak1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column third_user_account.bak_1
     *
     * @param bak1 the value for third_user_account.bak_1
     *
     * @mbg.generated
     */
    public void setBak1(String bak1) {
        this.bak1 = bak1 == null ? null : bak1.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column third_user_account.bak_2
     *
     * @return the value of third_user_account.bak_2
     *
     * @mbg.generated
     */
    public String getBak2() {
        return bak2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column third_user_account.bak_2
     *
     * @param bak2 the value for third_user_account.bak_2
     *
     * @mbg.generated
     */
    public void setBak2(String bak2) {
        this.bak2 = bak2 == null ? null : bak2.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column third_user_account.zhs_user_id
     *
     * @return the value of third_user_account.zhs_user_id
     *
     * @mbg.generated
     */
    public Integer getZhsUserId() {
        return zhsUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column third_user_account.zhs_user_id
     *
     * @param zhsUserId the value for third_user_account.zhs_user_id
     *
     * @mbg.generated
     */
    public void setZhsUserId(Integer zhsUserId) {
        this.zhsUserId = zhsUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column third_user_account.account_type
     *
     * @return the value of third_user_account.account_type
     *
     * @mbg.generated
     */
    public Byte getAccountType() {
        return accountType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column third_user_account.account_type
     *
     * @param accountType the value for third_user_account.account_type
     *
     * @mbg.generated
     */
    public void setAccountType(Byte accountType) {
        this.accountType = accountType;
    }
}