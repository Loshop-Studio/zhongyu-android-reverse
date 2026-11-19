.class public Ly8/a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lz8/j;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ly8/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ly8/a$a$a;
    }
.end annotation


# instance fields
.field public a:Landroid/os/HandlerThread;

.field public b:La9/d;

.field public c:La9/g;

.field public d:Lb9/b;

.field public e:I

.field public f:I

.field public g:I

.field public h:Ly8/a$a$a;

.field public i:Z

.field public final synthetic j:Ly8/a;


# direct methods
.method public constructor <init>(Ly8/a;II)V
    .locals 1

    .line 1
    iput-object p1, p0, Ly8/a$a;->j:Ly8/a;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance p1, La9/d;

    .line 7
    .line 8
    invoke-direct {p1}, La9/d;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, Ly8/a$a;->b:La9/d;

    .line 12
    .line 13
    new-instance p1, La9/g;

    .line 14
    .line 15
    invoke-direct {p1}, La9/g;-><init>()V

    .line 16
    .line 17
    .line 18
    iput-object p1, p0, Ly8/a$a;->c:La9/g;

    .line 19
    .line 20
    const/16 v0, 0x320

    .line 21
    .line 22
    invoke-static {p1, v0}, Lb9/e;->a(Lb9/d;I)Lb9/b;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    iput-object p1, p0, Ly8/a$a;->d:Lb9/b;

    .line 27
    .line 28
    const/4 p1, 0x0

    .line 29
    iput-boolean p1, p0, Ly8/a$a;->i:Z

    .line 30
    .line 31
    iput p1, p0, Ly8/a$a;->f:I

    .line 32
    .line 33
    iput p2, p0, Ly8/a$a;->e:I

    .line 34
    .line 35
    iput p3, p0, Ly8/a$a;->g:I

    .line 36
    .line 37
    return-void
.end method

.method public static synthetic b(Ly8/a$a;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Ly8/a$a;->u()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic c(Ly8/a$a;Lz8/c;ZI)Lz8/c;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3}, Ly8/a$a;->w(Lz8/c;ZI)Lz8/c;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic d(Ly8/a$a;)I
    .locals 0

    .line 1
    iget p0, p0, Ly8/a$a;->f:I

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic e(Ly8/a$a;)I
    .locals 0

    .line 1
    iget p0, p0, Ly8/a$a;->e:I

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic f(Ly8/a$a;Lz8/c;IZ)Z
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3}, Ly8/a$a;->A(Lz8/c;IZ)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static synthetic g(Ly8/a$a;Lz8/c;)J
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Ly8/a$a;->n(Lz8/c;)J

    .line 2
    .line 3
    .line 4
    move-result-wide p0

    .line 5
    return-wide p0
.end method

.method public static synthetic h(Ly8/a$a;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Ly8/a$a;->p()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic i(Ly8/a$a;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Ly8/a$a;->t()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic j(Ly8/a$a;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Ly8/a$a;->o()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic k(Ly8/a$a;Z)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Ly8/a$a;->v(Z)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic l(Ly8/a$a;)I
    .locals 0

    .line 1
    iget p0, p0, Ly8/a$a;->g:I

    .line 2
    .line 3
    return p0
.end method


# virtual methods
.method public final A(Lz8/c;IZ)Z
    .locals 3

    .line 1
    :goto_0
    iget v0, p0, Ly8/a$a;->f:I

    .line 2
    .line 3
    add-int/2addr v0, p2

    .line 4
    iget v1, p0, Ly8/a$a;->e:I

    .line 5
    .line 6
    if-le v0, v1, :cond_2

    .line 7
    .line 8
    iget-object v0, p0, Ly8/a$a;->b:La9/d;

    .line 9
    .line 10
    invoke-virtual {v0}, La9/d;->size()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-lez v0, :cond_2

    .line 15
    .line 16
    iget-object v0, p0, Ly8/a$a;->b:La9/d;

    .line 17
    .line 18
    invoke-virtual {v0}, La9/d;->first()Lz8/c;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-virtual {v0}, Lz8/c;->w()Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    const/4 v2, 0x0

    .line 27
    if-eqz v1, :cond_0

    .line 28
    .line 29
    invoke-virtual {p0, v2, v0, p1}, Ly8/a$a;->s(ZLz8/c;Lz8/c;)V

    .line 30
    .line 31
    .line 32
    iget-object v1, p0, Ly8/a$a;->b:La9/d;

    .line 33
    .line 34
    invoke-virtual {v1, v0}, La9/d;->b(Lz8/c;)Z

    .line 35
    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    if-eqz p3, :cond_1

    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_1
    return v2

    .line 42
    :cond_2
    :goto_1
    iget-object p3, p0, Ly8/a$a;->b:La9/d;

    .line 43
    .line 44
    invoke-virtual {p3, p1}, La9/d;->e(Lz8/c;)Z

    .line 45
    .line 46
    .line 47
    iget p1, p0, Ly8/a$a;->f:I

    .line 48
    .line 49
    add-int/2addr p1, p2

    .line 50
    iput p1, p0, Ly8/a$a;->f:I

    .line 51
    .line 52
    const/4 p1, 0x1

    .line 53
    return p1
.end method

.method public B(J)V
    .locals 1

    .line 1
    iget-object v0, p0, Ly8/a$a;->h:Ly8/a$a$a;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0, p1, p2}, Ly8/a$a$a;->k(J)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public C()V
    .locals 2

    .line 1
    iget-object v0, p0, Ly8/a$a;->h:Ly8/a$a$a;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    const/4 v1, 0x4

    .line 7
    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Ly8/a$a;->h:Ly8/a$a$a;

    .line 11
    .line 12
    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public D()V
    .locals 1

    .line 1
    iget-object v0, p0, Ly8/a$a;->h:Ly8/a$a$a;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Ly8/a$a$a;->m()V

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    invoke-virtual {p0}, Ly8/a$a;->m()V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public E(J)V
    .locals 2

    .line 1
    iget-object v0, p0, Ly8/a$a;->h:Ly8/a$a$a;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    invoke-virtual {v0}, Ly8/a$a$a;->l()V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Ly8/a$a;->h:Ly8/a$a$a;

    .line 10
    .line 11
    const/4 v1, 0x3

    .line 12
    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, Ly8/a$a;->h:Ly8/a$a$a;

    .line 16
    .line 17
    const/4 v1, 0x5

    .line 18
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-virtual {v0, v1, p1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-virtual {p1}, Landroid/os/Message;->sendToTarget()V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public F(Lz8/c;)I
    .locals 1

    .line 1
    iget-object v0, p1, Lz8/c;->x:Lz8/n;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Lz8/n;->hasReferences()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    iget-object p1, p1, Lz8/c;->x:Lz8/n;

    .line 12
    .line 13
    invoke-interface {p1}, Lz8/n;->size()I

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    return p1

    .line 18
    :cond_0
    const/4 p1, 0x0

    .line 19
    return p1
.end method

.method public a(Lz8/c;)V
    .locals 2

    .line 1
    iget-object v0, p0, Ly8/a$a;->h:Ly8/a$a$a;

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    iget-boolean v1, p1, Lz8/c;->y:Z

    .line 6
    .line 7
    if-eqz v1, :cond_1

    .line 8
    .line 9
    iget-boolean v1, p1, Lz8/c;->z:Z

    .line 10
    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    invoke-virtual {p1}, Lz8/c;->w()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-nez v0, :cond_2

    .line 18
    .line 19
    iget-object v0, p0, Ly8/a$a;->h:Ly8/a$a$a;

    .line 20
    .line 21
    invoke-virtual {v0, p1}, Ly8/a$a$a;->d(Lz8/c;)Z

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :cond_0
    const/16 v1, 0x12

    .line 26
    .line 27
    invoke-virtual {v0, v1, p1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-virtual {p1}, Landroid/os/Message;->sendToTarget()V

    .line 32
    .line 33
    .line 34
    return-void

    .line 35
    :cond_1
    const/4 v1, 0x2

    .line 36
    invoke-virtual {v0, v1, p1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    invoke-virtual {p1}, Landroid/os/Message;->sendToTarget()V

    .line 41
    .line 42
    .line 43
    :cond_2
    return-void
.end method

.method public m()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Ly8/a$a;->i:Z

    .line 3
    .line 4
    iget-object v0, p0, Ly8/a$a;->a:Landroid/os/HandlerThread;

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    new-instance v0, Landroid/os/HandlerThread;

    .line 9
    .line 10
    const-string v1, "DFM Cache-Building Thread"

    .line 11
    .line 12
    invoke-direct {v0, v1}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    iput-object v0, p0, Ly8/a$a;->a:Landroid/os/HandlerThread;

    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 18
    .line 19
    .line 20
    :cond_0
    iget-object v0, p0, Ly8/a$a;->h:Ly8/a$a$a;

    .line 21
    .line 22
    if-nez v0, :cond_1

    .line 23
    .line 24
    new-instance v0, Ly8/a$a$a;

    .line 25
    .line 26
    iget-object v1, p0, Ly8/a$a;->a:Landroid/os/HandlerThread;

    .line 27
    .line 28
    invoke-virtual {v1}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    invoke-direct {v0, p0, v1}, Ly8/a$a$a;-><init>(Ly8/a$a;Landroid/os/Looper;)V

    .line 33
    .line 34
    .line 35
    iput-object v0, p0, Ly8/a$a;->h:Ly8/a$a$a;

    .line 36
    .line 37
    :cond_1
    iget-object v0, p0, Ly8/a$a;->h:Ly8/a$a$a;

    .line 38
    .line 39
    invoke-virtual {v0}, Ly8/a$a$a;->b()V

    .line 40
    .line 41
    .line 42
    return-void
.end method

.method public final n(Lz8/c;)J
    .locals 5

    .line 1
    iget-object v0, p1, Lz8/c;->x:Lz8/n;

    .line 2
    .line 3
    const-wide/16 v1, 0x0

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-wide v1

    .line 8
    :cond_0
    invoke-interface {v0}, Lz8/n;->hasReferences()Z

    .line 9
    .line 10
    .line 11
    move-result v3

    .line 12
    const/4 v4, 0x0

    .line 13
    if-eqz v3, :cond_1

    .line 14
    .line 15
    invoke-interface {v0}, Lz8/n;->e()V

    .line 16
    .line 17
    .line 18
    iput-object v4, p1, Lz8/c;->x:Lz8/n;

    .line 19
    .line 20
    return-wide v1

    .line 21
    :cond_1
    invoke-virtual {p0, p1}, Ly8/a$a;->F(Lz8/c;)I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    int-to-long v1, v1

    .line 26
    invoke-interface {v0}, Lz8/n;->destroy()V

    .line 27
    .line 28
    .line 29
    iput-object v4, p1, Lz8/c;->x:Lz8/n;

    .line 30
    .line 31
    return-wide v1
.end method

.method public final o()V
    .locals 1

    .line 1
    :goto_0
    iget-object v0, p0, Ly8/a$a;->d:Lb9/b;

    .line 2
    .line 3
    invoke-interface {v0}, Lb9/b;->acquire()Lb9/c;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, La9/e;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {v0}, La9/e;->destroy()V

    .line 12
    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    return-void
.end method

.method public final p()V
    .locals 2

    .line 1
    iget-object v0, p0, Ly8/a$a;->j:Ly8/a;

    .line 2
    .line 3
    iget-object v0, v0, Ly8/e;->g:Lz8/e;

    .line 4
    .line 5
    iget-wide v0, v0, Lz8/e;->a:J

    .line 6
    .line 7
    invoke-virtual {p0, v0, v1}, Ly8/a$a;->q(J)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final q(J)V
    .locals 4

    .line 1
    iget-object p1, p0, Ly8/a$a;->b:La9/d;

    .line 2
    .line 3
    invoke-virtual {p1}, La9/d;->iterator()Lz8/k;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    :goto_0
    invoke-interface {p1}, Lz8/k;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result p2

    .line 11
    if-eqz p2, :cond_0

    .line 12
    .line 13
    iget-boolean p2, p0, Ly8/a$a;->i:Z

    .line 14
    .line 15
    if-nez p2, :cond_0

    .line 16
    .line 17
    invoke-interface {p1}, Lz8/k;->next()Lz8/c;

    .line 18
    .line 19
    .line 20
    move-result-object p2

    .line 21
    invoke-virtual {p2}, Lz8/c;->w()Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    iget-object v0, p0, Ly8/a$a;->j:Ly8/a;

    .line 28
    .line 29
    invoke-static {v0}, Ly8/a;->t(Ly8/a;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    monitor-enter v0

    .line 34
    :try_start_0
    iget-object v1, p0, Ly8/a$a;->j:Ly8/a;

    .line 35
    .line 36
    invoke-static {v1}, Ly8/a;->t(Ly8/a;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    const-wide/16 v2, 0x1e

    .line 41
    .line 42
    invoke-virtual {v1, v2, v3}, Ljava/lang/Object;->wait(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 43
    .line 44
    .line 45
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 46
    const/4 v0, 0x0

    .line 47
    const/4 v1, 0x0

    .line 48
    invoke-virtual {p0, v0, p2, v1}, Ly8/a$a;->s(ZLz8/c;Lz8/c;)V

    .line 49
    .line 50
    .line 51
    invoke-interface {p1}, Lz8/k;->remove()V

    .line 52
    .line 53
    .line 54
    goto :goto_0

    .line 55
    :catchall_0
    move-exception p1

    .line 56
    goto :goto_1

    .line 57
    :catch_0
    move-exception p1

    .line 58
    :try_start_2
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 59
    .line 60
    .line 61
    monitor-exit v0

    .line 62
    goto :goto_2

    .line 63
    :goto_1
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 64
    throw p1

    .line 65
    :cond_0
    :goto_2
    return-void
.end method

.method public r()V
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Ly8/a$a;->i:Z

    .line 3
    .line 4
    iget-object v0, p0, Ly8/a$a;->j:Ly8/a;

    .line 5
    .line 6
    invoke-static {v0}, Ly8/a;->t(Ly8/a;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    monitor-enter v0

    .line 11
    :try_start_0
    iget-object v1, p0, Ly8/a$a;->j:Ly8/a;

    .line 12
    .line 13
    invoke-static {v1}, Ly8/a;->t(Ly8/a;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {v1}, Ljava/lang/Object;->notifyAll()V

    .line 18
    .line 19
    .line 20
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 21
    iget-object v0, p0, Ly8/a$a;->h:Ly8/a$a$a;

    .line 22
    .line 23
    const/4 v1, 0x0

    .line 24
    if-eqz v0, :cond_0

    .line 25
    .line 26
    invoke-virtual {v0}, Ly8/a$a$a;->g()V

    .line 27
    .line 28
    .line 29
    iput-object v1, p0, Ly8/a$a;->h:Ly8/a$a$a;

    .line 30
    .line 31
    :cond_0
    iget-object v0, p0, Ly8/a$a;->a:Landroid/os/HandlerThread;

    .line 32
    .line 33
    if-eqz v0, :cond_1

    .line 34
    .line 35
    :try_start_1
    invoke-virtual {v0}, Ljava/lang/Thread;->join()V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :catch_0
    move-exception v0

    .line 40
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 41
    .line 42
    .line 43
    :goto_0
    iget-object v0, p0, Ly8/a$a;->a:Landroid/os/HandlerThread;

    .line 44
    .line 45
    invoke-virtual {v0}, Landroid/os/HandlerThread;->quit()Z

    .line 46
    .line 47
    .line 48
    iput-object v1, p0, Ly8/a$a;->a:Landroid/os/HandlerThread;

    .line 49
    .line 50
    :cond_1
    return-void

    .line 51
    :catchall_0
    move-exception v1

    .line 52
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 53
    throw v1
.end method

.method public s(ZLz8/c;Lz8/c;)V
    .locals 2

    .line 1
    invoke-virtual {p2}, Lz8/c;->e()Lz8/n;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    if-eqz p1, :cond_2

    .line 6
    .line 7
    invoke-virtual {p0, p2}, Ly8/a$a;->n(Lz8/c;)J

    .line 8
    .line 9
    .line 10
    move-result-wide v0

    .line 11
    invoke-virtual {p2}, Lz8/c;->w()Z

    .line 12
    .line 13
    .line 14
    move-result p3

    .line 15
    if-eqz p3, :cond_0

    .line 16
    .line 17
    iget-object p3, p0, Ly8/a$a;->j:Ly8/a;

    .line 18
    .line 19
    iget-object p3, p3, Ly8/e;->a:Lmaster/flame/danmaku/danmaku/model/android/DanmakuContext;

    .line 20
    .line 21
    invoke-virtual {p3}, Lmaster/flame/danmaku/danmaku/model/android/DanmakuContext;->b()Lz8/a;

    .line 22
    .line 23
    .line 24
    move-result-object p3

    .line 25
    invoke-virtual {p3}, Lz8/a;->o()La9/b;

    .line 26
    .line 27
    .line 28
    move-result-object p3

    .line 29
    invoke-virtual {p3, p2}, La9/b;->e(Lz8/c;)V

    .line 30
    .line 31
    .line 32
    :cond_0
    const-wide/16 p2, 0x0

    .line 33
    .line 34
    cmp-long p2, v0, p2

    .line 35
    .line 36
    if-gtz p2, :cond_1

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_1
    iget p2, p0, Ly8/a$a;->f:I

    .line 40
    .line 41
    int-to-long p2, p2

    .line 42
    sub-long/2addr p2, v0

    .line 43
    long-to-int p2, p2

    .line 44
    iput p2, p0, Ly8/a$a;->f:I

    .line 45
    .line 46
    iget-object p2, p0, Ly8/a$a;->d:Lb9/b;

    .line 47
    .line 48
    check-cast p1, La9/e;

    .line 49
    .line 50
    invoke-interface {p2, p1}, Lb9/b;->a(Lb9/c;)V

    .line 51
    .line 52
    .line 53
    :cond_2
    :goto_0
    return-void
.end method

.method public final t()V
    .locals 4

    .line 1
    iget-object v0, p0, Ly8/a$a;->b:La9/d;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    invoke-virtual {v0}, La9/d;->iterator()Lz8/k;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    :goto_0
    invoke-interface {v0}, Lz8/k;->hasNext()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    invoke-interface {v0}, Lz8/k;->next()Lz8/c;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    const/4 v2, 0x1

    .line 20
    const/4 v3, 0x0

    .line 21
    invoke-virtual {p0, v2, v1, v3}, Ly8/a$a;->s(ZLz8/c;Lz8/c;)V

    .line 22
    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    iget-object v0, p0, Ly8/a$a;->b:La9/d;

    .line 26
    .line 27
    invoke-virtual {v0}, La9/d;->clear()V

    .line 28
    .line 29
    .line 30
    :cond_1
    const/4 v0, 0x0

    .line 31
    iput v0, p0, Ly8/a$a;->f:I

    .line 32
    .line 33
    return-void
.end method

.method public final u()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, Ly8/a$a;->v(Z)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method public final v(Z)V
    .locals 8

    .line 1
    iget-object v0, p0, Ly8/a$a;->b:La9/d;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_4

    .line 5
    .line 6
    invoke-virtual {v0}, La9/d;->iterator()Lz8/k;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    :cond_0
    :goto_0
    invoke-interface {v0}, Lz8/k;->hasNext()Z

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    if-eqz v2, :cond_4

    .line 15
    .line 16
    invoke-interface {v0}, Lz8/k;->next()Lz8/c;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    iget-object v3, v2, Lz8/c;->x:Lz8/n;

    .line 21
    .line 22
    const/4 v4, 0x1

    .line 23
    if-eqz v3, :cond_1

    .line 24
    .line 25
    invoke-interface {v3}, Lz8/n;->hasReferences()Z

    .line 26
    .line 27
    .line 28
    move-result v5

    .line 29
    if-eqz v5, :cond_1

    .line 30
    .line 31
    move v5, v4

    .line 32
    goto :goto_1

    .line 33
    :cond_1
    move v5, v1

    .line 34
    :goto_1
    const/4 v6, 0x0

    .line 35
    if-eqz p1, :cond_3

    .line 36
    .line 37
    if-eqz v5, :cond_3

    .line 38
    .line 39
    invoke-interface {v3}, Lz8/n;->get()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v5

    .line 43
    if-eqz v5, :cond_2

    .line 44
    .line 45
    iget v5, p0, Ly8/a$a;->f:I

    .line 46
    .line 47
    invoke-interface {v3}, Lz8/n;->size()I

    .line 48
    .line 49
    .line 50
    move-result v7

    .line 51
    sub-int/2addr v5, v7

    .line 52
    iput v5, p0, Ly8/a$a;->f:I

    .line 53
    .line 54
    invoke-interface {v3}, Lz8/n;->destroy()V

    .line 55
    .line 56
    .line 57
    :cond_2
    invoke-virtual {p0, v4, v2, v6}, Ly8/a$a;->s(ZLz8/c;Lz8/c;)V

    .line 58
    .line 59
    .line 60
    invoke-interface {v0}, Lz8/k;->remove()V

    .line 61
    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_3
    invoke-virtual {v2}, Lz8/c;->s()Z

    .line 65
    .line 66
    .line 67
    move-result v3

    .line 68
    if-eqz v3, :cond_0

    .line 69
    .line 70
    invoke-virtual {p0, v4, v2, v6}, Ly8/a$a;->s(ZLz8/c;Lz8/c;)V

    .line 71
    .line 72
    .line 73
    invoke-interface {v0}, Lz8/k;->remove()V

    .line 74
    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_4
    iput v1, p0, Ly8/a$a;->f:I

    .line 78
    .line 79
    return-void
.end method

.method public final w(Lz8/c;ZI)Lz8/c;
    .locals 8

    .line 1
    iget-object v0, p0, Ly8/a$a;->b:La9/d;

    .line 2
    .line 3
    invoke-virtual {v0}, La9/d;->iterator()Lz8/k;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x0

    .line 8
    if-nez p2, :cond_0

    .line 9
    .line 10
    iget-object v2, p0, Ly8/a$a;->j:Ly8/a;

    .line 11
    .line 12
    iget-object v2, v2, Ly8/e;->b:Lz8/a;

    .line 13
    .line 14
    invoke-interface {v2}, Lz8/m;->c()I

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    mul-int/lit8 v2, v2, 0x2

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    move v2, v1

    .line 22
    :goto_0
    invoke-interface {v0}, Lz8/k;->hasNext()Z

    .line 23
    .line 24
    .line 25
    move-result v3

    .line 26
    if-eqz v3, :cond_7

    .line 27
    .line 28
    add-int/lit8 v3, v1, 0x1

    .line 29
    .line 30
    if-ge v1, p3, :cond_7

    .line 31
    .line 32
    invoke-interface {v0}, Lz8/k;->next()Lz8/c;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    invoke-virtual {v1}, Lz8/c;->e()Lz8/n;

    .line 37
    .line 38
    .line 39
    move-result-object v4

    .line 40
    if-eqz v4, :cond_6

    .line 41
    .line 42
    invoke-interface {v4}, Lz8/n;->get()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v5

    .line 46
    if-nez v5, :cond_1

    .line 47
    .line 48
    goto/16 :goto_2

    .line 49
    .line 50
    :cond_1
    iget v5, v1, Lz8/c;->o:F

    .line 51
    .line 52
    iget v6, p1, Lz8/c;->o:F

    .line 53
    .line 54
    cmpl-float v5, v5, v6

    .line 55
    .line 56
    if-nez v5, :cond_2

    .line 57
    .line 58
    iget v5, v1, Lz8/c;->p:F

    .line 59
    .line 60
    iget v6, p1, Lz8/c;->p:F

    .line 61
    .line 62
    cmpl-float v5, v5, v6

    .line 63
    .line 64
    if-nez v5, :cond_2

    .line 65
    .line 66
    iget v5, v1, Lz8/c;->j:I

    .line 67
    .line 68
    iget v6, p1, Lz8/c;->j:I

    .line 69
    .line 70
    if-ne v5, v6, :cond_2

    .line 71
    .line 72
    iget v5, v1, Lz8/c;->l:I

    .line 73
    .line 74
    iget v6, p1, Lz8/c;->l:I

    .line 75
    .line 76
    if-ne v5, v6, :cond_2

    .line 77
    .line 78
    iget v5, v1, Lz8/c;->f:I

    .line 79
    .line 80
    iget v6, p1, Lz8/c;->f:I

    .line 81
    .line 82
    if-ne v5, v6, :cond_2

    .line 83
    .line 84
    iget-object v5, v1, Lz8/c;->c:Ljava/lang/CharSequence;

    .line 85
    .line 86
    iget-object v6, p1, Lz8/c;->c:Ljava/lang/CharSequence;

    .line 87
    .line 88
    invoke-virtual {v5, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    move-result v5

    .line 92
    if-eqz v5, :cond_2

    .line 93
    .line 94
    iget-object v5, v1, Lz8/c;->e:Ljava/lang/Object;

    .line 95
    .line 96
    iget-object v6, p1, Lz8/c;->e:Ljava/lang/Object;

    .line 97
    .line 98
    if-ne v5, v6, :cond_2

    .line 99
    .line 100
    goto :goto_1

    .line 101
    :cond_2
    if-eqz p2, :cond_3

    .line 102
    .line 103
    goto :goto_2

    .line 104
    :cond_3
    invoke-virtual {v1}, Lz8/c;->w()Z

    .line 105
    .line 106
    .line 107
    move-result v5

    .line 108
    if-nez v5, :cond_4

    .line 109
    .line 110
    goto :goto_3

    .line 111
    :cond_4
    invoke-interface {v4}, Lz8/n;->hasReferences()Z

    .line 112
    .line 113
    .line 114
    move-result v5

    .line 115
    if-eqz v5, :cond_5

    .line 116
    .line 117
    goto :goto_2

    .line 118
    :cond_5
    invoke-interface {v4}, Lz8/n;->f()I

    .line 119
    .line 120
    .line 121
    move-result v5

    .line 122
    int-to-float v5, v5

    .line 123
    iget v6, p1, Lz8/c;->o:F

    .line 124
    .line 125
    sub-float/2addr v5, v6

    .line 126
    invoke-interface {v4}, Lz8/n;->b()I

    .line 127
    .line 128
    .line 129
    move-result v4

    .line 130
    int-to-float v4, v4

    .line 131
    iget v6, p1, Lz8/c;->p:F

    .line 132
    .line 133
    sub-float/2addr v4, v6

    .line 134
    const/4 v6, 0x0

    .line 135
    cmpl-float v7, v5, v6

    .line 136
    .line 137
    if-ltz v7, :cond_6

    .line 138
    .line 139
    int-to-float v7, v2

    .line 140
    cmpg-float v5, v5, v7

    .line 141
    .line 142
    if-gtz v5, :cond_6

    .line 143
    .line 144
    cmpl-float v5, v4, v6

    .line 145
    .line 146
    if-ltz v5, :cond_6

    .line 147
    .line 148
    cmpg-float v4, v4, v7

    .line 149
    .line 150
    if-gtz v4, :cond_6

    .line 151
    .line 152
    :goto_1
    return-object v1

    .line 153
    :cond_6
    :goto_2
    move v1, v3

    .line 154
    goto/16 :goto_0

    .line 155
    .line 156
    :cond_7
    :goto_3
    const/4 p1, 0x0

    .line 157
    return-object p1
.end method

.method public x()J
    .locals 3

    .line 1
    iget-object v0, p0, Ly8/a$a;->b:La9/d;

    .line 2
    .line 3
    const-wide/16 v1, 0x0

    .line 4
    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    invoke-virtual {v0}, La9/d;->size()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-lez v0, :cond_1

    .line 12
    .line 13
    iget-object v0, p0, Ly8/a$a;->b:La9/d;

    .line 14
    .line 15
    invoke-virtual {v0}, La9/d;->first()Lz8/c;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    if-nez v0, :cond_0

    .line 20
    .line 21
    return-wide v1

    .line 22
    :cond_0
    invoke-virtual {v0}, Lz8/c;->b()J

    .line 23
    .line 24
    .line 25
    move-result-wide v0

    .line 26
    return-wide v0

    .line 27
    :cond_1
    return-wide v1
.end method

.method public y()F
    .locals 2

    .line 1
    iget v0, p0, Ly8/a$a;->e:I

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    return v0

    .line 7
    :cond_0
    iget v1, p0, Ly8/a$a;->f:I

    .line 8
    .line 9
    int-to-float v1, v1

    .line 10
    int-to-float v0, v0

    .line 11
    div-float/2addr v1, v0

    .line 12
    return v1
.end method

.method public z(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Ly8/a$a;->h:Ly8/a$a$a;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    if-ne p1, v1, :cond_0

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    const/4 v1, 0x0

    .line 10
    :goto_0
    invoke-virtual {v0, v1}, Ly8/a$a$a;->f(Z)V

    .line 11
    .line 12
    .line 13
    :cond_1
    return-void
.end method
