.class public final Landroidx/compose/material/icons/twotone/HeartBrokenKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_heartBroken",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "HeartBroken",
        "Landroidx/compose/material/icons/Icons$TwoTone;",
        "getHeartBroken",
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
        "SMAP\nHeartBroken.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HeartBroken.kt\nandroidx/compose/material/icons/twotone/HeartBrokenKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,87:1\n212#2,12:88\n233#2,18:101\n253#2:138\n233#2,18:139\n253#2:176\n233#2,18:177\n253#2:214\n174#3:100\n705#4,2:119\n717#4,2:121\n719#4,11:127\n705#4,2:157\n717#4,2:159\n719#4,11:165\n705#4,2:195\n717#4,2:197\n719#4,11:203\n72#5,4:123\n72#5,4:161\n72#5,4:199\n*S KotlinDebug\n*F\n+ 1 HeartBroken.kt\nandroidx/compose/material/icons/twotone/HeartBrokenKt\n*L\n29#1:88,12\n30#1:101,18\n30#1:138\n40#1:139,18\n40#1:176\n50#1:177,18\n50#1:214\n29#1:100\n30#1:119,2\n30#1:121,2\n30#1:127,11\n40#1:157,2\n40#1:159,2\n40#1:165,11\n50#1:195,2\n50#1:197,2\n50#1:203,11\n30#1:123,4\n40#1:161,4\n50#1:199,4\n*E\n"
    }
.end annotation


# static fields
.field private static _heartBroken:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getHeartBroken(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/HeartBrokenKt;->_heartBroken:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.HeartBroken"

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
    const v4, 0x40ad70a4    # 5.42f

    .line 71
    .line 72
    .line 73
    const v6, 0x4113ae14    # 9.23f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const/high16 v25, 0x40f00000    # 7.5f

    .line 80
    .line 81
    const/high16 v26, 0x40a00000    # 5.0f

    .line 82
    .line 83
    const v21, 0x410b0a3d    # 8.69f

    .line 84
    .line 85
    .line 86
    const v22, 0x40a4cccd    # 5.15f

    .line 87
    .line 88
    .line 89
    const v23, 0x410170a4    # 8.09f

    .line 90
    .line 91
    .line 92
    const/high16 v24, 0x40a00000    # 5.0f

    .line 93
    .line 94
    move-object/from16 v20, v2

    .line 95
    .line 96
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 97
    .line 98
    .line 99
    const/high16 v25, 0x40800000    # 4.0f

    .line 100
    .line 101
    const/high16 v26, 0x41080000    # 8.5f

    .line 102
    .line 103
    const v21, 0x40b147ae    # 5.54f

    .line 104
    .line 105
    .line 106
    const/high16 v22, 0x40a00000    # 5.0f

    .line 107
    .line 108
    const/high16 v23, 0x40800000    # 4.0f

    .line 109
    .line 110
    const v24, 0x40d147ae    # 6.54f

    .line 111
    .line 112
    .line 113
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 114
    .line 115
    .line 116
    const v25, 0x40c7ae14    # 6.24f

    .line 117
    .line 118
    .line 119
    const v26, 0x4103ae14    # 8.23f

    .line 120
    .line 121
    .line 122
    const/16 v21, 0x0

    .line 123
    .line 124
    const/high16 v22, 0x40200000    # 2.5f

    .line 125
    .line 126
    const v23, 0x401ccccd    # 2.45f

    .line 127
    .line 128
    .line 129
    const v24, 0x409ae148    # 4.84f

    .line 130
    .line 131
    .line 132
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 133
    .line 134
    .line 135
    const v4, 0x412c51ec    # 10.77f

    .line 136
    .line 137
    .line 138
    const/high16 v6, 0x41400000    # 12.0f

    .line 139
    .line 140
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 141
    .line 142
    .line 143
    const v4, 0x40eb3333    # 7.35f

    .line 144
    .line 145
    .line 146
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 147
    .line 148
    .line 149
    const v4, 0x40ad70a4    # 5.42f

    .line 150
    .line 151
    .line 152
    const v6, 0x4113ae14    # 9.23f

    .line 153
    .line 154
    .line 155
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

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
    const/high16 v4, 0x40a00000    # 5.0f

    .line 216
    .line 217
    const/high16 v6, 0x41840000    # 16.5f

    .line 218
    .line 219
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 220
    .line 221
    .line 222
    const v25, -0x4070a3d7    # -1.12f

    .line 223
    .line 224
    .line 225
    const v26, 0x3e3851ec    # 0.18f

    .line 226
    .line 227
    .line 228
    const v21, -0x41428f5c    # -0.37f

    .line 229
    .line 230
    .line 231
    const/16 v22, 0x0

    .line 232
    .line 233
    const/high16 v23, -0x40c00000    # -0.75f

    .line 234
    .line 235
    const v24, 0x3d75c28f    # 0.06f

    .line 236
    .line 237
    .line 238
    move-object/from16 v20, v2

    .line 239
    .line 240
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 241
    .line 242
    .line 243
    const v4, 0x416c51ec    # 14.77f

    .line 244
    .line 245
    .line 246
    const/high16 v6, 0x40e00000    # 7.0f

    .line 247
    .line 248
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 249
    .line 250
    .line 251
    const v4, 0x403a3d71    # 2.91f

    .line 252
    .line 253
    .line 254
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 255
    .line 256
    .line 257
    const v4, -0x3fdc28f6    # -2.56f

    .line 258
    .line 259
    .line 260
    const v6, 0x41087ae1    # 8.53f

    .line 261
    .line 262
    .line 263
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 264
    .line 265
    .line 266
    const/high16 v25, 0x41a00000    # 20.0f

    .line 267
    .line 268
    const/high16 v26, 0x41080000    # 8.5f

    .line 269
    .line 270
    const v21, 0x418fd70a    # 17.98f

    .line 271
    .line 272
    .line 273
    const v22, 0x414ee148    # 12.93f

    .line 274
    .line 275
    .line 276
    const/high16 v23, 0x41a00000    # 20.0f

    .line 277
    .line 278
    const v24, 0x412b5c29    # 10.71f

    .line 279
    .line 280
    .line 281
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 282
    .line 283
    .line 284
    const/high16 v25, 0x41840000    # 16.5f

    .line 285
    .line 286
    const/high16 v26, 0x40a00000    # 5.0f

    .line 287
    .line 288
    const/high16 v21, 0x41a00000    # 20.0f

    .line 289
    .line 290
    const v22, 0x40d147ae    # 6.54f

    .line 291
    .line 292
    .line 293
    const v23, 0x4193ae14    # 18.46f

    .line 294
    .line 295
    .line 296
    const/high16 v24, 0x40a00000    # 5.0f

    .line 297
    .line 298
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 299
    .line 300
    .line 301
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 302
    .line 303
    .line 304
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 305
    .line 306
    .line 307
    move-result-object v2

    .line 308
    const v6, 0x3e99999a    # 0.3f

    .line 309
    .line 310
    .line 311
    const/4 v7, 0x0

    .line 312
    const-string v4, ""

    .line 313
    .line 314
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 315
    .line 316
    .line 317
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 318
    .line 319
    .line 320
    move-result v3

    .line 321
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 322
    .line 323
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 324
    .line 325
    .line 326
    move-result-wide v6

    .line 327
    const/4 v0, 0x0

    .line 328
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 329
    .line 330
    .line 331
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 332
    .line 333
    .line 334
    move-result v10

    .line 335
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 336
    .line 337
    .line 338
    move-result v11

    .line 339
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 340
    .line 341
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 342
    .line 343
    .line 344
    const/high16 v0, 0x40400000    # 3.0f

    .line 345
    .line 346
    const/high16 v2, 0x41840000    # 16.5f

    .line 347
    .line 348
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 349
    .line 350
    .line 351
    const v17, -0x3fd147ae    # -2.73f

    .line 352
    .line 353
    .line 354
    const v18, 0x3f30a3d7    # 0.69f

    .line 355
    .line 356
    .line 357
    const v13, -0x408a3d71    # -0.96f

    .line 358
    .line 359
    .line 360
    const v15, -0x400ccccd    # -1.9f

    .line 361
    .line 362
    .line 363
    const/high16 v16, 0x3e800000    # 0.25f

    .line 364
    .line 365
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 366
    .line 367
    .line 368
    const/high16 v0, 0x41100000    # 9.0f

    .line 369
    .line 370
    const/high16 v2, 0x41400000    # 12.0f

    .line 371
    .line 372
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 373
    .line 374
    .line 375
    const/high16 v0, 0x40400000    # 3.0f

    .line 376
    .line 377
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 378
    .line 379
    .line 380
    const/high16 v0, 0x41200000    # 10.0f

    .line 381
    .line 382
    const/high16 v2, -0x3fc00000    # -3.0f

    .line 383
    .line 384
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 385
    .line 386
    .line 387
    const/high16 v0, 0x3f800000    # 1.0f

    .line 388
    .line 389
    const/high16 v2, -0x3ef00000    # -9.0f

    .line 390
    .line 391
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 392
    .line 393
    .line 394
    const/high16 v0, -0x3fc00000    # -3.0f

    .line 395
    .line 396
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 397
    .line 398
    .line 399
    const v0, 0x3fc51eb8    # 1.54f

    .line 400
    .line 401
    .line 402
    const v2, -0x3f53851f    # -5.39f

    .line 403
    .line 404
    .line 405
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 406
    .line 407
    .line 408
    const/high16 v17, 0x40f00000    # 7.5f

    .line 409
    .line 410
    const/high16 v18, 0x40400000    # 3.0f

    .line 411
    .line 412
    const v13, 0x4127851f    # 10.47f

    .line 413
    .line 414
    .line 415
    const v14, 0x40670a3d    # 3.61f

    .line 416
    .line 417
    .line 418
    const v15, 0x411028f6    # 9.01f

    .line 419
    .line 420
    .line 421
    const/high16 v16, 0x40400000    # 3.0f

    .line 422
    .line 423
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 424
    .line 425
    .line 426
    const/high16 v17, 0x40000000    # 2.0f

    .line 427
    .line 428
    const/high16 v18, 0x41080000    # 8.5f

    .line 429
    .line 430
    const v13, 0x408d70a4    # 4.42f

    .line 431
    .line 432
    .line 433
    const/high16 v14, 0x40400000    # 3.0f

    .line 434
    .line 435
    const/high16 v15, 0x40000000    # 2.0f

    .line 436
    .line 437
    const v16, 0x40ad70a4    # 5.42f

    .line 438
    .line 439
    .line 440
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 441
    .line 442
    .line 443
    const/high16 v17, 0x41200000    # 10.0f

    .line 444
    .line 445
    const/high16 v18, 0x41480000    # 12.5f

    .line 446
    .line 447
    const/4 v13, 0x0

    .line 448
    const v14, 0x408428f6    # 4.13f

    .line 449
    .line 450
    .line 451
    const v15, 0x40851eb8    # 4.16f

    .line 452
    .line 453
    .line 454
    const v16, 0x40e5c28f    # 7.18f

    .line 455
    .line 456
    .line 457
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 458
    .line 459
    .line 460
    const/high16 v18, -0x3eb80000    # -12.5f

    .line 461
    .line 462
    const v13, 0x40af0a3d    # 5.47f

    .line 463
    .line 464
    .line 465
    const v14, -0x3f61eb85    # -4.94f

    .line 466
    .line 467
    .line 468
    const/high16 v15, 0x41200000    # 10.0f

    .line 469
    .line 470
    const v16, -0x3efbd70a    # -8.26f

    .line 471
    .line 472
    .line 473
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 474
    .line 475
    .line 476
    const/high16 v17, 0x41840000    # 16.5f

    .line 477
    .line 478
    const/high16 v18, 0x40400000    # 3.0f

    .line 479
    .line 480
    const/high16 v13, 0x41b00000    # 22.0f

    .line 481
    .line 482
    const v14, 0x40ad70a4    # 5.42f

    .line 483
    .line 484
    .line 485
    const v15, 0x419ca3d7    # 19.58f

    .line 486
    .line 487
    .line 488
    const/high16 v16, 0x40400000    # 3.0f

    .line 489
    .line 490
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 491
    .line 492
    .line 493
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 494
    .line 495
    .line 496
    const v0, 0x4185d70a    # 16.73f

    .line 497
    .line 498
    .line 499
    const v2, 0x4123d70a    # 10.24f

    .line 500
    .line 501
    .line 502
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 503
    .line 504
    .line 505
    const/high16 v17, 0x40800000    # 4.0f

    .line 506
    .line 507
    const/high16 v18, 0x41080000    # 8.5f

    .line 508
    .line 509
    const v13, 0x40ce6666    # 6.45f

    .line 510
    .line 511
    .line 512
    const v14, 0x415570a4    # 13.34f

    .line 513
    .line 514
    .line 515
    const/high16 v15, 0x40800000    # 4.0f

    .line 516
    .line 517
    const/high16 v16, 0x41300000    # 11.0f

    .line 518
    .line 519
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 520
    .line 521
    .line 522
    const/high16 v17, 0x40f00000    # 7.5f

    .line 523
    .line 524
    const/high16 v18, 0x40a00000    # 5.0f

    .line 525
    .line 526
    const/high16 v13, 0x40800000    # 4.0f

    .line 527
    .line 528
    const v14, 0x40d147ae    # 6.54f

    .line 529
    .line 530
    .line 531
    const v15, 0x40b147ae    # 5.54f

    .line 532
    .line 533
    .line 534
    const/high16 v16, 0x40a00000    # 5.0f

    .line 535
    .line 536
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 537
    .line 538
    .line 539
    const v17, 0x3fdd70a4    # 1.73f

    .line 540
    .line 541
    .line 542
    const v18, 0x3ed70a3d    # 0.42f

    .line 543
    .line 544
    .line 545
    const v13, 0x3f170a3d    # 0.59f

    .line 546
    .line 547
    .line 548
    const/4 v14, 0x0

    .line 549
    const v15, 0x3f9851ec    # 1.19f

    .line 550
    .line 551
    .line 552
    const v16, 0x3e19999a    # 0.15f

    .line 553
    .line 554
    .line 555
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 556
    .line 557
    .line 558
    const v0, 0x40eb3333    # 7.35f

    .line 559
    .line 560
    .line 561
    const/high16 v2, 0x41400000    # 12.0f

    .line 562
    .line 563
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 564
    .line 565
    .line 566
    const v0, 0x405ae148    # 3.42f

    .line 567
    .line 568
    .line 569
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 570
    .line 571
    .line 572
    const v0, 0x4185d70a    # 16.73f

    .line 573
    .line 574
    .line 575
    const v2, 0x4123d70a    # 10.24f

    .line 576
    .line 577
    .line 578
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 579
    .line 580
    .line 581
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 582
    .line 583
    .line 584
    const v0, 0x4172147b    # 15.13f

    .line 585
    .line 586
    .line 587
    const v2, 0x41787ae1    # 15.53f

    .line 588
    .line 589
    .line 590
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 591
    .line 592
    .line 593
    const v0, 0x418d851f    # 17.69f

    .line 594
    .line 595
    .line 596
    const/high16 v2, 0x40e00000    # 7.0f

    .line 597
    .line 598
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 599
    .line 600
    .line 601
    const v0, -0x3fc5c28f    # -2.91f

    .line 602
    .line 603
    .line 604
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 605
    .line 606
    .line 607
    const v0, 0x3f1c28f6    # 0.61f

    .line 608
    .line 609
    .line 610
    const v2, -0x40170a3d    # -1.82f

    .line 611
    .line 612
    .line 613
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 614
    .line 615
    .line 616
    const/high16 v17, 0x41840000    # 16.5f

    .line 617
    .line 618
    const/high16 v18, 0x40a00000    # 5.0f

    .line 619
    .line 620
    const/high16 v13, 0x417c0000    # 15.75f

    .line 621
    .line 622
    const v14, 0x40a1eb85    # 5.06f

    .line 623
    .line 624
    .line 625
    const v15, 0x41810a3d    # 16.13f

    .line 626
    .line 627
    .line 628
    const/high16 v16, 0x40a00000    # 5.0f

    .line 629
    .line 630
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 631
    .line 632
    .line 633
    const/high16 v17, 0x41a00000    # 20.0f

    .line 634
    .line 635
    const/high16 v18, 0x41080000    # 8.5f

    .line 636
    .line 637
    const v13, 0x4193ae14    # 18.46f

    .line 638
    .line 639
    .line 640
    const/high16 v14, 0x40a00000    # 5.0f

    .line 641
    .line 642
    const/high16 v15, 0x41a00000    # 20.0f

    .line 643
    .line 644
    const v16, 0x40d147ae    # 6.54f

    .line 645
    .line 646
    .line 647
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 648
    .line 649
    .line 650
    const v17, 0x4172147b    # 15.13f

    .line 651
    .line 652
    .line 653
    const v18, 0x41787ae1    # 15.53f

    .line 654
    .line 655
    .line 656
    const/high16 v13, 0x41a00000    # 20.0f

    .line 657
    .line 658
    const v14, 0x412b5c29    # 10.71f

    .line 659
    .line 660
    .line 661
    const v15, 0x418fd70a    # 17.98f

    .line 662
    .line 663
    .line 664
    const v16, 0x414ee148    # 12.93f

    .line 665
    .line 666
    .line 667
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 668
    .line 669
    .line 670
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 671
    .line 672
    .line 673
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 674
    .line 675
    .line 676
    move-result-object v2

    .line 677
    const/16 v16, 0x3800

    .line 678
    .line 679
    const/16 v17, 0x0

    .line 680
    .line 681
    const/high16 v6, 0x3f800000    # 1.0f

    .line 682
    .line 683
    const/high16 v8, 0x3f800000    # 1.0f

    .line 684
    .line 685
    const/4 v7, 0x0

    .line 686
    const/high16 v12, 0x3f800000    # 1.0f

    .line 687
    .line 688
    const/4 v13, 0x0

    .line 689
    const/4 v14, 0x0

    .line 690
    const/4 v15, 0x0

    .line 691
    const-string v4, ""

    .line 692
    .line 693
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 694
    .line 695
    .line 696
    move-result-object v0

    .line 697
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 698
    .line 699
    .line 700
    move-result-object v0

    .line 701
    sput-object v0, Landroidx/compose/material/icons/twotone/HeartBrokenKt;->_heartBroken:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 702
    .line 703
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 704
    .line 705
    .line 706
    return-object v0
.end method
