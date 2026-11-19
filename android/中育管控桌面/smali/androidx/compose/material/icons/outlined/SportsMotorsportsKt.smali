.class public final Landroidx/compose/material/icons/outlined/SportsMotorsportsKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_sportsMotorsports",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "SportsMotorsports",
        "Landroidx/compose/material/icons/Icons$Outlined;",
        "getSportsMotorsports",
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
        "SMAP\nSportsMotorsports.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SportsMotorsports.kt\nandroidx/compose/material/icons/outlined/SportsMotorsportsKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,68:1\n212#2,12:69\n233#2,18:82\n253#2:119\n174#3:81\n705#4,2:100\n717#4,2:102\n719#4,11:108\n72#5,4:104\n*S KotlinDebug\n*F\n+ 1 SportsMotorsports.kt\nandroidx/compose/material/icons/outlined/SportsMotorsportsKt\n*L\n29#1:69,12\n30#1:82,18\n30#1:119\n29#1:81\n30#1:100,2\n30#1:102,2\n30#1:108,11\n30#1:104,4\n*E\n"
    }
.end annotation


# static fields
.field private static _sportsMotorsports:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getSportsMotorsports(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/outlined/SportsMotorsportsKt;->_sportsMotorsports:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Outlined.SportsMotorsports"

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
    const v0, 0x41afae14    # 21.96f

    .line 71
    .line 72
    .line 73
    const v2, 0x4133851f    # 11.22f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v17, 0x4158f5c3    # 13.56f

    .line 80
    .line 81
    .line 82
    const/high16 v18, 0x40800000    # 4.0f

    .line 83
    .line 84
    const v13, 0x41ac8f5c    # 21.57f

    .line 85
    .line 86
    .line 87
    const v14, 0x40e051ec    # 7.01f

    .line 88
    .line 89
    .line 90
    const v15, 0x418e147b    # 17.76f

    .line 91
    .line 92
    .line 93
    const/high16 v16, 0x40800000    # 4.0f

    .line 94
    .line 95
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 96
    .line 97
    .line 98
    const v17, -0x40ee147b    # -0.57f

    .line 99
    .line 100
    .line 101
    const v18, 0x3ca3d70a    # 0.02f

    .line 102
    .line 103
    .line 104
    const v13, -0x41bd70a4    # -0.19f

    .line 105
    .line 106
    .line 107
    const/4 v14, 0x0

    .line 108
    const v15, -0x413d70a4    # -0.38f

    .line 109
    .line 110
    .line 111
    const v16, 0x3c23d70a    # 0.01f

    .line 112
    .line 113
    .line 114
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 115
    .line 116
    .line 117
    const/high16 v17, 0x40000000    # 2.0f

    .line 118
    .line 119
    const v18, 0x4189999a    # 17.2f

    .line 120
    .line 121
    .line 122
    const/high16 v13, 0x40000000    # 2.0f

    .line 123
    .line 124
    const v14, 0x4097ae14    # 4.74f

    .line 125
    .line 126
    .line 127
    const/high16 v15, 0x40000000    # 2.0f

    .line 128
    .line 129
    const v16, 0x4189999a    # 17.2f

    .line 130
    .line 131
    .line 132
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 133
    .line 134
    .line 135
    const/high16 v0, 0x41900000    # 18.0f

    .line 136
    .line 137
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 138
    .line 139
    .line 140
    const/high16 v18, 0x40000000    # 2.0f

    .line 141
    .line 142
    const/4 v13, 0x0

    .line 143
    const v14, 0x3f8ccccd    # 1.1f

    .line 144
    .line 145
    .line 146
    const v15, 0x3f666666    # 0.9f

    .line 147
    .line 148
    .line 149
    const/high16 v16, 0x40000000    # 2.0f

    .line 150
    .line 151
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 152
    .line 153
    .line 154
    const/high16 v0, 0x41200000    # 10.0f

    .line 155
    .line 156
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 157
    .line 158
    .line 159
    const v17, 0x41afae14    # 21.96f

    .line 160
    .line 161
    .line 162
    const v18, 0x4133851f    # 11.22f

    .line 163
    .line 164
    .line 165
    const v13, 0x41955c29    # 18.67f

    .line 166
    .line 167
    .line 168
    const/high16 v14, 0x41a00000    # 20.0f

    .line 169
    .line 170
    const v15, 0x41b347ae    # 22.41f

    .line 171
    .line 172
    .line 173
    const v16, 0x417fd70a    # 15.99f

    .line 174
    .line 175
    .line 176
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 177
    .line 178
    .line 179
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 180
    .line 181
    .line 182
    const v0, 0x40a851ec    # 5.26f

    .line 183
    .line 184
    .line 185
    const v2, 0x4138f5c3    # 11.56f

    .line 186
    .line 187
    .line 188
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 189
    .line 190
    .line 191
    const v17, 0x4008f5c3    # 2.14f

    .line 192
    .line 193
    .line 194
    const v18, -0x3fb3d70a    # -3.19f

    .line 195
    .line 196
    .line 197
    const v13, 0x3f11eb85    # 0.57f

    .line 198
    .line 199
    .line 200
    const v14, -0x405ae148    # -1.29f

    .line 201
    .line 202
    .line 203
    const v15, 0x3fa3d70a    # 1.28f

    .line 204
    .line 205
    .line 206
    const v16, -0x3fe9999a    # -2.35f

    .line 207
    .line 208
    .line 209
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 210
    .line 211
    .line 212
    const v0, 0x4067ae14    # 3.62f

    .line 213
    .line 214
    .line 215
    const v2, 0x3fc3d70a    # 1.53f

    .line 216
    .line 217
    .line 218
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 219
    .line 220
    .line 221
    const v17, 0x3f7ae148    # 0.98f

    .line 222
    .line 223
    .line 224
    const v18, 0x3fbd70a4    # 1.48f

    .line 225
    .line 226
    .line 227
    const v13, 0x3f19999a    # 0.6f

    .line 228
    .line 229
    .line 230
    const/high16 v14, 0x3e800000    # 0.25f

    .line 231
    .line 232
    const v15, 0x3f7ae148    # 0.98f

    .line 233
    .line 234
    .line 235
    const v16, 0x3f547ae1    # 0.83f

    .line 236
    .line 237
    .line 238
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 239
    .line 240
    .line 241
    const v17, -0x4031eb85    # -1.61f

    .line 242
    .line 243
    .line 244
    const v18, 0x3fce147b    # 1.61f

    .line 245
    .line 246
    .line 247
    const/4 v13, 0x0

    .line 248
    const v14, 0x3f63d70a    # 0.89f

    .line 249
    .line 250
    .line 251
    const v15, -0x40c7ae14    # -0.72f

    .line 252
    .line 253
    .line 254
    const v16, 0x3fce147b    # 1.61f

    .line 255
    .line 256
    .line 257
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 258
    .line 259
    .line 260
    const v0, 0x40970a3d    # 4.72f

    .line 261
    .line 262
    .line 263
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 264
    .line 265
    .line 266
    const v17, 0x40a851ec    # 5.26f

    .line 267
    .line 268
    .line 269
    const v18, 0x4138f5c3    # 11.56f

    .line 270
    .line 271
    .line 272
    const v13, 0x409bd70a    # 4.87f

    .line 273
    .line 274
    .line 275
    const v14, 0x41487ae1    # 12.53f

    .line 276
    .line 277
    .line 278
    const v15, 0x40a147ae    # 5.04f

    .line 279
    .line 280
    .line 281
    const v16, 0x4140cccd    # 12.05f

    .line 282
    .line 283
    .line 284
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 285
    .line 286
    .line 287
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 288
    .line 289
    .line 290
    const v0, 0x4193851f    # 18.44f

    .line 291
    .line 292
    .line 293
    const v2, 0x418051ec    # 16.04f

    .line 294
    .line 295
    .line 296
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 297
    .line 298
    .line 299
    const/high16 v17, 0x41600000    # 14.0f

    .line 300
    .line 301
    const/high16 v18, 0x41900000    # 18.0f

    .line 302
    .line 303
    const v13, 0x418a6666    # 17.3f

    .line 304
    .line 305
    .line 306
    const v14, 0x418a51ec    # 17.29f

    .line 307
    .line 308
    .line 309
    const v15, 0x417ae148    # 15.68f

    .line 310
    .line 311
    .line 312
    const/high16 v16, 0x41900000    # 18.0f

    .line 313
    .line 314
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 315
    .line 316
    .line 317
    const/high16 v0, 0x40800000    # 4.0f

    .line 318
    .line 319
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 320
    .line 321
    .line 322
    const v0, -0x40b33333    # -0.8f

    .line 323
    .line 324
    .line 325
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 326
    .line 327
    .line 328
    const v17, 0x3e75c28f    # 0.24f

    .line 329
    .line 330
    .line 331
    const v18, -0x3ff33333    # -2.2f

    .line 332
    .line 333
    .line 334
    const/4 v13, 0x0

    .line 335
    const v14, -0x435c28f6    # -0.02f

    .line 336
    .line 337
    .line 338
    const v15, 0x3c23d70a    # 0.01f

    .line 339
    .line 340
    .line 341
    const v16, -0x40947ae1    # -0.92f

    .line 342
    .line 343
    .line 344
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 345
    .line 346
    .line 347
    const v0, 0x40c4cccd    # 6.15f

    .line 348
    .line 349
    .line 350
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 351
    .line 352
    .line 353
    const v17, 0x40670a3d    # 3.61f

    .line 354
    .line 355
    .line 356
    const v18, -0x3f98f5c3    # -3.61f

    .line 357
    .line 358
    .line 359
    const v13, 0x3ffeb852    # 1.99f

    .line 360
    .line 361
    .line 362
    const/4 v14, 0x0

    .line 363
    const v15, 0x40670a3d    # 3.61f

    .line 364
    .line 365
    .line 366
    const v16, -0x4030a3d7    # -1.62f

    .line 367
    .line 368
    .line 369
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 370
    .line 371
    .line 372
    const v17, -0x3ff33333    # -2.2f

    .line 373
    .line 374
    .line 375
    const v18, -0x3fab851f    # -3.32f

    .line 376
    .line 377
    .line 378
    const/4 v13, 0x0

    .line 379
    const v14, -0x40466666    # -1.45f

    .line 380
    .line 381
    .line 382
    const v15, -0x40a147ae    # -0.87f

    .line 383
    .line 384
    .line 385
    const v16, -0x3fcf5c29    # -2.76f

    .line 386
    .line 387
    .line 388
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 389
    .line 390
    .line 391
    const v0, 0x4114cccd    # 9.3f

    .line 392
    .line 393
    .line 394
    const v2, 0x40e051ec    # 7.01f

    .line 395
    .line 396
    .line 397
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 398
    .line 399
    .line 400
    const v17, 0x40747ae1    # 3.82f

    .line 401
    .line 402
    .line 403
    const v18, -0x40828f5c    # -0.99f

    .line 404
    .line 405
    .line 406
    const v13, 0x3f8ccccd    # 1.1f

    .line 407
    .line 408
    .line 409
    const v14, -0x40ee147b    # -0.57f

    .line 410
    .line 411
    .line 412
    const v15, 0x4017ae14    # 2.37f

    .line 413
    .line 414
    .line 415
    const v16, -0x4099999a    # -0.9f

    .line 416
    .line 417
    .line 418
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 419
    .line 420
    .line 421
    const v17, 0x4158f5c3    # 13.56f

    .line 422
    .line 423
    .line 424
    const/high16 v18, 0x40c00000    # 6.0f

    .line 425
    .line 426
    const v13, 0x415451ec    # 13.27f

    .line 427
    .line 428
    .line 429
    const/high16 v14, 0x40c00000    # 6.0f

    .line 430
    .line 431
    const v15, 0x4156b852    # 13.42f

    .line 432
    .line 433
    .line 434
    const/high16 v16, 0x40c00000    # 6.0f

    .line 435
    .line 436
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 437
    .line 438
    .line 439
    const v17, 0x40cd1eb8    # 6.41f

    .line 440
    .line 441
    .line 442
    const v18, 0x40ad1eb8    # 5.41f

    .line 443
    .line 444
    .line 445
    const v13, 0x4053d70a    # 3.31f

    .line 446
    .line 447
    .line 448
    const/4 v14, 0x0

    .line 449
    const v15, 0x40c428f6    # 6.13f

    .line 450
    .line 451
    .line 452
    const v16, 0x4017ae14    # 2.37f

    .line 453
    .line 454
    .line 455
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 456
    .line 457
    .line 458
    const v17, 0x4193851f    # 18.44f

    .line 459
    .line 460
    .line 461
    const v18, 0x418051ec    # 16.04f

    .line 462
    .line 463
    .line 464
    const v13, 0x41a10a3d    # 20.13f

    .line 465
    .line 466
    .line 467
    const v14, 0x4152147b    # 13.13f

    .line 468
    .line 469
    .line 470
    const v15, 0x419cb852    # 19.59f

    .line 471
    .line 472
    .line 473
    const v16, 0x416c51ec    # 14.77f

    .line 474
    .line 475
    .line 476
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 477
    .line 478
    .line 479
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 480
    .line 481
    .line 482
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 483
    .line 484
    .line 485
    move-result-object v2

    .line 486
    const/16 v16, 0x3800

    .line 487
    .line 488
    const/16 v17, 0x0

    .line 489
    .line 490
    const/high16 v6, 0x3f800000    # 1.0f

    .line 491
    .line 492
    const/high16 v8, 0x3f800000    # 1.0f

    .line 493
    .line 494
    const/4 v7, 0x0

    .line 495
    const/high16 v9, 0x3f800000    # 1.0f

    .line 496
    .line 497
    const/high16 v12, 0x3f800000    # 1.0f

    .line 498
    .line 499
    const/4 v13, 0x0

    .line 500
    const/4 v14, 0x0

    .line 501
    const/4 v15, 0x0

    .line 502
    const-string v4, ""

    .line 503
    .line 504
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 505
    .line 506
    .line 507
    move-result-object v0

    .line 508
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 509
    .line 510
    .line 511
    move-result-object v0

    .line 512
    sput-object v0, Landroidx/compose/material/icons/outlined/SportsMotorsportsKt;->_sportsMotorsports:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 513
    .line 514
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 515
    .line 516
    .line 517
    return-object v0
.end method
