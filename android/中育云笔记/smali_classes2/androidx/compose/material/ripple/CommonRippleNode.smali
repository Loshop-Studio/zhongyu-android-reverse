.class public final Landroidx/compose/material/ripple/CommonRippleNode;
.super Landroidx/compose/material/ripple/RippleNode;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private final ripples:Landroidx/collection/MutableScatterMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/collection/MutableScatterMap<",
            "Landroidx/compose/foundation/interaction/PressInteraction$Press;",
            "Landroidx/compose/material/ripple/RippleAnimation;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>(Landroidx/compose/foundation/interaction/InteractionSource;ZFLandroidx/compose/ui/graphics/ColorProducer;Lhd/a;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/foundation/interaction/InteractionSource;",
            "ZF",
            "Landroidx/compose/ui/graphics/ColorProducer;",
            "Lhd/a;",
            ")V"
        }
    .end annotation

    const/4 v6, 0x0

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move v3, p3

    move-object v4, p4

    move-object v5, p5

    .line 2
    invoke-direct/range {v0 .. v6}, Landroidx/compose/material/ripple/RippleNode;-><init>(Landroidx/compose/foundation/interaction/InteractionSource;ZFLandroidx/compose/ui/graphics/ColorProducer;Lhd/a;Lkotlin/jvm/internal/n;)V

    .line 3
    new-instance p1, Landroidx/collection/MutableScatterMap;

    const/4 p2, 0x1

    const/4 p3, 0x0

    const/4 p4, 0x0

    invoke-direct {p1, p4, p2, p3}, Landroidx/collection/MutableScatterMap;-><init>(IILkotlin/jvm/internal/n;)V

    iput-object p1, v0, Landroidx/compose/material/ripple/CommonRippleNode;->ripples:Landroidx/collection/MutableScatterMap;

    return-void
.end method

.method public synthetic constructor <init>(Landroidx/compose/foundation/interaction/InteractionSource;ZFLandroidx/compose/ui/graphics/ColorProducer;Lhd/a;Lkotlin/jvm/internal/n;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p5}, Landroidx/compose/material/ripple/CommonRippleNode;-><init>(Landroidx/compose/foundation/interaction/InteractionSource;ZFLandroidx/compose/ui/graphics/ColorProducer;Lhd/a;)V

    return-void
.end method

.method public static final synthetic access$getRipples$p(Landroidx/compose/material/ripple/CommonRippleNode;)Landroidx/collection/MutableScatterMap;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/compose/material/ripple/CommonRippleNode;->ripples:Landroidx/collection/MutableScatterMap;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public addRipple-12SF9DM(Landroidx/compose/foundation/interaction/PressInteraction$Press;JF)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v0, Landroidx/compose/material/ripple/CommonRippleNode;->ripples:Landroidx/collection/MutableScatterMap;

    .line 6
    .line 7
    iget-object v3, v2, Landroidx/collection/ScatterMap;->keys:[Ljava/lang/Object;

    .line 8
    .line 9
    iget-object v4, v2, Landroidx/collection/ScatterMap;->values:[Ljava/lang/Object;

    .line 10
    .line 11
    iget-object v2, v2, Landroidx/collection/ScatterMap;->metadata:[J

    .line 12
    .line 13
    array-length v5, v2

    .line 14
    add-int/lit8 v5, v5, -0x2

    .line 15
    .line 16
    if-ltz v5, :cond_3

    .line 17
    .line 18
    const/4 v6, 0x0

    .line 19
    move v7, v6

    .line 20
    :goto_0
    aget-wide v8, v2, v7

    .line 21
    .line 22
    not-long v10, v8

    .line 23
    const/4 v12, 0x7

    .line 24
    shl-long/2addr v10, v12

    .line 25
    and-long/2addr v10, v8

    .line 26
    const-wide v12, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    and-long/2addr v10, v12

    .line 32
    cmp-long v10, v10, v12

    .line 33
    .line 34
    if-eqz v10, :cond_2

    .line 35
    .line 36
    sub-int v10, v7, v5

    .line 37
    .line 38
    not-int v10, v10

    .line 39
    ushr-int/lit8 v10, v10, 0x1f

    .line 40
    .line 41
    const/16 v11, 0x8

    .line 42
    .line 43
    rsub-int/lit8 v10, v10, 0x8

    .line 44
    .line 45
    move v12, v6

    .line 46
    :goto_1
    if-ge v12, v10, :cond_1

    .line 47
    .line 48
    const-wide/16 v13, 0xff

    .line 49
    .line 50
    and-long/2addr v13, v8

    .line 51
    const-wide/16 v15, 0x80

    .line 52
    .line 53
    cmp-long v13, v13, v15

    .line 54
    .line 55
    if-gez v13, :cond_0

    .line 56
    .line 57
    shl-int/lit8 v13, v7, 0x3

    .line 58
    .line 59
    add-int/2addr v13, v12

    .line 60
    aget-object v14, v3, v13

    .line 61
    .line 62
    aget-object v13, v4, v13

    .line 63
    .line 64
    check-cast v13, Landroidx/compose/material/ripple/RippleAnimation;

    .line 65
    .line 66
    check-cast v14, Landroidx/compose/foundation/interaction/PressInteraction$Press;

    .line 67
    .line 68
    invoke-virtual {v13}, Landroidx/compose/material/ripple/RippleAnimation;->finish()V

    .line 69
    .line 70
    .line 71
    :cond_0
    shr-long/2addr v8, v11

    .line 72
    add-int/lit8 v12, v12, 0x1

    .line 73
    .line 74
    goto :goto_1

    .line 75
    :cond_1
    if-ne v10, v11, :cond_3

    .line 76
    .line 77
    :cond_2
    if-eq v7, v5, :cond_3

    .line 78
    .line 79
    add-int/lit8 v7, v7, 0x1

    .line 80
    .line 81
    goto :goto_0

    .line 82
    :cond_3
    invoke-virtual {v0}, Landroidx/compose/material/ripple/RippleNode;->getBounded()Z

    .line 83
    .line 84
    .line 85
    move-result v2

    .line 86
    const/4 v3, 0x0

    .line 87
    if-eqz v2, :cond_4

    .line 88
    .line 89
    invoke-virtual {v1}, Landroidx/compose/foundation/interaction/PressInteraction$Press;->getPressPosition-F1C5BW0()J

    .line 90
    .line 91
    .line 92
    move-result-wide v4

    .line 93
    invoke-static {v4, v5}, Landroidx/compose/ui/geometry/Offset;->box-impl(J)Landroidx/compose/ui/geometry/Offset;

    .line 94
    .line 95
    .line 96
    move-result-object v2

    .line 97
    goto :goto_2

    .line 98
    :cond_4
    move-object v2, v3

    .line 99
    :goto_2
    new-instance v4, Landroidx/compose/material/ripple/RippleAnimation;

    .line 100
    .line 101
    invoke-virtual {v0}, Landroidx/compose/material/ripple/RippleNode;->getBounded()Z

    .line 102
    .line 103
    .line 104
    move-result v5

    .line 105
    move/from16 v6, p4

    .line 106
    .line 107
    invoke-direct {v4, v2, v6, v5, v3}, Landroidx/compose/material/ripple/RippleAnimation;-><init>(Landroidx/compose/ui/geometry/Offset;FZLkotlin/jvm/internal/n;)V

    .line 108
    .line 109
    .line 110
    iget-object v2, v0, Landroidx/compose/material/ripple/CommonRippleNode;->ripples:Landroidx/collection/MutableScatterMap;

    .line 111
    .line 112
    invoke-virtual {v2, v1, v4}, Landroidx/collection/MutableScatterMap;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {v0}, Landroidx/compose/ui/Modifier$Node;->getCoroutineScope()Lsd/i0;

    .line 116
    .line 117
    .line 118
    move-result-object v5

    .line 119
    new-instance v8, Landroidx/compose/material/ripple/CommonRippleNode$addRipple$2;

    .line 120
    .line 121
    invoke-direct {v8, v4, v0, v1, v3}, Landroidx/compose/material/ripple/CommonRippleNode$addRipple$2;-><init>(Landroidx/compose/material/ripple/RippleAnimation;Landroidx/compose/material/ripple/CommonRippleNode;Landroidx/compose/foundation/interaction/PressInteraction$Press;Lvc/c;)V

    .line 122
    .line 123
    .line 124
    const/4 v9, 0x3

    .line 125
    const/4 v10, 0x0

    .line 126
    const/4 v6, 0x0

    .line 127
    const/4 v7, 0x0

    .line 128
    invoke-static/range {v5 .. v10}, Lsd/f;->d(Lsd/i0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lhd/p;ILjava/lang/Object;)Lkotlinx/coroutines/g;

    .line 129
    .line 130
    .line 131
    invoke-static {v0}, Landroidx/compose/ui/node/DrawModifierNodeKt;->invalidateDraw(Landroidx/compose/ui/node/DrawModifierNode;)V

    .line 132
    .line 133
    .line 134
    return-void
.end method

.method public drawRipples(Landroidx/compose/ui/graphics/drawscope/DrawScope;)V
    .locals 21

    .line 1
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/material/ripple/RippleNode;->getRippleAlpha()Lhd/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0}, Lhd/a;->invoke()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Landroidx/compose/material/ripple/RippleAlpha;

    .line 10
    .line 11
    invoke-virtual {v0}, Landroidx/compose/material/ripple/RippleAlpha;->getPressedAlpha()F

    .line 12
    .line 13
    .line 14
    move-result v3

    .line 15
    const/4 v0, 0x0

    .line 16
    cmpg-float v0, v3, v0

    .line 17
    .line 18
    if-nez v0, :cond_0

    .line 19
    .line 20
    return-void

    .line 21
    :cond_0
    move-object/from16 v0, p0

    .line 22
    .line 23
    iget-object v1, v0, Landroidx/compose/material/ripple/CommonRippleNode;->ripples:Landroidx/collection/MutableScatterMap;

    .line 24
    .line 25
    iget-object v9, v1, Landroidx/collection/ScatterMap;->keys:[Ljava/lang/Object;

    .line 26
    .line 27
    iget-object v10, v1, Landroidx/collection/ScatterMap;->values:[Ljava/lang/Object;

    .line 28
    .line 29
    iget-object v11, v1, Landroidx/collection/ScatterMap;->metadata:[J

    .line 30
    .line 31
    array-length v1, v11

    .line 32
    add-int/lit8 v12, v1, -0x2

    .line 33
    .line 34
    if-ltz v12, :cond_4

    .line 35
    .line 36
    const/4 v14, 0x0

    .line 37
    :goto_0
    aget-wide v1, v11, v14

    .line 38
    .line 39
    not-long v4, v1

    .line 40
    const/4 v6, 0x7

    .line 41
    shl-long/2addr v4, v6

    .line 42
    and-long/2addr v4, v1

    .line 43
    const-wide v6, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    and-long/2addr v4, v6

    .line 49
    cmp-long v4, v4, v6

    .line 50
    .line 51
    if-eqz v4, :cond_3

    .line 52
    .line 53
    sub-int v4, v14, v12

    .line 54
    .line 55
    not-int v4, v4

    .line 56
    ushr-int/lit8 v4, v4, 0x1f

    .line 57
    .line 58
    const/16 v15, 0x8

    .line 59
    .line 60
    rsub-int/lit8 v4, v4, 0x8

    .line 61
    .line 62
    move-wide/from16 v16, v1

    .line 63
    .line 64
    const/4 v1, 0x0

    .line 65
    :goto_1
    if-ge v1, v4, :cond_2

    .line 66
    .line 67
    const-wide/16 v5, 0xff

    .line 68
    .line 69
    and-long v5, v16, v5

    .line 70
    .line 71
    const-wide/16 v7, 0x80

    .line 72
    .line 73
    cmp-long v2, v5, v7

    .line 74
    .line 75
    if-gez v2, :cond_1

    .line 76
    .line 77
    shl-int/lit8 v2, v14, 0x3

    .line 78
    .line 79
    add-int/2addr v2, v1

    .line 80
    aget-object v5, v9, v2

    .line 81
    .line 82
    aget-object v2, v10, v2

    .line 83
    .line 84
    check-cast v2, Landroidx/compose/material/ripple/RippleAnimation;

    .line 85
    .line 86
    check-cast v5, Landroidx/compose/foundation/interaction/PressInteraction$Press;

    .line 87
    .line 88
    move v5, v1

    .line 89
    move-object v6, v2

    .line 90
    invoke-virtual {v0}, Landroidx/compose/material/ripple/RippleNode;->getRippleColor-0d7_KjU()J

    .line 91
    .line 92
    .line 93
    move-result-wide v1

    .line 94
    const/16 v7, 0xe

    .line 95
    .line 96
    const/4 v8, 0x0

    .line 97
    move/from16 v18, v4

    .line 98
    .line 99
    const/4 v4, 0x0

    .line 100
    move/from16 v19, v5

    .line 101
    .line 102
    const/4 v5, 0x0

    .line 103
    move-object/from16 v20, v6

    .line 104
    .line 105
    const/4 v6, 0x0

    .line 106
    move/from16 v13, v18

    .line 107
    .line 108
    move/from16 v18, v15

    .line 109
    .line 110
    move-object/from16 v15, v20

    .line 111
    .line 112
    invoke-static/range {v1 .. v8}, Landroidx/compose/ui/graphics/Color;->copy-wmQWz5c$default(JFFFFILjava/lang/Object;)J

    .line 113
    .line 114
    .line 115
    move-result-wide v1

    .line 116
    move v4, v3

    .line 117
    move-object/from16 v3, p1

    .line 118
    .line 119
    invoke-virtual {v15, v3, v1, v2}, Landroidx/compose/material/ripple/RippleAnimation;->draw-4WTKRHQ(Landroidx/compose/ui/graphics/drawscope/DrawScope;J)V

    .line 120
    .line 121
    .line 122
    goto :goto_2

    .line 123
    :cond_1
    move/from16 v19, v1

    .line 124
    .line 125
    move v13, v4

    .line 126
    move/from16 v18, v15

    .line 127
    .line 128
    move v4, v3

    .line 129
    move-object/from16 v3, p1

    .line 130
    .line 131
    :goto_2
    shr-long v16, v16, v18

    .line 132
    .line 133
    add-int/lit8 v1, v19, 0x1

    .line 134
    .line 135
    move v3, v4

    .line 136
    move v4, v13

    .line 137
    move/from16 v15, v18

    .line 138
    .line 139
    goto :goto_1

    .line 140
    :cond_2
    move v13, v4

    .line 141
    move v1, v15

    .line 142
    move v4, v3

    .line 143
    move-object/from16 v3, p1

    .line 144
    .line 145
    if-ne v13, v1, :cond_4

    .line 146
    .line 147
    goto :goto_3

    .line 148
    :cond_3
    move v4, v3

    .line 149
    move-object/from16 v3, p1

    .line 150
    .line 151
    :goto_3
    if-eq v14, v12, :cond_4

    .line 152
    .line 153
    add-int/lit8 v14, v14, 0x1

    .line 154
    .line 155
    move v3, v4

    .line 156
    goto :goto_0

    .line 157
    :cond_4
    return-void
.end method

.method public onDetach()V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/material/ripple/CommonRippleNode;->ripples:Landroidx/collection/MutableScatterMap;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/collection/MutableScatterMap;->clear()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public removeRipple(Landroidx/compose/foundation/interaction/PressInteraction$Press;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/material/ripple/CommonRippleNode;->ripples:Landroidx/collection/MutableScatterMap;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroidx/collection/ScatterMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Landroidx/compose/material/ripple/RippleAnimation;

    .line 8
    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    invoke-virtual {p1}, Landroidx/compose/material/ripple/RippleAnimation;->finish()V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
.end method
