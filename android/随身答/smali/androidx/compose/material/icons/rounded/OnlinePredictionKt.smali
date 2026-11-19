.class public final Landroidx/compose/material/icons/rounded/OnlinePredictionKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_onlinePrediction",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "OnlinePrediction",
        "Landroidx/compose/material/icons/Icons$Rounded;",
        "getOnlinePrediction",
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
        "SMAP\nOnlinePrediction.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OnlinePrediction.kt\nandroidx/compose/material/icons/rounded/OnlinePredictionKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,100:1\n212#2,12:101\n233#2,18:114\n253#2:151\n174#3:113\n705#4,2:132\n717#4,2:134\n719#4,11:140\n72#5,4:136\n*S KotlinDebug\n*F\n+ 1 OnlinePrediction.kt\nandroidx/compose/material/icons/rounded/OnlinePredictionKt\n*L\n29#1:101,12\n30#1:114,18\n30#1:151\n29#1:113\n30#1:132,2\n30#1:134,2\n30#1:140,11\n30#1:136,4\n*E\n"
    }
.end annotation


# static fields
.field private static _onlinePrediction:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getOnlinePrediction(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/OnlinePredictionKt;->_onlinePrediction:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.OnlinePrediction"

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
    const/4 v0, 0x0

    .line 50
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 51
    .line 52
    .line 53
    sget-object v0, Landroidx/compose/ui/graphics/StrokeCap;->Companion:Landroidx/compose/ui/graphics/StrokeCap$Companion;

    .line 54
    .line 55
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 56
    .line 57
    .line 58
    move-result v10

    .line 59
    sget-object v0, Landroidx/compose/ui/graphics/StrokeJoin;->Companion:Landroidx/compose/ui/graphics/StrokeJoin$Companion;

    .line 60
    .line 61
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 62
    .line 63
    .line 64
    move-result v11

    .line 65
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 66
    .line 67
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 68
    .line 69
    .line 70
    const/high16 v0, 0x41380000    # 11.5f

    .line 71
    .line 72
    const/high16 v2, 0x41780000    # 15.5f

    .line 73
    .line 74
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v17, -0x3fe00000    # -2.5f

    .line 78
    .line 79
    const/high16 v18, 0x40a00000    # 5.0f

    .line 80
    .line 81
    const/4 v13, 0x0

    .line 82
    const/high16 v14, 0x40000000    # 2.0f

    .line 83
    .line 84
    const/high16 v15, -0x3fe00000    # -2.5f

    .line 85
    .line 86
    const/high16 v16, 0x40600000    # 3.5f

    .line 87
    .line 88
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 89
    .line 90
    .line 91
    const/high16 v0, -0x40000000    # -2.0f

    .line 92
    .line 93
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 94
    .line 95
    .line 96
    const/high16 v18, -0x3f600000    # -5.0f

    .line 97
    .line 98
    const/high16 v14, -0x40400000    # -1.5f

    .line 99
    .line 100
    const/high16 v16, -0x3fc00000    # -3.0f

    .line 101
    .line 102
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 103
    .line 104
    .line 105
    const/high16 v17, 0x41400000    # 12.0f

    .line 106
    .line 107
    const/high16 v18, 0x41000000    # 8.0f

    .line 108
    .line 109
    const/high16 v13, 0x41080000    # 8.5f

    .line 110
    .line 111
    const v14, 0x41191eb8    # 9.57f

    .line 112
    .line 113
    .line 114
    const v15, 0x41211eb8    # 10.07f

    .line 115
    .line 116
    .line 117
    const/high16 v16, 0x41000000    # 8.0f

    .line 118
    .line 119
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 120
    .line 121
    .line 122
    const v0, 0x41191eb8    # 9.57f

    .line 123
    .line 124
    .line 125
    const/high16 v2, 0x41380000    # 11.5f

    .line 126
    .line 127
    const/high16 v4, 0x41780000    # 15.5f

    .line 128
    .line 129
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 130
    .line 131
    .line 132
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 133
    .line 134
    .line 135
    const/high16 v0, 0x41500000    # 13.0f

    .line 136
    .line 137
    const/high16 v2, 0x418c0000    # 17.5f

    .line 138
    .line 139
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 140
    .line 141
    .line 142
    const/high16 v0, -0x40000000    # -2.0f

    .line 143
    .line 144
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 145
    .line 146
    .line 147
    const/high16 v0, 0x41900000    # 18.0f

    .line 148
    .line 149
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 150
    .line 151
    .line 152
    const/high16 v17, 0x3f800000    # 1.0f

    .line 153
    .line 154
    const/high16 v18, 0x3f800000    # 1.0f

    .line 155
    .line 156
    const/4 v13, 0x0

    .line 157
    const v14, 0x3f0ccccd    # 0.55f

    .line 158
    .line 159
    .line 160
    const v15, 0x3ee66666    # 0.45f

    .line 161
    .line 162
    .line 163
    const/high16 v16, 0x3f800000    # 1.0f

    .line 164
    .line 165
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 166
    .line 167
    .line 168
    const/4 v0, 0x0

    .line 169
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 170
    .line 171
    .line 172
    const/high16 v18, -0x40800000    # -1.0f

    .line 173
    .line 174
    const v13, 0x3f0ccccd    # 0.55f

    .line 175
    .line 176
    .line 177
    const/4 v14, 0x0

    .line 178
    const/high16 v15, 0x3f800000    # 1.0f

    .line 179
    .line 180
    const v16, -0x4119999a    # -0.45f

    .line 181
    .line 182
    .line 183
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 184
    .line 185
    .line 186
    const/high16 v0, 0x418c0000    # 17.5f

    .line 187
    .line 188
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 189
    .line 190
    .line 191
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 192
    .line 193
    .line 194
    const/high16 v0, 0x41b00000    # 22.0f

    .line 195
    .line 196
    const/high16 v2, 0x41400000    # 12.0f

    .line 197
    .line 198
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 199
    .line 200
    .line 201
    const v17, -0x3fe8f5c3    # -2.36f

    .line 202
    .line 203
    .line 204
    const v18, -0x3f31999a    # -6.45f

    .line 205
    .line 206
    .line 207
    const/4 v13, 0x0

    .line 208
    const v14, -0x3fe28f5c    # -2.46f

    .line 209
    .line 210
    .line 211
    const v15, -0x409c28f6    # -0.89f

    .line 212
    .line 213
    .line 214
    const v16, -0x3f6947ae    # -4.71f

    .line 215
    .line 216
    .line 217
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 218
    .line 219
    .line 220
    const v17, -0x4070a3d7    # -1.12f

    .line 221
    .line 222
    .line 223
    const v18, -0x428a3d71    # -0.06f

    .line 224
    .line 225
    .line 226
    const v13, -0x416b851f    # -0.29f

    .line 227
    .line 228
    .line 229
    const v14, -0x4151eb85    # -0.34f

    .line 230
    .line 231
    .line 232
    const v15, -0x40b33333    # -0.8f

    .line 233
    .line 234
    .line 235
    const v16, -0x413d70a4    # -0.38f

    .line 236
    .line 237
    .line 238
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 239
    .line 240
    .line 241
    const/4 v0, 0x0

    .line 242
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 243
    .line 244
    .line 245
    const v17, -0x428a3d71    # -0.06f

    .line 246
    .line 247
    .line 248
    const/high16 v18, 0x3f800000    # 1.0f

    .line 249
    .line 250
    const v13, -0x4175c28f    # -0.27f

    .line 251
    .line 252
    .line 253
    const v14, 0x3e8a3d71    # 0.27f

    .line 254
    .line 255
    .line 256
    const v15, -0x41666666    # -0.3f

    .line 257
    .line 258
    .line 259
    const v16, 0x3f35c28f    # 0.71f

    .line 260
    .line 261
    .line 262
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 263
    .line 264
    .line 265
    const/high16 v17, 0x41a40000    # 20.5f

    .line 266
    .line 267
    const/high16 v18, 0x41400000    # 12.0f

    .line 268
    .line 269
    const v13, 0x419dd70a    # 19.73f

    .line 270
    .line 271
    .line 272
    const v14, 0x40ff0a3d    # 7.97f

    .line 273
    .line 274
    .line 275
    const/high16 v15, 0x41a40000    # 20.5f

    .line 276
    .line 277
    const v16, 0x411e6666    # 9.9f

    .line 278
    .line 279
    .line 280
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 281
    .line 282
    .line 283
    const v17, -0x3ffd70a4    # -2.04f

    .line 284
    .line 285
    .line 286
    const v18, 0x40b0a3d7    # 5.52f

    .line 287
    .line 288
    .line 289
    const/4 v13, 0x0

    .line 290
    const v14, 0x40066666    # 2.1f

    .line 291
    .line 292
    .line 293
    const v15, -0x40bae148    # -0.77f

    .line 294
    .line 295
    .line 296
    const v16, 0x4080f5c3    # 4.03f

    .line 297
    .line 298
    .line 299
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 300
    .line 301
    .line 302
    const v17, 0x3d75c28f    # 0.06f

    .line 303
    .line 304
    .line 305
    const/high16 v18, 0x3f800000    # 1.0f

    .line 306
    .line 307
    const/high16 v13, -0x41800000    # -0.25f

    .line 308
    .line 309
    const v14, 0x3e947ae1    # 0.29f

    .line 310
    .line 311
    .line 312
    const v15, -0x41a8f5c3    # -0.21f

    .line 313
    .line 314
    .line 315
    const v16, 0x3f3ae148    # 0.73f

    .line 316
    .line 317
    .line 318
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 319
    .line 320
    .line 321
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 322
    .line 323
    .line 324
    const v17, 0x3f8f5c29    # 1.12f

    .line 325
    .line 326
    .line 327
    const v18, -0x428a3d71    # -0.06f

    .line 328
    .line 329
    .line 330
    const v13, 0x3ea3d70a    # 0.32f

    .line 331
    .line 332
    .line 333
    const v14, 0x3ea3d70a    # 0.32f

    .line 334
    .line 335
    .line 336
    const v15, 0x3f547ae1    # 0.83f

    .line 337
    .line 338
    .line 339
    const v16, 0x3e8f5c29    # 0.28f

    .line 340
    .line 341
    .line 342
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 343
    .line 344
    .line 345
    const/high16 v17, 0x41b00000    # 22.0f

    .line 346
    .line 347
    const/high16 v18, 0x41400000    # 12.0f

    .line 348
    .line 349
    const v13, 0x41a8e148    # 21.11f

    .line 350
    .line 351
    .line 352
    const v14, 0x4185ae14    # 16.71f

    .line 353
    .line 354
    .line 355
    const/high16 v15, 0x41b00000    # 22.0f

    .line 356
    .line 357
    const v16, 0x41675c29    # 14.46f

    .line 358
    .line 359
    .line 360
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 361
    .line 362
    .line 363
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 364
    .line 365
    .line 366
    const/high16 v0, 0x40600000    # 3.5f

    .line 367
    .line 368
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 369
    .line 370
    .line 371
    const v17, 0x40028f5c    # 2.04f

    .line 372
    .line 373
    .line 374
    const v18, -0x3f4f5c29    # -5.52f

    .line 375
    .line 376
    .line 377
    const/4 v13, 0x0

    .line 378
    const v14, -0x3ff9999a    # -2.1f

    .line 379
    .line 380
    .line 381
    const v15, 0x3f451eb8    # 0.77f

    .line 382
    .line 383
    .line 384
    const v16, -0x3f7f0a3d    # -4.03f

    .line 385
    .line 386
    .line 387
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 388
    .line 389
    .line 390
    const v17, -0x428a3d71    # -0.06f

    .line 391
    .line 392
    .line 393
    const/high16 v18, -0x40800000    # -1.0f

    .line 394
    .line 395
    const/high16 v13, 0x3e800000    # 0.25f

    .line 396
    .line 397
    const v14, -0x416b851f    # -0.29f

    .line 398
    .line 399
    .line 400
    const v15, 0x3e570a3d    # 0.21f

    .line 401
    .line 402
    .line 403
    const v16, -0x40c51eb8    # -0.73f

    .line 404
    .line 405
    .line 406
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 407
    .line 408
    .line 409
    const/4 v0, 0x0

    .line 410
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 411
    .line 412
    .line 413
    const v17, 0x408b851f    # 4.36f

    .line 414
    .line 415
    .line 416
    const v18, 0x40b147ae    # 5.54f

    .line 417
    .line 418
    .line 419
    const v13, 0x40a570a4    # 5.17f

    .line 420
    .line 421
    .line 422
    const v14, 0x40a570a4    # 5.17f

    .line 423
    .line 424
    .line 425
    const v15, 0x4094cccd    # 4.65f

    .line 426
    .line 427
    .line 428
    const v16, 0x40a66666    # 5.2f

    .line 429
    .line 430
    .line 431
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 432
    .line 433
    .line 434
    const/high16 v17, 0x40000000    # 2.0f

    .line 435
    .line 436
    const/high16 v18, 0x41400000    # 12.0f

    .line 437
    .line 438
    const v13, 0x4038f5c3    # 2.89f

    .line 439
    .line 440
    .line 441
    const v14, 0x40e947ae    # 7.29f

    .line 442
    .line 443
    .line 444
    const/high16 v15, 0x40000000    # 2.0f

    .line 445
    .line 446
    const v16, 0x4118a3d7    # 9.54f

    .line 447
    .line 448
    .line 449
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 450
    .line 451
    .line 452
    const v17, 0x40170a3d    # 2.36f

    .line 453
    .line 454
    .line 455
    const v18, 0x40ceb852    # 6.46f

    .line 456
    .line 457
    .line 458
    const/4 v13, 0x0

    .line 459
    const v14, 0x401d70a4    # 2.46f

    .line 460
    .line 461
    .line 462
    const v15, 0x3f63d70a    # 0.89f

    .line 463
    .line 464
    .line 465
    const v16, 0x4096b852    # 4.71f

    .line 466
    .line 467
    .line 468
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 469
    .line 470
    .line 471
    const v17, 0x3f8f5c29    # 1.12f

    .line 472
    .line 473
    .line 474
    const v18, 0x3d75c28f    # 0.06f

    .line 475
    .line 476
    .line 477
    const v13, 0x3e947ae1    # 0.29f

    .line 478
    .line 479
    .line 480
    const v14, 0x3eae147b    # 0.34f

    .line 481
    .line 482
    .line 483
    const v15, 0x3f4ccccd    # 0.8f

    .line 484
    .line 485
    .line 486
    const v16, 0x3ec28f5c    # 0.38f

    .line 487
    .line 488
    .line 489
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 490
    .line 491
    .line 492
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 493
    .line 494
    .line 495
    const v17, 0x3d75c28f    # 0.06f

    .line 496
    .line 497
    .line 498
    const/high16 v18, -0x40800000    # -1.0f

    .line 499
    .line 500
    const v13, 0x3e8a3d71    # 0.27f

    .line 501
    .line 502
    .line 503
    const v14, -0x4175c28f    # -0.27f

    .line 504
    .line 505
    .line 506
    const v15, 0x3e99999a    # 0.3f

    .line 507
    .line 508
    .line 509
    const v16, -0x40ca3d71    # -0.71f

    .line 510
    .line 511
    .line 512
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 513
    .line 514
    .line 515
    const/high16 v17, 0x40600000    # 3.5f

    .line 516
    .line 517
    const/high16 v18, 0x41400000    # 12.0f

    .line 518
    .line 519
    const v13, 0x4088a3d7    # 4.27f

    .line 520
    .line 521
    .line 522
    const v14, 0x41803d71    # 16.03f

    .line 523
    .line 524
    .line 525
    const/high16 v15, 0x40600000    # 3.5f

    .line 526
    .line 527
    const v16, 0x4161999a    # 14.1f

    .line 528
    .line 529
    .line 530
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 531
    .line 532
    .line 533
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 534
    .line 535
    .line 536
    const/high16 v0, 0x41400000    # 12.0f

    .line 537
    .line 538
    const/high16 v2, 0x418c0000    # 17.5f

    .line 539
    .line 540
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 541
    .line 542
    .line 543
    const v17, -0x4068f5c3    # -1.18f

    .line 544
    .line 545
    .line 546
    const v18, 0x405a3d71    # 3.41f

    .line 547
    .line 548
    .line 549
    const/4 v13, 0x0

    .line 550
    const v14, 0x3fa3d70a    # 1.28f

    .line 551
    .line 552
    .line 553
    const v15, -0x411eb852    # -0.44f

    .line 554
    .line 555
    .line 556
    const v16, 0x401e147b    # 2.47f

    .line 557
    .line 558
    .line 559
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 560
    .line 561
    .line 562
    const v17, 0x3d8f5c29    # 0.07f

    .line 563
    .line 564
    .line 565
    const v18, 0x3f7ae148    # 0.98f

    .line 566
    .line 567
    .line 568
    const v13, -0x41947ae1    # -0.23f

    .line 569
    .line 570
    .line 571
    const v14, 0x3e947ae1    # 0.29f

    .line 572
    .line 573
    .line 574
    const v15, -0x41b33333    # -0.2f

    .line 575
    .line 576
    .line 577
    const v16, 0x3f35c28f    # 0.71f

    .line 578
    .line 579
    .line 580
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 581
    .line 582
    .line 583
    const/4 v0, 0x0

    .line 584
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 585
    .line 586
    .line 587
    const v17, 0x3f90a3d7    # 1.13f

    .line 588
    .line 589
    .line 590
    const v18, -0x4270a3d7    # -0.07f

    .line 591
    .line 592
    .line 593
    const v13, 0x3ea3d70a    # 0.32f

    .line 594
    .line 595
    .line 596
    const v14, 0x3ea3d70a    # 0.32f

    .line 597
    .line 598
    .line 599
    const v15, 0x3f59999a    # 0.85f

    .line 600
    .line 601
    .line 602
    const v16, 0x3e947ae1    # 0.29f

    .line 603
    .line 604
    .line 605
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 606
    .line 607
    .line 608
    const/high16 v17, 0x41980000    # 19.0f

    .line 609
    .line 610
    const/high16 v18, 0x41400000    # 12.0f

    .line 611
    .line 612
    const v13, 0x4193851f    # 18.44f

    .line 613
    .line 614
    .line 615
    const v14, 0x4172147b    # 15.13f

    .line 616
    .line 617
    .line 618
    const/high16 v15, 0x41980000    # 19.0f

    .line 619
    .line 620
    const v16, 0x415a147b    # 13.63f

    .line 621
    .line 622
    .line 623
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 624
    .line 625
    .line 626
    const v17, -0x404147ae    # -1.49f

    .line 627
    .line 628
    .line 629
    const v18, -0x3f76147b    # -4.31f

    .line 630
    .line 631
    .line 632
    const/4 v13, 0x0

    .line 633
    const v14, -0x402f5c29    # -1.63f

    .line 634
    .line 635
    .line 636
    const v15, -0x40f0a3d7    # -0.56f

    .line 637
    .line 638
    .line 639
    const v16, -0x3fb7ae14    # -3.13f

    .line 640
    .line 641
    .line 642
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 643
    .line 644
    .line 645
    const v17, -0x406f5c29    # -1.13f

    .line 646
    .line 647
    .line 648
    const v18, -0x4270a3d7    # -0.07f

    .line 649
    .line 650
    .line 651
    const v13, -0x4170a3d7    # -0.28f

    .line 652
    .line 653
    .line 654
    const v14, -0x4147ae14    # -0.36f

    .line 655
    .line 656
    .line 657
    const v15, -0x40b0a3d7    # -0.81f

    .line 658
    .line 659
    .line 660
    const v16, -0x413851ec    # -0.39f

    .line 661
    .line 662
    .line 663
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 664
    .line 665
    .line 666
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 667
    .line 668
    .line 669
    const v17, -0x4270a3d7    # -0.07f

    .line 670
    .line 671
    .line 672
    const v18, 0x3f7ae148    # 0.98f

    .line 673
    .line 674
    .line 675
    const v13, -0x417ae148    # -0.26f

    .line 676
    .line 677
    .line 678
    const v14, 0x3e851eb8    # 0.26f

    .line 679
    .line 680
    .line 681
    const v15, -0x41666666    # -0.3f

    .line 682
    .line 683
    .line 684
    const v16, 0x3f2e147b    # 0.68f

    .line 685
    .line 686
    .line 687
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 688
    .line 689
    .line 690
    const/high16 v17, 0x418c0000    # 17.5f

    .line 691
    .line 692
    const/high16 v18, 0x41400000    # 12.0f

    .line 693
    .line 694
    const v13, 0x41887ae1    # 17.06f

    .line 695
    .line 696
    .line 697
    const v14, 0x41187ae1    # 9.53f

    .line 698
    .line 699
    .line 700
    const/high16 v15, 0x418c0000    # 17.5f

    .line 701
    .line 702
    const v16, 0x412b851f    # 10.72f

    .line 703
    .line 704
    .line 705
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 706
    .line 707
    .line 708
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 709
    .line 710
    .line 711
    const v0, 0x41830a3d    # 16.38f

    .line 712
    .line 713
    .line 714
    const v2, 0x40f3d70a    # 7.62f

    .line 715
    .line 716
    .line 717
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 718
    .line 719
    .line 720
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 721
    .line 722
    .line 723
    const v17, 0x3d8f5c29    # 0.07f

    .line 724
    .line 725
    .line 726
    const v18, -0x40851eb8    # -0.98f

    .line 727
    .line 728
    .line 729
    const v13, 0x3e851eb8    # 0.26f

    .line 730
    .line 731
    .line 732
    const v14, -0x417ae148    # -0.26f

    .line 733
    .line 734
    .line 735
    const v15, 0x3e99999a    # 0.3f

    .line 736
    .line 737
    .line 738
    const v16, -0x40d1eb85    # -0.68f

    .line 739
    .line 740
    .line 741
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 742
    .line 743
    .line 744
    const/high16 v17, 0x40d00000    # 6.5f

    .line 745
    .line 746
    const/high16 v18, 0x41400000    # 12.0f

    .line 747
    .line 748
    const v13, 0x40de147b    # 6.94f

    .line 749
    .line 750
    .line 751
    const v14, 0x4167851f    # 14.47f

    .line 752
    .line 753
    .line 754
    const/high16 v15, 0x40d00000    # 6.5f

    .line 755
    .line 756
    const v16, 0x41547ae1    # 13.28f

    .line 757
    .line 758
    .line 759
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 760
    .line 761
    .line 762
    const v17, 0x3f970a3d    # 1.18f

    .line 763
    .line 764
    .line 765
    const v18, -0x3fa5c28f    # -3.41f

    .line 766
    .line 767
    .line 768
    const/4 v13, 0x0

    .line 769
    const v14, -0x405c28f6    # -1.28f

    .line 770
    .line 771
    .line 772
    const v15, 0x3ee147ae    # 0.44f

    .line 773
    .line 774
    .line 775
    const v16, -0x3fe1eb85    # -2.47f

    .line 776
    .line 777
    .line 778
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 779
    .line 780
    .line 781
    const v17, -0x4270a3d7    # -0.07f

    .line 782
    .line 783
    .line 784
    const v18, -0x40851eb8    # -0.98f

    .line 785
    .line 786
    .line 787
    const v13, 0x3e6b851f    # 0.23f

    .line 788
    .line 789
    .line 790
    const v14, -0x416b851f    # -0.29f

    .line 791
    .line 792
    .line 793
    const v15, 0x3e4ccccd    # 0.2f

    .line 794
    .line 795
    .line 796
    const v16, -0x40ca3d71    # -0.71f

    .line 797
    .line 798
    .line 799
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 800
    .line 801
    .line 802
    const/4 v0, 0x0

    .line 803
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 804
    .line 805
    .line 806
    const v17, 0x40cfae14    # 6.49f

    .line 807
    .line 808
    .line 809
    const v18, 0x40f5c28f    # 7.68f

    .line 810
    .line 811
    .line 812
    const v13, 0x40e9999a    # 7.3f

    .line 813
    .line 814
    .line 815
    const v14, 0x40e9999a    # 7.3f

    .line 816
    .line 817
    .line 818
    const v15, 0x40d8a3d7    # 6.77f

    .line 819
    .line 820
    .line 821
    const v16, 0x40ea8f5c    # 7.33f

    .line 822
    .line 823
    .line 824
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 825
    .line 826
    .line 827
    const/high16 v17, 0x40a00000    # 5.0f

    .line 828
    .line 829
    const/high16 v18, 0x41400000    # 12.0f

    .line 830
    .line 831
    const v13, 0x40b1eb85    # 5.56f

    .line 832
    .line 833
    .line 834
    const v14, 0x410deb85    # 8.87f

    .line 835
    .line 836
    .line 837
    const/high16 v15, 0x40a00000    # 5.0f

    .line 838
    .line 839
    const v16, 0x4125eb85    # 10.37f

    .line 840
    .line 841
    .line 842
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 843
    .line 844
    .line 845
    const v17, 0x3fbeb852    # 1.49f

    .line 846
    .line 847
    .line 848
    const v18, 0x408a3d71    # 4.32f

    .line 849
    .line 850
    .line 851
    const/4 v13, 0x0

    .line 852
    const v14, 0x3fd0a3d7    # 1.63f

    .line 853
    .line 854
    .line 855
    const v15, 0x3f0f5c29    # 0.56f

    .line 856
    .line 857
    .line 858
    const v16, 0x404851ec    # 3.13f

    .line 859
    .line 860
    .line 861
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 862
    .line 863
    .line 864
    const v17, 0x40f3d70a    # 7.62f

    .line 865
    .line 866
    .line 867
    const v18, 0x41830a3d    # 16.38f

    .line 868
    .line 869
    .line 870
    const v13, 0x40d8a3d7    # 6.77f

    .line 871
    .line 872
    .line 873
    const v14, 0x41855c29    # 16.67f

    .line 874
    .line 875
    .line 876
    const v15, 0x40e9999a    # 7.3f

    .line 877
    .line 878
    .line 879
    const v16, 0x4185999a    # 16.7f

    .line 880
    .line 881
    .line 882
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 883
    .line 884
    .line 885
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 886
    .line 887
    .line 888
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 889
    .line 890
    .line 891
    move-result-object v2

    .line 892
    const/16 v16, 0x3800

    .line 893
    .line 894
    const/16 v17, 0x0

    .line 895
    .line 896
    const/high16 v6, 0x3f800000    # 1.0f

    .line 897
    .line 898
    const/high16 v8, 0x3f800000    # 1.0f

    .line 899
    .line 900
    const/4 v7, 0x0

    .line 901
    const/high16 v9, 0x3f800000    # 1.0f

    .line 902
    .line 903
    const/high16 v12, 0x3f800000    # 1.0f

    .line 904
    .line 905
    const/4 v13, 0x0

    .line 906
    const/4 v14, 0x0

    .line 907
    const/4 v15, 0x0

    .line 908
    const-string v4, ""

    .line 909
    .line 910
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 911
    .line 912
    .line 913
    move-result-object v0

    .line 914
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 915
    .line 916
    .line 917
    move-result-object v0

    .line 918
    sput-object v0, Landroidx/compose/material/icons/rounded/OnlinePredictionKt;->_onlinePrediction:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 919
    .line 920
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 921
    .line 922
    .line 923
    return-object v0
.end method
