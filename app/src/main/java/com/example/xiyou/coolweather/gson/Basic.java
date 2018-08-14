package com.example.xiyou.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by XiYou on 2018/7/31.
 */

public class Basic {

    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update {

        @SerializedName("loc")
        public String updateTime;
    }
}
