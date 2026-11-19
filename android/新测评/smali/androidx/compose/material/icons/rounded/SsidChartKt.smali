.class public final Landroidx/compose/material/icons/rounded/SsidChartKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_ssidChart",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "SsidChart",
        "Landroidx/compose/material/icons/Icons$Rounded;",
        "getSsidChart",
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
        "SMAP\nSsidChart.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SsidChart.kt\nandroidx/compose/material/icons/rounded/SsidChartKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,68:1\n212#2,12:69\n233#2,18:82\n253#2:119\n174#3:81\n705#4,2:100\n717#4,2:102\n719#4,11:108\n72#5,4:104\n*S KotlinDebug\n*F\n+ 1 SsidChart.kt\nandroidx/compose/material/icons/rounded/SsidChartKt\n*L\n29#1:69,12\n30#1:82,18\n30#1:119\n29#1:81\n30#1:100,2\n30#1:102,2\n30#1:108,11\n30#1:104,4\n*E\n"
    }
.end annotation


# static fields
.field private static _ssidChart:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getSsidChart(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/SsidChartKt;->_ssidChart:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.SsidChart"

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
    const v0, 0x41107ae1    # 9.03f

    .line 71
    .line 72
    .line 73
    const/high16 v2, 0x40400000    # 3.0f

    .line 74
    .line 75
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    const v17, 0x3ed1eb85    # 0.41f

    .line 79
    .line 80
    .line 81
    const v18, -0x40b0a3d7    # -0.81f

    .line 82
    .line 83
    .line 84
    const/4 v13, 0x0

    .line 85
    const v14, -0x415c28f6    # -0.32f

    .line 86
    .line 87
    .line 88
    const v15, 0x3e19999a    # 0.15f

    .line 89
    .line 90
    .line 91
    const v16, -0x40e147ae    # -0.62f

    .line 92
    .line 93
    .line 94
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 95
    .line 96
    .line 97
    const v0, 0x40e47ae1    # 7.14f

    .line 98
    .line 99
    .line 100
    const/high16 v2, 0x40b00000    # 5.5f

    .line 101
    .line 102
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 103
    .line 104
    .line 105
    const v17, 0x3fa66666    # 1.3f

    .line 106
    .line 107
    .line 108
    const v18, 0x3dcccccd    # 0.1f

    .line 109
    .line 110
    .line 111
    const v13, 0x3ecccccd    # 0.4f

    .line 112
    .line 113
    .line 114
    const v14, -0x416b851f    # -0.29f

    .line 115
    .line 116
    .line 117
    const v15, 0x3f733333    # 0.95f

    .line 118
    .line 119
    .line 120
    const/high16 v16, -0x41800000    # -0.25f

    .line 121
    .line 122
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 123
    .line 124
    .line 125
    const v0, 0x4071eb85    # 3.78f

    .line 126
    .line 127
    .line 128
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 129
    .line 130
    .line 131
    const v0, 0x40e66666    # 7.2f

    .line 132
    .line 133
    .line 134
    const v2, -0x3f58a3d7    # -5.23f

    .line 135
    .line 136
    .line 137
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 138
    .line 139
    .line 140
    const/high16 v17, 0x41a80000    # 21.0f

    .line 141
    .line 142
    const v18, 0x409eb852    # 4.96f

    .line 143
    .line 144
    .line 145
    const v13, 0x41a08f5c    # 20.07f

    .line 146
    .line 147
    .line 148
    const v14, 0x406ae148    # 3.67f

    .line 149
    .line 150
    .line 151
    const/high16 v15, 0x41a80000    # 21.0f

    .line 152
    .line 153
    const v16, 0x40847ae1    # 4.14f

    .line 154
    .line 155
    .line 156
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 157
    .line 158
    .line 159
    const v17, -0x412e147b    # -0.41f

    .line 160
    .line 161
    .line 162
    const v18, 0x3f4f5c29    # 0.81f

    .line 163
    .line 164
    .line 165
    const/4 v13, 0x0

    .line 166
    const v14, 0x3ea3d70a    # 0.32f

    .line 167
    .line 168
    .line 169
    const v15, -0x41e66666    # -0.15f

    .line 170
    .line 171
    .line 172
    const v16, 0x3f1eb852    # 0.62f

    .line 173
    .line 174
    .line 175
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 176
    .line 177
    .line 178
    const v0, -0x3f033333    # -7.9f

    .line 179
    .line 180
    .line 181
    const v2, 0x40b75c29    # 5.73f

    .line 182
    .line 183
    .line 184
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 185
    .line 186
    .line 187
    const v17, -0x405ae148    # -1.29f

    .line 188
    .line 189
    .line 190
    const v18, -0x42333333    # -0.1f

    .line 191
    .line 192
    .line 193
    const v13, -0x41333333    # -0.4f

    .line 194
    .line 195
    .line 196
    const v14, 0x3e947ae1    # 0.29f

    .line 197
    .line 198
    .line 199
    const v15, -0x408ccccd    # -0.95f

    .line 200
    .line 201
    .line 202
    const/high16 v16, 0x3e800000    # 0.25f

    .line 203
    .line 204
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 205
    .line 206
    .line 207
    const v0, 0x40f3d70a    # 7.62f

    .line 208
    .line 209
    .line 210
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 211
    .line 212
    .line 213
    const v0, 0x4092e148    # 4.59f

    .line 214
    .line 215
    .line 216
    const v2, 0x411d70a4    # 9.84f

    .line 217
    .line 218
    .line 219
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 220
    .line 221
    .line 222
    const/high16 v17, 0x40400000    # 3.0f

    .line 223
    .line 224
    const v18, 0x41107ae1    # 9.03f

    .line 225
    .line 226
    .line 227
    const v13, 0x407b851f    # 3.93f

    .line 228
    .line 229
    .line 230
    const v14, 0x41251eb8    # 10.32f

    .line 231
    .line 232
    .line 233
    const/high16 v15, 0x40400000    # 3.0f

    .line 234
    .line 235
    const v16, 0x411d999a    # 9.85f

    .line 236
    .line 237
    .line 238
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 239
    .line 240
    .line 241
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 242
    .line 243
    .line 244
    const/high16 v0, 0x41a80000    # 21.0f

    .line 245
    .line 246
    const/high16 v2, 0x41800000    # 16.0f

    .line 247
    .line 248
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 249
    .line 250
    .line 251
    const/high16 v17, -0x40800000    # -1.0f

    .line 252
    .line 253
    const/high16 v18, -0x40800000    # -1.0f

    .line 254
    .line 255
    const/4 v13, 0x0

    .line 256
    const v14, -0x40f33333    # -0.55f

    .line 257
    .line 258
    .line 259
    const v15, -0x4119999a    # -0.45f

    .line 260
    .line 261
    .line 262
    const/high16 v16, -0x40800000    # -1.0f

    .line 263
    .line 264
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 265
    .line 266
    .line 267
    const v0, -0x3fa9999a    # -3.35f

    .line 268
    .line 269
    .line 270
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 271
    .line 272
    .line 273
    const v17, -0x40e147ae    # -0.62f

    .line 274
    .line 275
    .line 276
    const v18, 0x3e6147ae    # 0.22f

    .line 277
    .line 278
    .line 279
    const v13, -0x41947ae1    # -0.23f

    .line 280
    .line 281
    .line 282
    const/4 v14, 0x0

    .line 283
    const v16, 0x3da3d70a    # 0.08f

    .line 284
    .line 285
    .line 286
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 287
    .line 288
    .line 289
    const v0, -0x3f866666    # -3.9f

    .line 290
    .line 291
    .line 292
    const v2, 0x4047ae14    # 3.12f

    .line 293
    .line 294
    .line 295
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 296
    .line 297
    .line 298
    const v0, 0x40d33333    # 6.6f

    .line 299
    .line 300
    .line 301
    const v2, 0x414fd70a    # 12.99f

    .line 302
    .line 303
    .line 304
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 305
    .line 306
    .line 307
    const v17, -0x405d70a4    # -1.27f

    .line 308
    .line 309
    .line 310
    const v18, -0x42333333    # -0.1f

    .line 311
    .line 312
    .line 313
    const v13, -0x414ccccd    # -0.35f

    .line 314
    .line 315
    .line 316
    const v14, -0x4151eb85    # -0.34f

    .line 317
    .line 318
    .line 319
    const v15, -0x409eb852    # -0.88f

    .line 320
    .line 321
    .line 322
    const v16, -0x413d70a4    # -0.38f

    .line 323
    .line 324
    .line 325
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 326
    .line 327
    .line 328
    const v0, -0x400ccccd    # -1.9f

    .line 329
    .line 330
    .line 331
    const v2, 0x3faccccd    # 1.35f

    .line 332
    .line 333
    .line 334
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 335
    .line 336
    .line 337
    const/high16 v17, 0x40400000    # 3.0f

    .line 338
    .line 339
    const v18, 0x4170f5c3    # 15.06f

    .line 340
    .line 341
    .line 342
    const v13, 0x404a3d71    # 3.16f

    .line 343
    .line 344
    .line 345
    const v14, 0x4166e148    # 14.43f

    .line 346
    .line 347
    .line 348
    const/high16 v15, 0x40400000    # 3.0f

    .line 349
    .line 350
    const v16, 0x416bd70a    # 14.74f

    .line 351
    .line 352
    .line 353
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 354
    .line 355
    .line 356
    const v17, 0x3fca3d71    # 1.58f

    .line 357
    .line 358
    .line 359
    const v18, 0x3f4f5c29    # 0.81f

    .line 360
    .line 361
    .line 362
    const/4 v13, 0x0

    .line 363
    const v14, 0x3f4f5c29    # 0.81f

    .line 364
    .line 365
    .line 366
    const v15, 0x3f6b851f    # 0.92f

    .line 367
    .line 368
    .line 369
    const v16, 0x3fa51eb8    # 1.29f

    .line 370
    .line 371
    .line 372
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 373
    .line 374
    .line 375
    const v0, 0x40b9999a    # 5.8f

    .line 376
    .line 377
    .line 378
    const/high16 v2, 0x41700000    # 15.0f

    .line 379
    .line 380
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 381
    .line 382
    .line 383
    const v0, 0x40b23d71    # 5.57f

    .line 384
    .line 385
    .line 386
    const v2, 0x40ac7ae1    # 5.39f

    .line 387
    .line 388
    .line 389
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 390
    .line 391
    .line 392
    const v17, 0x3fa8f5c3    # 1.32f

    .line 393
    .line 394
    .line 395
    const v18, 0x3d75c28f    # 0.06f

    .line 396
    .line 397
    .line 398
    const v13, 0x3eb851ec    # 0.36f

    .line 399
    .line 400
    .line 401
    const v14, 0x3eb33333    # 0.35f

    .line 402
    .line 403
    .line 404
    const v15, 0x3f6e147b    # 0.93f

    .line 405
    .line 406
    .line 407
    const v16, 0x3ec28f5c    # 0.38f

    .line 408
    .line 409
    .line 410
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 411
    .line 412
    .line 413
    const/high16 v0, 0x41880000    # 17.0f

    .line 414
    .line 415
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 416
    .line 417
    .line 418
    const/high16 v0, 0x40400000    # 3.0f

    .line 419
    .line 420
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 421
    .line 422
    .line 423
    const/high16 v17, 0x41a80000    # 21.0f

    .line 424
    .line 425
    const/high16 v18, 0x41800000    # 16.0f

    .line 426
    .line 427
    const v13, 0x41a46666    # 20.55f

    .line 428
    .line 429
    .line 430
    const/high16 v14, 0x41880000    # 17.0f

    .line 431
    .line 432
    const/high16 v15, 0x41a80000    # 21.0f

    .line 433
    .line 434
    const v16, 0x41846666    # 16.55f

    .line 435
    .line 436
    .line 437
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 438
    .line 439
    .line 440
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 441
    .line 442
    .line 443
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 444
    .line 445
    .line 446
    move-result-object v2

    .line 447
    const/16 v16, 0x3800

    .line 448
    .line 449
    const/16 v17, 0x0

    .line 450
    .line 451
    const/high16 v6, 0x3f800000    # 1.0f

    .line 452
    .line 453
    const/high16 v8, 0x3f800000    # 1.0f

    .line 454
    .line 455
    const/4 v7, 0x0

    .line 456
    const/high16 v9, 0x3f800000    # 1.0f

    .line 457
    .line 458
    const/high16 v12, 0x3f800000    # 1.0f

    .line 459
    .line 460
    const/4 v13, 0x0

    .line 461
    const/4 v14, 0x0

    .line 462
    const/4 v15, 0x0

    .line 463
    const-string v4, ""

    .line 464
    .line 465
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 466
    .line 467
    .line 468
    move-result-object v0

    .line 469
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 470
    .line 471
    .line 472
    move-result-object v0

    .line 473
    sput-object v0, Landroidx/compose/material/icons/rounded/SsidChartKt;->_ssidChart:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 474
    .line 475
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 476
    .line 477
    .line 478
    return-object v0
.end method
