.class public final Landroidx/compose/material/icons/rounded/RingVolumeKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_ringVolume",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "RingVolume",
        "Landroidx/compose/material/icons/Icons$Rounded;",
        "getRingVolume",
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
        "SMAP\nRingVolume.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RingVolume.kt\nandroidx/compose/material/icons/rounded/RingVolumeKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,81:1\n212#2,12:82\n233#2,18:95\n253#2:132\n174#3:94\n705#4,2:113\n717#4,2:115\n719#4,11:121\n72#5,4:117\n*S KotlinDebug\n*F\n+ 1 RingVolume.kt\nandroidx/compose/material/icons/rounded/RingVolumeKt\n*L\n29#1:82,12\n30#1:95,18\n30#1:132\n29#1:94\n30#1:113,2\n30#1:115,2\n30#1:121,11\n30#1:117,4\n*E\n"
    }
.end annotation


# static fields
.field private static _ringVolume:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getRingVolume(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/RingVolumeKt;->_ringVolume:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.RingVolume"

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
    const v0, 0x413fae14    # 11.98f

    .line 71
    .line 72
    .line 73
    const/high16 v2, 0x40e00000    # 7.0f

    .line 74
    .line 75
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    const v0, 0x3cf5c28f    # 0.03f

    .line 79
    .line 80
    .line 81
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 82
    .line 83
    .line 84
    const v17, 0x3f7d70a4    # 0.99f

    .line 85
    .line 86
    .line 87
    const v18, -0x40851eb8    # -0.98f

    .line 88
    .line 89
    .line 90
    const v13, 0x3f0ccccd    # 0.55f

    .line 91
    .line 92
    .line 93
    const/4 v14, 0x0

    .line 94
    const v15, 0x3f7d70a4    # 0.99f

    .line 95
    .line 96
    .line 97
    const v16, -0x411eb852    # -0.44f

    .line 98
    .line 99
    .line 100
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 101
    .line 102
    .line 103
    const/high16 v0, 0x41500000    # 13.0f

    .line 104
    .line 105
    const v2, 0x403eb852    # 2.98f

    .line 106
    .line 107
    .line 108
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 109
    .line 110
    .line 111
    const v17, -0x40851eb8    # -0.98f

    .line 112
    .line 113
    .line 114
    const/4 v13, 0x0

    .line 115
    const v14, -0x40f5c28f    # -0.54f

    .line 116
    .line 117
    .line 118
    const v15, -0x411eb852    # -0.44f

    .line 119
    .line 120
    .line 121
    const v16, -0x40851eb8    # -0.98f

    .line 122
    .line 123
    .line 124
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 125
    .line 126
    .line 127
    const v0, -0x430a3d71    # -0.03f

    .line 128
    .line 129
    .line 130
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 131
    .line 132
    .line 133
    const v17, -0x40828f5c    # -0.99f

    .line 134
    .line 135
    .line 136
    const v18, 0x3f7ae148    # 0.98f

    .line 137
    .line 138
    .line 139
    const v13, -0x40f33333    # -0.55f

    .line 140
    .line 141
    .line 142
    const/4 v14, 0x0

    .line 143
    const v15, -0x40828f5c    # -0.99f

    .line 144
    .line 145
    .line 146
    const v16, 0x3ee147ae    # 0.44f

    .line 147
    .line 148
    .line 149
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 150
    .line 151
    .line 152
    const v0, 0x4041eb85    # 3.03f

    .line 153
    .line 154
    .line 155
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 156
    .line 157
    .line 158
    const v17, 0x3f7ae148    # 0.98f

    .line 159
    .line 160
    .line 161
    const v18, 0x3f7d70a4    # 0.99f

    .line 162
    .line 163
    .line 164
    const/4 v13, 0x0

    .line 165
    const v14, 0x3f0ccccd    # 0.55f

    .line 166
    .line 167
    .line 168
    const v15, 0x3ee147ae    # 0.44f

    .line 169
    .line 170
    .line 171
    const v16, 0x3f7d70a4    # 0.99f

    .line 172
    .line 173
    .line 174
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 175
    .line 176
    .line 177
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 178
    .line 179
    .line 180
    const v0, 0x41873333    # 16.9f

    .line 181
    .line 182
    .line 183
    const v2, 0x4111c28f    # 9.11f

    .line 184
    .line 185
    .line 186
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 187
    .line 188
    .line 189
    const v17, 0x3fb33333    # 1.4f

    .line 190
    .line 191
    .line 192
    const/16 v18, 0x0

    .line 193
    .line 194
    const v13, 0x3ec7ae14    # 0.39f

    .line 195
    .line 196
    .line 197
    const v14, 0x3ec7ae14    # 0.39f

    .line 198
    .line 199
    .line 200
    const v15, 0x3f8147ae    # 1.01f

    .line 201
    .line 202
    .line 203
    const v16, 0x3ec7ae14    # 0.39f

    .line 204
    .line 205
    .line 206
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 207
    .line 208
    .line 209
    const v17, 0x4009999a    # 2.15f

    .line 210
    .line 211
    .line 212
    const v18, -0x3ff51eb8    # -2.17f

    .line 213
    .line 214
    .line 215
    const v13, 0x3f1eb852    # 0.62f

    .line 216
    .line 217
    .line 218
    const v14, -0x40deb852    # -0.63f

    .line 219
    .line 220
    .line 221
    const v15, 0x3fc28f5c    # 1.52f

    .line 222
    .line 223
    .line 224
    const v16, -0x403ae148    # -1.54f

    .line 225
    .line 226
    .line 227
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 228
    .line 229
    .line 230
    const/16 v17, 0x0

    .line 231
    .line 232
    const v18, -0x404e147b    # -1.39f

    .line 233
    .line 234
    .line 235
    const v13, 0x3ec7ae14    # 0.39f

    .line 236
    .line 237
    .line 238
    const v14, -0x413d70a4    # -0.38f

    .line 239
    .line 240
    .line 241
    const v15, 0x3ec7ae14    # 0.39f

    .line 242
    .line 243
    .line 244
    const v16, -0x407eb852    # -1.01f

    .line 245
    .line 246
    .line 247
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 248
    .line 249
    .line 250
    const v17, -0x404e147b    # -1.39f

    .line 251
    .line 252
    .line 253
    const/16 v18, 0x0

    .line 254
    .line 255
    const v13, -0x413d70a4    # -0.38f

    .line 256
    .line 257
    .line 258
    const v15, -0x407eb852    # -1.01f

    .line 259
    .line 260
    .line 261
    const v16, -0x413d70a4    # -0.38f

    .line 262
    .line 263
    .line 264
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 265
    .line 266
    .line 267
    const v0, 0x41871eb8    # 16.89f

    .line 268
    .line 269
    .line 270
    const v2, 0x40f66666    # 7.7f

    .line 271
    .line 272
    .line 273
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 274
    .line 275
    .line 276
    const/16 v17, 0x0

    .line 277
    .line 278
    const v18, 0x3fb1eb85    # 1.39f

    .line 279
    .line 280
    .line 281
    const v13, -0x413851ec    # -0.39f

    .line 282
    .line 283
    .line 284
    const v14, 0x3ec28f5c    # 0.38f

    .line 285
    .line 286
    .line 287
    const v15, -0x413851ec    # -0.39f

    .line 288
    .line 289
    .line 290
    const v16, 0x3f8147ae    # 1.01f

    .line 291
    .line 292
    .line 293
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 294
    .line 295
    .line 296
    const v0, 0x3ca3d70a    # 0.02f

    .line 297
    .line 298
    .line 299
    const v2, 0x3c23d70a    # 0.01f

    .line 300
    .line 301
    .line 302
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 303
    .line 304
    .line 305
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 306
    .line 307
    .line 308
    const v0, 0x40b6b852    # 5.71f

    .line 309
    .line 310
    .line 311
    const v2, 0x4111999a    # 9.1f

    .line 312
    .line 313
    .line 314
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 315
    .line 316
    .line 317
    const v17, 0x3fb33333    # 1.4f

    .line 318
    .line 319
    .line 320
    const/16 v18, 0x0

    .line 321
    .line 322
    const v13, 0x3ec28f5c    # 0.38f

    .line 323
    .line 324
    .line 325
    const v14, 0x3ec7ae14    # 0.39f

    .line 326
    .line 327
    .line 328
    const v15, 0x3f8147ae    # 1.01f

    .line 329
    .line 330
    .line 331
    const v16, 0x3ec7ae14    # 0.39f

    .line 332
    .line 333
    .line 334
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 335
    .line 336
    .line 337
    const/16 v17, 0x0

    .line 338
    .line 339
    const v18, -0x404e147b    # -1.39f

    .line 340
    .line 341
    .line 342
    const v14, -0x413d70a4    # -0.38f

    .line 343
    .line 344
    .line 345
    const v15, 0x3ec28f5c    # 0.38f

    .line 346
    .line 347
    .line 348
    const v16, -0x407eb852    # -1.01f

    .line 349
    .line 350
    .line 351
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 352
    .line 353
    .line 354
    const v0, 0x409eb852    # 4.96f

    .line 355
    .line 356
    .line 357
    const v2, 0x40b147ae    # 5.54f

    .line 358
    .line 359
    .line 360
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 361
    .line 362
    .line 363
    const v17, -0x404e147b    # -1.39f

    .line 364
    .line 365
    .line 366
    const/16 v18, 0x0

    .line 367
    .line 368
    const v13, -0x413d70a4    # -0.38f

    .line 369
    .line 370
    .line 371
    const v14, -0x413851ec    # -0.39f

    .line 372
    .line 373
    .line 374
    const v15, -0x407eb852    # -1.01f

    .line 375
    .line 376
    .line 377
    const v16, -0x413851ec    # -0.39f

    .line 378
    .line 379
    .line 380
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 381
    .line 382
    .line 383
    const v0, -0x435c28f6    # -0.02f

    .line 384
    .line 385
    .line 386
    const v2, 0x3c23d70a    # 0.01f

    .line 387
    .line 388
    .line 389
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 390
    .line 391
    .line 392
    const/16 v17, 0x0

    .line 393
    .line 394
    const v18, 0x3fb1eb85    # 1.39f

    .line 395
    .line 396
    .line 397
    const v13, -0x413851ec    # -0.39f

    .line 398
    .line 399
    .line 400
    const v14, 0x3ec7ae14    # 0.39f

    .line 401
    .line 402
    .line 403
    const v15, -0x413851ec    # -0.39f

    .line 404
    .line 405
    .line 406
    const v16, 0x3f8147ae    # 1.01f

    .line 407
    .line 408
    .line 409
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 410
    .line 411
    .line 412
    const v17, 0x400a3d71    # 2.16f

    .line 413
    .line 414
    .line 415
    const v18, 0x400a3d71    # 2.16f

    .line 416
    .line 417
    .line 418
    const v13, 0x3f2147ae    # 0.63f

    .line 419
    .line 420
    .line 421
    const v14, 0x3f1eb852    # 0.62f

    .line 422
    .line 423
    .line 424
    const v15, 0x3fc51eb8    # 1.54f

    .line 425
    .line 426
    .line 427
    const v16, 0x3fc3d70a    # 1.53f

    .line 428
    .line 429
    .line 430
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 431
    .line 432
    .line 433
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 434
    .line 435
    .line 436
    const v0, 0x41ba51ec    # 23.29f

    .line 437
    .line 438
    .line 439
    const v2, 0x4181d70a    # 16.23f

    .line 440
    .line 441
    .line 442
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 443
    .line 444
    .line 445
    const v17, -0x3e4c28f6    # -22.48f

    .line 446
    .line 447
    .line 448
    const/16 v18, 0x0

    .line 449
    .line 450
    const v13, -0x3f32e148    # -6.41f

    .line 451
    .line 452
    .line 453
    const v14, -0x3f4ae148    # -5.66f

    .line 454
    .line 455
    .line 456
    const v15, -0x3e7f70a4    # -16.07f

    .line 457
    .line 458
    .line 459
    const v16, -0x3f4ae148    # -5.66f

    .line 460
    .line 461
    .line 462
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 463
    .line 464
    .line 465
    const v17, -0x42b33333    # -0.05f

    .line 466
    .line 467
    .line 468
    const v18, 0x403851ec    # 2.88f

    .line 469
    .line 470
    .line 471
    const v13, -0x40a66666    # -0.85f

    .line 472
    .line 473
    .line 474
    const/high16 v14, 0x3f400000    # 0.75f

    .line 475
    .line 476
    const v15, -0x40a66666    # -0.85f

    .line 477
    .line 478
    .line 479
    const v16, 0x40051eb8    # 2.08f

    .line 480
    .line 481
    .line 482
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 483
    .line 484
    .line 485
    const v0, 0x3f9c28f6    # 1.22f

    .line 486
    .line 487
    .line 488
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 489
    .line 490
    .line 491
    const v17, 0x402a3d71    # 2.66f

    .line 492
    .line 493
    .line 494
    const v18, 0x3e19999a    # 0.15f

    .line 495
    .line 496
    .line 497
    const v13, 0x3f3851ec    # 0.72f

    .line 498
    .line 499
    .line 500
    const v14, 0x3f3851ec    # 0.72f

    .line 501
    .line 502
    .line 503
    const v15, 0x3fee147b    # 1.86f

    .line 504
    .line 505
    .line 506
    const v16, 0x3f47ae14    # 0.78f

    .line 507
    .line 508
    .line 509
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 510
    .line 511
    .line 512
    const/high16 v0, 0x40000000    # 2.0f

    .line 513
    .line 514
    const v2, -0x40347ae1    # -1.59f

    .line 515
    .line 516
    .line 517
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 518
    .line 519
    .line 520
    const v17, 0x3f428f5c    # 0.76f

    .line 521
    .line 522
    .line 523
    const v18, -0x40370a3d    # -1.57f

    .line 524
    .line 525
    .line 526
    const v13, 0x3ef5c28f    # 0.48f

    .line 527
    .line 528
    .line 529
    const v14, -0x413d70a4    # -0.38f

    .line 530
    .line 531
    .line 532
    const v15, 0x3f428f5c    # 0.76f

    .line 533
    .line 534
    .line 535
    const v16, -0x408a3d71    # -0.96f

    .line 536
    .line 537
    .line 538
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 539
    .line 540
    .line 541
    const v0, -0x3fd9999a    # -2.6f

    .line 542
    .line 543
    .line 544
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 545
    .line 546
    .line 547
    const v17, 0x41151eb8    # 9.32f

    .line 548
    .line 549
    .line 550
    const/16 v18, 0x0

    .line 551
    .line 552
    const v13, 0x404147ae    # 3.02f

    .line 553
    .line 554
    .line 555
    const v14, -0x40851eb8    # -0.98f

    .line 556
    .line 557
    .line 558
    const v15, 0x40c947ae    # 6.29f

    .line 559
    .line 560
    .line 561
    const v16, -0x40828f5c    # -0.99f

    .line 562
    .line 563
    .line 564
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 565
    .line 566
    .line 567
    const v0, 0x40270a3d    # 2.61f

    .line 568
    .line 569
    .line 570
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 571
    .line 572
    .line 573
    const v17, 0x3f428f5c    # 0.76f

    .line 574
    .line 575
    .line 576
    const v18, 0x3fc8f5c3    # 1.57f

    .line 577
    .line 578
    .line 579
    const/4 v13, 0x0

    .line 580
    const v14, 0x3f1c28f6    # 0.61f

    .line 581
    .line 582
    .line 583
    const v15, 0x3e8f5c29    # 0.28f

    .line 584
    .line 585
    .line 586
    const v16, 0x3f9851ec    # 1.19f

    .line 587
    .line 588
    .line 589
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 590
    .line 591
    .line 592
    const v0, 0x3ffeb852    # 1.99f

    .line 593
    .line 594
    .line 595
    const v2, 0x3fca3d71    # 1.58f

    .line 596
    .line 597
    .line 598
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 599
    .line 600
    .line 601
    const v17, 0x402a3d71    # 2.66f

    .line 602
    .line 603
    .line 604
    const v18, -0x41e66666    # -0.15f

    .line 605
    .line 606
    .line 607
    const v13, 0x3f4ccccd    # 0.8f

    .line 608
    .line 609
    .line 610
    const v14, 0x3f2147ae    # 0.63f

    .line 611
    .line 612
    .line 613
    const v15, 0x3ff851ec    # 1.94f

    .line 614
    .line 615
    .line 616
    const v16, 0x3f11eb85    # 0.57f

    .line 617
    .line 618
    .line 619
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 620
    .line 621
    .line 622
    const v0, -0x4063d70a    # -1.22f

    .line 623
    .line 624
    .line 625
    const v2, 0x3f9c28f6    # 1.22f

    .line 626
    .line 627
    .line 628
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 629
    .line 630
    .line 631
    const v17, -0x428a3d71    # -0.06f

    .line 632
    .line 633
    .line 634
    const v18, -0x3fc7ae14    # -2.88f

    .line 635
    .line 636
    .line 637
    const v13, 0x3f4a3d71    # 0.79f

    .line 638
    .line 639
    .line 640
    const v14, -0x40b33333    # -0.8f

    .line 641
    .line 642
    .line 643
    const v15, 0x3f4a3d71    # 0.79f

    .line 644
    .line 645
    .line 646
    const v16, -0x3ff7ae14    # -2.13f

    .line 647
    .line 648
    .line 649
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 650
    .line 651
    .line 652
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 653
    .line 654
    .line 655
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 656
    .line 657
    .line 658
    move-result-object v2

    .line 659
    const/16 v16, 0x3800

    .line 660
    .line 661
    const/16 v17, 0x0

    .line 662
    .line 663
    const/high16 v6, 0x3f800000    # 1.0f

    .line 664
    .line 665
    const/high16 v8, 0x3f800000    # 1.0f

    .line 666
    .line 667
    const/4 v7, 0x0

    .line 668
    const/high16 v9, 0x3f800000    # 1.0f

    .line 669
    .line 670
    const/high16 v12, 0x3f800000    # 1.0f

    .line 671
    .line 672
    const/4 v13, 0x0

    .line 673
    const/4 v14, 0x0

    .line 674
    const/4 v15, 0x0

    .line 675
    const-string v4, ""

    .line 676
    .line 677
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 678
    .line 679
    .line 680
    move-result-object v0

    .line 681
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 682
    .line 683
    .line 684
    move-result-object v0

    .line 685
    sput-object v0, Landroidx/compose/material/icons/rounded/RingVolumeKt;->_ringVolume:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 686
    .line 687
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 688
    .line 689
    .line 690
    return-object v0
.end method
