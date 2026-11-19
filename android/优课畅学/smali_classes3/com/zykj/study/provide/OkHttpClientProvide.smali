.class public final Lcom/zykj/study/provide/OkHttpClientProvide;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x1
.end annotation


# static fields
.field public static final $stable:I

.field public static final INSTANCE:Lcom/zykj/study/provide/OkHttpClientProvide;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/zykj/study/provide/OkHttpClientProvide;

    invoke-direct {v0}, Lcom/zykj/study/provide/OkHttpClientProvide;-><init>()V

    sput-object v0, Lcom/zykj/study/provide/OkHttpClientProvide;->INSTANCE:Lcom/zykj/study/provide/OkHttpClientProvide;

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
.method public final provideAuthOkHttpClient(Lcom/zykj/http/interceptor/NetworkInterceptor;Lcom/zykj/http/interceptor/GzipInterceptor;)Li9/a0;
    .locals 1
    .annotation runtime Lcom/zykj/study/provide/AuthOkHttpClient;
    .end annotation

    .annotation runtime Ljavax/inject/Singleton;
    .end annotation

    .line 1
    const-string v0, "networkInterceptor"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "gzipRequestInterceptor"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    new-instance v0, Li9/a0$a;

    .line 12
    .line 13
    invoke-direct {v0}, Li9/a0$a;-><init>()V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, p1}, Li9/a0$a;->a(Li9/x;)Li9/a0$a;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, p2}, Li9/a0$a;->b(Li9/x;)Li9/a0$a;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0}, Li9/a0$a;->c()Li9/a0;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    return-object p1
.end method

.method public final provideCommonOkHttpClient(Lcom/zykj/http/interceptor/NetworkInterceptor;Lcom/zykj/http/interceptor/HeadInterceptor;Lcom/zykj/study/provide/ClientCodeInterceptor;)Li9/a0;
    .locals 1
    .annotation runtime Lcom/zykj/http/annotation/CommonOkHttpClient;
    .end annotation

    .line 1
    const-string v0, "networkInterceptor"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "headInterceptor"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "clientCodeInterceptor"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    new-instance v0, Li9/a0$a;

    .line 17
    .line 18
    invoke-direct {v0}, Li9/a0$a;-><init>()V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, p1}, Li9/a0$a;->a(Li9/x;)Li9/a0$a;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, p2}, Li9/a0$a;->a(Li9/x;)Li9/a0$a;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, p3}, Li9/a0$a;->a(Li9/x;)Li9/a0$a;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0}, Li9/a0$a;->c()Li9/a0;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    return-object p1
.end method

.method public final provideCommonResponseOkHttpClient(Lcom/zykj/http/interceptor/NetworkInterceptor;Lcom/zykj/http/interceptor/HeadInterceptor;Lcom/zykj/http/interceptor/GzipInterceptor;Lcom/zykj/study/provide/ResponseRefreshTokenInterceptor;Lcom/zykj/study/provide/ClientCodeInterceptor;)Li9/a0;
    .locals 1
    .annotation runtime Lcom/zykj/http/annotation/CommonResponseOkHttpClient;
    .end annotation

    .line 1
    const-string v0, "networkInterceptor"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "headInterceptor"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "gzipRequestInterceptor"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "responseInterceptor"

    .line 17
    .line 18
    invoke-static {p4, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const-string v0, "clientCodeInterceptor"

    .line 22
    .line 23
    invoke-static {p5, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    new-instance v0, Li9/a0$a;

    .line 27
    .line 28
    invoke-direct {v0}, Li9/a0$a;-><init>()V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0, p1}, Li9/a0$a;->a(Li9/x;)Li9/a0$a;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0, p2}, Li9/a0$a;->a(Li9/x;)Li9/a0$a;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0, p4}, Li9/a0$a;->a(Li9/x;)Li9/a0$a;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0, p3}, Li9/a0$a;->b(Li9/x;)Li9/a0$a;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0, p5}, Li9/a0$a;->a(Li9/x;)Li9/a0$a;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0}, Li9/a0$a;->c()Li9/a0;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    return-object p1
.end method

.method public final provideHeaderBeanFlow()Ll8/h;
    .locals 8
    .annotation runtime Lcom/zykj/http/annotation/HeaderBeanFlow;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ll8/h;"
        }
    .end annotation

    .annotation runtime Ljavax/inject/Singleton;
    .end annotation

    .line 1
    new-instance v0, Lcom/zykj/http/bean/HeaderBean;

    .line 2
    .line 3
    invoke-static {}, Lcom/blankj/utilcode/util/d;->b()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-static {}, Lcom/blankj/utilcode/util/d;->c()I

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
    invoke-direct/range {v0 .. v7}, Lcom/zykj/http/bean/HeaderBean;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/n;)V

    .line 22
    .line 23
    .line 24
    invoke-static {v0}, Ll8/r;->a(Ljava/lang/Object;)Ll8/h;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    return-object v0
.end method

.method public final provideLessonDeauthorizedFlow()Ll8/g;
    .locals 3
    .annotation runtime Lcom/zykj/study/provide/LessonDeauthorizedFlow;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ll8/g;"
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
    invoke-static {v2, v2, v0, v1, v0}, Ll8/m;->b(IILkotlinx/coroutines/channels/BufferOverflow;ILjava/lang/Object;)Ll8/g;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    return-object v0
.end method

.method public final provideRefreshTokenOkHttpClient(Lcom/zykj/http/interceptor/NetworkInterceptor;Lcom/zykj/http/interceptor/HeadInterceptor;Lcom/zykj/study/provide/ClientCodeInterceptor;Lcom/zykj/http/interceptor/RefreshTokenInterceptor;)Li9/a0;
    .locals 4
    .annotation runtime Lcom/zykj/study/provide/RefreshTokenOkHttpClient;
    .end annotation

    .line 1
    const-string v0, "networkInterceptor"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "headInterceptor"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "clientCodeInterceptor"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "responseInterceptor"

    .line 17
    .line 18
    invoke-static {p4, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    new-instance v0, Li9/a0$a;

    .line 22
    .line 23
    invoke-direct {v0}, Li9/a0$a;-><init>()V

    .line 24
    .line 25
    .line 26
    sget-object v1, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 27
    .line 28
    const-wide/16 v2, 0x1e

    .line 29
    .line 30
    invoke-virtual {v0, v2, v3, v1}, Li9/a0$a;->e(JLjava/util/concurrent/TimeUnit;)Li9/a0$a;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0, v2, v3, v1}, Li9/a0$a;->R(JLjava/util/concurrent/TimeUnit;)Li9/a0$a;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0, v2, v3, v1}, Li9/a0$a;->U(JLjava/util/concurrent/TimeUnit;)Li9/a0$a;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0, p1}, Li9/a0$a;->a(Li9/x;)Li9/a0$a;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0, p2}, Li9/a0$a;->a(Li9/x;)Li9/a0$a;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0, p3}, Li9/a0$a;->a(Li9/x;)Li9/a0$a;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0, p4}, Li9/a0$a;->a(Li9/x;)Li9/a0$a;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v0}, Li9/a0$a;->c()Li9/a0;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    return-object p1
.end method

.method public final provideResponseOkHttpClient(Lcom/zykj/http/interceptor/NetworkInterceptor;Lcom/zykj/http/interceptor/HeadInterceptor;Lcom/zykj/http/interceptor/GzipInterceptor;Lcom/zykj/study/provide/ClientCodeInterceptor;)Li9/a0;
    .locals 1
    .annotation runtime Lcom/zykj/http/annotation/ResponseOkHttpClient;
    .end annotation

    .line 1
    const-string v0, "networkInterceptor"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "headInterceptor"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "gzipRequestInterceptor"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "clientCodeInterceptor"

    .line 17
    .line 18
    invoke-static {p4, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    new-instance v0, Li9/a0$a;

    .line 22
    .line 23
    invoke-direct {v0}, Li9/a0$a;-><init>()V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, p1}, Li9/a0$a;->a(Li9/x;)Li9/a0$a;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0, p2}, Li9/a0$a;->a(Li9/x;)Li9/a0$a;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0, p3}, Li9/a0$a;->b(Li9/x;)Li9/a0$a;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0, p4}, Li9/a0$a;->a(Li9/x;)Li9/a0$a;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0}, Li9/a0$a;->c()Li9/a0;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    return-object p1
.end method

.method public final provideUnauthorizedFlow()Ll8/g;
    .locals 3
    .annotation runtime Lcom/zykj/http/annotation/UnauthorizedFlow;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ll8/g;"
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
    invoke-static {v2, v2, v0, v1, v0}, Ll8/m;->b(IILkotlinx/coroutines/channels/BufferOverflow;ILjava/lang/Object;)Ll8/g;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    return-object v0
.end method
