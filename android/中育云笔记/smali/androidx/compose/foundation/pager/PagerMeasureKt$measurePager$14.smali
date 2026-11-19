.class final Landroidx/compose/foundation/pager/PagerMeasureKt$measurePager$14;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lhd/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/pager/PagerMeasureKt;->measurePager-bmk8ZPk(Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;ILandroidx/compose/foundation/pager/PagerLazyLayoutItemProvider;IIIIIIJLandroidx/compose/foundation/gestures/Orientation;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/ui/Alignment$Horizontal;ZJIILjava/util/List;Landroidx/compose/foundation/gestures/snapping/SnapPosition;Landroidx/compose/runtime/MutableState;Lsd/i0;Lhd/q;)Landroidx/compose/foundation/pager/PagerMeasureResult;
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
.field final synthetic $placementScopeInvalidator:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Lqc/q;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $positionedPages:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroidx/compose/foundation/pager/MeasuredPage;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroidx/compose/runtime/MutableState;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/MutableState<",
            "Lqc/q;",
            ">;",
            "Ljava/util/List<",
            "Landroidx/compose/foundation/pager/MeasuredPage;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Landroidx/compose/foundation/pager/PagerMeasureKt$measurePager$14;->$placementScopeInvalidator:Landroidx/compose/runtime/MutableState;

    iput-object p2, p0, Landroidx/compose/foundation/pager/PagerMeasureKt$measurePager$14;->$positionedPages:Ljava/util/List;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Landroidx/compose/ui/layout/Placeable$PlacementScope;

    invoke-virtual {p0, p1}, Landroidx/compose/foundation/pager/PagerMeasureKt$measurePager$14;->invoke(Landroidx/compose/ui/layout/Placeable$PlacementScope;)V

    sget-object p1, Lqc/q;->a:Lqc/q;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/ui/layout/Placeable$PlacementScope;)V
    .locals 2

    .line 2
    new-instance v0, Landroidx/compose/foundation/pager/PagerMeasureKt$measurePager$14$1;

    iget-object v1, p0, Landroidx/compose/foundation/pager/PagerMeasureKt$measurePager$14;->$positionedPages:Ljava/util/List;

    invoke-direct {v0, v1}, Landroidx/compose/foundation/pager/PagerMeasureKt$measurePager$14$1;-><init>(Ljava/util/List;)V

    invoke-virtual {p1, v0}, Landroidx/compose/ui/layout/Placeable$PlacementScope;->withMotionFrameOfReferencePlacement(Lhd/l;)V

    .line 3
    iget-object p1, p0, Landroidx/compose/foundation/pager/PagerMeasureKt$measurePager$14;->$placementScopeInvalidator:Landroidx/compose/runtime/MutableState;

    invoke-static {p1}, Landroidx/compose/foundation/lazy/layout/ObservableScopeInvalidator;->attachToScope-impl(Landroidx/compose/runtime/MutableState;)V

    return-void
.end method
