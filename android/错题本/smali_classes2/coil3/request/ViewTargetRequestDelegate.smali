.class public final Lcoil3/request/ViewTargetRequestDelegate;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ls/m;
.implements Landroidx/lifecycle/DefaultLifecycleObserver;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0008\u0000\u0018\u00002\u00020\u00012\u00020\u0002\u00a8\u0006\u0003"
    }
    d2 = {
        "Lcoil3/request/ViewTargetRequestDelegate;",
        "Ls/m;",
        "Landroidx/lifecycle/DefaultLifecycleObserver;",
        "coil-core_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final a:Lcoil3/r;

.field public final b:Ls/f;

.field public final c:Lcoil3/target/GenericViewTarget;

.field public final d:Landroidx/lifecycle/Lifecycle;

.field public final e:Lkotlinx/coroutines/w0;


# direct methods
.method public constructor <init>(Lcoil3/r;Ls/f;Lcoil3/target/GenericViewTarget;Landroidx/lifecycle/Lifecycle;Lkotlinx/coroutines/w0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcoil3/request/ViewTargetRequestDelegate;->a:Lcoil3/r;

    .line 5
    .line 6
    iput-object p2, p0, Lcoil3/request/ViewTargetRequestDelegate;->b:Ls/f;

    .line 7
    .line 8
    iput-object p3, p0, Lcoil3/request/ViewTargetRequestDelegate;->c:Lcoil3/target/GenericViewTarget;

    .line 9
    .line 10
    iput-object p4, p0, Lcoil3/request/ViewTargetRequestDelegate;->d:Landroidx/lifecycle/Lifecycle;

    .line 11
    .line 12
    iput-object p5, p0, Lcoil3/request/ViewTargetRequestDelegate;->e:Lkotlinx/coroutines/w0;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final a(Lh6/c;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lcoil3/request/ViewTargetRequestDelegate;->d:Landroidx/lifecycle/Lifecycle;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, Lkotlin/coroutines/jvm/internal/ContinuationImpl;

    .line 6
    .line 7
    invoke-static {v0, p1}, Lcoil3/util/g;->a(Landroidx/lifecycle/Lifecycle;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    sget-object v0, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 12
    .line 13
    if-ne p1, v0, :cond_0

    .line 14
    .line 15
    return-object p1

    .line 16
    :cond_0
    sget-object p1, Ld6/s;->a:Ld6/s;

    .line 17
    .line 18
    return-object p1
.end method

.method public final b()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcoil3/request/ViewTargetRequestDelegate;->c:Lcoil3/target/GenericViewTarget;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    throw v0
.end method

.method public final onDestroy(Landroidx/lifecycle/LifecycleOwner;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lcoil3/request/ViewTargetRequestDelegate;->c:Lcoil3/target/GenericViewTarget;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    invoke-static {p1}, Ly1/a;->n(Landroid/view/View;)Ls/o;

    .line 8
    .line 9
    .line 10
    throw p1
.end method

.method public final start()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcoil3/request/ViewTargetRequestDelegate;->d:Landroidx/lifecycle/Lifecycle;

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
    iget-object v1, p0, Lcoil3/request/ViewTargetRequestDelegate;->c:Lcoil3/target/GenericViewTarget;

    .line 9
    .line 10
    if-eqz v1, :cond_1

    .line 11
    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    invoke-virtual {v0, v1}, Landroidx/lifecycle/Lifecycle;->removeObserver(Landroidx/lifecycle/LifecycleObserver;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, v1}, Landroidx/lifecycle/Lifecycle;->addObserver(Landroidx/lifecycle/LifecycleObserver;)V

    .line 18
    .line 19
    .line 20
    :cond_1
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    const/4 v0, 0x0

    .line 24
    invoke-static {v0}, Ly1/a;->n(Landroid/view/View;)Ls/o;

    .line 25
    .line 26
    .line 27
    throw v0
.end method
