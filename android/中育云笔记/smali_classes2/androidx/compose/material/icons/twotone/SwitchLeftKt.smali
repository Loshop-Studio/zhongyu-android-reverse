.class public final Landroidx/compose/material/icons/twotone/SwitchLeftKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _switchLeft:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getSwitchLeft(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 24

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/SwitchLeftKt;->_switchLeft:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.SwitchLeft"

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
    const/4 v2, 0x0

    .line 50
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 51
    .line 52
    .line 53
    sget-object v18, Landroidx/compose/ui/graphics/StrokeCap;->Companion:Landroidx/compose/ui/graphics/StrokeCap$Companion;

    .line 54
    .line 55
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 56
    .line 57
    .line 58
    move-result v10

    .line 59
    sget-object v19, Landroidx/compose/ui/graphics/StrokeJoin;->Companion:Landroidx/compose/ui/graphics/StrokeJoin$Companion;

    .line 60
    .line 61
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 62
    .line 63
    .line 64
    move-result v11

    .line 65
    new-instance v4, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 66
    .line 67
    invoke-direct {v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 68
    .line 69
    .line 70
    const/high16 v6, 0x41080000    # 8.5f

    .line 71
    .line 72
    const v7, 0x4109eb85    # 8.62f

    .line 73
    .line 74
    .line 75
    invoke-virtual {v4, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    const/4 v8, 0x0

    .line 79
    const v9, 0x40d851ec    # 6.76f

    .line 80
    .line 81
    .line 82
    invoke-virtual {v4, v8, v9}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 83
    .line 84
    .line 85
    const v8, -0x3fa7ae14    # -3.38f

    .line 86
    .line 87
    .line 88
    invoke-virtual {v4, v8, v8}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 89
    .line 90
    .line 91
    const v12, 0x405851ec    # 3.38f

    .line 92
    .line 93
    .line 94
    invoke-virtual {v4, v12, v8}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 95
    .line 96
    .line 97
    invoke-virtual {v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 98
    .line 99
    .line 100
    move-result-object v4

    .line 101
    const/16 v16, 0x3800

    .line 102
    .line 103
    const/16 v17, 0x0

    .line 104
    .line 105
    move-object v8, v2

    .line 106
    move-object v2, v4

    .line 107
    const-string v4, ""

    .line 108
    .line 109
    move v12, v6

    .line 110
    const v6, 0x3e99999a    # 0.3f

    .line 111
    .line 112
    .line 113
    move v13, v7

    .line 114
    const/4 v7, 0x0

    .line 115
    move-object v14, v8

    .line 116
    const v8, 0x3e99999a    # 0.3f

    .line 117
    .line 118
    .line 119
    move v15, v9

    .line 120
    const/high16 v9, 0x3f800000    # 1.0f

    .line 121
    .line 122
    move/from16 v20, v12

    .line 123
    .line 124
    const/high16 v12, 0x3f800000    # 1.0f

    .line 125
    .line 126
    move/from16 v21, v13

    .line 127
    .line 128
    const/4 v13, 0x0

    .line 129
    move-object/from16 v22, v14

    .line 130
    .line 131
    const/4 v14, 0x0

    .line 132
    move/from16 v23, v15

    .line 133
    .line 134
    const/4 v15, 0x0

    .line 135
    move-object/from16 p0, v0

    .line 136
    .line 137
    move-object/from16 v0, v22

    .line 138
    .line 139
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 140
    .line 141
    .line 142
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 143
    .line 144
    .line 145
    move-result v3

    .line 146
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 147
    .line 148
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 149
    .line 150
    .line 151
    move-result-wide v6

    .line 152
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 153
    .line 154
    .line 155
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 156
    .line 157
    .line 158
    move-result v10

    .line 159
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 160
    .line 161
    .line 162
    move-result v11

    .line 163
    new-instance v0, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 164
    .line 165
    invoke-direct {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 166
    .line 167
    .line 168
    const/high16 v12, 0x41080000    # 8.5f

    .line 169
    .line 170
    const v13, 0x4109eb85    # 8.62f

    .line 171
    .line 172
    .line 173
    invoke-virtual {v0, v12, v13}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 174
    .line 175
    .line 176
    const v15, 0x40d851ec    # 6.76f

    .line 177
    .line 178
    .line 179
    invoke-virtual {v0, v15}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 180
    .line 181
    .line 182
    const v2, 0x40a3d70a    # 5.12f

    .line 183
    .line 184
    .line 185
    const/high16 v4, 0x41400000    # 12.0f

    .line 186
    .line 187
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 188
    .line 189
    .line 190
    invoke-virtual {v0, v12, v13}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 191
    .line 192
    .line 193
    const/high16 v2, 0x41200000    # 10.0f

    .line 194
    .line 195
    const/high16 v4, 0x40a00000    # 5.0f

    .line 196
    .line 197
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 198
    .line 199
    .line 200
    const/high16 v6, -0x3f200000    # -7.0f

    .line 201
    .line 202
    const/high16 v7, 0x40e00000    # 7.0f

    .line 203
    .line 204
    invoke-virtual {v0, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 205
    .line 206
    .line 207
    invoke-virtual {v0, v7, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 208
    .line 209
    .line 210
    invoke-virtual {v0, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 211
    .line 212
    .line 213
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 214
    .line 215
    .line 216
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 217
    .line 218
    .line 219
    const/high16 v2, 0x41600000    # 14.0f

    .line 220
    .line 221
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 222
    .line 223
    .line 224
    invoke-virtual {v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 225
    .line 226
    .line 227
    invoke-virtual {v0, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 228
    .line 229
    .line 230
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 231
    .line 232
    .line 233
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 234
    .line 235
    .line 236
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 237
    .line 238
    .line 239
    move-result-object v2

    .line 240
    const-string v4, ""

    .line 241
    .line 242
    const/high16 v6, 0x3f800000    # 1.0f

    .line 243
    .line 244
    const/4 v7, 0x0

    .line 245
    const/high16 v8, 0x3f800000    # 1.0f

    .line 246
    .line 247
    const/high16 v12, 0x3f800000    # 1.0f

    .line 248
    .line 249
    const/4 v13, 0x0

    .line 250
    const/4 v15, 0x0

    .line 251
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 252
    .line 253
    .line 254
    move-result-object v0

    .line 255
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 256
    .line 257
    .line 258
    move-result-object v0

    .line 259
    sput-object v0, Landroidx/compose/material/icons/twotone/SwitchLeftKt;->_switchLeft:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 260
    .line 261
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 262
    .line 263
    .line 264
    return-object v0
.end method
