.class public final Lcom/zykj/mistake/network/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lcom/zykj/mistake/network/a;

.field public static b:Ljava/lang/String; = ""

.field public static c:Ljava/lang/String; = ""

.field public static final d:Lokhttp3/z;

.field public static e:Ljava/lang/String;

.field public static f:Lcom/zykj/mistake/network/c;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lcom/zykj/mistake/network/a;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/zykj/mistake/network/a;->a:Lcom/zykj/mistake/network/a;

    .line 7
    .line 8
    new-instance v0, Lokhttp3/y;

    .line 9
    .line 10
    invoke-direct {v0}, Lokhttp3/y;-><init>()V

    .line 11
    .line 12
    .line 13
    sget-object v1, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 14
    .line 15
    const-wide/16 v2, 0xa

    .line 16
    .line 17
    invoke-virtual {v0, v2, v3, v1}, Lokhttp3/y;->a(JLjava/util/concurrent/TimeUnit;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, v2, v3, v1}, Lokhttp3/y;->c(JLjava/util/concurrent/TimeUnit;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, v2, v3, v1}, Lokhttp3/y;->b(JLjava/util/concurrent/TimeUnit;)V

    .line 24
    .line 25
    .line 26
    new-instance v1, Ls7/a;

    .line 27
    .line 28
    const/4 v2, 0x2

    .line 29
    invoke-direct {v1, v2}, Ls7/a;-><init>(I)V

    .line 30
    .line 31
    .line 32
    iget-object v2, v0, Lokhttp3/y;->c:Ljava/util/ArrayList;

    .line 33
    .line 34
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    new-instance v1, Ls7/a;

    .line 38
    .line 39
    const/4 v3, 0x1

    .line 40
    invoke-direct {v1, v3}, Ls7/a;-><init>(I)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    new-instance v1, Lokhttp3/z;

    .line 47
    .line 48
    invoke-direct {v1, v0}, Lokhttp3/z;-><init>(Lokhttp3/y;)V

    .line 49
    .line 50
    .line 51
    sput-object v1, Lcom/zykj/mistake/network/a;->d:Lokhttp3/z;

    .line 52
    .line 53
    return-void
.end method

.method public static a(Ljava/lang/String;)Lretrofit2/p0;
    .locals 3

    .line 1
    new-instance v0, Lb0/d;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, v1}, Lb0/d;-><init>(I)V

    .line 5
    .line 6
    .line 7
    const-string v1, "client == null"

    .line 8
    .line 9
    sget-object v2, Lcom/zykj/mistake/network/a;->d:Lokhttp3/z;

    .line 10
    .line 11
    invoke-static {v2, v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    iput-object v2, v0, Lb0/d;->a:Ljava/lang/Object;

    .line 15
    .line 16
    new-instance v1, Lcom/google/gson/h;

    .line 17
    .line 18
    invoke-direct {v1}, Lcom/google/gson/h;-><init>()V

    .line 19
    .line 20
    .line 21
    const/4 v2, 0x1

    .line 22
    iput-boolean v2, v1, Lcom/google/gson/h;->j:Z

    .line 23
    .line 24
    invoke-virtual {v1}, Lcom/google/gson/h;->a()Lcom/google/gson/g;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    new-instance v2, Ld8/a;

    .line 29
    .line 30
    invoke-direct {v2, v1}, Ld8/a;-><init>(Lcom/google/gson/g;)V

    .line 31
    .line 32
    .line 33
    iget-object v1, v0, Lb0/d;->c:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v1, Ljava/util/ArrayList;

    .line 36
    .line 37
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    new-instance v1, Lc8/e;

    .line 41
    .line 42
    const/4 v2, 0x0

    .line 43
    invoke-direct {v1, v2}, Lc8/e;-><init>(I)V

    .line 44
    .line 45
    .line 46
    iget-object v2, v0, Lb0/d;->d:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast v2, Ljava/util/ArrayList;

    .line 49
    .line 50
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    invoke-virtual {v0, p0}, Lb0/d;->b(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v0}, Lb0/d;->c()Lretrofit2/p0;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    return-object p0
.end method

.method public static b()Lcom/zykj/mistake/network/b;
    .locals 2

    .line 1
    sget-object v0, Lcom/zykj/mistake/network/a;->b:Ljava/lang/String;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/zykj/mistake/network/a;->a(Ljava/lang/String;)Lretrofit2/p0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-class v1, Lcom/zykj/mistake/network/b;

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Lretrofit2/p0;->b(Ljava/lang/Class;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const-string v1, "create(...)"

    .line 14
    .line 15
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    check-cast v0, Lcom/zykj/mistake/network/b;

    .line 19
    .line 20
    return-object v0
.end method


# virtual methods
.method public final c()Lcom/zykj/mistake/network/c;
    .locals 3

    .line 1
    sget-object v0, Lcom/zykj/mistake/network/a;->b:Ljava/lang/String;

    .line 2
    .line 3
    sget-object v1, Lcom/zykj/mistake/network/a;->f:Lcom/zykj/mistake/network/c;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    sget-object v2, Lcom/zykj/mistake/network/a;->e:Ljava/lang/String;

    .line 8
    .line 9
    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    if-eqz v2, :cond_0

    .line 14
    .line 15
    return-object v1

    .line 16
    :cond_0
    monitor-enter p0

    .line 17
    :try_start_0
    sget-object v1, Lcom/zykj/mistake/network/a;->f:Lcom/zykj/mistake/network/c;

    .line 18
    .line 19
    if-eqz v1, :cond_1

    .line 20
    .line 21
    sget-object v2, Lcom/zykj/mistake/network/a;->e:Ljava/lang/String;

    .line 22
    .line 23
    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 27
    if-eqz v2, :cond_1

    .line 28
    .line 29
    monitor-exit p0

    .line 30
    return-object v1

    .line 31
    :catchall_0
    move-exception v0

    .line 32
    goto :goto_0

    .line 33
    :cond_1
    :try_start_1
    invoke-static {v0}, Lcom/zykj/mistake/network/a;->a(Ljava/lang/String;)Lretrofit2/p0;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    const-class v2, Lcom/zykj/mistake/network/c;

    .line 38
    .line 39
    invoke-virtual {v1, v2}, Lretrofit2/p0;->b(Ljava/lang/Class;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    move-object v2, v1

    .line 44
    check-cast v2, Lcom/zykj/mistake/network/c;

    .line 45
    .line 46
    sput-object v0, Lcom/zykj/mistake/network/a;->e:Ljava/lang/String;

    .line 47
    .line 48
    sput-object v2, Lcom/zykj/mistake/network/a;->f:Lcom/zykj/mistake/network/c;

    .line 49
    .line 50
    const-string v0, "also(...)"

    .line 51
    .line 52
    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    check-cast v1, Lcom/zykj/mistake/network/c;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 56
    .line 57
    monitor-exit p0

    .line 58
    return-object v1

    .line 59
    :goto_0
    monitor-exit p0

    .line 60
    throw v0
.end method
