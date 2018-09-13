package cn.soiol.entity;

import com.gitee.sunchenbin.mybatis.actable.annotation.Column;
import com.gitee.sunchenbin.mybatis.actable.annotation.Table;
import com.gitee.sunchenbin.mybatis.actable.constants.MySqlTypeConstant;

@Table(name = "user")
public class TableBean {
    @Column(name = "id",type = MySqlTypeConstant.INT,length = 11,isKey = true,isAutoIncrement = true)
    private Integer id;

    @Column(name = "name",type = MySqlTypeConstant.VARCHAR,length = 111)
    private String  name;

    @Column(name = "grade",type = MySqlTypeConstant.VARCHAR,length = 111)
    private String  grade;

    @Column(name = "gender",type = MySqlTypeConstant.VARCHAR,length = 111)
    private String  gender;

    @Column(name = "campus",type = MySqlTypeConstant.VARCHAR,length = 111)
    private String  campus;

    @Column(name = "uid",type = MySqlTypeConstant.BIGINT,length = 11)
    private long  uid;

    @Column(name = "section",type = MySqlTypeConstant.VARCHAR,length = 111)
    private String  section;

    @Column(name = "time",type = MySqlTypeConstant.VARCHAR,length = 111)
    private String  time;

    @Column(name = "special",type = MySqlTypeConstant.VARCHAR,length = 111)
    private String  special;

    @Column(name = "phone",type = MySqlTypeConstant.VARCHAR,length = 111)
    private String  phone;

    @Column(name = "profile",type = MySqlTypeConstant.VARCHAR,length = 111)
    private String  profile;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCampus() {
        return campus;
    }

    public void setCampus(String campus) {
        this.campus = campus;
    }

    public long getUid() {
        return uid;
    }

    public void setUid(long uid) {
        this.uid = uid;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getSpecial() {
        return special;
    }

    public void setSpecial(String special) {
        this.special = special;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }
}
