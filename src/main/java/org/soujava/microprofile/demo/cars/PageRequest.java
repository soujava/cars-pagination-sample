package org.soujava.microprofile.demo.cars;

import jakarta.nosql.mapping.Pagination;

import javax.validation.constraints.Positive;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.QueryParam;

public class PageRequest {

    @QueryParam("page")
    @DefaultValue("1")
    @Positive
    private long page;

    @QueryParam("size")
    @DefaultValue("3")
    @Positive
    private long size;

    public long getPage() {
        return page;
    }

    public void setPage(long page) {
        this.page = page;
    }

    public long getSize() {
        return size;
    }

    public void setSize(long size) {
        this.size = size;
    }

    public Pagination toPagination() {
        return Pagination.page(page).size(size);
    }

    @Override
    public String toString() {
        return "PageRequest{" +
                "page=" + page +
                ", size=" + size +
                '}';
    }
}
