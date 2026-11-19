.class public final Landroidx/compose/material/icons/rounded/GpsOffKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _gpsOff:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getGpsOff(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/GpsOffKt;->_gpsOff:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.GpsOff"

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
    const/high16 v0, 0x41500000    # 13.0f

    .line 71
    .line 72
    const/high16 v2, 0x41b00000    # 22.0f

    .line 73
    .line 74
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v17, 0x3f800000    # 1.0f

    .line 78
    .line 79
    const/high16 v18, -0x40800000    # -1.0f

    .line 80
    .line 81
    const v13, 0x3f0ccccd    # 0.55f

    .line 82
    .line 83
    .line 84
    const/4 v14, 0x0

    .line 85
    const/high16 v15, 0x3f800000    # 1.0f

    .line 86
    .line 87
    const v16, -0x4119999a    # -0.45f

    .line 88
    .line 89
    .line 90
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 91
    .line 92
    .line 93
    const v0, -0x4119999a    # -0.45f

    .line 94
    .line 95
    .line 96
    const/high16 v2, -0x40800000    # -1.0f

    .line 97
    .line 98
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 99
    .line 100
    .line 101
    const v0, -0x407851ec    # -1.06f

    .line 102
    .line 103
    .line 104
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 105
    .line 106
    .line 107
    const v17, -0x3f01eb85    # -7.94f

    .line 108
    .line 109
    .line 110
    const v18, -0x3f01eb85    # -7.94f

    .line 111
    .line 112
    .line 113
    const v13, -0x41147ae1    # -0.46f

    .line 114
    .line 115
    .line 116
    const v14, -0x3f7a8f5c    # -4.17f

    .line 117
    .line 118
    .line 119
    const v15, -0x3f8eb852    # -3.77f

    .line 120
    .line 121
    .line 122
    const v16, -0x3f10a3d7    # -7.48f

    .line 123
    .line 124
    .line 125
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 126
    .line 127
    .line 128
    const/high16 v0, 0x40000000    # 2.0f

    .line 129
    .line 130
    const/high16 v2, 0x41500000    # 13.0f

    .line 131
    .line 132
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 133
    .line 134
    .line 135
    const/high16 v17, -0x40800000    # -1.0f

    .line 136
    .line 137
    const/high16 v18, -0x40800000    # -1.0f

    .line 138
    .line 139
    const/4 v13, 0x0

    .line 140
    const v14, -0x40f33333    # -0.55f

    .line 141
    .line 142
    .line 143
    const v15, -0x4119999a    # -0.45f

    .line 144
    .line 145
    .line 146
    const/high16 v16, -0x40800000    # -1.0f

    .line 147
    .line 148
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 149
    .line 150
    .line 151
    const v0, 0x3ee66666    # 0.45f

    .line 152
    .line 153
    .line 154
    const/high16 v2, 0x3f800000    # 1.0f

    .line 155
    .line 156
    const/high16 v4, -0x40800000    # -1.0f

    .line 157
    .line 158
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 159
    .line 160
    .line 161
    const v0, 0x3f87ae14    # 1.06f

    .line 162
    .line 163
    .line 164
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 165
    .line 166
    .line 167
    const v17, -0x3fceb852    # -2.77f

    .line 168
    .line 169
    .line 170
    const v18, 0x3f47ae14    # 0.78f

    .line 171
    .line 172
    .line 173
    const v13, -0x40851eb8    # -0.98f

    .line 174
    .line 175
    .line 176
    const v14, 0x3de147ae    # 0.11f

    .line 177
    .line 178
    .line 179
    const v15, -0x400b851f    # -1.91f

    .line 180
    .line 181
    .line 182
    const v16, 0x3ec28f5c    # 0.38f

    .line 183
    .line 184
    .line 185
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 186
    .line 187
    .line 188
    const v0, 0x3fc3d70a    # 1.53f

    .line 189
    .line 190
    .line 191
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 192
    .line 193
    .line 194
    const/high16 v17, 0x41400000    # 12.0f

    .line 195
    .line 196
    const/high16 v18, 0x40a00000    # 5.0f

    .line 197
    .line 198
    const v13, 0x41275c29    # 10.46f

    .line 199
    .line 200
    .line 201
    const v14, 0x40a428f6    # 5.13f

    .line 202
    .line 203
    .line 204
    const v15, 0x4133851f    # 11.22f

    .line 205
    .line 206
    .line 207
    const/high16 v16, 0x40a00000    # 5.0f

    .line 208
    .line 209
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 210
    .line 211
    .line 212
    const/high16 v17, 0x40e00000    # 7.0f

    .line 213
    .line 214
    const/high16 v18, 0x40e00000    # 7.0f

    .line 215
    .line 216
    const v13, 0x4077ae14    # 3.87f

    .line 217
    .line 218
    .line 219
    const/4 v14, 0x0

    .line 220
    const/high16 v15, 0x40e00000    # 7.0f

    .line 221
    .line 222
    const v16, 0x404851ec    # 3.13f

    .line 223
    .line 224
    .line 225
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 226
    .line 227
    .line 228
    const v17, -0x41428f5c    # -0.37f

    .line 229
    .line 230
    .line 231
    const v18, 0x400f5c29    # 2.24f

    .line 232
    .line 233
    .line 234
    const/4 v13, 0x0

    .line 235
    const v14, 0x3f4a3d71    # 0.79f

    .line 236
    .line 237
    .line 238
    const v15, -0x41fae148    # -0.13f

    .line 239
    .line 240
    .line 241
    const v16, 0x3fc51eb8    # 1.54f

    .line 242
    .line 243
    .line 244
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 245
    .line 246
    .line 247
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 248
    .line 249
    .line 250
    const v17, 0x3f47ae14    # 0.78f

    .line 251
    .line 252
    .line 253
    const v18, -0x3fceb852    # -2.77f

    .line 254
    .line 255
    .line 256
    const v13, 0x3ecccccd    # 0.4f

    .line 257
    .line 258
    .line 259
    const v14, -0x40a3d70a    # -0.86f

    .line 260
    .line 261
    .line 262
    const v15, 0x3f2b851f    # 0.67f

    .line 263
    .line 264
    .line 265
    const v16, -0x401ae148    # -1.79f

    .line 266
    .line 267
    .line 268
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 269
    .line 270
    .line 271
    const/high16 v0, 0x41500000    # 13.0f

    .line 272
    .line 273
    const/high16 v2, 0x41b00000    # 22.0f

    .line 274
    .line 275
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 276
    .line 277
    .line 278
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 279
    .line 280
    .line 281
    const v0, 0x41a3851f    # 20.44f

    .line 282
    .line 283
    .line 284
    const v2, 0x41970a3d    # 18.88f

    .line 285
    .line 286
    .line 287
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 288
    .line 289
    .line 290
    const v0, 0x40a3d70a    # 5.12f

    .line 291
    .line 292
    .line 293
    const v2, 0x4063d70a    # 3.56f

    .line 294
    .line 295
    .line 296
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 297
    .line 298
    .line 299
    const v17, -0x404b851f    # -1.41f

    .line 300
    .line 301
    .line 302
    const/16 v18, 0x0

    .line 303
    .line 304
    const v13, -0x413851ec    # -0.39f

    .line 305
    .line 306
    .line 307
    const v14, -0x413851ec    # -0.39f

    .line 308
    .line 309
    .line 310
    const v15, -0x407d70a4    # -1.02f

    .line 311
    .line 312
    .line 313
    const v16, -0x413851ec    # -0.39f

    .line 314
    .line 315
    .line 316
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 317
    .line 318
    .line 319
    const/16 v17, 0x0

    .line 320
    .line 321
    const v18, 0x3fb47ae1    # 1.41f

    .line 322
    .line 323
    .line 324
    const v14, 0x3ec7ae14    # 0.39f

    .line 325
    .line 326
    .line 327
    const v15, -0x413851ec    # -0.39f

    .line 328
    .line 329
    .line 330
    const v16, 0x3f828f5c    # 1.02f

    .line 331
    .line 332
    .line 333
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 334
    .line 335
    .line 336
    const v0, 0x40a147ae    # 5.04f

    .line 337
    .line 338
    .line 339
    const v2, 0x40c9999a    # 6.3f

    .line 340
    .line 341
    .line 342
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 343
    .line 344
    .line 345
    const v17, 0x4043d70a    # 3.06f

    .line 346
    .line 347
    .line 348
    const/high16 v18, 0x41300000    # 11.0f

    .line 349
    .line 350
    const v13, 0x407e147b    # 3.97f

    .line 351
    .line 352
    .line 353
    const v14, 0x40f3d70a    # 7.62f

    .line 354
    .line 355
    .line 356
    const v15, 0x4050a3d7    # 3.26f

    .line 357
    .line 358
    .line 359
    const v16, 0x4113ae14    # 9.23f

    .line 360
    .line 361
    .line 362
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 363
    .line 364
    .line 365
    const/high16 v0, 0x41300000    # 11.0f

    .line 366
    .line 367
    const/high16 v2, 0x40000000    # 2.0f

    .line 368
    .line 369
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 370
    .line 371
    .line 372
    const/high16 v17, -0x40800000    # -1.0f

    .line 373
    .line 374
    const/high16 v18, 0x3f800000    # 1.0f

    .line 375
    .line 376
    const v13, -0x40f33333    # -0.55f

    .line 377
    .line 378
    .line 379
    const/4 v14, 0x0

    .line 380
    const/high16 v15, -0x40800000    # -1.0f

    .line 381
    .line 382
    const v16, 0x3ee66666    # 0.45f

    .line 383
    .line 384
    .line 385
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 386
    .line 387
    .line 388
    const v0, 0x3ee66666    # 0.45f

    .line 389
    .line 390
    .line 391
    const/high16 v2, 0x3f800000    # 1.0f

    .line 392
    .line 393
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 394
    .line 395
    .line 396
    const v0, 0x3f87ae14    # 1.06f

    .line 397
    .line 398
    .line 399
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 400
    .line 401
    .line 402
    const v17, 0x40fe147b    # 7.94f

    .line 403
    .line 404
    .line 405
    const v18, 0x40fe147b    # 7.94f

    .line 406
    .line 407
    .line 408
    const v13, 0x3eeb851f    # 0.46f

    .line 409
    .line 410
    .line 411
    const v14, 0x408570a4    # 4.17f

    .line 412
    .line 413
    .line 414
    const v15, 0x407147ae    # 3.77f

    .line 415
    .line 416
    .line 417
    const v16, 0x40ef5c29    # 7.48f

    .line 418
    .line 419
    .line 420
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 421
    .line 422
    .line 423
    const/high16 v0, 0x41300000    # 11.0f

    .line 424
    .line 425
    const/high16 v2, 0x41b00000    # 22.0f

    .line 426
    .line 427
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 428
    .line 429
    .line 430
    const/high16 v17, 0x3f800000    # 1.0f

    .line 431
    .line 432
    const/high16 v18, 0x3f800000    # 1.0f

    .line 433
    .line 434
    const/4 v13, 0x0

    .line 435
    const v14, 0x3f0ccccd    # 0.55f

    .line 436
    .line 437
    .line 438
    const v15, 0x3ee66666    # 0.45f

    .line 439
    .line 440
    .line 441
    const/high16 v16, 0x3f800000    # 1.0f

    .line 442
    .line 443
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 444
    .line 445
    .line 446
    const v0, -0x4119999a    # -0.45f

    .line 447
    .line 448
    .line 449
    const/high16 v2, 0x3f800000    # 1.0f

    .line 450
    .line 451
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 452
    .line 453
    .line 454
    const v0, -0x407851ec    # -1.06f

    .line 455
    .line 456
    .line 457
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 458
    .line 459
    .line 460
    const v17, 0x4096147b    # 4.69f

    .line 461
    .line 462
    .line 463
    const v18, -0x40028f5c    # -1.98f

    .line 464
    .line 465
    .line 466
    const v13, 0x3fe28f5c    # 1.77f

    .line 467
    .line 468
    .line 469
    const v14, -0x41b33333    # -0.2f

    .line 470
    .line 471
    .line 472
    const v15, 0x405851ec    # 3.38f

    .line 473
    .line 474
    .line 475
    const v16, -0x40970a3d    # -0.91f

    .line 476
    .line 477
    .line 478
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 479
    .line 480
    .line 481
    const v0, 0x3faa3d71    # 1.33f

    .line 482
    .line 483
    .line 484
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 485
    .line 486
    .line 487
    const v17, 0x3fb47ae1    # 1.41f

    .line 488
    .line 489
    .line 490
    const/16 v18, 0x0

    .line 491
    .line 492
    const v13, 0x3ec7ae14    # 0.39f

    .line 493
    .line 494
    .line 495
    const v14, 0x3ec7ae14    # 0.39f

    .line 496
    .line 497
    .line 498
    const v15, 0x3f828f5c    # 1.02f

    .line 499
    .line 500
    .line 501
    const v16, 0x3ec7ae14    # 0.39f

    .line 502
    .line 503
    .line 504
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 505
    .line 506
    .line 507
    const v17, 0x3c23d70a    # 0.01f

    .line 508
    .line 509
    .line 510
    const v18, -0x404b851f    # -1.41f

    .line 511
    .line 512
    .line 513
    const v13, 0x3ecccccd    # 0.4f

    .line 514
    .line 515
    .line 516
    const v14, -0x413851ec    # -0.39f

    .line 517
    .line 518
    .line 519
    const v15, 0x3ecccccd    # 0.4f

    .line 520
    .line 521
    .line 522
    const v16, -0x407d70a4    # -1.02f

    .line 523
    .line 524
    .line 525
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 526
    .line 527
    .line 528
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 529
    .line 530
    .line 531
    const/high16 v0, 0x41400000    # 12.0f

    .line 532
    .line 533
    const/high16 v2, 0x41980000    # 19.0f

    .line 534
    .line 535
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 536
    .line 537
    .line 538
    const/high16 v17, -0x3f200000    # -7.0f

    .line 539
    .line 540
    const/high16 v18, -0x3f200000    # -7.0f

    .line 541
    .line 542
    const v13, -0x3f8851ec    # -3.87f

    .line 543
    .line 544
    .line 545
    const/4 v14, 0x0

    .line 546
    const/high16 v15, -0x3f200000    # -7.0f

    .line 547
    .line 548
    const v16, -0x3fb7ae14    # -3.13f

    .line 549
    .line 550
    .line 551
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 552
    .line 553
    .line 554
    const v17, 0x3fbae148    # 1.46f

    .line 555
    .line 556
    .line 557
    const v18, -0x3f775c29    # -4.27f

    .line 558
    .line 559
    .line 560
    const/4 v13, 0x0

    .line 561
    const v14, -0x4031eb85    # -1.61f

    .line 562
    .line 563
    .line 564
    const v15, 0x3f0ccccd    # 0.55f

    .line 565
    .line 566
    .line 567
    const v16, -0x3fba3d71    # -3.09f

    .line 568
    .line 569
    .line 570
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 571
    .line 572
    .line 573
    const v0, 0x411cf5c3    # 9.81f

    .line 574
    .line 575
    .line 576
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 577
    .line 578
    .line 579
    const/high16 v17, 0x41400000    # 12.0f

    .line 580
    .line 581
    const/high16 v18, 0x41980000    # 19.0f

    .line 582
    .line 583
    const v13, 0x417170a4    # 15.09f

    .line 584
    .line 585
    .line 586
    const v14, 0x4193999a    # 18.45f

    .line 587
    .line 588
    .line 589
    const v15, 0x4159c28f    # 13.61f

    .line 590
    .line 591
    .line 592
    const/high16 v16, 0x41980000    # 19.0f

    .line 593
    .line 594
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

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
    const/high16 v9, 0x3f800000    # 1.0f

    .line 614
    .line 615
    const/high16 v12, 0x3f800000    # 1.0f

    .line 616
    .line 617
    const/4 v13, 0x0

    .line 618
    const/4 v14, 0x0

    .line 619
    const/4 v15, 0x0

    .line 620
    const-string v4, ""

    .line 621
    .line 622
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 623
    .line 624
    .line 625
    move-result-object v0

    .line 626
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 627
    .line 628
    .line 629
    move-result-object v0

    .line 630
    sput-object v0, Landroidx/compose/material/icons/rounded/GpsOffKt;->_gpsOff:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 631
    .line 632
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 633
    .line 634
    .line 635
    return-object v0
.end method
