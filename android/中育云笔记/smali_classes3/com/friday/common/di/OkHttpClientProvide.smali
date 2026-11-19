.class public final Lcom/friday/common/di/OkHttpClientProvide;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x1
.end annotation


# static fields
.field public static final $stable:I = 0x0

.field public static final INSTANCE:Lcom/friday/common/di/OkHttpClientProvide;

.field private static final OkHTTP_CONNECT_TIME:J = 0x1eL

.field private static final OkHTTP_READ_TIME:J = 0x1eL

.field private static final OkHTTP_WRITE_TIME:J = 0x1eL


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/friday/common/di/OkHttpClientProvide;

    invoke-direct {v0}, Lcom/friday/common/di/OkHttpClientProvide;-><init>()V

    sput-object v0, Lcom/friday/common/di/OkHttpClientProvide;->INSTANCE:Lcom/friday/common/di/OkHttpClientProvide;

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
.method public final provideAesOkhttpClient(Lcom/zykj/http/interceptor/NetworkInterceptor;Lcom/friday/common/network/StudentSessionInterceptor;Lcom/zykj/http/interceptor/HeadInterceptor;Lcom/zykj/http/interceptor/RefreshTokenInterceptor;Lh2/e;Lh2/f;)Lje/v;
    .locals 4
    .annotation runtime Lcom/friday/common/di/AesOkhttpClient;
    .end annotation

    .line 1
    const-string v0, "networkInterceptor"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "studentSessionInterceptor"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "headInterceptor"

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
    const-string v0, "requestEncryptInterceptor"

    .line 22
    .line 23
    invoke-static {p5, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    const-string v0, "responseDecryptInterceptor"

    .line 27
    .line 28
    invoke-static {p6, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    new-instance v0, Lje/v$a;

    .line 32
    .line 33
    invoke-direct {v0}, Lje/v$a;-><init>()V

    .line 34
    .line 35
    .line 36
    sget-object v1, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 37
    .line 38
    const-wide/16 v2, 0x1e

    .line 39
    .line 40
    invoke-virtual {v0, v2, v3, v1}, Lje/v$a;->e(JLjava/util/concurrent/TimeUnit;)Lje/v$a;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0, v2, v3, v1}, Lje/v$a;->O(JLjava/util/concurrent/TimeUnit;)Lje/v$a;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0, v2, v3, v1}, Lje/v$a;->R(JLjava/util/concurrent/TimeUnit;)Lje/v$a;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0, p1}, Lje/v$a;->a(Lje/s;)Lje/v$a;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0, p2}, Lje/v$a;->a(Lje/s;)Lje/v$a;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0, p3}, Lje/v$a;->a(Lje/s;)Lje/v$a;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v0, p4}, Lje/v$a;->a(Lje/s;)Lje/v$a;

    .line 59
    .line 60
    .line 61
    invoke-virtual {v0, p5}, Lje/v$a;->a(Lje/s;)Lje/v$a;

    .line 62
    .line 63
    .line 64
    invoke-virtual {v0, p6}, Lje/v$a;->a(Lje/s;)Lje/v$a;

    .line 65
    .line 66
    .line 67
    invoke-virtual {v0}, Lje/v$a;->c()Lje/v;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    return-object p1
.end method

.method public final provideAuthTokenOkHttpClient(Lcom/zykj/http/interceptor/NetworkInterceptor;)Lje/v;
    .locals 4
    .annotation runtime Lcom/friday/common/di/AuthTokenOkHttpClient;
    .end annotation

    .line 1
    const-string v0, "networkInterceptor"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lje/v$a;

    .line 7
    .line 8
    invoke-direct {v0}, Lje/v$a;-><init>()V

    .line 9
    .line 10
    .line 11
    sget-object v1, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 12
    .line 13
    const-wide/16 v2, 0x1e

    .line 14
    .line 15
    invoke-virtual {v0, v2, v3, v1}, Lje/v$a;->e(JLjava/util/concurrent/TimeUnit;)Lje/v$a;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, v2, v3, v1}, Lje/v$a;->O(JLjava/util/concurrent/TimeUnit;)Lje/v$a;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, v2, v3, v1}, Lje/v$a;->R(JLjava/util/concurrent/TimeUnit;)Lje/v$a;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, p1}, Lje/v$a;->a(Lje/s;)Lje/v$a;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0}, Lje/v$a;->c()Lje/v;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    return-object p1
.end method

.method public final provideCommonOkHttpClient(Lcom/zykj/http/interceptor/NetworkInterceptor;)Lje/v;
    .locals 4
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
    new-instance v0, Lje/v$a;

    .line 7
    .line 8
    invoke-direct {v0}, Lje/v$a;-><init>()V

    .line 9
    .line 10
    .line 11
    sget-object v1, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 12
    .line 13
    const-wide/16 v2, 0x1e

    .line 14
    .line 15
    invoke-virtual {v0, v2, v3, v1}, Lje/v$a;->e(JLjava/util/concurrent/TimeUnit;)Lje/v$a;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, v2, v3, v1}, Lje/v$a;->O(JLjava/util/concurrent/TimeUnit;)Lje/v$a;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, v2, v3, v1}, Lje/v$a;->R(JLjava/util/concurrent/TimeUnit;)Lje/v$a;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, p1}, Lje/v$a;->a(Lje/s;)Lje/v$a;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0}, Lje/v$a;->c()Lje/v;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    return-object p1
.end method

.method public final provideEzyService(Lje/v;)Ld2/i;
    .locals 3
    .param p1    # Lje/v;
        .annotation runtime Lcom/friday/common/di/RefreshTokenOkHttpClient;
        .end annotation
    .end param

    .line 1
    const-string v0, "okHttpClient"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Ldf/d0$b;

    .line 7
    .line 8
    invoke-direct {v0}, Ldf/d0$b;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, p1}, Ldf/d0$b;->f(Lje/v;)Ldf/d0$b;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    const-string v0, "https://hagateway.zyai.cc"

    .line 16
    .line 17
    invoke-virtual {p1, v0}, Ldf/d0$b;->b(Ljava/lang/String;)Ldf/d0$b;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    invoke-static {}, Lff/k;->a()Lff/k;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-virtual {p1, v0}, Ldf/d0$b;->a(Ldf/h$a;)Ldf/d0$b;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    new-instance v0, Lcom/google/gson/GsonBuilder;

    .line 30
    .line 31
    invoke-direct {v0}, Lcom/google/gson/GsonBuilder;-><init>()V

    .line 32
    .line 33
    .line 34
    new-instance v1, Lh2/c;

    .line 35
    .line 36
    invoke-direct {v1}, Lh2/c;-><init>()V

    .line 37
    .line 38
    .line 39
    const-class v2, Ljava/util/Date;

    .line 40
    .line 41
    invoke-virtual {v0, v2, v1}, Lcom/google/gson/GsonBuilder;->registerTypeAdapter(Ljava/lang/reflect/Type;Ljava/lang/Object;)Lcom/google/gson/GsonBuilder;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    invoke-virtual {v0}, Lcom/google/gson/GsonBuilder;->create()Lcom/google/gson/Gson;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    invoke-static {v0}, Lef/a;->a(Lcom/google/gson/Gson;)Lef/a;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    invoke-virtual {p1, v0}, Ldf/d0$b;->a(Ldf/h$a;)Ldf/d0$b;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    invoke-virtual {p1}, Ldf/d0$b;->d()Ldf/d0;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    const-class v0, Ld2/i;

    .line 62
    .line 63
    invoke-virtual {p1, v0}, Ldf/d0;->b(Ljava/lang/Class;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    const-string v0, "create(...)"

    .line 68
    .line 69
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    check-cast p1, Ld2/i;

    .line 73
    .line 74
    return-object p1
.end method

.method public final provideHeaderBeanFlow()Lvd/l;
    .locals 8
    .annotation runtime Lcom/zykj/http/annotation/HeaderBeanFlow;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lvd/l;"
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/zykj/http/bean/HeaderBean;

    .line 2
    .line 3
    invoke-static {}, Lcom/blankj/utilcode/util/AppUtils;->getAppPackageName()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-static {}, Lcom/blankj/utilcode/util/AppUtils;->getAppVersionCode()I

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
    invoke-static {v0}, Lvd/v;->a(Ljava/lang/Object;)Lvd/l;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    return-object v0
.end method

.method public final provideRefreshTokenOkHttpClient(Lcom/zykj/http/interceptor/NetworkInterceptor;Lcom/friday/common/network/StudentSessionInterceptor;Lcom/zykj/http/interceptor/HeadInterceptor;Lcom/zykj/http/interceptor/RefreshTokenInterceptor;)Lje/v;
    .locals 4
    .annotation runtime Lcom/friday/common/di/RefreshTokenOkHttpClient;
    .end annotation

    .line 1
    const-string v0, "networkInterceptor"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "studentSessionInterceptor"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "headInterceptor"

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
    new-instance v0, Lje/v$a;

    .line 22
    .line 23
    invoke-direct {v0}, Lje/v$a;-><init>()V

    .line 24
    .line 25
    .line 26
    sget-object v1, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 27
    .line 28
    const-wide/16 v2, 0x1e

    .line 29
    .line 30
    invoke-virtual {v0, v2, v3, v1}, Lje/v$a;->e(JLjava/util/concurrent/TimeUnit;)Lje/v$a;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0, v2, v3, v1}, Lje/v$a;->O(JLjava/util/concurrent/TimeUnit;)Lje/v$a;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0, v2, v3, v1}, Lje/v$a;->R(JLjava/util/concurrent/TimeUnit;)Lje/v$a;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0, p1}, Lje/v$a;->a(Lje/s;)Lje/v$a;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0, p2}, Lje/v$a;->a(Lje/s;)Lje/v$a;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0, p3}, Lje/v$a;->a(Lje/s;)Lje/v$a;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0, p4}, Lje/v$a;->a(Lje/s;)Lje/v$a;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v0}, Lje/v$a;->c()Lje/v;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    return-object p1
.end method

.method public final provideResponseOkHttpClient(Lcom/zykj/http/interceptor/NetworkInterceptor;Lcom/friday/common/network/StudentSessionInterceptor;Lcom/zykj/http/interceptor/HeadInterceptor;)Lje/v;
    .locals 4
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
    const-string v0, "studentSessionInterceptor"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "headInterceptor"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    new-instance v0, Lje/v$a;

    .line 17
    .line 18
    invoke-direct {v0}, Lje/v$a;-><init>()V

    .line 19
    .line 20
    .line 21
    sget-object v1, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 22
    .line 23
    const-wide/16 v2, 0x1e

    .line 24
    .line 25
    invoke-virtual {v0, v2, v3, v1}, Lje/v$a;->e(JLjava/util/concurrent/TimeUnit;)Lje/v$a;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0, v2, v3, v1}, Lje/v$a;->O(JLjava/util/concurrent/TimeUnit;)Lje/v$a;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0, v2, v3, v1}, Lje/v$a;->R(JLjava/util/concurrent/TimeUnit;)Lje/v$a;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0, p1}, Lje/v$a;->a(Lje/s;)Lje/v$a;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0, p2}, Lje/v$a;->a(Lje/s;)Lje/v$a;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0, p3}, Lje/v$a;->a(Lje/s;)Lje/v$a;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0}, Lje/v$a;->c()Lje/v;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    return-object p1
.end method

.method public final provideUnauthorizedFlow()Lvd/k;
    .locals 3
    .annotation runtime Lcom/zykj/http/annotation/UnauthorizedFlow;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lvd/k;"
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x7

    .line 3
    const/4 v2, 0x0

    .line 4
    invoke-static {v2, v2, v0, v1, v0}, Lvd/q;->b(IILkotlinx/coroutines/channels/BufferOverflow;ILjava/lang/Object;)Lvd/k;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    return-object v0
.end method
