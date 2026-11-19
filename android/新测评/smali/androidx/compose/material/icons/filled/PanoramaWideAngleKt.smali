.class public final Landroidx/compose/material/icons/filled/PanoramaWideAngleKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_panoramaWideAngle",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "PanoramaWideAngle",
        "Landroidx/compose/material/icons/Icons$Filled;",
        "getPanoramaWideAngle",
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
        "SMAP\nPanoramaWideAngle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PanoramaWideAngle.kt\nandroidx/compose/material/icons/filled/PanoramaWideAngleKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,64:1\n212#2,12:65\n233#2,18:78\n253#2:115\n174#3:77\n705#4,2:96\n717#4,2:98\n719#4,11:104\n72#5,4:100\n*S KotlinDebug\n*F\n+ 1 PanoramaWideAngle.kt\nandroidx/compose/material/icons/filled/PanoramaWideAngleKt\n*L\n29#1:65,12\n30#1:78,18\n30#1:115\n29#1:77\n30#1:96,2\n30#1:98,2\n30#1:104,11\n30#1:100,4\n*E\n"
    }
.end annotation


# static fields
.field private static _panoramaWideAngle:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getPanoramaWideAngle(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/filled/PanoramaWideAngleKt;->_panoramaWideAngle:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Filled.PanoramaWideAngle"

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
    const/high16 v0, 0x41400000    # 12.0f

    .line 71
    .line 72
    const/high16 v2, 0x40c00000    # 6.0f

    .line 73
    .line 74
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const v17, 0x40e947ae    # 7.29f

    .line 78
    .line 79
    .line 80
    const v18, 0x3f23d70a    # 0.64f

    .line 81
    .line 82
    .line 83
    const v13, 0x401ccccd    # 2.45f

    .line 84
    .line 85
    .line 86
    const/4 v14, 0x0

    .line 87
    const v15, 0x4096b852    # 4.71f

    .line 88
    .line 89
    .line 90
    const v16, 0x3e4ccccd    # 0.2f

    .line 91
    .line 92
    .line 93
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 94
    .line 95
    .line 96
    const v17, 0x3f35c28f    # 0.71f

    .line 97
    .line 98
    .line 99
    const v18, 0x40ab851f    # 5.36f

    .line 100
    .line 101
    .line 102
    const v13, 0x3ef0a3d7    # 0.47f

    .line 103
    .line 104
    .line 105
    const v14, 0x3fe3d70a    # 1.78f

    .line 106
    .line 107
    .line 108
    const v15, 0x3f35c28f    # 0.71f

    .line 109
    .line 110
    .line 111
    const v16, 0x40651eb8    # 3.58f

    .line 112
    .line 113
    .line 114
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 115
    .line 116
    .line 117
    const v17, -0x40ca3d71    # -0.71f

    .line 118
    .line 119
    .line 120
    const/4 v13, 0x0

    .line 121
    const v15, -0x418a3d71    # -0.24f

    .line 122
    .line 123
    .line 124
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 125
    .line 126
    .line 127
    const v17, -0x3f16b852    # -7.29f

    .line 128
    .line 129
    .line 130
    const v18, 0x3f23d70a    # 0.64f

    .line 131
    .line 132
    .line 133
    const v13, -0x3fdae148    # -2.58f

    .line 134
    .line 135
    .line 136
    const v14, 0x3ee147ae    # 0.44f

    .line 137
    .line 138
    .line 139
    const v15, -0x3f651eb8    # -4.84f

    .line 140
    .line 141
    .line 142
    const v16, 0x3f23d70a    # 0.64f

    .line 143
    .line 144
    .line 145
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 146
    .line 147
    .line 148
    const v0, -0x3f16b852    # -7.29f

    .line 149
    .line 150
    .line 151
    const v2, -0x40dc28f6    # -0.64f

    .line 152
    .line 153
    .line 154
    const v4, -0x3f6947ae    # -4.71f

    .line 155
    .line 156
    .line 157
    const v6, -0x41b33333    # -0.2f

    .line 158
    .line 159
    .line 160
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 161
    .line 162
    .line 163
    const/high16 v17, 0x40800000    # 4.0f

    .line 164
    .line 165
    const/high16 v18, 0x41400000    # 12.0f

    .line 166
    .line 167
    const v13, 0x4087ae14    # 4.24f

    .line 168
    .line 169
    .line 170
    const v14, 0x417947ae    # 15.58f

    .line 171
    .line 172
    .line 173
    const/high16 v15, 0x40800000    # 4.0f

    .line 174
    .line 175
    const v16, 0x415c7ae1    # 13.78f

    .line 176
    .line 177
    .line 178
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 179
    .line 180
    .line 181
    const v17, 0x3f35c28f    # 0.71f

    .line 182
    .line 183
    .line 184
    const v18, -0x3f547ae1    # -5.36f

    .line 185
    .line 186
    .line 187
    const/4 v13, 0x0

    .line 188
    const v14, -0x401c28f6    # -1.78f

    .line 189
    .line 190
    .line 191
    const v15, 0x3e75c28f    # 0.24f

    .line 192
    .line 193
    .line 194
    const v16, -0x3f9ae148    # -3.58f

    .line 195
    .line 196
    .line 197
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 198
    .line 199
    .line 200
    const/high16 v17, 0x41400000    # 12.0f

    .line 201
    .line 202
    const/high16 v18, 0x40c00000    # 6.0f

    .line 203
    .line 204
    const v13, 0x40e947ae    # 7.29f

    .line 205
    .line 206
    .line 207
    const v14, 0x40c66666    # 6.2f

    .line 208
    .line 209
    .line 210
    const v15, 0x4118cccd    # 9.55f

    .line 211
    .line 212
    .line 213
    const/high16 v16, 0x40c00000    # 6.0f

    .line 214
    .line 215
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 216
    .line 217
    .line 218
    const/4 v0, 0x0

    .line 219
    const/high16 v2, -0x40000000    # -2.0f

    .line 220
    .line 221
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 222
    .line 223
    .line 224
    const v17, -0x3f01999a    # -7.95f

    .line 225
    .line 226
    .line 227
    const v18, 0x3f3851ec    # 0.72f

    .line 228
    .line 229
    .line 230
    const v13, -0x3fd147ae    # -2.73f

    .line 231
    .line 232
    .line 233
    const/4 v14, 0x0

    .line 234
    const v15, -0x3f58f5c3    # -5.22f

    .line 235
    .line 236
    .line 237
    const v16, 0x3e75c28f    # 0.24f

    .line 238
    .line 239
    .line 240
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 241
    .line 242
    .line 243
    const v0, 0x3e23d70a    # 0.16f

    .line 244
    .line 245
    .line 246
    const v2, -0x4091eb85    # -0.93f

    .line 247
    .line 248
    .line 249
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 250
    .line 251
    .line 252
    const v0, 0x3f666666    # 0.9f

    .line 253
    .line 254
    .line 255
    const/high16 v2, -0x41800000    # -0.25f

    .line 256
    .line 257
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 258
    .line 259
    .line 260
    const/high16 v17, 0x40000000    # 2.0f

    .line 261
    .line 262
    const/high16 v18, 0x41400000    # 12.0f

    .line 263
    .line 264
    const v13, 0x40128f5c    # 2.29f

    .line 265
    .line 266
    .line 267
    const v14, 0x40fb3333    # 7.85f

    .line 268
    .line 269
    .line 270
    const/high16 v15, 0x40000000    # 2.0f

    .line 271
    .line 272
    const v16, 0x411ee148    # 9.93f

    .line 273
    .line 274
    .line 275
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 276
    .line 277
    .line 278
    const v0, 0x3f5eb852    # 0.87f

    .line 279
    .line 280
    .line 281
    const v2, 0x40c70a3d    # 6.22f

    .line 282
    .line 283
    .line 284
    const v4, 0x3e947ae1    # 0.29f

    .line 285
    .line 286
    .line 287
    const v6, 0x4084cccd    # 4.15f

    .line 288
    .line 289
    .line 290
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 291
    .line 292
    .line 293
    const v0, 0x3f63d70a    # 0.89f

    .line 294
    .line 295
    .line 296
    const/high16 v2, 0x3e800000    # 0.25f

    .line 297
    .line 298
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 299
    .line 300
    .line 301
    const v0, 0x3f6e147b    # 0.93f

    .line 302
    .line 303
    .line 304
    const v2, 0x3e23d70a    # 0.16f

    .line 305
    .line 306
    .line 307
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 308
    .line 309
    .line 310
    const v17, 0x40fe6666    # 7.95f

    .line 311
    .line 312
    .line 313
    const v18, 0x3f3ae148    # 0.73f

    .line 314
    .line 315
    .line 316
    const v13, 0x402eb852    # 2.73f

    .line 317
    .line 318
    .line 319
    const v14, 0x3efae148    # 0.49f

    .line 320
    .line 321
    .line 322
    const v15, 0x40a70a3d    # 5.22f

    .line 323
    .line 324
    .line 325
    const v16, 0x3f3ae148    # 0.73f

    .line 326
    .line 327
    .line 328
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 329
    .line 330
    .line 331
    const v0, 0x40fe6666    # 7.95f

    .line 332
    .line 333
    .line 334
    const v2, -0x40c7ae14    # -0.72f

    .line 335
    .line 336
    .line 337
    const v4, 0x40a70a3d    # 5.22f

    .line 338
    .line 339
    .line 340
    const v6, -0x418a3d71    # -0.24f

    .line 341
    .line 342
    .line 343
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 344
    .line 345
    .line 346
    const v0, -0x41dc28f6    # -0.16f

    .line 347
    .line 348
    .line 349
    const v2, 0x3f6e147b    # 0.93f

    .line 350
    .line 351
    .line 352
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 353
    .line 354
    .line 355
    const v0, -0x409c28f6    # -0.89f

    .line 356
    .line 357
    .line 358
    const/high16 v2, 0x3e800000    # 0.25f

    .line 359
    .line 360
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 361
    .line 362
    .line 363
    const v17, 0x3f5eb852    # 0.87f

    .line 364
    .line 365
    .line 366
    const v18, -0x3f38a3d7    # -6.23f

    .line 367
    .line 368
    .line 369
    const v13, 0x3f147ae1    # 0.58f

    .line 370
    .line 371
    .line 372
    const v14, -0x3ffae148    # -2.08f

    .line 373
    .line 374
    .line 375
    const v15, 0x3f5eb852    # 0.87f

    .line 376
    .line 377
    .line 378
    const v16, -0x3f7ae148    # -4.16f

    .line 379
    .line 380
    .line 381
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 382
    .line 383
    .line 384
    const v0, -0x40a147ae    # -0.87f

    .line 385
    .line 386
    .line 387
    const v2, -0x3f38f5c3    # -6.22f

    .line 388
    .line 389
    .line 390
    const v4, -0x416b851f    # -0.29f

    .line 391
    .line 392
    .line 393
    const v6, -0x3f7b3333    # -4.15f

    .line 394
    .line 395
    .line 396
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 397
    .line 398
    .line 399
    const v0, -0x409c28f6    # -0.89f

    .line 400
    .line 401
    .line 402
    const/high16 v2, -0x41800000    # -0.25f

    .line 403
    .line 404
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 405
    .line 406
    .line 407
    const v0, -0x41dc28f6    # -0.16f

    .line 408
    .line 409
    .line 410
    const v2, -0x4091eb85    # -0.93f

    .line 411
    .line 412
    .line 413
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 414
    .line 415
    .line 416
    const/high16 v17, 0x41400000    # 12.0f

    .line 417
    .line 418
    const/high16 v18, 0x40800000    # 4.0f

    .line 419
    .line 420
    const v13, 0x4189c28f    # 17.22f

    .line 421
    .line 422
    .line 423
    const v14, 0x4087ae14    # 4.24f

    .line 424
    .line 425
    .line 426
    const v15, 0x416bae14    # 14.73f

    .line 427
    .line 428
    .line 429
    const/high16 v16, 0x40800000    # 4.0f

    .line 430
    .line 431
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 432
    .line 433
    .line 434
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 435
    .line 436
    .line 437
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 438
    .line 439
    .line 440
    move-result-object v2

    .line 441
    const/16 v16, 0x3800

    .line 442
    .line 443
    const/16 v17, 0x0

    .line 444
    .line 445
    const/high16 v6, 0x3f800000    # 1.0f

    .line 446
    .line 447
    const/high16 v8, 0x3f800000    # 1.0f

    .line 448
    .line 449
    const/4 v7, 0x0

    .line 450
    const/high16 v9, 0x3f800000    # 1.0f

    .line 451
    .line 452
    const/high16 v12, 0x3f800000    # 1.0f

    .line 453
    .line 454
    const/4 v13, 0x0

    .line 455
    const/4 v14, 0x0

    .line 456
    const/4 v15, 0x0

    .line 457
    const-string v4, ""

    .line 458
    .line 459
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 460
    .line 461
    .line 462
    move-result-object v0

    .line 463
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 464
    .line 465
    .line 466
    move-result-object v0

    .line 467
    sput-object v0, Landroidx/compose/material/icons/filled/PanoramaWideAngleKt;->_panoramaWideAngle:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 468
    .line 469
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 470
    .line 471
    .line 472
    return-object v0
.end method
