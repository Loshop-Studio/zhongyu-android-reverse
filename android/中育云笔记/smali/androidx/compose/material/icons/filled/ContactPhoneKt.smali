.class public final Landroidx/compose/material/icons/filled/ContactPhoneKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _contactPhone:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getContactPhone(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/filled/ContactPhoneKt;->_contactPhone:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Filled.ContactPhone"

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
    const/high16 v0, 0x41b00000    # 22.0f

    .line 71
    .line 72
    const/high16 v2, 0x40400000    # 3.0f

    .line 73
    .line 74
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v0, 0x40000000    # 2.0f

    .line 78
    .line 79
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 80
    .line 81
    .line 82
    const/16 v17, 0x0

    .line 83
    .line 84
    const/high16 v18, 0x40a00000    # 5.0f

    .line 85
    .line 86
    const v13, 0x3f666666    # 0.9f

    .line 87
    .line 88
    .line 89
    const/high16 v14, 0x40400000    # 3.0f

    .line 90
    .line 91
    const/4 v15, 0x0

    .line 92
    const v16, 0x4079999a    # 3.9f

    .line 93
    .line 94
    .line 95
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 96
    .line 97
    .line 98
    const/high16 v0, 0x41600000    # 14.0f

    .line 99
    .line 100
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 101
    .line 102
    .line 103
    const/high16 v17, 0x40000000    # 2.0f

    .line 104
    .line 105
    const/high16 v18, 0x40000000    # 2.0f

    .line 106
    .line 107
    const/4 v13, 0x0

    .line 108
    const v14, 0x3f8ccccd    # 1.1f

    .line 109
    .line 110
    .line 111
    const v15, 0x3f666666    # 0.9f

    .line 112
    .line 113
    .line 114
    const/high16 v16, 0x40000000    # 2.0f

    .line 115
    .line 116
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 117
    .line 118
    .line 119
    const/high16 v0, 0x41a00000    # 20.0f

    .line 120
    .line 121
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 122
    .line 123
    .line 124
    const v17, 0x3ffeb852    # 1.99f

    .line 125
    .line 126
    .line 127
    const/high16 v18, -0x40000000    # -2.0f

    .line 128
    .line 129
    const v13, 0x3f8ccccd    # 1.1f

    .line 130
    .line 131
    .line 132
    const/4 v14, 0x0

    .line 133
    const v15, 0x3ffeb852    # 1.99f

    .line 134
    .line 135
    .line 136
    const v16, -0x4099999a    # -0.9f

    .line 137
    .line 138
    .line 139
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 140
    .line 141
    .line 142
    const/high16 v0, 0x40a00000    # 5.0f

    .line 143
    .line 144
    const/high16 v2, 0x41c00000    # 24.0f

    .line 145
    .line 146
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 147
    .line 148
    .line 149
    const/high16 v17, -0x40000000    # -2.0f

    .line 150
    .line 151
    const/4 v13, 0x0

    .line 152
    const v14, -0x40733333    # -1.1f

    .line 153
    .line 154
    .line 155
    const v15, -0x4099999a    # -0.9f

    .line 156
    .line 157
    .line 158
    const/high16 v16, -0x40000000    # -2.0f

    .line 159
    .line 160
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 161
    .line 162
    .line 163
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 164
    .line 165
    .line 166
    const/high16 v0, 0x41000000    # 8.0f

    .line 167
    .line 168
    const/high16 v2, 0x40c00000    # 6.0f

    .line 169
    .line 170
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 171
    .line 172
    .line 173
    const/high16 v17, 0x40400000    # 3.0f

    .line 174
    .line 175
    const/high16 v18, 0x40400000    # 3.0f

    .line 176
    .line 177
    const v13, 0x3fd47ae1    # 1.66f

    .line 178
    .line 179
    .line 180
    const/4 v14, 0x0

    .line 181
    const/high16 v15, 0x40400000    # 3.0f

    .line 182
    .line 183
    const v16, 0x3fab851f    # 1.34f

    .line 184
    .line 185
    .line 186
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 187
    .line 188
    .line 189
    const v0, -0x40547ae1    # -1.34f

    .line 190
    .line 191
    .line 192
    const/high16 v2, 0x40400000    # 3.0f

    .line 193
    .line 194
    const/high16 v4, -0x3fc00000    # -3.0f

    .line 195
    .line 196
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 197
    .line 198
    .line 199
    const/high16 v2, -0x3fc00000    # -3.0f

    .line 200
    .line 201
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 202
    .line 203
    .line 204
    const v0, 0x3fab851f    # 1.34f

    .line 205
    .line 206
    .line 207
    const/high16 v2, 0x40400000    # 3.0f

    .line 208
    .line 209
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 210
    .line 211
    .line 212
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 213
    .line 214
    .line 215
    const/high16 v0, 0x41900000    # 18.0f

    .line 216
    .line 217
    const/high16 v2, 0x41600000    # 14.0f

    .line 218
    .line 219
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 220
    .line 221
    .line 222
    const/high16 v2, 0x40000000    # 2.0f

    .line 223
    .line 224
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 225
    .line 226
    .line 227
    const/high16 v0, -0x40800000    # -1.0f

    .line 228
    .line 229
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 230
    .line 231
    .line 232
    const/high16 v17, 0x40c00000    # 6.0f

    .line 233
    .line 234
    const v18, -0x3fb9999a    # -3.1f

    .line 235
    .line 236
    .line 237
    const/4 v13, 0x0

    .line 238
    const/high16 v14, -0x40000000    # -2.0f

    .line 239
    .line 240
    const/high16 v15, 0x40800000    # 4.0f

    .line 241
    .line 242
    const v16, -0x3fb9999a    # -3.1f

    .line 243
    .line 244
    .line 245
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 246
    .line 247
    .line 248
    const v0, 0x3f8ccccd    # 1.1f

    .line 249
    .line 250
    .line 251
    const v2, 0x40466666    # 3.1f

    .line 252
    .line 253
    .line 254
    const/high16 v4, 0x40c00000    # 6.0f

    .line 255
    .line 256
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 257
    .line 258
    .line 259
    const/high16 v0, 0x3f800000    # 1.0f

    .line 260
    .line 261
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 262
    .line 263
    .line 264
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 265
    .line 266
    .line 267
    const v0, 0x418ecccd    # 17.85f

    .line 268
    .line 269
    .line 270
    const/high16 v2, 0x41600000    # 14.0f

    .line 271
    .line 272
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 273
    .line 274
    .line 275
    const v0, 0x3fd1eb85    # 1.64f

    .line 276
    .line 277
    .line 278
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 279
    .line 280
    .line 281
    const/high16 v0, 0x41800000    # 16.0f

    .line 282
    .line 283
    const/high16 v2, 0x41a80000    # 21.0f

    .line 284
    .line 285
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 286
    .line 287
    .line 288
    const v0, -0x400147ae    # -1.99f

    .line 289
    .line 290
    .line 291
    const v2, 0x3ffeb852    # 1.99f

    .line 292
    .line 293
    .line 294
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 295
    .line 296
    .line 297
    const v17, -0x3fd147ae    # -2.73f

    .line 298
    .line 299
    .line 300
    const v18, -0x3f80a3d7    # -3.99f

    .line 301
    .line 302
    .line 303
    const v13, -0x405851ec    # -1.31f

    .line 304
    .line 305
    .line 306
    const v14, -0x40851eb8    # -0.98f

    .line 307
    .line 308
    .line 309
    const v15, -0x3fee147b    # -2.28f

    .line 310
    .line 311
    .line 312
    const v16, -0x3fe7ae14    # -2.38f

    .line 313
    .line 314
    .line 315
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 316
    .line 317
    .line 318
    const v17, -0x4170a3d7    # -0.28f

    .line 319
    .line 320
    .line 321
    const/high16 v18, -0x40000000    # -2.0f

    .line 322
    .line 323
    const v13, -0x41c7ae14    # -0.18f

    .line 324
    .line 325
    .line 326
    const v14, -0x40dc28f6    # -0.64f

    .line 327
    .line 328
    .line 329
    const v15, -0x4170a3d7    # -0.28f

    .line 330
    .line 331
    .line 332
    const v16, -0x405851ec    # -1.31f

    .line 333
    .line 334
    .line 335
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 336
    .line 337
    .line 338
    const v0, 0x3e8f5c29    # 0.28f

    .line 339
    .line 340
    .line 341
    const/high16 v2, -0x40000000    # -2.0f

    .line 342
    .line 343
    const v4, 0x3dcccccd    # 0.1f

    .line 344
    .line 345
    .line 346
    const v6, -0x4051eb85    # -1.36f

    .line 347
    .line 348
    .line 349
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 350
    .line 351
    .line 352
    const v17, 0x402eb852    # 2.73f

    .line 353
    .line 354
    .line 355
    const v18, -0x3f80a3d7    # -3.99f

    .line 356
    .line 357
    .line 358
    const v13, 0x3ee66666    # 0.45f

    .line 359
    .line 360
    .line 361
    const v14, -0x4030a3d7    # -1.62f

    .line 362
    .line 363
    .line 364
    const v15, 0x3fb5c28f    # 1.42f

    .line 365
    .line 366
    .line 367
    const v16, -0x3fbf5c29    # -3.01f

    .line 368
    .line 369
    .line 370
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 371
    .line 372
    .line 373
    const/high16 v0, 0x41a80000    # 21.0f

    .line 374
    .line 375
    const/high16 v2, 0x41000000    # 8.0f

    .line 376
    .line 377
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 378
    .line 379
    .line 380
    const v0, -0x403eb852    # -1.51f

    .line 381
    .line 382
    .line 383
    const/high16 v2, 0x40000000    # 2.0f

    .line 384
    .line 385
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 386
    .line 387
    .line 388
    const v0, -0x402e147b    # -1.64f

    .line 389
    .line 390
    .line 391
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 392
    .line 393
    .line 394
    const v17, -0x414ccccd    # -0.35f

    .line 395
    .line 396
    .line 397
    const/high16 v18, 0x40000000    # 2.0f

    .line 398
    .line 399
    const v13, -0x419eb852    # -0.22f

    .line 400
    .line 401
    .line 402
    const v14, 0x3f2147ae    # 0.63f

    .line 403
    .line 404
    .line 405
    const v15, -0x414ccccd    # -0.35f

    .line 406
    .line 407
    .line 408
    const v16, 0x3fa66666    # 1.3f

    .line 409
    .line 410
    .line 411
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 412
    .line 413
    .line 414
    const v0, 0x3faf5c29    # 1.37f

    .line 415
    .line 416
    .line 417
    const v2, 0x3eb33333    # 0.35f

    .line 418
    .line 419
    .line 420
    const/high16 v4, 0x40000000    # 2.0f

    .line 421
    .line 422
    const v6, 0x3e051eb8    # 0.13f

    .line 423
    .line 424
    .line 425
    invoke-virtual {v12, v6, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 426
    .line 427
    .line 428
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 429
    .line 430
    .line 431
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 432
    .line 433
    .line 434
    move-result-object v2

    .line 435
    const/16 v16, 0x3800

    .line 436
    .line 437
    const/16 v17, 0x0

    .line 438
    .line 439
    const/high16 v6, 0x3f800000    # 1.0f

    .line 440
    .line 441
    const/high16 v8, 0x3f800000    # 1.0f

    .line 442
    .line 443
    const/4 v7, 0x0

    .line 444
    const/high16 v9, 0x3f800000    # 1.0f

    .line 445
    .line 446
    const/high16 v12, 0x3f800000    # 1.0f

    .line 447
    .line 448
    const/4 v13, 0x0

    .line 449
    const/4 v14, 0x0

    .line 450
    const/4 v15, 0x0

    .line 451
    const-string v4, ""

    .line 452
    .line 453
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 454
    .line 455
    .line 456
    move-result-object v0

    .line 457
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 458
    .line 459
    .line 460
    move-result-object v0

    .line 461
    sput-object v0, Landroidx/compose/material/icons/filled/ContactPhoneKt;->_contactPhone:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 462
    .line 463
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 464
    .line 465
    .line 466
    return-object v0
.end method
