package org.lanqiao.pojo;

import java.util.Objects;
import java.util.Set;

public class Clas {
    private int cid;
    private String cname;
    private Set<Student> studentSet;
    public Clas(){

    }

    public Clas(int cid, String cname, Set<Student> studentSet) {
        this.cid = cid;
        this.cname = cname;
        this.studentSet = studentSet;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public Set<Student> getStudentSet() {
        return studentSet;
    }

    public void setStudentSet(Set<Student> studentSet) {
        this.studentSet = studentSet;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Clas clas = (Clas) o;
        return cid == clas.cid &&
                Objects.equals(cname, clas.cname) &&
                Objects.equals(studentSet, clas.studentSet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cid, cname, studentSet);
    }

    @Override
    public String toString() {
        return "Clas{" +
                "cid=" + cid +
                ", cname='" + cname + '\'' +
                ", studentSet=" + studentSet +
                '}';
    }
}
