.class public final Landroidx/compose/foundation/draganddrop/DragAndDropSourceNode;
.super Landroidx/compose/ui/node/DelegatingNode;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/ui/node/LayoutAwareModifierNode;


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private detectDragStart:Lhd/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhd/p;"
        }
    .end annotation
.end field

.field private final dragAndDropModifierNode:Landroidx/compose/ui/draganddrop/DragAndDropSourceModifierNode;

.field private drawDragDecoration:Lhd/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhd/l;"
        }
    .end annotation
.end field

.field private inputModifierNode:Landroidx/compose/ui/node/PointerInputModifierNode;

.field private size:J

.field private transferData:Lhd/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhd/l;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lhd/l;Lhd/p;Lhd/l;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhd/l;",
            "Lhd/p;",
            "Lhd/l;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Landroidx/compose/ui/node/DelegatingNode;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/compose/foundation/draganddrop/DragAndDropSourceNode;->drawDragDecoration:Lhd/l;

    .line 5
    .line 6
    iput-object p2, p0, Landroidx/compose/foundation/draganddrop/DragAndDropSourceNode;->detectDragStart:Lhd/p;

    .line 7
    .line 8
    iput-object p3, p0, Landroidx/compose/foundation/draganddrop/DragAndDropSourceNode;->transferData:Lhd/l;

    .line 9
    .line 10
    sget-object p1, Landroidx/compose/ui/unit/IntSize;->Companion:Landroidx/compose/ui/unit/IntSize$Companion;

    .line 11
    .line 12
    invoke-virtual {p1}, Landroidx/compose/ui/unit/IntSize$Companion;->getZero-YbymL2g()J

    .line 13
    .line 14
    .line 15
    move-result-wide p1

    .line 16
    iput-wide p1, p0, Landroidx/compose/foundation/draganddrop/DragAndDropSourceNode;->size:J

    .line 17
    .line 18
    new-instance p1, Landroidx/compose/foundation/draganddrop/DragAndDropSourceNode$dragAndDropModifierNode$1;

    .line 19
    .line 20
    invoke-direct {p1, p0}, Landroidx/compose/foundation/draganddrop/DragAndDropSourceNode$dragAndDropModifierNode$1;-><init>(Landroidx/compose/foundation/draganddrop/DragAndDropSourceNode;)V

    .line 21
    .line 22
    .line 23
    invoke-static {p1}, Landroidx/compose/ui/draganddrop/DragAndDropNodeKt;->DragAndDropSourceModifierNode(Lhd/p;)Landroidx/compose/ui/draganddrop/DragAndDropSourceModifierNode;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-virtual {p0, p1}, Landroidx/compose/ui/node/DelegatingNode;->delegate(Landroidx/compose/ui/node/DelegatableNode;)Landroidx/compose/ui/node/DelegatableNode;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    check-cast p1, Landroidx/compose/ui/draganddrop/DragAndDropSourceModifierNode;

    .line 32
    .line 33
    iput-object p1, p0, Landroidx/compose/foundation/draganddrop/DragAndDropSourceNode;->dragAndDropModifierNode:Landroidx/compose/ui/draganddrop/DragAndDropSourceModifierNode;

    .line 34
    .line 35
    return-void
.end method

.method public static final synthetic access$getDragAndDropModifierNode$p(Landroidx/compose/foundation/draganddrop/DragAndDropSourceNode;)Landroidx/compose/ui/draganddrop/DragAndDropSourceModifierNode;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/compose/foundation/draganddrop/DragAndDropSourceNode;->dragAndDropModifierNode:Landroidx/compose/ui/draganddrop/DragAndDropSourceModifierNode;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$getSize$p(Landroidx/compose/foundation/draganddrop/DragAndDropSourceNode;)J
    .locals 2

    .line 1
    iget-wide v0, p0, Landroidx/compose/foundation/draganddrop/DragAndDropSourceNode;->size:J

    .line 2
    .line 3
    return-wide v0
.end method


# virtual methods
.method public final getDetectDragStart()Lhd/p;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lhd/p;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/draganddrop/DragAndDropSourceNode;->detectDragStart:Lhd/p;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getDrawDragDecoration()Lhd/l;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lhd/l;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/draganddrop/DragAndDropSourceNode;->drawDragDecoration:Lhd/l;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getTransferData()Lhd/l;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lhd/l;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/draganddrop/DragAndDropSourceNode;->transferData:Lhd/l;

    .line 2
    .line 3
    return-object v0
.end method

.method public onAttach()V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/draganddrop/DragAndDropSourceNode;->dragAndDropModifierNode:Landroidx/compose/ui/draganddrop/DragAndDropSourceModifierNode;

    .line 2
    .line 3
    invoke-interface {v0}, Landroidx/compose/ui/draganddrop/DragAndDropSourceModifierNode;->isRequestDragAndDropTransferRequired()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    new-instance v0, Landroidx/compose/foundation/draganddrop/DragAndDropSourceNode$onAttach$1;

    .line 10
    .line 11
    invoke-direct {v0, p0}, Landroidx/compose/foundation/draganddrop/DragAndDropSourceNode$onAttach$1;-><init>(Landroidx/compose/foundation/draganddrop/DragAndDropSourceNode;)V

    .line 12
    .line 13
    .line 14
    invoke-static {v0}, Landroidx/compose/ui/input/pointer/SuspendingPointerInputFilterKt;->SuspendingPointerInputModifierNode(Landroidx/compose/ui/input/pointer/PointerInputEventHandler;)Landroidx/compose/ui/input/pointer/SuspendingPointerInputModifierNode;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-virtual {p0, v0}, Landroidx/compose/ui/node/DelegatingNode;->delegate(Landroidx/compose/ui/node/DelegatableNode;)Landroidx/compose/ui/node/DelegatableNode;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    check-cast v0, Landroidx/compose/ui/node/PointerInputModifierNode;

    .line 23
    .line 24
    iput-object v0, p0, Landroidx/compose/foundation/draganddrop/DragAndDropSourceNode;->inputModifierNode:Landroidx/compose/ui/node/PointerInputModifierNode;

    .line 25
    .line 26
    :cond_0
    return-void
.end method

.method public onDetach()V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/draganddrop/DragAndDropSourceNode;->inputModifierNode:Landroidx/compose/ui/node/PointerInputModifierNode;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0, v0}, Landroidx/compose/ui/node/DelegatingNode;->undelegate(Landroidx/compose/ui/node/DelegatableNode;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public onPlaced(Landroidx/compose/ui/layout/LayoutCoordinates;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/draganddrop/DragAndDropSourceNode;->dragAndDropModifierNode:Landroidx/compose/ui/draganddrop/DragAndDropSourceModifierNode;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Landroidx/compose/ui/node/LayoutAwareModifierNode;->onPlaced(Landroidx/compose/ui/layout/LayoutCoordinates;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public onRemeasured-ozmzZPI(J)V
    .locals 1

    .line 1
    iput-wide p1, p0, Landroidx/compose/foundation/draganddrop/DragAndDropSourceNode;->size:J

    .line 2
    .line 3
    iget-object v0, p0, Landroidx/compose/foundation/draganddrop/DragAndDropSourceNode;->dragAndDropModifierNode:Landroidx/compose/ui/draganddrop/DragAndDropSourceModifierNode;

    .line 4
    .line 5
    invoke-interface {v0, p1, p2}, Landroidx/compose/ui/node/LayoutAwareModifierNode;->onRemeasured-ozmzZPI(J)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final setDetectDragStart(Lhd/p;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhd/p;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Landroidx/compose/foundation/draganddrop/DragAndDropSourceNode;->detectDragStart:Lhd/p;

    .line 2
    .line 3
    return-void
.end method

.method public final setDrawDragDecoration(Lhd/l;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhd/l;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Landroidx/compose/foundation/draganddrop/DragAndDropSourceNode;->drawDragDecoration:Lhd/l;

    .line 2
    .line 3
    return-void
.end method

.method public final setTransferData(Lhd/l;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhd/l;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Landroidx/compose/foundation/draganddrop/DragAndDropSourceNode;->transferData:Lhd/l;

    .line 2
    .line 3
    return-void
.end method
