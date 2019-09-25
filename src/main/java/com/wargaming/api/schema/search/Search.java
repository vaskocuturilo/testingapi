package com.wargaming.api.schema.search;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.annotation.Generated;

@SuppressWarnings("PMD.MethodArgumentCouldBeFinal")
@Generated("com.robohorse.robopojogenerator")
public class Search {

    @JsonProperty("data")
    private List<DataItem> data;

    @JsonProperty("meta")
    private Meta meta;

    @JsonProperty("status")
    private String status;

    public void setData(List<DataItem> data) {
        this.data = data;
    }

    public List<DataItem> getData() {
        return data;
    }

    public void setMeta(Meta meta) {
        this.meta = meta;
    }

    public Meta getMeta() {
        return meta;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return
                "Search{" +
                        "com.wargaming.data = '" + data + '\'' +
                        ",meta = '" + meta + '\'' +
                        ",status = '" + status + '\'' +
                        "}";
    }
}