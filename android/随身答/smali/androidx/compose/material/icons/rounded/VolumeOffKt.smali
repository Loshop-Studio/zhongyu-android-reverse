.class public final Landroidx/compose/material/icons/rounded/VolumeOffKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u001e\u0010\u0002\u001a\u00020\u0001*\u00020\u00038FX\u0087\u0004\u00a2\u0006\u000c\u0012\u0004\u0008\u0004\u0010\u0005\u001a\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "_volumeOff",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "VolumeOff",
        "Landroidx/compose/material/icons/Icons$Rounded;",
        "getVolumeOff$annotations",
        "(Landroidx/compose/material/icons/Icons$Rounded;)V",
        "getVolumeOff",
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
        "SMAP\nVolumeOff.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VolumeOff.kt\nandroidx/compose/material/icons/rounded/VolumeOffKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,88:1\n212#2,12:89\n233#2,18:102\n253#2:139\n174#3:101\n705#4,2:120\n717#4,2:122\n719#4,11:128\n72#5,4:124\n*S KotlinDebug\n*F\n+ 1 VolumeOff.kt\nandroidx/compose/material/icons/rounded/VolumeOffKt\n*L\n35#1:89,12\n36#1:102,18\n36#1:139\n35#1:101\n36#1:120,2\n36#1:122,2\n36#1:128,11\n36#1:124,4\n*E\n"
    }
.end annotation


# static fields
.field private static _volumeOff:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getVolumeOff(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/VolumeOffKt;->_volumeOff:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.VolumeOff"

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
    const v0, 0x406851ec    # 3.63f

    .line 71
    .line 72
    .line 73
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 74
    .line 75
    .line 76
    const/16 v17, 0x0

    .line 77
    .line 78
    const v18, 0x3fb47ae1    # 1.41f

    .line 79
    .line 80
    .line 81
    const v13, -0x413851ec    # -0.39f

    .line 82
    .line 83
    .line 84
    const v14, 0x3ec7ae14    # 0.39f

    .line 85
    .line 86
    .line 87
    const v15, -0x413851ec    # -0.39f

    .line 88
    .line 89
    .line 90
    const v16, 0x3f828f5c    # 1.02f

    .line 91
    .line 92
    .line 93
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 94
    .line 95
    .line 96
    const v0, 0x40e947ae    # 7.29f

    .line 97
    .line 98
    .line 99
    const v2, 0x410b3333    # 8.7f

    .line 100
    .line 101
    .line 102
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 103
    .line 104
    .line 105
    const/high16 v0, 0x40e00000    # 7.0f

    .line 106
    .line 107
    const/high16 v2, 0x41100000    # 9.0f

    .line 108
    .line 109
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 110
    .line 111
    .line 112
    const/high16 v0, 0x40800000    # 4.0f

    .line 113
    .line 114
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 115
    .line 116
    .line 117
    const/high16 v17, -0x40800000    # -1.0f

    .line 118
    .line 119
    const/high16 v18, 0x3f800000    # 1.0f

    .line 120
    .line 121
    const v13, -0x40f33333    # -0.55f

    .line 122
    .line 123
    .line 124
    const/4 v14, 0x0

    .line 125
    const/high16 v15, -0x40800000    # -1.0f

    .line 126
    .line 127
    const v16, 0x3ee66666    # 0.45f

    .line 128
    .line 129
    .line 130
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 131
    .line 132
    .line 133
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 134
    .line 135
    .line 136
    const/high16 v17, 0x3f800000    # 1.0f

    .line 137
    .line 138
    const/4 v13, 0x0

    .line 139
    const v14, 0x3f0ccccd    # 0.55f

    .line 140
    .line 141
    .line 142
    const v15, 0x3ee66666    # 0.45f

    .line 143
    .line 144
    .line 145
    const/high16 v16, 0x3f800000    # 1.0f

    .line 146
    .line 147
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 148
    .line 149
    .line 150
    const/high16 v0, 0x40400000    # 3.0f

    .line 151
    .line 152
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 153
    .line 154
    .line 155
    const v0, 0x40528f5c    # 3.29f

    .line 156
    .line 157
    .line 158
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 159
    .line 160
    .line 161
    const v17, 0x3fdae148    # 1.71f

    .line 162
    .line 163
    .line 164
    const v18, -0x40ca3d71    # -0.71f

    .line 165
    .line 166
    .line 167
    const v13, 0x3f2147ae    # 0.63f

    .line 168
    .line 169
    .line 170
    const v14, 0x3f2147ae    # 0.63f

    .line 171
    .line 172
    .line 173
    const v15, 0x3fdae148    # 1.71f

    .line 174
    .line 175
    .line 176
    const v16, 0x3e3851ec    # 0.18f

    .line 177
    .line 178
    .line 179
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 180
    .line 181
    .line 182
    const v0, -0x3f7a8f5c    # -4.17f

    .line 183
    .line 184
    .line 185
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 186
    .line 187
    .line 188
    const v0, 0x4085c28f    # 4.18f

    .line 189
    .line 190
    .line 191
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 192
    .line 193
    .line 194
    const v17, -0x40333333    # -1.6f

    .line 195
    .line 196
    .line 197
    const v18, 0x3f68f5c3    # 0.91f

    .line 198
    .line 199
    .line 200
    const v13, -0x41051eb8    # -0.49f

    .line 201
    .line 202
    .line 203
    const v14, 0x3ebd70a4    # 0.37f

    .line 204
    .line 205
    .line 206
    const v15, -0x407d70a4    # -1.02f

    .line 207
    .line 208
    .line 209
    const v16, 0x3f2e147b    # 0.68f

    .line 210
    .line 211
    .line 212
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 213
    .line 214
    .line 215
    const v17, -0x40eb851f    # -0.58f

    .line 216
    .line 217
    .line 218
    const v18, 0x3f6b851f    # 0.92f

    .line 219
    .line 220
    .line 221
    const v13, -0x4147ae14    # -0.36f

    .line 222
    .line 223
    .line 224
    const v14, 0x3e19999a    # 0.15f

    .line 225
    .line 226
    .line 227
    const v15, -0x40eb851f    # -0.58f

    .line 228
    .line 229
    .line 230
    const v16, 0x3f07ae14    # 0.53f

    .line 231
    .line 232
    .line 233
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 234
    .line 235
    .line 236
    const v17, 0x3fb1eb85    # 1.39f

    .line 237
    .line 238
    .line 239
    const v18, 0x3f68f5c3    # 0.91f

    .line 240
    .line 241
    .line 242
    const/4 v13, 0x0

    .line 243
    const v14, 0x3f3851ec    # 0.72f

    .line 244
    .line 245
    .line 246
    const v15, 0x3f3ae148    # 0.73f

    .line 247
    .line 248
    .line 249
    const v16, 0x3f970a3d    # 1.18f

    .line 250
    .line 251
    .line 252
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 253
    .line 254
    .line 255
    const v17, 0x400e147b    # 2.22f

    .line 256
    .line 257
    .line 258
    const v18, -0x405851ec    # -1.31f

    .line 259
    .line 260
    .line 261
    const v13, 0x3f4ccccd    # 0.8f

    .line 262
    .line 263
    .line 264
    const v14, -0x41570a3d    # -0.33f

    .line 265
    .line 266
    .line 267
    const v15, 0x3fc66666    # 1.55f

    .line 268
    .line 269
    .line 270
    const v16, -0x40bae148    # -0.77f

    .line 271
    .line 272
    .line 273
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 274
    .line 275
    .line 276
    const v0, 0x3fab851f    # 1.34f

    .line 277
    .line 278
    .line 279
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 280
    .line 281
    .line 282
    const v17, 0x3fb47ae1    # 1.41f

    .line 283
    .line 284
    .line 285
    const/16 v18, 0x0

    .line 286
    .line 287
    const v13, 0x3ec7ae14    # 0.39f

    .line 288
    .line 289
    .line 290
    const v14, 0x3ec7ae14    # 0.39f

    .line 291
    .line 292
    .line 293
    const v15, 0x3f828f5c    # 1.02f

    .line 294
    .line 295
    .line 296
    const v16, 0x3ec7ae14    # 0.39f

    .line 297
    .line 298
    .line 299
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 300
    .line 301
    .line 302
    const/16 v17, 0x0

    .line 303
    .line 304
    const v18, -0x404b851f    # -1.41f

    .line 305
    .line 306
    .line 307
    const v14, -0x413851ec    # -0.39f

    .line 308
    .line 309
    .line 310
    const v15, 0x3ec7ae14    # 0.39f

    .line 311
    .line 312
    .line 313
    const v16, -0x407d70a4    # -1.02f

    .line 314
    .line 315
    .line 316
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 317
    .line 318
    .line 319
    const v0, 0x40a1999a    # 5.05f

    .line 320
    .line 321
    .line 322
    const v2, 0x406851ec    # 3.63f

    .line 323
    .line 324
    .line 325
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 326
    .line 327
    .line 328
    const v17, -0x404a3d71    # -1.42f

    .line 329
    .line 330
    .line 331
    const/16 v18, 0x0

    .line 332
    .line 333
    const v13, -0x413851ec    # -0.39f

    .line 334
    .line 335
    .line 336
    const v15, -0x407d70a4    # -1.02f

    .line 337
    .line 338
    .line 339
    const v16, -0x413851ec    # -0.39f

    .line 340
    .line 341
    .line 342
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 343
    .line 344
    .line 345
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 346
    .line 347
    .line 348
    const/high16 v0, 0x41980000    # 19.0f

    .line 349
    .line 350
    const/high16 v2, 0x41400000    # 12.0f

    .line 351
    .line 352
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 353
    .line 354
    .line 355
    const v17, -0x412e147b    # -0.41f

    .line 356
    .line 357
    .line 358
    const v18, 0x4015c28f    # 2.34f

    .line 359
    .line 360
    .line 361
    const/4 v13, 0x0

    .line 362
    const v14, 0x3f51eb85    # 0.82f

    .line 363
    .line 364
    .line 365
    const v15, -0x41e66666    # -0.15f

    .line 366
    .line 367
    .line 368
    const v16, 0x3fce147b    # 1.61f

    .line 369
    .line 370
    .line 371
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 372
    .line 373
    .line 374
    const v0, 0x3fc3d70a    # 1.53f

    .line 375
    .line 376
    .line 377
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 378
    .line 379
    .line 380
    const v17, 0x3f6147ae    # 0.88f

    .line 381
    .line 382
    .line 383
    const v18, -0x3f8851ec    # -3.87f

    .line 384
    .line 385
    .line 386
    const v13, 0x3f0f5c29    # 0.56f

    .line 387
    .line 388
    .line 389
    const v14, -0x406a3d71    # -1.17f

    .line 390
    .line 391
    .line 392
    const v15, 0x3f6147ae    # 0.88f

    .line 393
    .line 394
    .line 395
    const v16, -0x3fe147ae    # -2.48f

    .line 396
    .line 397
    .line 398
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 399
    .line 400
    .line 401
    const v17, -0x3f470a3d    # -5.78f

    .line 402
    .line 403
    .line 404
    const v18, -0x3ef9999a    # -8.4f

    .line 405
    .line 406
    .line 407
    const/4 v13, 0x0

    .line 408
    const v14, -0x3f8ae148    # -3.83f

    .line 409
    .line 410
    .line 411
    const v15, -0x3fe66666    # -2.4f

    .line 412
    .line 413
    .line 414
    const v16, -0x3f1c7ae1    # -7.11f

    .line 415
    .line 416
    .line 417
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 418
    .line 419
    .line 420
    const v17, -0x4063d70a    # -1.22f

    .line 421
    .line 422
    .line 423
    const v18, 0x3f5c28f6    # 0.86f

    .line 424
    .line 425
    .line 426
    const v13, -0x40e8f5c3    # -0.59f

    .line 427
    .line 428
    .line 429
    const v14, -0x41947ae1    # -0.23f

    .line 430
    .line 431
    .line 432
    const v15, -0x4063d70a    # -1.22f

    .line 433
    .line 434
    .line 435
    const v16, 0x3e6b851f    # 0.23f

    .line 436
    .line 437
    .line 438
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 439
    .line 440
    .line 441
    const v0, 0x3e428f5c    # 0.19f

    .line 442
    .line 443
    .line 444
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 445
    .line 446
    .line 447
    const v17, 0x3f1c28f6    # 0.61f

    .line 448
    .line 449
    .line 450
    const v18, 0x3f59999a    # 0.85f

    .line 451
    .line 452
    .line 453
    const/4 v13, 0x0

    .line 454
    const v14, 0x3ec28f5c    # 0.38f

    .line 455
    .line 456
    .line 457
    const/high16 v15, 0x3e800000    # 0.25f

    .line 458
    .line 459
    const v16, 0x3f35c28f    # 0.71f

    .line 460
    .line 461
    .line 462
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 463
    .line 464
    .line 465
    const/high16 v17, 0x41980000    # 19.0f

    .line 466
    .line 467
    const/high16 v18, 0x41400000    # 12.0f

    .line 468
    .line 469
    const v13, 0x418970a4    # 17.18f

    .line 470
    .line 471
    .line 472
    const v14, 0x40d147ae    # 6.54f

    .line 473
    .line 474
    .line 475
    const/high16 v15, 0x41980000    # 19.0f

    .line 476
    .line 477
    const v16, 0x4110f5c3    # 9.06f

    .line 478
    .line 479
    .line 480
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 481
    .line 482
    .line 483
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 484
    .line 485
    .line 486
    const v0, 0x4124a3d7    # 10.29f

    .line 487
    .line 488
    .line 489
    const v2, 0x40b6b852    # 5.71f

    .line 490
    .line 491
    .line 492
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 493
    .line 494
    .line 495
    const v0, -0x41d1eb85    # -0.17f

    .line 496
    .line 497
    .line 498
    const v2, 0x3e2e147b    # 0.17f

    .line 499
    .line 500
    .line 501
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 502
    .line 503
    .line 504
    const v0, 0x40f851ec    # 7.76f

    .line 505
    .line 506
    .line 507
    const/high16 v2, 0x41400000    # 12.0f

    .line 508
    .line 509
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 510
    .line 511
    .line 512
    const v0, 0x40cd1eb8    # 6.41f

    .line 513
    .line 514
    .line 515
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 516
    .line 517
    .line 518
    const v17, -0x40251eb8    # -1.71f

    .line 519
    .line 520
    .line 521
    const v18, -0x40cccccd    # -0.7f

    .line 522
    .line 523
    .line 524
    const/4 v13, 0x0

    .line 525
    const v14, -0x409c28f6    # -0.89f

    .line 526
    .line 527
    .line 528
    const v15, -0x4075c28f    # -1.08f

    .line 529
    .line 530
    .line 531
    const v16, -0x4055c28f    # -1.33f

    .line 532
    .line 533
    .line 534
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 535
    .line 536
    .line 537
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 538
    .line 539
    .line 540
    const/high16 v0, 0x41840000    # 16.5f

    .line 541
    .line 542
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 543
    .line 544
    .line 545
    const/high16 v17, -0x3fe00000    # -2.5f

    .line 546
    .line 547
    const v18, -0x3f7f0a3d    # -4.03f

    .line 548
    .line 549
    .line 550
    const v14, -0x401d70a4    # -1.77f

    .line 551
    .line 552
    .line 553
    const v15, -0x407d70a4    # -1.02f

    .line 554
    .line 555
    .line 556
    const v16, -0x3fad70a4    # -3.29f

    .line 557
    .line 558
    .line 559
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 560
    .line 561
    .line 562
    const v0, 0x3fe51eb8    # 1.79f

    .line 563
    .line 564
    .line 565
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 566
    .line 567
    .line 568
    const v0, 0x401eb852    # 2.48f

    .line 569
    .line 570
    .line 571
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 572
    .line 573
    .line 574
    const v17, 0x3ca3d70a    # 0.02f

    .line 575
    .line 576
    .line 577
    const v18, -0x418a3d71    # -0.24f

    .line 578
    .line 579
    .line 580
    const v13, 0x3c23d70a    # 0.01f

    .line 581
    .line 582
    .line 583
    const v14, -0x425c28f6    # -0.08f

    .line 584
    .line 585
    .line 586
    const v15, 0x3ca3d70a    # 0.02f

    .line 587
    .line 588
    .line 589
    const v16, -0x41dc28f6    # -0.16f

    .line 590
    .line 591
    .line 592
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 593
    .line 594
    .line 595
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 596
    .line 597
    .line 598
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 599
    .line 600
    .line 601
    move-result-object v2

    .line 602
    const/16 v16, 0x3800

    .line 603
    .line 604
    const/16 v17, 0x0

    .line 605
    .line 606
    const/high16 v6, 0x3f800000    # 1.0f

    .line 607
    .line 608
    const/high16 v8, 0x3f800000    # 1.0f

    .line 609
    .line 610
    const/4 v7, 0x0

    .line 611
    const/high16 v9, 0x3f800000    # 1.0f

    .line 612
    .line 613
    const/high16 v12, 0x3f800000    # 1.0f

    .line 614
    .line 615
    const/4 v13, 0x0

    .line 616
    const/4 v14, 0x0

    .line 617
    const/4 v15, 0x0

    .line 618
    const-string v4, ""

    .line 619
    .line 620
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 621
    .line 622
    .line 623
    move-result-object v0

    .line 624
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 625
    .line 626
    .line 627
    move-result-object v0

    .line 628
    sput-object v0, Landroidx/compose/material/icons/rounded/VolumeOffKt;->_volumeOff:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 629
    .line 630
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 631
    .line 632
    .line 633
    return-object v0
.end method

.method public static synthetic getVolumeOff$annotations(Landroidx/compose/material/icons/Icons$Rounded;)V
    .locals 0
    .annotation runtime Lkotlin/Deprecated;
        message = "Use the AutoMirrored version at Icons.AutoMirrored.Rounded.VolumeOff"
        replaceWith = .subannotation Lkotlin/ReplaceWith;
            expression = "Icons.AutoMirrored.Rounded.VolumeOff"
            imports = {
                "androidx.compose.material.icons.automirrored.rounded.VolumeOff"
            }
        .end subannotation
    .end annotation

    return-void
.end method
