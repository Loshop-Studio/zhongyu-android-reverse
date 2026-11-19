.class public final Landroidx/compose/material/icons/twotone/PanoramaWideAngleKt;
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
        "Landroidx/compose/material/icons/Icons$TwoTone;",
        "getPanoramaWideAngle",
        "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;",
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
        "SMAP\nPanoramaWideAngle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PanoramaWideAngle.kt\nandroidx/compose/material/icons/twotone/PanoramaWideAngleKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,77:1\n212#2,12:78\n233#2,18:91\n253#2:128\n233#2,18:129\n253#2:166\n174#3:90\n705#4,2:109\n717#4,2:111\n719#4,11:117\n705#4,2:147\n717#4,2:149\n719#4,11:155\n72#5,4:113\n72#5,4:151\n*S KotlinDebug\n*F\n+ 1 PanoramaWideAngle.kt\nandroidx/compose/material/icons/twotone/PanoramaWideAngleKt\n*L\n29#1:78,12\n30#1:91,18\n30#1:128\n42#1:129,18\n42#1:166\n29#1:90\n30#1:109,2\n30#1:111,2\n30#1:117,11\n42#1:147,2\n42#1:149,2\n42#1:155,11\n30#1:113,4\n42#1:151,4\n*E\n"
    }
.end annotation


# static fields
.field private static _panoramaWideAngle:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getPanoramaWideAngle(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/PanoramaWideAngleKt;->_panoramaWideAngle:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.PanoramaWideAngle"

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
    const/high16 v4, 0x41400000    # 12.0f

    .line 71
    .line 72
    const/high16 v6, 0x40c00000    # 6.0f

    .line 73
    .line 74
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const v25, -0x3f16b852    # -7.29f

    .line 78
    .line 79
    .line 80
    const v26, 0x3f23d70a    # 0.64f

    .line 81
    .line 82
    .line 83
    const v21, -0x3fe33333    # -2.45f

    .line 84
    .line 85
    .line 86
    const/16 v22, 0x0

    .line 87
    .line 88
    const v23, -0x3f6947ae    # -4.71f

    .line 89
    .line 90
    .line 91
    const v24, 0x3e4ccccd    # 0.2f

    .line 92
    .line 93
    .line 94
    move-object/from16 v20, v2

    .line 95
    .line 96
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 97
    .line 98
    .line 99
    const/high16 v25, 0x40800000    # 4.0f

    .line 100
    .line 101
    const/high16 v26, 0x41400000    # 12.0f

    .line 102
    .line 103
    const v21, 0x4087ae14    # 4.24f

    .line 104
    .line 105
    .line 106
    const v22, 0x4106b852    # 8.42f

    .line 107
    .line 108
    .line 109
    const/high16 v23, 0x40800000    # 4.0f

    .line 110
    .line 111
    const v24, 0x4123851f    # 10.22f

    .line 112
    .line 113
    .line 114
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 115
    .line 116
    .line 117
    const v25, 0x3f35c28f    # 0.71f

    .line 118
    .line 119
    .line 120
    const v26, 0x40ab851f    # 5.36f

    .line 121
    .line 122
    .line 123
    const/16 v21, 0x0

    .line 124
    .line 125
    const v22, 0x3fe3d70a    # 1.78f

    .line 126
    .line 127
    .line 128
    const v23, 0x3e75c28f    # 0.24f

    .line 129
    .line 130
    .line 131
    const v24, 0x40651eb8    # 3.58f

    .line 132
    .line 133
    .line 134
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 135
    .line 136
    .line 137
    const v25, 0x40e947ae    # 7.29f

    .line 138
    .line 139
    .line 140
    const v26, 0x3f23d70a    # 0.64f

    .line 141
    .line 142
    .line 143
    const v21, 0x40251eb8    # 2.58f

    .line 144
    .line 145
    .line 146
    const v22, 0x3ee147ae    # 0.44f

    .line 147
    .line 148
    .line 149
    const v23, 0x409ae148    # 4.84f

    .line 150
    .line 151
    .line 152
    const v24, 0x3f23d70a    # 0.64f

    .line 153
    .line 154
    .line 155
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 156
    .line 157
    .line 158
    const v4, -0x40dc28f6    # -0.64f

    .line 159
    .line 160
    .line 161
    const v6, 0x40e947ae    # 7.29f

    .line 162
    .line 163
    .line 164
    const v7, -0x41b33333    # -0.2f

    .line 165
    .line 166
    .line 167
    const v8, 0x4096b852    # 4.71f

    .line 168
    .line 169
    .line 170
    invoke-virtual {v2, v8, v7, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 171
    .line 172
    .line 173
    const v25, 0x3f35c28f    # 0.71f

    .line 174
    .line 175
    .line 176
    const v26, -0x3f547ae1    # -5.36f

    .line 177
    .line 178
    .line 179
    const v21, 0x3ef0a3d7    # 0.47f

    .line 180
    .line 181
    .line 182
    const v22, -0x401c28f6    # -1.78f

    .line 183
    .line 184
    .line 185
    const v23, 0x3f35c28f    # 0.71f

    .line 186
    .line 187
    .line 188
    const v24, -0x3f9ae148    # -3.58f

    .line 189
    .line 190
    .line 191
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 192
    .line 193
    .line 194
    const v25, -0x40ca3d71    # -0.71f

    .line 195
    .line 196
    .line 197
    const/16 v21, 0x0

    .line 198
    .line 199
    const v23, -0x418a3d71    # -0.24f

    .line 200
    .line 201
    .line 202
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 203
    .line 204
    .line 205
    const/high16 v25, 0x41400000    # 12.0f

    .line 206
    .line 207
    const/high16 v26, 0x40c00000    # 6.0f

    .line 208
    .line 209
    const v21, 0x4185ae14    # 16.71f

    .line 210
    .line 211
    .line 212
    const v22, 0x40c66666    # 6.2f

    .line 213
    .line 214
    .line 215
    const v23, 0x41673333    # 14.45f

    .line 216
    .line 217
    .line 218
    const/high16 v24, 0x40c00000    # 6.0f

    .line 219
    .line 220
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 221
    .line 222
    .line 223
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 224
    .line 225
    .line 226
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 227
    .line 228
    .line 229
    move-result-object v2

    .line 230
    const/16 v16, 0x3800

    .line 231
    .line 232
    const/16 v17, 0x0

    .line 233
    .line 234
    const v6, 0x3e99999a    # 0.3f

    .line 235
    .line 236
    .line 237
    const v8, 0x3e99999a    # 0.3f

    .line 238
    .line 239
    .line 240
    const/4 v7, 0x0

    .line 241
    const/high16 v9, 0x3f800000    # 1.0f

    .line 242
    .line 243
    const/high16 v12, 0x3f800000    # 1.0f

    .line 244
    .line 245
    const/4 v13, 0x0

    .line 246
    const/4 v14, 0x0

    .line 247
    const/4 v15, 0x0

    .line 248
    const-string v4, ""

    .line 249
    .line 250
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 251
    .line 252
    .line 253
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 254
    .line 255
    .line 256
    move-result v3

    .line 257
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 258
    .line 259
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 260
    .line 261
    .line 262
    move-result-wide v6

    .line 263
    const/4 v0, 0x0

    .line 264
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 265
    .line 266
    .line 267
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 268
    .line 269
    .line 270
    move-result v10

    .line 271
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 272
    .line 273
    .line 274
    move-result v11

    .line 275
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 276
    .line 277
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 278
    .line 279
    .line 280
    const v0, 0x41a90a3d    # 21.13f

    .line 281
    .line 282
    .line 283
    const v2, 0x40b8f5c3    # 5.78f

    .line 284
    .line 285
    .line 286
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 287
    .line 288
    .line 289
    const v0, -0x409c28f6    # -0.89f

    .line 290
    .line 291
    .line 292
    const/high16 v2, -0x41800000    # -0.25f

    .line 293
    .line 294
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 295
    .line 296
    .line 297
    const v0, -0x41dc28f6    # -0.16f

    .line 298
    .line 299
    .line 300
    const v2, -0x4091eb85    # -0.93f

    .line 301
    .line 302
    .line 303
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 304
    .line 305
    .line 306
    const/high16 v17, 0x41400000    # 12.0f

    .line 307
    .line 308
    const/high16 v18, 0x40800000    # 4.0f

    .line 309
    .line 310
    const v13, 0x4189c28f    # 17.22f

    .line 311
    .line 312
    .line 313
    const v14, 0x4087ae14    # 4.24f

    .line 314
    .line 315
    .line 316
    const v15, 0x416bae14    # 14.73f

    .line 317
    .line 318
    .line 319
    const/high16 v16, 0x40800000    # 4.0f

    .line 320
    .line 321
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 322
    .line 323
    .line 324
    const v0, -0x3f01999a    # -7.95f

    .line 325
    .line 326
    .line 327
    const v2, 0x3f3851ec    # 0.72f

    .line 328
    .line 329
    .line 330
    const v4, -0x3f58f5c3    # -5.22f

    .line 331
    .line 332
    .line 333
    const v6, 0x3e75c28f    # 0.24f

    .line 334
    .line 335
    .line 336
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 337
    .line 338
    .line 339
    const v0, 0x3e23d70a    # 0.16f

    .line 340
    .line 341
    .line 342
    const v2, -0x4091eb85    # -0.93f

    .line 343
    .line 344
    .line 345
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 346
    .line 347
    .line 348
    const v0, 0x3f666666    # 0.9f

    .line 349
    .line 350
    .line 351
    const/high16 v2, -0x41800000    # -0.25f

    .line 352
    .line 353
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 354
    .line 355
    .line 356
    const/high16 v17, 0x40000000    # 2.0f

    .line 357
    .line 358
    const/high16 v18, 0x41400000    # 12.0f

    .line 359
    .line 360
    const v13, 0x40128f5c    # 2.29f

    .line 361
    .line 362
    .line 363
    const v14, 0x40fb3333    # 7.85f

    .line 364
    .line 365
    .line 366
    const/high16 v15, 0x40000000    # 2.0f

    .line 367
    .line 368
    const v16, 0x411ee148    # 9.93f

    .line 369
    .line 370
    .line 371
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 372
    .line 373
    .line 374
    const v0, 0x3f5eb852    # 0.87f

    .line 375
    .line 376
    .line 377
    const v2, 0x40c70a3d    # 6.22f

    .line 378
    .line 379
    .line 380
    const v4, 0x3e947ae1    # 0.29f

    .line 381
    .line 382
    .line 383
    const v6, 0x4084cccd    # 4.15f

    .line 384
    .line 385
    .line 386
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 387
    .line 388
    .line 389
    const v0, 0x3f63d70a    # 0.89f

    .line 390
    .line 391
    .line 392
    const/high16 v2, 0x3e800000    # 0.25f

    .line 393
    .line 394
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 395
    .line 396
    .line 397
    const v0, 0x3f6e147b    # 0.93f

    .line 398
    .line 399
    .line 400
    const v2, 0x3e23d70a    # 0.16f

    .line 401
    .line 402
    .line 403
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 404
    .line 405
    .line 406
    const v17, 0x40fe6666    # 7.95f

    .line 407
    .line 408
    .line 409
    const v18, 0x3f3ae148    # 0.73f

    .line 410
    .line 411
    .line 412
    const v13, 0x402eb852    # 2.73f

    .line 413
    .line 414
    .line 415
    const v14, 0x3efae148    # 0.49f

    .line 416
    .line 417
    .line 418
    const v15, 0x40a70a3d    # 5.22f

    .line 419
    .line 420
    .line 421
    const v16, 0x3f3ae148    # 0.73f

    .line 422
    .line 423
    .line 424
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 425
    .line 426
    .line 427
    const v0, 0x40fe6666    # 7.95f

    .line 428
    .line 429
    .line 430
    const v2, -0x40c7ae14    # -0.72f

    .line 431
    .line 432
    .line 433
    const v4, 0x40a70a3d    # 5.22f

    .line 434
    .line 435
    .line 436
    const v6, -0x418a3d71    # -0.24f

    .line 437
    .line 438
    .line 439
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 440
    .line 441
    .line 442
    const v0, 0x3f6e147b    # 0.93f

    .line 443
    .line 444
    .line 445
    const v2, -0x41dc28f6    # -0.16f

    .line 446
    .line 447
    .line 448
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 449
    .line 450
    .line 451
    const/high16 v0, 0x3e800000    # 0.25f

    .line 452
    .line 453
    const v2, -0x409c28f6    # -0.89f

    .line 454
    .line 455
    .line 456
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 457
    .line 458
    .line 459
    const v17, 0x3f5eb852    # 0.87f

    .line 460
    .line 461
    .line 462
    const v18, -0x3f38a3d7    # -6.23f

    .line 463
    .line 464
    .line 465
    const v13, 0x3f147ae1    # 0.58f

    .line 466
    .line 467
    .line 468
    const v14, -0x3ffae148    # -2.08f

    .line 469
    .line 470
    .line 471
    const v15, 0x3f5eb852    # 0.87f

    .line 472
    .line 473
    .line 474
    const v16, -0x3f7ae148    # -4.16f

    .line 475
    .line 476
    .line 477
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 478
    .line 479
    .line 480
    const v0, -0x40a147ae    # -0.87f

    .line 481
    .line 482
    .line 483
    const v2, -0x3f38f5c3    # -6.22f

    .line 484
    .line 485
    .line 486
    const v4, -0x416b851f    # -0.29f

    .line 487
    .line 488
    .line 489
    const v6, -0x3f7b3333    # -4.15f

    .line 490
    .line 491
    .line 492
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 493
    .line 494
    .line 495
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 496
    .line 497
    .line 498
    const v0, 0x419a51ec    # 19.29f

    .line 499
    .line 500
    .line 501
    const v2, 0x418ae148    # 17.36f

    .line 502
    .line 503
    .line 504
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 505
    .line 506
    .line 507
    const v17, -0x3f16b852    # -7.29f

    .line 508
    .line 509
    .line 510
    const v18, 0x3f23d70a    # 0.64f

    .line 511
    .line 512
    .line 513
    const v13, -0x3fdae148    # -2.58f

    .line 514
    .line 515
    .line 516
    const v14, 0x3ee147ae    # 0.44f

    .line 517
    .line 518
    .line 519
    const v15, -0x3f651eb8    # -4.84f

    .line 520
    .line 521
    .line 522
    const v16, 0x3f23d70a    # 0.64f

    .line 523
    .line 524
    .line 525
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 526
    .line 527
    .line 528
    const v0, -0x3f6947ae    # -4.71f

    .line 529
    .line 530
    .line 531
    const v2, -0x3f16b852    # -7.29f

    .line 532
    .line 533
    .line 534
    const v4, -0x40dc28f6    # -0.64f

    .line 535
    .line 536
    .line 537
    const v6, -0x41b33333    # -0.2f

    .line 538
    .line 539
    .line 540
    invoke-virtual {v12, v0, v6, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 541
    .line 542
    .line 543
    const/high16 v17, 0x40800000    # 4.0f

    .line 544
    .line 545
    const/high16 v18, 0x41400000    # 12.0f

    .line 546
    .line 547
    const v13, 0x4087ae14    # 4.24f

    .line 548
    .line 549
    .line 550
    const v14, 0x417947ae    # 15.58f

    .line 551
    .line 552
    .line 553
    const/high16 v15, 0x40800000    # 4.0f

    .line 554
    .line 555
    const v16, 0x415c7ae1    # 13.78f

    .line 556
    .line 557
    .line 558
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 559
    .line 560
    .line 561
    const v17, 0x3f35c28f    # 0.71f

    .line 562
    .line 563
    .line 564
    const v18, -0x3f547ae1    # -5.36f

    .line 565
    .line 566
    .line 567
    const/4 v13, 0x0

    .line 568
    const v14, -0x401c28f6    # -1.78f

    .line 569
    .line 570
    .line 571
    const v15, 0x3e75c28f    # 0.24f

    .line 572
    .line 573
    .line 574
    const v16, -0x3f9ae148    # -3.58f

    .line 575
    .line 576
    .line 577
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 578
    .line 579
    .line 580
    const/high16 v17, 0x41400000    # 12.0f

    .line 581
    .line 582
    const/high16 v18, 0x40c00000    # 6.0f

    .line 583
    .line 584
    const v13, 0x40e947ae    # 7.29f

    .line 585
    .line 586
    .line 587
    const v14, 0x40c66666    # 6.2f

    .line 588
    .line 589
    .line 590
    const v15, 0x4118cccd    # 9.55f

    .line 591
    .line 592
    .line 593
    const/high16 v16, 0x40c00000    # 6.0f

    .line 594
    .line 595
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 596
    .line 597
    .line 598
    const v0, 0x3e4ccccd    # 0.2f

    .line 599
    .line 600
    .line 601
    const v2, 0x3f23d70a    # 0.64f

    .line 602
    .line 603
    .line 604
    const v4, 0x40e947ae    # 7.29f

    .line 605
    .line 606
    .line 607
    const v6, 0x4096b852    # 4.71f

    .line 608
    .line 609
    .line 610
    invoke-virtual {v12, v6, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 611
    .line 612
    .line 613
    const v17, 0x3f35c28f    # 0.71f

    .line 614
    .line 615
    .line 616
    const v18, 0x40ab851f    # 5.36f

    .line 617
    .line 618
    .line 619
    const v13, 0x3ef0a3d7    # 0.47f

    .line 620
    .line 621
    .line 622
    const v14, 0x3fe3d70a    # 1.78f

    .line 623
    .line 624
    .line 625
    const v15, 0x3f35c28f    # 0.71f

    .line 626
    .line 627
    .line 628
    const v16, 0x40651eb8    # 3.58f

    .line 629
    .line 630
    .line 631
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 632
    .line 633
    .line 634
    const v17, -0x40ca3d71    # -0.71f

    .line 635
    .line 636
    .line 637
    const/4 v13, 0x0

    .line 638
    const v15, -0x418a3d71    # -0.24f

    .line 639
    .line 640
    .line 641
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 642
    .line 643
    .line 644
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 645
    .line 646
    .line 647
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 648
    .line 649
    .line 650
    move-result-object v2

    .line 651
    const/16 v16, 0x3800

    .line 652
    .line 653
    const/16 v17, 0x0

    .line 654
    .line 655
    const/high16 v6, 0x3f800000    # 1.0f

    .line 656
    .line 657
    const/high16 v8, 0x3f800000    # 1.0f

    .line 658
    .line 659
    const/4 v7, 0x0

    .line 660
    const/high16 v12, 0x3f800000    # 1.0f

    .line 661
    .line 662
    const/4 v14, 0x0

    .line 663
    const/4 v15, 0x0

    .line 664
    const-string v4, ""

    .line 665
    .line 666
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 667
    .line 668
    .line 669
    move-result-object v0

    .line 670
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 671
    .line 672
    .line 673
    move-result-object v0

    .line 674
    sput-object v0, Landroidx/compose/material/icons/twotone/PanoramaWideAngleKt;->_panoramaWideAngle:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 675
    .line 676
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 677
    .line 678
    .line 679
    return-object v0
.end method
