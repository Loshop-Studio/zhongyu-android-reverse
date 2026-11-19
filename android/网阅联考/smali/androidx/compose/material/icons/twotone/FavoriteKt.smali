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
        "SMAP\nFavorite.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Favorite.kt\nandroidx/compose/material/icons/twotone/FavoriteKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,71:1\n122#2:72\n116#2,3:73\n119#2,3:77\n132#2,18:80\n152#2:117\n132#2,18:118\n152#2:155\n175#3:76\n694#4,2:98\n706#4,2:100\n708#4,11:106\n694#4,2:136\n706#4,2:138\n708#4,11:144\n53#5,4:102\n53#5,4:140\n*S KotlinDebug\n*F\n+ 1 Favorite.kt\nandroidx/compose/material/icons/twotone/FavoriteKt\n*L\n29#1:72\n29#1:73,3\n29#1:77,3\n30#1:80,18\n30#1:117\n43#1:118,18\n43#1:155\n29#1:76\n30#1:98,2\n30#1:100,2\n30#1:106,11\n43#1:136,2\n43#1:138,2\n43#1:144,11\n30#1:102,4\n43#1:140,4\n*E\n"
    }
.end annotation


# static fields
.field private static _favorite:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getFavorite(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 47

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    move-object/from16 v1, p0

    .line 4
    .line 5
    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    sget-object v0, Landroidx/compose/material/icons/twotone/FavoriteKt;->_favorite:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    return-object v0

    .line 16
    :cond_0
    const-string v2, "TwoTone.Favorite"

    .line 17
    .line 18
    new-instance v1, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 19
    .line 20
    move-object/from16 v30, v1

    .line 21
    .line 22
    move-object v13, v1

    .line 23
    const/high16 v0, 0x41c00000    # 24.0f

    .line 24
    .line 25
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 30
    .line 31
    .line 32
    move-result v4

    .line 33
    const/high16 v5, 0x41c00000    # 24.0f

    .line 34
    .line 35
    const/high16 v6, 0x41c00000    # 24.0f

    .line 36
    .line 37
    const-wide/16 v7, 0x0

    .line 38
    .line 39
    const/4 v9, 0x0

    .line 40
    const/4 v10, 0x0

    .line 41
    const/16 v11, 0xe0

    .line 42
    .line 43
    const/4 v12, 0x0

    .line 44
    invoke-direct/range {v1 .. v12}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;-><init>(Ljava/lang/String;FFFFJIZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 45
    .line 46
    .line 47
    const v18, 0x3e99999a    # 0.3f

    .line 48
    .line 49
    .line 50
    const v20, 0x3e99999a    # 0.3f

    .line 51
    .line 52
    .line 53
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 54
    .line 55
    .line 56
    move-result v15

    .line 57
    new-instance v0, Landroidx/compose/ui/graphics/SolidColor;

    .line 58
    .line 59
    move-object/from16 v17, v0

    .line 60
    .line 61
    sget-object v1, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    .line 62
    .line 63
    invoke-virtual {v1}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 64
    .line 65
    .line 66
    move-result-wide v2

    .line 67
    const/4 v4, 0x0

    .line 68
    invoke-direct {v0, v2, v3, v4}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 69
    .line 70
    .line 71
    const/16 v19, 0x0

    .line 72
    .line 73
    const/high16 v21, 0x3f800000    # 1.0f

    .line 74
    .line 75
    sget-object v0, Landroidx/compose/ui/graphics/StrokeCap;->Companion:Landroidx/compose/ui/graphics/StrokeCap$Companion;

    .line 76
    .line 77
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 78
    .line 79
    .line 80
    move-result v22

    .line 81
    sget-object v2, Landroidx/compose/ui/graphics/StrokeJoin;->Companion:Landroidx/compose/ui/graphics/StrokeJoin$Companion;

    .line 82
    .line 83
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 84
    .line 85
    .line 86
    move-result v23

    .line 87
    const/high16 v24, 0x3f800000    # 1.0f

    .line 88
    .line 89
    const-string v16, ""

    .line 90
    .line 91
    new-instance v3, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 92
    .line 93
    invoke-direct {v3}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 94
    .line 95
    .line 96
    const/high16 v5, 0x40a00000    # 5.0f

    .line 97
    .line 98
    const/high16 v12, 0x41840000    # 16.5f

    .line 99
    .line 100
    invoke-virtual {v3, v12, v5}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 101
    .line 102
    .line 103
    const v6, -0x403ae148    # -1.54f

    .line 104
    .line 105
    .line 106
    const/4 v7, 0x0

    .line 107
    const v8, -0x3fbd70a4    # -3.04f

    .line 108
    .line 109
    .line 110
    const v9, 0x3f7d70a4    # 0.99f

    .line 111
    .line 112
    .line 113
    const v10, -0x3f9c28f6    # -3.56f

    .line 114
    .line 115
    .line 116
    const v11, 0x40170a3d    # 2.36f

    .line 117
    .line 118
    .line 119
    move-object v5, v3

    .line 120
    invoke-virtual/range {v5 .. v11}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 121
    .line 122
    .line 123
    const v5, -0x4010a3d7    # -1.87f

    .line 124
    .line 125
    .line 126
    invoke-virtual {v3, v5}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 127
    .line 128
    .line 129
    const v6, 0x4128a3d7    # 10.54f

    .line 130
    .line 131
    .line 132
    const v7, 0x40bfae14    # 5.99f

    .line 133
    .line 134
    .line 135
    const v8, 0x4110a3d7    # 9.04f

    .line 136
    .line 137
    .line 138
    const/high16 v9, 0x40a00000    # 5.0f

    .line 139
    .line 140
    const/high16 v10, 0x40f00000    # 7.5f

    .line 141
    .line 142
    const/high16 v11, 0x40a00000    # 5.0f

    .line 143
    .line 144
    move-object v5, v3

    .line 145
    invoke-virtual/range {v5 .. v11}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 146
    .line 147
    .line 148
    const/high16 v6, 0x40b00000    # 5.5f

    .line 149
    .line 150
    const/high16 v7, 0x40a00000    # 5.0f

    .line 151
    .line 152
    const/high16 v8, 0x40800000    # 4.0f

    .line 153
    .line 154
    const/high16 v9, 0x40d00000    # 6.5f

    .line 155
    .line 156
    const/high16 v10, 0x40800000    # 4.0f

    .line 157
    .line 158
    const/high16 v11, 0x41080000    # 8.5f

    .line 159
    .line 160
    invoke-virtual/range {v5 .. v11}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 161
    .line 162
    .line 163
    const/4 v6, 0x0

    .line 164
    const v7, 0x4038f5c3    # 2.89f

    .line 165
    .line 166
    .line 167
    const v8, 0x4048f5c3    # 3.14f

    .line 168
    .line 169
    .line 170
    const v9, 0x40b7ae14    # 5.74f

    .line 171
    .line 172
    .line 173
    const v10, 0x40fccccd    # 7.9f

    .line 174
    .line 175
    .line 176
    const v11, 0x4120cccd    # 10.05f

    .line 177
    .line 178
    .line 179
    invoke-virtual/range {v5 .. v11}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 180
    .line 181
    .line 182
    const v14, 0x3dcccccd    # 0.1f

    .line 183
    .line 184
    .line 185
    invoke-virtual {v3, v14, v14}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 186
    .line 187
    .line 188
    const v11, -0x42333333    # -0.1f

    .line 189
    .line 190
    .line 191
    invoke-virtual {v3, v14, v11}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 192
    .line 193
    .line 194
    const v6, 0x4186e148    # 16.86f

    .line 195
    .line 196
    .line 197
    const v7, 0x4163d70a    # 14.24f

    .line 198
    .line 199
    .line 200
    const/high16 v8, 0x41a00000    # 20.0f

    .line 201
    .line 202
    const v9, 0x41363d71    # 11.39f

    .line 203
    .line 204
    .line 205
    const/high16 v10, 0x41a00000    # 20.0f

    .line 206
    .line 207
    const/high16 v25, 0x41080000    # 8.5f

    .line 208
    .line 209
    move/from16 v11, v25

    .line 210
    .line 211
    invoke-virtual/range {v5 .. v11}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 212
    .line 213
    .line 214
    const/4 v6, 0x0

    .line 215
    const/high16 v7, -0x40000000    # -2.0f

    .line 216
    .line 217
    const/high16 v8, -0x40400000    # -1.5f

    .line 218
    .line 219
    const/high16 v9, -0x3fa00000    # -3.5f

    .line 220
    .line 221
    const/high16 v10, -0x3fa00000    # -3.5f

    .line 222
    .line 223
    const/high16 v11, -0x3fa00000    # -3.5f

    .line 224
    .line 225
    invoke-virtual/range {v5 .. v11}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 226
    .line 227
    .line 228
    invoke-virtual {v3}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 229
    .line 230
    .line 231
    invoke-virtual {v3}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 232
    .line 233
    .line 234
    move-result-object v3

    .line 235
    move v5, v14

    .line 236
    move-object v14, v3

    .line 237
    const/16 v25, 0x0

    .line 238
    .line 239
    const/16 v26, 0x0

    .line 240
    .line 241
    const/16 v27, 0x0

    .line 242
    .line 243
    const/16 v28, 0x3800

    .line 244
    .line 245
    const/16 v29, 0x0

    .line 246
    .line 247
    invoke-static/range {v13 .. v29}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 248
    .line 249
    .line 250
    const/high16 v35, 0x3f800000    # 1.0f

    .line 251
    .line 252
    const/high16 v37, 0x3f800000    # 1.0f

    .line 253
    .line 254
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 255
    .line 256
    .line 257
    move-result v32

    .line 258
    new-instance v3, Landroidx/compose/ui/graphics/SolidColor;

    .line 259
    .line 260
    move-object/from16 v34, v3

    .line 261
    .line 262
    invoke-virtual {v1}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 263
    .line 264
    .line 265
    move-result-wide v6

    .line 266
    invoke-direct {v3, v6, v7, v4}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 267
    .line 268
    .line 269
    const/16 v36, 0x0

    .line 270
    .line 271
    const/high16 v38, 0x3f800000    # 1.0f

    .line 272
    .line 273
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 274
    .line 275
    .line 276
    move-result v39

    .line 277
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 278
    .line 279
    .line 280
    move-result v40

    .line 281
    const/high16 v41, 0x3f800000    # 1.0f

    .line 282
    .line 283
    const-string v33, ""

    .line 284
    .line 285
    new-instance v0, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 286
    .line 287
    invoke-direct {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 288
    .line 289
    .line 290
    const/high16 v1, 0x40400000    # 3.0f

    .line 291
    .line 292
    invoke-virtual {v0, v12, v1}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 293
    .line 294
    .line 295
    const v14, -0x402147ae    # -1.74f

    .line 296
    .line 297
    .line 298
    const/4 v15, 0x0

    .line 299
    const v16, -0x3fa5c28f    # -3.41f

    .line 300
    .line 301
    .line 302
    const v17, 0x3f4f5c29    # 0.81f

    .line 303
    .line 304
    .line 305
    const/high16 v18, -0x3f700000    # -4.5f

    .line 306
    .line 307
    const v19, 0x4005c28f    # 2.09f

    .line 308
    .line 309
    .line 310
    move-object v13, v0

    .line 311
    invoke-virtual/range {v13 .. v19}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 312
    .line 313
    .line 314
    const v14, 0x412e8f5c    # 10.91f

    .line 315
    .line 316
    .line 317
    const v15, 0x4073d70a    # 3.81f

    .line 318
    .line 319
    .line 320
    const v16, 0x4113d70a    # 9.24f

    .line 321
    .line 322
    .line 323
    const/high16 v17, 0x40400000    # 3.0f

    .line 324
    .line 325
    const/high16 v18, 0x40f00000    # 7.5f

    .line 326
    .line 327
    const/high16 v19, 0x40400000    # 3.0f

    .line 328
    .line 329
    invoke-virtual/range {v13 .. v19}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 330
    .line 331
    .line 332
    const v14, 0x408d70a4    # 4.42f

    .line 333
    .line 334
    .line 335
    const/high16 v15, 0x40400000    # 3.0f

    .line 336
    .line 337
    const/high16 v16, 0x40000000    # 2.0f

    .line 338
    .line 339
    const v17, 0x40ad70a4    # 5.42f

    .line 340
    .line 341
    .line 342
    const/high16 v18, 0x40000000    # 2.0f

    .line 343
    .line 344
    const/high16 v19, 0x41080000    # 8.5f

    .line 345
    .line 346
    invoke-virtual/range {v13 .. v19}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 347
    .line 348
    .line 349
    const/4 v14, 0x0

    .line 350
    const v15, 0x4071eb85    # 3.78f

    .line 351
    .line 352
    .line 353
    const v16, 0x4059999a    # 3.4f

    .line 354
    .line 355
    .line 356
    const v17, 0x40db851f    # 6.86f

    .line 357
    .line 358
    .line 359
    const v18, 0x4108cccd    # 8.55f

    .line 360
    .line 361
    .line 362
    const v19, 0x4138a3d7    # 11.54f

    .line 363
    .line 364
    .line 365
    invoke-virtual/range {v13 .. v19}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 366
    .line 367
    .line 368
    const/high16 v1, 0x41400000    # 12.0f

    .line 369
    .line 370
    const v2, 0x41aacccd    # 21.35f

    .line 371
    .line 372
    .line 373
    invoke-virtual {v0, v1, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 374
    .line 375
    .line 376
    const v1, 0x3fb9999a    # 1.45f

    .line 377
    .line 378
    .line 379
    const v2, -0x40570a3d    # -1.32f

    .line 380
    .line 381
    .line 382
    invoke-virtual {v0, v1, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 383
    .line 384
    .line 385
    const v14, 0x4194cccd    # 18.6f

    .line 386
    .line 387
    .line 388
    const v15, 0x4175c28f    # 15.36f

    .line 389
    .line 390
    .line 391
    const/high16 v16, 0x41b00000    # 22.0f

    .line 392
    .line 393
    const v17, 0x41447ae1    # 12.28f

    .line 394
    .line 395
    .line 396
    const/high16 v18, 0x41b00000    # 22.0f

    .line 397
    .line 398
    const/high16 v19, 0x41080000    # 8.5f

    .line 399
    .line 400
    invoke-virtual/range {v13 .. v19}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 401
    .line 402
    .line 403
    const/high16 v14, 0x41b00000    # 22.0f

    .line 404
    .line 405
    const v15, 0x40ad70a4    # 5.42f

    .line 406
    .line 407
    .line 408
    const v16, 0x419ca3d7    # 19.58f

    .line 409
    .line 410
    .line 411
    const/high16 v17, 0x40400000    # 3.0f

    .line 412
    .line 413
    const/high16 v18, 0x41840000    # 16.5f

    .line 414
    .line 415
    const/high16 v19, 0x40400000    # 3.0f

    .line 416
    .line 417
    invoke-virtual/range {v13 .. v19}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 418
    .line 419
    .line 420
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 421
    .line 422
    .line 423
    const v1, 0x4141999a    # 12.1f

    .line 424
    .line 425
    .line 426
    const v2, 0x41946666    # 18.55f

    .line 427
    .line 428
    .line 429
    invoke-virtual {v0, v1, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 430
    .line 431
    .line 432
    const v1, -0x42333333    # -0.1f

    .line 433
    .line 434
    .line 435
    invoke-virtual {v0, v1, v5}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 436
    .line 437
    .line 438
    invoke-virtual {v0, v1, v1}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 439
    .line 440
    .line 441
    const v14, 0x40e47ae1    # 7.14f

    .line 442
    .line 443
    .line 444
    const v15, 0x4163d70a    # 14.24f

    .line 445
    .line 446
    .line 447
    const/high16 v16, 0x40800000    # 4.0f

    .line 448
    .line 449
    const v17, 0x41363d71    # 11.39f

    .line 450
    .line 451
    .line 452
    const/high16 v18, 0x40800000    # 4.0f

    .line 453
    .line 454
    const/high16 v19, 0x41080000    # 8.5f

    .line 455
    .line 456
    invoke-virtual/range {v13 .. v19}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 457
    .line 458
    .line 459
    const/high16 v14, 0x40800000    # 4.0f

    .line 460
    .line 461
    const/high16 v15, 0x40d00000    # 6.5f

    .line 462
    .line 463
    const/high16 v16, 0x40b00000    # 5.5f

    .line 464
    .line 465
    const/high16 v17, 0x40a00000    # 5.0f

    .line 466
    .line 467
    const/high16 v18, 0x40f00000    # 7.5f

    .line 468
    .line 469
    const/high16 v19, 0x40a00000    # 5.0f

    .line 470
    .line 471
    invoke-virtual/range {v13 .. v19}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 472
    .line 473
    .line 474
    const v14, 0x3fc51eb8    # 1.54f

    .line 475
    .line 476
    .line 477
    const/4 v15, 0x0

    .line 478
    const v16, 0x40428f5c    # 3.04f

    .line 479
    .line 480
    .line 481
    const v17, 0x3f7d70a4    # 0.99f

    .line 482
    .line 483
    .line 484
    const v18, 0x40647ae1    # 3.57f

    .line 485
    .line 486
    .line 487
    const v19, 0x40170a3d    # 2.36f

    .line 488
    .line 489
    .line 490
    invoke-virtual/range {v13 .. v19}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 491
    .line 492
    .line 493
    const v1, 0x3fef5c29    # 1.87f

    .line 494
    .line 495
    .line 496
    invoke-virtual {v0, v1}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 497
    .line 498
    .line 499
    const v14, 0x41575c29    # 13.46f

    .line 500
    .line 501
    .line 502
    const v15, 0x40bfae14    # 5.99f

    .line 503
    .line 504
    .line 505
    const v16, 0x416f5c29    # 14.96f

    .line 506
    .line 507
    .line 508
    const/high16 v17, 0x40a00000    # 5.0f

    .line 509
    .line 510
    const/high16 v18, 0x41840000    # 16.5f

    .line 511
    .line 512
    const/high16 v19, 0x40a00000    # 5.0f

    .line 513
    .line 514
    invoke-virtual/range {v13 .. v19}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 515
    .line 516
    .line 517
    const/high16 v14, 0x40000000    # 2.0f

    .line 518
    .line 519
    const/4 v15, 0x0

    .line 520
    const/high16 v16, 0x40600000    # 3.5f

    .line 521
    .line 522
    const/high16 v17, 0x3fc00000    # 1.5f

    .line 523
    .line 524
    const/high16 v18, 0x40600000    # 3.5f

    .line 525
    .line 526
    const/high16 v19, 0x40600000    # 3.5f

    .line 527
    .line 528
    invoke-virtual/range {v13 .. v19}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 529
    .line 530
    .line 531
    const/4 v14, 0x0

    .line 532
    const v15, 0x4038f5c3    # 2.89f

    .line 533
    .line 534
    .line 535
    const v16, -0x3fb70a3d    # -3.14f

    .line 536
    .line 537
    .line 538
    const v17, 0x40b7ae14    # 5.74f

    .line 539
    .line 540
    .line 541
    const v18, -0x3f033333    # -7.9f

    .line 542
    .line 543
    .line 544
    const v19, 0x4120cccd    # 10.05f

    .line 545
    .line 546
    .line 547
    invoke-virtual/range {v13 .. v19}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 548
    .line 549
    .line 550
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 551
    .line 552
    .line 553
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 554
    .line 555
    .line 556
    move-result-object v31

    .line 557
    const/16 v42, 0x0

    .line 558
    .line 559
    const/16 v43, 0x0

    .line 560
    .line 561
    const/16 v44, 0x0

    .line 562
    .line 563
    const/16 v45, 0x3800

    .line 564
    .line 565
    const/16 v46, 0x0

    .line 566
    .line 567
    invoke-static/range {v30 .. v46}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 568
    .line 569
    .line 570
    move-result-object v0

    .line 571
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 572
    .line 573
    .line 574
    move-result-object v0

    .line 575
    sput-object v0, Landroidx/compose/material/icons/twotone/FavoriteKt;->_favorite:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 576
    .line 577
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 578
    .line 579
    .line 580
    return-object v0
.end method
