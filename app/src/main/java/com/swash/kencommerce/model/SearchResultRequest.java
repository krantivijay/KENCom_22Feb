package com.swash.kencommerce.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by kranti on 10/1/2016.
 */
public class SearchResultRequest {
    @SerializedName("status")
    @Expose
    private Integer status;
    @SerializedName("success")
    @Expose
    private Integer success;
    @SerializedName("error_msg")
    @Expose
    private String errorMsg;
    @SerializedName("data")
    @Expose
    private SearchResultResponse data;

    /**
     *
     * @return
     * The status
     */
    public Integer getStatus() {
        return status;
    }

    /**
     *
     * @param status
     * The status
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     *
     * @return
     * The success
     */
    public Integer getSuccess() {
        return success;
    }

    /**
     *
     * @param success
     * The success
     */
    public void setSuccess(Integer success) {
        this.success = success;
    }

    /**
     *
     * @return
     * The errorMsg
     */
    public String getErrorMsg() {
        return errorMsg;
    }

    /**
     *
     * @param errorMsg
     * The error_msg
     */
    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    /**
     *
     * @return
     * The data
     */
    public SearchResultResponse getData() {
        return data;
    }

    /**
     *
     * @param data
     * The data
     */
    public void setData(SearchResultResponse data) {
        this.data = data;
    }
}
