.class public final Landroidx/compose/material/icons/sharp/SurfingKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_surfing",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "Surfing",
        "Landroidx/compose/material/icons/Icons$Sharp;",
        "getSurfing",
        "(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;",
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
        "SMAP\nSurfing.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Surfing.kt\nandroidx/compose/material/icons/sharp/SurfingKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,91:1\n212#2,12:92\n233#2,18:105\n253#2:142\n174#3:104\n705#4,2:123\n717#4,2:125\n719#4,11:131\n72#5,4:127\n*S KotlinDebug\n*F\n+ 1 Surfing.kt\nandroidx/compose/material/icons/sharp/SurfingKt\n*L\n29#1:92,12\n30#1:105,18\n30#1:142\n29#1:104\n30#1:123,2\n30#1:125,2\n30#1:131,11\n30#1:127,4\n*E\n"
    }
.end annotation


# static fields
.field private static _surfing:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getSurfing(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/sharp/SurfingKt;->_surfing:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Sharp.Surfing"

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
    const/high16 v0, 0x41b80000    # 23.0f

    .line 71
    .line 72
    const/high16 v2, 0x41a80000    # 21.0f

    .line 73
    .line 74
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v17, -0x3fc00000    # -3.0f

    .line 78
    .line 79
    const/high16 v18, -0x40c00000    # -0.75f

    .line 80
    .line 81
    const v13, -0x407c28f6    # -1.03f

    .line 82
    .line 83
    .line 84
    const/4 v14, 0x0

    .line 85
    const v15, -0x3ffc28f6    # -2.06f

    .line 86
    .line 87
    .line 88
    const/high16 v16, -0x41800000    # -0.25f

    .line 89
    .line 90
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 91
    .line 92
    .line 93
    const/4 v0, 0x0

    .line 94
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 95
    .line 96
    .line 97
    const/high16 v17, -0x3f400000    # -6.0f

    .line 98
    .line 99
    const/16 v18, 0x0

    .line 100
    .line 101
    const v13, -0x400e147b    # -1.89f

    .line 102
    .line 103
    .line 104
    const/high16 v14, 0x3f800000    # 1.0f

    .line 105
    .line 106
    const v15, -0x3f7c7ae1    # -4.11f

    .line 107
    .line 108
    .line 109
    const/high16 v16, 0x3f800000    # 1.0f

    .line 110
    .line 111
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 112
    .line 113
    .line 114
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 115
    .line 116
    .line 117
    const/high16 v17, 0x40400000    # 3.0f

    .line 118
    .line 119
    const/high16 v18, 0x41b80000    # 23.0f

    .line 120
    .line 121
    const v13, 0x40a1999a    # 5.05f

    .line 122
    .line 123
    .line 124
    const/high16 v14, 0x41b60000    # 22.75f

    .line 125
    .line 126
    const v15, 0x4080f5c3    # 4.03f

    .line 127
    .line 128
    .line 129
    const/high16 v16, 0x41b80000    # 23.0f

    .line 130
    .line 131
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 132
    .line 133
    .line 134
    const/high16 v0, 0x40000000    # 2.0f

    .line 135
    .line 136
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 137
    .line 138
    .line 139
    const/4 v0, 0x0

    .line 140
    const/high16 v2, -0x40000000    # -2.0f

    .line 141
    .line 142
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 143
    .line 144
    .line 145
    const/high16 v0, 0x3f800000    # 1.0f

    .line 146
    .line 147
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 148
    .line 149
    .line 150
    const/high16 v18, -0x40800000    # -1.0f

    .line 151
    .line 152
    const v13, 0x3f851eb8    # 1.04f

    .line 153
    .line 154
    .line 155
    const/4 v14, 0x0

    .line 156
    const v15, 0x40051eb8    # 2.08f

    .line 157
    .line 158
    .line 159
    const v16, -0x414ccccd    # -0.35f

    .line 160
    .line 161
    .line 162
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 163
    .line 164
    .line 165
    const/high16 v17, 0x40c00000    # 6.0f

    .line 166
    .line 167
    const/16 v18, 0x0

    .line 168
    .line 169
    const v13, 0x3fea3d71    # 1.83f

    .line 170
    .line 171
    .line 172
    const v14, 0x3fa66666    # 1.3f

    .line 173
    .line 174
    .line 175
    const v15, 0x408570a4    # 4.17f

    .line 176
    .line 177
    .line 178
    const v16, 0x3fa66666    # 1.3f

    .line 179
    .line 180
    .line 181
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 182
    .line 183
    .line 184
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 185
    .line 186
    .line 187
    const/high16 v17, 0x40400000    # 3.0f

    .line 188
    .line 189
    const/high16 v18, 0x3f800000    # 1.0f

    .line 190
    .line 191
    const v13, 0x3f68f5c3    # 0.91f

    .line 192
    .line 193
    .line 194
    const v14, 0x3f266666    # 0.65f

    .line 195
    .line 196
    .line 197
    const v15, 0x3ffae148    # 1.96f

    .line 198
    .line 199
    .line 200
    const/high16 v16, 0x3f800000    # 1.0f

    .line 201
    .line 202
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 203
    .line 204
    .line 205
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 206
    .line 207
    .line 208
    const/high16 v0, 0x40000000    # 2.0f

    .line 209
    .line 210
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 211
    .line 212
    .line 213
    const/high16 v0, 0x41a80000    # 21.0f

    .line 214
    .line 215
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 216
    .line 217
    .line 218
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 219
    .line 220
    .line 221
    const/high16 v0, 0x41880000    # 17.0f

    .line 222
    .line 223
    const/high16 v2, 0x3fc00000    # 1.5f

    .line 224
    .line 225
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 226
    .line 227
    .line 228
    const/high16 v17, -0x40000000    # -2.0f

    .line 229
    .line 230
    const/high16 v18, 0x40000000    # 2.0f

    .line 231
    .line 232
    const v13, -0x40733333    # -1.1f

    .line 233
    .line 234
    .line 235
    const/4 v14, 0x0

    .line 236
    const/high16 v15, -0x40000000    # -2.0f

    .line 237
    .line 238
    const v16, 0x3f666666    # 0.9f

    .line 239
    .line 240
    .line 241
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 242
    .line 243
    .line 244
    const v0, 0x3f666666    # 0.9f

    .line 245
    .line 246
    .line 247
    const/high16 v2, 0x40000000    # 2.0f

    .line 248
    .line 249
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 250
    .line 251
    .line 252
    const v0, -0x4099999a    # -0.9f

    .line 253
    .line 254
    .line 255
    const/high16 v2, -0x40000000    # -2.0f

    .line 256
    .line 257
    const/high16 v4, 0x40000000    # 2.0f

    .line 258
    .line 259
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 260
    .line 261
    .line 262
    const v0, 0x4190cccd    # 18.1f

    .line 263
    .line 264
    .line 265
    const/high16 v2, 0x41880000    # 17.0f

    .line 266
    .line 267
    const/high16 v4, 0x3fc00000    # 1.5f

    .line 268
    .line 269
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 270
    .line 271
    .line 272
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 273
    .line 274
    .line 275
    const v0, 0x4166e148    # 14.43f

    .line 276
    .line 277
    .line 278
    const v2, 0x4107ae14    # 8.48f

    .line 279
    .line 280
    .line 281
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 282
    .line 283
    .line 284
    const v0, 0x4142e148    # 12.18f

    .line 285
    .line 286
    .line 287
    const/high16 v2, 0x41200000    # 10.0f

    .line 288
    .line 289
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 290
    .line 291
    .line 292
    const/high16 v0, 0x41800000    # 16.0f

    .line 293
    .line 294
    const/high16 v2, 0x41500000    # 13.0f

    .line 295
    .line 296
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 297
    .line 298
    .line 299
    const v0, 0x4075c28f    # 3.84f

    .line 300
    .line 301
    .line 302
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 303
    .line 304
    .line 305
    const v17, 0x3fbeb852    # 1.49f

    .line 306
    .line 307
    .line 308
    const v18, 0x3f95c28f    # 1.17f

    .line 309
    .line 310
    .line 311
    const v13, 0x3f07ae14    # 0.53f

    .line 312
    .line 313
    .line 314
    const v14, 0x3ec28f5c    # 0.38f

    .line 315
    .line 316
    .line 317
    const v15, 0x3f83d70a    # 1.03f

    .line 318
    .line 319
    .line 320
    const v16, 0x3f47ae14    # 0.78f

    .line 321
    .line 322
    .line 323
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 324
    .line 325
    .line 326
    const/high16 v17, 0x41700000    # 15.0f

    .line 327
    .line 328
    const/high16 v18, 0x41980000    # 19.0f

    .line 329
    .line 330
    const v13, 0x41867ae1    # 16.81f

    .line 331
    .line 332
    .line 333
    const v14, 0x4194b852    # 18.59f

    .line 334
    .line 335
    .line 336
    const v15, 0x417f0a3d    # 15.94f

    .line 337
    .line 338
    .line 339
    const/high16 v16, 0x41980000    # 19.0f

    .line 340
    .line 341
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 342
    .line 343
    .line 344
    const/high16 v17, -0x3fc00000    # -3.0f

    .line 345
    .line 346
    const/high16 v18, -0x40400000    # -1.5f

    .line 347
    .line 348
    const v13, -0x40666666    # -1.2f

    .line 349
    .line 350
    .line 351
    const/4 v14, 0x0

    .line 352
    const v15, -0x3feeb852    # -2.27f

    .line 353
    .line 354
    .line 355
    const v16, -0x40d70a3d    # -0.66f

    .line 356
    .line 357
    .line 358
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 359
    .line 360
    .line 361
    const/high16 v18, 0x3fc00000    # 1.5f

    .line 362
    .line 363
    const v13, -0x40c51eb8    # -0.73f

    .line 364
    .line 365
    .line 366
    const v14, 0x3f570a3d    # 0.84f

    .line 367
    .line 368
    .line 369
    const v15, -0x4019999a    # -1.8f

    .line 370
    .line 371
    .line 372
    const/high16 v16, 0x3fc00000    # 1.5f

    .line 373
    .line 374
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 375
    .line 376
    .line 377
    const v17, -0x408a3d71    # -0.96f

    .line 378
    .line 379
    .line 380
    const v18, -0x41f0a3d7    # -0.14f

    .line 381
    .line 382
    .line 383
    const v13, -0x41570a3d    # -0.33f

    .line 384
    .line 385
    .line 386
    const/4 v14, 0x0

    .line 387
    const v15, -0x40d9999a    # -0.65f

    .line 388
    .line 389
    .line 390
    const v16, -0x42b33333    # -0.05f

    .line 391
    .line 392
    .line 393
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 394
    .line 395
    .line 396
    const/high16 v17, 0x40400000    # 3.0f

    .line 397
    .line 398
    const v18, 0x41547ae1    # 13.28f

    .line 399
    .line 400
    .line 401
    const v13, 0x40a6147b    # 5.19f

    .line 402
    .line 403
    .line 404
    const v14, 0x41873333    # 16.9f

    .line 405
    .line 406
    .line 407
    const/high16 v15, 0x40400000    # 3.0f

    .line 408
    .line 409
    const v16, 0x416b851f    # 14.72f

    .line 410
    .line 411
    .line 412
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 413
    .line 414
    .line 415
    const v17, 0x409b3333    # 4.85f

    .line 416
    .line 417
    .line 418
    const/high16 v18, 0x41400000    # 12.0f

    .line 419
    .line 420
    const/high16 v13, 0x40400000    # 3.0f

    .line 421
    .line 422
    const/high16 v14, 0x41440000    # 12.25f

    .line 423
    .line 424
    const v15, 0x408051ec    # 4.01f

    .line 425
    .line 426
    .line 427
    const/high16 v16, 0x41400000    # 12.0f

    .line 428
    .line 429
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 430
    .line 431
    .line 432
    const v17, 0x406ccccd    # 3.7f

    .line 433
    .line 434
    .line 435
    const v18, 0x3f547ae1    # 0.83f

    .line 436
    .line 437
    .line 438
    const v13, 0x3f7ae148    # 0.98f

    .line 439
    .line 440
    .line 441
    const/4 v14, 0x0

    .line 442
    const v15, 0x4011eb85    # 2.28f

    .line 443
    .line 444
    .line 445
    const v16, 0x3e9eb852    # 0.31f

    .line 446
    .line 447
    .line 448
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 449
    .line 450
    .line 451
    const v0, 0x40fa8f5c    # 7.83f

    .line 452
    .line 453
    .line 454
    const v2, 0x410970a4    # 8.59f

    .line 455
    .line 456
    .line 457
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 458
    .line 459
    .line 460
    const v0, 0x4047ae14    # 3.12f

    .line 461
    .line 462
    .line 463
    const v2, -0x3ff9999a    # -2.1f

    .line 464
    .line 465
    .line 466
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 467
    .line 468
    .line 469
    const v0, -0x41428f5c    # -0.37f

    .line 470
    .line 471
    .line 472
    const/high16 v2, -0x40000000    # -2.0f

    .line 473
    .line 474
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 475
    .line 476
    .line 477
    const v0, 0x40c428f6    # 6.13f

    .line 478
    .line 479
    .line 480
    const v2, 0x4100cccd    # 8.05f

    .line 481
    .line 482
    .line 483
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 484
    .line 485
    .line 486
    const/high16 v0, 0x40a00000    # 5.0f

    .line 487
    .line 488
    const v2, 0x40cccccd    # 6.4f

    .line 489
    .line 490
    .line 491
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 492
    .line 493
    .line 494
    const/high16 v0, 0x41080000    # 8.5f

    .line 495
    .line 496
    const/high16 v2, 0x40800000    # 4.0f

    .line 497
    .line 498
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 499
    .line 500
    .line 501
    const v0, 0x40b1999a    # 5.55f

    .line 502
    .line 503
    .line 504
    const v2, 0x3f83d70a    # 1.03f

    .line 505
    .line 506
    .line 507
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 508
    .line 509
    .line 510
    const v17, 0x3f9c28f6    # 1.22f

    .line 511
    .line 512
    .line 513
    const v18, 0x3f63d70a    # 0.89f

    .line 514
    .line 515
    .line 516
    const v13, 0x3ee66666    # 0.45f

    .line 517
    .line 518
    .line 519
    const v14, 0x3db851ec    # 0.09f

    .line 520
    .line 521
    .line 522
    const v15, 0x3f6e147b    # 0.93f

    .line 523
    .line 524
    .line 525
    const v16, 0x3ebd70a4    # 0.37f

    .line 526
    .line 527
    .line 528
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 529
    .line 530
    .line 531
    const v0, 0x3f6147ae    # 0.88f

    .line 532
    .line 533
    .line 534
    const v2, 0x3fc66666    # 1.55f

    .line 535
    .line 536
    .line 537
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 538
    .line 539
    .line 540
    const/high16 v17, 0x41a40000    # 20.5f

    .line 541
    .line 542
    const/high16 v18, 0x41200000    # 10.0f

    .line 543
    .line 544
    const v13, 0x4188147b    # 17.01f

    .line 545
    .line 546
    .line 547
    const v14, 0x410fae14    # 8.98f

    .line 548
    .line 549
    .line 550
    const v15, 0x41951eb8    # 18.64f

    .line 551
    .line 552
    .line 553
    const/high16 v16, 0x41200000    # 10.0f

    .line 554
    .line 555
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 556
    .line 557
    .line 558
    const/high16 v0, 0x40000000    # 2.0f

    .line 559
    .line 560
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 561
    .line 562
    .line 563
    const v17, 0x4166e148    # 14.43f

    .line 564
    .line 565
    .line 566
    const v18, 0x4107ae14    # 8.48f

    .line 567
    .line 568
    .line 569
    const v13, 0x418f47ae    # 17.91f

    .line 570
    .line 571
    .line 572
    const/high16 v14, 0x41400000    # 12.0f

    .line 573
    .line 574
    const v15, 0x417a3d71    # 15.64f

    .line 575
    .line 576
    .line 577
    const v16, 0x412947ae    # 10.58f

    .line 578
    .line 579
    .line 580
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 581
    .line 582
    .line 583
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 584
    .line 585
    .line 586
    const v0, 0x4131999a    # 11.1f

    .line 587
    .line 588
    .line 589
    const v2, 0x4124cccd    # 10.3f

    .line 590
    .line 591
    .line 592
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 593
    .line 594
    .line 595
    const v0, 0x3ee147ae    # 0.44f

    .line 596
    .line 597
    .line 598
    const v2, 0x4029999a    # 2.65f

    .line 599
    .line 600
    .line 601
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 602
    .line 603
    .line 604
    const v17, 0x4050a3d7    # 3.26f

    .line 605
    .line 606
    .line 607
    const/high16 v18, 0x3fe00000    # 1.75f

    .line 608
    .line 609
    const v13, 0x3f6b851f    # 0.92f

    .line 610
    .line 611
    .line 612
    const v14, 0x3ed70a3d    # 0.42f

    .line 613
    .line 614
    .line 615
    const v15, 0x401eb852    # 2.48f

    .line 616
    .line 617
    .line 618
    const v16, 0x3fa28f5c    # 1.27f

    .line 619
    .line 620
    .line 621
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 622
    .line 623
    .line 624
    const/high16 v0, 0x41600000    # 14.0f

    .line 625
    .line 626
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 627
    .line 628
    .line 629
    const v0, 0x4131999a    # 11.1f

    .line 630
    .line 631
    .line 632
    const v2, 0x4124cccd    # 10.3f

    .line 633
    .line 634
    .line 635
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 636
    .line 637
    .line 638
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 639
    .line 640
    .line 641
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 642
    .line 643
    .line 644
    move-result-object v2

    .line 645
    const/16 v16, 0x3800

    .line 646
    .line 647
    const/16 v17, 0x0

    .line 648
    .line 649
    const/high16 v6, 0x3f800000    # 1.0f

    .line 650
    .line 651
    const/high16 v8, 0x3f800000    # 1.0f

    .line 652
    .line 653
    const/4 v7, 0x0

    .line 654
    const/high16 v9, 0x3f800000    # 1.0f

    .line 655
    .line 656
    const/high16 v12, 0x3f800000    # 1.0f

    .line 657
    .line 658
    const/4 v13, 0x0

    .line 659
    const/4 v14, 0x0

    .line 660
    const/4 v15, 0x0

    .line 661
    const-string v4, ""

    .line 662
    .line 663
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 664
    .line 665
    .line 666
    move-result-object v0

    .line 667
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 668
    .line 669
    .line 670
    move-result-object v0

    .line 671
    sput-object v0, Landroidx/compose/material/icons/sharp/SurfingKt;->_surfing:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 672
    .line 673
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 674
    .line 675
    .line 676
    return-object v0
.end method
