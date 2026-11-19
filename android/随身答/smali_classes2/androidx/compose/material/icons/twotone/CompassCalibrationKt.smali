.class public final Landroidx/compose/material/icons/twotone/CompassCalibrationKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_compassCalibration",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "CompassCalibration",
        "Landroidx/compose/material/icons/Icons$TwoTone;",
        "getCompassCalibration",
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
        "SMAP\nCompassCalibration.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CompassCalibration.kt\nandroidx/compose/material/icons/twotone/CompassCalibrationKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,81:1\n212#2,12:82\n233#2,18:95\n253#2:132\n233#2,18:133\n253#2:170\n233#2,18:171\n253#2:208\n174#3:94\n705#4,2:113\n717#4,2:115\n719#4,11:121\n705#4,2:151\n717#4,2:153\n719#4,11:159\n705#4,2:189\n717#4,2:191\n719#4,11:197\n72#5,4:117\n72#5,4:155\n72#5,4:193\n*S KotlinDebug\n*F\n+ 1 CompassCalibration.kt\nandroidx/compose/material/icons/twotone/CompassCalibrationKt\n*L\n29#1:82,12\n30#1:95,18\n30#1:132\n40#1:133,18\n40#1:170\n46#1:171,18\n46#1:208\n29#1:94\n30#1:113,2\n30#1:115,2\n30#1:121,11\n40#1:151,2\n40#1:153,2\n40#1:159,11\n46#1:189,2\n46#1:191,2\n46#1:197,11\n30#1:117,4\n40#1:155,4\n46#1:193,4\n*E\n"
    }
.end annotation


# static fields
.field private static _compassCalibration:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getCompassCalibration(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 28

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/CompassCalibrationKt;->_compassCalibration:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.CompassCalibration"

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
    const v4, 0x40e851ec    # 7.26f

    .line 71
    .line 72
    .line 73
    const v6, 0x409e147b    # 4.94f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v4, 0x400d70a4    # 2.21f

    .line 80
    .line 81
    .line 82
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 83
    .line 84
    .line 85
    const v25, 0x409b3333    # 4.85f

    .line 86
    .line 87
    .line 88
    const v26, -0x404ccccd    # -1.4f

    .line 89
    .line 90
    .line 91
    const v21, 0x3fb851ec    # 1.44f

    .line 92
    .line 93
    .line 94
    const v22, -0x40970a3d    # -0.91f

    .line 95
    .line 96
    .line 97
    const v23, 0x40470a3d    # 3.11f

    .line 98
    .line 99
    .line 100
    const v24, -0x404ccccd    # -1.4f

    .line 101
    .line 102
    .line 103
    move-object/from16 v20, v2

    .line 104
    .line 105
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 106
    .line 107
    .line 108
    const v25, 0x409ae148    # 4.84f

    .line 109
    .line 110
    .line 111
    const v26, 0x3fb33333    # 1.4f

    .line 112
    .line 113
    .line 114
    const v21, 0x3fdeb852    # 1.74f

    .line 115
    .line 116
    .line 117
    const/16 v22, 0x0

    .line 118
    .line 119
    const v23, 0x405a3d71    # 3.41f

    .line 120
    .line 121
    .line 122
    const v24, 0x3efae148    # 0.49f

    .line 123
    .line 124
    .line 125
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 126
    .line 127
    .line 128
    const v4, -0x3ff28f5c    # -2.21f

    .line 129
    .line 130
    .line 131
    const v6, 0x400d70a4    # 2.21f

    .line 132
    .line 133
    .line 134
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 135
    .line 136
    .line 137
    const/high16 v25, 0x41400000    # 12.0f

    .line 138
    .line 139
    const/high16 v26, 0x40a00000    # 5.0f

    .line 140
    .line 141
    const/high16 v21, 0x41880000    # 17.0f

    .line 142
    .line 143
    const v22, 0x40b947ae    # 5.79f

    .line 144
    .line 145
    .line 146
    const v23, 0x4168f5c3    # 14.56f

    .line 147
    .line 148
    .line 149
    const/high16 v24, 0x40a00000    # 5.0f

    .line 150
    .line 151
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 152
    .line 153
    .line 154
    const v25, -0x3f1e147b    # -7.06f

    .line 155
    .line 156
    .line 157
    const v26, 0x4010a3d7    # 2.26f

    .line 158
    .line 159
    .line 160
    const v21, -0x3fdc28f6    # -2.56f

    .line 161
    .line 162
    .line 163
    const/16 v22, 0x0

    .line 164
    .line 165
    const v23, -0x3f5fae14    # -5.01f

    .line 166
    .line 167
    .line 168
    const v24, 0x3f4a3d71    # 0.79f

    .line 169
    .line 170
    .line 171
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

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
    const v6, 0x3e99999a    # 0.3f

    .line 186
    .line 187
    .line 188
    const v8, 0x3e99999a    # 0.3f

    .line 189
    .line 190
    .line 191
    const/4 v7, 0x0

    .line 192
    const/high16 v9, 0x3f800000    # 1.0f

    .line 193
    .line 194
    const/high16 v12, 0x3f800000    # 1.0f

    .line 195
    .line 196
    const/4 v13, 0x0

    .line 197
    const/4 v14, 0x0

    .line 198
    const/4 v15, 0x0

    .line 199
    const-string v4, ""

    .line 200
    .line 201
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 202
    .line 203
    .line 204
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 205
    .line 206
    .line 207
    move-result v3

    .line 208
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 209
    .line 210
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 211
    .line 212
    .line 213
    move-result-wide v6

    .line 214
    const/4 v2, 0x0

    .line 215
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 216
    .line 217
    .line 218
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 219
    .line 220
    .line 221
    move-result v10

    .line 222
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 223
    .line 224
    .line 225
    move-result v11

    .line 226
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 227
    .line 228
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 229
    .line 230
    .line 231
    const/high16 v4, 0x41400000    # 12.0f

    .line 232
    .line 233
    const/high16 v6, 0x41880000    # 17.0f

    .line 234
    .line 235
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 236
    .line 237
    .line 238
    const/4 v4, 0x0

    .line 239
    const/high16 v6, -0x3fc00000    # -3.0f

    .line 240
    .line 241
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 242
    .line 243
    .line 244
    const/high16 v26, 0x40c00000    # 6.0f

    .line 245
    .line 246
    const/16 v27, 0x0

    .line 247
    .line 248
    const/high16 v21, 0x40400000    # 3.0f

    .line 249
    .line 250
    const/high16 v22, 0x40400000    # 3.0f

    .line 251
    .line 252
    const/16 v23, 0x0

    .line 253
    .line 254
    const/16 v24, 0x1

    .line 255
    .line 256
    const/16 v25, 0x1

    .line 257
    .line 258
    move-object/from16 v20, v2

    .line 259
    .line 260
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 261
    .line 262
    .line 263
    const/high16 v26, -0x3f400000    # -6.0f

    .line 264
    .line 265
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 266
    .line 267
    .line 268
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 269
    .line 270
    .line 271
    move-result-object v2

    .line 272
    const v6, 0x3e99999a    # 0.3f

    .line 273
    .line 274
    .line 275
    const/4 v7, 0x0

    .line 276
    const-string v4, ""

    .line 277
    .line 278
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 279
    .line 280
    .line 281
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 282
    .line 283
    .line 284
    move-result v3

    .line 285
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 286
    .line 287
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 288
    .line 289
    .line 290
    move-result-wide v6

    .line 291
    const/4 v0, 0x0

    .line 292
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 293
    .line 294
    .line 295
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 296
    .line 297
    .line 298
    move-result v10

    .line 299
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 300
    .line 301
    .line 302
    move-result v11

    .line 303
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 304
    .line 305
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 306
    .line 307
    .line 308
    const/high16 v0, 0x41880000    # 17.0f

    .line 309
    .line 310
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 311
    .line 312
    .line 313
    const/high16 v17, -0x3f600000    # -5.0f

    .line 314
    .line 315
    const/high16 v18, -0x3f600000    # -5.0f

    .line 316
    .line 317
    const v14, -0x3fcf5c29    # -2.76f

    .line 318
    .line 319
    .line 320
    const v15, -0x3ff0a3d7    # -2.24f

    .line 321
    .line 322
    .line 323
    const/high16 v16, -0x3f600000    # -5.0f

    .line 324
    .line 325
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 326
    .line 327
    .line 328
    const v0, 0x400f5c29    # 2.24f

    .line 329
    .line 330
    .line 331
    const/high16 v2, -0x3f600000    # -5.0f

    .line 332
    .line 333
    const/high16 v4, 0x40a00000    # 5.0f

    .line 334
    .line 335
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 336
    .line 337
    .line 338
    const/high16 v2, 0x40a00000    # 5.0f

    .line 339
    .line 340
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 341
    .line 342
    .line 343
    const v0, -0x3ff0a3d7    # -2.24f

    .line 344
    .line 345
    .line 346
    const/high16 v2, -0x3f600000    # -5.0f

    .line 347
    .line 348
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 349
    .line 350
    .line 351
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 352
    .line 353
    .line 354
    const/high16 v0, 0x41100000    # 9.0f

    .line 355
    .line 356
    const/high16 v2, 0x41880000    # 17.0f

    .line 357
    .line 358
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 359
    .line 360
    .line 361
    const/high16 v17, 0x40400000    # 3.0f

    .line 362
    .line 363
    const/high16 v18, -0x3fc00000    # -3.0f

    .line 364
    .line 365
    const v14, -0x402ccccd    # -1.65f

    .line 366
    .line 367
    .line 368
    const v15, 0x3faccccd    # 1.35f

    .line 369
    .line 370
    .line 371
    const/high16 v16, -0x3fc00000    # -3.0f

    .line 372
    .line 373
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 374
    .line 375
    .line 376
    const v0, 0x3faccccd    # 1.35f

    .line 377
    .line 378
    .line 379
    const/high16 v2, 0x40400000    # 3.0f

    .line 380
    .line 381
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 382
    .line 383
    .line 384
    const v0, -0x40533333    # -1.35f

    .line 385
    .line 386
    .line 387
    const/high16 v4, -0x3fc00000    # -3.0f

    .line 388
    .line 389
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 390
    .line 391
    .line 392
    const/high16 v2, -0x3fc00000    # -3.0f

    .line 393
    .line 394
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 395
    .line 396
    .line 397
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 398
    .line 399
    .line 400
    const/high16 v0, 0x40000000    # 2.0f

    .line 401
    .line 402
    const v2, 0x40e4cccd    # 7.15f

    .line 403
    .line 404
    .line 405
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 406
    .line 407
    .line 408
    const/high16 v0, 0x40a00000    # 5.0f

    .line 409
    .line 410
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 411
    .line 412
    .line 413
    const/high16 v17, 0x40a00000    # 5.0f

    .line 414
    .line 415
    const v18, -0x3ffae148    # -2.08f

    .line 416
    .line 417
    .line 418
    const v13, 0x3fa3d70a    # 1.28f

    .line 419
    .line 420
    .line 421
    const v14, -0x405c28f6    # -1.28f

    .line 422
    .line 423
    .line 424
    const v15, 0x40433333    # 3.05f

    .line 425
    .line 426
    .line 427
    const v16, -0x3ffae148    # -2.08f

    .line 428
    .line 429
    .line 430
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 431
    .line 432
    .line 433
    const v0, 0x3f4a3d71    # 0.79f

    .line 434
    .line 435
    .line 436
    const v2, 0x40047ae1    # 2.07f

    .line 437
    .line 438
    .line 439
    const/high16 v4, 0x40a00000    # 5.0f

    .line 440
    .line 441
    const v6, 0x406e147b    # 3.72f

    .line 442
    .line 443
    .line 444
    invoke-virtual {v12, v6, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 445
    .line 446
    .line 447
    const/high16 v0, -0x3f600000    # -5.0f

    .line 448
    .line 449
    const/high16 v2, 0x40a00000    # 5.0f

    .line 450
    .line 451
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 452
    .line 453
    .line 454
    const/high16 v17, 0x41400000    # 12.0f

    .line 455
    .line 456
    const/high16 v18, 0x40400000    # 3.0f

    .line 457
    .line 458
    const v13, 0x419b851f    # 19.44f

    .line 459
    .line 460
    .line 461
    const v14, 0x4092e148    # 4.59f

    .line 462
    .line 463
    .line 464
    const v15, 0x417e6666    # 15.9f

    .line 465
    .line 466
    .line 467
    const/high16 v16, 0x40400000    # 3.0f

    .line 468
    .line 469
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 470
    .line 471
    .line 472
    const/high16 v17, 0x40000000    # 2.0f

    .line 473
    .line 474
    const v18, 0x40e4cccd    # 7.15f

    .line 475
    .line 476
    .line 477
    const v13, 0x4101999a    # 8.1f

    .line 478
    .line 479
    .line 480
    const/high16 v14, 0x40400000    # 3.0f

    .line 481
    .line 482
    const v15, 0x4091eb85    # 4.56f

    .line 483
    .line 484
    .line 485
    const v16, 0x4092e148    # 4.59f

    .line 486
    .line 487
    .line 488
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 489
    .line 490
    .line 491
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 492
    .line 493
    .line 494
    const v0, 0x4186b852    # 16.84f

    .line 495
    .line 496
    .line 497
    const v2, 0x4117851f    # 9.47f

    .line 498
    .line 499
    .line 500
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 501
    .line 502
    .line 503
    const v17, -0x3f651eb8    # -4.84f

    .line 504
    .line 505
    .line 506
    const v18, -0x404ccccd    # -1.4f

    .line 507
    .line 508
    .line 509
    const v13, -0x4047ae14    # -1.44f

    .line 510
    .line 511
    .line 512
    const v14, -0x40970a3d    # -0.91f

    .line 513
    .line 514
    .line 515
    const v15, -0x3fb9999a    # -3.1f

    .line 516
    .line 517
    .line 518
    const v16, -0x404ccccd    # -1.4f

    .line 519
    .line 520
    .line 521
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 522
    .line 523
    .line 524
    const v17, -0x3f64cccd    # -4.85f

    .line 525
    .line 526
    .line 527
    const v18, 0x3fb47ae1    # 1.41f

    .line 528
    .line 529
    .line 530
    const v13, -0x402147ae    # -1.74f

    .line 531
    .line 532
    .line 533
    const/4 v14, 0x0

    .line 534
    const v15, -0x3fa5c28f    # -3.41f

    .line 535
    .line 536
    .line 537
    const v16, 0x3efae148    # 0.49f

    .line 538
    .line 539
    .line 540
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 541
    .line 542
    .line 543
    const v0, 0x40e851ec    # 7.26f

    .line 544
    .line 545
    .line 546
    const v2, 0x409e147b    # 4.94f

    .line 547
    .line 548
    .line 549
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 550
    .line 551
    .line 552
    const/high16 v17, 0x41400000    # 12.0f

    .line 553
    .line 554
    const/high16 v18, 0x40a00000    # 5.0f

    .line 555
    .line 556
    const v13, 0x40dfae14    # 6.99f

    .line 557
    .line 558
    .line 559
    const v14, 0x40b947ae    # 5.79f

    .line 560
    .line 561
    .line 562
    const v15, 0x41170a3d    # 9.44f

    .line 563
    .line 564
    .line 565
    const/high16 v16, 0x40a00000    # 5.0f

    .line 566
    .line 567
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 568
    .line 569
    .line 570
    const v17, 0x40e1999a    # 7.05f

    .line 571
    .line 572
    .line 573
    const v18, 0x4010a3d7    # 2.26f

    .line 574
    .line 575
    .line 576
    const v13, 0x4023d70a    # 2.56f

    .line 577
    .line 578
    .line 579
    const/4 v14, 0x0

    .line 580
    const/high16 v15, 0x40a00000    # 5.0f

    .line 581
    .line 582
    const v16, 0x3f4a3d71    # 0.79f

    .line 583
    .line 584
    .line 585
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 586
    .line 587
    .line 588
    const v0, -0x3ff28f5c    # -2.21f

    .line 589
    .line 590
    .line 591
    const v2, 0x400d70a4    # 2.21f

    .line 592
    .line 593
    .line 594
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 595
    .line 596
    .line 597
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 598
    .line 599
    .line 600
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 601
    .line 602
    .line 603
    move-result-object v2

    .line 604
    const/16 v16, 0x3800

    .line 605
    .line 606
    const/16 v17, 0x0

    .line 607
    .line 608
    const/high16 v6, 0x3f800000    # 1.0f

    .line 609
    .line 610
    const/high16 v8, 0x3f800000    # 1.0f

    .line 611
    .line 612
    const/4 v7, 0x0

    .line 613
    const/high16 v12, 0x3f800000    # 1.0f

    .line 614
    .line 615
    const/4 v13, 0x0

    .line 616
    const/4 v15, 0x0

    .line 617
    const-string v4, ""

    .line 618
    .line 619
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 620
    .line 621
    .line 622
    move-result-object v0

    .line 623
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 624
    .line 625
    .line 626
    move-result-object v0

    .line 627
    sput-object v0, Landroidx/compose/material/icons/twotone/CompassCalibrationKt;->_compassCalibration:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 628
    .line 629
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 630
    .line 631
    .line 632
    return-object v0
.end method
