.class public final Landroidx/compose/material/icons/sharp/Groups3Kt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_groups3",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "Groups3",
        "Landroidx/compose/material/icons/Icons$Sharp;",
        "getGroups3",
        "(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;",
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
        "SMAP\nGroups3.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Groups3.kt\nandroidx/compose/material/icons/sharp/Groups3Kt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,89:1\n212#2,12:90\n233#2,18:103\n253#2:140\n233#2,18:141\n253#2:178\n233#2,18:179\n253#2:216\n233#2,18:217\n253#2:254\n233#2,18:255\n253#2:292\n233#2,18:293\n253#2:330\n174#3:102\n705#4,2:121\n717#4,2:123\n719#4,11:129\n705#4,2:159\n717#4,2:161\n719#4,11:167\n705#4,2:197\n717#4,2:199\n719#4,11:205\n705#4,2:235\n717#4,2:237\n719#4,11:243\n705#4,2:273\n717#4,2:275\n719#4,11:281\n705#4,2:311\n717#4,2:313\n719#4,11:319\n72#5,4:125\n72#5,4:163\n72#5,4:201\n72#5,4:239\n72#5,4:277\n72#5,4:315\n*S KotlinDebug\n*F\n+ 1 Groups3.kt\nandroidx/compose/material/icons/sharp/Groups3Kt\n*L\n29#1:90,12\n30#1:103,18\n30#1:140\n41#1:141,18\n41#1:178\n52#1:179,18\n52#1:216\n63#1:217,18\n63#1:254\n71#1:255,18\n71#1:292\n78#1:293,18\n78#1:330\n29#1:102\n30#1:121,2\n30#1:123,2\n30#1:129,11\n41#1:159,2\n41#1:161,2\n41#1:167,11\n52#1:197,2\n52#1:199,2\n52#1:205,11\n63#1:235,2\n63#1:237,2\n63#1:243,11\n71#1:273,2\n71#1:275,2\n71#1:281,11\n78#1:311,2\n78#1:313,2\n78#1:319,11\n30#1:125,4\n41#1:163,4\n52#1:201,4\n63#1:239,4\n71#1:277,4\n78#1:315,4\n*E\n"
    }
.end annotation


# static fields
.field private static _groups3:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getGroups3(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/sharp/Groups3Kt;->_groups3:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Sharp.Groups3"

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
    const v4, 0x4181eb85    # 16.24f

    .line 71
    .line 72
    .line 73
    const v6, 0x415a6666    # 13.65f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v25, -0x3f7851ec    # -4.24f

    .line 80
    .line 81
    .line 82
    const v26, -0x4099999a    # -0.9f

    .line 83
    .line 84
    .line 85
    const v21, -0x406a3d71    # -1.17f

    .line 86
    .line 87
    .line 88
    const v22, -0x40fae148    # -0.52f

    .line 89
    .line 90
    .line 91
    const v23, -0x3fd8f5c3    # -2.61f

    .line 92
    .line 93
    .line 94
    const v24, -0x4099999a    # -0.9f

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
    const v26, 0x3f666666    # 0.9f

    .line 103
    .line 104
    .line 105
    const v21, -0x402f5c29    # -1.63f

    .line 106
    .line 107
    .line 108
    const/16 v22, 0x0

    .line 109
    .line 110
    const v23, -0x3fbb851f    # -3.07f

    .line 111
    .line 112
    .line 113
    const v24, 0x3ec7ae14    # 0.39f

    .line 114
    .line 115
    .line 116
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 117
    .line 118
    .line 119
    const/high16 v25, 0x40c00000    # 6.0f

    .line 120
    .line 121
    const v26, 0x41831eb8    # 16.39f

    .line 122
    .line 123
    .line 124
    const v21, 0x40d5c28f    # 6.68f

    .line 125
    .line 126
    .line 127
    const v22, 0x4162147b    # 14.13f

    .line 128
    .line 129
    .line 130
    const/high16 v23, 0x40c00000    # 6.0f

    .line 131
    .line 132
    const v24, 0x41735c29    # 15.21f

    .line 133
    .line 134
    .line 135
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 136
    .line 137
    .line 138
    const/high16 v4, 0x41900000    # 18.0f

    .line 139
    .line 140
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 141
    .line 142
    .line 143
    const/high16 v4, 0x41400000    # 12.0f

    .line 144
    .line 145
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 146
    .line 147
    .line 148
    const v4, -0x4031eb85    # -1.61f

    .line 149
    .line 150
    .line 151
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 152
    .line 153
    .line 154
    const v25, 0x4181eb85    # 16.24f

    .line 155
    .line 156
    .line 157
    const v26, 0x415a6666    # 13.65f

    .line 158
    .line 159
    .line 160
    const/high16 v21, 0x41900000    # 18.0f

    .line 161
    .line 162
    const v22, 0x41735c29    # 15.21f

    .line 163
    .line 164
    .line 165
    const v23, 0x418a8f5c    # 17.32f

    .line 166
    .line 167
    .line 168
    const v24, 0x4162147b    # 14.13f

    .line 169
    .line 170
    .line 171
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 172
    .line 173
    .line 174
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 175
    .line 176
    .line 177
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 178
    .line 179
    .line 180
    move-result-object v2

    .line 181
    const/16 v16, 0x3800

    .line 182
    .line 183
    const/16 v17, 0x0

    .line 184
    .line 185
    const/high16 v6, 0x3f800000    # 1.0f

    .line 186
    .line 187
    const/high16 v8, 0x3f800000    # 1.0f

    .line 188
    .line 189
    const/4 v7, 0x0

    .line 190
    const/high16 v9, 0x3f800000    # 1.0f

    .line 191
    .line 192
    const/high16 v12, 0x3f800000    # 1.0f

    .line 193
    .line 194
    const/4 v13, 0x0

    .line 195
    const/4 v14, 0x0

    .line 196
    const/4 v15, 0x0

    .line 197
    const-string v4, ""

    .line 198
    .line 199
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 200
    .line 201
    .line 202
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 203
    .line 204
    .line 205
    move-result v3

    .line 206
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 207
    .line 208
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 209
    .line 210
    .line 211
    move-result-wide v6

    .line 212
    const/4 v2, 0x0

    .line 213
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 214
    .line 215
    .line 216
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 217
    .line 218
    .line 219
    move-result v10

    .line 220
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 221
    .line 222
    .line 223
    move-result v11

    .line 224
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 225
    .line 226
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 227
    .line 228
    .line 229
    const v4, 0x3f9c28f6    # 1.22f

    .line 230
    .line 231
    .line 232
    const v6, 0x416947ae    # 14.58f

    .line 233
    .line 234
    .line 235
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 236
    .line 237
    .line 238
    const/16 v25, 0x0

    .line 239
    .line 240
    const v26, 0x418370a4    # 16.43f

    .line 241
    .line 242
    .line 243
    const v21, 0x3ef5c28f    # 0.48f

    .line 244
    .line 245
    .line 246
    const v22, 0x416e6666    # 14.9f

    .line 247
    .line 248
    .line 249
    const/16 v23, 0x0

    .line 250
    .line 251
    const v24, 0x4179eb85    # 15.62f

    .line 252
    .line 253
    .line 254
    move-object/from16 v20, v2

    .line 255
    .line 256
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 257
    .line 258
    .line 259
    const/high16 v4, 0x41900000    # 18.0f

    .line 260
    .line 261
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 262
    .line 263
    .line 264
    const/high16 v4, 0x40900000    # 4.5f

    .line 265
    .line 266
    const/4 v6, 0x0

    .line 267
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 268
    .line 269
    .line 270
    const v4, -0x4031eb85    # -1.61f

    .line 271
    .line 272
    .line 273
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 274
    .line 275
    .line 276
    const v25, 0x3f2147ae    # 0.63f

    .line 277
    .line 278
    .line 279
    const v26, -0x3fed70a4    # -2.29f

    .line 280
    .line 281
    .line 282
    const/16 v21, 0x0

    .line 283
    .line 284
    const v22, -0x40ab851f    # -0.83f

    .line 285
    .line 286
    .line 287
    const v23, 0x3e6b851f    # 0.23f

    .line 288
    .line 289
    .line 290
    const v24, -0x4031eb85    # -1.61f

    .line 291
    .line 292
    .line 293
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 294
    .line 295
    .line 296
    const/high16 v25, 0x40800000    # 4.0f

    .line 297
    .line 298
    const/high16 v26, 0x41600000    # 14.0f

    .line 299
    .line 300
    const v21, 0x409851ec    # 4.76f

    .line 301
    .line 302
    .line 303
    const v22, 0x4160a3d7    # 14.04f

    .line 304
    .line 305
    .line 306
    const v23, 0x408c7ae1    # 4.39f

    .line 307
    .line 308
    .line 309
    const/high16 v24, 0x41600000    # 14.0f

    .line 310
    .line 311
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 312
    .line 313
    .line 314
    const v25, 0x3f9c28f6    # 1.22f

    .line 315
    .line 316
    .line 317
    const v26, 0x416947ae    # 14.58f

    .line 318
    .line 319
    .line 320
    const v21, 0x4040a3d7    # 3.01f

    .line 321
    .line 322
    .line 323
    const/high16 v22, 0x41600000    # 14.0f

    .line 324
    .line 325
    const v23, 0x40047ae1    # 2.07f

    .line 326
    .line 327
    .line 328
    const v24, 0x41635c29    # 14.21f

    .line 329
    .line 330
    .line 331
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 332
    .line 333
    .line 334
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 335
    .line 336
    .line 337
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 338
    .line 339
    .line 340
    move-result-object v2

    .line 341
    const/high16 v6, 0x3f800000    # 1.0f

    .line 342
    .line 343
    const/4 v7, 0x0

    .line 344
    const-string v4, ""

    .line 345
    .line 346
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 347
    .line 348
    .line 349
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 350
    .line 351
    .line 352
    move-result v3

    .line 353
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 354
    .line 355
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 356
    .line 357
    .line 358
    move-result-wide v6

    .line 359
    const/4 v2, 0x0

    .line 360
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 361
    .line 362
    .line 363
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 364
    .line 365
    .line 366
    move-result v10

    .line 367
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 368
    .line 369
    .line 370
    move-result v11

    .line 371
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 372
    .line 373
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 374
    .line 375
    .line 376
    const v4, 0x41b63d71    # 22.78f

    .line 377
    .line 378
    .line 379
    const v6, 0x416947ae    # 14.58f

    .line 380
    .line 381
    .line 382
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 383
    .line 384
    .line 385
    const/high16 v25, 0x41a00000    # 20.0f

    .line 386
    .line 387
    const/high16 v26, 0x41600000    # 14.0f

    .line 388
    .line 389
    const v21, 0x41af70a4    # 21.93f

    .line 390
    .line 391
    .line 392
    const v22, 0x41635c29    # 14.21f

    .line 393
    .line 394
    .line 395
    const v23, 0x41a7eb85    # 20.99f

    .line 396
    .line 397
    .line 398
    const/high16 v24, 0x41600000    # 14.0f

    .line 399
    .line 400
    move-object/from16 v20, v2

    .line 401
    .line 402
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 403
    .line 404
    .line 405
    const v25, -0x406f5c29    # -1.13f

    .line 406
    .line 407
    .line 408
    const v26, 0x3dcccccd    # 0.1f

    .line 409
    .line 410
    .line 411
    const v21, -0x413851ec    # -0.39f

    .line 412
    .line 413
    .line 414
    const/16 v22, 0x0

    .line 415
    .line 416
    const v23, -0x40bd70a4    # -0.76f

    .line 417
    .line 418
    .line 419
    const v24, 0x3d23d70a    # 0.04f

    .line 420
    .line 421
    .line 422
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 423
    .line 424
    .line 425
    const v25, 0x3f2147ae    # 0.63f

    .line 426
    .line 427
    .line 428
    const v26, 0x40128f5c    # 2.29f

    .line 429
    .line 430
    .line 431
    const v21, 0x3ecccccd    # 0.4f

    .line 432
    .line 433
    .line 434
    const v22, 0x3f2e147b    # 0.68f

    .line 435
    .line 436
    .line 437
    const v23, 0x3f2147ae    # 0.63f

    .line 438
    .line 439
    .line 440
    const v24, 0x3fbae148    # 1.46f

    .line 441
    .line 442
    .line 443
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 444
    .line 445
    .line 446
    const/high16 v4, 0x41900000    # 18.0f

    .line 447
    .line 448
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 449
    .line 450
    .line 451
    const/high16 v4, 0x40900000    # 4.5f

    .line 452
    .line 453
    const/4 v6, 0x0

    .line 454
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 455
    .line 456
    .line 457
    const v4, -0x40370a3d    # -1.57f

    .line 458
    .line 459
    .line 460
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 461
    .line 462
    .line 463
    const v25, 0x41b63d71    # 22.78f

    .line 464
    .line 465
    .line 466
    const v26, 0x416947ae    # 14.58f

    .line 467
    .line 468
    .line 469
    const/high16 v21, 0x41c00000    # 24.0f

    .line 470
    .line 471
    const v22, 0x4179eb85    # 15.62f

    .line 472
    .line 473
    .line 474
    const v23, 0x41bc28f6    # 23.52f

    .line 475
    .line 476
    .line 477
    const v24, 0x416e6666    # 14.9f

    .line 478
    .line 479
    .line 480
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 481
    .line 482
    .line 483
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 484
    .line 485
    .line 486
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 487
    .line 488
    .line 489
    move-result-object v2

    .line 490
    const/high16 v6, 0x3f800000    # 1.0f

    .line 491
    .line 492
    const/4 v7, 0x0

    .line 493
    const-string v4, ""

    .line 494
    .line 495
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 496
    .line 497
    .line 498
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 499
    .line 500
    .line 501
    move-result v3

    .line 502
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 503
    .line 504
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 505
    .line 506
    .line 507
    move-result-wide v6

    .line 508
    const/4 v2, 0x0

    .line 509
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 510
    .line 511
    .line 512
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 513
    .line 514
    .line 515
    move-result v10

    .line 516
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 517
    .line 518
    .line 519
    move-result v11

    .line 520
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 521
    .line 522
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 523
    .line 524
    .line 525
    const/high16 v4, 0x41400000    # 12.0f

    .line 526
    .line 527
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 528
    .line 529
    .line 530
    const/high16 v25, 0x40400000    # 3.0f

    .line 531
    .line 532
    const/high16 v26, -0x3fc00000    # -3.0f

    .line 533
    .line 534
    const v21, 0x3fd47ae1    # 1.66f

    .line 535
    .line 536
    .line 537
    const/16 v22, 0x0

    .line 538
    .line 539
    const/high16 v23, 0x40400000    # 3.0f

    .line 540
    .line 541
    const v24, -0x40547ae1    # -1.34f

    .line 542
    .line 543
    .line 544
    move-object/from16 v20, v2

    .line 545
    .line 546
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 547
    .line 548
    .line 549
    const/high16 v25, -0x3fc00000    # -3.0f

    .line 550
    .line 551
    const/16 v21, 0x0

    .line 552
    .line 553
    const v22, -0x402b851f    # -1.66f

    .line 554
    .line 555
    .line 556
    const v23, -0x40547ae1    # -1.34f

    .line 557
    .line 558
    .line 559
    const/high16 v24, -0x3fc00000    # -3.0f

    .line 560
    .line 561
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 562
    .line 563
    .line 564
    const v4, 0x40eae148    # 7.34f

    .line 565
    .line 566
    .line 567
    const/high16 v6, 0x41100000    # 9.0f

    .line 568
    .line 569
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 570
    .line 571
    .line 572
    const/high16 v25, 0x41400000    # 12.0f

    .line 573
    .line 574
    const/high16 v26, 0x41400000    # 12.0f

    .line 575
    .line 576
    const/high16 v21, 0x41100000    # 9.0f

    .line 577
    .line 578
    const v22, 0x412a8f5c    # 10.66f

    .line 579
    .line 580
    .line 581
    const v23, 0x412570a4    # 10.34f

    .line 582
    .line 583
    .line 584
    const/high16 v24, 0x41400000    # 12.0f

    .line 585
    .line 586
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 587
    .line 588
    .line 589
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 590
    .line 591
    .line 592
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 593
    .line 594
    .line 595
    move-result-object v2

    .line 596
    const/high16 v6, 0x3f800000    # 1.0f

    .line 597
    .line 598
    const/4 v7, 0x0

    .line 599
    const-string v4, ""

    .line 600
    .line 601
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 602
    .line 603
    .line 604
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 605
    .line 606
    .line 607
    move-result v3

    .line 608
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 609
    .line 610
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 611
    .line 612
    .line 613
    move-result-wide v6

    .line 614
    const/4 v2, 0x0

    .line 615
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 616
    .line 617
    .line 618
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 619
    .line 620
    .line 621
    move-result v10

    .line 622
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 623
    .line 624
    .line 625
    move-result v11

    .line 626
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 627
    .line 628
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 629
    .line 630
    .line 631
    const v4, 0x3fbf9db2    # 1.497f

    .line 632
    .line 633
    .line 634
    const/high16 v6, 0x41300000    # 11.0f

    .line 635
    .line 636
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 637
    .line 638
    .line 639
    const v4, -0x3fdfced9    # -2.503f

    .line 640
    .line 641
    .line 642
    const v6, 0x40203127    # 2.503f

    .line 643
    .line 644
    .line 645
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 646
    .line 647
    .line 648
    const v4, 0x40203127    # 2.503f

    .line 649
    .line 650
    .line 651
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 652
    .line 653
    .line 654
    const v4, -0x3fdfced9    # -2.503f

    .line 655
    .line 656
    .line 657
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 658
    .line 659
    .line 660
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 661
    .line 662
    .line 663
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 664
    .line 665
    .line 666
    move-result-object v2

    .line 667
    const/high16 v6, 0x3f800000    # 1.0f

    .line 668
    .line 669
    const/4 v7, 0x0

    .line 670
    const-string v4, ""

    .line 671
    .line 672
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 673
    .line 674
    .line 675
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 676
    .line 677
    .line 678
    move-result v3

    .line 679
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 680
    .line 681
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 682
    .line 683
    .line 684
    move-result-wide v6

    .line 685
    const/4 v0, 0x0

    .line 686
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 687
    .line 688
    .line 689
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 690
    .line 691
    .line 692
    move-result v10

    .line 693
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 694
    .line 695
    .line 696
    move-result v11

    .line 697
    new-instance v0, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 698
    .line 699
    invoke-direct {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 700
    .line 701
    .line 702
    const/high16 v2, 0x41a00000    # 20.0f

    .line 703
    .line 704
    const/high16 v4, 0x41100000    # 9.0f

    .line 705
    .line 706
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 707
    .line 708
    .line 709
    const/high16 v2, -0x3fe00000    # -2.5f

    .line 710
    .line 711
    const/high16 v4, 0x40800000    # 4.0f

    .line 712
    .line 713
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 714
    .line 715
    .line 716
    const/high16 v2, 0x40a00000    # 5.0f

    .line 717
    .line 718
    const/4 v4, 0x0

    .line 719
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 720
    .line 721
    .line 722
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 723
    .line 724
    .line 725
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 726
    .line 727
    .line 728
    move-result-object v2

    .line 729
    const/high16 v6, 0x3f800000    # 1.0f

    .line 730
    .line 731
    const/4 v7, 0x0

    .line 732
    const-string v4, ""

    .line 733
    .line 734
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 735
    .line 736
    .line 737
    move-result-object v0

    .line 738
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 739
    .line 740
    .line 741
    move-result-object v0

    .line 742
    sput-object v0, Landroidx/compose/material/icons/sharp/Groups3Kt;->_groups3:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 743
    .line 744
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 745
    .line 746
    .line 747
    return-object v0
.end method
