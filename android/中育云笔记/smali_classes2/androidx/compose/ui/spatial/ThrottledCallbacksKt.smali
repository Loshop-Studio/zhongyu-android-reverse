.class public final Landroidx/compose/ui/spatial/ThrottledCallbacksKt;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final rectInfoFor-Q-MZNJw(Landroidx/compose/ui/node/DelegatableNode;JJJJ[F)Landroidx/compose/ui/spatial/RelativeLayoutBounds;
    .locals 15

    .line 1
    const/4 v0, 0x2

    .line 2
    invoke-static {v0}, Landroidx/compose/ui/node/NodeKind;->constructor-impl(I)I

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    invoke-static {p0, v0}, Landroidx/compose/ui/node/DelegatableNodeKt;->requireCoordinator-64DMado(Landroidx/compose/ui/node/DelegatableNode;I)Landroidx/compose/ui/node/NodeCoordinator;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-static {p0}, Landroidx/compose/ui/node/DelegatableNodeKt;->requireLayoutNode(Landroidx/compose/ui/node/DelegatableNode;)Landroidx/compose/ui/node/LayoutNode;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {v1}, Landroidx/compose/ui/node/LayoutNode;->isPlaced()Z

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    if-nez v2, :cond_0

    .line 19
    .line 20
    const/4 v0, 0x0

    .line 21
    return-object v0

    .line 22
    :cond_0
    invoke-virtual {v1}, Landroidx/compose/ui/node/LayoutNode;->getOuterCoordinator$ui_release()Landroidx/compose/ui/node/NodeCoordinator;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    if-eq v2, v0, :cond_1

    .line 27
    .line 28
    invoke-static/range {p1 .. p2}, Landroidx/compose/ui/unit/IntOffset;->constructor-impl(J)J

    .line 29
    .line 30
    .line 31
    move-result-wide v2

    .line 32
    invoke-static {v2, v3}, Landroidx/compose/ui/unit/IntOffset;->getX-impl(J)I

    .line 33
    .line 34
    .line 35
    move-result v4

    .line 36
    int-to-float v4, v4

    .line 37
    invoke-static {v2, v3}, Landroidx/compose/ui/unit/IntOffset;->getY-impl(J)I

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    int-to-float v2, v2

    .line 42
    invoke-static {v4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 43
    .line 44
    .line 45
    move-result v3

    .line 46
    int-to-long v3, v3

    .line 47
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 48
    .line 49
    .line 50
    move-result v2

    .line 51
    int-to-long v5, v2

    .line 52
    const/16 v2, 0x20

    .line 53
    .line 54
    shl-long/2addr v3, v2

    .line 55
    const-wide v7, 0xffffffffL

    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    and-long/2addr v5, v7

    .line 61
    or-long/2addr v3, v5

    .line 62
    invoke-static {v3, v4}, Landroidx/compose/ui/geometry/Offset;->constructor-impl(J)J

    .line 63
    .line 64
    .line 65
    move-result-wide v3

    .line 66
    invoke-virtual {v0}, Landroidx/compose/ui/node/NodeCoordinator;->getCoordinates()Landroidx/compose/ui/layout/LayoutCoordinates;

    .line 67
    .line 68
    .line 69
    move-result-object v5

    .line 70
    invoke-interface {v5}, Landroidx/compose/ui/layout/LayoutCoordinates;->getSize-YbymL2g()J

    .line 71
    .line 72
    .line 73
    move-result-wide v5

    .line 74
    invoke-virtual {v1}, Landroidx/compose/ui/node/LayoutNode;->getOuterCoordinator$ui_release()Landroidx/compose/ui/node/NodeCoordinator;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    invoke-virtual {v1}, Landroidx/compose/ui/node/NodeCoordinator;->getCoordinates()Landroidx/compose/ui/layout/LayoutCoordinates;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    invoke-interface {v1, v0, v3, v4}, Landroidx/compose/ui/layout/LayoutCoordinates;->localPositionOf-R5De75A(Landroidx/compose/ui/layout/LayoutCoordinates;J)J

    .line 83
    .line 84
    .line 85
    move-result-wide v0

    .line 86
    invoke-static {v0, v1}, Landroidx/compose/ui/unit/IntOffsetKt;->round-k-4lQ0M(J)J

    .line 87
    .line 88
    .line 89
    move-result-wide v0

    .line 90
    move-wide v13, v0

    .line 91
    move v0, v2

    .line 92
    move-wide v2, v13

    .line 93
    new-instance v1, Landroidx/compose/ui/spatial/RelativeLayoutBounds;

    .line 94
    .line 95
    invoke-static {v2, v3}, Landroidx/compose/ui/unit/IntOffset;->getX-impl(J)I

    .line 96
    .line 97
    .line 98
    move-result v4

    .line 99
    shr-long v9, v5, v0

    .line 100
    .line 101
    long-to-int v9, v9

    .line 102
    add-int/2addr v4, v9

    .line 103
    invoke-static {v2, v3}, Landroidx/compose/ui/unit/IntOffset;->getY-impl(J)I

    .line 104
    .line 105
    .line 106
    move-result v9

    .line 107
    and-long/2addr v5, v7

    .line 108
    long-to-int v5, v5

    .line 109
    add-int/2addr v9, v5

    .line 110
    int-to-long v4, v4

    .line 111
    shl-long/2addr v4, v0

    .line 112
    int-to-long v9, v9

    .line 113
    and-long v6, v9, v7

    .line 114
    .line 115
    or-long/2addr v4, v6

    .line 116
    invoke-static {v4, v5}, Landroidx/compose/ui/unit/IntOffset;->constructor-impl(J)J

    .line 117
    .line 118
    .line 119
    move-result-wide v4

    .line 120
    const/4 v12, 0x0

    .line 121
    move-object v11, p0

    .line 122
    move-wide/from16 v6, p5

    .line 123
    .line 124
    move-wide/from16 v8, p7

    .line 125
    .line 126
    move-object/from16 v10, p9

    .line 127
    .line 128
    invoke-direct/range {v1 .. v12}, Landroidx/compose/ui/spatial/RelativeLayoutBounds;-><init>(JJJJ[FLandroidx/compose/ui/node/DelegatableNode;Lkotlin/jvm/internal/n;)V

    .line 129
    .line 130
    .line 131
    return-object v1

    .line 132
    :cond_1
    new-instance v1, Landroidx/compose/ui/spatial/RelativeLayoutBounds;

    .line 133
    .line 134
    const/4 v12, 0x0

    .line 135
    move-object v11, p0

    .line 136
    move-wide/from16 v2, p1

    .line 137
    .line 138
    move-wide/from16 v4, p3

    .line 139
    .line 140
    move-wide/from16 v6, p5

    .line 141
    .line 142
    move-wide/from16 v8, p7

    .line 143
    .line 144
    move-object/from16 v10, p9

    .line 145
    .line 146
    invoke-direct/range {v1 .. v12}, Landroidx/compose/ui/spatial/RelativeLayoutBounds;-><init>(JJJJ[FLandroidx/compose/ui/node/DelegatableNode;Lkotlin/jvm/internal/n;)V

    .line 147
    .line 148
    .line 149
    return-object v1
.end method
