.class public final Lp5/l;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lp5/l;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lp5/l;

    .line 2
    .line 3
    invoke-direct {v0}, Lp5/l;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lp5/l;->a:Lp5/l;

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
.method public final a(Lcom/zykj/http/interceptor/NetworkInterceptor;)La9/v;
    .locals 4

    .line 1
    const-string v0, "networkInterceptor"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, La9/v$a;

    .line 7
    .line 8
    invoke-direct {v0}, La9/v$a;-><init>()V

    .line 9
    .line 10
    .line 11
    sget-object v1, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 12
    .line 13
    const-wide/16 v2, 0x1e

    .line 14
    .line 15
    invoke-virtual {v0, v2, v3, v1}, La9/v$a;->e(JLjava/util/concurrent/TimeUnit;)La9/v$a;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, v2, v3, v1}, La9/v$a;->O(JLjava/util/concurrent/TimeUnit;)La9/v$a;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, v2, v3, v1}, La9/v$a;->Q(JLjava/util/concurrent/TimeUnit;)La9/v$a;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, p1}, La9/v$a;->a(La9/s;)La9/v$a;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0}, La9/v$a;->c()La9/v;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    return-object p1
.end method

.method public final b(La9/v;)Lp5/k;
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
    const-class v0, Lp5/k;

    .line 62
    .line 63
    invoke-virtual {p1, v0}, Lr9/d0;->b(Ljava/lang/Class;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    const-string v0, "create(...)"

    .line 68
    .line 69
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    check-cast p1, Lp5/k;

    .line 73
    .line 74
    return-object p1
.end method
