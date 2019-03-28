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

    private static volatile Retrofit retrofit;
    private static volatile OkHttpClient client;
    private int TIMEOUT_READ_OR_WRITE = 20;
    private int TIMEOUT_CONNECTION = 20;
    private String baseUrl;
    private static volatile RetrofitHelper helper;
    final static String URL = "urlHost";
    /**
     * 多 baseHost 的请求 key
     */
    public final static String URL_HOST = URL + ":";

    private RetrofitHelper() {
    }

    /**
     * 单例生成 client
     *
     * @return
     */
    private OkHttpClient getClient() {
        if (client == null) {
            synchronized (RetrofitHelper.class) {
                if (client == null) {
                    client = new OkHttpClient.Builder()
                            // 超时时间
                            .connectTimeout(TIMEOUT_CONNECTION, TimeUnit.SECONDS)
                            .readTimeout(TIMEOUT_READ_OR_WRITE, TimeUnit.SECONDS)
                            .writeTimeout(TIMEOUT_READ_OR_WRITE, TimeUnit.SECONDS)
                            .addInterceptor(new UrlHostInterceptor())
                            // 失败重连
                            .retryOnConnectionFailure(true)
                            .build();
                }
            }
        }
        return client;
    }

    /**
     * 单例生成 retrofit
     *
     * @return
     */

    private Retrofit getRetrofitInstance() {
        if (retrofit == null) {
            synchronized (RetrofitHelper.class) {
                if (retrofit == null) {
                    retrofit = new Retrofit.Builder()
                            .baseUrl(baseUrl)
                            .client(getClient())
                            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                            .addConverterFactory(GsonConverterFactory.create())
                            .build();
                }
            }
        }
        return retrofit;
    }

    /**
     * 生成请求的 API
     *
     * @param tClass
     * @param <T>
     * @return
     */
    public static <T> T getApi(Class<T> tClass) {
        if (retrofit == null) {
            throw new NullPointerException("retrofit is null,please init on application");
        }
        return retrofit.create(tClass);
    }

    /**
     * 单例生成 helper
     *
     * @return
     */
    public static RetrofitHelper getInstance() {
        if (helper == null) {
            synchronized (RetrofitHelper.class) {
                if (helper == null) {
                    helper = new RetrofitHelper();
                }
            }
        }
        return helper;
    }

    /**
     * 设置 baseUrl
     *
     * @param baseUrl
     * @return
     */
    public RetrofitHelper baseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
        return helper;
    }

    /**
     * 设置读取超时时间
     *
     * @param readOrWriteTimeOut
     * @return
     */
    public RetrofitHelper readOrWriteTimeOut(int readOrWriteTimeOut) {
        TIMEOUT_READ_OR_WRITE = readOrWriteTimeOut;
        return helper;
    }

    /**
     * 设置连接超时时间
     *
     * @param connectionTimeOut
     * @return
     */
    public RetrofitHelper connectionTimeOut(int connectionTimeOut) {
        TIMEOUT_CONNECTION = connectionTimeOut;
        return helper;
    }

    /**
     * 初始化 retrofit
     */
    public void init() {
        getRetrofitInstance();
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
