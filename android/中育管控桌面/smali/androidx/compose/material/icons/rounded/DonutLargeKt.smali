.class public final Landroidx/compose/material/icons/rounded/DonutLargeKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_donutLarge",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "DonutLarge",
        "Landroidx/compose/material/icons/Icons$Rounded;",
        "getDonutLarge",
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
        "SMAP\nDonutLarge.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DonutLarge.kt\nandroidx/compose/material/icons/rounded/DonutLargeKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,68:1\n212#2,12:69\n233#2,18:82\n253#2:119\n174#3:81\n705#4,2:100\n717#4,2:102\n719#4,11:108\n72#5,4:104\n*S KotlinDebug\n*F\n+ 1 DonutLarge.kt\nandroidx/compose/material/icons/rounded/DonutLargeKt\n*L\n29#1:69,12\n30#1:82,18\n30#1:119\n29#1:81\n30#1:100,2\n30#1:102,2\n30#1:108,11\n30#1:104,4\n*E\n"
    }
.end annotation


# static fields
.field private static _donutLarge:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getDonutLarge(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/DonutLargeKt;->_donutLarge:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.DonutLarge"

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
    const v0, 0x40aa3d71    # 5.32f

    .line 71
    .line 72
    .line 73
    const v2, 0x41611eb8    # 14.07f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v17, 0x419570a4    # 18.68f

    .line 80
    .line 81
    .line 82
    const v18, 0x411ee148    # 9.93f

    .line 83
    .line 84
    .line 85
    const v13, 0x4182147b    # 16.26f

    .line 86
    .line 87
    .line 88
    const/high16 v14, 0x40c00000    # 6.0f

    .line 89
    .line 90
    const/high16 v15, 0x41900000    # 18.0f

    .line 91
    .line 92
    const v16, 0x40f7ae14    # 7.74f

    .line 93
    .line 94
    .line 95
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 96
    .line 97
    .line 98
    const v17, 0x3fb47ae1    # 1.41f

    .line 99
    .line 100
    .line 101
    const v18, 0x3f88f5c3    # 1.07f

    .line 102
    .line 103
    .line 104
    const v13, 0x3e428f5c    # 0.19f

    .line 105
    .line 106
    .line 107
    const v14, 0x3f2147ae    # 0.63f

    .line 108
    .line 109
    .line 110
    const v15, 0x3f428f5c    # 0.76f

    .line 111
    .line 112
    .line 113
    const v16, 0x3f88f5c3    # 1.07f

    .line 114
    .line 115
    .line 116
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 117
    .line 118
    .line 119
    const v0, 0x3d23d70a    # 0.04f

    .line 120
    .line 121
    .line 122
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 123
    .line 124
    .line 125
    const v17, 0x3fb70a3d    # 1.43f

    .line 126
    .line 127
    .line 128
    const v18, -0x400b851f    # -1.91f

    .line 129
    .line 130
    .line 131
    const/high16 v13, 0x3f800000    # 1.0f

    .line 132
    .line 133
    const/4 v14, 0x0

    .line 134
    const v15, 0x3fdc28f6    # 1.72f

    .line 135
    .line 136
    .line 137
    const v16, -0x408a3d71    # -0.96f

    .line 138
    .line 139
    .line 140
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 141
    .line 142
    .line 143
    const v17, -0x3f2ae148    # -6.66f

    .line 144
    .line 145
    .line 146
    const v18, -0x3f2ae148    # -6.66f

    .line 147
    .line 148
    .line 149
    const v13, -0x4087ae14    # -0.97f

    .line 150
    .line 151
    .line 152
    const v14, -0x3fb47ae1    # -3.18f

    .line 153
    .line 154
    .line 155
    const v15, -0x3fa147ae    # -3.48f

    .line 156
    .line 157
    .line 158
    const v16, -0x3f49eb85    # -5.69f

    .line 159
    .line 160
    .line 161
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 162
    .line 163
    .line 164
    const v17, -0x400ccccd    # -1.9f

    .line 165
    .line 166
    .line 167
    const v18, 0x3fb70a3d    # 1.43f

    .line 168
    .line 169
    .line 170
    const v13, -0x408f5c29    # -0.94f

    .line 171
    .line 172
    .line 173
    const v14, -0x416b851f    # -0.29f

    .line 174
    .line 175
    .line 176
    const v15, -0x400ccccd    # -1.9f

    .line 177
    .line 178
    .line 179
    const v16, 0x3edc28f6    # 0.43f

    .line 180
    .line 181
    .line 182
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 183
    .line 184
    .line 185
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 186
    .line 187
    .line 188
    const v17, 0x3f88f5c3    # 1.07f

    .line 189
    .line 190
    .line 191
    const v18, 0x3fb5c28f    # 1.42f

    .line 192
    .line 193
    .line 194
    const/4 v13, 0x0

    .line 195
    const v14, 0x3f28f5c3    # 0.66f

    .line 196
    .line 197
    .line 198
    const v15, 0x3ee147ae    # 0.44f

    .line 199
    .line 200
    .line 201
    const v16, 0x3f9d70a4    # 1.23f

    .line 202
    .line 203
    .line 204
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 205
    .line 206
    .line 207
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 208
    .line 209
    .line 210
    const v0, 0x419570a4    # 18.68f

    .line 211
    .line 212
    .line 213
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 214
    .line 215
    .line 216
    const v17, -0x3f6c7ae1    # -4.61f

    .line 217
    .line 218
    .line 219
    const v18, 0x4093851f    # 4.61f

    .line 220
    .line 221
    .line 222
    const v13, -0x40d1eb85    # -0.68f

    .line 223
    .line 224
    .line 225
    const v14, 0x400ccccd    # 2.2f

    .line 226
    .line 227
    .line 228
    const v15, -0x3fe51eb8    # -2.42f

    .line 229
    .line 230
    .line 231
    const v16, 0x407b851f    # 3.93f

    .line 232
    .line 233
    .line 234
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 235
    .line 236
    .line 237
    const v17, -0x40770a3d    # -1.07f

    .line 238
    .line 239
    .line 240
    const v18, 0x3fb47ae1    # 1.41f

    .line 241
    .line 242
    .line 243
    const v13, -0x40deb852    # -0.63f

    .line 244
    .line 245
    .line 246
    const v14, 0x3e428f5c    # 0.19f

    .line 247
    .line 248
    .line 249
    const v15, -0x40770a3d    # -1.07f

    .line 250
    .line 251
    .line 252
    const v16, 0x3f428f5c    # 0.76f

    .line 253
    .line 254
    .line 255
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 256
    .line 257
    .line 258
    const v0, 0x3d23d70a    # 0.04f

    .line 259
    .line 260
    .line 261
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 262
    .line 263
    .line 264
    const v17, 0x3ff47ae1    # 1.91f

    .line 265
    .line 266
    .line 267
    const v18, 0x3fb70a3d    # 1.43f

    .line 268
    .line 269
    .line 270
    const/4 v13, 0x0

    .line 271
    const/high16 v14, 0x3f800000    # 1.0f

    .line 272
    .line 273
    const v15, 0x3f75c28f    # 0.96f

    .line 274
    .line 275
    .line 276
    const v16, 0x3fdc28f6    # 1.72f

    .line 277
    .line 278
    .line 279
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 280
    .line 281
    .line 282
    const v17, 0x40d51eb8    # 6.66f

    .line 283
    .line 284
    .line 285
    const v18, -0x3f2ae148    # -6.66f

    .line 286
    .line 287
    .line 288
    const v13, 0x404b851f    # 3.18f

    .line 289
    .line 290
    .line 291
    const v14, -0x4087ae14    # -0.97f

    .line 292
    .line 293
    .line 294
    const v15, 0x40b6147b    # 5.69f

    .line 295
    .line 296
    .line 297
    const v16, -0x3fa147ae    # -3.48f

    .line 298
    .line 299
    .line 300
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 301
    .line 302
    .line 303
    const v17, -0x404a3d71    # -1.42f

    .line 304
    .line 305
    .line 306
    const v18, -0x400b851f    # -1.91f

    .line 307
    .line 308
    .line 309
    const v13, 0x3e947ae1    # 0.29f

    .line 310
    .line 311
    .line 312
    const v14, -0x408ccccd    # -0.95f

    .line 313
    .line 314
    .line 315
    const v15, -0x4123d70a    # -0.43f

    .line 316
    .line 317
    .line 318
    const v16, -0x400b851f    # -1.91f

    .line 319
    .line 320
    .line 321
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 322
    .line 323
    .line 324
    const v0, -0x42b33333    # -0.05f

    .line 325
    .line 326
    .line 327
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 328
    .line 329
    .line 330
    const v18, 0x3f8a3d71    # 1.08f

    .line 331
    .line 332
    .line 333
    const v13, -0x40d70a3d    # -0.66f

    .line 334
    .line 335
    .line 336
    const v14, 0x3c23d70a    # 0.01f

    .line 337
    .line 338
    .line 339
    const v15, -0x40628f5c    # -1.23f

    .line 340
    .line 341
    .line 342
    const v16, 0x3ee66666    # 0.45f

    .line 343
    .line 344
    .line 345
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 346
    .line 347
    .line 348
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 349
    .line 350
    .line 351
    const/high16 v0, 0x41300000    # 11.0f

    .line 352
    .line 353
    const v2, 0x41a0e148    # 20.11f

    .line 354
    .line 355
    .line 356
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 357
    .line 358
    .line 359
    const v17, -0x40747ae1    # -1.09f

    .line 360
    .line 361
    .line 362
    const v18, -0x4047ae14    # -1.44f

    .line 363
    .line 364
    .line 365
    const/4 v13, 0x0

    .line 366
    const v14, -0x40d47ae1    # -0.67f

    .line 367
    .line 368
    .line 369
    const v15, -0x4119999a    # -0.45f

    .line 370
    .line 371
    .line 372
    const v16, -0x406147ae    # -1.24f

    .line 373
    .line 374
    .line 375
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 376
    .line 377
    .line 378
    const/high16 v17, 0x40a00000    # 5.0f

    .line 379
    .line 380
    const/high16 v18, 0x41400000    # 12.0f

    .line 381
    .line 382
    const v13, 0x40e23d71    # 7.07f

    .line 383
    .line 384
    .line 385
    const v14, 0x418e3d71    # 17.78f

    .line 386
    .line 387
    .line 388
    const/high16 v15, 0x40a00000    # 5.0f

    .line 389
    .line 390
    const v16, 0x4172147b    # 15.13f

    .line 391
    .line 392
    .line 393
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 394
    .line 395
    .line 396
    const v0, 0x409d1eb8    # 4.91f

    .line 397
    .line 398
    .line 399
    const v2, -0x3f2a8f5c    # -6.67f

    .line 400
    .line 401
    .line 402
    const v4, 0x40047ae1    # 2.07f

    .line 403
    .line 404
    .line 405
    const v6, -0x3f470a3d    # -5.78f

    .line 406
    .line 407
    .line 408
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 409
    .line 410
    .line 411
    const v17, 0x3f8b851f    # 1.09f

    .line 412
    .line 413
    .line 414
    const v18, -0x4047ae14    # -1.44f

    .line 415
    .line 416
    .line 417
    const v13, 0x3f23d70a    # 0.64f

    .line 418
    .line 419
    .line 420
    const v14, -0x41b33333    # -0.2f

    .line 421
    .line 422
    .line 423
    const v15, 0x3f8b851f    # 1.09f

    .line 424
    .line 425
    .line 426
    const v16, -0x40bae148    # -0.77f

    .line 427
    .line 428
    .line 429
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 430
    .line 431
    .line 432
    const v0, -0x43dc28f6    # -0.01f

    .line 433
    .line 434
    .line 435
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 436
    .line 437
    .line 438
    const v17, -0x4008f5c3    # -1.93f

    .line 439
    .line 440
    .line 441
    const/4 v13, 0x0

    .line 442
    const/high16 v14, -0x40800000    # -1.0f

    .line 443
    .line 444
    const v15, -0x4087ae14    # -0.97f

    .line 445
    .line 446
    .line 447
    const v16, -0x402147ae    # -1.74f

    .line 448
    .line 449
    .line 450
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 451
    .line 452
    .line 453
    const/high16 v17, 0x40000000    # 2.0f

    .line 454
    .line 455
    const/high16 v18, 0x41400000    # 12.0f

    .line 456
    .line 457
    const v13, 0x409f5c29    # 4.98f

    .line 458
    .line 459
    .line 460
    const v14, 0x406c28f6    # 3.69f

    .line 461
    .line 462
    .line 463
    const/high16 v15, 0x40000000    # 2.0f

    .line 464
    .line 465
    const/high16 v16, 0x40f00000    # 7.5f

    .line 466
    .line 467
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 468
    .line 469
    .line 470
    const v17, 0x40e23d71    # 7.07f

    .line 471
    .line 472
    .line 473
    const v18, 0x4118f5c3    # 9.56f

    .line 474
    .line 475
    .line 476
    const/4 v13, 0x0

    .line 477
    const/high16 v14, 0x40900000    # 4.5f

    .line 478
    .line 479
    const v15, 0x403eb852    # 2.98f

    .line 480
    .line 481
    .line 482
    const v16, 0x4104f5c3    # 8.31f

    .line 483
    .line 484
    .line 485
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 486
    .line 487
    .line 488
    const v17, 0x3ff70a3d    # 1.93f

    .line 489
    .line 490
    .line 491
    const v18, -0x40466666    # -1.45f

    .line 492
    .line 493
    .line 494
    const v13, 0x3f75c28f    # 0.96f

    .line 495
    .line 496
    .line 497
    const v14, 0x3e99999a    # 0.3f

    .line 498
    .line 499
    .line 500
    const v15, 0x3ff70a3d    # 1.93f

    .line 501
    .line 502
    .line 503
    const v16, -0x411eb852    # -0.44f

    .line 504
    .line 505
    .line 506
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 507
    .line 508
    .line 509
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 510
    .line 511
    .line 512
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 513
    .line 514
    .line 515
    move-result-object v2

    .line 516
    const/16 v16, 0x3800

    .line 517
    .line 518
    const/16 v17, 0x0

    .line 519
    .line 520
    const/high16 v6, 0x3f800000    # 1.0f

    .line 521
    .line 522
    const/high16 v8, 0x3f800000    # 1.0f

    .line 523
    .line 524
    const/4 v7, 0x0

    .line 525
    const/high16 v9, 0x3f800000    # 1.0f

    .line 526
    .line 527
    const/high16 v12, 0x3f800000    # 1.0f

    .line 528
    .line 529
    const/4 v13, 0x0

    .line 530
    const/4 v14, 0x0

    .line 531
    const/4 v15, 0x0

    .line 532
    const-string v4, ""

    .line 533
    .line 534
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 535
    .line 536
    .line 537
    move-result-object v0

    .line 538
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 539
    .line 540
    .line 541
    move-result-object v0

    .line 542
    sput-object v0, Landroidx/compose/material/icons/rounded/DonutLargeKt;->_donutLarge:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 543
    .line 544
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 545
    .line 546
    .line 547
    return-object v0
.end method
