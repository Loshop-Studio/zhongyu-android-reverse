# 在线专栏 数据操作

方法签名保留 DEX 类型。每行列出方法内直接调用的存储或编解码接口。

| 实现 | 方法 | 操作 |
|---|---|---|
| [com/zykj/http/interceptor/CommonResponseInterceptor](../../../android/在线专栏/smali/com/zykj/http/interceptor/CommonResponseInterceptor.smali) | `parseJson(Ljava/lang/String;)Lcom/zykj/http/bean/CommonApiResp;` | 读取 JSON（Gson.fromJson） |
| [com/zykj/http/interceptor/CommonResponseInterceptor](../../../android/在线专栏/smali/com/zykj/http/interceptor/CommonResponseInterceptor.smali) | `reBuildResponse(Lcom/zykj/http/bean/CommonApiResp;)Lokhttp3/ResponseBody;` | 写入 JSON（Gson.toJson） |
| [com/zykj/http/interceptor/NetWorkResponseWithRefreshTokenInterceptor](../../../android/在线专栏/smali/com/zykj/http/interceptor/NetWorkResponseWithRefreshTokenInterceptor.smali) | `parseJson(Ljava/lang/String;)Lcom/zykj/http/bean/ApiResp;` | 读取 JSON（Gson.fromJson） |
| [com/zykj/http/interceptor/ResponseInterceptor](../../../android/在线专栏/smali/com/zykj/http/interceptor/ResponseInterceptor.smali) | `parseJson(Ljava/lang/String;)Lcom/zykj/http/bean/ApiResp;` | 读取 JSON（Gson.fromJson） |
| [com/zykj/http/interceptor/ResponseInterceptor](../../../android/在线专栏/smali/com/zykj/http/interceptor/ResponseInterceptor.smali) | `reBuildResponse(Lcom/zykj/http/bean/ApiResp;)Lokhttp3/ResponseBody;` | 写入 JSON（Gson.toJson） |
| [com/zykj/http/interceptor/ResponseWithRefreshTokenInterceptor](../../../android/在线专栏/smali/com/zykj/http/interceptor/ResponseWithRefreshTokenInterceptor.smali) | `parseJson(Ljava/lang/String;)Lcom/zykj/http/bean/ApiResp;` | 读取 JSON（Gson.fromJson） |
| [com/zykj/http/interceptor/ResponseWithRefreshTokenInterceptor](../../../android/在线专栏/smali/com/zykj/http/interceptor/ResponseWithRefreshTokenInterceptor.smali) | `reBuildResponse(Lcom/zykj/http/bean/ApiResp;)Lokhttp3/ResponseBody;` | 写入 JSON（Gson.toJson） |
| [com/zykj/subscriber/MainActivity$b](../../../android/在线专栏/smali/com/zykj/subscriber/MainActivity$b.smali) | `checkUrls(Ljava/lang/String;)Ljava/lang/String;` | 写入 JSON（Gson.toJson） |
| [com/zykj/subscriber/MainActivity$b](../../../android/在线专栏/smali/com/zykj/subscriber/MainActivity$b.smali) | `getUserInfo()Ljava/lang/String;` | 读取字符串偏好（SharedPreferences.getString） |
| [com/zykj/subscriber/MainActivity$e](../../../android/在线专栏/smali/com/zykj/subscriber/MainActivity$e.smali) | `a(Ljava/lang/String;)V` | 写入 JSON（Gson.toJson）、保存字符串偏好（SharedPreferences$Editor.putString） |
| [com/zykj/subscriber/MainActivity](../../../android/在线专栏/smali/com/zykj/subscriber/MainActivity.smali) | `a0()V` | 读取字符串偏好（SharedPreferences.getString） |
| [com/zykj/subscriber/update/c](../../../android/在线专栏/smali/com/zykj/subscriber/update/c.smali) | `i(Ljava/lang/String;I)V` | 读取 JSON（Gson.fromJson） |
