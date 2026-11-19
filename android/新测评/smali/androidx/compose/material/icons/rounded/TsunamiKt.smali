.class public final Landroidx/compose/material/icons/rounded/TsunamiKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_tsunami",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "Tsunami",
        "Landroidx/compose/material/icons/Icons$Rounded;",
        "getTsunami",
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
        "SMAP\nTsunami.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Tsunami.kt\nandroidx/compose/material/icons/rounded/TsunamiKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,88:1\n212#2,12:89\n233#2,18:102\n253#2:139\n233#2,18:140\n253#2:177\n174#3:101\n705#4,2:120\n717#4,2:122\n719#4,11:128\n705#4,2:158\n717#4,2:160\n719#4,11:166\n72#5,4:124\n72#5,4:162\n*S KotlinDebug\n*F\n+ 1 Tsunami.kt\nandroidx/compose/material/icons/rounded/TsunamiKt\n*L\n29#1:89,12\n30#1:102,18\n30#1:139\n51#1:140,18\n51#1:177\n29#1:101\n30#1:120,2\n30#1:122,2\n30#1:128,11\n51#1:158,2\n51#1:160,2\n51#1:166,11\n30#1:124,4\n51#1:162,4\n*E\n"
    }
.end annotation


# static fields
.field private static _tsunami:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getTsunami(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/TsunamiKt;->_tsunami:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.Tsunami"

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
    const v4, 0x419147ae    # 18.16f

    .line 71
    .line 72
    .line 73
    const v6, 0x418fd70a    # 17.98f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v25, -0x3f4c7ae1    # -5.61f

    .line 80
    .line 81
    .line 82
    const v26, 0x3da3d70a    # 0.08f

    .line 83
    .line 84
    .line 85
    const v21, -0x3fcf5c29    # -2.76f

    .line 86
    .line 87
    .line 88
    const v22, 0x3fe147ae    # 1.76f

    .line 89
    .line 90
    .line 91
    const v23, -0x3f6a8f5c    # -4.67f

    .line 92
    .line 93
    .line 94
    const v24, 0x3f451eb8    # 0.77f

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
    const v25, -0x4070a3d7    # -1.12f

    .line 103
    .line 104
    .line 105
    const v26, 0x3c23d70a    # 0.01f

    .line 106
    .line 107
    .line 108
    const v21, -0x4151eb85    # -0.34f

    .line 109
    .line 110
    .line 111
    const v22, -0x418a3d71    # -0.24f

    .line 112
    .line 113
    .line 114
    const v23, -0x40b851ec    # -0.78f

    .line 115
    .line 116
    .line 117
    const v24, -0x41947ae1    # -0.23f

    .line 118
    .line 119
    .line 120
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 121
    .line 122
    .line 123
    const v25, -0x3f4e6666    # -5.55f

    .line 124
    .line 125
    .line 126
    const v26, -0x428a3d71    # -0.06f

    .line 127
    .line 128
    .line 129
    const v21, -0x4087ae14    # -0.97f

    .line 130
    .line 131
    .line 132
    const v22, 0x3f333333    # 0.7f

    .line 133
    .line 134
    .line 135
    const v23, -0x3fcae148    # -2.83f

    .line 136
    .line 137
    .line 138
    const v24, 0x3fd33333    # 1.65f

    .line 139
    .line 140
    .line 141
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 142
    .line 143
    .line 144
    const v25, 0x4099eb85    # 4.81f

    .line 145
    .line 146
    .line 147
    const/high16 v26, 0x41900000    # 18.0f

    .line 148
    .line 149
    const v21, 0x40b1999a    # 5.55f

    .line 150
    .line 151
    .line 152
    const v22, 0x418e6666    # 17.8f

    .line 153
    .line 154
    .line 155
    const v23, 0x40a428f6    # 5.13f

    .line 156
    .line 157
    .line 158
    const v24, 0x418e3d71    # 17.78f

    .line 159
    .line 160
    .line 161
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 162
    .line 163
    .line 164
    const/high16 v25, -0x40000000    # -2.0f

    .line 165
    .line 166
    const v26, 0x3f70a3d7    # 0.94f

    .line 167
    .line 168
    .line 169
    const v21, -0x40970a3d    # -0.91f

    .line 170
    .line 171
    .line 172
    const v22, 0x3f1c28f6    # 0.61f

    .line 173
    .line 174
    .line 175
    const v23, -0x403c28f6    # -1.53f

    .line 176
    .line 177
    .line 178
    const v24, 0x3f59999a    # 0.85f

    .line 179
    .line 180
    .line 181
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 182
    .line 183
    .line 184
    const/high16 v25, 0x40000000    # 2.0f

    .line 185
    .line 186
    const v26, 0x419f47ae    # 19.91f

    .line 187
    .line 188
    .line 189
    const v21, 0x4015c28f    # 2.34f

    .line 190
    .line 191
    .line 192
    const v22, 0x41983d71    # 19.03f

    .line 193
    .line 194
    .line 195
    const/high16 v23, 0x40000000    # 2.0f

    .line 196
    .line 197
    const v24, 0x419b851f    # 19.44f

    .line 198
    .line 199
    .line 200
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 201
    .line 202
    .line 203
    const/4 v4, 0x0

    .line 204
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 205
    .line 206
    .line 207
    const v25, 0x3f90a3d7    # 1.13f

    .line 208
    .line 209
    .line 210
    const v26, 0x3f7ae148    # 0.98f

    .line 211
    .line 212
    .line 213
    const/16 v21, 0x0

    .line 214
    .line 215
    const v22, 0x3f19999a    # 0.6f

    .line 216
    .line 217
    .line 218
    const v23, 0x3f0a3d71    # 0.54f

    .line 219
    .line 220
    .line 221
    const v24, 0x3f8b851f    # 1.09f

    .line 222
    .line 223
    .line 224
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 225
    .line 226
    .line 227
    const v25, 0x400ccccd    # 2.2f

    .line 228
    .line 229
    .line 230
    const v26, -0x40ab851f    # -0.83f

    .line 231
    .line 232
    .line 233
    const v21, 0x3f451eb8    # 0.77f

    .line 234
    .line 235
    .line 236
    const v22, -0x41f0a3d7    # -0.14f

    .line 237
    .line 238
    .line 239
    const v23, 0x3fc147ae    # 1.51f

    .line 240
    .line 241
    .line 242
    const v24, -0x4128f5c3    # -0.42f

    .line 243
    .line 244
    .line 245
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 246
    .line 247
    .line 248
    const v25, 0x40d570a4    # 6.67f

    .line 249
    .line 250
    .line 251
    const/16 v26, 0x0

    .line 252
    .line 253
    const v21, 0x40028f5c    # 2.04f

    .line 254
    .line 255
    .line 256
    const v22, 0x3f9ae148    # 1.21f

    .line 257
    .line 258
    .line 259
    const v23, 0x409428f6    # 4.63f

    .line 260
    .line 261
    .line 262
    const v24, 0x3f9ae148    # 1.21f

    .line 263
    .line 264
    .line 265
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 266
    .line 267
    .line 268
    const v21, 0x4003d70a    # 2.06f

    .line 269
    .line 270
    .line 271
    const v22, 0x3f9c28f6    # 1.22f

    .line 272
    .line 273
    .line 274
    const v23, 0x4093851f    # 4.61f

    .line 275
    .line 276
    .line 277
    const v24, 0x3f9c28f6    # 1.22f

    .line 278
    .line 279
    .line 280
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 281
    .line 282
    .line 283
    const v25, 0x400d70a4    # 2.21f

    .line 284
    .line 285
    .line 286
    const v26, 0x3f547ae1    # 0.83f

    .line 287
    .line 288
    .line 289
    const v21, 0x3f30a3d7    # 0.69f

    .line 290
    .line 291
    .line 292
    const v22, 0x3ed1eb85    # 0.41f

    .line 293
    .line 294
    .line 295
    const v23, 0x3fb851ec    # 1.44f

    .line 296
    .line 297
    .line 298
    const v24, 0x3f30a3d7    # 0.69f

    .line 299
    .line 300
    .line 301
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 302
    .line 303
    .line 304
    const v25, 0x3f90a3d7    # 1.13f

    .line 305
    .line 306
    .line 307
    const v26, -0x40851eb8    # -0.98f

    .line 308
    .line 309
    .line 310
    const v21, 0x3f170a3d    # 0.59f

    .line 311
    .line 312
    .line 313
    const v22, 0x3de147ae    # 0.11f

    .line 314
    .line 315
    .line 316
    const v23, 0x3f90a3d7    # 1.13f

    .line 317
    .line 318
    .line 319
    const v24, -0x413d70a4    # -0.38f

    .line 320
    .line 321
    .line 322
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 323
    .line 324
    .line 325
    const v4, -0x43dc28f6    # -0.01f

    .line 326
    .line 327
    .line 328
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 329
    .line 330
    .line 331
    const v25, -0x40b33333    # -0.8f

    .line 332
    .line 333
    .line 334
    const v26, -0x4087ae14    # -0.97f

    .line 335
    .line 336
    .line 337
    const/16 v21, 0x0

    .line 338
    .line 339
    const v22, -0x410f5c29    # -0.47f

    .line 340
    .line 341
    .line 342
    const v23, -0x41570a3d    # -0.33f

    .line 343
    .line 344
    .line 345
    const v24, -0x409eb852    # -0.88f

    .line 346
    .line 347
    .line 348
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 349
    .line 350
    .line 351
    const v25, -0x3ffeb852    # -2.02f

    .line 352
    .line 353
    .line 354
    const v26, -0x408f5c29    # -0.94f

    .line 355
    .line 356
    .line 357
    const v21, -0x41051eb8    # -0.49f

    .line 358
    .line 359
    .line 360
    const v22, -0x42333333    # -0.1f

    .line 361
    .line 362
    .line 363
    const v23, -0x4071eb85    # -1.11f

    .line 364
    .line 365
    .line 366
    const v24, -0x4151eb85    # -0.34f

    .line 367
    .line 368
    .line 369
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 370
    .line 371
    .line 372
    const v25, 0x419147ae    # 18.16f

    .line 373
    .line 374
    .line 375
    const v26, 0x418fd70a    # 17.98f

    .line 376
    .line 377
    .line 378
    const v21, 0x41970a3d    # 18.88f

    .line 379
    .line 380
    .line 381
    const v22, 0x418e51ec    # 17.79f

    .line 382
    .line 383
    .line 384
    const v23, 0x4193c28f    # 18.47f

    .line 385
    .line 386
    .line 387
    const v24, 0x418e3d71    # 17.78f

    .line 388
    .line 389
    .line 390
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 391
    .line 392
    .line 393
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 394
    .line 395
    .line 396
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 397
    .line 398
    .line 399
    move-result-object v2

    .line 400
    const/16 v16, 0x3800

    .line 401
    .line 402
    const/16 v17, 0x0

    .line 403
    .line 404
    const/high16 v6, 0x3f800000    # 1.0f

    .line 405
    .line 406
    const/high16 v8, 0x3f800000    # 1.0f

    .line 407
    .line 408
    const/4 v7, 0x0

    .line 409
    const/high16 v9, 0x3f800000    # 1.0f

    .line 410
    .line 411
    const/high16 v12, 0x3f800000    # 1.0f

    .line 412
    .line 413
    const/4 v13, 0x0

    .line 414
    const/4 v14, 0x0

    .line 415
    const/4 v15, 0x0

    .line 416
    const-string v4, ""

    .line 417
    .line 418
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 419
    .line 420
    .line 421
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 422
    .line 423
    .line 424
    move-result v3

    .line 425
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 426
    .line 427
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 428
    .line 429
    .line 430
    move-result-wide v6

    .line 431
    const/4 v0, 0x0

    .line 432
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 433
    .line 434
    .line 435
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 436
    .line 437
    .line 438
    move-result v10

    .line 439
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 440
    .line 441
    .line 442
    move-result v11

    .line 443
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 444
    .line 445
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 446
    .line 447
    .line 448
    const v0, 0x419aa3d7    # 19.33f

    .line 449
    .line 450
    .line 451
    const/high16 v2, 0x41400000    # 12.0f

    .line 452
    .line 453
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 454
    .line 455
    .line 456
    const/high16 v0, 0x41a80000    # 21.0f

    .line 457
    .line 458
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 459
    .line 460
    .line 461
    const/high16 v17, 0x3f800000    # 1.0f

    .line 462
    .line 463
    const/high16 v18, -0x40800000    # -1.0f

    .line 464
    .line 465
    const v13, 0x3f0ccccd    # 0.55f

    .line 466
    .line 467
    .line 468
    const/high16 v15, 0x3f800000    # 1.0f

    .line 469
    .line 470
    const v16, -0x4119999a    # -0.45f

    .line 471
    .line 472
    .line 473
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 474
    .line 475
    .line 476
    const/4 v0, 0x0

    .line 477
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 478
    .line 479
    .line 480
    const/high16 v17, -0x40800000    # -1.0f

    .line 481
    .line 482
    const/4 v13, 0x0

    .line 483
    const v14, -0x40f33333    # -0.55f

    .line 484
    .line 485
    .line 486
    const v15, -0x4119999a    # -0.45f

    .line 487
    .line 488
    .line 489
    const/high16 v16, -0x40800000    # -1.0f

    .line 490
    .line 491
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 492
    .line 493
    .line 494
    const v0, -0x4031eb85    # -1.61f

    .line 495
    .line 496
    .line 497
    const/4 v2, 0x0

    .line 498
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 499
    .line 500
    .line 501
    const v17, -0x3fa70a3d    # -3.39f

    .line 502
    .line 503
    .line 504
    const v18, -0x3fa8f5c3    # -3.36f

    .line 505
    .line 506
    .line 507
    const v13, -0x4011eb85    # -1.86f

    .line 508
    .line 509
    .line 510
    const/4 v14, 0x0

    .line 511
    const v15, -0x3fa66666    # -3.4f

    .line 512
    .line 513
    .line 514
    const/high16 v16, -0x40400000    # -1.5f

    .line 515
    .line 516
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 517
    .line 518
    .line 519
    const v17, 0x3e23d70a    # 0.16f

    .line 520
    .line 521
    .line 522
    const v18, -0x4079999a    # -1.05f

    .line 523
    .line 524
    .line 525
    const/4 v13, 0x0

    .line 526
    const v14, -0x41428f5c    # -0.37f

    .line 527
    .line 528
    .line 529
    const v15, 0x3d75c28f    # 0.06f

    .line 530
    .line 531
    .line 532
    const v16, -0x40cccccd    # -0.7f

    .line 533
    .line 534
    .line 535
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 536
    .line 537
    .line 538
    const v17, 0x416451ec    # 14.27f

    .line 539
    .line 540
    .line 541
    const/high16 v18, 0x40400000    # 3.0f

    .line 542
    .line 543
    const v13, 0x41843d71    # 16.53f

    .line 544
    .line 545
    .line 546
    const v14, 0x4089999a    # 4.3f

    .line 547
    .line 548
    .line 549
    const v15, 0x4179999a    # 15.6f

    .line 550
    .line 551
    .line 552
    const v16, 0x4041eb85    # 3.03f

    .line 553
    .line 554
    .line 555
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 556
    .line 557
    .line 558
    const/high16 v17, 0x41600000    # 14.0f

    .line 559
    .line 560
    const v13, 0x4162e148    # 14.18f

    .line 561
    .line 562
    .line 563
    const/high16 v14, 0x40400000    # 3.0f

    .line 564
    .line 565
    const v15, 0x416170a4    # 14.09f

    .line 566
    .line 567
    .line 568
    const/high16 v16, 0x40400000    # 3.0f

    .line 569
    .line 570
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 571
    .line 572
    .line 573
    const v17, 0x4000a3d7    # 2.01f

    .line 574
    .line 575
    .line 576
    const/high16 v18, 0x41680000    # 14.5f

    .line 577
    .line 578
    const v13, 0x40eb851f    # 7.36f

    .line 579
    .line 580
    .line 581
    const v15, 0x4009999a    # 2.15f

    .line 582
    .line 583
    .line 584
    const v16, 0x41007ae1    # 8.03f

    .line 585
    .line 586
    .line 587
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 588
    .line 589
    .line 590
    const v0, 0x3cf5c28f    # 0.03f

    .line 591
    .line 592
    .line 593
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 594
    .line 595
    .line 596
    const v17, 0x4008f5c3    # 2.14f

    .line 597
    .line 598
    .line 599
    const v18, 0x3fcccccd    # 1.6f

    .line 600
    .line 601
    .line 602
    const v13, -0x42dc28f6    # -0.04f

    .line 603
    .line 604
    .line 605
    const v14, 0x3f90a3d7    # 1.13f

    .line 606
    .line 607
    .line 608
    const v15, 0x3f88f5c3    # 1.07f

    .line 609
    .line 610
    .line 611
    const v16, 0x3ffd70a4    # 1.98f

    .line 612
    .line 613
    .line 614
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 615
    .line 616
    .line 617
    const v17, 0x3f933333    # 1.15f

    .line 618
    .line 619
    .line 620
    const v18, -0x40f5c28f    # -0.54f

    .line 621
    .line 622
    .line 623
    const v13, 0x3ecccccd    # 0.4f

    .line 624
    .line 625
    .line 626
    const v14, -0x41f0a3d7    # -0.14f

    .line 627
    .line 628
    .line 629
    const v15, 0x3f47ae14    # 0.78f

    .line 630
    .line 631
    .line 632
    const v16, -0x415c28f6    # -0.32f

    .line 633
    .line 634
    .line 635
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 636
    .line 637
    .line 638
    const v17, 0x40d66666    # 6.7f

    .line 639
    .line 640
    .line 641
    const v18, -0x435c28f6    # -0.02f

    .line 642
    .line 643
    .line 644
    const v13, 0x40051eb8    # 2.08f

    .line 645
    .line 646
    .line 647
    const v14, 0x3f99999a    # 1.2f

    .line 648
    .line 649
    .line 650
    const v15, 0x40947ae1    # 4.64f

    .line 651
    .line 652
    .line 653
    const v16, 0x3f9c28f6    # 1.22f

    .line 654
    .line 655
    .line 656
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 657
    .line 658
    .line 659
    const v17, 0x40d570a4    # 6.67f

    .line 660
    .line 661
    .line 662
    const/16 v18, 0x0

    .line 663
    .line 664
    const v13, 0x4003d70a    # 2.06f

    .line 665
    .line 666
    .line 667
    const v14, 0x3f9c28f6    # 1.22f

    .line 668
    .line 669
    .line 670
    const v15, 0x4093851f    # 4.61f

    .line 671
    .line 672
    .line 673
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 674
    .line 675
    .line 676
    const v17, 0x400b851f    # 2.18f

    .line 677
    .line 678
    .line 679
    const v18, 0x3f51eb85    # 0.82f

    .line 680
    .line 681
    .line 682
    const v13, 0x3f2e147b    # 0.68f

    .line 683
    .line 684
    .line 685
    const v14, 0x3ed1eb85    # 0.41f

    .line 686
    .line 687
    .line 688
    const v15, 0x3fb5c28f    # 1.42f

    .line 689
    .line 690
    .line 691
    const v16, 0x3f2e147b    # 0.68f

    .line 692
    .line 693
    .line 694
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 695
    .line 696
    .line 697
    const v17, 0x3f947ae1    # 1.16f

    .line 698
    .line 699
    .line 700
    const v18, -0x40851eb8    # -0.98f

    .line 701
    .line 702
    .line 703
    const v13, 0x3f19999a    # 0.6f

    .line 704
    .line 705
    .line 706
    const v14, 0x3de147ae    # 0.11f

    .line 707
    .line 708
    .line 709
    const v15, 0x3f947ae1    # 1.16f

    .line 710
    .line 711
    .line 712
    const v16, -0x4147ae14    # -0.36f

    .line 713
    .line 714
    .line 715
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 716
    .line 717
    .line 718
    const v0, -0x43dc28f6    # -0.01f

    .line 719
    .line 720
    .line 721
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 722
    .line 723
    .line 724
    const v17, -0x40b851ec    # -0.78f

    .line 725
    .line 726
    .line 727
    const v18, -0x4087ae14    # -0.97f

    .line 728
    .line 729
    .line 730
    const/4 v13, 0x0

    .line 731
    const v14, -0x41147ae1    # -0.46f

    .line 732
    .line 733
    .line 734
    const v15, -0x415c28f6    # -0.32f

    .line 735
    .line 736
    .line 737
    const v16, -0x409eb852    # -0.88f

    .line 738
    .line 739
    .line 740
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 741
    .line 742
    .line 743
    const v17, -0x3ffe147b    # -2.03f

    .line 744
    .line 745
    .line 746
    const v18, -0x408f5c29    # -0.94f

    .line 747
    .line 748
    .line 749
    const v13, -0x41051eb8    # -0.49f

    .line 750
    .line 751
    .line 752
    const v14, -0x4247ae14    # -0.09f

    .line 753
    .line 754
    .line 755
    const v15, -0x4070a3d7    # -1.12f

    .line 756
    .line 757
    .line 758
    const v16, -0x41570a3d    # -0.33f

    .line 759
    .line 760
    .line 761
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 762
    .line 763
    .line 764
    const v17, -0x4079999a    # -1.05f

    .line 765
    .line 766
    .line 767
    const v18, -0x43dc28f6    # -0.01f

    .line 768
    .line 769
    .line 770
    const v13, -0x416147ae    # -0.31f

    .line 771
    .line 772
    .line 773
    const v14, -0x41a8f5c3    # -0.21f

    .line 774
    .line 775
    .line 776
    const v15, -0x40c51eb8    # -0.73f

    .line 777
    .line 778
    .line 779
    const v16, -0x419eb852    # -0.22f

    .line 780
    .line 781
    .line 782
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 783
    .line 784
    .line 785
    const v17, -0x3f4d70a4    # -5.58f

    .line 786
    .line 787
    .line 788
    const v18, 0x3db851ec    # 0.09f

    .line 789
    .line 790
    .line 791
    const v13, -0x3fd147ae    # -2.73f

    .line 792
    .line 793
    .line 794
    const v14, 0x3fdeb852    # 1.74f

    .line 795
    .line 796
    .line 797
    const v15, -0x3f6bd70a    # -4.63f

    .line 798
    .line 799
    .line 800
    const v16, 0x3f451eb8    # 0.77f

    .line 801
    .line 802
    .line 803
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 804
    .line 805
    .line 806
    const v17, -0x406b851f    # -1.16f

    .line 807
    .line 808
    .line 809
    const v18, -0x43dc28f6    # -0.01f

    .line 810
    .line 811
    .line 812
    const v13, -0x414ccccd    # -0.35f

    .line 813
    .line 814
    .line 815
    const/high16 v14, -0x41800000    # -0.25f

    .line 816
    .line 817
    const v15, -0x40b0a3d7    # -0.81f

    .line 818
    .line 819
    .line 820
    const v16, -0x417ae148    # -0.26f

    .line 821
    .line 822
    .line 823
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 824
    .line 825
    .line 826
    const v17, -0x415c28f6    # -0.32f

    .line 827
    .line 828
    .line 829
    const v18, 0x3e4ccccd    # 0.2f

    .line 830
    .line 831
    .line 832
    const v13, -0x41e66666    # -0.15f

    .line 833
    .line 834
    .line 835
    const v14, 0x3de147ae    # 0.11f

    .line 836
    .line 837
    .line 838
    const v15, -0x4247ae14    # -0.09f

    .line 839
    .line 840
    .line 841
    const v16, 0x3d75c28f    # 0.06f

    .line 842
    .line 843
    .line 844
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 845
    .line 846
    .line 847
    const/high16 v17, 0x41200000    # 10.0f

    .line 848
    .line 849
    const/high16 v18, 0x41280000    # 10.5f

    .line 850
    .line 851
    const v13, 0x41263d71    # 10.39f

    .line 852
    .line 853
    .line 854
    const v14, 0x414d1eb8    # 12.82f

    .line 855
    .line 856
    .line 857
    const/high16 v15, 0x41200000    # 10.0f

    .line 858
    .line 859
    const v16, 0x413b3333    # 11.7f

    .line 860
    .line 861
    .line 862
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 863
    .line 864
    .line 865
    const v17, 0x4086b852    # 4.21f

    .line 866
    .line 867
    .line 868
    const v18, -0x3f5570a4    # -5.33f

    .line 869
    .line 870
    .line 871
    const/4 v13, 0x0

    .line 872
    const v14, -0x3fdae148    # -2.58f

    .line 873
    .line 874
    .line 875
    const v15, 0x3fe28f5c    # 1.77f

    .line 876
    .line 877
    .line 878
    const v16, -0x3f6851ec    # -4.74f

    .line 879
    .line 880
    .line 881
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 882
    .line 883
    .line 884
    const/high16 v17, 0x41600000    # 14.0f

    .line 885
    .line 886
    const v18, 0x40d570a4    # 6.67f

    .line 887
    .line 888
    .line 889
    const v13, 0x416147ae    # 14.08f

    .line 890
    .line 891
    .line 892
    const v14, 0x40b5c28f    # 5.68f

    .line 893
    .line 894
    .line 895
    const/high16 v15, 0x41600000    # 14.0f

    .line 896
    .line 897
    const v16, 0x40c6147b    # 6.19f

    .line 898
    .line 899
    .line 900
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 901
    .line 902
    .line 903
    const v17, 0x419aa3d7    # 19.33f

    .line 904
    .line 905
    .line 906
    const/high16 v18, 0x41400000    # 12.0f

    .line 907
    .line 908
    const/high16 v13, 0x41600000    # 14.0f

    .line 909
    .line 910
    const v14, 0x4119c28f    # 9.61f

    .line 911
    .line 912
    .line 913
    const v15, 0x41831eb8    # 16.39f

    .line 914
    .line 915
    .line 916
    const/high16 v16, 0x41400000    # 12.0f

    .line 917
    .line 918
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 919
    .line 920
    .line 921
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 922
    .line 923
    .line 924
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 925
    .line 926
    .line 927
    move-result-object v2

    .line 928
    const/16 v16, 0x3800

    .line 929
    .line 930
    const/16 v17, 0x0

    .line 931
    .line 932
    const/high16 v6, 0x3f800000    # 1.0f

    .line 933
    .line 934
    const/4 v7, 0x0

    .line 935
    const/high16 v12, 0x3f800000    # 1.0f

    .line 936
    .line 937
    const/4 v13, 0x0

    .line 938
    const/4 v14, 0x0

    .line 939
    const/4 v15, 0x0

    .line 940
    const-string v4, ""

    .line 941
    .line 942
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 943
    .line 944
    .line 945
    move-result-object v0

    .line 946
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 947
    .line 948
    .line 949
    move-result-object v0

    .line 950
    sput-object v0, Landroidx/compose/material/icons/rounded/TsunamiKt;->_tsunami:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 951
    .line 952
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 953
    .line 954
    .line 955
    return-object v0
.end method
