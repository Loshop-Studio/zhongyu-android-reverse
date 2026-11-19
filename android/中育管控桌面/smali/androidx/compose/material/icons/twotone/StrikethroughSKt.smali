.class public final Landroidx/compose/material/icons/twotone/StrikethroughSKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_strikethroughS",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "StrikethroughS",
        "Landroidx/compose/material/icons/Icons$TwoTone;",
        "getStrikethroughS",
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
        "SMAP\nStrikethroughS.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StrikethroughS.kt\nandroidx/compose/material/icons/twotone/StrikethroughSKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,93:1\n212#2,12:94\n233#2,18:107\n253#2:144\n174#3:106\n705#4,2:125\n717#4,2:127\n719#4,11:133\n72#5,4:129\n*S KotlinDebug\n*F\n+ 1 StrikethroughS.kt\nandroidx/compose/material/icons/twotone/StrikethroughSKt\n*L\n29#1:94,12\n30#1:107,18\n30#1:144\n29#1:106\n30#1:125,2\n30#1:127,2\n30#1:133,11\n30#1:129,4\n*E\n"
    }
.end annotation


# static fields
.field private static _strikethroughS:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getStrikethroughS(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/StrikethroughSKt;->_strikethroughS:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.StrikethroughS"

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
    const v0, 0x41270a3d    # 10.44f

    .line 71
    .line 72
    .line 73
    const v2, 0x40bc28f6    # 5.88f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v17, 0x3f3851ec    # 0.72f

    .line 80
    .line 81
    .line 82
    const v18, -0x4147ae14    # -0.36f

    .line 83
    .line 84
    .line 85
    const v13, 0x3e428f5c    # 0.19f

    .line 86
    .line 87
    .line 88
    const v14, -0x41e66666    # -0.15f

    .line 89
    .line 90
    .line 91
    const v15, 0x3edc28f6    # 0.43f

    .line 92
    .line 93
    .line 94
    const v16, -0x4175c28f    # -0.27f

    .line 95
    .line 96
    .line 97
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 98
    .line 99
    .line 100
    const v17, 0x3f83d70a    # 1.03f

    .line 101
    .line 102
    .line 103
    const v18, -0x41fae148    # -0.13f

    .line 104
    .line 105
    .line 106
    const v13, 0x3e947ae1    # 0.29f

    .line 107
    .line 108
    .line 109
    const v14, -0x4247ae14    # -0.09f

    .line 110
    .line 111
    .line 112
    const v15, 0x3f23d70a    # 0.64f

    .line 113
    .line 114
    .line 115
    const v16, -0x41fae148    # -0.13f

    .line 116
    .line 117
    .line 118
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 119
    .line 120
    .line 121
    const v17, 0x3f87ae14    # 1.06f

    .line 122
    .line 123
    .line 124
    const v18, 0x3e23d70a    # 0.16f

    .line 125
    .line 126
    .line 127
    const v13, 0x3ecccccd    # 0.4f

    .line 128
    .line 129
    .line 130
    const/4 v14, 0x0

    .line 131
    const v15, 0x3f428f5c    # 0.76f

    .line 132
    .line 133
    .line 134
    const v16, 0x3d75c28f    # 0.06f

    .line 135
    .line 136
    .line 137
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 138
    .line 139
    .line 140
    const/high16 v17, 0x3f400000    # 0.75f

    .line 141
    .line 142
    const v18, 0x3ee147ae    # 0.44f

    .line 143
    .line 144
    .line 145
    const v13, 0x3e99999a    # 0.3f

    .line 146
    .line 147
    .line 148
    const v14, 0x3de147ae    # 0.11f

    .line 149
    .line 150
    .line 151
    const v15, 0x3f0ccccd    # 0.55f

    .line 152
    .line 153
    .line 154
    const/high16 v16, 0x3e800000    # 0.25f

    .line 155
    .line 156
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 157
    .line 158
    .line 159
    const v0, 0x3ed1eb85    # 0.41f

    .line 160
    .line 161
    .line 162
    const v2, 0x3f2e147b    # 0.68f

    .line 163
    .line 164
    .line 165
    const v4, 0x3ee147ae    # 0.44f

    .line 166
    .line 167
    .line 168
    const v6, 0x3eb33333    # 0.35f

    .line 169
    .line 170
    .line 171
    invoke-virtual {v12, v6, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 172
    .line 173
    .line 174
    const v17, 0x3e19999a    # 0.15f

    .line 175
    .line 176
    .line 177
    const v18, 0x3f59999a    # 0.85f

    .line 178
    .line 179
    .line 180
    const v13, 0x3dcccccd    # 0.1f

    .line 181
    .line 182
    .line 183
    const v14, 0x3e851eb8    # 0.26f

    .line 184
    .line 185
    .line 186
    const v15, 0x3e19999a    # 0.15f

    .line 187
    .line 188
    .line 189
    const v16, 0x3f0a3d71    # 0.54f

    .line 190
    .line 191
    .line 192
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 193
    .line 194
    .line 195
    const v0, 0x4040a3d7    # 3.01f

    .line 196
    .line 197
    .line 198
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 199
    .line 200
    .line 201
    const v17, -0x413d70a4    # -0.38f

    .line 202
    .line 203
    .line 204
    const v18, -0x401851ec    # -1.81f

    .line 205
    .line 206
    .line 207
    const/4 v13, 0x0

    .line 208
    const v14, -0x40d70a3d    # -0.66f

    .line 209
    .line 210
    .line 211
    const v15, -0x41fae148    # -0.13f

    .line 212
    .line 213
    .line 214
    const v16, -0x405eb852    # -1.26f

    .line 215
    .line 216
    .line 217
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 218
    .line 219
    .line 220
    const v0, -0x4075c28f    # -1.08f

    .line 221
    .line 222
    .line 223
    const v2, -0x4048f5c3    # -1.43f

    .line 224
    .line 225
    .line 226
    const v4, -0x40e3d70a    # -0.61f

    .line 227
    .line 228
    .line 229
    const v6, -0x407c28f6    # -1.03f

    .line 230
    .line 231
    .line 232
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 233
    .line 234
    .line 235
    const v17, -0x4027ae14    # -1.69f

    .line 236
    .line 237
    .line 238
    const v18, -0x408f5c29    # -0.94f

    .line 239
    .line 240
    .line 241
    const v13, -0x41147ae1    # -0.46f

    .line 242
    .line 243
    .line 244
    const v14, -0x41333333    # -0.4f

    .line 245
    .line 246
    .line 247
    const v15, -0x407c28f6    # -1.03f

    .line 248
    .line 249
    .line 250
    const v16, -0x40c7ae14    # -0.72f

    .line 251
    .line 252
    .line 253
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 254
    .line 255
    .line 256
    const v17, -0x3ff28f5c    # -2.21f

    .line 257
    .line 258
    .line 259
    const v18, -0x4151eb85    # -0.34f

    .line 260
    .line 261
    .line 262
    const v13, -0x40d47ae1    # -0.67f

    .line 263
    .line 264
    .line 265
    const v14, -0x41947ae1    # -0.23f

    .line 266
    .line 267
    .line 268
    const v15, -0x404ccccd    # -1.4f

    .line 269
    .line 270
    .line 271
    const v16, -0x4151eb85    # -0.34f

    .line 272
    .line 273
    .line 274
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 275
    .line 276
    .line 277
    const v17, -0x3ff47ae1    # -2.18f

    .line 278
    .line 279
    .line 280
    const v18, 0x3e947ae1    # 0.29f

    .line 281
    .line 282
    .line 283
    const v13, -0x40b5c28f    # -0.79f

    .line 284
    .line 285
    .line 286
    const/4 v14, 0x0

    .line 287
    const v15, -0x403d70a4    # -1.52f

    .line 288
    .line 289
    .line 290
    const v16, 0x3dcccccd    # 0.1f

    .line 291
    .line 292
    .line 293
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 294
    .line 295
    .line 296
    const v17, -0x40266666    # -1.7f

    .line 297
    .line 298
    .line 299
    const v18, 0x3f547ae1    # 0.83f

    .line 300
    .line 301
    .line 302
    const v13, -0x40d9999a    # -0.65f

    .line 303
    .line 304
    .line 305
    const v14, 0x3e4ccccd    # 0.2f

    .line 306
    .line 307
    .line 308
    const v15, -0x4063d70a    # -1.22f

    .line 309
    .line 310
    .line 311
    const v16, 0x3ef5c28f    # 0.48f

    .line 312
    .line 313
    .line 314
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 315
    .line 316
    .line 317
    const v17, -0x4071eb85    # -1.11f

    .line 318
    .line 319
    .line 320
    const v18, 0x3fa51eb8    # 1.29f

    .line 321
    .line 322
    .line 323
    const v13, -0x410a3d71    # -0.48f

    .line 324
    .line 325
    .line 326
    const v14, 0x3eb851ec    # 0.36f

    .line 327
    .line 328
    .line 329
    const v15, -0x40a66666    # -0.85f

    .line 330
    .line 331
    .line 332
    const v16, 0x3f4a3d71    # 0.79f

    .line 333
    .line 334
    .line 335
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 336
    .line 337
    .line 338
    const v17, -0x41333333    # -0.4f

    .line 339
    .line 340
    .line 341
    const v18, 0x3fd5c28f    # 1.67f

    .line 342
    .line 343
    .line 344
    const v13, -0x4175c28f    # -0.27f

    .line 345
    .line 346
    .line 347
    const v14, 0x3f028f5c    # 0.51f

    .line 348
    .line 349
    .line 350
    const v15, -0x41333333    # -0.4f

    .line 351
    .line 352
    .line 353
    const v16, 0x3f87ae14    # 1.06f

    .line 354
    .line 355
    .line 356
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 357
    .line 358
    .line 359
    const v17, 0x3ec7ae14    # 0.39f

    .line 360
    .line 361
    .line 362
    const/4 v13, 0x0

    .line 363
    const v14, 0x3f23d70a    # 0.64f

    .line 364
    .line 365
    .line 366
    const v15, 0x3e051eb8    # 0.13f

    .line 367
    .line 368
    .line 369
    const v16, 0x3f9851ec    # 1.19f

    .line 370
    .line 371
    .line 372
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 373
    .line 374
    .line 375
    const v17, 0x3e19999a    # 0.15f

    .line 376
    .line 377
    .line 378
    const/high16 v18, 0x3e800000    # 0.25f

    .line 379
    .line 380
    const v13, 0x3d23d70a    # 0.04f

    .line 381
    .line 382
    .line 383
    const v14, 0x3da3d70a    # 0.08f

    .line 384
    .line 385
    .line 386
    const v15, 0x3dcccccd    # 0.1f

    .line 387
    .line 388
    .line 389
    const v16, 0x3e2e147b    # 0.17f

    .line 390
    .line 391
    .line 392
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 393
    .line 394
    .line 395
    const/high16 v0, 0x41400000    # 12.0f

    .line 396
    .line 397
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 398
    .line 399
    .line 400
    const v17, -0x404b851f    # -1.41f

    .line 401
    .line 402
    .line 403
    const v18, -0x40cccccd    # -0.7f

    .line 404
    .line 405
    .line 406
    const v13, -0x40dc28f6    # -0.64f

    .line 407
    .line 408
    .line 409
    const v14, -0x419eb852    # -0.22f

    .line 410
    .line 411
    .line 412
    const v15, -0x407c28f6    # -1.03f

    .line 413
    .line 414
    .line 415
    const v16, -0x4119999a    # -0.45f

    .line 416
    .line 417
    .line 418
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 419
    .line 420
    .line 421
    const v17, -0x40c28f5c    # -0.74f

    .line 422
    .line 423
    .line 424
    const v18, -0x40651eb8    # -1.21f

    .line 425
    .line 426
    .line 427
    const v13, -0x41051eb8    # -0.49f

    .line 428
    .line 429
    .line 430
    const v14, -0x41570a3d    # -0.33f

    .line 431
    .line 432
    .line 433
    const v15, -0x40c28f5c    # -0.74f

    .line 434
    .line 435
    .line 436
    const v16, -0x40c51eb8    # -0.73f

    .line 437
    .line 438
    .line 439
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 440
    .line 441
    .line 442
    const v17, 0x3e19999a    # 0.15f

    .line 443
    .line 444
    .line 445
    const v18, -0x40d70a3d    # -0.66f

    .line 446
    .line 447
    .line 448
    const/4 v13, 0x0

    .line 449
    const v14, -0x41947ae1    # -0.23f

    .line 450
    .line 451
    .line 452
    const v15, 0x3d4ccccd    # 0.05f

    .line 453
    .line 454
    .line 455
    const v16, -0x4119999a    # -0.45f

    .line 456
    .line 457
    .line 458
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 459
    .line 460
    .line 461
    const v0, -0x413851ec    # -0.39f

    .line 462
    .line 463
    .line 464
    const v2, -0x40f33333    # -0.55f

    .line 465
    .line 466
    .line 467
    const v4, 0x3ee147ae    # 0.44f

    .line 468
    .line 469
    .line 470
    const/high16 v6, 0x3e800000    # 0.25f

    .line 471
    .line 472
    invoke-virtual {v12, v6, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 473
    .line 474
    .line 475
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 476
    .line 477
    .line 478
    const/high16 v0, 0x40400000    # 3.0f

    .line 479
    .line 480
    const/high16 v2, 0x41400000    # 12.0f

    .line 481
    .line 482
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 483
    .line 484
    .line 485
    const v0, 0x4119eb85    # 9.62f

    .line 486
    .line 487
    .line 488
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 489
    .line 490
    .line 491
    const v17, 0x3f0ccccd    # 0.55f

    .line 492
    .line 493
    .line 494
    const v18, 0x3e4ccccd    # 0.2f

    .line 495
    .line 496
    .line 497
    const v13, 0x3e3851ec    # 0.18f

    .line 498
    .line 499
    .line 500
    const v14, 0x3d8f5c29    # 0.07f

    .line 501
    .line 502
    .line 503
    const v15, 0x3ecccccd    # 0.4f

    .line 504
    .line 505
    .line 506
    const v16, 0x3e0f5c29    # 0.14f

    .line 507
    .line 508
    .line 509
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 510
    .line 511
    .line 512
    const v17, 0x3f5eb852    # 0.87f

    .line 513
    .line 514
    .line 515
    const v18, 0x3f028f5c    # 0.51f

    .line 516
    .line 517
    .line 518
    const v13, 0x3ebd70a4    # 0.37f

    .line 519
    .line 520
    .line 521
    const v14, 0x3e2e147b    # 0.17f

    .line 522
    .line 523
    .line 524
    const v15, 0x3f28f5c3    # 0.66f

    .line 525
    .line 526
    .line 527
    const v16, 0x3eae147b    # 0.34f

    .line 528
    .line 529
    .line 530
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 531
    .line 532
    .line 533
    const v17, 0x3edc28f6    # 0.43f

    .line 534
    .line 535
    .line 536
    const v18, 0x3f11eb85    # 0.57f

    .line 537
    .line 538
    .line 539
    const v13, 0x3e570a3d    # 0.21f

    .line 540
    .line 541
    .line 542
    const v15, 0x3eb33333    # 0.35f

    .line 543
    .line 544
    .line 545
    const v16, 0x3eb851ec    # 0.36f

    .line 546
    .line 547
    .line 548
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 549
    .line 550
    .line 551
    const v17, 0x3de147ae    # 0.11f

    .line 552
    .line 553
    .line 554
    const v18, 0x3f30a3d7    # 0.69f

    .line 555
    .line 556
    .line 557
    const v13, 0x3d8f5c29    # 0.07f

    .line 558
    .line 559
    .line 560
    const v14, 0x3e4ccccd    # 0.2f

    .line 561
    .line 562
    .line 563
    const v15, 0x3de147ae    # 0.11f

    .line 564
    .line 565
    .line 566
    const v16, 0x3edc28f6    # 0.43f

    .line 567
    .line 568
    .line 569
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 570
    .line 571
    .line 572
    const v17, -0x41f0a3d7    # -0.14f

    .line 573
    .line 574
    .line 575
    const v18, 0x3f28f5c3    # 0.66f

    .line 576
    .line 577
    .line 578
    const/4 v13, 0x0

    .line 579
    const v14, 0x3e6b851f    # 0.23f

    .line 580
    .line 581
    .line 582
    const v15, -0x42b33333    # -0.05f

    .line 583
    .line 584
    .line 585
    const v16, 0x3ee66666    # 0.45f

    .line 586
    .line 587
    .line 588
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 589
    .line 590
    .line 591
    const v17, -0x4128f5c3    # -0.42f

    .line 592
    .line 593
    .line 594
    const v18, 0x3f07ae14    # 0.53f

    .line 595
    .line 596
    .line 597
    const v13, -0x4247ae14    # -0.09f

    .line 598
    .line 599
    .line 600
    const v14, 0x3e4ccccd    # 0.2f

    .line 601
    .line 602
    .line 603
    const v15, -0x41947ae1    # -0.23f

    .line 604
    .line 605
    .line 606
    const v16, 0x3ec28f5c    # 0.38f

    .line 607
    .line 608
    .line 609
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 610
    .line 611
    .line 612
    const v17, -0x40ca3d71    # -0.71f

    .line 613
    .line 614
    .line 615
    const v18, 0x3eb33333    # 0.35f

    .line 616
    .line 617
    .line 618
    const v13, -0x41bd70a4    # -0.19f

    .line 619
    .line 620
    .line 621
    const v14, 0x3e19999a    # 0.15f

    .line 622
    .line 623
    .line 624
    const v15, -0x4128f5c3    # -0.42f

    .line 625
    .line 626
    .line 627
    const v16, 0x3e851eb8    # 0.26f

    .line 628
    .line 629
    .line 630
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 631
    .line 632
    .line 633
    const v17, -0x407eb852    # -1.01f

    .line 634
    .line 635
    .line 636
    const v18, 0x3e051eb8    # 0.13f

    .line 637
    .line 638
    .line 639
    const v13, -0x416b851f    # -0.29f

    .line 640
    .line 641
    .line 642
    const v14, 0x3da3d70a    # 0.08f

    .line 643
    .line 644
    .line 645
    const v15, -0x40deb852    # -0.63f

    .line 646
    .line 647
    .line 648
    const v16, 0x3e051eb8    # 0.13f

    .line 649
    .line 650
    .line 651
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 652
    .line 653
    .line 654
    const v17, -0x4068f5c3    # -1.18f

    .line 655
    .line 656
    .line 657
    const v18, -0x41fae148    # -0.13f

    .line 658
    .line 659
    .line 660
    const v13, -0x4123d70a    # -0.43f

    .line 661
    .line 662
    .line 663
    const/4 v14, 0x0

    .line 664
    const v15, -0x40ab851f    # -0.83f

    .line 665
    .line 666
    .line 667
    const v16, -0x42dc28f6    # -0.04f

    .line 668
    .line 669
    .line 670
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 671
    .line 672
    .line 673
    const v0, -0x40970a3d    # -0.91f

    .line 674
    .line 675
    .line 676
    const v2, -0x4128f5c3    # -0.42f

    .line 677
    .line 678
    .line 679
    const v4, -0x40d70a3d    # -0.66f

    .line 680
    .line 681
    .line 682
    const v6, -0x41947ae1    # -0.23f

    .line 683
    .line 684
    .line 685
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 686
    .line 687
    .line 688
    const v0, -0x40e8f5c3    # -0.59f

    .line 689
    .line 690
    .line 691
    const/high16 v2, -0x40c00000    # -0.75f

    .line 692
    .line 693
    const v4, -0x4119999a    # -0.45f

    .line 694
    .line 695
    .line 696
    const v6, -0x411eb852    # -0.44f

    .line 697
    .line 698
    .line 699
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 700
    .line 701
    .line 702
    const v0, -0x40bd70a4    # -0.76f

    .line 703
    .line 704
    .line 705
    const v2, -0x40651eb8    # -1.21f

    .line 706
    .line 707
    .line 708
    const/high16 v4, -0x41800000    # -0.25f

    .line 709
    .line 710
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 711
    .line 712
    .line 713
    const v0, 0x40cccccd    # 6.4f

    .line 714
    .line 715
    .line 716
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 717
    .line 718
    .line 719
    const v17, 0x3e75c28f    # 0.24f

    .line 720
    .line 721
    .line 722
    const v18, 0x3fca3d71    # 1.58f

    .line 723
    .line 724
    .line 725
    const/4 v13, 0x0

    .line 726
    const v14, 0x3f0ccccd    # 0.55f

    .line 727
    .line 728
    .line 729
    const v15, 0x3da3d70a    # 0.08f

    .line 730
    .line 731
    .line 732
    const v16, 0x3f90a3d7    # 1.13f

    .line 733
    .line 734
    .line 735
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 736
    .line 737
    .line 738
    const v17, 0x3f266666    # 0.65f

    .line 739
    .line 740
    .line 741
    const v18, 0x3f9ae148    # 1.21f

    .line 742
    .line 743
    .line 744
    const v13, 0x3e23d70a    # 0.16f

    .line 745
    .line 746
    .line 747
    const v14, 0x3ee66666    # 0.45f

    .line 748
    .line 749
    .line 750
    const v15, 0x3ebd70a4    # 0.37f

    .line 751
    .line 752
    .line 753
    const v16, 0x3f59999a    # 0.85f

    .line 754
    .line 755
    .line 756
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 757
    .line 758
    .line 759
    const v17, 0x3f7ae148    # 0.98f

    .line 760
    .line 761
    .line 762
    const v18, 0x3f6b851f    # 0.92f

    .line 763
    .line 764
    .line 765
    const v13, 0x3e8f5c29    # 0.28f

    .line 766
    .line 767
    .line 768
    const v14, 0x3eb33333    # 0.35f

    .line 769
    .line 770
    .line 771
    const v15, 0x3f19999a    # 0.6f

    .line 772
    .line 773
    .line 774
    const v16, 0x3f28f5c3    # 0.66f

    .line 775
    .line 776
    .line 777
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 778
    .line 779
    .line 780
    const v17, 0x3f9c28f6    # 1.22f

    .line 781
    .line 782
    .line 783
    const v18, 0x3f266666    # 0.65f

    .line 784
    .line 785
    .line 786
    const v13, 0x3ebd70a4    # 0.37f

    .line 787
    .line 788
    .line 789
    const v14, 0x3e851eb8    # 0.26f

    .line 790
    .line 791
    .line 792
    const v15, 0x3f47ae14    # 0.78f

    .line 793
    .line 794
    .line 795
    const v16, 0x3ef5c28f    # 0.48f

    .line 796
    .line 797
    .line 798
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 799
    .line 800
    .line 801
    const v0, 0x3fb0a3d7    # 1.38f

    .line 802
    .line 803
    .line 804
    const v2, 0x3ec7ae14    # 0.39f

    .line 805
    .line 806
    .line 807
    const v4, 0x3f666666    # 0.9f

    .line 808
    .line 809
    .line 810
    const v6, 0x3e99999a    # 0.3f

    .line 811
    .line 812
    .line 813
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 814
    .line 815
    .line 816
    const v17, 0x3fb851ec    # 1.44f

    .line 817
    .line 818
    .line 819
    const v18, 0x3e051eb8    # 0.13f

    .line 820
    .line 821
    .line 822
    const v13, 0x3ef5c28f    # 0.48f

    .line 823
    .line 824
    .line 825
    const v14, 0x3da3d70a    # 0.08f

    .line 826
    .line 827
    .line 828
    const v15, 0x3f75c28f    # 0.96f

    .line 829
    .line 830
    .line 831
    const v16, 0x3e051eb8    # 0.13f

    .line 832
    .line 833
    .line 834
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 835
    .line 836
    .line 837
    const v17, 0x400b851f    # 2.18f

    .line 838
    .line 839
    .line 840
    const v18, -0x4170a3d7    # -0.28f

    .line 841
    .line 842
    .line 843
    const v13, 0x3f4ccccd    # 0.8f

    .line 844
    .line 845
    .line 846
    const/4 v14, 0x0

    .line 847
    const v15, 0x3fc3d70a    # 1.53f

    .line 848
    .line 849
    .line 850
    const v16, -0x4247ae14    # -0.09f

    .line 851
    .line 852
    .line 853
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 854
    .line 855
    .line 856
    const v17, 0x3fd5c28f    # 1.67f

    .line 857
    .line 858
    .line 859
    const v18, -0x40b5c28f    # -0.79f

    .line 860
    .line 861
    .line 862
    const v13, 0x3f266666    # 0.65f

    .line 863
    .line 864
    .line 865
    const v14, -0x41bd70a4    # -0.19f

    .line 866
    .line 867
    .line 868
    const v15, 0x3f9ae148    # 1.21f

    .line 869
    .line 870
    .line 871
    const v16, -0x4119999a    # -0.45f

    .line 872
    .line 873
    .line 874
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 875
    .line 876
    .line 877
    const v17, 0x3f88f5c3    # 1.07f

    .line 878
    .line 879
    .line 880
    const v18, -0x405d70a4    # -1.27f

    .line 881
    .line 882
    .line 883
    const v13, 0x3eeb851f    # 0.46f

    .line 884
    .line 885
    .line 886
    const v14, -0x4151eb85    # -0.34f

    .line 887
    .line 888
    .line 889
    const v15, 0x3f51eb85    # 0.82f

    .line 890
    .line 891
    .line 892
    const v16, -0x40bae148    # -0.77f

    .line 893
    .line 894
    .line 895
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 896
    .line 897
    .line 898
    const v0, -0x40770a3d    # -1.07f

    .line 899
    .line 900
    .line 901
    const v2, -0x40251eb8    # -1.71f

    .line 902
    .line 903
    .line 904
    const v4, 0x3ec28f5c    # 0.38f

    .line 905
    .line 906
    .line 907
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 908
    .line 909
    .line 910
    const v17, -0x416147ae    # -0.31f

    .line 911
    .line 912
    .line 913
    const v18, -0x4031eb85    # -1.61f

    .line 914
    .line 915
    .line 916
    const/4 v13, 0x0

    .line 917
    const v14, -0x40e66666    # -0.6f

    .line 918
    .line 919
    .line 920
    const v15, -0x42333333    # -0.1f

    .line 921
    .line 922
    .line 923
    const v16, -0x406e147b    # -1.14f

    .line 924
    .line 925
    .line 926
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 927
    .line 928
    .line 929
    const v17, -0x41d1eb85    # -0.17f

    .line 930
    .line 931
    .line 932
    const v18, -0x41570a3d    # -0.33f

    .line 933
    .line 934
    .line 935
    const v13, -0x42b33333    # -0.05f

    .line 936
    .line 937
    .line 938
    const v14, -0x421eb852    # -0.11f

    .line 939
    .line 940
    .line 941
    const v15, -0x421eb852    # -0.11f

    .line 942
    .line 943
    .line 944
    const v16, -0x41947ae1    # -0.23f

    .line 945
    .line 946
    .line 947
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 948
    .line 949
    .line 950
    const/high16 v0, 0x41a80000    # 21.0f

    .line 951
    .line 952
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 953
    .line 954
    .line 955
    const/high16 v0, 0x41200000    # 10.0f

    .line 956
    .line 957
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 958
    .line 959
    .line 960
    const/high16 v0, 0x40400000    # 3.0f

    .line 961
    .line 962
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 963
    .line 964
    .line 965
    const/high16 v0, 0x40000000    # 2.0f

    .line 966
    .line 967
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 968
    .line 969
    .line 970
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 971
    .line 972
    .line 973
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 974
    .line 975
    .line 976
    move-result-object v2

    .line 977
    const/16 v16, 0x3800

    .line 978
    .line 979
    const/16 v17, 0x0

    .line 980
    .line 981
    const/high16 v6, 0x3f800000    # 1.0f

    .line 982
    .line 983
    const/high16 v8, 0x3f800000    # 1.0f

    .line 984
    .line 985
    const/4 v7, 0x0

    .line 986
    const/high16 v9, 0x3f800000    # 1.0f

    .line 987
    .line 988
    const/high16 v12, 0x3f800000    # 1.0f

    .line 989
    .line 990
    const/4 v13, 0x0

    .line 991
    const/4 v14, 0x0

    .line 992
    const/4 v15, 0x0

    .line 993
    const-string v4, ""

    .line 994
    .line 995
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 996
    .line 997
    .line 998
    move-result-object v0

    .line 999
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1000
    .line 1001
    .line 1002
    move-result-object v0

    .line 1003
    sput-object v0, Landroidx/compose/material/icons/twotone/StrikethroughSKt;->_strikethroughS:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1004
    .line 1005
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 1006
    .line 1007
    .line 1008
    return-object v0
.end method
