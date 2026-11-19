.class public final Landroidx/compose/material/icons/rounded/SanitizerKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _sanitizer:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getSanitizer(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/SanitizerKt;->_sanitizer:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.Sanitizer"

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
    const/high16 v0, 0x40d00000    # 6.5f

    .line 71
    .line 72
    const/high16 v2, 0x41780000    # 15.5f

    .line 73
    .line 74
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const v17, 0x3f8e147b    # 1.11f

    .line 78
    .line 79
    .line 80
    const v18, -0x3ffd70a4    # -2.04f

    .line 81
    .line 82
    .line 83
    const/4 v13, 0x0

    .line 84
    const v14, -0x40f0a3d7    # -0.56f

    .line 85
    .line 86
    .line 87
    const v15, 0x3f2b851f    # 0.67f

    .line 88
    .line 89
    .line 90
    const v16, -0x404147ae    # -1.49f

    .line 91
    .line 92
    .line 93
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 94
    .line 95
    .line 96
    const v17, 0x3f451eb8    # 0.77f

    .line 97
    .line 98
    .line 99
    const/16 v18, 0x0

    .line 100
    .line 101
    const v13, 0x3e4ccccd    # 0.2f

    .line 102
    .line 103
    .line 104
    const/high16 v14, -0x41800000    # -0.25f

    .line 105
    .line 106
    const v15, 0x3f147ae1    # 0.58f

    .line 107
    .line 108
    .line 109
    const/high16 v16, -0x41800000    # -0.25f

    .line 110
    .line 111
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 112
    .line 113
    .line 114
    const v17, 0x3f8e147b    # 1.11f

    .line 115
    .line 116
    .line 117
    const v18, 0x40028f5c    # 2.04f

    .line 118
    .line 119
    .line 120
    const v13, 0x3ee147ae    # 0.44f

    .line 121
    .line 122
    .line 123
    const v14, 0x3f0ccccd    # 0.55f

    .line 124
    .line 125
    .line 126
    const v15, 0x3f8e147b    # 1.11f

    .line 127
    .line 128
    .line 129
    const v16, 0x3fbd70a4    # 1.48f

    .line 130
    .line 131
    .line 132
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 133
    .line 134
    .line 135
    const/high16 v17, 0x41880000    # 17.0f

    .line 136
    .line 137
    const/high16 v18, 0x41000000    # 8.0f

    .line 138
    .line 139
    const/high16 v13, 0x41940000    # 18.5f

    .line 140
    .line 141
    const v14, 0x40ea8f5c    # 7.33f

    .line 142
    .line 143
    .line 144
    const v15, 0x418ea3d7    # 17.83f

    .line 145
    .line 146
    .line 147
    const/high16 v16, 0x41000000    # 8.0f

    .line 148
    .line 149
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 150
    .line 151
    .line 152
    const v0, 0x40ea8f5c    # 7.33f

    .line 153
    .line 154
    .line 155
    const/high16 v2, 0x40d00000    # 6.5f

    .line 156
    .line 157
    const/high16 v4, 0x41780000    # 15.5f

    .line 158
    .line 159
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 160
    .line 161
    .line 162
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 163
    .line 164
    .line 165
    const/high16 v0, 0x419c0000    # 19.5f

    .line 166
    .line 167
    const/high16 v2, 0x41700000    # 15.0f

    .line 168
    .line 169
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 170
    .line 171
    .line 172
    const/high16 v17, 0x40200000    # 2.5f

    .line 173
    .line 174
    const/high16 v18, -0x3fe00000    # -2.5f

    .line 175
    .line 176
    const v13, 0x3fb0a3d7    # 1.38f

    .line 177
    .line 178
    .line 179
    const/4 v14, 0x0

    .line 180
    const/high16 v15, 0x40200000    # 2.5f

    .line 181
    .line 182
    const v16, -0x4070a3d7    # -1.12f

    .line 183
    .line 184
    .line 185
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 186
    .line 187
    .line 188
    const v17, -0x3ff8f5c3    # -2.11f

    .line 189
    .line 190
    .line 191
    const v18, -0x3f7eb852    # -4.04f

    .line 192
    .line 193
    .line 194
    const/4 v13, 0x0

    .line 195
    const/high16 v14, -0x40600000    # -1.25f

    .line 196
    .line 197
    const v15, -0x404b851f    # -1.41f

    .line 198
    .line 199
    .line 200
    const v16, -0x3fb5c28f    # -3.16f

    .line 201
    .line 202
    .line 203
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 204
    .line 205
    .line 206
    const v17, -0x40bae148    # -0.77f

    .line 207
    .line 208
    .line 209
    const/16 v18, 0x0

    .line 210
    .line 211
    const v13, -0x41b33333    # -0.2f

    .line 212
    .line 213
    .line 214
    const/high16 v14, -0x41800000    # -0.25f

    .line 215
    .line 216
    const v15, -0x40ee147b    # -0.57f

    .line 217
    .line 218
    .line 219
    const/high16 v16, -0x41800000    # -0.25f

    .line 220
    .line 221
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 222
    .line 223
    .line 224
    const/high16 v17, 0x41880000    # 17.0f

    .line 225
    .line 226
    const/high16 v18, 0x41480000    # 12.5f

    .line 227
    .line 228
    const v13, 0x419347ae    # 18.41f

    .line 229
    .line 230
    .line 231
    const v14, 0x411570a4    # 9.34f

    .line 232
    .line 233
    .line 234
    const/high16 v15, 0x41880000    # 17.0f

    .line 235
    .line 236
    const/high16 v16, 0x41340000    # 11.25f

    .line 237
    .line 238
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 239
    .line 240
    .line 241
    const/high16 v17, 0x419c0000    # 19.5f

    .line 242
    .line 243
    const/high16 v18, 0x41700000    # 15.0f

    .line 244
    .line 245
    const/high16 v13, 0x41880000    # 17.0f

    .line 246
    .line 247
    const v14, 0x415e147b    # 13.88f

    .line 248
    .line 249
    .line 250
    const v15, 0x4190f5c3    # 18.12f

    .line 251
    .line 252
    .line 253
    const/high16 v16, 0x41700000    # 15.0f

    .line 254
    .line 255
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 256
    .line 257
    .line 258
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 259
    .line 260
    .line 261
    const/high16 v0, 0x41600000    # 14.0f

    .line 262
    .line 263
    const/high16 v2, 0x41400000    # 12.0f

    .line 264
    .line 265
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 266
    .line 267
    .line 268
    const/high16 v0, -0x40800000    # -1.0f

    .line 269
    .line 270
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 271
    .line 272
    .line 273
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 274
    .line 275
    .line 276
    const/high16 v17, -0x40800000    # -1.0f

    .line 277
    .line 278
    const/high16 v18, -0x40800000    # -1.0f

    .line 279
    .line 280
    const/4 v13, 0x0

    .line 281
    const v14, -0x40f33333    # -0.55f

    .line 282
    .line 283
    .line 284
    const v15, -0x4119999a    # -0.45f

    .line 285
    .line 286
    .line 287
    const/high16 v16, -0x40800000    # -1.0f

    .line 288
    .line 289
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 290
    .line 291
    .line 292
    const/4 v0, 0x0

    .line 293
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 294
    .line 295
    .line 296
    const/high16 v18, 0x3f800000    # 1.0f

    .line 297
    .line 298
    const v13, -0x40f33333    # -0.55f

    .line 299
    .line 300
    .line 301
    const/4 v14, 0x0

    .line 302
    const/high16 v15, -0x40800000    # -1.0f

    .line 303
    .line 304
    const v16, 0x3ee66666    # 0.45f

    .line 305
    .line 306
    .line 307
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 308
    .line 309
    .line 310
    const/high16 v0, 0x3f800000    # 1.0f

    .line 311
    .line 312
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 313
    .line 314
    .line 315
    const/high16 v0, 0x41000000    # 8.0f

    .line 316
    .line 317
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 318
    .line 319
    .line 320
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 321
    .line 322
    .line 323
    const/4 v0, 0x0

    .line 324
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 325
    .line 326
    .line 327
    const/high16 v17, 0x3f800000    # 1.0f

    .line 328
    .line 329
    const/4 v13, 0x0

    .line 330
    const v14, 0x3f0ccccd    # 0.55f

    .line 331
    .line 332
    .line 333
    const v15, 0x3ee66666    # 0.45f

    .line 334
    .line 335
    .line 336
    const/high16 v16, 0x3f800000    # 1.0f

    .line 337
    .line 338
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 339
    .line 340
    .line 341
    const/high16 v0, 0x3f800000    # 1.0f

    .line 342
    .line 343
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 344
    .line 345
    .line 346
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 347
    .line 348
    .line 349
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 350
    .line 351
    .line 352
    const/4 v0, 0x0

    .line 353
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 354
    .line 355
    .line 356
    const/high16 v18, -0x40800000    # -1.0f

    .line 357
    .line 358
    const v13, 0x3f0ccccd    # 0.55f

    .line 359
    .line 360
    .line 361
    const/4 v14, 0x0

    .line 362
    const/high16 v15, 0x3f800000    # 1.0f

    .line 363
    .line 364
    const v16, -0x4119999a    # -0.45f

    .line 365
    .line 366
    .line 367
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 368
    .line 369
    .line 370
    const/high16 v0, -0x40800000    # -1.0f

    .line 371
    .line 372
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 373
    .line 374
    .line 375
    const/high16 v0, 0x3f800000    # 1.0f

    .line 376
    .line 377
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 378
    .line 379
    .line 380
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 381
    .line 382
    .line 383
    const/4 v0, 0x0

    .line 384
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 385
    .line 386
    .line 387
    const/high16 v17, 0x41400000    # 12.0f

    .line 388
    .line 389
    const/high16 v18, 0x41600000    # 14.0f

    .line 390
    .line 391
    const/high16 v13, 0x41500000    # 13.0f

    .line 392
    .line 393
    const v14, 0x41673333    # 14.45f

    .line 394
    .line 395
    .line 396
    const v15, 0x4148cccd    # 12.55f

    .line 397
    .line 398
    .line 399
    const/high16 v16, 0x41600000    # 14.0f

    .line 400
    .line 401
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 402
    .line 403
    .line 404
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 405
    .line 406
    .line 407
    const/high16 v0, 0x41800000    # 16.0f

    .line 408
    .line 409
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 410
    .line 411
    .line 412
    const/high16 v0, 0x41000000    # 8.0f

    .line 413
    .line 414
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 415
    .line 416
    .line 417
    const/high16 v17, -0x40000000    # -2.0f

    .line 418
    .line 419
    const/high16 v18, 0x40000000    # 2.0f

    .line 420
    .line 421
    const/4 v13, 0x0

    .line 422
    const v14, 0x3f8ccccd    # 1.1f

    .line 423
    .line 424
    .line 425
    const v15, -0x4099999a    # -0.9f

    .line 426
    .line 427
    .line 428
    const/high16 v16, 0x40000000    # 2.0f

    .line 429
    .line 430
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 431
    .line 432
    .line 433
    const/high16 v0, 0x40c00000    # 6.0f

    .line 434
    .line 435
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 436
    .line 437
    .line 438
    const/high16 v18, -0x40000000    # -2.0f

    .line 439
    .line 440
    const v13, -0x40733333    # -1.1f

    .line 441
    .line 442
    .line 443
    const/4 v14, 0x0

    .line 444
    const/high16 v15, -0x40000000    # -2.0f

    .line 445
    .line 446
    const v16, -0x4099999a    # -0.9f

    .line 447
    .line 448
    .line 449
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 450
    .line 451
    .line 452
    const/high16 v0, -0x3f000000    # -8.0f

    .line 453
    .line 454
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 455
    .line 456
    .line 457
    const/high16 v17, 0x40a00000    # 5.0f

    .line 458
    .line 459
    const v18, -0x3f42e148    # -5.91f

    .line 460
    .line 461
    .line 462
    const/4 v13, 0x0

    .line 463
    const v14, -0x3fc1eb85    # -2.97f

    .line 464
    .line 465
    .line 466
    const v15, 0x400a3d71    # 2.16f

    .line 467
    .line 468
    .line 469
    const v16, -0x3f523d71    # -5.43f

    .line 470
    .line 471
    .line 472
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 473
    .line 474
    .line 475
    const/high16 v0, 0x40800000    # 4.0f

    .line 476
    .line 477
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 478
    .line 479
    .line 480
    const/high16 v0, 0x41000000    # 8.0f

    .line 481
    .line 482
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 483
    .line 484
    .line 485
    const/high16 v17, 0x40e00000    # 7.0f

    .line 486
    .line 487
    const/high16 v18, 0x40400000    # 3.0f

    .line 488
    .line 489
    const v13, 0x40ee6666    # 7.45f

    .line 490
    .line 491
    .line 492
    const/high16 v14, 0x40800000    # 4.0f

    .line 493
    .line 494
    const/high16 v15, 0x40e00000    # 7.0f

    .line 495
    .line 496
    const v16, 0x40633333    # 3.55f

    .line 497
    .line 498
    .line 499
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 500
    .line 501
    .line 502
    const/4 v0, 0x0

    .line 503
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 504
    .line 505
    .line 506
    const/high16 v17, 0x3f800000    # 1.0f

    .line 507
    .line 508
    const/high16 v18, -0x40800000    # -1.0f

    .line 509
    .line 510
    const/4 v13, 0x0

    .line 511
    const v14, -0x40f33333    # -0.55f

    .line 512
    .line 513
    .line 514
    const v15, 0x3ee66666    # 0.45f

    .line 515
    .line 516
    .line 517
    const/high16 v16, -0x40800000    # -1.0f

    .line 518
    .line 519
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 520
    .line 521
    .line 522
    const/high16 v0, 0x40a00000    # 5.0f

    .line 523
    .line 524
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 525
    .line 526
    .line 527
    const v17, 0x3fdc28f6    # 1.72f

    .line 528
    .line 529
    .line 530
    const v18, 0x3e9eb852    # 0.31f

    .line 531
    .line 532
    .line 533
    const v13, 0x3f1c28f6    # 0.61f

    .line 534
    .line 535
    .line 536
    const/4 v14, 0x0

    .line 537
    const v15, 0x3f9851ec    # 1.19f

    .line 538
    .line 539
    .line 540
    const v16, 0x3de147ae    # 0.11f

    .line 541
    .line 542
    .line 543
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 544
    .line 545
    .line 546
    const v17, 0x3ea8f5c3    # 0.33f

    .line 547
    .line 548
    .line 549
    const v18, 0x3fd1eb85    # 1.64f

    .line 550
    .line 551
    .line 552
    const v13, 0x3f2b851f    # 0.67f

    .line 553
    .line 554
    .line 555
    const/high16 v14, 0x3e800000    # 0.25f

    .line 556
    .line 557
    const v15, 0x3f547ae1    # 0.83f

    .line 558
    .line 559
    .line 560
    const v16, 0x3f90a3d7    # 1.13f

    .line 561
    .line 562
    .line 563
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 564
    .line 565
    .line 566
    const/4 v0, 0x0

    .line 567
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 568
    .line 569
    .line 570
    const/high16 v17, 0x41600000    # 14.0f

    .line 571
    .line 572
    const v18, 0x4085c28f    # 4.18f

    .line 573
    .line 574
    .line 575
    const v13, 0x416c51ec    # 14.77f

    .line 576
    .line 577
    .line 578
    const v14, 0x40875c29    # 4.23f

    .line 579
    .line 580
    .line 581
    const v15, 0x4165c28f    # 14.36f

    .line 582
    .line 583
    .line 584
    const v16, 0x4089eb85    # 4.31f

    .line 585
    .line 586
    .line 587
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 588
    .line 589
    .line 590
    const/high16 v17, 0x41500000    # 13.0f

    .line 591
    .line 592
    const/high16 v18, 0x40800000    # 4.0f

    .line 593
    .line 594
    const v13, 0x415ae148    # 13.68f

    .line 595
    .line 596
    .line 597
    const v14, 0x4081eb85    # 4.06f

    .line 598
    .line 599
    .line 600
    const v15, 0x4155999a    # 13.35f

    .line 601
    .line 602
    .line 603
    const/high16 v16, 0x40800000    # 4.0f

    .line 604
    .line 605
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 606
    .line 607
    .line 608
    const/high16 v0, -0x40000000    # -2.0f

    .line 609
    .line 610
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 611
    .line 612
    .line 613
    const v0, 0x4005c28f    # 2.09f

    .line 614
    .line 615
    .line 616
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 617
    .line 618
    .line 619
    const/high16 v17, 0x41800000    # 16.0f

    .line 620
    .line 621
    const/high16 v18, 0x41400000    # 12.0f

    .line 622
    .line 623
    const v13, 0x415d70a4    # 13.84f

    .line 624
    .line 625
    .line 626
    const v14, 0x40d23d71    # 6.57f

    .line 627
    .line 628
    .line 629
    const/high16 v15, 0x41800000    # 16.0f

    .line 630
    .line 631
    const v16, 0x41107ae1    # 9.03f

    .line 632
    .line 633
    .line 634
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 635
    .line 636
    .line 637
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 638
    .line 639
    .line 640
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 641
    .line 642
    .line 643
    move-result-object v2

    .line 644
    const/16 v16, 0x3800

    .line 645
    .line 646
    const/16 v17, 0x0

    .line 647
    .line 648
    const/high16 v6, 0x3f800000    # 1.0f

    .line 649
    .line 650
    const/high16 v8, 0x3f800000    # 1.0f

    .line 651
    .line 652
    const/4 v7, 0x0

    .line 653
    const/high16 v9, 0x3f800000    # 1.0f

    .line 654
    .line 655
    const/high16 v12, 0x3f800000    # 1.0f

    .line 656
    .line 657
    const/4 v13, 0x0

    .line 658
    const/4 v14, 0x0

    .line 659
    const/4 v15, 0x0

    .line 660
    const-string v4, ""

    .line 661
    .line 662
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 663
    .line 664
    .line 665
    move-result-object v0

    .line 666
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 667
    .line 668
    .line 669
    move-result-object v0

    .line 670
    sput-object v0, Landroidx/compose/material/icons/rounded/SanitizerKt;->_sanitizer:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 671
    .line 672
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 673
    .line 674
    .line 675
    return-object v0
.end method
