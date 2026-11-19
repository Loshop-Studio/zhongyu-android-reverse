.class public final synthetic Lcom/zykj/mistake/feature/notebook/detail/k4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr6/c;


# instance fields
.field public final synthetic a:F


# direct methods
.method public synthetic constructor <init>(F)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/zykj/mistake/feature/notebook/detail/k4;->a:F

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 24

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    check-cast v0, Landroidx/compose/ui/graphics/drawscope/DrawScope;

    .line 4
    .line 5
    const-string v1, "$this$drawBehind"

    .line 6
    .line 7
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    move-object/from16 v15, p0

    .line 11
    .line 12
    iget v1, v15, Lcom/zykj/mistake/feature/notebook/detail/k4;->a:F

    .line 13
    .line 14
    invoke-interface {v0, v1}, Landroidx/compose/ui/unit/Density;->toPx-0680j_4(F)F

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    move v3, v1

    .line 19
    sget-wide v1, Lcom/zykj/mistake/feature/notebook/detail/q4;->a:J

    .line 20
    .line 21
    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 22
    .line 23
    .line 24
    move-result v4

    .line 25
    int-to-long v4, v4

    .line 26
    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    int-to-long v6, v3

    .line 31
    const/16 v3, 0x20

    .line 32
    .line 33
    shl-long v3, v4, v3

    .line 34
    .line 35
    const-wide v8, 0xffffffffL

    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    and-long v5, v6, v8

    .line 41
    .line 42
    or-long/2addr v3, v5

    .line 43
    invoke-static {v3, v4}, Landroidx/compose/ui/geometry/CornerRadius;->constructor-impl(J)J

    .line 44
    .line 45
    .line 46
    move-result-wide v7

    .line 47
    new-instance v16, Landroidx/compose/ui/graphics/drawscope/Stroke;

    .line 48
    .line 49
    const/4 v3, 0x1

    .line 50
    int-to-float v4, v3

    .line 51
    invoke-static {v4}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 52
    .line 53
    .line 54
    move-result v4

    .line 55
    invoke-interface {v0, v4}, Landroidx/compose/ui/unit/Density;->toPx-0680j_4(F)F

    .line 56
    .line 57
    .line 58
    move-result v17

    .line 59
    sget-object v4, Landroidx/compose/ui/graphics/PathEffect;->Companion:Landroidx/compose/ui/graphics/PathEffect$Companion;

    .line 60
    .line 61
    const/4 v5, 0x5

    .line 62
    int-to-float v5, v5

    .line 63
    invoke-static {v5}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 64
    .line 65
    .line 66
    move-result v6

    .line 67
    invoke-interface {v0, v6}, Landroidx/compose/ui/unit/Density;->toPx-0680j_4(F)F

    .line 68
    .line 69
    .line 70
    move-result v6

    .line 71
    invoke-static {v5}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 72
    .line 73
    .line 74
    move-result v5

    .line 75
    invoke-interface {v0, v5}, Landroidx/compose/ui/unit/Density;->toPx-0680j_4(F)F

    .line 76
    .line 77
    .line 78
    move-result v5

    .line 79
    const/4 v9, 0x2

    .line 80
    new-array v10, v9, [F

    .line 81
    .line 82
    const/4 v11, 0x0

    .line 83
    aput v6, v10, v11

    .line 84
    .line 85
    aput v5, v10, v3

    .line 86
    .line 87
    const/4 v3, 0x0

    .line 88
    const/4 v5, 0x0

    .line 89
    invoke-static {v4, v10, v3, v9, v5}, Landroidx/compose/ui/graphics/PathEffect$Companion;->dashPathEffect$default(Landroidx/compose/ui/graphics/PathEffect$Companion;[FFILjava/lang/Object;)Landroidx/compose/ui/graphics/PathEffect;

    .line 90
    .line 91
    .line 92
    move-result-object v21

    .line 93
    const/16 v22, 0xe

    .line 94
    .line 95
    const/16 v23, 0x0

    .line 96
    .line 97
    const/16 v18, 0x0

    .line 98
    .line 99
    const/16 v19, 0x0

    .line 100
    .line 101
    const/16 v20, 0x0

    .line 102
    .line 103
    invoke-direct/range {v16 .. v23}, Landroidx/compose/ui/graphics/drawscope/Stroke;-><init>(FFIILandroidx/compose/ui/graphics/PathEffect;ILkotlin/jvm/internal/e;)V

    .line 104
    .line 105
    .line 106
    const/16 v13, 0xe6

    .line 107
    .line 108
    const/4 v14, 0x0

    .line 109
    const-wide/16 v3, 0x0

    .line 110
    .line 111
    const-wide/16 v5, 0x0

    .line 112
    .line 113
    const/4 v10, 0x0

    .line 114
    const/4 v11, 0x0

    .line 115
    const/4 v12, 0x0

    .line 116
    move-object/from16 v9, v16

    .line 117
    .line 118
    invoke-static/range {v0 .. v14}, Landroidx/compose/ui/graphics/drawscope/DrawScope;->drawRoundRect-u-Aw5IA$default(Landroidx/compose/ui/graphics/drawscope/DrawScope;JJJJLandroidx/compose/ui/graphics/drawscope/DrawStyle;FLandroidx/compose/ui/graphics/ColorFilter;IILjava/lang/Object;)V

    .line 119
    .line 120
    .line 121
    sget-object v0, Ld6/s;->a:Ld6/s;

    .line 122
    .line 123
    return-object v0
.end method
