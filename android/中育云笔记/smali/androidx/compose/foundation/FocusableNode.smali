.class public final Landroidx/compose/foundation/FocusableNode;
.super Landroidx/compose/ui/node/DelegatingNode;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/ui/node/SemanticsModifierNode;
.implements Landroidx/compose/ui/node/GlobalPositionAwareModifierNode;
.implements Landroidx/compose/ui/node/CompositionLocalConsumerModifierNode;
.implements Landroidx/compose/ui/node/ObserverModifierNode;
.implements Landroidx/compose/ui/node/TraversableNode;


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/compose/foundation/FocusableNode$TraverseKey;
    }
.end annotation


# static fields
.field public static final $stable:I

.field private static final TraverseKey:Landroidx/compose/foundation/FocusableNode$TraverseKey;


# instance fields
.field private final focusTargetNode:Landroidx/compose/ui/focus/FocusTargetModifierNode;

.field private focusedInteraction:Landroidx/compose/foundation/interaction/FocusInteraction$Focus;

.field private globalLayoutCoordinates:Landroidx/compose/ui/layout/LayoutCoordinates;

.field private interactionSource:Landroidx/compose/foundation/interaction/MutableInteractionSource;

.field private final onFocusChange:Lhd/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhd/l;"
        }
    .end annotation
.end field

.field private pinnedHandle:Landroidx/compose/ui/layout/PinnableContainer$PinnedHandle;

.field private requestFocus:Lhd/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhd/a;"
        }
    .end annotation
.end field

.field private final shouldAutoInvalidate:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Landroidx/compose/foundation/FocusableNode$TraverseKey;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Landroidx/compose/foundation/FocusableNode$TraverseKey;-><init>(Lkotlin/jvm/internal/n;)V

    sput-object v0, Landroidx/compose/foundation/FocusableNode;->TraverseKey:Landroidx/compose/foundation/FocusableNode$TraverseKey;

    const/16 v0, 0x8

    sput v0, Landroidx/compose/foundation/FocusableNode;->$stable:I

    return-void
.end method

.method private constructor <init>(Landroidx/compose/foundation/interaction/MutableInteractionSource;ILhd/l;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/foundation/interaction/MutableInteractionSource;",
            "I",
            "Lhd/l;",
            ")V"
        }
    .end annotation

    .line 4
    invoke-direct {p0}, Landroidx/compose/ui/node/DelegatingNode;-><init>()V

    .line 5
    iput-object p1, p0, Landroidx/compose/foundation/FocusableNode;->interactionSource:Landroidx/compose/foundation/interaction/MutableInteractionSource;

    .line 6
    iput-object p3, p0, Landroidx/compose/foundation/FocusableNode;->onFocusChange:Lhd/l;

    .line 7
    new-instance p1, Landroidx/compose/foundation/FocusableNode$focusTargetNode$1;

    invoke-direct {p1, p0}, Landroidx/compose/foundation/FocusableNode$focusTargetNode$1;-><init>(Ljava/lang/Object;)V

    .line 8
    invoke-static {p2, p1}, Landroidx/compose/ui/focus/FocusTargetModifierNodeKt;->FocusTargetModifierNode-PYyLHbc(ILhd/p;)Landroidx/compose/ui/focus/FocusTargetModifierNode;

    move-result-object p1

    .line 9
    invoke-virtual {p0, p1}, Landroidx/compose/ui/node/DelegatingNode;->delegate(Landroidx/compose/ui/node/DelegatableNode;)Landroidx/compose/ui/node/DelegatableNode;

    move-result-object p1

    check-cast p1, Landroidx/compose/ui/focus/FocusTargetModifierNode;

    iput-object p1, p0, Landroidx/compose/foundation/FocusableNode;->focusTargetNode:Landroidx/compose/ui/focus/FocusTargetModifierNode;

    return-void
.end method

.method public synthetic constructor <init>(Landroidx/compose/foundation/interaction/MutableInteractionSource;ILhd/l;ILkotlin/jvm/internal/n;)V
    .locals 0

    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    .line 2
    sget-object p2, Landroidx/compose/ui/focus/Focusability;->Companion:Landroidx/compose/ui/focus/Focusability$Companion;

    invoke-virtual {p2}, Landroidx/compose/ui/focus/Focusability$Companion;->getAlways-LCbbffg()I

    move-result p2

    :cond_0
    and-int/lit8 p4, p4, 0x4

    const/4 p5, 0x0

    if-eqz p4, :cond_1

    move-object p3, p5

    .line 3
    :cond_1
    invoke-direct {p0, p1, p2, p3, p5}, Landroidx/compose/foundation/FocusableNode;-><init>(Landroidx/compose/foundation/interaction/MutableInteractionSource;ILhd/l;Lkotlin/jvm/internal/n;)V

    return-void
.end method

.method public synthetic constructor <init>(Landroidx/compose/foundation/interaction/MutableInteractionSource;ILhd/l;Lkotlin/jvm/internal/n;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Landroidx/compose/foundation/FocusableNode;-><init>(Landroidx/compose/foundation/interaction/MutableInteractionSource;ILhd/l;)V

    return-void
.end method

.method public static final synthetic access$getFocusTargetNode$p(Landroidx/compose/foundation/FocusableNode;)Landroidx/compose/ui/focus/FocusTargetModifierNode;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/compose/foundation/FocusableNode;->focusTargetNode:Landroidx/compose/ui/focus/FocusTargetModifierNode;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$onFocusStateChange(Landroidx/compose/foundation/FocusableNode;Landroidx/compose/ui/focus/FocusState;Landroidx/compose/ui/focus/FocusState;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Landroidx/compose/foundation/FocusableNode;->onFocusStateChange(Landroidx/compose/ui/focus/FocusState;Landroidx/compose/ui/focus/FocusState;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final disposeInteractionSource()V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/FocusableNode;->interactionSource:Landroidx/compose/foundation/interaction/MutableInteractionSource;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v1, p0, Landroidx/compose/foundation/FocusableNode;->focusedInteraction:Landroidx/compose/foundation/interaction/FocusInteraction$Focus;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    new-instance v2, Landroidx/compose/foundation/interaction/FocusInteraction$Unfocus;

    .line 10
    .line 11
    invoke-direct {v2, v1}, Landroidx/compose/foundation/interaction/FocusInteraction$Unfocus;-><init>(Landroidx/compose/foundation/interaction/FocusInteraction$Focus;)V

    .line 12
    .line 13
    .line 14
    invoke-interface {v0, v2}, Landroidx/compose/foundation/interaction/MutableInteractionSource;->tryEmit(Landroidx/compose/foundation/interaction/Interaction;)Z

    .line 15
    .line 16
    .line 17
    :cond_0
    const/4 v0, 0x0

    .line 18
    iput-object v0, p0, Landroidx/compose/foundation/FocusableNode;->focusedInteraction:Landroidx/compose/foundation/interaction/FocusInteraction$Focus;

    .line 19
    .line 20
    return-void
.end method

.method private final emitInteraction(Z)V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/FocusableNode;->interactionSource:Landroidx/compose/foundation/interaction/MutableInteractionSource;

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz p1, :cond_1

    .line 7
    .line 8
    iget-object p1, p0, Landroidx/compose/foundation/FocusableNode;->focusedInteraction:Landroidx/compose/foundation/interaction/FocusInteraction$Focus;

    .line 9
    .line 10
    if-eqz p1, :cond_0

    .line 11
    .line 12
    new-instance v2, Landroidx/compose/foundation/interaction/FocusInteraction$Unfocus;

    .line 13
    .line 14
    invoke-direct {v2, p1}, Landroidx/compose/foundation/interaction/FocusInteraction$Unfocus;-><init>(Landroidx/compose/foundation/interaction/FocusInteraction$Focus;)V

    .line 15
    .line 16
    .line 17
    invoke-direct {p0, v0, v2}, Landroidx/compose/foundation/FocusableNode;->emitWithFallback(Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/interaction/Interaction;)V

    .line 18
    .line 19
    .line 20
    iput-object v1, p0, Landroidx/compose/foundation/FocusableNode;->focusedInteraction:Landroidx/compose/foundation/interaction/FocusInteraction$Focus;

    .line 21
    .line 22
    :cond_0
    new-instance p1, Landroidx/compose/foundation/interaction/FocusInteraction$Focus;

    .line 23
    .line 24
    invoke-direct {p1}, Landroidx/compose/foundation/interaction/FocusInteraction$Focus;-><init>()V

    .line 25
    .line 26
    .line 27
    invoke-direct {p0, v0, p1}, Landroidx/compose/foundation/FocusableNode;->emitWithFallback(Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/interaction/Interaction;)V

    .line 28
    .line 29
    .line 30
    iput-object p1, p0, Landroidx/compose/foundation/FocusableNode;->focusedInteraction:Landroidx/compose/foundation/interaction/FocusInteraction$Focus;

    .line 31
    .line 32
    return-void

    .line 33
    :cond_1
    iget-object p1, p0, Landroidx/compose/foundation/FocusableNode;->focusedInteraction:Landroidx/compose/foundation/interaction/FocusInteraction$Focus;

    .line 34
    .line 35
    if-eqz p1, :cond_2

    .line 36
    .line 37
    new-instance v2, Landroidx/compose/foundation/interaction/FocusInteraction$Unfocus;

    .line 38
    .line 39
    invoke-direct {v2, p1}, Landroidx/compose/foundation/interaction/FocusInteraction$Unfocus;-><init>(Landroidx/compose/foundation/interaction/FocusInteraction$Focus;)V

    .line 40
    .line 41
    .line 42
    invoke-direct {p0, v0, v2}, Landroidx/compose/foundation/FocusableNode;->emitWithFallback(Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/interaction/Interaction;)V

    .line 43
    .line 44
    .line 45
    iput-object v1, p0, Landroidx/compose/foundation/FocusableNode;->focusedInteraction:Landroidx/compose/foundation/interaction/FocusInteraction$Focus;

    .line 46
    .line 47
    :cond_2
    return-void
.end method

.method private final emitWithFallback(Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/interaction/Interaction;)V
    .locals 8

    .line 1
    invoke-virtual {p0}, Landroidx/compose/ui/Modifier$Node;->isAttached()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    invoke-virtual {p0}, Landroidx/compose/ui/Modifier$Node;->getCoroutineScope()Lsd/i0;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-interface {v0}, Lsd/i0;->getCoroutineContext()Lkotlin/coroutines/d;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sget-object v1, Lkotlinx/coroutines/g;->b0:Lkotlinx/coroutines/g$b;

    .line 16
    .line 17
    invoke-interface {v0, v1}, Lkotlin/coroutines/d;->get(Lkotlin/coroutines/d$c;)Lkotlin/coroutines/d$b;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    check-cast v0, Lkotlinx/coroutines/g;

    .line 22
    .line 23
    const/4 v1, 0x0

    .line 24
    if-eqz v0, :cond_0

    .line 25
    .line 26
    new-instance v2, Landroidx/compose/foundation/FocusableNode$emitWithFallback$handler$1;

    .line 27
    .line 28
    invoke-direct {v2, p1, p2}, Landroidx/compose/foundation/FocusableNode$emitWithFallback$handler$1;-><init>(Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/interaction/Interaction;)V

    .line 29
    .line 30
    .line 31
    invoke-interface {v0, v2}, Lkotlinx/coroutines/g;->A(Lhd/l;)Lsd/t0;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    goto :goto_0

    .line 36
    :cond_0
    move-object v0, v1

    .line 37
    :goto_0
    invoke-virtual {p0}, Landroidx/compose/ui/Modifier$Node;->getCoroutineScope()Lsd/i0;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    new-instance v5, Landroidx/compose/foundation/FocusableNode$emitWithFallback$1;

    .line 42
    .line 43
    invoke-direct {v5, p1, p2, v0, v1}, Landroidx/compose/foundation/FocusableNode$emitWithFallback$1;-><init>(Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/interaction/Interaction;Lsd/t0;Lvc/c;)V

    .line 44
    .line 45
    .line 46
    const/4 v6, 0x3

    .line 47
    const/4 v7, 0x0

    .line 48
    const/4 v3, 0x0

    .line 49
    const/4 v4, 0x0

    .line 50
    invoke-static/range {v2 .. v7}, Lsd/f;->d(Lsd/i0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lhd/p;ILjava/lang/Object;)Lkotlinx/coroutines/g;

    .line 51
    .line 52
    .line 53
    return-void

    .line 54
    :cond_1
    invoke-interface {p1, p2}, Landroidx/compose/foundation/interaction/MutableInteractionSource;->tryEmit(Landroidx/compose/foundation/interaction/Interaction;)Z

    .line 55
    .line 56
    .line 57
    return-void
.end method

.method private final getFocusedBoundsObserver()Landroidx/compose/foundation/FocusedBoundsObserverNode;
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroidx/compose/ui/Modifier$Node;->isAttached()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    sget-object v0, Landroidx/compose/foundation/FocusedBoundsObserverNode;->TraverseKey:Landroidx/compose/foundation/FocusedBoundsObserverNode$TraverseKey;

    .line 9
    .line 10
    invoke-static {p0, v0}, Landroidx/compose/ui/node/TraversableNodeKt;->findNearestAncestor(Landroidx/compose/ui/node/DelegatableNode;Ljava/lang/Object;)Landroidx/compose/ui/node/TraversableNode;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    instance-of v2, v0, Landroidx/compose/foundation/FocusedBoundsObserverNode;

    .line 15
    .line 16
    if-eqz v2, :cond_0

    .line 17
    .line 18
    check-cast v0, Landroidx/compose/foundation/FocusedBoundsObserverNode;

    .line 19
    .line 20
    return-object v0

    .line 21
    :cond_0
    return-object v1
.end method

.method private final notifyObserverWhenAttached()V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/FocusableNode;->globalLayoutCoordinates:Landroidx/compose/ui/layout/LayoutCoordinates;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    invoke-interface {v0}, Landroidx/compose/ui/layout/LayoutCoordinates;->isAttached()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    invoke-direct {p0}, Landroidx/compose/foundation/FocusableNode;->getFocusedBoundsObserver()Landroidx/compose/foundation/FocusedBoundsObserverNode;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    iget-object v1, p0, Landroidx/compose/foundation/FocusableNode;->globalLayoutCoordinates:Landroidx/compose/ui/layout/LayoutCoordinates;

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Landroidx/compose/foundation/FocusedBoundsObserverNode;->onFocusBoundsChanged(Landroidx/compose/ui/layout/LayoutCoordinates;)V

    .line 23
    .line 24
    .line 25
    :cond_0
    return-void
.end method

.method private final onFocusStateChange(Landroidx/compose/ui/focus/FocusState;Landroidx/compose/ui/focus/FocusState;)V
    .locals 6

    .line 1
    invoke-virtual {p0}, Landroidx/compose/ui/Modifier$Node;->isAttached()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    invoke-interface {p2}, Landroidx/compose/ui/focus/FocusState;->isFocused()Z

    .line 9
    .line 10
    .line 11
    move-result p2

    .line 12
    invoke-interface {p1}, Landroidx/compose/ui/focus/FocusState;->isFocused()Z

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    if-ne p2, p1, :cond_1

    .line 17
    .line 18
    :goto_0
    return-void

    .line 19
    :cond_1
    iget-object p1, p0, Landroidx/compose/foundation/FocusableNode;->onFocusChange:Lhd/l;

    .line 20
    .line 21
    if-eqz p1, :cond_2

    .line 22
    .line 23
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-interface {p1, v0}, Lhd/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    :cond_2
    const/4 p1, 0x0

    .line 31
    if-eqz p2, :cond_4

    .line 32
    .line 33
    invoke-virtual {p0}, Landroidx/compose/ui/Modifier$Node;->getCoroutineScope()Lsd/i0;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    new-instance v3, Landroidx/compose/foundation/FocusableNode$onFocusStateChange$1;

    .line 38
    .line 39
    invoke-direct {v3, p0, p1}, Landroidx/compose/foundation/FocusableNode$onFocusStateChange$1;-><init>(Landroidx/compose/foundation/FocusableNode;Lvc/c;)V

    .line 40
    .line 41
    .line 42
    const/4 v4, 0x3

    .line 43
    const/4 v5, 0x0

    .line 44
    const/4 v1, 0x0

    .line 45
    const/4 v2, 0x0

    .line 46
    invoke-static/range {v0 .. v5}, Lsd/f;->d(Lsd/i0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lhd/p;ILjava/lang/Object;)Lkotlinx/coroutines/g;

    .line 47
    .line 48
    .line 49
    invoke-direct {p0}, Landroidx/compose/foundation/FocusableNode;->retrievePinnableContainer()Landroidx/compose/ui/layout/PinnableContainer;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    if-eqz v0, :cond_3

    .line 54
    .line 55
    invoke-interface {v0}, Landroidx/compose/ui/layout/PinnableContainer;->pin()Landroidx/compose/ui/layout/PinnableContainer$PinnedHandle;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    :cond_3
    iput-object p1, p0, Landroidx/compose/foundation/FocusableNode;->pinnedHandle:Landroidx/compose/ui/layout/PinnableContainer$PinnedHandle;

    .line 60
    .line 61
    invoke-direct {p0}, Landroidx/compose/foundation/FocusableNode;->notifyObserverWhenAttached()V

    .line 62
    .line 63
    .line 64
    goto :goto_1

    .line 65
    :cond_4
    iget-object v0, p0, Landroidx/compose/foundation/FocusableNode;->pinnedHandle:Landroidx/compose/ui/layout/PinnableContainer$PinnedHandle;

    .line 66
    .line 67
    if-eqz v0, :cond_5

    .line 68
    .line 69
    invoke-interface {v0}, Landroidx/compose/ui/layout/PinnableContainer$PinnedHandle;->release()V

    .line 70
    .line 71
    .line 72
    :cond_5
    iput-object p1, p0, Landroidx/compose/foundation/FocusableNode;->pinnedHandle:Landroidx/compose/ui/layout/PinnableContainer$PinnedHandle;

    .line 73
    .line 74
    invoke-direct {p0}, Landroidx/compose/foundation/FocusableNode;->getFocusedBoundsObserver()Landroidx/compose/foundation/FocusedBoundsObserverNode;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    if-eqz v0, :cond_6

    .line 79
    .line 80
    invoke-virtual {v0, p1}, Landroidx/compose/foundation/FocusedBoundsObserverNode;->onFocusBoundsChanged(Landroidx/compose/ui/layout/LayoutCoordinates;)V

    .line 81
    .line 82
    .line 83
    :cond_6
    :goto_1
    invoke-static {p0}, Landroidx/compose/ui/node/SemanticsModifierNodeKt;->invalidateSemantics(Landroidx/compose/ui/node/SemanticsModifierNode;)V

    .line 84
    .line 85
    .line 86
    invoke-direct {p0, p2}, Landroidx/compose/foundation/FocusableNode;->emitInteraction(Z)V

    .line 87
    .line 88
    .line 89
    return-void
.end method

.method private final retrievePinnableContainer()Landroidx/compose/ui/layout/PinnableContainer;
    .locals 2

    .line 1
    new-instance v0, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 2
    .line 3
    invoke-direct {v0}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Landroidx/compose/foundation/FocusableNode$retrievePinnableContainer$1;

    .line 7
    .line 8
    invoke-direct {v1, v0, p0}, Landroidx/compose/foundation/FocusableNode$retrievePinnableContainer$1;-><init>(Lkotlin/jvm/internal/Ref$ObjectRef;Landroidx/compose/foundation/FocusableNode;)V

    .line 9
    .line 10
    .line 11
    invoke-static {p0, v1}, Landroidx/compose/ui/node/ObserverModifierNodeKt;->observeReads(Landroidx/compose/ui/Modifier$Node;Lhd/a;)V

    .line 12
    .line 13
    .line 14
    iget-object v0, v0, Lkotlin/jvm/internal/Ref$ObjectRef;->c:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v0, Landroidx/compose/ui/layout/PinnableContainer;

    .line 17
    .line 18
    return-object v0
.end method


# virtual methods
.method public applySemantics(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/FocusableNode;->focusTargetNode:Landroidx/compose/ui/focus/FocusTargetModifierNode;

    .line 2
    .line 3
    invoke-interface {v0}, Landroidx/compose/ui/focus/FocusTargetModifierNode;->getFocusState()Landroidx/compose/ui/focus/FocusState;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0}, Landroidx/compose/ui/focus/FocusState;->isFocused()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    invoke-static {p1, v0}, Landroidx/compose/ui/semantics/SemanticsPropertiesKt;->setFocused(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;Z)V

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, Landroidx/compose/foundation/FocusableNode;->requestFocus:Lhd/a;

    .line 15
    .line 16
    if-nez v0, :cond_0

    .line 17
    .line 18
    new-instance v0, Landroidx/compose/foundation/FocusableNode$applySemantics$1;

    .line 19
    .line 20
    invoke-direct {v0, p0}, Landroidx/compose/foundation/FocusableNode$applySemantics$1;-><init>(Landroidx/compose/foundation/FocusableNode;)V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, Landroidx/compose/foundation/FocusableNode;->requestFocus:Lhd/a;

    .line 24
    .line 25
    :cond_0
    iget-object v0, p0, Landroidx/compose/foundation/FocusableNode;->requestFocus:Lhd/a;

    .line 26
    .line 27
    const/4 v1, 0x1

    .line 28
    const/4 v2, 0x0

    .line 29
    invoke-static {p1, v2, v0, v1, v2}, Landroidx/compose/ui/semantics/SemanticsPropertiesKt;->requestFocus$default(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;Ljava/lang/String;Lhd/a;ILjava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    return-void
.end method

.method public getShouldAutoInvalidate()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Landroidx/compose/foundation/FocusableNode;->shouldAutoInvalidate:Z

    .line 2
    .line 3
    return v0
.end method

.method public getTraverseKey()Ljava/lang/Object;
    .locals 1

    .line 1
    sget-object v0, Landroidx/compose/foundation/FocusableNode;->TraverseKey:Landroidx/compose/foundation/FocusableNode$TraverseKey;

    .line 2
    .line 3
    return-object v0
.end method

.method public onGloballyPositioned(Landroidx/compose/ui/layout/LayoutCoordinates;)V
    .locals 1

    .line 1
    iput-object p1, p0, Landroidx/compose/foundation/FocusableNode;->globalLayoutCoordinates:Landroidx/compose/ui/layout/LayoutCoordinates;

    .line 2
    .line 3
    iget-object v0, p0, Landroidx/compose/foundation/FocusableNode;->focusTargetNode:Landroidx/compose/ui/focus/FocusTargetModifierNode;

    .line 4
    .line 5
    invoke-interface {v0}, Landroidx/compose/ui/focus/FocusTargetModifierNode;->getFocusState()Landroidx/compose/ui/focus/FocusState;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-interface {v0}, Landroidx/compose/ui/focus/FocusState;->isFocused()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    invoke-interface {p1}, Landroidx/compose/ui/layout/LayoutCoordinates;->isAttached()Z

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    if-eqz p1, :cond_1

    .line 21
    .line 22
    invoke-direct {p0}, Landroidx/compose/foundation/FocusableNode;->notifyObserverWhenAttached()V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :cond_1
    invoke-direct {p0}, Landroidx/compose/foundation/FocusableNode;->getFocusedBoundsObserver()Landroidx/compose/foundation/FocusedBoundsObserverNode;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    if-eqz p1, :cond_2

    .line 31
    .line 32
    const/4 v0, 0x0

    .line 33
    invoke-virtual {p1, v0}, Landroidx/compose/foundation/FocusedBoundsObserverNode;->onFocusBoundsChanged(Landroidx/compose/ui/layout/LayoutCoordinates;)V

    .line 34
    .line 35
    .line 36
    :cond_2
    :goto_0
    return-void
.end method

.method public onObservedReadsChanged()V
    .locals 2

    .line 1
    invoke-direct {p0}, Landroidx/compose/foundation/FocusableNode;->retrievePinnableContainer()Landroidx/compose/ui/layout/PinnableContainer;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Landroidx/compose/foundation/FocusableNode;->focusTargetNode:Landroidx/compose/ui/focus/FocusTargetModifierNode;

    .line 6
    .line 7
    invoke-interface {v1}, Landroidx/compose/ui/focus/FocusTargetModifierNode;->getFocusState()Landroidx/compose/ui/focus/FocusState;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-interface {v1}, Landroidx/compose/ui/focus/FocusState;->isFocused()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_2

    .line 16
    .line 17
    iget-object v1, p0, Landroidx/compose/foundation/FocusableNode;->pinnedHandle:Landroidx/compose/ui/layout/PinnableContainer$PinnedHandle;

    .line 18
    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    invoke-interface {v1}, Landroidx/compose/ui/layout/PinnableContainer$PinnedHandle;->release()V

    .line 22
    .line 23
    .line 24
    :cond_0
    if-eqz v0, :cond_1

    .line 25
    .line 26
    invoke-interface {v0}, Landroidx/compose/ui/layout/PinnableContainer;->pin()Landroidx/compose/ui/layout/PinnableContainer$PinnedHandle;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    goto :goto_0

    .line 31
    :cond_1
    const/4 v0, 0x0

    .line 32
    :goto_0
    iput-object v0, p0, Landroidx/compose/foundation/FocusableNode;->pinnedHandle:Landroidx/compose/ui/layout/PinnableContainer$PinnedHandle;

    .line 33
    .line 34
    :cond_2
    return-void
.end method

.method public onReset()V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/FocusableNode;->pinnedHandle:Landroidx/compose/ui/layout/PinnableContainer$PinnedHandle;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Landroidx/compose/ui/layout/PinnableContainer$PinnedHandle;->release()V

    .line 6
    .line 7
    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    iput-object v0, p0, Landroidx/compose/foundation/FocusableNode;->pinnedHandle:Landroidx/compose/ui/layout/PinnableContainer$PinnedHandle;

    .line 10
    .line 11
    return-void
.end method

.method public final update(Landroidx/compose/foundation/interaction/MutableInteractionSource;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/FocusableNode;->interactionSource:Landroidx/compose/foundation/interaction/MutableInteractionSource;

    .line 2
    .line 3
    invoke-static {v0, p1}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    invoke-direct {p0}, Landroidx/compose/foundation/FocusableNode;->disposeInteractionSource()V

    .line 10
    .line 11
    .line 12
    iput-object p1, p0, Landroidx/compose/foundation/FocusableNode;->interactionSource:Landroidx/compose/foundation/interaction/MutableInteractionSource;

    .line 13
    .line 14
    :cond_0
    return-void
.end method
