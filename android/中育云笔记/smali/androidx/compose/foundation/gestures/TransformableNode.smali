.class final Landroidx/compose/foundation/gestures/TransformableNode;
.super Landroidx/compose/ui/node/DelegatingNode;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/ui/node/PointerInputModifierNode;
.implements Landroidx/compose/ui/node/CompositionLocalConsumerModifierNode;


# instance fields
.field private canPan:Lhd/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhd/l;"
        }
    .end annotation
.end field

.field private final channel:Lkotlinx/coroutines/channels/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/channels/a;"
        }
    .end annotation
.end field

.field private enabled:Z

.field private lockRotationOnZoomPan:Z

.field private pointerInputModifierMouse:Landroidx/compose/ui/node/PointerInputModifierNode;

.field private final pointerInputNode:Landroidx/compose/ui/input/pointer/SuspendingPointerInputModifierNode;

.field private scrollConfig:Landroidx/compose/foundation/gestures/ScrollConfig;

.field private state:Landroidx/compose/foundation/gestures/TransformableState;

.field private final updatedCanPan:Lhd/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhd/l;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroidx/compose/foundation/gestures/TransformableState;Lhd/l;ZZ)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/foundation/gestures/TransformableState;",
            "Lhd/l;",
            "ZZ)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Landroidx/compose/ui/node/DelegatingNode;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/compose/foundation/gestures/TransformableNode;->state:Landroidx/compose/foundation/gestures/TransformableState;

    .line 5
    .line 6
    iput-object p2, p0, Landroidx/compose/foundation/gestures/TransformableNode;->canPan:Lhd/l;

    .line 7
    .line 8
    iput-boolean p3, p0, Landroidx/compose/foundation/gestures/TransformableNode;->lockRotationOnZoomPan:Z

    .line 9
    .line 10
    iput-boolean p4, p0, Landroidx/compose/foundation/gestures/TransformableNode;->enabled:Z

    .line 11
    .line 12
    new-instance p1, Landroidx/compose/foundation/gestures/TransformableNode$updatedCanPan$1;

    .line 13
    .line 14
    invoke-direct {p1, p0}, Landroidx/compose/foundation/gestures/TransformableNode$updatedCanPan$1;-><init>(Landroidx/compose/foundation/gestures/TransformableNode;)V

    .line 15
    .line 16
    .line 17
    iput-object p1, p0, Landroidx/compose/foundation/gestures/TransformableNode;->updatedCanPan:Lhd/l;

    .line 18
    .line 19
    const/4 p1, 0x0

    .line 20
    const/4 p2, 0x6

    .line 21
    const p3, 0x7fffffff

    .line 22
    .line 23
    .line 24
    invoke-static {p3, p1, p1, p2, p1}, Lkotlinx/coroutines/channels/b;->b(ILkotlinx/coroutines/channels/BufferOverflow;Lhd/l;ILjava/lang/Object;)Lkotlinx/coroutines/channels/a;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    iput-object p1, p0, Landroidx/compose/foundation/gestures/TransformableNode;->channel:Lkotlinx/coroutines/channels/a;

    .line 29
    .line 30
    new-instance p1, Landroidx/compose/foundation/gestures/TransformableNode$pointerInputNode$1;

    .line 31
    .line 32
    invoke-direct {p1, p0}, Landroidx/compose/foundation/gestures/TransformableNode$pointerInputNode$1;-><init>(Landroidx/compose/foundation/gestures/TransformableNode;)V

    .line 33
    .line 34
    .line 35
    invoke-static {p1}, Landroidx/compose/ui/input/pointer/SuspendingPointerInputFilterKt;->SuspendingPointerInputModifierNode(Landroidx/compose/ui/input/pointer/PointerInputEventHandler;)Landroidx/compose/ui/input/pointer/SuspendingPointerInputModifierNode;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    invoke-virtual {p0, p1}, Landroidx/compose/ui/node/DelegatingNode;->delegate(Landroidx/compose/ui/node/DelegatableNode;)Landroidx/compose/ui/node/DelegatableNode;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    check-cast p1, Landroidx/compose/ui/input/pointer/SuspendingPointerInputModifierNode;

    .line 44
    .line 45
    iput-object p1, p0, Landroidx/compose/foundation/gestures/TransformableNode;->pointerInputNode:Landroidx/compose/ui/input/pointer/SuspendingPointerInputModifierNode;

    .line 46
    .line 47
    return-void
.end method

.method public static final synthetic access$getCanPan$p(Landroidx/compose/foundation/gestures/TransformableNode;)Lhd/l;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/compose/foundation/gestures/TransformableNode;->canPan:Lhd/l;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$getChannel$p(Landroidx/compose/foundation/gestures/TransformableNode;)Lkotlinx/coroutines/channels/a;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/compose/foundation/gestures/TransformableNode;->channel:Lkotlinx/coroutines/channels/a;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$getEnabled$p(Landroidx/compose/foundation/gestures/TransformableNode;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Landroidx/compose/foundation/gestures/TransformableNode;->enabled:Z

    .line 2
    .line 3
    return p0
.end method

.method public static final synthetic access$getLockRotationOnZoomPan$p(Landroidx/compose/foundation/gestures/TransformableNode;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Landroidx/compose/foundation/gestures/TransformableNode;->lockRotationOnZoomPan:Z

    .line 2
    .line 3
    return p0
.end method

.method public static final synthetic access$getState$p(Landroidx/compose/foundation/gestures/TransformableNode;)Landroidx/compose/foundation/gestures/TransformableState;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/compose/foundation/gestures/TransformableNode;->state:Landroidx/compose/foundation/gestures/TransformableState;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$getUpdatedCanPan$p(Landroidx/compose/foundation/gestures/TransformableNode;)Lhd/l;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/compose/foundation/gestures/TransformableNode;->updatedCanPan:Lhd/l;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public onAttach()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroidx/compose/ui/Modifier$Node;->onAttach()V

    .line 2
    .line 3
    .line 4
    invoke-static {p0}, Landroidx/compose/foundation/gestures/AndroidScrollable_androidKt;->platformScrollConfig(Landroidx/compose/ui/node/CompositionLocalConsumerModifierNode;)Landroidx/compose/foundation/gestures/ScrollConfig;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iput-object v0, p0, Landroidx/compose/foundation/gestures/TransformableNode;->scrollConfig:Landroidx/compose/foundation/gestures/ScrollConfig;

    .line 9
    .line 10
    return-void
.end method

.method public onCancelPointerInput()V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/gestures/TransformableNode;->pointerInputNode:Landroidx/compose/ui/input/pointer/SuspendingPointerInputModifierNode;

    .line 2
    .line 3
    invoke-interface {v0}, Landroidx/compose/ui/node/PointerInputModifierNode;->onCancelPointerInput()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Landroidx/compose/foundation/gestures/TransformableNode;->pointerInputModifierMouse:Landroidx/compose/ui/node/PointerInputModifierNode;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    invoke-interface {v0}, Landroidx/compose/ui/node/PointerInputModifierNode;->onCancelPointerInput()V

    .line 11
    .line 12
    .line 13
    :cond_0
    return-void
.end method

.method public onPointerEvent-H0pRuoY(Landroidx/compose/ui/input/pointer/PointerEvent;Landroidx/compose/ui/input/pointer/PointerEventPass;J)V
    .locals 6

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/gestures/TransformableNode;->scrollConfig:Landroidx/compose/foundation/gestures/ScrollConfig;

    .line 2
    .line 3
    iget-boolean v1, p0, Landroidx/compose/foundation/gestures/TransformableNode;->enabled:Z

    .line 4
    .line 5
    if-eqz v1, :cond_1

    .line 6
    .line 7
    invoke-virtual {p1}, Landroidx/compose/ui/input/pointer/PointerEvent;->getChanges()Ljava/util/List;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    move-object v2, v1

    .line 12
    check-cast v2, Ljava/util/Collection;

    .line 13
    .line 14
    invoke-interface {v2}, Ljava/util/Collection;->size()I

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    const/4 v3, 0x0

    .line 19
    :goto_0
    if-ge v3, v2, :cond_1

    .line 20
    .line 21
    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v4

    .line 25
    check-cast v4, Landroidx/compose/ui/input/pointer/PointerInputChange;

    .line 26
    .line 27
    invoke-virtual {v4}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getType-T8wyACA()I

    .line 28
    .line 29
    .line 30
    move-result v4

    .line 31
    sget-object v5, Landroidx/compose/ui/input/pointer/PointerType;->Companion:Landroidx/compose/ui/input/pointer/PointerType$Companion;

    .line 32
    .line 33
    invoke-virtual {v5}, Landroidx/compose/ui/input/pointer/PointerType$Companion;->getMouse-T8wyACA()I

    .line 34
    .line 35
    .line 36
    move-result v5

    .line 37
    invoke-static {v4, v5}, Landroidx/compose/ui/input/pointer/PointerType;->equals-impl0(II)Z

    .line 38
    .line 39
    .line 40
    move-result v4

    .line 41
    if-eqz v4, :cond_0

    .line 42
    .line 43
    if-eqz v0, :cond_1

    .line 44
    .line 45
    iget-object v1, p0, Landroidx/compose/foundation/gestures/TransformableNode;->pointerInputModifierMouse:Landroidx/compose/ui/node/PointerInputModifierNode;

    .line 46
    .line 47
    if-nez v1, :cond_1

    .line 48
    .line 49
    new-instance v1, Landroidx/compose/foundation/gestures/TransformableNode$onPointerEvent$2;

    .line 50
    .line 51
    invoke-direct {v1, p0, v0}, Landroidx/compose/foundation/gestures/TransformableNode$onPointerEvent$2;-><init>(Landroidx/compose/foundation/gestures/TransformableNode;Landroidx/compose/foundation/gestures/ScrollConfig;)V

    .line 52
    .line 53
    .line 54
    invoke-static {v1}, Landroidx/compose/ui/input/pointer/SuspendingPointerInputFilterKt;->SuspendingPointerInputModifierNode(Landroidx/compose/ui/input/pointer/PointerInputEventHandler;)Landroidx/compose/ui/input/pointer/SuspendingPointerInputModifierNode;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    invoke-virtual {p0, v0}, Landroidx/compose/ui/node/DelegatingNode;->delegate(Landroidx/compose/ui/node/DelegatableNode;)Landroidx/compose/ui/node/DelegatableNode;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    check-cast v0, Landroidx/compose/ui/node/PointerInputModifierNode;

    .line 63
    .line 64
    iput-object v0, p0, Landroidx/compose/foundation/gestures/TransformableNode;->pointerInputModifierMouse:Landroidx/compose/ui/node/PointerInputModifierNode;

    .line 65
    .line 66
    goto :goto_1

    .line 67
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_1
    :goto_1
    iget-object v0, p0, Landroidx/compose/foundation/gestures/TransformableNode;->pointerInputNode:Landroidx/compose/ui/input/pointer/SuspendingPointerInputModifierNode;

    .line 71
    .line 72
    invoke-interface {v0, p1, p2, p3, p4}, Landroidx/compose/ui/node/PointerInputModifierNode;->onPointerEvent-H0pRuoY(Landroidx/compose/ui/input/pointer/PointerEvent;Landroidx/compose/ui/input/pointer/PointerEventPass;J)V

    .line 73
    .line 74
    .line 75
    iget-object v0, p0, Landroidx/compose/foundation/gestures/TransformableNode;->pointerInputModifierMouse:Landroidx/compose/ui/node/PointerInputModifierNode;

    .line 76
    .line 77
    if-eqz v0, :cond_2

    .line 78
    .line 79
    invoke-interface {v0, p1, p2, p3, p4}, Landroidx/compose/ui/node/PointerInputModifierNode;->onPointerEvent-H0pRuoY(Landroidx/compose/ui/input/pointer/PointerEvent;Landroidx/compose/ui/input/pointer/PointerEventPass;J)V

    .line 80
    .line 81
    .line 82
    :cond_2
    return-void
.end method

.method public final update(Landroidx/compose/foundation/gestures/TransformableState;Lhd/l;ZZ)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/foundation/gestures/TransformableState;",
            "Lhd/l;",
            "ZZ)V"
        }
    .end annotation

    .line 1
    iput-object p2, p0, Landroidx/compose/foundation/gestures/TransformableNode;->canPan:Lhd/l;

    .line 2
    .line 3
    iget-object p2, p0, Landroidx/compose/foundation/gestures/TransformableNode;->state:Landroidx/compose/foundation/gestures/TransformableState;

    .line 4
    .line 5
    invoke-static {p2, p1}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result p2

    .line 9
    if-eqz p2, :cond_1

    .line 10
    .line 11
    iget-boolean p2, p0, Landroidx/compose/foundation/gestures/TransformableNode;->enabled:Z

    .line 12
    .line 13
    if-ne p2, p4, :cond_1

    .line 14
    .line 15
    iget-boolean p2, p0, Landroidx/compose/foundation/gestures/TransformableNode;->lockRotationOnZoomPan:Z

    .line 16
    .line 17
    if-eq p2, p3, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    return-void

    .line 21
    :cond_1
    :goto_0
    iput-object p1, p0, Landroidx/compose/foundation/gestures/TransformableNode;->state:Landroidx/compose/foundation/gestures/TransformableState;

    .line 22
    .line 23
    iput-boolean p4, p0, Landroidx/compose/foundation/gestures/TransformableNode;->enabled:Z

    .line 24
    .line 25
    iput-boolean p3, p0, Landroidx/compose/foundation/gestures/TransformableNode;->lockRotationOnZoomPan:Z

    .line 26
    .line 27
    iget-object p1, p0, Landroidx/compose/foundation/gestures/TransformableNode;->pointerInputNode:Landroidx/compose/ui/input/pointer/SuspendingPointerInputModifierNode;

    .line 28
    .line 29
    invoke-interface {p1}, Landroidx/compose/ui/input/pointer/SuspendingPointerInputModifierNode;->resetPointerInputHandler()V

    .line 30
    .line 31
    .line 32
    return-void
.end method
