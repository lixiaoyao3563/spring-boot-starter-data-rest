package com.lxy.springbootstarterdatarest.domain;

public class Index {

    private String indexname;
    private String indexpage;

    public Index(String indexname, String indexpage) {
        super();
        this.indexname = indexname;
        this.indexpage = indexpage;
    }

    public String getIndexname() {
        return indexname;
    }

    public void setIndexname(String indexname) {
        this.indexname = indexname;
    }

    public String getIndexpage() {
        return indexpage;
    }

    public void setIndexpage(String indexpage) {
        this.indexpage = indexpage;
    }
}
