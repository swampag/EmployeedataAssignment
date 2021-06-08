
package com.example.employeedataassignment.Model;


import androidx.room.Entity;
import androidx.room.Index;
import androidx.room.PrimaryKey;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Entity(tableName = "employeetable")

public class Employee {

    @PrimaryKey()
    private int empid;

    @SerializedName("TODAYS_COUNT")
    @Expose
    private String todaysCount;
    @SerializedName("age")
    @Expose
    private String age;
    @SerializedName("created_on")
    @Expose
    private String createdOn;
    @SerializedName("dept_id")
    @Expose
    private String deptId;
    @SerializedName("dept_name")
    @Expose
    private String deptName;
    @SerializedName("email_id")
    @Expose
    private String emailId;
    @SerializedName("gender")
    @Expose
    private String gender;
    @SerializedName("is_deleted")
    @Expose
    private String isDeleted;
    @SerializedName("mobile")
    @Expose
    private String mobile;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("password")
    @Expose
    private String password;
    @SerializedName("profile_img")
    @Expose
    private String profileImg;
    @SerializedName("reporting_to_id")
    @Expose
    private String reportingToId;
    @SerializedName("reporting_to_name")
    @Expose
    private String reportingToName;
    @SerializedName("role_id")
    @Expose
    private String roleId;
    @SerializedName("role_name")
    @Expose
    private String roleName;
    @SerializedName("token")
    @Expose
    private String token;
    @SerializedName("updated_on")
    @Expose
    private String updatedOn;
    @SerializedName("user_id")
    @Expose
    private String userId;

    public String getTodaysCount() {
        return todaysCount;
    }

    public void setTodaysCount(String todaysCount) {
        this.todaysCount=todaysCount;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age=age;
    }

    public String getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(String createdOn) {
        this.createdOn=createdOn;
    }

    public String getDeptId() {
        return deptId;
    }

    public void setDeptId(String deptId) {
        this.deptId=deptId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName=deptName;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId=emailId;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender=gender;
    }

    public String getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(String isDeleted) {
        this.isDeleted=isDeleted;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile=mobile;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name=name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password=password;
    }

    public String getProfileImg() {
        return profileImg;
    }

    public void setProfileImg(String profileImg) {
        this.profileImg=profileImg;
    }

    public String getReportingToId() {
        return reportingToId;
    }

    public void setReportingToId(String reportingToId) {
        this.reportingToId=reportingToId;
    }

    public String getReportingToName() {
        return reportingToName;
    }

    public void setReportingToName(String reportingToName) {
        this.reportingToName=reportingToName;
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId=roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName=roleName;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token=token;
    }

    public String getUpdatedOn() {
        return updatedOn;
    }

    public void setUpdatedOn(String updatedOn) {
        this.updatedOn=updatedOn;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId=userId;
    }

    public int getEmpid() {
        return empid;
    }

    public void setEmpid(int empid) {
        this.empid=empid;
    }
}







