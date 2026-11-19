.class final Lcoil3/disk/DiskLruCache$launchCleanup$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcoil3/disk/DiskLruCache;->A()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lhd/p;"
    }
.end annotation

.annotation runtime Lxc/d;
    c = "coil3.disk.DiskLruCache$launchCleanup$1"
    f = "DiskLruCache.kt"
    l = {}
    m = "invokeSuspend"
.end annotation


# instance fields
.field public c:I

.field public final synthetic d:Lcoil3/disk/DiskLruCache;


# direct methods
.method public constructor <init>(Lcoil3/disk/DiskLruCache;Lvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcoil3/disk/DiskLruCache$launchCleanup$1;->d:Lcoil3/disk/DiskLruCache;

    .line 2
    .line 3
    const/4 p1, 0x2

    .line 4
    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILvc/c;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lvc/c;)Lvc/c;
    .locals 1

    .line 1
    new-instance p1, Lcoil3/disk/DiskLruCache$launchCleanup$1;

    .line 2
    .line 3
    iget-object v0, p0, Lcoil3/disk/DiskLruCache$launchCleanup$1;->d:Lcoil3/disk/DiskLruCache;

    .line 4
    .line 5
    invoke-direct {p1, v0, p2}, Lcoil3/disk/DiskLruCache$launchCleanup$1;-><init>(Lcoil3/disk/DiskLruCache;Lvc/c;)V

    .line 6
    .line 7
    .line 8
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lsd/i0;

    check-cast p2, Lvc/c;

    invoke-virtual {p0, p1, p2}, Lcoil3/disk/DiskLruCache$launchCleanup$1;->invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcoil3/disk/DiskLruCache$launchCleanup$1;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    move-result-object p1

    check-cast p1, Lcoil3/disk/DiskLruCache$launchCleanup$1;

    sget-object p2, Lqc/q;->a:Lqc/q;

    invoke-virtual {p1, p2}, Lcoil3/disk/DiskLruCache$launchCleanup$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    iget v0, p0, Lcoil3/disk/DiskLruCache$launchCleanup$1;->c:I

    .line 5
    .line 6
    if-nez v0, :cond_3

    .line 7
    .line 8
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Lcoil3/disk/DiskLruCache$launchCleanup$1;->d:Lcoil3/disk/DiskLruCache;

    .line 12
    .line 13
    invoke-static {p1}, Lcoil3/disk/DiskLruCache;->i(Lcoil3/disk/DiskLruCache;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    iget-object v0, p0, Lcoil3/disk/DiskLruCache$launchCleanup$1;->d:Lcoil3/disk/DiskLruCache;

    .line 18
    .line 19
    monitor-enter p1

    .line 20
    :try_start_0
    invoke-static {v0}, Lcoil3/disk/DiskLruCache;->g(Lcoil3/disk/DiskLruCache;)Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-eqz v1, :cond_2

    .line 25
    .line 26
    invoke-static {v0}, Lcoil3/disk/DiskLruCache;->d(Lcoil3/disk/DiskLruCache;)Z

    .line 27
    .line 28
    .line 29
    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 30
    if-eqz v1, :cond_0

    .line 31
    .line 32
    goto :goto_2

    .line 33
    :cond_0
    const/4 v1, 0x1

    .line 34
    :try_start_1
    invoke-static {v0}, Lcoil3/disk/DiskLruCache;->r(Lcoil3/disk/DiskLruCache;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 35
    .line 36
    .line 37
    goto :goto_0

    .line 38
    :catchall_0
    move-exception v0

    .line 39
    goto :goto_3

    .line 40
    :catch_0
    :try_start_2
    invoke-static {v0, v1}, Lcoil3/disk/DiskLruCache;->p(Lcoil3/disk/DiskLruCache;Z)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 41
    .line 42
    .line 43
    :goto_0
    :try_start_3
    invoke-static {v0}, Lcoil3/disk/DiskLruCache;->k(Lcoil3/disk/DiskLruCache;)Z

    .line 44
    .line 45
    .line 46
    move-result v2

    .line 47
    if-eqz v2, :cond_1

    .line 48
    .line 49
    invoke-static {v0}, Lcoil3/disk/DiskLruCache;->s(Lcoil3/disk/DiskLruCache;)V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 50
    .line 51
    .line 52
    goto :goto_1

    .line 53
    :catch_1
    :try_start_4
    invoke-static {v0, v1}, Lcoil3/disk/DiskLruCache;->n(Lcoil3/disk/DiskLruCache;Z)V

    .line 54
    .line 55
    .line 56
    invoke-static {}, Lokio/Okio;->blackhole()Lokio/Sink;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    invoke-static {v1}, Lokio/Okio;->buffer(Lokio/Sink;)Lokio/BufferedSink;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    invoke-static {v0, v1}, Lcoil3/disk/DiskLruCache;->m(Lcoil3/disk/DiskLruCache;Lokio/BufferedSink;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 65
    .line 66
    .line 67
    :cond_1
    :goto_1
    monitor-exit p1

    .line 68
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 69
    .line 70
    return-object p1

    .line 71
    :cond_2
    :goto_2
    :try_start_5
    sget-object v0, Lqc/q;->a:Lqc/q;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 72
    .line 73
    monitor-exit p1

    .line 74
    return-object v0

    .line 75
    :goto_3
    monitor-exit p1

    .line 76
    throw v0

    .line 77
    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 78
    .line 79
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 80
    .line 81
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    throw p1
.end method
