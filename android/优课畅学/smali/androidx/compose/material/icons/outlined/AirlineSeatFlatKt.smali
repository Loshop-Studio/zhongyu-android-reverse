.class public final Landroidx/compose/material/icons/outlined/AirlineSeatFlatKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _airlineSeatFlat:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getAirlineSeatFlat(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/outlined/AirlineSeatFlatKt;->_airlineSeatFlat:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Outlined.AirlineSeatFlat"

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
    const/high16 v0, 0x40a00000    # 5.0f

    .line 71
    .line 72
    const/high16 v2, 0x41500000    # 13.0f

    .line 73
    .line 74
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const v17, 0x4008f5c3    # 2.14f

    .line 78
    .line 79
    .line 80
    const v18, -0x4099999a    # -0.9f

    .line 81
    .line 82
    .line 83
    const v13, 0x3f47ae14    # 0.78f

    .line 84
    .line 85
    .line 86
    const/4 v14, 0x0

    .line 87
    const v15, 0x3fc66666    # 1.55f

    .line 88
    .line 89
    .line 90
    const v16, -0x41666666    # -0.3f

    .line 91
    .line 92
    .line 93
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 94
    .line 95
    .line 96
    const v17, -0x42dc28f6    # -0.04f

    .line 97
    .line 98
    .line 99
    const v18, -0x3f7851ec    # -4.24f

    .line 100
    .line 101
    .line 102
    const v13, 0x3f947ae1    # 1.16f

    .line 103
    .line 104
    .line 105
    const v14, -0x4067ae14    # -1.19f

    .line 106
    .line 107
    .line 108
    const v15, 0x3f91eb85    # 1.14f

    .line 109
    .line 110
    .line 111
    const v16, -0x3fbae148    # -3.08f

    .line 112
    .line 113
    .line 114
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 115
    .line 116
    .line 117
    const/high16 v17, 0x40a00000    # 5.0f

    .line 118
    .line 119
    const/high16 v18, 0x40e00000    # 7.0f

    .line 120
    .line 121
    const v13, 0x40d051ec    # 6.51f

    .line 122
    .line 123
    .line 124
    const v14, 0x40e947ae    # 7.29f

    .line 125
    .line 126
    .line 127
    const/high16 v15, 0x40b80000    # 5.75f

    .line 128
    .line 129
    const/high16 v16, 0x40e00000    # 7.0f

    .line 130
    .line 131
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 132
    .line 133
    .line 134
    const v17, -0x3ff70a3d    # -2.14f

    .line 135
    .line 136
    .line 137
    const v18, 0x3f666666    # 0.9f

    .line 138
    .line 139
    .line 140
    const v13, -0x40b851ec    # -0.78f

    .line 141
    .line 142
    .line 143
    const/4 v14, 0x0

    .line 144
    const v15, -0x4039999a    # -1.55f

    .line 145
    .line 146
    .line 147
    const v16, 0x3e99999a    # 0.3f

    .line 148
    .line 149
    .line 150
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 151
    .line 152
    .line 153
    const v17, 0x3d23d70a    # 0.04f

    .line 154
    .line 155
    .line 156
    const v18, 0x4087ae14    # 4.24f

    .line 157
    .line 158
    .line 159
    const v13, -0x406b851f    # -1.16f

    .line 160
    .line 161
    .line 162
    const v14, 0x3f9851ec    # 1.19f

    .line 163
    .line 164
    .line 165
    const v15, -0x406e147b    # -1.14f

    .line 166
    .line 167
    .line 168
    const v16, 0x40451eb8    # 3.08f

    .line 169
    .line 170
    .line 171
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 172
    .line 173
    .line 174
    const v17, 0x40066666    # 2.1f

    .line 175
    .line 176
    .line 177
    const v18, 0x3f5c28f6    # 0.86f

    .line 178
    .line 179
    .line 180
    const v13, 0x3f170a3d    # 0.59f

    .line 181
    .line 182
    .line 183
    const v14, 0x3f11eb85    # 0.57f

    .line 184
    .line 185
    .line 186
    const v15, 0x3faccccd    # 1.35f

    .line 187
    .line 188
    .line 189
    const v16, 0x3f5c28f6    # 0.86f

    .line 190
    .line 191
    .line 192
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 193
    .line 194
    .line 195
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 196
    .line 197
    .line 198
    const v0, 0x408947ae    # 4.29f

    .line 199
    .line 200
    .line 201
    const v2, 0x4114cccd    # 9.3f

    .line 202
    .line 203
    .line 204
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 205
    .line 206
    .line 207
    const v17, 0x3f35c28f    # 0.71f

    .line 208
    .line 209
    .line 210
    const v18, -0x41666666    # -0.3f

    .line 211
    .line 212
    .line 213
    const v13, 0x3e428f5c    # 0.19f

    .line 214
    .line 215
    .line 216
    const v14, -0x41bd70a4    # -0.19f

    .line 217
    .line 218
    .line 219
    const v15, 0x3ee147ae    # 0.44f

    .line 220
    .line 221
    .line 222
    const v16, -0x41666666    # -0.3f

    .line 223
    .line 224
    .line 225
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 226
    .line 227
    .line 228
    const v17, 0x3f333333    # 0.7f

    .line 229
    .line 230
    .line 231
    const v18, 0x3e8f5c29    # 0.28f

    .line 232
    .line 233
    .line 234
    const v13, 0x3e851eb8    # 0.26f

    .line 235
    .line 236
    .line 237
    const/4 v14, 0x0

    .line 238
    const v15, 0x3f028f5c    # 0.51f

    .line 239
    .line 240
    .line 241
    const v16, 0x3dcccccd    # 0.1f

    .line 242
    .line 243
    .line 244
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 245
    .line 246
    .line 247
    const v17, 0x3ca3d70a    # 0.02f

    .line 248
    .line 249
    .line 250
    const v18, 0x3fb47ae1    # 1.41f

    .line 251
    .line 252
    .line 253
    const v13, 0x3ecccccd    # 0.4f

    .line 254
    .line 255
    .line 256
    const v14, 0x3ec7ae14    # 0.39f

    .line 257
    .line 258
    .line 259
    const v15, 0x3ecccccd    # 0.4f

    .line 260
    .line 261
    .line 262
    const v16, 0x3f8147ae    # 1.01f

    .line 263
    .line 264
    .line 265
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 266
    .line 267
    .line 268
    const v17, -0x40c7ae14    # -0.72f

    .line 269
    .line 270
    .line 271
    const v18, 0x3e9eb852    # 0.31f

    .line 272
    .line 273
    .line 274
    const v13, -0x41b33333    # -0.2f

    .line 275
    .line 276
    .line 277
    const v14, 0x3e4ccccd    # 0.2f

    .line 278
    .line 279
    .line 280
    const v15, -0x4119999a    # -0.45f

    .line 281
    .line 282
    .line 283
    const v16, 0x3e9eb852    # 0.31f

    .line 284
    .line 285
    .line 286
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 287
    .line 288
    .line 289
    const v17, -0x40cccccd    # -0.7f

    .line 290
    .line 291
    .line 292
    const v18, -0x4170a3d7    # -0.28f

    .line 293
    .line 294
    .line 295
    const v13, -0x417ae148    # -0.26f

    .line 296
    .line 297
    .line 298
    const/4 v14, 0x0

    .line 299
    const v15, -0x40fd70a4    # -0.51f

    .line 300
    .line 301
    .line 302
    const v16, -0x42333333    # -0.1f

    .line 303
    .line 304
    .line 305
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 306
    .line 307
    .line 308
    const v17, -0x43dc28f6    # -0.01f

    .line 309
    .line 310
    .line 311
    const v18, -0x404a3d71    # -1.42f

    .line 312
    .line 313
    .line 314
    const v13, -0x41333333    # -0.4f

    .line 315
    .line 316
    .line 317
    const v14, -0x41333333    # -0.4f

    .line 318
    .line 319
    .line 320
    const v15, -0x41333333    # -0.4f

    .line 321
    .line 322
    .line 323
    const v16, -0x407d70a4    # -1.02f

    .line 324
    .line 325
    .line 326
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 327
    .line 328
    .line 329
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 330
    .line 331
    .line 332
    const/high16 v0, 0x41900000    # 18.0f

    .line 333
    .line 334
    const/high16 v2, 0x40e00000    # 7.0f

    .line 335
    .line 336
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 337
    .line 338
    .line 339
    const/high16 v0, 0x41100000    # 9.0f

    .line 340
    .line 341
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 342
    .line 343
    .line 344
    const/high16 v0, 0x40c00000    # 6.0f

    .line 345
    .line 346
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 347
    .line 348
    .line 349
    const/high16 v0, 0x41500000    # 13.0f

    .line 350
    .line 351
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 352
    .line 353
    .line 354
    const/high16 v0, -0x40000000    # -2.0f

    .line 355
    .line 356
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 357
    .line 358
    .line 359
    const/high16 v17, -0x3f800000    # -4.0f

    .line 360
    .line 361
    const/high16 v18, -0x3f800000    # -4.0f

    .line 362
    .line 363
    const/4 v13, 0x0

    .line 364
    const v14, -0x3ff28f5c    # -2.21f

    .line 365
    .line 366
    .line 367
    const v15, -0x401ae148    # -1.79f

    .line 368
    .line 369
    .line 370
    const/high16 v16, -0x3f800000    # -4.0f

    .line 371
    .line 372
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 373
    .line 374
    .line 375
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 376
    .line 377
    .line 378
    const/high16 v0, 0x41300000    # 11.0f

    .line 379
    .line 380
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 381
    .line 382
    .line 383
    const/high16 v0, 0x41100000    # 9.0f

    .line 384
    .line 385
    const/high16 v2, 0x41300000    # 11.0f

    .line 386
    .line 387
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 388
    .line 389
    .line 390
    const/high16 v0, 0x40e00000    # 7.0f

    .line 391
    .line 392
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 393
    .line 394
    .line 395
    const/high16 v17, 0x40000000    # 2.0f

    .line 396
    .line 397
    const/high16 v18, 0x40000000    # 2.0f

    .line 398
    .line 399
    const v13, 0x3f8ccccd    # 1.1f

    .line 400
    .line 401
    .line 402
    const/4 v14, 0x0

    .line 403
    const/high16 v15, 0x40000000    # 2.0f

    .line 404
    .line 405
    const v16, 0x3f666666    # 0.9f

    .line 406
    .line 407
    .line 408
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 409
    .line 410
    .line 411
    const/high16 v0, -0x3ef00000    # -9.0f

    .line 412
    .line 413
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 414
    .line 415
    .line 416
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 417
    .line 418
    .line 419
    const/high16 v0, 0x41800000    # 16.0f

    .line 420
    .line 421
    const/high16 v2, 0x40000000    # 2.0f

    .line 422
    .line 423
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 424
    .line 425
    .line 426
    const/high16 v0, 0x40c00000    # 6.0f

    .line 427
    .line 428
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

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
    const/high16 v0, 0x41000000    # 8.0f

    .line 437
    .line 438
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 439
    .line 440
    .line 441
    const/high16 v0, -0x40000000    # -2.0f

    .line 442
    .line 443
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 444
    .line 445
    .line 446
    const/high16 v0, 0x40c00000    # 6.0f

    .line 447
    .line 448
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 449
    .line 450
    .line 451
    const/high16 v0, -0x40000000    # -2.0f

    .line 452
    .line 453
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 454
    .line 455
    .line 456
    const/high16 v0, 0x41600000    # 14.0f

    .line 457
    .line 458
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 459
    .line 460
    .line 461
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 462
    .line 463
    .line 464
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 465
    .line 466
    .line 467
    move-result-object v2

    .line 468
    const/16 v16, 0x3800

    .line 469
    .line 470
    const/16 v17, 0x0

    .line 471
    .line 472
    const/high16 v6, 0x3f800000    # 1.0f

    .line 473
    .line 474
    const/high16 v8, 0x3f800000    # 1.0f

    .line 475
    .line 476
    const/4 v7, 0x0

    .line 477
    const/high16 v9, 0x3f800000    # 1.0f

    .line 478
    .line 479
    const/high16 v12, 0x3f800000    # 1.0f

    .line 480
    .line 481
    const/4 v13, 0x0

    .line 482
    const/4 v15, 0x0

    .line 483
    const-string v4, ""

    .line 484
    .line 485
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 486
    .line 487
    .line 488
    move-result-object v0

    .line 489
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 490
    .line 491
    .line 492
    move-result-object v0

    .line 493
    sput-object v0, Landroidx/compose/material/icons/outlined/AirlineSeatFlatKt;->_airlineSeatFlat:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 494
    .line 495
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 496
    .line 497
    .line 498
    return-object v0
.end method
