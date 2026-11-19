.class public abstract Li7/d;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Lcom/zykj/http/interceptor/RefreshTokenInterceptor;Lj7/a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/http/interceptor/RefreshTokenInterceptor;->refreshRepository:Lj7/a;

    .line 2
    .line 3
    return-void
.end method

.method public static b(Lcom/zykj/http/interceptor/RefreshTokenInterceptor;Lkotlinx/coroutines/flow/MutableSharedFlow;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/http/interceptor/RefreshTokenInterceptor;->unauthorizedFlow:Lkotlinx/coroutines/flow/MutableSharedFlow;

    .line 2
    .line 3
    return-void
.end method
