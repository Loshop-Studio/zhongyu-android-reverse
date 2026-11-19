.class public final Landroidx/compose/material/icons/outlined/CurrencyExchangeKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_currencyExchange",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "CurrencyExchange",
        "Landroidx/compose/material/icons/Icons$Outlined;",
        "getCurrencyExchange",
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
        "SMAP\nCurrencyExchange.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CurrencyExchange.kt\nandroidx/compose/material/icons/outlined/CurrencyExchangeKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,85:1\n212#2,12:86\n233#2,18:99\n253#2:136\n174#3:98\n705#4,2:117\n717#4,2:119\n719#4,11:125\n72#5,4:121\n*S KotlinDebug\n*F\n+ 1 CurrencyExchange.kt\nandroidx/compose/material/icons/outlined/CurrencyExchangeKt\n*L\n29#1:86,12\n30#1:99,18\n30#1:136\n29#1:98\n30#1:117,2\n30#1:119,2\n30#1:125,11\n30#1:121,4\n*E\n"
    }
.end annotation


# static fields
.field private static _currencyExchange:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getCurrencyExchange(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/outlined/CurrencyExchangeKt;->_currencyExchange:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Outlined.CurrencyExchange"

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
    const v0, 0x414e3d71    # 12.89f

    .line 71
    .line 72
    .line 73
    const v2, 0x4131999a    # 11.1f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v17, -0x3fd70a3d    # -2.64f

    .line 80
    .line 81
    .line 82
    const v18, -0x400ccccd    # -1.9f

    .line 83
    .line 84
    .line 85
    const v13, -0x401c28f6    # -1.78f

    .line 86
    .line 87
    .line 88
    const v14, -0x40e8f5c3    # -0.59f

    .line 89
    .line 90
    .line 91
    const v15, -0x3fd70a3d    # -2.64f

    .line 92
    .line 93
    .line 94
    const v16, -0x408a3d71    # -0.96f

    .line 95
    .line 96
    .line 97
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 98
    .line 99
    .line 100
    const v17, 0x3fe7ae14    # 1.81f

    .line 101
    .line 102
    .line 103
    const v18, -0x404e147b    # -1.39f

    .line 104
    .line 105
    .line 106
    const/4 v13, 0x0

    .line 107
    const v14, -0x407d70a4    # -1.02f

    .line 108
    .line 109
    .line 110
    const v15, 0x3f8e147b    # 1.11f

    .line 111
    .line 112
    .line 113
    const v16, -0x404e147b    # -1.39f

    .line 114
    .line 115
    .line 116
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 117
    .line 118
    .line 119
    const v17, 0x3ff33333    # 1.9f

    .line 120
    .line 121
    .line 122
    const v18, 0x3fab851f    # 1.34f

    .line 123
    .line 124
    .line 125
    const v13, 0x3fa7ae14    # 1.31f

    .line 126
    .line 127
    .line 128
    const/4 v14, 0x0

    .line 129
    const v15, 0x3fe51eb8    # 1.79f

    .line 130
    .line 131
    .line 132
    const v16, 0x3f7d70a4    # 0.99f

    .line 133
    .line 134
    .line 135
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 136
    .line 137
    .line 138
    const v0, 0x3fca3d71    # 1.58f

    .line 139
    .line 140
    .line 141
    const v2, -0x40d47ae1    # -0.67f

    .line 142
    .line 143
    .line 144
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 145
    .line 146
    .line 147
    const/high16 v17, 0x41500000    # 13.0f

    .line 148
    .line 149
    const v18, 0x40c7ae14    # 6.24f

    .line 150
    .line 151
    .line 152
    const v13, 0x41763d71    # 15.39f

    .line 153
    .line 154
    .line 155
    const v14, 0x41007ae1    # 8.03f

    .line 156
    .line 157
    .line 158
    const v15, 0x416b851f    # 14.72f

    .line 159
    .line 160
    .line 161
    const v16, 0x40d1eb85    # 6.56f

    .line 162
    .line 163
    .line 164
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 165
    .line 166
    .line 167
    const/high16 v0, 0x40a00000    # 5.0f

    .line 168
    .line 169
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 170
    .line 171
    .line 172
    const/high16 v0, -0x40000000    # -2.0f

    .line 173
    .line 174
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 175
    .line 176
    .line 177
    const v0, 0x3fa147ae    # 1.26f

    .line 178
    .line 179
    .line 180
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 181
    .line 182
    .line 183
    const v17, 0x410828f6    # 8.51f

    .line 184
    .line 185
    .line 186
    const v18, 0x4113851f    # 9.22f

    .line 187
    .line 188
    .line 189
    const v13, 0x410851ec    # 8.52f

    .line 190
    .line 191
    .line 192
    const v14, 0x40da3d71    # 6.82f

    .line 193
    .line 194
    .line 195
    const v15, 0x410828f6    # 8.51f

    .line 196
    .line 197
    .line 198
    const v16, 0x4111eb85    # 9.12f

    .line 199
    .line 200
    .line 201
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 202
    .line 203
    .line 204
    const v17, 0x40566666    # 3.35f

    .line 205
    .line 206
    .line 207
    const v18, 0x4053d70a    # 3.31f

    .line 208
    .line 209
    .line 210
    const/4 v13, 0x0

    .line 211
    const v14, 0x401147ae    # 2.27f

    .line 212
    .line 213
    .line 214
    const/high16 v15, 0x40100000    # 2.25f

    .line 215
    .line 216
    const v16, 0x403a3d71    # 2.91f

    .line 217
    .line 218
    .line 219
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 220
    .line 221
    .line 222
    const v17, 0x4011eb85    # 2.28f

    .line 223
    .line 224
    .line 225
    const v18, 0x4001eb85    # 2.03f

    .line 226
    .line 227
    .line 228
    const v13, 0x3fca3d71    # 1.58f

    .line 229
    .line 230
    .line 231
    const v14, 0x3f0f5c29    # 0.56f

    .line 232
    .line 233
    .line 234
    const v15, 0x4011eb85    # 2.28f

    .line 235
    .line 236
    .line 237
    const v16, 0x3f88f5c3    # 1.07f

    .line 238
    .line 239
    .line 240
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 241
    .line 242
    .line 243
    const v17, -0x40028f5c    # -1.98f

    .line 244
    .line 245
    .line 246
    const v18, 0x3fce147b    # 1.61f

    .line 247
    .line 248
    .line 249
    const/4 v13, 0x0

    .line 250
    const v14, 0x3f90a3d7    # 1.13f

    .line 251
    .line 252
    .line 253
    const v15, -0x4079999a    # -1.05f

    .line 254
    .line 255
    .line 256
    const v16, 0x3fce147b    # 1.61f

    .line 257
    .line 258
    .line 259
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 260
    .line 261
    .line 262
    const v17, -0x3fe66666    # -2.4f

    .line 263
    .line 264
    .line 265
    const v18, -0x3ffa3d71    # -2.09f

    .line 266
    .line 267
    .line 268
    const v13, -0x40170a3d    # -1.82f

    .line 269
    .line 270
    .line 271
    const/4 v14, 0x0

    .line 272
    const v15, -0x3fea3d71    # -2.34f

    .line 273
    .line 274
    .line 275
    const v16, -0x4010a3d7    # -1.87f

    .line 276
    .line 277
    .line 278
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 279
    .line 280
    .line 281
    const v0, 0x4101999a    # 8.1f

    .line 282
    .line 283
    .line 284
    const/high16 v2, 0x416c0000    # 14.75f

    .line 285
    .line 286
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 287
    .line 288
    .line 289
    const v17, 0x4039999a    # 2.9f

    .line 290
    .line 291
    .line 292
    const v18, 0x403d70a4    # 2.96f

    .line 293
    .line 294
    .line 295
    const v13, 0x3f2147ae    # 0.63f

    .line 296
    .line 297
    .line 298
    const v14, 0x400c28f6    # 2.19f

    .line 299
    .line 300
    .line 301
    const v15, 0x4011eb85    # 2.28f

    .line 302
    .line 303
    .line 304
    const v16, 0x4031eb85    # 2.78f

    .line 305
    .line 306
    .line 307
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 308
    .line 309
    .line 310
    const/high16 v0, 0x41980000    # 19.0f

    .line 311
    .line 312
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 313
    .line 314
    .line 315
    const/high16 v0, 0x40000000    # 2.0f

    .line 316
    .line 317
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 318
    .line 319
    .line 320
    const v0, -0x406147ae    # -1.24f

    .line 321
    .line 322
    .line 323
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 324
    .line 325
    .line 326
    const v18, -0x3fb1eb85    # -3.22f

    .line 327
    .line 328
    .line 329
    const v13, 0x3ecccccd    # 0.4f

    .line 330
    .line 331
    .line 332
    const v14, -0x4247ae14    # -0.09f

    .line 333
    .line 334
    .line 335
    const v15, 0x4039999a    # 2.9f

    .line 336
    .line 337
    .line 338
    const v16, -0x40e8f5c3    # -0.59f

    .line 339
    .line 340
    .line 341
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 342
    .line 343
    .line 344
    const v17, 0x414e3d71    # 12.89f

    .line 345
    .line 346
    .line 347
    const v18, 0x4131999a    # 11.1f

    .line 348
    .line 349
    .line 350
    const v13, 0x417e6666    # 15.9f

    .line 351
    .line 352
    .line 353
    const v14, 0x41526666    # 13.15f

    .line 354
    .line 355
    .line 356
    const v15, 0x4174a3d7    # 15.29f

    .line 357
    .line 358
    .line 359
    const v16, 0x413ee148    # 11.93f

    .line 360
    .line 361
    .line 362
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 363
    .line 364
    .line 365
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 366
    .line 367
    .line 368
    const/high16 v0, 0x41a80000    # 21.0f

    .line 369
    .line 370
    const/high16 v2, 0x40400000    # 3.0f

    .line 371
    .line 372
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 373
    .line 374
    .line 375
    const/high16 v0, 0x3f800000    # 1.0f

    .line 376
    .line 377
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 378
    .line 379
    .line 380
    const/high16 v0, -0x3f400000    # -6.0f

    .line 381
    .line 382
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 383
    .line 384
    .line 385
    const/high16 v0, 0x40c00000    # 6.0f

    .line 386
    .line 387
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 388
    .line 389
    .line 390
    const/high16 v0, 0x40000000    # 2.0f

    .line 391
    .line 392
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 393
    .line 394
    .line 395
    const v0, -0x3fe147ae    # -2.48f

    .line 396
    .line 397
    .line 398
    const/4 v2, 0x0

    .line 399
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 400
    .line 401
    .line 402
    const v17, 0x40ef5c29    # 7.48f

    .line 403
    .line 404
    .line 405
    const/high16 v18, 0x40800000    # 4.0f

    .line 406
    .line 407
    const v13, 0x3fce147b    # 1.61f

    .line 408
    .line 409
    .line 410
    const v14, 0x401a3d71    # 2.41f

    .line 411
    .line 412
    .line 413
    const v15, 0x408b851f    # 4.36f

    .line 414
    .line 415
    .line 416
    const/high16 v16, 0x40800000    # 4.0f

    .line 417
    .line 418
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 419
    .line 420
    .line 421
    const/high16 v17, 0x41100000    # 9.0f

    .line 422
    .line 423
    const/high16 v18, -0x3ef00000    # -9.0f

    .line 424
    .line 425
    const v13, 0x409f0a3d    # 4.97f

    .line 426
    .line 427
    .line 428
    const/4 v14, 0x0

    .line 429
    const/high16 v15, 0x41100000    # 9.0f

    .line 430
    .line 431
    const v16, -0x3f7f0a3d    # -4.03f

    .line 432
    .line 433
    .line 434
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 435
    .line 436
    .line 437
    const/high16 v0, 0x40000000    # 2.0f

    .line 438
    .line 439
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 440
    .line 441
    .line 442
    const/high16 v17, -0x3ed00000    # -11.0f

    .line 443
    .line 444
    const/high16 v18, 0x41300000    # 11.0f

    .line 445
    .line 446
    const/4 v13, 0x0

    .line 447
    const v14, 0x40c28f5c    # 6.08f

    .line 448
    .line 449
    .line 450
    const v15, -0x3f628f5c    # -4.92f

    .line 451
    .line 452
    .line 453
    const/high16 v16, 0x41300000    # 11.0f

    .line 454
    .line 455
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 456
    .line 457
    .line 458
    const/high16 v17, -0x3ef00000    # -9.0f

    .line 459
    .line 460
    const v18, -0x3f6a8f5c    # -4.67f

    .line 461
    .line 462
    .line 463
    const v13, -0x3f91eb85    # -3.72f

    .line 464
    .line 465
    .line 466
    const/4 v14, 0x0

    .line 467
    const v15, -0x3f1fae14    # -7.01f

    .line 468
    .line 469
    .line 470
    const v16, -0x40133333    # -1.85f

    .line 471
    .line 472
    .line 473
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 474
    .line 475
    .line 476
    const/high16 v0, 0x41a80000    # 21.0f

    .line 477
    .line 478
    const/high16 v2, 0x40400000    # 3.0f

    .line 479
    .line 480
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 481
    .line 482
    .line 483
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 484
    .line 485
    .line 486
    const/high16 v0, 0x41400000    # 12.0f

    .line 487
    .line 488
    const/high16 v2, 0x3f800000    # 1.0f

    .line 489
    .line 490
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 491
    .line 492
    .line 493
    const/high16 v17, 0x41400000    # 12.0f

    .line 494
    .line 495
    const/high16 v18, 0x3f800000    # 1.0f

    .line 496
    .line 497
    const/high16 v13, 0x3f800000    # 1.0f

    .line 498
    .line 499
    const v14, 0x40bd70a4    # 5.92f

    .line 500
    .line 501
    .line 502
    const v15, 0x40bd70a4    # 5.92f

    .line 503
    .line 504
    .line 505
    const/high16 v16, 0x3f800000    # 1.0f

    .line 506
    .line 507
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 508
    .line 509
    .line 510
    const/high16 v17, 0x41100000    # 9.0f

    .line 511
    .line 512
    const v18, 0x409570a4    # 4.67f

    .line 513
    .line 514
    .line 515
    const v13, 0x406e147b    # 3.72f

    .line 516
    .line 517
    .line 518
    const/4 v14, 0x0

    .line 519
    const v15, 0x40e051ec    # 7.01f

    .line 520
    .line 521
    .line 522
    const v16, 0x3feccccd    # 1.85f

    .line 523
    .line 524
    .line 525
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 526
    .line 527
    .line 528
    const/high16 v0, 0x41a80000    # 21.0f

    .line 529
    .line 530
    const/high16 v2, 0x40400000    # 3.0f

    .line 531
    .line 532
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 533
    .line 534
    .line 535
    const/high16 v0, 0x40000000    # 2.0f

    .line 536
    .line 537
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 538
    .line 539
    .line 540
    const/high16 v0, 0x40c00000    # 6.0f

    .line 541
    .line 542
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 543
    .line 544
    .line 545
    const/high16 v0, -0x3f400000    # -6.0f

    .line 546
    .line 547
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 548
    .line 549
    .line 550
    const/high16 v0, 0x40e00000    # 7.0f

    .line 551
    .line 552
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 553
    .line 554
    .line 555
    const v0, 0x401eb852    # 2.48f

    .line 556
    .line 557
    .line 558
    const/4 v2, 0x0

    .line 559
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 560
    .line 561
    .line 562
    const/high16 v17, 0x41400000    # 12.0f

    .line 563
    .line 564
    const/high16 v18, 0x40400000    # 3.0f

    .line 565
    .line 566
    const v13, 0x418ef5c3    # 17.87f

    .line 567
    .line 568
    .line 569
    const v14, 0x4092e148    # 4.59f

    .line 570
    .line 571
    .line 572
    const v15, 0x4171eb85    # 15.12f

    .line 573
    .line 574
    .line 575
    const/high16 v16, 0x40400000    # 3.0f

    .line 576
    .line 577
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 578
    .line 579
    .line 580
    const/high16 v17, -0x3ef00000    # -9.0f

    .line 581
    .line 582
    const/high16 v18, 0x41100000    # 9.0f

    .line 583
    .line 584
    const v13, -0x3f60f5c3    # -4.97f

    .line 585
    .line 586
    .line 587
    const/4 v14, 0x0

    .line 588
    const/high16 v15, -0x3ef00000    # -9.0f

    .line 589
    .line 590
    const v16, 0x4080f5c3    # 4.03f

    .line 591
    .line 592
    .line 593
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 594
    .line 595
    .line 596
    const/high16 v0, 0x3f800000    # 1.0f

    .line 597
    .line 598
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 599
    .line 600
    .line 601
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 602
    .line 603
    .line 604
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 605
    .line 606
    .line 607
    move-result-object v2

    .line 608
    const/16 v16, 0x3800

    .line 609
    .line 610
    const/16 v17, 0x0

    .line 611
    .line 612
    const/high16 v6, 0x3f800000    # 1.0f

    .line 613
    .line 614
    const/high16 v8, 0x3f800000    # 1.0f

    .line 615
    .line 616
    const/4 v7, 0x0

    .line 617
    const/high16 v9, 0x3f800000    # 1.0f

    .line 618
    .line 619
    const/high16 v12, 0x3f800000    # 1.0f

    .line 620
    .line 621
    const/4 v13, 0x0

    .line 622
    const/4 v15, 0x0

    .line 623
    const-string v4, ""

    .line 624
    .line 625
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 626
    .line 627
    .line 628
    move-result-object v0

    .line 629
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 630
    .line 631
    .line 632
    move-result-object v0

    .line 633
    sput-object v0, Landroidx/compose/material/icons/outlined/CurrencyExchangeKt;->_currencyExchange:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 634
    .line 635
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 636
    .line 637
    .line 638
    return-object v0
.end method
