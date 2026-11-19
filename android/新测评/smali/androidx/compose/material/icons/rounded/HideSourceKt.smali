.class public final Landroidx/compose/material/icons/rounded/HideSourceKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_hideSource",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "HideSource",
        "Landroidx/compose/material/icons/Icons$Rounded;",
        "getHideSource",
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
        "SMAP\nHideSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HideSource.kt\nandroidx/compose/material/icons/rounded/HideSourceKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,67:1\n212#2,12:68\n233#2,18:81\n253#2:118\n174#3:80\n705#4,2:99\n717#4,2:101\n719#4,11:107\n72#5,4:103\n*S KotlinDebug\n*F\n+ 1 HideSource.kt\nandroidx/compose/material/icons/rounded/HideSourceKt\n*L\n29#1:68,12\n30#1:81,18\n30#1:118\n29#1:80\n30#1:99,2\n30#1:101,2\n30#1:107,11\n30#1:103,4\n*E\n"
    }
.end annotation


# static fields
.field private static _hideSource:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getHideSource(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/HideSourceKt;->_hideSource:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.HideSource"

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
    const v0, 0x40066666    # 2.1f

    .line 71
    .line 72
    .line 73
    const v2, 0x4060a3d7    # 3.51f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 80
    .line 81
    .line 82
    const v17, 0x40066666    # 2.1f

    .line 83
    .line 84
    .line 85
    const v18, 0x409dc28f    # 4.93f

    .line 86
    .line 87
    .line 88
    const v13, 0x3fdae148    # 1.71f

    .line 89
    .line 90
    .line 91
    const v14, 0x4079999a    # 3.9f

    .line 92
    .line 93
    .line 94
    const v15, 0x3fdae148    # 1.71f

    .line 95
    .line 96
    .line 97
    const v16, 0x409147ae    # 4.54f

    .line 98
    .line 99
    .line 100
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 101
    .line 102
    .line 103
    const v0, 0x3fc7ae14    # 1.56f

    .line 104
    .line 105
    .line 106
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 107
    .line 108
    .line 109
    const v17, -0x40347ae1    # -1.59f

    .line 110
    .line 111
    .line 112
    const v18, 0x40d6147b    # 6.69f

    .line 113
    .line 114
    .line 115
    const/high16 v13, -0x40600000    # -1.25f

    .line 116
    .line 117
    const v14, 0x3ff0a3d7    # 1.88f

    .line 118
    .line 119
    .line 120
    const v15, -0x400f5c29    # -1.88f

    .line 121
    .line 122
    .line 123
    const v16, 0x40866666    # 4.2f

    .line 124
    .line 125
    .line 126
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 127
    .line 128
    .line 129
    const/high16 v17, 0x410c0000    # 8.75f

    .line 130
    .line 131
    const/high16 v18, 0x410c0000    # 8.75f

    .line 132
    .line 133
    const v13, 0x3f051eb8    # 0.52f

    .line 134
    .line 135
    .line 136
    const v14, 0x409147ae    # 4.54f

    .line 137
    .line 138
    .line 139
    const v15, 0x4086b852    # 4.21f

    .line 140
    .line 141
    .line 142
    const v16, 0x4103ae14    # 8.23f

    .line 143
    .line 144
    .line 145
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 146
    .line 147
    .line 148
    const v17, 0x40d6147b    # 6.69f

    .line 149
    .line 150
    .line 151
    const v18, -0x40347ae1    # -1.59f

    .line 152
    .line 153
    .line 154
    const v13, 0x401f5c29    # 2.49f

    .line 155
    .line 156
    .line 157
    const v14, 0x3e947ae1    # 0.29f

    .line 158
    .line 159
    .line 160
    const v15, 0x4099eb85    # 4.81f

    .line 161
    .line 162
    .line 163
    const v16, -0x4151eb85    # -0.34f

    .line 164
    .line 165
    .line 166
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 167
    .line 168
    .line 169
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 170
    .line 171
    .line 172
    const v17, 0x3fb47ae1    # 1.41f

    .line 173
    .line 174
    .line 175
    const/16 v18, 0x0

    .line 176
    .line 177
    const v13, 0x3ec7ae14    # 0.39f

    .line 178
    .line 179
    .line 180
    const v14, 0x3ec7ae14    # 0.39f

    .line 181
    .line 182
    .line 183
    const v15, 0x3f828f5c    # 1.02f

    .line 184
    .line 185
    .line 186
    const v16, 0x3ec7ae14    # 0.39f

    .line 187
    .line 188
    .line 189
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 190
    .line 191
    .line 192
    const/4 v0, 0x0

    .line 193
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 194
    .line 195
    .line 196
    const/16 v17, 0x0

    .line 197
    .line 198
    const v18, -0x404b851f    # -1.41f

    .line 199
    .line 200
    .line 201
    const v14, -0x413851ec    # -0.39f

    .line 202
    .line 203
    .line 204
    const v15, 0x3ec7ae14    # 0.39f

    .line 205
    .line 206
    .line 207
    const v16, -0x407d70a4    # -1.02f

    .line 208
    .line 209
    .line 210
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 211
    .line 212
    .line 213
    const v0, 0x4060a3d7    # 3.51f

    .line 214
    .line 215
    .line 216
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 217
    .line 218
    .line 219
    const v17, 0x40066666    # 2.1f

    .line 220
    .line 221
    .line 222
    const v18, 0x4060a3d7    # 3.51f

    .line 223
    .line 224
    .line 225
    const v13, 0x4047ae14    # 3.12f

    .line 226
    .line 227
    .line 228
    const v14, 0x4047ae14    # 3.12f

    .line 229
    .line 230
    .line 231
    const v15, 0x401f5c29    # 2.49f

    .line 232
    .line 233
    .line 234
    const v16, 0x4047ae14    # 3.12f

    .line 235
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
    const/high16 v0, 0x41400000    # 12.0f

    .line 244
    .line 245
    const/high16 v2, 0x41a00000    # 20.0f

    .line 246
    .line 247
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 248
    .line 249
    .line 250
    const/high16 v17, -0x3f000000    # -8.0f

    .line 251
    .line 252
    const/high16 v18, -0x3f000000    # -8.0f

    .line 253
    .line 254
    const v13, -0x3f72e148    # -4.41f

    .line 255
    .line 256
    .line 257
    const/4 v14, 0x0

    .line 258
    const/high16 v15, -0x3f000000    # -8.0f

    .line 259
    .line 260
    const v16, -0x3f9a3d71    # -3.59f

    .line 261
    .line 262
    .line 263
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 264
    .line 265
    .line 266
    const v17, 0x3f8f5c29    # 1.12f

    .line 267
    .line 268
    .line 269
    const v18, -0x3f7e147b    # -4.06f

    .line 270
    .line 271
    .line 272
    const/4 v13, 0x0

    .line 273
    const v14, -0x40428f5c    # -1.48f

    .line 274
    .line 275
    .line 276
    const v15, 0x3ed1eb85    # 0.41f

    .line 277
    .line 278
    .line 279
    const v16, -0x3fc8f5c3    # -2.86f

    .line 280
    .line 281
    .line 282
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 283
    .line 284
    .line 285
    const v0, 0x412f0a3d    # 10.94f

    .line 286
    .line 287
    .line 288
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 289
    .line 290
    .line 291
    const/high16 v17, 0x41400000    # 12.0f

    .line 292
    .line 293
    const/high16 v18, 0x41a00000    # 20.0f

    .line 294
    .line 295
    const v13, 0x416dc28f    # 14.86f

    .line 296
    .line 297
    .line 298
    const v14, 0x419cb852    # 19.59f

    .line 299
    .line 300
    .line 301
    const v15, 0x4157ae14    # 13.48f

    .line 302
    .line 303
    .line 304
    const/high16 v16, 0x41a00000    # 20.0f

    .line 305
    .line 306
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 307
    .line 308
    .line 309
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 310
    .line 311
    .line 312
    const v0, 0x40fe147b    # 7.94f

    .line 313
    .line 314
    .line 315
    const v2, 0x40a3d70a    # 5.12f

    .line 316
    .line 317
    .line 318
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 319
    .line 320
    .line 321
    const v0, 0x40cfae14    # 6.49f

    .line 322
    .line 323
    .line 324
    const v2, 0x406a3d71    # 3.66f

    .line 325
    .line 326
    .line 327
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 328
    .line 329
    .line 330
    const/high16 v18, 0x40000000    # 2.0f

    .line 331
    .line 332
    const v13, 0x41011eb8    # 8.07f

    .line 333
    .line 334
    .line 335
    const v14, 0x40270a3d    # 2.61f

    .line 336
    .line 337
    .line 338
    const v15, 0x411f5c29    # 9.96f

    .line 339
    .line 340
    .line 341
    const/high16 v16, 0x40000000    # 2.0f

    .line 342
    .line 343
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 344
    .line 345
    .line 346
    const/high16 v17, 0x41200000    # 10.0f

    .line 347
    .line 348
    const/high16 v18, 0x41200000    # 10.0f

    .line 349
    .line 350
    const v13, 0x40b0a3d7    # 5.52f

    .line 351
    .line 352
    .line 353
    const/4 v14, 0x0

    .line 354
    const/high16 v15, 0x41200000    # 10.0f

    .line 355
    .line 356
    const v16, 0x408f5c29    # 4.48f

    .line 357
    .line 358
    .line 359
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 360
    .line 361
    .line 362
    const v17, -0x402b851f    # -1.66f

    .line 363
    .line 364
    .line 365
    const v18, 0x40b051ec    # 5.51f

    .line 366
    .line 367
    .line 368
    const/4 v13, 0x0

    .line 369
    const v14, 0x40028f5c    # 2.04f

    .line 370
    .line 371
    .line 372
    const v15, -0x40e3d70a    # -0.61f

    .line 373
    .line 374
    .line 375
    const v16, 0x407b851f    # 3.93f

    .line 376
    .line 377
    .line 378
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 379
    .line 380
    .line 381
    const v0, -0x40451eb8    # -1.46f

    .line 382
    .line 383
    .line 384
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 385
    .line 386
    .line 387
    const/high16 v17, 0x41a00000    # 20.0f

    .line 388
    .line 389
    const/high16 v18, 0x41400000    # 12.0f

    .line 390
    .line 391
    const v13, 0x419cb852    # 19.59f

    .line 392
    .line 393
    .line 394
    const v14, 0x416dc28f    # 14.86f

    .line 395
    .line 396
    .line 397
    const/high16 v15, 0x41a00000    # 20.0f

    .line 398
    .line 399
    const v16, 0x4157ae14    # 13.48f

    .line 400
    .line 401
    .line 402
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 403
    .line 404
    .line 405
    const/high16 v17, -0x3f000000    # -8.0f

    .line 406
    .line 407
    const/high16 v18, -0x3f000000    # -8.0f

    .line 408
    .line 409
    const/4 v13, 0x0

    .line 410
    const v14, -0x3f72e148    # -4.41f

    .line 411
    .line 412
    .line 413
    const v15, -0x3f9a3d71    # -3.59f

    .line 414
    .line 415
    .line 416
    const/high16 v16, -0x3f000000    # -8.0f

    .line 417
    .line 418
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 419
    .line 420
    .line 421
    const v17, 0x40fe147b    # 7.94f

    .line 422
    .line 423
    .line 424
    const v18, 0x40a3d70a    # 5.12f

    .line 425
    .line 426
    .line 427
    const v13, 0x412851ec    # 10.52f

    .line 428
    .line 429
    .line 430
    const/high16 v14, 0x40800000    # 4.0f

    .line 431
    .line 432
    const v15, 0x41123d71    # 9.14f

    .line 433
    .line 434
    .line 435
    const v16, 0x408d1eb8    # 4.41f

    .line 436
    .line 437
    .line 438
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 439
    .line 440
    .line 441
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 442
    .line 443
    .line 444
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 445
    .line 446
    .line 447
    move-result-object v2

    .line 448
    const/16 v16, 0x3800

    .line 449
    .line 450
    const/16 v17, 0x0

    .line 451
    .line 452
    const/high16 v6, 0x3f800000    # 1.0f

    .line 453
    .line 454
    const/high16 v8, 0x3f800000    # 1.0f

    .line 455
    .line 456
    const/4 v7, 0x0

    .line 457
    const/high16 v9, 0x3f800000    # 1.0f

    .line 458
    .line 459
    const/high16 v12, 0x3f800000    # 1.0f

    .line 460
    .line 461
    const/4 v13, 0x0

    .line 462
    const/4 v14, 0x0

    .line 463
    const/4 v15, 0x0

    .line 464
    const-string v4, ""

    .line 465
    .line 466
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 467
    .line 468
    .line 469
    move-result-object v0

    .line 470
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 471
    .line 472
    .line 473
    move-result-object v0

    .line 474
    sput-object v0, Landroidx/compose/material/icons/rounded/HideSourceKt;->_hideSource:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 475
    .line 476
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 477
    .line 478
    .line 479
    return-object v0
.end method
