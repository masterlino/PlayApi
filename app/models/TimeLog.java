package models;

import io.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class TimeLog extends Model {
    @Id
    private Long id;

    private Long timeStamp;

    public TimeLog() {
        super();
    }

    public TimeLog(Long timeStamp) {
        super();
        this.timeStamp = timeStamp;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(Long timeStamp) {
        this.timeStamp = timeStamp;
    }
}
