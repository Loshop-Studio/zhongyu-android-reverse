.class public final Landroidx/compose/material/icons/rounded/EmojiNatureKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_emojiNature",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "EmojiNature",
        "Landroidx/compose/material/icons/Icons$Rounded;",
        "getEmojiNature",
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
        "SMAP\nEmojiNature.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EmojiNature.kt\nandroidx/compose/material/icons/rounded/EmojiNatureKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,131:1\n212#2,12:132\n233#2,18:145\n253#2:182\n233#2,18:183\n253#2:220\n174#3:144\n705#4,2:163\n717#4,2:165\n719#4,11:171\n705#4,2:201\n717#4,2:203\n719#4,11:209\n72#5,4:167\n72#5,4:205\n*S KotlinDebug\n*F\n+ 1 EmojiNature.kt\nandroidx/compose/material/icons/rounded/EmojiNatureKt\n*L\n29#1:132,12\n30#1:145,18\n30#1:182\n65#1:183,18\n65#1:220\n29#1:144\n30#1:163,2\n30#1:165,2\n30#1:171,11\n65#1:201,2\n65#1:203,2\n65#1:209,11\n30#1:167,4\n65#1:205,4\n*E\n"
    }
.end annotation


# static fields
.field private static _emojiNature:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getEmojiNature(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/EmojiNatureKt;->_emojiNature:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.EmojiNature"

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
    const v4, 0x41af851f    # 21.94f

    .line 71
    .line 72
    .line 73
    const v6, 0x409c28f6    # 4.88f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v25, 0x41a570a4    # 20.68f

    .line 80
    .line 81
    .line 82
    const/high16 v26, 0x40800000    # 4.0f

    .line 83
    .line 84
    const v21, 0x41ae147b    # 21.76f

    .line 85
    .line 86
    .line 87
    const v22, 0x408b3333    # 4.35f

    .line 88
    .line 89
    .line 90
    const/high16 v23, 0x41aa0000    # 21.25f

    .line 91
    .line 92
    const/high16 v24, 0x40800000    # 4.0f

    .line 93
    .line 94
    move-object/from16 v20, v2

    .line 95
    .line 96
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 97
    .line 98
    .line 99
    const v25, -0x4247ae14    # -0.09f

    .line 100
    .line 101
    .line 102
    const/16 v26, 0x0

    .line 103
    .line 104
    const v21, -0x430a3d71    # -0.03f

    .line 105
    .line 106
    .line 107
    const/16 v22, 0x0

    .line 108
    .line 109
    const v23, -0x428a3d71    # -0.06f

    .line 110
    .line 111
    .line 112
    const/16 v24, 0x0

    .line 113
    .line 114
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 115
    .line 116
    .line 117
    const v4, 0x419ccccd    # 19.6f

    .line 118
    .line 119
    .line 120
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 121
    .line 122
    .line 123
    const v4, -0x416147ae    # -0.31f

    .line 124
    .line 125
    .line 126
    const v6, -0x4087ae14    # -0.97f

    .line 127
    .line 128
    .line 129
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 130
    .line 131
    .line 132
    const/high16 v25, 0x41900000    # 18.0f

    .line 133
    .line 134
    const/high16 v26, 0x40000000    # 2.0f

    .line 135
    .line 136
    const v21, 0x41993333    # 19.15f

    .line 137
    .line 138
    .line 139
    const v22, 0x401b851f    # 2.43f

    .line 140
    .line 141
    .line 142
    const v23, 0x4194e148    # 18.61f

    .line 143
    .line 144
    .line 145
    const/high16 v24, 0x40000000    # 2.0f

    .line 146
    .line 147
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 148
    .line 149
    .line 150
    const/4 v4, 0x0

    .line 151
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 152
    .line 153
    .line 154
    const v25, -0x405ae148    # -1.29f

    .line 155
    .line 156
    .line 157
    const v26, 0x3f851eb8    # 1.04f

    .line 158
    .line 159
    .line 160
    const v21, -0x40e3d70a    # -0.61f

    .line 161
    .line 162
    .line 163
    const/16 v22, 0x0

    .line 164
    .line 165
    const v23, -0x406ccccd    # -1.15f

    .line 166
    .line 167
    .line 168
    const v24, 0x3edc28f6    # 0.43f

    .line 169
    .line 170
    .line 171
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 172
    .line 173
    .line 174
    const v4, 0x41833333    # 16.4f

    .line 175
    .line 176
    .line 177
    const/high16 v6, 0x40800000    # 4.0f

    .line 178
    .line 179
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 180
    .line 181
    .line 182
    const v4, -0x40851eb8    # -0.98f

    .line 183
    .line 184
    .line 185
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 186
    .line 187
    .line 188
    const v25, -0x4247ae14    # -0.09f

    .line 189
    .line 190
    .line 191
    const/16 v26, 0x0

    .line 192
    .line 193
    const v21, -0x430a3d71    # -0.03f

    .line 194
    .line 195
    .line 196
    const v23, -0x428a3d71    # -0.06f

    .line 197
    .line 198
    .line 199
    const/16 v24, 0x0

    .line 200
    .line 201
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 202
    .line 203
    .line 204
    const v25, -0x405eb852    # -1.26f

    .line 205
    .line 206
    .line 207
    const v26, 0x3f6147ae    # 0.88f

    .line 208
    .line 209
    .line 210
    const v21, -0x40ee147b    # -0.57f

    .line 211
    .line 212
    .line 213
    const v23, -0x4075c28f    # -1.08f

    .line 214
    .line 215
    .line 216
    const v24, 0x3eb33333    # 0.35f

    .line 217
    .line 218
    .line 219
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 220
    .line 221
    .line 222
    const v25, 0x3f0f5c29    # 0.56f

    .line 223
    .line 224
    .line 225
    const v26, 0x3fbd70a4    # 1.48f

    .line 226
    .line 227
    .line 228
    const v21, -0x41bd70a4    # -0.19f

    .line 229
    .line 230
    .line 231
    const v22, 0x3f0f5c29    # 0.56f

    .line 232
    .line 233
    .line 234
    const v23, 0x3d23d70a    # 0.04f

    .line 235
    .line 236
    .line 237
    const v24, 0x3f95c28f    # 1.17f

    .line 238
    .line 239
    .line 240
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 241
    .line 242
    .line 243
    const v4, 0x3f051eb8    # 0.52f

    .line 244
    .line 245
    .line 246
    const v6, 0x3f5eb852    # 0.87f

    .line 247
    .line 248
    .line 249
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 250
    .line 251
    .line 252
    const v4, 0x4171999a    # 15.1f

    .line 253
    .line 254
    .line 255
    const v6, 0x4101eb85    # 8.12f

    .line 256
    .line 257
    .line 258
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 259
    .line 260
    .line 261
    const v25, 0x3ee66666    # 0.45f

    .line 262
    .line 263
    .line 264
    const v26, 0x3fcf5c29    # 1.62f

    .line 265
    .line 266
    .line 267
    const v21, -0x41947ae1    # -0.23f

    .line 268
    .line 269
    .line 270
    const v22, 0x3f147ae1    # 0.58f

    .line 271
    .line 272
    .line 273
    const v23, -0x42dc28f6    # -0.04f

    .line 274
    .line 275
    .line 276
    const/high16 v24, 0x3fa00000    # 1.25f

    .line 277
    .line 278
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 279
    .line 280
    .line 281
    const v25, 0x4182a3d7    # 16.33f

    .line 282
    .line 283
    .line 284
    const/high16 v26, 0x41200000    # 10.0f

    .line 285
    .line 286
    const v21, 0x417c7ae1    # 15.78f

    .line 287
    .line 288
    .line 289
    const v22, 0x411e8f5c    # 9.91f

    .line 290
    .line 291
    .line 292
    const v23, 0x41807ae1    # 16.06f

    .line 293
    .line 294
    .line 295
    const/high16 v24, 0x41200000    # 10.0f

    .line 296
    .line 297
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 298
    .line 299
    .line 300
    const v25, 0x3f5c28f6    # 0.86f

    .line 301
    .line 302
    .line 303
    const v26, -0x415c28f6    # -0.32f

    .line 304
    .line 305
    .line 306
    const v21, 0x3e9eb852    # 0.31f

    .line 307
    .line 308
    .line 309
    const/16 v22, 0x0

    .line 310
    .line 311
    const v23, 0x3f1c28f6    # 0.61f

    .line 312
    .line 313
    .line 314
    const v24, -0x421eb852    # -0.11f

    .line 315
    .line 316
    .line 317
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 318
    .line 319
    .line 320
    const v4, 0x410fae14    # 8.98f

    .line 321
    .line 322
    .line 323
    const/high16 v6, 0x41900000    # 18.0f

    .line 324
    .line 325
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 326
    .line 327
    .line 328
    const v4, 0x3f4f5c29    # 0.81f

    .line 329
    .line 330
    .line 331
    const v6, 0x3f333333    # 0.7f

    .line 332
    .line 333
    .line 334
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 335
    .line 336
    .line 337
    const v25, 0x419d5c29    # 19.67f

    .line 338
    .line 339
    .line 340
    const/high16 v26, 0x41200000    # 10.0f

    .line 341
    .line 342
    const v21, 0x41987ae1    # 19.06f

    .line 343
    .line 344
    .line 345
    const v22, 0x411e3d71    # 9.89f

    .line 346
    .line 347
    .line 348
    const v23, 0x419ae148    # 19.36f

    .line 349
    .line 350
    .line 351
    const/high16 v24, 0x41200000    # 10.0f

    .line 352
    .line 353
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 354
    .line 355
    .line 356
    const v25, 0x3f47ae14    # 0.78f

    .line 357
    .line 358
    .line 359
    const v26, -0x417ae148    # -0.26f

    .line 360
    .line 361
    .line 362
    const v21, 0x3e8a3d71    # 0.27f

    .line 363
    .line 364
    .line 365
    const/16 v22, 0x0

    .line 366
    .line 367
    const v23, 0x3f0ccccd    # 0.55f

    .line 368
    .line 369
    .line 370
    const v24, -0x4247ae14    # -0.09f

    .line 371
    .line 372
    .line 373
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 374
    .line 375
    .line 376
    const v25, 0x3ee66666    # 0.45f

    .line 377
    .line 378
    .line 379
    const v26, -0x4030a3d7    # -1.62f

    .line 380
    .line 381
    .line 382
    const/high16 v21, 0x3f000000    # 0.5f

    .line 383
    .line 384
    const v22, -0x41428f5c    # -0.37f

    .line 385
    .line 386
    .line 387
    const v23, 0x3f2e147b    # 0.68f

    .line 388
    .line 389
    .line 390
    const v24, -0x407ae148    # -1.04f

    .line 391
    .line 392
    .line 393
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 394
    .line 395
    .line 396
    const v4, -0x413851ec    # -0.39f

    .line 397
    .line 398
    .line 399
    const v6, -0x406147ae    # -1.24f

    .line 400
    .line 401
    .line 402
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 403
    .line 404
    .line 405
    const v4, -0x40fae148    # -0.52f

    .line 406
    .line 407
    .line 408
    const v6, 0x3f5eb852    # 0.87f

    .line 409
    .line 410
    .line 411
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 412
    .line 413
    .line 414
    const v25, 0x41af851f    # 21.94f

    .line 415
    .line 416
    .line 417
    const v26, 0x409c28f6    # 4.88f

    .line 418
    .line 419
    .line 420
    const v21, 0x41af1eb8    # 21.89f

    .line 421
    .line 422
    .line 423
    const v22, 0x40c1999a    # 6.05f

    .line 424
    .line 425
    .line 426
    const v23, 0x41b0f5c3    # 22.12f

    .line 427
    .line 428
    .line 429
    const v24, 0x40ae147b    # 5.44f

    .line 430
    .line 431
    .line 432
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 433
    .line 434
    .line 435
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 436
    .line 437
    .line 438
    const/high16 v4, 0x40e00000    # 7.0f

    .line 439
    .line 440
    const/high16 v6, 0x41900000    # 18.0f

    .line 441
    .line 442
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 443
    .line 444
    .line 445
    const/high16 v25, -0x40800000    # -1.0f

    .line 446
    .line 447
    const/high16 v26, -0x40800000    # -1.0f

    .line 448
    .line 449
    const v21, -0x40f33333    # -0.55f

    .line 450
    .line 451
    .line 452
    const/16 v22, 0x0

    .line 453
    .line 454
    const/high16 v23, -0x40800000    # -1.0f

    .line 455
    .line 456
    const v24, -0x4119999a    # -0.45f

    .line 457
    .line 458
    .line 459
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 460
    .line 461
    .line 462
    const/high16 v25, 0x3f800000    # 1.0f

    .line 463
    .line 464
    const/16 v21, 0x0

    .line 465
    .line 466
    const v22, -0x40f33333    # -0.55f

    .line 467
    .line 468
    .line 469
    const v23, 0x3ee66666    # 0.45f

    .line 470
    .line 471
    .line 472
    const/high16 v24, -0x40800000    # -1.0f

    .line 473
    .line 474
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 475
    .line 476
    .line 477
    const v4, 0x3ee66666    # 0.45f

    .line 478
    .line 479
    .line 480
    const/high16 v6, 0x3f800000    # 1.0f

    .line 481
    .line 482
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 483
    .line 484
    .line 485
    const/high16 v25, 0x41900000    # 18.0f

    .line 486
    .line 487
    const/high16 v26, 0x40e00000    # 7.0f

    .line 488
    .line 489
    const/high16 v21, 0x41980000    # 19.0f

    .line 490
    .line 491
    const v22, 0x40d1999a    # 6.55f

    .line 492
    .line 493
    .line 494
    const v23, 0x41946666    # 18.55f

    .line 495
    .line 496
    .line 497
    const/high16 v24, 0x40e00000    # 7.0f

    .line 498
    .line 499
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 500
    .line 501
    .line 502
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 503
    .line 504
    .line 505
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 506
    .line 507
    .line 508
    move-result-object v2

    .line 509
    const/16 v16, 0x3800

    .line 510
    .line 511
    const/16 v17, 0x0

    .line 512
    .line 513
    const/high16 v8, 0x3f800000    # 1.0f

    .line 514
    .line 515
    const/4 v7, 0x0

    .line 516
    const/high16 v9, 0x3f800000    # 1.0f

    .line 517
    .line 518
    const/high16 v12, 0x3f800000    # 1.0f

    .line 519
    .line 520
    const/4 v13, 0x0

    .line 521
    const/4 v14, 0x0

    .line 522
    const/4 v15, 0x0

    .line 523
    const-string v4, ""

    .line 524
    .line 525
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 526
    .line 527
    .line 528
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 529
    .line 530
    .line 531
    move-result v3

    .line 532
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 533
    .line 534
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 535
    .line 536
    .line 537
    move-result-wide v6

    .line 538
    const/4 v0, 0x0

    .line 539
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 540
    .line 541
    .line 542
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 543
    .line 544
    .line 545
    move-result v10

    .line 546
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 547
    .line 548
    .line 549
    move-result v11

    .line 550
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 551
    .line 552
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 553
    .line 554
    .line 555
    const/high16 v0, 0x41780000    # 15.5f

    .line 556
    .line 557
    const/high16 v2, 0x41400000    # 12.0f

    .line 558
    .line 559
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 560
    .line 561
    .line 562
    const v0, -0x40747ae1    # -1.09f

    .line 563
    .line 564
    .line 565
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 566
    .line 567
    .line 568
    const v17, -0x4091eb85    # -0.93f

    .line 569
    .line 570
    .line 571
    const v18, -0x404147ae    # -1.49f

    .line 572
    .line 573
    .line 574
    const v13, -0x41bd70a4    # -0.19f

    .line 575
    .line 576
    .line 577
    const v14, -0x40f5c28f    # -0.54f

    .line 578
    .line 579
    .line 580
    const v15, -0x41051eb8    # -0.49f

    .line 581
    .line 582
    .line 583
    const v16, -0x4079999a    # -1.05f

    .line 584
    .line 585
    .line 586
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 587
    .line 588
    .line 589
    const v0, 0x411c7ae1    # 9.78f

    .line 590
    .line 591
    .line 592
    const v2, 0x411970a4    # 9.59f

    .line 593
    .line 594
    .line 595
    const/high16 v4, 0x41400000    # 12.0f

    .line 596
    .line 597
    const v6, 0x4148a3d7    # 12.54f

    .line 598
    .line 599
    .line 600
    invoke-virtual {v12, v6, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 601
    .line 602
    .line 603
    const/high16 v0, 0x41080000    # 8.5f

    .line 604
    .line 605
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 606
    .line 607
    .line 608
    const/high16 v17, 0x41380000    # 11.5f

    .line 609
    .line 610
    const/high16 v18, 0x41000000    # 8.0f

    .line 611
    .line 612
    const/high16 v13, 0x41400000    # 12.0f

    .line 613
    .line 614
    const v14, 0x4103851f    # 8.22f

    .line 615
    .line 616
    .line 617
    const v15, 0x413c7ae1    # 11.78f

    .line 618
    .line 619
    .line 620
    const/high16 v16, 0x41000000    # 8.0f

    .line 621
    .line 622
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 623
    .line 624
    .line 625
    const v0, 0x4103851f    # 8.22f

    .line 626
    .line 627
    .line 628
    const/high16 v2, 0x41300000    # 11.0f

    .line 629
    .line 630
    const/high16 v4, 0x41080000    # 8.5f

    .line 631
    .line 632
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 633
    .line 634
    .line 635
    const v0, 0x3f6147ae    # 0.88f

    .line 636
    .line 637
    .line 638
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 639
    .line 640
    .line 641
    const v17, -0x4151eb85    # -0.34f

    .line 642
    .line 643
    .line 644
    const v18, -0x430a3d71    # -0.03f

    .line 645
    .line 646
    .line 647
    const v13, -0x421eb852    # -0.11f

    .line 648
    .line 649
    .line 650
    const v14, -0x43dc28f6    # -0.01f

    .line 651
    .line 652
    .line 653
    const v15, -0x41947ae1    # -0.23f

    .line 654
    .line 655
    .line 656
    const v16, -0x430a3d71    # -0.03f

    .line 657
    .line 658
    .line 659
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 660
    .line 661
    .line 662
    const v17, -0x3fcae148    # -2.83f

    .line 663
    .line 664
    .line 665
    const v18, 0x3f95c28f    # 1.17f

    .line 666
    .line 667
    .line 668
    const v13, -0x407d70a4    # -1.02f

    .line 669
    .line 670
    .line 671
    const/4 v14, 0x0

    .line 672
    const v15, -0x3ffccccd    # -2.05f

    .line 673
    .line 674
    .line 675
    const v16, 0x3ec7ae14    # 0.39f

    .line 676
    .line 677
    .line 678
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 679
    .line 680
    .line 681
    const v17, -0x4123d70a    # -0.43f

    .line 682
    .line 683
    .line 684
    const v18, 0x3f07ae14    # 0.53f

    .line 685
    .line 686
    .line 687
    const v13, -0x41dc28f6    # -0.16f

    .line 688
    .line 689
    .line 690
    const v14, 0x3e23d70a    # 0.16f

    .line 691
    .line 692
    .line 693
    const v15, -0x41666666    # -0.3f

    .line 694
    .line 695
    .line 696
    const v16, 0x3eae147b    # 0.34f

    .line 697
    .line 698
    .line 699
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 700
    .line 701
    .line 702
    const/high16 v0, 0x40c00000    # 6.0f

    .line 703
    .line 704
    const v2, 0x412851ec    # 10.52f

    .line 705
    .line 706
    .line 707
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 708
    .line 709
    .line 710
    const v17, -0x3f8ae148    # -3.83f

    .line 711
    .line 712
    .line 713
    const v18, 0x3fe8f5c3    # 1.82f

    .line 714
    .line 715
    .line 716
    const v13, -0x403851ec    # -1.56f

    .line 717
    .line 718
    .line 719
    const v14, -0x40f33333    # -0.55f

    .line 720
    .line 721
    .line 722
    const v15, -0x3fae147b    # -3.28f

    .line 723
    .line 724
    .line 725
    const v16, 0x3e8a3d71    # 0.27f

    .line 726
    .line 727
    .line 728
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 729
    .line 730
    .line 731
    const/16 v17, 0x0

    .line 732
    .line 733
    const/16 v18, 0x0

    .line 734
    .line 735
    const/4 v13, 0x0

    .line 736
    const/4 v14, 0x0

    .line 737
    const/4 v15, 0x0

    .line 738
    const/16 v16, 0x0

    .line 739
    .line 740
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 741
    .line 742
    .line 743
    const v17, 0x3df5c28f    # 0.12f

    .line 744
    .line 745
    .line 746
    const v18, 0x40128f5c    # 2.29f

    .line 747
    .line 748
    .line 749
    const v13, -0x4175c28f    # -0.27f

    .line 750
    .line 751
    .line 752
    const/high16 v14, 0x3f400000    # 0.75f

    .line 753
    .line 754
    const v15, -0x41947ae1    # -0.23f

    .line 755
    .line 756
    .line 757
    const v16, 0x3fc8f5c3    # 1.57f

    .line 758
    .line 759
    .line 760
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 761
    .line 762
    .line 763
    const/high16 v17, 0x3f800000    # 1.0f

    .line 764
    .line 765
    const v18, 0x3f947ae1    # 1.16f

    .line 766
    .line 767
    .line 768
    const v13, 0x3e6b851f    # 0.23f

    .line 769
    .line 770
    .line 771
    const v14, 0x3ef5c28f    # 0.48f

    .line 772
    .line 773
    .line 774
    const v15, 0x3f147ae1    # 0.58f

    .line 775
    .line 776
    .line 777
    const v16, 0x3f5eb852    # 0.87f

    .line 778
    .line 779
    .line 780
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 781
    .line 782
    .line 783
    const v18, 0x407a3d71    # 3.91f

    .line 784
    .line 785
    .line 786
    const v13, -0x413d70a4    # -0.38f

    .line 787
    .line 788
    .line 789
    const v14, 0x3faccccd    # 1.35f

    .line 790
    .line 791
    .line 792
    const v15, -0x428a3d71    # -0.06f

    .line 793
    .line 794
    .line 795
    const v16, 0x40366666    # 2.85f

    .line 796
    .line 797
    .line 798
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 799
    .line 800
    .line 801
    const v17, 0x407a3d71    # 3.91f

    .line 802
    .line 803
    .line 804
    const/high16 v18, 0x3f800000    # 1.0f

    .line 805
    .line 806
    const v13, 0x3f87ae14    # 1.06f

    .line 807
    .line 808
    .line 809
    const v14, 0x3f87ae14    # 1.06f

    .line 810
    .line 811
    .line 812
    const v15, 0x40247ae1    # 2.57f

    .line 813
    .line 814
    .line 815
    const v16, 0x3fb0a3d7    # 1.38f

    .line 816
    .line 817
    .line 818
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 819
    .line 820
    .line 821
    const v17, 0x3f947ae1    # 1.16f

    .line 822
    .line 823
    .line 824
    const v13, 0x3e947ae1    # 0.29f

    .line 825
    .line 826
    .line 827
    const v14, 0x3ed70a3d    # 0.42f

    .line 828
    .line 829
    .line 830
    const v15, 0x3f2e147b    # 0.68f

    .line 831
    .line 832
    .line 833
    const v16, 0x3f451eb8    # 0.77f

    .line 834
    .line 835
    .line 836
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 837
    .line 838
    .line 839
    const v17, 0x412a6666    # 10.65f

    .line 840
    .line 841
    .line 842
    const/high16 v18, 0x41b00000    # 22.0f

    .line 843
    .line 844
    const v13, 0x411c7ae1    # 9.78f

    .line 845
    .line 846
    .line 847
    const v14, 0x41af3333    # 21.9f

    .line 848
    .line 849
    .line 850
    const v15, 0x41235c29    # 10.21f

    .line 851
    .line 852
    .line 853
    const/high16 v16, 0x41b00000    # 22.0f

    .line 854
    .line 855
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 856
    .line 857
    .line 858
    const v17, 0x3f8147ae    # 1.01f

    .line 859
    .line 860
    .line 861
    const v18, -0x41d1eb85    # -0.17f

    .line 862
    .line 863
    .line 864
    const v13, 0x3eae147b    # 0.34f

    .line 865
    .line 866
    .line 867
    const/4 v14, 0x0

    .line 868
    const v15, 0x3f2e147b    # 0.68f

    .line 869
    .line 870
    .line 871
    const v16, -0x428a3d71    # -0.06f

    .line 872
    .line 873
    .line 874
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 875
    .line 876
    .line 877
    const/16 v17, 0x0

    .line 878
    .line 879
    const/16 v18, 0x0

    .line 880
    .line 881
    const/4 v13, 0x0

    .line 882
    const/4 v15, 0x0

    .line 883
    const/16 v16, 0x0

    .line 884
    .line 885
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 886
    .line 887
    .line 888
    const v17, 0x3fe8f5c3    # 1.82f

    .line 889
    .line 890
    .line 891
    const v18, -0x3f89999a    # -3.85f

    .line 892
    .line 893
    .line 894
    const v13, 0x3fc7ae14    # 1.56f

    .line 895
    .line 896
    .line 897
    const v14, -0x40f33333    # -0.55f

    .line 898
    .line 899
    .line 900
    const v15, 0x401851ec    # 2.38f

    .line 901
    .line 902
    .line 903
    const v16, -0x3feeb852    # -2.27f

    .line 904
    .line 905
    .line 906
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 907
    .line 908
    .line 909
    const v0, -0x4050a3d7    # -1.37f

    .line 910
    .line 911
    .line 912
    const v2, -0x40fae148    # -0.52f

    .line 913
    .line 914
    .line 915
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 916
    .line 917
    .line 918
    const v17, 0x3f07ae14    # 0.53f

    .line 919
    .line 920
    .line 921
    const v18, -0x4123d70a    # -0.43f

    .line 922
    .line 923
    .line 924
    const v13, 0x3e3851ec    # 0.18f

    .line 925
    .line 926
    .line 927
    const v14, -0x41fae148    # -0.13f

    .line 928
    .line 929
    .line 930
    const v15, 0x3eb851ec    # 0.36f

    .line 931
    .line 932
    .line 933
    const v16, -0x4175c28f    # -0.27f

    .line 934
    .line 935
    .line 936
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 937
    .line 938
    .line 939
    const v17, 0x3f91eb85    # 1.14f

    .line 940
    .line 941
    .line 942
    const v18, -0x3fb51eb8    # -3.17f

    .line 943
    .line 944
    .line 945
    const v13, 0x3f5eb852    # 0.87f

    .line 946
    .line 947
    .line 948
    const v14, -0x40a147ae    # -0.87f

    .line 949
    .line 950
    .line 951
    const v15, 0x3f9eb852    # 1.24f

    .line 952
    .line 953
    .line 954
    const v16, -0x3ffd70a4    # -2.04f

    .line 955
    .line 956
    .line 957
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 958
    .line 959
    .line 960
    const v0, 0x3f6147ae    # 0.88f

    .line 961
    .line 962
    .line 963
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 964
    .line 965
    .line 966
    const/high16 v17, 0x3f000000    # 0.5f

    .line 967
    .line 968
    const/high16 v18, -0x41000000    # -0.5f

    .line 969
    .line 970
    const v13, 0x3e8f5c29    # 0.28f

    .line 971
    .line 972
    .line 973
    const/4 v14, 0x0

    .line 974
    const/high16 v15, 0x3f000000    # 0.5f

    .line 975
    .line 976
    const v16, -0x419eb852    # -0.22f

    .line 977
    .line 978
    .line 979
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 980
    .line 981
    .line 982
    const/high16 v17, 0x41780000    # 15.5f

    .line 983
    .line 984
    const/high16 v18, 0x41400000    # 12.0f

    .line 985
    .line 986
    const/high16 v13, 0x41800000    # 16.0f

    .line 987
    .line 988
    const v14, 0x4143851f    # 12.22f

    .line 989
    .line 990
    .line 991
    const v15, 0x417c7ae1    # 15.78f

    .line 992
    .line 993
    .line 994
    const/high16 v16, 0x41400000    # 12.0f

    .line 995
    .line 996
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 997
    .line 998
    .line 999
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1000
    .line 1001
    .line 1002
    const v0, 0x409570a4    # 4.67f

    .line 1003
    .line 1004
    .line 1005
    const v2, 0x4164a3d7    # 14.29f

    .line 1006
    .line 1007
    .line 1008
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1009
    .line 1010
    .line 1011
    const v17, -0x40ee147b    # -0.57f

    .line 1012
    .line 1013
    .line 1014
    const v18, -0x40fd70a4    # -0.51f

    .line 1015
    .line 1016
    .line 1017
    const/high16 v13, -0x41800000    # -0.25f

    .line 1018
    .line 1019
    const v14, -0x4247ae14    # -0.09f

    .line 1020
    .line 1021
    .line 1022
    const v15, -0x4119999a    # -0.45f

    .line 1023
    .line 1024
    .line 1025
    const v16, -0x4175c28f    # -0.27f

    .line 1026
    .line 1027
    .line 1028
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1029
    .line 1030
    .line 1031
    const v0, -0x42dc28f6    # -0.04f

    .line 1032
    .line 1033
    .line 1034
    const v2, -0x40bd70a4    # -0.76f

    .line 1035
    .line 1036
    .line 1037
    const v4, -0x41fae148    # -0.13f

    .line 1038
    .line 1039
    .line 1040
    const v6, -0x40fd70a4    # -0.51f

    .line 1041
    .line 1042
    .line 1043
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1044
    .line 1045
    .line 1046
    const v17, 0x3fa147ae    # 1.26f

    .line 1047
    .line 1048
    .line 1049
    const v18, -0x40e3d70a    # -0.61f

    .line 1050
    .line 1051
    .line 1052
    const v13, 0x3e428f5c    # 0.19f

    .line 1053
    .line 1054
    .line 1055
    const v14, -0x40fae148    # -0.52f

    .line 1056
    .line 1057
    .line 1058
    const v15, 0x3f428f5c    # 0.76f

    .line 1059
    .line 1060
    .line 1061
    const v16, -0x40b5c28f    # -0.79f

    .line 1062
    .line 1063
    .line 1064
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1065
    .line 1066
    .line 1067
    const v0, 0x404a3d71    # 3.16f

    .line 1068
    .line 1069
    .line 1070
    const v2, 0x3f9851ec    # 1.19f

    .line 1071
    .line 1072
    .line 1073
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1074
    .line 1075
    .line 1076
    const v17, 0x409570a4    # 4.67f

    .line 1077
    .line 1078
    .line 1079
    const v18, 0x4164a3d7    # 14.29f

    .line 1080
    .line 1081
    .line 1082
    const v13, 0x40ea8f5c    # 7.33f

    .line 1083
    .line 1084
    .line 1085
    const v14, 0x41633333    # 14.2f

    .line 1086
    .line 1087
    .line 1088
    const v15, 0x40bb3333    # 5.85f

    .line 1089
    .line 1090
    .line 1091
    const v16, 0x416b5c29    # 14.71f

    .line 1092
    .line 1093
    .line 1094
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1095
    .line 1096
    .line 1097
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1098
    .line 1099
    .line 1100
    const v0, 0x412fd70a    # 10.99f

    .line 1101
    .line 1102
    .line 1103
    const v2, 0x419f851f    # 19.94f

    .line 1104
    .line 1105
    .line 1106
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1107
    .line 1108
    .line 1109
    const v17, -0x40bd70a4    # -0.76f

    .line 1110
    .line 1111
    .line 1112
    const v18, -0x42dc28f6    # -0.04f

    .line 1113
    .line 1114
    .line 1115
    const/high16 v13, -0x41800000    # -0.25f

    .line 1116
    .line 1117
    const v14, 0x3db851ec    # 0.09f

    .line 1118
    .line 1119
    .line 1120
    const v15, -0x40fae148    # -0.52f

    .line 1121
    .line 1122
    .line 1123
    const v16, 0x3da3d70a    # 0.08f

    .line 1124
    .line 1125
    .line 1126
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1127
    .line 1128
    .line 1129
    const v17, -0x40fd70a4    # -0.51f

    .line 1130
    .line 1131
    .line 1132
    const v18, -0x40ee147b    # -0.57f

    .line 1133
    .line 1134
    .line 1135
    const v13, -0x418a3d71    # -0.24f

    .line 1136
    .line 1137
    .line 1138
    const v14, -0x421eb852    # -0.11f

    .line 1139
    .line 1140
    .line 1141
    const v15, -0x4128f5c3    # -0.42f

    .line 1142
    .line 1143
    .line 1144
    const v16, -0x415c28f6    # -0.32f

    .line 1145
    .line 1146
    .line 1147
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1148
    .line 1149
    .line 1150
    const v17, 0x3f333333    # 0.7f

    .line 1151
    .line 1152
    .line 1153
    const v18, -0x3f8ccccd    # -3.8f

    .line 1154
    .line 1155
    .line 1156
    const v13, -0x4128f5c3    # -0.42f

    .line 1157
    .line 1158
    .line 1159
    const v14, -0x4068f5c3    # -1.18f

    .line 1160
    .line 1161
    .line 1162
    const v15, 0x3db851ec    # 0.09f

    .line 1163
    .line 1164
    .line 1165
    const v16, -0x3fd66666    # -2.65f

    .line 1166
    .line 1167
    .line 1168
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1169
    .line 1170
    .line 1171
    const v0, 0x3f970a3d    # 1.18f

    .line 1172
    .line 1173
    .line 1174
    const v2, 0x404851ec    # 3.13f

    .line 1175
    .line 1176
    .line 1177
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1178
    .line 1179
    .line 1180
    const v17, 0x412fd70a    # 10.99f

    .line 1181
    .line 1182
    .line 1183
    const v18, 0x419f851f    # 19.94f

    .line 1184
    .line 1185
    .line 1186
    const v13, 0x413c7ae1    # 11.78f

    .line 1187
    .line 1188
    .line 1189
    const v14, 0x419970a4    # 19.18f

    .line 1190
    .line 1191
    .line 1192
    const v15, 0x413828f6    # 11.51f

    .line 1193
    .line 1194
    .line 1195
    const v16, 0x419e147b    # 19.76f

    .line 1196
    .line 1197
    .line 1198
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1199
    .line 1200
    .line 1201
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1202
    .line 1203
    .line 1204
    const v0, 0x41433333    # 12.2f

    .line 1205
    .line 1206
    .line 1207
    const v2, 0x4169999a    # 14.6f

    .line 1208
    .line 1209
    .line 1210
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1211
    .line 1212
    .line 1213
    const v0, -0x40e3d70a    # -0.61f

    .line 1214
    .line 1215
    .line 1216
    const v2, -0x4031eb85    # -1.61f

    .line 1217
    .line 1218
    .line 1219
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1220
    .line 1221
    .line 1222
    const v17, -0x435c28f6    # -0.02f

    .line 1223
    .line 1224
    .line 1225
    const v18, -0x430a3d71    # -0.03f

    .line 1226
    .line 1227
    .line 1228
    const/4 v13, 0x0

    .line 1229
    const v14, -0x43dc28f6    # -0.01f

    .line 1230
    .line 1231
    .line 1232
    const v15, -0x43dc28f6    # -0.01f

    .line 1233
    .line 1234
    .line 1235
    const v16, -0x435c28f6    # -0.02f

    .line 1236
    .line 1237
    .line 1238
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1239
    .line 1240
    .line 1241
    const v17, -0x428a3d71    # -0.06f

    .line 1242
    .line 1243
    .line 1244
    const v18, -0x420a3d71    # -0.12f

    .line 1245
    .line 1246
    .line 1247
    const v13, -0x435c28f6    # -0.02f

    .line 1248
    .line 1249
    .line 1250
    const v14, -0x42dc28f6    # -0.04f

    .line 1251
    .line 1252
    .line 1253
    const v15, -0x42dc28f6    # -0.04f

    .line 1254
    .line 1255
    .line 1256
    const v16, -0x425c28f6    # -0.08f

    .line 1257
    .line 1258
    .line 1259
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1260
    .line 1261
    .line 1262
    const v17, -0x4270a3d7    # -0.07f

    .line 1263
    .line 1264
    .line 1265
    const v18, -0x421eb852    # -0.11f

    .line 1266
    .line 1267
    .line 1268
    const v16, -0x4270a3d7    # -0.07f

    .line 1269
    .line 1270
    .line 1271
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1272
    .line 1273
    .line 1274
    const v17, -0x4247ae14    # -0.09f

    .line 1275
    .line 1276
    .line 1277
    const v18, -0x4247ae14    # -0.09f

    .line 1278
    .line 1279
    .line 1280
    const v13, -0x430a3d71    # -0.03f

    .line 1281
    .line 1282
    .line 1283
    const v14, -0x430a3d71    # -0.03f

    .line 1284
    .line 1285
    .line 1286
    const v15, -0x428a3d71    # -0.06f

    .line 1287
    .line 1288
    .line 1289
    const v16, -0x428a3d71    # -0.06f

    .line 1290
    .line 1291
    .line 1292
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1293
    .line 1294
    .line 1295
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1296
    .line 1297
    .line 1298
    const v17, -0x421eb852    # -0.11f

    .line 1299
    .line 1300
    .line 1301
    const v18, -0x4270a3d7    # -0.07f

    .line 1302
    .line 1303
    .line 1304
    const v15, -0x4270a3d7    # -0.07f

    .line 1305
    .line 1306
    .line 1307
    const v16, -0x42b33333    # -0.05f

    .line 1308
    .line 1309
    .line 1310
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1311
    .line 1312
    .line 1313
    const v17, -0x420a3d71    # -0.12f

    .line 1314
    .line 1315
    .line 1316
    const v18, -0x428a3d71    # -0.06f

    .line 1317
    .line 1318
    .line 1319
    const v13, -0x42dc28f6    # -0.04f

    .line 1320
    .line 1321
    .line 1322
    const v14, -0x435c28f6    # -0.02f

    .line 1323
    .line 1324
    .line 1325
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1326
    .line 1327
    .line 1328
    const v17, -0x430a3d71    # -0.03f

    .line 1329
    .line 1330
    .line 1331
    const v18, -0x435c28f6    # -0.02f

    .line 1332
    .line 1333
    .line 1334
    const v13, -0x43dc28f6    # -0.01f

    .line 1335
    .line 1336
    .line 1337
    const/4 v14, 0x0

    .line 1338
    const v15, -0x435c28f6    # -0.02f

    .line 1339
    .line 1340
    .line 1341
    const v16, -0x43dc28f6    # -0.01f

    .line 1342
    .line 1343
    .line 1344
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1345
    .line 1346
    .line 1347
    const v0, 0x41166666    # 9.4f

    .line 1348
    .line 1349
    .line 1350
    const v2, 0x413ccccd    # 11.8f

    .line 1351
    .line 1352
    .line 1353
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1354
    .line 1355
    .line 1356
    const v17, 0x3fa147ae    # 1.26f

    .line 1357
    .line 1358
    .line 1359
    const v18, -0x41147ae1    # -0.46f

    .line 1360
    .line 1361
    .line 1362
    const v13, 0x3eb851ec    # 0.36f

    .line 1363
    .line 1364
    .line 1365
    const v14, -0x416b851f    # -0.29f

    .line 1366
    .line 1367
    .line 1368
    const v15, 0x3f4a3d71    # 0.79f

    .line 1369
    .line 1370
    .line 1371
    const v16, -0x41147ae1    # -0.46f

    .line 1372
    .line 1373
    .line 1374
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1375
    .line 1376
    .line 1377
    const v17, 0x3fb47ae1    # 1.41f

    .line 1378
    .line 1379
    .line 1380
    const v18, 0x3f170a3d    # 0.59f

    .line 1381
    .line 1382
    .line 1383
    const v13, 0x3f07ae14    # 0.53f

    .line 1384
    .line 1385
    .line 1386
    const/4 v14, 0x0

    .line 1387
    const v15, 0x3f851eb8    # 1.04f

    .line 1388
    .line 1389
    .line 1390
    const v16, 0x3e570a3d    # 0.21f

    .line 1391
    .line 1392
    .line 1393
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1394
    .line 1395
    .line 1396
    const v17, 0x41433333    # 12.2f

    .line 1397
    .line 1398
    .line 1399
    const v18, 0x4169999a    # 14.6f

    .line 1400
    .line 1401
    .line 1402
    const v13, 0x414ccccd    # 12.8f

    .line 1403
    .line 1404
    .line 1405
    const v14, 0x414a8f5c    # 12.66f

    .line 1406
    .line 1407
    .line 1408
    const v15, 0x414d70a4    # 12.84f

    .line 1409
    .line 1410
    .line 1411
    const v16, 0x415cf5c3    # 13.81f

    .line 1412
    .line 1413
    .line 1414
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1415
    .line 1416
    .line 1417
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1418
    .line 1419
    .line 1420
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 1421
    .line 1422
    .line 1423
    move-result-object v2

    .line 1424
    const/16 v16, 0x3800

    .line 1425
    .line 1426
    const/16 v17, 0x0

    .line 1427
    .line 1428
    const/high16 v6, 0x3f800000    # 1.0f

    .line 1429
    .line 1430
    const/4 v7, 0x0

    .line 1431
    const/high16 v12, 0x3f800000    # 1.0f

    .line 1432
    .line 1433
    const/4 v13, 0x0

    .line 1434
    const/4 v14, 0x0

    .line 1435
    const/4 v15, 0x0

    .line 1436
    const-string v4, ""

    .line 1437
    .line 1438
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 1439
    .line 1440
    .line 1441
    move-result-object v0

    .line 1442
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1443
    .line 1444
    .line 1445
    move-result-object v0

    .line 1446
    sput-object v0, Landroidx/compose/material/icons/rounded/EmojiNatureKt;->_emojiNature:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1447
    .line 1448
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 1449
    .line 1450
    .line 1451
    return-object v0
.end method
