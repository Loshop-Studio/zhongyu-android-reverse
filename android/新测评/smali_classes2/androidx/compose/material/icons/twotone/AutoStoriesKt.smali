.class public final Landroidx/compose/material/icons/twotone/AutoStoriesKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_autoStories",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "AutoStories",
        "Landroidx/compose/material/icons/Icons$TwoTone;",
        "getAutoStories",
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
        "SMAP\nAutoStories.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AutoStories.kt\nandroidx/compose/material/icons/twotone/AutoStoriesKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,83:1\n212#2,12:84\n233#2,18:97\n253#2:134\n233#2,18:135\n253#2:172\n233#2,18:173\n253#2:210\n174#3:96\n705#4,2:115\n717#4,2:117\n719#4,11:123\n705#4,2:153\n717#4,2:155\n719#4,11:161\n705#4,2:191\n717#4,2:193\n719#4,11:199\n72#5,4:119\n72#5,4:157\n72#5,4:195\n*S KotlinDebug\n*F\n+ 1 AutoStories.kt\nandroidx/compose/material/icons/twotone/AutoStoriesKt\n*L\n29#1:84,12\n30#1:97,18\n30#1:134\n40#1:135,18\n40#1:172\n47#1:173,18\n47#1:210\n29#1:96\n30#1:115,2\n30#1:117,2\n30#1:123,11\n40#1:153,2\n40#1:155,2\n40#1:161,11\n47#1:191,2\n47#1:193,2\n47#1:199,11\n30#1:119,4\n40#1:157,4\n47#1:195,4\n*E\n"
    }
.end annotation


# static fields
.field private static _autoStories:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getAutoStories(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/AutoStoriesKt;->_autoStories:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.AutoStories"

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
    const v6, 0x40d6b852    # 6.71f

    .line 73
    .line 74
    .line 75
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    const v4, 0x411e8f5c    # 9.91f

    .line 79
    .line 80
    .line 81
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 82
    .line 83
    .line 84
    const/high16 v25, 0x40d00000    # 6.5f

    .line 85
    .line 86
    const/high16 v26, 0x41800000    # 16.0f

    .line 87
    .line 88
    const v21, 0x40847ae1    # 4.14f

    .line 89
    .line 90
    .line 91
    const v22, 0x4181ae14    # 16.21f

    .line 92
    .line 93
    .line 94
    const v23, 0x40a9eb85    # 5.31f

    .line 95
    .line 96
    .line 97
    const/high16 v24, 0x41800000    # 16.0f

    .line 98
    .line 99
    move-object/from16 v20, v2

    .line 100
    .line 101
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 102
    .line 103
    .line 104
    const/high16 v25, 0x40600000    # 3.5f

    .line 105
    .line 106
    const v26, 0x3f1eb852    # 0.62f

    .line 107
    .line 108
    .line 109
    const v21, 0x3f9851ec    # 1.19f

    .line 110
    .line 111
    .line 112
    const/16 v22, 0x0

    .line 113
    .line 114
    const v23, 0x40170a3d    # 2.36f

    .line 115
    .line 116
    .line 117
    const v24, 0x3e570a3d    # 0.21f

    .line 118
    .line 119
    .line 120
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 121
    .line 122
    .line 123
    const v4, 0x40d70a3d    # 6.72f

    .line 124
    .line 125
    .line 126
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 127
    .line 128
    .line 129
    const/high16 v25, 0x40d00000    # 6.5f

    .line 130
    .line 131
    const/high16 v26, 0x40c00000    # 6.0f

    .line 132
    .line 133
    const v21, 0x410e3d71    # 8.89f

    .line 134
    .line 135
    .line 136
    const/high16 v22, 0x40c80000    # 6.25f

    .line 137
    .line 138
    const v23, 0x40f66666    # 7.7f

    .line 139
    .line 140
    .line 141
    const/high16 v24, 0x40c00000    # 6.0f

    .line 142
    .line 143
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 144
    .line 145
    .line 146
    const/high16 v25, 0x40400000    # 3.0f

    .line 147
    .line 148
    const v26, 0x40d6b852    # 6.71f

    .line 149
    .line 150
    .line 151
    const v21, 0x40a8f5c3    # 5.28f

    .line 152
    .line 153
    .line 154
    const/high16 v22, 0x40c00000    # 6.0f

    .line 155
    .line 156
    const v23, 0x4083851f    # 4.11f

    .line 157
    .line 158
    .line 159
    const v24, 0x40c7ae14    # 6.24f

    .line 160
    .line 161
    .line 162
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 163
    .line 164
    .line 165
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 166
    .line 167
    .line 168
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 169
    .line 170
    .line 171
    move-result-object v2

    .line 172
    const/16 v16, 0x3800

    .line 173
    .line 174
    const/16 v17, 0x0

    .line 175
    .line 176
    const v6, 0x3e99999a    # 0.3f

    .line 177
    .line 178
    .line 179
    const v8, 0x3e99999a    # 0.3f

    .line 180
    .line 181
    .line 182
    const/4 v7, 0x0

    .line 183
    const/high16 v9, 0x3f800000    # 1.0f

    .line 184
    .line 185
    const/high16 v12, 0x3f800000    # 1.0f

    .line 186
    .line 187
    const/4 v13, 0x0

    .line 188
    const/4 v14, 0x0

    .line 189
    const/4 v15, 0x0

    .line 190
    const-string v4, ""

    .line 191
    .line 192
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 193
    .line 194
    .line 195
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 196
    .line 197
    .line 198
    move-result v3

    .line 199
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 200
    .line 201
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 202
    .line 203
    .line 204
    move-result-wide v6

    .line 205
    const/4 v2, 0x0

    .line 206
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 207
    .line 208
    .line 209
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 210
    .line 211
    .line 212
    move-result v10

    .line 213
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 214
    .line 215
    .line 216
    move-result v11

    .line 217
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 218
    .line 219
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 220
    .line 221
    .line 222
    const/high16 v4, 0x41980000    # 19.0f

    .line 223
    .line 224
    const/high16 v6, 0x3f000000    # 0.5f

    .line 225
    .line 226
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 227
    .line 228
    .line 229
    const/high16 v4, -0x3f600000    # -5.0f

    .line 230
    .line 231
    const/high16 v6, 0x40a00000    # 5.0f

    .line 232
    .line 233
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 234
    .line 235
    .line 236
    const/4 v4, 0x0

    .line 237
    const/high16 v6, 0x41180000    # 9.5f

    .line 238
    .line 239
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 240
    .line 241
    .line 242
    const/high16 v4, -0x3f700000    # -4.5f

    .line 243
    .line 244
    const/high16 v6, 0x40a00000    # 5.0f

    .line 245
    .line 246
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 247
    .line 248
    .line 249
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 250
    .line 251
    .line 252
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 253
    .line 254
    .line 255
    move-result-object v2

    .line 256
    const/high16 v6, 0x3f800000    # 1.0f

    .line 257
    .line 258
    const/high16 v8, 0x3f800000    # 1.0f

    .line 259
    .line 260
    const/4 v7, 0x0

    .line 261
    const-string v4, ""

    .line 262
    .line 263
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 264
    .line 265
    .line 266
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 267
    .line 268
    .line 269
    move-result v3

    .line 270
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 271
    .line 272
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 273
    .line 274
    .line 275
    move-result-wide v6

    .line 276
    const/4 v0, 0x0

    .line 277
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 278
    .line 279
    .line 280
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 281
    .line 282
    .line 283
    move-result v10

    .line 284
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 285
    .line 286
    .line 287
    move-result v11

    .line 288
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 289
    .line 290
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 291
    .line 292
    .line 293
    const v0, 0x41b3c28f    # 22.47f

    .line 294
    .line 295
    .line 296
    const v2, 0x40a66666    # 5.2f

    .line 297
    .line 298
    .line 299
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 300
    .line 301
    .line 302
    const/high16 v17, 0x41a80000    # 21.0f

    .line 303
    .line 304
    const v18, 0x4092e148    # 4.59f

    .line 305
    .line 306
    .line 307
    const/high16 v13, 0x41b00000    # 22.0f

    .line 308
    .line 309
    const v14, 0x409eb852    # 4.96f

    .line 310
    .line 311
    .line 312
    const v15, 0x41ac147b    # 21.51f

    .line 313
    .line 314
    .line 315
    const v16, 0x409851ec    # 4.76f

    .line 316
    .line 317
    .line 318
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 319
    .line 320
    .line 321
    const v0, 0x41407ae1    # 12.03f

    .line 322
    .line 323
    .line 324
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 325
    .line 326
    .line 327
    const/high16 v17, 0x418c0000    # 17.5f

    .line 328
    .line 329
    const/high16 v18, 0x41800000    # 16.0f

    .line 330
    .line 331
    const v13, 0x419ee148    # 19.86f

    .line 332
    .line 333
    .line 334
    const v14, 0x4181ae14    # 16.21f

    .line 335
    .line 336
    .line 337
    const v15, 0x4195851f    # 18.69f

    .line 338
    .line 339
    .line 340
    const/high16 v16, 0x41800000    # 16.0f

    .line 341
    .line 342
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 343
    .line 344
    .line 345
    const/high16 v17, -0x3f500000    # -5.5f

    .line 346
    .line 347
    const v18, 0x3fca3d71    # 1.58f

    .line 348
    .line 349
    .line 350
    const v13, -0x400ccccd    # -1.9f

    .line 351
    .line 352
    .line 353
    const/4 v14, 0x0

    .line 354
    const v15, -0x3f8e147b    # -3.78f

    .line 355
    .line 356
    .line 357
    const v16, 0x3f0a3d71    # 0.54f

    .line 358
    .line 359
    .line 360
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 361
    .line 362
    .line 363
    const v0, 0x40af5c29    # 5.48f

    .line 364
    .line 365
    .line 366
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 367
    .line 368
    .line 369
    const/high16 v17, 0x40d00000    # 6.5f

    .line 370
    .line 371
    const/high16 v18, 0x40800000    # 4.0f

    .line 372
    .line 373
    const v13, 0x4126147b    # 10.38f

    .line 374
    .line 375
    .line 376
    const v14, 0x4091999a    # 4.55f

    .line 377
    .line 378
    .line 379
    const v15, 0x410828f6    # 8.51f

    .line 380
    .line 381
    .line 382
    const/high16 v16, 0x40800000    # 4.0f

    .line 383
    .line 384
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 385
    .line 386
    .line 387
    const v17, 0x3fc3d70a    # 1.53f

    .line 388
    .line 389
    .line 390
    const v18, 0x40a66666    # 5.2f

    .line 391
    .line 392
    .line 393
    const v13, 0x4096b852    # 4.71f

    .line 394
    .line 395
    .line 396
    const/high16 v14, 0x40800000    # 4.0f

    .line 397
    .line 398
    const v15, 0x404147ae    # 3.02f

    .line 399
    .line 400
    .line 401
    const v16, 0x408e147b    # 4.44f

    .line 402
    .line 403
    .line 404
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 405
    .line 406
    .line 407
    const/high16 v17, 0x3f800000    # 1.0f

    .line 408
    .line 409
    const v18, 0x40c28f5c    # 6.08f

    .line 410
    .line 411
    .line 412
    const v13, 0x3f99999a    # 1.2f

    .line 413
    .line 414
    .line 415
    const v14, 0x40ab851f    # 5.36f

    .line 416
    .line 417
    .line 418
    const/high16 v15, 0x3f800000    # 1.0f

    .line 419
    .line 420
    const v16, 0x40b6b852    # 5.71f

    .line 421
    .line 422
    .line 423
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 424
    .line 425
    .line 426
    const v0, 0x414147ae    # 12.08f

    .line 427
    .line 428
    .line 429
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 430
    .line 431
    .line 432
    const v18, 0x3f7d70a4    # 0.99f

    .line 433
    .line 434
    .line 435
    const/4 v13, 0x0

    .line 436
    const v14, 0x3f147ae1    # 0.58f

    .line 437
    .line 438
    .line 439
    const v15, 0x3ef0a3d7    # 0.47f

    .line 440
    .line 441
    .line 442
    const v16, 0x3f7d70a4    # 0.99f

    .line 443
    .line 444
    .line 445
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 446
    .line 447
    .line 448
    const v17, 0x3ef5c28f    # 0.48f

    .line 449
    .line 450
    .line 451
    const v18, -0x420a3d71    # -0.12f

    .line 452
    .line 453
    .line 454
    const v13, 0x3e23d70a    # 0.16f

    .line 455
    .line 456
    .line 457
    const/4 v14, 0x0

    .line 458
    const v15, 0x3ea3d70a    # 0.32f

    .line 459
    .line 460
    .line 461
    const v16, -0x42dc28f6    # -0.04f

    .line 462
    .line 463
    .line 464
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 465
    .line 466
    .line 467
    const/high16 v17, 0x40d00000    # 6.5f

    .line 468
    .line 469
    const/high16 v18, 0x41900000    # 18.0f

    .line 470
    .line 471
    const v13, 0x406c28f6    # 3.69f

    .line 472
    .line 473
    .line 474
    const v14, 0x41933333    # 18.4f

    .line 475
    .line 476
    .line 477
    const v15, 0x40a1999a    # 5.05f

    .line 478
    .line 479
    .line 480
    const/high16 v16, 0x41900000    # 18.0f

    .line 481
    .line 482
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 483
    .line 484
    .line 485
    const/high16 v17, 0x40b00000    # 5.5f

    .line 486
    .line 487
    const/high16 v18, 0x40000000    # 2.0f

    .line 488
    .line 489
    const v13, 0x40047ae1    # 2.07f

    .line 490
    .line 491
    .line 492
    const/4 v14, 0x0

    .line 493
    const v15, 0x407eb852    # 3.98f

    .line 494
    .line 495
    .line 496
    const v16, 0x3f51eb85    # 0.82f

    .line 497
    .line 498
    .line 499
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 500
    .line 501
    .line 502
    const/high16 v18, -0x40000000    # -2.0f

    .line 503
    .line 504
    const v13, 0x3fc28f5c    # 1.52f

    .line 505
    .line 506
    .line 507
    const v14, -0x4068f5c3    # -1.18f

    .line 508
    .line 509
    .line 510
    const v15, 0x405b851f    # 3.43f

    .line 511
    .line 512
    .line 513
    const/high16 v16, -0x40000000    # -2.0f

    .line 514
    .line 515
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 516
    .line 517
    .line 518
    const v17, 0x4080a3d7    # 4.02f

    .line 519
    .line 520
    .line 521
    const v18, 0x3f851eb8    # 1.04f

    .line 522
    .line 523
    .line 524
    const v13, 0x3fb9999a    # 1.45f

    .line 525
    .line 526
    .line 527
    const/4 v14, 0x0

    .line 528
    const v15, 0x4033d70a    # 2.81f

    .line 529
    .line 530
    .line 531
    const v16, 0x3ecccccd    # 0.4f

    .line 532
    .line 533
    .line 534
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 535
    .line 536
    .line 537
    const v17, 0x3ef5c28f    # 0.48f

    .line 538
    .line 539
    .line 540
    const v18, 0x3df5c28f    # 0.12f

    .line 541
    .line 542
    .line 543
    const v13, 0x3e23d70a    # 0.16f

    .line 544
    .line 545
    .line 546
    const v14, 0x3da3d70a    # 0.08f

    .line 547
    .line 548
    .line 549
    const v15, 0x3ea3d70a    # 0.32f

    .line 550
    .line 551
    .line 552
    const v16, 0x3df5c28f    # 0.12f

    .line 553
    .line 554
    .line 555
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 556
    .line 557
    .line 558
    const/high16 v17, 0x3f800000    # 1.0f

    .line 559
    .line 560
    const v18, -0x40828f5c    # -0.99f

    .line 561
    .line 562
    .line 563
    const v13, 0x3f051eb8    # 0.52f

    .line 564
    .line 565
    .line 566
    const/4 v14, 0x0

    .line 567
    const/high16 v15, 0x3f800000    # 1.0f

    .line 568
    .line 569
    const v16, -0x412e147b    # -0.41f

    .line 570
    .line 571
    .line 572
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 573
    .line 574
    .line 575
    const v0, 0x40c28f5c    # 6.08f

    .line 576
    .line 577
    .line 578
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 579
    .line 580
    .line 581
    const v17, 0x41b3c28f    # 22.47f

    .line 582
    .line 583
    .line 584
    const v18, 0x40a66666    # 5.2f

    .line 585
    .line 586
    .line 587
    const/high16 v13, 0x41b80000    # 23.0f

    .line 588
    .line 589
    const v14, 0x40b6b852    # 5.71f

    .line 590
    .line 591
    .line 592
    const v15, 0x41b66666    # 22.8f

    .line 593
    .line 594
    .line 595
    const v16, 0x40ab851f    # 5.36f

    .line 596
    .line 597
    .line 598
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 599
    .line 600
    .line 601
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 602
    .line 603
    .line 604
    const/high16 v0, 0x41200000    # 10.0f

    .line 605
    .line 606
    const v2, 0x4184f5c3    # 16.62f

    .line 607
    .line 608
    .line 609
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 610
    .line 611
    .line 612
    const/high16 v17, 0x40d00000    # 6.5f

    .line 613
    .line 614
    const/high16 v18, 0x41800000    # 16.0f

    .line 615
    .line 616
    const v13, 0x410dc28f    # 8.86f

    .line 617
    .line 618
    .line 619
    const v14, 0x4181ae14    # 16.21f

    .line 620
    .line 621
    .line 622
    const v15, 0x40f6147b    # 7.69f

    .line 623
    .line 624
    .line 625
    const/high16 v16, 0x41800000    # 16.0f

    .line 626
    .line 627
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 628
    .line 629
    .line 630
    const/high16 v17, -0x3fa00000    # -3.5f

    .line 631
    .line 632
    const v18, 0x3f1eb852    # 0.62f

    .line 633
    .line 634
    .line 635
    const v13, -0x4067ae14    # -1.19f

    .line 636
    .line 637
    .line 638
    const/4 v14, 0x0

    .line 639
    const v15, -0x3fe8f5c3    # -2.36f

    .line 640
    .line 641
    .line 642
    const v16, 0x3e570a3d    # 0.21f

    .line 643
    .line 644
    .line 645
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 646
    .line 647
    .line 648
    const v0, 0x40d6b852    # 6.71f

    .line 649
    .line 650
    .line 651
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 652
    .line 653
    .line 654
    const/high16 v17, 0x40d00000    # 6.5f

    .line 655
    .line 656
    const/high16 v18, 0x40c00000    # 6.0f

    .line 657
    .line 658
    const v13, 0x4083851f    # 4.11f

    .line 659
    .line 660
    .line 661
    const v14, 0x40c7ae14    # 6.24f

    .line 662
    .line 663
    .line 664
    const v15, 0x40a8f5c3    # 5.28f

    .line 665
    .line 666
    .line 667
    const/high16 v16, 0x40c00000    # 6.0f

    .line 668
    .line 669
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 670
    .line 671
    .line 672
    const/high16 v17, 0x41200000    # 10.0f

    .line 673
    .line 674
    const v18, 0x40d70a3d    # 6.72f

    .line 675
    .line 676
    .line 677
    const v13, 0x40f66666    # 7.7f

    .line 678
    .line 679
    .line 680
    const/high16 v14, 0x40c00000    # 6.0f

    .line 681
    .line 682
    const v15, 0x410e3d71    # 8.89f

    .line 683
    .line 684
    .line 685
    const/high16 v16, 0x40c80000    # 6.25f

    .line 686
    .line 687
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 688
    .line 689
    .line 690
    const v0, 0x4184f5c3    # 16.62f

    .line 691
    .line 692
    .line 693
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 694
    .line 695
    .line 696
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 697
    .line 698
    .line 699
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 700
    .line 701
    .line 702
    move-result-object v2

    .line 703
    const/16 v16, 0x3800

    .line 704
    .line 705
    const/16 v17, 0x0

    .line 706
    .line 707
    const/high16 v6, 0x3f800000    # 1.0f

    .line 708
    .line 709
    const/4 v7, 0x0

    .line 710
    const/high16 v12, 0x3f800000    # 1.0f

    .line 711
    .line 712
    const/4 v13, 0x0

    .line 713
    const/4 v14, 0x0

    .line 714
    const/4 v15, 0x0

    .line 715
    const-string v4, ""

    .line 716
    .line 717
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 718
    .line 719
    .line 720
    move-result-object v0

    .line 721
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 722
    .line 723
    .line 724
    move-result-object v0

    .line 725
    sput-object v0, Landroidx/compose/material/icons/twotone/AutoStoriesKt;->_autoStories:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 726
    .line 727
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 728
    .line 729
    .line 730
    return-object v0
.end method
