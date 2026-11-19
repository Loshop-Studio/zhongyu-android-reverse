# 网阅联考 数据操作

方法签名保留 DEX 类型。每行列出方法内直接调用的存储或编解码接口。

| 实现 | 方法 | 操作 |
|---|---|---|
| [com/zykj/http/interceptor/CommonResponseInterceptor](../../../android/网阅联考/smali_classes2/com/zykj/http/interceptor/CommonResponseInterceptor.smali) | `parseJson(Ljava/lang/String;)Lcom/zykj/http/bean/CommonApiResp;` | 读取 JSON（Gson.fromJson） |
| [com/zykj/http/interceptor/CommonResponseInterceptor](../../../android/网阅联考/smali_classes2/com/zykj/http/interceptor/CommonResponseInterceptor.smali) | `reBuildResponse(Lcom/zykj/http/bean/CommonApiResp;)Lr2/b0;` | 写入 JSON（Gson.toJson） |
| [com/zykj/http/interceptor/NetWorkResponseWithRefreshTokenInterceptor](../../../android/网阅联考/smali_classes2/com/zykj/http/interceptor/NetWorkResponseWithRefreshTokenInterceptor.smali) | `parseJson(Ljava/lang/String;)Lcom/zykj/http/bean/ApiResp;` | 读取 JSON（Gson.fromJson） |
| [com/zykj/http/interceptor/ResponseInterceptor](../../../android/网阅联考/smali_classes2/com/zykj/http/interceptor/ResponseInterceptor.smali) | `parseJson(Ljava/lang/String;)Lcom/zykj/http/bean/ApiResp;` | 读取 JSON（Gson.fromJson） |
| [com/zykj/http/interceptor/ResponseInterceptor](../../../android/网阅联考/smali_classes2/com/zykj/http/interceptor/ResponseInterceptor.smali) | `reBuildResponse(Lcom/zykj/http/bean/ApiResp;)Lr2/b0;` | 写入 JSON（Gson.toJson） |
| [com/zykj/http/interceptor/ResponseWithRefreshTokenInterceptor](../../../android/网阅联考/smali_classes2/com/zykj/http/interceptor/ResponseWithRefreshTokenInterceptor.smali) | `parseJson(Ljava/lang/String;)Lcom/zykj/http/bean/ApiResp;` | 读取 JSON（Gson.fromJson） |
| [com/zykj/http/interceptor/ResponseWithRefreshTokenInterceptor](../../../android/网阅联考/smali_classes2/com/zykj/http/interceptor/ResponseWithRefreshTokenInterceptor.smali) | `reBuildResponse(Lcom/zykj/http/bean/ApiResp;)Lr2/b0;` | 写入 JSON（Gson.toJson） |
