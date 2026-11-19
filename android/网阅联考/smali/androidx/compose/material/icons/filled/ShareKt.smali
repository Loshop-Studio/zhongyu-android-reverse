.class public final Landroidx/compose/material/icons/filled/ShareKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_share",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "Share",
        "Landroidx/compose/material/icons/Icons$Filled;",
        "getShare",
        "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;",
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
        "SMAP\nShare.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Share.kt\nandroidx/compose/material/icons/filled/ShareKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,59:1\n122#2:60\n116#2,3:61\n119#2,3:65\n132#2,18:68\n152#2:105\n175#3:64\n694#4,2:86\n706#4,2:88\n708#4,11:94\n53#5,4:90\n*S KotlinDebug\n*F\n+ 1 Share.kt\nandroidx/compose/material/icons/filled/ShareKt\n*L\n29#1:60\n29#1:61,3\n29#1:65,3\n30#1:68,18\n30#1:105\n29#1:64\n30#1:86,2\n30#1:88,2\n30#1:94,11\n30#1:90,4\n*E\n"
    }
.end annotation


# static fields
.field private static _share:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getShare(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 30

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
    sget-object v0, Landroidx/compose/material/icons/filled/ShareKt;->_share:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Filled.Share"

    .line 17
    .line 18
    new-instance v1, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 19
    .line 20
    move-object v13, v1

    .line 21
    const/high16 v0, 0x41c00000    # 24.0f

    .line 22
    .line 23
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 28
    .line 29
    .line 30
    move-result v4

    .line 31
    const/high16 v5, 0x41c00000    # 24.0f

    .line 32
    .line 33
    const/high16 v6, 0x41c00000    # 24.0f

    .line 34
    .line 35
    const-wide/16 v7, 0x0

    .line 36
    .line 37
    const/4 v9, 0x0

    .line 38
    const/4 v10, 0x0

    .line 39
    const/16 v11, 0xe0

    .line 40
    .line 41
    const/4 v12, 0x0

    .line 42
    invoke-direct/range {v1 .. v12}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;-><init>(Ljava/lang/String;FFFFJIZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 43
    .line 44
    .line 45
    const/high16 v18, 0x3f800000    # 1.0f

    .line 46
    .line 47
    const/high16 v20, 0x3f800000    # 1.0f

    .line 48
    .line 49
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 50
    .line 51
    .line 52
    move-result v15

    .line 53
    new-instance v0, Landroidx/compose/ui/graphics/SolidColor;

    .line 54
    .line 55
    move-object/from16 v17, v0

    .line 56
    .line 57
    sget-object v1, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    .line 58
    .line 59
    invoke-virtual {v1}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 60
    .line 61
    .line 62
    move-result-wide v1

    .line 63
    const/4 v3, 0x0

    .line 64
    invoke-direct {v0, v1, v2, v3}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 65
    .line 66
    .line 67
    const/16 v19, 0x0

    .line 68
    .line 69
    const/high16 v21, 0x3f800000    # 1.0f

    .line 70
    .line 71
    sget-object v0, Landroidx/compose/ui/graphics/StrokeCap;->Companion:Landroidx/compose/ui/graphics/StrokeCap$Companion;

    .line 72
    .line 73
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 74
    .line 75
    .line 76
    move-result v22

    .line 77
    sget-object v0, Landroidx/compose/ui/graphics/StrokeJoin;->Companion:Landroidx/compose/ui/graphics/StrokeJoin$Companion;

    .line 78
    .line 79
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 80
    .line 81
    .line 82
    move-result v23

    .line 83
    const/high16 v24, 0x3f800000    # 1.0f

    .line 84
    .line 85
    const-string v16, ""

    .line 86
    .line 87
    new-instance v7, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 88
    .line 89
    invoke-direct {v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 90
    .line 91
    .line 92
    const/high16 v0, 0x41900000    # 18.0f

    .line 93
    .line 94
    const v1, 0x4180a3d7    # 16.08f

    .line 95
    .line 96
    .line 97
    invoke-virtual {v7, v0, v1}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 98
    .line 99
    .line 100
    const v1, -0x40bd70a4    # -0.76f

    .line 101
    .line 102
    .line 103
    const/4 v2, 0x0

    .line 104
    const v3, -0x4047ae14    # -1.44f

    .line 105
    .line 106
    .line 107
    const v4, 0x3e99999a    # 0.3f

    .line 108
    .line 109
    .line 110
    const v5, -0x40051eb8    # -1.96f

    .line 111
    .line 112
    .line 113
    const v6, 0x3f451eb8    # 0.77f

    .line 114
    .line 115
    .line 116
    move-object v0, v7

    .line 117
    invoke-virtual/range {v0 .. v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 118
    .line 119
    .line 120
    const v0, 0x410e8f5c    # 8.91f

    .line 121
    .line 122
    .line 123
    const v1, 0x414b3333    # 12.7f

    .line 124
    .line 125
    .line 126
    invoke-virtual {v7, v0, v1}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 127
    .line 128
    .line 129
    const v1, 0x3d4ccccd    # 0.05f

    .line 130
    .line 131
    .line 132
    const v2, -0x41947ae1    # -0.23f

    .line 133
    .line 134
    .line 135
    const v3, 0x3db851ec    # 0.09f

    .line 136
    .line 137
    .line 138
    const v4, -0x41147ae1    # -0.46f

    .line 139
    .line 140
    .line 141
    const v5, 0x3db851ec    # 0.09f

    .line 142
    .line 143
    .line 144
    const v6, -0x40cccccd    # -0.7f

    .line 145
    .line 146
    .line 147
    move-object v0, v7

    .line 148
    invoke-virtual/range {v0 .. v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 149
    .line 150
    .line 151
    const v0, -0x4247ae14    # -0.09f

    .line 152
    .line 153
    .line 154
    const v1, -0x40cccccd    # -0.7f

    .line 155
    .line 156
    .line 157
    const v2, -0x42dc28f6    # -0.04f

    .line 158
    .line 159
    .line 160
    const v3, -0x410f5c29    # -0.47f

    .line 161
    .line 162
    .line 163
    invoke-virtual {v7, v2, v3, v0, v1}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 164
    .line 165
    .line 166
    const v0, 0x40e1999a    # 7.05f

    .line 167
    .line 168
    .line 169
    const v1, -0x3f7c7ae1    # -4.11f

    .line 170
    .line 171
    .line 172
    invoke-virtual {v7, v0, v1}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 173
    .line 174
    .line 175
    const v1, 0x3f0a3d71    # 0.54f

    .line 176
    .line 177
    .line 178
    const/high16 v2, 0x3f000000    # 0.5f

    .line 179
    .line 180
    const/high16 v3, 0x3fa00000    # 1.25f

    .line 181
    .line 182
    const v4, 0x3f4f5c29    # 0.81f

    .line 183
    .line 184
    .line 185
    const v5, 0x40028f5c    # 2.04f

    .line 186
    .line 187
    .line 188
    const v6, 0x3f4f5c29    # 0.81f

    .line 189
    .line 190
    .line 191
    move-object v0, v7

    .line 192
    invoke-virtual/range {v0 .. v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 193
    .line 194
    .line 195
    const v1, 0x3fd47ae1    # 1.66f

    .line 196
    .line 197
    .line 198
    const/4 v2, 0x0

    .line 199
    const/high16 v3, 0x40400000    # 3.0f

    .line 200
    .line 201
    const v4, -0x40547ae1    # -1.34f

    .line 202
    .line 203
    .line 204
    const/high16 v5, 0x40400000    # 3.0f

    .line 205
    .line 206
    const/high16 v6, -0x3fc00000    # -3.0f

    .line 207
    .line 208
    invoke-virtual/range {v0 .. v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 209
    .line 210
    .line 211
    const v0, -0x40547ae1    # -1.34f

    .line 212
    .line 213
    .line 214
    const/high16 v1, -0x3fc00000    # -3.0f

    .line 215
    .line 216
    invoke-virtual {v7, v0, v1, v1, v1}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 217
    .line 218
    .line 219
    const v8, 0x3fab851f    # 1.34f

    .line 220
    .line 221
    .line 222
    const/high16 v9, 0x40400000    # 3.0f

    .line 223
    .line 224
    invoke-virtual {v7, v1, v8, v1, v9}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 225
    .line 226
    .line 227
    const/4 v1, 0x0

    .line 228
    const v2, 0x3e75c28f    # 0.24f

    .line 229
    .line 230
    .line 231
    const v3, 0x3d23d70a    # 0.04f

    .line 232
    .line 233
    .line 234
    const v4, 0x3ef0a3d7    # 0.47f

    .line 235
    .line 236
    .line 237
    const v5, 0x3db851ec    # 0.09f

    .line 238
    .line 239
    .line 240
    const v6, 0x3f333333    # 0.7f

    .line 241
    .line 242
    .line 243
    move-object v0, v7

    .line 244
    invoke-virtual/range {v0 .. v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 245
    .line 246
    .line 247
    const v0, 0x4100a3d7    # 8.04f

    .line 248
    .line 249
    .line 250
    const v1, 0x411cf5c3    # 9.81f

    .line 251
    .line 252
    .line 253
    invoke-virtual {v7, v0, v1}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 254
    .line 255
    .line 256
    const/high16 v1, 0x40f00000    # 7.5f

    .line 257
    .line 258
    const v2, 0x4114f5c3    # 9.31f

    .line 259
    .line 260
    .line 261
    const v3, 0x40d947ae    # 6.79f

    .line 262
    .line 263
    .line 264
    const/high16 v4, 0x41100000    # 9.0f

    .line 265
    .line 266
    const/high16 v5, 0x40c00000    # 6.0f

    .line 267
    .line 268
    const/high16 v6, 0x41100000    # 9.0f

    .line 269
    .line 270
    move-object v0, v7

    .line 271
    invoke-virtual/range {v0 .. v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 272
    .line 273
    .line 274
    const v1, -0x402b851f    # -1.66f

    .line 275
    .line 276
    .line 277
    const/4 v2, 0x0

    .line 278
    const/high16 v3, -0x3fc00000    # -3.0f

    .line 279
    .line 280
    const v4, 0x3fab851f    # 1.34f

    .line 281
    .line 282
    .line 283
    const/high16 v5, -0x3fc00000    # -3.0f

    .line 284
    .line 285
    const/high16 v6, 0x40400000    # 3.0f

    .line 286
    .line 287
    invoke-virtual/range {v0 .. v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 288
    .line 289
    .line 290
    invoke-virtual {v7, v8, v9, v9, v9}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 291
    .line 292
    .line 293
    const v1, 0x3f4a3d71    # 0.79f

    .line 294
    .line 295
    .line 296
    const/high16 v3, 0x3fc00000    # 1.5f

    .line 297
    .line 298
    const v4, -0x416147ae    # -0.31f

    .line 299
    .line 300
    .line 301
    const v5, 0x40028f5c    # 2.04f

    .line 302
    .line 303
    .line 304
    const v6, -0x40b0a3d7    # -0.81f

    .line 305
    .line 306
    .line 307
    invoke-virtual/range {v0 .. v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 308
    .line 309
    .line 310
    const v0, 0x40e3d70a    # 7.12f

    .line 311
    .line 312
    .line 313
    const v1, 0x40851eb8    # 4.16f

    .line 314
    .line 315
    .line 316
    invoke-virtual {v7, v0, v1}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 317
    .line 318
    .line 319
    const v1, -0x42b33333    # -0.05f

    .line 320
    .line 321
    .line 322
    const v2, 0x3e570a3d    # 0.21f

    .line 323
    .line 324
    .line 325
    const v3, -0x425c28f6    # -0.08f

    .line 326
    .line 327
    .line 328
    const v4, 0x3edc28f6    # 0.43f

    .line 329
    .line 330
    .line 331
    const v5, -0x425c28f6    # -0.08f

    .line 332
    .line 333
    .line 334
    const v6, 0x3f266666    # 0.65f

    .line 335
    .line 336
    .line 337
    move-object v0, v7

    .line 338
    invoke-virtual/range {v0 .. v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 339
    .line 340
    .line 341
    const/4 v1, 0x0

    .line 342
    const v2, 0x3fce147b    # 1.61f

    .line 343
    .line 344
    .line 345
    const v3, 0x3fa7ae14    # 1.31f

    .line 346
    .line 347
    .line 348
    const v4, 0x403ae148    # 2.92f

    .line 349
    .line 350
    .line 351
    const v5, 0x403ae148    # 2.92f

    .line 352
    .line 353
    .line 354
    const v6, 0x403ae148    # 2.92f

    .line 355
    .line 356
    .line 357
    invoke-virtual/range {v0 .. v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 358
    .line 359
    .line 360
    const v1, 0x3fce147b    # 1.61f

    .line 361
    .line 362
    .line 363
    const/4 v2, 0x0

    .line 364
    const v3, 0x403ae148    # 2.92f

    .line 365
    .line 366
    .line 367
    const v4, -0x405851ec    # -1.31f

    .line 368
    .line 369
    .line 370
    const v6, -0x3fc51eb8    # -2.92f

    .line 371
    .line 372
    .line 373
    invoke-virtual/range {v0 .. v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 374
    .line 375
    .line 376
    const v0, -0x405851ec    # -1.31f

    .line 377
    .line 378
    .line 379
    const v1, -0x3fc51eb8    # -2.92f

    .line 380
    .line 381
    .line 382
    invoke-virtual {v7, v0, v1, v1, v1}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 383
    .line 384
    .line 385
    invoke-virtual {v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 386
    .line 387
    .line 388
    invoke-virtual {v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 389
    .line 390
    .line 391
    move-result-object v14

    .line 392
    const/16 v25, 0x0

    .line 393
    .line 394
    const/16 v26, 0x0

    .line 395
    .line 396
    const/16 v27, 0x0

    .line 397
    .line 398
    const/16 v28, 0x3800

    .line 399
    .line 400
    const/16 v29, 0x0

    .line 401
    .line 402
    invoke-static/range {v13 .. v29}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 403
    .line 404
    .line 405
    move-result-object v0

    .line 406
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 407
    .line 408
    .line 409
    move-result-object v0

    .line 410
    sput-object v0, Landroidx/compose/material/icons/filled/ShareKt;->_share:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 411
    .line 412
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 413
    .line 414
    .line 415
    return-object v0
.end method
