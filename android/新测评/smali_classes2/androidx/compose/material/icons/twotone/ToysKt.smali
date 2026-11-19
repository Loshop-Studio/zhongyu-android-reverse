.class public final Landroidx/compose/material/icons/twotone/ToysKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_toys",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "Toys",
        "Landroidx/compose/material/icons/Icons$TwoTone;",
        "getToys",
        "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;",
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
        "SMAP\nToys.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Toys.kt\nandroidx/compose/material/icons/twotone/ToysKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,115:1\n212#2,12:116\n233#2,18:129\n253#2:166\n233#2,18:167\n253#2:204\n174#3:128\n705#4,2:147\n717#4,2:149\n719#4,11:155\n705#4,2:185\n717#4,2:187\n719#4,11:193\n72#5,4:151\n72#5,4:189\n*S KotlinDebug\n*F\n+ 1 Toys.kt\nandroidx/compose/material/icons/twotone/ToysKt\n*L\n29#1:116,12\n30#1:129,18\n30#1:166\n44#1:167,18\n44#1:204\n29#1:128\n30#1:147,2\n30#1:149,2\n30#1:155,11\n44#1:185,2\n44#1:187,2\n44#1:193,11\n30#1:151,4\n44#1:189,4\n*E\n"
    }
.end annotation


# static fields
.field private static _toys:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getToys(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/ToysKt;->_toys:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.Toys"

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
    const/high16 v4, 0x41400000    # 12.0f

    .line 71
    .line 72
    const/high16 v6, 0x41900000    # 18.0f

    .line 73
    .line 74
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v4, 0x40c00000    # 6.0f

    .line 78
    .line 79
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 80
    .line 81
    .line 82
    const/high16 v25, -0x40000000    # -2.0f

    .line 83
    .line 84
    const/high16 v26, 0x40000000    # 2.0f

    .line 85
    .line 86
    const v21, -0x40733333    # -1.1f

    .line 87
    .line 88
    .line 89
    const/16 v22, 0x0

    .line 90
    .line 91
    const/high16 v23, -0x40000000    # -2.0f

    .line 92
    .line 93
    const v24, 0x3f666666    # 0.9f

    .line 94
    .line 95
    .line 96
    move-object/from16 v20, v2

    .line 97
    .line 98
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 99
    .line 100
    .line 101
    const v25, 0x3f028f5c    # 0.51f

    .line 102
    .line 103
    .line 104
    const v26, 0x3fa8f5c3    # 1.32f

    .line 105
    .line 106
    .line 107
    const/16 v21, 0x0

    .line 108
    .line 109
    const v22, 0x3f028f5c    # 0.51f

    .line 110
    .line 111
    .line 112
    const v23, 0x3e4ccccd    # 0.2f

    .line 113
    .line 114
    .line 115
    const v24, 0x3f7851ec    # 0.97f

    .line 116
    .line 117
    .line 118
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 119
    .line 120
    .line 121
    const/high16 v25, 0x40e00000    # 7.0f

    .line 122
    .line 123
    const/high16 v26, 0x41600000    # 14.0f

    .line 124
    .line 125
    const v21, 0x40a1999a    # 5.05f

    .line 126
    .line 127
    .line 128
    const v22, 0x41687ae1    # 14.53f

    .line 129
    .line 130
    .line 131
    const v23, 0x40bf0a3d    # 5.97f

    .line 132
    .line 133
    .line 134
    const/high16 v24, 0x41600000    # 14.0f

    .line 135
    .line 136
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 137
    .line 138
    .line 139
    const v25, 0x40347ae1    # 2.82f

    .line 140
    .line 141
    .line 142
    const/high16 v26, 0x40000000    # 2.0f

    .line 143
    .line 144
    const v21, 0x3fa66666    # 1.3f

    .line 145
    .line 146
    .line 147
    const/16 v22, 0x0

    .line 148
    .line 149
    const v23, 0x4019999a    # 2.4f

    .line 150
    .line 151
    .line 152
    const v24, 0x3f570a3d    # 0.84f

    .line 153
    .line 154
    .line 155
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 156
    .line 157
    .line 158
    const v4, 0x408bd70a    # 4.37f

    .line 159
    .line 160
    .line 161
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 162
    .line 163
    .line 164
    const/high16 v26, -0x40000000    # -2.0f

    .line 165
    .line 166
    const v21, 0x3ed1eb85    # 0.41f

    .line 167
    .line 168
    .line 169
    const v22, -0x406b851f    # -1.16f

    .line 170
    .line 171
    .line 172
    const v23, 0x3fc147ae    # 1.51f

    .line 173
    .line 174
    .line 175
    const/high16 v24, -0x40000000    # -2.0f

    .line 176
    .line 177
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 178
    .line 179
    .line 180
    const v25, 0x401f5c29    # 2.49f

    .line 181
    .line 182
    .line 183
    const v26, 0x3fa8f5c3    # 1.32f

    .line 184
    .line 185
    .line 186
    const v21, 0x3f83d70a    # 1.03f

    .line 187
    .line 188
    .line 189
    const/16 v22, 0x0

    .line 190
    .line 191
    const v23, 0x3ff9999a    # 1.95f

    .line 192
    .line 193
    .line 194
    const v24, 0x3f07ae14    # 0.53f

    .line 195
    .line 196
    .line 197
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 198
    .line 199
    .line 200
    const/high16 v25, 0x41a00000    # 20.0f

    .line 201
    .line 202
    const/high16 v26, 0x41600000    # 14.0f

    .line 203
    .line 204
    const v21, 0x419e6666    # 19.8f

    .line 205
    .line 206
    .line 207
    const v22, 0x416f851f    # 14.97f

    .line 208
    .line 209
    .line 210
    const/high16 v23, 0x41a00000    # 20.0f

    .line 211
    .line 212
    const v24, 0x416828f6    # 14.51f

    .line 213
    .line 214
    .line 215
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 216
    .line 217
    .line 218
    const/high16 v25, 0x41900000    # 18.0f

    .line 219
    .line 220
    const/high16 v26, 0x41400000    # 12.0f

    .line 221
    .line 222
    const/high16 v21, 0x41a00000    # 20.0f

    .line 223
    .line 224
    const v22, 0x414e6666    # 12.9f

    .line 225
    .line 226
    .line 227
    const v23, 0x4198cccd    # 19.1f

    .line 228
    .line 229
    .line 230
    const/high16 v24, 0x41400000    # 12.0f

    .line 231
    .line 232
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 233
    .line 234
    .line 235
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 236
    .line 237
    .line 238
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 239
    .line 240
    .line 241
    move-result-object v2

    .line 242
    const/16 v16, 0x3800

    .line 243
    .line 244
    const/16 v17, 0x0

    .line 245
    .line 246
    const v6, 0x3e99999a    # 0.3f

    .line 247
    .line 248
    .line 249
    const v8, 0x3e99999a    # 0.3f

    .line 250
    .line 251
    .line 252
    const/4 v7, 0x0

    .line 253
    const/high16 v9, 0x3f800000    # 1.0f

    .line 254
    .line 255
    const/high16 v12, 0x3f800000    # 1.0f

    .line 256
    .line 257
    const/4 v13, 0x0

    .line 258
    const/4 v14, 0x0

    .line 259
    const/4 v15, 0x0

    .line 260
    const-string v4, ""

    .line 261
    .line 262
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 263
    .line 264
    .line 265
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 266
    .line 267
    .line 268
    move-result v3

    .line 269
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 270
    .line 271
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 272
    .line 273
    .line 274
    move-result-wide v6

    .line 275
    const/4 v0, 0x0

    .line 276
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 277
    .line 278
    .line 279
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 280
    .line 281
    .line 282
    move-result v10

    .line 283
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 284
    .line 285
    .line 286
    move-result v11

    .line 287
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 288
    .line 289
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 290
    .line 291
    .line 292
    const/high16 v0, 0x41960000    # 18.75f

    .line 293
    .line 294
    const v2, 0x412147ae    # 10.08f

    .line 295
    .line 296
    .line 297
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 298
    .line 299
    .line 300
    const v0, 0x418b3333    # 17.4f

    .line 301
    .line 302
    .line 303
    const v2, 0x40c1999a    # 6.05f

    .line 304
    .line 305
    .line 306
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 307
    .line 308
    .line 309
    const v17, 0x4168f5c3    # 14.56f

    .line 310
    .line 311
    .line 312
    const/high16 v18, 0x40800000    # 4.0f

    .line 313
    .line 314
    const/high16 v13, 0x41880000    # 17.0f

    .line 315
    .line 316
    const v14, 0x409a3d71    # 4.82f

    .line 317
    .line 318
    .line 319
    const v15, 0x417d999a    # 15.85f

    .line 320
    .line 321
    .line 322
    const/high16 v16, 0x40800000    # 4.0f

    .line 323
    .line 324
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 325
    .line 326
    .line 327
    const v0, 0x41170a3d    # 9.44f

    .line 328
    .line 329
    .line 330
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 331
    .line 332
    .line 333
    const v17, 0x40d33333    # 6.6f

    .line 334
    .line 335
    .line 336
    const v18, 0x40c1999a    # 6.05f

    .line 337
    .line 338
    .line 339
    const v13, 0x41026666    # 8.15f

    .line 340
    .line 341
    .line 342
    const/high16 v14, 0x40800000    # 4.0f

    .line 343
    .line 344
    const/high16 v15, 0x40e00000    # 7.0f

    .line 345
    .line 346
    const v16, 0x409a3d71    # 4.82f

    .line 347
    .line 348
    .line 349
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 350
    .line 351
    .line 352
    const v0, 0x40b9eb85    # 5.81f

    .line 353
    .line 354
    .line 355
    const v2, 0x41066666    # 8.4f

    .line 356
    .line 357
    .line 358
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 359
    .line 360
    .line 361
    const v0, 0x408d1eb8    # 4.41f

    .line 362
    .line 363
    .line 364
    const/high16 v2, 0x40e00000    # 7.0f

    .line 365
    .line 366
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 367
    .line 368
    .line 369
    const v0, 0x3e947ae1    # 0.29f

    .line 370
    .line 371
    .line 372
    const v2, -0x416b851f    # -0.29f

    .line 373
    .line 374
    .line 375
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 376
    .line 377
    .line 378
    const/16 v17, 0x0

    .line 379
    .line 380
    const v18, -0x404b851f    # -1.41f

    .line 381
    .line 382
    .line 383
    const v13, 0x3ec7ae14    # 0.39f

    .line 384
    .line 385
    .line 386
    const v14, -0x413851ec    # -0.39f

    .line 387
    .line 388
    .line 389
    const v15, 0x3ec7ae14    # 0.39f

    .line 390
    .line 391
    .line 392
    const v16, -0x407d70a4    # -1.02f

    .line 393
    .line 394
    .line 395
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 396
    .line 397
    .line 398
    const v17, -0x404b851f    # -1.41f

    .line 399
    .line 400
    .line 401
    const/16 v18, 0x0

    .line 402
    .line 403
    const v13, -0x413851ec    # -0.39f

    .line 404
    .line 405
    .line 406
    const v15, -0x407d70a4    # -1.02f

    .line 407
    .line 408
    .line 409
    const v16, -0x413851ec    # -0.39f

    .line 410
    .line 411
    .line 412
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 413
    .line 414
    .line 415
    const/high16 v0, -0x40000000    # -2.0f

    .line 416
    .line 417
    const/high16 v2, 0x40000000    # 2.0f

    .line 418
    .line 419
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 420
    .line 421
    .line 422
    const/16 v17, 0x0

    .line 423
    .line 424
    const v18, 0x3fb47ae1    # 1.41f

    .line 425
    .line 426
    .line 427
    const v14, 0x3ec7ae14    # 0.39f

    .line 428
    .line 429
    .line 430
    const v15, -0x413851ec    # -0.39f

    .line 431
    .line 432
    .line 433
    const v16, 0x3f828f5c    # 1.02f

    .line 434
    .line 435
    .line 436
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 437
    .line 438
    .line 439
    const v17, 0x3fb47ae1    # 1.41f

    .line 440
    .line 441
    .line 442
    const/16 v18, 0x0

    .line 443
    .line 444
    const v13, 0x3ec7ae14    # 0.39f

    .line 445
    .line 446
    .line 447
    const v15, 0x3f828f5c    # 1.02f

    .line 448
    .line 449
    .line 450
    const v16, 0x3ec7ae14    # 0.39f

    .line 451
    .line 452
    .line 453
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 454
    .line 455
    .line 456
    const/high16 v0, 0x40400000    # 3.0f

    .line 457
    .line 458
    const v2, 0x41068f5c    # 8.41f

    .line 459
    .line 460
    .line 461
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 462
    .line 463
    .line 464
    const v0, 0x3fe51eb8    # 1.79f

    .line 465
    .line 466
    .line 467
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 468
    .line 469
    .line 470
    const/high16 v17, 0x40000000    # 2.0f

    .line 471
    .line 472
    const/high16 v18, 0x41600000    # 14.0f

    .line 473
    .line 474
    const v13, 0x404b851f    # 3.18f

    .line 475
    .line 476
    .line 477
    const v14, 0x412b851f    # 10.72f

    .line 478
    .line 479
    .line 480
    const/high16 v15, 0x40000000    # 2.0f

    .line 481
    .line 482
    const v16, 0x4143851f    # 12.22f

    .line 483
    .line 484
    .line 485
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 486
    .line 487
    .line 488
    const v17, 0x40033333    # 2.05f

    .line 489
    .line 490
    .line 491
    const v18, 0x405e147b    # 3.47f

    .line 492
    .line 493
    .line 494
    const/4 v13, 0x0

    .line 495
    const v14, 0x3fbeb852    # 1.49f

    .line 496
    .line 497
    .line 498
    const v15, 0x3f547ae1    # 0.83f

    .line 499
    .line 500
    .line 501
    const v16, 0x4031eb85    # 2.78f

    .line 502
    .line 503
    .line 504
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 505
    .line 506
    .line 507
    const/high16 v17, 0x40e00000    # 7.0f

    .line 508
    .line 509
    const/high16 v18, 0x41a00000    # 20.0f

    .line 510
    .line 511
    const v13, 0x4088a3d7    # 4.27f

    .line 512
    .line 513
    .line 514
    const v14, 0x41973333    # 18.9f

    .line 515
    .line 516
    .line 517
    const v15, 0x40b051ec    # 5.51f

    .line 518
    .line 519
    .line 520
    const/high16 v16, 0x41a00000    # 20.0f

    .line 521
    .line 522
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 523
    .line 524
    .line 525
    const v17, 0x40347ae1    # 2.82f

    .line 526
    .line 527
    .line 528
    const/high16 v18, -0x40000000    # -2.0f

    .line 529
    .line 530
    const v13, 0x3fa66666    # 1.3f

    .line 531
    .line 532
    .line 533
    const/4 v14, 0x0

    .line 534
    const v15, 0x4019999a    # 2.4f

    .line 535
    .line 536
    .line 537
    const v16, -0x40a8f5c3    # -0.84f

    .line 538
    .line 539
    .line 540
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 541
    .line 542
    .line 543
    const v0, 0x408bd70a    # 4.37f

    .line 544
    .line 545
    .line 546
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 547
    .line 548
    .line 549
    const/high16 v18, 0x40000000    # 2.0f

    .line 550
    .line 551
    const v13, 0x3ed1eb85    # 0.41f

    .line 552
    .line 553
    .line 554
    const v14, 0x3f947ae1    # 1.16f

    .line 555
    .line 556
    .line 557
    const v15, 0x3fc147ae    # 1.51f

    .line 558
    .line 559
    .line 560
    const/high16 v16, 0x40000000    # 2.0f

    .line 561
    .line 562
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 563
    .line 564
    .line 565
    const v17, 0x403ccccd    # 2.95f

    .line 566
    .line 567
    .line 568
    const v18, -0x3fde147b    # -2.53f

    .line 569
    .line 570
    .line 571
    const v13, 0x3fbeb852    # 1.49f

    .line 572
    .line 573
    .line 574
    const/4 v14, 0x0

    .line 575
    const v15, 0x402eb852    # 2.73f

    .line 576
    .line 577
    .line 578
    const v16, -0x40733333    # -1.1f

    .line 579
    .line 580
    .line 581
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 582
    .line 583
    .line 584
    const/high16 v17, 0x41b00000    # 22.0f

    .line 585
    .line 586
    const/high16 v18, 0x41600000    # 14.0f

    .line 587
    .line 588
    const v13, 0x41a95c29    # 21.17f

    .line 589
    .line 590
    .line 591
    const v14, 0x41863d71    # 16.78f

    .line 592
    .line 593
    .line 594
    const/high16 v15, 0x41b00000    # 22.0f

    .line 595
    .line 596
    const v16, 0x4177d70a    # 15.49f

    .line 597
    .line 598
    .line 599
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 600
    .line 601
    .line 602
    const/high16 v17, 0x41960000    # 18.75f

    .line 603
    .line 604
    const v18, 0x412147ae    # 10.08f

    .line 605
    .line 606
    .line 607
    const/high16 v13, 0x41b00000    # 22.0f

    .line 608
    .line 609
    const v14, 0x4140cccd    # 12.05f

    .line 610
    .line 611
    .line 612
    const v15, 0x41a4cccd    # 20.6f

    .line 613
    .line 614
    .line 615
    const v16, 0x4126e148    # 10.43f

    .line 616
    .line 617
    .line 618
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 619
    .line 620
    .line 621
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 622
    .line 623
    .line 624
    const/high16 v0, 0x41500000    # 13.0f

    .line 625
    .line 626
    const/high16 v2, 0x40c00000    # 6.0f

    .line 627
    .line 628
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 629
    .line 630
    .line 631
    const v0, 0x3fc7ae14    # 1.56f

    .line 632
    .line 633
    .line 634
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 635
    .line 636
    .line 637
    const v17, 0x3f733333    # 0.95f

    .line 638
    .line 639
    .line 640
    const v18, 0x3f2e147b    # 0.68f

    .line 641
    .line 642
    .line 643
    const v13, 0x3edc28f6    # 0.43f

    .line 644
    .line 645
    .line 646
    const/4 v14, 0x0

    .line 647
    const v15, 0x3f4f5c29    # 0.81f

    .line 648
    .line 649
    .line 650
    const v16, 0x3e8a3d71    # 0.27f

    .line 651
    .line 652
    .line 653
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 654
    .line 655
    .line 656
    const v0, 0x4184e148    # 16.61f

    .line 657
    .line 658
    .line 659
    const/high16 v2, 0x41200000    # 10.0f

    .line 660
    .line 661
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 662
    .line 663
    .line 664
    const/high16 v0, 0x41500000    # 13.0f

    .line 665
    .line 666
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 667
    .line 668
    .line 669
    const/high16 v0, 0x40c00000    # 6.0f

    .line 670
    .line 671
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 672
    .line 673
    .line 674
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 675
    .line 676
    .line 677
    const v0, 0x40d5c28f    # 6.68f

    .line 678
    .line 679
    .line 680
    const v2, 0x4107d70a    # 8.49f

    .line 681
    .line 682
    .line 683
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 684
    .line 685
    .line 686
    const v17, 0x41170a3d    # 9.44f

    .line 687
    .line 688
    .line 689
    const/high16 v18, 0x40c00000    # 6.0f

    .line 690
    .line 691
    const v13, 0x410a147b    # 8.63f

    .line 692
    .line 693
    .line 694
    const v14, 0x40c8a3d7    # 6.27f

    .line 695
    .line 696
    .line 697
    const v15, 0x411028f6    # 9.01f

    .line 698
    .line 699
    .line 700
    const/high16 v16, 0x40c00000    # 6.0f

    .line 701
    .line 702
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 703
    .line 704
    .line 705
    const/high16 v0, 0x41300000    # 11.0f

    .line 706
    .line 707
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 708
    .line 709
    .line 710
    const/high16 v0, 0x40800000    # 4.0f

    .line 711
    .line 712
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 713
    .line 714
    .line 715
    const v0, 0x40ed1eb8    # 7.41f

    .line 716
    .line 717
    .line 718
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 719
    .line 720
    .line 721
    const v0, 0x40ec7ae1    # 7.39f

    .line 722
    .line 723
    .line 724
    const v2, 0x411fae14    # 9.98f

    .line 725
    .line 726
    .line 727
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 728
    .line 729
    .line 730
    const v0, 0x40d5c28f    # 6.68f

    .line 731
    .line 732
    .line 733
    const v2, 0x4107d70a    # 8.49f

    .line 734
    .line 735
    .line 736
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 737
    .line 738
    .line 739
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 740
    .line 741
    .line 742
    const/high16 v0, 0x40e00000    # 7.0f

    .line 743
    .line 744
    const/high16 v2, 0x41900000    # 18.0f

    .line 745
    .line 746
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 747
    .line 748
    .line 749
    const/high16 v17, -0x40800000    # -1.0f

    .line 750
    .line 751
    const/high16 v18, -0x40800000    # -1.0f

    .line 752
    .line 753
    const v13, -0x40f33333    # -0.55f

    .line 754
    .line 755
    .line 756
    const/4 v14, 0x0

    .line 757
    const/high16 v15, -0x40800000    # -1.0f

    .line 758
    .line 759
    const v16, -0x4119999a    # -0.45f

    .line 760
    .line 761
    .line 762
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 763
    .line 764
    .line 765
    const/high16 v0, -0x40800000    # -1.0f

    .line 766
    .line 767
    const v2, 0x3ee66666    # 0.45f

    .line 768
    .line 769
    .line 770
    const/high16 v4, 0x3f800000    # 1.0f

    .line 771
    .line 772
    invoke-virtual {v12, v2, v0, v4, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 773
    .line 774
    .line 775
    const v0, 0x3ee66666    # 0.45f

    .line 776
    .line 777
    .line 778
    const/high16 v2, 0x3f800000    # 1.0f

    .line 779
    .line 780
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 781
    .line 782
    .line 783
    const v0, 0x40f1999a    # 7.55f

    .line 784
    .line 785
    .line 786
    const/high16 v2, 0x40e00000    # 7.0f

    .line 787
    .line 788
    const/high16 v4, 0x41900000    # 18.0f

    .line 789
    .line 790
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 791
    .line 792
    .line 793
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 794
    .line 795
    .line 796
    const/high16 v0, 0x41880000    # 17.0f

    .line 797
    .line 798
    const/high16 v2, 0x41900000    # 18.0f

    .line 799
    .line 800
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 801
    .line 802
    .line 803
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 804
    .line 805
    .line 806
    const/high16 v0, -0x40800000    # -1.0f

    .line 807
    .line 808
    const v2, 0x3ee66666    # 0.45f

    .line 809
    .line 810
    .line 811
    const/high16 v4, 0x3f800000    # 1.0f

    .line 812
    .line 813
    invoke-virtual {v12, v2, v0, v4, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 814
    .line 815
    .line 816
    const v0, 0x3ee66666    # 0.45f

    .line 817
    .line 818
    .line 819
    const/high16 v2, 0x3f800000    # 1.0f

    .line 820
    .line 821
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 822
    .line 823
    .line 824
    const v0, 0x418c6666    # 17.55f

    .line 825
    .line 826
    .line 827
    const/high16 v2, 0x41880000    # 17.0f

    .line 828
    .line 829
    const/high16 v4, 0x41900000    # 18.0f

    .line 830
    .line 831
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 832
    .line 833
    .line 834
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 835
    .line 836
    .line 837
    const v0, 0x419beb85    # 19.49f

    .line 838
    .line 839
    .line 840
    const v2, 0x41751eb8    # 15.32f

    .line 841
    .line 842
    .line 843
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 844
    .line 845
    .line 846
    const/high16 v17, 0x41880000    # 17.0f

    .line 847
    .line 848
    const/high16 v18, 0x41600000    # 14.0f

    .line 849
    .line 850
    const v13, 0x4197999a    # 18.95f

    .line 851
    .line 852
    .line 853
    const v14, 0x41687ae1    # 14.53f

    .line 854
    .line 855
    .line 856
    const v15, 0x41903d71    # 18.03f

    .line 857
    .line 858
    .line 859
    const/high16 v16, 0x41600000    # 14.0f

    .line 860
    .line 861
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 862
    .line 863
    .line 864
    const v17, -0x3fcb851f    # -2.82f

    .line 865
    .line 866
    .line 867
    const/high16 v18, 0x40000000    # 2.0f

    .line 868
    .line 869
    const v13, -0x4059999a    # -1.3f

    .line 870
    .line 871
    .line 872
    const/4 v14, 0x0

    .line 873
    const v15, -0x3fe66666    # -2.4f

    .line 874
    .line 875
    .line 876
    const v16, 0x3f570a3d    # 0.84f

    .line 877
    .line 878
    .line 879
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 880
    .line 881
    .line 882
    const v0, 0x411d1eb8    # 9.82f

    .line 883
    .line 884
    .line 885
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 886
    .line 887
    .line 888
    const/high16 v17, 0x40e00000    # 7.0f

    .line 889
    .line 890
    const/high16 v18, 0x41600000    # 14.0f

    .line 891
    .line 892
    const v13, 0x41166666    # 9.4f

    .line 893
    .line 894
    .line 895
    const v14, 0x416d70a4    # 14.84f

    .line 896
    .line 897
    .line 898
    const v15, 0x4104cccd    # 8.3f

    .line 899
    .line 900
    .line 901
    const/high16 v16, 0x41600000    # 14.0f

    .line 902
    .line 903
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 904
    .line 905
    .line 906
    const v17, -0x3fe0a3d7    # -2.49f

    .line 907
    .line 908
    .line 909
    const v18, 0x3fa8f5c3    # 1.32f

    .line 910
    .line 911
    .line 912
    const v13, -0x407c28f6    # -1.03f

    .line 913
    .line 914
    .line 915
    const/4 v14, 0x0

    .line 916
    const v15, -0x40066666    # -1.95f

    .line 917
    .line 918
    .line 919
    const v16, 0x3f07ae14    # 0.53f

    .line 920
    .line 921
    .line 922
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 923
    .line 924
    .line 925
    const/high16 v17, 0x40800000    # 4.0f

    .line 926
    .line 927
    const/high16 v18, 0x41600000    # 14.0f

    .line 928
    .line 929
    const v13, 0x40866666    # 4.2f

    .line 930
    .line 931
    .line 932
    const v14, 0x416f851f    # 14.97f

    .line 933
    .line 934
    .line 935
    const/high16 v15, 0x40800000    # 4.0f

    .line 936
    .line 937
    const v16, 0x416828f6    # 14.51f

    .line 938
    .line 939
    .line 940
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 941
    .line 942
    .line 943
    const/high16 v17, 0x40000000    # 2.0f

    .line 944
    .line 945
    const/high16 v18, -0x40000000    # -2.0f

    .line 946
    .line 947
    const/4 v13, 0x0

    .line 948
    const v14, -0x40733333    # -1.1f

    .line 949
    .line 950
    .line 951
    const v15, 0x3f666666    # 0.9f

    .line 952
    .line 953
    .line 954
    const/high16 v16, -0x40000000    # -2.0f

    .line 955
    .line 956
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 957
    .line 958
    .line 959
    const/high16 v0, 0x41400000    # 12.0f

    .line 960
    .line 961
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 962
    .line 963
    .line 964
    const/high16 v18, 0x40000000    # 2.0f

    .line 965
    .line 966
    const v13, 0x3f8ccccd    # 1.1f

    .line 967
    .line 968
    .line 969
    const/4 v14, 0x0

    .line 970
    const/high16 v15, 0x40000000    # 2.0f

    .line 971
    .line 972
    const v16, 0x3f666666    # 0.9f

    .line 973
    .line 974
    .line 975
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 976
    .line 977
    .line 978
    const v17, 0x419beb85    # 19.49f

    .line 979
    .line 980
    .line 981
    const v18, 0x41751eb8    # 15.32f

    .line 982
    .line 983
    .line 984
    const/high16 v13, 0x41a00000    # 20.0f

    .line 985
    .line 986
    const v14, 0x416828f6    # 14.51f

    .line 987
    .line 988
    .line 989
    const v15, 0x419e6666    # 19.8f

    .line 990
    .line 991
    .line 992
    const v16, 0x416f851f    # 14.97f

    .line 993
    .line 994
    .line 995
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 996
    .line 997
    .line 998
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 999
    .line 1000
    .line 1001
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 1002
    .line 1003
    .line 1004
    move-result-object v2

    .line 1005
    const/16 v16, 0x3800

    .line 1006
    .line 1007
    const/16 v17, 0x0

    .line 1008
    .line 1009
    const/high16 v6, 0x3f800000    # 1.0f

    .line 1010
    .line 1011
    const/high16 v8, 0x3f800000    # 1.0f

    .line 1012
    .line 1013
    const/4 v7, 0x0

    .line 1014
    const/high16 v12, 0x3f800000    # 1.0f

    .line 1015
    .line 1016
    const/4 v13, 0x0

    .line 1017
    const/4 v14, 0x0

    .line 1018
    const/4 v15, 0x0

    .line 1019
    const-string v4, ""

    .line 1020
    .line 1021
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 1022
    .line 1023
    .line 1024
    move-result-object v0

    .line 1025
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1026
    .line 1027
    .line 1028
    move-result-object v0

    .line 1029
    sput-object v0, Landroidx/compose/material/icons/twotone/ToysKt;->_toys:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1030
    .line 1031
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 1032
    .line 1033
    .line 1034
    return-object v0
.end method
