.class public final Landroidx/compose/material/icons/rounded/NotAccessibleKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_notAccessible",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "NotAccessible",
        "Landroidx/compose/material/icons/Icons$Rounded;",
        "getNotAccessible",
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
        "SMAP\nNotAccessible.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NotAccessible.kt\nandroidx/compose/material/icons/rounded/NotAccessibleKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,76:1\n212#2,12:77\n233#2,18:90\n253#2:127\n174#3:89\n705#4,2:108\n717#4,2:110\n719#4,11:116\n72#5,4:112\n*S KotlinDebug\n*F\n+ 1 NotAccessible.kt\nandroidx/compose/material/icons/rounded/NotAccessibleKt\n*L\n29#1:77,12\n30#1:90,18\n30#1:127\n29#1:89\n30#1:108,2\n30#1:110,2\n30#1:116,11\n30#1:112,4\n*E\n"
    }
.end annotation


# static fields
.field private static _notAccessible:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getNotAccessible(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/NotAccessibleKt;->_notAccessible:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.NotAccessible"

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
    const/high16 v0, 0x41400000    # 12.0f

    .line 71
    .line 72
    const/high16 v2, 0x40000000    # 2.0f

    .line 73
    .line 74
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v17, 0x40000000    # 2.0f

    .line 78
    .line 79
    const/high16 v18, 0x40000000    # 2.0f

    .line 80
    .line 81
    const v13, 0x3f8ccccd    # 1.1f

    .line 82
    .line 83
    .line 84
    const/4 v14, 0x0

    .line 85
    const/high16 v15, 0x40000000    # 2.0f

    .line 86
    .line 87
    const v16, 0x3f666666    # 0.9f

    .line 88
    .line 89
    .line 90
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 91
    .line 92
    .line 93
    const v0, -0x4099999a    # -0.9f

    .line 94
    .line 95
    .line 96
    const/high16 v2, -0x40000000    # -2.0f

    .line 97
    .line 98
    const/high16 v4, 0x40000000    # 2.0f

    .line 99
    .line 100
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 101
    .line 102
    .line 103
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 104
    .line 105
    .line 106
    const v0, 0x412e6666    # 10.9f

    .line 107
    .line 108
    .line 109
    const/high16 v2, 0x41400000    # 12.0f

    .line 110
    .line 111
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 112
    .line 113
    .line 114
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 115
    .line 116
    .line 117
    const/high16 v0, 0x41200000    # 10.0f

    .line 118
    .line 119
    const/high16 v2, 0x41a00000    # 20.0f

    .line 120
    .line 121
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 122
    .line 123
    .line 124
    const/high16 v17, -0x3fc00000    # -3.0f

    .line 125
    .line 126
    const/high16 v18, -0x3fc00000    # -3.0f

    .line 127
    .line 128
    const v13, -0x402b851f    # -1.66f

    .line 129
    .line 130
    .line 131
    const/high16 v15, -0x3fc00000    # -3.0f

    .line 132
    .line 133
    const v16, -0x40547ae1    # -1.34f

    .line 134
    .line 135
    .line 136
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 137
    .line 138
    .line 139
    const/high16 v17, 0x40000000    # 2.0f

    .line 140
    .line 141
    const v18, -0x3fcae148    # -2.83f

    .line 142
    .line 143
    .line 144
    const/4 v13, 0x0

    .line 145
    const v14, -0x405851ec    # -1.31f

    .line 146
    .line 147
    .line 148
    const v15, 0x3f570a3d    # 0.84f

    .line 149
    .line 150
    .line 151
    const v16, -0x3fe5c28f    # -2.41f

    .line 152
    .line 153
    .line 154
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 155
    .line 156
    .line 157
    const v0, 0x4141999a    # 12.1f

    .line 158
    .line 159
    .line 160
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 161
    .line 162
    .line 163
    const/high16 v17, -0x3f800000    # -4.0f

    .line 164
    .line 165
    const v18, 0x409ccccd    # 4.9f

    .line 166
    .line 167
    .line 168
    const v13, -0x3fee147b    # -2.28f

    .line 169
    .line 170
    .line 171
    const v14, 0x3eeb851f    # 0.46f

    .line 172
    .line 173
    .line 174
    const/high16 v15, -0x3f800000    # -4.0f

    .line 175
    .line 176
    const v16, 0x401eb852    # 2.48f

    .line 177
    .line 178
    .line 179
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 180
    .line 181
    .line 182
    const/high16 v17, 0x40a00000    # 5.0f

    .line 183
    .line 184
    const/high16 v18, 0x40a00000    # 5.0f

    .line 185
    .line 186
    const/4 v13, 0x0

    .line 187
    const v14, 0x4030a3d7    # 2.76f

    .line 188
    .line 189
    .line 190
    const v15, 0x400f5c29    # 2.24f

    .line 191
    .line 192
    .line 193
    const/high16 v16, 0x40a00000    # 5.0f

    .line 194
    .line 195
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 196
    .line 197
    .line 198
    const v17, 0x409ccccd    # 4.9f

    .line 199
    .line 200
    .line 201
    const/high16 v18, -0x3f800000    # -4.0f

    .line 202
    .line 203
    const v13, 0x401ae148    # 2.42f

    .line 204
    .line 205
    .line 206
    const/4 v14, 0x0

    .line 207
    const v15, 0x408e147b    # 4.44f

    .line 208
    .line 209
    .line 210
    const v16, -0x4023d70a    # -1.72f

    .line 211
    .line 212
    .line 213
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 214
    .line 215
    .line 216
    const v0, -0x3ffb851f    # -2.07f

    .line 217
    .line 218
    .line 219
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 220
    .line 221
    .line 222
    const/high16 v17, 0x41200000    # 10.0f

    .line 223
    .line 224
    const/high16 v18, 0x41a00000    # 20.0f

    .line 225
    .line 226
    const v13, 0x4146b852    # 12.42f

    .line 227
    .line 228
    .line 229
    const v14, 0x419947ae    # 19.16f

    .line 230
    .line 231
    .line 232
    const v15, 0x4134f5c3    # 11.31f

    .line 233
    .line 234
    .line 235
    const/high16 v16, 0x41a00000    # 20.0f

    .line 236
    .line 237
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 238
    .line 239
    .line 240
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 241
    .line 242
    .line 243
    const v0, 0x41a3eb85    # 20.49f

    .line 244
    .line 245
    .line 246
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 247
    .line 248
    .line 249
    const v0, 0x4060a3d7    # 3.51f

    .line 250
    .line 251
    .line 252
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 253
    .line 254
    .line 255
    const v17, -0x404b851f    # -1.41f

    .line 256
    .line 257
    .line 258
    const/16 v18, 0x0

    .line 259
    .line 260
    const v13, -0x413851ec    # -0.39f

    .line 261
    .line 262
    .line 263
    const v14, -0x413851ec    # -0.39f

    .line 264
    .line 265
    .line 266
    const v15, -0x407d70a4    # -1.02f

    .line 267
    .line 268
    .line 269
    const v16, -0x413851ec    # -0.39f

    .line 270
    .line 271
    .line 272
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 273
    .line 274
    .line 275
    const/16 v17, 0x0

    .line 276
    .line 277
    const v18, 0x3fb47ae1    # 1.41f

    .line 278
    .line 279
    .line 280
    const v14, 0x3ec7ae14    # 0.39f

    .line 281
    .line 282
    .line 283
    const v15, -0x413851ec    # -0.39f

    .line 284
    .line 285
    .line 286
    const v16, 0x3f828f5c    # 1.02f

    .line 287
    .line 288
    .line 289
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 290
    .line 291
    .line 292
    const v0, 0x40fccccd    # 7.9f

    .line 293
    .line 294
    .line 295
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 296
    .line 297
    .line 298
    const/high16 v0, 0x41700000    # 15.0f

    .line 299
    .line 300
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 301
    .line 302
    .line 303
    const/high16 v17, 0x40000000    # 2.0f

    .line 304
    .line 305
    const/high16 v18, 0x40000000    # 2.0f

    .line 306
    .line 307
    const/4 v13, 0x0

    .line 308
    const v14, 0x3f8ccccd    # 1.1f

    .line 309
    .line 310
    .line 311
    const v15, 0x3f666666    # 0.9f

    .line 312
    .line 313
    .line 314
    const/high16 v16, 0x40000000    # 2.0f

    .line 315
    .line 316
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 317
    .line 318
    .line 319
    const v0, 0x400ae148    # 2.17f

    .line 320
    .line 321
    .line 322
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 323
    .line 324
    .line 325
    const v0, 0x409ccccd    # 4.9f

    .line 326
    .line 327
    .line 328
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 329
    .line 330
    .line 331
    const v17, 0x3fb47ae1    # 1.41f

    .line 332
    .line 333
    .line 334
    const/16 v18, 0x0

    .line 335
    .line 336
    const v13, 0x3ec7ae14    # 0.39f

    .line 337
    .line 338
    .line 339
    const v14, 0x3ec7ae14    # 0.39f

    .line 340
    .line 341
    .line 342
    const v15, 0x3f828f5c    # 1.02f

    .line 343
    .line 344
    .line 345
    const v16, 0x3ec7ae14    # 0.39f

    .line 346
    .line 347
    .line 348
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 349
    .line 350
    .line 351
    const v17, 0x41a3eb85    # 20.49f

    .line 352
    .line 353
    .line 354
    const v18, 0x41a3eb85    # 20.49f

    .line 355
    .line 356
    .line 357
    const v13, 0x41a70a3d    # 20.88f

    .line 358
    .line 359
    .line 360
    const v14, 0x41ac147b    # 21.51f

    .line 361
    .line 362
    .line 363
    const v15, 0x41a70a3d    # 20.88f

    .line 364
    .line 365
    .line 366
    const v16, 0x41a70a3d    # 20.88f

    .line 367
    .line 368
    .line 369
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 370
    .line 371
    .line 372
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 373
    .line 374
    .line 375
    const v0, 0x419147ae    # 18.16f

    .line 376
    .line 377
    .line 378
    const v2, 0x412ee148    # 10.93f

    .line 379
    .line 380
    .line 381
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 382
    .line 383
    .line 384
    const v17, -0x3fb147ae    # -3.23f

    .line 385
    .line 386
    .line 387
    const v18, -0x401eb852    # -1.76f

    .line 388
    .line 389
    .line 390
    const/high16 v13, -0x40600000    # -1.25f

    .line 391
    .line 392
    const v14, -0x41a8f5c3    # -0.21f

    .line 393
    .line 394
    .line 395
    const v15, -0x3fe47ae1    # -2.43f

    .line 396
    .line 397
    .line 398
    const v16, -0x409eb852    # -0.88f

    .line 399
    .line 400
    .line 401
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 402
    .line 403
    .line 404
    const v0, -0x405ae148    # -1.29f

    .line 405
    .line 406
    .line 407
    const v2, -0x4048f5c3    # -1.43f

    .line 408
    .line 409
    .line 410
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 411
    .line 412
    .line 413
    const v17, 0x415028f6    # 13.01f

    .line 414
    .line 415
    .line 416
    const v18, 0x40e8f5c3    # 7.28f

    .line 417
    .line 418
    .line 419
    const v13, 0x41566666    # 13.4f

    .line 420
    .line 421
    .line 422
    const/high16 v14, 0x40f00000    # 7.5f

    .line 423
    .line 424
    const v15, 0x41533333    # 13.2f

    .line 425
    .line 426
    .line 427
    const v16, 0x40ec28f6    # 7.38f

    .line 428
    .line 429
    .line 430
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 431
    .line 432
    .line 433
    const v17, -0x40666666    # -1.2f

    .line 434
    .line 435
    .line 436
    const v18, -0x417ae148    # -0.26f

    .line 437
    .line 438
    .line 439
    const v13, -0x4147ae14    # -0.36f

    .line 440
    .line 441
    .line 442
    const v14, -0x41bd70a4    # -0.19f

    .line 443
    .line 444
    .line 445
    const v15, -0x40c7ae14    # -0.72f

    .line 446
    .line 447
    .line 448
    const v16, -0x41666666    # -0.3f

    .line 449
    .line 450
    .line 451
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 452
    .line 453
    .line 454
    const v17, -0x40628f5c    # -1.23f

    .line 455
    .line 456
    .line 457
    const v18, 0x3f1c28f6    # 0.61f

    .line 458
    .line 459
    .line 460
    const v13, -0x41051eb8    # -0.49f

    .line 461
    .line 462
    .line 463
    const v14, 0x3d23d70a    # 0.04f

    .line 464
    .line 465
    .line 466
    const v15, -0x40970a3d    # -0.91f

    .line 467
    .line 468
    .line 469
    const v16, 0x3e8a3d71    # 0.27f

    .line 470
    .line 471
    .line 472
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 473
    .line 474
    .line 475
    const/high16 v0, 0x41600000    # 14.0f

    .line 476
    .line 477
    const v2, 0x4130cccd    # 11.05f

    .line 478
    .line 479
    .line 480
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 481
    .line 482
    .line 483
    const v17, 0x40733333    # 3.8f

    .line 484
    .line 485
    .line 486
    const v18, 0x3fe8f5c3    # 1.82f

    .line 487
    .line 488
    .line 489
    const/high16 v13, 0x3f800000    # 1.0f

    .line 490
    .line 491
    const v14, 0x3f547ae1    # 0.83f

    .line 492
    .line 493
    .line 494
    const v15, 0x4019999a    # 2.4f

    .line 495
    .line 496
    .line 497
    const v16, 0x3fc51eb8    # 1.54f

    .line 498
    .line 499
    .line 500
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 501
    .line 502
    .line 503
    const/high16 v17, 0x41980000    # 19.0f

    .line 504
    .line 505
    const v18, 0x413e6666    # 11.9f

    .line 506
    .line 507
    .line 508
    const v13, 0x41935c29    # 18.42f

    .line 509
    .line 510
    .line 511
    const/high16 v14, 0x41500000    # 13.0f

    .line 512
    .line 513
    const/high16 v15, 0x41980000    # 19.0f

    .line 514
    .line 515
    const v16, 0x41487ae1    # 12.53f

    .line 516
    .line 517
    .line 518
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 519
    .line 520
    .line 521
    const v17, 0x419147ae    # 18.16f

    .line 522
    .line 523
    .line 524
    const v18, 0x412ee148    # 10.93f

    .line 525
    .line 526
    .line 527
    const/high16 v13, 0x41980000    # 19.0f

    .line 528
    .line 529
    const v14, 0x4136b852    # 11.42f

    .line 530
    .line 531
    .line 532
    const v15, 0x41951eb8    # 18.64f

    .line 533
    .line 534
    .line 535
    const v16, 0x413028f6    # 11.01f

    .line 536
    .line 537
    .line 538
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 539
    .line 540
    .line 541
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 542
    .line 543
    .line 544
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 545
    .line 546
    .line 547
    move-result-object v2

    .line 548
    const/16 v16, 0x3800

    .line 549
    .line 550
    const/16 v17, 0x0

    .line 551
    .line 552
    const/high16 v6, 0x3f800000    # 1.0f

    .line 553
    .line 554
    const/high16 v8, 0x3f800000    # 1.0f

    .line 555
    .line 556
    const/4 v7, 0x0

    .line 557
    const/high16 v9, 0x3f800000    # 1.0f

    .line 558
    .line 559
    const/high16 v12, 0x3f800000    # 1.0f

    .line 560
    .line 561
    const/4 v13, 0x0

    .line 562
    const/4 v14, 0x0

    .line 563
    const/4 v15, 0x0

    .line 564
    const-string v4, ""

    .line 565
    .line 566
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 567
    .line 568
    .line 569
    move-result-object v0

    .line 570
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 571
    .line 572
    .line 573
    move-result-object v0

    .line 574
    sput-object v0, Landroidx/compose/material/icons/rounded/NotAccessibleKt;->_notAccessible:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 575
    .line 576
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 577
    .line 578
    .line 579
    return-object v0
.end method
