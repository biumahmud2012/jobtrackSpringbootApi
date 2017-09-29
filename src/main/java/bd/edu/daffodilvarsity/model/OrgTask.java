package bd.edu.daffodilvarsity.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * Created by mahmud on 12/15/16.
 */

@Entity
@Table(name = "hrm_org_task")
public class OrgTask {
    @Id
    private int task_id;
    //private int jobManagementId;
    //private int employeeId;
    private String task_title;
    private String task_description;
    private Date startdate;
    private Date estimated_date;
    private Date actual_enddate;
    private String status;
    private int percent_done;
    private int priority;
    private String owner_comments;
    private String incharge_comments;
    private int task_owner_id;
    private int job_id;
    private int accesibility;
    private int prev_owner_id;
    private int created_by;
    private Date created_time;
    private int update_by;
    private Date updated_time;

    public OrgTask() {
    }

    public OrgTask(int task_id, String task_title, String task_description, Date startdate, Date estimated_date, Date actual_enddate, String status, int percent_done, int priority, String owner_comments, String incharge_comments, int task_owner_id, int job_id, int accesibility, int prev_owner_id, int created_by, Date created_time, int update_by, Date updated_time) {
        this.task_id = task_id;
        this.task_title = task_title;
        this.task_description = task_description;
        this.startdate = startdate;
        this.estimated_date = estimated_date;
        this.actual_enddate = actual_enddate;
        this.status = status;
        this.percent_done = percent_done;
        this.priority = priority;
        this.owner_comments = owner_comments;
        this.incharge_comments = incharge_comments;
        this.task_owner_id = task_owner_id;
        this.job_id = job_id;
        this.accesibility = accesibility;
        this.prev_owner_id = prev_owner_id;
        this.created_by = created_by;
        this.created_time = created_time;
        this.update_by = update_by;
        this.updated_time = updated_time;
    }

    public int getTask_id() {
        return task_id;
    }

    public void setTask_id(int task_id) {
        this.task_id = task_id;
    }

    public String getTask_title() {
        return task_title;
    }

    public void setTask_title(String task_title) {
        this.task_title = task_title;
    }

    public String getTask_description() {
        return task_description;
    }

    public void setTask_description(String task_description) {
        this.task_description = task_description;
    }

    public Date getStartdate() {
        return startdate;
    }

    public void setStartdate(Date startdate) {
        this.startdate = startdate;
    }

    public Date getEstimated_date() {
        return estimated_date;
    }

    public void setEstimated_date(Date estimated_date) {
        this.estimated_date = estimated_date;
    }

    public Date getActual_enddate() {
        return actual_enddate;
    }

    public void setActual_enddate(Date actual_enddate) {
        this.actual_enddate = actual_enddate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getPercent_done() {
        return percent_done;
    }

    public void setPercent_done(int percent_done) {
        this.percent_done = percent_done;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public String getOwner_comments() {
        return owner_comments;
    }

    public void setOwner_comments(String owner_comments) {
        this.owner_comments = owner_comments;
    }

    public String getIncharge_comments() {
        return incharge_comments;
    }

    public void setIncharge_comments(String incharge_comments) {
        this.incharge_comments = incharge_comments;
    }

    public int getTask_owner_id() {
        return task_owner_id;
    }

    public void setTask_owner_id(int task_owner_id) {
        this.task_owner_id = task_owner_id;
    }

    public int getJob_id() {
        return job_id;
    }

    public void setJob_id(int job_id) {
        this.job_id = job_id;
    }

    public int getAccesibility() {
        return accesibility;
    }

    public void setAccesibility(int accesibility) {
        this.accesibility = accesibility;
    }

    public int getPrev_owner_id() {
        return prev_owner_id;
    }

    public void setPrev_owner_id(int prev_owner_id) {
        this.prev_owner_id = prev_owner_id;
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

    public Date getUpdated_time() {
        return updated_time;
    }

    public void setUpdated_time(Date updated_time) {
        this.updated_time = updated_time;
    }
}
