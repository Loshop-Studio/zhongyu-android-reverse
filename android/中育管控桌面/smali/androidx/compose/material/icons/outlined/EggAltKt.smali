.class public final Landroidx/compose/material/icons/outlined/EggAltKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_eggAlt",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "EggAlt",
        "Landroidx/compose/material/icons/Icons$Outlined;",
        "getEggAlt",
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
        "SMAP\nEggAlt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EggAlt.kt\nandroidx/compose/material/icons/outlined/EggAltKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,62:1\n212#2,12:63\n233#2,18:76\n253#2:113\n233#2,18:114\n253#2:151\n174#3:75\n705#4,2:94\n717#4,2:96\n719#4,11:102\n705#4,2:132\n717#4,2:134\n719#4,11:140\n72#5,4:98\n72#5,4:136\n*S KotlinDebug\n*F\n+ 1 EggAlt.kt\nandroidx/compose/material/icons/outlined/EggAltKt\n*L\n29#1:63,12\n30#1:76,18\n30#1:113\n51#1:114,18\n51#1:151\n29#1:75\n30#1:94,2\n30#1:96,2\n30#1:102,11\n51#1:132,2\n51#1:134,2\n51#1:140,11\n30#1:98,4\n51#1:136,4\n*E\n"
    }
.end annotation


# static fields
.field private static _eggAlt:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getEggAlt(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/outlined/EggAltKt;->_eggAlt:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Outlined.EggAlt"

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
    const/high16 v4, 0x41980000    # 19.0f

    .line 71
    .line 72
    const/high16 v6, 0x41100000    # 9.0f

    .line 73
    .line 74
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const v25, 0x411f851f    # 9.97f

    .line 78
    .line 79
    .line 80
    const/high16 v26, 0x40000000    # 2.0f

    .line 81
    .line 82
    const/high16 v21, 0x41880000    # 17.0f

    .line 83
    .line 84
    const/high16 v22, 0x40e00000    # 7.0f

    .line 85
    .line 86
    const v23, 0x417fd70a    # 15.99f

    .line 87
    .line 88
    .line 89
    const/high16 v24, 0x40000000    # 2.0f

    .line 90
    .line 91
    move-object/from16 v20, v2

    .line 92
    .line 93
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 94
    .line 95
    .line 96
    const/high16 v25, 0x40000000    # 2.0f

    .line 97
    .line 98
    const v26, 0x413851ec    # 11.52f

    .line 99
    .line 100
    .line 101
    const v21, 0x409e6666    # 4.95f

    .line 102
    .line 103
    .line 104
    const/high16 v22, 0x40000000    # 2.0f

    .line 105
    .line 106
    const v23, 0x3ff851ec    # 1.94f

    .line 107
    .line 108
    .line 109
    const/high16 v24, 0x40c00000    # 6.0f

    .line 110
    .line 111
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 112
    .line 113
    .line 114
    const v25, 0x411f851f    # 9.97f

    .line 115
    .line 116
    .line 117
    const/high16 v26, 0x41980000    # 19.0f

    .line 118
    .line 119
    const v21, 0x4003d70a    # 2.06f

    .line 120
    .line 121
    .line 122
    const v22, 0x418851ec    # 17.04f

    .line 123
    .line 124
    .line 125
    const v23, 0x40deb852    # 6.96f

    .line 126
    .line 127
    .line 128
    const/high16 v24, 0x41980000    # 19.0f

    .line 129
    .line 130
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 131
    .line 132
    .line 133
    const v25, 0x40c0a3d7    # 6.02f

    .line 134
    .line 135
    .line 136
    const/high16 v26, 0x40400000    # 3.0f

    .line 137
    .line 138
    const v21, 0x4000a3d7    # 2.01f

    .line 139
    .line 140
    .line 141
    const/16 v22, 0x0

    .line 142
    .line 143
    const v23, 0x4000a3d7    # 2.01f

    .line 144
    .line 145
    .line 146
    const/high16 v24, 0x40400000    # 3.0f

    .line 147
    .line 148
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 149
    .line 150
    .line 151
    const/high16 v25, 0x41b00000    # 22.0f

    .line 152
    .line 153
    const v26, 0x417051ec    # 15.02f

    .line 154
    .line 155
    .line 156
    const/high16 v21, 0x41980000    # 19.0f

    .line 157
    .line 158
    const/high16 v22, 0x41b00000    # 22.0f

    .line 159
    .line 160
    const/high16 v23, 0x41b00000    # 22.0f

    .line 161
    .line 162
    const/high16 v24, 0x41980000    # 19.0f

    .line 163
    .line 164
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 165
    .line 166
    .line 167
    const/high16 v25, 0x41980000    # 19.0f

    .line 168
    .line 169
    const/high16 v26, 0x41100000    # 9.0f

    .line 170
    .line 171
    const/high16 v21, 0x41b00000    # 22.0f

    .line 172
    .line 173
    const/high16 v22, 0x41400000    # 12.0f

    .line 174
    .line 175
    const v23, 0x41a8147b    # 21.01f

    .line 176
    .line 177
    .line 178
    const/high16 v24, 0x41300000    # 11.0f

    .line 179
    .line 180
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 181
    .line 182
    .line 183
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 184
    .line 185
    .line 186
    const v4, 0x417fd70a    # 15.99f

    .line 187
    .line 188
    .line 189
    const/high16 v6, 0x41a00000    # 20.0f

    .line 190
    .line 191
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 192
    .line 193
    .line 194
    const v25, -0x3fd47ae1    # -2.68f

    .line 195
    .line 196
    .line 197
    const v26, -0x405eb852    # -1.26f

    .line 198
    .line 199
    .line 200
    const v21, -0x404147ae    # -1.49f

    .line 201
    .line 202
    .line 203
    const/16 v22, 0x0

    .line 204
    .line 205
    const v23, -0x40051eb8    # -1.96f

    .line 206
    .line 207
    .line 208
    const/high16 v24, -0x41000000    # -0.5f

    .line 209
    .line 210
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 211
    .line 212
    .line 213
    const v25, 0x411f851f    # 9.97f

    .line 214
    .line 215
    .line 216
    const/high16 v26, 0x41880000    # 17.0f

    .line 217
    .line 218
    const v21, 0x414a8f5c    # 12.66f

    .line 219
    .line 220
    .line 221
    const v22, 0x41906666    # 18.05f

    .line 222
    .line 223
    .line 224
    const v23, 0x413a8f5c    # 11.66f

    .line 225
    .line 226
    .line 227
    const/high16 v24, 0x41880000    # 17.0f

    .line 228
    .line 229
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 230
    .line 231
    .line 232
    const/high16 v25, 0x40800000    # 4.0f

    .line 233
    .line 234
    const/high16 v26, 0x41380000    # 11.5f

    .line 235
    .line 236
    const v21, 0x410547ae    # 8.33f

    .line 237
    .line 238
    .line 239
    const/high16 v22, 0x41880000    # 17.0f

    .line 240
    .line 241
    const v23, 0x4081999a    # 4.05f

    .line 242
    .line 243
    .line 244
    const v24, 0x4180147b    # 16.01f

    .line 245
    .line 246
    .line 247
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 248
    .line 249
    .line 250
    const v25, 0x40bfae14    # 5.99f

    .line 251
    .line 252
    .line 253
    const v26, 0x40b1999a    # 5.55f

    .line 254
    .line 255
    .line 256
    const v21, 0x407e147b    # 3.97f

    .line 257
    .line 258
    .line 259
    const v22, 0x410fd70a    # 8.99f

    .line 260
    .line 261
    .line 262
    const v23, 0x4095c28f    # 4.68f

    .line 263
    .line 264
    .line 265
    const v24, 0x40dc28f6    # 6.88f

    .line 266
    .line 267
    .line 268
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 269
    .line 270
    .line 271
    const v25, 0x411f851f    # 9.97f

    .line 272
    .line 273
    .line 274
    const/high16 v26, 0x40800000    # 4.0f

    .line 275
    .line 276
    const v21, 0x40e051ec    # 7.01f

    .line 277
    .line 278
    .line 279
    const v22, 0x4090a3d7    # 4.52f

    .line 280
    .line 281
    .line 282
    const v23, 0x4105999a    # 8.35f

    .line 283
    .line 284
    .line 285
    const/high16 v24, 0x40800000    # 4.0f

    .line 286
    .line 287
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 288
    .line 289
    .line 290
    const v25, 0x40bb851f    # 5.86f

    .line 291
    .line 292
    .line 293
    const v26, 0x4080a3d7    # 4.02f

    .line 294
    .line 295
    .line 296
    const v21, 0x4055c28f    # 3.34f

    .line 297
    .line 298
    .line 299
    const/16 v22, 0x0

    .line 300
    .line 301
    const v23, 0x409051ec    # 4.51f

    .line 302
    .line 303
    .line 304
    const v24, 0x3fee147b    # 1.86f

    .line 305
    .line 306
    .line 307
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 308
    .line 309
    .line 310
    const v25, 0x3fe147ae    # 1.76f

    .line 311
    .line 312
    .line 313
    const v26, 0x4018f5c3    # 2.39f

    .line 314
    .line 315
    .line 316
    const v21, 0x3f0ccccd    # 0.55f

    .line 317
    .line 318
    .line 319
    const v22, 0x3f6147ae    # 0.88f

    .line 320
    .line 321
    .line 322
    const v23, 0x3f88f5c3    # 1.07f

    .line 323
    .line 324
    .line 325
    const v24, 0x3fdae148    # 1.71f

    .line 326
    .line 327
    .line 328
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 329
    .line 330
    .line 331
    const v25, 0x401a3d71    # 2.41f

    .line 332
    .line 333
    .line 334
    const v26, 0x4093851f    # 4.61f

    .line 335
    .line 336
    .line 337
    const v21, 0x3ff33333    # 1.9f

    .line 338
    .line 339
    .line 340
    const v22, 0x3ff1eb85    # 1.89f

    .line 341
    .line 342
    .line 343
    const v23, 0x401a3d71    # 2.41f

    .line 344
    .line 345
    .line 346
    const v24, 0x4019999a    # 2.4f

    .line 347
    .line 348
    .line 349
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 350
    .line 351
    .line 352
    const v25, 0x417fd70a    # 15.99f

    .line 353
    .line 354
    .line 355
    const/high16 v26, 0x41a00000    # 20.0f

    .line 356
    .line 357
    const/high16 v21, 0x41a00000    # 20.0f

    .line 358
    .line 359
    const v22, 0x418ef5c3    # 17.87f

    .line 360
    .line 361
    .line 362
    const v23, 0x418f0a3d    # 17.88f

    .line 363
    .line 364
    .line 365
    const/high16 v24, 0x41a00000    # 20.0f

    .line 366
    .line 367
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 368
    .line 369
    .line 370
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 371
    .line 372
    .line 373
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 374
    .line 375
    .line 376
    move-result-object v2

    .line 377
    const/16 v16, 0x3800

    .line 378
    .line 379
    const/16 v17, 0x0

    .line 380
    .line 381
    const/high16 v6, 0x3f800000    # 1.0f

    .line 382
    .line 383
    const/high16 v8, 0x3f800000    # 1.0f

    .line 384
    .line 385
    const/4 v7, 0x0

    .line 386
    const/high16 v9, 0x3f800000    # 1.0f

    .line 387
    .line 388
    const/high16 v12, 0x3f800000    # 1.0f

    .line 389
    .line 390
    const/4 v13, 0x0

    .line 391
    const/4 v14, 0x0

    .line 392
    const/4 v15, 0x0

    .line 393
    const-string v4, ""

    .line 394
    .line 395
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 396
    .line 397
    .line 398
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 399
    .line 400
    .line 401
    move-result v3

    .line 402
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 403
    .line 404
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 405
    .line 406
    .line 407
    move-result-wide v6

    .line 408
    const/4 v0, 0x0

    .line 409
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 410
    .line 411
    .line 412
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 413
    .line 414
    .line 415
    move-result v10

    .line 416
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 417
    .line 418
    .line 419
    move-result v11

    .line 420
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 421
    .line 422
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 423
    .line 424
    .line 425
    const/high16 v0, 0x41400000    # 12.0f

    .line 426
    .line 427
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 428
    .line 429
    .line 430
    const/high16 v0, -0x3fa00000    # -3.5f

    .line 431
    .line 432
    const/4 v2, 0x0

    .line 433
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 434
    .line 435
    .line 436
    const/high16 v18, 0x40e00000    # 7.0f

    .line 437
    .line 438
    const/16 v19, 0x0

    .line 439
    .line 440
    const/high16 v13, 0x40600000    # 3.5f

    .line 441
    .line 442
    const/high16 v14, 0x40600000    # 3.5f

    .line 443
    .line 444
    const/16 v16, 0x1

    .line 445
    .line 446
    const/16 v17, 0x1

    .line 447
    .line 448
    invoke-virtual/range {v12 .. v19}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 449
    .line 450
    .line 451
    const/high16 v18, -0x3f200000    # -7.0f

    .line 452
    .line 453
    invoke-virtual/range {v12 .. v19}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 454
    .line 455
    .line 456
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 457
    .line 458
    .line 459
    move-result-object v2

    .line 460
    const/16 v16, 0x3800

    .line 461
    .line 462
    const/16 v17, 0x0

    .line 463
    .line 464
    const/high16 v6, 0x3f800000    # 1.0f

    .line 465
    .line 466
    const/4 v7, 0x0

    .line 467
    const/high16 v12, 0x3f800000    # 1.0f

    .line 468
    .line 469
    const/4 v13, 0x0

    .line 470
    const/4 v14, 0x0

    .line 471
    const-string v4, ""

    .line 472
    .line 473
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 474
    .line 475
    .line 476
    move-result-object v0

    .line 477
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 478
    .line 479
    .line 480
    move-result-object v0

    .line 481
    sput-object v0, Landroidx/compose/material/icons/outlined/EggAltKt;->_eggAlt:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 482
    .line 483
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 484
    .line 485
    .line 486
    return-object v0
.end method
