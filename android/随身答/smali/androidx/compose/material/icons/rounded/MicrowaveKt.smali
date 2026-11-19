.class public final Landroidx/compose/material/icons/rounded/MicrowaveKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_microwave",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "Microwave",
        "Landroidx/compose/material/icons/Icons$Rounded;",
        "getMicrowave",
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
        "SMAP\nMicrowave.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Microwave.kt\nandroidx/compose/material/icons/rounded/MicrowaveKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,103:1\n212#2,12:104\n233#2,18:117\n253#2:154\n174#3:116\n705#4,2:135\n717#4,2:137\n719#4,11:143\n72#5,4:139\n*S KotlinDebug\n*F\n+ 1 Microwave.kt\nandroidx/compose/material/icons/rounded/MicrowaveKt\n*L\n29#1:104,12\n30#1:117,18\n30#1:154\n29#1:116\n30#1:135,2\n30#1:137,2\n30#1:143,11\n30#1:139,4\n*E\n"
    }
.end annotation


# static fields
.field private static _microwave:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getMicrowave(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/MicrowaveKt;->_microwave:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.Microwave"

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
    const v0, 0x411f851f    # 9.97f

    .line 71
    .line 72
    .line 73
    const v2, 0x40c4cccd    # 6.15f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 80
    .line 81
    .line 82
    const v17, 0x40ca8f5c    # 6.33f

    .line 83
    .line 84
    .line 85
    const v18, 0x41066666    # 8.4f

    .line 86
    .line 87
    .line 88
    const v13, 0x40b6147b    # 5.69f

    .line 89
    .line 90
    .line 91
    const v14, 0x411828f6    # 9.51f

    .line 92
    .line 93
    .line 94
    const v15, 0x40b8a3d7    # 5.77f

    .line 95
    .line 96
    .line 97
    const v16, 0x410bae14    # 8.73f

    .line 98
    .line 99
    .line 100
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 101
    .line 102
    .line 103
    const/high16 v17, 0x40f80000    # 7.75f

    .line 104
    .line 105
    const/high16 v18, 0x41000000    # 8.0f

    .line 106
    .line 107
    const v13, 0x40d75c29    # 6.73f

    .line 108
    .line 109
    .line 110
    const v14, 0x4102e148    # 8.18f

    .line 111
    .line 112
    .line 113
    const v15, 0x40e6b852    # 7.21f

    .line 114
    .line 115
    .line 116
    const/high16 v16, 0x41000000    # 8.0f

    .line 117
    .line 118
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 119
    .line 120
    .line 121
    const v17, 0x3fe7ae14    # 1.81f

    .line 122
    .line 123
    .line 124
    const v18, 0x3f2b851f    # 0.67f

    .line 125
    .line 126
    .line 127
    const v13, 0x3f4ccccd    # 0.8f

    .line 128
    .line 129
    .line 130
    const/4 v14, 0x0

    .line 131
    const v15, 0x3fb1eb85    # 1.39f

    .line 132
    .line 133
    .line 134
    const v16, 0x3ec7ae14    # 0.39f

    .line 135
    .line 136
    .line 137
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 138
    .line 139
    .line 140
    const/high16 v17, 0x41240000    # 10.25f

    .line 141
    .line 142
    const/high16 v18, 0x41100000    # 9.0f

    .line 143
    .line 144
    const v13, 0x411deb85    # 9.87f

    .line 145
    .line 146
    .line 147
    const v14, 0x410e147b    # 8.88f

    .line 148
    .line 149
    .line 150
    const v15, 0x41211eb8    # 10.07f

    .line 151
    .line 152
    .line 153
    const/high16 v16, 0x41100000    # 9.0f

    .line 154
    .line 155
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 156
    .line 157
    .line 158
    const v17, 0x3ec7ae14    # 0.39f

    .line 159
    .line 160
    .line 161
    const v18, -0x420a3d71    # -0.12f

    .line 162
    .line 163
    .line 164
    const v13, 0x3e051eb8    # 0.13f

    .line 165
    .line 166
    .line 167
    const/4 v14, 0x0

    .line 168
    const v15, 0x3e851eb8    # 0.26f

    .line 169
    .line 170
    .line 171
    const v16, -0x42b33333    # -0.05f

    .line 172
    .line 173
    .line 174
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 175
    .line 176
    .line 177
    const v17, 0x3f99999a    # 1.2f

    .line 178
    .line 179
    .line 180
    const v18, 0x3e23d70a    # 0.16f

    .line 181
    .line 182
    .line 183
    const v13, 0x3ec7ae14    # 0.39f

    .line 184
    .line 185
    .line 186
    const v14, -0x419eb852    # -0.22f

    .line 187
    .line 188
    .line 189
    const v15, 0x3f6147ae    # 0.88f

    .line 190
    .line 191
    .line 192
    const v16, -0x41dc28f6    # -0.16f

    .line 193
    .line 194
    .line 195
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 196
    .line 197
    .line 198
    const/4 v0, 0x0

    .line 199
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 200
    .line 201
    .line 202
    const v17, -0x41c7ae14    # -0.18f

    .line 203
    .line 204
    .line 205
    const v18, 0x3fc7ae14    # 1.56f

    .line 206
    .line 207
    .line 208
    const v13, 0x3eeb851f    # 0.46f

    .line 209
    .line 210
    .line 211
    const v14, 0x3eeb851f    # 0.46f

    .line 212
    .line 213
    .line 214
    const v15, 0x3ec28f5c    # 0.38f

    .line 215
    .line 216
    .line 217
    const v16, 0x3f9eb852    # 1.24f

    .line 218
    .line 219
    .line 220
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 221
    .line 222
    .line 223
    const v17, -0x404b851f    # -1.41f

    .line 224
    .line 225
    .line 226
    const v18, 0x3ecccccd    # 0.4f

    .line 227
    .line 228
    .line 229
    const v13, -0x413851ec    # -0.39f

    .line 230
    .line 231
    .line 232
    const v14, 0x3e6b851f    # 0.23f

    .line 233
    .line 234
    .line 235
    const v15, -0x40a147ae    # -0.87f

    .line 236
    .line 237
    .line 238
    const v16, 0x3ecccccd    # 0.4f

    .line 239
    .line 240
    .line 241
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 242
    .line 243
    .line 244
    const v17, -0x401ae148    # -1.79f

    .line 245
    .line 246
    .line 247
    const v18, -0x40d70a3d    # -0.66f

    .line 248
    .line 249
    .line 250
    const v13, -0x40b5c28f    # -0.79f

    .line 251
    .line 252
    .line 253
    const/4 v14, 0x0

    .line 254
    const v15, -0x4050a3d7    # -1.37f

    .line 255
    .line 256
    .line 257
    const v16, -0x413d70a4    # -0.38f

    .line 258
    .line 259
    .line 260
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 261
    .line 262
    .line 263
    const/high16 v17, 0x40f80000    # 7.75f

    .line 264
    .line 265
    const/high16 v18, 0x41200000    # 10.0f

    .line 266
    .line 267
    const v13, 0x4102147b    # 8.13f

    .line 268
    .line 269
    .line 270
    const v14, 0x4121eb85    # 10.12f

    .line 271
    .line 272
    .line 273
    const v15, 0x40fe147b    # 7.94f

    .line 274
    .line 275
    .line 276
    const/high16 v16, 0x41200000    # 10.0f

    .line 277
    .line 278
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 279
    .line 280
    .line 281
    const v17, -0x413851ec    # -0.39f

    .line 282
    .line 283
    .line 284
    const v18, 0x3df5c28f    # 0.12f

    .line 285
    .line 286
    .line 287
    const v13, -0x41fae148    # -0.13f

    .line 288
    .line 289
    .line 290
    const/4 v14, 0x0

    .line 291
    const v15, -0x417ae148    # -0.26f

    .line 292
    .line 293
    .line 294
    const v16, 0x3d4ccccd    # 0.05f

    .line 295
    .line 296
    .line 297
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 298
    .line 299
    .line 300
    const v17, 0x40c4cccd    # 6.15f

    .line 301
    .line 302
    .line 303
    const v18, 0x411f851f    # 9.97f

    .line 304
    .line 305
    .line 306
    const v13, 0x40deb852    # 6.96f

    .line 307
    .line 308
    .line 309
    const v14, 0x4125999a    # 10.35f

    .line 310
    .line 311
    .line 312
    const v15, 0x40cf0a3d    # 6.47f

    .line 313
    .line 314
    .line 315
    const v16, 0x41247ae1    # 10.28f

    .line 316
    .line 317
    .line 318
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 319
    .line 320
    .line 321
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 322
    .line 323
    .line 324
    const/high16 v0, 0x40f80000    # 7.75f

    .line 325
    .line 326
    const/high16 v2, 0x41700000    # 15.0f

    .line 327
    .line 328
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 329
    .line 330
    .line 331
    const v17, 0x3f35c28f    # 0.71f

    .line 332
    .line 333
    .line 334
    const v18, 0x3eae147b    # 0.34f

    .line 335
    .line 336
    .line 337
    const v13, 0x3e428f5c    # 0.19f

    .line 338
    .line 339
    .line 340
    const/4 v14, 0x0

    .line 341
    const v15, 0x3ec28f5c    # 0.38f

    .line 342
    .line 343
    .line 344
    const v16, 0x3df5c28f    # 0.12f

    .line 345
    .line 346
    .line 347
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 348
    .line 349
    .line 350
    const v17, 0x3fe51eb8    # 1.79f

    .line 351
    .line 352
    .line 353
    const v18, 0x3f28f5c3    # 0.66f

    .line 354
    .line 355
    .line 356
    const v13, 0x3ed70a3d    # 0.42f

    .line 357
    .line 358
    .line 359
    const v14, 0x3e8f5c29    # 0.28f

    .line 360
    .line 361
    .line 362
    const/high16 v15, 0x3f800000    # 1.0f

    .line 363
    .line 364
    const v16, 0x3f28f5c3    # 0.66f

    .line 365
    .line 366
    .line 367
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 368
    .line 369
    .line 370
    const v17, 0x3fb47ae1    # 1.41f

    .line 371
    .line 372
    .line 373
    const v18, -0x41333333    # -0.4f

    .line 374
    .line 375
    .line 376
    const v13, 0x3f0a3d71    # 0.54f

    .line 377
    .line 378
    .line 379
    const/4 v14, 0x0

    .line 380
    const v15, 0x3f828f5c    # 1.02f

    .line 381
    .line 382
    .line 383
    const v16, -0x41d1eb85    # -0.17f

    .line 384
    .line 385
    .line 386
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 387
    .line 388
    .line 389
    const v17, 0x3e3851ec    # 0.18f

    .line 390
    .line 391
    .line 392
    const v18, -0x403851ec    # -1.56f

    .line 393
    .line 394
    .line 395
    const v13, 0x3f0f5c29    # 0.56f

    .line 396
    .line 397
    .line 398
    const v14, -0x415c28f6    # -0.32f

    .line 399
    .line 400
    .line 401
    const v15, 0x3f23d70a    # 0.64f

    .line 402
    .line 403
    .line 404
    const v16, -0x40733333    # -1.1f

    .line 405
    .line 406
    .line 407
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 408
    .line 409
    .line 410
    const/4 v0, 0x0

    .line 411
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 412
    .line 413
    .line 414
    const v17, -0x40666666    # -1.2f

    .line 415
    .line 416
    .line 417
    const v18, -0x41dc28f6    # -0.16f

    .line 418
    .line 419
    .line 420
    const v13, -0x415c28f6    # -0.32f

    .line 421
    .line 422
    .line 423
    const v15, -0x40b0a3d7    # -0.81f

    .line 424
    .line 425
    .line 426
    const v16, -0x413d70a4    # -0.38f

    .line 427
    .line 428
    .line 429
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 430
    .line 431
    .line 432
    const/high16 v17, 0x41240000    # 10.25f

    .line 433
    .line 434
    const/high16 v18, 0x41600000    # 14.0f

    .line 435
    .line 436
    const v13, 0x412828f6    # 10.51f

    .line 437
    .line 438
    .line 439
    const v14, 0x415f3333    # 13.95f

    .line 440
    .line 441
    .line 442
    const v15, 0x4126147b    # 10.38f

    .line 443
    .line 444
    .line 445
    const/high16 v16, 0x41600000    # 14.0f

    .line 446
    .line 447
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 448
    .line 449
    .line 450
    const v17, -0x40cf5c29    # -0.69f

    .line 451
    .line 452
    .line 453
    const v18, -0x41570a3d    # -0.33f

    .line 454
    .line 455
    .line 456
    const v13, -0x41c7ae14    # -0.18f

    .line 457
    .line 458
    .line 459
    const/4 v14, 0x0

    .line 460
    const v15, -0x413d70a4    # -0.38f

    .line 461
    .line 462
    .line 463
    const v16, -0x420a3d71    # -0.12f

    .line 464
    .line 465
    .line 466
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 467
    .line 468
    .line 469
    const/high16 v17, 0x40f80000    # 7.75f

    .line 470
    .line 471
    const/high16 v18, 0x41500000    # 13.0f

    .line 472
    .line 473
    const v13, 0x41123d71    # 9.14f

    .line 474
    .line 475
    .line 476
    const v14, 0x41563d71    # 13.39f

    .line 477
    .line 478
    .line 479
    const v15, 0x4108cccd    # 8.55f

    .line 480
    .line 481
    .line 482
    const/high16 v16, 0x41500000    # 13.0f

    .line 483
    .line 484
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 485
    .line 486
    .line 487
    const v17, -0x404a3d71    # -1.42f

    .line 488
    .line 489
    .line 490
    const v18, 0x3ecccccd    # 0.4f

    .line 491
    .line 492
    .line 493
    const v13, -0x40f5c28f    # -0.54f

    .line 494
    .line 495
    .line 496
    const/4 v14, 0x0

    .line 497
    const v15, -0x407d70a4    # -1.02f

    .line 498
    .line 499
    .line 500
    const v16, 0x3e3851ec    # 0.18f

    .line 501
    .line 502
    .line 503
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 504
    .line 505
    .line 506
    const v17, -0x41c7ae14    # -0.18f

    .line 507
    .line 508
    .line 509
    const v18, 0x3fc7ae14    # 1.56f

    .line 510
    .line 511
    .line 512
    const v13, -0x40f0a3d7    # -0.56f

    .line 513
    .line 514
    .line 515
    const v14, 0x3ea8f5c3    # 0.33f

    .line 516
    .line 517
    .line 518
    const v15, -0x40dc28f6    # -0.64f

    .line 519
    .line 520
    .line 521
    const v16, 0x3f8e147b    # 1.11f

    .line 522
    .line 523
    .line 524
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 525
    .line 526
    .line 527
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 528
    .line 529
    .line 530
    const v17, 0x3f99999a    # 1.2f

    .line 531
    .line 532
    .line 533
    const v18, 0x3e23d70a    # 0.16f

    .line 534
    .line 535
    .line 536
    const v13, 0x3ea3d70a    # 0.32f

    .line 537
    .line 538
    .line 539
    const v14, 0x3ea3d70a    # 0.32f

    .line 540
    .line 541
    .line 542
    const v15, 0x3f4f5c29    # 0.81f

    .line 543
    .line 544
    .line 545
    const v16, 0x3ec28f5c    # 0.38f

    .line 546
    .line 547
    .line 548
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 549
    .line 550
    .line 551
    const/high16 v17, 0x40f80000    # 7.75f

    .line 552
    .line 553
    const/high16 v18, 0x41700000    # 15.0f

    .line 554
    .line 555
    const v13, 0x40efae14    # 7.49f

    .line 556
    .line 557
    .line 558
    const v14, 0x4170cccd    # 15.05f

    .line 559
    .line 560
    .line 561
    const v15, 0x40f3d70a    # 7.62f

    .line 562
    .line 563
    .line 564
    const/high16 v16, 0x41700000    # 15.0f

    .line 565
    .line 566
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 567
    .line 568
    .line 569
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 570
    .line 571
    .line 572
    const/high16 v0, 0x41b00000    # 22.0f

    .line 573
    .line 574
    const/high16 v2, 0x40c00000    # 6.0f

    .line 575
    .line 576
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 577
    .line 578
    .line 579
    const/high16 v0, 0x41400000    # 12.0f

    .line 580
    .line 581
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 582
    .line 583
    .line 584
    const/high16 v17, -0x40000000    # -2.0f

    .line 585
    .line 586
    const/high16 v18, 0x40000000    # 2.0f

    .line 587
    .line 588
    const/4 v13, 0x0

    .line 589
    const v14, 0x3f8ccccd    # 1.1f

    .line 590
    .line 591
    .line 592
    const v15, -0x4099999a    # -0.9f

    .line 593
    .line 594
    .line 595
    const/high16 v16, 0x40000000    # 2.0f

    .line 596
    .line 597
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 598
    .line 599
    .line 600
    const/high16 v0, 0x40800000    # 4.0f

    .line 601
    .line 602
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 603
    .line 604
    .line 605
    const/high16 v18, -0x40000000    # -2.0f

    .line 606
    .line 607
    const v13, -0x40733333    # -1.1f

    .line 608
    .line 609
    .line 610
    const/4 v14, 0x0

    .line 611
    const/high16 v15, -0x40000000    # -2.0f

    .line 612
    .line 613
    const v16, -0x4099999a    # -0.9f

    .line 614
    .line 615
    .line 616
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 617
    .line 618
    .line 619
    const/high16 v0, 0x40c00000    # 6.0f

    .line 620
    .line 621
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 622
    .line 623
    .line 624
    const/high16 v17, 0x40000000    # 2.0f

    .line 625
    .line 626
    const/4 v13, 0x0

    .line 627
    const v14, -0x40733333    # -1.1f

    .line 628
    .line 629
    .line 630
    const v15, 0x3f666666    # 0.9f

    .line 631
    .line 632
    .line 633
    const/high16 v16, -0x40000000    # -2.0f

    .line 634
    .line 635
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 636
    .line 637
    .line 638
    const/high16 v0, 0x41800000    # 16.0f

    .line 639
    .line 640
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 641
    .line 642
    .line 643
    const/high16 v17, 0x41b00000    # 22.0f

    .line 644
    .line 645
    const/high16 v18, 0x40c00000    # 6.0f

    .line 646
    .line 647
    const v13, 0x41a8cccd    # 21.1f

    .line 648
    .line 649
    .line 650
    const/high16 v14, 0x40800000    # 4.0f

    .line 651
    .line 652
    const/high16 v15, 0x41b00000    # 22.0f

    .line 653
    .line 654
    const v16, 0x409ccccd    # 4.9f

    .line 655
    .line 656
    .line 657
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 658
    .line 659
    .line 660
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 661
    .line 662
    .line 663
    const/high16 v0, 0x41600000    # 14.0f

    .line 664
    .line 665
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 666
    .line 667
    .line 668
    const/high16 v0, 0x40800000    # 4.0f

    .line 669
    .line 670
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 671
    .line 672
    .line 673
    const/high16 v0, 0x41400000    # 12.0f

    .line 674
    .line 675
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 676
    .line 677
    .line 678
    const/high16 v0, 0x41200000    # 10.0f

    .line 679
    .line 680
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 681
    .line 682
    .line 683
    const/high16 v0, 0x40c00000    # 6.0f

    .line 684
    .line 685
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 686
    .line 687
    .line 688
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 689
    .line 690
    .line 691
    const/high16 v0, 0x41800000    # 16.0f

    .line 692
    .line 693
    const/high16 v2, 0x41980000    # 19.0f

    .line 694
    .line 695
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 696
    .line 697
    .line 698
    const/high16 v17, -0x40800000    # -1.0f

    .line 699
    .line 700
    const/high16 v18, -0x40800000    # -1.0f

    .line 701
    .line 702
    const/4 v13, 0x0

    .line 703
    const v14, -0x40f33333    # -0.55f

    .line 704
    .line 705
    .line 706
    const v15, -0x4119999a    # -0.45f

    .line 707
    .line 708
    .line 709
    const/high16 v16, -0x40800000    # -1.0f

    .line 710
    .line 711
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 712
    .line 713
    .line 714
    const/high16 v18, 0x3f800000    # 1.0f

    .line 715
    .line 716
    const v13, -0x40f33333    # -0.55f

    .line 717
    .line 718
    .line 719
    const/4 v14, 0x0

    .line 720
    const/high16 v15, -0x40800000    # -1.0f

    .line 721
    .line 722
    const v16, 0x3ee66666    # 0.45f

    .line 723
    .line 724
    .line 725
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 726
    .line 727
    .line 728
    const/high16 v17, 0x3f800000    # 1.0f

    .line 729
    .line 730
    const/4 v13, 0x0

    .line 731
    const v14, 0x3f0ccccd    # 0.55f

    .line 732
    .line 733
    .line 734
    const v15, 0x3ee66666    # 0.45f

    .line 735
    .line 736
    .line 737
    const/high16 v16, 0x3f800000    # 1.0f

    .line 738
    .line 739
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 740
    .line 741
    .line 742
    const/high16 v17, 0x41980000    # 19.0f

    .line 743
    .line 744
    const/high16 v18, 0x41800000    # 16.0f

    .line 745
    .line 746
    const v13, 0x41946666    # 18.55f

    .line 747
    .line 748
    .line 749
    const/high16 v14, 0x41880000    # 17.0f

    .line 750
    .line 751
    const/high16 v15, 0x41980000    # 19.0f

    .line 752
    .line 753
    const v16, 0x41846666    # 16.55f

    .line 754
    .line 755
    .line 756
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 757
    .line 758
    .line 759
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 760
    .line 761
    .line 762
    const/high16 v0, 0x41980000    # 19.0f

    .line 763
    .line 764
    const/high16 v2, 0x41400000    # 12.0f

    .line 765
    .line 766
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 767
    .line 768
    .line 769
    const/high16 v17, -0x40800000    # -1.0f

    .line 770
    .line 771
    const/high16 v18, -0x40800000    # -1.0f

    .line 772
    .line 773
    const/4 v13, 0x0

    .line 774
    const v14, -0x40f33333    # -0.55f

    .line 775
    .line 776
    .line 777
    const v15, -0x4119999a    # -0.45f

    .line 778
    .line 779
    .line 780
    const/high16 v16, -0x40800000    # -1.0f

    .line 781
    .line 782
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 783
    .line 784
    .line 785
    const/high16 v18, 0x3f800000    # 1.0f

    .line 786
    .line 787
    const v13, -0x40f33333    # -0.55f

    .line 788
    .line 789
    .line 790
    const/4 v14, 0x0

    .line 791
    const/high16 v15, -0x40800000    # -1.0f

    .line 792
    .line 793
    const v16, 0x3ee66666    # 0.45f

    .line 794
    .line 795
    .line 796
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 797
    .line 798
    .line 799
    const/high16 v17, 0x3f800000    # 1.0f

    .line 800
    .line 801
    const/4 v13, 0x0

    .line 802
    const v14, 0x3f0ccccd    # 0.55f

    .line 803
    .line 804
    .line 805
    const v15, 0x3ee66666    # 0.45f

    .line 806
    .line 807
    .line 808
    const/high16 v16, 0x3f800000    # 1.0f

    .line 809
    .line 810
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 811
    .line 812
    .line 813
    const/high16 v17, 0x41980000    # 19.0f

    .line 814
    .line 815
    const/high16 v18, 0x41400000    # 12.0f

    .line 816
    .line 817
    const v13, 0x41946666    # 18.55f

    .line 818
    .line 819
    .line 820
    const/high16 v14, 0x41500000    # 13.0f

    .line 821
    .line 822
    const/high16 v15, 0x41980000    # 19.0f

    .line 823
    .line 824
    const v16, 0x4148cccd    # 12.55f

    .line 825
    .line 826
    .line 827
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 828
    .line 829
    .line 830
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 831
    .line 832
    .line 833
    const/high16 v0, 0x40e00000    # 7.0f

    .line 834
    .line 835
    const/high16 v2, 0x41980000    # 19.0f

    .line 836
    .line 837
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 838
    .line 839
    .line 840
    const/high16 v0, -0x40000000    # -2.0f

    .line 841
    .line 842
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 843
    .line 844
    .line 845
    const/high16 v0, 0x40000000    # 2.0f

    .line 846
    .line 847
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 848
    .line 849
    .line 850
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 851
    .line 852
    .line 853
    const/high16 v0, 0x40e00000    # 7.0f

    .line 854
    .line 855
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 856
    .line 857
    .line 858
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 859
    .line 860
    .line 861
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 862
    .line 863
    .line 864
    move-result-object v2

    .line 865
    const/16 v16, 0x3800

    .line 866
    .line 867
    const/16 v17, 0x0

    .line 868
    .line 869
    const/high16 v6, 0x3f800000    # 1.0f

    .line 870
    .line 871
    const/high16 v8, 0x3f800000    # 1.0f

    .line 872
    .line 873
    const/4 v7, 0x0

    .line 874
    const/high16 v9, 0x3f800000    # 1.0f

    .line 875
    .line 876
    const/high16 v12, 0x3f800000    # 1.0f

    .line 877
    .line 878
    const/4 v13, 0x0

    .line 879
    const/4 v14, 0x0

    .line 880
    const/4 v15, 0x0

    .line 881
    const-string v4, ""

    .line 882
    .line 883
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 884
    .line 885
    .line 886
    move-result-object v0

    .line 887
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 888
    .line 889
    .line 890
    move-result-object v0

    .line 891
    sput-object v0, Landroidx/compose/material/icons/rounded/MicrowaveKt;->_microwave:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 892
    .line 893
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 894
    .line 895
    .line 896
    return-object v0
.end method
