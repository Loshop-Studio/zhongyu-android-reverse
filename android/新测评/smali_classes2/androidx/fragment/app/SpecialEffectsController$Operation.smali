.class public Landroidx/fragment/app/SpecialEffectsController$Operation;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/fragment/app/SpecialEffectsController;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Operation"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/fragment/app/SpecialEffectsController$Operation$LifecycleImpact;,
        Landroidx/fragment/app/SpecialEffectsController$Operation$State;,
        Landroidx/fragment/app/SpecialEffectsController$Operation$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0008\t\n\u0002\u0010\u000b\n\u0002\u0008\u000e\n\u0002\u0010\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u000e\n\u0002\u0008\u0003\u0008\u0010\u0018\u00002\u00020\u0001:\u000267B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\u0008J\u000e\u0010\'\u001a\u00020(2\u0006\u0010)\u001a\u00020\rJ\u000e\u0010*\u001a\u00020(2\u0006\u0010+\u001a\u00020\u000bJ\u000e\u0010,\u001a\u00020(2\u0006\u0010-\u001a\u00020.J\r\u0010/\u001a\u00020(H\u0011\u00a2\u0006\u0002\u00080J\u000e\u00101\u001a\u00020(2\u0006\u0010+\u001a\u00020\u000bJ\u0016\u00102\u001a\u00020(2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005J\u0008\u00103\u001a\u00020(H\u0017J\u0008\u00104\u001a\u000205H\u0016R\u0014\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\r0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\u000fX\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u0011R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0012\u0010\u0013\"\u0004\u0008\u0014\u0010\u0015R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u0019X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0018\u0010\u001a\"\u0004\u0008\u001b\u0010\u001cR\u001e\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u0019@BX\u0086\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001e\u0010\u001aR\u001e\u0010\u001f\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u0019@BX\u0086\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001f\u0010\u001aR$\u0010 \u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u0019@@X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008 \u0010\u001a\"\u0004\u0008!\u0010\u001cR\u001e\u0010\"\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u0019@BX\u0086\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\"\u0010\u001aR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008#\u0010$\"\u0004\u0008%\u0010&\u00a8\u00068"
    }
    d2 = {
        "Landroidx/fragment/app/SpecialEffectsController$Operation;",
        "",
        "finalState",
        "Landroidx/fragment/app/SpecialEffectsController$Operation$State;",
        "lifecycleImpact",
        "Landroidx/fragment/app/SpecialEffectsController$Operation$LifecycleImpact;",
        "fragment",
        "Landroidx/fragment/app/Fragment;",
        "(Landroidx/fragment/app/SpecialEffectsController$Operation$State;Landroidx/fragment/app/SpecialEffectsController$Operation$LifecycleImpact;Landroidx/fragment/app/Fragment;)V",
        "_effects",
        "",
        "Landroidx/fragment/app/SpecialEffectsController$Effect;",
        "completionListeners",
        "Ljava/lang/Runnable;",
        "effects",
        "",
        "getEffects$fragment_release",
        "()Ljava/util/List;",
        "getFinalState",
        "()Landroidx/fragment/app/SpecialEffectsController$Operation$State;",
        "setFinalState",
        "(Landroidx/fragment/app/SpecialEffectsController$Operation$State;)V",
        "getFragment",
        "()Landroidx/fragment/app/Fragment;",
        "isAwaitingContainerChanges",
        "",
        "()Z",
        "setAwaitingContainerChanges",
        "(Z)V",
        "<set-?>",
        "isCanceled",
        "isComplete",
        "isSeeking",
        "setSeeking$fragment_release",
        "isStarted",
        "getLifecycleImpact",
        "()Landroidx/fragment/app/SpecialEffectsController$Operation$LifecycleImpact;",
        "setLifecycleImpact",
        "(Landroidx/fragment/app/SpecialEffectsController$Operation$LifecycleImpact;)V",
        "addCompletionListener",
        "",
        "listener",
        "addEffect",
        "effect",
        "cancel",
        "container",
        "Landroid/view/ViewGroup;",
        "complete",
        "complete$fragment_release",
        "completeEffect",
        "mergeWith",
        "onStart",
        "toString",
        "",
        "LifecycleImpact",
        "State",
        "fragment_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nSpecialEffectsController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpecialEffectsController.kt\nandroidx/fragment/app/SpecialEffectsController$Operation\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,923:1\n1855#2,2:924\n1855#2,2:926\n*S KotlinDebug\n*F\n+ 1 SpecialEffectsController.kt\nandroidx/fragment/app/SpecialEffectsController$Operation\n*L\n679#1:924,2\n769#1:926,2\n*E\n"
    }
.end annotation


# instance fields
.field private final _effects:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroidx/fragment/app/SpecialEffectsController$Effect;",
            ">;"
        }
    .end annotation
.end field

.field private final completionListeners:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Runnable;",
            ">;"
        }
    .end annotation
.end field

.field private final effects:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroidx/fragment/app/SpecialEffectsController$Effect;",
            ">;"
        }
    .end annotation
.end field

.field private finalState:Landroidx/fragment/app/SpecialEffectsController$Operation$State;

.field private final fragment:Landroidx/fragment/app/Fragment;

.field private isAwaitingContainerChanges:Z

.field private isCanceled:Z

.field private isComplete:Z

.field private isSeeking:Z

.field private isStarted:Z

.field private lifecycleImpact:Landroidx/fragment/app/SpecialEffectsController$Operation$LifecycleImpact;


# direct methods
.method public constructor <init>(Landroidx/fragment/app/SpecialEffectsController$Operation$State;Landroidx/fragment/app/SpecialEffectsController$Operation$LifecycleImpact;Landroidx/fragment/app/Fragment;)V
    .locals 1

    .line 1
    const-string v0, "finalState"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string/jumbo v0, "lifecycleImpact"

    .line 7
    .line 8
    .line 9
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    const-string v0, "fragment"

    .line 13
    .line 14
    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    .line 19
    .line 20
    iput-object p1, p0, Landroidx/fragment/app/SpecialEffectsController$Operation;->finalState:Landroidx/fragment/app/SpecialEffectsController$Operation$State;

    .line 21
    .line 22
    iput-object p2, p0, Landroidx/fragment/app/SpecialEffectsController$Operation;->lifecycleImpact:Landroidx/fragment/app/SpecialEffectsController$Operation$LifecycleImpact;

    .line 23
    .line 24
    iput-object p3, p0, Landroidx/fragment/app/SpecialEffectsController$Operation;->fragment:Landroidx/fragment/app/Fragment;

    .line 25
    .line 26
    new-instance p1, Ljava/util/ArrayList;

    .line 27
    .line 28
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 29
    .line 30
    .line 31
    iput-object p1, p0, Landroidx/fragment/app/SpecialEffectsController$Operation;->completionListeners:Ljava/util/List;

    .line 32
    .line 33
    const/4 p1, 0x1

    .line 34
    iput-boolean p1, p0, Landroidx/fragment/app/SpecialEffectsController$Operation;->isAwaitingContainerChanges:Z

    .line 35
    .line 36
    new-instance p1, Ljava/util/ArrayList;

    .line 37
    .line 38
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 39
    .line 40
    .line 41
    iput-object p1, p0, Landroidx/fragment/app/SpecialEffectsController$Operation;->_effects:Ljava/util/List;

    .line 42
    .line 43
    iput-object p1, p0, Landroidx/fragment/app/SpecialEffectsController$Operation;->effects:Ljava/util/List;

    .line 44
    .line 45
    return-void
.end method


# virtual methods
.method public final addCompletionListener(Ljava/lang/Runnable;)V
    .locals 1

    .line 1
    const-string/jumbo v0, "listener"

    .line 2
    .line 3
    .line 4
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Landroidx/fragment/app/SpecialEffectsController$Operation;->completionListeners:Ljava/util/List;

    .line 8
    .line 9
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final addEffect(Landroidx/fragment/app/SpecialEffectsController$Effect;)V
    .locals 1

    .line 1
    const-string v0, "effect"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Landroidx/fragment/app/SpecialEffectsController$Operation;->_effects:Ljava/util/List;

    .line 7
    .line 8
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final cancel(Landroid/view/ViewGroup;)V
    .locals 2

    .line 1
    const-string v0, "container"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    iput-boolean v0, p0, Landroidx/fragment/app/SpecialEffectsController$Operation;->isStarted:Z

    .line 8
    .line 9
    iget-boolean v0, p0, Landroidx/fragment/app/SpecialEffectsController$Operation;->isCanceled:Z

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    goto :goto_1

    .line 14
    :cond_0
    const/4 v0, 0x1

    .line 15
    iput-boolean v0, p0, Landroidx/fragment/app/SpecialEffectsController$Operation;->isCanceled:Z

    .line 16
    .line 17
    iget-object v0, p0, Landroidx/fragment/app/SpecialEffectsController$Operation;->_effects:Ljava/util/List;

    .line 18
    .line 19
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    invoke-virtual {p0}, Landroidx/fragment/app/SpecialEffectsController$Operation;->complete$fragment_release()V

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :cond_1
    iget-object v0, p0, Landroidx/fragment/app/SpecialEffectsController$Operation;->effects:Ljava/util/List;

    .line 30
    .line 31
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->toList(Ljava/lang/Iterable;)Ljava/util/List;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    if-eqz v1, :cond_2

    .line 44
    .line 45
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    check-cast v1, Landroidx/fragment/app/SpecialEffectsController$Effect;

    .line 50
    .line 51
    invoke-virtual {v1, p1}, Landroidx/fragment/app/SpecialEffectsController$Effect;->cancel(Landroid/view/ViewGroup;)V

    .line 52
    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_2
    :goto_1
    return-void
.end method

.method public complete$fragment_release()V
    .locals 2
    .annotation build Landroidx/annotation/CallSuper;
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Landroidx/fragment/app/SpecialEffectsController$Operation;->isStarted:Z

    .line 3
    .line 4
    iget-boolean v0, p0, Landroidx/fragment/app/SpecialEffectsController$Operation;->isComplete:Z

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    goto :goto_1

    .line 9
    :cond_0
    const/4 v0, 0x2

    .line 10
    invoke-static {v0}, Landroidx/fragment/app/FragmentManager;->isLoggingEnabled(I)Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    :cond_1
    const/4 v0, 0x1

    .line 20
    iput-boolean v0, p0, Landroidx/fragment/app/SpecialEffectsController$Operation;->isComplete:Z

    .line 21
    .line 22
    iget-object v0, p0, Landroidx/fragment/app/SpecialEffectsController$Operation;->completionListeners:Ljava/util/List;

    .line 23
    .line 24
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-eqz v1, :cond_2

    .line 33
    .line 34
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    check-cast v1, Ljava/lang/Runnable;

    .line 39
    .line 40
    invoke-interface {v1}, Ljava/lang/Runnable;->run()V

    .line 41
    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_2
    :goto_1
    return-void
.end method

.method public final completeEffect(Landroidx/fragment/app/SpecialEffectsController$Effect;)V
    .locals 1

    .line 1
    const-string v0, "effect"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Landroidx/fragment/app/SpecialEffectsController$Operation;->_effects:Ljava/util/List;

    .line 7
    .line 8
    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    if-eqz p1, :cond_0

    .line 13
    .line 14
    iget-object p1, p0, Landroidx/fragment/app/SpecialEffectsController$Operation;->_effects:Ljava/util/List;

    .line 15
    .line 16
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    if-eqz p1, :cond_0

    .line 21
    .line 22
    invoke-virtual {p0}, Landroidx/fragment/app/SpecialEffectsController$Operation;->complete$fragment_release()V

    .line 23
    .line 24
    .line 25
    :cond_0
    return-void
.end method

.method public final getEffects$fragment_release()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Landroidx/fragment/app/SpecialEffectsController$Effect;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/SpecialEffectsController$Operation;->effects:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getFinalState()Landroidx/fragment/app/SpecialEffectsController$Operation$State;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/SpecialEffectsController$Operation;->finalState:Landroidx/fragment/app/SpecialEffectsController$Operation$State;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getFragment()Landroidx/fragment/app/Fragment;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/SpecialEffectsController$Operation;->fragment:Landroidx/fragment/app/Fragment;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getLifecycleImpact()Landroidx/fragment/app/SpecialEffectsController$Operation$LifecycleImpact;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/SpecialEffectsController$Operation;->lifecycleImpact:Landroidx/fragment/app/SpecialEffectsController$Operation$LifecycleImpact;

    .line 2
    .line 3
    return-object v0
.end method

.method public final isAwaitingContainerChanges()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Landroidx/fragment/app/SpecialEffectsController$Operation;->isAwaitingContainerChanges:Z

    .line 2
    .line 3
    return v0
.end method

.method public final isCanceled()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Landroidx/fragment/app/SpecialEffectsController$Operation;->isCanceled:Z

    .line 2
    .line 3
    return v0
.end method

.method public final isComplete()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Landroidx/fragment/app/SpecialEffectsController$Operation;->isComplete:Z

    .line 2
    .line 3
    return v0
.end method

.method public final isSeeking()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Landroidx/fragment/app/SpecialEffectsController$Operation;->isSeeking:Z

    .line 2
    .line 3
    return v0
.end method

.method public final isStarted()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Landroidx/fragment/app/SpecialEffectsController$Operation;->isStarted:Z

    .line 2
    .line 3
    return v0
.end method

.method public final mergeWith(Landroidx/fragment/app/SpecialEffectsController$Operation$State;Landroidx/fragment/app/SpecialEffectsController$Operation$LifecycleImpact;)V
    .locals 2

    .line 1
    const-string v0, "finalState"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string/jumbo v0, "lifecycleImpact"

    .line 7
    .line 8
    .line 9
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    sget-object v0, Landroidx/fragment/app/SpecialEffectsController$Operation$WhenMappings;->$EnumSwitchMapping$0:[I

    .line 13
    .line 14
    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    .line 15
    .line 16
    .line 17
    move-result p2

    .line 18
    aget p2, v0, p2

    .line 19
    .line 20
    const/4 v0, 0x2

    .line 21
    const/4 v1, 0x1

    .line 22
    if-eq p2, v1, :cond_4

    .line 23
    .line 24
    if-eq p2, v0, :cond_2

    .line 25
    .line 26
    const/4 v1, 0x3

    .line 27
    if-eq p2, v1, :cond_0

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    iget-object p2, p0, Landroidx/fragment/app/SpecialEffectsController$Operation;->finalState:Landroidx/fragment/app/SpecialEffectsController$Operation$State;

    .line 31
    .line 32
    sget-object v1, Landroidx/fragment/app/SpecialEffectsController$Operation$State;->REMOVED:Landroidx/fragment/app/SpecialEffectsController$Operation$State;

    .line 33
    .line 34
    if-eq p2, v1, :cond_6

    .line 35
    .line 36
    invoke-static {v0}, Landroidx/fragment/app/FragmentManager;->isLoggingEnabled(I)Z

    .line 37
    .line 38
    .line 39
    move-result p2

    .line 40
    if-eqz p2, :cond_1

    .line 41
    .line 42
    iget-object p2, p0, Landroidx/fragment/app/SpecialEffectsController$Operation;->fragment:Landroidx/fragment/app/Fragment;

    .line 43
    .line 44
    invoke-static {p2}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    iget-object p2, p0, Landroidx/fragment/app/SpecialEffectsController$Operation;->finalState:Landroidx/fragment/app/SpecialEffectsController$Operation$State;

    .line 48
    .line 49
    invoke-static {p2}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    invoke-static {p1}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    :cond_1
    iput-object p1, p0, Landroidx/fragment/app/SpecialEffectsController$Operation;->finalState:Landroidx/fragment/app/SpecialEffectsController$Operation$State;

    .line 56
    .line 57
    return-void

    .line 58
    :cond_2
    invoke-static {v0}, Landroidx/fragment/app/FragmentManager;->isLoggingEnabled(I)Z

    .line 59
    .line 60
    .line 61
    move-result p1

    .line 62
    if-eqz p1, :cond_3

    .line 63
    .line 64
    iget-object p1, p0, Landroidx/fragment/app/SpecialEffectsController$Operation;->fragment:Landroidx/fragment/app/Fragment;

    .line 65
    .line 66
    invoke-static {p1}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    iget-object p1, p0, Landroidx/fragment/app/SpecialEffectsController$Operation;->finalState:Landroidx/fragment/app/SpecialEffectsController$Operation$State;

    .line 70
    .line 71
    invoke-static {p1}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    iget-object p1, p0, Landroidx/fragment/app/SpecialEffectsController$Operation;->lifecycleImpact:Landroidx/fragment/app/SpecialEffectsController$Operation$LifecycleImpact;

    .line 75
    .line 76
    invoke-static {p1}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    :cond_3
    sget-object p1, Landroidx/fragment/app/SpecialEffectsController$Operation$State;->REMOVED:Landroidx/fragment/app/SpecialEffectsController$Operation$State;

    .line 80
    .line 81
    iput-object p1, p0, Landroidx/fragment/app/SpecialEffectsController$Operation;->finalState:Landroidx/fragment/app/SpecialEffectsController$Operation$State;

    .line 82
    .line 83
    sget-object p1, Landroidx/fragment/app/SpecialEffectsController$Operation$LifecycleImpact;->REMOVING:Landroidx/fragment/app/SpecialEffectsController$Operation$LifecycleImpact;

    .line 84
    .line 85
    iput-object p1, p0, Landroidx/fragment/app/SpecialEffectsController$Operation;->lifecycleImpact:Landroidx/fragment/app/SpecialEffectsController$Operation$LifecycleImpact;

    .line 86
    .line 87
    iput-boolean v1, p0, Landroidx/fragment/app/SpecialEffectsController$Operation;->isAwaitingContainerChanges:Z

    .line 88
    .line 89
    return-void

    .line 90
    :cond_4
    iget-object p1, p0, Landroidx/fragment/app/SpecialEffectsController$Operation;->finalState:Landroidx/fragment/app/SpecialEffectsController$Operation$State;

    .line 91
    .line 92
    sget-object p2, Landroidx/fragment/app/SpecialEffectsController$Operation$State;->REMOVED:Landroidx/fragment/app/SpecialEffectsController$Operation$State;

    .line 93
    .line 94
    if-ne p1, p2, :cond_6

    .line 95
    .line 96
    invoke-static {v0}, Landroidx/fragment/app/FragmentManager;->isLoggingEnabled(I)Z

    .line 97
    .line 98
    .line 99
    move-result p1

    .line 100
    if-eqz p1, :cond_5

    .line 101
    .line 102
    iget-object p1, p0, Landroidx/fragment/app/SpecialEffectsController$Operation;->fragment:Landroidx/fragment/app/Fragment;

    .line 103
    .line 104
    invoke-static {p1}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    iget-object p1, p0, Landroidx/fragment/app/SpecialEffectsController$Operation;->lifecycleImpact:Landroidx/fragment/app/SpecialEffectsController$Operation$LifecycleImpact;

    .line 108
    .line 109
    invoke-static {p1}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    :cond_5
    sget-object p1, Landroidx/fragment/app/SpecialEffectsController$Operation$State;->VISIBLE:Landroidx/fragment/app/SpecialEffectsController$Operation$State;

    .line 113
    .line 114
    iput-object p1, p0, Landroidx/fragment/app/SpecialEffectsController$Operation;->finalState:Landroidx/fragment/app/SpecialEffectsController$Operation$State;

    .line 115
    .line 116
    sget-object p1, Landroidx/fragment/app/SpecialEffectsController$Operation$LifecycleImpact;->ADDING:Landroidx/fragment/app/SpecialEffectsController$Operation$LifecycleImpact;

    .line 117
    .line 118
    iput-object p1, p0, Landroidx/fragment/app/SpecialEffectsController$Operation;->lifecycleImpact:Landroidx/fragment/app/SpecialEffectsController$Operation$LifecycleImpact;

    .line 119
    .line 120
    iput-boolean v1, p0, Landroidx/fragment/app/SpecialEffectsController$Operation;->isAwaitingContainerChanges:Z

    .line 121
    .line 122
    :cond_6
    :goto_0
    return-void
.end method

.method public onStart()V
    .locals 1
    .annotation build Landroidx/annotation/CallSuper;
    .end annotation

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Landroidx/fragment/app/SpecialEffectsController$Operation;->isStarted:Z

    .line 3
    .line 4
    return-void
.end method

.method public final setAwaitingContainerChanges(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Landroidx/fragment/app/SpecialEffectsController$Operation;->isAwaitingContainerChanges:Z

    .line 2
    .line 3
    return-void
.end method

.method public final setFinalState(Landroidx/fragment/app/SpecialEffectsController$Operation$State;)V
    .locals 1

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Landroidx/fragment/app/SpecialEffectsController$Operation;->finalState:Landroidx/fragment/app/SpecialEffectsController$Operation$State;

    .line 7
    .line 8
    return-void
.end method

.method public final setLifecycleImpact(Landroidx/fragment/app/SpecialEffectsController$Operation$LifecycleImpact;)V
    .locals 1

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Landroidx/fragment/app/SpecialEffectsController$Operation;->lifecycleImpact:Landroidx/fragment/app/SpecialEffectsController$Operation$LifecycleImpact;

    .line 7
    .line 8
    return-void
.end method

.method public final setSeeking$fragment_release(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Landroidx/fragment/app/SpecialEffectsController$Operation;->isSeeking:Z

    .line 2
    .line 3
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 1
    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    new-instance v1, Ljava/lang/StringBuilder;

    .line 10
    .line 11
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 12
    .line 13
    .line 14
    const-string v2, "Operation {"

    .line 15
    .line 16
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    const-string/jumbo v0, "} {finalState = "

    .line 23
    .line 24
    .line 25
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    iget-object v0, p0, Landroidx/fragment/app/SpecialEffectsController$Operation;->finalState:Landroidx/fragment/app/SpecialEffectsController$Operation$State;

    .line 29
    .line 30
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string v0, " lifecycleImpact = "

    .line 34
    .line 35
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    iget-object v0, p0, Landroidx/fragment/app/SpecialEffectsController$Operation;->lifecycleImpact:Landroidx/fragment/app/SpecialEffectsController$Operation$LifecycleImpact;

    .line 39
    .line 40
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    const-string v0, " fragment = "

    .line 44
    .line 45
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    iget-object v0, p0, Landroidx/fragment/app/SpecialEffectsController$Operation;->fragment:Landroidx/fragment/app/Fragment;

    .line 49
    .line 50
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    const/16 v0, 0x7d

    .line 54
    .line 55
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    return-object v0
.end method
