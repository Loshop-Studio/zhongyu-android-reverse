.class public final Landroidx/compose/material/icons/rounded/CompostKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_compost",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "Compost",
        "Landroidx/compose/material/icons/Icons$Rounded;",
        "getCompost",
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
        "SMAP\nCompost.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Compost.kt\nandroidx/compose/material/icons/rounded/CompostKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,77:1\n212#2,12:78\n233#2,18:91\n253#2:128\n174#3:90\n705#4,2:109\n717#4,2:111\n719#4,11:117\n72#5,4:113\n*S KotlinDebug\n*F\n+ 1 Compost.kt\nandroidx/compose/material/icons/rounded/CompostKt\n*L\n29#1:78,12\n30#1:91,18\n30#1:128\n29#1:90\n30#1:109,2\n30#1:111,2\n30#1:117,11\n30#1:113,4\n*E\n"
    }
.end annotation


# static fields
.field private static _compost:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getCompost(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/CompostKt;->_compost:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.Compost"

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
    const v0, 0x413bae14    # 11.73f

    .line 71
    .line 72
    .line 73
    const/high16 v2, 0x41ac0000    # 21.5f

    .line 74
    .line 75
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    const v17, -0x3eec7ae1    # -9.22f

    .line 79
    .line 80
    .line 81
    const v18, -0x3eec7ae1    # -9.22f

    .line 82
    .line 83
    .line 84
    const v13, -0x3f61999a    # -4.95f

    .line 85
    .line 86
    .line 87
    const v14, -0x41f0a3d7    # -0.14f

    .line 88
    .line 89
    .line 90
    const v15, -0x3eeeb852    # -9.08f

    .line 91
    .line 92
    .line 93
    const v16, -0x3f775c29    # -4.27f

    .line 94
    .line 95
    .line 96
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 97
    .line 98
    .line 99
    const/high16 v17, 0x41400000    # 12.0f

    .line 100
    .line 101
    const/high16 v18, 0x40200000    # 2.5f

    .line 102
    .line 103
    const v13, 0x40166666    # 2.35f

    .line 104
    .line 105
    .line 106
    const v14, 0x40dd1eb8    # 6.91f

    .line 107
    .line 108
    .line 109
    const v15, 0x40d570a4    # 6.67f

    .line 110
    .line 111
    .line 112
    const/high16 v16, 0x40200000    # 2.5f

    .line 113
    .line 114
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 115
    .line 116
    .line 117
    const v0, 0x3f9ae148    # 1.21f

    .line 118
    .line 119
    .line 120
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 121
    .line 122
    .line 123
    const v17, 0x3f59999a    # 0.85f

    .line 124
    .line 125
    .line 126
    const v18, -0x414ccccd    # -0.35f

    .line 127
    .line 128
    .line 129
    const/4 v13, 0x0

    .line 130
    const v14, -0x4119999a    # -0.45f

    .line 131
    .line 132
    .line 133
    const v15, 0x3f0a3d71    # 0.54f

    .line 134
    .line 135
    .line 136
    const v16, -0x40d47ae1    # -0.67f

    .line 137
    .line 138
    .line 139
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 140
    .line 141
    .line 142
    const v0, 0x40328f5c    # 2.79f

    .line 143
    .line 144
    .line 145
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 146
    .line 147
    .line 148
    const/16 v17, 0x0

    .line 149
    .line 150
    const v18, 0x3f35c28f    # 0.71f

    .line 151
    .line 152
    .line 153
    const v13, 0x3e4ccccd    # 0.2f

    .line 154
    .line 155
    .line 156
    const v14, 0x3e4ccccd    # 0.2f

    .line 157
    .line 158
    .line 159
    const v15, 0x3e4ccccd    # 0.2f

    .line 160
    .line 161
    .line 162
    const v16, 0x3f028f5c    # 0.51f

    .line 163
    .line 164
    .line 165
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 166
    .line 167
    .line 168
    const v0, -0x3fcd70a4    # -2.79f

    .line 169
    .line 170
    .line 171
    const v2, 0x40328f5c    # 2.79f

    .line 172
    .line 173
    .line 174
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 175
    .line 176
    .line 177
    const/high16 v17, 0x41400000    # 12.0f

    .line 178
    .line 179
    const v18, 0x40d947ae    # 6.79f

    .line 180
    .line 181
    .line 182
    const v13, 0x4148a3d7    # 12.54f

    .line 183
    .line 184
    .line 185
    const v14, 0x40eeb852    # 7.46f

    .line 186
    .line 187
    .line 188
    const/high16 v15, 0x41400000    # 12.0f

    .line 189
    .line 190
    const v16, 0x40e7ae14    # 7.24f

    .line 191
    .line 192
    .line 193
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 194
    .line 195
    .line 196
    const/high16 v0, 0x40b00000    # 5.5f

    .line 197
    .line 198
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 199
    .line 200
    .line 201
    const/high16 v17, -0x3f300000    # -6.5f

    .line 202
    .line 203
    const/high16 v18, 0x40d00000    # 6.5f

    .line 204
    .line 205
    const v13, -0x3f9ae148    # -3.58f

    .line 206
    .line 207
    .line 208
    const/4 v14, 0x0

    .line 209
    const/high16 v15, -0x3f300000    # -6.5f

    .line 210
    .line 211
    const v16, 0x403ae148    # 2.92f

    .line 212
    .line 213
    .line 214
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 215
    .line 216
    .line 217
    const v17, 0x4033d70a    # 2.81f

    .line 218
    .line 219
    .line 220
    const v18, 0x40ab3333    # 5.35f

    .line 221
    .line 222
    .line 223
    const/4 v13, 0x0

    .line 224
    const v14, 0x400d70a4    # 2.21f

    .line 225
    .line 226
    .line 227
    const v15, 0x3f8e147b    # 1.11f

    .line 228
    .line 229
    .line 230
    const v16, 0x408570a4    # 4.17f

    .line 231
    .line 232
    .line 233
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 234
    .line 235
    .line 236
    const v17, 0x403eb852    # 2.98f

    .line 237
    .line 238
    .line 239
    const v18, -0x4019999a    # -1.8f

    .line 240
    .line 241
    .line 242
    const v13, 0x3f028f5c    # 0.51f

    .line 243
    .line 244
    .line 245
    const v14, -0x40947ae1    # -0.92f

    .line 246
    .line 247
    .line 248
    const v15, 0x3fd0a3d7    # 1.63f

    .line 249
    .line 250
    .line 251
    const v16, -0x4030a3d7    # -1.62f

    .line 252
    .line 253
    .line 254
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 255
    .line 256
    .line 257
    const v17, -0x41051eb8    # -0.49f

    .line 258
    .line 259
    .line 260
    const v18, -0x3ffe147b    # -2.03f

    .line 261
    .line 262
    .line 263
    const v13, -0x4247ae14    # -0.09f

    .line 264
    .line 265
    .line 266
    const v14, -0x40cf5c29    # -0.69f

    .line 267
    .line 268
    .line 269
    const v15, -0x417ae148    # -0.26f

    .line 270
    .line 271
    .line 272
    const v16, -0x404a3d71    # -1.42f

    .line 273
    .line 274
    .line 275
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 276
    .line 277
    .line 278
    const v17, -0x4063d70a    # -1.22f

    .line 279
    .line 280
    .line 281
    const v18, 0x3ef5c28f    # 0.48f

    .line 282
    .line 283
    .line 284
    const v13, -0x41570a3d    # -0.33f

    .line 285
    .line 286
    .line 287
    const v14, 0x3e8f5c29    # 0.28f

    .line 288
    .line 289
    .line 290
    const/high16 v15, -0x40c00000    # -0.75f

    .line 291
    .line 292
    const v16, 0x3eeb851f    # 0.46f

    .line 293
    .line 294
    .line 295
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 296
    .line 297
    .line 298
    const v17, -0x3ffae148    # -2.08f

    .line 299
    .line 300
    .line 301
    const v18, -0x3ff7ae14    # -2.13f

    .line 302
    .line 303
    .line 304
    const v13, -0x406e147b    # -1.14f

    .line 305
    .line 306
    .line 307
    const v14, 0x3d4ccccd    # 0.05f

    .line 308
    .line 309
    .line 310
    const v15, -0x3ffae148    # -2.08f

    .line 311
    .line 312
    .line 313
    const v16, -0x40828f5c    # -0.99f

    .line 314
    .line 315
    .line 316
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 317
    .line 318
    .line 319
    const v0, -0x40a3d70a    # -0.86f

    .line 320
    .line 321
    .line 322
    const/4 v2, 0x0

    .line 323
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 324
    .line 325
    .line 326
    const v17, -0x41f0a3d7    # -0.14f

    .line 327
    .line 328
    .line 329
    const v18, -0x40ab851f    # -0.83f

    .line 330
    .line 331
    .line 332
    const/4 v13, 0x0

    .line 333
    const v14, -0x416b851f    # -0.29f

    .line 334
    .line 335
    .line 336
    const v15, -0x42b33333    # -0.05f

    .line 337
    .line 338
    .line 339
    const v16, -0x40ee147b    # -0.57f

    .line 340
    .line 341
    .line 342
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 343
    .line 344
    .line 345
    const v17, 0x40fb851f    # 7.86f

    .line 346
    .line 347
    .line 348
    const v18, 0x411851ec    # 9.52f

    .line 349
    .line 350
    .line 351
    const v13, 0x40e7ae14    # 7.24f

    .line 352
    .line 353
    .line 354
    const v14, 0x411d70a4    # 9.84f

    .line 355
    .line 356
    .line 357
    const/high16 v15, 0x40f00000    # 7.5f

    .line 358
    .line 359
    const v16, 0x4117d70a    # 9.49f

    .line 360
    .line 361
    .line 362
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 363
    .line 364
    .line 365
    const v17, 0x4068f5c3    # 3.64f

    .line 366
    .line 367
    .line 368
    const v18, 0x401eb852    # 2.48f

    .line 369
    .line 370
    .line 371
    const v13, 0x3fa66666    # 1.3f

    .line 372
    .line 373
    .line 374
    const v14, 0x3db851ec    # 0.09f

    .line 375
    .line 376
    .line 377
    const v15, 0x40666666    # 3.6f

    .line 378
    .line 379
    .line 380
    const v16, 0x3f051eb8    # 0.52f

    .line 381
    .line 382
    .line 383
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 384
    .line 385
    .line 386
    const v17, -0x41d1eb85    # -0.17f

    .line 387
    .line 388
    .line 389
    const v18, 0x3f4ccccd    # 0.8f

    .line 390
    .line 391
    .line 392
    const/4 v13, 0x0

    .line 393
    const v14, 0x3e947ae1    # 0.29f

    .line 394
    .line 395
    .line 396
    const v15, -0x428a3d71    # -0.06f

    .line 397
    .line 398
    .line 399
    const v16, 0x3f0f5c29    # 0.56f

    .line 400
    .line 401
    .line 402
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 403
    .line 404
    .line 405
    const/high16 v17, 0x41200000    # 10.0f

    .line 406
    .line 407
    const/high16 v18, 0x41400000    # 12.0f

    .line 408
    .line 409
    const v13, 0x412e8f5c    # 10.91f

    .line 410
    .line 411
    .line 412
    const v14, 0x4147ae14    # 12.48f

    .line 413
    .line 414
    .line 415
    const v15, 0x4127851f    # 10.47f

    .line 416
    .line 417
    .line 418
    const v16, 0x41433333    # 12.2f

    .line 419
    .line 420
    .line 421
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 422
    .line 423
    .line 424
    const/high16 v17, 0x40000000    # 2.0f

    .line 425
    .line 426
    const v18, 0x40266666    # 2.6f

    .line 427
    .line 428
    .line 429
    const v13, 0x3f147ae1    # 0.58f

    .line 430
    .line 431
    .line 432
    const v14, 0x3edc28f6    # 0.43f

    .line 433
    .line 434
    .line 435
    const v15, 0x3faf5c29    # 1.37f

    .line 436
    .line 437
    .line 438
    const v16, 0x3faf5c29    # 1.37f

    .line 439
    .line 440
    .line 441
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 442
    .line 443
    .line 444
    const/high16 v17, 0x40400000    # 3.0f

    .line 445
    .line 446
    const v18, -0x3f6ccccd    # -4.6f

    .line 447
    .line 448
    .line 449
    const v13, 0x3f2b851f    # 0.67f

    .line 450
    .line 451
    .line 452
    const v14, -0x4030a3d7    # -1.62f

    .line 453
    .line 454
    .line 455
    const v15, 0x3fd70a3d    # 1.68f

    .line 456
    .line 457
    .line 458
    const v16, -0x3faeb852    # -3.27f

    .line 459
    .line 460
    .line 461
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 462
    .line 463
    .line 464
    const v17, -0x3ff7ae14    # -2.13f

    .line 465
    .line 466
    .line 467
    const v18, 0x3fe7ae14    # 1.81f

    .line 468
    .line 469
    .line 470
    const v13, -0x40bd70a4    # -0.76f

    .line 471
    .line 472
    .line 473
    const v14, 0x3f051eb8    # 0.52f

    .line 474
    .line 475
    .line 476
    const v15, -0x4043d70a    # -1.47f

    .line 477
    .line 478
    .line 479
    const v16, 0x3f8f5c29    # 1.12f

    .line 480
    .line 481
    .line 482
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 483
    .line 484
    .line 485
    const v17, -0x4147ae14    # -0.36f

    .line 486
    .line 487
    .line 488
    const v18, -0x4043d70a    # -1.47f

    .line 489
    .line 490
    .line 491
    const v13, -0x417ae148    # -0.26f

    .line 492
    .line 493
    .line 494
    const v14, -0x4128f5c3    # -0.42f

    .line 495
    .line 496
    .line 497
    const v15, -0x41333333    # -0.4f

    .line 498
    .line 499
    .line 500
    const v16, -0x4091eb85    # -0.93f

    .line 501
    .line 502
    .line 503
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 504
    .line 505
    .line 506
    const v17, 0x4172147b    # 15.13f

    .line 507
    .line 508
    .line 509
    const/high16 v18, 0x41000000    # 8.0f

    .line 510
    .line 511
    const v13, 0x414970a4    # 12.59f

    .line 512
    .line 513
    .line 514
    const/high16 v14, 0x41100000    # 9.0f

    .line 515
    .line 516
    const v15, 0x415ca3d7    # 13.79f

    .line 517
    .line 518
    .line 519
    const/high16 v16, 0x41000000    # 8.0f

    .line 520
    .line 521
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 522
    .line 523
    .line 524
    const/high16 v0, 0x41800000    # 16.0f

    .line 525
    .line 526
    const/high16 v2, 0x41000000    # 8.0f

    .line 527
    .line 528
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 529
    .line 530
    .line 531
    const v17, 0x3fa3d70a    # 1.28f

    .line 532
    .line 533
    .line 534
    const v18, -0x416147ae    # -0.31f

    .line 535
    .line 536
    .line 537
    const v13, 0x3f0f5c29    # 0.56f

    .line 538
    .line 539
    .line 540
    const/4 v14, 0x0

    .line 541
    const v15, 0x3f7851ec    # 0.97f

    .line 542
    .line 543
    .line 544
    const v16, -0x41f0a3d7    # -0.14f

    .line 545
    .line 546
    .line 547
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 548
    .line 549
    .line 550
    const/high16 v17, 0x3f400000    # 0.75f

    .line 551
    .line 552
    const v18, 0x3ee147ae    # 0.44f

    .line 553
    .line 554
    .line 555
    const v13, 0x3eae147b    # 0.34f

    .line 556
    .line 557
    .line 558
    const v14, -0x41bd70a4    # -0.19f

    .line 559
    .line 560
    .line 561
    const v15, 0x3f428f5c    # 0.76f

    .line 562
    .line 563
    .line 564
    const v16, 0x3d4ccccd    # 0.05f

    .line 565
    .line 566
    .line 567
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 568
    .line 569
    .line 570
    const/high16 v17, 0x41700000    # 15.0f

    .line 571
    .line 572
    const/high16 v18, 0x41500000    # 13.0f

    .line 573
    .line 574
    const v13, 0x418feb85    # 17.99f

    .line 575
    .line 576
    .line 577
    const v14, 0x411deb85    # 9.87f

    .line 578
    .line 579
    .line 580
    const v15, 0x418c7ae1    # 17.56f

    .line 581
    .line 582
    .line 583
    const/high16 v16, 0x41500000    # 13.0f

    .line 584
    .line 585
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 586
    .line 587
    .line 588
    const v17, -0x40570a3d    # -1.32f

    .line 589
    .line 590
    .line 591
    const v18, -0x413d70a4    # -0.38f

    .line 592
    .line 593
    .line 594
    const v13, -0x41051eb8    # -0.49f

    .line 595
    .line 596
    .line 597
    const/4 v14, 0x0

    .line 598
    const v15, -0x408f5c29    # -0.94f

    .line 599
    .line 600
    .line 601
    const v16, -0x41f0a3d7    # -0.14f

    .line 602
    .line 603
    .line 604
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 605
    .line 606
    .line 607
    const v17, -0x40bd70a4    # -0.76f

    .line 608
    .line 609
    .line 610
    const v18, 0x403d70a4    # 2.96f

    .line 611
    .line 612
    .line 613
    const v13, -0x418a3d71    # -0.24f

    .line 614
    .line 615
    .line 616
    const v14, 0x3f23d70a    # 0.64f

    .line 617
    .line 618
    .line 619
    const v15, -0x40e8f5c3    # -0.59f

    .line 620
    .line 621
    .line 622
    const v16, 0x3fe147ae    # 1.76f

    .line 623
    .line 624
    .line 625
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 626
    .line 627
    .line 628
    const v17, 0x403147ae    # 2.77f

    .line 629
    .line 630
    .line 631
    const v18, 0x3fe28f5c    # 1.77f

    .line 632
    .line 633
    .line 634
    const v13, 0x3fa147ae    # 1.26f

    .line 635
    .line 636
    .line 637
    const v14, 0x3e6147ae    # 0.22f

    .line 638
    .line 639
    .line 640
    const v15, 0x4011eb85    # 2.28f

    .line 641
    .line 642
    .line 643
    const v16, 0x3f63d70a    # 0.89f

    .line 644
    .line 645
    .line 646
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 647
    .line 648
    .line 649
    const v17, 0x40328f5c    # 2.79f

    .line 650
    .line 651
    .line 652
    const v18, -0x3f6428f6    # -4.87f

    .line 653
    .line 654
    .line 655
    const v13, 0x3fc8f5c3    # 1.57f

    .line 656
    .line 657
    .line 658
    const v14, -0x40747ae1    # -1.09f

    .line 659
    .line 660
    .line 661
    const v15, 0x4028f5c3    # 2.64f

    .line 662
    .line 663
    .line 664
    const v16, -0x3fc9999a    # -2.85f

    .line 665
    .line 666
    .line 667
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 668
    .line 669
    .line 670
    const v17, 0x4197d70a    # 18.98f

    .line 671
    .line 672
    .line 673
    const/high16 v18, 0x41400000    # 12.0f

    .line 674
    .line 675
    const/high16 v13, 0x41940000    # 18.5f

    .line 676
    .line 677
    const v14, 0x4143851f    # 12.22f

    .line 678
    .line 679
    .line 680
    const v15, 0x4195ae14    # 18.71f

    .line 681
    .line 682
    .line 683
    const/high16 v16, 0x41400000    # 12.0f

    .line 684
    .line 685
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 686
    .line 687
    .line 688
    const v0, 0x3fe8f5c3    # 1.82f

    .line 689
    .line 690
    .line 691
    const/4 v2, 0x0

    .line 692
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 693
    .line 694
    .line 695
    const v17, 0x3f30a3d7    # 0.69f

    .line 696
    .line 697
    .line 698
    const v18, 0x3f051eb8    # 0.52f

    .line 699
    .line 700
    .line 701
    const v13, 0x3ef0a3d7    # 0.47f

    .line 702
    .line 703
    .line 704
    const/4 v14, 0x0

    .line 705
    const v15, 0x3f35c28f    # 0.71f

    .line 706
    .line 707
    .line 708
    const v16, 0x3e75c28f    # 0.24f

    .line 709
    .line 710
    .line 711
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 712
    .line 713
    .line 714
    const v17, 0x413bae14    # 11.73f

    .line 715
    .line 716
    .line 717
    const/high16 v18, 0x41ac0000    # 21.5f

    .line 718
    .line 719
    const v13, 0x41a9ae14    # 21.21f

    .line 720
    .line 721
    .line 722
    const v14, 0x418ce148    # 17.61f

    .line 723
    .line 724
    .line 725
    const v15, 0x418747ae    # 16.91f

    .line 726
    .line 727
    .line 728
    const v16, 0x41ad1eb8    # 21.64f

    .line 729
    .line 730
    .line 731
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 732
    .line 733
    .line 734
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 735
    .line 736
    .line 737
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 738
    .line 739
    .line 740
    move-result-object v2

    .line 741
    const/16 v16, 0x3800

    .line 742
    .line 743
    const/16 v17, 0x0

    .line 744
    .line 745
    const/high16 v6, 0x3f800000    # 1.0f

    .line 746
    .line 747
    const/high16 v8, 0x3f800000    # 1.0f

    .line 748
    .line 749
    const/4 v7, 0x0

    .line 750
    const/high16 v9, 0x3f800000    # 1.0f

    .line 751
    .line 752
    const/high16 v12, 0x3f800000    # 1.0f

    .line 753
    .line 754
    const/4 v13, 0x0

    .line 755
    const/4 v14, 0x0

    .line 756
    const/4 v15, 0x0

    .line 757
    const-string v4, ""

    .line 758
    .line 759
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 760
    .line 761
    .line 762
    move-result-object v0

    .line 763
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 764
    .line 765
    .line 766
    move-result-object v0

    .line 767
    sput-object v0, Landroidx/compose/material/icons/rounded/CompostKt;->_compost:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 768
    .line 769
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 770
    .line 771
    .line 772
    return-object v0
.end method
