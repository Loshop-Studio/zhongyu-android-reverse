.class public final Lcoil3/request/LifecycleRequestDelegate;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lw/o;
.implements Landroidx/lifecycle/DefaultLifecycleObserver;


# instance fields
.field public final c:Landroidx/lifecycle/Lifecycle;

.field public final d:Lkotlinx/coroutines/g;


# direct methods
.method public constructor <init>(Landroidx/lifecycle/Lifecycle;Lkotlinx/coroutines/g;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcoil3/request/LifecycleRequestDelegate;->c:Landroidx/lifecycle/Lifecycle;

    .line 5
    .line 6
    iput-object p2, p0, Lcoil3/request/LifecycleRequestDelegate;->d:Lkotlinx/coroutines/g;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public a(Lvc/c;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lcoil3/request/LifecycleRequestDelegate;->c:Landroidx/lifecycle/Lifecycle;

    .line 2
    .line 3
    invoke-static {v0, p1}, Lcoil3/util/LifecyclesKt;->a(Landroidx/lifecycle/Lifecycle;Lvc/c;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-ne p1, v0, :cond_0

    .line 12
    .line 13
    return-object p1

    .line 14
    :cond_0
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 15
    .line 16
    return-object p1
.end method

.method public complete()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcoil3/request/LifecycleRequestDelegate;->c:Landroidx/lifecycle/Lifecycle;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Landroidx/lifecycle/Lifecycle;->removeObserver(Landroidx/lifecycle/LifecycleObserver;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public d()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcoil3/request/LifecycleRequestDelegate;->d:Lkotlinx/coroutines/g;

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
    return-void
.end method

.method public onDestroy(Landroidx/lifecycle/LifecycleOwner;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcoil3/request/LifecycleRequestDelegate;->d()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public start()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcoil3/request/LifecycleRequestDelegate;->c:Landroidx/lifecycle/Lifecycle;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Landroidx/lifecycle/Lifecycle;->addObserver(Landroidx/lifecycle/LifecycleObserver;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
