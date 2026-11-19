.class final Landroidx/compose/ui/layout/LayoutElement;
.super Landroidx/compose/ui/node/ModifierNodeElement;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/compose/ui/node/ModifierNodeElement<",
        "Landroidx/compose/ui/layout/LayoutModifierImpl;",
        ">;"
    }
.end annotation


# instance fields
.field private final measure:Lhd/q;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhd/q;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lhd/q;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhd/q;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Landroidx/compose/ui/node/ModifierNodeElement;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/compose/ui/layout/LayoutElement;->measure:Lhd/q;

    .line 5
    .line 6
    return-void
.end method

.method public static synthetic copy$default(Landroidx/compose/ui/layout/LayoutElement;Lhd/q;ILjava/lang/Object;)Landroidx/compose/ui/layout/LayoutElement;
    .locals 0

    .line 1
    and-int/lit8 p2, p2, 0x1

    .line 2
    .line 3
    if-eqz p2, :cond_0

    .line 4
    .line 5
    iget-object p1, p0, Landroidx/compose/ui/layout/LayoutElement;->measure:Lhd/q;

    .line 6
    .line 7
    :cond_0
    invoke-virtual {p0, p1}, Landroidx/compose/ui/layout/LayoutElement;->copy(Lhd/q;)Landroidx/compose/ui/layout/LayoutElement;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method


# virtual methods
.method public final component1()Lhd/q;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lhd/q;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/layout/LayoutElement;->measure:Lhd/q;

    .line 2
    .line 3
    return-object v0
.end method

.method public final copy(Lhd/q;)Landroidx/compose/ui/layout/LayoutElement;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhd/q;",
            ")",
            "Landroidx/compose/ui/layout/LayoutElement;"
        }
    .end annotation

    .line 1
    new-instance v0, Landroidx/compose/ui/layout/LayoutElement;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Landroidx/compose/ui/layout/LayoutElement;-><init>(Lhd/q;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public bridge synthetic create()Landroidx/compose/ui/Modifier$Node;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/compose/ui/layout/LayoutElement;->create()Landroidx/compose/ui/layout/LayoutModifierImpl;

    move-result-object v0

    return-object v0
.end method

.method public create()Landroidx/compose/ui/layout/LayoutModifierImpl;
    .locals 2

    .line 2
    new-instance v0, Landroidx/compose/ui/layout/LayoutModifierImpl;

    iget-object v1, p0, Landroidx/compose/ui/layout/LayoutElement;->measure:Lhd/q;

    invoke-direct {v0, v1}, Landroidx/compose/ui/layout/LayoutModifierImpl;-><init>(Lhd/q;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Landroidx/compose/ui/layout/LayoutElement;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Landroidx/compose/ui/layout/LayoutElement;

    iget-object v1, p0, Landroidx/compose/ui/layout/LayoutElement;->measure:Lhd/q;

    iget-object p1, p1, Landroidx/compose/ui/layout/LayoutElement;->measure:Lhd/q;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public final getMeasure()Lhd/q;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lhd/q;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/layout/LayoutElement;->measure:Lhd/q;

    .line 2
    .line 3
    return-object v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/layout/LayoutElement;->measure:Lhd/q;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public inspectableProperties(Landroidx/compose/ui/platform/InspectorInfo;)V
    .locals 2

    .line 1
    const-string v0, "layout"

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
    move-result-object p1

    .line 10
    const-string v0, "measure"

    .line 11
    .line 12
    iget-object v1, p0, Landroidx/compose/ui/layout/LayoutElement;->measure:Lhd/q;

    .line 13
    .line 14
    invoke-virtual {p1, v0, v1}, Landroidx/compose/ui/platform/ValueElementSequence;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "LayoutElement(measure="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/compose/ui/layout/LayoutElement;->measure:Lhd/q;

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
    check-cast p1, Landroidx/compose/ui/layout/LayoutModifierImpl;

    invoke-virtual {p0, p1}, Landroidx/compose/ui/layout/LayoutElement;->update(Landroidx/compose/ui/layout/LayoutModifierImpl;)V

    return-void
.end method

.method public update(Landroidx/compose/ui/layout/LayoutModifierImpl;)V
    .locals 1

    .line 2
    iget-object v0, p0, Landroidx/compose/ui/layout/LayoutElement;->measure:Lhd/q;

    invoke-virtual {p1, v0}, Landroidx/compose/ui/layout/LayoutModifierImpl;->setMeasureBlock(Lhd/q;)V

    return-void
.end method
