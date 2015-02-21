package clients.models;

import db.EmployeeEntity;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by elyor on 2/21/2015.
 */
public class EmployeeResponseModel implements Serializable {

    private Long limit;
    private Long offset;
    private Long total;
    private ArrayList<EmployeeEntity> items;

    public Long getLimit() {
        return limit;
    }

    public void setLimit(Long limit) {
        this.limit = limit;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public ArrayList<EmployeeEntity> getItems() {
        return items;
    }

    public void setItems(ArrayList<EmployeeEntity> items) {
        this.items = items;
    }

    public Long getOffset() {
        return offset;
    }

    public void setOffset(Long offset) {
        this.offset = offset;
    }

}
