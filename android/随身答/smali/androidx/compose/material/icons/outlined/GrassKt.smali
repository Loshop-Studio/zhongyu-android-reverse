.class public final Landroidx/compose/material/icons/outlined/GrassKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_grass",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "Grass",
        "Landroidx/compose/material/icons/Icons$Outlined;",
        "getGrass",
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
        "SMAP\nGrass.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Grass.kt\nandroidx/compose/material/icons/outlined/GrassKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,70:1\n212#2,12:71\n233#2,18:84\n253#2:121\n174#3:83\n705#4,2:102\n717#4,2:104\n719#4,11:110\n72#5,4:106\n*S KotlinDebug\n*F\n+ 1 Grass.kt\nandroidx/compose/material/icons/outlined/GrassKt\n*L\n29#1:71,12\n30#1:84,18\n30#1:121\n29#1:83\n30#1:102,2\n30#1:104,2\n30#1:110,11\n30#1:106,4\n*E\n"
    }
.end annotation


# static fields
.field private static _grass:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getGrass(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/outlined/GrassKt;->_grass:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Outlined.Grass"

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
    const/high16 v2, 0x41a00000    # 20.0f

    .line 73
    .line 74
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v0, 0x40000000    # 2.0f

    .line 78
    .line 79
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 80
    .line 81
    .line 82
    const/high16 v0, -0x40000000    # -2.0f

    .line 83
    .line 84
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 85
    .line 86
    .line 87
    const/high16 v0, 0x40b80000    # 5.75f

    .line 88
    .line 89
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 90
    .line 91
    .line 92
    const/4 v0, 0x0

    .line 93
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 94
    .line 95
    .line 96
    const/high16 v17, 0x40000000    # 2.0f

    .line 97
    .line 98
    const v18, 0x414428f6    # 12.26f

    .line 99
    .line 100
    .line 101
    const v13, 0x40e0a3d7    # 7.02f

    .line 102
    .line 103
    .line 104
    const v14, 0x41730a3d    # 15.19f

    .line 105
    .line 106
    .line 107
    const v15, 0x4099eb85    # 4.81f

    .line 108
    .line 109
    .line 110
    const v16, 0x414fd70a    # 12.99f

    .line 111
    .line 112
    .line 113
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 114
    .line 115
    .line 116
    const/high16 v17, 0x40800000    # 4.0f

    .line 117
    .line 118
    const/high16 v18, 0x41400000    # 12.0f

    .line 119
    .line 120
    const v13, 0x4028f5c3    # 2.64f

    .line 121
    .line 122
    .line 123
    const v14, 0x4141999a    # 12.1f

    .line 124
    .line 125
    .line 126
    const v15, 0x4053d70a    # 3.31f

    .line 127
    .line 128
    .line 129
    const/high16 v16, 0x41400000    # 12.0f

    .line 130
    .line 131
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 132
    .line 133
    .line 134
    const/high16 v17, 0x41400000    # 12.0f

    .line 135
    .line 136
    const/high16 v18, 0x41a00000    # 20.0f

    .line 137
    .line 138
    const v13, 0x4106b852    # 8.42f

    .line 139
    .line 140
    .line 141
    const/high16 v14, 0x41400000    # 12.0f

    .line 142
    .line 143
    const/high16 v15, 0x41400000    # 12.0f

    .line 144
    .line 145
    const v16, 0x417947ae    # 15.58f

    .line 146
    .line 147
    .line 148
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 149
    .line 150
    .line 151
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 152
    .line 153
    .line 154
    const/high16 v0, 0x41b00000    # 22.0f

    .line 155
    .line 156
    const v2, 0x414428f6    # 12.26f

    .line 157
    .line 158
    .line 159
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 160
    .line 161
    .line 162
    const/high16 v17, 0x41a00000    # 20.0f

    .line 163
    .line 164
    const/high16 v18, 0x41400000    # 12.0f

    .line 165
    .line 166
    const v13, 0x41aae148    # 21.36f

    .line 167
    .line 168
    .line 169
    const v14, 0x4141999a    # 12.1f

    .line 170
    .line 171
    .line 172
    const v15, 0x41a5851f    # 20.69f

    .line 173
    .line 174
    .line 175
    const/high16 v16, 0x41400000    # 12.0f

    .line 176
    .line 177
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 178
    .line 179
    .line 180
    const v17, -0x3f23d70a    # -6.88f

    .line 181
    .line 182
    .line 183
    const v18, 0x407b851f    # 3.93f

    .line 184
    .line 185
    .line 186
    const v13, -0x3fc47ae1    # -2.93f

    .line 187
    .line 188
    .line 189
    const/4 v14, 0x0

    .line 190
    const v15, -0x3f50a3d7    # -5.48f

    .line 191
    .line 192
    .line 193
    const v16, 0x3fca3d71    # 1.58f

    .line 194
    .line 195
    .line 196
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 197
    .line 198
    .line 199
    const v17, 0x3f2b851f    # 0.67f

    .line 200
    .line 201
    .line 202
    const v18, 0x40047ae1    # 2.07f

    .line 203
    .line 204
    .line 205
    const v13, 0x3e947ae1    # 0.29f

    .line 206
    .line 207
    .line 208
    const v14, 0x3f28f5c3    # 0.66f

    .line 209
    .line 210
    .line 211
    const v15, 0x3f07ae14    # 0.53f

    .line 212
    .line 213
    .line 214
    const v16, 0x3faccccd    # 1.35f

    .line 215
    .line 216
    .line 217
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 218
    .line 219
    .line 220
    const v17, 0x3e4ccccd    # 0.2f

    .line 221
    .line 222
    .line 223
    const/high16 v18, 0x40000000    # 2.0f

    .line 224
    .line 225
    const v13, 0x3e051eb8    # 0.13f

    .line 226
    .line 227
    .line 228
    const v14, 0x3f266666    # 0.65f

    .line 229
    .line 230
    .line 231
    const v15, 0x3e4ccccd    # 0.2f

    .line 232
    .line 233
    .line 234
    const v16, 0x3fa8f5c3    # 1.32f

    .line 235
    .line 236
    .line 237
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 238
    .line 239
    .line 240
    const/high16 v0, 0x40000000    # 2.0f

    .line 241
    .line 242
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 243
    .line 244
    .line 245
    const/high16 v0, 0x40c00000    # 6.0f

    .line 246
    .line 247
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 248
    .line 249
    .line 250
    const/high16 v0, -0x40000000    # -2.0f

    .line 251
    .line 252
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 253
    .line 254
    .line 255
    const/high16 v0, -0x3f480000    # -5.75f

    .line 256
    .line 257
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 258
    .line 259
    .line 260
    const/high16 v17, 0x41b00000    # 22.0f

    .line 261
    .line 262
    const v18, 0x414428f6    # 12.26f

    .line 263
    .line 264
    .line 265
    const v13, 0x4187d70a    # 16.98f

    .line 266
    .line 267
    .line 268
    const v14, 0x41730a3d    # 15.19f

    .line 269
    .line 270
    .line 271
    const v15, 0x4199851f    # 19.19f

    .line 272
    .line 273
    .line 274
    const v16, 0x414fd70a    # 12.99f

    .line 275
    .line 276
    .line 277
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 278
    .line 279
    .line 280
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 281
    .line 282
    .line 283
    const v0, 0x417a3d71    # 15.64f

    .line 284
    .line 285
    .line 286
    const v2, 0x413051ec    # 11.02f

    .line 287
    .line 288
    .line 289
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 290
    .line 291
    .line 292
    const v17, 0x4082e148    # 4.09f

    .line 293
    .line 294
    .line 295
    const/high16 v18, -0x3f600000    # -5.0f

    .line 296
    .line 297
    const v13, 0x3f47ae14    # 0.78f

    .line 298
    .line 299
    .line 300
    const v14, -0x3ffa3d71    # -2.09f

    .line 301
    .line 302
    .line 303
    const v15, 0x400eb852    # 2.23f

    .line 304
    .line 305
    .line 306
    const v16, -0x3f8a3d71    # -3.84f

    .line 307
    .line 308
    .line 309
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 310
    .line 311
    .line 312
    const/high16 v17, 0x41400000    # 12.0f

    .line 313
    .line 314
    const/high16 v18, 0x41600000    # 14.0f

    .line 315
    .line 316
    const v13, 0x41770a3d    # 15.44f

    .line 317
    .line 318
    .line 319
    const v14, 0x40c51eb8    # 6.16f

    .line 320
    .line 321
    .line 322
    const/high16 v15, 0x41400000    # 12.0f

    .line 323
    .line 324
    const v16, 0x411ab852    # 9.67f

    .line 325
    .line 326
    .line 327
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 328
    .line 329
    .line 330
    const/16 v17, 0x0

    .line 331
    .line 332
    const v18, 0x3ca3d70a    # 0.02f

    .line 333
    .line 334
    .line 335
    const/4 v13, 0x0

    .line 336
    const v14, 0x3c23d70a    # 0.01f

    .line 337
    .line 338
    .line 339
    const/4 v15, 0x0

    .line 340
    const v16, 0x3ca3d70a    # 0.02f

    .line 341
    .line 342
    .line 343
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 344
    .line 345
    .line 346
    const v17, 0x417a3d71    # 15.64f

    .line 347
    .line 348
    .line 349
    const v18, 0x413051ec    # 11.02f

    .line 350
    .line 351
    .line 352
    const v13, 0x414f3333    # 12.95f

    .line 353
    .line 354
    .line 355
    const/high16 v14, 0x414c0000    # 12.75f

    .line 356
    .line 357
    const v15, 0x41633333    # 14.2f

    .line 358
    .line 359
    .line 360
    const v16, 0x413b851f    # 11.72f

    .line 361
    .line 362
    .line 363
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 364
    .line 365
    .line 366
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 367
    .line 368
    .line 369
    const v0, 0x4136b852    # 11.42f

    .line 370
    .line 371
    .line 372
    const v2, 0x410d999a    # 8.85f

    .line 373
    .line 374
    .line 375
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 376
    .line 377
    .line 378
    const v17, 0x40d66666    # 6.7f

    .line 379
    .line 380
    .line 381
    const/high16 v18, 0x40800000    # 4.0f

    .line 382
    .line 383
    const v13, 0x412947ae    # 10.58f

    .line 384
    .line 385
    .line 386
    const v14, 0x40d51eb8    # 6.66f

    .line 387
    .line 388
    .line 389
    const v15, 0x410e147b    # 8.88f

    .line 390
    .line 391
    .line 392
    const v16, 0x409c7ae1    # 4.89f

    .line 393
    .line 394
    .line 395
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 396
    .line 397
    .line 398
    const/high16 v17, 0x41100000    # 9.0f

    .line 399
    .line 400
    const v18, 0x412b5c29    # 10.71f

    .line 401
    .line 402
    .line 403
    const v13, 0x41023d71    # 8.14f

    .line 404
    .line 405
    .line 406
    const v14, 0x40bb851f    # 5.86f

    .line 407
    .line 408
    .line 409
    const/high16 v15, 0x41100000    # 9.0f

    .line 410
    .line 411
    const v16, 0x4102e148    # 8.18f

    .line 412
    .line 413
    .line 414
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 415
    .line 416
    .line 417
    const v17, -0x42dc28f6    # -0.04f

    .line 418
    .line 419
    .line 420
    const v18, 0x3f1c28f6    # 0.61f

    .line 421
    .line 422
    .line 423
    const/4 v13, 0x0

    .line 424
    const v14, 0x3e570a3d    # 0.21f

    .line 425
    .line 426
    .line 427
    const v15, -0x430a3d71    # -0.03f

    .line 428
    .line 429
    .line 430
    const v16, 0x3ed1eb85    # 0.41f

    .line 431
    .line 432
    .line 433
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 434
    .line 435
    .line 436
    const v17, 0x3f9c28f6    # 1.22f

    .line 437
    .line 438
    .line 439
    const v18, 0x3f51eb85    # 0.82f

    .line 440
    .line 441
    .line 442
    const v13, 0x3edc28f6    # 0.43f

    .line 443
    .line 444
    .line 445
    const v14, 0x3e75c28f    # 0.24f

    .line 446
    .line 447
    .line 448
    const v15, 0x3f547ae1    # 0.83f

    .line 449
    .line 450
    .line 451
    const v16, 0x3f051eb8    # 0.52f

    .line 452
    .line 453
    .line 454
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 455
    .line 456
    .line 457
    const v17, 0x4136b852    # 11.42f

    .line 458
    .line 459
    .line 460
    const v18, 0x410d999a    # 8.85f

    .line 461
    .line 462
    .line 463
    const v13, 0x41263d71    # 10.39f

    .line 464
    .line 465
    .line 466
    const v14, 0x412f5c29    # 10.96f

    .line 467
    .line 468
    .line 469
    const v15, 0x412d47ae    # 10.83f

    .line 470
    .line 471
    .line 472
    const v16, 0x411d999a    # 9.85f

    .line 473
    .line 474
    .line 475
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 476
    .line 477
    .line 478
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 479
    .line 480
    .line 481
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 482
    .line 483
    .line 484
    move-result-object v2

    .line 485
    const/16 v16, 0x3800

    .line 486
    .line 487
    const/16 v17, 0x0

    .line 488
    .line 489
    const/high16 v6, 0x3f800000    # 1.0f

    .line 490
    .line 491
    const/high16 v8, 0x3f800000    # 1.0f

    .line 492
    .line 493
    const/4 v7, 0x0

    .line 494
    const/high16 v9, 0x3f800000    # 1.0f

    .line 495
    .line 496
    const/high16 v12, 0x3f800000    # 1.0f

    .line 497
    .line 498
    const/4 v13, 0x0

    .line 499
    const/4 v14, 0x0

    .line 500
    const/4 v15, 0x0

    .line 501
    const-string v4, ""

    .line 502
    .line 503
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 504
    .line 505
    .line 506
    move-result-object v0

    .line 507
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 508
    .line 509
    .line 510
    move-result-object v0

    .line 511
    sput-object v0, Landroidx/compose/material/icons/outlined/GrassKt;->_grass:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 512
    .line 513
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 514
    .line 515
    .line 516
    return-object v0
.end method
