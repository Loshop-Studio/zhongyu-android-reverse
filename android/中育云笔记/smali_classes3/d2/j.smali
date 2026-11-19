.class public abstract Ld2/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgc/f;


# direct methods
.method public static a(Lcom/zykj/http/interceptor/NetworkInterceptor;Lcom/friday/common/network/StudentSessionInterceptor;Lcom/zykj/http/interceptor/HeadInterceptor;Lcom/zykj/http/interceptor/RefreshTokenInterceptor;Lh2/e;Lh2/f;)Lje/v;
    .locals 7

    .line 1
    sget-object v0, Lcom/friday/common/di/OkHttpClientProvide;->INSTANCE:Lcom/friday/common/di/OkHttpClientProvide;

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
    move-object v6, p5

    .line 9
    invoke-virtual/range {v0 .. v6}, Lcom/friday/common/di/OkHttpClientProvide;->provideAesOkhttpClient(Lcom/zykj/http/interceptor/NetworkInterceptor;Lcom/friday/common/network/StudentSessionInterceptor;Lcom/zykj/http/interceptor/HeadInterceptor;Lcom/zykj/http/interceptor/RefreshTokenInterceptor;Lh2/e;Lh2/f;)Lje/v;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-static {p0}, Lgc/e;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    check-cast p0, Lje/v;

    .line 18
    .line 19
    return-object p0
.end method
