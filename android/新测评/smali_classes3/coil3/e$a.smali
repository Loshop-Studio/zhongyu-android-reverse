.class public final Lcoil3/e$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcoil3/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public final a:Landroid/content/Context;

.field public b:Ly/e$b;

.field public c:Lkotlin/Lazy;

.field public d:Lkotlin/Lazy;

.field public e:Lkotlin/Lazy;

.field public f:Lcoil3/b$c;

.field public g:Lcoil3/a;

.field public final h:Lcoil3/c$a;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, Lc0/c;->b(Landroid/content/Context;)Landroid/content/Context;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    iput-object p1, p0, Lcoil3/e$a;->a:Landroid/content/Context;

    .line 9
    .line 10
    sget-object p1, Ly/e$b;->p:Ly/e$b;

    .line 11
    .line 12
    iput-object p1, p0, Lcoil3/e$a;->b:Ly/e$b;

    .line 13
    .line 14
    const/4 p1, 0x0

    .line 15
    iput-object p1, p0, Lcoil3/e$a;->c:Lkotlin/Lazy;

    .line 16
    .line 17
    iput-object p1, p0, Lcoil3/e$a;->d:Lkotlin/Lazy;

    .line 18
    .line 19
    iput-object p1, p0, Lcoil3/e$a;->e:Lkotlin/Lazy;

    .line 20
    .line 21
    iput-object p1, p0, Lcoil3/e$a;->f:Lcoil3/b$c;

    .line 22
    .line 23
    iput-object p1, p0, Lcoil3/e$a;->g:Lcoil3/a;

    .line 24
    .line 25
    new-instance p1, Lcoil3/c$a;

    .line 26
    .line 27
    invoke-direct {p1}, Lcoil3/c$a;-><init>()V

    .line 28
    .line 29
    .line 30
    iput-object p1, p0, Lcoil3/e$a;->h:Lcoil3/c$a;

    .line 31
    .line 32
    return-void
.end method

.method public static synthetic a()Lkotlinx/coroutines/MainCoroutineDispatcher;
    .locals 1

    .line 1
    invoke-static {}, Lcoil3/e$a;->e()Lkotlinx/coroutines/MainCoroutineDispatcher;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic b(Lcoil3/e$a;)Lt/d;
    .locals 0

    .line 1
    invoke-static {p0}, Lcoil3/e$a;->f(Lcoil3/e$a;)Lt/d;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c()Lcoil3/disk/a;
    .locals 1

    .line 1
    invoke-static {}, Lcoil3/e$a;->g()Lcoil3/disk/a;

    move-result-object v0

    return-object v0
.end method

.method public static final e()Lkotlinx/coroutines/MainCoroutineDispatcher;
    .locals 1

    .line 1
    invoke-static {}, Lkotlinx/coroutines/Dispatchers;->getMain()Lkotlinx/coroutines/MainCoroutineDispatcher;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lkotlinx/coroutines/MainCoroutineDispatcher;->getImmediate()Lkotlinx/coroutines/MainCoroutineDispatcher;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public static final f(Lcoil3/e$a;)Lt/d;
    .locals 6

    .line 1
    new-instance v0, Lt/d$a;

    .line 2
    .line 3
    invoke-direct {v0}, Lt/d$a;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lcoil3/e$a;->a:Landroid/content/Context;

    .line 7
    .line 8
    const/4 v4, 0x2

    .line 9
    const/4 v5, 0x0

    .line 10
    const-wide/16 v2, 0x0

    .line 11
    .line 12
    invoke-static/range {v0 .. v5}, Lt/d$a;->d(Lt/d$a;Landroid/content/Context;DILjava/lang/Object;)Lt/d$a;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    invoke-virtual {p0}, Lt/d$a;->b()Lt/d;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0
.end method

.method public static final g()Lcoil3/disk/a;
    .locals 1

    .line 1
    invoke-static {}, Lcoil3/disk/c;->d()Lcoil3/disk/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method


# virtual methods
.method public final d()Lcoil3/e;
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    new-instance v1, Lcoil3/RealImageLoader$a;

    .line 4
    .line 5
    iget-object v2, v0, Lcoil3/e$a;->a:Landroid/content/Context;

    .line 6
    .line 7
    iget-object v3, v0, Lcoil3/e$a;->b:Ly/e$b;

    .line 8
    .line 9
    iget-object v4, v0, Lcoil3/e$a;->h:Lcoil3/c$a;

    .line 10
    .line 11
    invoke-virtual {v4}, Lcoil3/c$a;->a()Lcoil3/c;

    .line 12
    .line 13
    .line 14
    move-result-object v17

    .line 15
    const/16 v18, 0x1fff

    .line 16
    .line 17
    const/16 v19, 0x0

    .line 18
    .line 19
    const/4 v4, 0x0

    .line 20
    const/4 v5, 0x0

    .line 21
    const/4 v6, 0x0

    .line 22
    const/4 v7, 0x0

    .line 23
    const/4 v8, 0x0

    .line 24
    const/4 v9, 0x0

    .line 25
    const/4 v10, 0x0

    .line 26
    const/4 v11, 0x0

    .line 27
    const/4 v12, 0x0

    .line 28
    const/4 v13, 0x0

    .line 29
    const/4 v14, 0x0

    .line 30
    const/4 v15, 0x0

    .line 31
    const/16 v16, 0x0

    .line 32
    .line 33
    invoke-static/range {v3 .. v19}, Ly/e$b;->b(Ly/e$b;Lokio/FileSystem;Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/CoroutineContext;Lcoil3/request/CachePolicy;Lcoil3/request/CachePolicy;Lcoil3/request/CachePolicy;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lz/g;Lcoil3/size/Scale;Lcoil3/size/Precision;Lcoil3/c;ILjava/lang/Object;)Ly/e$b;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    iget-object v4, v0, Lcoil3/e$a;->c:Lkotlin/Lazy;

    .line 38
    .line 39
    if-nez v4, :cond_0

    .line 40
    .line 41
    new-instance v4, Lk/l;

    .line 42
    .line 43
    invoke-direct {v4}, Lk/l;-><init>()V

    .line 44
    .line 45
    .line 46
    invoke-static {v4}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 47
    .line 48
    .line 49
    move-result-object v4

    .line 50
    :cond_0
    iget-object v5, v0, Lcoil3/e$a;->d:Lkotlin/Lazy;

    .line 51
    .line 52
    if-nez v5, :cond_1

    .line 53
    .line 54
    new-instance v5, Lk/m;

    .line 55
    .line 56
    invoke-direct {v5, v0}, Lk/m;-><init>(Lcoil3/e$a;)V

    .line 57
    .line 58
    .line 59
    invoke-static {v5}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 60
    .line 61
    .line 62
    move-result-object v5

    .line 63
    :cond_1
    iget-object v6, v0, Lcoil3/e$a;->e:Lkotlin/Lazy;

    .line 64
    .line 65
    if-nez v6, :cond_2

    .line 66
    .line 67
    new-instance v6, Lk/n;

    .line 68
    .line 69
    invoke-direct {v6}, Lk/n;-><init>()V

    .line 70
    .line 71
    .line 72
    invoke-static {v6}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 73
    .line 74
    .line 75
    move-result-object v6

    .line 76
    :cond_2
    iget-object v7, v0, Lcoil3/e$a;->f:Lcoil3/b$c;

    .line 77
    .line 78
    if-nez v7, :cond_3

    .line 79
    .line 80
    sget-object v7, Lcoil3/b$c;->b:Lcoil3/b$c;

    .line 81
    .line 82
    :cond_3
    iget-object v8, v0, Lcoil3/e$a;->g:Lcoil3/a;

    .line 83
    .line 84
    if-nez v8, :cond_4

    .line 85
    .line 86
    new-instance v8, Lcoil3/a;

    .line 87
    .line 88
    invoke-direct {v8}, Lcoil3/a;-><init>()V

    .line 89
    .line 90
    .line 91
    :cond_4
    const/4 v9, 0x0

    .line 92
    invoke-direct/range {v1 .. v9}, Lcoil3/RealImageLoader$a;-><init>(Landroid/content/Context;Ly/e$b;Lkotlin/Lazy;Lkotlin/Lazy;Lkotlin/Lazy;Lcoil3/b$c;Lcoil3/a;Lcoil3/util/Logger;)V

    .line 93
    .line 94
    .line 95
    new-instance v2, Lcoil3/RealImageLoader;

    .line 96
    .line 97
    invoke-direct {v2, v1}, Lcoil3/RealImageLoader;-><init>(Lcoil3/RealImageLoader$a;)V

    .line 98
    .line 99
    .line 100
    return-object v2
.end method

.method public final h(Lcoil3/a;)Lcoil3/e$a;
    .locals 0

    .line 1
    iput-object p1, p0, Lcoil3/e$a;->g:Lcoil3/a;

    .line 2
    .line 3
    return-object p0
.end method

.method public final i()Lcoil3/c$a;
    .locals 1

    .line 1
    iget-object v0, p0, Lcoil3/e$a;->h:Lcoil3/c$a;

    .line 2
    .line 3
    return-object v0
.end method
