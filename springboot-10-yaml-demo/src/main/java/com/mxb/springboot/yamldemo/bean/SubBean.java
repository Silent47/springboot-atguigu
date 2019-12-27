package com.mxb.springboot.yamldemo.bean;

import java.util.Date;

/**
 * @author Love
 */
public class SubBean {

    private int sfi;
    private boolean sfb;
    private String sfs;
    private Date sfd;

    @Override
    public String toString() {
        return "SubBean{" +
                "sfi=" + sfi +
                ", sfb=" + sfb +
                ", sfs='" + sfs + '\'' +
                ", sfd=" + sfd +
                '}';
    }

    public int getSfi() {
        return sfi;
    }

    public void setSfi(int sfi) {
        this.sfi = sfi;
    }

    public boolean isSfb() {
        return sfb;
    }

    public void setSfb(boolean sfb) {
        this.sfb = sfb;
    }

    public String getSfs() {
        return sfs;
    }

    public void setSfs(String sfs) {
        this.sfs = sfs;
    }

    public Date getSfd() {
        return sfd;
    }

    public void setSfd(Date sfd) {
        this.sfd = sfd;
    }
}
