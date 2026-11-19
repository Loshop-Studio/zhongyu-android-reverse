.class public abstract Lg9/b;
.super Landroid/view/View;
.source "SourceFile"

# interfaces
.implements Ly8/f;
.implements Ly8/g;


# instance fields
.field public a:Ly8/c$d;

.field public b:Landroid/os/HandlerThread;

.field public c:Ly8/c;

.field public d:Z

.field public e:Z

.field public f:Lg9/a;

.field public g:Z

.field public h:Z

.field public i:I

.field public j:Ljava/lang/Object;

.field public k:Z

.field public l:Z

.field public m:J

.field public n:Ljava/util/LinkedList;

.field public o:Z

.field public p:I

.field public q:Ljava/lang/Runnable;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x1

    .line 5
    iput-boolean p1, p0, Lg9/b;->e:Z

    .line 6
    .line 7
    iput-boolean p1, p0, Lg9/b;->h:Z

    .line 8
    .line 9
    const/4 p1, 0x0

    .line 10
    iput p1, p0, Lg9/b;->i:I

    .line 11
    .line 12
    new-instance p2, Ljava/lang/Object;

    .line 13
    .line 14
    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    .line 15
    .line 16
    .line 17
    iput-object p2, p0, Lg9/b;->j:Ljava/lang/Object;

    .line 18
    .line 19
    iput-boolean p1, p0, Lg9/b;->k:Z

    .line 20
    .line 21
    iput-boolean p1, p0, Lg9/b;->l:Z

    .line 22
    .line 23
    iput p1, p0, Lg9/b;->p:I

    .line 24
    .line 25
    new-instance p1, Lg9/b$a;

    .line 26
    .line 27
    invoke-direct {p1, p0}, Lg9/b$a;-><init>(Lg9/b;)V

    .line 28
    .line 29
    .line 30
    iput-object p1, p0, Lg9/b;->q:Ljava/lang/Runnable;

    .line 31
    .line 32
    invoke-virtual {p0}, Lg9/b;->l()V

    .line 33
    .line 34
    .line 35
    return-void
.end method

.method public static synthetic d(Lg9/b;)Ly8/c;
    .locals 0

    .line 1
    iget-object p0, p0, Lg9/b;->c:Ly8/c;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic e(Lg9/b;)I
    .locals 0

    .line 1
    iget p0, p0, Lg9/b;->p:I

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic f(Lg9/b;)I
    .locals 2

    .line 1
    iget v0, p0, Lg9/b;->p:I

    .line 2
    .line 3
    add-int/lit8 v1, v0, 0x1

    .line 4
    .line 5
    iput v1, p0, Lg9/b;->p:I

    .line 6
    .line 7
    return v0
.end method

.method public static synthetic g(Lg9/b;)Z
    .locals 0

    .line 1
    invoke-super {p0}, Landroid/view/View;->isShown()Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method


# virtual methods
.method public final A()V
    .locals 2

    .line 1
    iget-object v0, p0, Lg9/b;->c:Ly8/c;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iput-object v1, p0, Lg9/b;->c:Ly8/c;

    .line 5
    .line 6
    invoke-virtual {p0}, Lg9/b;->B()V

    .line 7
    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {v0}, Ly8/c;->I()V

    .line 12
    .line 13
    .line 14
    :cond_0
    iget-object v0, p0, Lg9/b;->b:Landroid/os/HandlerThread;

    .line 15
    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    iput-object v1, p0, Lg9/b;->b:Landroid/os/HandlerThread;

    .line 19
    .line 20
    :try_start_0
    invoke-virtual {v0}, Ljava/lang/Thread;->join()V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 21
    .line 22
    .line 23
    goto :goto_0

    .line 24
    :catch_0
    move-exception v1

    .line 25
    invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 26
    .line 27
    .line 28
    :goto_0
    invoke-virtual {v0}, Landroid/os/HandlerThread;->quit()Z

    .line 29
    .line 30
    .line 31
    :cond_1
    return-void
.end method

.method public final B()V
    .locals 2

    .line 1
    iget-object v0, p0, Lg9/b;->j:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    const/4 v1, 0x1

    .line 5
    :try_start_0
    iput-boolean v1, p0, Lg9/b;->k:Z

    .line 6
    .line 7
    iget-object v1, p0, Lg9/b;->j:Ljava/lang/Object;

    .line 8
    .line 9
    invoke-virtual {v1}, Ljava/lang/Object;->notifyAll()V

    .line 10
    .line 11
    .line 12
    monitor-exit v0

    .line 13
    return-void

    .line 14
    :catchall_0
    move-exception v1

    .line 15
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    throw v1
.end method

.method public a()J
    .locals 4

    .line 1
    iget-boolean v0, p0, Lg9/b;->d:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const-wide/16 v0, 0x0

    .line 6
    .line 7
    return-wide v0

    .line 8
    :cond_0
    invoke-virtual {p0}, Lg9/b;->isShown()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-nez v0, :cond_1

    .line 13
    .line 14
    const-wide/16 v0, -0x1

    .line 15
    .line 16
    return-wide v0

    .line 17
    :cond_1
    invoke-static {}, Lf9/c;->b()J

    .line 18
    .line 19
    .line 20
    move-result-wide v0

    .line 21
    invoke-virtual {p0}, Lg9/b;->o()V

    .line 22
    .line 23
    .line 24
    invoke-static {}, Lf9/c;->b()J

    .line 25
    .line 26
    .line 27
    move-result-wide v2

    .line 28
    sub-long/2addr v2, v0

    .line 29
    return-wide v2
.end method

.method public b()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lg9/b;->d:Z

    .line 2
    .line 3
    return v0
.end method

.method public c()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lg9/b;->e:Z

    .line 2
    .line 3
    return v0
.end method

.method public clear()V
    .locals 4

    .line 1
    invoke-virtual {p0}, Lg9/b;->b()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    iget-boolean v0, p0, Lg9/b;->h:Z

    .line 9
    .line 10
    if-eqz v0, :cond_2

    .line 11
    .line 12
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-virtual {v0}, Ljava/lang/Thread;->getId()J

    .line 17
    .line 18
    .line 19
    move-result-wide v0

    .line 20
    iget-wide v2, p0, Lg9/b;->m:J

    .line 21
    .line 22
    cmp-long v0, v0, v2

    .line 23
    .line 24
    if-nez v0, :cond_1

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_1
    invoke-virtual {p0}, Lg9/b;->p()V

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :cond_2
    :goto_0
    const/4 v0, 0x1

    .line 32
    iput-boolean v0, p0, Lg9/b;->o:Z

    .line 33
    .line 34
    invoke-virtual {p0}, Lg9/b;->r()V

    .line 35
    .line 36
    .line 37
    return-void
.end method

.method public getConfig()Lmaster/flame/danmaku/danmaku/model/android/DanmakuContext;
    .locals 1

    .line 1
    iget-object v0, p0, Lg9/b;->c:Ly8/c;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    return-object v0

    .line 7
    :cond_0
    invoke-virtual {v0}, Ly8/c;->w()Lmaster/flame/danmaku/danmaku/model/android/DanmakuContext;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0
.end method

.method public getCurrentTime()J
    .locals 2

    .line 1
    iget-object v0, p0, Lg9/b;->c:Ly8/c;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Ly8/c;->x()J

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    return-wide v0

    .line 10
    :cond_0
    const-wide/16 v0, 0x0

    .line 11
    .line 12
    return-wide v0
.end method

.method public getCurrentVisibleDanmakus()Lz8/l;
    .locals 1

    .line 1
    iget-object v0, p0, Lg9/b;->c:Ly8/c;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Ly8/c;->y()Lz8/l;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    return-object v0
.end method

.method public getOnDanmakuClickListener()Ly8/f$a;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return-object v0
.end method

.method public getView()Landroid/view/View;
    .locals 0

    .line 1
    return-object p0
.end method

.method public h(Lz8/c;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lg9/b;->c:Ly8/c;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Ly8/c;->r(Lz8/c;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public i(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lg9/b;->e:Z

    .line 2
    .line 3
    return-void
.end method

.method public isHardwareAccelerated()Z
    .locals 1

    .line 1
    invoke-super {p0}, Landroid/view/View;->isHardwareAccelerated()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    return v0
.end method

.method public isShown()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lg9/b;->h:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-super {p0}, Landroid/view/View;->isShown()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    return v0

    .line 13
    :cond_0
    const/4 v0, 0x0

    .line 14
    return v0
.end method

.method public final j()F
    .locals 4

    .line 1
    invoke-static {}, Lf9/c;->b()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    iget-object v2, p0, Lg9/b;->n:Ljava/util/LinkedList;

    .line 6
    .line 7
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 8
    .line 9
    .line 10
    move-result-object v3

    .line 11
    invoke-virtual {v2, v3}, Ljava/util/LinkedList;->addLast(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    iget-object v2, p0, Lg9/b;->n:Ljava/util/LinkedList;

    .line 15
    .line 16
    invoke-virtual {v2}, Ljava/util/LinkedList;->getFirst()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    check-cast v2, Ljava/lang/Long;

    .line 21
    .line 22
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    .line 23
    .line 24
    .line 25
    move-result-wide v2

    .line 26
    sub-long/2addr v0, v2

    .line 27
    long-to-float v0, v0

    .line 28
    iget-object v1, p0, Lg9/b;->n:Ljava/util/LinkedList;

    .line 29
    .line 30
    invoke-virtual {v1}, Ljava/util/LinkedList;->size()I

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    const/16 v2, 0x32

    .line 35
    .line 36
    if-le v1, v2, :cond_0

    .line 37
    .line 38
    iget-object v1, p0, Lg9/b;->n:Ljava/util/LinkedList;

    .line 39
    .line 40
    invoke-virtual {v1}, Ljava/util/LinkedList;->removeFirst()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    :cond_0
    const/4 v1, 0x0

    .line 44
    cmpl-float v2, v0, v1

    .line 45
    .line 46
    if-lez v2, :cond_1

    .line 47
    .line 48
    iget-object v1, p0, Lg9/b;->n:Ljava/util/LinkedList;

    .line 49
    .line 50
    invoke-virtual {v1}, Ljava/util/LinkedList;->size()I

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    mul-int/lit16 v1, v1, 0x3e8

    .line 55
    .line 56
    int-to-float v1, v1

    .line 57
    div-float/2addr v1, v0

    .line 58
    :cond_1
    return v1
.end method

.method public k(I)Landroid/os/Looper;
    .locals 2

    .line 1
    iget-object v0, p0, Lg9/b;->b:Landroid/os/HandlerThread;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/os/HandlerThread;->quit()Z

    .line 6
    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    iput-object v0, p0, Lg9/b;->b:Landroid/os/HandlerThread;

    .line 10
    .line 11
    :cond_0
    const/4 v0, 0x1

    .line 12
    if-eq p1, v0, :cond_3

    .line 13
    .line 14
    const/4 v0, 0x2

    .line 15
    if-eq p1, v0, :cond_2

    .line 16
    .line 17
    const/4 v0, 0x3

    .line 18
    if-eq p1, v0, :cond_1

    .line 19
    .line 20
    const/4 p1, 0x0

    .line 21
    goto :goto_0

    .line 22
    :cond_1
    const/16 p1, 0x13

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_2
    const/4 p1, -0x8

    .line 26
    :goto_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 27
    .line 28
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 29
    .line 30
    .line 31
    const-string v1, "DFM Handler Thread #"

    .line 32
    .line 33
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    new-instance v1, Landroid/os/HandlerThread;

    .line 44
    .line 45
    invoke-direct {v1, v0, p1}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;I)V

    .line 46
    .line 47
    .line 48
    iput-object v1, p0, Lg9/b;->b:Landroid/os/HandlerThread;

    .line 49
    .line 50
    invoke-virtual {v1}, Ljava/lang/Thread;->start()V

    .line 51
    .line 52
    .line 53
    iget-object p1, p0, Lg9/b;->b:Landroid/os/HandlerThread;

    .line 54
    .line 55
    invoke-virtual {p1}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    return-object p1

    .line 60
    :cond_3
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    return-object p1
.end method

.method public final l()V
    .locals 2

    .line 1
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Thread;->getId()J

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    iput-wide v0, p0, Lg9/b;->m:J

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    invoke-virtual {p0, v0}, Landroid/view/View;->setBackgroundColor(I)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0, v0}, Landroid/view/View;->setDrawingCacheBackgroundColor(I)V

    .line 16
    .line 17
    .line 18
    const/4 v1, 0x1

    .line 19
    invoke-static {v1, v0}, Ly8/d;->e(ZZ)V

    .line 20
    .line 21
    .line 22
    invoke-static {p0}, Lg9/a;->e(Ly8/f;)Lg9/a;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    iput-object v0, p0, Lg9/b;->f:Lg9/a;

    .line 27
    .line 28
    return-void
.end method

.method public m()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lg9/b;->c:Ly8/c;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Ly8/c;->C()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    return v0
.end method

.method public n()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lg9/b;->c:Ly8/c;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Ly8/c;->B()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    return v0

    .line 13
    :cond_0
    const/4 v0, 0x0

    .line 14
    return v0
.end method

.method public final o()V
    .locals 4

    .line 1
    iget-boolean v0, p0, Lg9/b;->h:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_2

    .line 6
    :cond_0
    invoke-virtual {p0}, Lg9/b;->r()V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lg9/b;->j:Ljava/lang/Object;

    .line 10
    .line 11
    monitor-enter v0

    .line 12
    :goto_0
    :try_start_0
    iget-boolean v1, p0, Lg9/b;->k:Z

    .line 13
    .line 14
    if-nez v1, :cond_2

    .line 15
    .line 16
    iget-object v1, p0, Lg9/b;->c:Ly8/c;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 17
    .line 18
    if-eqz v1, :cond_2

    .line 19
    .line 20
    :try_start_1
    iget-object v1, p0, Lg9/b;->j:Ljava/lang/Object;

    .line 21
    .line 22
    const-wide/16 v2, 0xc8

    .line 23
    .line 24
    invoke-virtual {v1, v2, v3}, Ljava/lang/Object;->wait(J)V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    :catchall_0
    move-exception v1

    .line 29
    goto :goto_3

    .line 30
    :catch_0
    :try_start_2
    iget-boolean v1, p0, Lg9/b;->h:Z

    .line 31
    .line 32
    if-eqz v1, :cond_2

    .line 33
    .line 34
    iget-object v1, p0, Lg9/b;->c:Ly8/c;

    .line 35
    .line 36
    if-eqz v1, :cond_2

    .line 37
    .line 38
    invoke-virtual {v1}, Ly8/c;->C()Z

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    if-eqz v1, :cond_1

    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_1
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    invoke-virtual {v1}, Ljava/lang/Thread;->interrupt()V

    .line 50
    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_2
    :goto_1
    const/4 v1, 0x0

    .line 54
    iput-boolean v1, p0, Lg9/b;->k:Z

    .line 55
    .line 56
    monitor-exit v0

    .line 57
    :goto_2
    return-void

    .line 58
    :goto_3
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 59
    throw v1
.end method

.method public onDraw(Landroid/graphics/Canvas;)V
    .locals 8

    .line 1
    iget-boolean v0, p0, Lg9/b;->h:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-boolean v0, p0, Lg9/b;->l:Z

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    iget-boolean v0, p0, Lg9/b;->o:Z

    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    invoke-static {p1}, Ly8/d;->a(Landroid/graphics/Canvas;)V

    .line 19
    .line 20
    .line 21
    iput-boolean v1, p0, Lg9/b;->o:Z

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_1
    iget-object v0, p0, Lg9/b;->c:Ly8/c;

    .line 25
    .line 26
    if-eqz v0, :cond_3

    .line 27
    .line 28
    invoke-virtual {v0, p1}, Ly8/c;->u(Landroid/graphics/Canvas;)Ld9/a$b;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    iget-boolean v2, p0, Lg9/b;->g:Z

    .line 33
    .line 34
    if-eqz v2, :cond_3

    .line 35
    .line 36
    iget-object v2, p0, Lg9/b;->n:Ljava/util/LinkedList;

    .line 37
    .line 38
    if-nez v2, :cond_2

    .line 39
    .line 40
    new-instance v2, Ljava/util/LinkedList;

    .line 41
    .line 42
    invoke-direct {v2}, Ljava/util/LinkedList;-><init>()V

    .line 43
    .line 44
    .line 45
    iput-object v2, p0, Lg9/b;->n:Ljava/util/LinkedList;

    .line 46
    .line 47
    :cond_2
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    invoke-virtual {p0}, Lg9/b;->j()F

    .line 52
    .line 53
    .line 54
    move-result v3

    .line 55
    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 56
    .line 57
    .line 58
    move-result-object v3

    .line 59
    invoke-virtual {p0}, Lg9/b;->getCurrentTime()J

    .line 60
    .line 61
    .line 62
    move-result-wide v4

    .line 63
    const-wide/16 v6, 0x3e8

    .line 64
    .line 65
    div-long/2addr v4, v6

    .line 66
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 67
    .line 68
    .line 69
    move-result-object v4

    .line 70
    iget-wide v5, v0, Ld9/a$b;->r:J

    .line 71
    .line 72
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 73
    .line 74
    .line 75
    move-result-object v5

    .line 76
    iget-wide v6, v0, Ld9/a$b;->s:J

    .line 77
    .line 78
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    filled-new-array {v3, v4, v5, v0}, [Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    const-string v3, "fps %.2f,time:%d s,cache:%d,miss:%d"

    .line 87
    .line 88
    invoke-static {v2, v3, v0}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    invoke-static {p1, v0}, Ly8/d;->d(Landroid/graphics/Canvas;Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    :cond_3
    :goto_0
    iput-boolean v1, p0, Lg9/b;->l:Z

    .line 96
    .line 97
    invoke-virtual {p0}, Lg9/b;->B()V

    .line 98
    .line 99
    .line 100
    return-void
.end method

.method public onLayout(ZIIII)V
    .locals 1

    .line 1
    invoke-super/range {p0 .. p5}, Landroid/view/View;->onLayout(ZIIII)V

    .line 2
    .line 3
    .line 4
    move-object p1, p0

    .line 5
    iget-object v0, p1, Lg9/b;->c:Ly8/c;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    sub-int/2addr p4, p2

    .line 10
    sub-int/2addr p5, p3

    .line 11
    invoke-virtual {v0, p4, p5}, Ly8/c;->D(II)V

    .line 12
    .line 13
    .line 14
    :cond_0
    const/4 p2, 0x1

    .line 15
    iput-boolean p2, p1, Lg9/b;->d:Z

    .line 16
    .line 17
    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lg9/b;->f:Lg9/a;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lg9/a;->f(Landroid/view/MotionEvent;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    invoke-super {p0, p1}, Landroid/view/View;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    return p1

    .line 14
    :cond_0
    return v0
.end method

.method public final p()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lg9/b;->o:Z

    .line 3
    .line 4
    invoke-virtual {p0}, Lg9/b;->o()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public q()V
    .locals 2

    .line 1
    iget-object v0, p0, Lg9/b;->c:Ly8/c;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v1, p0, Lg9/b;->q:Ljava/lang/Runnable;

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Lg9/b;->c:Ly8/c;

    .line 11
    .line 12
    invoke-virtual {v0}, Ly8/c;->F()V

    .line 13
    .line 14
    .line 15
    :cond_0
    return-void
.end method

.method public final r()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lg9/b;->l:Z

    .line 3
    .line 4
    invoke-virtual {p0}, Landroid/view/View;->postInvalidateOnAnimation()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public final s()V
    .locals 3

    .line 1
    iget-object v0, p0, Lg9/b;->c:Ly8/c;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Ly8/c;

    .line 6
    .line 7
    iget v1, p0, Lg9/b;->i:I

    .line 8
    .line 9
    invoke-virtual {p0, v1}, Lg9/b;->k(I)Landroid/os/Looper;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    iget-boolean v2, p0, Lg9/b;->h:Z

    .line 14
    .line 15
    invoke-direct {v0, v1, p0, v2}, Ly8/c;-><init>(Landroid/os/Looper;Ly8/g;Z)V

    .line 16
    .line 17
    .line 18
    iput-object v0, p0, Lg9/b;->c:Ly8/c;

    .line 19
    .line 20
    :cond_0
    return-void
.end method

.method public setCallback(Ly8/c$d;)V
    .locals 1

    .line 1
    iput-object p1, p0, Lg9/b;->a:Ly8/c$d;

    .line 2
    .line 3
    iget-object v0, p0, Lg9/b;->c:Ly8/c;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0, p1}, Ly8/c;->M(Ly8/c$d;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method public setDrawingThreadType(I)V
    .locals 0

    .line 1
    iput p1, p0, Lg9/b;->i:I

    .line 2
    .line 3
    return-void
.end method

.method public setOnDanmakuClickListener(Ly8/f$a;)V
    .locals 0

    .line 1
    return-void
.end method

.method public t(Lc9/a;Lmaster/flame/danmaku/danmaku/model/android/DanmakuContext;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lg9/b;->s()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lg9/b;->c:Ly8/c;

    .line 5
    .line 6
    invoke-virtual {v0, p2}, Ly8/c;->N(Lmaster/flame/danmaku/danmaku/model/android/DanmakuContext;)V

    .line 7
    .line 8
    .line 9
    iget-object p2, p0, Lg9/b;->c:Ly8/c;

    .line 10
    .line 11
    invoke-virtual {p2, p1}, Ly8/c;->O(Lc9/a;)V

    .line 12
    .line 13
    .line 14
    iget-object p1, p0, Lg9/b;->c:Ly8/c;

    .line 15
    .line 16
    iget-object p2, p0, Lg9/b;->a:Ly8/c$d;

    .line 17
    .line 18
    invoke-virtual {p1, p2}, Ly8/c;->M(Ly8/c$d;)V

    .line 19
    .line 20
    .line 21
    iget-object p1, p0, Lg9/b;->c:Ly8/c;

    .line 22
    .line 23
    invoke-virtual {p1}, Ly8/c;->G()V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public u()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lg9/b;->z()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lg9/b;->n:Ljava/util/LinkedList;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/util/LinkedList;->clear()V

    .line 9
    .line 10
    .line 11
    :cond_0
    return-void
.end method

.method public v()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lg9/b;->z()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lg9/b;->x()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public w()V
    .locals 2

    .line 1
    iget-object v0, p0, Lg9/b;->c:Ly8/c;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Ly8/c;->B()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    iput v0, p0, Lg9/b;->p:I

    .line 13
    .line 14
    iget-object v0, p0, Lg9/b;->c:Ly8/c;

    .line 15
    .line 16
    iget-object v1, p0, Lg9/b;->q:Ljava/lang/Runnable;

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :cond_0
    iget-object v0, p0, Lg9/b;->c:Ly8/c;

    .line 23
    .line 24
    if-nez v0, :cond_1

    .line 25
    .line 26
    invoke-virtual {p0}, Lg9/b;->v()V

    .line 27
    .line 28
    .line 29
    :cond_1
    return-void
.end method

.method public x()V
    .locals 2

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    invoke-virtual {p0, v0, v1}, Lg9/b;->y(J)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public y(J)V
    .locals 2

    .line 1
    iget-object v0, p0, Lg9/b;->c:Ly8/c;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lg9/b;->s()V

    .line 6
    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    const/4 v1, 0x0

    .line 10
    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    :goto_0
    iget-object v0, p0, Lg9/b;->c:Ly8/c;

    .line 14
    .line 15
    const/4 v1, 0x1

    .line 16
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-virtual {v0, v1, p1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-virtual {p1}, Landroid/os/Message;->sendToTarget()V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public z()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lg9/b;->A()V

    .line 2
    .line 3
    .line 4
    return-void
.end method
