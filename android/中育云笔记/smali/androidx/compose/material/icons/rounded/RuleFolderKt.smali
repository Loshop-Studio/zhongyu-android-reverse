.class public final Landroidx/compose/material/icons/rounded/RuleFolderKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _ruleFolder:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getRuleFolder(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/RuleFolderKt;->_ruleFolder:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.RuleFolder"

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
    const/high16 v2, 0x40c00000    # 6.0f

    .line 73
    .line 74
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v0, -0x3f000000    # -8.0f

    .line 78
    .line 79
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 80
    .line 81
    .line 82
    const v0, -0x404b851f    # -1.41f

    .line 83
    .line 84
    .line 85
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 86
    .line 87
    .line 88
    const v17, 0x4112b852    # 9.17f

    .line 89
    .line 90
    .line 91
    const/high16 v18, 0x40800000    # 4.0f

    .line 92
    .line 93
    const v13, 0x41235c29    # 10.21f

    .line 94
    .line 95
    .line 96
    const v14, 0x4086b852    # 4.21f

    .line 97
    .line 98
    .line 99
    const v15, 0x411b3333    # 9.7f

    .line 100
    .line 101
    .line 102
    const/high16 v16, 0x40800000    # 4.0f

    .line 103
    .line 104
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 105
    .line 106
    .line 107
    const/high16 v0, 0x40800000    # 4.0f

    .line 108
    .line 109
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 110
    .line 111
    .line 112
    const v17, 0x4000a3d7    # 2.01f

    .line 113
    .line 114
    .line 115
    const/high16 v18, 0x40c00000    # 6.0f

    .line 116
    .line 117
    const v13, 0x4039999a    # 2.9f

    .line 118
    .line 119
    .line 120
    const/high16 v14, 0x40800000    # 4.0f

    .line 121
    .line 122
    const v15, 0x4000a3d7    # 2.01f

    .line 123
    .line 124
    .line 125
    const v16, 0x409ccccd    # 4.9f

    .line 126
    .line 127
    .line 128
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 129
    .line 130
    .line 131
    const/high16 v0, 0x40000000    # 2.0f

    .line 132
    .line 133
    const/high16 v2, 0x41900000    # 18.0f

    .line 134
    .line 135
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 136
    .line 137
    .line 138
    const/high16 v17, 0x40000000    # 2.0f

    .line 139
    .line 140
    const/high16 v18, 0x40000000    # 2.0f

    .line 141
    .line 142
    const/4 v13, 0x0

    .line 143
    const v14, 0x3f8ccccd    # 1.1f

    .line 144
    .line 145
    .line 146
    const v15, 0x3f666666    # 0.9f

    .line 147
    .line 148
    .line 149
    const/high16 v16, 0x40000000    # 2.0f

    .line 150
    .line 151
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 152
    .line 153
    .line 154
    const/high16 v0, 0x41800000    # 16.0f

    .line 155
    .line 156
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 157
    .line 158
    .line 159
    const/high16 v18, -0x40000000    # -2.0f

    .line 160
    .line 161
    const v13, 0x3f8ccccd    # 1.1f

    .line 162
    .line 163
    .line 164
    const/4 v14, 0x0

    .line 165
    const/high16 v15, 0x40000000    # 2.0f

    .line 166
    .line 167
    const v16, -0x4099999a    # -0.9f

    .line 168
    .line 169
    .line 170
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 171
    .line 172
    .line 173
    const/high16 v0, 0x41000000    # 8.0f

    .line 174
    .line 175
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 176
    .line 177
    .line 178
    const/high16 v17, 0x41a00000    # 20.0f

    .line 179
    .line 180
    const/high16 v18, 0x40c00000    # 6.0f

    .line 181
    .line 182
    const/high16 v13, 0x41b00000    # 22.0f

    .line 183
    .line 184
    const v14, 0x40dccccd    # 6.9f

    .line 185
    .line 186
    .line 187
    const v15, 0x41a8cccd    # 21.1f

    .line 188
    .line 189
    .line 190
    const/high16 v16, 0x40c00000    # 6.0f

    .line 191
    .line 192
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 193
    .line 194
    .line 195
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 196
    .line 197
    .line 198
    const v0, 0x40e3d70a    # 7.12f

    .line 199
    .line 200
    .line 201
    const v2, 0x4174a3d7    # 15.29f

    .line 202
    .line 203
    .line 204
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 205
    .line 206
    .line 207
    const v0, -0x404b851f    # -1.41f

    .line 208
    .line 209
    .line 210
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 211
    .line 212
    .line 213
    const/16 v17, 0x0

    .line 214
    .line 215
    const v18, -0x404b851f    # -1.41f

    .line 216
    .line 217
    .line 218
    const v13, -0x413851ec    # -0.39f

    .line 219
    .line 220
    .line 221
    const v14, -0x413851ec    # -0.39f

    .line 222
    .line 223
    .line 224
    const v15, -0x413851ec    # -0.39f

    .line 225
    .line 226
    .line 227
    const v16, -0x407d70a4    # -1.02f

    .line 228
    .line 229
    .line 230
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 231
    .line 232
    .line 233
    const/4 v0, 0x0

    .line 234
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 235
    .line 236
    .line 237
    const v17, 0x3fb47ae1    # 1.41f

    .line 238
    .line 239
    .line 240
    const/16 v18, 0x0

    .line 241
    .line 242
    const v13, 0x3ec7ae14    # 0.39f

    .line 243
    .line 244
    .line 245
    const v15, 0x3f828f5c    # 1.02f

    .line 246
    .line 247
    .line 248
    const v16, -0x413851ec    # -0.39f

    .line 249
    .line 250
    .line 251
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 252
    .line 253
    .line 254
    const v0, 0x3f35c28f    # 0.71f

    .line 255
    .line 256
    .line 257
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 258
    .line 259
    .line 260
    const v0, 0x40351eb8    # 2.83f

    .line 261
    .line 262
    .line 263
    const v2, -0x3fcae148    # -2.83f

    .line 264
    .line 265
    .line 266
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 267
    .line 268
    .line 269
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 270
    .line 271
    .line 272
    const/4 v0, 0x0

    .line 273
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 274
    .line 275
    .line 276
    const/16 v17, 0x0

    .line 277
    .line 278
    const v18, 0x3fb47ae1    # 1.41f

    .line 279
    .line 280
    .line 281
    const v14, 0x3ec7ae14    # 0.39f

    .line 282
    .line 283
    .line 284
    const v15, 0x3ec7ae14    # 0.39f

    .line 285
    .line 286
    .line 287
    const v16, 0x3f828f5c    # 1.02f

    .line 288
    .line 289
    .line 290
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 291
    .line 292
    .line 293
    const v0, -0x3f9d70a4    # -3.54f

    .line 294
    .line 295
    .line 296
    const v2, 0x40628f5c    # 3.54f

    .line 297
    .line 298
    .line 299
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 300
    .line 301
    .line 302
    const v17, 0x40e3d70a    # 7.12f

    .line 303
    .line 304
    .line 305
    const v18, 0x4174a3d7    # 15.29f

    .line 306
    .line 307
    .line 308
    const v13, 0x41023d71    # 8.14f

    .line 309
    .line 310
    .line 311
    const v14, 0x417ae148    # 15.68f

    .line 312
    .line 313
    .line 314
    const v15, 0x40f051ec    # 7.51f

    .line 315
    .line 316
    .line 317
    const v16, 0x417ae148    # 15.68f

    .line 318
    .line 319
    .line 320
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 321
    .line 322
    .line 323
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 324
    .line 325
    .line 326
    const v0, 0x418b47ae    # 17.41f

    .line 327
    .line 328
    .line 329
    const/high16 v2, 0x41500000    # 13.0f

    .line 330
    .line 331
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 332
    .line 333
    .line 334
    const v0, 0x3f6147ae    # 0.88f

    .line 335
    .line 336
    .line 337
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 338
    .line 339
    .line 340
    const/16 v17, 0x0

    .line 341
    .line 342
    const v18, 0x3fb47ae1    # 1.41f

    .line 343
    .line 344
    .line 345
    const v13, 0x3ec7ae14    # 0.39f

    .line 346
    .line 347
    .line 348
    const v14, 0x3ec7ae14    # 0.39f

    .line 349
    .line 350
    .line 351
    const v15, 0x3ec7ae14    # 0.39f

    .line 352
    .line 353
    .line 354
    const v16, 0x3f828f5c    # 1.02f

    .line 355
    .line 356
    .line 357
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 358
    .line 359
    .line 360
    const/4 v0, 0x0

    .line 361
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 362
    .line 363
    .line 364
    const v17, -0x404b851f    # -1.41f

    .line 365
    .line 366
    .line 367
    const/16 v18, 0x0

    .line 368
    .line 369
    const v13, -0x413851ec    # -0.39f

    .line 370
    .line 371
    .line 372
    const v15, -0x407d70a4    # -1.02f

    .line 373
    .line 374
    .line 375
    const v16, 0x3ec7ae14    # 0.39f

    .line 376
    .line 377
    .line 378
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 379
    .line 380
    .line 381
    const v0, 0x41668f5c    # 14.41f

    .line 382
    .line 383
    .line 384
    const/high16 v2, 0x41800000    # 16.0f

    .line 385
    .line 386
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 387
    .line 388
    .line 389
    const v0, -0x409eb852    # -0.88f

    .line 390
    .line 391
    .line 392
    const v2, 0x3f6147ae    # 0.88f

    .line 393
    .line 394
    .line 395
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 396
    .line 397
    .line 398
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 399
    .line 400
    .line 401
    const/4 v0, 0x0

    .line 402
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 403
    .line 404
    .line 405
    const/16 v17, 0x0

    .line 406
    .line 407
    const v18, -0x404b851f    # -1.41f

    .line 408
    .line 409
    .line 410
    const v14, -0x413851ec    # -0.39f

    .line 411
    .line 412
    .line 413
    const v15, -0x413851ec    # -0.39f

    .line 414
    .line 415
    .line 416
    const v16, -0x407d70a4    # -1.02f

    .line 417
    .line 418
    .line 419
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 420
    .line 421
    .line 422
    const v0, 0x416970a4    # 14.59f

    .line 423
    .line 424
    .line 425
    const/high16 v2, 0x41500000    # 13.0f

    .line 426
    .line 427
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 428
    .line 429
    .line 430
    const v0, -0x409eb852    # -0.88f

    .line 431
    .line 432
    .line 433
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 434
    .line 435
    .line 436
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 437
    .line 438
    .line 439
    const/4 v0, 0x0

    .line 440
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 441
    .line 442
    .line 443
    const v17, 0x3fb47ae1    # 1.41f

    .line 444
    .line 445
    .line 446
    const/16 v18, 0x0

    .line 447
    .line 448
    const v13, 0x3ec7ae14    # 0.39f

    .line 449
    .line 450
    .line 451
    const v15, 0x3f828f5c    # 1.02f

    .line 452
    .line 453
    .line 454
    const v16, -0x413851ec    # -0.39f

    .line 455
    .line 456
    .line 457
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 458
    .line 459
    .line 460
    const v0, 0x413970a4    # 11.59f

    .line 461
    .line 462
    .line 463
    const/high16 v2, 0x41800000    # 16.0f

    .line 464
    .line 465
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 466
    .line 467
    .line 468
    const v0, -0x409eb852    # -0.88f

    .line 469
    .line 470
    .line 471
    const v2, 0x3f6147ae    # 0.88f

    .line 472
    .line 473
    .line 474
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 475
    .line 476
    .line 477
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 478
    .line 479
    .line 480
    const/4 v0, 0x0

    .line 481
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 482
    .line 483
    .line 484
    const/16 v17, 0x0

    .line 485
    .line 486
    const v18, 0x3fb47ae1    # 1.41f

    .line 487
    .line 488
    .line 489
    const v14, 0x3ec7ae14    # 0.39f

    .line 490
    .line 491
    .line 492
    const v15, 0x3ec7ae14    # 0.39f

    .line 493
    .line 494
    .line 495
    const v16, 0x3f828f5c    # 1.02f

    .line 496
    .line 497
    .line 498
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 499
    .line 500
    .line 501
    const v0, 0x418b47ae    # 17.41f

    .line 502
    .line 503
    .line 504
    const/high16 v2, 0x41500000    # 13.0f

    .line 505
    .line 506
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 507
    .line 508
    .line 509
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 510
    .line 511
    .line 512
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 513
    .line 514
    .line 515
    move-result-object v2

    .line 516
    const/16 v16, 0x3800

    .line 517
    .line 518
    const/16 v17, 0x0

    .line 519
    .line 520
    const/high16 v6, 0x3f800000    # 1.0f

    .line 521
    .line 522
    const/high16 v8, 0x3f800000    # 1.0f

    .line 523
    .line 524
    const/4 v7, 0x0

    .line 525
    const/high16 v9, 0x3f800000    # 1.0f

    .line 526
    .line 527
    const/high16 v12, 0x3f800000    # 1.0f

    .line 528
    .line 529
    const/4 v13, 0x0

    .line 530
    const/4 v14, 0x0

    .line 531
    const/4 v15, 0x0

    .line 532
    const-string v4, ""

    .line 533
    .line 534
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 535
    .line 536
    .line 537
    move-result-object v0

    .line 538
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 539
    .line 540
    .line 541
    move-result-object v0

    .line 542
    sput-object v0, Landroidx/compose/material/icons/rounded/RuleFolderKt;->_ruleFolder:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 543
    .line 544
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 545
    .line 546
    .line 547
    return-object v0
.end method
