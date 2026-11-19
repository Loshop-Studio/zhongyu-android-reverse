.class public final Landroidx/compose/material/icons/twotone/AirlineSeatReclineNormalKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_airlineSeatReclineNormal",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "AirlineSeatReclineNormal",
        "Landroidx/compose/material/icons/Icons$TwoTone;",
        "getAirlineSeatReclineNormal",
        "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;",
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
        "SMAP\nAirlineSeatReclineNormal.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AirlineSeatReclineNormal.kt\nandroidx/compose/material/icons/twotone/AirlineSeatReclineNormalKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,71:1\n212#2,12:72\n233#2,18:85\n253#2:122\n174#3:84\n705#4,2:103\n717#4,2:105\n719#4,11:111\n72#5,4:107\n*S KotlinDebug\n*F\n+ 1 AirlineSeatReclineNormal.kt\nandroidx/compose/material/icons/twotone/AirlineSeatReclineNormalKt\n*L\n29#1:72,12\n30#1:85,18\n30#1:122\n29#1:84\n30#1:103,2\n30#1:105,2\n30#1:111,11\n30#1:107,4\n*E\n"
    }
.end annotation


# static fields
.field private static _airlineSeatReclineNormal:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getAirlineSeatReclineNormal(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/AirlineSeatReclineNormalKt;->_airlineSeatReclineNormal:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.AirlineSeatReclineNormal"

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
    const v0, 0x40f2e148    # 7.59f

    .line 71
    .line 72
    .line 73
    const v2, 0x40ad1eb8    # 5.41f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const/16 v17, 0x0

    .line 80
    .line 81
    const v18, -0x3fcae148    # -2.83f

    .line 82
    .line 83
    .line 84
    const v13, -0x40b851ec    # -0.78f

    .line 85
    .line 86
    .line 87
    const v14, -0x40b851ec    # -0.78f

    .line 88
    .line 89
    .line 90
    const v15, -0x40b851ec    # -0.78f

    .line 91
    .line 92
    .line 93
    const v16, -0x3ffccccd    # -2.05f

    .line 94
    .line 95
    .line 96
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 97
    .line 98
    .line 99
    const v0, -0x40b851ec    # -0.78f

    .line 100
    .line 101
    .line 102
    const/4 v2, 0x0

    .line 103
    const v4, 0x40351eb8    # 2.83f

    .line 104
    .line 105
    .line 106
    const v6, 0x40033333    # 2.05f

    .line 107
    .line 108
    .line 109
    invoke-virtual {v12, v6, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 110
    .line 111
    .line 112
    const v0, 0x3f47ae14    # 0.78f

    .line 113
    .line 114
    .line 115
    invoke-virtual {v12, v0, v6, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 116
    .line 117
    .line 118
    const v17, -0x3fcae148    # -2.83f

    .line 119
    .line 120
    .line 121
    const/16 v18, 0x0

    .line 122
    .line 123
    const v13, -0x40b5c28f    # -0.79f

    .line 124
    .line 125
    .line 126
    const v14, 0x3f4a3d71    # 0.79f

    .line 127
    .line 128
    .line 129
    const v15, -0x3ffccccd    # -2.05f

    .line 130
    .line 131
    .line 132
    const v16, 0x3f4a3d71    # 0.79f

    .line 133
    .line 134
    .line 135
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 136
    .line 137
    .line 138
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 139
    .line 140
    .line 141
    const/high16 v0, 0x41800000    # 16.0f

    .line 142
    .line 143
    const/high16 v2, 0x40c00000    # 6.0f

    .line 144
    .line 145
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 146
    .line 147
    .line 148
    const/high16 v0, 0x40e00000    # 7.0f

    .line 149
    .line 150
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 151
    .line 152
    .line 153
    const/high16 v0, 0x40800000    # 4.0f

    .line 154
    .line 155
    const/high16 v2, 0x40e00000    # 7.0f

    .line 156
    .line 157
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 158
    .line 159
    .line 160
    const/high16 v0, 0x41100000    # 9.0f

    .line 161
    .line 162
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 163
    .line 164
    .line 165
    const/high16 v17, 0x40a00000    # 5.0f

    .line 166
    .line 167
    const/high16 v18, 0x40a00000    # 5.0f

    .line 168
    .line 169
    const/4 v13, 0x0

    .line 170
    const v14, 0x4030a3d7    # 2.76f

    .line 171
    .line 172
    .line 173
    const v15, 0x400f5c29    # 2.24f

    .line 174
    .line 175
    .line 176
    const/high16 v16, 0x40a00000    # 5.0f

    .line 177
    .line 178
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 179
    .line 180
    .line 181
    const/high16 v0, 0x40c00000    # 6.0f

    .line 182
    .line 183
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 184
    .line 185
    .line 186
    const/high16 v0, -0x40000000    # -2.0f

    .line 187
    .line 188
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 189
    .line 190
    .line 191
    const/high16 v0, 0x41980000    # 19.0f

    .line 192
    .line 193
    const/high16 v2, 0x41100000    # 9.0f

    .line 194
    .line 195
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 196
    .line 197
    .line 198
    const/high16 v17, -0x3fc00000    # -3.0f

    .line 199
    .line 200
    const/high16 v18, -0x3fc00000    # -3.0f

    .line 201
    .line 202
    const v13, -0x402b851f    # -1.66f

    .line 203
    .line 204
    .line 205
    const/4 v14, 0x0

    .line 206
    const/high16 v15, -0x3fc00000    # -3.0f

    .line 207
    .line 208
    const v16, -0x40547ae1    # -1.34f

    .line 209
    .line 210
    .line 211
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 212
    .line 213
    .line 214
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 215
    .line 216
    .line 217
    const v0, 0x41a08f5c    # 20.07f

    .line 218
    .line 219
    .line 220
    const/high16 v2, 0x41a00000    # 20.0f

    .line 221
    .line 222
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 223
    .line 224
    .line 225
    const v0, 0x416ee148    # 14.93f

    .line 226
    .line 227
    .line 228
    const/high16 v2, 0x41700000    # 15.0f

    .line 229
    .line 230
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 231
    .line 232
    .line 233
    const/high16 v0, 0x41380000    # 11.5f

    .line 234
    .line 235
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 236
    .line 237
    .line 238
    const v0, -0x3f947ae1    # -3.68f

    .line 239
    .line 240
    .line 241
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 242
    .line 243
    .line 244
    const/high16 v17, 0x40b00000    # 5.5f

    .line 245
    .line 246
    const v18, 0x400a3d71    # 2.16f

    .line 247
    .line 248
    .line 249
    const v13, 0x3fb33333    # 1.4f

    .line 250
    .line 251
    .line 252
    const v14, 0x3f933333    # 1.15f

    .line 253
    .line 254
    .line 255
    const v15, 0x40666666    # 3.6f

    .line 256
    .line 257
    .line 258
    const v16, 0x400a3d71    # 2.16f

    .line 259
    .line 260
    .line 261
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 262
    .line 263
    .line 264
    const v0, -0x3ff5c28f    # -2.16f

    .line 265
    .line 266
    .line 267
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 268
    .line 269
    .line 270
    const v17, -0x3f6a8f5c    # -4.67f

    .line 271
    .line 272
    .line 273
    const v18, -0x3ffd70a4    # -2.04f

    .line 274
    .line 275
    .line 276
    const v13, -0x402b851f    # -1.66f

    .line 277
    .line 278
    .line 279
    const v14, 0x3ca3d70a    # 0.02f

    .line 280
    .line 281
    .line 282
    const v15, -0x3f98f5c3    # -3.61f

    .line 283
    .line 284
    .line 285
    const v16, -0x40a147ae    # -0.87f

    .line 286
    .line 287
    .line 288
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 289
    .line 290
    .line 291
    const v0, -0x404ccccd    # -1.4f

    .line 292
    .line 293
    .line 294
    const v2, -0x4039999a    # -1.55f

    .line 295
    .line 296
    .line 297
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 298
    .line 299
    .line 300
    const v17, -0x40cf5c29    # -0.69f

    .line 301
    .line 302
    .line 303
    const/high16 v18, -0x41000000    # -0.5f

    .line 304
    .line 305
    const v13, -0x41bd70a4    # -0.19f

    .line 306
    .line 307
    .line 308
    const v14, -0x41a8f5c3    # -0.21f

    .line 309
    .line 310
    .line 311
    const v15, -0x4123d70a    # -0.43f

    .line 312
    .line 313
    .line 314
    const v16, -0x413d70a4    # -0.38f

    .line 315
    .line 316
    .line 317
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 318
    .line 319
    .line 320
    const v17, -0x408a3d71    # -0.96f

    .line 321
    .line 322
    .line 323
    const v18, -0x41947ae1    # -0.23f

    .line 324
    .line 325
    .line 326
    const v13, -0x416b851f    # -0.29f

    .line 327
    .line 328
    .line 329
    const v14, -0x41f0a3d7    # -0.14f

    .line 330
    .line 331
    .line 332
    const v15, -0x40e147ae    # -0.62f

    .line 333
    .line 334
    .line 335
    const v16, -0x41947ae1    # -0.23f

    .line 336
    .line 337
    .line 338
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 339
    .line 340
    .line 341
    const v0, -0x430a3d71    # -0.03f

    .line 342
    .line 343
    .line 344
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 345
    .line 346
    .line 347
    const/high16 v17, 0x40e00000    # 7.0f

    .line 348
    .line 349
    const/high16 v18, 0x41140000    # 9.25f

    .line 350
    .line 351
    const v13, 0x410028f6    # 8.01f

    .line 352
    .line 353
    .line 354
    const/high16 v14, 0x40e00000    # 7.0f

    .line 355
    .line 356
    const/high16 v15, 0x40e00000    # 7.0f

    .line 357
    .line 358
    const v16, 0x410028f6    # 8.01f

    .line 359
    .line 360
    .line 361
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 362
    .line 363
    .line 364
    const/high16 v0, 0x41700000    # 15.0f

    .line 365
    .line 366
    const/high16 v2, 0x40e00000    # 7.0f

    .line 367
    .line 368
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 369
    .line 370
    .line 371
    const/high16 v17, 0x40400000    # 3.0f

    .line 372
    .line 373
    const/high16 v18, 0x40400000    # 3.0f

    .line 374
    .line 375
    const/4 v13, 0x0

    .line 376
    const v14, 0x3fd47ae1    # 1.66f

    .line 377
    .line 378
    .line 379
    const v15, 0x3fab851f    # 1.34f

    .line 380
    .line 381
    .line 382
    const/high16 v16, 0x40400000    # 3.0f

    .line 383
    .line 384
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 385
    .line 386
    .line 387
    const v0, 0x40a23d71    # 5.07f

    .line 388
    .line 389
    .line 390
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 391
    .line 392
    .line 393
    const/high16 v0, 0x40600000    # 3.5f

    .line 394
    .line 395
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 396
    .line 397
    .line 398
    const v0, 0x41a08f5c    # 20.07f

    .line 399
    .line 400
    .line 401
    const/high16 v2, 0x41a00000    # 20.0f

    .line 402
    .line 403
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 404
    .line 405
    .line 406
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 407
    .line 408
    .line 409
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 410
    .line 411
    .line 412
    move-result-object v2

    .line 413
    const/16 v16, 0x3800

    .line 414
    .line 415
    const/16 v17, 0x0

    .line 416
    .line 417
    const/high16 v6, 0x3f800000    # 1.0f

    .line 418
    .line 419
    const/high16 v8, 0x3f800000    # 1.0f

    .line 420
    .line 421
    const/4 v7, 0x0

    .line 422
    const/high16 v9, 0x3f800000    # 1.0f

    .line 423
    .line 424
    const/high16 v12, 0x3f800000    # 1.0f

    .line 425
    .line 426
    const/4 v14, 0x0

    .line 427
    const/4 v15, 0x0

    .line 428
    const-string v4, ""

    .line 429
    .line 430
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 431
    .line 432
    .line 433
    move-result-object v0

    .line 434
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 435
    .line 436
    .line 437
    move-result-object v0

    .line 438
    sput-object v0, Landroidx/compose/material/icons/twotone/AirlineSeatReclineNormalKt;->_airlineSeatReclineNormal:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 439
    .line 440
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 441
    .line 442
    .line 443
    return-object v0
.end method
