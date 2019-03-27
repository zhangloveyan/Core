package com.zz.sdk.net;

import java.io.IOException;
import java.util.List;

import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/**
 * @author Zz 张立男
 * @Description ConfigInterceptor 配置拦截器
 * @date 2019/3/27 14:45
 * o(＞﹏＜)o
 */

public class ConfigInterceptor implements Interceptor {
    @Override
    public Response intercept(Chain chain) throws IOException {
        // 获取原有请求
        Request request = chain.request();
        HttpUrl oldUrl = request.url();

        List<String> urlhost = request.headers("urlhost");
        if (urlhost!=null&&!urlhost.isEmpty()){

        }

        Request.Builder builder = request.newBuilder();

        return null;
    }
}
