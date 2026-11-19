.class public final Landroidx/compose/material/icons/rounded/ScreenRotationKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_screenRotation",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "ScreenRotation",
        "Landroidx/compose/material/icons/Icons$Rounded;",
        "getScreenRotation",
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
        "SMAP\nScreenRotation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScreenRotation.kt\nandroidx/compose/material/icons/rounded/ScreenRotationKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,77:1\n212#2,12:78\n233#2,18:91\n253#2:128\n174#3:90\n705#4,2:109\n717#4,2:111\n719#4,11:117\n72#5,4:113\n*S KotlinDebug\n*F\n+ 1 ScreenRotation.kt\nandroidx/compose/material/icons/rounded/ScreenRotationKt\n*L\n29#1:78,12\n30#1:91,18\n30#1:128\n29#1:90\n30#1:109,2\n30#1:111,2\n30#1:117,11\n30#1:113,4\n*E\n"
    }
.end annotation


# static fields
.field private static _screenRotation:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getScreenRotation(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/ScreenRotationKt;->_screenRotation:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.ScreenRotation"

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
    const v0, 0x4123ae14    # 10.23f

    .line 71
    .line 72
    .line 73
    const/high16 v2, 0x3fe00000    # 1.75f

    .line 74
    .line 75
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    const v17, -0x3ff851ec    # -2.12f

    .line 79
    .line 80
    .line 81
    const/16 v18, 0x0

    .line 82
    .line 83
    const v13, -0x40e8f5c3    # -0.59f

    .line 84
    .line 85
    .line 86
    const v14, -0x40e8f5c3    # -0.59f

    .line 87
    .line 88
    .line 89
    const v15, -0x403ae148    # -1.54f

    .line 90
    .line 91
    .line 92
    const v16, -0x40e8f5c3    # -0.59f

    .line 93
    .line 94
    .line 95
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 96
    .line 97
    .line 98
    const v0, 0x4101c28f    # 8.11f

    .line 99
    .line 100
    .line 101
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 102
    .line 103
    .line 104
    const/16 v17, 0x0

    .line 105
    .line 106
    const v18, 0x4007ae14    # 2.12f

    .line 107
    .line 108
    .line 109
    const v14, 0x3f170a3d    # 0.59f

    .line 110
    .line 111
    .line 112
    const v15, -0x40e8f5c3    # -0.59f

    .line 113
    .line 114
    .line 115
    const v16, 0x3fc51eb8    # 1.54f

    .line 116
    .line 117
    .line 118
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 119
    .line 120
    .line 121
    const v0, 0x414051ec    # 12.02f

    .line 122
    .line 123
    .line 124
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 125
    .line 126
    .line 127
    const v17, 0x4007ae14    # 2.12f

    .line 128
    .line 129
    .line 130
    const/16 v18, 0x0

    .line 131
    .line 132
    const v13, 0x3f170a3d    # 0.59f

    .line 133
    .line 134
    .line 135
    const v15, 0x3fc51eb8    # 1.54f

    .line 136
    .line 137
    .line 138
    const v16, 0x3f170a3d    # 0.59f

    .line 139
    .line 140
    .line 141
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 142
    .line 143
    .line 144
    const v0, 0x40cb851f    # 6.36f

    .line 145
    .line 146
    .line 147
    const v2, -0x3f347ae1    # -6.36f

    .line 148
    .line 149
    .line 150
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 151
    .line 152
    .line 153
    const/16 v17, 0x0

    .line 154
    .line 155
    const v18, -0x3ff851ec    # -2.12f

    .line 156
    .line 157
    .line 158
    const v14, -0x40e8f5c3    # -0.59f

    .line 159
    .line 160
    .line 161
    const v15, 0x3f170a3d    # 0.59f

    .line 162
    .line 163
    .line 164
    const v16, -0x403ae148    # -1.54f

    .line 165
    .line 166
    .line 167
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 168
    .line 169
    .line 170
    const v0, 0x4123ae14    # 10.23f

    .line 171
    .line 172
    .line 173
    const/high16 v2, 0x3fe00000    # 1.75f

    .line 174
    .line 175
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 176
    .line 177
    .line 178
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 179
    .line 180
    .line 181
    const v0, 0x4161eb85    # 14.12f

    .line 182
    .line 183
    .line 184
    const v2, 0x41a3d70a    # 20.48f

    .line 185
    .line 186
    .line 187
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 188
    .line 189
    .line 190
    const v0, 0x406147ae    # 3.52f

    .line 191
    .line 192
    .line 193
    const v2, 0x411e147b    # 9.88f

    .line 194
    .line 195
    .line 196
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 197
    .line 198
    .line 199
    const v18, -0x404b851f    # -1.41f

    .line 200
    .line 201
    .line 202
    const v13, -0x413851ec    # -0.39f

    .line 203
    .line 204
    .line 205
    const v14, -0x413851ec    # -0.39f

    .line 206
    .line 207
    .line 208
    const v15, -0x413851ec    # -0.39f

    .line 209
    .line 210
    .line 211
    const v16, -0x407d70a4    # -1.02f

    .line 212
    .line 213
    .line 214
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 215
    .line 216
    .line 217
    const v0, -0x3f61999a    # -4.95f

    .line 218
    .line 219
    .line 220
    const v2, 0x409e6666    # 4.95f

    .line 221
    .line 222
    .line 223
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 224
    .line 225
    .line 226
    const v17, 0x3fb47ae1    # 1.41f

    .line 227
    .line 228
    .line 229
    const/16 v18, 0x0

    .line 230
    .line 231
    const v13, 0x3ec7ae14    # 0.39f

    .line 232
    .line 233
    .line 234
    const v15, 0x3f828f5c    # 1.02f

    .line 235
    .line 236
    .line 237
    const v16, -0x413851ec    # -0.39f

    .line 238
    .line 239
    .line 240
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 241
    .line 242
    .line 243
    const v0, 0x4129c28f    # 10.61f

    .line 244
    .line 245
    .line 246
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 247
    .line 248
    .line 249
    const/16 v17, 0x0

    .line 250
    .line 251
    const v18, 0x3fb47ae1    # 1.41f

    .line 252
    .line 253
    .line 254
    const v14, 0x3ec7ae14    # 0.39f

    .line 255
    .line 256
    .line 257
    const v15, 0x3ec7ae14    # 0.39f

    .line 258
    .line 259
    .line 260
    const v16, 0x3f828f5c    # 1.02f

    .line 261
    .line 262
    .line 263
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 264
    .line 265
    .line 266
    const v0, -0x3f61999a    # -4.95f

    .line 267
    .line 268
    .line 269
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 270
    .line 271
    .line 272
    const v17, -0x404a3d71    # -1.42f

    .line 273
    .line 274
    .line 275
    const v18, -0x43dc28f6    # -0.01f

    .line 276
    .line 277
    .line 278
    const v13, -0x413851ec    # -0.39f

    .line 279
    .line 280
    .line 281
    const v14, 0x3ec28f5c    # 0.38f

    .line 282
    .line 283
    .line 284
    const v15, -0x407c28f6    # -1.03f

    .line 285
    .line 286
    .line 287
    const v16, 0x3ec28f5c    # 0.38f

    .line 288
    .line 289
    .line 290
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 291
    .line 292
    .line 293
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 294
    .line 295
    .line 296
    const v0, 0x418ce148    # 17.61f

    .line 297
    .line 298
    .line 299
    const v2, 0x3fb33333    # 1.4f

    .line 300
    .line 301
    .line 302
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 303
    .line 304
    .line 305
    const v17, 0x413cf5c3    # 11.81f

    .line 306
    .line 307
    .line 308
    const v18, 0x3ca3d70a    # 0.02f

    .line 309
    .line 310
    .line 311
    const v13, 0x418051ec    # 16.04f

    .line 312
    .line 313
    .line 314
    const v14, 0x3f11eb85    # 0.57f

    .line 315
    .line 316
    .line 317
    const v15, 0x4160f5c3    # 14.06f

    .line 318
    .line 319
    .line 320
    const v16, -0x430a3d71    # -0.03f

    .line 321
    .line 322
    .line 323
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 324
    .line 325
    .line 326
    const v17, -0x41f0a3d7    # -0.14f

    .line 327
    .line 328
    .line 329
    const v18, 0x3eb33333    # 0.35f

    .line 330
    .line 331
    .line 332
    const v13, -0x41c7ae14    # -0.18f

    .line 333
    .line 334
    .line 335
    const/4 v14, 0x0

    .line 336
    const v15, -0x417ae148    # -0.26f

    .line 337
    .line 338
    .line 339
    const v16, 0x3e6147ae    # 0.22f

    .line 340
    .line 341
    .line 342
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 343
    .line 344
    .line 345
    const v0, 0x405eb852    # 3.48f

    .line 346
    .line 347
    .line 348
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 349
    .line 350
    .line 351
    const v0, -0x4055c28f    # -1.33f

    .line 352
    .line 353
    .line 354
    const v2, 0x3faa3d71    # 1.33f

    .line 355
    .line 356
    .line 357
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 358
    .line 359
    .line 360
    const v17, 0x40bc7ae1    # 5.89f

    .line 361
    .line 362
    .line 363
    const v18, 0x40fb851f    # 7.86f

    .line 364
    .line 365
    .line 366
    const v13, 0x4045c28f    # 3.09f

    .line 367
    .line 368
    .line 369
    const v14, 0x3fbae148    # 1.46f

    .line 370
    .line 371
    .line 372
    const v15, 0x40aae148    # 5.34f

    .line 373
    .line 374
    .line 375
    const v16, 0x408bd70a    # 4.37f

    .line 376
    .line 377
    .line 378
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 379
    .line 380
    .line 381
    const v17, 0x3f5c28f6    # 0.86f

    .line 382
    .line 383
    .line 384
    const v18, 0x3f1eb852    # 0.62f

    .line 385
    .line 386
    .line 387
    const v13, 0x3d75c28f    # 0.06f

    .line 388
    .line 389
    .line 390
    const v14, 0x3ed1eb85    # 0.41f

    .line 391
    .line 392
    .line 393
    const v15, 0x3ee147ae    # 0.44f

    .line 394
    .line 395
    .line 396
    const v16, 0x3f30a3d7    # 0.69f

    .line 397
    .line 398
    .line 399
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 400
    .line 401
    .line 402
    const v17, 0x3f1eb852    # 0.62f

    .line 403
    .line 404
    .line 405
    const v18, -0x40a3d70a    # -0.86f

    .line 406
    .line 407
    .line 408
    const v13, 0x3ed1eb85    # 0.41f

    .line 409
    .line 410
    .line 411
    const v14, -0x428a3d71    # -0.06f

    .line 412
    .line 413
    .line 414
    const v15, 0x3f30a3d7    # 0.69f

    .line 415
    .line 416
    .line 417
    const v16, -0x4119999a    # -0.45f

    .line 418
    .line 419
    .line 420
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 421
    .line 422
    .line 423
    const v17, -0x3f3851ec    # -6.24f

    .line 424
    .line 425
    .line 426
    const v18, -0x3ef428f6    # -8.74f

    .line 427
    .line 428
    .line 429
    const v13, -0x40e66666    # -0.6f

    .line 430
    .line 431
    .line 432
    const v14, -0x3f8ccccd    # -3.8f

    .line 433
    .line 434
    .line 435
    const v15, -0x3fc28f5c    # -2.96f

    .line 436
    .line 437
    .line 438
    const/high16 v16, -0x3f200000    # -7.0f

    .line 439
    .line 440
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 441
    .line 442
    .line 443
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 444
    .line 445
    .line 446
    const v0, 0x410d999a    # 8.85f

    .line 447
    .line 448
    .line 449
    const v2, 0x41a147ae    # 20.16f

    .line 450
    .line 451
    .line 452
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 453
    .line 454
    .line 455
    const v0, -0x4055c28f    # -1.33f

    .line 456
    .line 457
    .line 458
    const v2, 0x3faa3d71    # 1.33f

    .line 459
    .line 460
    .line 461
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 462
    .line 463
    .line 464
    const v17, -0x3f43851f    # -5.89f

    .line 465
    .line 466
    .line 467
    const v18, -0x3f047ae1    # -7.86f

    .line 468
    .line 469
    .line 470
    const v13, -0x3fba3d71    # -3.09f

    .line 471
    .line 472
    .line 473
    const v14, -0x40451eb8    # -1.46f

    .line 474
    .line 475
    .line 476
    const v15, -0x3f551eb8    # -5.34f

    .line 477
    .line 478
    .line 479
    const v16, -0x3f7428f6    # -4.37f

    .line 480
    .line 481
    .line 482
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 483
    .line 484
    .line 485
    const v17, -0x40a3d70a    # -0.86f

    .line 486
    .line 487
    .line 488
    const v18, -0x40e147ae    # -0.62f

    .line 489
    .line 490
    .line 491
    const v13, -0x428a3d71    # -0.06f

    .line 492
    .line 493
    .line 494
    const v14, -0x412e147b    # -0.41f

    .line 495
    .line 496
    .line 497
    const v15, -0x411eb852    # -0.44f

    .line 498
    .line 499
    .line 500
    const v16, -0x40cf5c29    # -0.69f

    .line 501
    .line 502
    .line 503
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 504
    .line 505
    .line 506
    const v17, -0x40e147ae    # -0.62f

    .line 507
    .line 508
    .line 509
    const v18, 0x3f5c28f6    # 0.86f

    .line 510
    .line 511
    .line 512
    const v13, -0x412e147b    # -0.41f

    .line 513
    .line 514
    .line 515
    const v14, 0x3d75c28f    # 0.06f

    .line 516
    .line 517
    .line 518
    const v15, -0x40cf5c29    # -0.69f

    .line 519
    .line 520
    .line 521
    const v16, 0x3ee66666    # 0.45f

    .line 522
    .line 523
    .line 524
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 525
    .line 526
    .line 527
    const v17, 0x40c7ae14    # 6.24f

    .line 528
    .line 529
    .line 530
    const/high16 v18, 0x410c0000    # 8.75f

    .line 531
    .line 532
    const v13, 0x3f19999a    # 0.6f

    .line 533
    .line 534
    .line 535
    const v14, 0x4073d70a    # 3.81f

    .line 536
    .line 537
    .line 538
    const v15, 0x403d70a4    # 2.96f

    .line 539
    .line 540
    .line 541
    const v16, 0x40e051ec    # 7.01f

    .line 542
    .line 543
    .line 544
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 545
    .line 546
    .line 547
    const v17, 0x40b9999a    # 5.8f

    .line 548
    .line 549
    .line 550
    const v18, 0x3fb0a3d7    # 1.38f

    .line 551
    .line 552
    .line 553
    const v13, 0x3fc8f5c3    # 1.57f

    .line 554
    .line 555
    .line 556
    const v14, 0x3f547ae1    # 0.83f

    .line 557
    .line 558
    .line 559
    const v15, 0x40633333    # 3.55f

    .line 560
    .line 561
    .line 562
    const v16, 0x3fb70a3d    # 1.43f

    .line 563
    .line 564
    .line 565
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 566
    .line 567
    .line 568
    const v17, 0x3e0f5c29    # 0.14f

    .line 569
    .line 570
    .line 571
    const v18, -0x414ccccd    # -0.35f

    .line 572
    .line 573
    .line 574
    const v13, 0x3e3851ec    # 0.18f

    .line 575
    .line 576
    .line 577
    const/4 v14, 0x0

    .line 578
    const v15, 0x3e851eb8    # 0.26f

    .line 579
    .line 580
    .line 581
    const v16, -0x419eb852    # -0.22f

    .line 582
    .line 583
    .line 584
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 585
    .line 586
    .line 587
    const v0, -0x3fa147ae    # -3.48f

    .line 588
    .line 589
    .line 590
    const v2, -0x3fa0a3d7    # -3.49f

    .line 591
    .line 592
    .line 593
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 594
    .line 595
    .line 596
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 597
    .line 598
    .line 599
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 600
    .line 601
    .line 602
    move-result-object v2

    .line 603
    const/16 v16, 0x3800

    .line 604
    .line 605
    const/16 v17, 0x0

    .line 606
    .line 607
    const/high16 v6, 0x3f800000    # 1.0f

    .line 608
    .line 609
    const/high16 v8, 0x3f800000    # 1.0f

    .line 610
    .line 611
    const/4 v7, 0x0

    .line 612
    const/high16 v9, 0x3f800000    # 1.0f

    .line 613
    .line 614
    const/high16 v12, 0x3f800000    # 1.0f

    .line 615
    .line 616
    const/4 v13, 0x0

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
    sput-object v0, Landroidx/compose/material/icons/rounded/ScreenRotationKt;->_screenRotation:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 629
    .line 630
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 631
    .line 632
    .line 633
    return-object v0
.end method
