package com.GoogleLearning.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Time;


@Entity
@Table(name = "DriveDto")
public class DriveDto {

    private String First_name;

    private String Last_Name;
    @Id
    private String Email;

    private Time Duration;

    private Time start_Time;

    private Time End_End;

    public DriveDto(String first_name, String last_Name, String email, Time duration, Time start_Time, Time end_End) {
        First_name = first_name;
        Last_Name = last_Name;
        Email = email;
        Duration = duration;
        this.start_Time = start_Time;
        End_End = end_End;
    }

    public DriveDto() {
    }

    public String getFirst_name() {
        return First_name;
    }

    public void setFirst_name(String first_name) {
        First_name = first_name;
    }

    public String getLast_Name() {
        return Last_Name;
    }

    public void setLast_Name(String last_Name) {
        Last_Name = last_Name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public Time getDuration() {
        return Duration;
    }

    public void setDuration(Time duration) {
        Duration = duration;
    }

    public Time getStart_Time() {
        return start_Time;
    }

    public void setStart_Time(Time start_Time) {
        this.start_Time = start_Time;
    }

    public Time getEnd_End() {
        return End_End;
    }

    public void setEnd_End(Time end_End) {
        End_End = end_End;
    }
}
