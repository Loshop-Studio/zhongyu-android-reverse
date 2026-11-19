.class public final Landroidx/compose/material/icons/twotone/BuildKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_build",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "Build",
        "Landroidx/compose/material/icons/Icons$TwoTone;",
        "getBuild",
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
        "SMAP\nBuild.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Build.kt\nandroidx/compose/material/icons/twotone/BuildKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,81:1\n122#2:82\n116#2,3:83\n119#2,3:87\n132#2,18:90\n152#2:127\n132#2,18:128\n152#2:165\n175#3:86\n694#4,2:108\n706#4,2:110\n708#4,11:116\n694#4,2:146\n706#4,2:148\n708#4,11:154\n53#5,4:112\n53#5,4:150\n*S KotlinDebug\n*F\n+ 1 Build.kt\nandroidx/compose/material/icons/twotone/BuildKt\n*L\n29#1:82\n29#1:83,3\n29#1:87,3\n30#1:90,18\n30#1:127\n46#1:128,18\n46#1:165\n29#1:86\n30#1:108,2\n30#1:110,2\n30#1:116,11\n46#1:146,2\n46#1:148,2\n46#1:154,11\n30#1:112,4\n46#1:150,4\n*E\n"
    }
.end annotation


# static fields
.field private static _build:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getBuild(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
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
    sget-object v0, Landroidx/compose/material/icons/twotone/BuildKt;->_build:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.Build"

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
    const v18, 0x3e99999a    # 0.3f

    .line 48
    .line 49
    .line 50
    const v20, 0x3e99999a    # 0.3f

    .line 51
    .line 52
    .line 53
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 54
    .line 55
    .line 56
    move-result v15

    .line 57
    new-instance v0, Landroidx/compose/ui/graphics/SolidColor;

    .line 58
    .line 59
    move-object/from16 v17, v0

    .line 60
    .line 61
    sget-object v1, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    .line 62
    .line 63
    invoke-virtual {v1}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 64
    .line 65
    .line 66
    move-result-wide v2

    .line 67
    const/4 v4, 0x0

    .line 68
    invoke-direct {v0, v2, v3, v4}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 69
    .line 70
    .line 71
    const/16 v19, 0x0

    .line 72
    .line 73
    const/high16 v21, 0x3f800000    # 1.0f

    .line 74
    .line 75
    sget-object v0, Landroidx/compose/ui/graphics/StrokeCap;->Companion:Landroidx/compose/ui/graphics/StrokeCap$Companion;

    .line 76
    .line 77
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 78
    .line 79
    .line 80
    move-result v22

    .line 81
    sget-object v2, Landroidx/compose/ui/graphics/StrokeJoin;->Companion:Landroidx/compose/ui/graphics/StrokeJoin$Companion;

    .line 82
    .line 83
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 84
    .line 85
    .line 86
    move-result v23

    .line 87
    const/high16 v24, 0x3f800000    # 1.0f

    .line 88
    .line 89
    const-string v16, ""

    .line 90
    .line 91
    new-instance v3, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 92
    .line 93
    invoke-direct {v3}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 94
    .line 95
    .line 96
    const v5, 0x413eb852    # 11.92f

    .line 97
    .line 98
    .line 99
    const v6, 0x41047ae1    # 8.28f

    .line 100
    .line 101
    .line 102
    invoke-virtual {v3, v5, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 103
    .line 104
    .line 105
    const v6, 0x3e75c28f    # 0.24f

    .line 106
    .line 107
    .line 108
    const v7, -0x404ccccd    # -1.4f

    .line 109
    .line 110
    .line 111
    const v8, -0x41dc28f6    # -0.16f

    .line 112
    .line 113
    .line 114
    const v9, -0x3fc70a3d    # -2.89f

    .line 115
    .line 116
    .line 117
    const v10, -0x406147ae    # -1.24f

    .line 118
    .line 119
    .line 120
    const v11, -0x3f828f5c    # -3.96f

    .line 121
    .line 122
    .line 123
    move-object v5, v3

    .line 124
    invoke-virtual/range {v5 .. v11}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 125
    .line 126
    .line 127
    const v6, -0x408f5c29    # -0.94f

    .line 128
    .line 129
    .line 130
    const v7, -0x408ccccd    # -0.95f

    .line 131
    .line 132
    .line 133
    const v8, -0x3ff33333    # -2.2f

    .line 134
    .line 135
    .line 136
    const v9, -0x404e147b    # -1.39f

    .line 137
    .line 138
    .line 139
    const v10, -0x3fa3d70a    # -3.44f

    .line 140
    .line 141
    .line 142
    const v11, -0x40570a3d    # -1.32f

    .line 143
    .line 144
    .line 145
    invoke-virtual/range {v5 .. v11}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 146
    .line 147
    .line 148
    const v12, 0x4045c28f    # 3.09f

    .line 149
    .line 150
    .line 151
    invoke-virtual {v3, v12, v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 152
    .line 153
    .line 154
    const v14, -0x3f7851ec    # -4.24f

    .line 155
    .line 156
    .line 157
    const v11, 0x4087ae14    # 4.24f

    .line 158
    .line 159
    .line 160
    invoke-virtual {v3, v14, v11}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 161
    .line 162
    .line 163
    const/high16 v10, 0x40400000    # 3.0f

    .line 164
    .line 165
    const v9, 0x40e7ae14    # 7.24f

    .line 166
    .line 167
    .line 168
    invoke-virtual {v3, v10, v9}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 169
    .line 170
    .line 171
    const v6, -0x4270a3d7    # -0.07f

    .line 172
    .line 173
    .line 174
    const v7, 0x3f9eb852    # 1.24f

    .line 175
    .line 176
    .line 177
    const v8, 0x3ebd70a4    # 0.37f

    .line 178
    .line 179
    .line 180
    const v25, 0x401f5c29    # 2.49f

    .line 181
    .line 182
    .line 183
    const v26, 0x3fa7ae14    # 1.31f

    .line 184
    .line 185
    .line 186
    const v27, 0x405c28f6    # 3.44f

    .line 187
    .line 188
    .line 189
    move/from16 v9, v25

    .line 190
    .line 191
    move/from16 v10, v26

    .line 192
    .line 193
    move/from16 v11, v27

    .line 194
    .line 195
    invoke-virtual/range {v5 .. v11}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 196
    .line 197
    .line 198
    const v6, 0x3f851eb8    # 1.04f

    .line 199
    .line 200
    .line 201
    const v7, 0x3f851eb8    # 1.04f

    .line 202
    .line 203
    .line 204
    const v8, 0x401e147b    # 2.47f

    .line 205
    .line 206
    .line 207
    const v9, 0x3fb9999a    # 1.45f

    .line 208
    .line 209
    .line 210
    const v10, 0x40751eb8    # 3.83f

    .line 211
    .line 212
    .line 213
    const/high16 v11, 0x3fa00000    # 1.25f

    .line 214
    .line 215
    invoke-virtual/range {v5 .. v11}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 216
    .line 217
    .line 218
    const v6, 0x3f35c28f    # 0.71f

    .line 219
    .line 220
    .line 221
    const v7, -0x42333333    # -0.1f

    .line 222
    .line 223
    .line 224
    const v8, 0x3fb33333    # 1.4f

    .line 225
    .line 226
    .line 227
    const v9, -0x413d70a4    # -0.38f

    .line 228
    .line 229
    .line 230
    const/high16 v10, 0x40000000    # 2.0f

    .line 231
    .line 232
    const v11, -0x40ae147b    # -0.82f

    .line 233
    .line 234
    .line 235
    invoke-virtual/range {v5 .. v11}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 236
    .line 237
    .line 238
    const v5, 0x41175c29    # 9.46f

    .line 239
    .line 240
    .line 241
    invoke-virtual {v3, v5, v5}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 242
    .line 243
    .line 244
    const v5, 0x3f6147ae    # 0.88f

    .line 245
    .line 246
    .line 247
    const v11, -0x409eb852    # -0.88f

    .line 248
    .line 249
    .line 250
    invoke-virtual {v3, v5, v11}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 251
    .line 252
    .line 253
    const v5, -0x3ee8cccd    # -9.45f

    .line 254
    .line 255
    .line 256
    invoke-virtual {v3, v5, v5}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 257
    .line 258
    .line 259
    const v6, 0x3ef0a3d7    # 0.47f

    .line 260
    .line 261
    .line 262
    const v7, -0x40e66666    # -0.6f

    .line 263
    .line 264
    .line 265
    const v8, 0x3f451eb8    # 0.77f

    .line 266
    .line 267
    .line 268
    const v9, -0x405eb852    # -1.26f

    .line 269
    .line 270
    .line 271
    const v10, 0x3f63d70a    # 0.89f

    .line 272
    .line 273
    .line 274
    const v25, -0x40051eb8    # -1.96f

    .line 275
    .line 276
    .line 277
    move-object v5, v3

    .line 278
    move/from16 v11, v25

    .line 279
    .line 280
    invoke-virtual/range {v5 .. v11}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 281
    .line 282
    .line 283
    invoke-virtual {v3}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 284
    .line 285
    .line 286
    invoke-virtual {v3}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 287
    .line 288
    .line 289
    move-result-object v3

    .line 290
    move v5, v14

    .line 291
    move-object v14, v3

    .line 292
    const/16 v25, 0x0

    .line 293
    .line 294
    const/16 v26, 0x0

    .line 295
    .line 296
    const/16 v27, 0x0

    .line 297
    .line 298
    const/16 v28, 0x3800

    .line 299
    .line 300
    const/16 v29, 0x0

    .line 301
    .line 302
    invoke-static/range {v13 .. v29}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 303
    .line 304
    .line 305
    const/high16 v35, 0x3f800000    # 1.0f

    .line 306
    .line 307
    const/high16 v37, 0x3f800000    # 1.0f

    .line 308
    .line 309
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 310
    .line 311
    .line 312
    move-result v32

    .line 313
    new-instance v3, Landroidx/compose/ui/graphics/SolidColor;

    .line 314
    .line 315
    move-object/from16 v34, v3

    .line 316
    .line 317
    invoke-virtual {v1}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 318
    .line 319
    .line 320
    move-result-wide v6

    .line 321
    invoke-direct {v3, v6, v7, v4}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 322
    .line 323
    .line 324
    const/16 v36, 0x0

    .line 325
    .line 326
    const/high16 v38, 0x3f800000    # 1.0f

    .line 327
    .line 328
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 329
    .line 330
    .line 331
    move-result v39

    .line 332
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 333
    .line 334
    .line 335
    move-result v40

    .line 336
    const/high16 v41, 0x3f800000    # 1.0f

    .line 337
    .line 338
    const-string v33, ""

    .line 339
    .line 340
    new-instance v0, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 341
    .line 342
    invoke-direct {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 343
    .line 344
    .line 345
    const v1, 0x41b4e148    # 22.61f

    .line 346
    .line 347
    .line 348
    const v2, 0x4197c28f    # 18.97f

    .line 349
    .line 350
    .line 351
    invoke-virtual {v0, v1, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 352
    .line 353
    .line 354
    const v1, 0x4158a3d7    # 13.54f

    .line 355
    .line 356
    .line 357
    const v2, 0x411e6666    # 9.9f

    .line 358
    .line 359
    .line 360
    invoke-virtual {v0, v1, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 361
    .line 362
    .line 363
    const v14, 0x3f6e147b    # 0.93f

    .line 364
    .line 365
    .line 366
    const v15, -0x3fea3d71    # -2.34f

    .line 367
    .line 368
    .line 369
    const v16, 0x3ee66666    # 0.45f

    .line 370
    .line 371
    .line 372
    const v17, -0x3f5ccccd    # -5.1f

    .line 373
    .line 374
    .line 375
    const v18, -0x4047ae14    # -1.44f

    .line 376
    .line 377
    .line 378
    const/high16 v19, -0x3f200000    # -7.0f

    .line 379
    .line 380
    move-object v13, v0

    .line 381
    invoke-virtual/range {v13 .. v19}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 382
    .line 383
    .line 384
    const v14, 0x411ccccd    # 9.8f

    .line 385
    .line 386
    .line 387
    const v15, 0x3f19999a    # 0.6f

    .line 388
    .line 389
    .line 390
    const v16, 0x40c70a3d    # 6.22f

    .line 391
    .line 392
    .line 393
    const v17, 0x3ec7ae14    # 0.39f

    .line 394
    .line 395
    .line 396
    const v18, 0x406ae148    # 3.67f

    .line 397
    .line 398
    .line 399
    const/high16 v19, 0x40100000    # 2.25f

    .line 400
    .line 401
    invoke-virtual/range {v13 .. v19}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 402
    .line 403
    .line 404
    const/high16 v1, 0x40f00000    # 7.5f

    .line 405
    .line 406
    const v2, 0x40c28f5c    # 6.08f

    .line 407
    .line 408
    .line 409
    invoke-virtual {v0, v1, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 410
    .line 411
    .line 412
    invoke-virtual {v0, v2, v1}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 413
    .line 414
    .line 415
    const/high16 v1, 0x40100000    # 2.25f

    .line 416
    .line 417
    const v2, 0x406ae148    # 3.67f

    .line 418
    .line 419
    .line 420
    invoke-virtual {v0, v1, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 421
    .line 422
    .line 423
    const v14, 0x3ec7ae14    # 0.39f

    .line 424
    .line 425
    .line 426
    const v15, 0x40c6b852    # 6.21f

    .line 427
    .line 428
    .line 429
    const v16, 0x3f19999a    # 0.6f

    .line 430
    .line 431
    .line 432
    const v17, 0x411ca3d7    # 9.79f

    .line 433
    .line 434
    .line 435
    const v18, 0x4039999a    # 2.9f

    .line 436
    .line 437
    .line 438
    const v19, 0x414170a4    # 12.09f

    .line 439
    .line 440
    .line 441
    invoke-virtual/range {v13 .. v19}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 442
    .line 443
    .line 444
    const v14, 0x3fee147b    # 1.86f

    .line 445
    .line 446
    .line 447
    const v15, 0x3fee147b    # 1.86f

    .line 448
    .line 449
    .line 450
    const v16, 0x40923d71    # 4.57f

    .line 451
    .line 452
    .line 453
    const v17, 0x40166666    # 2.35f

    .line 454
    .line 455
    .line 456
    const v18, 0x40dc7ae1    # 6.89f

    .line 457
    .line 458
    .line 459
    const v19, 0x3fbd70a4    # 1.48f

    .line 460
    .line 461
    .line 462
    invoke-virtual/range {v13 .. v19}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 463
    .line 464
    .line 465
    const v1, 0x4111c28f    # 9.11f

    .line 466
    .line 467
    .line 468
    invoke-virtual {v0, v1, v1}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 469
    .line 470
    .line 471
    const v14, 0x3ec7ae14    # 0.39f

    .line 472
    .line 473
    .line 474
    const v15, 0x3ec7ae14    # 0.39f

    .line 475
    .line 476
    .line 477
    const v16, 0x3f828f5c    # 1.02f

    .line 478
    .line 479
    .line 480
    const v17, 0x3ec7ae14    # 0.39f

    .line 481
    .line 482
    .line 483
    const v18, 0x3fb47ae1    # 1.41f

    .line 484
    .line 485
    .line 486
    const/16 v19, 0x0

    .line 487
    .line 488
    invoke-virtual/range {v13 .. v19}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 489
    .line 490
    .line 491
    const v1, 0x40133333    # 2.3f

    .line 492
    .line 493
    .line 494
    const v2, -0x3feccccd    # -2.3f

    .line 495
    .line 496
    .line 497
    invoke-virtual {v0, v1, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 498
    .line 499
    .line 500
    const v14, 0x3ecccccd    # 0.4f

    .line 501
    .line 502
    .line 503
    const v15, -0x413d70a4    # -0.38f

    .line 504
    .line 505
    .line 506
    const v16, 0x3ecccccd    # 0.4f

    .line 507
    .line 508
    .line 509
    const v17, -0x407d70a4    # -1.02f

    .line 510
    .line 511
    .line 512
    const/16 v18, 0x0

    .line 513
    .line 514
    const v19, -0x404b851f    # -1.41f

    .line 515
    .line 516
    .line 517
    invoke-virtual/range {v13 .. v19}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 518
    .line 519
    .line 520
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 521
    .line 522
    .line 523
    const v1, 0x419ce148    # 19.61f

    .line 524
    .line 525
    .line 526
    const v2, 0x41a48f5c    # 20.57f

    .line 527
    .line 528
    .line 529
    invoke-virtual {v0, v1, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 530
    .line 531
    .line 532
    const v1, -0x3ee8a3d7    # -9.46f

    .line 533
    .line 534
    .line 535
    invoke-virtual {v0, v1, v1}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 536
    .line 537
    .line 538
    const v14, -0x40e3d70a    # -0.61f

    .line 539
    .line 540
    .line 541
    const v15, 0x3ee66666    # 0.45f

    .line 542
    .line 543
    .line 544
    const v16, -0x405ae148    # -1.29f

    .line 545
    .line 546
    .line 547
    const v17, 0x3f3851ec    # 0.72f

    .line 548
    .line 549
    .line 550
    const/high16 v18, -0x40000000    # -2.0f

    .line 551
    .line 552
    const v19, 0x3f51eb85    # 0.82f

    .line 553
    .line 554
    .line 555
    invoke-virtual/range {v13 .. v19}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 556
    .line 557
    .line 558
    const v14, -0x4051eb85    # -1.36f

    .line 559
    .line 560
    .line 561
    const v15, 0x3e4ccccd    # 0.2f

    .line 562
    .line 563
    .line 564
    const v16, -0x3fcd70a4    # -2.79f

    .line 565
    .line 566
    .line 567
    const v17, -0x41a8f5c3    # -0.21f

    .line 568
    .line 569
    .line 570
    const v18, -0x3f8ae148    # -3.83f

    .line 571
    .line 572
    .line 573
    const/high16 v19, -0x40600000    # -1.25f

    .line 574
    .line 575
    invoke-virtual/range {v13 .. v19}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 576
    .line 577
    .line 578
    const v14, -0x408ccccd    # -0.95f

    .line 579
    .line 580
    .line 581
    const v15, -0x408f5c29    # -0.94f

    .line 582
    .line 583
    .line 584
    const v16, -0x404e147b    # -1.39f

    .line 585
    .line 586
    .line 587
    const v17, -0x3ff33333    # -2.2f

    .line 588
    .line 589
    .line 590
    const v18, -0x40570a3d    # -1.32f

    .line 591
    .line 592
    .line 593
    const v19, -0x3fa3d70a    # -3.44f

    .line 594
    .line 595
    .line 596
    invoke-virtual/range {v13 .. v19}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 597
    .line 598
    .line 599
    invoke-virtual {v0, v12, v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 600
    .line 601
    .line 602
    const v1, 0x4087ae14    # 4.24f

    .line 603
    .line 604
    .line 605
    invoke-virtual {v0, v1, v5}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 606
    .line 607
    .line 608
    const v1, 0x40e7ae14    # 7.24f

    .line 609
    .line 610
    .line 611
    const/high16 v2, 0x40400000    # 3.0f

    .line 612
    .line 613
    invoke-virtual {v0, v1, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 614
    .line 615
    .line 616
    const v14, 0x3f9eb852    # 1.24f

    .line 617
    .line 618
    .line 619
    const v15, -0x4270a3d7    # -0.07f

    .line 620
    .line 621
    .line 622
    const v16, 0x401f5c29    # 2.49f

    .line 623
    .line 624
    .line 625
    const v17, 0x3ebd70a4    # 0.37f

    .line 626
    .line 627
    .line 628
    const v18, 0x405c28f6    # 3.44f

    .line 629
    .line 630
    .line 631
    const v19, 0x3fa7ae14    # 1.31f

    .line 632
    .line 633
    .line 634
    invoke-virtual/range {v13 .. v19}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 635
    .line 636
    .line 637
    const v14, 0x3f8a3d71    # 1.08f

    .line 638
    .line 639
    .line 640
    const v15, 0x3f8a3d71    # 1.08f

    .line 641
    .line 642
    .line 643
    const v16, 0x3fbeb852    # 1.49f

    .line 644
    .line 645
    .line 646
    const v17, 0x40247ae1    # 2.57f

    .line 647
    .line 648
    .line 649
    const v18, 0x3f9eb852    # 1.24f

    .line 650
    .line 651
    .line 652
    const v19, 0x407d70a4    # 3.96f

    .line 653
    .line 654
    .line 655
    invoke-virtual/range {v13 .. v19}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 656
    .line 657
    .line 658
    const v14, -0x420a3d71    # -0.12f

    .line 659
    .line 660
    .line 661
    const v15, 0x3f333333    # 0.7f

    .line 662
    .line 663
    .line 664
    const v16, -0x4128f5c3    # -0.42f

    .line 665
    .line 666
    .line 667
    const v17, 0x3fae147b    # 1.36f

    .line 668
    .line 669
    .line 670
    const v18, -0x409eb852    # -0.88f

    .line 671
    .line 672
    .line 673
    const v19, 0x3ff9999a    # 1.95f

    .line 674
    .line 675
    .line 676
    invoke-virtual/range {v13 .. v19}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 677
    .line 678
    .line 679
    const v1, 0x41173333    # 9.45f

    .line 680
    .line 681
    .line 682
    invoke-virtual {v0, v1, v1}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 683
    .line 684
    .line 685
    const v1, 0x3f666666    # 0.9f

    .line 686
    .line 687
    .line 688
    const v2, -0x409eb852    # -0.88f

    .line 689
    .line 690
    .line 691
    invoke-virtual {v0, v2, v1}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 692
    .line 693
    .line 694
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 695
    .line 696
    .line 697
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 698
    .line 699
    .line 700
    move-result-object v31

    .line 701
    const/16 v42, 0x0

    .line 702
    .line 703
    const/16 v43, 0x0

    .line 704
    .line 705
    const/16 v44, 0x0

    .line 706
    .line 707
    const/16 v45, 0x3800

    .line 708
    .line 709
    const/16 v46, 0x0

    .line 710
    .line 711
    invoke-static/range {v30 .. v46}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 712
    .line 713
    .line 714
    move-result-object v0

    .line 715
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 716
    .line 717
    .line 718
    move-result-object v0

    .line 719
    sput-object v0, Landroidx/compose/material/icons/twotone/BuildKt;->_build:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 720
    .line 721
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 722
    .line 723
    .line 724
    return-object v0
.end method
