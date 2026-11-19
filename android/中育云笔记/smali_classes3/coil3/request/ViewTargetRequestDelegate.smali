.class public final Lcoil3/request/ViewTargetRequestDelegate;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lw/o;
.implements Landroidx/lifecycle/DefaultLifecycleObserver;


# instance fields
.field public final c:Lcoil3/e;

.field public final d:Lw/g;

.field public final e:Ly/b;

.field public final f:Landroidx/lifecycle/Lifecycle;

.field public final g:Lkotlinx/coroutines/g;


# direct methods
.method public constructor <init>(Lcoil3/e;Lw/g;Ly/b;Landroidx/lifecycle/Lifecycle;Lkotlinx/coroutines/g;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcoil3/e;",
            "Lw/g;",
            "Ly/b;",
            "Landroidx/lifecycle/Lifecycle;",
            "Lkotlinx/coroutines/g;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcoil3/request/ViewTargetRequestDelegate;->c:Lcoil3/e;

    .line 5
    .line 6
    iput-object p2, p0, Lcoil3/request/ViewTargetRequestDelegate;->d:Lw/g;

    .line 7
    .line 8
    iput-object p3, p0, Lcoil3/request/ViewTargetRequestDelegate;->e:Ly/b;

    .line 9
    .line 10
    iput-object p4, p0, Lcoil3/request/ViewTargetRequestDelegate;->f:Landroidx/lifecycle/Lifecycle;

    .line 11
    .line 12
    iput-object p5, p0, Lcoil3/request/ViewTargetRequestDelegate;->g:Lkotlinx/coroutines/g;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public a(Lvc/c;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lcoil3/request/ViewTargetRequestDelegate;->f:Landroidx/lifecycle/Lifecycle;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    invoke-static {v0, p1}, Lcoil3/util/LifecyclesKt;->a(Landroidx/lifecycle/Lifecycle;Lvc/c;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    if-ne p1, v0, :cond_0

    .line 14
    .line 15
    return-object p1

    .line 16
    :cond_0
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 17
    .line 18
    return-object p1

    .line 19
    :cond_1
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 20
    .line 21
    return-object p1
.end method

.method public b()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcoil3/request/ViewTargetRequestDelegate;->e:Ly/b;

    .line 2
    .line 3
    invoke-interface {v0}, Ly/b;->getView()Landroid/view/View;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Landroid/view/View;->isAttachedToWindow()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    iget-object v0, p0, Lcoil3/request/ViewTargetRequestDelegate;->e:Ly/b;

    .line 15
    .line 16
    invoke-interface {v0}, Ly/b;->getView()Landroid/view/View;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-static {v0}, Lw/t;->a(Landroid/view/View;)Lcoil3/request/ViewTargetRequestManager;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-virtual {v0, p0}, Lcoil3/request/ViewTargetRequestManager;->c(Lcoil3/request/ViewTargetRequestDelegate;)V

    .line 25
    .line 26
    .line 27
    new-instance v0, Ljava/util/concurrent/CancellationException;

    .line 28
    .line 29
    const-string v1, "\'ViewTarget.view\' must be attached to a window."

    .line 30
    .line 31
    invoke-direct {v0, v1}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    throw v0
.end method

.method public d()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcoil3/request/ViewTargetRequestDelegate;->g:Lkotlinx/coroutines/g;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    invoke-static {v0, v1, v2, v1}, Lkotlinx/coroutines/g$a;->a(Lkotlinx/coroutines/g;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lcoil3/request/ViewTargetRequestDelegate;->e:Ly/b;

    .line 9
    .line 10
    instance-of v1, v0, Landroidx/lifecycle/LifecycleObserver;

    .line 11
    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    iget-object v1, p0, Lcoil3/request/ViewTargetRequestDelegate;->f:Landroidx/lifecycle/Lifecycle;

    .line 15
    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    check-cast v0, Landroidx/lifecycle/LifecycleObserver;

    .line 19
    .line 20
    invoke-virtual {v1, v0}, Landroidx/lifecycle/Lifecycle;->removeObserver(Landroidx/lifecycle/LifecycleObserver;)V

    .line 21
    .line 22
    .line 23
    :cond_0
    iget-object v0, p0, Lcoil3/request/ViewTargetRequestDelegate;->f:Landroidx/lifecycle/Lifecycle;

    .line 24
    .line 25
    if-eqz v0, :cond_1

    .line 26
    .line 27
    invoke-virtual {v0, p0}, Landroidx/lifecycle/Lifecycle;->removeObserver(Landroidx/lifecycle/LifecycleObserver;)V

    .line 28
    .line 29
    .line 30
    :cond_1
    return-void
.end method

.method public final e()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcoil3/request/ViewTargetRequestDelegate;->c:Lcoil3/e;

    .line 2
    .line 3
    iget-object v1, p0, Lcoil3/request/ViewTargetRequestDelegate;->d:Lw/g;

    .line 4
    .line 5
    invoke-interface {v0, v1}, Lcoil3/e;->c(Lw/g;)Lw/c;

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public onDestroy(Landroidx/lifecycle/LifecycleOwner;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lcoil3/request/ViewTargetRequestDelegate;->e:Ly/b;

    .line 2
    .line 3
    invoke-interface {p1}, Ly/b;->getView()Landroid/view/View;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-static {p1}, Lw/t;->a(Landroid/view/View;)Lcoil3/request/ViewTargetRequestManager;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-virtual {p1}, Lcoil3/request/ViewTargetRequestManager;->a()V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public start()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcoil3/request/ViewTargetRequestDelegate;->f:Landroidx/lifecycle/Lifecycle;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0, p0}, Landroidx/lifecycle/Lifecycle;->addObserver(Landroidx/lifecycle/LifecycleObserver;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    iget-object v0, p0, Lcoil3/request/ViewTargetRequestDelegate;->e:Ly/b;

    .line 9
    .line 10
    instance-of v1, v0, Landroidx/lifecycle/LifecycleObserver;

    .line 11
    .line 12
    if-eqz v1, :cond_1

    .line 13
    .line 14
    iget-object v1, p0, Lcoil3/request/ViewTargetRequestDelegate;->f:Landroidx/lifecycle/Lifecycle;

    .line 15
    .line 16
    if-eqz v1, :cond_1

    .line 17
    .line 18
    check-cast v0, Landroidx/lifecycle/LifecycleObserver;

    .line 19
    .line 20
    invoke-static {v1, v0}, Lcoil3/util/LifecyclesKt;->b(Landroidx/lifecycle/Lifecycle;Landroidx/lifecycle/LifecycleObserver;)V

    .line 21
    .line 22
    .line 23
    :cond_1
    iget-object v0, p0, Lcoil3/request/ViewTargetRequestDelegate;->e:Ly/b;

    .line 24
    .line 25
    invoke-interface {v0}, Ly/b;->getView()Landroid/view/View;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-static {v0}, Lw/t;->a(Landroid/view/View;)Lcoil3/request/ViewTargetRequestManager;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-virtual {v0, p0}, Lcoil3/request/ViewTargetRequestManager;->c(Lcoil3/request/ViewTargetRequestDelegate;)V

    .line 34
    .line 35
    .line 36
    return-void
.end method
