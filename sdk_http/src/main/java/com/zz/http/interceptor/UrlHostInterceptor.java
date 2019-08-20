package com.zz.http.interceptor;

import com.zz.http.CheckUtils;
import com.zz.http.RetrofitHelper;

import java.io.IOException;
import java.util.List;

import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/**
 * @author Zz 张立男
 * @Description UrlHostInterceptor 地址拦截器
 * @date 2019/3/27 14:45
 * o(＞﹏＜)o
 */

public class UrlHostInterceptor implements Interceptor {
    @Override
    public Response intercept(Chain chain) throws IOException {
        // 获取原有请求
        Request request = chain.request();
        // 取出请求需要拦截的请求头
        List<String> urlList = request.headers(RetrofitHelper.URL);

        if (!urlList.isEmpty()) {
            // 取出请求头中需要更换的地址
            String urlName = urlList.get(0);
            // 转换请求
            HttpUrl baseUrl = HttpUrl.parse(CheckUtils.checkNotNull(urlName, "获取更换的请求头地址为空"));
            CheckUtils.checkNotNull(baseUrl, "请求头地址转换异常");
            // 构建新的请求
            Request.Builder builder = request.newBuilder();
            // 移除使用的拦截 header
            builder.removeHeader(RetrofitHelper.URL);
            HttpUrl oldUrl = request.url();
            HttpUrl newHttpUrl = oldUrl.newBuilder()
                    .scheme(baseUrl.scheme())
                    .host(baseUrl.host())
                    .port(baseUrl.port())
                    .build();

            Request newRequest = builder.url(newHttpUrl).build();
            return chain.proceed(newRequest);
        }
        return chain.proceed(request);
    }
}
