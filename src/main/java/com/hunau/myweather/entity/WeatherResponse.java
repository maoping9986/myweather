package com.hunau.myweather.entity;


import lombok.Data;

import java.io.Serializable;


@Data
public class WeatherResponse implements Serializable {



    /**
     * 消息数据
     */
    private Weather data;

    public Weather getData() {
        return data;
    }

    public void setData(Weather data) {
        this.data = data;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    /**
     * 消息状态
     */
    private String status;

    /**
     * 消息描述
     */
    private String desc;
}
