.class public final Landroidx/compose/material/icons/twotone/SwipeKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_swipe",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "Swipe",
        "Landroidx/compose/material/icons/Icons$TwoTone;",
        "getSwipe",
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
        "SMAP\nSwipe.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Swipe.kt\nandroidx/compose/material/icons/twotone/SwipeKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,97:1\n212#2,12:98\n233#2,18:111\n253#2:148\n233#2,18:149\n253#2:186\n233#2,18:187\n253#2:224\n174#3:110\n705#4,2:129\n717#4,2:131\n719#4,11:137\n705#4,2:167\n717#4,2:169\n719#4,11:175\n705#4,2:205\n717#4,2:207\n719#4,11:213\n72#5,4:133\n72#5,4:171\n72#5,4:209\n*S KotlinDebug\n*F\n+ 1 Swipe.kt\nandroidx/compose/material/icons/twotone/SwipeKt\n*L\n29#1:98,12\n30#1:111,18\n30#1:148\n46#1:149,18\n46#1:186\n60#1:187,18\n60#1:224\n29#1:110\n30#1:129,2\n30#1:131,2\n30#1:137,11\n46#1:167,2\n46#1:169,2\n46#1:175,11\n60#1:205,2\n60#1:207,2\n60#1:213,11\n30#1:133,4\n46#1:171,4\n60#1:209,4\n*E\n"
    }
.end annotation


# static fields
.field private static _swipe:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getSwipe(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/SwipeKt;->_swipe:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.Swipe"

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
    const v4, 0x41a10a3d    # 20.13f

    .line 71
    .line 72
    .line 73
    const v6, 0x4077ae14    # 3.87f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const/high16 v25, 0x41400000    # 12.0f

    .line 80
    .line 81
    const/high16 v26, 0x3f800000    # 1.0f

    .line 82
    .line 83
    const v21, 0x4195851f    # 18.69f

    .line 84
    .line 85
    .line 86
    const v22, 0x400ae148    # 2.17f

    .line 87
    .line 88
    .line 89
    const v23, 0x4179999a    # 15.6f

    .line 90
    .line 91
    .line 92
    const/high16 v24, 0x3f800000    # 1.0f

    .line 93
    .line 94
    move-object/from16 v20, v2

    .line 95
    .line 96
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 97
    .line 98
    .line 99
    const v4, 0x40a9eb85    # 5.31f

    .line 100
    .line 101
    .line 102
    const v6, 0x400ae148    # 2.17f

    .line 103
    .line 104
    .line 105
    const v7, 0x4077ae14    # 3.87f

    .line 106
    .line 107
    .line 108
    invoke-virtual {v2, v4, v6, v7, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 109
    .line 110
    .line 111
    const/high16 v4, 0x40000000    # 2.0f

    .line 112
    .line 113
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 114
    .line 115
    .line 116
    const/high16 v4, 0x40a00000    # 5.0f

    .line 117
    .line 118
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 119
    .line 120
    .line 121
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 122
    .line 123
    .line 124
    const v4, 0x409dc28f    # 4.93f

    .line 125
    .line 126
    .line 127
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 128
    .line 129
    .line 130
    const v25, 0x40e23d71    # 7.07f

    .line 131
    .line 132
    .line 133
    const v26, -0x3fe47ae1    # -2.43f

    .line 134
    .line 135
    .line 136
    const/high16 v21, 0x3f800000    # 1.0f

    .line 137
    .line 138
    const v22, -0x405ae148    # -1.29f

    .line 139
    .line 140
    .line 141
    const v23, 0x406ccccd    # 3.7f

    .line 142
    .line 143
    .line 144
    const v24, -0x3fe47ae1    # -2.43f

    .line 145
    .line 146
    .line 147
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 148
    .line 149
    .line 150
    const v4, 0x40e23d71    # 7.07f

    .line 151
    .line 152
    .line 153
    const v6, 0x401b851f    # 2.43f

    .line 154
    .line 155
    .line 156
    const v7, 0x40c23d71    # 6.07f

    .line 157
    .line 158
    .line 159
    const v8, 0x3f91eb85    # 1.14f

    .line 160
    .line 161
    .line 162
    invoke-virtual {v2, v7, v8, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 163
    .line 164
    .line 165
    const/high16 v4, 0x41880000    # 17.0f

    .line 166
    .line 167
    const/high16 v6, 0x40e00000    # 7.0f

    .line 168
    .line 169
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 170
    .line 171
    .line 172
    const/high16 v4, 0x40a00000    # 5.0f

    .line 173
    .line 174
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 175
    .line 176
    .line 177
    const/high16 v4, 0x40000000    # 2.0f

    .line 178
    .line 179
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 180
    .line 181
    .line 182
    const v4, 0x41a10a3d    # 20.13f

    .line 183
    .line 184
    .line 185
    const v6, 0x4077ae14    # 3.87f

    .line 186
    .line 187
    .line 188
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 189
    .line 190
    .line 191
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 192
    .line 193
    .line 194
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 195
    .line 196
    .line 197
    move-result-object v2

    .line 198
    const/16 v16, 0x3800

    .line 199
    .line 200
    const/16 v17, 0x0

    .line 201
    .line 202
    const/high16 v6, 0x3f800000    # 1.0f

    .line 203
    .line 204
    const/high16 v8, 0x3f800000    # 1.0f

    .line 205
    .line 206
    const/4 v7, 0x0

    .line 207
    const/high16 v9, 0x3f800000    # 1.0f

    .line 208
    .line 209
    const/high16 v12, 0x3f800000    # 1.0f

    .line 210
    .line 211
    const/4 v13, 0x0

    .line 212
    const/4 v14, 0x0

    .line 213
    const/4 v15, 0x0

    .line 214
    const-string v4, ""

    .line 215
    .line 216
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 217
    .line 218
    .line 219
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 220
    .line 221
    .line 222
    move-result v3

    .line 223
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 224
    .line 225
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 226
    .line 227
    .line 228
    move-result-wide v6

    .line 229
    const/4 v2, 0x0

    .line 230
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 231
    .line 232
    .line 233
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 234
    .line 235
    .line 236
    move-result v10

    .line 237
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 238
    .line 239
    .line 240
    move-result v11

    .line 241
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 242
    .line 243
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 244
    .line 245
    .line 246
    const v4, 0x415ae148    # 13.68f

    .line 247
    .line 248
    .line 249
    const/high16 v6, 0x41400000    # 12.0f

    .line 250
    .line 251
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 252
    .line 253
    .line 254
    const/high16 v4, 0x40f00000    # 7.5f

    .line 255
    .line 256
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 257
    .line 258
    .line 259
    const/high16 v25, 0x41380000    # 11.5f

    .line 260
    .line 261
    const/high16 v26, 0x40e00000    # 7.0f

    .line 262
    .line 263
    const/high16 v21, 0x41400000    # 12.0f

    .line 264
    .line 265
    const v22, 0x40e70a3d    # 7.22f

    .line 266
    .line 267
    .line 268
    const v23, 0x413c7ae1    # 11.78f

    .line 269
    .line 270
    .line 271
    const/high16 v24, 0x40e00000    # 7.0f

    .line 272
    .line 273
    move-object/from16 v20, v2

    .line 274
    .line 275
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 276
    .line 277
    .line 278
    const v4, 0x40e70a3d    # 7.22f

    .line 279
    .line 280
    .line 281
    const/high16 v6, 0x41300000    # 11.0f

    .line 282
    .line 283
    const/high16 v7, 0x40f00000    # 7.5f

    .line 284
    .line 285
    invoke-virtual {v2, v6, v4, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 286
    .line 287
    .line 288
    const v4, 0x4129c28f    # 10.61f

    .line 289
    .line 290
    .line 291
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 292
    .line 293
    .line 294
    const v4, -0x3f7a8f5c    # -4.17f

    .line 295
    .line 296
    .line 297
    const v6, -0x409c28f6    # -0.89f

    .line 298
    .line 299
    .line 300
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 301
    .line 302
    .line 303
    const v4, 0x406ccccd    # 3.7f

    .line 304
    .line 305
    .line 306
    const v6, 0x4071eb85    # 3.78f

    .line 307
    .line 308
    .line 309
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 310
    .line 311
    .line 312
    const v4, 0x40d1999a    # 6.55f

    .line 313
    .line 314
    .line 315
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 316
    .line 317
    .line 318
    const v4, 0x4178f5c3    # 15.56f

    .line 319
    .line 320
    .line 321
    const/high16 v6, 0x41900000    # 18.0f

    .line 322
    .line 323
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 324
    .line 325
    .line 326
    const v4, -0x3f7851ec    # -4.24f

    .line 327
    .line 328
    .line 329
    const v6, -0x400e147b    # -1.89f

    .line 330
    .line 331
    .line 332
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 333
    .line 334
    .line 335
    const/high16 v4, 0x41400000    # 12.0f

    .line 336
    .line 337
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 338
    .line 339
    .line 340
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 341
    .line 342
    .line 343
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 344
    .line 345
    .line 346
    move-result-object v2

    .line 347
    const v6, 0x3e99999a    # 0.3f

    .line 348
    .line 349
    .line 350
    const v8, 0x3e99999a    # 0.3f

    .line 351
    .line 352
    .line 353
    const/4 v7, 0x0

    .line 354
    const-string v4, ""

    .line 355
    .line 356
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 357
    .line 358
    .line 359
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 360
    .line 361
    .line 362
    move-result v3

    .line 363
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 364
    .line 365
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 366
    .line 367
    .line 368
    move-result-wide v6

    .line 369
    const/4 v0, 0x0

    .line 370
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 371
    .line 372
    .line 373
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 374
    .line 375
    .line 376
    move-result v10

    .line 377
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 378
    .line 379
    .line 380
    move-result v11

    .line 381
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 382
    .line 383
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 384
    .line 385
    .line 386
    const v0, 0x41971eb8    # 18.89f

    .line 387
    .line 388
    .line 389
    const v2, 0x415c51ec    # 13.77f

    .line 390
    .line 391
    .line 392
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 393
    .line 394
    .line 395
    const v0, -0x3f8ccccd    # -3.8f

    .line 396
    .line 397
    .line 398
    const v2, -0x402a3d71    # -1.67f

    .line 399
    .line 400
    .line 401
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 402
    .line 403
    .line 404
    const v17, 0x416a6666    # 14.65f

    .line 405
    .line 406
    .line 407
    const/high16 v18, 0x41400000    # 12.0f

    .line 408
    .line 409
    const v13, 0x416f5c29    # 14.96f

    .line 410
    .line 411
    .line 412
    const v14, 0x4140a3d7    # 12.04f

    .line 413
    .line 414
    .line 415
    const v15, 0x416cf5c3    # 14.81f

    .line 416
    .line 417
    .line 418
    const/high16 v16, 0x41400000    # 12.0f

    .line 419
    .line 420
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 421
    .line 422
    .line 423
    const/high16 v0, 0x41600000    # 14.0f

    .line 424
    .line 425
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 426
    .line 427
    .line 428
    const v0, 0x40f428f6    # 7.63f

    .line 429
    .line 430
    .line 431
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 432
    .line 433
    .line 434
    const v17, -0x3feeb852    # -2.27f

    .line 435
    .line 436
    .line 437
    const v18, -0x3fd851ec    # -2.62f

    .line 438
    .line 439
    .line 440
    const/4 v13, 0x0

    .line 441
    const v14, -0x40570a3d    # -1.32f

    .line 442
    .line 443
    .line 444
    const v15, -0x408a3d71    # -0.96f

    .line 445
    .line 446
    .line 447
    const/high16 v16, -0x3fe00000    # -2.5f

    .line 448
    .line 449
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 450
    .line 451
    .line 452
    const/high16 v17, 0x41100000    # 9.0f

    .line 453
    .line 454
    const/high16 v18, 0x40f00000    # 7.5f

    .line 455
    .line 456
    const/high16 v13, 0x41240000    # 10.25f

    .line 457
    .line 458
    const v14, 0x409c28f6    # 4.88f

    .line 459
    .line 460
    .line 461
    const/high16 v15, 0x41100000    # 9.0f

    .line 462
    .line 463
    const v16, 0x40c1999a    # 6.05f

    .line 464
    .line 465
    .line 466
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 467
    .line 468
    .line 469
    const v0, 0x41026666    # 8.15f

    .line 470
    .line 471
    .line 472
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 473
    .line 474
    .line 475
    const v0, -0x4010a3d7    # -1.87f

    .line 476
    .line 477
    .line 478
    const v2, -0x41333333    # -0.4f

    .line 479
    .line 480
    .line 481
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 482
    .line 483
    .line 484
    const v17, -0x40228f5c    # -1.73f

    .line 485
    .line 486
    .line 487
    const v18, 0x3f0f5c29    # 0.56f

    .line 488
    .line 489
    .line 490
    const v13, -0x41bd70a4    # -0.19f

    .line 491
    .line 492
    .line 493
    const v14, -0x430a3d71    # -0.03f

    .line 494
    .line 495
    .line 496
    const v15, -0x407d70a4    # -1.02f

    .line 497
    .line 498
    .line 499
    const v16, -0x41e66666    # -0.15f

    .line 500
    .line 501
    .line 502
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 503
    .line 504
    .line 505
    const/high16 v0, 0x40800000    # 4.0f

    .line 506
    .line 507
    const v2, 0x4189c28f    # 17.22f

    .line 508
    .line 509
    .line 510
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 511
    .line 512
    .line 513
    const v0, 0x40a3d70a    # 5.12f

    .line 514
    .line 515
    .line 516
    const v2, 0x40a6147b    # 5.19f

    .line 517
    .line 518
    .line 519
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 520
    .line 521
    .line 522
    const v17, 0x41287ae1    # 10.53f

    .line 523
    .line 524
    .line 525
    const/high16 v18, 0x41b80000    # 23.0f

    .line 526
    .line 527
    const v13, 0x4117d70a    # 9.49f

    .line 528
    .line 529
    .line 530
    const v14, 0x41b651ec    # 22.79f

    .line 531
    .line 532
    .line 533
    const/high16 v15, 0x41200000    # 10.0f

    .line 534
    .line 535
    const/high16 v16, 0x41b80000    # 23.0f

    .line 536
    .line 537
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 538
    .line 539
    .line 540
    const v0, 0x40d1999a    # 6.55f

    .line 541
    .line 542
    .line 543
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 544
    .line 545
    .line 546
    const v17, 0x3ffc28f6    # 1.97f

    .line 547
    .line 548
    .line 549
    const v18, -0x402a3d71    # -1.67f

    .line 550
    .line 551
    .line 552
    const v13, 0x3f7ae148    # 0.98f

    .line 553
    .line 554
    .line 555
    const/4 v14, 0x0

    .line 556
    const v15, 0x3fe7ae14    # 1.81f

    .line 557
    .line 558
    .line 559
    const v16, -0x40cccccd    # -0.7f

    .line 560
    .line 561
    .line 562
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 563
    .line 564
    .line 565
    const v0, 0x3f6b851f    # 0.92f

    .line 566
    .line 567
    .line 568
    const v2, -0x3f51eb85    # -5.44f

    .line 569
    .line 570
    .line 571
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 572
    .line 573
    .line 574
    const v17, 0x41971eb8    # 18.89f

    .line 575
    .line 576
    .line 577
    const v18, 0x415c51ec    # 13.77f

    .line 578
    .line 579
    .line 580
    const v13, 0x41a0f5c3    # 20.12f

    .line 581
    .line 582
    .line 583
    const v14, 0x41707ae1    # 15.03f

    .line 584
    .line 585
    .line 586
    const v15, 0x419d70a4    # 19.68f

    .line 587
    .line 588
    .line 589
    const v16, 0x4162b852    # 14.17f

    .line 590
    .line 591
    .line 592
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 593
    .line 594
    .line 595
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 596
    .line 597
    .line 598
    const/high16 v0, 0x41a80000    # 21.0f

    .line 599
    .line 600
    const v2, 0x4188a3d7    # 17.08f

    .line 601
    .line 602
    .line 603
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 604
    .line 605
    .line 606
    const v0, -0x3f2e6666    # -6.55f

    .line 607
    .line 608
    .line 609
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 610
    .line 611
    .line 612
    const v0, -0x3f933333    # -3.7f

    .line 613
    .line 614
    .line 615
    const v2, -0x3f8e147b    # -3.78f

    .line 616
    .line 617
    .line 618
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 619
    .line 620
    .line 621
    const v0, 0x4190e148    # 18.11f

    .line 622
    .line 623
    .line 624
    const/high16 v2, 0x41300000    # 11.0f

    .line 625
    .line 626
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 627
    .line 628
    .line 629
    const/high16 v0, 0x40f00000    # 7.5f

    .line 630
    .line 631
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 632
    .line 633
    .line 634
    const/high16 v17, 0x41380000    # 11.5f

    .line 635
    .line 636
    const/high16 v18, 0x40e00000    # 7.0f

    .line 637
    .line 638
    const/high16 v13, 0x41300000    # 11.0f

    .line 639
    .line 640
    const v14, 0x40e70a3d    # 7.22f

    .line 641
    .line 642
    .line 643
    const v15, 0x4133851f    # 11.22f

    .line 644
    .line 645
    .line 646
    const/high16 v16, 0x40e00000    # 7.0f

    .line 647
    .line 648
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 649
    .line 650
    .line 651
    const v0, 0x40e70a3d    # 7.22f

    .line 652
    .line 653
    .line 654
    const/high16 v2, 0x40f00000    # 7.5f

    .line 655
    .line 656
    const/high16 v4, 0x41400000    # 12.0f

    .line 657
    .line 658
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 659
    .line 660
    .line 661
    const v0, 0x40c5c28f    # 6.18f

    .line 662
    .line 663
    .line 664
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 665
    .line 666
    .line 667
    const v0, 0x3fe147ae    # 1.76f

    .line 668
    .line 669
    .line 670
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 671
    .line 672
    .line 673
    const v0, 0x4178f5c3    # 15.56f

    .line 674
    .line 675
    .line 676
    const/high16 v2, 0x41900000    # 18.0f

    .line 677
    .line 678
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 679
    .line 680
    .line 681
    const/high16 v0, 0x41a80000    # 21.0f

    .line 682
    .line 683
    const v2, 0x4188a3d7    # 17.08f

    .line 684
    .line 685
    .line 686
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 687
    .line 688
    .line 689
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 690
    .line 691
    .line 692
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 693
    .line 694
    .line 695
    move-result-object v2

    .line 696
    const/16 v16, 0x3800

    .line 697
    .line 698
    const/16 v17, 0x0

    .line 699
    .line 700
    const/high16 v6, 0x3f800000    # 1.0f

    .line 701
    .line 702
    const/high16 v8, 0x3f800000    # 1.0f

    .line 703
    .line 704
    const/4 v7, 0x0

    .line 705
    const/high16 v12, 0x3f800000    # 1.0f

    .line 706
    .line 707
    const/4 v13, 0x0

    .line 708
    const/4 v14, 0x0

    .line 709
    const/4 v15, 0x0

    .line 710
    const-string v4, ""

    .line 711
    .line 712
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 713
    .line 714
    .line 715
    move-result-object v0

    .line 716
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 717
    .line 718
    .line 719
    move-result-object v0

    .line 720
    sput-object v0, Landroidx/compose/material/icons/twotone/SwipeKt;->_swipe:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 721
    .line 722
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 723
    .line 724
    .line 725
    return-object v0
.end method
