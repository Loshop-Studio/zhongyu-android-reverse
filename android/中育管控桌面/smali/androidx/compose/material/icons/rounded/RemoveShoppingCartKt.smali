.class public final Landroidx/compose/material/icons/rounded/RemoveShoppingCartKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_removeShoppingCart",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "RemoveShoppingCart",
        "Landroidx/compose/material/icons/Icons$Rounded;",
        "getRemoveShoppingCart",
        "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;",
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
        "SMAP\nRemoveShoppingCart.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoveShoppingCart.kt\nandroidx/compose/material/icons/rounded/RemoveShoppingCartKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,74:1\n212#2,12:75\n233#2,18:88\n253#2:125\n174#3:87\n705#4,2:106\n717#4,2:108\n719#4,11:114\n72#5,4:110\n*S KotlinDebug\n*F\n+ 1 RemoveShoppingCart.kt\nandroidx/compose/material/icons/rounded/RemoveShoppingCartKt\n*L\n29#1:75,12\n30#1:88,18\n30#1:125\n29#1:87\n30#1:106,2\n30#1:108,2\n30#1:114,11\n30#1:110,4\n*E\n"
    }
.end annotation


# static fields
.field private static _removeShoppingCart:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getRemoveShoppingCart(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/RemoveShoppingCartKt;->_removeShoppingCart:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.RemoveShoppingCart"

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
    const/4 v0, 0x0

    .line 50
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

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
    const v0, 0x3f35c28f    # 0.71f

    .line 71
    .line 72
    .line 73
    const v2, 0x3fea3d71    # 1.83f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const/16 v17, 0x0

    .line 80
    .line 81
    const v18, 0x3fb47ae1    # 1.41f

    .line 82
    .line 83
    .line 84
    const v13, -0x413851ec    # -0.39f

    .line 85
    .line 86
    .line 87
    const v14, 0x3ec7ae14    # 0.39f

    .line 88
    .line 89
    .line 90
    const v15, -0x413851ec    # -0.39f

    .line 91
    .line 92
    .line 93
    const v16, 0x3f828f5c    # 1.02f

    .line 94
    .line 95
    .line 96
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 97
    .line 98
    .line 99
    const v0, 0x406b851f    # 3.68f

    .line 100
    .line 101
    .line 102
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 103
    .line 104
    .line 105
    const v0, 0x400d70a4    # 2.21f

    .line 106
    .line 107
    .line 108
    const v2, 0x40951eb8    # 4.66f

    .line 109
    .line 110
    .line 111
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 112
    .line 113
    .line 114
    const v0, -0x40533333    # -1.35f

    .line 115
    .line 116
    .line 117
    const v2, 0x401ccccd    # 2.45f

    .line 118
    .line 119
    .line 120
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 121
    .line 122
    .line 123
    const v17, -0x418a3d71    # -0.24f

    .line 124
    .line 125
    .line 126
    const v18, 0x3f933333    # 1.15f

    .line 127
    .line 128
    .line 129
    const v13, -0x41bd70a4    # -0.19f

    .line 130
    .line 131
    .line 132
    const v14, 0x3ea8f5c3    # 0.33f

    .line 133
    .line 134
    .line 135
    const v15, -0x4170a3d7    # -0.28f

    .line 136
    .line 137
    .line 138
    const v16, 0x3f3ae148    # 0.73f

    .line 139
    .line 140
    .line 141
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 142
    .line 143
    .line 144
    const v17, 0x4007ae14    # 2.12f

    .line 145
    .line 146
    .line 147
    const v18, 0x3fe8f5c3    # 1.82f

    .line 148
    .line 149
    .line 150
    const v13, 0x3dcccccd    # 0.1f

    .line 151
    .line 152
    .line 153
    const v14, 0x3f87ae14    # 1.06f

    .line 154
    .line 155
    .line 156
    const v15, 0x3f87ae14    # 1.06f

    .line 157
    .line 158
    .line 159
    const v16, 0x3fe8f5c3    # 1.82f

    .line 160
    .line 161
    .line 162
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 163
    .line 164
    .line 165
    const v0, 0x40ea8f5c    # 7.33f

    .line 166
    .line 167
    .line 168
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 169
    .line 170
    .line 171
    const v0, 0x3fb0a3d7    # 1.38f

    .line 172
    .line 173
    .line 174
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 175
    .line 176
    .line 177
    const v17, -0x40ab851f    # -0.83f

    .line 178
    .line 179
    .line 180
    const v18, 0x3fcf5c29    # 1.62f

    .line 181
    .line 182
    .line 183
    const/high16 v13, -0x41000000    # -0.5f

    .line 184
    .line 185
    const v14, 0x3eb851ec    # 0.36f

    .line 186
    .line 187
    .line 188
    const v15, -0x40ab851f    # -0.83f

    .line 189
    .line 190
    .line 191
    const v16, 0x3f733333    # 0.95f

    .line 192
    .line 193
    .line 194
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 195
    .line 196
    .line 197
    const v17, 0x3ffeb852    # 1.99f

    .line 198
    .line 199
    .line 200
    const/high16 v18, 0x40000000    # 2.0f

    .line 201
    .line 202
    const/4 v13, 0x0

    .line 203
    const v14, 0x3f8ccccd    # 1.1f

    .line 204
    .line 205
    .line 206
    const v15, 0x3f63d70a    # 0.89f

    .line 207
    .line 208
    .line 209
    const/high16 v16, 0x40000000    # 2.0f

    .line 210
    .line 211
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 212
    .line 213
    .line 214
    const v17, 0x3fcf5c29    # 1.62f

    .line 215
    .line 216
    .line 217
    const v18, -0x40a8f5c3    # -0.84f

    .line 218
    .line 219
    .line 220
    const v13, 0x3f2b851f    # 0.67f

    .line 221
    .line 222
    .line 223
    const/4 v14, 0x0

    .line 224
    const v15, 0x3fa147ae    # 1.26f

    .line 225
    .line 226
    .line 227
    const v16, -0x41570a3d    # -0.33f

    .line 228
    .line 229
    .line 230
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 231
    .line 232
    .line 233
    const v0, 0x400851ec    # 2.13f

    .line 234
    .line 235
    .line 236
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 237
    .line 238
    .line 239
    const v17, 0x3fb47ae1    # 1.41f

    .line 240
    .line 241
    .line 242
    const/16 v18, 0x0

    .line 243
    .line 244
    const v13, 0x3ec7ae14    # 0.39f

    .line 245
    .line 246
    .line 247
    const v14, 0x3ec7ae14    # 0.39f

    .line 248
    .line 249
    .line 250
    const v15, 0x3f828f5c    # 1.02f

    .line 251
    .line 252
    .line 253
    const v16, 0x3ec7ae14    # 0.39f

    .line 254
    .line 255
    .line 256
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 257
    .line 258
    .line 259
    const/16 v17, 0x0

    .line 260
    .line 261
    const v18, -0x404b851f    # -1.41f

    .line 262
    .line 263
    .line 264
    const v14, -0x413851ec    # -0.39f

    .line 265
    .line 266
    .line 267
    const v15, 0x3ec7ae14    # 0.39f

    .line 268
    .line 269
    .line 270
    const v16, -0x407d70a4    # -1.02f

    .line 271
    .line 272
    .line 273
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 274
    .line 275
    .line 276
    const v0, 0x4007ae14    # 2.12f

    .line 277
    .line 278
    .line 279
    const v2, 0x3fea3d71    # 1.83f

    .line 280
    .line 281
    .line 282
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 283
    .line 284
    .line 285
    const v17, -0x404b851f    # -1.41f

    .line 286
    .line 287
    .line 288
    const/16 v18, 0x0

    .line 289
    .line 290
    const v13, -0x413851ec    # -0.39f

    .line 291
    .line 292
    .line 293
    const v15, -0x407d70a4    # -1.02f

    .line 294
    .line 295
    .line 296
    const v16, -0x413851ec    # -0.39f

    .line 297
    .line 298
    .line 299
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 300
    .line 301
    .line 302
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 303
    .line 304
    .line 305
    const/high16 v0, 0x41700000    # 15.0f

    .line 306
    .line 307
    const/high16 v2, 0x40e00000    # 7.0f

    .line 308
    .line 309
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 310
    .line 311
    .line 312
    const v0, 0x3f8ccccd    # 1.1f

    .line 313
    .line 314
    .line 315
    const/high16 v2, -0x40000000    # -2.0f

    .line 316
    .line 317
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 318
    .line 319
    .line 320
    const v0, 0x40170a3d    # 2.36f

    .line 321
    .line 322
    .line 323
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 324
    .line 325
    .line 326
    const/high16 v0, 0x40000000    # 2.0f

    .line 327
    .line 328
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 329
    .line 330
    .line 331
    const/high16 v0, 0x41700000    # 15.0f

    .line 332
    .line 333
    const/high16 v2, 0x40e00000    # 7.0f

    .line 334
    .line 335
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 336
    .line 337
    .line 338
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 339
    .line 340
    .line 341
    const v0, 0x41806666    # 16.05f

    .line 342
    .line 343
    .line 344
    const v2, 0x414f0a3d    # 12.94f

    .line 345
    .line 346
    .line 347
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 348
    .line 349
    .line 350
    const/high16 v17, 0x3fa00000    # 1.25f

    .line 351
    .line 352
    const v18, -0x4087ae14    # -0.97f

    .line 353
    .line 354
    .line 355
    const v13, 0x3f0a3d71    # 0.54f

    .line 356
    .line 357
    .line 358
    const v14, -0x41f0a3d7    # -0.14f

    .line 359
    .line 360
    .line 361
    const v15, 0x3f7d70a4    # 0.99f

    .line 362
    .line 363
    .line 364
    const v16, -0x41051eb8    # -0.49f

    .line 365
    .line 366
    .line 367
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 368
    .line 369
    .line 370
    const v0, 0x40651eb8    # 3.58f

    .line 371
    .line 372
    .line 373
    const v2, -0x3f3051ec    # -6.49f

    .line 374
    .line 375
    .line 376
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 377
    .line 378
    .line 379
    const/high16 v17, 0x41a00000    # 20.0f

    .line 380
    .line 381
    const/high16 v18, 0x40800000    # 4.0f

    .line 382
    .line 383
    const/high16 v13, 0x41aa0000    # 21.25f

    .line 384
    .line 385
    const v14, 0x409a3d71    # 4.82f

    .line 386
    .line 387
    .line 388
    const v15, 0x41a6147b    # 20.76f

    .line 389
    .line 390
    .line 391
    const/high16 v16, 0x40800000    # 4.0f

    .line 392
    .line 393
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 394
    .line 395
    .line 396
    const v0, 0x40e3d70a    # 7.12f

    .line 397
    .line 398
    .line 399
    const/high16 v2, 0x40800000    # 4.0f

    .line 400
    .line 401
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 402
    .line 403
    .line 404
    const v0, 0x410ee148    # 8.93f

    .line 405
    .line 406
    .line 407
    const v2, 0x410f0a3d    # 8.94f

    .line 408
    .line 409
    .line 410
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 411
    .line 412
    .line 413
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 414
    .line 415
    .line 416
    const/high16 v0, 0x41900000    # 18.0f

    .line 417
    .line 418
    const/high16 v2, 0x40e00000    # 7.0f

    .line 419
    .line 420
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 421
    .line 422
    .line 423
    const v17, -0x400147ae    # -1.99f

    .line 424
    .line 425
    .line 426
    const/high16 v18, 0x40000000    # 2.0f

    .line 427
    .line 428
    const v13, -0x40733333    # -1.1f

    .line 429
    .line 430
    .line 431
    const/4 v14, 0x0

    .line 432
    const v15, -0x400147ae    # -1.99f

    .line 433
    .line 434
    .line 435
    const v16, 0x3f666666    # 0.9f

    .line 436
    .line 437
    .line 438
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 439
    .line 440
    .line 441
    const v0, 0x40bccccd    # 5.9f

    .line 442
    .line 443
    .line 444
    const/high16 v2, 0x41b00000    # 22.0f

    .line 445
    .line 446
    const/high16 v4, 0x40e00000    # 7.0f

    .line 447
    .line 448
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 449
    .line 450
    .line 451
    const v0, -0x4099999a    # -0.9f

    .line 452
    .line 453
    .line 454
    const/high16 v2, 0x40000000    # 2.0f

    .line 455
    .line 456
    const/high16 v4, -0x40000000    # -2.0f

    .line 457
    .line 458
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 459
    .line 460
    .line 461
    const/high16 v2, -0x40000000    # -2.0f

    .line 462
    .line 463
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 464
    .line 465
    .line 466
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 467
    .line 468
    .line 469
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 470
    .line 471
    .line 472
    move-result-object v2

    .line 473
    const/16 v16, 0x3800

    .line 474
    .line 475
    const/16 v17, 0x0

    .line 476
    .line 477
    const/high16 v6, 0x3f800000    # 1.0f

    .line 478
    .line 479
    const/high16 v8, 0x3f800000    # 1.0f

    .line 480
    .line 481
    const/4 v7, 0x0

    .line 482
    const/high16 v9, 0x3f800000    # 1.0f

    .line 483
    .line 484
    const/high16 v12, 0x3f800000    # 1.0f

    .line 485
    .line 486
    const/4 v13, 0x0

    .line 487
    const/4 v15, 0x0

    .line 488
    const-string v4, ""

    .line 489
    .line 490
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 491
    .line 492
    .line 493
    move-result-object v0

    .line 494
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 495
    .line 496
    .line 497
    move-result-object v0

    .line 498
    sput-object v0, Landroidx/compose/material/icons/rounded/RemoveShoppingCartKt;->_removeShoppingCart:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 499
    .line 500
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 501
    .line 502
    .line 503
    return-object v0
.end method
