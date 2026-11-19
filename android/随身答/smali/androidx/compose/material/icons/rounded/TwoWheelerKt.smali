.class public final Landroidx/compose/material/icons/rounded/TwoWheelerKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_twoWheeler",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "TwoWheeler",
        "Landroidx/compose/material/icons/Icons$Rounded;",
        "getTwoWheeler",
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
        "SMAP\nTwoWheeler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TwoWheeler.kt\nandroidx/compose/material/icons/rounded/TwoWheelerKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,91:1\n212#2,12:92\n233#2,18:105\n253#2:142\n174#3:104\n705#4,2:123\n717#4,2:125\n719#4,11:131\n72#5,4:127\n*S KotlinDebug\n*F\n+ 1 TwoWheeler.kt\nandroidx/compose/material/icons/rounded/TwoWheelerKt\n*L\n29#1:92,12\n30#1:105,18\n30#1:142\n29#1:104\n30#1:123,2\n30#1:125,2\n30#1:131,11\n30#1:127,4\n*E\n"
    }
.end annotation


# static fields
.field private static _twoWheeler:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getTwoWheeler(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/TwoWheelerKt;->_twoWheeler:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.TwoWheeler"

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
    const/high16 v0, 0x41300000    # 11.0f

    .line 71
    .line 72
    const/high16 v2, 0x41a00000    # 20.0f

    .line 73
    .line 74
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const v17, -0x40f851ec    # -0.53f

    .line 78
    .line 79
    .line 80
    const v18, 0x3d4ccccd    # 0.05f

    .line 81
    .line 82
    .line 83
    const v13, -0x41c7ae14    # -0.18f

    .line 84
    .line 85
    .line 86
    const/4 v14, 0x0

    .line 87
    const v15, -0x4147ae14    # -0.36f

    .line 88
    .line 89
    .line 90
    const v16, 0x3cf5c28f    # 0.03f

    .line 91
    .line 92
    .line 93
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 94
    .line 95
    .line 96
    const v0, 0x418b47ae    # 17.41f

    .line 97
    .line 98
    .line 99
    const/high16 v2, 0x41100000    # 9.0f

    .line 100
    .line 101
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 102
    .line 103
    .line 104
    const/high16 v0, 0x41980000    # 19.0f

    .line 105
    .line 106
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 107
    .line 108
    .line 109
    const/high16 v17, 0x3f800000    # 1.0f

    .line 110
    .line 111
    const/high16 v18, -0x40800000    # -1.0f

    .line 112
    .line 113
    const v13, 0x3f0ccccd    # 0.55f

    .line 114
    .line 115
    .line 116
    const/high16 v15, 0x3f800000    # 1.0f

    .line 117
    .line 118
    const v16, -0x4119999a    # -0.45f

    .line 119
    .line 120
    .line 121
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 122
    .line 123
    .line 124
    const v0, 0x40f3d70a    # 7.62f

    .line 125
    .line 126
    .line 127
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 128
    .line 129
    .line 130
    const v17, -0x40466666    # -1.45f

    .line 131
    .line 132
    .line 133
    const v18, -0x409c28f6    # -0.89f

    .line 134
    .line 135
    .line 136
    const/4 v13, 0x0

    .line 137
    const v14, -0x40c28f5c    # -0.74f

    .line 138
    .line 139
    .line 140
    const v15, -0x40b851ec    # -0.78f

    .line 141
    .line 142
    .line 143
    const v16, -0x40628f5c    # -1.23f

    .line 144
    .line 145
    .line 146
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 147
    .line 148
    .line 149
    const v0, -0x3fee147b    # -2.28f

    .line 150
    .line 151
    .line 152
    const v2, 0x3f91eb85    # 1.14f

    .line 153
    .line 154
    .line 155
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 156
    .line 157
    .line 158
    const v0, -0x3fdb851f    # -2.57f

    .line 159
    .line 160
    .line 161
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 162
    .line 163
    .line 164
    const/high16 v17, 0x41500000    # 13.0f

    .line 165
    .line 166
    const/high16 v18, 0x40a00000    # 5.0f

    .line 167
    .line 168
    const v13, 0x415851ec    # 13.52f

    .line 169
    .line 170
    .line 171
    const v14, 0x40a3851f    # 5.11f

    .line 172
    .line 173
    .line 174
    const v15, 0x415428f6    # 13.26f

    .line 175
    .line 176
    .line 177
    const/high16 v16, 0x40a00000    # 5.0f

    .line 178
    .line 179
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 180
    .line 181
    .line 182
    const/high16 v0, -0x3fc00000    # -3.0f

    .line 183
    .line 184
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 185
    .line 186
    .line 187
    const/high16 v17, 0x41100000    # 9.0f

    .line 188
    .line 189
    const/high16 v18, 0x40c00000    # 6.0f

    .line 190
    .line 191
    const v13, 0x41173333    # 9.45f

    .line 192
    .line 193
    .line 194
    const/high16 v14, 0x40a00000    # 5.0f

    .line 195
    .line 196
    const/high16 v15, 0x41100000    # 9.0f

    .line 197
    .line 198
    const v16, 0x40ae6666    # 5.45f

    .line 199
    .line 200
    .line 201
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 202
    .line 203
    .line 204
    const/4 v0, 0x0

    .line 205
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 206
    .line 207
    .line 208
    const/high16 v17, 0x3f800000    # 1.0f

    .line 209
    .line 210
    const/high16 v18, 0x3f800000    # 1.0f

    .line 211
    .line 212
    const/4 v13, 0x0

    .line 213
    const v14, 0x3f0ccccd    # 0.55f

    .line 214
    .line 215
    .line 216
    const v15, 0x3ee66666    # 0.45f

    .line 217
    .line 218
    .line 219
    const/high16 v16, 0x3f800000    # 1.0f

    .line 220
    .line 221
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 222
    .line 223
    .line 224
    const v0, 0x400ae148    # 2.17f

    .line 225
    .line 226
    .line 227
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 228
    .line 229
    .line 230
    const v17, 0x3f35c28f    # 0.71f

    .line 231
    .line 232
    .line 233
    const v18, 0x3e947ae1    # 0.29f

    .line 234
    .line 235
    .line 236
    const v13, 0x3e8a3d71    # 0.27f

    .line 237
    .line 238
    .line 239
    const/4 v14, 0x0

    .line 240
    const v15, 0x3f051eb8    # 0.52f

    .line 241
    .line 242
    .line 243
    const v16, 0x3de147ae    # 0.11f

    .line 244
    .line 245
    .line 246
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 247
    .line 248
    .line 249
    const v0, 0x416970a4    # 14.59f

    .line 250
    .line 251
    .line 252
    const/high16 v2, 0x41100000    # 9.0f

    .line 253
    .line 254
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 255
    .line 256
    .line 257
    const v0, -0x3fa9999a    # -3.35f

    .line 258
    .line 259
    .line 260
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 261
    .line 262
    .line 263
    const v17, -0x4119999a    # -0.45f

    .line 264
    .line 265
    .line 266
    const v18, 0x3de147ae    # 0.11f

    .line 267
    .line 268
    .line 269
    const v13, -0x41dc28f6    # -0.16f

    .line 270
    .line 271
    .line 272
    const v15, -0x416147ae    # -0.31f

    .line 273
    .line 274
    .line 275
    const v16, 0x3d23d70a    # 0.04f

    .line 276
    .line 277
    .line 278
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 279
    .line 280
    .line 281
    const v0, -0x3fb70a3d    # -3.14f

    .line 282
    .line 283
    .line 284
    const v2, 0x3fc8f5c3    # 1.57f

    .line 285
    .line 286
    .line 287
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 288
    .line 289
    .line 290
    const v17, -0x406ccccd    # -1.15f

    .line 291
    .line 292
    .line 293
    const v18, -0x41bd70a4    # -0.19f

    .line 294
    .line 295
    .line 296
    const v13, -0x413d70a4    # -0.38f

    .line 297
    .line 298
    .line 299
    const v14, 0x3e428f5c    # 0.19f

    .line 300
    .line 301
    .line 302
    const v15, -0x40a66666    # -0.85f

    .line 303
    .line 304
    .line 305
    const v16, 0x3df5c28f    # 0.12f

    .line 306
    .line 307
    .line 308
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 309
    .line 310
    .line 311
    const v0, -0x40666666    # -1.2f

    .line 312
    .line 313
    .line 314
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 315
    .line 316
    .line 317
    const v17, 0x4092e148    # 4.59f

    .line 318
    .line 319
    .line 320
    const/high16 v18, 0x41100000    # 9.0f

    .line 321
    .line 322
    const v13, 0x40a3851f    # 5.11f

    .line 323
    .line 324
    .line 325
    const v14, 0x4111c28f    # 9.11f

    .line 326
    .line 327
    .line 328
    const v15, 0x409b3333    # 4.85f

    .line 329
    .line 330
    .line 331
    const/high16 v16, 0x41100000    # 9.0f

    .line 332
    .line 333
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 334
    .line 335
    .line 336
    const/high16 v0, 0x3f800000    # 1.0f

    .line 337
    .line 338
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 339
    .line 340
    .line 341
    const/high16 v17, -0x40800000    # -1.0f

    .line 342
    .line 343
    const/high16 v18, 0x3f800000    # 1.0f

    .line 344
    .line 345
    const v13, -0x40f33333    # -0.55f

    .line 346
    .line 347
    .line 348
    const/4 v14, 0x0

    .line 349
    const/high16 v15, -0x40800000    # -1.0f

    .line 350
    .line 351
    const v16, 0x3ee66666    # 0.45f

    .line 352
    .line 353
    .line 354
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 355
    .line 356
    .line 357
    const/4 v0, 0x0

    .line 358
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 359
    .line 360
    .line 361
    const/high16 v17, 0x3f800000    # 1.0f

    .line 362
    .line 363
    const/4 v13, 0x0

    .line 364
    const v14, 0x3f0ccccd    # 0.55f

    .line 365
    .line 366
    .line 367
    const v15, 0x3ee66666    # 0.45f

    .line 368
    .line 369
    .line 370
    const/high16 v16, 0x3f800000    # 1.0f

    .line 371
    .line 372
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 373
    .line 374
    .line 375
    const/high16 v0, 0x40400000    # 3.0f

    .line 376
    .line 377
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 378
    .line 379
    .line 380
    const v17, -0x3f870a3d    # -3.89f

    .line 381
    .line 382
    .line 383
    const v18, 0x409e147b    # 4.94f

    .line 384
    .line 385
    .line 386
    const v13, -0x3fdeb852    # -2.52f

    .line 387
    .line 388
    .line 389
    const/4 v14, 0x0

    .line 390
    const v15, -0x3f7051ec    # -4.49f

    .line 391
    .line 392
    .line 393
    const v16, 0x40147ae1    # 2.32f

    .line 394
    .line 395
    .line 396
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 397
    .line 398
    .line 399
    const v17, 0x403ccccd    # 2.95f

    .line 400
    .line 401
    .line 402
    const v18, 0x403ccccd    # 2.95f

    .line 403
    .line 404
    .line 405
    const v13, 0x3ea8f5c3    # 0.33f

    .line 406
    .line 407
    .line 408
    const v14, 0x3fb9999a    # 1.45f

    .line 409
    .line 410
    .line 411
    const/high16 v15, 0x3fc00000    # 1.5f

    .line 412
    .line 413
    const v16, 0x4027ae14    # 2.62f

    .line 414
    .line 415
    .line 416
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 417
    .line 418
    .line 419
    const/high16 v17, 0x41000000    # 8.0f

    .line 420
    .line 421
    const/high16 v18, 0x41700000    # 15.0f

    .line 422
    .line 423
    const v13, 0x40b5c28f    # 5.68f

    .line 424
    .line 425
    .line 426
    const v14, 0x419beb85    # 19.49f

    .line 427
    .line 428
    .line 429
    const/high16 v15, 0x41000000    # 8.0f

    .line 430
    .line 431
    const v16, 0x418c28f6    # 17.52f

    .line 432
    .line 433
    .line 434
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 435
    .line 436
    .line 437
    const v0, 0x3fb47ae1    # 1.41f

    .line 438
    .line 439
    .line 440
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 441
    .line 442
    .line 443
    const v17, 0x412d47ae    # 10.83f

    .line 444
    .line 445
    .line 446
    const/high16 v18, 0x41880000    # 17.0f

    .line 447
    .line 448
    const v13, 0x411ca3d7    # 9.79f

    .line 449
    .line 450
    .line 451
    const v14, 0x418651ec    # 16.79f

    .line 452
    .line 453
    .line 454
    const v15, 0x4124cccd    # 10.3f

    .line 455
    .line 456
    .line 457
    const/high16 v16, 0x41880000    # 17.0f

    .line 458
    .line 459
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 460
    .line 461
    .line 462
    const v0, 0x3f8147ae    # 1.01f

    .line 463
    .line 464
    .line 465
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 466
    .line 467
    .line 468
    const v17, 0x3fdeb852    # 1.74f

    .line 469
    .line 470
    .line 471
    const v18, -0x407eb852    # -1.01f

    .line 472
    .line 473
    .line 474
    const v13, 0x3f3851ec    # 0.72f

    .line 475
    .line 476
    .line 477
    const/4 v14, 0x0

    .line 478
    const v15, 0x3fb0a3d7    # 1.38f

    .line 479
    .line 480
    .line 481
    const v16, -0x413d70a4    # -0.38f

    .line 482
    .line 483
    .line 484
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 485
    .line 486
    .line 487
    const v0, 0x403a3d71    # 2.91f

    .line 488
    .line 489
    .line 490
    const v2, -0x3f5d1eb8    # -5.09f

    .line 491
    .line 492
    .line 493
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 494
    .line 495
    .line 496
    const v0, 0x3f8147ae    # 1.01f

    .line 497
    .line 498
    .line 499
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 500
    .line 501
    .line 502
    const v17, -0x404f5c29    # -1.38f

    .line 503
    .line 504
    .line 505
    const v18, 0x4081999a    # 4.05f

    .line 506
    .line 507
    .line 508
    const v13, -0x406f5c29    # -1.13f

    .line 509
    .line 510
    .line 511
    const v14, 0x3f68f5c3    # 0.91f

    .line 512
    .line 513
    .line 514
    const v15, -0x401eb852    # -1.76f

    .line 515
    .line 516
    .line 517
    const v16, 0x401a3d71    # 2.41f

    .line 518
    .line 519
    .line 520
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 521
    .line 522
    .line 523
    const v17, 0x403ccccd    # 2.95f

    .line 524
    .line 525
    .line 526
    const v18, 0x403c28f6    # 2.94f

    .line 527
    .line 528
    .line 529
    const v13, 0x3eae147b    # 0.34f

    .line 530
    .line 531
    .line 532
    const v14, 0x3fb851ec    # 1.44f

    .line 533
    .line 534
    .line 535
    const v15, 0x3fc147ae    # 1.51f

    .line 536
    .line 537
    .line 538
    const v16, 0x40270a3d    # 2.61f

    .line 539
    .line 540
    .line 541
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 542
    .line 543
    .line 544
    const/high16 v17, 0x41c00000    # 24.0f

    .line 545
    .line 546
    const/high16 v18, 0x41700000    # 15.0f

    .line 547
    .line 548
    const v13, 0x41ad70a4    # 21.68f

    .line 549
    .line 550
    .line 551
    const v14, 0x419beb85    # 19.49f

    .line 552
    .line 553
    .line 554
    const/high16 v15, 0x41c00000    # 24.0f

    .line 555
    .line 556
    const v16, 0x418c147b    # 17.51f

    .line 557
    .line 558
    .line 559
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 560
    .line 561
    .line 562
    const/high16 v17, 0x41a00000    # 20.0f

    .line 563
    .line 564
    const/high16 v18, 0x41300000    # 11.0f

    .line 565
    .line 566
    const/high16 v13, 0x41c00000    # 24.0f

    .line 567
    .line 568
    const v14, 0x414ca3d7    # 12.79f

    .line 569
    .line 570
    .line 571
    const v15, 0x41b1ae14    # 22.21f

    .line 572
    .line 573
    .line 574
    const/high16 v16, 0x41300000    # 11.0f

    .line 575
    .line 576
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 577
    .line 578
    .line 579
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 580
    .line 581
    .line 582
    const/high16 v0, 0x40800000    # 4.0f

    .line 583
    .line 584
    const/high16 v2, 0x41880000    # 17.0f

    .line 585
    .line 586
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 587
    .line 588
    .line 589
    const/high16 v17, -0x40000000    # -2.0f

    .line 590
    .line 591
    const/high16 v18, -0x40000000    # -2.0f

    .line 592
    .line 593
    const v13, -0x40733333    # -1.1f

    .line 594
    .line 595
    .line 596
    const/4 v14, 0x0

    .line 597
    const/high16 v15, -0x40000000    # -2.0f

    .line 598
    .line 599
    const v16, -0x4099999a    # -0.9f

    .line 600
    .line 601
    .line 602
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 603
    .line 604
    .line 605
    const/high16 v17, 0x40000000    # 2.0f

    .line 606
    .line 607
    const/4 v13, 0x0

    .line 608
    const v14, -0x40733333    # -1.1f

    .line 609
    .line 610
    .line 611
    const v15, 0x3f666666    # 0.9f

    .line 612
    .line 613
    .line 614
    const/high16 v16, -0x40000000    # -2.0f

    .line 615
    .line 616
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 617
    .line 618
    .line 619
    const/high16 v18, 0x40000000    # 2.0f

    .line 620
    .line 621
    const v13, 0x3f8ccccd    # 1.1f

    .line 622
    .line 623
    .line 624
    const/4 v14, 0x0

    .line 625
    const/high16 v15, 0x40000000    # 2.0f

    .line 626
    .line 627
    const v16, 0x3f666666    # 0.9f

    .line 628
    .line 629
    .line 630
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 631
    .line 632
    .line 633
    const/high16 v17, 0x40800000    # 4.0f

    .line 634
    .line 635
    const/high16 v18, 0x41880000    # 17.0f

    .line 636
    .line 637
    const/high16 v13, 0x40c00000    # 6.0f

    .line 638
    .line 639
    const v14, 0x4180cccd    # 16.1f

    .line 640
    .line 641
    .line 642
    const v15, 0x40a33333    # 5.1f

    .line 643
    .line 644
    .line 645
    const/high16 v16, 0x41880000    # 17.0f

    .line 646
    .line 647
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 648
    .line 649
    .line 650
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 651
    .line 652
    .line 653
    const/high16 v0, 0x41880000    # 17.0f

    .line 654
    .line 655
    const/high16 v2, 0x41a00000    # 20.0f

    .line 656
    .line 657
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 658
    .line 659
    .line 660
    const/high16 v17, -0x40000000    # -2.0f

    .line 661
    .line 662
    const/high16 v18, -0x40000000    # -2.0f

    .line 663
    .line 664
    const v13, -0x40733333    # -1.1f

    .line 665
    .line 666
    .line 667
    const/4 v14, 0x0

    .line 668
    const/high16 v15, -0x40000000    # -2.0f

    .line 669
    .line 670
    const v16, -0x4099999a    # -0.9f

    .line 671
    .line 672
    .line 673
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 674
    .line 675
    .line 676
    const/high16 v17, 0x40000000    # 2.0f

    .line 677
    .line 678
    const/4 v13, 0x0

    .line 679
    const v14, -0x40733333    # -1.1f

    .line 680
    .line 681
    .line 682
    const v15, 0x3f666666    # 0.9f

    .line 683
    .line 684
    .line 685
    const/high16 v16, -0x40000000    # -2.0f

    .line 686
    .line 687
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 688
    .line 689
    .line 690
    const v0, 0x3f666666    # 0.9f

    .line 691
    .line 692
    .line 693
    const/high16 v2, 0x40000000    # 2.0f

    .line 694
    .line 695
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 696
    .line 697
    .line 698
    const/high16 v17, 0x41a00000    # 20.0f

    .line 699
    .line 700
    const/high16 v18, 0x41880000    # 17.0f

    .line 701
    .line 702
    const/high16 v13, 0x41b00000    # 22.0f

    .line 703
    .line 704
    const v14, 0x4180cccd    # 16.1f

    .line 705
    .line 706
    .line 707
    const v15, 0x41a8cccd    # 21.1f

    .line 708
    .line 709
    .line 710
    const/high16 v16, 0x41880000    # 17.0f

    .line 711
    .line 712
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 713
    .line 714
    .line 715
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 716
    .line 717
    .line 718
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 719
    .line 720
    .line 721
    move-result-object v2

    .line 722
    const/16 v16, 0x3800

    .line 723
    .line 724
    const/16 v17, 0x0

    .line 725
    .line 726
    const/high16 v6, 0x3f800000    # 1.0f

    .line 727
    .line 728
    const/high16 v8, 0x3f800000    # 1.0f

    .line 729
    .line 730
    const/4 v7, 0x0

    .line 731
    const/high16 v9, 0x3f800000    # 1.0f

    .line 732
    .line 733
    const/high16 v12, 0x3f800000    # 1.0f

    .line 734
    .line 735
    const/4 v13, 0x0

    .line 736
    const/4 v14, 0x0

    .line 737
    const/4 v15, 0x0

    .line 738
    const-string v4, ""

    .line 739
    .line 740
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 741
    .line 742
    .line 743
    move-result-object v0

    .line 744
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 745
    .line 746
    .line 747
    move-result-object v0

    .line 748
    sput-object v0, Landroidx/compose/material/icons/rounded/TwoWheelerKt;->_twoWheeler:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 749
    .line 750
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 751
    .line 752
    .line 753
    return-object v0
.end method
