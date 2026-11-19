.class public Ly8/c;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ly8/c$d;
    }
.end annotation


# instance fields
.field public A:Z

.field public a:Lmaster/flame/danmaku/danmaku/model/android/DanmakuContext;

.field public b:J

.field public c:Z

.field public d:J

.field public e:Z

.field public f:Ly8/c$d;

.field public g:Lz8/e;

.field public h:Lc9/a;

.field public i:Ly8/h;

.field public j:Ly8/g;

.field public k:Z

.field public l:Lz8/a;

.field public final m:Ld9/a$b;

.field public n:Ljava/util/LinkedList;

.field public o:Ly8/i;

.field public final p:Z

.field public q:J

.field public r:J

.field public s:J

.field public t:J

.field public u:J

.field public v:Z

.field public w:J

.field public x:J

.field public y:Z

.field public z:Z


# direct methods
.method public constructor <init>(Landroid/os/Looper;Ly8/g;Z)V
    .locals 3

    .line 1
    invoke-direct {p0, p1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 2
    .line 3
    .line 4
    const-wide/16 v0, 0x0

    .line 5
    .line 6
    iput-wide v0, p0, Ly8/c;->b:J

    .line 7
    .line 8
    const/4 p1, 0x1

    .line 9
    iput-boolean p1, p0, Ly8/c;->c:Z

    .line 10
    .line 11
    new-instance v0, Lz8/e;

    .line 12
    .line 13
    invoke-direct {v0}, Lz8/e;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Ly8/c;->g:Lz8/e;

    .line 17
    .line 18
    iput-boolean p1, p0, Ly8/c;->k:Z

    .line 19
    .line 20
    new-instance v0, Ld9/a$b;

    .line 21
    .line 22
    invoke-direct {v0}, Ld9/a$b;-><init>()V

    .line 23
    .line 24
    .line 25
    iput-object v0, p0, Ly8/c;->m:Ld9/a$b;

    .line 26
    .line 27
    new-instance v0, Ljava/util/LinkedList;

    .line 28
    .line 29
    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    .line 30
    .line 31
    .line 32
    iput-object v0, p0, Ly8/c;->n:Ljava/util/LinkedList;

    .line 33
    .line 34
    const-wide/16 v0, 0x1e

    .line 35
    .line 36
    iput-wide v0, p0, Ly8/c;->q:J

    .line 37
    .line 38
    const-wide/16 v0, 0x3c

    .line 39
    .line 40
    iput-wide v0, p0, Ly8/c;->r:J

    .line 41
    .line 42
    const-wide/16 v0, 0x10

    .line 43
    .line 44
    iput-wide v0, p0, Ly8/c;->s:J

    .line 45
    .line 46
    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    invoke-virtual {v0}, Ljava/lang/Runtime;->availableProcessors()I

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    const/4 v1, 0x3

    .line 55
    const/4 v2, 0x0

    .line 56
    if-le v0, v1, :cond_0

    .line 57
    .line 58
    move v0, p1

    .line 59
    goto :goto_0

    .line 60
    :cond_0
    move v0, v2

    .line 61
    :goto_0
    iput-boolean v0, p0, Ly8/c;->p:Z

    .line 62
    .line 63
    invoke-static {}, Ltv/cjump/jni/DeviceUtils;->f()Z

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    xor-int/2addr p1, v0

    .line 68
    iput-boolean p1, p0, Ly8/c;->A:Z

    .line 69
    .line 70
    invoke-virtual {p0, p2}, Ly8/c;->s(Ly8/g;)V

    .line 71
    .line 72
    .line 73
    if-eqz p3, :cond_1

    .line 74
    .line 75
    const/4 p1, 0x0

    .line 76
    invoke-virtual {p0, p1}, Ly8/c;->P(Ljava/lang/Long;)V

    .line 77
    .line 78
    .line 79
    goto :goto_1

    .line 80
    :cond_1
    invoke-virtual {p0, v2}, Ly8/c;->z(Z)J

    .line 81
    .line 82
    .line 83
    :goto_1
    iput-boolean p3, p0, Ly8/c;->k:Z

    .line 84
    .line 85
    return-void
.end method

.method public static synthetic a(Ly8/c;J)J
    .locals 0

    .line 1
    iput-wide p1, p0, Ly8/c;->b:J

    .line 2
    .line 3
    return-wide p1
.end method

.method public static synthetic b(Ly8/c;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Ly8/c;->k:Z

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic c(Ly8/c;Z)Z
    .locals 0

    .line 1
    iput-boolean p1, p0, Ly8/c;->e:Z

    .line 2
    .line 3
    return p1
.end method

.method public static synthetic d(Ly8/c;J)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Ly8/c;->U(J)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic e(Ly8/c;)Ld9/a$b;
    .locals 0

    .line 1
    iget-object p0, p0, Ly8/c;->m:Ld9/a$b;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic f(Ly8/c;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Ly8/c;->A:Z

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic g(Ly8/c;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Ly8/c;->E()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic h(Ly8/c;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Ly8/c;->A()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic i(Ly8/c;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Ly8/c;->z:Z

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic j(Ly8/c;)Ly8/c$d;
    .locals 0

    .line 1
    iget-object p0, p0, Ly8/c;->f:Ly8/c$d;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic k(Ly8/c;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Ly8/c;->c:Z

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic l(Ly8/c;)J
    .locals 2

    .line 1
    iget-wide v0, p0, Ly8/c;->s:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public static synthetic m(Ly8/c;J)J
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Ly8/c;->Q(J)J

    .line 2
    .line 3
    .line 4
    move-result-wide p0

    .line 5
    return-wide p0
.end method

.method public static synthetic n(Ly8/c;)Ly8/g;
    .locals 0

    .line 1
    iget-object p0, p0, Ly8/c;->j:Ly8/g;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic o(Ly8/c;)J
    .locals 2

    .line 1
    iget-wide v0, p0, Ly8/c;->r:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public static synthetic p(Ly8/c;)Lz8/e;
    .locals 0

    .line 1
    iget-object p0, p0, Ly8/c;->g:Lz8/e;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic q(Ly8/c;)Ljava/util/LinkedList;
    .locals 0

    .line 1
    iget-object p0, p0, Ly8/c;->n:Ljava/util/LinkedList;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public final A()V
    .locals 8

    .line 1
    const-wide/16 v0, 0x10

    .line 2
    .line 3
    long-to-float v2, v0

    .line 4
    const/high16 v3, 0x40200000    # 2.5f

    .line 5
    .line 6
    mul-float/2addr v2, v3

    .line 7
    float-to-long v4, v2

    .line 8
    const-wide/16 v6, 0x21

    .line 9
    .line 10
    invoke-static {v6, v7, v4, v5}, Ljava/lang/Math;->max(JJ)J

    .line 11
    .line 12
    .line 13
    move-result-wide v4

    .line 14
    iput-wide v4, p0, Ly8/c;->q:J

    .line 15
    .line 16
    long-to-float v2, v4

    .line 17
    mul-float/2addr v2, v3

    .line 18
    float-to-long v2, v2

    .line 19
    iput-wide v2, p0, Ly8/c;->r:J

    .line 20
    .line 21
    const-wide/16 v2, 0xf

    .line 22
    .line 23
    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->max(JJ)J

    .line 24
    .line 25
    .line 26
    move-result-wide v0

    .line 27
    iput-wide v0, p0, Ly8/c;->s:J

    .line 28
    .line 29
    const-wide/16 v2, 0x3

    .line 30
    .line 31
    add-long/2addr v0, v2

    .line 32
    iput-wide v0, p0, Ly8/c;->t:J

    .line 33
    .line 34
    return-void
.end method

.method public B()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Ly8/c;->e:Z

    .line 2
    .line 3
    return v0
.end method

.method public C()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Ly8/c;->c:Z

    .line 2
    .line 3
    return v0
.end method

.method public D(II)V
    .locals 1

    .line 1
    iget-object v0, p0, Ly8/c;->l:Lz8/a;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    invoke-interface {v0}, Lz8/m;->getWidth()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-ne v0, p1, :cond_2

    .line 11
    .line 12
    iget-object v0, p0, Ly8/c;->l:Lz8/a;

    .line 13
    .line 14
    invoke-interface {v0}, Lz8/m;->getHeight()I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eq v0, p2, :cond_1

    .line 19
    .line 20
    goto :goto_1

    .line 21
    :cond_1
    :goto_0
    return-void

    .line 22
    :cond_2
    :goto_1
    iget-object v0, p0, Ly8/c;->l:Lz8/a;

    .line 23
    .line 24
    invoke-interface {v0, p1, p2}, Lz8/m;->i(II)V

    .line 25
    .line 26
    .line 27
    const/16 p1, 0xa

    .line 28
    .line 29
    sget-object p2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 30
    .line 31
    invoke-virtual {p0, p1, p2}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    invoke-virtual {p1}, Landroid/os/Message;->sendToTarget()V

    .line 36
    .line 37
    .line 38
    return-void
.end method

.method public final E()V
    .locals 2

    .line 1
    iget-boolean v0, p0, Ly8/c;->z:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-object v0, p0, Ly8/c;->i:Ly8/h;

    .line 7
    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    invoke-interface {v0}, Ly8/h;->e()V

    .line 11
    .line 12
    .line 13
    :cond_1
    iget-boolean v0, p0, Ly8/c;->p:Z

    .line 14
    .line 15
    if-eqz v0, :cond_2

    .line 16
    .line 17
    monitor-enter p0

    .line 18
    :try_start_0
    iget-object v0, p0, Ly8/c;->n:Ljava/util/LinkedList;

    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/util/LinkedList;->clear()V

    .line 21
    .line 22
    .line 23
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 24
    iget-object v0, p0, Ly8/c;->i:Ly8/h;

    .line 25
    .line 26
    monitor-enter v0

    .line 27
    :try_start_1
    iget-object v1, p0, Ly8/c;->i:Ly8/h;

    .line 28
    .line 29
    invoke-virtual {v1}, Ljava/lang/Object;->notifyAll()V

    .line 30
    .line 31
    .line 32
    monitor-exit v0

    .line 33
    goto :goto_0

    .line 34
    :catchall_0
    move-exception v1

    .line 35
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 36
    throw v1

    .line 37
    :catchall_1
    move-exception v0

    .line 38
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 39
    throw v0

    .line 40
    :cond_2
    iget-object v0, p0, Ly8/c;->n:Ljava/util/LinkedList;

    .line 41
    .line 42
    invoke-virtual {v0}, Ljava/util/LinkedList;->clear()V

    .line 43
    .line 44
    .line 45
    const/4 v0, 0x2

    .line 46
    invoke-virtual {p0, v0}, Landroid/os/Handler;->removeMessages(I)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {p0, v0}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 50
    .line 51
    .line 52
    :goto_0
    const/4 v0, 0x0

    .line 53
    iput-boolean v0, p0, Ly8/c;->z:Z

    .line 54
    .line 55
    return-void
.end method

.method public F()V
    .locals 1

    .line 1
    const/4 v0, 0x3

    .line 2
    invoke-virtual {p0, v0}, Landroid/os/Handler;->removeMessages(I)V

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Ly8/c;->R()V

    .line 6
    .line 7
    .line 8
    const/4 v0, 0x7

    .line 9
    invoke-virtual {p0, v0}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public G()V
    .locals 1

    .line 1
    const/4 v0, 0x5

    .line 2
    invoke-virtual {p0, v0}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method public final H(Ljava/lang/Runnable;)V
    .locals 9

    .line 1
    iget-object v0, p0, Ly8/c;->i:Ly8/h;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Ly8/c;->j:Ly8/g;

    .line 6
    .line 7
    invoke-interface {v0}, Ly8/g;->c()Z

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    iget-object v3, p0, Ly8/c;->g:Lz8/e;

    .line 12
    .line 13
    iget-object v0, p0, Ly8/c;->j:Ly8/g;

    .line 14
    .line 15
    invoke-interface {v0}, Ly8/g;->getContext()Landroid/content/Context;

    .line 16
    .line 17
    .line 18
    move-result-object v4

    .line 19
    iget-object v0, p0, Ly8/c;->j:Ly8/g;

    .line 20
    .line 21
    invoke-interface {v0}, Ly8/g;->getWidth()I

    .line 22
    .line 23
    .line 24
    move-result v5

    .line 25
    iget-object v0, p0, Ly8/c;->j:Ly8/g;

    .line 26
    .line 27
    invoke-interface {v0}, Ly8/g;->getHeight()I

    .line 28
    .line 29
    .line 30
    move-result v6

    .line 31
    iget-object v0, p0, Ly8/c;->j:Ly8/g;

    .line 32
    .line 33
    invoke-interface {v0}, Ly8/g;->isHardwareAccelerated()Z

    .line 34
    .line 35
    .line 36
    move-result v7

    .line 37
    new-instance v8, Ly8/c$c;

    .line 38
    .line 39
    invoke-direct {v8, p0, p1}, Ly8/c$c;-><init>(Ly8/c;Ljava/lang/Runnable;)V

    .line 40
    .line 41
    .line 42
    move-object v1, p0

    .line 43
    invoke-virtual/range {v1 .. v8}, Ly8/c;->t(ZLz8/e;Landroid/content/Context;IIZLy8/h$a;)Ly8/h;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    iput-object p1, v1, Ly8/c;->i:Ly8/h;

    .line 48
    .line 49
    return-void

    .line 50
    :cond_0
    move-object v1, p0

    .line 51
    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    .line 52
    .line 53
    .line 54
    return-void
.end method

.method public I()V
    .locals 1

    .line 1
    const/4 v0, 0x6

    .line 2
    invoke-virtual {p0, v0}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method public final J()V
    .locals 3

    .line 1
    iget-object v0, p0, Ly8/c;->o:Ly8/i;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    iput-object v1, p0, Ly8/c;->o:Ly8/i;

    .line 7
    .line 8
    iget-object v1, p0, Ly8/c;->i:Ly8/h;

    .line 9
    .line 10
    monitor-enter v1

    .line 11
    :try_start_0
    iget-object v2, p0, Ly8/c;->i:Ly8/h;

    .line 12
    .line 13
    invoke-virtual {v2}, Ljava/lang/Object;->notifyAll()V

    .line 14
    .line 15
    .line 16
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 17
    invoke-virtual {v0}, Ly8/i;->b()V

    .line 18
    .line 19
    .line 20
    :try_start_1
    invoke-virtual {v0}, Ljava/lang/Thread;->join()V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :catch_0
    move-exception v0

    .line 25
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :catchall_0
    move-exception v0

    .line 30
    :try_start_2
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 31
    throw v0

    .line 32
    :cond_0
    return-void
.end method

.method public final declared-synchronized K()V
    .locals 3

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    invoke-static {}, Lf9/c;->b()J

    .line 3
    .line 4
    .line 5
    move-result-wide v0

    .line 6
    iget-object v2, p0, Ly8/c;->n:Ljava/util/LinkedList;

    .line 7
    .line 8
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {v2, v0}, Ljava/util/LinkedList;->addLast(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, Ly8/c;->n:Ljava/util/LinkedList;

    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/util/LinkedList;->size()I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    const/16 v1, 0x1f4

    .line 22
    .line 23
    if-le v0, v1, :cond_0

    .line 24
    .line 25
    iget-object v0, p0, Ly8/c;->n:Ljava/util/LinkedList;

    .line 26
    .line 27
    invoke-virtual {v0}, Ljava/util/LinkedList;->removeFirst()Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :catchall_0
    move-exception v0

    .line 32
    goto :goto_1

    .line 33
    :cond_0
    :goto_0
    monitor-exit p0

    .line 34
    return-void

    .line 35
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 36
    throw v0
.end method

.method public L()V
    .locals 1

    .line 1
    const/4 v0, 0x7

    .line 2
    invoke-virtual {p0, v0}, Landroid/os/Handler;->removeMessages(I)V

    .line 3
    .line 4
    .line 5
    const/4 v0, 0x3

    .line 6
    invoke-virtual {p0, v0}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public M(Ly8/c$d;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ly8/c;->f:Ly8/c$d;

    .line 2
    .line 3
    return-void
.end method

.method public N(Lmaster/flame/danmaku/danmaku/model/android/DanmakuContext;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ly8/c;->a:Lmaster/flame/danmaku/danmaku/model/android/DanmakuContext;

    .line 2
    .line 3
    return-void
.end method

.method public O(Lc9/a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ly8/c;->h:Lc9/a;

    .line 2
    .line 3
    return-void
.end method

.method public P(Ljava/lang/Long;)V
    .locals 2

    .line 1
    iget-boolean v0, p0, Ly8/c;->k:Z

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
    iput-boolean v0, p0, Ly8/c;->k:Z

    .line 8
    .line 9
    const/16 v0, 0x8

    .line 10
    .line 11
    invoke-virtual {p0, v0}, Landroid/os/Handler;->removeMessages(I)V

    .line 12
    .line 13
    .line 14
    const/16 v1, 0x9

    .line 15
    .line 16
    invoke-virtual {p0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0, v0, p1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-virtual {p1}, Landroid/os/Message;->sendToTarget()V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public final Q(J)J
    .locals 11

    .line 1
    iget-boolean v0, p0, Ly8/c;->v:Z

    .line 2
    .line 3
    const-wide/16 v1, 0x0

    .line 4
    .line 5
    if-nez v0, :cond_7

    .line 6
    .line 7
    iget-boolean v0, p0, Ly8/c;->y:Z

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    goto/16 :goto_3

    .line 12
    .line 13
    :cond_0
    const/4 v0, 0x1

    .line 14
    iput-boolean v0, p0, Ly8/c;->y:Z

    .line 15
    .line 16
    iget-wide v3, p0, Ly8/c;->d:J

    .line 17
    .line 18
    sub-long/2addr p1, v3

    .line 19
    iget-boolean v0, p0, Ly8/c;->k:Z

    .line 20
    .line 21
    if-eqz v0, :cond_5

    .line 22
    .line 23
    iget-object v0, p0, Ly8/c;->m:Ld9/a$b;

    .line 24
    .line 25
    iget-boolean v0, v0, Ld9/a$b;->p:Z

    .line 26
    .line 27
    if-nez v0, :cond_5

    .line 28
    .line 29
    iget-boolean v0, p0, Ly8/c;->z:Z

    .line 30
    .line 31
    if-eqz v0, :cond_1

    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_1
    iget-object v0, p0, Ly8/c;->g:Lz8/e;

    .line 35
    .line 36
    iget-wide v3, v0, Lz8/e;->a:J

    .line 37
    .line 38
    sub-long/2addr p1, v3

    .line 39
    iget-wide v3, p0, Ly8/c;->s:J

    .line 40
    .line 41
    invoke-virtual {p0}, Ly8/c;->v()J

    .line 42
    .line 43
    .line 44
    move-result-wide v5

    .line 45
    invoke-static {v3, v4, v5, v6}, Ljava/lang/Math;->max(JJ)J

    .line 46
    .line 47
    .line 48
    move-result-wide v3

    .line 49
    const-wide/16 v5, 0x7d0

    .line 50
    .line 51
    cmp-long v0, p1, v5

    .line 52
    .line 53
    if-gtz v0, :cond_4

    .line 54
    .line 55
    iget-object v0, p0, Ly8/c;->m:Ld9/a$b;

    .line 56
    .line 57
    iget-wide v5, v0, Ld9/a$b;->m:J

    .line 58
    .line 59
    iget-wide v7, p0, Ly8/c;->q:J

    .line 60
    .line 61
    cmp-long v0, v5, v7

    .line 62
    .line 63
    if-gtz v0, :cond_4

    .line 64
    .line 65
    cmp-long v0, v3, v7

    .line 66
    .line 67
    if-lez v0, :cond_2

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_2
    iget-wide v0, p0, Ly8/c;->s:J

    .line 71
    .line 72
    div-long v5, p1, v0

    .line 73
    .line 74
    add-long/2addr v3, v5

    .line 75
    invoke-static {v0, v1, v3, v4}, Ljava/lang/Math;->max(JJ)J

    .line 76
    .line 77
    .line 78
    move-result-wide v0

    .line 79
    iget-wide v2, p0, Ly8/c;->q:J

    .line 80
    .line 81
    invoke-static {v2, v3, v0, v1}, Ljava/lang/Math;->min(JJ)J

    .line 82
    .line 83
    .line 84
    move-result-wide v0

    .line 85
    iget-wide v2, p0, Ly8/c;->u:J

    .line 86
    .line 87
    sub-long v4, v0, v2

    .line 88
    .line 89
    const-wide/16 v6, 0x3

    .line 90
    .line 91
    cmp-long v6, v4, v6

    .line 92
    .line 93
    if-lez v6, :cond_3

    .line 94
    .line 95
    const-wide/16 v6, 0x8

    .line 96
    .line 97
    cmp-long v4, v4, v6

    .line 98
    .line 99
    if-gez v4, :cond_3

    .line 100
    .line 101
    iget-wide v4, p0, Ly8/c;->s:J

    .line 102
    .line 103
    cmp-long v4, v2, v4

    .line 104
    .line 105
    if-ltz v4, :cond_3

    .line 106
    .line 107
    iget-wide v4, p0, Ly8/c;->q:J

    .line 108
    .line 109
    cmp-long v4, v2, v4

    .line 110
    .line 111
    if-gtz v4, :cond_3

    .line 112
    .line 113
    move-wide v0, v2

    .line 114
    :cond_3
    sub-long/2addr p1, v0

    .line 115
    iput-wide v0, p0, Ly8/c;->u:J

    .line 116
    .line 117
    move-wide v9, v0

    .line 118
    move-wide v1, p1

    .line 119
    move-wide p1, v9

    .line 120
    :cond_4
    :goto_0
    iput-wide v1, p0, Ly8/c;->x:J

    .line 121
    .line 122
    iget-object v0, p0, Ly8/c;->g:Lz8/e;

    .line 123
    .line 124
    invoke-virtual {v0, p1, p2}, Lz8/e;->a(J)J

    .line 125
    .line 126
    .line 127
    move-wide v1, p1

    .line 128
    goto :goto_2

    .line 129
    :cond_5
    :goto_1
    iget-object v0, p0, Ly8/c;->g:Lz8/e;

    .line 130
    .line 131
    invoke-virtual {v0, p1, p2}, Lz8/e;->b(J)J

    .line 132
    .line 133
    .line 134
    iput-wide v1, p0, Ly8/c;->x:J

    .line 135
    .line 136
    :goto_2
    iget-object p1, p0, Ly8/c;->f:Ly8/c$d;

    .line 137
    .line 138
    if-eqz p1, :cond_6

    .line 139
    .line 140
    iget-object p2, p0, Ly8/c;->g:Lz8/e;

    .line 141
    .line 142
    invoke-interface {p1, p2}, Ly8/c$d;->c(Lz8/e;)V

    .line 143
    .line 144
    .line 145
    :cond_6
    const/4 p1, 0x0

    .line 146
    iput-boolean p1, p0, Ly8/c;->y:Z

    .line 147
    .line 148
    :cond_7
    :goto_3
    return-wide v1
.end method

.method public final R()V
    .locals 2

    .line 1
    iget-boolean v0, p0, Ly8/c;->z:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-static {}, Lf9/c;->b()J

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    invoke-virtual {p0, v0, v1}, Ly8/c;->Q(J)J

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public final S()V
    .locals 8

    .line 1
    iget-boolean v0, p0, Ly8/c;->c:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    invoke-static {}, Lf9/c;->b()J

    .line 7
    .line 8
    .line 9
    move-result-wide v0

    .line 10
    invoke-virtual {p0, v0, v1}, Ly8/c;->Q(J)J

    .line 11
    .line 12
    .line 13
    move-result-wide v0

    .line 14
    const-wide/16 v2, 0x0

    .line 15
    .line 16
    cmp-long v2, v0, v2

    .line 17
    .line 18
    const/4 v3, 0x2

    .line 19
    if-gez v2, :cond_1

    .line 20
    .line 21
    invoke-virtual {p0, v3}, Landroid/os/Handler;->removeMessages(I)V

    .line 22
    .line 23
    .line 24
    const-wide/16 v4, 0x3c

    .line 25
    .line 26
    sub-long/2addr v4, v0

    .line 27
    invoke-virtual {p0, v3, v4, v5}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :cond_1
    iget-object v0, p0, Ly8/c;->j:Ly8/g;

    .line 32
    .line 33
    invoke-interface {v0}, Ly8/g;->a()J

    .line 34
    .line 35
    .line 36
    move-result-wide v0

    .line 37
    invoke-virtual {p0, v3}, Landroid/os/Handler;->removeMessages(I)V

    .line 38
    .line 39
    .line 40
    iget-wide v4, p0, Ly8/c;->r:J

    .line 41
    .line 42
    cmp-long v2, v0, v4

    .line 43
    .line 44
    if-lez v2, :cond_2

    .line 45
    .line 46
    iget-object v2, p0, Ly8/c;->g:Lz8/e;

    .line 47
    .line 48
    invoke-virtual {v2, v0, v1}, Lz8/e;->a(J)J

    .line 49
    .line 50
    .line 51
    iget-object v2, p0, Ly8/c;->n:Ljava/util/LinkedList;

    .line 52
    .line 53
    invoke-virtual {v2}, Ljava/util/LinkedList;->clear()V

    .line 54
    .line 55
    .line 56
    :cond_2
    iget-boolean v2, p0, Ly8/c;->k:Z

    .line 57
    .line 58
    if-nez v2, :cond_3

    .line 59
    .line 60
    const-wide/32 v0, 0x989680

    .line 61
    .line 62
    .line 63
    invoke-virtual {p0, v0, v1}, Ly8/c;->U(J)V

    .line 64
    .line 65
    .line 66
    return-void

    .line 67
    :cond_3
    iget-object v2, p0, Ly8/c;->m:Ld9/a$b;

    .line 68
    .line 69
    iget-boolean v4, v2, Ld9/a$b;->p:Z

    .line 70
    .line 71
    if-eqz v4, :cond_4

    .line 72
    .line 73
    iget-boolean v4, p0, Ly8/c;->A:Z

    .line 74
    .line 75
    if-eqz v4, :cond_4

    .line 76
    .line 77
    iget-wide v4, v2, Ld9/a$b;->o:J

    .line 78
    .line 79
    iget-object v2, p0, Ly8/c;->g:Lz8/e;

    .line 80
    .line 81
    iget-wide v6, v2, Lz8/e;->a:J

    .line 82
    .line 83
    sub-long/2addr v4, v6

    .line 84
    const-wide/16 v6, 0x1f4

    .line 85
    .line 86
    cmp-long v2, v4, v6

    .line 87
    .line 88
    if-lez v2, :cond_4

    .line 89
    .line 90
    const-wide/16 v0, 0xa

    .line 91
    .line 92
    sub-long/2addr v4, v0

    .line 93
    invoke-virtual {p0, v4, v5}, Ly8/c;->U(J)V

    .line 94
    .line 95
    .line 96
    return-void

    .line 97
    :cond_4
    iget-wide v4, p0, Ly8/c;->s:J

    .line 98
    .line 99
    cmp-long v2, v0, v4

    .line 100
    .line 101
    if-gez v2, :cond_5

    .line 102
    .line 103
    sub-long/2addr v4, v0

    .line 104
    invoke-virtual {p0, v3, v4, v5}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 105
    .line 106
    .line 107
    return-void

    .line 108
    :cond_5
    invoke-virtual {p0, v3}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 109
    .line 110
    .line 111
    return-void
.end method

.method public final T()V
    .locals 2

    .line 1
    iget-object v0, p0, Ly8/c;->o:Ly8/i;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    new-instance v0, Ly8/c$b;

    .line 7
    .line 8
    const-string v1, "DFM Update"

    .line 9
    .line 10
    invoke-direct {v0, p0, v1}, Ly8/c$b;-><init>(Ly8/c;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    iput-object v0, p0, Ly8/c;->o:Ly8/i;

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public final U(J)V
    .locals 4

    .line 1
    iget-object v0, p0, Ly8/c;->m:Ld9/a$b;

    .line 2
    .line 3
    invoke-static {}, Lf9/c;->b()J

    .line 4
    .line 5
    .line 6
    move-result-wide v1

    .line 7
    iput-wide v1, v0, Ld9/a$b;->q:J

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    iput-boolean v0, p0, Ly8/c;->z:Z

    .line 11
    .line 12
    iget-boolean v0, p0, Ly8/c;->p:Z

    .line 13
    .line 14
    const-wide/32 v1, 0x989680

    .line 15
    .line 16
    .line 17
    const/16 v3, 0xb

    .line 18
    .line 19
    if-eqz v0, :cond_2

    .line 20
    .line 21
    iget-object v0, p0, Ly8/c;->o:Ly8/i;

    .line 22
    .line 23
    if-nez v0, :cond_0

    .line 24
    .line 25
    return-void

    .line 26
    :cond_0
    :try_start_0
    iget-object v0, p0, Ly8/c;->i:Ly8/h;

    .line 27
    .line 28
    monitor-enter v0
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 29
    cmp-long v1, p1, v1

    .line 30
    .line 31
    if-nez v1, :cond_1

    .line 32
    .line 33
    :try_start_1
    iget-object p1, p0, Ly8/c;->i:Ly8/h;

    .line 34
    .line 35
    invoke-virtual {p1}, Ljava/lang/Object;->wait()V

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :catchall_0
    move-exception p1

    .line 40
    goto :goto_1

    .line 41
    :cond_1
    iget-object v1, p0, Ly8/c;->i:Ly8/h;

    .line 42
    .line 43
    invoke-virtual {v1, p1, p2}, Ljava/lang/Object;->wait(J)V

    .line 44
    .line 45
    .line 46
    :goto_0
    invoke-virtual {p0, v3}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 47
    .line 48
    .line 49
    monitor-exit v0

    .line 50
    return-void

    .line 51
    :goto_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 52
    :try_start_2
    throw p1
    :try_end_2
    .catch Ljava/lang/InterruptedException; {:try_start_2 .. :try_end_2} :catch_0

    .line 53
    :catch_0
    move-exception p1

    .line 54
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 55
    .line 56
    .line 57
    return-void

    .line 58
    :cond_2
    cmp-long v0, p1, v1

    .line 59
    .line 60
    const/4 v1, 0x2

    .line 61
    if-nez v0, :cond_3

    .line 62
    .line 63
    invoke-virtual {p0, v3}, Landroid/os/Handler;->removeMessages(I)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {p0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 67
    .line 68
    .line 69
    return-void

    .line 70
    :cond_3
    invoke-virtual {p0, v3}, Landroid/os/Handler;->removeMessages(I)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {p0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {p0, v3, p1, p2}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 77
    .line 78
    .line 79
    return-void
.end method

.method public handleMessage(Landroid/os/Message;)V
    .locals 11

    .line 1
    iget v0, p1, Landroid/os/Message;->what:I

    .line 2
    .line 3
    const-wide/16 v1, 0x64

    .line 4
    .line 5
    const/4 v3, 0x2

    .line 6
    const/4 v4, 0x3

    .line 7
    const/4 v5, 0x0

    .line 8
    const/4 v6, 0x1

    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    goto/16 :goto_4

    .line 13
    .line 14
    :pswitch_0
    iget-object p1, p0, Ly8/c;->i:Ly8/h;

    .line 15
    .line 16
    if-eqz p1, :cond_13

    .line 17
    .line 18
    invoke-virtual {p0}, Ly8/c;->x()J

    .line 19
    .line 20
    .line 21
    move-result-wide v0

    .line 22
    invoke-interface {p1, v0, v1}, Ly8/h;->j(J)V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :pswitch_1
    iget-boolean p1, p0, Ly8/c;->c:Z

    .line 27
    .line 28
    if-eqz p1, :cond_13

    .line 29
    .line 30
    iget-object p1, p0, Ly8/c;->j:Ly8/g;

    .line 31
    .line 32
    if-eqz p1, :cond_13

    .line 33
    .line 34
    iget-object p1, p0, Ly8/c;->i:Ly8/h;

    .line 35
    .line 36
    invoke-interface {p1}, Ly8/h;->e()V

    .line 37
    .line 38
    .line 39
    iget-object p1, p0, Ly8/c;->j:Ly8/g;

    .line 40
    .line 41
    invoke-interface {p1}, Ly8/g;->a()J

    .line 42
    .line 43
    .line 44
    invoke-virtual {p0}, Ly8/c;->E()V

    .line 45
    .line 46
    .line 47
    return-void

    .line 48
    :pswitch_2
    invoke-virtual {p0}, Ly8/c;->E()V

    .line 49
    .line 50
    .line 51
    return-void

    .line 52
    :pswitch_3
    iget-object v0, p0, Ly8/c;->a:Lmaster/flame/danmaku/danmaku/model/android/DanmakuContext;

    .line 53
    .line 54
    iget-object v1, v0, Lmaster/flame/danmaku/danmaku/model/android/DanmakuContext;->A:La9/c;

    .line 55
    .line 56
    invoke-virtual {v1, v0}, La9/c;->h(Lmaster/flame/danmaku/danmaku/model/android/DanmakuContext;)V

    .line 57
    .line 58
    .line 59
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast p1, Ljava/lang/Boolean;

    .line 62
    .line 63
    if-eqz p1, :cond_13

    .line 64
    .line 65
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 66
    .line 67
    .line 68
    move-result p1

    .line 69
    if-eqz p1, :cond_13

    .line 70
    .line 71
    iget-object p1, p0, Ly8/c;->a:Lmaster/flame/danmaku/danmaku/model/android/DanmakuContext;

    .line 72
    .line 73
    iget-object p1, p1, Lmaster/flame/danmaku/danmaku/model/android/DanmakuContext;->y:Lz8/i;

    .line 74
    .line 75
    invoke-virtual {p1}, Lz8/i;->c()V

    .line 76
    .line 77
    .line 78
    iget-object p1, p0, Ly8/c;->a:Lmaster/flame/danmaku/danmaku/model/android/DanmakuContext;

    .line 79
    .line 80
    iget-object p1, p1, Lmaster/flame/danmaku/danmaku/model/android/DanmakuContext;->y:Lz8/i;

    .line 81
    .line 82
    invoke-virtual {p1}, Lz8/i;->f()V

    .line 83
    .line 84
    .line 85
    iget-object p1, p0, Ly8/c;->i:Ly8/h;

    .line 86
    .line 87
    invoke-interface {p1}, Ly8/h;->h()V

    .line 88
    .line 89
    .line 90
    return-void

    .line 91
    :pswitch_4
    iput-boolean v5, p0, Ly8/c;->k:Z

    .line 92
    .line 93
    iget-object v1, p0, Ly8/c;->j:Ly8/g;

    .line 94
    .line 95
    if-eqz v1, :cond_0

    .line 96
    .line 97
    invoke-interface {v1}, Ly8/g;->clear()V

    .line 98
    .line 99
    .line 100
    :cond_0
    iget-object v1, p0, Ly8/c;->i:Ly8/h;

    .line 101
    .line 102
    if-eqz v1, :cond_1

    .line 103
    .line 104
    invoke-interface {v1}, Ly8/h;->e()V

    .line 105
    .line 106
    .line 107
    iget-object v1, p0, Ly8/c;->i:Ly8/h;

    .line 108
    .line 109
    invoke-interface {v1}, Ly8/h;->k()V

    .line 110
    .line 111
    .line 112
    :cond_1
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 113
    .line 114
    check-cast p1, Ljava/lang/Boolean;

    .line 115
    .line 116
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 117
    .line 118
    .line 119
    move-result v1

    .line 120
    if-eqz v1, :cond_2

    .line 121
    .line 122
    iget-object v1, p0, Ly8/c;->i:Ly8/h;

    .line 123
    .line 124
    if-eqz v1, :cond_2

    .line 125
    .line 126
    invoke-interface {v1}, Ly8/h;->i()V

    .line 127
    .line 128
    .line 129
    :cond_2
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 130
    .line 131
    .line 132
    move-result p1

    .line 133
    if-nez p1, :cond_6

    .line 134
    .line 135
    goto/16 :goto_4

    .line 136
    .line 137
    :pswitch_5
    iput-boolean v6, p0, Ly8/c;->k:Z

    .line 138
    .line 139
    iget-object v7, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 140
    .line 141
    check-cast v7, Ljava/lang/Long;

    .line 142
    .line 143
    iget-object v8, p0, Ly8/c;->i:Ly8/h;

    .line 144
    .line 145
    if-eqz v8, :cond_4

    .line 146
    .line 147
    if-nez v7, :cond_3

    .line 148
    .line 149
    iget-object v7, p0, Ly8/c;->g:Lz8/e;

    .line 150
    .line 151
    invoke-virtual {p0}, Ly8/c;->x()J

    .line 152
    .line 153
    .line 154
    move-result-wide v8

    .line 155
    invoke-virtual {v7, v8, v9}, Lz8/e;->b(J)J

    .line 156
    .line 157
    .line 158
    iget-object v7, p0, Ly8/c;->i:Ly8/h;

    .line 159
    .line 160
    invoke-interface {v7}, Ly8/h;->e()V

    .line 161
    .line 162
    .line 163
    goto :goto_0

    .line 164
    :cond_3
    invoke-interface {v8}, Ly8/h;->start()V

    .line 165
    .line 166
    .line 167
    iget-object v8, p0, Ly8/c;->i:Ly8/h;

    .line 168
    .line 169
    invoke-virtual {v7}, Ljava/lang/Long;->longValue()J

    .line 170
    .line 171
    .line 172
    move-result-wide v9

    .line 173
    invoke-interface {v8, v9, v10}, Ly8/h;->f(J)V

    .line 174
    .line 175
    .line 176
    iget-object v7, p0, Ly8/c;->i:Ly8/h;

    .line 177
    .line 178
    invoke-interface {v7}, Ly8/h;->e()V

    .line 179
    .line 180
    .line 181
    move v7, v6

    .line 182
    goto :goto_1

    .line 183
    :cond_4
    :goto_0
    move v7, v5

    .line 184
    :goto_1
    iget-boolean v8, p0, Ly8/c;->c:Z

    .line 185
    .line 186
    if-eqz v8, :cond_5

    .line 187
    .line 188
    iget-object v8, p0, Ly8/c;->j:Ly8/g;

    .line 189
    .line 190
    if-eqz v8, :cond_5

    .line 191
    .line 192
    invoke-interface {v8}, Ly8/g;->a()J

    .line 193
    .line 194
    .line 195
    :cond_5
    invoke-virtual {p0}, Ly8/c;->E()V

    .line 196
    .line 197
    .line 198
    if-nez v7, :cond_f

    .line 199
    .line 200
    goto/16 :goto_4

    .line 201
    .line 202
    :cond_6
    :pswitch_6
    invoke-virtual {p0, v4}, Landroid/os/Handler;->removeMessages(I)V

    .line 203
    .line 204
    .line 205
    invoke-virtual {p0, v3}, Landroid/os/Handler;->removeMessages(I)V

    .line 206
    .line 207
    .line 208
    iget-object p1, p0, Ly8/c;->i:Ly8/h;

    .line 209
    .line 210
    if-eqz p1, :cond_7

    .line 211
    .line 212
    invoke-interface {p1, v3}, Ly8/h;->b(I)V

    .line 213
    .line 214
    .line 215
    :cond_7
    :pswitch_7
    const/4 p1, 0x6

    .line 216
    if-ne v0, p1, :cond_8

    .line 217
    .line 218
    const/4 v1, 0x0

    .line 219
    invoke-virtual {p0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 220
    .line 221
    .line 222
    :cond_8
    iput-boolean v6, p0, Ly8/c;->c:Z

    .line 223
    .line 224
    invoke-virtual {p0}, Ly8/c;->R()V

    .line 225
    .line 226
    .line 227
    iget-object v1, p0, Ly8/c;->g:Lz8/e;

    .line 228
    .line 229
    iget-wide v1, v1, Lz8/e;->a:J

    .line 230
    .line 231
    iput-wide v1, p0, Ly8/c;->b:J

    .line 232
    .line 233
    iget-object v1, p0, Ly8/c;->o:Ly8/i;

    .line 234
    .line 235
    if-eqz v1, :cond_9

    .line 236
    .line 237
    invoke-virtual {p0}, Ly8/c;->E()V

    .line 238
    .line 239
    .line 240
    invoke-virtual {p0}, Ly8/c;->J()V

    .line 241
    .line 242
    .line 243
    :cond_9
    if-ne v0, p1, :cond_13

    .line 244
    .line 245
    iget-object p1, p0, Ly8/c;->i:Ly8/h;

    .line 246
    .line 247
    if-eqz p1, :cond_a

    .line 248
    .line 249
    invoke-interface {p1}, Ly8/h;->i()V

    .line 250
    .line 251
    .line 252
    :cond_a
    iget-object p1, p0, Ly8/c;->h:Lc9/a;

    .line 253
    .line 254
    if-eqz p1, :cond_b

    .line 255
    .line 256
    invoke-virtual {p1}, Lc9/a;->d()V

    .line 257
    .line 258
    .line 259
    :cond_b
    invoke-virtual {p0}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    .line 260
    .line 261
    .line 262
    move-result-object p1

    .line 263
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 264
    .line 265
    .line 266
    move-result-object v0

    .line 267
    if-eq p1, v0, :cond_13

    .line 268
    .line 269
    invoke-virtual {p0}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    .line 270
    .line 271
    .line 272
    move-result-object p1

    .line 273
    invoke-virtual {p1}, Landroid/os/Looper;->quit()V

    .line 274
    .line 275
    .line 276
    return-void

    .line 277
    :pswitch_8
    invoke-static {}, Lf9/c;->b()J

    .line 278
    .line 279
    .line 280
    move-result-wide v3

    .line 281
    iput-wide v3, p0, Ly8/c;->d:J

    .line 282
    .line 283
    iget-object p1, p0, Ly8/c;->h:Lc9/a;

    .line 284
    .line 285
    if-eqz p1, :cond_d

    .line 286
    .line 287
    iget-object p1, p0, Ly8/c;->j:Ly8/g;

    .line 288
    .line 289
    invoke-interface {p1}, Ly8/g;->b()Z

    .line 290
    .line 291
    .line 292
    move-result p1

    .line 293
    if-nez p1, :cond_c

    .line 294
    .line 295
    goto :goto_2

    .line 296
    :cond_c
    new-instance p1, Ly8/c$a;

    .line 297
    .line 298
    invoke-direct {p1, p0}, Ly8/c$a;-><init>(Ly8/c;)V

    .line 299
    .line 300
    .line 301
    invoke-virtual {p0, p1}, Ly8/c;->H(Ljava/lang/Runnable;)V

    .line 302
    .line 303
    .line 304
    return-void

    .line 305
    :cond_d
    :goto_2
    const/4 p1, 0x5

    .line 306
    invoke-virtual {p0, p1, v1, v2}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 307
    .line 308
    .line 309
    return-void

    .line 310
    :pswitch_9
    iget-boolean p1, p0, Ly8/c;->p:Z

    .line 311
    .line 312
    if-eqz p1, :cond_e

    .line 313
    .line 314
    invoke-virtual {p0}, Ly8/c;->T()V

    .line 315
    .line 316
    .line 317
    return-void

    .line 318
    :cond_e
    invoke-virtual {p0}, Ly8/c;->S()V

    .line 319
    .line 320
    .line 321
    return-void

    .line 322
    :cond_f
    :pswitch_a
    iget-object v7, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 323
    .line 324
    check-cast v7, Ljava/lang/Long;

    .line 325
    .line 326
    if-eqz v7, :cond_10

    .line 327
    .line 328
    invoke-virtual {v7}, Ljava/lang/Long;->longValue()J

    .line 329
    .line 330
    .line 331
    move-result-wide v7

    .line 332
    iput-wide v7, p0, Ly8/c;->b:J

    .line 333
    .line 334
    goto :goto_3

    .line 335
    :cond_10
    const-wide/16 v7, 0x0

    .line 336
    .line 337
    iput-wide v7, p0, Ly8/c;->b:J

    .line 338
    .line 339
    :goto_3
    :pswitch_b
    const/4 v7, 0x4

    .line 340
    if-ne v0, v7, :cond_12

    .line 341
    .line 342
    iput-boolean v6, p0, Ly8/c;->c:Z

    .line 343
    .line 344
    invoke-virtual {p0}, Ly8/c;->J()V

    .line 345
    .line 346
    .line 347
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 348
    .line 349
    check-cast p1, Ljava/lang/Long;

    .line 350
    .line 351
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 352
    .line 353
    .line 354
    move-result-wide v7

    .line 355
    iget-object v0, p0, Ly8/c;->g:Lz8/e;

    .line 356
    .line 357
    iget-wide v9, v0, Lz8/e;->a:J

    .line 358
    .line 359
    sub-long/2addr v7, v9

    .line 360
    iget-wide v9, p0, Ly8/c;->d:J

    .line 361
    .line 362
    sub-long/2addr v9, v7

    .line 363
    iput-wide v9, p0, Ly8/c;->d:J

    .line 364
    .line 365
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 366
    .line 367
    .line 368
    move-result-wide v7

    .line 369
    invoke-virtual {v0, v7, v8}, Lz8/e;->b(J)J

    .line 370
    .line 371
    .line 372
    iget-object v0, p0, Ly8/c;->a:Lmaster/flame/danmaku/danmaku/model/android/DanmakuContext;

    .line 373
    .line 374
    iget-object v0, v0, Lmaster/flame/danmaku/danmaku/model/android/DanmakuContext;->y:Lz8/i;

    .line 375
    .line 376
    invoke-virtual {v0}, Lz8/i;->c()V

    .line 377
    .line 378
    .line 379
    iget-object v0, p0, Ly8/c;->i:Ly8/h;

    .line 380
    .line 381
    if-eqz v0, :cond_11

    .line 382
    .line 383
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 384
    .line 385
    .line 386
    move-result-wide v7

    .line 387
    invoke-interface {v0, v7, v8}, Ly8/h;->f(J)V

    .line 388
    .line 389
    .line 390
    :cond_11
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 391
    .line 392
    .line 393
    move-result-wide v7

    .line 394
    iput-wide v7, p0, Ly8/c;->b:J

    .line 395
    .line 396
    :cond_12
    :pswitch_c
    const/4 p1, 0x7

    .line 397
    invoke-virtual {p0, p1}, Landroid/os/Handler;->removeMessages(I)V

    .line 398
    .line 399
    .line 400
    iput-boolean v5, p0, Ly8/c;->c:Z

    .line 401
    .line 402
    iget-boolean p1, p0, Ly8/c;->e:Z

    .line 403
    .line 404
    if-eqz p1, :cond_14

    .line 405
    .line 406
    iget-object p1, p0, Ly8/c;->m:Ld9/a$b;

    .line 407
    .line 408
    invoke-virtual {p1}, Ld9/a$b;->d()V

    .line 409
    .line 410
    .line 411
    iget-object p1, p0, Ly8/c;->n:Ljava/util/LinkedList;

    .line 412
    .line 413
    invoke-virtual {p1}, Ljava/util/LinkedList;->clear()V

    .line 414
    .line 415
    .line 416
    invoke-static {}, Lf9/c;->b()J

    .line 417
    .line 418
    .line 419
    move-result-wide v0

    .line 420
    iget-wide v7, p0, Ly8/c;->b:J

    .line 421
    .line 422
    sub-long/2addr v0, v7

    .line 423
    iput-wide v0, p0, Ly8/c;->d:J

    .line 424
    .line 425
    iget-object p1, p0, Ly8/c;->g:Lz8/e;

    .line 426
    .line 427
    invoke-virtual {p1, v7, v8}, Lz8/e;->b(J)J

    .line 428
    .line 429
    .line 430
    invoke-virtual {p0, v4}, Landroid/os/Handler;->removeMessages(I)V

    .line 431
    .line 432
    .line 433
    invoke-virtual {p0, v3}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 434
    .line 435
    .line 436
    iget-object p1, p0, Ly8/c;->i:Ly8/h;

    .line 437
    .line 438
    invoke-interface {p1}, Ly8/h;->start()V

    .line 439
    .line 440
    .line 441
    invoke-virtual {p0}, Ly8/c;->E()V

    .line 442
    .line 443
    .line 444
    iput-boolean v5, p0, Ly8/c;->v:Z

    .line 445
    .line 446
    iget-object p1, p0, Ly8/c;->i:Ly8/h;

    .line 447
    .line 448
    if-eqz p1, :cond_13

    .line 449
    .line 450
    invoke-interface {p1, v6}, Ly8/h;->b(I)V

    .line 451
    .line 452
    .line 453
    :cond_13
    :goto_4
    return-void

    .line 454
    :cond_14
    invoke-virtual {p0, v4, v1, v2}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 455
    .line 456
    .line 457
    return-void

    .line 458
    nop

    .line 459
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_a
        :pswitch_9
        :pswitch_c
        :pswitch_b
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public r(Lz8/c;)V
    .locals 1

    .line 1
    iget-object v0, p0, Ly8/c;->i:Ly8/h;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Ly8/c;->a:Lmaster/flame/danmaku/danmaku/model/android/DanmakuContext;

    .line 6
    .line 7
    iget-object v0, v0, Lmaster/flame/danmaku/danmaku/model/android/DanmakuContext;->y:Lz8/i;

    .line 8
    .line 9
    iput-object v0, p1, Lz8/c;->H:Lz8/i;

    .line 10
    .line 11
    iget-object v0, p0, Ly8/c;->g:Lz8/e;

    .line 12
    .line 13
    invoke-virtual {p1, v0}, Lz8/c;->C(Lz8/e;)V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Ly8/c;->i:Ly8/h;

    .line 17
    .line 18
    invoke-interface {v0, p1}, Ly8/h;->a(Lz8/c;)V

    .line 19
    .line 20
    .line 21
    const/16 p1, 0xb

    .line 22
    .line 23
    invoke-virtual {p0, p1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-virtual {p1}, Landroid/os/Message;->sendToTarget()V

    .line 28
    .line 29
    .line 30
    :cond_0
    return-void
.end method

.method public final s(Ly8/g;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ly8/c;->j:Ly8/g;

    .line 2
    .line 3
    return-void
.end method

.method public final t(ZLz8/e;Landroid/content/Context;IIZLy8/h$a;)Ly8/h;
    .locals 2

    .line 1
    iget-object v0, p0, Ly8/c;->a:Lmaster/flame/danmaku/danmaku/model/android/DanmakuContext;

    .line 2
    .line 3
    invoke-virtual {v0}, Lmaster/flame/danmaku/danmaku/model/android/DanmakuContext;->b()Lz8/a;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iput-object v0, p0, Ly8/c;->l:Lz8/a;

    .line 8
    .line 9
    invoke-interface {v0, p4, p5}, Lz8/m;->i(II)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 13
    .line 14
    .line 15
    move-result-object p4

    .line 16
    invoke-virtual {p4}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 17
    .line 18
    .line 19
    move-result-object p4

    .line 20
    iget-object p5, p0, Ly8/c;->l:Lz8/a;

    .line 21
    .line 22
    iget v0, p4, Landroid/util/DisplayMetrics;->density:F

    .line 23
    .line 24
    iget v1, p4, Landroid/util/DisplayMetrics;->densityDpi:I

    .line 25
    .line 26
    iget p4, p4, Landroid/util/DisplayMetrics;->scaledDensity:F

    .line 27
    .line 28
    invoke-interface {p5, v0, v1, p4}, Lz8/m;->d(FIF)V

    .line 29
    .line 30
    .line 31
    iget-object p4, p0, Ly8/c;->l:Lz8/a;

    .line 32
    .line 33
    iget-object p5, p0, Ly8/c;->a:Lmaster/flame/danmaku/danmaku/model/android/DanmakuContext;

    .line 34
    .line 35
    iget p5, p5, Lmaster/flame/danmaku/danmaku/model/android/DanmakuContext;->c:F

    .line 36
    .line 37
    invoke-interface {p4, p5}, Lz8/m;->a(F)V

    .line 38
    .line 39
    .line 40
    iget-object p4, p0, Ly8/c;->l:Lz8/a;

    .line 41
    .line 42
    invoke-interface {p4, p6}, Lz8/m;->m(Z)V

    .line 43
    .line 44
    .line 45
    if-eqz p1, :cond_0

    .line 46
    .line 47
    new-instance p1, Ly8/a;

    .line 48
    .line 49
    iget-object p4, p0, Ly8/c;->a:Lmaster/flame/danmaku/danmaku/model/android/DanmakuContext;

    .line 50
    .line 51
    const/high16 p5, 0x100000

    .line 52
    .line 53
    invoke-static {p3}, Lf9/a;->a(Landroid/content/Context;)I

    .line 54
    .line 55
    .line 56
    move-result p3

    .line 57
    mul-int/2addr p3, p5

    .line 58
    div-int/lit8 p3, p3, 0x3

    .line 59
    .line 60
    invoke-direct {p1, p2, p4, p7, p3}, Ly8/a;-><init>(Lz8/e;Lmaster/flame/danmaku/danmaku/model/android/DanmakuContext;Ly8/h$a;I)V

    .line 61
    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_0
    new-instance p1, Ly8/e;

    .line 65
    .line 66
    iget-object p3, p0, Ly8/c;->a:Lmaster/flame/danmaku/danmaku/model/android/DanmakuContext;

    .line 67
    .line 68
    invoke-direct {p1, p2, p3, p7}, Ly8/e;-><init>(Lz8/e;Lmaster/flame/danmaku/danmaku/model/android/DanmakuContext;Ly8/h$a;)V

    .line 69
    .line 70
    .line 71
    :goto_0
    iget-object p2, p0, Ly8/c;->h:Lc9/a;

    .line 72
    .line 73
    invoke-interface {p1, p2}, Ly8/h;->g(Lc9/a;)V

    .line 74
    .line 75
    .line 76
    invoke-interface {p1}, Ly8/h;->prepare()V

    .line 77
    .line 78
    .line 79
    const/16 p2, 0xa

    .line 80
    .line 81
    sget-object p3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 82
    .line 83
    invoke-virtual {p0, p2, p3}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    .line 84
    .line 85
    .line 86
    move-result-object p2

    .line 87
    invoke-virtual {p2}, Landroid/os/Message;->sendToTarget()V

    .line 88
    .line 89
    .line 90
    return-object p1
.end method

.method public u(Landroid/graphics/Canvas;)Ld9/a$b;
    .locals 2

    .line 1
    iget-object v0, p0, Ly8/c;->i:Ly8/h;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object p1, p0, Ly8/c;->m:Ld9/a$b;

    .line 6
    .line 7
    return-object p1

    .line 8
    :cond_0
    iget-boolean v0, p0, Ly8/c;->c:Z

    .line 9
    .line 10
    if-nez v0, :cond_1

    .line 11
    .line 12
    iget-boolean v0, p0, Ly8/c;->z:Z

    .line 13
    .line 14
    if-nez v0, :cond_1

    .line 15
    .line 16
    iget-object v0, p0, Ly8/c;->a:Lmaster/flame/danmaku/danmaku/model/android/DanmakuContext;

    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    :cond_1
    iget-object v0, p0, Ly8/c;->l:Lz8/a;

    .line 22
    .line 23
    invoke-virtual {v0, p1}, Lz8/a;->q(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    iget-object p1, p0, Ly8/c;->m:Ld9/a$b;

    .line 27
    .line 28
    iget-object v0, p0, Ly8/c;->i:Ly8/h;

    .line 29
    .line 30
    iget-object v1, p0, Ly8/c;->l:Lz8/a;

    .line 31
    .line 32
    invoke-interface {v0, v1}, Ly8/h;->c(Lz8/a;)Ld9/a$b;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-virtual {p1, v0}, Ld9/a$b;->e(Ld9/a$b;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {p0}, Ly8/c;->K()V

    .line 40
    .line 41
    .line 42
    iget-object p1, p0, Ly8/c;->m:Ld9/a$b;

    .line 43
    .line 44
    return-object p1
.end method

.method public final declared-synchronized v()J
    .locals 5

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Ly8/c;->n:Ljava/util/LinkedList;

    .line 3
    .line 4
    invoke-virtual {v0}, Ljava/util/LinkedList;->size()I

    .line 5
    .line 6
    .line 7
    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 8
    if-gtz v0, :cond_0

    .line 9
    .line 10
    monitor-exit p0

    .line 11
    const-wide/16 v0, 0x0

    .line 12
    .line 13
    return-wide v0

    .line 14
    :cond_0
    :try_start_1
    iget-object v1, p0, Ly8/c;->n:Ljava/util/LinkedList;

    .line 15
    .line 16
    invoke-virtual {v1}, Ljava/util/LinkedList;->getLast()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    check-cast v1, Ljava/lang/Long;

    .line 21
    .line 22
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 23
    .line 24
    .line 25
    move-result-wide v1

    .line 26
    iget-object v3, p0, Ly8/c;->n:Ljava/util/LinkedList;

    .line 27
    .line 28
    invoke-virtual {v3}, Ljava/util/LinkedList;->getFirst()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    check-cast v3, Ljava/lang/Long;

    .line 33
    .line 34
    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    .line 35
    .line 36
    .line 37
    move-result-wide v3

    .line 38
    sub-long/2addr v1, v3

    .line 39
    int-to-long v3, v0

    .line 40
    div-long/2addr v1, v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 41
    monitor-exit p0

    .line 42
    return-wide v1

    .line 43
    :catchall_0
    move-exception v0

    .line 44
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 45
    throw v0
.end method

.method public w()Lmaster/flame/danmaku/danmaku/model/android/DanmakuContext;
    .locals 1

    .line 1
    iget-object v0, p0, Ly8/c;->a:Lmaster/flame/danmaku/danmaku/model/android/DanmakuContext;

    .line 2
    .line 3
    return-object v0
.end method

.method public x()J
    .locals 4

    .line 1
    iget-boolean v0, p0, Ly8/c;->e:Z

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
    iget-boolean v0, p0, Ly8/c;->v:Z

    .line 9
    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    iget-wide v0, p0, Ly8/c;->w:J

    .line 13
    .line 14
    return-wide v0

    .line 15
    :cond_1
    iget-boolean v0, p0, Ly8/c;->c:Z

    .line 16
    .line 17
    if-nez v0, :cond_3

    .line 18
    .line 19
    iget-boolean v0, p0, Ly8/c;->z:Z

    .line 20
    .line 21
    if-nez v0, :cond_2

    .line 22
    .line 23
    goto :goto_1

    .line 24
    :cond_2
    invoke-static {}, Lf9/c;->b()J

    .line 25
    .line 26
    .line 27
    move-result-wide v0

    .line 28
    iget-wide v2, p0, Ly8/c;->d:J

    .line 29
    .line 30
    :goto_0
    sub-long/2addr v0, v2

    .line 31
    return-wide v0

    .line 32
    :cond_3
    :goto_1
    iget-object v0, p0, Ly8/c;->g:Lz8/e;

    .line 33
    .line 34
    iget-wide v0, v0, Lz8/e;->a:J

    .line 35
    .line 36
    iget-wide v2, p0, Ly8/c;->x:J

    .line 37
    .line 38
    goto :goto_0
.end method

.method public y()Lz8/l;
    .locals 3

    .line 1
    iget-object v0, p0, Ly8/c;->i:Ly8/h;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Ly8/c;->x()J

    .line 6
    .line 7
    .line 8
    move-result-wide v1

    .line 9
    invoke-interface {v0, v1, v2}, Ly8/h;->d(J)Lz8/l;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    return-object v0

    .line 14
    :cond_0
    const/4 v0, 0x0

    .line 15
    return-object v0
.end method

.method public z(Z)J
    .locals 2

    .line 1
    iget-boolean v0, p0, Ly8/c;->k:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object p1, p0, Ly8/c;->g:Lz8/e;

    .line 6
    .line 7
    iget-wide v0, p1, Lz8/e;->a:J

    .line 8
    .line 9
    return-wide v0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    iput-boolean v0, p0, Ly8/c;->k:Z

    .line 12
    .line 13
    const/16 v0, 0x8

    .line 14
    .line 15
    invoke-virtual {p0, v0}, Landroid/os/Handler;->removeMessages(I)V

    .line 16
    .line 17
    .line 18
    const/16 v0, 0x9

    .line 19
    .line 20
    invoke-virtual {p0, v0}, Landroid/os/Handler;->removeMessages(I)V

    .line 21
    .line 22
    .line 23
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-virtual {p0, v0, p1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-virtual {p1}, Landroid/os/Message;->sendToTarget()V

    .line 32
    .line 33
    .line 34
    iget-object p1, p0, Ly8/c;->g:Lz8/e;

    .line 35
    .line 36
    iget-wide v0, p1, Lz8/e;->a:J

    .line 37
    .line 38
    return-wide v0
.end method
