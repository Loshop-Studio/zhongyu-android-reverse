.class public final Landroidx/compose/material/icons/filled/WifiCalling3Kt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_wifiCalling3",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "WifiCalling3",
        "Landroidx/compose/material/icons/Icons$Filled;",
        "getWifiCalling3",
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
        "SMAP\nWifiCalling3.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WifiCalling3.kt\nandroidx/compose/material/icons/filled/WifiCalling3Kt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,83:1\n212#2,12:84\n233#2,18:97\n253#2:134\n233#2,18:135\n253#2:172\n233#2,18:173\n253#2:210\n233#2,18:211\n253#2:248\n174#3:96\n705#4,2:115\n717#4,2:117\n719#4,11:123\n705#4,2:153\n717#4,2:155\n719#4,11:161\n705#4,2:191\n717#4,2:193\n719#4,11:199\n705#4,2:229\n717#4,2:231\n719#4,11:237\n72#5,4:119\n72#5,4:157\n72#5,4:195\n72#5,4:233\n*S KotlinDebug\n*F\n+ 1 WifiCalling3.kt\nandroidx/compose/material/icons/filled/WifiCalling3Kt\n*L\n29#1:84,12\n30#1:97,18\n30#1:134\n40#1:135,18\n40#1:172\n50#1:173,18\n50#1:210\n58#1:211,18\n58#1:248\n29#1:96\n30#1:115,2\n30#1:117,2\n30#1:123,11\n40#1:153,2\n40#1:155,2\n40#1:161,11\n50#1:191,2\n50#1:193,2\n50#1:199,11\n58#1:229,2\n58#1:231,2\n58#1:237,11\n30#1:119,4\n40#1:157,4\n50#1:195,4\n58#1:233,4\n*E\n"
    }
.end annotation


# static fields
.field private static _wifiCalling3:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getWifiCalling3(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/filled/WifiCalling3Kt;->_wifiCalling3:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Filled.WifiCalling3"

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
    const/high16 v4, 0x40400000    # 3.0f

    .line 71
    .line 72
    const v6, 0x4183eb85    # 16.49f

    .line 73
    .line 74
    .line 75
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    const v25, -0x3f4ae148    # -5.66f

    .line 79
    .line 80
    .line 81
    const v26, 0x4015c28f    # 2.34f

    .line 82
    .line 83
    .line 84
    const v21, -0x3ff28f5c    # -2.21f

    .line 85
    .line 86
    .line 87
    const/16 v22, 0x0

    .line 88
    .line 89
    const v23, -0x3f7947ae    # -4.21f

    .line 90
    .line 91
    .line 92
    const v24, 0x3f666666    # 0.9f

    .line 93
    .line 94
    .line 95
    move-object/from16 v20, v2

    .line 96
    .line 97
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 98
    .line 99
    .line 100
    const v4, 0x3f87ae14    # 1.06f

    .line 101
    .line 102
    .line 103
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 104
    .line 105
    .line 106
    const v25, 0x4092e148    # 4.59f

    .line 107
    .line 108
    .line 109
    const v26, -0x400b851f    # -1.91f

    .line 110
    .line 111
    .line 112
    const v21, 0x3f970a3d    # 1.18f

    .line 113
    .line 114
    .line 115
    const v22, -0x4068f5c3    # -1.18f

    .line 116
    .line 117
    .line 118
    const v23, 0x40333333    # 2.8f

    .line 119
    .line 120
    .line 121
    const v24, -0x400b851f    # -1.91f

    .line 122
    .line 123
    .line 124
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 125
    .line 126
    .line 127
    const v4, 0x4092e148    # 4.59f

    .line 128
    .line 129
    .line 130
    const v6, 0x3ff47ae1    # 1.91f

    .line 131
    .line 132
    .line 133
    const v7, 0x405ae148    # 3.42f

    .line 134
    .line 135
    .line 136
    const v8, 0x3f3ae148    # 0.73f

    .line 137
    .line 138
    .line 139
    invoke-virtual {v2, v7, v8, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 140
    .line 141
    .line 142
    const v4, -0x407851ec    # -1.06f

    .line 143
    .line 144
    .line 145
    const v6, 0x3f87ae14    # 1.06f

    .line 146
    .line 147
    .line 148
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 149
    .line 150
    .line 151
    const v25, 0x4183eb85    # 16.49f

    .line 152
    .line 153
    .line 154
    const/high16 v26, 0x40400000    # 3.0f

    .line 155
    .line 156
    const v21, 0x41a5999a    # 20.7f

    .line 157
    .line 158
    .line 159
    const v22, 0x4079999a    # 3.9f

    .line 160
    .line 161
    .line 162
    const v23, 0x4195999a    # 18.7f

    .line 163
    .line 164
    .line 165
    const/high16 v24, 0x40400000    # 3.0f

    .line 166
    .line 167
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 168
    .line 169
    .line 170
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 171
    .line 172
    .line 173
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 174
    .line 175
    .line 176
    move-result-object v2

    .line 177
    const/16 v16, 0x3800

    .line 178
    .line 179
    const/16 v17, 0x0

    .line 180
    .line 181
    const/high16 v6, 0x3f800000    # 1.0f

    .line 182
    .line 183
    const/high16 v8, 0x3f800000    # 1.0f

    .line 184
    .line 185
    const/4 v7, 0x0

    .line 186
    const/high16 v9, 0x3f800000    # 1.0f

    .line 187
    .line 188
    const/high16 v12, 0x3f800000    # 1.0f

    .line 189
    .line 190
    const/4 v13, 0x0

    .line 191
    const/4 v14, 0x0

    .line 192
    const/4 v15, 0x0

    .line 193
    const-string v4, ""

    .line 194
    .line 195
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 196
    .line 197
    .line 198
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 199
    .line 200
    .line 201
    move-result v3

    .line 202
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 203
    .line 204
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 205
    .line 206
    .line 207
    move-result-wide v6

    .line 208
    const/4 v2, 0x0

    .line 209
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 210
    .line 211
    .line 212
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 213
    .line 214
    .line 215
    move-result v10

    .line 216
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 217
    .line 218
    .line 219
    move-result v11

    .line 220
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 221
    .line 222
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 223
    .line 224
    .line 225
    const v4, 0x40eeb852    # 7.46f

    .line 226
    .line 227
    .line 228
    const v6, 0x41a03d71    # 20.03f

    .line 229
    .line 230
    .line 231
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 232
    .line 233
    .line 234
    const/high16 v26, 0x40c00000    # 6.0f

    .line 235
    .line 236
    const v21, 0x4198f5c3    # 19.12f

    .line 237
    .line 238
    .line 239
    const v22, 0x40d1eb85    # 6.56f

    .line 240
    .line 241
    .line 242
    const v23, 0x418ef5c3    # 17.87f

    .line 243
    .line 244
    .line 245
    const/high16 v24, 0x40c00000    # 6.0f

    .line 246
    .line 247
    move-object/from16 v20, v2

    .line 248
    .line 249
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 250
    .line 251
    .line 252
    const v4, -0x3f9d70a4    # -3.54f

    .line 253
    .line 254
    .line 255
    const v6, 0x3fbae148    # 1.46f

    .line 256
    .line 257
    .line 258
    const v7, -0x3fd7ae14    # -2.63f

    .line 259
    .line 260
    .line 261
    const v8, 0x3f0f5c29    # 0.56f

    .line 262
    .line 263
    .line 264
    invoke-virtual {v2, v7, v8, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 265
    .line 266
    .line 267
    const v4, 0x3f87ae14    # 1.06f

    .line 268
    .line 269
    .line 270
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 271
    .line 272
    .line 273
    const v25, 0x401e147b    # 2.47f

    .line 274
    .line 275
    .line 276
    const v26, -0x407c28f6    # -1.03f

    .line 277
    .line 278
    .line 279
    const v21, 0x3f2147ae    # 0.63f

    .line 280
    .line 281
    .line 282
    const v22, -0x40deb852    # -0.63f

    .line 283
    .line 284
    .line 285
    const v23, 0x3fc147ae    # 1.51f

    .line 286
    .line 287
    .line 288
    const v24, -0x407c28f6    # -1.03f

    .line 289
    .line 290
    .line 291
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 292
    .line 293
    .line 294
    const v4, 0x401e147b    # 2.47f

    .line 295
    .line 296
    .line 297
    const v6, 0x3f83d70a    # 1.03f

    .line 298
    .line 299
    .line 300
    const v7, 0x3feb851f    # 1.84f

    .line 301
    .line 302
    .line 303
    const v8, 0x3ec7ae14    # 0.39f

    .line 304
    .line 305
    .line 306
    invoke-virtual {v2, v7, v8, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 307
    .line 308
    .line 309
    const v4, 0x40eeb852    # 7.46f

    .line 310
    .line 311
    .line 312
    const v6, 0x41a03d71    # 20.03f

    .line 313
    .line 314
    .line 315
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 316
    .line 317
    .line 318
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 319
    .line 320
    .line 321
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 322
    .line 323
    .line 324
    move-result-object v2

    .line 325
    const/high16 v6, 0x3f800000    # 1.0f

    .line 326
    .line 327
    const/high16 v8, 0x3f800000    # 1.0f

    .line 328
    .line 329
    const/4 v7, 0x0

    .line 330
    const-string v4, ""

    .line 331
    .line 332
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 333
    .line 334
    .line 335
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 336
    .line 337
    .line 338
    move-result v3

    .line 339
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 340
    .line 341
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 342
    .line 343
    .line 344
    move-result-wide v6

    .line 345
    const/4 v2, 0x0

    .line 346
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 347
    .line 348
    .line 349
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 350
    .line 351
    .line 352
    move-result v10

    .line 353
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 354
    .line 355
    .line 356
    move-result v11

    .line 357
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 358
    .line 359
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 360
    .line 361
    .line 362
    const v4, 0x411970a4    # 9.59f

    .line 363
    .line 364
    .line 365
    const v6, 0x417147ae    # 15.08f

    .line 366
    .line 367
    .line 368
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 369
    .line 370
    .line 371
    const/high16 v4, 0x41300000    # 11.0f

    .line 372
    .line 373
    const v6, 0x4183eb85    # 16.49f

    .line 374
    .line 375
    .line 376
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 377
    .line 378
    .line 379
    const v4, 0x3fb47ae1    # 1.41f

    .line 380
    .line 381
    .line 382
    const v6, -0x404b851f    # -1.41f

    .line 383
    .line 384
    .line 385
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 386
    .line 387
    .line 388
    const v25, 0x4183eb85    # 16.49f

    .line 389
    .line 390
    .line 391
    const/high16 v26, 0x41100000    # 9.0f

    .line 392
    .line 393
    const v21, 0x418c51ec    # 17.54f

    .line 394
    .line 395
    .line 396
    const v22, 0x4113851f    # 9.22f

    .line 397
    .line 398
    .line 399
    const v23, 0x418851ec    # 17.04f

    .line 400
    .line 401
    .line 402
    const/high16 v24, 0x41100000    # 9.0f

    .line 403
    .line 404
    move-object/from16 v20, v2

    .line 405
    .line 406
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 407
    .line 408
    .line 409
    const v4, 0x41770a3d    # 15.44f

    .line 410
    .line 411
    .line 412
    const v6, 0x4113851f    # 9.22f

    .line 413
    .line 414
    .line 415
    const v7, 0x411970a4    # 9.59f

    .line 416
    .line 417
    .line 418
    const v8, 0x417147ae    # 15.08f

    .line 419
    .line 420
    .line 421
    invoke-virtual {v2, v4, v6, v8, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 422
    .line 423
    .line 424
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 425
    .line 426
    .line 427
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 428
    .line 429
    .line 430
    move-result-object v2

    .line 431
    const/high16 v6, 0x3f800000    # 1.0f

    .line 432
    .line 433
    const/high16 v8, 0x3f800000    # 1.0f

    .line 434
    .line 435
    const/4 v7, 0x0

    .line 436
    const-string v4, ""

    .line 437
    .line 438
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 439
    .line 440
    .line 441
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 442
    .line 443
    .line 444
    move-result v3

    .line 445
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 446
    .line 447
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 448
    .line 449
    .line 450
    move-result-wide v6

    .line 451
    const/4 v0, 0x0

    .line 452
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 453
    .line 454
    .line 455
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 456
    .line 457
    .line 458
    move-result v10

    .line 459
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 460
    .line 461
    .line 462
    move-result v11

    .line 463
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 464
    .line 465
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 466
    .line 467
    .line 468
    const v0, 0x417a147b    # 15.63f

    .line 469
    .line 470
    .line 471
    const v2, 0x41666666    # 14.4f

    .line 472
    .line 473
    .line 474
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 475
    .line 476
    .line 477
    const/high16 v0, 0x40200000    # 2.5f

    .line 478
    .line 479
    const v2, -0x3fdeb852    # -2.52f

    .line 480
    .line 481
    .line 482
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 483
    .line 484
    .line 485
    const/high16 v17, -0x3f400000    # -6.0f

    .line 486
    .line 487
    const/high16 v18, -0x3f400000    # -6.0f

    .line 488
    .line 489
    const/high16 v13, -0x3fe00000    # -2.5f

    .line 490
    .line 491
    const v14, -0x4048f5c3    # -1.43f

    .line 492
    .line 493
    .line 494
    const v15, -0x3f6dc28f    # -4.57f

    .line 495
    .line 496
    .line 497
    const/high16 v16, -0x3fa00000    # -3.5f

    .line 498
    .line 499
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 500
    .line 501
    .line 502
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 503
    .line 504
    .line 505
    const v17, 0x3e8a3d71    # 0.27f

    .line 506
    .line 507
    .line 508
    const v18, -0x4099999a    # -0.9f

    .line 509
    .line 510
    .line 511
    const v13, 0x3e6b851f    # 0.23f

    .line 512
    .line 513
    .line 514
    const v14, -0x418a3d71    # -0.24f

    .line 515
    .line 516
    .line 517
    const v15, 0x3ea8f5c3    # 0.33f

    .line 518
    .line 519
    .line 520
    const v16, -0x40ee147b    # -0.57f

    .line 521
    .line 522
    .line 523
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 524
    .line 525
    .line 526
    const v0, 0x4112147b    # 9.13f

    .line 527
    .line 528
    .line 529
    const v2, 0x40733333    # 3.8f

    .line 530
    .line 531
    .line 532
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 533
    .line 534
    .line 535
    const v17, 0x41026666    # 8.15f

    .line 536
    .line 537
    .line 538
    const/high16 v18, 0x40400000    # 3.0f

    .line 539
    .line 540
    const v13, 0x4110a3d7    # 9.04f

    .line 541
    .line 542
    .line 543
    const v14, 0x4055c28f    # 3.34f

    .line 544
    .line 545
    .line 546
    const v15, 0x410a147b    # 8.63f

    .line 547
    .line 548
    .line 549
    const/high16 v16, 0x40400000    # 3.0f

    .line 550
    .line 551
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 552
    .line 553
    .line 554
    const/high16 v0, 0x40800000    # 4.0f

    .line 555
    .line 556
    const/high16 v2, 0x40400000    # 3.0f

    .line 557
    .line 558
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 559
    .line 560
    .line 561
    const/high16 v17, 0x40400000    # 3.0f

    .line 562
    .line 563
    const v18, 0x4080f5c3    # 4.03f

    .line 564
    .line 565
    .line 566
    const v13, 0x405c28f6    # 3.44f

    .line 567
    .line 568
    .line 569
    const/high16 v14, 0x40400000    # 3.0f

    .line 570
    .line 571
    const v15, 0x403e147b    # 2.97f

    .line 572
    .line 573
    .line 574
    const v16, 0x405e147b    # 3.47f

    .line 575
    .line 576
    .line 577
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 578
    .line 579
    .line 580
    const v17, 0x40adc28f    # 5.43f

    .line 581
    .line 582
    .line 583
    const/high16 v18, 0x41400000    # 12.0f

    .line 584
    .line 585
    const v13, 0x404ae148    # 3.17f

    .line 586
    .line 587
    .line 588
    const v14, 0x40dd70a4    # 6.92f

    .line 589
    .line 590
    .line 591
    const v15, 0x4081999a    # 4.05f

    .line 592
    .line 593
    .line 594
    const v16, 0x411a147b    # 9.63f

    .line 595
    .line 596
    .line 597
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 598
    .line 599
    .line 600
    const v17, 0x40d23d71    # 6.57f

    .line 601
    .line 602
    .line 603
    const v18, 0x40d23d71    # 6.57f

    .line 604
    .line 605
    .line 606
    const v13, 0x3fca3d71    # 1.58f

    .line 607
    .line 608
    .line 609
    const v14, 0x402eb852    # 2.73f

    .line 610
    .line 611
    .line 612
    const v15, 0x40766666    # 3.85f

    .line 613
    .line 614
    .line 615
    const v16, 0x409fae14    # 4.99f

    .line 616
    .line 617
    .line 618
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 619
    .line 620
    .line 621
    const v17, 0x40ff0a3d    # 7.97f

    .line 622
    .line 623
    .line 624
    const v18, 0x401b851f    # 2.43f

    .line 625
    .line 626
    .line 627
    const v13, 0x4017ae14    # 2.37f

    .line 628
    .line 629
    .line 630
    const v14, 0x3faf5c29    # 1.37f

    .line 631
    .line 632
    .line 633
    const v15, 0x40a28f5c    # 5.08f

    .line 634
    .line 635
    .line 636
    const v16, 0x4010a3d7    # 2.26f

    .line 637
    .line 638
    .line 639
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 640
    .line 641
    .line 642
    const v17, 0x3f83d70a    # 1.03f

    .line 643
    .line 644
    .line 645
    const/high16 v18, -0x40800000    # -1.0f

    .line 646
    .line 647
    const v13, 0x3f0f5c29    # 0.56f

    .line 648
    .line 649
    .line 650
    const v14, 0x3cf5c28f    # 0.03f

    .line 651
    .line 652
    .line 653
    const v15, 0x3f83d70a    # 1.03f

    .line 654
    .line 655
    .line 656
    const v16, -0x411eb852    # -0.44f

    .line 657
    .line 658
    .line 659
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 660
    .line 661
    .line 662
    const/4 v0, 0x0

    .line 663
    const v2, -0x3f7b3333    # -4.15f

    .line 664
    .line 665
    .line 666
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 667
    .line 668
    .line 669
    const v17, -0x40b33333    # -0.8f

    .line 670
    .line 671
    .line 672
    const v18, -0x40851eb8    # -0.98f

    .line 673
    .line 674
    .line 675
    const/4 v13, 0x0

    .line 676
    const v14, -0x410a3d71    # -0.48f

    .line 677
    .line 678
    .line 679
    const v15, -0x4151eb85    # -0.34f

    .line 680
    .line 681
    .line 682
    const v16, -0x409c28f6    # -0.89f

    .line 683
    .line 684
    .line 685
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 686
    .line 687
    .line 688
    const v0, -0x3f951eb8    # -3.67f

    .line 689
    .line 690
    .line 691
    const v2, -0x40c51eb8    # -0.73f

    .line 692
    .line 693
    .line 694
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 695
    .line 696
    .line 697
    const v17, 0x417a147b    # 15.63f

    .line 698
    .line 699
    .line 700
    const v18, 0x41666666    # 14.4f

    .line 701
    .line 702
    .line 703
    const v13, 0x4181999a    # 16.2f

    .line 704
    .line 705
    .line 706
    const v14, 0x41611eb8    # 14.07f

    .line 707
    .line 708
    .line 709
    const v15, 0x417dc28f    # 15.86f

    .line 710
    .line 711
    .line 712
    const v16, 0x4162b852    # 14.17f

    .line 713
    .line 714
    .line 715
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 716
    .line 717
    .line 718
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 719
    .line 720
    .line 721
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 722
    .line 723
    .line 724
    move-result-object v2

    .line 725
    const/16 v16, 0x3800

    .line 726
    .line 727
    const/16 v17, 0x0

    .line 728
    .line 729
    const/high16 v6, 0x3f800000    # 1.0f

    .line 730
    .line 731
    const/4 v7, 0x0

    .line 732
    const/high16 v12, 0x3f800000    # 1.0f

    .line 733
    .line 734
    const/4 v13, 0x0

    .line 735
    const/4 v14, 0x0

    .line 736
    const/4 v15, 0x0

    .line 737
    const-string v4, ""

    .line 738
    .line 739
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 740
    .line 741
    .line 742
    move-result-object v0

    .line 743
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 744
    .line 745
    .line 746
    move-result-object v0

    .line 747
    sput-object v0, Landroidx/compose/material/icons/filled/WifiCalling3Kt;->_wifiCalling3:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 748
    .line 749
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 750
    .line 751
    .line 752
    return-object v0
.end method
