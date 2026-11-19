.class public final Landroidx/compose/material/icons/outlined/SupervisedUserCircleKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _supervisedUserCircle:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getSupervisedUserCircle(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/outlined/SupervisedUserCircleKt;->_supervisedUserCircle:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Outlined.SupervisedUserCircle"

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
    const/high16 v0, 0x41480000    # 12.5f

    .line 71
    .line 72
    const/high16 v2, 0x41200000    # 10.0f

    .line 73
    .line 74
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v17, -0x3fc00000    # -3.0f

    .line 78
    .line 79
    const/high16 v18, -0x3fc00000    # -3.0f

    .line 80
    .line 81
    const/4 v13, 0x0

    .line 82
    const v14, -0x402ccccd    # -1.65f

    .line 83
    .line 84
    .line 85
    const v15, -0x40533333    # -1.35f

    .line 86
    .line 87
    .line 88
    const/high16 v16, -0x3fc00000    # -3.0f

    .line 89
    .line 90
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 91
    .line 92
    .line 93
    const v0, 0x3faccccd    # 1.35f

    .line 94
    .line 95
    .line 96
    const/high16 v2, -0x3fc00000    # -3.0f

    .line 97
    .line 98
    const/high16 v4, 0x40400000    # 3.0f

    .line 99
    .line 100
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 101
    .line 102
    .line 103
    const/high16 v2, 0x40400000    # 3.0f

    .line 104
    .line 105
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 106
    .line 107
    .line 108
    const v0, -0x40533333    # -1.35f

    .line 109
    .line 110
    .line 111
    const/high16 v2, -0x3fc00000    # -3.0f

    .line 112
    .line 113
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 114
    .line 115
    .line 116
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 117
    .line 118
    .line 119
    const/high16 v0, 0x41180000    # 9.5f

    .line 120
    .line 121
    const/high16 v2, 0x41300000    # 11.0f

    .line 122
    .line 123
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 124
    .line 125
    .line 126
    const/high16 v17, -0x40800000    # -1.0f

    .line 127
    .line 128
    const/high16 v18, -0x40800000    # -1.0f

    .line 129
    .line 130
    const v13, -0x40f33333    # -0.55f

    .line 131
    .line 132
    .line 133
    const/4 v14, 0x0

    .line 134
    const/high16 v15, -0x40800000    # -1.0f

    .line 135
    .line 136
    const v16, -0x4119999a    # -0.45f

    .line 137
    .line 138
    .line 139
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 140
    .line 141
    .line 142
    const v0, 0x3ee66666    # 0.45f

    .line 143
    .line 144
    .line 145
    const/high16 v2, -0x40800000    # -1.0f

    .line 146
    .line 147
    const/high16 v4, 0x3f800000    # 1.0f

    .line 148
    .line 149
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 150
    .line 151
    .line 152
    const/high16 v2, 0x3f800000    # 1.0f

    .line 153
    .line 154
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 155
    .line 156
    .line 157
    const v0, -0x4119999a    # -0.45f

    .line 158
    .line 159
    .line 160
    const/high16 v2, -0x40800000    # -1.0f

    .line 161
    .line 162
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 163
    .line 164
    .line 165
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 166
    .line 167
    .line 168
    const/high16 v0, 0x41800000    # 16.0f

    .line 169
    .line 170
    const/high16 v2, 0x41500000    # 13.0f

    .line 171
    .line 172
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 173
    .line 174
    .line 175
    const/high16 v17, 0x40000000    # 2.0f

    .line 176
    .line 177
    const/high16 v18, -0x40000000    # -2.0f

    .line 178
    .line 179
    const v13, 0x3f8e147b    # 1.11f

    .line 180
    .line 181
    .line 182
    const/high16 v15, 0x40000000    # 2.0f

    .line 183
    .line 184
    const v16, -0x409c28f6    # -0.89f

    .line 185
    .line 186
    .line 187
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 188
    .line 189
    .line 190
    const/high16 v17, -0x40000000    # -2.0f

    .line 191
    .line 192
    const/4 v13, 0x0

    .line 193
    const v14, -0x4071eb85    # -1.11f

    .line 194
    .line 195
    .line 196
    const v15, -0x409c28f6    # -0.89f

    .line 197
    .line 198
    .line 199
    const/high16 v16, -0x40000000    # -2.0f

    .line 200
    .line 201
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 202
    .line 203
    .line 204
    const/high16 v18, 0x40000000    # 2.0f

    .line 205
    .line 206
    const v13, -0x4071eb85    # -1.11f

    .line 207
    .line 208
    .line 209
    const/4 v14, 0x0

    .line 210
    const v15, -0x3fff5c29    # -2.01f

    .line 211
    .line 212
    .line 213
    const v16, 0x3f63d70a    # 0.89f

    .line 214
    .line 215
    .line 216
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 217
    .line 218
    .line 219
    const/high16 v17, 0x40000000    # 2.0f

    .line 220
    .line 221
    const/4 v13, 0x0

    .line 222
    const v14, 0x3f8e147b    # 1.11f

    .line 223
    .line 224
    .line 225
    const v15, 0x3f63d70a    # 0.89f

    .line 226
    .line 227
    .line 228
    const/high16 v16, 0x40000000    # 2.0f

    .line 229
    .line 230
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 231
    .line 232
    .line 233
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 234
    .line 235
    .line 236
    const v0, 0x413fd70a    # 11.99f

    .line 237
    .line 238
    .line 239
    const v2, 0x4000a3d7    # 2.01f

    .line 240
    .line 241
    .line 242
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 243
    .line 244
    .line 245
    const/high16 v17, -0x3ee00000    # -10.0f

    .line 246
    .line 247
    const/high16 v18, 0x41200000    # 10.0f

    .line 248
    .line 249
    const v13, -0x3f4f5c29    # -5.52f

    .line 250
    .line 251
    .line 252
    const/4 v14, 0x0

    .line 253
    const/high16 v15, -0x3ee00000    # -10.0f

    .line 254
    .line 255
    const v16, 0x408f5c29    # 4.48f

    .line 256
    .line 257
    .line 258
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 259
    .line 260
    .line 261
    const v0, 0x408f5c29    # 4.48f

    .line 262
    .line 263
    .line 264
    const/high16 v2, 0x41200000    # 10.0f

    .line 265
    .line 266
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 267
    .line 268
    .line 269
    const v0, -0x3f70a3d7    # -4.48f

    .line 270
    .line 271
    .line 272
    const/high16 v2, -0x3ee00000    # -10.0f

    .line 273
    .line 274
    const/high16 v4, 0x41200000    # 10.0f

    .line 275
    .line 276
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 277
    .line 278
    .line 279
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 280
    .line 281
    .line 282
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 283
    .line 284
    .line 285
    const v0, 0x40bae148    # 5.84f

    .line 286
    .line 287
    .line 288
    const v2, 0x4188f5c3    # 17.12f

    .line 289
    .line 290
    .line 291
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 292
    .line 293
    .line 294
    const v17, 0x406a3d71    # 3.66f

    .line 295
    .line 296
    .line 297
    const v18, -0x4071eb85    # -1.11f

    .line 298
    .line 299
    .line 300
    const v13, 0x3f2e147b    # 0.68f

    .line 301
    .line 302
    .line 303
    const v14, -0x40f5c28f    # -0.54f

    .line 304
    .line 305
    .line 306
    const v15, 0x401147ae    # 2.27f

    .line 307
    .line 308
    .line 309
    const v16, -0x4071eb85    # -1.11f

    .line 310
    .line 311
    .line 312
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 313
    .line 314
    .line 315
    const v17, 0x3e6b851f    # 0.23f

    .line 316
    .line 317
    .line 318
    const v18, 0x3c23d70a    # 0.01f

    .line 319
    .line 320
    .line 321
    const v13, 0x3d8f5c29    # 0.07f

    .line 322
    .line 323
    .line 324
    const/4 v14, 0x0

    .line 325
    const v15, 0x3e19999a    # 0.15f

    .line 326
    .line 327
    .line 328
    const v16, 0x3c23d70a    # 0.01f

    .line 329
    .line 330
    .line 331
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 332
    .line 333
    .line 334
    const v17, 0x3fa66666    # 1.3f

    .line 335
    .line 336
    .line 337
    const v18, -0x4011eb85    # -1.86f

    .line 338
    .line 339
    .line 340
    const v13, 0x3e75c28f    # 0.24f

    .line 341
    .line 342
    .line 343
    const v14, -0x40dc28f6    # -0.64f

    .line 344
    .line 345
    .line 346
    const v15, 0x3f2b851f    # 0.67f

    .line 347
    .line 348
    .line 349
    const v16, -0x405ae148    # -1.29f

    .line 350
    .line 351
    .line 352
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 353
    .line 354
    .line 355
    const v17, -0x403c28f6    # -1.53f

    .line 356
    .line 357
    .line 358
    const v18, -0x41dc28f6    # -0.16f

    .line 359
    .line 360
    .line 361
    const v13, -0x40f0a3d7    # -0.56f

    .line 362
    .line 363
    .line 364
    const v14, -0x42333333    # -0.1f

    .line 365
    .line 366
    .line 367
    const v15, -0x40747ae1    # -1.09f

    .line 368
    .line 369
    .line 370
    const v16, -0x41dc28f6    # -0.16f

    .line 371
    .line 372
    .line 373
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 374
    .line 375
    .line 376
    const v17, -0x3f68a3d7    # -4.73f

    .line 377
    .line 378
    .line 379
    const v18, 0x3fb70a3d    # 1.43f

    .line 380
    .line 381
    .line 382
    const v13, -0x4059999a    # -1.3f

    .line 383
    .line 384
    .line 385
    const/4 v14, 0x0

    .line 386
    const v15, -0x3fa70a3d    # -3.39f

    .line 387
    .line 388
    .line 389
    const v16, 0x3ee66666    # 0.45f

    .line 390
    .line 391
    .line 392
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 393
    .line 394
    .line 395
    const v17, -0x40b851ec    # -0.78f

    .line 396
    .line 397
    .line 398
    const v18, -0x3fa47ae1    # -3.43f

    .line 399
    .line 400
    .line 401
    const/high16 v13, -0x41000000    # -0.5f

    .line 402
    .line 403
    const v14, -0x407ae148    # -1.04f

    .line 404
    .line 405
    .line 406
    const v15, -0x40b851ec    # -0.78f

    .line 407
    .line 408
    .line 409
    const v16, -0x3ff33333    # -2.2f

    .line 410
    .line 411
    .line 412
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 413
    .line 414
    .line 415
    const/high16 v17, 0x41000000    # 8.0f

    .line 416
    .line 417
    const/high16 v18, -0x3f000000    # -8.0f

    .line 418
    .line 419
    const/4 v13, 0x0

    .line 420
    const v14, -0x3f72e148    # -4.41f

    .line 421
    .line 422
    .line 423
    const v15, 0x4065c28f    # 3.59f

    .line 424
    .line 425
    .line 426
    const/high16 v16, -0x3f000000    # -8.0f

    .line 427
    .line 428
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 429
    .line 430
    .line 431
    const v0, 0x4065c28f    # 3.59f

    .line 432
    .line 433
    .line 434
    const/high16 v2, 0x41000000    # 8.0f

    .line 435
    .line 436
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 437
    .line 438
    .line 439
    const/high16 v17, -0x40c00000    # -0.75f

    .line 440
    .line 441
    const v18, 0x4057ae14    # 3.37f

    .line 442
    .line 443
    .line 444
    const v14, 0x3f99999a    # 1.2f

    .line 445
    .line 446
    .line 447
    const v15, -0x4175c28f    # -0.27f

    .line 448
    .line 449
    .line 450
    const v16, 0x4015c28f    # 2.34f

    .line 451
    .line 452
    .line 453
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 454
    .line 455
    .line 456
    const v17, -0x3fb0a3d7    # -3.24f

    .line 457
    .line 458
    .line 459
    const v18, -0x40a147ae    # -0.87f

    .line 460
    .line 461
    .line 462
    const/high16 v13, -0x40800000    # -1.0f

    .line 463
    .line 464
    const v14, -0x40e8f5c3    # -0.59f

    .line 465
    .line 466
    .line 467
    const v15, -0x3fe8f5c3    # -2.36f

    .line 468
    .line 469
    .line 470
    const v16, -0x40a147ae    # -0.87f

    .line 471
    .line 472
    .line 473
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 474
    .line 475
    .line 476
    const/high16 v17, -0x3f700000    # -4.5f

    .line 477
    .line 478
    const v18, 0x402ccccd    # 2.7f

    .line 479
    .line 480
    .line 481
    const v13, -0x403d70a4    # -1.52f

    .line 482
    .line 483
    .line 484
    const/4 v14, 0x0

    .line 485
    const/high16 v15, -0x3f700000    # -4.5f

    .line 486
    .line 487
    const v16, 0x3f4f5c29    # 0.81f

    .line 488
    .line 489
    .line 490
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 491
    .line 492
    .line 493
    const v0, 0x4031eb85    # 2.78f

    .line 494
    .line 495
    .line 496
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 497
    .line 498
    .line 499
    const v17, -0x3f4ae148    # -5.66f

    .line 500
    .line 501
    .line 502
    const v18, -0x3fc8f5c3    # -2.86f

    .line 503
    .line 504
    .line 505
    const v13, -0x3feeb852    # -2.27f

    .line 506
    .line 507
    .line 508
    const v14, -0x41fae148    # -0.13f

    .line 509
    .line 510
    .line 511
    const v15, -0x3f76b852    # -4.29f

    .line 512
    .line 513
    .line 514
    const v16, -0x40651eb8    # -1.21f

    .line 515
    .line 516
    .line 517
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 518
    .line 519
    .line 520
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 521
    .line 522
    .line 523
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 524
    .line 525
    .line 526
    move-result-object v2

    .line 527
    const/16 v16, 0x3800

    .line 528
    .line 529
    const/16 v17, 0x0

    .line 530
    .line 531
    const/high16 v6, 0x3f800000    # 1.0f

    .line 532
    .line 533
    const/high16 v8, 0x3f800000    # 1.0f

    .line 534
    .line 535
    const/4 v7, 0x0

    .line 536
    const/high16 v9, 0x3f800000    # 1.0f

    .line 537
    .line 538
    const/high16 v12, 0x3f800000    # 1.0f

    .line 539
    .line 540
    const/4 v13, 0x0

    .line 541
    const/4 v14, 0x0

    .line 542
    const/4 v15, 0x0

    .line 543
    const-string v4, ""

    .line 544
    .line 545
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 546
    .line 547
    .line 548
    move-result-object v0

    .line 549
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 550
    .line 551
    .line 552
    move-result-object v0

    .line 553
    sput-object v0, Landroidx/compose/material/icons/outlined/SupervisedUserCircleKt;->_supervisedUserCircle:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 554
    .line 555
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 556
    .line 557
    .line 558
    return-object v0
.end method
