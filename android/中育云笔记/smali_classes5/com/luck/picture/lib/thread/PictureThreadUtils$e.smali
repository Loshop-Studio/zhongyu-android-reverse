.class public abstract Lcom/luck/picture/lib/thread/PictureThreadUtils$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/luck/picture/lib/thread/PictureThreadUtils;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "e"
.end annotation


# instance fields
.field public final c:Ljava/util/concurrent/atomic/AtomicInteger;

.field public volatile d:Z

.field public volatile e:Ljava/lang/Thread;

.field public f:Ljava/util/Timer;

.field public g:Ljava/util/concurrent/Executor;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lcom/luck/picture/lib/thread/PictureThreadUtils$e;->c:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 11
    .line 12
    return-void
.end method

.method public static synthetic a(Lcom/luck/picture/lib/thread/PictureThreadUtils$e;Z)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/luck/picture/lib/thread/PictureThreadUtils$e;->j(Z)V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public b()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-virtual {p0, v0}, Lcom/luck/picture/lib/thread/PictureThreadUtils$e;->c(Z)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method public c(Z)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/luck/picture/lib/thread/PictureThreadUtils$e;->c:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lcom/luck/picture/lib/thread/PictureThreadUtils$e;->c:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 5
    .line 6
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    const/4 v2, 0x1

    .line 11
    if-le v1, v2, :cond_0

    .line 12
    .line 13
    monitor-exit v0

    .line 14
    return-void

    .line 15
    :catchall_0
    move-exception p1

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    iget-object v1, p0, Lcom/luck/picture/lib/thread/PictureThreadUtils$e;->c:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 18
    .line 19
    const/4 v2, 0x4

    .line 20
    invoke-virtual {v1, v2}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V

    .line 21
    .line 22
    .line 23
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 24
    if-eqz p1, :cond_1

    .line 25
    .line 26
    iget-object p1, p0, Lcom/luck/picture/lib/thread/PictureThreadUtils$e;->e:Ljava/lang/Thread;

    .line 27
    .line 28
    if-eqz p1, :cond_1

    .line 29
    .line 30
    iget-object p1, p0, Lcom/luck/picture/lib/thread/PictureThreadUtils$e;->e:Ljava/lang/Thread;

    .line 31
    .line 32
    invoke-virtual {p1}, Ljava/lang/Thread;->interrupt()V

    .line 33
    .line 34
    .line 35
    :cond_1
    invoke-virtual {p0}, Lcom/luck/picture/lib/thread/PictureThreadUtils$e;->e()Ljava/util/concurrent/Executor;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    new-instance v0, Lcom/luck/picture/lib/thread/PictureThreadUtils$e$d;

    .line 40
    .line 41
    invoke-direct {v0, p0}, Lcom/luck/picture/lib/thread/PictureThreadUtils$e$d;-><init>(Lcom/luck/picture/lib/thread/PictureThreadUtils$e;)V

    .line 42
    .line 43
    .line 44
    invoke-interface {p1, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 45
    .line 46
    .line 47
    return-void

    .line 48
    :goto_0
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 49
    throw p1
.end method

.method public abstract d()Ljava/lang/Object;
.end method

.method public final e()Ljava/util/concurrent/Executor;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/luck/picture/lib/thread/PictureThreadUtils$e;->g:Ljava/util/concurrent/Executor;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-static {}, Lcom/luck/picture/lib/thread/PictureThreadUtils;->b()Ljava/util/concurrent/Executor;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    :cond_0
    return-object v0
.end method

.method public abstract f()V
.end method

.method public g()V
    .locals 1

    .line 1
    invoke-static {}, Lcom/luck/picture/lib/thread/PictureThreadUtils;->c()Ljava/util/Map;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0, p0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lcom/luck/picture/lib/thread/PictureThreadUtils$e;->f:Ljava/util/Timer;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/util/Timer;->cancel()V

    .line 13
    .line 14
    .line 15
    const/4 v0, 0x0

    .line 16
    iput-object v0, p0, Lcom/luck/picture/lib/thread/PictureThreadUtils$e;->f:Ljava/util/Timer;

    .line 17
    .line 18
    :cond_0
    return-void
.end method

.method public abstract h(Ljava/lang/Throwable;)V
.end method

.method public abstract i(Ljava/lang/Object;)V
.end method

.method public final j(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/luck/picture/lib/thread/PictureThreadUtils$e;->d:Z

    .line 2
    .line 3
    return-void
.end method

.method public run()V
    .locals 4

    .line 1
    iget-boolean v0, p0, Lcom/luck/picture/lib/thread/PictureThreadUtils$e;->d:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    if-eqz v0, :cond_2

    .line 6
    .line 7
    iget-object v0, p0, Lcom/luck/picture/lib/thread/PictureThreadUtils$e;->e:Ljava/lang/Thread;

    .line 8
    .line 9
    if-nez v0, :cond_1

    .line 10
    .line 11
    iget-object v0, p0, Lcom/luck/picture/lib/thread/PictureThreadUtils$e;->c:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 12
    .line 13
    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicInteger;->compareAndSet(II)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-nez v0, :cond_0

    .line 18
    .line 19
    goto/16 :goto_2

    .line 20
    .line 21
    :cond_0
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    iput-object v0, p0, Lcom/luck/picture/lib/thread/PictureThreadUtils$e;->e:Ljava/lang/Thread;

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_1
    iget-object v0, p0, Lcom/luck/picture/lib/thread/PictureThreadUtils$e;->c:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 29
    .line 30
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-eq v0, v2, :cond_4

    .line 35
    .line 36
    goto :goto_2

    .line 37
    :cond_2
    iget-object v0, p0, Lcom/luck/picture/lib/thread/PictureThreadUtils$e;->c:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 38
    .line 39
    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicInteger;->compareAndSet(II)Z

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    if-nez v0, :cond_3

    .line 44
    .line 45
    goto :goto_2

    .line 46
    :cond_3
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    iput-object v0, p0, Lcom/luck/picture/lib/thread/PictureThreadUtils$e;->e:Ljava/lang/Thread;

    .line 51
    .line 52
    :cond_4
    :goto_0
    :try_start_0
    invoke-virtual {p0}, Lcom/luck/picture/lib/thread/PictureThreadUtils$e;->d()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    iget-boolean v1, p0, Lcom/luck/picture/lib/thread/PictureThreadUtils$e;->d:Z

    .line 57
    .line 58
    if-eqz v1, :cond_6

    .line 59
    .line 60
    iget-object v1, p0, Lcom/luck/picture/lib/thread/PictureThreadUtils$e;->c:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 61
    .line 62
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 63
    .line 64
    .line 65
    move-result v1

    .line 66
    if-eq v1, v2, :cond_5

    .line 67
    .line 68
    goto :goto_2

    .line 69
    :cond_5
    invoke-virtual {p0}, Lcom/luck/picture/lib/thread/PictureThreadUtils$e;->e()Ljava/util/concurrent/Executor;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    new-instance v3, Lcom/luck/picture/lib/thread/PictureThreadUtils$e$a;

    .line 74
    .line 75
    invoke-direct {v3, p0, v0}, Lcom/luck/picture/lib/thread/PictureThreadUtils$e$a;-><init>(Lcom/luck/picture/lib/thread/PictureThreadUtils$e;Ljava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    invoke-interface {v1, v3}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 79
    .line 80
    .line 81
    return-void

    .line 82
    :catchall_0
    move-exception v0

    .line 83
    goto :goto_1

    .line 84
    :cond_6
    iget-object v1, p0, Lcom/luck/picture/lib/thread/PictureThreadUtils$e;->c:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 85
    .line 86
    const/4 v3, 0x3

    .line 87
    invoke-virtual {v1, v2, v3}, Ljava/util/concurrent/atomic/AtomicInteger;->compareAndSet(II)Z

    .line 88
    .line 89
    .line 90
    move-result v1

    .line 91
    if-nez v1, :cond_7

    .line 92
    .line 93
    goto :goto_2

    .line 94
    :cond_7
    invoke-virtual {p0}, Lcom/luck/picture/lib/thread/PictureThreadUtils$e;->e()Ljava/util/concurrent/Executor;

    .line 95
    .line 96
    .line 97
    move-result-object v1

    .line 98
    new-instance v3, Lcom/luck/picture/lib/thread/PictureThreadUtils$e$b;

    .line 99
    .line 100
    invoke-direct {v3, p0, v0}, Lcom/luck/picture/lib/thread/PictureThreadUtils$e$b;-><init>(Lcom/luck/picture/lib/thread/PictureThreadUtils$e;Ljava/lang/Object;)V

    .line 101
    .line 102
    .line 103
    invoke-interface {v1, v3}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 104
    .line 105
    .line 106
    return-void

    .line 107
    :goto_1
    iget-object v1, p0, Lcom/luck/picture/lib/thread/PictureThreadUtils$e;->c:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 108
    .line 109
    const/4 v3, 0x2

    .line 110
    invoke-virtual {v1, v2, v3}, Ljava/util/concurrent/atomic/AtomicInteger;->compareAndSet(II)Z

    .line 111
    .line 112
    .line 113
    move-result v1

    .line 114
    if-nez v1, :cond_8

    .line 115
    .line 116
    goto :goto_2

    .line 117
    :cond_8
    invoke-virtual {p0}, Lcom/luck/picture/lib/thread/PictureThreadUtils$e;->e()Ljava/util/concurrent/Executor;

    .line 118
    .line 119
    .line 120
    move-result-object v1

    .line 121
    new-instance v2, Lcom/luck/picture/lib/thread/PictureThreadUtils$e$c;

    .line 122
    .line 123
    invoke-direct {v2, p0, v0}, Lcom/luck/picture/lib/thread/PictureThreadUtils$e$c;-><init>(Lcom/luck/picture/lib/thread/PictureThreadUtils$e;Ljava/lang/Throwable;)V

    .line 124
    .line 125
    .line 126
    invoke-interface {v1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 127
    .line 128
    .line 129
    goto :goto_2

    .line 130
    :catch_0
    iget-object v0, p0, Lcom/luck/picture/lib/thread/PictureThreadUtils$e;->c:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 131
    .line 132
    const/4 v1, 0x4

    .line 133
    const/4 v2, 0x5

    .line 134
    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicInteger;->compareAndSet(II)Z

    .line 135
    .line 136
    .line 137
    :goto_2
    return-void
.end method
