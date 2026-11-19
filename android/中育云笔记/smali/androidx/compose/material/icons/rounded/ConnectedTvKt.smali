.class public final Landroidx/compose/material/icons/rounded/ConnectedTvKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _connectedTv:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getConnectedTv(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/ConnectedTvKt;->_connectedTv:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.ConnectedTv"

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
    const/high16 v0, 0x40400000    # 3.0f

    .line 71
    .line 72
    const/high16 v2, 0x41a00000    # 20.0f

    .line 73
    .line 74
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v0, 0x40800000    # 4.0f

    .line 78
    .line 79
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 80
    .line 81
    .line 82
    const/high16 v17, 0x40000000    # 2.0f

    .line 83
    .line 84
    const/high16 v18, 0x40a00000    # 5.0f

    .line 85
    .line 86
    const v13, 0x4039999a    # 2.9f

    .line 87
    .line 88
    .line 89
    const/high16 v14, 0x40400000    # 3.0f

    .line 90
    .line 91
    const/high16 v15, 0x40000000    # 2.0f

    .line 92
    .line 93
    const v16, 0x4079999a    # 3.9f

    .line 94
    .line 95
    .line 96
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 97
    .line 98
    .line 99
    const/high16 v0, 0x41400000    # 12.0f

    .line 100
    .line 101
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 102
    .line 103
    .line 104
    const/high16 v18, 0x40000000    # 2.0f

    .line 105
    .line 106
    const/4 v13, 0x0

    .line 107
    const v14, 0x3f8ccccd    # 1.1f

    .line 108
    .line 109
    .line 110
    const v15, 0x3f666666    # 0.9f

    .line 111
    .line 112
    .line 113
    const/high16 v16, 0x40000000    # 2.0f

    .line 114
    .line 115
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 116
    .line 117
    .line 118
    const/high16 v0, 0x40800000    # 4.0f

    .line 119
    .line 120
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 121
    .line 122
    .line 123
    const/high16 v0, 0x3f800000    # 1.0f

    .line 124
    .line 125
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 126
    .line 127
    .line 128
    const/high16 v17, 0x3f800000    # 1.0f

    .line 129
    .line 130
    const/high16 v18, 0x3f800000    # 1.0f

    .line 131
    .line 132
    const v14, 0x3f0ccccd    # 0.55f

    .line 133
    .line 134
    .line 135
    const v15, 0x3ee66666    # 0.45f

    .line 136
    .line 137
    .line 138
    const/high16 v16, 0x3f800000    # 1.0f

    .line 139
    .line 140
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 141
    .line 142
    .line 143
    const/high16 v0, 0x40c00000    # 6.0f

    .line 144
    .line 145
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 146
    .line 147
    .line 148
    const/high16 v18, -0x40800000    # -1.0f

    .line 149
    .line 150
    const v13, 0x3f0ccccd    # 0.55f

    .line 151
    .line 152
    .line 153
    const/4 v14, 0x0

    .line 154
    const/high16 v15, 0x3f800000    # 1.0f

    .line 155
    .line 156
    const v16, -0x4119999a    # -0.45f

    .line 157
    .line 158
    .line 159
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 160
    .line 161
    .line 162
    const/high16 v0, -0x40800000    # -1.0f

    .line 163
    .line 164
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 165
    .line 166
    .line 167
    const/high16 v0, 0x40800000    # 4.0f

    .line 168
    .line 169
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 170
    .line 171
    .line 172
    const v17, 0x3ffeb852    # 1.99f

    .line 173
    .line 174
    .line 175
    const/high16 v18, -0x40000000    # -2.0f

    .line 176
    .line 177
    const v13, 0x3f8ccccd    # 1.1f

    .line 178
    .line 179
    .line 180
    const v15, 0x3ffeb852    # 1.99f

    .line 181
    .line 182
    .line 183
    const v16, -0x4099999a    # -0.9f

    .line 184
    .line 185
    .line 186
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 187
    .line 188
    .line 189
    const/high16 v0, 0x41b00000    # 22.0f

    .line 190
    .line 191
    const/high16 v2, 0x40a00000    # 5.0f

    .line 192
    .line 193
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 194
    .line 195
    .line 196
    const/high16 v17, 0x41a00000    # 20.0f

    .line 197
    .line 198
    const/high16 v18, 0x40400000    # 3.0f

    .line 199
    .line 200
    const/high16 v13, 0x41b00000    # 22.0f

    .line 201
    .line 202
    const v14, 0x4079999a    # 3.9f

    .line 203
    .line 204
    .line 205
    const v15, 0x41a8cccd    # 21.1f

    .line 206
    .line 207
    .line 208
    const/high16 v16, 0x40400000    # 3.0f

    .line 209
    .line 210
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 211
    .line 212
    .line 213
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 214
    .line 215
    .line 216
    const/high16 v0, 0x41880000    # 17.0f

    .line 217
    .line 218
    const/high16 v2, 0x41a00000    # 20.0f

    .line 219
    .line 220
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 221
    .line 222
    .line 223
    const/high16 v0, 0x40800000    # 4.0f

    .line 224
    .line 225
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 226
    .line 227
    .line 228
    const/high16 v0, 0x40a00000    # 5.0f

    .line 229
    .line 230
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 231
    .line 232
    .line 233
    const/high16 v0, 0x41800000    # 16.0f

    .line 234
    .line 235
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 236
    .line 237
    .line 238
    const/high16 v0, 0x41880000    # 17.0f

    .line 239
    .line 240
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 241
    .line 242
    .line 243
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 244
    .line 245
    .line 246
    const/high16 v0, 0x40e00000    # 7.0f

    .line 247
    .line 248
    const v2, 0x417f851f    # 15.97f

    .line 249
    .line 250
    .line 251
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 252
    .line 253
    .line 254
    const v17, 0x40a0f5c3    # 5.03f

    .line 255
    .line 256
    .line 257
    const/high16 v18, 0x41600000    # 14.0f

    .line 258
    .line 259
    const v13, 0x40df5c29    # 6.98f

    .line 260
    .line 261
    .line 262
    const v14, 0x416e3d71    # 14.89f

    .line 263
    .line 264
    .line 265
    const v15, 0x40c3851f    # 6.11f

    .line 266
    .line 267
    .line 268
    const v16, 0x416051ec    # 14.02f

    .line 269
    .line 270
    .line 271
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 272
    .line 273
    .line 274
    const/high16 v0, 0x40a00000    # 5.0f

    .line 275
    .line 276
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 277
    .line 278
    .line 279
    const/high16 v0, 0x40000000    # 2.0f

    .line 280
    .line 281
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 282
    .line 283
    .line 284
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 285
    .line 286
    .line 287
    const v0, 0x417f851f    # 15.97f

    .line 288
    .line 289
    .line 290
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 291
    .line 292
    .line 293
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 294
    .line 295
    .line 296
    const v0, 0x40b3d70a    # 5.62f

    .line 297
    .line 298
    .line 299
    const v2, 0x4148cccd    # 12.55f

    .line 300
    .line 301
    .line 302
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 303
    .line 304
    .line 305
    const v17, 0x40351eb8    # 2.83f

    .line 306
    .line 307
    .line 308
    const v18, 0x4035c28f    # 2.84f

    .line 309
    .line 310
    .line 311
    const v13, 0x3fb851ec    # 1.44f

    .line 312
    .line 313
    .line 314
    const v14, 0x3e851eb8    # 0.26f

    .line 315
    .line 316
    .line 317
    const v15, 0x40251eb8    # 2.58f

    .line 318
    .line 319
    .line 320
    const v16, 0x3fb33333    # 1.4f

    .line 321
    .line 322
    .line 323
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 324
    .line 325
    .line 326
    const v17, 0x4112e148    # 9.18f

    .line 327
    .line 328
    .line 329
    const/high16 v18, 0x41800000    # 16.0f

    .line 330
    .line 331
    const v13, 0x410828f6    # 8.51f

    .line 332
    .line 333
    .line 334
    const/high16 v14, 0x417c0000    # 15.75f

    .line 335
    .line 336
    const v15, 0x410d1eb8    # 8.82f

    .line 337
    .line 338
    .line 339
    const/high16 v16, 0x41800000    # 16.0f

    .line 340
    .line 341
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 342
    .line 343
    .line 344
    const/4 v0, 0x0

    .line 345
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 346
    .line 347
    .line 348
    const/high16 v17, 0x3f400000    # 0.75f

    .line 349
    .line 350
    const v18, -0x40a3d70a    # -0.86f

    .line 351
    .line 352
    .line 353
    const v13, 0x3eeb851f    # 0.46f

    .line 354
    .line 355
    .line 356
    const/4 v14, 0x0

    .line 357
    const v15, 0x3f51eb85    # 0.82f

    .line 358
    .line 359
    .line 360
    const v16, -0x412e147b    # -0.41f

    .line 361
    .line 362
    .line 363
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 364
    .line 365
    .line 366
    const v17, -0x3f7e147b    # -4.06f

    .line 367
    .line 368
    .line 369
    const v18, -0x3f7e147b    # -4.06f

    .line 370
    .line 371
    .line 372
    const v13, -0x4147ae14    # -0.36f

    .line 373
    .line 374
    .line 375
    const v14, -0x3ffb851f    # -2.07f

    .line 376
    .line 377
    .line 378
    const v15, -0x400147ae    # -1.99f

    .line 379
    .line 380
    .line 381
    const v16, -0x3f933333    # -3.7f

    .line 382
    .line 383
    .line 384
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 385
    .line 386
    .line 387
    const/high16 v17, 0x40a00000    # 5.0f

    .line 388
    .line 389
    const v18, 0x413d1eb8    # 11.82f

    .line 390
    .line 391
    .line 392
    const v13, 0x40ad1eb8    # 5.41f

    .line 393
    .line 394
    .line 395
    const/high16 v14, 0x41300000    # 11.0f

    .line 396
    .line 397
    const/high16 v15, 0x40a00000    # 5.0f

    .line 398
    .line 399
    const v16, 0x4135c28f    # 11.36f

    .line 400
    .line 401
    .line 402
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 403
    .line 404
    .line 405
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 406
    .line 407
    .line 408
    const v17, 0x40b3d70a    # 5.62f

    .line 409
    .line 410
    .line 411
    const v18, 0x4148cccd    # 12.55f

    .line 412
    .line 413
    .line 414
    const/high16 v13, 0x40a00000    # 5.0f

    .line 415
    .line 416
    const v14, 0x41430a3d    # 12.19f

    .line 417
    .line 418
    .line 419
    const v15, 0x40a851ec    # 5.26f

    .line 420
    .line 421
    .line 422
    const v16, 0x4147d70a    # 12.49f

    .line 423
    .line 424
    .line 425
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 426
    .line 427
    .line 428
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 429
    .line 430
    .line 431
    const v0, 0x40b47ae1    # 5.64f

    .line 432
    .line 433
    .line 434
    const v2, 0x41187ae1    # 9.53f

    .line 435
    .line 436
    .line 437
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 438
    .line 439
    .line 440
    const v17, 0x40ba8f5c    # 5.83f

    .line 441
    .line 442
    .line 443
    const v18, 0x40ba3d71    # 5.82f

    .line 444
    .line 445
    .line 446
    const v13, 0x40447ae1    # 3.07f

    .line 447
    .line 448
    .line 449
    const v14, 0x3e99999a    # 0.3f

    .line 450
    .line 451
    .line 452
    const v15, 0x40b0a3d7    # 5.52f

    .line 453
    .line 454
    .line 455
    const/high16 v16, 0x40300000    # 2.75f

    .line 456
    .line 457
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 458
    .line 459
    .line 460
    const v17, 0x3f3d70a4    # 0.74f

    .line 461
    .line 462
    .line 463
    const v18, 0x3f266666    # 0.65f

    .line 464
    .line 465
    .line 466
    const v13, 0x3d23d70a    # 0.04f

    .line 467
    .line 468
    .line 469
    const v14, 0x3ebd70a4    # 0.37f

    .line 470
    .line 471
    .line 472
    const v15, 0x3ebd70a4    # 0.37f

    .line 473
    .line 474
    .line 475
    const v16, 0x3f266666    # 0.65f

    .line 476
    .line 477
    .line 478
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 479
    .line 480
    .line 481
    const/high16 v17, 0x3f400000    # 0.75f

    .line 482
    .line 483
    const v18, -0x40a66666    # -0.85f

    .line 484
    .line 485
    .line 486
    const v13, 0x3ee66666    # 0.45f

    .line 487
    .line 488
    .line 489
    const/4 v14, 0x0

    .line 490
    const v15, 0x3f4a3d71    # 0.79f

    .line 491
    .line 492
    .line 493
    const v16, -0x41333333    # -0.4f

    .line 494
    .line 495
    .line 496
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 497
    .line 498
    .line 499
    const v17, -0x3f1c7ae1    # -7.11f

    .line 500
    .line 501
    .line 502
    const v18, -0x3f1ccccd    # -7.1f

    .line 503
    .line 504
    .line 505
    const v13, -0x41333333    # -0.4f

    .line 506
    .line 507
    .line 508
    const v14, -0x3f90a3d7    # -3.74f

    .line 509
    .line 510
    .line 511
    const v15, -0x3fa851ec    # -3.37f

    .line 512
    .line 513
    .line 514
    const v16, -0x3f2947ae    # -6.71f

    .line 515
    .line 516
    .line 517
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 518
    .line 519
    .line 520
    const/high16 v17, 0x40a00000    # 5.0f

    .line 521
    .line 522
    const v18, 0x410ca3d7    # 8.79f

    .line 523
    .line 524
    .line 525
    const v13, 0x40accccd    # 5.4f

    .line 526
    .line 527
    .line 528
    const/high16 v14, 0x41000000    # 8.0f

    .line 529
    .line 530
    const/high16 v15, 0x40a00000    # 5.0f

    .line 531
    .line 532
    const v16, 0x410570a4    # 8.34f

    .line 533
    .line 534
    .line 535
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 536
    .line 537
    .line 538
    const v17, 0x40b47ae1    # 5.64f

    .line 539
    .line 540
    .line 541
    const v18, 0x41187ae1    # 9.53f

    .line 542
    .line 543
    .line 544
    const/high16 v13, 0x40a00000    # 5.0f

    .line 545
    .line 546
    const v14, 0x41128f5c    # 9.16f

    .line 547
    .line 548
    .line 549
    const v15, 0x40a8a3d7    # 5.27f

    .line 550
    .line 551
    .line 552
    const/high16 v16, 0x41180000    # 9.5f

    .line 553
    .line 554
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 555
    .line 556
    .line 557
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 558
    .line 559
    .line 560
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 561
    .line 562
    .line 563
    move-result-object v2

    .line 564
    const/16 v16, 0x3800

    .line 565
    .line 566
    const/16 v17, 0x0

    .line 567
    .line 568
    const/high16 v6, 0x3f800000    # 1.0f

    .line 569
    .line 570
    const/high16 v8, 0x3f800000    # 1.0f

    .line 571
    .line 572
    const/4 v7, 0x0

    .line 573
    const/high16 v9, 0x3f800000    # 1.0f

    .line 574
    .line 575
    const/high16 v12, 0x3f800000    # 1.0f

    .line 576
    .line 577
    const/4 v13, 0x0

    .line 578
    const/4 v14, 0x0

    .line 579
    const/4 v15, 0x0

    .line 580
    const-string v4, ""

    .line 581
    .line 582
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 583
    .line 584
    .line 585
    move-result-object v0

    .line 586
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 587
    .line 588
    .line 589
    move-result-object v0

    .line 590
    sput-object v0, Landroidx/compose/material/icons/rounded/ConnectedTvKt;->_connectedTv:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 591
    .line 592
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 593
    .line 594
    .line 595
    return-object v0
.end method
