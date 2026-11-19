.class final Landroidx/compose/foundation/draganddrop/DragAndDropSourceWithDefaultShadowElement;
.super Landroidx/compose/ui/node/ModifierNodeElement;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/compose/ui/node/ModifierNodeElement<",
        "Landroidx/compose/foundation/draganddrop/DragSourceNodeWithDefaultPainter;",
        ">;"
    }
.end annotation


# instance fields
.field private detectDragStart:Lhd/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhd/p;"
        }
    .end annotation
.end field

.field private transferData:Lhd/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhd/l;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lhd/p;Lhd/l;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhd/p;",
            "Lhd/l;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Landroidx/compose/ui/node/ModifierNodeElement;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/compose/foundation/draganddrop/DragAndDropSourceWithDefaultShadowElement;->detectDragStart:Lhd/p;

    .line 5
    .line 6
    iput-object p2, p0, Landroidx/compose/foundation/draganddrop/DragAndDropSourceWithDefaultShadowElement;->transferData:Lhd/l;

    .line 7
    .line 8
    return-void
.end method

.method public static synthetic copy$default(Landroidx/compose/foundation/draganddrop/DragAndDropSourceWithDefaultShadowElement;Lhd/p;Lhd/l;ILjava/lang/Object;)Landroidx/compose/foundation/draganddrop/DragAndDropSourceWithDefaultShadowElement;
    .locals 0

    .line 1
    and-int/lit8 p4, p3, 0x1

    .line 2
    .line 3
    if-eqz p4, :cond_0

    .line 4
    .line 5
    iget-object p1, p0, Landroidx/compose/foundation/draganddrop/DragAndDropSourceWithDefaultShadowElement;->detectDragStart:Lhd/p;

    .line 6
    .line 7
    :cond_0
    and-int/lit8 p3, p3, 0x2

    .line 8
    .line 9
    if-eqz p3, :cond_1

    .line 10
    .line 11
    iget-object p2, p0, Landroidx/compose/foundation/draganddrop/DragAndDropSourceWithDefaultShadowElement;->transferData:Lhd/l;

    .line 12
    .line 13
    :cond_1
    invoke-virtual {p0, p1, p2}, Landroidx/compose/foundation/draganddrop/DragAndDropSourceWithDefaultShadowElement;->copy(Lhd/p;Lhd/l;)Landroidx/compose/foundation/draganddrop/DragAndDropSourceWithDefaultShadowElement;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method


# virtual methods
.method public final component1()Lhd/p;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lhd/p;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/draganddrop/DragAndDropSourceWithDefaultShadowElement;->detectDragStart:Lhd/p;

    .line 2
    .line 3
    return-object v0
.end method

.method public final component2()Lhd/l;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lhd/l;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/draganddrop/DragAndDropSourceWithDefaultShadowElement;->transferData:Lhd/l;

    .line 2
    .line 3
    return-object v0
.end method

.method public final copy(Lhd/p;Lhd/l;)Landroidx/compose/foundation/draganddrop/DragAndDropSourceWithDefaultShadowElement;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhd/p;",
            "Lhd/l;",
            ")",
            "Landroidx/compose/foundation/draganddrop/DragAndDropSourceWithDefaultShadowElement;"
        }
    .end annotation

    .line 1
    new-instance v0, Landroidx/compose/foundation/draganddrop/DragAndDropSourceWithDefaultShadowElement;

    .line 2
    .line 3
    invoke-direct {v0, p1, p2}, Landroidx/compose/foundation/draganddrop/DragAndDropSourceWithDefaultShadowElement;-><init>(Lhd/p;Lhd/l;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public create()Landroidx/compose/foundation/draganddrop/DragSourceNodeWithDefaultPainter;
    .locals 3

    .line 2
    new-instance v0, Landroidx/compose/foundation/draganddrop/DragSourceNodeWithDefaultPainter;

    .line 3
    iget-object v1, p0, Landroidx/compose/foundation/draganddrop/DragAndDropSourceWithDefaultShadowElement;->detectDragStart:Lhd/p;

    .line 4
    iget-object v2, p0, Landroidx/compose/foundation/draganddrop/DragAndDropSourceWithDefaultShadowElement;->transferData:Lhd/l;

    .line 5
    invoke-direct {v0, v1, v2}, Landroidx/compose/foundation/draganddrop/DragSourceNodeWithDefaultPainter;-><init>(Lhd/p;Lhd/l;)V

    return-object v0
.end method

.method public bridge synthetic create()Landroidx/compose/ui/Modifier$Node;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/compose/foundation/draganddrop/DragAndDropSourceWithDefaultShadowElement;->create()Landroidx/compose/foundation/draganddrop/DragSourceNodeWithDefaultPainter;

    move-result-object v0

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Landroidx/compose/foundation/draganddrop/DragAndDropSourceWithDefaultShadowElement;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Landroidx/compose/foundation/draganddrop/DragAndDropSourceWithDefaultShadowElement;

    iget-object v1, p0, Landroidx/compose/foundation/draganddrop/DragAndDropSourceWithDefaultShadowElement;->detectDragStart:Lhd/p;

    iget-object v3, p1, Landroidx/compose/foundation/draganddrop/DragAndDropSourceWithDefaultShadowElement;->detectDragStart:Lhd/p;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Landroidx/compose/foundation/draganddrop/DragAndDropSourceWithDefaultShadowElement;->transferData:Lhd/l;

    iget-object p1, p1, Landroidx/compose/foundation/draganddrop/DragAndDropSourceWithDefaultShadowElement;->transferData:Lhd/l;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public final getDetectDragStart()Lhd/p;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lhd/p;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/draganddrop/DragAndDropSourceWithDefaultShadowElement;->detectDragStart:Lhd/p;

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
    iget-object v0, p0, Landroidx/compose/foundation/draganddrop/DragAndDropSourceWithDefaultShadowElement;->transferData:Lhd/l;

    .line 2
    .line 3
    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Landroidx/compose/foundation/draganddrop/DragAndDropSourceWithDefaultShadowElement;->detectDragStart:Lhd/p;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Landroidx/compose/foundation/draganddrop/DragAndDropSourceWithDefaultShadowElement;->transferData:Lhd/l;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public inspectableProperties(Landroidx/compose/ui/platform/InspectorInfo;)V
    .locals 3

    .line 1
    const-string v0, "dragSourceWithDefaultPainter"

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Landroidx/compose/ui/platform/InspectorInfo;->setName(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Landroidx/compose/ui/platform/InspectorInfo;->getProperties()Landroidx/compose/ui/platform/ValueElementSequence;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    const-string v1, "detectDragStart"

    .line 11
    .line 12
    iget-object v2, p0, Landroidx/compose/foundation/draganddrop/DragAndDropSourceWithDefaultShadowElement;->detectDragStart:Lhd/p;

    .line 13
    .line 14
    invoke-virtual {v0, v1, v2}, Landroidx/compose/ui/platform/ValueElementSequence;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1}, Landroidx/compose/ui/platform/InspectorInfo;->getProperties()Landroidx/compose/ui/platform/ValueElementSequence;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    const-string v0, "transferData"

    .line 22
    .line 23
    iget-object v1, p0, Landroidx/compose/foundation/draganddrop/DragAndDropSourceWithDefaultShadowElement;->transferData:Lhd/l;

    .line 24
    .line 25
    invoke-virtual {p1, v0, v1}, Landroidx/compose/ui/platform/ValueElementSequence;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
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
    iput-object p1, p0, Landroidx/compose/foundation/draganddrop/DragAndDropSourceWithDefaultShadowElement;->detectDragStart:Lhd/p;

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
    iput-object p1, p0, Landroidx/compose/foundation/draganddrop/DragAndDropSourceWithDefaultShadowElement;->transferData:Lhd/l;

    .line 2
    .line 3
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "DragAndDropSourceWithDefaultShadowElement(detectDragStart="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/compose/foundation/draganddrop/DragAndDropSourceWithDefaultShadowElement;->detectDragStart:Lhd/p;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", transferData="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/compose/foundation/draganddrop/DragAndDropSourceWithDefaultShadowElement;->transferData:Lhd/l;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public update(Landroidx/compose/foundation/draganddrop/DragSourceNodeWithDefaultPainter;)V
    .locals 1

    .line 2
    iget-object v0, p0, Landroidx/compose/foundation/draganddrop/DragAndDropSourceWithDefaultShadowElement;->detectDragStart:Lhd/p;

    invoke-virtual {p1, v0}, Landroidx/compose/foundation/draganddrop/DragSourceNodeWithDefaultPainter;->setDetectDragStart(Lhd/p;)V

    .line 3
    iget-object v0, p0, Landroidx/compose/foundation/draganddrop/DragAndDropSourceWithDefaultShadowElement;->transferData:Lhd/l;

    invoke-virtual {p1, v0}, Landroidx/compose/foundation/draganddrop/DragSourceNodeWithDefaultPainter;->setTransferData(Lhd/l;)V

    return-void
.end method

.method public bridge synthetic update(Landroidx/compose/ui/Modifier$Node;)V
    .locals 0

    .line 1
    check-cast p1, Landroidx/compose/foundation/draganddrop/DragSourceNodeWithDefaultPainter;

    invoke-virtual {p0, p1}, Landroidx/compose/foundation/draganddrop/DragAndDropSourceWithDefaultShadowElement;->update(Landroidx/compose/foundation/draganddrop/DragSourceNodeWithDefaultPainter;)V

    return-void
.end method
