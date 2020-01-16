package io.choerodon.gateway.dto;

import java.util.Date;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.choerodon.mybatis.entity.BaseDTO;

/**
 * @author superlee
 * @since 2019-04-21
 */
@Table(name = "iam_user")
public class UserDTO extends BaseDTO {

    public static final String EMAIL_REG = "[\\w!#$%&'*+/=?^_`{|}~-]+(?:\\.[\\w!#$%&'*+/=?^_`{|}~-]+)*@(?:[\\w](?:[\\w-]*[\\w])?\\.)+[\\w](?:[\\w-]*[\\w])?";

//    public static final String PHONE_REG = "^((13[0-9]|14[579]|15[0-3,5-9]|17[0135678]|18[0-9])\\d{8})?$";
    public static final String PHONE_REG = "^[1](([3][0-9])|([4][5-9])|([5][0-3,5-9])|([6][5,6])|([7][0-8])|([8][0-9])|([9][1,8,9]))[0-9]{8}$";

    public static final String LOGIN_NAME_REG = "^(?!\\-)[a-zA-Z0-9\\_\\-\\.]+(?<!\\.git|\\.atom|\\.)$";

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String loginName;

    private String email;

    private Long organizationId;
    @Transient
    private String originalPassword;

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @Column(name = "hash_password")
    private String password;

    private String realName;

    private String internationalTelCode;

    private String phone;

    private String imageUrl;
    private String profilePhoto;

    @Column(name = "is_enabled")
    private Boolean enabled;

    @Column(name = "is_ldap")
    private Boolean ldap;

    private String language;

    private String timeZone;
    private Date lastPasswordUpdatedAt;
    private Date lastLoginAt;

    @Transient
    private String organizationName;

    /**
     * 只用于返回该数据，不读入
     */
    @Transient
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private String organizationCode;

    @Transient
    private String uuid;
    /**
     * 连续登录错误次数超出规定次数后是否锁定账户
     */
    @Column(name = "is_locked")
    private Boolean locked;

    private Date lockedUntilAt;
    private Integer passwordAttempt;

    @Column(name = "is_admin")
    private Boolean admin;

    @Transient
    private Long sourceId;

    @Transient
    private String roleCodes;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(Long organizationId) {
        this.organizationId = organizationId;
    }

    public String getOriginalPassword() {
        return originalPassword;
    }

    public void setOriginalPassword(String originalPassword) {
        this.originalPassword = originalPassword;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getInternationalTelCode() {
        return internationalTelCode;
    }

    public void setInternationalTelCode(String internationalTelCode) {
        this.internationalTelCode = internationalTelCode;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getProfilePhoto() {
        return profilePhoto;
    }

    public void setProfilePhoto(String profilePhoto) {
        this.profilePhoto = profilePhoto;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public Boolean getLdap() {
        return ldap;
    }

    public void setLdap(Boolean ldap) {
        this.ldap = ldap;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    public Date getLastPasswordUpdatedAt() {
        return lastPasswordUpdatedAt;
    }

    public void setLastPasswordUpdatedAt(Date lastPasswordUpdatedAt) {
        this.lastPasswordUpdatedAt = lastPasswordUpdatedAt;
    }

    public Date getLastLoginAt() {
        return lastLoginAt;
    }

    public void setLastLoginAt(Date lastLoginAt) {
        this.lastLoginAt = lastLoginAt;
    }

    public String getOrganizationName() {
        return organizationName;
    }

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    public String getOrganizationCode() {
        return organizationCode;
    }

    public void setOrganizationCode(String organizationCode) {
        this.organizationCode = organizationCode;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public Boolean getLocked() {
        return locked;
    }

    public void setLocked(Boolean locked) {
        this.locked = locked;
    }

    public Date getLockedUntilAt() {
        return lockedUntilAt;
    }

    public void setLockedUntilAt(Date lockedUntilAt) {
        this.lockedUntilAt = lockedUntilAt;
    }

    public Integer getPasswordAttempt() {
        return passwordAttempt;
    }

    public void setPasswordAttempt(Integer passwordAttempt) {
        this.passwordAttempt = passwordAttempt;
    }

    public Boolean getAdmin() {
        return admin;
    }

    public void setAdmin(Boolean admin) {
        this.admin = admin;
    }

    public Long getSourceId() {
        return sourceId;
    }

    public void setSourceId(Long sourceId) {
        this.sourceId = sourceId;
    }


    public String getRoleCodes() {
        return roleCodes;
    }

    public void setRoleCodes(String roleCodes) {
        this.roleCodes = roleCodes;
    }
}