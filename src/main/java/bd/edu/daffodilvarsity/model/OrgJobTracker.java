package bd.edu.daffodilvarsity.model;

/**
 * Created by mahmud on 12/15/16.
 */

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "hrm_org_job_tracker")
public class OrgJobTracker {

    @Id
    private int who;
    private int whom;
    private int read_flag;
    private boolean email_want;
    private boolean visible;
    private String created_by;
    private Date created_time;

    public OrgJobTracker() {
    }

    public OrgJobTracker(int who, int whom, int read_flag, boolean email_want, boolean visible,
                         String created_by, Date created_time) {
        this.who = who;
        this.whom = whom;
        this.read_flag = read_flag;
        this.email_want = email_want;
        this.visible = visible;
        this.created_by = created_by;
        this.created_time = created_time;
    }

    public int getWho() {
        return who;
    }

    public void setWho(int who) {
        this.who = who;
    }

    public int getWhom() {
        return whom;
    }

    public void setWhom(int whom) {
        this.whom = whom;
    }

    public int getRead_flag() {
        return read_flag;
    }

    public void setRead_flag(int read_flag) {
        this.read_flag = read_flag;
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
}
