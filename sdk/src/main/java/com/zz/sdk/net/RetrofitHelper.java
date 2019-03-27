package com.zz.sdk.net;

import java.util.concurrent.TimeUnit;

import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.RequestBody;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * @author Zz 张立男
 * @Description RetrofitHelper
 * @date 2019/3/25 15:17
 * o(＞﹏＜)o
 */

public class RetrofitHelper {

    private static Retrofit retrofit;
    private static OkHttpClient client;
    private static final int TIMEOUT_READ = 20;
    private static final int TIMEOUT_CONNECTION = 20;


    private static OkHttpClient getClient() {
        if (client == null) {
            client = new OkHttpClient.Builder()
                    // 超时时间
                    .connectTimeout(TIMEOUT_CONNECTION, TimeUnit.SECONDS)
                    .readTimeout(TIMEOUT_READ, TimeUnit.SECONDS)
                    .writeTimeout(TIMEOUT_READ, TimeUnit.SECONDS)
                    // 失败重连
                    .retryOnConnectionFailure(true)
                    .build();
        }
        return client;
    }

    private static Retrofit getRetrofit(String url) {
        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(url)
                    .client(getClient())
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }

    /**
     * 生成请求的 API
     * @param tClass
     * @param url
     * @param <T>
     * @return
     */
    public static <T> T getApi(Class<T> tClass, String url) {
        return getRetrofit(url).create(tClass);
    }


    /**
     * 参数转为RequestBody
     *
     * @param value
     * @return
     */
    public static RequestBody toRequestBody(String value) {
        RequestBody body = RequestBody.create(MediaType.parse("text/plain"), value);
        return body;
    }
}
