package models;

import java.sql.Date;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "employees")
@Entity
public class Report {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "employee_id", nullable = false, unique = true)
    private String employee_id;

    @Column(name = "report_date", nullable = false)
    private Date report_date;

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "content", nullable = false)
    private String content;

    @Column(name = "updated_at", nullable = false)
    private Timestamp updated_at;

    @Column(name = "delete_flag", nullable = false)
    private Integer delete_flag;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id セットする id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return employee_id
     */
    public String getEmployee_id() {
        return employee_id;
    }

    /**
     * @param employee_id セットする employee_id
     */
    public void setEmployee_id(String employee_id) {
        this.employee_id = employee_id;
    }

    /**
     * @return report_date
     */
    public Date getReport_date() {
        return report_date;
    }

    /**
     * @param report_date セットする report_date
     */
    public void setReport_date(Date report_date) {
        this.report_date = report_date;
    }

    /**
     * @return title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title セットする title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return content
     */
    public String getContent() {
        return content;
    }

    /**
     * @param content セットする content
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * @return updated_at
     */
    public Timestamp getUpdated_at() {
        return updated_at;
    }

    /**
     * @param updated_at セットする updated_at
     */
    public void setUpdated_at(Timestamp updated_at) {
        this.updated_at = updated_at;
    }

    /**
     * @return delete_flag
     */
    public Integer getDelete_flag() {
        return delete_flag;
    }

    /**
     * @param delete_flag セットする delete_flag
     */
    public void setDelete_flag(Integer delete_flag) {
        this.delete_flag = delete_flag;
    }

}
