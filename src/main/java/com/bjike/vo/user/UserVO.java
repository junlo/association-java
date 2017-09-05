package com.bjike.vo.user;

import com.bjike.type.user.SexType;
import com.bjike.vo.BaseVO;

/**
 * 用户
 *
 * @Author: [liguiqin]
 * @Date: [2017-08-22 15:52]
 * @Description: [ ]
 * @Version: [1.0.0]
 * @Copy: [com.bjike]
 */
public class UserVO extends BaseVO {

    /**
     * 用户名
     */
    private String username;
    /**
     * 昵称
     */
    private String nickname;
    /**
     * 头像
     */
    private String headPath;
    /**
     * 性别
     */
    private SexType sexType;

    /**
     * 手机号
     */
    private String phone;

    /**
     * 真实姓名
     */
    private String realName;
    /**
     * 联系号码
     */
    private String telephone;
    /**
     * 兴趣
     */
    private String interest;
    /**
     * 地址
     */
    private String address;

    /**
     * 生日
     */
    private String birthday;
    /**
     * 性格
     */
    private String disposition;
    /**
     * 籍贯
     */
    private String nativePlace;
    /**
     * 毕业学校
     */
    private String school;
    /**
     * 学历
     */
    private String education;
    /**
     * 公司
     */
    private String company;
    /**
     * 职位
     */
    private String job;
    /**
     * 父亲姓名
     */
    private String fatherName;
    /**
     * 母亲姓名
     */
    private String motherName;
    /**
     * 婚姻状况
     */
    private Boolean marriage;
    /**
     * qq
     */
    private String qq;
    /**
     * 邮箱
     */
    private String email;
    /**
     * 微信
     */
    private String weChat;


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getHeadPath() {
        return headPath;
    }

    public void setHeadPath(String headPath) {
        this.headPath = headPath;
    }

    public SexType getSexType() {
        return sexType;
    }

    public void setSexType(SexType sexType) {
        this.sexType = sexType;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getInterest() {
        return interest;
    }

    public void setInterest(String interest) {
        this.interest = interest;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getDisposition() {
        return disposition;
    }

    public void setDisposition(String disposition) {
        this.disposition = disposition;
    }

    public String getNativePlace() {
        return nativePlace;
    }

    public void setNativePlace(String nativePlace) {
        this.nativePlace = nativePlace;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getMotherName() {
        return motherName;
    }

    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }

    public Boolean getMarriage() {
        return marriage;
    }

    public void setMarriage(Boolean marriage) {
        this.marriage = marriage;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public String getWeChat() {
        return weChat;
    }

    public void setWeChat(String weChat) {
        this.weChat = weChat;
    }
}
