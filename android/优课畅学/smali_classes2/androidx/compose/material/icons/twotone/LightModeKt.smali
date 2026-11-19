.class public final Landroidx/compose/material/icons/twotone/LightModeKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _lightMode:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getLightMode(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 28

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/LightModeKt;->_lightMode:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.LightMode"

    .line 33
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
    const/high16 v4, -0x3fc00000    # -3.0f

    .line 76
    .line 77
    const/4 v6, 0x0

    .line 78
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 79
    .line 80
    .line 81
    const/high16 v26, 0x40c00000    # 6.0f

    .line 82
    .line 83
    const/16 v27, 0x0

    .line 84
    .line 85
    const/high16 v21, 0x40400000    # 3.0f

    .line 86
    .line 87
    const/high16 v22, 0x40400000    # 3.0f

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
    const/high16 v26, -0x3f400000    # -6.0f

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
    const/4 v0, 0x0

    .line 143
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

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
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 155
    .line 156
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 157
    .line 158
    .line 159
    const/high16 v0, 0x41100000    # 9.0f

    .line 160
    .line 161
    const/high16 v2, 0x41400000    # 12.0f

    .line 162
    .line 163
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 164
    .line 165
    .line 166
    const/high16 v17, 0x40400000    # 3.0f

    .line 167
    .line 168
    const/high16 v18, 0x40400000    # 3.0f

    .line 169
    .line 170
    const v13, 0x3fd33333    # 1.65f

    .line 171
    .line 172
    .line 173
    const/high16 v15, 0x40400000    # 3.0f

    .line 174
    .line 175
    const v16, 0x3faccccd    # 1.35f

    .line 176
    .line 177
    .line 178
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 179
    .line 180
    .line 181
    const/high16 v0, 0x40400000    # 3.0f

    .line 182
    .line 183
    const v2, -0x40533333    # -1.35f

    .line 184
    .line 185
    .line 186
    const/high16 v4, -0x3fc00000    # -3.0f

    .line 187
    .line 188
    invoke-virtual {v12, v2, v0, v4, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 189
    .line 190
    .line 191
    const v0, -0x40533333    # -1.35f

    .line 192
    .line 193
    .line 194
    const/high16 v2, -0x3fc00000    # -3.0f

    .line 195
    .line 196
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 197
    .line 198
    .line 199
    const v0, 0x4125999a    # 10.35f

    .line 200
    .line 201
    .line 202
    const/high16 v2, 0x41100000    # 9.0f

    .line 203
    .line 204
    const/high16 v4, 0x41400000    # 12.0f

    .line 205
    .line 206
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 207
    .line 208
    .line 209
    const/high16 v0, 0x40e00000    # 7.0f

    .line 210
    .line 211
    const/high16 v2, 0x41400000    # 12.0f

    .line 212
    .line 213
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 214
    .line 215
    .line 216
    const/high16 v17, -0x3f600000    # -5.0f

    .line 217
    .line 218
    const/high16 v18, 0x40a00000    # 5.0f

    .line 219
    .line 220
    const v13, -0x3fcf5c29    # -2.76f

    .line 221
    .line 222
    .line 223
    const/high16 v15, -0x3f600000    # -5.0f

    .line 224
    .line 225
    const v16, 0x400f5c29    # 2.24f

    .line 226
    .line 227
    .line 228
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 229
    .line 230
    .line 231
    const v0, 0x400f5c29    # 2.24f

    .line 232
    .line 233
    .line 234
    const/high16 v2, 0x40a00000    # 5.0f

    .line 235
    .line 236
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 237
    .line 238
    .line 239
    const v0, -0x3ff0a3d7    # -2.24f

    .line 240
    .line 241
    .line 242
    const/high16 v2, -0x3f600000    # -5.0f

    .line 243
    .line 244
    const/high16 v4, 0x40a00000    # 5.0f

    .line 245
    .line 246
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 247
    .line 248
    .line 249
    const v0, 0x416c28f6    # 14.76f

    .line 250
    .line 251
    .line 252
    const/high16 v2, 0x40e00000    # 7.0f

    .line 253
    .line 254
    const/high16 v4, 0x41400000    # 12.0f

    .line 255
    .line 256
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 257
    .line 258
    .line 259
    const/high16 v0, 0x40e00000    # 7.0f

    .line 260
    .line 261
    const/high16 v2, 0x41400000    # 12.0f

    .line 262
    .line 263
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 264
    .line 265
    .line 266
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 267
    .line 268
    .line 269
    const/high16 v0, 0x41500000    # 13.0f

    .line 270
    .line 271
    const/high16 v2, 0x40000000    # 2.0f

    .line 272
    .line 273
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 274
    .line 275
    .line 276
    const/4 v0, 0x0

    .line 277
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 278
    .line 279
    .line 280
    const/high16 v17, 0x3f800000    # 1.0f

    .line 281
    .line 282
    const/high16 v18, -0x40800000    # -1.0f

    .line 283
    .line 284
    const v13, 0x3f0ccccd    # 0.55f

    .line 285
    .line 286
    .line 287
    const/high16 v15, 0x3f800000    # 1.0f

    .line 288
    .line 289
    const v16, -0x4119999a    # -0.45f

    .line 290
    .line 291
    .line 292
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 293
    .line 294
    .line 295
    const v0, -0x4119999a    # -0.45f

    .line 296
    .line 297
    .line 298
    const/high16 v2, -0x40800000    # -1.0f

    .line 299
    .line 300
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 301
    .line 302
    .line 303
    const/high16 v0, -0x40000000    # -2.0f

    .line 304
    .line 305
    const/4 v2, 0x0

    .line 306
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 307
    .line 308
    .line 309
    const/high16 v17, -0x40800000    # -1.0f

    .line 310
    .line 311
    const/high16 v18, 0x3f800000    # 1.0f

    .line 312
    .line 313
    const v13, -0x40f33333    # -0.55f

    .line 314
    .line 315
    .line 316
    const/high16 v15, -0x40800000    # -1.0f

    .line 317
    .line 318
    const v16, 0x3ee66666    # 0.45f

    .line 319
    .line 320
    .line 321
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 322
    .line 323
    .line 324
    const v0, 0x3fb9999a    # 1.45f

    .line 325
    .line 326
    .line 327
    const/high16 v2, 0x41500000    # 13.0f

    .line 328
    .line 329
    const/high16 v4, 0x40000000    # 2.0f

    .line 330
    .line 331
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 332
    .line 333
    .line 334
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 335
    .line 336
    .line 337
    const/high16 v0, 0x41a00000    # 20.0f

    .line 338
    .line 339
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 340
    .line 341
    .line 342
    const/4 v0, 0x0

    .line 343
    const/high16 v2, 0x40000000    # 2.0f

    .line 344
    .line 345
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 346
    .line 347
    .line 348
    const/high16 v17, 0x3f800000    # 1.0f

    .line 349
    .line 350
    const/high16 v18, -0x40800000    # -1.0f

    .line 351
    .line 352
    const v13, 0x3f0ccccd    # 0.55f

    .line 353
    .line 354
    .line 355
    const/high16 v15, 0x3f800000    # 1.0f

    .line 356
    .line 357
    const v16, -0x4119999a    # -0.45f

    .line 358
    .line 359
    .line 360
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 361
    .line 362
    .line 363
    const v0, -0x4119999a    # -0.45f

    .line 364
    .line 365
    .line 366
    const/high16 v2, -0x40800000    # -1.0f

    .line 367
    .line 368
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 369
    .line 370
    .line 371
    const/high16 v0, -0x40000000    # -2.0f

    .line 372
    .line 373
    const/4 v2, 0x0

    .line 374
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 375
    .line 376
    .line 377
    const/high16 v17, -0x40800000    # -1.0f

    .line 378
    .line 379
    const/high16 v18, 0x3f800000    # 1.0f

    .line 380
    .line 381
    const v13, -0x40f33333    # -0.55f

    .line 382
    .line 383
    .line 384
    const/high16 v15, -0x40800000    # -1.0f

    .line 385
    .line 386
    const v16, 0x3ee66666    # 0.45f

    .line 387
    .line 388
    .line 389
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 390
    .line 391
    .line 392
    const v0, 0x419b999a    # 19.45f

    .line 393
    .line 394
    .line 395
    const/high16 v2, 0x41a00000    # 20.0f

    .line 396
    .line 397
    const/high16 v4, 0x41500000    # 13.0f

    .line 398
    .line 399
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 400
    .line 401
    .line 402
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 403
    .line 404
    .line 405
    const/high16 v0, 0x41300000    # 11.0f

    .line 406
    .line 407
    const/high16 v2, 0x40000000    # 2.0f

    .line 408
    .line 409
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 410
    .line 411
    .line 412
    const/high16 v0, 0x40000000    # 2.0f

    .line 413
    .line 414
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 415
    .line 416
    .line 417
    const/high16 v17, 0x3f800000    # 1.0f

    .line 418
    .line 419
    const/4 v13, 0x0

    .line 420
    const v14, 0x3f0ccccd    # 0.55f

    .line 421
    .line 422
    .line 423
    const v15, 0x3ee66666    # 0.45f

    .line 424
    .line 425
    .line 426
    const/high16 v16, 0x3f800000    # 1.0f

    .line 427
    .line 428
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 429
    .line 430
    .line 431
    const/high16 v0, 0x3f800000    # 1.0f

    .line 432
    .line 433
    const v2, -0x4119999a    # -0.45f

    .line 434
    .line 435
    .line 436
    const/high16 v4, -0x40800000    # -1.0f

    .line 437
    .line 438
    invoke-virtual {v12, v0, v2, v0, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 439
    .line 440
    .line 441
    const/high16 v0, 0x40000000    # 2.0f

    .line 442
    .line 443
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 444
    .line 445
    .line 446
    const/high16 v17, -0x40800000    # -1.0f

    .line 447
    .line 448
    const/high16 v18, -0x40800000    # -1.0f

    .line 449
    .line 450
    const v14, -0x40f33333    # -0.55f

    .line 451
    .line 452
    .line 453
    const v15, -0x4119999a    # -0.45f

    .line 454
    .line 455
    .line 456
    const/high16 v16, -0x40800000    # -1.0f

    .line 457
    .line 458
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 459
    .line 460
    .line 461
    const v0, 0x3fb9999a    # 1.45f

    .line 462
    .line 463
    .line 464
    const/high16 v2, 0x41300000    # 11.0f

    .line 465
    .line 466
    const/high16 v4, 0x40000000    # 2.0f

    .line 467
    .line 468
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 469
    .line 470
    .line 471
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 472
    .line 473
    .line 474
    const/high16 v0, 0x41a00000    # 20.0f

    .line 475
    .line 476
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 477
    .line 478
    .line 479
    const/high16 v0, 0x40000000    # 2.0f

    .line 480
    .line 481
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 482
    .line 483
    .line 484
    const/high16 v17, 0x3f800000    # 1.0f

    .line 485
    .line 486
    const/high16 v18, 0x3f800000    # 1.0f

    .line 487
    .line 488
    const v14, 0x3f0ccccd    # 0.55f

    .line 489
    .line 490
    .line 491
    const v15, 0x3ee66666    # 0.45f

    .line 492
    .line 493
    .line 494
    const/high16 v16, 0x3f800000    # 1.0f

    .line 495
    .line 496
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 497
    .line 498
    .line 499
    const/high16 v0, 0x3f800000    # 1.0f

    .line 500
    .line 501
    const v2, -0x4119999a    # -0.45f

    .line 502
    .line 503
    .line 504
    const/high16 v4, -0x40800000    # -1.0f

    .line 505
    .line 506
    invoke-virtual {v12, v0, v2, v0, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 507
    .line 508
    .line 509
    const/high16 v0, -0x40000000    # -2.0f

    .line 510
    .line 511
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 512
    .line 513
    .line 514
    const/high16 v17, -0x40800000    # -1.0f

    .line 515
    .line 516
    const/high16 v18, -0x40800000    # -1.0f

    .line 517
    .line 518
    const v14, -0x40f33333    # -0.55f

    .line 519
    .line 520
    .line 521
    const v15, -0x4119999a    # -0.45f

    .line 522
    .line 523
    .line 524
    const/high16 v16, -0x40800000    # -1.0f

    .line 525
    .line 526
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 527
    .line 528
    .line 529
    const/high16 v17, 0x41300000    # 11.0f

    .line 530
    .line 531
    const/high16 v18, 0x41a00000    # 20.0f

    .line 532
    .line 533
    const v13, 0x41373333    # 11.45f

    .line 534
    .line 535
    .line 536
    const/high16 v14, 0x41980000    # 19.0f

    .line 537
    .line 538
    const/high16 v15, 0x41300000    # 11.0f

    .line 539
    .line 540
    const v16, 0x419b999a    # 19.45f

    .line 541
    .line 542
    .line 543
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 544
    .line 545
    .line 546
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 547
    .line 548
    .line 549
    const v0, 0x40928f5c    # 4.58f

    .line 550
    .line 551
    .line 552
    const v2, 0x40bfae14    # 5.99f

    .line 553
    .line 554
    .line 555
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 556
    .line 557
    .line 558
    const v17, -0x404b851f    # -1.41f

    .line 559
    .line 560
    .line 561
    const/16 v18, 0x0

    .line 562
    .line 563
    const v13, -0x413851ec    # -0.39f

    .line 564
    .line 565
    .line 566
    const v14, -0x413851ec    # -0.39f

    .line 567
    .line 568
    .line 569
    const v15, -0x407c28f6    # -1.03f

    .line 570
    .line 571
    .line 572
    const v16, -0x413851ec    # -0.39f

    .line 573
    .line 574
    .line 575
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 576
    .line 577
    .line 578
    const/16 v17, 0x0

    .line 579
    .line 580
    const v18, 0x3fb47ae1    # 1.41f

    .line 581
    .line 582
    .line 583
    const v14, 0x3ec7ae14    # 0.39f

    .line 584
    .line 585
    .line 586
    const v15, -0x413851ec    # -0.39f

    .line 587
    .line 588
    .line 589
    const v16, 0x3f83d70a    # 1.03f

    .line 590
    .line 591
    .line 592
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 593
    .line 594
    .line 595
    const v0, 0x3f87ae14    # 1.06f

    .line 596
    .line 597
    .line 598
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 599
    .line 600
    .line 601
    const v17, 0x3fb47ae1    # 1.41f

    .line 602
    .line 603
    .line 604
    const/16 v18, 0x0

    .line 605
    .line 606
    const v13, 0x3ec7ae14    # 0.39f

    .line 607
    .line 608
    .line 609
    const v15, 0x3f83d70a    # 1.03f

    .line 610
    .line 611
    .line 612
    const v16, 0x3ec7ae14    # 0.39f

    .line 613
    .line 614
    .line 615
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 616
    .line 617
    .line 618
    const v0, -0x407c28f6    # -1.03f

    .line 619
    .line 620
    .line 621
    const v2, -0x404b851f    # -1.41f

    .line 622
    .line 623
    .line 624
    const v4, 0x3ec7ae14    # 0.39f

    .line 625
    .line 626
    .line 627
    const/4 v6, 0x0

    .line 628
    invoke-virtual {v12, v4, v0, v6, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 629
    .line 630
    .line 631
    const v0, 0x40928f5c    # 4.58f

    .line 632
    .line 633
    .line 634
    const v2, 0x40bfae14    # 5.99f

    .line 635
    .line 636
    .line 637
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 638
    .line 639
    .line 640
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 641
    .line 642
    .line 643
    const v0, 0x4187999a    # 16.95f

    .line 644
    .line 645
    .line 646
    const v2, 0x4192e148    # 18.36f

    .line 647
    .line 648
    .line 649
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 650
    .line 651
    .line 652
    const v17, -0x404b851f    # -1.41f

    .line 653
    .line 654
    .line 655
    const v13, -0x413851ec    # -0.39f

    .line 656
    .line 657
    .line 658
    const v14, -0x413851ec    # -0.39f

    .line 659
    .line 660
    .line 661
    const v15, -0x407c28f6    # -1.03f

    .line 662
    .line 663
    .line 664
    const v16, -0x413851ec    # -0.39f

    .line 665
    .line 666
    .line 667
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 668
    .line 669
    .line 670
    const/16 v17, 0x0

    .line 671
    .line 672
    const v18, 0x3fb47ae1    # 1.41f

    .line 673
    .line 674
    .line 675
    const v14, 0x3ec7ae14    # 0.39f

    .line 676
    .line 677
    .line 678
    const v15, -0x413851ec    # -0.39f

    .line 679
    .line 680
    .line 681
    const v16, 0x3f83d70a    # 1.03f

    .line 682
    .line 683
    .line 684
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 685
    .line 686
    .line 687
    const v0, 0x3f87ae14    # 1.06f

    .line 688
    .line 689
    .line 690
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 691
    .line 692
    .line 693
    const v17, 0x3fb47ae1    # 1.41f

    .line 694
    .line 695
    .line 696
    const/16 v18, 0x0

    .line 697
    .line 698
    const v13, 0x3ec7ae14    # 0.39f

    .line 699
    .line 700
    .line 701
    const v15, 0x3f83d70a    # 1.03f

    .line 702
    .line 703
    .line 704
    const v16, 0x3ec7ae14    # 0.39f

    .line 705
    .line 706
    .line 707
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 708
    .line 709
    .line 710
    const/16 v17, 0x0

    .line 711
    .line 712
    const v18, -0x404b851f    # -1.41f

    .line 713
    .line 714
    .line 715
    const v14, -0x413851ec    # -0.39f

    .line 716
    .line 717
    .line 718
    const v15, 0x3ec7ae14    # 0.39f

    .line 719
    .line 720
    .line 721
    const v16, -0x407c28f6    # -1.03f

    .line 722
    .line 723
    .line 724
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 725
    .line 726
    .line 727
    const v0, 0x4187999a    # 16.95f

    .line 728
    .line 729
    .line 730
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 731
    .line 732
    .line 733
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 734
    .line 735
    .line 736
    const v0, 0x419b5c29    # 19.42f

    .line 737
    .line 738
    .line 739
    const v2, 0x40bfae14    # 5.99f

    .line 740
    .line 741
    .line 742
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 743
    .line 744
    .line 745
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 746
    .line 747
    .line 748
    const v17, -0x404b851f    # -1.41f

    .line 749
    .line 750
    .line 751
    const/16 v18, 0x0

    .line 752
    .line 753
    const v13, -0x413851ec    # -0.39f

    .line 754
    .line 755
    .line 756
    const v15, -0x407c28f6    # -1.03f

    .line 757
    .line 758
    .line 759
    const v16, -0x413851ec    # -0.39f

    .line 760
    .line 761
    .line 762
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 763
    .line 764
    .line 765
    const v0, -0x407851ec    # -1.06f

    .line 766
    .line 767
    .line 768
    const v2, 0x3f87ae14    # 1.06f

    .line 769
    .line 770
    .line 771
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 772
    .line 773
    .line 774
    const/16 v17, 0x0

    .line 775
    .line 776
    const v18, 0x3fb47ae1    # 1.41f

    .line 777
    .line 778
    .line 779
    const v14, 0x3ec7ae14    # 0.39f

    .line 780
    .line 781
    .line 782
    const v15, -0x413851ec    # -0.39f

    .line 783
    .line 784
    .line 785
    const v16, 0x3f83d70a    # 1.03f

    .line 786
    .line 787
    .line 788
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 789
    .line 790
    .line 791
    const v0, 0x3f83d70a    # 1.03f

    .line 792
    .line 793
    .line 794
    const v2, 0x3fb47ae1    # 1.41f

    .line 795
    .line 796
    .line 797
    invoke-virtual {v12, v0, v4, v2, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 798
    .line 799
    .line 800
    const v0, 0x419b5c29    # 19.42f

    .line 801
    .line 802
    .line 803
    const v2, 0x40bfae14    # 5.99f

    .line 804
    .line 805
    .line 806
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 807
    .line 808
    .line 809
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 810
    .line 811
    .line 812
    const v0, 0x40e1999a    # 7.05f

    .line 813
    .line 814
    .line 815
    const v2, 0x4192e148    # 18.36f

    .line 816
    .line 817
    .line 818
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 819
    .line 820
    .line 821
    const v18, -0x404b851f    # -1.41f

    .line 822
    .line 823
    .line 824
    const v13, 0x3ec7ae14    # 0.39f

    .line 825
    .line 826
    .line 827
    const v14, -0x413851ec    # -0.39f

    .line 828
    .line 829
    .line 830
    const v15, 0x3ec7ae14    # 0.39f

    .line 831
    .line 832
    .line 833
    const v16, -0x407c28f6    # -1.03f

    .line 834
    .line 835
    .line 836
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 837
    .line 838
    .line 839
    const v17, -0x404b851f    # -1.41f

    .line 840
    .line 841
    .line 842
    const/16 v18, 0x0

    .line 843
    .line 844
    const v13, -0x413851ec    # -0.39f

    .line 845
    .line 846
    .line 847
    const v15, -0x407c28f6    # -1.03f

    .line 848
    .line 849
    .line 850
    const v16, -0x413851ec    # -0.39f

    .line 851
    .line 852
    .line 853
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 854
    .line 855
    .line 856
    const v0, -0x407851ec    # -1.06f

    .line 857
    .line 858
    .line 859
    const v2, 0x3f87ae14    # 1.06f

    .line 860
    .line 861
    .line 862
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 863
    .line 864
    .line 865
    const/16 v17, 0x0

    .line 866
    .line 867
    const v18, 0x3fb47ae1    # 1.41f

    .line 868
    .line 869
    .line 870
    const v14, 0x3ec7ae14    # 0.39f

    .line 871
    .line 872
    .line 873
    const v15, -0x413851ec    # -0.39f

    .line 874
    .line 875
    .line 876
    const v16, 0x3f83d70a    # 1.03f

    .line 877
    .line 878
    .line 879
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 880
    .line 881
    .line 882
    const v0, 0x3f83d70a    # 1.03f

    .line 883
    .line 884
    .line 885
    const v2, 0x3fb47ae1    # 1.41f

    .line 886
    .line 887
    .line 888
    invoke-virtual {v12, v0, v4, v2, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 889
    .line 890
    .line 891
    const v0, 0x40e1999a    # 7.05f

    .line 892
    .line 893
    .line 894
    const v2, 0x4192e148    # 18.36f

    .line 895
    .line 896
    .line 897
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 898
    .line 899
    .line 900
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 901
    .line 902
    .line 903
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 904
    .line 905
    .line 906
    move-result-object v2

    .line 907
    const/16 v16, 0x3800

    .line 908
    .line 909
    const/16 v17, 0x0

    .line 910
    .line 911
    const/high16 v6, 0x3f800000    # 1.0f

    .line 912
    .line 913
    const/high16 v8, 0x3f800000    # 1.0f

    .line 914
    .line 915
    const/4 v7, 0x0

    .line 916
    const/high16 v12, 0x3f800000    # 1.0f

    .line 917
    .line 918
    const/4 v13, 0x0

    .line 919
    const/4 v14, 0x0

    .line 920
    const/4 v15, 0x0

    .line 921
    const-string v4, ""

    .line 922
    .line 923
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 924
    .line 925
    .line 926
    move-result-object v0

    .line 927
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 928
    .line 929
    .line 930
    move-result-object v0

    .line 931
    sput-object v0, Landroidx/compose/material/icons/twotone/LightModeKt;->_lightMode:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 932
    .line 933
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 934
    .line 935
    .line 936
    return-object v0
.end method
