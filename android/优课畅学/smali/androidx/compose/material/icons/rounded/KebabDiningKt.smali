.class public final Landroidx/compose/material/icons/rounded/KebabDiningKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _kebabDining:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getKebabDining(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/KebabDiningKt;->_kebabDining:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.KebabDining"

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
    const/high16 v0, 0x41500000    # 13.0f

    .line 71
    .line 72
    const/high16 v2, 0x40f80000    # 7.75f

    .line 73
    .line 74
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v0, 0x3f800000    # 1.0f

    .line 78
    .line 79
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 80
    .line 81
    .line 82
    const/high16 v0, 0x41080000    # 8.5f

    .line 83
    .line 84
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 85
    .line 86
    .line 87
    const/high16 v17, 0x40200000    # 2.5f

    .line 88
    .line 89
    const/high16 v18, 0x40200000    # 2.5f

    .line 90
    .line 91
    const v13, 0x3fb0a3d7    # 1.38f

    .line 92
    .line 93
    .line 94
    const/4 v14, 0x0

    .line 95
    const/high16 v15, 0x40200000    # 2.5f

    .line 96
    .line 97
    const v16, 0x3f8f5c29    # 1.12f

    .line 98
    .line 99
    .line 100
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 101
    .line 102
    .line 103
    const/high16 v17, -0x3fe00000    # -2.5f

    .line 104
    .line 105
    const/4 v13, 0x0

    .line 106
    const v14, 0x3fb0a3d7    # 1.38f

    .line 107
    .line 108
    .line 109
    const v15, -0x4070a3d7    # -1.12f

    .line 110
    .line 111
    .line 112
    const/high16 v16, 0x40200000    # 2.5f

    .line 113
    .line 114
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 115
    .line 116
    .line 117
    const/high16 v0, 0x40f80000    # 7.75f

    .line 118
    .line 119
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 120
    .line 121
    .line 122
    const/high16 v0, 0x40500000    # 3.25f

    .line 123
    .line 124
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 125
    .line 126
    .line 127
    const/high16 v17, 0x40e00000    # 7.0f

    .line 128
    .line 129
    const/high16 v18, 0x41b80000    # 23.0f

    .line 130
    .line 131
    const/high16 v13, 0x40f80000    # 7.75f

    .line 132
    .line 133
    const v14, 0x41b547ae    # 22.66f

    .line 134
    .line 135
    .line 136
    const v15, 0x40ed1eb8    # 7.41f

    .line 137
    .line 138
    .line 139
    const/high16 v16, 0x41b80000    # 23.0f

    .line 140
    .line 141
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 142
    .line 143
    .line 144
    const v0, -0x4151eb85    # -0.34f

    .line 145
    .line 146
    .line 147
    const/high16 v2, -0x40c00000    # -0.75f

    .line 148
    .line 149
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 150
    .line 151
    .line 152
    const/high16 v0, 0x41980000    # 19.0f

    .line 153
    .line 154
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 155
    .line 156
    .line 157
    const/high16 v0, 0x40b00000    # 5.5f

    .line 158
    .line 159
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 160
    .line 161
    .line 162
    const/high16 v17, 0x40400000    # 3.0f

    .line 163
    .line 164
    const/high16 v18, 0x41840000    # 16.5f

    .line 165
    .line 166
    const v13, 0x4083d70a    # 4.12f

    .line 167
    .line 168
    .line 169
    const/high16 v14, 0x41980000    # 19.0f

    .line 170
    .line 171
    const/high16 v15, 0x40400000    # 3.0f

    .line 172
    .line 173
    const v16, 0x418f0a3d    # 17.88f

    .line 174
    .line 175
    .line 176
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 177
    .line 178
    .line 179
    const/high16 v17, 0x40b00000    # 5.5f

    .line 180
    .line 181
    const/high16 v18, 0x41600000    # 14.0f

    .line 182
    .line 183
    const/high16 v13, 0x40400000    # 3.0f

    .line 184
    .line 185
    const v14, 0x4171eb85    # 15.12f

    .line 186
    .line 187
    .line 188
    const v15, 0x4083d70a    # 4.12f

    .line 189
    .line 190
    .line 191
    const/high16 v16, 0x41600000    # 14.0f

    .line 192
    .line 193
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 194
    .line 195
    .line 196
    const/high16 v0, 0x3f400000    # 0.75f

    .line 197
    .line 198
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 199
    .line 200
    .line 201
    const/high16 v0, -0x40800000    # -1.0f

    .line 202
    .line 203
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 204
    .line 205
    .line 206
    const/high16 v0, 0x40800000    # 4.0f

    .line 207
    .line 208
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 209
    .line 210
    .line 211
    const/high16 v17, -0x40800000    # -1.0f

    .line 212
    .line 213
    const/high16 v18, -0x40800000    # -1.0f

    .line 214
    .line 215
    const v13, -0x40f33333    # -0.55f

    .line 216
    .line 217
    .line 218
    const/4 v14, 0x0

    .line 219
    const/high16 v15, -0x40800000    # -1.0f

    .line 220
    .line 221
    const v16, -0x4119999a    # -0.45f

    .line 222
    .line 223
    .line 224
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 225
    .line 226
    .line 227
    const/high16 v0, 0x41100000    # 9.0f

    .line 228
    .line 229
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 230
    .line 231
    .line 232
    const/high16 v17, 0x3f800000    # 1.0f

    .line 233
    .line 234
    const/4 v13, 0x0

    .line 235
    const v14, -0x40f33333    # -0.55f

    .line 236
    .line 237
    .line 238
    const v15, 0x3ee66666    # 0.45f

    .line 239
    .line 240
    .line 241
    const/high16 v16, -0x40800000    # -1.0f

    .line 242
    .line 243
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 244
    .line 245
    .line 246
    const/high16 v0, 0x40100000    # 2.25f

    .line 247
    .line 248
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 249
    .line 250
    .line 251
    const/high16 v0, 0x40e00000    # 7.0f

    .line 252
    .line 253
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 254
    .line 255
    .line 256
    const/high16 v0, 0x40b00000    # 5.5f

    .line 257
    .line 258
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 259
    .line 260
    .line 261
    const/high16 v17, 0x40400000    # 3.0f

    .line 262
    .line 263
    const/high16 v18, 0x40900000    # 4.5f

    .line 264
    .line 265
    const v13, 0x4083d70a    # 4.12f

    .line 266
    .line 267
    .line 268
    const/high16 v14, 0x40e00000    # 7.0f

    .line 269
    .line 270
    const/high16 v15, 0x40400000    # 3.0f

    .line 271
    .line 272
    const v16, 0x40bc28f6    # 5.88f

    .line 273
    .line 274
    .line 275
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 276
    .line 277
    .line 278
    const/high16 v17, 0x40b00000    # 5.5f

    .line 279
    .line 280
    const/high16 v18, 0x40000000    # 2.0f

    .line 281
    .line 282
    const/high16 v13, 0x40400000    # 3.0f

    .line 283
    .line 284
    const v14, 0x4047ae14    # 3.12f

    .line 285
    .line 286
    .line 287
    const v15, 0x4083d70a    # 4.12f

    .line 288
    .line 289
    .line 290
    const/high16 v16, 0x40000000    # 2.0f

    .line 291
    .line 292
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 293
    .line 294
    .line 295
    const/high16 v0, 0x3f400000    # 0.75f

    .line 296
    .line 297
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 298
    .line 299
    .line 300
    const/high16 v0, 0x3fe00000    # 1.75f

    .line 301
    .line 302
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 303
    .line 304
    .line 305
    const/high16 v17, 0x40e00000    # 7.0f

    .line 306
    .line 307
    const/high16 v18, 0x3f800000    # 1.0f

    .line 308
    .line 309
    const/high16 v13, 0x40c80000    # 6.25f

    .line 310
    .line 311
    const v14, 0x3fab851f    # 1.34f

    .line 312
    .line 313
    .line 314
    const v15, 0x40d2e148    # 6.59f

    .line 315
    .line 316
    .line 317
    const/high16 v16, 0x3f800000    # 1.0f

    .line 318
    .line 319
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 320
    .line 321
    .line 322
    const v0, 0x3eae147b    # 0.34f

    .line 323
    .line 324
    .line 325
    const/high16 v2, 0x3f400000    # 0.75f

    .line 326
    .line 327
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 328
    .line 329
    .line 330
    const/high16 v0, 0x40000000    # 2.0f

    .line 331
    .line 332
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 333
    .line 334
    .line 335
    const/high16 v0, 0x41080000    # 8.5f

    .line 336
    .line 337
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 338
    .line 339
    .line 340
    const/high16 v17, 0x41300000    # 11.0f

    .line 341
    .line 342
    const/high16 v18, 0x40900000    # 4.5f

    .line 343
    .line 344
    const v13, 0x411e147b    # 9.88f

    .line 345
    .line 346
    .line 347
    const/high16 v14, 0x40000000    # 2.0f

    .line 348
    .line 349
    const/high16 v15, 0x41300000    # 11.0f

    .line 350
    .line 351
    const v16, 0x4047ae14    # 3.12f

    .line 352
    .line 353
    .line 354
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 355
    .line 356
    .line 357
    const/high16 v17, 0x41080000    # 8.5f

    .line 358
    .line 359
    const/high16 v18, 0x40e00000    # 7.0f

    .line 360
    .line 361
    const/high16 v13, 0x41300000    # 11.0f

    .line 362
    .line 363
    const v14, 0x40bc28f6    # 5.88f

    .line 364
    .line 365
    .line 366
    const v15, 0x411e147b    # 9.88f

    .line 367
    .line 368
    .line 369
    const/high16 v16, 0x40e00000    # 7.0f

    .line 370
    .line 371
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 372
    .line 373
    .line 374
    const/high16 v0, 0x40f80000    # 7.75f

    .line 375
    .line 376
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 377
    .line 378
    .line 379
    const/high16 v0, 0x3f800000    # 1.0f

    .line 380
    .line 381
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 382
    .line 383
    .line 384
    const/high16 v0, 0x41200000    # 10.0f

    .line 385
    .line 386
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 387
    .line 388
    .line 389
    const/high16 v17, 0x3f800000    # 1.0f

    .line 390
    .line 391
    const/high16 v18, 0x3f800000    # 1.0f

    .line 392
    .line 393
    const v13, 0x3f0ccccd    # 0.55f

    .line 394
    .line 395
    .line 396
    const/4 v14, 0x0

    .line 397
    const/high16 v15, 0x3f800000    # 1.0f

    .line 398
    .line 399
    const v16, 0x3ee66666    # 0.45f

    .line 400
    .line 401
    .line 402
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 403
    .line 404
    .line 405
    const/high16 v0, 0x40400000    # 3.0f

    .line 406
    .line 407
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 408
    .line 409
    .line 410
    const/high16 v17, -0x40800000    # -1.0f

    .line 411
    .line 412
    const/4 v13, 0x0

    .line 413
    const v14, 0x3f0ccccd    # 0.55f

    .line 414
    .line 415
    .line 416
    const v15, -0x4119999a    # -0.45f

    .line 417
    .line 418
    .line 419
    const/high16 v16, 0x3f800000    # 1.0f

    .line 420
    .line 421
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 422
    .line 423
    .line 424
    const/high16 v0, 0x40f80000    # 7.75f

    .line 425
    .line 426
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 427
    .line 428
    .line 429
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 430
    .line 431
    .line 432
    const/high16 v0, 0x418e0000    # 17.75f

    .line 433
    .line 434
    const/high16 v2, 0x41500000    # 13.0f

    .line 435
    .line 436
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 437
    .line 438
    .line 439
    const/high16 v0, 0x3f800000    # 1.0f

    .line 440
    .line 441
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 442
    .line 443
    .line 444
    const/high16 v0, 0x3f400000    # 0.75f

    .line 445
    .line 446
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 447
    .line 448
    .line 449
    const/high16 v17, 0x40200000    # 2.5f

    .line 450
    .line 451
    const/high16 v18, 0x40200000    # 2.5f

    .line 452
    .line 453
    const v13, 0x3fb0a3d7    # 1.38f

    .line 454
    .line 455
    .line 456
    const/4 v14, 0x0

    .line 457
    const/high16 v15, 0x40200000    # 2.5f

    .line 458
    .line 459
    const v16, 0x3f8f5c29    # 1.12f

    .line 460
    .line 461
    .line 462
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 463
    .line 464
    .line 465
    const/high16 v17, -0x3fe00000    # -2.5f

    .line 466
    .line 467
    const/4 v13, 0x0

    .line 468
    const v14, 0x3fb0a3d7    # 1.38f

    .line 469
    .line 470
    .line 471
    const v15, -0x4070a3d7    # -1.12f

    .line 472
    .line 473
    .line 474
    const/high16 v16, 0x40200000    # 2.5f

    .line 475
    .line 476
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 477
    .line 478
    .line 479
    const/high16 v0, -0x40c00000    # -0.75f

    .line 480
    .line 481
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 482
    .line 483
    .line 484
    const/high16 v0, 0x40500000    # 3.25f

    .line 485
    .line 486
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 487
    .line 488
    .line 489
    const/high16 v17, -0x40c00000    # -0.75f

    .line 490
    .line 491
    const/high16 v18, 0x3f400000    # 0.75f

    .line 492
    .line 493
    const v14, 0x3ed1eb85    # 0.41f

    .line 494
    .line 495
    .line 496
    const v15, -0x4151eb85    # -0.34f

    .line 497
    .line 498
    .line 499
    const/high16 v16, 0x3f400000    # 0.75f

    .line 500
    .line 501
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 502
    .line 503
    .line 504
    const v0, -0x4151eb85    # -0.34f

    .line 505
    .line 506
    .line 507
    const/high16 v2, -0x40c00000    # -0.75f

    .line 508
    .line 509
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 510
    .line 511
    .line 512
    const/high16 v0, 0x41980000    # 19.0f

    .line 513
    .line 514
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 515
    .line 516
    .line 517
    const/high16 v0, 0x41780000    # 15.5f

    .line 518
    .line 519
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 520
    .line 521
    .line 522
    const/high16 v17, -0x3fe00000    # -2.5f

    .line 523
    .line 524
    const/high16 v18, -0x3fe00000    # -2.5f

    .line 525
    .line 526
    const v13, -0x404f5c29    # -1.38f

    .line 527
    .line 528
    .line 529
    const/4 v14, 0x0

    .line 530
    const/high16 v15, -0x3fe00000    # -2.5f

    .line 531
    .line 532
    const v16, -0x4070a3d7    # -1.12f

    .line 533
    .line 534
    .line 535
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 536
    .line 537
    .line 538
    const/high16 v17, 0x40200000    # 2.5f

    .line 539
    .line 540
    const/4 v13, 0x0

    .line 541
    const v14, -0x404f5c29    # -1.38f

    .line 542
    .line 543
    .line 544
    const v15, 0x3f8f5c29    # 1.12f

    .line 545
    .line 546
    .line 547
    const/high16 v16, -0x3fe00000    # -2.5f

    .line 548
    .line 549
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 550
    .line 551
    .line 552
    const/high16 v0, 0x3f400000    # 0.75f

    .line 553
    .line 554
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 555
    .line 556
    .line 557
    const/high16 v0, -0x40800000    # -1.0f

    .line 558
    .line 559
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 560
    .line 561
    .line 562
    const/high16 v0, 0x41600000    # 14.0f

    .line 563
    .line 564
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 565
    .line 566
    .line 567
    const/high16 v17, -0x40800000    # -1.0f

    .line 568
    .line 569
    const/high16 v18, -0x40800000    # -1.0f

    .line 570
    .line 571
    const v13, -0x40f33333    # -0.55f

    .line 572
    .line 573
    .line 574
    const/4 v14, 0x0

    .line 575
    const/high16 v15, -0x40800000    # -1.0f

    .line 576
    .line 577
    const v16, -0x4119999a    # -0.45f

    .line 578
    .line 579
    .line 580
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 581
    .line 582
    .line 583
    const/high16 v0, 0x41100000    # 9.0f

    .line 584
    .line 585
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 586
    .line 587
    .line 588
    const/high16 v17, 0x3f800000    # 1.0f

    .line 589
    .line 590
    const/4 v13, 0x0

    .line 591
    const v14, -0x40f33333    # -0.55f

    .line 592
    .line 593
    .line 594
    const v15, 0x3ee66666    # 0.45f

    .line 595
    .line 596
    .line 597
    const/high16 v16, -0x40800000    # -1.0f

    .line 598
    .line 599
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 600
    .line 601
    .line 602
    const/high16 v0, 0x40100000    # 2.25f

    .line 603
    .line 604
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 605
    .line 606
    .line 607
    const/high16 v0, 0x40e00000    # 7.0f

    .line 608
    .line 609
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 610
    .line 611
    .line 612
    const/high16 v0, 0x41780000    # 15.5f

    .line 613
    .line 614
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 615
    .line 616
    .line 617
    const/high16 v17, 0x41500000    # 13.0f

    .line 618
    .line 619
    const/high16 v18, 0x40900000    # 4.5f

    .line 620
    .line 621
    const v13, 0x4161eb85    # 14.12f

    .line 622
    .line 623
    .line 624
    const/high16 v14, 0x40e00000    # 7.0f

    .line 625
    .line 626
    const/high16 v15, 0x41500000    # 13.0f

    .line 627
    .line 628
    const v16, 0x40bc28f6    # 5.88f

    .line 629
    .line 630
    .line 631
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 632
    .line 633
    .line 634
    const/high16 v17, 0x41780000    # 15.5f

    .line 635
    .line 636
    const/high16 v18, 0x40000000    # 2.0f

    .line 637
    .line 638
    const/high16 v13, 0x41500000    # 13.0f

    .line 639
    .line 640
    const v14, 0x4047ae14    # 3.12f

    .line 641
    .line 642
    .line 643
    const v15, 0x4161eb85    # 14.12f

    .line 644
    .line 645
    .line 646
    const/high16 v16, 0x40000000    # 2.0f

    .line 647
    .line 648
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 649
    .line 650
    .line 651
    const/high16 v0, 0x3f400000    # 0.75f

    .line 652
    .line 653
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 654
    .line 655
    .line 656
    const/high16 v0, 0x3fe00000    # 1.75f

    .line 657
    .line 658
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 659
    .line 660
    .line 661
    const/high16 v17, 0x41880000    # 17.0f

    .line 662
    .line 663
    const/high16 v18, 0x3f800000    # 1.0f

    .line 664
    .line 665
    const/high16 v13, 0x41820000    # 16.25f

    .line 666
    .line 667
    const v14, 0x3fab851f    # 1.34f

    .line 668
    .line 669
    .line 670
    const v15, 0x4184b852    # 16.59f

    .line 671
    .line 672
    .line 673
    const/high16 v16, 0x3f800000    # 1.0f

    .line 674
    .line 675
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 676
    .line 677
    .line 678
    const v0, 0x3eae147b    # 0.34f

    .line 679
    .line 680
    .line 681
    const/high16 v2, 0x3f400000    # 0.75f

    .line 682
    .line 683
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 684
    .line 685
    .line 686
    const/high16 v0, 0x40000000    # 2.0f

    .line 687
    .line 688
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 689
    .line 690
    .line 691
    const/high16 v0, 0x3f400000    # 0.75f

    .line 692
    .line 693
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 694
    .line 695
    .line 696
    const/high16 v17, 0x41a80000    # 21.0f

    .line 697
    .line 698
    const/high16 v18, 0x40900000    # 4.5f

    .line 699
    .line 700
    const v13, 0x419f0a3d    # 19.88f

    .line 701
    .line 702
    .line 703
    const/high16 v14, 0x40000000    # 2.0f

    .line 704
    .line 705
    const/high16 v15, 0x41a80000    # 21.0f

    .line 706
    .line 707
    const v16, 0x4047ae14    # 3.12f

    .line 708
    .line 709
    .line 710
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 711
    .line 712
    .line 713
    const/high16 v17, 0x41940000    # 18.5f

    .line 714
    .line 715
    const/high16 v18, 0x40e00000    # 7.0f

    .line 716
    .line 717
    const/high16 v13, 0x41a80000    # 21.0f

    .line 718
    .line 719
    const v14, 0x40bc28f6    # 5.88f

    .line 720
    .line 721
    .line 722
    const v15, 0x419f0a3d    # 19.88f

    .line 723
    .line 724
    .line 725
    const/high16 v16, 0x40e00000    # 7.0f

    .line 726
    .line 727
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 728
    .line 729
    .line 730
    const/high16 v0, -0x40c00000    # -0.75f

    .line 731
    .line 732
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 733
    .line 734
    .line 735
    const/high16 v0, 0x3f800000    # 1.0f

    .line 736
    .line 737
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 738
    .line 739
    .line 740
    const/high16 v0, 0x41a00000    # 20.0f

    .line 741
    .line 742
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 743
    .line 744
    .line 745
    const/high16 v17, 0x3f800000    # 1.0f

    .line 746
    .line 747
    const/high16 v18, 0x3f800000    # 1.0f

    .line 748
    .line 749
    const v13, 0x3f0ccccd    # 0.55f

    .line 750
    .line 751
    .line 752
    const/4 v14, 0x0

    .line 753
    const/high16 v15, 0x3f800000    # 1.0f

    .line 754
    .line 755
    const v16, 0x3ee66666    # 0.45f

    .line 756
    .line 757
    .line 758
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 759
    .line 760
    .line 761
    const/high16 v0, 0x40400000    # 3.0f

    .line 762
    .line 763
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 764
    .line 765
    .line 766
    const/high16 v17, -0x40800000    # -1.0f

    .line 767
    .line 768
    const/4 v13, 0x0

    .line 769
    const v14, 0x3f0ccccd    # 0.55f

    .line 770
    .line 771
    .line 772
    const v15, -0x4119999a    # -0.45f

    .line 773
    .line 774
    .line 775
    const/high16 v16, 0x3f800000    # 1.0f

    .line 776
    .line 777
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 778
    .line 779
    .line 780
    const/high16 v0, 0x418e0000    # 17.75f

    .line 781
    .line 782
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 783
    .line 784
    .line 785
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 786
    .line 787
    .line 788
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 789
    .line 790
    .line 791
    move-result-object v2

    .line 792
    const/16 v16, 0x3800

    .line 793
    .line 794
    const/16 v17, 0x0

    .line 795
    .line 796
    const/high16 v6, 0x3f800000    # 1.0f

    .line 797
    .line 798
    const/high16 v8, 0x3f800000    # 1.0f

    .line 799
    .line 800
    const/4 v7, 0x0

    .line 801
    const/high16 v9, 0x3f800000    # 1.0f

    .line 802
    .line 803
    const/high16 v12, 0x3f800000    # 1.0f

    .line 804
    .line 805
    const/4 v14, 0x0

    .line 806
    const/4 v15, 0x0

    .line 807
    const-string v4, ""

    .line 808
    .line 809
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 810
    .line 811
    .line 812
    move-result-object v0

    .line 813
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 814
    .line 815
    .line 816
    move-result-object v0

    .line 817
    sput-object v0, Landroidx/compose/material/icons/rounded/KebabDiningKt;->_kebabDining:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 818
    .line 819
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 820
    .line 821
    .line 822
    return-object v0
.end method
