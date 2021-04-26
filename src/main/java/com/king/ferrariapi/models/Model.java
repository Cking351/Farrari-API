package com.king.ferrariapi.models;

import javax.persistence.*;

@Entity
@Table(name = "model")
public class Model {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long modelid;

    @Column(nullable = false)
    private String modelname;

    @Column
    private String modelyears;

    @Column(nullable = true)
    private long modelproduction;

    @Column
    private String modelengine;

    @Column
    private String modelpower;

    @Column
    private String modeltorque;

    @Column(nullable = true)
    private double modelzerotosixty;

    @Column
    private long modeltopspeed;

    @Column
    private String modelimage;

    public Model(String modelname, String modelyears, long modelproduction, String modelengine, String modelpower, String modeltorque, double modelzerotosixty, long modeltopspeed, String modelimage) {
        this.modelname = modelname;
        this.modelyears = modelyears;
        this.modelproduction = modelproduction;
        this.modelengine = modelengine;
        this.modelpower = modelpower;
        this.modeltorque = modeltorque;
        this.modelzerotosixty = modelzerotosixty;
        this.modeltopspeed = modeltopspeed;
        this.modelimage = modelimage;
    }

    public Model() {
    }

    public long getModelid() {
        return modelid;
    }

    public void setModelid(long modelid) {
        this.modelid = modelid;
    }

    public String getModelname() {
        return modelname;
    }

    public void setModelname(String modelname) {
        this.modelname = modelname;
    }

    public String getModelyears() {
        return modelyears;
    }

    public void setModelyears(String modelyears) {
        this.modelyears = modelyears;
    }

    public long getModelproduction() {
        return modelproduction;
    }

    public void setModelproduction(long modelproduction) {
        this.modelproduction = modelproduction;
    }

    public String getModelengine() {
        return modelengine;
    }

    public void setModelengine(String modelengine) {
        this.modelengine = modelengine;
    }

    public String getModelpower() {
        return modelpower;
    }

    public void setModelpower(String modelpower) {
        this.modelpower = modelpower;
    }

    public String getModeltorque() {
        return modeltorque;
    }

    public void setModeltorque(String modeltorque) {
        this.modeltorque = modeltorque;
    }

    public double getModelzerotosixty() {
        return modelzerotosixty;
    }

    public void setModelzerotosixty(double modelzerotosixty) {
        this.modelzerotosixty = modelzerotosixty;
    }

    public long getModeltopspeed() {
        return modeltopspeed;
    }

    public void setModeltopspeed(long modeltopspeed) {
        this.modeltopspeed = modeltopspeed;
    }

    public String getModelimage() {
        return modelimage;
    }

    public void setModelimage(String modelimage) {
        this.modelimage = modelimage;
    }
}
