.class public final Landroidx/compose/material/icons/rounded/BedtimeOffKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_bedtimeOff",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "BedtimeOff",
        "Landroidx/compose/material/icons/Icons$Rounded;",
        "getBedtimeOff",
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
        "SMAP\nBedtimeOff.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BedtimeOff.kt\nandroidx/compose/material/icons/rounded/BedtimeOffKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,59:1\n212#2,12:60\n233#2,18:73\n253#2:110\n233#2,18:111\n253#2:148\n174#3:72\n705#4,2:91\n717#4,2:93\n719#4,11:99\n705#4,2:129\n717#4,2:131\n719#4,11:137\n72#5,4:95\n72#5,4:133\n*S KotlinDebug\n*F\n+ 1 BedtimeOff.kt\nandroidx/compose/material/icons/rounded/BedtimeOffKt\n*L\n29#1:60,12\n30#1:73,18\n30#1:110\n38#1:111,18\n38#1:148\n29#1:72\n30#1:91,2\n30#1:93,2\n30#1:99,11\n38#1:129,2\n38#1:131,2\n38#1:137,11\n30#1:95,4\n38#1:133,4\n*E\n"
    }
.end annotation


# static fields
.field private static _bedtimeOff:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getBedtimeOff(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/BedtimeOffKt;->_bedtimeOff:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.BedtimeOff"

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
    const v4, 0x413a6666    # 11.65f

    .line 71
    .line 72
    .line 73
    const v6, 0x405d70a4    # 3.46f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v25, -0x4070a3d7    # -1.12f

    .line 80
    .line 81
    .line 82
    const v26, -0x40547ae1    # -1.34f

    .line 83
    .line 84
    .line 85
    const v21, 0x3e8a3d71    # 0.27f

    .line 86
    .line 87
    .line 88
    const v22, -0x40ca3d71    # -0.71f

    .line 89
    .line 90
    .line 91
    const v23, -0x4147ae14    # -0.36f

    .line 92
    .line 93
    .line 94
    const v24, -0x40466666    # -1.45f

    .line 95
    .line 96
    .line 97
    move-object/from16 v20, v2

    .line 98
    .line 99
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 100
    .line 101
    .line 102
    const v25, 0x40cfae14    # 6.49f

    .line 103
    .line 104
    .line 105
    const v26, 0x406a3d71    # 3.66f

    .line 106
    .line 107
    .line 108
    const v21, 0x4110cccd    # 9.05f

    .line 109
    .line 110
    .line 111
    const v22, 0x40151eb8    # 2.33f

    .line 112
    .line 113
    .line 114
    const v23, 0x40f5c28f    # 7.68f

    .line 115
    .line 116
    .line 117
    const v24, 0x403851ec    # 2.88f

    .line 118
    .line 119
    .line 120
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 121
    .line 122
    .line 123
    const v4, 0x4092e148    # 4.59f

    .line 124
    .line 125
    .line 126
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 127
    .line 128
    .line 129
    const v25, 0x413a6666    # 11.65f

    .line 130
    .line 131
    .line 132
    const v26, 0x405d70a4    # 3.46f

    .line 133
    .line 134
    .line 135
    const v21, 0x412e147b    # 10.88f

    .line 136
    .line 137
    .line 138
    const v22, 0x40d6147b    # 6.69f

    .line 139
    .line 140
    .line 141
    const v23, 0x4130a3d7    # 11.04f

    .line 142
    .line 143
    .line 144
    const v24, 0x40a1999a    # 5.05f

    .line 145
    .line 146
    .line 147
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 148
    .line 149
    .line 150
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 151
    .line 152
    .line 153
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 154
    .line 155
    .line 156
    move-result-object v2

    .line 157
    const/16 v16, 0x3800

    .line 158
    .line 159
    const/16 v17, 0x0

    .line 160
    .line 161
    const/high16 v6, 0x3f800000    # 1.0f

    .line 162
    .line 163
    const/high16 v8, 0x3f800000    # 1.0f

    .line 164
    .line 165
    const/4 v7, 0x0

    .line 166
    const/high16 v9, 0x3f800000    # 1.0f

    .line 167
    .line 168
    const/high16 v12, 0x3f800000    # 1.0f

    .line 169
    .line 170
    const/4 v13, 0x0

    .line 171
    const/4 v14, 0x0

    .line 172
    const/4 v15, 0x0

    .line 173
    const-string v4, ""

    .line 174
    .line 175
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 176
    .line 177
    .line 178
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 179
    .line 180
    .line 181
    move-result v3

    .line 182
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 183
    .line 184
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 185
    .line 186
    .line 187
    move-result-wide v6

    .line 188
    const/4 v0, 0x0

    .line 189
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 190
    .line 191
    .line 192
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 193
    .line 194
    .line 195
    move-result v10

    .line 196
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 197
    .line 198
    .line 199
    move-result v11

    .line 200
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 201
    .line 202
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 203
    .line 204
    .line 205
    const v0, 0x40066666    # 2.1f

    .line 206
    .line 207
    .line 208
    const v2, 0x4060a3d7    # 3.51f

    .line 209
    .line 210
    .line 211
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 212
    .line 213
    .line 214
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 215
    .line 216
    .line 217
    const/16 v17, 0x0

    .line 218
    .line 219
    const v18, 0x3fb47ae1    # 1.41f

    .line 220
    .line 221
    .line 222
    const v13, -0x413851ec    # -0.39f

    .line 223
    .line 224
    .line 225
    const v14, 0x3ec7ae14    # 0.39f

    .line 226
    .line 227
    .line 228
    const v15, -0x413851ec    # -0.39f

    .line 229
    .line 230
    .line 231
    const v16, 0x3f828f5c    # 1.02f

    .line 232
    .line 233
    .line 234
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 235
    .line 236
    .line 237
    const v0, 0x3fc7ae14    # 1.56f

    .line 238
    .line 239
    .line 240
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 241
    .line 242
    .line 243
    const v17, -0x40451eb8    # -1.46f

    .line 244
    .line 245
    .line 246
    const v18, 0x40f1eb85    # 7.56f

    .line 247
    .line 248
    .line 249
    const v13, -0x404ccccd    # -1.4f

    .line 250
    .line 251
    .line 252
    const v14, 0x40070a3d    # 2.11f

    .line 253
    .line 254
    .line 255
    const v15, -0x3ffeb852    # -2.02f

    .line 256
    .line 257
    .line 258
    const v16, 0x4098a3d7    # 4.77f

    .line 259
    .line 260
    .line 261
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 262
    .line 263
    .line 264
    const v17, 0x40fe147b    # 7.94f

    .line 265
    .line 266
    .line 267
    const v18, 0x40f8f5c3    # 7.78f

    .line 268
    .line 269
    .line 270
    const v13, 0x3f4a3d71    # 0.79f

    .line 271
    .line 272
    .line 273
    const v14, 0x407c28f6    # 3.94f

    .line 274
    .line 275
    .line 276
    const v15, 0x407f5c29    # 3.99f

    .line 277
    .line 278
    .line 279
    const v16, 0x40e23d71    # 7.07f

    .line 280
    .line 281
    .line 282
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 283
    .line 284
    .line 285
    const v17, 0x40eb3333    # 7.35f

    .line 286
    .line 287
    .line 288
    const v18, -0x403eb852    # -1.51f

    .line 289
    .line 290
    .line 291
    const v13, 0x402f5c29    # 2.74f

    .line 292
    .line 293
    .line 294
    const v14, 0x3efae148    # 0.49f

    .line 295
    .line 296
    .line 297
    const v15, 0x40a9999a    # 5.3f

    .line 298
    .line 299
    .line 300
    const v16, -0x41e66666    # -0.15f

    .line 301
    .line 302
    .line 303
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 304
    .line 305
    .line 306
    const v0, 0x3fc8f5c3    # 1.57f

    .line 307
    .line 308
    .line 309
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 310
    .line 311
    .line 312
    const v17, 0x3fb47ae1    # 1.41f

    .line 313
    .line 314
    .line 315
    const/16 v18, 0x0

    .line 316
    .line 317
    const v13, 0x3ec7ae14    # 0.39f

    .line 318
    .line 319
    .line 320
    const v14, 0x3ec7ae14    # 0.39f

    .line 321
    .line 322
    .line 323
    const v15, 0x3f828f5c    # 1.02f

    .line 324
    .line 325
    .line 326
    const v16, 0x3ec7ae14    # 0.39f

    .line 327
    .line 328
    .line 329
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 330
    .line 331
    .line 332
    const/4 v0, 0x0

    .line 333
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 334
    .line 335
    .line 336
    const/16 v17, 0x0

    .line 337
    .line 338
    const v18, -0x404b851f    # -1.41f

    .line 339
    .line 340
    .line 341
    const v14, -0x413851ec    # -0.39f

    .line 342
    .line 343
    .line 344
    const v15, 0x3ec7ae14    # 0.39f

    .line 345
    .line 346
    .line 347
    const v16, -0x407d70a4    # -1.02f

    .line 348
    .line 349
    .line 350
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 351
    .line 352
    .line 353
    const v0, 0x4060a3d7    # 3.51f

    .line 354
    .line 355
    .line 356
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 357
    .line 358
    .line 359
    const v17, 0x40066666    # 2.1f

    .line 360
    .line 361
    .line 362
    const v18, 0x4060a3d7    # 3.51f

    .line 363
    .line 364
    .line 365
    const v13, 0x4047ae14    # 3.12f

    .line 366
    .line 367
    .line 368
    const v14, 0x4047ae14    # 3.12f

    .line 369
    .line 370
    .line 371
    const v15, 0x401f5c29    # 2.49f

    .line 372
    .line 373
    .line 374
    const v16, 0x4047ae14    # 3.12f

    .line 375
    .line 376
    .line 377
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 378
    .line 379
    .line 380
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 381
    .line 382
    .line 383
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 384
    .line 385
    .line 386
    move-result-object v2

    .line 387
    const/16 v16, 0x3800

    .line 388
    .line 389
    const/16 v17, 0x0

    .line 390
    .line 391
    const/high16 v6, 0x3f800000    # 1.0f

    .line 392
    .line 393
    const/4 v7, 0x0

    .line 394
    const/high16 v12, 0x3f800000    # 1.0f

    .line 395
    .line 396
    const/4 v13, 0x0

    .line 397
    const/4 v14, 0x0

    .line 398
    const/4 v15, 0x0

    .line 399
    const-string v4, ""

    .line 400
    .line 401
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 402
    .line 403
    .line 404
    move-result-object v0

    .line 405
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 406
    .line 407
    .line 408
    move-result-object v0

    .line 409
    sput-object v0, Landroidx/compose/material/icons/rounded/BedtimeOffKt;->_bedtimeOff:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 410
    .line 411
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 412
    .line 413
    .line 414
    return-object v0
.end method
