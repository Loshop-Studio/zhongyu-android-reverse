.class public abstract Ls4/c0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll6/f;


# direct methods
.method public static a(Lcom/zykj/http/interceptor/NetworkInterceptor;Lcom/zykj/http/interceptor/HeadInterceptor;Lcom/zykj/http/interceptor/GzipInterceptor;Lcom/zykj/study/provide/ResponseRefreshTokenInterceptor;Lcom/zykj/study/provide/ClientCodeInterceptor;)Li9/a0;
    .locals 6

    .line 1
    sget-object v0, Lcom/zykj/study/provide/OkHttpClientProvide;->INSTANCE:Lcom/zykj/study/provide/OkHttpClientProvide;

    .line 2
    .line 3
    move-object v1, p0

    .line 4
    move-object v2, p1

    .line 5
    move-object v3, p2

    .line 6
    move-object v4, p3

    .line 7
    move-object v5, p4

    .line 8
    invoke-virtual/range {v0 .. v5}, Lcom/zykj/study/provide/OkHttpClientProvide;->provideCommonResponseOkHttpClient(Lcom/zykj/http/interceptor/NetworkInterceptor;Lcom/zykj/http/interceptor/HeadInterceptor;Lcom/zykj/http/interceptor/GzipInterceptor;Lcom/zykj/study/provide/ResponseRefreshTokenInterceptor;Lcom/zykj/study/provide/ClientCodeInterceptor;)Li9/a0;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-static {p0}, Ll6/e;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    check-cast p0, Li9/a0;

    .line 17
    .line 18
    return-object p0
.end method
