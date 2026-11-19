.class public final Landroidx/compose/material/icons/outlined/PaletteKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_palette",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "Palette",
        "Landroidx/compose/material/icons/Icons$Outlined;",
        "getPalette",
        "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;",
        "material-icons-extended_release"
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
        "SMAP\nPalette.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Palette.kt\nandroidx/compose/material/icons/outlined/PaletteKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,83:1\n212#2,12:84\n233#2,18:97\n253#2:134\n233#2,18:135\n253#2:172\n233#2,18:173\n253#2:210\n233#2,18:211\n253#2:248\n233#2,18:249\n253#2:286\n174#3:96\n705#4,2:115\n717#4,2:117\n719#4,11:123\n705#4,2:153\n717#4,2:155\n719#4,11:161\n705#4,2:191\n717#4,2:193\n719#4,11:199\n705#4,2:229\n717#4,2:231\n719#4,11:237\n705#4,2:267\n717#4,2:269\n719#4,11:275\n72#5,4:119\n72#5,4:157\n72#5,4:195\n72#5,4:233\n72#5,4:271\n*S KotlinDebug\n*F\n+ 1 Palette.kt\nandroidx/compose/material/icons/outlined/PaletteKt\n*L\n29#1:84,12\n30#1:97,18\n30#1:134\n54#1:135,18\n54#1:172\n60#1:173,18\n60#1:210\n66#1:211,18\n66#1:248\n72#1:249,18\n72#1:286\n29#1:96\n30#1:115,2\n30#1:117,2\n30#1:123,11\n54#1:153,2\n54#1:155,2\n54#1:161,11\n60#1:191,2\n60#1:193,2\n60#1:199,11\n66#1:229,2\n66#1:231,2\n66#1:237,11\n72#1:267,2\n72#1:269,2\n72#1:275,11\n30#1:119,4\n54#1:157,4\n60#1:195,4\n66#1:233,4\n72#1:271,4\n*E\n"
    }
.end annotation


# static fields
.field private static _palette:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getPalette(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 28

    .line 1
    sget-object v0, Landroidx/compose/material/icons/outlined/PaletteKt;->_palette:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

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
    const-string v2, "Outlined.Palette"

    .line 33
    .line 34
    invoke-direct/range {v1 .. v12}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;-><init>(Ljava/lang/String;FFFFJIZILkotlin/jvm/internal/DefaultConstructorMarker;)V

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
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

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
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 66
    .line 67
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 68
    .line 69
    .line 70
    const/high16 v4, 0x41b00000    # 22.0f

    .line 71
    .line 72
    const/high16 v6, 0x41400000    # 12.0f

    .line 73
    .line 74
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v25, 0x40000000    # 2.0f

    .line 78
    .line 79
    const/high16 v26, 0x41400000    # 12.0f

    .line 80
    .line 81
    const v21, 0x40cfae14    # 6.49f

    .line 82
    .line 83
    .line 84
    const/high16 v22, 0x41b00000    # 22.0f

    .line 85
    .line 86
    const/high16 v23, 0x40000000    # 2.0f

    .line 87
    .line 88
    const v24, 0x418c147b    # 17.51f

    .line 89
    .line 90
    .line 91
    move-object/from16 v20, v2

    .line 92
    .line 93
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 94
    .line 95
    .line 96
    const v4, 0x40cfae14    # 6.49f

    .line 97
    .line 98
    .line 99
    const/high16 v6, 0x40000000    # 2.0f

    .line 100
    .line 101
    const/high16 v7, 0x41400000    # 12.0f

    .line 102
    .line 103
    invoke-virtual {v2, v4, v6, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 104
    .line 105
    .line 106
    const v4, 0x408147ae    # 4.04f

    .line 107
    .line 108
    .line 109
    const/high16 v6, 0x41100000    # 9.0f

    .line 110
    .line 111
    const/high16 v7, 0x41200000    # 10.0f

    .line 112
    .line 113
    invoke-virtual {v2, v7, v4, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 114
    .line 115
    .line 116
    const/high16 v25, -0x3f400000    # -6.0f

    .line 117
    .line 118
    const/high16 v26, 0x40c00000    # 6.0f

    .line 119
    .line 120
    const/16 v21, 0x0

    .line 121
    .line 122
    const v22, 0x4053d70a    # 3.31f

    .line 123
    .line 124
    .line 125
    const v23, -0x3fd3d70a    # -2.69f

    .line 126
    .line 127
    .line 128
    const/high16 v24, 0x40c00000    # 6.0f

    .line 129
    .line 130
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 131
    .line 132
    .line 133
    const v4, -0x401d70a4    # -1.77f

    .line 134
    .line 135
    .line 136
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 137
    .line 138
    .line 139
    const/high16 v25, -0x41000000    # -0.5f

    .line 140
    .line 141
    const/high16 v26, 0x3f000000    # 0.5f

    .line 142
    .line 143
    const v21, -0x4170a3d7    # -0.28f

    .line 144
    .line 145
    .line 146
    const/16 v22, 0x0

    .line 147
    .line 148
    const/high16 v23, -0x41000000    # -0.5f

    .line 149
    .line 150
    const v24, 0x3e6147ae    # 0.22f

    .line 151
    .line 152
    .line 153
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 154
    .line 155
    .line 156
    const v25, 0x3e051eb8    # 0.13f

    .line 157
    .line 158
    .line 159
    const v26, 0x3ea8f5c3    # 0.33f

    .line 160
    .line 161
    .line 162
    const/16 v21, 0x0

    .line 163
    .line 164
    const v22, 0x3df5c28f    # 0.12f

    .line 165
    .line 166
    .line 167
    const v23, 0x3d4ccccd    # 0.05f

    .line 168
    .line 169
    .line 170
    const v24, 0x3e6b851f    # 0.23f

    .line 171
    .line 172
    .line 173
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 174
    .line 175
    .line 176
    const v25, 0x3f23d70a    # 0.64f

    .line 177
    .line 178
    .line 179
    const v26, 0x3fd5c28f    # 1.67f

    .line 180
    .line 181
    .line 182
    const v21, 0x3ed1eb85    # 0.41f

    .line 183
    .line 184
    .line 185
    const v22, 0x3ef0a3d7    # 0.47f

    .line 186
    .line 187
    .line 188
    const v23, 0x3f23d70a    # 0.64f

    .line 189
    .line 190
    .line 191
    const v24, 0x3f87ae14    # 1.06f

    .line 192
    .line 193
    .line 194
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 195
    .line 196
    .line 197
    const/high16 v25, 0x41400000    # 12.0f

    .line 198
    .line 199
    const/high16 v26, 0x41b00000    # 22.0f

    .line 200
    .line 201
    const/high16 v21, 0x41680000    # 14.5f

    .line 202
    .line 203
    const v22, 0x41a70a3d    # 20.88f

    .line 204
    .line 205
    .line 206
    const v23, 0x4156147b    # 13.38f

    .line 207
    .line 208
    .line 209
    const/high16 v24, 0x41b00000    # 22.0f

    .line 210
    .line 211
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 212
    .line 213
    .line 214
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 215
    .line 216
    .line 217
    const/high16 v4, 0x40800000    # 4.0f

    .line 218
    .line 219
    const/high16 v6, 0x41400000    # 12.0f

    .line 220
    .line 221
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 222
    .line 223
    .line 224
    const/high16 v25, -0x3f000000    # -8.0f

    .line 225
    .line 226
    const/high16 v26, 0x41000000    # 8.0f

    .line 227
    .line 228
    const v21, -0x3f72e148    # -4.41f

    .line 229
    .line 230
    .line 231
    const/16 v22, 0x0

    .line 232
    .line 233
    const/high16 v23, -0x3f000000    # -8.0f

    .line 234
    .line 235
    const v24, 0x4065c28f    # 3.59f

    .line 236
    .line 237
    .line 238
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 239
    .line 240
    .line 241
    const v4, 0x4065c28f    # 3.59f

    .line 242
    .line 243
    .line 244
    const/high16 v6, 0x41000000    # 8.0f

    .line 245
    .line 246
    invoke-virtual {v2, v4, v6, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 247
    .line 248
    .line 249
    const/high16 v25, 0x3f000000    # 0.5f

    .line 250
    .line 251
    const/high16 v26, -0x41000000    # -0.5f

    .line 252
    .line 253
    const v21, 0x3e8f5c29    # 0.28f

    .line 254
    .line 255
    .line 256
    const/high16 v23, 0x3f000000    # 0.5f

    .line 257
    .line 258
    const v24, -0x419eb852    # -0.22f

    .line 259
    .line 260
    .line 261
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 262
    .line 263
    .line 264
    const v25, -0x41f0a3d7    # -0.14f

    .line 265
    .line 266
    .line 267
    const v26, -0x414ccccd    # -0.35f

    .line 268
    .line 269
    .line 270
    const/16 v21, 0x0

    .line 271
    .line 272
    const v22, -0x41dc28f6    # -0.16f

    .line 273
    .line 274
    .line 275
    const v23, -0x425c28f6    # -0.08f

    .line 276
    .line 277
    .line 278
    const v24, -0x4170a3d7    # -0.28f

    .line 279
    .line 280
    .line 281
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 282
    .line 283
    .line 284
    const v25, -0x40deb852    # -0.63f

    .line 285
    .line 286
    .line 287
    const v26, -0x402ccccd    # -1.65f

    .line 288
    .line 289
    .line 290
    const v21, -0x412e147b    # -0.41f

    .line 291
    .line 292
    .line 293
    const v22, -0x41147ae1    # -0.46f

    .line 294
    .line 295
    .line 296
    const v23, -0x40deb852    # -0.63f

    .line 297
    .line 298
    .line 299
    const v24, -0x4079999a    # -1.05f

    .line 300
    .line 301
    .line 302
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 303
    .line 304
    .line 305
    const/high16 v25, 0x40200000    # 2.5f

    .line 306
    .line 307
    const/high16 v26, -0x3fe00000    # -2.5f

    .line 308
    .line 309
    const/16 v21, 0x0

    .line 310
    .line 311
    const v22, -0x404f5c29    # -1.38f

    .line 312
    .line 313
    .line 314
    const v23, 0x3f8f5c29    # 1.12f

    .line 315
    .line 316
    .line 317
    const/high16 v24, -0x3fe00000    # -2.5f

    .line 318
    .line 319
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 320
    .line 321
    .line 322
    const/high16 v4, 0x41800000    # 16.0f

    .line 323
    .line 324
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 325
    .line 326
    .line 327
    const/high16 v25, 0x40800000    # 4.0f

    .line 328
    .line 329
    const/high16 v26, -0x3f800000    # -4.0f

    .line 330
    .line 331
    const v21, 0x400d70a4    # 2.21f

    .line 332
    .line 333
    .line 334
    const/16 v22, 0x0

    .line 335
    .line 336
    const/high16 v23, 0x40800000    # 4.0f

    .line 337
    .line 338
    const v24, -0x401ae148    # -1.79f

    .line 339
    .line 340
    .line 341
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 342
    .line 343
    .line 344
    const/high16 v25, 0x41400000    # 12.0f

    .line 345
    .line 346
    const/high16 v26, 0x40800000    # 4.0f

    .line 347
    .line 348
    const/high16 v21, 0x41a00000    # 20.0f

    .line 349
    .line 350
    const v22, 0x40e47ae1    # 7.14f

    .line 351
    .line 352
    .line 353
    const v23, 0x418347ae    # 16.41f

    .line 354
    .line 355
    .line 356
    const/high16 v24, 0x40800000    # 4.0f

    .line 357
    .line 358
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 359
    .line 360
    .line 361
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 362
    .line 363
    .line 364
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 365
    .line 366
    .line 367
    move-result-object v2

    .line 368
    const/16 v16, 0x3800

    .line 369
    .line 370
    const/16 v17, 0x0

    .line 371
    .line 372
    const/high16 v6, 0x3f800000    # 1.0f

    .line 373
    .line 374
    const/high16 v8, 0x3f800000    # 1.0f

    .line 375
    .line 376
    const/4 v7, 0x0

    .line 377
    const/high16 v9, 0x3f800000    # 1.0f

    .line 378
    .line 379
    const/high16 v12, 0x3f800000    # 1.0f

    .line 380
    .line 381
    const/4 v13, 0x0

    .line 382
    const/4 v14, 0x0

    .line 383
    const/4 v15, 0x0

    .line 384
    const-string v4, ""

    .line 385
    .line 386
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 387
    .line 388
    .line 389
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 390
    .line 391
    .line 392
    move-result v3

    .line 393
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 394
    .line 395
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 396
    .line 397
    .line 398
    move-result-wide v6

    .line 399
    const/4 v2, 0x0

    .line 400
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 401
    .line 402
    .line 403
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 404
    .line 405
    .line 406
    move-result v10

    .line 407
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 408
    .line 409
    .line 410
    move-result v11

    .line 411
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 412
    .line 413
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 414
    .line 415
    .line 416
    const/high16 v4, 0x40d00000    # 6.5f

    .line 417
    .line 418
    const/high16 v6, 0x41380000    # 11.5f

    .line 419
    .line 420
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 421
    .line 422
    .line 423
    const/4 v4, 0x0

    .line 424
    const/high16 v6, -0x40400000    # -1.5f

    .line 425
    .line 426
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 427
    .line 428
    .line 429
    const/high16 v26, 0x40400000    # 3.0f

    .line 430
    .line 431
    const/16 v27, 0x0

    .line 432
    .line 433
    const/high16 v21, 0x3fc00000    # 1.5f

    .line 434
    .line 435
    const/high16 v22, 0x3fc00000    # 1.5f

    .line 436
    .line 437
    const/16 v23, 0x0

    .line 438
    .line 439
    const/16 v24, 0x1

    .line 440
    .line 441
    const/16 v25, 0x1

    .line 442
    .line 443
    move-object/from16 v20, v2

    .line 444
    .line 445
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 446
    .line 447
    .line 448
    const/high16 v26, -0x3fc00000    # -3.0f

    .line 449
    .line 450
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 451
    .line 452
    .line 453
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 454
    .line 455
    .line 456
    move-result-object v2

    .line 457
    const/high16 v6, 0x3f800000    # 1.0f

    .line 458
    .line 459
    const/4 v7, 0x0

    .line 460
    const-string v4, ""

    .line 461
    .line 462
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 463
    .line 464
    .line 465
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 466
    .line 467
    .line 468
    move-result v3

    .line 469
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 470
    .line 471
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 472
    .line 473
    .line 474
    move-result-wide v6

    .line 475
    const/4 v2, 0x0

    .line 476
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 477
    .line 478
    .line 479
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 480
    .line 481
    .line 482
    move-result v10

    .line 483
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 484
    .line 485
    .line 486
    move-result v11

    .line 487
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 488
    .line 489
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 490
    .line 491
    .line 492
    const/high16 v4, 0x41180000    # 9.5f

    .line 493
    .line 494
    const/high16 v6, 0x40f00000    # 7.5f

    .line 495
    .line 496
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 497
    .line 498
    .line 499
    const/4 v4, 0x0

    .line 500
    const/high16 v6, -0x40400000    # -1.5f

    .line 501
    .line 502
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 503
    .line 504
    .line 505
    const/high16 v26, 0x40400000    # 3.0f

    .line 506
    .line 507
    move-object/from16 v20, v2

    .line 508
    .line 509
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 510
    .line 511
    .line 512
    const/high16 v26, -0x3fc00000    # -3.0f

    .line 513
    .line 514
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 515
    .line 516
    .line 517
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 518
    .line 519
    .line 520
    move-result-object v2

    .line 521
    const/high16 v6, 0x3f800000    # 1.0f

    .line 522
    .line 523
    const/4 v7, 0x0

    .line 524
    const-string v4, ""

    .line 525
    .line 526
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 527
    .line 528
    .line 529
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 530
    .line 531
    .line 532
    move-result v3

    .line 533
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 534
    .line 535
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 536
    .line 537
    .line 538
    move-result-wide v6

    .line 539
    const/4 v2, 0x0

    .line 540
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 541
    .line 542
    .line 543
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 544
    .line 545
    .line 546
    move-result v10

    .line 547
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 548
    .line 549
    .line 550
    move-result v11

    .line 551
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 552
    .line 553
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 554
    .line 555
    .line 556
    const/high16 v4, 0x41680000    # 14.5f

    .line 557
    .line 558
    const/high16 v6, 0x40f00000    # 7.5f

    .line 559
    .line 560
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 561
    .line 562
    .line 563
    const/4 v4, 0x0

    .line 564
    const/high16 v6, -0x40400000    # -1.5f

    .line 565
    .line 566
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 567
    .line 568
    .line 569
    const/high16 v26, 0x40400000    # 3.0f

    .line 570
    .line 571
    move-object/from16 v20, v2

    .line 572
    .line 573
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 574
    .line 575
    .line 576
    const/high16 v26, -0x3fc00000    # -3.0f

    .line 577
    .line 578
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 579
    .line 580
    .line 581
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 582
    .line 583
    .line 584
    move-result-object v2

    .line 585
    const/high16 v6, 0x3f800000    # 1.0f

    .line 586
    .line 587
    const/4 v7, 0x0

    .line 588
    const-string v4, ""

    .line 589
    .line 590
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 591
    .line 592
    .line 593
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 594
    .line 595
    .line 596
    move-result v3

    .line 597
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 598
    .line 599
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 600
    .line 601
    .line 602
    move-result-wide v6

    .line 603
    const/4 v0, 0x0

    .line 604
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 605
    .line 606
    .line 607
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 608
    .line 609
    .line 610
    move-result v10

    .line 611
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 612
    .line 613
    .line 614
    move-result v11

    .line 615
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 616
    .line 617
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 618
    .line 619
    .line 620
    const/high16 v0, 0x418c0000    # 17.5f

    .line 621
    .line 622
    const/high16 v2, 0x41380000    # 11.5f

    .line 623
    .line 624
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 625
    .line 626
    .line 627
    const/4 v0, 0x0

    .line 628
    const/high16 v2, -0x40400000    # -1.5f

    .line 629
    .line 630
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 631
    .line 632
    .line 633
    const/high16 v18, 0x40400000    # 3.0f

    .line 634
    .line 635
    const/16 v19, 0x0

    .line 636
    .line 637
    const/high16 v13, 0x3fc00000    # 1.5f

    .line 638
    .line 639
    const/high16 v14, 0x3fc00000    # 1.5f

    .line 640
    .line 641
    const/16 v16, 0x1

    .line 642
    .line 643
    const/16 v17, 0x1

    .line 644
    .line 645
    invoke-virtual/range {v12 .. v19}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 646
    .line 647
    .line 648
    const/high16 v18, -0x3fc00000    # -3.0f

    .line 649
    .line 650
    invoke-virtual/range {v12 .. v19}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 651
    .line 652
    .line 653
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 654
    .line 655
    .line 656
    move-result-object v2

    .line 657
    const/16 v16, 0x3800

    .line 658
    .line 659
    const/16 v17, 0x0

    .line 660
    .line 661
    const/high16 v6, 0x3f800000    # 1.0f

    .line 662
    .line 663
    const/4 v7, 0x0

    .line 664
    const/high16 v12, 0x3f800000    # 1.0f

    .line 665
    .line 666
    const/4 v13, 0x0

    .line 667
    const/4 v14, 0x0

    .line 668
    const-string v4, ""

    .line 669
    .line 670
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 671
    .line 672
    .line 673
    move-result-object v0

    .line 674
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 675
    .line 676
    .line 677
    move-result-object v0

    .line 678
    sput-object v0, Landroidx/compose/material/icons/outlined/PaletteKt;->_palette:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 679
    .line 680
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 681
    .line 682
    .line 683
    return-object v0
.end method
