.class public final Landroidx/compose/material/icons/filled/Diversity2Kt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_diversity2",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "Diversity2",
        "Landroidx/compose/material/icons/Icons$Filled;",
        "getDiversity2",
        "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;",
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
        "SMAP\nDiversity2.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Diversity2.kt\nandroidx/compose/material/icons/filled/Diversity2Kt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,103:1\n212#2,12:104\n233#2,18:117\n253#2:154\n233#2,18:155\n253#2:192\n233#2,18:193\n253#2:230\n174#3:116\n705#4,2:135\n717#4,2:137\n719#4,11:143\n705#4,2:173\n717#4,2:175\n719#4,11:181\n705#4,2:211\n717#4,2:213\n719#4,11:219\n72#5,4:139\n72#5,4:177\n72#5,4:215\n*S KotlinDebug\n*F\n+ 1 Diversity2.kt\nandroidx/compose/material/icons/filled/Diversity2Kt\n*L\n29#1:104,12\n30#1:117,18\n30#1:154\n52#1:155,18\n52#1:192\n75#1:193,18\n75#1:230\n29#1:116\n30#1:135,2\n30#1:137,2\n30#1:143,11\n52#1:173,2\n52#1:175,2\n52#1:181,11\n75#1:211,2\n75#1:213,2\n75#1:219,11\n30#1:139,4\n52#1:177,4\n75#1:215,4\n*E\n"
    }
.end annotation


# static fields
.field private static _diversity2:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getDiversity2(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/filled/Diversity2Kt;->_diversity2:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Filled.Diversity2"

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
    const v4, 0x4121999a    # 10.1f

    .line 71
    .line 72
    .line 73
    const v6, 0x417e6666    # 15.9f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v4, 0x3fb5c28f    # 1.42f

    .line 80
    .line 81
    .line 82
    const v6, -0x404a3d71    # -1.42f

    .line 83
    .line 84
    .line 85
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 86
    .line 87
    .line 88
    const/high16 v25, 0x40e00000    # 7.0f

    .line 89
    .line 90
    const v26, 0x410d999a    # 8.85f

    .line 91
    .line 92
    .line 93
    const v21, 0x410ca3d7    # 8.79f

    .line 94
    .line 95
    .line 96
    const v22, 0x4140cccd    # 12.05f

    .line 97
    .line 98
    .line 99
    const/high16 v23, 0x40e00000    # 7.0f

    .line 100
    .line 101
    const v24, 0x41268f5c    # 10.41f

    .line 102
    .line 103
    .line 104
    move-object/from16 v20, v2

    .line 105
    .line 106
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 107
    .line 108
    .line 109
    const v25, 0x410d999a    # 8.85f

    .line 110
    .line 111
    .line 112
    const/high16 v26, 0x40e00000    # 7.0f

    .line 113
    .line 114
    const/high16 v21, 0x40e00000    # 7.0f

    .line 115
    .line 116
    const v22, 0x40f9999a    # 7.8f

    .line 117
    .line 118
    .line 119
    const v23, 0x40f9999a    # 7.8f

    .line 120
    .line 121
    .line 122
    const/high16 v24, 0x40e00000    # 7.0f

    .line 123
    .line 124
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 125
    .line 126
    .line 127
    const v25, 0x402b851f    # 2.68f

    .line 128
    .line 129
    .line 130
    const/high16 v26, 0x40000000    # 2.0f

    .line 131
    .line 132
    const v21, 0x3f8e147b    # 1.11f

    .line 133
    .line 134
    .line 135
    const/16 v22, 0x0

    .line 136
    .line 137
    const v23, 0x3fc51eb8    # 1.54f

    .line 138
    .line 139
    .line 140
    const v24, 0x3f266666    # 0.65f

    .line 141
    .line 142
    .line 143
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 144
    .line 145
    .line 146
    const v4, 0x3f6e147b    # 0.93f

    .line 147
    .line 148
    .line 149
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 150
    .line 151
    .line 152
    const/high16 v26, -0x40000000    # -2.0f

    .line 153
    .line 154
    const v21, 0x3f8f5c29    # 1.12f

    .line 155
    .line 156
    .line 157
    const v22, -0x405851ec    # -1.31f

    .line 158
    .line 159
    .line 160
    const v23, 0x3fc3d70a    # 1.53f

    .line 161
    .line 162
    .line 163
    const/high16 v24, -0x40000000    # -2.0f

    .line 164
    .line 165
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 166
    .line 167
    .line 168
    const v25, 0x3fe28f5c    # 1.77f

    .line 169
    .line 170
    .line 171
    const v26, 0x3fa8f5c3    # 1.32f

    .line 172
    .line 173
    .line 174
    const v21, 0x3f5eb852    # 0.87f

    .line 175
    .line 176
    .line 177
    const/16 v22, 0x0

    .line 178
    .line 179
    const v23, 0x3fc66666    # 1.55f

    .line 180
    .line 181
    .line 182
    const v24, 0x3f0a3d71    # 0.54f

    .line 183
    .line 184
    .line 185
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 186
    .line 187
    .line 188
    const/high16 v25, 0x3f800000    # 1.0f

    .line 189
    .line 190
    const v26, -0x428a3d71    # -0.06f

    .line 191
    .line 192
    .line 193
    const v21, 0x3eb33333    # 0.35f

    .line 194
    .line 195
    .line 196
    const v22, -0x42dc28f6    # -0.04f

    .line 197
    .line 198
    .line 199
    const v23, 0x3f2e147b    # 0.68f

    .line 200
    .line 201
    .line 202
    const v24, -0x428a3d71    # -0.06f

    .line 203
    .line 204
    .line 205
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 206
    .line 207
    .line 208
    const v25, 0x3f83d70a    # 1.03f

    .line 209
    .line 210
    .line 211
    const v26, 0x3da3d70a    # 0.08f

    .line 212
    .line 213
    .line 214
    const v21, 0x3eb851ec    # 0.36f

    .line 215
    .line 216
    .line 217
    const/16 v22, 0x0

    .line 218
    .line 219
    const v23, 0x3f333333    # 0.7f

    .line 220
    .line 221
    .line 222
    const v24, 0x3cf5c28f    # 0.03f

    .line 223
    .line 224
    .line 225
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 226
    .line 227
    .line 228
    const v25, 0x41726666    # 15.15f

    .line 229
    .line 230
    .line 231
    const/high16 v26, 0x40a00000    # 5.0f

    .line 232
    .line 233
    const v21, 0x4195999a    # 18.7f

    .line 234
    .line 235
    .line 236
    const v22, 0x40cdc28f    # 6.43f

    .line 237
    .line 238
    .line 239
    const v23, 0x41890a3d    # 17.13f

    .line 240
    .line 241
    .line 242
    const/high16 v24, 0x40a00000    # 5.0f

    .line 243
    .line 244
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 245
    .line 246
    .line 247
    const v25, -0x414ccccd    # -0.35f

    .line 248
    .line 249
    .line 250
    const v26, 0x3d23d70a    # 0.04f

    .line 251
    .line 252
    .line 253
    const v21, -0x420a3d71    # -0.12f

    .line 254
    .line 255
    .line 256
    const/16 v22, 0x0

    .line 257
    .line 258
    const v23, -0x41947ae1    # -0.23f

    .line 259
    .line 260
    .line 261
    const v24, 0x3cf5c28f    # 0.03f

    .line 262
    .line 263
    .line 264
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 265
    .line 266
    .line 267
    const/high16 v25, 0x41700000    # 15.0f

    .line 268
    .line 269
    const/high16 v26, 0x40800000    # 4.0f

    .line 270
    .line 271
    const v21, 0x416eb852    # 14.92f

    .line 272
    .line 273
    .line 274
    const v22, 0x4096b852    # 4.71f

    .line 275
    .line 276
    .line 277
    const/high16 v23, 0x41700000    # 15.0f

    .line 278
    .line 279
    const v24, 0x408bd70a    # 4.37f

    .line 280
    .line 281
    .line 282
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 283
    .line 284
    .line 285
    const/high16 v25, -0x3fc00000    # -3.0f

    .line 286
    .line 287
    const/high16 v26, -0x3fc00000    # -3.0f

    .line 288
    .line 289
    const/16 v21, 0x0

    .line 290
    .line 291
    const v22, -0x402b851f    # -1.66f

    .line 292
    .line 293
    .line 294
    const v23, -0x40547ae1    # -1.34f

    .line 295
    .line 296
    .line 297
    const/high16 v24, -0x3fc00000    # -3.0f

    .line 298
    .line 299
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 300
    .line 301
    .line 302
    const v4, 0x4015c28f    # 2.34f

    .line 303
    .line 304
    .line 305
    const/high16 v6, 0x40800000    # 4.0f

    .line 306
    .line 307
    const/high16 v7, 0x41100000    # 9.0f

    .line 308
    .line 309
    invoke-virtual {v2, v7, v4, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 310
    .line 311
    .line 312
    const v25, 0x3e4ccccd    # 0.2f

    .line 313
    .line 314
    .line 315
    const v26, 0x3f851eb8    # 1.04f

    .line 316
    .line 317
    .line 318
    const v22, 0x3ebd70a4    # 0.37f

    .line 319
    .line 320
    .line 321
    const v23, 0x3da3d70a    # 0.08f

    .line 322
    .line 323
    .line 324
    const v24, 0x3f35c28f    # 0.71f

    .line 325
    .line 326
    .line 327
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 328
    .line 329
    .line 330
    const v25, 0x410d999a    # 8.85f

    .line 331
    .line 332
    .line 333
    const/high16 v26, 0x40a00000    # 5.0f

    .line 334
    .line 335
    const v21, 0x411147ae    # 9.08f

    .line 336
    .line 337
    .line 338
    const v22, 0x40a0f5c3    # 5.03f

    .line 339
    .line 340
    .line 341
    const v23, 0x410f851f    # 8.97f

    .line 342
    .line 343
    .line 344
    const/high16 v24, 0x40a00000    # 5.0f

    .line 345
    .line 346
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 347
    .line 348
    .line 349
    const/high16 v25, 0x40a00000    # 5.0f

    .line 350
    .line 351
    const v26, 0x410d999a    # 8.85f

    .line 352
    .line 353
    .line 354
    const v21, 0x40d6147b    # 6.69f

    .line 355
    .line 356
    .line 357
    const/high16 v22, 0x40a00000    # 5.0f

    .line 358
    .line 359
    const/high16 v23, 0x40a00000    # 5.0f

    .line 360
    .line 361
    const v24, 0x40d6147b    # 6.69f

    .line 362
    .line 363
    .line 364
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 365
    .line 366
    .line 367
    const v25, 0x4121999a    # 10.1f

    .line 368
    .line 369
    .line 370
    const v26, 0x417e6666    # 15.9f

    .line 371
    .line 372
    .line 373
    const/high16 v21, 0x40a00000    # 5.0f

    .line 374
    .line 375
    const v22, 0x413451ec    # 11.27f

    .line 376
    .line 377
    .line 378
    const v23, 0x40e147ae    # 7.04f

    .line 379
    .line 380
    .line 381
    const v24, 0x41528f5c    # 13.16f

    .line 382
    .line 383
    .line 384
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 385
    .line 386
    .line 387
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 388
    .line 389
    .line 390
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 391
    .line 392
    .line 393
    move-result-object v2

    .line 394
    const/16 v16, 0x3800

    .line 395
    .line 396
    const/16 v17, 0x0

    .line 397
    .line 398
    const/high16 v6, 0x3f800000    # 1.0f

    .line 399
    .line 400
    const/high16 v8, 0x3f800000    # 1.0f

    .line 401
    .line 402
    const/4 v7, 0x0

    .line 403
    const/high16 v9, 0x3f800000    # 1.0f

    .line 404
    .line 405
    const/high16 v12, 0x3f800000    # 1.0f

    .line 406
    .line 407
    const/4 v13, 0x0

    .line 408
    const/4 v14, 0x0

    .line 409
    const/4 v15, 0x0

    .line 410
    const-string v4, ""

    .line 411
    .line 412
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 413
    .line 414
    .line 415
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 416
    .line 417
    .line 418
    move-result v3

    .line 419
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 420
    .line 421
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 422
    .line 423
    .line 424
    move-result-wide v6

    .line 425
    const/4 v2, 0x0

    .line 426
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 427
    .line 428
    .line 429
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 430
    .line 431
    .line 432
    move-result v10

    .line 433
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 434
    .line 435
    .line 436
    move-result v11

    .line 437
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 438
    .line 439
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 440
    .line 441
    .line 442
    const v4, 0x4181eb85    # 16.24f

    .line 443
    .line 444
    .line 445
    const/high16 v6, 0x41b40000    # 22.5f

    .line 446
    .line 447
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 448
    .line 449
    .line 450
    const/high16 v25, -0x40800000    # -1.0f

    .line 451
    .line 452
    const v26, -0x414ccccd    # -0.35f

    .line 453
    .line 454
    .line 455
    const v21, -0x415c28f6    # -0.32f

    .line 456
    .line 457
    .line 458
    const v22, -0x41c7ae14    # -0.18f

    .line 459
    .line 460
    .line 461
    const v23, -0x40d70a3d    # -0.66f

    .line 462
    .line 463
    .line 464
    const v24, -0x416b851f    # -0.29f

    .line 465
    .line 466
    .line 467
    move-object/from16 v20, v2

    .line 468
    .line 469
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 470
    .line 471
    .line 472
    const v25, 0x3e570a3d    # 0.21f

    .line 473
    .line 474
    .line 475
    const v26, -0x4170a3d7    # -0.28f

    .line 476
    .line 477
    .line 478
    const v21, 0x3d8f5c29    # 0.07f

    .line 479
    .line 480
    .line 481
    const v22, -0x42333333    # -0.1f

    .line 482
    .line 483
    .line 484
    const v23, 0x3e19999a    # 0.15f

    .line 485
    .line 486
    .line 487
    const v24, -0x41c7ae14    # -0.18f

    .line 488
    .line 489
    .line 490
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 491
    .line 492
    .line 493
    const v25, -0x404b851f    # -1.41f

    .line 494
    .line 495
    .line 496
    const v26, -0x3f57ae14    # -5.26f

    .line 497
    .line 498
    .line 499
    const v21, 0x3f8a3d71    # 1.08f

    .line 500
    .line 501
    .line 502
    const v22, -0x4010a3d7    # -1.87f

    .line 503
    .line 504
    .line 505
    const v23, 0x3eeb851f    # 0.46f

    .line 506
    .line 507
    .line 508
    const v24, -0x3f7a3d71    # -4.18f

    .line 509
    .line 510
    .line 511
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 512
    .line 513
    .line 514
    const v25, -0x3ef5999a    # -8.65f

    .line 515
    .line 516
    .line 517
    const v26, 0x3f666666    # 0.9f

    .line 518
    .line 519
    .line 520
    const v21, -0x3ffa3d71    # -2.09f

    .line 521
    .line 522
    .line 523
    const v22, -0x40651eb8    # -1.21f

    .line 524
    .line 525
    .line 526
    const v23, -0x3f67ae14    # -4.76f

    .line 527
    .line 528
    .line 529
    const v24, -0x413851ec    # -0.39f

    .line 530
    .line 531
    .line 532
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 533
    .line 534
    .line 535
    const v4, 0x3f051eb8    # 0.52f

    .line 536
    .line 537
    .line 538
    const v6, 0x3ff851ec    # 1.94f

    .line 539
    .line 540
    .line 541
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 542
    .line 543
    .line 544
    const v25, 0x40e47ae1    # 7.14f

    .line 545
    .line 546
    .line 547
    const v26, -0x40733333    # -1.1f

    .line 548
    .line 549
    .line 550
    const v21, 0x405e147b    # 3.47f

    .line 551
    .line 552
    .line 553
    const v22, -0x406e147b    # -1.14f

    .line 554
    .line 555
    .line 556
    const v23, 0x40b947ae    # 5.79f

    .line 557
    .line 558
    .line 559
    const v24, -0x400f5c29    # -1.88f

    .line 560
    .line 561
    .line 562
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 563
    .line 564
    .line 565
    const v25, 0x3f2e147b    # 0.68f

    .line 566
    .line 567
    .line 568
    const v26, 0x4021eb85    # 2.53f

    .line 569
    .line 570
    .line 571
    const v21, 0x3f68f5c3    # 0.91f

    .line 572
    .line 573
    .line 574
    const v22, 0x3f07ae14    # 0.53f

    .line 575
    .line 576
    .line 577
    const v23, 0x3f99999a    # 1.2f

    .line 578
    .line 579
    .line 580
    const v24, 0x3fce147b    # 1.61f

    .line 581
    .line 582
    .line 583
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 584
    .line 585
    .line 586
    const v25, -0x3fbb851f    # -3.07f

    .line 587
    .line 588
    .line 589
    const v26, 0x3fa8f5c3    # 1.32f

    .line 590
    .line 591
    .line 592
    const v21, -0x40f0a3d7    # -0.56f

    .line 593
    .line 594
    .line 595
    const v22, 0x3f75c28f    # 0.96f

    .line 596
    .line 597
    .line 598
    const v23, -0x4055c28f    # -1.33f

    .line 599
    .line 600
    .line 601
    const/high16 v24, 0x3f800000    # 1.0f

    .line 602
    .line 603
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 604
    .line 605
    .line 606
    const v4, -0x410f5c29    # -0.47f

    .line 607
    .line 608
    .line 609
    const v6, 0x3f4f5c29    # 0.81f

    .line 610
    .line 611
    .line 612
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 613
    .line 614
    .line 615
    const v25, 0x3ec7ae14    # 0.39f

    .line 616
    .line 617
    .line 618
    const v26, 0x40547ae1    # 3.32f

    .line 619
    .line 620
    .line 621
    const v21, 0x3f147ae1    # 0.58f

    .line 622
    .line 623
    .line 624
    const v22, 0x3fcf5c29    # 1.62f

    .line 625
    .line 626
    .line 627
    const v23, 0x3f7851ec    # 0.97f

    .line 628
    .line 629
    .line 630
    const v24, 0x40151eb8    # 2.33f

    .line 631
    .line 632
    .line 633
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 634
    .line 635
    .line 636
    const v25, -0x3fde147b    # -2.53f

    .line 637
    .line 638
    .line 639
    const v26, 0x3f2e147b    # 0.68f

    .line 640
    .line 641
    .line 642
    const v21, -0x40f851ec    # -0.53f

    .line 643
    .line 644
    .line 645
    const v22, 0x3f68f5c3    # 0.91f

    .line 646
    .line 647
    .line 648
    const v23, -0x4031eb85    # -1.61f

    .line 649
    .line 650
    .line 651
    const v24, 0x3f99999a    # 1.2f

    .line 652
    .line 653
    .line 654
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 655
    .line 656
    .line 657
    const v25, -0x41d1eb85    # -0.17f

    .line 658
    .line 659
    .line 660
    const v26, -0x41fae148    # -0.13f

    .line 661
    .line 662
    .line 663
    const v21, -0x428a3d71    # -0.06f

    .line 664
    .line 665
    .line 666
    const v22, -0x430a3d71    # -0.03f

    .line 667
    .line 668
    .line 669
    const v23, -0x421eb852    # -0.11f

    .line 670
    .line 671
    .line 672
    const v24, -0x4247ae14    # -0.09f

    .line 673
    .line 674
    .line 675
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 676
    .line 677
    .line 678
    const v25, -0x407c28f6    # -1.03f

    .line 679
    .line 680
    .line 681
    const v26, 0x3fdd70a4    # 1.73f

    .line 682
    .line 683
    .line 684
    const v21, -0x41666666    # -0.3f

    .line 685
    .line 686
    .line 687
    const v22, 0x3f2b851f    # 0.67f

    .line 688
    .line 689
    .line 690
    const v23, -0x40dc28f6    # -0.64f

    .line 691
    .line 692
    .line 693
    const v24, 0x3f9eb852    # 1.24f

    .line 694
    .line 695
    .line 696
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 697
    .line 698
    .line 699
    const v25, 0x3e4ccccd    # 0.2f

    .line 700
    .line 701
    .line 702
    const v26, 0x3e0f5c29    # 0.14f

    .line 703
    .line 704
    .line 705
    const v21, 0x3d8f5c29    # 0.07f

    .line 706
    .line 707
    .line 708
    const v22, 0x3d23d70a    # 0.04f

    .line 709
    .line 710
    .line 711
    const v23, 0x3e051eb8    # 0.13f

    .line 712
    .line 713
    .line 714
    const v24, 0x3db851ec    # 0.09f

    .line 715
    .line 716
    .line 717
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 718
    .line 719
    .line 720
    const v25, 0x40a851ec    # 5.26f

    .line 721
    .line 722
    .line 723
    const v26, -0x404b851f    # -1.41f

    .line 724
    .line 725
    .line 726
    const v21, 0x3fef5c29    # 1.87f

    .line 727
    .line 728
    .line 729
    const v22, 0x3f8a3d71    # 1.08f

    .line 730
    .line 731
    .line 732
    const v23, 0x4085c28f    # 4.18f

    .line 733
    .line 734
    .line 735
    const v24, 0x3eeb851f    # 0.46f

    .line 736
    .line 737
    .line 738
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 739
    .line 740
    .line 741
    const v25, 0x3e0f5c29    # 0.14f

    .line 742
    .line 743
    .line 744
    const v26, -0x415c28f6    # -0.32f

    .line 745
    .line 746
    .line 747
    const v21, 0x3d75c28f    # 0.06f

    .line 748
    .line 749
    .line 750
    const v22, -0x42333333    # -0.1f

    .line 751
    .line 752
    .line 753
    const v23, 0x3db851ec    # 0.09f

    .line 754
    .line 755
    .line 756
    const v24, -0x41a8f5c3    # -0.21f

    .line 757
    .line 758
    .line 759
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 760
    .line 761
    .line 762
    const v25, 0x3f4ccccd    # 0.8f

    .line 763
    .line 764
    .line 765
    const v26, 0x3f30a3d7    # 0.69f

    .line 766
    .line 767
    .line 768
    const v21, 0x3e6147ae    # 0.22f

    .line 769
    .line 770
    .line 771
    const v22, 0x3e8a3d71    # 0.27f

    .line 772
    .line 773
    .line 774
    const v23, 0x3ef5c28f    # 0.48f

    .line 775
    .line 776
    .line 777
    const v24, 0x3f028f5c    # 0.51f

    .line 778
    .line 779
    .line 780
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 781
    .line 782
    .line 783
    const v25, 0x40833333    # 4.1f

    .line 784
    .line 785
    .line 786
    const v26, -0x40733333    # -1.1f

    .line 787
    .line 788
    .line 789
    const v21, 0x3fb70a3d    # 1.43f

    .line 790
    .line 791
    .line 792
    const v22, 0x3f547ae1    # 0.83f

    .line 793
    .line 794
    .line 795
    const v23, 0x405147ae    # 3.27f

    .line 796
    .line 797
    .line 798
    const v24, 0x3eae147b    # 0.34f

    .line 799
    .line 800
    .line 801
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 802
    .line 803
    .line 804
    const v4, 0x41bf70a4    # 23.93f

    .line 805
    .line 806
    .line 807
    const v6, 0x41887ae1    # 17.06f

    .line 808
    .line 809
    .line 810
    const v7, 0x4181eb85    # 16.24f

    .line 811
    .line 812
    .line 813
    const/high16 v8, 0x41b40000    # 22.5f

    .line 814
    .line 815
    invoke-virtual {v2, v4, v6, v8, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 816
    .line 817
    .line 818
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 819
    .line 820
    .line 821
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 822
    .line 823
    .line 824
    move-result-object v2

    .line 825
    const/high16 v6, 0x3f800000    # 1.0f

    .line 826
    .line 827
    const/high16 v8, 0x3f800000    # 1.0f

    .line 828
    .line 829
    const/4 v7, 0x0

    .line 830
    const-string v4, ""

    .line 831
    .line 832
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 833
    .line 834
    .line 835
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 836
    .line 837
    .line 838
    move-result v3

    .line 839
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 840
    .line 841
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 842
    .line 843
    .line 844
    move-result-wide v6

    .line 845
    const/4 v0, 0x0

    .line 846
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 847
    .line 848
    .line 849
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 850
    .line 851
    .line 852
    move-result v10

    .line 853
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 854
    .line 855
    .line 856
    move-result v11

    .line 857
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 858
    .line 859
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 860
    .line 861
    .line 862
    const v0, 0x416028f6    # 14.01f

    .line 863
    .line 864
    .line 865
    const v2, 0x41451eb8    # 12.32f

    .line 866
    .line 867
    .line 868
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 869
    .line 870
    .line 871
    const v17, -0x3fd851ec    # -2.62f

    .line 872
    .line 873
    .line 874
    const v18, 0x40d75c29    # 6.73f

    .line 875
    .line 876
    .line 877
    const v13, -0x40c28f5c    # -0.74f

    .line 878
    .line 879
    .line 880
    const v14, 0x40651eb8    # 3.58f

    .line 881
    .line 882
    .line 883
    const v15, -0x405d70a4    # -1.27f

    .line 884
    .line 885
    .line 886
    const v16, 0x40be6666    # 5.95f

    .line 887
    .line 888
    .line 889
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 890
    .line 891
    .line 892
    const v17, -0x3fde147b    # -2.53f

    .line 893
    .line 894
    .line 895
    const v18, -0x40d1eb85    # -0.68f

    .line 896
    .line 897
    .line 898
    const v13, -0x40970a3d    # -0.91f

    .line 899
    .line 900
    .line 901
    const v14, 0x3f07ae14    # 0.53f

    .line 902
    .line 903
    .line 904
    const/high16 v15, -0x40000000    # -2.0f

    .line 905
    .line 906
    const v16, 0x3e75c28f    # 0.24f

    .line 907
    .line 908
    .line 909
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 910
    .line 911
    .line 912
    const v17, 0x3ec7ae14    # 0.39f

    .line 913
    .line 914
    .line 915
    const v18, -0x3fab851f    # -3.32f

    .line 916
    .line 917
    .line 918
    const v13, -0x40f0a3d7    # -0.56f

    .line 919
    .line 920
    .line 921
    const v14, -0x408a3d71    # -0.96f

    .line 922
    .line 923
    .line 924
    const v15, -0x41b33333    # -0.2f

    .line 925
    .line 926
    .line 927
    const v16, -0x402b851f    # -1.66f

    .line 928
    .line 929
    .line 930
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 931
    .line 932
    .line 933
    const v0, 0x40e33333    # 7.1f

    .line 934
    .line 935
    .line 936
    const v2, 0x417ee148    # 15.93f

    .line 937
    .line 938
    .line 939
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 940
    .line 941
    .line 942
    const v17, -0x3fbb851f    # -3.07f

    .line 943
    .line 944
    .line 945
    const v18, -0x40570a3d    # -1.32f

    .line 946
    .line 947
    .line 948
    const v13, -0x40266666    # -1.7f

    .line 949
    .line 950
    .line 951
    const v14, -0x416147ae    # -0.31f

    .line 952
    .line 953
    .line 954
    const/high16 v15, -0x3fe00000    # -2.5f

    .line 955
    .line 956
    const v16, -0x41570a3d    # -0.33f

    .line 957
    .line 958
    .line 959
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 960
    .line 961
    .line 962
    const v17, 0x3f2e147b    # 0.68f

    .line 963
    .line 964
    .line 965
    const v18, -0x3fde147b    # -2.53f

    .line 966
    .line 967
    .line 968
    const v13, -0x40f851ec    # -0.53f

    .line 969
    .line 970
    .line 971
    const v14, -0x40970a3d    # -0.91f

    .line 972
    .line 973
    .line 974
    const v15, -0x418a3d71    # -0.24f

    .line 975
    .line 976
    .line 977
    const/high16 v16, -0x40000000    # -2.0f

    .line 978
    .line 979
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 980
    .line 981
    .line 982
    const v17, 0x3e947ae1    # 0.29f

    .line 983
    .line 984
    .line 985
    const v18, -0x421eb852    # -0.11f

    .line 986
    .line 987
    .line 988
    const v13, 0x3db851ec    # 0.09f

    .line 989
    .line 990
    .line 991
    const v14, -0x42b33333    # -0.05f

    .line 992
    .line 993
    .line 994
    const v15, 0x3e428f5c    # 0.19f

    .line 995
    .line 996
    .line 997
    const v16, -0x425c28f6    # -0.08f

    .line 998
    .line 999
    .line 1000
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1001
    .line 1002
    .line 1003
    const v17, -0x40ae147b    # -0.82f

    .line 1004
    .line 1005
    .line 1006
    const v18, -0x40133333    # -1.85f

    .line 1007
    .line 1008
    .line 1009
    const v13, -0x414ccccd    # -0.35f

    .line 1010
    .line 1011
    .line 1012
    const v14, -0x40f0a3d7    # -0.56f

    .line 1013
    .line 1014
    .line 1015
    const v15, -0x40dc28f6    # -0.64f

    .line 1016
    .line 1017
    .line 1018
    const v16, -0x406a3d71    # -1.17f

    .line 1019
    .line 1020
    .line 1021
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1022
    .line 1023
    .line 1024
    const v17, -0x410a3d71    # -0.48f

    .line 1025
    .line 1026
    .line 1027
    const v18, 0x3e6b851f    # 0.23f

    .line 1028
    .line 1029
    .line 1030
    const v13, -0x41dc28f6    # -0.16f

    .line 1031
    .line 1032
    .line 1033
    const v14, 0x3d8f5c29    # 0.07f

    .line 1034
    .line 1035
    .line 1036
    const v15, -0x415c28f6    # -0.32f

    .line 1037
    .line 1038
    .line 1039
    const v16, 0x3e0f5c29    # 0.14f

    .line 1040
    .line 1041
    .line 1042
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1043
    .line 1044
    .line 1045
    const v17, -0x404b851f    # -1.41f

    .line 1046
    .line 1047
    .line 1048
    const v18, 0x40a851ec    # 5.26f

    .line 1049
    .line 1050
    .line 1051
    const v13, -0x4010a3d7    # -1.87f

    .line 1052
    .line 1053
    .line 1054
    const v14, 0x3f8a3d71    # 1.08f

    .line 1055
    .line 1056
    .line 1057
    const v15, -0x3fe0a3d7    # -2.49f

    .line 1058
    .line 1059
    .line 1060
    const v16, 0x4058f5c3    # 3.39f

    .line 1061
    .line 1062
    .line 1063
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1064
    .line 1065
    .line 1066
    const v17, 0x3e570a3d    # 0.21f

    .line 1067
    .line 1068
    .line 1069
    const v18, 0x3e8f5c29    # 0.28f

    .line 1070
    .line 1071
    .line 1072
    const v13, 0x3d75c28f    # 0.06f

    .line 1073
    .line 1074
    .line 1075
    const v14, 0x3dcccccd    # 0.1f

    .line 1076
    .line 1077
    .line 1078
    const v15, 0x3e0f5c29    # 0.14f

    .line 1079
    .line 1080
    .line 1081
    const v16, 0x3e3851ec    # 0.18f

    .line 1082
    .line 1083
    .line 1084
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1085
    .line 1086
    .line 1087
    const/high16 v17, -0x40800000    # -1.0f

    .line 1088
    .line 1089
    const v18, 0x3eb33333    # 0.35f

    .line 1090
    .line 1091
    .line 1092
    const v13, -0x4151eb85    # -0.34f

    .line 1093
    .line 1094
    .line 1095
    const v14, 0x3d75c28f    # 0.06f

    .line 1096
    .line 1097
    .line 1098
    const v15, -0x40d1eb85    # -0.68f

    .line 1099
    .line 1100
    .line 1101
    const v16, 0x3e2e147b    # 0.17f

    .line 1102
    .line 1103
    .line 1104
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1105
    .line 1106
    .line 1107
    const v17, -0x40733333    # -1.1f

    .line 1108
    .line 1109
    .line 1110
    const v18, 0x40833333    # 4.1f

    .line 1111
    .line 1112
    .line 1113
    const v13, -0x4048f5c3    # -1.43f

    .line 1114
    .line 1115
    .line 1116
    const v14, 0x3f547ae1    # 0.83f

    .line 1117
    .line 1118
    .line 1119
    const v15, -0x4008f5c3    # -1.93f

    .line 1120
    .line 1121
    .line 1122
    const v16, 0x402a3d71    # 2.66f

    .line 1123
    .line 1124
    .line 1125
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1126
    .line 1127
    .line 1128
    const v0, 0x40833333    # 4.1f

    .line 1129
    .line 1130
    .line 1131
    const v2, 0x3f8ccccd    # 1.1f

    .line 1132
    .line 1133
    .line 1134
    const v4, 0x402a3d71    # 2.66f

    .line 1135
    .line 1136
    .line 1137
    const v6, 0x3ff70a3d    # 1.93f

    .line 1138
    .line 1139
    .line 1140
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1141
    .line 1142
    .line 1143
    const v17, 0x3f4ccccd    # 0.8f

    .line 1144
    .line 1145
    .line 1146
    const v18, -0x40cf5c29    # -0.69f

    .line 1147
    .line 1148
    .line 1149
    const v13, 0x3ea3d70a    # 0.32f

    .line 1150
    .line 1151
    .line 1152
    const v14, -0x41c7ae14    # -0.18f

    .line 1153
    .line 1154
    .line 1155
    const v15, 0x3f147ae1    # 0.58f

    .line 1156
    .line 1157
    .line 1158
    const v16, -0x4128f5c3    # -0.42f

    .line 1159
    .line 1160
    .line 1161
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1162
    .line 1163
    .line 1164
    const v17, 0x3e0f5c29    # 0.14f

    .line 1165
    .line 1166
    .line 1167
    const v18, 0x3ea3d70a    # 0.32f

    .line 1168
    .line 1169
    .line 1170
    const v13, 0x3d4ccccd    # 0.05f

    .line 1171
    .line 1172
    .line 1173
    const v14, 0x3de147ae    # 0.11f

    .line 1174
    .line 1175
    .line 1176
    const v15, 0x3da3d70a    # 0.08f

    .line 1177
    .line 1178
    .line 1179
    const v16, 0x3e6147ae    # 0.22f

    .line 1180
    .line 1181
    .line 1182
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1183
    .line 1184
    .line 1185
    const v17, 0x40a851ec    # 5.26f

    .line 1186
    .line 1187
    .line 1188
    const v18, 0x3fb47ae1    # 1.41f

    .line 1189
    .line 1190
    .line 1191
    const v13, 0x3f8a3d71    # 1.08f

    .line 1192
    .line 1193
    .line 1194
    const v14, 0x3fef5c29    # 1.87f

    .line 1195
    .line 1196
    .line 1197
    const v15, 0x4058f5c3    # 3.39f

    .line 1198
    .line 1199
    .line 1200
    const v16, 0x401f5c29    # 2.49f

    .line 1201
    .line 1202
    .line 1203
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1204
    .line 1205
    .line 1206
    const v17, 0x40633333    # 3.55f

    .line 1207
    .line 1208
    .line 1209
    const v18, -0x3f01eb85    # -7.94f

    .line 1210
    .line 1211
    .line 1212
    const v13, 0x4005c28f    # 2.09f

    .line 1213
    .line 1214
    .line 1215
    const v14, -0x40651eb8    # -1.21f

    .line 1216
    .line 1217
    .line 1218
    const v15, 0x402d70a4    # 2.71f

    .line 1219
    .line 1220
    .line 1221
    const v16, -0x3f847ae1    # -3.93f

    .line 1222
    .line 1223
    .line 1224
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1225
    .line 1226
    .line 1227
    const v0, 0x416028f6    # 14.01f

    .line 1228
    .line 1229
    .line 1230
    const v2, 0x41451eb8    # 12.32f

    .line 1231
    .line 1232
    .line 1233
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1234
    .line 1235
    .line 1236
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1237
    .line 1238
    .line 1239
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 1240
    .line 1241
    .line 1242
    move-result-object v2

    .line 1243
    const/16 v16, 0x3800

    .line 1244
    .line 1245
    const/16 v17, 0x0

    .line 1246
    .line 1247
    const/high16 v6, 0x3f800000    # 1.0f

    .line 1248
    .line 1249
    const/4 v7, 0x0

    .line 1250
    const/high16 v12, 0x3f800000    # 1.0f

    .line 1251
    .line 1252
    const/4 v13, 0x0

    .line 1253
    const/4 v14, 0x0

    .line 1254
    const/4 v15, 0x0

    .line 1255
    const-string v4, ""

    .line 1256
    .line 1257
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 1258
    .line 1259
    .line 1260
    move-result-object v0

    .line 1261
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1262
    .line 1263
    .line 1264
    move-result-object v0

    .line 1265
    sput-object v0, Landroidx/compose/material/icons/filled/Diversity2Kt;->_diversity2:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1266
    .line 1267
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 1268
    .line 1269
    .line 1270
    return-object v0
.end method
