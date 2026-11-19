.class public final Landroidx/compose/material/icons/filled/PermDataSettingKt;
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
        "Landroidx/compose/material/icons/Icons$Filled;",
        "getPermDataSetting",
        "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;",
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
        "SMAP\nPermDataSetting.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PermDataSetting.kt\nandroidx/compose/material/icons/filled/PermDataSettingKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,91:1\n212#2,12:92\n233#2,18:105\n253#2:142\n174#3:104\n705#4,2:123\n717#4,2:125\n719#4,11:131\n72#5,4:127\n*S KotlinDebug\n*F\n+ 1 PermDataSetting.kt\nandroidx/compose/material/icons/filled/PermDataSettingKt\n*L\n29#1:92,12\n30#1:105,18\n30#1:142\n29#1:104\n30#1:123,2\n30#1:125,2\n30#1:131,11\n30#1:127,4\n*E\n"
    }
.end annotation


# static fields
.field private static _permDataSetting:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getPermDataSetting(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/filled/PermDataSettingKt;->_permDataSetting:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Filled.PermDataSetting"

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
    const/high16 v17, 0x3f800000    # 1.0f

    .line 79
    .line 80
    const v18, 0x3d8f5c29    # 0.07f

    .line 81
    .line 82
    .line 83
    const v13, 0x3eae147b    # 0.34f

    .line 84
    .line 85
    .line 86
    const/4 v14, 0x0

    .line 87
    const v15, 0x3f2b851f    # 0.67f

    .line 88
    .line 89
    .line 90
    const v16, 0x3cf5c28f    # 0.03f

    .line 91
    .line 92
    .line 93
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 94
    .line 95
    .line 96
    const/4 v0, 0x0

    .line 97
    const/high16 v2, 0x41a00000    # 20.0f

    .line 98
    .line 99
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 100
    .line 101
    .line 102
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 103
    .line 104
    .line 105
    const v0, 0x4138f5c3    # 11.56f

    .line 106
    .line 107
    .line 108
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 109
    .line 110
    .line 111
    const v17, -0x4270a3d7    # -0.07f

    .line 112
    .line 113
    .line 114
    const/high16 v18, -0x40800000    # -1.0f

    .line 115
    .line 116
    const v13, -0x42dc28f6    # -0.04f

    .line 117
    .line 118
    .line 119
    const v14, -0x41570a3d    # -0.33f

    .line 120
    .line 121
    .line 122
    const v15, -0x4270a3d7    # -0.07f

    .line 123
    .line 124
    .line 125
    const v16, -0x40d70a3d    # -0.66f

    .line 126
    .line 127
    .line 128
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 129
    .line 130
    .line 131
    const/high16 v17, 0x40f00000    # 7.5f

    .line 132
    .line 133
    const/high16 v18, -0x3f100000    # -7.5f

    .line 134
    .line 135
    const/4 v13, 0x0

    .line 136
    const v14, -0x3f7b851f    # -4.14f

    .line 137
    .line 138
    .line 139
    const v15, 0x40570a3d    # 3.36f

    .line 140
    .line 141
    .line 142
    const/high16 v16, -0x3f100000    # -7.5f

    .line 143
    .line 144
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 145
    .line 146
    .line 147
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 148
    .line 149
    .line 150
    const v0, 0x41b5999a    # 22.7f

    .line 151
    .line 152
    .line 153
    const v2, 0x419beb85    # 19.49f

    .line 154
    .line 155
    .line 156
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 157
    .line 158
    .line 159
    const v17, 0x3d23d70a    # 0.04f

    .line 160
    .line 161
    .line 162
    const v18, -0x41051eb8    # -0.49f

    .line 163
    .line 164
    .line 165
    const v13, 0x3ca3d70a    # 0.02f

    .line 166
    .line 167
    .line 168
    const v14, -0x41dc28f6    # -0.16f

    .line 169
    .line 170
    .line 171
    const v15, 0x3d23d70a    # 0.04f

    .line 172
    .line 173
    .line 174
    const v16, -0x415c28f6    # -0.32f

    .line 175
    .line 176
    .line 177
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 178
    .line 179
    .line 180
    const v17, -0x42dc28f6    # -0.04f

    .line 181
    .line 182
    .line 183
    const/4 v13, 0x0

    .line 184
    const v14, -0x41d1eb85    # -0.17f

    .line 185
    .line 186
    .line 187
    const v15, -0x43dc28f6    # -0.01f

    .line 188
    .line 189
    .line 190
    const v16, -0x41570a3d    # -0.33f

    .line 191
    .line 192
    .line 193
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 194
    .line 195
    .line 196
    const v0, -0x40ab851f    # -0.83f

    .line 197
    .line 198
    .line 199
    const v2, 0x3f87ae14    # 1.06f

    .line 200
    .line 201
    .line 202
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 203
    .line 204
    .line 205
    const v17, 0x3d75c28f    # 0.06f

    .line 206
    .line 207
    .line 208
    const v18, -0x415c28f6    # -0.32f

    .line 209
    .line 210
    .line 211
    const v13, 0x3db851ec    # 0.09f

    .line 212
    .line 213
    .line 214
    const v14, -0x425c28f6    # -0.08f

    .line 215
    .line 216
    .line 217
    const v15, 0x3df5c28f    # 0.12f

    .line 218
    .line 219
    .line 220
    const v16, -0x41a8f5c3    # -0.21f

    .line 221
    .line 222
    .line 223
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 224
    .line 225
    .line 226
    const v0, -0x40228f5c    # -1.73f

    .line 227
    .line 228
    .line 229
    const/high16 v2, -0x40800000    # -1.0f

    .line 230
    .line 231
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 232
    .line 233
    .line 234
    const v17, -0x416147ae    # -0.31f

    .line 235
    .line 236
    .line 237
    const v18, -0x421eb852    # -0.11f

    .line 238
    .line 239
    .line 240
    const v13, -0x428a3d71    # -0.06f

    .line 241
    .line 242
    .line 243
    const v14, -0x421eb852    # -0.11f

    .line 244
    .line 245
    .line 246
    const v15, -0x41bd70a4    # -0.19f

    .line 247
    .line 248
    .line 249
    const v16, -0x41e66666    # -0.15f

    .line 250
    .line 251
    .line 252
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 253
    .line 254
    .line 255
    const/high16 v0, 0x3f000000    # 0.5f

    .line 256
    .line 257
    const v2, -0x406147ae    # -1.24f

    .line 258
    .line 259
    .line 260
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 261
    .line 262
    .line 263
    const v17, -0x40a66666    # -0.85f

    .line 264
    .line 265
    .line 266
    const v18, -0x41051eb8    # -0.49f

    .line 267
    .line 268
    .line 269
    const v13, -0x417ae148    # -0.26f

    .line 270
    .line 271
    .line 272
    const v14, -0x41b33333    # -0.2f

    .line 273
    .line 274
    .line 275
    const v15, -0x40f5c28f    # -0.54f

    .line 276
    .line 277
    .line 278
    const v16, -0x41428f5c    # -0.37f

    .line 279
    .line 280
    .line 281
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 282
    .line 283
    .line 284
    const v0, -0x40570a3d    # -1.32f

    .line 285
    .line 286
    .line 287
    const v2, -0x41bd70a4    # -0.19f

    .line 288
    .line 289
    .line 290
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 291
    .line 292
    .line 293
    const v17, -0x418a3d71    # -0.24f

    .line 294
    .line 295
    .line 296
    const v18, -0x41a8f5c3    # -0.21f

    .line 297
    .line 298
    .line 299
    const v13, -0x43dc28f6    # -0.01f

    .line 300
    .line 301
    .line 302
    const v14, -0x420a3d71    # -0.12f

    .line 303
    .line 304
    .line 305
    const v15, -0x420a3d71    # -0.12f

    .line 306
    .line 307
    .line 308
    const v16, -0x41a8f5c3    # -0.21f

    .line 309
    .line 310
    .line 311
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 312
    .line 313
    .line 314
    const/high16 v0, -0x40000000    # -2.0f

    .line 315
    .line 316
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 317
    .line 318
    .line 319
    const/high16 v17, -0x41800000    # -0.25f

    .line 320
    .line 321
    const v18, 0x3e570a3d    # 0.21f

    .line 322
    .line 323
    .line 324
    const v13, -0x420a3d71    # -0.12f

    .line 325
    .line 326
    .line 327
    const/4 v14, 0x0

    .line 328
    const v15, -0x41947ae1    # -0.23f

    .line 329
    .line 330
    .line 331
    const v16, 0x3db851ec    # 0.09f

    .line 332
    .line 333
    .line 334
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 335
    .line 336
    .line 337
    const v0, 0x3fa8f5c3    # 1.32f

    .line 338
    .line 339
    .line 340
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 341
    .line 342
    .line 343
    const v17, -0x40a66666    # -0.85f

    .line 344
    .line 345
    .line 346
    const v18, 0x3efae148    # 0.49f

    .line 347
    .line 348
    .line 349
    const v13, -0x41666666    # -0.3f

    .line 350
    .line 351
    .line 352
    const v14, 0x3e051eb8    # 0.13f

    .line 353
    .line 354
    .line 355
    const v15, -0x40e8f5c3    # -0.59f

    .line 356
    .line 357
    .line 358
    const v16, 0x3e947ae1    # 0.29f

    .line 359
    .line 360
    .line 361
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 362
    .line 363
    .line 364
    const/high16 v0, -0x41000000    # -0.5f

    .line 365
    .line 366
    const v2, -0x406147ae    # -1.24f

    .line 367
    .line 368
    .line 369
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 370
    .line 371
    .line 372
    const v17, -0x416147ae    # -0.31f

    .line 373
    .line 374
    .line 375
    const v18, 0x3de147ae    # 0.11f

    .line 376
    .line 377
    .line 378
    const v13, -0x421eb852    # -0.11f

    .line 379
    .line 380
    .line 381
    const v14, -0x42dc28f6    # -0.04f

    .line 382
    .line 383
    .line 384
    const v15, -0x418a3d71    # -0.24f

    .line 385
    .line 386
    .line 387
    const/16 v16, 0x0

    .line 388
    .line 389
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 390
    .line 391
    .line 392
    const v0, 0x3fdd70a4    # 1.73f

    .line 393
    .line 394
    .line 395
    const/high16 v2, -0x40800000    # -1.0f

    .line 396
    .line 397
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 398
    .line 399
    .line 400
    const v17, 0x3d75c28f    # 0.06f

    .line 401
    .line 402
    .line 403
    const v18, 0x3ea3d70a    # 0.32f

    .line 404
    .line 405
    .line 406
    const v13, -0x428a3d71    # -0.06f

    .line 407
    .line 408
    .line 409
    const v14, 0x3de147ae    # 0.11f

    .line 410
    .line 411
    .line 412
    const v15, -0x42dc28f6    # -0.04f

    .line 413
    .line 414
    .line 415
    const v16, 0x3e75c28f    # 0.24f

    .line 416
    .line 417
    .line 418
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 419
    .line 420
    .line 421
    const v0, 0x3f547ae1    # 0.83f

    .line 422
    .line 423
    .line 424
    const v2, 0x3f87ae14    # 1.06f

    .line 425
    .line 426
    .line 427
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 428
    .line 429
    .line 430
    const v17, -0x430a3d71    # -0.03f

    .line 431
    .line 432
    .line 433
    const v18, 0x3efae148    # 0.49f

    .line 434
    .line 435
    .line 436
    const v13, -0x435c28f6    # -0.02f

    .line 437
    .line 438
    .line 439
    const v14, 0x3e23d70a    # 0.16f

    .line 440
    .line 441
    .line 442
    const v15, -0x430a3d71    # -0.03f

    .line 443
    .line 444
    .line 445
    const v16, 0x3ea3d70a    # 0.32f

    .line 446
    .line 447
    .line 448
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 449
    .line 450
    .line 451
    const v17, 0x3cf5c28f    # 0.03f

    .line 452
    .line 453
    .line 454
    const/4 v13, 0x0

    .line 455
    const v14, 0x3e2e147b    # 0.17f

    .line 456
    .line 457
    .line 458
    const v15, 0x3c23d70a    # 0.01f

    .line 459
    .line 460
    .line 461
    const v16, 0x3ea8f5c3    # 0.33f

    .line 462
    .line 463
    .line 464
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 465
    .line 466
    .line 467
    const v0, -0x407851ec    # -1.06f

    .line 468
    .line 469
    .line 470
    const v2, 0x3f547ae1    # 0.83f

    .line 471
    .line 472
    .line 473
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 474
    .line 475
    .line 476
    const v17, -0x428a3d71    # -0.06f

    .line 477
    .line 478
    .line 479
    const v18, 0x3ea3d70a    # 0.32f

    .line 480
    .line 481
    .line 482
    const v13, -0x4247ae14    # -0.09f

    .line 483
    .line 484
    .line 485
    const v14, 0x3da3d70a    # 0.08f

    .line 486
    .line 487
    .line 488
    const v15, -0x420a3d71    # -0.12f

    .line 489
    .line 490
    .line 491
    const v16, 0x3e570a3d    # 0.21f

    .line 492
    .line 493
    .line 494
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 495
    .line 496
    .line 497
    const/high16 v0, 0x3f800000    # 1.0f

    .line 498
    .line 499
    const v2, 0x3fdd70a4    # 1.73f

    .line 500
    .line 501
    .line 502
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 503
    .line 504
    .line 505
    const v17, 0x3e9eb852    # 0.31f

    .line 506
    .line 507
    .line 508
    const v18, 0x3de147ae    # 0.11f

    .line 509
    .line 510
    .line 511
    const v13, 0x3d75c28f    # 0.06f

    .line 512
    .line 513
    .line 514
    const v14, 0x3de147ae    # 0.11f

    .line 515
    .line 516
    .line 517
    const v15, 0x3e428f5c    # 0.19f

    .line 518
    .line 519
    .line 520
    const v16, 0x3e19999a    # 0.15f

    .line 521
    .line 522
    .line 523
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 524
    .line 525
    .line 526
    const v0, 0x3f9eb852    # 1.24f

    .line 527
    .line 528
    .line 529
    const/high16 v2, -0x41000000    # -0.5f

    .line 530
    .line 531
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 532
    .line 533
    .line 534
    const v17, 0x3f59999a    # 0.85f

    .line 535
    .line 536
    .line 537
    const v18, 0x3efae148    # 0.49f

    .line 538
    .line 539
    .line 540
    const v13, 0x3e851eb8    # 0.26f

    .line 541
    .line 542
    .line 543
    const v14, 0x3e4ccccd    # 0.2f

    .line 544
    .line 545
    .line 546
    const v15, 0x3f0a3d71    # 0.54f

    .line 547
    .line 548
    .line 549
    const v16, 0x3ebd70a4    # 0.37f

    .line 550
    .line 551
    .line 552
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 553
    .line 554
    .line 555
    const v0, 0x3e428f5c    # 0.19f

    .line 556
    .line 557
    .line 558
    const v2, 0x3fa8f5c3    # 1.32f

    .line 559
    .line 560
    .line 561
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 562
    .line 563
    .line 564
    const/high16 v17, 0x3e800000    # 0.25f

    .line 565
    .line 566
    const v18, 0x3e570a3d    # 0.21f

    .line 567
    .line 568
    .line 569
    const v13, 0x3ca3d70a    # 0.02f

    .line 570
    .line 571
    .line 572
    const v14, 0x3df5c28f    # 0.12f

    .line 573
    .line 574
    .line 575
    const v15, 0x3df5c28f    # 0.12f

    .line 576
    .line 577
    .line 578
    const v16, 0x3e570a3d    # 0.21f

    .line 579
    .line 580
    .line 581
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 582
    .line 583
    .line 584
    const/high16 v0, 0x40000000    # 2.0f

    .line 585
    .line 586
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 587
    .line 588
    .line 589
    const v18, -0x41a8f5c3    # -0.21f

    .line 590
    .line 591
    .line 592
    const v13, 0x3df5c28f    # 0.12f

    .line 593
    .line 594
    .line 595
    const/4 v14, 0x0

    .line 596
    const v15, 0x3e6b851f    # 0.23f

    .line 597
    .line 598
    .line 599
    const v16, -0x4247ae14    # -0.09f

    .line 600
    .line 601
    .line 602
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 603
    .line 604
    .line 605
    const v0, 0x3e428f5c    # 0.19f

    .line 606
    .line 607
    .line 608
    const v2, -0x40570a3d    # -1.32f

    .line 609
    .line 610
    .line 611
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 612
    .line 613
    .line 614
    const v17, 0x3f570a3d    # 0.84f

    .line 615
    .line 616
    .line 617
    const v18, -0x41051eb8    # -0.49f

    .line 618
    .line 619
    .line 620
    const v13, 0x3e99999a    # 0.3f

    .line 621
    .line 622
    .line 623
    const v14, -0x41fae148    # -0.13f

    .line 624
    .line 625
    .line 626
    const v15, 0x3f170a3d    # 0.59f

    .line 627
    .line 628
    .line 629
    const v16, -0x416b851f    # -0.29f

    .line 630
    .line 631
    .line 632
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 633
    .line 634
    .line 635
    const/high16 v0, 0x3fa00000    # 1.25f

    .line 636
    .line 637
    const/high16 v2, 0x3f000000    # 0.5f

    .line 638
    .line 639
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 640
    .line 641
    .line 642
    const v17, 0x3e9eb852    # 0.31f

    .line 643
    .line 644
    .line 645
    const v18, -0x421eb852    # -0.11f

    .line 646
    .line 647
    .line 648
    const v13, 0x3de147ae    # 0.11f

    .line 649
    .line 650
    .line 651
    const v14, 0x3d23d70a    # 0.04f

    .line 652
    .line 653
    .line 654
    const v15, 0x3e75c28f    # 0.24f

    .line 655
    .line 656
    .line 657
    const/16 v16, 0x0

    .line 658
    .line 659
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 660
    .line 661
    .line 662
    const/high16 v0, 0x3f800000    # 1.0f

    .line 663
    .line 664
    const v2, -0x40228f5c    # -1.73f

    .line 665
    .line 666
    .line 667
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 668
    .line 669
    .line 670
    const v17, -0x428a3d71    # -0.06f

    .line 671
    .line 672
    .line 673
    const v18, -0x415c28f6    # -0.32f

    .line 674
    .line 675
    .line 676
    const v13, 0x3d75c28f    # 0.06f

    .line 677
    .line 678
    .line 679
    const v14, -0x421eb852    # -0.11f

    .line 680
    .line 681
    .line 682
    const v15, 0x3cf5c28f    # 0.03f

    .line 683
    .line 684
    .line 685
    const v16, -0x418a3d71    # -0.24f

    .line 686
    .line 687
    .line 688
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 689
    .line 690
    .line 691
    const v0, -0x40770a3d    # -1.07f

    .line 692
    .line 693
    .line 694
    const v2, -0x40ab851f    # -0.83f

    .line 695
    .line 696
    .line 697
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 698
    .line 699
    .line 700
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 701
    .line 702
    .line 703
    const/high16 v0, 0x41a40000    # 20.5f

    .line 704
    .line 705
    const v2, 0x4197eb85    # 18.99f

    .line 706
    .line 707
    .line 708
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 709
    .line 710
    .line 711
    const/high16 v17, -0x40400000    # -1.5f

    .line 712
    .line 713
    const/high16 v18, -0x40400000    # -1.5f

    .line 714
    .line 715
    const v13, -0x40ab851f    # -0.83f

    .line 716
    .line 717
    .line 718
    const/4 v14, 0x0

    .line 719
    const/high16 v15, -0x40400000    # -1.5f

    .line 720
    .line 721
    const v16, -0x40d47ae1    # -0.67f

    .line 722
    .line 723
    .line 724
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 725
    .line 726
    .line 727
    const v0, 0x3f2b851f    # 0.67f

    .line 728
    .line 729
    .line 730
    const/high16 v2, -0x40400000    # -1.5f

    .line 731
    .line 732
    const/high16 v4, 0x3fc00000    # 1.5f

    .line 733
    .line 734
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 735
    .line 736
    .line 737
    const/high16 v2, 0x3fc00000    # 1.5f

    .line 738
    .line 739
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 740
    .line 741
    .line 742
    const v0, -0x40d47ae1    # -0.67f

    .line 743
    .line 744
    .line 745
    const/high16 v2, -0x40400000    # -1.5f

    .line 746
    .line 747
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 748
    .line 749
    .line 750
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 751
    .line 752
    .line 753
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 754
    .line 755
    .line 756
    move-result-object v2

    .line 757
    const/16 v16, 0x3800

    .line 758
    .line 759
    const/16 v17, 0x0

    .line 760
    .line 761
    const/high16 v6, 0x3f800000    # 1.0f

    .line 762
    .line 763
    const/high16 v8, 0x3f800000    # 1.0f

    .line 764
    .line 765
    const/4 v7, 0x0

    .line 766
    const/high16 v9, 0x3f800000    # 1.0f

    .line 767
    .line 768
    const/high16 v12, 0x3f800000    # 1.0f

    .line 769
    .line 770
    const/4 v13, 0x0

    .line 771
    const/4 v15, 0x0

    .line 772
    const-string v4, ""

    .line 773
    .line 774
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 775
    .line 776
    .line 777
    move-result-object v0

    .line 778
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 779
    .line 780
    .line 781
    move-result-object v0

    .line 782
    sput-object v0, Landroidx/compose/material/icons/filled/PermDataSettingKt;->_permDataSetting:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 783
    .line 784
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 785
    .line 786
    .line 787
    return-object v0
.end method
