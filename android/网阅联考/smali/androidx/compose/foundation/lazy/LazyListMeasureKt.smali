.class public final Landroidx/compose/foundation/lazy/LazyListMeasureKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u009e\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u008c\u0001\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\t0\u00082\u000c\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u000b2\u000c\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u000b2\u000c\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u000b2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00042\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0008\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u001bH\u0002\u001aL\u0010\u001c\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u000b2\u0006\u0010\u001d\u001a\u00020\u001e2\u000c\u0010\u001f\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u00082\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u00022\u0006\u0010%\u001a\u00020\u00022\u0006\u0010&\u001a\u00020\'H\u0002\u001aS\u0010(\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u000b2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010)\u001a\u00020*2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u00022\u0006\u0010%\u001a\u00020\u00022\u0006\u0010&\u001a\u00020\'H\u0002\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008+\u0010,\u001a\u00f8\u0001\u0010-\u001a\u00020.2\u0006\u0010$\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020#2\u0006\u0010 \u001a\u00020!2\u0006\u0010/\u001a\u00020\u00022\u0006\u00100\u001a\u00020\u00022\u0006\u00101\u001a\u00020\u00022\u0006\u00102\u001a\u00020\u00022\u0006\u00103\u001a\u00020*2\u0006\u00104\u001a\u00020\u00022\u0006\u00105\u001a\u0002062\u0006\u00107\u001a\u0002082\u0006\u0010\u0014\u001a\u00020\u00042\u000c\u00109\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u000b2\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0008\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010:\u001a\u00020;2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010%\u001a\u00020\u00022\u0006\u0010&\u001a\u00020\'2/\u0010<\u001a+\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00020?\u0012\u0004\u0012\u00020@0>\u00a2\u0006\u0002\u0008A\u0012\u0004\u0012\u00020B0=H\u0000\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008C\u0010D\"\u001a\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000\"\u0018\u0010\u0003\u001a\u00020\u0004*\u00020\u00028BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0005\u0010\u0006\u0082\u0002\u000b\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008\u0019\u00a8\u0006E"
    }
    d2 = {
        "EmptyRange",
        "Lkotlin/Pair;",
        "",
        "notInEmptyRange",
        "",
        "getNotInEmptyRange",
        "(I)Z",
        "calculateItemsOffsets",
        "",
        "Landroidx/compose/foundation/lazy/LazyListPositionedItem;",
        "items",
        "",
        "Landroidx/compose/foundation/lazy/LazyMeasuredItem;",
        "extraItemsBefore",
        "extraItemsAfter",
        "layoutWidth",
        "layoutHeight",
        "finalMainAxisOffset",
        "maxOffset",
        "itemsScrollOffset",
        "isVertical",
        "verticalArrangement",
        "Landroidx/compose/foundation/layout/Arrangement$Vertical;",
        "horizontalArrangement",
        "Landroidx/compose/foundation/layout/Arrangement$Horizontal;",
        "reverseLayout",
        "density",
        "Landroidx/compose/ui/unit/Density;",
        "createItemsAfterList",
        "beyondBoundsInfo",
        "Landroidx/compose/foundation/lazy/LazyListBeyondBoundsInfo;",
        "visibleItems",
        "measuredItemProvider",
        "Landroidx/compose/foundation/lazy/LazyMeasuredItemProvider;",
        "itemProvider",
        "Landroidx/compose/foundation/lazy/LazyListItemProvider;",
        "itemsCount",
        "beyondBoundsItemCount",
        "pinnedItems",
        "Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList;",
        "createItemsBeforeList",
        "currentFirstItemIndex",
        "Landroidx/compose/foundation/lazy/DataIndex;",
        "createItemsBeforeList-tv8sHfA",
        "(Landroidx/compose/foundation/lazy/LazyListBeyondBoundsInfo;ILandroidx/compose/foundation/lazy/LazyMeasuredItemProvider;Landroidx/compose/foundation/lazy/LazyListItemProvider;IILandroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList;)Ljava/util/List;",
        "measureLazyList",
        "Landroidx/compose/foundation/lazy/LazyListMeasureResult;",
        "mainAxisAvailableSize",
        "beforeContentPadding",
        "afterContentPadding",
        "spaceBetweenItems",
        "firstVisibleItemIndex",
        "firstVisibleItemScrollOffset",
        "scrollToBeConsumed",
        "",
        "constraints",
        "Landroidx/compose/ui/unit/Constraints;",
        "headerIndexes",
        "placementAnimator",
        "Landroidx/compose/foundation/lazy/LazyListItemPlacementAnimator;",
        "layout",
        "Lkotlin/Function3;",
        "Lkotlin/Function1;",
        "Landroidx/compose/ui/layout/Placeable$PlacementScope;",
        "",
        "Lkotlin/ExtensionFunctionType;",
        "Landroidx/compose/ui/layout/MeasureResult;",
        "measureLazyList-Hh3qtAg",
        "(ILandroidx/compose/foundation/lazy/LazyListItemProvider;Landroidx/compose/foundation/lazy/LazyMeasuredItemProvider;IIIIIIFJZLjava/util/List;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;ZLandroidx/compose/ui/unit/Density;Landroidx/compose/foundation/lazy/LazyListItemPlacementAnimator;Landroidx/compose/foundation/lazy/LazyListBeyondBoundsInfo;ILandroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList;Lkotlin/jvm/functions/Function3;)Landroidx/compose/foundation/lazy/LazyListMeasureResult;",
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
        "SMAP\nLazyListMeasure.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyListMeasure.kt\nandroidx/compose/foundation/lazy/LazyListMeasureKt\n+ 2 DataIndex.kt\nandroidx/compose/foundation/lazy/DataIndex\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 4 TempListUtils.kt\nandroidx/compose/foundation/TempListUtilsKt\n*L\n1#1,515:1\n30#2:516\n25#2:521\n27#2:523\n25#2:524\n30#2:525\n33#3,4:517\n38#3:522\n33#3,6:526\n33#3,6:532\n33#3,4:541\n38#3:547\n33#3,6:549\n33#3,6:555\n33#3,6:561\n33#3,6:567\n33#3,6:573\n36#4,3:538\n39#4,2:545\n41#4:548\n*S KotlinDebug\n*F\n+ 1 LazyListMeasure.kt\nandroidx/compose/foundation/lazy/LazyListMeasureKt\n*L\n127#1:516\n152#1:521\n169#1:523\n176#1:524\n186#1:525\n151#1:517,4\n151#1:522\n248#1:526,6\n264#1:532,6\n330#1:541,4\n330#1:547\n376#1:549,6\n419#1:555,6\n494#1:561,6\n500#1:567,6\n505#1:573,6\n330#1:538,3\n330#1:545,2\n330#1:548\n*E\n"
    }
.end annotation


# static fields
.field private static final EmptyRange:Lkotlin/Pair;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/Pair<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 1
    const/high16 v0, -0x80000000

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    sput-object v0, Landroidx/compose/foundation/lazy/LazyListMeasureKt;->EmptyRange:Lkotlin/Pair;

    .line 12
    .line 13
    return-void
.end method

.method private static final calculateItemsOffsets(Ljava/util/List;Ljava/util/List;Ljava/util/List;IIIIIZLandroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;ZLandroidx/compose/ui/unit/Density;)Ljava/util/List;
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroidx/compose/foundation/lazy/LazyMeasuredItem;",
            ">;",
            "Ljava/util/List<",
            "Landroidx/compose/foundation/lazy/LazyMeasuredItem;",
            ">;",
            "Ljava/util/List<",
            "Landroidx/compose/foundation/lazy/LazyMeasuredItem;",
            ">;IIIIIZ",
            "Landroidx/compose/foundation/layout/Arrangement$Vertical;",
            "Landroidx/compose/foundation/layout/Arrangement$Horizontal;",
            "Z",
            "Landroidx/compose/ui/unit/Density;",
            ")",
            "Ljava/util/List<",
            "Landroidx/compose/foundation/lazy/LazyListPositionedItem;",
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
    new-instance v9, Ljava/util/ArrayList;

    .line 53
    .line 54
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 55
    .line 56
    .line 57
    move-result v10

    .line 58
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 59
    .line 60
    .line 61
    move-result v11

    .line 62
    add-int/2addr v10, v11

    .line 63
    invoke-interface/range {p2 .. p2}, Ljava/util/List;->size()I

    .line 64
    .line 65
    .line 66
    move-result v11

    .line 67
    add-int/2addr v10, v11

    .line 68
    invoke-direct {v9, v10}, Ljava/util/ArrayList;-><init>(I)V

    .line 69
    .line 70
    .line 71
    if-eqz v5, :cond_10

    .line 72
    .line 73
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 74
    .line 75
    .line 76
    move-result v5

    .line 77
    if-eqz v5, :cond_5

    .line 78
    .line 79
    invoke-interface/range {p2 .. p2}, Ljava/util/List;->isEmpty()Z

    .line 80
    .line 81
    .line 82
    move-result v5

    .line 83
    if-eqz v5, :cond_5

    .line 84
    .line 85
    goto :goto_4

    .line 86
    :cond_5
    move v7, v8

    .line 87
    :goto_4
    if-eqz v7, :cond_f

    .line 88
    .line 89
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 90
    .line 91
    .line 92
    move-result v5

    .line 93
    new-array v7, v5, [I

    .line 94
    .line 95
    move v10, v8

    .line 96
    :goto_5
    if-ge v10, v5, :cond_6

    .line 97
    .line 98
    invoke-static {v10, v4, v5}, Landroidx/compose/foundation/lazy/LazyListMeasureKt;->calculateItemsOffsets$reverseAware(IZI)I

    .line 99
    .line 100
    .line 101
    move-result v11

    .line 102
    invoke-interface {p0, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v11

    .line 106
    check-cast v11, Landroidx/compose/foundation/lazy/LazyMeasuredItem;

    .line 107
    .line 108
    invoke-virtual {v11}, Landroidx/compose/foundation/lazy/LazyMeasuredItem;->getSize()I

    .line 109
    .line 110
    .line 111
    move-result v11

    .line 112
    aput v11, v7, v10

    .line 113
    .line 114
    add-int/lit8 v10, v10, 0x1

    .line 115
    .line 116
    goto :goto_5

    .line 117
    :cond_6
    new-array v10, v5, [I

    .line 118
    .line 119
    move v11, v8

    .line 120
    :goto_6
    if-ge v11, v5, :cond_7

    .line 121
    .line 122
    aput v8, v10, v11

    .line 123
    .line 124
    add-int/lit8 v11, v11, 0x1

    .line 125
    .line 126
    goto :goto_6

    .line 127
    :cond_7
    const-string v8, "Required value was null."

    .line 128
    .line 129
    if-eqz p8, :cond_9

    .line 130
    .line 131
    if-eqz v3, :cond_8

    .line 132
    .line 133
    move-object/from16 v11, p12

    .line 134
    .line 135
    invoke-interface {v3, v11, v6, v7, v10}, Landroidx/compose/foundation/layout/Arrangement$Vertical;->arrange(Landroidx/compose/ui/unit/Density;I[I[I)V

    .line 136
    .line 137
    .line 138
    goto :goto_7

    .line 139
    :cond_8
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 140
    .line 141
    invoke-virtual {v8}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object v1

    .line 145
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 146
    .line 147
    .line 148
    throw v0

    .line 149
    :cond_9
    move-object/from16 v11, p12

    .line 150
    .line 151
    if-eqz p10, :cond_e

    .line 152
    .line 153
    sget-object v3, Landroidx/compose/ui/unit/LayoutDirection;->Ltr:Landroidx/compose/ui/unit/LayoutDirection;

    .line 154
    .line 155
    move-object/from16 p5, p10

    .line 156
    .line 157
    move-object/from16 p6, p12

    .line 158
    .line 159
    move/from16 p7, v6

    .line 160
    .line 161
    move-object/from16 p8, v7

    .line 162
    .line 163
    move-object/from16 p9, v3

    .line 164
    .line 165
    move-object/from16 p10, v10

    .line 166
    .line 167
    invoke-interface/range {p5 .. p10}, Landroidx/compose/foundation/layout/Arrangement$Horizontal;->arrange(Landroidx/compose/ui/unit/Density;I[ILandroidx/compose/ui/unit/LayoutDirection;[I)V

    .line 168
    .line 169
    .line 170
    :goto_7
    invoke-static {v10}, Lkotlin/collections/ArraysKt;->getIndices([I)Lkotlin/ranges/IntRange;

    .line 171
    .line 172
    .line 173
    move-result-object v3

    .line 174
    if-nez v4, :cond_a

    .line 175
    .line 176
    goto :goto_8

    .line 177
    :cond_a
    invoke-static {v3}, Lkotlin/ranges/RangesKt;->reversed(Lkotlin/ranges/IntProgression;)Lkotlin/ranges/IntProgression;

    .line 178
    .line 179
    .line 180
    move-result-object v3

    .line 181
    :goto_8
    invoke-virtual {v3}, Lkotlin/ranges/IntProgression;->getFirst()I

    .line 182
    .line 183
    .line 184
    move-result v7

    .line 185
    invoke-virtual {v3}, Lkotlin/ranges/IntProgression;->getLast()I

    .line 186
    .line 187
    .line 188
    move-result v8

    .line 189
    invoke-virtual {v3}, Lkotlin/ranges/IntProgression;->getStep()I

    .line 190
    .line 191
    .line 192
    move-result v3

    .line 193
    if-lez v3, :cond_b

    .line 194
    .line 195
    if-le v7, v8, :cond_c

    .line 196
    .line 197
    :cond_b
    if-gez v3, :cond_13

    .line 198
    .line 199
    if-gt v8, v7, :cond_13

    .line 200
    .line 201
    :cond_c
    :goto_9
    aget v11, v10, v7

    .line 202
    .line 203
    invoke-static {v7, v4, v5}, Landroidx/compose/foundation/lazy/LazyListMeasureKt;->calculateItemsOffsets$reverseAware(IZI)I

    .line 204
    .line 205
    .line 206
    move-result v12

    .line 207
    invoke-interface {p0, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 208
    .line 209
    .line 210
    move-result-object v12

    .line 211
    check-cast v12, Landroidx/compose/foundation/lazy/LazyMeasuredItem;

    .line 212
    .line 213
    if-eqz v4, :cond_d

    .line 214
    .line 215
    sub-int v11, v6, v11

    .line 216
    .line 217
    invoke-virtual {v12}, Landroidx/compose/foundation/lazy/LazyMeasuredItem;->getSize()I

    .line 218
    .line 219
    .line 220
    move-result v13

    .line 221
    sub-int/2addr v11, v13

    .line 222
    :cond_d
    invoke-virtual {v12, v11, v1, v2}, Landroidx/compose/foundation/lazy/LazyMeasuredItem;->position(III)Landroidx/compose/foundation/lazy/LazyListPositionedItem;

    .line 223
    .line 224
    .line 225
    move-result-object v11

    .line 226
    invoke-virtual {v9, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 227
    .line 228
    .line 229
    if-eq v7, v8, :cond_13

    .line 230
    .line 231
    add-int/2addr v7, v3

    .line 232
    goto :goto_9

    .line 233
    :cond_e
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 234
    .line 235
    invoke-virtual {v8}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 236
    .line 237
    .line 238
    move-result-object v1

    .line 239
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 240
    .line 241
    .line 242
    throw v0

    .line 243
    :cond_f
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 244
    .line 245
    const-string v1, "Failed requirement."

    .line 246
    .line 247
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 248
    .line 249
    .line 250
    move-result-object v1

    .line 251
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 252
    .line 253
    .line 254
    throw v0

    .line 255
    :cond_10
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 256
    .line 257
    .line 258
    move-result v3

    .line 259
    move/from16 v5, p7

    .line 260
    .line 261
    move v4, v8

    .line 262
    :goto_a
    if-ge v4, v3, :cond_11

    .line 263
    .line 264
    move-object v6, p1

    .line 265
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 266
    .line 267
    .line 268
    move-result-object v7

    .line 269
    check-cast v7, Landroidx/compose/foundation/lazy/LazyMeasuredItem;

    .line 270
    .line 271
    invoke-virtual {v7}, Landroidx/compose/foundation/lazy/LazyMeasuredItem;->getSizeWithSpacings()I

    .line 272
    .line 273
    .line 274
    move-result v10

    .line 275
    sub-int/2addr v5, v10

    .line 276
    invoke-virtual {v7, v5, v1, v2}, Landroidx/compose/foundation/lazy/LazyMeasuredItem;->position(III)Landroidx/compose/foundation/lazy/LazyListPositionedItem;

    .line 277
    .line 278
    .line 279
    move-result-object v7

    .line 280
    invoke-virtual {v9, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 281
    .line 282
    .line 283
    add-int/lit8 v4, v4, 0x1

    .line 284
    .line 285
    goto :goto_a

    .line 286
    :cond_11
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 287
    .line 288
    .line 289
    move-result v3

    .line 290
    move/from16 v4, p7

    .line 291
    .line 292
    move v5, v8

    .line 293
    :goto_b
    if-ge v5, v3, :cond_12

    .line 294
    .line 295
    invoke-interface {p0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 296
    .line 297
    .line 298
    move-result-object v6

    .line 299
    check-cast v6, Landroidx/compose/foundation/lazy/LazyMeasuredItem;

    .line 300
    .line 301
    invoke-virtual {v6, v4, v1, v2}, Landroidx/compose/foundation/lazy/LazyMeasuredItem;->position(III)Landroidx/compose/foundation/lazy/LazyListPositionedItem;

    .line 302
    .line 303
    .line 304
    move-result-object v7

    .line 305
    invoke-virtual {v9, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 306
    .line 307
    .line 308
    invoke-virtual {v6}, Landroidx/compose/foundation/lazy/LazyMeasuredItem;->getSizeWithSpacings()I

    .line 309
    .line 310
    .line 311
    move-result v6

    .line 312
    add-int/2addr v4, v6

    .line 313
    add-int/lit8 v5, v5, 0x1

    .line 314
    .line 315
    goto :goto_b

    .line 316
    :cond_12
    invoke-interface/range {p2 .. p2}, Ljava/util/List;->size()I

    .line 317
    .line 318
    .line 319
    move-result v0

    .line 320
    :goto_c
    if-ge v8, v0, :cond_13

    .line 321
    .line 322
    move-object/from16 v3, p2

    .line 323
    .line 324
    invoke-interface {v3, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 325
    .line 326
    .line 327
    move-result-object v5

    .line 328
    check-cast v5, Landroidx/compose/foundation/lazy/LazyMeasuredItem;

    .line 329
    .line 330
    invoke-virtual {v5, v4, v1, v2}, Landroidx/compose/foundation/lazy/LazyMeasuredItem;->position(III)Landroidx/compose/foundation/lazy/LazyListPositionedItem;

    .line 331
    .line 332
    .line 333
    move-result-object v6

    .line 334
    invoke-virtual {v9, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 335
    .line 336
    .line 337
    invoke-virtual {v5}, Landroidx/compose/foundation/lazy/LazyMeasuredItem;->getSizeWithSpacings()I

    .line 338
    .line 339
    .line 340
    move-result v5

    .line 341
    add-int/2addr v4, v5

    .line 342
    add-int/lit8 v8, v8, 0x1

    .line 343
    .line 344
    goto :goto_c

    .line 345
    :cond_13
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

.method private static final createItemsAfterList(Landroidx/compose/foundation/lazy/LazyListBeyondBoundsInfo;Ljava/util/List;Landroidx/compose/foundation/lazy/LazyMeasuredItemProvider;Landroidx/compose/foundation/lazy/LazyListItemProvider;IILandroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList;)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/foundation/lazy/LazyListBeyondBoundsInfo;",
            "Ljava/util/List<",
            "Landroidx/compose/foundation/lazy/LazyMeasuredItem;",
            ">;",
            "Landroidx/compose/foundation/lazy/LazyMeasuredItemProvider;",
            "Landroidx/compose/foundation/lazy/LazyListItemProvider;",
            "II",
            "Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList;",
            ")",
            "Ljava/util/List<",
            "Landroidx/compose/foundation/lazy/LazyMeasuredItem;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 2
    .line 3
    invoke-direct {v0}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->last(Ljava/util/List;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    check-cast v1, Landroidx/compose/foundation/lazy/LazyMeasuredItem;

    .line 11
    .line 12
    invoke-virtual {v1}, Landroidx/compose/foundation/lazy/LazyMeasuredItem;->getIndex()I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    invoke-virtual {p0}, Landroidx/compose/foundation/lazy/LazyListBeyondBoundsInfo;->hasIntervals()Z

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    if-eqz v2, :cond_0

    .line 21
    .line 22
    invoke-static {p0, p4}, Landroidx/compose/foundation/lazy/LazyListMeasureKt;->createItemsAfterList$endIndex(Landroidx/compose/foundation/lazy/LazyListBeyondBoundsInfo;I)I

    .line 23
    .line 24
    .line 25
    move-result p0

    .line 26
    invoke-static {p0, v1}, Ljava/lang/Math;->max(II)I

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    :cond_0
    add-int/2addr v1, p5

    .line 31
    add-int/lit8 p0, p4, -0x1

    .line 32
    .line 33
    invoke-static {v1, p0}, Ljava/lang/Math;->min(II)I

    .line 34
    .line 35
    .line 36
    move-result p0

    .line 37
    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->last(Ljava/util/List;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    check-cast p1, Landroidx/compose/foundation/lazy/LazyMeasuredItem;

    .line 42
    .line 43
    invoke-virtual {p1}, Landroidx/compose/foundation/lazy/LazyMeasuredItem;->getIndex()I

    .line 44
    .line 45
    .line 46
    move-result p1

    .line 47
    add-int/lit8 p1, p1, 0x1

    .line 48
    .line 49
    if-gt p1, p0, :cond_1

    .line 50
    .line 51
    :goto_0
    invoke-static {v0, p2, p1}, Landroidx/compose/foundation/lazy/LazyListMeasureKt;->createItemsAfterList$addItem(Lkotlin/jvm/internal/Ref$ObjectRef;Landroidx/compose/foundation/lazy/LazyMeasuredItemProvider;I)V

    .line 52
    .line 53
    .line 54
    if-eq p1, p0, :cond_1

    .line 55
    .line 56
    add-int/lit8 p1, p1, 0x1

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_1
    invoke-interface {p6}, Ljava/util/List;->size()I

    .line 60
    .line 61
    .line 62
    move-result p1

    .line 63
    const/4 p5, 0x0

    .line 64
    :goto_1
    if-ge p5, p1, :cond_3

    .line 65
    .line 66
    invoke-interface {p6, p5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    check-cast v1, Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList$PinnedItem;

    .line 71
    .line 72
    invoke-interface {v1}, Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList$PinnedItem;->getKey()Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v2

    .line 76
    invoke-interface {v1}, Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList$PinnedItem;->getIndex()I

    .line 77
    .line 78
    .line 79
    move-result v1

    .line 80
    invoke-static {p3, v2, v1}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemProviderKt;->findIndexByKey(Landroidx/compose/foundation/lazy/layout/LazyLayoutItemProvider;Ljava/lang/Object;I)I

    .line 81
    .line 82
    .line 83
    move-result v1

    .line 84
    if-le v1, p0, :cond_2

    .line 85
    .line 86
    if-ge v1, p4, :cond_2

    .line 87
    .line 88
    invoke-static {v0, p2, v1}, Landroidx/compose/foundation/lazy/LazyListMeasureKt;->createItemsAfterList$addItem(Lkotlin/jvm/internal/Ref$ObjectRef;Landroidx/compose/foundation/lazy/LazyMeasuredItemProvider;I)V

    .line 89
    .line 90
    .line 91
    :cond_2
    add-int/lit8 p5, p5, 0x1

    .line 92
    .line 93
    goto :goto_1

    .line 94
    :cond_3
    iget-object p0, v0, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 95
    .line 96
    check-cast p0, Ljava/util/List;

    .line 97
    .line 98
    if-nez p0, :cond_4

    .line 99
    .line 100
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    .line 101
    .line 102
    .line 103
    move-result-object p0

    .line 104
    :cond_4
    return-object p0
.end method

.method private static final createItemsAfterList$addItem(Lkotlin/jvm/internal/Ref$ObjectRef;Landroidx/compose/foundation/lazy/LazyMeasuredItemProvider;I)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/internal/Ref$ObjectRef<",
            "Ljava/util/List<",
            "Landroidx/compose/foundation/lazy/LazyMeasuredItem;",
            ">;>;",
            "Landroidx/compose/foundation/lazy/LazyMeasuredItemProvider;",
            "I)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 11
    .line 12
    :cond_0
    iget-object p0, p0, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 13
    .line 14
    if-eqz p0, :cond_1

    .line 15
    .line 16
    check-cast p0, Ljava/util/List;

    .line 17
    .line 18
    invoke-static {p2}, Landroidx/compose/foundation/lazy/DataIndex;->constructor-impl(I)I

    .line 19
    .line 20
    .line 21
    move-result p2

    .line 22
    invoke-virtual {p1, p2}, Landroidx/compose/foundation/lazy/LazyMeasuredItemProvider;->getAndMeasure-ZjPyQlc(I)Landroidx/compose/foundation/lazy/LazyMeasuredItem;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-interface {p0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 31
    .line 32
    const-string p1, "Required value was null."

    .line 33
    .line 34
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    throw p0
.end method

.method private static final createItemsAfterList$endIndex(Landroidx/compose/foundation/lazy/LazyListBeyondBoundsInfo;I)I
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroidx/compose/foundation/lazy/LazyListBeyondBoundsInfo;->getEnd()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    add-int/lit8 p1, p1, -0x1

    .line 6
    .line 7
    invoke-static {p0, p1}, Ljava/lang/Math;->min(II)I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method

.method private static final createItemsBeforeList-tv8sHfA(Landroidx/compose/foundation/lazy/LazyListBeyondBoundsInfo;ILandroidx/compose/foundation/lazy/LazyMeasuredItemProvider;Landroidx/compose/foundation/lazy/LazyListItemProvider;IILandroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/foundation/lazy/LazyListBeyondBoundsInfo;",
            "I",
            "Landroidx/compose/foundation/lazy/LazyMeasuredItemProvider;",
            "Landroidx/compose/foundation/lazy/LazyListItemProvider;",
            "II",
            "Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList;",
            ")",
            "Ljava/util/List<",
            "Landroidx/compose/foundation/lazy/LazyMeasuredItem;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 2
    .line 3
    invoke-direct {v0}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Landroidx/compose/foundation/lazy/LazyListBeyondBoundsInfo;->hasIntervals()Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    invoke-static {p0, p4}, Landroidx/compose/foundation/lazy/LazyListMeasureKt;->createItemsBeforeList_tv8sHfA$startIndex(Landroidx/compose/foundation/lazy/LazyListBeyondBoundsInfo;I)I

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    invoke-static {p0, p1}, Ljava/lang/Math;->min(II)I

    .line 17
    .line 18
    .line 19
    move-result p0

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    move p0, p1

    .line 22
    :goto_0
    sub-int/2addr p0, p5

    .line 23
    const/4 p4, 0x0

    .line 24
    invoke-static {p4, p0}, Ljava/lang/Math;->max(II)I

    .line 25
    .line 26
    .line 27
    move-result p0

    .line 28
    add-int/lit8 p1, p1, -0x1

    .line 29
    .line 30
    if-gt p0, p1, :cond_1

    .line 31
    .line 32
    :goto_1
    invoke-static {v0, p2, p1}, Landroidx/compose/foundation/lazy/LazyListMeasureKt;->createItemsBeforeList_tv8sHfA$addItem$5(Lkotlin/jvm/internal/Ref$ObjectRef;Landroidx/compose/foundation/lazy/LazyMeasuredItemProvider;I)V

    .line 33
    .line 34
    .line 35
    if-eq p1, p0, :cond_1

    .line 36
    .line 37
    add-int/lit8 p1, p1, -0x1

    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_1
    invoke-interface {p6}, Ljava/util/List;->size()I

    .line 41
    .line 42
    .line 43
    move-result p1

    .line 44
    :goto_2
    if-ge p4, p1, :cond_3

    .line 45
    .line 46
    invoke-interface {p6, p4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object p5

    .line 50
    check-cast p5, Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList$PinnedItem;

    .line 51
    .line 52
    invoke-interface {p5}, Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList$PinnedItem;->getKey()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    invoke-interface {p5}, Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList$PinnedItem;->getIndex()I

    .line 57
    .line 58
    .line 59
    move-result p5

    .line 60
    invoke-static {p3, v1, p5}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemProviderKt;->findIndexByKey(Landroidx/compose/foundation/lazy/layout/LazyLayoutItemProvider;Ljava/lang/Object;I)I

    .line 61
    .line 62
    .line 63
    move-result p5

    .line 64
    if-ge p5, p0, :cond_2

    .line 65
    .line 66
    invoke-static {v0, p2, p5}, Landroidx/compose/foundation/lazy/LazyListMeasureKt;->createItemsBeforeList_tv8sHfA$addItem$5(Lkotlin/jvm/internal/Ref$ObjectRef;Landroidx/compose/foundation/lazy/LazyMeasuredItemProvider;I)V

    .line 67
    .line 68
    .line 69
    :cond_2
    add-int/lit8 p4, p4, 0x1

    .line 70
    .line 71
    goto :goto_2

    .line 72
    :cond_3
    iget-object p0, v0, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast p0, Ljava/util/List;

    .line 75
    .line 76
    if-nez p0, :cond_4

    .line 77
    .line 78
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    :cond_4
    return-object p0
.end method

.method private static final createItemsBeforeList_tv8sHfA$addItem$5(Lkotlin/jvm/internal/Ref$ObjectRef;Landroidx/compose/foundation/lazy/LazyMeasuredItemProvider;I)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/internal/Ref$ObjectRef<",
            "Ljava/util/List<",
            "Landroidx/compose/foundation/lazy/LazyMeasuredItem;",
            ">;>;",
            "Landroidx/compose/foundation/lazy/LazyMeasuredItemProvider;",
            "I)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 11
    .line 12
    :cond_0
    iget-object p0, p0, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 13
    .line 14
    if-eqz p0, :cond_1

    .line 15
    .line 16
    check-cast p0, Ljava/util/List;

    .line 17
    .line 18
    invoke-static {p2}, Landroidx/compose/foundation/lazy/DataIndex;->constructor-impl(I)I

    .line 19
    .line 20
    .line 21
    move-result p2

    .line 22
    invoke-virtual {p1, p2}, Landroidx/compose/foundation/lazy/LazyMeasuredItemProvider;->getAndMeasure-ZjPyQlc(I)Landroidx/compose/foundation/lazy/LazyMeasuredItem;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-interface {p0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 31
    .line 32
    const-string p1, "Required value was null."

    .line 33
    .line 34
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    throw p0
.end method

.method private static final createItemsBeforeList_tv8sHfA$startIndex(Landroidx/compose/foundation/lazy/LazyListBeyondBoundsInfo;I)I
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroidx/compose/foundation/lazy/LazyListBeyondBoundsInfo;->getStart()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    add-int/lit8 p1, p1, -0x1

    .line 6
    .line 7
    invoke-static {p0, p1}, Ljava/lang/Math;->min(II)I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method

.method private static final getNotInEmptyRange(I)Z
    .locals 1

    const/high16 v0, -0x80000000

    if-eq p0, v0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static final measureLazyList-Hh3qtAg(ILandroidx/compose/foundation/lazy/LazyListItemProvider;Landroidx/compose/foundation/lazy/LazyMeasuredItemProvider;IIIIIIFJZLjava/util/List;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;ZLandroidx/compose/ui/unit/Density;Landroidx/compose/foundation/lazy/LazyListItemPlacementAnimator;Landroidx/compose/foundation/lazy/LazyListBeyondBoundsInfo;ILandroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList;Lkotlin/jvm/functions/Function3;)Landroidx/compose/foundation/lazy/LazyListMeasureResult;
    .locals 32
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Landroidx/compose/foundation/lazy/LazyListItemProvider;",
            "Landroidx/compose/foundation/lazy/LazyMeasuredItemProvider;",
            "IIIIIIFJZ",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;",
            "Landroidx/compose/foundation/layout/Arrangement$Vertical;",
            "Landroidx/compose/foundation/layout/Arrangement$Horizontal;",
            "Z",
            "Landroidx/compose/ui/unit/Density;",
            "Landroidx/compose/foundation/lazy/LazyListItemPlacementAnimator;",
            "Landroidx/compose/foundation/lazy/LazyListBeyondBoundsInfo;",
            "I",
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
            "Landroidx/compose/foundation/lazy/LazyListMeasureResult;"
        }
    .end annotation

    move/from16 v9, p0

    move-object/from16 v7, p2

    move/from16 v8, p3

    move/from16 v15, p4

    move-wide/from16 v10, p10

    move-object/from16 v14, p22

    const-string v0, "itemProvider"

    move-object/from16 v12, p1

    invoke-static {v12, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "measuredItemProvider"

    invoke-static {v7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "headerIndexes"

    move-object/from16 v13, p13

    invoke-static {v13, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "density"

    move-object/from16 v6, p17

    invoke-static {v6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "placementAnimator"

    move-object/from16 v5, p18

    invoke-static {v5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "beyondBoundsInfo"

    move-object/from16 v4, p19

    invoke-static {v4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "pinnedItems"

    move-object/from16 v3, p21

    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "layout"

    invoke-static {v14, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v23, 0x1

    const/4 v2, 0x0

    if-ltz v15, :cond_0

    move/from16 v0, v23

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    const-string v1, "Failed requirement."

    if-eqz v0, :cond_27

    if-ltz p5, :cond_1

    move/from16 v0, v23

    goto :goto_1

    :cond_1
    move v0, v2

    :goto_1
    if-eqz v0, :cond_26

    if-gtz v9, :cond_3

    .line 1
    new-instance v16, Landroidx/compose/foundation/lazy/LazyListMeasureResult;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    .line 2
    invoke-static/range {p10 .. p11}, Landroidx/compose/ui/unit/Constraints;->getMinWidth-impl(J)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static/range {p10 .. p11}, Landroidx/compose/ui/unit/Constraints;->getMinHeight-impl(J)I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    sget-object v6, Landroidx/compose/foundation/lazy/LazyListMeasureKt$measureLazyList$1;->INSTANCE:Landroidx/compose/foundation/lazy/LazyListMeasureKt$measureLazyList$1;

    invoke-interface {v14, v0, v5, v6}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroidx/compose/ui/layout/MeasureResult;

    .line 3
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v6

    neg-int v7, v15

    add-int v8, v8, p5

    const/4 v9, 0x0

    if-eqz p12, :cond_2

    .line 4
    sget-object v0, Landroidx/compose/foundation/gestures/Orientation;->Vertical:Landroidx/compose/foundation/gestures/Orientation;

    goto :goto_2

    :cond_2
    sget-object v0, Landroidx/compose/foundation/gestures/Orientation;->Horizontal:Landroidx/compose/foundation/gestures/Orientation;

    :goto_2
    move-object v11, v0

    move-object/from16 v0, v16

    move/from16 v10, p16

    move/from16 v12, p5

    move/from16 v13, p6

    .line 5
    invoke-direct/range {v0 .. v13}, Landroidx/compose/foundation/lazy/LazyListMeasureResult;-><init>(Landroidx/compose/foundation/lazy/LazyMeasuredItem;IZFLandroidx/compose/ui/layout/MeasureResult;Ljava/util/List;IIIZLandroidx/compose/foundation/gestures/Orientation;II)V

    return-object v16

    :cond_3
    move/from16 v0, p7

    if-lt v0, v9, :cond_4

    add-int/lit8 v0, v9, -0x1

    .line 6
    invoke-static {v0}, Landroidx/compose/foundation/lazy/DataIndex;->constructor-impl(I)I

    move-result v0

    move/from16 v16, v2

    goto :goto_3

    :cond_4
    move/from16 v16, p8

    .line 7
    :goto_3
    invoke-static/range {p9 .. p9}, Lkotlin/math/MathKt;->roundToInt(F)I

    move-result v17

    sub-int v16, v16, v17

    .line 8
    invoke-static {v2}, Landroidx/compose/foundation/lazy/DataIndex;->constructor-impl(I)I

    move-result v3

    invoke-static {v0, v3}, Landroidx/compose/foundation/lazy/DataIndex;->equals-impl0(II)Z

    move-result v3

    if-eqz v3, :cond_5

    if-gez v16, :cond_5

    add-int v17, v17, v16

    move/from16 v16, v2

    .line 9
    :cond_5
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    neg-int v2, v15

    if-gez p6, :cond_6

    move/from16 v19, p6

    move/from16 v20, v0

    goto :goto_4

    :cond_6
    move/from16 v20, v0

    const/16 v19, 0x0

    :goto_4
    add-int v0, v2, v19

    add-int v16, v16, v0

    const/4 v4, 0x0

    move/from16 v31, v16

    move/from16 v16, v2

    move/from16 v2, v31

    :goto_5
    if-gez v2, :cond_7

    const/16 p7, 0x0

    .line 10
    invoke-static/range {p7 .. p7}, Landroidx/compose/foundation/lazy/DataIndex;->constructor-impl(I)I

    move-result v18

    sub-int v18, v20, v18

    if-lez v18, :cond_7

    add-int/lit8 v20, v20, -0x1

    .line 11
    invoke-static/range {v20 .. v20}, Landroidx/compose/foundation/lazy/DataIndex;->constructor-impl(I)I

    move-result v5

    .line 12
    invoke-virtual {v7, v5}, Landroidx/compose/foundation/lazy/LazyMeasuredItemProvider;->getAndMeasure-ZjPyQlc(I)Landroidx/compose/foundation/lazy/LazyMeasuredItem;

    move-result-object v6

    move/from16 p8, v5

    move/from16 v5, p7

    .line 13
    invoke-interface {v3, v5, v6}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 14
    invoke-virtual {v6}, Landroidx/compose/foundation/lazy/LazyMeasuredItem;->getCrossAxisSize()I

    move-result v5

    invoke-static {v4, v5}, Ljava/lang/Math;->max(II)I

    move-result v4

    .line 15
    invoke-virtual {v6}, Landroidx/compose/foundation/lazy/LazyMeasuredItem;->getSizeWithSpacings()I

    move-result v5

    add-int/2addr v2, v5

    move/from16 v20, p8

    move-object/from16 v6, p17

    move-object/from16 v5, p18

    goto :goto_5

    :cond_7
    if-ge v2, v0, :cond_8

    add-int v17, v17, v2

    move v2, v0

    :cond_8
    sub-int/2addr v2, v0

    add-int v6, v8, p5

    move/from16 v19, v4

    const/4 v5, 0x0

    .line 16
    invoke-static {v6, v5}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    move-result v4

    neg-int v5, v2

    move/from16 p7, v2

    .line 17
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v2

    move/from16 v21, v5

    move/from16 v22, v20

    const/4 v5, 0x0

    :goto_6
    if-ge v5, v2, :cond_9

    .line 18
    invoke-interface {v3, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v24

    .line 19
    check-cast v24, Landroidx/compose/foundation/lazy/LazyMeasuredItem;

    add-int/lit8 v22, v22, 0x1

    .line 20
    invoke-static/range {v22 .. v22}, Landroidx/compose/foundation/lazy/DataIndex;->constructor-impl(I)I

    move-result v22

    .line 21
    invoke-virtual/range {v24 .. v24}, Landroidx/compose/foundation/lazy/LazyMeasuredItem;->getSizeWithSpacings()I

    move-result v24

    add-int v21, v21, v24

    add-int/lit8 v5, v5, 0x1

    goto :goto_6

    :cond_9
    move/from16 v2, p7

    move/from16 p7, v6

    move/from16 v5, v19

    move/from16 v6, v21

    move/from16 v14, v22

    :goto_7
    if-ge v14, v9, :cond_d

    if-lt v6, v4, :cond_a

    if-lez v6, :cond_a

    .line 22
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    move-result v19

    if-eqz v19, :cond_d

    :cond_a
    move/from16 p8, v4

    .line 23
    invoke-virtual {v7, v14}, Landroidx/compose/foundation/lazy/LazyMeasuredItemProvider;->getAndMeasure-ZjPyQlc(I)Landroidx/compose/foundation/lazy/LazyMeasuredItem;

    move-result-object v4

    .line 24
    invoke-virtual {v4}, Landroidx/compose/foundation/lazy/LazyMeasuredItem;->getSizeWithSpacings()I

    move-result v19

    add-int v6, v6, v19

    if-gt v6, v0, :cond_b

    move/from16 v19, v0

    add-int/lit8 v0, v9, -0x1

    if-eq v14, v0, :cond_c

    add-int/lit8 v0, v14, 0x1

    .line 25
    invoke-static {v0}, Landroidx/compose/foundation/lazy/DataIndex;->constructor-impl(I)I

    move-result v0

    .line 26
    invoke-virtual {v4}, Landroidx/compose/foundation/lazy/LazyMeasuredItem;->getSizeWithSpacings()I

    move-result v4

    sub-int/2addr v2, v4

    move/from16 v20, v0

    goto :goto_8

    :cond_b
    move/from16 v19, v0

    .line 27
    :cond_c
    invoke-virtual {v4}, Landroidx/compose/foundation/lazy/LazyMeasuredItem;->getCrossAxisSize()I

    move-result v0

    invoke-static {v5, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    .line 28
    invoke-interface {v3, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move v5, v0

    :goto_8
    add-int/lit8 v14, v14, 0x1

    .line 29
    invoke-static {v14}, Landroidx/compose/foundation/lazy/DataIndex;->constructor-impl(I)I

    move-result v14

    move/from16 v4, p8

    move/from16 v0, v19

    goto :goto_7

    :cond_d
    if-ge v6, v8, :cond_f

    sub-int v0, v8, v6

    sub-int/2addr v2, v0

    add-int/2addr v6, v0

    :goto_9
    if-ge v2, v15, :cond_e

    const/4 v4, 0x0

    .line 30
    invoke-static {v4}, Landroidx/compose/foundation/lazy/DataIndex;->constructor-impl(I)I

    move-result v18

    sub-int v18, v20, v18

    if-lez v18, :cond_e

    add-int/lit8 v20, v20, -0x1

    .line 31
    invoke-static/range {v20 .. v20}, Landroidx/compose/foundation/lazy/DataIndex;->constructor-impl(I)I

    move-result v12

    .line 32
    invoke-virtual {v7, v12}, Landroidx/compose/foundation/lazy/LazyMeasuredItemProvider;->getAndMeasure-ZjPyQlc(I)Landroidx/compose/foundation/lazy/LazyMeasuredItem;

    move-result-object v13

    .line 33
    invoke-interface {v3, v4, v13}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 34
    invoke-virtual {v13}, Landroidx/compose/foundation/lazy/LazyMeasuredItem;->getCrossAxisSize()I

    move-result v4

    invoke-static {v5, v4}, Ljava/lang/Math;->max(II)I

    move-result v5

    .line 35
    invoke-virtual {v13}, Landroidx/compose/foundation/lazy/LazyMeasuredItem;->getSizeWithSpacings()I

    move-result v4

    add-int/2addr v2, v4

    move-object/from16 v13, p13

    move/from16 v20, v12

    move-object/from16 v12, p1

    goto :goto_9

    :cond_e
    add-int v17, v17, v0

    if-gez v2, :cond_f

    add-int v17, v17, v2

    add-int/2addr v6, v2

    move v12, v5

    move v13, v6

    move/from16 v0, v17

    const/4 v2, 0x0

    goto :goto_a

    :cond_f
    move v12, v5

    move v13, v6

    move/from16 v0, v17

    .line 36
    :goto_a
    invoke-static/range {p9 .. p9}, Lkotlin/math/MathKt;->roundToInt(F)I

    move-result v4

    invoke-static {v4}, Lkotlin/math/MathKt;->getSign(I)I

    move-result v4

    invoke-static {v0}, Lkotlin/math/MathKt;->getSign(I)I

    move-result v5

    if-ne v4, v5, :cond_10

    .line 37
    invoke-static/range {p9 .. p9}, Lkotlin/math/MathKt;->roundToInt(F)I

    move-result v4

    invoke-static {v4}, Ljava/lang/Math;->abs(I)I

    move-result v4

    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    move-result v5

    if-lt v4, v5, :cond_10

    int-to-float v0, v0

    move v6, v0

    goto :goto_b

    :cond_10
    move/from16 v6, p9

    :goto_b
    if-ltz v2, :cond_11

    move/from16 v0, v23

    goto :goto_c

    :cond_11
    const/4 v0, 0x0

    :goto_c
    if-eqz v0, :cond_25

    neg-int v5, v2

    .line 38
    invoke-static {v3}, Lkotlin/collections/CollectionsKt;->first(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/compose/foundation/lazy/LazyMeasuredItem;

    if-gtz v15, :cond_13

    if-gez p6, :cond_12

    goto :goto_d

    :cond_12
    move-object v4, v0

    move/from16 v24, v2

    goto :goto_f

    .line 39
    :cond_13
    :goto_d
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v1

    move v4, v2

    move-object v2, v0

    const/4 v0, 0x0

    :goto_e
    if-ge v0, v1, :cond_14

    .line 40
    invoke-interface {v3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v17

    check-cast v17, Landroidx/compose/foundation/lazy/LazyMeasuredItem;

    move/from16 p8, v1

    invoke-virtual/range {v17 .. v17}, Landroidx/compose/foundation/lazy/LazyMeasuredItem;->getSizeWithSpacings()I

    move-result v1

    if-eqz v4, :cond_14

    if-gt v1, v4, :cond_14

    move-object/from16 p9, v2

    .line 41
    invoke-static {v3}, Lkotlin/collections/CollectionsKt;->getLastIndex(Ljava/util/List;)I

    move-result v2

    if-eq v0, v2, :cond_15

    sub-int/2addr v4, v1

    add-int/lit8 v0, v0, 0x1

    .line 42
    invoke-interface {v3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Landroidx/compose/foundation/lazy/LazyMeasuredItem;

    move/from16 v1, p8

    goto :goto_e

    :cond_14
    move-object/from16 p9, v2

    :cond_15
    move/from16 v24, v4

    move-object/from16 v4, p9

    :goto_f
    move-object/from16 v0, p19

    move/from16 v1, v20

    move/from16 v26, v16

    const/16 v25, 0x0

    move-object/from16 v2, p2

    move-object/from16 v27, v3

    move-object/from16 v3, p1

    move-object v7, v4

    move/from16 v4, p0

    move/from16 v17, v5

    move/from16 v5, p20

    move/from16 v28, p7

    move v8, v6

    move-object/from16 v6, p21

    .line 43
    invoke-static/range {v0 .. v6}, Landroidx/compose/foundation/lazy/LazyListMeasureKt;->createItemsBeforeList-tv8sHfA(Landroidx/compose/foundation/lazy/LazyListBeyondBoundsInfo;ILandroidx/compose/foundation/lazy/LazyMeasuredItemProvider;Landroidx/compose/foundation/lazy/LazyListItemProvider;IILandroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList;)Ljava/util/List;

    move-result-object v6

    .line 44
    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v0

    move/from16 v2, v25

    :goto_10
    if-ge v2, v0, :cond_16

    .line 45
    invoke-interface {v6, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    .line 46
    check-cast v1, Landroidx/compose/foundation/lazy/LazyMeasuredItem;

    .line 47
    invoke-virtual {v1}, Landroidx/compose/foundation/lazy/LazyMeasuredItem;->getCrossAxisSize()I

    move-result v1

    invoke-static {v12, v1}, Ljava/lang/Math;->max(II)I

    move-result v12

    add-int/lit8 v2, v2, 0x1

    goto :goto_10

    :cond_16
    move-object/from16 v0, p19

    move-object/from16 v1, v27

    move-object/from16 v2, p2

    move-object/from16 v3, p1

    move/from16 v4, p0

    move/from16 v5, p20

    move-object/from16 v16, v6

    move-object/from16 v6, p21

    .line 48
    invoke-static/range {v0 .. v6}, Landroidx/compose/foundation/lazy/LazyListMeasureKt;->createItemsAfterList(Landroidx/compose/foundation/lazy/LazyListBeyondBoundsInfo;Ljava/util/List;Landroidx/compose/foundation/lazy/LazyMeasuredItemProvider;Landroidx/compose/foundation/lazy/LazyListItemProvider;IILandroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList;)Ljava/util/List;

    move-result-object v0

    .line 49
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    move/from16 v2, v25

    :goto_11
    if-ge v2, v1, :cond_17

    .line 50
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    .line 51
    check-cast v3, Landroidx/compose/foundation/lazy/LazyMeasuredItem;

    .line 52
    invoke-virtual {v3}, Landroidx/compose/foundation/lazy/LazyMeasuredItem;->getCrossAxisSize()I

    move-result v3

    invoke-static {v12, v3}, Ljava/lang/Math;->max(II)I

    move-result v12

    add-int/lit8 v2, v2, 0x1

    goto :goto_11

    .line 53
    :cond_17
    invoke-static/range {v27 .. v27}, Lkotlin/collections/CollectionsKt;->first(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v7, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_18

    .line 54
    invoke-interface/range {v16 .. v16}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_18

    .line 55
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_18

    move/from16 v6, v23

    goto :goto_12

    :cond_18
    move/from16 v6, v25

    :goto_12
    if-eqz p12, :cond_19

    move v1, v12

    goto :goto_13

    :cond_19
    move v1, v13

    .line 56
    :goto_13
    invoke-static {v10, v11, v1}, Landroidx/compose/ui/unit/ConstraintsKt;->constrainWidth-K40F9xA(JI)I

    move-result v29

    if-eqz p12, :cond_1a

    move v12, v13

    .line 57
    :cond_1a
    invoke-static {v10, v11, v12}, Landroidx/compose/ui/unit/ConstraintsKt;->constrainHeight-K40F9xA(JI)I

    move-result v30

    move-object/from16 v10, v27

    move-object/from16 v11, v16

    move-object v12, v0

    move v5, v13

    move/from16 v13, v29

    move-object/from16 v4, p22

    move v3, v14

    move/from16 v14, v30

    move v15, v5

    move/from16 v16, p3

    move/from16 v18, p12

    move-object/from16 v19, p14

    move-object/from16 v20, p15

    move/from16 v21, p16

    move-object/from16 v22, p17

    .line 58
    invoke-static/range {v10 .. v22}, Landroidx/compose/foundation/lazy/LazyListMeasureKt;->calculateItemsOffsets(Ljava/util/List;Ljava/util/List;Ljava/util/List;IIIIIZLandroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;ZLandroidx/compose/ui/unit/Density;)Ljava/util/List;

    move-result-object v10

    float-to-int v1, v8

    move-object/from16 v0, p18

    move/from16 v2, v29

    move v14, v3

    move/from16 v3, v30

    move-object v11, v4

    move-object v4, v10

    move v12, v5

    move-object/from16 v5, p2

    .line 59
    invoke-virtual/range {v0 .. v5}, Landroidx/compose/foundation/lazy/LazyListItemPlacementAnimator;->onMeasured(IIILjava/util/List;Landroidx/compose/foundation/lazy/LazyMeasuredItemProvider;)V

    .line 60
    invoke-interface/range {p13 .. p13}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    if-eqz v0, :cond_1b

    move-object v0, v10

    move-object/from16 v1, p2

    move-object/from16 v2, p13

    move/from16 v3, p4

    move/from16 v4, v29

    move/from16 v5, v30

    .line 61
    invoke-static/range {v0 .. v5}, Landroidx/compose/foundation/lazy/LazyListHeadersKt;->findOrComposeLazyListHeader(Ljava/util/List;Landroidx/compose/foundation/lazy/LazyMeasuredItemProvider;Ljava/util/List;III)Landroidx/compose/foundation/lazy/LazyListPositionedItem;

    move-result-object v0

    goto :goto_14

    :cond_1b
    const/4 v0, 0x0

    :goto_14
    if-lt v14, v9, :cond_1d

    move/from16 v1, p3

    move v4, v8

    if-le v12, v1, :cond_1c

    goto :goto_15

    :cond_1c
    move/from16 v3, v25

    goto :goto_16

    :cond_1d
    move v4, v8

    :goto_15
    move/from16 v3, v23

    .line 62
    :goto_16
    invoke-static/range {v29 .. v29}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static/range {v30 .. v30}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    new-instance v5, Landroidx/compose/foundation/lazy/LazyListMeasureKt$measureLazyList$5;

    invoke-direct {v5, v10, v0}, Landroidx/compose/foundation/lazy/LazyListMeasureKt$measureLazyList$5;-><init>(Ljava/util/List;Landroidx/compose/foundation/lazy/LazyListPositionedItem;)V

    invoke-interface {v11, v1, v2, v5}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    move-object v5, v1

    check-cast v5, Landroidx/compose/ui/layout/MeasureResult;

    if-eqz v6, :cond_1e

    move-object v6, v10

    goto :goto_19

    .line 63
    :cond_1e
    new-instance v1, Ljava/util/ArrayList;

    invoke-interface {v10}, Ljava/util/List;->size()I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 64
    invoke-interface {v10}, Ljava/util/List;->size()I

    move-result v2

    move/from16 v6, v25

    :goto_17
    if-ge v6, v2, :cond_23

    .line 65
    invoke-interface {v10, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    .line 66
    move-object v11, v8

    check-cast v11, Landroidx/compose/foundation/lazy/LazyListPositionedItem;

    .line 67
    invoke-virtual {v11}, Landroidx/compose/foundation/lazy/LazyListPositionedItem;->getIndex()I

    move-result v12

    invoke-static/range {v27 .. v27}, Lkotlin/collections/CollectionsKt;->first(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Landroidx/compose/foundation/lazy/LazyMeasuredItem;

    invoke-virtual {v13}, Landroidx/compose/foundation/lazy/LazyMeasuredItem;->getIndex()I

    move-result v13

    if-lt v12, v13, :cond_1f

    invoke-virtual {v11}, Landroidx/compose/foundation/lazy/LazyListPositionedItem;->getIndex()I

    move-result v12

    invoke-static/range {v27 .. v27}, Lkotlin/collections/CollectionsKt;->last(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Landroidx/compose/foundation/lazy/LazyMeasuredItem;

    invoke-virtual {v13}, Landroidx/compose/foundation/lazy/LazyMeasuredItem;->getIndex()I

    move-result v13

    if-le v12, v13, :cond_20

    :cond_1f
    if-ne v11, v0, :cond_21

    :cond_20
    move/from16 v11, v23

    goto :goto_18

    :cond_21
    move/from16 v11, v25

    :goto_18
    if-eqz v11, :cond_22

    .line 68
    invoke-interface {v1, v8}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    :cond_22
    add-int/lit8 v6, v6, 0x1

    goto :goto_17

    :cond_23
    move-object v6, v1

    :goto_19
    if-eqz p12, :cond_24

    .line 69
    sget-object v0, Landroidx/compose/foundation/gestures/Orientation;->Vertical:Landroidx/compose/foundation/gestures/Orientation;

    goto :goto_1a

    :cond_24
    sget-object v0, Landroidx/compose/foundation/gestures/Orientation;->Horizontal:Landroidx/compose/foundation/gestures/Orientation;

    :goto_1a
    move-object v11, v0

    .line 70
    new-instance v14, Landroidx/compose/foundation/lazy/LazyListMeasureResult;

    move-object v0, v14

    move-object v1, v7

    move/from16 v2, v24

    move/from16 v7, v26

    move/from16 v8, v28

    move/from16 v9, p0

    move/from16 v10, p16

    move/from16 v12, p5

    move/from16 v13, p6

    invoke-direct/range {v0 .. v13}, Landroidx/compose/foundation/lazy/LazyListMeasureResult;-><init>(Landroidx/compose/foundation/lazy/LazyMeasuredItem;IZFLandroidx/compose/ui/layout/MeasureResult;Ljava/util/List;IIIZLandroidx/compose/foundation/gestures/Orientation;II)V

    return-object v14

    .line 71
    :cond_25
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 72
    :cond_26
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 73
    :cond_27
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
