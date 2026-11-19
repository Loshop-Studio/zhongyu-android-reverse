.class public final Landroidx/compose/material/icons/twotone/EggAltKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_eggAlt",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "EggAlt",
        "Landroidx/compose/material/icons/Icons$TwoTone;",
        "getEggAlt",
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
        "SMAP\nEggAlt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EggAlt.kt\nandroidx/compose/material/icons/twotone/EggAltKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,81:1\n212#2,12:82\n233#2,18:95\n253#2:132\n233#2,18:133\n253#2:170\n233#2,18:171\n253#2:208\n174#3:94\n705#4,2:113\n717#4,2:115\n719#4,11:121\n705#4,2:151\n717#4,2:153\n719#4,11:159\n705#4,2:189\n717#4,2:191\n719#4,11:197\n72#5,4:117\n72#5,4:155\n72#5,4:193\n*S KotlinDebug\n*F\n+ 1 EggAlt.kt\nandroidx/compose/material/icons/twotone/EggAltKt\n*L\n29#1:82,12\n30#1:95,18\n30#1:132\n49#1:133,18\n49#1:170\n70#1:171,18\n70#1:208\n29#1:94\n30#1:113,2\n30#1:115,2\n30#1:121,11\n49#1:151,2\n49#1:153,2\n49#1:159,11\n70#1:189,2\n70#1:191,2\n70#1:197,11\n30#1:117,4\n49#1:155,4\n70#1:193,4\n*E\n"
    }
.end annotation


# static fields
.field private static _eggAlt:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getEggAlt(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/EggAltKt;->_eggAlt:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.EggAlt"

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
    const v4, 0x418cb852    # 17.59f

    .line 71
    .line 72
    .line 73
    const v6, 0x4126b852    # 10.42f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v25, -0x401eb852    # -1.76f

    .line 80
    .line 81
    .line 82
    const v26, -0x3fe70a3d    # -2.39f

    .line 83
    .line 84
    .line 85
    const v21, -0x40cf5c29    # -0.69f

    .line 86
    .line 87
    .line 88
    const v22, -0x40d1eb85    # -0.68f

    .line 89
    .line 90
    .line 91
    const v23, -0x40651eb8    # -1.21f

    .line 92
    .line 93
    .line 94
    const v24, -0x403eb852    # -1.51f

    .line 95
    .line 96
    .line 97
    move-object/from16 v20, v2

    .line 98
    .line 99
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 100
    .line 101
    .line 102
    const v25, 0x411f851f    # 9.97f

    .line 103
    .line 104
    .line 105
    const/high16 v26, 0x40800000    # 4.0f

    .line 106
    .line 107
    const v21, 0x4167ae14    # 14.48f

    .line 108
    .line 109
    .line 110
    const v22, 0x40bb851f    # 5.86f

    .line 111
    .line 112
    .line 113
    const v23, 0x4154f5c3    # 13.31f

    .line 114
    .line 115
    .line 116
    const/high16 v24, 0x40800000    # 4.0f

    .line 117
    .line 118
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 119
    .line 120
    .line 121
    const v25, 0x40bfae14    # 5.99f

    .line 122
    .line 123
    .line 124
    const v26, 0x40b1999a    # 5.55f

    .line 125
    .line 126
    .line 127
    const v21, 0x4105999a    # 8.35f

    .line 128
    .line 129
    .line 130
    const/high16 v22, 0x40800000    # 4.0f

    .line 131
    .line 132
    const v23, 0x40e051ec    # 7.01f

    .line 133
    .line 134
    .line 135
    const v24, 0x4090a3d7    # 4.52f

    .line 136
    .line 137
    .line 138
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 139
    .line 140
    .line 141
    const/high16 v25, 0x40800000    # 4.0f

    .line 142
    .line 143
    const/high16 v26, 0x41380000    # 11.5f

    .line 144
    .line 145
    const v21, 0x4095c28f    # 4.68f

    .line 146
    .line 147
    .line 148
    const v22, 0x40dc28f6    # 6.88f

    .line 149
    .line 150
    .line 151
    const v23, 0x407e147b    # 3.97f

    .line 152
    .line 153
    .line 154
    const v24, 0x410fd70a    # 8.99f

    .line 155
    .line 156
    .line 157
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 158
    .line 159
    .line 160
    const v25, 0x411f851f    # 9.97f

    .line 161
    .line 162
    .line 163
    const/high16 v26, 0x41880000    # 17.0f

    .line 164
    .line 165
    const v21, 0x4081999a    # 4.05f

    .line 166
    .line 167
    .line 168
    const v22, 0x4180147b    # 16.01f

    .line 169
    .line 170
    .line 171
    const v23, 0x410547ae    # 8.33f

    .line 172
    .line 173
    .line 174
    const/high16 v24, 0x41880000    # 17.0f

    .line 175
    .line 176
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 177
    .line 178
    .line 179
    const v25, 0x4055c28f    # 3.34f

    .line 180
    .line 181
    .line 182
    const v26, 0x3fdeb852    # 1.74f

    .line 183
    .line 184
    .line 185
    const v21, 0x3fd851ec    # 1.69f

    .line 186
    .line 187
    .line 188
    const/16 v22, 0x0

    .line 189
    .line 190
    const v23, 0x402b851f    # 2.68f

    .line 191
    .line 192
    .line 193
    const v24, 0x3f866666    # 1.05f

    .line 194
    .line 195
    .line 196
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 197
    .line 198
    .line 199
    const v25, 0x417fd70a    # 15.99f

    .line 200
    .line 201
    .line 202
    const/high16 v26, 0x41a00000    # 20.0f

    .line 203
    .line 204
    const v21, 0x41607ae1    # 14.03f

    .line 205
    .line 206
    .line 207
    const/high16 v22, 0x419c0000    # 19.5f

    .line 208
    .line 209
    const/high16 v23, 0x41680000    # 14.5f

    .line 210
    .line 211
    const/high16 v24, 0x41a00000    # 20.0f

    .line 212
    .line 213
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 214
    .line 215
    .line 216
    const v25, 0x408051ec    # 4.01f

    .line 217
    .line 218
    .line 219
    const v26, -0x3f60a3d7    # -4.98f

    .line 220
    .line 221
    .line 222
    const v21, 0x3ff1eb85    # 1.89f

    .line 223
    .line 224
    .line 225
    const/16 v22, 0x0

    .line 226
    .line 227
    const v23, 0x408051ec    # 4.01f

    .line 228
    .line 229
    .line 230
    const v24, -0x3ff7ae14    # -2.13f

    .line 231
    .line 232
    .line 233
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 234
    .line 235
    .line 236
    const v25, 0x418cb852    # 17.59f

    .line 237
    .line 238
    .line 239
    const v26, 0x4126b852    # 10.42f

    .line 240
    .line 241
    .line 242
    const/high16 v21, 0x41a00000    # 20.0f

    .line 243
    .line 244
    const v22, 0x414d1eb8    # 12.82f

    .line 245
    .line 246
    .line 247
    const v23, 0x419beb85    # 19.49f

    .line 248
    .line 249
    .line 250
    const v24, 0x4144f5c3    # 12.31f

    .line 251
    .line 252
    .line 253
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 254
    .line 255
    .line 256
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 257
    .line 258
    .line 259
    const/high16 v4, 0x41780000    # 15.5f

    .line 260
    .line 261
    const/high16 v6, 0x41400000    # 12.0f

    .line 262
    .line 263
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 264
    .line 265
    .line 266
    const/high16 v25, -0x3fa00000    # -3.5f

    .line 267
    .line 268
    const/high16 v26, -0x3fa00000    # -3.5f

    .line 269
    .line 270
    const v21, -0x4008f5c3    # -1.93f

    .line 271
    .line 272
    .line 273
    const/16 v22, 0x0

    .line 274
    .line 275
    const/high16 v23, -0x3fa00000    # -3.5f

    .line 276
    .line 277
    const v24, -0x40370a3d    # -1.57f

    .line 278
    .line 279
    .line 280
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 281
    .line 282
    .line 283
    const v4, 0x3fc8f5c3    # 1.57f

    .line 284
    .line 285
    .line 286
    const/high16 v6, -0x3fa00000    # -3.5f

    .line 287
    .line 288
    const/high16 v7, 0x40600000    # 3.5f

    .line 289
    .line 290
    invoke-virtual {v2, v4, v6, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 291
    .line 292
    .line 293
    const/high16 v6, 0x40600000    # 3.5f

    .line 294
    .line 295
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 296
    .line 297
    .line 298
    const v4, 0x415ee148    # 13.93f

    .line 299
    .line 300
    .line 301
    const/high16 v6, 0x41780000    # 15.5f

    .line 302
    .line 303
    const/high16 v7, 0x41400000    # 12.0f

    .line 304
    .line 305
    invoke-virtual {v2, v4, v6, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 306
    .line 307
    .line 308
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 309
    .line 310
    .line 311
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 312
    .line 313
    .line 314
    move-result-object v2

    .line 315
    const/16 v16, 0x3800

    .line 316
    .line 317
    const/16 v17, 0x0

    .line 318
    .line 319
    const v6, 0x3e99999a    # 0.3f

    .line 320
    .line 321
    .line 322
    const v8, 0x3e99999a    # 0.3f

    .line 323
    .line 324
    .line 325
    const/4 v7, 0x0

    .line 326
    const/high16 v9, 0x3f800000    # 1.0f

    .line 327
    .line 328
    const/high16 v12, 0x3f800000    # 1.0f

    .line 329
    .line 330
    const/4 v13, 0x0

    .line 331
    const/4 v14, 0x0

    .line 332
    const/4 v15, 0x0

    .line 333
    const-string v4, ""

    .line 334
    .line 335
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 336
    .line 337
    .line 338
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 339
    .line 340
    .line 341
    move-result v3

    .line 342
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 343
    .line 344
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 345
    .line 346
    .line 347
    move-result-wide v6

    .line 348
    const/4 v2, 0x0

    .line 349
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 350
    .line 351
    .line 352
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 353
    .line 354
    .line 355
    move-result v10

    .line 356
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 357
    .line 358
    .line 359
    move-result v11

    .line 360
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 361
    .line 362
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 363
    .line 364
    .line 365
    const/high16 v4, 0x41980000    # 19.0f

    .line 366
    .line 367
    const/high16 v6, 0x41100000    # 9.0f

    .line 368
    .line 369
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 370
    .line 371
    .line 372
    const v25, 0x411f851f    # 9.97f

    .line 373
    .line 374
    .line 375
    const/high16 v26, 0x40000000    # 2.0f

    .line 376
    .line 377
    const/high16 v21, 0x41880000    # 17.0f

    .line 378
    .line 379
    const/high16 v22, 0x40e00000    # 7.0f

    .line 380
    .line 381
    const v23, 0x417fd70a    # 15.99f

    .line 382
    .line 383
    .line 384
    const/high16 v24, 0x40000000    # 2.0f

    .line 385
    .line 386
    move-object/from16 v20, v2

    .line 387
    .line 388
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 389
    .line 390
    .line 391
    const/high16 v25, 0x40000000    # 2.0f

    .line 392
    .line 393
    const v26, 0x413851ec    # 11.52f

    .line 394
    .line 395
    .line 396
    const v21, 0x409e6666    # 4.95f

    .line 397
    .line 398
    .line 399
    const/high16 v22, 0x40000000    # 2.0f

    .line 400
    .line 401
    const v23, 0x3ff851ec    # 1.94f

    .line 402
    .line 403
    .line 404
    const/high16 v24, 0x40c00000    # 6.0f

    .line 405
    .line 406
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 407
    .line 408
    .line 409
    const v25, 0x411f851f    # 9.97f

    .line 410
    .line 411
    .line 412
    const/high16 v26, 0x41980000    # 19.0f

    .line 413
    .line 414
    const v21, 0x4003d70a    # 2.06f

    .line 415
    .line 416
    .line 417
    const v22, 0x418851ec    # 17.04f

    .line 418
    .line 419
    .line 420
    const v23, 0x40deb852    # 6.96f

    .line 421
    .line 422
    .line 423
    const/high16 v24, 0x41980000    # 19.0f

    .line 424
    .line 425
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 426
    .line 427
    .line 428
    const v25, 0x40c0a3d7    # 6.02f

    .line 429
    .line 430
    .line 431
    const/high16 v26, 0x40400000    # 3.0f

    .line 432
    .line 433
    const v21, 0x4000a3d7    # 2.01f

    .line 434
    .line 435
    .line 436
    const/16 v22, 0x0

    .line 437
    .line 438
    const v23, 0x4000a3d7    # 2.01f

    .line 439
    .line 440
    .line 441
    const/high16 v24, 0x40400000    # 3.0f

    .line 442
    .line 443
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 444
    .line 445
    .line 446
    const/high16 v25, 0x41b00000    # 22.0f

    .line 447
    .line 448
    const v26, 0x417051ec    # 15.02f

    .line 449
    .line 450
    .line 451
    const/high16 v21, 0x41980000    # 19.0f

    .line 452
    .line 453
    const/high16 v22, 0x41b00000    # 22.0f

    .line 454
    .line 455
    const/high16 v23, 0x41b00000    # 22.0f

    .line 456
    .line 457
    const/high16 v24, 0x41980000    # 19.0f

    .line 458
    .line 459
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 460
    .line 461
    .line 462
    const/high16 v25, 0x41980000    # 19.0f

    .line 463
    .line 464
    const/high16 v26, 0x41100000    # 9.0f

    .line 465
    .line 466
    const/high16 v21, 0x41b00000    # 22.0f

    .line 467
    .line 468
    const/high16 v22, 0x41400000    # 12.0f

    .line 469
    .line 470
    const v23, 0x41a8147b    # 21.01f

    .line 471
    .line 472
    .line 473
    const/high16 v24, 0x41300000    # 11.0f

    .line 474
    .line 475
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 476
    .line 477
    .line 478
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 479
    .line 480
    .line 481
    const v4, 0x417fd70a    # 15.99f

    .line 482
    .line 483
    .line 484
    const/high16 v6, 0x41a00000    # 20.0f

    .line 485
    .line 486
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 487
    .line 488
    .line 489
    const v25, -0x3fd47ae1    # -2.68f

    .line 490
    .line 491
    .line 492
    const v26, -0x405eb852    # -1.26f

    .line 493
    .line 494
    .line 495
    const v21, -0x404147ae    # -1.49f

    .line 496
    .line 497
    .line 498
    const/16 v22, 0x0

    .line 499
    .line 500
    const v23, -0x40051eb8    # -1.96f

    .line 501
    .line 502
    .line 503
    const/high16 v24, -0x41000000    # -0.5f

    .line 504
    .line 505
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 506
    .line 507
    .line 508
    const v25, 0x411f851f    # 9.97f

    .line 509
    .line 510
    .line 511
    const/high16 v26, 0x41880000    # 17.0f

    .line 512
    .line 513
    const v21, 0x414a8f5c    # 12.66f

    .line 514
    .line 515
    .line 516
    const v22, 0x41906666    # 18.05f

    .line 517
    .line 518
    .line 519
    const v23, 0x413a8f5c    # 11.66f

    .line 520
    .line 521
    .line 522
    const/high16 v24, 0x41880000    # 17.0f

    .line 523
    .line 524
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 525
    .line 526
    .line 527
    const/high16 v25, 0x40800000    # 4.0f

    .line 528
    .line 529
    const/high16 v26, 0x41380000    # 11.5f

    .line 530
    .line 531
    const v21, 0x410547ae    # 8.33f

    .line 532
    .line 533
    .line 534
    const/high16 v22, 0x41880000    # 17.0f

    .line 535
    .line 536
    const v23, 0x4081999a    # 4.05f

    .line 537
    .line 538
    .line 539
    const v24, 0x4180147b    # 16.01f

    .line 540
    .line 541
    .line 542
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 543
    .line 544
    .line 545
    const v25, 0x40bfae14    # 5.99f

    .line 546
    .line 547
    .line 548
    const v26, 0x40b1999a    # 5.55f

    .line 549
    .line 550
    .line 551
    const v21, 0x407e147b    # 3.97f

    .line 552
    .line 553
    .line 554
    const v22, 0x410fd70a    # 8.99f

    .line 555
    .line 556
    .line 557
    const v23, 0x4095c28f    # 4.68f

    .line 558
    .line 559
    .line 560
    const v24, 0x40dc28f6    # 6.88f

    .line 561
    .line 562
    .line 563
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 564
    .line 565
    .line 566
    const v25, 0x411f851f    # 9.97f

    .line 567
    .line 568
    .line 569
    const/high16 v26, 0x40800000    # 4.0f

    .line 570
    .line 571
    const v21, 0x40e051ec    # 7.01f

    .line 572
    .line 573
    .line 574
    const v22, 0x4090a3d7    # 4.52f

    .line 575
    .line 576
    .line 577
    const v23, 0x4105999a    # 8.35f

    .line 578
    .line 579
    .line 580
    const/high16 v24, 0x40800000    # 4.0f

    .line 581
    .line 582
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 583
    .line 584
    .line 585
    const v25, 0x40bb851f    # 5.86f

    .line 586
    .line 587
    .line 588
    const v26, 0x4080a3d7    # 4.02f

    .line 589
    .line 590
    .line 591
    const v21, 0x4055c28f    # 3.34f

    .line 592
    .line 593
    .line 594
    const/16 v22, 0x0

    .line 595
    .line 596
    const v23, 0x409051ec    # 4.51f

    .line 597
    .line 598
    .line 599
    const v24, 0x3fee147b    # 1.86f

    .line 600
    .line 601
    .line 602
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 603
    .line 604
    .line 605
    const v25, 0x3fe147ae    # 1.76f

    .line 606
    .line 607
    .line 608
    const v26, 0x4018f5c3    # 2.39f

    .line 609
    .line 610
    .line 611
    const v21, 0x3f0ccccd    # 0.55f

    .line 612
    .line 613
    .line 614
    const v22, 0x3f6147ae    # 0.88f

    .line 615
    .line 616
    .line 617
    const v23, 0x3f88f5c3    # 1.07f

    .line 618
    .line 619
    .line 620
    const v24, 0x3fdae148    # 1.71f

    .line 621
    .line 622
    .line 623
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 624
    .line 625
    .line 626
    const v25, 0x401a3d71    # 2.41f

    .line 627
    .line 628
    .line 629
    const v26, 0x4093851f    # 4.61f

    .line 630
    .line 631
    .line 632
    const v21, 0x3ff33333    # 1.9f

    .line 633
    .line 634
    .line 635
    const v22, 0x3ff1eb85    # 1.89f

    .line 636
    .line 637
    .line 638
    const v23, 0x401a3d71    # 2.41f

    .line 639
    .line 640
    .line 641
    const v24, 0x4019999a    # 2.4f

    .line 642
    .line 643
    .line 644
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 645
    .line 646
    .line 647
    const v25, 0x417fd70a    # 15.99f

    .line 648
    .line 649
    .line 650
    const/high16 v26, 0x41a00000    # 20.0f

    .line 651
    .line 652
    const/high16 v21, 0x41a00000    # 20.0f

    .line 653
    .line 654
    const v22, 0x418ef5c3    # 17.87f

    .line 655
    .line 656
    .line 657
    const v23, 0x418f0a3d    # 17.88f

    .line 658
    .line 659
    .line 660
    const/high16 v24, 0x41a00000    # 20.0f

    .line 661
    .line 662
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 663
    .line 664
    .line 665
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 666
    .line 667
    .line 668
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 669
    .line 670
    .line 671
    move-result-object v2

    .line 672
    const/high16 v6, 0x3f800000    # 1.0f

    .line 673
    .line 674
    const/high16 v8, 0x3f800000    # 1.0f

    .line 675
    .line 676
    const/4 v7, 0x0

    .line 677
    const-string v4, ""

    .line 678
    .line 679
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 680
    .line 681
    .line 682
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 683
    .line 684
    .line 685
    move-result v3

    .line 686
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 687
    .line 688
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 689
    .line 690
    .line 691
    move-result-wide v6

    .line 692
    const/4 v0, 0x0

    .line 693
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 694
    .line 695
    .line 696
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 697
    .line 698
    .line 699
    move-result v10

    .line 700
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 701
    .line 702
    .line 703
    move-result v11

    .line 704
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 705
    .line 706
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 707
    .line 708
    .line 709
    const/high16 v0, 0x41400000    # 12.0f

    .line 710
    .line 711
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 712
    .line 713
    .line 714
    const/4 v0, 0x0

    .line 715
    const/high16 v2, -0x3fa00000    # -3.5f

    .line 716
    .line 717
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 718
    .line 719
    .line 720
    const/high16 v18, 0x40e00000    # 7.0f

    .line 721
    .line 722
    const/16 v19, 0x0

    .line 723
    .line 724
    const/high16 v13, 0x40600000    # 3.5f

    .line 725
    .line 726
    const/high16 v14, 0x40600000    # 3.5f

    .line 727
    .line 728
    const/16 v16, 0x1

    .line 729
    .line 730
    const/16 v17, 0x1

    .line 731
    .line 732
    invoke-virtual/range {v12 .. v19}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 733
    .line 734
    .line 735
    const/high16 v18, -0x3f200000    # -7.0f

    .line 736
    .line 737
    invoke-virtual/range {v12 .. v19}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 738
    .line 739
    .line 740
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 741
    .line 742
    .line 743
    move-result-object v2

    .line 744
    const/16 v16, 0x3800

    .line 745
    .line 746
    const/16 v17, 0x0

    .line 747
    .line 748
    const/high16 v6, 0x3f800000    # 1.0f

    .line 749
    .line 750
    const/4 v7, 0x0

    .line 751
    const/high16 v12, 0x3f800000    # 1.0f

    .line 752
    .line 753
    const/4 v13, 0x0

    .line 754
    const/4 v14, 0x0

    .line 755
    const-string v4, ""

    .line 756
    .line 757
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 758
    .line 759
    .line 760
    move-result-object v0

    .line 761
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 762
    .line 763
    .line 764
    move-result-object v0

    .line 765
    sput-object v0, Landroidx/compose/material/icons/twotone/EggAltKt;->_eggAlt:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 766
    .line 767
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 768
    .line 769
    .line 770
    return-object v0
.end method
