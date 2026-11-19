.class public final Landroidx/compose/material/icons/twotone/LocalFireDepartmentKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _localFireDepartment:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getLocalFireDepartment(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/LocalFireDepartmentKt;->_localFireDepartment:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.LocalFireDepartment"

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
    const v4, 0x4181999a    # 16.2f

    .line 71
    .line 72
    .line 73
    const v6, 0x410a6666    # 8.65f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v25, 0x416051ec    # 14.02f

    .line 80
    .line 81
    .line 82
    const v26, 0x4114cccd    # 9.3f

    .line 83
    .line 84
    .line 85
    const v21, 0x4178f5c3    # 15.56f

    .line 86
    .line 87
    .line 88
    const v22, 0x41111eb8    # 9.07f

    .line 89
    .line 90
    .line 91
    const v23, 0x416ccccd    # 14.8f

    .line 92
    .line 93
    .line 94
    const v24, 0x4114cccd    # 9.3f

    .line 95
    .line 96
    .line 97
    move-object/from16 v20, v2

    .line 98
    .line 99
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 100
    .line 101
    .line 102
    const v25, -0x3f80a3d7    # -3.99f

    .line 103
    .line 104
    .line 105
    const v26, -0x3f9ccccd    # -3.55f

    .line 106
    .line 107
    .line 108
    const v21, -0x3ffc28f6    # -2.06f

    .line 109
    .line 110
    .line 111
    const/16 v22, 0x0

    .line 112
    .line 113
    const v23, -0x3f8eb852    # -3.77f

    .line 114
    .line 115
    .line 116
    const v24, -0x4039999a    # -1.55f

    .line 117
    .line 118
    .line 119
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 120
    .line 121
    .line 122
    const/high16 v25, 0x40c00000    # 6.0f

    .line 123
    .line 124
    const/high16 v26, 0x41500000    # 13.0f

    .line 125
    .line 126
    const v21, 0x4102147b    # 8.13f

    .line 127
    .line 128
    .line 129
    const v22, 0x40eb3333    # 7.35f

    .line 130
    .line 131
    .line 132
    const/high16 v23, 0x40c00000    # 6.0f

    .line 133
    .line 134
    const v24, 0x411d70a4    # 9.84f

    .line 135
    .line 136
    .line 137
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 138
    .line 139
    .line 140
    const v25, 0x40028f5c    # 2.04f

    .line 141
    .line 142
    .line 143
    const/high16 v26, 0x40900000    # 4.5f

    .line 144
    .line 145
    const/16 v21, 0x0

    .line 146
    .line 147
    const v22, 0x3fe51eb8    # 1.79f

    .line 148
    .line 149
    .line 150
    const v23, 0x3f4a3d71    # 0.79f

    .line 151
    .line 152
    .line 153
    const v24, 0x4059999a    # 3.4f

    .line 154
    .line 155
    .line 156
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 157
    .line 158
    .line 159
    const v25, 0x3f90a3d7    # 1.13f

    .line 160
    .line 161
    .line 162
    const v26, -0x3fb1eb85    # -3.22f

    .line 163
    .line 164
    .line 165
    const v21, -0x42dc28f6    # -0.04f

    .line 166
    .line 167
    .line 168
    const v22, -0x4151eb85    # -0.34f

    .line 169
    .line 170
    .line 171
    const v23, -0x41947ae1    # -0.23f

    .line 172
    .line 173
    .line 174
    const v24, -0x400f5c29    # -1.88f

    .line 175
    .line 176
    .line 177
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 178
    .line 179
    .line 180
    const/4 v4, 0x0

    .line 181
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 182
    .line 183
    .line 184
    const/high16 v4, 0x41380000    # 11.5f

    .line 185
    .line 186
    const/high16 v6, 0x41400000    # 12.0f

    .line 187
    .line 188
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 189
    .line 190
    .line 191
    const v4, 0x40351eb8    # 2.83f

    .line 192
    .line 193
    .line 194
    const v6, 0x4031eb85    # 2.78f

    .line 195
    .line 196
    .line 197
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 198
    .line 199
    .line 200
    const/4 v4, 0x0

    .line 201
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 202
    .line 203
    .line 204
    const v26, 0x404d70a4    # 3.21f

    .line 205
    .line 206
    .line 207
    const v21, 0x3faccccd    # 1.35f

    .line 208
    .line 209
    .line 210
    const v22, 0x3faa3d71    # 1.33f

    .line 211
    .line 212
    .line 213
    const v23, 0x3f95c28f    # 1.17f

    .line 214
    .line 215
    .line 216
    const v24, 0x40370a3d    # 2.86f

    .line 217
    .line 218
    .line 219
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 220
    .line 221
    .line 222
    const v4, 0x3c23d70a    # 0.01f

    .line 223
    .line 224
    .line 225
    const/4 v6, 0x0

    .line 226
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 227
    .line 228
    .line 229
    const/high16 v25, 0x41900000    # 18.0f

    .line 230
    .line 231
    const/high16 v26, 0x41500000    # 13.0f

    .line 232
    .line 233
    const v21, 0x4189ae14    # 17.21f

    .line 234
    .line 235
    .line 236
    const v22, 0x41833333    # 16.4f

    .line 237
    .line 238
    .line 239
    const/high16 v23, 0x41900000    # 18.0f

    .line 240
    .line 241
    const v24, 0x416ca3d7    # 14.79f

    .line 242
    .line 243
    .line 244
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 245
    .line 246
    .line 247
    const v25, 0x4181999a    # 16.2f

    .line 248
    .line 249
    .line 250
    const v26, 0x410a6666    # 8.65f

    .line 251
    .line 252
    .line 253
    const/high16 v21, 0x41900000    # 18.0f

    .line 254
    .line 255
    const v22, 0x4135999a    # 11.35f

    .line 256
    .line 257
    .line 258
    const v23, 0x418ab852    # 17.34f

    .line 259
    .line 260
    .line 261
    const v24, 0x411c7ae1    # 9.78f

    .line 262
    .line 263
    .line 264
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 265
    .line 266
    .line 267
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 268
    .line 269
    .line 270
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 271
    .line 272
    .line 273
    move-result-object v2

    .line 274
    const/16 v16, 0x3800

    .line 275
    .line 276
    const/16 v17, 0x0

    .line 277
    .line 278
    const v6, 0x3e99999a    # 0.3f

    .line 279
    .line 280
    .line 281
    const v8, 0x3e99999a    # 0.3f

    .line 282
    .line 283
    .line 284
    const/4 v7, 0x0

    .line 285
    const/high16 v9, 0x3f800000    # 1.0f

    .line 286
    .line 287
    const/high16 v12, 0x3f800000    # 1.0f

    .line 288
    .line 289
    const/4 v13, 0x0

    .line 290
    const/4 v14, 0x0

    .line 291
    const/4 v15, 0x0

    .line 292
    const-string v4, ""

    .line 293
    .line 294
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 295
    .line 296
    .line 297
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 298
    .line 299
    .line 300
    move-result v3

    .line 301
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 302
    .line 303
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 304
    .line 305
    .line 306
    move-result-wide v6

    .line 307
    const/4 v2, 0x0

    .line 308
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 309
    .line 310
    .line 311
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 312
    .line 313
    .line 314
    move-result v10

    .line 315
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 316
    .line 317
    .line 318
    move-result v11

    .line 319
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 320
    .line 321
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 322
    .line 323
    .line 324
    const v4, 0x4164f5c3    # 14.31f

    .line 325
    .line 326
    .line 327
    const/high16 v6, 0x41400000    # 12.0f

    .line 328
    .line 329
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 330
    .line 331
    .line 332
    const v4, -0x404a3d71    # -1.42f

    .line 333
    .line 334
    .line 335
    const v6, 0x3fb33333    # 1.4f

    .line 336
    .line 337
    .line 338
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 339
    .line 340
    .line 341
    const/high16 v25, 0x41200000    # 10.0f

    .line 342
    .line 343
    const v26, 0x41887ae1    # 17.06f

    .line 344
    .line 345
    .line 346
    const v21, 0x41233333    # 10.2f

    .line 347
    .line 348
    .line 349
    const v22, 0x41808f5c    # 16.07f

    .line 350
    .line 351
    .line 352
    const/high16 v23, 0x41200000    # 10.0f

    .line 353
    .line 354
    const v24, 0x41846666    # 16.55f

    .line 355
    .line 356
    .line 357
    move-object/from16 v20, v2

    .line 358
    .line 359
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 360
    .line 361
    .line 362
    const/high16 v25, 0x40000000    # 2.0f

    .line 363
    .line 364
    const v26, 0x3ff851ec    # 1.94f

    .line 365
    .line 366
    .line 367
    const/16 v21, 0x0

    .line 368
    .line 369
    const v22, 0x3f88f5c3    # 1.07f

    .line 370
    .line 371
    .line 372
    const v23, 0x3f666666    # 0.9f

    .line 373
    .line 374
    .line 375
    const v24, 0x3ff851ec    # 1.94f

    .line 376
    .line 377
    .line 378
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 379
    .line 380
    .line 381
    const v4, -0x40a147ae    # -0.87f

    .line 382
    .line 383
    .line 384
    const v6, -0x4007ae14    # -1.94f

    .line 385
    .line 386
    .line 387
    const/high16 v7, 0x40000000    # 2.0f

    .line 388
    .line 389
    invoke-virtual {v2, v7, v4, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 390
    .line 391
    .line 392
    const v25, -0x40ee147b    # -0.57f

    .line 393
    .line 394
    .line 395
    const v26, -0x4051eb85    # -1.36f

    .line 396
    .line 397
    .line 398
    const v22, -0x40fd70a4    # -0.51f

    .line 399
    .line 400
    .line 401
    const v23, -0x41b33333    # -0.2f

    .line 402
    .line 403
    .line 404
    const v24, -0x40828f5c    # -0.99f

    .line 405
    .line 406
    .line 407
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 408
    .line 409
    .line 410
    const v4, 0x4164f5c3    # 14.31f

    .line 411
    .line 412
    .line 413
    const/high16 v6, 0x41400000    # 12.0f

    .line 414
    .line 415
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 416
    .line 417
    .line 418
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 419
    .line 420
    .line 421
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 422
    .line 423
    .line 424
    move-result-object v2

    .line 425
    const v6, 0x3e99999a    # 0.3f

    .line 426
    .line 427
    .line 428
    const/4 v7, 0x0

    .line 429
    const-string v4, ""

    .line 430
    .line 431
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 432
    .line 433
    .line 434
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 435
    .line 436
    .line 437
    move-result v3

    .line 438
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 439
    .line 440
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 441
    .line 442
    .line 443
    move-result-wide v6

    .line 444
    const/4 v0, 0x0

    .line 445
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 446
    .line 447
    .line 448
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 449
    .line 450
    .line 451
    move-result v10

    .line 452
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 453
    .line 454
    .line 455
    move-result v11

    .line 456
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 457
    .line 458
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 459
    .line 460
    .line 461
    const/high16 v0, 0x41800000    # 16.0f

    .line 462
    .line 463
    const/high16 v2, 0x40c00000    # 6.0f

    .line 464
    .line 465
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 466
    .line 467
    .line 468
    const v0, -0x411eb852    # -0.44f

    .line 469
    .line 470
    .line 471
    const v2, 0x3f0ccccd    # 0.55f

    .line 472
    .line 473
    .line 474
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 475
    .line 476
    .line 477
    const v17, -0x403ae148    # -1.54f

    .line 478
    .line 479
    .line 480
    const/high16 v18, 0x3f400000    # 0.75f

    .line 481
    .line 482
    const v13, -0x4128f5c3    # -0.42f

    .line 483
    .line 484
    .line 485
    const v14, 0x3f051eb8    # 0.52f

    .line 486
    .line 487
    .line 488
    const v15, -0x40851eb8    # -0.98f

    .line 489
    .line 490
    .line 491
    const/high16 v16, 0x3f400000    # 0.75f

    .line 492
    .line 493
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 494
    .line 495
    .line 496
    const/high16 v17, 0x41400000    # 12.0f

    .line 497
    .line 498
    const v18, 0x40a9999a    # 5.3f

    .line 499
    .line 500
    .line 501
    const/high16 v13, 0x41500000    # 13.0f

    .line 502
    .line 503
    const v14, 0x40e9999a    # 7.3f

    .line 504
    .line 505
    .line 506
    const/high16 v15, 0x41400000    # 12.0f

    .line 507
    .line 508
    const v16, 0x40d0a3d7    # 6.52f

    .line 509
    .line 510
    .line 511
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 512
    .line 513
    .line 514
    const/high16 v0, 0x40000000    # 2.0f

    .line 515
    .line 516
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 517
    .line 518
    .line 519
    const/high16 v17, -0x3f000000    # -8.0f

    .line 520
    .line 521
    const/high16 v18, 0x41300000    # 11.0f

    .line 522
    .line 523
    const/4 v13, 0x0

    .line 524
    const/4 v14, 0x0

    .line 525
    const/high16 v15, -0x3f000000    # -8.0f

    .line 526
    .line 527
    const/high16 v16, 0x40800000    # 4.0f

    .line 528
    .line 529
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 530
    .line 531
    .line 532
    const/high16 v17, 0x41000000    # 8.0f

    .line 533
    .line 534
    const/high16 v18, 0x41000000    # 8.0f

    .line 535
    .line 536
    const v14, 0x408d70a4    # 4.42f

    .line 537
    .line 538
    .line 539
    const v15, 0x40651eb8    # 3.58f

    .line 540
    .line 541
    .line 542
    const/high16 v16, 0x41000000    # 8.0f

    .line 543
    .line 544
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 545
    .line 546
    .line 547
    const v0, -0x3f9ae148    # -3.58f

    .line 548
    .line 549
    .line 550
    const/high16 v2, -0x3f000000    # -8.0f

    .line 551
    .line 552
    const/high16 v4, 0x41000000    # 8.0f

    .line 553
    .line 554
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 555
    .line 556
    .line 557
    const/high16 v17, 0x41800000    # 16.0f

    .line 558
    .line 559
    const/high16 v18, 0x40c00000    # 6.0f

    .line 560
    .line 561
    const/high16 v13, 0x41a00000    # 20.0f

    .line 562
    .line 563
    const v14, 0x4120a3d7    # 10.04f

    .line 564
    .line 565
    .line 566
    const v15, 0x41931eb8    # 18.39f

    .line 567
    .line 568
    .line 569
    const v16, 0x40ec28f6    # 7.38f

    .line 570
    .line 571
    .line 572
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 573
    .line 574
    .line 575
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 576
    .line 577
    .line 578
    const/high16 v0, 0x41980000    # 19.0f

    .line 579
    .line 580
    const/high16 v2, 0x41400000    # 12.0f

    .line 581
    .line 582
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 583
    .line 584
    .line 585
    const/high16 v17, -0x40000000    # -2.0f

    .line 586
    .line 587
    const v18, -0x4007ae14    # -1.94f

    .line 588
    .line 589
    .line 590
    const v13, -0x40733333    # -1.1f

    .line 591
    .line 592
    .line 593
    const/4 v14, 0x0

    .line 594
    const/high16 v15, -0x40000000    # -2.0f

    .line 595
    .line 596
    const v16, -0x40a147ae    # -0.87f

    .line 597
    .line 598
    .line 599
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 600
    .line 601
    .line 602
    const v17, 0x3f147ae1    # 0.58f

    .line 603
    .line 604
    .line 605
    const v18, -0x4051eb85    # -1.36f

    .line 606
    .line 607
    .line 608
    const/4 v13, 0x0

    .line 609
    const v14, -0x40fd70a4    # -0.51f

    .line 610
    .line 611
    .line 612
    const v15, 0x3e4ccccd    # 0.2f

    .line 613
    .line 614
    .line 615
    const v16, -0x40828f5c    # -0.99f

    .line 616
    .line 617
    .line 618
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 619
    .line 620
    .line 621
    const v0, 0x3fb5c28f    # 1.42f

    .line 622
    .line 623
    .line 624
    const v2, -0x404ccccd    # -1.4f

    .line 625
    .line 626
    .line 627
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 628
    .line 629
    .line 630
    const v0, 0x3fb70a3d    # 1.43f

    .line 631
    .line 632
    .line 633
    const v2, 0x3fb33333    # 1.4f

    .line 634
    .line 635
    .line 636
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 637
    .line 638
    .line 639
    const/high16 v17, 0x41600000    # 14.0f

    .line 640
    .line 641
    const v18, 0x41887ae1    # 17.06f

    .line 642
    .line 643
    .line 644
    const v13, 0x415ccccd    # 13.8f

    .line 645
    .line 646
    .line 647
    const v14, 0x41808f5c    # 16.07f

    .line 648
    .line 649
    .line 650
    const/high16 v15, 0x41600000    # 14.0f

    .line 651
    .line 652
    const v16, 0x41846666    # 16.55f

    .line 653
    .line 654
    .line 655
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 656
    .line 657
    .line 658
    const/high16 v17, 0x41400000    # 12.0f

    .line 659
    .line 660
    const/high16 v18, 0x41980000    # 19.0f

    .line 661
    .line 662
    const/high16 v13, 0x41600000    # 14.0f

    .line 663
    .line 664
    const v14, 0x41910a3d    # 18.13f

    .line 665
    .line 666
    .line 667
    const v15, 0x4151999a    # 13.1f

    .line 668
    .line 669
    .line 670
    const/high16 v16, 0x41980000    # 19.0f

    .line 671
    .line 672
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 673
    .line 674
    .line 675
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 676
    .line 677
    .line 678
    const/high16 v0, 0x418c0000    # 17.5f

    .line 679
    .line 680
    const v2, 0x417f5c29    # 15.96f

    .line 681
    .line 682
    .line 683
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 684
    .line 685
    .line 686
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 687
    .line 688
    .line 689
    const v17, -0x406f5c29    # -1.13f

    .line 690
    .line 691
    .line 692
    const v18, -0x3fb1eb85    # -3.22f

    .line 693
    .line 694
    .line 695
    const v13, 0x3d23d70a    # 0.04f

    .line 696
    .line 697
    .line 698
    const v14, -0x4147ae14    # -0.36f

    .line 699
    .line 700
    .line 701
    const v15, 0x3e6147ae    # 0.22f

    .line 702
    .line 703
    .line 704
    const v16, -0x400e147b    # -1.89f

    .line 705
    .line 706
    .line 707
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 708
    .line 709
    .line 710
    const/4 v0, 0x0

    .line 711
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 712
    .line 713
    .line 714
    const/high16 v0, 0x41380000    # 11.5f

    .line 715
    .line 716
    const/high16 v2, 0x41400000    # 12.0f

    .line 717
    .line 718
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 719
    .line 720
    .line 721
    const v0, -0x3fcae148    # -2.83f

    .line 722
    .line 723
    .line 724
    const v2, 0x4031eb85    # 2.78f

    .line 725
    .line 726
    .line 727
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 728
    .line 729
    .line 730
    const/4 v0, 0x0

    .line 731
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 732
    .line 733
    .line 734
    const v18, 0x404e147b    # 3.22f

    .line 735
    .line 736
    .line 737
    const v13, -0x4051eb85    # -1.36f

    .line 738
    .line 739
    .line 740
    const v14, 0x3fab851f    # 1.34f

    .line 741
    .line 742
    .line 743
    const v15, -0x406a3d71    # -1.17f

    .line 744
    .line 745
    .line 746
    const v16, 0x403851ec    # 2.88f

    .line 747
    .line 748
    .line 749
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 750
    .line 751
    .line 752
    const/high16 v17, 0x40c00000    # 6.0f

    .line 753
    .line 754
    const/high16 v18, 0x41500000    # 13.0f

    .line 755
    .line 756
    const v13, 0x40d947ae    # 6.79f

    .line 757
    .line 758
    .line 759
    const v14, 0x41833333    # 16.4f

    .line 760
    .line 761
    .line 762
    const/high16 v15, 0x40c00000    # 6.0f

    .line 763
    .line 764
    const v16, 0x416ca3d7    # 14.79f

    .line 765
    .line 766
    .line 767
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 768
    .line 769
    .line 770
    const v17, 0x4080f5c3    # 4.03f

    .line 771
    .line 772
    .line 773
    const/high16 v18, -0x3f180000    # -7.25f

    .line 774
    .line 775
    const/4 v13, 0x0

    .line 776
    const v14, -0x3fb5c28f    # -3.16f

    .line 777
    .line 778
    .line 779
    const v15, 0x400851ec    # 2.13f

    .line 780
    .line 781
    .line 782
    const v16, -0x3f4b3333    # -5.65f

    .line 783
    .line 784
    .line 785
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 786
    .line 787
    .line 788
    const v17, 0x407f5c29    # 3.99f

    .line 789
    .line 790
    .line 791
    const v18, 0x40633333    # 3.55f

    .line 792
    .line 793
    .line 794
    const v13, 0x3e6b851f    # 0.23f

    .line 795
    .line 796
    .line 797
    const v14, 0x3ffeb852    # 1.99f

    .line 798
    .line 799
    .line 800
    const v15, 0x3ff70a3d    # 1.93f

    .line 801
    .line 802
    .line 803
    const v16, 0x40633333    # 3.55f

    .line 804
    .line 805
    .line 806
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 807
    .line 808
    .line 809
    const v17, 0x400b851f    # 2.18f

    .line 810
    .line 811
    .line 812
    const v18, -0x40d70a3d    # -0.66f

    .line 813
    .line 814
    .line 815
    const v13, 0x3f47ae14    # 0.78f

    .line 816
    .line 817
    .line 818
    const/4 v14, 0x0

    .line 819
    const v15, 0x3fc51eb8    # 1.54f

    .line 820
    .line 821
    .line 822
    const v16, -0x41947ae1    # -0.23f

    .line 823
    .line 824
    .line 825
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 826
    .line 827
    .line 828
    const/high16 v17, 0x41900000    # 18.0f

    .line 829
    .line 830
    const/high16 v18, 0x41500000    # 13.0f

    .line 831
    .line 832
    const v13, 0x418ab852    # 17.34f

    .line 833
    .line 834
    .line 835
    const v14, 0x411c7ae1    # 9.78f

    .line 836
    .line 837
    .line 838
    const/high16 v15, 0x41900000    # 18.0f

    .line 839
    .line 840
    const v16, 0x4135999a    # 11.35f

    .line 841
    .line 842
    .line 843
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 844
    .line 845
    .line 846
    const v17, 0x417f5c29    # 15.96f

    .line 847
    .line 848
    .line 849
    const/high16 v18, 0x418c0000    # 17.5f

    .line 850
    .line 851
    const/high16 v13, 0x41900000    # 18.0f

    .line 852
    .line 853
    const v14, 0x416ca3d7    # 14.79f

    .line 854
    .line 855
    .line 856
    const v15, 0x4189ae14    # 17.21f

    .line 857
    .line 858
    .line 859
    const v16, 0x41833333    # 16.4f

    .line 860
    .line 861
    .line 862
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 863
    .line 864
    .line 865
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 866
    .line 867
    .line 868
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 869
    .line 870
    .line 871
    move-result-object v2

    .line 872
    const/16 v16, 0x3800

    .line 873
    .line 874
    const/16 v17, 0x0

    .line 875
    .line 876
    const/high16 v6, 0x3f800000    # 1.0f

    .line 877
    .line 878
    const/high16 v8, 0x3f800000    # 1.0f

    .line 879
    .line 880
    const/4 v7, 0x0

    .line 881
    const/high16 v12, 0x3f800000    # 1.0f

    .line 882
    .line 883
    const/4 v13, 0x0

    .line 884
    const/4 v14, 0x0

    .line 885
    const/4 v15, 0x0

    .line 886
    const-string v4, ""

    .line 887
    .line 888
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 889
    .line 890
    .line 891
    move-result-object v0

    .line 892
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 893
    .line 894
    .line 895
    move-result-object v0

    .line 896
    sput-object v0, Landroidx/compose/material/icons/twotone/LocalFireDepartmentKt;->_localFireDepartment:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 897
    .line 898
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 899
    .line 900
    .line 901
    return-object v0
.end method
