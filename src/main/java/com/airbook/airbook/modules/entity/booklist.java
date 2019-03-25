package com.airbook.airbook.modules.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;

@Entity
@Table(name = "booklist")

public class booklist {
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getAnum() {
        return anum;
    }

    public void setAnum(String anum) {
        this.anum = anum;
    }

    public String getAplace() {
        return aplace;
    }

    public void setAplace(String aplace) {
        this.aplace = aplace;
    }

    public String getAtime() {
        return atime;
    }

    public void setAtime(String atime) {
        this.atime = atime;
    }

    public String getAcompany() {
        return acompany;
    }

    public void setAcompany(String acompany) {
        this.acompany = acompany;
    }
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsercity() {
        return usercity;
    }

    public void setUsercity(String usercity) {
        this.usercity = usercity;
    }

    public String getUsex() {
        return usex;
    }

    public void setUsex(String usex) {
        this.usex = usex;
    }
    @Id //这是一个主键
    @GeneratedValue(strategy = GenerationType.IDENTITY)//自增主键
    private int id;

    @Column(name = "username",length = 50) //这是和数据表对应的一个列
    private String username;

    @Column(name = "usercity",length = 50) //这是和数据表对应的一个列
    private String usercity;

    @Column(name = "usex",length = 50) //这是和数据表对应的一个列
    private String usex;

    @Column(name = "anum",length = 50) //这是和数据表对应的一个列
    private String anum;
    @Column(name = "aplace",length = 50) //这是和数据表对应的一个列
    private String aplace;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private String atime;

    @Column(name = "acompany",length = 50) //这是和数据表对应的一个列
    private String acompany;

}
