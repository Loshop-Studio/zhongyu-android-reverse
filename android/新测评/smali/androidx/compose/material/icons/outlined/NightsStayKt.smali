.class public final Landroidx/compose/material/icons/outlined/NightsStayKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_nightsStay",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "NightsStay",
        "Landroidx/compose/material/icons/Icons$Outlined;",
        "getNightsStay",
        "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;",
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
        "SMAP\nNightsStay.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NightsStay.kt\nandroidx/compose/material/icons/outlined/NightsStayKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,65:1\n212#2,12:66\n233#2,18:79\n253#2:116\n233#2,18:117\n253#2:154\n174#3:78\n705#4,2:97\n717#4,2:99\n719#4,11:105\n705#4,2:135\n717#4,2:137\n719#4,11:143\n72#5,4:101\n72#5,4:139\n*S KotlinDebug\n*F\n+ 1 NightsStay.kt\nandroidx/compose/material/icons/outlined/NightsStayKt\n*L\n29#1:66,12\n30#1:79,18\n30#1:116\n49#1:117,18\n49#1:154\n29#1:78\n30#1:97,2\n30#1:99,2\n30#1:105,11\n49#1:135,2\n49#1:137,2\n49#1:143,11\n30#1:101,4\n49#1:139,4\n*E\n"
    }
.end annotation


# static fields
.field private static _nightsStay:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getNightsStay(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/outlined/NightsStayKt;->_nightsStay:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Outlined.NightsStay"

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
    const v4, 0x419e3d71    # 19.78f

    .line 71
    .line 72
    .line 73
    const v6, 0x418c147b    # 17.51f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v25, -0x3ef51eb8    # -8.68f

    .line 80
    .line 81
    .line 82
    const v26, -0x3f523d71    # -5.43f

    .line 83
    .line 84
    .line 85
    const v21, -0x3fe1eb85    # -2.47f

    .line 86
    .line 87
    .line 88
    const/16 v22, 0x0

    .line 89
    .line 90
    const v23, -0x3f2dc28f    # -6.57f

    .line 91
    .line 92
    .line 93
    const v24, -0x4055c28f    # -1.33f

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
    const v25, 0x413a147b    # 11.63f

    .line 102
    .line 103
    .line 104
    const v26, 0x4000a3d7    # 2.01f

    .line 105
    .line 106
    .line 107
    const v21, 0x410c51ec    # 8.77f

    .line 108
    .line 109
    .line 110
    const v22, 0x40f23d71    # 7.57f

    .line 111
    .line 112
    .line 113
    const v23, 0x4129999a    # 10.6f

    .line 114
    .line 115
    .line 116
    const v24, 0x40666666    # 3.6f

    .line 117
    .line 118
    .line 119
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 120
    .line 121
    .line 122
    const v25, 0x3ffd70a4    # 1.98f

    .line 123
    .line 124
    .line 125
    const/high16 v26, 0x41400000    # 12.0f

    .line 126
    .line 127
    const v21, 0x40c8a3d7    # 6.27f

    .line 128
    .line 129
    .line 130
    const v22, 0x400ccccd    # 2.2f

    .line 131
    .line 132
    .line 133
    const v23, 0x3ffd70a4    # 1.98f

    .line 134
    .line 135
    .line 136
    const v24, 0x40d2e148    # 6.59f

    .line 137
    .line 138
    .line 139
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 140
    .line 141
    .line 142
    const v25, 0x3ca3d70a    # 0.02f

    .line 143
    .line 144
    .line 145
    const v26, 0x3ed70a3d    # 0.42f

    .line 146
    .line 147
    .line 148
    const/16 v21, 0x0

    .line 149
    .line 150
    const v22, 0x3e0f5c29    # 0.14f

    .line 151
    .line 152
    .line 153
    const v23, 0x3ca3d70a    # 0.02f

    .line 154
    .line 155
    .line 156
    const v24, 0x3e8f5c29    # 0.28f

    .line 157
    .line 158
    .line 159
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 160
    .line 161
    .line 162
    const v25, 0x407eb852    # 3.98f

    .line 163
    .line 164
    .line 165
    const/high16 v26, 0x41400000    # 12.0f

    .line 166
    .line 167
    const v21, 0x40270a3d    # 2.61f

    .line 168
    .line 169
    .line 170
    const v22, 0x41428f5c    # 12.16f

    .line 171
    .line 172
    .line 173
    const v23, 0x4051eb85    # 3.28f

    .line 174
    .line 175
    .line 176
    const/high16 v24, 0x41400000    # 12.0f

    .line 177
    .line 178
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 179
    .line 180
    .line 181
    const/16 v25, 0x0

    .line 182
    .line 183
    const/16 v26, 0x0

    .line 184
    .line 185
    const/16 v21, 0x0

    .line 186
    .line 187
    const/16 v22, 0x0

    .line 188
    .line 189
    const/16 v23, 0x0

    .line 190
    .line 191
    const/16 v24, 0x0

    .line 192
    .line 193
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 194
    .line 195
    .line 196
    const v25, 0x4089999a    # 4.3f

    .line 197
    .line 198
    .line 199
    const v26, -0x3f1ccccd    # -7.1f

    .line 200
    .line 201
    .line 202
    const v22, -0x3fba3d71    # -3.09f

    .line 203
    .line 204
    .line 205
    const v23, 0x3fdd70a4    # 1.73f

    .line 206
    .line 207
    .line 208
    const v24, -0x3f475c29    # -5.77f

    .line 209
    .line 210
    .line 211
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 212
    .line 213
    .line 214
    const v25, 0x41151eb8    # 9.32f

    .line 215
    .line 216
    .line 217
    const/high16 v26, 0x41500000    # 13.0f

    .line 218
    .line 219
    const v21, 0x40f8f5c3    # 7.78f

    .line 220
    .line 221
    .line 222
    const v22, 0x40e2e148    # 7.09f

    .line 223
    .line 224
    .line 225
    const v23, 0x40f7ae14    # 7.74f

    .line 226
    .line 227
    .line 228
    const v24, 0x411f0a3d    # 9.94f

    .line 229
    .line 230
    .line 231
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 232
    .line 233
    .line 234
    const v25, 0x40d9999a    # 6.8f

    .line 235
    .line 236
    .line 237
    const v26, 0x40bb851f    # 5.86f

    .line 238
    .line 239
    .line 240
    const v21, 0x3fc8f5c3    # 1.57f

    .line 241
    .line 242
    .line 243
    const v22, 0x40428f5c    # 3.04f

    .line 244
    .line 245
    .line 246
    const v23, 0x4085c28f    # 4.18f

    .line 247
    .line 248
    .line 249
    const v24, 0x409e6666    # 4.95f

    .line 250
    .line 251
    .line 252
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 253
    .line 254
    .line 255
    const v25, -0x3f7bd70a    # -4.13f

    .line 256
    .line 257
    .line 258
    const v26, 0x3f933333    # 1.15f

    .line 259
    .line 260
    .line 261
    const v21, -0x40628f5c    # -1.23f

    .line 262
    .line 263
    .line 264
    const v22, 0x3f3d70a4    # 0.74f

    .line 265
    .line 266
    .line 267
    const v23, -0x3fd66666    # -2.65f

    .line 268
    .line 269
    .line 270
    const v24, 0x3f933333    # 1.15f

    .line 271
    .line 272
    .line 273
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 274
    .line 275
    .line 276
    const v25, -0x40428f5c    # -1.48f

    .line 277
    .line 278
    .line 279
    const v26, -0x41f0a3d7    # -0.14f

    .line 280
    .line 281
    .line 282
    const/high16 v21, -0x41000000    # -0.5f

    .line 283
    .line 284
    const/16 v22, 0x0

    .line 285
    .line 286
    const/high16 v23, -0x40800000    # -1.0f

    .line 287
    .line 288
    const v24, -0x42b33333    # -0.05f

    .line 289
    .line 290
    .line 291
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 292
    .line 293
    .line 294
    const v25, -0x402e147b    # -1.64f

    .line 295
    .line 296
    .line 297
    const v26, 0x3fd1eb85    # 1.64f

    .line 298
    .line 299
    .line 300
    const v21, -0x41428f5c    # -0.37f

    .line 301
    .line 302
    .line 303
    const v22, 0x3f333333    # 0.7f

    .line 304
    .line 305
    .line 306
    const v23, -0x408f5c29    # -0.94f

    .line 307
    .line 308
    .line 309
    const v24, 0x3fa28f5c    # 1.27f

    .line 310
    .line 311
    .line 312
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 313
    .line 314
    .line 315
    const v25, 0x40470a3d    # 3.11f

    .line 316
    .line 317
    .line 318
    const/high16 v26, 0x3f000000    # 0.5f

    .line 319
    .line 320
    const v21, 0x3f7ae148    # 0.98f

    .line 321
    .line 322
    .line 323
    const v22, 0x3ea3d70a    # 0.32f

    .line 324
    .line 325
    .line 326
    const v23, 0x4001eb85    # 2.03f

    .line 327
    .line 328
    .line 329
    const/high16 v24, 0x3f000000    # 0.5f

    .line 330
    .line 331
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 332
    .line 333
    .line 334
    const v25, 0x4105eb85    # 8.37f

    .line 335
    .line 336
    .line 337
    const v26, -0x3f6f5c29    # -4.52f

    .line 338
    .line 339
    .line 340
    const/high16 v21, 0x40600000    # 3.5f

    .line 341
    .line 342
    const/16 v22, 0x0

    .line 343
    .line 344
    const v23, 0x40d28f5c    # 6.58f

    .line 345
    .line 346
    .line 347
    const v24, -0x4019999a    # -1.8f

    .line 348
    .line 349
    .line 350
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 351
    .line 352
    .line 353
    const v25, 0x419e3d71    # 19.78f

    .line 354
    .line 355
    .line 356
    const v26, 0x418c147b    # 17.51f

    .line 357
    .line 358
    .line 359
    const v21, 0x41a170a4    # 20.18f

    .line 360
    .line 361
    .line 362
    const/high16 v22, 0x418c0000    # 17.5f

    .line 363
    .line 364
    const v23, 0x419fd70a    # 19.98f

    .line 365
    .line 366
    .line 367
    const v24, 0x418c147b    # 17.51f

    .line 368
    .line 369
    .line 370
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 371
    .line 372
    .line 373
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 374
    .line 375
    .line 376
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 377
    .line 378
    .line 379
    move-result-object v2

    .line 380
    const/16 v16, 0x3800

    .line 381
    .line 382
    const/16 v17, 0x0

    .line 383
    .line 384
    const/high16 v6, 0x3f800000    # 1.0f

    .line 385
    .line 386
    const/high16 v8, 0x3f800000    # 1.0f

    .line 387
    .line 388
    const/4 v7, 0x0

    .line 389
    const/high16 v9, 0x3f800000    # 1.0f

    .line 390
    .line 391
    const/high16 v12, 0x3f800000    # 1.0f

    .line 392
    .line 393
    const/4 v13, 0x0

    .line 394
    const/4 v14, 0x0

    .line 395
    const/4 v15, 0x0

    .line 396
    const-string v4, ""

    .line 397
    .line 398
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 399
    .line 400
    .line 401
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 402
    .line 403
    .line 404
    move-result v3

    .line 405
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 406
    .line 407
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 408
    .line 409
    .line 410
    move-result-wide v6

    .line 411
    const/4 v0, 0x0

    .line 412
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 413
    .line 414
    .line 415
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 416
    .line 417
    .line 418
    move-result v10

    .line 419
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 420
    .line 421
    .line 422
    move-result v11

    .line 423
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 424
    .line 425
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 426
    .line 427
    .line 428
    const/high16 v0, 0x40e00000    # 7.0f

    .line 429
    .line 430
    const/high16 v2, 0x41800000    # 16.0f

    .line 431
    .line 432
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 433
    .line 434
    .line 435
    const v0, -0x41c7ae14    # -0.18f

    .line 436
    .line 437
    .line 438
    const/4 v2, 0x0

    .line 439
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 440
    .line 441
    .line 442
    const/high16 v17, 0x40800000    # 4.0f

    .line 443
    .line 444
    const/high16 v18, 0x41600000    # 14.0f

    .line 445
    .line 446
    const v13, 0x40cccccd    # 6.4f

    .line 447
    .line 448
    .line 449
    const v14, 0x416d70a4    # 14.84f

    .line 450
    .line 451
    .line 452
    const v15, 0x40a9999a    # 5.3f

    .line 453
    .line 454
    .line 455
    const/high16 v16, 0x41600000    # 14.0f

    .line 456
    .line 457
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 458
    .line 459
    .line 460
    const/high16 v17, -0x3fc00000    # -3.0f

    .line 461
    .line 462
    const/high16 v18, 0x40400000    # 3.0f

    .line 463
    .line 464
    const v13, -0x402b851f    # -1.66f

    .line 465
    .line 466
    .line 467
    const/4 v14, 0x0

    .line 468
    const/high16 v15, -0x3fc00000    # -3.0f

    .line 469
    .line 470
    const v16, 0x3fab851f    # 1.34f

    .line 471
    .line 472
    .line 473
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 474
    .line 475
    .line 476
    const v0, 0x3fab851f    # 1.34f

    .line 477
    .line 478
    .line 479
    const/high16 v2, 0x40400000    # 3.0f

    .line 480
    .line 481
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 482
    .line 483
    .line 484
    const/high16 v17, 0x40400000    # 3.0f

    .line 485
    .line 486
    const/16 v18, 0x0

    .line 487
    .line 488
    const v13, 0x3f1eb852    # 0.62f

    .line 489
    .line 490
    .line 491
    const v15, 0x401f5c29    # 2.49f

    .line 492
    .line 493
    .line 494
    const/16 v16, 0x0

    .line 495
    .line 496
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 497
    .line 498
    .line 499
    const/high16 v17, 0x40000000    # 2.0f

    .line 500
    .line 501
    const/high16 v18, -0x40000000    # -2.0f

    .line 502
    .line 503
    const v13, 0x3f8ccccd    # 1.1f

    .line 504
    .line 505
    .line 506
    const/high16 v15, 0x40000000    # 2.0f

    .line 507
    .line 508
    const v16, -0x4099999a    # -0.9f

    .line 509
    .line 510
    .line 511
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 512
    .line 513
    .line 514
    const/high16 v17, 0x40e00000    # 7.0f

    .line 515
    .line 516
    const/high16 v18, 0x41800000    # 16.0f

    .line 517
    .line 518
    const/high16 v13, 0x41100000    # 9.0f

    .line 519
    .line 520
    const v14, 0x41873333    # 16.9f

    .line 521
    .line 522
    .line 523
    const v15, 0x4101999a    # 8.1f

    .line 524
    .line 525
    .line 526
    const/high16 v16, 0x41800000    # 16.0f

    .line 527
    .line 528
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 529
    .line 530
    .line 531
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 532
    .line 533
    .line 534
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 535
    .line 536
    .line 537
    move-result-object v2

    .line 538
    const/16 v16, 0x3800

    .line 539
    .line 540
    const/16 v17, 0x0

    .line 541
    .line 542
    const/high16 v6, 0x3f800000    # 1.0f

    .line 543
    .line 544
    const/4 v7, 0x0

    .line 545
    const/high16 v12, 0x3f800000    # 1.0f

    .line 546
    .line 547
    const/4 v13, 0x0

    .line 548
    const/4 v14, 0x0

    .line 549
    const/4 v15, 0x0

    .line 550
    const-string v4, ""

    .line 551
    .line 552
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 553
    .line 554
    .line 555
    move-result-object v0

    .line 556
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 557
    .line 558
    .line 559
    move-result-object v0

    .line 560
    sput-object v0, Landroidx/compose/material/icons/outlined/NightsStayKt;->_nightsStay:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 561
    .line 562
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 563
    .line 564
    .line 565
    return-object v0
.end method
