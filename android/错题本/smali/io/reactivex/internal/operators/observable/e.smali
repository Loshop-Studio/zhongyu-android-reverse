.class public final Lio/reactivex/internal/operators/observable/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lq5/g;
.implements Lw5/a;


# instance fields
.field public final a:Lq5/g;

.field public b:Ls5/b;

.field public c:Lw5/a;

.field public d:Z

.field public final e:Landroidx/camera/core/impl/d;


# direct methods
.method public constructor <init>(Lq5/g;Landroidx/camera/core/impl/d;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lio/reactivex/internal/operators/observable/e;->a:Lq5/g;

    .line 5
    .line 6
    iput-object p2, p0, Lio/reactivex/internal/operators/observable/e;->e:Landroidx/camera/core/impl/d;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final clear()V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/reactivex/internal/operators/observable/e;->c:Lw5/a;

    .line 2
    .line 3
    invoke-interface {v0}, Lw5/b;->clear()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final dispose()V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/reactivex/internal/operators/observable/e;->b:Ls5/b;

    .line 2
    .line 3
    invoke-interface {v0}, Ls5/b;->dispose()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final isEmpty()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lio/reactivex/internal/operators/observable/e;->c:Lw5/a;

    .line 2
    .line 3
    invoke-interface {v0}, Lw5/b;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final offer(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    const-string v0, "Should not be called!"

    .line 4
    .line 5
    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p1
.end method

.method public final onComplete()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lio/reactivex/internal/operators/observable/e;->d:Z

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
    iput-boolean v0, p0, Lio/reactivex/internal/operators/observable/e;->d:Z

    .line 8
    .line 9
    iget-object v0, p0, Lio/reactivex/internal/operators/observable/e;->a:Lq5/g;

    .line 10
    .line 11
    invoke-interface {v0}, Lq5/g;->onComplete()V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public final onError(Ljava/lang/Throwable;)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lio/reactivex/internal/operators/observable/e;->d:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-static {p1}, Lv7/d;->q(Ljava/lang/Throwable;)V

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    const/4 v0, 0x1

    .line 10
    iput-boolean v0, p0, Lio/reactivex/internal/operators/observable/e;->d:Z

    .line 11
    .line 12
    iget-object v0, p0, Lio/reactivex/internal/operators/observable/e;->a:Lq5/g;

    .line 13
    .line 14
    invoke-interface {v0, p1}, Lq5/g;->onError(Ljava/lang/Throwable;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public final onNext(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lio/reactivex/internal/operators/observable/e;->d:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    :try_start_0
    iget-object v0, p0, Lio/reactivex/internal/operators/observable/e;->e:Landroidx/camera/core/impl/d;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Landroidx/camera/core/impl/d;->b(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    iget-object v0, p0, Lio/reactivex/internal/operators/observable/e;->a:Lq5/g;

    .line 13
    .line 14
    invoke-interface {v0, p1}, Lq5/g;->onNext(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :catchall_0
    move-exception p1

    .line 19
    invoke-static {p1}, Lh4/a;->p(Ljava/lang/Throwable;)V

    .line 20
    .line 21
    .line 22
    iget-object v0, p0, Lio/reactivex/internal/operators/observable/e;->b:Ls5/b;

    .line 23
    .line 24
    invoke-interface {v0}, Ls5/b;->dispose()V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0, p1}, Lio/reactivex/internal/operators/observable/e;->onError(Ljava/lang/Throwable;)V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public final onSubscribe(Ls5/b;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/reactivex/internal/operators/observable/e;->b:Ls5/b;

    .line 2
    .line 3
    invoke-static {v0, p1}, Lio/reactivex/internal/disposables/DisposableHelper;->validate(Ls5/b;Ls5/b;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    iput-object p1, p0, Lio/reactivex/internal/operators/observable/e;->b:Ls5/b;

    .line 10
    .line 11
    instance-of v0, p1, Lw5/a;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    check-cast p1, Lw5/a;

    .line 16
    .line 17
    iput-object p1, p0, Lio/reactivex/internal/operators/observable/e;->c:Lw5/a;

    .line 18
    .line 19
    :cond_0
    iget-object p1, p0, Lio/reactivex/internal/operators/observable/e;->a:Lq5/g;

    .line 20
    .line 21
    invoke-interface {p1, p0}, Lq5/g;->onSubscribe(Ls5/b;)V

    .line 22
    .line 23
    .line 24
    :cond_1
    return-void
.end method

.method public final poll()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lio/reactivex/internal/operators/observable/e;->c:Lw5/a;

    .line 2
    .line 3
    invoke-interface {v0}, Lw5/b;->poll()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v1, p0, Lio/reactivex/internal/operators/observable/e;->e:Landroidx/camera/core/impl/d;

    .line 10
    .line 11
    invoke-virtual {v1, v0}, Landroidx/camera/core/impl/d;->b(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    return-object v0

    .line 16
    :cond_0
    const/4 v0, 0x0

    .line 17
    return-object v0
.end method

.method public final requestFusion(I)I
    .locals 0

    const/4 p1, 0x0

    return p1
.end method
