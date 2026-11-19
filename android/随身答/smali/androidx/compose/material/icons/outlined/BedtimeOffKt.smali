.class public final Landroidx/compose/material/icons/outlined/BedtimeOffKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_bedtimeOff",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "BedtimeOff",
        "Landroidx/compose/material/icons/Icons$Outlined;",
        "getBedtimeOff",
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
        "SMAP\nBedtimeOff.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BedtimeOff.kt\nandroidx/compose/material/icons/outlined/BedtimeOffKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,64:1\n212#2,12:65\n233#2,18:78\n253#2:115\n233#2,18:116\n253#2:153\n174#3:77\n705#4,2:96\n717#4,2:98\n719#4,11:104\n705#4,2:134\n717#4,2:136\n719#4,11:142\n72#5,4:100\n72#5,4:138\n*S KotlinDebug\n*F\n+ 1 BedtimeOff.kt\nandroidx/compose/material/icons/outlined/BedtimeOffKt\n*L\n29#1:65,12\n30#1:78,18\n30#1:115\n41#1:116,18\n41#1:153\n29#1:77\n30#1:96,2\n30#1:98,2\n30#1:104,11\n41#1:134,2\n41#1:136,2\n41#1:142,11\n30#1:100,4\n41#1:138,4\n*E\n"
    }
.end annotation


# static fields
.field private static _bedtimeOff:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getBedtimeOff(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/outlined/BedtimeOffKt;->_bedtimeOff:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Outlined.BedtimeOff"

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
    const v4, 0x411451ec    # 9.27f

    .line 71
    .line 72
    .line 73
    const v6, 0x408fae14    # 4.49f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v25, 0x41107ae1    # 9.03f

    .line 80
    .line 81
    .line 82
    const v26, 0x40c66666    # 6.2f

    .line 83
    .line 84
    .line 85
    const v21, 0x41123d71    # 9.14f

    .line 86
    .line 87
    .line 88
    const v22, 0x40a28f5c    # 5.08f

    .line 89
    .line 90
    .line 91
    const v23, 0x41111eb8    # 9.07f

    .line 92
    .line 93
    .line 94
    const v24, 0x40b47ae1    # 5.64f

    .line 95
    .line 96
    .line 97
    move-object/from16 v20, v2

    .line 98
    .line 99
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 100
    .line 101
    .line 102
    const v4, 0x40033333    # 2.05f

    .line 103
    .line 104
    .line 105
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 106
    .line 107
    .line 108
    const v25, 0x3fa147ae    # 1.26f

    .line 109
    .line 110
    .line 111
    const v26, -0x3f38a3d7    # -6.23f

    .line 112
    .line 113
    .line 114
    const v21, -0x4175c28f    # -0.27f

    .line 115
    .line 116
    .line 117
    const v22, -0x3ffccccd    # -2.05f

    .line 118
    .line 119
    .line 120
    const v23, 0x3dcccccd    # 0.1f

    .line 121
    .line 122
    .line 123
    const v24, -0x3f78f5c3    # -4.22f

    .line 124
    .line 125
    .line 126
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 127
    .line 128
    .line 129
    const v25, -0x414ccccd    # -0.35f

    .line 130
    .line 131
    .line 132
    const v26, -0x43dc28f6    # -0.01f

    .line 133
    .line 134
    .line 135
    const v21, -0x420a3d71    # -0.12f

    .line 136
    .line 137
    .line 138
    const/16 v22, 0x0

    .line 139
    .line 140
    const v23, -0x41947ae1    # -0.23f

    .line 141
    .line 142
    .line 143
    const v24, -0x43dc28f6    # -0.01f

    .line 144
    .line 145
    .line 146
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 147
    .line 148
    .line 149
    const/high16 v25, -0x3f500000    # -5.5f

    .line 150
    .line 151
    const v26, 0x3fd33333    # 1.65f

    .line 152
    .line 153
    .line 154
    const v21, -0x3ffccccd    # -2.05f

    .line 155
    .line 156
    .line 157
    const v23, -0x3f847ae1    # -3.93f

    .line 158
    .line 159
    .line 160
    const v24, 0x3f1c28f6    # 0.61f

    .line 161
    .line 162
    .line 163
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 164
    .line 165
    .line 166
    const v4, 0x3fbae148    # 1.46f

    .line 167
    .line 168
    .line 169
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 170
    .line 171
    .line 172
    const v25, 0x411451ec    # 9.27f

    .line 173
    .line 174
    .line 175
    const v26, 0x408fae14    # 4.49f

    .line 176
    .line 177
    .line 178
    const v21, 0x4105eb85    # 8.37f

    .line 179
    .line 180
    .line 181
    const v22, 0x409c28f6    # 4.88f

    .line 182
    .line 183
    .line 184
    const v23, 0x410cf5c3    # 8.81f

    .line 185
    .line 186
    .line 187
    const v24, 0x40951eb8    # 4.66f

    .line 188
    .line 189
    .line 190
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 191
    .line 192
    .line 193
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 194
    .line 195
    .line 196
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 197
    .line 198
    .line 199
    move-result-object v2

    .line 200
    const/16 v16, 0x3800

    .line 201
    .line 202
    const/16 v17, 0x0

    .line 203
    .line 204
    const/high16 v6, 0x3f800000    # 1.0f

    .line 205
    .line 206
    const/high16 v8, 0x3f800000    # 1.0f

    .line 207
    .line 208
    const/4 v7, 0x0

    .line 209
    const/high16 v9, 0x3f800000    # 1.0f

    .line 210
    .line 211
    const/high16 v12, 0x3f800000    # 1.0f

    .line 212
    .line 213
    const/4 v13, 0x0

    .line 214
    const/4 v14, 0x0

    .line 215
    const/4 v15, 0x0

    .line 216
    const-string v4, ""

    .line 217
    .line 218
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 219
    .line 220
    .line 221
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 222
    .line 223
    .line 224
    move-result v3

    .line 225
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 226
    .line 227
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 228
    .line 229
    .line 230
    move-result-wide v6

    .line 231
    const/4 v0, 0x0

    .line 232
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 233
    .line 234
    .line 235
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 236
    .line 237
    .line 238
    move-result v10

    .line 239
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 240
    .line 241
    .line 242
    move-result v11

    .line 243
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 244
    .line 245
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 246
    .line 247
    .line 248
    const v0, 0x40870a3d    # 4.22f

    .line 249
    .line 250
    .line 251
    const v2, 0x3fb1eb85    # 1.39f

    .line 252
    .line 253
    .line 254
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 255
    .line 256
    .line 257
    const v0, 0x401147ae    # 2.27f

    .line 258
    .line 259
    .line 260
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 261
    .line 262
    .line 263
    const/high16 v17, 0x40000000    # 2.0f

    .line 264
    .line 265
    const/high16 v18, 0x41400000    # 12.0f

    .line 266
    .line 267
    const v13, 0x40270a3d    # 2.61f

    .line 268
    .line 269
    .line 270
    const v14, 0x41011eb8    # 8.07f

    .line 271
    .line 272
    .line 273
    const/high16 v15, 0x40000000    # 2.0f

    .line 274
    .line 275
    const v16, 0x411f851f    # 9.97f

    .line 276
    .line 277
    .line 278
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 279
    .line 280
    .line 281
    const/high16 v17, 0x41200000    # 10.0f

    .line 282
    .line 283
    const/high16 v18, 0x41200000    # 10.0f

    .line 284
    .line 285
    const/4 v13, 0x0

    .line 286
    const v14, 0x40b0a3d7    # 5.52f

    .line 287
    .line 288
    .line 289
    const v15, 0x408f5c29    # 4.48f

    .line 290
    .line 291
    .line 292
    const/high16 v16, 0x41200000    # 10.0f

    .line 293
    .line 294
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 295
    .line 296
    .line 297
    const/high16 v17, 0x40b00000    # 5.5f

    .line 298
    .line 299
    const v18, -0x402a3d71    # -1.67f

    .line 300
    .line 301
    .line 302
    const v13, 0x40028f5c    # 2.04f

    .line 303
    .line 304
    .line 305
    const/4 v14, 0x0

    .line 306
    const v15, 0x407ae148    # 3.92f

    .line 307
    .line 308
    .line 309
    const v16, -0x40deb852    # -0.63f

    .line 310
    .line 311
    .line 312
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 313
    .line 314
    .line 315
    const v0, 0x4011eb85    # 2.28f

    .line 316
    .line 317
    .line 318
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 319
    .line 320
    .line 321
    const v0, 0x3fb47ae1    # 1.41f

    .line 322
    .line 323
    .line 324
    const v2, -0x404b851f    # -1.41f

    .line 325
    .line 326
    .line 327
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 328
    .line 329
    .line 330
    const v0, 0x4033d70a    # 2.81f

    .line 331
    .line 332
    .line 333
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 334
    .line 335
    .line 336
    const v0, 0x40870a3d    # 4.22f

    .line 337
    .line 338
    .line 339
    const v2, 0x3fb1eb85    # 1.39f

    .line 340
    .line 341
    .line 342
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 343
    .line 344
    .line 345
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 346
    .line 347
    .line 348
    const v0, 0x40a428f6    # 5.13f

    .line 349
    .line 350
    .line 351
    const v2, 0x40feb852    # 7.96f

    .line 352
    .line 353
    .line 354
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 355
    .line 356
    .line 357
    const v0, 0x412eb852    # 10.92f

    .line 358
    .line 359
    .line 360
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 361
    .line 362
    .line 363
    const/high16 v17, 0x41400000    # 12.0f

    .line 364
    .line 365
    const/high16 v18, 0x41a00000    # 20.0f

    .line 366
    .line 367
    const v13, 0x416d70a4    # 14.84f

    .line 368
    .line 369
    .line 370
    const v14, 0x419ccccd    # 19.6f

    .line 371
    .line 372
    .line 373
    const v15, 0x41573333    # 13.45f

    .line 374
    .line 375
    .line 376
    const/high16 v16, 0x41a00000    # 20.0f

    .line 377
    .line 378
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 379
    .line 380
    .line 381
    const/high16 v17, -0x3f000000    # -8.0f

    .line 382
    .line 383
    const/high16 v18, -0x3f000000    # -8.0f

    .line 384
    .line 385
    const v13, -0x3f72e148    # -4.41f

    .line 386
    .line 387
    .line 388
    const/4 v14, 0x0

    .line 389
    const/high16 v15, -0x3f000000    # -8.0f

    .line 390
    .line 391
    const v16, -0x3f9a3d71    # -3.59f

    .line 392
    .line 393
    .line 394
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 395
    .line 396
    .line 397
    const v17, 0x40a428f6    # 5.13f

    .line 398
    .line 399
    .line 400
    const v18, 0x40feb852    # 7.96f

    .line 401
    .line 402
    .line 403
    const/high16 v13, 0x40800000    # 4.0f

    .line 404
    .line 405
    const v14, 0x412851ec    # 10.52f

    .line 406
    .line 407
    .line 408
    const v15, 0x408d70a4    # 4.42f

    .line 409
    .line 410
    .line 411
    const v16, 0x41126666    # 9.15f

    .line 412
    .line 413
    .line 414
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 415
    .line 416
    .line 417
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 418
    .line 419
    .line 420
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 421
    .line 422
    .line 423
    move-result-object v2

    .line 424
    const/16 v16, 0x3800

    .line 425
    .line 426
    const/16 v17, 0x0

    .line 427
    .line 428
    const/high16 v6, 0x3f800000    # 1.0f

    .line 429
    .line 430
    const/4 v7, 0x0

    .line 431
    const/high16 v12, 0x3f800000    # 1.0f

    .line 432
    .line 433
    const/4 v13, 0x0

    .line 434
    const/4 v14, 0x0

    .line 435
    const/4 v15, 0x0

    .line 436
    const-string v4, ""

    .line 437
    .line 438
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 439
    .line 440
    .line 441
    move-result-object v0

    .line 442
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 443
    .line 444
    .line 445
    move-result-object v0

    .line 446
    sput-object v0, Landroidx/compose/material/icons/outlined/BedtimeOffKt;->_bedtimeOff:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 447
    .line 448
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 449
    .line 450
    .line 451
    return-object v0
.end method
