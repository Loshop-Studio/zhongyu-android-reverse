.class public final Landroidx/compose/material/icons/filled/KeyboardDoubleArrowRightKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _keyboardDoubleArrowRight:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getKeyboardDoubleArrowRight(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 28

    .line 1
    sget-object v0, Landroidx/compose/material/icons/filled/KeyboardDoubleArrowRightKt;->_keyboardDoubleArrowRight:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Filled.KeyboardDoubleArrowRight"

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
    const v6, 0x40cd1eb8    # 6.41f

    .line 71
    .line 72
    .line 73
    const/high16 v7, 0x40c00000    # 6.0f

    .line 74
    .line 75
    invoke-virtual {v4, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    const v6, -0x404b851f    # -1.41f

    .line 79
    .line 80
    .line 81
    const v8, 0x3fb47ae1    # 1.41f

    .line 82
    .line 83
    .line 84
    invoke-virtual {v4, v6, v8}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 85
    .line 86
    .line 87
    const v9, 0x40928f5c    # 4.58f

    .line 88
    .line 89
    .line 90
    const v12, 0x4092e148    # 4.59f

    .line 91
    .line 92
    .line 93
    invoke-virtual {v4, v9, v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 94
    .line 95
    .line 96
    const v13, -0x3f6d70a4    # -4.58f

    .line 97
    .line 98
    .line 99
    invoke-virtual {v4, v13, v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 100
    .line 101
    .line 102
    invoke-virtual {v4, v8, v8}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 103
    .line 104
    .line 105
    const/high16 v14, -0x3f400000    # -6.0f

    .line 106
    .line 107
    invoke-virtual {v4, v7, v14}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 108
    .line 109
    .line 110
    invoke-virtual {v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 111
    .line 112
    .line 113
    invoke-virtual {v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 114
    .line 115
    .line 116
    move-result-object v4

    .line 117
    const/16 v16, 0x3800

    .line 118
    .line 119
    const/16 v17, 0x0

    .line 120
    .line 121
    move-object v15, v2

    .line 122
    move-object v2, v4

    .line 123
    const-string v4, ""

    .line 124
    .line 125
    move/from16 v20, v6

    .line 126
    .line 127
    const/high16 v6, 0x3f800000    # 1.0f

    .line 128
    .line 129
    move/from16 v21, v7

    .line 130
    .line 131
    const/4 v7, 0x0

    .line 132
    move/from16 v22, v8

    .line 133
    .line 134
    const/high16 v8, 0x3f800000    # 1.0f

    .line 135
    .line 136
    move/from16 v23, v9

    .line 137
    .line 138
    const/high16 v9, 0x3f800000    # 1.0f

    .line 139
    .line 140
    move/from16 v24, v12

    .line 141
    .line 142
    const/high16 v12, 0x3f800000    # 1.0f

    .line 143
    .line 144
    move/from16 v25, v13

    .line 145
    .line 146
    const/4 v13, 0x0

    .line 147
    move/from16 v26, v14

    .line 148
    .line 149
    const/4 v14, 0x0

    .line 150
    move-object/from16 v27, v15

    .line 151
    .line 152
    const/4 v15, 0x0

    .line 153
    move-object/from16 p0, v0

    .line 154
    .line 155
    move-object/from16 v0, v27

    .line 156
    .line 157
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 158
    .line 159
    .line 160
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 161
    .line 162
    .line 163
    move-result v3

    .line 164
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 165
    .line 166
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 167
    .line 168
    .line 169
    move-result-wide v6

    .line 170
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 171
    .line 172
    .line 173
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 174
    .line 175
    .line 176
    move-result v10

    .line 177
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 178
    .line 179
    .line 180
    move-result v11

    .line 181
    new-instance v0, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 182
    .line 183
    invoke-direct {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 184
    .line 185
    .line 186
    const/high16 v2, 0x41500000    # 13.0f

    .line 187
    .line 188
    const/high16 v4, 0x40c00000    # 6.0f

    .line 189
    .line 190
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 191
    .line 192
    .line 193
    const v2, -0x404b851f    # -1.41f

    .line 194
    .line 195
    .line 196
    const v6, 0x3fb47ae1    # 1.41f

    .line 197
    .line 198
    .line 199
    invoke-virtual {v0, v2, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 200
    .line 201
    .line 202
    const v2, 0x40928f5c    # 4.58f

    .line 203
    .line 204
    .line 205
    const v7, 0x4092e148    # 4.59f

    .line 206
    .line 207
    .line 208
    invoke-virtual {v0, v2, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 209
    .line 210
    .line 211
    const v2, -0x3f6d70a4    # -4.58f

    .line 212
    .line 213
    .line 214
    invoke-virtual {v0, v2, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 215
    .line 216
    .line 217
    invoke-virtual {v0, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 218
    .line 219
    .line 220
    const/high16 v2, -0x3f400000    # -6.0f

    .line 221
    .line 222
    invoke-virtual {v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 223
    .line 224
    .line 225
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 226
    .line 227
    .line 228
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 229
    .line 230
    .line 231
    move-result-object v2

    .line 232
    const-string v4, ""

    .line 233
    .line 234
    const/high16 v6, 0x3f800000    # 1.0f

    .line 235
    .line 236
    const/4 v7, 0x0

    .line 237
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 238
    .line 239
    .line 240
    move-result-object v0

    .line 241
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 242
    .line 243
    .line 244
    move-result-object v0

    .line 245
    sput-object v0, Landroidx/compose/material/icons/filled/KeyboardDoubleArrowRightKt;->_keyboardDoubleArrowRight:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 246
    .line 247
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 248
    .line 249
    .line 250
    return-object v0
.end method
