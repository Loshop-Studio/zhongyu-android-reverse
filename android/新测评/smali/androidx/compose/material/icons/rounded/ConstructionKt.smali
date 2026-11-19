.class public final Landroidx/compose/material/icons/rounded/ConstructionKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_construction",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "Construction",
        "Landroidx/compose/material/icons/Icons$Rounded;",
        "getConstruction",
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
        "SMAP\nConstruction.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Construction.kt\nandroidx/compose/material/icons/rounded/ConstructionKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,82:1\n212#2,12:83\n233#2,18:96\n253#2:133\n233#2,18:134\n253#2:171\n174#3:95\n705#4,2:114\n717#4,2:116\n719#4,11:122\n705#4,2:152\n717#4,2:154\n719#4,11:160\n72#5,4:118\n72#5,4:156\n*S KotlinDebug\n*F\n+ 1 Construction.kt\nandroidx/compose/material/icons/rounded/ConstructionKt\n*L\n29#1:83,12\n30#1:96,18\n30#1:133\n39#1:134,18\n39#1:171\n29#1:95\n30#1:114,2\n30#1:116,2\n30#1:122,11\n39#1:152,2\n39#1:154,2\n39#1:160,11\n30#1:118,4\n39#1:156,4\n*E\n"
    }
.end annotation


# static fields
.field private static _construction:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getConstruction(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/ConstructionKt;->_construction:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.Construction"

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
    const v4, 0x41a7eb85    # 20.99f

    .line 71
    .line 72
    .line 73
    const v6, 0x418feb85    # 17.99f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v4, -0x3f61eb85    # -4.94f

    .line 80
    .line 81
    .line 82
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 83
    .line 84
    .line 85
    const v4, 0x4007ae14    # 2.12f

    .line 86
    .line 87
    .line 88
    const v6, -0x3ff851ec    # -2.12f

    .line 89
    .line 90
    .line 91
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 92
    .line 93
    .line 94
    const v4, 0x409e147b    # 4.94f

    .line 95
    .line 96
    .line 97
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 98
    .line 99
    .line 100
    const v25, 0x4007ae14    # 2.12f

    .line 101
    .line 102
    .line 103
    const/16 v26, 0x0

    .line 104
    .line 105
    const v21, 0x3f170a3d    # 0.59f

    .line 106
    .line 107
    .line 108
    const v22, 0x3f170a3d    # 0.59f

    .line 109
    .line 110
    .line 111
    const v23, 0x3fc51eb8    # 1.54f

    .line 112
    .line 113
    .line 114
    const v24, 0x3f170a3d    # 0.59f

    .line 115
    .line 116
    .line 117
    move-object/from16 v20, v2

    .line 118
    .line 119
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 120
    .line 121
    .line 122
    const v25, 0x41a7eb85    # 20.99f

    .line 123
    .line 124
    .line 125
    const v26, 0x418feb85    # 17.99f

    .line 126
    .line 127
    .line 128
    const v21, 0x41ac8f5c    # 21.57f

    .line 129
    .line 130
    .line 131
    const v22, 0x419c28f6    # 19.52f

    .line 132
    .line 133
    .line 134
    const v23, 0x41ac8f5c    # 21.57f

    .line 135
    .line 136
    .line 137
    const v24, 0x41948f5c    # 18.57f

    .line 138
    .line 139
    .line 140
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 141
    .line 142
    .line 143
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 144
    .line 145
    .line 146
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 147
    .line 148
    .line 149
    move-result-object v2

    .line 150
    const/16 v16, 0x3800

    .line 151
    .line 152
    const/16 v17, 0x0

    .line 153
    .line 154
    const/high16 v6, 0x3f800000    # 1.0f

    .line 155
    .line 156
    const/high16 v8, 0x3f800000    # 1.0f

    .line 157
    .line 158
    const/4 v7, 0x0

    .line 159
    const/high16 v9, 0x3f800000    # 1.0f

    .line 160
    .line 161
    const/high16 v12, 0x3f800000    # 1.0f

    .line 162
    .line 163
    const/4 v13, 0x0

    .line 164
    const/4 v14, 0x0

    .line 165
    const/4 v15, 0x0

    .line 166
    const-string v4, ""

    .line 167
    .line 168
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 169
    .line 170
    .line 171
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 172
    .line 173
    .line 174
    move-result v3

    .line 175
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 176
    .line 177
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 178
    .line 179
    .line 180
    move-result-wide v6

    .line 181
    const/4 v0, 0x0

    .line 182
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 183
    .line 184
    .line 185
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 186
    .line 187
    .line 188
    move-result v10

    .line 189
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 190
    .line 191
    .line 192
    move-result v11

    .line 193
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 194
    .line 195
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 196
    .line 197
    .line 198
    const v0, 0x418d3333    # 17.65f

    .line 199
    .line 200
    .line 201
    const/high16 v2, 0x41200000    # 10.0f

    .line 202
    .line 203
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 204
    .line 205
    .line 206
    const/high16 v17, 0x40600000    # 3.5f

    .line 207
    .line 208
    const/high16 v18, -0x3fa00000    # -3.5f

    .line 209
    .line 210
    const v13, 0x3ff70a3d    # 1.93f

    .line 211
    .line 212
    .line 213
    const/high16 v15, 0x40600000    # 3.5f

    .line 214
    .line 215
    const v16, -0x40370a3d    # -1.57f

    .line 216
    .line 217
    .line 218
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 219
    .line 220
    .line 221
    const v17, -0x412e147b    # -0.41f

    .line 222
    .line 223
    .line 224
    const v18, -0x40333333    # -1.6f

    .line 225
    .line 226
    .line 227
    const/4 v13, 0x0

    .line 228
    const v14, -0x40eb851f    # -0.58f

    .line 229
    .line 230
    .line 231
    const v15, -0x41dc28f6    # -0.16f

    .line 232
    .line 233
    .line 234
    const v16, -0x4070a3d7    # -1.12f

    .line 235
    .line 236
    .line 237
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 238
    .line 239
    .line 240
    const v0, 0x402ccccd    # 2.7f

    .line 241
    .line 242
    .line 243
    const v2, -0x3fd33333    # -2.7f

    .line 244
    .line 245
    .line 246
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 247
    .line 248
    .line 249
    const v0, -0x404147ae    # -1.49f

    .line 250
    .line 251
    .line 252
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 253
    .line 254
    .line 255
    const v0, 0x402ccccd    # 2.7f

    .line 256
    .line 257
    .line 258
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 259
    .line 260
    .line 261
    const v17, 0x418d3333    # 17.65f

    .line 262
    .line 263
    .line 264
    const/high16 v18, 0x40400000    # 3.0f

    .line 265
    .line 266
    const v13, 0x419628f6    # 18.77f

    .line 267
    .line 268
    .line 269
    const v14, 0x404a3d71    # 3.16f

    .line 270
    .line 271
    .line 272
    const v15, 0x4191d70a    # 18.23f

    .line 273
    .line 274
    .line 275
    const/high16 v16, 0x40400000    # 3.0f

    .line 276
    .line 277
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 278
    .line 279
    .line 280
    const/high16 v17, -0x3fa00000    # -3.5f

    .line 281
    .line 282
    const/high16 v18, 0x40600000    # 3.5f

    .line 283
    .line 284
    const v13, -0x4008f5c3    # -1.93f

    .line 285
    .line 286
    .line 287
    const/4 v14, 0x0

    .line 288
    const/high16 v15, -0x3fa00000    # -3.5f

    .line 289
    .line 290
    const v16, 0x3fc8f5c3    # 1.57f

    .line 291
    .line 292
    .line 293
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 294
    .line 295
    .line 296
    const v17, 0x3e570a3d    # 0.21f

    .line 297
    .line 298
    .line 299
    const v18, 0x3f947ae1    # 1.16f

    .line 300
    .line 301
    .line 302
    const/4 v13, 0x0

    .line 303
    const v14, 0x3ed1eb85    # 0.41f

    .line 304
    .line 305
    .line 306
    const v15, 0x3da3d70a    # 0.08f

    .line 307
    .line 308
    .line 309
    const v16, 0x3f4ccccd    # 0.8f

    .line 310
    .line 311
    .line 312
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 313
    .line 314
    .line 315
    const v0, -0x40133333    # -1.85f

    .line 316
    .line 317
    .line 318
    const v2, 0x3feccccd    # 1.85f

    .line 319
    .line 320
    .line 321
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 322
    .line 323
    .line 324
    const v0, -0x401c28f6    # -1.78f

    .line 325
    .line 326
    .line 327
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 328
    .line 329
    .line 330
    const/4 v0, 0x0

    .line 331
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 332
    .line 333
    .line 334
    const/16 v17, 0x0

    .line 335
    .line 336
    const v18, -0x404b851f    # -1.41f

    .line 337
    .line 338
    .line 339
    const v13, 0x3ec7ae14    # 0.39f

    .line 340
    .line 341
    .line 342
    const v14, -0x413851ec    # -0.39f

    .line 343
    .line 344
    .line 345
    const v15, 0x3ec7ae14    # 0.39f

    .line 346
    .line 347
    .line 348
    const v16, -0x407d70a4    # -1.02f

    .line 349
    .line 350
    .line 351
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 352
    .line 353
    .line 354
    const v0, -0x40ca3d71    # -0.71f

    .line 355
    .line 356
    .line 357
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 358
    .line 359
    .line 360
    const v0, 0x4007ae14    # 2.12f

    .line 361
    .line 362
    .line 363
    const v2, -0x3ff851ec    # -2.12f

    .line 364
    .line 365
    .line 366
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 367
    .line 368
    .line 369
    const v17, -0x3f7851ec    # -4.24f

    .line 370
    .line 371
    .line 372
    const/16 v18, 0x0

    .line 373
    .line 374
    const v13, -0x406a3d71    # -1.17f

    .line 375
    .line 376
    .line 377
    const v14, -0x406a3d71    # -1.17f

    .line 378
    .line 379
    .line 380
    const v15, -0x3fbb851f    # -3.07f

    .line 381
    .line 382
    .line 383
    const v16, -0x406a3d71    # -1.17f

    .line 384
    .line 385
    .line 386
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 387
    .line 388
    .line 389
    const v0, 0x40a28f5c    # 5.08f

    .line 390
    .line 391
    .line 392
    const v2, 0x40ca3d71    # 6.32f

    .line 393
    .line 394
    .line 395
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 396
    .line 397
    .line 398
    const/16 v17, 0x0

    .line 399
    .line 400
    const v18, 0x3fb47ae1    # 1.41f

    .line 401
    .line 402
    .line 403
    const v13, -0x413851ec    # -0.39f

    .line 404
    .line 405
    .line 406
    const v14, 0x3ec7ae14    # 0.39f

    .line 407
    .line 408
    .line 409
    const v15, -0x413851ec    # -0.39f

    .line 410
    .line 411
    .line 412
    const v16, 0x3f828f5c    # 1.02f

    .line 413
    .line 414
    .line 415
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 416
    .line 417
    .line 418
    const v0, 0x3f35c28f    # 0.71f

    .line 419
    .line 420
    .line 421
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 422
    .line 423
    .line 424
    const/high16 v0, 0x40500000    # 3.25f

    .line 425
    .line 426
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 427
    .line 428
    .line 429
    const/high16 v17, -0x41000000    # -0.5f

    .line 430
    .line 431
    const v18, 0x3e570a3d    # 0.21f

    .line 432
    .line 433
    .line 434
    const v13, -0x41bd70a4    # -0.19f

    .line 435
    .line 436
    .line 437
    const/4 v14, 0x0

    .line 438
    const v15, -0x41428f5c    # -0.37f

    .line 439
    .line 440
    .line 441
    const v16, 0x3d8f5c29    # 0.07f

    .line 442
    .line 443
    .line 444
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 445
    .line 446
    .line 447
    const/16 v17, 0x0

    .line 448
    .line 449
    const/high16 v18, 0x3f800000    # 1.0f

    .line 450
    .line 451
    const v13, -0x4170a3d7    # -0.28f

    .line 452
    .line 453
    .line 454
    const v14, 0x3e8f5c29    # 0.28f

    .line 455
    .line 456
    .line 457
    const v15, -0x4170a3d7    # -0.28f

    .line 458
    .line 459
    .line 460
    const v16, 0x3f3851ec    # 0.72f

    .line 461
    .line 462
    .line 463
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 464
    .line 465
    .line 466
    const v0, 0x40228f5c    # 2.54f

    .line 467
    .line 468
    .line 469
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 470
    .line 471
    .line 472
    const/high16 v17, 0x3f800000    # 1.0f

    .line 473
    .line 474
    const/16 v18, 0x0

    .line 475
    .line 476
    const v13, 0x3e8f5c29    # 0.28f

    .line 477
    .line 478
    .line 479
    const v15, 0x3f3851ec    # 0.72f

    .line 480
    .line 481
    .line 482
    const v16, 0x3e8f5c29    # 0.28f

    .line 483
    .line 484
    .line 485
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 486
    .line 487
    .line 488
    const v17, 0x3e570a3d    # 0.21f

    .line 489
    .line 490
    .line 491
    const/high16 v18, -0x41000000    # -0.5f

    .line 492
    .line 493
    const v13, 0x3e051eb8    # 0.13f

    .line 494
    .line 495
    .line 496
    const v14, -0x41fae148    # -0.13f

    .line 497
    .line 498
    .line 499
    const v15, 0x3e570a3d    # 0.21f

    .line 500
    .line 501
    .line 502
    const v16, -0x416147ae    # -0.31f

    .line 503
    .line 504
    .line 505
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 506
    .line 507
    .line 508
    const v0, 0x41126666    # 9.15f

    .line 509
    .line 510
    .line 511
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 512
    .line 513
    .line 514
    const v0, 0x40e66666    # 7.2f

    .line 515
    .line 516
    .line 517
    const v2, 0x411d999a    # 9.85f

    .line 518
    .line 519
    .line 520
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 521
    .line 522
    .line 523
    const v17, 0x3fb47ae1    # 1.41f

    .line 524
    .line 525
    .line 526
    const/16 v18, 0x0

    .line 527
    .line 528
    const v13, 0x3ec7ae14    # 0.39f

    .line 529
    .line 530
    .line 531
    const v14, 0x3ec7ae14    # 0.39f

    .line 532
    .line 533
    .line 534
    const v15, 0x3f828f5c    # 1.02f

    .line 535
    .line 536
    .line 537
    const v16, 0x3ec7ae14    # 0.39f

    .line 538
    .line 539
    .line 540
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 541
    .line 542
    .line 543
    const v0, 0x3fe3d70a    # 1.78f

    .line 544
    .line 545
    .line 546
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 547
    .line 548
    .line 549
    const v0, -0x3f34cccd    # -6.35f

    .line 550
    .line 551
    .line 552
    const v2, 0x40cb3333    # 6.35f

    .line 553
    .line 554
    .line 555
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 556
    .line 557
    .line 558
    const/16 v17, 0x0

    .line 559
    .line 560
    const v18, 0x4007ae14    # 2.12f

    .line 561
    .line 562
    .line 563
    const v13, -0x40e8f5c3    # -0.59f

    .line 564
    .line 565
    .line 566
    const v14, 0x3f170a3d    # 0.59f

    .line 567
    .line 568
    .line 569
    const v15, -0x40e8f5c3    # -0.59f

    .line 570
    .line 571
    .line 572
    const v16, 0x3fc51eb8    # 1.54f

    .line 573
    .line 574
    .line 575
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 576
    .line 577
    .line 578
    const/4 v0, 0x0

    .line 579
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 580
    .line 581
    .line 582
    const v17, 0x4007ae14    # 2.12f

    .line 583
    .line 584
    .line 585
    const/16 v18, 0x0

    .line 586
    .line 587
    const v13, 0x3f170a3d    # 0.59f

    .line 588
    .line 589
    .line 590
    const v15, 0x3fc51eb8    # 1.54f

    .line 591
    .line 592
    .line 593
    const v16, 0x3f170a3d    # 0.59f

    .line 594
    .line 595
    .line 596
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 597
    .line 598
    .line 599
    const v0, 0x4183d70a    # 16.48f

    .line 600
    .line 601
    .line 602
    const v2, 0x411ca3d7    # 9.79f

    .line 603
    .line 604
    .line 605
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 606
    .line 607
    .line 608
    const v17, 0x418d3333    # 17.65f

    .line 609
    .line 610
    .line 611
    const/high16 v18, 0x41200000    # 10.0f

    .line 612
    .line 613
    const v13, 0x4186cccd    # 16.85f

    .line 614
    .line 615
    .line 616
    const v14, 0x411eb852    # 9.92f

    .line 617
    .line 618
    .line 619
    const v15, 0x4189eb85    # 17.24f

    .line 620
    .line 621
    .line 622
    const/high16 v16, 0x41200000    # 10.0f

    .line 623
    .line 624
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 625
    .line 626
    .line 627
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 628
    .line 629
    .line 630
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 631
    .line 632
    .line 633
    move-result-object v2

    .line 634
    const/16 v16, 0x3800

    .line 635
    .line 636
    const/16 v17, 0x0

    .line 637
    .line 638
    const/high16 v6, 0x3f800000    # 1.0f

    .line 639
    .line 640
    const/4 v7, 0x0

    .line 641
    const/high16 v12, 0x3f800000    # 1.0f

    .line 642
    .line 643
    const/4 v13, 0x0

    .line 644
    const/4 v14, 0x0

    .line 645
    const/4 v15, 0x0

    .line 646
    const-string v4, ""

    .line 647
    .line 648
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 649
    .line 650
    .line 651
    move-result-object v0

    .line 652
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 653
    .line 654
    .line 655
    move-result-object v0

    .line 656
    sput-object v0, Landroidx/compose/material/icons/rounded/ConstructionKt;->_construction:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 657
    .line 658
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 659
    .line 660
    .line 661
    return-object v0
.end method
