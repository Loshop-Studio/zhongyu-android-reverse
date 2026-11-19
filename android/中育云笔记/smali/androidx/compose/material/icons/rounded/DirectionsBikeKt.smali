.class public final Landroidx/compose/material/icons/rounded/DirectionsBikeKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _directionsBike:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getDirectionsBike(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/DirectionsBikeKt;->_directionsBike:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.DirectionsBike"

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
    const/high16 v0, 0x41780000    # 15.5f

    .line 71
    .line 72
    const/high16 v2, 0x40b00000    # 5.5f

    .line 73
    .line 74
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v17, 0x40000000    # 2.0f

    .line 78
    .line 79
    const/high16 v18, -0x40000000    # -2.0f

    .line 80
    .line 81
    const v13, 0x3f8ccccd    # 1.1f

    .line 82
    .line 83
    .line 84
    const/4 v14, 0x0

    .line 85
    const/high16 v15, 0x40000000    # 2.0f

    .line 86
    .line 87
    const v16, -0x4099999a    # -0.9f

    .line 88
    .line 89
    .line 90
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 91
    .line 92
    .line 93
    const v0, -0x4099999a    # -0.9f

    .line 94
    .line 95
    .line 96
    const/high16 v2, -0x40000000    # -2.0f

    .line 97
    .line 98
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 99
    .line 100
    .line 101
    const v0, 0x3f666666    # 0.9f

    .line 102
    .line 103
    .line 104
    const/high16 v2, 0x40000000    # 2.0f

    .line 105
    .line 106
    const/high16 v4, -0x40000000    # -2.0f

    .line 107
    .line 108
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 109
    .line 110
    .line 111
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 112
    .line 113
    .line 114
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 115
    .line 116
    .line 117
    const/high16 v0, 0x41400000    # 12.0f

    .line 118
    .line 119
    const/high16 v2, 0x40a00000    # 5.0f

    .line 120
    .line 121
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 122
    .line 123
    .line 124
    const/high16 v17, -0x3f600000    # -5.0f

    .line 125
    .line 126
    const/high16 v18, 0x40a00000    # 5.0f

    .line 127
    .line 128
    const v13, -0x3fcccccd    # -2.8f

    .line 129
    .line 130
    .line 131
    const/high16 v15, -0x3f600000    # -5.0f

    .line 132
    .line 133
    const v16, 0x400ccccd    # 2.2f

    .line 134
    .line 135
    .line 136
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 137
    .line 138
    .line 139
    const v0, 0x400ccccd    # 2.2f

    .line 140
    .line 141
    .line 142
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 143
    .line 144
    .line 145
    const v0, -0x3ff33333    # -2.2f

    .line 146
    .line 147
    .line 148
    const/high16 v2, -0x3f600000    # -5.0f

    .line 149
    .line 150
    const/high16 v4, 0x40a00000    # 5.0f

    .line 151
    .line 152
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 153
    .line 154
    .line 155
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 156
    .line 157
    .line 158
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 159
    .line 160
    .line 161
    const/high16 v0, 0x41a40000    # 20.5f

    .line 162
    .line 163
    const/high16 v2, 0x40a00000    # 5.0f

    .line 164
    .line 165
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 166
    .line 167
    .line 168
    const/high16 v17, -0x3fa00000    # -3.5f

    .line 169
    .line 170
    const/high16 v18, -0x3fa00000    # -3.5f

    .line 171
    .line 172
    const v13, -0x400ccccd    # -1.9f

    .line 173
    .line 174
    .line 175
    const/high16 v15, -0x3fa00000    # -3.5f

    .line 176
    .line 177
    const v16, -0x40333333    # -1.6f

    .line 178
    .line 179
    .line 180
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 181
    .line 182
    .line 183
    const v0, 0x3fcccccd    # 1.6f

    .line 184
    .line 185
    .line 186
    const/high16 v2, -0x3fa00000    # -3.5f

    .line 187
    .line 188
    const/high16 v4, 0x40600000    # 3.5f

    .line 189
    .line 190
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 191
    .line 192
    .line 193
    const/high16 v2, 0x40600000    # 3.5f

    .line 194
    .line 195
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 196
    .line 197
    .line 198
    const v0, -0x40333333    # -1.6f

    .line 199
    .line 200
    .line 201
    const/high16 v2, -0x3fa00000    # -3.5f

    .line 202
    .line 203
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 204
    .line 205
    .line 206
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 207
    .line 208
    .line 209
    const/high16 v0, 0x41280000    # 10.5f

    .line 210
    .line 211
    const v2, 0x412ccccd    # 10.8f

    .line 212
    .line 213
    .line 214
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 215
    .line 216
    .line 217
    const v0, 0x4019999a    # 2.4f

    .line 218
    .line 219
    .line 220
    const v2, -0x3fe66666    # -2.4f

    .line 221
    .line 222
    .line 223
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 224
    .line 225
    .line 226
    const v0, 0x3f4ccccd    # 0.8f

    .line 227
    .line 228
    .line 229
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 230
    .line 231
    .line 232
    const v17, 0x407d70a4    # 3.96f

    .line 233
    .line 234
    .line 235
    const v18, 0x400147ae    # 2.02f

    .line 236
    .line 237
    .line 238
    const v13, 0x3f87ae14    # 1.06f

    .line 239
    .line 240
    .line 241
    const v14, 0x3f87ae14    # 1.06f

    .line 242
    .line 243
    .line 244
    const v15, 0x401851ec    # 2.38f

    .line 245
    .line 246
    .line 247
    const v16, 0x3fe3d70a    # 1.78f

    .line 248
    .line 249
    .line 250
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 251
    .line 252
    .line 253
    const v17, 0x3f91eb85    # 1.14f

    .line 254
    .line 255
    .line 256
    const/high16 v18, -0x40800000    # -1.0f

    .line 257
    .line 258
    const v13, 0x3f19999a    # 0.6f

    .line 259
    .line 260
    .line 261
    const v14, 0x3db851ec    # 0.09f

    .line 262
    .line 263
    .line 264
    const v15, 0x3f91eb85    # 1.14f

    .line 265
    .line 266
    .line 267
    const v16, -0x413851ec    # -0.39f

    .line 268
    .line 269
    .line 270
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 271
    .line 272
    .line 273
    const v17, -0x40a66666    # -0.85f

    .line 274
    .line 275
    .line 276
    const v18, -0x40828f5c    # -0.99f

    .line 277
    .line 278
    .line 279
    const/4 v13, 0x0

    .line 280
    const v14, -0x41051eb8    # -0.49f

    .line 281
    .line 282
    .line 283
    const v15, -0x41428f5c    # -0.37f

    .line 284
    .line 285
    .line 286
    const v16, -0x40970a3d    # -0.91f

    .line 287
    .line 288
    .line 289
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 290
    .line 291
    .line 292
    const/high16 v17, -0x3fd00000    # -2.75f

    .line 293
    .line 294
    const v18, -0x4048f5c3    # -1.43f

    .line 295
    .line 296
    .line 297
    const v13, -0x4071eb85    # -1.11f

    .line 298
    .line 299
    .line 300
    const v14, -0x41c7ae14    # -0.18f

    .line 301
    .line 302
    .line 303
    const v15, -0x3ffeb852    # -2.02f

    .line 304
    .line 305
    .line 306
    const v16, -0x40ca3d71    # -0.71f

    .line 307
    .line 308
    .line 309
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 310
    .line 311
    .line 312
    const v0, -0x400ccccd    # -1.9f

    .line 313
    .line 314
    .line 315
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 316
    .line 317
    .line 318
    const v17, -0x40333333    # -1.6f

    .line 319
    .line 320
    .line 321
    const v18, -0x40e66666    # -0.6f

    .line 322
    .line 323
    .line 324
    const/high16 v13, -0x41000000    # -0.5f

    .line 325
    .line 326
    const v14, -0x41333333    # -0.4f

    .line 327
    .line 328
    .line 329
    const/high16 v15, -0x40800000    # -1.0f

    .line 330
    .line 331
    const v16, -0x40e66666    # -0.6f

    .line 332
    .line 333
    .line 334
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 335
    .line 336
    .line 337
    const v0, -0x404ccccd    # -1.4f

    .line 338
    .line 339
    .line 340
    const v2, 0x3f19999a    # 0.6f

    .line 341
    .line 342
    .line 343
    const v4, -0x40733333    # -1.1f

    .line 344
    .line 345
    .line 346
    const v6, 0x3e4ccccd    # 0.2f

    .line 347
    .line 348
    .line 349
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 350
    .line 351
    .line 352
    const v0, 0x40f9999a    # 7.8f

    .line 353
    .line 354
    .line 355
    const v2, 0x41066666    # 8.4f

    .line 356
    .line 357
    .line 358
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 359
    .line 360
    .line 361
    const v17, -0x40e66666    # -0.6f

    .line 362
    .line 363
    .line 364
    const v18, 0x3fb33333    # 1.4f

    .line 365
    .line 366
    .line 367
    const v13, -0x41333333    # -0.4f

    .line 368
    .line 369
    .line 370
    const v14, 0x3ecccccd    # 0.4f

    .line 371
    .line 372
    .line 373
    const v15, -0x40e66666    # -0.6f

    .line 374
    .line 375
    .line 376
    const v16, 0x3f666666    # 0.9f

    .line 377
    .line 378
    .line 379
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 380
    .line 381
    .line 382
    const v17, 0x3f19999a    # 0.6f

    .line 383
    .line 384
    .line 385
    const/4 v13, 0x0

    .line 386
    const v14, 0x3f19999a    # 0.6f

    .line 387
    .line 388
    .line 389
    const v15, 0x3e4ccccd    # 0.2f

    .line 390
    .line 391
    .line 392
    const v16, 0x3f8ccccd    # 1.1f

    .line 393
    .line 394
    .line 395
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 396
    .line 397
    .line 398
    const/high16 v0, 0x41300000    # 11.0f

    .line 399
    .line 400
    const/high16 v2, 0x41600000    # 14.0f

    .line 401
    .line 402
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 403
    .line 404
    .line 405
    const/high16 v0, 0x40800000    # 4.0f

    .line 406
    .line 407
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 408
    .line 409
    .line 410
    const/high16 v17, 0x3f800000    # 1.0f

    .line 411
    .line 412
    const/high16 v18, 0x3f800000    # 1.0f

    .line 413
    .line 414
    const v14, 0x3f0ccccd    # 0.55f

    .line 415
    .line 416
    .line 417
    const v15, 0x3ee66666    # 0.45f

    .line 418
    .line 419
    .line 420
    const/high16 v16, 0x3f800000    # 1.0f

    .line 421
    .line 422
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 423
    .line 424
    .line 425
    const v0, -0x4119999a    # -0.45f

    .line 426
    .line 427
    .line 428
    const/high16 v2, -0x40800000    # -1.0f

    .line 429
    .line 430
    const/high16 v4, 0x3f800000    # 1.0f

    .line 431
    .line 432
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 433
    .line 434
    .line 435
    const v0, -0x3f733333    # -4.4f

    .line 436
    .line 437
    .line 438
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 439
    .line 440
    .line 441
    const v17, -0x40f33333    # -0.55f

    .line 442
    .line 443
    .line 444
    const v18, -0x404f5c29    # -1.38f

    .line 445
    .line 446
    .line 447
    const v14, -0x40fae148    # -0.52f

    .line 448
    .line 449
    .line 450
    const v15, -0x41b33333    # -0.2f

    .line 451
    .line 452
    .line 453
    const v16, -0x407eb852    # -1.01f

    .line 454
    .line 455
    .line 456
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 457
    .line 458
    .line 459
    const/high16 v0, 0x41280000    # 10.5f

    .line 460
    .line 461
    const v2, 0x412ccccd    # 10.8f

    .line 462
    .line 463
    .line 464
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 465
    .line 466
    .line 467
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 468
    .line 469
    .line 470
    const/high16 v0, 0x41980000    # 19.0f

    .line 471
    .line 472
    const/high16 v2, 0x41400000    # 12.0f

    .line 473
    .line 474
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 475
    .line 476
    .line 477
    const/high16 v17, -0x3f600000    # -5.0f

    .line 478
    .line 479
    const/high16 v18, 0x40a00000    # 5.0f

    .line 480
    .line 481
    const v13, -0x3fcccccd    # -2.8f

    .line 482
    .line 483
    .line 484
    const/4 v14, 0x0

    .line 485
    const/high16 v15, -0x3f600000    # -5.0f

    .line 486
    .line 487
    const v16, 0x400ccccd    # 2.2f

    .line 488
    .line 489
    .line 490
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 491
    .line 492
    .line 493
    const v0, 0x400ccccd    # 2.2f

    .line 494
    .line 495
    .line 496
    const/high16 v2, 0x40a00000    # 5.0f

    .line 497
    .line 498
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 499
    .line 500
    .line 501
    const v0, -0x3ff33333    # -2.2f

    .line 502
    .line 503
    .line 504
    const/high16 v2, -0x3f600000    # -5.0f

    .line 505
    .line 506
    const/high16 v4, 0x40a00000    # 5.0f

    .line 507
    .line 508
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 509
    .line 510
    .line 511
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 512
    .line 513
    .line 514
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 515
    .line 516
    .line 517
    const/high16 v0, 0x41980000    # 19.0f

    .line 518
    .line 519
    const/high16 v2, 0x41a40000    # 20.5f

    .line 520
    .line 521
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 522
    .line 523
    .line 524
    const/high16 v17, -0x3fa00000    # -3.5f

    .line 525
    .line 526
    const/high16 v18, -0x3fa00000    # -3.5f

    .line 527
    .line 528
    const v13, -0x400ccccd    # -1.9f

    .line 529
    .line 530
    .line 531
    const/high16 v15, -0x3fa00000    # -3.5f

    .line 532
    .line 533
    const v16, -0x40333333    # -1.6f

    .line 534
    .line 535
    .line 536
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 537
    .line 538
    .line 539
    const v0, 0x3fcccccd    # 1.6f

    .line 540
    .line 541
    .line 542
    const/high16 v2, -0x3fa00000    # -3.5f

    .line 543
    .line 544
    const/high16 v4, 0x40600000    # 3.5f

    .line 545
    .line 546
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 547
    .line 548
    .line 549
    const/high16 v2, 0x40600000    # 3.5f

    .line 550
    .line 551
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 552
    .line 553
    .line 554
    const v0, -0x40333333    # -1.6f

    .line 555
    .line 556
    .line 557
    const/high16 v2, -0x3fa00000    # -3.5f

    .line 558
    .line 559
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 560
    .line 561
    .line 562
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 563
    .line 564
    .line 565
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 566
    .line 567
    .line 568
    move-result-object v2

    .line 569
    const/16 v16, 0x3800

    .line 570
    .line 571
    const/16 v17, 0x0

    .line 572
    .line 573
    const/high16 v6, 0x3f800000    # 1.0f

    .line 574
    .line 575
    const/high16 v8, 0x3f800000    # 1.0f

    .line 576
    .line 577
    const/4 v7, 0x0

    .line 578
    const/high16 v9, 0x3f800000    # 1.0f

    .line 579
    .line 580
    const/high16 v12, 0x3f800000    # 1.0f

    .line 581
    .line 582
    const/4 v13, 0x0

    .line 583
    const/4 v15, 0x0

    .line 584
    const-string v4, ""

    .line 585
    .line 586
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 587
    .line 588
    .line 589
    move-result-object v0

    .line 590
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 591
    .line 592
    .line 593
    move-result-object v0

    .line 594
    sput-object v0, Landroidx/compose/material/icons/rounded/DirectionsBikeKt;->_directionsBike:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 595
    .line 596
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 597
    .line 598
    .line 599
    return-object v0
.end method

.method public static synthetic getDirectionsBike$annotations(Landroidx/compose/material/icons/Icons$Rounded;)V
    .locals 0
    .annotation runtime Lqc/a;
    .end annotation

    return-void
.end method
