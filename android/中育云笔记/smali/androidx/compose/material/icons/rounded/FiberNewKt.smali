.class public final Landroidx/compose/material/icons/rounded/FiberNewKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _fiberNew:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getFiberNew(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/FiberNewKt;->_fiberNew:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.FiberNew"

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
    const/high16 v0, 0x41a00000    # 20.0f

    .line 71
    .line 72
    const/high16 v2, 0x40800000    # 4.0f

    .line 73
    .line 74
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v0, 0x40800000    # 4.0f

    .line 78
    .line 79
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 80
    .line 81
    .line 82
    const v17, -0x400147ae    # -1.99f

    .line 83
    .line 84
    .line 85
    const/high16 v18, 0x40000000    # 2.0f

    .line 86
    .line 87
    const v13, -0x4071eb85    # -1.11f

    .line 88
    .line 89
    .line 90
    const/4 v14, 0x0

    .line 91
    const v15, -0x400147ae    # -1.99f

    .line 92
    .line 93
    .line 94
    const v16, 0x3f63d70a    # 0.89f

    .line 95
    .line 96
    .line 97
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 98
    .line 99
    .line 100
    const/high16 v0, 0x40000000    # 2.0f

    .line 101
    .line 102
    const/high16 v2, 0x41900000    # 18.0f

    .line 103
    .line 104
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 105
    .line 106
    .line 107
    const/high16 v17, 0x40000000    # 2.0f

    .line 108
    .line 109
    const/4 v13, 0x0

    .line 110
    const v14, 0x3f8e147b    # 1.11f

    .line 111
    .line 112
    .line 113
    const v15, 0x3f63d70a    # 0.89f

    .line 114
    .line 115
    .line 116
    const/high16 v16, 0x40000000    # 2.0f

    .line 117
    .line 118
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 119
    .line 120
    .line 121
    const/high16 v0, 0x41800000    # 16.0f

    .line 122
    .line 123
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 124
    .line 125
    .line 126
    const/high16 v18, -0x40000000    # -2.0f

    .line 127
    .line 128
    const v13, 0x3f8e147b    # 1.11f

    .line 129
    .line 130
    .line 131
    const/4 v14, 0x0

    .line 132
    const/high16 v15, 0x40000000    # 2.0f

    .line 133
    .line 134
    const v16, -0x409c28f6    # -0.89f

    .line 135
    .line 136
    .line 137
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 138
    .line 139
    .line 140
    const/high16 v0, 0x41b00000    # 22.0f

    .line 141
    .line 142
    const/high16 v2, 0x40c00000    # 6.0f

    .line 143
    .line 144
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 145
    .line 146
    .line 147
    const/high16 v17, -0x40000000    # -2.0f

    .line 148
    .line 149
    const/4 v13, 0x0

    .line 150
    const v14, -0x4071eb85    # -1.11f

    .line 151
    .line 152
    .line 153
    const v15, -0x409c28f6    # -0.89f

    .line 154
    .line 155
    .line 156
    const/high16 v16, -0x40000000    # -2.0f

    .line 157
    .line 158
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 159
    .line 160
    .line 161
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 162
    .line 163
    .line 164
    const/high16 v0, 0x41080000    # 8.5f

    .line 165
    .line 166
    const v2, 0x41635c29    # 14.21f

    .line 167
    .line 168
    .line 169
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 170
    .line 171
    .line 172
    const v17, -0x40b5c28f    # -0.79f

    .line 173
    .line 174
    .line 175
    const v18, 0x3f4a3d71    # 0.79f

    .line 176
    .line 177
    .line 178
    const v14, 0x3edc28f6    # 0.43f

    .line 179
    .line 180
    .line 181
    const v15, -0x4147ae14    # -0.36f

    .line 182
    .line 183
    .line 184
    const v16, 0x3f4a3d71    # 0.79f

    .line 185
    .line 186
    .line 187
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 188
    .line 189
    .line 190
    const v17, -0x40dc28f6    # -0.64f

    .line 191
    .line 192
    .line 193
    const v18, -0x41570a3d    # -0.33f

    .line 194
    .line 195
    .line 196
    const/high16 v13, -0x41800000    # -0.25f

    .line 197
    .line 198
    const/4 v14, 0x0

    .line 199
    const v15, -0x41051eb8    # -0.49f

    .line 200
    .line 201
    .line 202
    const v16, -0x420a3d71    # -0.12f

    .line 203
    .line 204
    .line 205
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 206
    .line 207
    .line 208
    const/high16 v0, 0x40980000    # 4.75f

    .line 209
    .line 210
    const/high16 v2, 0x41380000    # 11.5f

    .line 211
    .line 212
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 213
    .line 214
    .line 215
    const v0, 0x403851ec    # 2.88f

    .line 216
    .line 217
    .line 218
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 219
    .line 220
    .line 221
    const v17, -0x40e147ae    # -0.62f

    .line 222
    .line 223
    .line 224
    const v18, 0x3f1eb852    # 0.62f

    .line 225
    .line 226
    .line 227
    const/4 v13, 0x0

    .line 228
    const v14, 0x3eb33333    # 0.35f

    .line 229
    .line 230
    .line 231
    const v15, -0x4170a3d7    # -0.28f

    .line 232
    .line 233
    .line 234
    const v16, 0x3f1eb852    # 0.62f

    .line 235
    .line 236
    .line 237
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 238
    .line 239
    .line 240
    const v0, -0x4170a3d7    # -0.28f

    .line 241
    .line 242
    .line 243
    const v2, -0x40e147ae    # -0.62f

    .line 244
    .line 245
    .line 246
    const v4, -0x40deb852    # -0.63f

    .line 247
    .line 248
    .line 249
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 250
    .line 251
    .line 252
    const/high16 v0, 0x40600000    # 3.5f

    .line 253
    .line 254
    const v2, 0x411ca3d7    # 9.79f

    .line 255
    .line 256
    .line 257
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 258
    .line 259
    .line 260
    const v17, 0x3f4a3d71    # 0.79f

    .line 261
    .line 262
    .line 263
    const v18, -0x40b5c28f    # -0.79f

    .line 264
    .line 265
    .line 266
    const v14, -0x4123d70a    # -0.43f

    .line 267
    .line 268
    .line 269
    const v15, 0x3eb851ec    # 0.36f

    .line 270
    .line 271
    .line 272
    const v16, -0x40b5c28f    # -0.79f

    .line 273
    .line 274
    .line 275
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 276
    .line 277
    .line 278
    const v0, 0x3d4ccccd    # 0.05f

    .line 279
    .line 280
    .line 281
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 282
    .line 283
    .line 284
    const v17, 0x3f266666    # 0.65f

    .line 285
    .line 286
    .line 287
    const v18, 0x3ea8f5c3    # 0.33f

    .line 288
    .line 289
    .line 290
    const v13, 0x3e851eb8    # 0.26f

    .line 291
    .line 292
    .line 293
    const/4 v14, 0x0

    .line 294
    const/high16 v15, 0x3f000000    # 0.5f

    .line 295
    .line 296
    const v16, 0x3df5c28f    # 0.12f

    .line 297
    .line 298
    .line 299
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 300
    .line 301
    .line 302
    const v0, 0x4010a3d7    # 2.26f

    .line 303
    .line 304
    .line 305
    const v2, 0x404ae148    # 3.17f

    .line 306
    .line 307
    .line 308
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 309
    .line 310
    .line 311
    const/high16 v0, 0x40e80000    # 7.25f

    .line 312
    .line 313
    const v2, 0x4119eb85    # 9.62f

    .line 314
    .line 315
    .line 316
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 317
    .line 318
    .line 319
    const v17, 0x3f2147ae    # 0.63f

    .line 320
    .line 321
    .line 322
    const v18, -0x40e147ae    # -0.62f

    .line 323
    .line 324
    .line 325
    const/4 v13, 0x0

    .line 326
    const v14, -0x4151eb85    # -0.34f

    .line 327
    .line 328
    .line 329
    const v15, 0x3e8f5c29    # 0.28f

    .line 330
    .line 331
    .line 332
    const v16, -0x40e147ae    # -0.62f

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
    const v2, 0x3f1eb852    # 0.62f

    .line 342
    .line 343
    .line 344
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 345
    .line 346
    .line 347
    const v0, 0x4092e148    # 4.59f

    .line 348
    .line 349
    .line 350
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 351
    .line 352
    .line 353
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 354
    .line 355
    .line 356
    const/high16 v0, 0x41580000    # 13.5f

    .line 357
    .line 358
    const v2, 0x411a3d71    # 9.64f

    .line 359
    .line 360
    .line 361
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 362
    .line 363
    .line 364
    const v17, -0x40e147ae    # -0.62f

    .line 365
    .line 366
    .line 367
    const v18, 0x3f1eb852    # 0.62f

    .line 368
    .line 369
    .line 370
    const v14, 0x3eb33333    # 0.35f

    .line 371
    .line 372
    .line 373
    const v15, -0x4170a3d7    # -0.28f

    .line 374
    .line 375
    .line 376
    const v16, 0x3f1eb852    # 0.62f

    .line 377
    .line 378
    .line 379
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 380
    .line 381
    .line 382
    const v0, 0x412428f6    # 10.26f

    .line 383
    .line 384
    .line 385
    const/high16 v2, 0x41300000    # 11.0f

    .line 386
    .line 387
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 388
    .line 389
    .line 390
    const v0, 0x3f8f5c29    # 1.12f

    .line 391
    .line 392
    .line 393
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 394
    .line 395
    .line 396
    const v0, 0x3ff0a3d7    # 1.88f

    .line 397
    .line 398
    .line 399
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 400
    .line 401
    .line 402
    const v17, 0x3f1eb852    # 0.62f

    .line 403
    .line 404
    .line 405
    const v13, 0x3eb33333    # 0.35f

    .line 406
    .line 407
    .line 408
    const/4 v14, 0x0

    .line 409
    const v15, 0x3f1eb852    # 0.62f

    .line 410
    .line 411
    .line 412
    const v16, 0x3e8f5c29    # 0.28f

    .line 413
    .line 414
    .line 415
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 416
    .line 417
    .line 418
    const v0, 0x3c23d70a    # 0.01f

    .line 419
    .line 420
    .line 421
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 422
    .line 423
    .line 424
    const v17, -0x40e147ae    # -0.62f

    .line 425
    .line 426
    .line 427
    const/4 v13, 0x0

    .line 428
    const v14, 0x3eb33333    # 0.35f

    .line 429
    .line 430
    .line 431
    const v15, -0x4170a3d7    # -0.28f

    .line 432
    .line 433
    .line 434
    const v16, 0x3f1eb852    # 0.62f

    .line 435
    .line 436
    .line 437
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 438
    .line 439
    .line 440
    const v0, 0x414a147b    # 12.63f

    .line 441
    .line 442
    .line 443
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 444
    .line 445
    .line 446
    const v0, 0x3f8e147b    # 1.11f

    .line 447
    .line 448
    .line 449
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 450
    .line 451
    .line 452
    const v0, 0x3ff0a3d7    # 1.88f

    .line 453
    .line 454
    .line 455
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 456
    .line 457
    .line 458
    const v17, 0x3f1eb852    # 0.62f

    .line 459
    .line 460
    .line 461
    const v13, 0x3eb33333    # 0.35f

    .line 462
    .line 463
    .line 464
    const/4 v14, 0x0

    .line 465
    const v15, 0x3f1eb852    # 0.62f

    .line 466
    .line 467
    .line 468
    const v16, 0x3e8f5c29    # 0.28f

    .line 469
    .line 470
    .line 471
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 472
    .line 473
    .line 474
    const v17, -0x40e147ae    # -0.62f

    .line 475
    .line 476
    .line 477
    const/4 v13, 0x0

    .line 478
    const v14, 0x3eb33333    # 0.35f

    .line 479
    .line 480
    .line 481
    const v15, -0x4170a3d7    # -0.28f

    .line 482
    .line 483
    .line 484
    const v16, 0x3f1eb852    # 0.62f

    .line 485
    .line 486
    .line 487
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 488
    .line 489
    .line 490
    const v0, -0x3fde147b    # -2.53f

    .line 491
    .line 492
    .line 493
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 494
    .line 495
    .line 496
    const v17, -0x40a66666    # -0.85f

    .line 497
    .line 498
    .line 499
    const v18, -0x40a66666    # -0.85f

    .line 500
    .line 501
    .line 502
    const v13, -0x410f5c29    # -0.47f

    .line 503
    .line 504
    .line 505
    const/4 v14, 0x0

    .line 506
    const v15, -0x40a66666    # -0.85f

    .line 507
    .line 508
    .line 509
    const v16, -0x413d70a4    # -0.38f

    .line 510
    .line 511
    .line 512
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 513
    .line 514
    .line 515
    const v0, -0x3f766666    # -4.3f

    .line 516
    .line 517
    .line 518
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 519
    .line 520
    .line 521
    const v17, 0x3f59999a    # 0.85f

    .line 522
    .line 523
    .line 524
    const v18, -0x40ab851f    # -0.83f

    .line 525
    .line 526
    .line 527
    const/4 v13, 0x0

    .line 528
    const v14, -0x4119999a    # -0.45f

    .line 529
    .line 530
    .line 531
    const v15, 0x3ec28f5c    # 0.38f

    .line 532
    .line 533
    .line 534
    const v16, -0x40ab851f    # -0.83f

    .line 535
    .line 536
    .line 537
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 538
    .line 539
    .line 540
    const v0, 0x4021eb85    # 2.53f

    .line 541
    .line 542
    .line 543
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 544
    .line 545
    .line 546
    const v17, 0x3f1eb852    # 0.62f

    .line 547
    .line 548
    .line 549
    const v18, 0x3f1eb852    # 0.62f

    .line 550
    .line 551
    .line 552
    const v13, 0x3eb33333    # 0.35f

    .line 553
    .line 554
    .line 555
    const/4 v14, 0x0

    .line 556
    const v15, 0x3f1eb852    # 0.62f

    .line 557
    .line 558
    .line 559
    const v16, 0x3e8f5c29    # 0.28f

    .line 560
    .line 561
    .line 562
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 563
    .line 564
    .line 565
    const v0, 0x3ca3d70a    # 0.02f

    .line 566
    .line 567
    .line 568
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 569
    .line 570
    .line 571
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 572
    .line 573
    .line 574
    const/high16 v0, 0x41a40000    # 20.5f

    .line 575
    .line 576
    const/high16 v2, 0x41600000    # 14.0f

    .line 577
    .line 578
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 579
    .line 580
    .line 581
    const/high16 v17, -0x40800000    # -1.0f

    .line 582
    .line 583
    const/high16 v18, 0x3f800000    # 1.0f

    .line 584
    .line 585
    const/4 v13, 0x0

    .line 586
    const v14, 0x3f0ccccd    # 0.55f

    .line 587
    .line 588
    .line 589
    const v15, -0x4119999a    # -0.45f

    .line 590
    .line 591
    .line 592
    const/high16 v16, 0x3f800000    # 1.0f

    .line 593
    .line 594
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 595
    .line 596
    .line 597
    const/high16 v0, -0x3f800000    # -4.0f

    .line 598
    .line 599
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 600
    .line 601
    .line 602
    const/high16 v18, -0x40800000    # -1.0f

    .line 603
    .line 604
    const v13, -0x40f33333    # -0.55f

    .line 605
    .line 606
    .line 607
    const/4 v14, 0x0

    .line 608
    const/high16 v15, -0x40800000    # -1.0f

    .line 609
    .line 610
    const v16, -0x4119999a    # -0.45f

    .line 611
    .line 612
    .line 613
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 614
    .line 615
    .line 616
    const/high16 v0, 0x41680000    # 14.5f

    .line 617
    .line 618
    const v2, 0x4119eb85    # 9.62f

    .line 619
    .line 620
    .line 621
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 622
    .line 623
    .line 624
    const v17, 0x3f1eb852    # 0.62f

    .line 625
    .line 626
    .line 627
    const v18, -0x40e147ae    # -0.62f

    .line 628
    .line 629
    .line 630
    const/4 v13, 0x0

    .line 631
    const v14, -0x4151eb85    # -0.34f

    .line 632
    .line 633
    .line 634
    const v15, 0x3e8f5c29    # 0.28f

    .line 635
    .line 636
    .line 637
    const v16, -0x40e147ae    # -0.62f

    .line 638
    .line 639
    .line 640
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 641
    .line 642
    .line 643
    const v0, 0x3e8f5c29    # 0.28f

    .line 644
    .line 645
    .line 646
    const v2, 0x3f1eb852    # 0.62f

    .line 647
    .line 648
    .line 649
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 650
    .line 651
    .line 652
    const v0, 0x4078f5c3    # 3.89f

    .line 653
    .line 654
    .line 655
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 656
    .line 657
    .line 658
    const v0, 0x3f90a3d7    # 1.13f

    .line 659
    .line 660
    .line 661
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 662
    .line 663
    .line 664
    const v0, -0x3fc66666    # -2.9f

    .line 665
    .line 666
    .line 667
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 668
    .line 669
    .line 670
    const v14, -0x414ccccd    # -0.35f

    .line 671
    .line 672
    .line 673
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 674
    .line 675
    .line 676
    const v0, 0x3e8f5c29    # 0.28f

    .line 677
    .line 678
    .line 679
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 680
    .line 681
    .line 682
    const v0, 0x4038f5c3    # 2.89f

    .line 683
    .line 684
    .line 685
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 686
    .line 687
    .line 688
    const v0, 0x3f8f5c29    # 1.12f

    .line 689
    .line 690
    .line 691
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 692
    .line 693
    .line 694
    const v0, 0x4199d70a    # 19.23f

    .line 695
    .line 696
    .line 697
    const v2, 0x4119eb85    # 9.62f

    .line 698
    .line 699
    .line 700
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 701
    .line 702
    .line 703
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 704
    .line 705
    .line 706
    const v0, 0x3e8f5c29    # 0.28f

    .line 707
    .line 708
    .line 709
    const v2, 0x3f1eb852    # 0.62f

    .line 710
    .line 711
    .line 712
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 713
    .line 714
    .line 715
    const v0, 0x41a3c28f    # 20.47f

    .line 716
    .line 717
    .line 718
    const/high16 v2, 0x41600000    # 14.0f

    .line 719
    .line 720
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 721
    .line 722
    .line 723
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 724
    .line 725
    .line 726
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 727
    .line 728
    .line 729
    move-result-object v2

    .line 730
    const/16 v16, 0x3800

    .line 731
    .line 732
    const/16 v17, 0x0

    .line 733
    .line 734
    const/high16 v6, 0x3f800000    # 1.0f

    .line 735
    .line 736
    const/high16 v8, 0x3f800000    # 1.0f

    .line 737
    .line 738
    const/4 v7, 0x0

    .line 739
    const/high16 v9, 0x3f800000    # 1.0f

    .line 740
    .line 741
    const/high16 v12, 0x3f800000    # 1.0f

    .line 742
    .line 743
    const/4 v14, 0x0

    .line 744
    const/4 v15, 0x0

    .line 745
    const-string v4, ""

    .line 746
    .line 747
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 748
    .line 749
    .line 750
    move-result-object v0

    .line 751
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 752
    .line 753
    .line 754
    move-result-object v0

    .line 755
    sput-object v0, Landroidx/compose/material/icons/rounded/FiberNewKt;->_fiberNew:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 756
    .line 757
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 758
    .line 759
    .line 760
    return-object v0
.end method
