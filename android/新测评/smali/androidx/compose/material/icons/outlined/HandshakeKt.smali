.class public final Landroidx/compose/material/icons/outlined/HandshakeKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_handshake",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "Handshake",
        "Landroidx/compose/material/icons/Icons$Outlined;",
        "getHandshake",
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
        "SMAP\nHandshake.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Handshake.kt\nandroidx/compose/material/icons/outlined/HandshakeKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,95:1\n212#2,12:96\n233#2,18:109\n253#2:146\n174#3:108\n705#4,2:127\n717#4,2:129\n719#4,11:135\n72#5,4:131\n*S KotlinDebug\n*F\n+ 1 Handshake.kt\nandroidx/compose/material/icons/outlined/HandshakeKt\n*L\n29#1:96,12\n30#1:109,18\n30#1:146\n29#1:108\n30#1:127,2\n30#1:129,2\n30#1:135,11\n30#1:131,4\n*E\n"
    }
.end annotation


# static fields
.field private static _handshake:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getHandshake(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/outlined/HandshakeKt;->_handshake:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Outlined.Handshake"

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
    const v0, 0x419ecccd    # 19.85f

    .line 71
    .line 72
    .line 73
    const v2, 0x4143851f    # 12.22f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v17, -0x40ca3d71    # -0.71f

    .line 80
    .line 81
    .line 82
    const/16 v18, 0x0

    .line 83
    .line 84
    const v13, -0x41c7ae14    # -0.18f

    .line 85
    .line 86
    .line 87
    const v14, 0x3e3851ec    # 0.18f

    .line 88
    .line 89
    .line 90
    const/high16 v15, -0x41000000    # -0.5f

    .line 91
    .line 92
    const v16, 0x3e570a3d    # 0.21f

    .line 93
    .line 94
    .line 95
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 96
    .line 97
    .line 98
    const/16 v17, 0x0

    .line 99
    .line 100
    const v18, -0x40ca3d71    # -0.71f

    .line 101
    .line 102
    .line 103
    const v14, -0x41c7ae14    # -0.18f

    .line 104
    .line 105
    .line 106
    const v15, -0x41a8f5c3    # -0.21f

    .line 107
    .line 108
    .line 109
    const/high16 v16, -0x41000000    # -0.5f

    .line 110
    .line 111
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 112
    .line 113
    .line 114
    const v0, -0x3fa70a3d    # -3.39f

    .line 115
    .line 116
    .line 117
    const v2, 0x4058f5c3    # 3.39f

    .line 118
    .line 119
    .line 120
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 121
    .line 122
    .line 123
    const v0, -0x404b851f    # -1.41f

    .line 124
    .line 125
    .line 126
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 127
    .line 128
    .line 129
    const v0, -0x3fa70a3d    # -3.39f

    .line 130
    .line 131
    .line 132
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 133
    .line 134
    .line 135
    const v17, -0x40ca3d71    # -0.71f

    .line 136
    .line 137
    .line 138
    const/16 v18, 0x0

    .line 139
    .line 140
    const v13, -0x41bd70a4    # -0.19f

    .line 141
    .line 142
    .line 143
    const v14, 0x3e4ccccd    # 0.2f

    .line 144
    .line 145
    .line 146
    const v15, -0x40fd70a4    # -0.51f

    .line 147
    .line 148
    .line 149
    const v16, 0x3e428f5c    # 0.19f

    .line 150
    .line 151
    .line 152
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 153
    .line 154
    .line 155
    const/16 v17, 0x0

    .line 156
    .line 157
    const v18, -0x40ca3d71    # -0.71f

    .line 158
    .line 159
    .line 160
    const v13, -0x41a8f5c3    # -0.21f

    .line 161
    .line 162
    .line 163
    const v14, -0x41a8f5c3    # -0.21f

    .line 164
    .line 165
    .line 166
    const v15, -0x41c7ae14    # -0.18f

    .line 167
    .line 168
    .line 169
    const v16, -0x40f851ec    # -0.53f

    .line 170
    .line 171
    .line 172
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 173
    .line 174
    .line 175
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 176
    .line 177
    .line 178
    const v0, -0x404b851f    # -1.41f

    .line 179
    .line 180
    .line 181
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 182
    .line 183
    .line 184
    const v0, -0x3fa70a3d    # -3.39f

    .line 185
    .line 186
    .line 187
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 188
    .line 189
    .line 190
    const v17, -0x40ca3d71    # -0.71f

    .line 191
    .line 192
    .line 193
    const/16 v18, 0x0

    .line 194
    .line 195
    const v13, -0x41c7ae14    # -0.18f

    .line 196
    .line 197
    .line 198
    const v14, 0x3e3851ec    # 0.18f

    .line 199
    .line 200
    .line 201
    const/high16 v15, -0x41000000    # -0.5f

    .line 202
    .line 203
    const v16, 0x3e570a3d    # 0.21f

    .line 204
    .line 205
    .line 206
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 207
    .line 208
    .line 209
    const/16 v17, 0x0

    .line 210
    .line 211
    const v18, -0x40ca3d71    # -0.71f

    .line 212
    .line 213
    .line 214
    const v13, -0x41bd70a4    # -0.19f

    .line 215
    .line 216
    .line 217
    const v14, -0x41bd70a4    # -0.19f

    .line 218
    .line 219
    .line 220
    const v15, -0x41bd70a4    # -0.19f

    .line 221
    .line 222
    .line 223
    const v16, -0x40fd70a4    # -0.51f

    .line 224
    .line 225
    .line 226
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 227
    .line 228
    .line 229
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 230
    .line 231
    .line 232
    const v0, 0x4113d70a    # 9.24f

    .line 233
    .line 234
    .line 235
    const v2, 0x4121999a    # 10.1f

    .line 236
    .line 237
    .line 238
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 239
    .line 240
    .line 241
    const v0, -0x3fa70a3d    # -3.39f

    .line 242
    .line 243
    .line 244
    const v2, 0x4058f5c3    # 3.39f

    .line 245
    .line 246
    .line 247
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 248
    .line 249
    .line 250
    const v17, -0x40ca3d71    # -0.71f

    .line 251
    .line 252
    .line 253
    const/16 v18, 0x0

    .line 254
    .line 255
    const v13, -0x41c7ae14    # -0.18f

    .line 256
    .line 257
    .line 258
    const v14, 0x3e3851ec    # 0.18f

    .line 259
    .line 260
    .line 261
    const/high16 v15, -0x41000000    # -0.5f

    .line 262
    .line 263
    const v16, 0x3e570a3d    # 0.21f

    .line 264
    .line 265
    .line 266
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 267
    .line 268
    .line 269
    const/16 v17, 0x0

    .line 270
    .line 271
    const v18, -0x40ca3d71    # -0.71f

    .line 272
    .line 273
    .line 274
    const v13, -0x41bd70a4    # -0.19f

    .line 275
    .line 276
    .line 277
    const v14, -0x41b33333    # -0.2f

    .line 278
    .line 279
    .line 280
    const v15, -0x41bd70a4    # -0.19f

    .line 281
    .line 282
    .line 283
    const v16, -0x40fd70a4    # -0.51f

    .line 284
    .line 285
    .line 286
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 287
    .line 288
    .line 289
    const v0, 0x41066666    # 8.4f

    .line 290
    .line 291
    .line 292
    const v2, 0x411851ec    # 9.52f

    .line 293
    .line 294
    .line 295
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 296
    .line 297
    .line 298
    const v0, 0x3fef5c29    # 1.87f

    .line 299
    .line 300
    .line 301
    const v2, 0x3fee147b    # 1.86f

    .line 302
    .line 303
    .line 304
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 305
    .line 306
    .line 307
    const v17, 0x40628f5c    # 3.54f

    .line 308
    .line 309
    .line 310
    const/16 v18, 0x0

    .line 311
    .line 312
    const v13, 0x3f733333    # 0.95f

    .line 313
    .line 314
    .line 315
    const v14, 0x3f733333    # 0.95f

    .line 316
    .line 317
    .line 318
    const v15, 0x4025c28f    # 2.59f

    .line 319
    .line 320
    .line 321
    const v16, 0x3f70a3d7    # 0.94f

    .line 322
    .line 323
    .line 324
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 325
    .line 326
    .line 327
    const/16 v17, 0x0

    .line 328
    .line 329
    const v18, -0x3f9d70a4    # -3.54f

    .line 330
    .line 331
    .line 332
    const v13, 0x3f7ae148    # 0.98f

    .line 333
    .line 334
    .line 335
    const v14, -0x40851eb8    # -0.98f

    .line 336
    .line 337
    .line 338
    const v15, 0x3f7ae148    # 0.98f

    .line 339
    .line 340
    .line 341
    const v16, -0x3fdc28f6    # -2.56f

    .line 342
    .line 343
    .line 344
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 345
    .line 346
    .line 347
    const v0, -0x4011eb85    # -1.86f

    .line 348
    .line 349
    .line 350
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 351
    .line 352
    .line 353
    const v0, 0x3e8f5c29    # 0.28f

    .line 354
    .line 355
    .line 356
    const v2, -0x4170a3d7    # -0.28f

    .line 357
    .line 358
    .line 359
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 360
    .line 361
    .line 362
    const v17, 0x40351eb8    # 2.83f

    .line 363
    .line 364
    .line 365
    const/16 v18, 0x0

    .line 366
    .line 367
    const v13, 0x3f47ae14    # 0.78f

    .line 368
    .line 369
    .line 370
    const v14, -0x40b851ec    # -0.78f

    .line 371
    .line 372
    .line 373
    const v15, 0x40033333    # 2.05f

    .line 374
    .line 375
    .line 376
    const v16, -0x40b851ec    # -0.78f

    .line 377
    .line 378
    .line 379
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 380
    .line 381
    .line 382
    const v0, 0x4087ae14    # 4.24f

    .line 383
    .line 384
    .line 385
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 386
    .line 387
    .line 388
    const/16 v17, 0x0

    .line 389
    .line 390
    const v18, 0x40351eb8    # 2.83f

    .line 391
    .line 392
    .line 393
    const v14, 0x3f47ae14    # 0.78f

    .line 394
    .line 395
    .line 396
    const v15, 0x3f47ae14    # 0.78f

    .line 397
    .line 398
    .line 399
    const v16, 0x40033333    # 2.05f

    .line 400
    .line 401
    .line 402
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 403
    .line 404
    .line 405
    const v0, 0x419ecccd    # 19.85f

    .line 406
    .line 407
    .line 408
    const v2, 0x4143851f    # 12.22f

    .line 409
    .line 410
    .line 411
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 412
    .line 413
    .line 414
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 415
    .line 416
    .line 417
    const v0, 0x41511eb8    # 13.07f

    .line 418
    .line 419
    .line 420
    const v2, 0x41aea3d7    # 21.83f

    .line 421
    .line 422
    .line 423
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 424
    .line 425
    .line 426
    const v18, -0x3f4ae148    # -5.66f

    .line 427
    .line 428
    .line 429
    const v13, 0x3fc7ae14    # 1.56f

    .line 430
    .line 431
    .line 432
    const v14, -0x403851ec    # -1.56f

    .line 433
    .line 434
    .line 435
    const v15, 0x3fc7ae14    # 1.56f

    .line 436
    .line 437
    .line 438
    const v16, -0x3f7d1eb8    # -4.09f

    .line 439
    .line 440
    .line 441
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 442
    .line 443
    .line 444
    const v0, -0x3f7851ec    # -4.24f

    .line 445
    .line 446
    .line 447
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 448
    .line 449
    .line 450
    const v17, -0x3f4ae148    # -5.66f

    .line 451
    .line 452
    .line 453
    const/16 v18, 0x0

    .line 454
    .line 455
    const v13, -0x403851ec    # -1.56f

    .line 456
    .line 457
    .line 458
    const v15, -0x3f7d1eb8    # -4.09f

    .line 459
    .line 460
    .line 461
    const v16, -0x403851ec    # -1.56f

    .line 462
    .line 463
    .line 464
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 465
    .line 466
    .line 467
    const v0, 0x3e8f5c29    # 0.28f

    .line 468
    .line 469
    .line 470
    const v2, -0x4170a3d7    # -0.28f

    .line 471
    .line 472
    .line 473
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 474
    .line 475
    .line 476
    const v0, -0x4170a3d7    # -0.28f

    .line 477
    .line 478
    .line 479
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 480
    .line 481
    .line 482
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 483
    .line 484
    .line 485
    const v0, 0x400ae148    # 2.17f

    .line 486
    .line 487
    .line 488
    const v2, 0x40d6b852    # 6.71f

    .line 489
    .line 490
    .line 491
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 492
    .line 493
    .line 494
    const v17, -0x41333333    # -0.4f

    .line 495
    .line 496
    .line 497
    const v18, 0x40a6147b    # 5.19f

    .line 498
    .line 499
    .line 500
    const v13, -0x404a3d71    # -1.42f

    .line 501
    .line 502
    .line 503
    const v14, 0x3fb5c28f    # 1.42f

    .line 504
    .line 505
    .line 506
    const v15, -0x4039999a    # -1.55f

    .line 507
    .line 508
    .line 509
    const v16, 0x406851ec    # 3.63f

    .line 510
    .line 511
    .line 512
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 513
    .line 514
    .line 515
    const v0, 0x3fb9999a    # 1.45f

    .line 516
    .line 517
    .line 518
    const v2, -0x40466666    # -1.45f

    .line 519
    .line 520
    .line 521
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 522
    .line 523
    .line 524
    const v17, 0x4065c28f    # 3.59f

    .line 525
    .line 526
    .line 527
    const v18, 0x4101eb85    # 8.12f

    .line 528
    .line 529
    .line 530
    const v13, 0x40351eb8    # 2.83f

    .line 531
    .line 532
    .line 533
    const v14, 0x411b3333    # 9.7f

    .line 534
    .line 535
    .line 536
    const v15, 0x403d70a4    # 2.96f

    .line 537
    .line 538
    .line 539
    const/high16 v16, 0x410c0000    # 8.75f

    .line 540
    .line 541
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 542
    .line 543
    .line 544
    const v0, 0x40628f5c    # 3.54f

    .line 545
    .line 546
    .line 547
    const v2, -0x3f9d70a4    # -3.54f

    .line 548
    .line 549
    .line 550
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 551
    .line 552
    .line 553
    const v17, 0x40351eb8    # 2.83f

    .line 554
    .line 555
    .line 556
    const/16 v18, 0x0

    .line 557
    .line 558
    const v13, 0x3f47ae14    # 0.78f

    .line 559
    .line 560
    .line 561
    const v14, -0x40b851ec    # -0.78f

    .line 562
    .line 563
    .line 564
    const v15, 0x40033333    # 2.05f

    .line 565
    .line 566
    .line 567
    const v16, -0x40b851ec    # -0.78f

    .line 568
    .line 569
    .line 570
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 571
    .line 572
    .line 573
    const v0, 0x4063d70a    # 3.56f

    .line 574
    .line 575
    .line 576
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 577
    .line 578
    .line 579
    const/16 v17, 0x0

    .line 580
    .line 581
    const v18, 0x3f35c28f    # 0.71f

    .line 582
    .line 583
    .line 584
    const v13, 0x3e3851ec    # 0.18f

    .line 585
    .line 586
    .line 587
    const v14, 0x3e3851ec    # 0.18f

    .line 588
    .line 589
    .line 590
    const v15, 0x3e570a3d    # 0.21f

    .line 591
    .line 592
    .line 593
    const/high16 v16, 0x3f000000    # 0.5f

    .line 594
    .line 595
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 596
    .line 597
    .line 598
    const v17, -0x40ca3d71    # -0.71f

    .line 599
    .line 600
    .line 601
    const/16 v18, 0x0

    .line 602
    .line 603
    const v13, -0x41a8f5c3    # -0.21f

    .line 604
    .line 605
    .line 606
    const v14, 0x3e570a3d    # 0.21f

    .line 607
    .line 608
    .line 609
    const v15, -0x40f851ec    # -0.53f

    .line 610
    .line 611
    .line 612
    const v16, 0x3e3851ec    # 0.18f

    .line 613
    .line 614
    .line 615
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 616
    .line 617
    .line 618
    const v0, 0x40b23d71    # 5.57f

    .line 619
    .line 620
    .line 621
    const v2, 0x411851ec    # 9.52f

    .line 622
    .line 623
    .line 624
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 625
    .line 626
    .line 627
    const v0, -0x3f466666    # -5.8f

    .line 628
    .line 629
    .line 630
    const v2, 0x40b947ae    # 5.79f

    .line 631
    .line 632
    .line 633
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 634
    .line 635
    .line 636
    const/16 v17, 0x0

    .line 637
    .line 638
    const v18, 0x40628f5c    # 3.54f

    .line 639
    .line 640
    .line 641
    const v13, -0x40851eb8    # -0.98f

    .line 642
    .line 643
    .line 644
    const v14, 0x3f7851ec    # 0.97f

    .line 645
    .line 646
    .line 647
    const v15, -0x40851eb8    # -0.98f

    .line 648
    .line 649
    .line 650
    const v16, 0x4023d70a    # 2.56f

    .line 651
    .line 652
    .line 653
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 654
    .line 655
    .line 656
    const v17, 0x3fb5c28f    # 1.42f

    .line 657
    .line 658
    .line 659
    const v18, 0x3f333333    # 0.7f

    .line 660
    .line 661
    .line 662
    const v13, 0x3ec7ae14    # 0.39f

    .line 663
    .line 664
    .line 665
    const v14, 0x3ec7ae14    # 0.39f

    .line 666
    .line 667
    .line 668
    const v15, 0x3f63d70a    # 0.89f

    .line 669
    .line 670
    .line 671
    const v16, 0x3f2147ae    # 0.63f

    .line 672
    .line 673
    .line 674
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 675
    .line 676
    .line 677
    const v17, 0x3f333333    # 0.7f

    .line 678
    .line 679
    .line 680
    const v18, 0x3fb5c28f    # 1.42f

    .line 681
    .line 682
    .line 683
    const v13, 0x3d8f5c29    # 0.07f

    .line 684
    .line 685
    .line 686
    const v14, 0x3f051eb8    # 0.52f

    .line 687
    .line 688
    .line 689
    const v15, 0x3e99999a    # 0.3f

    .line 690
    .line 691
    .line 692
    const v16, 0x3f828f5c    # 1.02f

    .line 693
    .line 694
    .line 695
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 696
    .line 697
    .line 698
    const v17, 0x3fb5c28f    # 1.42f

    .line 699
    .line 700
    .line 701
    const v18, 0x3f333333    # 0.7f

    .line 702
    .line 703
    .line 704
    const v13, 0x3ecccccd    # 0.4f

    .line 705
    .line 706
    .line 707
    const v14, 0x3ecccccd    # 0.4f

    .line 708
    .line 709
    .line 710
    const v15, 0x3f666666    # 0.9f

    .line 711
    .line 712
    .line 713
    const v16, 0x3f2147ae    # 0.63f

    .line 714
    .line 715
    .line 716
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 717
    .line 718
    .line 719
    const v17, 0x3f333333    # 0.7f

    .line 720
    .line 721
    .line 722
    const v18, 0x3fb5c28f    # 1.42f

    .line 723
    .line 724
    .line 725
    const v13, 0x3d8f5c29    # 0.07f

    .line 726
    .line 727
    .line 728
    const v14, 0x3f051eb8    # 0.52f

    .line 729
    .line 730
    .line 731
    const v15, 0x3e99999a    # 0.3f

    .line 732
    .line 733
    .line 734
    const v16, 0x3f828f5c    # 1.02f

    .line 735
    .line 736
    .line 737
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 738
    .line 739
    .line 740
    const v17, 0x3fb5c28f    # 1.42f

    .line 741
    .line 742
    .line 743
    const v18, 0x3f333333    # 0.7f

    .line 744
    .line 745
    .line 746
    const v13, 0x3ecccccd    # 0.4f

    .line 747
    .line 748
    .line 749
    const v14, 0x3ecccccd    # 0.4f

    .line 750
    .line 751
    .line 752
    const v15, 0x3f666666    # 0.9f

    .line 753
    .line 754
    .line 755
    const v16, 0x3f2147ae    # 0.63f

    .line 756
    .line 757
    .line 758
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 759
    .line 760
    .line 761
    const v17, 0x3f333333    # 0.7f

    .line 762
    .line 763
    .line 764
    const v18, 0x3fb5c28f    # 1.42f

    .line 765
    .line 766
    .line 767
    const v13, 0x3d8f5c29    # 0.07f

    .line 768
    .line 769
    .line 770
    const v14, 0x3f0a3d71    # 0.54f

    .line 771
    .line 772
    .line 773
    const v15, 0x3e9eb852    # 0.31f

    .line 774
    .line 775
    .line 776
    const v16, 0x3f83d70a    # 1.03f

    .line 777
    .line 778
    .line 779
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 780
    .line 781
    .line 782
    const v17, 0x3fe28f5c    # 1.77f

    .line 783
    .line 784
    .line 785
    const v18, 0x3f3ae148    # 0.73f

    .line 786
    .line 787
    .line 788
    const v13, 0x3ef0a3d7    # 0.47f

    .line 789
    .line 790
    .line 791
    const v14, 0x3ef0a3d7    # 0.47f

    .line 792
    .line 793
    .line 794
    const v15, 0x3f8ccccd    # 1.1f

    .line 795
    .line 796
    .line 797
    const v16, 0x3f3ae148    # 0.73f

    .line 798
    .line 799
    .line 800
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 801
    .line 802
    .line 803
    const v18, -0x40c51eb8    # -0.73f

    .line 804
    .line 805
    .line 806
    const v13, 0x3f2b851f    # 0.67f

    .line 807
    .line 808
    .line 809
    const/4 v14, 0x0

    .line 810
    const v15, 0x3fa66666    # 1.3f

    .line 811
    .line 812
    .line 813
    const v16, -0x417ae148    # -0.26f

    .line 814
    .line 815
    .line 816
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 817
    .line 818
    .line 819
    const v0, 0x41511eb8    # 13.07f

    .line 820
    .line 821
    .line 822
    const v2, 0x41aea3d7    # 21.83f

    .line 823
    .line 824
    .line 825
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 826
    .line 827
    .line 828
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 829
    .line 830
    .line 831
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 832
    .line 833
    .line 834
    move-result-object v2

    .line 835
    const/16 v16, 0x3800

    .line 836
    .line 837
    const/16 v17, 0x0

    .line 838
    .line 839
    const/high16 v6, 0x3f800000    # 1.0f

    .line 840
    .line 841
    const/high16 v8, 0x3f800000    # 1.0f

    .line 842
    .line 843
    const/4 v7, 0x0

    .line 844
    const/high16 v9, 0x3f800000    # 1.0f

    .line 845
    .line 846
    const/high16 v12, 0x3f800000    # 1.0f

    .line 847
    .line 848
    const/4 v13, 0x0

    .line 849
    const/4 v15, 0x0

    .line 850
    const-string v4, ""

    .line 851
    .line 852
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 853
    .line 854
    .line 855
    move-result-object v0

    .line 856
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 857
    .line 858
    .line 859
    move-result-object v0

    .line 860
    sput-object v0, Landroidx/compose/material/icons/outlined/HandshakeKt;->_handshake:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 861
    .line 862
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 863
    .line 864
    .line 865
    return-object v0
.end method
