.class public final Landroidx/compose/material/icons/rounded/RssFeedKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_rssFeed",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "RssFeed",
        "Landroidx/compose/material/icons/Icons$Rounded;",
        "getRssFeed",
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
        "SMAP\nRssFeed.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RssFeed.kt\nandroidx/compose/material/icons/rounded/RssFeedKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,59:1\n212#2,12:60\n233#2,18:73\n253#2:110\n233#2,18:111\n253#2:148\n174#3:72\n705#4,2:91\n717#4,2:93\n719#4,11:99\n705#4,2:129\n717#4,2:131\n719#4,11:137\n72#5,4:95\n72#5,4:133\n*S KotlinDebug\n*F\n+ 1 RssFeed.kt\nandroidx/compose/material/icons/rounded/RssFeedKt\n*L\n29#1:60,12\n30#1:73,18\n30#1:110\n36#1:111,18\n36#1:148\n29#1:72\n30#1:91,2\n30#1:93,2\n30#1:99,11\n36#1:129,2\n36#1:131,2\n36#1:137,11\n30#1:95,4\n36#1:133,4\n*E\n"
    }
.end annotation


# static fields
.field private static _rssFeed:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getRssFeed(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 28

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/RssFeedKt;->_rssFeed:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.RssFeed"

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
    const v4, 0x40c5c28f    # 6.18f

    .line 71
    .line 72
    .line 73
    const v6, 0x418e8f5c    # 17.82f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v4, -0x3ff47ae1    # -2.18f

    .line 80
    .line 81
    .line 82
    const/4 v6, 0x0

    .line 83
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 84
    .line 85
    .line 86
    const v26, 0x408b851f    # 4.36f

    .line 87
    .line 88
    .line 89
    const/16 v27, 0x0

    .line 90
    .line 91
    const v21, 0x400b851f    # 2.18f

    .line 92
    .line 93
    .line 94
    const v22, 0x400b851f    # 2.18f

    .line 95
    .line 96
    .line 97
    const/16 v23, 0x0

    .line 98
    .line 99
    const/16 v24, 0x1

    .line 100
    .line 101
    const/16 v25, 0x1

    .line 102
    .line 103
    move-object/from16 v20, v2

    .line 104
    .line 105
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 106
    .line 107
    .line 108
    const v26, -0x3f747ae1    # -4.36f

    .line 109
    .line 110
    .line 111
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 112
    .line 113
    .line 114
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 115
    .line 116
    .line 117
    move-result-object v2

    .line 118
    const/16 v16, 0x3800

    .line 119
    .line 120
    const/16 v17, 0x0

    .line 121
    .line 122
    const/high16 v6, 0x3f800000    # 1.0f

    .line 123
    .line 124
    const/high16 v8, 0x3f800000    # 1.0f

    .line 125
    .line 126
    const/4 v7, 0x0

    .line 127
    const/high16 v9, 0x3f800000    # 1.0f

    .line 128
    .line 129
    const/high16 v12, 0x3f800000    # 1.0f

    .line 130
    .line 131
    const/4 v13, 0x0

    .line 132
    const/4 v14, 0x0

    .line 133
    const/4 v15, 0x0

    .line 134
    const-string v4, ""

    .line 135
    .line 136
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 137
    .line 138
    .line 139
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 140
    .line 141
    .line 142
    move-result v3

    .line 143
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 144
    .line 145
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 146
    .line 147
    .line 148
    move-result-wide v6

    .line 149
    const/4 v0, 0x0

    .line 150
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 151
    .line 152
    .line 153
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 154
    .line 155
    .line 156
    move-result v10

    .line 157
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 158
    .line 159
    .line 160
    move-result v11

    .line 161
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 162
    .line 163
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 164
    .line 165
    .line 166
    const v0, 0x40b2e148    # 5.59f

    .line 167
    .line 168
    .line 169
    const v2, 0x4123ae14    # 10.23f

    .line 170
    .line 171
    .line 172
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 173
    .line 174
    .line 175
    const v17, -0x40347ae1    # -1.59f

    .line 176
    .line 177
    .line 178
    const v18, 0x3fb33333    # 1.4f

    .line 179
    .line 180
    .line 181
    const v13, -0x40a8f5c3    # -0.84f

    .line 182
    .line 183
    .line 184
    const v14, -0x41f0a3d7    # -0.14f

    .line 185
    .line 186
    .line 187
    const v15, -0x40347ae1    # -1.59f

    .line 188
    .line 189
    .line 190
    const v16, 0x3f0ccccd    # 0.55f

    .line 191
    .line 192
    .line 193
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 194
    .line 195
    .line 196
    const v17, 0x3f9d70a4    # 1.23f

    .line 197
    .line 198
    .line 199
    const/4 v13, 0x0

    .line 200
    const v14, 0x3f35c28f    # 0.71f

    .line 201
    .line 202
    .line 203
    const v15, 0x3f07ae14    # 0.53f

    .line 204
    .line 205
    .line 206
    const v16, 0x3fa3d70a    # 1.28f

    .line 207
    .line 208
    .line 209
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 210
    .line 211
    .line 212
    const v17, 0x40b7ae14    # 5.74f

    .line 213
    .line 214
    .line 215
    const v18, 0x40b7ae14    # 5.74f

    .line 216
    .line 217
    .line 218
    const v13, 0x403ae148    # 2.92f

    .line 219
    .line 220
    .line 221
    const v14, 0x3f028f5c    # 0.51f

    .line 222
    .line 223
    .line 224
    const v15, 0x40a70a3d    # 5.22f

    .line 225
    .line 226
    .line 227
    const v16, 0x40347ae1    # 2.82f

    .line 228
    .line 229
    .line 230
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 231
    .line 232
    .line 233
    const v17, 0x3fb33333    # 1.4f

    .line 234
    .line 235
    .line 236
    const v18, 0x3f9d70a4    # 1.23f

    .line 237
    .line 238
    .line 239
    const v13, 0x3df5c28f    # 0.12f

    .line 240
    .line 241
    .line 242
    const v14, 0x3f333333    # 0.7f

    .line 243
    .line 244
    .line 245
    const v15, 0x3f30a3d7    # 0.69f

    .line 246
    .line 247
    .line 248
    const v16, 0x3f9d70a4    # 1.23f

    .line 249
    .line 250
    .line 251
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 252
    .line 253
    .line 254
    const v17, 0x3fb47ae1    # 1.41f

    .line 255
    .line 256
    .line 257
    const v18, -0x40347ae1    # -1.59f

    .line 258
    .line 259
    .line 260
    const v13, 0x3f59999a    # 0.85f

    .line 261
    .line 262
    .line 263
    const/4 v14, 0x0

    .line 264
    const v15, 0x3fc51eb8    # 1.54f

    .line 265
    .line 266
    .line 267
    const/high16 v16, -0x40c00000    # -0.75f

    .line 268
    .line 269
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 270
    .line 271
    .line 272
    const v17, -0x3efcf5c3    # -8.19f

    .line 273
    .line 274
    .line 275
    const v18, -0x3efd1eb8    # -8.18f

    .line 276
    .line 277
    .line 278
    const v13, -0x40d1eb85    # -0.68f

    .line 279
    .line 280
    .line 281
    const v14, -0x3f79999a    # -4.2f

    .line 282
    .line 283
    .line 284
    const v15, -0x3f80a3d7    # -3.99f

    .line 285
    .line 286
    .line 287
    const v16, -0x3f0fae14    # -7.51f

    .line 288
    .line 289
    .line 290
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 291
    .line 292
    .line 293
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 294
    .line 295
    .line 296
    const v0, 0x40b1eb85    # 5.56f

    .line 297
    .line 298
    .line 299
    const v2, 0x4090a3d7    # 4.52f

    .line 300
    .line 301
    .line 302
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 303
    .line 304
    .line 305
    const/high16 v17, 0x40800000    # 4.0f

    .line 306
    .line 307
    const v18, 0x40bdc28f    # 5.93f

    .line 308
    .line 309
    .line 310
    const v13, 0x40975c29    # 4.73f

    .line 311
    .line 312
    .line 313
    const v14, 0x408dc28f    # 4.43f

    .line 314
    .line 315
    .line 316
    const/high16 v15, 0x40800000    # 4.0f

    .line 317
    .line 318
    const v16, 0x40a33333    # 5.1f

    .line 319
    .line 320
    .line 321
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 322
    .line 323
    .line 324
    const v17, 0x3fa28f5c    # 1.27f

    .line 325
    .line 326
    .line 327
    const v18, 0x3fb33333    # 1.4f

    .line 328
    .line 329
    .line 330
    const/4 v13, 0x0

    .line 331
    const v14, 0x3f3ae148    # 0.73f

    .line 332
    .line 333
    .line 334
    const v15, 0x3f0ccccd    # 0.55f

    .line 335
    .line 336
    .line 337
    const v16, 0x3faa3d71    # 1.33f

    .line 338
    .line 339
    .line 340
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 341
    .line 342
    .line 343
    const v17, 0x41363d71    # 11.39f

    .line 344
    .line 345
    .line 346
    const v18, 0x41363d71    # 11.39f

    .line 347
    .line 348
    .line 349
    const v13, 0x40c051ec    # 6.01f

    .line 350
    .line 351
    .line 352
    const v14, 0x3f19999a    # 0.6f

    .line 353
    .line 354
    .line 355
    const v15, 0x412ca3d7    # 10.79f

    .line 356
    .line 357
    .line 358
    const v16, 0x40ac28f6    # 5.38f

    .line 359
    .line 360
    .line 361
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 362
    .line 363
    .line 364
    const v17, 0x3fb33333    # 1.4f

    .line 365
    .line 366
    .line 367
    const v18, 0x3fa3d70a    # 1.28f

    .line 368
    .line 369
    .line 370
    const v13, 0x3d8f5c29    # 0.07f

    .line 371
    .line 372
    .line 373
    const v14, 0x3f3ae148    # 0.73f

    .line 374
    .line 375
    .line 376
    const v15, 0x3f2b851f    # 0.67f

    .line 377
    .line 378
    .line 379
    const v16, 0x3fa3d70a    # 1.28f

    .line 380
    .line 381
    .line 382
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 383
    .line 384
    .line 385
    const v17, 0x3fb5c28f    # 1.42f

    .line 386
    .line 387
    .line 388
    const v18, -0x403851ec    # -1.56f

    .line 389
    .line 390
    .line 391
    const v13, 0x3f570a3d    # 0.84f

    .line 392
    .line 393
    .line 394
    const/4 v14, 0x0

    .line 395
    const/high16 v15, 0x3fc00000    # 1.5f

    .line 396
    .line 397
    const v16, -0x40c51eb8    # -0.73f

    .line 398
    .line 399
    .line 400
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 401
    .line 402
    .line 403
    const v17, -0x3ea147ae    # -13.92f

    .line 404
    .line 405
    .line 406
    const v18, -0x3ea147ae    # -13.92f

    .line 407
    .line 408
    .line 409
    const v13, -0x40c51eb8    # -0.73f

    .line 410
    .line 411
    .line 412
    const v14, -0x3f151eb8    # -7.34f

    .line 413
    .line 414
    .line 415
    const v15, -0x3f2dc28f    # -6.57f

    .line 416
    .line 417
    .line 418
    const v16, -0x3eacf5c3    # -13.19f

    .line 419
    .line 420
    .line 421
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 422
    .line 423
    .line 424
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 425
    .line 426
    .line 427
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 428
    .line 429
    .line 430
    move-result-object v2

    .line 431
    const/16 v16, 0x3800

    .line 432
    .line 433
    const/16 v17, 0x0

    .line 434
    .line 435
    const/high16 v6, 0x3f800000    # 1.0f

    .line 436
    .line 437
    const/4 v7, 0x0

    .line 438
    const/high16 v12, 0x3f800000    # 1.0f

    .line 439
    .line 440
    const/4 v13, 0x0

    .line 441
    const/4 v14, 0x0

    .line 442
    const/4 v15, 0x0

    .line 443
    const-string v4, ""

    .line 444
    .line 445
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 446
    .line 447
    .line 448
    move-result-object v0

    .line 449
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 450
    .line 451
    .line 452
    move-result-object v0

    .line 453
    sput-object v0, Landroidx/compose/material/icons/rounded/RssFeedKt;->_rssFeed:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 454
    .line 455
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 456
    .line 457
    .line 458
    return-object v0
.end method
