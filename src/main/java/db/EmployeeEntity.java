package db;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by elyor on 2/22/2015.
 */
@Entity
@Table(name = "employee", schema = "public")
public class EmployeeEntity {
    private Integer employeeId;
    private String fullName;
    private String firstName;
    private String lastName;
    private Integer positionId;
    private String positionTitle;
    private Integer storeId;
    private Integer departmentId;
    private Timestamp birthDate;
    private Timestamp hireDate;
    private Timestamp endDate;
    private Double salary;
    private Integer supervisorId;
    private String educationLevel;
    private String maritalStatus;
    private String gender;
    private String managementRole;

    @Id
    @Column(name = "employee_id", nullable = false, insertable = true, updatable = true)
    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    @Basic
    @Column(name = "full_name", nullable = true, insertable = true, updatable = true, length = 50)
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    @Basic
    @Column(name = "first_name", nullable = true, insertable = true, updatable = true, length = 50)
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Basic
    @Column(name = "last_name", nullable = true, insertable = true, updatable = true, length = 50)
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Basic
    @Column(name = "position_id", nullable = true, insertable = true, updatable = true)
    public Integer getPositionId() {
        return positionId;
    }

    public void setPositionId(Integer positionId) {
        this.positionId = positionId;
    }

    @Basic
    @Column(name = "position_title", nullable = true, insertable = true, updatable = true, length = 50)
    public String getPositionTitle() {
        return positionTitle;
    }

    public void setPositionTitle(String positionTitle) {
        this.positionTitle = positionTitle;
    }

    @Basic
    @Column(name = "store_id", nullable = true, insertable = true, updatable = true)
    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    @Basic
    @Column(name = "department_id", nullable = true, insertable = true, updatable = true)
    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    @Basic
    @Column(name = "birth_date", nullable = true, insertable = true, updatable = true)
    public Timestamp getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Timestamp birthDate) {
        this.birthDate = birthDate;
    }

    @Basic
    @Column(name = "hire_date", nullable = true, insertable = true, updatable = true)
    public Timestamp getHireDate() {
        return hireDate;
    }

    public void setHireDate(Timestamp hireDate) {
        this.hireDate = hireDate;
    }

    @Basic
    @Column(name = "end_date", nullable = true, insertable = true, updatable = true)
    public Timestamp getEndDate() {
        return endDate;
    }

    public void setEndDate(Timestamp endDate) {
        this.endDate = endDate;
    }

    @Basic
    @Column(name = "salary", nullable = true, insertable = true, updatable = true, precision = 17)
    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Basic
    @Column(name = "supervisor_id", nullable = true, insertable = true, updatable = true)
    public Integer getSupervisorId() {
        return supervisorId;
    }

    public void setSupervisorId(Integer supervisorId) {
        this.supervisorId = supervisorId;
    }

    @Basic
    @Column(name = "education_level", nullable = true, insertable = true, updatable = true, length = 50)
    public String getEducationLevel() {
        return educationLevel;
    }

    public void setEducationLevel(String educationLevel) {
        this.educationLevel = educationLevel;
    }

    @Basic
    @Column(name = "marital_status", nullable = true, insertable = true, updatable = true, length = 1)
    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    @Basic
    @Column(name = "gender", nullable = true, insertable = true, updatable = true, length = 1)
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Basic
    @Column(name = "management_role", nullable = true, insertable = true, updatable = true, length = 20)
    public String getManagementRole() {
        return managementRole;
    }

    public void setManagementRole(String managementRole) {
        this.managementRole = managementRole;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EmployeeEntity that = (EmployeeEntity) o;

        if (birthDate != null ? !birthDate.equals(that.birthDate) : that.birthDate != null) return false;
        if (departmentId != null ? !departmentId.equals(that.departmentId) : that.departmentId != null) return false;
        if (educationLevel != null ? !educationLevel.equals(that.educationLevel) : that.educationLevel != null)
            return false;
        if (employeeId != null ? !employeeId.equals(that.employeeId) : that.employeeId != null) return false;
        if (endDate != null ? !endDate.equals(that.endDate) : that.endDate != null) return false;
        if (firstName != null ? !firstName.equals(that.firstName) : that.firstName != null) return false;
        if (fullName != null ? !fullName.equals(that.fullName) : that.fullName != null) return false;
        if (gender != null ? !gender.equals(that.gender) : that.gender != null) return false;
        if (hireDate != null ? !hireDate.equals(that.hireDate) : that.hireDate != null) return false;
        if (lastName != null ? !lastName.equals(that.lastName) : that.lastName != null) return false;
        if (managementRole != null ? !managementRole.equals(that.managementRole) : that.managementRole != null)
            return false;
        if (maritalStatus != null ? !maritalStatus.equals(that.maritalStatus) : that.maritalStatus != null)
            return false;
        if (positionId != null ? !positionId.equals(that.positionId) : that.positionId != null) return false;
        if (positionTitle != null ? !positionTitle.equals(that.positionTitle) : that.positionTitle != null)
            return false;
        if (salary != null ? !salary.equals(that.salary) : that.salary != null) return false;
        if (storeId != null ? !storeId.equals(that.storeId) : that.storeId != null) return false;
        if (supervisorId != null ? !supervisorId.equals(that.supervisorId) : that.supervisorId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = employeeId != null ? employeeId.hashCode() : 0;
        result = 31 * result + (fullName != null ? fullName.hashCode() : 0);
        result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + (positionId != null ? positionId.hashCode() : 0);
        result = 31 * result + (positionTitle != null ? positionTitle.hashCode() : 0);
        result = 31 * result + (storeId != null ? storeId.hashCode() : 0);
        result = 31 * result + (departmentId != null ? departmentId.hashCode() : 0);
        result = 31 * result + (birthDate != null ? birthDate.hashCode() : 0);
        result = 31 * result + (hireDate != null ? hireDate.hashCode() : 0);
        result = 31 * result + (endDate != null ? endDate.hashCode() : 0);
        result = 31 * result + (salary != null ? salary.hashCode() : 0);
        result = 31 * result + (supervisorId != null ? supervisorId.hashCode() : 0);
        result = 31 * result + (educationLevel != null ? educationLevel.hashCode() : 0);
        result = 31 * result + (maritalStatus != null ? maritalStatus.hashCode() : 0);
        result = 31 * result + (gender != null ? gender.hashCode() : 0);
        result = 31 * result + (managementRole != null ? managementRole.hashCode() : 0);
        return result;
    }

}
