.class public final Landroidx/compose/material/icons/rounded/AlarmAddKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _alarmAdd:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getAlarmAdd(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/AlarmAddKt;->_alarmAdd:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.AlarmAdd"

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
    const/4 v0, 0x0

    .line 50
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 51
    .line 52
    .line 53
    sget-object v0, Landroidx/compose/ui/graphics/StrokeCap;->Companion:Landroidx/compose/ui/graphics/StrokeCap$Companion;

    .line 54
    .line 55
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 56
    .line 57
    .line 58
    move-result v10

    .line 59
    sget-object v0, Landroidx/compose/ui/graphics/StrokeJoin;->Companion:Landroidx/compose/ui/graphics/StrokeJoin$Companion;

    .line 60
    .line 61
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 62
    .line 63
    .line 64
    move-result v11

    .line 65
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 66
    .line 67
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 68
    .line 69
    .line 70
    const v0, 0x41a970a4    # 21.18f

    .line 71
    .line 72
    .line 73
    const v2, 0x40a051ec    # 5.01f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v0, 0x4190cccd    # 18.1f

    .line 80
    .line 81
    .line 82
    const v2, 0x401ccccd    # 2.45f

    .line 83
    .line 84
    .line 85
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 86
    .line 87
    .line 88
    const v17, -0x404b851f    # -1.41f

    .line 89
    .line 90
    .line 91
    const v18, 0x3e051eb8    # 0.13f

    .line 92
    .line 93
    .line 94
    const v13, -0x4128f5c3    # -0.42f

    .line 95
    .line 96
    .line 97
    const v14, -0x414ccccd    # -0.35f

    .line 98
    .line 99
    .line 100
    const v15, -0x4079999a    # -1.05f

    .line 101
    .line 102
    .line 103
    const v16, -0x41666666    # -0.3f

    .line 104
    .line 105
    .line 106
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 107
    .line 108
    .line 109
    const v17, 0x3e051eb8    # 0.13f

    .line 110
    .line 111
    .line 112
    const v18, 0x3fb47ae1    # 1.41f

    .line 113
    .line 114
    .line 115
    const v13, -0x414ccccd    # -0.35f

    .line 116
    .line 117
    .line 118
    const v14, 0x3ed70a3d    # 0.42f

    .line 119
    .line 120
    .line 121
    const v15, -0x416b851f    # -0.29f

    .line 122
    .line 123
    .line 124
    const v16, 0x3f866666    # 1.05f

    .line 125
    .line 126
    .line 127
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 128
    .line 129
    .line 130
    const v0, 0x4023d70a    # 2.56f

    .line 131
    .line 132
    .line 133
    const v2, 0x40447ae1    # 3.07f

    .line 134
    .line 135
    .line 136
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 137
    .line 138
    .line 139
    const v17, 0x3fb47ae1    # 1.41f

    .line 140
    .line 141
    .line 142
    const v18, -0x41fae148    # -0.13f

    .line 143
    .line 144
    .line 145
    const v13, 0x3ed70a3d    # 0.42f

    .line 146
    .line 147
    .line 148
    const v14, 0x3eb33333    # 0.35f

    .line 149
    .line 150
    .line 151
    const v15, 0x3f866666    # 1.05f

    .line 152
    .line 153
    .line 154
    const v16, 0x3e99999a    # 0.3f

    .line 155
    .line 156
    .line 157
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 158
    .line 159
    .line 160
    const v17, -0x420a3d71    # -0.12f

    .line 161
    .line 162
    .line 163
    const v18, -0x404b851f    # -1.41f

    .line 164
    .line 165
    .line 166
    const v13, 0x3eb851ec    # 0.36f

    .line 167
    .line 168
    .line 169
    const v14, -0x4128f5c3    # -0.42f

    .line 170
    .line 171
    .line 172
    const v15, 0x3e99999a    # 0.3f

    .line 173
    .line 174
    .line 175
    const v16, -0x4079999a    # -1.05f

    .line 176
    .line 177
    .line 178
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 179
    .line 180
    .line 181
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 182
    .line 183
    .line 184
    const v0, 0x40833333    # 4.1f

    .line 185
    .line 186
    .line 187
    const v2, 0x40d1999a    # 6.55f

    .line 188
    .line 189
    .line 190
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 191
    .line 192
    .line 193
    const v0, -0x3fdc28f6    # -2.56f

    .line 194
    .line 195
    .line 196
    const v2, 0x40447ae1    # 3.07f

    .line 197
    .line 198
    .line 199
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 200
    .line 201
    .line 202
    const v17, 0x3e051eb8    # 0.13f

    .line 203
    .line 204
    .line 205
    const v13, 0x3edc28f6    # 0.43f

    .line 206
    .line 207
    .line 208
    const v14, -0x4147ae14    # -0.36f

    .line 209
    .line 210
    .line 211
    const v15, 0x3efae148    # 0.49f

    .line 212
    .line 213
    .line 214
    const v16, -0x40828f5c    # -0.99f

    .line 215
    .line 216
    .line 217
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 218
    .line 219
    .line 220
    const v17, -0x404ccccd    # -1.4f

    .line 221
    .line 222
    .line 223
    const v18, -0x41fae148    # -0.13f

    .line 224
    .line 225
    .line 226
    const v13, -0x414ccccd    # -0.35f

    .line 227
    .line 228
    .line 229
    const v14, -0x4123d70a    # -0.43f

    .line 230
    .line 231
    .line 232
    const v15, -0x40851eb8    # -0.98f

    .line 233
    .line 234
    .line 235
    const v16, -0x410a3d71    # -0.48f

    .line 236
    .line 237
    .line 238
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 239
    .line 240
    .line 241
    const v0, 0x40347ae1    # 2.82f

    .line 242
    .line 243
    .line 244
    const v2, 0x40a051ec    # 5.01f

    .line 245
    .line 246
    .line 247
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 248
    .line 249
    .line 250
    const v17, -0x420a3d71    # -0.12f

    .line 251
    .line 252
    .line 253
    const v18, 0x3fb47ae1    # 1.41f

    .line 254
    .line 255
    .line 256
    const v13, -0x4128f5c3    # -0.42f

    .line 257
    .line 258
    .line 259
    const v14, 0x3eb851ec    # 0.36f

    .line 260
    .line 261
    .line 262
    const v15, -0x410a3d71    # -0.48f

    .line 263
    .line 264
    .line 265
    const v16, 0x3f7d70a4    # 0.99f

    .line 266
    .line 267
    .line 268
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 269
    .line 270
    .line 271
    const v17, 0x3fb33333    # 1.4f

    .line 272
    .line 273
    .line 274
    const v18, 0x3e051eb8    # 0.13f

    .line 275
    .line 276
    .line 277
    const v13, 0x3eb33333    # 0.35f

    .line 278
    .line 279
    .line 280
    const v14, 0x3edc28f6    # 0.43f

    .line 281
    .line 282
    .line 283
    const v15, 0x3f7ae148    # 0.98f

    .line 284
    .line 285
    .line 286
    const v16, 0x3ef5c28f    # 0.48f

    .line 287
    .line 288
    .line 289
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 290
    .line 291
    .line 292
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 293
    .line 294
    .line 295
    const/high16 v0, 0x40800000    # 4.0f

    .line 296
    .line 297
    const/high16 v2, 0x41400000    # 12.0f

    .line 298
    .line 299
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 300
    .line 301
    .line 302
    const/high16 v17, -0x3ef00000    # -9.0f

    .line 303
    .line 304
    const/high16 v18, 0x41100000    # 9.0f

    .line 305
    .line 306
    const v13, -0x3f60f5c3    # -4.97f

    .line 307
    .line 308
    .line 309
    const/4 v14, 0x0

    .line 310
    const/high16 v15, -0x3ef00000    # -9.0f

    .line 311
    .line 312
    const v16, 0x4080f5c3    # 4.03f

    .line 313
    .line 314
    .line 315
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 316
    .line 317
    .line 318
    const v0, 0x4080f5c3    # 4.03f

    .line 319
    .line 320
    .line 321
    const/high16 v2, 0x41100000    # 9.0f

    .line 322
    .line 323
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 324
    .line 325
    .line 326
    const v0, -0x3f7f0a3d    # -4.03f

    .line 327
    .line 328
    .line 329
    const/high16 v2, -0x3ef00000    # -9.0f

    .line 330
    .line 331
    const/high16 v4, 0x41100000    # 9.0f

    .line 332
    .line 333
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 334
    .line 335
    .line 336
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 337
    .line 338
    .line 339
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 340
    .line 341
    .line 342
    const/high16 v0, 0x41a00000    # 20.0f

    .line 343
    .line 344
    const/high16 v2, 0x41400000    # 12.0f

    .line 345
    .line 346
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 347
    .line 348
    .line 349
    const/high16 v17, -0x3f200000    # -7.0f

    .line 350
    .line 351
    const/high16 v18, -0x3f200000    # -7.0f

    .line 352
    .line 353
    const v13, -0x3f88f5c3    # -3.86f

    .line 354
    .line 355
    .line 356
    const/high16 v15, -0x3f200000    # -7.0f

    .line 357
    .line 358
    const v16, -0x3fb70a3d    # -3.14f

    .line 359
    .line 360
    .line 361
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 362
    .line 363
    .line 364
    const v0, 0x4048f5c3    # 3.14f

    .line 365
    .line 366
    .line 367
    const/high16 v2, -0x3f200000    # -7.0f

    .line 368
    .line 369
    const/high16 v4, 0x40e00000    # 7.0f

    .line 370
    .line 371
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 372
    .line 373
    .line 374
    const/high16 v2, 0x40e00000    # 7.0f

    .line 375
    .line 376
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 377
    .line 378
    .line 379
    const v0, -0x3fb70a3d    # -3.14f

    .line 380
    .line 381
    .line 382
    const/high16 v2, -0x3f200000    # -7.0f

    .line 383
    .line 384
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 385
    .line 386
    .line 387
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 388
    .line 389
    .line 390
    const/high16 v0, 0x41700000    # 15.0f

    .line 391
    .line 392
    const/high16 v2, 0x41400000    # 12.0f

    .line 393
    .line 394
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 395
    .line 396
    .line 397
    const/high16 v0, -0x40000000    # -2.0f

    .line 398
    .line 399
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 400
    .line 401
    .line 402
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 403
    .line 404
    .line 405
    const/high16 v17, -0x40800000    # -1.0f

    .line 406
    .line 407
    const/high16 v18, -0x40800000    # -1.0f

    .line 408
    .line 409
    const/4 v13, 0x0

    .line 410
    const v14, -0x40f33333    # -0.55f

    .line 411
    .line 412
    .line 413
    const v15, -0x4119999a    # -0.45f

    .line 414
    .line 415
    .line 416
    const/high16 v16, -0x40800000    # -1.0f

    .line 417
    .line 418
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 419
    .line 420
    .line 421
    const v0, 0x3ee66666    # 0.45f

    .line 422
    .line 423
    .line 424
    const/high16 v2, 0x3f800000    # 1.0f

    .line 425
    .line 426
    const/high16 v4, -0x40800000    # -1.0f

    .line 427
    .line 428
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 429
    .line 430
    .line 431
    const/high16 v0, 0x40000000    # 2.0f

    .line 432
    .line 433
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 434
    .line 435
    .line 436
    const/high16 v0, 0x41400000    # 12.0f

    .line 437
    .line 438
    const/high16 v2, 0x41100000    # 9.0f

    .line 439
    .line 440
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 441
    .line 442
    .line 443
    const/high16 v18, 0x3f800000    # 1.0f

    .line 444
    .line 445
    const v13, -0x40f33333    # -0.55f

    .line 446
    .line 447
    .line 448
    const/4 v14, 0x0

    .line 449
    const/high16 v15, -0x40800000    # -1.0f

    .line 450
    .line 451
    const v16, 0x3ee66666    # 0.45f

    .line 452
    .line 453
    .line 454
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 455
    .line 456
    .line 457
    const v0, 0x3ee66666    # 0.45f

    .line 458
    .line 459
    .line 460
    const/high16 v2, 0x3f800000    # 1.0f

    .line 461
    .line 462
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 463
    .line 464
    .line 465
    const/high16 v0, 0x40000000    # 2.0f

    .line 466
    .line 467
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 468
    .line 469
    .line 470
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 471
    .line 472
    .line 473
    const/high16 v17, 0x3f800000    # 1.0f

    .line 474
    .line 475
    const/4 v13, 0x0

    .line 476
    const v14, 0x3f0ccccd    # 0.55f

    .line 477
    .line 478
    .line 479
    const v15, 0x3ee66666    # 0.45f

    .line 480
    .line 481
    .line 482
    const/high16 v16, 0x3f800000    # 1.0f

    .line 483
    .line 484
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 485
    .line 486
    .line 487
    const v0, -0x4119999a    # -0.45f

    .line 488
    .line 489
    .line 490
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 491
    .line 492
    .line 493
    const/high16 v0, -0x40000000    # -2.0f

    .line 494
    .line 495
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 496
    .line 497
    .line 498
    const/high16 v0, 0x40000000    # 2.0f

    .line 499
    .line 500
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 501
    .line 502
    .line 503
    const/high16 v18, -0x40800000    # -1.0f

    .line 504
    .line 505
    const v13, 0x3f0ccccd    # 0.55f

    .line 506
    .line 507
    .line 508
    const/4 v14, 0x0

    .line 509
    const/high16 v15, 0x3f800000    # 1.0f

    .line 510
    .line 511
    const v16, -0x4119999a    # -0.45f

    .line 512
    .line 513
    .line 514
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 515
    .line 516
    .line 517
    const v0, -0x4119999a    # -0.45f

    .line 518
    .line 519
    .line 520
    const/high16 v2, -0x40800000    # -1.0f

    .line 521
    .line 522
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 523
    .line 524
    .line 525
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 526
    .line 527
    .line 528
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 529
    .line 530
    .line 531
    move-result-object v2

    .line 532
    const/16 v16, 0x3800

    .line 533
    .line 534
    const/16 v17, 0x0

    .line 535
    .line 536
    const/high16 v6, 0x3f800000    # 1.0f

    .line 537
    .line 538
    const/high16 v8, 0x3f800000    # 1.0f

    .line 539
    .line 540
    const/4 v7, 0x0

    .line 541
    const/high16 v9, 0x3f800000    # 1.0f

    .line 542
    .line 543
    const/high16 v12, 0x3f800000    # 1.0f

    .line 544
    .line 545
    const/4 v13, 0x0

    .line 546
    const/4 v15, 0x0

    .line 547
    const-string v4, ""

    .line 548
    .line 549
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 550
    .line 551
    .line 552
    move-result-object v0

    .line 553
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 554
    .line 555
    .line 556
    move-result-object v0

    .line 557
    sput-object v0, Landroidx/compose/material/icons/rounded/AlarmAddKt;->_alarmAdd:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 558
    .line 559
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 560
    .line 561
    .line 562
    return-object v0
.end method
