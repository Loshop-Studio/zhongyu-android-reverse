.class public final Landroidx/compose/foundation/lazy/grid/LazyGridMeasureKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00a0\u0001\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0007\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u001aR\u0010\u0000\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00082\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000c0\n2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\nH\u0083\u0008\u00f8\u0001\u0000\u001a\u008c\u0001\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u00120\u00112\u000c\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u00140\u00012\u000c\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u00012\u000c\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u000f2\u0008\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\u0008\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010!\u001a\u00020\u000f2\u0006\u0010\"\u001a\u00020#H\u0002\u001a\u00ea\u0001\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u00082\u0006\u0010\'\u001a\u00020(2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010)\u001a\u00020\u000e2\u0006\u0010*\u001a\u00020\u000e2\u0006\u0010+\u001a\u00020\u000e2\u0006\u0010,\u001a\u00020\u000e2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020\u000e2\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u00020\u000c2\u0006\u0010\u001c\u001a\u00020\u000f2\u0008\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\u0008\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010!\u001a\u00020\u000f2\u0006\u0010\"\u001a\u00020#2\u0006\u00103\u001a\u0002042\u0006\u00105\u001a\u0002062\u0006\u0010\u0003\u001a\u00020\u00042/\u00107\u001a+\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u000209\u0012\u0004\u0012\u00020:0\n\u00a2\u0006\u0002\u0008;\u0012\u0004\u0012\u00020<08H\u0000\u00f8\u0001\u0001\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008=\u0010>\u001a$\u0010?\u001a\u00020\u0012*\u00020\u00022\u0006\u0010@\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u000eH\u0002\u0082\u0002\u000b\n\u0002\u0008\u0019\n\u0005\u0008\u00a1\u001e0\u0001\u00a8\u0006A"
    }
    d2 = {
        "calculateExtraItems",
        "",
        "Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;",
        "pinnedItems",
        "Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList;",
        "measuredItemProvider",
        "Landroidx/compose/foundation/lazy/grid/LazyMeasuredItemProvider;",
        "itemProvider",
        "Landroidx/compose/foundation/lazy/grid/LazyGridItemProvider;",
        "itemConstraints",
        "Lkotlin/Function1;",
        "Landroidx/compose/foundation/lazy/grid/ItemIndex;",
        "Landroidx/compose/ui/unit/Constraints;",
        "filter",
        "",
        "",
        "calculateItemsOffsets",
        "",
        "Landroidx/compose/foundation/lazy/grid/LazyGridPositionedItem;",
        "lines",
        "Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLine;",
        "itemsBefore",
        "itemsAfter",
        "layoutWidth",
        "layoutHeight",
        "finalMainAxisOffset",
        "maxOffset",
        "firstLineScrollOffset",
        "isVertical",
        "verticalArrangement",
        "Landroidx/compose/foundation/layout/Arrangement$Vertical;",
        "horizontalArrangement",
        "Landroidx/compose/foundation/layout/Arrangement$Horizontal;",
        "reverseLayout",
        "density",
        "Landroidx/compose/ui/unit/Density;",
        "measureLazyGrid",
        "Landroidx/compose/foundation/lazy/grid/LazyGridMeasureResult;",
        "itemsCount",
        "measuredLineProvider",
        "Landroidx/compose/foundation/lazy/grid/LazyMeasuredLineProvider;",
        "mainAxisAvailableSize",
        "beforeContentPadding",
        "afterContentPadding",
        "spaceBetweenLines",
        "firstVisibleLineIndex",
        "Landroidx/compose/foundation/lazy/grid/LineIndex;",
        "firstVisibleLineScrollOffset",
        "scrollToBeConsumed",
        "",
        "constraints",
        "placementAnimator",
        "Landroidx/compose/foundation/lazy/grid/LazyGridItemPlacementAnimator;",
        "spanLayoutProvider",
        "Landroidx/compose/foundation/lazy/grid/LazyGridSpanLayoutProvider;",
        "layout",
        "Lkotlin/Function3;",
        "Landroidx/compose/ui/layout/Placeable$PlacementScope;",
        "",
        "Lkotlin/ExtensionFunctionType;",
        "Landroidx/compose/ui/layout/MeasureResult;",
        "measureLazyGrid-t5wl_D8",
        "(ILandroidx/compose/foundation/lazy/grid/LazyGridItemProvider;Landroidx/compose/foundation/lazy/grid/LazyMeasuredLineProvider;Landroidx/compose/foundation/lazy/grid/LazyMeasuredItemProvider;IIIIIIFJZLandroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;ZLandroidx/compose/ui/unit/Density;Landroidx/compose/foundation/lazy/grid/LazyGridItemPlacementAnimator;Landroidx/compose/foundation/lazy/grid/LazyGridSpanLayoutProvider;Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList;Lkotlin/jvm/functions/Function3;)Landroidx/compose/foundation/lazy/grid/LazyGridMeasureResult;",
        "positionExtraItem",
        "mainAxisOffset",
        "foundation_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nLazyGridMeasure.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridMeasure.kt\nandroidx/compose/foundation/lazy/grid/LazyGridMeasureKt\n+ 2 ItemIndex.kt\nandroidx/compose/foundation/lazy/grid/LineIndex\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 4 TempListUtils.kt\nandroidx/compose/foundation/TempListUtilsKt\n*L\n1#1,435:1\n315#1,3:446\n318#1,14:453\n333#1:468\n315#1,3:469\n318#1,14:476\n333#1:491\n30#2:436\n25#2:441\n27#2:443\n25#2:444\n30#2:445\n33#3,4:437\n38#3:442\n33#3,4:449\n38#3:467\n33#3,4:472\n38#3:490\n33#3,4:495\n38#3:501\n33#3,6:503\n132#3,3:509\n33#3,4:512\n135#3,2:516\n38#3:518\n137#3:519\n33#3,6:520\n33#3,6:526\n33#3,6:532\n36#4,3:492\n39#4,2:499\n41#4:502\n*S KotlinDebug\n*F\n+ 1 LazyGridMeasure.kt\nandroidx/compose/foundation/lazy/grid/LazyGridMeasureKt\n*L\n213#1:446,3\n213#1:453,14\n213#1:468\n221#1:469,3\n221#1:476,14\n221#1:491\n118#1:436\n142#1:441\n163#1:443\n168#1:444\n178#1:445\n141#1:437,4\n141#1:442\n213#1:449,4\n213#1:467\n221#1:472,4\n221#1:490\n294#1:495,4\n294#1:501\n317#1:503,6\n360#1:509,3\n360#1:512,4\n360#1:516,2\n360#1:518\n360#1:519\n403#1:520,6\n409#1:526,6\n414#1:532,6\n294#1:492,3\n294#1:499,2\n294#1:502\n*E\n"
    }
.end annotation


# direct methods
.method private static final calculateExtraItems(Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList;Landroidx/compose/foundation/lazy/grid/LazyMeasuredItemProvider;Landroidx/compose/foundation/lazy/grid/LazyGridItemProvider;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ljava/util/List;
    .locals 15
    .annotation build Landroidx/compose/foundation/ExperimentalFoundationApi;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList;",
            "Landroidx/compose/foundation/lazy/grid/LazyMeasuredItemProvider;",
            "Landroidx/compose/foundation/lazy/grid/LazyGridItemProvider;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Landroidx/compose/foundation/lazy/grid/ItemIndex;",
            "Landroidx/compose/ui/unit/Constraints;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Integer;",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/util/List<",
            "Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v2, 0x0

    .line 7
    :goto_0
    if-ge v2, v0, :cond_2

    .line 8
    .line 9
    move-object v3, p0

    .line 10
    invoke-interface {p0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v4

    .line 14
    check-cast v4, Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList$PinnedItem;

    .line 15
    .line 16
    invoke-interface {v4}, Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList$PinnedItem;->getKey()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v5

    .line 20
    invoke-interface {v4}, Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList$PinnedItem;->getIndex()I

    .line 21
    .line 22
    .line 23
    move-result v4

    .line 24
    move-object/from16 v6, p2

    .line 25
    .line 26
    invoke-static {v6, v5, v4}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemProviderKt;->findIndexByKey(Landroidx/compose/foundation/lazy/layout/LazyLayoutItemProvider;Ljava/lang/Object;I)I

    .line 27
    .line 28
    .line 29
    move-result v4

    .line 30
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 31
    .line 32
    .line 33
    move-result-object v5

    .line 34
    move-object/from16 v7, p4

    .line 35
    .line 36
    invoke-interface {v7, v5}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v5

    .line 40
    check-cast v5, Ljava/lang/Boolean;

    .line 41
    .line 42
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 43
    .line 44
    .line 45
    move-result v5

    .line 46
    if-eqz v5, :cond_1

    .line 47
    .line 48
    invoke-static {v4}, Landroidx/compose/foundation/lazy/grid/ItemIndex;->constructor-impl(I)I

    .line 49
    .line 50
    .line 51
    move-result v9

    .line 52
    invoke-static {v9}, Landroidx/compose/foundation/lazy/grid/ItemIndex;->box-impl(I)Landroidx/compose/foundation/lazy/grid/ItemIndex;

    .line 53
    .line 54
    .line 55
    move-result-object v4

    .line 56
    move-object/from16 v5, p3

    .line 57
    .line 58
    invoke-interface {v5, v4}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v4

    .line 62
    check-cast v4, Landroidx/compose/ui/unit/Constraints;

    .line 63
    .line 64
    invoke-virtual {v4}, Landroidx/compose/ui/unit/Constraints;->unbox-impl()J

    .line 65
    .line 66
    .line 67
    move-result-wide v11

    .line 68
    const/4 v10, 0x0

    .line 69
    const/4 v13, 0x2

    .line 70
    const/4 v14, 0x0

    .line 71
    move-object/from16 v8, p1

    .line 72
    .line 73
    invoke-static/range {v8 .. v14}, Landroidx/compose/foundation/lazy/grid/LazyMeasuredItemProvider;->getAndMeasure-ednRnyU$default(Landroidx/compose/foundation/lazy/grid/LazyMeasuredItemProvider;IIJILjava/lang/Object;)Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;

    .line 74
    .line 75
    .line 76
    move-result-object v4

    .line 77
    if-nez v1, :cond_0

    .line 78
    .line 79
    new-instance v1, Ljava/util/ArrayList;

    .line 80
    .line 81
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 82
    .line 83
    .line 84
    :cond_0
    invoke-interface {v1, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 85
    .line 86
    .line 87
    goto :goto_1

    .line 88
    :cond_1
    move-object/from16 v5, p3

    .line 89
    .line 90
    :goto_1
    add-int/lit8 v2, v2, 0x1

    .line 91
    .line 92
    goto :goto_0

    .line 93
    :cond_2
    if-nez v1, :cond_3

    .line 94
    .line 95
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    .line 96
    .line 97
    .line 98
    move-result-object v1

    .line 99
    :cond_3
    return-object v1
.end method

.method private static final calculateItemsOffsets(Ljava/util/List;Ljava/util/List;Ljava/util/List;IIIIIZLandroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;ZLandroidx/compose/ui/unit/Density;)Ljava/util/List;
    .locals 14
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
            "Landroidx/compose/foundation/lazy/grid/LazyGridPositionedItem;",
            ">;"
        }
    .end annotation

    .line 1
    move-object v0, p0

    .line 2
    move/from16 v1, p3

    .line 3
    .line 4
    move/from16 v2, p4

    .line 5
    .line 6
    move-object/from16 v3, p9

    .line 7
    .line 8
    move/from16 v4, p11

    .line 9
    .line 10
    move/from16 v5, p6

    .line 11
    .line 12
    if-eqz p8, :cond_0

    .line 13
    .line 14
    move v6, v2

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    move v6, v1

    .line 17
    :goto_0
    invoke-static {v6, v5}, Ljava/lang/Math;->min(II)I

    .line 18
    .line 19
    .line 20
    move-result v5

    .line 21
    const/4 v7, 0x1

    .line 22
    const/4 v8, 0x0

    .line 23
    move/from16 v9, p5

    .line 24
    .line 25
    if-ge v9, v5, :cond_1

    .line 26
    .line 27
    move v5, v7

    .line 28
    goto :goto_1

    .line 29
    :cond_1
    move v5, v8

    .line 30
    :goto_1
    if-eqz v5, :cond_4

    .line 31
    .line 32
    if-nez p7, :cond_2

    .line 33
    .line 34
    move v9, v7

    .line 35
    goto :goto_2

    .line 36
    :cond_2
    move v9, v8

    .line 37
    :goto_2
    if-eqz v9, :cond_3

    .line 38
    .line 39
    goto :goto_3

    .line 40
    :cond_3
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 41
    .line 42
    const-string v1, "Check failed."

    .line 43
    .line 44
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    throw v0

    .line 52
    :cond_4
    :goto_3
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 53
    .line 54
    .line 55
    move-result v9

    .line 56
    move v10, v8

    .line 57
    move v11, v10

    .line 58
    :goto_4
    if-ge v10, v9, :cond_5

    .line 59
    .line 60
    invoke-interface {p0, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v12

    .line 64
    check-cast v12, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLine;

    .line 65
    .line 66
    invoke-virtual {v12}, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLine;->getItems()[Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;

    .line 67
    .line 68
    .line 69
    move-result-object v12

    .line 70
    array-length v12, v12

    .line 71
    add-int/2addr v11, v12

    .line 72
    add-int/lit8 v10, v10, 0x1

    .line 73
    .line 74
    goto :goto_4

    .line 75
    :cond_5
    new-instance v9, Ljava/util/ArrayList;

    .line 76
    .line 77
    invoke-direct {v9, v11}, Ljava/util/ArrayList;-><init>(I)V

    .line 78
    .line 79
    .line 80
    if-eqz v5, :cond_11

    .line 81
    .line 82
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 83
    .line 84
    .line 85
    move-result v5

    .line 86
    if-eqz v5, :cond_6

    .line 87
    .line 88
    invoke-interface/range {p2 .. p2}, Ljava/util/List;->isEmpty()Z

    .line 89
    .line 90
    .line 91
    move-result v5

    .line 92
    if-eqz v5, :cond_6

    .line 93
    .line 94
    goto :goto_5

    .line 95
    :cond_6
    move v7, v8

    .line 96
    :goto_5
    if-eqz v7, :cond_10

    .line 97
    .line 98
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 99
    .line 100
    .line 101
    move-result v5

    .line 102
    new-array v7, v5, [I

    .line 103
    .line 104
    move v10, v8

    .line 105
    :goto_6
    if-ge v10, v5, :cond_7

    .line 106
    .line 107
    invoke-static {v10, v4, v5}, Landroidx/compose/foundation/lazy/grid/LazyGridMeasureKt;->calculateItemsOffsets$reverseAware(IZI)I

    .line 108
    .line 109
    .line 110
    move-result v11

    .line 111
    invoke-interface {p0, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object v11

    .line 115
    check-cast v11, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLine;

    .line 116
    .line 117
    invoke-virtual {v11}, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLine;->getMainAxisSize()I

    .line 118
    .line 119
    .line 120
    move-result v11

    .line 121
    aput v11, v7, v10

    .line 122
    .line 123
    add-int/lit8 v10, v10, 0x1

    .line 124
    .line 125
    goto :goto_6

    .line 126
    :cond_7
    new-array v10, v5, [I

    .line 127
    .line 128
    move v11, v8

    .line 129
    :goto_7
    if-ge v11, v5, :cond_8

    .line 130
    .line 131
    aput v8, v10, v11

    .line 132
    .line 133
    add-int/lit8 v11, v11, 0x1

    .line 134
    .line 135
    goto :goto_7

    .line 136
    :cond_8
    const-string v8, "Required value was null."

    .line 137
    .line 138
    if-eqz p8, :cond_a

    .line 139
    .line 140
    if-eqz v3, :cond_9

    .line 141
    .line 142
    move-object/from16 v11, p12

    .line 143
    .line 144
    invoke-interface {v3, v11, v6, v7, v10}, Landroidx/compose/foundation/layout/Arrangement$Vertical;->arrange(Landroidx/compose/ui/unit/Density;I[I[I)V

    .line 145
    .line 146
    .line 147
    goto :goto_8

    .line 148
    :cond_9
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 149
    .line 150
    invoke-virtual {v8}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object v1

    .line 154
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 155
    .line 156
    .line 157
    throw v0

    .line 158
    :cond_a
    move-object/from16 v11, p12

    .line 159
    .line 160
    if-eqz p10, :cond_f

    .line 161
    .line 162
    sget-object v3, Landroidx/compose/ui/unit/LayoutDirection;->Ltr:Landroidx/compose/ui/unit/LayoutDirection;

    .line 163
    .line 164
    move-object/from16 p5, p10

    .line 165
    .line 166
    move-object/from16 p6, p12

    .line 167
    .line 168
    move/from16 p7, v6

    .line 169
    .line 170
    move-object/from16 p8, v7

    .line 171
    .line 172
    move-object/from16 p9, v3

    .line 173
    .line 174
    move-object/from16 p10, v10

    .line 175
    .line 176
    invoke-interface/range {p5 .. p10}, Landroidx/compose/foundation/layout/Arrangement$Horizontal;->arrange(Landroidx/compose/ui/unit/Density;I[ILandroidx/compose/ui/unit/LayoutDirection;[I)V

    .line 177
    .line 178
    .line 179
    :goto_8
    invoke-static {v10}, Lkotlin/collections/ArraysKt;->getIndices([I)Lkotlin/ranges/IntRange;

    .line 180
    .line 181
    .line 182
    move-result-object v3

    .line 183
    if-eqz v4, :cond_b

    .line 184
    .line 185
    invoke-static {v3}, Lkotlin/ranges/RangesKt;->reversed(Lkotlin/ranges/IntProgression;)Lkotlin/ranges/IntProgression;

    .line 186
    .line 187
    .line 188
    move-result-object v3

    .line 189
    :cond_b
    invoke-virtual {v3}, Lkotlin/ranges/IntProgression;->getFirst()I

    .line 190
    .line 191
    .line 192
    move-result v7

    .line 193
    invoke-virtual {v3}, Lkotlin/ranges/IntProgression;->getLast()I

    .line 194
    .line 195
    .line 196
    move-result v8

    .line 197
    invoke-virtual {v3}, Lkotlin/ranges/IntProgression;->getStep()I

    .line 198
    .line 199
    .line 200
    move-result v3

    .line 201
    if-lez v3, :cond_c

    .line 202
    .line 203
    if-le v7, v8, :cond_d

    .line 204
    .line 205
    :cond_c
    if-gez v3, :cond_14

    .line 206
    .line 207
    if-gt v8, v7, :cond_14

    .line 208
    .line 209
    :cond_d
    :goto_9
    aget v11, v10, v7

    .line 210
    .line 211
    invoke-static {v7, v4, v5}, Landroidx/compose/foundation/lazy/grid/LazyGridMeasureKt;->calculateItemsOffsets$reverseAware(IZI)I

    .line 212
    .line 213
    .line 214
    move-result v12

    .line 215
    invoke-interface {p0, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 216
    .line 217
    .line 218
    move-result-object v12

    .line 219
    check-cast v12, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLine;

    .line 220
    .line 221
    if-eqz v4, :cond_e

    .line 222
    .line 223
    sub-int v11, v6, v11

    .line 224
    .line 225
    invoke-virtual {v12}, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLine;->getMainAxisSize()I

    .line 226
    .line 227
    .line 228
    move-result v13

    .line 229
    sub-int/2addr v11, v13

    .line 230
    :cond_e
    invoke-virtual {v12, v11, v1, v2}, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLine;->position(III)Ljava/util/List;

    .line 231
    .line 232
    .line 233
    move-result-object v11

    .line 234
    invoke-virtual {v9, v11}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 235
    .line 236
    .line 237
    if-eq v7, v8, :cond_14

    .line 238
    .line 239
    add-int/2addr v7, v3

    .line 240
    goto :goto_9

    .line 241
    :cond_f
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 242
    .line 243
    invoke-virtual {v8}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 244
    .line 245
    .line 246
    move-result-object v1

    .line 247
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 248
    .line 249
    .line 250
    throw v0

    .line 251
    :cond_10
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 252
    .line 253
    const-string v1, "Failed requirement."

    .line 254
    .line 255
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 256
    .line 257
    .line 258
    move-result-object v1

    .line 259
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 260
    .line 261
    .line 262
    throw v0

    .line 263
    :cond_11
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 264
    .line 265
    .line 266
    move-result v3

    .line 267
    move/from16 v5, p7

    .line 268
    .line 269
    move v4, v8

    .line 270
    :goto_a
    if-ge v4, v3, :cond_12

    .line 271
    .line 272
    move-object v6, p1

    .line 273
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 274
    .line 275
    .line 276
    move-result-object v7

    .line 277
    check-cast v7, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;

    .line 278
    .line 279
    invoke-virtual {v7}, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;->getMainAxisSizeWithSpacings()I

    .line 280
    .line 281
    .line 282
    move-result v10

    .line 283
    sub-int/2addr v5, v10

    .line 284
    invoke-static {v7, v5, v1, v2}, Landroidx/compose/foundation/lazy/grid/LazyGridMeasureKt;->positionExtraItem(Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;III)Landroidx/compose/foundation/lazy/grid/LazyGridPositionedItem;

    .line 285
    .line 286
    .line 287
    move-result-object v7

    .line 288
    invoke-virtual {v9, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 289
    .line 290
    .line 291
    add-int/lit8 v4, v4, 0x1

    .line 292
    .line 293
    goto :goto_a

    .line 294
    :cond_12
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 295
    .line 296
    .line 297
    move-result v3

    .line 298
    move/from16 v4, p7

    .line 299
    .line 300
    move v5, v8

    .line 301
    :goto_b
    if-ge v5, v3, :cond_13

    .line 302
    .line 303
    invoke-interface {p0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 304
    .line 305
    .line 306
    move-result-object v6

    .line 307
    check-cast v6, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLine;

    .line 308
    .line 309
    invoke-virtual {v6, v4, v1, v2}, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLine;->position(III)Ljava/util/List;

    .line 310
    .line 311
    .line 312
    move-result-object v7

    .line 313
    invoke-virtual {v9, v7}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 314
    .line 315
    .line 316
    invoke-virtual {v6}, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLine;->getMainAxisSizeWithSpacings()I

    .line 317
    .line 318
    .line 319
    move-result v6

    .line 320
    add-int/2addr v4, v6

    .line 321
    add-int/lit8 v5, v5, 0x1

    .line 322
    .line 323
    goto :goto_b

    .line 324
    :cond_13
    invoke-interface/range {p2 .. p2}, Ljava/util/List;->size()I

    .line 325
    .line 326
    .line 327
    move-result v0

    .line 328
    :goto_c
    if-ge v8, v0, :cond_14

    .line 329
    .line 330
    move-object/from16 v3, p2

    .line 331
    .line 332
    invoke-interface {v3, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 333
    .line 334
    .line 335
    move-result-object v5

    .line 336
    check-cast v5, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;

    .line 337
    .line 338
    invoke-static {v5, v4, v1, v2}, Landroidx/compose/foundation/lazy/grid/LazyGridMeasureKt;->positionExtraItem(Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;III)Landroidx/compose/foundation/lazy/grid/LazyGridPositionedItem;

    .line 339
    .line 340
    .line 341
    move-result-object v6

    .line 342
    invoke-virtual {v9, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 343
    .line 344
    .line 345
    invoke-virtual {v5}, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;->getMainAxisSizeWithSpacings()I

    .line 346
    .line 347
    .line 348
    move-result v5

    .line 349
    add-int/2addr v4, v5

    .line 350
    add-int/lit8 v8, v8, 0x1

    .line 351
    .line 352
    goto :goto_c

    .line 353
    :cond_14
    return-object v9
.end method

.method private static final calculateItemsOffsets$reverseAware(IZI)I
    .locals 0

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    sub-int/2addr p2, p0

    add-int/lit8 p0, p2, -0x1

    :goto_0
    return p0
.end method

.method public static final measureLazyGrid-t5wl_D8(ILandroidx/compose/foundation/lazy/grid/LazyGridItemProvider;Landroidx/compose/foundation/lazy/grid/LazyMeasuredLineProvider;Landroidx/compose/foundation/lazy/grid/LazyMeasuredItemProvider;IIIIIIFJZLandroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;ZLandroidx/compose/ui/unit/Density;Landroidx/compose/foundation/lazy/grid/LazyGridItemPlacementAnimator;Landroidx/compose/foundation/lazy/grid/LazyGridSpanLayoutProvider;Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList;Lkotlin/jvm/functions/Function3;)Landroidx/compose/foundation/lazy/grid/LazyGridMeasureResult;
    .locals 34
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Landroidx/compose/foundation/lazy/grid/LazyGridItemProvider;",
            "Landroidx/compose/foundation/lazy/grid/LazyMeasuredLineProvider;",
            "Landroidx/compose/foundation/lazy/grid/LazyMeasuredItemProvider;",
            "IIIIIIFJZ",
            "Landroidx/compose/foundation/layout/Arrangement$Vertical;",
            "Landroidx/compose/foundation/layout/Arrangement$Horizontal;",
            "Z",
            "Landroidx/compose/ui/unit/Density;",
            "Landroidx/compose/foundation/lazy/grid/LazyGridItemPlacementAnimator;",
            "Landroidx/compose/foundation/lazy/grid/LazyGridSpanLayoutProvider;",
            "Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList;",
            "Lkotlin/jvm/functions/Function3<",
            "-",
            "Ljava/lang/Integer;",
            "-",
            "Ljava/lang/Integer;",
            "-",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Landroidx/compose/ui/layout/Placeable$PlacementScope;",
            "Lkotlin/Unit;",
            ">;+",
            "Landroidx/compose/ui/layout/MeasureResult;",
            ">;)",
            "Landroidx/compose/foundation/lazy/grid/LazyGridMeasureResult;"
        }
    .end annotation

    move/from16 v9, p0

    move-object/from16 v0, p1

    move-object/from16 v1, p2

    move/from16 v2, p4

    move/from16 v3, p5

    move-wide/from16 v4, p11

    move-object/from16 v6, p20

    move-object/from16 v7, p21

    const-string v8, "itemProvider"

    invoke-static {v0, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v8, "measuredLineProvider"

    invoke-static {v1, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v8, "measuredItemProvider"

    move-object/from16 v15, p3

    invoke-static {v15, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v8, "density"

    move-object/from16 v13, p17

    invoke-static {v13, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v8, "placementAnimator"

    move-object/from16 v14, p18

    invoke-static {v14, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v8, "spanLayoutProvider"

    move-object/from16 v12, p19

    invoke-static {v12, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v8, "pinnedItems"

    invoke-static {v6, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v8, "layout"

    invoke-static {v7, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v11, 0x0

    if-ltz v3, :cond_0

    const/4 v10, 0x1

    goto :goto_0

    :cond_0
    move v10, v11

    :goto_0
    const-string v16, "Failed requirement."

    if-eqz v10, :cond_2d

    if-ltz p6, :cond_1

    const/4 v10, 0x1

    goto :goto_1

    :cond_1
    move v10, v11

    :goto_1
    if-eqz v10, :cond_2c

    if-gtz v9, :cond_3

    .line 1
    new-instance v14, Landroidx/compose/foundation/lazy/grid/LazyGridMeasureResult;

    const/4 v1, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    .line 2
    invoke-static/range {p11 .. p12}, Landroidx/compose/ui/unit/Constraints;->getMinWidth-impl(J)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static/range {p11 .. p12}, Landroidx/compose/ui/unit/Constraints;->getMinHeight-impl(J)I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    sget-object v5, Landroidx/compose/foundation/lazy/grid/LazyGridMeasureKt$measureLazyGrid$1;->INSTANCE:Landroidx/compose/foundation/lazy/grid/LazyGridMeasureKt$measureLazyGrid$1;

    invoke-interface {v7, v0, v4, v5}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroidx/compose/ui/layout/MeasureResult;

    .line 3
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v7

    neg-int v10, v3

    add-int v11, v2, p6

    const/4 v12, 0x0

    if-eqz p13, :cond_2

    .line 4
    sget-object v0, Landroidx/compose/foundation/gestures/Orientation;->Vertical:Landroidx/compose/foundation/gestures/Orientation;

    goto :goto_2

    :cond_2
    sget-object v0, Landroidx/compose/foundation/gestures/Orientation;->Horizontal:Landroidx/compose/foundation/gestures/Orientation;

    :goto_2
    move-object v13, v0

    move-object v0, v14

    move v2, v6

    move v3, v8

    move v4, v9

    move-object v6, v7

    move v7, v10

    move v8, v11

    move v9, v12

    move/from16 v10, p16

    move-object v11, v13

    move/from16 v12, p6

    move/from16 v13, p7

    .line 5
    invoke-direct/range {v0 .. v13}, Landroidx/compose/foundation/lazy/grid/LazyGridMeasureResult;-><init>(Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLine;IZFLandroidx/compose/ui/layout/MeasureResult;Ljava/util/List;IIIZLandroidx/compose/foundation/gestures/Orientation;II)V

    return-object v14

    .line 6
    :cond_3
    invoke-static/range {p10 .. p10}, Lkotlin/math/MathKt;->roundToInt(F)I

    move-result v10

    sub-int v17, p9, v10

    .line 7
    invoke-static {v11}, Landroidx/compose/foundation/lazy/grid/LineIndex;->constructor-impl(I)I

    move-result v8

    move/from16 v11, p8

    invoke-static {v11, v8}, Landroidx/compose/foundation/lazy/grid/LineIndex;->equals-impl0(II)Z

    move-result v8

    if-eqz v8, :cond_4

    if-gez v17, :cond_4

    add-int v10, v10, v17

    const/16 v17, 0x0

    .line 8
    :cond_4
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    neg-int v15, v3

    if-gez p7, :cond_5

    move/from16 v19, p7

    goto :goto_3

    :cond_5
    const/16 v19, 0x0

    :goto_3
    add-int v11, v15, v19

    add-int v17, v17, v11

    move/from16 v12, v17

    move/from16 v17, p8

    :goto_4
    if-gez v12, :cond_6

    const/16 p8, 0x0

    .line 9
    invoke-static/range {p8 .. p8}, Landroidx/compose/foundation/lazy/grid/LineIndex;->constructor-impl(I)I

    move-result v18

    sub-int v18, v17, v18

    if-lez v18, :cond_6

    add-int/lit8 v17, v17, -0x1

    .line 10
    invoke-static/range {v17 .. v17}, Landroidx/compose/foundation/lazy/grid/LineIndex;->constructor-impl(I)I

    move-result v13

    .line 11
    invoke-virtual {v1, v13}, Landroidx/compose/foundation/lazy/grid/LazyMeasuredLineProvider;->getAndMeasure-bKFJvoY(I)Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLine;

    move-result-object v14

    move/from16 p9, v13

    move/from16 v13, p8

    .line 12
    invoke-interface {v8, v13, v14}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 13
    invoke-virtual {v14}, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLine;->getMainAxisSizeWithSpacings()I

    move-result v13

    add-int/2addr v12, v13

    move/from16 v17, p9

    move-object/from16 v13, p17

    move-object/from16 v14, p18

    goto :goto_4

    :cond_6
    if-ge v12, v11, :cond_7

    add-int/2addr v10, v12

    move v12, v11

    :cond_7
    sub-int/2addr v12, v11

    add-int v13, v2, p6

    move/from16 v19, v15

    const/4 v14, 0x0

    .line 14
    invoke-static {v13, v14}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    move-result v15

    neg-int v14, v12

    move/from16 p8, v12

    .line 15
    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v12

    move/from16 v20, v14

    move/from16 v21, v17

    const/4 v14, 0x0

    :goto_5
    if-ge v14, v12, :cond_8

    .line 16
    invoke-interface {v8, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v22

    .line 17
    check-cast v22, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLine;

    add-int/lit8 v21, v21, 0x1

    .line 18
    invoke-static/range {v21 .. v21}, Landroidx/compose/foundation/lazy/grid/LineIndex;->constructor-impl(I)I

    move-result v21

    .line 19
    invoke-virtual/range {v22 .. v22}, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLine;->getMainAxisSizeWithSpacings()I

    move-result v22

    add-int v20, v20, v22

    add-int/lit8 v14, v14, 0x1

    goto :goto_5

    :cond_8
    move/from16 v12, p8

    move/from16 p8, v13

    move/from16 v14, v20

    move/from16 v13, v21

    :goto_6
    if-ge v13, v9, :cond_d

    if-lt v14, v15, :cond_9

    if-lez v14, :cond_9

    .line 20
    invoke-interface {v8}, Ljava/util/List;->isEmpty()Z

    move-result v20

    if-eqz v20, :cond_d

    :cond_9
    move/from16 p9, v15

    .line 21
    invoke-virtual {v1, v13}, Landroidx/compose/foundation/lazy/grid/LazyMeasuredLineProvider;->getAndMeasure-bKFJvoY(I)Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLine;

    move-result-object v15

    .line 22
    invoke-virtual {v15}, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLine;->isEmpty()Z

    move-result v20

    if-eqz v20, :cond_a

    goto :goto_8

    .line 23
    :cond_a
    invoke-virtual {v15}, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLine;->getMainAxisSizeWithSpacings()I

    move-result v20

    add-int v14, v14, v20

    if-gt v14, v11, :cond_b

    .line 24
    invoke-virtual {v15}, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLine;->getItems()[Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;

    move-result-object v20

    invoke-static/range {v20 .. v20}, Lkotlin/collections/ArraysKt;->last([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v20

    check-cast v20, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;

    move/from16 v21, v11

    invoke-virtual/range {v20 .. v20}, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;->getIndex-VZbfaAc()I

    move-result v11

    move/from16 v20, v14

    add-int/lit8 v14, v9, -0x1

    if-eq v11, v14, :cond_c

    add-int/lit8 v11, v13, 0x1

    .line 25
    invoke-static {v11}, Landroidx/compose/foundation/lazy/grid/LineIndex;->constructor-impl(I)I

    move-result v11

    .line 26
    invoke-virtual {v15}, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLine;->getMainAxisSizeWithSpacings()I

    move-result v14

    sub-int/2addr v12, v14

    move/from16 v17, v11

    goto :goto_7

    :cond_b
    move/from16 v21, v11

    move/from16 v20, v14

    .line 27
    :cond_c
    invoke-interface {v8, v15}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_7
    add-int/lit8 v13, v13, 0x1

    .line 28
    invoke-static {v13}, Landroidx/compose/foundation/lazy/grid/LineIndex;->constructor-impl(I)I

    move-result v13

    move/from16 v15, p9

    move/from16 v14, v20

    move/from16 v11, v21

    goto :goto_6

    :cond_d
    :goto_8
    if-ge v14, v2, :cond_f

    sub-int v11, v2, v14

    sub-int/2addr v12, v11

    add-int/2addr v14, v11

    :goto_9
    const/4 v13, 0x0

    if-ge v12, v3, :cond_e

    .line 29
    invoke-static {v13}, Landroidx/compose/foundation/lazy/grid/LineIndex;->constructor-impl(I)I

    move-result v15

    sub-int v15, v17, v15

    if-lez v15, :cond_e

    add-int/lit8 v17, v17, -0x1

    .line 30
    invoke-static/range {v17 .. v17}, Landroidx/compose/foundation/lazy/grid/LineIndex;->constructor-impl(I)I

    move-result v15

    .line 31
    invoke-virtual {v1, v15}, Landroidx/compose/foundation/lazy/grid/LazyMeasuredLineProvider;->getAndMeasure-bKFJvoY(I)Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLine;

    move-result-object v7

    .line 32
    invoke-interface {v8, v13, v7}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 33
    invoke-virtual {v7}, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLine;->getMainAxisSizeWithSpacings()I

    move-result v7

    add-int/2addr v12, v7

    move-object/from16 v7, p21

    move/from16 v17, v15

    goto :goto_9

    :cond_e
    add-int/2addr v10, v11

    if-gez v12, :cond_10

    add-int/2addr v10, v12

    add-int/2addr v14, v12

    move v7, v13

    goto :goto_a

    :cond_f
    const/4 v13, 0x0

    :cond_10
    move v7, v12

    :goto_a
    move v15, v14

    .line 34
    invoke-static/range {p10 .. p10}, Lkotlin/math/MathKt;->roundToInt(F)I

    move-result v11

    invoke-static {v11}, Lkotlin/math/MathKt;->getSign(I)I

    move-result v11

    invoke-static {v10}, Lkotlin/math/MathKt;->getSign(I)I

    move-result v12

    if-ne v11, v12, :cond_11

    .line 35
    invoke-static/range {p10 .. p10}, Lkotlin/math/MathKt;->roundToInt(F)I

    move-result v11

    invoke-static {v11}, Ljava/lang/Math;->abs(I)I

    move-result v11

    invoke-static {v10}, Ljava/lang/Math;->abs(I)I

    move-result v12

    if-lt v11, v12, :cond_11

    int-to-float v10, v10

    move v14, v10

    goto :goto_b

    :cond_11
    move/from16 v14, p10

    :goto_b
    if-ltz v7, :cond_12

    const/4 v10, 0x1

    goto :goto_c

    :cond_12
    move v10, v13

    :goto_c
    if-eqz v10, :cond_2b

    neg-int v12, v7

    .line 36
    invoke-static {v8}, Lkotlin/collections/CollectionsKt;->first(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v10

    move-object/from16 v17, v10

    check-cast v17, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLine;

    .line 37
    invoke-virtual/range {v17 .. v17}, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLine;->getItems()[Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;

    move-result-object v10

    invoke-static {v10}, Lkotlin/collections/ArraysKt;->firstOrNull([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;

    if-eqz v10, :cond_13

    invoke-virtual {v10}, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;->getIndex-VZbfaAc()I

    move-result v10

    move v11, v10

    goto :goto_d

    :cond_13
    move v11, v13

    .line 38
    :goto_d
    invoke-static {v8}, Lkotlin/collections/CollectionsKt;->lastOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLine;

    if-eqz v10, :cond_14

    invoke-virtual {v10}, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLine;->getItems()[Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;

    move-result-object v10

    if-eqz v10, :cond_14

    invoke-static {v10}, Lkotlin/collections/ArraysKt;->lastOrNull([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;

    if-eqz v10, :cond_14

    invoke-virtual {v10}, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;->getIndex-VZbfaAc()I

    move-result v10

    goto :goto_e

    :cond_14
    move v10, v13

    :goto_e
    move/from16 p9, v15

    .line 39
    invoke-interface/range {p20 .. p20}, Ljava/util/List;->size()I

    move-result v15

    const/16 v18, 0x0

    move/from16 v16, v12

    move v12, v13

    move-object/from16 v20, v18

    :goto_f
    if-ge v12, v15, :cond_18

    .line 40
    invoke-interface {v6, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v21

    .line 41
    check-cast v21, Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList$PinnedItem;

    .line 42
    invoke-interface/range {v21 .. v21}, Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList$PinnedItem;->getKey()Ljava/lang/Object;

    move-result-object v13

    move/from16 v23, v7

    invoke-interface/range {v21 .. v21}, Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList$PinnedItem;->getIndex()I

    move-result v7

    invoke-static {v0, v13, v7}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemProviderKt;->findIndexByKey(Landroidx/compose/foundation/lazy/layout/LazyLayoutItemProvider;Ljava/lang/Object;I)I

    move-result v7

    if-ltz v7, :cond_15

    if-ge v7, v11, :cond_15

    const/4 v13, 0x1

    goto :goto_10

    :cond_15
    const/4 v13, 0x0

    :goto_10
    if-eqz v13, :cond_17

    .line 43
    invoke-static {v7}, Landroidx/compose/foundation/lazy/grid/ItemIndex;->constructor-impl(I)I

    move-result v7

    .line 44
    invoke-virtual {v1, v7}, Landroidx/compose/foundation/lazy/grid/LazyMeasuredLineProvider;->itemConstraints-HZ0wssc(I)J

    move-result-wide v24

    const/4 v13, 0x0

    const/16 v21, 0x2

    const/16 v26, 0x0

    move/from16 v27, v10

    move-object/from16 v10, p3

    move/from16 v29, v11

    const/16 v28, 0x0

    move v11, v7

    move/from16 v22, v12

    move/from16 v7, v16

    move v12, v13

    move/from16 v30, p8

    move/from16 v31, v14

    move-wide/from16 v13, v24

    move/from16 v32, p9

    move/from16 v24, v19

    move/from16 v19, v15

    move/from16 v15, v21

    move-object/from16 v16, v26

    .line 45
    invoke-static/range {v10 .. v16}, Landroidx/compose/foundation/lazy/grid/LazyMeasuredItemProvider;->getAndMeasure-ednRnyU$default(Landroidx/compose/foundation/lazy/grid/LazyMeasuredItemProvider;IIJILjava/lang/Object;)Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;

    move-result-object v10

    if-nez v20, :cond_16

    .line 46
    new-instance v11, Ljava/util/ArrayList;

    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    goto :goto_11

    :cond_16
    move-object/from16 v11, v20

    .line 47
    :goto_11
    invoke-interface {v11, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move-object/from16 v20, v11

    goto :goto_12

    :cond_17
    move/from16 v30, p8

    move/from16 v32, p9

    move/from16 v27, v10

    move/from16 v29, v11

    move/from16 v22, v12

    move/from16 v31, v14

    move/from16 v7, v16

    move/from16 v24, v19

    const/16 v28, 0x0

    move/from16 v19, v15

    :goto_12
    add-int/lit8 v12, v22, 0x1

    move/from16 v16, v7

    move/from16 v15, v19

    move/from16 v7, v23

    move/from16 v19, v24

    move/from16 v10, v27

    move/from16 v13, v28

    move/from16 v11, v29

    move/from16 p8, v30

    move/from16 v14, v31

    move/from16 p9, v32

    goto/16 :goto_f

    :cond_18
    move/from16 v30, p8

    move/from16 v32, p9

    move/from16 v23, v7

    move/from16 v27, v10

    move/from16 v29, v11

    move/from16 v28, v13

    move/from16 v31, v14

    move/from16 v7, v16

    move/from16 v24, v19

    if-nez v20, :cond_19

    .line 48
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v20

    :cond_19
    move-object/from16 v25, v20

    .line 49
    invoke-interface/range {p20 .. p20}, Ljava/util/List;->size()I

    move-result v15

    move/from16 v13, v28

    :goto_13
    if-ge v13, v15, :cond_1d

    .line 50
    invoke-interface {v6, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v10

    .line 51
    check-cast v10, Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList$PinnedItem;

    .line 52
    invoke-interface {v10}, Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList$PinnedItem;->getKey()Ljava/lang/Object;

    move-result-object v11

    invoke-interface {v10}, Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList$PinnedItem;->getIndex()I

    move-result v10

    invoke-static {v0, v11, v10}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemProviderKt;->findIndexByKey(Landroidx/compose/foundation/lazy/layout/LazyLayoutItemProvider;Ljava/lang/Object;I)I

    move-result v10

    move/from16 v14, v27

    add-int/lit8 v11, v14, 0x1

    if-gt v11, v10, :cond_1a

    if-ge v10, v9, :cond_1a

    const/4 v11, 0x1

    goto :goto_14

    :cond_1a
    move/from16 v11, v28

    :goto_14
    if-eqz v11, :cond_1c

    .line 53
    invoke-static {v10}, Landroidx/compose/foundation/lazy/grid/ItemIndex;->constructor-impl(I)I

    move-result v11

    .line 54
    invoke-virtual {v1, v11}, Landroidx/compose/foundation/lazy/grid/LazyMeasuredLineProvider;->itemConstraints-HZ0wssc(I)J

    move-result-wide v19

    const/4 v12, 0x0

    const/16 v16, 0x2

    const/16 v21, 0x0

    move-object/from16 v10, p3

    move/from16 v22, v13

    move/from16 v33, v14

    move-wide/from16 v13, v19

    move/from16 v19, v15

    move/from16 v15, v16

    move-object/from16 v16, v21

    .line 55
    invoke-static/range {v10 .. v16}, Landroidx/compose/foundation/lazy/grid/LazyMeasuredItemProvider;->getAndMeasure-ednRnyU$default(Landroidx/compose/foundation/lazy/grid/LazyMeasuredItemProvider;IIJILjava/lang/Object;)Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;

    move-result-object v10

    if-nez v18, :cond_1b

    .line 56
    new-instance v18, Ljava/util/ArrayList;

    invoke-direct/range {v18 .. v18}, Ljava/util/ArrayList;-><init>()V

    :cond_1b
    move-object/from16 v11, v18

    .line 57
    invoke-interface {v11, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move-object/from16 v18, v11

    goto :goto_15

    :cond_1c
    move/from16 v22, v13

    move/from16 v33, v14

    move/from16 v19, v15

    :goto_15
    add-int/lit8 v13, v22, 0x1

    move/from16 v15, v19

    move/from16 v27, v33

    goto :goto_13

    :cond_1d
    move/from16 v33, v27

    if-nez v18, :cond_1e

    .line 58
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v18

    :cond_1e
    move-object/from16 v0, v18

    if-gtz v3, :cond_20

    if-gez p7, :cond_1f

    goto :goto_16

    :cond_1f
    move-object/from16 v1, v17

    move/from16 v3, v23

    goto :goto_18

    .line 59
    :cond_20
    :goto_16
    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v1

    move/from16 v3, v23

    move/from16 v11, v28

    :goto_17
    if-ge v11, v1, :cond_21

    .line 60
    invoke-interface {v8, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLine;

    invoke-virtual {v6}, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLine;->getMainAxisSizeWithSpacings()I

    move-result v6

    if-eqz v3, :cond_21

    if-gt v6, v3, :cond_21

    .line 61
    invoke-static {v8}, Lkotlin/collections/CollectionsKt;->getLastIndex(Ljava/util/List;)I

    move-result v10

    if-eq v11, v10, :cond_21

    sub-int/2addr v3, v6

    add-int/lit8 v11, v11, 0x1

    .line 62
    invoke-interface {v8, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    move-object/from16 v17, v6

    check-cast v17, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLine;

    goto :goto_17

    :cond_21
    move-object/from16 v1, v17

    :goto_18
    if-eqz p13, :cond_22

    .line 63
    invoke-static/range {p11 .. p12}, Landroidx/compose/ui/unit/Constraints;->getMaxWidth-impl(J)I

    move-result v6

    move/from16 v23, v6

    move/from16 v6, v32

    goto :goto_19

    :cond_22
    move/from16 v6, v32

    .line 64
    invoke-static {v4, v5, v6}, Landroidx/compose/ui/unit/ConstraintsKt;->constrainWidth-K40F9xA(JI)I

    move-result v10

    move/from16 v23, v10

    :goto_19
    if-eqz p13, :cond_23

    .line 65
    invoke-static {v4, v5, v6}, Landroidx/compose/ui/unit/ConstraintsKt;->constrainHeight-K40F9xA(JI)I

    move-result v4

    goto :goto_1a

    .line 66
    :cond_23
    invoke-static/range {p11 .. p12}, Landroidx/compose/ui/unit/Constraints;->getMaxHeight-impl(J)I

    move-result v4

    :goto_1a
    move-object v10, v8

    move-object/from16 v11, v25

    move-object v12, v0

    move/from16 v13, v23

    move v14, v4

    move v15, v6

    move/from16 v16, p4

    move/from16 v17, v7

    move/from16 v18, p13

    move-object/from16 v19, p14

    move-object/from16 v20, p15

    move/from16 v21, p16

    move-object/from16 v22, p17

    .line 67
    invoke-static/range {v10 .. v22}, Landroidx/compose/foundation/lazy/grid/LazyGridMeasureKt;->calculateItemsOffsets(Ljava/util/List;Ljava/util/List;Ljava/util/List;IIIIIZLandroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;ZLandroidx/compose/ui/unit/Density;)Ljava/util/List;

    move-result-object v5

    move/from16 v7, v31

    float-to-int v11, v7

    move-object/from16 v10, p18

    move/from16 v12, v23

    move v13, v4

    move-object v14, v5

    move-object/from16 v15, p3

    move-object/from16 v16, p19

    .line 68
    invoke-virtual/range {v10 .. v16}, Landroidx/compose/foundation/lazy/grid/LazyGridItemPlacementAnimator;->onMeasured(IIILjava/util/List;Landroidx/compose/foundation/lazy/grid/LazyMeasuredItemProvider;Landroidx/compose/foundation/lazy/grid/LazyGridSpanLayoutProvider;)V

    add-int/lit8 v8, v9, -0x1

    move/from16 v10, v33

    if-ne v10, v8, :cond_25

    if-le v6, v2, :cond_24

    goto :goto_1b

    :cond_24
    move/from16 v6, v28

    goto :goto_1c

    :cond_25
    :goto_1b
    const/4 v6, 0x1

    .line 69
    :goto_1c
    invoke-static/range {v23 .. v23}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    new-instance v8, Landroidx/compose/foundation/lazy/grid/LazyGridMeasureKt$measureLazyGrid$3;

    invoke-direct {v8, v5}, Landroidx/compose/foundation/lazy/grid/LazyGridMeasureKt$measureLazyGrid$3;-><init>(Ljava/util/List;)V

    move-object/from16 v11, p21

    invoke-interface {v11, v2, v4, v8}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    move-object v8, v2

    check-cast v8, Landroidx/compose/ui/layout/MeasureResult;

    .line 70
    invoke-interface/range {v25 .. v25}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_26

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_26

    move-object v10, v5

    goto :goto_1f

    .line 71
    :cond_26
    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v2

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 72
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v2

    move/from16 v11, v28

    :goto_1d
    if-ge v11, v2, :cond_29

    .line 73
    invoke-interface {v5, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    .line 74
    move-object v12, v4

    check-cast v12, Landroidx/compose/foundation/lazy/grid/LazyGridPositionedItem;

    .line 75
    invoke-virtual {v12}, Landroidx/compose/foundation/lazy/grid/LazyGridPositionedItem;->getIndex()I

    move-result v12

    move/from16 v13, v29

    if-gt v13, v12, :cond_27

    if-gt v12, v10, :cond_27

    const/4 v12, 0x1

    goto :goto_1e

    :cond_27
    move/from16 v12, v28

    :goto_1e
    if-eqz v12, :cond_28

    .line 76
    invoke-interface {v0, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    :cond_28
    add-int/lit8 v11, v11, 0x1

    move/from16 v29, v13

    goto :goto_1d

    :cond_29
    move-object v10, v0

    :goto_1f
    if-eqz p13, :cond_2a

    .line 77
    sget-object v0, Landroidx/compose/foundation/gestures/Orientation;->Vertical:Landroidx/compose/foundation/gestures/Orientation;

    goto :goto_20

    :cond_2a
    sget-object v0, Landroidx/compose/foundation/gestures/Orientation;->Horizontal:Landroidx/compose/foundation/gestures/Orientation;

    :goto_20
    move-object v11, v0

    .line 78
    new-instance v14, Landroidx/compose/foundation/lazy/grid/LazyGridMeasureResult;

    move-object v0, v14

    move v2, v3

    move v3, v6

    move v4, v7

    move-object v5, v8

    move-object v6, v10

    move/from16 v7, v24

    move/from16 v8, v30

    move/from16 v9, p0

    move/from16 v10, p16

    move/from16 v12, p6

    move/from16 v13, p7

    invoke-direct/range {v0 .. v13}, Landroidx/compose/foundation/lazy/grid/LazyGridMeasureResult;-><init>(Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLine;IZFLandroidx/compose/ui/layout/MeasureResult;Ljava/util/List;IIIZLandroidx/compose/foundation/gestures/Orientation;II)V

    return-object v14

    .line 79
    :cond_2b
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 80
    :cond_2c
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 81
    :cond_2d
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private static final positionExtraItem(Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;III)Landroidx/compose/foundation/lazy/grid/LazyGridPositionedItem;
    .locals 7

    .line 1
    const/4 v2, 0x0

    .line 2
    const/4 v5, 0x0

    .line 3
    const/4 v6, 0x0

    .line 4
    move-object v0, p0

    .line 5
    move v1, p1

    .line 6
    move v3, p2

    .line 7
    move v4, p3

    .line 8
    invoke-virtual/range {v0 .. v6}, Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;->position(IIIIII)Landroidx/compose/foundation/lazy/grid/LazyGridPositionedItem;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0
.end method
