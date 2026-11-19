.class public final Landroidx/compose/material/icons/outlined/TouchAppKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_touchApp",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "TouchApp",
        "Landroidx/compose/material/icons/Icons$Outlined;",
        "getTouchApp",
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
        "SMAP\nTouchApp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TouchApp.kt\nandroidx/compose/material/icons/outlined/TouchAppKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,78:1\n212#2,12:79\n233#2,18:92\n253#2:129\n174#3:91\n705#4,2:110\n717#4,2:112\n719#4,11:118\n72#5,4:114\n*S KotlinDebug\n*F\n+ 1 TouchApp.kt\nandroidx/compose/material/icons/outlined/TouchAppKt\n*L\n29#1:79,12\n30#1:92,18\n30#1:129\n29#1:91\n30#1:110,2\n30#1:112,2\n30#1:118,11\n30#1:114,4\n*E\n"
    }
.end annotation


# static fields
.field private static _touchApp:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getTouchApp(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/outlined/TouchAppKt;->_touchApp:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Outlined.TouchApp"

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
    const v0, 0x4191851f    # 18.19f

    .line 71
    .line 72
    .line 73
    const v2, 0x41470a3d    # 12.44f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v0, -0x3fb0a3d7    # -3.24f

    .line 80
    .line 81
    .line 82
    const v2, -0x4030a3d7    # -1.62f

    .line 83
    .line 84
    .line 85
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 86
    .line 87
    .line 88
    const v17, 0x4007ae14    # 2.12f

    .line 89
    .line 90
    .line 91
    const v18, -0x3f75c28f    # -4.32f

    .line 92
    .line 93
    .line 94
    const v13, 0x3fa51eb8    # 1.29f

    .line 95
    .line 96
    .line 97
    const/high16 v14, -0x40800000    # -1.0f

    .line 98
    .line 99
    const v15, 0x4007ae14    # 2.12f

    .line 100
    .line 101
    .line 102
    const v16, -0x3fdc28f6    # -2.56f

    .line 103
    .line 104
    .line 105
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 106
    .line 107
    .line 108
    const/high16 v17, -0x3f500000    # -5.5f

    .line 109
    .line 110
    const/high16 v18, -0x3f500000    # -5.5f

    .line 111
    .line 112
    const/4 v13, 0x0

    .line 113
    const v14, -0x3fbe147b    # -3.03f

    .line 114
    .line 115
    .line 116
    const v15, -0x3fe1eb85    # -2.47f

    .line 117
    .line 118
    .line 119
    const/high16 v16, -0x3f500000    # -5.5f

    .line 120
    .line 121
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 122
    .line 123
    .line 124
    const v0, 0x401e147b    # 2.47f

    .line 125
    .line 126
    .line 127
    const/high16 v2, 0x40b00000    # 5.5f

    .line 128
    .line 129
    const/high16 v4, -0x3f500000    # -5.5f

    .line 130
    .line 131
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 132
    .line 133
    .line 134
    const/high16 v17, 0x40400000    # 3.0f

    .line 135
    .line 136
    const v18, 0x409c7ae1    # 4.89f

    .line 137
    .line 138
    .line 139
    const v14, 0x400851ec    # 2.13f

    .line 140
    .line 141
    .line 142
    const v15, 0x3f9c28f6    # 1.22f

    .line 143
    .line 144
    .line 145
    const v16, 0x407eb852    # 3.98f

    .line 146
    .line 147
    .line 148
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 149
    .line 150
    .line 151
    const v0, 0x4050a3d7    # 3.26f

    .line 152
    .line 153
    .line 154
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 155
    .line 156
    .line 157
    const v17, -0x3fef5c29    # -2.26f

    .line 158
    .line 159
    .line 160
    const v18, -0x411eb852    # -0.44f

    .line 161
    .line 162
    .line 163
    const v13, -0x3ff66666    # -2.15f

    .line 164
    .line 165
    .line 166
    const v14, -0x41147ae1    # -0.46f

    .line 167
    .line 168
    .line 169
    const v15, -0x3ffeb852    # -2.02f

    .line 170
    .line 171
    .line 172
    const v16, -0x411eb852    # -0.44f

    .line 173
    .line 174
    .line 175
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 176
    .line 177
    .line 178
    const v17, -0x404b851f    # -1.41f

    .line 179
    .line 180
    .line 181
    const v18, 0x3f170a3d    # 0.59f

    .line 182
    .line 183
    .line 184
    const v13, -0x40f851ec    # -0.53f

    .line 185
    .line 186
    .line 187
    const/4 v14, 0x0

    .line 188
    const v15, -0x407c28f6    # -1.03f

    .line 189
    .line 190
    .line 191
    const v16, 0x3e570a3d    # 0.21f

    .line 192
    .line 193
    .line 194
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 195
    .line 196
    .line 197
    const/high16 v0, 0x40800000    # 4.0f

    .line 198
    .line 199
    const v2, 0x4181c28f    # 16.22f

    .line 200
    .line 201
    .line 202
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 203
    .line 204
    .line 205
    const v0, 0x40a2e148    # 5.09f

    .line 206
    .line 207
    .line 208
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 209
    .line 210
    .line 211
    const v17, 0x412bd70a    # 10.74f

    .line 212
    .line 213
    .line 214
    const/high16 v18, 0x41b00000    # 22.0f

    .line 215
    .line 216
    const v13, 0x411851ec    # 9.52f

    .line 217
    .line 218
    .line 219
    const/high16 v14, 0x41ae0000    # 21.75f

    .line 220
    .line 221
    const v15, 0x4121eb85    # 10.12f

    .line 222
    .line 223
    .line 224
    const/high16 v16, 0x41b00000    # 22.0f

    .line 225
    .line 226
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 227
    .line 228
    .line 229
    const v0, 0x40c9999a    # 6.3f

    .line 230
    .line 231
    .line 232
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 233
    .line 234
    .line 235
    const v17, 0x3ffc28f6    # 1.97f

    .line 236
    .line 237
    .line 238
    const v18, -0x402a3d71    # -1.67f

    .line 239
    .line 240
    .line 241
    const v13, 0x3f7ae148    # 0.98f

    .line 242
    .line 243
    .line 244
    const/4 v14, 0x0

    .line 245
    const v15, 0x3fe7ae14    # 1.81f

    .line 246
    .line 247
    .line 248
    const v16, -0x40cccccd    # -0.7f

    .line 249
    .line 250
    .line 251
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 252
    .line 253
    .line 254
    const v0, 0x3f4ccccd    # 0.8f

    .line 255
    .line 256
    .line 257
    const v2, -0x3f6947ae    # -4.71f

    .line 258
    .line 259
    .line 260
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 261
    .line 262
    .line 263
    const v17, 0x4191851f    # 18.19f

    .line 264
    .line 265
    .line 266
    const v18, 0x41470a3d    # 12.44f

    .line 267
    .line 268
    .line 269
    const v13, 0x41a03d71    # 20.03f

    .line 270
    .line 271
    .line 272
    const v14, 0x41651eb8    # 14.32f

    .line 273
    .line 274
    .line 275
    const v15, 0x419b0a3d    # 19.38f

    .line 276
    .line 277
    .line 278
    const v16, 0x4150a3d7    # 13.04f

    .line 279
    .line 280
    .line 281
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 282
    .line 283
    .line 284
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 285
    .line 286
    .line 287
    const v0, 0x418eb852    # 17.84f

    .line 288
    .line 289
    .line 290
    const v2, 0x4174a3d7    # 15.29f

    .line 291
    .line 292
    .line 293
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 294
    .line 295
    .line 296
    const v0, 0x418851ec    # 17.04f

    .line 297
    .line 298
    .line 299
    const/high16 v2, 0x41a00000    # 20.0f

    .line 300
    .line 301
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 302
    .line 303
    .line 304
    const v0, -0x3f366666    # -6.3f

    .line 305
    .line 306
    .line 307
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 308
    .line 309
    .line 310
    const v17, -0x418a3d71    # -0.24f

    .line 311
    .line 312
    .line 313
    const v18, -0x42333333    # -0.1f

    .line 314
    .line 315
    .line 316
    const v13, -0x4247ae14    # -0.09f

    .line 317
    .line 318
    .line 319
    const/4 v14, 0x0

    .line 320
    const v15, -0x41d1eb85    # -0.17f

    .line 321
    .line 322
    .line 323
    const v16, -0x42dc28f6    # -0.04f

    .line 324
    .line 325
    .line 326
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 327
    .line 328
    .line 329
    const v0, -0x3f947ae1    # -3.68f

    .line 330
    .line 331
    .line 332
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 333
    .line 334
    .line 335
    const/high16 v0, 0x40880000    # 4.25f

    .line 336
    .line 337
    const v2, 0x3f63d70a    # 0.89f

    .line 338
    .line 339
    .line 340
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 341
    .line 342
    .line 343
    const/high16 v0, 0x40d00000    # 6.5f

    .line 344
    .line 345
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 346
    .line 347
    .line 348
    const/high16 v17, 0x3f000000    # 0.5f

    .line 349
    .line 350
    const/high16 v18, -0x41000000    # -0.5f

    .line 351
    .line 352
    const/4 v13, 0x0

    .line 353
    const v14, -0x4170a3d7    # -0.28f

    .line 354
    .line 355
    .line 356
    const v15, 0x3e6147ae    # 0.22f

    .line 357
    .line 358
    .line 359
    const/high16 v16, -0x41000000    # -0.5f

    .line 360
    .line 361
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 362
    .line 363
    .line 364
    const/high16 v18, 0x3f000000    # 0.5f

    .line 365
    .line 366
    const v13, 0x3e8f5c29    # 0.28f

    .line 367
    .line 368
    .line 369
    const/4 v14, 0x0

    .line 370
    const/high16 v15, 0x3f000000    # 0.5f

    .line 371
    .line 372
    const v16, 0x3e6147ae    # 0.22f

    .line 373
    .line 374
    .line 375
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 376
    .line 377
    .line 378
    const/high16 v0, 0x40c00000    # 6.0f

    .line 379
    .line 380
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 381
    .line 382
    .line 383
    const v0, 0x3fe147ae    # 1.76f

    .line 384
    .line 385
    .line 386
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 387
    .line 388
    .line 389
    const v0, 0x405d70a4    # 3.46f

    .line 390
    .line 391
    .line 392
    const v2, 0x3fdd70a4    # 1.73f

    .line 393
    .line 394
    .line 395
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 396
    .line 397
    .line 398
    const v17, 0x418eb852    # 17.84f

    .line 399
    .line 400
    .line 401
    const v18, 0x4174a3d7    # 15.29f

    .line 402
    .line 403
    .line 404
    const v13, 0x418d851f    # 17.69f

    .line 405
    .line 406
    .line 407
    const v14, 0x4166e148    # 14.43f

    .line 408
    .line 409
    .line 410
    const v15, 0x418f47ae    # 17.91f

    .line 411
    .line 412
    .line 413
    const v16, 0x416dc28f    # 14.86f

    .line 414
    .line 415
    .line 416
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 417
    .line 418
    .line 419
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 420
    .line 421
    .line 422
    const v0, 0x41011eb8    # 8.07f

    .line 423
    .line 424
    .line 425
    const/high16 v2, 0x40d00000    # 6.5f

    .line 426
    .line 427
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 428
    .line 429
    .line 430
    const/high16 v17, 0x40600000    # 3.5f

    .line 431
    .line 432
    const/high16 v18, -0x3fa00000    # -3.5f

    .line 433
    .line 434
    const/4 v13, 0x0

    .line 435
    const v14, -0x4008f5c3    # -1.93f

    .line 436
    .line 437
    .line 438
    const v15, 0x3fc8f5c3    # 1.57f

    .line 439
    .line 440
    .line 441
    const/high16 v16, -0x3fa00000    # -3.5f

    .line 442
    .line 443
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 444
    .line 445
    .line 446
    const v0, 0x3fc8f5c3    # 1.57f

    .line 447
    .line 448
    .line 449
    const/high16 v2, 0x40600000    # 3.5f

    .line 450
    .line 451
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 452
    .line 453
    .line 454
    const/high16 v17, -0x40800000    # -1.0f

    .line 455
    .line 456
    const v18, 0x401c28f6    # 2.44f

    .line 457
    .line 458
    .line 459
    const v14, 0x3f733333    # 0.95f

    .line 460
    .line 461
    .line 462
    const v15, -0x413d70a4    # -0.38f

    .line 463
    .line 464
    .line 465
    const v16, 0x3fe7ae14    # 1.81f

    .line 466
    .line 467
    .line 468
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 469
    .line 470
    .line 471
    const/high16 v0, 0x40d00000    # 6.5f

    .line 472
    .line 473
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 474
    .line 475
    .line 476
    const/high16 v17, -0x3fe00000    # -2.5f

    .line 477
    .line 478
    const/high16 v18, -0x3fe00000    # -2.5f

    .line 479
    .line 480
    const v14, -0x404f5c29    # -1.38f

    .line 481
    .line 482
    .line 483
    const v15, -0x4070a3d7    # -1.12f

    .line 484
    .line 485
    .line 486
    const/high16 v16, -0x3fe00000    # -2.5f

    .line 487
    .line 488
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 489
    .line 490
    .line 491
    const/high16 v18, 0x40200000    # 2.5f

    .line 492
    .line 493
    const v13, -0x404f5c29    # -1.38f

    .line 494
    .line 495
    .line 496
    const/4 v14, 0x0

    .line 497
    const/high16 v15, -0x3fe00000    # -2.5f

    .line 498
    .line 499
    const v16, 0x3f8f5c29    # 1.12f

    .line 500
    .line 501
    .line 502
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 503
    .line 504
    .line 505
    const v0, 0x401c28f6    # 2.44f

    .line 506
    .line 507
    .line 508
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 509
    .line 510
    .line 511
    const v17, 0x41011eb8    # 8.07f

    .line 512
    .line 513
    .line 514
    const/high16 v18, 0x40d00000    # 6.5f

    .line 515
    .line 516
    const v13, 0x41073333    # 8.45f

    .line 517
    .line 518
    .line 519
    const v14, 0x4104f5c3    # 8.31f

    .line 520
    .line 521
    .line 522
    const v15, 0x41011eb8    # 8.07f

    .line 523
    .line 524
    .line 525
    const v16, 0x40ee6666    # 7.45f

    .line 526
    .line 527
    .line 528
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 529
    .line 530
    .line 531
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 532
    .line 533
    .line 534
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 535
    .line 536
    .line 537
    move-result-object v2

    .line 538
    const/16 v16, 0x3800

    .line 539
    .line 540
    const/16 v17, 0x0

    .line 541
    .line 542
    const/high16 v6, 0x3f800000    # 1.0f

    .line 543
    .line 544
    const/high16 v8, 0x3f800000    # 1.0f

    .line 545
    .line 546
    const/4 v7, 0x0

    .line 547
    const/high16 v9, 0x3f800000    # 1.0f

    .line 548
    .line 549
    const/high16 v12, 0x3f800000    # 1.0f

    .line 550
    .line 551
    const/4 v13, 0x0

    .line 552
    const/4 v14, 0x0

    .line 553
    const/4 v15, 0x0

    .line 554
    const-string v4, ""

    .line 555
    .line 556
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 557
    .line 558
    .line 559
    move-result-object v0

    .line 560
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 561
    .line 562
    .line 563
    move-result-object v0

    .line 564
    sput-object v0, Landroidx/compose/material/icons/outlined/TouchAppKt;->_touchApp:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 565
    .line 566
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 567
    .line 568
    .line 569
    return-object v0
.end method
