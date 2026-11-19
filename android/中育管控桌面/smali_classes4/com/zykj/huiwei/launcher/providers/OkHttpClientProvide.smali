.class public final Lcom/zykj/huiwei/launcher/providers/OkHttpClientProvide;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x1
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004H\u0007\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0015\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0008H\u0007\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000cH\u0007\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u001f\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000c2\u0006\u0010\u0012\u001a\u00020\u0011H\u0007\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000cH\u0007\u00a2\u0006\u0004\u0008\u0015\u0010\u0010J/\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000c2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u0018H\u0007\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ/\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000c2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u0018H\u0007\u00a2\u0006\u0004\u0008\u001c\u0010\u001b\u00a8\u0006\u001d"
    }
    d2 = {
        "Lcom/zykj/huiwei/launcher/providers/OkHttpClientProvide;",
        "",
        "<init>",
        "()V",
        "Lkotlinx/coroutines/flow/MutableSharedFlow;",
        "Lcom/zykj/lib/error/code/ErrorCode;",
        "provideUnauthorizedFlow",
        "()Lkotlinx/coroutines/flow/MutableSharedFlow;",
        "Lkotlinx/coroutines/flow/MutableStateFlow;",
        "Lcom/zykj/http/bean/HeaderBean;",
        "provideHeaderBeanFlow",
        "()Lkotlinx/coroutines/flow/MutableStateFlow;",
        "Lcom/zykj/http/interceptor/NetworkInterceptor;",
        "networkInterceptor",
        "Lf5/a0;",
        "provideFileOkHttpClient",
        "(Lcom/zykj/http/interceptor/NetworkInterceptor;)Lf5/a0;",
        "Lcom/zykj/http/interceptor/GzipInterceptor;",
        "gzipRequestInterceptor",
        "provideAuthOkHttpClient",
        "(Lcom/zykj/http/interceptor/NetworkInterceptor;Lcom/zykj/http/interceptor/GzipInterceptor;)Lf5/a0;",
        "provideCommonOkHttpClient",
        "Lcom/zykj/http/interceptor/HeadInterceptor;",
        "headInterceptor",
        "Lcom/zykj/http/interceptor/RefreshTokenInterceptor;",
        "responseInterceptor",
        "provideResponseOkHttpClient",
        "(Lcom/zykj/http/interceptor/NetworkInterceptor;Lcom/zykj/http/interceptor/HeadInterceptor;Lcom/zykj/http/interceptor/GzipInterceptor;Lcom/zykj/http/interceptor/RefreshTokenInterceptor;)Lf5/a0;",
        "provideCommonResponseOkHttpClient",
        "app_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final $stable:I

.field public static final INSTANCE:Lcom/zykj/huiwei/launcher/providers/OkHttpClientProvide;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/zykj/huiwei/launcher/providers/OkHttpClientProvide;

    invoke-direct {v0}, Lcom/zykj/huiwei/launcher/providers/OkHttpClientProvide;-><init>()V

    sput-object v0, Lcom/zykj/huiwei/launcher/providers/OkHttpClientProvide;->INSTANCE:Lcom/zykj/huiwei/launcher/providers/OkHttpClientProvide;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final provideAuthOkHttpClient(Lcom/zykj/http/interceptor/NetworkInterceptor;Lcom/zykj/http/interceptor/GzipInterceptor;)Lf5/a0;
    .locals 1
    .annotation runtime Lcom/zykj/huiwei/launcher/providers/AuthOkHttpClient;
    .end annotation

    .line 1
    const-string v0, "networkInterceptor"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "gzipRequestInterceptor"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    new-instance v0, Lf5/a0$a;

    .line 12
    .line 13
    invoke-direct {v0}, Lf5/a0$a;-><init>()V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, p1}, Lf5/a0$a;->a(Lf5/x;)Lf5/a0$a;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, p2}, Lf5/a0$a;->b(Lf5/x;)Lf5/a0$a;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0}, Lf5/a0$a;->c()Lf5/a0;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    return-object p1
.end method

.method public final provideCommonOkHttpClient(Lcom/zykj/http/interceptor/NetworkInterceptor;)Lf5/a0;
    .locals 1
    .annotation runtime Lcom/zykj/http/annotation/CommonOkHttpClient;
    .end annotation

    .line 1
    const-string v0, "networkInterceptor"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lf5/a0$a;

    .line 7
    .line 8
    invoke-direct {v0}, Lf5/a0$a;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, p1}, Lf5/a0$a;->a(Lf5/x;)Lf5/a0$a;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0}, Lf5/a0$a;->c()Lf5/a0;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    return-object p1
.end method

.method public final provideCommonResponseOkHttpClient(Lcom/zykj/http/interceptor/NetworkInterceptor;Lcom/zykj/http/interceptor/HeadInterceptor;Lcom/zykj/http/interceptor/GzipInterceptor;Lcom/zykj/http/interceptor/RefreshTokenInterceptor;)Lf5/a0;
    .locals 1
    .annotation runtime Lcom/zykj/http/annotation/CommonResponseOkHttpClient;
    .end annotation

    .line 1
    const-string v0, "networkInterceptor"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "headInterceptor"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "gzipRequestInterceptor"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "responseInterceptor"

    .line 17
    .line 18
    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    new-instance v0, Lf5/a0$a;

    .line 22
    .line 23
    invoke-direct {v0}, Lf5/a0$a;-><init>()V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, p1}, Lf5/a0$a;->a(Lf5/x;)Lf5/a0$a;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0, p2}, Lf5/a0$a;->a(Lf5/x;)Lf5/a0$a;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0, p4}, Lf5/a0$a;->a(Lf5/x;)Lf5/a0$a;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0, p3}, Lf5/a0$a;->a(Lf5/x;)Lf5/a0$a;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0}, Lf5/a0$a;->c()Lf5/a0;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    return-object p1
.end method

.method public final provideFileOkHttpClient(Lcom/zykj/http/interceptor/NetworkInterceptor;)Lf5/a0;
    .locals 3

    .line 1
    const-string v0, "networkInterceptor"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lf5/a0$a;

    .line 7
    .line 8
    invoke-direct {v0}, Lf5/a0$a;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, p1}, Lf5/a0$a;->a(Lf5/x;)Lf5/a0$a;

    .line 12
    .line 13
    .line 14
    sget-object p1, Ljava/util/concurrent/TimeUnit;->MINUTES:Ljava/util/concurrent/TimeUnit;

    .line 15
    .line 16
    const-wide/16 v1, 0x1

    .line 17
    .line 18
    invoke-virtual {v0, v1, v2, p1}, Lf5/a0$a;->U(JLjava/util/concurrent/TimeUnit;)Lf5/a0$a;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-virtual {v0, v1, v2, p1}, Lf5/a0$a;->R(JLjava/util/concurrent/TimeUnit;)Lf5/a0$a;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-virtual {p1}, Lf5/a0$a;->c()Lf5/a0;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    return-object p1
.end method

.method public final provideHeaderBeanFlow()Lkotlinx/coroutines/flow/MutableStateFlow;
    .locals 8
    .annotation runtime Lcom/zykj/http/annotation/HeaderBeanFlow;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/MutableStateFlow<",
            "Lcom/zykj/http/bean/HeaderBean;",
            ">;"
        }
    .end annotation

    .annotation runtime Ljavax/inject/Singleton;
    .end annotation

    .line 1
    new-instance v0, Lcom/zykj/http/bean/HeaderBean;

    .line 2
    .line 3
    invoke-static {}, Lcom/blankj/utilcode/util/d;->d()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-static {}, Lcom/blankj/utilcode/util/d;->e()I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    const/16 v6, 0x1c

    .line 16
    .line 17
    const/4 v7, 0x0

    .line 18
    const/4 v3, 0x0

    .line 19
    const/4 v4, 0x0

    .line 20
    const/4 v5, 0x0

    .line 21
    invoke-direct/range {v0 .. v7}, Lcom/zykj/http/bean/HeaderBean;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 22
    .line 23
    .line 24
    invoke-static {v0}, Lkotlinx/coroutines/flow/StateFlowKt;->MutableStateFlow(Ljava/lang/Object;)Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    return-object v0
.end method

.method public final provideResponseOkHttpClient(Lcom/zykj/http/interceptor/NetworkInterceptor;Lcom/zykj/http/interceptor/HeadInterceptor;Lcom/zykj/http/interceptor/GzipInterceptor;Lcom/zykj/http/interceptor/RefreshTokenInterceptor;)Lf5/a0;
    .locals 1
    .annotation runtime Lcom/zykj/http/annotation/ResponseOkHttpClient;
    .end annotation

    .line 1
    const-string v0, "networkInterceptor"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "headInterceptor"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "gzipRequestInterceptor"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "responseInterceptor"

    .line 17
    .line 18
    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    new-instance v0, Lf5/a0$a;

    .line 22
    .line 23
    invoke-direct {v0}, Lf5/a0$a;-><init>()V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, p1}, Lf5/a0$a;->a(Lf5/x;)Lf5/a0$a;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0, p2}, Lf5/a0$a;->a(Lf5/x;)Lf5/a0$a;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0, p3}, Lf5/a0$a;->a(Lf5/x;)Lf5/a0$a;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0, p4}, Lf5/a0$a;->a(Lf5/x;)Lf5/a0$a;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0}, Lf5/a0$a;->c()Lf5/a0;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    return-object p1
.end method

.method public final provideUnauthorizedFlow()Lkotlinx/coroutines/flow/MutableSharedFlow;
    .locals 3
    .annotation runtime Lcom/zykj/http/annotation/UnauthorizedFlow;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/MutableSharedFlow<",
            "Lcom/zykj/lib/error/code/ErrorCode;",
            ">;"
        }
    .end annotation

    .annotation runtime Ljavax/inject/Singleton;
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x7

    .line 3
    const/4 v2, 0x0

    .line 4
    invoke-static {v2, v2, v0, v1, v0}, Lkotlinx/coroutines/flow/SharedFlowKt;->MutableSharedFlow$default(IILkotlinx/coroutines/channels/BufferOverflow;ILjava/lang/Object;)Lkotlinx/coroutines/flow/MutableSharedFlow;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    return-object v0
.end method
