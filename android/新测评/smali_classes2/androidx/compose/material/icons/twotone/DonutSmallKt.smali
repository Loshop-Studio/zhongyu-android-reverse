.class public final Landroidx/compose/material/icons/twotone/DonutSmallKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_donutSmall",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "DonutSmall",
        "Landroidx/compose/material/icons/Icons$TwoTone;",
        "getDonutSmall",
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
        "SMAP\nDonutSmall.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DonutSmall.kt\nandroidx/compose/material/icons/twotone/DonutSmallKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,99:1\n212#2,12:100\n233#2,18:113\n253#2:150\n233#2,18:151\n253#2:188\n174#3:112\n705#4,2:131\n717#4,2:133\n719#4,11:139\n705#4,2:169\n717#4,2:171\n719#4,11:177\n72#5,4:135\n72#5,4:173\n*S KotlinDebug\n*F\n+ 1 DonutSmall.kt\nandroidx/compose/material/icons/twotone/DonutSmallKt\n*L\n29#1:100,12\n30#1:113,18\n30#1:150\n52#1:151,18\n52#1:188\n29#1:112\n30#1:131,2\n30#1:133,2\n30#1:139,11\n52#1:169,2\n52#1:171,2\n52#1:177,11\n30#1:135,4\n52#1:173,4\n*E\n"
    }
.end annotation


# static fields
.field private static _donutSmall:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getDonutSmall(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/DonutSmallKt;->_donutSmall:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.DonutSmall"

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
    const/high16 v4, 0x41100000    # 9.0f

    .line 71
    .line 72
    const v6, 0x417fd70a    # 15.99f

    .line 73
    .line 74
    .line 75
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    const v4, 0x405b851f    # 3.43f

    .line 79
    .line 80
    .line 81
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 82
    .line 83
    .line 84
    const/high16 v25, 0x41700000    # 15.0f

    .line 85
    .line 86
    const v26, 0x40928f5c    # 4.58f

    .line 87
    .line 88
    .line 89
    const v21, 0x4194cccd    # 18.6f

    .line 90
    .line 91
    .line 92
    const/high16 v22, 0x40e00000    # 7.0f

    .line 93
    .line 94
    const/high16 v23, 0x41880000    # 17.0f

    .line 95
    .line 96
    const v24, 0x40accccd    # 5.4f

    .line 97
    .line 98
    .line 99
    move-object/from16 v20, v2

    .line 100
    .line 101
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 102
    .line 103
    .line 104
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 105
    .line 106
    .line 107
    const v25, 0x3f7d70a4    # 0.99f

    .line 108
    .line 109
    .line 110
    const v26, 0x3f7d70a4    # 0.99f

    .line 111
    .line 112
    .line 113
    const v21, 0x3ebd70a4    # 0.37f

    .line 114
    .line 115
    .line 116
    const v22, 0x3e8f5c29    # 0.28f

    .line 117
    .line 118
    .line 119
    const v23, 0x3f35c28f    # 0.71f

    .line 120
    .line 121
    .line 122
    const v24, 0x3f1eb852    # 0.62f

    .line 123
    .line 124
    .line 125
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 126
    .line 127
    .line 128
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 129
    .line 130
    .line 131
    const/high16 v4, 0x40800000    # 4.0f

    .line 132
    .line 133
    const/high16 v6, 0x41400000    # 12.0f

    .line 134
    .line 135
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 136
    .line 137
    .line 138
    const/high16 v25, 0x40a00000    # 5.0f

    .line 139
    .line 140
    const v26, 0x40ed70a4    # 7.42f

    .line 141
    .line 142
    .line 143
    const/16 v21, 0x0

    .line 144
    .line 145
    const v22, 0x40566666    # 3.35f

    .line 146
    .line 147
    .line 148
    const v23, 0x40028f5c    # 2.04f

    .line 149
    .line 150
    .line 151
    const v24, 0x40c7ae14    # 6.24f

    .line 152
    .line 153
    .line 154
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 155
    .line 156
    .line 157
    const v4, -0x3fa3d70a    # -3.44f

    .line 158
    .line 159
    .line 160
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 161
    .line 162
    .line 163
    const/high16 v25, -0x40000000    # -2.0f

    .line 164
    .line 165
    const v26, -0x3f80a3d7    # -3.99f

    .line 166
    .line 167
    .line 168
    const v21, -0x40628f5c    # -1.23f

    .line 169
    .line 170
    .line 171
    const v22, -0x4091eb85    # -0.93f

    .line 172
    .line 173
    .line 174
    const/high16 v23, -0x40000000    # -2.0f

    .line 175
    .line 176
    const v24, -0x3fe66666    # -2.4f

    .line 177
    .line 178
    .line 179
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 180
    .line 181
    .line 182
    const/high16 v25, 0x41100000    # 9.0f

    .line 183
    .line 184
    const/high16 v26, 0x41000000    # 8.0f

    .line 185
    .line 186
    const/high16 v21, 0x40e00000    # 7.0f

    .line 187
    .line 188
    const v22, 0x41266666    # 10.4f

    .line 189
    .line 190
    .line 191
    const v23, 0x40f8a3d7    # 7.77f

    .line 192
    .line 193
    .line 194
    const v24, 0x410ee148    # 8.93f

    .line 195
    .line 196
    .line 197
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 198
    .line 199
    .line 200
    const/high16 v4, 0x41100000    # 9.0f

    .line 201
    .line 202
    const v6, 0x40928f5c    # 4.58f

    .line 203
    .line 204
    .line 205
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 206
    .line 207
    .line 208
    const/high16 v25, 0x40800000    # 4.0f

    .line 209
    .line 210
    const/high16 v26, 0x41400000    # 12.0f

    .line 211
    .line 212
    const v21, 0x40c147ae    # 6.04f

    .line 213
    .line 214
    .line 215
    const v22, 0x40b851ec    # 5.76f

    .line 216
    .line 217
    .line 218
    const/high16 v23, 0x40800000    # 4.0f

    .line 219
    .line 220
    const v24, 0x410a6666    # 8.65f

    .line 221
    .line 222
    .line 223
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 224
    .line 225
    .line 226
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 227
    .line 228
    .line 229
    const v4, 0x417fd70a    # 15.99f

    .line 230
    .line 231
    .line 232
    const/high16 v6, 0x41700000    # 15.0f

    .line 233
    .line 234
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 235
    .line 236
    .line 237
    const v4, 0x405b851f    # 3.43f

    .line 238
    .line 239
    .line 240
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 241
    .line 242
    .line 243
    const v25, 0x408d70a4    # 4.42f

    .line 244
    .line 245
    .line 246
    const v26, -0x3f728f5c    # -4.42f

    .line 247
    .line 248
    .line 249
    const/high16 v21, 0x40000000    # 2.0f

    .line 250
    .line 251
    const v22, -0x40ae147b    # -0.82f

    .line 252
    .line 253
    .line 254
    const v23, 0x40666666    # 3.6f

    .line 255
    .line 256
    .line 257
    const v24, -0x3fe51eb8    # -2.42f

    .line 258
    .line 259
    .line 260
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 261
    .line 262
    .line 263
    const v4, -0x3fa47ae1    # -3.43f

    .line 264
    .line 265
    .line 266
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 267
    .line 268
    .line 269
    const v25, -0x40828f5c    # -0.99f

    .line 270
    .line 271
    .line 272
    const v26, 0x3f7d70a4    # 0.99f

    .line 273
    .line 274
    .line 275
    const v21, -0x4170a3d7    # -0.28f

    .line 276
    .line 277
    .line 278
    const v22, 0x3ebd70a4    # 0.37f

    .line 279
    .line 280
    .line 281
    const v23, -0x40e147ae    # -0.62f

    .line 282
    .line 283
    .line 284
    const v24, 0x3f35c28f    # 0.71f

    .line 285
    .line 286
    .line 287
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 288
    .line 289
    .line 290
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 291
    .line 292
    .line 293
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 294
    .line 295
    .line 296
    move-result-object v2

    .line 297
    const/16 v16, 0x3800

    .line 298
    .line 299
    const/16 v17, 0x0

    .line 300
    .line 301
    const v6, 0x3e99999a    # 0.3f

    .line 302
    .line 303
    .line 304
    const v8, 0x3e99999a    # 0.3f

    .line 305
    .line 306
    .line 307
    const/4 v7, 0x0

    .line 308
    const/high16 v9, 0x3f800000    # 1.0f

    .line 309
    .line 310
    const/high16 v12, 0x3f800000    # 1.0f

    .line 311
    .line 312
    const/4 v13, 0x0

    .line 313
    const/4 v14, 0x0

    .line 314
    const/4 v15, 0x0

    .line 315
    const-string v4, ""

    .line 316
    .line 317
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 318
    .line 319
    .line 320
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 321
    .line 322
    .line 323
    move-result v3

    .line 324
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 325
    .line 326
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 327
    .line 328
    .line 329
    move-result-wide v6

    .line 330
    const/4 v0, 0x0

    .line 331
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 332
    .line 333
    .line 334
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 335
    .line 336
    .line 337
    move-result v10

    .line 338
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 339
    .line 340
    .line 341
    move-result v11

    .line 342
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 343
    .line 344
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 345
    .line 346
    .line 347
    const/high16 v0, 0x41300000    # 11.0f

    .line 348
    .line 349
    const v2, 0x416d1eb8    # 14.82f

    .line 350
    .line 351
    .line 352
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 353
    .line 354
    .line 355
    const v0, 0x40e428f6    # 7.13f

    .line 356
    .line 357
    .line 358
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 359
    .line 360
    .line 361
    const v17, -0x3ef0cccd    # -8.95f

    .line 362
    .line 363
    .line 364
    const v18, -0x3ef0cccd    # -8.95f

    .line 365
    .line 366
    .line 367
    const v13, -0x410f5c29    # -0.47f

    .line 368
    .line 369
    .line 370
    const v14, -0x3f68f5c3    # -4.72f

    .line 371
    .line 372
    .line 373
    const v15, -0x3f78a3d7    # -4.23f

    .line 374
    .line 375
    .line 376
    const v16, -0x3ef851ec    # -8.48f

    .line 377
    .line 378
    .line 379
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 380
    .line 381
    .line 382
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 383
    .line 384
    .line 385
    const v17, 0x3fe8f5c3    # 1.82f

    .line 386
    .line 387
    .line 388
    const v18, 0x3fe8f5c3    # 1.82f

    .line 389
    .line 390
    .line 391
    const v13, 0x3f59999a    # 0.85f

    .line 392
    .line 393
    .line 394
    const v14, 0x3e9eb852    # 0.31f

    .line 395
    .line 396
    .line 397
    const v15, 0x3fc147ae    # 1.51f

    .line 398
    .line 399
    .line 400
    const v16, 0x3f7851ec    # 0.97f

    .line 401
    .line 402
    .line 403
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 404
    .line 405
    .line 406
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 407
    .line 408
    .line 409
    const/high16 v0, 0x41700000    # 15.0f

    .line 410
    .line 411
    const v2, 0x40928f5c    # 4.58f

    .line 412
    .line 413
    .line 414
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 415
    .line 416
    .line 417
    const v17, 0x419b5c29    # 19.42f

    .line 418
    .line 419
    .line 420
    const/high16 v18, 0x41100000    # 9.0f

    .line 421
    .line 422
    const/high16 v13, 0x41880000    # 17.0f

    .line 423
    .line 424
    const v14, 0x40accccd    # 5.4f

    .line 425
    .line 426
    .line 427
    const v15, 0x4194cccd    # 18.6f

    .line 428
    .line 429
    .line 430
    const/high16 v16, 0x40e00000    # 7.0f

    .line 431
    .line 432
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 433
    .line 434
    .line 435
    const v0, -0x3fa47ae1    # -3.43f

    .line 436
    .line 437
    .line 438
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 439
    .line 440
    .line 441
    const v17, -0x40828f5c    # -0.99f

    .line 442
    .line 443
    .line 444
    const v18, -0x40828f5c    # -0.99f

    .line 445
    .line 446
    .line 447
    const v13, -0x4170a3d7    # -0.28f

    .line 448
    .line 449
    .line 450
    const v14, -0x41428f5c    # -0.37f

    .line 451
    .line 452
    .line 453
    const v15, -0x40e147ae    # -0.62f

    .line 454
    .line 455
    .line 456
    const v16, -0x40ca3d71    # -0.71f

    .line 457
    .line 458
    .line 459
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 460
    .line 461
    .line 462
    const/high16 v0, 0x41700000    # 15.0f

    .line 463
    .line 464
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 465
    .line 466
    .line 467
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 468
    .line 469
    .line 470
    const/high16 v0, 0x40000000    # 2.0f

    .line 471
    .line 472
    const/high16 v2, 0x41400000    # 12.0f

    .line 473
    .line 474
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 475
    .line 476
    .line 477
    const/high16 v17, 0x41100000    # 9.0f

    .line 478
    .line 479
    const v18, 0x411f3333    # 9.95f

    .line 480
    .line 481
    .line 482
    const/4 v13, 0x0

    .line 483
    const v14, 0x40a6147b    # 5.19f

    .line 484
    .line 485
    .line 486
    const v15, 0x407ccccd    # 3.95f

    .line 487
    .line 488
    .line 489
    const v16, 0x41173333    # 9.45f

    .line 490
    .line 491
    .line 492
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 493
    .line 494
    .line 495
    const v0, -0x3f1bd70a    # -7.13f

    .line 496
    .line 497
    .line 498
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 499
    .line 500
    .line 501
    const/high16 v18, 0x41400000    # 12.0f

    .line 502
    .line 503
    const v13, 0x411d70a4    # 9.84f

    .line 504
    .line 505
    .line 506
    const v14, 0x41666666    # 14.4f

    .line 507
    .line 508
    .line 509
    const/high16 v15, 0x41100000    # 9.0f

    .line 510
    .line 511
    const v16, 0x4154cccd    # 13.3f

    .line 512
    .line 513
    .line 514
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 515
    .line 516
    .line 517
    const/high16 v17, 0x40000000    # 2.0f

    .line 518
    .line 519
    const v18, -0x3fcb851f    # -2.82f

    .line 520
    .line 521
    .line 522
    const/4 v13, 0x0

    .line 523
    const v14, -0x4059999a    # -1.3f

    .line 524
    .line 525
    .line 526
    const v15, 0x3f570a3d    # 0.84f

    .line 527
    .line 528
    .line 529
    const v16, -0x3fe66666    # -2.4f

    .line 530
    .line 531
    .line 532
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 533
    .line 534
    .line 535
    const v0, 0x40033333    # 2.05f

    .line 536
    .line 537
    .line 538
    const/high16 v2, 0x41300000    # 11.0f

    .line 539
    .line 540
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 541
    .line 542
    .line 543
    const/high16 v17, -0x3ef00000    # -9.0f

    .line 544
    .line 545
    const v18, 0x411f3333    # 9.95f

    .line 546
    .line 547
    .line 548
    const v13, -0x3f5e6666    # -5.05f

    .line 549
    .line 550
    .line 551
    const/high16 v14, 0x3f000000    # 0.5f

    .line 552
    .line 553
    const/high16 v15, -0x3ef00000    # -9.0f

    .line 554
    .line 555
    const v16, 0x409851ec    # 4.76f

    .line 556
    .line 557
    .line 558
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 559
    .line 560
    .line 561
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 562
    .line 563
    .line 564
    const/high16 v0, 0x41100000    # 9.0f

    .line 565
    .line 566
    const v2, 0x40928f5c    # 4.58f

    .line 567
    .line 568
    .line 569
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 570
    .line 571
    .line 572
    const v0, 0x405c28f6    # 3.44f

    .line 573
    .line 574
    .line 575
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 576
    .line 577
    .line 578
    const/high16 v17, -0x40000000    # -2.0f

    .line 579
    .line 580
    const v18, 0x407eb852    # 3.98f

    .line 581
    .line 582
    .line 583
    const v13, -0x40628f5c    # -1.23f

    .line 584
    .line 585
    .line 586
    const v14, 0x3f6b851f    # 0.92f

    .line 587
    .line 588
    .line 589
    const/high16 v15, -0x40000000    # -2.0f

    .line 590
    .line 591
    const v16, 0x4018f5c3    # 2.39f

    .line 592
    .line 593
    .line 594
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 595
    .line 596
    .line 597
    const/high16 v17, 0x40000000    # 2.0f

    .line 598
    .line 599
    const v18, 0x407f5c29    # 3.99f

    .line 600
    .line 601
    .line 602
    const/4 v13, 0x0

    .line 603
    const v14, 0x3fcb851f    # 1.59f

    .line 604
    .line 605
    .line 606
    const v15, 0x3f451eb8    # 0.77f

    .line 607
    .line 608
    .line 609
    const v16, 0x4043d70a    # 3.06f

    .line 610
    .line 611
    .line 612
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 613
    .line 614
    .line 615
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 616
    .line 617
    .line 618
    const/high16 v17, 0x40800000    # 4.0f

    .line 619
    .line 620
    const/high16 v18, 0x41400000    # 12.0f

    .line 621
    .line 622
    const v13, 0x40c147ae    # 6.04f

    .line 623
    .line 624
    .line 625
    const v14, 0x4191eb85    # 18.24f

    .line 626
    .line 627
    .line 628
    const/high16 v15, 0x40800000    # 4.0f

    .line 629
    .line 630
    const v16, 0x4175999a    # 15.35f

    .line 631
    .line 632
    .line 633
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 634
    .line 635
    .line 636
    const/high16 v17, 0x40a00000    # 5.0f

    .line 637
    .line 638
    const v18, -0x3f128f5c    # -7.42f

    .line 639
    .line 640
    .line 641
    const/4 v13, 0x0

    .line 642
    const v14, -0x3fa9999a    # -3.35f

    .line 643
    .line 644
    .line 645
    const v15, 0x40028f5c    # 2.04f

    .line 646
    .line 647
    .line 648
    const v16, -0x3f3851ec    # -6.24f

    .line 649
    .line 650
    .line 651
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 652
    .line 653
    .line 654
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 655
    .line 656
    .line 657
    const/high16 v0, 0x41500000    # 13.0f

    .line 658
    .line 659
    const v2, 0x416d1eb8    # 14.82f

    .line 660
    .line 661
    .line 662
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 663
    .line 664
    .line 665
    const v0, 0x40e428f6    # 7.13f

    .line 666
    .line 667
    .line 668
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 669
    .line 670
    .line 671
    const v17, 0x410f3333    # 8.95f

    .line 672
    .line 673
    .line 674
    const v18, -0x3ef0cccd    # -8.95f

    .line 675
    .line 676
    .line 677
    const v13, 0x40970a3d    # 4.72f

    .line 678
    .line 679
    .line 680
    const v14, -0x410f5c29    # -0.47f

    .line 681
    .line 682
    .line 683
    const v15, 0x4107ae14    # 8.48f

    .line 684
    .line 685
    .line 686
    const v16, -0x3f78a3d7    # -4.23f

    .line 687
    .line 688
    .line 689
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 690
    .line 691
    .line 692
    const v0, -0x3f1bd70a    # -7.13f

    .line 693
    .line 694
    .line 695
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 696
    .line 697
    .line 698
    const v17, -0x40170a3d    # -1.82f

    .line 699
    .line 700
    .line 701
    const v18, 0x3fe8f5c3    # 1.82f

    .line 702
    .line 703
    .line 704
    const v13, -0x416147ae    # -0.31f

    .line 705
    .line 706
    .line 707
    const v14, 0x3f59999a    # 0.85f

    .line 708
    .line 709
    .line 710
    const v15, -0x4087ae14    # -0.97f

    .line 711
    .line 712
    .line 713
    const v16, 0x3fc147ae    # 1.51f

    .line 714
    .line 715
    .line 716
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 717
    .line 718
    .line 719
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 720
    .line 721
    .line 722
    const v0, 0x417fd70a    # 15.99f

    .line 723
    .line 724
    .line 725
    const/high16 v2, 0x41700000    # 15.0f

    .line 726
    .line 727
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 728
    .line 729
    .line 730
    const v17, 0x3f7d70a4    # 0.99f

    .line 731
    .line 732
    .line 733
    const v18, -0x40828f5c    # -0.99f

    .line 734
    .line 735
    .line 736
    const v13, 0x3ebd70a4    # 0.37f

    .line 737
    .line 738
    .line 739
    const v14, -0x4170a3d7    # -0.28f

    .line 740
    .line 741
    .line 742
    const v15, 0x3f35c28f    # 0.71f

    .line 743
    .line 744
    .line 745
    const v16, -0x40e3d70a    # -0.61f

    .line 746
    .line 747
    .line 748
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 749
    .line 750
    .line 751
    const v0, 0x405b851f    # 3.43f

    .line 752
    .line 753
    .line 754
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 755
    .line 756
    .line 757
    const/high16 v17, 0x41700000    # 15.0f

    .line 758
    .line 759
    const v18, 0x419b5c29    # 19.42f

    .line 760
    .line 761
    .line 762
    const v13, 0x4194cccd    # 18.6f

    .line 763
    .line 764
    .line 765
    const/high16 v14, 0x41880000    # 17.0f

    .line 766
    .line 767
    const/high16 v15, 0x41880000    # 17.0f

    .line 768
    .line 769
    const v16, 0x4194cccd    # 18.6f

    .line 770
    .line 771
    .line 772
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 773
    .line 774
    .line 775
    const v0, -0x3fa47ae1    # -3.43f

    .line 776
    .line 777
    .line 778
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 779
    .line 780
    .line 781
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 782
    .line 783
    .line 784
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 785
    .line 786
    .line 787
    move-result-object v2

    .line 788
    const/16 v16, 0x3800

    .line 789
    .line 790
    const/16 v17, 0x0

    .line 791
    .line 792
    const/high16 v6, 0x3f800000    # 1.0f

    .line 793
    .line 794
    const/high16 v8, 0x3f800000    # 1.0f

    .line 795
    .line 796
    const/4 v7, 0x0

    .line 797
    const/high16 v12, 0x3f800000    # 1.0f

    .line 798
    .line 799
    const/4 v13, 0x0

    .line 800
    const/4 v14, 0x0

    .line 801
    const/4 v15, 0x0

    .line 802
    const-string v4, ""

    .line 803
    .line 804
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 805
    .line 806
    .line 807
    move-result-object v0

    .line 808
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 809
    .line 810
    .line 811
    move-result-object v0

    .line 812
    sput-object v0, Landroidx/compose/material/icons/twotone/DonutSmallKt;->_donutSmall:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 813
    .line 814
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 815
    .line 816
    .line 817
    return-object v0
.end method
