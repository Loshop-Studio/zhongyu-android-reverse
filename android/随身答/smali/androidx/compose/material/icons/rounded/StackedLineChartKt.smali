.class public final Landroidx/compose/material/icons/rounded/StackedLineChartKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_stackedLineChart",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "StackedLineChart",
        "Landroidx/compose/material/icons/Icons$Rounded;",
        "getStackedLineChart",
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
        "SMAP\nStackedLineChart.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StackedLineChart.kt\nandroidx/compose/material/icons/rounded/StackedLineChartKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,69:1\n212#2,12:70\n233#2,18:83\n253#2:120\n174#3:82\n705#4,2:101\n717#4,2:103\n719#4,11:109\n72#5,4:105\n*S KotlinDebug\n*F\n+ 1 StackedLineChart.kt\nandroidx/compose/material/icons/rounded/StackedLineChartKt\n*L\n29#1:70,12\n30#1:83,18\n30#1:120\n29#1:82\n30#1:101,2\n30#1:103,2\n30#1:109,11\n30#1:105,4\n*E\n"
    }
.end annotation


# static fields
.field private static _stackedLineChart:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getStackedLineChart(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/StackedLineChartKt;->_stackedLineChart:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.StackedLineChart"

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
    const v0, 0x40328f5c    # 2.79f

    .line 71
    .line 72
    .line 73
    const v2, 0x416c7ae1    # 14.78f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v0, 0x402ccccd    # 2.7f

    .line 80
    .line 81
    .line 82
    const v2, 0x416b0a3d    # 14.69f

    .line 83
    .line 84
    .line 85
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 86
    .line 87
    .line 88
    const/16 v17, 0x0

    .line 89
    .line 90
    const v18, -0x404b851f    # -1.41f

    .line 91
    .line 92
    .line 93
    const v13, -0x413851ec    # -0.39f

    .line 94
    .line 95
    .line 96
    const v14, -0x413851ec    # -0.39f

    .line 97
    .line 98
    .line 99
    const v15, -0x413851ec    # -0.39f

    .line 100
    .line 101
    .line 102
    const v16, -0x407d70a4    # -1.02f

    .line 103
    .line 104
    .line 105
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 106
    .line 107
    .line 108
    const v0, 0x40c2e148    # 6.09f

    .line 109
    .line 110
    .line 111
    const v2, -0x3f3ccccd    # -6.1f

    .line 112
    .line 113
    .line 114
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 115
    .line 116
    .line 117
    const v17, 0x3fb47ae1    # 1.41f

    .line 118
    .line 119
    .line 120
    const/16 v18, 0x0

    .line 121
    .line 122
    const v13, 0x3ec7ae14    # 0.39f

    .line 123
    .line 124
    .line 125
    const v15, 0x3f828f5c    # 1.02f

    .line 126
    .line 127
    .line 128
    const v16, -0x413851ec    # -0.39f

    .line 129
    .line 130
    .line 131
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 132
    .line 133
    .line 134
    const v0, 0x40528f5c    # 3.29f

    .line 135
    .line 136
    .line 137
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 138
    .line 139
    .line 140
    const v0, 0x40cc7ae1    # 6.39f

    .line 141
    .line 142
    .line 143
    const v2, -0x3f1a3d71    # -7.18f

    .line 144
    .line 145
    .line 146
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 147
    .line 148
    .line 149
    const v17, 0x3fb9999a    # 1.45f

    .line 150
    .line 151
    .line 152
    const v18, -0x42dc28f6    # -0.04f

    .line 153
    .line 154
    .line 155
    const v13, 0x3ec28f5c    # 0.38f

    .line 156
    .line 157
    .line 158
    const v14, -0x4123d70a    # -0.43f

    .line 159
    .line 160
    .line 161
    const v15, 0x3f866666    # 1.05f

    .line 162
    .line 163
    .line 164
    const v16, -0x411eb852    # -0.44f

    .line 165
    .line 166
    .line 167
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 168
    .line 169
    .line 170
    const/4 v0, 0x0

    .line 171
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 172
    .line 173
    .line 174
    const v17, 0x3d23d70a    # 0.04f

    .line 175
    .line 176
    .line 177
    const v18, 0x3faf5c29    # 1.37f

    .line 178
    .line 179
    .line 180
    const v13, 0x3ebd70a4    # 0.37f

    .line 181
    .line 182
    .line 183
    const v14, 0x3ec28f5c    # 0.38f

    .line 184
    .line 185
    .line 186
    const v15, 0x3ec7ae14    # 0.39f

    .line 187
    .line 188
    .line 189
    const v16, 0x3f7ae148    # 0.98f

    .line 190
    .line 191
    .line 192
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 193
    .line 194
    .line 195
    const v0, -0x3f1a8f5c    # -7.17f

    .line 196
    .line 197
    .line 198
    const v2, 0x41011eb8    # 8.07f

    .line 199
    .line 200
    .line 201
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 202
    .line 203
    .line 204
    const v17, -0x40466666    # -1.45f

    .line 205
    .line 206
    .line 207
    const v18, 0x3d23d70a    # 0.04f

    .line 208
    .line 209
    .line 210
    const v13, -0x413d70a4    # -0.38f

    .line 211
    .line 212
    .line 213
    const v14, 0x3edc28f6    # 0.43f

    .line 214
    .line 215
    .line 216
    const v15, -0x407ae148    # -1.04f

    .line 217
    .line 218
    .line 219
    const v16, 0x3ee66666    # 0.45f

    .line 220
    .line 221
    .line 222
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 223
    .line 224
    .line 225
    const/high16 v0, 0x41180000    # 9.5f

    .line 226
    .line 227
    const v2, 0x4117ae14    # 9.48f

    .line 228
    .line 229
    .line 230
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 231
    .line 232
    .line 233
    const v0, 0x40a9999a    # 5.3f

    .line 234
    .line 235
    .line 236
    const v2, -0x3f566666    # -5.3f

    .line 237
    .line 238
    .line 239
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 240
    .line 241
    .line 242
    const v17, 0x40328f5c    # 2.79f

    .line 243
    .line 244
    .line 245
    const v18, 0x416c7ae1    # 14.78f

    .line 246
    .line 247
    .line 248
    const v13, 0x40747ae1    # 3.82f

    .line 249
    .line 250
    .line 251
    const v14, 0x4172b852    # 15.17f

    .line 252
    .line 253
    .line 254
    const v15, 0x404b851f    # 3.18f

    .line 255
    .line 256
    .line 257
    const v16, 0x4172b852    # 15.17f

    .line 258
    .line 259
    .line 260
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 261
    .line 262
    .line 263
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 264
    .line 265
    .line 266
    const v0, 0x40866666    # 4.2f

    .line 267
    .line 268
    .line 269
    const v2, 0x41a63d71    # 20.78f

    .line 270
    .line 271
    .line 272
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 273
    .line 274
    .line 275
    const v0, 0x40a9999a    # 5.3f

    .line 276
    .line 277
    .line 278
    const v2, -0x3f566666    # -5.3f

    .line 279
    .line 280
    .line 281
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 282
    .line 283
    .line 284
    const/high16 v0, 0x40500000    # 3.25f

    .line 285
    .line 286
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 287
    .line 288
    .line 289
    const v17, 0x3fb9999a    # 1.45f

    .line 290
    .line 291
    .line 292
    const v18, -0x42dc28f6    # -0.04f

    .line 293
    .line 294
    .line 295
    const v13, 0x3ed1eb85    # 0.41f

    .line 296
    .line 297
    .line 298
    const v14, 0x3ed1eb85    # 0.41f

    .line 299
    .line 300
    .line 301
    const v15, 0x3f88f5c3    # 1.07f

    .line 302
    .line 303
    .line 304
    const v16, 0x3ec7ae14    # 0.39f

    .line 305
    .line 306
    .line 307
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 308
    .line 309
    .line 310
    const v0, 0x40e570a4    # 7.17f

    .line 311
    .line 312
    .line 313
    const v2, -0x3efee148    # -8.07f

    .line 314
    .line 315
    .line 316
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 317
    .line 318
    .line 319
    const v17, -0x42dc28f6    # -0.04f

    .line 320
    .line 321
    .line 322
    const v18, -0x4050a3d7    # -1.37f

    .line 323
    .line 324
    .line 325
    const v13, 0x3eb33333    # 0.35f

    .line 326
    .line 327
    .line 328
    const v14, -0x413851ec    # -0.39f

    .line 329
    .line 330
    .line 331
    const v15, 0x3ea8f5c3    # 0.33f

    .line 332
    .line 333
    .line 334
    const v16, -0x40828f5c    # -0.99f

    .line 335
    .line 336
    .line 337
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 338
    .line 339
    .line 340
    const/4 v0, 0x0

    .line 341
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 342
    .line 343
    .line 344
    const v17, -0x40466666    # -1.45f

    .line 345
    .line 346
    .line 347
    const v18, 0x3d23d70a    # 0.04f

    .line 348
    .line 349
    .line 350
    const v13, -0x41333333    # -0.4f

    .line 351
    .line 352
    .line 353
    const v14, -0x41333333    # -0.4f

    .line 354
    .line 355
    .line 356
    const v15, -0x40770a3d    # -1.07f

    .line 357
    .line 358
    .line 359
    const v16, -0x413851ec    # -0.39f

    .line 360
    .line 361
    .line 362
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 363
    .line 364
    .line 365
    const v0, -0x3f33851f    # -6.39f

    .line 366
    .line 367
    .line 368
    const v2, 0x40e5c28f    # 7.18f

    .line 369
    .line 370
    .line 371
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 372
    .line 373
    .line 374
    const v0, -0x3fad70a4    # -3.29f

    .line 375
    .line 376
    .line 377
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 378
    .line 379
    .line 380
    const v17, -0x404b851f    # -1.41f

    .line 381
    .line 382
    .line 383
    const/16 v18, 0x0

    .line 384
    .line 385
    const v13, -0x413851ec    # -0.39f

    .line 386
    .line 387
    .line 388
    const v14, -0x413851ec    # -0.39f

    .line 389
    .line 390
    .line 391
    const v15, -0x407d70a4    # -1.02f

    .line 392
    .line 393
    .line 394
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 395
    .line 396
    .line 397
    const v0, -0x3f3d1eb8    # -6.09f

    .line 398
    .line 399
    .line 400
    const v2, 0x40c33333    # 6.1f

    .line 401
    .line 402
    .line 403
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 404
    .line 405
    .line 406
    const/16 v17, 0x0

    .line 407
    .line 408
    const v18, 0x3fb47ae1    # 1.41f

    .line 409
    .line 410
    .line 411
    const v14, 0x3ec7ae14    # 0.39f

    .line 412
    .line 413
    .line 414
    const v15, -0x413851ec    # -0.39f

    .line 415
    .line 416
    .line 417
    const v16, 0x3f828f5c    # 1.02f

    .line 418
    .line 419
    .line 420
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 421
    .line 422
    .line 423
    const v0, 0x3db851ec    # 0.09f

    .line 424
    .line 425
    .line 426
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 427
    .line 428
    .line 429
    const v17, 0x40866666    # 4.2f

    .line 430
    .line 431
    .line 432
    const v18, 0x41a63d71    # 20.78f

    .line 433
    .line 434
    .line 435
    const v13, 0x404b851f    # 3.18f

    .line 436
    .line 437
    .line 438
    const v14, 0x41a95c29    # 21.17f

    .line 439
    .line 440
    .line 441
    const v15, 0x40747ae1    # 3.82f

    .line 442
    .line 443
    .line 444
    const v16, 0x41a95c29    # 21.17f

    .line 445
    .line 446
    .line 447
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 448
    .line 449
    .line 450
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 451
    .line 452
    .line 453
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 454
    .line 455
    .line 456
    move-result-object v2

    .line 457
    const/16 v16, 0x3800

    .line 458
    .line 459
    const/16 v17, 0x0

    .line 460
    .line 461
    const/high16 v6, 0x3f800000    # 1.0f

    .line 462
    .line 463
    const/high16 v8, 0x3f800000    # 1.0f

    .line 464
    .line 465
    const/4 v7, 0x0

    .line 466
    const/high16 v9, 0x3f800000    # 1.0f

    .line 467
    .line 468
    const/high16 v12, 0x3f800000    # 1.0f

    .line 469
    .line 470
    const/4 v13, 0x0

    .line 471
    const/4 v14, 0x0

    .line 472
    const/4 v15, 0x0

    .line 473
    const-string v4, ""

    .line 474
    .line 475
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 476
    .line 477
    .line 478
    move-result-object v0

    .line 479
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 480
    .line 481
    .line 482
    move-result-object v0

    .line 483
    sput-object v0, Landroidx/compose/material/icons/rounded/StackedLineChartKt;->_stackedLineChart:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 484
    .line 485
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 486
    .line 487
    .line 488
    return-object v0
.end method
