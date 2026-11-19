.class public final Lcoil3/request/ViewTargetRequestManager;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnAttachStateChangeListener;


# instance fields
.field public final c:Landroid/view/View;

.field public d:Lw/s;

.field public e:Lkotlinx/coroutines/g;

.field public f:Lcoil3/request/ViewTargetRequestDelegate;

.field public g:Z


# direct methods
.method public constructor <init>(Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcoil3/request/ViewTargetRequestManager;->c:Landroid/view/View;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final declared-synchronized a()V
    .locals 8

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lcoil3/request/ViewTargetRequestManager;->e:Lkotlinx/coroutines/g;

    .line 3
    .line 4
    const/4 v1, 0x0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    invoke-static {v0, v1, v2, v1}, Lkotlinx/coroutines/g$a;->a(Lkotlinx/coroutines/g;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    goto :goto_0

    .line 12
    :catchall_0
    move-exception v0

    .line 13
    goto :goto_1

    .line 14
    :cond_0
    :goto_0
    sget-object v2, Lsd/h1;->c:Lsd/h1;

    .line 15
    .line 16
    invoke-static {}, Lsd/r0;->c()Lsd/t1;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-virtual {v0}, Lsd/t1;->i()Lsd/t1;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    new-instance v5, Lcoil3/request/ViewTargetRequestManager$dispose$1;

    .line 25
    .line 26
    invoke-direct {v5, p0, v1}, Lcoil3/request/ViewTargetRequestManager$dispose$1;-><init>(Lcoil3/request/ViewTargetRequestManager;Lvc/c;)V

    .line 27
    .line 28
    .line 29
    const/4 v6, 0x2

    .line 30
    const/4 v7, 0x0

    .line 31
    const/4 v4, 0x0

    .line 32
    invoke-static/range {v2 .. v7}, Lsd/f;->d(Lsd/i0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lhd/p;ILjava/lang/Object;)Lkotlinx/coroutines/g;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    iput-object v0, p0, Lcoil3/request/ViewTargetRequestManager;->e:Lkotlinx/coroutines/g;

    .line 37
    .line 38
    iput-object v1, p0, Lcoil3/request/ViewTargetRequestManager;->d:Lw/s;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 39
    .line 40
    monitor-exit p0

    .line 41
    return-void

    .line 42
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 43
    throw v0
.end method

.method public final declared-synchronized b(Lsd/m0;)Lw/s;
    .locals 3

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lcoil3/request/ViewTargetRequestManager;->d:Lw/s;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    invoke-static {}, Lcoil3/util/d;->i()Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    iget-boolean v1, p0, Lcoil3/request/ViewTargetRequestManager;->g:Z

    .line 13
    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    iput-boolean v1, p0, Lcoil3/request/ViewTargetRequestManager;->g:Z

    .line 18
    .line 19
    invoke-virtual {v0, p1}, Lw/s;->a(Lsd/m0;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    .line 21
    .line 22
    monitor-exit p0

    .line 23
    return-object v0

    .line 24
    :catchall_0
    move-exception p1

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    :try_start_1
    iget-object v0, p0, Lcoil3/request/ViewTargetRequestManager;->e:Lkotlinx/coroutines/g;

    .line 27
    .line 28
    const/4 v1, 0x0

    .line 29
    if-eqz v0, :cond_1

    .line 30
    .line 31
    const/4 v2, 0x1

    .line 32
    invoke-static {v0, v1, v2, v1}, Lkotlinx/coroutines/g$a;->a(Lkotlinx/coroutines/g;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    :cond_1
    iput-object v1, p0, Lcoil3/request/ViewTargetRequestManager;->e:Lkotlinx/coroutines/g;

    .line 36
    .line 37
    new-instance v0, Lw/s;

    .line 38
    .line 39
    iget-object v1, p0, Lcoil3/request/ViewTargetRequestManager;->c:Landroid/view/View;

    .line 40
    .line 41
    invoke-direct {v0, v1, p1}, Lw/s;-><init>(Landroid/view/View;Lsd/m0;)V

    .line 42
    .line 43
    .line 44
    iput-object v0, p0, Lcoil3/request/ViewTargetRequestManager;->d:Lw/s;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 45
    .line 46
    monitor-exit p0

    .line 47
    return-object v0

    .line 48
    :goto_0
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 49
    throw p1
.end method

.method public final c(Lcoil3/request/ViewTargetRequestDelegate;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcoil3/request/ViewTargetRequestManager;->f:Lcoil3/request/ViewTargetRequestDelegate;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lcoil3/request/ViewTargetRequestDelegate;->d()V

    .line 6
    .line 7
    .line 8
    :cond_0
    iput-object p1, p0, Lcoil3/request/ViewTargetRequestManager;->f:Lcoil3/request/ViewTargetRequestDelegate;

    .line 9
    .line 10
    return-void
.end method

.method public onViewAttachedToWindow(Landroid/view/View;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lcoil3/request/ViewTargetRequestManager;->f:Lcoil3/request/ViewTargetRequestDelegate;

    .line 2
    .line 3
    if-nez p1, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    const/4 v0, 0x1

    .line 7
    iput-boolean v0, p0, Lcoil3/request/ViewTargetRequestManager;->g:Z

    .line 8
    .line 9
    invoke-virtual {p1}, Lcoil3/request/ViewTargetRequestDelegate;->e()V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public onViewDetachedFromWindow(Landroid/view/View;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lcoil3/request/ViewTargetRequestManager;->f:Lcoil3/request/ViewTargetRequestDelegate;

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    invoke-virtual {p1}, Lcoil3/request/ViewTargetRequestDelegate;->d()V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method
