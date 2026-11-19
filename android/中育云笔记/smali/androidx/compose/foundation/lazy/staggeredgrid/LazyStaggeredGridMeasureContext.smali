.class public final Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private final afterContentPadding:I

.field private final approachLayoutInfo:Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLayoutInfo;

.field private final beforeContentPadding:I

.field private final constraints:J

.field private final contentOffset:J

.field private final coroutineScope:Lsd/i0;

.field private final graphicsContext:Landroidx/compose/ui/graphics/GraphicsContext;

.field private final isInLookaheadScope:Z

.field private final isLookingAhead:Z

.field private final isVertical:Z

.field private final itemProvider:Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemProvider;

.field private final laneCount:I

.field private final laneInfo:Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo;

.field private final mainAxisAvailableSize:I

.field private final mainAxisSpacing:I

.field private final measureScope:Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;

.field private final measuredItemProvider:Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureProvider;

.field private final pinnedItems:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private final resolvedSlots:Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSlots;

.field private final reverseLayout:Z

.field private final state:Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;Ljava/util/List;Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemProvider;Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSlots;JZLandroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;IJIIZILsd/i0;ZZLandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLayoutInfo;Landroidx/compose/ui/graphics/GraphicsContext;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;",
            "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemProvider;",
            "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSlots;",
            "JZ",
            "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;",
            "IJIIZI",
            "Lsd/i0;",
            "ZZ",
            "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLayoutInfo;",
            "Landroidx/compose/ui/graphics/GraphicsContext;",
            ")V"
        }
    .end annotation

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->state:Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;

    .line 4
    iput-object p2, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->pinnedItems:Ljava/util/List;

    .line 5
    iput-object p3, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->itemProvider:Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemProvider;

    .line 6
    iput-object p4, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->resolvedSlots:Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSlots;

    .line 7
    iput-wide p5, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->constraints:J

    .line 8
    iput-boolean p7, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->isVertical:Z

    .line 9
    iput-object p8, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->measureScope:Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;

    .line 10
    iput p9, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->mainAxisAvailableSize:I

    .line 11
    iput-wide p10, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->contentOffset:J

    .line 12
    iput p12, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->beforeContentPadding:I

    .line 13
    iput p13, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->afterContentPadding:I

    .line 14
    iput-boolean p14, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->reverseLayout:Z

    .line 15
    iput p15, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->mainAxisSpacing:I

    move-object/from16 p2, p16

    .line 16
    iput-object p2, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->coroutineScope:Lsd/i0;

    move/from16 p2, p17

    .line 17
    iput-boolean p2, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->isInLookaheadScope:Z

    move/from16 p2, p18

    .line 18
    iput-boolean p2, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->isLookingAhead:Z

    move-object/from16 p2, p19

    .line 19
    iput-object p2, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->approachLayoutInfo:Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLayoutInfo;

    move-object/from16 p2, p20

    .line 20
    iput-object p2, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->graphicsContext:Landroidx/compose/ui/graphics/GraphicsContext;

    .line 21
    new-instance p9, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext$measuredItemProvider$1;

    move-object p10, p0

    move-object p12, p3

    move-object p14, p4

    move p11, p7

    move-object p13, p8

    invoke-direct/range {p9 .. p14}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext$measuredItemProvider$1;-><init>(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;ZLandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemProvider;Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSlots;)V

    iput-object p9, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->measuredItemProvider:Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureProvider;

    .line 22
    invoke-virtual {p1}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->getLaneInfo$foundation_release()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo;

    move-result-object p1

    iput-object p1, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->laneInfo:Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo;

    .line 23
    invoke-virtual {p4}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSlots;->getSizes()[I

    move-result-object p1

    array-length p1, p1

    iput p1, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->laneCount:I

    return-void
.end method

.method public synthetic constructor <init>(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;Ljava/util/List;Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemProvider;Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSlots;JZLandroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;IJIIZILsd/i0;ZZLandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLayoutInfo;Landroidx/compose/ui/graphics/GraphicsContext;Lkotlin/jvm/internal/n;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p20}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;-><init>(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;Ljava/util/List;Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemProvider;Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSlots;JZLandroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;IJIIZILsd/i0;ZZLandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLayoutInfo;Landroidx/compose/ui/graphics/GraphicsContext;)V

    return-void
.end method


# virtual methods
.method public final getAfterContentPadding()I
    .locals 1

    .line 1
    iget v0, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->afterContentPadding:I

    .line 2
    .line 3
    return v0
.end method

.method public final getApproachLayoutInfo()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLayoutInfo;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->approachLayoutInfo:Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLayoutInfo;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getBeforeContentPadding()I
    .locals 1

    .line 1
    iget v0, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->beforeContentPadding:I

    .line 2
    .line 3
    return v0
.end method

.method public final getConstraints-msEJaDk()J
    .locals 2

    .line 1
    iget-wide v0, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->constraints:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final getContentOffset-nOcc-ac()J
    .locals 2

    .line 1
    iget-wide v0, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->contentOffset:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final getCoroutineScope()Lsd/i0;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->coroutineScope:Lsd/i0;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getGraphicsContext()Landroidx/compose/ui/graphics/GraphicsContext;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->graphicsContext:Landroidx/compose/ui/graphics/GraphicsContext;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getItemProvider()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemProvider;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->itemProvider:Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemProvider;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getLaneCount()I
    .locals 1

    .line 1
    iget v0, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->laneCount:I

    .line 2
    .line 3
    return v0
.end method

.method public final getLaneInfo()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->laneInfo:Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getLaneInfo-SZVOQXA(J)I
    .locals 2

    const-wide v0, 0xffffffffL

    and-long/2addr v0, p1

    long-to-int v0, v0

    const/16 v1, 0x20

    shr-long/2addr p1, v1

    long-to-int p1, p1

    sub-int/2addr v0, p1

    const/4 p2, 0x1

    if-eq v0, p2, :cond_0

    const/4 p1, -0x2

    :cond_0
    return p1
.end method

.method public final getMainAxisAvailableSize()I
    .locals 1

    .line 1
    iget v0, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->mainAxisAvailableSize:I

    .line 2
    .line 3
    return v0
.end method

.method public final getMainAxisSpacing()I
    .locals 1

    .line 1
    iget v0, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->mainAxisSpacing:I

    .line 2
    .line 3
    return v0
.end method

.method public final getMeasureScope()Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->measureScope:Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getMeasuredItemProvider()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureProvider;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->measuredItemProvider:Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureProvider;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getPinnedItems()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->pinnedItems:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getResolvedSlots()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSlots;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->resolvedSlots:Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSlots;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getReverseLayout()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->reverseLayout:Z

    .line 2
    .line 3
    return v0
.end method

.method public final getSpanRange-lOCCd4c(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemProvider;II)J
    .locals 0

    .line 1
    invoke-interface {p1}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemProvider;->getSpanProvider()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSpanProvider;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1, p2}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSpanProvider;->isFullSpan(I)Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    iget p2, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->laneCount:I

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 p2, 0x1

    .line 15
    :goto_0
    if-eqz p1, :cond_1

    .line 16
    .line 17
    const/4 p3, 0x0

    .line 18
    :cond_1
    invoke-static {p3, p2}, Landroidx/compose/foundation/lazy/staggeredgrid/SpanRange;->constructor-impl(II)J

    .line 19
    .line 20
    .line 21
    move-result-wide p1

    .line 22
    return-wide p1
.end method

.method public final getState()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->state:Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;

    .line 2
    .line 3
    return-object v0
.end method

.method public final isFullSpan(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemProvider;I)Z
    .locals 0

    .line 1
    invoke-interface {p1}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemProvider;->getSpanProvider()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSpanProvider;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1, p2}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSpanProvider;->isFullSpan(I)Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    return p1
.end method

.method public final isFullSpan-SZVOQXA(J)Z
    .locals 2

    const-wide v0, 0xffffffffL

    and-long/2addr v0, p1

    long-to-int v0, v0

    const/16 v1, 0x20

    shr-long/2addr p1, v1

    long-to-int p1, p1

    sub-int/2addr v0, p1

    const/4 p1, 0x1

    if-eq v0, p1, :cond_0

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final isInLookaheadScope()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->isInLookaheadScope:Z

    .line 2
    .line 3
    return v0
.end method

.method public final isLookingAhead()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->isLookingAhead:Z

    .line 2
    .line 3
    return v0
.end method

.method public final isVertical()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->isVertical:Z

    .line 2
    .line 3
    return v0
.end method
