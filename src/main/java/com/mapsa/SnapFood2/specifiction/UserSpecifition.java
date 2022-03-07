package com.mapsa.SnapFood2.specifiction;

import org.hibernate.annotations.Formula;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "jp_users")
public class UserSpecifition {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_id")
    private Integer userId;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "middle_name")
    private String middleName;

    @Column(name = "last_name")
    private String lastName;

    @Formula("concat(first_name, middle_name, last_name)")
    private String fullName;

    @Column(name = "gender")
    private String gender;

    @Column(name = "birth_date")
    @Temporal(TemporalType.DATE)
    private Date birthDate;

    @Column(name = "phone_number")
    private String phNumber;

    @Column(name = "summary")
    private String summary;

    @Column(name = "experience")
    private Integer experience;

    @Column(name = "profile_img")
    private String profImg;

    @Column(name = "current_salary")
    private double currSalary;

    @Column(name = "expected_salary")
    private double exptSalary;

    @Column(name = "is_enable")
    private Integer isEnalbe;

    @Column(name = "role_id")
    private Integer roleId;

    @Column(name = "company_id")
    private Integer compId;

    @Column(name = "is_owner")
    private Integer isOwner;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getPhNumber() {
        return phNumber;
    }

    public void setPhNumber(String phNumber) {
        this.phNumber = phNumber;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public Integer getExperience() {
        return experience;
    }

    public void setExperience(Integer experience) {
        this.experience = experience;
    }

    public String getProfImg() {
        return profImg;
    }

    public void setProfImg(String profImg) {
        this.profImg = profImg;
    }

    public double getCurrSalary() {
        return currSalary;
    }

    public void setCurrSalary(double currSalary) {
        this.currSalary = currSalary;
    }

    public double getExptSalary() {
        return exptSalary;
    }

    public void setExptSalary(double exptSalary) {
        this.exptSalary = exptSalary;
    }

    public Integer getIsEnalbe() {
        return isEnalbe;
    }

    public void setIsEnalbe(Integer isEnalbe) {
        this.isEnalbe = isEnalbe;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Integer getCompId() {
        return compId;
    }

    public void setCompId(Integer compId) {
        this.compId = compId;
    }

    public Integer getIsOwner() {
        return isOwner;
    }

    public void setIsOwner(Integer isOwner) {
        this.isOwner = isOwner;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

}