.class final Landroidx/compose/ui/input/rotary/RotaryInputElement;
.super Landroidx/compose/ui/node/ModifierNodeElement;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/compose/ui/node/ModifierNodeElement<",
        "Landroidx/compose/ui/input/rotary/RotaryInputNode;",
        ">;"
    }
.end annotation


# instance fields
.field private final onPreRotaryScrollEvent:Lhd/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhd/l;"
        }
    .end annotation
.end field

.field private final onRotaryScrollEvent:Lhd/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhd/l;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lhd/l;Lhd/l;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhd/l;",
            "Lhd/l;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Landroidx/compose/ui/node/ModifierNodeElement;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/compose/ui/input/rotary/RotaryInputElement;->onRotaryScrollEvent:Lhd/l;

    .line 5
    .line 6
    iput-object p2, p0, Landroidx/compose/ui/input/rotary/RotaryInputElement;->onPreRotaryScrollEvent:Lhd/l;

    .line 7
    .line 8
    return-void
.end method

.method public static synthetic copy$default(Landroidx/compose/ui/input/rotary/RotaryInputElement;Lhd/l;Lhd/l;ILjava/lang/Object;)Landroidx/compose/ui/input/rotary/RotaryInputElement;
    .locals 0

    .line 1
    and-int/lit8 p4, p3, 0x1

    .line 2
    .line 3
    if-eqz p4, :cond_0

    .line 4
    .line 5
    iget-object p1, p0, Landroidx/compose/ui/input/rotary/RotaryInputElement;->onRotaryScrollEvent:Lhd/l;

    .line 6
    .line 7
    :cond_0
    and-int/lit8 p3, p3, 0x2

    .line 8
    .line 9
    if-eqz p3, :cond_1

    .line 10
    .line 11
    iget-object p2, p0, Landroidx/compose/ui/input/rotary/RotaryInputElement;->onPreRotaryScrollEvent:Lhd/l;

    .line 12
    .line 13
    :cond_1
    invoke-virtual {p0, p1, p2}, Landroidx/compose/ui/input/rotary/RotaryInputElement;->copy(Lhd/l;Lhd/l;)Landroidx/compose/ui/input/rotary/RotaryInputElement;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
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
    iget-object v0, p0, Landroidx/compose/ui/input/rotary/RotaryInputElement;->onRotaryScrollEvent:Lhd/l;

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
    iget-object v0, p0, Landroidx/compose/ui/input/rotary/RotaryInputElement;->onPreRotaryScrollEvent:Lhd/l;

    .line 2
    .line 3
    return-object v0
.end method

.method public final copy(Lhd/l;Lhd/l;)Landroidx/compose/ui/input/rotary/RotaryInputElement;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhd/l;",
            "Lhd/l;",
            ")",
            "Landroidx/compose/ui/input/rotary/RotaryInputElement;"
        }
    .end annotation

    .line 1
    new-instance v0, Landroidx/compose/ui/input/rotary/RotaryInputElement;

    .line 2
    .line 3
    invoke-direct {v0, p1, p2}, Landroidx/compose/ui/input/rotary/RotaryInputElement;-><init>(Lhd/l;Lhd/l;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public bridge synthetic create()Landroidx/compose/ui/Modifier$Node;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/compose/ui/input/rotary/RotaryInputElement;->create()Landroidx/compose/ui/input/rotary/RotaryInputNode;

    move-result-object v0

    return-object v0
.end method

.method public create()Landroidx/compose/ui/input/rotary/RotaryInputNode;
    .locals 3

    .line 2
    new-instance v0, Landroidx/compose/ui/input/rotary/RotaryInputNode;

    iget-object v1, p0, Landroidx/compose/ui/input/rotary/RotaryInputElement;->onRotaryScrollEvent:Lhd/l;

    iget-object v2, p0, Landroidx/compose/ui/input/rotary/RotaryInputElement;->onPreRotaryScrollEvent:Lhd/l;

    invoke-direct {v0, v1, v2}, Landroidx/compose/ui/input/rotary/RotaryInputNode;-><init>(Lhd/l;Lhd/l;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Landroidx/compose/ui/input/rotary/RotaryInputElement;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Landroidx/compose/ui/input/rotary/RotaryInputElement;

    iget-object v1, p0, Landroidx/compose/ui/input/rotary/RotaryInputElement;->onRotaryScrollEvent:Lhd/l;

    iget-object v3, p1, Landroidx/compose/ui/input/rotary/RotaryInputElement;->onRotaryScrollEvent:Lhd/l;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Landroidx/compose/ui/input/rotary/RotaryInputElement;->onPreRotaryScrollEvent:Lhd/l;

    iget-object p1, p1, Landroidx/compose/ui/input/rotary/RotaryInputElement;->onPreRotaryScrollEvent:Lhd/l;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public final getOnPreRotaryScrollEvent()Lhd/l;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lhd/l;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/input/rotary/RotaryInputElement;->onPreRotaryScrollEvent:Lhd/l;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getOnRotaryScrollEvent()Lhd/l;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lhd/l;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/input/rotary/RotaryInputElement;->onRotaryScrollEvent:Lhd/l;

    .line 2
    .line 3
    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Landroidx/compose/ui/input/rotary/RotaryInputElement;->onRotaryScrollEvent:Lhd/l;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Landroidx/compose/ui/input/rotary/RotaryInputElement;->onPreRotaryScrollEvent:Lhd/l;

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    return v0
.end method

.method public inspectableProperties(Landroidx/compose/ui/platform/InspectorInfo;)V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/input/rotary/RotaryInputElement;->onRotaryScrollEvent:Lhd/l;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const-string/jumbo v1, "onRotaryScrollEvent"

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1, v1}, Landroidx/compose/ui/platform/InspectorInfo;->setName(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, Landroidx/compose/ui/platform/InspectorInfo;->getProperties()Landroidx/compose/ui/platform/ValueElementSequence;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    invoke-virtual {v2, v1, v0}, Landroidx/compose/ui/platform/ValueElementSequence;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    :cond_0
    iget-object v0, p0, Landroidx/compose/ui/input/rotary/RotaryInputElement;->onPreRotaryScrollEvent:Lhd/l;

    .line 19
    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    const-string/jumbo v1, "onPreRotaryScrollEvent"

    .line 23
    .line 24
    .line 25
    invoke-virtual {p1, v1}, Landroidx/compose/ui/platform/InspectorInfo;->setName(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p1}, Landroidx/compose/ui/platform/InspectorInfo;->getProperties()Landroidx/compose/ui/platform/ValueElementSequence;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-virtual {p1, v1, v0}, Landroidx/compose/ui/platform/ValueElementSequence;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    :cond_1
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "RotaryInputElement(onRotaryScrollEvent="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/compose/ui/input/rotary/RotaryInputElement;->onRotaryScrollEvent:Lhd/l;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", onPreRotaryScrollEvent="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/compose/ui/input/rotary/RotaryInputElement;->onPreRotaryScrollEvent:Lhd/l;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic update(Landroidx/compose/ui/Modifier$Node;)V
    .locals 0

    .line 1
    check-cast p1, Landroidx/compose/ui/input/rotary/RotaryInputNode;

    invoke-virtual {p0, p1}, Landroidx/compose/ui/input/rotary/RotaryInputElement;->update(Landroidx/compose/ui/input/rotary/RotaryInputNode;)V

    return-void
.end method

.method public update(Landroidx/compose/ui/input/rotary/RotaryInputNode;)V
    .locals 1

    .line 2
    iget-object v0, p0, Landroidx/compose/ui/input/rotary/RotaryInputElement;->onRotaryScrollEvent:Lhd/l;

    invoke-virtual {p1, v0}, Landroidx/compose/ui/input/rotary/RotaryInputNode;->setOnEvent(Lhd/l;)V

    .line 3
    iget-object v0, p0, Landroidx/compose/ui/input/rotary/RotaryInputElement;->onPreRotaryScrollEvent:Lhd/l;

    invoke-virtual {p1, v0}, Landroidx/compose/ui/input/rotary/RotaryInputNode;->setOnPreEvent(Lhd/l;)V

    return-void
.end method
