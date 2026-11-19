.class public final Landroidx/compose/material/icons/rounded/MonitorWeightKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_monitorWeight",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "MonitorWeight",
        "Landroidx/compose/material/icons/Icons$Rounded;",
        "getMonitorWeight",
        "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;",
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
        "SMAP\nMonitorWeight.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MonitorWeight.kt\nandroidx/compose/material/icons/rounded/MonitorWeightKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,71:1\n212#2,12:72\n233#2,18:85\n253#2:122\n233#2,18:123\n253#2:160\n233#2,18:161\n253#2:198\n233#2,18:199\n253#2:236\n174#3:84\n705#4,2:103\n717#4,2:105\n719#4,11:111\n705#4,2:141\n717#4,2:143\n719#4,11:149\n705#4,2:179\n717#4,2:181\n719#4,11:187\n705#4,2:217\n717#4,2:219\n719#4,11:225\n72#5,4:107\n72#5,4:145\n72#5,4:183\n72#5,4:221\n*S KotlinDebug\n*F\n+ 1 MonitorWeight.kt\nandroidx/compose/material/icons/rounded/MonitorWeightKt\n*L\n29#1:72,12\n30#1:85,18\n30#1:122\n48#1:123,18\n48#1:160\n54#1:161,18\n54#1:198\n60#1:199,18\n60#1:236\n29#1:84\n30#1:103,2\n30#1:105,2\n30#1:111,11\n48#1:141,2\n48#1:143,2\n48#1:149,11\n54#1:179,2\n54#1:181,2\n54#1:187,11\n60#1:217,2\n60#1:219,2\n60#1:225,11\n30#1:107,4\n48#1:145,4\n54#1:183,4\n60#1:221,4\n*E\n"
    }
.end annotation


# static fields
.field private static _monitorWeight:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getMonitorWeight(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 28

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/MonitorWeightKt;->_monitorWeight:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.MonitorWeight"

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
    const/high16 v4, 0x41980000    # 19.0f

    .line 71
    .line 72
    const/high16 v6, 0x40400000    # 3.0f

    .line 73
    .line 74
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v4, 0x40a00000    # 5.0f

    .line 78
    .line 79
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 80
    .line 81
    .line 82
    const/high16 v25, 0x40400000    # 3.0f

    .line 83
    .line 84
    const/high16 v26, 0x40a00000    # 5.0f

    .line 85
    .line 86
    const v21, 0x4079999a    # 3.9f

    .line 87
    .line 88
    .line 89
    const/high16 v22, 0x40400000    # 3.0f

    .line 90
    .line 91
    const/high16 v23, 0x40400000    # 3.0f

    .line 92
    .line 93
    const v24, 0x4079999a    # 3.9f

    .line 94
    .line 95
    .line 96
    move-object/from16 v20, v2

    .line 97
    .line 98
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 99
    .line 100
    .line 101
    const/high16 v4, 0x41600000    # 14.0f

    .line 102
    .line 103
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 104
    .line 105
    .line 106
    const/high16 v25, 0x40000000    # 2.0f

    .line 107
    .line 108
    const/high16 v26, 0x40000000    # 2.0f

    .line 109
    .line 110
    const/16 v21, 0x0

    .line 111
    .line 112
    const v22, 0x3f8ccccd    # 1.1f

    .line 113
    .line 114
    .line 115
    const v23, 0x3f666666    # 0.9f

    .line 116
    .line 117
    .line 118
    const/high16 v24, 0x40000000    # 2.0f

    .line 119
    .line 120
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 121
    .line 122
    .line 123
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 124
    .line 125
    .line 126
    const/high16 v26, -0x40000000    # -2.0f

    .line 127
    .line 128
    const v21, 0x3f8ccccd    # 1.1f

    .line 129
    .line 130
    .line 131
    const/16 v22, 0x0

    .line 132
    .line 133
    const/high16 v23, 0x40000000    # 2.0f

    .line 134
    .line 135
    const v24, -0x4099999a    # -0.9f

    .line 136
    .line 137
    .line 138
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 139
    .line 140
    .line 141
    const/high16 v4, 0x40a00000    # 5.0f

    .line 142
    .line 143
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 144
    .line 145
    .line 146
    const/high16 v25, 0x41980000    # 19.0f

    .line 147
    .line 148
    const/high16 v26, 0x40400000    # 3.0f

    .line 149
    .line 150
    const/high16 v21, 0x41a80000    # 21.0f

    .line 151
    .line 152
    const v22, 0x4079999a    # 3.9f

    .line 153
    .line 154
    .line 155
    const v23, 0x41a0cccd    # 20.1f

    .line 156
    .line 157
    .line 158
    const/high16 v24, 0x40400000    # 3.0f

    .line 159
    .line 160
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 161
    .line 162
    .line 163
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 164
    .line 165
    .line 166
    const/high16 v4, 0x41400000    # 12.0f

    .line 167
    .line 168
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 169
    .line 170
    .line 171
    const/high16 v25, -0x3fc00000    # -3.0f

    .line 172
    .line 173
    const/high16 v26, -0x3fc00000    # -3.0f

    .line 174
    .line 175
    const v21, -0x402b851f    # -1.66f

    .line 176
    .line 177
    .line 178
    const/16 v22, 0x0

    .line 179
    .line 180
    const/high16 v23, -0x3fc00000    # -3.0f

    .line 181
    .line 182
    const v24, -0x40547ae1    # -1.34f

    .line 183
    .line 184
    .line 185
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 186
    .line 187
    .line 188
    const/high16 v4, -0x3fc00000    # -3.0f

    .line 189
    .line 190
    const v6, 0x3fab851f    # 1.34f

    .line 191
    .line 192
    .line 193
    const/high16 v7, 0x40400000    # 3.0f

    .line 194
    .line 195
    invoke-virtual {v2, v6, v4, v7, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 196
    .line 197
    .line 198
    const v4, 0x3fab851f    # 1.34f

    .line 199
    .line 200
    .line 201
    const/high16 v6, 0x40400000    # 3.0f

    .line 202
    .line 203
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 204
    .line 205
    .line 206
    const v4, 0x415a8f5c    # 13.66f

    .line 207
    .line 208
    .line 209
    const/high16 v6, 0x41400000    # 12.0f

    .line 210
    .line 211
    invoke-virtual {v2, v4, v6, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 212
    .line 213
    .line 214
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 215
    .line 216
    .line 217
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 218
    .line 219
    .line 220
    move-result-object v2

    .line 221
    const/16 v16, 0x3800

    .line 222
    .line 223
    const/16 v17, 0x0

    .line 224
    .line 225
    const/high16 v6, 0x3f800000    # 1.0f

    .line 226
    .line 227
    const/high16 v8, 0x3f800000    # 1.0f

    .line 228
    .line 229
    const/4 v7, 0x0

    .line 230
    const/high16 v9, 0x3f800000    # 1.0f

    .line 231
    .line 232
    const/high16 v12, 0x3f800000    # 1.0f

    .line 233
    .line 234
    const/4 v13, 0x0

    .line 235
    const/4 v14, 0x0

    .line 236
    const/4 v15, 0x0

    .line 237
    const-string v4, ""

    .line 238
    .line 239
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 240
    .line 241
    .line 242
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 243
    .line 244
    .line 245
    move-result v3

    .line 246
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 247
    .line 248
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 249
    .line 250
    .line 251
    move-result-wide v6

    .line 252
    const/4 v2, 0x0

    .line 253
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 254
    .line 255
    .line 256
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 257
    .line 258
    .line 259
    move-result v10

    .line 260
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 261
    .line 262
    .line 263
    move-result v11

    .line 264
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 265
    .line 266
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 267
    .line 268
    .line 269
    const/high16 v4, 0x41280000    # 10.5f

    .line 270
    .line 271
    const/high16 v6, 0x41100000    # 9.0f

    .line 272
    .line 273
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 274
    .line 275
    .line 276
    const/4 v4, 0x0

    .line 277
    const/high16 v6, -0x41000000    # -0.5f

    .line 278
    .line 279
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 280
    .line 281
    .line 282
    const/high16 v26, 0x3f800000    # 1.0f

    .line 283
    .line 284
    const/16 v27, 0x0

    .line 285
    .line 286
    const/high16 v21, 0x3f000000    # 0.5f

    .line 287
    .line 288
    const/high16 v22, 0x3f000000    # 0.5f

    .line 289
    .line 290
    const/16 v23, 0x0

    .line 291
    .line 292
    const/16 v24, 0x1

    .line 293
    .line 294
    const/16 v25, 0x1

    .line 295
    .line 296
    move-object/from16 v20, v2

    .line 297
    .line 298
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 299
    .line 300
    .line 301
    const/high16 v26, -0x40800000    # -1.0f

    .line 302
    .line 303
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 304
    .line 305
    .line 306
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 307
    .line 308
    .line 309
    move-result-object v2

    .line 310
    const/high16 v6, 0x3f800000    # 1.0f

    .line 311
    .line 312
    const/4 v7, 0x0

    .line 313
    const-string v4, ""

    .line 314
    .line 315
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 316
    .line 317
    .line 318
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 319
    .line 320
    .line 321
    move-result v3

    .line 322
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 323
    .line 324
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 325
    .line 326
    .line 327
    move-result-wide v6

    .line 328
    const/4 v2, 0x0

    .line 329
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 330
    .line 331
    .line 332
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 333
    .line 334
    .line 335
    move-result v10

    .line 336
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 337
    .line 338
    .line 339
    move-result v11

    .line 340
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 341
    .line 342
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 343
    .line 344
    .line 345
    const/high16 v4, 0x41580000    # 13.5f

    .line 346
    .line 347
    const/high16 v6, 0x41100000    # 9.0f

    .line 348
    .line 349
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 350
    .line 351
    .line 352
    const/4 v4, 0x0

    .line 353
    const/high16 v6, -0x41000000    # -0.5f

    .line 354
    .line 355
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 356
    .line 357
    .line 358
    const/high16 v26, 0x3f800000    # 1.0f

    .line 359
    .line 360
    move-object/from16 v20, v2

    .line 361
    .line 362
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 363
    .line 364
    .line 365
    const/high16 v26, -0x40800000    # -1.0f

    .line 366
    .line 367
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 368
    .line 369
    .line 370
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 371
    .line 372
    .line 373
    move-result-object v2

    .line 374
    const/high16 v6, 0x3f800000    # 1.0f

    .line 375
    .line 376
    const/4 v7, 0x0

    .line 377
    const-string v4, ""

    .line 378
    .line 379
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 380
    .line 381
    .line 382
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 383
    .line 384
    .line 385
    move-result v3

    .line 386
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 387
    .line 388
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 389
    .line 390
    .line 391
    move-result-wide v6

    .line 392
    const/4 v0, 0x0

    .line 393
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 394
    .line 395
    .line 396
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 397
    .line 398
    .line 399
    move-result v10

    .line 400
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 401
    .line 402
    .line 403
    move-result v11

    .line 404
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 405
    .line 406
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 407
    .line 408
    .line 409
    const/high16 v0, 0x41100000    # 9.0f

    .line 410
    .line 411
    const/high16 v2, 0x41400000    # 12.0f

    .line 412
    .line 413
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 414
    .line 415
    .line 416
    const/4 v0, 0x0

    .line 417
    const/high16 v2, -0x41000000    # -0.5f

    .line 418
    .line 419
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 420
    .line 421
    .line 422
    const/high16 v18, 0x3f800000    # 1.0f

    .line 423
    .line 424
    const/16 v19, 0x0

    .line 425
    .line 426
    const/high16 v13, 0x3f000000    # 0.5f

    .line 427
    .line 428
    const/high16 v14, 0x3f000000    # 0.5f

    .line 429
    .line 430
    const/16 v16, 0x1

    .line 431
    .line 432
    const/16 v17, 0x1

    .line 433
    .line 434
    invoke-virtual/range {v12 .. v19}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 435
    .line 436
    .line 437
    const/high16 v18, -0x40800000    # -1.0f

    .line 438
    .line 439
    invoke-virtual/range {v12 .. v19}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 440
    .line 441
    .line 442
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 443
    .line 444
    .line 445
    move-result-object v2

    .line 446
    const/16 v16, 0x3800

    .line 447
    .line 448
    const/16 v17, 0x0

    .line 449
    .line 450
    const/high16 v6, 0x3f800000    # 1.0f

    .line 451
    .line 452
    const/4 v7, 0x0

    .line 453
    const/high16 v12, 0x3f800000    # 1.0f

    .line 454
    .line 455
    const/4 v13, 0x0

    .line 456
    const/4 v14, 0x0

    .line 457
    const-string v4, ""

    .line 458
    .line 459
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 460
    .line 461
    .line 462
    move-result-object v0

    .line 463
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 464
    .line 465
    .line 466
    move-result-object v0

    .line 467
    sput-object v0, Landroidx/compose/material/icons/rounded/MonitorWeightKt;->_monitorWeight:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 468
    .line 469
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 470
    .line 471
    .line 472
    return-object v0
.end method
