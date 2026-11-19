.class public final Landroidx/compose/material/icons/rounded/PestControlKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_pestControl",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "PestControl",
        "Landroidx/compose/material/icons/Icons$Rounded;",
        "getPestControl",
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
        "SMAP\nPestControl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PestControl.kt\nandroidx/compose/material/icons/rounded/PestControlKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,102:1\n212#2,12:103\n233#2,18:116\n253#2:153\n174#3:115\n705#4,2:134\n717#4,2:136\n719#4,11:142\n72#5,4:138\n*S KotlinDebug\n*F\n+ 1 PestControl.kt\nandroidx/compose/material/icons/rounded/PestControlKt\n*L\n29#1:103,12\n30#1:116,18\n30#1:153\n29#1:115\n30#1:134,2\n30#1:136,2\n30#1:142,11\n30#1:138,4\n*E\n"
    }
.end annotation


# static fields
.field private static _pestControl:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getPestControl(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/PestControlKt;->_pestControl:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.PestControl"

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
    const/high16 v0, 0x41600000    # 14.0f

    .line 71
    .line 72
    const/high16 v2, 0x41a80000    # 21.0f

    .line 73
    .line 74
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 78
    .line 79
    .line 80
    const/high16 v17, -0x40800000    # -1.0f

    .line 81
    .line 82
    const/high16 v18, -0x40800000    # -1.0f

    .line 83
    .line 84
    const/4 v13, 0x0

    .line 85
    const v14, -0x40f33333    # -0.55f

    .line 86
    .line 87
    .line 88
    const v15, -0x4119999a    # -0.45f

    .line 89
    .line 90
    .line 91
    const/high16 v16, -0x40800000    # -1.0f

    .line 92
    .line 93
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 94
    .line 95
    .line 96
    const v0, -0x3ffb851f    # -2.07f

    .line 97
    .line 98
    .line 99
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 100
    .line 101
    .line 102
    const v17, -0x419eb852    # -0.22f

    .line 103
    .line 104
    .line 105
    const v18, -0x406e147b    # -1.14f

    .line 106
    .line 107
    .line 108
    const v13, -0x42b33333    # -0.05f

    .line 109
    .line 110
    .line 111
    const v14, -0x413851ec    # -0.39f

    .line 112
    .line 113
    .line 114
    const v15, -0x420a3d71    # -0.12f

    .line 115
    .line 116
    .line 117
    const v16, -0x40bae148    # -0.77f

    .line 118
    .line 119
    .line 120
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 121
    .line 122
    .line 123
    const v0, -0x40828f5c    # -0.99f

    .line 124
    .line 125
    .line 126
    const v2, 0x3fdc28f6    # 1.72f

    .line 127
    .line 128
    .line 129
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 130
    .line 131
    .line 132
    const v17, 0x3ebd70a4    # 0.37f

    .line 133
    .line 134
    .line 135
    const v18, -0x4050a3d7    # -1.37f

    .line 136
    .line 137
    .line 138
    const v13, 0x3ef5c28f    # 0.48f

    .line 139
    .line 140
    .line 141
    const v14, -0x4170a3d7    # -0.28f

    .line 142
    .line 143
    .line 144
    const v15, 0x3f23d70a    # 0.64f

    .line 145
    .line 146
    .line 147
    const v16, -0x409c28f6    # -0.89f

    .line 148
    .line 149
    .line 150
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 151
    .line 152
    .line 153
    const/4 v0, 0x0

    .line 154
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 155
    .line 156
    .line 157
    const v17, -0x4050a3d7    # -1.37f

    .line 158
    .line 159
    .line 160
    const v18, -0x41428f5c    # -0.37f

    .line 161
    .line 162
    .line 163
    const v13, -0x4170a3d7    # -0.28f

    .line 164
    .line 165
    .line 166
    const v14, -0x410a3d71    # -0.48f

    .line 167
    .line 168
    .line 169
    const v15, -0x409c28f6    # -0.89f

    .line 170
    .line 171
    .line 172
    const v16, -0x40dc28f6    # -0.64f

    .line 173
    .line 174
    .line 175
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 176
    .line 177
    .line 178
    const v0, 0x41875c29    # 16.92f

    .line 179
    .line 180
    .line 181
    const/high16 v2, 0x41200000    # 10.0f

    .line 182
    .line 183
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 184
    .line 185
    .line 186
    const v17, -0x40828f5c    # -0.99f

    .line 187
    .line 188
    .line 189
    const v18, -0x405ae148    # -1.29f

    .line 190
    .line 191
    .line 192
    const v15, -0x40e147ae    # -0.62f

    .line 193
    .line 194
    .line 195
    const v16, -0x40970a3d    # -0.91f

    .line 196
    .line 197
    .line 198
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 199
    .line 200
    .line 201
    const/high16 v17, 0x41800000    # 16.0f

    .line 202
    .line 203
    const/high16 v18, 0x41000000    # 8.0f

    .line 204
    .line 205
    const v13, 0x417f851f    # 15.97f

    .line 206
    .line 207
    .line 208
    const v14, 0x4107ae14    # 8.48f

    .line 209
    .line 210
    .line 211
    const/high16 v15, 0x41800000    # 16.0f

    .line 212
    .line 213
    const/high16 v16, 0x41040000    # 8.25f

    .line 214
    .line 215
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 216
    .line 217
    .line 218
    const v17, -0x40d9999a    # -0.65f

    .line 219
    .line 220
    .line 221
    const v18, -0x3ff47ae1    # -2.18f

    .line 222
    .line 223
    .line 224
    const/4 v13, 0x0

    .line 225
    const v14, -0x40b33333    # -0.8f

    .line 226
    .line 227
    .line 228
    const v15, -0x418a3d71    # -0.24f

    .line 229
    .line 230
    .line 231
    const v16, -0x4039999a    # -1.55f

    .line 232
    .line 233
    .line 234
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 235
    .line 236
    .line 237
    const v0, -0x408f5c29    # -0.94f

    .line 238
    .line 239
    .line 240
    const v2, 0x3f70a3d7    # 0.94f

    .line 241
    .line 242
    .line 243
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 244
    .line 245
    .line 246
    const/16 v17, 0x0

    .line 247
    .line 248
    const v18, -0x404b851f    # -1.41f

    .line 249
    .line 250
    .line 251
    const v13, 0x3ec7ae14    # 0.39f

    .line 252
    .line 253
    .line 254
    const v14, -0x413851ec    # -0.39f

    .line 255
    .line 256
    .line 257
    const v15, 0x3ec7ae14    # 0.39f

    .line 258
    .line 259
    .line 260
    const v16, -0x407d70a4    # -1.02f

    .line 261
    .line 262
    .line 263
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 264
    .line 265
    .line 266
    const/4 v0, 0x0

    .line 267
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 268
    .line 269
    .line 270
    const v17, -0x404b851f    # -1.41f

    .line 271
    .line 272
    .line 273
    const/16 v18, 0x0

    .line 274
    .line 275
    const v13, -0x413851ec    # -0.39f

    .line 276
    .line 277
    .line 278
    const v15, -0x407d70a4    # -1.02f

    .line 279
    .line 280
    .line 281
    const v16, -0x413851ec    # -0.39f

    .line 282
    .line 283
    .line 284
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 285
    .line 286
    .line 287
    const v0, -0x407d70a4    # -1.02f

    .line 288
    .line 289
    .line 290
    const v2, 0x3f828f5c    # 1.02f

    .line 291
    .line 292
    .line 293
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 294
    .line 295
    .line 296
    const v17, -0x3f9147ae    # -3.73f

    .line 297
    .line 298
    .line 299
    const v13, -0x4028f5c3    # -1.68f

    .line 300
    .line 301
    .line 302
    const v14, -0x409c28f6    # -0.89f

    .line 303
    .line 304
    .line 305
    const v15, -0x3fb9999a    # -3.1f

    .line 306
    .line 307
    .line 308
    const v16, -0x41570a3d    # -0.33f

    .line 309
    .line 310
    .line 311
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 312
    .line 313
    .line 314
    const v0, 0x4111eb85    # 9.12f

    .line 315
    .line 316
    .line 317
    const v2, 0x405d70a4    # 3.46f

    .line 318
    .line 319
    .line 320
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 321
    .line 322
    .line 323
    const v17, -0x404b851f    # -1.41f

    .line 324
    .line 325
    .line 326
    const v13, -0x413851ec    # -0.39f

    .line 327
    .line 328
    .line 329
    const v14, -0x413851ec    # -0.39f

    .line 330
    .line 331
    .line 332
    const v15, -0x407d70a4    # -1.02f

    .line 333
    .line 334
    .line 335
    const v16, -0x413851ec    # -0.39f

    .line 336
    .line 337
    .line 338
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 339
    .line 340
    .line 341
    const/4 v0, 0x0

    .line 342
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 343
    .line 344
    .line 345
    const/16 v17, 0x0

    .line 346
    .line 347
    const v18, 0x3fb47ae1    # 1.41f

    .line 348
    .line 349
    .line 350
    const v14, 0x3ec7ae14    # 0.39f

    .line 351
    .line 352
    .line 353
    const v15, -0x413851ec    # -0.39f

    .line 354
    .line 355
    .line 356
    const v16, 0x3f828f5c    # 1.02f

    .line 357
    .line 358
    .line 359
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 360
    .line 361
    .line 362
    const v0, 0x3f70a3d7    # 0.94f

    .line 363
    .line 364
    .line 365
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 366
    .line 367
    .line 368
    const/high16 v17, 0x41000000    # 8.0f

    .line 369
    .line 370
    const/high16 v18, 0x41000000    # 8.0f

    .line 371
    .line 372
    const v13, 0x4103d70a    # 8.24f

    .line 373
    .line 374
    .line 375
    const v14, 0x40ce6666    # 6.45f

    .line 376
    .line 377
    .line 378
    const/high16 v15, 0x41000000    # 8.0f

    .line 379
    .line 380
    const v16, 0x40e66666    # 7.2f

    .line 381
    .line 382
    .line 383
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 384
    .line 385
    .line 386
    const v17, 0x3d8f5c29    # 0.07f

    .line 387
    .line 388
    .line 389
    const v18, 0x3f3851ec    # 0.72f

    .line 390
    .line 391
    .line 392
    const/4 v13, 0x0

    .line 393
    const/high16 v14, 0x3e800000    # 0.25f

    .line 394
    .line 395
    const v15, 0x3cf5c28f    # 0.03f

    .line 396
    .line 397
    .line 398
    const v16, 0x3ef5c28f    # 0.48f

    .line 399
    .line 400
    .line 401
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 402
    .line 403
    .line 404
    const v17, 0x40e28f5c    # 7.08f

    .line 405
    .line 406
    .line 407
    const/high16 v18, 0x41200000    # 10.0f

    .line 408
    .line 409
    const v13, 0x40f66666    # 7.7f

    .line 410
    .line 411
    .line 412
    const v14, 0x4111999a    # 9.1f

    .line 413
    .line 414
    .line 415
    const v15, 0x40eb851f    # 7.36f

    .line 416
    .line 417
    .line 418
    const v16, 0x41187ae1    # 9.53f

    .line 419
    .line 420
    .line 421
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 422
    .line 423
    .line 424
    const v0, 0x40b23d71    # 5.57f

    .line 425
    .line 426
    .line 427
    const v2, 0x4112147b    # 9.13f

    .line 428
    .line 429
    .line 430
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 431
    .line 432
    .line 433
    const v17, 0x4086b852    # 4.21f

    .line 434
    .line 435
    .line 436
    const/high16 v18, 0x41180000    # 9.5f

    .line 437
    .line 438
    const v13, 0x40a2e148    # 5.09f

    .line 439
    .line 440
    .line 441
    const v14, 0x410dc28f    # 8.86f

    .line 442
    .line 443
    .line 444
    const v15, 0x408f5c29    # 4.48f

    .line 445
    .line 446
    .line 447
    const v16, 0x411051ec    # 9.02f

    .line 448
    .line 449
    .line 450
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 451
    .line 452
    .line 453
    const/4 v0, 0x0

    .line 454
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 455
    .line 456
    .line 457
    const v17, 0x3ebd70a4    # 0.37f

    .line 458
    .line 459
    .line 460
    const v18, 0x3faf5c29    # 1.37f

    .line 461
    .line 462
    .line 463
    const v13, -0x4170a3d7    # -0.28f

    .line 464
    .line 465
    .line 466
    const v14, 0x3ef5c28f    # 0.48f

    .line 467
    .line 468
    .line 469
    const v15, -0x421eb852    # -0.11f

    .line 470
    .line 471
    .line 472
    const v16, 0x3f8b851f    # 1.09f

    .line 473
    .line 474
    .line 475
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 476
    .line 477
    .line 478
    const v0, 0x3f7d70a4    # 0.99f

    .line 479
    .line 480
    .line 481
    const v2, 0x3fdc28f6    # 1.72f

    .line 482
    .line 483
    .line 484
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 485
    .line 486
    .line 487
    const v17, -0x419eb852    # -0.22f

    .line 488
    .line 489
    .line 490
    const v18, 0x3f91eb85    # 1.14f

    .line 491
    .line 492
    .line 493
    const v13, -0x42333333    # -0.1f

    .line 494
    .line 495
    .line 496
    const v14, 0x3ebd70a4    # 0.37f

    .line 497
    .line 498
    .line 499
    const v15, -0x41d1eb85    # -0.17f

    .line 500
    .line 501
    .line 502
    const/high16 v16, 0x3f400000    # 0.75f

    .line 503
    .line 504
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 505
    .line 506
    .line 507
    const/high16 v0, 0x40800000    # 4.0f

    .line 508
    .line 509
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 510
    .line 511
    .line 512
    const/high16 v17, -0x40800000    # -1.0f

    .line 513
    .line 514
    const/high16 v18, 0x3f800000    # 1.0f

    .line 515
    .line 516
    const v13, -0x40f33333    # -0.55f

    .line 517
    .line 518
    .line 519
    const/4 v14, 0x0

    .line 520
    const/high16 v15, -0x40800000    # -1.0f

    .line 521
    .line 522
    const v16, 0x3ee66666    # 0.45f

    .line 523
    .line 524
    .line 525
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 526
    .line 527
    .line 528
    const/4 v0, 0x0

    .line 529
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 530
    .line 531
    .line 532
    const/high16 v17, 0x3f800000    # 1.0f

    .line 533
    .line 534
    const/4 v13, 0x0

    .line 535
    const v14, 0x3f0ccccd    # 0.55f

    .line 536
    .line 537
    .line 538
    const v15, 0x3ee66666    # 0.45f

    .line 539
    .line 540
    .line 541
    const/high16 v16, 0x3f800000    # 1.0f

    .line 542
    .line 543
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 544
    .line 545
    .line 546
    const v0, 0x40047ae1    # 2.07f

    .line 547
    .line 548
    .line 549
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 550
    .line 551
    .line 552
    const v17, 0x3e6147ae    # 0.22f

    .line 553
    .line 554
    .line 555
    const v18, 0x3f91eb85    # 1.14f

    .line 556
    .line 557
    .line 558
    const v13, 0x3d4ccccd    # 0.05f

    .line 559
    .line 560
    .line 561
    const v14, 0x3ec7ae14    # 0.39f

    .line 562
    .line 563
    .line 564
    const v15, 0x3df5c28f    # 0.12f

    .line 565
    .line 566
    .line 567
    const v16, 0x3f451eb8    # 0.77f

    .line 568
    .line 569
    .line 570
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 571
    .line 572
    .line 573
    const v0, -0x4023d70a    # -1.72f

    .line 574
    .line 575
    .line 576
    const v2, 0x3f7d70a4    # 0.99f

    .line 577
    .line 578
    .line 579
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 580
    .line 581
    .line 582
    const v17, -0x41428f5c    # -0.37f

    .line 583
    .line 584
    .line 585
    const v18, 0x3faf5c29    # 1.37f

    .line 586
    .line 587
    .line 588
    const v13, -0x410a3d71    # -0.48f

    .line 589
    .line 590
    .line 591
    const v14, 0x3e8f5c29    # 0.28f

    .line 592
    .line 593
    .line 594
    const v15, -0x40dc28f6    # -0.64f

    .line 595
    .line 596
    .line 597
    const v16, 0x3f63d70a    # 0.89f

    .line 598
    .line 599
    .line 600
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 601
    .line 602
    .line 603
    const/4 v0, 0x0

    .line 604
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 605
    .line 606
    .line 607
    const v17, 0x3faf5c29    # 1.37f

    .line 608
    .line 609
    .line 610
    const v18, 0x3ebd70a4    # 0.37f

    .line 611
    .line 612
    .line 613
    const v13, 0x3e8f5c29    # 0.28f

    .line 614
    .line 615
    .line 616
    const v14, 0x3ef5c28f    # 0.48f

    .line 617
    .line 618
    .line 619
    const v15, 0x3f63d70a    # 0.89f

    .line 620
    .line 621
    .line 622
    const v16, 0x3f23d70a    # 0.64f

    .line 623
    .line 624
    .line 625
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 626
    .line 627
    .line 628
    const v0, 0x40e28f5c    # 7.08f

    .line 629
    .line 630
    .line 631
    const/high16 v2, 0x41900000    # 18.0f

    .line 632
    .line 633
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 634
    .line 635
    .line 636
    const v17, 0x409d70a4    # 4.92f

    .line 637
    .line 638
    .line 639
    const/high16 v18, 0x40400000    # 3.0f

    .line 640
    .line 641
    const v13, 0x3f8a3d71    # 1.08f

    .line 642
    .line 643
    .line 644
    const v14, 0x3fe7ae14    # 1.81f

    .line 645
    .line 646
    .line 647
    const v15, 0x403851ec    # 2.88f

    .line 648
    .line 649
    .line 650
    const/high16 v16, 0x40400000    # 3.0f

    .line 651
    .line 652
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 653
    .line 654
    .line 655
    const v0, 0x409d70a4    # 4.92f

    .line 656
    .line 657
    .line 658
    const/high16 v2, -0x3fc00000    # -3.0f

    .line 659
    .line 660
    const v4, 0x4075c28f    # 3.84f

    .line 661
    .line 662
    .line 663
    const v6, -0x4067ae14    # -1.19f

    .line 664
    .line 665
    .line 666
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 667
    .line 668
    .line 669
    const v0, 0x3fc147ae    # 1.51f

    .line 670
    .line 671
    .line 672
    const v2, 0x3f5eb852    # 0.87f

    .line 673
    .line 674
    .line 675
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 676
    .line 677
    .line 678
    const v17, 0x3faf5c29    # 1.37f

    .line 679
    .line 680
    .line 681
    const v18, -0x41428f5c    # -0.37f

    .line 682
    .line 683
    .line 684
    const v13, 0x3ef5c28f    # 0.48f

    .line 685
    .line 686
    .line 687
    const v14, 0x3e8f5c29    # 0.28f

    .line 688
    .line 689
    .line 690
    const v15, 0x3f8b851f    # 1.09f

    .line 691
    .line 692
    .line 693
    const v16, 0x3de147ae    # 0.11f

    .line 694
    .line 695
    .line 696
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 697
    .line 698
    .line 699
    const/4 v0, 0x0

    .line 700
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 701
    .line 702
    .line 703
    const v17, -0x41428f5c    # -0.37f

    .line 704
    .line 705
    .line 706
    const v18, -0x4050a3d7    # -1.37f

    .line 707
    .line 708
    .line 709
    const v13, 0x3e8f5c29    # 0.28f

    .line 710
    .line 711
    .line 712
    const v14, -0x410a3d71    # -0.48f

    .line 713
    .line 714
    .line 715
    const v15, 0x3de147ae    # 0.11f

    .line 716
    .line 717
    .line 718
    const v16, -0x40747ae1    # -1.09f

    .line 719
    .line 720
    .line 721
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 722
    .line 723
    .line 724
    const v0, -0x4023d70a    # -1.72f

    .line 725
    .line 726
    .line 727
    const v2, -0x40828f5c    # -0.99f

    .line 728
    .line 729
    .line 730
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 731
    .line 732
    .line 733
    const v17, 0x3e6147ae    # 0.22f

    .line 734
    .line 735
    .line 736
    const v18, -0x406e147b    # -1.14f

    .line 737
    .line 738
    .line 739
    const v13, 0x3dcccccd    # 0.1f

    .line 740
    .line 741
    .line 742
    const v14, -0x41428f5c    # -0.37f

    .line 743
    .line 744
    .line 745
    const v15, 0x3e2e147b    # 0.17f

    .line 746
    .line 747
    .line 748
    const/high16 v16, -0x40c00000    # -0.75f

    .line 749
    .line 750
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 751
    .line 752
    .line 753
    const/high16 v0, 0x41a00000    # 20.0f

    .line 754
    .line 755
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 756
    .line 757
    .line 758
    const/high16 v17, 0x41a80000    # 21.0f

    .line 759
    .line 760
    const/high16 v18, 0x41600000    # 14.0f

    .line 761
    .line 762
    const v13, 0x41a46666    # 20.55f

    .line 763
    .line 764
    .line 765
    const/high16 v14, 0x41700000    # 15.0f

    .line 766
    .line 767
    const/high16 v15, 0x41a80000    # 21.0f

    .line 768
    .line 769
    const v16, 0x4168cccd    # 14.55f

    .line 770
    .line 771
    .line 772
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 773
    .line 774
    .line 775
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 776
    .line 777
    .line 778
    const/high16 v0, 0x41880000    # 17.0f

    .line 779
    .line 780
    const/high16 v2, 0x41400000    # 12.0f

    .line 781
    .line 782
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 783
    .line 784
    .line 785
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 786
    .line 787
    .line 788
    const/high16 v17, -0x40800000    # -1.0f

    .line 789
    .line 790
    const/high16 v18, -0x40800000    # -1.0f

    .line 791
    .line 792
    const v13, -0x40f33333    # -0.55f

    .line 793
    .line 794
    .line 795
    const/4 v14, 0x0

    .line 796
    const/high16 v15, -0x40800000    # -1.0f

    .line 797
    .line 798
    const v16, -0x4119999a    # -0.45f

    .line 799
    .line 800
    .line 801
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 802
    .line 803
    .line 804
    const/high16 v0, -0x3f800000    # -4.0f

    .line 805
    .line 806
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 807
    .line 808
    .line 809
    const/high16 v17, 0x3f800000    # 1.0f

    .line 810
    .line 811
    const/4 v13, 0x0

    .line 812
    const v14, -0x40f33333    # -0.55f

    .line 813
    .line 814
    .line 815
    const v15, 0x3ee66666    # 0.45f

    .line 816
    .line 817
    .line 818
    const/high16 v16, -0x40800000    # -1.0f

    .line 819
    .line 820
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 821
    .line 822
    .line 823
    const/4 v0, 0x0

    .line 824
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 825
    .line 826
    .line 827
    const/high16 v18, 0x3f800000    # 1.0f

    .line 828
    .line 829
    const v13, 0x3f0ccccd    # 0.55f

    .line 830
    .line 831
    .line 832
    const/4 v14, 0x0

    .line 833
    const/high16 v15, 0x3f800000    # 1.0f

    .line 834
    .line 835
    const v16, 0x3ee66666    # 0.45f

    .line 836
    .line 837
    .line 838
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 839
    .line 840
    .line 841
    const/high16 v0, 0x40800000    # 4.0f

    .line 842
    .line 843
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 844
    .line 845
    .line 846
    const/high16 v17, 0x41400000    # 12.0f

    .line 847
    .line 848
    const/high16 v18, 0x41880000    # 17.0f

    .line 849
    .line 850
    const/high16 v13, 0x41500000    # 13.0f

    .line 851
    .line 852
    const v14, 0x41846666    # 16.55f

    .line 853
    .line 854
    .line 855
    const v15, 0x4148cccd    # 12.55f

    .line 856
    .line 857
    .line 858
    const/high16 v16, 0x41880000    # 17.0f

    .line 859
    .line 860
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 861
    .line 862
    .line 863
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 864
    .line 865
    .line 866
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 867
    .line 868
    .line 869
    move-result-object v2

    .line 870
    const/16 v16, 0x3800

    .line 871
    .line 872
    const/16 v17, 0x0

    .line 873
    .line 874
    const/high16 v6, 0x3f800000    # 1.0f

    .line 875
    .line 876
    const/high16 v8, 0x3f800000    # 1.0f

    .line 877
    .line 878
    const/4 v7, 0x0

    .line 879
    const/high16 v9, 0x3f800000    # 1.0f

    .line 880
    .line 881
    const/high16 v12, 0x3f800000    # 1.0f

    .line 882
    .line 883
    const/4 v13, 0x0

    .line 884
    const/4 v14, 0x0

    .line 885
    const/4 v15, 0x0

    .line 886
    const-string v4, ""

    .line 887
    .line 888
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 889
    .line 890
    .line 891
    move-result-object v0

    .line 892
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 893
    .line 894
    .line 895
    move-result-object v0

    .line 896
    sput-object v0, Landroidx/compose/material/icons/rounded/PestControlKt;->_pestControl:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 897
    .line 898
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 899
    .line 900
    .line 901
    return-object v0
.end method
