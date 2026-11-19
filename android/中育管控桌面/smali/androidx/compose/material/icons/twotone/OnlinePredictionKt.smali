.class public final Landroidx/compose/material/icons/twotone/OnlinePredictionKt;
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
        "Landroidx/compose/material/icons/Icons$TwoTone;",
        "getOnlinePrediction",
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
        "SMAP\nOnlinePrediction.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OnlinePrediction.kt\nandroidx/compose/material/icons/twotone/OnlinePredictionKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,82:1\n212#2,12:83\n233#2,18:96\n253#2:133\n174#3:95\n705#4,2:114\n717#4,2:116\n719#4,11:122\n72#5,4:118\n*S KotlinDebug\n*F\n+ 1 OnlinePrediction.kt\nandroidx/compose/material/icons/twotone/OnlinePredictionKt\n*L\n29#1:83,12\n30#1:96,18\n30#1:133\n29#1:95\n30#1:114,2\n30#1:116,2\n30#1:122,11\n30#1:118,4\n*E\n"
    }
.end annotation


# static fields
.field private static _onlinePrediction:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getOnlinePrediction(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/OnlinePredictionKt;->_onlinePrediction:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.OnlinePrediction"

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
    const/high16 v0, 0x41980000    # 19.0f

    .line 148
    .line 149
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 150
    .line 151
    .line 152
    const/high16 v0, 0x40000000    # 2.0f

    .line 153
    .line 154
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 155
    .line 156
    .line 157
    const/high16 v0, 0x418c0000    # 17.5f

    .line 158
    .line 159
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 160
    .line 161
    .line 162
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 163
    .line 164
    .line 165
    const/high16 v0, 0x41b00000    # 22.0f

    .line 166
    .line 167
    const/high16 v2, 0x41400000    # 12.0f

    .line 168
    .line 169
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 170
    .line 171
    .line 172
    const v17, -0x3fc47ae1    # -2.93f

    .line 173
    .line 174
    .line 175
    const v18, -0x3f1dc28f    # -7.07f

    .line 176
    .line 177
    .line 178
    const/4 v13, 0x0

    .line 179
    const v14, -0x3fcf5c29    # -2.76f

    .line 180
    .line 181
    .line 182
    const v15, -0x4070a3d7    # -1.12f

    .line 183
    .line 184
    .line 185
    const v16, -0x3f57ae14    # -5.26f

    .line 186
    .line 187
    .line 188
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 189
    .line 190
    .line 191
    const v0, -0x407851ec    # -1.06f

    .line 192
    .line 193
    .line 194
    const v2, 0x3f87ae14    # 1.06f

    .line 195
    .line 196
    .line 197
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 198
    .line 199
    .line 200
    const/high16 v17, 0x41a40000    # 20.5f

    .line 201
    .line 202
    const/high16 v18, 0x41400000    # 12.0f

    .line 203
    .line 204
    const v13, 0x419c6666    # 19.55f

    .line 205
    .line 206
    .line 207
    const v14, 0x40f0f5c3    # 7.53f

    .line 208
    .line 209
    .line 210
    const/high16 v15, 0x41a40000    # 20.5f

    .line 211
    .line 212
    const v16, 0x411a8f5c    # 9.66f

    .line 213
    .line 214
    .line 215
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 216
    .line 217
    .line 218
    const v17, -0x3fe0a3d7    # -2.49f

    .line 219
    .line 220
    .line 221
    const v18, 0x40c051ec    # 6.01f

    .line 222
    .line 223
    .line 224
    const/4 v13, 0x0

    .line 225
    const v14, 0x4015c28f    # 2.34f

    .line 226
    .line 227
    .line 228
    const v15, -0x408ccccd    # -0.95f

    .line 229
    .line 230
    .line 231
    const v16, 0x408f0a3d    # 4.47f

    .line 232
    .line 233
    .line 234
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 235
    .line 236
    .line 237
    const v0, 0x3f87ae14    # 1.06f

    .line 238
    .line 239
    .line 240
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 241
    .line 242
    .line 243
    const/high16 v17, 0x41b00000    # 22.0f

    .line 244
    .line 245
    const/high16 v18, 0x41400000    # 12.0f

    .line 246
    .line 247
    const v13, 0x41a70a3d    # 20.88f

    .line 248
    .line 249
    .line 250
    const v14, 0x418a147b    # 17.26f

    .line 251
    .line 252
    .line 253
    const/high16 v15, 0x41b00000    # 22.0f

    .line 254
    .line 255
    const v16, 0x416c28f6    # 14.76f

    .line 256
    .line 257
    .line 258
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 259
    .line 260
    .line 261
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 262
    .line 263
    .line 264
    const/high16 v0, 0x40600000    # 3.5f

    .line 265
    .line 266
    const/high16 v2, 0x41400000    # 12.0f

    .line 267
    .line 268
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 269
    .line 270
    .line 271
    const v17, 0x401f5c29    # 2.49f

    .line 272
    .line 273
    .line 274
    const v18, -0x3f3fae14    # -6.01f

    .line 275
    .line 276
    .line 277
    const/4 v13, 0x0

    .line 278
    const v14, -0x3fea3d71    # -2.34f

    .line 279
    .line 280
    .line 281
    const v15, 0x3f733333    # 0.95f

    .line 282
    .line 283
    .line 284
    const v16, -0x3f70f5c3    # -4.47f

    .line 285
    .line 286
    .line 287
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 288
    .line 289
    .line 290
    const v0, 0x409dc28f    # 4.93f

    .line 291
    .line 292
    .line 293
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 294
    .line 295
    .line 296
    const/high16 v17, 0x40000000    # 2.0f

    .line 297
    .line 298
    const/high16 v18, 0x41400000    # 12.0f

    .line 299
    .line 300
    const v13, 0x4047ae14    # 3.12f

    .line 301
    .line 302
    .line 303
    const v14, 0x40d7ae14    # 6.74f

    .line 304
    .line 305
    .line 306
    const/high16 v15, 0x40000000    # 2.0f

    .line 307
    .line 308
    const v16, 0x4113d70a    # 9.24f

    .line 309
    .line 310
    .line 311
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 312
    .line 313
    .line 314
    const v17, 0x403b851f    # 2.93f

    .line 315
    .line 316
    .line 317
    const v18, 0x40e23d71    # 7.07f

    .line 318
    .line 319
    .line 320
    const/4 v13, 0x0

    .line 321
    const v14, 0x4030a3d7    # 2.76f

    .line 322
    .line 323
    .line 324
    const v15, 0x3f8f5c29    # 1.12f

    .line 325
    .line 326
    .line 327
    const v16, 0x40a851ec    # 5.26f

    .line 328
    .line 329
    .line 330
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 331
    .line 332
    .line 333
    const v0, -0x407851ec    # -1.06f

    .line 334
    .line 335
    .line 336
    const v2, 0x3f87ae14    # 1.06f

    .line 337
    .line 338
    .line 339
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 340
    .line 341
    .line 342
    const/high16 v17, 0x40600000    # 3.5f

    .line 343
    .line 344
    const/high16 v18, 0x41400000    # 12.0f

    .line 345
    .line 346
    const v13, 0x408e6666    # 4.45f

    .line 347
    .line 348
    .line 349
    const v14, 0x4183c28f    # 16.47f

    .line 350
    .line 351
    .line 352
    const/high16 v15, 0x40600000    # 3.5f

    .line 353
    .line 354
    const v16, 0x416570a4    # 14.34f

    .line 355
    .line 356
    .line 357
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 358
    .line 359
    .line 360
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 361
    .line 362
    .line 363
    const/high16 v0, 0x41400000    # 12.0f

    .line 364
    .line 365
    const/high16 v2, 0x418c0000    # 17.5f

    .line 366
    .line 367
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 368
    .line 369
    .line 370
    const v17, -0x4031eb85    # -1.61f

    .line 371
    .line 372
    .line 373
    const v18, 0x4078f5c3    # 3.89f

    .line 374
    .line 375
    .line 376
    const/4 v13, 0x0

    .line 377
    const v14, 0x3fc28f5c    # 1.52f

    .line 378
    .line 379
    .line 380
    const v15, -0x40e147ae    # -0.62f

    .line 381
    .line 382
    .line 383
    const v16, 0x4038f5c3    # 2.89f

    .line 384
    .line 385
    .line 386
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 387
    .line 388
    .line 389
    const v0, 0x3f87ae14    # 1.06f

    .line 390
    .line 391
    .line 392
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 393
    .line 394
    .line 395
    const/high16 v17, 0x41980000    # 19.0f

    .line 396
    .line 397
    const/high16 v18, 0x41400000    # 12.0f

    .line 398
    .line 399
    const v13, 0x4191c28f    # 18.22f

    .line 400
    .line 401
    .line 402
    const v14, 0x417ae148    # 15.68f

    .line 403
    .line 404
    .line 405
    const/high16 v15, 0x41980000    # 19.0f

    .line 406
    .line 407
    const v16, 0x415ee148    # 13.93f

    .line 408
    .line 409
    .line 410
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 411
    .line 412
    .line 413
    const v17, -0x3ffccccd    # -2.05f

    .line 414
    .line 415
    .line 416
    const v18, -0x3f61999a    # -4.95f

    .line 417
    .line 418
    .line 419
    const/4 v13, 0x0

    .line 420
    const v14, -0x4008f5c3    # -1.93f

    .line 421
    .line 422
    .line 423
    const v15, -0x40b851ec    # -0.78f

    .line 424
    .line 425
    .line 426
    const v16, -0x3f947ae1    # -3.68f

    .line 427
    .line 428
    .line 429
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 430
    .line 431
    .line 432
    const v0, -0x407851ec    # -1.06f

    .line 433
    .line 434
    .line 435
    const v2, 0x3f87ae14    # 1.06f

    .line 436
    .line 437
    .line 438
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 439
    .line 440
    .line 441
    const/high16 v17, 0x418c0000    # 17.5f

    .line 442
    .line 443
    const/high16 v18, 0x41400000    # 12.0f

    .line 444
    .line 445
    const v13, 0x41870a3d    # 16.88f

    .line 446
    .line 447
    .line 448
    const v14, 0x4111c28f    # 9.11f

    .line 449
    .line 450
    .line 451
    const/high16 v15, 0x418c0000    # 17.5f

    .line 452
    .line 453
    const v16, 0x4127ae14    # 10.48f

    .line 454
    .line 455
    .line 456
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 457
    .line 458
    .line 459
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 460
    .line 461
    .line 462
    const v0, 0x4187999a    # 16.95f

    .line 463
    .line 464
    .line 465
    const v2, 0x40e1999a    # 7.05f

    .line 466
    .line 467
    .line 468
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 469
    .line 470
    .line 471
    const v0, -0x407851ec    # -1.06f

    .line 472
    .line 473
    .line 474
    const v2, 0x3f87ae14    # 1.06f

    .line 475
    .line 476
    .line 477
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 478
    .line 479
    .line 480
    const v17, -0x4031eb85    # -1.61f

    .line 481
    .line 482
    .line 483
    const v18, -0x3f870a3d    # -3.89f

    .line 484
    .line 485
    .line 486
    const/high16 v13, -0x40800000    # -1.0f

    .line 487
    .line 488
    const/high16 v14, -0x40800000    # -1.0f

    .line 489
    .line 490
    const v15, -0x4031eb85    # -1.61f

    .line 491
    .line 492
    .line 493
    const v16, -0x3fe851ec    # -2.37f

    .line 494
    .line 495
    .line 496
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 497
    .line 498
    .line 499
    const v17, 0x3fce147b    # 1.61f

    .line 500
    .line 501
    .line 502
    const/4 v13, 0x0

    .line 503
    const v14, -0x403d70a4    # -1.52f

    .line 504
    .line 505
    .line 506
    const v15, 0x3f1eb852    # 0.62f

    .line 507
    .line 508
    .line 509
    const v16, -0x3fc70a3d    # -2.89f

    .line 510
    .line 511
    .line 512
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 513
    .line 514
    .line 515
    const v0, 0x40e1999a    # 7.05f

    .line 516
    .line 517
    .line 518
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 519
    .line 520
    .line 521
    const/high16 v17, 0x40a00000    # 5.0f

    .line 522
    .line 523
    const/high16 v18, 0x41400000    # 12.0f

    .line 524
    .line 525
    const v13, 0x40b8f5c3    # 5.78f

    .line 526
    .line 527
    .line 528
    const v14, 0x41051eb8    # 8.32f

    .line 529
    .line 530
    .line 531
    const/high16 v15, 0x40a00000    # 5.0f

    .line 532
    .line 533
    const v16, 0x41211eb8    # 10.07f

    .line 534
    .line 535
    .line 536
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 537
    .line 538
    .line 539
    const v17, 0x40e1999a    # 7.05f

    .line 540
    .line 541
    .line 542
    const v18, 0x4187999a    # 16.95f

    .line 543
    .line 544
    .line 545
    const/high16 v13, 0x40a00000    # 5.0f

    .line 546
    .line 547
    const v14, 0x415ee148    # 13.93f

    .line 548
    .line 549
    .line 550
    const v15, 0x40b8f5c3    # 5.78f

    .line 551
    .line 552
    .line 553
    const v16, 0x417ae148    # 15.68f

    .line 554
    .line 555
    .line 556
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 557
    .line 558
    .line 559
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 560
    .line 561
    .line 562
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 563
    .line 564
    .line 565
    move-result-object v2

    .line 566
    const/16 v16, 0x3800

    .line 567
    .line 568
    const/16 v17, 0x0

    .line 569
    .line 570
    const/high16 v6, 0x3f800000    # 1.0f

    .line 571
    .line 572
    const/high16 v8, 0x3f800000    # 1.0f

    .line 573
    .line 574
    const/4 v7, 0x0

    .line 575
    const/high16 v9, 0x3f800000    # 1.0f

    .line 576
    .line 577
    const/high16 v12, 0x3f800000    # 1.0f

    .line 578
    .line 579
    const/4 v13, 0x0

    .line 580
    const/4 v14, 0x0

    .line 581
    const/4 v15, 0x0

    .line 582
    const-string v4, ""

    .line 583
    .line 584
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 585
    .line 586
    .line 587
    move-result-object v0

    .line 588
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 589
    .line 590
    .line 591
    move-result-object v0

    .line 592
    sput-object v0, Landroidx/compose/material/icons/twotone/OnlinePredictionKt;->_onlinePrediction:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 593
    .line 594
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 595
    .line 596
    .line 597
    return-object v0
.end method
