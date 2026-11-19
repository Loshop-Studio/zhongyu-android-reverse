.class public final Landroidx/compose/material/icons/rounded/WifiChannelKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_wifiChannel",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "WifiChannel",
        "Landroidx/compose/material/icons/Icons$Rounded;",
        "getWifiChannel",
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
        "SMAP\nWifiChannel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WifiChannel.kt\nandroidx/compose/material/icons/rounded/WifiChannelKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,59:1\n212#2,12:60\n233#2,18:73\n253#2:110\n174#3:72\n705#4,2:91\n717#4,2:93\n719#4,11:99\n72#5,4:95\n*S KotlinDebug\n*F\n+ 1 WifiChannel.kt\nandroidx/compose/material/icons/rounded/WifiChannelKt\n*L\n29#1:60,12\n30#1:73,18\n30#1:110\n29#1:72\n30#1:91,2\n30#1:93,2\n30#1:99,11\n30#1:95,4\n*E\n"
    }
.end annotation


# static fields
.field private static _wifiChannel:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getWifiChannel(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/WifiChannelKt;->_wifiChannel:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.WifiChannel"

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
    const v0, 0x408428f6    # 4.13f

    .line 71
    .line 72
    .line 73
    const/high16 v2, 0x41a80000    # 21.0f

    .line 74
    .line 75
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    const v17, 0x3f7d70a4    # 0.99f

    .line 79
    .line 80
    .line 81
    const v18, -0x40a147ae    # -0.87f

    .line 82
    .line 83
    .line 84
    const/high16 v13, 0x3f000000    # 0.5f

    .line 85
    .line 86
    const/4 v14, 0x0

    .line 87
    const v15, 0x3f6b851f    # 0.92f

    .line 88
    .line 89
    .line 90
    const v16, -0x413d70a4    # -0.38f

    .line 91
    .line 92
    .line 93
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 94
    .line 95
    .line 96
    const v17, 0x403851ec    # 2.88f

    .line 97
    .line 98
    .line 99
    const/high16 v18, -0x3ee00000    # -10.0f

    .line 100
    .line 101
    const v13, 0x3f266666    # 0.65f

    .line 102
    .line 103
    .line 104
    const v14, -0x3f63851f    # -4.89f

    .line 105
    .line 106
    .line 107
    const v15, 0x3ff9999a    # 1.95f

    .line 108
    .line 109
    .line 110
    const v16, -0x3eefd70a    # -9.01f

    .line 111
    .line 112
    .line 113
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 114
    .line 115
    .line 116
    const v17, 0x40370a3d    # 2.86f

    .line 117
    .line 118
    .line 119
    const v18, 0x411d1eb8    # 9.82f

    .line 120
    .line 121
    .line 122
    const v13, 0x3f68f5c3    # 0.91f

    .line 123
    .line 124
    .line 125
    const v14, 0x3f7ae148    # 0.98f

    .line 126
    .line 127
    .line 128
    const v15, 0x400c28f6    # 2.19f

    .line 129
    .line 130
    .line 131
    const v16, 0x40a051ec    # 5.01f

    .line 132
    .line 133
    .line 134
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 135
    .line 136
    .line 137
    const v17, 0x3f9851ec    # 1.19f

    .line 138
    .line 139
    .line 140
    const v18, 0x3f866666    # 1.05f

    .line 141
    .line 142
    .line 143
    const v13, 0x3da3d70a    # 0.08f

    .line 144
    .line 145
    .line 146
    const v14, 0x3f19999a    # 0.6f

    .line 147
    .line 148
    .line 149
    const v15, 0x3f170a3d    # 0.59f

    .line 150
    .line 151
    .line 152
    const v16, 0x3f866666    # 1.05f

    .line 153
    .line 154
    .line 155
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 156
    .line 157
    .line 158
    const v17, 0x3f947ae1    # 1.16f

    .line 159
    .line 160
    .line 161
    const v18, -0x409c28f6    # -0.89f

    .line 162
    .line 163
    .line 164
    const v13, 0x3f0a3d71    # 0.54f

    .line 165
    .line 166
    .line 167
    const/4 v14, 0x0

    .line 168
    const v15, 0x3f828f5c    # 1.02f

    .line 169
    .line 170
    .line 171
    const v16, -0x4147ae14    # -0.36f

    .line 172
    .line 173
    .line 174
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 175
    .line 176
    .line 177
    const/high16 v17, 0x41800000    # 16.0f

    .line 178
    .line 179
    const/high16 v18, 0x41700000    # 15.0f

    .line 180
    .line 181
    const v13, 0x415d47ae    # 13.83f

    .line 182
    .line 183
    .line 184
    const v14, 0x418dd70a    # 17.73f

    .line 185
    .line 186
    .line 187
    const v15, 0x4171c28f    # 15.11f

    .line 188
    .line 189
    .line 190
    const/high16 v16, 0x41700000    # 15.0f

    .line 191
    .line 192
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 193
    .line 194
    .line 195
    const v17, 0x4033d70a    # 2.81f

    .line 196
    .line 197
    .line 198
    const v18, 0x40a66666    # 5.2f

    .line 199
    .line 200
    .line 201
    const v13, 0x3f666666    # 0.9f

    .line 202
    .line 203
    .line 204
    const/4 v14, 0x0

    .line 205
    const v15, 0x400c28f6    # 2.19f

    .line 206
    .line 207
    .line 208
    const v16, 0x40351eb8    # 2.83f

    .line 209
    .line 210
    .line 211
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 212
    .line 213
    .line 214
    const v17, 0x3f866666    # 1.05f

    .line 215
    .line 216
    .line 217
    const v18, 0x3f4ccccd    # 0.8f

    .line 218
    .line 219
    .line 220
    const v13, 0x3df5c28f    # 0.12f

    .line 221
    .line 222
    .line 223
    const v14, 0x3ef5c28f    # 0.48f

    .line 224
    .line 225
    .line 226
    const v15, 0x3f0f5c29    # 0.56f

    .line 227
    .line 228
    .line 229
    const v16, 0x3f4ccccd    # 0.8f

    .line 230
    .line 231
    .line 232
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 233
    .line 234
    .line 235
    const v17, 0x3f8b851f    # 1.09f

    .line 236
    .line 237
    .line 238
    const v18, -0x406e147b    # -1.14f

    .line 239
    .line 240
    .line 241
    const v13, 0x3f1eb852    # 0.62f

    .line 242
    .line 243
    .line 244
    const/4 v14, 0x0

    .line 245
    const v15, 0x3f8f5c29    # 1.12f

    .line 246
    .line 247
    .line 248
    const v16, -0x40fae148    # -0.52f

    .line 249
    .line 250
    .line 251
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 252
    .line 253
    .line 254
    const/high16 v17, 0x41800000    # 16.0f

    .line 255
    .line 256
    const/high16 v18, 0x40400000    # 3.0f

    .line 257
    .line 258
    const/high16 v13, 0x41a60000    # 20.75f

    .line 259
    .line 260
    const v14, 0x417e3d71    # 15.89f

    .line 261
    .line 262
    .line 263
    const v15, 0x419e7ae1    # 19.81f

    .line 264
    .line 265
    .line 266
    const/high16 v16, 0x40400000    # 3.0f

    .line 267
    .line 268
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 269
    .line 270
    .line 271
    const v17, -0x3f733333    # -4.4f

    .line 272
    .line 273
    .line 274
    const v18, 0x41291eb8    # 10.57f

    .line 275
    .line 276
    .line 277
    const v13, -0x3fdf5c29    # -2.51f

    .line 278
    .line 279
    .line 280
    const/4 v14, 0x0

    .line 281
    const v15, -0x3f8eb852    # -3.77f

    .line 282
    .line 283
    .line 284
    const v16, 0x40b3851f    # 5.61f

    .line 285
    .line 286
    .line 287
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 288
    .line 289
    .line 290
    const/high16 v17, 0x41000000    # 8.0f

    .line 291
    .line 292
    const/high16 v18, 0x41000000    # 8.0f

    .line 293
    .line 294
    const v13, 0x412ca3d7    # 10.79f

    .line 295
    .line 296
    .line 297
    const v14, 0x412a8f5c    # 10.66f

    .line 298
    .line 299
    .line 300
    const v15, 0x4119c28f    # 9.61f

    .line 301
    .line 302
    .line 303
    const/high16 v16, 0x41000000    # 8.0f

    .line 304
    .line 305
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 306
    .line 307
    .line 308
    const v17, -0x3f64cccd    # -4.85f

    .line 309
    .line 310
    .line 311
    const v18, 0x413deb85    # 11.87f

    .line 312
    .line 313
    .line 314
    const v13, -0x3fc51eb8    # -2.92f

    .line 315
    .line 316
    .line 317
    const/4 v14, 0x0

    .line 318
    const v15, -0x3f72e148    # -4.41f

    .line 319
    .line 320
    .line 321
    const v16, 0x410b5c29    # 8.71f

    .line 322
    .line 323
    .line 324
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 325
    .line 326
    .line 327
    const v17, 0x408428f6    # 4.13f

    .line 328
    .line 329
    .line 330
    const/high16 v18, 0x41a80000    # 21.0f

    .line 331
    .line 332
    const v13, 0x4043d70a    # 3.06f

    .line 333
    .line 334
    .line 335
    const v14, 0x41a3c28f    # 20.47f

    .line 336
    .line 337
    .line 338
    const v15, 0x4061eb85    # 3.53f

    .line 339
    .line 340
    .line 341
    const/high16 v16, 0x41a80000    # 21.0f

    .line 342
    .line 343
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 344
    .line 345
    .line 346
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 347
    .line 348
    .line 349
    const/high16 v0, 0x41800000    # 16.0f

    .line 350
    .line 351
    const/high16 v2, 0x41500000    # 13.0f

    .line 352
    .line 353
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 354
    .line 355
    .line 356
    const/high16 v17, -0x3fe00000    # -2.5f

    .line 357
    .line 358
    const/high16 v18, 0x3fc00000    # 1.5f

    .line 359
    .line 360
    const v13, -0x40828f5c    # -0.99f

    .line 361
    .line 362
    .line 363
    const/4 v14, 0x0

    .line 364
    const v15, -0x40170a3d    # -1.82f

    .line 365
    .line 366
    .line 367
    const v16, 0x3f1eb852    # 0.62f

    .line 368
    .line 369
    .line 370
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 371
    .line 372
    .line 373
    const/high16 v17, 0x40200000    # 2.5f

    .line 374
    .line 375
    const v18, -0x3ee8f5c3    # -9.44f

    .line 376
    .line 377
    .line 378
    const v13, 0x3f11eb85    # 0.57f

    .line 379
    .line 380
    .line 381
    const v14, -0x3f675c29    # -4.77f

    .line 382
    .line 383
    .line 384
    const v15, 0x3fc51eb8    # 1.54f

    .line 385
    .line 386
    .line 387
    const v16, -0x3ef6147b    # -8.62f

    .line 388
    .line 389
    .line 390
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 391
    .line 392
    .line 393
    const v17, 0x401f5c29    # 2.49f

    .line 394
    .line 395
    .line 396
    const v18, 0x4116e148    # 9.43f

    .line 397
    .line 398
    .line 399
    const v13, 0x3f7851ec    # 0.97f

    .line 400
    .line 401
    .line 402
    const v14, 0x3f4f5c29    # 0.81f

    .line 403
    .line 404
    .line 405
    const v15, 0x3ff47ae1    # 1.91f

    .line 406
    .line 407
    .line 408
    const v16, 0x409570a4    # 4.67f

    .line 409
    .line 410
    .line 411
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 412
    .line 413
    .line 414
    const/high16 v17, 0x41800000    # 16.0f

    .line 415
    .line 416
    const/high16 v18, 0x41500000    # 13.0f

    .line 417
    .line 418
    const v13, 0x418e7ae1    # 17.81f

    .line 419
    .line 420
    .line 421
    const v14, 0x4159eb85    # 13.62f

    .line 422
    .line 423
    .line 424
    const v15, 0x4187d70a    # 16.98f

    .line 425
    .line 426
    .line 427
    const/high16 v16, 0x41500000    # 13.0f

    .line 428
    .line 429
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 430
    .line 431
    .line 432
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 433
    .line 434
    .line 435
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 436
    .line 437
    .line 438
    move-result-object v2

    .line 439
    const/16 v16, 0x3800

    .line 440
    .line 441
    const/16 v17, 0x0

    .line 442
    .line 443
    const/high16 v6, 0x3f800000    # 1.0f

    .line 444
    .line 445
    const/high16 v8, 0x3f800000    # 1.0f

    .line 446
    .line 447
    const/4 v7, 0x0

    .line 448
    const/high16 v9, 0x3f800000    # 1.0f

    .line 449
    .line 450
    const/high16 v12, 0x3f800000    # 1.0f

    .line 451
    .line 452
    const/4 v13, 0x0

    .line 453
    const/4 v14, 0x0

    .line 454
    const/4 v15, 0x0

    .line 455
    const-string v4, ""

    .line 456
    .line 457
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 458
    .line 459
    .line 460
    move-result-object v0

    .line 461
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 462
    .line 463
    .line 464
    move-result-object v0

    .line 465
    sput-object v0, Landroidx/compose/material/icons/rounded/WifiChannelKt;->_wifiChannel:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 466
    .line 467
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 468
    .line 469
    .line 470
    return-object v0
.end method
