.class public final Landroidx/compose/material/icons/rounded/RestartAltKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_restartAlt",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "RestartAlt",
        "Landroidx/compose/material/icons/Icons$Rounded;",
        "getRestartAlt",
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
        "SMAP\nRestartAlt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RestartAlt.kt\nandroidx/compose/material/icons/rounded/RestartAltKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,67:1\n212#2,12:68\n233#2,18:81\n253#2:118\n233#2,18:119\n253#2:156\n174#3:80\n705#4,2:99\n717#4,2:101\n719#4,11:107\n705#4,2:137\n717#4,2:139\n719#4,11:145\n72#5,4:103\n72#5,4:141\n*S KotlinDebug\n*F\n+ 1 RestartAlt.kt\nandroidx/compose/material/icons/rounded/RestartAltKt\n*L\n29#1:68,12\n30#1:81,18\n30#1:118\n48#1:119,18\n48#1:156\n29#1:80\n30#1:99,2\n30#1:101,2\n30#1:107,11\n48#1:137,2\n48#1:139,2\n48#1:145,11\n30#1:103,4\n48#1:141,4\n*E\n"
    }
.end annotation


# static fields
.field private static _restartAlt:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getRestartAlt(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/RestartAltKt;->_restartAlt:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.RestartAlt"

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
    const/high16 v6, 0x40a00000    # 5.0f

    .line 73
    .line 74
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const v4, 0x404d70a4    # 3.21f

    .line 78
    .line 79
    .line 80
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 81
    .line 82
    .line 83
    const v25, -0x40a66666    # -0.85f

    .line 84
    .line 85
    .line 86
    const v26, -0x414ccccd    # -0.35f

    .line 87
    .line 88
    .line 89
    const/16 v21, 0x0

    .line 90
    .line 91
    const v22, -0x4119999a    # -0.45f

    .line 92
    .line 93
    .line 94
    const v23, -0x40f5c28f    # -0.54f

    .line 95
    .line 96
    .line 97
    const v24, -0x40d47ae1    # -0.67f

    .line 98
    .line 99
    .line 100
    move-object/from16 v20, v2

    .line 101
    .line 102
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 103
    .line 104
    .line 105
    const v4, 0x4105999a    # 8.35f

    .line 106
    .line 107
    .line 108
    const v6, 0x40b4cccd    # 5.65f

    .line 109
    .line 110
    .line 111
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 112
    .line 113
    .line 114
    const/16 v25, 0x0

    .line 115
    .line 116
    const v26, 0x3f35c28f    # 0.71f

    .line 117
    .line 118
    .line 119
    const v21, -0x41b33333    # -0.2f

    .line 120
    .line 121
    .line 122
    const v22, 0x3e4ccccd    # 0.2f

    .line 123
    .line 124
    .line 125
    const v23, -0x41b33333    # -0.2f

    .line 126
    .line 127
    .line 128
    const v24, 0x3f028f5c    # 0.51f

    .line 129
    .line 130
    .line 131
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 132
    .line 133
    .line 134
    const v4, 0x40328f5c    # 2.79f

    .line 135
    .line 136
    .line 137
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 138
    .line 139
    .line 140
    const/high16 v25, 0x41400000    # 12.0f

    .line 141
    .line 142
    const v26, 0x410ca3d7    # 8.79f

    .line 143
    .line 144
    .line 145
    const v21, 0x41375c29    # 11.46f

    .line 146
    .line 147
    .line 148
    const v22, 0x41175c29    # 9.46f

    .line 149
    .line 150
    .line 151
    const/high16 v23, 0x41400000    # 12.0f

    .line 152
    .line 153
    const v24, 0x4113d70a    # 9.24f

    .line 154
    .line 155
    .line 156
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 157
    .line 158
    .line 159
    const/high16 v4, 0x40e00000    # 7.0f

    .line 160
    .line 161
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 162
    .line 163
    .line 164
    const/high16 v25, 0x40c00000    # 6.0f

    .line 165
    .line 166
    const/high16 v26, 0x40c00000    # 6.0f

    .line 167
    .line 168
    const v21, 0x4053d70a    # 3.31f

    .line 169
    .line 170
    .line 171
    const/16 v22, 0x0

    .line 172
    .line 173
    const/high16 v23, 0x40c00000    # 6.0f

    .line 174
    .line 175
    const v24, 0x402c28f6    # 2.69f

    .line 176
    .line 177
    .line 178
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 179
    .line 180
    .line 181
    const v25, -0x3f76147b    # -4.31f

    .line 182
    .line 183
    .line 184
    const/high16 v26, 0x40b80000    # 5.75f

    .line 185
    .line 186
    const/16 v21, 0x0

    .line 187
    .line 188
    const v22, 0x402e147b    # 2.72f

    .line 189
    .line 190
    .line 191
    const v23, -0x4015c28f    # -1.83f

    .line 192
    .line 193
    .line 194
    const v24, 0x40a0a3d7    # 5.02f

    .line 195
    .line 196
    .line 197
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 198
    .line 199
    .line 200
    const/high16 v25, 0x41500000    # 13.0f

    .line 201
    .line 202
    const v26, 0x419d999a    # 19.7f

    .line 203
    .line 204
    .line 205
    const v21, 0x415451ec    # 13.27f

    .line 206
    .line 207
    .line 208
    const v22, 0x4196f5c3    # 18.87f

    .line 209
    .line 210
    .line 211
    const/high16 v23, 0x41500000    # 13.0f

    .line 212
    .line 213
    const v24, 0x419a28f6    # 19.27f

    .line 214
    .line 215
    .line 216
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 217
    .line 218
    .line 219
    const/4 v4, 0x0

    .line 220
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 221
    .line 222
    .line 223
    const/high16 v25, 0x3fa00000    # 1.25f

    .line 224
    .line 225
    const v26, 0x3f7851ec    # 0.97f

    .line 226
    .line 227
    .line 228
    const/16 v21, 0x0

    .line 229
    .line 230
    const v22, 0x3f266666    # 0.65f

    .line 231
    .line 232
    .line 233
    const v23, 0x3f1eb852    # 0.62f

    .line 234
    .line 235
    .line 236
    const v24, 0x3f947ae1    # 1.16f

    .line 237
    .line 238
    .line 239
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 240
    .line 241
    .line 242
    const/high16 v25, 0x41a00000    # 20.0f

    .line 243
    .line 244
    const/high16 v26, 0x41500000    # 13.0f

    .line 245
    .line 246
    const v21, 0x418c8f5c    # 17.57f

    .line 247
    .line 248
    .line 249
    const v22, 0x419d999a    # 19.7f

    .line 250
    .line 251
    .line 252
    const/high16 v23, 0x41a00000    # 20.0f

    .line 253
    .line 254
    const v24, 0x41851eb8    # 16.64f

    .line 255
    .line 256
    .line 257
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 258
    .line 259
    .line 260
    const/high16 v25, 0x41400000    # 12.0f

    .line 261
    .line 262
    const/high16 v26, 0x40a00000    # 5.0f

    .line 263
    .line 264
    const/high16 v21, 0x41a00000    # 20.0f

    .line 265
    .line 266
    const v22, 0x410947ae    # 8.58f

    .line 267
    .line 268
    .line 269
    const v23, 0x41835c29    # 16.42f

    .line 270
    .line 271
    .line 272
    const/high16 v24, 0x40a00000    # 5.0f

    .line 273
    .line 274
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 275
    .line 276
    .line 277
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 278
    .line 279
    .line 280
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 281
    .line 282
    .line 283
    move-result-object v2

    .line 284
    const/16 v16, 0x3800

    .line 285
    .line 286
    const/16 v17, 0x0

    .line 287
    .line 288
    const/high16 v6, 0x3f800000    # 1.0f

    .line 289
    .line 290
    const/high16 v8, 0x3f800000    # 1.0f

    .line 291
    .line 292
    const/4 v7, 0x0

    .line 293
    const/high16 v9, 0x3f800000    # 1.0f

    .line 294
    .line 295
    const/high16 v12, 0x3f800000    # 1.0f

    .line 296
    .line 297
    const/4 v13, 0x0

    .line 298
    const/4 v14, 0x0

    .line 299
    const/4 v15, 0x0

    .line 300
    const-string v4, ""

    .line 301
    .line 302
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 303
    .line 304
    .line 305
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 306
    .line 307
    .line 308
    move-result v3

    .line 309
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 310
    .line 311
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 312
    .line 313
    .line 314
    move-result-wide v6

    .line 315
    const/4 v0, 0x0

    .line 316
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 317
    .line 318
    .line 319
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 320
    .line 321
    .line 322
    move-result v10

    .line 323
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 324
    .line 325
    .line 326
    move-result v11

    .line 327
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 328
    .line 329
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 330
    .line 331
    .line 332
    const/high16 v0, 0x40c00000    # 6.0f

    .line 333
    .line 334
    const/high16 v2, 0x41500000    # 13.0f

    .line 335
    .line 336
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 337
    .line 338
    .line 339
    const v17, 0x3f9851ec    # 1.19f

    .line 340
    .line 341
    .line 342
    const v18, -0x3f9a3d71    # -3.59f

    .line 343
    .line 344
    .line 345
    const v14, -0x40547ae1    # -1.34f

    .line 346
    .line 347
    .line 348
    const v15, 0x3ee147ae    # 0.44f

    .line 349
    .line 350
    .line 351
    const v16, -0x3fdae148    # -2.58f

    .line 352
    .line 353
    .line 354
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 355
    .line 356
    .line 357
    const v17, -0x4247ae14    # -0.09f

    .line 358
    .line 359
    .line 360
    const v18, -0x405851ec    # -1.31f

    .line 361
    .line 362
    .line 363
    const v13, 0x3e99999a    # 0.3f

    .line 364
    .line 365
    .line 366
    const v14, -0x41333333    # -0.4f

    .line 367
    .line 368
    .line 369
    const v15, 0x3e851eb8    # 0.26f

    .line 370
    .line 371
    .line 372
    const v16, -0x408ccccd    # -0.95f

    .line 373
    .line 374
    .line 375
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 376
    .line 377
    .line 378
    const/4 v0, 0x0

    .line 379
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 380
    .line 381
    .line 382
    const v17, 0x40b33333    # 5.6f

    .line 383
    .line 384
    .line 385
    const v18, 0x41033333    # 8.2f

    .line 386
    .line 387
    .line 388
    const v13, 0x40d5c28f    # 6.68f

    .line 389
    .line 390
    .line 391
    const v14, 0x40f5c28f    # 7.68f

    .line 392
    .line 393
    .line 394
    const v15, 0x40beb852    # 5.96f

    .line 395
    .line 396
    .line 397
    const v16, 0x40f70a3d    # 7.72f

    .line 398
    .line 399
    .line 400
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 401
    .line 402
    .line 403
    const/high16 v17, 0x40800000    # 4.0f

    .line 404
    .line 405
    const/high16 v18, 0x41500000    # 13.0f

    .line 406
    .line 407
    const v13, 0x40933333    # 4.6f

    .line 408
    .line 409
    .line 410
    const v14, 0x4118a3d7    # 9.54f

    .line 411
    .line 412
    .line 413
    const/high16 v15, 0x40800000    # 4.0f

    .line 414
    .line 415
    const v16, 0x41333333    # 11.2f

    .line 416
    .line 417
    .line 418
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 419
    .line 420
    .line 421
    const/high16 v17, 0x40b80000    # 5.75f

    .line 422
    .line 423
    const v18, 0x40f570a4    # 7.67f

    .line 424
    .line 425
    .line 426
    const/4 v13, 0x0

    .line 427
    const v14, 0x4068f5c3    # 3.64f

    .line 428
    .line 429
    .line 430
    const v15, 0x401b851f    # 2.43f

    .line 431
    .line 432
    .line 433
    const v16, 0x40d66666    # 6.7f

    .line 434
    .line 435
    .line 436
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 437
    .line 438
    .line 439
    const/high16 v17, 0x41300000    # 11.0f

    .line 440
    .line 441
    const v18, 0x419d999a    # 19.7f

    .line 442
    .line 443
    .line 444
    const v13, 0x4126147b    # 10.38f

    .line 445
    .line 446
    .line 447
    const v14, 0x41a6e148    # 20.86f

    .line 448
    .line 449
    .line 450
    const/high16 v15, 0x41300000    # 11.0f

    .line 451
    .line 452
    const v16, 0x41a2cccd    # 20.35f

    .line 453
    .line 454
    .line 455
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 456
    .line 457
    .line 458
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 459
    .line 460
    .line 461
    const v17, -0x40cf5c29    # -0.69f

    .line 462
    .line 463
    .line 464
    const v18, -0x408ccccd    # -0.95f

    .line 465
    .line 466
    .line 467
    const/4 v13, 0x0

    .line 468
    const v14, -0x4123d70a    # -0.43f

    .line 469
    .line 470
    .line 471
    const v15, -0x4175c28f    # -0.27f

    .line 472
    .line 473
    .line 474
    const v16, -0x40ab851f    # -0.83f

    .line 475
    .line 476
    .line 477
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 478
    .line 479
    .line 480
    const/high16 v17, 0x40c00000    # 6.0f

    .line 481
    .line 482
    const/high16 v18, 0x41500000    # 13.0f

    .line 483
    .line 484
    const v13, 0x40fa8f5c    # 7.83f

    .line 485
    .line 486
    .line 487
    const v14, 0x419028f6    # 18.02f

    .line 488
    .line 489
    .line 490
    const/high16 v15, 0x40c00000    # 6.0f

    .line 491
    .line 492
    const v16, 0x417b851f    # 15.72f

    .line 493
    .line 494
    .line 495
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 496
    .line 497
    .line 498
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 499
    .line 500
    .line 501
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 502
    .line 503
    .line 504
    move-result-object v2

    .line 505
    const/16 v16, 0x3800

    .line 506
    .line 507
    const/16 v17, 0x0

    .line 508
    .line 509
    const/high16 v6, 0x3f800000    # 1.0f

    .line 510
    .line 511
    const/4 v7, 0x0

    .line 512
    const/high16 v12, 0x3f800000    # 1.0f

    .line 513
    .line 514
    const/4 v13, 0x0

    .line 515
    const/4 v14, 0x0

    .line 516
    const/4 v15, 0x0

    .line 517
    const-string v4, ""

    .line 518
    .line 519
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 520
    .line 521
    .line 522
    move-result-object v0

    .line 523
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 524
    .line 525
    .line 526
    move-result-object v0

    .line 527
    sput-object v0, Landroidx/compose/material/icons/rounded/RestartAltKt;->_restartAlt:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 528
    .line 529
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 530
    .line 531
    .line 532
    return-object v0
.end method
