.class public final Landroidx/compose/material/icons/twotone/ReplayKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _replay:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getReplay(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/ReplayKt;->_replay:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    return-object v0

    .line 9
    :cond_0
    new-instance v1, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 10
    .line 11
    const/high16 v0, 0x41c00000    # 24.0f

    .line 12
    .line 13
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 18
    .line 19
    .line 20
    move-result v4

    .line 21
    const/16 v11, 0x60

    .line 22
    .line 23
    const/4 v12, 0x0

    .line 24
    const-string v2, "TwoTone.Replay"

    .line 25
    .line 26
    const/high16 v5, 0x41c00000    # 24.0f

    .line 27
    .line 28
    const/high16 v6, 0x41c00000    # 24.0f

    .line 29
    .line 30
    const-wide/16 v7, 0x0

    .line 31
    .line 32
    const/4 v9, 0x0

    .line 33
    const/4 v10, 0x0

    .line 34
    invoke-direct/range {v1 .. v12}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;-><init>(Ljava/lang/String;FFFFJIZILkotlin/jvm/internal/n;)V

    .line 35
    .line 36
    .line 37
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 42
    .line 43
    sget-object v0, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    .line 44
    .line 45
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 46
    .line 47
    .line 48
    move-result-wide v6

    .line 49
    const/4 v0, 0x0

    .line 50
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 51
    .line 52
    .line 53
    sget-object v0, Landroidx/compose/ui/graphics/StrokeCap;->Companion:Landroidx/compose/ui/graphics/StrokeCap$Companion;

    .line 54
    .line 55
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 56
    .line 57
    .line 58
    move-result v10

    .line 59
    sget-object v0, Landroidx/compose/ui/graphics/StrokeJoin;->Companion:Landroidx/compose/ui/graphics/StrokeJoin$Companion;

    .line 60
    .line 61
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 62
    .line 63
    .line 64
    move-result v11

    .line 65
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 66
    .line 67
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 68
    .line 69
    .line 70
    const/high16 v0, 0x40e00000    # 7.0f

    .line 71
    .line 72
    const/high16 v2, 0x40c00000    # 6.0f

    .line 73
    .line 74
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v4, 0x40a00000    # 5.0f

    .line 78
    .line 79
    invoke-virtual {v12, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 80
    .line 81
    .line 82
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 83
    .line 84
    .line 85
    const/high16 v17, 0x40c00000    # 6.0f

    .line 86
    .line 87
    const/high16 v18, 0x40c00000    # 6.0f

    .line 88
    .line 89
    const v13, 0x4053d70a    # 3.31f

    .line 90
    .line 91
    .line 92
    const/4 v14, 0x0

    .line 93
    const/high16 v15, 0x40c00000    # 6.0f

    .line 94
    .line 95
    const v16, 0x402c28f6    # 2.69f

    .line 96
    .line 97
    .line 98
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 99
    .line 100
    .line 101
    const v4, -0x3fd3d70a    # -2.69f

    .line 102
    .line 103
    .line 104
    const/high16 v6, -0x3f400000    # -6.0f

    .line 105
    .line 106
    invoke-virtual {v12, v4, v2, v6, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 107
    .line 108
    .line 109
    invoke-virtual {v12, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 110
    .line 111
    .line 112
    const/high16 v4, 0x40800000    # 4.0f

    .line 113
    .line 114
    invoke-virtual {v12, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 115
    .line 116
    .line 117
    const/high16 v17, 0x41000000    # 8.0f

    .line 118
    .line 119
    const/high16 v18, 0x41000000    # 8.0f

    .line 120
    .line 121
    const/4 v13, 0x0

    .line 122
    const v14, 0x408d70a4    # 4.42f

    .line 123
    .line 124
    .line 125
    const v15, 0x40651eb8    # 3.58f

    .line 126
    .line 127
    .line 128
    const/high16 v16, 0x41000000    # 8.0f

    .line 129
    .line 130
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 131
    .line 132
    .line 133
    const v4, -0x3f9ae148    # -3.58f

    .line 134
    .line 135
    .line 136
    const/high16 v6, -0x3f000000    # -8.0f

    .line 137
    .line 138
    const/high16 v7, 0x41000000    # 8.0f

    .line 139
    .line 140
    invoke-virtual {v12, v7, v4, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 141
    .line 142
    .line 143
    const/high16 v17, -0x3f000000    # -8.0f

    .line 144
    .line 145
    const/high16 v18, -0x3f000000    # -8.0f

    .line 146
    .line 147
    const v14, -0x3f728f5c    # -4.42f

    .line 148
    .line 149
    .line 150
    const v15, -0x3f9ae148    # -3.58f

    .line 151
    .line 152
    .line 153
    const/high16 v16, -0x3f000000    # -8.0f

    .line 154
    .line 155
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 156
    .line 157
    .line 158
    const/high16 v4, 0x3f800000    # 1.0f

    .line 159
    .line 160
    invoke-virtual {v12, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 161
    .line 162
    .line 163
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 164
    .line 165
    .line 166
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 167
    .line 168
    .line 169
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 170
    .line 171
    .line 172
    move-result-object v2

    .line 173
    const/16 v16, 0x3800

    .line 174
    .line 175
    const/16 v17, 0x0

    .line 176
    .line 177
    const-string v4, ""

    .line 178
    .line 179
    const/high16 v6, 0x3f800000    # 1.0f

    .line 180
    .line 181
    const/4 v7, 0x0

    .line 182
    const/high16 v8, 0x3f800000    # 1.0f

    .line 183
    .line 184
    const/high16 v9, 0x3f800000    # 1.0f

    .line 185
    .line 186
    const/high16 v12, 0x3f800000    # 1.0f

    .line 187
    .line 188
    const/4 v14, 0x0

    .line 189
    const/4 v15, 0x0

    .line 190
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 191
    .line 192
    .line 193
    move-result-object v0

    .line 194
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 195
    .line 196
    .line 197
    move-result-object v0

    .line 198
    sput-object v0, Landroidx/compose/material/icons/twotone/ReplayKt;->_replay:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 199
    .line 200
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 201
    .line 202
    .line 203
    return-object v0
.end method
