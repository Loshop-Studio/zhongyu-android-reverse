.class public final Landroidx/compose/material/icons/rounded/AgricultureKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_agriculture",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "Agriculture",
        "Landroidx/compose/material/icons/Icons$Rounded;",
        "getAgriculture",
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
        "SMAP\nAgriculture.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Agriculture.kt\nandroidx/compose/material/icons/rounded/AgricultureKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,129:1\n212#2,12:130\n233#2,18:143\n253#2:180\n233#2,18:181\n253#2:218\n233#2,18:219\n253#2:256\n233#2,18:257\n253#2:294\n174#3:142\n705#4,2:161\n717#4,2:163\n719#4,11:169\n705#4,2:199\n717#4,2:201\n719#4,11:207\n705#4,2:237\n717#4,2:239\n719#4,11:245\n705#4,2:275\n717#4,2:277\n719#4,11:283\n72#5,4:165\n72#5,4:203\n72#5,4:241\n72#5,4:279\n*S KotlinDebug\n*F\n+ 1 Agriculture.kt\nandroidx/compose/material/icons/rounded/AgricultureKt\n*L\n29#1:130,12\n30#1:143,18\n30#1:180\n55#1:181,18\n55#1:218\n69#1:219,18\n69#1:256\n78#1:257,18\n78#1:294\n29#1:142\n30#1:161,2\n30#1:163,2\n30#1:169,11\n55#1:199,2\n55#1:201,2\n55#1:207,11\n69#1:237,2\n69#1:239,2\n69#1:245,11\n78#1:275,2\n78#1:277,2\n78#1:283,11\n30#1:165,4\n55#1:203,4\n69#1:241,4\n78#1:279,4\n*E\n"
    }
.end annotation


# static fields
.field private static _agriculture:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getAgriculture(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/AgricultureKt;->_agriculture:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.Agriculture"

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
    const v4, 0x413f851f    # 11.97f

    .line 71
    .line 72
    .line 73
    const/high16 v6, 0x419c0000    # 19.5f

    .line 74
    .line 75
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    const/high16 v25, 0x40200000    # 2.5f

    .line 79
    .line 80
    const v26, 0x3f428f5c    # 0.76f

    .line 81
    .line 82
    .line 83
    const v21, 0x3f6e147b    # 0.93f

    .line 84
    .line 85
    .line 86
    const/16 v22, 0x0

    .line 87
    .line 88
    const v23, 0x3fe3d70a    # 1.78f

    .line 89
    .line 90
    .line 91
    const v24, 0x3e8f5c29    # 0.28f

    .line 92
    .line 93
    .line 94
    move-object/from16 v20, v2

    .line 95
    .line 96
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 97
    .line 98
    .line 99
    const v4, 0x40ff0a3d    # 7.97f

    .line 100
    .line 101
    .line 102
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 103
    .line 104
    .line 105
    const/high16 v25, -0x40000000    # -2.0f

    .line 106
    .line 107
    const/high16 v26, -0x40000000    # -2.0f

    .line 108
    .line 109
    const/16 v21, 0x0

    .line 110
    .line 111
    const v22, -0x40733333    # -1.1f

    .line 112
    .line 113
    .line 114
    const v23, -0x4099999a    # -0.9f

    .line 115
    .line 116
    .line 117
    const/high16 v24, -0x40000000    # -2.0f

    .line 118
    .line 119
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 120
    .line 121
    .line 122
    const v4, -0x3f36b852    # -6.29f

    .line 123
    .line 124
    .line 125
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 126
    .line 127
    .line 128
    const v4, -0x407851ec    # -1.06f

    .line 129
    .line 130
    .line 131
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 132
    .line 133
    .line 134
    const v4, 0x3f87ae14    # 1.06f

    .line 135
    .line 136
    .line 137
    const v6, -0x407851ec    # -1.06f

    .line 138
    .line 139
    .line 140
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 141
    .line 142
    .line 143
    const/16 v25, 0x0

    .line 144
    .line 145
    const v26, -0x40ca3d71    # -0.71f

    .line 146
    .line 147
    .line 148
    const v21, 0x3e4ccccd    # 0.2f

    .line 149
    .line 150
    .line 151
    const v22, -0x41b33333    # -0.2f

    .line 152
    .line 153
    .line 154
    const v23, 0x3e4ccccd    # 0.2f

    .line 155
    .line 156
    .line 157
    const v24, -0x40fd70a4    # -0.51f

    .line 158
    .line 159
    .line 160
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 161
    .line 162
    .line 163
    const v4, -0x41b33333    # -0.2f

    .line 164
    .line 165
    .line 166
    const v6, -0x40ca3d71    # -0.71f

    .line 167
    .line 168
    .line 169
    const/4 v7, 0x0

    .line 170
    const v8, -0x40fd70a4    # -0.51f

    .line 171
    .line 172
    .line 173
    invoke-virtual {v2, v8, v4, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 174
    .line 175
    .line 176
    const v4, -0x3fcae148    # -2.83f

    .line 177
    .line 178
    .line 179
    const v6, 0x40351eb8    # 2.83f

    .line 180
    .line 181
    .line 182
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 183
    .line 184
    .line 185
    const v26, 0x3f35c28f    # 0.71f

    .line 186
    .line 187
    .line 188
    const v21, -0x41b33333    # -0.2f

    .line 189
    .line 190
    .line 191
    const v22, 0x3e4ccccd    # 0.2f

    .line 192
    .line 193
    .line 194
    const v23, -0x41b33333    # -0.2f

    .line 195
    .line 196
    .line 197
    const v24, 0x3f028f5c    # 0.51f

    .line 198
    .line 199
    .line 200
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 201
    .line 202
    .line 203
    const/4 v4, 0x0

    .line 204
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 205
    .line 206
    .line 207
    const v25, 0x3f35c28f    # 0.71f

    .line 208
    .line 209
    .line 210
    const/16 v26, 0x0

    .line 211
    .line 212
    const v21, 0x3e4ccccd    # 0.2f

    .line 213
    .line 214
    .line 215
    const v23, 0x3f028f5c    # 0.51f

    .line 216
    .line 217
    .line 218
    const v24, 0x3e4ccccd    # 0.2f

    .line 219
    .line 220
    .line 221
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 222
    .line 223
    .line 224
    const v4, 0x3f87ae14    # 1.06f

    .line 225
    .line 226
    .line 227
    const v6, -0x407851ec    # -1.06f

    .line 228
    .line 229
    .line 230
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 231
    .line 232
    .line 233
    const/high16 v4, 0x41500000    # 13.0f

    .line 234
    .line 235
    const v6, 0x40d5c28f    # 6.68f

    .line 236
    .line 237
    .line 238
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 239
    .line 240
    .line 241
    const v4, 0x40128f5c    # 2.29f

    .line 242
    .line 243
    .line 244
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 245
    .line 246
    .line 247
    const/high16 v25, -0x40000000    # -2.0f

    .line 248
    .line 249
    const/high16 v26, 0x40000000    # 2.0f

    .line 250
    .line 251
    const/16 v21, 0x0

    .line 252
    .line 253
    const v22, 0x3f8ccccd    # 1.1f

    .line 254
    .line 255
    .line 256
    const v23, -0x4099999a    # -0.9f

    .line 257
    .line 258
    .line 259
    const/high16 v24, 0x40000000    # 2.0f

    .line 260
    .line 261
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 262
    .line 263
    .line 264
    const v4, -0x40f5c28f    # -0.54f

    .line 265
    .line 266
    .line 267
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 268
    .line 269
    .line 270
    const v25, 0x3fc51eb8    # 1.54f

    .line 271
    .line 272
    .line 273
    const/high16 v26, 0x40800000    # 4.0f

    .line 274
    .line 275
    const v21, 0x3f733333    # 0.95f

    .line 276
    .line 277
    .line 278
    const v22, 0x3f87ae14    # 1.06f

    .line 279
    .line 280
    .line 281
    const v23, 0x3fc51eb8    # 1.54f

    .line 282
    .line 283
    .line 284
    const v24, 0x401d70a4    # 2.46f

    .line 285
    .line 286
    .line 287
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 288
    .line 289
    .line 290
    const v25, -0x4247ae14    # -0.09f

    .line 291
    .line 292
    .line 293
    const/high16 v26, 0x3f800000    # 1.0f

    .line 294
    .line 295
    const/16 v21, 0x0

    .line 296
    .line 297
    const v22, 0x3eae147b    # 0.34f

    .line 298
    .line 299
    .line 300
    const v23, -0x42dc28f6    # -0.04f

    .line 301
    .line 302
    .line 303
    const v24, 0x3f2b851f    # 0.67f

    .line 304
    .line 305
    .line 306
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 307
    .line 308
    .line 309
    const v4, 0x4048f5c3    # 3.14f

    .line 310
    .line 311
    .line 312
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 313
    .line 314
    .line 315
    const/high16 v25, 0x419c0000    # 19.5f

    .line 316
    .line 317
    const v26, 0x413f851f    # 11.97f

    .line 318
    .line 319
    .line 320
    const v21, 0x4174cccd    # 15.3f

    .line 321
    .line 322
    .line 323
    const v22, 0x415bae14    # 13.73f

    .line 324
    .line 325
    .line 326
    const v23, 0x4189851f    # 17.19f

    .line 327
    .line 328
    .line 329
    const v24, 0x413f851f    # 11.97f

    .line 330
    .line 331
    .line 332
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 333
    .line 334
    .line 335
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 336
    .line 337
    .line 338
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 339
    .line 340
    .line 341
    move-result-object v2

    .line 342
    const/16 v16, 0x3800

    .line 343
    .line 344
    const/16 v17, 0x0

    .line 345
    .line 346
    const/high16 v6, 0x3f800000    # 1.0f

    .line 347
    .line 348
    const/high16 v8, 0x3f800000    # 1.0f

    .line 349
    .line 350
    const/4 v7, 0x0

    .line 351
    const/high16 v9, 0x3f800000    # 1.0f

    .line 352
    .line 353
    const/high16 v12, 0x3f800000    # 1.0f

    .line 354
    .line 355
    const/4 v13, 0x0

    .line 356
    const/4 v14, 0x0

    .line 357
    const/4 v15, 0x0

    .line 358
    const-string v4, ""

    .line 359
    .line 360
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 361
    .line 362
    .line 363
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 364
    .line 365
    .line 366
    move-result v3

    .line 367
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 368
    .line 369
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 370
    .line 371
    .line 372
    move-result-wide v6

    .line 373
    const/4 v2, 0x0

    .line 374
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 375
    .line 376
    .line 377
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 378
    .line 379
    .line 380
    move-result v10

    .line 381
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 382
    .line 383
    .line 384
    move-result v11

    .line 385
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 386
    .line 387
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 388
    .line 389
    .line 390
    const v4, 0x414f851f    # 12.97f

    .line 391
    .line 392
    .line 393
    const/high16 v6, 0x419c0000    # 19.5f

    .line 394
    .line 395
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 396
    .line 397
    .line 398
    const/high16 v25, -0x3fa00000    # -3.5f

    .line 399
    .line 400
    const/high16 v26, 0x40600000    # 3.5f

    .line 401
    .line 402
    const v21, -0x4008f5c3    # -1.93f

    .line 403
    .line 404
    .line 405
    const/16 v22, 0x0

    .line 406
    .line 407
    const/high16 v23, -0x3fa00000    # -3.5f

    .line 408
    .line 409
    const v24, 0x3fc8f5c3    # 1.57f

    .line 410
    .line 411
    .line 412
    move-object/from16 v20, v2

    .line 413
    .line 414
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 415
    .line 416
    .line 417
    const v4, 0x3fc8f5c3    # 1.57f

    .line 418
    .line 419
    .line 420
    const/high16 v6, 0x40600000    # 3.5f

    .line 421
    .line 422
    invoke-virtual {v2, v4, v6, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 423
    .line 424
    .line 425
    const v4, -0x40370a3d    # -1.57f

    .line 426
    .line 427
    .line 428
    const/high16 v6, -0x3fa00000    # -3.5f

    .line 429
    .line 430
    const/high16 v7, 0x40600000    # 3.5f

    .line 431
    .line 432
    invoke-virtual {v2, v7, v4, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 433
    .line 434
    .line 435
    const v4, 0x41ab70a4    # 21.43f

    .line 436
    .line 437
    .line 438
    const v6, 0x414f851f    # 12.97f

    .line 439
    .line 440
    .line 441
    const/high16 v7, 0x419c0000    # 19.5f

    .line 442
    .line 443
    invoke-virtual {v2, v4, v6, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 444
    .line 445
    .line 446
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 447
    .line 448
    .line 449
    const v4, 0x418fc28f    # 17.97f

    .line 450
    .line 451
    .line 452
    const/high16 v6, 0x419c0000    # 19.5f

    .line 453
    .line 454
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 455
    .line 456
    .line 457
    const/high16 v25, -0x40400000    # -1.5f

    .line 458
    .line 459
    const/high16 v26, -0x40400000    # -1.5f

    .line 460
    .line 461
    const v21, -0x40ab851f    # -0.83f

    .line 462
    .line 463
    .line 464
    const/high16 v23, -0x40400000    # -1.5f

    .line 465
    .line 466
    const v24, -0x40d47ae1    # -0.67f

    .line 467
    .line 468
    .line 469
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 470
    .line 471
    .line 472
    const/high16 v4, -0x40400000    # -1.5f

    .line 473
    .line 474
    const v6, 0x3f2b851f    # 0.67f

    .line 475
    .line 476
    .line 477
    const/high16 v7, 0x3fc00000    # 1.5f

    .line 478
    .line 479
    invoke-virtual {v2, v6, v4, v7, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 480
    .line 481
    .line 482
    const v4, 0x3f2b851f    # 0.67f

    .line 483
    .line 484
    .line 485
    const/high16 v6, 0x3fc00000    # 1.5f

    .line 486
    .line 487
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 488
    .line 489
    .line 490
    const v4, 0x41a2a3d7    # 20.33f

    .line 491
    .line 492
    .line 493
    const v6, 0x418fc28f    # 17.97f

    .line 494
    .line 495
    .line 496
    const/high16 v7, 0x419c0000    # 19.5f

    .line 497
    .line 498
    invoke-virtual {v2, v4, v6, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 499
    .line 500
    .line 501
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 502
    .line 503
    .line 504
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 505
    .line 506
    .line 507
    move-result-object v2

    .line 508
    const/high16 v6, 0x3f800000    # 1.0f

    .line 509
    .line 510
    const/4 v7, 0x0

    .line 511
    const-string v4, ""

    .line 512
    .line 513
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 514
    .line 515
    .line 516
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 517
    .line 518
    .line 519
    move-result v3

    .line 520
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 521
    .line 522
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 523
    .line 524
    .line 525
    move-result-wide v6

    .line 526
    const/4 v2, 0x0

    .line 527
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 528
    .line 529
    .line 530
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 531
    .line 532
    .line 533
    move-result v10

    .line 534
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 535
    .line 536
    .line 537
    move-result v11

    .line 538
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 539
    .line 540
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 541
    .line 542
    .line 543
    const v4, 0x410f851f    # 8.97f

    .line 544
    .line 545
    .line 546
    const/high16 v6, 0x40800000    # 4.0f

    .line 547
    .line 548
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 549
    .line 550
    .line 551
    const/high16 v4, 0x40a00000    # 5.0f

    .line 552
    .line 553
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 554
    .line 555
    .line 556
    const/high16 v25, -0x40000000    # -2.0f

    .line 557
    .line 558
    const/high16 v26, -0x40000000    # -2.0f

    .line 559
    .line 560
    const/16 v21, 0x0

    .line 561
    .line 562
    const v22, -0x40733333    # -1.1f

    .line 563
    .line 564
    .line 565
    const v23, -0x4099999a    # -0.9f

    .line 566
    .line 567
    .line 568
    const/high16 v24, -0x40000000    # -2.0f

    .line 569
    .line 570
    move-object/from16 v20, v2

    .line 571
    .line 572
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 573
    .line 574
    .line 575
    const/high16 v4, 0x40800000    # 4.0f

    .line 576
    .line 577
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 578
    .line 579
    .line 580
    const/high16 v25, -0x40800000    # -1.0f

    .line 581
    .line 582
    const/high16 v26, 0x3f800000    # 1.0f

    .line 583
    .line 584
    const v21, -0x40f33333    # -0.55f

    .line 585
    .line 586
    .line 587
    const/16 v22, 0x0

    .line 588
    .line 589
    const/high16 v23, -0x40800000    # -1.0f

    .line 590
    .line 591
    const v24, 0x3ee66666    # 0.45f

    .line 592
    .line 593
    .line 594
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 595
    .line 596
    .line 597
    const/high16 v25, 0x40800000    # 4.0f

    .line 598
    .line 599
    const v26, 0x410f851f    # 8.97f

    .line 600
    .line 601
    .line 602
    const/high16 v21, 0x40400000    # 3.0f

    .line 603
    .line 604
    const v22, 0x41087ae1    # 8.53f

    .line 605
    .line 606
    .line 607
    const v23, 0x405ccccd    # 3.45f

    .line 608
    .line 609
    .line 610
    const v24, 0x410f851f    # 8.97f

    .line 611
    .line 612
    .line 613
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 614
    .line 615
    .line 616
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 617
    .line 618
    .line 619
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 620
    .line 621
    .line 622
    move-result-object v2

    .line 623
    const/high16 v6, 0x3f800000    # 1.0f

    .line 624
    .line 625
    const/4 v7, 0x0

    .line 626
    const-string v4, ""

    .line 627
    .line 628
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 629
    .line 630
    .line 631
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 632
    .line 633
    .line 634
    move-result v3

    .line 635
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 636
    .line 637
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 638
    .line 639
    .line 640
    move-result-wide v6

    .line 641
    const/4 v0, 0x0

    .line 642
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 643
    .line 644
    .line 645
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 646
    .line 647
    .line 648
    move-result v10

    .line 649
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 650
    .line 651
    .line 652
    move-result v11

    .line 653
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 654
    .line 655
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 656
    .line 657
    .line 658
    const v0, 0x415ca3d7    # 13.79f

    .line 659
    .line 660
    .line 661
    const v2, 0x411d47ae    # 9.83f

    .line 662
    .line 663
    .line 664
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 665
    .line 666
    .line 667
    const v0, -0x410f5c29    # -0.47f

    .line 668
    .line 669
    .line 670
    const v2, -0x41c7ae14    # -0.18f

    .line 671
    .line 672
    .line 673
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 674
    .line 675
    .line 676
    const v0, 0x3f6e147b    # 0.93f

    .line 677
    .line 678
    .line 679
    const v2, -0x414ccccd    # -0.35f

    .line 680
    .line 681
    .line 682
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 683
    .line 684
    .line 685
    const v17, -0x3fec28f6    # -2.31f

    .line 686
    .line 687
    .line 688
    const v18, -0x3fe47ae1    # -2.43f

    .line 689
    .line 690
    .line 691
    const v13, -0x41147ae1    # -0.46f

    .line 692
    .line 693
    .line 694
    const v14, -0x407851ec    # -1.06f

    .line 695
    .line 696
    .line 697
    const v15, -0x405c28f6    # -1.28f

    .line 698
    .line 699
    .line 700
    const v16, -0x400b851f    # -1.91f

    .line 701
    .line 702
    .line 703
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 704
    .line 705
    .line 706
    const v0, 0x3f63d70a    # 0.89f

    .line 707
    .line 708
    .line 709
    const v2, -0x41333333    # -0.4f

    .line 710
    .line 711
    .line 712
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 713
    .line 714
    .line 715
    const v0, -0x41a8f5c3    # -0.21f

    .line 716
    .line 717
    .line 718
    const v2, -0x41147ae1    # -0.46f

    .line 719
    .line 720
    .line 721
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 722
    .line 723
    .line 724
    const v0, -0x4099999a    # -0.9f

    .line 725
    .line 726
    .line 727
    const v2, 0x3ecccccd    # 0.4f

    .line 728
    .line 729
    .line 730
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 731
    .line 732
    .line 733
    const/high16 v17, 0x40c00000    # 6.0f

    .line 734
    .line 735
    const v18, 0x411f851f    # 9.97f

    .line 736
    .line 737
    .line 738
    const v13, 0x40e851ec    # 7.26f

    .line 739
    .line 740
    .line 741
    const v14, 0x4121c28f    # 10.11f

    .line 742
    .line 743
    .line 744
    const v15, 0x40d47ae1    # 6.64f

    .line 745
    .line 746
    .line 747
    const v16, 0x411f851f    # 9.97f

    .line 748
    .line 749
    .line 750
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 751
    .line 752
    .line 753
    const v17, -0x403d70a4    # -1.52f

    .line 754
    .line 755
    .line 756
    const v18, 0x3e851eb8    # 0.26f

    .line 757
    .line 758
    .line 759
    const v13, -0x40f851ec    # -0.53f

    .line 760
    .line 761
    .line 762
    const/4 v14, 0x0

    .line 763
    const v15, -0x407ae148    # -1.04f

    .line 764
    .line 765
    .line 766
    const v16, 0x3de147ae    # 0.11f

    .line 767
    .line 768
    .line 769
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 770
    .line 771
    .line 772
    const v0, 0x3eae147b    # 0.34f

    .line 773
    .line 774
    .line 775
    const v2, 0x3f68f5c3    # 0.91f

    .line 776
    .line 777
    .line 778
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 779
    .line 780
    .line 781
    const v0, 0x3e3851ec    # 0.18f

    .line 782
    .line 783
    .line 784
    const v2, -0x410f5c29    # -0.47f

    .line 785
    .line 786
    .line 787
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 788
    .line 789
    .line 790
    const v0, 0x41266666    # 10.4f

    .line 791
    .line 792
    .line 793
    const/high16 v2, 0x40800000    # 4.0f

    .line 794
    .line 795
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 796
    .line 797
    .line 798
    const v17, -0x3fe47ae1    # -2.43f

    .line 799
    .line 800
    .line 801
    const v18, 0x4013d70a    # 2.31f

    .line 802
    .line 803
    .line 804
    const v13, -0x407851ec    # -1.06f

    .line 805
    .line 806
    .line 807
    const v14, 0x3eeb851f    # 0.46f

    .line 808
    .line 809
    .line 810
    const v15, -0x400b851f    # -1.91f

    .line 811
    .line 812
    .line 813
    const v16, 0x3fa3d70a    # 1.28f

    .line 814
    .line 815
    .line 816
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 817
    .line 818
    .line 819
    const v0, 0x3f63d70a    # 0.89f

    .line 820
    .line 821
    .line 822
    const v2, 0x3ecccccd    # 0.4f

    .line 823
    .line 824
    .line 825
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 826
    .line 827
    .line 828
    const v0, 0x3eeb851f    # 0.46f

    .line 829
    .line 830
    .line 831
    const v2, -0x41a8f5c3    # -0.21f

    .line 832
    .line 833
    .line 834
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 835
    .line 836
    .line 837
    const v0, -0x4099999a    # -0.9f

    .line 838
    .line 839
    .line 840
    const v2, -0x41333333    # -0.4f

    .line 841
    .line 842
    .line 843
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 844
    .line 845
    .line 846
    const/high16 v17, 0x3f800000    # 1.0f

    .line 847
    .line 848
    const v18, 0x416f851f    # 14.97f

    .line 849
    .line 850
    .line 851
    const v13, 0x3f90a3d7    # 1.13f

    .line 852
    .line 853
    .line 854
    const v14, 0x415b851f    # 13.72f

    .line 855
    .line 856
    .line 857
    const/high16 v15, 0x3f800000    # 1.0f

    .line 858
    .line 859
    const v16, 0x416547ae    # 14.33f

    .line 860
    .line 861
    .line 862
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 863
    .line 864
    .line 865
    const v17, 0x3e851eb8    # 0.26f

    .line 866
    .line 867
    .line 868
    const v18, 0x3fc28f5c    # 1.52f

    .line 869
    .line 870
    .line 871
    const/4 v13, 0x0

    .line 872
    const v14, 0x3f07ae14    # 0.53f

    .line 873
    .line 874
    .line 875
    const v15, 0x3de147ae    # 0.11f

    .line 876
    .line 877
    .line 878
    const v16, 0x3f851eb8    # 1.04f

    .line 879
    .line 880
    .line 881
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 882
    .line 883
    .line 884
    const v0, 0x3f68f5c3    # 0.91f

    .line 885
    .line 886
    .line 887
    const v2, -0x4151eb85    # -0.34f

    .line 888
    .line 889
    .line 890
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 891
    .line 892
    .line 893
    const v0, 0x3e3851ec    # 0.18f

    .line 894
    .line 895
    .line 896
    const v2, 0x3ef0a3d7    # 0.47f

    .line 897
    .line 898
    .line 899
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 900
    .line 901
    .line 902
    const v0, -0x4091eb85    # -0.93f

    .line 903
    .line 904
    .line 905
    const v2, 0x3eb33333    # 0.35f

    .line 906
    .line 907
    .line 908
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 909
    .line 910
    .line 911
    const v17, 0x4013d70a    # 2.31f

    .line 912
    .line 913
    .line 914
    const v18, 0x401b851f    # 2.43f

    .line 915
    .line 916
    .line 917
    const v13, 0x3eeb851f    # 0.46f

    .line 918
    .line 919
    .line 920
    const v14, 0x3f87ae14    # 1.06f

    .line 921
    .line 922
    .line 923
    const v15, 0x3fa3d70a    # 1.28f

    .line 924
    .line 925
    .line 926
    const v16, 0x3ff47ae1    # 1.91f

    .line 927
    .line 928
    .line 929
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 930
    .line 931
    .line 932
    const v0, -0x409c28f6    # -0.89f

    .line 933
    .line 934
    .line 935
    const v2, 0x3ecccccd    # 0.4f

    .line 936
    .line 937
    .line 938
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 939
    .line 940
    .line 941
    const v0, 0x3eeb851f    # 0.46f

    .line 942
    .line 943
    .line 944
    const v2, 0x3e570a3d    # 0.21f

    .line 945
    .line 946
    .line 947
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 948
    .line 949
    .line 950
    const v0, 0x3f666666    # 0.9f

    .line 951
    .line 952
    .line 953
    const v2, -0x41333333    # -0.4f

    .line 954
    .line 955
    .line 956
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 957
    .line 958
    .line 959
    const v17, 0x3fe8f5c3    # 1.82f

    .line 960
    .line 961
    .line 962
    const v18, 0x3eb33333    # 0.35f

    .line 963
    .line 964
    .line 965
    const v13, 0x3f11eb85    # 0.57f

    .line 966
    .line 967
    .line 968
    const v14, 0x3e6147ae    # 0.22f

    .line 969
    .line 970
    .line 971
    const v15, 0x3f970a3d    # 1.18f

    .line 972
    .line 973
    .line 974
    const v16, 0x3eb33333    # 0.35f

    .line 975
    .line 976
    .line 977
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 978
    .line 979
    .line 980
    const v17, 0x3fc28f5c    # 1.52f

    .line 981
    .line 982
    .line 983
    const v18, -0x417ae148    # -0.26f

    .line 984
    .line 985
    .line 986
    const v13, 0x3f07ae14    # 0.53f

    .line 987
    .line 988
    .line 989
    const/4 v14, 0x0

    .line 990
    const v15, 0x3f851eb8    # 1.04f

    .line 991
    .line 992
    .line 993
    const v16, -0x421eb852    # -0.11f

    .line 994
    .line 995
    .line 996
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 997
    .line 998
    .line 999
    const v0, 0x40e5c28f    # 7.18f

    .line 1000
    .line 1001
    .line 1002
    const v2, 0x41966666    # 18.8f

    .line 1003
    .line 1004
    .line 1005
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1006
    .line 1007
    .line 1008
    const v0, 0x3ef0a3d7    # 0.47f

    .line 1009
    .line 1010
    .line 1011
    const v2, -0x41c7ae14    # -0.18f

    .line 1012
    .line 1013
    .line 1014
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1015
    .line 1016
    .line 1017
    const/high16 v0, 0x41000000    # 8.0f

    .line 1018
    .line 1019
    const v2, 0x419c6666    # 19.55f

    .line 1020
    .line 1021
    .line 1022
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1023
    .line 1024
    .line 1025
    const v17, 0x401b851f    # 2.43f

    .line 1026
    .line 1027
    .line 1028
    const v18, -0x3fec28f6    # -2.31f

    .line 1029
    .line 1030
    .line 1031
    const v13, 0x3f87ae14    # 1.06f

    .line 1032
    .line 1033
    .line 1034
    const v14, -0x41147ae1    # -0.46f

    .line 1035
    .line 1036
    .line 1037
    const v15, 0x3ff47ae1    # 1.91f

    .line 1038
    .line 1039
    .line 1040
    const v16, -0x405c28f6    # -1.28f

    .line 1041
    .line 1042
    .line 1043
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1044
    .line 1045
    .line 1046
    const v0, -0x409c28f6    # -0.89f

    .line 1047
    .line 1048
    .line 1049
    const v2, -0x41333333    # -0.4f

    .line 1050
    .line 1051
    .line 1052
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1053
    .line 1054
    .line 1055
    const v0, 0x3e570a3d    # 0.21f

    .line 1056
    .line 1057
    .line 1058
    const v2, -0x41147ae1    # -0.46f

    .line 1059
    .line 1060
    .line 1061
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1062
    .line 1063
    .line 1064
    const v0, 0x3f666666    # 0.9f

    .line 1065
    .line 1066
    .line 1067
    const v2, 0x3ecccccd    # 0.4f

    .line 1068
    .line 1069
    .line 1070
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1071
    .line 1072
    .line 1073
    const v17, 0x3eb33333    # 0.35f

    .line 1074
    .line 1075
    .line 1076
    const v18, -0x40170a3d    # -1.82f

    .line 1077
    .line 1078
    .line 1079
    const v13, 0x3e6147ae    # 0.22f

    .line 1080
    .line 1081
    .line 1082
    const v14, -0x40ee147b    # -0.57f

    .line 1083
    .line 1084
    .line 1085
    const v15, 0x3eb33333    # 0.35f

    .line 1086
    .line 1087
    .line 1088
    const v16, -0x4068f5c3    # -1.18f

    .line 1089
    .line 1090
    .line 1091
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1092
    .line 1093
    .line 1094
    const v17, -0x417ae148    # -0.26f

    .line 1095
    .line 1096
    .line 1097
    const v18, -0x403d70a4    # -1.52f

    .line 1098
    .line 1099
    .line 1100
    const/4 v13, 0x0

    .line 1101
    const v14, -0x40f851ec    # -0.53f

    .line 1102
    .line 1103
    .line 1104
    const v15, -0x421eb852    # -0.11f

    .line 1105
    .line 1106
    .line 1107
    const v16, -0x407ae148    # -1.04f

    .line 1108
    .line 1109
    .line 1110
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1111
    .line 1112
    .line 1113
    const v0, 0x415ca3d7    # 13.79f

    .line 1114
    .line 1115
    .line 1116
    const v2, 0x411d47ae    # 9.83f

    .line 1117
    .line 1118
    .line 1119
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1120
    .line 1121
    .line 1122
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1123
    .line 1124
    .line 1125
    const v0, 0x40e4cccd    # 7.15f

    .line 1126
    .line 1127
    .line 1128
    const/high16 v2, 0x418e0000    # 17.75f

    .line 1129
    .line 1130
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1131
    .line 1132
    .line 1133
    const v17, -0x3f851eb8    # -3.92f

    .line 1134
    .line 1135
    .line 1136
    const v18, -0x4030a3d7    # -1.62f

    .line 1137
    .line 1138
    .line 1139
    const v13, -0x403c28f6    # -1.53f

    .line 1140
    .line 1141
    .line 1142
    const v14, 0x3f2147ae    # 0.63f

    .line 1143
    .line 1144
    .line 1145
    const v15, -0x3fad70a4    # -3.29f

    .line 1146
    .line 1147
    .line 1148
    const v16, -0x4247ae14    # -0.09f

    .line 1149
    .line 1150
    .line 1151
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1152
    .line 1153
    .line 1154
    const v17, 0x3fcf5c29    # 1.62f

    .line 1155
    .line 1156
    .line 1157
    const v18, -0x3f851eb8    # -3.92f

    .line 1158
    .line 1159
    .line 1160
    const v13, -0x40deb852    # -0.63f

    .line 1161
    .line 1162
    .line 1163
    const v14, -0x403c28f6    # -1.53f

    .line 1164
    .line 1165
    .line 1166
    const v15, 0x3db851ec    # 0.09f

    .line 1167
    .line 1168
    .line 1169
    const v16, -0x3fad70a4    # -3.29f

    .line 1170
    .line 1171
    .line 1172
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1173
    .line 1174
    .line 1175
    const v17, 0x407ae148    # 3.92f

    .line 1176
    .line 1177
    .line 1178
    const v18, 0x3fcf5c29    # 1.62f

    .line 1179
    .line 1180
    .line 1181
    const v13, 0x3fc3d70a    # 1.53f

    .line 1182
    .line 1183
    .line 1184
    const v14, -0x40deb852    # -0.63f

    .line 1185
    .line 1186
    .line 1187
    const v15, 0x40528f5c    # 3.29f

    .line 1188
    .line 1189
    .line 1190
    const v16, 0x3db851ec    # 0.09f

    .line 1191
    .line 1192
    .line 1193
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1194
    .line 1195
    .line 1196
    const v17, 0x40e4cccd    # 7.15f

    .line 1197
    .line 1198
    .line 1199
    const/high16 v18, 0x418e0000    # 17.75f

    .line 1200
    .line 1201
    const v13, 0x41168f5c    # 9.41f

    .line 1202
    .line 1203
    .line 1204
    const v14, 0x4175c28f    # 15.36f

    .line 1205
    .line 1206
    .line 1207
    const v15, 0x410ae148    # 8.68f

    .line 1208
    .line 1209
    .line 1210
    const v16, 0x4188e148    # 17.11f

    .line 1211
    .line 1212
    .line 1213
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1214
    .line 1215
    .line 1216
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1217
    .line 1218
    .line 1219
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 1220
    .line 1221
    .line 1222
    move-result-object v2

    .line 1223
    const/16 v16, 0x3800

    .line 1224
    .line 1225
    const/16 v17, 0x0

    .line 1226
    .line 1227
    const/high16 v6, 0x3f800000    # 1.0f

    .line 1228
    .line 1229
    const/4 v7, 0x0

    .line 1230
    const/high16 v12, 0x3f800000    # 1.0f

    .line 1231
    .line 1232
    const/4 v13, 0x0

    .line 1233
    const/4 v14, 0x0

    .line 1234
    const/4 v15, 0x0

    .line 1235
    const-string v4, ""

    .line 1236
    .line 1237
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 1238
    .line 1239
    .line 1240
    move-result-object v0

    .line 1241
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1242
    .line 1243
    .line 1244
    move-result-object v0

    .line 1245
    sput-object v0, Landroidx/compose/material/icons/rounded/AgricultureKt;->_agriculture:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1246
    .line 1247
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 1248
    .line 1249
    .line 1250
    return-object v0
.end method
