.class public abstract Landroidx/fragment/app/SpecialEffectsController;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/fragment/app/SpecialEffectsController$Companion;,
        Landroidx/fragment/app/SpecialEffectsController$Effect;,
        Landroidx/fragment/app/SpecialEffectsController$FragmentStateManagerOperation;,
        Landroidx/fragment/app/SpecialEffectsController$Operation;,
        Landroidx/fragment/app/SpecialEffectsController$WhenMappings;
    }
.end annotation


# static fields
.field public static final Companion:Landroidx/fragment/app/SpecialEffectsController$Companion;


# instance fields
.field private final container:Landroid/view/ViewGroup;

.field private isContainerPostponed:Z

.field private operationDirectionIsPop:Z

.field private final pendingOperations:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroidx/fragment/app/SpecialEffectsController$Operation;",
            ">;"
        }
    .end annotation
.end field

.field private runningNonSeekableTransition:Z

.field private final runningOperations:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroidx/fragment/app/SpecialEffectsController$Operation;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Landroidx/fragment/app/SpecialEffectsController$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Landroidx/fragment/app/SpecialEffectsController$Companion;-><init>(Lkotlin/jvm/internal/n;)V

    sput-object v0, Landroidx/fragment/app/SpecialEffectsController;->Companion:Landroidx/fragment/app/SpecialEffectsController$Companion;

    return-void
.end method

.method public constructor <init>(Landroid/view/ViewGroup;)V
    .locals 1

    .line 1
    const-string v0, "container"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Landroidx/fragment/app/SpecialEffectsController;->container:Landroid/view/ViewGroup;

    .line 10
    .line 11
    new-instance p1, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, Landroidx/fragment/app/SpecialEffectsController;->pendingOperations:Ljava/util/List;

    .line 17
    .line 18
    new-instance p1, Ljava/util/ArrayList;

    .line 19
    .line 20
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object p1, p0, Landroidx/fragment/app/SpecialEffectsController;->runningOperations:Ljava/util/List;

    .line 24
    .line 25
    return-void
.end method

.method public static synthetic a(Landroidx/fragment/app/SpecialEffectsController;Landroidx/fragment/app/SpecialEffectsController$FragmentStateManagerOperation;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Landroidx/fragment/app/SpecialEffectsController;->enqueue$lambda$4$lambda$2(Landroidx/fragment/app/SpecialEffectsController;Landroidx/fragment/app/SpecialEffectsController$FragmentStateManagerOperation;)V

    return-void
.end method

.method public static synthetic b(Landroidx/fragment/app/SpecialEffectsController;Landroidx/fragment/app/SpecialEffectsController$FragmentStateManagerOperation;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Landroidx/fragment/app/SpecialEffectsController;->enqueue$lambda$4$lambda$3(Landroidx/fragment/app/SpecialEffectsController;Landroidx/fragment/app/SpecialEffectsController$FragmentStateManagerOperation;)V

    return-void
.end method

.method private final enqueue(Landroidx/fragment/app/SpecialEffectsController$Operation$State;Landroidx/fragment/app/SpecialEffectsController$Operation$LifecycleImpact;Landroidx/fragment/app/FragmentStateManager;)V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/SpecialEffectsController;->pendingOperations:Ljava/util/List;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    invoke-virtual {p3}, Landroidx/fragment/app/FragmentStateManager;->getFragment()Landroidx/fragment/app/Fragment;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    const-string v2, "fragmentStateManager.fragment"

    .line 9
    .line 10
    invoke-static {v1, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    invoke-direct {p0, v1}, Landroidx/fragment/app/SpecialEffectsController;->findPendingOperation(Landroidx/fragment/app/Fragment;)Landroidx/fragment/app/SpecialEffectsController$Operation;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    if-nez v1, :cond_2

    .line 18
    .line 19
    invoke-virtual {p3}, Landroidx/fragment/app/FragmentStateManager;->getFragment()Landroidx/fragment/app/Fragment;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    iget-boolean v1, v1, Landroidx/fragment/app/Fragment;->mTransitioning:Z

    .line 24
    .line 25
    if-nez v1, :cond_1

    .line 26
    .line 27
    invoke-virtual {p3}, Landroidx/fragment/app/FragmentStateManager;->getFragment()Landroidx/fragment/app/Fragment;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget-boolean v1, v1, Landroidx/fragment/app/Fragment;->mRemoving:Z

    .line 32
    .line 33
    if-eqz v1, :cond_0

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    const/4 v1, 0x0

    .line 37
    goto :goto_1

    .line 38
    :catchall_0
    move-exception p1

    .line 39
    goto :goto_2

    .line 40
    :cond_1
    :goto_0
    invoke-virtual {p3}, Landroidx/fragment/app/FragmentStateManager;->getFragment()Landroidx/fragment/app/Fragment;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    const-string v2, "fragmentStateManager.fragment"

    .line 45
    .line 46
    invoke-static {v1, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    invoke-direct {p0, v1}, Landroidx/fragment/app/SpecialEffectsController;->findRunningOperation(Landroidx/fragment/app/Fragment;)Landroidx/fragment/app/SpecialEffectsController$Operation;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    :cond_2
    :goto_1
    if-eqz v1, :cond_3

    .line 54
    .line 55
    invoke-virtual {v1, p1, p2}, Landroidx/fragment/app/SpecialEffectsController$Operation;->mergeWith(Landroidx/fragment/app/SpecialEffectsController$Operation$State;Landroidx/fragment/app/SpecialEffectsController$Operation$LifecycleImpact;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 56
    .line 57
    .line 58
    monitor-exit v0

    .line 59
    return-void

    .line 60
    :cond_3
    :try_start_1
    new-instance v1, Landroidx/fragment/app/SpecialEffectsController$FragmentStateManagerOperation;

    .line 61
    .line 62
    invoke-direct {v1, p1, p2, p3}, Landroidx/fragment/app/SpecialEffectsController$FragmentStateManagerOperation;-><init>(Landroidx/fragment/app/SpecialEffectsController$Operation$State;Landroidx/fragment/app/SpecialEffectsController$Operation$LifecycleImpact;Landroidx/fragment/app/FragmentStateManager;)V

    .line 63
    .line 64
    .line 65
    iget-object p1, p0, Landroidx/fragment/app/SpecialEffectsController;->pendingOperations:Ljava/util/List;

    .line 66
    .line 67
    invoke-interface {p1, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    new-instance p1, Landroidx/fragment/app/w;

    .line 71
    .line 72
    invoke-direct {p1, p0, v1}, Landroidx/fragment/app/w;-><init>(Landroidx/fragment/app/SpecialEffectsController;Landroidx/fragment/app/SpecialEffectsController$FragmentStateManagerOperation;)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {v1, p1}, Landroidx/fragment/app/SpecialEffectsController$Operation;->addCompletionListener(Ljava/lang/Runnable;)V

    .line 76
    .line 77
    .line 78
    new-instance p1, Landroidx/fragment/app/x;

    .line 79
    .line 80
    invoke-direct {p1, p0, v1}, Landroidx/fragment/app/x;-><init>(Landroidx/fragment/app/SpecialEffectsController;Landroidx/fragment/app/SpecialEffectsController$FragmentStateManagerOperation;)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {v1, p1}, Landroidx/fragment/app/SpecialEffectsController$Operation;->addCompletionListener(Ljava/lang/Runnable;)V

    .line 84
    .line 85
    .line 86
    sget-object p1, Lqc/q;->a:Lqc/q;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 87
    .line 88
    monitor-exit v0

    .line 89
    return-void

    .line 90
    :goto_2
    monitor-exit v0

    .line 91
    throw p1
.end method

.method private static final enqueue$lambda$4$lambda$2(Landroidx/fragment/app/SpecialEffectsController;Landroidx/fragment/app/SpecialEffectsController$FragmentStateManagerOperation;)V
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
    const-string v0, "$operation"

    .line 8
    .line 9
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, Landroidx/fragment/app/SpecialEffectsController;->pendingOperations:Ljava/util/List;

    .line 13
    .line 14
    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    invoke-virtual {p1}, Landroidx/fragment/app/SpecialEffectsController$Operation;->getFinalState()Landroidx/fragment/app/SpecialEffectsController$Operation$State;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-virtual {p1}, Landroidx/fragment/app/SpecialEffectsController$Operation;->getFragment()Landroidx/fragment/app/Fragment;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    iget-object p1, p1, Landroidx/fragment/app/Fragment;->mView:Landroid/view/View;

    .line 29
    .line 30
    const-string/jumbo v1, "operation.fragment.mView"

    .line 31
    .line 32
    .line 33
    invoke-static {p1, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    iget-object p0, p0, Landroidx/fragment/app/SpecialEffectsController;->container:Landroid/view/ViewGroup;

    .line 37
    .line 38
    invoke-virtual {v0, p1, p0}, Landroidx/fragment/app/SpecialEffectsController$Operation$State;->applyState(Landroid/view/View;Landroid/view/ViewGroup;)V

    .line 39
    .line 40
    .line 41
    :cond_0
    return-void
.end method

.method private static final enqueue$lambda$4$lambda$3(Landroidx/fragment/app/SpecialEffectsController;Landroidx/fragment/app/SpecialEffectsController$FragmentStateManagerOperation;)V
    .locals 1

    .line 1
    const-string/jumbo v0, "this$0"

    .line 2
    .line 3
    .line 4
    invoke-static {p0, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    .line 6
    .line 7
    const-string v0, "$operation"

    .line 8
    .line 9
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, Landroidx/fragment/app/SpecialEffectsController;->pendingOperations:Ljava/util/List;

    .line 13
    .line 14
    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    iget-object p0, p0, Landroidx/fragment/app/SpecialEffectsController;->runningOperations:Ljava/util/List;

    .line 18
    .line 19
    invoke-interface {p0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method private final findPendingOperation(Landroidx/fragment/app/Fragment;)Landroidx/fragment/app/SpecialEffectsController$Operation;
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/SpecialEffectsController;->pendingOperations:Ljava/util/List;

    .line 2
    .line 3
    check-cast v0, Ljava/lang/Iterable;

    .line 4
    .line 5
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_1

    .line 14
    .line 15
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    move-object v2, v1

    .line 20
    check-cast v2, Landroidx/fragment/app/SpecialEffectsController$Operation;

    .line 21
    .line 22
    invoke-virtual {v2}, Landroidx/fragment/app/SpecialEffectsController$Operation;->getFragment()Landroidx/fragment/app/Fragment;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    invoke-static {v3, p1}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    if-eqz v3, :cond_0

    .line 31
    .line 32
    invoke-virtual {v2}, Landroidx/fragment/app/SpecialEffectsController$Operation;->isCanceled()Z

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    if-nez v2, :cond_0

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_1
    const/4 v1, 0x0

    .line 40
    :goto_0
    check-cast v1, Landroidx/fragment/app/SpecialEffectsController$Operation;

    .line 41
    .line 42
    return-object v1
.end method

.method private final findRunningOperation(Landroidx/fragment/app/Fragment;)Landroidx/fragment/app/SpecialEffectsController$Operation;
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/SpecialEffectsController;->runningOperations:Ljava/util/List;

    .line 2
    .line 3
    check-cast v0, Ljava/lang/Iterable;

    .line 4
    .line 5
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_1

    .line 14
    .line 15
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    move-object v2, v1

    .line 20
    check-cast v2, Landroidx/fragment/app/SpecialEffectsController$Operation;

    .line 21
    .line 22
    invoke-virtual {v2}, Landroidx/fragment/app/SpecialEffectsController$Operation;->getFragment()Landroidx/fragment/app/Fragment;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    invoke-static {v3, p1}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    if-eqz v3, :cond_0

    .line 31
    .line 32
    invoke-virtual {v2}, Landroidx/fragment/app/SpecialEffectsController$Operation;->isCanceled()Z

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    if-nez v2, :cond_0

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_1
    const/4 v1, 0x0

    .line 40
    :goto_0
    check-cast v1, Landroidx/fragment/app/SpecialEffectsController$Operation;

    .line 41
    .line 42
    return-object v1
.end method

.method public static final getOrCreateController(Landroid/view/ViewGroup;Landroidx/fragment/app/FragmentManager;)Landroidx/fragment/app/SpecialEffectsController;
    .locals 1

    .line 1
    sget-object v0, Landroidx/fragment/app/SpecialEffectsController;->Companion:Landroidx/fragment/app/SpecialEffectsController$Companion;

    invoke-virtual {v0, p0, p1}, Landroidx/fragment/app/SpecialEffectsController$Companion;->getOrCreateController(Landroid/view/ViewGroup;Landroidx/fragment/app/FragmentManager;)Landroidx/fragment/app/SpecialEffectsController;

    move-result-object p0

    return-object p0
.end method

.method public static final getOrCreateController(Landroid/view/ViewGroup;Landroidx/fragment/app/SpecialEffectsControllerFactory;)Landroidx/fragment/app/SpecialEffectsController;
    .locals 1

    .line 2
    sget-object v0, Landroidx/fragment/app/SpecialEffectsController;->Companion:Landroidx/fragment/app/SpecialEffectsController$Companion;

    invoke-virtual {v0, p0, p1}, Landroidx/fragment/app/SpecialEffectsController$Companion;->getOrCreateController(Landroid/view/ViewGroup;Landroidx/fragment/app/SpecialEffectsControllerFactory;)Landroidx/fragment/app/SpecialEffectsController;

    move-result-object p0

    return-object p0
.end method

.method private final isOperationSeekable(Ljava/util/List;)Z
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroidx/fragment/app/SpecialEffectsController$Operation;",
            ">;)Z"
        }
    .end annotation

    .line 1
    check-cast p1, Ljava/lang/Iterable;

    .line 2
    .line 3
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x1

    .line 8
    :cond_0
    :goto_0
    move v2, v1

    .line 9
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 10
    .line 11
    .line 12
    move-result v3

    .line 13
    const/4 v4, 0x0

    .line 14
    if-eqz v3, :cond_4

    .line 15
    .line 16
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    check-cast v2, Landroidx/fragment/app/SpecialEffectsController$Operation;

    .line 21
    .line 22
    invoke-virtual {v2}, Landroidx/fragment/app/SpecialEffectsController$Operation;->getEffects$fragment_release()Ljava/util/List;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    check-cast v3, Ljava/util/Collection;

    .line 27
    .line 28
    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    if-nez v3, :cond_3

    .line 33
    .line 34
    invoke-virtual {v2}, Landroidx/fragment/app/SpecialEffectsController$Operation;->getEffects$fragment_release()Ljava/util/List;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    check-cast v2, Ljava/lang/Iterable;

    .line 39
    .line 40
    instance-of v3, v2, Ljava/util/Collection;

    .line 41
    .line 42
    if-eqz v3, :cond_1

    .line 43
    .line 44
    move-object v3, v2

    .line 45
    check-cast v3, Ljava/util/Collection;

    .line 46
    .line 47
    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    .line 48
    .line 49
    .line 50
    move-result v3

    .line 51
    if-eqz v3, :cond_1

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_1
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    :cond_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 59
    .line 60
    .line 61
    move-result v3

    .line 62
    if-eqz v3, :cond_0

    .line 63
    .line 64
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v3

    .line 68
    check-cast v3, Landroidx/fragment/app/SpecialEffectsController$Effect;

    .line 69
    .line 70
    invoke-virtual {v3}, Landroidx/fragment/app/SpecialEffectsController$Effect;->isSeekingSupported()Z

    .line 71
    .line 72
    .line 73
    move-result v3

    .line 74
    if-nez v3, :cond_2

    .line 75
    .line 76
    :cond_3
    move v2, v4

    .line 77
    goto :goto_1

    .line 78
    :cond_4
    if-eqz v2, :cond_6

    .line 79
    .line 80
    new-instance v0, Ljava/util/ArrayList;

    .line 81
    .line 82
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 83
    .line 84
    .line 85
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 90
    .line 91
    .line 92
    move-result v2

    .line 93
    if-eqz v2, :cond_5

    .line 94
    .line 95
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v2

    .line 99
    check-cast v2, Landroidx/fragment/app/SpecialEffectsController$Operation;

    .line 100
    .line 101
    invoke-virtual {v2}, Landroidx/fragment/app/SpecialEffectsController$Operation;->getEffects$fragment_release()Ljava/util/List;

    .line 102
    .line 103
    .line 104
    move-result-object v2

    .line 105
    check-cast v2, Ljava/lang/Iterable;

    .line 106
    .line 107
    invoke-static {v0, v2}, Lrc/b0;->B(Ljava/util/Collection;Ljava/lang/Iterable;)Z

    .line 108
    .line 109
    .line 110
    goto :goto_2

    .line 111
    :cond_5
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 112
    .line 113
    .line 114
    move-result p1

    .line 115
    if-nez p1, :cond_6

    .line 116
    .line 117
    return v1

    .line 118
    :cond_6
    return v4
.end method

.method private final isOperationTransitioning(Ljava/util/List;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroidx/fragment/app/SpecialEffectsController$Operation;",
            ">;)Z"
        }
    .end annotation

    .line 1
    check-cast p1, Ljava/lang/Iterable;

    .line 2
    .line 3
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    const/4 v0, 0x1

    .line 8
    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-eqz v1, :cond_1

    .line 13
    .line 14
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    check-cast v1, Landroidx/fragment/app/SpecialEffectsController$Operation;

    .line 19
    .line 20
    invoke-virtual {v1}, Landroidx/fragment/app/SpecialEffectsController$Operation;->getFragment()Landroidx/fragment/app/Fragment;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    iget-boolean v1, v1, Landroidx/fragment/app/Fragment;->mTransitioning:Z

    .line 25
    .line 26
    if-nez v1, :cond_0

    .line 27
    .line 28
    const/4 v0, 0x0

    .line 29
    goto :goto_0

    .line 30
    :cond_1
    return v0
.end method

.method private final processStart(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroidx/fragment/app/SpecialEffectsController$Operation;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    move v2, v1

    .line 7
    :goto_0
    if-ge v2, v0, :cond_0

    .line 8
    .line 9
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v3

    .line 13
    check-cast v3, Landroidx/fragment/app/SpecialEffectsController$Operation;

    .line 14
    .line 15
    invoke-virtual {v3}, Landroidx/fragment/app/SpecialEffectsController$Operation;->onStart()V

    .line 16
    .line 17
    .line 18
    add-int/lit8 v2, v2, 0x1

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    check-cast p1, Ljava/lang/Iterable;

    .line 22
    .line 23
    new-instance v0, Ljava/util/ArrayList;

    .line 24
    .line 25
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 26
    .line 27
    .line 28
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    if-eqz v2, :cond_1

    .line 37
    .line 38
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    check-cast v2, Landroidx/fragment/app/SpecialEffectsController$Operation;

    .line 43
    .line 44
    invoke-virtual {v2}, Landroidx/fragment/app/SpecialEffectsController$Operation;->getEffects$fragment_release()Ljava/util/List;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    check-cast v2, Ljava/lang/Iterable;

    .line 49
    .line 50
    invoke-static {v0, v2}, Lrc/b0;->B(Ljava/util/Collection;Ljava/lang/Iterable;)Z

    .line 51
    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_1
    invoke-static {v0}, Lrc/g0;->c1(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    check-cast p1, Ljava/lang/Iterable;

    .line 59
    .line 60
    invoke-static {p1}, Lrc/g0;->X0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    :goto_2
    if-ge v1, v0, :cond_2

    .line 69
    .line 70
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v2

    .line 74
    check-cast v2, Landroidx/fragment/app/SpecialEffectsController$Effect;

    .line 75
    .line 76
    iget-object v3, p0, Landroidx/fragment/app/SpecialEffectsController;->container:Landroid/view/ViewGroup;

    .line 77
    .line 78
    invoke-virtual {v2, v3}, Landroidx/fragment/app/SpecialEffectsController$Effect;->performStart(Landroid/view/ViewGroup;)V

    .line 79
    .line 80
    .line 81
    add-int/lit8 v1, v1, 0x1

    .line 82
    .line 83
    goto :goto_2

    .line 84
    :cond_2
    return-void
.end method

.method private final updateFinalState()V
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/SpecialEffectsController;->pendingOperations:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_1

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Landroidx/fragment/app/SpecialEffectsController$Operation;

    .line 18
    .line 19
    invoke-virtual {v1}, Landroidx/fragment/app/SpecialEffectsController$Operation;->getLifecycleImpact()Landroidx/fragment/app/SpecialEffectsController$Operation$LifecycleImpact;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    sget-object v3, Landroidx/fragment/app/SpecialEffectsController$Operation$LifecycleImpact;->ADDING:Landroidx/fragment/app/SpecialEffectsController$Operation$LifecycleImpact;

    .line 24
    .line 25
    if-ne v2, v3, :cond_0

    .line 26
    .line 27
    invoke-virtual {v1}, Landroidx/fragment/app/SpecialEffectsController$Operation;->getFragment()Landroidx/fragment/app/Fragment;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    invoke-virtual {v2}, Landroidx/fragment/app/Fragment;->requireView()Landroid/view/View;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    const-string v3, "fragment.requireView()"

    .line 36
    .line 37
    invoke-static {v2, v3}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    sget-object v3, Landroidx/fragment/app/SpecialEffectsController$Operation$State;->Companion:Landroidx/fragment/app/SpecialEffectsController$Operation$State$Companion;

    .line 41
    .line 42
    invoke-virtual {v2}, Landroid/view/View;->getVisibility()I

    .line 43
    .line 44
    .line 45
    move-result v2

    .line 46
    invoke-virtual {v3, v2}, Landroidx/fragment/app/SpecialEffectsController$Operation$State$Companion;->from(I)Landroidx/fragment/app/SpecialEffectsController$Operation$State;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    sget-object v3, Landroidx/fragment/app/SpecialEffectsController$Operation$LifecycleImpact;->NONE:Landroidx/fragment/app/SpecialEffectsController$Operation$LifecycleImpact;

    .line 51
    .line 52
    invoke-virtual {v1, v2, v3}, Landroidx/fragment/app/SpecialEffectsController$Operation;->mergeWith(Landroidx/fragment/app/SpecialEffectsController$Operation$State;Landroidx/fragment/app/SpecialEffectsController$Operation$LifecycleImpact;)V

    .line 53
    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_1
    return-void
.end method


# virtual methods
.method public final applyContainerChangesToOperation$fragment_release(Landroidx/fragment/app/SpecialEffectsController$Operation;)V
    .locals 3

    .line 1
    const-string/jumbo v0, "operation"

    .line 2
    .line 3
    .line 4
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p1}, Landroidx/fragment/app/SpecialEffectsController$Operation;->isAwaitingContainerChanges()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-virtual {p1}, Landroidx/fragment/app/SpecialEffectsController$Operation;->getFinalState()Landroidx/fragment/app/SpecialEffectsController$Operation$State;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {p1}, Landroidx/fragment/app/SpecialEffectsController$Operation;->getFragment()Landroidx/fragment/app/Fragment;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->requireView()Landroid/view/View;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    const-string/jumbo v2, "operation.fragment.requireView()"

    .line 26
    .line 27
    .line 28
    invoke-static {v1, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    iget-object v2, p0, Landroidx/fragment/app/SpecialEffectsController;->container:Landroid/view/ViewGroup;

    .line 32
    .line 33
    invoke-virtual {v0, v1, v2}, Landroidx/fragment/app/SpecialEffectsController$Operation$State;->applyState(Landroid/view/View;Landroid/view/ViewGroup;)V

    .line 34
    .line 35
    .line 36
    const/4 v0, 0x0

    .line 37
    invoke-virtual {p1, v0}, Landroidx/fragment/app/SpecialEffectsController$Operation;->setAwaitingContainerChanges(Z)V

    .line 38
    .line 39
    .line 40
    :cond_0
    return-void
.end method

.method public abstract collectEffects(Ljava/util/List;Z)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroidx/fragment/app/SpecialEffectsController$Operation;",
            ">;Z)V"
        }
    .end annotation
.end method

.method public commitEffects$fragment_release(Ljava/util/List;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroidx/fragment/app/SpecialEffectsController$Operation;",
            ">;)V"
        }
    .end annotation

    .line 1
    const-string/jumbo v0, "operations"

    .line 2
    .line 3
    .line 4
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    .line 6
    .line 7
    move-object v0, p1

    .line 8
    check-cast v0, Ljava/lang/Iterable;

    .line 9
    .line 10
    new-instance v1, Ljava/util/ArrayList;

    .line 11
    .line 12
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 13
    .line 14
    .line 15
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    if-eqz v2, :cond_0

    .line 24
    .line 25
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    check-cast v2, Landroidx/fragment/app/SpecialEffectsController$Operation;

    .line 30
    .line 31
    invoke-virtual {v2}, Landroidx/fragment/app/SpecialEffectsController$Operation;->getEffects$fragment_release()Ljava/util/List;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    check-cast v2, Ljava/lang/Iterable;

    .line 36
    .line 37
    invoke-static {v1, v2}, Lrc/b0;->B(Ljava/util/Collection;Ljava/lang/Iterable;)Z

    .line 38
    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_0
    invoke-static {v1}, Lrc/g0;->c1(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    check-cast v0, Ljava/lang/Iterable;

    .line 46
    .line 47
    invoke-static {v0}, Lrc/g0;->X0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    const/4 v2, 0x0

    .line 56
    move v3, v2

    .line 57
    :goto_1
    if-ge v3, v1, :cond_1

    .line 58
    .line 59
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v4

    .line 63
    check-cast v4, Landroidx/fragment/app/SpecialEffectsController$Effect;

    .line 64
    .line 65
    iget-object v5, p0, Landroidx/fragment/app/SpecialEffectsController;->container:Landroid/view/ViewGroup;

    .line 66
    .line 67
    invoke-virtual {v4, v5}, Landroidx/fragment/app/SpecialEffectsController$Effect;->onCommit(Landroid/view/ViewGroup;)V

    .line 68
    .line 69
    .line 70
    add-int/lit8 v3, v3, 0x1

    .line 71
    .line 72
    goto :goto_1

    .line 73
    :cond_1
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 74
    .line 75
    .line 76
    move-result v0

    .line 77
    move v1, v2

    .line 78
    :goto_2
    if-ge v1, v0, :cond_2

    .line 79
    .line 80
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v3

    .line 84
    check-cast v3, Landroidx/fragment/app/SpecialEffectsController$Operation;

    .line 85
    .line 86
    invoke-virtual {p0, v3}, Landroidx/fragment/app/SpecialEffectsController;->applyContainerChangesToOperation$fragment_release(Landroidx/fragment/app/SpecialEffectsController$Operation;)V

    .line 87
    .line 88
    .line 89
    add-int/lit8 v1, v1, 0x1

    .line 90
    .line 91
    goto :goto_2

    .line 92
    :cond_2
    check-cast p1, Ljava/lang/Iterable;

    .line 93
    .line 94
    invoke-static {p1}, Lrc/g0;->X0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 99
    .line 100
    .line 101
    move-result v0

    .line 102
    :goto_3
    if-ge v2, v0, :cond_4

    .line 103
    .line 104
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v1

    .line 108
    check-cast v1, Landroidx/fragment/app/SpecialEffectsController$Operation;

    .line 109
    .line 110
    invoke-virtual {v1}, Landroidx/fragment/app/SpecialEffectsController$Operation;->getEffects$fragment_release()Ljava/util/List;

    .line 111
    .line 112
    .line 113
    move-result-object v3

    .line 114
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    .line 115
    .line 116
    .line 117
    move-result v3

    .line 118
    if-eqz v3, :cond_3

    .line 119
    .line 120
    invoke-virtual {v1}, Landroidx/fragment/app/SpecialEffectsController$Operation;->complete$fragment_release()V

    .line 121
    .line 122
    .line 123
    :cond_3
    add-int/lit8 v2, v2, 0x1

    .line 124
    .line 125
    goto :goto_3

    .line 126
    :cond_4
    return-void
.end method

.method public final completeBack()V
    .locals 1

    .line 1
    const/4 v0, 0x3

    .line 2
    invoke-static {v0}, Landroidx/fragment/app/FragmentManager;->isLoggingEnabled(I)Z

    .line 3
    .line 4
    .line 5
    iget-object v0, p0, Landroidx/fragment/app/SpecialEffectsController;->runningOperations:Ljava/util/List;

    .line 6
    .line 7
    invoke-direct {p0, v0}, Landroidx/fragment/app/SpecialEffectsController;->processStart(Ljava/util/List;)V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Landroidx/fragment/app/SpecialEffectsController;->runningOperations:Ljava/util/List;

    .line 11
    .line 12
    invoke-virtual {p0, v0}, Landroidx/fragment/app/SpecialEffectsController;->commitEffects$fragment_release(Ljava/util/List;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final enqueueAdd(Landroidx/fragment/app/SpecialEffectsController$Operation$State;Landroidx/fragment/app/FragmentStateManager;)V
    .locals 1

    .line 1
    const-string v0, "finalState"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "fragmentStateManager"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x2

    .line 12
    invoke-static {v0}, Landroidx/fragment/app/FragmentManager;->isLoggingEnabled(I)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    invoke-virtual {p2}, Landroidx/fragment/app/FragmentStateManager;->getFragment()Landroidx/fragment/app/Fragment;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-static {v0}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    :cond_0
    sget-object v0, Landroidx/fragment/app/SpecialEffectsController$Operation$LifecycleImpact;->ADDING:Landroidx/fragment/app/SpecialEffectsController$Operation$LifecycleImpact;

    .line 26
    .line 27
    invoke-direct {p0, p1, v0, p2}, Landroidx/fragment/app/SpecialEffectsController;->enqueue(Landroidx/fragment/app/SpecialEffectsController$Operation$State;Landroidx/fragment/app/SpecialEffectsController$Operation$LifecycleImpact;Landroidx/fragment/app/FragmentStateManager;)V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public final enqueueHide(Landroidx/fragment/app/FragmentStateManager;)V
    .locals 2

    .line 1
    const-string v0, "fragmentStateManager"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x2

    .line 7
    invoke-static {v0}, Landroidx/fragment/app/FragmentManager;->isLoggingEnabled(I)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-virtual {p1}, Landroidx/fragment/app/FragmentStateManager;->getFragment()Landroidx/fragment/app/Fragment;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-static {v0}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    :cond_0
    sget-object v0, Landroidx/fragment/app/SpecialEffectsController$Operation$State;->GONE:Landroidx/fragment/app/SpecialEffectsController$Operation$State;

    .line 21
    .line 22
    sget-object v1, Landroidx/fragment/app/SpecialEffectsController$Operation$LifecycleImpact;->NONE:Landroidx/fragment/app/SpecialEffectsController$Operation$LifecycleImpact;

    .line 23
    .line 24
    invoke-direct {p0, v0, v1, p1}, Landroidx/fragment/app/SpecialEffectsController;->enqueue(Landroidx/fragment/app/SpecialEffectsController$Operation$State;Landroidx/fragment/app/SpecialEffectsController$Operation$LifecycleImpact;Landroidx/fragment/app/FragmentStateManager;)V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public final enqueueRemove(Landroidx/fragment/app/FragmentStateManager;)V
    .locals 2

    .line 1
    const-string v0, "fragmentStateManager"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x2

    .line 7
    invoke-static {v0}, Landroidx/fragment/app/FragmentManager;->isLoggingEnabled(I)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-virtual {p1}, Landroidx/fragment/app/FragmentStateManager;->getFragment()Landroidx/fragment/app/Fragment;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-static {v0}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    :cond_0
    sget-object v0, Landroidx/fragment/app/SpecialEffectsController$Operation$State;->REMOVED:Landroidx/fragment/app/SpecialEffectsController$Operation$State;

    .line 21
    .line 22
    sget-object v1, Landroidx/fragment/app/SpecialEffectsController$Operation$LifecycleImpact;->REMOVING:Landroidx/fragment/app/SpecialEffectsController$Operation$LifecycleImpact;

    .line 23
    .line 24
    invoke-direct {p0, v0, v1, p1}, Landroidx/fragment/app/SpecialEffectsController;->enqueue(Landroidx/fragment/app/SpecialEffectsController$Operation$State;Landroidx/fragment/app/SpecialEffectsController$Operation$LifecycleImpact;Landroidx/fragment/app/FragmentStateManager;)V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public final enqueueShow(Landroidx/fragment/app/FragmentStateManager;)V
    .locals 2

    .line 1
    const-string v0, "fragmentStateManager"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x2

    .line 7
    invoke-static {v0}, Landroidx/fragment/app/FragmentManager;->isLoggingEnabled(I)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-virtual {p1}, Landroidx/fragment/app/FragmentStateManager;->getFragment()Landroidx/fragment/app/Fragment;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-static {v0}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    :cond_0
    sget-object v0, Landroidx/fragment/app/SpecialEffectsController$Operation$State;->VISIBLE:Landroidx/fragment/app/SpecialEffectsController$Operation$State;

    .line 21
    .line 22
    sget-object v1, Landroidx/fragment/app/SpecialEffectsController$Operation$LifecycleImpact;->NONE:Landroidx/fragment/app/SpecialEffectsController$Operation$LifecycleImpact;

    .line 23
    .line 24
    invoke-direct {p0, v0, v1, p1}, Landroidx/fragment/app/SpecialEffectsController;->enqueue(Landroidx/fragment/app/SpecialEffectsController$Operation$State;Landroidx/fragment/app/SpecialEffectsController$Operation$LifecycleImpact;Landroidx/fragment/app/FragmentStateManager;)V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public final executePendingOperations()V
    .locals 7

    .line 1
    iget-boolean v0, p0, Landroidx/fragment/app/SpecialEffectsController;->isContainerPostponed:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-object v0, p0, Landroidx/fragment/app/SpecialEffectsController;->container:Landroid/view/ViewGroup;

    .line 7
    .line 8
    invoke-virtual {v0}, Landroid/view/View;->isAttachedToWindow()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    const/4 v1, 0x0

    .line 13
    if-nez v0, :cond_1

    .line 14
    .line 15
    invoke-virtual {p0}, Landroidx/fragment/app/SpecialEffectsController;->forceCompleteAllOperations()V

    .line 16
    .line 17
    .line 18
    iput-boolean v1, p0, Landroidx/fragment/app/SpecialEffectsController;->operationDirectionIsPop:Z

    .line 19
    .line 20
    return-void

    .line 21
    :cond_1
    iget-object v0, p0, Landroidx/fragment/app/SpecialEffectsController;->pendingOperations:Ljava/util/List;

    .line 22
    .line 23
    monitor-enter v0

    .line 24
    :try_start_0
    iget-object v2, p0, Landroidx/fragment/app/SpecialEffectsController;->runningOperations:Ljava/util/List;

    .line 25
    .line 26
    check-cast v2, Ljava/util/Collection;

    .line 27
    .line 28
    invoke-static {v2}, Lrc/g0;->a1(Ljava/util/Collection;)Ljava/util/List;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    iget-object v3, p0, Landroidx/fragment/app/SpecialEffectsController;->runningOperations:Ljava/util/List;

    .line 33
    .line 34
    invoke-interface {v3}, Ljava/util/List;->clear()V

    .line 35
    .line 36
    .line 37
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 42
    .line 43
    .line 44
    move-result v4

    .line 45
    const/4 v5, 0x1

    .line 46
    if-eqz v4, :cond_3

    .line 47
    .line 48
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v4

    .line 52
    check-cast v4, Landroidx/fragment/app/SpecialEffectsController$Operation;

    .line 53
    .line 54
    iget-object v6, p0, Landroidx/fragment/app/SpecialEffectsController;->pendingOperations:Ljava/util/List;

    .line 55
    .line 56
    check-cast v6, Ljava/util/Collection;

    .line 57
    .line 58
    invoke-interface {v6}, Ljava/util/Collection;->isEmpty()Z

    .line 59
    .line 60
    .line 61
    move-result v6

    .line 62
    if-nez v6, :cond_2

    .line 63
    .line 64
    invoke-virtual {v4}, Landroidx/fragment/app/SpecialEffectsController$Operation;->getFragment()Landroidx/fragment/app/Fragment;

    .line 65
    .line 66
    .line 67
    move-result-object v6

    .line 68
    iget-boolean v6, v6, Landroidx/fragment/app/Fragment;->mTransitioning:Z

    .line 69
    .line 70
    if-eqz v6, :cond_2

    .line 71
    .line 72
    goto :goto_1

    .line 73
    :catchall_0
    move-exception v1

    .line 74
    goto/16 :goto_7

    .line 75
    .line 76
    :cond_2
    move v5, v1

    .line 77
    :goto_1
    invoke-virtual {v4, v5}, Landroidx/fragment/app/SpecialEffectsController$Operation;->setSeeking$fragment_release(Z)V

    .line 78
    .line 79
    .line 80
    goto :goto_0

    .line 81
    :cond_3
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 82
    .line 83
    .line 84
    move-result-object v2

    .line 85
    :cond_4
    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 86
    .line 87
    .line 88
    move-result v3

    .line 89
    const/4 v4, 0x2

    .line 90
    if-eqz v3, :cond_8

    .line 91
    .line 92
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v3

    .line 96
    check-cast v3, Landroidx/fragment/app/SpecialEffectsController$Operation;

    .line 97
    .line 98
    iget-boolean v6, p0, Landroidx/fragment/app/SpecialEffectsController;->runningNonSeekableTransition:Z

    .line 99
    .line 100
    if-eqz v6, :cond_6

    .line 101
    .line 102
    invoke-static {v4}, Landroidx/fragment/app/FragmentManager;->isLoggingEnabled(I)Z

    .line 103
    .line 104
    .line 105
    move-result v4

    .line 106
    if-eqz v4, :cond_5

    .line 107
    .line 108
    invoke-static {v3}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    :cond_5
    invoke-virtual {v3}, Landroidx/fragment/app/SpecialEffectsController$Operation;->complete$fragment_release()V

    .line 112
    .line 113
    .line 114
    goto :goto_3

    .line 115
    :cond_6
    invoke-static {v4}, Landroidx/fragment/app/FragmentManager;->isLoggingEnabled(I)Z

    .line 116
    .line 117
    .line 118
    move-result v4

    .line 119
    if-eqz v4, :cond_7

    .line 120
    .line 121
    invoke-static {v3}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    :cond_7
    iget-object v4, p0, Landroidx/fragment/app/SpecialEffectsController;->container:Landroid/view/ViewGroup;

    .line 125
    .line 126
    invoke-virtual {v3, v4}, Landroidx/fragment/app/SpecialEffectsController$Operation;->cancel(Landroid/view/ViewGroup;)V

    .line 127
    .line 128
    .line 129
    :goto_3
    iput-boolean v1, p0, Landroidx/fragment/app/SpecialEffectsController;->runningNonSeekableTransition:Z

    .line 130
    .line 131
    invoke-virtual {v3}, Landroidx/fragment/app/SpecialEffectsController$Operation;->isComplete()Z

    .line 132
    .line 133
    .line 134
    move-result v4

    .line 135
    if-nez v4, :cond_4

    .line 136
    .line 137
    iget-object v4, p0, Landroidx/fragment/app/SpecialEffectsController;->runningOperations:Ljava/util/List;

    .line 138
    .line 139
    invoke-interface {v4, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 140
    .line 141
    .line 142
    goto :goto_2

    .line 143
    :cond_8
    iget-object v2, p0, Landroidx/fragment/app/SpecialEffectsController;->pendingOperations:Ljava/util/List;

    .line 144
    .line 145
    check-cast v2, Ljava/util/Collection;

    .line 146
    .line 147
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    .line 148
    .line 149
    .line 150
    move-result v2

    .line 151
    if-nez v2, :cond_d

    .line 152
    .line 153
    invoke-direct {p0}, Landroidx/fragment/app/SpecialEffectsController;->updateFinalState()V

    .line 154
    .line 155
    .line 156
    iget-object v2, p0, Landroidx/fragment/app/SpecialEffectsController;->pendingOperations:Ljava/util/List;

    .line 157
    .line 158
    check-cast v2, Ljava/util/Collection;

    .line 159
    .line 160
    invoke-static {v2}, Lrc/g0;->a1(Ljava/util/Collection;)Ljava/util/List;

    .line 161
    .line 162
    .line 163
    move-result-object v2

    .line 164
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    .line 165
    .line 166
    .line 167
    move-result v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 168
    if-eqz v3, :cond_9

    .line 169
    .line 170
    monitor-exit v0

    .line 171
    return-void

    .line 172
    :cond_9
    :try_start_1
    iget-object v3, p0, Landroidx/fragment/app/SpecialEffectsController;->pendingOperations:Ljava/util/List;

    .line 173
    .line 174
    invoke-interface {v3}, Ljava/util/List;->clear()V

    .line 175
    .line 176
    .line 177
    iget-object v3, p0, Landroidx/fragment/app/SpecialEffectsController;->runningOperations:Ljava/util/List;

    .line 178
    .line 179
    move-object v6, v2

    .line 180
    check-cast v6, Ljava/util/Collection;

    .line 181
    .line 182
    invoke-interface {v3, v6}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 183
    .line 184
    .line 185
    invoke-static {v4}, Landroidx/fragment/app/FragmentManager;->isLoggingEnabled(I)Z

    .line 186
    .line 187
    .line 188
    iget-boolean v3, p0, Landroidx/fragment/app/SpecialEffectsController;->operationDirectionIsPop:Z

    .line 189
    .line 190
    invoke-virtual {p0, v2, v3}, Landroidx/fragment/app/SpecialEffectsController;->collectEffects(Ljava/util/List;Z)V

    .line 191
    .line 192
    .line 193
    invoke-direct {p0, v2}, Landroidx/fragment/app/SpecialEffectsController;->isOperationSeekable(Ljava/util/List;)Z

    .line 194
    .line 195
    .line 196
    move-result v3

    .line 197
    invoke-direct {p0, v2}, Landroidx/fragment/app/SpecialEffectsController;->isOperationTransitioning(Ljava/util/List;)Z

    .line 198
    .line 199
    .line 200
    move-result v6

    .line 201
    if-eqz v6, :cond_a

    .line 202
    .line 203
    if-nez v3, :cond_a

    .line 204
    .line 205
    goto :goto_4

    .line 206
    :cond_a
    move v5, v1

    .line 207
    :goto_4
    iput-boolean v5, p0, Landroidx/fragment/app/SpecialEffectsController;->runningNonSeekableTransition:Z

    .line 208
    .line 209
    invoke-static {v4}, Landroidx/fragment/app/FragmentManager;->isLoggingEnabled(I)Z

    .line 210
    .line 211
    .line 212
    if-nez v6, :cond_b

    .line 213
    .line 214
    invoke-direct {p0, v2}, Landroidx/fragment/app/SpecialEffectsController;->processStart(Ljava/util/List;)V

    .line 215
    .line 216
    .line 217
    invoke-virtual {p0, v2}, Landroidx/fragment/app/SpecialEffectsController;->commitEffects$fragment_release(Ljava/util/List;)V

    .line 218
    .line 219
    .line 220
    goto :goto_6

    .line 221
    :cond_b
    if-eqz v3, :cond_c

    .line 222
    .line 223
    invoke-direct {p0, v2}, Landroidx/fragment/app/SpecialEffectsController;->processStart(Ljava/util/List;)V

    .line 224
    .line 225
    .line 226
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 227
    .line 228
    .line 229
    move-result v3

    .line 230
    move v5, v1

    .line 231
    :goto_5
    if-ge v5, v3, :cond_c

    .line 232
    .line 233
    invoke-interface {v2, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 234
    .line 235
    .line 236
    move-result-object v6

    .line 237
    check-cast v6, Landroidx/fragment/app/SpecialEffectsController$Operation;

    .line 238
    .line 239
    invoke-virtual {p0, v6}, Landroidx/fragment/app/SpecialEffectsController;->applyContainerChangesToOperation$fragment_release(Landroidx/fragment/app/SpecialEffectsController$Operation;)V

    .line 240
    .line 241
    .line 242
    add-int/lit8 v5, v5, 0x1

    .line 243
    .line 244
    goto :goto_5

    .line 245
    :cond_c
    :goto_6
    iput-boolean v1, p0, Landroidx/fragment/app/SpecialEffectsController;->operationDirectionIsPop:Z

    .line 246
    .line 247
    invoke-static {v4}, Landroidx/fragment/app/FragmentManager;->isLoggingEnabled(I)Z

    .line 248
    .line 249
    .line 250
    :cond_d
    sget-object v1, Lqc/q;->a:Lqc/q;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 251
    .line 252
    monitor-exit v0

    .line 253
    return-void

    .line 254
    :goto_7
    monitor-exit v0

    .line 255
    throw v1
.end method

.method public final forceCompleteAllOperations()V
    .locals 8

    .line 1
    const/4 v0, 0x2

    .line 2
    invoke-static {v0}, Landroidx/fragment/app/FragmentManager;->isLoggingEnabled(I)Z

    .line 3
    .line 4
    .line 5
    iget-object v1, p0, Landroidx/fragment/app/SpecialEffectsController;->container:Landroid/view/ViewGroup;

    .line 6
    .line 7
    invoke-virtual {v1}, Landroid/view/View;->isAttachedToWindow()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    iget-object v2, p0, Landroidx/fragment/app/SpecialEffectsController;->pendingOperations:Ljava/util/List;

    .line 12
    .line 13
    monitor-enter v2

    .line 14
    :try_start_0
    invoke-direct {p0}, Landroidx/fragment/app/SpecialEffectsController;->updateFinalState()V

    .line 15
    .line 16
    .line 17
    iget-object v3, p0, Landroidx/fragment/app/SpecialEffectsController;->pendingOperations:Ljava/util/List;

    .line 18
    .line 19
    invoke-direct {p0, v3}, Landroidx/fragment/app/SpecialEffectsController;->processStart(Ljava/util/List;)V

    .line 20
    .line 21
    .line 22
    iget-object v3, p0, Landroidx/fragment/app/SpecialEffectsController;->runningOperations:Ljava/util/List;

    .line 23
    .line 24
    check-cast v3, Ljava/util/Collection;

    .line 25
    .line 26
    invoke-static {v3}, Lrc/g0;->a1(Ljava/util/Collection;)Ljava/util/List;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 31
    .line 32
    .line 33
    move-result-object v4

    .line 34
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 35
    .line 36
    .line 37
    move-result v5

    .line 38
    const/4 v6, 0x0

    .line 39
    if-eqz v5, :cond_0

    .line 40
    .line 41
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v5

    .line 45
    check-cast v5, Landroidx/fragment/app/SpecialEffectsController$Operation;

    .line 46
    .line 47
    invoke-virtual {v5, v6}, Landroidx/fragment/app/SpecialEffectsController$Operation;->setSeeking$fragment_release(Z)V

    .line 48
    .line 49
    .line 50
    goto :goto_0

    .line 51
    :catchall_0
    move-exception v0

    .line 52
    goto/16 :goto_6

    .line 53
    .line 54
    :cond_0
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 55
    .line 56
    .line 57
    move-result-object v3

    .line 58
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 59
    .line 60
    .line 61
    move-result v4

    .line 62
    if-eqz v4, :cond_3

    .line 63
    .line 64
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v4

    .line 68
    check-cast v4, Landroidx/fragment/app/SpecialEffectsController$Operation;

    .line 69
    .line 70
    invoke-static {v0}, Landroidx/fragment/app/FragmentManager;->isLoggingEnabled(I)Z

    .line 71
    .line 72
    .line 73
    move-result v5

    .line 74
    if-eqz v5, :cond_2

    .line 75
    .line 76
    if-eqz v1, :cond_1

    .line 77
    .line 78
    goto :goto_2

    .line 79
    :cond_1
    new-instance v5, Ljava/lang/StringBuilder;

    .line 80
    .line 81
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 82
    .line 83
    .line 84
    const-string v7, "Container "

    .line 85
    .line 86
    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    iget-object v7, p0, Landroidx/fragment/app/SpecialEffectsController;->container:Landroid/view/ViewGroup;

    .line 90
    .line 91
    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    const-string v7, " is not attached to window. "

    .line 95
    .line 96
    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 97
    .line 98
    .line 99
    :goto_2
    invoke-static {v4}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    :cond_2
    iget-object v5, p0, Landroidx/fragment/app/SpecialEffectsController;->container:Landroid/view/ViewGroup;

    .line 103
    .line 104
    invoke-virtual {v4, v5}, Landroidx/fragment/app/SpecialEffectsController$Operation;->cancel(Landroid/view/ViewGroup;)V

    .line 105
    .line 106
    .line 107
    goto :goto_1

    .line 108
    :cond_3
    iget-object v3, p0, Landroidx/fragment/app/SpecialEffectsController;->pendingOperations:Ljava/util/List;

    .line 109
    .line 110
    check-cast v3, Ljava/util/Collection;

    .line 111
    .line 112
    invoke-static {v3}, Lrc/g0;->a1(Ljava/util/Collection;)Ljava/util/List;

    .line 113
    .line 114
    .line 115
    move-result-object v3

    .line 116
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 117
    .line 118
    .line 119
    move-result-object v4

    .line 120
    :goto_3
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 121
    .line 122
    .line 123
    move-result v5

    .line 124
    if-eqz v5, :cond_4

    .line 125
    .line 126
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object v5

    .line 130
    check-cast v5, Landroidx/fragment/app/SpecialEffectsController$Operation;

    .line 131
    .line 132
    invoke-virtual {v5, v6}, Landroidx/fragment/app/SpecialEffectsController$Operation;->setSeeking$fragment_release(Z)V

    .line 133
    .line 134
    .line 135
    goto :goto_3

    .line 136
    :cond_4
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 137
    .line 138
    .line 139
    move-result-object v3

    .line 140
    :goto_4
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 141
    .line 142
    .line 143
    move-result v4

    .line 144
    if-eqz v4, :cond_7

    .line 145
    .line 146
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object v4

    .line 150
    check-cast v4, Landroidx/fragment/app/SpecialEffectsController$Operation;

    .line 151
    .line 152
    invoke-static {v0}, Landroidx/fragment/app/FragmentManager;->isLoggingEnabled(I)Z

    .line 153
    .line 154
    .line 155
    move-result v5

    .line 156
    if-eqz v5, :cond_6

    .line 157
    .line 158
    if-eqz v1, :cond_5

    .line 159
    .line 160
    goto :goto_5

    .line 161
    :cond_5
    new-instance v5, Ljava/lang/StringBuilder;

    .line 162
    .line 163
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 164
    .line 165
    .line 166
    const-string v6, "Container "

    .line 167
    .line 168
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 169
    .line 170
    .line 171
    iget-object v6, p0, Landroidx/fragment/app/SpecialEffectsController;->container:Landroid/view/ViewGroup;

    .line 172
    .line 173
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 174
    .line 175
    .line 176
    const-string v6, " is not attached to window. "

    .line 177
    .line 178
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 179
    .line 180
    .line 181
    :goto_5
    invoke-static {v4}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 182
    .line 183
    .line 184
    :cond_6
    iget-object v5, p0, Landroidx/fragment/app/SpecialEffectsController;->container:Landroid/view/ViewGroup;

    .line 185
    .line 186
    invoke-virtual {v4, v5}, Landroidx/fragment/app/SpecialEffectsController$Operation;->cancel(Landroid/view/ViewGroup;)V

    .line 187
    .line 188
    .line 189
    goto :goto_4

    .line 190
    :cond_7
    sget-object v0, Lqc/q;->a:Lqc/q;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 191
    .line 192
    monitor-exit v2

    .line 193
    return-void

    .line 194
    :goto_6
    monitor-exit v2

    .line 195
    throw v0
.end method

.method public final forcePostponedExecutePendingOperations()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Landroidx/fragment/app/SpecialEffectsController;->isContainerPostponed:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x2

    .line 6
    invoke-static {v0}, Landroidx/fragment/app/FragmentManager;->isLoggingEnabled(I)Z

    .line 7
    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    iput-boolean v0, p0, Landroidx/fragment/app/SpecialEffectsController;->isContainerPostponed:Z

    .line 11
    .line 12
    invoke-virtual {p0}, Landroidx/fragment/app/SpecialEffectsController;->executePendingOperations()V

    .line 13
    .line 14
    .line 15
    :cond_0
    return-void
.end method

.method public final getAwaitingCompletionLifecycleImpact(Landroidx/fragment/app/FragmentStateManager;)Landroidx/fragment/app/SpecialEffectsController$Operation$LifecycleImpact;
    .locals 4

    .line 1
    const-string v0, "fragmentStateManager"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Landroidx/fragment/app/FragmentStateManager;->getFragment()Landroidx/fragment/app/Fragment;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    const-string v0, "fragmentStateManager.fragment"

    .line 11
    .line 12
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    invoke-direct {p0, p1}, Landroidx/fragment/app/SpecialEffectsController;->findPendingOperation(Landroidx/fragment/app/Fragment;)Landroidx/fragment/app/SpecialEffectsController$Operation;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    const/4 v1, 0x0

    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    invoke-virtual {v0}, Landroidx/fragment/app/SpecialEffectsController$Operation;->getLifecycleImpact()Landroidx/fragment/app/SpecialEffectsController$Operation$LifecycleImpact;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    move-object v0, v1

    .line 28
    :goto_0
    invoke-direct {p0, p1}, Landroidx/fragment/app/SpecialEffectsController;->findRunningOperation(Landroidx/fragment/app/Fragment;)Landroidx/fragment/app/SpecialEffectsController$Operation;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    if-eqz p1, :cond_1

    .line 33
    .line 34
    invoke-virtual {p1}, Landroidx/fragment/app/SpecialEffectsController$Operation;->getLifecycleImpact()Landroidx/fragment/app/SpecialEffectsController$Operation$LifecycleImpact;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    :cond_1
    const/4 p1, -0x1

    .line 39
    if-nez v0, :cond_2

    .line 40
    .line 41
    move v2, p1

    .line 42
    goto :goto_1

    .line 43
    :cond_2
    sget-object v2, Landroidx/fragment/app/SpecialEffectsController$WhenMappings;->$EnumSwitchMapping$0:[I

    .line 44
    .line 45
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 46
    .line 47
    .line 48
    move-result v3

    .line 49
    aget v2, v2, v3

    .line 50
    .line 51
    :goto_1
    if-eq v2, p1, :cond_3

    .line 52
    .line 53
    const/4 p1, 0x1

    .line 54
    if-eq v2, p1, :cond_3

    .line 55
    .line 56
    return-object v0

    .line 57
    :cond_3
    return-object v1
.end method

.method public final getContainer()Landroid/view/ViewGroup;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/SpecialEffectsController;->container:Landroid/view/ViewGroup;

    .line 2
    .line 3
    return-object v0
.end method

.method public final isPendingExecute()Z
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/SpecialEffectsController;->pendingOperations:Ljava/util/List;

    .line 2
    .line 3
    check-cast v0, Ljava/util/Collection;

    .line 4
    .line 5
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    xor-int/lit8 v0, v0, 0x1

    .line 10
    .line 11
    return v0
.end method

.method public final markPostponedState()V
    .locals 8

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/SpecialEffectsController;->pendingOperations:Ljava/util/List;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    invoke-direct {p0}, Landroidx/fragment/app/SpecialEffectsController;->updateFinalState()V

    .line 5
    .line 6
    .line 7
    iget-object v1, p0, Landroidx/fragment/app/SpecialEffectsController;->pendingOperations:Ljava/util/List;

    .line 8
    .line 9
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    invoke-interface {v1, v2}, Ljava/util/List;->listIterator(I)Ljava/util/ListIterator;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    :cond_0
    invoke-interface {v1}, Ljava/util/ListIterator;->hasPrevious()Z

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    const/4 v3, 0x0

    .line 22
    if-eqz v2, :cond_1

    .line 23
    .line 24
    invoke-interface {v1}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    move-object v4, v2

    .line 29
    check-cast v4, Landroidx/fragment/app/SpecialEffectsController$Operation;

    .line 30
    .line 31
    sget-object v5, Landroidx/fragment/app/SpecialEffectsController$Operation$State;->Companion:Landroidx/fragment/app/SpecialEffectsController$Operation$State$Companion;

    .line 32
    .line 33
    invoke-virtual {v4}, Landroidx/fragment/app/SpecialEffectsController$Operation;->getFragment()Landroidx/fragment/app/Fragment;

    .line 34
    .line 35
    .line 36
    move-result-object v6

    .line 37
    iget-object v6, v6, Landroidx/fragment/app/Fragment;->mView:Landroid/view/View;

    .line 38
    .line 39
    const-string/jumbo v7, "operation.fragment.mView"

    .line 40
    .line 41
    .line 42
    invoke-static {v6, v7}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v5, v6}, Landroidx/fragment/app/SpecialEffectsController$Operation$State$Companion;->asOperationState(Landroid/view/View;)Landroidx/fragment/app/SpecialEffectsController$Operation$State;

    .line 46
    .line 47
    .line 48
    move-result-object v5

    .line 49
    invoke-virtual {v4}, Landroidx/fragment/app/SpecialEffectsController$Operation;->getFinalState()Landroidx/fragment/app/SpecialEffectsController$Operation$State;

    .line 50
    .line 51
    .line 52
    move-result-object v4

    .line 53
    sget-object v6, Landroidx/fragment/app/SpecialEffectsController$Operation$State;->VISIBLE:Landroidx/fragment/app/SpecialEffectsController$Operation$State;

    .line 54
    .line 55
    if-ne v4, v6, :cond_0

    .line 56
    .line 57
    if-eq v5, v6, :cond_0

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :catchall_0
    move-exception v1

    .line 61
    goto :goto_2

    .line 62
    :cond_1
    move-object v2, v3

    .line 63
    :goto_0
    check-cast v2, Landroidx/fragment/app/SpecialEffectsController$Operation;

    .line 64
    .line 65
    if-eqz v2, :cond_2

    .line 66
    .line 67
    invoke-virtual {v2}, Landroidx/fragment/app/SpecialEffectsController$Operation;->getFragment()Landroidx/fragment/app/Fragment;

    .line 68
    .line 69
    .line 70
    move-result-object v3

    .line 71
    :cond_2
    if-eqz v3, :cond_3

    .line 72
    .line 73
    invoke-virtual {v3}, Landroidx/fragment/app/Fragment;->isPostponed()Z

    .line 74
    .line 75
    .line 76
    move-result v1

    .line 77
    goto :goto_1

    .line 78
    :cond_3
    const/4 v1, 0x0

    .line 79
    :goto_1
    iput-boolean v1, p0, Landroidx/fragment/app/SpecialEffectsController;->isContainerPostponed:Z

    .line 80
    .line 81
    sget-object v1, Lqc/q;->a:Lqc/q;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 82
    .line 83
    monitor-exit v0

    .line 84
    return-void

    .line 85
    :goto_2
    monitor-exit v0

    .line 86
    throw v1
.end method

.method public final processProgress(Landroidx/activity/BackEventCompat;)V
    .locals 5

    .line 1
    const-string v0, "backEvent"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x2

    .line 7
    invoke-static {v0}, Landroidx/fragment/app/FragmentManager;->isLoggingEnabled(I)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-virtual {p1}, Landroidx/activity/BackEventCompat;->getProgress()F

    .line 14
    .line 15
    .line 16
    :cond_0
    iget-object v0, p0, Landroidx/fragment/app/SpecialEffectsController;->runningOperations:Ljava/util/List;

    .line 17
    .line 18
    check-cast v0, Ljava/lang/Iterable;

    .line 19
    .line 20
    new-instance v1, Ljava/util/ArrayList;

    .line 21
    .line 22
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 23
    .line 24
    .line 25
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    if-eqz v2, :cond_1

    .line 34
    .line 35
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    check-cast v2, Landroidx/fragment/app/SpecialEffectsController$Operation;

    .line 40
    .line 41
    invoke-virtual {v2}, Landroidx/fragment/app/SpecialEffectsController$Operation;->getEffects$fragment_release()Ljava/util/List;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    check-cast v2, Ljava/lang/Iterable;

    .line 46
    .line 47
    invoke-static {v1, v2}, Lrc/b0;->B(Ljava/util/Collection;Ljava/lang/Iterable;)Z

    .line 48
    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_1
    invoke-static {v1}, Lrc/g0;->c1(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    check-cast v0, Ljava/lang/Iterable;

    .line 56
    .line 57
    invoke-static {v0}, Lrc/g0;->X0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 62
    .line 63
    .line 64
    move-result v1

    .line 65
    const/4 v2, 0x0

    .line 66
    :goto_1
    if-ge v2, v1, :cond_2

    .line 67
    .line 68
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v3

    .line 72
    check-cast v3, Landroidx/fragment/app/SpecialEffectsController$Effect;

    .line 73
    .line 74
    iget-object v4, p0, Landroidx/fragment/app/SpecialEffectsController;->container:Landroid/view/ViewGroup;

    .line 75
    .line 76
    invoke-virtual {v3, p1, v4}, Landroidx/fragment/app/SpecialEffectsController$Effect;->onProgress(Landroidx/activity/BackEventCompat;Landroid/view/ViewGroup;)V

    .line 77
    .line 78
    .line 79
    add-int/lit8 v2, v2, 0x1

    .line 80
    .line 81
    goto :goto_1

    .line 82
    :cond_2
    return-void
.end method

.method public final updateOperationDirection(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Landroidx/fragment/app/SpecialEffectsController;->operationDirectionIsPop:Z

    .line 2
    .line 3
    return-void
.end method
