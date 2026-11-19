.class final Landroidx/compose/ui/layout/ApproachLayoutModifierNodeImpl;
.super Landroidx/compose/ui/Modifier$Node;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/ui/layout/ApproachLayoutModifierNode;


# instance fields
.field private isMeasurementApproachInProgress:Lhd/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhd/l;"
        }
    .end annotation
.end field

.field private isPlacementApproachInProgress:Lhd/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhd/p;"
        }
    .end annotation
.end field

.field private measureBlock:Lhd/q;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhd/q;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lhd/q;Lhd/l;Lhd/p;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhd/q;",
            "Lhd/l;",
            "Lhd/p;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Landroidx/compose/ui/Modifier$Node;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/compose/ui/layout/ApproachLayoutModifierNodeImpl;->measureBlock:Lhd/q;

    .line 5
    .line 6
    iput-object p2, p0, Landroidx/compose/ui/layout/ApproachLayoutModifierNodeImpl;->isMeasurementApproachInProgress:Lhd/l;

    .line 7
    .line 8
    iput-object p3, p0, Landroidx/compose/ui/layout/ApproachLayoutModifierNodeImpl;->isPlacementApproachInProgress:Lhd/p;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public approachMeasure-3p2s80s(Landroidx/compose/ui/layout/ApproachMeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/layout/ApproachLayoutModifierNodeImpl;->measureBlock:Lhd/q;

    .line 2
    .line 3
    invoke-static {p3, p4}, Landroidx/compose/ui/unit/Constraints;->box-impl(J)Landroidx/compose/ui/unit/Constraints;

    .line 4
    .line 5
    .line 6
    move-result-object p3

    .line 7
    invoke-interface {v0, p1, p2, p3}, Lhd/q;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    check-cast p1, Landroidx/compose/ui/layout/MeasureResult;

    .line 12
    .line 13
    return-object p1
.end method

.method public final getMeasureBlock()Lhd/q;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lhd/q;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/layout/ApproachLayoutModifierNodeImpl;->measureBlock:Lhd/q;

    .line 2
    .line 3
    return-object v0
.end method

.method public final isMeasurementApproachInProgress()Lhd/l;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lhd/l;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/layout/ApproachLayoutModifierNodeImpl;->isMeasurementApproachInProgress:Lhd/l;

    .line 2
    .line 3
    return-object v0
.end method

.method public isMeasurementApproachInProgress-ozmzZPI(J)Z
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/layout/ApproachLayoutModifierNodeImpl;->isMeasurementApproachInProgress:Lhd/l;

    .line 2
    .line 3
    invoke-static {p1, p2}, Landroidx/compose/ui/unit/IntSize;->box-impl(J)Landroidx/compose/ui/unit/IntSize;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-interface {v0, p1}, Lhd/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    check-cast p1, Ljava/lang/Boolean;

    .line 12
    .line 13
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    return p1
.end method

.method public final isPlacementApproachInProgress()Lhd/p;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lhd/p;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/layout/ApproachLayoutModifierNodeImpl;->isPlacementApproachInProgress:Lhd/p;

    return-object v0
.end method

.method public isPlacementApproachInProgress(Landroidx/compose/ui/layout/Placeable$PlacementScope;Landroidx/compose/ui/layout/LayoutCoordinates;)Z
    .locals 1

    .line 2
    iget-object v0, p0, Landroidx/compose/ui/layout/ApproachLayoutModifierNodeImpl;->isPlacementApproachInProgress:Lhd/p;

    invoke-interface {v0, p1, p2}, Lhd/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    return p1
.end method

.method public final setMeasureBlock(Lhd/q;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhd/q;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Landroidx/compose/ui/layout/ApproachLayoutModifierNodeImpl;->measureBlock:Lhd/q;

    .line 2
    .line 3
    return-void
.end method

.method public final setMeasurementApproachInProgress(Lhd/l;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhd/l;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Landroidx/compose/ui/layout/ApproachLayoutModifierNodeImpl;->isMeasurementApproachInProgress:Lhd/l;

    .line 2
    .line 3
    return-void
.end method

.method public final setPlacementApproachInProgress(Lhd/p;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhd/p;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Landroidx/compose/ui/layout/ApproachLayoutModifierNodeImpl;->isPlacementApproachInProgress:Lhd/p;

    .line 2
    .line 3
    return-void
.end method
