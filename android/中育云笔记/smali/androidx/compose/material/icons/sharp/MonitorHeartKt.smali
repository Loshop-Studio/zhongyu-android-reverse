.class public final Landroidx/compose/material/icons/sharp/MonitorHeartKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _monitorHeart:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getMonitorHeart(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/sharp/MonitorHeartKt;->_monitorHeart:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

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
    const-string v2, "Sharp.MonitorHeart"

    .line 25
    .line 26
    const/high16 v5, 0x41c00000    # 24.0f

    .line 27
    .line 28
    const/high16 v6, 0x41c00000    # 24.0f

    .line 29
    .line 30
    const-wide/16 v7, 0x0

    .line 31
    .line 32
    const/4 v9, 0x0

    .line 33
    const/4 v10, 0x0

    .line 34
    invoke-direct/range {v1 .. v12}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;-><init>(Ljava/lang/String;FFFFJIZILkotlin/jvm/internal/n;)V

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
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

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
    new-instance v4, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 66
    .line 67
    invoke-direct {v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 68
    .line 69
    .line 70
    const v6, 0x4171c28f    # 15.11f

    .line 71
    .line 72
    .line 73
    const v7, 0x41473333    # 12.45f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v4, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const/high16 v6, 0x41600000    # 14.0f

    .line 80
    .line 81
    const v7, 0x4123d70a    # 10.24f

    .line 82
    .line 83
    .line 84
    invoke-virtual {v4, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 85
    .line 86
    .line 87
    const v6, -0x3fb8f5c3    # -3.11f

    .line 88
    .line 89
    .line 90
    const v7, 0x40c6b852    # 6.21f

    .line 91
    .line 92
    .line 93
    invoke-virtual {v4, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 94
    .line 95
    .line 96
    const/high16 v25, 0x41200000    # 10.0f

    .line 97
    .line 98
    const/high16 v26, 0x41880000    # 17.0f

    .line 99
    .line 100
    const v21, 0x412bae14    # 10.73f

    .line 101
    .line 102
    .line 103
    const v22, 0x418651ec    # 16.79f

    .line 104
    .line 105
    .line 106
    const v23, 0x4126147b    # 10.38f

    .line 107
    .line 108
    .line 109
    const/high16 v24, 0x41880000    # 17.0f

    .line 110
    .line 111
    move-object/from16 v20, v4

    .line 112
    .line 113
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 114
    .line 115
    .line 116
    const v6, -0x409c28f6    # -0.89f

    .line 117
    .line 118
    .line 119
    const v7, -0x40f33333    # -0.55f

    .line 120
    .line 121
    .line 122
    const v8, -0x40c51eb8    # -0.73f

    .line 123
    .line 124
    .line 125
    const v9, -0x41a8f5c3    # -0.21f

    .line 126
    .line 127
    .line 128
    invoke-virtual {v4, v8, v9, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 129
    .line 130
    .line 131
    const v6, 0x40ec28f6    # 7.38f

    .line 132
    .line 133
    .line 134
    const/high16 v7, 0x41500000    # 13.0f

    .line 135
    .line 136
    invoke-virtual {v4, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 137
    .line 138
    .line 139
    const/high16 v6, 0x40000000    # 2.0f

    .line 140
    .line 141
    invoke-virtual {v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 142
    .line 143
    .line 144
    const/high16 v7, 0x40e00000    # 7.0f

    .line 145
    .line 146
    invoke-virtual {v4, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 147
    .line 148
    .line 149
    const/high16 v8, 0x41a00000    # 20.0f

    .line 150
    .line 151
    invoke-virtual {v4, v8}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 152
    .line 153
    .line 154
    const/high16 v8, -0x3f200000    # -7.0f

    .line 155
    .line 156
    invoke-virtual {v4, v8}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 157
    .line 158
    .line 159
    const/high16 v8, -0x3f400000    # -6.0f

    .line 160
    .line 161
    invoke-virtual {v4, v8}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 162
    .line 163
    .line 164
    const v25, 0x4171c28f    # 15.11f

    .line 165
    .line 166
    .line 167
    const v26, 0x41473333    # 12.45f

    .line 168
    .line 169
    .line 170
    const v21, 0x4179eb85    # 15.62f

    .line 171
    .line 172
    .line 173
    const/high16 v22, 0x41500000    # 13.0f

    .line 174
    .line 175
    const v23, 0x417451ec    # 15.27f

    .line 176
    .line 177
    .line 178
    const v24, 0x414ca3d7    # 12.79f

    .line 179
    .line 180
    .line 181
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 182
    .line 183
    .line 184
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 185
    .line 186
    .line 187
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 188
    .line 189
    .line 190
    move-result-object v4

    .line 191
    const/16 v16, 0x3800

    .line 192
    .line 193
    const/16 v17, 0x0

    .line 194
    .line 195
    move-object v8, v2

    .line 196
    move-object v2, v4

    .line 197
    const-string v4, ""

    .line 198
    .line 199
    move v9, v6

    .line 200
    const/high16 v6, 0x3f800000    # 1.0f

    .line 201
    .line 202
    move v12, v7

    .line 203
    const/4 v7, 0x0

    .line 204
    move-object v13, v8

    .line 205
    const/high16 v8, 0x3f800000    # 1.0f

    .line 206
    .line 207
    move v14, v9

    .line 208
    const/high16 v9, 0x3f800000    # 1.0f

    .line 209
    .line 210
    move v15, v12

    .line 211
    const/high16 v12, 0x3f800000    # 1.0f

    .line 212
    .line 213
    move-object/from16 v20, v13

    .line 214
    .line 215
    const/4 v13, 0x0

    .line 216
    move/from16 v21, v14

    .line 217
    .line 218
    const/4 v14, 0x0

    .line 219
    move/from16 v22, v15

    .line 220
    .line 221
    const/4 v15, 0x0

    .line 222
    move-object/from16 p0, v0

    .line 223
    .line 224
    move-object/from16 v0, v20

    .line 225
    .line 226
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 227
    .line 228
    .line 229
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 230
    .line 231
    .line 232
    move-result v3

    .line 233
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 234
    .line 235
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 236
    .line 237
    .line 238
    move-result-wide v6

    .line 239
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 240
    .line 241
    .line 242
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 243
    .line 244
    .line 245
    move-result v10

    .line 246
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 247
    .line 248
    .line 249
    move-result v11

    .line 250
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 251
    .line 252
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 253
    .line 254
    .line 255
    const/high16 v0, 0x41b00000    # 22.0f

    .line 256
    .line 257
    const/high16 v2, 0x40800000    # 4.0f

    .line 258
    .line 259
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 260
    .line 261
    .line 262
    const/high16 v9, 0x40000000    # 2.0f

    .line 263
    .line 264
    invoke-virtual {v12, v9}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 265
    .line 266
    .line 267
    const/high16 v15, 0x40e00000    # 7.0f

    .line 268
    .line 269
    invoke-virtual {v12, v15}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 270
    .line 271
    .line 272
    const/high16 v4, 0x40c00000    # 6.0f

    .line 273
    .line 274
    invoke-virtual {v12, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 275
    .line 276
    .line 277
    const v17, 0x3f63d70a    # 0.89f

    .line 278
    .line 279
    .line 280
    const v18, 0x3f0ccccd    # 0.55f

    .line 281
    .line 282
    .line 283
    const v13, 0x3ec28f5c    # 0.38f

    .line 284
    .line 285
    .line 286
    const v15, 0x3f3ae148    # 0.73f

    .line 287
    .line 288
    .line 289
    const v16, 0x3e570a3d    # 0.21f

    .line 290
    .line 291
    .line 292
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 293
    .line 294
    .line 295
    const/high16 v4, 0x41200000    # 10.0f

    .line 296
    .line 297
    const v6, 0x415c28f6    # 13.76f

    .line 298
    .line 299
    .line 300
    invoke-virtual {v12, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 301
    .line 302
    .line 303
    const v4, 0x40470a3d    # 3.11f

    .line 304
    .line 305
    .line 306
    const v6, -0x3f3947ae    # -6.21f

    .line 307
    .line 308
    .line 309
    invoke-virtual {v12, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 310
    .line 311
    .line 312
    const v17, 0x3fe51eb8    # 1.79f

    .line 313
    .line 314
    .line 315
    const/16 v18, 0x0

    .line 316
    .line 317
    const v13, 0x3ebd70a4    # 0.37f

    .line 318
    .line 319
    .line 320
    const v14, -0x40c28f5c    # -0.74f

    .line 321
    .line 322
    .line 323
    const v15, 0x3fb5c28f    # 1.42f

    .line 324
    .line 325
    .line 326
    const v16, -0x40c28f5c    # -0.74f

    .line 327
    .line 328
    .line 329
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 330
    .line 331
    .line 332
    const v4, 0x4184f5c3    # 16.62f

    .line 333
    .line 334
    .line 335
    const/high16 v6, 0x41300000    # 11.0f

    .line 336
    .line 337
    invoke-virtual {v12, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 338
    .line 339
    .line 340
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 341
    .line 342
    .line 343
    invoke-virtual {v12, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 344
    .line 345
    .line 346
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 347
    .line 348
    .line 349
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 350
    .line 351
    .line 352
    move-result-object v2

    .line 353
    const/16 v16, 0x3800

    .line 354
    .line 355
    const/16 v17, 0x0

    .line 356
    .line 357
    const-string v4, ""

    .line 358
    .line 359
    const/high16 v6, 0x3f800000    # 1.0f

    .line 360
    .line 361
    const/4 v7, 0x0

    .line 362
    const/high16 v9, 0x3f800000    # 1.0f

    .line 363
    .line 364
    const/high16 v12, 0x3f800000    # 1.0f

    .line 365
    .line 366
    const/4 v13, 0x0

    .line 367
    const/4 v14, 0x0

    .line 368
    const/4 v15, 0x0

    .line 369
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 370
    .line 371
    .line 372
    move-result-object v0

    .line 373
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 374
    .line 375
    .line 376
    move-result-object v0

    .line 377
    sput-object v0, Landroidx/compose/material/icons/sharp/MonitorHeartKt;->_monitorHeart:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 378
    .line 379
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 380
    .line 381
    .line 382
    return-object v0
.end method
