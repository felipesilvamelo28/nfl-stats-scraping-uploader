package br.com.nflscrapping.uploader.entity;

public class Fumble {
    private String id;
    private String year;
    private String name;
    private String ff;
    private String fr;
    private String fr_td;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFf() {
        return ff;
    }

    public void setFf(String ff) {
        this.ff = ff;
    }

    public String getFr() {
        return fr;
    }

    public void setFr(String fr) {
        this.fr = fr;
    }

    public String getFr_td() {
        return fr_td;
    }

    public void setFr_td(String fr_td) {
        this.fr_td = fr_td;
    }
}
