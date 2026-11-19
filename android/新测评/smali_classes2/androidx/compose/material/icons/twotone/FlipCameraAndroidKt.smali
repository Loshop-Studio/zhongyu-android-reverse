.class public final Landroidx/compose/material/icons/twotone/FlipCameraAndroidKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_flipCameraAndroid",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "FlipCameraAndroid",
        "Landroidx/compose/material/icons/Icons$TwoTone;",
        "getFlipCameraAndroid",
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
        "SMAP\nFlipCameraAndroid.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlipCameraAndroid.kt\nandroidx/compose/material/icons/twotone/FlipCameraAndroidKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,85:1\n212#2,12:86\n233#2,18:99\n253#2:136\n233#2,18:137\n253#2:174\n233#2,18:175\n253#2:212\n233#2,18:213\n253#2:250\n174#3:98\n705#4,2:117\n717#4,2:119\n719#4,11:125\n705#4,2:155\n717#4,2:157\n719#4,11:163\n705#4,2:193\n717#4,2:195\n719#4,11:201\n705#4,2:231\n717#4,2:233\n719#4,11:239\n72#5,4:121\n72#5,4:159\n72#5,4:197\n72#5,4:235\n*S KotlinDebug\n*F\n+ 1 FlipCameraAndroid.kt\nandroidx/compose/material/icons/twotone/FlipCameraAndroidKt\n*L\n29#1:86,12\n30#1:99,18\n30#1:136\n36#1:137,18\n36#1:174\n50#1:175,18\n50#1:212\n65#1:213,18\n65#1:250\n29#1:98\n30#1:117,2\n30#1:119,2\n30#1:125,11\n36#1:155,2\n36#1:157,2\n36#1:163,11\n50#1:193,2\n50#1:195,2\n50#1:201,11\n65#1:231,2\n65#1:233,2\n65#1:239,11\n30#1:121,4\n36#1:159,4\n50#1:197,4\n65#1:235,4\n*E\n"
    }
.end annotation


# static fields
.field private static _flipCameraAndroid:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getFlipCameraAndroid(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 28

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/FlipCameraAndroidKt;->_flipCameraAndroid:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.FlipCameraAndroid"

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
    const/high16 v4, 0x41400000    # 12.0f

    .line 71
    .line 72
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 73
    .line 74
    .line 75
    const/4 v4, 0x0

    .line 76
    const/high16 v6, -0x40800000    # -1.0f

    .line 77
    .line 78
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 79
    .line 80
    .line 81
    const/high16 v26, 0x40000000    # 2.0f

    .line 82
    .line 83
    const/16 v27, 0x0

    .line 84
    .line 85
    const/high16 v21, 0x3f800000    # 1.0f

    .line 86
    .line 87
    const/high16 v22, 0x3f800000    # 1.0f

    .line 88
    .line 89
    const/16 v23, 0x0

    .line 90
    .line 91
    const/16 v24, 0x1

    .line 92
    .line 93
    const/16 v25, 0x1

    .line 94
    .line 95
    move-object/from16 v20, v2

    .line 96
    .line 97
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 98
    .line 99
    .line 100
    const/high16 v26, -0x40000000    # -2.0f

    .line 101
    .line 102
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 103
    .line 104
    .line 105
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 106
    .line 107
    .line 108
    move-result-object v2

    .line 109
    const/16 v16, 0x3800

    .line 110
    .line 111
    const/16 v17, 0x0

    .line 112
    .line 113
    const v6, 0x3e99999a    # 0.3f

    .line 114
    .line 115
    .line 116
    const v8, 0x3e99999a    # 0.3f

    .line 117
    .line 118
    .line 119
    const/4 v7, 0x0

    .line 120
    const/high16 v9, 0x3f800000    # 1.0f

    .line 121
    .line 122
    const/high16 v12, 0x3f800000    # 1.0f

    .line 123
    .line 124
    const/4 v13, 0x0

    .line 125
    const/4 v14, 0x0

    .line 126
    const/4 v15, 0x0

    .line 127
    const-string v4, ""

    .line 128
    .line 129
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 130
    .line 131
    .line 132
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 133
    .line 134
    .line 135
    move-result v3

    .line 136
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 137
    .line 138
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 139
    .line 140
    .line 141
    move-result-wide v6

    .line 142
    const/4 v2, 0x0

    .line 143
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 144
    .line 145
    .line 146
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 147
    .line 148
    .line 149
    move-result v10

    .line 150
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 151
    .line 152
    .line 153
    move-result v11

    .line 154
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 155
    .line 156
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 157
    .line 158
    .line 159
    const/high16 v4, 0x41100000    # 9.0f

    .line 160
    .line 161
    const/high16 v6, 0x41400000    # 12.0f

    .line 162
    .line 163
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 164
    .line 165
    .line 166
    const/high16 v25, 0x40400000    # 3.0f

    .line 167
    .line 168
    const/high16 v26, 0x40400000    # 3.0f

    .line 169
    .line 170
    const/16 v21, 0x0

    .line 171
    .line 172
    const v22, 0x3fd47ae1    # 1.66f

    .line 173
    .line 174
    .line 175
    const v23, 0x3fab851f    # 1.34f

    .line 176
    .line 177
    .line 178
    const/high16 v24, 0x40400000    # 3.0f

    .line 179
    .line 180
    move-object/from16 v20, v2

    .line 181
    .line 182
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 183
    .line 184
    .line 185
    const v4, -0x40547ae1    # -1.34f

    .line 186
    .line 187
    .line 188
    const/high16 v6, 0x40400000    # 3.0f

    .line 189
    .line 190
    const/high16 v7, -0x3fc00000    # -3.0f

    .line 191
    .line 192
    invoke-virtual {v2, v6, v4, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 193
    .line 194
    .line 195
    const/high16 v6, -0x3fc00000    # -3.0f

    .line 196
    .line 197
    invoke-virtual {v2, v4, v6, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 198
    .line 199
    .line 200
    const v4, 0x412570a4    # 10.34f

    .line 201
    .line 202
    .line 203
    const/high16 v6, 0x41100000    # 9.0f

    .line 204
    .line 205
    const/high16 v7, 0x41400000    # 12.0f

    .line 206
    .line 207
    invoke-virtual {v2, v6, v4, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 208
    .line 209
    .line 210
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 211
    .line 212
    .line 213
    const/high16 v4, 0x41500000    # 13.0f

    .line 214
    .line 215
    const/high16 v6, 0x41400000    # 12.0f

    .line 216
    .line 217
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 218
    .line 219
    .line 220
    const/high16 v25, -0x40800000    # -1.0f

    .line 221
    .line 222
    const/high16 v26, 0x3f800000    # 1.0f

    .line 223
    .line 224
    const v22, 0x3f0ccccd    # 0.55f

    .line 225
    .line 226
    .line 227
    const v23, -0x4119999a    # -0.45f

    .line 228
    .line 229
    .line 230
    const/high16 v24, 0x3f800000    # 1.0f

    .line 231
    .line 232
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 233
    .line 234
    .line 235
    const v4, -0x4119999a    # -0.45f

    .line 236
    .line 237
    .line 238
    const/high16 v6, -0x40800000    # -1.0f

    .line 239
    .line 240
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 241
    .line 242
    .line 243
    const v4, 0x3ee66666    # 0.45f

    .line 244
    .line 245
    .line 246
    const/high16 v6, 0x3f800000    # 1.0f

    .line 247
    .line 248
    const/high16 v7, -0x40800000    # -1.0f

    .line 249
    .line 250
    invoke-virtual {v2, v4, v7, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 251
    .line 252
    .line 253
    const v4, 0x41373333    # 11.45f

    .line 254
    .line 255
    .line 256
    const/high16 v6, 0x41500000    # 13.0f

    .line 257
    .line 258
    const/high16 v7, 0x41400000    # 12.0f

    .line 259
    .line 260
    invoke-virtual {v2, v6, v4, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 261
    .line 262
    .line 263
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 264
    .line 265
    .line 266
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 267
    .line 268
    .line 269
    move-result-object v2

    .line 270
    const/high16 v6, 0x3f800000    # 1.0f

    .line 271
    .line 272
    const/high16 v8, 0x3f800000    # 1.0f

    .line 273
    .line 274
    const/4 v7, 0x0

    .line 275
    const-string v4, ""

    .line 276
    .line 277
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 278
    .line 279
    .line 280
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 281
    .line 282
    .line 283
    move-result v3

    .line 284
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 285
    .line 286
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 287
    .line 288
    .line 289
    move-result-wide v6

    .line 290
    const/4 v2, 0x0

    .line 291
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 292
    .line 293
    .line 294
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 295
    .line 296
    .line 297
    move-result v10

    .line 298
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 299
    .line 300
    .line 301
    move-result v11

    .line 302
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 303
    .line 304
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 305
    .line 306
    .line 307
    const/high16 v4, 0x41000000    # 8.0f

    .line 308
    .line 309
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 310
    .line 311
    .line 312
    const v4, 0x40a2e148    # 5.09f

    .line 313
    .line 314
    .line 315
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 316
    .line 317
    .line 318
    const/high16 v25, 0x41400000    # 12.0f

    .line 319
    .line 320
    const/high16 v26, 0x40800000    # 4.0f

    .line 321
    .line 322
    const v21, 0x40cf0a3d    # 6.47f

    .line 323
    .line 324
    .line 325
    const v22, 0x40b3851f    # 5.61f

    .line 326
    .line 327
    .line 328
    const v23, 0x4110cccd    # 9.05f

    .line 329
    .line 330
    .line 331
    const/high16 v24, 0x40800000    # 4.0f

    .line 332
    .line 333
    move-object/from16 v20, v2

    .line 334
    .line 335
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 336
    .line 337
    .line 338
    const v25, 0x40f7ae14    # 7.74f

    .line 339
    .line 340
    .line 341
    const/high16 v26, 0x40c00000    # 6.0f

    .line 342
    .line 343
    const v21, 0x406e147b    # 3.72f

    .line 344
    .line 345
    .line 346
    const/16 v22, 0x0

    .line 347
    .line 348
    const v23, 0x40db3333    # 6.85f

    .line 349
    .line 350
    .line 351
    const v24, 0x4023d70a    # 2.56f

    .line 352
    .line 353
    .line 354
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 355
    .line 356
    .line 357
    const v4, 0x4003d70a    # 2.06f

    .line 358
    .line 359
    .line 360
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 361
    .line 362
    .line 363
    const v25, -0x3ee33333    # -9.8f

    .line 364
    .line 365
    .line 366
    const/high16 v26, -0x3f000000    # -8.0f

    .line 367
    .line 368
    const v21, -0x4091eb85    # -0.93f

    .line 369
    .line 370
    .line 371
    const v22, -0x3f6e147b    # -4.56f

    .line 372
    .line 373
    .line 374
    const v23, -0x3f6147ae    # -4.96f

    .line 375
    .line 376
    .line 377
    const/high16 v24, -0x3f000000    # -8.0f

    .line 378
    .line 379
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 380
    .line 381
    .line 382
    const/high16 v25, 0x40800000    # 4.0f

    .line 383
    .line 384
    const v26, 0x40c051ec    # 6.01f

    .line 385
    .line 386
    .line 387
    const v21, 0x410bae14    # 8.73f

    .line 388
    .line 389
    .line 390
    const/high16 v22, 0x40000000    # 2.0f

    .line 391
    .line 392
    const v23, 0x40ba3d71    # 5.82f

    .line 393
    .line 394
    .line 395
    const v24, 0x40651eb8    # 3.58f

    .line 396
    .line 397
    .line 398
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 399
    .line 400
    .line 401
    const/high16 v4, 0x40800000    # 4.0f

    .line 402
    .line 403
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 404
    .line 405
    .line 406
    const/high16 v4, 0x40000000    # 2.0f

    .line 407
    .line 408
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 409
    .line 410
    .line 411
    const/high16 v4, 0x40c00000    # 6.0f

    .line 412
    .line 413
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 414
    .line 415
    .line 416
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 417
    .line 418
    .line 419
    const/high16 v4, 0x41000000    # 8.0f

    .line 420
    .line 421
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

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
    const/4 v7, 0x0

    .line 434
    const-string v4, ""

    .line 435
    .line 436
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 437
    .line 438
    .line 439
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 440
    .line 441
    .line 442
    move-result v3

    .line 443
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 444
    .line 445
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 446
    .line 447
    .line 448
    move-result-wide v6

    .line 449
    const/4 v0, 0x0

    .line 450
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 451
    .line 452
    .line 453
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 454
    .line 455
    .line 456
    move-result v10

    .line 457
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 458
    .line 459
    .line 460
    move-result v11

    .line 461
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 462
    .line 463
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 464
    .line 465
    .line 466
    const/high16 v0, 0x41600000    # 14.0f

    .line 467
    .line 468
    const/high16 v2, 0x41800000    # 16.0f

    .line 469
    .line 470
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 471
    .line 472
    .line 473
    const/high16 v0, 0x40000000    # 2.0f

    .line 474
    .line 475
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 476
    .line 477
    .line 478
    const v0, 0x403a3d71    # 2.91f

    .line 479
    .line 480
    .line 481
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 482
    .line 483
    .line 484
    const v17, -0x3f22e148    # -6.91f

    .line 485
    .line 486
    .line 487
    const/high16 v18, 0x40800000    # 4.0f

    .line 488
    .line 489
    const v13, -0x404f5c29    # -1.38f

    .line 490
    .line 491
    .line 492
    const v14, 0x4018f5c3    # 2.39f

    .line 493
    .line 494
    .line 495
    const v15, -0x3f828f5c    # -3.96f

    .line 496
    .line 497
    .line 498
    const/high16 v16, 0x40800000    # 4.0f

    .line 499
    .line 500
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 501
    .line 502
    .line 503
    const v17, -0x3f0851ec    # -7.74f

    .line 504
    .line 505
    .line 506
    const/high16 v18, -0x3f400000    # -6.0f

    .line 507
    .line 508
    const v13, -0x3f91eb85    # -3.72f

    .line 509
    .line 510
    .line 511
    const/4 v14, 0x0

    .line 512
    const v15, -0x3f24cccd    # -6.85f

    .line 513
    .line 514
    .line 515
    const v16, -0x3fdc28f6    # -2.56f

    .line 516
    .line 517
    .line 518
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 519
    .line 520
    .line 521
    const v0, 0x400ccccd    # 2.2f

    .line 522
    .line 523
    .line 524
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 525
    .line 526
    .line 527
    const v17, 0x411ccccd    # 9.8f

    .line 528
    .line 529
    .line 530
    const/high16 v18, 0x41000000    # 8.0f

    .line 531
    .line 532
    const v13, 0x3f6e147b    # 0.93f

    .line 533
    .line 534
    .line 535
    const v14, 0x4091eb85    # 4.56f

    .line 536
    .line 537
    .line 538
    const v15, 0x409eb852    # 4.96f

    .line 539
    .line 540
    .line 541
    const/high16 v16, 0x41000000    # 8.0f

    .line 542
    .line 543
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 544
    .line 545
    .line 546
    const/high16 v17, 0x41000000    # 8.0f

    .line 547
    .line 548
    const v18, -0x3f7fae14    # -4.01f

    .line 549
    .line 550
    .line 551
    const v13, 0x405147ae    # 3.27f

    .line 552
    .line 553
    .line 554
    const/4 v14, 0x0

    .line 555
    const v15, 0x40c5c28f    # 6.18f

    .line 556
    .line 557
    .line 558
    const v16, -0x4035c28f    # -1.58f

    .line 559
    .line 560
    .line 561
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 562
    .line 563
    .line 564
    const/high16 v0, 0x41a00000    # 20.0f

    .line 565
    .line 566
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 567
    .line 568
    .line 569
    const/high16 v0, 0x40000000    # 2.0f

    .line 570
    .line 571
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 572
    .line 573
    .line 574
    const/high16 v0, -0x3f400000    # -6.0f

    .line 575
    .line 576
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 577
    .line 578
    .line 579
    const/high16 v0, 0x41800000    # 16.0f

    .line 580
    .line 581
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 582
    .line 583
    .line 584
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 585
    .line 586
    .line 587
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 588
    .line 589
    .line 590
    move-result-object v2

    .line 591
    const/16 v16, 0x3800

    .line 592
    .line 593
    const/16 v17, 0x0

    .line 594
    .line 595
    const/high16 v6, 0x3f800000    # 1.0f

    .line 596
    .line 597
    const/4 v7, 0x0

    .line 598
    const/high16 v12, 0x3f800000    # 1.0f

    .line 599
    .line 600
    const/4 v13, 0x0

    .line 601
    const/4 v15, 0x0

    .line 602
    const-string v4, ""

    .line 603
    .line 604
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 605
    .line 606
    .line 607
    move-result-object v0

    .line 608
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 609
    .line 610
    .line 611
    move-result-object v0

    .line 612
    sput-object v0, Landroidx/compose/material/icons/twotone/FlipCameraAndroidKt;->_flipCameraAndroid:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 613
    .line 614
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 615
    .line 616
    .line 617
    return-object v0
.end method
