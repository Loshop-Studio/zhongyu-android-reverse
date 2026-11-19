.class public final Landroidx/compose/material/icons/rounded/SystemUpdateAltKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _systemUpdateAlt:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getSystemUpdateAlt(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/SystemUpdateAltKt;->_systemUpdateAlt:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.SystemUpdateAlt"

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
    const v0, 0x4145999a    # 12.35f

    .line 71
    .line 72
    .line 73
    const v2, 0x417a6666    # 15.65f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v0, -0x3fcd70a4    # -2.79f

    .line 80
    .line 81
    .line 82
    const v2, 0x40328f5c    # 2.79f

    .line 83
    .line 84
    .line 85
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 86
    .line 87
    .line 88
    const v17, -0x414ccccd    # -0.35f

    .line 89
    .line 90
    .line 91
    const v18, -0x40a66666    # -0.85f

    .line 92
    .line 93
    .line 94
    const v13, 0x3e9eb852    # 0.31f

    .line 95
    .line 96
    .line 97
    const v14, -0x416147ae    # -0.31f

    .line 98
    .line 99
    .line 100
    const v15, 0x3db851ec    # 0.09f

    .line 101
    .line 102
    .line 103
    const v16, -0x40a66666    # -0.85f

    .line 104
    .line 105
    .line 106
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 107
    .line 108
    .line 109
    const/high16 v0, 0x41500000    # 13.0f

    .line 110
    .line 111
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 112
    .line 113
    .line 114
    const/high16 v0, 0x40800000    # 4.0f

    .line 115
    .line 116
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 117
    .line 118
    .line 119
    const/high16 v17, -0x40800000    # -1.0f

    .line 120
    .line 121
    const/high16 v18, -0x40800000    # -1.0f

    .line 122
    .line 123
    const/4 v13, 0x0

    .line 124
    const v14, -0x40f33333    # -0.55f

    .line 125
    .line 126
    .line 127
    const v15, -0x4119999a    # -0.45f

    .line 128
    .line 129
    .line 130
    const/high16 v16, -0x40800000    # -1.0f

    .line 131
    .line 132
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 133
    .line 134
    .line 135
    const v0, 0x3ee66666    # 0.45f

    .line 136
    .line 137
    .line 138
    const/high16 v2, 0x3f800000    # 1.0f

    .line 139
    .line 140
    const/high16 v4, -0x40800000    # -1.0f

    .line 141
    .line 142
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 143
    .line 144
    .line 145
    const/high16 v0, 0x41000000    # 8.0f

    .line 146
    .line 147
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 148
    .line 149
    .line 150
    const v0, 0x41135c29    # 9.21f

    .line 151
    .line 152
    .line 153
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 154
    .line 155
    .line 156
    const v17, -0x414ccccd    # -0.35f

    .line 157
    .line 158
    .line 159
    const v18, 0x3f59999a    # 0.85f

    .line 160
    .line 161
    .line 162
    const v13, -0x4119999a    # -0.45f

    .line 163
    .line 164
    .line 165
    const/4 v14, 0x0

    .line 166
    const v15, -0x40d47ae1    # -0.67f

    .line 167
    .line 168
    .line 169
    const v16, 0x3f0a3d71    # 0.54f

    .line 170
    .line 171
    .line 172
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 173
    .line 174
    .line 175
    const v0, 0x40328f5c    # 2.79f

    .line 176
    .line 177
    .line 178
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 179
    .line 180
    .line 181
    const v17, 0x3f333333    # 0.7f

    .line 182
    .line 183
    .line 184
    const v18, 0x3c23d70a    # 0.01f

    .line 185
    .line 186
    .line 187
    const v13, 0x3e428f5c    # 0.19f

    .line 188
    .line 189
    .line 190
    const v14, 0x3e4ccccd    # 0.2f

    .line 191
    .line 192
    .line 193
    const v15, 0x3f028f5c    # 0.51f

    .line 194
    .line 195
    .line 196
    const v16, 0x3e4ccccd    # 0.2f

    .line 197
    .line 198
    .line 199
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 200
    .line 201
    .line 202
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 203
    .line 204
    .line 205
    const/high16 v0, 0x41a80000    # 21.0f

    .line 206
    .line 207
    const/high16 v2, 0x40400000    # 3.0f

    .line 208
    .line 209
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 210
    .line 211
    .line 212
    const v0, -0x3f5fae14    # -5.01f

    .line 213
    .line 214
    .line 215
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 216
    .line 217
    .line 218
    const v17, -0x40828f5c    # -0.99f

    .line 219
    .line 220
    .line 221
    const v18, 0x3f7d70a4    # 0.99f

    .line 222
    .line 223
    .line 224
    const v13, -0x40f5c28f    # -0.54f

    .line 225
    .line 226
    .line 227
    const/4 v14, 0x0

    .line 228
    const v15, -0x40828f5c    # -0.99f

    .line 229
    .line 230
    .line 231
    const v16, 0x3ee66666    # 0.45f

    .line 232
    .line 233
    .line 234
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 235
    .line 236
    .line 237
    const v17, 0x3f7d70a4    # 0.99f

    .line 238
    .line 239
    .line 240
    const/4 v13, 0x0

    .line 241
    const v14, 0x3f0ccccd    # 0.55f

    .line 242
    .line 243
    .line 244
    const v15, 0x3ee66666    # 0.45f

    .line 245
    .line 246
    .line 247
    const v16, 0x3f7d70a4    # 0.99f

    .line 248
    .line 249
    .line 250
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 251
    .line 252
    .line 253
    const/high16 v0, 0x41a00000    # 20.0f

    .line 254
    .line 255
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 256
    .line 257
    .line 258
    const/high16 v17, 0x3f800000    # 1.0f

    .line 259
    .line 260
    const/high16 v18, 0x3f800000    # 1.0f

    .line 261
    .line 262
    const v13, 0x3f0ccccd    # 0.55f

    .line 263
    .line 264
    .line 265
    const/4 v14, 0x0

    .line 266
    const/high16 v15, 0x3f800000    # 1.0f

    .line 267
    .line 268
    const v16, 0x3ee66666    # 0.45f

    .line 269
    .line 270
    .line 271
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 272
    .line 273
    .line 274
    const v0, 0x41407ae1    # 12.03f

    .line 275
    .line 276
    .line 277
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 278
    .line 279
    .line 280
    const/high16 v17, -0x40800000    # -1.0f

    .line 281
    .line 282
    const/4 v13, 0x0

    .line 283
    const v14, 0x3f0ccccd    # 0.55f

    .line 284
    .line 285
    .line 286
    const v15, -0x4119999a    # -0.45f

    .line 287
    .line 288
    .line 289
    const/high16 v16, 0x3f800000    # 1.0f

    .line 290
    .line 291
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 292
    .line 293
    .line 294
    const/high16 v0, 0x40800000    # 4.0f

    .line 295
    .line 296
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 297
    .line 298
    .line 299
    const/high16 v18, -0x40800000    # -1.0f

    .line 300
    .line 301
    const v13, -0x40f33333    # -0.55f

    .line 302
    .line 303
    .line 304
    const/4 v14, 0x0

    .line 305
    const/high16 v15, -0x40800000    # -1.0f

    .line 306
    .line 307
    const v16, -0x4119999a    # -0.45f

    .line 308
    .line 309
    .line 310
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 311
    .line 312
    .line 313
    const v0, 0x40bfae14    # 5.99f

    .line 314
    .line 315
    .line 316
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 317
    .line 318
    .line 319
    const/high16 v17, 0x3f800000    # 1.0f

    .line 320
    .line 321
    const/4 v13, 0x0

    .line 322
    const v14, -0x40f33333    # -0.55f

    .line 323
    .line 324
    .line 325
    const v15, 0x3ee66666    # 0.45f

    .line 326
    .line 327
    .line 328
    const/high16 v16, -0x40800000    # -1.0f

    .line 329
    .line 330
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 331
    .line 332
    .line 333
    const v0, 0x408051ec    # 4.01f

    .line 334
    .line 335
    .line 336
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 337
    .line 338
    .line 339
    const v17, 0x3f7d70a4    # 0.99f

    .line 340
    .line 341
    .line 342
    const v18, -0x40828f5c    # -0.99f

    .line 343
    .line 344
    .line 345
    const v13, 0x3f0a3d71    # 0.54f

    .line 346
    .line 347
    .line 348
    const/4 v14, 0x0

    .line 349
    const v15, 0x3f7d70a4    # 0.99f

    .line 350
    .line 351
    .line 352
    const v16, -0x4119999a    # -0.45f

    .line 353
    .line 354
    .line 355
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 356
    .line 357
    .line 358
    const v17, -0x40828f5c    # -0.99f

    .line 359
    .line 360
    .line 361
    const/high16 v18, -0x40800000    # -1.0f

    .line 362
    .line 363
    const/4 v13, 0x0

    .line 364
    const v14, -0x40f33333    # -0.55f

    .line 365
    .line 366
    .line 367
    const v15, -0x4119999a    # -0.45f

    .line 368
    .line 369
    .line 370
    const/high16 v16, -0x40800000    # -1.0f

    .line 371
    .line 372
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 373
    .line 374
    .line 375
    const/high16 v0, 0x40400000    # 3.0f

    .line 376
    .line 377
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 378
    .line 379
    .line 380
    const/high16 v17, -0x40000000    # -2.0f

    .line 381
    .line 382
    const/high16 v18, 0x40000000    # 2.0f

    .line 383
    .line 384
    const v13, -0x40733333    # -1.1f

    .line 385
    .line 386
    .line 387
    const/4 v14, 0x0

    .line 388
    const/high16 v15, -0x40000000    # -2.0f

    .line 389
    .line 390
    const v16, 0x3f666666    # 0.9f

    .line 391
    .line 392
    .line 393
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 394
    .line 395
    .line 396
    const/high16 v0, 0x41600000    # 14.0f

    .line 397
    .line 398
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 399
    .line 400
    .line 401
    const/high16 v17, 0x40000000    # 2.0f

    .line 402
    .line 403
    const/4 v13, 0x0

    .line 404
    const v14, 0x3f8ccccd    # 1.1f

    .line 405
    .line 406
    .line 407
    const v15, 0x3f666666    # 0.9f

    .line 408
    .line 409
    .line 410
    const/high16 v16, 0x40000000    # 2.0f

    .line 411
    .line 412
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 413
    .line 414
    .line 415
    const/high16 v0, 0x41900000    # 18.0f

    .line 416
    .line 417
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 418
    .line 419
    .line 420
    const/high16 v18, -0x40000000    # -2.0f

    .line 421
    .line 422
    const v13, 0x3f8ccccd    # 1.1f

    .line 423
    .line 424
    .line 425
    const/4 v14, 0x0

    .line 426
    const/high16 v15, 0x40000000    # 2.0f

    .line 427
    .line 428
    const v16, -0x4099999a    # -0.9f

    .line 429
    .line 430
    .line 431
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 432
    .line 433
    .line 434
    const/high16 v0, 0x40a00000    # 5.0f

    .line 435
    .line 436
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 437
    .line 438
    .line 439
    const/high16 v17, -0x40000000    # -2.0f

    .line 440
    .line 441
    const/4 v13, 0x0

    .line 442
    const v14, -0x40733333    # -1.1f

    .line 443
    .line 444
    .line 445
    const v15, -0x4099999a    # -0.9f

    .line 446
    .line 447
    .line 448
    const/high16 v16, -0x40000000    # -2.0f

    .line 449
    .line 450
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 451
    .line 452
    .line 453
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 454
    .line 455
    .line 456
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 457
    .line 458
    .line 459
    move-result-object v2

    .line 460
    const/16 v16, 0x3800

    .line 461
    .line 462
    const/16 v17, 0x0

    .line 463
    .line 464
    const/high16 v6, 0x3f800000    # 1.0f

    .line 465
    .line 466
    const/high16 v8, 0x3f800000    # 1.0f

    .line 467
    .line 468
    const/4 v7, 0x0

    .line 469
    const/high16 v9, 0x3f800000    # 1.0f

    .line 470
    .line 471
    const/high16 v12, 0x3f800000    # 1.0f

    .line 472
    .line 473
    const/4 v14, 0x0

    .line 474
    const/4 v15, 0x0

    .line 475
    const-string v4, ""

    .line 476
    .line 477
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 478
    .line 479
    .line 480
    move-result-object v0

    .line 481
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 482
    .line 483
    .line 484
    move-result-object v0

    .line 485
    sput-object v0, Landroidx/compose/material/icons/rounded/SystemUpdateAltKt;->_systemUpdateAlt:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 486
    .line 487
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 488
    .line 489
    .line 490
    return-object v0
.end method
