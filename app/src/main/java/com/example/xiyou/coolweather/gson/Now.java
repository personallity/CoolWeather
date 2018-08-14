package com.example.xiyou.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by XiYou on 2018/7/31.
 */

public class Now {

    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More {

        @SerializedName("txt")
        public String info;
    }
}
