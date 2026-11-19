.class public final Landroidx/compose/material/icons/rounded/ToysKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_toys",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "Toys",
        "Landroidx/compose/material/icons/Icons$Rounded;",
        "getToys",
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
        "SMAP\nToys.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Toys.kt\nandroidx/compose/material/icons/rounded/ToysKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,89:1\n212#2,12:90\n233#2,18:103\n253#2:140\n174#3:102\n705#4,2:121\n717#4,2:123\n719#4,11:129\n72#5,4:125\n*S KotlinDebug\n*F\n+ 1 Toys.kt\nandroidx/compose/material/icons/rounded/ToysKt\n*L\n29#1:90,12\n30#1:103,18\n30#1:140\n29#1:102\n30#1:121,2\n30#1:123,2\n30#1:129,11\n30#1:125,4\n*E\n"
    }
.end annotation


# static fields
.field private static _toys:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getToys(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/ToysKt;->_toys:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.Toys"

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
    const/high16 v0, 0x41b00000    # 22.0f

    .line 71
    .line 72
    const/high16 v2, 0x41600000    # 14.0f

    .line 73
    .line 74
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v17, -0x3fb00000    # -3.25f

    .line 78
    .line 79
    const v18, -0x3f851eb8    # -3.92f

    .line 80
    .line 81
    .line 82
    const/4 v13, 0x0

    .line 83
    const v14, -0x40066666    # -1.95f

    .line 84
    .line 85
    .line 86
    const v15, -0x404ccccd    # -1.4f

    .line 87
    .line 88
    .line 89
    const v16, -0x3f9b851f    # -3.57f

    .line 90
    .line 91
    .line 92
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 93
    .line 94
    .line 95
    const v0, 0x418b3333    # 17.4f

    .line 96
    .line 97
    .line 98
    const v2, 0x40c1999a    # 6.05f

    .line 99
    .line 100
    .line 101
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 102
    .line 103
    .line 104
    const v17, 0x4168f5c3    # 14.56f

    .line 105
    .line 106
    .line 107
    const/high16 v18, 0x40800000    # 4.0f

    .line 108
    .line 109
    const/high16 v13, 0x41880000    # 17.0f

    .line 110
    .line 111
    const v14, 0x409a3d71    # 4.82f

    .line 112
    .line 113
    .line 114
    const v15, 0x417d999a    # 15.85f

    .line 115
    .line 116
    .line 117
    const/high16 v16, 0x40800000    # 4.0f

    .line 118
    .line 119
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 120
    .line 121
    .line 122
    const v0, 0x41170a3d    # 9.44f

    .line 123
    .line 124
    .line 125
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 126
    .line 127
    .line 128
    const v17, 0x40d33333    # 6.6f

    .line 129
    .line 130
    .line 131
    const v18, 0x40c1999a    # 6.05f

    .line 132
    .line 133
    .line 134
    const v13, 0x41026666    # 8.15f

    .line 135
    .line 136
    .line 137
    const/high16 v14, 0x40800000    # 4.0f

    .line 138
    .line 139
    const/high16 v15, 0x40e00000    # 7.0f

    .line 140
    .line 141
    const v16, 0x409a3d71    # 4.82f

    .line 142
    .line 143
    .line 144
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 145
    .line 146
    .line 147
    const v0, 0x40b9eb85    # 5.81f

    .line 148
    .line 149
    .line 150
    const v2, 0x41066666    # 8.4f

    .line 151
    .line 152
    .line 153
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 154
    .line 155
    .line 156
    const v0, 0x408d1eb8    # 4.41f

    .line 157
    .line 158
    .line 159
    const/high16 v2, 0x40e00000    # 7.0f

    .line 160
    .line 161
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 162
    .line 163
    .line 164
    const v0, 0x3e947ae1    # 0.29f

    .line 165
    .line 166
    .line 167
    const v2, -0x416b851f    # -0.29f

    .line 168
    .line 169
    .line 170
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 171
    .line 172
    .line 173
    const/16 v17, 0x0

    .line 174
    .line 175
    const v18, -0x404b851f    # -1.41f

    .line 176
    .line 177
    .line 178
    const v13, 0x3ec7ae14    # 0.39f

    .line 179
    .line 180
    .line 181
    const v14, -0x413851ec    # -0.39f

    .line 182
    .line 183
    .line 184
    const v15, 0x3ec7ae14    # 0.39f

    .line 185
    .line 186
    .line 187
    const v16, -0x407d70a4    # -1.02f

    .line 188
    .line 189
    .line 190
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 191
    .line 192
    .line 193
    const v17, -0x404b851f    # -1.41f

    .line 194
    .line 195
    .line 196
    const/16 v18, 0x0

    .line 197
    .line 198
    const v13, -0x413851ec    # -0.39f

    .line 199
    .line 200
    .line 201
    const v15, -0x407d70a4    # -1.02f

    .line 202
    .line 203
    .line 204
    const v16, -0x413851ec    # -0.39f

    .line 205
    .line 206
    .line 207
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 208
    .line 209
    .line 210
    const/high16 v0, -0x40000000    # -2.0f

    .line 211
    .line 212
    const/high16 v2, 0x40000000    # 2.0f

    .line 213
    .line 214
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 215
    .line 216
    .line 217
    const/16 v17, 0x0

    .line 218
    .line 219
    const v18, 0x3fb47ae1    # 1.41f

    .line 220
    .line 221
    .line 222
    const v14, 0x3ec7ae14    # 0.39f

    .line 223
    .line 224
    .line 225
    const v15, -0x413851ec    # -0.39f

    .line 226
    .line 227
    .line 228
    const v16, 0x3f828f5c    # 1.02f

    .line 229
    .line 230
    .line 231
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 232
    .line 233
    .line 234
    const v17, 0x3fb47ae1    # 1.41f

    .line 235
    .line 236
    .line 237
    const/16 v18, 0x0

    .line 238
    .line 239
    const v13, 0x3ec7ae14    # 0.39f

    .line 240
    .line 241
    .line 242
    const v15, 0x3f828f5c    # 1.02f

    .line 243
    .line 244
    .line 245
    const v16, 0x3ec7ae14    # 0.39f

    .line 246
    .line 247
    .line 248
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 249
    .line 250
    .line 251
    const/high16 v0, 0x40400000    # 3.0f

    .line 252
    .line 253
    const v2, 0x41068f5c    # 8.41f

    .line 254
    .line 255
    .line 256
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 257
    .line 258
    .line 259
    const v0, 0x3fe51eb8    # 1.79f

    .line 260
    .line 261
    .line 262
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 263
    .line 264
    .line 265
    const/high16 v17, 0x40000000    # 2.0f

    .line 266
    .line 267
    const/high16 v18, 0x41600000    # 14.0f

    .line 268
    .line 269
    const v13, 0x404b851f    # 3.18f

    .line 270
    .line 271
    .line 272
    const v14, 0x412b851f    # 10.72f

    .line 273
    .line 274
    .line 275
    const/high16 v15, 0x40000000    # 2.0f

    .line 276
    .line 277
    const v16, 0x4143851f    # 12.22f

    .line 278
    .line 279
    .line 280
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 281
    .line 282
    .line 283
    const v17, 0x40033333    # 2.05f

    .line 284
    .line 285
    .line 286
    const v18, 0x405eb852    # 3.48f

    .line 287
    .line 288
    .line 289
    const/4 v13, 0x0

    .line 290
    const/high16 v14, 0x3fc00000    # 1.5f

    .line 291
    .line 292
    const v15, 0x3f547ae1    # 0.83f

    .line 293
    .line 294
    .line 295
    const v16, 0x40328f5c    # 2.79f

    .line 296
    .line 297
    .line 298
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 299
    .line 300
    .line 301
    const/high16 v17, 0x40e00000    # 7.0f

    .line 302
    .line 303
    const/high16 v18, 0x41a00000    # 20.0f

    .line 304
    .line 305
    const v13, 0x4088f5c3    # 4.28f

    .line 306
    .line 307
    .line 308
    const v14, 0x41973333    # 18.9f

    .line 309
    .line 310
    .line 311
    const v15, 0x40b051ec    # 5.51f

    .line 312
    .line 313
    .line 314
    const/high16 v16, 0x41a00000    # 20.0f

    .line 315
    .line 316
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 317
    .line 318
    .line 319
    const v17, 0x40347ae1    # 2.82f

    .line 320
    .line 321
    .line 322
    const/high16 v18, -0x40000000    # -2.0f

    .line 323
    .line 324
    const v13, 0x3fa66666    # 1.3f

    .line 325
    .line 326
    .line 327
    const/4 v14, 0x0

    .line 328
    const v15, 0x4019999a    # 2.4f

    .line 329
    .line 330
    .line 331
    const v16, -0x40a8f5c3    # -0.84f

    .line 332
    .line 333
    .line 334
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 335
    .line 336
    .line 337
    const v0, 0x408bd70a    # 4.37f

    .line 338
    .line 339
    .line 340
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 341
    .line 342
    .line 343
    const/high16 v18, 0x40000000    # 2.0f

    .line 344
    .line 345
    const v13, 0x3ed1eb85    # 0.41f

    .line 346
    .line 347
    .line 348
    const v14, 0x3f947ae1    # 1.16f

    .line 349
    .line 350
    .line 351
    const v15, 0x3fc147ae    # 1.51f

    .line 352
    .line 353
    .line 354
    const/high16 v16, 0x40000000    # 2.0f

    .line 355
    .line 356
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 357
    .line 358
    .line 359
    const v17, 0x403ccccd    # 2.95f

    .line 360
    .line 361
    .line 362
    const v18, -0x3fdeb852    # -2.52f

    .line 363
    .line 364
    .line 365
    const v13, 0x3fbeb852    # 1.49f

    .line 366
    .line 367
    .line 368
    const/4 v14, 0x0

    .line 369
    const v15, 0x402e147b    # 2.72f

    .line 370
    .line 371
    .line 372
    const v16, -0x40733333    # -1.1f

    .line 373
    .line 374
    .line 375
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 376
    .line 377
    .line 378
    const/high16 v17, 0x41b00000    # 22.0f

    .line 379
    .line 380
    const/high16 v18, 0x41600000    # 14.0f

    .line 381
    .line 382
    const v13, 0x41a95c29    # 21.17f

    .line 383
    .line 384
    .line 385
    const v14, 0x418651ec    # 16.79f

    .line 386
    .line 387
    .line 388
    const/high16 v15, 0x41b00000    # 22.0f

    .line 389
    .line 390
    const/high16 v16, 0x41780000    # 15.5f

    .line 391
    .line 392
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 393
    .line 394
    .line 395
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 396
    .line 397
    .line 398
    const/high16 v0, 0x40e00000    # 7.0f

    .line 399
    .line 400
    const/high16 v2, 0x41900000    # 18.0f

    .line 401
    .line 402
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 403
    .line 404
    .line 405
    const/high16 v17, -0x40800000    # -1.0f

    .line 406
    .line 407
    const/high16 v18, -0x40800000    # -1.0f

    .line 408
    .line 409
    const v13, -0x40f33333    # -0.55f

    .line 410
    .line 411
    .line 412
    const/4 v14, 0x0

    .line 413
    const/high16 v15, -0x40800000    # -1.0f

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
    const/high16 v0, -0x40800000    # -1.0f

    .line 422
    .line 423
    const v2, 0x3ee66666    # 0.45f

    .line 424
    .line 425
    .line 426
    const/high16 v4, 0x3f800000    # 1.0f

    .line 427
    .line 428
    invoke-virtual {v12, v2, v0, v4, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 429
    .line 430
    .line 431
    const v0, 0x3ee66666    # 0.45f

    .line 432
    .line 433
    .line 434
    const/high16 v2, 0x3f800000    # 1.0f

    .line 435
    .line 436
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 437
    .line 438
    .line 439
    const v0, 0x40f1999a    # 7.55f

    .line 440
    .line 441
    .line 442
    const/high16 v2, 0x40e00000    # 7.0f

    .line 443
    .line 444
    const/high16 v4, 0x41900000    # 18.0f

    .line 445
    .line 446
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 447
    .line 448
    .line 449
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 450
    .line 451
    .line 452
    const/high16 v0, 0x41300000    # 11.0f

    .line 453
    .line 454
    const/high16 v2, 0x41200000    # 10.0f

    .line 455
    .line 456
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 457
    .line 458
    .line 459
    const v0, 0x40ed1eb8    # 7.41f

    .line 460
    .line 461
    .line 462
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 463
    .line 464
    .line 465
    const v0, 0x40ec7ae1    # 7.39f

    .line 466
    .line 467
    .line 468
    const v2, 0x411fae14    # 9.98f

    .line 469
    .line 470
    .line 471
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 472
    .line 473
    .line 474
    const v0, 0x3f8ccccd    # 1.1f

    .line 475
    .line 476
    .line 477
    const v2, -0x3faccccd    # -3.3f

    .line 478
    .line 479
    .line 480
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 481
    .line 482
    .line 483
    const v17, 0x41170a3d    # 9.44f

    .line 484
    .line 485
    .line 486
    const/high16 v18, 0x40c00000    # 6.0f

    .line 487
    .line 488
    const v13, 0x410a147b    # 8.63f

    .line 489
    .line 490
    .line 491
    const v14, 0x40c8a3d7    # 6.27f

    .line 492
    .line 493
    .line 494
    const v15, 0x411028f6    # 9.01f

    .line 495
    .line 496
    .line 497
    const/high16 v16, 0x40c00000    # 6.0f

    .line 498
    .line 499
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 500
    .line 501
    .line 502
    const/high16 v0, 0x41300000    # 11.0f

    .line 503
    .line 504
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 505
    .line 506
    .line 507
    const/high16 v0, 0x41200000    # 10.0f

    .line 508
    .line 509
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 510
    .line 511
    .line 512
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 513
    .line 514
    .line 515
    const/high16 v0, 0x40c00000    # 6.0f

    .line 516
    .line 517
    const/high16 v2, 0x41500000    # 13.0f

    .line 518
    .line 519
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 520
    .line 521
    .line 522
    const v0, 0x3fc7ae14    # 1.56f

    .line 523
    .line 524
    .line 525
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 526
    .line 527
    .line 528
    const v17, 0x3f733333    # 0.95f

    .line 529
    .line 530
    .line 531
    const v18, 0x3f2e147b    # 0.68f

    .line 532
    .line 533
    .line 534
    const v13, 0x3edc28f6    # 0.43f

    .line 535
    .line 536
    .line 537
    const/4 v14, 0x0

    .line 538
    const v15, 0x3f4f5c29    # 0.81f

    .line 539
    .line 540
    .line 541
    const v16, 0x3e8a3d71    # 0.27f

    .line 542
    .line 543
    .line 544
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 545
    .line 546
    .line 547
    const v0, 0x4184e148    # 16.61f

    .line 548
    .line 549
    .line 550
    const/high16 v2, 0x41200000    # 10.0f

    .line 551
    .line 552
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 553
    .line 554
    .line 555
    const/high16 v0, 0x41500000    # 13.0f

    .line 556
    .line 557
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 558
    .line 559
    .line 560
    const/high16 v0, 0x40c00000    # 6.0f

    .line 561
    .line 562
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 563
    .line 564
    .line 565
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 566
    .line 567
    .line 568
    const/high16 v0, 0x41880000    # 17.0f

    .line 569
    .line 570
    const/high16 v2, 0x41900000    # 18.0f

    .line 571
    .line 572
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 573
    .line 574
    .line 575
    const/high16 v17, -0x40800000    # -1.0f

    .line 576
    .line 577
    const/high16 v18, -0x40800000    # -1.0f

    .line 578
    .line 579
    const v13, -0x40f33333    # -0.55f

    .line 580
    .line 581
    .line 582
    const/high16 v15, -0x40800000    # -1.0f

    .line 583
    .line 584
    const v16, -0x4119999a    # -0.45f

    .line 585
    .line 586
    .line 587
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 588
    .line 589
    .line 590
    const/high16 v0, -0x40800000    # -1.0f

    .line 591
    .line 592
    const v2, 0x3ee66666    # 0.45f

    .line 593
    .line 594
    .line 595
    const/high16 v4, 0x3f800000    # 1.0f

    .line 596
    .line 597
    invoke-virtual {v12, v2, v0, v4, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 598
    .line 599
    .line 600
    const v0, 0x3ee66666    # 0.45f

    .line 601
    .line 602
    .line 603
    const/high16 v2, 0x3f800000    # 1.0f

    .line 604
    .line 605
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 606
    .line 607
    .line 608
    const v0, 0x418c6666    # 17.55f

    .line 609
    .line 610
    .line 611
    const/high16 v2, 0x41880000    # 17.0f

    .line 612
    .line 613
    const/high16 v4, 0x41900000    # 18.0f

    .line 614
    .line 615
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 616
    .line 617
    .line 618
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 619
    .line 620
    .line 621
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 622
    .line 623
    .line 624
    move-result-object v2

    .line 625
    const/16 v16, 0x3800

    .line 626
    .line 627
    const/16 v17, 0x0

    .line 628
    .line 629
    const/high16 v6, 0x3f800000    # 1.0f

    .line 630
    .line 631
    const/high16 v8, 0x3f800000    # 1.0f

    .line 632
    .line 633
    const/4 v7, 0x0

    .line 634
    const/high16 v9, 0x3f800000    # 1.0f

    .line 635
    .line 636
    const/high16 v12, 0x3f800000    # 1.0f

    .line 637
    .line 638
    const/4 v13, 0x0

    .line 639
    const/4 v15, 0x0

    .line 640
    const-string v4, ""

    .line 641
    .line 642
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 643
    .line 644
    .line 645
    move-result-object v0

    .line 646
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 647
    .line 648
    .line 649
    move-result-object v0

    .line 650
    sput-object v0, Landroidx/compose/material/icons/rounded/ToysKt;->_toys:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 651
    .line 652
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 653
    .line 654
    .line 655
    return-object v0
.end method
