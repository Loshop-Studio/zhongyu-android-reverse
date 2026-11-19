.class public final Landroidx/compose/material/icons/twotone/AccountCircleKt;
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
        "Landroidx/compose/material/icons/Icons$TwoTone;",
        "getAccountCircle",
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
        "SMAP\nAccountCircle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AccountCircle.kt\nandroidx/compose/material/icons/twotone/AccountCircleKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,87:1\n122#2:88\n116#2,3:89\n119#2,3:93\n132#2,18:96\n152#2:133\n132#2,18:134\n152#2:171\n132#2,18:172\n152#2:209\n175#3:92\n694#4,2:114\n706#4,2:116\n708#4,11:122\n694#4,2:152\n706#4,2:154\n708#4,11:160\n694#4,2:190\n706#4,2:192\n708#4,11:198\n53#5,4:118\n53#5,4:156\n53#5,4:194\n*S KotlinDebug\n*F\n+ 1 AccountCircle.kt\nandroidx/compose/material/icons/twotone/AccountCircleKt\n*L\n29#1:88\n29#1:89,3\n29#1:93,3\n30#1:96,18\n30#1:133\n46#1:134,18\n46#1:171\n68#1:172,18\n68#1:209\n29#1:92\n30#1:114,2\n30#1:116,2\n30#1:122,11\n46#1:152,2\n46#1:154,2\n46#1:160,11\n68#1:190,2\n68#1:192,2\n68#1:198,11\n30#1:118,4\n46#1:156,4\n68#1:194,4\n*E\n"
    }
.end annotation


# static fields
.field private static _accountCircle:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getAccountCircle(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
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
    sget-object v0, Landroidx/compose/material/icons/twotone/AccountCircleKt;->_accountCircle:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.AccountCircle"

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
    const/high16 v5, 0x40800000    # 4.0f

    .line 99
    .line 100
    const/high16 v12, 0x41400000    # 12.0f

    .line 101
    .line 102
    invoke-virtual {v3, v12, v5}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 103
    .line 104
    .line 105
    const v6, -0x3f728f5c    # -4.42f

    .line 106
    .line 107
    .line 108
    const/4 v7, 0x0

    .line 109
    const/high16 v8, -0x3f000000    # -8.0f

    .line 110
    .line 111
    const v9, 0x40651eb8    # 3.58f

    .line 112
    .line 113
    .line 114
    const/high16 v10, -0x3f000000    # -8.0f

    .line 115
    .line 116
    const/high16 v11, 0x41000000    # 8.0f

    .line 117
    .line 118
    move-object v5, v3

    .line 119
    invoke-virtual/range {v5 .. v11}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 120
    .line 121
    .line 122
    const/4 v6, 0x0

    .line 123
    const v7, 0x3ff9999a    # 1.95f

    .line 124
    .line 125
    .line 126
    const v8, 0x3f333333    # 0.7f

    .line 127
    .line 128
    .line 129
    const v9, 0x406eb852    # 3.73f

    .line 130
    .line 131
    .line 132
    const v10, 0x3fee147b    # 1.86f

    .line 133
    .line 134
    .line 135
    const v11, 0x40a3d70a    # 5.12f

    .line 136
    .line 137
    .line 138
    invoke-virtual/range {v5 .. v11}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 139
    .line 140
    .line 141
    const v6, 0x40f1999a    # 7.55f

    .line 142
    .line 143
    .line 144
    const v7, 0x417ccccd    # 15.8f

    .line 145
    .line 146
    .line 147
    const v8, 0x411ae148    # 9.68f

    .line 148
    .line 149
    .line 150
    const/high16 v9, 0x41700000    # 15.0f

    .line 151
    .line 152
    const/high16 v10, 0x41400000    # 12.0f

    .line 153
    .line 154
    const/high16 v11, 0x41700000    # 15.0f

    .line 155
    .line 156
    invoke-virtual/range {v5 .. v11}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 157
    .line 158
    .line 159
    const v5, 0x408e6666    # 4.45f

    .line 160
    .line 161
    .line 162
    const v6, 0x40c47ae1    # 6.14f

    .line 163
    .line 164
    .line 165
    const v14, 0x3f4ccccd    # 0.8f

    .line 166
    .line 167
    .line 168
    const v11, 0x4007ae14    # 2.12f

    .line 169
    .line 170
    .line 171
    invoke-virtual {v3, v5, v14, v6, v11}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 172
    .line 173
    .line 174
    const v6, 0x419a6666    # 19.3f

    .line 175
    .line 176
    .line 177
    const v7, 0x417bae14    # 15.73f

    .line 178
    .line 179
    .line 180
    const/high16 v8, 0x41a00000    # 20.0f

    .line 181
    .line 182
    const v9, 0x415f3333    # 13.95f

    .line 183
    .line 184
    .line 185
    const/high16 v10, 0x41a00000    # 20.0f

    .line 186
    .line 187
    const/high16 v25, 0x41400000    # 12.0f

    .line 188
    .line 189
    move-object v5, v3

    .line 190
    move/from16 v11, v25

    .line 191
    .line 192
    invoke-virtual/range {v5 .. v11}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 193
    .line 194
    .line 195
    const/high16 v6, 0x41a00000    # 20.0f

    .line 196
    .line 197
    const v7, 0x40f28f5c    # 7.58f

    .line 198
    .line 199
    .line 200
    const v8, 0x41835c29    # 16.42f

    .line 201
    .line 202
    .line 203
    const/high16 v9, 0x40800000    # 4.0f

    .line 204
    .line 205
    const/high16 v10, 0x41400000    # 12.0f

    .line 206
    .line 207
    const/high16 v11, 0x40800000    # 4.0f

    .line 208
    .line 209
    invoke-virtual/range {v5 .. v11}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 210
    .line 211
    .line 212
    invoke-virtual {v3}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 213
    .line 214
    .line 215
    const/high16 v5, 0x41500000    # 13.0f

    .line 216
    .line 217
    invoke-virtual {v3, v12, v5}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 218
    .line 219
    .line 220
    const v6, -0x4008f5c3    # -1.93f

    .line 221
    .line 222
    .line 223
    const/4 v7, 0x0

    .line 224
    const/high16 v8, -0x3fa00000    # -3.5f

    .line 225
    .line 226
    const v9, -0x40370a3d    # -1.57f

    .line 227
    .line 228
    .line 229
    const/high16 v10, -0x3fa00000    # -3.5f

    .line 230
    .line 231
    const/high16 v11, -0x3fa00000    # -3.5f

    .line 232
    .line 233
    move-object v5, v3

    .line 234
    invoke-virtual/range {v5 .. v11}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 235
    .line 236
    .line 237
    const/high16 v6, 0x41080000    # 8.5f

    .line 238
    .line 239
    const v7, 0x40f23d71    # 7.57f

    .line 240
    .line 241
    .line 242
    const v8, 0x41211eb8    # 10.07f

    .line 243
    .line 244
    .line 245
    const/high16 v9, 0x40c00000    # 6.0f

    .line 246
    .line 247
    const/high16 v10, 0x41400000    # 12.0f

    .line 248
    .line 249
    const/high16 v11, 0x40c00000    # 6.0f

    .line 250
    .line 251
    invoke-virtual/range {v5 .. v11}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 252
    .line 253
    .line 254
    const v5, 0x3fc8f5c3    # 1.57f

    .line 255
    .line 256
    .line 257
    const/high16 v11, 0x40600000    # 3.5f

    .line 258
    .line 259
    invoke-virtual {v3, v11, v5, v11, v11}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 260
    .line 261
    .line 262
    const/high16 v6, 0x41780000    # 15.5f

    .line 263
    .line 264
    const v7, 0x4136e148    # 11.43f

    .line 265
    .line 266
    .line 267
    const v8, 0x415ee148    # 13.93f

    .line 268
    .line 269
    .line 270
    const/high16 v9, 0x41500000    # 13.0f

    .line 271
    .line 272
    const/high16 v25, 0x41500000    # 13.0f

    .line 273
    .line 274
    move-object v5, v3

    .line 275
    move/from16 v11, v25

    .line 276
    .line 277
    invoke-virtual/range {v5 .. v11}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 278
    .line 279
    .line 280
    invoke-virtual {v3}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 281
    .line 282
    .line 283
    invoke-virtual {v3}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 284
    .line 285
    .line 286
    move-result-object v3

    .line 287
    move v5, v14

    .line 288
    move-object v14, v3

    .line 289
    const/16 v25, 0x0

    .line 290
    .line 291
    const/16 v26, 0x0

    .line 292
    .line 293
    const/16 v27, 0x0

    .line 294
    .line 295
    const/16 v28, 0x3800

    .line 296
    .line 297
    const/16 v29, 0x0

    .line 298
    .line 299
    invoke-static/range {v13 .. v29}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 300
    .line 301
    .line 302
    const/high16 v35, 0x3f800000    # 1.0f

    .line 303
    .line 304
    const/high16 v37, 0x3f800000    # 1.0f

    .line 305
    .line 306
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 307
    .line 308
    .line 309
    move-result v32

    .line 310
    new-instance v3, Landroidx/compose/ui/graphics/SolidColor;

    .line 311
    .line 312
    move-object/from16 v34, v3

    .line 313
    .line 314
    invoke-virtual {v1}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 315
    .line 316
    .line 317
    move-result-wide v6

    .line 318
    invoke-direct {v3, v6, v7, v4}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 319
    .line 320
    .line 321
    const/16 v36, 0x0

    .line 322
    .line 323
    const/high16 v38, 0x3f800000    # 1.0f

    .line 324
    .line 325
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 326
    .line 327
    .line 328
    move-result v39

    .line 329
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 330
    .line 331
    .line 332
    move-result v40

    .line 333
    const/high16 v41, 0x3f800000    # 1.0f

    .line 334
    .line 335
    const-string v33, ""

    .line 336
    .line 337
    new-instance v3, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 338
    .line 339
    invoke-direct {v3}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 340
    .line 341
    .line 342
    const/high16 v6, 0x40000000    # 2.0f

    .line 343
    .line 344
    invoke-virtual {v3, v12, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 345
    .line 346
    .line 347
    const v14, 0x40cf5c29    # 6.48f

    .line 348
    .line 349
    .line 350
    const/high16 v15, 0x40000000    # 2.0f

    .line 351
    .line 352
    const/high16 v16, 0x40000000    # 2.0f

    .line 353
    .line 354
    const v17, 0x40cf5c29    # 6.48f

    .line 355
    .line 356
    .line 357
    const/high16 v18, 0x40000000    # 2.0f

    .line 358
    .line 359
    const/high16 v19, 0x41400000    # 12.0f

    .line 360
    .line 361
    move-object v13, v3

    .line 362
    invoke-virtual/range {v13 .. v19}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 363
    .line 364
    .line 365
    const/4 v14, 0x0

    .line 366
    const v15, 0x40b0a3d7    # 5.52f

    .line 367
    .line 368
    .line 369
    const v16, 0x408f5c29    # 4.48f

    .line 370
    .line 371
    .line 372
    const/high16 v17, 0x41200000    # 10.0f

    .line 373
    .line 374
    const/high16 v18, 0x41200000    # 10.0f

    .line 375
    .line 376
    const/high16 v19, 0x41200000    # 10.0f

    .line 377
    .line 378
    invoke-virtual/range {v13 .. v19}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 379
    .line 380
    .line 381
    const v6, -0x3f70a3d7    # -4.48f

    .line 382
    .line 383
    .line 384
    const/high16 v7, -0x3ee00000    # -10.0f

    .line 385
    .line 386
    const/high16 v8, 0x41200000    # 10.0f

    .line 387
    .line 388
    invoke-virtual {v3, v8, v6, v8, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 389
    .line 390
    .line 391
    const/high16 v14, 0x41b00000    # 22.0f

    .line 392
    .line 393
    const v15, 0x40cf5c29    # 6.48f

    .line 394
    .line 395
    .line 396
    const v16, 0x418c28f6    # 17.52f

    .line 397
    .line 398
    .line 399
    const/high16 v17, 0x40000000    # 2.0f

    .line 400
    .line 401
    const/high16 v18, 0x41400000    # 12.0f

    .line 402
    .line 403
    const/high16 v19, 0x40000000    # 2.0f

    .line 404
    .line 405
    invoke-virtual/range {v13 .. v19}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 406
    .line 407
    .line 408
    invoke-virtual {v3}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 409
    .line 410
    .line 411
    const/high16 v6, 0x41a00000    # 20.0f

    .line 412
    .line 413
    invoke-virtual {v3, v12, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 414
    .line 415
    .line 416
    const v14, -0x402147ae    # -1.74f

    .line 417
    .line 418
    .line 419
    const/4 v15, 0x0

    .line 420
    const v16, -0x3faa3d71    # -3.34f

    .line 421
    .line 422
    .line 423
    const v17, -0x40f0a3d7    # -0.56f

    .line 424
    .line 425
    .line 426
    const v18, -0x3f6b3333    # -4.65f

    .line 427
    .line 428
    .line 429
    const/high16 v19, -0x40400000    # -1.5f

    .line 430
    .line 431
    invoke-virtual/range {v13 .. v19}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 432
    .line 433
    .line 434
    const v14, 0x410a8f5c    # 8.66f

    .line 435
    .line 436
    .line 437
    const v15, 0x418c7ae1    # 17.56f

    .line 438
    .line 439
    .line 440
    const v16, 0x412428f6    # 10.26f

    .line 441
    .line 442
    .line 443
    const/high16 v17, 0x41880000    # 17.0f

    .line 444
    .line 445
    const/high16 v18, 0x41400000    # 12.0f

    .line 446
    .line 447
    const/high16 v19, 0x41880000    # 17.0f

    .line 448
    .line 449
    invoke-virtual/range {v13 .. v19}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 450
    .line 451
    .line 452
    const v6, 0x3f0f5c29    # 0.56f

    .line 453
    .line 454
    .line 455
    const v7, 0x4094cccd    # 4.65f

    .line 456
    .line 457
    .line 458
    const v8, 0x4055c28f    # 3.34f

    .line 459
    .line 460
    .line 461
    const/high16 v9, 0x3fc00000    # 1.5f

    .line 462
    .line 463
    invoke-virtual {v3, v8, v6, v7, v9}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 464
    .line 465
    .line 466
    const v14, 0x417570a4    # 15.34f

    .line 467
    .line 468
    .line 469
    const v15, 0x419b851f    # 19.44f

    .line 470
    .line 471
    .line 472
    const v16, 0x415bd70a    # 13.74f

    .line 473
    .line 474
    .line 475
    const/high16 v17, 0x41a00000    # 20.0f

    .line 476
    .line 477
    const/high16 v19, 0x41a00000    # 20.0f

    .line 478
    .line 479
    invoke-virtual/range {v13 .. v19}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 480
    .line 481
    .line 482
    invoke-virtual {v3}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 483
    .line 484
    .line 485
    const v6, 0x41911eb8    # 18.14f

    .line 486
    .line 487
    .line 488
    const v7, 0x4188f5c3    # 17.12f

    .line 489
    .line 490
    .line 491
    invoke-virtual {v3, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 492
    .line 493
    .line 494
    const v14, 0x4183999a    # 16.45f

    .line 495
    .line 496
    .line 497
    const v15, 0x417ccccd    # 15.8f

    .line 498
    .line 499
    .line 500
    const v16, 0x41651eb8    # 14.32f

    .line 501
    .line 502
    .line 503
    const/high16 v17, 0x41700000    # 15.0f

    .line 504
    .line 505
    const/high16 v19, 0x41700000    # 15.0f

    .line 506
    .line 507
    invoke-virtual/range {v13 .. v19}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 508
    .line 509
    .line 510
    const v6, -0x3f71999a    # -4.45f

    .line 511
    .line 512
    .line 513
    const v7, -0x3f3b851f    # -6.14f

    .line 514
    .line 515
    .line 516
    const v8, 0x4007ae14    # 2.12f

    .line 517
    .line 518
    .line 519
    invoke-virtual {v3, v6, v5, v7, v8}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 520
    .line 521
    .line 522
    const v14, 0x40966666    # 4.7f

    .line 523
    .line 524
    .line 525
    const v15, 0x417bae14    # 15.73f

    .line 526
    .line 527
    .line 528
    const/high16 v16, 0x40800000    # 4.0f

    .line 529
    .line 530
    const v17, 0x415f3333    # 13.95f

    .line 531
    .line 532
    .line 533
    const/high16 v18, 0x40800000    # 4.0f

    .line 534
    .line 535
    const/high16 v19, 0x41400000    # 12.0f

    .line 536
    .line 537
    invoke-virtual/range {v13 .. v19}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 538
    .line 539
    .line 540
    const/4 v14, 0x0

    .line 541
    const v15, -0x3f728f5c    # -4.42f

    .line 542
    .line 543
    .line 544
    const v16, 0x40651eb8    # 3.58f

    .line 545
    .line 546
    .line 547
    const/high16 v17, -0x3f000000    # -8.0f

    .line 548
    .line 549
    const/high16 v18, 0x41000000    # 8.0f

    .line 550
    .line 551
    const/high16 v19, -0x3f000000    # -8.0f

    .line 552
    .line 553
    invoke-virtual/range {v13 .. v19}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 554
    .line 555
    .line 556
    const v5, 0x40651eb8    # 3.58f

    .line 557
    .line 558
    .line 559
    const/high16 v6, 0x41000000    # 8.0f

    .line 560
    .line 561
    invoke-virtual {v3, v6, v5, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 562
    .line 563
    .line 564
    const/high16 v14, 0x41a00000    # 20.0f

    .line 565
    .line 566
    const v15, 0x415f3333    # 13.95f

    .line 567
    .line 568
    .line 569
    const v16, 0x419a6666    # 19.3f

    .line 570
    .line 571
    .line 572
    const v17, 0x417bae14    # 15.73f

    .line 573
    .line 574
    .line 575
    const v18, 0x41911eb8    # 18.14f

    .line 576
    .line 577
    .line 578
    const v19, 0x4188f5c3    # 17.12f

    .line 579
    .line 580
    .line 581
    invoke-virtual/range {v13 .. v19}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 582
    .line 583
    .line 584
    invoke-virtual {v3}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 585
    .line 586
    .line 587
    invoke-virtual {v3}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 588
    .line 589
    .line 590
    move-result-object v31

    .line 591
    const/16 v42, 0x0

    .line 592
    .line 593
    const/16 v43, 0x0

    .line 594
    .line 595
    const/16 v44, 0x0

    .line 596
    .line 597
    const/16 v45, 0x3800

    .line 598
    .line 599
    const/16 v46, 0x0

    .line 600
    .line 601
    invoke-static/range {v30 .. v46}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 602
    .line 603
    .line 604
    const/high16 v52, 0x3f800000    # 1.0f

    .line 605
    .line 606
    const/high16 v54, 0x3f800000    # 1.0f

    .line 607
    .line 608
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 609
    .line 610
    .line 611
    move-result v49

    .line 612
    new-instance v3, Landroidx/compose/ui/graphics/SolidColor;

    .line 613
    .line 614
    move-object/from16 v51, v3

    .line 615
    .line 616
    invoke-virtual {v1}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 617
    .line 618
    .line 619
    move-result-wide v5

    .line 620
    invoke-direct {v3, v5, v6, v4}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 621
    .line 622
    .line 623
    const/16 v53, 0x0

    .line 624
    .line 625
    const/high16 v55, 0x3f800000    # 1.0f

    .line 626
    .line 627
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 628
    .line 629
    .line 630
    move-result v56

    .line 631
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 632
    .line 633
    .line 634
    move-result v57

    .line 635
    const/high16 v58, 0x3f800000    # 1.0f

    .line 636
    .line 637
    const-string v50, ""

    .line 638
    .line 639
    new-instance v7, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 640
    .line 641
    invoke-direct {v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 642
    .line 643
    .line 644
    const v0, 0x40bdc28f    # 5.93f

    .line 645
    .line 646
    .line 647
    invoke-virtual {v7, v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 648
    .line 649
    .line 650
    const v1, -0x4008f5c3    # -1.93f

    .line 651
    .line 652
    .line 653
    const/4 v2, 0x0

    .line 654
    const/high16 v3, -0x3fa00000    # -3.5f

    .line 655
    .line 656
    const v4, 0x3fc8f5c3    # 1.57f

    .line 657
    .line 658
    .line 659
    const/high16 v5, -0x3fa00000    # -3.5f

    .line 660
    .line 661
    const/high16 v6, 0x40600000    # 3.5f

    .line 662
    .line 663
    move-object v0, v7

    .line 664
    invoke-virtual/range {v0 .. v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 665
    .line 666
    .line 667
    const/4 v1, 0x0

    .line 668
    const v2, 0x3ff70a3d    # 1.93f

    .line 669
    .line 670
    .line 671
    const v3, 0x3fc8f5c3    # 1.57f

    .line 672
    .line 673
    .line 674
    const/high16 v4, 0x40600000    # 3.5f

    .line 675
    .line 676
    const/high16 v5, 0x40600000    # 3.5f

    .line 677
    .line 678
    invoke-virtual/range {v0 .. v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 679
    .line 680
    .line 681
    const v0, -0x40370a3d    # -1.57f

    .line 682
    .line 683
    .line 684
    const/high16 v1, -0x3fa00000    # -3.5f

    .line 685
    .line 686
    const/high16 v2, 0x40600000    # 3.5f

    .line 687
    .line 688
    invoke-virtual {v7, v2, v0, v2, v1}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 689
    .line 690
    .line 691
    const/high16 v1, 0x41780000    # 15.5f

    .line 692
    .line 693
    const/high16 v2, 0x40f00000    # 7.5f

    .line 694
    .line 695
    const v3, 0x415ee148    # 13.93f

    .line 696
    .line 697
    .line 698
    const v4, 0x40bdc28f    # 5.93f

    .line 699
    .line 700
    .line 701
    const/high16 v5, 0x41400000    # 12.0f

    .line 702
    .line 703
    const v6, 0x40bdc28f    # 5.93f

    .line 704
    .line 705
    .line 706
    move-object v0, v7

    .line 707
    invoke-virtual/range {v0 .. v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 708
    .line 709
    .line 710
    invoke-virtual {v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 711
    .line 712
    .line 713
    const v8, 0x412ee148    # 10.93f

    .line 714
    .line 715
    .line 716
    invoke-virtual {v7, v12, v8}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 717
    .line 718
    .line 719
    const v1, -0x40ab851f    # -0.83f

    .line 720
    .line 721
    .line 722
    const/4 v2, 0x0

    .line 723
    const/high16 v3, -0x40400000    # -1.5f

    .line 724
    .line 725
    const v4, -0x40d47ae1    # -0.67f

    .line 726
    .line 727
    .line 728
    const/high16 v5, -0x40400000    # -1.5f

    .line 729
    .line 730
    const/high16 v6, -0x40400000    # -1.5f

    .line 731
    .line 732
    invoke-virtual/range {v0 .. v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 733
    .line 734
    .line 735
    const v0, 0x3f2b851f    # 0.67f

    .line 736
    .line 737
    .line 738
    const/high16 v1, -0x40400000    # -1.5f

    .line 739
    .line 740
    invoke-virtual {v7, v0, v1, v9, v1}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 741
    .line 742
    .line 743
    invoke-virtual {v7, v9, v0, v9, v9}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 744
    .line 745
    .line 746
    const v0, 0x414d47ae    # 12.83f

    .line 747
    .line 748
    .line 749
    invoke-virtual {v7, v0, v8, v12, v8}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 750
    .line 751
    .line 752
    invoke-virtual {v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 753
    .line 754
    .line 755
    invoke-virtual {v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 756
    .line 757
    .line 758
    move-result-object v48

    .line 759
    const/16 v59, 0x0

    .line 760
    .line 761
    const/16 v60, 0x0

    .line 762
    .line 763
    const/16 v61, 0x0

    .line 764
    .line 765
    const/16 v62, 0x3800

    .line 766
    .line 767
    const/16 v63, 0x0

    .line 768
    .line 769
    invoke-static/range {v47 .. v63}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 770
    .line 771
    .line 772
    move-result-object v0

    .line 773
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 774
    .line 775
    .line 776
    move-result-object v0

    .line 777
    sput-object v0, Landroidx/compose/material/icons/twotone/AccountCircleKt;->_accountCircle:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 778
    .line 779
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 780
    .line 781
    .line 782
    return-object v0
.end method
