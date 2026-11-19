.class public final Lk6/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lk6/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lk6/a;

    .line 2
    .line 3
    invoke-direct {v0}, Lk6/a;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lk6/a;->a:Lk6/a;

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
.method public final a()Lcom/zykj/http/bean/HeaderLiveData;
    .locals 1

    .line 1
    new-instance v0, Lcom/zykj/http/bean/HeaderLiveData;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/zykj/http/bean/HeaderLiveData;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public final b(Lc9/y;)Lk6/g;
    .locals 1

    .line 1
    const-string v0, "retrofit"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-class v0, Lk6/g;

    .line 7
    .line 8
    invoke-virtual {p1, v0}, Lc9/y;->b(Ljava/lang/Class;)Ljava/lang/Object;

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
    check-cast p1, Lk6/g;

    .line 18
    .line 19
    return-object p1
.end method

.method public final c(Lcom/zykj/http/interceptor/NetworkInterceptor;Lcom/zykj/http/interceptor/HeadInterceptor;Lcom/zykj/http/interceptor/NetWorkResponseWithRefreshTokenInterceptor;)Ll8/v;
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
    new-instance v0, Ll8/v$a;

    .line 17
    .line 18
    invoke-direct {v0}, Ll8/v$a;-><init>()V

    .line 19
    .line 20
    .line 21
    sget-object v1, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 22
    .line 23
    const-wide/16 v2, 0x1e

    .line 24
    .line 25
    invoke-virtual {v0, v2, v3, v1}, Ll8/v$a;->e(JLjava/util/concurrent/TimeUnit;)Ll8/v$a;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0, v2, v3, v1}, Ll8/v$a;->O(JLjava/util/concurrent/TimeUnit;)Ll8/v$a;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0, v2, v3, v1}, Ll8/v$a;->Q(JLjava/util/concurrent/TimeUnit;)Ll8/v$a;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0, p1}, Ll8/v$a;->a(Ll8/s;)Ll8/v$a;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0, p2}, Ll8/v$a;->a(Ll8/s;)Ll8/v$a;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0, p3}, Ll8/v$a;->a(Ll8/s;)Ll8/v$a;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0}, Ll8/v$a;->c()Ll8/v;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    return-object p1
.end method

.method public final d(Ll8/v;)Lc9/y;
    .locals 3

    .line 1
    const-string v0, "okHttpClient"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lc9/y$b;

    .line 7
    .line 8
    invoke-direct {v0}, Lc9/y$b;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, p1}, Lc9/y$b;->g(Ll8/v;)Lc9/y$b;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    sget-object v0, Lcom/zykj/http/BaseUrlEnum;->DEFAULT:Lcom/zykj/http/BaseUrlEnum;

    .line 16
    .line 17
    invoke-virtual {v0}, Lcom/zykj/http/BaseUrlEnum;->getUrl()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {p1, v0}, Lc9/y$b;->c(Ljava/lang/String;)Lc9/y$b;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-static {}, Le9/k;->f()Le9/k;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-virtual {p1, v0}, Lc9/y$b;->b(Lc9/f$a;)Lc9/y$b;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    new-instance v0, La6/c;

    .line 34
    .line 35
    invoke-direct {v0}, La6/c;-><init>()V

    .line 36
    .line 37
    .line 38
    invoke-virtual {p1, v0}, Lc9/y$b;->a(Lc9/c$a;)Lc9/y$b;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    new-instance v0, Lcom/google/gson/GsonBuilder;

    .line 43
    .line 44
    invoke-direct {v0}, Lcom/google/gson/GsonBuilder;-><init>()V

    .line 45
    .line 46
    .line 47
    new-instance v1, Lk6/f;

    .line 48
    .line 49
    invoke-direct {v1}, Lk6/f;-><init>()V

    .line 50
    .line 51
    .line 52
    const-class v2, Ljava/util/Date;

    .line 53
    .line 54
    invoke-virtual {v0, v2, v1}, Lcom/google/gson/GsonBuilder;->registerTypeAdapter(Ljava/lang/reflect/Type;Ljava/lang/Object;)Lcom/google/gson/GsonBuilder;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    invoke-virtual {v0}, Lcom/google/gson/GsonBuilder;->create()Lcom/google/gson/Gson;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    invoke-static {v0}, Ld9/a;->f(Lcom/google/gson/Gson;)Ld9/a;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    invoke-virtual {p1, v0}, Lc9/y$b;->b(Lc9/f$a;)Lc9/y$b;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    invoke-virtual {p1}, Lc9/y$b;->e()Lc9/y;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    const-string v0, "build(...)"

    .line 75
    .line 76
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    return-object p1
.end method
