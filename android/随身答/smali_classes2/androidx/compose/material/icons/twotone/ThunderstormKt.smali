.class public final Landroidx/compose/material/icons/twotone/ThunderstormKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_thunderstorm",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "Thunderstorm",
        "Landroidx/compose/material/icons/Icons$TwoTone;",
        "getThunderstorm",
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
        "SMAP\nThunderstorm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Thunderstorm.kt\nandroidx/compose/material/icons/twotone/ThunderstormKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,96:1\n212#2,12:97\n233#2,18:110\n253#2:147\n233#2,18:148\n253#2:185\n233#2,18:186\n253#2:223\n233#2,18:224\n253#2:261\n174#3:109\n705#4,2:128\n717#4,2:130\n719#4,11:136\n705#4,2:166\n717#4,2:168\n719#4,11:174\n705#4,2:204\n717#4,2:206\n719#4,11:212\n705#4,2:242\n717#4,2:244\n719#4,11:250\n72#5,4:132\n72#5,4:170\n72#5,4:208\n72#5,4:246\n*S KotlinDebug\n*F\n+ 1 Thunderstorm.kt\nandroidx/compose/material/icons/twotone/ThunderstormKt\n*L\n29#1:97,12\n30#1:110,18\n30#1:147\n45#1:148,18\n45#1:185\n69#1:186,18\n69#1:223\n80#1:224,18\n80#1:261\n29#1:109\n30#1:128,2\n30#1:130,2\n30#1:136,11\n45#1:166,2\n45#1:168,2\n45#1:174,11\n69#1:204,2\n69#1:206,2\n69#1:212,11\n80#1:242,2\n80#1:244,2\n80#1:250,11\n30#1:132,4\n45#1:170,4\n69#1:208,4\n80#1:246,4\n*E\n"
    }
.end annotation


# static fields
.field private static _thunderstorm:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getThunderstorm(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/ThunderstormKt;->_thunderstorm:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.Thunderstorm"

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
    const v4, 0x418dd70a    # 17.73f

    .line 71
    .line 72
    .line 73
    const v6, 0x411028f6    # 9.01f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v4, 0x4181999a    # 16.2f

    .line 80
    .line 81
    .line 82
    const v6, 0x410deb85    # 8.87f

    .line 83
    .line 84
    .line 85
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 86
    .line 87
    .line 88
    const/high16 v4, -0x41800000    # -0.25f

    .line 89
    .line 90
    const v6, -0x403d70a4    # -1.52f

    .line 91
    .line 92
    .line 93
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 94
    .line 95
    .line 96
    const/high16 v25, 0x41400000    # 12.0f

    .line 97
    .line 98
    const/high16 v26, 0x40800000    # 4.0f

    .line 99
    .line 100
    const v21, 0x417a147b    # 15.63f

    .line 101
    .line 102
    .line 103
    const v22, 0x40ae147b    # 5.44f

    .line 104
    .line 105
    .line 106
    const v23, 0x415f0a3d    # 13.94f

    .line 107
    .line 108
    .line 109
    const/high16 v24, 0x40800000    # 4.0f

    .line 110
    .line 111
    move-object/from16 v20, v2

    .line 112
    .line 113
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 114
    .line 115
    .line 116
    const v25, -0x3fa147ae    # -3.48f

    .line 117
    .line 118
    .line 119
    const v26, 0x40028f5c    # 2.04f

    .line 120
    .line 121
    .line 122
    const v21, -0x4047ae14    # -1.44f

    .line 123
    .line 124
    .line 125
    const/16 v22, 0x0

    .line 126
    .line 127
    const v23, -0x3fceb852    # -2.77f

    .line 128
    .line 129
    .line 130
    const v24, 0x3f47ae14    # 0.78f

    .line 131
    .line 132
    .line 133
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 134
    .line 135
    .line 136
    const v4, 0x41007ae1    # 8.03f

    .line 137
    .line 138
    .line 139
    const v6, 0x40dd1eb8    # 6.91f

    .line 140
    .line 141
    .line 142
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 143
    .line 144
    .line 145
    const v4, 0x40e147ae    # 7.04f

    .line 146
    .line 147
    .line 148
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 149
    .line 150
    .line 151
    const/high16 v25, 0x40800000    # 4.0f

    .line 152
    .line 153
    const/high16 v26, 0x41280000    # 10.5f

    .line 154
    .line 155
    const v21, 0x40a9eb85    # 5.31f

    .line 156
    .line 157
    .line 158
    const v22, 0x40e8a3d7    # 7.27f

    .line 159
    .line 160
    .line 161
    const/high16 v23, 0x40800000    # 4.0f

    .line 162
    .line 163
    const v24, 0x410c28f6    # 8.76f

    .line 164
    .line 165
    .line 166
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 167
    .line 168
    .line 169
    const/high16 v25, 0x40f00000    # 7.5f

    .line 170
    .line 171
    const/high16 v26, 0x41600000    # 14.0f

    .line 172
    .line 173
    const/high16 v21, 0x40800000    # 4.0f

    .line 174
    .line 175
    const v22, 0x4146e148    # 12.43f

    .line 176
    .line 177
    .line 178
    const v23, 0x40b23d71    # 5.57f

    .line 179
    .line 180
    .line 181
    const/high16 v24, 0x41600000    # 14.0f

    .line 182
    .line 183
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 184
    .line 185
    .line 186
    const/high16 v4, 0x41200000    # 10.0f

    .line 187
    .line 188
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 189
    .line 190
    .line 191
    const/high16 v25, 0x40200000    # 2.5f

    .line 192
    .line 193
    const/high16 v26, -0x3fe00000    # -2.5f

    .line 194
    .line 195
    const v21, 0x3fb0a3d7    # 1.38f

    .line 196
    .line 197
    .line 198
    const/16 v22, 0x0

    .line 199
    .line 200
    const/high16 v23, 0x40200000    # 2.5f

    .line 201
    .line 202
    const v24, -0x4070a3d7    # -1.12f

    .line 203
    .line 204
    .line 205
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 206
    .line 207
    .line 208
    const v25, 0x418dd70a    # 17.73f

    .line 209
    .line 210
    .line 211
    const v26, 0x411028f6    # 9.01f

    .line 212
    .line 213
    .line 214
    const/high16 v21, 0x41a00000    # 20.0f

    .line 215
    .line 216
    const v22, 0x4123851f    # 10.22f

    .line 217
    .line 218
    .line 219
    const v23, 0x4198147b    # 19.01f

    .line 220
    .line 221
    .line 222
    const v24, 0x4112147b    # 9.13f

    .line 223
    .line 224
    .line 225
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 226
    .line 227
    .line 228
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 229
    .line 230
    .line 231
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 232
    .line 233
    .line 234
    move-result-object v2

    .line 235
    const/16 v16, 0x3800

    .line 236
    .line 237
    const/16 v17, 0x0

    .line 238
    .line 239
    const v6, 0x3e99999a    # 0.3f

    .line 240
    .line 241
    .line 242
    const v8, 0x3e99999a    # 0.3f

    .line 243
    .line 244
    .line 245
    const/4 v7, 0x0

    .line 246
    const/high16 v9, 0x3f800000    # 1.0f

    .line 247
    .line 248
    const/high16 v12, 0x3f800000    # 1.0f

    .line 249
    .line 250
    const/4 v13, 0x0

    .line 251
    const/4 v14, 0x0

    .line 252
    const/4 v15, 0x0

    .line 253
    const-string v4, ""

    .line 254
    .line 255
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 256
    .line 257
    .line 258
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 259
    .line 260
    .line 261
    move-result v3

    .line 262
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 263
    .line 264
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 265
    .line 266
    .line 267
    move-result-wide v6

    .line 268
    const/4 v2, 0x0

    .line 269
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 270
    .line 271
    .line 272
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 273
    .line 274
    .line 275
    move-result v10

    .line 276
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 277
    .line 278
    .line 279
    move-result v11

    .line 280
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 281
    .line 282
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 283
    .line 284
    .line 285
    const v4, 0x418f5c29    # 17.92f

    .line 286
    .line 287
    .line 288
    const v6, 0x40e0a3d7    # 7.02f

    .line 289
    .line 290
    .line 291
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 292
    .line 293
    .line 294
    const/high16 v25, 0x41400000    # 12.0f

    .line 295
    .line 296
    const/high16 v26, 0x40000000    # 2.0f

    .line 297
    .line 298
    const v21, 0x418b999a    # 17.45f

    .line 299
    .line 300
    .line 301
    const v22, 0x4085c28f    # 4.18f

    .line 302
    .line 303
    .line 304
    const v23, 0x416f851f    # 14.97f

    .line 305
    .line 306
    .line 307
    const/high16 v24, 0x40000000    # 2.0f

    .line 308
    .line 309
    move-object/from16 v20, v2

    .line 310
    .line 311
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 312
    .line 313
    .line 314
    const v25, 0x40d8f5c3    # 6.78f

    .line 315
    .line 316
    .line 317
    const v26, 0x40a1eb85    # 5.06f

    .line 318
    .line 319
    .line 320
    const v21, 0x411d1eb8    # 9.82f

    .line 321
    .line 322
    .line 323
    const/high16 v22, 0x40000000    # 2.0f

    .line 324
    .line 325
    const v23, 0x40fa8f5c    # 7.83f

    .line 326
    .line 327
    .line 328
    const v24, 0x404b851f    # 3.18f

    .line 329
    .line 330
    .line 331
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 332
    .line 333
    .line 334
    const/high16 v25, 0x40000000    # 2.0f

    .line 335
    .line 336
    const/high16 v26, 0x41280000    # 10.5f

    .line 337
    .line 338
    const v21, 0x4082e148    # 4.09f

    .line 339
    .line 340
    .line 341
    const v22, 0x40ad1eb8    # 5.41f

    .line 342
    .line 343
    .line 344
    const/high16 v23, 0x40000000    # 2.0f

    .line 345
    .line 346
    const v24, 0x40f7ae14    # 7.74f

    .line 347
    .line 348
    .line 349
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 350
    .line 351
    .line 352
    const/high16 v25, 0x40f00000    # 7.5f

    .line 353
    .line 354
    const/high16 v26, 0x41800000    # 16.0f

    .line 355
    .line 356
    const/high16 v21, 0x40000000    # 2.0f

    .line 357
    .line 358
    const v22, 0x41587ae1    # 13.53f

    .line 359
    .line 360
    .line 361
    const v23, 0x408f0a3d    # 4.47f

    .line 362
    .line 363
    .line 364
    const/high16 v24, 0x41800000    # 16.0f

    .line 365
    .line 366
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 367
    .line 368
    .line 369
    const/high16 v4, 0x41200000    # 10.0f

    .line 370
    .line 371
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 372
    .line 373
    .line 374
    const/high16 v25, 0x40900000    # 4.5f

    .line 375
    .line 376
    const/high16 v26, -0x3f700000    # -4.5f

    .line 377
    .line 378
    const v21, 0x401eb852    # 2.48f

    .line 379
    .line 380
    .line 381
    const/16 v22, 0x0

    .line 382
    .line 383
    const/high16 v23, 0x40900000    # 4.5f

    .line 384
    .line 385
    const v24, -0x3ffeb852    # -2.02f

    .line 386
    .line 387
    .line 388
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 389
    .line 390
    .line 391
    const v25, 0x418f5c29    # 17.92f

    .line 392
    .line 393
    .line 394
    const v26, 0x40e0a3d7    # 7.02f

    .line 395
    .line 396
    .line 397
    const/high16 v21, 0x41b00000    # 22.0f

    .line 398
    .line 399
    const v22, 0x41128f5c    # 9.16f

    .line 400
    .line 401
    .line 402
    const v23, 0x41a1ae14    # 20.21f

    .line 403
    .line 404
    .line 405
    const v24, 0x40e75c29    # 7.23f

    .line 406
    .line 407
    .line 408
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 409
    .line 410
    .line 411
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 412
    .line 413
    .line 414
    const/high16 v4, 0x418c0000    # 17.5f

    .line 415
    .line 416
    const/high16 v6, 0x41600000    # 14.0f

    .line 417
    .line 418
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 419
    .line 420
    .line 421
    const/high16 v4, -0x3ee00000    # -10.0f

    .line 422
    .line 423
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 424
    .line 425
    .line 426
    const/high16 v25, 0x40800000    # 4.0f

    .line 427
    .line 428
    const/high16 v26, 0x41280000    # 10.5f

    .line 429
    .line 430
    const v21, 0x40b23d71    # 5.57f

    .line 431
    .line 432
    .line 433
    const/high16 v22, 0x41600000    # 14.0f

    .line 434
    .line 435
    const/high16 v23, 0x40800000    # 4.0f

    .line 436
    .line 437
    const v24, 0x4146e148    # 12.43f

    .line 438
    .line 439
    .line 440
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 441
    .line 442
    .line 443
    const v25, 0x40428f5c    # 3.04f

    .line 444
    .line 445
    .line 446
    const v26, -0x3fa28f5c    # -3.46f

    .line 447
    .line 448
    .line 449
    const/16 v21, 0x0

    .line 450
    .line 451
    const v22, -0x402147ae    # -1.74f

    .line 452
    .line 453
    .line 454
    const v23, 0x3fa7ae14    # 1.31f

    .line 455
    .line 456
    .line 457
    const v24, -0x3fb147ae    # -3.23f

    .line 458
    .line 459
    .line 460
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 461
    .line 462
    .line 463
    const v4, 0x3f7d70a4    # 0.99f

    .line 464
    .line 465
    .line 466
    const v6, -0x41fae148    # -0.13f

    .line 467
    .line 468
    .line 469
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 470
    .line 471
    .line 472
    const v4, 0x3efae148    # 0.49f

    .line 473
    .line 474
    .line 475
    const v6, -0x40a147ae    # -0.87f

    .line 476
    .line 477
    .line 478
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 479
    .line 480
    .line 481
    const/high16 v25, 0x41400000    # 12.0f

    .line 482
    .line 483
    const/high16 v26, 0x40800000    # 4.0f

    .line 484
    .line 485
    const v21, 0x4113ae14    # 9.23f

    .line 486
    .line 487
    .line 488
    const v22, 0x4098f5c3    # 4.78f

    .line 489
    .line 490
    .line 491
    const v23, 0x4128f5c3    # 10.56f

    .line 492
    .line 493
    .line 494
    const/high16 v24, 0x40800000    # 4.0f

    .line 495
    .line 496
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 497
    .line 498
    .line 499
    const v25, 0x407ccccd    # 3.95f

    .line 500
    .line 501
    .line 502
    const v26, 0x40566666    # 3.35f

    .line 503
    .line 504
    .line 505
    const v21, 0x3ff851ec    # 1.94f

    .line 506
    .line 507
    .line 508
    const/16 v22, 0x0

    .line 509
    .line 510
    const v23, 0x406851ec    # 3.63f

    .line 511
    .line 512
    .line 513
    const v24, 0x3fb851ec    # 1.44f

    .line 514
    .line 515
    .line 516
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 517
    .line 518
    .line 519
    const/high16 v4, 0x3e800000    # 0.25f

    .line 520
    .line 521
    const v6, 0x3fc28f5c    # 1.52f

    .line 522
    .line 523
    .line 524
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 525
    .line 526
    .line 527
    const v4, 0x3fc51eb8    # 1.54f

    .line 528
    .line 529
    .line 530
    const v6, 0x3e0f5c29    # 0.14f

    .line 531
    .line 532
    .line 533
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 534
    .line 535
    .line 536
    const/high16 v25, 0x41a00000    # 20.0f

    .line 537
    .line 538
    const/high16 v26, 0x41380000    # 11.5f

    .line 539
    .line 540
    const v21, 0x4198147b    # 19.01f

    .line 541
    .line 542
    .line 543
    const v22, 0x4112147b    # 9.13f

    .line 544
    .line 545
    .line 546
    const/high16 v23, 0x41a00000    # 20.0f

    .line 547
    .line 548
    const v24, 0x4123851f    # 10.22f

    .line 549
    .line 550
    .line 551
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 552
    .line 553
    .line 554
    const/high16 v25, 0x418c0000    # 17.5f

    .line 555
    .line 556
    const/high16 v26, 0x41600000    # 14.0f

    .line 557
    .line 558
    const/high16 v21, 0x41a00000    # 20.0f

    .line 559
    .line 560
    const v22, 0x414e147b    # 12.88f

    .line 561
    .line 562
    .line 563
    const v23, 0x41970a3d    # 18.88f

    .line 564
    .line 565
    .line 566
    const/high16 v24, 0x41600000    # 14.0f

    .line 567
    .line 568
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 569
    .line 570
    .line 571
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 572
    .line 573
    .line 574
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 575
    .line 576
    .line 577
    move-result-object v2

    .line 578
    const/high16 v6, 0x3f800000    # 1.0f

    .line 579
    .line 580
    const/high16 v8, 0x3f800000    # 1.0f

    .line 581
    .line 582
    const/4 v7, 0x0

    .line 583
    const-string v4, ""

    .line 584
    .line 585
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 586
    .line 587
    .line 588
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 589
    .line 590
    .line 591
    move-result v3

    .line 592
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 593
    .line 594
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 595
    .line 596
    .line 597
    move-result-wide v6

    .line 598
    const/4 v2, 0x0

    .line 599
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 600
    .line 601
    .line 602
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 603
    .line 604
    .line 605
    move-result v10

    .line 606
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 607
    .line 608
    .line 609
    move-result v11

    .line 610
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 611
    .line 612
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 613
    .line 614
    .line 615
    const v4, 0x416ccccd    # 14.8f

    .line 616
    .line 617
    .line 618
    const/high16 v6, 0x41880000    # 17.0f

    .line 619
    .line 620
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 621
    .line 622
    .line 623
    const v4, 0x40547ae1    # 3.32f

    .line 624
    .line 625
    .line 626
    const v6, -0x3fc66666    # -2.9f

    .line 627
    .line 628
    .line 629
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 630
    .line 631
    .line 632
    const/high16 v4, 0x3f800000    # 1.0f

    .line 633
    .line 634
    const/high16 v6, 0x40000000    # 2.0f

    .line 635
    .line 636
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 637
    .line 638
    .line 639
    const v4, 0x402b851f    # 2.68f

    .line 640
    .line 641
    .line 642
    const v6, -0x3fe9999a    # -2.35f

    .line 643
    .line 644
    .line 645
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 646
    .line 647
    .line 648
    const/4 v4, 0x0

    .line 649
    const v6, 0x4029999a    # 2.65f

    .line 650
    .line 651
    .line 652
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 653
    .line 654
    .line 655
    const v4, -0x3fab851f    # -3.32f

    .line 656
    .line 657
    .line 658
    const v6, 0x4039999a    # 2.9f

    .line 659
    .line 660
    .line 661
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 662
    .line 663
    .line 664
    const/high16 v4, -0x40800000    # -1.0f

    .line 665
    .line 666
    const/high16 v6, -0x40000000    # -2.0f

    .line 667
    .line 668
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 669
    .line 670
    .line 671
    const v4, -0x3fd47ae1    # -2.68f

    .line 672
    .line 673
    .line 674
    const v6, 0x40166666    # 2.35f

    .line 675
    .line 676
    .line 677
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 678
    .line 679
    .line 680
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 681
    .line 682
    .line 683
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 684
    .line 685
    .line 686
    move-result-object v2

    .line 687
    const/high16 v6, 0x3f800000    # 1.0f

    .line 688
    .line 689
    const/4 v7, 0x0

    .line 690
    const-string v4, ""

    .line 691
    .line 692
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 693
    .line 694
    .line 695
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 696
    .line 697
    .line 698
    move-result v3

    .line 699
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 700
    .line 701
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 702
    .line 703
    .line 704
    move-result-wide v6

    .line 705
    const/4 v0, 0x0

    .line 706
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 707
    .line 708
    .line 709
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 710
    .line 711
    .line 712
    move-result v10

    .line 713
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 714
    .line 715
    .line 716
    move-result v11

    .line 717
    new-instance v0, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 718
    .line 719
    invoke-direct {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 720
    .line 721
    .line 722
    const v2, 0x410ccccd    # 8.8f

    .line 723
    .line 724
    .line 725
    const/high16 v4, 0x41880000    # 17.0f

    .line 726
    .line 727
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 728
    .line 729
    .line 730
    const v2, 0x40547ae1    # 3.32f

    .line 731
    .line 732
    .line 733
    const v4, -0x3fc66666    # -2.9f

    .line 734
    .line 735
    .line 736
    invoke-virtual {v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 737
    .line 738
    .line 739
    const/high16 v2, 0x3f800000    # 1.0f

    .line 740
    .line 741
    const/high16 v4, 0x40000000    # 2.0f

    .line 742
    .line 743
    invoke-virtual {v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 744
    .line 745
    .line 746
    const v2, 0x402b851f    # 2.68f

    .line 747
    .line 748
    .line 749
    const v4, -0x3fe9999a    # -2.35f

    .line 750
    .line 751
    .line 752
    invoke-virtual {v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 753
    .line 754
    .line 755
    const/4 v2, 0x0

    .line 756
    const v4, 0x4029999a    # 2.65f

    .line 757
    .line 758
    .line 759
    invoke-virtual {v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 760
    .line 761
    .line 762
    const v2, -0x3fab851f    # -3.32f

    .line 763
    .line 764
    .line 765
    const v4, 0x4039999a    # 2.9f

    .line 766
    .line 767
    .line 768
    invoke-virtual {v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 769
    .line 770
    .line 771
    const/high16 v2, -0x40800000    # -1.0f

    .line 772
    .line 773
    const/high16 v4, -0x40000000    # -2.0f

    .line 774
    .line 775
    invoke-virtual {v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 776
    .line 777
    .line 778
    const v2, -0x3fd47ae1    # -2.68f

    .line 779
    .line 780
    .line 781
    const v4, 0x40166666    # 2.35f

    .line 782
    .line 783
    .line 784
    invoke-virtual {v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 785
    .line 786
    .line 787
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 788
    .line 789
    .line 790
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 791
    .line 792
    .line 793
    move-result-object v2

    .line 794
    const/high16 v6, 0x3f800000    # 1.0f

    .line 795
    .line 796
    const/4 v7, 0x0

    .line 797
    const-string v4, ""

    .line 798
    .line 799
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 800
    .line 801
    .line 802
    move-result-object v0

    .line 803
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 804
    .line 805
    .line 806
    move-result-object v0

    .line 807
    sput-object v0, Landroidx/compose/material/icons/twotone/ThunderstormKt;->_thunderstorm:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 808
    .line 809
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 810
    .line 811
    .line 812
    return-object v0
.end method
