.class public final Landroidx/compose/material/icons/filled/SettingsSuggestKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _settingsSuggest:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getSettingsSuggest(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/filled/SettingsSuggestKt;->_settingsSuggest:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Filled.SettingsSuggest"

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
    const v0, 0x40d2e148    # 6.59f

    .line 71
    .line 72
    .line 73
    const v2, 0x418b47ae    # 17.41f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const/high16 v0, 0x41700000    # 15.0f

    .line 80
    .line 81
    const/high16 v2, 0x40b00000    # 5.5f

    .line 82
    .line 83
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 84
    .line 85
    .line 86
    const v0, -0x40747ae1    # -1.09f

    .line 87
    .line 88
    .line 89
    const v2, 0x401a3d71    # 2.41f

    .line 90
    .line 91
    .line 92
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 93
    .line 94
    .line 95
    const/high16 v0, 0x40000000    # 2.0f

    .line 96
    .line 97
    const/high16 v2, 0x41940000    # 18.5f

    .line 98
    .line 99
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 100
    .line 101
    .line 102
    const v0, 0x3f8b851f    # 1.09f

    .line 103
    .line 104
    .line 105
    const v2, 0x401a3d71    # 2.41f

    .line 106
    .line 107
    .line 108
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 109
    .line 110
    .line 111
    const/high16 v0, 0x41b00000    # 22.0f

    .line 112
    .line 113
    const/high16 v2, 0x40b00000    # 5.5f

    .line 114
    .line 115
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 116
    .line 117
    .line 118
    const v0, -0x3fe5c28f    # -2.41f

    .line 119
    .line 120
    .line 121
    const v2, 0x3f8b851f    # 1.09f

    .line 122
    .line 123
    .line 124
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 125
    .line 126
    .line 127
    const/high16 v0, 0x41100000    # 9.0f

    .line 128
    .line 129
    const/high16 v2, 0x41940000    # 18.5f

    .line 130
    .line 131
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 132
    .line 133
    .line 134
    const v0, 0x40d2e148    # 6.59f

    .line 135
    .line 136
    .line 137
    const v2, 0x418b47ae    # 17.41f

    .line 138
    .line 139
    .line 140
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 141
    .line 142
    .line 143
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 144
    .line 145
    .line 146
    const v0, 0x414b851f    # 12.72f

    .line 147
    .line 148
    .line 149
    const v2, 0x41aa3d71    # 21.28f

    .line 150
    .line 151
    .line 152
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 153
    .line 154
    .line 155
    const/high16 v0, 0x41300000    # 11.0f

    .line 156
    .line 157
    const/high16 v2, 0x41a40000    # 20.5f

    .line 158
    .line 159
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 160
    .line 161
    .line 162
    const v0, -0x40b851ec    # -0.78f

    .line 163
    .line 164
    .line 165
    const v2, 0x3fdc28f6    # 1.72f

    .line 166
    .line 167
    .line 168
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 169
    .line 170
    .line 171
    const/high16 v0, 0x41900000    # 18.0f

    .line 172
    .line 173
    const/high16 v2, 0x41580000    # 13.5f

    .line 174
    .line 175
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 176
    .line 177
    .line 178
    const v0, 0x3f47ae14    # 0.78f

    .line 179
    .line 180
    .line 181
    const v2, 0x3fdc28f6    # 1.72f

    .line 182
    .line 183
    .line 184
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 185
    .line 186
    .line 187
    const/high16 v0, 0x41800000    # 16.0f

    .line 188
    .line 189
    const/high16 v2, 0x41a40000    # 20.5f

    .line 190
    .line 191
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 192
    .line 193
    .line 194
    const v0, -0x4023d70a    # -1.72f

    .line 195
    .line 196
    .line 197
    const v2, 0x3f47ae14    # 0.78f

    .line 198
    .line 199
    .line 200
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 201
    .line 202
    .line 203
    const/high16 v0, 0x41b80000    # 23.0f

    .line 204
    .line 205
    const/high16 v2, 0x41580000    # 13.5f

    .line 206
    .line 207
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 208
    .line 209
    .line 210
    const v0, 0x414b851f    # 12.72f

    .line 211
    .line 212
    .line 213
    const v2, 0x41aa3d71    # 21.28f

    .line 214
    .line 215
    .line 216
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 217
    .line 218
    .line 219
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 220
    .line 221
    .line 222
    const v0, 0x4165eb85    # 14.37f

    .line 223
    .line 224
    .line 225
    const v2, 0x4181eb85    # 16.24f

    .line 226
    .line 227
    .line 228
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 229
    .line 230
    .line 231
    const v0, 0x3fbc28f6    # 1.47f

    .line 232
    .line 233
    .line 234
    const v2, 0x3ff851ec    # 1.94f

    .line 235
    .line 236
    .line 237
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 238
    .line 239
    .line 240
    const v0, 0x408a8f5c    # 4.33f

    .line 241
    .line 242
    .line 243
    const/high16 v2, -0x3fe00000    # -2.5f

    .line 244
    .line 245
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 246
    .line 247
    .line 248
    const v0, -0x3ff0a3d7    # -2.24f

    .line 249
    .line 250
    .line 251
    const v2, -0x408f5c29    # -0.94f

    .line 252
    .line 253
    .line 254
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 255
    .line 256
    .line 257
    const v17, -0x40dc28f6    # -0.64f

    .line 258
    .line 259
    .line 260
    const v18, 0x3ebd70a4    # 0.37f

    .line 261
    .line 262
    .line 263
    const v13, -0x41b33333    # -0.2f

    .line 264
    .line 265
    .line 266
    const v14, 0x3e051eb8    # 0.13f

    .line 267
    .line 268
    .line 269
    const v15, -0x4128f5c3    # -0.42f

    .line 270
    .line 271
    .line 272
    const v16, 0x3e851eb8    # 0.26f

    .line 273
    .line 274
    .line 275
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 276
    .line 277
    .line 278
    const/high16 v0, 0x41480000    # 12.5f

    .line 279
    .line 280
    const/high16 v2, 0x41b00000    # 22.0f

    .line 281
    .line 282
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 283
    .line 284
    .line 285
    const/high16 v0, -0x3f600000    # -5.0f

    .line 286
    .line 287
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 288
    .line 289
    .line 290
    const v0, -0x41666666    # -0.3f

    .line 291
    .line 292
    .line 293
    const v2, -0x3fe5c28f    # -2.41f

    .line 294
    .line 295
    .line 296
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 297
    .line 298
    .line 299
    const v18, -0x41428f5c    # -0.37f

    .line 300
    .line 301
    .line 302
    const v13, -0x419eb852    # -0.22f

    .line 303
    .line 304
    .line 305
    const v14, -0x421eb852    # -0.11f

    .line 306
    .line 307
    .line 308
    const v15, -0x4123d70a    # -0.43f

    .line 309
    .line 310
    .line 311
    const v16, -0x41947ae1    # -0.23f

    .line 312
    .line 313
    .line 314
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 315
    .line 316
    .line 317
    const v0, -0x3ff0a3d7    # -2.24f

    .line 318
    .line 319
    .line 320
    const v2, 0x3f70a3d7    # 0.94f

    .line 321
    .line 322
    .line 323
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 324
    .line 325
    .line 326
    const v0, -0x3f7570a4    # -4.33f

    .line 327
    .line 328
    .line 329
    const/high16 v2, -0x3fe00000    # -2.5f

    .line 330
    .line 331
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 332
    .line 333
    .line 334
    const v0, -0x4043d70a    # -1.47f

    .line 335
    .line 336
    .line 337
    const v2, 0x3ff851ec    # 1.94f

    .line 338
    .line 339
    .line 340
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 341
    .line 342
    .line 343
    const/high16 v17, 0x40700000    # 3.75f

    .line 344
    .line 345
    const/high16 v18, 0x41600000    # 14.0f

    .line 346
    .line 347
    const/high16 v13, 0x40700000    # 3.75f

    .line 348
    .line 349
    const/high16 v14, 0x41640000    # 14.25f

    .line 350
    .line 351
    const/high16 v15, 0x40700000    # 3.75f

    .line 352
    .line 353
    const v16, 0x4161eb85    # 14.12f

    .line 354
    .line 355
    .line 356
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 357
    .line 358
    .line 359
    const v0, 0x3c23d70a    # 0.01f

    .line 360
    .line 361
    .line 362
    const v2, -0x41428f5c    # -0.37f

    .line 363
    .line 364
    .line 365
    const/4 v4, 0x0

    .line 366
    const/high16 v6, -0x41800000    # -0.25f

    .line 367
    .line 368
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 369
    .line 370
    .line 371
    const v0, -0x4007ae14    # -1.94f

    .line 372
    .line 373
    .line 374
    const v2, -0x4043d70a    # -1.47f

    .line 375
    .line 376
    .line 377
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 378
    .line 379
    .line 380
    const/high16 v0, 0x40200000    # 2.5f

    .line 381
    .line 382
    const v2, -0x3f7570a4    # -4.33f

    .line 383
    .line 384
    .line 385
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 386
    .line 387
    .line 388
    const v0, 0x400f5c29    # 2.24f

    .line 389
    .line 390
    .line 391
    const v2, 0x3f70a3d7    # 0.94f

    .line 392
    .line 393
    .line 394
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 395
    .line 396
    .line 397
    const v17, 0x3f23d70a    # 0.64f

    .line 398
    .line 399
    .line 400
    const v18, -0x41428f5c    # -0.37f

    .line 401
    .line 402
    .line 403
    const v13, 0x3e4ccccd    # 0.2f

    .line 404
    .line 405
    .line 406
    const v14, -0x41fae148    # -0.13f

    .line 407
    .line 408
    .line 409
    const v15, 0x3ed70a3d    # 0.42f

    .line 410
    .line 411
    .line 412
    const v16, -0x417ae148    # -0.26f

    .line 413
    .line 414
    .line 415
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 416
    .line 417
    .line 418
    const/high16 v0, 0x40f00000    # 7.5f

    .line 419
    .line 420
    const/high16 v2, 0x40c00000    # 6.0f

    .line 421
    .line 422
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 423
    .line 424
    .line 425
    const/high16 v0, 0x40a00000    # 5.0f

    .line 426
    .line 427
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 428
    .line 429
    .line 430
    const v0, 0x3e99999a    # 0.3f

    .line 431
    .line 432
    .line 433
    const v2, 0x401a3d71    # 2.41f

    .line 434
    .line 435
    .line 436
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 437
    .line 438
    .line 439
    const v18, 0x3ebd70a4    # 0.37f

    .line 440
    .line 441
    .line 442
    const v13, 0x3e6147ae    # 0.22f

    .line 443
    .line 444
    .line 445
    const v14, 0x3de147ae    # 0.11f

    .line 446
    .line 447
    .line 448
    const v15, 0x3edc28f6    # 0.43f

    .line 449
    .line 450
    .line 451
    const v16, 0x3e6b851f    # 0.23f

    .line 452
    .line 453
    .line 454
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 455
    .line 456
    .line 457
    const v0, 0x400f5c29    # 2.24f

    .line 458
    .line 459
    .line 460
    const v2, -0x408f5c29    # -0.94f

    .line 461
    .line 462
    .line 463
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 464
    .line 465
    .line 466
    const/high16 v0, 0x40200000    # 2.5f

    .line 467
    .line 468
    const v2, 0x408a8f5c    # 4.33f

    .line 469
    .line 470
    .line 471
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 472
    .line 473
    .line 474
    const v0, -0x4007ae14    # -1.94f

    .line 475
    .line 476
    .line 477
    const v2, 0x3fbc28f6    # 1.47f

    .line 478
    .line 479
    .line 480
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 481
    .line 482
    .line 483
    const v17, 0x3c23d70a    # 0.01f

    .line 484
    .line 485
    .line 486
    const v13, 0x3c23d70a    # 0.01f

    .line 487
    .line 488
    .line 489
    const v14, 0x3df5c28f    # 0.12f

    .line 490
    .line 491
    .line 492
    const v15, 0x3c23d70a    # 0.01f

    .line 493
    .line 494
    .line 495
    const v16, 0x3e75c28f    # 0.24f

    .line 496
    .line 497
    .line 498
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 499
    .line 500
    .line 501
    const/high16 v0, 0x41820000    # 16.25f

    .line 502
    .line 503
    const/high16 v2, 0x41640000    # 14.25f

    .line 504
    .line 505
    const v4, 0x4165eb85    # 14.37f

    .line 506
    .line 507
    .line 508
    const v6, 0x4181eb85    # 16.24f

    .line 509
    .line 510
    .line 511
    invoke-virtual {v12, v0, v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 512
    .line 513
    .line 514
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 515
    .line 516
    .line 517
    const/high16 v0, 0x41600000    # 14.0f

    .line 518
    .line 519
    const/high16 v2, 0x41500000    # 13.0f

    .line 520
    .line 521
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 522
    .line 523
    .line 524
    const/high16 v17, -0x3fc00000    # -3.0f

    .line 525
    .line 526
    const/high16 v18, -0x3fc00000    # -3.0f

    .line 527
    .line 528
    const/4 v13, 0x0

    .line 529
    const v14, -0x402b851f    # -1.66f

    .line 530
    .line 531
    .line 532
    const v15, -0x40547ae1    # -1.34f

    .line 533
    .line 534
    .line 535
    const/high16 v16, -0x3fc00000    # -3.0f

    .line 536
    .line 537
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 538
    .line 539
    .line 540
    const v0, 0x3fab851f    # 1.34f

    .line 541
    .line 542
    .line 543
    const/high16 v2, -0x3fc00000    # -3.0f

    .line 544
    .line 545
    const/high16 v4, 0x40400000    # 3.0f

    .line 546
    .line 547
    const/high16 v6, -0x3fc00000    # -3.0f

    .line 548
    .line 549
    invoke-virtual {v12, v6, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 550
    .line 551
    .line 552
    const/high16 v2, 0x40400000    # 3.0f

    .line 553
    .line 554
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 555
    .line 556
    .line 557
    const v0, 0x417a8f5c    # 15.66f

    .line 558
    .line 559
    .line 560
    const/high16 v2, 0x41600000    # 14.0f

    .line 561
    .line 562
    const/high16 v4, 0x41500000    # 13.0f

    .line 563
    .line 564
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 565
    .line 566
    .line 567
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 568
    .line 569
    .line 570
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 571
    .line 572
    .line 573
    move-result-object v2

    .line 574
    const/16 v16, 0x3800

    .line 575
    .line 576
    const/16 v17, 0x0

    .line 577
    .line 578
    const/high16 v6, 0x3f800000    # 1.0f

    .line 579
    .line 580
    const/high16 v8, 0x3f800000    # 1.0f

    .line 581
    .line 582
    const/4 v7, 0x0

    .line 583
    const/high16 v9, 0x3f800000    # 1.0f

    .line 584
    .line 585
    const/high16 v12, 0x3f800000    # 1.0f

    .line 586
    .line 587
    const/4 v14, 0x0

    .line 588
    const/4 v15, 0x0

    .line 589
    const-string v4, ""

    .line 590
    .line 591
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 592
    .line 593
    .line 594
    move-result-object v0

    .line 595
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 596
    .line 597
    .line 598
    move-result-object v0

    .line 599
    sput-object v0, Landroidx/compose/material/icons/filled/SettingsSuggestKt;->_settingsSuggest:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 600
    .line 601
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 602
    .line 603
    .line 604
    return-object v0
.end method
