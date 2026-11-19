.class public final Landroidx/compose/material/icons/rounded/HourglassDisabledKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_hourglassDisabled",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "HourglassDisabled",
        "Landroidx/compose/material/icons/Icons$Rounded;",
        "getHourglassDisabled",
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
        "SMAP\nHourglassDisabled.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HourglassDisabled.kt\nandroidx/compose/material/icons/rounded/HourglassDisabledKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,79:1\n212#2,12:80\n233#2,18:93\n253#2:130\n233#2,18:131\n253#2:168\n174#3:92\n705#4,2:111\n717#4,2:113\n719#4,11:119\n705#4,2:149\n717#4,2:151\n719#4,11:157\n72#5,4:115\n72#5,4:153\n*S KotlinDebug\n*F\n+ 1 HourglassDisabled.kt\nandroidx/compose/material/icons/rounded/HourglassDisabledKt\n*L\n29#1:80,12\n30#1:93,18\n30#1:130\n56#1:131,18\n56#1:168\n29#1:92\n30#1:111,2\n30#1:113,2\n30#1:119,11\n56#1:149,2\n56#1:151,2\n56#1:157,11\n30#1:115,4\n56#1:153,4\n*E\n"
    }
.end annotation


# static fields
.field private static _hourglassDisabled:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getHourglassDisabled(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/HourglassDisabledKt;->_hourglassDisabled:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.HourglassDisabled"

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
    const v4, 0x4033d70a    # 2.81f

    .line 71
    .line 72
    .line 73
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 74
    .line 75
    .line 76
    const v25, -0x404b851f    # -1.41f

    .line 77
    .line 78
    .line 79
    const/16 v26, 0x0

    .line 80
    .line 81
    const v21, -0x413851ec    # -0.39f

    .line 82
    .line 83
    .line 84
    const v22, -0x413851ec    # -0.39f

    .line 85
    .line 86
    .line 87
    const v23, -0x407d70a4    # -1.02f

    .line 88
    .line 89
    .line 90
    const v24, -0x413851ec    # -0.39f

    .line 91
    .line 92
    .line 93
    move-object/from16 v20, v2

    .line 94
    .line 95
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 96
    .line 97
    .line 98
    const v25, 0x3fb1eb85    # 1.39f

    .line 99
    .line 100
    .line 101
    const v26, 0x40870a3d    # 4.22f

    .line 102
    .line 103
    .line 104
    const/high16 v21, 0x3f800000    # 1.0f

    .line 105
    .line 106
    const v22, 0x404ccccd    # 3.2f

    .line 107
    .line 108
    .line 109
    const/high16 v23, 0x3f800000    # 1.0f

    .line 110
    .line 111
    const v24, 0x40751eb8    # 3.83f

    .line 112
    .line 113
    .line 114
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 115
    .line 116
    .line 117
    const v4, 0x41030a3d    # 8.19f

    .line 118
    .line 119
    .line 120
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 121
    .line 122
    .line 123
    const/high16 v4, -0x3fc00000    # -3.0f

    .line 124
    .line 125
    const v6, 0x4040a3d7    # 3.01f

    .line 126
    .line 127
    .line 128
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 129
    .line 130
    .line 131
    const/high16 v25, 0x40c00000    # 6.0f

    .line 132
    .line 133
    const v26, 0x4186b852    # 16.84f

    .line 134
    .line 135
    .line 136
    const v21, 0x40c6b852    # 6.21f

    .line 137
    .line 138
    .line 139
    const v22, 0x417ccccd    # 15.8f

    .line 140
    .line 141
    .line 142
    const/high16 v23, 0x40c00000    # 6.0f

    .line 143
    .line 144
    const v24, 0x41827ae1    # 16.31f

    .line 145
    .line 146
    .line 147
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 148
    .line 149
    .line 150
    const/high16 v4, 0x41a00000    # 20.0f

    .line 151
    .line 152
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 153
    .line 154
    .line 155
    const/high16 v25, 0x40000000    # 2.0f

    .line 156
    .line 157
    const/high16 v26, 0x40000000    # 2.0f

    .line 158
    .line 159
    const/16 v21, 0x0

    .line 160
    .line 161
    const v22, 0x3f8ccccd    # 1.1f

    .line 162
    .line 163
    .line 164
    const v23, 0x3f666666    # 0.9f

    .line 165
    .line 166
    .line 167
    const/high16 v24, 0x40000000    # 2.0f

    .line 168
    .line 169
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 170
    .line 171
    .line 172
    const/high16 v4, 0x41000000    # 8.0f

    .line 173
    .line 174
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 175
    .line 176
    .line 177
    const v25, 0x3fef5c29    # 1.87f

    .line 178
    .line 179
    .line 180
    const v26, -0x4059999a    # -1.3f

    .line 181
    .line 182
    .line 183
    const v21, 0x3f5c28f6    # 0.86f

    .line 184
    .line 185
    .line 186
    const/16 v22, 0x0

    .line 187
    .line 188
    const v23, 0x3fca3d71    # 1.58f

    .line 189
    .line 190
    .line 191
    const v24, -0x40f5c28f    # -0.54f

    .line 192
    .line 193
    .line 194
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 195
    .line 196
    .line 197
    const v4, 0x3ff47ae1    # 1.91f

    .line 198
    .line 199
    .line 200
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 201
    .line 202
    .line 203
    const v25, 0x3fb47ae1    # 1.41f

    .line 204
    .line 205
    .line 206
    const/16 v26, 0x0

    .line 207
    .line 208
    const v21, 0x3ec7ae14    # 0.39f

    .line 209
    .line 210
    .line 211
    const v22, 0x3ec7ae14    # 0.39f

    .line 212
    .line 213
    .line 214
    const v23, 0x3f828f5c    # 1.02f

    .line 215
    .line 216
    .line 217
    const v24, 0x3ec7ae14    # 0.39f

    .line 218
    .line 219
    .line 220
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 221
    .line 222
    .line 223
    const/16 v25, 0x0

    .line 224
    .line 225
    const v26, -0x404b851f    # -1.41f

    .line 226
    .line 227
    .line 228
    const v22, -0x413851ec    # -0.39f

    .line 229
    .line 230
    .line 231
    const v23, 0x3ec7ae14    # 0.39f

    .line 232
    .line 233
    .line 234
    const v24, -0x407d70a4    # -1.02f

    .line 235
    .line 236
    .line 237
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 238
    .line 239
    .line 240
    const v4, 0x4033d70a    # 2.81f

    .line 241
    .line 242
    .line 243
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 244
    .line 245
    .line 246
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 247
    .line 248
    .line 249
    const/high16 v4, 0x41980000    # 19.0f

    .line 250
    .line 251
    const/high16 v6, 0x41800000    # 16.0f

    .line 252
    .line 253
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 254
    .line 255
    .line 256
    const/high16 v25, -0x40800000    # -1.0f

    .line 257
    .line 258
    const/high16 v26, 0x3f800000    # 1.0f

    .line 259
    .line 260
    const/16 v21, 0x0

    .line 261
    .line 262
    const v22, 0x3f0ccccd    # 0.55f

    .line 263
    .line 264
    .line 265
    const v23, -0x4119999a    # -0.45f

    .line 266
    .line 267
    .line 268
    const/high16 v24, 0x3f800000    # 1.0f

    .line 269
    .line 270
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 271
    .line 272
    .line 273
    const/high16 v4, 0x41100000    # 9.0f

    .line 274
    .line 275
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 276
    .line 277
    .line 278
    const/high16 v26, -0x40800000    # -1.0f

    .line 279
    .line 280
    const v21, -0x40f33333    # -0.55f

    .line 281
    .line 282
    .line 283
    const/16 v22, 0x0

    .line 284
    .line 285
    const/high16 v23, -0x40800000    # -1.0f

    .line 286
    .line 287
    const v24, -0x4119999a    # -0.45f

    .line 288
    .line 289
    .line 290
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 291
    .line 292
    .line 293
    const/high16 v4, -0x3fe00000    # -2.5f

    .line 294
    .line 295
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 296
    .line 297
    .line 298
    const v4, -0x3fca3d71    # -2.84f

    .line 299
    .line 300
    .line 301
    const v6, 0x4035c28f    # 2.84f

    .line 302
    .line 303
    .line 304
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 305
    .line 306
    .line 307
    const v4, 0x4196a3d7    # 18.83f

    .line 308
    .line 309
    .line 310
    const/high16 v6, 0x41800000    # 16.0f

    .line 311
    .line 312
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 313
    .line 314
    .line 315
    const/high16 v4, 0x41980000    # 19.0f

    .line 316
    .line 317
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 318
    .line 319
    .line 320
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 321
    .line 322
    .line 323
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 324
    .line 325
    .line 326
    move-result-object v2

    .line 327
    const/16 v16, 0x3800

    .line 328
    .line 329
    const/16 v17, 0x0

    .line 330
    .line 331
    const/high16 v6, 0x3f800000    # 1.0f

    .line 332
    .line 333
    const/high16 v8, 0x3f800000    # 1.0f

    .line 334
    .line 335
    const/4 v7, 0x0

    .line 336
    const/high16 v9, 0x3f800000    # 1.0f

    .line 337
    .line 338
    const/high16 v12, 0x3f800000    # 1.0f

    .line 339
    .line 340
    const/4 v13, 0x0

    .line 341
    const/4 v14, 0x0

    .line 342
    const/4 v15, 0x0

    .line 343
    const-string v4, ""

    .line 344
    .line 345
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 346
    .line 347
    .line 348
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 349
    .line 350
    .line 351
    move-result v3

    .line 352
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 353
    .line 354
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 355
    .line 356
    .line 357
    move-result-wide v6

    .line 358
    const/4 v0, 0x0

    .line 359
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 360
    .line 361
    .line 362
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 363
    .line 364
    .line 365
    move-result v10

    .line 366
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 367
    .line 368
    .line 369
    move-result v11

    .line 370
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 371
    .line 372
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 373
    .line 374
    .line 375
    const/high16 v0, 0x40a00000    # 5.0f

    .line 376
    .line 377
    const/high16 v2, 0x41000000    # 8.0f

    .line 378
    .line 379
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 380
    .line 381
    .line 382
    const/high16 v17, 0x3f800000    # 1.0f

    .line 383
    .line 384
    const/high16 v18, -0x40800000    # -1.0f

    .line 385
    .line 386
    const v14, -0x40f33333    # -0.55f

    .line 387
    .line 388
    .line 389
    const v15, 0x3ee66666    # 0.45f

    .line 390
    .line 391
    .line 392
    const/high16 v16, -0x40800000    # -1.0f

    .line 393
    .line 394
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 395
    .line 396
    .line 397
    const/high16 v0, 0x40c00000    # 6.0f

    .line 398
    .line 399
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 400
    .line 401
    .line 402
    const/high16 v18, 0x3f800000    # 1.0f

    .line 403
    .line 404
    const v13, 0x3f0ccccd    # 0.55f

    .line 405
    .line 406
    .line 407
    const/4 v14, 0x0

    .line 408
    const/high16 v15, 0x3f800000    # 1.0f

    .line 409
    .line 410
    const v16, 0x3ee66666    # 0.45f

    .line 411
    .line 412
    .line 413
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 414
    .line 415
    .line 416
    const/high16 v0, 0x40200000    # 2.5f

    .line 417
    .line 418
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 419
    .line 420
    .line 421
    const v0, -0x3fca3d71    # -2.84f

    .line 422
    .line 423
    .line 424
    const v2, 0x4035c28f    # 2.84f

    .line 425
    .line 426
    .line 427
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 428
    .line 429
    .line 430
    const/high16 v0, 0x3fa00000    # 1.25f

    .line 431
    .line 432
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 433
    .line 434
    .line 435
    const/high16 v0, 0x40400000    # 3.0f

    .line 436
    .line 437
    const v2, -0x3fc0a3d7    # -2.99f

    .line 438
    .line 439
    .line 440
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 441
    .line 442
    .line 443
    const/high16 v17, 0x41900000    # 18.0f

    .line 444
    .line 445
    const v18, 0x40e5c28f    # 7.18f

    .line 446
    .line 447
    .line 448
    const v13, 0x418e51ec    # 17.79f

    .line 449
    .line 450
    .line 451
    const v14, 0x4103851f    # 8.22f

    .line 452
    .line 453
    .line 454
    const/high16 v15, 0x41900000    # 18.0f

    .line 455
    .line 456
    const v16, 0x40f6b852    # 7.71f

    .line 457
    .line 458
    .line 459
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 460
    .line 461
    .line 462
    const/high16 v0, 0x40800000    # 4.0f

    .line 463
    .line 464
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 465
    .line 466
    .line 467
    const/high16 v17, -0x40000000    # -2.0f

    .line 468
    .line 469
    const/high16 v18, -0x40000000    # -2.0f

    .line 470
    .line 471
    const/4 v13, 0x0

    .line 472
    const v14, -0x4071eb85    # -1.11f

    .line 473
    .line 474
    .line 475
    const v15, -0x4099999a    # -0.9f

    .line 476
    .line 477
    .line 478
    const/high16 v16, -0x40000000    # -2.0f

    .line 479
    .line 480
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 481
    .line 482
    .line 483
    const/high16 v0, 0x41000000    # 8.0f

    .line 484
    .line 485
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 486
    .line 487
    .line 488
    const v17, 0x40c428f6    # 6.13f

    .line 489
    .line 490
    .line 491
    const v18, 0x40533333    # 3.3f

    .line 492
    .line 493
    .line 494
    const v13, 0x40e47ae1    # 7.14f

    .line 495
    .line 496
    .line 497
    const/high16 v14, 0x40000000    # 2.0f

    .line 498
    .line 499
    const v15, 0x40cd70a4    # 6.42f

    .line 500
    .line 501
    .line 502
    const v16, 0x40228f5c    # 2.54f

    .line 503
    .line 504
    .line 505
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 506
    .line 507
    .line 508
    const v0, 0x40a570a4    # 5.17f

    .line 509
    .line 510
    .line 511
    const/high16 v2, 0x41000000    # 8.0f

    .line 512
    .line 513
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 514
    .line 515
    .line 516
    const/high16 v0, 0x40a00000    # 5.0f

    .line 517
    .line 518
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 519
    .line 520
    .line 521
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 522
    .line 523
    .line 524
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 525
    .line 526
    .line 527
    move-result-object v2

    .line 528
    const/16 v16, 0x3800

    .line 529
    .line 530
    const/16 v17, 0x0

    .line 531
    .line 532
    const/high16 v6, 0x3f800000    # 1.0f

    .line 533
    .line 534
    const/4 v7, 0x0

    .line 535
    const/high16 v12, 0x3f800000    # 1.0f

    .line 536
    .line 537
    const/4 v13, 0x0

    .line 538
    const/4 v14, 0x0

    .line 539
    const/4 v15, 0x0

    .line 540
    const-string v4, ""

    .line 541
    .line 542
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 543
    .line 544
    .line 545
    move-result-object v0

    .line 546
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 547
    .line 548
    .line 549
    move-result-object v0

    .line 550
    sput-object v0, Landroidx/compose/material/icons/rounded/HourglassDisabledKt;->_hourglassDisabled:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 551
    .line 552
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 553
    .line 554
    .line 555
    return-object v0
.end method
