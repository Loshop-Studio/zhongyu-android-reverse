.class public final Landroidx/compose/material/icons/rounded/PhoneInTalkKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _phoneInTalk:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getPhoneInTalk(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/PhoneInTalkKt;->_phoneInTalk:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.PhoneInTalk"

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
    const v0, 0x414e147b    # 12.88f

    .line 71
    .line 72
    .line 73
    const v2, 0x40a1999a    # 5.05f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v17, 0x40c23d71    # 6.07f

    .line 80
    .line 81
    .line 82
    const v18, 0x40c23d71    # 6.07f

    .line 83
    .line 84
    .line 85
    const v13, 0x404b851f    # 3.18f

    .line 86
    .line 87
    .line 88
    const v14, 0x3ecccccd    # 0.4f

    .line 89
    .line 90
    .line 91
    const v15, 0x40b570a4    # 5.67f

    .line 92
    .line 93
    .line 94
    const v16, 0x4038f5c3    # 2.89f

    .line 95
    .line 96
    .line 97
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 98
    .line 99
    .line 100
    const v17, 0x3f7d70a4    # 0.99f

    .line 101
    .line 102
    .line 103
    const v18, 0x3f6147ae    # 0.88f

    .line 104
    .line 105
    .line 106
    const v13, 0x3d75c28f    # 0.06f

    .line 107
    .line 108
    .line 109
    const v14, 0x3f028f5c    # 0.51f

    .line 110
    .line 111
    .line 112
    const v15, 0x3efae148    # 0.49f

    .line 113
    .line 114
    .line 115
    const v16, 0x3f6147ae    # 0.88f

    .line 116
    .line 117
    .line 118
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 119
    .line 120
    .line 121
    const v17, 0x3df5c28f    # 0.12f

    .line 122
    .line 123
    .line 124
    const v18, -0x43dc28f6    # -0.01f

    .line 125
    .line 126
    .line 127
    const v13, 0x3d23d70a    # 0.04f

    .line 128
    .line 129
    .line 130
    const/4 v14, 0x0

    .line 131
    const v15, 0x3da3d70a    # 0.08f

    .line 132
    .line 133
    .line 134
    const/16 v16, 0x0

    .line 135
    .line 136
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 137
    .line 138
    .line 139
    const v17, 0x3f5eb852    # 0.87f

    .line 140
    .line 141
    .line 142
    const v18, -0x4070a3d7    # -1.12f

    .line 143
    .line 144
    .line 145
    const v13, 0x3f0ccccd    # 0.55f

    .line 146
    .line 147
    .line 148
    const v14, -0x4270a3d7    # -0.07f

    .line 149
    .line 150
    .line 151
    const v15, 0x3f70a3d7    # 0.94f

    .line 152
    .line 153
    .line 154
    const v16, -0x40ee147b    # -0.57f

    .line 155
    .line 156
    .line 157
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 158
    .line 159
    .line 160
    const v17, -0x3f06147b    # -7.81f

    .line 161
    .line 162
    .line 163
    const v18, -0x3f06147b    # -7.81f

    .line 164
    .line 165
    .line 166
    const v13, -0x40fd70a4    # -0.51f

    .line 167
    .line 168
    .line 169
    const v14, -0x3f7d1eb8    # -4.09f

    .line 170
    .line 171
    .line 172
    const v15, -0x3f91eb85    # -3.72f

    .line 173
    .line 174
    .line 175
    const v16, -0x3f166666    # -7.3f

    .line 176
    .line 177
    .line 178
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 179
    .line 180
    .line 181
    const v17, -0x4071eb85    # -1.11f

    .line 182
    .line 183
    .line 184
    const v18, 0x3f6147ae    # 0.88f

    .line 185
    .line 186
    .line 187
    const v13, -0x40f33333    # -0.55f

    .line 188
    .line 189
    .line 190
    const v14, -0x428a3d71    # -0.06f

    .line 191
    .line 192
    .line 193
    const v15, -0x4079999a    # -1.05f

    .line 194
    .line 195
    .line 196
    const v16, 0x3ea8f5c3    # 0.33f

    .line 197
    .line 198
    .line 199
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 200
    .line 201
    .line 202
    const v17, 0x3f5eb852    # 0.87f

    .line 203
    .line 204
    .line 205
    const v18, 0x3f8e147b    # 1.11f

    .line 206
    .line 207
    .line 208
    const v13, -0x4270a3d7    # -0.07f

    .line 209
    .line 210
    .line 211
    const v14, 0x3f0ccccd    # 0.55f

    .line 212
    .line 213
    .line 214
    const v15, 0x3ea3d70a    # 0.32f

    .line 215
    .line 216
    .line 217
    const v16, 0x3f866666    # 1.05f

    .line 218
    .line 219
    .line 220
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 221
    .line 222
    .line 223
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 224
    .line 225
    .line 226
    const v0, 0x415428f6    # 13.26f

    .line 227
    .line 228
    .line 229
    const v2, 0x40e51eb8    # 7.16f

    .line 230
    .line 231
    .line 232
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 233
    .line 234
    .line 235
    const v17, -0x4063d70a    # -1.22f

    .line 236
    .line 237
    .line 238
    const v18, 0x3f3851ec    # 0.72f

    .line 239
    .line 240
    .line 241
    const v13, -0x40f851ec    # -0.53f

    .line 242
    .line 243
    .line 244
    const v14, -0x41f0a3d7    # -0.14f

    .line 245
    .line 246
    .line 247
    const v15, -0x4075c28f    # -1.08f

    .line 248
    .line 249
    .line 250
    const v16, 0x3e3851ec    # 0.18f

    .line 251
    .line 252
    .line 253
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 254
    .line 255
    .line 256
    const v0, 0x3f3851ec    # 0.72f

    .line 257
    .line 258
    .line 259
    const v2, 0x3f9c28f6    # 1.22f

    .line 260
    .line 261
    .line 262
    const v4, 0x3e3851ec    # 0.18f

    .line 263
    .line 264
    .line 265
    const v6, 0x3f8a3d71    # 1.08f

    .line 266
    .line 267
    .line 268
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 269
    .line 270
    .line 271
    const v17, 0x4009999a    # 2.15f

    .line 272
    .line 273
    .line 274
    const v18, 0x4009999a    # 2.15f

    .line 275
    .line 276
    .line 277
    const v13, 0x3f866666    # 1.05f

    .line 278
    .line 279
    .line 280
    const v14, 0x3e8a3d71    # 0.27f

    .line 281
    .line 282
    .line 283
    const v15, 0x3fef5c29    # 1.87f

    .line 284
    .line 285
    .line 286
    const v16, 0x3f8b851f    # 1.09f

    .line 287
    .line 288
    .line 289
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 290
    .line 291
    .line 292
    const v17, 0x3f7851ec    # 0.97f

    .line 293
    .line 294
    .line 295
    const/high16 v18, 0x3f400000    # 0.75f

    .line 296
    .line 297
    const v13, 0x3df5c28f    # 0.12f

    .line 298
    .line 299
    .line 300
    const v14, 0x3ee66666    # 0.45f

    .line 301
    .line 302
    .line 303
    const v15, 0x3f051eb8    # 0.52f

    .line 304
    .line 305
    .line 306
    const/high16 v16, 0x3f400000    # 0.75f

    .line 307
    .line 308
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 309
    .line 310
    .line 311
    const/high16 v17, 0x3e800000    # 0.25f

    .line 312
    .line 313
    const v18, -0x430a3d71    # -0.03f

    .line 314
    .line 315
    .line 316
    const v13, 0x3da3d70a    # 0.08f

    .line 317
    .line 318
    .line 319
    const/4 v14, 0x0

    .line 320
    const v15, 0x3e2e147b    # 0.17f

    .line 321
    .line 322
    .line 323
    const v16, -0x43dc28f6    # -0.01f

    .line 324
    .line 325
    .line 326
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 327
    .line 328
    .line 329
    const v17, 0x3f3851ec    # 0.72f

    .line 330
    .line 331
    .line 332
    const v18, -0x4063d70a    # -1.22f

    .line 333
    .line 334
    .line 335
    const v13, 0x3f07ae14    # 0.53f

    .line 336
    .line 337
    .line 338
    const v14, -0x41f0a3d7    # -0.14f

    .line 339
    .line 340
    .line 341
    const v15, 0x3f59999a    # 0.85f

    .line 342
    .line 343
    .line 344
    const v16, -0x40cf5c29    # -0.69f

    .line 345
    .line 346
    .line 347
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 348
    .line 349
    .line 350
    const v17, -0x3f9a3d71    # -3.59f

    .line 351
    .line 352
    .line 353
    const v18, -0x3f9a3d71    # -3.59f

    .line 354
    .line 355
    .line 356
    const v13, -0x410f5c29    # -0.47f

    .line 357
    .line 358
    .line 359
    const v14, -0x401d70a4    # -1.77f

    .line 360
    .line 361
    .line 362
    const v15, -0x40147ae1    # -1.84f

    .line 363
    .line 364
    .line 365
    const v16, -0x3fb70a3d    # -3.14f

    .line 366
    .line 367
    .line 368
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 369
    .line 370
    .line 371
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 372
    .line 373
    .line 374
    const v0, 0x4199d70a    # 19.23f

    .line 375
    .line 376
    .line 377
    const v2, 0x417428f6    # 15.26f

    .line 378
    .line 379
    .line 380
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 381
    .line 382
    .line 383
    const v0, -0x3fdd70a4    # -2.54f

    .line 384
    .line 385
    .line 386
    const v2, -0x416b851f    # -0.29f

    .line 387
    .line 388
    .line 389
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 390
    .line 391
    .line 392
    const v17, -0x402e147b    # -1.64f

    .line 393
    .line 394
    .line 395
    const v18, 0x3f11eb85    # 0.57f

    .line 396
    .line 397
    .line 398
    const v13, -0x40e3d70a    # -0.61f

    .line 399
    .line 400
    .line 401
    const v14, -0x4270a3d7    # -0.07f

    .line 402
    .line 403
    .line 404
    const v15, -0x40651eb8    # -1.21f

    .line 405
    .line 406
    .line 407
    const v16, 0x3e0f5c29    # 0.14f

    .line 408
    .line 409
    .line 410
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 411
    .line 412
    .line 413
    const v0, -0x40147ae1    # -1.84f

    .line 414
    .line 415
    .line 416
    const v2, 0x3feb851f    # 1.84f

    .line 417
    .line 418
    .line 419
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 420
    .line 421
    .line 422
    const v17, -0x3f2d1eb8    # -6.59f

    .line 423
    .line 424
    .line 425
    const v18, -0x3f2d1eb8    # -6.59f

    .line 426
    .line 427
    .line 428
    const v13, -0x3fcae148    # -2.83f

    .line 429
    .line 430
    .line 431
    const v14, -0x4047ae14    # -1.44f

    .line 432
    .line 433
    .line 434
    const v15, -0x3f5b3333    # -5.15f

    .line 435
    .line 436
    .line 437
    const/high16 v16, -0x3f900000    # -3.75f

    .line 438
    .line 439
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 440
    .line 441
    .line 442
    const v0, 0x3feccccd    # 1.85f

    .line 443
    .line 444
    .line 445
    const v2, -0x40133333    # -1.85f

    .line 446
    .line 447
    .line 448
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 449
    .line 450
    .line 451
    const v17, 0x3f11eb85    # 0.57f

    .line 452
    .line 453
    .line 454
    const v18, -0x402e147b    # -1.64f

    .line 455
    .line 456
    .line 457
    const v13, 0x3edc28f6    # 0.43f

    .line 458
    .line 459
    .line 460
    const v14, -0x4123d70a    # -0.43f

    .line 461
    .line 462
    .line 463
    const v15, 0x3f23d70a    # 0.64f

    .line 464
    .line 465
    .line 466
    const v16, -0x407c28f6    # -1.03f

    .line 467
    .line 468
    .line 469
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 470
    .line 471
    .line 472
    const v0, -0x3fdeb852    # -2.52f

    .line 473
    .line 474
    .line 475
    const v2, -0x416b851f    # -0.29f

    .line 476
    .line 477
    .line 478
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 479
    .line 480
    .line 481
    const v17, -0x400147ae    # -1.99f

    .line 482
    .line 483
    .line 484
    const v18, -0x401d70a4    # -1.77f

    .line 485
    .line 486
    .line 487
    const v13, -0x420a3d71    # -0.12f

    .line 488
    .line 489
    .line 490
    const v14, -0x407eb852    # -1.01f

    .line 491
    .line 492
    .line 493
    const v15, -0x4087ae14    # -0.97f

    .line 494
    .line 495
    .line 496
    const v16, -0x401d70a4    # -1.77f

    .line 497
    .line 498
    .line 499
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 500
    .line 501
    .line 502
    const v0, 0x40a0f5c3    # 5.03f

    .line 503
    .line 504
    .line 505
    const v2, 0x4040a3d7    # 3.01f

    .line 506
    .line 507
    .line 508
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 509
    .line 510
    .line 511
    const/high16 v17, -0x40000000    # -2.0f

    .line 512
    .line 513
    const v18, 0x40047ae1    # 2.07f

    .line 514
    .line 515
    .line 516
    const v13, -0x406f5c29    # -1.13f

    .line 517
    .line 518
    .line 519
    const/4 v14, 0x0

    .line 520
    const v15, -0x3ffb851f    # -2.07f

    .line 521
    .line 522
    .line 523
    const v16, 0x3f70a3d7    # 0.94f

    .line 524
    .line 525
    .line 526
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 527
    .line 528
    .line 529
    const v17, 0x417e3d71    # 15.89f

    .line 530
    .line 531
    .line 532
    const v18, 0x417e3d71    # 15.89f

    .line 533
    .line 534
    .line 535
    const v13, 0x3f07ae14    # 0.53f

    .line 536
    .line 537
    .line 538
    const v14, 0x4108a3d7    # 8.54f

    .line 539
    .line 540
    .line 541
    const v15, 0x40eb851f    # 7.36f

    .line 542
    .line 543
    .line 544
    const v16, 0x4175c28f    # 15.36f

    .line 545
    .line 546
    .line 547
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 548
    .line 549
    .line 550
    const v17, 0x40047ae1    # 2.07f

    .line 551
    .line 552
    .line 553
    const/high16 v18, -0x40000000    # -2.0f

    .line 554
    .line 555
    const v13, 0x3f90a3d7    # 1.13f

    .line 556
    .line 557
    .line 558
    const v14, 0x3d8f5c29    # 0.07f

    .line 559
    .line 560
    .line 561
    const v15, 0x40047ae1    # 2.07f

    .line 562
    .line 563
    .line 564
    const v16, -0x40a147ae    # -0.87f

    .line 565
    .line 566
    .line 567
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 568
    .line 569
    .line 570
    const v0, -0x40228f5c    # -1.73f

    .line 571
    .line 572
    .line 573
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 574
    .line 575
    .line 576
    const v17, -0x401eb852    # -1.76f

    .line 577
    .line 578
    .line 579
    const v18, -0x40028f5c    # -1.98f

    .line 580
    .line 581
    .line 582
    const v13, 0x3c23d70a    # 0.01f

    .line 583
    .line 584
    .line 585
    const v14, -0x407eb852    # -1.01f

    .line 586
    .line 587
    .line 588
    const/high16 v15, -0x40c00000    # -0.75f

    .line 589
    .line 590
    const v16, -0x4011eb85    # -1.86f

    .line 591
    .line 592
    .line 593
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 594
    .line 595
    .line 596
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 597
    .line 598
    .line 599
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 600
    .line 601
    .line 602
    move-result-object v2

    .line 603
    const/16 v16, 0x3800

    .line 604
    .line 605
    const/16 v17, 0x0

    .line 606
    .line 607
    const/high16 v6, 0x3f800000    # 1.0f

    .line 608
    .line 609
    const/high16 v8, 0x3f800000    # 1.0f

    .line 610
    .line 611
    const/4 v7, 0x0

    .line 612
    const/high16 v9, 0x3f800000    # 1.0f

    .line 613
    .line 614
    const/high16 v12, 0x3f800000    # 1.0f

    .line 615
    .line 616
    const/4 v13, 0x0

    .line 617
    const/4 v14, 0x0

    .line 618
    const/4 v15, 0x0

    .line 619
    const-string v4, ""

    .line 620
    .line 621
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 622
    .line 623
    .line 624
    move-result-object v0

    .line 625
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 626
    .line 627
    .line 628
    move-result-object v0

    .line 629
    sput-object v0, Landroidx/compose/material/icons/rounded/PhoneInTalkKt;->_phoneInTalk:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 630
    .line 631
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 632
    .line 633
    .line 634
    return-object v0
.end method
