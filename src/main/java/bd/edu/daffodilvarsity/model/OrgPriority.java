package bd.edu.daffodilvarsity.model;

/**
 * Created by mahmud on 12/15/16.
 */

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "hrm_org_priority")
public class OrgPriority {

    @Id
    private int priority_no;
    private String priority_name;

    public OrgPriority() {
    }

    public OrgPriority(int priority_no, String priority_name) {
        this.priority_no = priority_no;
        this.priority_name = priority_name;
    }

    public int getPriority_no() {
        return priority_no;
    }

    public void setPriority_no(int priority_no) {
        this.priority_no = priority_no;
    }

    public String getPriority_name() {
        return priority_name;
    }

    public void setPriority_name(String priority_name) {
        this.priority_name = priority_name;
    }
}
