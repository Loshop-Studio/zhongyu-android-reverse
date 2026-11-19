.class public final Landroidx/compose/material/icons/outlined/ShareKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_share",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "Share",
        "Landroidx/compose/material/icons/Icons$Outlined;",
        "getShare",
        "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;",
        "material-icons-core_release"
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
        "SMAP\nShare.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Share.kt\nandroidx/compose/material/icons/outlined/ShareKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,77:1\n212#2,12:78\n233#2,18:91\n253#2:128\n174#3:90\n705#4,2:109\n717#4,2:111\n719#4,11:117\n72#5,4:113\n*S KotlinDebug\n*F\n+ 1 Share.kt\nandroidx/compose/material/icons/outlined/ShareKt\n*L\n29#1:78,12\n30#1:91,18\n30#1:128\n29#1:90\n30#1:109,2\n30#1:111,2\n30#1:117,11\n30#1:113,4\n*E\n"
    }
.end annotation


# static fields
.field private static _share:Landroidx/compose/ui/graphics/vector/ImageVector;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field


# direct methods
.method public static final getShare(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19
    .param p0    # Landroidx/compose/material/icons/Icons$Outlined;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    sget-object v0, Landroidx/compose/material/icons/outlined/ShareKt;->_share:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-static {v0}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

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
    const-string v2, "Outlined.Share"

    .line 33
    .line 34
    invoke-direct/range {v1 .. v12}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;-><init>(Ljava/lang/String;FFFFJIZILkotlin/jvm/internal/e;)V

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
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/e;)V

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
    const v0, 0x4180a3d7    # 16.08f

    .line 66
    .line 67
    .line 68
    const/high16 v2, 0x41900000    # 18.0f

    .line 69
    .line 70
    invoke-static {v2, v0}, Lg/a;->a(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 71
    .line 72
    .line 73
    move-result-object v12

    .line 74
    const v17, -0x40051eb8    # -1.96f

    .line 75
    .line 76
    .line 77
    const v18, 0x3f451eb8    # 0.77f

    .line 78
    .line 79
    .line 80
    const v13, -0x40bd70a4    # -0.76f

    .line 81
    .line 82
    .line 83
    const/4 v14, 0x0

    .line 84
    const v15, -0x4047ae14    # -1.44f

    .line 85
    .line 86
    .line 87
    const v16, 0x3e99999a    # 0.3f

    .line 88
    .line 89
    .line 90
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 91
    .line 92
    .line 93
    const v0, 0x410e8f5c    # 8.91f

    .line 94
    .line 95
    .line 96
    const v2, 0x414b3333    # 12.7f

    .line 97
    .line 98
    .line 99
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 100
    .line 101
    .line 102
    const v17, 0x3db851ec    # 0.09f

    .line 103
    .line 104
    .line 105
    const v18, -0x40cccccd    # -0.7f

    .line 106
    .line 107
    .line 108
    const v13, 0x3d4ccccd    # 0.05f

    .line 109
    .line 110
    .line 111
    const v14, -0x41947ae1    # -0.23f

    .line 112
    .line 113
    .line 114
    const v15, 0x3db851ec    # 0.09f

    .line 115
    .line 116
    .line 117
    const v16, -0x41147ae1    # -0.46f

    .line 118
    .line 119
    .line 120
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 121
    .line 122
    .line 123
    const v0, -0x4247ae14    # -0.09f

    .line 124
    .line 125
    .line 126
    const v2, -0x40cccccd    # -0.7f

    .line 127
    .line 128
    .line 129
    const v4, -0x42dc28f6    # -0.04f

    .line 130
    .line 131
    .line 132
    const v6, -0x410f5c29    # -0.47f

    .line 133
    .line 134
    .line 135
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 136
    .line 137
    .line 138
    const v0, 0x40e1999a    # 7.05f

    .line 139
    .line 140
    .line 141
    const v2, -0x3f7c7ae1    # -4.11f

    .line 142
    .line 143
    .line 144
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 145
    .line 146
    .line 147
    const v17, 0x40028f5c    # 2.04f

    .line 148
    .line 149
    .line 150
    const v18, 0x3f4f5c29    # 0.81f

    .line 151
    .line 152
    .line 153
    const v13, 0x3f0a3d71    # 0.54f

    .line 154
    .line 155
    .line 156
    const/high16 v14, 0x3f000000    # 0.5f

    .line 157
    .line 158
    const/high16 v15, 0x3fa00000    # 1.25f

    .line 159
    .line 160
    const v16, 0x3f4f5c29    # 0.81f

    .line 161
    .line 162
    .line 163
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 164
    .line 165
    .line 166
    const/high16 v17, 0x40400000    # 3.0f

    .line 167
    .line 168
    const/high16 v18, -0x3fc00000    # -3.0f

    .line 169
    .line 170
    const v13, 0x3fd47ae1    # 1.66f

    .line 171
    .line 172
    .line 173
    const/4 v14, 0x0

    .line 174
    const/high16 v15, 0x40400000    # 3.0f

    .line 175
    .line 176
    const v16, -0x40547ae1    # -1.34f

    .line 177
    .line 178
    .line 179
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 180
    .line 181
    .line 182
    const v0, -0x40547ae1    # -1.34f

    .line 183
    .line 184
    .line 185
    const/high16 v2, -0x3fc00000    # -3.0f

    .line 186
    .line 187
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 188
    .line 189
    .line 190
    const v0, 0x3fab851f    # 1.34f

    .line 191
    .line 192
    .line 193
    const/high16 v2, 0x40400000    # 3.0f

    .line 194
    .line 195
    const/high16 v4, -0x3fc00000    # -3.0f

    .line 196
    .line 197
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 198
    .line 199
    .line 200
    const v17, 0x3db851ec    # 0.09f

    .line 201
    .line 202
    .line 203
    const v18, 0x3f333333    # 0.7f

    .line 204
    .line 205
    .line 206
    const/4 v13, 0x0

    .line 207
    const v14, 0x3e75c28f    # 0.24f

    .line 208
    .line 209
    .line 210
    const v15, 0x3d23d70a    # 0.04f

    .line 211
    .line 212
    .line 213
    const v16, 0x3ef0a3d7    # 0.47f

    .line 214
    .line 215
    .line 216
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 217
    .line 218
    .line 219
    const v0, 0x4100a3d7    # 8.04f

    .line 220
    .line 221
    .line 222
    const v2, 0x411cf5c3    # 9.81f

    .line 223
    .line 224
    .line 225
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 226
    .line 227
    .line 228
    const/high16 v17, 0x40c00000    # 6.0f

    .line 229
    .line 230
    const/high16 v18, 0x41100000    # 9.0f

    .line 231
    .line 232
    const/high16 v13, 0x40f00000    # 7.5f

    .line 233
    .line 234
    const v14, 0x4114f5c3    # 9.31f

    .line 235
    .line 236
    .line 237
    const v15, 0x40d947ae    # 6.79f

    .line 238
    .line 239
    .line 240
    const/high16 v16, 0x41100000    # 9.0f

    .line 241
    .line 242
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 243
    .line 244
    .line 245
    const/high16 v17, -0x3fc00000    # -3.0f

    .line 246
    .line 247
    const/high16 v18, 0x40400000    # 3.0f

    .line 248
    .line 249
    const v13, -0x402b851f    # -1.66f

    .line 250
    .line 251
    .line 252
    const/4 v14, 0x0

    .line 253
    const/high16 v15, -0x3fc00000    # -3.0f

    .line 254
    .line 255
    const v16, 0x3fab851f    # 1.34f

    .line 256
    .line 257
    .line 258
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 259
    .line 260
    .line 261
    const v0, 0x3fab851f    # 1.34f

    .line 262
    .line 263
    .line 264
    const/high16 v2, 0x40400000    # 3.0f

    .line 265
    .line 266
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 267
    .line 268
    .line 269
    const v17, 0x40028f5c    # 2.04f

    .line 270
    .line 271
    .line 272
    const v18, -0x40b0a3d7    # -0.81f

    .line 273
    .line 274
    .line 275
    const v13, 0x3f4a3d71    # 0.79f

    .line 276
    .line 277
    .line 278
    const/high16 v15, 0x3fc00000    # 1.5f

    .line 279
    .line 280
    const v16, -0x416147ae    # -0.31f

    .line 281
    .line 282
    .line 283
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 284
    .line 285
    .line 286
    const v0, 0x40e3d70a    # 7.12f

    .line 287
    .line 288
    .line 289
    const v2, 0x40851eb8    # 4.16f

    .line 290
    .line 291
    .line 292
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 293
    .line 294
    .line 295
    const v17, -0x425c28f6    # -0.08f

    .line 296
    .line 297
    .line 298
    const v18, 0x3f266666    # 0.65f

    .line 299
    .line 300
    .line 301
    const v13, -0x42b33333    # -0.05f

    .line 302
    .line 303
    .line 304
    const v14, 0x3e570a3d    # 0.21f

    .line 305
    .line 306
    .line 307
    const v15, -0x425c28f6    # -0.08f

    .line 308
    .line 309
    .line 310
    const v16, 0x3edc28f6    # 0.43f

    .line 311
    .line 312
    .line 313
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 314
    .line 315
    .line 316
    const v17, 0x403ae148    # 2.92f

    .line 317
    .line 318
    .line 319
    const v18, 0x403ae148    # 2.92f

    .line 320
    .line 321
    .line 322
    const/4 v13, 0x0

    .line 323
    const v14, 0x3fce147b    # 1.61f

    .line 324
    .line 325
    .line 326
    const v15, 0x3fa7ae14    # 1.31f

    .line 327
    .line 328
    .line 329
    const v16, 0x403ae148    # 2.92f

    .line 330
    .line 331
    .line 332
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 333
    .line 334
    .line 335
    const v0, -0x405851ec    # -1.31f

    .line 336
    .line 337
    .line 338
    const v2, -0x3fc51eb8    # -2.92f

    .line 339
    .line 340
    .line 341
    const v4, 0x403ae148    # 2.92f

    .line 342
    .line 343
    .line 344
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 345
    .line 346
    .line 347
    const v17, -0x3fc51eb8    # -2.92f

    .line 348
    .line 349
    .line 350
    const v18, -0x3fc51eb8    # -2.92f

    .line 351
    .line 352
    .line 353
    const v14, -0x4031eb85    # -1.61f

    .line 354
    .line 355
    .line 356
    const v15, -0x405851ec    # -1.31f

    .line 357
    .line 358
    .line 359
    const v16, -0x3fc51eb8    # -2.92f

    .line 360
    .line 361
    .line 362
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 363
    .line 364
    .line 365
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 366
    .line 367
    .line 368
    const/high16 v0, 0x40800000    # 4.0f

    .line 369
    .line 370
    const/high16 v2, 0x41900000    # 18.0f

    .line 371
    .line 372
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 373
    .line 374
    .line 375
    const/high16 v17, 0x3f800000    # 1.0f

    .line 376
    .line 377
    const/high16 v18, 0x3f800000    # 1.0f

    .line 378
    .line 379
    const v13, 0x3f0ccccd    # 0.55f

    .line 380
    .line 381
    .line 382
    const/4 v14, 0x0

    .line 383
    const/high16 v15, 0x3f800000    # 1.0f

    .line 384
    .line 385
    const v16, 0x3ee66666    # 0.45f

    .line 386
    .line 387
    .line 388
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 389
    .line 390
    .line 391
    const v0, -0x4119999a    # -0.45f

    .line 392
    .line 393
    .line 394
    const/high16 v2, -0x40800000    # -1.0f

    .line 395
    .line 396
    const/high16 v4, 0x3f800000    # 1.0f

    .line 397
    .line 398
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 399
    .line 400
    .line 401
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 402
    .line 403
    .line 404
    const v0, 0x3ee66666    # 0.45f

    .line 405
    .line 406
    .line 407
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 408
    .line 409
    .line 410
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 411
    .line 412
    .line 413
    const/high16 v0, 0x40c00000    # 6.0f

    .line 414
    .line 415
    const/high16 v2, 0x41500000    # 13.0f

    .line 416
    .line 417
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 418
    .line 419
    .line 420
    const/high16 v17, -0x40800000    # -1.0f

    .line 421
    .line 422
    const/high16 v18, -0x40800000    # -1.0f

    .line 423
    .line 424
    const v13, -0x40f33333    # -0.55f

    .line 425
    .line 426
    .line 427
    const/high16 v15, -0x40800000    # -1.0f

    .line 428
    .line 429
    const v16, -0x4119999a    # -0.45f

    .line 430
    .line 431
    .line 432
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 433
    .line 434
    .line 435
    const v0, 0x3ee66666    # 0.45f

    .line 436
    .line 437
    .line 438
    const/high16 v2, -0x40800000    # -1.0f

    .line 439
    .line 440
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 441
    .line 442
    .line 443
    const/high16 v2, 0x3f800000    # 1.0f

    .line 444
    .line 445
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 446
    .line 447
    .line 448
    const v0, -0x4119999a    # -0.45f

    .line 449
    .line 450
    .line 451
    const/high16 v2, -0x40800000    # -1.0f

    .line 452
    .line 453
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 454
    .line 455
    .line 456
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 457
    .line 458
    .line 459
    const v0, 0x41a028f6    # 20.02f

    .line 460
    .line 461
    .line 462
    const/high16 v2, 0x41900000    # 18.0f

    .line 463
    .line 464
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 465
    .line 466
    .line 467
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 468
    .line 469
    .line 470
    const v0, 0x3ee66666    # 0.45f

    .line 471
    .line 472
    .line 473
    const/high16 v2, -0x40800000    # -1.0f

    .line 474
    .line 475
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 476
    .line 477
    .line 478
    const/high16 v2, 0x3f800000    # 1.0f

    .line 479
    .line 480
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 481
    .line 482
    .line 483
    const v0, -0x4119999a    # -0.45f

    .line 484
    .line 485
    .line 486
    const/high16 v2, -0x40800000    # -1.0f

    .line 487
    .line 488
    invoke-static {v12, v0, v4, v2, v4}, Lg/a;->h(Landroidx/compose/ui/graphics/vector/PathBuilder;FFFF)Ljava/util/List;

    .line 489
    .line 490
    .line 491
    move-result-object v2

    .line 492
    const/16 v16, 0x3800

    .line 493
    .line 494
    const/16 v17, 0x0

    .line 495
    .line 496
    const/high16 v6, 0x3f800000    # 1.0f

    .line 497
    .line 498
    const/high16 v8, 0x3f800000    # 1.0f

    .line 499
    .line 500
    const/4 v7, 0x0

    .line 501
    const/high16 v9, 0x3f800000    # 1.0f

    .line 502
    .line 503
    const/high16 v12, 0x3f800000    # 1.0f

    .line 504
    .line 505
    const/4 v13, 0x0

    .line 506
    const/4 v15, 0x0

    .line 507
    const-string v4, ""

    .line 508
    .line 509
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 510
    .line 511
    .line 512
    move-result-object v0

    .line 513
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 514
    .line 515
    .line 516
    move-result-object v0

    .line 517
    sput-object v0, Landroidx/compose/material/icons/outlined/ShareKt;->_share:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 518
    .line 519
    invoke-static {v0}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 520
    .line 521
    .line 522
    return-object v0
.end method
