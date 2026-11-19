.class public final Landroidx/compose/material/icons/twotone/PartyModeKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _partyMode:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getPartyMode(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/PartyModeKt;->_partyMode:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.PartyMode"

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
    const v4, 0x417f3333    # 15.95f

    .line 71
    .line 72
    .line 73
    const/high16 v6, 0x40c00000    # 6.0f

    .line 74
    .line 75
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    const v4, -0x40e8f5c3    # -0.59f

    .line 79
    .line 80
    .line 81
    const v6, -0x40d9999a    # -0.65f

    .line 82
    .line 83
    .line 84
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 85
    .line 86
    .line 87
    const v4, 0x4161eb85    # 14.12f

    .line 88
    .line 89
    .line 90
    const/high16 v6, 0x40800000    # 4.0f

    .line 91
    .line 92
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 93
    .line 94
    .line 95
    const v4, 0x411e147b    # 9.88f

    .line 96
    .line 97
    .line 98
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 99
    .line 100
    .line 101
    const v4, 0x410a6666    # 8.65f

    .line 102
    .line 103
    .line 104
    const v6, 0x40ab3333    # 5.35f

    .line 105
    .line 106
    .line 107
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 108
    .line 109
    .line 110
    const v4, -0x40e66666    # -0.6f

    .line 111
    .line 112
    .line 113
    const v6, 0x3f266666    # 0.65f

    .line 114
    .line 115
    .line 116
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 117
    .line 118
    .line 119
    const/high16 v4, 0x40c00000    # 6.0f

    .line 120
    .line 121
    const/high16 v6, 0x40800000    # 4.0f

    .line 122
    .line 123
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 124
    .line 125
    .line 126
    const/high16 v4, 0x41400000    # 12.0f

    .line 127
    .line 128
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 129
    .line 130
    .line 131
    const/high16 v4, 0x41800000    # 16.0f

    .line 132
    .line 133
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 134
    .line 135
    .line 136
    const/high16 v4, 0x41a00000    # 20.0f

    .line 137
    .line 138
    const/high16 v6, 0x40c00000    # 6.0f

    .line 139
    .line 140
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 141
    .line 142
    .line 143
    const v4, -0x3f7e6666    # -4.05f

    .line 144
    .line 145
    .line 146
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 147
    .line 148
    .line 149
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 150
    .line 151
    .line 152
    const/high16 v4, 0x40e00000    # 7.0f

    .line 153
    .line 154
    const/high16 v6, 0x41400000    # 12.0f

    .line 155
    .line 156
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 157
    .line 158
    .line 159
    const/high16 v25, 0x40a00000    # 5.0f

    .line 160
    .line 161
    const/high16 v26, -0x3f600000    # -5.0f

    .line 162
    .line 163
    const/16 v21, 0x0

    .line 164
    .line 165
    const v22, -0x3fcf5c29    # -2.76f

    .line 166
    .line 167
    .line 168
    const v23, 0x400f5c29    # 2.24f

    .line 169
    .line 170
    .line 171
    const/high16 v24, -0x3f600000    # -5.0f

    .line 172
    .line 173
    move-object/from16 v20, v2

    .line 174
    .line 175
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 176
    .line 177
    .line 178
    const v25, 0x407eb852    # 3.98f

    .line 179
    .line 180
    .line 181
    const/high16 v26, 0x40000000    # 2.0f

    .line 182
    .line 183
    const v21, 0x3fd0a3d7    # 1.63f

    .line 184
    .line 185
    .line 186
    const/16 v22, 0x0

    .line 187
    .line 188
    const v23, 0x4043d70a    # 3.06f

    .line 189
    .line 190
    .line 191
    const v24, 0x3f4a3d71    # 0.79f

    .line 192
    .line 193
    .line 194
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 195
    .line 196
    .line 197
    const/high16 v4, 0x41100000    # 9.0f

    .line 198
    .line 199
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 200
    .line 201
    .line 202
    const/high16 v25, -0x3fc00000    # -3.0f

    .line 203
    .line 204
    const/high16 v26, 0x40400000    # 3.0f

    .line 205
    .line 206
    const v21, -0x402b851f    # -1.66f

    .line 207
    .line 208
    .line 209
    const/high16 v23, -0x3fc00000    # -3.0f

    .line 210
    .line 211
    const v24, 0x3fab851f    # 1.34f

    .line 212
    .line 213
    .line 214
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 215
    .line 216
    .line 217
    const v25, 0x3e3851ec    # 0.18f

    .line 218
    .line 219
    .line 220
    const/high16 v26, 0x3f800000    # 1.0f

    .line 221
    .line 222
    const/16 v21, 0x0

    .line 223
    .line 224
    const v22, 0x3eb33333    # 0.35f

    .line 225
    .line 226
    .line 227
    const v23, 0x3d8f5c29    # 0.07f

    .line 228
    .line 229
    .line 230
    const v24, 0x3f30a3d7    # 0.69f

    .line 231
    .line 232
    .line 233
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 234
    .line 235
    .line 236
    const v4, 0x40e33333    # 7.1f

    .line 237
    .line 238
    .line 239
    const/high16 v6, 0x41500000    # 13.0f

    .line 240
    .line 241
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 242
    .line 243
    .line 244
    const v25, -0x42333333    # -0.1f

    .line 245
    .line 246
    .line 247
    const/high16 v26, -0x40800000    # -1.0f

    .line 248
    .line 249
    const v21, -0x428a3d71    # -0.06f

    .line 250
    .line 251
    .line 252
    const v22, -0x415c28f6    # -0.32f

    .line 253
    .line 254
    .line 255
    const v23, -0x42333333    # -0.1f

    .line 256
    .line 257
    .line 258
    const v24, -0x40d70a3d    # -0.66f

    .line 259
    .line 260
    .line 261
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 262
    .line 263
    .line 264
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 265
    .line 266
    .line 267
    const/high16 v4, 0x41880000    # 17.0f

    .line 268
    .line 269
    const/high16 v6, 0x41400000    # 12.0f

    .line 270
    .line 271
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 272
    .line 273
    .line 274
    const/high16 v25, -0x3f600000    # -5.0f

    .line 275
    .line 276
    const/high16 v26, 0x40a00000    # 5.0f

    .line 277
    .line 278
    const/16 v21, 0x0

    .line 279
    .line 280
    const v22, 0x4030a3d7    # 2.76f

    .line 281
    .line 282
    .line 283
    const v23, -0x3ff0a3d7    # -2.24f

    .line 284
    .line 285
    .line 286
    const/high16 v24, 0x40a00000    # 5.0f

    .line 287
    .line 288
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 289
    .line 290
    .line 291
    const v25, -0x3f8147ae    # -3.98f

    .line 292
    .line 293
    .line 294
    const/high16 v26, -0x40000000    # -2.0f

    .line 295
    .line 296
    const v21, -0x402f5c29    # -1.63f

    .line 297
    .line 298
    .line 299
    const/16 v22, 0x0

    .line 300
    .line 301
    const v23, -0x3fbc28f6    # -3.06f

    .line 302
    .line 303
    .line 304
    const v24, -0x40b5c28f    # -0.79f

    .line 305
    .line 306
    .line 307
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 308
    .line 309
    .line 310
    const/high16 v4, 0x41700000    # 15.0f

    .line 311
    .line 312
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 313
    .line 314
    .line 315
    const/high16 v25, 0x40400000    # 3.0f

    .line 316
    .line 317
    const/high16 v26, -0x3fc00000    # -3.0f

    .line 318
    .line 319
    const v21, 0x3fd47ae1    # 1.66f

    .line 320
    .line 321
    .line 322
    const/high16 v23, 0x40400000    # 3.0f

    .line 323
    .line 324
    const v24, -0x40547ae1    # -1.34f

    .line 325
    .line 326
    .line 327
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 328
    .line 329
    .line 330
    const v25, -0x41c7ae14    # -0.18f

    .line 331
    .line 332
    .line 333
    const/high16 v26, -0x40800000    # -1.0f

    .line 334
    .line 335
    const/16 v21, 0x0

    .line 336
    .line 337
    const v22, -0x414ccccd    # -0.35f

    .line 338
    .line 339
    .line 340
    const v23, -0x4270a3d7    # -0.07f

    .line 341
    .line 342
    .line 343
    const v24, -0x40cf5c29    # -0.69f

    .line 344
    .line 345
    .line 346
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 347
    .line 348
    .line 349
    const v4, 0x40051eb8    # 2.08f

    .line 350
    .line 351
    .line 352
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 353
    .line 354
    .line 355
    const v25, 0x3dcccccd    # 0.1f

    .line 356
    .line 357
    .line 358
    const/high16 v26, 0x3f800000    # 1.0f

    .line 359
    .line 360
    const v21, 0x3d8f5c29    # 0.07f

    .line 361
    .line 362
    .line 363
    const v22, 0x3ea3d70a    # 0.32f

    .line 364
    .line 365
    .line 366
    const v23, 0x3dcccccd    # 0.1f

    .line 367
    .line 368
    .line 369
    const v24, 0x3f28f5c3    # 0.66f

    .line 370
    .line 371
    .line 372
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 373
    .line 374
    .line 375
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 376
    .line 377
    .line 378
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 379
    .line 380
    .line 381
    move-result-object v2

    .line 382
    const/16 v16, 0x3800

    .line 383
    .line 384
    const/16 v17, 0x0

    .line 385
    .line 386
    const v6, 0x3e99999a    # 0.3f

    .line 387
    .line 388
    .line 389
    const v8, 0x3e99999a    # 0.3f

    .line 390
    .line 391
    .line 392
    const/4 v7, 0x0

    .line 393
    const/high16 v9, 0x3f800000    # 1.0f

    .line 394
    .line 395
    const/high16 v12, 0x3f800000    # 1.0f

    .line 396
    .line 397
    const/4 v13, 0x0

    .line 398
    const/4 v14, 0x0

    .line 399
    const/4 v15, 0x0

    .line 400
    const-string v4, ""

    .line 401
    .line 402
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 403
    .line 404
    .line 405
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 406
    .line 407
    .line 408
    move-result v3

    .line 409
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 410
    .line 411
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 412
    .line 413
    .line 414
    move-result-wide v6

    .line 415
    const/4 v0, 0x0

    .line 416
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 417
    .line 418
    .line 419
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 420
    .line 421
    .line 422
    move-result v10

    .line 423
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 424
    .line 425
    .line 426
    move-result v11

    .line 427
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 428
    .line 429
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 430
    .line 431
    .line 432
    const/high16 v0, 0x41a00000    # 20.0f

    .line 433
    .line 434
    const/high16 v2, 0x40800000    # 4.0f

    .line 435
    .line 436
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 437
    .line 438
    .line 439
    const v0, -0x3fb51eb8    # -3.17f

    .line 440
    .line 441
    .line 442
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 443
    .line 444
    .line 445
    const/high16 v0, 0x40000000    # 2.0f

    .line 446
    .line 447
    const/high16 v2, 0x41700000    # 15.0f

    .line 448
    .line 449
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 450
    .line 451
    .line 452
    const/high16 v2, 0x41100000    # 9.0f

    .line 453
    .line 454
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 455
    .line 456
    .line 457
    const v0, 0x40e570a4    # 7.17f

    .line 458
    .line 459
    .line 460
    const/high16 v2, 0x40800000    # 4.0f

    .line 461
    .line 462
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 463
    .line 464
    .line 465
    const/high16 v0, 0x40800000    # 4.0f

    .line 466
    .line 467
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 468
    .line 469
    .line 470
    const/high16 v17, -0x40000000    # -2.0f

    .line 471
    .line 472
    const/high16 v18, 0x40000000    # 2.0f

    .line 473
    .line 474
    const v13, -0x40733333    # -1.1f

    .line 475
    .line 476
    .line 477
    const/high16 v15, -0x40000000    # -2.0f

    .line 478
    .line 479
    const v16, 0x3f666666    # 0.9f

    .line 480
    .line 481
    .line 482
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 483
    .line 484
    .line 485
    const/high16 v0, 0x41400000    # 12.0f

    .line 486
    .line 487
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 488
    .line 489
    .line 490
    const/high16 v17, 0x40000000    # 2.0f

    .line 491
    .line 492
    const/4 v13, 0x0

    .line 493
    const v14, 0x3f8ccccd    # 1.1f

    .line 494
    .line 495
    .line 496
    const v15, 0x3f666666    # 0.9f

    .line 497
    .line 498
    .line 499
    const/high16 v16, 0x40000000    # 2.0f

    .line 500
    .line 501
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 502
    .line 503
    .line 504
    const/high16 v0, 0x41800000    # 16.0f

    .line 505
    .line 506
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 507
    .line 508
    .line 509
    const/high16 v18, -0x40000000    # -2.0f

    .line 510
    .line 511
    const v13, 0x3f8ccccd    # 1.1f

    .line 512
    .line 513
    .line 514
    const/4 v14, 0x0

    .line 515
    const/high16 v15, 0x40000000    # 2.0f

    .line 516
    .line 517
    const v16, -0x4099999a    # -0.9f

    .line 518
    .line 519
    .line 520
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 521
    .line 522
    .line 523
    const/high16 v0, 0x41b00000    # 22.0f

    .line 524
    .line 525
    const/high16 v2, 0x40c00000    # 6.0f

    .line 526
    .line 527
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 528
    .line 529
    .line 530
    const/high16 v17, -0x40000000    # -2.0f

    .line 531
    .line 532
    const/4 v13, 0x0

    .line 533
    const v14, -0x40733333    # -1.1f

    .line 534
    .line 535
    .line 536
    const v15, -0x4099999a    # -0.9f

    .line 537
    .line 538
    .line 539
    const/high16 v16, -0x40000000    # -2.0f

    .line 540
    .line 541
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 542
    .line 543
    .line 544
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 545
    .line 546
    .line 547
    const/high16 v0, 0x41900000    # 18.0f

    .line 548
    .line 549
    const/high16 v2, 0x41a00000    # 20.0f

    .line 550
    .line 551
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 552
    .line 553
    .line 554
    const/high16 v2, 0x40800000    # 4.0f

    .line 555
    .line 556
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 557
    .line 558
    .line 559
    const/high16 v0, 0x40c00000    # 6.0f

    .line 560
    .line 561
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 562
    .line 563
    .line 564
    const v0, 0x4081999a    # 4.05f

    .line 565
    .line 566
    .line 567
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 568
    .line 569
    .line 570
    const v0, 0x3f170a3d    # 0.59f

    .line 571
    .line 572
    .line 573
    const v2, -0x40d9999a    # -0.65f

    .line 574
    .line 575
    .line 576
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 577
    .line 578
    .line 579
    const v0, 0x411e147b    # 9.88f

    .line 580
    .line 581
    .line 582
    const/high16 v2, 0x40800000    # 4.0f

    .line 583
    .line 584
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 585
    .line 586
    .line 587
    const v0, 0x4087ae14    # 4.24f

    .line 588
    .line 589
    .line 590
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 591
    .line 592
    .line 593
    const v0, 0x3f9eb852    # 1.24f

    .line 594
    .line 595
    .line 596
    const v2, 0x3faccccd    # 1.35f

    .line 597
    .line 598
    .line 599
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 600
    .line 601
    .line 602
    const v0, 0x3f170a3d    # 0.59f

    .line 603
    .line 604
    .line 605
    const v2, 0x3f266666    # 0.65f

    .line 606
    .line 607
    .line 608
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 609
    .line 610
    .line 611
    const/high16 v0, 0x41a00000    # 20.0f

    .line 612
    .line 613
    const/high16 v2, 0x40c00000    # 6.0f

    .line 614
    .line 615
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 616
    .line 617
    .line 618
    const/high16 v0, 0x41400000    # 12.0f

    .line 619
    .line 620
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 621
    .line 622
    .line 623
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 624
    .line 625
    .line 626
    const/high16 v0, 0x41100000    # 9.0f

    .line 627
    .line 628
    const/high16 v2, 0x41400000    # 12.0f

    .line 629
    .line 630
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 631
    .line 632
    .line 633
    const/high16 v17, 0x40400000    # 3.0f

    .line 634
    .line 635
    const/high16 v18, -0x3fc00000    # -3.0f

    .line 636
    .line 637
    const v14, -0x402b851f    # -1.66f

    .line 638
    .line 639
    .line 640
    const v15, 0x3fab851f    # 1.34f

    .line 641
    .line 642
    .line 643
    const/high16 v16, -0x3fc00000    # -3.0f

    .line 644
    .line 645
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 646
    .line 647
    .line 648
    const v0, 0x407eb852    # 3.98f

    .line 649
    .line 650
    .line 651
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 652
    .line 653
    .line 654
    const v17, -0x3f8147ae    # -3.98f

    .line 655
    .line 656
    .line 657
    const/high16 v18, -0x40000000    # -2.0f

    .line 658
    .line 659
    const v13, -0x40947ae1    # -0.92f

    .line 660
    .line 661
    .line 662
    const v14, -0x40651eb8    # -1.21f

    .line 663
    .line 664
    .line 665
    const v15, -0x3fe9999a    # -2.35f

    .line 666
    .line 667
    .line 668
    const/high16 v16, -0x40000000    # -2.0f

    .line 669
    .line 670
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 671
    .line 672
    .line 673
    const/high16 v17, -0x3f600000    # -5.0f

    .line 674
    .line 675
    const/high16 v18, 0x40a00000    # 5.0f

    .line 676
    .line 677
    const v13, -0x3fcf5c29    # -2.76f

    .line 678
    .line 679
    .line 680
    const/4 v14, 0x0

    .line 681
    const/high16 v15, -0x3f600000    # -5.0f

    .line 682
    .line 683
    const v16, 0x400f5c29    # 2.24f

    .line 684
    .line 685
    .line 686
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 687
    .line 688
    .line 689
    const v17, 0x3dcccccd    # 0.1f

    .line 690
    .line 691
    .line 692
    const/high16 v18, 0x3f800000    # 1.0f

    .line 693
    .line 694
    const/4 v13, 0x0

    .line 695
    const v14, 0x3eae147b    # 0.34f

    .line 696
    .line 697
    .line 698
    const v15, 0x3d23d70a    # 0.04f

    .line 699
    .line 700
    .line 701
    const v16, 0x3f2e147b    # 0.68f

    .line 702
    .line 703
    .line 704
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 705
    .line 706
    .line 707
    const v0, 0x40051eb8    # 2.08f

    .line 708
    .line 709
    .line 710
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 711
    .line 712
    .line 713
    const v17, -0x41c7ae14    # -0.18f

    .line 714
    .line 715
    .line 716
    const/high16 v18, -0x40800000    # -1.0f

    .line 717
    .line 718
    const v13, -0x421eb852    # -0.11f

    .line 719
    .line 720
    .line 721
    const v14, -0x416147ae    # -0.31f

    .line 722
    .line 723
    .line 724
    const v15, -0x41c7ae14    # -0.18f

    .line 725
    .line 726
    .line 727
    const v16, -0x40d9999a    # -0.65f

    .line 728
    .line 729
    .line 730
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 731
    .line 732
    .line 733
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 734
    .line 735
    .line 736
    const/high16 v0, 0x41700000    # 15.0f

    .line 737
    .line 738
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 739
    .line 740
    .line 741
    const/high16 v17, -0x3fc00000    # -3.0f

    .line 742
    .line 743
    const/high16 v18, 0x40400000    # 3.0f

    .line 744
    .line 745
    const/4 v13, 0x0

    .line 746
    const v14, 0x3fd47ae1    # 1.66f

    .line 747
    .line 748
    .line 749
    const v15, -0x40547ae1    # -1.34f

    .line 750
    .line 751
    .line 752
    const/high16 v16, 0x40400000    # 3.0f

    .line 753
    .line 754
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 755
    .line 756
    .line 757
    const v0, 0x410051ec    # 8.02f

    .line 758
    .line 759
    .line 760
    const/high16 v2, 0x41700000    # 15.0f

    .line 761
    .line 762
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 763
    .line 764
    .line 765
    const v17, 0x407eb852    # 3.98f

    .line 766
    .line 767
    .line 768
    const/high16 v18, 0x40000000    # 2.0f

    .line 769
    .line 770
    const v13, 0x3f6b851f    # 0.92f

    .line 771
    .line 772
    .line 773
    const v14, 0x3f9ae148    # 1.21f

    .line 774
    .line 775
    .line 776
    const v15, 0x40166666    # 2.35f

    .line 777
    .line 778
    .line 779
    const/high16 v16, 0x40000000    # 2.0f

    .line 780
    .line 781
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 782
    .line 783
    .line 784
    const/high16 v17, 0x40a00000    # 5.0f

    .line 785
    .line 786
    const/high16 v18, -0x3f600000    # -5.0f

    .line 787
    .line 788
    const v13, 0x4030a3d7    # 2.76f

    .line 789
    .line 790
    .line 791
    const/4 v14, 0x0

    .line 792
    const/high16 v15, 0x40a00000    # 5.0f

    .line 793
    .line 794
    const v16, -0x3ff0a3d7    # -2.24f

    .line 795
    .line 796
    .line 797
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 798
    .line 799
    .line 800
    const v17, -0x42333333    # -0.1f

    .line 801
    .line 802
    .line 803
    const/high16 v18, -0x40800000    # -1.0f

    .line 804
    .line 805
    const/4 v13, 0x0

    .line 806
    const v14, -0x4151eb85    # -0.34f

    .line 807
    .line 808
    .line 809
    const v15, -0x430a3d71    # -0.03f

    .line 810
    .line 811
    .line 812
    const v16, -0x40d1eb85    # -0.68f

    .line 813
    .line 814
    .line 815
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 816
    .line 817
    .line 818
    const v0, -0x3ffae148    # -2.08f

    .line 819
    .line 820
    .line 821
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 822
    .line 823
    .line 824
    const v17, 0x3e3851ec    # 0.18f

    .line 825
    .line 826
    .line 827
    const/high16 v18, 0x3f800000    # 1.0f

    .line 828
    .line 829
    const v13, 0x3de147ae    # 0.11f

    .line 830
    .line 831
    .line 832
    const v14, 0x3e9eb852    # 0.31f

    .line 833
    .line 834
    .line 835
    const v15, 0x3e3851ec    # 0.18f

    .line 836
    .line 837
    .line 838
    const v16, 0x3f266666    # 0.65f

    .line 839
    .line 840
    .line 841
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 842
    .line 843
    .line 844
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 845
    .line 846
    .line 847
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 848
    .line 849
    .line 850
    move-result-object v2

    .line 851
    const/16 v16, 0x3800

    .line 852
    .line 853
    const/16 v17, 0x0

    .line 854
    .line 855
    const/high16 v6, 0x3f800000    # 1.0f

    .line 856
    .line 857
    const/high16 v8, 0x3f800000    # 1.0f

    .line 858
    .line 859
    const/4 v7, 0x0

    .line 860
    const/high16 v12, 0x3f800000    # 1.0f

    .line 861
    .line 862
    const/4 v13, 0x0

    .line 863
    const/4 v14, 0x0

    .line 864
    const/4 v15, 0x0

    .line 865
    const-string v4, ""

    .line 866
    .line 867
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 868
    .line 869
    .line 870
    move-result-object v0

    .line 871
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 872
    .line 873
    .line 874
    move-result-object v0

    .line 875
    sput-object v0, Landroidx/compose/material/icons/twotone/PartyModeKt;->_partyMode:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 876
    .line 877
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 878
    .line 879
    .line 880
    return-object v0
.end method
