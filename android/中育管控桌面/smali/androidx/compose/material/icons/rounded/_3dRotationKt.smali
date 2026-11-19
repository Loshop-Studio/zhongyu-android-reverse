.class public final Landroidx/compose/material/icons/rounded/_3dRotationKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "__3dRotation",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "_3dRotation",
        "Landroidx/compose/material/icons/Icons$Rounded;",
        "get_3dRotation",
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
        "SMAP\n_3dRotation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _3dRotation.kt\nandroidx/compose/material/icons/rounded/_3dRotationKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,132:1\n212#2,12:133\n233#2,18:146\n253#2:183\n174#3:145\n705#4,2:164\n717#4,2:166\n719#4,11:172\n72#5,4:168\n*S KotlinDebug\n*F\n+ 1 _3dRotation.kt\nandroidx/compose/material/icons/rounded/_3dRotationKt\n*L\n29#1:133,12\n30#1:146,18\n30#1:183\n29#1:145\n30#1:164,2\n30#1:166,2\n30#1:172,11\n30#1:168,4\n*E\n"
    }
.end annotation


# static fields
.field private static __3dRotation:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final get_3dRotation(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/_3dRotationKt;->__3dRotation:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded._3dRotation"

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
    const v0, 0x41068f5c    # 8.41f

    .line 71
    .line 72
    .line 73
    const v2, 0x416f5c29    # 14.96f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v17, -0x40fae148    # -0.52f

    .line 80
    .line 81
    .line 82
    const v18, -0x425c28f6    # -0.08f

    .line 83
    .line 84
    .line 85
    const v13, -0x41bd70a4    # -0.19f

    .line 86
    .line 87
    .line 88
    const/4 v14, 0x0

    .line 89
    const v15, -0x41428f5c    # -0.37f

    .line 90
    .line 91
    .line 92
    const v16, -0x430a3d71    # -0.03f

    .line 93
    .line 94
    .line 95
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 96
    .line 97
    .line 98
    const v17, -0x41333333    # -0.4f

    .line 99
    .line 100
    .line 101
    const v18, -0x418a3d71    # -0.24f

    .line 102
    .line 103
    .line 104
    const v13, -0x41dc28f6    # -0.16f

    .line 105
    .line 106
    .line 107
    const v14, -0x428a3d71    # -0.06f

    .line 108
    .line 109
    .line 110
    const v15, -0x416b851f    # -0.29f

    .line 111
    .line 112
    .line 113
    const v16, -0x41fae148    # -0.13f

    .line 114
    .line 115
    .line 116
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 117
    .line 118
    .line 119
    const v17, -0x417ae148    # -0.26f

    .line 120
    .line 121
    .line 122
    const v18, -0x41428f5c    # -0.37f

    .line 123
    .line 124
    .line 125
    const v13, -0x421eb852    # -0.11f

    .line 126
    .line 127
    .line 128
    const v14, -0x42333333    # -0.1f

    .line 129
    .line 130
    .line 131
    const v15, -0x41b33333    # -0.2f

    .line 132
    .line 133
    .line 134
    const v16, -0x419eb852    # -0.22f

    .line 135
    .line 136
    .line 137
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 138
    .line 139
    .line 140
    const v17, -0x4247ae14    # -0.09f

    .line 141
    .line 142
    .line 143
    const v18, -0x410f5c29    # -0.47f

    .line 144
    .line 145
    .line 146
    const v13, -0x428a3d71    # -0.06f

    .line 147
    .line 148
    .line 149
    const v14, -0x41f0a3d7    # -0.14f

    .line 150
    .line 151
    .line 152
    const v15, -0x4247ae14    # -0.09f

    .line 153
    .line 154
    .line 155
    const v16, -0x41666666    # -0.3f

    .line 156
    .line 157
    .line 158
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 159
    .line 160
    .line 161
    const v0, -0x4059999a    # -1.3f

    .line 162
    .line 163
    .line 164
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 165
    .line 166
    .line 167
    const v17, 0x3e570a3d    # 0.21f

    .line 168
    .line 169
    .line 170
    const v18, 0x3f733333    # 0.95f

    .line 171
    .line 172
    .line 173
    const/4 v13, 0x0

    .line 174
    const v14, 0x3eb851ec    # 0.36f

    .line 175
    .line 176
    .line 177
    const v15, 0x3d8f5c29    # 0.07f

    .line 178
    .line 179
    .line 180
    const v16, 0x3f2e147b    # 0.68f

    .line 181
    .line 182
    .line 183
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 184
    .line 185
    .line 186
    const v17, 0x3f0f5c29    # 0.56f

    .line 187
    .line 188
    .line 189
    const v18, 0x3f30a3d7    # 0.69f

    .line 190
    .line 191
    .line 192
    const v13, 0x3e0f5c29    # 0.14f

    .line 193
    .line 194
    .line 195
    const v14, 0x3e8a3d71    # 0.27f

    .line 196
    .line 197
    .line 198
    const v15, 0x3ea8f5c3    # 0.33f

    .line 199
    .line 200
    .line 201
    const/high16 v16, 0x3f000000    # 0.5f

    .line 202
    .line 203
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 204
    .line 205
    .line 206
    const v17, 0x3f51eb85    # 0.82f

    .line 207
    .line 208
    .line 209
    const v18, 0x3ed1eb85    # 0.41f

    .line 210
    .line 211
    .line 212
    const v13, 0x3e75c28f    # 0.24f

    .line 213
    .line 214
    .line 215
    const v14, 0x3e3851ec    # 0.18f

    .line 216
    .line 217
    .line 218
    const v15, 0x3f028f5c    # 0.51f

    .line 219
    .line 220
    .line 221
    const v16, 0x3ea3d70a    # 0.32f

    .line 222
    .line 223
    .line 224
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 225
    .line 226
    .line 227
    const v17, 0x3f75c28f    # 0.96f

    .line 228
    .line 229
    .line 230
    const v18, 0x3e19999a    # 0.15f

    .line 231
    .line 232
    .line 233
    const v13, 0x3e99999a    # 0.3f

    .line 234
    .line 235
    .line 236
    const v14, 0x3dcccccd    # 0.1f

    .line 237
    .line 238
    .line 239
    const v15, 0x3f1eb852    # 0.62f

    .line 240
    .line 241
    .line 242
    const v16, 0x3e19999a    # 0.15f

    .line 243
    .line 244
    .line 245
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 246
    .line 247
    .line 248
    const v17, 0x3f83d70a    # 1.03f

    .line 249
    .line 250
    .line 251
    const v18, -0x41e66666    # -0.15f

    .line 252
    .line 253
    .line 254
    const v13, 0x3ebd70a4    # 0.37f

    .line 255
    .line 256
    .line 257
    const/4 v14, 0x0

    .line 258
    const v15, 0x3f3851ec    # 0.72f

    .line 259
    .line 260
    .line 261
    const v16, -0x42b33333    # -0.05f

    .line 262
    .line 263
    .line 264
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 265
    .line 266
    .line 267
    const v17, 0x3f547ae1    # 0.83f

    .line 268
    .line 269
    .line 270
    const v18, -0x411eb852    # -0.44f

    .line 271
    .line 272
    .line 273
    const v13, 0x3ea3d70a    # 0.32f

    .line 274
    .line 275
    .line 276
    const v14, -0x42333333    # -0.1f

    .line 277
    .line 278
    .line 279
    const v15, 0x3f19999a    # 0.6f

    .line 280
    .line 281
    .line 282
    const/high16 v16, -0x41800000    # -0.25f

    .line 283
    .line 284
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 285
    .line 286
    .line 287
    const v0, 0x3f0ccccd    # 0.55f

    .line 288
    .line 289
    .line 290
    const v2, -0x40c7ae14    # -0.72f

    .line 291
    .line 292
    .line 293
    const v4, -0x4123d70a    # -0.43f

    .line 294
    .line 295
    .line 296
    const v6, 0x3ed70a3d    # 0.42f

    .line 297
    .line 298
    .line 299
    invoke-virtual {v12, v6, v4, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 300
    .line 301
    .line 302
    const v0, -0x40e3d70a    # -0.61f

    .line 303
    .line 304
    .line 305
    const v2, -0x4087ae14    # -0.97f

    .line 306
    .line 307
    .line 308
    const v4, 0x3e4ccccd    # 0.2f

    .line 309
    .line 310
    .line 311
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 312
    .line 313
    .line 314
    const v17, -0x4270a3d7    # -0.07f

    .line 315
    .line 316
    .line 317
    const v18, -0x40f0a3d7    # -0.56f

    .line 318
    .line 319
    .line 320
    const/4 v13, 0x0

    .line 321
    const v14, -0x41bd70a4    # -0.19f

    .line 322
    .line 323
    .line 324
    const v15, -0x435c28f6    # -0.02f

    .line 325
    .line 326
    .line 327
    const v16, -0x413d70a4    # -0.38f

    .line 328
    .line 329
    .line 330
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 331
    .line 332
    .line 333
    const v17, -0x41947ae1    # -0.23f

    .line 334
    .line 335
    .line 336
    const v18, -0x40fd70a4    # -0.51f

    .line 337
    .line 338
    .line 339
    const v13, -0x42b33333    # -0.05f

    .line 340
    .line 341
    .line 342
    const v14, -0x41c7ae14    # -0.18f

    .line 343
    .line 344
    .line 345
    const v15, -0x420a3d71    # -0.12f

    .line 346
    .line 347
    .line 348
    const v16, -0x414ccccd    # -0.35f

    .line 349
    .line 350
    .line 351
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 352
    .line 353
    .line 354
    const v17, -0x41333333    # -0.4f

    .line 355
    .line 356
    .line 357
    const v18, -0x4123d70a    # -0.43f

    .line 358
    .line 359
    .line 360
    const v13, -0x42333333    # -0.1f

    .line 361
    .line 362
    .line 363
    const v14, -0x41dc28f6    # -0.16f

    .line 364
    .line 365
    .line 366
    const v15, -0x418a3d71    # -0.24f

    .line 367
    .line 368
    .line 369
    const v16, -0x41666666    # -0.3f

    .line 370
    .line 371
    .line 372
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 373
    .line 374
    .line 375
    const v17, -0x40e3d70a    # -0.61f

    .line 376
    .line 377
    .line 378
    const v18, -0x416147ae    # -0.31f

    .line 379
    .line 380
    .line 381
    const v13, -0x41d1eb85    # -0.17f

    .line 382
    .line 383
    .line 384
    const v14, -0x41fae148    # -0.13f

    .line 385
    .line 386
    .line 387
    const v15, -0x41428f5c    # -0.37f

    .line 388
    .line 389
    .line 390
    const v16, -0x41947ae1    # -0.23f

    .line 391
    .line 392
    .line 393
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 394
    .line 395
    .line 396
    const v17, 0x3f051eb8    # 0.52f

    .line 397
    .line 398
    .line 399
    const v18, -0x41570a3d    # -0.33f

    .line 400
    .line 401
    .line 402
    const v13, 0x3e4ccccd    # 0.2f

    .line 403
    .line 404
    .line 405
    const v14, -0x4247ae14    # -0.09f

    .line 406
    .line 407
    .line 408
    const v15, 0x3ebd70a4    # 0.37f

    .line 409
    .line 410
    .line 411
    const v16, -0x41b33333    # -0.2f

    .line 412
    .line 413
    .line 414
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 415
    .line 416
    .line 417
    const v17, 0x3ebd70a4    # 0.37f

    .line 418
    .line 419
    .line 420
    const v18, -0x4128f5c3    # -0.42f

    .line 421
    .line 422
    .line 423
    const v13, 0x3e19999a    # 0.15f

    .line 424
    .line 425
    .line 426
    const v14, -0x41fae148    # -0.13f

    .line 427
    .line 428
    .line 429
    const v15, 0x3e8a3d71    # 0.27f

    .line 430
    .line 431
    .line 432
    const v16, -0x4175c28f    # -0.27f

    .line 433
    .line 434
    .line 435
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 436
    .line 437
    .line 438
    const v17, 0x3e6147ae    # 0.22f

    .line 439
    .line 440
    .line 441
    const v18, -0x41147ae1    # -0.46f

    .line 442
    .line 443
    .line 444
    const v13, 0x3dcccccd    # 0.1f

    .line 445
    .line 446
    .line 447
    const v14, -0x41e66666    # -0.15f

    .line 448
    .line 449
    .line 450
    const v15, 0x3e2e147b    # 0.17f

    .line 451
    .line 452
    .line 453
    const v16, -0x41666666    # -0.3f

    .line 454
    .line 455
    .line 456
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 457
    .line 458
    .line 459
    const v0, -0x415c28f6    # -0.32f

    .line 460
    .line 461
    .line 462
    const v2, -0x410a3d71    # -0.48f

    .line 463
    .line 464
    .line 465
    const v4, 0x3d8f5c29    # 0.07f

    .line 466
    .line 467
    .line 468
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 469
    .line 470
    .line 471
    const v17, -0x41c7ae14    # -0.18f

    .line 472
    .line 473
    .line 474
    const v18, -0x408a3d71    # -0.96f

    .line 475
    .line 476
    .line 477
    const/4 v13, 0x0

    .line 478
    const v14, -0x4147ae14    # -0.36f

    .line 479
    .line 480
    .line 481
    const v15, -0x428a3d71    # -0.06f

    .line 482
    .line 483
    .line 484
    const v16, -0x40d1eb85    # -0.68f

    .line 485
    .line 486
    .line 487
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 488
    .line 489
    .line 490
    const v0, -0x416b851f    # -0.29f

    .line 491
    .line 492
    .line 493
    const v2, -0x40cf5c29    # -0.69f

    .line 494
    .line 495
    .line 496
    const v4, -0x40fd70a4    # -0.51f

    .line 497
    .line 498
    .line 499
    invoke-virtual {v12, v0, v4, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 500
    .line 501
    .line 502
    const v17, -0x40bae148    # -0.77f

    .line 503
    .line 504
    .line 505
    const v18, -0x4123d70a    # -0.43f

    .line 506
    .line 507
    .line 508
    const v13, -0x41b33333    # -0.2f

    .line 509
    .line 510
    .line 511
    const v14, -0x41bd70a4    # -0.19f

    .line 512
    .line 513
    .line 514
    const v15, -0x410f5c29    # -0.47f

    .line 515
    .line 516
    .line 517
    const v16, -0x41570a3d    # -0.33f

    .line 518
    .line 519
    .line 520
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 521
    .line 522
    .line 523
    const v17, 0x41063d71    # 8.39f

    .line 524
    .line 525
    .line 526
    const/high16 v18, 0x41000000    # 8.0f

    .line 527
    .line 528
    const v13, 0x4111999a    # 9.1f

    .line 529
    .line 530
    .line 531
    const v14, 0x4100cccd    # 8.05f

    .line 532
    .line 533
    .line 534
    const v15, 0x410c28f6    # 8.76f

    .line 535
    .line 536
    .line 537
    const/high16 v16, 0x41000000    # 8.0f

    .line 538
    .line 539
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 540
    .line 541
    .line 542
    const/high16 v17, -0x40800000    # -1.0f

    .line 543
    .line 544
    const v18, 0x3e23d70a    # 0.16f

    .line 545
    .line 546
    .line 547
    const v13, -0x4147ae14    # -0.36f

    .line 548
    .line 549
    .line 550
    const/4 v14, 0x0

    .line 551
    const v15, -0x40cf5c29    # -0.69f

    .line 552
    .line 553
    .line 554
    const v16, 0x3d4ccccd    # 0.05f

    .line 555
    .line 556
    .line 557
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 558
    .line 559
    .line 560
    const v17, -0x40b5c28f    # -0.79f

    .line 561
    .line 562
    .line 563
    const v18, 0x3ee66666    # 0.45f

    .line 564
    .line 565
    .line 566
    const v13, -0x41666666    # -0.3f

    .line 567
    .line 568
    .line 569
    const v14, 0x3de147ae    # 0.11f

    .line 570
    .line 571
    .line 572
    const v15, -0x40ee147b    # -0.57f

    .line 573
    .line 574
    .line 575
    const v16, 0x3e851eb8    # 0.26f

    .line 576
    .line 577
    .line 578
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 579
    .line 580
    .line 581
    const v17, -0x40fd70a4    # -0.51f

    .line 582
    .line 583
    .line 584
    const v18, 0x3f2b851f    # 0.67f

    .line 585
    .line 586
    .line 587
    const v13, -0x41a8f5c3    # -0.21f

    .line 588
    .line 589
    .line 590
    const v14, 0x3e428f5c    # 0.19f

    .line 591
    .line 592
    .line 593
    const v15, -0x413d70a4    # -0.38f

    .line 594
    .line 595
    .line 596
    const v16, 0x3ed1eb85    # 0.41f

    .line 597
    .line 598
    .line 599
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 600
    .line 601
    .line 602
    const v17, -0x41c7ae14    # -0.18f

    .line 603
    .line 604
    .line 605
    const v18, 0x3f59999a    # 0.85f

    .line 606
    .line 607
    .line 608
    const v13, -0x420a3d71    # -0.12f

    .line 609
    .line 610
    .line 611
    const v14, 0x3e851eb8    # 0.26f

    .line 612
    .line 613
    .line 614
    const v15, -0x41c7ae14    # -0.18f

    .line 615
    .line 616
    .line 617
    const v16, 0x3f0a3d71    # 0.54f

    .line 618
    .line 619
    .line 620
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 621
    .line 622
    .line 623
    const v0, 0x3fa66666    # 1.3f

    .line 624
    .line 625
    .line 626
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 627
    .line 628
    .line 629
    const v17, 0x3db851ec    # 0.09f

    .line 630
    .line 631
    .line 632
    const v18, -0x4119999a    # -0.45f

    .line 633
    .line 634
    .line 635
    const/4 v13, 0x0

    .line 636
    const v14, -0x41d1eb85    # -0.17f

    .line 637
    .line 638
    .line 639
    const v15, 0x3cf5c28f    # 0.03f

    .line 640
    .line 641
    .line 642
    const v16, -0x415c28f6    # -0.32f

    .line 643
    .line 644
    .line 645
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 646
    .line 647
    .line 648
    const/high16 v0, 0x3e800000    # 0.25f

    .line 649
    .line 650
    const v2, -0x4151eb85    # -0.34f

    .line 651
    .line 652
    .line 653
    const/high16 v4, -0x41800000    # -0.25f

    .line 654
    .line 655
    const v6, 0x3e0f5c29    # 0.14f

    .line 656
    .line 657
    .line 658
    invoke-virtual {v12, v6, v4, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 659
    .line 660
    .line 661
    const v0, 0x3ec28f5c    # 0.38f

    .line 662
    .line 663
    .line 664
    const v2, -0x419eb852    # -0.22f

    .line 665
    .line 666
    .line 667
    const v4, 0x3e6b851f    # 0.23f

    .line 668
    .line 669
    .line 670
    const v6, -0x41d1eb85    # -0.17f

    .line 671
    .line 672
    .line 673
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 674
    .line 675
    .line 676
    const v0, 0x3e99999a    # 0.3f

    .line 677
    .line 678
    .line 679
    const v2, 0x3ef5c28f    # 0.48f

    .line 680
    .line 681
    .line 682
    const v4, -0x425c28f6    # -0.08f

    .line 683
    .line 684
    .line 685
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 686
    .line 687
    .line 688
    const v17, 0x3f63d70a    # 0.89f

    .line 689
    .line 690
    .line 691
    const v18, 0x3e9eb852    # 0.31f

    .line 692
    .line 693
    .line 694
    const v13, 0x3ecccccd    # 0.4f

    .line 695
    .line 696
    .line 697
    const/4 v14, 0x0

    .line 698
    const v15, 0x3f333333    # 0.7f

    .line 699
    .line 700
    .line 701
    const v16, 0x3dcccccd    # 0.1f

    .line 702
    .line 703
    .line 704
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 705
    .line 706
    .line 707
    const v17, 0x3e947ae1    # 0.29f

    .line 708
    .line 709
    .line 710
    const v18, 0x3f5c28f6    # 0.86f

    .line 711
    .line 712
    .line 713
    const v13, 0x3e428f5c    # 0.19f

    .line 714
    .line 715
    .line 716
    const v14, 0x3e4ccccd    # 0.2f

    .line 717
    .line 718
    .line 719
    const v15, 0x3e947ae1    # 0.29f

    .line 720
    .line 721
    .line 722
    const v16, 0x3efae148    # 0.49f

    .line 723
    .line 724
    .line 725
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 726
    .line 727
    .line 728
    const v17, -0x425c28f6    # -0.08f

    .line 729
    .line 730
    .line 731
    const v18, 0x3efae148    # 0.49f

    .line 732
    .line 733
    .line 734
    const/4 v13, 0x0

    .line 735
    const v14, 0x3e3851ec    # 0.18f

    .line 736
    .line 737
    .line 738
    const v15, -0x430a3d71    # -0.03f

    .line 739
    .line 740
    .line 741
    const v16, 0x3eae147b    # 0.34f

    .line 742
    .line 743
    .line 744
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 745
    .line 746
    .line 747
    const v0, 0x3e8a3d71    # 0.27f

    .line 748
    .line 749
    .line 750
    const v2, 0x3ebd70a4    # 0.37f

    .line 751
    .line 752
    .line 753
    const/high16 v4, -0x41800000    # -0.25f

    .line 754
    .line 755
    const v6, -0x41f0a3d7    # -0.14f

    .line 756
    .line 757
    .line 758
    invoke-virtual {v12, v6, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 759
    .line 760
    .line 761
    const v17, -0x412e147b    # -0.41f

    .line 762
    .line 763
    .line 764
    const v18, 0x3e75c28f    # 0.24f

    .line 765
    .line 766
    .line 767
    const v13, -0x421eb852    # -0.11f

    .line 768
    .line 769
    .line 770
    const v14, 0x3dcccccd    # 0.1f

    .line 771
    .line 772
    .line 773
    const/high16 v15, -0x41800000    # -0.25f

    .line 774
    .line 775
    const v16, 0x3e3851ec    # 0.18f

    .line 776
    .line 777
    .line 778
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 779
    .line 780
    .line 781
    const v17, -0x40eb851f    # -0.58f

    .line 782
    .line 783
    .line 784
    const v18, 0x3db851ec    # 0.09f

    .line 785
    .line 786
    .line 787
    const v13, -0x41dc28f6    # -0.16f

    .line 788
    .line 789
    .line 790
    const v14, 0x3d75c28f    # 0.06f

    .line 791
    .line 792
    .line 793
    const v15, -0x4147ae14    # -0.36f

    .line 794
    .line 795
    .line 796
    const v16, 0x3db851ec    # 0.09f

    .line 797
    .line 798
    .line 799
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 800
    .line 801
    .line 802
    const/high16 v0, 0x40f00000    # 7.5f

    .line 803
    .line 804
    const v2, 0x41366666    # 11.4f

    .line 805
    .line 806
    .line 807
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 808
    .line 809
    .line 810
    const v0, 0x3f83d70a    # 1.03f

    .line 811
    .line 812
    .line 813
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 814
    .line 815
    .line 816
    const v0, 0x3f451eb8    # 0.77f

    .line 817
    .line 818
    .line 819
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 820
    .line 821
    .line 822
    const v17, 0x3f19999a    # 0.6f

    .line 823
    .line 824
    .line 825
    const v18, 0x3d8f5c29    # 0.07f

    .line 826
    .line 827
    .line 828
    const v13, 0x3e6147ae    # 0.22f

    .line 829
    .line 830
    .line 831
    const/4 v14, 0x0

    .line 832
    const v15, 0x3ed70a3d    # 0.42f

    .line 833
    .line 834
    .line 835
    const v16, 0x3ca3d70a    # 0.02f

    .line 836
    .line 837
    .line 838
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 839
    .line 840
    .line 841
    const v0, 0x3e051eb8    # 0.13f

    .line 842
    .line 843
    .line 844
    const v2, 0x3ee66666    # 0.45f

    .line 845
    .line 846
    .line 847
    const v4, 0x3e6b851f    # 0.23f

    .line 848
    .line 849
    .line 850
    const v6, 0x3ea8f5c3    # 0.33f

    .line 851
    .line 852
    .line 853
    invoke-virtual {v12, v6, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 854
    .line 855
    .line 856
    const v17, 0x3e947ae1    # 0.29f

    .line 857
    .line 858
    .line 859
    const v18, 0x3ecccccd    # 0.4f

    .line 860
    .line 861
    .line 862
    const v13, 0x3df5c28f    # 0.12f

    .line 863
    .line 864
    .line 865
    const v14, 0x3de147ae    # 0.11f

    .line 866
    .line 867
    .line 868
    const v15, 0x3e6147ae    # 0.22f

    .line 869
    .line 870
    .line 871
    const v16, 0x3e75c28f    # 0.24f

    .line 872
    .line 873
    .line 874
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 875
    .line 876
    .line 877
    const v0, 0x3eb33333    # 0.35f

    .line 878
    .line 879
    .line 880
    const v2, 0x3f11eb85    # 0.57f

    .line 881
    .line 882
    .line 883
    const v4, 0x3dcccccd    # 0.1f

    .line 884
    .line 885
    .line 886
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 887
    .line 888
    .line 889
    const v17, -0x414ccccd    # -0.35f

    .line 890
    .line 891
    .line 892
    const v18, 0x3f6e147b    # 0.93f

    .line 893
    .line 894
    .line 895
    const/4 v13, 0x0

    .line 896
    const v14, 0x3ed1eb85    # 0.41f

    .line 897
    .line 898
    .line 899
    const v15, -0x420a3d71    # -0.12f

    .line 900
    .line 901
    .line 902
    const v16, 0x3f3851ec    # 0.72f

    .line 903
    .line 904
    .line 905
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 906
    .line 907
    .line 908
    const v17, -0x408ccccd    # -0.95f

    .line 909
    .line 910
    .line 911
    const v18, 0x3ea8f5c3    # 0.33f

    .line 912
    .line 913
    .line 914
    const v13, -0x41947ae1    # -0.23f

    .line 915
    .line 916
    .line 917
    const v14, 0x3e6b851f    # 0.23f

    .line 918
    .line 919
    .line 920
    const v15, -0x40f33333    # -0.55f

    .line 921
    .line 922
    .line 923
    const v16, 0x3ea8f5c3    # 0.33f

    .line 924
    .line 925
    .line 926
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 927
    .line 928
    .line 929
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 930
    .line 931
    .line 932
    const v0, 0x418dae14    # 17.71f

    .line 933
    .line 934
    .line 935
    const v2, 0x4123d70a    # 10.24f

    .line 936
    .line 937
    .line 938
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 939
    .line 940
    .line 941
    const/high16 v17, -0x40c00000    # -0.75f

    .line 942
    .line 943
    const v18, -0x40666666    # -1.2f

    .line 944
    .line 945
    .line 946
    const v13, -0x41c7ae14    # -0.18f

    .line 947
    .line 948
    .line 949
    const v14, -0x410f5c29    # -0.47f

    .line 950
    .line 951
    .line 952
    const v15, -0x4123d70a    # -0.43f

    .line 953
    .line 954
    .line 955
    const v16, -0x40a147ae    # -0.87f

    .line 956
    .line 957
    .line 958
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 959
    .line 960
    .line 961
    const v17, -0x406e147b    # -1.14f

    .line 962
    .line 963
    .line 964
    const v18, -0x40bae148    # -0.77f

    .line 965
    .line 966
    .line 967
    const v13, -0x415c28f6    # -0.32f

    .line 968
    .line 969
    .line 970
    const v14, -0x41570a3d    # -0.33f

    .line 971
    .line 972
    .line 973
    const v15, -0x40cccccd    # -0.7f

    .line 974
    .line 975
    .line 976
    const v16, -0x40e8f5c3    # -0.59f

    .line 977
    .line 978
    .line 979
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 980
    .line 981
    .line 982
    const v17, -0x40451eb8    # -1.46f

    .line 983
    .line 984
    .line 985
    const v18, -0x4175c28f    # -0.27f

    .line 986
    .line 987
    .line 988
    const v13, -0x4123d70a    # -0.43f

    .line 989
    .line 990
    .line 991
    const v14, -0x41c7ae14    # -0.18f

    .line 992
    .line 993
    .line 994
    const v15, -0x40947ae1    # -0.92f

    .line 995
    .line 996
    .line 997
    const v16, -0x4175c28f    # -0.27f

    .line 998
    .line 999
    .line 1000
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1001
    .line 1002
    .line 1003
    const/high16 v0, 0x41400000    # 12.0f

    .line 1004
    .line 1005
    const/high16 v2, 0x41000000    # 8.0f

    .line 1006
    .line 1007
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1008
    .line 1009
    .line 1010
    const/high16 v0, 0x41000000    # 8.0f

    .line 1011
    .line 1012
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1013
    .line 1014
    .line 1015
    const v0, 0x40133333    # 2.3f

    .line 1016
    .line 1017
    .line 1018
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1019
    .line 1020
    .line 1021
    const v17, 0x3fc147ae    # 1.51f

    .line 1022
    .line 1023
    .line 1024
    const v13, 0x3f0ccccd    # 0.55f

    .line 1025
    .line 1026
    .line 1027
    const/4 v14, 0x0

    .line 1028
    const v15, 0x3f87ae14    # 1.06f

    .line 1029
    .line 1030
    .line 1031
    const v16, -0x4247ae14    # -0.09f

    .line 1032
    .line 1033
    .line 1034
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1035
    .line 1036
    .line 1037
    const v0, 0x3f947ae1    # 1.16f

    .line 1038
    .line 1039
    .line 1040
    const v2, -0x40bd70a4    # -0.76f

    .line 1041
    .line 1042
    .line 1043
    const v4, -0x4123d70a    # -0.43f

    .line 1044
    .line 1045
    .line 1046
    const v6, 0x3f570a3d    # 0.84f

    .line 1047
    .line 1048
    .line 1049
    invoke-virtual {v12, v6, v4, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1050
    .line 1051
    .line 1052
    const v17, 0x3f3d70a4    # 0.74f

    .line 1053
    .line 1054
    .line 1055
    const v18, -0x4067ae14    # -1.19f

    .line 1056
    .line 1057
    .line 1058
    const v13, 0x3ea3d70a    # 0.32f

    .line 1059
    .line 1060
    .line 1061
    const v14, -0x41570a3d    # -0.33f

    .line 1062
    .line 1063
    .line 1064
    const v15, 0x3f11eb85    # 0.57f

    .line 1065
    .line 1066
    .line 1067
    const v16, -0x40c51eb8    # -0.73f

    .line 1068
    .line 1069
    .line 1070
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1071
    .line 1072
    .line 1073
    const v17, 0x3e851eb8    # 0.26f

    .line 1074
    .line 1075
    .line 1076
    const v18, -0x40370a3d    # -1.57f

    .line 1077
    .line 1078
    .line 1079
    const v13, 0x3e2e147b    # 0.17f

    .line 1080
    .line 1081
    .line 1082
    const v14, -0x410f5c29    # -0.47f

    .line 1083
    .line 1084
    .line 1085
    const v15, 0x3e851eb8    # 0.26f

    .line 1086
    .line 1087
    .line 1088
    const v16, -0x40828f5c    # -0.99f

    .line 1089
    .line 1090
    .line 1091
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1092
    .line 1093
    .line 1094
    const v0, -0x41333333    # -0.4f

    .line 1095
    .line 1096
    .line 1097
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1098
    .line 1099
    .line 1100
    const v17, -0x417ae148    # -0.26f

    .line 1101
    .line 1102
    .line 1103
    const/4 v13, 0x0

    .line 1104
    const v14, -0x40eb851f    # -0.58f

    .line 1105
    .line 1106
    .line 1107
    const v15, -0x4247ae14    # -0.09f

    .line 1108
    .line 1109
    .line 1110
    const v16, -0x40733333    # -1.1f

    .line 1111
    .line 1112
    .line 1113
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1114
    .line 1115
    .line 1116
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1117
    .line 1118
    .line 1119
    const v0, 0x4184a3d7    # 16.58f

    .line 1120
    .line 1121
    .line 1122
    const v2, 0x41433333    # 12.2f

    .line 1123
    .line 1124
    .line 1125
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1126
    .line 1127
    .line 1128
    const v17, -0x41f0a3d7    # -0.14f

    .line 1129
    .line 1130
    .line 1131
    const v18, 0x3f90a3d7    # 1.13f

    .line 1132
    .line 1133
    .line 1134
    const v14, 0x3ed70a3d    # 0.42f

    .line 1135
    .line 1136
    .line 1137
    const v15, -0x42b33333    # -0.05f

    .line 1138
    .line 1139
    .line 1140
    const v16, 0x3f4a3d71    # 0.79f

    .line 1141
    .line 1142
    .line 1143
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1144
    .line 1145
    .line 1146
    const v17, -0x4123d70a    # -0.43f

    .line 1147
    .line 1148
    .line 1149
    const v18, 0x3f59999a    # 0.85f

    .line 1150
    .line 1151
    .line 1152
    const v13, -0x42333333    # -0.1f

    .line 1153
    .line 1154
    .line 1155
    const v14, 0x3ea8f5c3    # 0.33f

    .line 1156
    .line 1157
    .line 1158
    const v15, -0x418a3d71    # -0.24f

    .line 1159
    .line 1160
    .line 1161
    const v16, 0x3f1eb852    # 0.62f

    .line 1162
    .line 1163
    .line 1164
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1165
    .line 1166
    .line 1167
    const v0, -0x40ca3d71    # -0.71f

    .line 1168
    .line 1169
    .line 1170
    const v2, 0x3f07ae14    # 0.53f

    .line 1171
    .line 1172
    .line 1173
    const v4, 0x3ed1eb85    # 0.41f

    .line 1174
    .line 1175
    .line 1176
    const v6, -0x4123d70a    # -0.43f

    .line 1177
    .line 1178
    .line 1179
    invoke-virtual {v12, v6, v4, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1180
    .line 1181
    .line 1182
    const v17, -0x40828f5c    # -0.99f

    .line 1183
    .line 1184
    .line 1185
    const v18, 0x3e3851ec    # 0.18f

    .line 1186
    .line 1187
    .line 1188
    const v13, -0x416b851f    # -0.29f

    .line 1189
    .line 1190
    .line 1191
    const v14, 0x3df5c28f    # 0.12f

    .line 1192
    .line 1193
    .line 1194
    const v15, -0x40e147ae    # -0.62f

    .line 1195
    .line 1196
    .line 1197
    const v16, 0x3e3851ec    # 0.18f

    .line 1198
    .line 1199
    .line 1200
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1201
    .line 1202
    .line 1203
    const v0, -0x40970a3d    # -0.91f

    .line 1204
    .line 1205
    .line 1206
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1207
    .line 1208
    .line 1209
    const v0, 0x41566666    # 13.4f

    .line 1210
    .line 1211
    .line 1212
    const v2, 0x4111c28f    # 9.11f

    .line 1213
    .line 1214
    .line 1215
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1216
    .line 1217
    .line 1218
    const v0, 0x3f7851ec    # 0.97f

    .line 1219
    .line 1220
    .line 1221
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1222
    .line 1223
    .line 1224
    const v17, 0x3fd1eb85    # 1.64f

    .line 1225
    .line 1226
    .line 1227
    const v18, 0x3f30a3d7    # 0.69f

    .line 1228
    .line 1229
    .line 1230
    const v13, 0x3f3851ec    # 0.72f

    .line 1231
    .line 1232
    .line 1233
    const/4 v14, 0x0

    .line 1234
    const v15, 0x3fa28f5c    # 1.27f

    .line 1235
    .line 1236
    .line 1237
    const v16, 0x3e6b851f    # 0.23f

    .line 1238
    .line 1239
    .line 1240
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1241
    .line 1242
    .line 1243
    const v17, 0x3f11eb85    # 0.57f

    .line 1244
    .line 1245
    .line 1246
    const v18, 0x3ffeb852    # 1.99f

    .line 1247
    .line 1248
    .line 1249
    const v13, 0x3ec28f5c    # 0.38f

    .line 1250
    .line 1251
    .line 1252
    const v14, 0x3eeb851f    # 0.46f

    .line 1253
    .line 1254
    .line 1255
    const v15, 0x3f11eb85    # 0.57f

    .line 1256
    .line 1257
    .line 1258
    const v16, 0x3f8f5c29    # 1.12f

    .line 1259
    .line 1260
    .line 1261
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1262
    .line 1263
    .line 1264
    const v0, 0x3ed1eb85    # 0.41f

    .line 1265
    .line 1266
    .line 1267
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1268
    .line 1269
    .line 1270
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1271
    .line 1272
    .line 1273
    const v0, 0x41726666    # 15.15f

    .line 1274
    .line 1275
    .line 1276
    const v2, 0x4075c28f    # 3.84f

    .line 1277
    .line 1278
    .line 1279
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1280
    .line 1281
    .line 1282
    const v0, -0x4055c28f    # -1.33f

    .line 1283
    .line 1284
    .line 1285
    const v2, 0x3faa3d71    # 1.33f

    .line 1286
    .line 1287
    .line 1288
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1289
    .line 1290
    .line 1291
    const v17, 0x40bc7ae1    # 5.89f

    .line 1292
    .line 1293
    .line 1294
    const v18, 0x40fb851f    # 7.86f

    .line 1295
    .line 1296
    .line 1297
    const v13, 0x4045c28f    # 3.09f

    .line 1298
    .line 1299
    .line 1300
    const v14, 0x3fbae148    # 1.46f

    .line 1301
    .line 1302
    .line 1303
    const v15, 0x40aae148    # 5.34f

    .line 1304
    .line 1305
    .line 1306
    const v16, 0x408bd70a    # 4.37f

    .line 1307
    .line 1308
    .line 1309
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1310
    .line 1311
    .line 1312
    const v17, 0x3f5c28f6    # 0.86f

    .line 1313
    .line 1314
    .line 1315
    const v18, 0x3f1eb852    # 0.62f

    .line 1316
    .line 1317
    .line 1318
    const v13, 0x3d75c28f    # 0.06f

    .line 1319
    .line 1320
    .line 1321
    const v14, 0x3ed1eb85    # 0.41f

    .line 1322
    .line 1323
    .line 1324
    const v15, 0x3ee147ae    # 0.44f

    .line 1325
    .line 1326
    .line 1327
    const v16, 0x3f30a3d7    # 0.69f

    .line 1328
    .line 1329
    .line 1330
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1331
    .line 1332
    .line 1333
    const v17, 0x3f1eb852    # 0.62f

    .line 1334
    .line 1335
    .line 1336
    const v18, -0x40a3d70a    # -0.86f

    .line 1337
    .line 1338
    .line 1339
    const v13, 0x3ed1eb85    # 0.41f

    .line 1340
    .line 1341
    .line 1342
    const v14, -0x428a3d71    # -0.06f

    .line 1343
    .line 1344
    .line 1345
    const v15, 0x3f30a3d7    # 0.69f

    .line 1346
    .line 1347
    .line 1348
    const v16, -0x4119999a    # -0.45f

    .line 1349
    .line 1350
    .line 1351
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1352
    .line 1353
    .line 1354
    const v17, -0x3f3851ec    # -6.24f

    .line 1355
    .line 1356
    .line 1357
    const/high16 v18, -0x3ef40000    # -8.75f

    .line 1358
    .line 1359
    const v13, -0x40e66666    # -0.6f

    .line 1360
    .line 1361
    .line 1362
    const v14, -0x3f8c28f6    # -3.81f

    .line 1363
    .line 1364
    .line 1365
    const v15, -0x3fc28f5c    # -2.96f

    .line 1366
    .line 1367
    .line 1368
    const v16, -0x3f1fae14    # -7.01f

    .line 1369
    .line 1370
    .line 1371
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1372
    .line 1373
    .line 1374
    const v17, 0x413570a4    # 11.34f

    .line 1375
    .line 1376
    .line 1377
    const v18, 0x3ca3d70a    # 0.02f

    .line 1378
    .line 1379
    .line 1380
    const v13, 0x417f0a3d    # 15.94f

    .line 1381
    .line 1382
    .line 1383
    const v14, 0x3efae148    # 0.49f

    .line 1384
    .line 1385
    .line 1386
    const v15, 0x415c7ae1    # 13.78f

    .line 1387
    .line 1388
    .line 1389
    const v16, -0x41fae148    # -0.13f

    .line 1390
    .line 1391
    .line 1392
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1393
    .line 1394
    .line 1395
    const v0, 0x4073d70a    # 3.81f

    .line 1396
    .line 1397
    .line 1398
    const v2, 0x40747ae1    # 3.82f

    .line 1399
    .line 1400
    .line 1401
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1402
    .line 1403
    .line 1404
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1405
    .line 1406
    .line 1407
    const v0, 0x410d999a    # 8.85f

    .line 1408
    .line 1409
    .line 1410
    const v2, 0x41a13333    # 20.15f

    .line 1411
    .line 1412
    .line 1413
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1414
    .line 1415
    .line 1416
    const v0, -0x4055c28f    # -1.33f

    .line 1417
    .line 1418
    .line 1419
    const v2, 0x3faa3d71    # 1.33f

    .line 1420
    .line 1421
    .line 1422
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1423
    .line 1424
    .line 1425
    const v17, -0x3f43851f    # -5.89f

    .line 1426
    .line 1427
    .line 1428
    const v18, -0x3f047ae1    # -7.86f

    .line 1429
    .line 1430
    .line 1431
    const v13, -0x3fba3d71    # -3.09f

    .line 1432
    .line 1433
    .line 1434
    const v14, -0x40451eb8    # -1.46f

    .line 1435
    .line 1436
    .line 1437
    const v15, -0x3f551eb8    # -5.34f

    .line 1438
    .line 1439
    .line 1440
    const v16, -0x3f7428f6    # -4.37f

    .line 1441
    .line 1442
    .line 1443
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1444
    .line 1445
    .line 1446
    const v17, -0x40a3d70a    # -0.86f

    .line 1447
    .line 1448
    .line 1449
    const v18, -0x40e147ae    # -0.62f

    .line 1450
    .line 1451
    .line 1452
    const v13, -0x428a3d71    # -0.06f

    .line 1453
    .line 1454
    .line 1455
    const v14, -0x412e147b    # -0.41f

    .line 1456
    .line 1457
    .line 1458
    const v15, -0x411eb852    # -0.44f

    .line 1459
    .line 1460
    .line 1461
    const v16, -0x40cf5c29    # -0.69f

    .line 1462
    .line 1463
    .line 1464
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1465
    .line 1466
    .line 1467
    const v17, -0x40e147ae    # -0.62f

    .line 1468
    .line 1469
    .line 1470
    const v18, 0x3f5c28f6    # 0.86f

    .line 1471
    .line 1472
    .line 1473
    const v13, -0x412e147b    # -0.41f

    .line 1474
    .line 1475
    .line 1476
    const v14, 0x3d75c28f    # 0.06f

    .line 1477
    .line 1478
    .line 1479
    const v15, -0x40cf5c29    # -0.69f

    .line 1480
    .line 1481
    .line 1482
    const v16, 0x3ee66666    # 0.45f

    .line 1483
    .line 1484
    .line 1485
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1486
    .line 1487
    .line 1488
    const v17, 0x40c7ae14    # 6.24f

    .line 1489
    .line 1490
    .line 1491
    const/high16 v18, 0x410c0000    # 8.75f

    .line 1492
    .line 1493
    const v13, 0x3f19999a    # 0.6f

    .line 1494
    .line 1495
    .line 1496
    const v14, 0x4073d70a    # 3.81f

    .line 1497
    .line 1498
    .line 1499
    const v15, 0x403d70a4    # 2.96f

    .line 1500
    .line 1501
    .line 1502
    const v16, 0x40e051ec    # 7.01f

    .line 1503
    .line 1504
    .line 1505
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1506
    .line 1507
    .line 1508
    const v17, 0x40c8a3d7    # 6.27f

    .line 1509
    .line 1510
    .line 1511
    const v18, 0x3fae147b    # 1.36f

    .line 1512
    .line 1513
    .line 1514
    const v13, 0x3fd5c28f    # 1.67f

    .line 1515
    .line 1516
    .line 1517
    const v14, 0x3f63d70a    # 0.89f

    .line 1518
    .line 1519
    .line 1520
    const v15, 0x40751eb8    # 3.83f

    .line 1521
    .line 1522
    .line 1523
    const v16, 0x3fc147ae    # 1.51f

    .line 1524
    .line 1525
    .line 1526
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1527
    .line 1528
    .line 1529
    const v0, -0x3f8c28f6    # -3.81f

    .line 1530
    .line 1531
    .line 1532
    const v2, -0x3f8b851f    # -3.82f

    .line 1533
    .line 1534
    .line 1535
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1536
    .line 1537
    .line 1538
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1539
    .line 1540
    .line 1541
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 1542
    .line 1543
    .line 1544
    move-result-object v2

    .line 1545
    const/16 v16, 0x3800

    .line 1546
    .line 1547
    const/16 v17, 0x0

    .line 1548
    .line 1549
    const/high16 v6, 0x3f800000    # 1.0f

    .line 1550
    .line 1551
    const/high16 v8, 0x3f800000    # 1.0f

    .line 1552
    .line 1553
    const/4 v7, 0x0

    .line 1554
    const/high16 v9, 0x3f800000    # 1.0f

    .line 1555
    .line 1556
    const/high16 v12, 0x3f800000    # 1.0f

    .line 1557
    .line 1558
    const/4 v13, 0x0

    .line 1559
    const/4 v14, 0x0

    .line 1560
    const/4 v15, 0x0

    .line 1561
    const-string v4, ""

    .line 1562
    .line 1563
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 1564
    .line 1565
    .line 1566
    move-result-object v0

    .line 1567
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1568
    .line 1569
    .line 1570
    move-result-object v0

    .line 1571
    sput-object v0, Landroidx/compose/material/icons/rounded/_3dRotationKt;->__3dRotation:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1572
    .line 1573
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 1574
    .line 1575
    .line 1576
    return-object v0
.end method
