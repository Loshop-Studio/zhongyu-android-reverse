.class public final Landroidx/compose/material/icons/filled/Replay5Kt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_replay5",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "Replay5",
        "Landroidx/compose/material/icons/Icons$Filled;",
        "getReplay5",
        "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;",
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
        "SMAP\nReplay5.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Replay5.kt\nandroidx/compose/material/icons/filled/Replay5Kt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,91:1\n212#2,12:92\n233#2,18:105\n253#2:142\n233#2,18:143\n253#2:180\n174#3:104\n705#4,2:123\n717#4,2:125\n719#4,11:131\n705#4,2:161\n717#4,2:163\n719#4,11:169\n72#5,4:127\n72#5,4:165\n*S KotlinDebug\n*F\n+ 1 Replay5.kt\nandroidx/compose/material/icons/filled/Replay5Kt\n*L\n29#1:92,12\n30#1:105,18\n30#1:142\n45#1:143,18\n45#1:180\n29#1:104\n30#1:123,2\n30#1:125,2\n30#1:131,11\n45#1:161,2\n45#1:163,2\n45#1:169,11\n30#1:127,4\n45#1:165,4\n*E\n"
    }
.end annotation


# static fields
.field private static _replay5:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getReplay5(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/filled/Replay5Kt;->_replay5:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Filled.Replay5"

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
    const/high16 v4, 0x3f800000    # 1.0f

    .line 78
    .line 79
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 80
    .line 81
    .line 82
    const/high16 v4, 0x40e00000    # 7.0f

    .line 83
    .line 84
    const/high16 v6, 0x40c00000    # 6.0f

    .line 85
    .line 86
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 87
    .line 88
    .line 89
    const/high16 v4, 0x40a00000    # 5.0f

    .line 90
    .line 91
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 92
    .line 93
    .line 94
    const/high16 v4, 0x40e00000    # 7.0f

    .line 95
    .line 96
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 97
    .line 98
    .line 99
    const/high16 v25, 0x40c00000    # 6.0f

    .line 100
    .line 101
    const/high16 v26, 0x40c00000    # 6.0f

    .line 102
    .line 103
    const v21, 0x4053d70a    # 3.31f

    .line 104
    .line 105
    .line 106
    const/16 v22, 0x0

    .line 107
    .line 108
    const/high16 v23, 0x40c00000    # 6.0f

    .line 109
    .line 110
    const v24, 0x402c28f6    # 2.69f

    .line 111
    .line 112
    .line 113
    move-object/from16 v20, v2

    .line 114
    .line 115
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 116
    .line 117
    .line 118
    const v4, -0x3fd3d70a    # -2.69f

    .line 119
    .line 120
    .line 121
    const/high16 v7, -0x3f400000    # -6.0f

    .line 122
    .line 123
    invoke-virtual {v2, v4, v6, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 124
    .line 125
    .line 126
    const/high16 v6, -0x3f400000    # -6.0f

    .line 127
    .line 128
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 129
    .line 130
    .line 131
    const/high16 v4, 0x40800000    # 4.0f

    .line 132
    .line 133
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 134
    .line 135
    .line 136
    const/high16 v25, 0x41000000    # 8.0f

    .line 137
    .line 138
    const/high16 v26, 0x41000000    # 8.0f

    .line 139
    .line 140
    const/16 v21, 0x0

    .line 141
    .line 142
    const v22, 0x408d70a4    # 4.42f

    .line 143
    .line 144
    .line 145
    const v23, 0x40651eb8    # 3.58f

    .line 146
    .line 147
    .line 148
    const/high16 v24, 0x41000000    # 8.0f

    .line 149
    .line 150
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 151
    .line 152
    .line 153
    const v4, -0x3f9ae148    # -3.58f

    .line 154
    .line 155
    .line 156
    const/high16 v6, -0x3f000000    # -8.0f

    .line 157
    .line 158
    const/high16 v7, 0x41000000    # 8.0f

    .line 159
    .line 160
    invoke-virtual {v2, v7, v4, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 161
    .line 162
    .line 163
    const v4, 0x41835c29    # 16.42f

    .line 164
    .line 165
    .line 166
    const/high16 v6, 0x41400000    # 12.0f

    .line 167
    .line 168
    const/high16 v7, 0x40a00000    # 5.0f

    .line 169
    .line 170
    invoke-virtual {v2, v4, v7, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 171
    .line 172
    .line 173
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 174
    .line 175
    .line 176
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 177
    .line 178
    .line 179
    move-result-object v2

    .line 180
    const/16 v16, 0x3800

    .line 181
    .line 182
    const/16 v17, 0x0

    .line 183
    .line 184
    const/high16 v6, 0x3f800000    # 1.0f

    .line 185
    .line 186
    const/high16 v8, 0x3f800000    # 1.0f

    .line 187
    .line 188
    const/4 v7, 0x0

    .line 189
    const/high16 v9, 0x3f800000    # 1.0f

    .line 190
    .line 191
    const/high16 v12, 0x3f800000    # 1.0f

    .line 192
    .line 193
    const/4 v13, 0x0

    .line 194
    const/4 v14, 0x0

    .line 195
    const/4 v15, 0x0

    .line 196
    const-string v4, ""

    .line 197
    .line 198
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 199
    .line 200
    .line 201
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 202
    .line 203
    .line 204
    move-result v3

    .line 205
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 206
    .line 207
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 208
    .line 209
    .line 210
    move-result-wide v6

    .line 211
    const/4 v0, 0x0

    .line 212
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 213
    .line 214
    .line 215
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 216
    .line 217
    .line 218
    move-result v10

    .line 219
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 220
    .line 221
    .line 222
    move-result v11

    .line 223
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 224
    .line 225
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 226
    .line 227
    .line 228
    const v0, 0x415e6666    # 13.9f

    .line 229
    .line 230
    .line 231
    const v2, 0x412b0a3d    # 10.69f

    .line 232
    .line 233
    .line 234
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 235
    .line 236
    .line 237
    const v0, -0x3ff51eb8    # -2.17f

    .line 238
    .line 239
    .line 240
    const/high16 v2, 0x3e800000    # 0.25f

    .line 241
    .line 242
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 243
    .line 244
    .line 245
    const v0, 0x4018f5c3    # 2.39f

    .line 246
    .line 247
    .line 248
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 249
    .line 250
    .line 251
    const v0, 0x3f35c28f    # 0.71f

    .line 252
    .line 253
    .line 254
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 255
    .line 256
    .line 257
    const v0, -0x40266666    # -1.7f

    .line 258
    .line 259
    .line 260
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 261
    .line 262
    .line 263
    const v0, 0x3f6b851f    # 0.92f

    .line 264
    .line 265
    .line 266
    const v2, -0x421eb852    # -0.11f

    .line 267
    .line 268
    .line 269
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 270
    .line 271
    .line 272
    const v17, 0x3de147ae    # 0.11f

    .line 273
    .line 274
    .line 275
    const v18, -0x42b33333    # -0.05f

    .line 276
    .line 277
    .line 278
    const v13, 0x3cf5c28f    # 0.03f

    .line 279
    .line 280
    .line 281
    const v14, -0x435c28f6    # -0.02f

    .line 282
    .line 283
    .line 284
    const v15, 0x3d8f5c29    # 0.07f

    .line 285
    .line 286
    .line 287
    const v16, -0x430a3d71    # -0.03f

    .line 288
    .line 289
    .line 290
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 291
    .line 292
    .line 293
    const v0, -0x42b33333    # -0.05f

    .line 294
    .line 295
    .line 296
    const v2, 0x3e19999a    # 0.15f

    .line 297
    .line 298
    .line 299
    const v4, -0x42dc28f6    # -0.04f

    .line 300
    .line 301
    .line 302
    const v6, 0x3db851ec    # 0.09f

    .line 303
    .line 304
    .line 305
    invoke-virtual {v12, v6, v4, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 306
    .line 307
    .line 308
    const v0, -0x430a3d71    # -0.03f

    .line 309
    .line 310
    .line 311
    const v2, 0x3e3851ec    # 0.18f

    .line 312
    .line 313
    .line 314
    const v4, 0x3df5c28f    # 0.12f

    .line 315
    .line 316
    .line 317
    const v6, -0x42dc28f6    # -0.04f

    .line 318
    .line 319
    .line 320
    invoke-virtual {v12, v4, v0, v2, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 321
    .line 322
    .line 323
    const v0, 0x3e4ccccd    # 0.2f

    .line 324
    .line 325
    .line 326
    const v2, -0x435c28f6    # -0.02f

    .line 327
    .line 328
    .line 329
    const v4, 0x3e051eb8    # 0.13f

    .line 330
    .line 331
    .line 332
    const v6, -0x435c28f6    # -0.02f

    .line 333
    .line 334
    .line 335
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 336
    .line 337
    .line 338
    const v17, 0x3f0ccccd    # 0.55f

    .line 339
    .line 340
    .line 341
    const v18, 0x3dcccccd    # 0.1f

    .line 342
    .line 343
    .line 344
    const v13, 0x3e570a3d    # 0.21f

    .line 345
    .line 346
    .line 347
    const/4 v14, 0x0

    .line 348
    const v15, 0x3ec7ae14    # 0.39f

    .line 349
    .line 350
    .line 351
    const v16, 0x3cf5c28f    # 0.03f

    .line 352
    .line 353
    .line 354
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 355
    .line 356
    .line 357
    const v0, 0x3ed1eb85    # 0.41f

    .line 358
    .line 359
    .line 360
    const v2, 0x3e8f5c29    # 0.28f

    .line 361
    .line 362
    .line 363
    const v4, 0x3e99999a    # 0.3f

    .line 364
    .line 365
    .line 366
    const v6, 0x3e23d70a    # 0.16f

    .line 367
    .line 368
    .line 369
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 370
    .line 371
    .line 372
    const v0, 0x3e8a3d71    # 0.27f

    .line 373
    .line 374
    .line 375
    const v2, 0x3ee66666    # 0.45f

    .line 376
    .line 377
    .line 378
    const/high16 v4, 0x3e800000    # 0.25f

    .line 379
    .line 380
    const v6, 0x3e4ccccd    # 0.2f

    .line 381
    .line 382
    .line 383
    invoke-virtual {v12, v6, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 384
    .line 385
    .line 386
    const v0, 0x3ec28f5c    # 0.38f

    .line 387
    .line 388
    .line 389
    const v2, 0x3f19999a    # 0.6f

    .line 390
    .line 391
    .line 392
    const v4, 0x3db851ec    # 0.09f

    .line 393
    .line 394
    .line 395
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 396
    .line 397
    .line 398
    const v17, -0x4247ae14    # -0.09f

    .line 399
    .line 400
    .line 401
    const v18, 0x3f0a3d71    # 0.54f

    .line 402
    .line 403
    .line 404
    const/4 v13, 0x0

    .line 405
    const v14, 0x3e428f5c    # 0.19f

    .line 406
    .line 407
    .line 408
    const v15, -0x430a3d71    # -0.03f

    .line 409
    .line 410
    .line 411
    const v16, 0x3ebd70a4    # 0.37f

    .line 412
    .line 413
    .line 414
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 415
    .line 416
    .line 417
    const v0, -0x4175c28f    # -0.27f

    .line 418
    .line 419
    .line 420
    const v2, 0x3ee66666    # 0.45f

    .line 421
    .line 422
    .line 423
    const v4, -0x41e66666    # -0.15f

    .line 424
    .line 425
    .line 426
    const v6, 0x3ea3d70a    # 0.32f

    .line 427
    .line 428
    .line 429
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 430
    .line 431
    .line 432
    const v0, -0x4119999a    # -0.45f

    .line 433
    .line 434
    .line 435
    const v2, 0x3e9eb852    # 0.31f

    .line 436
    .line 437
    .line 438
    const v4, -0x4175c28f    # -0.27f

    .line 439
    .line 440
    .line 441
    const v6, 0x3e75c28f    # 0.24f

    .line 442
    .line 443
    .line 444
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 445
    .line 446
    .line 447
    const v0, -0x413851ec    # -0.39f

    .line 448
    .line 449
    .line 450
    const v2, -0x40dc28f6    # -0.64f

    .line 451
    .line 452
    .line 453
    const v4, 0x3df5c28f    # 0.12f

    .line 454
    .line 455
    .line 456
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 457
    .line 458
    .line 459
    const v17, -0x40f851ec    # -0.53f

    .line 460
    .line 461
    .line 462
    const v18, -0x425c28f6    # -0.08f

    .line 463
    .line 464
    .line 465
    const v13, -0x41c7ae14    # -0.18f

    .line 466
    .line 467
    .line 468
    const/4 v14, 0x0

    .line 469
    const v15, -0x4147ae14    # -0.36f

    .line 470
    .line 471
    .line 472
    const v16, -0x430a3d71    # -0.03f

    .line 473
    .line 474
    .line 475
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 476
    .line 477
    .line 478
    const v0, -0x41f0a3d7    # -0.14f

    .line 479
    .line 480
    .line 481
    const v2, -0x41147ae1    # -0.46f

    .line 482
    .line 483
    .line 484
    const v4, -0x418a3d71    # -0.24f

    .line 485
    .line 486
    .line 487
    const v6, -0x415c28f6    # -0.32f

    .line 488
    .line 489
    .line 490
    invoke-virtual {v12, v6, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 491
    .line 492
    .line 493
    const v0, -0x415c28f6    # -0.32f

    .line 494
    .line 495
    .line 496
    const v2, -0x413851ec    # -0.39f

    .line 497
    .line 498
    .line 499
    invoke-virtual {v12, v4, v4, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 500
    .line 501
    .line 502
    const v0, -0x41570a3d    # -0.33f

    .line 503
    .line 504
    .line 505
    const v2, -0x40f851ec    # -0.53f

    .line 506
    .line 507
    .line 508
    const v4, -0x41fae148    # -0.13f

    .line 509
    .line 510
    .line 511
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 512
    .line 513
    .line 514
    const v0, 0x3f570a3d    # 0.84f

    .line 515
    .line 516
    .line 517
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 518
    .line 519
    .line 520
    const v17, 0x3e428f5c    # 0.19f

    .line 521
    .line 522
    .line 523
    const v18, 0x3ed1eb85    # 0.41f

    .line 524
    .line 525
    .line 526
    const v13, 0x3ca3d70a    # 0.02f

    .line 527
    .line 528
    .line 529
    const v14, 0x3e3851ec    # 0.18f

    .line 530
    .line 531
    .line 532
    const v15, 0x3da3d70a    # 0.08f

    .line 533
    .line 534
    .line 535
    const v16, 0x3ea3d70a    # 0.32f

    .line 536
    .line 537
    .line 538
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 539
    .line 540
    .line 541
    const v0, 0x3ed70a3d    # 0.42f

    .line 542
    .line 543
    .line 544
    const v2, 0x3e19999a    # 0.15f

    .line 545
    .line 546
    .line 547
    const/high16 v4, 0x3e800000    # 0.25f

    .line 548
    .line 549
    invoke-virtual {v12, v4, v2, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 550
    .line 551
    .line 552
    const v17, 0x3e8a3d71    # 0.27f

    .line 553
    .line 554
    .line 555
    const v18, -0x428a3d71    # -0.06f

    .line 556
    .line 557
    .line 558
    const v13, 0x3de147ae    # 0.11f

    .line 559
    .line 560
    .line 561
    const/4 v14, 0x0

    .line 562
    const v15, 0x3e4ccccd    # 0.2f

    .line 563
    .line 564
    .line 565
    const v16, -0x435c28f6    # -0.02f

    .line 566
    .line 567
    .line 568
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 569
    .line 570
    .line 571
    const v0, 0x3e3851ec    # 0.18f

    .line 572
    .line 573
    .line 574
    const v2, -0x41d1eb85    # -0.17f

    .line 575
    .line 576
    .line 577
    const v4, 0x3e0f5c29    # 0.14f

    .line 578
    .line 579
    .line 580
    const v6, -0x42333333    # -0.1f

    .line 581
    .line 582
    .line 583
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 584
    .line 585
    .line 586
    const v0, 0x3de147ae    # 0.11f

    .line 587
    .line 588
    .line 589
    const/high16 v2, -0x41800000    # -0.25f

    .line 590
    .line 591
    const v4, -0x41e66666    # -0.15f

    .line 592
    .line 593
    .line 594
    const v6, 0x3da3d70a    # 0.08f

    .line 595
    .line 596
    .line 597
    invoke-virtual {v12, v6, v4, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 598
    .line 599
    .line 600
    const v0, -0x41b33333    # -0.2f

    .line 601
    .line 602
    .line 603
    const v2, -0x416147ae    # -0.31f

    .line 604
    .line 605
    .line 606
    const v4, 0x3cf5c28f    # 0.03f

    .line 607
    .line 608
    .line 609
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 610
    .line 611
    .line 612
    const v0, -0x41a8f5c3    # -0.21f

    .line 613
    .line 614
    .line 615
    const v4, -0x42dc28f6    # -0.04f

    .line 616
    .line 617
    .line 618
    const v6, -0x43dc28f6    # -0.01f

    .line 619
    .line 620
    .line 621
    invoke-virtual {v12, v6, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 622
    .line 623
    .line 624
    const v0, -0x4270a3d7    # -0.07f

    .line 625
    .line 626
    .line 627
    const v2, -0x41d1eb85    # -0.17f

    .line 628
    .line 629
    .line 630
    const v4, -0x41fae148    # -0.13f

    .line 631
    .line 632
    .line 633
    const v6, -0x418a3d71    # -0.24f

    .line 634
    .line 635
    .line 636
    invoke-virtual {v12, v0, v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 637
    .line 638
    .line 639
    const v0, -0x420a3d71    # -0.12f

    .line 640
    .line 641
    .line 642
    const v2, -0x41a8f5c3    # -0.21f

    .line 643
    .line 644
    .line 645
    const v6, -0x41e66666    # -0.15f

    .line 646
    .line 647
    .line 648
    invoke-virtual {v12, v4, v0, v2, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 649
    .line 650
    .line 651
    const v0, -0x41bd70a4    # -0.19f

    .line 652
    .line 653
    .line 654
    const v2, -0x41666666    # -0.3f

    .line 655
    .line 656
    .line 657
    const v4, -0x42b33333    # -0.05f

    .line 658
    .line 659
    .line 660
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 661
    .line 662
    .line 663
    const v17, -0x41b33333    # -0.2f

    .line 664
    .line 665
    .line 666
    const v18, 0x3ca3d70a    # 0.02f

    .line 667
    .line 668
    .line 669
    const v13, -0x425c28f6    # -0.08f

    .line 670
    .line 671
    .line 672
    const v15, -0x41e66666    # -0.15f

    .line 673
    .line 674
    .line 675
    const v16, 0x3c23d70a    # 0.01f

    .line 676
    .line 677
    .line 678
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 679
    .line 680
    .line 681
    const v0, 0x3d4ccccd    # 0.05f

    .line 682
    .line 683
    .line 684
    const v2, -0x421eb852    # -0.11f

    .line 685
    .line 686
    .line 687
    const v4, 0x3cf5c28f    # 0.03f

    .line 688
    .line 689
    .line 690
    invoke-virtual {v12, v2, v4, v6, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 691
    .line 692
    .line 693
    const v0, -0x420a3d71    # -0.12f

    .line 694
    .line 695
    .line 696
    const v2, 0x3d8f5c29    # 0.07f

    .line 697
    .line 698
    .line 699
    const v4, -0x425c28f6    # -0.08f

    .line 700
    .line 701
    .line 702
    const v6, 0x3d4ccccd    # 0.05f

    .line 703
    .line 704
    .line 705
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 706
    .line 707
    .line 708
    const v0, 0x3d75c28f    # 0.06f

    .line 709
    .line 710
    .line 711
    const v2, -0x42333333    # -0.1f

    .line 712
    .line 713
    .line 714
    const v4, 0x3db851ec    # 0.09f

    .line 715
    .line 716
    .line 717
    const v6, -0x4270a3d7    # -0.07f

    .line 718
    .line 719
    .line 720
    invoke-virtual {v12, v6, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 721
    .line 722
    .line 723
    const v0, 0x415e6666    # 13.9f

    .line 724
    .line 725
    .line 726
    const v2, 0x412b0a3d    # 10.69f

    .line 727
    .line 728
    .line 729
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 730
    .line 731
    .line 732
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 733
    .line 734
    .line 735
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 736
    .line 737
    .line 738
    move-result-object v2

    .line 739
    const/16 v16, 0x3800

    .line 740
    .line 741
    const/16 v17, 0x0

    .line 742
    .line 743
    const/high16 v6, 0x3f800000    # 1.0f

    .line 744
    .line 745
    const/4 v7, 0x0

    .line 746
    const/high16 v12, 0x3f800000    # 1.0f

    .line 747
    .line 748
    const/4 v13, 0x0

    .line 749
    const/4 v15, 0x0

    .line 750
    const-string v4, ""

    .line 751
    .line 752
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 753
    .line 754
    .line 755
    move-result-object v0

    .line 756
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 757
    .line 758
    .line 759
    move-result-object v0

    .line 760
    sput-object v0, Landroidx/compose/material/icons/filled/Replay5Kt;->_replay5:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 761
    .line 762
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 763
    .line 764
    .line 765
    return-object v0
.end method
