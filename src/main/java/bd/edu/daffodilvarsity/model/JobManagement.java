package bd.edu.daffodilvarsity.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * Created by mahmud on 12/10/16.
 */

@Entity
@Table(name = "job_management")
public class JobManagement {

    @Id
    private int job_id;
    //private int employeeId;
    private String job_title;
    private String job_description;
    private int job_has_deadline;
    private Date job_startdate;
    private Date job_enddate;
    private int job_progress;
    private int job_priority;
    private String job_status;
    private int department_id;
    private int created_by;
    private Date created_time;
    private int update_by;
    private Date update_time;
    private int job_owner;

    public JobManagement() {
    }

    public JobManagement(int job_id, String job_title, String job_description, int job_has_deadline, Date job_startdate, Date job_enddate, int job_progress, int job_priority, String job_status, int department_id, int created_by, Date created_time, int update_by, Date update_time, int job_owner) {
        this.job_id = job_id;
        this.job_title = job_title;
        this.job_description = job_description;
        this.job_has_deadline = job_has_deadline;
        this.job_startdate = job_startdate;
        this.job_enddate = job_enddate;
        this.job_progress = job_progress;
        this.job_priority = job_priority;
        this.job_status = job_status;
        this.department_id = department_id;
        this.created_by = created_by;
        this.created_time = created_time;
        this.update_by = update_by;
        this.update_time = update_time;
        this.job_owner = job_owner;
    }

    public int getJob_id() {
        return job_id;
    }

    public void setJob_id(int job_id) {
        this.job_id = job_id;
    }

    public String getJob_title() {
        return job_title;
    }

    public void setJob_title(String job_title) {
        this.job_title = job_title;
    }

    public String getJob_description() {
        return job_description;
    }

    public void setJob_description(String job_description) {
        this.job_description = job_description;
    }

    public int getJob_has_deadline() {
        return job_has_deadline;
    }

    public void setJob_has_deadline(int job_has_deadline) {
        this.job_has_deadline = job_has_deadline;
    }

    public Date getJob_startdate() {
        return job_startdate;
    }

    public void setJob_startdate(Date job_startdate) {
        this.job_startdate = job_startdate;
    }

    public Date getJob_enddate() {
        return job_enddate;
    }

    public void setJob_enddate(Date job_enddate) {
        this.job_enddate = job_enddate;
    }

    public int getJob_progress() {
        return job_progress;
    }

    public void setJob_progress(int job_progress) {
        this.job_progress = job_progress;
    }

    public int getJob_priority() {
        return job_priority;
    }

    public void setJob_priority(int job_priority) {
        this.job_priority = job_priority;
    }

    public String getJob_status() {
        return job_status;
    }

    public void setJob_status(String job_status) {
        this.job_status = job_status;
    }

    public int getDepartment_id() {
        return department_id;
    }

    public void setDepartment_id(int department_id) {
        this.department_id = department_id;
    }

    public int getCreated_by() {
        return created_by;
    }

    public void setCreated_by(int created_by) {
        this.created_by = created_by;
    }

    public Date getCreated_time() {
        return created_time;
    }

    public void setCreated_time(Date created_time) {
        this.created_time = created_time;
    }

    public int getUpdate_by() {
        return update_by;
    }

    public void setUpdate_by(int update_by) {
        this.update_by = update_by;
    }

    public Date getUpdate_time() {
        return update_time;
    }

    public void setUpdate_time(Date update_time) {
        this.update_time = update_time;
    }

    public int getJob_owner() {
        return job_owner;
    }

    public void setJob_owner(int job_owner) {
        this.job_owner = job_owner;
    }
}
