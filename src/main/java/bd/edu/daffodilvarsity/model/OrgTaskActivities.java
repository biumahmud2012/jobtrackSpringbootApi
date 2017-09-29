package bd.edu.daffodilvarsity.model;

/**
 * Created by mahmud on 12/15/16.
 */

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "hrm_org_task_activities")
public class OrgTaskActivities {

    @Id
    private int activity_id;
    private int task_id;
    private Date date;
    private String activity_desc;
    private int activity_grade;
    private String activity_grade_by;

    private int commentator_id;
    private int performed_by;
    private String app;
    private String client_ip;
    private String readers;
    private int prev_commentator_id;
    private int prev_performed_by;

    public OrgTaskActivities() {
    }

    public OrgTaskActivities(int activity_id, int task_id, Date date, String activity_desc, int activity_grade, String activity_grade_by, int commentator_id, int performed_by, String app, String client_ip, String readers, int prev_commentator_id, int prev_performed_by) {
        this.activity_id = activity_id;
        this.task_id = task_id;
        this.date = date;
        this.activity_desc = activity_desc;
        this.activity_grade = activity_grade;
        this.activity_grade_by = activity_grade_by;
        this.commentator_id = commentator_id;
        this.performed_by = performed_by;
        this.app = app;
        this.client_ip = client_ip;
        this.readers = readers;
        this.prev_commentator_id = prev_commentator_id;
        this.prev_performed_by = prev_performed_by;
    }

    public int getActivity_id() {
        return activity_id;
    }

    public void setActivity_id(int activity_id) {
        this.activity_id = activity_id;
    }

    public int getTask_id() {
        return task_id;
    }

    public void setTask_id(int task_id) {
        this.task_id = task_id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getActivity_desc() {
        return activity_desc;
    }

    public void setActivity_desc(String activity_desc) {
        this.activity_desc = activity_desc;
    }

    public int getActivity_grade() {
        return activity_grade;
    }

    public void setActivity_grade(int activity_grade) {
        this.activity_grade = activity_grade;
    }

    public String getActivity_grade_by() {
        return activity_grade_by;
    }

    public void setActivity_grade_by(String activity_grade_by) {
        this.activity_grade_by = activity_grade_by;
    }

    public int getCommentator_id() {
        return commentator_id;
    }

    public void setCommentator_id(int commentator_id) {
        this.commentator_id = commentator_id;
    }

    public int getPerformed_by() {
        return performed_by;
    }

    public void setPerformed_by(int performed_by) {
        this.performed_by = performed_by;
    }

    public String getApp() {
        return app;
    }

    public void setApp(String app) {
        this.app = app;
    }

    public String getClient_ip() {
        return client_ip;
    }

    public void setClient_ip(String client_ip) {
        this.client_ip = client_ip;
    }

    public String getReaders() {
        return readers;
    }

    public void setReaders(String readers) {
        this.readers = readers;
    }

    public int getPrev_commentator_id() {
        return prev_commentator_id;
    }

    public void setPrev_commentator_id(int prev_commentator_id) {
        this.prev_commentator_id = prev_commentator_id;
    }

    public int getPrev_performed_by() {
        return prev_performed_by;
    }

    public void setPrev_performed_by(int prev_performed_by) {
        this.prev_performed_by = prev_performed_by;
    }
}
