.class public abstract Lcom/friday/lecture/widget/LifecycleFrameLayout;
.super Landroid/widget/FrameLayout;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/LifecycleOwner;


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation


# instance fields
.field public final c:Lqc/d;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 7
    .line 8
    .line 9
    new-instance p1, Ln3/a;

    .line 10
    .line 11
    invoke-direct {p1, p0}, Ln3/a;-><init>(Lcom/friday/lecture/widget/LifecycleFrameLayout;)V

    .line 12
    .line 13
    .line 14
    invoke-static {p1}, Lkotlin/a;->a(Lhd/a;)Lqc/d;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    iput-object p1, p0, Lcom/friday/lecture/widget/LifecycleFrameLayout;->c:Lqc/d;

    .line 19
    .line 20
    return-void
.end method

.method public static synthetic a(Lcom/friday/lecture/widget/LifecycleFrameLayout;)Landroidx/lifecycle/LifecycleRegistry;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/friday/lecture/widget/LifecycleFrameLayout;->b(Lcom/friday/lecture/widget/LifecycleFrameLayout;)Landroidx/lifecycle/LifecycleRegistry;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Lcom/friday/lecture/widget/LifecycleFrameLayout;)Landroidx/lifecycle/LifecycleRegistry;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/friday/lecture/widget/LifecycleFrameLayout;->c()Landroidx/lifecycle/LifecycleRegistry;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private final getMRegistry()Landroidx/lifecycle/LifecycleRegistry;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/lecture/widget/LifecycleFrameLayout;->c:Lqc/d;

    .line 2
    .line 3
    invoke-interface {v0}, Lqc/d;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Landroidx/lifecycle/LifecycleRegistry;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public abstract c()Landroidx/lifecycle/LifecycleRegistry;
.end method

.method public getLifecycle()Landroidx/lifecycle/Lifecycle;
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/friday/lecture/widget/LifecycleFrameLayout;->getMRegistry()Landroidx/lifecycle/LifecycleRegistry;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public onAttachedToWindow()V
    .locals 2

    .line 1
    invoke-super {p0}, Landroid/view/View;->onAttachedToWindow()V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lcom/friday/lecture/widget/LifecycleFrameLayout;->getMRegistry()Landroidx/lifecycle/LifecycleRegistry;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    sget-object v1, Landroidx/lifecycle/Lifecycle$State;->CREATED:Landroidx/lifecycle/Lifecycle$State;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Landroidx/lifecycle/LifecycleRegistry;->setCurrentState(Landroidx/lifecycle/Lifecycle$State;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public onDetachedFromWindow()V
    .locals 2

    .line 1
    invoke-super {p0}, Landroid/view/View;->onDetachedFromWindow()V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lcom/friday/lecture/widget/LifecycleFrameLayout;->getMRegistry()Landroidx/lifecycle/LifecycleRegistry;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    sget-object v1, Landroidx/lifecycle/Lifecycle$State;->DESTROYED:Landroidx/lifecycle/Lifecycle$State;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Landroidx/lifecycle/LifecycleRegistry;->setCurrentState(Landroidx/lifecycle/Lifecycle$State;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public onWindowVisibilityChanged(I)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroid/view/View;->onWindowVisibilityChanged(I)V

    .line 2
    .line 3
    .line 4
    if-eqz p1, :cond_1

    .line 5
    .line 6
    const/4 v0, 0x4

    .line 7
    if-eq p1, v0, :cond_0

    .line 8
    .line 9
    const/16 v0, 0x8

    .line 10
    .line 11
    if-eq p1, v0, :cond_0

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    invoke-direct {p0}, Lcom/friday/lecture/widget/LifecycleFrameLayout;->getMRegistry()Landroidx/lifecycle/LifecycleRegistry;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    sget-object v0, Landroidx/lifecycle/Lifecycle$Event;->ON_PAUSE:Landroidx/lifecycle/Lifecycle$Event;

    .line 19
    .line 20
    invoke-virtual {p1, v0}, Landroidx/lifecycle/LifecycleRegistry;->handleLifecycleEvent(Landroidx/lifecycle/Lifecycle$Event;)V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :cond_1
    invoke-direct {p0}, Lcom/friday/lecture/widget/LifecycleFrameLayout;->getMRegistry()Landroidx/lifecycle/LifecycleRegistry;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    sget-object v0, Landroidx/lifecycle/Lifecycle$Event;->ON_RESUME:Landroidx/lifecycle/Lifecycle$Event;

    .line 29
    .line 30
    invoke-virtual {p1, v0}, Landroidx/lifecycle/LifecycleRegistry;->handleLifecycleEvent(Landroidx/lifecycle/Lifecycle$Event;)V

    .line 31
    .line 32
    .line 33
    return-void
.end method
