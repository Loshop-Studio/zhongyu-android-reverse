.class public final Landroidx/compose/foundation/lazy/grid/LazyGridMeasureKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00b4\u0001\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u000c\n\u0002\u0010!\n\u0002\u0008\u0003\n\u0002\u0010\u0011\n\u0002\u0008\u0004\u001a\u00dc\u0002\u0010:\u001a\u0002072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0008\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u00172\u000c\u0010\u001b\u001a\u0008\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\u001c\u001a\u00020\u00002\u000c\u0010\u001e\u001a\u0008\u0012\u0004\u0012\u00020\u00000\u001d2\u0006\u0010\u001f\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u00102\u0008\u0010\"\u001a\u0004\u0018\u00010!2\u0006\u0010$\u001a\u00020#2\u0006\u0010&\u001a\u00020%2\u0006\u0010(\u001a\u00020\'23\u0010.\u001a/\u0012\u0013\u0012\u00110\u0000\u00a2\u0006\u000c\u0008*\u0012\u0008\u0008+\u0012\u0004\u0008\u0008(,\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u000e0-0\u001d0)2\u0008\u00100\u001a\u0004\u0018\u00010/2/\u00106\u001a+\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0000\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u0002030)\u00a2\u0006\u0002\u00084\u0012\u0004\u0012\u00020501H\u0000\u00f8\u0001\u0000\u00a2\u0006\u0004\u00088\u00109\u001aH\u0010<\u001a\u0008\u0012\u0004\u0012\u00020\u001a0\u001d2\u000c\u0010\u001e\u001a\u0008\u0012\u0004\u0012\u00020\u00000\u001d2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010;\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00100)H\u0082\u0008\u00a2\u0006\u0004\u0008<\u0010=\u001aM\u0010B\u001a\u0008\u0012\u0004\u0012\u00020?0\u001d2\u0006\u0010>\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u00102\u000c\u0010@\u001a\u0008\u0012\u0004\u0012\u00020?0\u001d2\u0008\u0010A\u001a\u0004\u0018\u00010!H\u0002\u00a2\u0006\u0004\u0008B\u0010C\u001a\u0093\u0001\u0010M\u001a\u0008\u0012\u0004\u0012\u00020\u001a0L2\u000c\u0010D\u001a\u0008\u0012\u0004\u0012\u00020?0\u001d2\u000c\u0010E\u001a\u0008\u0012\u0004\u0012\u00020\u001a0\u001d2\u000c\u0010F\u001a\u0008\u0012\u0004\u0012\u00020\u001a0\u001d2\u0006\u0010G\u001a\u00020\u00002\u0006\u0010H\u001a\u00020\u00002\u0006\u0010I\u001a\u00020\u00002\u0006\u0010J\u001a\u00020\u00002\u0006\u0010K\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u0017H\u0002\u00a2\u0006\u0004\u0008M\u0010N\u001a-\u0010R\u001a\u000203\"\u0004\u0008\u0000\u0010O*\u0008\u0012\u0004\u0012\u00028\u00000L2\u000c\u0010Q\u001a\u0008\u0012\u0004\u0012\u00028\u00000PH\u0002\u00a2\u0006\u0004\u0008R\u0010S\u0082\u0002\u0007\n\u0005\u0008\u00a1\u001e0\u0001\u00a8\u0006T"
    }
    d2 = {
        "",
        "itemsCount",
        "Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLineProvider;",
        "measuredLineProvider",
        "Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItemProvider;",
        "measuredItemProvider",
        "mainAxisAvailableSize",
        "beforeContentPadding",
        "afterContentPadding",
        "spaceBetweenLines",
        "firstVisibleLineIndex",
        "firstVisibleLineScrollOffset",
        "",
        "scrollToBeConsumed",
        "Landroidx/compose/ui/unit/Constraints;",
        "constraints",
        "",
        "isVertical",
        "Landroidx/compose/foundation/layout/Arrangement$Vertical;",
        "verticalArrangement",
        "Landroidx/compose/foundation/layout/Arrangement$Horizontal;",
        "horizontalArrangement",
        "reverseLayout",
        "Landroidx/compose/ui/unit/Density;",
        "density",
        "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;",
        "Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;",
        "itemAnimator",
        "slotsPerLine",
        "",
        "pinnedItems",
        "isInLookaheadScope",
        "isLookingAhead",
        "Landroidx/compose/foundation/lazy/grid/LazyGridLayoutInfo;",
        "approachLayoutInfo",
        "Lkotlinx/coroutines/v;",
        "coroutineScope",
        "Landroidx/compose/foundation/lazy/layout/ObservableScopeInvalidator;",
        "placementScopeInvalidator",
        "Landroidx/compose/ui/graphics/GraphicsContext;",
        "graphicsContext",
        "Lkotlin/Function1;",
        "Lkotlin/ParameterName;",
        "name",
        "line",
        "Lkotlin/Pair;",
        "prefetchInfoRetriever",
        "Landroidx/compose/foundation/lazy/layout/StickyItemsPlacement;",
        "stickyItemsScrollBehavior",
        "Lkotlin/Function3;",
        "Landroidx/compose/ui/layout/Placeable$PlacementScope;",
        "Ld6/s;",
        "Lkotlin/ExtensionFunctionType;",
        "Landroidx/compose/ui/layout/MeasureResult;",
        "layout",
        "Landroidx/compose/foundation/lazy/grid/LazyGridMeasureResult;",
        "measureLazyGrid-GyuLg2I",
        "(ILandroidx/compose/foundation/lazy/grid/LazyGridMeasuredLineProvider;Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItemProvider;IIIIIIFJZLandroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;ZLandroidx/compose/ui/unit/Density;Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;ILjava/util/List;ZZLandroidx/compose/foundation/lazy/grid/LazyGridLayoutInfo;Lkotlinx/coroutines/v;Landroidx/compose/runtime/MutableState;Landroidx/compose/ui/graphics/GraphicsContext;Lr6/c;Landroidx/compose/foundation/lazy/layout/StickyItemsPlacement;Lr6/f;)Landroidx/compose/foundation/lazy/grid/LazyGridMeasureResult;",
        "measureLazyGrid",
        "filter",
        "calculateExtraItems",
        "(Ljava/util/List;Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItemProvider;Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLineProvider;Lr6/c;)Ljava/util/List;",
        "lastVisibleItemIndex",
        "Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLine;",
        "visibleLines",
        "lastApproachLayoutInfo",
        "linesRetainedForLookahead",
        "(IILandroidx/compose/foundation/lazy/grid/LazyGridMeasuredLineProvider;ZLjava/util/List;Landroidx/compose/foundation/lazy/grid/LazyGridLayoutInfo;)Ljava/util/List;",
        "lines",
        "itemsBefore",
        "itemsAfter",
        "layoutWidth",
        "layoutHeight",
        "finalMainAxisOffset",
        "maxOffset",
        "firstLineScrollOffset",
        "",
        "calculateItemsOffsets",
        "(Ljava/util/List;Ljava/util/List;Ljava/util/List;IIIIIZLandroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;ZLandroidx/compose/ui/unit/Density;)Ljava/util/List;",
        "T",
        "",
        "arr",
        "addAllFromArray",
        "(Ljava/util/List;[Ljava/lang/Object;)V",
        "foundation_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nLazyGridMeasure.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridMeasure.kt\nandroidx/compose/foundation/lazy/grid/LazyGridMeasureKt\n+ 2 InlineClassHelper.kt\nandroidx/compose/foundation/internal/InlineClassHelperKt\n+ 3 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 5 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 6 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 7 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 8 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,635:1\n467#1,3:658\n470#1,16:665\n487#1:682\n467#1,3:683\n470#1:690\n471#1,15:701\n487#1:717\n96#2,5:636\n96#2,5:641\n96#2,5:653\n50#2,5:745\n96#2,5:760\n107#2,7:765\n107#2,7:772\n54#3:646\n59#3:648\n54#3:718\n59#3:720\n85#4:647\n90#4:649\n85#4:719\n90#4:721\n26#5:650\n26#5:651\n26#5:652\n34#6,4:661\n39#6:681\n34#6,4:686\n102#6,2:691\n34#6,4:693\n39#6:699\n104#6:700\n39#6:716\n34#6,6:722\n34#6,6:728\n102#6,2:735\n34#6,4:737\n39#6:743\n104#6:744\n133#6,3:750\n34#6,6:753\n136#6:759\n52#6,6:779\n34#6,6:785\n34#6,6:791\n12474#7,2:697\n12474#7,2:741\n1#8:734\n*S KotlinDebug\n*F\n+ 1 LazyGridMeasure.kt\nandroidx/compose/foundation/lazy/grid/LazyGridMeasureKt\n*L\n290#1:658,3\n290#1:665,16\n290#1:682\n308#1:683,3\n308#1:690\n308#1:701,15\n308#1:717\n82#1:636,5\n83#1:641,5\n283#1:653,5\n562#1:745,5\n568#1:760,5\n575#1:765,7\n580#1:772,7\n107#1:646\n108#1:648\n393#1:718\n395#1:720\n107#1:647\n108#1:649\n393#1:719\n395#1:721\n137#1:650\n265#1:651\n266#1:652\n290#1:661,4\n290#1:681\n308#1:686,4\n315#1:691,2\n315#1:693,4\n315#1:699\n315#1:700\n308#1:716\n398#1:722,6\n469#1:728,6\n530#1:735,2\n530#1:737,4\n530#1:743\n530#1:744\n565#1:750,3\n565#1:753,6\n565#1:759\n608#1:779,6\n615#1:785,6\n620#1:791,6\n316#1:697,2\n530#1:741,2\n*E\n"
    }
.end annotation


# direct methods
.method private static final addAllFromArray(Ljava/util/List;[Ljava/lang/Object;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/List<",
            "TT;>;[TT;)V"
        }
    .end annotation

    .line 1
    array-length v0, p1

    .line 2
    const/4 v1, 0x0

    .line 3
    :goto_0
    if-ge v1, v0, :cond_0

    .line 4
    .line 5
    aget-object v2, p1, v1

    .line 6
    .line 7
    invoke-interface {p0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    add-int/lit8 v1, v1, 0x1

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    return-void
.end method

.method private static final calculateExtraItems(Ljava/util/List;Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItemProvider;Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLineProvider;Lr6/c;)Ljava/util/List;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;",
            "Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItemProvider;",
            "Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLineProvider;",
            "Lr6/c;",
            ")",
            "Ljava/util/List<",
            "Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-interface {p0}, Ljava/util/Collection;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v2, 0x0

    .line 7
    move v3, v2

    .line 8
    :goto_0
    if-ge v3, v0, :cond_2

    .line 9
    .line 10
    invoke-interface {p0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v4

    .line 14
    check-cast v4, Ljava/lang/Number;

    .line 15
    .line 16
    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    .line 17
    .line 18
    .line 19
    move-result v6

    .line 20
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 21
    .line 22
    .line 23
    move-result-object v4

    .line 24
    invoke-interface {p3, v4}, Lr6/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v4

    .line 28
    check-cast v4, Ljava/lang/Boolean;

    .line 29
    .line 30
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 31
    .line 32
    .line 33
    move-result v4

    .line 34
    if-eqz v4, :cond_1

    .line 35
    .line 36
    invoke-virtual {p2, v6}, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLineProvider;->spanOf(I)I

    .line 37
    .line 38
    .line 39
    move-result v8

    .line 40
    invoke-virtual {p2, v2, v8}, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLineProvider;->childConstraints-JhjzzOo$foundation_release(II)J

    .line 41
    .line 42
    .line 43
    move-result-wide v9

    .line 44
    const/4 v7, 0x0

    .line 45
    move-object v5, p1

    .line 46
    invoke-virtual/range {v5 .. v10}, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItemProvider;->getAndMeasure--hBUhpc(IIIJ)Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    if-nez v1, :cond_0

    .line 51
    .line 52
    new-instance v1, Ljava/util/ArrayList;

    .line 53
    .line 54
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 55
    .line 56
    .line 57
    :cond_0
    invoke-interface {v1, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_1
    move-object v5, p1

    .line 62
    :goto_1
    add-int/lit8 v3, v3, 0x1

    .line 63
    .line 64
    move-object p1, v5

    .line 65
    goto :goto_0

    .line 66
    :cond_2
    if-nez v1, :cond_3

    .line 67
    .line 68
    sget-object p0, Lkotlin/collections/EmptyList;->INSTANCE:Lkotlin/collections/EmptyList;

    .line 69
    .line 70
    return-object p0

    .line 71
    :cond_3
    return-object v1
.end method

.method private static final calculateItemsOffsets(Ljava/util/List;Ljava/util/List;Ljava/util/List;IIIIIZLandroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;ZLandroidx/compose/ui/unit/Density;)Ljava/util/List;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLine;",
            ">;",
            "Ljava/util/List<",
            "Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;",
            ">;",
            "Ljava/util/List<",
            "Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;",
            ">;IIIIIZ",
            "Landroidx/compose/foundation/layout/Arrangement$Vertical;",
            "Landroidx/compose/foundation/layout/Arrangement$Horizontal;",
            "Z",
            "Landroidx/compose/ui/unit/Density;",
            ")",
            "Ljava/util/List<",
            "Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;",
            ">;"
        }
    .end annotation

    .line 1
    move v0, p4

    .line 2
    move-object/from16 v1, p9

    .line 3
    .line 4
    move/from16 v2, p11

    .line 5
    .line 6
    if-eqz p8, :cond_0

    .line 7
    .line 8
    move v5, v0

    .line 9
    :goto_0
    move/from16 v3, p6

    .line 10
    .line 11
    goto :goto_1

    .line 12
    :cond_0
    move v5, p3

    .line 13
    goto :goto_0

    .line 14
    :goto_1
    invoke-static {v5, v3}, Ljava/lang/Math;->min(II)I

    .line 15
    .line 16
    .line 17
    move-result v3

    .line 18
    const/4 v4, 0x0

    .line 19
    move/from16 v6, p5

    .line 20
    .line 21
    if-ge v6, v3, :cond_1

    .line 22
    .line 23
    const/4 v3, 0x1

    .line 24
    goto :goto_2

    .line 25
    :cond_1
    move v3, v4

    .line 26
    :goto_2
    if-eqz v3, :cond_3

    .line 27
    .line 28
    if-nez p7, :cond_2

    .line 29
    .line 30
    goto :goto_3

    .line 31
    :cond_2
    const-string v6, "non-zero firstLineScrollOffset"

    .line 32
    .line 33
    invoke-static {v6}, Landroidx/compose/foundation/internal/InlineClassHelperKt;->throwIllegalStateException(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    :cond_3
    :goto_3
    invoke-interface {p0}, Ljava/util/Collection;->size()I

    .line 37
    .line 38
    .line 39
    move-result v6

    .line 40
    move v7, v4

    .line 41
    move v8, v7

    .line 42
    :goto_4
    if-ge v7, v6, :cond_4

    .line 43
    .line 44
    invoke-interface {p0, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v9

    .line 48
    check-cast v9, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLine;

    .line 49
    .line 50
    invoke-virtual {v9}, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLine;->getItems()[Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;

    .line 51
    .line 52
    .line 53
    move-result-object v9

    .line 54
    array-length v9, v9

    .line 55
    add-int/2addr v8, v9

    .line 56
    add-int/lit8 v7, v7, 0x1

    .line 57
    .line 58
    goto :goto_4

    .line 59
    :cond_4
    new-instance v9, Ljava/util/ArrayList;

    .line 60
    .line 61
    invoke-direct {v9, v8}, Ljava/util/ArrayList;-><init>(I)V

    .line 62
    .line 63
    .line 64
    if-eqz v3, :cond_e

    .line 65
    .line 66
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 67
    .line 68
    .line 69
    move-result p1

    .line 70
    if-eqz p1, :cond_5

    .line 71
    .line 72
    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    .line 73
    .line 74
    .line 75
    move-result p1

    .line 76
    if-eqz p1, :cond_5

    .line 77
    .line 78
    goto :goto_5

    .line 79
    :cond_5
    const-string p1, "no items"

    .line 80
    .line 81
    invoke-static {p1}, Landroidx/compose/foundation/internal/InlineClassHelperKt;->throwIllegalArgumentException(Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    :goto_5
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 85
    .line 86
    .line 87
    move-result p1

    .line 88
    new-array v6, p1, [I

    .line 89
    .line 90
    :goto_6
    if-ge v4, p1, :cond_6

    .line 91
    .line 92
    invoke-static {v4, v2, p1}, Landroidx/compose/foundation/lazy/grid/LazyGridMeasureKt;->calculateItemsOffsets$reverseAware(IZI)I

    .line 93
    .line 94
    .line 95
    move-result v3

    .line 96
    invoke-interface {p0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v3

    .line 100
    check-cast v3, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLine;

    .line 101
    .line 102
    invoke-virtual {v3}, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLine;->getMainAxisSize()I

    .line 103
    .line 104
    .line 105
    move-result v3

    .line 106
    aput v3, v6, v4

    .line 107
    .line 108
    add-int/lit8 v4, v4, 0x1

    .line 109
    .line 110
    goto :goto_6

    .line 111
    :cond_6
    new-array v8, p1, [I

    .line 112
    .line 113
    if-eqz p8, :cond_8

    .line 114
    .line 115
    if-eqz v1, :cond_7

    .line 116
    .line 117
    move-object/from16 v4, p12

    .line 118
    .line 119
    invoke-interface {v1, v4, v5, v6, v8}, Landroidx/compose/foundation/layout/Arrangement$Vertical;->arrange(Landroidx/compose/ui/unit/Density;I[I[I)V

    .line 120
    .line 121
    .line 122
    goto :goto_7

    .line 123
    :cond_7
    const-string p0, "null verticalArrangement"

    .line 124
    .line 125
    invoke-static {p0}, Landroidx/compose/foundation/internal/InlineClassHelperKt;->throwIllegalArgumentExceptionForNullCheck(Ljava/lang/String;)Ljava/lang/Void;

    .line 126
    .line 127
    .line 128
    new-instance p0, Lkotlin/KotlinNothingValueException;

    .line 129
    .line 130
    invoke-direct {p0}, Lkotlin/KotlinNothingValueException;-><init>()V

    .line 131
    .line 132
    .line 133
    throw p0

    .line 134
    :cond_8
    move-object/from16 v4, p12

    .line 135
    .line 136
    if-eqz p10, :cond_d

    .line 137
    .line 138
    sget-object v7, Landroidx/compose/ui/unit/LayoutDirection;->Ltr:Landroidx/compose/ui/unit/LayoutDirection;

    .line 139
    .line 140
    move-object/from16 v3, p10

    .line 141
    .line 142
    invoke-interface/range {v3 .. v8}, Landroidx/compose/foundation/layout/Arrangement$Horizontal;->arrange(Landroidx/compose/ui/unit/Density;I[ILandroidx/compose/ui/unit/LayoutDirection;[I)V

    .line 143
    .line 144
    .line 145
    :goto_7
    invoke-static {v8}, Lkotlin/collections/q;->S([I)Lx6/f;

    .line 146
    .line 147
    .line 148
    move-result-object v1

    .line 149
    if-eqz v2, :cond_9

    .line 150
    .line 151
    invoke-static {v1}, Lkotlin/collections/u;->I(Lx6/f;)Lx6/d;

    .line 152
    .line 153
    .line 154
    move-result-object v1

    .line 155
    :cond_9
    iget v3, v1, Lx6/d;->a:I

    .line 156
    .line 157
    iget v4, v1, Lx6/d;->b:I

    .line 158
    .line 159
    iget v1, v1, Lx6/d;->c:I

    .line 160
    .line 161
    if-lez v1, :cond_a

    .line 162
    .line 163
    if-le v3, v4, :cond_b

    .line 164
    .line 165
    :cond_a
    if-gez v1, :cond_12

    .line 166
    .line 167
    if-gt v4, v3, :cond_12

    .line 168
    .line 169
    :cond_b
    :goto_8
    aget v6, v8, v3

    .line 170
    .line 171
    invoke-static {v3, v2, p1}, Landroidx/compose/foundation/lazy/grid/LazyGridMeasureKt;->calculateItemsOffsets$reverseAware(IZI)I

    .line 172
    .line 173
    .line 174
    move-result v7

    .line 175
    invoke-interface {p0, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 176
    .line 177
    .line 178
    move-result-object v7

    .line 179
    check-cast v7, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLine;

    .line 180
    .line 181
    if-eqz v2, :cond_c

    .line 182
    .line 183
    sub-int v6, v5, v6

    .line 184
    .line 185
    invoke-virtual {v7}, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLine;->getMainAxisSize()I

    .line 186
    .line 187
    .line 188
    move-result v10

    .line 189
    sub-int/2addr v6, v10

    .line 190
    :cond_c
    invoke-virtual {v7, v6, p3, p4}, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLine;->position(III)[Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;

    .line 191
    .line 192
    .line 193
    move-result-object v6

    .line 194
    invoke-static {v9, v6}, Landroidx/compose/foundation/lazy/grid/LazyGridMeasureKt;->addAllFromArray(Ljava/util/List;[Ljava/lang/Object;)V

    .line 195
    .line 196
    .line 197
    if-eq v3, v4, :cond_12

    .line 198
    .line 199
    add-int/2addr v3, v1

    .line 200
    goto :goto_8

    .line 201
    :cond_d
    const-string p0, "null horizontalArrangement"

    .line 202
    .line 203
    invoke-static {p0}, Landroidx/compose/foundation/internal/InlineClassHelperKt;->throwIllegalArgumentExceptionForNullCheck(Ljava/lang/String;)Ljava/lang/Void;

    .line 204
    .line 205
    .line 206
    new-instance p0, Lkotlin/KotlinNothingValueException;

    .line 207
    .line 208
    invoke-direct {p0}, Lkotlin/KotlinNothingValueException;-><init>()V

    .line 209
    .line 210
    .line 211
    throw p0

    .line 212
    :cond_e
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    .line 213
    .line 214
    .line 215
    move-result v1

    .line 216
    add-int/lit8 v1, v1, -0x1

    .line 217
    .line 218
    if-ltz v1, :cond_10

    .line 219
    .line 220
    move/from16 v2, p7

    .line 221
    .line 222
    :goto_9
    add-int/lit8 v3, v1, -0x1

    .line 223
    .line 224
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 225
    .line 226
    .line 227
    move-result-object v1

    .line 228
    check-cast v1, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;

    .line 229
    .line 230
    invoke-virtual {v1}, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;->getMainAxisSizeWithSpacings()I

    .line 231
    .line 232
    .line 233
    move-result v5

    .line 234
    sub-int/2addr v2, v5

    .line 235
    invoke-virtual {v1, v2, v4, p3, p4}, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;->position(IIII)V

    .line 236
    .line 237
    .line 238
    invoke-virtual {v9, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 239
    .line 240
    .line 241
    if-gez v3, :cond_f

    .line 242
    .line 243
    goto :goto_a

    .line 244
    :cond_f
    move v1, v3

    .line 245
    goto :goto_9

    .line 246
    :cond_10
    :goto_a
    invoke-interface {p0}, Ljava/util/Collection;->size()I

    .line 247
    .line 248
    .line 249
    move-result p1

    .line 250
    move/from16 v1, p7

    .line 251
    .line 252
    move v2, v4

    .line 253
    :goto_b
    if-ge v2, p1, :cond_11

    .line 254
    .line 255
    invoke-interface {p0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 256
    .line 257
    .line 258
    move-result-object v3

    .line 259
    check-cast v3, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLine;

    .line 260
    .line 261
    invoke-virtual {v3, v1, p3, p4}, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLine;->position(III)[Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;

    .line 262
    .line 263
    .line 264
    move-result-object v5

    .line 265
    invoke-static {v9, v5}, Landroidx/compose/foundation/lazy/grid/LazyGridMeasureKt;->addAllFromArray(Ljava/util/List;[Ljava/lang/Object;)V

    .line 266
    .line 267
    .line 268
    invoke-virtual {v3}, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLine;->getMainAxisSizeWithSpacings()I

    .line 269
    .line 270
    .line 271
    move-result v3

    .line 272
    add-int/2addr v1, v3

    .line 273
    add-int/lit8 v2, v2, 0x1

    .line 274
    .line 275
    goto :goto_b

    .line 276
    :cond_11
    invoke-interface {p2}, Ljava/util/Collection;->size()I

    .line 277
    .line 278
    .line 279
    move-result p0

    .line 280
    move p1, v4

    .line 281
    :goto_c
    if-ge p1, p0, :cond_12

    .line 282
    .line 283
    invoke-interface {p2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 284
    .line 285
    .line 286
    move-result-object v3

    .line 287
    check-cast v3, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;

    .line 288
    .line 289
    invoke-virtual {v3, v1, v4, p3, p4}, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;->position(IIII)V

    .line 290
    .line 291
    .line 292
    invoke-virtual {v9, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 293
    .line 294
    .line 295
    invoke-virtual {v3}, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;->getMainAxisSizeWithSpacings()I

    .line 296
    .line 297
    .line 298
    move-result v3

    .line 299
    add-int/2addr v1, v3

    .line 300
    add-int/lit8 p1, p1, 0x1

    .line 301
    .line 302
    goto :goto_c

    .line 303
    :cond_12
    return-object v9
.end method

.method private static final calculateItemsOffsets$reverseAware(IZI)I
    .locals 0

    if-nez p1, :cond_0

    return p0

    :cond_0
    sub-int/2addr p2, p0

    add-int/lit8 p2, p2, -0x1

    return p2
.end method

.method private static final linesRetainedForLookahead(IILandroidx/compose/foundation/lazy/grid/LazyGridMeasuredLineProvider;ZLjava/util/List;Landroidx/compose/foundation/lazy/grid/LazyGridLayoutInfo;)Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II",
            "Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLineProvider;",
            "Z",
            "Ljava/util/List<",
            "Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLine;",
            ">;",
            "Landroidx/compose/foundation/lazy/grid/LazyGridLayoutInfo;",
            ")",
            "Ljava/util/List<",
            "Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLine;",
            ">;"
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p3, :cond_8

    .line 3
    .line 4
    if-eqz p5, :cond_8

    .line 5
    .line 6
    invoke-interface {p5}, Landroidx/compose/foundation/lazy/grid/LazyGridLayoutInfo;->getVisibleItemsInfo()Ljava/util/List;

    .line 7
    .line 8
    .line 9
    move-result-object p3

    .line 10
    invoke-interface {p3}, Ljava/util/Collection;->isEmpty()Z

    .line 11
    .line 12
    .line 13
    move-result p3

    .line 14
    if-nez p3, :cond_8

    .line 15
    .line 16
    invoke-interface {p5}, Landroidx/compose/foundation/lazy/grid/LazyGridLayoutInfo;->getVisibleItemsInfo()Ljava/util/List;

    .line 17
    .line 18
    .line 19
    move-result-object p3

    .line 20
    invoke-interface {p3}, Ljava/util/List;->size()I

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    add-int/lit8 v1, v1, -0x1

    .line 25
    .line 26
    :goto_0
    const/4 v2, -0x1

    .line 27
    if-ge v2, v1, :cond_2

    .line 28
    .line 29
    invoke-interface {p3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    check-cast v2, Landroidx/compose/foundation/lazy/grid/LazyGridItemInfo;

    .line 34
    .line 35
    invoke-interface {v2}, Landroidx/compose/foundation/lazy/grid/LazyGridItemInfo;->getIndex()I

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    if-le v2, p0, :cond_1

    .line 40
    .line 41
    if-eqz v1, :cond_0

    .line 42
    .line 43
    add-int/lit8 v2, v1, -0x1

    .line 44
    .line 45
    invoke-interface {p3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    check-cast v2, Landroidx/compose/foundation/lazy/grid/LazyGridItemInfo;

    .line 50
    .line 51
    invoke-interface {v2}, Landroidx/compose/foundation/lazy/grid/LazyGridItemInfo;->getIndex()I

    .line 52
    .line 53
    .line 54
    move-result v2

    .line 55
    if-gt v2, p0, :cond_1

    .line 56
    .line 57
    :cond_0
    invoke-interface {p3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    check-cast p0, Landroidx/compose/foundation/lazy/grid/LazyGridItemInfo;

    .line 62
    .line 63
    goto :goto_1

    .line 64
    :cond_1
    add-int/lit8 v1, v1, -0x1

    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_2
    move-object p0, v0

    .line 68
    :goto_1
    invoke-interface {p5}, Landroidx/compose/foundation/lazy/grid/LazyGridLayoutInfo;->getVisibleItemsInfo()Ljava/util/List;

    .line 69
    .line 70
    .line 71
    move-result-object p3

    .line 72
    invoke-static {p3}, Lkotlin/collections/t;->o0(Ljava/util/List;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object p3

    .line 76
    check-cast p3, Landroidx/compose/foundation/lazy/grid/LazyGridItemInfo;

    .line 77
    .line 78
    invoke-static {p4}, Lkotlin/collections/t;->p0(Ljava/util/List;)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object p4

    .line 82
    check-cast p4, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLine;

    .line 83
    .line 84
    const/4 p5, 0x0

    .line 85
    if-eqz p4, :cond_3

    .line 86
    .line 87
    invoke-virtual {p4}, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLine;->getIndex()I

    .line 88
    .line 89
    .line 90
    move-result p4

    .line 91
    add-int/lit8 p4, p4, 0x1

    .line 92
    .line 93
    goto :goto_2

    .line 94
    :cond_3
    move p4, p5

    .line 95
    :goto_2
    if-eqz p0, :cond_8

    .line 96
    .line 97
    invoke-interface {p0}, Landroidx/compose/foundation/lazy/grid/LazyGridItemInfo;->getIndex()I

    .line 98
    .line 99
    .line 100
    move-result p0

    .line 101
    invoke-interface {p3}, Landroidx/compose/foundation/lazy/grid/LazyGridItemInfo;->getIndex()I

    .line 102
    .line 103
    .line 104
    move-result p3

    .line 105
    add-int/lit8 p1, p1, -0x1

    .line 106
    .line 107
    invoke-static {p3, p1}, Ljava/lang/Math;->min(II)I

    .line 108
    .line 109
    .line 110
    move-result p1

    .line 111
    if-gt p0, p1, :cond_8

    .line 112
    .line 113
    :goto_3
    if-eqz v0, :cond_6

    .line 114
    .line 115
    invoke-interface {v0}, Ljava/util/Collection;->size()I

    .line 116
    .line 117
    .line 118
    move-result p3

    .line 119
    move v1, p5

    .line 120
    :goto_4
    if-ge v1, p3, :cond_6

    .line 121
    .line 122
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object v2

    .line 126
    check-cast v2, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLine;

    .line 127
    .line 128
    invoke-virtual {v2}, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLine;->getItems()[Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;

    .line 129
    .line 130
    .line 131
    move-result-object v2

    .line 132
    array-length v3, v2

    .line 133
    move v4, p5

    .line 134
    :goto_5
    if-ge v4, v3, :cond_5

    .line 135
    .line 136
    aget-object v5, v2, v4

    .line 137
    .line 138
    invoke-virtual {v5}, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;->getIndex()I

    .line 139
    .line 140
    .line 141
    move-result v5

    .line 142
    if-ne v5, p0, :cond_4

    .line 143
    .line 144
    goto :goto_6

    .line 145
    :cond_4
    add-int/lit8 v4, v4, 0x1

    .line 146
    .line 147
    goto :goto_5

    .line 148
    :cond_5
    add-int/lit8 v1, v1, 0x1

    .line 149
    .line 150
    goto :goto_4

    .line 151
    :cond_6
    if-nez v0, :cond_7

    .line 152
    .line 153
    new-instance v0, Ljava/util/ArrayList;

    .line 154
    .line 155
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 156
    .line 157
    .line 158
    :cond_7
    invoke-virtual {p2, p4}, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLineProvider;->getAndMeasure(I)Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLine;

    .line 159
    .line 160
    .line 161
    move-result-object p3

    .line 162
    add-int/lit8 p4, p4, 0x1

    .line 163
    .line 164
    invoke-interface {v0, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 165
    .line 166
    .line 167
    :goto_6
    if-eq p0, p1, :cond_8

    .line 168
    .line 169
    add-int/lit8 p0, p0, 0x1

    .line 170
    .line 171
    goto :goto_3

    .line 172
    :cond_8
    if-nez v0, :cond_9

    .line 173
    .line 174
    sget-object p0, Lkotlin/collections/EmptyList;->INSTANCE:Lkotlin/collections/EmptyList;

    .line 175
    .line 176
    return-object p0

    .line 177
    :cond_9
    return-object v0
.end method

.method public static final measureLazyGrid-GyuLg2I(ILandroidx/compose/foundation/lazy/grid/LazyGridMeasuredLineProvider;Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItemProvider;IIIIIIFJZLandroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;ZLandroidx/compose/ui/unit/Density;Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;ILjava/util/List;ZZLandroidx/compose/foundation/lazy/grid/LazyGridLayoutInfo;Lkotlinx/coroutines/v;Landroidx/compose/runtime/MutableState;Landroidx/compose/ui/graphics/GraphicsContext;Lr6/c;Landroidx/compose/foundation/lazy/layout/StickyItemsPlacement;Lr6/f;)Landroidx/compose/foundation/lazy/grid/LazyGridMeasureResult;
    .locals 54
    .param p1    # Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLineProvider;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItemProvider;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p13    # Landroidx/compose/foundation/layout/Arrangement$Vertical;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p14    # Landroidx/compose/foundation/layout/Arrangement$Horizontal;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p16    # Landroidx/compose/ui/unit/Density;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p17    # Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p19    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p22    # Landroidx/compose/foundation/lazy/grid/LazyGridLayoutInfo;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p23    # Lkotlinx/coroutines/v;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p24    # Landroidx/compose/runtime/MutableState;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p25    # Landroidx/compose/ui/graphics/GraphicsContext;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p26    # Lr6/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p27    # Landroidx/compose/foundation/lazy/layout/StickyItemsPlacement;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p28    # Lr6/f;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLineProvider;",
            "Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItemProvider;",
            "IIIIIIFJZ",
            "Landroidx/compose/foundation/layout/Arrangement$Vertical;",
            "Landroidx/compose/foundation/layout/Arrangement$Horizontal;",
            "Z",
            "Landroidx/compose/ui/unit/Density;",
            "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator<",
            "Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;",
            ">;I",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;ZZ",
            "Landroidx/compose/foundation/lazy/grid/LazyGridLayoutInfo;",
            "Lkotlinx/coroutines/v;",
            "Landroidx/compose/runtime/MutableState<",
            "Ld6/s;",
            ">;",
            "Landroidx/compose/ui/graphics/GraphicsContext;",
            "Lr6/c;",
            "Landroidx/compose/foundation/lazy/layout/StickyItemsPlacement;",
            "Lr6/f;",
            ")",
            "Landroidx/compose/foundation/lazy/grid/LazyGridMeasureResult;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    move/from16 v15, p0

    move-object/from16 v2, p1

    move/from16 v6, p3

    move/from16 v13, p4

    move-wide/from16 v7, p10

    move-object/from16 v9, p19

    move-object/from16 v10, p28

    if-ltz v13, :cond_0

    goto :goto_0

    .line 1
    :cond_0
    const-string v0, "negative beforeContentPadding"

    .line 2
    invoke-static {v0}, Landroidx/compose/foundation/internal/InlineClassHelperKt;->throwIllegalArgumentException(Ljava/lang/String;)V

    :goto_0
    if-ltz p5, :cond_1

    goto :goto_1

    .line 3
    :cond_1
    const-string v0, "negative afterContentPadding"

    .line 4
    invoke-static {v0}, Landroidx/compose/foundation/internal/InlineClassHelperKt;->throwIllegalArgumentException(Ljava/lang/String;)V

    :goto_1
    const-wide v29, 0xffffffffL

    const/16 v31, 0x20

    if-gtz v15, :cond_4

    .line 5
    invoke-static {v7, v8}, Landroidx/compose/ui/unit/Constraints;->getMinWidth-impl(J)I

    move-result v16

    .line 6
    invoke-static {v7, v8}, Landroidx/compose/ui/unit/Constraints;->getMinHeight-impl(J)I

    move-result v17

    .line 7
    new-instance v18, Ljava/util/ArrayList;

    invoke-direct/range {v18 .. v18}, Ljava/util/ArrayList;-><init>()V

    .line 8
    invoke-virtual/range {p2 .. p2}, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItemProvider;->getKeyIndexMap()Landroidx/compose/foundation/lazy/layout/LazyLayoutKeyIndexMap;

    move-result-object v19

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/4 v15, 0x0

    move-object/from16 v20, p2

    move/from16 v21, p12

    move-object/from16 v14, p17

    move/from16 v23, p18

    move/from16 v24, p20

    move/from16 v22, p21

    move-object/from16 v27, p23

    move-object/from16 v28, p25

    .line 9
    invoke-virtual/range {v14 .. v28}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->onMeasured(IIILjava/util/List;Landroidx/compose/foundation/lazy/layout/LazyLayoutKeyIndexMap;Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItemProvider;ZZIZIILkotlinx/coroutines/v;Landroidx/compose/ui/graphics/GraphicsContext;)V

    if-nez p21, :cond_2

    .line 10
    invoke-virtual/range {p17 .. p17}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->getMinSizeToFitDisappearingItems-YbymL2g()J

    move-result-wide v0

    .line 11
    sget-object v2, Landroidx/compose/ui/unit/IntSize;->Companion:Landroidx/compose/ui/unit/IntSize$Companion;

    invoke-virtual {v2}, Landroidx/compose/ui/unit/IntSize$Companion;->getZero-YbymL2g()J

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, Landroidx/compose/ui/unit/IntSize;->equals-impl0(JJ)Z

    move-result v2

    if-nez v2, :cond_2

    shr-long v2, v0, v31

    long-to-int v2, v2

    .line 12
    invoke-static {v7, v8, v2}, Landroidx/compose/ui/unit/ConstraintsKt;->constrainWidth-K40F9xA(JI)I

    move-result v16

    and-long v0, v0, v29

    long-to-int v0, v0

    .line 13
    invoke-static {v7, v8, v0}, Landroidx/compose/ui/unit/ConstraintsKt;->constrainHeight-K40F9xA(JI)I

    move-result v17

    .line 14
    :cond_2
    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static/range {v17 .. v17}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    sget-object v2, Landroidx/compose/foundation/lazy/grid/LazyGridMeasureKt$measureLazyGrid$3;->INSTANCE:Landroidx/compose/foundation/lazy/grid/LazyGridMeasureKt$measureLazyGrid$3;

    invoke-interface {v10, v0, v1, v2}, Lr6/f;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v37, v0

    check-cast v37, Landroidx/compose/ui/layout/MeasureResult;

    .line 15
    sget-object v44, Lkotlin/collections/EmptyList;->INSTANCE:Lkotlin/collections/EmptyList;

    neg-int v0, v13

    add-int v46, v6, p5

    if-eqz p12, :cond_3

    .line 16
    sget-object v1, Landroidx/compose/foundation/gestures/Orientation;->Vertical:Landroidx/compose/foundation/gestures/Orientation;

    :goto_2
    move-object/from16 v49, v1

    goto :goto_3

    :cond_3
    sget-object v1, Landroidx/compose/foundation/gestures/Orientation;->Horizontal:Landroidx/compose/foundation/gestures/Orientation;

    goto :goto_2

    .line 17
    :goto_3
    new-instance v32, Landroidx/compose/foundation/lazy/grid/LazyGridMeasureResult;

    const/16 v39, 0x0

    const/16 v47, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    const/16 v38, 0x0

    move/from16 v50, p5

    move/from16 v51, p6

    move/from16 v48, p15

    move-object/from16 v41, p16

    move/from16 v42, p18

    move-object/from16 v40, p23

    move-object/from16 v43, p26

    move/from16 v45, v0

    invoke-direct/range {v32 .. v51}, Landroidx/compose/foundation/lazy/grid/LazyGridMeasureResult;-><init>(Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLine;IZFLandroidx/compose/ui/layout/MeasureResult;FZLkotlinx/coroutines/v;Landroidx/compose/ui/unit/Density;ILr6/c;Ljava/util/List;IIIZLandroidx/compose/foundation/gestures/Orientation;II)V

    return-object v32

    .line 18
    :cond_4
    invoke-static/range {p9 .. p9}, Ljava/lang/Math;->round(F)I

    move-result v0

    sub-int v1, p8, v0

    const/4 v14, 0x0

    if-nez p7, :cond_5

    if-gez v1, :cond_5

    add-int/2addr v0, v1

    move v1, v14

    .line 19
    :cond_5
    new-instance v4, Lkotlin/collections/p;

    invoke-direct {v4}, Lkotlin/collections/p;-><init>()V

    neg-int v11, v13

    if-gez p6, :cond_6

    move/from16 v3, p6

    goto :goto_4

    :cond_6
    move v3, v14

    :goto_4
    add-int/2addr v3, v11

    add-int/2addr v1, v3

    move v5, v1

    move/from16 v1, p7

    :goto_5
    if-gez v5, :cond_7

    if-lez v1, :cond_7

    add-int/lit8 v1, v1, -0x1

    .line 20
    invoke-virtual {v2, v1}, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLineProvider;->getAndMeasure(I)Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLine;

    move-result-object v12

    .line 21
    invoke-virtual {v4, v14, v12}, Lkotlin/collections/p;->add(ILjava/lang/Object;)V

    .line 22
    invoke-virtual {v12}, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLine;->getMainAxisSizeWithSpacings()I

    move-result v12

    add-int/2addr v5, v12

    goto :goto_5

    :cond_7
    if-ge v5, v3, :cond_8

    sub-int v5, v3, v5

    sub-int/2addr v0, v5

    move v5, v3

    :cond_8
    sub-int/2addr v5, v3

    add-int v32, v6, p5

    if-gez v32, :cond_9

    move v12, v14

    goto :goto_6

    :cond_9
    move/from16 v12, v32

    :goto_6
    neg-int v14, v5

    move/from16 p7, v1

    move/from16 v17, p7

    move/from16 v18, v5

    move v1, v14

    const/4 v14, 0x0

    const/16 v16, 0x0

    .line 23
    :goto_7
    invoke-virtual {v4}, Lkotlin/collections/j;->size()I

    move-result v5

    const/16 v33, 0x1

    if-ge v14, v5, :cond_b

    if-lt v1, v12, :cond_a

    .line 24
    invoke-virtual {v4, v14}, Lkotlin/collections/j;->remove(I)Ljava/lang/Object;

    move/from16 v16, v33

    goto :goto_7

    :cond_a
    add-int/lit8 v17, v17, 0x1

    .line 25
    invoke-virtual {v4, v14}, Lkotlin/collections/p;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLine;

    invoke-virtual {v5}, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLine;->getMainAxisSizeWithSpacings()I

    move-result v5

    add-int/2addr v1, v5

    add-int/lit8 v14, v14, 0x1

    goto :goto_7

    :cond_b
    move/from16 v34, v16

    move/from16 v14, v17

    .line 26
    :goto_8
    const-string v5, "<this>"

    if-ge v14, v15, :cond_10

    if-lt v1, v12, :cond_c

    if-lez v1, :cond_c

    .line 27
    invoke-virtual {v4}, Lkotlin/collections/p;->isEmpty()Z

    move-result v16

    if-eqz v16, :cond_10

    .line 28
    :cond_c
    invoke-virtual {v2, v14}, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLineProvider;->getAndMeasure(I)Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLine;

    move-result-object v10

    .line 29
    invoke-virtual {v10}, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLine;->isEmpty()Z

    move-result v16

    if-eqz v16, :cond_d

    goto :goto_a

    .line 30
    :cond_d
    invoke-virtual {v10}, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLine;->getMainAxisSizeWithSpacings()I

    move-result v16

    add-int v1, v16, v1

    move/from16 v16, v1

    if-gt v1, v3, :cond_f

    .line 31
    invoke-virtual {v10}, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLine;->getItems()[Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;

    move-result-object v1

    invoke-static {v1, v5}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 32
    array-length v5, v1

    if-eqz v5, :cond_e

    .line 33
    array-length v5, v1

    add-int/lit8 v5, v5, -0x1

    .line 34
    aget-object v1, v1, v5

    .line 35
    invoke-virtual {v1}, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;->getIndex()I

    move-result v1

    add-int/lit8 v5, v15, -0x1

    if-eq v1, v5, :cond_f

    add-int/lit8 v1, v14, 0x1

    .line 36
    invoke-virtual {v10}, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLine;->getMainAxisSizeWithSpacings()I

    move-result v5

    sub-int v18, v18, v5

    move/from16 v34, v33

    goto :goto_9

    .line 37
    :cond_e
    new-instance v0, Ljava/util/NoSuchElementException;

    const-string v1, "Array is empty."

    invoke-direct {v0, v1}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 38
    :cond_f
    invoke-virtual {v4, v10}, Lkotlin/collections/p;->addLast(Ljava/lang/Object;)V

    move/from16 v1, p7

    :goto_9
    add-int/lit8 v14, v14, 0x1

    move-object/from16 v10, p28

    move/from16 p7, v1

    move/from16 v1, v16

    goto :goto_8

    :cond_10
    :goto_a
    if-ge v1, v6, :cond_13

    sub-int v3, v6, v1

    sub-int v18, v18, v3

    add-int/2addr v1, v3

    move/from16 v12, p7

    move/from16 v10, v18

    :goto_b
    if-ge v10, v13, :cond_11

    if-lez v12, :cond_11

    add-int/lit8 v12, v12, -0x1

    .line 39
    invoke-virtual {v2, v12}, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLineProvider;->getAndMeasure(I)Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLine;

    move-result-object v14

    move/from16 p7, v1

    const/4 v1, 0x0

    .line 40
    invoke-virtual {v4, v1, v14}, Lkotlin/collections/p;->add(ILjava/lang/Object;)V

    .line 41
    invoke-virtual {v14}, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLine;->getMainAxisSizeWithSpacings()I

    move-result v1

    add-int/2addr v10, v1

    move/from16 v1, p7

    goto :goto_b

    :cond_11
    move/from16 p7, v1

    add-int/2addr v3, v0

    if-gez v10, :cond_12

    add-int/2addr v3, v10

    add-int v1, p7, v10

    move v10, v1

    const/4 v12, 0x0

    goto :goto_c

    :cond_12
    move v12, v10

    move/from16 v10, p7

    goto :goto_c

    :cond_13
    move v3, v0

    move v10, v1

    move/from16 v12, v18

    .line 42
    :goto_c
    invoke-static/range {p9 .. p9}, Ljava/lang/Math;->round(F)I

    move-result v1

    .line 43
    invoke-static {v1}, Ljava/lang/Integer;->signum(I)I

    move-result v1

    invoke-static {v3}, Ljava/lang/Integer;->signum(I)I

    move-result v14

    if-ne v1, v14, :cond_14

    .line 44
    invoke-static/range {p9 .. p9}, Ljava/lang/Math;->round(F)I

    move-result v1

    .line 45
    invoke-static {v1}, Ljava/lang/Math;->abs(I)I

    move-result v1

    invoke-static {v3}, Ljava/lang/Math;->abs(I)I

    move-result v14

    if-lt v1, v14, :cond_14

    int-to-float v1, v3

    move v14, v1

    goto :goto_d

    :cond_14
    move/from16 v14, p9

    :goto_d
    sub-float v1, p9, v14

    const/16 v16, 0x0

    if-eqz p21, :cond_15

    if-le v3, v0, :cond_15

    cmpg-float v17, v1, v16

    if-gtz v17, :cond_15

    sub-int/2addr v3, v0

    int-to-float v0, v3

    add-float v16, v0, v1

    :cond_15
    move/from16 v35, v16

    if-ltz v12, :cond_16

    goto :goto_e

    .line 46
    :cond_16
    const-string v0, "negative initial offset"

    .line 47
    invoke-static {v0}, Landroidx/compose/foundation/internal/InlineClassHelperKt;->throwIllegalArgumentException(Ljava/lang/String;)V

    :goto_e
    neg-int v0, v12

    .line 48
    invoke-virtual {v4}, Lkotlin/collections/p;->first()Ljava/lang/Object;

    move-result-object v1

    move-object/from16 v22, v1

    check-cast v22, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLine;

    .line 49
    invoke-virtual/range {v22 .. v22}, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLine;->getItems()[Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;

    move-result-object v1

    invoke-static {v1, v5}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 50
    array-length v3, v1

    const/16 v23, 0x0

    if-nez v3, :cond_17

    move-object/from16 v1, v23

    goto :goto_f

    :cond_17
    const/4 v3, 0x0

    aget-object v1, v1, v3

    :goto_f
    if-eqz v1, :cond_18

    .line 51
    invoke-virtual {v1}, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;->getIndex()I

    move-result v1

    goto :goto_10

    :cond_18
    const/4 v1, 0x0

    .line 52
    :goto_10
    invoke-virtual {v4}, Lkotlin/collections/p;->e()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLine;

    if-eqz v3, :cond_1a

    invoke-virtual {v3}, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLine;->getItems()[Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;

    move-result-object v3

    if-eqz v3, :cond_1a

    .line 53
    array-length v5, v3

    if-nez v5, :cond_19

    move-object/from16 v3, v23

    goto :goto_11

    :cond_19
    array-length v5, v3

    add-int/lit8 v5, v5, -0x1

    aget-object v3, v3, v5

    :goto_11
    if-eqz v3, :cond_1a

    .line 54
    invoke-virtual {v3}, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;->getIndex()I

    move-result v3

    move/from16 v53, v3

    move v3, v0

    move/from16 v0, v53

    goto :goto_12

    :cond_1a
    move v3, v0

    const/4 v0, 0x0

    .line 55
    :goto_12
    invoke-interface {v9}, Ljava/util/Collection;->size()I

    move-result v5

    move/from16 p7, v0

    move-object/from16 v24, v23

    const/4 v0, 0x0

    :goto_13
    if-ge v0, v5, :cond_1d

    .line 56
    invoke-interface {v9, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v16

    .line 57
    check-cast v16, Ljava/lang/Number;

    move/from16 v25, v0

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Number;->intValue()I

    move-result v0

    if-ltz v0, :cond_1c

    if-ge v0, v1, :cond_1c

    move/from16 v26, v1

    .line 58
    invoke-virtual {v2, v0}, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLineProvider;->spanOf(I)I

    move-result v1

    move/from16 v17, v0

    const/4 v0, 0x0

    .line 59
    invoke-virtual {v2, v0, v1}, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLineProvider;->childConstraints-JhjzzOo$foundation_release(II)J

    move-result-wide v20

    const/16 v18, 0x0

    move-object/from16 v16, p2

    move/from16 v19, v1

    .line 60
    invoke-virtual/range {v16 .. v21}, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItemProvider;->getAndMeasure--hBUhpc(IIIJ)Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;

    move-result-object v0

    if-nez v24, :cond_1b

    .line 61
    new-instance v24, Ljava/util/ArrayList;

    invoke-direct/range {v24 .. v24}, Ljava/util/ArrayList;-><init>()V

    :cond_1b
    move-object/from16 v1, v24

    .line 62
    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move-object/from16 v24, v1

    goto :goto_14

    :cond_1c
    move/from16 v26, v1

    :goto_14
    add-int/lit8 v0, v25, 0x1

    move/from16 v1, v26

    goto :goto_13

    :cond_1d
    move/from16 v26, v1

    if-nez v24, :cond_1e

    .line 63
    sget-object v24, Lkotlin/collections/EmptyList;->INSTANCE:Lkotlin/collections/EmptyList;

    :cond_1e
    move/from16 v0, p7

    move-object/from16 v5, p22

    move v1, v15

    move/from16 v13, v26

    move v15, v3

    move/from16 v3, p21

    .line 64
    invoke-static/range {v0 .. v5}, Landroidx/compose/foundation/lazy/grid/LazyGridMeasureKt;->linesRetainedForLookahead(IILandroidx/compose/foundation/lazy/grid/LazyGridMeasuredLineProvider;ZLjava/util/List;Landroidx/compose/foundation/lazy/grid/LazyGridLayoutInfo;)Ljava/util/List;

    move-result-object v5

    move v3, v0

    move v0, v1

    move-object v1, v2

    .line 65
    invoke-interface {v9}, Ljava/util/Collection;->size()I

    move-result v2

    const/4 v6, 0x0

    :goto_15
    if-ge v6, v2, :cond_24

    .line 66
    invoke-interface {v9, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v16

    .line 67
    check-cast v16, Ljava/lang/Number;

    move/from16 p7, v2

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Number;->intValue()I

    move-result v2

    move/from16 p9, v3

    add-int/lit8 v3, p9, 0x1

    if-gt v3, v2, :cond_23

    if-ge v2, v0, :cond_23

    if-eqz p21, :cond_21

    .line 68
    invoke-interface {v5}, Ljava/util/Collection;->size()I

    move-result v3

    const/4 v0, 0x0

    :goto_16
    if-ge v0, v3, :cond_21

    .line 69
    invoke-interface {v5, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v16

    .line 70
    check-cast v16, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLine;

    move/from16 v17, v0

    .line 71
    invoke-virtual/range {v16 .. v16}, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLine;->getItems()[Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;

    move-result-object v0

    move/from16 p22, v3

    .line 72
    array-length v3, v0

    move-object/from16 v16, v0

    const/4 v0, 0x0

    :goto_17
    if-ge v0, v3, :cond_20

    aget-object v18, v16, v0

    move/from16 v19, v0

    .line 73
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;->getIndex()I

    move-result v0

    if-ne v0, v2, :cond_1f

    goto :goto_18

    :cond_1f
    add-int/lit8 v0, v19, 0x1

    goto :goto_17

    :cond_20
    add-int/lit8 v0, v17, 0x1

    move/from16 v3, p22

    goto :goto_16

    .line 74
    :cond_21
    invoke-virtual {v1, v2}, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLineProvider;->spanOf(I)I

    move-result v3

    move-object/from16 v16, v4

    move-object/from16 v17, v5

    const/4 v0, 0x0

    .line 75
    invoke-virtual {v1, v0, v3}, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLineProvider;->childConstraints-JhjzzOo$foundation_release(II)J

    move-result-wide v4

    move v1, v2

    const/4 v2, 0x0

    move/from16 v18, p7

    move/from16 v52, p9

    move/from16 v19, v0

    move/from16 v36, v13

    move-object/from16 v13, p1

    move-object/from16 v0, p2

    .line 76
    invoke-virtual/range {v0 .. v5}, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItemProvider;->getAndMeasure--hBUhpc(IIIJ)Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;

    move-result-object v1

    if-nez v23, :cond_22

    .line 77
    new-instance v23, Ljava/util/ArrayList;

    invoke-direct/range {v23 .. v23}, Ljava/util/ArrayList;-><init>()V

    :cond_22
    move-object/from16 v0, v23

    .line 78
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move-object/from16 v23, v0

    goto :goto_19

    :cond_23
    :goto_18
    move/from16 v18, p7

    move/from16 v52, p9

    move-object/from16 v16, v4

    move-object/from16 v17, v5

    move/from16 v36, v13

    const/16 v19, 0x0

    move-object v13, v1

    :goto_19
    add-int/lit8 v6, v6, 0x1

    move/from16 v0, p0

    move-object v1, v13

    move-object/from16 v4, v16

    move-object/from16 v5, v17

    move/from16 v2, v18

    move/from16 v13, v36

    move/from16 v3, v52

    goto/16 :goto_15

    :cond_24
    move/from16 v52, v3

    move-object/from16 v16, v4

    move-object/from16 v17, v5

    move/from16 v36, v13

    const/16 v19, 0x0

    move-object v13, v1

    if-nez v23, :cond_25

    .line 79
    sget-object v23, Lkotlin/collections/EmptyList;->INSTANCE:Lkotlin/collections/EmptyList;

    :cond_25
    move-object/from16 v2, v23

    if-gtz p4, :cond_28

    if-gez p6, :cond_26

    goto :goto_1a

    :cond_26
    move-object/from16 v4, v16

    :cond_27
    move/from16 v25, v12

    move-object/from16 v37, v22

    goto :goto_1c

    .line 80
    :cond_28
    :goto_1a
    invoke-interface/range {v16 .. v16}, Ljava/util/Collection;->size()I

    move-result v0

    move/from16 v1, v19

    :goto_1b
    move-object/from16 v4, v16

    if-ge v1, v0, :cond_27

    .line 81
    invoke-virtual {v4, v1}, Lkotlin/collections/p;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLine;

    invoke-virtual {v3}, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLine;->getMainAxisSizeWithSpacings()I

    move-result v3

    if-eqz v12, :cond_27

    if-gt v3, v12, :cond_27

    .line 82
    invoke-static {v4}, Lkotlin/collections/u;->u(Ljava/util/List;)I

    move-result v5

    if-eq v1, v5, :cond_27

    sub-int/2addr v12, v3

    add-int/lit8 v1, v1, 0x1

    .line 83
    invoke-virtual {v4, v1}, Lkotlin/collections/p;->get(I)Ljava/lang/Object;

    move-result-object v3

    move-object/from16 v22, v3

    check-cast v22, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLine;

    move-object/from16 v16, v4

    goto :goto_1b

    :goto_1c
    if-eqz p12, :cond_29

    .line 84
    invoke-static {v7, v8}, Landroidx/compose/ui/unit/Constraints;->getMaxWidth-impl(J)I

    move-result v0

    :goto_1d
    move v3, v0

    goto :goto_1e

    .line 85
    :cond_29
    invoke-static {v7, v8, v10}, Landroidx/compose/ui/unit/ConstraintsKt;->constrainWidth-K40F9xA(JI)I

    move-result v0

    goto :goto_1d

    :goto_1e
    if-eqz p12, :cond_2a

    .line 86
    invoke-static {v7, v8, v10}, Landroidx/compose/ui/unit/ConstraintsKt;->constrainHeight-K40F9xA(JI)I

    move-result v0

    goto :goto_1f

    .line 87
    :cond_2a
    invoke-static {v7, v8}, Landroidx/compose/ui/unit/Constraints;->getMaxHeight-impl(J)I

    move-result v0

    .line 88
    :goto_1f
    invoke-interface/range {v17 .. v17}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_2b

    :goto_20
    move-object v1, v4

    move v4, v0

    move-object v0, v1

    move/from16 v6, p3

    move/from16 v8, p12

    move-object/from16 v9, p13

    move-object/from16 v12, p16

    move v5, v10

    move/from16 v38, v11

    move v7, v15

    move-object/from16 v1, v24

    move-object/from16 v10, p14

    move/from16 v11, p15

    goto :goto_21

    :cond_2b
    move-object/from16 v1, v17

    .line 89
    invoke-static {v4, v1}, Lkotlin/collections/t;->t0(Ljava/util/Collection;Ljava/util/List;)Ljava/util/ArrayList;

    move-result-object v4

    goto :goto_20

    .line 90
    :goto_21
    invoke-static/range {v0 .. v12}, Landroidx/compose/foundation/lazy/grid/LazyGridMeasureKt;->calculateItemsOffsets(Ljava/util/List;Ljava/util/List;Ljava/util/List;IIIIIZLandroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;ZLandroidx/compose/ui/unit/Density;)Ljava/util/List;

    move-result-object v1

    move v8, v6

    float-to-int v15, v14

    move/from16 v0, v19

    .line 91
    invoke-virtual/range {p2 .. p2}, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItemProvider;->getKeyIndexMap()Landroidx/compose/foundation/lazy/layout/LazyLayoutKeyIndexMap;

    move-result-object v19

    move-object/from16 v20, p2

    move/from16 v21, p12

    move/from16 v23, p18

    move/from16 v24, p20

    move/from16 v22, p21

    move-object/from16 v27, p23

    move-object/from16 v28, p25

    move v9, v0

    move-object/from16 v18, v1

    move/from16 v16, v3

    move/from16 v17, v4

    move/from16 v26, v5

    move v11, v14

    move-object/from16 v14, p17

    .line 92
    invoke-virtual/range {v14 .. v28}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->onMeasured(IIILjava/util/List;Landroidx/compose/foundation/lazy/layout/LazyLayoutKeyIndexMap;Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItemProvider;ZZIZIILkotlinx/coroutines/v;Landroidx/compose/ui/graphics/GraphicsContext;)V

    move/from16 v12, v22

    move/from16 v14, v26

    if-nez v12, :cond_2f

    .line 93
    invoke-virtual/range {p17 .. p17}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->getMinSizeToFitDisappearingItems-YbymL2g()J

    move-result-wide v5

    .line 94
    sget-object v0, Landroidx/compose/ui/unit/IntSize;->Companion:Landroidx/compose/ui/unit/IntSize$Companion;

    invoke-virtual {v0}, Landroidx/compose/ui/unit/IntSize$Companion;->getZero-YbymL2g()J

    move-result-wide v9

    invoke-static {v5, v6, v9, v10}, Landroidx/compose/ui/unit/IntSize;->equals-impl0(JJ)Z

    move-result v0

    if-nez v0, :cond_2f

    if-eqz p12, :cond_2c

    move v0, v4

    goto :goto_22

    :cond_2c
    move v0, v3

    :goto_22
    shr-long v9, v5, v31

    long-to-int v2, v9

    .line 95
    invoke-static {v3, v2}, Ljava/lang/Math;->max(II)I

    move-result v2

    move-wide/from16 v9, p10

    invoke-static {v9, v10, v2}, Landroidx/compose/ui/unit/ConstraintsKt;->constrainWidth-K40F9xA(JI)I

    move-result v3

    and-long v5, v5, v29

    long-to-int v2, v5

    .line 96
    invoke-static {v4, v2}, Ljava/lang/Math;->max(II)I

    move-result v2

    invoke-static {v9, v10, v2}, Landroidx/compose/ui/unit/ConstraintsKt;->constrainHeight-K40F9xA(JI)I

    move-result v2

    if-eqz p12, :cond_2d

    move v4, v2

    goto :goto_23

    :cond_2d
    move v4, v3

    :goto_23
    if-eq v4, v0, :cond_2e

    .line 97
    invoke-interface {v1}, Ljava/util/Collection;->size()I

    move-result v0

    const/4 v5, 0x0

    :goto_24
    if-ge v5, v0, :cond_2e

    .line 98
    invoke-interface {v1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    .line 99
    check-cast v6, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;

    .line 100
    invoke-virtual {v6, v4}, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;->updateMainAxisLayoutSize(I)V

    add-int/lit8 v5, v5, 0x1

    goto :goto_24

    :cond_2e
    move v6, v2

    :goto_25
    move v5, v3

    goto :goto_26

    :cond_2f
    move v6, v4

    goto :goto_25

    .line 101
    :goto_26
    invoke-virtual/range {p2 .. p2}, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItemProvider;->getHeaderIndices()Landroidx/collection/IntList;

    move-result-object v2

    .line 102
    new-instance v7, Landroidx/compose/foundation/lazy/grid/LazyGridMeasureKt$measureLazyGrid$stickingItems$1;

    move-object/from16 v0, p2

    invoke-direct {v7, v13, v0}, Landroidx/compose/foundation/lazy/grid/LazyGridMeasureKt$measureLazyGrid$stickingItems$1;-><init>(Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLineProvider;Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItemProvider;)V

    move/from16 v3, p4

    move/from16 v4, p5

    move-object/from16 v0, p27

    invoke-static/range {v0 .. v7}, Landroidx/compose/foundation/lazy/layout/LazyLayoutStickyItemsKt;->applyStickyItems(Landroidx/compose/foundation/lazy/layout/StickyItemsPlacement;Ljava/util/List;Landroidx/collection/IntList;IIIILr6/c;)Ljava/util/List;

    move-result-object v0

    add-int/lit8 v2, p0, -0x1

    move/from16 v3, v52

    if-ne v3, v2, :cond_31

    if-le v14, v8, :cond_30

    goto :goto_27

    :cond_30
    const/4 v14, 0x0

    goto :goto_28

    :cond_31
    :goto_27
    move/from16 v14, v33

    .line 103
    :goto_28
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    new-instance v5, Landroidx/compose/foundation/lazy/grid/LazyGridMeasureKt$measureLazyGrid$6;

    move-object/from16 v6, p24

    invoke-direct {v5, v6, v1, v0, v12}, Landroidx/compose/foundation/lazy/grid/LazyGridMeasureKt$measureLazyGrid$6;-><init>(Landroidx/compose/runtime/MutableState;Ljava/util/List;Ljava/util/List;Z)V

    move-object/from16 v10, p28

    invoke-interface {v10, v2, v4, v5}, Lr6/f;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    move-object v5, v2

    check-cast v5, Landroidx/compose/ui/layout/MeasureResult;

    move/from16 v13, v36

    .line 104
    invoke-static {v13, v3, v1, v0}, Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItemKt;->updatedVisibleItems(IILjava/util/List;Ljava/util/List;)Ljava/util/List;

    move-result-object v12

    if-eqz p12, :cond_32

    .line 105
    sget-object v0, Landroidx/compose/foundation/gestures/Orientation;->Vertical:Landroidx/compose/foundation/gestures/Orientation;

    :goto_29
    move-object/from16 v17, v0

    goto :goto_2a

    :cond_32
    sget-object v0, Landroidx/compose/foundation/gestures/Orientation;->Horizontal:Landroidx/compose/foundation/gestures/Orientation;

    goto :goto_29

    .line 106
    :goto_2a
    new-instance v0, Landroidx/compose/foundation/lazy/grid/LazyGridMeasureResult;

    move/from16 v15, p0

    move/from16 v18, p5

    move/from16 v19, p6

    move/from16 v16, p15

    move-object/from16 v9, p16

    move/from16 v10, p18

    move-object/from16 v8, p23

    move v4, v11

    move v3, v14

    move/from16 v2, v25

    move/from16 v14, v32

    move/from16 v7, v34

    move/from16 v6, v35

    move-object/from16 v1, v37

    move/from16 v13, v38

    move-object/from16 v11, p26

    invoke-direct/range {v0 .. v19}, Landroidx/compose/foundation/lazy/grid/LazyGridMeasureResult;-><init>(Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLine;IZFLandroidx/compose/ui/layout/MeasureResult;FZLkotlinx/coroutines/v;Landroidx/compose/ui/unit/Density;ILr6/c;Ljava/util/List;IIIZLandroidx/compose/foundation/gestures/Orientation;II)V

    return-object v0
.end method
