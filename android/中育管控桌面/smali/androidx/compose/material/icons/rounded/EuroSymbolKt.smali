.class public final Landroidx/compose/material/icons/rounded/EuroSymbolKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_euroSymbol",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "EuroSymbol",
        "Landroidx/compose/material/icons/Icons$Rounded;",
        "getEuroSymbol",
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
        "SMAP\nEuroSymbol.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EuroSymbol.kt\nandroidx/compose/material/icons/rounded/EuroSymbolKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,71:1\n212#2,12:72\n233#2,18:85\n253#2:122\n174#3:84\n705#4,2:103\n717#4,2:105\n719#4,11:111\n72#5,4:107\n*S KotlinDebug\n*F\n+ 1 EuroSymbol.kt\nandroidx/compose/material/icons/rounded/EuroSymbolKt\n*L\n29#1:72,12\n30#1:85,18\n30#1:122\n29#1:84\n30#1:103,2\n30#1:105,2\n30#1:111,11\n30#1:107,4\n*E\n"
    }
.end annotation


# static fields
.field private static _euroSymbol:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getEuroSymbol(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/EuroSymbolKt;->_euroSymbol:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.EuroSymbol"

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
    const/high16 v0, 0x41700000    # 15.0f

    .line 71
    .line 72
    const/high16 v2, 0x41940000    # 18.5f

    .line 73
    .line 74
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const v17, -0x3f47ae14    # -5.76f

    .line 78
    .line 79
    .line 80
    const/high16 v18, -0x3fa00000    # -3.5f

    .line 81
    .line 82
    const v13, -0x3fdf5c29    # -2.51f

    .line 83
    .line 84
    .line 85
    const/4 v14, 0x0

    .line 86
    const v15, -0x3f6a3d71    # -4.68f

    .line 87
    .line 88
    .line 89
    const v16, -0x404a3d71    # -1.42f

    .line 90
    .line 91
    .line 92
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 93
    .line 94
    .line 95
    const/high16 v0, 0x41600000    # 14.0f

    .line 96
    .line 97
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 98
    .line 99
    .line 100
    const/high16 v17, 0x3f800000    # 1.0f

    .line 101
    .line 102
    const/high16 v18, -0x40800000    # -1.0f

    .line 103
    .line 104
    const v13, 0x3f0ccccd    # 0.55f

    .line 105
    .line 106
    .line 107
    const/high16 v15, 0x3f800000    # 1.0f

    .line 108
    .line 109
    const v16, -0x4119999a    # -0.45f

    .line 110
    .line 111
    .line 112
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 113
    .line 114
    .line 115
    const v0, -0x4119999a    # -0.45f

    .line 116
    .line 117
    .line 118
    const/high16 v2, -0x40800000    # -1.0f

    .line 119
    .line 120
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 121
    .line 122
    .line 123
    const v0, 0x410947ae    # 8.58f

    .line 124
    .line 125
    .line 126
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 127
    .line 128
    .line 129
    const v17, -0x425c28f6    # -0.08f

    .line 130
    .line 131
    .line 132
    const v13, -0x42b33333    # -0.05f

    .line 133
    .line 134
    .line 135
    const v14, -0x41570a3d    # -0.33f

    .line 136
    .line 137
    .line 138
    const v15, -0x425c28f6    # -0.08f

    .line 139
    .line 140
    .line 141
    const v16, -0x40d70a3d    # -0.66f

    .line 142
    .line 143
    .line 144
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 145
    .line 146
    .line 147
    const v0, -0x40d47ae1    # -0.67f

    .line 148
    .line 149
    .line 150
    const v2, 0x3da3d70a    # 0.08f

    .line 151
    .line 152
    .line 153
    const/high16 v4, -0x40800000    # -1.0f

    .line 154
    .line 155
    const v6, 0x3cf5c28f    # 0.03f

    .line 156
    .line 157
    .line 158
    invoke-virtual {v12, v6, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 159
    .line 160
    .line 161
    const/high16 v0, 0x41600000    # 14.0f

    .line 162
    .line 163
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 164
    .line 165
    .line 166
    const/high16 v17, 0x3f800000    # 1.0f

    .line 167
    .line 168
    const v13, 0x3f0ccccd    # 0.55f

    .line 169
    .line 170
    .line 171
    const/4 v14, 0x0

    .line 172
    const/high16 v15, 0x3f800000    # 1.0f

    .line 173
    .line 174
    const v16, -0x4119999a    # -0.45f

    .line 175
    .line 176
    .line 177
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 178
    .line 179
    .line 180
    const v0, -0x4119999a    # -0.45f

    .line 181
    .line 182
    .line 183
    const/high16 v2, -0x40800000    # -1.0f

    .line 184
    .line 185
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 186
    .line 187
    .line 188
    const v0, 0x4113d70a    # 9.24f

    .line 189
    .line 190
    .line 191
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 192
    .line 193
    .line 194
    const/high16 v17, 0x41700000    # 15.0f

    .line 195
    .line 196
    const/high16 v18, 0x40b00000    # 5.5f

    .line 197
    .line 198
    const v13, 0x41251eb8    # 10.32f

    .line 199
    .line 200
    .line 201
    const v14, 0x40dd70a4    # 6.92f

    .line 202
    .line 203
    .line 204
    const/high16 v15, 0x41480000    # 12.5f

    .line 205
    .line 206
    const/high16 v16, 0x40b00000    # 5.5f

    .line 207
    .line 208
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 209
    .line 210
    .line 211
    const v17, 0x405ae148    # 3.42f

    .line 212
    .line 213
    .line 214
    const v18, 0x3f7851ec    # 0.97f

    .line 215
    .line 216
    .line 217
    const/high16 v13, 0x3fa00000    # 1.25f

    .line 218
    .line 219
    const/4 v14, 0x0

    .line 220
    const v15, 0x401ae148    # 2.42f

    .line 221
    .line 222
    .line 223
    const v16, 0x3eb851ec    # 0.36f

    .line 224
    .line 225
    .line 226
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 227
    .line 228
    .line 229
    const v17, 0x3fc8f5c3    # 1.57f

    .line 230
    .line 231
    .line 232
    const v18, -0x41dc28f6    # -0.16f

    .line 233
    .line 234
    .line 235
    const/high16 v13, 0x3f000000    # 0.5f

    .line 236
    .line 237
    const v14, 0x3e9eb852    # 0.31f

    .line 238
    .line 239
    .line 240
    const v15, 0x3f933333    # 1.15f

    .line 241
    .line 242
    .line 243
    const v16, 0x3e851eb8    # 0.26f

    .line 244
    .line 245
    .line 246
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 247
    .line 248
    .line 249
    const/high16 v17, -0x41800000    # -0.25f

    .line 250
    .line 251
    const v18, -0x40051eb8    # -1.96f

    .line 252
    .line 253
    .line 254
    const v13, 0x3f147ae1    # 0.58f

    .line 255
    .line 256
    .line 257
    const v14, -0x40eb851f    # -0.58f

    .line 258
    .line 259
    .line 260
    const v15, 0x3ee66666    # 0.45f

    .line 261
    .line 262
    .line 263
    const v16, -0x403c28f6    # -1.53f

    .line 264
    .line 265
    .line 266
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 267
    .line 268
    .line 269
    const/high16 v17, 0x41700000    # 15.0f

    .line 270
    .line 271
    const/high16 v18, 0x40400000    # 3.0f

    .line 272
    .line 273
    const v13, 0x4192e148    # 18.36f

    .line 274
    .line 275
    .line 276
    const/high16 v14, 0x40600000    # 3.5f

    .line 277
    .line 278
    const v15, 0x4185d70a    # 16.73f

    .line 279
    .line 280
    .line 281
    const/high16 v16, 0x40400000    # 3.0f

    .line 282
    .line 283
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 284
    .line 285
    .line 286
    const v17, -0x3ef851ec    # -8.48f

    .line 287
    .line 288
    .line 289
    const/high16 v18, 0x40c00000    # 6.0f

    .line 290
    .line 291
    const v13, -0x3f851eb8    # -3.92f

    .line 292
    .line 293
    .line 294
    const/4 v14, 0x0

    .line 295
    const v15, -0x3f1851ec    # -7.24f

    .line 296
    .line 297
    .line 298
    const v16, 0x4020a3d7    # 2.51f

    .line 299
    .line 300
    .line 301
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 302
    .line 303
    .line 304
    const/high16 v0, 0x40800000    # 4.0f

    .line 305
    .line 306
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 307
    .line 308
    .line 309
    const/high16 v17, -0x40800000    # -1.0f

    .line 310
    .line 311
    const/high16 v18, 0x3f800000    # 1.0f

    .line 312
    .line 313
    const v13, -0x40f33333    # -0.55f

    .line 314
    .line 315
    .line 316
    const/high16 v15, -0x40800000    # -1.0f

    .line 317
    .line 318
    const v16, 0x3ee66666    # 0.45f

    .line 319
    .line 320
    .line 321
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 322
    .line 323
    .line 324
    const v0, 0x3ee66666    # 0.45f

    .line 325
    .line 326
    .line 327
    const/high16 v2, 0x3f800000    # 1.0f

    .line 328
    .line 329
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 330
    .line 331
    .line 332
    const v0, 0x4003d70a    # 2.06f

    .line 333
    .line 334
    .line 335
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 336
    .line 337
    .line 338
    const v17, -0x428a3d71    # -0.06f

    .line 339
    .line 340
    .line 341
    const v13, -0x42dc28f6    # -0.04f

    .line 342
    .line 343
    .line 344
    const v14, 0x3ea8f5c3    # 0.33f

    .line 345
    .line 346
    .line 347
    const v15, -0x428a3d71    # -0.06f

    .line 348
    .line 349
    .line 350
    const v16, 0x3f28f5c3    # 0.66f

    .line 351
    .line 352
    .line 353
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 354
    .line 355
    .line 356
    const v0, 0x3f2b851f    # 0.67f

    .line 357
    .line 358
    .line 359
    const v2, 0x3d75c28f    # 0.06f

    .line 360
    .line 361
    .line 362
    const/high16 v4, 0x3f800000    # 1.0f

    .line 363
    .line 364
    const v6, 0x3ca3d70a    # 0.02f

    .line 365
    .line 366
    .line 367
    invoke-virtual {v12, v6, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 368
    .line 369
    .line 370
    const/high16 v0, 0x40800000    # 4.0f

    .line 371
    .line 372
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 373
    .line 374
    .line 375
    const/high16 v17, -0x40800000    # -1.0f

    .line 376
    .line 377
    const v13, -0x40f33333    # -0.55f

    .line 378
    .line 379
    .line 380
    const/4 v14, 0x0

    .line 381
    const/high16 v15, -0x40800000    # -1.0f

    .line 382
    .line 383
    const v16, 0x3ee66666    # 0.45f

    .line 384
    .line 385
    .line 386
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 387
    .line 388
    .line 389
    const v0, 0x3ee66666    # 0.45f

    .line 390
    .line 391
    .line 392
    const/high16 v2, 0x3f800000    # 1.0f

    .line 393
    .line 394
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 395
    .line 396
    .line 397
    const v0, 0x402147ae    # 2.52f

    .line 398
    .line 399
    .line 400
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 401
    .line 402
    .line 403
    const v17, 0x4107ae14    # 8.48f

    .line 404
    .line 405
    .line 406
    const/high16 v18, 0x40c00000    # 6.0f

    .line 407
    .line 408
    const v13, 0x3f9eb852    # 1.24f

    .line 409
    .line 410
    .line 411
    const v14, 0x405f5c29    # 3.49f

    .line 412
    .line 413
    .line 414
    const v15, 0x4091eb85    # 4.56f

    .line 415
    .line 416
    .line 417
    const/high16 v16, 0x40c00000    # 6.0f

    .line 418
    .line 419
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 420
    .line 421
    .line 422
    const v17, 0x4097ae14    # 4.74f

    .line 423
    .line 424
    .line 425
    const v18, -0x40533333    # -1.35f

    .line 426
    .line 427
    .line 428
    const v13, 0x3fdeb852    # 1.74f

    .line 429
    .line 430
    .line 431
    const/4 v14, 0x0

    .line 432
    const v15, 0x40570a3d    # 3.36f

    .line 433
    .line 434
    .line 435
    const v16, -0x41051eb8    # -0.49f

    .line 436
    .line 437
    .line 438
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 439
    .line 440
    .line 441
    const v17, 0x3e75c28f    # 0.24f

    .line 442
    .line 443
    .line 444
    const v18, -0x4003d70a    # -1.97f

    .line 445
    .line 446
    .line 447
    const v13, 0x3f30a3d7    # 0.69f

    .line 448
    .line 449
    .line 450
    const v14, -0x4123d70a    # -0.43f

    .line 451
    .line 452
    .line 453
    const v15, 0x3f51eb85    # 0.82f

    .line 454
    .line 455
    .line 456
    const v16, -0x404e147b    # -1.39f

    .line 457
    .line 458
    .line 459
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 460
    .line 461
    .line 462
    const v17, -0x40370a3d    # -1.57f

    .line 463
    .line 464
    .line 465
    const v18, -0x41e66666    # -0.15f

    .line 466
    .line 467
    .line 468
    const v13, -0x4128f5c3    # -0.42f

    .line 469
    .line 470
    .line 471
    const v14, -0x4128f5c3    # -0.42f

    .line 472
    .line 473
    .line 474
    const v15, -0x40770a3d    # -1.07f

    .line 475
    .line 476
    .line 477
    const v16, -0x410f5c29    # -0.47f

    .line 478
    .line 479
    .line 480
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 481
    .line 482
    .line 483
    const v17, -0x3fa5c28f    # -3.41f

    .line 484
    .line 485
    .line 486
    const v18, 0x3f7851ec    # 0.97f

    .line 487
    .line 488
    .line 489
    const v13, -0x40828f5c    # -0.99f

    .line 490
    .line 491
    .line 492
    const v14, 0x3f1eb852    # 0.62f

    .line 493
    .line 494
    .line 495
    const v15, -0x3ff66666    # -2.15f

    .line 496
    .line 497
    .line 498
    const v16, 0x3f7851ec    # 0.97f

    .line 499
    .line 500
    .line 501
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 502
    .line 503
    .line 504
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 505
    .line 506
    .line 507
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 508
    .line 509
    .line 510
    move-result-object v2

    .line 511
    const/16 v16, 0x3800

    .line 512
    .line 513
    const/16 v17, 0x0

    .line 514
    .line 515
    const/high16 v6, 0x3f800000    # 1.0f

    .line 516
    .line 517
    const/high16 v8, 0x3f800000    # 1.0f

    .line 518
    .line 519
    const/4 v7, 0x0

    .line 520
    const/high16 v9, 0x3f800000    # 1.0f

    .line 521
    .line 522
    const/high16 v12, 0x3f800000    # 1.0f

    .line 523
    .line 524
    const/4 v13, 0x0

    .line 525
    const/4 v14, 0x0

    .line 526
    const/4 v15, 0x0

    .line 527
    const-string v4, ""

    .line 528
    .line 529
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 530
    .line 531
    .line 532
    move-result-object v0

    .line 533
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 534
    .line 535
    .line 536
    move-result-object v0

    .line 537
    sput-object v0, Landroidx/compose/material/icons/rounded/EuroSymbolKt;->_euroSymbol:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 538
    .line 539
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 540
    .line 541
    .line 542
    return-object v0
.end method
