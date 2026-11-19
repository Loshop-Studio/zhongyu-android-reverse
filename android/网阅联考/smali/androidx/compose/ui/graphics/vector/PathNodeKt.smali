.class public final Landroidx/compose/ui/graphics/vector/PathNodeKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0000\n\u0002\u0010\u000c\n\u0002\u0008\u0006\n\u0002\u0010\u0008\n\u0002\u0008\u0017\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001aB\u0010\u001f\u001a\u0008\u0012\u0004\u0012\u00020!0 2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u00082!\u0010%\u001a\u001d\u0012\u0013\u0012\u00110#\u00a2\u0006\u000c\u0008\'\u0012\u0008\u0008(\u0012\u0004\u0008\u0008()\u0012\u0004\u0012\u00020!0&H\u0082\u0008\u001a\u001a\u0010*\u001a\u0008\u0012\u0004\u0012\u00020!0 *\u00020\u00012\u0006\u0010\"\u001a\u00020#H\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0008X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\u0008X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\u0008X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\u0008X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u000c\u001a\u00020\u0008X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\r\u001a\u00020\u0008X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u000e\u001a\u00020\u0008X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u000f\u001a\u00020\u0008X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0010\u001a\u00020\u0008X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0011\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0012\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0013\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0014\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0015\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0016\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0017\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0018\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0019\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u001a\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u001b\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u001c\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u001d\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u001e\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006+"
    }
    d2 = {
        "ArcToKey",
        "",
        "CloseKey",
        "CurveToKey",
        "HorizontalToKey",
        "LineToKey",
        "MoveToKey",
        "NUM_ARC_TO_ARGS",
        "",
        "NUM_CURVE_TO_ARGS",
        "NUM_HORIZONTAL_TO_ARGS",
        "NUM_LINE_TO_ARGS",
        "NUM_MOVE_TO_ARGS",
        "NUM_QUAD_TO_ARGS",
        "NUM_REFLECTIVE_CURVE_TO_ARGS",
        "NUM_REFLECTIVE_QUAD_TO_ARGS",
        "NUM_VERTICAL_TO_ARGS",
        "QuadToKey",
        "ReflectiveCurveToKey",
        "ReflectiveQuadToKey",
        "RelativeArcToKey",
        "RelativeCloseKey",
        "RelativeCurveToKey",
        "RelativeHorizontalToKey",
        "RelativeLineToKey",
        "RelativeMoveToKey",
        "RelativeQuadToKey",
        "RelativeReflectiveCurveToKey",
        "RelativeReflectiveQuadToKey",
        "RelativeVerticalToKey",
        "VerticalToKey",
        "pathNodesFromArgs",
        "",
        "Landroidx/compose/ui/graphics/vector/PathNode;",
        "args",
        "",
        "numArgs",
        "nodeFor",
        "Lkotlin/Function1;",
        "Lkotlin/ParameterName;",
        "name",
        "subArray",
        "toPathNodes",
        "ui-graphics_release"
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
        "SMAP\nPathNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PathNode.kt\nandroidx/compose/ui/graphics/vector/PathNodeKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,333:1\n283#1:334\n284#1,9:338\n283#1:348\n284#1,9:352\n283#1:362\n284#1,9:366\n283#1:376\n284#1,9:380\n283#1:390\n284#1,9:394\n283#1:404\n284#1,9:408\n283#1:418\n284#1,9:422\n283#1:432\n284#1,9:436\n283#1:446\n284#1,9:450\n283#1:460\n284#1,9:464\n283#1:474\n284#1,9:478\n283#1:488\n284#1,9:492\n283#1:502\n284#1,9:506\n283#1:516\n284#1,9:520\n283#1:530\n284#1,9:534\n283#1:544\n284#1,9:548\n283#1:558\n284#1,9:562\n283#1:572\n284#1,9:576\n1549#2:335\n1620#2,2:336\n1622#2:347\n1549#2:349\n1620#2,2:350\n1622#2:361\n1549#2:363\n1620#2,2:364\n1622#2:375\n1549#2:377\n1620#2,2:378\n1622#2:389\n1549#2:391\n1620#2,2:392\n1622#2:403\n1549#2:405\n1620#2,2:406\n1622#2:417\n1549#2:419\n1620#2,2:420\n1622#2:431\n1549#2:433\n1620#2,2:434\n1622#2:445\n1549#2:447\n1620#2,2:448\n1622#2:459\n1549#2:461\n1620#2,2:462\n1622#2:473\n1549#2:475\n1620#2,2:476\n1622#2:487\n1549#2:489\n1620#2,2:490\n1622#2:501\n1549#2:503\n1620#2,2:504\n1622#2:515\n1549#2:517\n1620#2,2:518\n1622#2:529\n1549#2:531\n1620#2,2:532\n1622#2:543\n1549#2:545\n1620#2,2:546\n1622#2:557\n1549#2:559\n1620#2,2:560\n1622#2:571\n1549#2:573\n1620#2,2:574\n1622#2:585\n1549#2:586\n1620#2,3:587\n*S KotlinDebug\n*F\n+ 1 PathNode.kt\nandroidx/compose/ui/graphics/vector/PathNodeKt\n*L\n153#1:334\n153#1:338,9\n157#1:348\n157#1:352,9\n161#1:362\n161#1:366,9\n165#1:376\n165#1:380,9\n169#1:390\n169#1:394,9\n173#1:404\n173#1:408,9\n177#1:418\n177#1:422,9\n181#1:432\n181#1:436,9\n185#1:446\n185#1:450,9\n196#1:460\n196#1:464,9\n207#1:474\n207#1:478,9\n216#1:488\n216#1:492,9\n225#1:502\n225#1:506,9\n234#1:516\n234#1:520,9\n243#1:530\n243#1:534,9\n247#1:544\n247#1:548,9\n251#1:558\n251#1:562,9\n263#1:572\n263#1:576,9\n153#1:335\n153#1:336,2\n153#1:347\n157#1:349\n157#1:350,2\n157#1:361\n161#1:363\n161#1:364,2\n161#1:375\n165#1:377\n165#1:378,2\n165#1:389\n169#1:391\n169#1:392,2\n169#1:403\n173#1:405\n173#1:406,2\n173#1:417\n177#1:419\n177#1:420,2\n177#1:431\n181#1:433\n181#1:434,2\n181#1:445\n185#1:447\n185#1:448,2\n185#1:459\n196#1:461\n196#1:462,2\n196#1:473\n207#1:475\n207#1:476,2\n207#1:487\n216#1:489\n216#1:490,2\n216#1:501\n225#1:503\n225#1:504,2\n225#1:515\n234#1:517\n234#1:518,2\n234#1:529\n243#1:531\n243#1:532,2\n243#1:543\n247#1:545\n247#1:546,2\n247#1:557\n251#1:559\n251#1:560,2\n251#1:571\n263#1:573\n263#1:574,2\n263#1:585\n283#1:586\n283#1:587,3\n*E\n"
    }
.end annotation


# static fields
.field private static final ArcToKey:C = 'A'

.field private static final CloseKey:C = 'Z'

.field private static final CurveToKey:C = 'C'

.field private static final HorizontalToKey:C = 'H'

.field private static final LineToKey:C = 'L'

.field private static final MoveToKey:C = 'M'

.field private static final NUM_ARC_TO_ARGS:I = 0x7

.field private static final NUM_CURVE_TO_ARGS:I = 0x6

.field private static final NUM_HORIZONTAL_TO_ARGS:I = 0x1

.field private static final NUM_LINE_TO_ARGS:I = 0x2

.field private static final NUM_MOVE_TO_ARGS:I = 0x2

.field private static final NUM_QUAD_TO_ARGS:I = 0x4

.field private static final NUM_REFLECTIVE_CURVE_TO_ARGS:I = 0x4

.field private static final NUM_REFLECTIVE_QUAD_TO_ARGS:I = 0x2

.field private static final NUM_VERTICAL_TO_ARGS:I = 0x1

.field private static final QuadToKey:C = 'Q'

.field private static final ReflectiveCurveToKey:C = 'S'

.field private static final ReflectiveQuadToKey:C = 'T'

.field private static final RelativeArcToKey:C = 'a'

.field private static final RelativeCloseKey:C = 'z'

.field private static final RelativeCurveToKey:C = 'c'

.field private static final RelativeHorizontalToKey:C = 'h'

.field private static final RelativeLineToKey:C = 'l'

.field private static final RelativeMoveToKey:C = 'm'

.field private static final RelativeQuadToKey:C = 'q'

.field private static final RelativeReflectiveCurveToKey:C = 's'

.field private static final RelativeReflectiveQuadToKey:C = 't'

.field private static final RelativeVerticalToKey:C = 'v'

.field private static final VerticalToKey:C = 'V'


# direct methods
.method private static final pathNodesFromArgs([FILkotlin/jvm/functions/Function1;)Ljava/util/List;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([FI",
            "Lkotlin/jvm/functions/Function1<",
            "-[F+",
            "Landroidx/compose/ui/graphics/vector/PathNode;",
            ">;)",
            "Ljava/util/List<",
            "Landroidx/compose/ui/graphics/vector/PathNode;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Lkotlin/ranges/IntRange;

    .line 2
    .line 3
    array-length v1, p0

    .line 4
    sub-int/2addr v1, p1

    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v2, v1}, Lkotlin/ranges/IntRange;-><init>(II)V

    .line 7
    .line 8
    .line 9
    invoke-static {v0, p1}, Lkotlin/ranges/RangesKt;->step(Lkotlin/ranges/IntProgression;I)Lkotlin/ranges/IntProgression;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    new-instance v1, Ljava/util/ArrayList;

    .line 14
    .line 15
    const/16 v3, 0xa

    .line 16
    .line 17
    invoke-static {v0, v3}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 22
    .line 23
    .line 24
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    if-eqz v3, :cond_2

    .line 33
    .line 34
    move-object v3, v0

    .line 35
    check-cast v3, Lkotlin/collections/IntIterator;

    .line 36
    .line 37
    invoke-virtual {v3}, Lkotlin/collections/IntIterator;->nextInt()I

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    add-int v4, v3, p1

    .line 42
    .line 43
    invoke-static {p0, v3, v4}, Lkotlin/collections/ArraysKt;->copyOfRange([FII)[F

    .line 44
    .line 45
    .line 46
    move-result-object v4

    .line 47
    invoke-interface {p2, v4}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v5

    .line 51
    check-cast v5, Landroidx/compose/ui/graphics/vector/PathNode;

    .line 52
    .line 53
    instance-of v6, v5, Landroidx/compose/ui/graphics/vector/PathNode$MoveTo;

    .line 54
    .line 55
    const/4 v7, 0x1

    .line 56
    if-eqz v6, :cond_0

    .line 57
    .line 58
    if-lez v3, :cond_0

    .line 59
    .line 60
    new-instance v5, Landroidx/compose/ui/graphics/vector/PathNode$LineTo;

    .line 61
    .line 62
    aget v3, v4, v2

    .line 63
    .line 64
    aget v4, v4, v7

    .line 65
    .line 66
    invoke-direct {v5, v3, v4}, Landroidx/compose/ui/graphics/vector/PathNode$LineTo;-><init>(FF)V

    .line 67
    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_0
    instance-of v6, v5, Landroidx/compose/ui/graphics/vector/PathNode$RelativeMoveTo;

    .line 71
    .line 72
    if-eqz v6, :cond_1

    .line 73
    .line 74
    if-lez v3, :cond_1

    .line 75
    .line 76
    new-instance v5, Landroidx/compose/ui/graphics/vector/PathNode$RelativeLineTo;

    .line 77
    .line 78
    aget v3, v4, v2

    .line 79
    .line 80
    aget v4, v4, v7

    .line 81
    .line 82
    invoke-direct {v5, v3, v4}, Landroidx/compose/ui/graphics/vector/PathNode$RelativeLineTo;-><init>(FF)V

    .line 83
    .line 84
    .line 85
    :cond_1
    :goto_1
    invoke-interface {v1, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    goto :goto_0

    .line 89
    :cond_2
    return-object v1
.end method

.method public static final toPathNodes(C[F)Ljava/util/List;
    .locals 27
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(C[F)",
            "Ljava/util/List<",
            "Landroidx/compose/ui/graphics/vector/PathNode;",
            ">;"
        }
    .end annotation

    .line 1
    move/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    const-string v2, "args"

    .line 6
    .line 7
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    const/16 v2, 0x7a

    .line 11
    .line 12
    const/4 v3, 0x1

    .line 13
    const/4 v4, 0x0

    .line 14
    if-ne v0, v2, :cond_0

    .line 15
    .line 16
    :goto_0
    move v2, v3

    .line 17
    goto :goto_1

    .line 18
    :cond_0
    const/16 v2, 0x5a

    .line 19
    .line 20
    if-ne v0, v2, :cond_1

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_1
    move v2, v4

    .line 24
    :goto_1
    if-eqz v2, :cond_2

    .line 25
    .line 26
    sget-object v0, Landroidx/compose/ui/graphics/vector/PathNode$Close;->INSTANCE:Landroidx/compose/ui/graphics/vector/PathNode$Close;

    .line 27
    .line 28
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    goto/16 :goto_2a

    .line 33
    .line 34
    :cond_2
    const/16 v2, 0x6d

    .line 35
    .line 36
    const/4 v5, 0x2

    .line 37
    const/16 v6, 0xa

    .line 38
    .line 39
    if-ne v0, v2, :cond_6

    .line 40
    .line 41
    new-instance v0, Lkotlin/ranges/IntRange;

    .line 42
    .line 43
    array-length v2, v1

    .line 44
    sub-int/2addr v2, v5

    .line 45
    invoke-direct {v0, v4, v2}, Lkotlin/ranges/IntRange;-><init>(II)V

    .line 46
    .line 47
    .line 48
    invoke-static {v0, v5}, Lkotlin/ranges/RangesKt;->step(Lkotlin/ranges/IntProgression;I)Lkotlin/ranges/IntProgression;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    new-instance v2, Ljava/util/ArrayList;

    .line 53
    .line 54
    invoke-static {v0, v6}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 55
    .line 56
    .line 57
    move-result v5

    .line 58
    invoke-direct {v2, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 59
    .line 60
    .line 61
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 66
    .line 67
    .line 68
    move-result v5

    .line 69
    if-eqz v5, :cond_5

    .line 70
    .line 71
    move-object v5, v0

    .line 72
    check-cast v5, Lkotlin/collections/IntIterator;

    .line 73
    .line 74
    invoke-virtual {v5}, Lkotlin/collections/IntIterator;->nextInt()I

    .line 75
    .line 76
    .line 77
    move-result v5

    .line 78
    add-int/lit8 v6, v5, 0x2

    .line 79
    .line 80
    invoke-static {v1, v5, v6}, Lkotlin/collections/ArraysKt;->copyOfRange([FII)[F

    .line 81
    .line 82
    .line 83
    move-result-object v6

    .line 84
    new-instance v7, Landroidx/compose/ui/graphics/vector/PathNode$RelativeMoveTo;

    .line 85
    .line 86
    aget v8, v6, v4

    .line 87
    .line 88
    aget v9, v6, v3

    .line 89
    .line 90
    invoke-direct {v7, v8, v9}, Landroidx/compose/ui/graphics/vector/PathNode$RelativeMoveTo;-><init>(FF)V

    .line 91
    .line 92
    .line 93
    instance-of v8, v7, Landroidx/compose/ui/graphics/vector/PathNode$MoveTo;

    .line 94
    .line 95
    if-eqz v8, :cond_3

    .line 96
    .line 97
    if-lez v5, :cond_3

    .line 98
    .line 99
    new-instance v7, Landroidx/compose/ui/graphics/vector/PathNode$LineTo;

    .line 100
    .line 101
    aget v5, v6, v4

    .line 102
    .line 103
    aget v6, v6, v3

    .line 104
    .line 105
    invoke-direct {v7, v5, v6}, Landroidx/compose/ui/graphics/vector/PathNode$LineTo;-><init>(FF)V

    .line 106
    .line 107
    .line 108
    goto :goto_3

    .line 109
    :cond_3
    if-lez v5, :cond_4

    .line 110
    .line 111
    new-instance v7, Landroidx/compose/ui/graphics/vector/PathNode$RelativeLineTo;

    .line 112
    .line 113
    aget v5, v6, v4

    .line 114
    .line 115
    aget v6, v6, v3

    .line 116
    .line 117
    invoke-direct {v7, v5, v6}, Landroidx/compose/ui/graphics/vector/PathNode$RelativeLineTo;-><init>(FF)V

    .line 118
    .line 119
    .line 120
    :cond_4
    :goto_3
    invoke-interface {v2, v7}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 121
    .line 122
    .line 123
    goto :goto_2

    .line 124
    :cond_5
    move-object v0, v2

    .line 125
    goto/16 :goto_2a

    .line 126
    .line 127
    :cond_6
    const/16 v2, 0x4d

    .line 128
    .line 129
    if-ne v0, v2, :cond_9

    .line 130
    .line 131
    new-instance v0, Lkotlin/ranges/IntRange;

    .line 132
    .line 133
    array-length v2, v1

    .line 134
    sub-int/2addr v2, v5

    .line 135
    invoke-direct {v0, v4, v2}, Lkotlin/ranges/IntRange;-><init>(II)V

    .line 136
    .line 137
    .line 138
    invoke-static {v0, v5}, Lkotlin/ranges/RangesKt;->step(Lkotlin/ranges/IntProgression;I)Lkotlin/ranges/IntProgression;

    .line 139
    .line 140
    .line 141
    move-result-object v0

    .line 142
    new-instance v2, Ljava/util/ArrayList;

    .line 143
    .line 144
    invoke-static {v0, v6}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 145
    .line 146
    .line 147
    move-result v5

    .line 148
    invoke-direct {v2, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 149
    .line 150
    .line 151
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 152
    .line 153
    .line 154
    move-result-object v0

    .line 155
    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 156
    .line 157
    .line 158
    move-result v5

    .line 159
    if-eqz v5, :cond_5

    .line 160
    .line 161
    move-object v5, v0

    .line 162
    check-cast v5, Lkotlin/collections/IntIterator;

    .line 163
    .line 164
    invoke-virtual {v5}, Lkotlin/collections/IntIterator;->nextInt()I

    .line 165
    .line 166
    .line 167
    move-result v5

    .line 168
    add-int/lit8 v6, v5, 0x2

    .line 169
    .line 170
    invoke-static {v1, v5, v6}, Lkotlin/collections/ArraysKt;->copyOfRange([FII)[F

    .line 171
    .line 172
    .line 173
    move-result-object v6

    .line 174
    new-instance v7, Landroidx/compose/ui/graphics/vector/PathNode$MoveTo;

    .line 175
    .line 176
    aget v8, v6, v4

    .line 177
    .line 178
    aget v9, v6, v3

    .line 179
    .line 180
    invoke-direct {v7, v8, v9}, Landroidx/compose/ui/graphics/vector/PathNode$MoveTo;-><init>(FF)V

    .line 181
    .line 182
    .line 183
    if-lez v5, :cond_7

    .line 184
    .line 185
    new-instance v7, Landroidx/compose/ui/graphics/vector/PathNode$LineTo;

    .line 186
    .line 187
    aget v5, v6, v4

    .line 188
    .line 189
    aget v6, v6, v3

    .line 190
    .line 191
    invoke-direct {v7, v5, v6}, Landroidx/compose/ui/graphics/vector/PathNode$LineTo;-><init>(FF)V

    .line 192
    .line 193
    .line 194
    goto :goto_5

    .line 195
    :cond_7
    instance-of v8, v7, Landroidx/compose/ui/graphics/vector/PathNode$RelativeMoveTo;

    .line 196
    .line 197
    if-eqz v8, :cond_8

    .line 198
    .line 199
    if-lez v5, :cond_8

    .line 200
    .line 201
    new-instance v7, Landroidx/compose/ui/graphics/vector/PathNode$RelativeLineTo;

    .line 202
    .line 203
    aget v5, v6, v4

    .line 204
    .line 205
    aget v6, v6, v3

    .line 206
    .line 207
    invoke-direct {v7, v5, v6}, Landroidx/compose/ui/graphics/vector/PathNode$RelativeLineTo;-><init>(FF)V

    .line 208
    .line 209
    .line 210
    :cond_8
    :goto_5
    invoke-interface {v2, v7}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 211
    .line 212
    .line 213
    goto :goto_4

    .line 214
    :cond_9
    const/16 v2, 0x6c

    .line 215
    .line 216
    if-ne v0, v2, :cond_c

    .line 217
    .line 218
    new-instance v0, Lkotlin/ranges/IntRange;

    .line 219
    .line 220
    array-length v2, v1

    .line 221
    sub-int/2addr v2, v5

    .line 222
    invoke-direct {v0, v4, v2}, Lkotlin/ranges/IntRange;-><init>(II)V

    .line 223
    .line 224
    .line 225
    invoke-static {v0, v5}, Lkotlin/ranges/RangesKt;->step(Lkotlin/ranges/IntProgression;I)Lkotlin/ranges/IntProgression;

    .line 226
    .line 227
    .line 228
    move-result-object v0

    .line 229
    new-instance v2, Ljava/util/ArrayList;

    .line 230
    .line 231
    invoke-static {v0, v6}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 232
    .line 233
    .line 234
    move-result v5

    .line 235
    invoke-direct {v2, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 236
    .line 237
    .line 238
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 239
    .line 240
    .line 241
    move-result-object v0

    .line 242
    :goto_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 243
    .line 244
    .line 245
    move-result v5

    .line 246
    if-eqz v5, :cond_5

    .line 247
    .line 248
    move-object v5, v0

    .line 249
    check-cast v5, Lkotlin/collections/IntIterator;

    .line 250
    .line 251
    invoke-virtual {v5}, Lkotlin/collections/IntIterator;->nextInt()I

    .line 252
    .line 253
    .line 254
    move-result v5

    .line 255
    add-int/lit8 v6, v5, 0x2

    .line 256
    .line 257
    invoke-static {v1, v5, v6}, Lkotlin/collections/ArraysKt;->copyOfRange([FII)[F

    .line 258
    .line 259
    .line 260
    move-result-object v6

    .line 261
    new-instance v7, Landroidx/compose/ui/graphics/vector/PathNode$RelativeLineTo;

    .line 262
    .line 263
    aget v8, v6, v4

    .line 264
    .line 265
    aget v9, v6, v3

    .line 266
    .line 267
    invoke-direct {v7, v8, v9}, Landroidx/compose/ui/graphics/vector/PathNode$RelativeLineTo;-><init>(FF)V

    .line 268
    .line 269
    .line 270
    instance-of v8, v7, Landroidx/compose/ui/graphics/vector/PathNode$MoveTo;

    .line 271
    .line 272
    if-eqz v8, :cond_a

    .line 273
    .line 274
    if-lez v5, :cond_a

    .line 275
    .line 276
    new-instance v7, Landroidx/compose/ui/graphics/vector/PathNode$LineTo;

    .line 277
    .line 278
    aget v5, v6, v4

    .line 279
    .line 280
    aget v6, v6, v3

    .line 281
    .line 282
    invoke-direct {v7, v5, v6}, Landroidx/compose/ui/graphics/vector/PathNode$LineTo;-><init>(FF)V

    .line 283
    .line 284
    .line 285
    goto :goto_7

    .line 286
    :cond_a
    instance-of v8, v7, Landroidx/compose/ui/graphics/vector/PathNode$RelativeMoveTo;

    .line 287
    .line 288
    if-eqz v8, :cond_b

    .line 289
    .line 290
    if-lez v5, :cond_b

    .line 291
    .line 292
    new-instance v7, Landroidx/compose/ui/graphics/vector/PathNode$RelativeLineTo;

    .line 293
    .line 294
    aget v5, v6, v4

    .line 295
    .line 296
    aget v6, v6, v3

    .line 297
    .line 298
    invoke-direct {v7, v5, v6}, Landroidx/compose/ui/graphics/vector/PathNode$RelativeLineTo;-><init>(FF)V

    .line 299
    .line 300
    .line 301
    :cond_b
    :goto_7
    invoke-interface {v2, v7}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 302
    .line 303
    .line 304
    goto :goto_6

    .line 305
    :cond_c
    const/16 v2, 0x4c

    .line 306
    .line 307
    if-ne v0, v2, :cond_f

    .line 308
    .line 309
    new-instance v0, Lkotlin/ranges/IntRange;

    .line 310
    .line 311
    array-length v2, v1

    .line 312
    sub-int/2addr v2, v5

    .line 313
    invoke-direct {v0, v4, v2}, Lkotlin/ranges/IntRange;-><init>(II)V

    .line 314
    .line 315
    .line 316
    invoke-static {v0, v5}, Lkotlin/ranges/RangesKt;->step(Lkotlin/ranges/IntProgression;I)Lkotlin/ranges/IntProgression;

    .line 317
    .line 318
    .line 319
    move-result-object v0

    .line 320
    new-instance v2, Ljava/util/ArrayList;

    .line 321
    .line 322
    invoke-static {v0, v6}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 323
    .line 324
    .line 325
    move-result v5

    .line 326
    invoke-direct {v2, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 327
    .line 328
    .line 329
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 330
    .line 331
    .line 332
    move-result-object v0

    .line 333
    :goto_8
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 334
    .line 335
    .line 336
    move-result v5

    .line 337
    if-eqz v5, :cond_5

    .line 338
    .line 339
    move-object v5, v0

    .line 340
    check-cast v5, Lkotlin/collections/IntIterator;

    .line 341
    .line 342
    invoke-virtual {v5}, Lkotlin/collections/IntIterator;->nextInt()I

    .line 343
    .line 344
    .line 345
    move-result v5

    .line 346
    add-int/lit8 v6, v5, 0x2

    .line 347
    .line 348
    invoke-static {v1, v5, v6}, Lkotlin/collections/ArraysKt;->copyOfRange([FII)[F

    .line 349
    .line 350
    .line 351
    move-result-object v6

    .line 352
    new-instance v7, Landroidx/compose/ui/graphics/vector/PathNode$LineTo;

    .line 353
    .line 354
    aget v8, v6, v4

    .line 355
    .line 356
    aget v9, v6, v3

    .line 357
    .line 358
    invoke-direct {v7, v8, v9}, Landroidx/compose/ui/graphics/vector/PathNode$LineTo;-><init>(FF)V

    .line 359
    .line 360
    .line 361
    instance-of v8, v7, Landroidx/compose/ui/graphics/vector/PathNode$MoveTo;

    .line 362
    .line 363
    if-eqz v8, :cond_d

    .line 364
    .line 365
    if-lez v5, :cond_d

    .line 366
    .line 367
    new-instance v7, Landroidx/compose/ui/graphics/vector/PathNode$LineTo;

    .line 368
    .line 369
    aget v5, v6, v4

    .line 370
    .line 371
    aget v6, v6, v3

    .line 372
    .line 373
    invoke-direct {v7, v5, v6}, Landroidx/compose/ui/graphics/vector/PathNode$LineTo;-><init>(FF)V

    .line 374
    .line 375
    .line 376
    goto :goto_9

    .line 377
    :cond_d
    instance-of v8, v7, Landroidx/compose/ui/graphics/vector/PathNode$RelativeMoveTo;

    .line 378
    .line 379
    if-eqz v8, :cond_e

    .line 380
    .line 381
    if-lez v5, :cond_e

    .line 382
    .line 383
    new-instance v7, Landroidx/compose/ui/graphics/vector/PathNode$RelativeLineTo;

    .line 384
    .line 385
    aget v5, v6, v4

    .line 386
    .line 387
    aget v6, v6, v3

    .line 388
    .line 389
    invoke-direct {v7, v5, v6}, Landroidx/compose/ui/graphics/vector/PathNode$RelativeLineTo;-><init>(FF)V

    .line 390
    .line 391
    .line 392
    :cond_e
    :goto_9
    invoke-interface {v2, v7}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 393
    .line 394
    .line 395
    goto :goto_8

    .line 396
    :cond_f
    const/16 v2, 0x68

    .line 397
    .line 398
    if-ne v0, v2, :cond_12

    .line 399
    .line 400
    new-instance v0, Lkotlin/ranges/IntRange;

    .line 401
    .line 402
    array-length v2, v1

    .line 403
    sub-int/2addr v2, v3

    .line 404
    invoke-direct {v0, v4, v2}, Lkotlin/ranges/IntRange;-><init>(II)V

    .line 405
    .line 406
    .line 407
    invoke-static {v0, v3}, Lkotlin/ranges/RangesKt;->step(Lkotlin/ranges/IntProgression;I)Lkotlin/ranges/IntProgression;

    .line 408
    .line 409
    .line 410
    move-result-object v0

    .line 411
    new-instance v2, Ljava/util/ArrayList;

    .line 412
    .line 413
    invoke-static {v0, v6}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 414
    .line 415
    .line 416
    move-result v5

    .line 417
    invoke-direct {v2, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 418
    .line 419
    .line 420
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 421
    .line 422
    .line 423
    move-result-object v0

    .line 424
    :goto_a
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 425
    .line 426
    .line 427
    move-result v5

    .line 428
    if-eqz v5, :cond_5

    .line 429
    .line 430
    move-object v5, v0

    .line 431
    check-cast v5, Lkotlin/collections/IntIterator;

    .line 432
    .line 433
    invoke-virtual {v5}, Lkotlin/collections/IntIterator;->nextInt()I

    .line 434
    .line 435
    .line 436
    move-result v5

    .line 437
    add-int/lit8 v6, v5, 0x1

    .line 438
    .line 439
    invoke-static {v1, v5, v6}, Lkotlin/collections/ArraysKt;->copyOfRange([FII)[F

    .line 440
    .line 441
    .line 442
    move-result-object v6

    .line 443
    new-instance v7, Landroidx/compose/ui/graphics/vector/PathNode$RelativeHorizontalTo;

    .line 444
    .line 445
    aget v8, v6, v4

    .line 446
    .line 447
    invoke-direct {v7, v8}, Landroidx/compose/ui/graphics/vector/PathNode$RelativeHorizontalTo;-><init>(F)V

    .line 448
    .line 449
    .line 450
    instance-of v8, v7, Landroidx/compose/ui/graphics/vector/PathNode$MoveTo;

    .line 451
    .line 452
    if-eqz v8, :cond_10

    .line 453
    .line 454
    if-lez v5, :cond_10

    .line 455
    .line 456
    new-instance v7, Landroidx/compose/ui/graphics/vector/PathNode$LineTo;

    .line 457
    .line 458
    aget v5, v6, v4

    .line 459
    .line 460
    aget v6, v6, v3

    .line 461
    .line 462
    invoke-direct {v7, v5, v6}, Landroidx/compose/ui/graphics/vector/PathNode$LineTo;-><init>(FF)V

    .line 463
    .line 464
    .line 465
    goto :goto_b

    .line 466
    :cond_10
    instance-of v8, v7, Landroidx/compose/ui/graphics/vector/PathNode$RelativeMoveTo;

    .line 467
    .line 468
    if-eqz v8, :cond_11

    .line 469
    .line 470
    if-lez v5, :cond_11

    .line 471
    .line 472
    new-instance v7, Landroidx/compose/ui/graphics/vector/PathNode$RelativeLineTo;

    .line 473
    .line 474
    aget v5, v6, v4

    .line 475
    .line 476
    aget v6, v6, v3

    .line 477
    .line 478
    invoke-direct {v7, v5, v6}, Landroidx/compose/ui/graphics/vector/PathNode$RelativeLineTo;-><init>(FF)V

    .line 479
    .line 480
    .line 481
    :cond_11
    :goto_b
    invoke-interface {v2, v7}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 482
    .line 483
    .line 484
    goto :goto_a

    .line 485
    :cond_12
    const/16 v2, 0x48

    .line 486
    .line 487
    if-ne v0, v2, :cond_15

    .line 488
    .line 489
    new-instance v0, Lkotlin/ranges/IntRange;

    .line 490
    .line 491
    array-length v2, v1

    .line 492
    sub-int/2addr v2, v3

    .line 493
    invoke-direct {v0, v4, v2}, Lkotlin/ranges/IntRange;-><init>(II)V

    .line 494
    .line 495
    .line 496
    invoke-static {v0, v3}, Lkotlin/ranges/RangesKt;->step(Lkotlin/ranges/IntProgression;I)Lkotlin/ranges/IntProgression;

    .line 497
    .line 498
    .line 499
    move-result-object v0

    .line 500
    new-instance v2, Ljava/util/ArrayList;

    .line 501
    .line 502
    invoke-static {v0, v6}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 503
    .line 504
    .line 505
    move-result v5

    .line 506
    invoke-direct {v2, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 507
    .line 508
    .line 509
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 510
    .line 511
    .line 512
    move-result-object v0

    .line 513
    :goto_c
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 514
    .line 515
    .line 516
    move-result v5

    .line 517
    if-eqz v5, :cond_5

    .line 518
    .line 519
    move-object v5, v0

    .line 520
    check-cast v5, Lkotlin/collections/IntIterator;

    .line 521
    .line 522
    invoke-virtual {v5}, Lkotlin/collections/IntIterator;->nextInt()I

    .line 523
    .line 524
    .line 525
    move-result v5

    .line 526
    add-int/lit8 v6, v5, 0x1

    .line 527
    .line 528
    invoke-static {v1, v5, v6}, Lkotlin/collections/ArraysKt;->copyOfRange([FII)[F

    .line 529
    .line 530
    .line 531
    move-result-object v6

    .line 532
    new-instance v7, Landroidx/compose/ui/graphics/vector/PathNode$HorizontalTo;

    .line 533
    .line 534
    aget v8, v6, v4

    .line 535
    .line 536
    invoke-direct {v7, v8}, Landroidx/compose/ui/graphics/vector/PathNode$HorizontalTo;-><init>(F)V

    .line 537
    .line 538
    .line 539
    instance-of v8, v7, Landroidx/compose/ui/graphics/vector/PathNode$MoveTo;

    .line 540
    .line 541
    if-eqz v8, :cond_13

    .line 542
    .line 543
    if-lez v5, :cond_13

    .line 544
    .line 545
    new-instance v7, Landroidx/compose/ui/graphics/vector/PathNode$LineTo;

    .line 546
    .line 547
    aget v5, v6, v4

    .line 548
    .line 549
    aget v6, v6, v3

    .line 550
    .line 551
    invoke-direct {v7, v5, v6}, Landroidx/compose/ui/graphics/vector/PathNode$LineTo;-><init>(FF)V

    .line 552
    .line 553
    .line 554
    goto :goto_d

    .line 555
    :cond_13
    instance-of v8, v7, Landroidx/compose/ui/graphics/vector/PathNode$RelativeMoveTo;

    .line 556
    .line 557
    if-eqz v8, :cond_14

    .line 558
    .line 559
    if-lez v5, :cond_14

    .line 560
    .line 561
    new-instance v7, Landroidx/compose/ui/graphics/vector/PathNode$RelativeLineTo;

    .line 562
    .line 563
    aget v5, v6, v4

    .line 564
    .line 565
    aget v6, v6, v3

    .line 566
    .line 567
    invoke-direct {v7, v5, v6}, Landroidx/compose/ui/graphics/vector/PathNode$RelativeLineTo;-><init>(FF)V

    .line 568
    .line 569
    .line 570
    :cond_14
    :goto_d
    invoke-interface {v2, v7}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 571
    .line 572
    .line 573
    goto :goto_c

    .line 574
    :cond_15
    const/16 v2, 0x76

    .line 575
    .line 576
    if-ne v0, v2, :cond_18

    .line 577
    .line 578
    new-instance v0, Lkotlin/ranges/IntRange;

    .line 579
    .line 580
    array-length v2, v1

    .line 581
    sub-int/2addr v2, v3

    .line 582
    invoke-direct {v0, v4, v2}, Lkotlin/ranges/IntRange;-><init>(II)V

    .line 583
    .line 584
    .line 585
    invoke-static {v0, v3}, Lkotlin/ranges/RangesKt;->step(Lkotlin/ranges/IntProgression;I)Lkotlin/ranges/IntProgression;

    .line 586
    .line 587
    .line 588
    move-result-object v0

    .line 589
    new-instance v2, Ljava/util/ArrayList;

    .line 590
    .line 591
    invoke-static {v0, v6}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 592
    .line 593
    .line 594
    move-result v5

    .line 595
    invoke-direct {v2, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 596
    .line 597
    .line 598
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 599
    .line 600
    .line 601
    move-result-object v0

    .line 602
    :goto_e
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 603
    .line 604
    .line 605
    move-result v5

    .line 606
    if-eqz v5, :cond_5

    .line 607
    .line 608
    move-object v5, v0

    .line 609
    check-cast v5, Lkotlin/collections/IntIterator;

    .line 610
    .line 611
    invoke-virtual {v5}, Lkotlin/collections/IntIterator;->nextInt()I

    .line 612
    .line 613
    .line 614
    move-result v5

    .line 615
    add-int/lit8 v6, v5, 0x1

    .line 616
    .line 617
    invoke-static {v1, v5, v6}, Lkotlin/collections/ArraysKt;->copyOfRange([FII)[F

    .line 618
    .line 619
    .line 620
    move-result-object v6

    .line 621
    new-instance v7, Landroidx/compose/ui/graphics/vector/PathNode$RelativeVerticalTo;

    .line 622
    .line 623
    aget v8, v6, v4

    .line 624
    .line 625
    invoke-direct {v7, v8}, Landroidx/compose/ui/graphics/vector/PathNode$RelativeVerticalTo;-><init>(F)V

    .line 626
    .line 627
    .line 628
    instance-of v8, v7, Landroidx/compose/ui/graphics/vector/PathNode$MoveTo;

    .line 629
    .line 630
    if-eqz v8, :cond_16

    .line 631
    .line 632
    if-lez v5, :cond_16

    .line 633
    .line 634
    new-instance v7, Landroidx/compose/ui/graphics/vector/PathNode$LineTo;

    .line 635
    .line 636
    aget v5, v6, v4

    .line 637
    .line 638
    aget v6, v6, v3

    .line 639
    .line 640
    invoke-direct {v7, v5, v6}, Landroidx/compose/ui/graphics/vector/PathNode$LineTo;-><init>(FF)V

    .line 641
    .line 642
    .line 643
    goto :goto_f

    .line 644
    :cond_16
    instance-of v8, v7, Landroidx/compose/ui/graphics/vector/PathNode$RelativeMoveTo;

    .line 645
    .line 646
    if-eqz v8, :cond_17

    .line 647
    .line 648
    if-lez v5, :cond_17

    .line 649
    .line 650
    new-instance v7, Landroidx/compose/ui/graphics/vector/PathNode$RelativeLineTo;

    .line 651
    .line 652
    aget v5, v6, v4

    .line 653
    .line 654
    aget v6, v6, v3

    .line 655
    .line 656
    invoke-direct {v7, v5, v6}, Landroidx/compose/ui/graphics/vector/PathNode$RelativeLineTo;-><init>(FF)V

    .line 657
    .line 658
    .line 659
    :cond_17
    :goto_f
    invoke-interface {v2, v7}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 660
    .line 661
    .line 662
    goto :goto_e

    .line 663
    :cond_18
    const/16 v2, 0x56

    .line 664
    .line 665
    if-ne v0, v2, :cond_1b

    .line 666
    .line 667
    new-instance v0, Lkotlin/ranges/IntRange;

    .line 668
    .line 669
    array-length v2, v1

    .line 670
    sub-int/2addr v2, v3

    .line 671
    invoke-direct {v0, v4, v2}, Lkotlin/ranges/IntRange;-><init>(II)V

    .line 672
    .line 673
    .line 674
    invoke-static {v0, v3}, Lkotlin/ranges/RangesKt;->step(Lkotlin/ranges/IntProgression;I)Lkotlin/ranges/IntProgression;

    .line 675
    .line 676
    .line 677
    move-result-object v0

    .line 678
    new-instance v2, Ljava/util/ArrayList;

    .line 679
    .line 680
    invoke-static {v0, v6}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 681
    .line 682
    .line 683
    move-result v5

    .line 684
    invoke-direct {v2, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 685
    .line 686
    .line 687
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 688
    .line 689
    .line 690
    move-result-object v0

    .line 691
    :goto_10
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 692
    .line 693
    .line 694
    move-result v5

    .line 695
    if-eqz v5, :cond_5

    .line 696
    .line 697
    move-object v5, v0

    .line 698
    check-cast v5, Lkotlin/collections/IntIterator;

    .line 699
    .line 700
    invoke-virtual {v5}, Lkotlin/collections/IntIterator;->nextInt()I

    .line 701
    .line 702
    .line 703
    move-result v5

    .line 704
    add-int/lit8 v6, v5, 0x1

    .line 705
    .line 706
    invoke-static {v1, v5, v6}, Lkotlin/collections/ArraysKt;->copyOfRange([FII)[F

    .line 707
    .line 708
    .line 709
    move-result-object v6

    .line 710
    new-instance v7, Landroidx/compose/ui/graphics/vector/PathNode$VerticalTo;

    .line 711
    .line 712
    aget v8, v6, v4

    .line 713
    .line 714
    invoke-direct {v7, v8}, Landroidx/compose/ui/graphics/vector/PathNode$VerticalTo;-><init>(F)V

    .line 715
    .line 716
    .line 717
    instance-of v8, v7, Landroidx/compose/ui/graphics/vector/PathNode$MoveTo;

    .line 718
    .line 719
    if-eqz v8, :cond_19

    .line 720
    .line 721
    if-lez v5, :cond_19

    .line 722
    .line 723
    new-instance v7, Landroidx/compose/ui/graphics/vector/PathNode$LineTo;

    .line 724
    .line 725
    aget v5, v6, v4

    .line 726
    .line 727
    aget v6, v6, v3

    .line 728
    .line 729
    invoke-direct {v7, v5, v6}, Landroidx/compose/ui/graphics/vector/PathNode$LineTo;-><init>(FF)V

    .line 730
    .line 731
    .line 732
    goto :goto_11

    .line 733
    :cond_19
    instance-of v8, v7, Landroidx/compose/ui/graphics/vector/PathNode$RelativeMoveTo;

    .line 734
    .line 735
    if-eqz v8, :cond_1a

    .line 736
    .line 737
    if-lez v5, :cond_1a

    .line 738
    .line 739
    new-instance v7, Landroidx/compose/ui/graphics/vector/PathNode$RelativeLineTo;

    .line 740
    .line 741
    aget v5, v6, v4

    .line 742
    .line 743
    aget v6, v6, v3

    .line 744
    .line 745
    invoke-direct {v7, v5, v6}, Landroidx/compose/ui/graphics/vector/PathNode$RelativeLineTo;-><init>(FF)V

    .line 746
    .line 747
    .line 748
    :cond_1a
    :goto_11
    invoke-interface {v2, v7}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 749
    .line 750
    .line 751
    goto :goto_10

    .line 752
    :cond_1b
    const/16 v2, 0x63

    .line 753
    .line 754
    const/4 v7, 0x5

    .line 755
    const/4 v8, 0x6

    .line 756
    const/4 v9, 0x3

    .line 757
    const/4 v10, 0x4

    .line 758
    if-ne v0, v2, :cond_1e

    .line 759
    .line 760
    new-instance v0, Lkotlin/ranges/IntRange;

    .line 761
    .line 762
    array-length v2, v1

    .line 763
    sub-int/2addr v2, v8

    .line 764
    invoke-direct {v0, v4, v2}, Lkotlin/ranges/IntRange;-><init>(II)V

    .line 765
    .line 766
    .line 767
    invoke-static {v0, v8}, Lkotlin/ranges/RangesKt;->step(Lkotlin/ranges/IntProgression;I)Lkotlin/ranges/IntProgression;

    .line 768
    .line 769
    .line 770
    move-result-object v0

    .line 771
    new-instance v2, Ljava/util/ArrayList;

    .line 772
    .line 773
    invoke-static {v0, v6}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 774
    .line 775
    .line 776
    move-result v6

    .line 777
    invoke-direct {v2, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 778
    .line 779
    .line 780
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 781
    .line 782
    .line 783
    move-result-object v0

    .line 784
    :goto_12
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 785
    .line 786
    .line 787
    move-result v6

    .line 788
    if-eqz v6, :cond_5

    .line 789
    .line 790
    move-object v6, v0

    .line 791
    check-cast v6, Lkotlin/collections/IntIterator;

    .line 792
    .line 793
    invoke-virtual {v6}, Lkotlin/collections/IntIterator;->nextInt()I

    .line 794
    .line 795
    .line 796
    move-result v6

    .line 797
    add-int/lit8 v8, v6, 0x6

    .line 798
    .line 799
    invoke-static {v1, v6, v8}, Lkotlin/collections/ArraysKt;->copyOfRange([FII)[F

    .line 800
    .line 801
    .line 802
    move-result-object v8

    .line 803
    new-instance v15, Landroidx/compose/ui/graphics/vector/PathNode$RelativeCurveTo;

    .line 804
    .line 805
    aget v12, v8, v4

    .line 806
    .line 807
    aget v13, v8, v3

    .line 808
    .line 809
    aget v14, v8, v5

    .line 810
    .line 811
    aget v16, v8, v9

    .line 812
    .line 813
    aget v17, v8, v10

    .line 814
    .line 815
    aget v18, v8, v7

    .line 816
    .line 817
    move-object v11, v15

    .line 818
    move-object v7, v15

    .line 819
    move/from16 v15, v16

    .line 820
    .line 821
    move/from16 v16, v17

    .line 822
    .line 823
    move/from16 v17, v18

    .line 824
    .line 825
    invoke-direct/range {v11 .. v17}, Landroidx/compose/ui/graphics/vector/PathNode$RelativeCurveTo;-><init>(FFFFFF)V

    .line 826
    .line 827
    .line 828
    instance-of v11, v7, Landroidx/compose/ui/graphics/vector/PathNode$MoveTo;

    .line 829
    .line 830
    if-eqz v11, :cond_1c

    .line 831
    .line 832
    if-lez v6, :cond_1c

    .line 833
    .line 834
    new-instance v15, Landroidx/compose/ui/graphics/vector/PathNode$LineTo;

    .line 835
    .line 836
    aget v6, v8, v4

    .line 837
    .line 838
    aget v7, v8, v3

    .line 839
    .line 840
    invoke-direct {v15, v6, v7}, Landroidx/compose/ui/graphics/vector/PathNode$LineTo;-><init>(FF)V

    .line 841
    .line 842
    .line 843
    goto :goto_13

    .line 844
    :cond_1c
    instance-of v11, v7, Landroidx/compose/ui/graphics/vector/PathNode$RelativeMoveTo;

    .line 845
    .line 846
    if-eqz v11, :cond_1d

    .line 847
    .line 848
    if-lez v6, :cond_1d

    .line 849
    .line 850
    new-instance v15, Landroidx/compose/ui/graphics/vector/PathNode$RelativeLineTo;

    .line 851
    .line 852
    aget v6, v8, v4

    .line 853
    .line 854
    aget v7, v8, v3

    .line 855
    .line 856
    invoke-direct {v15, v6, v7}, Landroidx/compose/ui/graphics/vector/PathNode$RelativeLineTo;-><init>(FF)V

    .line 857
    .line 858
    .line 859
    goto :goto_13

    .line 860
    :cond_1d
    move-object v15, v7

    .line 861
    :goto_13
    invoke-interface {v2, v15}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 862
    .line 863
    .line 864
    const/4 v7, 0x5

    .line 865
    goto :goto_12

    .line 866
    :cond_1e
    const/16 v2, 0x43

    .line 867
    .line 868
    if-ne v0, v2, :cond_21

    .line 869
    .line 870
    new-instance v0, Lkotlin/ranges/IntRange;

    .line 871
    .line 872
    array-length v2, v1

    .line 873
    sub-int/2addr v2, v8

    .line 874
    invoke-direct {v0, v4, v2}, Lkotlin/ranges/IntRange;-><init>(II)V

    .line 875
    .line 876
    .line 877
    invoke-static {v0, v8}, Lkotlin/ranges/RangesKt;->step(Lkotlin/ranges/IntProgression;I)Lkotlin/ranges/IntProgression;

    .line 878
    .line 879
    .line 880
    move-result-object v0

    .line 881
    new-instance v2, Ljava/util/ArrayList;

    .line 882
    .line 883
    invoke-static {v0, v6}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 884
    .line 885
    .line 886
    move-result v6

    .line 887
    invoke-direct {v2, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 888
    .line 889
    .line 890
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 891
    .line 892
    .line 893
    move-result-object v0

    .line 894
    :goto_14
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 895
    .line 896
    .line 897
    move-result v6

    .line 898
    if-eqz v6, :cond_5

    .line 899
    .line 900
    move-object v6, v0

    .line 901
    check-cast v6, Lkotlin/collections/IntIterator;

    .line 902
    .line 903
    invoke-virtual {v6}, Lkotlin/collections/IntIterator;->nextInt()I

    .line 904
    .line 905
    .line 906
    move-result v6

    .line 907
    add-int/lit8 v7, v6, 0x6

    .line 908
    .line 909
    invoke-static {v1, v6, v7}, Lkotlin/collections/ArraysKt;->copyOfRange([FII)[F

    .line 910
    .line 911
    .line 912
    move-result-object v7

    .line 913
    new-instance v8, Landroidx/compose/ui/graphics/vector/PathNode$CurveTo;

    .line 914
    .line 915
    aget v12, v7, v4

    .line 916
    .line 917
    aget v13, v7, v3

    .line 918
    .line 919
    aget v14, v7, v5

    .line 920
    .line 921
    aget v15, v7, v9

    .line 922
    .line 923
    aget v16, v7, v10

    .line 924
    .line 925
    const/4 v11, 0x5

    .line 926
    aget v17, v7, v11

    .line 927
    .line 928
    move-object v11, v8

    .line 929
    invoke-direct/range {v11 .. v17}, Landroidx/compose/ui/graphics/vector/PathNode$CurveTo;-><init>(FFFFFF)V

    .line 930
    .line 931
    .line 932
    instance-of v11, v8, Landroidx/compose/ui/graphics/vector/PathNode$MoveTo;

    .line 933
    .line 934
    if-eqz v11, :cond_1f

    .line 935
    .line 936
    if-lez v6, :cond_1f

    .line 937
    .line 938
    new-instance v8, Landroidx/compose/ui/graphics/vector/PathNode$LineTo;

    .line 939
    .line 940
    aget v6, v7, v4

    .line 941
    .line 942
    aget v7, v7, v3

    .line 943
    .line 944
    invoke-direct {v8, v6, v7}, Landroidx/compose/ui/graphics/vector/PathNode$LineTo;-><init>(FF)V

    .line 945
    .line 946
    .line 947
    goto :goto_15

    .line 948
    :cond_1f
    instance-of v11, v8, Landroidx/compose/ui/graphics/vector/PathNode$RelativeMoveTo;

    .line 949
    .line 950
    if-eqz v11, :cond_20

    .line 951
    .line 952
    if-lez v6, :cond_20

    .line 953
    .line 954
    new-instance v8, Landroidx/compose/ui/graphics/vector/PathNode$RelativeLineTo;

    .line 955
    .line 956
    aget v6, v7, v4

    .line 957
    .line 958
    aget v7, v7, v3

    .line 959
    .line 960
    invoke-direct {v8, v6, v7}, Landroidx/compose/ui/graphics/vector/PathNode$RelativeLineTo;-><init>(FF)V

    .line 961
    .line 962
    .line 963
    :cond_20
    :goto_15
    invoke-interface {v2, v8}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 964
    .line 965
    .line 966
    goto :goto_14

    .line 967
    :cond_21
    const/16 v2, 0x73

    .line 968
    .line 969
    if-ne v0, v2, :cond_24

    .line 970
    .line 971
    new-instance v0, Lkotlin/ranges/IntRange;

    .line 972
    .line 973
    array-length v2, v1

    .line 974
    sub-int/2addr v2, v10

    .line 975
    invoke-direct {v0, v4, v2}, Lkotlin/ranges/IntRange;-><init>(II)V

    .line 976
    .line 977
    .line 978
    invoke-static {v0, v10}, Lkotlin/ranges/RangesKt;->step(Lkotlin/ranges/IntProgression;I)Lkotlin/ranges/IntProgression;

    .line 979
    .line 980
    .line 981
    move-result-object v0

    .line 982
    new-instance v2, Ljava/util/ArrayList;

    .line 983
    .line 984
    invoke-static {v0, v6}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 985
    .line 986
    .line 987
    move-result v6

    .line 988
    invoke-direct {v2, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 989
    .line 990
    .line 991
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 992
    .line 993
    .line 994
    move-result-object v0

    .line 995
    :goto_16
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 996
    .line 997
    .line 998
    move-result v6

    .line 999
    if-eqz v6, :cond_5

    .line 1000
    .line 1001
    move-object v6, v0

    .line 1002
    check-cast v6, Lkotlin/collections/IntIterator;

    .line 1003
    .line 1004
    invoke-virtual {v6}, Lkotlin/collections/IntIterator;->nextInt()I

    .line 1005
    .line 1006
    .line 1007
    move-result v6

    .line 1008
    add-int/lit8 v7, v6, 0x4

    .line 1009
    .line 1010
    invoke-static {v1, v6, v7}, Lkotlin/collections/ArraysKt;->copyOfRange([FII)[F

    .line 1011
    .line 1012
    .line 1013
    move-result-object v7

    .line 1014
    new-instance v8, Landroidx/compose/ui/graphics/vector/PathNode$RelativeReflectiveCurveTo;

    .line 1015
    .line 1016
    aget v10, v7, v4

    .line 1017
    .line 1018
    aget v11, v7, v3

    .line 1019
    .line 1020
    aget v12, v7, v5

    .line 1021
    .line 1022
    aget v13, v7, v9

    .line 1023
    .line 1024
    invoke-direct {v8, v10, v11, v12, v13}, Landroidx/compose/ui/graphics/vector/PathNode$RelativeReflectiveCurveTo;-><init>(FFFF)V

    .line 1025
    .line 1026
    .line 1027
    instance-of v10, v8, Landroidx/compose/ui/graphics/vector/PathNode$MoveTo;

    .line 1028
    .line 1029
    if-eqz v10, :cond_22

    .line 1030
    .line 1031
    if-lez v6, :cond_22

    .line 1032
    .line 1033
    new-instance v8, Landroidx/compose/ui/graphics/vector/PathNode$LineTo;

    .line 1034
    .line 1035
    aget v6, v7, v4

    .line 1036
    .line 1037
    aget v7, v7, v3

    .line 1038
    .line 1039
    invoke-direct {v8, v6, v7}, Landroidx/compose/ui/graphics/vector/PathNode$LineTo;-><init>(FF)V

    .line 1040
    .line 1041
    .line 1042
    goto :goto_17

    .line 1043
    :cond_22
    instance-of v10, v8, Landroidx/compose/ui/graphics/vector/PathNode$RelativeMoveTo;

    .line 1044
    .line 1045
    if-eqz v10, :cond_23

    .line 1046
    .line 1047
    if-lez v6, :cond_23

    .line 1048
    .line 1049
    new-instance v8, Landroidx/compose/ui/graphics/vector/PathNode$RelativeLineTo;

    .line 1050
    .line 1051
    aget v6, v7, v4

    .line 1052
    .line 1053
    aget v7, v7, v3

    .line 1054
    .line 1055
    invoke-direct {v8, v6, v7}, Landroidx/compose/ui/graphics/vector/PathNode$RelativeLineTo;-><init>(FF)V

    .line 1056
    .line 1057
    .line 1058
    :cond_23
    :goto_17
    invoke-interface {v2, v8}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 1059
    .line 1060
    .line 1061
    goto :goto_16

    .line 1062
    :cond_24
    const/16 v2, 0x53

    .line 1063
    .line 1064
    if-ne v0, v2, :cond_27

    .line 1065
    .line 1066
    new-instance v0, Lkotlin/ranges/IntRange;

    .line 1067
    .line 1068
    array-length v2, v1

    .line 1069
    sub-int/2addr v2, v10

    .line 1070
    invoke-direct {v0, v4, v2}, Lkotlin/ranges/IntRange;-><init>(II)V

    .line 1071
    .line 1072
    .line 1073
    invoke-static {v0, v10}, Lkotlin/ranges/RangesKt;->step(Lkotlin/ranges/IntProgression;I)Lkotlin/ranges/IntProgression;

    .line 1074
    .line 1075
    .line 1076
    move-result-object v0

    .line 1077
    new-instance v2, Ljava/util/ArrayList;

    .line 1078
    .line 1079
    invoke-static {v0, v6}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 1080
    .line 1081
    .line 1082
    move-result v6

    .line 1083
    invoke-direct {v2, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 1084
    .line 1085
    .line 1086
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1087
    .line 1088
    .line 1089
    move-result-object v0

    .line 1090
    :goto_18
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1091
    .line 1092
    .line 1093
    move-result v6

    .line 1094
    if-eqz v6, :cond_5

    .line 1095
    .line 1096
    move-object v6, v0

    .line 1097
    check-cast v6, Lkotlin/collections/IntIterator;

    .line 1098
    .line 1099
    invoke-virtual {v6}, Lkotlin/collections/IntIterator;->nextInt()I

    .line 1100
    .line 1101
    .line 1102
    move-result v6

    .line 1103
    add-int/lit8 v7, v6, 0x4

    .line 1104
    .line 1105
    invoke-static {v1, v6, v7}, Lkotlin/collections/ArraysKt;->copyOfRange([FII)[F

    .line 1106
    .line 1107
    .line 1108
    move-result-object v7

    .line 1109
    new-instance v8, Landroidx/compose/ui/graphics/vector/PathNode$ReflectiveCurveTo;

    .line 1110
    .line 1111
    aget v10, v7, v4

    .line 1112
    .line 1113
    aget v11, v7, v3

    .line 1114
    .line 1115
    aget v12, v7, v5

    .line 1116
    .line 1117
    aget v13, v7, v9

    .line 1118
    .line 1119
    invoke-direct {v8, v10, v11, v12, v13}, Landroidx/compose/ui/graphics/vector/PathNode$ReflectiveCurveTo;-><init>(FFFF)V

    .line 1120
    .line 1121
    .line 1122
    instance-of v10, v8, Landroidx/compose/ui/graphics/vector/PathNode$MoveTo;

    .line 1123
    .line 1124
    if-eqz v10, :cond_25

    .line 1125
    .line 1126
    if-lez v6, :cond_25

    .line 1127
    .line 1128
    new-instance v8, Landroidx/compose/ui/graphics/vector/PathNode$LineTo;

    .line 1129
    .line 1130
    aget v6, v7, v4

    .line 1131
    .line 1132
    aget v7, v7, v3

    .line 1133
    .line 1134
    invoke-direct {v8, v6, v7}, Landroidx/compose/ui/graphics/vector/PathNode$LineTo;-><init>(FF)V

    .line 1135
    .line 1136
    .line 1137
    goto :goto_19

    .line 1138
    :cond_25
    instance-of v10, v8, Landroidx/compose/ui/graphics/vector/PathNode$RelativeMoveTo;

    .line 1139
    .line 1140
    if-eqz v10, :cond_26

    .line 1141
    .line 1142
    if-lez v6, :cond_26

    .line 1143
    .line 1144
    new-instance v8, Landroidx/compose/ui/graphics/vector/PathNode$RelativeLineTo;

    .line 1145
    .line 1146
    aget v6, v7, v4

    .line 1147
    .line 1148
    aget v7, v7, v3

    .line 1149
    .line 1150
    invoke-direct {v8, v6, v7}, Landroidx/compose/ui/graphics/vector/PathNode$RelativeLineTo;-><init>(FF)V

    .line 1151
    .line 1152
    .line 1153
    :cond_26
    :goto_19
    invoke-interface {v2, v8}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 1154
    .line 1155
    .line 1156
    goto :goto_18

    .line 1157
    :cond_27
    const/16 v2, 0x71

    .line 1158
    .line 1159
    if-ne v0, v2, :cond_2a

    .line 1160
    .line 1161
    new-instance v0, Lkotlin/ranges/IntRange;

    .line 1162
    .line 1163
    array-length v2, v1

    .line 1164
    sub-int/2addr v2, v10

    .line 1165
    invoke-direct {v0, v4, v2}, Lkotlin/ranges/IntRange;-><init>(II)V

    .line 1166
    .line 1167
    .line 1168
    invoke-static {v0, v10}, Lkotlin/ranges/RangesKt;->step(Lkotlin/ranges/IntProgression;I)Lkotlin/ranges/IntProgression;

    .line 1169
    .line 1170
    .line 1171
    move-result-object v0

    .line 1172
    new-instance v2, Ljava/util/ArrayList;

    .line 1173
    .line 1174
    invoke-static {v0, v6}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 1175
    .line 1176
    .line 1177
    move-result v6

    .line 1178
    invoke-direct {v2, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 1179
    .line 1180
    .line 1181
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1182
    .line 1183
    .line 1184
    move-result-object v0

    .line 1185
    :goto_1a
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1186
    .line 1187
    .line 1188
    move-result v6

    .line 1189
    if-eqz v6, :cond_5

    .line 1190
    .line 1191
    move-object v6, v0

    .line 1192
    check-cast v6, Lkotlin/collections/IntIterator;

    .line 1193
    .line 1194
    invoke-virtual {v6}, Lkotlin/collections/IntIterator;->nextInt()I

    .line 1195
    .line 1196
    .line 1197
    move-result v6

    .line 1198
    add-int/lit8 v7, v6, 0x4

    .line 1199
    .line 1200
    invoke-static {v1, v6, v7}, Lkotlin/collections/ArraysKt;->copyOfRange([FII)[F

    .line 1201
    .line 1202
    .line 1203
    move-result-object v7

    .line 1204
    new-instance v8, Landroidx/compose/ui/graphics/vector/PathNode$RelativeQuadTo;

    .line 1205
    .line 1206
    aget v10, v7, v4

    .line 1207
    .line 1208
    aget v11, v7, v3

    .line 1209
    .line 1210
    aget v12, v7, v5

    .line 1211
    .line 1212
    aget v13, v7, v9

    .line 1213
    .line 1214
    invoke-direct {v8, v10, v11, v12, v13}, Landroidx/compose/ui/graphics/vector/PathNode$RelativeQuadTo;-><init>(FFFF)V

    .line 1215
    .line 1216
    .line 1217
    instance-of v10, v8, Landroidx/compose/ui/graphics/vector/PathNode$MoveTo;

    .line 1218
    .line 1219
    if-eqz v10, :cond_28

    .line 1220
    .line 1221
    if-lez v6, :cond_28

    .line 1222
    .line 1223
    new-instance v8, Landroidx/compose/ui/graphics/vector/PathNode$LineTo;

    .line 1224
    .line 1225
    aget v6, v7, v4

    .line 1226
    .line 1227
    aget v7, v7, v3

    .line 1228
    .line 1229
    invoke-direct {v8, v6, v7}, Landroidx/compose/ui/graphics/vector/PathNode$LineTo;-><init>(FF)V

    .line 1230
    .line 1231
    .line 1232
    goto :goto_1b

    .line 1233
    :cond_28
    instance-of v10, v8, Landroidx/compose/ui/graphics/vector/PathNode$RelativeMoveTo;

    .line 1234
    .line 1235
    if-eqz v10, :cond_29

    .line 1236
    .line 1237
    if-lez v6, :cond_29

    .line 1238
    .line 1239
    new-instance v8, Landroidx/compose/ui/graphics/vector/PathNode$RelativeLineTo;

    .line 1240
    .line 1241
    aget v6, v7, v4

    .line 1242
    .line 1243
    aget v7, v7, v3

    .line 1244
    .line 1245
    invoke-direct {v8, v6, v7}, Landroidx/compose/ui/graphics/vector/PathNode$RelativeLineTo;-><init>(FF)V

    .line 1246
    .line 1247
    .line 1248
    :cond_29
    :goto_1b
    invoke-interface {v2, v8}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 1249
    .line 1250
    .line 1251
    goto :goto_1a

    .line 1252
    :cond_2a
    const/16 v2, 0x51

    .line 1253
    .line 1254
    if-ne v0, v2, :cond_2d

    .line 1255
    .line 1256
    new-instance v0, Lkotlin/ranges/IntRange;

    .line 1257
    .line 1258
    array-length v2, v1

    .line 1259
    sub-int/2addr v2, v10

    .line 1260
    invoke-direct {v0, v4, v2}, Lkotlin/ranges/IntRange;-><init>(II)V

    .line 1261
    .line 1262
    .line 1263
    invoke-static {v0, v10}, Lkotlin/ranges/RangesKt;->step(Lkotlin/ranges/IntProgression;I)Lkotlin/ranges/IntProgression;

    .line 1264
    .line 1265
    .line 1266
    move-result-object v0

    .line 1267
    new-instance v2, Ljava/util/ArrayList;

    .line 1268
    .line 1269
    invoke-static {v0, v6}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 1270
    .line 1271
    .line 1272
    move-result v6

    .line 1273
    invoke-direct {v2, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 1274
    .line 1275
    .line 1276
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1277
    .line 1278
    .line 1279
    move-result-object v0

    .line 1280
    :goto_1c
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1281
    .line 1282
    .line 1283
    move-result v6

    .line 1284
    if-eqz v6, :cond_5

    .line 1285
    .line 1286
    move-object v6, v0

    .line 1287
    check-cast v6, Lkotlin/collections/IntIterator;

    .line 1288
    .line 1289
    invoke-virtual {v6}, Lkotlin/collections/IntIterator;->nextInt()I

    .line 1290
    .line 1291
    .line 1292
    move-result v6

    .line 1293
    add-int/lit8 v7, v6, 0x4

    .line 1294
    .line 1295
    invoke-static {v1, v6, v7}, Lkotlin/collections/ArraysKt;->copyOfRange([FII)[F

    .line 1296
    .line 1297
    .line 1298
    move-result-object v7

    .line 1299
    new-instance v8, Landroidx/compose/ui/graphics/vector/PathNode$QuadTo;

    .line 1300
    .line 1301
    aget v10, v7, v4

    .line 1302
    .line 1303
    aget v11, v7, v3

    .line 1304
    .line 1305
    aget v12, v7, v5

    .line 1306
    .line 1307
    aget v13, v7, v9

    .line 1308
    .line 1309
    invoke-direct {v8, v10, v11, v12, v13}, Landroidx/compose/ui/graphics/vector/PathNode$QuadTo;-><init>(FFFF)V

    .line 1310
    .line 1311
    .line 1312
    instance-of v10, v8, Landroidx/compose/ui/graphics/vector/PathNode$MoveTo;

    .line 1313
    .line 1314
    if-eqz v10, :cond_2b

    .line 1315
    .line 1316
    if-lez v6, :cond_2b

    .line 1317
    .line 1318
    new-instance v8, Landroidx/compose/ui/graphics/vector/PathNode$LineTo;

    .line 1319
    .line 1320
    aget v6, v7, v4

    .line 1321
    .line 1322
    aget v7, v7, v3

    .line 1323
    .line 1324
    invoke-direct {v8, v6, v7}, Landroidx/compose/ui/graphics/vector/PathNode$LineTo;-><init>(FF)V

    .line 1325
    .line 1326
    .line 1327
    goto :goto_1d

    .line 1328
    :cond_2b
    instance-of v10, v8, Landroidx/compose/ui/graphics/vector/PathNode$RelativeMoveTo;

    .line 1329
    .line 1330
    if-eqz v10, :cond_2c

    .line 1331
    .line 1332
    if-lez v6, :cond_2c

    .line 1333
    .line 1334
    new-instance v8, Landroidx/compose/ui/graphics/vector/PathNode$RelativeLineTo;

    .line 1335
    .line 1336
    aget v6, v7, v4

    .line 1337
    .line 1338
    aget v7, v7, v3

    .line 1339
    .line 1340
    invoke-direct {v8, v6, v7}, Landroidx/compose/ui/graphics/vector/PathNode$RelativeLineTo;-><init>(FF)V

    .line 1341
    .line 1342
    .line 1343
    :cond_2c
    :goto_1d
    invoke-interface {v2, v8}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 1344
    .line 1345
    .line 1346
    goto :goto_1c

    .line 1347
    :cond_2d
    const/16 v2, 0x74

    .line 1348
    .line 1349
    if-ne v0, v2, :cond_30

    .line 1350
    .line 1351
    new-instance v0, Lkotlin/ranges/IntRange;

    .line 1352
    .line 1353
    array-length v2, v1

    .line 1354
    sub-int/2addr v2, v5

    .line 1355
    invoke-direct {v0, v4, v2}, Lkotlin/ranges/IntRange;-><init>(II)V

    .line 1356
    .line 1357
    .line 1358
    invoke-static {v0, v5}, Lkotlin/ranges/RangesKt;->step(Lkotlin/ranges/IntProgression;I)Lkotlin/ranges/IntProgression;

    .line 1359
    .line 1360
    .line 1361
    move-result-object v0

    .line 1362
    new-instance v2, Ljava/util/ArrayList;

    .line 1363
    .line 1364
    invoke-static {v0, v6}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 1365
    .line 1366
    .line 1367
    move-result v5

    .line 1368
    invoke-direct {v2, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 1369
    .line 1370
    .line 1371
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1372
    .line 1373
    .line 1374
    move-result-object v0

    .line 1375
    :goto_1e
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1376
    .line 1377
    .line 1378
    move-result v5

    .line 1379
    if-eqz v5, :cond_5

    .line 1380
    .line 1381
    move-object v5, v0

    .line 1382
    check-cast v5, Lkotlin/collections/IntIterator;

    .line 1383
    .line 1384
    invoke-virtual {v5}, Lkotlin/collections/IntIterator;->nextInt()I

    .line 1385
    .line 1386
    .line 1387
    move-result v5

    .line 1388
    add-int/lit8 v6, v5, 0x2

    .line 1389
    .line 1390
    invoke-static {v1, v5, v6}, Lkotlin/collections/ArraysKt;->copyOfRange([FII)[F

    .line 1391
    .line 1392
    .line 1393
    move-result-object v6

    .line 1394
    new-instance v7, Landroidx/compose/ui/graphics/vector/PathNode$RelativeReflectiveQuadTo;

    .line 1395
    .line 1396
    aget v8, v6, v4

    .line 1397
    .line 1398
    aget v9, v6, v3

    .line 1399
    .line 1400
    invoke-direct {v7, v8, v9}, Landroidx/compose/ui/graphics/vector/PathNode$RelativeReflectiveQuadTo;-><init>(FF)V

    .line 1401
    .line 1402
    .line 1403
    instance-of v8, v7, Landroidx/compose/ui/graphics/vector/PathNode$MoveTo;

    .line 1404
    .line 1405
    if-eqz v8, :cond_2e

    .line 1406
    .line 1407
    if-lez v5, :cond_2e

    .line 1408
    .line 1409
    new-instance v7, Landroidx/compose/ui/graphics/vector/PathNode$LineTo;

    .line 1410
    .line 1411
    aget v5, v6, v4

    .line 1412
    .line 1413
    aget v6, v6, v3

    .line 1414
    .line 1415
    invoke-direct {v7, v5, v6}, Landroidx/compose/ui/graphics/vector/PathNode$LineTo;-><init>(FF)V

    .line 1416
    .line 1417
    .line 1418
    goto :goto_1f

    .line 1419
    :cond_2e
    instance-of v8, v7, Landroidx/compose/ui/graphics/vector/PathNode$RelativeMoveTo;

    .line 1420
    .line 1421
    if-eqz v8, :cond_2f

    .line 1422
    .line 1423
    if-lez v5, :cond_2f

    .line 1424
    .line 1425
    new-instance v7, Landroidx/compose/ui/graphics/vector/PathNode$RelativeLineTo;

    .line 1426
    .line 1427
    aget v5, v6, v4

    .line 1428
    .line 1429
    aget v6, v6, v3

    .line 1430
    .line 1431
    invoke-direct {v7, v5, v6}, Landroidx/compose/ui/graphics/vector/PathNode$RelativeLineTo;-><init>(FF)V

    .line 1432
    .line 1433
    .line 1434
    :cond_2f
    :goto_1f
    invoke-interface {v2, v7}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 1435
    .line 1436
    .line 1437
    goto :goto_1e

    .line 1438
    :cond_30
    const/16 v2, 0x54

    .line 1439
    .line 1440
    if-ne v0, v2, :cond_33

    .line 1441
    .line 1442
    new-instance v0, Lkotlin/ranges/IntRange;

    .line 1443
    .line 1444
    array-length v2, v1

    .line 1445
    sub-int/2addr v2, v5

    .line 1446
    invoke-direct {v0, v4, v2}, Lkotlin/ranges/IntRange;-><init>(II)V

    .line 1447
    .line 1448
    .line 1449
    invoke-static {v0, v5}, Lkotlin/ranges/RangesKt;->step(Lkotlin/ranges/IntProgression;I)Lkotlin/ranges/IntProgression;

    .line 1450
    .line 1451
    .line 1452
    move-result-object v0

    .line 1453
    new-instance v2, Ljava/util/ArrayList;

    .line 1454
    .line 1455
    invoke-static {v0, v6}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 1456
    .line 1457
    .line 1458
    move-result v5

    .line 1459
    invoke-direct {v2, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 1460
    .line 1461
    .line 1462
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1463
    .line 1464
    .line 1465
    move-result-object v0

    .line 1466
    :goto_20
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1467
    .line 1468
    .line 1469
    move-result v5

    .line 1470
    if-eqz v5, :cond_5

    .line 1471
    .line 1472
    move-object v5, v0

    .line 1473
    check-cast v5, Lkotlin/collections/IntIterator;

    .line 1474
    .line 1475
    invoke-virtual {v5}, Lkotlin/collections/IntIterator;->nextInt()I

    .line 1476
    .line 1477
    .line 1478
    move-result v5

    .line 1479
    add-int/lit8 v6, v5, 0x2

    .line 1480
    .line 1481
    invoke-static {v1, v5, v6}, Lkotlin/collections/ArraysKt;->copyOfRange([FII)[F

    .line 1482
    .line 1483
    .line 1484
    move-result-object v6

    .line 1485
    new-instance v7, Landroidx/compose/ui/graphics/vector/PathNode$ReflectiveQuadTo;

    .line 1486
    .line 1487
    aget v8, v6, v4

    .line 1488
    .line 1489
    aget v9, v6, v3

    .line 1490
    .line 1491
    invoke-direct {v7, v8, v9}, Landroidx/compose/ui/graphics/vector/PathNode$ReflectiveQuadTo;-><init>(FF)V

    .line 1492
    .line 1493
    .line 1494
    instance-of v8, v7, Landroidx/compose/ui/graphics/vector/PathNode$MoveTo;

    .line 1495
    .line 1496
    if-eqz v8, :cond_31

    .line 1497
    .line 1498
    if-lez v5, :cond_31

    .line 1499
    .line 1500
    new-instance v7, Landroidx/compose/ui/graphics/vector/PathNode$LineTo;

    .line 1501
    .line 1502
    aget v5, v6, v4

    .line 1503
    .line 1504
    aget v6, v6, v3

    .line 1505
    .line 1506
    invoke-direct {v7, v5, v6}, Landroidx/compose/ui/graphics/vector/PathNode$LineTo;-><init>(FF)V

    .line 1507
    .line 1508
    .line 1509
    goto :goto_21

    .line 1510
    :cond_31
    instance-of v8, v7, Landroidx/compose/ui/graphics/vector/PathNode$RelativeMoveTo;

    .line 1511
    .line 1512
    if-eqz v8, :cond_32

    .line 1513
    .line 1514
    if-lez v5, :cond_32

    .line 1515
    .line 1516
    new-instance v7, Landroidx/compose/ui/graphics/vector/PathNode$RelativeLineTo;

    .line 1517
    .line 1518
    aget v5, v6, v4

    .line 1519
    .line 1520
    aget v6, v6, v3

    .line 1521
    .line 1522
    invoke-direct {v7, v5, v6}, Landroidx/compose/ui/graphics/vector/PathNode$RelativeLineTo;-><init>(FF)V

    .line 1523
    .line 1524
    .line 1525
    :cond_32
    :goto_21
    invoke-interface {v2, v7}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 1526
    .line 1527
    .line 1528
    goto :goto_20

    .line 1529
    :cond_33
    const/16 v2, 0x61

    .line 1530
    .line 1531
    const/4 v7, 0x7

    .line 1532
    const/4 v11, 0x0

    .line 1533
    if-ne v0, v2, :cond_38

    .line 1534
    .line 1535
    new-instance v0, Lkotlin/ranges/IntRange;

    .line 1536
    .line 1537
    array-length v2, v1

    .line 1538
    sub-int/2addr v2, v7

    .line 1539
    invoke-direct {v0, v4, v2}, Lkotlin/ranges/IntRange;-><init>(II)V

    .line 1540
    .line 1541
    .line 1542
    invoke-static {v0, v7}, Lkotlin/ranges/RangesKt;->step(Lkotlin/ranges/IntProgression;I)Lkotlin/ranges/IntProgression;

    .line 1543
    .line 1544
    .line 1545
    move-result-object v0

    .line 1546
    new-instance v2, Ljava/util/ArrayList;

    .line 1547
    .line 1548
    invoke-static {v0, v6}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 1549
    .line 1550
    .line 1551
    move-result v6

    .line 1552
    invoke-direct {v2, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 1553
    .line 1554
    .line 1555
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1556
    .line 1557
    .line 1558
    move-result-object v0

    .line 1559
    :goto_22
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1560
    .line 1561
    .line 1562
    move-result v6

    .line 1563
    if-eqz v6, :cond_5

    .line 1564
    .line 1565
    move-object v6, v0

    .line 1566
    check-cast v6, Lkotlin/collections/IntIterator;

    .line 1567
    .line 1568
    invoke-virtual {v6}, Lkotlin/collections/IntIterator;->nextInt()I

    .line 1569
    .line 1570
    .line 1571
    move-result v6

    .line 1572
    add-int/lit8 v7, v6, 0x7

    .line 1573
    .line 1574
    invoke-static {v1, v6, v7}, Lkotlin/collections/ArraysKt;->copyOfRange([FII)[F

    .line 1575
    .line 1576
    .line 1577
    move-result-object v7

    .line 1578
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathNode$RelativeArcTo;

    .line 1579
    .line 1580
    aget v20, v7, v4

    .line 1581
    .line 1582
    aget v21, v7, v3

    .line 1583
    .line 1584
    aget v22, v7, v5

    .line 1585
    .line 1586
    aget v13, v7, v9

    .line 1587
    .line 1588
    invoke-static {v13, v11}, Ljava/lang/Float;->compare(FF)I

    .line 1589
    .line 1590
    .line 1591
    move-result v13

    .line 1592
    if-eqz v13, :cond_34

    .line 1593
    .line 1594
    move/from16 v23, v3

    .line 1595
    .line 1596
    goto :goto_23

    .line 1597
    :cond_34
    move/from16 v23, v4

    .line 1598
    .line 1599
    :goto_23
    aget v13, v7, v10

    .line 1600
    .line 1601
    invoke-static {v13, v11}, Ljava/lang/Float;->compare(FF)I

    .line 1602
    .line 1603
    .line 1604
    move-result v13

    .line 1605
    if-eqz v13, :cond_35

    .line 1606
    .line 1607
    move/from16 v24, v3

    .line 1608
    .line 1609
    goto :goto_24

    .line 1610
    :cond_35
    move/from16 v24, v4

    .line 1611
    .line 1612
    :goto_24
    const/4 v13, 0x5

    .line 1613
    aget v25, v7, v13

    .line 1614
    .line 1615
    aget v26, v7, v8

    .line 1616
    .line 1617
    move-object/from16 v19, v12

    .line 1618
    .line 1619
    invoke-direct/range {v19 .. v26}, Landroidx/compose/ui/graphics/vector/PathNode$RelativeArcTo;-><init>(FFFZZFF)V

    .line 1620
    .line 1621
    .line 1622
    instance-of v13, v12, Landroidx/compose/ui/graphics/vector/PathNode$MoveTo;

    .line 1623
    .line 1624
    if-eqz v13, :cond_36

    .line 1625
    .line 1626
    if-lez v6, :cond_36

    .line 1627
    .line 1628
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathNode$LineTo;

    .line 1629
    .line 1630
    aget v6, v7, v4

    .line 1631
    .line 1632
    aget v7, v7, v3

    .line 1633
    .line 1634
    invoke-direct {v12, v6, v7}, Landroidx/compose/ui/graphics/vector/PathNode$LineTo;-><init>(FF)V

    .line 1635
    .line 1636
    .line 1637
    goto :goto_25

    .line 1638
    :cond_36
    instance-of v13, v12, Landroidx/compose/ui/graphics/vector/PathNode$RelativeMoveTo;

    .line 1639
    .line 1640
    if-eqz v13, :cond_37

    .line 1641
    .line 1642
    if-lez v6, :cond_37

    .line 1643
    .line 1644
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathNode$RelativeLineTo;

    .line 1645
    .line 1646
    aget v6, v7, v4

    .line 1647
    .line 1648
    aget v7, v7, v3

    .line 1649
    .line 1650
    invoke-direct {v12, v6, v7}, Landroidx/compose/ui/graphics/vector/PathNode$RelativeLineTo;-><init>(FF)V

    .line 1651
    .line 1652
    .line 1653
    :cond_37
    :goto_25
    invoke-interface {v2, v12}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 1654
    .line 1655
    .line 1656
    goto :goto_22

    .line 1657
    :cond_38
    const/16 v2, 0x41

    .line 1658
    .line 1659
    if-ne v0, v2, :cond_3d

    .line 1660
    .line 1661
    new-instance v0, Lkotlin/ranges/IntRange;

    .line 1662
    .line 1663
    array-length v2, v1

    .line 1664
    sub-int/2addr v2, v7

    .line 1665
    invoke-direct {v0, v4, v2}, Lkotlin/ranges/IntRange;-><init>(II)V

    .line 1666
    .line 1667
    .line 1668
    invoke-static {v0, v7}, Lkotlin/ranges/RangesKt;->step(Lkotlin/ranges/IntProgression;I)Lkotlin/ranges/IntProgression;

    .line 1669
    .line 1670
    .line 1671
    move-result-object v0

    .line 1672
    new-instance v2, Ljava/util/ArrayList;

    .line 1673
    .line 1674
    invoke-static {v0, v6}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 1675
    .line 1676
    .line 1677
    move-result v6

    .line 1678
    invoke-direct {v2, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 1679
    .line 1680
    .line 1681
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1682
    .line 1683
    .line 1684
    move-result-object v0

    .line 1685
    :goto_26
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1686
    .line 1687
    .line 1688
    move-result v6

    .line 1689
    if-eqz v6, :cond_5

    .line 1690
    .line 1691
    move-object v6, v0

    .line 1692
    check-cast v6, Lkotlin/collections/IntIterator;

    .line 1693
    .line 1694
    invoke-virtual {v6}, Lkotlin/collections/IntIterator;->nextInt()I

    .line 1695
    .line 1696
    .line 1697
    move-result v6

    .line 1698
    add-int/lit8 v7, v6, 0x7

    .line 1699
    .line 1700
    invoke-static {v1, v6, v7}, Lkotlin/collections/ArraysKt;->copyOfRange([FII)[F

    .line 1701
    .line 1702
    .line 1703
    move-result-object v7

    .line 1704
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathNode$ArcTo;

    .line 1705
    .line 1706
    aget v20, v7, v4

    .line 1707
    .line 1708
    aget v21, v7, v3

    .line 1709
    .line 1710
    aget v22, v7, v5

    .line 1711
    .line 1712
    aget v13, v7, v9

    .line 1713
    .line 1714
    invoke-static {v13, v11}, Ljava/lang/Float;->compare(FF)I

    .line 1715
    .line 1716
    .line 1717
    move-result v13

    .line 1718
    if-eqz v13, :cond_39

    .line 1719
    .line 1720
    move/from16 v23, v3

    .line 1721
    .line 1722
    goto :goto_27

    .line 1723
    :cond_39
    move/from16 v23, v4

    .line 1724
    .line 1725
    :goto_27
    aget v13, v7, v10

    .line 1726
    .line 1727
    invoke-static {v13, v11}, Ljava/lang/Float;->compare(FF)I

    .line 1728
    .line 1729
    .line 1730
    move-result v13

    .line 1731
    if-eqz v13, :cond_3a

    .line 1732
    .line 1733
    move/from16 v24, v3

    .line 1734
    .line 1735
    goto :goto_28

    .line 1736
    :cond_3a
    move/from16 v24, v4

    .line 1737
    .line 1738
    :goto_28
    const/4 v13, 0x5

    .line 1739
    aget v25, v7, v13

    .line 1740
    .line 1741
    aget v26, v7, v8

    .line 1742
    .line 1743
    move-object/from16 v19, v12

    .line 1744
    .line 1745
    invoke-direct/range {v19 .. v26}, Landroidx/compose/ui/graphics/vector/PathNode$ArcTo;-><init>(FFFZZFF)V

    .line 1746
    .line 1747
    .line 1748
    instance-of v14, v12, Landroidx/compose/ui/graphics/vector/PathNode$MoveTo;

    .line 1749
    .line 1750
    if-eqz v14, :cond_3b

    .line 1751
    .line 1752
    if-lez v6, :cond_3b

    .line 1753
    .line 1754
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathNode$LineTo;

    .line 1755
    .line 1756
    aget v6, v7, v4

    .line 1757
    .line 1758
    aget v7, v7, v3

    .line 1759
    .line 1760
    invoke-direct {v12, v6, v7}, Landroidx/compose/ui/graphics/vector/PathNode$LineTo;-><init>(FF)V

    .line 1761
    .line 1762
    .line 1763
    goto :goto_29

    .line 1764
    :cond_3b
    instance-of v14, v12, Landroidx/compose/ui/graphics/vector/PathNode$RelativeMoveTo;

    .line 1765
    .line 1766
    if-eqz v14, :cond_3c

    .line 1767
    .line 1768
    if-lez v6, :cond_3c

    .line 1769
    .line 1770
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathNode$RelativeLineTo;

    .line 1771
    .line 1772
    aget v6, v7, v4

    .line 1773
    .line 1774
    aget v7, v7, v3

    .line 1775
    .line 1776
    invoke-direct {v12, v6, v7}, Landroidx/compose/ui/graphics/vector/PathNode$RelativeLineTo;-><init>(FF)V

    .line 1777
    .line 1778
    .line 1779
    :cond_3c
    :goto_29
    invoke-interface {v2, v12}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 1780
    .line 1781
    .line 1782
    goto :goto_26

    .line 1783
    :goto_2a
    return-object v0

    .line 1784
    :cond_3d
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 1785
    .line 1786
    new-instance v2, Ljava/lang/StringBuilder;

    .line 1787
    .line 1788
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 1789
    .line 1790
    .line 1791
    const-string v3, "Unknown command for: "

    .line 1792
    .line 1793
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1794
    .line 1795
    .line 1796
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 1797
    .line 1798
    .line 1799
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1800
    .line 1801
    .line 1802
    move-result-object v0

    .line 1803
    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 1804
    .line 1805
    .line 1806
    throw v1
.end method
