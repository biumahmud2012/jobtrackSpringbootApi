package bd.edu.daffodilvarsity.model;

/**
 * Created by mahmud on 12/15/16.
 */

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "hrm_org_job_member")
public class JobMember {

    @Id
    private int job_id;
    private int employee_id;
    private String role;
    private boolean read_flag;
    private int mem_status;
    private boolean email_want;
    private boolean visible;

    public JobMember() {
    }

    public JobMember(int job_id, int employee_id, String role, boolean read_flag, int mem_status, boolean email_want, boolean visible) {
        this.job_id = job_id;
        this.employee_id = employee_id;
        this.role = role;
        this.read_flag = read_flag;
        this.mem_status = mem_status;
        this.email_want = email_want;
        this.visible = visible;
    }

    public int getJob_id() {
        return job_id;
    }

    public void setJob_id(int job_id) {
        this.job_id = job_id;
    }

    public int getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(int employee_id) {
        this.employee_id = employee_id;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public boolean isRead_flag() {
        return read_flag;
    }

    public void setRead_flag(boolean read_flag) {
        this.read_flag = read_flag;
    }

    public int getMem_status() {
        return mem_status;
    }

    public void setMem_status(int mem_status) {
        this.mem_status = mem_status;
    }

    public boolean isEmail_want() {
        return email_want;
    }

    public void setEmail_want(boolean email_want) {
        this.email_want = email_want;
    }

    public boolean isVisible() {
        return visible;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }
}
