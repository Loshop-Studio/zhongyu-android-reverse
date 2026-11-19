.class public final Landroidx/compose/material/icons/outlined/AccountCircleKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_accountCircle",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "AccountCircle",
        "Landroidx/compose/material/icons/Icons$Outlined;",
        "getAccountCircle",
        "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;",
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
        "SMAP\nAccountCircle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AccountCircle.kt\nandroidx/compose/material/icons/outlined/AccountCircleKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,73:1\n122#2:74\n116#2,3:75\n119#2,3:79\n132#2,18:82\n152#2:119\n132#2,18:120\n152#2:157\n175#3:78\n694#4,2:100\n706#4,2:102\n708#4,11:108\n694#4,2:138\n706#4,2:140\n708#4,11:146\n53#5,4:104\n53#5,4:142\n*S KotlinDebug\n*F\n+ 1 AccountCircle.kt\nandroidx/compose/material/icons/outlined/AccountCircleKt\n*L\n29#1:74\n29#1:75,3\n29#1:79,3\n30#1:82,18\n30#1:119\n54#1:120,18\n54#1:157\n29#1:78\n30#1:100,2\n30#1:102,2\n30#1:108,11\n54#1:138,2\n54#1:140,2\n54#1:146,11\n30#1:104,4\n54#1:142,4\n*E\n"
    }
.end annotation


# static fields
.field private static _accountCircle:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getAccountCircle(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 47

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
    sget-object v0, Landroidx/compose/material/icons/outlined/AccountCircleKt;->_accountCircle:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Outlined.AccountCircle"

    .line 17
    .line 18
    new-instance v1, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 19
    .line 20
    move-object/from16 v30, v1

    .line 21
    .line 22
    move-object v13, v1

    .line 23
    const/high16 v0, 0x41c00000    # 24.0f

    .line 24
    .line 25
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 30
    .line 31
    .line 32
    move-result v4

    .line 33
    const/high16 v5, 0x41c00000    # 24.0f

    .line 34
    .line 35
    const/high16 v6, 0x41c00000    # 24.0f

    .line 36
    .line 37
    const-wide/16 v7, 0x0

    .line 38
    .line 39
    const/4 v9, 0x0

    .line 40
    const/4 v10, 0x0

    .line 41
    const/16 v11, 0xe0

    .line 42
    .line 43
    const/4 v12, 0x0

    .line 44
    invoke-direct/range {v1 .. v12}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;-><init>(Ljava/lang/String;FFFFJIZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 45
    .line 46
    .line 47
    const/high16 v18, 0x3f800000    # 1.0f

    .line 48
    .line 49
    const/high16 v20, 0x3f800000    # 1.0f

    .line 50
    .line 51
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 52
    .line 53
    .line 54
    move-result v15

    .line 55
    new-instance v0, Landroidx/compose/ui/graphics/SolidColor;

    .line 56
    .line 57
    move-object/from16 v17, v0

    .line 58
    .line 59
    sget-object v1, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    .line 60
    .line 61
    invoke-virtual {v1}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 62
    .line 63
    .line 64
    move-result-wide v2

    .line 65
    const/4 v4, 0x0

    .line 66
    invoke-direct {v0, v2, v3, v4}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 67
    .line 68
    .line 69
    const/16 v19, 0x0

    .line 70
    .line 71
    const/high16 v21, 0x3f800000    # 1.0f

    .line 72
    .line 73
    sget-object v0, Landroidx/compose/ui/graphics/StrokeCap;->Companion:Landroidx/compose/ui/graphics/StrokeCap$Companion;

    .line 74
    .line 75
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 76
    .line 77
    .line 78
    move-result v22

    .line 79
    sget-object v2, Landroidx/compose/ui/graphics/StrokeJoin;->Companion:Landroidx/compose/ui/graphics/StrokeJoin$Companion;

    .line 80
    .line 81
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 82
    .line 83
    .line 84
    move-result v23

    .line 85
    const/high16 v24, 0x3f800000    # 1.0f

    .line 86
    .line 87
    const-string v16, ""

    .line 88
    .line 89
    new-instance v3, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 90
    .line 91
    invoke-direct {v3}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 92
    .line 93
    .line 94
    const/high16 v12, 0x41400000    # 12.0f

    .line 95
    .line 96
    const/high16 v14, 0x40000000    # 2.0f

    .line 97
    .line 98
    invoke-virtual {v3, v12, v14}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 99
    .line 100
    .line 101
    const v6, 0x40cf5c29    # 6.48f

    .line 102
    .line 103
    .line 104
    const/high16 v7, 0x40000000    # 2.0f

    .line 105
    .line 106
    const/high16 v8, 0x40000000    # 2.0f

    .line 107
    .line 108
    const v9, 0x40cf5c29    # 6.48f

    .line 109
    .line 110
    .line 111
    const/high16 v10, 0x40000000    # 2.0f

    .line 112
    .line 113
    const/high16 v11, 0x41400000    # 12.0f

    .line 114
    .line 115
    move-object v5, v3

    .line 116
    invoke-virtual/range {v5 .. v11}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 117
    .line 118
    .line 119
    const v5, 0x408f5c29    # 4.48f

    .line 120
    .line 121
    .line 122
    const/high16 v6, 0x41200000    # 10.0f

    .line 123
    .line 124
    invoke-virtual {v3, v5, v6, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 125
    .line 126
    .line 127
    const v5, -0x3f70a3d7    # -4.48f

    .line 128
    .line 129
    .line 130
    const/high16 v7, -0x3ee00000    # -10.0f

    .line 131
    .line 132
    invoke-virtual {v3, v6, v5, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 133
    .line 134
    .line 135
    const v5, 0x418c28f6    # 17.52f

    .line 136
    .line 137
    .line 138
    invoke-virtual {v3, v5, v14, v12, v14}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 139
    .line 140
    .line 141
    invoke-virtual {v3}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 142
    .line 143
    .line 144
    const v14, 0x40eb3333    # 7.35f

    .line 145
    .line 146
    .line 147
    const/high16 v11, 0x41940000    # 18.5f

    .line 148
    .line 149
    invoke-virtual {v3, v14, v11}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 150
    .line 151
    .line 152
    const v6, 0x410a8f5c    # 8.66f

    .line 153
    .line 154
    .line 155
    const v7, 0x418c7ae1    # 17.56f

    .line 156
    .line 157
    .line 158
    const v8, 0x412428f6    # 10.26f

    .line 159
    .line 160
    .line 161
    const/high16 v9, 0x41880000    # 17.0f

    .line 162
    .line 163
    const/high16 v10, 0x41400000    # 12.0f

    .line 164
    .line 165
    const/high16 v25, 0x41880000    # 17.0f

    .line 166
    .line 167
    move-object v5, v3

    .line 168
    move v12, v11

    .line 169
    move/from16 v11, v25

    .line 170
    .line 171
    invoke-virtual/range {v5 .. v11}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 172
    .line 173
    .line 174
    const v5, 0x3f0f5c29    # 0.56f

    .line 175
    .line 176
    .line 177
    const v6, 0x4094cccd    # 4.65f

    .line 178
    .line 179
    .line 180
    const v7, 0x4055c28f    # 3.34f

    .line 181
    .line 182
    .line 183
    const/high16 v11, 0x3fc00000    # 1.5f

    .line 184
    .line 185
    invoke-virtual {v3, v7, v5, v6, v11}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 186
    .line 187
    .line 188
    const v6, 0x417570a4    # 15.34f

    .line 189
    .line 190
    .line 191
    const v7, 0x419b851f    # 19.44f

    .line 192
    .line 193
    .line 194
    const v8, 0x415bd70a    # 13.74f

    .line 195
    .line 196
    .line 197
    const/high16 v9, 0x41a00000    # 20.0f

    .line 198
    .line 199
    const/high16 v25, 0x41a00000    # 20.0f

    .line 200
    .line 201
    move-object v5, v3

    .line 202
    move/from16 v11, v25

    .line 203
    .line 204
    invoke-virtual/range {v5 .. v11}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 205
    .line 206
    .line 207
    const v5, 0x410a8f5c    # 8.66f

    .line 208
    .line 209
    .line 210
    const v6, 0x419b851f    # 19.44f

    .line 211
    .line 212
    .line 213
    invoke-virtual {v3, v5, v6, v14, v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 214
    .line 215
    .line 216
    invoke-virtual {v3}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 217
    .line 218
    .line 219
    const v5, 0x41911eb8    # 18.14f

    .line 220
    .line 221
    .line 222
    const v6, 0x4188f5c3    # 17.12f

    .line 223
    .line 224
    .line 225
    invoke-virtual {v3, v5, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 226
    .line 227
    .line 228
    invoke-virtual {v3, v5, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 229
    .line 230
    .line 231
    const v6, 0x4183999a    # 16.45f

    .line 232
    .line 233
    .line 234
    const v7, 0x417ccccd    # 15.8f

    .line 235
    .line 236
    .line 237
    const v8, 0x41651eb8    # 14.32f

    .line 238
    .line 239
    .line 240
    const/high16 v9, 0x41700000    # 15.0f

    .line 241
    .line 242
    const/high16 v11, 0x41700000    # 15.0f

    .line 243
    .line 244
    move-object v5, v3

    .line 245
    invoke-virtual/range {v5 .. v11}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 246
    .line 247
    .line 248
    const v5, -0x3f3b851f    # -6.14f

    .line 249
    .line 250
    .line 251
    const v6, 0x4007ae14    # 2.12f

    .line 252
    .line 253
    .line 254
    const v7, -0x3f71999a    # -4.45f

    .line 255
    .line 256
    .line 257
    const v8, 0x3f4ccccd    # 0.8f

    .line 258
    .line 259
    .line 260
    invoke-virtual {v3, v7, v8, v5, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 261
    .line 262
    .line 263
    const/4 v5, 0x0

    .line 264
    invoke-virtual {v3, v5, v5}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 265
    .line 266
    .line 267
    const v6, 0x40966666    # 4.7f

    .line 268
    .line 269
    .line 270
    const v7, 0x417bae14    # 15.73f

    .line 271
    .line 272
    .line 273
    const/high16 v8, 0x40800000    # 4.0f

    .line 274
    .line 275
    const v9, 0x415f3333    # 13.95f

    .line 276
    .line 277
    .line 278
    const/high16 v10, 0x40800000    # 4.0f

    .line 279
    .line 280
    const/high16 v11, 0x41400000    # 12.0f

    .line 281
    .line 282
    move-object v5, v3

    .line 283
    invoke-virtual/range {v5 .. v11}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 284
    .line 285
    .line 286
    const/4 v6, 0x0

    .line 287
    const v7, -0x3f728f5c    # -4.42f

    .line 288
    .line 289
    .line 290
    const v8, 0x40651eb8    # 3.58f

    .line 291
    .line 292
    .line 293
    const/high16 v9, -0x3f000000    # -8.0f

    .line 294
    .line 295
    const/high16 v10, 0x41000000    # 8.0f

    .line 296
    .line 297
    const/high16 v11, -0x3f000000    # -8.0f

    .line 298
    .line 299
    invoke-virtual/range {v5 .. v11}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 300
    .line 301
    .line 302
    const v5, 0x40651eb8    # 3.58f

    .line 303
    .line 304
    .line 305
    const/high16 v12, 0x41000000    # 8.0f

    .line 306
    .line 307
    invoke-virtual {v3, v12, v5, v12, v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 308
    .line 309
    .line 310
    const/high16 v6, 0x41a00000    # 20.0f

    .line 311
    .line 312
    const v7, 0x415f3333    # 13.95f

    .line 313
    .line 314
    .line 315
    const v8, 0x419a6666    # 19.3f

    .line 316
    .line 317
    .line 318
    const v9, 0x417bae14    # 15.73f

    .line 319
    .line 320
    .line 321
    const v10, 0x41911eb8    # 18.14f

    .line 322
    .line 323
    .line 324
    const v11, 0x4188f5c3    # 17.12f

    .line 325
    .line 326
    .line 327
    move-object v5, v3

    .line 328
    invoke-virtual/range {v5 .. v11}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 329
    .line 330
    .line 331
    invoke-virtual {v3}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 332
    .line 333
    .line 334
    invoke-virtual {v3}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 335
    .line 336
    .line 337
    move-result-object v14

    .line 338
    const/16 v25, 0x0

    .line 339
    .line 340
    const/16 v26, 0x0

    .line 341
    .line 342
    const/16 v27, 0x0

    .line 343
    .line 344
    const/16 v28, 0x3800

    .line 345
    .line 346
    const/16 v29, 0x0

    .line 347
    .line 348
    invoke-static/range {v13 .. v29}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 349
    .line 350
    .line 351
    const/high16 v35, 0x3f800000    # 1.0f

    .line 352
    .line 353
    const/high16 v37, 0x3f800000    # 1.0f

    .line 354
    .line 355
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 356
    .line 357
    .line 358
    move-result v32

    .line 359
    new-instance v3, Landroidx/compose/ui/graphics/SolidColor;

    .line 360
    .line 361
    move-object/from16 v34, v3

    .line 362
    .line 363
    invoke-virtual {v1}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 364
    .line 365
    .line 366
    move-result-wide v5

    .line 367
    invoke-direct {v3, v5, v6, v4}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 368
    .line 369
    .line 370
    const/16 v36, 0x0

    .line 371
    .line 372
    const/high16 v38, 0x3f800000    # 1.0f

    .line 373
    .line 374
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 375
    .line 376
    .line 377
    move-result v39

    .line 378
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 379
    .line 380
    .line 381
    move-result v40

    .line 382
    const/high16 v41, 0x3f800000    # 1.0f

    .line 383
    .line 384
    const-string v33, ""

    .line 385
    .line 386
    new-instance v7, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 387
    .line 388
    invoke-direct {v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 389
    .line 390
    .line 391
    const/high16 v8, 0x40c00000    # 6.0f

    .line 392
    .line 393
    const/high16 v0, 0x41400000    # 12.0f

    .line 394
    .line 395
    invoke-virtual {v7, v0, v8}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 396
    .line 397
    .line 398
    const v1, -0x4008f5c3    # -1.93f

    .line 399
    .line 400
    .line 401
    const/4 v2, 0x0

    .line 402
    const/high16 v3, -0x3fa00000    # -3.5f

    .line 403
    .line 404
    const v4, 0x3fc8f5c3    # 1.57f

    .line 405
    .line 406
    .line 407
    const/high16 v5, -0x3fa00000    # -3.5f

    .line 408
    .line 409
    const/high16 v6, 0x40600000    # 3.5f

    .line 410
    .line 411
    move-object v0, v7

    .line 412
    invoke-virtual/range {v0 .. v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 413
    .line 414
    .line 415
    const v0, 0x41211eb8    # 10.07f

    .line 416
    .line 417
    .line 418
    const/high16 v1, 0x41500000    # 13.0f

    .line 419
    .line 420
    const/high16 v2, 0x41400000    # 12.0f

    .line 421
    .line 422
    invoke-virtual {v7, v0, v1, v2, v1}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 423
    .line 424
    .line 425
    const v0, -0x40370a3d    # -1.57f

    .line 426
    .line 427
    .line 428
    const/high16 v1, -0x3fa00000    # -3.5f

    .line 429
    .line 430
    const/high16 v3, 0x40600000    # 3.5f

    .line 431
    .line 432
    invoke-virtual {v7, v3, v0, v3, v1}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 433
    .line 434
    .line 435
    const v0, 0x415ee148    # 13.93f

    .line 436
    .line 437
    .line 438
    invoke-virtual {v7, v0, v8, v2, v8}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 439
    .line 440
    .line 441
    invoke-virtual {v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 442
    .line 443
    .line 444
    const/high16 v8, 0x41300000    # 11.0f

    .line 445
    .line 446
    invoke-virtual {v7, v2, v8}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 447
    .line 448
    .line 449
    const v1, -0x40ab851f    # -0.83f

    .line 450
    .line 451
    .line 452
    const/4 v2, 0x0

    .line 453
    const/high16 v3, -0x40400000    # -1.5f

    .line 454
    .line 455
    const v4, -0x40d47ae1    # -0.67f

    .line 456
    .line 457
    .line 458
    const/high16 v5, -0x40400000    # -1.5f

    .line 459
    .line 460
    const/high16 v6, -0x40400000    # -1.5f

    .line 461
    .line 462
    move-object v0, v7

    .line 463
    invoke-virtual/range {v0 .. v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 464
    .line 465
    .line 466
    const v0, 0x4132b852    # 11.17f

    .line 467
    .line 468
    .line 469
    const/high16 v1, 0x41400000    # 12.0f

    .line 470
    .line 471
    invoke-virtual {v7, v0, v12, v1, v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 472
    .line 473
    .line 474
    const v0, 0x3f2b851f    # 0.67f

    .line 475
    .line 476
    .line 477
    const/high16 v2, 0x3fc00000    # 1.5f

    .line 478
    .line 479
    invoke-virtual {v7, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 480
    .line 481
    .line 482
    const v0, 0x414d47ae    # 12.83f

    .line 483
    .line 484
    .line 485
    invoke-virtual {v7, v0, v8, v1, v8}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 486
    .line 487
    .line 488
    invoke-virtual {v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 489
    .line 490
    .line 491
    invoke-virtual {v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 492
    .line 493
    .line 494
    move-result-object v31

    .line 495
    const/16 v42, 0x0

    .line 496
    .line 497
    const/16 v43, 0x0

    .line 498
    .line 499
    const/16 v44, 0x0

    .line 500
    .line 501
    const/16 v45, 0x3800

    .line 502
    .line 503
    const/16 v46, 0x0

    .line 504
    .line 505
    invoke-static/range {v30 .. v46}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 506
    .line 507
    .line 508
    move-result-object v0

    .line 509
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 510
    .line 511
    .line 512
    move-result-object v0

    .line 513
    sput-object v0, Landroidx/compose/material/icons/outlined/AccountCircleKt;->_accountCircle:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 514
    .line 515
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 516
    .line 517
    .line 518
    return-object v0
.end method
