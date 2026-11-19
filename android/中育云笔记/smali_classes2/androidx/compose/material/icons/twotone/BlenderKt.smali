.class public final Landroidx/compose/material/icons/twotone/BlenderKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _blender:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getBlender(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/BlenderKt;->_blender:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.Blender"

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
    const/high16 v4, 0x41500000    # 13.0f

    .line 71
    .line 72
    const/high16 v6, 0x41800000    # 16.0f

    .line 73
    .line 74
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v4, -0x40000000    # -2.0f

    .line 78
    .line 79
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 80
    .line 81
    .line 82
    const/high16 v25, -0x3fc00000    # -3.0f

    .line 83
    .line 84
    const/high16 v26, 0x40400000    # 3.0f

    .line 85
    .line 86
    const v21, -0x402ccccd    # -1.65f

    .line 87
    .line 88
    .line 89
    const/16 v22, 0x0

    .line 90
    .line 91
    const/high16 v23, -0x3fc00000    # -3.0f

    .line 92
    .line 93
    const v24, 0x3faccccd    # 1.35f

    .line 94
    .line 95
    .line 96
    move-object/from16 v20, v2

    .line 97
    .line 98
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 99
    .line 100
    .line 101
    const/high16 v4, 0x3f800000    # 1.0f

    .line 102
    .line 103
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 104
    .line 105
    .line 106
    const/high16 v4, 0x41000000    # 8.0f

    .line 107
    .line 108
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 109
    .line 110
    .line 111
    const/high16 v4, -0x40800000    # -1.0f

    .line 112
    .line 113
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 114
    .line 115
    .line 116
    const/high16 v25, 0x41500000    # 13.0f

    .line 117
    .line 118
    const/high16 v26, 0x41800000    # 16.0f

    .line 119
    .line 120
    const/high16 v21, 0x41800000    # 16.0f

    .line 121
    .line 122
    const v22, 0x418acccd    # 17.35f

    .line 123
    .line 124
    .line 125
    const v23, 0x416a6666    # 14.65f

    .line 126
    .line 127
    .line 128
    const/high16 v24, 0x41800000    # 16.0f

    .line 129
    .line 130
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 131
    .line 132
    .line 133
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 134
    .line 135
    .line 136
    const/high16 v4, 0x41980000    # 19.0f

    .line 137
    .line 138
    const/high16 v6, 0x41400000    # 12.0f

    .line 139
    .line 140
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 141
    .line 142
    .line 143
    const/high16 v25, -0x40800000    # -1.0f

    .line 144
    .line 145
    const/high16 v26, -0x40800000    # -1.0f

    .line 146
    .line 147
    const v21, -0x40f33333    # -0.55f

    .line 148
    .line 149
    .line 150
    const/16 v22, 0x0

    .line 151
    .line 152
    const/high16 v23, -0x40800000    # -1.0f

    .line 153
    .line 154
    const v24, -0x4119999a    # -0.45f

    .line 155
    .line 156
    .line 157
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 158
    .line 159
    .line 160
    const v4, 0x3ee66666    # 0.45f

    .line 161
    .line 162
    .line 163
    const/high16 v6, -0x40800000    # -1.0f

    .line 164
    .line 165
    const/high16 v7, 0x3f800000    # 1.0f

    .line 166
    .line 167
    invoke-virtual {v2, v4, v6, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 168
    .line 169
    .line 170
    const/high16 v6, 0x3f800000    # 1.0f

    .line 171
    .line 172
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 173
    .line 174
    .line 175
    const v4, 0x4148cccd    # 12.55f

    .line 176
    .line 177
    .line 178
    const/high16 v6, 0x41980000    # 19.0f

    .line 179
    .line 180
    const/high16 v7, 0x41400000    # 12.0f

    .line 181
    .line 182
    invoke-virtual {v2, v4, v6, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 183
    .line 184
    .line 185
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 186
    .line 187
    .line 188
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 189
    .line 190
    .line 191
    move-result-object v2

    .line 192
    const/16 v16, 0x3800

    .line 193
    .line 194
    const/16 v17, 0x0

    .line 195
    .line 196
    const v6, 0x3e99999a    # 0.3f

    .line 197
    .line 198
    .line 199
    const v8, 0x3e99999a    # 0.3f

    .line 200
    .line 201
    .line 202
    const/4 v7, 0x0

    .line 203
    const/high16 v9, 0x3f800000    # 1.0f

    .line 204
    .line 205
    const/high16 v12, 0x3f800000    # 1.0f

    .line 206
    .line 207
    const/4 v13, 0x0

    .line 208
    const/4 v14, 0x0

    .line 209
    const/4 v15, 0x0

    .line 210
    const-string v4, ""

    .line 211
    .line 212
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 213
    .line 214
    .line 215
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 216
    .line 217
    .line 218
    move-result v3

    .line 219
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 220
    .line 221
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 222
    .line 223
    .line 224
    move-result-wide v6

    .line 225
    const/4 v2, 0x0

    .line 226
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 227
    .line 228
    .line 229
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 230
    .line 231
    .line 232
    move-result v10

    .line 233
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 234
    .line 235
    .line 236
    move-result v11

    .line 237
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 238
    .line 239
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 240
    .line 241
    .line 242
    const v4, 0x41810a3d    # 16.13f

    .line 243
    .line 244
    .line 245
    const v6, 0x4172147b    # 15.13f

    .line 246
    .line 247
    .line 248
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 249
    .line 250
    .line 251
    const/high16 v4, 0x40400000    # 3.0f

    .line 252
    .line 253
    const/high16 v6, 0x41900000    # 18.0f

    .line 254
    .line 255
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 256
    .line 257
    .line 258
    const/high16 v4, -0x3f800000    # -4.0f

    .line 259
    .line 260
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 261
    .line 262
    .line 263
    const/high16 v4, 0x40000000    # 2.0f

    .line 264
    .line 265
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 266
    .line 267
    .line 268
    const/high16 v4, -0x3f800000    # -4.0f

    .line 269
    .line 270
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 271
    .line 272
    .line 273
    const/high16 v4, 0x3f800000    # 1.0f

    .line 274
    .line 275
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 276
    .line 277
    .line 278
    const/high16 v4, 0x40a00000    # 5.0f

    .line 279
    .line 280
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 281
    .line 282
    .line 283
    const/high16 v25, 0x40400000    # 3.0f

    .line 284
    .line 285
    const/high16 v26, 0x40a00000    # 5.0f

    .line 286
    .line 287
    const v21, 0x4079999a    # 3.9f

    .line 288
    .line 289
    .line 290
    const/high16 v22, 0x40400000    # 3.0f

    .line 291
    .line 292
    const/high16 v23, 0x40400000    # 3.0f

    .line 293
    .line 294
    const v24, 0x4079999a    # 3.9f

    .line 295
    .line 296
    .line 297
    move-object/from16 v20, v2

    .line 298
    .line 299
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 300
    .line 301
    .line 302
    const/high16 v4, 0x40800000    # 4.0f

    .line 303
    .line 304
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 305
    .line 306
    .line 307
    const/high16 v25, 0x40000000    # 2.0f

    .line 308
    .line 309
    const/high16 v26, 0x40000000    # 2.0f

    .line 310
    .line 311
    const/16 v21, 0x0

    .line 312
    .line 313
    const v22, 0x3f8ccccd    # 1.1f

    .line 314
    .line 315
    .line 316
    const v23, 0x3f666666    # 0.9f

    .line 317
    .line 318
    .line 319
    const/high16 v24, 0x40000000    # 2.0f

    .line 320
    .line 321
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 322
    .line 323
    .line 324
    const v4, 0x400eb852    # 2.23f

    .line 325
    .line 326
    .line 327
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 328
    .line 329
    .line 330
    const v4, 0x3f23d70a    # 0.64f

    .line 331
    .line 332
    .line 333
    const v6, 0x408428f6    # 4.13f

    .line 334
    .line 335
    .line 336
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 337
    .line 338
    .line 339
    const/high16 v25, 0x40c00000    # 6.0f

    .line 340
    .line 341
    const/high16 v26, 0x41980000    # 19.0f

    .line 342
    .line 343
    const v21, 0x40d7ae14    # 6.74f

    .line 344
    .line 345
    .line 346
    const v22, 0x41806666    # 16.05f

    .line 347
    .line 348
    .line 349
    const/high16 v23, 0x40c00000    # 6.0f

    .line 350
    .line 351
    const v24, 0x418b70a4    # 17.43f

    .line 352
    .line 353
    .line 354
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 355
    .line 356
    .line 357
    const/high16 v4, 0x3f800000    # 1.0f

    .line 358
    .line 359
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 360
    .line 361
    .line 362
    const/high16 v25, 0x40000000    # 2.0f

    .line 363
    .line 364
    const/high16 v26, 0x40000000    # 2.0f

    .line 365
    .line 366
    const/16 v21, 0x0

    .line 367
    .line 368
    const v22, 0x3f8ccccd    # 1.1f

    .line 369
    .line 370
    .line 371
    const v23, 0x3f666666    # 0.9f

    .line 372
    .line 373
    .line 374
    const/high16 v24, 0x40000000    # 2.0f

    .line 375
    .line 376
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 377
    .line 378
    .line 379
    const/high16 v4, 0x41000000    # 8.0f

    .line 380
    .line 381
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 382
    .line 383
    .line 384
    const/high16 v26, -0x40000000    # -2.0f

    .line 385
    .line 386
    const v21, 0x3f8ccccd    # 1.1f

    .line 387
    .line 388
    .line 389
    const/16 v22, 0x0

    .line 390
    .line 391
    const/high16 v23, 0x40000000    # 2.0f

    .line 392
    .line 393
    const v24, -0x4099999a    # -0.9f

    .line 394
    .line 395
    .line 396
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 397
    .line 398
    .line 399
    const/high16 v4, -0x40800000    # -1.0f

    .line 400
    .line 401
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 402
    .line 403
    .line 404
    const v25, 0x41810a3d    # 16.13f

    .line 405
    .line 406
    .line 407
    const v26, 0x4172147b    # 15.13f

    .line 408
    .line 409
    .line 410
    const/high16 v21, 0x41900000    # 18.0f

    .line 411
    .line 412
    const v22, 0x418b70a4    # 17.43f

    .line 413
    .line 414
    .line 415
    const v23, 0x418a147b    # 17.26f

    .line 416
    .line 417
    .line 418
    const v24, 0x41806666    # 16.05f

    .line 419
    .line 420
    .line 421
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 422
    .line 423
    .line 424
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 425
    .line 426
    .line 427
    const/high16 v4, 0x41100000    # 9.0f

    .line 428
    .line 429
    const/high16 v6, 0x40a00000    # 5.0f

    .line 430
    .line 431
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 432
    .line 433
    .line 434
    const/high16 v4, 0x40a00000    # 5.0f

    .line 435
    .line 436
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 437
    .line 438
    .line 439
    const v4, 0x3fa7ae14    # 1.31f

    .line 440
    .line 441
    .line 442
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 443
    .line 444
    .line 445
    const v4, 0x3f1eb852    # 0.62f

    .line 446
    .line 447
    .line 448
    const/high16 v6, 0x40800000    # 4.0f

    .line 449
    .line 450
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 451
    .line 452
    .line 453
    const/high16 v4, 0x40a00000    # 5.0f

    .line 454
    .line 455
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 456
    .line 457
    .line 458
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 459
    .line 460
    .line 461
    const v4, 0x417ab852    # 15.67f

    .line 462
    .line 463
    .line 464
    const/high16 v6, 0x40a00000    # 5.0f

    .line 465
    .line 466
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 467
    .line 468
    .line 469
    const v4, -0x404f5c29    # -1.38f

    .line 470
    .line 471
    .line 472
    const/high16 v6, 0x41100000    # 9.0f

    .line 473
    .line 474
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 475
    .line 476
    .line 477
    const v4, 0x411b851f    # 9.72f

    .line 478
    .line 479
    .line 480
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 481
    .line 482
    .line 483
    const v4, 0x410547ae    # 8.33f

    .line 484
    .line 485
    .line 486
    const/high16 v6, 0x40a00000    # 5.0f

    .line 487
    .line 488
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 489
    .line 490
    .line 491
    const v4, 0x417ab852    # 15.67f

    .line 492
    .line 493
    .line 494
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 495
    .line 496
    .line 497
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 498
    .line 499
    .line 500
    const/high16 v4, 0x41a00000    # 20.0f

    .line 501
    .line 502
    const/high16 v6, 0x41800000    # 16.0f

    .line 503
    .line 504
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 505
    .line 506
    .line 507
    const/high16 v4, 0x41000000    # 8.0f

    .line 508
    .line 509
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 510
    .line 511
    .line 512
    const/high16 v4, -0x40800000    # -1.0f

    .line 513
    .line 514
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 515
    .line 516
    .line 517
    const/high16 v25, 0x40400000    # 3.0f

    .line 518
    .line 519
    const/high16 v26, -0x3fc00000    # -3.0f

    .line 520
    .line 521
    const/16 v21, 0x0

    .line 522
    .line 523
    const v22, -0x402ccccd    # -1.65f

    .line 524
    .line 525
    .line 526
    const v23, 0x3faccccd    # 1.35f

    .line 527
    .line 528
    .line 529
    const/high16 v24, -0x3fc00000    # -3.0f

    .line 530
    .line 531
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 532
    .line 533
    .line 534
    const/high16 v4, 0x40000000    # 2.0f

    .line 535
    .line 536
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 537
    .line 538
    .line 539
    const/high16 v26, 0x40400000    # 3.0f

    .line 540
    .line 541
    const v21, 0x3fd33333    # 1.65f

    .line 542
    .line 543
    .line 544
    const/16 v22, 0x0

    .line 545
    .line 546
    const/high16 v23, 0x40400000    # 3.0f

    .line 547
    .line 548
    const v24, 0x3faccccd    # 1.35f

    .line 549
    .line 550
    .line 551
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 552
    .line 553
    .line 554
    const/high16 v4, 0x41a00000    # 20.0f

    .line 555
    .line 556
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 557
    .line 558
    .line 559
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 560
    .line 561
    .line 562
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 563
    .line 564
    .line 565
    move-result-object v2

    .line 566
    const/high16 v6, 0x3f800000    # 1.0f

    .line 567
    .line 568
    const/high16 v8, 0x3f800000    # 1.0f

    .line 569
    .line 570
    const/4 v7, 0x0

    .line 571
    const-string v4, ""

    .line 572
    .line 573
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 574
    .line 575
    .line 576
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 577
    .line 578
    .line 579
    move-result v3

    .line 580
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 581
    .line 582
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 583
    .line 584
    .line 585
    move-result-wide v6

    .line 586
    const/4 v0, 0x0

    .line 587
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 588
    .line 589
    .line 590
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 591
    .line 592
    .line 593
    move-result v10

    .line 594
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 595
    .line 596
    .line 597
    move-result v11

    .line 598
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 599
    .line 600
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 601
    .line 602
    .line 603
    const/high16 v0, 0x41900000    # 18.0f

    .line 604
    .line 605
    const/high16 v2, 0x41400000    # 12.0f

    .line 606
    .line 607
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 608
    .line 609
    .line 610
    const/4 v0, 0x0

    .line 611
    const/high16 v2, -0x40800000    # -1.0f

    .line 612
    .line 613
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 614
    .line 615
    .line 616
    const/high16 v18, 0x40000000    # 2.0f

    .line 617
    .line 618
    const/16 v19, 0x0

    .line 619
    .line 620
    const/high16 v13, 0x3f800000    # 1.0f

    .line 621
    .line 622
    const/high16 v14, 0x3f800000    # 1.0f

    .line 623
    .line 624
    const/16 v16, 0x1

    .line 625
    .line 626
    const/16 v17, 0x1

    .line 627
    .line 628
    invoke-virtual/range {v12 .. v19}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 629
    .line 630
    .line 631
    const/high16 v18, -0x40000000    # -2.0f

    .line 632
    .line 633
    invoke-virtual/range {v12 .. v19}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 634
    .line 635
    .line 636
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 637
    .line 638
    .line 639
    move-result-object v2

    .line 640
    const/16 v16, 0x3800

    .line 641
    .line 642
    const/16 v17, 0x0

    .line 643
    .line 644
    const/high16 v6, 0x3f800000    # 1.0f

    .line 645
    .line 646
    const/4 v7, 0x0

    .line 647
    const/high16 v12, 0x3f800000    # 1.0f

    .line 648
    .line 649
    const/4 v13, 0x0

    .line 650
    const/4 v14, 0x0

    .line 651
    const-string v4, ""

    .line 652
    .line 653
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 654
    .line 655
    .line 656
    move-result-object v0

    .line 657
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 658
    .line 659
    .line 660
    move-result-object v0

    .line 661
    sput-object v0, Landroidx/compose/material/icons/twotone/BlenderKt;->_blender:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 662
    .line 663
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 664
    .line 665
    .line 666
    return-object v0
.end method
