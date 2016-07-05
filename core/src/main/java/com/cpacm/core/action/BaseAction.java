package com.cpacm.core.action;

import com.cpacm.core.http.RetrofitManager;

import retrofit2.Retrofit;

/**
 * @auther: cpacm
 * @date: 2016/6/24
 * @desciption:
 */
public class BaseAction {
    protected Retrofit retrofit;
    protected String accessToken;

    public BaseAction() {
        this.retrofit = RetrofitManager.getInstance().getRetrofit();
        this.accessToken = RetrofitManager.getInstance().getAccessToken();
    }
}
