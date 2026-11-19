.class public final Landroidx/compose/material/icons/rounded/PermDataSettingKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_permDataSetting",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "PermDataSetting",
        "Landroidx/compose/material/icons/Icons$Rounded;",
        "getPermDataSetting",
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
        "SMAP\nPermDataSetting.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PermDataSetting.kt\nandroidx/compose/material/icons/rounded/PermDataSettingKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,93:1\n212#2,12:94\n233#2,18:107\n253#2:144\n174#3:106\n705#4,2:125\n717#4,2:127\n719#4,11:133\n72#5,4:129\n*S KotlinDebug\n*F\n+ 1 PermDataSetting.kt\nandroidx/compose/material/icons/rounded/PermDataSettingKt\n*L\n29#1:94,12\n30#1:107,18\n30#1:144\n29#1:106\n30#1:125,2\n30#1:127,2\n30#1:133,11\n30#1:129,4\n*E\n"
    }
.end annotation


# static fields
.field private static _permDataSetting:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getPermDataSetting(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/PermDataSettingKt;->_permDataSetting:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.PermDataSetting"

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
    const/high16 v0, 0x41380000    # 11.5f

    .line 71
    .line 72
    const v2, 0x4197eb85    # 18.99f

    .line 73
    .line 74
    .line 75
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    const v17, 0x3f8147ae    # 1.01f

    .line 79
    .line 80
    .line 81
    const v18, 0x3d8f5c29    # 0.07f

    .line 82
    .line 83
    .line 84
    const v13, 0x3eae147b    # 0.34f

    .line 85
    .line 86
    .line 87
    const/4 v14, 0x0

    .line 88
    const v15, 0x3f2e147b    # 0.68f

    .line 89
    .line 90
    .line 91
    const v16, 0x3cf5c28f    # 0.03f

    .line 92
    .line 93
    .line 94
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 95
    .line 96
    .line 97
    const/high16 v0, 0x41a00000    # 20.0f

    .line 98
    .line 99
    const v2, 0x401ae148    # 2.42f

    .line 100
    .line 101
    .line 102
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 103
    .line 104
    .line 105
    const v17, -0x40251eb8    # -1.71f

    .line 106
    .line 107
    .line 108
    const v18, -0x40ca3d71    # -0.71f

    .line 109
    .line 110
    .line 111
    const/4 v13, 0x0

    .line 112
    const v14, -0x409c28f6    # -0.89f

    .line 113
    .line 114
    .line 115
    const v15, -0x4075c28f    # -1.08f

    .line 116
    .line 117
    .line 118
    const v16, -0x40547ae1    # -1.34f

    .line 119
    .line 120
    .line 121
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 122
    .line 123
    .line 124
    const v0, 0x3fdae148    # 1.71f

    .line 125
    .line 126
    .line 127
    const v2, 0x419251ec    # 18.29f

    .line 128
    .line 129
    .line 130
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 131
    .line 132
    .line 133
    const v17, 0x3f333333    # 0.7f

    .line 134
    .line 135
    .line 136
    const v18, 0x3fdae148    # 1.71f

    .line 137
    .line 138
    .line 139
    const v13, -0x40deb852    # -0.63f

    .line 140
    .line 141
    .line 142
    const v14, 0x3f2147ae    # 0.63f

    .line 143
    .line 144
    .line 145
    const v15, -0x41bd70a4    # -0.19f

    .line 146
    .line 147
    .line 148
    const v16, 0x3fdae148    # 1.71f

    .line 149
    .line 150
    .line 151
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 152
    .line 153
    .line 154
    const v0, 0x41126666    # 9.15f

    .line 155
    .line 156
    .line 157
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 158
    .line 159
    .line 160
    const v17, -0x4270a3d7    # -0.07f

    .line 161
    .line 162
    .line 163
    const/high16 v18, -0x40800000    # -1.0f

    .line 164
    .line 165
    const v13, -0x42dc28f6    # -0.04f

    .line 166
    .line 167
    .line 168
    const v14, -0x41570a3d    # -0.33f

    .line 169
    .line 170
    .line 171
    const v15, -0x4270a3d7    # -0.07f

    .line 172
    .line 173
    .line 174
    const v16, -0x40d70a3d    # -0.66f

    .line 175
    .line 176
    .line 177
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 178
    .line 179
    .line 180
    const/high16 v17, 0x40f00000    # 7.5f

    .line 181
    .line 182
    const/high16 v18, -0x3f100000    # -7.5f

    .line 183
    .line 184
    const/4 v13, 0x0

    .line 185
    const v14, -0x3f7b851f    # -4.14f

    .line 186
    .line 187
    .line 188
    const v15, 0x40570a3d    # 3.36f

    .line 189
    .line 190
    .line 191
    const/high16 v16, -0x3f100000    # -7.5f

    .line 192
    .line 193
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 194
    .line 195
    .line 196
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 197
    .line 198
    .line 199
    const v0, 0x41b5999a    # 22.7f

    .line 200
    .line 201
    .line 202
    const v2, 0x419beb85    # 19.49f

    .line 203
    .line 204
    .line 205
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 206
    .line 207
    .line 208
    const v17, 0x3d23d70a    # 0.04f

    .line 209
    .line 210
    .line 211
    const v18, -0x41051eb8    # -0.49f

    .line 212
    .line 213
    .line 214
    const v13, 0x3ca3d70a    # 0.02f

    .line 215
    .line 216
    .line 217
    const v14, -0x41dc28f6    # -0.16f

    .line 218
    .line 219
    .line 220
    const v15, 0x3d23d70a    # 0.04f

    .line 221
    .line 222
    .line 223
    const v16, -0x415c28f6    # -0.32f

    .line 224
    .line 225
    .line 226
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 227
    .line 228
    .line 229
    const v0, -0x42dc28f6    # -0.04f

    .line 230
    .line 231
    .line 232
    const v2, -0x41051eb8    # -0.49f

    .line 233
    .line 234
    .line 235
    const v4, -0x43dc28f6    # -0.01f

    .line 236
    .line 237
    .line 238
    const v6, -0x41570a3d    # -0.33f

    .line 239
    .line 240
    .line 241
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 242
    .line 243
    .line 244
    const v0, -0x40ab851f    # -0.83f

    .line 245
    .line 246
    .line 247
    const v2, 0x3f87ae14    # 1.06f

    .line 248
    .line 249
    .line 250
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 251
    .line 252
    .line 253
    const v17, 0x3d75c28f    # 0.06f

    .line 254
    .line 255
    .line 256
    const v18, -0x415c28f6    # -0.32f

    .line 257
    .line 258
    .line 259
    const v13, 0x3db851ec    # 0.09f

    .line 260
    .line 261
    .line 262
    const v14, -0x425c28f6    # -0.08f

    .line 263
    .line 264
    .line 265
    const v15, 0x3df5c28f    # 0.12f

    .line 266
    .line 267
    .line 268
    const v16, -0x41a8f5c3    # -0.21f

    .line 269
    .line 270
    .line 271
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 272
    .line 273
    .line 274
    const v0, -0x40228f5c    # -1.73f

    .line 275
    .line 276
    .line 277
    const/high16 v2, -0x40800000    # -1.0f

    .line 278
    .line 279
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 280
    .line 281
    .line 282
    const v17, -0x416147ae    # -0.31f

    .line 283
    .line 284
    .line 285
    const v18, -0x421eb852    # -0.11f

    .line 286
    .line 287
    .line 288
    const v13, -0x428a3d71    # -0.06f

    .line 289
    .line 290
    .line 291
    const v14, -0x421eb852    # -0.11f

    .line 292
    .line 293
    .line 294
    const v15, -0x41bd70a4    # -0.19f

    .line 295
    .line 296
    .line 297
    const v16, -0x41e66666    # -0.15f

    .line 298
    .line 299
    .line 300
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 301
    .line 302
    .line 303
    const/high16 v0, 0x3f000000    # 0.5f

    .line 304
    .line 305
    const v2, -0x406147ae    # -1.24f

    .line 306
    .line 307
    .line 308
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 309
    .line 310
    .line 311
    const v17, -0x40a66666    # -0.85f

    .line 312
    .line 313
    .line 314
    const v18, -0x41051eb8    # -0.49f

    .line 315
    .line 316
    .line 317
    const v13, -0x417ae148    # -0.26f

    .line 318
    .line 319
    .line 320
    const v14, -0x41b33333    # -0.2f

    .line 321
    .line 322
    .line 323
    const v15, -0x40f5c28f    # -0.54f

    .line 324
    .line 325
    .line 326
    const v16, -0x41428f5c    # -0.37f

    .line 327
    .line 328
    .line 329
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 330
    .line 331
    .line 332
    const v0, -0x40570a3d    # -1.32f

    .line 333
    .line 334
    .line 335
    const v2, -0x41bd70a4    # -0.19f

    .line 336
    .line 337
    .line 338
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 339
    .line 340
    .line 341
    const v17, -0x418a3d71    # -0.24f

    .line 342
    .line 343
    .line 344
    const v18, -0x41a8f5c3    # -0.21f

    .line 345
    .line 346
    .line 347
    const v13, -0x43dc28f6    # -0.01f

    .line 348
    .line 349
    .line 350
    const v14, -0x420a3d71    # -0.12f

    .line 351
    .line 352
    .line 353
    const v15, -0x420a3d71    # -0.12f

    .line 354
    .line 355
    .line 356
    const v16, -0x41a8f5c3    # -0.21f

    .line 357
    .line 358
    .line 359
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 360
    .line 361
    .line 362
    const/high16 v0, -0x40000000    # -2.0f

    .line 363
    .line 364
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 365
    .line 366
    .line 367
    const/high16 v17, -0x41800000    # -0.25f

    .line 368
    .line 369
    const v18, 0x3e570a3d    # 0.21f

    .line 370
    .line 371
    .line 372
    const v13, -0x420a3d71    # -0.12f

    .line 373
    .line 374
    .line 375
    const/4 v14, 0x0

    .line 376
    const v15, -0x41947ae1    # -0.23f

    .line 377
    .line 378
    .line 379
    const v16, 0x3db851ec    # 0.09f

    .line 380
    .line 381
    .line 382
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 383
    .line 384
    .line 385
    const v0, 0x3fa8f5c3    # 1.32f

    .line 386
    .line 387
    .line 388
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 389
    .line 390
    .line 391
    const v17, -0x40a66666    # -0.85f

    .line 392
    .line 393
    .line 394
    const v18, 0x3efae148    # 0.49f

    .line 395
    .line 396
    .line 397
    const v13, -0x41666666    # -0.3f

    .line 398
    .line 399
    .line 400
    const v14, 0x3e051eb8    # 0.13f

    .line 401
    .line 402
    .line 403
    const v15, -0x40e8f5c3    # -0.59f

    .line 404
    .line 405
    .line 406
    const v16, 0x3e947ae1    # 0.29f

    .line 407
    .line 408
    .line 409
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 410
    .line 411
    .line 412
    const/high16 v0, -0x41000000    # -0.5f

    .line 413
    .line 414
    const v2, -0x406147ae    # -1.24f

    .line 415
    .line 416
    .line 417
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 418
    .line 419
    .line 420
    const v17, -0x416147ae    # -0.31f

    .line 421
    .line 422
    .line 423
    const v18, 0x3de147ae    # 0.11f

    .line 424
    .line 425
    .line 426
    const v13, -0x421eb852    # -0.11f

    .line 427
    .line 428
    .line 429
    const v14, -0x42dc28f6    # -0.04f

    .line 430
    .line 431
    .line 432
    const v15, -0x418a3d71    # -0.24f

    .line 433
    .line 434
    .line 435
    const/16 v16, 0x0

    .line 436
    .line 437
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 438
    .line 439
    .line 440
    const v0, 0x3fdd70a4    # 1.73f

    .line 441
    .line 442
    .line 443
    const/high16 v2, -0x40800000    # -1.0f

    .line 444
    .line 445
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 446
    .line 447
    .line 448
    const v17, 0x3d75c28f    # 0.06f

    .line 449
    .line 450
    .line 451
    const v18, 0x3ea3d70a    # 0.32f

    .line 452
    .line 453
    .line 454
    const v13, -0x428a3d71    # -0.06f

    .line 455
    .line 456
    .line 457
    const v14, 0x3de147ae    # 0.11f

    .line 458
    .line 459
    .line 460
    const v15, -0x42dc28f6    # -0.04f

    .line 461
    .line 462
    .line 463
    const v16, 0x3e75c28f    # 0.24f

    .line 464
    .line 465
    .line 466
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 467
    .line 468
    .line 469
    const v0, 0x3f547ae1    # 0.83f

    .line 470
    .line 471
    .line 472
    const v2, 0x3f87ae14    # 1.06f

    .line 473
    .line 474
    .line 475
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 476
    .line 477
    .line 478
    const v17, -0x430a3d71    # -0.03f

    .line 479
    .line 480
    .line 481
    const v18, 0x3efae148    # 0.49f

    .line 482
    .line 483
    .line 484
    const v13, -0x435c28f6    # -0.02f

    .line 485
    .line 486
    .line 487
    const v14, 0x3e23d70a    # 0.16f

    .line 488
    .line 489
    .line 490
    const v15, -0x430a3d71    # -0.03f

    .line 491
    .line 492
    .line 493
    const v16, 0x3ea3d70a    # 0.32f

    .line 494
    .line 495
    .line 496
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 497
    .line 498
    .line 499
    const v0, 0x3cf5c28f    # 0.03f

    .line 500
    .line 501
    .line 502
    const v2, 0x3efae148    # 0.49f

    .line 503
    .line 504
    .line 505
    const v4, 0x3c23d70a    # 0.01f

    .line 506
    .line 507
    .line 508
    const v6, 0x3ea8f5c3    # 0.33f

    .line 509
    .line 510
    .line 511
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 512
    .line 513
    .line 514
    const v0, -0x407851ec    # -1.06f

    .line 515
    .line 516
    .line 517
    const v2, 0x3f547ae1    # 0.83f

    .line 518
    .line 519
    .line 520
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 521
    .line 522
    .line 523
    const v17, -0x428a3d71    # -0.06f

    .line 524
    .line 525
    .line 526
    const v18, 0x3ea3d70a    # 0.32f

    .line 527
    .line 528
    .line 529
    const v13, -0x4247ae14    # -0.09f

    .line 530
    .line 531
    .line 532
    const v14, 0x3da3d70a    # 0.08f

    .line 533
    .line 534
    .line 535
    const v15, -0x420a3d71    # -0.12f

    .line 536
    .line 537
    .line 538
    const v16, 0x3e570a3d    # 0.21f

    .line 539
    .line 540
    .line 541
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 542
    .line 543
    .line 544
    const/high16 v0, 0x3f800000    # 1.0f

    .line 545
    .line 546
    const v2, 0x3fdd70a4    # 1.73f

    .line 547
    .line 548
    .line 549
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 550
    .line 551
    .line 552
    const v17, 0x3e9eb852    # 0.31f

    .line 553
    .line 554
    .line 555
    const v18, 0x3de147ae    # 0.11f

    .line 556
    .line 557
    .line 558
    const v13, 0x3d75c28f    # 0.06f

    .line 559
    .line 560
    .line 561
    const v14, 0x3de147ae    # 0.11f

    .line 562
    .line 563
    .line 564
    const v15, 0x3e428f5c    # 0.19f

    .line 565
    .line 566
    .line 567
    const v16, 0x3e19999a    # 0.15f

    .line 568
    .line 569
    .line 570
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 571
    .line 572
    .line 573
    const v0, 0x3f9eb852    # 1.24f

    .line 574
    .line 575
    .line 576
    const/high16 v2, -0x41000000    # -0.5f

    .line 577
    .line 578
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 579
    .line 580
    .line 581
    const v17, 0x3f59999a    # 0.85f

    .line 582
    .line 583
    .line 584
    const v18, 0x3efae148    # 0.49f

    .line 585
    .line 586
    .line 587
    const v13, 0x3e851eb8    # 0.26f

    .line 588
    .line 589
    .line 590
    const v14, 0x3e4ccccd    # 0.2f

    .line 591
    .line 592
    .line 593
    const v15, 0x3f0a3d71    # 0.54f

    .line 594
    .line 595
    .line 596
    const v16, 0x3ebd70a4    # 0.37f

    .line 597
    .line 598
    .line 599
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 600
    .line 601
    .line 602
    const v0, 0x3e428f5c    # 0.19f

    .line 603
    .line 604
    .line 605
    const v2, 0x3fa8f5c3    # 1.32f

    .line 606
    .line 607
    .line 608
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 609
    .line 610
    .line 611
    const/high16 v17, 0x3e800000    # 0.25f

    .line 612
    .line 613
    const v18, 0x3e570a3d    # 0.21f

    .line 614
    .line 615
    .line 616
    const v13, 0x3ca3d70a    # 0.02f

    .line 617
    .line 618
    .line 619
    const v14, 0x3df5c28f    # 0.12f

    .line 620
    .line 621
    .line 622
    const v15, 0x3df5c28f    # 0.12f

    .line 623
    .line 624
    .line 625
    const v16, 0x3e570a3d    # 0.21f

    .line 626
    .line 627
    .line 628
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 629
    .line 630
    .line 631
    const/high16 v0, 0x40000000    # 2.0f

    .line 632
    .line 633
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 634
    .line 635
    .line 636
    const v18, -0x41a8f5c3    # -0.21f

    .line 637
    .line 638
    .line 639
    const v13, 0x3df5c28f    # 0.12f

    .line 640
    .line 641
    .line 642
    const/4 v14, 0x0

    .line 643
    const v15, 0x3e6b851f    # 0.23f

    .line 644
    .line 645
    .line 646
    const v16, -0x4247ae14    # -0.09f

    .line 647
    .line 648
    .line 649
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 650
    .line 651
    .line 652
    const v0, 0x3e428f5c    # 0.19f

    .line 653
    .line 654
    .line 655
    const v2, -0x40570a3d    # -1.32f

    .line 656
    .line 657
    .line 658
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 659
    .line 660
    .line 661
    const v17, 0x3f570a3d    # 0.84f

    .line 662
    .line 663
    .line 664
    const v18, -0x41051eb8    # -0.49f

    .line 665
    .line 666
    .line 667
    const v13, 0x3e99999a    # 0.3f

    .line 668
    .line 669
    .line 670
    const v14, -0x41fae148    # -0.13f

    .line 671
    .line 672
    .line 673
    const v15, 0x3f170a3d    # 0.59f

    .line 674
    .line 675
    .line 676
    const v16, -0x416b851f    # -0.29f

    .line 677
    .line 678
    .line 679
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 680
    .line 681
    .line 682
    const/high16 v0, 0x3fa00000    # 1.25f

    .line 683
    .line 684
    const/high16 v2, 0x3f000000    # 0.5f

    .line 685
    .line 686
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 687
    .line 688
    .line 689
    const v17, 0x3e9eb852    # 0.31f

    .line 690
    .line 691
    .line 692
    const v18, -0x421eb852    # -0.11f

    .line 693
    .line 694
    .line 695
    const v13, 0x3de147ae    # 0.11f

    .line 696
    .line 697
    .line 698
    const v14, 0x3d23d70a    # 0.04f

    .line 699
    .line 700
    .line 701
    const v15, 0x3e75c28f    # 0.24f

    .line 702
    .line 703
    .line 704
    const/16 v16, 0x0

    .line 705
    .line 706
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 707
    .line 708
    .line 709
    const/high16 v0, 0x3f800000    # 1.0f

    .line 710
    .line 711
    const v2, -0x40228f5c    # -1.73f

    .line 712
    .line 713
    .line 714
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 715
    .line 716
    .line 717
    const v17, -0x428a3d71    # -0.06f

    .line 718
    .line 719
    .line 720
    const v18, -0x415c28f6    # -0.32f

    .line 721
    .line 722
    .line 723
    const v13, 0x3d75c28f    # 0.06f

    .line 724
    .line 725
    .line 726
    const v14, -0x421eb852    # -0.11f

    .line 727
    .line 728
    .line 729
    const v15, 0x3cf5c28f    # 0.03f

    .line 730
    .line 731
    .line 732
    const v16, -0x418a3d71    # -0.24f

    .line 733
    .line 734
    .line 735
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 736
    .line 737
    .line 738
    const v0, -0x40770a3d    # -1.07f

    .line 739
    .line 740
    .line 741
    const v2, -0x40ab851f    # -0.83f

    .line 742
    .line 743
    .line 744
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 745
    .line 746
    .line 747
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 748
    .line 749
    .line 750
    const/high16 v0, 0x41a40000    # 20.5f

    .line 751
    .line 752
    const v2, 0x4197eb85    # 18.99f

    .line 753
    .line 754
    .line 755
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 756
    .line 757
    .line 758
    const/high16 v17, -0x40400000    # -1.5f

    .line 759
    .line 760
    const/high16 v18, -0x40400000    # -1.5f

    .line 761
    .line 762
    const v13, -0x40ab851f    # -0.83f

    .line 763
    .line 764
    .line 765
    const/4 v14, 0x0

    .line 766
    const/high16 v15, -0x40400000    # -1.5f

    .line 767
    .line 768
    const v16, -0x40d47ae1    # -0.67f

    .line 769
    .line 770
    .line 771
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 772
    .line 773
    .line 774
    const v0, 0x3f2b851f    # 0.67f

    .line 775
    .line 776
    .line 777
    const/high16 v2, -0x40400000    # -1.5f

    .line 778
    .line 779
    const/high16 v4, 0x3fc00000    # 1.5f

    .line 780
    .line 781
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 782
    .line 783
    .line 784
    const/high16 v2, 0x3fc00000    # 1.5f

    .line 785
    .line 786
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 787
    .line 788
    .line 789
    const v0, -0x40d47ae1    # -0.67f

    .line 790
    .line 791
    .line 792
    const/high16 v2, -0x40400000    # -1.5f

    .line 793
    .line 794
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 795
    .line 796
    .line 797
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 798
    .line 799
    .line 800
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 801
    .line 802
    .line 803
    move-result-object v2

    .line 804
    const/16 v16, 0x3800

    .line 805
    .line 806
    const/16 v17, 0x0

    .line 807
    .line 808
    const/high16 v6, 0x3f800000    # 1.0f

    .line 809
    .line 810
    const/high16 v8, 0x3f800000    # 1.0f

    .line 811
    .line 812
    const/4 v7, 0x0

    .line 813
    const/high16 v9, 0x3f800000    # 1.0f

    .line 814
    .line 815
    const/high16 v12, 0x3f800000    # 1.0f

    .line 816
    .line 817
    const/4 v13, 0x0

    .line 818
    const/4 v15, 0x0

    .line 819
    const-string v4, ""

    .line 820
    .line 821
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 822
    .line 823
    .line 824
    move-result-object v0

    .line 825
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 826
    .line 827
    .line 828
    move-result-object v0

    .line 829
    sput-object v0, Landroidx/compose/material/icons/rounded/PermDataSettingKt;->_permDataSetting:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 830
    .line 831
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 832
    .line 833
    .line 834
    return-object v0
.end method
