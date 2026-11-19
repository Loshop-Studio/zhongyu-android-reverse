.class public final Landroidx/compose/material/icons/rounded/RotateRightKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u001e\u0010\u0002\u001a\u00020\u0001*\u00020\u00038FX\u0087\u0004\u00a2\u0006\u000c\u0012\u0004\u0008\u0004\u0010\u0005\u001a\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "_rotateRight",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "RotateRight",
        "Landroidx/compose/material/icons/Icons$Rounded;",
        "getRotateRight$annotations",
        "(Landroidx/compose/material/icons/Icons$Rounded;)V",
        "getRotateRight",
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
        "SMAP\nRotateRight.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RotateRight.kt\nandroidx/compose/material/icons/rounded/RotateRightKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,88:1\n212#2,12:89\n233#2,18:102\n253#2:139\n174#3:101\n705#4,2:120\n717#4,2:122\n719#4,11:128\n72#5,4:124\n*S KotlinDebug\n*F\n+ 1 RotateRight.kt\nandroidx/compose/material/icons/rounded/RotateRightKt\n*L\n35#1:89,12\n36#1:102,18\n36#1:139\n35#1:101\n36#1:120,2\n36#1:122,2\n36#1:128,11\n36#1:124,4\n*E\n"
    }
.end annotation


# static fields
.field private static _rotateRight:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getRotateRight(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/RotateRightKt;->_rotateRight:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.RotateRight"

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
    const v0, 0x416d47ae    # 14.83f

    .line 71
    .line 72
    .line 73
    const v2, 0x409a8f5c    # 4.83f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v0, 0x414b3333    # 12.7f

    .line 80
    .line 81
    .line 82
    const v2, 0x402ccccd    # 2.7f

    .line 83
    .line 84
    .line 85
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 86
    .line 87
    .line 88
    const v17, -0x40266666    # -1.7f

    .line 89
    .line 90
    .line 91
    const v18, 0x3f35c28f    # 0.71f

    .line 92
    .line 93
    .line 94
    const v13, -0x40e147ae    # -0.62f

    .line 95
    .line 96
    .line 97
    const v14, -0x40e147ae    # -0.62f

    .line 98
    .line 99
    .line 100
    const v15, -0x40266666    # -1.7f

    .line 101
    .line 102
    .line 103
    const v16, -0x41c7ae14    # -0.18f

    .line 104
    .line 105
    .line 106
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 107
    .line 108
    .line 109
    const v0, 0x3f28f5c3    # 0.66f

    .line 110
    .line 111
    .line 112
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 113
    .line 114
    .line 115
    const/high16 v17, 0x40800000    # 4.0f

    .line 116
    .line 117
    const/high16 v18, 0x41400000    # 12.0f

    .line 118
    .line 119
    const v13, 0x40e1eb85    # 7.06f

    .line 120
    .line 121
    .line 122
    const v14, 0x4091eb85    # 4.56f

    .line 123
    .line 124
    .line 125
    const/high16 v15, 0x40800000    # 4.0f

    .line 126
    .line 127
    const v16, 0x40fd70a4    # 7.92f

    .line 128
    .line 129
    .line 130
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 131
    .line 132
    .line 133
    const v17, 0x40b8a3d7    # 5.77f

    .line 134
    .line 135
    .line 136
    const v18, 0x40f5c28f    # 7.68f

    .line 137
    .line 138
    .line 139
    const/4 v13, 0x0

    .line 140
    const v14, 0x4068f5c3    # 3.64f

    .line 141
    .line 142
    .line 143
    const v15, 0x401b851f    # 2.43f

    .line 144
    .line 145
    .line 146
    const v16, 0x40d6b852    # 6.71f

    .line 147
    .line 148
    .line 149
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 150
    .line 151
    .line 152
    const v17, 0x3f9d70a4    # 1.23f

    .line 153
    .line 154
    .line 155
    const v18, -0x408a3d71    # -0.96f

    .line 156
    .line 157
    .line 158
    const v13, 0x3f1eb852    # 0.62f

    .line 159
    .line 160
    .line 161
    const v14, 0x3e3851ec    # 0.18f

    .line 162
    .line 163
    .line 164
    const v15, 0x3f9d70a4    # 1.23f

    .line 165
    .line 166
    .line 167
    const v16, -0x415c28f6    # -0.32f

    .line 168
    .line 169
    .line 170
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 171
    .line 172
    .line 173
    const v0, -0x430a3d71    # -0.03f

    .line 174
    .line 175
    .line 176
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 177
    .line 178
    .line 179
    const v17, -0x40d1eb85    # -0.68f

    .line 180
    .line 181
    .line 182
    const v18, -0x408f5c29    # -0.94f

    .line 183
    .line 184
    .line 185
    const/4 v13, 0x0

    .line 186
    const v14, -0x4123d70a    # -0.43f

    .line 187
    .line 188
    .line 189
    const v15, -0x4175c28f    # -0.27f

    .line 190
    .line 191
    .line 192
    const v16, -0x40ae147b    # -0.82f

    .line 193
    .line 194
    .line 195
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 196
    .line 197
    .line 198
    const/high16 v17, 0x40c00000    # 6.0f

    .line 199
    .line 200
    const/high16 v18, 0x41400000    # 12.0f

    .line 201
    .line 202
    const v13, 0x40fa3d71    # 7.82f

    .line 203
    .line 204
    .line 205
    const v14, 0x41883d71    # 17.03f

    .line 206
    .line 207
    .line 208
    const/high16 v15, 0x40c00000    # 6.0f

    .line 209
    .line 210
    const v16, 0x416bae14    # 14.73f

    .line 211
    .line 212
    .line 213
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 214
    .line 215
    .line 216
    const/high16 v17, 0x40a00000    # 5.0f

    .line 217
    .line 218
    const v18, -0x3f42e148    # -5.91f

    .line 219
    .line 220
    .line 221
    const/4 v13, 0x0

    .line 222
    const v14, -0x3fc1eb85    # -2.97f

    .line 223
    .line 224
    .line 225
    const v15, 0x400a3d71    # 2.16f

    .line 226
    .line 227
    .line 228
    const v16, -0x3f523d71    # -5.43f

    .line 229
    .line 230
    .line 231
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 232
    .line 233
    .line 234
    const v0, 0x3fc3d70a    # 1.53f

    .line 235
    .line 236
    .line 237
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 238
    .line 239
    .line 240
    const v17, 0x3fd9999a    # 1.7f

    .line 241
    .line 242
    .line 243
    const v18, 0x3f35c28f    # 0.71f

    .line 244
    .line 245
    .line 246
    const v14, 0x3f63d70a    # 0.89f

    .line 247
    .line 248
    .line 249
    const v15, 0x3f88f5c3    # 1.07f

    .line 250
    .line 251
    .line 252
    const v16, 0x3faa3d71    # 1.33f

    .line 253
    .line 254
    .line 255
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 256
    .line 257
    .line 258
    const v0, 0x400851ec    # 2.13f

    .line 259
    .line 260
    .line 261
    const v2, -0x3ffae148    # -2.08f

    .line 262
    .line 263
    .line 264
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 265
    .line 266
    .line 267
    const/16 v17, 0x0

    .line 268
    .line 269
    const v18, -0x404a3d71    # -1.42f

    .line 270
    .line 271
    .line 272
    const v13, 0x3ecccccd    # 0.4f

    .line 273
    .line 274
    .line 275
    const v14, -0x413d70a4    # -0.38f

    .line 276
    .line 277
    .line 278
    const v15, 0x3ecccccd    # 0.4f

    .line 279
    .line 280
    .line 281
    const v16, -0x407d70a4    # -1.02f

    .line 282
    .line 283
    .line 284
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 285
    .line 286
    .line 287
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 288
    .line 289
    .line 290
    const v0, 0x419d5c29    # 19.67f

    .line 291
    .line 292
    .line 293
    const v2, 0x411c28f6    # 9.76f

    .line 294
    .line 295
    .line 296
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 297
    .line 298
    .line 299
    const v17, -0x40d70a3d    # -0.66f

    .line 300
    .line 301
    .line 302
    const v18, -0x40347ae1    # -1.59f

    .line 303
    .line 304
    .line 305
    const v13, -0x41dc28f6    # -0.16f

    .line 306
    .line 307
    .line 308
    const v14, -0x40f33333    # -0.55f

    .line 309
    .line 310
    .line 311
    const v15, -0x413d70a4    # -0.38f

    .line 312
    .line 313
    .line 314
    const v16, -0x4075c28f    # -1.08f

    .line 315
    .line 316
    .line 317
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 318
    .line 319
    .line 320
    const v17, -0x403851ec    # -1.56f

    .line 321
    .line 322
    .line 323
    const v18, -0x41b33333    # -0.2f

    .line 324
    .line 325
    .line 326
    const v13, -0x416147ae    # -0.31f

    .line 327
    .line 328
    .line 329
    const v14, -0x40ee147b    # -0.57f

    .line 330
    .line 331
    .line 332
    const v15, -0x40733333    # -1.1f

    .line 333
    .line 334
    .line 335
    const v16, -0x40d70a3d    # -0.66f

    .line 336
    .line 337
    .line 338
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 339
    .line 340
    .line 341
    const v0, -0x43dc28f6    # -0.01f

    .line 342
    .line 343
    .line 344
    const v2, 0x3c23d70a    # 0.01f

    .line 345
    .line 346
    .line 347
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 348
    .line 349
    .line 350
    const v17, -0x41d1eb85    # -0.17f

    .line 351
    .line 352
    .line 353
    const v18, 0x3f947ae1    # 1.16f

    .line 354
    .line 355
    .line 356
    const v14, 0x3e9eb852    # 0.31f

    .line 357
    .line 358
    .line 359
    const v15, -0x413d70a4    # -0.38f

    .line 360
    .line 361
    .line 362
    const v16, 0x3f47ae14    # 0.78f

    .line 363
    .line 364
    .line 365
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 366
    .line 367
    .line 368
    const v17, 0x3ef5c28f    # 0.48f

    .line 369
    .line 370
    .line 371
    const v13, 0x3e4ccccd    # 0.2f

    .line 372
    .line 373
    .line 374
    const v14, 0x3ebd70a4    # 0.37f

    .line 375
    .line 376
    .line 377
    const v15, 0x3eb851ec    # 0.36f

    .line 378
    .line 379
    .line 380
    const v16, 0x3f428f5c    # 0.76f

    .line 381
    .line 382
    .line 383
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 384
    .line 385
    .line 386
    const v17, 0x3f70a3d7    # 0.94f

    .line 387
    .line 388
    .line 389
    const v18, 0x3f333333    # 0.7f

    .line 390
    .line 391
    .line 392
    const v13, 0x3df5c28f    # 0.12f

    .line 393
    .line 394
    .line 395
    const v14, 0x3ed70a3d    # 0.42f

    .line 396
    .line 397
    .line 398
    const v15, 0x3f028f5c    # 0.51f

    .line 399
    .line 400
    .line 401
    const v16, 0x3f333333    # 0.7f

    .line 402
    .line 403
    .line 404
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 405
    .line 406
    .line 407
    const v0, 0x3ca3d70a    # 0.02f

    .line 408
    .line 409
    .line 410
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 411
    .line 412
    .line 413
    const v17, 0x3f75c28f    # 0.96f

    .line 414
    .line 415
    .line 416
    const v18, -0x406147ae    # -1.24f

    .line 417
    .line 418
    .line 419
    const v13, 0x3f266666    # 0.65f

    .line 420
    .line 421
    .line 422
    const/4 v14, 0x0

    .line 423
    const v15, 0x3f933333    # 1.15f

    .line 424
    .line 425
    .line 426
    const v16, -0x40e147ae    # -0.62f

    .line 427
    .line 428
    .line 429
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 430
    .line 431
    .line 432
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 433
    .line 434
    .line 435
    const/high16 v0, 0x41500000    # 13.0f

    .line 436
    .line 437
    const v2, 0x419570a4    # 18.68f

    .line 438
    .line 439
    .line 440
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 441
    .line 442
    .line 443
    const v0, 0x3ca3d70a    # 0.02f

    .line 444
    .line 445
    .line 446
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 447
    .line 448
    .line 449
    const v17, 0x3f9eb852    # 1.24f

    .line 450
    .line 451
    .line 452
    const v18, 0x3f75c28f    # 0.96f

    .line 453
    .line 454
    .line 455
    const/4 v13, 0x0

    .line 456
    const v14, 0x3f266666    # 0.65f

    .line 457
    .line 458
    .line 459
    const v15, 0x3f1eb852    # 0.62f

    .line 460
    .line 461
    .line 462
    const v16, 0x3f91eb85    # 1.14f

    .line 463
    .line 464
    .line 465
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 466
    .line 467
    .line 468
    const v17, 0x3fcb851f    # 1.59f

    .line 469
    .line 470
    .line 471
    const v18, -0x40d70a3d    # -0.66f

    .line 472
    .line 473
    .line 474
    const v13, 0x3f0ccccd    # 0.55f

    .line 475
    .line 476
    .line 477
    const v14, -0x41dc28f6    # -0.16f

    .line 478
    .line 479
    .line 480
    const v15, 0x3f8a3d71    # 1.08f

    .line 481
    .line 482
    .line 483
    const v16, -0x413d70a4    # -0.38f

    .line 484
    .line 485
    .line 486
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 487
    .line 488
    .line 489
    const v17, 0x3e4ccccd    # 0.2f

    .line 490
    .line 491
    .line 492
    const v18, -0x403851ec    # -1.56f

    .line 493
    .line 494
    .line 495
    const v13, 0x3f11eb85    # 0.57f

    .line 496
    .line 497
    .line 498
    const v14, -0x416147ae    # -0.31f

    .line 499
    .line 500
    .line 501
    const v15, 0x3f28f5c3    # 0.66f

    .line 502
    .line 503
    .line 504
    const v16, -0x40733333    # -1.1f

    .line 505
    .line 506
    .line 507
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 508
    .line 509
    .line 510
    const v0, -0x435c28f6    # -0.02f

    .line 511
    .line 512
    .line 513
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 514
    .line 515
    .line 516
    const v17, -0x406b851f    # -1.16f

    .line 517
    .line 518
    .line 519
    const v18, -0x41d1eb85    # -0.17f

    .line 520
    .line 521
    .line 522
    const v13, -0x416147ae    # -0.31f

    .line 523
    .line 524
    .line 525
    const v15, -0x40b851ec    # -0.78f

    .line 526
    .line 527
    .line 528
    const v16, -0x413d70a4    # -0.38f

    .line 529
    .line 530
    .line 531
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 532
    .line 533
    .line 534
    const v18, 0x3efae148    # 0.49f

    .line 535
    .line 536
    .line 537
    const v13, -0x41428f5c    # -0.37f

    .line 538
    .line 539
    .line 540
    const v14, 0x3e570a3d    # 0.21f

    .line 541
    .line 542
    .line 543
    const v15, -0x40bd70a4    # -0.76f

    .line 544
    .line 545
    .line 546
    const v16, 0x3ebd70a4    # 0.37f

    .line 547
    .line 548
    .line 549
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 550
    .line 551
    .line 552
    const v17, -0x40cf5c29    # -0.69f

    .line 553
    .line 554
    .line 555
    const v18, 0x3f70a3d7    # 0.94f

    .line 556
    .line 557
    .line 558
    const v13, -0x412e147b    # -0.41f

    .line 559
    .line 560
    .line 561
    const v14, 0x3df5c28f    # 0.12f

    .line 562
    .line 563
    .line 564
    const v15, -0x40cf5c29    # -0.69f

    .line 565
    .line 566
    .line 567
    const v16, 0x3f028f5c    # 0.51f

    .line 568
    .line 569
    .line 570
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 571
    .line 572
    .line 573
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 574
    .line 575
    .line 576
    const v0, 0x418b851f    # 17.44f

    .line 577
    .line 578
    .line 579
    const v2, 0x41803d71    # 16.03f

    .line 580
    .line 581
    .line 582
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 583
    .line 584
    .line 585
    const v17, 0x3fc7ae14    # 1.56f

    .line 586
    .line 587
    .line 588
    const v18, -0x41b33333    # -0.2f

    .line 589
    .line 590
    .line 591
    const v13, 0x3eeb851f    # 0.46f

    .line 592
    .line 593
    .line 594
    const v14, 0x3eeb851f    # 0.46f

    .line 595
    .line 596
    .line 597
    const/high16 v15, 0x3fa00000    # 1.25f

    .line 598
    .line 599
    const v16, 0x3ebd70a4    # 0.37f

    .line 600
    .line 601
    .line 602
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 603
    .line 604
    .line 605
    const v17, 0x3f2b851f    # 0.67f

    .line 606
    .line 607
    .line 608
    const v18, -0x40347ae1    # -1.59f

    .line 609
    .line 610
    .line 611
    const v13, 0x3e8f5c29    # 0.28f

    .line 612
    .line 613
    .line 614
    const v14, -0x40fd70a4    # -0.51f

    .line 615
    .line 616
    .line 617
    const/high16 v15, 0x3f000000    # 0.5f

    .line 618
    .line 619
    const v16, -0x407ae148    # -1.04f

    .line 620
    .line 621
    .line 622
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 623
    .line 624
    .line 625
    const v17, -0x408a3d71    # -0.96f

    .line 626
    .line 627
    .line 628
    const v18, -0x406147ae    # -1.24f

    .line 629
    .line 630
    .line 631
    const v13, 0x3e3851ec    # 0.18f

    .line 632
    .line 633
    .line 634
    const v14, -0x40e147ae    # -0.62f

    .line 635
    .line 636
    .line 637
    const v15, -0x416147ae    # -0.31f

    .line 638
    .line 639
    .line 640
    const v16, -0x406147ae    # -1.24f

    .line 641
    .line 642
    .line 643
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 644
    .line 645
    .line 646
    const v0, -0x435c28f6    # -0.02f

    .line 647
    .line 648
    .line 649
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 650
    .line 651
    .line 652
    const v17, -0x408f5c29    # -0.94f

    .line 653
    .line 654
    .line 655
    const v18, 0x3f333333    # 0.7f

    .line 656
    .line 657
    .line 658
    const v13, -0x411eb852    # -0.44f

    .line 659
    .line 660
    .line 661
    const/4 v14, 0x0

    .line 662
    const v15, -0x40ae147b    # -0.82f

    .line 663
    .line 664
    .line 665
    const v16, 0x3e8f5c29    # 0.28f

    .line 666
    .line 667
    .line 668
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 669
    .line 670
    .line 671
    const v17, -0x410a3d71    # -0.48f

    .line 672
    .line 673
    .line 674
    const v18, 0x3f95c28f    # 1.17f

    .line 675
    .line 676
    .line 677
    const v13, -0x420a3d71    # -0.12f

    .line 678
    .line 679
    .line 680
    const v14, 0x3ecccccd    # 0.4f

    .line 681
    .line 682
    .line 683
    const v15, -0x4170a3d7    # -0.28f

    .line 684
    .line 685
    .line 686
    const v16, 0x3f4a3d71    # 0.79f

    .line 687
    .line 688
    .line 689
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 690
    .line 691
    .line 692
    const v17, 0x3e2e147b    # 0.17f

    .line 693
    .line 694
    .line 695
    const v18, 0x3f947ae1    # 1.16f

    .line 696
    .line 697
    .line 698
    const v13, -0x41a8f5c3    # -0.21f

    .line 699
    .line 700
    .line 701
    const v14, 0x3ec28f5c    # 0.38f

    .line 702
    .line 703
    .line 704
    const v15, -0x41fae148    # -0.13f

    .line 705
    .line 706
    .line 707
    const v16, 0x3f5c28f6    # 0.86f

    .line 708
    .line 709
    .line 710
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 711
    .line 712
    .line 713
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 714
    .line 715
    .line 716
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 717
    .line 718
    .line 719
    move-result-object v2

    .line 720
    const/16 v16, 0x3800

    .line 721
    .line 722
    const/16 v17, 0x0

    .line 723
    .line 724
    const/high16 v6, 0x3f800000    # 1.0f

    .line 725
    .line 726
    const/high16 v8, 0x3f800000    # 1.0f

    .line 727
    .line 728
    const/4 v7, 0x0

    .line 729
    const/high16 v9, 0x3f800000    # 1.0f

    .line 730
    .line 731
    const/high16 v12, 0x3f800000    # 1.0f

    .line 732
    .line 733
    const/4 v13, 0x0

    .line 734
    const/4 v14, 0x0

    .line 735
    const/4 v15, 0x0

    .line 736
    const-string v4, ""

    .line 737
    .line 738
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 739
    .line 740
    .line 741
    move-result-object v0

    .line 742
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 743
    .line 744
    .line 745
    move-result-object v0

    .line 746
    sput-object v0, Landroidx/compose/material/icons/rounded/RotateRightKt;->_rotateRight:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 747
    .line 748
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 749
    .line 750
    .line 751
    return-object v0
.end method

.method public static synthetic getRotateRight$annotations(Landroidx/compose/material/icons/Icons$Rounded;)V
    .locals 0
    .annotation runtime Lkotlin/Deprecated;
        message = "Use the AutoMirrored version at Icons.AutoMirrored.Rounded.RotateRight"
        replaceWith = .subannotation Lkotlin/ReplaceWith;
            expression = "Icons.AutoMirrored.Rounded.RotateRight"
            imports = {
                "androidx.compose.material.icons.automirrored.rounded.RotateRight"
            }
        .end subannotation
    .end annotation

    return-void
.end method
