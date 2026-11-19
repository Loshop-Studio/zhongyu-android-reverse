.class public final Landroidx/compose/material/icons/rounded/LineAxisKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_lineAxis",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "LineAxis",
        "Landroidx/compose/material/icons/Icons$Rounded;",
        "getLineAxis",
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
        "SMAP\nLineAxis.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LineAxis.kt\nandroidx/compose/material/icons/rounded/LineAxisKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,68:1\n212#2,12:69\n233#2,18:82\n253#2:119\n174#3:81\n705#4,2:100\n717#4,2:102\n719#4,11:108\n72#5,4:104\n*S KotlinDebug\n*F\n+ 1 LineAxis.kt\nandroidx/compose/material/icons/rounded/LineAxisKt\n*L\n29#1:69,12\n30#1:82,18\n30#1:119\n29#1:81\n30#1:100,2\n30#1:102,2\n30#1:108,11\n30#1:104,4\n*E\n"
    }
.end annotation


# static fields
.field private static _lineAxis:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getLineAxis(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/LineAxisKt;->_lineAxis:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.LineAxis"

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
    const v0, 0x40d8a3d7    # 6.77f

    .line 71
    .line 72
    .line 73
    const v2, 0x41aab852    # 21.34f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 80
    .line 81
    .line 82
    const v17, -0x40466666    # -1.45f

    .line 83
    .line 84
    .line 85
    const v18, 0x3d23d70a    # 0.04f

    .line 86
    .line 87
    .line 88
    const v13, -0x41333333    # -0.4f

    .line 89
    .line 90
    .line 91
    const v14, -0x41333333    # -0.4f

    .line 92
    .line 93
    .line 94
    const v15, -0x40770a3d    # -1.07f

    .line 95
    .line 96
    .line 97
    const v16, -0x413851ec    # -0.39f

    .line 98
    .line 99
    .line 100
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 101
    .line 102
    .line 103
    const v0, -0x3faae148    # -3.33f

    .line 104
    .line 105
    .line 106
    const v2, 0x406f5c29    # 3.74f

    .line 107
    .line 108
    .line 109
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 110
    .line 111
    .line 112
    const v0, -0x3f4b3333    # -5.65f

    .line 113
    .line 114
    .line 115
    const v2, -0x3f5851ec    # -5.24f

    .line 116
    .line 117
    .line 118
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 119
    .line 120
    .line 121
    const v17, 0x41023d71    # 8.14f

    .line 122
    .line 123
    .line 124
    const v18, 0x40ab851f    # 5.36f

    .line 125
    .line 126
    .line 127
    const v13, 0x4121eb85    # 10.12f

    .line 128
    .line 129
    .line 130
    const v14, 0x40928f5c    # 4.58f

    .line 131
    .line 132
    .line 133
    const v15, 0x410e6666    # 8.9f

    .line 134
    .line 135
    .line 136
    const v16, 0x40933333    # 4.6f

    .line 137
    .line 138
    .line 139
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 140
    .line 141
    .line 142
    const v0, 0x412cf5c3    # 10.81f

    .line 143
    .line 144
    .line 145
    const v2, 0x402ccccd    # 2.7f

    .line 146
    .line 147
    .line 148
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 149
    .line 150
    .line 151
    const/16 v17, 0x0

    .line 152
    .line 153
    const v18, 0x3fb47ae1    # 1.41f

    .line 154
    .line 155
    .line 156
    const v13, -0x413851ec    # -0.39f

    .line 157
    .line 158
    .line 159
    const v14, 0x3ec7ae14    # 0.39f

    .line 160
    .line 161
    .line 162
    const v15, -0x413851ec    # -0.39f

    .line 163
    .line 164
    .line 165
    const v16, 0x3f828f5c    # 1.02f

    .line 166
    .line 167
    .line 168
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 169
    .line 170
    .line 171
    const v0, 0x3db851ec    # 0.09f

    .line 172
    .line 173
    .line 174
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 175
    .line 176
    .line 177
    const v17, 0x3fb47ae1    # 1.41f

    .line 178
    .line 179
    .line 180
    const/16 v18, 0x0

    .line 181
    .line 182
    const v13, 0x3ec7ae14    # 0.39f

    .line 183
    .line 184
    .line 185
    const v15, 0x3f828f5c    # 1.02f

    .line 186
    .line 187
    .line 188
    const v16, 0x3ec7ae14    # 0.39f

    .line 189
    .line 190
    .line 191
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 192
    .line 193
    .line 194
    const v0, 0x40ae147b    # 5.44f

    .line 195
    .line 196
    .line 197
    const v2, -0x3f51999a    # -5.45f

    .line 198
    .line 199
    .line 200
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 201
    .line 202
    .line 203
    const v0, 0x40b2e148    # 5.59f

    .line 204
    .line 205
    .line 206
    const v2, 0x40a6147b    # 5.19f

    .line 207
    .line 208
    .line 209
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 210
    .line 211
    .line 212
    const v0, -0x40228f5c    # -1.73f

    .line 213
    .line 214
    .line 215
    const v2, 0x3ff9999a    # 1.95f

    .line 216
    .line 217
    .line 218
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 219
    .line 220
    .line 221
    const v0, -0x3fdae148    # -2.58f

    .line 222
    .line 223
    .line 224
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 225
    .line 226
    .line 227
    const v17, -0x3fcae148    # -2.83f

    .line 228
    .line 229
    .line 230
    const v13, -0x40b851ec    # -0.78f

    .line 231
    .line 232
    .line 233
    const v14, -0x40b851ec    # -0.78f

    .line 234
    .line 235
    .line 236
    const v15, -0x3ffccccd    # -2.05f

    .line 237
    .line 238
    .line 239
    const v16, -0x40b851ec    # -0.78f

    .line 240
    .line 241
    .line 242
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 243
    .line 244
    .line 245
    const v0, 0x41866666    # 16.8f

    .line 246
    .line 247
    .line 248
    const v2, 0x402ccccd    # 2.7f

    .line 249
    .line 250
    .line 251
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 252
    .line 253
    .line 254
    const/16 v17, 0x0

    .line 255
    .line 256
    const v18, 0x3fb47ae1    # 1.41f

    .line 257
    .line 258
    .line 259
    const v13, -0x413851ec    # -0.39f

    .line 260
    .line 261
    .line 262
    const v14, 0x3ec7ae14    # 0.39f

    .line 263
    .line 264
    .line 265
    const v15, -0x413851ec    # -0.39f

    .line 266
    .line 267
    .line 268
    const v16, 0x3f828f5c    # 1.02f

    .line 269
    .line 270
    .line 271
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 272
    .line 273
    .line 274
    const v0, 0x40333333    # 2.8f

    .line 275
    .line 276
    .line 277
    const v2, 0x41926666    # 18.3f

    .line 278
    .line 279
    .line 280
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 281
    .line 282
    .line 283
    const v17, 0x3fb47ae1    # 1.41f

    .line 284
    .line 285
    .line 286
    const/16 v18, 0x0

    .line 287
    .line 288
    const v13, 0x3ec7ae14    # 0.39f

    .line 289
    .line 290
    .line 291
    const v15, 0x3f828f5c    # 1.02f

    .line 292
    .line 293
    .line 294
    const v16, 0x3ec7ae14    # 0.39f

    .line 295
    .line 296
    .line 297
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 298
    .line 299
    .line 300
    const v0, 0x40a9999a    # 5.3f

    .line 301
    .line 302
    .line 303
    const v2, -0x3f566666    # -5.3f

    .line 304
    .line 305
    .line 306
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 307
    .line 308
    .line 309
    const/high16 v0, 0x40200000    # 2.5f

    .line 310
    .line 311
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 312
    .line 313
    .line 314
    const v17, 0x403a3d71    # 2.91f

    .line 315
    .line 316
    .line 317
    const v18, -0x4247ae14    # -0.09f

    .line 318
    .line 319
    .line 320
    const v13, 0x3f4f5c29    # 0.81f

    .line 321
    .line 322
    .line 323
    const v14, 0x3f4f5c29    # 0.81f

    .line 324
    .line 325
    .line 326
    const v15, 0x4008f5c3    # 2.14f

    .line 327
    .line 328
    .line 329
    const v16, 0x3f451eb8    # 0.77f

    .line 330
    .line 331
    .line 332
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 333
    .line 334
    .line 335
    const v0, 0x3fe3d70a    # 1.78f

    .line 336
    .line 337
    .line 338
    const v2, -0x3fff5c29    # -2.01f

    .line 339
    .line 340
    .line 341
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 342
    .line 343
    .line 344
    const v0, 0x404c28f6    # 3.19f

    .line 345
    .line 346
    .line 347
    const v2, 0x403d70a4    # 2.96f

    .line 348
    .line 349
    .line 350
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 351
    .line 352
    .line 353
    const v17, 0x3fb0a3d7    # 1.38f

    .line 354
    .line 355
    .line 356
    const v18, -0x430a3d71    # -0.03f

    .line 357
    .line 358
    .line 359
    const v13, 0x3ec7ae14    # 0.39f

    .line 360
    .line 361
    .line 362
    const v14, 0x3eb851ec    # 0.36f

    .line 363
    .line 364
    .line 365
    const/high16 v15, 0x3f800000    # 1.0f

    .line 366
    .line 367
    const v16, 0x3eb33333    # 0.35f

    .line 368
    .line 369
    .line 370
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 371
    .line 372
    .line 373
    const v0, 0x3c23d70a    # 0.01f

    .line 374
    .line 375
    .line 376
    const v2, -0x43dc28f6    # -0.01f

    .line 377
    .line 378
    .line 379
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 380
    .line 381
    .line 382
    const v17, -0x430a3d71    # -0.03f

    .line 383
    .line 384
    .line 385
    const v18, -0x4048f5c3    # -1.43f

    .line 386
    .line 387
    .line 388
    const v13, 0x3ecccccd    # 0.4f

    .line 389
    .line 390
    .line 391
    const v14, -0x41333333    # -0.4f

    .line 392
    .line 393
    .line 394
    const v15, 0x3ec7ae14    # 0.39f

    .line 395
    .line 396
    .line 397
    const v16, -0x4079999a    # -1.05f

    .line 398
    .line 399
    .line 400
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 401
    .line 402
    .line 403
    const v0, -0x3fb1eb85    # -3.22f

    .line 404
    .line 405
    .line 406
    const v2, -0x3fc0a3d7    # -2.99f

    .line 407
    .line 408
    .line 409
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 410
    .line 411
    .line 412
    const v0, 0x40566666    # 3.35f

    .line 413
    .line 414
    .line 415
    const v2, -0x3f8eb852    # -3.77f

    .line 416
    .line 417
    .line 418
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 419
    .line 420
    .line 421
    const v17, 0x41aab852    # 21.34f

    .line 422
    .line 423
    .line 424
    const v18, 0x40d8a3d7    # 6.77f

    .line 425
    .line 426
    .line 427
    const v13, 0x41add70a    # 21.73f

    .line 428
    .line 429
    .line 430
    const v14, 0x40f7ae14    # 7.74f

    .line 431
    .line 432
    .line 433
    const v15, 0x41adae14    # 21.71f

    .line 434
    .line 435
    .line 436
    const v16, 0x40e47ae1    # 7.14f

    .line 437
    .line 438
    .line 439
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 440
    .line 441
    .line 442
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 443
    .line 444
    .line 445
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 446
    .line 447
    .line 448
    move-result-object v2

    .line 449
    const/16 v16, 0x3800

    .line 450
    .line 451
    const/16 v17, 0x0

    .line 452
    .line 453
    const/high16 v6, 0x3f800000    # 1.0f

    .line 454
    .line 455
    const/high16 v8, 0x3f800000    # 1.0f

    .line 456
    .line 457
    const/4 v7, 0x0

    .line 458
    const/high16 v9, 0x3f800000    # 1.0f

    .line 459
    .line 460
    const/high16 v12, 0x3f800000    # 1.0f

    .line 461
    .line 462
    const/4 v13, 0x0

    .line 463
    const/4 v14, 0x0

    .line 464
    const/4 v15, 0x0

    .line 465
    const-string v4, ""

    .line 466
    .line 467
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 468
    .line 469
    .line 470
    move-result-object v0

    .line 471
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 472
    .line 473
    .line 474
    move-result-object v0

    .line 475
    sput-object v0, Landroidx/compose/material/icons/rounded/LineAxisKt;->_lineAxis:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 476
    .line 477
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 478
    .line 479
    .line 480
    return-object v0
.end method
