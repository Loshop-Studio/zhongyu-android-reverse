.class public final Landroidx/compose/material/icons/outlined/PersonAddAltKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _personAddAlt:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getPersonAddAlt(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/outlined/PersonAddAltKt;->_personAddAlt:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Outlined.PersonAddAlt"

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
    const/high16 v2, 0x41100000    # 9.0f

    .line 73
    .line 74
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v0, 0x40c00000    # 6.0f

    .line 78
    .line 79
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 80
    .line 81
    .line 82
    const/high16 v0, -0x40000000    # -2.0f

    .line 83
    .line 84
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 85
    .line 86
    .line 87
    const/high16 v0, 0x40400000    # 3.0f

    .line 88
    .line 89
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 90
    .line 91
    .line 92
    const/high16 v0, -0x3fc00000    # -3.0f

    .line 93
    .line 94
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 95
    .line 96
    .line 97
    const/high16 v0, 0x40000000    # 2.0f

    .line 98
    .line 99
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 100
    .line 101
    .line 102
    const/high16 v0, 0x40400000    # 3.0f

    .line 103
    .line 104
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 105
    .line 106
    .line 107
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 108
    .line 109
    .line 110
    const/high16 v0, 0x40000000    # 2.0f

    .line 111
    .line 112
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 113
    .line 114
    .line 115
    const/high16 v0, -0x3fc00000    # -3.0f

    .line 116
    .line 117
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 118
    .line 119
    .line 120
    const/high16 v0, 0x40400000    # 3.0f

    .line 121
    .line 122
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 123
    .line 124
    .line 125
    const/high16 v0, 0x41100000    # 9.0f

    .line 126
    .line 127
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 128
    .line 129
    .line 130
    const/high16 v0, 0x41a00000    # 20.0f

    .line 131
    .line 132
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 133
    .line 134
    .line 135
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 136
    .line 137
    .line 138
    const/high16 v0, 0x41400000    # 12.0f

    .line 139
    .line 140
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 141
    .line 142
    .line 143
    const/high16 v17, 0x40800000    # 4.0f

    .line 144
    .line 145
    const/high16 v18, -0x3f800000    # -4.0f

    .line 146
    .line 147
    const v13, 0x400d70a4    # 2.21f

    .line 148
    .line 149
    .line 150
    const/4 v14, 0x0

    .line 151
    const/high16 v15, 0x40800000    # 4.0f

    .line 152
    .line 153
    const v16, -0x401ae148    # -1.79f

    .line 154
    .line 155
    .line 156
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 157
    .line 158
    .line 159
    const/high16 v17, -0x3f800000    # -4.0f

    .line 160
    .line 161
    const/4 v13, 0x0

    .line 162
    const v14, -0x3ff28f5c    # -2.21f

    .line 163
    .line 164
    .line 165
    const v15, -0x401ae148    # -1.79f

    .line 166
    .line 167
    .line 168
    const/high16 v16, -0x3f800000    # -4.0f

    .line 169
    .line 170
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 171
    .line 172
    .line 173
    const v0, 0x40b947ae    # 5.79f

    .line 174
    .line 175
    .line 176
    const/high16 v2, 0x41000000    # 8.0f

    .line 177
    .line 178
    const/high16 v4, 0x40a00000    # 5.0f

    .line 179
    .line 180
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 181
    .line 182
    .line 183
    const/high16 v17, 0x41100000    # 9.0f

    .line 184
    .line 185
    const/high16 v18, 0x41400000    # 12.0f

    .line 186
    .line 187
    const/high16 v13, 0x40a00000    # 5.0f

    .line 188
    .line 189
    const v14, 0x41235c29    # 10.21f

    .line 190
    .line 191
    .line 192
    const v15, 0x40d947ae    # 6.79f

    .line 193
    .line 194
    .line 195
    const/high16 v16, 0x41400000    # 12.0f

    .line 196
    .line 197
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 198
    .line 199
    .line 200
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 201
    .line 202
    .line 203
    const/high16 v0, 0x40c00000    # 6.0f

    .line 204
    .line 205
    const/high16 v2, 0x41100000    # 9.0f

    .line 206
    .line 207
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 208
    .line 209
    .line 210
    const/high16 v17, 0x40000000    # 2.0f

    .line 211
    .line 212
    const/high16 v18, 0x40000000    # 2.0f

    .line 213
    .line 214
    const v13, 0x3f8ccccd    # 1.1f

    .line 215
    .line 216
    .line 217
    const/4 v14, 0x0

    .line 218
    const/high16 v15, 0x40000000    # 2.0f

    .line 219
    .line 220
    const v16, 0x3f666666    # 0.9f

    .line 221
    .line 222
    .line 223
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 224
    .line 225
    .line 226
    const/high16 v17, -0x40000000    # -2.0f

    .line 227
    .line 228
    const/4 v13, 0x0

    .line 229
    const v14, 0x3f8ccccd    # 1.1f

    .line 230
    .line 231
    .line 232
    const v15, -0x4099999a    # -0.9f

    .line 233
    .line 234
    .line 235
    const/high16 v16, 0x40000000    # 2.0f

    .line 236
    .line 237
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 238
    .line 239
    .line 240
    const v0, 0x4111999a    # 9.1f

    .line 241
    .line 242
    .line 243
    const/high16 v2, 0x40e00000    # 7.0f

    .line 244
    .line 245
    const/high16 v4, 0x41000000    # 8.0f

    .line 246
    .line 247
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 248
    .line 249
    .line 250
    const/high16 v17, 0x41100000    # 9.0f

    .line 251
    .line 252
    const/high16 v18, 0x40c00000    # 6.0f

    .line 253
    .line 254
    const/high16 v13, 0x40e00000    # 7.0f

    .line 255
    .line 256
    const v14, 0x40dccccd    # 6.9f

    .line 257
    .line 258
    .line 259
    const v15, 0x40fccccd    # 7.9f

    .line 260
    .line 261
    .line 262
    const/high16 v16, 0x40c00000    # 6.0f

    .line 263
    .line 264
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 265
    .line 266
    .line 267
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 268
    .line 269
    .line 270
    const v0, 0x41763d71    # 15.39f

    .line 271
    .line 272
    .line 273
    const v2, 0x4168f5c3    # 14.56f

    .line 274
    .line 275
    .line 276
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 277
    .line 278
    .line 279
    const/high16 v18, 0x41500000    # 13.0f

    .line 280
    .line 281
    const v13, 0x415b5c29    # 13.71f

    .line 282
    .line 283
    .line 284
    const v14, 0x415b3333    # 13.7f

    .line 285
    .line 286
    .line 287
    const v15, 0x41387ae1    # 11.53f

    .line 288
    .line 289
    .line 290
    const/high16 v16, 0x41500000    # 13.0f

    .line 291
    .line 292
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 293
    .line 294
    .line 295
    const v17, -0x3f33851f    # -6.39f

    .line 296
    .line 297
    .line 298
    const v18, 0x3fc7ae14    # 1.56f

    .line 299
    .line 300
    .line 301
    const v13, -0x3fde147b    # -2.53f

    .line 302
    .line 303
    .line 304
    const/4 v14, 0x0

    .line 305
    const v15, -0x3f6947ae    # -4.71f

    .line 306
    .line 307
    .line 308
    const v16, 0x3f333333    # 0.7f

    .line 309
    .line 310
    .line 311
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 312
    .line 313
    .line 314
    const/high16 v17, 0x3f800000    # 1.0f

    .line 315
    .line 316
    const v18, 0x4189c28f    # 17.22f

    .line 317
    .line 318
    .line 319
    const v13, 0x3fce147b    # 1.61f

    .line 320
    .line 321
    .line 322
    const v14, 0x41711eb8    # 15.07f

    .line 323
    .line 324
    .line 325
    const/high16 v15, 0x3f800000    # 1.0f

    .line 326
    .line 327
    const v16, 0x4180cccd    # 16.1f

    .line 328
    .line 329
    .line 330
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 331
    .line 332
    .line 333
    const/high16 v0, 0x41a00000    # 20.0f

    .line 334
    .line 335
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 336
    .line 337
    .line 338
    const/high16 v0, 0x41800000    # 16.0f

    .line 339
    .line 340
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 341
    .line 342
    .line 343
    const v0, -0x3fce147b    # -2.78f

    .line 344
    .line 345
    .line 346
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 347
    .line 348
    .line 349
    const v17, 0x41763d71    # 15.39f

    .line 350
    .line 351
    .line 352
    const v18, 0x4168f5c3    # 14.56f

    .line 353
    .line 354
    .line 355
    const/high16 v13, 0x41880000    # 17.0f

    .line 356
    .line 357
    const v14, 0x4180cccd    # 16.1f

    .line 358
    .line 359
    .line 360
    const v15, 0x41831eb8    # 16.39f

    .line 361
    .line 362
    .line 363
    const v16, 0x41711eb8    # 15.07f

    .line 364
    .line 365
    .line 366
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 367
    .line 368
    .line 369
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 370
    .line 371
    .line 372
    const/high16 v0, 0x41700000    # 15.0f

    .line 373
    .line 374
    const/high16 v2, 0x41900000    # 18.0f

    .line 375
    .line 376
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 377
    .line 378
    .line 379
    const/high16 v0, 0x40400000    # 3.0f

    .line 380
    .line 381
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 382
    .line 383
    .line 384
    const v0, -0x40b851ec    # -0.78f

    .line 385
    .line 386
    .line 387
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 388
    .line 389
    .line 390
    const v17, 0x3f051eb8    # 0.52f

    .line 391
    .line 392
    .line 393
    const v18, -0x409eb852    # -0.88f

    .line 394
    .line 395
    .line 396
    const/4 v13, 0x0

    .line 397
    const v14, -0x413d70a4    # -0.38f

    .line 398
    .line 399
    .line 400
    const v15, 0x3e4ccccd    # 0.2f

    .line 401
    .line 402
    .line 403
    const v16, -0x40c7ae14    # -0.72f

    .line 404
    .line 405
    .line 406
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 407
    .line 408
    .line 409
    const/high16 v17, 0x41100000    # 9.0f

    .line 410
    .line 411
    const/high16 v18, 0x41700000    # 15.0f

    .line 412
    .line 413
    const v13, 0x4096b852    # 4.71f

    .line 414
    .line 415
    .line 416
    const v14, 0x417bae14    # 15.73f

    .line 417
    .line 418
    .line 419
    const v15, 0x40d428f6    # 6.63f

    .line 420
    .line 421
    .line 422
    const/high16 v16, 0x41700000    # 15.0f

    .line 423
    .line 424
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 425
    .line 426
    .line 427
    const v17, 0x40af5c29    # 5.48f

    .line 428
    .line 429
    .line 430
    const v18, 0x3fab851f    # 1.34f

    .line 431
    .line 432
    .line 433
    const v13, 0x4017ae14    # 2.37f

    .line 434
    .line 435
    .line 436
    const/4 v14, 0x0

    .line 437
    const v15, 0x408947ae    # 4.29f

    .line 438
    .line 439
    .line 440
    const v16, 0x3f3ae148    # 0.73f

    .line 441
    .line 442
    .line 443
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 444
    .line 445
    .line 446
    const/high16 v17, 0x41700000    # 15.0f

    .line 447
    .line 448
    const v18, 0x4189c28f    # 17.22f

    .line 449
    .line 450
    .line 451
    const v13, 0x416ccccd    # 14.8f

    .line 452
    .line 453
    .line 454
    const/high16 v14, 0x41840000    # 16.5f

    .line 455
    .line 456
    const/high16 v15, 0x41700000    # 15.0f

    .line 457
    .line 458
    const v16, 0x4186b852    # 16.84f

    .line 459
    .line 460
    .line 461
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 462
    .line 463
    .line 464
    const/high16 v0, 0x41900000    # 18.0f

    .line 465
    .line 466
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 467
    .line 468
    .line 469
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 470
    .line 471
    .line 472
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 473
    .line 474
    .line 475
    move-result-object v2

    .line 476
    const/16 v16, 0x3800

    .line 477
    .line 478
    const/16 v17, 0x0

    .line 479
    .line 480
    const/high16 v6, 0x3f800000    # 1.0f

    .line 481
    .line 482
    const/high16 v8, 0x3f800000    # 1.0f

    .line 483
    .line 484
    const/4 v7, 0x0

    .line 485
    const/high16 v9, 0x3f800000    # 1.0f

    .line 486
    .line 487
    const/high16 v12, 0x3f800000    # 1.0f

    .line 488
    .line 489
    const/4 v13, 0x0

    .line 490
    const/4 v14, 0x0

    .line 491
    const/4 v15, 0x0

    .line 492
    const-string v4, ""

    .line 493
    .line 494
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 495
    .line 496
    .line 497
    move-result-object v0

    .line 498
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 499
    .line 500
    .line 501
    move-result-object v0

    .line 502
    sput-object v0, Landroidx/compose/material/icons/outlined/PersonAddAltKt;->_personAddAlt:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 503
    .line 504
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 505
    .line 506
    .line 507
    return-object v0
.end method
