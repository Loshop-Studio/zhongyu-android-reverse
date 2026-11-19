.class public final Landroidx/compose/material/icons/rounded/HdrOffSelectKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _hdrOffSelect:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getHdrOffSelect(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/HdrOffSelectKt;->_hdrOffSelect:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.HdrOffSelect"

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
    const/high16 v0, 0x41940000    # 18.5f

    .line 71
    .line 72
    const/high16 v2, 0x41900000    # 18.0f

    .line 73
    .line 74
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v0, -0x40800000    # -1.0f

    .line 78
    .line 79
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 80
    .line 81
    .line 82
    const/high16 v17, -0x40400000    # -1.5f

    .line 83
    .line 84
    const/high16 v18, -0x40400000    # -1.5f

    .line 85
    .line 86
    const/4 v13, 0x0

    .line 87
    const v14, -0x40ab851f    # -0.83f

    .line 88
    .line 89
    .line 90
    const v15, -0x40d47ae1    # -0.67f

    .line 91
    .line 92
    .line 93
    const/high16 v16, -0x40400000    # -1.5f

    .line 94
    .line 95
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 96
    .line 97
    .line 98
    const/high16 v0, 0x41600000    # 14.0f

    .line 99
    .line 100
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 101
    .line 102
    .line 103
    const/high16 v17, -0x40800000    # -1.0f

    .line 104
    .line 105
    const/high16 v18, 0x3f800000    # 1.0f

    .line 106
    .line 107
    const v13, -0x40f33333    # -0.55f

    .line 108
    .line 109
    .line 110
    const/4 v14, 0x0

    .line 111
    const/high16 v15, -0x40800000    # -1.0f

    .line 112
    .line 113
    const v16, 0x3ee66666    # 0.45f

    .line 114
    .line 115
    .line 116
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 117
    .line 118
    .line 119
    const v0, 0x4089eb85    # 4.31f

    .line 120
    .line 121
    .line 122
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 123
    .line 124
    .line 125
    const v17, 0x3f30a3d7    # 0.69f

    .line 126
    .line 127
    .line 128
    const v18, 0x3f30a3d7    # 0.69f

    .line 129
    .line 130
    .line 131
    const/4 v13, 0x0

    .line 132
    const v14, 0x3ec28f5c    # 0.38f

    .line 133
    .line 134
    .line 135
    const v15, 0x3e9eb852    # 0.31f

    .line 136
    .line 137
    .line 138
    const v16, 0x3f30a3d7    # 0.69f

    .line 139
    .line 140
    .line 141
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 142
    .line 143
    .line 144
    const v0, 0x3de147ae    # 0.11f

    .line 145
    .line 146
    .line 147
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 148
    .line 149
    .line 150
    const v18, -0x40cf5c29    # -0.69f

    .line 151
    .line 152
    .line 153
    const v13, 0x3ec28f5c    # 0.38f

    .line 154
    .line 155
    .line 156
    const/4 v14, 0x0

    .line 157
    const v15, 0x3f30a3d7    # 0.69f

    .line 158
    .line 159
    .line 160
    const v16, -0x416147ae    # -0.31f

    .line 161
    .line 162
    .line 163
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 164
    .line 165
    .line 166
    const/high16 v0, 0x41a00000    # 20.0f

    .line 167
    .line 168
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 169
    .line 170
    .line 171
    const v0, 0x3f8ccccd    # 1.1f

    .line 172
    .line 173
    .line 174
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 175
    .line 176
    .line 177
    const v0, 0x3f3851ec    # 0.72f

    .line 178
    .line 179
    .line 180
    const v2, 0x3fcb851f    # 1.59f

    .line 181
    .line 182
    .line 183
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 184
    .line 185
    .line 186
    const v17, 0x3f2147ae    # 0.63f

    .line 187
    .line 188
    .line 189
    const v18, 0x3ed1eb85    # 0.41f

    .line 190
    .line 191
    .line 192
    const v13, 0x3de147ae    # 0.11f

    .line 193
    .line 194
    .line 195
    const/high16 v14, 0x3e800000    # 0.25f

    .line 196
    .line 197
    const v15, 0x3eb851ec    # 0.36f

    .line 198
    .line 199
    .line 200
    const v16, 0x3ed1eb85    # 0.41f

    .line 201
    .line 202
    .line 203
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 204
    .line 205
    .line 206
    const/4 v0, 0x0

    .line 207
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 208
    .line 209
    .line 210
    const v17, 0x3f23d70a    # 0.64f

    .line 211
    .line 212
    .line 213
    const v18, -0x4087ae14    # -0.97f

    .line 214
    .line 215
    .line 216
    const/high16 v13, 0x3f000000    # 0.5f

    .line 217
    .line 218
    const/4 v14, 0x0

    .line 219
    const v15, 0x3f547ae1    # 0.83f

    .line 220
    .line 221
    .line 222
    const v16, -0x40fd70a4    # -0.51f

    .line 223
    .line 224
    .line 225
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 226
    .line 227
    .line 228
    const v0, 0x4188cccd    # 17.1f

    .line 229
    .line 230
    .line 231
    const v2, 0x419f3333    # 19.9f

    .line 232
    .line 233
    .line 234
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 235
    .line 236
    .line 237
    const/high16 v17, 0x41900000    # 18.0f

    .line 238
    .line 239
    const/high16 v18, 0x41940000    # 18.5f

    .line 240
    .line 241
    const v13, 0x418ccccd    # 17.6f

    .line 242
    .line 243
    .line 244
    const v14, 0x419ccccd    # 19.6f

    .line 245
    .line 246
    .line 247
    const/high16 v15, 0x41900000    # 18.0f

    .line 248
    .line 249
    const v16, 0x4198cccd    # 19.1f

    .line 250
    .line 251
    .line 252
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 253
    .line 254
    .line 255
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 256
    .line 257
    .line 258
    const/high16 v0, 0x41840000    # 16.5f

    .line 259
    .line 260
    const/high16 v2, 0x41940000    # 18.5f

    .line 261
    .line 262
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 263
    .line 264
    .line 265
    const/high16 v0, -0x40000000    # -2.0f

    .line 266
    .line 267
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 268
    .line 269
    .line 270
    const/high16 v0, -0x40800000    # -1.0f

    .line 271
    .line 272
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 273
    .line 274
    .line 275
    const/high16 v0, 0x40000000    # 2.0f

    .line 276
    .line 277
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 278
    .line 279
    .line 280
    const/high16 v0, 0x41940000    # 18.5f

    .line 281
    .line 282
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 283
    .line 284
    .line 285
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 286
    .line 287
    .line 288
    const/high16 v0, 0x40600000    # 3.5f

    .line 289
    .line 290
    const/high16 v2, 0x41900000    # 18.0f

    .line 291
    .line 292
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 293
    .line 294
    .line 295
    const/high16 v0, -0x40000000    # -2.0f

    .line 296
    .line 297
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 298
    .line 299
    .line 300
    const/high16 v0, -0x40600000    # -1.25f

    .line 301
    .line 302
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 303
    .line 304
    .line 305
    const/high16 v17, 0x3f400000    # 0.75f

    .line 306
    .line 307
    const/high16 v18, 0x41800000    # 16.0f

    .line 308
    .line 309
    const/high16 v13, 0x3fc00000    # 1.5f

    .line 310
    .line 311
    const v14, 0x4182b852    # 16.34f

    .line 312
    .line 313
    .line 314
    const v15, 0x3f947ae1    # 1.16f

    .line 315
    .line 316
    .line 317
    const/high16 v16, 0x41800000    # 16.0f

    .line 318
    .line 319
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 320
    .line 321
    .line 322
    const/4 v0, 0x0

    .line 323
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 324
    .line 325
    .line 326
    const/16 v17, 0x0

    .line 327
    .line 328
    const/high16 v18, 0x41860000    # 16.75f

    .line 329
    .line 330
    const v13, 0x3eae147b    # 0.34f

    .line 331
    .line 332
    .line 333
    const/high16 v14, 0x41800000    # 16.0f

    .line 334
    .line 335
    const/4 v15, 0x0

    .line 336
    const v16, 0x4182b852    # 16.34f

    .line 337
    .line 338
    .line 339
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 340
    .line 341
    .line 342
    const/high16 v0, 0x40900000    # 4.5f

    .line 343
    .line 344
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 345
    .line 346
    .line 347
    const/high16 v17, 0x3f400000    # 0.75f

    .line 348
    .line 349
    const/high16 v18, 0x41b00000    # 22.0f

    .line 350
    .line 351
    const/4 v13, 0x0

    .line 352
    const v14, 0x41ad47ae    # 21.66f

    .line 353
    .line 354
    .line 355
    const v15, 0x3eae147b    # 0.34f

    .line 356
    .line 357
    .line 358
    const/high16 v16, 0x41b00000    # 22.0f

    .line 359
    .line 360
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 361
    .line 362
    .line 363
    const/4 v0, 0x0

    .line 364
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 365
    .line 366
    .line 367
    const/high16 v18, -0x40c00000    # -0.75f

    .line 368
    .line 369
    const v13, 0x3ed1eb85    # 0.41f

    .line 370
    .line 371
    .line 372
    const/4 v14, 0x0

    .line 373
    const/high16 v15, 0x3f400000    # 0.75f

    .line 374
    .line 375
    const v16, -0x4151eb85    # -0.34f

    .line 376
    .line 377
    .line 378
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 379
    .line 380
    .line 381
    const/high16 v0, 0x419c0000    # 19.5f

    .line 382
    .line 383
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 384
    .line 385
    .line 386
    const/high16 v0, 0x40000000    # 2.0f

    .line 387
    .line 388
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 389
    .line 390
    .line 391
    const/high16 v0, 0x3fe00000    # 1.75f

    .line 392
    .line 393
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 394
    .line 395
    .line 396
    const/high16 v17, 0x40880000    # 4.25f

    .line 397
    .line 398
    const/high16 v18, 0x41b00000    # 22.0f

    .line 399
    .line 400
    const/high16 v13, 0x40600000    # 3.5f

    .line 401
    .line 402
    const v14, 0x41ad47ae    # 21.66f

    .line 403
    .line 404
    .line 405
    const v15, 0x4075c28f    # 3.84f

    .line 406
    .line 407
    .line 408
    const/high16 v16, 0x41b00000    # 22.0f

    .line 409
    .line 410
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 411
    .line 412
    .line 413
    const/4 v0, 0x0

    .line 414
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 415
    .line 416
    .line 417
    const/high16 v17, 0x40a00000    # 5.0f

    .line 418
    .line 419
    const/high16 v18, 0x41aa0000    # 21.25f

    .line 420
    .line 421
    const v13, 0x40951eb8    # 4.66f

    .line 422
    .line 423
    .line 424
    const/high16 v14, 0x41b00000    # 22.0f

    .line 425
    .line 426
    const/high16 v15, 0x40a00000    # 5.0f

    .line 427
    .line 428
    const v16, 0x41ad47ae    # 21.66f

    .line 429
    .line 430
    .line 431
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 432
    .line 433
    .line 434
    const/high16 v0, -0x3f700000    # -4.5f

    .line 435
    .line 436
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 437
    .line 438
    .line 439
    const/high16 v17, 0x40880000    # 4.25f

    .line 440
    .line 441
    const/high16 v18, 0x41800000    # 16.0f

    .line 442
    .line 443
    const/high16 v13, 0x40a00000    # 5.0f

    .line 444
    .line 445
    const v14, 0x4182b852    # 16.34f

    .line 446
    .line 447
    .line 448
    const v15, 0x40951eb8    # 4.66f

    .line 449
    .line 450
    .line 451
    const/high16 v16, 0x41800000    # 16.0f

    .line 452
    .line 453
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 454
    .line 455
    .line 456
    const/4 v0, 0x0

    .line 457
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 458
    .line 459
    .line 460
    const/high16 v17, -0x40c00000    # -0.75f

    .line 461
    .line 462
    const/high16 v18, 0x3f400000    # 0.75f

    .line 463
    .line 464
    const v13, -0x412e147b    # -0.41f

    .line 465
    .line 466
    .line 467
    const/4 v14, 0x0

    .line 468
    const/high16 v15, -0x40c00000    # -0.75f

    .line 469
    .line 470
    const v16, 0x3eae147b    # 0.34f

    .line 471
    .line 472
    .line 473
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 474
    .line 475
    .line 476
    const/high16 v0, 0x41900000    # 18.0f

    .line 477
    .line 478
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 479
    .line 480
    .line 481
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 482
    .line 483
    .line 484
    const/high16 v0, 0x41800000    # 16.0f

    .line 485
    .line 486
    const/high16 v2, 0x41200000    # 10.0f

    .line 487
    .line 488
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 489
    .line 490
    .line 491
    const/high16 v0, 0x40f00000    # 7.5f

    .line 492
    .line 493
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 494
    .line 495
    .line 496
    const/high16 v17, -0x40800000    # -1.0f

    .line 497
    .line 498
    const/high16 v18, 0x3f800000    # 1.0f

    .line 499
    .line 500
    const v13, -0x40f33333    # -0.55f

    .line 501
    .line 502
    .line 503
    const/high16 v15, -0x40800000    # -1.0f

    .line 504
    .line 505
    const v16, 0x3ee66666    # 0.45f

    .line 506
    .line 507
    .line 508
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 509
    .line 510
    .line 511
    const/high16 v0, 0x40800000    # 4.0f

    .line 512
    .line 513
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 514
    .line 515
    .line 516
    const/high16 v17, 0x3f800000    # 1.0f

    .line 517
    .line 518
    const/4 v13, 0x0

    .line 519
    const v14, 0x3f0ccccd    # 0.55f

    .line 520
    .line 521
    .line 522
    const v15, 0x3ee66666    # 0.45f

    .line 523
    .line 524
    .line 525
    const/high16 v16, 0x3f800000    # 1.0f

    .line 526
    .line 527
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 528
    .line 529
    .line 530
    const/high16 v0, 0x41200000    # 10.0f

    .line 531
    .line 532
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 533
    .line 534
    .line 535
    const/high16 v17, 0x3fc00000    # 1.5f

    .line 536
    .line 537
    const/high16 v18, -0x40400000    # -1.5f

    .line 538
    .line 539
    const v13, 0x3f51eb85    # 0.82f

    .line 540
    .line 541
    .line 542
    const/4 v14, 0x0

    .line 543
    const/high16 v15, 0x3fc00000    # 1.5f

    .line 544
    .line 545
    const v16, -0x40d47ae1    # -0.67f

    .line 546
    .line 547
    .line 548
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 549
    .line 550
    .line 551
    const/high16 v0, -0x3fc00000    # -3.0f

    .line 552
    .line 553
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 554
    .line 555
    .line 556
    const/high16 v17, 0x41200000    # 10.0f

    .line 557
    .line 558
    const/high16 v18, 0x41800000    # 16.0f

    .line 559
    .line 560
    const/high16 v13, 0x41380000    # 11.5f

    .line 561
    .line 562
    const v14, 0x41855c29    # 16.67f

    .line 563
    .line 564
    .line 565
    const v15, 0x412d1eb8    # 10.82f

    .line 566
    .line 567
    .line 568
    const/high16 v16, 0x41800000    # 16.0f

    .line 569
    .line 570
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 571
    .line 572
    .line 573
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 574
    .line 575
    .line 576
    const/high16 v0, 0x41a40000    # 20.5f

    .line 577
    .line 578
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 579
    .line 580
    .line 581
    const/high16 v0, 0x41000000    # 8.0f

    .line 582
    .line 583
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 584
    .line 585
    .line 586
    const/high16 v0, -0x3fc00000    # -3.0f

    .line 587
    .line 588
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 589
    .line 590
    .line 591
    const/high16 v0, 0x40000000    # 2.0f

    .line 592
    .line 593
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 594
    .line 595
    .line 596
    const/high16 v0, 0x41a40000    # 20.5f

    .line 597
    .line 598
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 599
    .line 600
    .line 601
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 602
    .line 603
    .line 604
    const/high16 v0, 0x41ba0000    # 23.25f

    .line 605
    .line 606
    const/high16 v2, 0x41a00000    # 20.0f

    .line 607
    .line 608
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 609
    .line 610
    .line 611
    const/high16 v0, 0x41b00000    # 22.0f

    .line 612
    .line 613
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 614
    .line 615
    .line 616
    const/high16 v0, 0x3fa00000    # 1.25f

    .line 617
    .line 618
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 619
    .line 620
    .line 621
    const/high16 v17, -0x40c00000    # -0.75f

    .line 622
    .line 623
    const/high16 v18, 0x3f400000    # 0.75f

    .line 624
    .line 625
    const/4 v13, 0x0

    .line 626
    const v14, 0x3ed1eb85    # 0.41f

    .line 627
    .line 628
    .line 629
    const v15, -0x4151eb85    # -0.34f

    .line 630
    .line 631
    .line 632
    const/high16 v16, 0x3f400000    # 0.75f

    .line 633
    .line 634
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 635
    .line 636
    .line 637
    const/4 v0, 0x0

    .line 638
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 639
    .line 640
    .line 641
    const/high16 v18, -0x40c00000    # -0.75f

    .line 642
    .line 643
    const v13, -0x412e147b    # -0.41f

    .line 644
    .line 645
    .line 646
    const/4 v14, 0x0

    .line 647
    const/high16 v15, -0x40c00000    # -0.75f

    .line 648
    .line 649
    const v16, -0x4151eb85    # -0.34f

    .line 650
    .line 651
    .line 652
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 653
    .line 654
    .line 655
    const/high16 v0, 0x41a00000    # 20.0f

    .line 656
    .line 657
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 658
    .line 659
    .line 660
    const/high16 v0, -0x40600000    # -1.25f

    .line 661
    .line 662
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 663
    .line 664
    .line 665
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 666
    .line 667
    .line 668
    const/4 v0, 0x0

    .line 669
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 670
    .line 671
    .line 672
    const/high16 v17, 0x3f400000    # 0.75f

    .line 673
    .line 674
    const/4 v13, 0x0

    .line 675
    const v14, -0x412e147b    # -0.41f

    .line 676
    .line 677
    .line 678
    const v15, 0x3eae147b    # 0.34f

    .line 679
    .line 680
    .line 681
    const/high16 v16, -0x40c00000    # -0.75f

    .line 682
    .line 683
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 684
    .line 685
    .line 686
    const/high16 v0, 0x3fa00000    # 1.25f

    .line 687
    .line 688
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 689
    .line 690
    .line 691
    const/high16 v0, -0x40600000    # -1.25f

    .line 692
    .line 693
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 694
    .line 695
    .line 696
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 697
    .line 698
    .line 699
    const/4 v0, 0x0

    .line 700
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 701
    .line 702
    .line 703
    const/high16 v18, 0x3f400000    # 0.75f

    .line 704
    .line 705
    const v13, 0x3ed1eb85    # 0.41f

    .line 706
    .line 707
    .line 708
    const/4 v14, 0x0

    .line 709
    const/high16 v15, 0x3f400000    # 0.75f

    .line 710
    .line 711
    const v16, 0x3eae147b    # 0.34f

    .line 712
    .line 713
    .line 714
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 715
    .line 716
    .line 717
    const/high16 v0, 0x3fa00000    # 1.25f

    .line 718
    .line 719
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 720
    .line 721
    .line 722
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 723
    .line 724
    .line 725
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 726
    .line 727
    .line 728
    const/4 v0, 0x0

    .line 729
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 730
    .line 731
    .line 732
    const/high16 v17, 0x41ba0000    # 23.25f

    .line 733
    .line 734
    const/high16 v18, 0x41a00000    # 20.0f

    .line 735
    .line 736
    const/high16 v13, 0x41c00000    # 24.0f

    .line 737
    .line 738
    const v14, 0x419d47ae    # 19.66f

    .line 739
    .line 740
    .line 741
    const v15, 0x41bd47ae    # 23.66f

    .line 742
    .line 743
    .line 744
    const/high16 v16, 0x41a00000    # 20.0f

    .line 745
    .line 746
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 747
    .line 748
    .line 749
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 750
    .line 751
    .line 752
    const v0, 0x412fae14    # 10.98f

    .line 753
    .line 754
    .line 755
    const v2, 0x4084cccd    # 4.15f

    .line 756
    .line 757
    .line 758
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 759
    .line 760
    .line 761
    const v0, 0x4116b852    # 9.42f

    .line 762
    .line 763
    .line 764
    const v2, 0x4025c28f    # 2.59f

    .line 765
    .line 766
    .line 767
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 768
    .line 769
    .line 770
    const v17, 0x40ffae14    # 7.99f

    .line 771
    .line 772
    .line 773
    const v18, 0x40ffae14    # 7.99f

    .line 774
    .line 775
    .line 776
    const v13, 0x40a33333    # 5.1f

    .line 777
    .line 778
    .line 779
    const v14, -0x3fe51eb8    # -2.42f

    .line 780
    .line 781
    .line 782
    const v15, 0x41268f5c    # 10.41f

    .line 783
    .line 784
    .line 785
    const v16, 0x4038f5c3    # 2.89f

    .line 786
    .line 787
    .line 788
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 789
    .line 790
    .line 791
    const v0, -0x403851ec    # -1.56f

    .line 792
    .line 793
    .line 794
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 795
    .line 796
    .line 797
    const v17, 0x412fae14    # 10.98f

    .line 798
    .line 799
    .line 800
    const v18, 0x4084cccd    # 4.15f

    .line 801
    .line 802
    .line 803
    const v13, 0x418547ae    # 16.66f

    .line 804
    .line 805
    .line 806
    const v14, 0x40c1eb85    # 6.06f

    .line 807
    .line 808
    .line 809
    const v15, 0x415f0a3d    # 13.94f

    .line 810
    .line 811
    .line 812
    const v16, 0x4055c28f    # 3.34f

    .line 813
    .line 814
    .line 815
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 816
    .line 817
    .line 818
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 819
    .line 820
    .line 821
    const v0, 0x40433333    # 3.05f

    .line 822
    .line 823
    .line 824
    const v2, 0x40b428f6    # 5.63f

    .line 825
    .line 826
    .line 827
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 828
    .line 829
    .line 830
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 831
    .line 832
    .line 833
    const/16 v17, 0x0

    .line 834
    .line 835
    const v18, 0x3fb47ae1    # 1.41f

    .line 836
    .line 837
    .line 838
    const v13, -0x413851ec    # -0.39f

    .line 839
    .line 840
    .line 841
    const v14, 0x3ec7ae14    # 0.39f

    .line 842
    .line 843
    .line 844
    const v15, -0x413851ec    # -0.39f

    .line 845
    .line 846
    .line 847
    const v16, 0x3f828f5c    # 1.02f

    .line 848
    .line 849
    .line 850
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 851
    .line 852
    .line 853
    const v0, 0x3f75c28f    # 0.96f

    .line 854
    .line 855
    .line 856
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 857
    .line 858
    .line 859
    const v17, 0x40ffae14    # 7.99f

    .line 860
    .line 861
    .line 862
    const v18, 0x40ffae14    # 7.99f

    .line 863
    .line 864
    .line 865
    const v13, -0x3fe51eb8    # -2.42f

    .line 866
    .line 867
    .line 868
    const v14, 0x40a33333    # 5.1f

    .line 869
    .line 870
    .line 871
    const v15, 0x403851ec    # 2.88f

    .line 872
    .line 873
    .line 874
    const v16, 0x41268f5c    # 10.41f

    .line 875
    .line 876
    .line 877
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 878
    .line 879
    .line 880
    const v0, 0x3f733333    # 0.95f

    .line 881
    .line 882
    .line 883
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 884
    .line 885
    .line 886
    const v17, 0x3fb47ae1    # 1.41f

    .line 887
    .line 888
    .line 889
    const/16 v18, 0x0

    .line 890
    .line 891
    const v13, 0x3ec7ae14    # 0.39f

    .line 892
    .line 893
    .line 894
    const v14, 0x3ec7ae14    # 0.39f

    .line 895
    .line 896
    .line 897
    const v15, 0x3f828f5c    # 1.02f

    .line 898
    .line 899
    .line 900
    const v16, 0x3ec7ae14    # 0.39f

    .line 901
    .line 902
    .line 903
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 904
    .line 905
    .line 906
    const/4 v0, 0x0

    .line 907
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 908
    .line 909
    .line 910
    const/16 v17, 0x0

    .line 911
    .line 912
    const v18, -0x404b851f    # -1.41f

    .line 913
    .line 914
    .line 915
    const v14, -0x413851ec    # -0.39f

    .line 916
    .line 917
    .line 918
    const v15, 0x3ec7ae14    # 0.39f

    .line 919
    .line 920
    .line 921
    const v16, -0x407d70a4    # -1.02f

    .line 922
    .line 923
    .line 924
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 925
    .line 926
    .line 927
    const v0, -0x3ee1999a    # -9.9f

    .line 928
    .line 929
    .line 930
    const v2, -0x3ee170a4    # -9.91f

    .line 931
    .line 932
    .line 933
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 934
    .line 935
    .line 936
    const v17, 0x40b428f6    # 5.63f

    .line 937
    .line 938
    .line 939
    const v18, 0x40433333    # 3.05f

    .line 940
    .line 941
    .line 942
    const v13, 0x40d51eb8    # 6.66f

    .line 943
    .line 944
    .line 945
    const v14, 0x402a3d71    # 2.66f

    .line 946
    .line 947
    .line 948
    const v15, 0x40c0a3d7    # 6.02f

    .line 949
    .line 950
    .line 951
    const v16, 0x402a3d71    # 2.66f

    .line 952
    .line 953
    .line 954
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 955
    .line 956
    .line 957
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 958
    .line 959
    .line 960
    const v0, 0x41026666    # 8.15f

    .line 961
    .line 962
    .line 963
    const v2, 0x40df5c29    # 6.98f

    .line 964
    .line 965
    .line 966
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 967
    .line 968
    .line 969
    const v0, 0x409bd70a    # 4.87f

    .line 970
    .line 971
    .line 972
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 973
    .line 974
    .line 975
    const v17, 0x41026666    # 8.15f

    .line 976
    .line 977
    .line 978
    const v18, 0x40df5c29    # 6.98f

    .line 979
    .line 980
    .line 981
    const v13, 0x4120f5c3    # 10.06f

    .line 982
    .line 983
    .line 984
    const v14, 0x414a8f5c    # 12.66f

    .line 985
    .line 986
    .line 987
    const v15, 0x40eae148    # 7.34f

    .line 988
    .line 989
    .line 990
    const v16, 0x411f0a3d    # 9.94f

    .line 991
    .line 992
    .line 993
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 994
    .line 995
    .line 996
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 997
    .line 998
    .line 999
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 1000
    .line 1001
    .line 1002
    move-result-object v2

    .line 1003
    const/16 v16, 0x3800

    .line 1004
    .line 1005
    const/16 v17, 0x0

    .line 1006
    .line 1007
    const/high16 v6, 0x3f800000    # 1.0f

    .line 1008
    .line 1009
    const/high16 v8, 0x3f800000    # 1.0f

    .line 1010
    .line 1011
    const/4 v7, 0x0

    .line 1012
    const/high16 v9, 0x3f800000    # 1.0f

    .line 1013
    .line 1014
    const/high16 v12, 0x3f800000    # 1.0f

    .line 1015
    .line 1016
    const/4 v13, 0x0

    .line 1017
    const/4 v14, 0x0

    .line 1018
    const/4 v15, 0x0

    .line 1019
    const-string v4, ""

    .line 1020
    .line 1021
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 1022
    .line 1023
    .line 1024
    move-result-object v0

    .line 1025
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1026
    .line 1027
    .line 1028
    move-result-object v0

    .line 1029
    sput-object v0, Landroidx/compose/material/icons/rounded/HdrOffSelectKt;->_hdrOffSelect:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1030
    .line 1031
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 1032
    .line 1033
    .line 1034
    return-object v0
.end method
