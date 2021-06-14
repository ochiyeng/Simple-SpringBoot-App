package main.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity

public class message {

@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private int messg_id;
    private Long id;

    public int getMessg_id() {
        return messg_id;
    }

    public void setMessg_id(int messg_id) {
        this.messg_id = messg_id;
    }

    public Date getMessg_time() {
        return messg_time;
    }

    public void setMessg_time(Date messg_time) {
        this.messg_time = messg_time;
    }

    public String getMessges() {
        return messges;
    }

    public void setMessges(String messges) {
        this.messges = messges;
    }

    private Date messg_time;
private String messges;

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    public Long getId() {
        return id;
    }
}
