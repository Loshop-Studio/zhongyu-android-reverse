.class public final Landroidx/compose/material/icons/rounded/AddTaskKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_addTask",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "AddTask",
        "Landroidx/compose/material/icons/Icons$Rounded;",
        "getAddTask",
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
        "SMAP\nAddTask.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AddTask.kt\nandroidx/compose/material/icons/rounded/AddTaskKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,88:1\n212#2,12:89\n233#2,18:102\n253#2:139\n174#3:101\n705#4,2:120\n717#4,2:122\n719#4,11:128\n72#5,4:124\n*S KotlinDebug\n*F\n+ 1 AddTask.kt\nandroidx/compose/material/icons/rounded/AddTaskKt\n*L\n29#1:89,12\n30#1:102,18\n30#1:139\n29#1:101\n30#1:120,2\n30#1:122,2\n30#1:128,11\n30#1:124,4\n*E\n"
    }
.end annotation


# static fields
.field private static _addTask:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getAddTask(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/AddTaskKt;->_addTask:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.AddTask"

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
    const v0, 0x41aa51ec    # 21.29f

    .line 71
    .line 72
    .line 73
    const v2, 0x40bc7ae1    # 5.89f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const/high16 v0, -0x3ee00000    # -10.0f

    .line 80
    .line 81
    const/high16 v2, 0x41200000    # 10.0f

    .line 82
    .line 83
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 84
    .line 85
    .line 86
    const v17, -0x404b851f    # -1.41f

    .line 87
    .line 88
    .line 89
    const/16 v18, 0x0

    .line 90
    .line 91
    const v13, -0x413851ec    # -0.39f

    .line 92
    .line 93
    .line 94
    const v14, 0x3ec7ae14    # 0.39f

    .line 95
    .line 96
    .line 97
    const v15, -0x407d70a4    # -1.02f

    .line 98
    .line 99
    .line 100
    const v16, 0x3ec7ae14    # 0.39f

    .line 101
    .line 102
    .line 103
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 104
    .line 105
    .line 106
    const v0, -0x3fcae148    # -2.83f

    .line 107
    .line 108
    .line 109
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 110
    .line 111
    .line 112
    const/16 v17, 0x0

    .line 113
    .line 114
    const v18, -0x404b851f    # -1.41f

    .line 115
    .line 116
    .line 117
    const v14, -0x413851ec    # -0.39f

    .line 118
    .line 119
    .line 120
    const v15, -0x413851ec    # -0.39f

    .line 121
    .line 122
    .line 123
    const v16, -0x407d70a4    # -1.02f

    .line 124
    .line 125
    .line 126
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 127
    .line 128
    .line 129
    const/4 v0, 0x0

    .line 130
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 131
    .line 132
    .line 133
    const v17, 0x3fb47ae1    # 1.41f

    .line 134
    .line 135
    .line 136
    const/16 v18, 0x0

    .line 137
    .line 138
    const v13, 0x3ec7ae14    # 0.39f

    .line 139
    .line 140
    .line 141
    const v15, 0x3f828f5c    # 1.02f

    .line 142
    .line 143
    .line 144
    const v16, -0x413851ec    # -0.39f

    .line 145
    .line 146
    .line 147
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 148
    .line 149
    .line 150
    const v0, 0x4007ae14    # 2.12f

    .line 151
    .line 152
    .line 153
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 154
    .line 155
    .line 156
    const v0, 0x4114a3d7    # 9.29f

    .line 157
    .line 158
    .line 159
    const v2, -0x3eeb5c29    # -9.29f

    .line 160
    .line 161
    .line 162
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 163
    .line 164
    .line 165
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 166
    .line 167
    .line 168
    const/4 v0, 0x0

    .line 169
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 170
    .line 171
    .line 172
    const v17, 0x41aa51ec    # 21.29f

    .line 173
    .line 174
    .line 175
    const v18, 0x40bc7ae1    # 5.89f

    .line 176
    .line 177
    .line 178
    const v13, 0x41ad70a4    # 21.68f

    .line 179
    .line 180
    .line 181
    const v14, 0x409bd70a    # 4.87f

    .line 182
    .line 183
    .line 184
    const v15, 0x41ad70a4    # 21.68f

    .line 185
    .line 186
    .line 187
    const/high16 v16, 0x40b00000    # 5.5f

    .line 188
    .line 189
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 190
    .line 191
    .line 192
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 193
    .line 194
    .line 195
    const/high16 v0, 0x41400000    # 12.0f

    .line 196
    .line 197
    const/high16 v2, 0x41a00000    # 20.0f

    .line 198
    .line 199
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 200
    .line 201
    .line 202
    const v17, -0x3f01999a    # -7.95f

    .line 203
    .line 204
    .line 205
    const v18, -0x3ef1999a    # -8.9f

    .line 206
    .line 207
    .line 208
    const v13, -0x3f6947ae    # -4.71f

    .line 209
    .line 210
    .line 211
    const/4 v14, 0x0

    .line 212
    const v15, -0x3ef851ec    # -8.48f

    .line 213
    .line 214
    .line 215
    const v16, -0x3f7d1eb8    # -4.09f

    .line 216
    .line 217
    .line 218
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 219
    .line 220
    .line 221
    const v17, 0x40d3851f    # 6.61f

    .line 222
    .line 223
    .line 224
    const v18, -0x3f2051ec    # -6.99f

    .line 225
    .line 226
    .line 227
    const v13, 0x3ec7ae14    # 0.39f

    .line 228
    .line 229
    .line 230
    const v14, -0x3f9eb852    # -3.52f

    .line 231
    .line 232
    .line 233
    const v15, 0x4047ae14    # 3.12f

    .line 234
    .line 235
    .line 236
    const v16, -0x3f32e148    # -6.41f

    .line 237
    .line 238
    .line 239
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 240
    .line 241
    .line 242
    const v17, 0x409fae14    # 4.99f

    .line 243
    .line 244
    .line 245
    const v18, 0x3f47ae14    # 0.78f

    .line 246
    .line 247
    .line 248
    const v13, 0x3fe7ae14    # 1.81f

    .line 249
    .line 250
    .line 251
    const v14, -0x41666666    # -0.3f

    .line 252
    .line 253
    .line 254
    const v15, 0x4061eb85    # 3.53f

    .line 255
    .line 256
    .line 257
    const v16, 0x3ca3d70a    # 0.02f

    .line 258
    .line 259
    .line 260
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 261
    .line 262
    .line 263
    const v17, 0x3f95c28f    # 1.17f

    .line 264
    .line 265
    .line 266
    const v18, -0x41c7ae14    # -0.18f

    .line 267
    .line 268
    .line 269
    const v13, 0x3ec7ae14    # 0.39f

    .line 270
    .line 271
    .line 272
    const v14, 0x3e4ccccd    # 0.2f

    .line 273
    .line 274
    .line 275
    const v15, 0x3f5c28f6    # 0.86f

    .line 276
    .line 277
    .line 278
    const v16, 0x3e051eb8    # 0.13f

    .line 279
    .line 280
    .line 281
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 282
    .line 283
    .line 284
    const/4 v0, 0x0

    .line 285
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 286
    .line 287
    .line 288
    const v17, -0x418a3d71    # -0.24f

    .line 289
    .line 290
    .line 291
    const v18, -0x40333333    # -1.6f

    .line 292
    .line 293
    .line 294
    const v13, 0x3ef5c28f    # 0.48f

    .line 295
    .line 296
    .line 297
    const v14, -0x410a3d71    # -0.48f

    .line 298
    .line 299
    .line 300
    const v15, 0x3eb851ec    # 0.36f

    .line 301
    .line 302
    .line 303
    const v16, -0x405ae148    # -1.29f

    .line 304
    .line 305
    .line 306
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 307
    .line 308
    .line 309
    const v17, 0x413ae148    # 11.68f

    .line 310
    .line 311
    .line 312
    const/high16 v18, 0x40000000    # 2.0f

    .line 313
    .line 314
    const v13, 0x4171c28f    # 15.11f

    .line 315
    .line 316
    .line 317
    const v14, 0x40170a3d    # 2.36f

    .line 318
    .line 319
    .line 320
    const v15, 0x41573333    # 13.45f

    .line 321
    .line 322
    .line 323
    const v16, 0x3ff9999a    # 1.95f

    .line 324
    .line 325
    .line 326
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 327
    .line 328
    .line 329
    const v17, -0x3ee547ae    # -9.67f

    .line 330
    .line 331
    .line 332
    const v18, 0x4117851f    # 9.47f

    .line 333
    .line 334
    .line 335
    const v13, -0x3f5b851f    # -5.14f

    .line 336
    .line 337
    .line 338
    const v14, 0x3e23d70a    # 0.16f

    .line 339
    .line 340
    .line 341
    const v15, -0x3ee970a4    # -9.41f

    .line 342
    .line 343
    .line 344
    const v16, 0x408ae148    # 4.34f

    .line 345
    .line 346
    .line 347
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 348
    .line 349
    .line 350
    const/high16 v17, 0x41400000    # 12.0f

    .line 351
    .line 352
    const/high16 v18, 0x41b00000    # 22.0f

    .line 353
    .line 354
    const v13, 0x3fdc28f6    # 1.72f

    .line 355
    .line 356
    .line 357
    const v14, 0x4189eb85    # 17.24f

    .line 358
    .line 359
    .line 360
    const v15, 0x40c9999a    # 6.3f

    .line 361
    .line 362
    .line 363
    const/high16 v16, 0x41b00000    # 22.0f

    .line 364
    .line 365
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 366
    .line 367
    .line 368
    const v17, 0x405a3d71    # 3.41f

    .line 369
    .line 370
    .line 371
    const v18, -0x40e66666    # -0.6f

    .line 372
    .line 373
    .line 374
    const v13, 0x3f99999a    # 1.2f

    .line 375
    .line 376
    .line 377
    const/4 v14, 0x0

    .line 378
    const v15, 0x4015c28f    # 2.34f

    .line 379
    .line 380
    .line 381
    const v16, -0x41a8f5c3    # -0.21f

    .line 382
    .line 383
    .line 384
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 385
    .line 386
    .line 387
    const v17, 0x3eb33333    # 0.35f

    .line 388
    .line 389
    .line 390
    const v18, -0x402ccccd    # -1.65f

    .line 391
    .line 392
    .line 393
    const v13, 0x3f2e147b    # 0.68f

    .line 394
    .line 395
    .line 396
    const/high16 v14, -0x41800000    # -0.25f

    .line 397
    .line 398
    const v15, 0x3f5eb852    # 0.87f

    .line 399
    .line 400
    .line 401
    const v16, -0x406f5c29    # -1.13f

    .line 402
    .line 403
    .line 404
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 405
    .line 406
    .line 407
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 408
    .line 409
    .line 410
    const v17, -0x407ae148    # -1.04f

    .line 411
    .line 412
    .line 413
    const v18, -0x41947ae1    # -0.23f

    .line 414
    .line 415
    .line 416
    const v13, -0x4175c28f    # -0.27f

    .line 417
    .line 418
    .line 419
    const v14, -0x4175c28f    # -0.27f

    .line 420
    .line 421
    .line 422
    const v15, -0x40d1eb85    # -0.68f

    .line 423
    .line 424
    .line 425
    const v16, -0x41428f5c    # -0.37f

    .line 426
    .line 427
    .line 428
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 429
    .line 430
    .line 431
    const/high16 v17, 0x41400000    # 12.0f

    .line 432
    .line 433
    const/high16 v18, 0x41a00000    # 20.0f

    .line 434
    .line 435
    const v13, 0x415deb85    # 13.87f

    .line 436
    .line 437
    .line 438
    const v14, 0x419ea3d7    # 19.83f

    .line 439
    .line 440
    .line 441
    const v15, 0x414f3333    # 12.95f

    .line 442
    .line 443
    .line 444
    const/high16 v16, 0x41a00000    # 20.0f

    .line 445
    .line 446
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 447
    .line 448
    .line 449
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 450
    .line 451
    .line 452
    const/high16 v0, 0x41980000    # 19.0f

    .line 453
    .line 454
    const/high16 v2, 0x41700000    # 15.0f

    .line 455
    .line 456
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 457
    .line 458
    .line 459
    const/high16 v0, -0x40000000    # -2.0f

    .line 460
    .line 461
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 462
    .line 463
    .line 464
    const/high16 v17, -0x40800000    # -1.0f

    .line 465
    .line 466
    const/high16 v18, 0x3f800000    # 1.0f

    .line 467
    .line 468
    const v13, -0x40f33333    # -0.55f

    .line 469
    .line 470
    .line 471
    const/4 v14, 0x0

    .line 472
    const/high16 v15, -0x40800000    # -1.0f

    .line 473
    .line 474
    const v16, 0x3ee66666    # 0.45f

    .line 475
    .line 476
    .line 477
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 478
    .line 479
    .line 480
    const/4 v0, 0x0

    .line 481
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 482
    .line 483
    .line 484
    const/high16 v17, 0x3f800000    # 1.0f

    .line 485
    .line 486
    const/4 v13, 0x0

    .line 487
    const v14, 0x3f0ccccd    # 0.55f

    .line 488
    .line 489
    .line 490
    const v15, 0x3ee66666    # 0.45f

    .line 491
    .line 492
    .line 493
    const/high16 v16, 0x3f800000    # 1.0f

    .line 494
    .line 495
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 496
    .line 497
    .line 498
    const/high16 v0, 0x40000000    # 2.0f

    .line 499
    .line 500
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 501
    .line 502
    .line 503
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 504
    .line 505
    .line 506
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 507
    .line 508
    .line 509
    const/4 v0, 0x0

    .line 510
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 511
    .line 512
    .line 513
    const/high16 v18, -0x40800000    # -1.0f

    .line 514
    .line 515
    const v13, 0x3f0ccccd    # 0.55f

    .line 516
    .line 517
    .line 518
    const/4 v14, 0x0

    .line 519
    const/high16 v15, 0x3f800000    # 1.0f

    .line 520
    .line 521
    const v16, -0x4119999a    # -0.45f

    .line 522
    .line 523
    .line 524
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 525
    .line 526
    .line 527
    const/high16 v0, -0x40000000    # -2.0f

    .line 528
    .line 529
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 530
    .line 531
    .line 532
    const/high16 v0, 0x40000000    # 2.0f

    .line 533
    .line 534
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 535
    .line 536
    .line 537
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 538
    .line 539
    .line 540
    const/4 v0, 0x0

    .line 541
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 542
    .line 543
    .line 544
    const/high16 v17, -0x40800000    # -1.0f

    .line 545
    .line 546
    const/4 v13, 0x0

    .line 547
    const v14, -0x40f33333    # -0.55f

    .line 548
    .line 549
    .line 550
    const v15, -0x4119999a    # -0.45f

    .line 551
    .line 552
    .line 553
    const/high16 v16, -0x40800000    # -1.0f

    .line 554
    .line 555
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 556
    .line 557
    .line 558
    const/high16 v0, -0x40000000    # -2.0f

    .line 559
    .line 560
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 561
    .line 562
    .line 563
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 564
    .line 565
    .line 566
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 567
    .line 568
    .line 569
    const/4 v0, 0x0

    .line 570
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 571
    .line 572
    .line 573
    const/high16 v18, 0x3f800000    # 1.0f

    .line 574
    .line 575
    const v13, -0x40f33333    # -0.55f

    .line 576
    .line 577
    .line 578
    const/4 v14, 0x0

    .line 579
    const/high16 v15, -0x40800000    # -1.0f

    .line 580
    .line 581
    const v16, 0x3ee66666    # 0.45f

    .line 582
    .line 583
    .line 584
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 585
    .line 586
    .line 587
    const/high16 v0, 0x41700000    # 15.0f

    .line 588
    .line 589
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 590
    .line 591
    .line 592
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 593
    .line 594
    .line 595
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 596
    .line 597
    .line 598
    move-result-object v2

    .line 599
    const/16 v16, 0x3800

    .line 600
    .line 601
    const/16 v17, 0x0

    .line 602
    .line 603
    const/high16 v6, 0x3f800000    # 1.0f

    .line 604
    .line 605
    const/high16 v8, 0x3f800000    # 1.0f

    .line 606
    .line 607
    const/4 v7, 0x0

    .line 608
    const/high16 v9, 0x3f800000    # 1.0f

    .line 609
    .line 610
    const/high16 v12, 0x3f800000    # 1.0f

    .line 611
    .line 612
    const/4 v13, 0x0

    .line 613
    const/4 v15, 0x0

    .line 614
    const-string v4, ""

    .line 615
    .line 616
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 617
    .line 618
    .line 619
    move-result-object v0

    .line 620
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 621
    .line 622
    .line 623
    move-result-object v0

    .line 624
    sput-object v0, Landroidx/compose/material/icons/rounded/AddTaskKt;->_addTask:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 625
    .line 626
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 627
    .line 628
    .line 629
    return-object v0
.end method
