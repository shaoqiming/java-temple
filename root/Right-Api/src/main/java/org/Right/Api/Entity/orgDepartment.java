package org.Right.Api.Entity;

import java.io.Serializable;
import java.util.Date;

public class orgDepartment implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column org_department.id
     *
     * @mbggenerated
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column org_department.depart_name
     *
     * @mbggenerated
     */
    private String departName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column org_department.depart_code
     *
     * @mbggenerated
     */
    private String departCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column org_department.parent_code
     *
     * @mbggenerated
     */
    private String parentCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column org_department.is_parent
     *
     * @mbggenerated
     */
    private Integer isParent;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column org_department.create_time
     *
     * @mbggenerated
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column org_department.create_user
     *
     * @mbggenerated
     */
    private String createUser;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column org_department.create_org
     *
     * @mbggenerated
     */
    private String createOrg;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column org_department.update_time
     *
     * @mbggenerated
     */
    private Date updateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column org_department.update_user
     *
     * @mbggenerated
     */
    private String updateUser;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column org_department.update_org
     *
     * @mbggenerated
     */
    private String updateOrg;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column org_department.delete_time
     *
     * @mbggenerated
     */
    private Date deleteTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column org_department.delete_user
     *
     * @mbggenerated
     */
    private String deleteUser;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column org_department.is_delete
     *
     * @mbggenerated
     */
    private Integer isDelete;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column org_department.org_code
     *
     * @mbggenerated
     */
    private String orgCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table org_department
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column org_department.id
     *
     * @return the value of org_department.id
     *
     * @mbggenerated
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column org_department.id
     *
     * @param id the value for org_department.id
     *
     * @mbggenerated
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column org_department.depart_name
     *
     * @return the value of org_department.depart_name
     *
     * @mbggenerated
     */
    public String getDepartName() {
        return departName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column org_department.depart_name
     *
     * @param departName the value for org_department.depart_name
     *
     * @mbggenerated
     */
    public void setDepartName(String departName) {
        this.departName = departName == null ? null : departName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column org_department.depart_code
     *
     * @return the value of org_department.depart_code
     *
     * @mbggenerated
     */
    public String getDepartCode() {
        return departCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column org_department.depart_code
     *
     * @param departCode the value for org_department.depart_code
     *
     * @mbggenerated
     */
    public void setDepartCode(String departCode) {
        this.departCode = departCode == null ? null : departCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column org_department.parent_code
     *
     * @return the value of org_department.parent_code
     *
     * @mbggenerated
     */
    public String getParentCode() {
        return parentCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column org_department.parent_code
     *
     * @param parentCode the value for org_department.parent_code
     *
     * @mbggenerated
     */
    public void setParentCode(String parentCode) {
        this.parentCode = parentCode == null ? null : parentCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column org_department.is_parent
     *
     * @return the value of org_department.is_parent
     *
     * @mbggenerated
     */
    public Integer getIsParent() {
        return isParent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column org_department.is_parent
     *
     * @param isParent the value for org_department.is_parent
     *
     * @mbggenerated
     */
    public void setIsParent(Integer isParent) {
        this.isParent = isParent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column org_department.create_time
     *
     * @return the value of org_department.create_time
     *
     * @mbggenerated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column org_department.create_time
     *
     * @param createTime the value for org_department.create_time
     *
     * @mbggenerated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column org_department.create_user
     *
     * @return the value of org_department.create_user
     *
     * @mbggenerated
     */
    public String getCreateUser() {
        return createUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column org_department.create_user
     *
     * @param createUser the value for org_department.create_user
     *
     * @mbggenerated
     */
    public void setCreateUser(String createUser) {
        this.createUser = createUser == null ? null : createUser.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column org_department.create_org
     *
     * @return the value of org_department.create_org
     *
     * @mbggenerated
     */
    public String getCreateOrg() {
        return createOrg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column org_department.create_org
     *
     * @param createOrg the value for org_department.create_org
     *
     * @mbggenerated
     */
    public void setCreateOrg(String createOrg) {
        this.createOrg = createOrg == null ? null : createOrg.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column org_department.update_time
     *
     * @return the value of org_department.update_time
     *
     * @mbggenerated
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column org_department.update_time
     *
     * @param updateTime the value for org_department.update_time
     *
     * @mbggenerated
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column org_department.update_user
     *
     * @return the value of org_department.update_user
     *
     * @mbggenerated
     */
    public String getUpdateUser() {
        return updateUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column org_department.update_user
     *
     * @param updateUser the value for org_department.update_user
     *
     * @mbggenerated
     */
    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser == null ? null : updateUser.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column org_department.update_org
     *
     * @return the value of org_department.update_org
     *
     * @mbggenerated
     */
    public String getUpdateOrg() {
        return updateOrg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column org_department.update_org
     *
     * @param updateOrg the value for org_department.update_org
     *
     * @mbggenerated
     */
    public void setUpdateOrg(String updateOrg) {
        this.updateOrg = updateOrg == null ? null : updateOrg.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column org_department.delete_time
     *
     * @return the value of org_department.delete_time
     *
     * @mbggenerated
     */
    public Date getDeleteTime() {
        return deleteTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column org_department.delete_time
     *
     * @param deleteTime the value for org_department.delete_time
     *
     * @mbggenerated
     */
    public void setDeleteTime(Date deleteTime) {
        this.deleteTime = deleteTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column org_department.delete_user
     *
     * @return the value of org_department.delete_user
     *
     * @mbggenerated
     */
    public String getDeleteUser() {
        return deleteUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column org_department.delete_user
     *
     * @param deleteUser the value for org_department.delete_user
     *
     * @mbggenerated
     */
    public void setDeleteUser(String deleteUser) {
        this.deleteUser = deleteUser == null ? null : deleteUser.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column org_department.is_delete
     *
     * @return the value of org_department.is_delete
     *
     * @mbggenerated
     */
    public Integer getIsDelete() {
        return isDelete;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column org_department.is_delete
     *
     * @param isDelete the value for org_department.is_delete
     *
     * @mbggenerated
     */
    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column org_department.org_code
     *
     * @return the value of org_department.org_code
     *
     * @mbggenerated
     */
    public String getOrgCode() {
        return orgCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column org_department.org_code
     *
     * @param orgCode the value for org_department.org_code
     *
     * @mbggenerated
     */
    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode == null ? null : orgCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table org_department
     *
     * @mbggenerated
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        orgDepartment other = (orgDepartment) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getDepartName() == null ? other.getDepartName() == null : this.getDepartName().equals(other.getDepartName()))
            && (this.getDepartCode() == null ? other.getDepartCode() == null : this.getDepartCode().equals(other.getDepartCode()))
            && (this.getParentCode() == null ? other.getParentCode() == null : this.getParentCode().equals(other.getParentCode()))
            && (this.getIsParent() == null ? other.getIsParent() == null : this.getIsParent().equals(other.getIsParent()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getCreateUser() == null ? other.getCreateUser() == null : this.getCreateUser().equals(other.getCreateUser()))
            && (this.getCreateOrg() == null ? other.getCreateOrg() == null : this.getCreateOrg().equals(other.getCreateOrg()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getUpdateUser() == null ? other.getUpdateUser() == null : this.getUpdateUser().equals(other.getUpdateUser()))
            && (this.getUpdateOrg() == null ? other.getUpdateOrg() == null : this.getUpdateOrg().equals(other.getUpdateOrg()))
            && (this.getDeleteTime() == null ? other.getDeleteTime() == null : this.getDeleteTime().equals(other.getDeleteTime()))
            && (this.getDeleteUser() == null ? other.getDeleteUser() == null : this.getDeleteUser().equals(other.getDeleteUser()))
            && (this.getIsDelete() == null ? other.getIsDelete() == null : this.getIsDelete().equals(other.getIsDelete()))
            && (this.getOrgCode() == null ? other.getOrgCode() == null : this.getOrgCode().equals(other.getOrgCode()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table org_department
     *
     * @mbggenerated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getDepartName() == null) ? 0 : getDepartName().hashCode());
        result = prime * result + ((getDepartCode() == null) ? 0 : getDepartCode().hashCode());
        result = prime * result + ((getParentCode() == null) ? 0 : getParentCode().hashCode());
        result = prime * result + ((getIsParent() == null) ? 0 : getIsParent().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getCreateUser() == null) ? 0 : getCreateUser().hashCode());
        result = prime * result + ((getCreateOrg() == null) ? 0 : getCreateOrg().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getUpdateUser() == null) ? 0 : getUpdateUser().hashCode());
        result = prime * result + ((getUpdateOrg() == null) ? 0 : getUpdateOrg().hashCode());
        result = prime * result + ((getDeleteTime() == null) ? 0 : getDeleteTime().hashCode());
        result = prime * result + ((getDeleteUser() == null) ? 0 : getDeleteUser().hashCode());
        result = prime * result + ((getIsDelete() == null) ? 0 : getIsDelete().hashCode());
        result = prime * result + ((getOrgCode() == null) ? 0 : getOrgCode().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table org_department
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", departName=").append(departName);
        sb.append(", departCode=").append(departCode);
        sb.append(", parentCode=").append(parentCode);
        sb.append(", isParent=").append(isParent);
        sb.append(", createTime=").append(createTime);
        sb.append(", createUser=").append(createUser);
        sb.append(", createOrg=").append(createOrg);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", updateUser=").append(updateUser);
        sb.append(", updateOrg=").append(updateOrg);
        sb.append(", deleteTime=").append(deleteTime);
        sb.append(", deleteUser=").append(deleteUser);
        sb.append(", isDelete=").append(isDelete);
        sb.append(", orgCode=").append(orgCode);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}