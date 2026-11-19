.class public final Landroidx/compose/material/icons/rounded/LeaveBagsAtHomeKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _leaveBagsAtHome:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getLeaveBagsAtHome(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/LeaveBagsAtHomeKt;->_leaveBagsAtHome:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.LeaveBagsAtHome"

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
    const v0, 0x41107ae1    # 9.03f

    .line 71
    .line 72
    .line 73
    const v2, 0x413dc28f    # 11.86f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const/high16 v17, 0x41400000    # 12.0f

    .line 80
    .line 81
    const/high16 v18, 0x41100000    # 9.0f

    .line 82
    .line 83
    const v13, 0x413e8f5c    # 11.91f

    .line 84
    .line 85
    .line 86
    const v14, 0x411051ec    # 9.02f

    .line 87
    .line 88
    .line 89
    const v15, 0x413f3333    # 11.95f

    .line 90
    .line 91
    .line 92
    const/high16 v16, 0x41100000    # 9.0f

    .line 93
    .line 94
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 95
    .line 96
    .line 97
    const/high16 v17, 0x3f400000    # 0.75f

    .line 98
    .line 99
    const/high16 v18, 0x3f400000    # 0.75f

    .line 100
    .line 101
    const v13, 0x3ed1eb85    # 0.41f

    .line 102
    .line 103
    .line 104
    const/4 v14, 0x0

    .line 105
    const/high16 v15, 0x3f400000    # 0.75f

    .line 106
    .line 107
    const v16, 0x3eae147b    # 0.34f

    .line 108
    .line 109
    .line 110
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 111
    .line 112
    .line 113
    const v0, 0x3e2e147b    # 0.17f

    .line 114
    .line 115
    .line 116
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 117
    .line 118
    .line 119
    const/high16 v0, 0x3fe00000    # 1.75f

    .line 120
    .line 121
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 122
    .line 123
    .line 124
    const/high16 v0, 0x411c0000    # 9.75f

    .line 125
    .line 126
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 127
    .line 128
    .line 129
    const/high16 v17, 0x41740000    # 15.25f

    .line 130
    .line 131
    const/high16 v18, 0x41100000    # 9.0f

    .line 132
    .line 133
    const/high16 v13, 0x41680000    # 14.5f

    .line 134
    .line 135
    const v14, 0x411570a4    # 9.34f

    .line 136
    .line 137
    .line 138
    const v15, 0x416d70a4    # 14.84f

    .line 139
    .line 140
    .line 141
    const/high16 v16, 0x41100000    # 9.0f

    .line 142
    .line 143
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 144
    .line 145
    .line 146
    const v0, 0x411570a4    # 9.34f

    .line 147
    .line 148
    .line 149
    const/high16 v2, 0x41800000    # 16.0f

    .line 150
    .line 151
    const/high16 v4, 0x411c0000    # 9.75f

    .line 152
    .line 153
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 154
    .line 155
    .line 156
    const v0, 0x405ae148    # 3.42f

    .line 157
    .line 158
    .line 159
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 160
    .line 161
    .line 162
    const/high16 v0, 0x40400000    # 3.0f

    .line 163
    .line 164
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 165
    .line 166
    .line 167
    const/high16 v0, 0x41000000    # 8.0f

    .line 168
    .line 169
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 170
    .line 171
    .line 172
    const/high16 v17, -0x40000000    # -2.0f

    .line 173
    .line 174
    const/high16 v18, -0x40000000    # -2.0f

    .line 175
    .line 176
    const/4 v13, 0x0

    .line 177
    const v14, -0x40733333    # -1.1f

    .line 178
    .line 179
    .line 180
    const v15, -0x4099999a    # -0.9f

    .line 181
    .line 182
    .line 183
    const/high16 v16, -0x40000000    # -2.0f

    .line 184
    .line 185
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 186
    .line 187
    .line 188
    const/high16 v0, -0x40000000    # -2.0f

    .line 189
    .line 190
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 191
    .line 192
    .line 193
    const/high16 v0, 0x40400000    # 3.0f

    .line 194
    .line 195
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 196
    .line 197
    .line 198
    const/high16 v17, -0x40800000    # -1.0f

    .line 199
    .line 200
    const/high16 v18, -0x40800000    # -1.0f

    .line 201
    .line 202
    const v14, -0x40f33333    # -0.55f

    .line 203
    .line 204
    .line 205
    const v15, -0x4119999a    # -0.45f

    .line 206
    .line 207
    .line 208
    const/high16 v16, -0x40800000    # -1.0f

    .line 209
    .line 210
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 211
    .line 212
    .line 213
    const/high16 v0, -0x3f800000    # -4.0f

    .line 214
    .line 215
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 216
    .line 217
    .line 218
    const/high16 v17, 0x41100000    # 9.0f

    .line 219
    .line 220
    const/high16 v18, 0x40400000    # 3.0f

    .line 221
    .line 222
    const v13, 0x41173333    # 9.45f

    .line 223
    .line 224
    .line 225
    const/high16 v14, 0x40000000    # 2.0f

    .line 226
    .line 227
    const/high16 v15, 0x41100000    # 9.0f

    .line 228
    .line 229
    const v16, 0x401ccccd    # 2.45f

    .line 230
    .line 231
    .line 232
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 233
    .line 234
    .line 235
    const/high16 v0, 0x40400000    # 3.0f

    .line 236
    .line 237
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 238
    .line 239
    .line 240
    const v0, 0x410d47ae    # 8.83f

    .line 241
    .line 242
    .line 243
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 244
    .line 245
    .line 246
    const v0, 0x41107ae1    # 9.03f

    .line 247
    .line 248
    .line 249
    const v2, 0x413dc28f    # 11.86f

    .line 250
    .line 251
    .line 252
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 253
    .line 254
    .line 255
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 256
    .line 257
    .line 258
    const/high16 v0, 0x40800000    # 4.0f

    .line 259
    .line 260
    const/high16 v2, 0x41300000    # 11.0f

    .line 261
    .line 262
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 263
    .line 264
    .line 265
    const/high16 v0, 0x40000000    # 2.0f

    .line 266
    .line 267
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 268
    .line 269
    .line 270
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 271
    .line 272
    .line 273
    const/high16 v0, -0x40000000    # -2.0f

    .line 274
    .line 275
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 276
    .line 277
    .line 278
    const/high16 v0, 0x40800000    # 4.0f

    .line 279
    .line 280
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 281
    .line 282
    .line 283
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 284
    .line 285
    .line 286
    const v0, 0x41a3eb85    # 20.49f

    .line 287
    .line 288
    .line 289
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 290
    .line 291
    .line 292
    const v0, 0x4060a3d7    # 3.51f

    .line 293
    .line 294
    .line 295
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 296
    .line 297
    .line 298
    const v17, -0x404b851f    # -1.41f

    .line 299
    .line 300
    .line 301
    const/16 v18, 0x0

    .line 302
    .line 303
    const v13, -0x413851ec    # -0.39f

    .line 304
    .line 305
    .line 306
    const v14, -0x413851ec    # -0.39f

    .line 307
    .line 308
    .line 309
    const v15, -0x407d70a4    # -1.02f

    .line 310
    .line 311
    .line 312
    const v16, -0x413851ec    # -0.39f

    .line 313
    .line 314
    .line 315
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 316
    .line 317
    .line 318
    const/16 v17, 0x0

    .line 319
    .line 320
    const v18, 0x3fb47ae1    # 1.41f

    .line 321
    .line 322
    .line 323
    const v14, 0x3ec7ae14    # 0.39f

    .line 324
    .line 325
    .line 326
    const v15, -0x413851ec    # -0.39f

    .line 327
    .line 328
    .line 329
    const v16, 0x3f828f5c    # 1.02f

    .line 330
    .line 331
    .line 332
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 333
    .line 334
    .line 335
    const v0, 0x403ae148    # 2.92f

    .line 336
    .line 337
    .line 338
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 339
    .line 340
    .line 341
    const/high16 v17, 0x40a00000    # 5.0f

    .line 342
    .line 343
    const/high16 v18, 0x41000000    # 8.0f

    .line 344
    .line 345
    const v13, 0x40a0a3d7    # 5.02f

    .line 346
    .line 347
    .line 348
    const v14, 0x40fccccd    # 7.9f

    .line 349
    .line 350
    .line 351
    const/high16 v15, 0x40a00000    # 5.0f

    .line 352
    .line 353
    const v16, 0x40fe6666    # 7.95f

    .line 354
    .line 355
    .line 356
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 357
    .line 358
    .line 359
    const/high16 v0, 0x41300000    # 11.0f

    .line 360
    .line 361
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 362
    .line 363
    .line 364
    const/high16 v17, 0x40000000    # 2.0f

    .line 365
    .line 366
    const/high16 v18, 0x40000000    # 2.0f

    .line 367
    .line 368
    const/4 v13, 0x0

    .line 369
    const v14, 0x3f8ccccd    # 1.1f

    .line 370
    .line 371
    .line 372
    const v15, 0x3f666666    # 0.9f

    .line 373
    .line 374
    .line 375
    const/high16 v16, 0x40000000    # 2.0f

    .line 376
    .line 377
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 378
    .line 379
    .line 380
    const/high16 v17, 0x3f800000    # 1.0f

    .line 381
    .line 382
    const/high16 v18, 0x3f800000    # 1.0f

    .line 383
    .line 384
    const v14, 0x3f0ccccd    # 0.55f

    .line 385
    .line 386
    .line 387
    const v15, 0x3ee66666    # 0.45f

    .line 388
    .line 389
    .line 390
    const/high16 v16, 0x3f800000    # 1.0f

    .line 391
    .line 392
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 393
    .line 394
    .line 395
    const/high16 v18, -0x40800000    # -1.0f

    .line 396
    .line 397
    const v13, 0x3f0ccccd    # 0.55f

    .line 398
    .line 399
    .line 400
    const/4 v14, 0x0

    .line 401
    const/high16 v15, 0x3f800000    # 1.0f

    .line 402
    .line 403
    const v16, -0x4119999a    # -0.45f

    .line 404
    .line 405
    .line 406
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 407
    .line 408
    .line 409
    const/high16 v0, 0x40c00000    # 6.0f

    .line 410
    .line 411
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 412
    .line 413
    .line 414
    const/high16 v18, 0x3f800000    # 1.0f

    .line 415
    .line 416
    const/4 v13, 0x0

    .line 417
    const v14, 0x3f0ccccd    # 0.55f

    .line 418
    .line 419
    .line 420
    const v15, 0x3ee66666    # 0.45f

    .line 421
    .line 422
    .line 423
    const/high16 v16, 0x3f800000    # 1.0f

    .line 424
    .line 425
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 426
    .line 427
    .line 428
    const/high16 v18, -0x40800000    # -1.0f

    .line 429
    .line 430
    const v13, 0x3f0ccccd    # 0.55f

    .line 431
    .line 432
    .line 433
    const/4 v14, 0x0

    .line 434
    const/high16 v15, 0x3f800000    # 1.0f

    .line 435
    .line 436
    const v16, -0x4119999a    # -0.45f

    .line 437
    .line 438
    .line 439
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 440
    .line 441
    .line 442
    const v17, 0x3f6e147b    # 0.93f

    .line 443
    .line 444
    .line 445
    const v18, -0x418a3d71    # -0.24f

    .line 446
    .line 447
    .line 448
    const v13, 0x3eae147b    # 0.34f

    .line 449
    .line 450
    .line 451
    const v15, 0x3f266666    # 0.65f

    .line 452
    .line 453
    .line 454
    const v16, -0x4247ae14    # -0.09f

    .line 455
    .line 456
    .line 457
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 458
    .line 459
    .line 460
    const v0, 0x3f91eb85    # 1.14f

    .line 461
    .line 462
    .line 463
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 464
    .line 465
    .line 466
    const v17, 0x3fb47ae1    # 1.41f

    .line 467
    .line 468
    .line 469
    const/16 v18, 0x0

    .line 470
    .line 471
    const v13, 0x3ec7ae14    # 0.39f

    .line 472
    .line 473
    .line 474
    const v14, 0x3ec7ae14    # 0.39f

    .line 475
    .line 476
    .line 477
    const v15, 0x3f828f5c    # 1.02f

    .line 478
    .line 479
    .line 480
    const v16, 0x3ec7ae14    # 0.39f

    .line 481
    .line 482
    .line 483
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 484
    .line 485
    .line 486
    const v17, 0x41a3eb85    # 20.49f

    .line 487
    .line 488
    .line 489
    const v18, 0x41a3eb85    # 20.49f

    .line 490
    .line 491
    .line 492
    const v13, 0x41a70a3d    # 20.88f

    .line 493
    .line 494
    .line 495
    const v14, 0x41ac147b    # 21.51f

    .line 496
    .line 497
    .line 498
    const v15, 0x41a70a3d    # 20.88f

    .line 499
    .line 500
    .line 501
    const v16, 0x41a70a3d    # 20.88f

    .line 502
    .line 503
    .line 504
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 505
    .line 506
    .line 507
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 508
    .line 509
    .line 510
    const/high16 v0, 0x410c0000    # 8.75f

    .line 511
    .line 512
    const/high16 v2, 0x41900000    # 18.0f

    .line 513
    .line 514
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 515
    .line 516
    .line 517
    const/high16 v17, 0x41000000    # 8.0f

    .line 518
    .line 519
    const/high16 v18, 0x418a0000    # 17.25f

    .line 520
    .line 521
    const v13, 0x410570a4    # 8.34f

    .line 522
    .line 523
    .line 524
    const/high16 v14, 0x41900000    # 18.0f

    .line 525
    .line 526
    const/high16 v15, 0x41000000    # 8.0f

    .line 527
    .line 528
    const v16, 0x418d47ae    # 17.66f

    .line 529
    .line 530
    .line 531
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 532
    .line 533
    .line 534
    const v0, -0x3f328f5c    # -6.42f

    .line 535
    .line 536
    .line 537
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 538
    .line 539
    .line 540
    const/high16 v0, 0x3fc00000    # 1.5f

    .line 541
    .line 542
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 543
    .line 544
    .line 545
    const v0, 0x409d70a4    # 4.92f

    .line 546
    .line 547
    .line 548
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 549
    .line 550
    .line 551
    const/high16 v17, 0x410c0000    # 8.75f

    .line 552
    .line 553
    const/high16 v18, 0x41900000    # 18.0f

    .line 554
    .line 555
    const/high16 v13, 0x41180000    # 9.5f

    .line 556
    .line 557
    const v14, 0x418d47ae    # 17.66f

    .line 558
    .line 559
    .line 560
    const v15, 0x41128f5c    # 9.16f

    .line 561
    .line 562
    .line 563
    const/high16 v16, 0x41900000    # 18.0f

    .line 564
    .line 565
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 566
    .line 567
    .line 568
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 569
    .line 570
    .line 571
    const/high16 v0, 0x41400000    # 12.0f

    .line 572
    .line 573
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 574
    .line 575
    .line 576
    const/high16 v17, -0x40c00000    # -0.75f

    .line 577
    .line 578
    const/high16 v18, -0x40c00000    # -0.75f

    .line 579
    .line 580
    const v13, -0x412e147b    # -0.41f

    .line 581
    .line 582
    .line 583
    const/4 v14, 0x0

    .line 584
    const/high16 v15, -0x40c00000    # -0.75f

    .line 585
    .line 586
    const v16, -0x4151eb85    # -0.34f

    .line 587
    .line 588
    .line 589
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 590
    .line 591
    .line 592
    const v0, -0x3fb51eb8    # -3.17f

    .line 593
    .line 594
    .line 595
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 596
    .line 597
    .line 598
    const/high16 v0, 0x3fc00000    # 1.5f

    .line 599
    .line 600
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 601
    .line 602
    .line 603
    const v0, 0x3fd5c28f    # 1.67f

    .line 604
    .line 605
    .line 606
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 607
    .line 608
    .line 609
    const/high16 v17, 0x41400000    # 12.0f

    .line 610
    .line 611
    const/high16 v18, 0x41900000    # 18.0f

    .line 612
    .line 613
    const/high16 v13, 0x414c0000    # 12.75f

    .line 614
    .line 615
    const v14, 0x418d47ae    # 17.66f

    .line 616
    .line 617
    .line 618
    const v15, 0x41468f5c    # 12.41f

    .line 619
    .line 620
    .line 621
    const/high16 v16, 0x41900000    # 18.0f

    .line 622
    .line 623
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 624
    .line 625
    .line 626
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 627
    .line 628
    .line 629
    const v0, 0x416851ec    # 14.52f

    .line 630
    .line 631
    .line 632
    const v2, 0x418acccd    # 17.35f

    .line 633
    .line 634
    .line 635
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 636
    .line 637
    .line 638
    const v0, 0x3f2147ae    # 0.63f

    .line 639
    .line 640
    .line 641
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 642
    .line 643
    .line 644
    const v17, 0x416851ec    # 14.52f

    .line 645
    .line 646
    .line 647
    const v18, 0x418acccd    # 17.35f

    .line 648
    .line 649
    .line 650
    const v13, 0x416d1eb8    # 14.82f

    .line 651
    .line 652
    .line 653
    const v14, 0x418f70a4    # 17.93f

    .line 654
    .line 655
    .line 656
    const v15, 0x41691eb8    # 14.57f

    .line 657
    .line 658
    .line 659
    const v16, 0x418d70a4    # 17.68f

    .line 660
    .line 661
    .line 662
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 663
    .line 664
    .line 665
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 666
    .line 667
    .line 668
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 669
    .line 670
    .line 671
    move-result-object v2

    .line 672
    const/16 v16, 0x3800

    .line 673
    .line 674
    const/16 v17, 0x0

    .line 675
    .line 676
    const/high16 v6, 0x3f800000    # 1.0f

    .line 677
    .line 678
    const/high16 v8, 0x3f800000    # 1.0f

    .line 679
    .line 680
    const/4 v7, 0x0

    .line 681
    const/high16 v9, 0x3f800000    # 1.0f

    .line 682
    .line 683
    const/high16 v12, 0x3f800000    # 1.0f

    .line 684
    .line 685
    const/4 v13, 0x0

    .line 686
    const/4 v14, 0x0

    .line 687
    const/4 v15, 0x0

    .line 688
    const-string v4, ""

    .line 689
    .line 690
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 691
    .line 692
    .line 693
    move-result-object v0

    .line 694
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 695
    .line 696
    .line 697
    move-result-object v0

    .line 698
    sput-object v0, Landroidx/compose/material/icons/rounded/LeaveBagsAtHomeKt;->_leaveBagsAtHome:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 699
    .line 700
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 701
    .line 702
    .line 703
    return-object v0
.end method
