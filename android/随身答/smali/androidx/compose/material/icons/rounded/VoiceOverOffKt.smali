.class public final Landroidx/compose/material/icons/rounded/VoiceOverOffKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_voiceOverOff",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "VoiceOverOff",
        "Landroidx/compose/material/icons/Icons$Rounded;",
        "getVoiceOverOff",
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
        "SMAP\nVoiceOverOff.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VoiceOverOff.kt\nandroidx/compose/material/icons/rounded/VoiceOverOffKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,78:1\n212#2,12:79\n233#2,18:92\n253#2:129\n174#3:91\n705#4,2:110\n717#4,2:112\n719#4,11:118\n72#5,4:114\n*S KotlinDebug\n*F\n+ 1 VoiceOverOff.kt\nandroidx/compose/material/icons/rounded/VoiceOverOffKt\n*L\n29#1:79,12\n30#1:92,18\n30#1:129\n29#1:91\n30#1:110,2\n30#1:112,2\n30#1:118,11\n30#1:114,4\n*E\n"
    }
.end annotation


# static fields
.field private static _voiceOverOff:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getVoiceOverOff(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/VoiceOverOffKt;->_voiceOverOff:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.VoiceOverOff"

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
    const v0, 0x417b851f    # 15.72f

    .line 71
    .line 72
    .line 73
    const v2, 0x40cd1eb8    # 6.41f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const/high16 v17, -0x41800000    # -0.25f

    .line 80
    .line 81
    const v18, 0x3faccccd    # 1.35f

    .line 82
    .line 83
    .line 84
    const v13, -0x414ccccd    # -0.35f

    .line 85
    .line 86
    .line 87
    const v14, 0x3eb33333    # 0.35f

    .line 88
    .line 89
    .line 90
    const v15, -0x411eb852    # -0.44f

    .line 91
    .line 92
    .line 93
    const v16, 0x3f6147ae    # 0.88f

    .line 94
    .line 95
    .line 96
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 97
    .line 98
    .line 99
    const v17, 0x3d4ccccd    # 0.05f

    .line 100
    .line 101
    .line 102
    const v18, 0x4015c28f    # 2.34f

    .line 103
    .line 104
    .line 105
    const v13, 0x3e99999a    # 0.3f

    .line 106
    .line 107
    .line 108
    const/high16 v14, 0x3f400000    # 0.75f

    .line 109
    .line 110
    const v15, 0x3ea3d70a    # 0.32f

    .line 111
    .line 112
    .line 113
    const v16, 0x3fca3d71    # 1.58f

    .line 114
    .line 115
    .line 116
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 117
    .line 118
    .line 119
    const v17, 0x3e947ae1    # 0.29f

    .line 120
    .line 121
    .line 122
    const v18, 0x3fa8f5c3    # 1.32f

    .line 123
    .line 124
    .line 125
    const v13, -0x41dc28f6    # -0.16f

    .line 126
    .line 127
    .line 128
    const v14, 0x3eeb851f    # 0.46f

    .line 129
    .line 130
    .line 131
    const v15, -0x428a3d71    # -0.06f

    .line 132
    .line 133
    .line 134
    const v16, 0x3f7ae148    # 0.98f

    .line 135
    .line 136
    .line 137
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 138
    .line 139
    .line 140
    const v17, 0x400147ae    # 2.02f

    .line 141
    .line 142
    .line 143
    const v18, -0x416147ae    # -0.31f

    .line 144
    .line 145
    .line 146
    const v13, 0x3f19999a    # 0.6f

    .line 147
    .line 148
    .line 149
    const v14, 0x3f19999a    # 0.6f

    .line 150
    .line 151
    .line 152
    const v15, 0x3fd47ae1    # 1.66f

    .line 153
    .line 154
    .line 155
    const v16, 0x3ef0a3d7    # 0.47f

    .line 156
    .line 157
    .line 158
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 159
    .line 160
    .line 161
    const v17, -0x420a3d71    # -0.12f

    .line 162
    .line 163
    .line 164
    const v18, -0x3f72e148    # -4.41f

    .line 165
    .line 166
    .line 167
    const v13, 0x3f23d70a    # 0.64f

    .line 168
    .line 169
    .line 170
    const v14, -0x404e147b    # -1.39f

    .line 171
    .line 172
    .line 173
    const v15, 0x3f19999a    # 0.6f

    .line 174
    .line 175
    .line 176
    const v16, -0x3fc0a3d7    # -2.99f

    .line 177
    .line 178
    .line 179
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 180
    .line 181
    .line 182
    const v17, -0x400147ae    # -1.99f

    .line 183
    .line 184
    .line 185
    const v18, -0x416b851f    # -0.29f

    .line 186
    .line 187
    .line 188
    const v13, -0x41333333    # -0.4f

    .line 189
    .line 190
    .line 191
    const/high16 v14, -0x40c00000    # -0.75f

    .line 192
    .line 193
    const v15, -0x404b851f    # -1.41f

    .line 194
    .line 195
    .line 196
    const v16, -0x409eb852    # -0.88f

    .line 197
    .line 198
    .line 199
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 200
    .line 201
    .line 202
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 203
    .line 204
    .line 205
    const v0, 0x419970a4    # 19.18f

    .line 206
    .line 207
    .line 208
    const v2, 0x4038f5c3    # 2.89f

    .line 209
    .line 210
    .line 211
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 212
    .line 213
    .line 214
    const v17, -0x41fae148    # -0.13f

    .line 215
    .line 216
    .line 217
    const v18, 0x3fbd70a4    # 1.48f

    .line 218
    .line 219
    .line 220
    const v14, 0x3ecccccd    # 0.4f

    .line 221
    .line 222
    .line 223
    const v15, -0x41147ae1    # -0.46f

    .line 224
    .line 225
    .line 226
    const v16, 0x3f828f5c    # 1.02f

    .line 227
    .line 228
    .line 229
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 230
    .line 231
    .line 232
    const v17, 0x3db851ec    # 0.09f

    .line 233
    .line 234
    .line 235
    const v18, 0x41111eb8    # 9.07f

    .line 236
    .line 237
    .line 238
    const v13, 0x3ff70a3d    # 1.93f

    .line 239
    .line 240
    .line 241
    const v14, 0x402b851f    # 2.68f

    .line 242
    .line 243
    .line 244
    const v15, 0x3ff9999a    # 1.95f

    .line 245
    .line 246
    .line 247
    const/high16 v16, 0x40c80000    # 6.25f

    .line 248
    .line 249
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 250
    .line 251
    .line 252
    const v17, 0x3e23d70a    # 0.16f

    .line 253
    .line 254
    .line 255
    const v18, 0x3fbc28f6    # 1.47f

    .line 256
    .line 257
    .line 258
    const v13, -0x416147ae    # -0.31f

    .line 259
    .line 260
    .line 261
    const v14, 0x3eeb851f    # 0.46f

    .line 262
    .line 263
    .line 264
    const v15, -0x41947ae1    # -0.23f

    .line 265
    .line 266
    .line 267
    const v16, 0x3f8a3d71    # 1.08f

    .line 268
    .line 269
    .line 270
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 271
    .line 272
    .line 273
    const v17, 0x3fe7ae14    # 1.81f

    .line 274
    .line 275
    .line 276
    const v18, -0x41fae148    # -0.13f

    .line 277
    .line 278
    .line 279
    const v13, 0x3f028f5c    # 0.51f

    .line 280
    .line 281
    .line 282
    const v14, 0x3f028f5c    # 0.51f

    .line 283
    .line 284
    .line 285
    const v15, 0x3fb0a3d7    # 1.38f

    .line 286
    .line 287
    .line 288
    const v16, 0x3eeb851f    # 0.46f

    .line 289
    .line 290
    .line 291
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 292
    .line 293
    .line 294
    const v17, -0x41d1eb85    # -0.17f

    .line 295
    .line 296
    .line 297
    const v18, -0x3ec3ae14    # -11.77f

    .line 298
    .line 299
    .line 300
    const v13, 0x40247ae1    # 2.57f

    .line 301
    .line 302
    .line 303
    const v14, -0x3f9f5c29    # -3.51f

    .line 304
    .line 305
    .line 306
    const v15, 0x402147ae    # 2.52f

    .line 307
    .line 308
    .line 309
    const v16, -0x3efccccd    # -8.2f

    .line 310
    .line 311
    .line 312
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 313
    .line 314
    .line 315
    const v17, -0x401eb852    # -1.76f

    .line 316
    .line 317
    .line 318
    const v18, -0x420a3d71    # -0.12f

    .line 319
    .line 320
    .line 321
    const v13, -0x4123d70a    # -0.43f

    .line 322
    .line 323
    .line 324
    const v14, -0x40f0a3d7    # -0.56f

    .line 325
    .line 326
    .line 327
    const v15, -0x405eb852    # -1.26f

    .line 328
    .line 329
    .line 330
    const v16, -0x40e147ae    # -0.62f

    .line 331
    .line 332
    .line 333
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 334
    .line 335
    .line 336
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 337
    .line 338
    .line 339
    const v0, 0x4116e148    # 9.43f

    .line 340
    .line 341
    .line 342
    const v2, 0x40a147ae    # 5.04f

    .line 343
    .line 344
    .line 345
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 346
    .line 347
    .line 348
    const v0, 0x4061eb85    # 3.53f

    .line 349
    .line 350
    .line 351
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 352
    .line 353
    .line 354
    const v17, -0x3f9e147b    # -3.53f

    .line 355
    .line 356
    .line 357
    const v18, -0x3f9e147b    # -3.53f

    .line 358
    .line 359
    .line 360
    const v13, -0x41b33333    # -0.2f

    .line 361
    .line 362
    .line 363
    const v14, -0x4011eb85    # -1.86f

    .line 364
    .line 365
    .line 366
    const v15, -0x402a3d71    # -1.67f

    .line 367
    .line 368
    .line 369
    const v16, -0x3faae148    # -3.33f

    .line 370
    .line 371
    .line 372
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 373
    .line 374
    .line 375
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 376
    .line 377
    .line 378
    const v0, 0x406d70a4    # 3.71f

    .line 379
    .line 380
    .line 381
    const v2, 0x4063d70a    # 3.56f

    .line 382
    .line 383
    .line 384
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 385
    .line 386
    .line 387
    const/16 v17, 0x0

    .line 388
    .line 389
    const v18, 0x3fb47ae1    # 1.41f

    .line 390
    .line 391
    .line 392
    const v13, -0x413851ec    # -0.39f

    .line 393
    .line 394
    .line 395
    const v14, 0x3ec7ae14    # 0.39f

    .line 396
    .line 397
    .line 398
    const v15, -0x413851ec    # -0.39f

    .line 399
    .line 400
    .line 401
    const v16, 0x3f828f5c    # 1.02f

    .line 402
    .line 403
    .line 404
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 405
    .line 406
    .line 407
    const v0, 0x3ff47ae1    # 1.91f

    .line 408
    .line 409
    .line 410
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 411
    .line 412
    .line 413
    const v17, -0x410f5c29    # -0.47f

    .line 414
    .line 415
    .line 416
    const v18, 0x404ccccd    # 3.2f

    .line 417
    .line 418
    .line 419
    const v13, -0x40f0a3d7    # -0.56f

    .line 420
    .line 421
    .line 422
    const v14, 0x3f63d70a    # 0.89f

    .line 423
    .line 424
    .line 425
    const v15, -0x40b5c28f    # -0.79f

    .line 426
    .line 427
    .line 428
    const v16, 0x4000a3d7    # 2.01f

    .line 429
    .line 430
    .line 431
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 432
    .line 433
    .line 434
    const v17, 0x403147ae    # 2.77f

    .line 435
    .line 436
    .line 437
    const v18, 0x403147ae    # 2.77f

    .line 438
    .line 439
    .line 440
    const v13, 0x3eb851ec    # 0.36f

    .line 441
    .line 442
    .line 443
    const v14, 0x3faa3d71    # 1.33f

    .line 444
    .line 445
    .line 446
    const v15, 0x3fb851ec    # 1.44f

    .line 447
    .line 448
    .line 449
    const v16, 0x4019999a    # 2.4f

    .line 450
    .line 451
    .line 452
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 453
    .line 454
    .line 455
    const v17, 0x404ccccd    # 3.2f

    .line 456
    .line 457
    .line 458
    const v18, -0x410f5c29    # -0.47f

    .line 459
    .line 460
    .line 461
    const v13, 0x3f9851ec    # 1.19f

    .line 462
    .line 463
    .line 464
    const v14, 0x3ea8f5c3    # 0.33f

    .line 465
    .line 466
    .line 467
    const v15, 0x4013d70a    # 2.31f

    .line 468
    .line 469
    .line 470
    const v16, 0x3db851ec    # 0.09f

    .line 471
    .line 472
    .line 473
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 474
    .line 475
    .line 476
    const v0, 0x408ccccd    # 4.4f

    .line 477
    .line 478
    .line 479
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 480
    .line 481
    .line 482
    const/high16 v17, 0x41100000    # 9.0f

    .line 483
    .line 484
    const/high16 v18, 0x41700000    # 15.0f

    .line 485
    .line 486
    const v13, 0x415bd70a    # 13.74f

    .line 487
    .line 488
    .line 489
    const v14, 0x4179999a    # 15.6f

    .line 490
    .line 491
    .line 492
    const v15, 0x412c7ae1    # 10.78f

    .line 493
    .line 494
    .line 495
    const/high16 v16, 0x41700000    # 15.0f

    .line 496
    .line 497
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 498
    .line 499
    .line 500
    const/high16 v17, -0x3f000000    # -8.0f

    .line 501
    .line 502
    const/high16 v18, 0x40800000    # 4.0f

    .line 503
    .line 504
    const v13, -0x3fd51eb8    # -2.67f

    .line 505
    .line 506
    .line 507
    const/4 v14, 0x0

    .line 508
    const/high16 v15, -0x3f000000    # -8.0f

    .line 509
    .line 510
    const v16, 0x3fab851f    # 1.34f

    .line 511
    .line 512
    .line 513
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 514
    .line 515
    .line 516
    const/high16 v0, 0x3f800000    # 1.0f

    .line 517
    .line 518
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 519
    .line 520
    .line 521
    const/high16 v17, 0x3f800000    # 1.0f

    .line 522
    .line 523
    const/high16 v18, 0x3f800000    # 1.0f

    .line 524
    .line 525
    const/4 v13, 0x0

    .line 526
    const v14, 0x3f0ccccd    # 0.55f

    .line 527
    .line 528
    .line 529
    const v15, 0x3ee66666    # 0.45f

    .line 530
    .line 531
    .line 532
    const/high16 v16, 0x3f800000    # 1.0f

    .line 533
    .line 534
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 535
    .line 536
    .line 537
    const/high16 v0, 0x41600000    # 14.0f

    .line 538
    .line 539
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 540
    .line 541
    .line 542
    const/high16 v18, -0x40800000    # -1.0f

    .line 543
    .line 544
    const v13, 0x3f0ccccd    # 0.55f

    .line 545
    .line 546
    .line 547
    const/4 v14, 0x0

    .line 548
    const/high16 v15, 0x3f800000    # 1.0f

    .line 549
    .line 550
    const v16, -0x4119999a    # -0.45f

    .line 551
    .line 552
    .line 553
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 554
    .line 555
    .line 556
    const/high16 v0, -0x40800000    # -1.0f

    .line 557
    .line 558
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 559
    .line 560
    .line 561
    const v17, -0x416b851f    # -0.29f

    .line 562
    .line 563
    .line 564
    const v18, -0x407d70a4    # -1.02f

    .line 565
    .line 566
    .line 567
    const/4 v13, 0x0

    .line 568
    const v14, -0x41428f5c    # -0.37f

    .line 569
    .line 570
    .line 571
    const v15, -0x421eb852    # -0.11f

    .line 572
    .line 573
    .line 574
    const v16, -0x40cccccd    # -0.7f

    .line 575
    .line 576
    .line 577
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 578
    .line 579
    .line 580
    const v0, 0x4013d70a    # 2.31f

    .line 581
    .line 582
    .line 583
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 584
    .line 585
    .line 586
    const v17, 0x3fb47ae1    # 1.41f

    .line 587
    .line 588
    .line 589
    const/16 v18, 0x0

    .line 590
    .line 591
    const v13, 0x3ec7ae14    # 0.39f

    .line 592
    .line 593
    .line 594
    const v14, 0x3ec7ae14    # 0.39f

    .line 595
    .line 596
    .line 597
    const v15, 0x3f828f5c    # 1.02f

    .line 598
    .line 599
    .line 600
    const v16, 0x3ec7ae14    # 0.39f

    .line 601
    .line 602
    .line 603
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 604
    .line 605
    .line 606
    const/16 v17, 0x0

    .line 607
    .line 608
    const v18, -0x404b851f    # -1.41f

    .line 609
    .line 610
    .line 611
    const v14, -0x413851ec    # -0.39f

    .line 612
    .line 613
    .line 614
    const v15, 0x3ec7ae14    # 0.39f

    .line 615
    .line 616
    .line 617
    const v16, -0x407d70a4    # -1.02f

    .line 618
    .line 619
    .line 620
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 621
    .line 622
    .line 623
    const v0, 0x40a3d70a    # 5.12f

    .line 624
    .line 625
    .line 626
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 627
    .line 628
    .line 629
    const v17, -0x404b851f    # -1.41f

    .line 630
    .line 631
    .line 632
    const/16 v18, 0x0

    .line 633
    .line 634
    const v13, -0x413851ec    # -0.39f

    .line 635
    .line 636
    .line 637
    const v15, -0x407d70a4    # -1.02f

    .line 638
    .line 639
    .line 640
    const v16, -0x413851ec    # -0.39f

    .line 641
    .line 642
    .line 643
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 644
    .line 645
    .line 646
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 647
    .line 648
    .line 649
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 650
    .line 651
    .line 652
    move-result-object v2

    .line 653
    const/16 v16, 0x3800

    .line 654
    .line 655
    const/16 v17, 0x0

    .line 656
    .line 657
    const/high16 v6, 0x3f800000    # 1.0f

    .line 658
    .line 659
    const/high16 v8, 0x3f800000    # 1.0f

    .line 660
    .line 661
    const/4 v7, 0x0

    .line 662
    const/high16 v9, 0x3f800000    # 1.0f

    .line 663
    .line 664
    const/high16 v12, 0x3f800000    # 1.0f

    .line 665
    .line 666
    const/4 v13, 0x0

    .line 667
    const/4 v14, 0x0

    .line 668
    const/4 v15, 0x0

    .line 669
    const-string v4, ""

    .line 670
    .line 671
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 672
    .line 673
    .line 674
    move-result-object v0

    .line 675
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 676
    .line 677
    .line 678
    move-result-object v0

    .line 679
    sput-object v0, Landroidx/compose/material/icons/rounded/VoiceOverOffKt;->_voiceOverOff:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 680
    .line 681
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 682
    .line 683
    .line 684
    return-object v0
.end method
