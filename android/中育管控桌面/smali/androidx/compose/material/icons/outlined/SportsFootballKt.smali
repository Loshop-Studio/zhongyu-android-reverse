.class public final Landroidx/compose/material/icons/outlined/SportsFootballKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_sportsFootball",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "SportsFootball",
        "Landroidx/compose/material/icons/Icons$Outlined;",
        "getSportsFootball",
        "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;",
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
        "SMAP\nSportsFootball.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SportsFootball.kt\nandroidx/compose/material/icons/outlined/SportsFootballKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,72:1\n212#2,12:73\n233#2,18:86\n253#2:123\n233#2,18:124\n253#2:161\n174#3:85\n705#4,2:104\n717#4,2:106\n719#4,11:112\n705#4,2:142\n717#4,2:144\n719#4,11:150\n72#5,4:108\n72#5,4:146\n*S KotlinDebug\n*F\n+ 1 SportsFootball.kt\nandroidx/compose/material/icons/outlined/SportsFootballKt\n*L\n29#1:73,12\n30#1:86,18\n30#1:123\n60#1:124,18\n60#1:161\n29#1:85\n30#1:104,2\n30#1:106,2\n30#1:112,11\n60#1:142,2\n60#1:144,2\n60#1:150,11\n30#1:108,4\n60#1:146,4\n*E\n"
    }
.end annotation


# static fields
.field private static _sportsFootball:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getSportsFootball(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/outlined/SportsFootballKt;->_sportsFootball:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Outlined.SportsFootball"

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
    const v4, 0x41a27ae1    # 20.31f

    .line 71
    .line 72
    .line 73
    const v6, 0x406c28f6    # 3.69f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v25, 0x4182147b    # 16.26f

    .line 80
    .line 81
    .line 82
    const/high16 v26, 0x40400000    # 3.0f

    .line 83
    .line 84
    const v21, 0x419feb85    # 19.99f

    .line 85
    .line 86
    .line 87
    const v22, 0x40570a3d    # 3.36f

    .line 88
    .line 89
    .line 90
    const v23, 0x4192f5c3    # 18.37f

    .line 91
    .line 92
    .line 93
    const/high16 v24, 0x40400000    # 3.0f

    .line 94
    .line 95
    move-object/from16 v20, v2

    .line 96
    .line 97
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 98
    .line 99
    .line 100
    const v25, -0x3ee33333    # -9.8f

    .line 101
    .line 102
    .line 103
    const v26, 0x405d70a4    # 3.46f

    .line 104
    .line 105
    .line 106
    const v21, -0x3fbe147b    # -3.03f

    .line 107
    .line 108
    .line 109
    const/16 v22, 0x0

    .line 110
    .line 111
    const v23, -0x3f1d1eb8    # -7.09f

    .line 112
    .line 113
    .line 114
    const/high16 v24, 0x3f400000    # 0.75f

    .line 115
    .line 116
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 117
    .line 118
    .line 119
    const v25, 0x406c28f6    # 3.69f

    .line 120
    .line 121
    .line 122
    const v26, 0x41a27ae1    # 20.31f

    .line 123
    .line 124
    .line 125
    const v21, 0x3fef5c29    # 1.87f

    .line 126
    .line 127
    .line 128
    const v22, 0x4130cccd    # 11.05f

    .line 129
    .line 130
    .line 131
    const v23, 0x4039999a    # 2.9f

    .line 132
    .line 133
    .line 134
    const v24, 0x419c28f6    # 19.52f

    .line 135
    .line 136
    .line 137
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 138
    .line 139
    .line 140
    const v25, 0x40f7ae14    # 7.74f

    .line 141
    .line 142
    .line 143
    const/high16 v26, 0x41a80000    # 21.0f

    .line 144
    .line 145
    const v21, 0x408051ec    # 4.01f

    .line 146
    .line 147
    .line 148
    const v22, 0x41a51eb8    # 20.64f

    .line 149
    .line 150
    .line 151
    const v23, 0x40b428f6    # 5.63f

    .line 152
    .line 153
    .line 154
    const/high16 v24, 0x41a80000    # 21.0f

    .line 155
    .line 156
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 157
    .line 158
    .line 159
    const v25, 0x411ccccd    # 9.8f

    .line 160
    .line 161
    .line 162
    const v26, -0x3fa28f5c    # -3.46f

    .line 163
    .line 164
    .line 165
    const v21, 0x4041eb85    # 3.03f

    .line 166
    .line 167
    .line 168
    const/16 v22, 0x0

    .line 169
    .line 170
    const v23, 0x40e2e148    # 7.09f

    .line 171
    .line 172
    .line 173
    const/high16 v24, -0x40c00000    # -0.75f

    .line 174
    .line 175
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 176
    .line 177
    .line 178
    const v25, 0x41a27ae1    # 20.31f

    .line 179
    .line 180
    .line 181
    const v26, 0x406c28f6    # 3.69f

    .line 182
    .line 183
    .line 184
    const v21, 0x41b10a3d    # 22.13f

    .line 185
    .line 186
    .line 187
    const v22, 0x414f3333    # 12.95f

    .line 188
    .line 189
    .line 190
    const v23, 0x41a8cccd    # 21.1f

    .line 191
    .line 192
    .line 193
    const v24, 0x408f5c29    # 4.48f

    .line 194
    .line 195
    .line 196
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 197
    .line 198
    .line 199
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 200
    .line 201
    .line 202
    const v4, 0x40f7ae14    # 7.74f

    .line 203
    .line 204
    .line 205
    const/high16 v6, 0x41980000    # 19.0f

    .line 206
    .line 207
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 208
    .line 209
    .line 210
    const v25, -0x3fde147b    # -2.53f

    .line 211
    .line 212
    .line 213
    const v26, -0x41947ae1    # -0.23f

    .line 214
    .line 215
    .line 216
    const v21, -0x406e147b    # -1.14f

    .line 217
    .line 218
    .line 219
    const/16 v22, 0x0

    .line 220
    .line 221
    const v23, -0x3ffeb852    # -2.02f

    .line 222
    .line 223
    .line 224
    const v24, -0x420a3d71    # -0.12f

    .line 225
    .line 226
    .line 227
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 228
    .line 229
    .line 230
    const v25, -0x41d1eb85    # -0.17f

    .line 231
    .line 232
    .line 233
    const v26, -0x3f8ae148    # -3.83f

    .line 234
    .line 235
    .line 236
    const v21, -0x41c7ae14    # -0.18f

    .line 237
    .line 238
    .line 239
    const v22, -0x40b5c28f    # -0.79f

    .line 240
    .line 241
    .line 242
    const v23, -0x41666666    # -0.3f

    .line 243
    .line 244
    .line 245
    const v24, -0x3ff28f5c    # -2.21f

    .line 246
    .line 247
    .line 248
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 249
    .line 250
    .line 251
    const v4, 0x408051ec    # 4.01f

    .line 252
    .line 253
    .line 254
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 255
    .line 256
    .line 257
    const v25, 0x40f7ae14    # 7.74f

    .line 258
    .line 259
    .line 260
    const/high16 v26, 0x41980000    # 19.0f

    .line 261
    .line 262
    const v21, 0x41087ae1    # 8.53f

    .line 263
    .line 264
    .line 265
    const v22, 0x4197eb85    # 18.99f

    .line 266
    .line 267
    .line 268
    const v23, 0x410147ae    # 8.08f

    .line 269
    .line 270
    .line 271
    const/high16 v24, 0x41980000    # 19.0f

    .line 272
    .line 273
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 274
    .line 275
    .line 276
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 277
    .line 278
    .line 279
    const v4, 0x41810a3d    # 16.13f

    .line 280
    .line 281
    .line 282
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 283
    .line 284
    .line 285
    const v25, -0x3f6ae148    # -4.66f

    .line 286
    .line 287
    .line 288
    const v26, 0x401c28f6    # 2.44f

    .line 289
    .line 290
    .line 291
    const v21, -0x4055c28f    # -1.33f

    .line 292
    .line 293
    .line 294
    const v22, 0x3faa3d71    # 1.33f

    .line 295
    .line 296
    .line 297
    const v23, -0x3fbc28f6    # -3.06f

    .line 298
    .line 299
    .line 300
    const v24, 0x40033333    # 2.05f

    .line 301
    .line 302
    .line 303
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 304
    .line 305
    .line 306
    const v4, -0x3f3eb852    # -6.04f

    .line 307
    .line 308
    .line 309
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 310
    .line 311
    .line 312
    const v25, 0x401ccccd    # 2.45f

    .line 313
    .line 314
    .line 315
    const v26, -0x3f6b3333    # -4.65f

    .line 316
    .line 317
    .line 318
    const v21, 0x3ed70a3d    # 0.42f

    .line 319
    .line 320
    .line 321
    const v22, -0x4028f5c3    # -1.68f

    .line 322
    .line 323
    .line 324
    const v23, 0x3f947ae1    # 1.16f

    .line 325
    .line 326
    .line 327
    const v24, -0x3fa851ec    # -3.37f

    .line 328
    .line 329
    .line 330
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 331
    .line 332
    .line 333
    const v25, 0x40947ae1    # 4.64f

    .line 334
    .line 335
    .line 336
    const v26, -0x3fe47ae1    # -2.43f

    .line 337
    .line 338
    .line 339
    const v21, 0x3fa8f5c3    # 1.32f

    .line 340
    .line 341
    .line 342
    const v22, -0x40570a3d    # -1.32f

    .line 343
    .line 344
    .line 345
    const v23, 0x40433333    # 3.05f

    .line 346
    .line 347
    .line 348
    const v24, -0x3ffd70a4    # -2.04f

    .line 349
    .line 350
    .line 351
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 352
    .line 353
    .line 354
    const v4, 0x40c1999a    # 6.05f

    .line 355
    .line 356
    .line 357
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 358
    .line 359
    .line 360
    const v25, 0x41810a3d    # 16.13f

    .line 361
    .line 362
    .line 363
    const v26, 0x41810a3d    # 16.13f

    .line 364
    .line 365
    .line 366
    const v21, 0x41913333    # 18.15f

    .line 367
    .line 368
    .line 369
    const v22, 0x4152b852    # 13.17f

    .line 370
    .line 371
    .line 372
    const v23, 0x418b3333    # 17.4f

    .line 373
    .line 374
    .line 375
    const v24, 0x416d999a    # 14.85f

    .line 376
    .line 377
    .line 378
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 379
    .line 380
    .line 381
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 382
    .line 383
    .line 384
    const v4, 0x4197ae14    # 18.96f

    .line 385
    .line 386
    .line 387
    const v6, 0x411170a4    # 9.09f

    .line 388
    .line 389
    .line 390
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 391
    .line 392
    .line 393
    const v4, -0x3f7f0a3d    # -4.03f

    .line 394
    .line 395
    .line 396
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 397
    .line 398
    .line 399
    const v25, 0x4182147b    # 16.26f

    .line 400
    .line 401
    .line 402
    const/high16 v26, 0x40a00000    # 5.0f

    .line 403
    .line 404
    const v21, 0x41773333    # 15.45f

    .line 405
    .line 406
    .line 407
    const v22, 0x40a051ec    # 5.01f

    .line 408
    .line 409
    .line 410
    const v23, 0x417e8f5c    # 15.91f

    .line 411
    .line 412
    .line 413
    const/high16 v24, 0x40a00000    # 5.0f

    .line 414
    .line 415
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 416
    .line 417
    .line 418
    const v25, 0x4021eb85    # 2.53f

    .line 419
    .line 420
    .line 421
    const v26, 0x3e6b851f    # 0.23f

    .line 422
    .line 423
    .line 424
    const v21, 0x3f91eb85    # 1.14f

    .line 425
    .line 426
    .line 427
    const/16 v22, 0x0

    .line 428
    .line 429
    const v23, 0x400147ae    # 2.02f

    .line 430
    .line 431
    .line 432
    const v24, 0x3df5c28f    # 0.12f

    .line 433
    .line 434
    .line 435
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 436
    .line 437
    .line 438
    const v25, 0x4197ae14    # 18.96f

    .line 439
    .line 440
    .line 441
    const v26, 0x411170a4    # 9.09f

    .line 442
    .line 443
    .line 444
    const v21, 0x4197c28f    # 18.97f

    .line 445
    .line 446
    .line 447
    const v22, 0x40c0a3d7    # 6.02f

    .line 448
    .line 449
    .line 450
    const v23, 0x4198b852    # 19.09f

    .line 451
    .line 452
    .line 453
    const v24, 0x40ee6666    # 7.45f

    .line 454
    .line 455
    .line 456
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 457
    .line 458
    .line 459
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 460
    .line 461
    .line 462
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 463
    .line 464
    .line 465
    move-result-object v2

    .line 466
    const/16 v16, 0x3800

    .line 467
    .line 468
    const/16 v17, 0x0

    .line 469
    .line 470
    const/high16 v6, 0x3f800000    # 1.0f

    .line 471
    .line 472
    const/high16 v8, 0x3f800000    # 1.0f

    .line 473
    .line 474
    const/4 v7, 0x0

    .line 475
    const/high16 v9, 0x3f800000    # 1.0f

    .line 476
    .line 477
    const/high16 v12, 0x3f800000    # 1.0f

    .line 478
    .line 479
    const/4 v13, 0x0

    .line 480
    const/4 v14, 0x0

    .line 481
    const/4 v15, 0x0

    .line 482
    const-string v4, ""

    .line 483
    .line 484
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 485
    .line 486
    .line 487
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 488
    .line 489
    .line 490
    move-result v3

    .line 491
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 492
    .line 493
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 494
    .line 495
    .line 496
    move-result-wide v6

    .line 497
    const/4 v0, 0x0

    .line 498
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 499
    .line 500
    .line 501
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 502
    .line 503
    .line 504
    move-result v10

    .line 505
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 506
    .line 507
    .line 508
    move-result v11

    .line 509
    new-instance v0, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 510
    .line 511
    invoke-direct {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 512
    .line 513
    .line 514
    const/high16 v2, 0x41080000    # 8.5f

    .line 515
    .line 516
    const v4, 0x4161999a    # 14.1f

    .line 517
    .line 518
    .line 519
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 520
    .line 521
    .line 522
    const v2, -0x3f4ccccd    # -5.6f

    .line 523
    .line 524
    .line 525
    const v4, 0x40b33333    # 5.6f

    .line 526
    .line 527
    .line 528
    invoke-virtual {v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 529
    .line 530
    .line 531
    const v2, 0x3fb33333    # 1.4f

    .line 532
    .line 533
    .line 534
    invoke-virtual {v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 535
    .line 536
    .line 537
    const v2, -0x3f4ccccd    # -5.6f

    .line 538
    .line 539
    .line 540
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 541
    .line 542
    .line 543
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 544
    .line 545
    .line 546
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 547
    .line 548
    .line 549
    move-result-object v2

    .line 550
    const/high16 v6, 0x3f800000    # 1.0f

    .line 551
    .line 552
    const/4 v7, 0x0

    .line 553
    const-string v4, ""

    .line 554
    .line 555
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 556
    .line 557
    .line 558
    move-result-object v0

    .line 559
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 560
    .line 561
    .line 562
    move-result-object v0

    .line 563
    sput-object v0, Landroidx/compose/material/icons/outlined/SportsFootballKt;->_sportsFootball:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 564
    .line 565
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 566
    .line 567
    .line 568
    return-object v0
.end method
