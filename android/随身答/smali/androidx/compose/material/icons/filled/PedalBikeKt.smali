.class public final Landroidx/compose/material/icons/filled/PedalBikeKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_pedalBike",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "PedalBike",
        "Landroidx/compose/material/icons/Icons$Filled;",
        "getPedalBike",
        "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;",
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
        "SMAP\nPedalBike.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PedalBike.kt\nandroidx/compose/material/icons/filled/PedalBikeKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,88:1\n212#2,12:89\n233#2,18:102\n253#2:139\n174#3:101\n705#4,2:120\n717#4,2:122\n719#4,11:128\n72#5,4:124\n*S KotlinDebug\n*F\n+ 1 PedalBike.kt\nandroidx/compose/material/icons/filled/PedalBikeKt\n*L\n29#1:89,12\n30#1:102,18\n30#1:139\n29#1:101\n30#1:120,2\n30#1:122,2\n30#1:128,11\n30#1:124,4\n*E\n"
    }
.end annotation


# static fields
.field private static _pedalBike:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getPedalBike(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/filled/PedalBikeKt;->_pedalBike:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Filled.PedalBike"

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
    const/high16 v0, 0x41200000    # 10.0f

    .line 71
    .line 72
    const v2, 0x419170a4    # 18.18f

    .line 73
    .line 74
    .line 75
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    const v0, -0x40266666    # -1.7f

    .line 79
    .line 80
    .line 81
    const v2, -0x3f6a3d71    # -4.68f

    .line 82
    .line 83
    .line 84
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 85
    .line 86
    .line 87
    const v17, 0x4169999a    # 14.6f

    .line 88
    .line 89
    .line 90
    const/high16 v18, 0x40800000    # 4.0f

    .line 91
    .line 92
    const v13, 0x4181851f    # 16.19f

    .line 93
    .line 94
    .line 95
    const v14, 0x4090f5c3    # 4.53f

    .line 96
    .line 97
    .line 98
    const v15, 0x41770a3d    # 15.44f

    .line 99
    .line 100
    .line 101
    const/high16 v16, 0x40800000    # 4.0f

    .line 102
    .line 103
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 104
    .line 105
    .line 106
    const/high16 v0, 0x41400000    # 12.0f

    .line 107
    .line 108
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 109
    .line 110
    .line 111
    const/high16 v0, 0x40000000    # 2.0f

    .line 112
    .line 113
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 114
    .line 115
    .line 116
    const v0, 0x40266666    # 2.6f

    .line 117
    .line 118
    .line 119
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 120
    .line 121
    .line 122
    const v0, 0x3fbae148    # 1.46f

    .line 123
    .line 124
    .line 125
    const/high16 v2, 0x40800000    # 4.0f

    .line 126
    .line 127
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 128
    .line 129
    .line 130
    const v0, -0x3f66147b    # -4.81f

    .line 131
    .line 132
    .line 133
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 134
    .line 135
    .line 136
    const v0, -0x4147ae14    # -0.36f

    .line 137
    .line 138
    .line 139
    const/high16 v2, -0x40800000    # -1.0f

    .line 140
    .line 141
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 142
    .line 143
    .line 144
    const/high16 v0, 0x41400000    # 12.0f

    .line 145
    .line 146
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 147
    .line 148
    .line 149
    const/high16 v0, 0x40e00000    # 7.0f

    .line 150
    .line 151
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 152
    .line 153
    .line 154
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 155
    .line 156
    .line 157
    const/high16 v0, 0x40000000    # 2.0f

    .line 158
    .line 159
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 160
    .line 161
    .line 162
    const/high16 v0, 0x3fe00000    # 1.75f

    .line 163
    .line 164
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 165
    .line 166
    .line 167
    const v0, 0x3fe8f5c3    # 1.82f

    .line 168
    .line 169
    .line 170
    const/high16 v2, 0x40a00000    # 5.0f

    .line 171
    .line 172
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 173
    .line 174
    .line 175
    const v0, 0x411e6666    # 9.9f

    .line 176
    .line 177
    .line 178
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 179
    .line 180
    .line 181
    const v17, -0x3f6b3333    # -4.65f

    .line 182
    .line 183
    .line 184
    const v18, -0x3f80a3d7    # -3.99f

    .line 185
    .line 186
    .line 187
    const v13, -0x411eb852    # -0.44f

    .line 188
    .line 189
    .line 190
    const v14, -0x3ff147ae    # -2.23f

    .line 191
    .line 192
    .line 193
    const v15, -0x3fec28f6    # -2.31f

    .line 194
    .line 195
    .line 196
    const v16, -0x3f87ae14    # -3.88f

    .line 197
    .line 198
    .line 199
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 200
    .line 201
    .line 202
    const/16 v17, 0x0

    .line 203
    .line 204
    const/high16 v18, 0x41700000    # 15.0f

    .line 205
    .line 206
    const v13, 0x401ccccd    # 2.45f

    .line 207
    .line 208
    .line 209
    const v14, 0x411deb85    # 9.87f

    .line 210
    .line 211
    .line 212
    const/4 v15, 0x0

    .line 213
    const v16, 0x41433333    # 12.2f

    .line 214
    .line 215
    .line 216
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 217
    .line 218
    .line 219
    const/high16 v17, 0x40a00000    # 5.0f

    .line 220
    .line 221
    const/high16 v18, 0x40a00000    # 5.0f

    .line 222
    .line 223
    const/4 v13, 0x0

    .line 224
    const v14, 0x40333333    # 2.8f

    .line 225
    .line 226
    .line 227
    const v15, 0x400ccccd    # 2.2f

    .line 228
    .line 229
    .line 230
    const/high16 v16, 0x40a00000    # 5.0f

    .line 231
    .line 232
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 233
    .line 234
    .line 235
    const v17, 0x409ccccd    # 4.9f

    .line 236
    .line 237
    .line 238
    const/high16 v18, -0x3f800000    # -4.0f

    .line 239
    .line 240
    const v13, 0x401d70a4    # 2.46f

    .line 241
    .line 242
    .line 243
    const/4 v14, 0x0

    .line 244
    const v15, 0x408e6666    # 4.45f

    .line 245
    .line 246
    .line 247
    const v16, -0x4027ae14    # -1.69f

    .line 248
    .line 249
    .line 250
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 251
    .line 252
    .line 253
    const v0, 0x40866666    # 4.2f

    .line 254
    .line 255
    .line 256
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 257
    .line 258
    .line 259
    const v17, 0x4094cccd    # 4.65f

    .line 260
    .line 261
    .line 262
    const v18, 0x407f5c29    # 3.99f

    .line 263
    .line 264
    .line 265
    const v13, 0x3ee147ae    # 0.44f

    .line 266
    .line 267
    .line 268
    const v14, 0x400eb852    # 2.23f

    .line 269
    .line 270
    .line 271
    const v15, 0x4013d70a    # 2.31f

    .line 272
    .line 273
    .line 274
    const v16, 0x407851ec    # 3.88f

    .line 275
    .line 276
    .line 277
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 278
    .line 279
    .line 280
    const/high16 v17, 0x40a80000    # 5.25f

    .line 281
    .line 282
    const/high16 v18, -0x3f600000    # -5.0f

    .line 283
    .line 284
    const v13, 0x40333333    # 2.8f

    .line 285
    .line 286
    .line 287
    const v14, 0x3e051eb8    # 0.13f

    .line 288
    .line 289
    .line 290
    const/high16 v15, 0x40a80000    # 5.25f

    .line 291
    .line 292
    const v16, -0x3ff3d70a    # -2.19f

    .line 293
    .line 294
    .line 295
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 296
    .line 297
    .line 298
    const/high16 v17, -0x3f600000    # -5.0f

    .line 299
    .line 300
    const/4 v13, 0x0

    .line 301
    const v14, -0x3fcccccd    # -2.8f

    .line 302
    .line 303
    .line 304
    const v15, -0x3ff33333    # -2.2f

    .line 305
    .line 306
    .line 307
    const/high16 v16, -0x3f600000    # -5.0f

    .line 308
    .line 309
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 310
    .line 311
    .line 312
    const v0, 0x419170a4    # 18.18f

    .line 313
    .line 314
    .line 315
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 316
    .line 317
    .line 318
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 319
    .line 320
    .line 321
    const/high16 v0, 0x41800000    # 16.0f

    .line 322
    .line 323
    const v2, 0x40fa3d71    # 7.82f

    .line 324
    .line 325
    .line 326
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 327
    .line 328
    .line 329
    const v17, -0x3fcb851f    # -2.82f

    .line 330
    .line 331
    .line 332
    const/high16 v18, 0x40000000    # 2.0f

    .line 333
    .line 334
    const v13, -0x41333333    # -0.4f

    .line 335
    .line 336
    .line 337
    const v14, 0x3f95c28f    # 1.17f

    .line 338
    .line 339
    .line 340
    const v15, -0x404147ae    # -1.49f

    .line 341
    .line 342
    .line 343
    const/high16 v16, 0x40000000    # 2.0f

    .line 344
    .line 345
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 346
    .line 347
    .line 348
    const/high16 v17, -0x3fc00000    # -3.0f

    .line 349
    .line 350
    const/high16 v18, -0x3fc00000    # -3.0f

    .line 351
    .line 352
    const v13, -0x4028f5c3    # -1.68f

    .line 353
    .line 354
    .line 355
    const/4 v14, 0x0

    .line 356
    const/high16 v15, -0x3fc00000    # -3.0f

    .line 357
    .line 358
    const v16, -0x40570a3d    # -1.32f

    .line 359
    .line 360
    .line 361
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 362
    .line 363
    .line 364
    const v0, 0x3fa8f5c3    # 1.32f

    .line 365
    .line 366
    .line 367
    const/high16 v2, 0x40400000    # 3.0f

    .line 368
    .line 369
    const/high16 v4, -0x3fc00000    # -3.0f

    .line 370
    .line 371
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 372
    .line 373
    .line 374
    const v17, 0x40347ae1    # 2.82f

    .line 375
    .line 376
    .line 377
    const/high16 v18, 0x40000000    # 2.0f

    .line 378
    .line 379
    const v13, 0x3faa3d71    # 1.33f

    .line 380
    .line 381
    .line 382
    const v15, 0x401ae148    # 2.42f

    .line 383
    .line 384
    .line 385
    const v16, 0x3f547ae1    # 0.83f

    .line 386
    .line 387
    .line 388
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 389
    .line 390
    .line 391
    const/high16 v0, 0x40a00000    # 5.0f

    .line 392
    .line 393
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 394
    .line 395
    .line 396
    const/high16 v0, 0x40000000    # 2.0f

    .line 397
    .line 398
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 399
    .line 400
    .line 401
    const v0, 0x40fa3d71    # 7.82f

    .line 402
    .line 403
    .line 404
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 405
    .line 406
    .line 407
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 408
    .line 409
    .line 410
    const v0, 0x4161999a    # 14.1f

    .line 411
    .line 412
    .line 413
    const/high16 v2, 0x41600000    # 14.0f

    .line 414
    .line 415
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 416
    .line 417
    .line 418
    const v0, -0x404ccccd    # -1.4f

    .line 419
    .line 420
    .line 421
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 422
    .line 423
    .line 424
    const v0, -0x40c51eb8    # -0.73f

    .line 425
    .line 426
    .line 427
    const/high16 v2, -0x40000000    # -2.0f

    .line 428
    .line 429
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 430
    .line 431
    .line 432
    const/high16 v0, 0x41700000    # 15.0f

    .line 433
    .line 434
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 435
    .line 436
    .line 437
    const v17, 0x4161999a    # 14.1f

    .line 438
    .line 439
    .line 440
    const/high16 v18, 0x41600000    # 14.0f

    .line 441
    .line 442
    const v13, 0x4168f5c3    # 14.56f

    .line 443
    .line 444
    .line 445
    const v14, 0x414947ae    # 12.58f

    .line 446
    .line 447
    .line 448
    const v15, 0x4163d70a    # 14.24f

    .line 449
    .line 450
    .line 451
    const/high16 v16, 0x41540000    # 13.25f

    .line 452
    .line 453
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 454
    .line 455
    .line 456
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 457
    .line 458
    .line 459
    const/high16 v0, 0x41980000    # 19.0f

    .line 460
    .line 461
    const/high16 v2, 0x41900000    # 18.0f

    .line 462
    .line 463
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 464
    .line 465
    .line 466
    const/high16 v17, -0x3fc00000    # -3.0f

    .line 467
    .line 468
    const/high16 v18, -0x3fc00000    # -3.0f

    .line 469
    .line 470
    const v13, -0x4028f5c3    # -1.68f

    .line 471
    .line 472
    .line 473
    const/4 v14, 0x0

    .line 474
    const/high16 v15, -0x3fc00000    # -3.0f

    .line 475
    .line 476
    const v16, -0x40570a3d    # -1.32f

    .line 477
    .line 478
    .line 479
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 480
    .line 481
    .line 482
    const v17, 0x3f866666    # 1.05f

    .line 483
    .line 484
    .line 485
    const v18, -0x3fee147b    # -2.28f

    .line 486
    .line 487
    .line 488
    const/4 v13, 0x0

    .line 489
    const v14, -0x4091eb85    # -0.93f

    .line 490
    .line 491
    .line 492
    const v15, 0x3ed1eb85    # 0.41f

    .line 493
    .line 494
    .line 495
    const v16, -0x40228f5c    # -1.73f

    .line 496
    .line 497
    .line 498
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 499
    .line 500
    .line 501
    const v0, 0x3f75c28f    # 0.96f

    .line 502
    .line 503
    .line 504
    const v2, 0x4028f5c3    # 2.64f

    .line 505
    .line 506
    .line 507
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 508
    .line 509
    .line 510
    const v0, 0x3ff0a3d7    # 1.88f

    .line 511
    .line 512
    .line 513
    const v2, -0x40d1eb85    # -0.68f

    .line 514
    .line 515
    .line 516
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 517
    .line 518
    .line 519
    const v0, -0x4087ae14    # -0.97f

    .line 520
    .line 521
    .line 522
    const v2, -0x3fd51eb8    # -2.67f

    .line 523
    .line 524
    .line 525
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 526
    .line 527
    .line 528
    const v17, 0x3db851ec    # 0.09f

    .line 529
    .line 530
    .line 531
    const v18, -0x43dc28f6    # -0.01f

    .line 532
    .line 533
    .line 534
    const v13, 0x3cf5c28f    # 0.03f

    .line 535
    .line 536
    .line 537
    const/4 v14, 0x0

    .line 538
    const v15, 0x3d75c28f    # 0.06f

    .line 539
    .line 540
    .line 541
    const v16, -0x43dc28f6    # -0.01f

    .line 542
    .line 543
    .line 544
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 545
    .line 546
    .line 547
    const/high16 v17, 0x40400000    # 3.0f

    .line 548
    .line 549
    const/high16 v18, 0x40400000    # 3.0f

    .line 550
    .line 551
    const v13, 0x3fd70a3d    # 1.68f

    .line 552
    .line 553
    .line 554
    const/high16 v15, 0x40400000    # 3.0f

    .line 555
    .line 556
    const v16, 0x3fa8f5c3    # 1.32f

    .line 557
    .line 558
    .line 559
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 560
    .line 561
    .line 562
    const v0, 0x41a570a4    # 20.68f

    .line 563
    .line 564
    .line 565
    const/high16 v2, 0x41980000    # 19.0f

    .line 566
    .line 567
    const/high16 v4, 0x41900000    # 18.0f

    .line 568
    .line 569
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 570
    .line 571
    .line 572
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 573
    .line 574
    .line 575
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 576
    .line 577
    .line 578
    move-result-object v2

    .line 579
    const/16 v16, 0x3800

    .line 580
    .line 581
    const/16 v17, 0x0

    .line 582
    .line 583
    const/high16 v6, 0x3f800000    # 1.0f

    .line 584
    .line 585
    const/high16 v8, 0x3f800000    # 1.0f

    .line 586
    .line 587
    const/4 v7, 0x0

    .line 588
    const/high16 v9, 0x3f800000    # 1.0f

    .line 589
    .line 590
    const/high16 v12, 0x3f800000    # 1.0f

    .line 591
    .line 592
    const/4 v13, 0x0

    .line 593
    const/4 v15, 0x0

    .line 594
    const-string v4, ""

    .line 595
    .line 596
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 597
    .line 598
    .line 599
    move-result-object v0

    .line 600
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 601
    .line 602
    .line 603
    move-result-object v0

    .line 604
    sput-object v0, Landroidx/compose/material/icons/filled/PedalBikeKt;->_pedalBike:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 605
    .line 606
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 607
    .line 608
    .line 609
    return-object v0
.end method
