.class public abstract Ls4/b0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll6/f;


# direct methods
.method public static a(Lcom/zykj/http/interceptor/NetworkInterceptor;Lcom/zykj/http/interceptor/HeadInterceptor;Lcom/zykj/study/provide/ClientCodeInterceptor;)Li9/a0;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/study/provide/OkHttpClientProvide;->INSTANCE:Lcom/zykj/study/provide/OkHttpClientProvide;

    .line 2
    .line 3
    invoke-virtual {v0, p0, p1, p2}, Lcom/zykj/study/provide/OkHttpClientProvide;->provideCommonOkHttpClient(Lcom/zykj/http/interceptor/NetworkInterceptor;Lcom/zykj/http/interceptor/HeadInterceptor;Lcom/zykj/study/provide/ClientCodeInterceptor;)Li9/a0;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-static {p0}, Ll6/e;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    check-cast p0, Li9/a0;

    .line 12
    .line 13
    return-object p0
.end method
