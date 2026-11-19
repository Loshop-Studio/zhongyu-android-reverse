.class final Landroidx/compose/animation/SharedBoundsNode$approachPlace$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lhd/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/animation/SharedBoundsNode;->approachPlace(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Placeable;)Landroidx/compose/ui/layout/MeasureResult;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lhd/l;"
    }
.end annotation


# instance fields
.field final synthetic $placeable:Landroidx/compose/ui/layout/Placeable;

.field final synthetic this$0:Landroidx/compose/animation/SharedBoundsNode;


# direct methods
.method public constructor <init>(Landroidx/compose/animation/SharedBoundsNode;Landroidx/compose/ui/layout/Placeable;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/animation/SharedBoundsNode$approachPlace$1;->this$0:Landroidx/compose/animation/SharedBoundsNode;

    iput-object p2, p0, Landroidx/compose/animation/SharedBoundsNode$approachPlace$1;->$placeable:Landroidx/compose/ui/layout/Placeable;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Landroidx/compose/ui/layout/Placeable$PlacementScope;

    invoke-virtual {p0, p1}, Landroidx/compose/animation/SharedBoundsNode$approachPlace$1;->invoke(Landroidx/compose/ui/layout/Placeable$PlacementScope;)V

    sget-object p1, Lqc/q;->a:Lqc/q;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/ui/layout/Placeable$PlacementScope;)V
    .locals 9

    .line 2
    invoke-virtual {p1}, Landroidx/compose/ui/layout/Placeable$PlacementScope;->getCoordinates()Landroidx/compose/ui/layout/LayoutCoordinates;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Landroidx/compose/animation/SharedBoundsNode$approachPlace$1;->this$0:Landroidx/compose/animation/SharedBoundsNode;

    invoke-static {v1, v0}, Landroidx/compose/animation/SharedBoundsNode;->access$updateCurrentBounds(Landroidx/compose/animation/SharedBoundsNode;Landroidx/compose/ui/layout/LayoutCoordinates;)V

    .line 3
    :cond_0
    iget-object v3, p0, Landroidx/compose/animation/SharedBoundsNode$approachPlace$1;->$placeable:Landroidx/compose/ui/layout/Placeable;

    const/4 v7, 0x4

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v2, p1

    invoke-static/range {v2 .. v8}, Landroidx/compose/ui/layout/Placeable$PlacementScope;->place$default(Landroidx/compose/ui/layout/Placeable$PlacementScope;Landroidx/compose/ui/layout/Placeable;IIFILjava/lang/Object;)V

    return-void
.end method
