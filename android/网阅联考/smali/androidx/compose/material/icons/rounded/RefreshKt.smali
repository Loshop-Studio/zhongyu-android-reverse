.class public final Landroidx/compose/material/icons/rounded/RefreshKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_refresh",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "Refresh",
        "Landroidx/compose/material/icons/Icons$Rounded;",
        "getRefresh",
        "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;",
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
        "SMAP\nRefresh.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Refresh.kt\nandroidx/compose/material/icons/rounded/RefreshKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,56:1\n122#2:57\n116#2,3:58\n119#2,3:62\n132#2,18:65\n152#2:102\n175#3:61\n694#4,2:83\n706#4,2:85\n708#4,11:91\n53#5,4:87\n*S KotlinDebug\n*F\n+ 1 Refresh.kt\nandroidx/compose/material/icons/rounded/RefreshKt\n*L\n29#1:57\n29#1:58,3\n29#1:62,3\n30#1:65,18\n30#1:102\n29#1:61\n30#1:83,2\n30#1:85,2\n30#1:91,11\n30#1:87,4\n*E\n"
    }
.end annotation


# static fields
.field private static _refresh:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getRefresh(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
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
    sget-object v0, Landroidx/compose/material/icons/rounded/RefreshKt;->_refresh:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.Refresh"

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
    const v0, 0x418d3333    # 17.65f

    .line 93
    .line 94
    .line 95
    const v1, 0x40cb3333    # 6.35f

    .line 96
    .line 97
    .line 98
    invoke-virtual {v7, v0, v1}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 99
    .line 100
    .line 101
    const v1, -0x402f5c29    # -1.63f

    .line 102
    .line 103
    .line 104
    const v2, -0x402f5c29    # -1.63f

    .line 105
    .line 106
    .line 107
    const v3, -0x3f83d70a    # -3.94f

    .line 108
    .line 109
    .line 110
    const v4, -0x3fdb851f    # -2.57f

    .line 111
    .line 112
    .line 113
    const v5, -0x3f30a3d7    # -6.48f

    .line 114
    .line 115
    .line 116
    const v6, -0x3fec28f6    # -2.31f

    .line 117
    .line 118
    .line 119
    move-object v0, v7

    .line 120
    invoke-virtual/range {v0 .. v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 121
    .line 122
    .line 123
    const v1, -0x3f951eb8    # -3.67f

    .line 124
    .line 125
    .line 126
    const v2, 0x3ebd70a4    # 0.37f

    .line 127
    .line 128
    .line 129
    const v3, -0x3f29eb85    # -6.69f

    .line 130
    .line 131
    .line 132
    const v4, 0x40566666    # 3.35f

    .line 133
    .line 134
    .line 135
    const v5, -0x3f1ccccd    # -7.1f

    .line 136
    .line 137
    .line 138
    const v6, 0x40e0a3d7    # 7.02f

    .line 139
    .line 140
    .line 141
    invoke-virtual/range {v0 .. v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 142
    .line 143
    .line 144
    const v1, 0x406147ae    # 3.52f

    .line 145
    .line 146
    .line 147
    const v2, 0x417e8f5c    # 15.91f

    .line 148
    .line 149
    .line 150
    const v3, 0x40e8a3d7    # 7.27f

    .line 151
    .line 152
    .line 153
    const/high16 v4, 0x41a00000    # 20.0f

    .line 154
    .line 155
    const/high16 v5, 0x41400000    # 12.0f

    .line 156
    .line 157
    const/high16 v6, 0x41a00000    # 20.0f

    .line 158
    .line 159
    invoke-virtual/range {v0 .. v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 160
    .line 161
    .line 162
    const v1, 0x404c28f6    # 3.19f

    .line 163
    .line 164
    .line 165
    const/4 v2, 0x0

    .line 166
    const v3, 0x40bdc28f    # 5.93f

    .line 167
    .line 168
    .line 169
    const v4, -0x4010a3d7    # -1.87f

    .line 170
    .line 171
    .line 172
    const v5, 0x40e6b852    # 7.21f

    .line 173
    .line 174
    .line 175
    const v6, -0x3f6e147b    # -4.56f

    .line 176
    .line 177
    .line 178
    invoke-virtual/range {v0 .. v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 179
    .line 180
    .line 181
    const v1, 0x3ea3d70a    # 0.32f

    .line 182
    .line 183
    .line 184
    const v2, -0x40d47ae1    # -0.67f

    .line 185
    .line 186
    .line 187
    const v3, -0x41dc28f6    # -0.16f

    .line 188
    .line 189
    .line 190
    const v4, -0x4047ae14    # -1.44f

    .line 191
    .line 192
    .line 193
    const v5, -0x4099999a    # -0.9f

    .line 194
    .line 195
    .line 196
    const v6, -0x4047ae14    # -1.44f

    .line 197
    .line 198
    .line 199
    invoke-virtual/range {v0 .. v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 200
    .line 201
    .line 202
    const v1, -0x41428f5c    # -0.37f

    .line 203
    .line 204
    .line 205
    const/4 v2, 0x0

    .line 206
    const v3, -0x40c7ae14    # -0.72f

    .line 207
    .line 208
    .line 209
    const v4, 0x3e4ccccd    # 0.2f

    .line 210
    .line 211
    .line 212
    const v5, -0x409eb852    # -0.88f

    .line 213
    .line 214
    .line 215
    const v6, 0x3f07ae14    # 0.53f

    .line 216
    .line 217
    .line 218
    invoke-virtual/range {v0 .. v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 219
    .line 220
    .line 221
    const v1, -0x406f5c29    # -1.13f

    .line 222
    .line 223
    .line 224
    const v2, 0x401b851f    # 2.43f

    .line 225
    .line 226
    .line 227
    const v3, -0x3f8a3d71    # -3.84f

    .line 228
    .line 229
    .line 230
    const v4, 0x407e147b    # 3.97f

    .line 231
    .line 232
    .line 233
    const v5, -0x3f266666    # -6.8f

    .line 234
    .line 235
    .line 236
    const v6, 0x4053d70a    # 3.31f

    .line 237
    .line 238
    .line 239
    invoke-virtual/range {v0 .. v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 240
    .line 241
    .line 242
    const v1, -0x3ff1eb85    # -2.22f

    .line 243
    .line 244
    .line 245
    const v2, -0x41051eb8    # -0.49f

    .line 246
    .line 247
    .line 248
    const v3, -0x3f7fae14    # -4.01f

    .line 249
    .line 250
    .line 251
    const v4, -0x3feccccd    # -2.3f

    .line 252
    .line 253
    .line 254
    const v5, -0x3f70a3d7    # -4.48f

    .line 255
    .line 256
    .line 257
    const v6, -0x3f6f5c29    # -4.52f

    .line 258
    .line 259
    .line 260
    invoke-virtual/range {v0 .. v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 261
    .line 262
    .line 263
    const v1, 0x40a9eb85    # 5.31f

    .line 264
    .line 265
    .line 266
    const v2, 0x41170a3d    # 9.44f

    .line 267
    .line 268
    .line 269
    const v3, 0x410428f6    # 8.26f

    .line 270
    .line 271
    .line 272
    const/high16 v4, 0x40c00000    # 6.0f

    .line 273
    .line 274
    const/high16 v5, 0x41400000    # 12.0f

    .line 275
    .line 276
    const/high16 v6, 0x40c00000    # 6.0f

    .line 277
    .line 278
    invoke-virtual/range {v0 .. v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 279
    .line 280
    .line 281
    const v1, 0x3fd47ae1    # 1.66f

    .line 282
    .line 283
    .line 284
    const/4 v2, 0x0

    .line 285
    const v3, 0x4048f5c3    # 3.14f

    .line 286
    .line 287
    .line 288
    const v4, 0x3f30a3d7    # 0.69f

    .line 289
    .line 290
    .line 291
    const v5, 0x40870a3d    # 4.22f

    .line 292
    .line 293
    .line 294
    const v6, 0x3fe3d70a    # 1.78f

    .line 295
    .line 296
    .line 297
    invoke-virtual/range {v0 .. v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 298
    .line 299
    .line 300
    const v0, -0x403eb852    # -1.51f

    .line 301
    .line 302
    .line 303
    const v1, 0x3fc147ae    # 1.51f

    .line 304
    .line 305
    .line 306
    invoke-virtual {v7, v0, v1}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 307
    .line 308
    .line 309
    const v1, -0x40deb852    # -0.63f

    .line 310
    .line 311
    .line 312
    const v2, 0x3f2147ae    # 0.63f

    .line 313
    .line 314
    .line 315
    const v3, -0x41bd70a4    # -0.19f

    .line 316
    .line 317
    .line 318
    const v4, 0x3fdae148    # 1.71f

    .line 319
    .line 320
    .line 321
    const v5, 0x3f333333    # 0.7f

    .line 322
    .line 323
    .line 324
    const v6, 0x3fdae148    # 1.71f

    .line 325
    .line 326
    .line 327
    move-object v0, v7

    .line 328
    invoke-virtual/range {v0 .. v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 329
    .line 330
    .line 331
    const/high16 v0, 0x41980000    # 19.0f

    .line 332
    .line 333
    invoke-virtual {v7, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 334
    .line 335
    .line 336
    const v1, 0x3f0ccccd    # 0.55f

    .line 337
    .line 338
    .line 339
    const/4 v2, 0x0

    .line 340
    const/high16 v3, 0x3f800000    # 1.0f

    .line 341
    .line 342
    const v4, -0x4119999a    # -0.45f

    .line 343
    .line 344
    .line 345
    const/high16 v5, 0x3f800000    # 1.0f

    .line 346
    .line 347
    const/high16 v6, -0x40800000    # -1.0f

    .line 348
    .line 349
    move-object v0, v7

    .line 350
    invoke-virtual/range {v0 .. v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 351
    .line 352
    .line 353
    const v0, 0x40cd1eb8    # 6.41f

    .line 354
    .line 355
    .line 356
    invoke-virtual {v7, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 357
    .line 358
    .line 359
    const/4 v1, 0x0

    .line 360
    const v2, -0x409c28f6    # -0.89f

    .line 361
    .line 362
    .line 363
    const v3, -0x4075c28f    # -1.08f

    .line 364
    .line 365
    .line 366
    const v4, -0x40547ae1    # -1.34f

    .line 367
    .line 368
    .line 369
    const v5, -0x40251eb8    # -1.71f

    .line 370
    .line 371
    .line 372
    const v6, -0x40ca3d71    # -0.71f

    .line 373
    .line 374
    .line 375
    move-object v0, v7

    .line 376
    invoke-virtual/range {v0 .. v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 377
    .line 378
    .line 379
    const v0, -0x40dc28f6    # -0.64f

    .line 380
    .line 381
    .line 382
    const v1, 0x3f266666    # 0.65f

    .line 383
    .line 384
    .line 385
    invoke-virtual {v7, v0, v1}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 386
    .line 387
    .line 388
    invoke-virtual {v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 389
    .line 390
    .line 391
    invoke-virtual {v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 392
    .line 393
    .line 394
    move-result-object v14

    .line 395
    const/16 v25, 0x0

    .line 396
    .line 397
    const/16 v26, 0x0

    .line 398
    .line 399
    const/16 v27, 0x0

    .line 400
    .line 401
    const/16 v28, 0x3800

    .line 402
    .line 403
    const/16 v29, 0x0

    .line 404
    .line 405
    invoke-static/range {v13 .. v29}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 406
    .line 407
    .line 408
    move-result-object v0

    .line 409
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 410
    .line 411
    .line 412
    move-result-object v0

    .line 413
    sput-object v0, Landroidx/compose/material/icons/rounded/RefreshKt;->_refresh:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 414
    .line 415
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 416
    .line 417
    .line 418
    return-object v0
.end method
