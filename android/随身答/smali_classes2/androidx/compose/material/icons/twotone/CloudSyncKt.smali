.class public final Landroidx/compose/material/icons/twotone/CloudSyncKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_cloudSync",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "CloudSync",
        "Landroidx/compose/material/icons/Icons$TwoTone;",
        "getCloudSync",
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
        "SMAP\nCloudSync.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CloudSync.kt\nandroidx/compose/material/icons/twotone/CloudSyncKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,101:1\n212#2,12:102\n233#2,18:115\n253#2:152\n233#2,18:153\n253#2:190\n174#3:114\n705#4,2:133\n717#4,2:135\n719#4,11:141\n705#4,2:171\n717#4,2:173\n719#4,11:179\n72#5,4:137\n72#5,4:175\n*S KotlinDebug\n*F\n+ 1 CloudSync.kt\nandroidx/compose/material/icons/twotone/CloudSyncKt\n*L\n29#1:102,12\n30#1:115,18\n30#1:152\n46#1:153,18\n46#1:190\n29#1:114\n30#1:133,2\n30#1:135,2\n30#1:141,11\n46#1:171,2\n46#1:173,2\n46#1:179,11\n30#1:137,4\n46#1:175,4\n*E\n"
    }
.end annotation


# static fields
.field private static _cloudSync:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getCloudSync(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/CloudSyncKt;->_cloudSync:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.CloudSync"

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
    const v4, 0x41ac147b    # 21.51f

    .line 71
    .line 72
    .line 73
    const/high16 v6, 0x41900000    # 18.0f

    .line 74
    .line 75
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 79
    .line 80
    .line 81
    const/high16 v4, 0x41700000    # 15.0f

    .line 82
    .line 83
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 84
    .line 85
    .line 86
    const/high16 v25, -0x40800000    # -1.0f

    .line 87
    .line 88
    const/high16 v26, -0x40800000    # -1.0f

    .line 89
    .line 90
    const v21, -0x40f33333    # -0.55f

    .line 91
    .line 92
    .line 93
    const/16 v22, 0x0

    .line 94
    .line 95
    const/high16 v23, -0x40800000    # -1.0f

    .line 96
    .line 97
    const v24, -0x4119999a    # -0.45f

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
    const/high16 v4, 0x3f800000    # 1.0f

    .line 106
    .line 107
    const v6, 0x3ee66666    # 0.45f

    .line 108
    .line 109
    .line 110
    const/high16 v7, -0x40800000    # -1.0f

    .line 111
    .line 112
    invoke-virtual {v2, v6, v7, v4, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 113
    .line 114
    .line 115
    const/high16 v4, 0x3fa00000    # 1.25f

    .line 116
    .line 117
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 118
    .line 119
    .line 120
    const/high16 v4, -0x41800000    # -0.25f

    .line 121
    .line 122
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 123
    .line 124
    .line 125
    const/high16 v25, 0x3fe00000    # 1.75f

    .line 126
    .line 127
    const/high16 v26, -0x40200000    # -1.75f

    .line 128
    .line 129
    const/16 v21, 0x0

    .line 130
    .line 131
    const v22, -0x4087ae14    # -0.97f

    .line 132
    .line 133
    .line 134
    const v23, 0x3f47ae14    # 0.78f

    .line 135
    .line 136
    .line 137
    const/high16 v24, -0x40200000    # -1.75f

    .line 138
    .line 139
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 140
    .line 141
    .line 142
    const v4, 0x3f47ae14    # 0.78f

    .line 143
    .line 144
    .line 145
    const/high16 v6, 0x3fe00000    # 1.75f

    .line 146
    .line 147
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 148
    .line 149
    .line 150
    const/high16 v4, 0x41880000    # 17.0f

    .line 151
    .line 152
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 153
    .line 154
    .line 155
    const v25, 0x3fe147ae    # 1.76f

    .line 156
    .line 157
    .line 158
    const/16 v26, 0x0

    .line 159
    .line 160
    const/16 v22, 0x0

    .line 161
    .line 162
    const/high16 v23, 0x3fe00000    # 1.75f

    .line 163
    .line 164
    const/16 v24, 0x0

    .line 165
    .line 166
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 167
    .line 168
    .line 169
    const/high16 v25, 0x3f000000    # 0.5f

    .line 170
    .line 171
    const/high16 v26, 0x3f000000    # 0.5f

    .line 172
    .line 173
    const v21, 0x3e8f5c29    # 0.28f

    .line 174
    .line 175
    .line 176
    const/high16 v23, 0x3f000000    # 0.5f

    .line 177
    .line 178
    const v24, 0x3e6147ae    # 0.22f

    .line 179
    .line 180
    .line 181
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 182
    .line 183
    .line 184
    const v25, 0x41ac147b    # 21.51f

    .line 185
    .line 186
    .line 187
    const/high16 v26, 0x41900000    # 18.0f

    .line 188
    .line 189
    const/high16 v21, 0x41b00000    # 22.0f

    .line 190
    .line 191
    const v22, 0x418e28f6    # 17.77f

    .line 192
    .line 193
    .line 194
    const v23, 0x41ae3d71    # 21.78f

    .line 195
    .line 196
    .line 197
    const/high16 v24, 0x41900000    # 18.0f

    .line 198
    .line 199
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 200
    .line 201
    .line 202
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 203
    .line 204
    .line 205
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 206
    .line 207
    .line 208
    move-result-object v2

    .line 209
    const/16 v16, 0x3800

    .line 210
    .line 211
    const/16 v17, 0x0

    .line 212
    .line 213
    const v6, 0x3e99999a    # 0.3f

    .line 214
    .line 215
    .line 216
    const v8, 0x3e99999a    # 0.3f

    .line 217
    .line 218
    .line 219
    const/4 v7, 0x0

    .line 220
    const/high16 v9, 0x3f800000    # 1.0f

    .line 221
    .line 222
    const/high16 v12, 0x3f800000    # 1.0f

    .line 223
    .line 224
    const/4 v13, 0x0

    .line 225
    const/4 v14, 0x0

    .line 226
    const/4 v15, 0x0

    .line 227
    const-string v4, ""

    .line 228
    .line 229
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 230
    .line 231
    .line 232
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 233
    .line 234
    .line 235
    move-result v3

    .line 236
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 237
    .line 238
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 239
    .line 240
    .line 241
    move-result-wide v6

    .line 242
    const/4 v0, 0x0

    .line 243
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 244
    .line 245
    .line 246
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 247
    .line 248
    .line 249
    move-result v10

    .line 250
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 251
    .line 252
    .line 253
    move-result v11

    .line 254
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 255
    .line 256
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 257
    .line 258
    .line 259
    const/high16 v0, 0x41ac0000    # 21.5f

    .line 260
    .line 261
    const v2, 0x416fae14    # 14.98f

    .line 262
    .line 263
    .line 264
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 265
    .line 266
    .line 267
    const v17, -0x42b33333    # -0.05f

    .line 268
    .line 269
    .line 270
    const v18, 0x3c23d70a    # 0.01f

    .line 271
    .line 272
    .line 273
    const v13, -0x435c28f6    # -0.02f

    .line 274
    .line 275
    .line 276
    const v15, -0x430a3d71    # -0.03f

    .line 277
    .line 278
    .line 279
    const/16 v16, 0x0

    .line 280
    .line 281
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 282
    .line 283
    .line 284
    const/high16 v17, 0x41900000    # 18.0f

    .line 285
    .line 286
    const/high16 v18, 0x41400000    # 12.0f

    .line 287
    .line 288
    const v13, 0x41a9999a    # 21.2f

    .line 289
    .line 290
    .line 291
    const v14, 0x4154cccd    # 13.3f

    .line 292
    .line 293
    .line 294
    const v15, 0x419e147b    # 19.76f

    .line 295
    .line 296
    .line 297
    const/high16 v16, 0x41400000    # 12.0f

    .line 298
    .line 299
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 300
    .line 301
    .line 302
    const v17, -0x3fb5c28f    # -3.16f

    .line 303
    .line 304
    .line 305
    const v18, 0x400147ae    # 2.02f

    .line 306
    .line 307
    .line 308
    const v13, -0x404ccccd    # -1.4f

    .line 309
    .line 310
    .line 311
    const/4 v14, 0x0

    .line 312
    const v15, -0x3fd9999a    # -2.6f

    .line 313
    .line 314
    .line 315
    const v16, 0x3f547ae1    # 0.83f

    .line 316
    .line 317
    .line 318
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 319
    .line 320
    .line 321
    const/high16 v17, 0x41400000    # 12.0f

    .line 322
    .line 323
    const/high16 v18, 0x41880000    # 17.0f

    .line 324
    .line 325
    const v13, 0x415428f6    # 13.26f

    .line 326
    .line 327
    .line 328
    const v14, 0x4161999a    # 14.1f

    .line 329
    .line 330
    .line 331
    const/high16 v15, 0x41400000    # 12.0f

    .line 332
    .line 333
    const v16, 0x41766666    # 15.4f

    .line 334
    .line 335
    .line 336
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 337
    .line 338
    .line 339
    const/high16 v17, 0x40400000    # 3.0f

    .line 340
    .line 341
    const/high16 v18, 0x40400000    # 3.0f

    .line 342
    .line 343
    const/4 v13, 0x0

    .line 344
    const v14, 0x3fd47ae1    # 1.66f

    .line 345
    .line 346
    .line 347
    const v15, 0x3fab851f    # 1.34f

    .line 348
    .line 349
    .line 350
    const/high16 v16, 0x40400000    # 3.0f

    .line 351
    .line 352
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 353
    .line 354
    .line 355
    const/high16 v0, 0x40d00000    # 6.5f

    .line 356
    .line 357
    const v2, -0x435c28f6    # -0.02f

    .line 358
    .line 359
    .line 360
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 361
    .line 362
    .line 363
    const/high16 v17, 0x40200000    # 2.5f

    .line 364
    .line 365
    const/high16 v18, -0x3fe00000    # -2.5f

    .line 366
    .line 367
    const v13, 0x3fb0a3d7    # 1.38f

    .line 368
    .line 369
    .line 370
    const/4 v14, 0x0

    .line 371
    const/high16 v15, 0x40200000    # 2.5f

    .line 372
    .line 373
    const v16, -0x4070a3d7    # -1.12f

    .line 374
    .line 375
    .line 376
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 377
    .line 378
    .line 379
    const v0, 0x41b70a3d    # 22.88f

    .line 380
    .line 381
    .line 382
    const/high16 v2, 0x41ac0000    # 21.5f

    .line 383
    .line 384
    const v4, 0x416fae14    # 14.98f

    .line 385
    .line 386
    .line 387
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 388
    .line 389
    .line 390
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 391
    .line 392
    .line 393
    const v0, 0x41ac147b    # 21.51f

    .line 394
    .line 395
    .line 396
    const/high16 v2, 0x41900000    # 18.0f

    .line 397
    .line 398
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 399
    .line 400
    .line 401
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 402
    .line 403
    .line 404
    const/high16 v0, 0x41700000    # 15.0f

    .line 405
    .line 406
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 407
    .line 408
    .line 409
    const/high16 v17, -0x40800000    # -1.0f

    .line 410
    .line 411
    const/high16 v18, -0x40800000    # -1.0f

    .line 412
    .line 413
    const v13, -0x40f33333    # -0.55f

    .line 414
    .line 415
    .line 416
    const/high16 v15, -0x40800000    # -1.0f

    .line 417
    .line 418
    const v16, -0x4119999a    # -0.45f

    .line 419
    .line 420
    .line 421
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 422
    .line 423
    .line 424
    const/high16 v0, 0x3f800000    # 1.0f

    .line 425
    .line 426
    const v2, 0x3ee66666    # 0.45f

    .line 427
    .line 428
    .line 429
    const/high16 v4, -0x40800000    # -1.0f

    .line 430
    .line 431
    invoke-virtual {v12, v2, v4, v0, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 432
    .line 433
    .line 434
    const/high16 v0, 0x3fa00000    # 1.25f

    .line 435
    .line 436
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 437
    .line 438
    .line 439
    const/high16 v0, -0x41800000    # -0.25f

    .line 440
    .line 441
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 442
    .line 443
    .line 444
    const/high16 v17, 0x3fe00000    # 1.75f

    .line 445
    .line 446
    const/high16 v18, -0x40200000    # -1.75f

    .line 447
    .line 448
    const/4 v13, 0x0

    .line 449
    const v14, -0x4087ae14    # -0.97f

    .line 450
    .line 451
    .line 452
    const v15, 0x3f47ae14    # 0.78f

    .line 453
    .line 454
    .line 455
    const/high16 v16, -0x40200000    # -1.75f

    .line 456
    .line 457
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 458
    .line 459
    .line 460
    const v0, 0x3f47ae14    # 0.78f

    .line 461
    .line 462
    .line 463
    const/high16 v2, 0x3fe00000    # 1.75f

    .line 464
    .line 465
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 466
    .line 467
    .line 468
    const/high16 v0, 0x41880000    # 17.0f

    .line 469
    .line 470
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 471
    .line 472
    .line 473
    const v17, 0x3fe147ae    # 1.76f

    .line 474
    .line 475
    .line 476
    const/16 v18, 0x0

    .line 477
    .line 478
    const/4 v14, 0x0

    .line 479
    const/high16 v15, 0x3fe00000    # 1.75f

    .line 480
    .line 481
    const/16 v16, 0x0

    .line 482
    .line 483
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 484
    .line 485
    .line 486
    const/high16 v17, 0x3f000000    # 0.5f

    .line 487
    .line 488
    const/high16 v18, 0x3f000000    # 0.5f

    .line 489
    .line 490
    const v13, 0x3e8f5c29    # 0.28f

    .line 491
    .line 492
    .line 493
    const/high16 v15, 0x3f000000    # 0.5f

    .line 494
    .line 495
    const v16, 0x3e6147ae    # 0.22f

    .line 496
    .line 497
    .line 498
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 499
    .line 500
    .line 501
    const v17, 0x41ac147b    # 21.51f

    .line 502
    .line 503
    .line 504
    const/high16 v18, 0x41900000    # 18.0f

    .line 505
    .line 506
    const/high16 v13, 0x41b00000    # 22.0f

    .line 507
    .line 508
    const v14, 0x418e28f6    # 17.77f

    .line 509
    .line 510
    .line 511
    const v15, 0x41ae3d71    # 21.78f

    .line 512
    .line 513
    .line 514
    const/high16 v16, 0x41900000    # 18.0f

    .line 515
    .line 516
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 517
    .line 518
    .line 519
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 520
    .line 521
    .line 522
    const v0, 0x408851ec    # 4.26f

    .line 523
    .line 524
    .line 525
    const/high16 v2, 0x41200000    # 10.0f

    .line 526
    .line 527
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 528
    .line 529
    .line 530
    const v0, 0x4005c28f    # 2.09f

    .line 531
    .line 532
    .line 533
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 534
    .line 535
    .line 536
    const/high16 v17, 0x40c00000    # 6.0f

    .line 537
    .line 538
    const/high16 v18, 0x41400000    # 12.0f

    .line 539
    .line 540
    const v13, 0x40f570a4    # 7.67f

    .line 541
    .line 542
    .line 543
    const v14, 0x40e5c28f    # 7.18f

    .line 544
    .line 545
    .line 546
    const/high16 v15, 0x40c00000    # 6.0f

    .line 547
    .line 548
    const v16, 0x41163d71    # 9.39f

    .line 549
    .line 550
    .line 551
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 552
    .line 553
    .line 554
    const/high16 v17, 0x40000000    # 2.0f

    .line 555
    .line 556
    const v18, 0x408e147b    # 4.44f

    .line 557
    .line 558
    .line 559
    const/4 v13, 0x0

    .line 560
    const v14, 0x3fe28f5c    # 1.77f

    .line 561
    .line 562
    .line 563
    const v15, 0x3f47ae14    # 0.78f

    .line 564
    .line 565
    .line 566
    const v16, 0x4055c28f    # 3.34f

    .line 567
    .line 568
    .line 569
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 570
    .line 571
    .line 572
    const/high16 v0, 0x41600000    # 14.0f

    .line 573
    .line 574
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 575
    .line 576
    .line 577
    const/high16 v0, 0x40000000    # 2.0f

    .line 578
    .line 579
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 580
    .line 581
    .line 582
    const/high16 v0, 0x40c00000    # 6.0f

    .line 583
    .line 584
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 585
    .line 586
    .line 587
    const/high16 v0, 0x40800000    # 4.0f

    .line 588
    .line 589
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 590
    .line 591
    .line 592
    const/high16 v0, -0x40000000    # -2.0f

    .line 593
    .line 594
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 595
    .line 596
    .line 597
    const v0, 0x402eb852    # 2.73f

    .line 598
    .line 599
    .line 600
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 601
    .line 602
    .line 603
    const/high16 v17, 0x40800000    # 4.0f

    .line 604
    .line 605
    const/high16 v18, 0x41400000    # 12.0f

    .line 606
    .line 607
    const v13, 0x40a1eb85    # 5.06f

    .line 608
    .line 609
    .line 610
    const v14, 0x418451ec    # 16.54f

    .line 611
    .line 612
    .line 613
    const/high16 v15, 0x40800000    # 4.0f

    .line 614
    .line 615
    const v16, 0x41666666    # 14.4f

    .line 616
    .line 617
    .line 618
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 619
    .line 620
    .line 621
    const/high16 v17, 0x41200000    # 10.0f

    .line 622
    .line 623
    const v18, 0x408851ec    # 4.26f

    .line 624
    .line 625
    .line 626
    const/high16 v13, 0x40800000    # 4.0f

    .line 627
    .line 628
    const v14, 0x410451ec    # 8.27f

    .line 629
    .line 630
    .line 631
    const v15, 0x40d1999a    # 6.55f

    .line 632
    .line 633
    .line 634
    const v16, 0x40a4cccd    # 5.15f

    .line 635
    .line 636
    .line 637
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 638
    .line 639
    .line 640
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 641
    .line 642
    .line 643
    const/high16 v0, 0x41a00000    # 20.0f

    .line 644
    .line 645
    const/high16 v2, 0x40c00000    # 6.0f

    .line 646
    .line 647
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 648
    .line 649
    .line 650
    const v0, -0x3fd147ae    # -2.73f

    .line 651
    .line 652
    .line 653
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 654
    .line 655
    .line 656
    const v17, 0x402a3d71    # 2.66f

    .line 657
    .line 658
    .line 659
    const/high16 v18, 0x40a00000    # 5.0f

    .line 660
    .line 661
    const v13, 0x3fb70a3d    # 1.43f

    .line 662
    .line 663
    .line 664
    const v14, 0x3fa147ae    # 1.26f

    .line 665
    .line 666
    .line 667
    const v15, 0x401a3d71    # 2.41f

    .line 668
    .line 669
    .line 670
    const v16, 0x4040a3d7    # 3.01f

    .line 671
    .line 672
    .line 673
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 674
    .line 675
    .line 676
    const v0, -0x3ffeb852    # -2.02f

    .line 677
    .line 678
    .line 679
    const/4 v2, 0x0

    .line 680
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 681
    .line 682
    .line 683
    const/high16 v17, 0x41800000    # 16.0f

    .line 684
    .line 685
    const v18, 0x40f1eb85    # 7.56f

    .line 686
    .line 687
    .line 688
    const v13, 0x418d70a4    # 17.68f

    .line 689
    .line 690
    .line 691
    const v14, 0x411a3d71    # 9.64f

    .line 692
    .line 693
    .line 694
    const v15, 0x4187d70a    # 16.98f

    .line 695
    .line 696
    .line 697
    const v16, 0x41073333    # 8.45f

    .line 698
    .line 699
    .line 700
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 701
    .line 702
    .line 703
    const/high16 v0, 0x41200000    # 10.0f

    .line 704
    .line 705
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 706
    .line 707
    .line 708
    const/high16 v0, -0x40000000    # -2.0f

    .line 709
    .line 710
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 711
    .line 712
    .line 713
    const/high16 v0, 0x40800000    # 4.0f

    .line 714
    .line 715
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 716
    .line 717
    .line 718
    const/high16 v0, 0x40c00000    # 6.0f

    .line 719
    .line 720
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 721
    .line 722
    .line 723
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 724
    .line 725
    .line 726
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 727
    .line 728
    .line 729
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 730
    .line 731
    .line 732
    move-result-object v2

    .line 733
    const/16 v16, 0x3800

    .line 734
    .line 735
    const/16 v17, 0x0

    .line 736
    .line 737
    const/high16 v6, 0x3f800000    # 1.0f

    .line 738
    .line 739
    const/high16 v8, 0x3f800000    # 1.0f

    .line 740
    .line 741
    const/4 v7, 0x0

    .line 742
    const/high16 v12, 0x3f800000    # 1.0f

    .line 743
    .line 744
    const/4 v13, 0x0

    .line 745
    const/4 v14, 0x0

    .line 746
    const/4 v15, 0x0

    .line 747
    const-string v4, ""

    .line 748
    .line 749
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 750
    .line 751
    .line 752
    move-result-object v0

    .line 753
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 754
    .line 755
    .line 756
    move-result-object v0

    .line 757
    sput-object v0, Landroidx/compose/material/icons/twotone/CloudSyncKt;->_cloudSync:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 758
    .line 759
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 760
    .line 761
    .line 762
    return-object v0
.end method
