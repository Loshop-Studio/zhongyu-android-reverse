.class public final Landroidx/compose/material/icons/filled/PrecisionManufacturingKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_precisionManufacturing",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "PrecisionManufacturing",
        "Landroidx/compose/material/icons/Icons$Filled;",
        "getPrecisionManufacturing",
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
        "SMAP\nPrecisionManufacturing.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PrecisionManufacturing.kt\nandroidx/compose/material/icons/filled/PrecisionManufacturingKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,79:1\n212#2,12:80\n233#2,18:93\n253#2:130\n174#3:92\n705#4,2:111\n717#4,2:113\n719#4,11:119\n72#5,4:115\n*S KotlinDebug\n*F\n+ 1 PrecisionManufacturing.kt\nandroidx/compose/material/icons/filled/PrecisionManufacturingKt\n*L\n29#1:80,12\n30#1:93,18\n30#1:130\n29#1:92\n30#1:111,2\n30#1:113,2\n30#1:119,11\n30#1:115,4\n*E\n"
    }
.end annotation


# static fields
.field private static _precisionManufacturing:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getPrecisionManufacturing(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/filled/PrecisionManufacturingKt;->_precisionManufacturing:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Filled.PrecisionManufacturing"

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
    const v0, 0x419f70a4    # 19.93f

    .line 71
    .line 72
    .line 73
    const v2, 0x41035c29    # 8.21f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v0, -0x3f99999a    # -3.6f

    .line 80
    .line 81
    .line 82
    const v2, 0x3fd70a3d    # 1.68f

    .line 83
    .line 84
    .line 85
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 86
    .line 87
    .line 88
    const/high16 v0, 0x41600000    # 14.0f

    .line 89
    .line 90
    const v2, 0x40f66666    # 7.7f

    .line 91
    .line 92
    .line 93
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 94
    .line 95
    .line 96
    const v0, 0x40c9999a    # 6.3f

    .line 97
    .line 98
    .line 99
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 100
    .line 101
    .line 102
    const v0, 0x40151eb8    # 2.33f

    .line 103
    .line 104
    .line 105
    const v2, -0x3ff3d70a    # -2.19f

    .line 106
    .line 107
    .line 108
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 109
    .line 110
    .line 111
    const v0, 0x40666666    # 3.6f

    .line 112
    .line 113
    .line 114
    const v2, 0x3fd70a3d    # 1.68f

    .line 115
    .line 116
    .line 117
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 118
    .line 119
    .line 120
    const/high16 v17, 0x3f800000    # 1.0f

    .line 121
    .line 122
    const v18, -0x4147ae14    # -0.36f

    .line 123
    .line 124
    .line 125
    const v13, 0x3ec28f5c    # 0.38f

    .line 126
    .line 127
    .line 128
    const v14, 0x3e3851ec    # 0.18f

    .line 129
    .line 130
    .line 131
    const v15, 0x3f51eb85    # 0.82f

    .line 132
    .line 133
    .line 134
    const v16, 0x3c23d70a    # 0.01f

    .line 135
    .line 136
    .line 137
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 138
    .line 139
    .line 140
    const v17, -0x4147ae14    # -0.36f

    .line 141
    .line 142
    .line 143
    const/high16 v18, -0x40800000    # -1.0f

    .line 144
    .line 145
    const v13, 0x3e3851ec    # 0.18f

    .line 146
    .line 147
    .line 148
    const v14, -0x413d70a4    # -0.38f

    .line 149
    .line 150
    .line 151
    const v15, 0x3c23d70a    # 0.01f

    .line 152
    .line 153
    .line 154
    const v16, -0x40ae147b    # -0.82f

    .line 155
    .line 156
    .line 157
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 158
    .line 159
    .line 160
    const v0, 0x41853333    # 16.65f

    .line 161
    .line 162
    .line 163
    const v2, 0x40266666    # 2.6f

    .line 164
    .line 165
    .line 166
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 167
    .line 168
    .line 169
    const v17, -0x406f5c29    # -1.13f

    .line 170
    .line 171
    .line 172
    const v18, 0x3e4ccccd    # 0.2f

    .line 173
    .line 174
    .line 175
    const v13, -0x413d70a4    # -0.38f

    .line 176
    .line 177
    .line 178
    const v14, -0x41c7ae14    # -0.18f

    .line 179
    .line 180
    .line 181
    const v15, -0x40ab851f    # -0.83f

    .line 182
    .line 183
    .line 184
    const v16, -0x42333333    # -0.1f

    .line 185
    .line 186
    .line 187
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 188
    .line 189
    .line 190
    const v0, -0x402147ae    # -1.74f

    .line 191
    .line 192
    .line 193
    const v2, 0x3fcccccd    # 1.6f

    .line 194
    .line 195
    .line 196
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 197
    .line 198
    .line 199
    const/high16 v17, 0x41500000    # 13.0f

    .line 200
    .line 201
    const/high16 v18, 0x40800000    # 4.0f

    .line 202
    .line 203
    const v13, 0x4159999a    # 13.6f

    .line 204
    .line 205
    .line 206
    const v14, 0x40851eb8    # 4.16f

    .line 207
    .line 208
    .line 209
    const v15, 0x41551eb8    # 13.32f

    .line 210
    .line 211
    .line 212
    const/high16 v16, 0x40800000    # 4.0f

    .line 213
    .line 214
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 215
    .line 216
    .line 217
    const/high16 v17, -0x40800000    # -1.0f

    .line 218
    .line 219
    const/high16 v18, 0x3f800000    # 1.0f

    .line 220
    .line 221
    const v13, -0x40f33333    # -0.55f

    .line 222
    .line 223
    .line 224
    const/4 v14, 0x0

    .line 225
    const/high16 v15, -0x40800000    # -1.0f

    .line 226
    .line 227
    const v16, 0x3ee66666    # 0.45f

    .line 228
    .line 229
    .line 230
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 231
    .line 232
    .line 233
    const/high16 v0, 0x3f800000    # 1.0f

    .line 234
    .line 235
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 236
    .line 237
    .line 238
    const v0, 0x410d1eb8    # 8.82f

    .line 239
    .line 240
    .line 241
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 242
    .line 243
    .line 244
    const v17, 0x40accccd    # 5.4f

    .line 245
    .line 246
    .line 247
    const v18, 0x40823d71    # 4.07f

    .line 248
    .line 249
    .line 250
    const v13, 0x410570a4    # 8.34f

    .line 251
    .line 252
    .line 253
    const v14, 0x4094cccd    # 4.65f

    .line 254
    .line 255
    .line 256
    const v15, 0x40df5c29    # 6.98f

    .line 257
    .line 258
    .line 259
    const v16, 0x406eb852    # 3.73f

    .line 260
    .line 261
    .line 262
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 263
    .line 264
    .line 265
    const v17, 0x40428f5c    # 3.04f

    .line 266
    .line 267
    .line 268
    const/high16 v18, 0x40d00000    # 6.5f

    .line 269
    .line 270
    const v13, 0x4087ae14    # 4.24f

    .line 271
    .line 272
    .line 273
    const v14, 0x408a3d71    # 4.32f

    .line 274
    .line 275
    .line 276
    const/high16 v15, 0x40500000    # 3.25f

    .line 277
    .line 278
    const v16, 0x40aa3d71    # 5.32f

    .line 279
    .line 280
    .line 281
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 282
    .line 283
    .line 284
    const v17, 0x4090a3d7    # 4.52f

    .line 285
    .line 286
    .line 287
    const v18, 0x411947ae    # 9.58f

    .line 288
    .line 289
    .line 290
    const v13, 0x40347ae1    # 2.82f

    .line 291
    .line 292
    .line 293
    const v14, 0x40fa3d71    # 7.82f

    .line 294
    .line 295
    .line 296
    const/high16 v15, 0x40600000    # 3.5f

    .line 297
    .line 298
    const v16, 0x410f851f    # 8.97f

    .line 299
    .line 300
    .line 301
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 302
    .line 303
    .line 304
    const v0, 0x40e28f5c    # 7.08f

    .line 305
    .line 306
    .line 307
    const/high16 v2, 0x41900000    # 18.0f

    .line 308
    .line 309
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 310
    .line 311
    .line 312
    const/high16 v0, 0x40800000    # 4.0f

    .line 313
    .line 314
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 315
    .line 316
    .line 317
    const/high16 v0, 0x40400000    # 3.0f

    .line 318
    .line 319
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 320
    .line 321
    .line 322
    const/high16 v0, 0x41500000    # 13.0f

    .line 323
    .line 324
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 325
    .line 326
    .line 327
    const/high16 v0, -0x3fc00000    # -3.0f

    .line 328
    .line 329
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 330
    .line 331
    .line 332
    const v0, -0x3f9851ec    # -3.62f

    .line 333
    .line 334
    .line 335
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 336
    .line 337
    .line 338
    const v0, 0x41068f5c    # 8.41f

    .line 339
    .line 340
    .line 341
    const v2, 0x410c51ec    # 8.77f

    .line 342
    .line 343
    .line 344
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 345
    .line 346
    .line 347
    const v17, 0x410d1eb8    # 8.82f

    .line 348
    .line 349
    .line 350
    const/high16 v18, 0x41000000    # 8.0f

    .line 351
    .line 352
    const v13, 0x410947ae    # 8.58f

    .line 353
    .line 354
    .line 355
    const v14, 0x41087ae1    # 8.53f

    .line 356
    .line 357
    .line 358
    const v15, 0x410b851f    # 8.72f

    .line 359
    .line 360
    .line 361
    const v16, 0x41047ae1    # 8.28f

    .line 362
    .line 363
    .line 364
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 365
    .line 366
    .line 367
    const/high16 v0, 0x41400000    # 12.0f

    .line 368
    .line 369
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 370
    .line 371
    .line 372
    const/high16 v0, 0x3f800000    # 1.0f

    .line 373
    .line 374
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 375
    .line 376
    .line 377
    const/high16 v17, 0x3f800000    # 1.0f

    .line 378
    .line 379
    const/high16 v18, 0x3f800000    # 1.0f

    .line 380
    .line 381
    const/4 v13, 0x0

    .line 382
    const v14, 0x3f0ccccd    # 0.55f

    .line 383
    .line 384
    .line 385
    const v15, 0x3ee66666    # 0.45f

    .line 386
    .line 387
    .line 388
    const/high16 v16, 0x3f800000    # 1.0f

    .line 389
    .line 390
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 391
    .line 392
    .line 393
    const v17, 0x3f47ae14    # 0.78f

    .line 394
    .line 395
    .line 396
    const v18, -0x41333333    # -0.4f

    .line 397
    .line 398
    .line 399
    const v13, 0x3ea3d70a    # 0.32f

    .line 400
    .line 401
    .line 402
    const/4 v14, 0x0

    .line 403
    const v15, 0x3f19999a    # 0.6f

    .line 404
    .line 405
    .line 406
    const v16, -0x41dc28f6    # -0.16f

    .line 407
    .line 408
    .line 409
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 410
    .line 411
    .line 412
    const v0, 0x3fdeb852    # 1.74f

    .line 413
    .line 414
    .line 415
    const v2, 0x3fcccccd    # 1.6f

    .line 416
    .line 417
    .line 418
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 419
    .line 420
    .line 421
    const v17, 0x3f90a3d7    # 1.13f

    .line 422
    .line 423
    .line 424
    const v18, 0x3e4ccccd    # 0.2f

    .line 425
    .line 426
    .line 427
    const v13, 0x3e99999a    # 0.3f

    .line 428
    .line 429
    .line 430
    const v14, 0x3e99999a    # 0.3f

    .line 431
    .line 432
    .line 433
    const/high16 v15, 0x3f400000    # 0.75f

    .line 434
    .line 435
    const v16, 0x3ec28f5c    # 0.38f

    .line 436
    .line 437
    .line 438
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 439
    .line 440
    .line 441
    const v0, 0x407ae148    # 3.92f

    .line 442
    .line 443
    .line 444
    const v2, -0x4015c28f    # -1.83f

    .line 445
    .line 446
    .line 447
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 448
    .line 449
    .line 450
    const v17, 0x3eb851ec    # 0.36f

    .line 451
    .line 452
    .line 453
    const/high16 v18, -0x40800000    # -1.0f

    .line 454
    .line 455
    const v13, 0x3ec28f5c    # 0.38f

    .line 456
    .line 457
    .line 458
    const v14, -0x41c7ae14    # -0.18f

    .line 459
    .line 460
    .line 461
    const v15, 0x3f0a3d71    # 0.54f

    .line 462
    .line 463
    .line 464
    const v16, -0x40e147ae    # -0.62f

    .line 465
    .line 466
    .line 467
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 468
    .line 469
    .line 470
    const v17, 0x419f70a4    # 19.93f

    .line 471
    .line 472
    .line 473
    const v18, 0x41035c29    # 8.21f

    .line 474
    .line 475
    .line 476
    const/high16 v13, 0x41a60000    # 20.75f

    .line 477
    .line 478
    const v14, 0x41033333    # 8.2f

    .line 479
    .line 480
    .line 481
    const v15, 0x41a27ae1    # 20.31f

    .line 482
    .line 483
    .line 484
    const v16, 0x41007ae1    # 8.03f

    .line 485
    .line 486
    .line 487
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 488
    .line 489
    .line 490
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 491
    .line 492
    .line 493
    const/high16 v0, 0x40c00000    # 6.0f

    .line 494
    .line 495
    const/high16 v2, 0x41000000    # 8.0f

    .line 496
    .line 497
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 498
    .line 499
    .line 500
    const/high16 v17, 0x40a00000    # 5.0f

    .line 501
    .line 502
    const/high16 v18, 0x40e00000    # 7.0f

    .line 503
    .line 504
    const v13, 0x40ae6666    # 5.45f

    .line 505
    .line 506
    .line 507
    const/high16 v14, 0x41000000    # 8.0f

    .line 508
    .line 509
    const/high16 v15, 0x40a00000    # 5.0f

    .line 510
    .line 511
    const v16, 0x40f1999a    # 7.55f

    .line 512
    .line 513
    .line 514
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 515
    .line 516
    .line 517
    const/high16 v0, -0x40800000    # -1.0f

    .line 518
    .line 519
    const v2, 0x3ee66666    # 0.45f

    .line 520
    .line 521
    .line 522
    const/high16 v4, 0x3f800000    # 1.0f

    .line 523
    .line 524
    invoke-virtual {v12, v2, v0, v4, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 525
    .line 526
    .line 527
    const v0, 0x3ee66666    # 0.45f

    .line 528
    .line 529
    .line 530
    const/high16 v2, 0x3f800000    # 1.0f

    .line 531
    .line 532
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 533
    .line 534
    .line 535
    const v0, 0x40d1999a    # 6.55f

    .line 536
    .line 537
    .line 538
    const/high16 v2, 0x40c00000    # 6.0f

    .line 539
    .line 540
    const/high16 v4, 0x41000000    # 8.0f

    .line 541
    .line 542
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 543
    .line 544
    .line 545
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 546
    .line 547
    .line 548
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 549
    .line 550
    .line 551
    move-result-object v2

    .line 552
    const/16 v16, 0x3800

    .line 553
    .line 554
    const/16 v17, 0x0

    .line 555
    .line 556
    const/high16 v6, 0x3f800000    # 1.0f

    .line 557
    .line 558
    const/high16 v8, 0x3f800000    # 1.0f

    .line 559
    .line 560
    const/4 v7, 0x0

    .line 561
    const/high16 v9, 0x3f800000    # 1.0f

    .line 562
    .line 563
    const/high16 v12, 0x3f800000    # 1.0f

    .line 564
    .line 565
    const/4 v13, 0x0

    .line 566
    const/4 v14, 0x0

    .line 567
    const/4 v15, 0x0

    .line 568
    const-string v4, ""

    .line 569
    .line 570
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 571
    .line 572
    .line 573
    move-result-object v0

    .line 574
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 575
    .line 576
    .line 577
    move-result-object v0

    .line 578
    sput-object v0, Landroidx/compose/material/icons/filled/PrecisionManufacturingKt;->_precisionManufacturing:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 579
    .line 580
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 581
    .line 582
    .line 583
    return-object v0
.end method
