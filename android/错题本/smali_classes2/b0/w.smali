.class public final Lb0/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lw0/e;


# static fields
.field public static final v:Lio/reactivex/internal/operators/observable/g;


# instance fields
.field public final a:Lb0/v;

.field public final b:Lw0/h;

.field public final c:Lb0/z;

.field public final d:Landroidx/core/util/Pools$Pool;

.field public final e:Lio/reactivex/internal/operators/observable/g;

.field public final f:Lb0/x;

.field public final g:Le0/b;

.field public final h:Le0/b;

.field public final i:Le0/b;

.field public final j:Ljava/util/concurrent/atomic/AtomicInteger;

.field public k:Lb0/y;

.field public l:Z

.field public m:Z

.field public n:Lb0/g0;

.field public o:Lcom/bumptech/glide/load/DataSource;

.field public p:Z

.field public q:Lcom/bumptech/glide/load/engine/GlideException;

.field public r:Z

.field public s:Lb0/a0;

.field public t:Lcom/bumptech/glide/load/engine/b;

.field public volatile u:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lio/reactivex/internal/operators/observable/g;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, v1}, Lio/reactivex/internal/operators/observable/g;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lb0/w;->v:Lio/reactivex/internal/operators/observable/g;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Le0/b;Le0/b;Le0/b;Le0/b;Lcom/bumptech/glide/load/engine/c;Lcom/bumptech/glide/load/engine/c;Lw0/d;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance p3, Lb0/v;

    .line 5
    .line 6
    new-instance v0, Ljava/util/ArrayList;

    .line 7
    .line 8
    const/4 v1, 0x2

    .line 9
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 10
    .line 11
    .line 12
    invoke-direct {p3, v0}, Lb0/v;-><init>(Ljava/util/ArrayList;)V

    .line 13
    .line 14
    .line 15
    iput-object p3, p0, Lb0/w;->a:Lb0/v;

    .line 16
    .line 17
    new-instance p3, Lw0/h;

    .line 18
    .line 19
    invoke-direct {p3}, Ljava/lang/Object;-><init>()V

    .line 20
    .line 21
    .line 22
    iput-object p3, p0, Lb0/w;->b:Lw0/h;

    .line 23
    .line 24
    new-instance p3, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 25
    .line 26
    invoke-direct {p3}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    .line 27
    .line 28
    .line 29
    iput-object p3, p0, Lb0/w;->j:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 30
    .line 31
    iput-object p1, p0, Lb0/w;->g:Le0/b;

    .line 32
    .line 33
    iput-object p2, p0, Lb0/w;->h:Le0/b;

    .line 34
    .line 35
    iput-object p4, p0, Lb0/w;->i:Le0/b;

    .line 36
    .line 37
    iput-object p5, p0, Lb0/w;->f:Lb0/x;

    .line 38
    .line 39
    iput-object p6, p0, Lb0/w;->c:Lb0/z;

    .line 40
    .line 41
    iput-object p7, p0, Lb0/w;->d:Landroidx/core/util/Pools$Pool;

    .line 42
    .line 43
    sget-object p1, Lb0/w;->v:Lio/reactivex/internal/operators/observable/g;

    .line 44
    .line 45
    iput-object p1, p0, Lb0/w;->e:Lio/reactivex/internal/operators/observable/g;

    .line 46
    .line 47
    return-void
.end method


# virtual methods
.method public final declared-synchronized a(Lcom/bumptech/glide/request/a;Ljava/util/concurrent/Executor;)V
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lb0/w;->b:Lw0/h;

    .line 3
    .line 4
    invoke-virtual {v0}, Lw0/h;->a()V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Lb0/w;->a:Lb0/v;

    .line 8
    .line 9
    iget-object v0, v0, Lb0/v;->a:Ljava/util/ArrayList;

    .line 10
    .line 11
    new-instance v1, Lb0/u;

    .line 12
    .line 13
    invoke-direct {v1, p1, p2}, Lb0/u;-><init>(Lcom/bumptech/glide/request/a;Ljava/util/concurrent/Executor;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    iget-boolean v0, p0, Lb0/w;->p:Z

    .line 20
    .line 21
    const/4 v1, 0x1

    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    invoke-virtual {p0, v1}, Lb0/w;->e(I)V

    .line 25
    .line 26
    .line 27
    new-instance v0, Lcom/bumptech/glide/load/engine/d;

    .line 28
    .line 29
    const/4 v1, 0x1

    .line 30
    invoke-direct {v0, p0, p1, v1}, Lcom/bumptech/glide/load/engine/d;-><init>(Lb0/w;Lcom/bumptech/glide/request/a;I)V

    .line 31
    .line 32
    .line 33
    invoke-interface {p2, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 34
    .line 35
    .line 36
    goto :goto_0

    .line 37
    :catchall_0
    move-exception p1

    .line 38
    goto :goto_1

    .line 39
    :cond_0
    iget-boolean v0, p0, Lb0/w;->r:Z

    .line 40
    .line 41
    if-eqz v0, :cond_1

    .line 42
    .line 43
    invoke-virtual {p0, v1}, Lb0/w;->e(I)V

    .line 44
    .line 45
    .line 46
    new-instance v0, Lcom/bumptech/glide/load/engine/d;

    .line 47
    .line 48
    const/4 v1, 0x0

    .line 49
    invoke-direct {v0, p0, p1, v1}, Lcom/bumptech/glide/load/engine/d;-><init>(Lb0/w;Lcom/bumptech/glide/request/a;I)V

    .line 50
    .line 51
    .line 52
    invoke-interface {p2, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 53
    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_1
    iget-boolean p1, p0, Lb0/w;->u:Z

    .line 57
    .line 58
    xor-int/2addr p1, v1

    .line 59
    const-string p2, "Cannot add callbacks to a cancelled EngineJob"

    .line 60
    .line 61
    invoke-static {p2, p1}, Lv7/d;->d(Ljava/lang/String;Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 62
    .line 63
    .line 64
    :goto_0
    monitor-exit p0

    .line 65
    return-void

    .line 66
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 67
    throw p1
.end method

.method public final b()V
    .locals 4

    .line 1
    invoke-virtual {p0}, Lb0/w;->f()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    const/4 v0, 0x1

    .line 9
    iput-boolean v0, p0, Lb0/w;->u:Z

    .line 10
    .line 11
    iget-object v1, p0, Lb0/w;->t:Lcom/bumptech/glide/load/engine/b;

    .line 12
    .line 13
    iput-boolean v0, v1, Lcom/bumptech/glide/load/engine/b;->D:Z

    .line 14
    .line 15
    iget-object v0, v1, Lcom/bumptech/glide/load/engine/b;->B:Lb0/i;

    .line 16
    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    invoke-interface {v0}, Lb0/i;->cancel()V

    .line 20
    .line 21
    .line 22
    :cond_1
    iget-object v0, p0, Lb0/w;->f:Lb0/x;

    .line 23
    .line 24
    iget-object v1, p0, Lb0/w;->k:Lb0/y;

    .line 25
    .line 26
    check-cast v0, Lcom/bumptech/glide/load/engine/c;

    .line 27
    .line 28
    monitor-enter v0

    .line 29
    :try_start_0
    iget-object v2, v0, Lcom/bumptech/glide/load/engine/c;->a:Lb0/d0;

    .line 30
    .line 31
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    iget-object v2, v2, Lb0/d0;->a:Ljava/util/HashMap;

    .line 35
    .line 36
    invoke-virtual {v2, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    invoke-virtual {p0, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result v3

    .line 44
    if-eqz v3, :cond_2

    .line 45
    .line 46
    invoke-virtual {v2, v1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 47
    .line 48
    .line 49
    :cond_2
    monitor-exit v0

    .line 50
    return-void

    .line 51
    :catchall_0
    move-exception v1

    .line 52
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 53
    throw v1
.end method

.method public final c()Lw0/h;
    .locals 1

    .line 1
    iget-object v0, p0, Lb0/w;->b:Lw0/h;

    .line 2
    .line 3
    return-object v0
.end method

.method public final d()V
    .locals 3

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lb0/w;->b:Lw0/h;

    .line 3
    .line 4
    invoke-virtual {v0}, Lw0/h;->a()V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Lb0/w;->f()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const-string v1, "Not yet complete!"

    .line 12
    .line 13
    invoke-static {v1, v0}, Lv7/d;->d(Ljava/lang/String;Z)V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Lb0/w;->j:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-ltz v0, :cond_0

    .line 23
    .line 24
    const/4 v1, 0x1

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    const/4 v1, 0x0

    .line 27
    :goto_0
    const-string v2, "Can\'t decrement below 0"

    .line 28
    .line 29
    invoke-static {v2, v1}, Lv7/d;->d(Ljava/lang/String;Z)V

    .line 30
    .line 31
    .line 32
    if-nez v0, :cond_1

    .line 33
    .line 34
    iget-object v0, p0, Lb0/w;->s:Lb0/a0;

    .line 35
    .line 36
    invoke-virtual {p0}, Lb0/w;->g()V

    .line 37
    .line 38
    .line 39
    goto :goto_1

    .line 40
    :catchall_0
    move-exception v0

    .line 41
    goto :goto_2

    .line 42
    :cond_1
    const/4 v0, 0x0

    .line 43
    :goto_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 44
    if-eqz v0, :cond_2

    .line 45
    .line 46
    invoke-virtual {v0}, Lb0/a0;->c()V

    .line 47
    .line 48
    .line 49
    :cond_2
    return-void

    .line 50
    :goto_2
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 51
    throw v0
.end method

.method public final declared-synchronized e(I)V
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    invoke-virtual {p0}, Lb0/w;->f()Z

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    const-string v1, "Not yet complete!"

    .line 7
    .line 8
    invoke-static {v1, v0}, Lv7/d;->d(Ljava/lang/String;Z)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lb0/w;->j:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 12
    .line 13
    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndAdd(I)I

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    if-nez p1, :cond_0

    .line 18
    .line 19
    iget-object p1, p0, Lb0/w;->s:Lb0/a0;

    .line 20
    .line 21
    if-eqz p1, :cond_0

    .line 22
    .line 23
    invoke-virtual {p1}, Lb0/a0;->b()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :catchall_0
    move-exception p1

    .line 28
    goto :goto_1

    .line 29
    :cond_0
    :goto_0
    monitor-exit p0

    .line 30
    return-void

    .line 31
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 32
    throw p1
.end method

.method public final f()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lb0/w;->r:Z

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget-boolean v0, p0, Lb0/w;->p:Z

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    iget-boolean v0, p0, Lb0/w;->u:Z

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 v0, 0x0

    .line 15
    return v0

    .line 16
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 17
    return v0
.end method

.method public final declared-synchronized g()V
    .locals 4

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lb0/w;->k:Lb0/y;

    .line 3
    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    iget-object v0, p0, Lb0/w;->a:Lb0/v;

    .line 7
    .line 8
    iget-object v0, v0, Lb0/v;->a:Ljava/util/ArrayList;

    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 11
    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    iput-object v0, p0, Lb0/w;->k:Lb0/y;

    .line 15
    .line 16
    iput-object v0, p0, Lb0/w;->s:Lb0/a0;

    .line 17
    .line 18
    iput-object v0, p0, Lb0/w;->n:Lb0/g0;

    .line 19
    .line 20
    const/4 v1, 0x0

    .line 21
    iput-boolean v1, p0, Lb0/w;->r:Z

    .line 22
    .line 23
    iput-boolean v1, p0, Lb0/w;->u:Z

    .line 24
    .line 25
    iput-boolean v1, p0, Lb0/w;->p:Z

    .line 26
    .line 27
    iget-object v1, p0, Lb0/w;->t:Lcom/bumptech/glide/load/engine/b;

    .line 28
    .line 29
    iget-object v2, v1, Lcom/bumptech/glide/load/engine/b;->g:Lb0/k;

    .line 30
    .line 31
    monitor-enter v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 32
    const/4 v3, 0x1

    .line 33
    :try_start_1
    iput-boolean v3, v2, Lb0/k;->a:Z

    .line 34
    .line 35
    invoke-virtual {v2}, Lb0/k;->a()Z

    .line 36
    .line 37
    .line 38
    move-result v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 39
    :try_start_2
    monitor-exit v2

    .line 40
    if-eqz v3, :cond_0

    .line 41
    .line 42
    invoke-virtual {v1}, Lcom/bumptech/glide/load/engine/b;->k()V

    .line 43
    .line 44
    .line 45
    :cond_0
    iput-object v0, p0, Lb0/w;->t:Lcom/bumptech/glide/load/engine/b;

    .line 46
    .line 47
    iput-object v0, p0, Lb0/w;->q:Lcom/bumptech/glide/load/engine/GlideException;

    .line 48
    .line 49
    iput-object v0, p0, Lb0/w;->o:Lcom/bumptech/glide/load/DataSource;

    .line 50
    .line 51
    iget-object v0, p0, Lb0/w;->d:Landroidx/core/util/Pools$Pool;

    .line 52
    .line 53
    invoke-interface {v0, p0}, Landroidx/core/util/Pools$Pool;->release(Ljava/lang/Object;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 54
    .line 55
    .line 56
    monitor-exit p0

    .line 57
    return-void

    .line 58
    :catchall_0
    move-exception v0

    .line 59
    goto :goto_0

    .line 60
    :catchall_1
    move-exception v0

    .line 61
    :try_start_3
    monitor-exit v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 62
    :try_start_4
    throw v0

    .line 63
    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 64
    .line 65
    invoke-direct {v0}, Ljava/lang/IllegalArgumentException;-><init>()V

    .line 66
    .line 67
    .line 68
    throw v0

    .line 69
    :goto_0
    monitor-exit p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 70
    throw v0
.end method

.method public final declared-synchronized h(Lcom/bumptech/glide/request/a;)V
    .locals 3

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lb0/w;->b:Lw0/h;

    .line 3
    .line 4
    invoke-virtual {v0}, Lw0/h;->a()V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Lb0/w;->a:Lb0/v;

    .line 8
    .line 9
    iget-object v0, v0, Lb0/v;->a:Ljava/util/ArrayList;

    .line 10
    .line 11
    new-instance v1, Lb0/u;

    .line 12
    .line 13
    sget-object v2, Lv0/e;->b:Lv0/d;

    .line 14
    .line 15
    invoke-direct {v1, p1, v2}, Lb0/u;-><init>(Lcom/bumptech/glide/request/a;Ljava/util/concurrent/Executor;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    iget-object p1, p0, Lb0/w;->a:Lb0/v;

    .line 22
    .line 23
    iget-object p1, p1, Lb0/v;->a:Ljava/util/ArrayList;

    .line 24
    .line 25
    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    if-eqz p1, :cond_1

    .line 30
    .line 31
    invoke-virtual {p0}, Lb0/w;->b()V

    .line 32
    .line 33
    .line 34
    iget-boolean p1, p0, Lb0/w;->p:Z

    .line 35
    .line 36
    if-nez p1, :cond_0

    .line 37
    .line 38
    iget-boolean p1, p0, Lb0/w;->r:Z

    .line 39
    .line 40
    if-eqz p1, :cond_1

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :catchall_0
    move-exception p1

    .line 44
    goto :goto_1

    .line 45
    :cond_0
    :goto_0
    iget-object p1, p0, Lb0/w;->j:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 46
    .line 47
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 48
    .line 49
    .line 50
    move-result p1

    .line 51
    if-nez p1, :cond_1

    .line 52
    .line 53
    invoke-virtual {p0}, Lb0/w;->g()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 54
    .line 55
    .line 56
    :cond_1
    monitor-exit p0

    .line 57
    return-void

    .line 58
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 59
    throw p1
.end method
