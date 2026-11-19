.class public final Landroidx/compose/material/icons/outlined/SatelliteAltKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_satelliteAlt",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "SatelliteAlt",
        "Landroidx/compose/material/icons/Icons$Outlined;",
        "getSatelliteAlt",
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
        "SMAP\nSatelliteAlt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SatelliteAlt.kt\nandroidx/compose/material/icons/outlined/SatelliteAltKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,113:1\n212#2,12:114\n233#2,18:127\n253#2:164\n174#3:126\n705#4,2:145\n717#4,2:147\n719#4,11:153\n72#5,4:149\n*S KotlinDebug\n*F\n+ 1 SatelliteAlt.kt\nandroidx/compose/material/icons/outlined/SatelliteAltKt\n*L\n29#1:114,12\n30#1:127,18\n30#1:164\n29#1:126\n30#1:145,2\n30#1:147,2\n30#1:153,11\n30#1:149,4\n*E\n"
    }
.end annotation


# static fields
.field private static _satelliteAlt:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getSatelliteAlt(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/outlined/SatelliteAltKt;->_satelliteAlt:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Outlined.SatelliteAlt"

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
    const/high16 v0, 0x41a80000    # 21.0f

    .line 71
    .line 72
    const/high16 v2, 0x41600000    # 14.0f

    .line 73
    .line 74
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/4 v0, 0x0

    .line 78
    const/high16 v2, 0x40000000    # 2.0f

    .line 79
    .line 80
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 81
    .line 82
    .line 83
    const/high16 v17, -0x3ef00000    # -9.0f

    .line 84
    .line 85
    const/high16 v18, 0x41100000    # 9.0f

    .line 86
    .line 87
    const/4 v13, 0x0

    .line 88
    const v14, 0x409f0a3d    # 4.97f

    .line 89
    .line 90
    .line 91
    const v15, -0x3f7f0a3d    # -4.03f

    .line 92
    .line 93
    .line 94
    const/high16 v16, 0x41100000    # 9.0f

    .line 95
    .line 96
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 97
    .line 98
    .line 99
    const/high16 v0, -0x40000000    # -2.0f

    .line 100
    .line 101
    const/4 v2, 0x0

    .line 102
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 103
    .line 104
    .line 105
    const/high16 v17, 0x41a80000    # 21.0f

    .line 106
    .line 107
    const/high16 v18, 0x41600000    # 14.0f

    .line 108
    .line 109
    const v13, 0x418ef5c3    # 17.87f

    .line 110
    .line 111
    .line 112
    const/high16 v14, 0x41a80000    # 21.0f

    .line 113
    .line 114
    const/high16 v15, 0x41a80000    # 21.0f

    .line 115
    .line 116
    const v16, 0x418ef5c3    # 17.87f

    .line 117
    .line 118
    .line 119
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 120
    .line 121
    .line 122
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 123
    .line 124
    .line 125
    const/high16 v0, 0x41880000    # 17.0f

    .line 126
    .line 127
    const/high16 v2, 0x41600000    # 14.0f

    .line 128
    .line 129
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 130
    .line 131
    .line 132
    const/4 v0, 0x0

    .line 133
    const/high16 v2, 0x40000000    # 2.0f

    .line 134
    .line 135
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 136
    .line 137
    .line 138
    const/high16 v17, 0x40a00000    # 5.0f

    .line 139
    .line 140
    const/high16 v18, -0x3f600000    # -5.0f

    .line 141
    .line 142
    const v13, 0x4030a3d7    # 2.76f

    .line 143
    .line 144
    .line 145
    const/4 v14, 0x0

    .line 146
    const/high16 v15, 0x40a00000    # 5.0f

    .line 147
    .line 148
    const v16, -0x3ff0a3d7    # -2.24f

    .line 149
    .line 150
    .line 151
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 152
    .line 153
    .line 154
    const/high16 v0, -0x40000000    # -2.0f

    .line 155
    .line 156
    const/4 v2, 0x0

    .line 157
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 158
    .line 159
    .line 160
    const/high16 v17, 0x41600000    # 14.0f

    .line 161
    .line 162
    const/high16 v18, 0x41880000    # 17.0f

    .line 163
    .line 164
    const/high16 v13, 0x41880000    # 17.0f

    .line 165
    .line 166
    const v14, 0x417a8f5c    # 15.66f

    .line 167
    .line 168
    .line 169
    const v15, 0x417a8f5c    # 15.66f

    .line 170
    .line 171
    .line 172
    const/high16 v16, 0x41880000    # 17.0f

    .line 173
    .line 174
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 175
    .line 176
    .line 177
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 178
    .line 179
    .line 180
    const v0, 0x4192147b    # 18.26f

    .line 181
    .line 182
    .line 183
    const v2, 0x3f170a3d    # 0.59f

    .line 184
    .line 185
    .line 186
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 187
    .line 188
    .line 189
    const v0, 0x40628f5c    # 3.54f

    .line 190
    .line 191
    .line 192
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 193
    .line 194
    .line 195
    const/16 v17, 0x0

    .line 196
    .line 197
    const v18, 0x40351eb8    # 2.83f

    .line 198
    .line 199
    .line 200
    const v13, 0x3f47ae14    # 0.78f

    .line 201
    .line 202
    .line 203
    const v14, 0x3f47ae14    # 0.78f

    .line 204
    .line 205
    .line 206
    const v15, 0x3f47ae14    # 0.78f

    .line 207
    .line 208
    .line 209
    const v16, 0x40033333    # 2.05f

    .line 210
    .line 211
    .line 212
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 213
    .line 214
    .line 215
    const v0, 0x404b851f    # 3.18f

    .line 216
    .line 217
    .line 218
    const v2, -0x3fb47ae1    # -3.18f

    .line 219
    .line 220
    .line 221
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 222
    .line 223
    .line 224
    const v17, -0x3fcae148    # -2.83f

    .line 225
    .line 226
    .line 227
    const/16 v18, 0x0

    .line 228
    .line 229
    const v13, -0x40b851ec    # -0.78f

    .line 230
    .line 231
    .line 232
    const v15, -0x3ffccccd    # -2.05f

    .line 233
    .line 234
    .line 235
    const v16, 0x3f47ae14    # 0.78f

    .line 236
    .line 237
    .line 238
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 239
    .line 240
    .line 241
    const v0, -0x406147ae    # -1.24f

    .line 242
    .line 243
    .line 244
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 245
    .line 246
    .line 247
    const v0, 0x4119999a    # 9.6f

    .line 248
    .line 249
    .line 250
    const v2, 0x415d70a4    # 13.84f

    .line 251
    .line 252
    .line 253
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 254
    .line 255
    .line 256
    const v0, 0x3f9eb852    # 1.24f

    .line 257
    .line 258
    .line 259
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 260
    .line 261
    .line 262
    const/16 v17, 0x0

    .line 263
    .line 264
    const v18, 0x40351eb8    # 2.83f

    .line 265
    .line 266
    .line 267
    const v13, 0x3f47ae14    # 0.78f

    .line 268
    .line 269
    .line 270
    const v15, 0x3f47ae14    # 0.78f

    .line 271
    .line 272
    .line 273
    const v16, 0x40033333    # 2.05f

    .line 274
    .line 275
    .line 276
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 277
    .line 278
    .line 279
    const v0, 0x3fb47ae1    # 1.41f

    .line 280
    .line 281
    .line 282
    const v2, -0x404b851f    # -1.41f

    .line 283
    .line 284
    .line 285
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 286
    .line 287
    .line 288
    const v17, -0x3fcae148    # -2.83f

    .line 289
    .line 290
    .line 291
    const/16 v18, 0x0

    .line 292
    .line 293
    const v13, -0x40b851ec    # -0.78f

    .line 294
    .line 295
    .line 296
    const v15, -0x3ffccccd    # -2.05f

    .line 297
    .line 298
    .line 299
    const v16, 0x3f47ae14    # 0.78f

    .line 300
    .line 301
    .line 302
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 303
    .line 304
    .line 305
    const v0, 0x4119999a    # 9.6f

    .line 306
    .line 307
    .line 308
    const v2, 0x415d70a4    # 13.84f

    .line 309
    .line 310
    .line 311
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 312
    .line 313
    .line 314
    const v0, 0x3f35c28f    # 0.71f

    .line 315
    .line 316
    .line 317
    const v2, -0x40ca3d71    # -0.71f

    .line 318
    .line 319
    .line 320
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 321
    .line 322
    .line 323
    const v0, 0x3f9eb852    # 1.24f

    .line 324
    .line 325
    .line 326
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 327
    .line 328
    .line 329
    const/16 v17, 0x0

    .line 330
    .line 331
    const v18, 0x40351eb8    # 2.83f

    .line 332
    .line 333
    .line 334
    const v13, 0x3f47ae14    # 0.78f

    .line 335
    .line 336
    .line 337
    const v15, 0x3f47ae14    # 0.78f

    .line 338
    .line 339
    .line 340
    const v16, 0x40033333    # 2.05f

    .line 341
    .line 342
    .line 343
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 344
    .line 345
    .line 346
    const v0, 0x40de6666    # 6.95f

    .line 347
    .line 348
    .line 349
    const v2, 0x41ae6666    # 21.8f

    .line 350
    .line 351
    .line 352
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 353
    .line 354
    .line 355
    const v17, -0x3fcae148    # -2.83f

    .line 356
    .line 357
    .line 358
    const/16 v18, 0x0

    .line 359
    .line 360
    const v13, -0x40b851ec    # -0.78f

    .line 361
    .line 362
    .line 363
    const v15, -0x3ffccccd    # -2.05f

    .line 364
    .line 365
    .line 366
    const v16, 0x3f47ae14    # 0.78f

    .line 367
    .line 368
    .line 369
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 370
    .line 371
    .line 372
    const v0, -0x3f9d70a4    # -3.54f

    .line 373
    .line 374
    .line 375
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 376
    .line 377
    .line 378
    const/16 v17, 0x0

    .line 379
    .line 380
    const v18, -0x3fcae148    # -2.83f

    .line 381
    .line 382
    .line 383
    const v14, -0x40b851ec    # -0.78f

    .line 384
    .line 385
    .line 386
    const v15, -0x40b851ec    # -0.78f

    .line 387
    .line 388
    .line 389
    const v16, -0x3ffccccd    # -2.05f

    .line 390
    .line 391
    .line 392
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 393
    .line 394
    .line 395
    const v0, 0x404b851f    # 3.18f

    .line 396
    .line 397
    .line 398
    const v2, -0x3fb47ae1    # -3.18f

    .line 399
    .line 400
    .line 401
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 402
    .line 403
    .line 404
    const v17, 0x40351eb8    # 2.83f

    .line 405
    .line 406
    .line 407
    const/16 v18, 0x0

    .line 408
    .line 409
    const v13, 0x3f47ae14    # 0.78f

    .line 410
    .line 411
    .line 412
    const v15, 0x40033333    # 2.05f

    .line 413
    .line 414
    .line 415
    const v16, -0x40b851ec    # -0.78f

    .line 416
    .line 417
    .line 418
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 419
    .line 420
    .line 421
    const v0, 0x3f9eb852    # 1.24f

    .line 422
    .line 423
    .line 424
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 425
    .line 426
    .line 427
    const v0, 0x3f35c28f    # 0.71f

    .line 428
    .line 429
    .line 430
    const v2, -0x40ca3d71    # -0.71f

    .line 431
    .line 432
    .line 433
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 434
    .line 435
    .line 436
    const v0, 0x4138cccd    # 11.55f

    .line 437
    .line 438
    .line 439
    const v2, 0x40e9999a    # 7.3f

    .line 440
    .line 441
    .line 442
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 443
    .line 444
    .line 445
    const/16 v17, 0x0

    .line 446
    .line 447
    const v18, -0x3fcae148    # -2.83f

    .line 448
    .line 449
    .line 450
    const v13, -0x40b851ec    # -0.78f

    .line 451
    .line 452
    .line 453
    const v15, -0x40b851ec    # -0.78f

    .line 454
    .line 455
    .line 456
    const v16, -0x3ffccccd    # -2.05f

    .line 457
    .line 458
    .line 459
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 460
    .line 461
    .line 462
    const v0, 0x40e9999a    # 7.3f

    .line 463
    .line 464
    .line 465
    const v2, 0x410b851f    # 8.72f

    .line 466
    .line 467
    .line 468
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 469
    .line 470
    .line 471
    const v17, 0x40351eb8    # 2.83f

    .line 472
    .line 473
    .line 474
    const/16 v18, 0x0

    .line 475
    .line 476
    const v13, 0x3f47ae14    # 0.78f

    .line 477
    .line 478
    .line 479
    const v15, 0x40033333    # 2.05f

    .line 480
    .line 481
    .line 482
    const v16, -0x40b851ec    # -0.78f

    .line 483
    .line 484
    .line 485
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 486
    .line 487
    .line 488
    const v0, 0x3f9eb852    # 1.24f

    .line 489
    .line 490
    .line 491
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 492
    .line 493
    .line 494
    const v0, 0x3f35c28f    # 0.71f

    .line 495
    .line 496
    .line 497
    const v2, -0x40ca3d71    # -0.71f

    .line 498
    .line 499
    .line 500
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 501
    .line 502
    .line 503
    const/high16 v0, 0x41440000    # 12.25f

    .line 504
    .line 505
    const v2, 0x40d33333    # 6.6f

    .line 506
    .line 507
    .line 508
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 509
    .line 510
    .line 511
    const/16 v17, 0x0

    .line 512
    .line 513
    const v18, -0x3fcae148    # -2.83f

    .line 514
    .line 515
    .line 516
    const v13, -0x40b851ec    # -0.78f

    .line 517
    .line 518
    .line 519
    const v15, -0x40b851ec    # -0.78f

    .line 520
    .line 521
    .line 522
    const v16, -0x3ffccccd    # -2.05f

    .line 523
    .line 524
    .line 525
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 526
    .line 527
    .line 528
    const v0, 0x404b851f    # 3.18f

    .line 529
    .line 530
    .line 531
    const v2, -0x3fb47ae1    # -3.18f

    .line 532
    .line 533
    .line 534
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 535
    .line 536
    .line 537
    const v17, 0x4192147b    # 18.26f

    .line 538
    .line 539
    .line 540
    const v18, 0x3f170a3d    # 0.59f

    .line 541
    .line 542
    .line 543
    const v13, 0x4181c28f    # 16.22f

    .line 544
    .line 545
    .line 546
    const v14, -0x41b33333    # -0.2f

    .line 547
    .line 548
    .line 549
    const v15, 0x418bd70a    # 17.48f

    .line 550
    .line 551
    .line 552
    const v16, -0x41b33333    # -0.2f

    .line 553
    .line 554
    .line 555
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 556
    .line 557
    .line 558
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 559
    .line 560
    .line 561
    const v0, 0x4043d70a    # 3.06f

    .line 562
    .line 563
    .line 564
    const v2, 0x417ca3d7    # 15.79f

    .line 565
    .line 566
    .line 567
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 568
    .line 569
    .line 570
    const v0, 0x4186cccd    # 16.85f

    .line 571
    .line 572
    .line 573
    const/high16 v2, 0x40000000    # 2.0f

    .line 574
    .line 575
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 576
    .line 577
    .line 578
    const v0, 0x40628f5c    # 3.54f

    .line 579
    .line 580
    .line 581
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 582
    .line 583
    .line 584
    const v0, -0x407851ec    # -1.06f

    .line 585
    .line 586
    .line 587
    const v2, 0x3f87ae14    # 1.06f

    .line 588
    .line 589
    .line 590
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 591
    .line 592
    .line 593
    const v0, 0x4043d70a    # 3.06f

    .line 594
    .line 595
    .line 596
    const v2, 0x417ca3d7    # 15.79f

    .line 597
    .line 598
    .line 599
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 600
    .line 601
    .line 602
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 603
    .line 604
    .line 605
    const v0, 0x40a5c28f    # 5.18f

    .line 606
    .line 607
    .line 608
    const v2, 0x415ab852    # 13.67f

    .line 609
    .line 610
    .line 611
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 612
    .line 613
    .line 614
    const v0, -0x407851ec    # -1.06f

    .line 615
    .line 616
    .line 617
    const v2, 0x3f87ae14    # 1.06f

    .line 618
    .line 619
    .line 620
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 621
    .line 622
    .line 623
    const v0, 0x40628f5c    # 3.54f

    .line 624
    .line 625
    .line 626
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 627
    .line 628
    .line 629
    const v0, -0x407851ec    # -1.06f

    .line 630
    .line 631
    .line 632
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 633
    .line 634
    .line 635
    const v0, 0x40a5c28f    # 5.18f

    .line 636
    .line 637
    .line 638
    const v2, 0x415ab852    # 13.67f

    .line 639
    .line 640
    .line 641
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 642
    .line 643
    .line 644
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 645
    .line 646
    .line 647
    const v0, 0x4122147b    # 10.13f

    .line 648
    .line 649
    .line 650
    const v2, 0x410b851f    # 8.72f

    .line 651
    .line 652
    .line 653
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 654
    .line 655
    .line 656
    const v0, 0x3fb47ae1    # 1.41f

    .line 657
    .line 658
    .line 659
    const v2, -0x404b851f    # -1.41f

    .line 660
    .line 661
    .line 662
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 663
    .line 664
    .line 665
    const v0, 0x40628f5c    # 3.54f

    .line 666
    .line 667
    .line 668
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 669
    .line 670
    .line 671
    const v0, 0x3fb47ae1    # 1.41f

    .line 672
    .line 673
    .line 674
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 675
    .line 676
    .line 677
    const v0, 0x4122147b    # 10.13f

    .line 678
    .line 679
    .line 680
    const v2, 0x410b851f    # 8.72f

    .line 681
    .line 682
    .line 683
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 684
    .line 685
    .line 686
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 687
    .line 688
    .line 689
    const v0, 0x416bae14    # 14.73f

    .line 690
    .line 691
    .line 692
    const v2, 0x4083d70a    # 4.12f

    .line 693
    .line 694
    .line 695
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 696
    .line 697
    .line 698
    const v0, -0x407851ec    # -1.06f

    .line 699
    .line 700
    .line 701
    const v2, 0x3f87ae14    # 1.06f

    .line 702
    .line 703
    .line 704
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 705
    .line 706
    .line 707
    const v0, 0x40628f5c    # 3.54f

    .line 708
    .line 709
    .line 710
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 711
    .line 712
    .line 713
    const v0, -0x407851ec    # -1.06f

    .line 714
    .line 715
    .line 716
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 717
    .line 718
    .line 719
    const v0, 0x416bae14    # 14.73f

    .line 720
    .line 721
    .line 722
    const v2, 0x4083d70a    # 4.12f

    .line 723
    .line 724
    .line 725
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 726
    .line 727
    .line 728
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 729
    .line 730
    .line 731
    const v0, 0x4186cccd    # 16.85f

    .line 732
    .line 733
    .line 734
    const/high16 v2, 0x40000000    # 2.0f

    .line 735
    .line 736
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 737
    .line 738
    .line 739
    const v0, -0x407851ec    # -1.06f

    .line 740
    .line 741
    .line 742
    const v2, 0x3f87ae14    # 1.06f

    .line 743
    .line 744
    .line 745
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 746
    .line 747
    .line 748
    const v0, 0x40628f5c    # 3.54f

    .line 749
    .line 750
    .line 751
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 752
    .line 753
    .line 754
    const v0, -0x407851ec    # -1.06f

    .line 755
    .line 756
    .line 757
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 758
    .line 759
    .line 760
    const v0, 0x4186cccd    # 16.85f

    .line 761
    .line 762
    .line 763
    const/high16 v2, 0x40000000    # 2.0f

    .line 764
    .line 765
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 766
    .line 767
    .line 768
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 769
    .line 770
    .line 771
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 772
    .line 773
    .line 774
    move-result-object v2

    .line 775
    const/16 v16, 0x3800

    .line 776
    .line 777
    const/16 v17, 0x0

    .line 778
    .line 779
    const/high16 v6, 0x3f800000    # 1.0f

    .line 780
    .line 781
    const/high16 v8, 0x3f800000    # 1.0f

    .line 782
    .line 783
    const/4 v7, 0x0

    .line 784
    const/high16 v9, 0x3f800000    # 1.0f

    .line 785
    .line 786
    const/high16 v12, 0x3f800000    # 1.0f

    .line 787
    .line 788
    const/4 v13, 0x0

    .line 789
    const/4 v14, 0x0

    .line 790
    const/4 v15, 0x0

    .line 791
    const-string v4, ""

    .line 792
    .line 793
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 794
    .line 795
    .line 796
    move-result-object v0

    .line 797
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 798
    .line 799
    .line 800
    move-result-object v0

    .line 801
    sput-object v0, Landroidx/compose/material/icons/outlined/SatelliteAltKt;->_satelliteAlt:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 802
    .line 803
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 804
    .line 805
    .line 806
    return-object v0
.end method
