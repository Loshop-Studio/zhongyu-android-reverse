.class final Landroidx/fragment/app/DefaultSpecialEffectsController$TransitionEffect$onStart$4$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lhd/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/fragment/app/DefaultSpecialEffectsController$TransitionEffect$onStart$4;->invoke()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lhd/a;"
    }
.end annotation


# instance fields
.field final synthetic $container:Landroid/view/ViewGroup;

.field final synthetic $mergedTransition:Ljava/lang/Object;

.field final synthetic this$0:Landroidx/fragment/app/DefaultSpecialEffectsController$TransitionEffect;


# direct methods
.method public constructor <init>(Landroidx/fragment/app/DefaultSpecialEffectsController$TransitionEffect;Ljava/lang/Object;Landroid/view/ViewGroup;)V
    .locals 0

    iput-object p1, p0, Landroidx/fragment/app/DefaultSpecialEffectsController$TransitionEffect$onStart$4$1;->this$0:Landroidx/fragment/app/DefaultSpecialEffectsController$TransitionEffect;

    iput-object p2, p0, Landroidx/fragment/app/DefaultSpecialEffectsController$TransitionEffect$onStart$4$1;->$mergedTransition:Ljava/lang/Object;

    iput-object p3, p0, Landroidx/fragment/app/DefaultSpecialEffectsController$TransitionEffect$onStart$4$1;->$container:Landroid/view/ViewGroup;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static synthetic a(Landroidx/fragment/app/DefaultSpecialEffectsController$TransitionEffect;Landroid/view/ViewGroup;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Landroidx/fragment/app/DefaultSpecialEffectsController$TransitionEffect$onStart$4$1;->invoke$lambda$2(Landroidx/fragment/app/DefaultSpecialEffectsController$TransitionEffect;Landroid/view/ViewGroup;)V

    return-void
.end method

.method public static synthetic c(Landroidx/fragment/app/DefaultSpecialEffectsController$TransitionEffect;)V
    .locals 0

    .line 1
    invoke-static {p0}, Landroidx/fragment/app/DefaultSpecialEffectsController$TransitionEffect$onStart$4$1;->invoke$lambda$4(Landroidx/fragment/app/DefaultSpecialEffectsController$TransitionEffect;)V

    return-void
.end method

.method private static final invoke$lambda$2(Landroidx/fragment/app/DefaultSpecialEffectsController$TransitionEffect;Landroid/view/ViewGroup;)V
    .locals 2

    .line 1
    const-string/jumbo v0, "this$0"

    .line 2
    .line 3
    .line 4
    invoke-static {p0, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    .line 6
    .line 7
    const-string v0, "$container"

    .line 8
    .line 9
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Landroidx/fragment/app/DefaultSpecialEffectsController$TransitionEffect;->getTransitionInfos()Ljava/util/List;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    check-cast p0, Ljava/lang/Iterable;

    .line 17
    .line 18
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-eqz v0, :cond_1

    .line 27
    .line 28
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    check-cast v0, Landroidx/fragment/app/DefaultSpecialEffectsController$TransitionInfo;

    .line 33
    .line 34
    invoke-virtual {v0}, Landroidx/fragment/app/DefaultSpecialEffectsController$SpecialEffectsInfo;->getOperation()Landroidx/fragment/app/SpecialEffectsController$Operation;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-virtual {v0}, Landroidx/fragment/app/SpecialEffectsController$Operation;->getFragment()Landroidx/fragment/app/Fragment;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->getView()Landroid/view/View;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    if-eqz v1, :cond_0

    .line 47
    .line 48
    invoke-virtual {v0}, Landroidx/fragment/app/SpecialEffectsController$Operation;->getFinalState()Landroidx/fragment/app/SpecialEffectsController$Operation$State;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    invoke-virtual {v0, v1, p1}, Landroidx/fragment/app/SpecialEffectsController$Operation$State;->applyState(Landroid/view/View;Landroid/view/ViewGroup;)V

    .line 53
    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_1
    return-void
.end method

.method private static final invoke$lambda$4(Landroidx/fragment/app/DefaultSpecialEffectsController$TransitionEffect;)V
    .locals 2

    .line 1
    const-string/jumbo v0, "this$0"

    .line 2
    .line 3
    .line 4
    invoke-static {p0, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    .line 6
    .line 7
    const/4 v0, 0x2

    .line 8
    invoke-static {v0}, Landroidx/fragment/app/FragmentManager;->isLoggingEnabled(I)Z

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Landroidx/fragment/app/DefaultSpecialEffectsController$TransitionEffect;->getTransitionInfos()Ljava/util/List;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, Ljava/lang/Iterable;

    .line 16
    .line 17
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-eqz v1, :cond_0

    .line 26
    .line 27
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    check-cast v1, Landroidx/fragment/app/DefaultSpecialEffectsController$TransitionInfo;

    .line 32
    .line 33
    invoke-virtual {v1}, Landroidx/fragment/app/DefaultSpecialEffectsController$SpecialEffectsInfo;->getOperation()Landroidx/fragment/app/SpecialEffectsController$Operation;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    invoke-virtual {v1, p0}, Landroidx/fragment/app/SpecialEffectsController$Operation;->completeEffect(Landroidx/fragment/app/SpecialEffectsController$Effect;)V

    .line 38
    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_0
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/DefaultSpecialEffectsController$TransitionEffect$onStart$4$1;->invoke()V

    sget-object v0, Lqc/q;->a:Lqc/q;

    return-object v0
.end method

.method public final invoke()V
    .locals 6

    .line 2
    iget-object v0, p0, Landroidx/fragment/app/DefaultSpecialEffectsController$TransitionEffect$onStart$4$1;->this$0:Landroidx/fragment/app/DefaultSpecialEffectsController$TransitionEffect;

    invoke-virtual {v0}, Landroidx/fragment/app/DefaultSpecialEffectsController$TransitionEffect;->getTransitionInfos()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    .line 3
    instance-of v1, v0, Ljava/util/Collection;

    const/4 v2, 0x2

    if-eqz v1, :cond_0

    move-object v1, v0

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    .line 4
    :cond_0
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/fragment/app/DefaultSpecialEffectsController$TransitionInfo;

    .line 5
    invoke-virtual {v1}, Landroidx/fragment/app/DefaultSpecialEffectsController$SpecialEffectsInfo;->getOperation()Landroidx/fragment/app/SpecialEffectsController$Operation;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/fragment/app/SpecialEffectsController$Operation;->isSeeking()Z

    move-result v1

    if-nez v1, :cond_1

    .line 6
    invoke-static {v2}, Landroidx/fragment/app/FragmentManager;->isLoggingEnabled(I)Z

    .line 7
    new-instance v0, Landroidx/core/os/CancellationSignal;

    invoke-direct {v0}, Landroidx/core/os/CancellationSignal;-><init>()V

    .line 8
    iget-object v1, p0, Landroidx/fragment/app/DefaultSpecialEffectsController$TransitionEffect$onStart$4$1;->this$0:Landroidx/fragment/app/DefaultSpecialEffectsController$TransitionEffect;

    invoke-virtual {v1}, Landroidx/fragment/app/DefaultSpecialEffectsController$TransitionEffect;->getTransitionImpl()Landroidx/fragment/app/FragmentTransitionImpl;

    move-result-object v1

    .line 9
    iget-object v2, p0, Landroidx/fragment/app/DefaultSpecialEffectsController$TransitionEffect$onStart$4$1;->this$0:Landroidx/fragment/app/DefaultSpecialEffectsController$TransitionEffect;

    invoke-virtual {v2}, Landroidx/fragment/app/DefaultSpecialEffectsController$TransitionEffect;->getTransitionInfos()Ljava/util/List;

    move-result-object v2

    const/4 v3, 0x0

    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/fragment/app/DefaultSpecialEffectsController$TransitionInfo;

    invoke-virtual {v2}, Landroidx/fragment/app/DefaultSpecialEffectsController$SpecialEffectsInfo;->getOperation()Landroidx/fragment/app/SpecialEffectsController$Operation;

    move-result-object v2

    invoke-virtual {v2}, Landroidx/fragment/app/SpecialEffectsController$Operation;->getFragment()Landroidx/fragment/app/Fragment;

    move-result-object v2

    .line 10
    iget-object v3, p0, Landroidx/fragment/app/DefaultSpecialEffectsController$TransitionEffect$onStart$4$1;->$mergedTransition:Ljava/lang/Object;

    .line 11
    iget-object v4, p0, Landroidx/fragment/app/DefaultSpecialEffectsController$TransitionEffect$onStart$4$1;->this$0:Landroidx/fragment/app/DefaultSpecialEffectsController$TransitionEffect;

    new-instance v5, Landroidx/fragment/app/j;

    invoke-direct {v5, v4}, Landroidx/fragment/app/j;-><init>(Landroidx/fragment/app/DefaultSpecialEffectsController$TransitionEffect;)V

    invoke-virtual {v1, v2, v3, v0, v5}, Landroidx/fragment/app/FragmentTransitionImpl;->setListenerForTransitionEnd(Landroidx/fragment/app/Fragment;Ljava/lang/Object;Landroidx/core/os/CancellationSignal;Ljava/lang/Runnable;)V

    .line 12
    invoke-virtual {v0}, Landroidx/core/os/CancellationSignal;->cancel()V

    return-void

    .line 13
    :cond_2
    :goto_0
    invoke-static {v2}, Landroidx/fragment/app/FragmentManager;->isLoggingEnabled(I)Z

    .line 14
    iget-object v0, p0, Landroidx/fragment/app/DefaultSpecialEffectsController$TransitionEffect$onStart$4$1;->this$0:Landroidx/fragment/app/DefaultSpecialEffectsController$TransitionEffect;

    invoke-virtual {v0}, Landroidx/fragment/app/DefaultSpecialEffectsController$TransitionEffect;->getTransitionImpl()Landroidx/fragment/app/FragmentTransitionImpl;

    move-result-object v0

    iget-object v1, p0, Landroidx/fragment/app/DefaultSpecialEffectsController$TransitionEffect$onStart$4$1;->this$0:Landroidx/fragment/app/DefaultSpecialEffectsController$TransitionEffect;

    invoke-virtual {v1}, Landroidx/fragment/app/DefaultSpecialEffectsController$TransitionEffect;->getController()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    iget-object v2, p0, Landroidx/fragment/app/DefaultSpecialEffectsController$TransitionEffect$onStart$4$1;->this$0:Landroidx/fragment/app/DefaultSpecialEffectsController$TransitionEffect;

    iget-object v3, p0, Landroidx/fragment/app/DefaultSpecialEffectsController$TransitionEffect$onStart$4$1;->$container:Landroid/view/ViewGroup;

    new-instance v4, Landroidx/fragment/app/i;

    invoke-direct {v4, v2, v3}, Landroidx/fragment/app/i;-><init>(Landroidx/fragment/app/DefaultSpecialEffectsController$TransitionEffect;Landroid/view/ViewGroup;)V

    invoke-virtual {v0, v1, v4}, Landroidx/fragment/app/FragmentTransitionImpl;->animateToStart(Ljava/lang/Object;Ljava/lang/Runnable;)V

    return-void
.end method
