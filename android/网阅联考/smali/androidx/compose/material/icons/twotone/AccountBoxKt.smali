.class public final Landroidx/compose/material/icons/twotone/AccountBoxKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_accountBox",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "AccountBox",
        "Landroidx/compose/material/icons/Icons$TwoTone;",
        "getAccountBox",
        "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;",
        "material-icons-core_release"
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
        "SMAP\nAccountBox.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AccountBox.kt\nandroidx/compose/material/icons/twotone/AccountBoxKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,90:1\n122#2:91\n116#2,3:92\n119#2,3:96\n132#2,18:99\n152#2:136\n132#2,18:137\n152#2:174\n132#2,18:175\n152#2:212\n175#3:95\n694#4,2:117\n706#4,2:119\n708#4,11:125\n694#4,2:155\n706#4,2:157\n708#4,11:163\n694#4,2:193\n706#4,2:195\n708#4,11:201\n53#5,4:121\n53#5,4:159\n53#5,4:197\n*S KotlinDebug\n*F\n+ 1 AccountBox.kt\nandroidx/compose/material/icons/twotone/AccountBoxKt\n*L\n29#1:91\n29#1:92,3\n29#1:96,3\n30#1:99,18\n30#1:136\n45#1:137,18\n45#1:174\n71#1:175,18\n71#1:212\n29#1:95\n30#1:117,2\n30#1:119,2\n30#1:125,11\n45#1:155,2\n45#1:157,2\n45#1:163,11\n71#1:193,2\n71#1:195,2\n71#1:201,11\n30#1:121,4\n45#1:159,4\n71#1:197,4\n*E\n"
    }
.end annotation


# static fields
.field private static _accountBox:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getAccountBox(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 64

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    move-object/from16 v1, p0

    .line 4
    .line 5
    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    sget-object v0, Landroidx/compose/material/icons/twotone/AccountBoxKt;->_accountBox:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    return-object v0

    .line 16
    :cond_0
    const-string v2, "TwoTone.AccountBox"

    .line 17
    .line 18
    new-instance v1, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 19
    .line 20
    move-object/from16 v47, v1

    .line 21
    .line 22
    move-object/from16 v30, v1

    .line 23
    .line 24
    move-object v13, v1

    .line 25
    const/high16 v0, 0x41c00000    # 24.0f

    .line 26
    .line 27
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 32
    .line 33
    .line 34
    move-result v4

    .line 35
    const/high16 v5, 0x41c00000    # 24.0f

    .line 36
    .line 37
    const/high16 v6, 0x41c00000    # 24.0f

    .line 38
    .line 39
    const-wide/16 v7, 0x0

    .line 40
    .line 41
    const/4 v9, 0x0

    .line 42
    const/4 v10, 0x0

    .line 43
    const/16 v11, 0xe0

    .line 44
    .line 45
    const/4 v12, 0x0

    .line 46
    invoke-direct/range {v1 .. v12}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;-><init>(Ljava/lang/String;FFFFJIZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 47
    .line 48
    .line 49
    const v18, 0x3e99999a    # 0.3f

    .line 50
    .line 51
    .line 52
    const v20, 0x3e99999a    # 0.3f

    .line 53
    .line 54
    .line 55
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 56
    .line 57
    .line 58
    move-result v15

    .line 59
    new-instance v0, Landroidx/compose/ui/graphics/SolidColor;

    .line 60
    .line 61
    move-object/from16 v17, v0

    .line 62
    .line 63
    sget-object v1, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    .line 64
    .line 65
    invoke-virtual {v1}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 66
    .line 67
    .line 68
    move-result-wide v2

    .line 69
    const/4 v4, 0x0

    .line 70
    invoke-direct {v0, v2, v3, v4}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 71
    .line 72
    .line 73
    const/16 v19, 0x0

    .line 74
    .line 75
    const/high16 v21, 0x3f800000    # 1.0f

    .line 76
    .line 77
    sget-object v0, Landroidx/compose/ui/graphics/StrokeCap;->Companion:Landroidx/compose/ui/graphics/StrokeCap$Companion;

    .line 78
    .line 79
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 80
    .line 81
    .line 82
    move-result v22

    .line 83
    sget-object v2, Landroidx/compose/ui/graphics/StrokeJoin;->Companion:Landroidx/compose/ui/graphics/StrokeJoin$Companion;

    .line 84
    .line 85
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 86
    .line 87
    .line 88
    move-result v23

    .line 89
    const/high16 v24, 0x3f800000    # 1.0f

    .line 90
    .line 91
    const-string v16, ""

    .line 92
    .line 93
    new-instance v3, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 94
    .line 95
    invoke-direct {v3}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 96
    .line 97
    .line 98
    const/high16 v12, 0x40a00000    # 5.0f

    .line 99
    .line 100
    const v14, 0x418ee148    # 17.86f

    .line 101
    .line 102
    .line 103
    invoke-virtual {v3, v12, v14}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 104
    .line 105
    .line 106
    const v6, 0x40d9999a    # 6.8f

    .line 107
    .line 108
    .line 109
    const v7, 0x4180b852    # 16.09f

    .line 110
    .line 111
    .line 112
    const v8, 0x411451ec    # 9.27f

    .line 113
    .line 114
    .line 115
    const/high16 v9, 0x41700000    # 15.0f

    .line 116
    .line 117
    const/high16 v10, 0x41400000    # 12.0f

    .line 118
    .line 119
    const/high16 v11, 0x41700000    # 15.0f

    .line 120
    .line 121
    move-object v5, v3

    .line 122
    invoke-virtual/range {v5 .. v11}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 123
    .line 124
    .line 125
    const v5, 0x40a66666    # 5.2f

    .line 126
    .line 127
    .line 128
    const v11, 0x3f8b851f    # 1.09f

    .line 129
    .line 130
    .line 131
    const/high16 v10, 0x40e00000    # 7.0f

    .line 132
    .line 133
    const v9, 0x40370a3d    # 2.86f

    .line 134
    .line 135
    .line 136
    invoke-virtual {v3, v5, v11, v10, v9}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 137
    .line 138
    .line 139
    invoke-virtual {v3, v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 140
    .line 141
    .line 142
    invoke-virtual {v3, v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 143
    .line 144
    .line 145
    invoke-virtual {v3, v14}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 146
    .line 147
    .line 148
    invoke-virtual {v3}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 149
    .line 150
    .line 151
    const/high16 v8, 0x41400000    # 12.0f

    .line 152
    .line 153
    const/high16 v7, 0x40c00000    # 6.0f

    .line 154
    .line 155
    invoke-virtual {v3, v8, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 156
    .line 157
    .line 158
    const v6, 0x3ff70a3d    # 1.93f

    .line 159
    .line 160
    .line 161
    const/16 v25, 0x0

    .line 162
    .line 163
    const/high16 v26, 0x40600000    # 3.5f

    .line 164
    .line 165
    const v27, 0x3fc8f5c3    # 1.57f

    .line 166
    .line 167
    .line 168
    const/high16 v28, 0x40600000    # 3.5f

    .line 169
    .line 170
    const/high16 v29, 0x40600000    # 3.5f

    .line 171
    .line 172
    move-object v5, v3

    .line 173
    move v12, v7

    .line 174
    move/from16 v7, v25

    .line 175
    .line 176
    move v4, v8

    .line 177
    move/from16 v8, v26

    .line 178
    .line 179
    move/from16 v9, v27

    .line 180
    .line 181
    move/from16 v10, v28

    .line 182
    .line 183
    move/from16 v11, v29

    .line 184
    .line 185
    invoke-virtual/range {v5 .. v11}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 186
    .line 187
    .line 188
    const v11, 0x415ee148    # 13.93f

    .line 189
    .line 190
    .line 191
    const/high16 v10, 0x41500000    # 13.0f

    .line 192
    .line 193
    invoke-virtual {v3, v11, v10, v4, v10}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 194
    .line 195
    .line 196
    const v6, -0x4008f5c3    # -1.93f

    .line 197
    .line 198
    .line 199
    const/4 v7, 0x0

    .line 200
    const/high16 v8, -0x3fa00000    # -3.5f

    .line 201
    .line 202
    const v9, -0x40370a3d    # -1.57f

    .line 203
    .line 204
    .line 205
    const/high16 v25, -0x3fa00000    # -3.5f

    .line 206
    .line 207
    const/high16 v26, -0x3fa00000    # -3.5f

    .line 208
    .line 209
    move/from16 v10, v25

    .line 210
    .line 211
    move/from16 v11, v26

    .line 212
    .line 213
    invoke-virtual/range {v5 .. v11}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 214
    .line 215
    .line 216
    const v5, 0x41211eb8    # 10.07f

    .line 217
    .line 218
    .line 219
    invoke-virtual {v3, v5, v12, v4, v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 220
    .line 221
    .line 222
    invoke-virtual {v3}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 223
    .line 224
    .line 225
    invoke-virtual {v3}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 226
    .line 227
    .line 228
    move-result-object v3

    .line 229
    move v6, v14

    .line 230
    move-object v14, v3

    .line 231
    const/16 v25, 0x0

    .line 232
    .line 233
    const/16 v26, 0x0

    .line 234
    .line 235
    const/16 v27, 0x0

    .line 236
    .line 237
    const/16 v28, 0x3800

    .line 238
    .line 239
    const/16 v29, 0x0

    .line 240
    .line 241
    invoke-static/range {v13 .. v29}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 242
    .line 243
    .line 244
    const/high16 v35, 0x3f800000    # 1.0f

    .line 245
    .line 246
    const/high16 v37, 0x3f800000    # 1.0f

    .line 247
    .line 248
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 249
    .line 250
    .line 251
    move-result v32

    .line 252
    new-instance v3, Landroidx/compose/ui/graphics/SolidColor;

    .line 253
    .line 254
    move-object/from16 v34, v3

    .line 255
    .line 256
    invoke-virtual {v1}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 257
    .line 258
    .line 259
    move-result-wide v7

    .line 260
    const/4 v9, 0x0

    .line 261
    invoke-direct {v3, v7, v8, v9}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 262
    .line 263
    .line 264
    const/16 v36, 0x0

    .line 265
    .line 266
    const/high16 v38, 0x3f800000    # 1.0f

    .line 267
    .line 268
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 269
    .line 270
    .line 271
    move-result v39

    .line 272
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 273
    .line 274
    .line 275
    move-result v40

    .line 276
    const/high16 v41, 0x3f800000    # 1.0f

    .line 277
    .line 278
    const-string v33, ""

    .line 279
    .line 280
    new-instance v3, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 281
    .line 282
    invoke-direct {v3}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 283
    .line 284
    .line 285
    const/high16 v7, 0x40400000    # 3.0f

    .line 286
    .line 287
    const/high16 v8, 0x41980000    # 19.0f

    .line 288
    .line 289
    invoke-virtual {v3, v8, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 290
    .line 291
    .line 292
    const/high16 v7, 0x40a00000    # 5.0f

    .line 293
    .line 294
    invoke-virtual {v3, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 295
    .line 296
    .line 297
    const v14, 0x4079999a    # 3.9f

    .line 298
    .line 299
    .line 300
    const/high16 v15, 0x40400000    # 3.0f

    .line 301
    .line 302
    const/high16 v16, 0x40400000    # 3.0f

    .line 303
    .line 304
    const v17, 0x4079999a    # 3.9f

    .line 305
    .line 306
    .line 307
    const/high16 v18, 0x40400000    # 3.0f

    .line 308
    .line 309
    const/high16 v19, 0x40a00000    # 5.0f

    .line 310
    .line 311
    move-object v13, v3

    .line 312
    invoke-virtual/range {v13 .. v19}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 313
    .line 314
    .line 315
    const/high16 v7, 0x41600000    # 14.0f

    .line 316
    .line 317
    invoke-virtual {v3, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 318
    .line 319
    .line 320
    const/4 v14, 0x0

    .line 321
    const v15, 0x3f8ccccd    # 1.1f

    .line 322
    .line 323
    .line 324
    const v16, 0x3f666666    # 0.9f

    .line 325
    .line 326
    .line 327
    const/high16 v17, 0x40000000    # 2.0f

    .line 328
    .line 329
    const/high16 v18, 0x40000000    # 2.0f

    .line 330
    .line 331
    const/high16 v19, 0x40000000    # 2.0f

    .line 332
    .line 333
    invoke-virtual/range {v13 .. v19}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 334
    .line 335
    .line 336
    invoke-virtual {v3, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 337
    .line 338
    .line 339
    const v14, 0x3f8ccccd    # 1.1f

    .line 340
    .line 341
    .line 342
    const/4 v15, 0x0

    .line 343
    const/high16 v16, 0x40000000    # 2.0f

    .line 344
    .line 345
    const v17, -0x4099999a    # -0.9f

    .line 346
    .line 347
    .line 348
    const/high16 v19, -0x40000000    # -2.0f

    .line 349
    .line 350
    invoke-virtual/range {v13 .. v19}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 351
    .line 352
    .line 353
    const/high16 v9, 0x40a00000    # 5.0f

    .line 354
    .line 355
    invoke-virtual {v3, v9}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 356
    .line 357
    .line 358
    const/high16 v14, 0x41a80000    # 21.0f

    .line 359
    .line 360
    const v15, 0x4079999a    # 3.9f

    .line 361
    .line 362
    .line 363
    const v16, 0x41a0cccd    # 20.1f

    .line 364
    .line 365
    .line 366
    const/high16 v17, 0x40400000    # 3.0f

    .line 367
    .line 368
    const/high16 v18, 0x41980000    # 19.0f

    .line 369
    .line 370
    const/high16 v19, 0x40400000    # 3.0f

    .line 371
    .line 372
    invoke-virtual/range {v13 .. v19}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 373
    .line 374
    .line 375
    invoke-virtual {v3}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 376
    .line 377
    .line 378
    const/high16 v9, 0x41880000    # 17.0f

    .line 379
    .line 380
    invoke-virtual {v3, v9, v8}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 381
    .line 382
    .line 383
    const/high16 v9, 0x40e00000    # 7.0f

    .line 384
    .line 385
    invoke-virtual {v3, v9}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 386
    .line 387
    .line 388
    const v9, -0x418a3d71    # -0.24f

    .line 389
    .line 390
    .line 391
    invoke-virtual {v3, v9}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 392
    .line 393
    .line 394
    const v14, 0x4106b852    # 8.42f

    .line 395
    .line 396
    .line 397
    const v15, 0x418cf5c3    # 17.62f

    .line 398
    .line 399
    .line 400
    const v16, 0x41228f5c    # 10.16f

    .line 401
    .line 402
    .line 403
    const/high16 v17, 0x41880000    # 17.0f

    .line 404
    .line 405
    const/high16 v18, 0x41400000    # 12.0f

    .line 406
    .line 407
    const/high16 v19, 0x41880000    # 17.0f

    .line 408
    .line 409
    invoke-virtual/range {v13 .. v19}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 410
    .line 411
    .line 412
    const v9, 0x3f1eb852    # 0.62f

    .line 413
    .line 414
    .line 415
    const v10, 0x3fe147ae    # 1.76f

    .line 416
    .line 417
    .line 418
    const v11, 0x40651eb8    # 3.58f

    .line 419
    .line 420
    .line 421
    const/high16 v13, 0x40a00000    # 5.0f

    .line 422
    .line 423
    invoke-virtual {v3, v11, v9, v13, v10}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 424
    .line 425
    .line 426
    invoke-virtual {v3, v8}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 427
    .line 428
    .line 429
    invoke-virtual {v3}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 430
    .line 431
    .line 432
    invoke-virtual {v3, v8, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 433
    .line 434
    .line 435
    const v14, 0x4189999a    # 17.2f

    .line 436
    .line 437
    .line 438
    const v15, 0x4180b852    # 16.09f

    .line 439
    .line 440
    .line 441
    const v16, 0x416bae14    # 14.73f

    .line 442
    .line 443
    .line 444
    const/high16 v17, 0x41700000    # 15.0f

    .line 445
    .line 446
    const/high16 v19, 0x41700000    # 15.0f

    .line 447
    .line 448
    move-object v13, v3

    .line 449
    invoke-virtual/range {v13 .. v19}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 450
    .line 451
    .line 452
    const v8, -0x3f59999a    # -5.2f

    .line 453
    .line 454
    .line 455
    const/high16 v9, -0x3f200000    # -7.0f

    .line 456
    .line 457
    const v10, 0x40370a3d    # 2.86f

    .line 458
    .line 459
    .line 460
    const v11, 0x3f8b851f    # 1.09f

    .line 461
    .line 462
    .line 463
    invoke-virtual {v3, v8, v11, v9, v10}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 464
    .line 465
    .line 466
    const/high16 v8, 0x40a00000    # 5.0f

    .line 467
    .line 468
    invoke-virtual {v3, v8}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 469
    .line 470
    .line 471
    invoke-virtual {v3, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 472
    .line 473
    .line 474
    invoke-virtual {v3, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 475
    .line 476
    .line 477
    invoke-virtual {v3}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 478
    .line 479
    .line 480
    invoke-virtual {v3}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 481
    .line 482
    .line 483
    move-result-object v31

    .line 484
    const/16 v42, 0x0

    .line 485
    .line 486
    const/16 v43, 0x0

    .line 487
    .line 488
    const/16 v44, 0x0

    .line 489
    .line 490
    const/16 v45, 0x3800

    .line 491
    .line 492
    const/16 v46, 0x0

    .line 493
    .line 494
    invoke-static/range {v30 .. v46}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 495
    .line 496
    .line 497
    const/high16 v52, 0x3f800000    # 1.0f

    .line 498
    .line 499
    const/high16 v54, 0x3f800000    # 1.0f

    .line 500
    .line 501
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 502
    .line 503
    .line 504
    move-result v49

    .line 505
    new-instance v3, Landroidx/compose/ui/graphics/SolidColor;

    .line 506
    .line 507
    move-object/from16 v51, v3

    .line 508
    .line 509
    invoke-virtual {v1}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 510
    .line 511
    .line 512
    move-result-wide v6

    .line 513
    const/4 v1, 0x0

    .line 514
    invoke-direct {v3, v6, v7, v1}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 515
    .line 516
    .line 517
    const/16 v53, 0x0

    .line 518
    .line 519
    const/high16 v55, 0x3f800000    # 1.0f

    .line 520
    .line 521
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 522
    .line 523
    .line 524
    move-result v56

    .line 525
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 526
    .line 527
    .line 528
    move-result v57

    .line 529
    const/high16 v58, 0x3f800000    # 1.0f

    .line 530
    .line 531
    const-string v50, ""

    .line 532
    .line 533
    new-instance v0, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 534
    .line 535
    invoke-direct {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 536
    .line 537
    .line 538
    const/high16 v1, 0x41500000    # 13.0f

    .line 539
    .line 540
    invoke-virtual {v0, v4, v1}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 541
    .line 542
    .line 543
    const v14, 0x3ff70a3d    # 1.93f

    .line 544
    .line 545
    .line 546
    const/4 v15, 0x0

    .line 547
    const/high16 v16, 0x40600000    # 3.5f

    .line 548
    .line 549
    const v17, -0x40370a3d    # -1.57f

    .line 550
    .line 551
    .line 552
    const/high16 v18, 0x40600000    # 3.5f

    .line 553
    .line 554
    const/high16 v19, -0x3fa00000    # -3.5f

    .line 555
    .line 556
    move-object v13, v0

    .line 557
    invoke-virtual/range {v13 .. v19}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 558
    .line 559
    .line 560
    const v2, 0x415ee148    # 13.93f

    .line 561
    .line 562
    .line 563
    invoke-virtual {v0, v2, v12, v4, v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 564
    .line 565
    .line 566
    const v14, -0x4008f5c3    # -1.93f

    .line 567
    .line 568
    .line 569
    const/high16 v16, -0x3fa00000    # -3.5f

    .line 570
    .line 571
    const v17, 0x3fc8f5c3    # 1.57f

    .line 572
    .line 573
    .line 574
    const/high16 v18, -0x3fa00000    # -3.5f

    .line 575
    .line 576
    const/high16 v19, 0x40600000    # 3.5f

    .line 577
    .line 578
    invoke-virtual/range {v13 .. v19}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 579
    .line 580
    .line 581
    invoke-virtual {v0, v5, v1, v4, v1}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 582
    .line 583
    .line 584
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 585
    .line 586
    .line 587
    const/high16 v1, 0x41000000    # 8.0f

    .line 588
    .line 589
    invoke-virtual {v0, v4, v1}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 590
    .line 591
    .line 592
    const v14, 0x3f547ae1    # 0.83f

    .line 593
    .line 594
    .line 595
    const/high16 v16, 0x3fc00000    # 1.5f

    .line 596
    .line 597
    const v17, 0x3f2b851f    # 0.67f

    .line 598
    .line 599
    .line 600
    const/high16 v18, 0x3fc00000    # 1.5f

    .line 601
    .line 602
    const/high16 v19, 0x3fc00000    # 1.5f

    .line 603
    .line 604
    invoke-virtual/range {v13 .. v19}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 605
    .line 606
    .line 607
    const v2, 0x414d47ae    # 12.83f

    .line 608
    .line 609
    .line 610
    const/high16 v3, 0x41300000    # 11.0f

    .line 611
    .line 612
    invoke-virtual {v0, v2, v3, v4, v3}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 613
    .line 614
    .line 615
    const v2, -0x40d47ae1    # -0.67f

    .line 616
    .line 617
    .line 618
    const/high16 v3, -0x40400000    # -1.5f

    .line 619
    .line 620
    invoke-virtual {v0, v3, v2, v3, v3}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 621
    .line 622
    .line 623
    const v2, 0x4132b852    # 11.17f

    .line 624
    .line 625
    .line 626
    invoke-virtual {v0, v2, v1, v4, v1}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 627
    .line 628
    .line 629
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 630
    .line 631
    .line 632
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 633
    .line 634
    .line 635
    move-result-object v48

    .line 636
    const/16 v59, 0x0

    .line 637
    .line 638
    const/16 v60, 0x0

    .line 639
    .line 640
    const/16 v61, 0x0

    .line 641
    .line 642
    const/16 v62, 0x3800

    .line 643
    .line 644
    const/16 v63, 0x0

    .line 645
    .line 646
    invoke-static/range {v47 .. v63}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 647
    .line 648
    .line 649
    move-result-object v0

    .line 650
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 651
    .line 652
    .line 653
    move-result-object v0

    .line 654
    sput-object v0, Landroidx/compose/material/icons/twotone/AccountBoxKt;->_accountBox:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 655
    .line 656
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 657
    .line 658
    .line 659
    return-object v0
.end method
