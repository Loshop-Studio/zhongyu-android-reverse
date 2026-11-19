.class final Landroidx/compose/foundation/draganddrop/DragAndDropSourceElement;
.super Landroidx/compose/ui/node/ModifierNodeElement;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/compose/ui/node/ModifierNodeElement<",
        "Landroidx/compose/foundation/draganddrop/DragAndDropSourceNode;",
        ">;"
    }
.end annotation


# instance fields
.field private final detectDragStart:Lhd/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhd/p;"
        }
    .end annotation
.end field

.field private final drawDragDecoration:Lhd/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhd/l;"
        }
    .end annotation
.end field

.field private final transferData:Lhd/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhd/l;"
        }
    .end annotation
.end field


# direct methods
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
    invoke-direct {p0}, Landroidx/compose/ui/node/ModifierNodeElement;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/compose/foundation/draganddrop/DragAndDropSourceElement;->drawDragDecoration:Lhd/l;

    .line 5
    .line 6
    iput-object p2, p0, Landroidx/compose/foundation/draganddrop/DragAndDropSourceElement;->detectDragStart:Lhd/p;

    .line 7
    .line 8
    iput-object p3, p0, Landroidx/compose/foundation/draganddrop/DragAndDropSourceElement;->transferData:Lhd/l;

    .line 9
    .line 10
    return-void
.end method

.method public static synthetic copy$default(Landroidx/compose/foundation/draganddrop/DragAndDropSourceElement;Lhd/l;Lhd/p;Lhd/l;ILjava/lang/Object;)Landroidx/compose/foundation/draganddrop/DragAndDropSourceElement;
    .locals 0

    .line 1
    and-int/lit8 p5, p4, 0x1

    .line 2
    .line 3
    if-eqz p5, :cond_0

    .line 4
    .line 5
    iget-object p1, p0, Landroidx/compose/foundation/draganddrop/DragAndDropSourceElement;->drawDragDecoration:Lhd/l;

    .line 6
    .line 7
    :cond_0
    and-int/lit8 p5, p4, 0x2

    .line 8
    .line 9
    if-eqz p5, :cond_1

    .line 10
    .line 11
    iget-object p2, p0, Landroidx/compose/foundation/draganddrop/DragAndDropSourceElement;->detectDragStart:Lhd/p;

    .line 12
    .line 13
    :cond_1
    and-int/lit8 p4, p4, 0x4

    .line 14
    .line 15
    if-eqz p4, :cond_2

    .line 16
    .line 17
    iget-object p3, p0, Landroidx/compose/foundation/draganddrop/DragAndDropSourceElement;->transferData:Lhd/l;

    .line 18
    .line 19
    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Landroidx/compose/foundation/draganddrop/DragAndDropSourceElement;->copy(Lhd/l;Lhd/p;Lhd/l;)Landroidx/compose/foundation/draganddrop/DragAndDropSourceElement;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    return-object p0
.end method


# virtual methods
.method public final component1()Lhd/l;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lhd/l;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/draganddrop/DragAndDropSourceElement;->drawDragDecoration:Lhd/l;

    .line 2
    .line 3
    return-object v0
.end method

.method public final component2()Lhd/p;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lhd/p;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/draganddrop/DragAndDropSourceElement;->detectDragStart:Lhd/p;

    .line 2
    .line 3
    return-object v0
.end method

.method public final component3()Lhd/l;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lhd/l;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/draganddrop/DragAndDropSourceElement;->transferData:Lhd/l;

    .line 2
    .line 3
    return-object v0
.end method

.method public final copy(Lhd/l;Lhd/p;Lhd/l;)Landroidx/compose/foundation/draganddrop/DragAndDropSourceElement;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhd/l;",
            "Lhd/p;",
            "Lhd/l;",
            ")",
            "Landroidx/compose/foundation/draganddrop/DragAndDropSourceElement;"
        }
    .end annotation

    .line 1
    new-instance v0, Landroidx/compose/foundation/draganddrop/DragAndDropSourceElement;

    .line 2
    .line 3
    invoke-direct {v0, p1, p2, p3}, Landroidx/compose/foundation/draganddrop/DragAndDropSourceElement;-><init>(Lhd/l;Lhd/p;Lhd/l;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public create()Landroidx/compose/foundation/draganddrop/DragAndDropSourceNode;
    .locals 4

    .line 2
    new-instance v0, Landroidx/compose/foundation/draganddrop/DragAndDropSourceNode;

    .line 3
    iget-object v1, p0, Landroidx/compose/foundation/draganddrop/DragAndDropSourceElement;->drawDragDecoration:Lhd/l;

    .line 4
    iget-object v2, p0, Landroidx/compose/foundation/draganddrop/DragAndDropSourceElement;->detectDragStart:Lhd/p;

    .line 5
    iget-object v3, p0, Landroidx/compose/foundation/draganddrop/DragAndDropSourceElement;->transferData:Lhd/l;

    .line 6
    invoke-direct {v0, v1, v2, v3}, Landroidx/compose/foundation/draganddrop/DragAndDropSourceNode;-><init>(Lhd/l;Lhd/p;Lhd/l;)V

    return-object v0
.end method

.method public bridge synthetic create()Landroidx/compose/ui/Modifier$Node;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/compose/foundation/draganddrop/DragAndDropSourceElement;->create()Landroidx/compose/foundation/draganddrop/DragAndDropSourceNode;

    move-result-object v0

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Landroidx/compose/foundation/draganddrop/DragAndDropSourceElement;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Landroidx/compose/foundation/draganddrop/DragAndDropSourceElement;

    iget-object v1, p0, Landroidx/compose/foundation/draganddrop/DragAndDropSourceElement;->drawDragDecoration:Lhd/l;

    iget-object v3, p1, Landroidx/compose/foundation/draganddrop/DragAndDropSourceElement;->drawDragDecoration:Lhd/l;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Landroidx/compose/foundation/draganddrop/DragAndDropSourceElement;->detectDragStart:Lhd/p;

    iget-object v3, p1, Landroidx/compose/foundation/draganddrop/DragAndDropSourceElement;->detectDragStart:Lhd/p;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Landroidx/compose/foundation/draganddrop/DragAndDropSourceElement;->transferData:Lhd/l;

    iget-object p1, p1, Landroidx/compose/foundation/draganddrop/DragAndDropSourceElement;->transferData:Lhd/l;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v2

    :cond_4
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
    iget-object v0, p0, Landroidx/compose/foundation/draganddrop/DragAndDropSourceElement;->detectDragStart:Lhd/p;

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
    iget-object v0, p0, Landroidx/compose/foundation/draganddrop/DragAndDropSourceElement;->drawDragDecoration:Lhd/l;

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
    iget-object v0, p0, Landroidx/compose/foundation/draganddrop/DragAndDropSourceElement;->transferData:Lhd/l;

    .line 2
    .line 3
    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Landroidx/compose/foundation/draganddrop/DragAndDropSourceElement;->drawDragDecoration:Lhd/l;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Landroidx/compose/foundation/draganddrop/DragAndDropSourceElement;->detectDragStart:Lhd/p;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Landroidx/compose/foundation/draganddrop/DragAndDropSourceElement;->transferData:Lhd/l;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public inspectableProperties(Landroidx/compose/ui/platform/InspectorInfo;)V
    .locals 3

    .line 1
    const-string v0, "dragSource"

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
    const-string v1, "drawDragDecoration"

    .line 11
    .line 12
    iget-object v2, p0, Landroidx/compose/foundation/draganddrop/DragAndDropSourceElement;->drawDragDecoration:Lhd/l;

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
    move-result-object v0

    .line 21
    const-string v1, "detectDragStart"

    .line 22
    .line 23
    iget-object v2, p0, Landroidx/compose/foundation/draganddrop/DragAndDropSourceElement;->detectDragStart:Lhd/p;

    .line 24
    .line 25
    invoke-virtual {v0, v1, v2}, Landroidx/compose/ui/platform/ValueElementSequence;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p1}, Landroidx/compose/ui/platform/InspectorInfo;->getProperties()Landroidx/compose/ui/platform/ValueElementSequence;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    const-string v0, "transferData"

    .line 33
    .line 34
    iget-object v1, p0, Landroidx/compose/foundation/draganddrop/DragAndDropSourceElement;->transferData:Lhd/l;

    .line 35
    .line 36
    invoke-virtual {p1, v0, v1}, Landroidx/compose/ui/platform/ValueElementSequence;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "DragAndDropSourceElement(drawDragDecoration="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/compose/foundation/draganddrop/DragAndDropSourceElement;->drawDragDecoration:Lhd/l;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", detectDragStart="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/compose/foundation/draganddrop/DragAndDropSourceElement;->detectDragStart:Lhd/p;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", transferData="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/compose/foundation/draganddrop/DragAndDropSourceElement;->transferData:Lhd/l;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public update(Landroidx/compose/foundation/draganddrop/DragAndDropSourceNode;)V
    .locals 1

    .line 2
    iget-object v0, p0, Landroidx/compose/foundation/draganddrop/DragAndDropSourceElement;->drawDragDecoration:Lhd/l;

    invoke-virtual {p1, v0}, Landroidx/compose/foundation/draganddrop/DragAndDropSourceNode;->setDrawDragDecoration(Lhd/l;)V

    .line 3
    iget-object v0, p0, Landroidx/compose/foundation/draganddrop/DragAndDropSourceElement;->detectDragStart:Lhd/p;

    invoke-virtual {p1, v0}, Landroidx/compose/foundation/draganddrop/DragAndDropSourceNode;->setDetectDragStart(Lhd/p;)V

    .line 4
    iget-object v0, p0, Landroidx/compose/foundation/draganddrop/DragAndDropSourceElement;->transferData:Lhd/l;

    invoke-virtual {p1, v0}, Landroidx/compose/foundation/draganddrop/DragAndDropSourceNode;->setTransferData(Lhd/l;)V

    return-void
.end method

.method public bridge synthetic update(Landroidx/compose/ui/Modifier$Node;)V
    .locals 0

    .line 1
    check-cast p1, Landroidx/compose/foundation/draganddrop/DragAndDropSourceNode;

    invoke-virtual {p0, p1}, Landroidx/compose/foundation/draganddrop/DragAndDropSourceElement;->update(Landroidx/compose/foundation/draganddrop/DragAndDropSourceNode;)V

    return-void
.end method
