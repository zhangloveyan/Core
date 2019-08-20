# 开发库
## 1. sdk_mvp 架构库

封装 mvp 模式代码、提供 RxBus、RxHelper 两个常用类。

**BaseMVPActivity：** 基础 activity 类，使用时所有 activity 都要继承此类，并将 presenter 的泛型填入，实现抽象方法即可。此类只有限制竖屏显示和去掉标题栏两个功能。

**BasePresenter：** 基础 presenter 类，使用时所有 presenter 都要继承此类，并将 model 和 activity 的泛型填入，实现抽象方法即可。onStart() 方法
为此类开始方法。

**IBaseModel、IBaseView：** 两个抽象接口，暂未使用。

## 2. sdk_http 网络请求库

封装 retrofit 请求代码，唯一的亮点是通过 header 进行 base 地址的切换。

* 1. 使用：
在 application 中初始化，通过构建者模式进行参数设置。
``` 
RetrofitHelper.getInstance()
                .baseUrl(API.HOST)
                .readOrWriteTimeOut(100)
                .debug(BuildConfig.DEBUG)
                .init(this);
```
* 2. 多 base 地址使用：在 @Headers 注解中添加 RetrofitHelper.URL_HOST，在拼上要更改的 url
```
@Headers(RetrofitHelper.URL_HOST + HOST_DOUBAN)
```
