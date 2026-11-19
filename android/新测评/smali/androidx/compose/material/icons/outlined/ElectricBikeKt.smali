.class public final Landroidx/compose/material/icons/outlined/ElectricBikeKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_electricBike",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "ElectricBike",
        "Landroidx/compose/material/icons/Icons$Outlined;",
        "getElectricBike",
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
        "SMAP\nElectricBike.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ElectricBike.kt\nandroidx/compose/material/icons/outlined/ElectricBikeKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,97:1\n212#2,12:98\n233#2,18:111\n253#2:148\n233#2,18:149\n253#2:186\n174#3:110\n705#4,2:129\n717#4,2:131\n719#4,11:137\n705#4,2:167\n717#4,2:169\n719#4,11:175\n72#5,4:133\n72#5,4:171\n*S KotlinDebug\n*F\n+ 1 ElectricBike.kt\nandroidx/compose/material/icons/outlined/ElectricBikeKt\n*L\n29#1:98,12\n30#1:111,18\n30#1:148\n83#1:149,18\n83#1:186\n29#1:110\n30#1:129,2\n30#1:131,2\n30#1:137,11\n83#1:167,2\n83#1:169,2\n83#1:175,11\n30#1:133,4\n83#1:171,4\n*E\n"
    }
.end annotation


# static fields
.field private static _electricBike:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getElectricBike(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/outlined/ElectricBikeKt;->_electricBike:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Outlined.ElectricBike"

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
    const/4 v2, 0x0

    .line 50
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 51
    .line 52
    .line 53
    sget-object v18, Landroidx/compose/ui/graphics/StrokeCap;->Companion:Landroidx/compose/ui/graphics/StrokeCap$Companion;

    .line 54
    .line 55
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 56
    .line 57
    .line 58
    move-result v10

    .line 59
    sget-object v19, Landroidx/compose/ui/graphics/StrokeJoin;->Companion:Landroidx/compose/ui/graphics/StrokeJoin$Companion;

    .line 60
    .line 61
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 62
    .line 63
    .line 64
    move-result v11

    .line 65
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 66
    .line 67
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 68
    .line 69
    .line 70
    const/high16 v4, 0x40e00000    # 7.0f

    .line 71
    .line 72
    const/high16 v6, 0x41980000    # 19.0f

    .line 73
    .line 74
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const v4, -0x40ae147b    # -0.82f

    .line 78
    .line 79
    .line 80
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 81
    .line 82
    .line 83
    const v4, -0x40266666    # -1.7f

    .line 84
    .line 85
    .line 86
    const v6, -0x3f6a3d71    # -4.68f

    .line 87
    .line 88
    .line 89
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 90
    .line 91
    .line 92
    const v25, 0x4169999a    # 14.6f

    .line 93
    .line 94
    .line 95
    const/high16 v26, 0x3f800000    # 1.0f

    .line 96
    .line 97
    const v21, 0x4181851f    # 16.19f

    .line 98
    .line 99
    .line 100
    const v22, 0x3fc3d70a    # 1.53f

    .line 101
    .line 102
    .line 103
    const v23, 0x41770a3d    # 15.44f

    .line 104
    .line 105
    .line 106
    const/high16 v24, 0x3f800000    # 1.0f

    .line 107
    .line 108
    move-object/from16 v20, v2

    .line 109
    .line 110
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 111
    .line 112
    .line 113
    const/high16 v4, 0x41400000    # 12.0f

    .line 114
    .line 115
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 116
    .line 117
    .line 118
    const/high16 v4, 0x40000000    # 2.0f

    .line 119
    .line 120
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 121
    .line 122
    .line 123
    const v4, 0x40266666    # 2.6f

    .line 124
    .line 125
    .line 126
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 127
    .line 128
    .line 129
    const v4, 0x3fbae148    # 1.46f

    .line 130
    .line 131
    .line 132
    const/high16 v6, 0x40800000    # 4.0f

    .line 133
    .line 134
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 135
    .line 136
    .line 137
    const v4, -0x3f66147b    # -4.81f

    .line 138
    .line 139
    .line 140
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 141
    .line 142
    .line 143
    const v4, -0x4147ae14    # -0.36f

    .line 144
    .line 145
    .line 146
    const/high16 v6, -0x40800000    # -1.0f

    .line 147
    .line 148
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 149
    .line 150
    .line 151
    const/high16 v4, 0x41400000    # 12.0f

    .line 152
    .line 153
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 154
    .line 155
    .line 156
    const/high16 v4, 0x40800000    # 4.0f

    .line 157
    .line 158
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 159
    .line 160
    .line 161
    const/high16 v4, 0x40e00000    # 7.0f

    .line 162
    .line 163
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 164
    .line 165
    .line 166
    const/high16 v4, 0x40000000    # 2.0f

    .line 167
    .line 168
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 169
    .line 170
    .line 171
    const/high16 v4, 0x3fe00000    # 1.75f

    .line 172
    .line 173
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 174
    .line 175
    .line 176
    const v4, 0x3fe8f5c3    # 1.82f

    .line 177
    .line 178
    .line 179
    const/high16 v6, 0x40a00000    # 5.0f

    .line 180
    .line 181
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 182
    .line 183
    .line 184
    const v4, 0x411e6666    # 9.9f

    .line 185
    .line 186
    .line 187
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 188
    .line 189
    .line 190
    const/high16 v25, 0x40a80000    # 5.25f

    .line 191
    .line 192
    const v26, 0x40e051ec    # 7.01f

    .line 193
    .line 194
    .line 195
    const v21, 0x41175c29    # 9.46f

    .line 196
    .line 197
    .line 198
    const v22, 0x410c51ec    # 8.77f

    .line 199
    .line 200
    .line 201
    const v23, 0x40f2e148    # 7.59f

    .line 202
    .line 203
    .line 204
    const v24, 0x40e3d70a    # 7.12f

    .line 205
    .line 206
    .line 207
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 208
    .line 209
    .line 210
    const/16 v25, 0x0

    .line 211
    .line 212
    const/high16 v26, 0x41400000    # 12.0f

    .line 213
    .line 214
    const v21, 0x401ccccd    # 2.45f

    .line 215
    .line 216
    .line 217
    const v22, 0x40dbd70a    # 6.87f

    .line 218
    .line 219
    .line 220
    const/16 v23, 0x0

    .line 221
    .line 222
    const v24, 0x41133333    # 9.2f

    .line 223
    .line 224
    .line 225
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 226
    .line 227
    .line 228
    const/high16 v25, 0x40a00000    # 5.0f

    .line 229
    .line 230
    const/high16 v26, 0x40a00000    # 5.0f

    .line 231
    .line 232
    const/16 v21, 0x0

    .line 233
    .line 234
    const v22, 0x40333333    # 2.8f

    .line 235
    .line 236
    .line 237
    const v23, 0x400ccccd    # 2.2f

    .line 238
    .line 239
    .line 240
    const/high16 v24, 0x40a00000    # 5.0f

    .line 241
    .line 242
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 243
    .line 244
    .line 245
    const v25, 0x409ccccd    # 4.9f

    .line 246
    .line 247
    .line 248
    const/high16 v26, -0x3f800000    # -4.0f

    .line 249
    .line 250
    const v21, 0x401d70a4    # 2.46f

    .line 251
    .line 252
    .line 253
    const/16 v22, 0x0

    .line 254
    .line 255
    const v23, 0x408e6666    # 4.45f

    .line 256
    .line 257
    .line 258
    const v24, -0x4027ae14    # -1.69f

    .line 259
    .line 260
    .line 261
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 262
    .line 263
    .line 264
    const v4, 0x40866666    # 4.2f

    .line 265
    .line 266
    .line 267
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 268
    .line 269
    .line 270
    const v25, 0x4094cccd    # 4.65f

    .line 271
    .line 272
    .line 273
    const v26, 0x407f5c29    # 3.99f

    .line 274
    .line 275
    .line 276
    const v21, 0x3ee147ae    # 0.44f

    .line 277
    .line 278
    .line 279
    const v22, 0x400eb852    # 2.23f

    .line 280
    .line 281
    .line 282
    const v23, 0x4013d70a    # 2.31f

    .line 283
    .line 284
    .line 285
    const v24, 0x407851ec    # 3.88f

    .line 286
    .line 287
    .line 288
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 289
    .line 290
    .line 291
    const/high16 v25, 0x40a80000    # 5.25f

    .line 292
    .line 293
    const/high16 v26, -0x3f600000    # -5.0f

    .line 294
    .line 295
    const v21, 0x40333333    # 2.8f

    .line 296
    .line 297
    .line 298
    const v22, 0x3e051eb8    # 0.13f

    .line 299
    .line 300
    .line 301
    const/high16 v23, 0x40a80000    # 5.25f

    .line 302
    .line 303
    const v24, -0x3ff3d70a    # -2.19f

    .line 304
    .line 305
    .line 306
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 307
    .line 308
    .line 309
    const/high16 v25, 0x41980000    # 19.0f

    .line 310
    .line 311
    const/high16 v26, 0x40e00000    # 7.0f

    .line 312
    .line 313
    const/high16 v21, 0x41c00000    # 24.0f

    .line 314
    .line 315
    const v22, 0x41133333    # 9.2f

    .line 316
    .line 317
    .line 318
    const v23, 0x41ae6666    # 21.8f

    .line 319
    .line 320
    .line 321
    const/high16 v24, 0x40e00000    # 7.0f

    .line 322
    .line 323
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 324
    .line 325
    .line 326
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 327
    .line 328
    .line 329
    const/high16 v4, 0x41500000    # 13.0f

    .line 330
    .line 331
    const v6, 0x40fa3d71    # 7.82f

    .line 332
    .line 333
    .line 334
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 335
    .line 336
    .line 337
    const v25, -0x3fcb851f    # -2.82f

    .line 338
    .line 339
    .line 340
    const/high16 v26, 0x40000000    # 2.0f

    .line 341
    .line 342
    const v21, -0x41333333    # -0.4f

    .line 343
    .line 344
    .line 345
    const v22, 0x3f95c28f    # 1.17f

    .line 346
    .line 347
    .line 348
    const v23, -0x404147ae    # -1.49f

    .line 349
    .line 350
    .line 351
    const/high16 v24, 0x40000000    # 2.0f

    .line 352
    .line 353
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 354
    .line 355
    .line 356
    const/high16 v25, -0x3fc00000    # -3.0f

    .line 357
    .line 358
    const/high16 v26, -0x3fc00000    # -3.0f

    .line 359
    .line 360
    const v21, -0x4028f5c3    # -1.68f

    .line 361
    .line 362
    .line 363
    const/16 v22, 0x0

    .line 364
    .line 365
    const/high16 v23, -0x3fc00000    # -3.0f

    .line 366
    .line 367
    const v24, -0x40570a3d    # -1.32f

    .line 368
    .line 369
    .line 370
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 371
    .line 372
    .line 373
    const v4, 0x3fa8f5c3    # 1.32f

    .line 374
    .line 375
    .line 376
    const/high16 v6, 0x40400000    # 3.0f

    .line 377
    .line 378
    const/high16 v7, -0x3fc00000    # -3.0f

    .line 379
    .line 380
    invoke-virtual {v2, v4, v7, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 381
    .line 382
    .line 383
    const v25, 0x40347ae1    # 2.82f

    .line 384
    .line 385
    .line 386
    const/high16 v26, 0x40000000    # 2.0f

    .line 387
    .line 388
    const v21, 0x3faa3d71    # 1.33f

    .line 389
    .line 390
    .line 391
    const v23, 0x401ae148    # 2.42f

    .line 392
    .line 393
    .line 394
    const v24, 0x3f547ae1    # 0.83f

    .line 395
    .line 396
    .line 397
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 398
    .line 399
    .line 400
    const/high16 v4, 0x40a00000    # 5.0f

    .line 401
    .line 402
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 403
    .line 404
    .line 405
    const/high16 v4, 0x40000000    # 2.0f

    .line 406
    .line 407
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 408
    .line 409
    .line 410
    const v4, 0x40fa3d71    # 7.82f

    .line 411
    .line 412
    .line 413
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 414
    .line 415
    .line 416
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 417
    .line 418
    .line 419
    const v4, 0x4161999a    # 14.1f

    .line 420
    .line 421
    .line 422
    const/high16 v6, 0x41300000    # 11.0f

    .line 423
    .line 424
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 425
    .line 426
    .line 427
    const v4, -0x404ccccd    # -1.4f

    .line 428
    .line 429
    .line 430
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 431
    .line 432
    .line 433
    const v4, -0x40c51eb8    # -0.73f

    .line 434
    .line 435
    .line 436
    const/high16 v6, -0x40000000    # -2.0f

    .line 437
    .line 438
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 439
    .line 440
    .line 441
    const/high16 v4, 0x41700000    # 15.0f

    .line 442
    .line 443
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 444
    .line 445
    .line 446
    const v25, 0x4161999a    # 14.1f

    .line 447
    .line 448
    .line 449
    const/high16 v26, 0x41300000    # 11.0f

    .line 450
    .line 451
    const v21, 0x4168f5c3    # 14.56f

    .line 452
    .line 453
    .line 454
    const v22, 0x411947ae    # 9.58f

    .line 455
    .line 456
    .line 457
    const v23, 0x4163d70a    # 14.24f

    .line 458
    .line 459
    .line 460
    const/high16 v24, 0x41240000    # 10.25f

    .line 461
    .line 462
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 463
    .line 464
    .line 465
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 466
    .line 467
    .line 468
    const/high16 v4, 0x41980000    # 19.0f

    .line 469
    .line 470
    const/high16 v6, 0x41700000    # 15.0f

    .line 471
    .line 472
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 473
    .line 474
    .line 475
    const/high16 v25, -0x3fc00000    # -3.0f

    .line 476
    .line 477
    const/high16 v26, -0x3fc00000    # -3.0f

    .line 478
    .line 479
    const v21, -0x4028f5c3    # -1.68f

    .line 480
    .line 481
    .line 482
    const/16 v22, 0x0

    .line 483
    .line 484
    const/high16 v23, -0x3fc00000    # -3.0f

    .line 485
    .line 486
    const v24, -0x40570a3d    # -1.32f

    .line 487
    .line 488
    .line 489
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 490
    .line 491
    .line 492
    const v25, 0x3f866666    # 1.05f

    .line 493
    .line 494
    .line 495
    const v26, -0x3fee147b    # -2.28f

    .line 496
    .line 497
    .line 498
    const/16 v21, 0x0

    .line 499
    .line 500
    const v22, -0x4091eb85    # -0.93f

    .line 501
    .line 502
    .line 503
    const v23, 0x3ed1eb85    # 0.41f

    .line 504
    .line 505
    .line 506
    const v24, -0x40228f5c    # -1.73f

    .line 507
    .line 508
    .line 509
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 510
    .line 511
    .line 512
    const v4, 0x3f75c28f    # 0.96f

    .line 513
    .line 514
    .line 515
    const v6, 0x4028f5c3    # 2.64f

    .line 516
    .line 517
    .line 518
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 519
    .line 520
    .line 521
    const v4, 0x3ff0a3d7    # 1.88f

    .line 522
    .line 523
    .line 524
    const v6, -0x40d1eb85    # -0.68f

    .line 525
    .line 526
    .line 527
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 528
    .line 529
    .line 530
    const v4, -0x4087ae14    # -0.97f

    .line 531
    .line 532
    .line 533
    const v6, -0x3fd51eb8    # -2.67f

    .line 534
    .line 535
    .line 536
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 537
    .line 538
    .line 539
    const/high16 v25, 0x41980000    # 19.0f

    .line 540
    .line 541
    const/high16 v26, 0x41100000    # 9.0f

    .line 542
    .line 543
    const v21, 0x4197851f    # 18.94f

    .line 544
    .line 545
    .line 546
    const v22, 0x411028f6    # 9.01f

    .line 547
    .line 548
    .line 549
    const v23, 0x4197c28f    # 18.97f

    .line 550
    .line 551
    .line 552
    const/high16 v24, 0x41100000    # 9.0f

    .line 553
    .line 554
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 555
    .line 556
    .line 557
    const/high16 v25, 0x40400000    # 3.0f

    .line 558
    .line 559
    const/high16 v26, 0x40400000    # 3.0f

    .line 560
    .line 561
    const v21, 0x3fd70a3d    # 1.68f

    .line 562
    .line 563
    .line 564
    const/16 v22, 0x0

    .line 565
    .line 566
    const/high16 v23, 0x40400000    # 3.0f

    .line 567
    .line 568
    const v24, 0x3fa8f5c3    # 1.32f

    .line 569
    .line 570
    .line 571
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 572
    .line 573
    .line 574
    const v4, 0x41a570a4    # 20.68f

    .line 575
    .line 576
    .line 577
    const/high16 v6, 0x41980000    # 19.0f

    .line 578
    .line 579
    const/high16 v7, 0x41700000    # 15.0f

    .line 580
    .line 581
    invoke-virtual {v2, v4, v7, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 582
    .line 583
    .line 584
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 585
    .line 586
    .line 587
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 588
    .line 589
    .line 590
    move-result-object v2

    .line 591
    const/16 v16, 0x3800

    .line 592
    .line 593
    const/16 v17, 0x0

    .line 594
    .line 595
    const/high16 v6, 0x3f800000    # 1.0f

    .line 596
    .line 597
    const/high16 v8, 0x3f800000    # 1.0f

    .line 598
    .line 599
    const/4 v7, 0x0

    .line 600
    const/high16 v9, 0x3f800000    # 1.0f

    .line 601
    .line 602
    const/high16 v12, 0x3f800000    # 1.0f

    .line 603
    .line 604
    const/4 v13, 0x0

    .line 605
    const/4 v14, 0x0

    .line 606
    const/4 v15, 0x0

    .line 607
    const-string v4, ""

    .line 608
    .line 609
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 610
    .line 611
    .line 612
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 613
    .line 614
    .line 615
    move-result v3

    .line 616
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 617
    .line 618
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 619
    .line 620
    .line 621
    move-result-wide v6

    .line 622
    const/4 v0, 0x0

    .line 623
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 624
    .line 625
    .line 626
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 627
    .line 628
    .line 629
    move-result v10

    .line 630
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 631
    .line 632
    .line 633
    move-result v11

    .line 634
    new-instance v0, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 635
    .line 636
    invoke-direct {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 637
    .line 638
    .line 639
    const/high16 v2, 0x41a00000    # 20.0f

    .line 640
    .line 641
    const/high16 v4, 0x41300000    # 11.0f

    .line 642
    .line 643
    invoke-virtual {v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 644
    .line 645
    .line 646
    const/high16 v2, -0x3f800000    # -4.0f

    .line 647
    .line 648
    const/4 v4, 0x0

    .line 649
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 650
    .line 651
    .line 652
    const/high16 v2, 0x40c00000    # 6.0f

    .line 653
    .line 654
    const/high16 v4, 0x40400000    # 3.0f

    .line 655
    .line 656
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 657
    .line 658
    .line 659
    const/high16 v2, -0x40000000    # -2.0f

    .line 660
    .line 661
    const/4 v4, 0x0

    .line 662
    invoke-virtual {v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 663
    .line 664
    .line 665
    const/4 v2, 0x0

    .line 666
    const/high16 v4, 0x40800000    # 4.0f

    .line 667
    .line 668
    invoke-virtual {v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 669
    .line 670
    .line 671
    const/high16 v2, -0x3f400000    # -6.0f

    .line 672
    .line 673
    const/high16 v4, -0x3fc00000    # -3.0f

    .line 674
    .line 675
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 676
    .line 677
    .line 678
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 679
    .line 680
    .line 681
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 682
    .line 683
    .line 684
    move-result-object v2

    .line 685
    const/high16 v6, 0x3f800000    # 1.0f

    .line 686
    .line 687
    const/4 v7, 0x0

    .line 688
    const-string v4, ""

    .line 689
    .line 690
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 691
    .line 692
    .line 693
    move-result-object v0

    .line 694
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 695
    .line 696
    .line 697
    move-result-object v0

    .line 698
    sput-object v0, Landroidx/compose/material/icons/outlined/ElectricBikeKt;->_electricBike:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 699
    .line 700
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 701
    .line 702
    .line 703
    return-object v0
.end method
