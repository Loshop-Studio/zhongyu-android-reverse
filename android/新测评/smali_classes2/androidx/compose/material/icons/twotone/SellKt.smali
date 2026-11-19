.class public final Landroidx/compose/material/icons/twotone/SellKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_sell",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "Sell",
        "Landroidx/compose/material/icons/Icons$TwoTone;",
        "getSell",
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
        "SMAP\nSell.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sell.kt\nandroidx/compose/material/icons/twotone/SellKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,77:1\n212#2,12:78\n233#2,18:91\n253#2:128\n233#2,18:129\n253#2:166\n233#2,18:167\n253#2:204\n174#3:90\n705#4,2:109\n717#4,2:111\n719#4,11:117\n705#4,2:147\n717#4,2:149\n719#4,11:155\n705#4,2:185\n717#4,2:187\n719#4,11:193\n72#5,4:113\n72#5,4:151\n72#5,4:189\n*S KotlinDebug\n*F\n+ 1 Sell.kt\nandroidx/compose/material/icons/twotone/SellKt\n*L\n29#1:78,12\n30#1:91,18\n30#1:128\n45#1:129,18\n45#1:166\n66#1:167,18\n66#1:204\n29#1:90\n30#1:109,2\n30#1:111,2\n30#1:117,11\n45#1:147,2\n45#1:149,2\n45#1:155,11\n66#1:185,2\n66#1:187,2\n66#1:193,11\n30#1:113,4\n45#1:151,4\n66#1:189,4\n*E\n"
    }
.end annotation


# static fields
.field private static _sell:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getSell(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/SellKt;->_sell:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.Sell"

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
    const/high16 v4, 0x40800000    # 4.0f

    .line 71
    .line 72
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 73
    .line 74
    .line 75
    const v4, 0x40e570a4    # 7.17f

    .line 76
    .line 77
    .line 78
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 79
    .line 80
    .line 81
    const/high16 v4, 0x41a00000    # 20.0f

    .line 82
    .line 83
    const v6, 0x414d47ae    # 12.83f

    .line 84
    .line 85
    .line 86
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 87
    .line 88
    .line 89
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 90
    .line 91
    .line 92
    const v4, 0x4132b852    # 11.17f

    .line 93
    .line 94
    .line 95
    const/high16 v6, 0x40800000    # 4.0f

    .line 96
    .line 97
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 98
    .line 99
    .line 100
    const/high16 v4, 0x40800000    # 4.0f

    .line 101
    .line 102
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 103
    .line 104
    .line 105
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 106
    .line 107
    .line 108
    const/high16 v4, 0x41000000    # 8.0f

    .line 109
    .line 110
    const/high16 v6, 0x40d00000    # 6.5f

    .line 111
    .line 112
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 113
    .line 114
    .line 115
    const/high16 v25, 0x40a00000    # 5.0f

    .line 116
    .line 117
    const/high16 v26, 0x40d00000    # 6.5f

    .line 118
    .line 119
    const v21, 0x40b570a4    # 5.67f

    .line 120
    .line 121
    .line 122
    const/high16 v22, 0x41000000    # 8.0f

    .line 123
    .line 124
    const/high16 v23, 0x40a00000    # 5.0f

    .line 125
    .line 126
    const v24, 0x40ea8f5c    # 7.33f

    .line 127
    .line 128
    .line 129
    move-object/from16 v20, v2

    .line 130
    .line 131
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 132
    .line 133
    .line 134
    const/high16 v4, 0x40a00000    # 5.0f

    .line 135
    .line 136
    const v6, 0x40b570a4    # 5.67f

    .line 137
    .line 138
    .line 139
    const/high16 v7, 0x40d00000    # 6.5f

    .line 140
    .line 141
    invoke-virtual {v2, v6, v4, v7, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 142
    .line 143
    .line 144
    const v4, 0x40b570a4    # 5.67f

    .line 145
    .line 146
    .line 147
    const/high16 v6, 0x41000000    # 8.0f

    .line 148
    .line 149
    invoke-virtual {v2, v6, v4, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 150
    .line 151
    .line 152
    const v4, 0x40ea8f5c    # 7.33f

    .line 153
    .line 154
    .line 155
    invoke-virtual {v2, v4, v6, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 156
    .line 157
    .line 158
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 159
    .line 160
    .line 161
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 162
    .line 163
    .line 164
    move-result-object v2

    .line 165
    const/16 v16, 0x3800

    .line 166
    .line 167
    const/16 v17, 0x0

    .line 168
    .line 169
    const v6, 0x3e99999a    # 0.3f

    .line 170
    .line 171
    .line 172
    const v8, 0x3e99999a    # 0.3f

    .line 173
    .line 174
    .line 175
    const/4 v7, 0x0

    .line 176
    const/high16 v9, 0x3f800000    # 1.0f

    .line 177
    .line 178
    const/high16 v12, 0x3f800000    # 1.0f

    .line 179
    .line 180
    const/4 v13, 0x0

    .line 181
    const/4 v14, 0x0

    .line 182
    const/4 v15, 0x0

    .line 183
    const-string v4, ""

    .line 184
    .line 185
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 186
    .line 187
    .line 188
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 189
    .line 190
    .line 191
    move-result v3

    .line 192
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 193
    .line 194
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 195
    .line 196
    .line 197
    move-result-wide v6

    .line 198
    const/4 v2, 0x0

    .line 199
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 200
    .line 201
    .line 202
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 203
    .line 204
    .line 205
    move-result v10

    .line 206
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 207
    .line 208
    .line 209
    move-result v11

    .line 210
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 211
    .line 212
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 213
    .line 214
    .line 215
    const v4, 0x41ab47ae    # 21.41f

    .line 216
    .line 217
    .line 218
    const v6, 0x41368f5c    # 11.41f

    .line 219
    .line 220
    .line 221
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 222
    .line 223
    .line 224
    const v4, -0x3ef2b852    # -8.83f

    .line 225
    .line 226
    .line 227
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 228
    .line 229
    .line 230
    const v25, 0x4132b852    # 11.17f

    .line 231
    .line 232
    .line 233
    const/high16 v26, 0x40000000    # 2.0f

    .line 234
    .line 235
    const v21, 0x41435c29    # 12.21f

    .line 236
    .line 237
    .line 238
    const v22, 0x400d70a4    # 2.21f

    .line 239
    .line 240
    .line 241
    const v23, 0x413b3333    # 11.7f

    .line 242
    .line 243
    .line 244
    const/high16 v24, 0x40000000    # 2.0f

    .line 245
    .line 246
    move-object/from16 v20, v2

    .line 247
    .line 248
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 249
    .line 250
    .line 251
    const/high16 v4, 0x40800000    # 4.0f

    .line 252
    .line 253
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 254
    .line 255
    .line 256
    const/high16 v25, 0x40000000    # 2.0f

    .line 257
    .line 258
    const/high16 v26, 0x40800000    # 4.0f

    .line 259
    .line 260
    const v21, 0x4039999a    # 2.9f

    .line 261
    .line 262
    .line 263
    const/high16 v22, 0x40000000    # 2.0f

    .line 264
    .line 265
    const/high16 v23, 0x40000000    # 2.0f

    .line 266
    .line 267
    const v24, 0x4039999a    # 2.9f

    .line 268
    .line 269
    .line 270
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 271
    .line 272
    .line 273
    const v4, 0x40e570a4    # 7.17f

    .line 274
    .line 275
    .line 276
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 277
    .line 278
    .line 279
    const v25, 0x3f170a3d    # 0.59f

    .line 280
    .line 281
    .line 282
    const v26, 0x3fb47ae1    # 1.41f

    .line 283
    .line 284
    .line 285
    const/16 v21, 0x0

    .line 286
    .line 287
    const v22, 0x3f07ae14    # 0.53f

    .line 288
    .line 289
    .line 290
    const v23, 0x3e570a3d    # 0.21f

    .line 291
    .line 292
    .line 293
    const v24, 0x3f851eb8    # 1.04f

    .line 294
    .line 295
    .line 296
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 297
    .line 298
    .line 299
    const v4, 0x410d47ae    # 8.83f

    .line 300
    .line 301
    .line 302
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 303
    .line 304
    .line 305
    const v25, 0x40351eb8    # 2.83f

    .line 306
    .line 307
    .line 308
    const/16 v26, 0x0

    .line 309
    .line 310
    const v21, 0x3f47ae14    # 0.78f

    .line 311
    .line 312
    .line 313
    const v22, 0x3f47ae14    # 0.78f

    .line 314
    .line 315
    .line 316
    const v23, 0x40033333    # 2.05f

    .line 317
    .line 318
    .line 319
    const v24, 0x3f47ae14    # 0.78f

    .line 320
    .line 321
    .line 322
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 323
    .line 324
    .line 325
    const v4, -0x3f1a8f5c    # -7.17f

    .line 326
    .line 327
    .line 328
    const v6, 0x40e570a4    # 7.17f

    .line 329
    .line 330
    .line 331
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 332
    .line 333
    .line 334
    const v25, 0x41ab47ae    # 21.41f

    .line 335
    .line 336
    .line 337
    const v26, 0x41368f5c    # 11.41f

    .line 338
    .line 339
    .line 340
    const v21, 0x41b1999a    # 22.2f

    .line 341
    .line 342
    .line 343
    const v22, 0x41575c29    # 13.46f

    .line 344
    .line 345
    .line 346
    const v23, 0x41b1999a    # 22.2f

    .line 347
    .line 348
    .line 349
    const v24, 0x41433333    # 12.2f

    .line 350
    .line 351
    .line 352
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 353
    .line 354
    .line 355
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 356
    .line 357
    .line 358
    const/high16 v4, 0x41a00000    # 20.0f

    .line 359
    .line 360
    const v6, 0x414d47ae    # 12.83f

    .line 361
    .line 362
    .line 363
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 364
    .line 365
    .line 366
    const v4, 0x4132b852    # 11.17f

    .line 367
    .line 368
    .line 369
    const/high16 v6, 0x40800000    # 4.0f

    .line 370
    .line 371
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 372
    .line 373
    .line 374
    const/high16 v4, 0x40800000    # 4.0f

    .line 375
    .line 376
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 377
    .line 378
    .line 379
    const v4, 0x40e570a4    # 7.17f

    .line 380
    .line 381
    .line 382
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 383
    .line 384
    .line 385
    const/high16 v4, 0x41a00000    # 20.0f

    .line 386
    .line 387
    const v6, 0x414d47ae    # 12.83f

    .line 388
    .line 389
    .line 390
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 391
    .line 392
    .line 393
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 394
    .line 395
    .line 396
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 397
    .line 398
    .line 399
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 400
    .line 401
    .line 402
    move-result-object v2

    .line 403
    const/high16 v6, 0x3f800000    # 1.0f

    .line 404
    .line 405
    const/high16 v8, 0x3f800000    # 1.0f

    .line 406
    .line 407
    const/4 v7, 0x0

    .line 408
    const-string v4, ""

    .line 409
    .line 410
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 411
    .line 412
    .line 413
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 414
    .line 415
    .line 416
    move-result v3

    .line 417
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 418
    .line 419
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 420
    .line 421
    .line 422
    move-result-wide v6

    .line 423
    const/4 v0, 0x0

    .line 424
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 425
    .line 426
    .line 427
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 428
    .line 429
    .line 430
    move-result v10

    .line 431
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 432
    .line 433
    .line 434
    move-result v11

    .line 435
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 436
    .line 437
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 438
    .line 439
    .line 440
    const/high16 v0, 0x40d00000    # 6.5f

    .line 441
    .line 442
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 443
    .line 444
    .line 445
    const/high16 v0, -0x40400000    # -1.5f

    .line 446
    .line 447
    const/4 v2, 0x0

    .line 448
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 449
    .line 450
    .line 451
    const/high16 v18, 0x40400000    # 3.0f

    .line 452
    .line 453
    const/16 v19, 0x0

    .line 454
    .line 455
    const/high16 v13, 0x3fc00000    # 1.5f

    .line 456
    .line 457
    const/high16 v14, 0x3fc00000    # 1.5f

    .line 458
    .line 459
    const/16 v16, 0x1

    .line 460
    .line 461
    const/16 v17, 0x1

    .line 462
    .line 463
    invoke-virtual/range {v12 .. v19}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 464
    .line 465
    .line 466
    const/high16 v18, -0x3fc00000    # -3.0f

    .line 467
    .line 468
    invoke-virtual/range {v12 .. v19}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 469
    .line 470
    .line 471
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 472
    .line 473
    .line 474
    move-result-object v2

    .line 475
    const/16 v16, 0x3800

    .line 476
    .line 477
    const/16 v17, 0x0

    .line 478
    .line 479
    const/high16 v6, 0x3f800000    # 1.0f

    .line 480
    .line 481
    const/4 v7, 0x0

    .line 482
    const/high16 v12, 0x3f800000    # 1.0f

    .line 483
    .line 484
    const/4 v13, 0x0

    .line 485
    const/4 v14, 0x0

    .line 486
    const-string v4, ""

    .line 487
    .line 488
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 489
    .line 490
    .line 491
    move-result-object v0

    .line 492
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 493
    .line 494
    .line 495
    move-result-object v0

    .line 496
    sput-object v0, Landroidx/compose/material/icons/twotone/SellKt;->_sell:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 497
    .line 498
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 499
    .line 500
    .line 501
    return-object v0
.end method
