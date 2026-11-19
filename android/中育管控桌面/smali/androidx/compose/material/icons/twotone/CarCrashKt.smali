.class public final Landroidx/compose/material/icons/twotone/CarCrashKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_carCrash",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "CarCrash",
        "Landroidx/compose/material/icons/Icons$TwoTone;",
        "getCarCrash",
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
        "SMAP\nCarCrash.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CarCrash.kt\nandroidx/compose/material/icons/twotone/CarCrashKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,116:1\n212#2,12:117\n233#2,18:130\n253#2:167\n233#2,18:168\n253#2:205\n174#3:129\n705#4,2:148\n717#4,2:150\n719#4,11:156\n705#4,2:186\n717#4,2:188\n719#4,11:194\n72#5,4:152\n72#5,4:190\n*S KotlinDebug\n*F\n+ 1 CarCrash.kt\nandroidx/compose/material/icons/twotone/CarCrashKt\n*L\n29#1:117,12\n30#1:130,18\n30#1:167\n50#1:168,18\n50#1:205\n29#1:129\n30#1:148,2\n30#1:150,2\n30#1:156,11\n50#1:186,2\n50#1:188,2\n50#1:194,11\n30#1:152,4\n50#1:190,4\n*E\n"
    }
.end annotation


# static fields
.field private static _carCrash:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getCarCrash(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/CarCrashKt;->_carCrash:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.CarCrash"

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
    const/high16 v4, 0x41500000    # 13.0f

    .line 71
    .line 72
    const v6, 0x418f47ae    # 17.91f

    .line 73
    .line 74
    .line 75
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    const v25, 0x3db851ec    # 0.09f

    .line 79
    .line 80
    .line 81
    const/high16 v26, 0x3f000000    # 0.5f

    .line 82
    .line 83
    const v21, 0x3d75c28f    # 0.06f

    .line 84
    .line 85
    .line 86
    const v22, 0x3e23d70a    # 0.16f

    .line 87
    .line 88
    .line 89
    const v23, 0x3db851ec    # 0.09f

    .line 90
    .line 91
    .line 92
    const v24, 0x3ea8f5c3    # 0.33f

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
    const/high16 v25, -0x40400000    # -1.5f

    .line 101
    .line 102
    const/high16 v26, 0x3fc00000    # 1.5f

    .line 103
    .line 104
    const/16 v21, 0x0

    .line 105
    .line 106
    const v22, 0x3f547ae1    # 0.83f

    .line 107
    .line 108
    .line 109
    const v23, -0x40d47ae1    # -0.67f

    .line 110
    .line 111
    .line 112
    const/high16 v24, 0x3fc00000    # 1.5f

    .line 113
    .line 114
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 115
    .line 116
    .line 117
    const v4, 0x416547ae    # 14.33f

    .line 118
    .line 119
    .line 120
    const/high16 v6, 0x41580000    # 13.5f

    .line 121
    .line 122
    const/high16 v7, 0x41700000    # 15.0f

    .line 123
    .line 124
    invoke-virtual {v2, v7, v4, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 125
    .line 126
    .line 127
    const v25, 0x3ec7ae14    # 0.39f

    .line 128
    .line 129
    .line 130
    const/high16 v26, -0x40800000    # -1.0f

    .line 131
    .line 132
    const v22, -0x413851ec    # -0.39f

    .line 133
    .line 134
    .line 135
    const v23, 0x3e19999a    # 0.15f

    .line 136
    .line 137
    .line 138
    const v24, -0x40c28f5c    # -0.74f

    .line 139
    .line 140
    .line 141
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 142
    .line 143
    .line 144
    const v25, -0x3fed70a4    # -2.29f

    .line 145
    .line 146
    .line 147
    const/high16 v26, -0x40400000    # -1.5f

    .line 148
    .line 149
    const v21, -0x40a3d70a    # -0.86f

    .line 150
    .line 151
    .line 152
    const v22, -0x414ccccd    # -0.35f

    .line 153
    .line 154
    .line 155
    const v23, -0x402f5c29    # -1.63f

    .line 156
    .line 157
    .line 158
    const v24, -0x40a3d70a    # -0.86f

    .line 159
    .line 160
    .line 161
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 162
    .line 163
    .line 164
    const/high16 v4, 0x40a00000    # 5.0f

    .line 165
    .line 166
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 167
    .line 168
    .line 169
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 170
    .line 171
    .line 172
    const/high16 v4, 0x41600000    # 14.0f

    .line 173
    .line 174
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 175
    .line 176
    .line 177
    const v4, -0x3fbb851f    # -3.07f

    .line 178
    .line 179
    .line 180
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 181
    .line 182
    .line 183
    const v25, 0x418f47ae    # 17.91f

    .line 184
    .line 185
    .line 186
    const/high16 v26, 0x41500000    # 13.0f

    .line 187
    .line 188
    const v21, 0x41955c29    # 18.67f

    .line 189
    .line 190
    .line 191
    const v22, 0x414fae14    # 12.98f

    .line 192
    .line 193
    .line 194
    const v23, 0x41931eb8    # 18.39f

    .line 195
    .line 196
    .line 197
    const/high16 v24, 0x41500000    # 13.0f

    .line 198
    .line 199
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 200
    .line 201
    .line 202
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 203
    .line 204
    .line 205
    const/high16 v4, 0x40f00000    # 7.5f

    .line 206
    .line 207
    const/high16 v6, 0x41700000    # 15.0f

    .line 208
    .line 209
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 210
    .line 211
    .line 212
    const/high16 v25, 0x40c00000    # 6.0f

    .line 213
    .line 214
    const/high16 v26, 0x41580000    # 13.5f

    .line 215
    .line 216
    const v21, 0x40d570a4    # 6.67f

    .line 217
    .line 218
    .line 219
    const/high16 v22, 0x41700000    # 15.0f

    .line 220
    .line 221
    const/high16 v23, 0x40c00000    # 6.0f

    .line 222
    .line 223
    const v24, 0x416547ae    # 14.33f

    .line 224
    .line 225
    .line 226
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 227
    .line 228
    .line 229
    const v4, 0x40d570a4    # 6.67f

    .line 230
    .line 231
    .line 232
    const/high16 v6, 0x41400000    # 12.0f

    .line 233
    .line 234
    const/high16 v7, 0x40f00000    # 7.5f

    .line 235
    .line 236
    invoke-virtual {v2, v4, v6, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 237
    .line 238
    .line 239
    const v4, 0x414ab852    # 12.67f

    .line 240
    .line 241
    .line 242
    const/high16 v6, 0x41100000    # 9.0f

    .line 243
    .line 244
    const/high16 v7, 0x41580000    # 13.5f

    .line 245
    .line 246
    invoke-virtual {v2, v6, v4, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 247
    .line 248
    .line 249
    const v4, 0x410547ae    # 8.33f

    .line 250
    .line 251
    .line 252
    const/high16 v6, 0x40f00000    # 7.5f

    .line 253
    .line 254
    const/high16 v7, 0x41700000    # 15.0f

    .line 255
    .line 256
    invoke-virtual {v2, v4, v7, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 257
    .line 258
    .line 259
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 260
    .line 261
    .line 262
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 263
    .line 264
    .line 265
    move-result-object v2

    .line 266
    const/16 v16, 0x3800

    .line 267
    .line 268
    const/16 v17, 0x0

    .line 269
    .line 270
    const v6, 0x3e99999a    # 0.3f

    .line 271
    .line 272
    .line 273
    const v8, 0x3e99999a    # 0.3f

    .line 274
    .line 275
    .line 276
    const/4 v7, 0x0

    .line 277
    const/high16 v9, 0x3f800000    # 1.0f

    .line 278
    .line 279
    const/high16 v12, 0x3f800000    # 1.0f

    .line 280
    .line 281
    const/4 v13, 0x0

    .line 282
    const/4 v14, 0x0

    .line 283
    const/4 v15, 0x0

    .line 284
    const-string v4, ""

    .line 285
    .line 286
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 287
    .line 288
    .line 289
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 290
    .line 291
    .line 292
    move-result v3

    .line 293
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 294
    .line 295
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 296
    .line 297
    .line 298
    move-result-wide v6

    .line 299
    const/4 v0, 0x0

    .line 300
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 301
    .line 302
    .line 303
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 304
    .line 305
    .line 306
    move-result v10

    .line 307
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 308
    .line 309
    .line 310
    move-result v11

    .line 311
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 312
    .line 313
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 314
    .line 315
    .line 316
    const/high16 v0, 0x41900000    # 18.0f

    .line 317
    .line 318
    const/high16 v2, 0x3f800000    # 1.0f

    .line 319
    .line 320
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 321
    .line 322
    .line 323
    const/high16 v17, -0x3f600000    # -5.0f

    .line 324
    .line 325
    const/high16 v18, 0x40a00000    # 5.0f

    .line 326
    .line 327
    const v13, -0x3fcf5c29    # -2.76f

    .line 328
    .line 329
    .line 330
    const/high16 v15, -0x3f600000    # -5.0f

    .line 331
    .line 332
    const v16, 0x400f5c29    # 2.24f

    .line 333
    .line 334
    .line 335
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 336
    .line 337
    .line 338
    const v0, 0x400f5c29    # 2.24f

    .line 339
    .line 340
    .line 341
    const/high16 v2, 0x40a00000    # 5.0f

    .line 342
    .line 343
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 344
    .line 345
    .line 346
    const v0, -0x3ff0a3d7    # -2.24f

    .line 347
    .line 348
    .line 349
    const/high16 v2, -0x3f600000    # -5.0f

    .line 350
    .line 351
    const/high16 v4, 0x40a00000    # 5.0f

    .line 352
    .line 353
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 354
    .line 355
    .line 356
    const v0, 0x41a6147b    # 20.76f

    .line 357
    .line 358
    .line 359
    const/high16 v2, 0x41900000    # 18.0f

    .line 360
    .line 361
    const/high16 v4, 0x3f800000    # 1.0f

    .line 362
    .line 363
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 364
    .line 365
    .line 366
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 367
    .line 368
    .line 369
    const/high16 v0, 0x40e00000    # 7.0f

    .line 370
    .line 371
    const/high16 v2, 0x41940000    # 18.5f

    .line 372
    .line 373
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 374
    .line 375
    .line 376
    const/high16 v0, -0x40800000    # -1.0f

    .line 377
    .line 378
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 379
    .line 380
    .line 381
    const/high16 v0, 0x40400000    # 3.0f

    .line 382
    .line 383
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 384
    .line 385
    .line 386
    const/high16 v0, 0x3f800000    # 1.0f

    .line 387
    .line 388
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 389
    .line 390
    .line 391
    const/high16 v0, 0x40e00000    # 7.0f

    .line 392
    .line 393
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 394
    .line 395
    .line 396
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 397
    .line 398
    .line 399
    const/high16 v0, 0x41000000    # 8.0f

    .line 400
    .line 401
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 402
    .line 403
    .line 404
    const/high16 v0, 0x3f800000    # 1.0f

    .line 405
    .line 406
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 407
    .line 408
    .line 409
    const/high16 v0, -0x40800000    # -1.0f

    .line 410
    .line 411
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 412
    .line 413
    .line 414
    const/high16 v0, 0x41000000    # 8.0f

    .line 415
    .line 416
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 417
    .line 418
    .line 419
    const/high16 v0, 0x41940000    # 18.5f

    .line 420
    .line 421
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 422
    .line 423
    .line 424
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 425
    .line 426
    .line 427
    const/high16 v0, 0x40c00000    # 6.0f

    .line 428
    .line 429
    const/high16 v2, 0x41580000    # 13.5f

    .line 430
    .line 431
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 432
    .line 433
    .line 434
    const/high16 v17, 0x40f00000    # 7.5f

    .line 435
    .line 436
    const/high16 v18, 0x41400000    # 12.0f

    .line 437
    .line 438
    const/high16 v13, 0x40c00000    # 6.0f

    .line 439
    .line 440
    const v14, 0x414ab852    # 12.67f

    .line 441
    .line 442
    .line 443
    const v15, 0x40d570a4    # 6.67f

    .line 444
    .line 445
    .line 446
    const/high16 v16, 0x41400000    # 12.0f

    .line 447
    .line 448
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 449
    .line 450
    .line 451
    const v0, 0x414ab852    # 12.67f

    .line 452
    .line 453
    .line 454
    const/high16 v2, 0x41100000    # 9.0f

    .line 455
    .line 456
    const/high16 v4, 0x41580000    # 13.5f

    .line 457
    .line 458
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 459
    .line 460
    .line 461
    const v0, 0x410547ae    # 8.33f

    .line 462
    .line 463
    .line 464
    const/high16 v2, 0x40f00000    # 7.5f

    .line 465
    .line 466
    const/high16 v4, 0x41700000    # 15.0f

    .line 467
    .line 468
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 469
    .line 470
    .line 471
    const v0, 0x416547ae    # 14.33f

    .line 472
    .line 473
    .line 474
    const/high16 v2, 0x40c00000    # 6.0f

    .line 475
    .line 476
    const/high16 v4, 0x41580000    # 13.5f

    .line 477
    .line 478
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 479
    .line 480
    .line 481
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 482
    .line 483
    .line 484
    const v0, 0x414ee148    # 12.93f

    .line 485
    .line 486
    .line 487
    const/high16 v2, 0x41980000    # 19.0f

    .line 488
    .line 489
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 490
    .line 491
    .line 492
    const/high16 v17, 0x40000000    # 2.0f

    .line 493
    .line 494
    const v18, -0x40e66666    # -0.6f

    .line 495
    .line 496
    .line 497
    const v13, 0x3f266666    # 0.65f

    .line 498
    .line 499
    .line 500
    const v14, -0x4247ae14    # -0.09f

    .line 501
    .line 502
    .line 503
    const v15, 0x3fab851f    # 1.34f

    .line 504
    .line 505
    .line 506
    const v16, -0x4170a3d7    # -0.28f

    .line 507
    .line 508
    .line 509
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 510
    .line 511
    .line 512
    const/4 v0, 0x0

    .line 513
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 514
    .line 515
    .line 516
    const/high16 v0, 0x41980000    # 19.0f

    .line 517
    .line 518
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 519
    .line 520
    .line 521
    const/high16 v17, -0x40800000    # -1.0f

    .line 522
    .line 523
    const/high16 v18, 0x3f800000    # 1.0f

    .line 524
    .line 525
    const/4 v13, 0x0

    .line 526
    const v14, 0x3f0ccccd    # 0.55f

    .line 527
    .line 528
    .line 529
    const v15, -0x4119999a    # -0.45f

    .line 530
    .line 531
    .line 532
    const/high16 v16, 0x3f800000    # 1.0f

    .line 533
    .line 534
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 535
    .line 536
    .line 537
    const/high16 v0, -0x40800000    # -1.0f

    .line 538
    .line 539
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 540
    .line 541
    .line 542
    const/high16 v18, -0x40800000    # -1.0f

    .line 543
    .line 544
    const v13, -0x40f33333    # -0.55f

    .line 545
    .line 546
    .line 547
    const/4 v14, 0x0

    .line 548
    const/high16 v15, -0x40800000    # -1.0f

    .line 549
    .line 550
    const v16, -0x4119999a    # -0.45f

    .line 551
    .line 552
    .line 553
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 554
    .line 555
    .line 556
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 557
    .line 558
    .line 559
    const/high16 v0, 0x40c00000    # 6.0f

    .line 560
    .line 561
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 562
    .line 563
    .line 564
    const/high16 v0, 0x3f800000    # 1.0f

    .line 565
    .line 566
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 567
    .line 568
    .line 569
    const/high16 v18, 0x3f800000    # 1.0f

    .line 570
    .line 571
    const/4 v13, 0x0

    .line 572
    const v14, 0x3f0ccccd    # 0.55f

    .line 573
    .line 574
    .line 575
    const v15, -0x4119999a    # -0.45f

    .line 576
    .line 577
    .line 578
    const/high16 v16, 0x3f800000    # 1.0f

    .line 579
    .line 580
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 581
    .line 582
    .line 583
    const/high16 v0, 0x40800000    # 4.0f

    .line 584
    .line 585
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 586
    .line 587
    .line 588
    const/high16 v18, -0x40800000    # -1.0f

    .line 589
    .line 590
    const v13, -0x40f33333    # -0.55f

    .line 591
    .line 592
    .line 593
    const/4 v14, 0x0

    .line 594
    const/high16 v15, -0x40800000    # -1.0f

    .line 595
    .line 596
    const v16, -0x4119999a    # -0.45f

    .line 597
    .line 598
    .line 599
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 600
    .line 601
    .line 602
    const/high16 v0, -0x3f000000    # -8.0f

    .line 603
    .line 604
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 605
    .line 606
    .line 607
    const v0, 0x40051eb8    # 2.08f

    .line 608
    .line 609
    .line 610
    const v2, -0x3f4051ec    # -5.99f

    .line 611
    .line 612
    .line 613
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 614
    .line 615
    .line 616
    const/high16 v17, 0x40d00000    # 6.5f

    .line 617
    .line 618
    const/high16 v18, 0x40800000    # 4.0f

    .line 619
    .line 620
    const v13, 0x40a947ae    # 5.29f

    .line 621
    .line 622
    .line 623
    const v14, 0x408d70a4    # 4.42f

    .line 624
    .line 625
    .line 626
    const v15, 0x40bae148    # 5.84f

    .line 627
    .line 628
    .line 629
    const/high16 v16, 0x40800000    # 4.0f

    .line 630
    .line 631
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 632
    .line 633
    .line 634
    const v0, 0x409947ae    # 4.79f

    .line 635
    .line 636
    .line 637
    const/4 v2, 0x0

    .line 638
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 639
    .line 640
    .line 641
    const/high16 v17, 0x41300000    # 11.0f

    .line 642
    .line 643
    const/high16 v18, 0x40c00000    # 6.0f

    .line 644
    .line 645
    const v13, 0x4131999a    # 11.1f

    .line 646
    .line 647
    .line 648
    const v14, 0x409428f6    # 4.63f

    .line 649
    .line 650
    .line 651
    const/high16 v15, 0x41300000    # 11.0f

    .line 652
    .line 653
    const v16, 0x40a9eb85    # 5.31f

    .line 654
    .line 655
    .line 656
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 657
    .line 658
    .line 659
    const v0, 0x40db3333    # 6.85f

    .line 660
    .line 661
    .line 662
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 663
    .line 664
    .line 665
    const v0, 0x40b9eb85    # 5.81f

    .line 666
    .line 667
    .line 668
    const/high16 v2, 0x41100000    # 9.0f

    .line 669
    .line 670
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 671
    .line 672
    .line 673
    const v0, 0x40bb851f    # 5.86f

    .line 674
    .line 675
    .line 676
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 677
    .line 678
    .line 679
    const/4 v0, 0x0

    .line 680
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 681
    .line 682
    .line 683
    const v17, 0x3fb70a3d    # 1.43f

    .line 684
    .line 685
    .line 686
    const/high16 v18, 0x40000000    # 2.0f

    .line 687
    .line 688
    const v13, 0x3eb851ec    # 0.36f

    .line 689
    .line 690
    .line 691
    const/high16 v14, 0x3f400000    # 0.75f

    .line 692
    .line 693
    const v15, 0x3f570a3d    # 0.84f

    .line 694
    .line 695
    .line 696
    const v16, 0x3fb70a3d    # 1.43f

    .line 697
    .line 698
    .line 699
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 700
    .line 701
    .line 702
    const/high16 v0, 0x41300000    # 11.0f

    .line 703
    .line 704
    const/high16 v2, 0x40a00000    # 5.0f

    .line 705
    .line 706
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 707
    .line 708
    .line 709
    const/high16 v0, 0x40a00000    # 5.0f

    .line 710
    .line 711
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 712
    .line 713
    .line 714
    const/high16 v0, 0x41600000    # 14.0f

    .line 715
    .line 716
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 717
    .line 718
    .line 719
    const v0, 0x414ee148    # 12.93f

    .line 720
    .line 721
    .line 722
    const/high16 v2, 0x41980000    # 19.0f

    .line 723
    .line 724
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 725
    .line 726
    .line 727
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 728
    .line 729
    .line 730
    const/high16 v0, 0x41500000    # 13.0f

    .line 731
    .line 732
    const v2, 0x418f47ae    # 17.91f

    .line 733
    .line 734
    .line 735
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 736
    .line 737
    .line 738
    const v17, -0x3fde147b    # -2.53f

    .line 739
    .line 740
    .line 741
    const v18, -0x40fd70a4    # -0.51f

    .line 742
    .line 743
    .line 744
    const v13, -0x409c28f6    # -0.89f

    .line 745
    .line 746
    .line 747
    const v14, -0x43dc28f6    # -0.01f

    .line 748
    .line 749
    .line 750
    const v15, -0x402147ae    # -1.74f

    .line 751
    .line 752
    .line 753
    const v16, -0x41bd70a4    # -0.19f

    .line 754
    .line 755
    .line 756
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 757
    .line 758
    .line 759
    const/high16 v17, 0x41700000    # 15.0f

    .line 760
    .line 761
    const/high16 v18, 0x41580000    # 13.5f

    .line 762
    .line 763
    const v13, 0x41726666    # 15.15f

    .line 764
    .line 765
    .line 766
    const v14, 0x414c28f6    # 12.76f

    .line 767
    .line 768
    .line 769
    const/high16 v15, 0x41700000    # 15.0f

    .line 770
    .line 771
    const v16, 0x4151c28f    # 13.11f

    .line 772
    .line 773
    .line 774
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 775
    .line 776
    .line 777
    const/high16 v17, 0x3fc00000    # 1.5f

    .line 778
    .line 779
    const/high16 v18, 0x3fc00000    # 1.5f

    .line 780
    .line 781
    const/4 v13, 0x0

    .line 782
    const v14, 0x3f547ae1    # 0.83f

    .line 783
    .line 784
    .line 785
    const v15, 0x3f2b851f    # 0.67f

    .line 786
    .line 787
    .line 788
    const/high16 v16, 0x3fc00000    # 1.5f

    .line 789
    .line 790
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 791
    .line 792
    .line 793
    const/high16 v0, 0x3fc00000    # 1.5f

    .line 794
    .line 795
    const/high16 v2, -0x40400000    # -1.5f

    .line 796
    .line 797
    const/high16 v4, 0x3fc00000    # 1.5f

    .line 798
    .line 799
    const v6, -0x40d47ae1    # -0.67f

    .line 800
    .line 801
    .line 802
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 803
    .line 804
    .line 805
    const v17, 0x418f47ae    # 17.91f

    .line 806
    .line 807
    .line 808
    const/high16 v18, 0x41500000    # 13.0f

    .line 809
    .line 810
    const/high16 v13, 0x41900000    # 18.0f

    .line 811
    .line 812
    const v14, 0x41551eb8    # 13.32f

    .line 813
    .line 814
    .line 815
    const v15, 0x418fc28f    # 17.97f

    .line 816
    .line 817
    .line 818
    const v16, 0x41528f5c    # 13.16f

    .line 819
    .line 820
    .line 821
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 822
    .line 823
    .line 824
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 825
    .line 826
    .line 827
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 828
    .line 829
    .line 830
    move-result-object v2

    .line 831
    const/16 v16, 0x3800

    .line 832
    .line 833
    const/16 v17, 0x0

    .line 834
    .line 835
    const/high16 v6, 0x3f800000    # 1.0f

    .line 836
    .line 837
    const/high16 v8, 0x3f800000    # 1.0f

    .line 838
    .line 839
    const/4 v7, 0x0

    .line 840
    const/high16 v12, 0x3f800000    # 1.0f

    .line 841
    .line 842
    const/4 v13, 0x0

    .line 843
    const/4 v14, 0x0

    .line 844
    const/4 v15, 0x0

    .line 845
    const-string v4, ""

    .line 846
    .line 847
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 848
    .line 849
    .line 850
    move-result-object v0

    .line 851
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 852
    .line 853
    .line 854
    move-result-object v0

    .line 855
    sput-object v0, Landroidx/compose/material/icons/twotone/CarCrashKt;->_carCrash:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 856
    .line 857
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 858
    .line 859
    .line 860
    return-object v0
.end method
