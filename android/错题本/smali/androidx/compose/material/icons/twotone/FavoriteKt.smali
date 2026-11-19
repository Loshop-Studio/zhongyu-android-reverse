.class public final Landroidx/compose/material/icons/twotone/FavoriteKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_favorite",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "Favorite",
        "Landroidx/compose/material/icons/Icons$TwoTone;",
        "getFavorite",
        "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;",
        "material-icons-core_release"
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
        "SMAP\nFavorite.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Favorite.kt\nandroidx/compose/material/icons/twotone/FavoriteKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,71:1\n212#2,12:72\n233#2,18:85\n253#2:122\n233#2,18:123\n253#2:160\n174#3:84\n705#4,2:103\n717#4,2:105\n719#4,11:111\n705#4,2:141\n717#4,2:143\n719#4,11:149\n72#5,4:107\n72#5,4:145\n*S KotlinDebug\n*F\n+ 1 Favorite.kt\nandroidx/compose/material/icons/twotone/FavoriteKt\n*L\n29#1:72,12\n30#1:85,18\n30#1:122\n43#1:123,18\n43#1:160\n29#1:84\n30#1:103,2\n30#1:105,2\n30#1:111,11\n43#1:141,2\n43#1:143,2\n43#1:149,11\n30#1:107,4\n43#1:145,4\n*E\n"
    }
.end annotation


# static fields
.field private static _favorite:Landroidx/compose/ui/graphics/vector/ImageVector;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field


# direct methods
.method public static final getFavorite(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27
    .param p0    # Landroidx/compose/material/icons/Icons$TwoTone;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/FavoriteKt;->_favorite:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-static {v0}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

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
    const-string v2, "TwoTone.Favorite"

    .line 33
    .line 34
    invoke-direct/range {v1 .. v12}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;-><init>(Ljava/lang/String;FFFFJIZILkotlin/jvm/internal/e;)V

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
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/e;)V

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
    const/high16 v2, 0x40a00000    # 5.0f

    .line 66
    .line 67
    const/high16 v4, 0x41840000    # 16.5f

    .line 68
    .line 69
    invoke-static {v4, v2}, Lg/a;->a(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 70
    .line 71
    .line 72
    move-result-object v20

    .line 73
    const v25, -0x3f9c28f6    # -3.56f

    .line 74
    .line 75
    .line 76
    const v26, 0x40170a3d    # 2.36f

    .line 77
    .line 78
    .line 79
    const v21, -0x403ae148    # -1.54f

    .line 80
    .line 81
    .line 82
    const/16 v22, 0x0

    .line 83
    .line 84
    const v23, -0x3fbd70a4    # -3.04f

    .line 85
    .line 86
    .line 87
    const v24, 0x3f7d70a4    # 0.99f

    .line 88
    .line 89
    .line 90
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 91
    .line 92
    .line 93
    move-object/from16 v2, v20

    .line 94
    .line 95
    const v4, -0x4010a3d7    # -1.87f

    .line 96
    .line 97
    .line 98
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 99
    .line 100
    .line 101
    const/high16 v25, 0x40f00000    # 7.5f

    .line 102
    .line 103
    const/high16 v26, 0x40a00000    # 5.0f

    .line 104
    .line 105
    const v21, 0x4128a3d7    # 10.54f

    .line 106
    .line 107
    .line 108
    const v22, 0x40bfae14    # 5.99f

    .line 109
    .line 110
    .line 111
    const v23, 0x4110a3d7    # 9.04f

    .line 112
    .line 113
    .line 114
    const/high16 v24, 0x40a00000    # 5.0f

    .line 115
    .line 116
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 117
    .line 118
    .line 119
    const/high16 v25, 0x40800000    # 4.0f

    .line 120
    .line 121
    const/high16 v26, 0x41080000    # 8.5f

    .line 122
    .line 123
    const/high16 v21, 0x40b00000    # 5.5f

    .line 124
    .line 125
    const/high16 v22, 0x40a00000    # 5.0f

    .line 126
    .line 127
    const/high16 v23, 0x40800000    # 4.0f

    .line 128
    .line 129
    const/high16 v24, 0x40d00000    # 6.5f

    .line 130
    .line 131
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 132
    .line 133
    .line 134
    const v25, 0x40fccccd    # 7.9f

    .line 135
    .line 136
    .line 137
    const v26, 0x4120cccd    # 10.05f

    .line 138
    .line 139
    .line 140
    const/16 v21, 0x0

    .line 141
    .line 142
    const v22, 0x4038f5c3    # 2.89f

    .line 143
    .line 144
    .line 145
    const v23, 0x4048f5c3    # 3.14f

    .line 146
    .line 147
    .line 148
    const v24, 0x40b7ae14    # 5.74f

    .line 149
    .line 150
    .line 151
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 152
    .line 153
    .line 154
    const v4, 0x3dcccccd    # 0.1f

    .line 155
    .line 156
    .line 157
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 158
    .line 159
    .line 160
    const v4, -0x42333333    # -0.1f

    .line 161
    .line 162
    .line 163
    const v6, 0x3dcccccd    # 0.1f

    .line 164
    .line 165
    .line 166
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 167
    .line 168
    .line 169
    const/high16 v25, 0x41a00000    # 20.0f

    .line 170
    .line 171
    const/high16 v26, 0x41080000    # 8.5f

    .line 172
    .line 173
    const v21, 0x4186e148    # 16.86f

    .line 174
    .line 175
    .line 176
    const v22, 0x4163d70a    # 14.24f

    .line 177
    .line 178
    .line 179
    const/high16 v23, 0x41a00000    # 20.0f

    .line 180
    .line 181
    const v24, 0x41363d71    # 11.39f

    .line 182
    .line 183
    .line 184
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 185
    .line 186
    .line 187
    const/high16 v25, -0x3fa00000    # -3.5f

    .line 188
    .line 189
    const/high16 v26, -0x3fa00000    # -3.5f

    .line 190
    .line 191
    const/16 v21, 0x0

    .line 192
    .line 193
    const/high16 v22, -0x40000000    # -2.0f

    .line 194
    .line 195
    const/high16 v23, -0x40400000    # -1.5f

    .line 196
    .line 197
    const/high16 v24, -0x3fa00000    # -3.5f

    .line 198
    .line 199
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 200
    .line 201
    .line 202
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 203
    .line 204
    .line 205
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 206
    .line 207
    .line 208
    move-result-object v2

    .line 209
    const/16 v16, 0x3800

    .line 210
    .line 211
    const/16 v17, 0x0

    .line 212
    .line 213
    const v6, 0x3e99999a    # 0.3f

    .line 214
    .line 215
    .line 216
    const v8, 0x3e99999a    # 0.3f

    .line 217
    .line 218
    .line 219
    const/4 v7, 0x0

    .line 220
    const/high16 v9, 0x3f800000    # 1.0f

    .line 221
    .line 222
    const/high16 v12, 0x3f800000    # 1.0f

    .line 223
    .line 224
    const/4 v13, 0x0

    .line 225
    const/4 v14, 0x0

    .line 226
    const/4 v15, 0x0

    .line 227
    const-string v4, ""

    .line 228
    .line 229
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 230
    .line 231
    .line 232
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 233
    .line 234
    .line 235
    move-result v3

    .line 236
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 237
    .line 238
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 239
    .line 240
    .line 241
    move-result-wide v6

    .line 242
    const/4 v0, 0x0

    .line 243
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/e;)V

    .line 244
    .line 245
    .line 246
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 247
    .line 248
    .line 249
    move-result v10

    .line 250
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 251
    .line 252
    .line 253
    move-result v11

    .line 254
    const/high16 v0, 0x40400000    # 3.0f

    .line 255
    .line 256
    const/high16 v2, 0x41840000    # 16.5f

    .line 257
    .line 258
    invoke-static {v2, v0}, Lg/a;->a(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 259
    .line 260
    .line 261
    move-result-object v12

    .line 262
    const/high16 v17, -0x3f700000    # -4.5f

    .line 263
    .line 264
    const v18, 0x4005c28f    # 2.09f

    .line 265
    .line 266
    .line 267
    const v13, -0x402147ae    # -1.74f

    .line 268
    .line 269
    .line 270
    const v15, -0x3fa5c28f    # -3.41f

    .line 271
    .line 272
    .line 273
    const v16, 0x3f4f5c29    # 0.81f

    .line 274
    .line 275
    .line 276
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 277
    .line 278
    .line 279
    const/high16 v17, 0x40f00000    # 7.5f

    .line 280
    .line 281
    const/high16 v18, 0x40400000    # 3.0f

    .line 282
    .line 283
    const v13, 0x412e8f5c    # 10.91f

    .line 284
    .line 285
    .line 286
    const v14, 0x4073d70a    # 3.81f

    .line 287
    .line 288
    .line 289
    const v15, 0x4113d70a    # 9.24f

    .line 290
    .line 291
    .line 292
    const/high16 v16, 0x40400000    # 3.0f

    .line 293
    .line 294
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 295
    .line 296
    .line 297
    const/high16 v17, 0x40000000    # 2.0f

    .line 298
    .line 299
    const/high16 v18, 0x41080000    # 8.5f

    .line 300
    .line 301
    const v13, 0x408d70a4    # 4.42f

    .line 302
    .line 303
    .line 304
    const/high16 v14, 0x40400000    # 3.0f

    .line 305
    .line 306
    const/high16 v15, 0x40000000    # 2.0f

    .line 307
    .line 308
    const v16, 0x40ad70a4    # 5.42f

    .line 309
    .line 310
    .line 311
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 312
    .line 313
    .line 314
    const v17, 0x4108cccd    # 8.55f

    .line 315
    .line 316
    .line 317
    const v18, 0x4138a3d7    # 11.54f

    .line 318
    .line 319
    .line 320
    const/4 v13, 0x0

    .line 321
    const v14, 0x4071eb85    # 3.78f

    .line 322
    .line 323
    .line 324
    const v15, 0x4059999a    # 3.4f

    .line 325
    .line 326
    .line 327
    const v16, 0x40db851f    # 6.86f

    .line 328
    .line 329
    .line 330
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 331
    .line 332
    .line 333
    const/high16 v0, 0x41400000    # 12.0f

    .line 334
    .line 335
    const v2, 0x41aacccd    # 21.35f

    .line 336
    .line 337
    .line 338
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 339
    .line 340
    .line 341
    const v0, 0x3fb9999a    # 1.45f

    .line 342
    .line 343
    .line 344
    const v2, -0x40570a3d    # -1.32f

    .line 345
    .line 346
    .line 347
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 348
    .line 349
    .line 350
    const/high16 v17, 0x41b00000    # 22.0f

    .line 351
    .line 352
    const/high16 v18, 0x41080000    # 8.5f

    .line 353
    .line 354
    const v13, 0x4194cccd    # 18.6f

    .line 355
    .line 356
    .line 357
    const v14, 0x4175c28f    # 15.36f

    .line 358
    .line 359
    .line 360
    const/high16 v15, 0x41b00000    # 22.0f

    .line 361
    .line 362
    const v16, 0x41447ae1    # 12.28f

    .line 363
    .line 364
    .line 365
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 366
    .line 367
    .line 368
    const/high16 v17, 0x41840000    # 16.5f

    .line 369
    .line 370
    const/high16 v18, 0x40400000    # 3.0f

    .line 371
    .line 372
    const/high16 v13, 0x41b00000    # 22.0f

    .line 373
    .line 374
    const v14, 0x40ad70a4    # 5.42f

    .line 375
    .line 376
    .line 377
    const v15, 0x419ca3d7    # 19.58f

    .line 378
    .line 379
    .line 380
    const/high16 v16, 0x40400000    # 3.0f

    .line 381
    .line 382
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 383
    .line 384
    .line 385
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 386
    .line 387
    .line 388
    const v0, 0x4141999a    # 12.1f

    .line 389
    .line 390
    .line 391
    const v2, 0x41946666    # 18.55f

    .line 392
    .line 393
    .line 394
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 395
    .line 396
    .line 397
    const v0, -0x42333333    # -0.1f

    .line 398
    .line 399
    .line 400
    const v2, 0x3dcccccd    # 0.1f

    .line 401
    .line 402
    .line 403
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 404
    .line 405
    .line 406
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 407
    .line 408
    .line 409
    const/high16 v17, 0x40800000    # 4.0f

    .line 410
    .line 411
    const/high16 v18, 0x41080000    # 8.5f

    .line 412
    .line 413
    const v13, 0x40e47ae1    # 7.14f

    .line 414
    .line 415
    .line 416
    const v14, 0x4163d70a    # 14.24f

    .line 417
    .line 418
    .line 419
    const/high16 v15, 0x40800000    # 4.0f

    .line 420
    .line 421
    const v16, 0x41363d71    # 11.39f

    .line 422
    .line 423
    .line 424
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 425
    .line 426
    .line 427
    const/high16 v17, 0x40f00000    # 7.5f

    .line 428
    .line 429
    const/high16 v18, 0x40a00000    # 5.0f

    .line 430
    .line 431
    const/high16 v13, 0x40800000    # 4.0f

    .line 432
    .line 433
    const/high16 v14, 0x40d00000    # 6.5f

    .line 434
    .line 435
    const/high16 v15, 0x40b00000    # 5.5f

    .line 436
    .line 437
    const/high16 v16, 0x40a00000    # 5.0f

    .line 438
    .line 439
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 440
    .line 441
    .line 442
    const v17, 0x40647ae1    # 3.57f

    .line 443
    .line 444
    .line 445
    const v18, 0x40170a3d    # 2.36f

    .line 446
    .line 447
    .line 448
    const v13, 0x3fc51eb8    # 1.54f

    .line 449
    .line 450
    .line 451
    const/4 v14, 0x0

    .line 452
    const v15, 0x40428f5c    # 3.04f

    .line 453
    .line 454
    .line 455
    const v16, 0x3f7d70a4    # 0.99f

    .line 456
    .line 457
    .line 458
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 459
    .line 460
    .line 461
    const v0, 0x3fef5c29    # 1.87f

    .line 462
    .line 463
    .line 464
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 465
    .line 466
    .line 467
    const/high16 v17, 0x41840000    # 16.5f

    .line 468
    .line 469
    const/high16 v18, 0x40a00000    # 5.0f

    .line 470
    .line 471
    const v13, 0x41575c29    # 13.46f

    .line 472
    .line 473
    .line 474
    const v14, 0x40bfae14    # 5.99f

    .line 475
    .line 476
    .line 477
    const v15, 0x416f5c29    # 14.96f

    .line 478
    .line 479
    .line 480
    const/high16 v16, 0x40a00000    # 5.0f

    .line 481
    .line 482
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 483
    .line 484
    .line 485
    const/high16 v17, 0x40600000    # 3.5f

    .line 486
    .line 487
    const/high16 v18, 0x40600000    # 3.5f

    .line 488
    .line 489
    const/high16 v13, 0x40000000    # 2.0f

    .line 490
    .line 491
    const/4 v14, 0x0

    .line 492
    const/high16 v15, 0x40600000    # 3.5f

    .line 493
    .line 494
    const/high16 v16, 0x3fc00000    # 1.5f

    .line 495
    .line 496
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 497
    .line 498
    .line 499
    const v17, -0x3f033333    # -7.9f

    .line 500
    .line 501
    .line 502
    const v18, 0x4120cccd    # 10.05f

    .line 503
    .line 504
    .line 505
    const/4 v13, 0x0

    .line 506
    const v14, 0x4038f5c3    # 2.89f

    .line 507
    .line 508
    .line 509
    const v15, -0x3fb70a3d    # -3.14f

    .line 510
    .line 511
    .line 512
    const v16, 0x40b7ae14    # 5.74f

    .line 513
    .line 514
    .line 515
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 516
    .line 517
    .line 518
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 519
    .line 520
    .line 521
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 522
    .line 523
    .line 524
    move-result-object v2

    .line 525
    const/16 v16, 0x3800

    .line 526
    .line 527
    const/16 v17, 0x0

    .line 528
    .line 529
    const/high16 v6, 0x3f800000    # 1.0f

    .line 530
    .line 531
    const/high16 v8, 0x3f800000    # 1.0f

    .line 532
    .line 533
    const/4 v7, 0x0

    .line 534
    const/high16 v12, 0x3f800000    # 1.0f

    .line 535
    .line 536
    const/4 v14, 0x0

    .line 537
    const/4 v15, 0x0

    .line 538
    const-string v4, ""

    .line 539
    .line 540
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 541
    .line 542
    .line 543
    move-result-object v0

    .line 544
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 545
    .line 546
    .line 547
    move-result-object v0

    .line 548
    sput-object v0, Landroidx/compose/material/icons/twotone/FavoriteKt;->_favorite:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 549
    .line 550
    invoke-static {v0}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 551
    .line 552
    .line 553
    return-object v0
.end method
