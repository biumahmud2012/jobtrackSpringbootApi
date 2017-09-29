package bd.edu.daffodilvarsity.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * Created by mahmud on 12/10/16.
 */

@Entity
@Table(name = "hrm_designation")
public class DesignationInfo {

        @Id
        //@GeneratedValue
        private int desig_id;
        @Column(nullable = false)
        private String designation;
        private int view_order;
        private String created_by;
        private Date created_time;
        private String modified_by;
        private Date modified_time;
        //private int grade;


    public DesignationInfo() {
    }

    public DesignationInfo(int desig_id, String designation, int view_order, String created_by, Date created_time,
                           String modified_by, Date modified_time) {
        this.desig_id = desig_id;
        this.designation = designation;
        this.view_order = view_order;
        this.created_by = created_by;
        this.created_time = created_time;
        this.modified_by = modified_by;
        this.modified_time = modified_time;
    }

    public int getDesig_id() {
        return desig_id;
    }

    public void setDesig_id(int desig_id) {
        this.desig_id = desig_id;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public int getView_order() {
        return view_order;
    }

    public void setView_order(int view_order) {
        this.view_order = view_order;
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
}
