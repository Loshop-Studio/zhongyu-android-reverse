.class public final Lokhttp3/internal/connection/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lokhttp3/e;


# instance fields
.field public final a:Lokhttp3/z;

.field public final b:Lokhttp3/c0;

.field public final c:Lokhttp3/internal/connection/m;

.field public final d:Lokhttp3/internal/connection/h;

.field public final e:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public f:Ljava/lang/Object;

.field public g:Lokhttp3/internal/connection/e;

.field public h:Lokhttp3/internal/connection/k;

.field public i:Z

.field public j:Lokhttp3/internal/connection/d;

.field public k:Z

.field public l:Z

.field public m:Z

.field public volatile n:Z

.field public volatile o:Lokhttp3/internal/connection/d;

.field public volatile p:Lokhttp3/internal/connection/k;


# direct methods
.method public constructor <init>(Lokhttp3/z;Lokhttp3/c0;)V
    .locals 2

    .line 1
    const-string v0, "originalRequest"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lokhttp3/internal/connection/i;->a:Lokhttp3/z;

    .line 10
    .line 11
    iput-object p2, p0, Lokhttp3/internal/connection/i;->b:Lokhttp3/c0;

    .line 12
    .line 13
    iget-object p2, p1, Lokhttp3/z;->b:Lo2/a;

    .line 14
    .line 15
    iget-object p2, p2, Lo2/a;->b:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast p2, Lokhttp3/internal/connection/m;

    .line 18
    .line 19
    iput-object p2, p0, Lokhttp3/internal/connection/i;->c:Lokhttp3/internal/connection/m;

    .line 20
    .line 21
    iget-object p1, p1, Lokhttp3/z;->e:Lp7/a;

    .line 22
    .line 23
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    new-instance p1, Lokhttp3/internal/connection/h;

    .line 27
    .line 28
    invoke-direct {p1, p0}, Lokhttp3/internal/connection/h;-><init>(Lokhttp3/internal/connection/i;)V

    .line 29
    .line 30
    .line 31
    const/4 p2, 0x0

    .line 32
    int-to-long v0, p2

    .line 33
    sget-object p2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 34
    .line 35
    invoke-virtual {p1, v0, v1, p2}, Lokio/Timeout;->timeout(JLjava/util/concurrent/TimeUnit;)Lokio/Timeout;

    .line 36
    .line 37
    .line 38
    iput-object p1, p0, Lokhttp3/internal/connection/i;->d:Lokhttp3/internal/connection/h;

    .line 39
    .line 40
    new-instance p1, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 41
    .line 42
    invoke-direct {p1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>()V

    .line 43
    .line 44
    .line 45
    iput-object p1, p0, Lokhttp3/internal/connection/i;->e:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 46
    .line 47
    const/4 p1, 0x1

    .line 48
    iput-boolean p1, p0, Lokhttp3/internal/connection/i;->m:Z

    .line 49
    .line 50
    return-void
.end method

.method public static final c(Lokhttp3/internal/connection/i;)Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-boolean v1, p0, Lokhttp3/internal/connection/i;->n:Z

    .line 7
    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    const-string v1, "canceled "

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const-string v1, ""

    .line 14
    .line 15
    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    const-string v1, "call"

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, " to "

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    iget-object p0, p0, Lokhttp3/internal/connection/i;->b:Lokhttp3/c0;

    .line 29
    .line 30
    iget-object p0, p0, Lokhttp3/c0;->a:Lokhttp3/r;

    .line 31
    .line 32
    invoke-virtual {p0}, Lokhttp3/r;->g()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    return-object p0
.end method


# virtual methods
.method public final cancel()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lokhttp3/internal/connection/i;->n:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    const/4 v0, 0x1

    .line 7
    iput-boolean v0, p0, Lokhttp3/internal/connection/i;->n:Z

    .line 8
    .line 9
    iget-object v0, p0, Lokhttp3/internal/connection/i;->o:Lokhttp3/internal/connection/d;

    .line 10
    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    iget-object v0, v0, Lokhttp3/internal/connection/d;->c:Ls7/c;

    .line 14
    .line 15
    invoke-interface {v0}, Ls7/c;->cancel()V

    .line 16
    .line 17
    .line 18
    :cond_1
    iget-object v0, p0, Lokhttp3/internal/connection/i;->p:Lokhttp3/internal/connection/k;

    .line 19
    .line 20
    if-eqz v0, :cond_2

    .line 21
    .line 22
    iget-object v0, v0, Lokhttp3/internal/connection/k;->c:Ljava/net/Socket;

    .line 23
    .line 24
    if-eqz v0, :cond_2

    .line 25
    .line 26
    invoke-static {v0}, Lp7/c;->d(Ljava/net/Socket;)V

    .line 27
    .line 28
    .line 29
    :cond_2
    return-void
.end method

.method public final clone()Ljava/lang/Object;
    .locals 3

    .line 1
    new-instance v0, Lokhttp3/internal/connection/i;

    .line 2
    .line 3
    iget-object v1, p0, Lokhttp3/internal/connection/i;->a:Lokhttp3/z;

    .line 4
    .line 5
    iget-object v2, p0, Lokhttp3/internal/connection/i;->b:Lokhttp3/c0;

    .line 6
    .line 7
    invoke-direct {v0, v1, v2}, Lokhttp3/internal/connection/i;-><init>(Lokhttp3/z;Lokhttp3/c0;)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method

.method public final e(Lokhttp3/internal/connection/k;)V
    .locals 2

    .line 1
    sget-object v0, Lp7/c;->a:[B

    .line 2
    .line 3
    iget-object v0, p0, Lokhttp3/internal/connection/i;->h:Lokhttp3/internal/connection/k;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    iput-object p1, p0, Lokhttp3/internal/connection/i;->h:Lokhttp3/internal/connection/k;

    .line 8
    .line 9
    iget-object p1, p1, Lokhttp3/internal/connection/k;->p:Ljava/util/ArrayList;

    .line 10
    .line 11
    new-instance v0, Lokhttp3/internal/connection/g;

    .line 12
    .line 13
    iget-object v1, p0, Lokhttp3/internal/connection/i;->f:Ljava/lang/Object;

    .line 14
    .line 15
    invoke-direct {v0, p0, v1}, Lokhttp3/internal/connection/g;-><init>(Lokhttp3/internal/connection/i;Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 23
    .line 24
    const-string v0, "Check failed."

    .line 25
    .line 26
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    throw p1
.end method

.method public final f(Ljava/io/IOException;)Ljava/io/IOException;
    .locals 2

    .line 1
    sget-object v0, Lp7/c;->a:[B

    .line 2
    .line 3
    iget-object v0, p0, Lokhttp3/internal/connection/i;->h:Lokhttp3/internal/connection/k;

    .line 4
    .line 5
    if-eqz v0, :cond_2

    .line 6
    .line 7
    monitor-enter v0

    .line 8
    :try_start_0
    invoke-virtual {p0}, Lokhttp3/internal/connection/i;->m()Ljava/net/Socket;

    .line 9
    .line 10
    .line 11
    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    monitor-exit v0

    .line 13
    iget-object v0, p0, Lokhttp3/internal/connection/i;->h:Lokhttp3/internal/connection/k;

    .line 14
    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    if-eqz v1, :cond_2

    .line 18
    .line 19
    invoke-static {v1}, Lp7/c;->d(Ljava/net/Socket;)V

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    if-nez v1, :cond_1

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_1
    const-string p1, "Check failed."

    .line 27
    .line 28
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 29
    .line 30
    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    throw v0

    .line 34
    :catchall_0
    move-exception p1

    .line 35
    monitor-exit v0

    .line 36
    throw p1

    .line 37
    :cond_2
    :goto_0
    iget-boolean v0, p0, Lokhttp3/internal/connection/i;->i:Z

    .line 38
    .line 39
    if-eqz v0, :cond_3

    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_3
    iget-object v0, p0, Lokhttp3/internal/connection/i;->d:Lokhttp3/internal/connection/h;

    .line 43
    .line 44
    invoke-virtual {v0}, Lokio/AsyncTimeout;->exit()Z

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    if-nez v0, :cond_4

    .line 49
    .line 50
    :goto_1
    move-object v0, p1

    .line 51
    goto :goto_2

    .line 52
    :cond_4
    new-instance v0, Ljava/io/InterruptedIOException;

    .line 53
    .line 54
    const-string v1, "timeout"

    .line 55
    .line 56
    invoke-direct {v0, v1}, Ljava/io/InterruptedIOException;-><init>(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    if-eqz p1, :cond_5

    .line 60
    .line 61
    invoke-virtual {v0, p1}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 62
    .line 63
    .line 64
    :cond_5
    :goto_2
    if-eqz p1, :cond_6

    .line 65
    .line 66
    invoke-static {v0}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    :cond_6
    return-object v0
.end method

.method public final g(Lokhttp3/f;)V
    .locals 5

    .line 1
    iget-object v0, p0, Lokhttp3/internal/connection/i;->e:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_5

    .line 10
    .line 11
    sget-object v0, Lv7/n;->a:Lv7/n;

    .line 12
    .line 13
    sget-object v0, Lv7/n;->a:Lv7/n;

    .line 14
    .line 15
    invoke-virtual {v0}, Lv7/n;->g()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    iput-object v0, p0, Lokhttp3/internal/connection/i;->f:Ljava/lang/Object;

    .line 20
    .line 21
    iget-object v0, p0, Lokhttp3/internal/connection/i;->a:Lokhttp3/z;

    .line 22
    .line 23
    iget-object v0, v0, Lokhttp3/z;->a:Lc0/g;

    .line 24
    .line 25
    new-instance v1, Lokhttp3/internal/connection/f;

    .line 26
    .line 27
    invoke-direct {v1, p0, p1}, Lokhttp3/internal/connection/f;-><init>(Lokhttp3/internal/connection/i;Lokhttp3/f;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    monitor-enter v0

    .line 34
    :try_start_0
    iget-object p1, v0, Lc0/g;->d:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast p1, Ljava/util/ArrayDeque;

    .line 37
    .line 38
    invoke-virtual {p1, v1}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    iget-object p1, p0, Lokhttp3/internal/connection/i;->b:Lokhttp3/c0;

    .line 42
    .line 43
    iget-object p1, p1, Lokhttp3/c0;->a:Lokhttp3/r;

    .line 44
    .line 45
    iget-object p1, p1, Lokhttp3/r;->d:Ljava/lang/String;

    .line 46
    .line 47
    iget-object v2, v0, Lc0/g;->e:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast v2, Ljava/util/ArrayDeque;

    .line 50
    .line 51
    invoke-virtual {v2}, Ljava/util/ArrayDeque;->iterator()Ljava/util/Iterator;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    :cond_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 56
    .line 57
    .line 58
    move-result v3

    .line 59
    if-eqz v3, :cond_1

    .line 60
    .line 61
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v3

    .line 65
    check-cast v3, Lokhttp3/internal/connection/f;

    .line 66
    .line 67
    iget-object v4, v3, Lokhttp3/internal/connection/f;->c:Lokhttp3/internal/connection/i;

    .line 68
    .line 69
    iget-object v4, v4, Lokhttp3/internal/connection/i;->b:Lokhttp3/c0;

    .line 70
    .line 71
    iget-object v4, v4, Lokhttp3/c0;->a:Lokhttp3/r;

    .line 72
    .line 73
    iget-object v4, v4, Lokhttp3/r;->d:Ljava/lang/String;

    .line 74
    .line 75
    invoke-static {v4, p1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    move-result v4

    .line 79
    if-eqz v4, :cond_0

    .line 80
    .line 81
    goto :goto_0

    .line 82
    :cond_1
    iget-object v2, v0, Lc0/g;->d:Ljava/lang/Object;

    .line 83
    .line 84
    check-cast v2, Ljava/util/ArrayDeque;

    .line 85
    .line 86
    invoke-virtual {v2}, Ljava/util/ArrayDeque;->iterator()Ljava/util/Iterator;

    .line 87
    .line 88
    .line 89
    move-result-object v2

    .line 90
    :cond_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 91
    .line 92
    .line 93
    move-result v3

    .line 94
    if-eqz v3, :cond_3

    .line 95
    .line 96
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v3

    .line 100
    check-cast v3, Lokhttp3/internal/connection/f;

    .line 101
    .line 102
    iget-object v4, v3, Lokhttp3/internal/connection/f;->c:Lokhttp3/internal/connection/i;

    .line 103
    .line 104
    iget-object v4, v4, Lokhttp3/internal/connection/i;->b:Lokhttp3/c0;

    .line 105
    .line 106
    iget-object v4, v4, Lokhttp3/c0;->a:Lokhttp3/r;

    .line 107
    .line 108
    iget-object v4, v4, Lokhttp3/r;->d:Ljava/lang/String;

    .line 109
    .line 110
    invoke-static {v4, p1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 111
    .line 112
    .line 113
    move-result v4

    .line 114
    if-eqz v4, :cond_2

    .line 115
    .line 116
    goto :goto_0

    .line 117
    :cond_3
    const/4 v3, 0x0

    .line 118
    :goto_0
    if-eqz v3, :cond_4

    .line 119
    .line 120
    iget-object p1, v3, Lokhttp3/internal/connection/f;->b:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 121
    .line 122
    iput-object p1, v1, Lokhttp3/internal/connection/f;->b:Ljava/util/concurrent/atomic/AtomicInteger;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 123
    .line 124
    :cond_4
    monitor-exit v0

    .line 125
    invoke-virtual {v0}, Lc0/g;->i()V

    .line 126
    .line 127
    .line 128
    return-void

    .line 129
    :catchall_0
    move-exception p1

    .line 130
    monitor-exit v0

    .line 131
    throw p1

    .line 132
    :cond_5
    const-string p1, "Already Executed"

    .line 133
    .line 134
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 135
    .line 136
    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 137
    .line 138
    .line 139
    throw v0
.end method

.method public final h()Lokhttp3/i0;
    .locals 3

    .line 1
    iget-object v0, p0, Lokhttp3/internal/connection/i;->e:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, Lokhttp3/internal/connection/i;->d:Lokhttp3/internal/connection/h;

    .line 12
    .line 13
    invoke-virtual {v0}, Lokio/AsyncTimeout;->enter()V

    .line 14
    .line 15
    .line 16
    sget-object v0, Lv7/n;->a:Lv7/n;

    .line 17
    .line 18
    sget-object v0, Lv7/n;->a:Lv7/n;

    .line 19
    .line 20
    invoke-virtual {v0}, Lv7/n;->g()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    iput-object v0, p0, Lokhttp3/internal/connection/i;->f:Ljava/lang/Object;

    .line 25
    .line 26
    :try_start_0
    iget-object v0, p0, Lokhttp3/internal/connection/i;->a:Lokhttp3/z;

    .line 27
    .line 28
    iget-object v0, v0, Lokhttp3/z;->a:Lc0/g;

    .line 29
    .line 30
    monitor-enter v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 31
    :try_start_1
    iget-object v1, v0, Lc0/g;->f:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v1, Ljava/util/ArrayDeque;

    .line 34
    .line 35
    invoke-virtual {v1, p0}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 36
    .line 37
    .line 38
    :try_start_2
    monitor-exit v0

    .line 39
    invoke-virtual {p0}, Lokhttp3/internal/connection/i;->j()Lokhttp3/i0;

    .line 40
    .line 41
    .line 42
    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 43
    iget-object v1, p0, Lokhttp3/internal/connection/i;->a:Lokhttp3/z;

    .line 44
    .line 45
    iget-object v1, v1, Lokhttp3/z;->a:Lc0/g;

    .line 46
    .line 47
    iget-object v2, v1, Lc0/g;->f:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast v2, Ljava/util/ArrayDeque;

    .line 50
    .line 51
    invoke-virtual {v1, v2, p0}, Lc0/g;->c(Ljava/util/ArrayDeque;Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    return-object v0

    .line 55
    :catchall_0
    move-exception v0

    .line 56
    goto :goto_0

    .line 57
    :catchall_1
    move-exception v1

    .line 58
    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 59
    :try_start_4
    throw v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 60
    :goto_0
    iget-object v1, p0, Lokhttp3/internal/connection/i;->a:Lokhttp3/z;

    .line 61
    .line 62
    iget-object v1, v1, Lokhttp3/z;->a:Lc0/g;

    .line 63
    .line 64
    iget-object v2, v1, Lc0/g;->f:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast v2, Ljava/util/ArrayDeque;

    .line 67
    .line 68
    invoke-virtual {v1, v2, p0}, Lc0/g;->c(Ljava/util/ArrayDeque;Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    throw v0

    .line 72
    :cond_0
    const-string v0, "Already Executed"

    .line 73
    .line 74
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 75
    .line 76
    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    throw v1
.end method

.method public final i(Z)V
    .locals 3

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-boolean v0, p0, Lokhttp3/internal/connection/i;->m:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    monitor-exit p0

    .line 7
    const/4 v0, 0x0

    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    iget-object p1, p0, Lokhttp3/internal/connection/i;->o:Lokhttp3/internal/connection/d;

    .line 11
    .line 12
    if-eqz p1, :cond_0

    .line 13
    .line 14
    iget-object v1, p1, Lokhttp3/internal/connection/d;->c:Ls7/c;

    .line 15
    .line 16
    invoke-interface {v1}, Ls7/c;->cancel()V

    .line 17
    .line 18
    .line 19
    iget-object v1, p1, Lokhttp3/internal/connection/d;->a:Lokhttp3/internal/connection/i;

    .line 20
    .line 21
    const/4 v2, 0x1

    .line 22
    invoke-virtual {v1, p1, v2, v2, v0}, Lokhttp3/internal/connection/i;->k(Lokhttp3/internal/connection/d;ZZLjava/io/IOException;)Ljava/io/IOException;

    .line 23
    .line 24
    .line 25
    :cond_0
    iput-object v0, p0, Lokhttp3/internal/connection/i;->j:Lokhttp3/internal/connection/d;

    .line 26
    .line 27
    return-void

    .line 28
    :cond_1
    :try_start_1
    const-string p1, "released"

    .line 29
    .line 30
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 31
    .line 32
    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 36
    :catchall_0
    move-exception p1

    .line 37
    monitor-exit p0

    .line 38
    throw p1
.end method

.method public final j()Lokhttp3/i0;
    .locals 9

    .line 1
    new-instance v2, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lokhttp3/internal/connection/i;->a:Lokhttp3/z;

    .line 7
    .line 8
    iget-object v0, v0, Lokhttp3/z;->c:Ljava/util/List;

    .line 9
    .line 10
    invoke-static {v0, v2}, Lkotlin/collections/y;->S(Ljava/lang/Iterable;Ljava/util/Collection;)V

    .line 11
    .line 12
    .line 13
    new-instance v0, Lm4/b;

    .line 14
    .line 15
    iget-object v1, p0, Lokhttp3/internal/connection/i;->a:Lokhttp3/z;

    .line 16
    .line 17
    const/4 v3, 0x2

    .line 18
    invoke-direct {v0, v1, v3}, Lm4/b;-><init>(Ljava/lang/Object;I)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    new-instance v0, Lm4/b;

    .line 25
    .line 26
    iget-object v1, p0, Lokhttp3/internal/connection/i;->a:Lokhttp3/z;

    .line 27
    .line 28
    iget-object v1, v1, Lokhttp3/z;->j:Lokhttp3/b;

    .line 29
    .line 30
    invoke-direct {v0, v1}, Lm4/b;-><init>(Lokhttp3/b;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    new-instance v0, Lq7/b;

    .line 37
    .line 38
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    sget-object v0, Lokhttp3/internal/connection/a;->a:Lokhttp3/internal/connection/a;

    .line 45
    .line 46
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    iget-object v0, p0, Lokhttp3/internal/connection/i;->a:Lokhttp3/z;

    .line 50
    .line 51
    iget-object v0, v0, Lokhttp3/z;->d:Ljava/util/List;

    .line 52
    .line 53
    invoke-static {v0, v2}, Lkotlin/collections/y;->S(Ljava/lang/Iterable;Ljava/util/Collection;)V

    .line 54
    .line 55
    .line 56
    new-instance v0, Ls7/a;

    .line 57
    .line 58
    const/4 v1, 0x0

    .line 59
    invoke-direct {v0, v1}, Ls7/a;-><init>(I)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    new-instance v0, Ls7/e;

    .line 66
    .line 67
    iget-object v5, p0, Lokhttp3/internal/connection/i;->b:Lokhttp3/c0;

    .line 68
    .line 69
    iget-object v1, p0, Lokhttp3/internal/connection/i;->a:Lokhttp3/z;

    .line 70
    .line 71
    iget v6, v1, Lokhttp3/z;->w:I

    .line 72
    .line 73
    iget v7, v1, Lokhttp3/z;->x:I

    .line 74
    .line 75
    iget v8, v1, Lokhttp3/z;->y:I

    .line 76
    .line 77
    const/4 v3, 0x0

    .line 78
    const/4 v4, 0x0

    .line 79
    move-object v1, p0

    .line 80
    invoke-direct/range {v0 .. v8}, Ls7/e;-><init>(Lokhttp3/internal/connection/i;Ljava/util/ArrayList;ILokhttp3/internal/connection/d;Lokhttp3/c0;III)V

    .line 81
    .line 82
    .line 83
    const/4 v2, 0x0

    .line 84
    const/4 v3, 0x0

    .line 85
    :try_start_0
    iget-object v4, v1, Lokhttp3/internal/connection/i;->b:Lokhttp3/c0;

    .line 86
    .line 87
    invoke-virtual {v0, v4}, Ls7/e;->b(Lokhttp3/c0;)Lokhttp3/i0;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    iget-boolean v4, v1, Lokhttp3/internal/connection/i;->n:Z
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 92
    .line 93
    if-nez v4, :cond_0

    .line 94
    .line 95
    invoke-virtual {p0, v2}, Lokhttp3/internal/connection/i;->l(Ljava/io/IOException;)Ljava/io/IOException;

    .line 96
    .line 97
    .line 98
    return-object v0

    .line 99
    :cond_0
    :try_start_1
    invoke-static {v0}, Lp7/c;->c(Ljava/io/Closeable;)V

    .line 100
    .line 101
    .line 102
    new-instance v0, Ljava/io/IOException;

    .line 103
    .line 104
    const-string v4, "Canceled"

    .line 105
    .line 106
    invoke-direct {v0, v4}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    throw v0
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 110
    :catchall_0
    move-exception v0

    .line 111
    goto :goto_0

    .line 112
    :catch_0
    move-exception v0

    .line 113
    const/4 v3, 0x1

    .line 114
    :try_start_2
    invoke-virtual {p0, v0}, Lokhttp3/internal/connection/i;->l(Ljava/io/IOException;)Ljava/io/IOException;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    const-string v4, "null cannot be cast to non-null type kotlin.Throwable"

    .line 119
    .line 120
    invoke-static {v0, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 121
    .line 122
    .line 123
    throw v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 124
    :goto_0
    if-nez v3, :cond_1

    .line 125
    .line 126
    invoke-virtual {p0, v2}, Lokhttp3/internal/connection/i;->l(Ljava/io/IOException;)Ljava/io/IOException;

    .line 127
    .line 128
    .line 129
    :cond_1
    throw v0
.end method

.method public final k(Lokhttp3/internal/connection/d;ZZLjava/io/IOException;)Ljava/io/IOException;
    .locals 2

    .line 1
    const-string v0, "exchange"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lokhttp3/internal/connection/i;->o:Lokhttp3/internal/connection/d;

    .line 7
    .line 8
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    if-nez p1, :cond_0

    .line 13
    .line 14
    goto :goto_5

    .line 15
    :cond_0
    monitor-enter p0

    .line 16
    const/4 p1, 0x1

    .line 17
    const/4 v0, 0x0

    .line 18
    if-eqz p2, :cond_1

    .line 19
    .line 20
    :try_start_0
    iget-boolean v1, p0, Lokhttp3/internal/connection/i;->k:Z

    .line 21
    .line 22
    if-nez v1, :cond_2

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :catchall_0
    move-exception p1

    .line 26
    goto :goto_2

    .line 27
    :cond_1
    :goto_0
    if-eqz p3, :cond_7

    .line 28
    .line 29
    iget-boolean v1, p0, Lokhttp3/internal/connection/i;->l:Z

    .line 30
    .line 31
    if-eqz v1, :cond_7

    .line 32
    .line 33
    :cond_2
    if-eqz p2, :cond_3

    .line 34
    .line 35
    iput-boolean v0, p0, Lokhttp3/internal/connection/i;->k:Z

    .line 36
    .line 37
    :cond_3
    if-eqz p3, :cond_4

    .line 38
    .line 39
    iput-boolean v0, p0, Lokhttp3/internal/connection/i;->l:Z

    .line 40
    .line 41
    :cond_4
    iget-boolean p2, p0, Lokhttp3/internal/connection/i;->k:Z

    .line 42
    .line 43
    if-nez p2, :cond_5

    .line 44
    .line 45
    iget-boolean p3, p0, Lokhttp3/internal/connection/i;->l:Z

    .line 46
    .line 47
    if-nez p3, :cond_5

    .line 48
    .line 49
    move p3, p1

    .line 50
    goto :goto_1

    .line 51
    :cond_5
    move p3, v0

    .line 52
    :goto_1
    if-nez p2, :cond_6

    .line 53
    .line 54
    iget-boolean p2, p0, Lokhttp3/internal/connection/i;->l:Z

    .line 55
    .line 56
    if-nez p2, :cond_6

    .line 57
    .line 58
    iget-boolean p2, p0, Lokhttp3/internal/connection/i;->m:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 59
    .line 60
    if-nez p2, :cond_6

    .line 61
    .line 62
    move v0, p1

    .line 63
    :cond_6
    move p2, v0

    .line 64
    move v0, p3

    .line 65
    goto :goto_3

    .line 66
    :goto_2
    monitor-exit p0

    .line 67
    throw p1

    .line 68
    :cond_7
    move p2, v0

    .line 69
    :goto_3
    monitor-exit p0

    .line 70
    if-eqz v0, :cond_8

    .line 71
    .line 72
    const/4 p3, 0x0

    .line 73
    iput-object p3, p0, Lokhttp3/internal/connection/i;->o:Lokhttp3/internal/connection/d;

    .line 74
    .line 75
    iget-object p3, p0, Lokhttp3/internal/connection/i;->h:Lokhttp3/internal/connection/k;

    .line 76
    .line 77
    if-eqz p3, :cond_8

    .line 78
    .line 79
    monitor-enter p3

    .line 80
    :try_start_1
    iget v0, p3, Lokhttp3/internal/connection/k;->m:I

    .line 81
    .line 82
    add-int/2addr v0, p1

    .line 83
    iput v0, p3, Lokhttp3/internal/connection/k;->m:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 84
    .line 85
    monitor-exit p3

    .line 86
    goto :goto_4

    .line 87
    :catchall_1
    move-exception p1

    .line 88
    :try_start_2
    monitor-exit p3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 89
    throw p1

    .line 90
    :cond_8
    :goto_4
    if-eqz p2, :cond_9

    .line 91
    .line 92
    invoke-virtual {p0, p4}, Lokhttp3/internal/connection/i;->f(Ljava/io/IOException;)Ljava/io/IOException;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    return-object p1

    .line 97
    :cond_9
    :goto_5
    return-object p4
.end method

.method public final l(Ljava/io/IOException;)Ljava/io/IOException;
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-boolean v0, p0, Lokhttp3/internal/connection/i;->m:Z

    .line 3
    .line 4
    const/4 v1, 0x0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iput-boolean v1, p0, Lokhttp3/internal/connection/i;->m:Z

    .line 8
    .line 9
    iget-boolean v0, p0, Lokhttp3/internal/connection/i;->k:Z

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    iget-boolean v0, p0, Lokhttp3/internal/connection/i;->l:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 14
    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    const/4 v1, 0x1

    .line 18
    goto :goto_0

    .line 19
    :catchall_0
    move-exception p1

    .line 20
    goto :goto_1

    .line 21
    :cond_0
    :goto_0
    monitor-exit p0

    .line 22
    if-eqz v1, :cond_1

    .line 23
    .line 24
    invoke-virtual {p0, p1}, Lokhttp3/internal/connection/i;->f(Ljava/io/IOException;)Ljava/io/IOException;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    :cond_1
    return-object p1

    .line 29
    :goto_1
    monitor-exit p0

    .line 30
    throw p1
.end method

.method public final m()Ljava/net/Socket;
    .locals 7

    .line 1
    iget-object v0, p0, Lokhttp3/internal/connection/i;->h:Lokhttp3/internal/connection/k;

    .line 2
    .line 3
    invoke-static {v0}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    sget-object v1, Lp7/c;->a:[B

    .line 7
    .line 8
    iget-object v1, v0, Lokhttp3/internal/connection/k;->p:Ljava/util/ArrayList;

    .line 9
    .line 10
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    const/4 v3, 0x0

    .line 15
    move v4, v3

    .line 16
    :goto_0
    const/4 v5, -0x1

    .line 17
    if-ge v4, v2, :cond_1

    .line 18
    .line 19
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v6

    .line 23
    add-int/lit8 v4, v4, 0x1

    .line 24
    .line 25
    check-cast v6, Ljava/lang/ref/Reference;

    .line 26
    .line 27
    invoke-virtual {v6}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v6

    .line 31
    invoke-static {v6, p0}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v6

    .line 35
    if-eqz v6, :cond_0

    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_1
    move v3, v5

    .line 42
    :goto_1
    if-eq v3, v5, :cond_6

    .line 43
    .line 44
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    const/4 v2, 0x0

    .line 48
    iput-object v2, p0, Lokhttp3/internal/connection/i;->h:Lokhttp3/internal/connection/k;

    .line 49
    .line 50
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    if-eqz v1, :cond_5

    .line 55
    .line 56
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 57
    .line 58
    .line 59
    move-result-wide v3

    .line 60
    iput-wide v3, v0, Lokhttp3/internal/connection/k;->q:J

    .line 61
    .line 62
    iget-object v1, p0, Lokhttp3/internal/connection/i;->c:Lokhttp3/internal/connection/m;

    .line 63
    .line 64
    iget-object v3, v1, Lokhttp3/internal/connection/m;->d:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 65
    .line 66
    sget-object v4, Lp7/c;->a:[B

    .line 67
    .line 68
    iget-boolean v4, v0, Lokhttp3/internal/connection/k;->j:Z

    .line 69
    .line 70
    if-nez v4, :cond_2

    .line 71
    .line 72
    iget-object v0, v1, Lokhttp3/internal/connection/m;->b:Lr7/b;

    .line 73
    .line 74
    iget-object v1, v1, Lokhttp3/internal/connection/m;->c:Lokhttp3/internal/connection/l;

    .line 75
    .line 76
    const-wide/16 v3, 0x0

    .line 77
    .line 78
    invoke-virtual {v0, v1, v3, v4}, Lr7/b;->b(Lr7/a;J)V

    .line 79
    .line 80
    .line 81
    return-object v2

    .line 82
    :cond_2
    const/4 v2, 0x1

    .line 83
    iput-boolean v2, v0, Lokhttp3/internal/connection/k;->j:Z

    .line 84
    .line 85
    invoke-virtual {v3, v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;->remove(Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    invoke-virtual {v3}, Ljava/util/concurrent/ConcurrentLinkedQueue;->isEmpty()Z

    .line 89
    .line 90
    .line 91
    move-result v2

    .line 92
    if-eqz v2, :cond_4

    .line 93
    .line 94
    iget-object v1, v1, Lokhttp3/internal/connection/m;->b:Lr7/b;

    .line 95
    .line 96
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 97
    .line 98
    .line 99
    iget-object v2, v1, Lr7/b;->a:Lr7/c;

    .line 100
    .line 101
    monitor-enter v2

    .line 102
    :try_start_0
    invoke-virtual {v1}, Lr7/b;->a()Z

    .line 103
    .line 104
    .line 105
    move-result v3

    .line 106
    if-eqz v3, :cond_3

    .line 107
    .line 108
    iget-object v3, v1, Lr7/b;->a:Lr7/c;

    .line 109
    .line 110
    invoke-virtual {v3, v1}, Lr7/c;->d(Lr7/b;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 111
    .line 112
    .line 113
    goto :goto_2

    .line 114
    :catchall_0
    move-exception v0

    .line 115
    goto :goto_3

    .line 116
    :cond_3
    :goto_2
    monitor-exit v2

    .line 117
    goto :goto_4

    .line 118
    :goto_3
    monitor-exit v2

    .line 119
    throw v0

    .line 120
    :cond_4
    :goto_4
    iget-object v0, v0, Lokhttp3/internal/connection/k;->d:Ljava/net/Socket;

    .line 121
    .line 122
    invoke-static {v0}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 123
    .line 124
    .line 125
    return-object v0

    .line 126
    :cond_5
    return-object v2

    .line 127
    :cond_6
    const-string v0, "Check failed."

    .line 128
    .line 129
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 130
    .line 131
    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 132
    .line 133
    .line 134
    throw v1
.end method
