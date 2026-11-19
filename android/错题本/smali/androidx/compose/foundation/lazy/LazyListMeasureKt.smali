.class public final Landroidx/compose/foundation/lazy/LazyListMeasureKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0090\u0001\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010!\n\u0002\u0008\u0013\u001a\u009f\u0002\u00103\u001a\u0002002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0008\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000f\u001a\u00020\u000e2\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u00152\u000c\u0010\u0019\u001a\u0008\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u001a\u001a\u00020\u00002\u000c\u0010\u001c\u001a\u0008\u0012\u0004\u0012\u00020\u00000\u001b2\u0006\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u000e2\u0008\u0010 \u001a\u0004\u0018\u00010\u001f2\u0006\u0010\"\u001a\u00020!2\u0006\u0010$\u001a\u00020#2\u0006\u0010&\u001a\u00020%2\u0008\u0010(\u001a\u0004\u0018\u00010\'2/\u0010/\u001a+\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0000\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020,0*\u00a2\u0006\u0002\u0008-\u0012\u0004\u0012\u00020.0)H\u0000\u00f8\u0001\u0000\u00a2\u0006\u0004\u00081\u00102\u001ac\u00108\u001a\u0008\u0012\u0004\u0012\u00020\u00180\u001b2\u000c\u00105\u001a\u0008\u0012\u0004\u0012\u00020\u0018042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00002\u000c\u0010\u001c\u001a\u0008\u0012\u0004\u0012\u00020\u00000\u001b2\u0006\u00106\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\u000e2\u0008\u00107\u001a\u0004\u0018\u00010\u001fH\u0002\u00a2\u0006\u0004\u00088\u00109\u001a;\u0010;\u001a\u0008\u0012\u0004\u0012\u00020\u00180\u001b2\u0006\u0010:\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00002\u000c\u0010\u001c\u001a\u0008\u0012\u0004\u0012\u00020\u00000\u001bH\u0002\u00a2\u0006\u0004\u0008;\u0010<\u001a\u0093\u0001\u0010E\u001a\u0008\u0012\u0004\u0012\u00020\u0018042\u000c\u0010=\u001a\u0008\u0012\u0004\u0012\u00020\u00180\u001b2\u000c\u0010>\u001a\u0008\u0012\u0004\u0012\u00020\u00180\u001b2\u000c\u0010?\u001a\u0008\u0012\u0004\u0012\u00020\u00180\u001b2\u0006\u0010@\u001a\u00020\u00002\u0006\u0010A\u001a\u00020\u00002\u0006\u0010B\u001a\u00020\u00002\u0006\u0010C\u001a\u00020\u00002\u0006\u0010D\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002\u00a2\u0006\u0004\u0008E\u0010F\u0082\u0002\u0007\n\u0005\u0008\u00a1\u001e0\u0001\u00a8\u0006G"
    }
    d2 = {
        "",
        "itemsCount",
        "Landroidx/compose/foundation/lazy/LazyListMeasuredItemProvider;",
        "measuredItemProvider",
        "mainAxisAvailableSize",
        "beforeContentPadding",
        "afterContentPadding",
        "spaceBetweenItems",
        "firstVisibleItemIndex",
        "firstVisibleItemScrollOffset",
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
        "Landroidx/compose/foundation/lazy/LazyListMeasuredItem;",
        "itemAnimator",
        "beyondBoundsItemCount",
        "",
        "pinnedItems",
        "hasLookaheadOccurred",
        "isLookingAhead",
        "Landroidx/compose/foundation/lazy/LazyListLayoutInfo;",
        "approachLayoutInfo",
        "Lkotlinx/coroutines/v;",
        "coroutineScope",
        "Landroidx/compose/foundation/lazy/layout/ObservableScopeInvalidator;",
        "placementScopeInvalidator",
        "Landroidx/compose/ui/graphics/GraphicsContext;",
        "graphicsContext",
        "Landroidx/compose/foundation/lazy/layout/StickyItemsPlacement;",
        "stickyItemsPlacement",
        "Lkotlin/Function3;",
        "Lkotlin/Function1;",
        "Landroidx/compose/ui/layout/Placeable$PlacementScope;",
        "Ld6/s;",
        "Lkotlin/ExtensionFunctionType;",
        "Landroidx/compose/ui/layout/MeasureResult;",
        "layout",
        "Landroidx/compose/foundation/lazy/LazyListMeasureResult;",
        "measureLazyList-LCrQqZ4",
        "(ILandroidx/compose/foundation/lazy/LazyListMeasuredItemProvider;IIIIIIFJZLandroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;ZLandroidx/compose/ui/unit/Density;Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;ILjava/util/List;ZZLandroidx/compose/foundation/lazy/LazyListLayoutInfo;Lkotlinx/coroutines/v;Landroidx/compose/runtime/MutableState;Landroidx/compose/ui/graphics/GraphicsContext;Landroidx/compose/foundation/lazy/layout/StickyItemsPlacement;Lr6/f;)Landroidx/compose/foundation/lazy/LazyListMeasureResult;",
        "measureLazyList",
        "",
        "visibleItems",
        "consumedScroll",
        "lastApproachLayoutInfo",
        "createItemsAfterList",
        "(Ljava/util/List;Landroidx/compose/foundation/lazy/LazyListMeasuredItemProvider;IILjava/util/List;FZLandroidx/compose/foundation/lazy/LazyListLayoutInfo;)Ljava/util/List;",
        "currentFirstItemIndex",
        "createItemsBeforeList",
        "(ILandroidx/compose/foundation/lazy/LazyListMeasuredItemProvider;ILjava/util/List;)Ljava/util/List;",
        "items",
        "extraItemsBefore",
        "extraItemsAfter",
        "layoutWidth",
        "layoutHeight",
        "finalMainAxisOffset",
        "maxOffset",
        "itemsScrollOffset",
        "calculateItemsOffsets",
        "(Ljava/util/List;Ljava/util/List;Ljava/util/List;IIIIIZLandroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;ZLandroidx/compose/ui/unit/Density;)Ljava/util/List;",
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
        "SMAP\nLazyListMeasure.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyListMeasure.kt\nandroidx/compose/foundation/lazy/LazyListMeasureKt\n+ 2 InlineClassHelper.kt\nandroidx/compose/foundation/internal/InlineClassHelperKt\n+ 3 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 5 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 6 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,678:1\n96#2,5:679\n96#2,5:684\n96#2,5:696\n50#2,5:762\n96#2,5:767\n107#2,7:772\n107#2,7:779\n54#3:689\n59#3:691\n54#3:713\n59#3:715\n85#4:690\n90#4:692\n85#4:714\n90#4:716\n26#5:693\n26#5:694\n26#5:695\n34#6,6:701\n34#6,6:707\n34#6,6:717\n117#6,2:723\n34#6,6:725\n119#6:731\n117#6,2:732\n34#6,6:734\n119#6:740\n117#6,2:741\n34#6,6:743\n119#6:749\n34#6,6:750\n52#6,6:756\n34#6,6:786\n34#6,6:792\n34#6,6:798\n*S KotlinDebug\n*F\n+ 1 LazyListMeasure.kt\nandroidx/compose/foundation/lazy/LazyListMeasureKt\n*L\n79#1:679,5\n80#1:684,5\n287#1:696,5\n604#1:762,5\n611#1:767,5\n622#1:772,7\n630#1:779,7\n105#1:689\n106#1:691\n388#1:713\n390#1:715\n105#1:690\n106#1:692\n388#1:714\n390#1:716\n140#1:693\n269#1:694\n270#1:695\n321#1:701,6\n337#1:707,6\n393#1:717,6\n506#1:723,2\n506#1:725,6\n506#1:731\n526#1:732,2\n526#1:734,6\n526#1:740\n527#1:741,2\n527#1:743,6\n527#1:749\n548#1:750,6\n575#1:756,6\n657#1:786,6\n664#1:792,6\n670#1:798,6\n*E\n"
    }
.end annotation


# direct methods
.method private static final calculateItemsOffsets(Ljava/util/List;Ljava/util/List;Ljava/util/List;IIIIIZLandroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;ZLandroidx/compose/ui/unit/Density;)Ljava/util/List;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroidx/compose/foundation/lazy/LazyListMeasuredItem;",
            ">;",
            "Ljava/util/List<",
            "Landroidx/compose/foundation/lazy/LazyListMeasuredItem;",
            ">;",
            "Ljava/util/List<",
            "Landroidx/compose/foundation/lazy/LazyListMeasuredItem;",
            ">;IIIIIZ",
            "Landroidx/compose/foundation/layout/Arrangement$Vertical;",
            "Landroidx/compose/foundation/layout/Arrangement$Horizontal;",
            "Z",
            "Landroidx/compose/ui/unit/Density;",
            ")",
            "Ljava/util/List<",
            "Landroidx/compose/foundation/lazy/LazyListMeasuredItem;",
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
    const-string v6, "non-zero itemsScrollOffset"

    .line 32
    .line 33
    invoke-static {v6}, Landroidx/compose/foundation/internal/InlineClassHelperKt;->throwIllegalStateException(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    :cond_3
    :goto_3
    new-instance v9, Ljava/util/ArrayList;

    .line 37
    .line 38
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 39
    .line 40
    .line 41
    move-result v6

    .line 42
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 43
    .line 44
    .line 45
    move-result v7

    .line 46
    add-int/2addr v7, v6

    .line 47
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 48
    .line 49
    .line 50
    move-result v6

    .line 51
    add-int/2addr v6, v7

    .line 52
    invoke-direct {v9, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 53
    .line 54
    .line 55
    if-eqz v3, :cond_d

    .line 56
    .line 57
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 58
    .line 59
    .line 60
    move-result p1

    .line 61
    if-eqz p1, :cond_4

    .line 62
    .line 63
    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    .line 64
    .line 65
    .line 66
    move-result p1

    .line 67
    if-eqz p1, :cond_4

    .line 68
    .line 69
    goto :goto_4

    .line 70
    :cond_4
    const-string p1, "no extra items"

    .line 71
    .line 72
    invoke-static {p1}, Landroidx/compose/foundation/internal/InlineClassHelperKt;->throwIllegalArgumentException(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    :goto_4
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 76
    .line 77
    .line 78
    move-result p1

    .line 79
    new-array v6, p1, [I

    .line 80
    .line 81
    :goto_5
    if-ge v4, p1, :cond_5

    .line 82
    .line 83
    invoke-static {v4, v2, p1}, Landroidx/compose/foundation/lazy/LazyListMeasureKt;->calculateItemsOffsets$reverseAware(IZI)I

    .line 84
    .line 85
    .line 86
    move-result v3

    .line 87
    invoke-interface {p0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v3

    .line 91
    check-cast v3, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;

    .line 92
    .line 93
    invoke-virtual {v3}, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;->getSize()I

    .line 94
    .line 95
    .line 96
    move-result v3

    .line 97
    aput v3, v6, v4

    .line 98
    .line 99
    add-int/lit8 v4, v4, 0x1

    .line 100
    .line 101
    goto :goto_5

    .line 102
    :cond_5
    new-array v8, p1, [I

    .line 103
    .line 104
    if-eqz p8, :cond_7

    .line 105
    .line 106
    if-eqz v1, :cond_6

    .line 107
    .line 108
    move-object/from16 v4, p12

    .line 109
    .line 110
    invoke-interface {v1, v4, v5, v6, v8}, Landroidx/compose/foundation/layout/Arrangement$Vertical;->arrange(Landroidx/compose/ui/unit/Density;I[I[I)V

    .line 111
    .line 112
    .line 113
    goto :goto_6

    .line 114
    :cond_6
    const-string p0, "null verticalArrangement when isVertical == true"

    .line 115
    .line 116
    invoke-static {p0}, Landroidx/compose/foundation/internal/InlineClassHelperKt;->throwIllegalArgumentExceptionForNullCheck(Ljava/lang/String;)Ljava/lang/Void;

    .line 117
    .line 118
    .line 119
    new-instance p0, Lkotlin/KotlinNothingValueException;

    .line 120
    .line 121
    invoke-direct {p0}, Lkotlin/KotlinNothingValueException;-><init>()V

    .line 122
    .line 123
    .line 124
    throw p0

    .line 125
    :cond_7
    move-object/from16 v4, p12

    .line 126
    .line 127
    if-eqz p10, :cond_c

    .line 128
    .line 129
    sget-object v7, Landroidx/compose/ui/unit/LayoutDirection;->Ltr:Landroidx/compose/ui/unit/LayoutDirection;

    .line 130
    .line 131
    move-object/from16 v3, p10

    .line 132
    .line 133
    invoke-interface/range {v3 .. v8}, Landroidx/compose/foundation/layout/Arrangement$Horizontal;->arrange(Landroidx/compose/ui/unit/Density;I[ILandroidx/compose/ui/unit/LayoutDirection;[I)V

    .line 134
    .line 135
    .line 136
    :goto_6
    invoke-static {v8}, Lkotlin/collections/q;->S([I)Lx6/f;

    .line 137
    .line 138
    .line 139
    move-result-object v1

    .line 140
    if-nez v2, :cond_8

    .line 141
    .line 142
    goto :goto_7

    .line 143
    :cond_8
    invoke-static {v1}, Lkotlin/collections/u;->I(Lx6/f;)Lx6/d;

    .line 144
    .line 145
    .line 146
    move-result-object v1

    .line 147
    :goto_7
    iget v3, v1, Lx6/d;->a:I

    .line 148
    .line 149
    iget v4, v1, Lx6/d;->b:I

    .line 150
    .line 151
    iget v1, v1, Lx6/d;->c:I

    .line 152
    .line 153
    if-lez v1, :cond_9

    .line 154
    .line 155
    if-le v3, v4, :cond_a

    .line 156
    .line 157
    :cond_9
    if-gez v1, :cond_10

    .line 158
    .line 159
    if-gt v4, v3, :cond_10

    .line 160
    .line 161
    :cond_a
    :goto_8
    aget v6, v8, v3

    .line 162
    .line 163
    invoke-static {v3, v2, p1}, Landroidx/compose/foundation/lazy/LazyListMeasureKt;->calculateItemsOffsets$reverseAware(IZI)I

    .line 164
    .line 165
    .line 166
    move-result v7

    .line 167
    invoke-interface {p0, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    move-result-object v7

    .line 171
    check-cast v7, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;

    .line 172
    .line 173
    if-eqz v2, :cond_b

    .line 174
    .line 175
    sub-int v6, v5, v6

    .line 176
    .line 177
    invoke-virtual {v7}, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;->getSize()I

    .line 178
    .line 179
    .line 180
    move-result v10

    .line 181
    sub-int/2addr v6, v10

    .line 182
    :cond_b
    invoke-virtual {v7, v6, p3, p4}, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;->position(III)V

    .line 183
    .line 184
    .line 185
    invoke-virtual {v9, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 186
    .line 187
    .line 188
    if-eq v3, v4, :cond_10

    .line 189
    .line 190
    add-int/2addr v3, v1

    .line 191
    goto :goto_8

    .line 192
    :cond_c
    const-string p0, "null horizontalArrangement when isVertical == false"

    .line 193
    .line 194
    invoke-static {p0}, Landroidx/compose/foundation/internal/InlineClassHelperKt;->throwIllegalArgumentExceptionForNullCheck(Ljava/lang/String;)Ljava/lang/Void;

    .line 195
    .line 196
    .line 197
    new-instance p0, Lkotlin/KotlinNothingValueException;

    .line 198
    .line 199
    invoke-direct {p0}, Lkotlin/KotlinNothingValueException;-><init>()V

    .line 200
    .line 201
    .line 202
    throw p0

    .line 203
    :cond_d
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    .line 204
    .line 205
    .line 206
    move-result v1

    .line 207
    move/from16 v3, p7

    .line 208
    .line 209
    move v2, v4

    .line 210
    :goto_9
    if-ge v2, v1, :cond_e

    .line 211
    .line 212
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 213
    .line 214
    .line 215
    move-result-object v5

    .line 216
    check-cast v5, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;

    .line 217
    .line 218
    invoke-virtual {v5}, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;->getMainAxisSizeWithSpacings()I

    .line 219
    .line 220
    .line 221
    move-result v6

    .line 222
    sub-int/2addr v3, v6

    .line 223
    invoke-virtual {v5, v3, p3, p4}, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;->position(III)V

    .line 224
    .line 225
    .line 226
    invoke-virtual {v9, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 227
    .line 228
    .line 229
    add-int/lit8 v2, v2, 0x1

    .line 230
    .line 231
    goto :goto_9

    .line 232
    :cond_e
    invoke-interface {p0}, Ljava/util/Collection;->size()I

    .line 233
    .line 234
    .line 235
    move-result p1

    .line 236
    move/from16 v1, p7

    .line 237
    .line 238
    move v2, v4

    .line 239
    :goto_a
    if-ge v2, p1, :cond_f

    .line 240
    .line 241
    invoke-interface {p0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 242
    .line 243
    .line 244
    move-result-object v3

    .line 245
    check-cast v3, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;

    .line 246
    .line 247
    invoke-virtual {v3, v1, p3, p4}, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;->position(III)V

    .line 248
    .line 249
    .line 250
    invoke-virtual {v9, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 251
    .line 252
    .line 253
    invoke-virtual {v3}, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;->getMainAxisSizeWithSpacings()I

    .line 254
    .line 255
    .line 256
    move-result v3

    .line 257
    add-int/2addr v1, v3

    .line 258
    add-int/lit8 v2, v2, 0x1

    .line 259
    .line 260
    goto :goto_a

    .line 261
    :cond_f
    invoke-interface {p2}, Ljava/util/Collection;->size()I

    .line 262
    .line 263
    .line 264
    move-result p0

    .line 265
    :goto_b
    if-ge v4, p0, :cond_10

    .line 266
    .line 267
    invoke-interface {p2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 268
    .line 269
    .line 270
    move-result-object v2

    .line 271
    check-cast v2, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;

    .line 272
    .line 273
    invoke-virtual {v2, v1, p3, p4}, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;->position(III)V

    .line 274
    .line 275
    .line 276
    invoke-virtual {v9, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 277
    .line 278
    .line 279
    invoke-virtual {v2}, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;->getMainAxisSizeWithSpacings()I

    .line 280
    .line 281
    .line 282
    move-result v2

    .line 283
    add-int/2addr v1, v2

    .line 284
    add-int/lit8 v4, v4, 0x1

    .line 285
    .line 286
    goto :goto_b

    .line 287
    :cond_10
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

.method private static final createItemsAfterList(Ljava/util/List;Landroidx/compose/foundation/lazy/LazyListMeasuredItemProvider;IILjava/util/List;FZLandroidx/compose/foundation/lazy/LazyListLayoutInfo;)Ljava/util/List;
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroidx/compose/foundation/lazy/LazyListMeasuredItem;",
            ">;",
            "Landroidx/compose/foundation/lazy/LazyListMeasuredItemProvider;",
            "II",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;FZ",
            "Landroidx/compose/foundation/lazy/LazyListLayoutInfo;",
            ")",
            "Ljava/util/List<",
            "Landroidx/compose/foundation/lazy/LazyListMeasuredItem;",
            ">;"
        }
    .end annotation

    .line 1
    move/from16 v0, p2

    .line 2
    .line 3
    invoke-static {p0}, Lkotlin/collections/t;->o0(Ljava/util/List;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    check-cast v1, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;

    .line 8
    .line 9
    invoke-virtual {v1}, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;->getIndex()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    add-int v1, v1, p3

    .line 14
    .line 15
    add-int/lit8 v2, v0, -0x1

    .line 16
    .line 17
    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    invoke-static {p0}, Lkotlin/collections/t;->o0(Ljava/util/List;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    check-cast v3, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;

    .line 26
    .line 27
    invoke-virtual {v3}, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;->getIndex()I

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    add-int/lit8 v3, v3, 0x1

    .line 32
    .line 33
    const/4 v4, 0x0

    .line 34
    if-gt v3, v1, :cond_1

    .line 35
    .line 36
    move v6, v3

    .line 37
    move-object v3, v4

    .line 38
    :goto_0
    if-nez v3, :cond_0

    .line 39
    .line 40
    new-instance v3, Ljava/util/ArrayList;

    .line 41
    .line 42
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 43
    .line 44
    .line 45
    :cond_0
    const/4 v9, 0x2

    .line 46
    const/4 v10, 0x0

    .line 47
    const-wide/16 v7, 0x0

    .line 48
    .line 49
    move-object v5, p1

    .line 50
    invoke-static/range {v5 .. v10}, Landroidx/compose/foundation/lazy/LazyListMeasuredItemProvider;->getAndMeasure-0kLqBqw$default(Landroidx/compose/foundation/lazy/LazyListMeasuredItemProvider;IJILjava/lang/Object;)Landroidx/compose/foundation/lazy/LazyListMeasuredItem;

    .line 51
    .line 52
    .line 53
    move-result-object v7

    .line 54
    invoke-interface {v3, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    if-eq v6, v1, :cond_2

    .line 58
    .line 59
    add-int/lit8 v6, v6, 0x1

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_1
    move-object v3, v4

    .line 63
    :cond_2
    const/4 v5, 0x0

    .line 64
    if-eqz p6, :cond_14

    .line 65
    .line 66
    if-eqz p7, :cond_14

    .line 67
    .line 68
    invoke-interface/range {p7 .. p7}, Landroidx/compose/foundation/lazy/LazyListLayoutInfo;->getVisibleItemsInfo()Ljava/util/List;

    .line 69
    .line 70
    .line 71
    move-result-object v6

    .line 72
    invoke-interface {v6}, Ljava/util/Collection;->isEmpty()Z

    .line 73
    .line 74
    .line 75
    move-result v6

    .line 76
    if-nez v6, :cond_14

    .line 77
    .line 78
    invoke-interface/range {p7 .. p7}, Landroidx/compose/foundation/lazy/LazyListLayoutInfo;->getVisibleItemsInfo()Ljava/util/List;

    .line 79
    .line 80
    .line 81
    move-result-object v6

    .line 82
    invoke-interface {v6}, Ljava/util/List;->size()I

    .line 83
    .line 84
    .line 85
    move-result v7

    .line 86
    add-int/lit8 v7, v7, -0x1

    .line 87
    .line 88
    :goto_1
    const/4 v8, -0x1

    .line 89
    if-ge v8, v7, :cond_5

    .line 90
    .line 91
    invoke-interface {v6, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v8

    .line 95
    check-cast v8, Landroidx/compose/foundation/lazy/LazyListItemInfo;

    .line 96
    .line 97
    invoke-interface {v8}, Landroidx/compose/foundation/lazy/LazyListItemInfo;->getIndex()I

    .line 98
    .line 99
    .line 100
    move-result v8

    .line 101
    if-le v8, v1, :cond_4

    .line 102
    .line 103
    if-eqz v7, :cond_3

    .line 104
    .line 105
    add-int/lit8 v8, v7, -0x1

    .line 106
    .line 107
    invoke-interface {v6, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object v8

    .line 111
    check-cast v8, Landroidx/compose/foundation/lazy/LazyListItemInfo;

    .line 112
    .line 113
    invoke-interface {v8}, Landroidx/compose/foundation/lazy/LazyListItemInfo;->getIndex()I

    .line 114
    .line 115
    .line 116
    move-result v8

    .line 117
    if-gt v8, v1, :cond_4

    .line 118
    .line 119
    :cond_3
    invoke-interface {v6, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object v6

    .line 123
    check-cast v6, Landroidx/compose/foundation/lazy/LazyListItemInfo;

    .line 124
    .line 125
    goto :goto_2

    .line 126
    :cond_4
    add-int/lit8 v7, v7, -0x1

    .line 127
    .line 128
    goto :goto_1

    .line 129
    :cond_5
    move-object v6, v4

    .line 130
    :goto_2
    invoke-interface/range {p7 .. p7}, Landroidx/compose/foundation/lazy/LazyListLayoutInfo;->getVisibleItemsInfo()Ljava/util/List;

    .line 131
    .line 132
    .line 133
    move-result-object v7

    .line 134
    invoke-static {v7}, Lkotlin/collections/t;->o0(Ljava/util/List;)Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object v7

    .line 138
    check-cast v7, Landroidx/compose/foundation/lazy/LazyListItemInfo;

    .line 139
    .line 140
    if-eqz v6, :cond_b

    .line 141
    .line 142
    invoke-interface {v6}, Landroidx/compose/foundation/lazy/LazyListItemInfo;->getIndex()I

    .line 143
    .line 144
    .line 145
    move-result v6

    .line 146
    invoke-interface {v7}, Landroidx/compose/foundation/lazy/LazyListItemInfo;->getIndex()I

    .line 147
    .line 148
    .line 149
    move-result v8

    .line 150
    invoke-static {v8, v2}, Ljava/lang/Math;->min(II)I

    .line 151
    .line 152
    .line 153
    move-result v2

    .line 154
    if-gt v6, v2, :cond_b

    .line 155
    .line 156
    move v9, v6

    .line 157
    :goto_3
    if-eqz v3, :cond_8

    .line 158
    .line 159
    invoke-interface {v3}, Ljava/util/Collection;->size()I

    .line 160
    .line 161
    .line 162
    move-result v6

    .line 163
    move v8, v5

    .line 164
    :goto_4
    if-ge v8, v6, :cond_7

    .line 165
    .line 166
    invoke-interface {v3, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    move-result-object v10

    .line 170
    move-object v11, v10

    .line 171
    check-cast v11, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;

    .line 172
    .line 173
    invoke-virtual {v11}, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;->getIndex()I

    .line 174
    .line 175
    .line 176
    move-result v11

    .line 177
    if-ne v11, v9, :cond_6

    .line 178
    .line 179
    goto :goto_5

    .line 180
    :cond_6
    add-int/lit8 v8, v8, 0x1

    .line 181
    .line 182
    goto :goto_4

    .line 183
    :cond_7
    move-object v10, v4

    .line 184
    :goto_5
    check-cast v10, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;

    .line 185
    .line 186
    goto :goto_6

    .line 187
    :cond_8
    move-object v10, v4

    .line 188
    :goto_6
    if-nez v10, :cond_a

    .line 189
    .line 190
    if-nez v3, :cond_9

    .line 191
    .line 192
    new-instance v3, Ljava/util/ArrayList;

    .line 193
    .line 194
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 195
    .line 196
    .line 197
    :cond_9
    const/4 v12, 0x2

    .line 198
    const/4 v13, 0x0

    .line 199
    const-wide/16 v10, 0x0

    .line 200
    .line 201
    move-object v8, p1

    .line 202
    invoke-static/range {v8 .. v13}, Landroidx/compose/foundation/lazy/LazyListMeasuredItemProvider;->getAndMeasure-0kLqBqw$default(Landroidx/compose/foundation/lazy/LazyListMeasuredItemProvider;IJILjava/lang/Object;)Landroidx/compose/foundation/lazy/LazyListMeasuredItem;

    .line 203
    .line 204
    .line 205
    move-result-object v6

    .line 206
    invoke-interface {v3, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 207
    .line 208
    .line 209
    :cond_a
    if-eq v9, v2, :cond_b

    .line 210
    .line 211
    add-int/lit8 v9, v9, 0x1

    .line 212
    .line 213
    goto :goto_3

    .line 214
    :cond_b
    invoke-interface/range {p7 .. p7}, Landroidx/compose/foundation/lazy/LazyListLayoutInfo;->getViewportEndOffset()I

    .line 215
    .line 216
    .line 217
    move-result v2

    .line 218
    invoke-interface {v7}, Landroidx/compose/foundation/lazy/LazyListItemInfo;->getOffset()I

    .line 219
    .line 220
    .line 221
    move-result v6

    .line 222
    sub-int/2addr v2, v6

    .line 223
    invoke-interface {v7}, Landroidx/compose/foundation/lazy/LazyListItemInfo;->getSize()I

    .line 224
    .line 225
    .line 226
    move-result v6

    .line 227
    sub-int/2addr v2, v6

    .line 228
    int-to-float v2, v2

    .line 229
    sub-float v2, v2, p5

    .line 230
    .line 231
    const/4 v6, 0x0

    .line 232
    cmpl-float v6, v2, v6

    .line 233
    .line 234
    if-lez v6, :cond_14

    .line 235
    .line 236
    invoke-interface {v7}, Landroidx/compose/foundation/lazy/LazyListItemInfo;->getIndex()I

    .line 237
    .line 238
    .line 239
    move-result v6

    .line 240
    add-int/lit8 v6, v6, 0x1

    .line 241
    .line 242
    move v9, v6

    .line 243
    move v6, v5

    .line 244
    :goto_7
    if-ge v9, v0, :cond_14

    .line 245
    .line 246
    int-to-float v7, v6

    .line 247
    cmpg-float v7, v7, v2

    .line 248
    .line 249
    if-gez v7, :cond_14

    .line 250
    .line 251
    if-gt v9, v1, :cond_e

    .line 252
    .line 253
    invoke-interface {p0}, Ljava/util/Collection;->size()I

    .line 254
    .line 255
    .line 256
    move-result v7

    .line 257
    move v8, v5

    .line 258
    :goto_8
    if-ge v8, v7, :cond_d

    .line 259
    .line 260
    invoke-interface {p0, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 261
    .line 262
    .line 263
    move-result-object v10

    .line 264
    move-object v11, v10

    .line 265
    check-cast v11, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;

    .line 266
    .line 267
    invoke-virtual {v11}, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;->getIndex()I

    .line 268
    .line 269
    .line 270
    move-result v11

    .line 271
    if-ne v11, v9, :cond_c

    .line 272
    .line 273
    goto :goto_9

    .line 274
    :cond_c
    add-int/lit8 v8, v8, 0x1

    .line 275
    .line 276
    goto :goto_8

    .line 277
    :cond_d
    move-object v10, v4

    .line 278
    :goto_9
    check-cast v10, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;

    .line 279
    .line 280
    goto :goto_c

    .line 281
    :cond_e
    if-eqz v3, :cond_11

    .line 282
    .line 283
    invoke-interface {v3}, Ljava/util/Collection;->size()I

    .line 284
    .line 285
    .line 286
    move-result v7

    .line 287
    move v8, v5

    .line 288
    :goto_a
    if-ge v8, v7, :cond_10

    .line 289
    .line 290
    invoke-interface {v3, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 291
    .line 292
    .line 293
    move-result-object v10

    .line 294
    move-object v11, v10

    .line 295
    check-cast v11, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;

    .line 296
    .line 297
    invoke-virtual {v11}, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;->getIndex()I

    .line 298
    .line 299
    .line 300
    move-result v11

    .line 301
    if-ne v11, v9, :cond_f

    .line 302
    .line 303
    goto :goto_b

    .line 304
    :cond_f
    add-int/lit8 v8, v8, 0x1

    .line 305
    .line 306
    goto :goto_a

    .line 307
    :cond_10
    move-object v10, v4

    .line 308
    :goto_b
    check-cast v10, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;

    .line 309
    .line 310
    goto :goto_c

    .line 311
    :cond_11
    move-object v10, v4

    .line 312
    :goto_c
    if-eqz v10, :cond_12

    .line 313
    .line 314
    add-int/lit8 v9, v9, 0x1

    .line 315
    .line 316
    invoke-virtual {v10}, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;->getMainAxisSizeWithSpacings()I

    .line 317
    .line 318
    .line 319
    move-result v7

    .line 320
    :goto_d
    add-int/2addr v6, v7

    .line 321
    goto :goto_7

    .line 322
    :cond_12
    if-nez v3, :cond_13

    .line 323
    .line 324
    new-instance v3, Ljava/util/ArrayList;

    .line 325
    .line 326
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 327
    .line 328
    .line 329
    :cond_13
    const/4 v12, 0x2

    .line 330
    const/4 v13, 0x0

    .line 331
    const-wide/16 v10, 0x0

    .line 332
    .line 333
    move-object v8, p1

    .line 334
    invoke-static/range {v8 .. v13}, Landroidx/compose/foundation/lazy/LazyListMeasuredItemProvider;->getAndMeasure-0kLqBqw$default(Landroidx/compose/foundation/lazy/LazyListMeasuredItemProvider;IJILjava/lang/Object;)Landroidx/compose/foundation/lazy/LazyListMeasuredItem;

    .line 335
    .line 336
    .line 337
    move-result-object v7

    .line 338
    invoke-interface {v3, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 339
    .line 340
    .line 341
    add-int/lit8 v9, v9, 0x1

    .line 342
    .line 343
    invoke-static {v3}, Lkotlin/collections/t;->o0(Ljava/util/List;)Ljava/lang/Object;

    .line 344
    .line 345
    .line 346
    move-result-object v7

    .line 347
    check-cast v7, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;

    .line 348
    .line 349
    invoke-virtual {v7}, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;->getMainAxisSizeWithSpacings()I

    .line 350
    .line 351
    .line 352
    move-result v7

    .line 353
    goto :goto_d

    .line 354
    :cond_14
    if-eqz v3, :cond_15

    .line 355
    .line 356
    invoke-static {v3}, Lkotlin/collections/t;->o0(Ljava/util/List;)Ljava/lang/Object;

    .line 357
    .line 358
    .line 359
    move-result-object p0

    .line 360
    check-cast p0, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;

    .line 361
    .line 362
    invoke-virtual {p0}, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;->getIndex()I

    .line 363
    .line 364
    .line 365
    move-result p0

    .line 366
    if-le p0, v1, :cond_15

    .line 367
    .line 368
    invoke-static {v3}, Lkotlin/collections/t;->o0(Ljava/util/List;)Ljava/lang/Object;

    .line 369
    .line 370
    .line 371
    move-result-object p0

    .line 372
    check-cast p0, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;

    .line 373
    .line 374
    invoke-virtual {p0}, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;->getIndex()I

    .line 375
    .line 376
    .line 377
    move-result v1

    .line 378
    :cond_15
    invoke-interface/range {p4 .. p4}, Ljava/util/Collection;->size()I

    .line 379
    .line 380
    .line 381
    move-result p0

    .line 382
    :goto_e
    if-ge v5, p0, :cond_18

    .line 383
    .line 384
    move-object/from16 v0, p4

    .line 385
    .line 386
    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 387
    .line 388
    .line 389
    move-result-object v2

    .line 390
    check-cast v2, Ljava/lang/Number;

    .line 391
    .line 392
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 393
    .line 394
    .line 395
    move-result v9

    .line 396
    if-le v9, v1, :cond_17

    .line 397
    .line 398
    if-nez v3, :cond_16

    .line 399
    .line 400
    new-instance v3, Ljava/util/ArrayList;

    .line 401
    .line 402
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 403
    .line 404
    .line 405
    :cond_16
    const/4 v12, 0x2

    .line 406
    const/4 v13, 0x0

    .line 407
    const-wide/16 v10, 0x0

    .line 408
    .line 409
    move-object v8, p1

    .line 410
    invoke-static/range {v8 .. v13}, Landroidx/compose/foundation/lazy/LazyListMeasuredItemProvider;->getAndMeasure-0kLqBqw$default(Landroidx/compose/foundation/lazy/LazyListMeasuredItemProvider;IJILjava/lang/Object;)Landroidx/compose/foundation/lazy/LazyListMeasuredItem;

    .line 411
    .line 412
    .line 413
    move-result-object v2

    .line 414
    invoke-interface {v3, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 415
    .line 416
    .line 417
    :cond_17
    add-int/lit8 v5, v5, 0x1

    .line 418
    .line 419
    goto :goto_e

    .line 420
    :cond_18
    if-nez v3, :cond_19

    .line 421
    .line 422
    sget-object p0, Lkotlin/collections/EmptyList;->INSTANCE:Lkotlin/collections/EmptyList;

    .line 423
    .line 424
    return-object p0

    .line 425
    :cond_19
    return-object v3
.end method

.method private static final createItemsBeforeList(ILandroidx/compose/foundation/lazy/LazyListMeasuredItemProvider;ILjava/util/List;)Ljava/util/List;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Landroidx/compose/foundation/lazy/LazyListMeasuredItemProvider;",
            "I",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;)",
            "Ljava/util/List<",
            "Landroidx/compose/foundation/lazy/LazyListMeasuredItem;",
            ">;"
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    sub-int p2, p0, p2

    .line 3
    .line 4
    invoke-static {v0, p2}, Ljava/lang/Math;->max(II)I

    .line 5
    .line 6
    .line 7
    move-result p2

    .line 8
    add-int/lit8 p0, p0, -0x1

    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    if-gt p2, p0, :cond_1

    .line 12
    .line 13
    move v2, p0

    .line 14
    :goto_0
    if-nez v0, :cond_0

    .line 15
    .line 16
    new-instance p0, Ljava/util/ArrayList;

    .line 17
    .line 18
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 19
    .line 20
    .line 21
    move-object v0, p0

    .line 22
    :cond_0
    const/4 v5, 0x2

    .line 23
    const/4 v6, 0x0

    .line 24
    const-wide/16 v3, 0x0

    .line 25
    .line 26
    move-object v1, p1

    .line 27
    invoke-static/range {v1 .. v6}, Landroidx/compose/foundation/lazy/LazyListMeasuredItemProvider;->getAndMeasure-0kLqBqw$default(Landroidx/compose/foundation/lazy/LazyListMeasuredItemProvider;IJILjava/lang/Object;)Landroidx/compose/foundation/lazy/LazyListMeasuredItem;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    invoke-interface {v0, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    if-eq v2, p2, :cond_2

    .line 35
    .line 36
    add-int/lit8 v2, v2, -0x1

    .line 37
    .line 38
    move-object p1, v1

    .line 39
    goto :goto_0

    .line 40
    :cond_1
    move-object v1, p1

    .line 41
    :cond_2
    invoke-interface {p3}, Ljava/util/Collection;->size()I

    .line 42
    .line 43
    .line 44
    move-result p0

    .line 45
    add-int/lit8 p0, p0, -0x1

    .line 46
    .line 47
    if-ltz p0, :cond_6

    .line 48
    .line 49
    :goto_1
    add-int/lit8 p1, p0, -0x1

    .line 50
    .line 51
    invoke-interface {p3, p0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    check-cast p0, Ljava/lang/Number;

    .line 56
    .line 57
    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    .line 58
    .line 59
    .line 60
    move-result v4

    .line 61
    if-ge v4, p2, :cond_4

    .line 62
    .line 63
    if-nez v0, :cond_3

    .line 64
    .line 65
    new-instance v0, Ljava/util/ArrayList;

    .line 66
    .line 67
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 68
    .line 69
    .line 70
    :cond_3
    const/4 v7, 0x2

    .line 71
    const/4 v8, 0x0

    .line 72
    const-wide/16 v5, 0x0

    .line 73
    .line 74
    move-object v3, v1

    .line 75
    invoke-static/range {v3 .. v8}, Landroidx/compose/foundation/lazy/LazyListMeasuredItemProvider;->getAndMeasure-0kLqBqw$default(Landroidx/compose/foundation/lazy/LazyListMeasuredItemProvider;IJILjava/lang/Object;)Landroidx/compose/foundation/lazy/LazyListMeasuredItem;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    invoke-interface {v0, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    :cond_4
    if-gez p1, :cond_5

    .line 83
    .line 84
    goto :goto_2

    .line 85
    :cond_5
    move p0, p1

    .line 86
    goto :goto_1

    .line 87
    :cond_6
    :goto_2
    if-nez v0, :cond_7

    .line 88
    .line 89
    sget-object p0, Lkotlin/collections/EmptyList;->INSTANCE:Lkotlin/collections/EmptyList;

    .line 90
    .line 91
    return-object p0

    .line 92
    :cond_7
    return-object v0
.end method

.method public static final measureLazyList-LCrQqZ4(ILandroidx/compose/foundation/lazy/LazyListMeasuredItemProvider;IIIIIIFJZLandroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;ZLandroidx/compose/ui/unit/Density;Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;ILjava/util/List;ZZLandroidx/compose/foundation/lazy/LazyListLayoutInfo;Lkotlinx/coroutines/v;Landroidx/compose/runtime/MutableState;Landroidx/compose/ui/graphics/GraphicsContext;Landroidx/compose/foundation/lazy/layout/StickyItemsPlacement;Lr6/f;)Landroidx/compose/foundation/lazy/LazyListMeasureResult;
    .locals 42
    .param p1    # Landroidx/compose/foundation/lazy/LazyListMeasuredItemProvider;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p12    # Landroidx/compose/foundation/layout/Arrangement$Vertical;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p13    # Landroidx/compose/foundation/layout/Arrangement$Horizontal;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p15    # Landroidx/compose/ui/unit/Density;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p16    # Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p18    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p21    # Landroidx/compose/foundation/lazy/LazyListLayoutInfo;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p22    # Lkotlinx/coroutines/v;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p23    # Landroidx/compose/runtime/MutableState;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p24    # Landroidx/compose/ui/graphics/GraphicsContext;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p25    # Landroidx/compose/foundation/lazy/layout/StickyItemsPlacement;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p26    # Lr6/f;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Landroidx/compose/foundation/lazy/LazyListMeasuredItemProvider;",
            "IIIIIIFJZ",
            "Landroidx/compose/foundation/layout/Arrangement$Vertical;",
            "Landroidx/compose/foundation/layout/Arrangement$Horizontal;",
            "Z",
            "Landroidx/compose/ui/unit/Density;",
            "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator<",
            "Landroidx/compose/foundation/lazy/LazyListMeasuredItem;",
            ">;I",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;ZZ",
            "Landroidx/compose/foundation/lazy/LazyListLayoutInfo;",
            "Lkotlinx/coroutines/v;",
            "Landroidx/compose/runtime/MutableState<",
            "Ld6/s;",
            ">;",
            "Landroidx/compose/ui/graphics/GraphicsContext;",
            "Landroidx/compose/foundation/lazy/layout/StickyItemsPlacement;",
            "Lr6/f;",
            ")",
            "Landroidx/compose/foundation/lazy/LazyListMeasureResult;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const/16 v16, 0x1

    const/4 v13, 0x0

    if-ltz p3, :cond_0

    move/from16 v0, v16

    goto :goto_0

    :cond_0
    move v0, v13

    :goto_0
    if-nez v0, :cond_1

    .line 1
    const-string v0, "invalid beforeContentPadding"

    .line 2
    invoke-static {v0}, Landroidx/compose/foundation/internal/InlineClassHelperKt;->throwIllegalArgumentException(Ljava/lang/String;)V

    :cond_1
    if-ltz p4, :cond_2

    move/from16 v0, v16

    goto :goto_1

    :cond_2
    move v0, v13

    :goto_1
    if-nez v0, :cond_3

    .line 3
    const-string v0, "invalid afterContentPadding"

    .line 4
    invoke-static {v0}, Landroidx/compose/foundation/internal/InlineClassHelperKt;->throwIllegalArgumentException(Ljava/lang/String;)V

    :cond_3
    const-wide v17, 0xffffffffL

    const/16 v19, 0x20

    if-gtz p0, :cond_6

    .line 5
    invoke-static/range {p9 .. p10}, Landroidx/compose/ui/unit/Constraints;->getMinWidth-impl(J)I

    move-result v2

    .line 6
    invoke-static/range {p9 .. p10}, Landroidx/compose/ui/unit/Constraints;->getMinHeight-impl(J)I

    move-result v3

    .line 7
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 8
    invoke-virtual/range {p1 .. p1}, Landroidx/compose/foundation/lazy/LazyListMeasuredItemProvider;->getKeyIndexMap()Landroidx/compose/foundation/lazy/layout/LazyLayoutKeyIndexMap;

    move-result-object v5

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v1, 0x0

    const/4 v9, 0x1

    move-object/from16 v6, p1

    move/from16 v7, p11

    move-object/from16 v0, p16

    move/from16 v10, p19

    move/from16 v8, p20

    move-object/from16 v13, p22

    move-object/from16 v14, p24

    move-object/from16 v15, p26

    .line 9
    invoke-virtual/range {v0 .. v14}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->onMeasured(IIILjava/util/List;Landroidx/compose/foundation/lazy/layout/LazyLayoutKeyIndexMap;Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItemProvider;ZZIZIILkotlinx/coroutines/v;Landroidx/compose/ui/graphics/GraphicsContext;)V

    if-nez p20, :cond_4

    .line 10
    invoke-virtual/range {p16 .. p16}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->getMinSizeToFitDisappearingItems-YbymL2g()J

    move-result-wide v0

    .line 11
    sget-object v4, Landroidx/compose/ui/unit/IntSize;->Companion:Landroidx/compose/ui/unit/IntSize$Companion;

    invoke-virtual {v4}, Landroidx/compose/ui/unit/IntSize$Companion;->getZero-YbymL2g()J

    move-result-wide v4

    invoke-static {v0, v1, v4, v5}, Landroidx/compose/ui/unit/IntSize;->equals-impl0(JJ)Z

    move-result v4

    if-nez v4, :cond_4

    shr-long v2, v0, v19

    long-to-int v2, v2

    move-wide/from16 v8, p9

    .line 12
    invoke-static {v8, v9, v2}, Landroidx/compose/ui/unit/ConstraintsKt;->constrainWidth-K40F9xA(JI)I

    move-result v2

    and-long v0, v0, v17

    long-to-int v0, v0

    .line 13
    invoke-static {v8, v9, v0}, Landroidx/compose/ui/unit/ConstraintsKt;->constrainHeight-K40F9xA(JI)I

    move-result v3

    .line 14
    :cond_4
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    sget-object v2, Landroidx/compose/foundation/lazy/LazyListMeasureKt$measureLazyList$3;->INSTANCE:Landroidx/compose/foundation/lazy/LazyListMeasureKt$measureLazyList$3;

    invoke-interface {v15, v0, v1, v2}, Lr6/f;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v25, v0

    check-cast v25, Landroidx/compose/ui/layout/MeasureResult;

    .line 15
    sget-object v32, Lkotlin/collections/EmptyList;->INSTANCE:Lkotlin/collections/EmptyList;

    move/from16 v3, p3

    neg-int v0, v3

    add-int v34, p2, p4

    if-eqz p11, :cond_5

    .line 16
    sget-object v1, Landroidx/compose/foundation/gestures/Orientation;->Vertical:Landroidx/compose/foundation/gestures/Orientation;

    :goto_2
    move-object/from16 v37, v1

    goto :goto_3

    :cond_5
    sget-object v1, Landroidx/compose/foundation/gestures/Orientation;->Horizontal:Landroidx/compose/foundation/gestures/Orientation;

    goto :goto_2

    .line 17
    :goto_3
    invoke-virtual/range {p1 .. p1}, Landroidx/compose/foundation/lazy/LazyListMeasuredItemProvider;->getChildConstraints-msEJaDk()J

    move-result-wide v30

    .line 18
    new-instance v20, Landroidx/compose/foundation/lazy/LazyListMeasureResult;

    const/16 v35, 0x0

    const/16 v40, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    move/from16 v38, p4

    move/from16 v39, p5

    move/from16 v36, p14

    move-object/from16 v29, p15

    move-object/from16 v28, p22

    move/from16 v33, v0

    invoke-direct/range {v20 .. v40}, Landroidx/compose/foundation/lazy/LazyListMeasureResult;-><init>(Landroidx/compose/foundation/lazy/LazyListMeasuredItem;IZFLandroidx/compose/ui/layout/MeasureResult;FZLkotlinx/coroutines/v;Landroidx/compose/ui/unit/Density;JLjava/util/List;IIIZLandroidx/compose/foundation/gestures/Orientation;IILkotlin/jvm/internal/e;)V

    return-object v20

    :cond_6
    move/from16 v6, p0

    move/from16 v10, p2

    move/from16 v14, p3

    move/from16 v0, p6

    move-wide/from16 v8, p9

    move-object/from16 v15, p26

    if-lt v0, v6, :cond_7

    add-int/lit8 v0, v6, -0x1

    move v1, v13

    goto :goto_4

    :cond_7
    move/from16 v1, p7

    .line 19
    :goto_4
    invoke-static/range {p8 .. p8}, Ljava/lang/Math;->round(F)I

    move-result v2

    sub-int/2addr v1, v2

    if-nez v0, :cond_8

    if-gez v1, :cond_8

    add-int/2addr v2, v1

    move v1, v13

    :cond_8
    move v7, v2

    .line 20
    new-instance v11, Lkotlin/collections/p;

    invoke-direct {v11}, Lkotlin/collections/p;-><init>()V

    neg-int v12, v14

    if-gez p5, :cond_9

    move/from16 v2, p5

    goto :goto_5

    :cond_9
    move v2, v13

    :goto_5
    add-int/2addr v2, v12

    add-int/2addr v1, v2

    move v3, v13

    :goto_6
    if-gez v1, :cond_a

    if-lez v0, :cond_a

    add-int/lit8 v0, v0, -0x1

    const/4 v4, 0x2

    const/4 v5, 0x0

    move/from16 v20, v2

    move/from16 v21, v3

    const-wide/16 v2, 0x0

    move v15, v1

    move/from16 p6, v7

    move/from16 v7, v20

    move v1, v0

    move/from16 v20, v12

    move/from16 v12, v21

    move-object/from16 v0, p1

    .line 21
    invoke-static/range {v0 .. v5}, Landroidx/compose/foundation/lazy/LazyListMeasuredItemProvider;->getAndMeasure-0kLqBqw$default(Landroidx/compose/foundation/lazy/LazyListMeasuredItemProvider;IJILjava/lang/Object;)Landroidx/compose/foundation/lazy/LazyListMeasuredItem;

    move-result-object v2

    .line 22
    invoke-virtual {v11, v13, v2}, Lkotlin/collections/p;->add(ILjava/lang/Object;)V

    .line 23
    invoke-virtual {v2}, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;->getCrossAxisSize()I

    move-result v0

    invoke-static {v12, v0}, Ljava/lang/Math;->max(II)I

    move-result v3

    .line 24
    invoke-virtual {v2}, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;->getMainAxisSizeWithSpacings()I

    move-result v0

    add-int/2addr v0, v15

    move v2, v1

    move v1, v0

    move v0, v2

    move-object/from16 v15, p26

    move v2, v7

    move/from16 v12, v20

    move/from16 v7, p6

    goto :goto_6

    :cond_a
    move v15, v1

    move/from16 p6, v7

    move/from16 v20, v12

    move v7, v2

    move v12, v3

    if-ge v15, v7, :cond_b

    sub-int v2, v7, v15

    sub-int v1, p6, v2

    move v15, v1

    move v2, v7

    goto :goto_7

    :cond_b
    move v2, v15

    move/from16 v15, p6

    :goto_7
    sub-int/2addr v2, v7

    add-int v21, v10, p4

    if-gez v21, :cond_c

    move v1, v13

    goto :goto_8

    :cond_c
    move/from16 v1, v21

    :goto_8
    neg-int v3, v2

    move v5, v0

    move v4, v13

    move/from16 v22, v4

    .line 25
    :goto_9
    invoke-virtual {v11}, Lkotlin/collections/j;->size()I

    move-result v13

    if-ge v4, v13, :cond_e

    if-lt v3, v1, :cond_d

    .line 26
    invoke-virtual {v11, v4}, Lkotlin/collections/j;->remove(I)Ljava/lang/Object;

    move/from16 v22, v16

    goto :goto_9

    :cond_d
    add-int/lit8 v5, v5, 0x1

    .line 27
    invoke-virtual {v11, v4}, Lkotlin/collections/p;->get(I)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;

    invoke-virtual {v13}, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;->getMainAxisSizeWithSpacings()I

    move-result v13

    add-int/2addr v3, v13

    add-int/lit8 v4, v4, 0x1

    goto :goto_9

    :cond_e
    move v13, v12

    move v12, v0

    move v0, v3

    move v3, v13

    move v13, v2

    :goto_a
    if-ge v5, v6, :cond_f

    if-lt v0, v1, :cond_10

    if-lez v0, :cond_10

    .line 28
    invoke-virtual {v11}, Lkotlin/collections/p;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_f

    goto :goto_b

    :cond_f
    move v6, v0

    move v0, v5

    move/from16 p6, v12

    move v12, v3

    goto :goto_d

    :cond_10
    :goto_b
    const/4 v4, 0x2

    move v2, v1

    move v1, v5

    const/4 v5, 0x0

    move/from16 v24, v2

    move/from16 v25, v3

    const-wide/16 v2, 0x0

    move v6, v0

    move/from16 p6, v12

    move/from16 v12, v25

    move-object/from16 v0, p1

    .line 29
    invoke-static/range {v0 .. v5}, Landroidx/compose/foundation/lazy/LazyListMeasuredItemProvider;->getAndMeasure-0kLqBqw$default(Landroidx/compose/foundation/lazy/LazyListMeasuredItemProvider;IJILjava/lang/Object;)Landroidx/compose/foundation/lazy/LazyListMeasuredItem;

    move-result-object v2

    move v0, v1

    .line 30
    invoke-virtual {v2}, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;->getMainAxisSizeWithSpacings()I

    move-result v1

    add-int/2addr v1, v6

    if-gt v1, v7, :cond_11

    add-int/lit8 v3, p0, -0x1

    if-eq v0, v3, :cond_11

    add-int/lit8 v5, v0, 0x1

    .line 31
    invoke-virtual {v2}, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;->getMainAxisSizeWithSpacings()I

    move-result v2

    sub-int/2addr v13, v2

    move v3, v12

    move/from16 v22, v16

    move v12, v5

    goto :goto_c

    .line 32
    :cond_11
    invoke-virtual {v2}, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;->getCrossAxisSize()I

    move-result v3

    invoke-static {v12, v3}, Ljava/lang/Math;->max(II)I

    move-result v3

    .line 33
    invoke-virtual {v11, v2}, Lkotlin/collections/p;->addLast(Ljava/lang/Object;)V

    move/from16 v12, p6

    :goto_c
    add-int/lit8 v5, v0, 0x1

    move/from16 v6, p0

    move v0, v1

    move/from16 v1, v24

    goto :goto_a

    :goto_d
    if-ge v6, v10, :cond_14

    sub-int v7, v10, v6

    sub-int/2addr v13, v7

    add-int/2addr v6, v7

    move/from16 v1, p6

    :goto_e
    if-ge v13, v14, :cond_12

    if-lez v1, :cond_12

    add-int/lit8 v1, v1, -0x1

    const/4 v4, 0x2

    const/4 v5, 0x0

    const-wide/16 v2, 0x0

    move/from16 v41, v0

    move-object/from16 v0, p1

    .line 34
    invoke-static/range {v0 .. v5}, Landroidx/compose/foundation/lazy/LazyListMeasuredItemProvider;->getAndMeasure-0kLqBqw$default(Landroidx/compose/foundation/lazy/LazyListMeasuredItemProvider;IJILjava/lang/Object;)Landroidx/compose/foundation/lazy/LazyListMeasuredItem;

    move-result-object v2

    const/4 v3, 0x0

    .line 35
    invoke-virtual {v11, v3, v2}, Lkotlin/collections/p;->add(ILjava/lang/Object;)V

    .line 36
    invoke-virtual {v2}, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;->getCrossAxisSize()I

    move-result v4

    invoke-static {v12, v4}, Ljava/lang/Math;->max(II)I

    move-result v12

    .line 37
    invoke-virtual {v2}, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;->getMainAxisSizeWithSpacings()I

    move-result v2

    add-int/2addr v13, v2

    move/from16 v0, v41

    goto :goto_e

    :cond_12
    move/from16 v41, v0

    const/4 v3, 0x0

    move-object/from16 v0, p1

    add-int/2addr v7, v15

    if-gez v13, :cond_13

    add-int/2addr v7, v13

    add-int v2, v6, v13

    move v13, v2

    move v2, v1

    move v1, v12

    move v12, v13

    move v13, v3

    goto :goto_10

    :cond_13
    move v2, v1

    move v1, v12

    :goto_f
    move v12, v6

    goto :goto_10

    :cond_14
    move/from16 v41, v0

    const/4 v3, 0x0

    move-object/from16 v0, p1

    move/from16 v2, p6

    move v1, v12

    move v7, v15

    goto :goto_f

    .line 38
    :goto_10
    invoke-static/range {p8 .. p8}, Ljava/lang/Math;->round(F)I

    move-result v4

    .line 39
    invoke-static {v4}, Ljava/lang/Integer;->signum(I)I

    move-result v4

    invoke-static {v7}, Ljava/lang/Integer;->signum(I)I

    move-result v5

    if-ne v4, v5, :cond_15

    .line 40
    invoke-static/range {p8 .. p8}, Ljava/lang/Math;->round(F)I

    move-result v4

    .line 41
    invoke-static {v4}, Ljava/lang/Math;->abs(I)I

    move-result v4

    invoke-static {v7}, Ljava/lang/Math;->abs(I)I

    move-result v5

    if-lt v4, v5, :cond_15

    int-to-float v4, v7

    move v5, v4

    goto :goto_11

    :cond_15
    move/from16 v5, p8

    :goto_11
    sub-float v4, p8, v5

    const/4 v6, 0x0

    if-eqz p20, :cond_16

    if-le v7, v15, :cond_16

    cmpg-float v23, v4, v6

    if-gtz v23, :cond_16

    sub-int/2addr v7, v15

    int-to-float v6, v7

    add-float/2addr v6, v4

    :cond_16
    move v15, v6

    if-ltz v13, :cond_17

    move/from16 v4, v16

    goto :goto_12

    :cond_17
    move v4, v3

    :goto_12
    if-nez v4, :cond_18

    .line 42
    const-string v4, "negative currentFirstItemScrollOffset"

    .line 43
    invoke-static {v4}, Landroidx/compose/foundation/internal/InlineClassHelperKt;->throwIllegalArgumentException(Ljava/lang/String;)V

    :cond_18
    neg-int v4, v13

    .line 44
    invoke-virtual {v11}, Lkotlin/collections/p;->first()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;

    if-gtz v14, :cond_1b

    if-gez p5, :cond_19

    goto :goto_13

    :cond_19
    move/from16 p6, v1

    :cond_1a
    move/from16 v3, p17

    move v7, v4

    move/from16 v24, v13

    move-object/from16 v4, p18

    move-object v13, v6

    goto :goto_15

    .line 45
    :cond_1b
    :goto_13
    invoke-interface {v11}, Ljava/util/Collection;->size()I

    move-result v7

    :goto_14
    if-ge v3, v7, :cond_19

    .line 46
    invoke-virtual {v11, v3}, Lkotlin/collections/p;->get(I)Ljava/lang/Object;

    move-result-object v24

    check-cast v24, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;

    move/from16 p6, v1

    invoke-virtual/range {v24 .. v24}, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;->getMainAxisSizeWithSpacings()I

    move-result v1

    if-eqz v13, :cond_1a

    if-gt v1, v13, :cond_1a

    move/from16 p7, v1

    .line 47
    invoke-static {v11}, Lkotlin/collections/u;->u(Ljava/util/List;)I

    move-result v1

    if-eq v3, v1, :cond_1a

    sub-int v13, v13, p7

    add-int/lit8 v3, v3, 0x1

    .line 48
    invoke-virtual {v11, v3}, Lkotlin/collections/p;->get(I)Ljava/lang/Object;

    move-result-object v1

    move-object v6, v1

    check-cast v6, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;

    move/from16 v1, p6

    goto :goto_14

    .line 49
    :goto_15
    invoke-static {v2, v0, v3, v4}, Landroidx/compose/foundation/lazy/LazyListMeasureKt;->createItemsBeforeList(ILandroidx/compose/foundation/lazy/LazyListMeasuredItemProvider;ILjava/util/List;)Ljava/util/List;

    move-result-object v1

    .line 50
    invoke-interface {v1}, Ljava/util/Collection;->size()I

    move-result v2

    move/from16 v6, p6

    const/4 v0, 0x0

    :goto_16
    if-ge v0, v2, :cond_1c

    .line 51
    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v25

    .line 52
    check-cast v25, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;

    move/from16 v26, v0

    .line 53
    invoke-virtual/range {v25 .. v25}, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;->getCrossAxisSize()I

    move-result v0

    invoke-static {v6, v0}, Ljava/lang/Math;->max(II)I

    move-result v6

    add-int/lit8 v0, v26, 0x1

    goto :goto_16

    :cond_1c
    const/16 v23, 0x0

    move/from16 v2, p0

    move-object/from16 v26, v1

    move/from16 v25, v7

    move-object v0, v11

    move-object/from16 v1, p1

    move-object/from16 v7, p21

    move v11, v6

    move/from16 v6, p20

    .line 54
    invoke-static/range {v0 .. v7}, Landroidx/compose/foundation/lazy/LazyListMeasureKt;->createItemsAfterList(Ljava/util/List;Landroidx/compose/foundation/lazy/LazyListMeasuredItemProvider;IILjava/util/List;FZLandroidx/compose/foundation/lazy/LazyListLayoutInfo;)Ljava/util/List;

    move-result-object v3

    .line 55
    invoke-interface {v3}, Ljava/util/Collection;->size()I

    move-result v1

    move v6, v11

    move/from16 v2, v23

    :goto_17
    if-ge v2, v1, :cond_1d

    .line 56
    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    .line 57
    check-cast v4, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;

    .line 58
    invoke-virtual {v4}, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;->getCrossAxisSize()I

    move-result v4

    invoke-static {v6, v4}, Ljava/lang/Math;->max(II)I

    move-result v6

    add-int/lit8 v2, v2, 0x1

    goto :goto_17

    .line 59
    :cond_1d
    invoke-virtual {v0}, Lkotlin/collections/p;->first()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v13, v1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1e

    .line 60
    invoke-interface/range {v26 .. v26}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_1e

    .line 61
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_1e

    move/from16 v27, v16

    goto :goto_18

    :cond_1e
    move/from16 v27, v23

    :goto_18
    if-eqz p11, :cond_1f

    move v1, v6

    goto :goto_19

    :cond_1f
    move v1, v12

    .line 62
    :goto_19
    invoke-static {v8, v9, v1}, Landroidx/compose/ui/unit/ConstraintsKt;->constrainWidth-K40F9xA(JI)I

    move-result v2

    if-eqz p11, :cond_20

    move v6, v12

    .line 63
    :cond_20
    invoke-static {v8, v9, v6}, Landroidx/compose/ui/unit/ConstraintsKt;->constrainHeight-K40F9xA(JI)I

    move-result v4

    move-object/from16 p6, v3

    move v3, v2

    move-object/from16 v2, p6

    move/from16 v8, p11

    move-object/from16 v9, p12

    move/from16 v11, p14

    move v6, v10

    move/from16 p6, v15

    move/from16 v7, v25

    move-object/from16 v1, v26

    move-object/from16 v10, p13

    move v15, v5

    move v5, v12

    move-object/from16 v12, p15

    .line 64
    invoke-static/range {v0 .. v12}, Landroidx/compose/foundation/lazy/LazyListMeasureKt;->calculateItemsOffsets(Ljava/util/List;Ljava/util/List;Ljava/util/List;IIIIIZLandroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;ZLandroidx/compose/ui/unit/Density;)Ljava/util/List;

    move-result-object v1

    move-object/from16 v25, v0

    move v2, v3

    move v3, v4

    move-object v4, v1

    float-to-int v1, v15

    move v12, v5

    .line 65
    invoke-virtual/range {p1 .. p1}, Landroidx/compose/foundation/lazy/LazyListMeasuredItemProvider;->getKeyIndexMap()Landroidx/compose/foundation/lazy/layout/LazyLayoutKeyIndexMap;

    move-result-object v5

    const/4 v9, 0x1

    move-object/from16 v6, p1

    move/from16 v7, p11

    move-object/from16 v0, p16

    move/from16 v10, p19

    move/from16 v8, p20

    move-object/from16 v14, p24

    move-object/from16 v26, v13

    move/from16 v11, v24

    move-object/from16 v13, p22

    move/from16 v24, v15

    move/from16 v15, p2

    .line 66
    invoke-virtual/range {v0 .. v14}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->onMeasured(IIILjava/util/List;Landroidx/compose/foundation/lazy/layout/LazyLayoutKeyIndexMap;Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItemProvider;ZZIZIILkotlinx/coroutines/v;Landroidx/compose/ui/graphics/GraphicsContext;)V

    move v9, v8

    move-object v8, v6

    if-nez v9, :cond_24

    .line 67
    invoke-virtual/range {p16 .. p16}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->getMinSizeToFitDisappearingItems-YbymL2g()J

    move-result-wide v0

    .line 68
    sget-object v5, Landroidx/compose/ui/unit/IntSize;->Companion:Landroidx/compose/ui/unit/IntSize$Companion;

    invoke-virtual {v5}, Landroidx/compose/ui/unit/IntSize$Companion;->getZero-YbymL2g()J

    move-result-wide v5

    invoke-static {v0, v1, v5, v6}, Landroidx/compose/ui/unit/IntSize;->equals-impl0(JJ)Z

    move-result v5

    if-nez v5, :cond_24

    if-eqz p11, :cond_21

    move v5, v3

    goto :goto_1a

    :cond_21
    move v5, v2

    :goto_1a
    shr-long v6, v0, v19

    long-to-int v6, v6

    .line 69
    invoke-static {v2, v6}, Ljava/lang/Math;->max(II)I

    move-result v2

    move-wide/from16 v6, p9

    invoke-static {v6, v7, v2}, Landroidx/compose/ui/unit/ConstraintsKt;->constrainWidth-K40F9xA(JI)I

    move-result v2

    and-long v0, v0, v17

    long-to-int v0, v0

    .line 70
    invoke-static {v3, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    invoke-static {v6, v7, v0}, Landroidx/compose/ui/unit/ConstraintsKt;->constrainHeight-K40F9xA(JI)I

    move-result v0

    if-eqz p11, :cond_22

    move v1, v0

    goto :goto_1b

    :cond_22
    move v1, v2

    :goto_1b
    if-eq v1, v5, :cond_23

    .line 71
    invoke-interface {v4}, Ljava/util/Collection;->size()I

    move-result v3

    move/from16 v13, v23

    :goto_1c
    if-ge v13, v3, :cond_23

    .line 72
    invoke-interface {v4, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    .line 73
    check-cast v5, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;

    .line 74
    invoke-virtual {v5, v1}, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;->updateMainAxisLayoutSize(I)V

    add-int/lit8 v13, v13, 0x1

    goto :goto_1c

    :cond_23
    move v6, v0

    :goto_1d
    move v5, v2

    goto :goto_1e

    :cond_24
    move v6, v3

    goto :goto_1d

    .line 75
    :goto_1e
    invoke-virtual {v8}, Landroidx/compose/foundation/lazy/LazyListMeasuredItemProvider;->getHeaderIndexes()Landroidx/collection/IntList;

    move-result-object v2

    .line 76
    new-instance v7, Landroidx/compose/foundation/lazy/LazyListMeasureKt$measureLazyList$stickingItems$1;

    invoke-direct {v7, v8}, Landroidx/compose/foundation/lazy/LazyListMeasureKt$measureLazyList$stickingItems$1;-><init>(Landroidx/compose/foundation/lazy/LazyListMeasuredItemProvider;)V

    move/from16 v3, p3

    move-object/from16 v0, p25

    move-object v1, v4

    move/from16 v4, p4

    invoke-static/range {v0 .. v7}, Landroidx/compose/foundation/lazy/layout/LazyLayoutStickyItemsKt;->applyStickyItems(Landroidx/compose/foundation/lazy/layout/StickyItemsPlacement;Ljava/util/List;Landroidx/collection/IntList;IIIILr6/c;)Ljava/util/List;

    move-result-object v0

    move-object v4, v1

    const/4 v1, 0x0

    if-eqz v27, :cond_26

    .line 77
    invoke-static {v4}, Lkotlin/collections/t;->i0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;

    if-eqz v2, :cond_25

    invoke-virtual {v2}, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;->getIndex()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    goto :goto_1f

    :cond_25
    move-object v2, v1

    goto :goto_1f

    .line 78
    :cond_26
    invoke-virtual/range {v25 .. v25}, Lkotlin/collections/p;->c()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;

    if-eqz v2, :cond_25

    invoke-virtual {v2}, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;->getIndex()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    :goto_1f
    if-eqz v27, :cond_28

    .line 79
    invoke-static {v4}, Lkotlin/collections/t;->p0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;

    if-eqz v3, :cond_27

    invoke-virtual {v3}, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;->getIndex()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    :cond_27
    :goto_20
    move/from16 v3, p0

    move/from16 v7, v41

    goto :goto_21

    .line 80
    :cond_28
    invoke-virtual/range {v25 .. v25}, Lkotlin/collections/p;->e()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;

    if-eqz v3, :cond_27

    invoke-virtual {v3}, Landroidx/compose/foundation/lazy/LazyListMeasuredItem;->getIndex()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    goto :goto_20

    :goto_21
    if-lt v7, v3, :cond_2a

    if-le v12, v15, :cond_29

    goto :goto_22

    :cond_29
    move/from16 v16, v23

    .line 81
    :cond_2a
    :goto_22
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    new-instance v7, Landroidx/compose/foundation/lazy/LazyListMeasureKt$measureLazyList$8;

    move-object/from16 v10, p23

    invoke-direct {v7, v10, v4, v0, v9}, Landroidx/compose/foundation/lazy/LazyListMeasureKt$measureLazyList$8;-><init>(Landroidx/compose/runtime/MutableState;Ljava/util/List;Ljava/util/List;Z)V

    move-object/from16 v15, p26

    invoke-interface {v15, v5, v6, v7}, Lr6/f;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroidx/compose/ui/layout/MeasureResult;

    if-eqz v2, :cond_2b

    .line 82
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v13

    goto :goto_23

    :cond_2b
    move/from16 v13, v23

    :goto_23
    if-eqz v1, :cond_2c

    .line 83
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    goto :goto_24

    :cond_2c
    move/from16 v1, v23

    .line 84
    :goto_24
    invoke-static {v13, v1, v4, v0}, Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItemKt;->updatedVisibleItems(IILjava/util/List;Ljava/util/List;)Ljava/util/List;

    move-result-object v12

    if-eqz p11, :cond_2d

    .line 85
    sget-object v0, Landroidx/compose/foundation/gestures/Orientation;->Vertical:Landroidx/compose/foundation/gestures/Orientation;

    :goto_25
    move-object/from16 v17, v0

    goto :goto_26

    :cond_2d
    sget-object v0, Landroidx/compose/foundation/gestures/Orientation;->Horizontal:Landroidx/compose/foundation/gestures/Orientation;

    goto :goto_25

    .line 86
    :goto_26
    invoke-virtual {v8}, Landroidx/compose/foundation/lazy/LazyListMeasuredItemProvider;->getChildConstraints-msEJaDk()J

    move-result-wide v0

    move v2, v11

    move-wide v10, v0

    .line 87
    new-instance v0, Landroidx/compose/foundation/lazy/LazyListMeasureResult;

    move/from16 v13, v20

    const/16 v20, 0x0

    move/from16 v18, p4

    move/from16 v19, p5

    move/from16 v6, p6

    move-object/from16 v9, p15

    move-object/from16 v8, p22

    move v15, v3

    move/from16 v3, v16

    move/from16 v14, v21

    move/from16 v7, v22

    move/from16 v4, v24

    move-object/from16 v1, v26

    move/from16 v16, p14

    invoke-direct/range {v0 .. v20}, Landroidx/compose/foundation/lazy/LazyListMeasureResult;-><init>(Landroidx/compose/foundation/lazy/LazyListMeasuredItem;IZFLandroidx/compose/ui/layout/MeasureResult;FZLkotlinx/coroutines/v;Landroidx/compose/ui/unit/Density;JLjava/util/List;IIIZLandroidx/compose/foundation/gestures/Orientation;IILkotlin/jvm/internal/e;)V

    return-object v0
.end method
