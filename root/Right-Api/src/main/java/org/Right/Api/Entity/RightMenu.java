package org.Right.Api.Entity;

import java.io.Serializable;
import java.util.Date;

public class RightMenu implements Serializable {
    /**
     * Thiorg.Right.Api.Entitys field was generated by MyBatis Generator.
     * This field corresponds to the database column right_menu.id
     *
     * @mbggenerated
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column right_menu.menu_name
     *
     * @mbggenerated
     */
    private String menuName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column right_menu.is_parent_menu
     *
     * @mbggenerated
     */
    private String isParentMenu;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column right_menu.menu_type
     *
     * @mbggenerated
     */
    private String menuType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column right_menu.menu_value
     *
     * @mbggenerated
     */
    private String menuValue;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column right_menu.is_parent
     *
     * @mbggenerated
     */
    private Integer isParent;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column right_menu.create_time
     *
     * @mbggenerated
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column right_menu.create_user
     *
     * @mbggenerated
     */
    private String createUser;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column right_menu.create_org
     *
     * @mbggenerated
     */
    private String createOrg;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column right_menu.update_time
     *
     * @mbggenerated
     */
    private Date updateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column right_menu.update_user
     *
     * @mbggenerated
     */
    private String updateUser;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column right_menu.update_org
     *
     * @mbggenerated
     */
    private String updateOrg;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column right_menu.delete_time
     *
     * @mbggenerated
     */
    private Date deleteTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column right_menu.delete_user
     *
     * @mbggenerated
     */
    private String deleteUser;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column right_menu.is_delete
     *
     * @mbggenerated
     */
    private Integer isDelete;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column right_menu.org_code
     *
     * @mbggenerated
     */
    private String orgCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table right_menu
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column right_menu.id
     *
     * @return the value of right_menu.id
     *
     * @mbggenerated
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column right_menu.id
     *
     * @param id the value for right_menu.id
     *
     * @mbggenerated
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column right_menu.menu_name
     *
     * @return the value of right_menu.menu_name
     *
     * @mbggenerated
     */
    public String getMenuName() {
        return menuName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column right_menu.menu_name
     *
     * @param menuName the value for right_menu.menu_name
     *
     * @mbggenerated
     */
    public void setMenuName(String menuName) {
        this.menuName = menuName == null ? null : menuName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column right_menu.is_parent_menu
     *
     * @return the value of right_menu.is_parent_menu
     *
     * @mbggenerated
     */
    public String getIsParentMenu() {
        return isParentMenu;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column right_menu.is_parent_menu
     *
     * @param isParentMenu the value for right_menu.is_parent_menu
     *
     * @mbggenerated
     */
    public void setIsParentMenu(String isParentMenu) {
        this.isParentMenu = isParentMenu == null ? null : isParentMenu.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column right_menu.menu_type
     *
     * @return the value of right_menu.menu_type
     *
     * @mbggenerated
     */
    public String getMenuType() {
        return menuType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column right_menu.menu_type
     *
     * @param menuType the value for right_menu.menu_type
     *
     * @mbggenerated
     */
    public void setMenuType(String menuType) {
        this.menuType = menuType == null ? null : menuType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column right_menu.menu_value
     *
     * @return the value of right_menu.menu_value
     *
     * @mbggenerated
     */
    public String getMenuValue() {
        return menuValue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column right_menu.menu_value
     *
     * @param menuValue the value for right_menu.menu_value
     *
     * @mbggenerated
     */
    public void setMenuValue(String menuValue) {
        this.menuValue = menuValue == null ? null : menuValue.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column right_menu.is_parent
     *
     * @return the value of right_menu.is_parent
     *
     * @mbggenerated
     */
    public Integer getIsParent() {
        return isParent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column right_menu.is_parent
     *
     * @param isParent the value for right_menu.is_parent
     *
     * @mbggenerated
     */
    public void setIsParent(Integer isParent) {
        this.isParent = isParent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column right_menu.create_time
     *
     * @return the value of right_menu.create_time
     *
     * @mbggenerated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column right_menu.create_time
     *
     * @param createTime the value for right_menu.create_time
     *
     * @mbggenerated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column right_menu.create_user
     *
     * @return the value of right_menu.create_user
     *
     * @mbggenerated
     */
    public String getCreateUser() {
        return createUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column right_menu.create_user
     *
     * @param createUser the value for right_menu.create_user
     *
     * @mbggenerated
     */
    public void setCreateUser(String createUser) {
        this.createUser = createUser == null ? null : createUser.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column right_menu.create_org
     *
     * @return the value of right_menu.create_org
     *
     * @mbggenerated
     */
    public String getCreateOrg() {
        return createOrg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column right_menu.create_org
     *
     * @param createOrg the value for right_menu.create_org
     *
     * @mbggenerated
     */
    public void setCreateOrg(String createOrg) {
        this.createOrg = createOrg == null ? null : createOrg.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column right_menu.update_time
     *
     * @return the value of right_menu.update_time
     *
     * @mbggenerated
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column right_menu.update_time
     *
     * @param updateTime the value for right_menu.update_time
     *
     * @mbggenerated
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column right_menu.update_user
     *
     * @return the value of right_menu.update_user
     *
     * @mbggenerated
     */
    public String getUpdateUser() {
        return updateUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column right_menu.update_user
     *
     * @param updateUser the value for right_menu.update_user
     *
     * @mbggenerated
     */
    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser == null ? null : updateUser.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column right_menu.update_org
     *
     * @return the value of right_menu.update_org
     *
     * @mbggenerated
     */
    public String getUpdateOrg() {
        return updateOrg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column right_menu.update_org
     *
     * @param updateOrg the value for right_menu.update_org
     *
     * @mbggenerated
     */
    public void setUpdateOrg(String updateOrg) {
        this.updateOrg = updateOrg == null ? null : updateOrg.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column right_menu.delete_time
     *
     * @return the value of right_menu.delete_time
     *
     * @mbggenerated
     */
    public Date getDeleteTime() {
        return deleteTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column right_menu.delete_time
     *
     * @param deleteTime the value for right_menu.delete_time
     *
     * @mbggenerated
     */
    public void setDeleteTime(Date deleteTime) {
        this.deleteTime = deleteTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column right_menu.delete_user
     *
     * @return the value of right_menu.delete_user
     *
     * @mbggenerated
     */
    public String getDeleteUser() {
        return deleteUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column right_menu.delete_user
     *
     * @param deleteUser the value for right_menu.delete_user
     *
     * @mbggenerated
     */
    public void setDeleteUser(String deleteUser) {
        this.deleteUser = deleteUser == null ? null : deleteUser.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column right_menu.is_delete
     *
     * @return the value of right_menu.is_delete
     *
     * @mbggenerated
     */
    public Integer getIsDelete() {
        return isDelete;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column right_menu.is_delete
     *
     * @param isDelete the value for right_menu.is_delete
     *
     * @mbggenerated
     */
    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column right_menu.org_code
     *
     * @return the value of right_menu.org_code
     *
     * @mbggenerated
     */
    public String getOrgCode() {
        return orgCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column right_menu.org_code
     *
     * @param orgCode the value for right_menu.org_code
     *
     * @mbggenerated
     */
    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode == null ? null : orgCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table right_menu
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
        RightMenu other = (RightMenu) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getMenuName() == null ? other.getMenuName() == null : this.getMenuName().equals(other.getMenuName()))
            && (this.getIsParentMenu() == null ? other.getIsParentMenu() == null : this.getIsParentMenu().equals(other.getIsParentMenu()))
            && (this.getMenuType() == null ? other.getMenuType() == null : this.getMenuType().equals(other.getMenuType()))
            && (this.getMenuValue() == null ? other.getMenuValue() == null : this.getMenuValue().equals(other.getMenuValue()))
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
     * This method corresponds to the database table right_menu
     *
     * @mbggenerated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getMenuName() == null) ? 0 : getMenuName().hashCode());
        result = prime * result + ((getIsParentMenu() == null) ? 0 : getIsParentMenu().hashCode());
        result = prime * result + ((getMenuType() == null) ? 0 : getMenuType().hashCode());
        result = prime * result + ((getMenuValue() == null) ? 0 : getMenuValue().hashCode());
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
     * This method corresponds to the database table right_menu
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
        sb.append(", menuName=").append(menuName);
        sb.append(", isParentMenu=").append(isParentMenu);
        sb.append(", menuType=").append(menuType);
        sb.append(", menuValue=").append(menuValue);
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