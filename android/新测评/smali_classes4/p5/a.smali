.class public final Lp5/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lp5/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lp5/a;

    .line 2
    .line 3
    invoke-direct {v0}, Lp5/a;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lp5/a;->a:Lp5/a;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final a()Lkotlinx/coroutines/flow/MutableStateFlow;
    .locals 8

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

.method public final b(Lcom/zykj/http/interceptor/NetworkInterceptor;Lcom/zykj/http/interceptor/HeadInterceptor;Lcom/zykj/http/interceptor/RefreshTokenInterceptor;)La9/v;
    .locals 4

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
    const-string v0, "responseInterceptor"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    new-instance v0, La9/v$a;

    .line 17
    .line 18
    invoke-direct {v0}, La9/v$a;-><init>()V

    .line 19
    .line 20
    .line 21
    sget-object v1, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 22
    .line 23
    const-wide/16 v2, 0x1e

    .line 24
    .line 25
    invoke-virtual {v0, v2, v3, v1}, La9/v$a;->e(JLjava/util/concurrent/TimeUnit;)La9/v$a;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0, v2, v3, v1}, La9/v$a;->O(JLjava/util/concurrent/TimeUnit;)La9/v$a;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0, v2, v3, v1}, La9/v$a;->Q(JLjava/util/concurrent/TimeUnit;)La9/v$a;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0, p1}, La9/v$a;->a(La9/s;)La9/v$a;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0, p2}, La9/v$a;->a(La9/s;)La9/v$a;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0, p3}, La9/v$a;->a(La9/s;)La9/v$a;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0}, La9/v$a;->c()La9/v;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    return-object p1
.end method

.method public final c(La9/v;)Lr9/d0;
    .locals 3

    .line 1
    const-string v0, "okHttpClient"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lr9/d0$b;

    .line 7
    .line 8
    invoke-direct {v0}, Lr9/d0$b;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, p1}, Lr9/d0$b;->f(La9/v;)Lr9/d0$b;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    const-string v0, "https://hagateway.zyai.cc"

    .line 16
    .line 17
    invoke-virtual {p1, v0}, Lr9/d0$b;->c(Ljava/lang/String;)Lr9/d0$b;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    invoke-static {}, Lt9/k;->f()Lt9/k;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-virtual {p1, v0}, Lr9/d0$b;->a(Lr9/h$a;)Lr9/d0$b;

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
    new-instance v1, Lp5/i;

    .line 35
    .line 36
    invoke-direct {v1}, Lp5/i;-><init>()V

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
    invoke-static {v0}, Ls9/a;->f(Lcom/google/gson/Gson;)Ls9/a;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    invoke-virtual {p1, v0}, Lr9/d0$b;->a(Lr9/h$a;)Lr9/d0$b;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    invoke-virtual {p1}, Lr9/d0$b;->d()Lr9/d0;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    const-string v0, "build(...)"

    .line 62
    .line 63
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    return-object p1
.end method

.method public final d(Lr9/d0;)Lp5/j;
    .locals 1

    .line 1
    const-string v0, "retrofit"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-class v0, Lp5/j;

    .line 7
    .line 8
    invoke-virtual {p1, v0}, Lr9/d0;->b(Ljava/lang/Class;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    const-string v0, "create(...)"

    .line 13
    .line 14
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    check-cast p1, Lp5/j;

    .line 18
    .line 19
    return-object p1
.end method

.method public final e()Lkotlinx/coroutines/flow/MutableSharedFlow;
    .locals 3

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

.method public final f()Lkotlinx/coroutines/flow/MutableStateFlow;
    .locals 1

    .line 1
    new-instance v0, Lcom/zykj/message/server/bean/UserInfo;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/zykj/message/server/bean/UserInfo;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {v0}, Lkotlinx/coroutines/flow/StateFlowKt;->MutableStateFlow(Ljava/lang/Object;)Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    return-object v0
.end method

.method public final g(Lr9/d0;)Lh7/b;
    .locals 1

    .line 1
    const-string v0, "retrofit"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-class v0, Lh7/b;

    .line 7
    .line 8
    invoke-virtual {p1, v0}, Lr9/d0;->b(Ljava/lang/Class;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    const-string v0, "create(...)"

    .line 13
    .line 14
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    check-cast p1, Lh7/b;

    .line 18
    .line 19
    return-object p1
.end method
