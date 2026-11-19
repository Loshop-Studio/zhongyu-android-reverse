.class public Li7/c;
.super Ljava/util/concurrent/ThreadPoolExecutor;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Li7/c$c;,
        Li7/c$d;
    }
.end annotation


# instance fields
.field public c:Landroid/os/Handler;

.field public d:Ljava/util/List;

.field public e:Ljava/util/List;


# direct methods
.method public constructor <init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;Ljava/util/concurrent/RejectedExecutionHandler;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p8}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;Ljava/util/concurrent/RejectedExecutionHandler;)V

    .line 2
    .line 3
    .line 4
    move-object p1, p0

    .line 5
    new-instance p2, Landroid/os/Handler;

    .line 6
    .line 7
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 8
    .line 9
    .line 10
    move-result-object p3

    .line 11
    invoke-direct {p2, p3}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 12
    .line 13
    .line 14
    iput-object p2, p1, Li7/c;->c:Landroid/os/Handler;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public afterExecute(Ljava/lang/Runnable;Ljava/lang/Throwable;)V
    .locals 3

    .line 1
    invoke-super {p0, p1, p2}, Ljava/util/concurrent/ThreadPoolExecutor;->afterExecute(Ljava/lang/Runnable;Ljava/lang/Throwable;)V

    .line 2
    .line 3
    .line 4
    iget-object p2, p0, Li7/c;->d:Ljava/util/List;

    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    if-eqz p2, :cond_0

    .line 8
    .line 9
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 10
    .line 11
    .line 12
    move-result p2

    .line 13
    if-lez p2, :cond_0

    .line 14
    .line 15
    iget-object p2, p0, Li7/c;->d:Ljava/util/List;

    .line 16
    .line 17
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 18
    .line 19
    .line 20
    move-result-object p2

    .line 21
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-eqz v1, :cond_0

    .line 26
    .line 27
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-static {v1}, Lk/r;->a(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    iget-object v1, p0, Li7/c;->c:Landroid/os/Handler;

    .line 35
    .line 36
    new-instance v2, Li7/c$a;

    .line 37
    .line 38
    invoke-direct {v2, p0, v0, p1}, Li7/c$a;-><init>(Li7/c;Li7/c$d;Ljava/lang/Runnable;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_0
    invoke-virtual {p0}, Ljava/util/concurrent/ThreadPoolExecutor;->getActiveCount()I

    .line 46
    .line 47
    .line 48
    move-result p1

    .line 49
    const/4 p2, 0x1

    .line 50
    if-ne p1, p2, :cond_1

    .line 51
    .line 52
    invoke-virtual {p0}, Ljava/util/concurrent/ThreadPoolExecutor;->getQueue()Ljava/util/concurrent/BlockingQueue;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    .line 57
    .line 58
    .line 59
    move-result p1

    .line 60
    if-nez p1, :cond_1

    .line 61
    .line 62
    iget-object p1, p0, Li7/c;->e:Ljava/util/List;

    .line 63
    .line 64
    if-eqz p1, :cond_1

    .line 65
    .line 66
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 67
    .line 68
    .line 69
    move-result p1

    .line 70
    if-lez p1, :cond_1

    .line 71
    .line 72
    iget-object p1, p0, Li7/c;->e:Ljava/util/List;

    .line 73
    .line 74
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 79
    .line 80
    .line 81
    move-result p2

    .line 82
    if-eqz p2, :cond_1

    .line 83
    .line 84
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object p2

    .line 88
    invoke-static {p2}, Lk/r;->a(Ljava/lang/Object;)V

    .line 89
    .line 90
    .line 91
    iget-object p2, p0, Li7/c;->c:Landroid/os/Handler;

    .line 92
    .line 93
    new-instance v1, Li7/c$b;

    .line 94
    .line 95
    invoke-direct {v1, p0, v0}, Li7/c$b;-><init>(Li7/c;Li7/c$c;)V

    .line 96
    .line 97
    .line 98
    invoke-virtual {p2, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 99
    .line 100
    .line 101
    goto :goto_1

    .line 102
    :cond_1
    return-void
.end method
