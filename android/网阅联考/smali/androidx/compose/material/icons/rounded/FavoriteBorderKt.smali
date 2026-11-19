.class public final Landroidx/compose/material/icons/rounded/FavoriteBorderKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_favoriteBorder",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "FavoriteBorder",
        "Landroidx/compose/material/icons/Icons$Rounded;",
        "getFavoriteBorder",
        "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;",
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
        "SMAP\nFavoriteBorder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FavoriteBorder.kt\nandroidx/compose/material/icons/rounded/FavoriteBorderKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,59:1\n122#2:60\n116#2,3:61\n119#2,3:65\n132#2,18:68\n152#2:105\n175#3:64\n694#4,2:86\n706#4,2:88\n708#4,11:94\n53#5,4:90\n*S KotlinDebug\n*F\n+ 1 FavoriteBorder.kt\nandroidx/compose/material/icons/rounded/FavoriteBorderKt\n*L\n29#1:60\n29#1:61,3\n29#1:65,3\n30#1:68,18\n30#1:105\n29#1:64\n30#1:86,2\n30#1:88,2\n30#1:94,11\n30#1:90,4\n*E\n"
    }
.end annotation


# static fields
.field private static _favoriteBorder:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getFavoriteBorder(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 30

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
    sget-object v0, Landroidx/compose/material/icons/rounded/FavoriteBorderKt;->_favoriteBorder:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.FavoriteBorder"

    .line 17
    .line 18
    new-instance v1, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 19
    .line 20
    move-object v13, v1

    .line 21
    const/high16 v0, 0x41c00000    # 24.0f

    .line 22
    .line 23
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 28
    .line 29
    .line 30
    move-result v4

    .line 31
    const/high16 v5, 0x41c00000    # 24.0f

    .line 32
    .line 33
    const/high16 v6, 0x41c00000    # 24.0f

    .line 34
    .line 35
    const-wide/16 v7, 0x0

    .line 36
    .line 37
    const/4 v9, 0x0

    .line 38
    const/4 v10, 0x0

    .line 39
    const/16 v11, 0xe0

    .line 40
    .line 41
    const/4 v12, 0x0

    .line 42
    invoke-direct/range {v1 .. v12}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;-><init>(Ljava/lang/String;FFFFJIZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 43
    .line 44
    .line 45
    const/high16 v18, 0x3f800000    # 1.0f

    .line 46
    .line 47
    const/high16 v20, 0x3f800000    # 1.0f

    .line 48
    .line 49
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 50
    .line 51
    .line 52
    move-result v15

    .line 53
    new-instance v0, Landroidx/compose/ui/graphics/SolidColor;

    .line 54
    .line 55
    move-object/from16 v17, v0

    .line 56
    .line 57
    sget-object v1, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    .line 58
    .line 59
    invoke-virtual {v1}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 60
    .line 61
    .line 62
    move-result-wide v1

    .line 63
    const/4 v3, 0x0

    .line 64
    invoke-direct {v0, v1, v2, v3}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 65
    .line 66
    .line 67
    const/16 v19, 0x0

    .line 68
    .line 69
    const/high16 v21, 0x3f800000    # 1.0f

    .line 70
    .line 71
    sget-object v0, Landroidx/compose/ui/graphics/StrokeCap;->Companion:Landroidx/compose/ui/graphics/StrokeCap$Companion;

    .line 72
    .line 73
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 74
    .line 75
    .line 76
    move-result v22

    .line 77
    sget-object v0, Landroidx/compose/ui/graphics/StrokeJoin;->Companion:Landroidx/compose/ui/graphics/StrokeJoin$Companion;

    .line 78
    .line 79
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 80
    .line 81
    .line 82
    move-result v23

    .line 83
    const/high16 v24, 0x3f800000    # 1.0f

    .line 84
    .line 85
    const-string v16, ""

    .line 86
    .line 87
    new-instance v7, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 88
    .line 89
    invoke-direct {v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 90
    .line 91
    .line 92
    const v0, 0x419d47ae    # 19.66f

    .line 93
    .line 94
    .line 95
    const v1, 0x407f5c29    # 3.99f

    .line 96
    .line 97
    .line 98
    invoke-virtual {v7, v0, v1}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 99
    .line 100
    .line 101
    const v1, -0x3fd70a3d    # -2.64f

    .line 102
    .line 103
    .line 104
    const v2, -0x4019999a    # -1.8f

    .line 105
    .line 106
    .line 107
    const v3, -0x3f433333    # -5.9f

    .line 108
    .line 109
    .line 110
    const v4, -0x408a3d71    # -0.96f

    .line 111
    .line 112
    .line 113
    const v5, -0x3f0ae148    # -7.66f

    .line 114
    .line 115
    .line 116
    const v6, 0x3f8ccccd    # 1.1f

    .line 117
    .line 118
    .line 119
    move-object v0, v7

    .line 120
    invoke-virtual/range {v0 .. v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 121
    .line 122
    .line 123
    const v1, -0x401eb852    # -1.76f

    .line 124
    .line 125
    .line 126
    const v2, -0x3ffc28f6    # -2.06f

    .line 127
    .line 128
    .line 129
    const v3, -0x3f5f5c29    # -5.02f

    .line 130
    .line 131
    .line 132
    const v4, -0x3fc5c28f    # -2.91f

    .line 133
    .line 134
    .line 135
    const v6, -0x40733333    # -1.1f

    .line 136
    .line 137
    .line 138
    invoke-virtual/range {v0 .. v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 139
    .line 140
    .line 141
    const v1, -0x404ccccd    # -1.4f

    .line 142
    .line 143
    .line 144
    const v2, 0x3f75c28f    # 0.96f

    .line 145
    .line 146
    .line 147
    const v3, -0x3fee147b    # -2.28f

    .line 148
    .line 149
    .line 150
    const v4, 0x40251eb8    # 2.58f

    .line 151
    .line 152
    .line 153
    const v5, -0x3fea3d71    # -2.34f

    .line 154
    .line 155
    .line 156
    const v6, 0x408947ae    # 4.29f

    .line 157
    .line 158
    .line 159
    invoke-virtual/range {v0 .. v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 160
    .line 161
    .line 162
    const v1, -0x41f0a3d7    # -0.14f

    .line 163
    .line 164
    .line 165
    const v2, 0x407851ec    # 3.88f

    .line 166
    .line 167
    .line 168
    const v3, 0x40533333    # 3.3f

    .line 169
    .line 170
    .line 171
    const v4, 0x40dfae14    # 6.99f

    .line 172
    .line 173
    .line 174
    const v5, 0x4108cccd    # 8.55f

    .line 175
    .line 176
    .line 177
    const v6, 0x413c28f6    # 11.76f

    .line 178
    .line 179
    .line 180
    invoke-virtual/range {v0 .. v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 181
    .line 182
    .line 183
    const v0, 0x3db851ec    # 0.09f

    .line 184
    .line 185
    .line 186
    const v8, 0x3dcccccd    # 0.1f

    .line 187
    .line 188
    .line 189
    invoke-virtual {v7, v8, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 190
    .line 191
    .line 192
    const v1, 0x3f428f5c    # 0.76f

    .line 193
    .line 194
    .line 195
    const v2, 0x3f30a3d7    # 0.69f

    .line 196
    .line 197
    .line 198
    const v3, 0x3ff70a3d    # 1.93f

    .line 199
    .line 200
    .line 201
    const v4, 0x3f30a3d7    # 0.69f

    .line 202
    .line 203
    .line 204
    const v5, 0x402c28f6    # 2.69f

    .line 205
    .line 206
    .line 207
    const v6, -0x43dc28f6    # -0.01f

    .line 208
    .line 209
    .line 210
    move-object v0, v7

    .line 211
    invoke-virtual/range {v0 .. v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 212
    .line 213
    .line 214
    const v0, 0x3de147ae    # 0.11f

    .line 215
    .line 216
    .line 217
    const v9, -0x42333333    # -0.1f

    .line 218
    .line 219
    .line 220
    invoke-virtual {v7, v0, v9}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 221
    .line 222
    .line 223
    const/high16 v1, 0x40a80000    # 5.25f

    .line 224
    .line 225
    const v2, -0x3f67ae14    # -4.76f

    .line 226
    .line 227
    .line 228
    const v3, 0x410ae148    # 8.68f

    .line 229
    .line 230
    .line 231
    const v4, -0x3f0428f6    # -7.87f

    .line 232
    .line 233
    .line 234
    const v5, 0x4108cccd    # 8.55f

    .line 235
    .line 236
    .line 237
    const/high16 v6, -0x3ec40000    # -11.75f

    .line 238
    .line 239
    move-object v0, v7

    .line 240
    invoke-virtual/range {v0 .. v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 241
    .line 242
    .line 243
    const v1, -0x428a3d71    # -0.06f

    .line 244
    .line 245
    .line 246
    const v2, -0x40266666    # -1.7f

    .line 247
    .line 248
    .line 249
    const v3, -0x408f5c29    # -0.94f

    .line 250
    .line 251
    .line 252
    const v4, -0x3fab851f    # -3.32f

    .line 253
    .line 254
    .line 255
    const v5, -0x3fea3d71    # -2.34f

    .line 256
    .line 257
    .line 258
    const v6, -0x3f770a3d    # -4.28f

    .line 259
    .line 260
    .line 261
    invoke-virtual/range {v0 .. v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 262
    .line 263
    .line 264
    invoke-virtual {v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 265
    .line 266
    .line 267
    const v0, 0x4141999a    # 12.1f

    .line 268
    .line 269
    .line 270
    const v1, 0x41946666    # 18.55f

    .line 271
    .line 272
    .line 273
    invoke-virtual {v7, v0, v1}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 274
    .line 275
    .line 276
    invoke-virtual {v7, v9, v8}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 277
    .line 278
    .line 279
    invoke-virtual {v7, v9, v9}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 280
    .line 281
    .line 282
    const v1, 0x40e47ae1    # 7.14f

    .line 283
    .line 284
    .line 285
    const v2, 0x4163d70a    # 14.24f

    .line 286
    .line 287
    .line 288
    const/high16 v3, 0x40800000    # 4.0f

    .line 289
    .line 290
    const v4, 0x41363d71    # 11.39f

    .line 291
    .line 292
    .line 293
    const/high16 v5, 0x40800000    # 4.0f

    .line 294
    .line 295
    const/high16 v6, 0x41080000    # 8.5f

    .line 296
    .line 297
    move-object v0, v7

    .line 298
    invoke-virtual/range {v0 .. v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 299
    .line 300
    .line 301
    const/high16 v1, 0x40800000    # 4.0f

    .line 302
    .line 303
    const/high16 v2, 0x40d00000    # 6.5f

    .line 304
    .line 305
    const/high16 v3, 0x40b00000    # 5.5f

    .line 306
    .line 307
    const/high16 v4, 0x40a00000    # 5.0f

    .line 308
    .line 309
    const/high16 v5, 0x40f00000    # 7.5f

    .line 310
    .line 311
    const/high16 v6, 0x40a00000    # 5.0f

    .line 312
    .line 313
    invoke-virtual/range {v0 .. v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 314
    .line 315
    .line 316
    const v1, 0x3fc51eb8    # 1.54f

    .line 317
    .line 318
    .line 319
    const/4 v2, 0x0

    .line 320
    const v3, 0x40428f5c    # 3.04f

    .line 321
    .line 322
    .line 323
    const v4, 0x3f7d70a4    # 0.99f

    .line 324
    .line 325
    .line 326
    const v5, 0x40647ae1    # 3.57f

    .line 327
    .line 328
    .line 329
    const v6, 0x40170a3d    # 2.36f

    .line 330
    .line 331
    .line 332
    invoke-virtual/range {v0 .. v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 333
    .line 334
    .line 335
    const v0, 0x3fef5c29    # 1.87f

    .line 336
    .line 337
    .line 338
    invoke-virtual {v7, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 339
    .line 340
    .line 341
    const v1, 0x41575c29    # 13.46f

    .line 342
    .line 343
    .line 344
    const v2, 0x40bfae14    # 5.99f

    .line 345
    .line 346
    .line 347
    const v3, 0x416f5c29    # 14.96f

    .line 348
    .line 349
    .line 350
    const/high16 v4, 0x40a00000    # 5.0f

    .line 351
    .line 352
    const/high16 v5, 0x41840000    # 16.5f

    .line 353
    .line 354
    const/high16 v6, 0x40a00000    # 5.0f

    .line 355
    .line 356
    move-object v0, v7

    .line 357
    invoke-virtual/range {v0 .. v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 358
    .line 359
    .line 360
    const/high16 v1, 0x40000000    # 2.0f

    .line 361
    .line 362
    const/4 v2, 0x0

    .line 363
    const/high16 v3, 0x40600000    # 3.5f

    .line 364
    .line 365
    const/high16 v4, 0x3fc00000    # 1.5f

    .line 366
    .line 367
    const/high16 v5, 0x40600000    # 3.5f

    .line 368
    .line 369
    const/high16 v6, 0x40600000    # 3.5f

    .line 370
    .line 371
    invoke-virtual/range {v0 .. v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 372
    .line 373
    .line 374
    const/4 v1, 0x0

    .line 375
    const v2, 0x4038f5c3    # 2.89f

    .line 376
    .line 377
    .line 378
    const v3, -0x3fb70a3d    # -3.14f

    .line 379
    .line 380
    .line 381
    const v4, 0x40b7ae14    # 5.74f

    .line 382
    .line 383
    .line 384
    const v5, -0x3f033333    # -7.9f

    .line 385
    .line 386
    .line 387
    const v6, 0x4120cccd    # 10.05f

    .line 388
    .line 389
    .line 390
    invoke-virtual/range {v0 .. v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 391
    .line 392
    .line 393
    invoke-virtual {v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 394
    .line 395
    .line 396
    invoke-virtual {v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 397
    .line 398
    .line 399
    move-result-object v14

    .line 400
    const/16 v25, 0x0

    .line 401
    .line 402
    const/16 v26, 0x0

    .line 403
    .line 404
    const/16 v27, 0x0

    .line 405
    .line 406
    const/16 v28, 0x3800

    .line 407
    .line 408
    const/16 v29, 0x0

    .line 409
    .line 410
    invoke-static/range {v13 .. v29}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 411
    .line 412
    .line 413
    move-result-object v0

    .line 414
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 415
    .line 416
    .line 417
    move-result-object v0

    .line 418
    sput-object v0, Landroidx/compose/material/icons/rounded/FavoriteBorderKt;->_favoriteBorder:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 419
    .line 420
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 421
    .line 422
    .line 423
    return-object v0
.end method
