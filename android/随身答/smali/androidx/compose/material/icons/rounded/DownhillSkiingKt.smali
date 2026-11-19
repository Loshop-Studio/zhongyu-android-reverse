.class public final Landroidx/compose/material/icons/rounded/DownhillSkiingKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_downhillSkiing",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "DownhillSkiing",
        "Landroidx/compose/material/icons/Icons$Rounded;",
        "getDownhillSkiing",
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
        "SMAP\nDownhillSkiing.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DownhillSkiing.kt\nandroidx/compose/material/icons/rounded/DownhillSkiingKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,82:1\n212#2,12:83\n233#2,18:96\n253#2:133\n174#3:95\n705#4,2:114\n717#4,2:116\n719#4,11:122\n72#5,4:118\n*S KotlinDebug\n*F\n+ 1 DownhillSkiing.kt\nandroidx/compose/material/icons/rounded/DownhillSkiingKt\n*L\n29#1:83,12\n30#1:96,18\n30#1:133\n29#1:95\n30#1:114,2\n30#1:116,2\n30#1:122,11\n30#1:118,4\n*E\n"
    }
.end annotation


# static fields
.field private static _downhillSkiing:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getDownhillSkiing(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/DownhillSkiingKt;->_downhillSkiing:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.DownhillSkiing"

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
    const/high16 v0, 0x40900000    # 4.5f

    .line 71
    .line 72
    const/high16 v2, 0x41940000    # 18.5f

    .line 73
    .line 74
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v17, -0x40000000    # -2.0f

    .line 78
    .line 79
    const/high16 v18, 0x40000000    # 2.0f

    .line 80
    .line 81
    const/4 v13, 0x0

    .line 82
    const v14, 0x3f8ccccd    # 1.1f

    .line 83
    .line 84
    .line 85
    const v15, -0x4099999a    # -0.9f

    .line 86
    .line 87
    .line 88
    const/high16 v16, 0x40000000    # 2.0f

    .line 89
    .line 90
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 91
    .line 92
    .line 93
    const v0, -0x4099999a    # -0.9f

    .line 94
    .line 95
    .line 96
    const/high16 v2, -0x40000000    # -2.0f

    .line 97
    .line 98
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 99
    .line 100
    .line 101
    const v0, 0x3f666666    # 0.9f

    .line 102
    .line 103
    .line 104
    const/high16 v2, 0x40000000    # 2.0f

    .line 105
    .line 106
    const/high16 v4, -0x40000000    # -2.0f

    .line 107
    .line 108
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 109
    .line 110
    .line 111
    const v0, 0x4059999a    # 3.4f

    .line 112
    .line 113
    .line 114
    const/high16 v2, 0x40900000    # 4.5f

    .line 115
    .line 116
    const/high16 v4, 0x41940000    # 18.5f

    .line 117
    .line 118
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 119
    .line 120
    .line 121
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 122
    .line 123
    .line 124
    const v0, 0x41a73333    # 20.9f

    .line 125
    .line 126
    .line 127
    const v2, 0x417c7ae1    # 15.78f

    .line 128
    .line 129
    .line 130
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 131
    .line 132
    .line 133
    const v0, 0x3f428f5c    # 0.76f

    .line 134
    .line 135
    .line 136
    const v2, 0x3e8a3d71    # 0.27f

    .line 137
    .line 138
    .line 139
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 140
    .line 141
    .line 142
    const v17, 0x3ffae148    # 1.96f

    .line 143
    .line 144
    .line 145
    const v18, 0x3ea8f5c3    # 0.33f

    .line 146
    .line 147
    .line 148
    const v13, 0x3f1eb852    # 0.62f

    .line 149
    .line 150
    .line 151
    const v14, 0x3e570a3d    # 0.21f

    .line 152
    .line 153
    .line 154
    const v15, 0x3fa28f5c    # 1.27f

    .line 155
    .line 156
    .line 157
    const v16, 0x3ea8f5c3    # 0.33f

    .line 158
    .line 159
    .line 160
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 161
    .line 162
    .line 163
    const v17, 0x3ff9999a    # 1.95f

    .line 164
    .line 165
    .line 166
    const v18, -0x41570a3d    # -0.33f

    .line 167
    .line 168
    .line 169
    const v13, 0x3f2e147b    # 0.68f

    .line 170
    .line 171
    .line 172
    const/4 v14, 0x0

    .line 173
    const v15, 0x3fab851f    # 1.34f

    .line 174
    .line 175
    .line 176
    const v16, -0x420a3d71    # -0.12f

    .line 177
    .line 178
    .line 179
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 180
    .line 181
    .line 182
    const v17, 0x3f47ae14    # 0.78f

    .line 183
    .line 184
    .line 185
    const v18, 0x3e3851ec    # 0.18f

    .line 186
    .line 187
    .line 188
    const v13, 0x3e8a3d71    # 0.27f

    .line 189
    .line 190
    .line 191
    const v14, -0x4247ae14    # -0.09f

    .line 192
    .line 193
    .line 194
    const v15, 0x3f11eb85    # 0.57f

    .line 195
    .line 196
    .line 197
    const v16, -0x435c28f6    # -0.02f

    .line 198
    .line 199
    .line 200
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 201
    .line 202
    .line 203
    const/4 v0, 0x0

    .line 204
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 205
    .line 206
    .line 207
    const v17, -0x41666666    # -0.3f

    .line 208
    .line 209
    .line 210
    const v18, 0x3f9eb852    # 1.24f

    .line 211
    .line 212
    .line 213
    const v13, 0x3ec7ae14    # 0.39f

    .line 214
    .line 215
    .line 216
    const v14, 0x3ecccccd    # 0.4f

    .line 217
    .line 218
    .line 219
    const v15, 0x3e6b851f    # 0.23f

    .line 220
    .line 221
    .line 222
    const v16, 0x3f87ae14    # 1.06f

    .line 223
    .line 224
    .line 225
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 226
    .line 227
    .line 228
    const/high16 v17, 0x41940000    # 18.5f

    .line 229
    .line 230
    const/high16 v18, 0x41b80000    # 23.0f

    .line 231
    .line 232
    const v13, 0x41a15c29    # 20.17f

    .line 233
    .line 234
    .line 235
    const v14, 0x41b6e148    # 22.86f

    .line 236
    .line 237
    .line 238
    const v15, 0x419acccd    # 19.35f

    .line 239
    .line 240
    .line 241
    const/high16 v16, 0x41b80000    # 23.0f

    .line 242
    .line 243
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 244
    .line 245
    .line 246
    const v17, -0x3fe33333    # -2.45f

    .line 247
    .line 248
    .line 249
    const v18, -0x412e147b    # -0.41f

    .line 250
    .line 251
    .line 252
    const v13, -0x40a3d70a    # -0.86f

    .line 253
    .line 254
    .line 255
    const/4 v14, 0x0

    .line 256
    const v15, -0x4028f5c3    # -1.68f

    .line 257
    .line 258
    .line 259
    const v16, -0x41f0a3d7    # -0.14f

    .line 260
    .line 261
    .line 262
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 263
    .line 264
    .line 265
    const v0, 0x402ccccd    # 2.7f

    .line 266
    .line 267
    .line 268
    const v2, 0x418dc28f    # 17.72f

    .line 269
    .line 270
    .line 271
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 272
    .line 273
    .line 274
    const v17, -0x4119999a    # -0.45f

    .line 275
    .line 276
    .line 277
    const v18, -0x408ccccd    # -0.95f

    .line 278
    .line 279
    .line 280
    const v13, -0x413851ec    # -0.39f

    .line 281
    .line 282
    .line 283
    const v14, -0x41f0a3d7    # -0.14f

    .line 284
    .line 285
    .line 286
    const v15, -0x40e8f5c3    # -0.59f

    .line 287
    .line 288
    .line 289
    const v16, -0x40ee147b    # -0.57f

    .line 290
    .line 291
    .line 292
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 293
    .line 294
    .line 295
    const/4 v0, 0x0

    .line 296
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 297
    .line 298
    .line 299
    const v17, 0x3f75c28f    # 0.96f

    .line 300
    .line 301
    .line 302
    const v18, -0x4119999a    # -0.45f

    .line 303
    .line 304
    .line 305
    const v13, 0x3e0f5c29    # 0.14f

    .line 306
    .line 307
    .line 308
    const v14, -0x413851ec    # -0.39f

    .line 309
    .line 310
    .line 311
    const v15, 0x3f11eb85    # 0.57f

    .line 312
    .line 313
    .line 314
    const v16, -0x40e66666    # -0.6f

    .line 315
    .line 316
    .line 317
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 318
    .line 319
    .line 320
    const v0, 0x40c6147b    # 6.19f

    .line 321
    .line 322
    .line 323
    const/high16 v2, 0x40100000    # 2.25f

    .line 324
    .line 325
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 326
    .line 327
    .line 328
    const v0, 0x3fdc28f6    # 1.72f

    .line 329
    .line 330
    .line 331
    const v2, -0x3f71eb85    # -4.44f

    .line 332
    .line 333
    .line 334
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 335
    .line 336
    .line 337
    const v0, 0x40f1999a    # 7.55f

    .line 338
    .line 339
    .line 340
    const v2, 0x41266666    # 10.4f

    .line 341
    .line 342
    .line 343
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 344
    .line 345
    .line 346
    const/high16 v17, 0x41000000    # 8.0f

    .line 347
    .line 348
    const v18, 0x40e8f5c3    # 7.28f

    .line 349
    .line 350
    .line 351
    const v13, 0x40d4cccd    # 6.65f

    .line 352
    .line 353
    .line 354
    const v14, 0x41175c29    # 9.46f

    .line 355
    .line 356
    .line 357
    const v15, 0x40dbd70a    # 6.87f

    .line 358
    .line 359
    .line 360
    const v16, 0x40fdc28f    # 7.93f

    .line 361
    .line 362
    .line 363
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 364
    .line 365
    .line 366
    const v0, 0x405eb852    # 3.48f

    .line 367
    .line 368
    .line 369
    const v2, -0x3fff5c29    # -2.01f

    .line 370
    .line 371
    .line 372
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 373
    .line 374
    .line 375
    const v17, 0x403a3d71    # 2.91f

    .line 376
    .line 377
    .line 378
    const v18, 0x3f8e147b    # 1.11f

    .line 379
    .line 380
    .line 381
    const v13, 0x3f8ccccd    # 1.1f

    .line 382
    .line 383
    .line 384
    const v14, -0x40dc28f6    # -0.64f

    .line 385
    .line 386
    .line 387
    const v15, 0x402147ae    # 2.52f

    .line 388
    .line 389
    .line 390
    const v16, -0x42333333    # -0.1f

    .line 391
    .line 392
    .line 393
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 394
    .line 395
    .line 396
    const v0, 0x3ea8f5c3    # 0.33f

    .line 397
    .line 398
    .line 399
    const v2, 0x3f8a3d71    # 1.08f

    .line 400
    .line 401
    .line 402
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 403
    .line 404
    .line 405
    const v17, 0x40351eb8    # 2.83f

    .line 406
    .line 407
    .line 408
    const v18, 0x4048f5c3    # 3.14f

    .line 409
    .line 410
    .line 411
    const v13, 0x3ee147ae    # 0.44f

    .line 412
    .line 413
    .line 414
    const v14, 0x3fb5c28f    # 1.42f

    .line 415
    .line 416
    .line 417
    const v15, 0x3fbd70a4    # 1.48f

    .line 418
    .line 419
    .line 420
    const v16, 0x40247ae1    # 2.57f

    .line 421
    .line 422
    .line 423
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 424
    .line 425
    .line 426
    const v0, 0x3e947ae1    # 0.29f

    .line 427
    .line 428
    .line 429
    const v2, -0x409c28f6    # -0.89f

    .line 430
    .line 431
    .line 432
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 433
    .line 434
    .line 435
    const v17, 0x3f70a3d7    # 0.94f

    .line 436
    .line 437
    .line 438
    const v18, -0x410a3d71    # -0.48f

    .line 439
    .line 440
    .line 441
    const v13, 0x3e051eb8    # 0.13f

    .line 442
    .line 443
    .line 444
    const v14, -0x413851ec    # -0.39f

    .line 445
    .line 446
    .line 447
    const v15, 0x3f0ccccd    # 0.55f

    .line 448
    .line 449
    .line 450
    const v16, -0x40e3d70a    # -0.61f

    .line 451
    .line 452
    .line 453
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 454
    .line 455
    .line 456
    const/4 v0, 0x0

    .line 457
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 458
    .line 459
    .line 460
    const v17, 0x3ef5c28f    # 0.48f

    .line 461
    .line 462
    .line 463
    const v18, 0x3f733333    # 0.95f

    .line 464
    .line 465
    .line 466
    const v13, 0x3ecccccd    # 0.4f

    .line 467
    .line 468
    .line 469
    const v14, 0x3e051eb8    # 0.13f

    .line 470
    .line 471
    .line 472
    const v15, 0x3f1c28f6    # 0.61f

    .line 473
    .line 474
    .line 475
    const v16, 0x3f0ccccd    # 0.55f

    .line 476
    .line 477
    .line 478
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 479
    .line 480
    .line 481
    const v0, -0x40e66666    # -0.6f

    .line 482
    .line 483
    .line 484
    const v2, 0x3feccccd    # 1.85f

    .line 485
    .line 486
    .line 487
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 488
    .line 489
    .line 490
    const v17, -0x406147ae    # -1.24f

    .line 491
    .line 492
    .line 493
    const v18, 0x3f266666    # 0.65f

    .line 494
    .line 495
    .line 496
    const v13, -0x41d1eb85    # -0.17f

    .line 497
    .line 498
    .line 499
    const v14, 0x3f051eb8    # 0.52f

    .line 500
    .line 501
    .line 502
    const v15, -0x40c7ae14    # -0.72f

    .line 503
    .line 504
    .line 505
    const v16, 0x3f51eb85    # 0.82f

    .line 506
    .line 507
    .line 508
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 509
    .line 510
    .line 511
    const v17, -0x3f728f5c    # -4.42f

    .line 512
    .line 513
    .line 514
    const v18, -0x3f7ccccd    # -4.1f

    .line 515
    .line 516
    .line 517
    const v13, -0x3ffeb852    # -2.02f

    .line 518
    .line 519
    .line 520
    const v14, -0x40deb852    # -0.63f

    .line 521
    .line 522
    .line 523
    const v15, -0x3f970a3d    # -3.64f

    .line 524
    .line 525
    .line 526
    const v16, -0x3ff66666    # -2.15f

    .line 527
    .line 528
    .line 529
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 530
    .line 531
    .line 532
    const v0, -0x3fde147b    # -2.53f

    .line 533
    .line 534
    .line 535
    const v2, 0x3fb9999a    # 1.45f

    .line 536
    .line 537
    .line 538
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 539
    .line 540
    .line 541
    const v0, 0x400eb852    # 2.23f

    .line 542
    .line 543
    .line 544
    const v2, 0x40233333    # 2.55f

    .line 545
    .line 546
    .line 547
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 548
    .line 549
    .line 550
    const v17, 0x3eb851ec    # 0.36f

    .line 551
    .line 552
    .line 553
    const v18, 0x40028f5c    # 2.04f

    .line 554
    .line 555
    .line 556
    const v13, 0x3efae148    # 0.49f

    .line 557
    .line 558
    .line 559
    const v14, 0x3f0f5c29    # 0.56f

    .line 560
    .line 561
    .line 562
    const v15, 0x3f2147ae    # 0.63f

    .line 563
    .line 564
    .line 565
    const v16, 0x3fab851f    # 1.34f

    .line 566
    .line 567
    .line 568
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 569
    .line 570
    .line 571
    const v0, -0x401c28f6    # -1.78f

    .line 572
    .line 573
    .line 574
    const v2, 0x409428f6    # 4.63f

    .line 575
    .line 576
    .line 577
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 578
    .line 579
    .line 580
    const v0, 0x4045c28f    # 3.09f

    .line 581
    .line 582
    .line 583
    const v2, 0x3f8f5c29    # 1.12f

    .line 584
    .line 585
    .line 586
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 587
    .line 588
    .line 589
    const v0, 0x40066666    # 2.1f

    .line 590
    .line 591
    .line 592
    const v2, -0x3f31eb85    # -6.44f

    .line 593
    .line 594
    .line 595
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 596
    .line 597
    .line 598
    const/4 v0, 0x0

    .line 599
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 600
    .line 601
    .line 602
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 603
    .line 604
    .line 605
    const v17, 0x3fb851ec    # 1.44f

    .line 606
    .line 607
    .line 608
    const v18, 0x3ed1eb85    # 0.41f

    .line 609
    .line 610
    .line 611
    const v13, 0x3eeb851f    # 0.46f

    .line 612
    .line 613
    .line 614
    const v14, 0x3e3851ec    # 0.18f

    .line 615
    .line 616
    .line 617
    const v15, 0x3f70a3d7    # 0.94f

    .line 618
    .line 619
    .line 620
    const v16, 0x3e9eb852    # 0.31f

    .line 621
    .line 622
    .line 623
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 624
    .line 625
    .line 626
    const v0, 0x41a73333    # 20.9f

    .line 627
    .line 628
    .line 629
    const v2, 0x417c7ae1    # 15.78f

    .line 630
    .line 631
    .line 632
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 633
    .line 634
    .line 635
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 636
    .line 637
    .line 638
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 639
    .line 640
    .line 641
    move-result-object v2

    .line 642
    const/16 v16, 0x3800

    .line 643
    .line 644
    const/16 v17, 0x0

    .line 645
    .line 646
    const/high16 v6, 0x3f800000    # 1.0f

    .line 647
    .line 648
    const/high16 v8, 0x3f800000    # 1.0f

    .line 649
    .line 650
    const/4 v7, 0x0

    .line 651
    const/high16 v9, 0x3f800000    # 1.0f

    .line 652
    .line 653
    const/high16 v12, 0x3f800000    # 1.0f

    .line 654
    .line 655
    const/4 v13, 0x0

    .line 656
    const/4 v14, 0x0

    .line 657
    const/4 v15, 0x0

    .line 658
    const-string v4, ""

    .line 659
    .line 660
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 661
    .line 662
    .line 663
    move-result-object v0

    .line 664
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 665
    .line 666
    .line 667
    move-result-object v0

    .line 668
    sput-object v0, Landroidx/compose/material/icons/rounded/DownhillSkiingKt;->_downhillSkiing:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 669
    .line 670
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 671
    .line 672
    .line 673
    return-object v0
.end method
