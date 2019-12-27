package com.mxb.springboot.yamldemo.bean;

/**
 * @author Love
 */
public class SubBean {

    private int sfi;
    private boolean sfb;
    private String sfs;

    @Override
    public String toString() {
        return "SubBean{" +
                "sfi=" + sfi +
                ", sfb=" + sfb +
                ", sfs='" + sfs + '\'' +
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
}
