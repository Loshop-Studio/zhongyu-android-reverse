.class public final Landroidx/compose/material/icons/rounded/UndoKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _undo:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getUndo(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/UndoKt;->_undo:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const/4 v10, 0x0

    .line 25
    const/high16 v5, 0x41c00000    # 24.0f

    .line 26
    .line 27
    const/high16 v6, 0x41c00000    # 24.0f

    .line 28
    .line 29
    const-wide/16 v7, 0x0

    .line 30
    .line 31
    const/4 v9, 0x0

    .line 32
    const-string v2, "Rounded.Undo"

    .line 33
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
    const/high16 v0, 0x41480000    # 12.5f

    .line 71
    .line 72
    const/high16 v2, 0x41000000    # 8.0f

    .line 73
    .line 74
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const v17, -0x3f233333    # -6.9f

    .line 78
    .line 79
    .line 80
    const v18, 0x40266666    # 2.6f

    .line 81
    .line 82
    .line 83
    const v13, -0x3fd66666    # -2.65f

    .line 84
    .line 85
    .line 86
    const/4 v14, 0x0

    .line 87
    const v15, -0x3f5e6666    # -5.05f

    .line 88
    .line 89
    .line 90
    const v16, 0x3f7d70a4    # 0.99f

    .line 91
    .line 92
    .line 93
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 94
    .line 95
    .line 96
    const v0, 0x406d70a4    # 3.71f

    .line 97
    .line 98
    .line 99
    const v2, 0x410b5c29    # 8.71f

    .line 100
    .line 101
    .line 102
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 103
    .line 104
    .line 105
    const/high16 v17, 0x40000000    # 2.0f

    .line 106
    .line 107
    const v18, 0x41168f5c    # 9.41f

    .line 108
    .line 109
    .line 110
    const v13, 0x40451eb8    # 3.08f

    .line 111
    .line 112
    .line 113
    const v14, 0x410147ae    # 8.08f

    .line 114
    .line 115
    .line 116
    const/high16 v15, 0x40000000    # 2.0f

    .line 117
    .line 118
    const v16, 0x410851ec    # 8.52f

    .line 119
    .line 120
    .line 121
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 122
    .line 123
    .line 124
    const/high16 v0, 0x41700000    # 15.0f

    .line 125
    .line 126
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 127
    .line 128
    .line 129
    const/high16 v17, 0x3f800000    # 1.0f

    .line 130
    .line 131
    const/high16 v18, 0x3f800000    # 1.0f

    .line 132
    .line 133
    const/4 v13, 0x0

    .line 134
    const v14, 0x3f0ccccd    # 0.55f

    .line 135
    .line 136
    .line 137
    const v15, 0x3ee66666    # 0.45f

    .line 138
    .line 139
    .line 140
    const/high16 v16, 0x3f800000    # 1.0f

    .line 141
    .line 142
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 143
    .line 144
    .line 145
    const v0, 0x40b2e148    # 5.59f

    .line 146
    .line 147
    .line 148
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 149
    .line 150
    .line 151
    const v17, 0x3f35c28f    # 0.71f

    .line 152
    .line 153
    .line 154
    const v18, -0x40251eb8    # -1.71f

    .line 155
    .line 156
    .line 157
    const v13, 0x3f63d70a    # 0.89f

    .line 158
    .line 159
    .line 160
    const/4 v14, 0x0

    .line 161
    const v15, 0x3fab851f    # 1.34f

    .line 162
    .line 163
    .line 164
    const v16, -0x4075c28f    # -1.08f

    .line 165
    .line 166
    .line 167
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 168
    .line 169
    .line 170
    const v0, -0x400b851f    # -1.91f

    .line 171
    .line 172
    .line 173
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 174
    .line 175
    .line 176
    const v17, 0x40a3d70a    # 5.12f

    .line 177
    .line 178
    .line 179
    const v18, -0x400f5c29    # -1.88f

    .line 180
    .line 181
    .line 182
    const v13, 0x3fb1eb85    # 1.39f

    .line 183
    .line 184
    .line 185
    const v14, -0x406b851f    # -1.16f

    .line 186
    .line 187
    .line 188
    const v15, 0x404a3d71    # 3.16f

    .line 189
    .line 190
    .line 191
    const v16, -0x400f5c29    # -1.88f

    .line 192
    .line 193
    .line 194
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 195
    .line 196
    .line 197
    const v17, 0x40e6147b    # 7.19f

    .line 198
    .line 199
    .line 200
    const/high16 v18, 0x40900000    # 4.5f

    .line 201
    .line 202
    const v13, 0x404a3d71    # 3.16f

    .line 203
    .line 204
    .line 205
    const/4 v14, 0x0

    .line 206
    const v15, 0x40bc7ae1    # 5.89f

    .line 207
    .line 208
    .line 209
    const v16, 0x3feb851f    # 1.84f

    .line 210
    .line 211
    .line 212
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 213
    .line 214
    .line 215
    const/high16 v17, 0x3fc00000    # 1.5f

    .line 216
    .line 217
    const v18, 0x3f23d70a    # 0.64f

    .line 218
    .line 219
    .line 220
    const v13, 0x3e8a3d71    # 0.27f

    .line 221
    .line 222
    .line 223
    const v14, 0x3f0f5c29    # 0.56f

    .line 224
    .line 225
    .line 226
    const v15, 0x3f68f5c3    # 0.91f

    .line 227
    .line 228
    .line 229
    const v16, 0x3f570a3d    # 0.84f

    .line 230
    .line 231
    .line 232
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 233
    .line 234
    .line 235
    const/high16 v17, 0x3f400000    # 0.75f

    .line 236
    .line 237
    const v18, -0x4023d70a    # -1.72f

    .line 238
    .line 239
    .line 240
    const v13, 0x3f35c28f    # 0.71f

    .line 241
    .line 242
    .line 243
    const v14, -0x41947ae1    # -0.23f

    .line 244
    .line 245
    .line 246
    const v15, 0x3f88f5c3    # 1.07f

    .line 247
    .line 248
    .line 249
    const v16, -0x407ae148    # -1.04f

    .line 250
    .line 251
    .line 252
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 253
    .line 254
    .line 255
    const/high16 v17, 0x41480000    # 12.5f

    .line 256
    .line 257
    const/high16 v18, 0x41000000    # 8.0f

    .line 258
    .line 259
    const v13, 0x41a1d70a    # 20.23f

    .line 260
    .line 261
    .line 262
    const v14, 0x4126b852    # 10.42f

    .line 263
    .line 264
    .line 265
    const v15, 0x41853333    # 16.65f

    .line 266
    .line 267
    .line 268
    const/high16 v16, 0x41000000    # 8.0f

    .line 269
    .line 270
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 271
    .line 272
    .line 273
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 274
    .line 275
    .line 276
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 277
    .line 278
    .line 279
    move-result-object v2

    .line 280
    const/16 v16, 0x3800

    .line 281
    .line 282
    const/16 v17, 0x0

    .line 283
    .line 284
    const/high16 v6, 0x3f800000    # 1.0f

    .line 285
    .line 286
    const/high16 v8, 0x3f800000    # 1.0f

    .line 287
    .line 288
    const/4 v7, 0x0

    .line 289
    const/high16 v9, 0x3f800000    # 1.0f

    .line 290
    .line 291
    const/high16 v12, 0x3f800000    # 1.0f

    .line 292
    .line 293
    const/4 v13, 0x0

    .line 294
    const/4 v14, 0x0

    .line 295
    const/4 v15, 0x0

    .line 296
    const-string v4, ""

    .line 297
    .line 298
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 299
    .line 300
    .line 301
    move-result-object v0

    .line 302
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 303
    .line 304
    .line 305
    move-result-object v0

    .line 306
    sput-object v0, Landroidx/compose/material/icons/rounded/UndoKt;->_undo:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 307
    .line 308
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 309
    .line 310
    .line 311
    return-object v0
.end method

.method public static synthetic getUndo$annotations(Landroidx/compose/material/icons/Icons$Rounded;)V
    .locals 0
    .annotation runtime Lqc/a;
    .end annotation

    return-void
.end method
