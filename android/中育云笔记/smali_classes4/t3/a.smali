.class public final Lt3/a;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
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
.method public final a(Lje/v;)Lu3/a;
    .locals 3

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
    const-class v0, Lu3/a;

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
    check-cast p1, Lu3/a;

    .line 73
    .line 74
    return-object p1
.end method

.method public final b(Lje/v;)Lu3/b;
    .locals 3

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
    const-class v0, Lu3/b;

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
    check-cast p1, Lu3/b;

    .line 73
    .line 74
    return-object p1
.end method
