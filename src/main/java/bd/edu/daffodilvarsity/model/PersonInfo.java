package bd.edu.daffodilvarsity.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * Created by mahmud on 12/10/16.
 */

@Entity
@Table(name = "person_info")
public class PersonInfo {

    @Id
    //@GeneratedValue
    private int id;
    private String employee_id;
    private String emp_name;
    private String emp_email;
    private int designation_id;
    private String current_dept_id;
    private int current_branch;
    private String reports_to;
    private String active;
    private String created_by;
    private Date created_time;
    private String modified_by;
    private Date modified_time;
    private int user_group_id;
    private String password;
    private String authenticate_code;
    private String current_status;
    private Date status_update_time;

    public PersonInfo() {
    }

    public PersonInfo(int id, String employee_id, String emp_name, String emp_email, int designation_id,
                      String current_dept_id, int current_branch, String reports_to,
                      String active, String created_by, Date created_time, String modified_by,
                      Date modified_time, int user_group_id, String password, String authenticate_code,
                      String current_status, Date status_update_time) {
        this.id = id;
        this.employee_id = employee_id;
        this.emp_name = emp_name;
        this.emp_email = emp_email;
        this.designation_id = designation_id;
        this.current_dept_id = current_dept_id;
        this.current_branch = current_branch;
        this.reports_to = reports_to;
        this.active = active;
        this.created_by = created_by;
        this.created_time = created_time;
        this.modified_by = modified_by;
        this.modified_time = modified_time;
        this.user_group_id = user_group_id;
        this.password = password;
        this.authenticate_code = authenticate_code;
        this.current_status = current_status;
        this.status_update_time = status_update_time;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(String employee_id) {
        this.employee_id = employee_id;
    }

    public String getEmp_email() {
        return emp_email;
    }

    public void setEmp_email(String emp_email) {
        this.emp_email = emp_email;
    }

    public String getEmp_name() {
        return emp_name;
    }

    public void setEmp_name(String emp_name) {
        this.emp_name = emp_name;
    }

    public int getDesignation_id() {
        return designation_id;
    }

    public void setDesignation_id(int designation_id) {
        this.designation_id = designation_id;
    }

    public String getCurrent_dept_id() {
        return current_dept_id;
    }

    public void setCurrent_dept_id(String current_dept_id) {
        this.current_dept_id = current_dept_id;
    }

    public int getCurrent_branch() {
        return current_branch;
    }

    public void setCurrent_branch(int current_branch) {
        this.current_branch = current_branch;
    }

    public String getReports_to() {
        return reports_to;
    }

    public void setReports_to(String reports_to) {
        this.reports_to = reports_to;
    }

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }

    public String getCreated_by() {
        return created_by;
    }

    public void setCreated_by(String created_by) {
        this.created_by = created_by;
    }

    public Date getCreated_time() {
        return created_time;
    }

    public void setCreated_time(Date created_time) {
        this.created_time = created_time;
    }

    public String getModified_by() {
        return modified_by;
    }

    public void setModified_by(String modified_by) {
        this.modified_by = modified_by;
    }

    public Date getModified_time() {
        return modified_time;
    }

    public void setModified_time(Date modified_time) {
        this.modified_time = modified_time;
    }

    public int getUser_group_id() {
        return user_group_id;
    }

    public void setUser_group_id(int user_group_id) {
        this.user_group_id = user_group_id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAuthenticate_code() {
        return authenticate_code;
    }

    public void setAuthenticate_code(String authenticate_code) {
        this.authenticate_code = authenticate_code;
    }

    public String getCurrent_status() {
        return current_status;
    }

    public void setCurrent_status(String current_status) {
        this.current_status = current_status;
    }

    public Date getStatus_update_time() {
        return status_update_time;
    }

    public void setStatus_update_time(Date status_update_time) {
        this.status_update_time = status_update_time;
    }
}
