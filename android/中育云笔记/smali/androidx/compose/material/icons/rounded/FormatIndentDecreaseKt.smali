.class public final Landroidx/compose/material/icons/rounded/FormatIndentDecreaseKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _formatIndentDecrease:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getFormatIndentDecrease(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/FormatIndentDecreaseKt;->_formatIndentDecrease:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.FormatIndentDecrease"

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
    const/high16 v0, 0x41880000    # 17.0f

    .line 71
    .line 72
    const/high16 v2, 0x41400000    # 12.0f

    .line 73
    .line 74
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v0, 0x41000000    # 8.0f

    .line 78
    .line 79
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 80
    .line 81
    .line 82
    const/high16 v17, 0x3f800000    # 1.0f

    .line 83
    .line 84
    const/high16 v18, -0x40800000    # -1.0f

    .line 85
    .line 86
    const v13, 0x3f0ccccd    # 0.55f

    .line 87
    .line 88
    .line 89
    const/4 v14, 0x0

    .line 90
    const/high16 v15, 0x3f800000    # 1.0f

    .line 91
    .line 92
    const v16, -0x4119999a    # -0.45f

    .line 93
    .line 94
    .line 95
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 96
    .line 97
    .line 98
    const v0, -0x4119999a    # -0.45f

    .line 99
    .line 100
    .line 101
    const/high16 v2, -0x40800000    # -1.0f

    .line 102
    .line 103
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 104
    .line 105
    .line 106
    const/high16 v0, -0x3f000000    # -8.0f

    .line 107
    .line 108
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 109
    .line 110
    .line 111
    const/high16 v17, -0x40800000    # -1.0f

    .line 112
    .line 113
    const/high16 v18, 0x3f800000    # 1.0f

    .line 114
    .line 115
    const v13, -0x40f33333    # -0.55f

    .line 116
    .line 117
    .line 118
    const/high16 v15, -0x40800000    # -1.0f

    .line 119
    .line 120
    const v16, 0x3ee66666    # 0.45f

    .line 121
    .line 122
    .line 123
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 124
    .line 125
    .line 126
    const v0, 0x3ee66666    # 0.45f

    .line 127
    .line 128
    .line 129
    const/high16 v2, 0x3f800000    # 1.0f

    .line 130
    .line 131
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 132
    .line 133
    .line 134
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 135
    .line 136
    .line 137
    const v0, 0x40566666    # 3.35f

    .line 138
    .line 139
    .line 140
    const v2, 0x4145999a    # 12.35f

    .line 141
    .line 142
    .line 143
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 144
    .line 145
    .line 146
    const v0, 0x40328f5c    # 2.79f

    .line 147
    .line 148
    .line 149
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 150
    .line 151
    .line 152
    const v17, 0x3f5c28f6    # 0.86f

    .line 153
    .line 154
    .line 155
    const v18, -0x414ccccd    # -0.35f

    .line 156
    .line 157
    .line 158
    const v13, 0x3ea3d70a    # 0.32f

    .line 159
    .line 160
    .line 161
    const v14, 0x3ea3d70a    # 0.32f

    .line 162
    .line 163
    .line 164
    const v15, 0x3f5c28f6    # 0.86f

    .line 165
    .line 166
    .line 167
    const v16, 0x3dcccccd    # 0.1f

    .line 168
    .line 169
    .line 170
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 171
    .line 172
    .line 173
    const/high16 v0, 0x40e00000    # 7.0f

    .line 174
    .line 175
    const v2, 0x41135c29    # 9.21f

    .line 176
    .line 177
    .line 178
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 179
    .line 180
    .line 181
    const v17, -0x40a66666    # -0.85f

    .line 182
    .line 183
    .line 184
    const/4 v13, 0x0

    .line 185
    const v14, -0x4119999a    # -0.45f

    .line 186
    .line 187
    .line 188
    const v15, -0x40f5c28f    # -0.54f

    .line 189
    .line 190
    .line 191
    const v16, -0x40d47ae1    # -0.67f

    .line 192
    .line 193
    .line 194
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 195
    .line 196
    .line 197
    const v0, -0x3fcd70a4    # -2.79f

    .line 198
    .line 199
    .line 200
    const v2, 0x40328f5c    # 2.79f

    .line 201
    .line 202
    .line 203
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 204
    .line 205
    .line 206
    const v17, -0x43dc28f6    # -0.01f

    .line 207
    .line 208
    .line 209
    const v18, 0x3f333333    # 0.7f

    .line 210
    .line 211
    .line 212
    const v13, -0x41b33333    # -0.2f

    .line 213
    .line 214
    .line 215
    const v14, 0x3e428f5c    # 0.19f

    .line 216
    .line 217
    .line 218
    const v15, -0x41b33333    # -0.2f

    .line 219
    .line 220
    .line 221
    const v16, 0x3f028f5c    # 0.51f

    .line 222
    .line 223
    .line 224
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 225
    .line 226
    .line 227
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 228
    .line 229
    .line 230
    const/high16 v0, 0x41a80000    # 21.0f

    .line 231
    .line 232
    const/high16 v2, 0x40800000    # 4.0f

    .line 233
    .line 234
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 235
    .line 236
    .line 237
    const/high16 v0, 0x41800000    # 16.0f

    .line 238
    .line 239
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 240
    .line 241
    .line 242
    const/high16 v17, 0x3f800000    # 1.0f

    .line 243
    .line 244
    const/high16 v18, -0x40800000    # -1.0f

    .line 245
    .line 246
    const v13, 0x3f0ccccd    # 0.55f

    .line 247
    .line 248
    .line 249
    const/4 v14, 0x0

    .line 250
    const/high16 v15, 0x3f800000    # 1.0f

    .line 251
    .line 252
    const v16, -0x4119999a    # -0.45f

    .line 253
    .line 254
    .line 255
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 256
    .line 257
    .line 258
    const v0, -0x4119999a    # -0.45f

    .line 259
    .line 260
    .line 261
    const/high16 v2, -0x40800000    # -1.0f

    .line 262
    .line 263
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 264
    .line 265
    .line 266
    const/high16 v0, 0x41980000    # 19.0f

    .line 267
    .line 268
    const/high16 v2, 0x40800000    # 4.0f

    .line 269
    .line 270
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 271
    .line 272
    .line 273
    const/high16 v17, -0x40800000    # -1.0f

    .line 274
    .line 275
    const/high16 v18, 0x3f800000    # 1.0f

    .line 276
    .line 277
    const v13, -0x40f33333    # -0.55f

    .line 278
    .line 279
    .line 280
    const/high16 v15, -0x40800000    # -1.0f

    .line 281
    .line 282
    const v16, 0x3ee66666    # 0.45f

    .line 283
    .line 284
    .line 285
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 286
    .line 287
    .line 288
    const v0, 0x3ee66666    # 0.45f

    .line 289
    .line 290
    .line 291
    const/high16 v2, 0x3f800000    # 1.0f

    .line 292
    .line 293
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 294
    .line 295
    .line 296
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 297
    .line 298
    .line 299
    const/high16 v0, 0x40400000    # 3.0f

    .line 300
    .line 301
    const/high16 v2, 0x40800000    # 4.0f

    .line 302
    .line 303
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 304
    .line 305
    .line 306
    const/high16 v17, 0x3f800000    # 1.0f

    .line 307
    .line 308
    const/4 v13, 0x0

    .line 309
    const v14, 0x3f0ccccd    # 0.55f

    .line 310
    .line 311
    .line 312
    const v15, 0x3ee66666    # 0.45f

    .line 313
    .line 314
    .line 315
    const/high16 v16, 0x3f800000    # 1.0f

    .line 316
    .line 317
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 318
    .line 319
    .line 320
    const/high16 v0, 0x41800000    # 16.0f

    .line 321
    .line 322
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 323
    .line 324
    .line 325
    const/high16 v18, -0x40800000    # -1.0f

    .line 326
    .line 327
    const v13, 0x3f0ccccd    # 0.55f

    .line 328
    .line 329
    .line 330
    const/4 v14, 0x0

    .line 331
    const/high16 v15, 0x3f800000    # 1.0f

    .line 332
    .line 333
    const v16, -0x4119999a    # -0.45f

    .line 334
    .line 335
    .line 336
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 337
    .line 338
    .line 339
    const v0, -0x4119999a    # -0.45f

    .line 340
    .line 341
    .line 342
    const/high16 v2, -0x40800000    # -1.0f

    .line 343
    .line 344
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 345
    .line 346
    .line 347
    const/high16 v0, 0x40400000    # 3.0f

    .line 348
    .line 349
    const/high16 v2, 0x40800000    # 4.0f

    .line 350
    .line 351
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 352
    .line 353
    .line 354
    const/high16 v17, -0x40800000    # -1.0f

    .line 355
    .line 356
    const/high16 v18, 0x3f800000    # 1.0f

    .line 357
    .line 358
    const v13, -0x40f33333    # -0.55f

    .line 359
    .line 360
    .line 361
    const/high16 v15, -0x40800000    # -1.0f

    .line 362
    .line 363
    const v16, 0x3ee66666    # 0.45f

    .line 364
    .line 365
    .line 366
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 367
    .line 368
    .line 369
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 370
    .line 371
    .line 372
    const/high16 v0, 0x41100000    # 9.0f

    .line 373
    .line 374
    const/high16 v2, 0x41400000    # 12.0f

    .line 375
    .line 376
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 377
    .line 378
    .line 379
    const/high16 v0, 0x41000000    # 8.0f

    .line 380
    .line 381
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 382
    .line 383
    .line 384
    const/high16 v17, 0x3f800000    # 1.0f

    .line 385
    .line 386
    const/high16 v18, -0x40800000    # -1.0f

    .line 387
    .line 388
    const v13, 0x3f0ccccd    # 0.55f

    .line 389
    .line 390
    .line 391
    const/high16 v15, 0x3f800000    # 1.0f

    .line 392
    .line 393
    const v16, -0x4119999a    # -0.45f

    .line 394
    .line 395
    .line 396
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 397
    .line 398
    .line 399
    const v0, -0x4119999a    # -0.45f

    .line 400
    .line 401
    .line 402
    const/high16 v2, -0x40800000    # -1.0f

    .line 403
    .line 404
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 405
    .line 406
    .line 407
    const/high16 v0, -0x3f000000    # -8.0f

    .line 408
    .line 409
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 410
    .line 411
    .line 412
    const/high16 v17, -0x40800000    # -1.0f

    .line 413
    .line 414
    const/high16 v18, 0x3f800000    # 1.0f

    .line 415
    .line 416
    const v13, -0x40f33333    # -0.55f

    .line 417
    .line 418
    .line 419
    const/high16 v15, -0x40800000    # -1.0f

    .line 420
    .line 421
    const v16, 0x3ee66666    # 0.45f

    .line 422
    .line 423
    .line 424
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 425
    .line 426
    .line 427
    const v0, 0x3ee66666    # 0.45f

    .line 428
    .line 429
    .line 430
    const/high16 v2, 0x3f800000    # 1.0f

    .line 431
    .line 432
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 433
    .line 434
    .line 435
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 436
    .line 437
    .line 438
    const/high16 v0, 0x41500000    # 13.0f

    .line 439
    .line 440
    const/high16 v2, 0x41400000    # 12.0f

    .line 441
    .line 442
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 443
    .line 444
    .line 445
    const/high16 v0, 0x41000000    # 8.0f

    .line 446
    .line 447
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 448
    .line 449
    .line 450
    const/high16 v17, 0x3f800000    # 1.0f

    .line 451
    .line 452
    const/high16 v18, -0x40800000    # -1.0f

    .line 453
    .line 454
    const v13, 0x3f0ccccd    # 0.55f

    .line 455
    .line 456
    .line 457
    const/high16 v15, 0x3f800000    # 1.0f

    .line 458
    .line 459
    const v16, -0x4119999a    # -0.45f

    .line 460
    .line 461
    .line 462
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 463
    .line 464
    .line 465
    const v0, -0x4119999a    # -0.45f

    .line 466
    .line 467
    .line 468
    const/high16 v2, -0x40800000    # -1.0f

    .line 469
    .line 470
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 471
    .line 472
    .line 473
    const/high16 v0, -0x3f000000    # -8.0f

    .line 474
    .line 475
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 476
    .line 477
    .line 478
    const/high16 v17, -0x40800000    # -1.0f

    .line 479
    .line 480
    const/high16 v18, 0x3f800000    # 1.0f

    .line 481
    .line 482
    const v13, -0x40f33333    # -0.55f

    .line 483
    .line 484
    .line 485
    const/high16 v15, -0x40800000    # -1.0f

    .line 486
    .line 487
    const v16, 0x3ee66666    # 0.45f

    .line 488
    .line 489
    .line 490
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 491
    .line 492
    .line 493
    const v0, 0x3ee66666    # 0.45f

    .line 494
    .line 495
    .line 496
    const/high16 v2, 0x3f800000    # 1.0f

    .line 497
    .line 498
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 499
    .line 500
    .line 501
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 502
    .line 503
    .line 504
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 505
    .line 506
    .line 507
    move-result-object v2

    .line 508
    const/16 v16, 0x3800

    .line 509
    .line 510
    const/16 v17, 0x0

    .line 511
    .line 512
    const/high16 v6, 0x3f800000    # 1.0f

    .line 513
    .line 514
    const/high16 v8, 0x3f800000    # 1.0f

    .line 515
    .line 516
    const/4 v7, 0x0

    .line 517
    const/high16 v9, 0x3f800000    # 1.0f

    .line 518
    .line 519
    const/high16 v12, 0x3f800000    # 1.0f

    .line 520
    .line 521
    const/4 v13, 0x0

    .line 522
    const/4 v15, 0x0

    .line 523
    const-string v4, ""

    .line 524
    .line 525
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 526
    .line 527
    .line 528
    move-result-object v0

    .line 529
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 530
    .line 531
    .line 532
    move-result-object v0

    .line 533
    sput-object v0, Landroidx/compose/material/icons/rounded/FormatIndentDecreaseKt;->_formatIndentDecrease:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 534
    .line 535
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 536
    .line 537
    .line 538
    return-object v0
.end method

.method public static synthetic getFormatIndentDecrease$annotations(Landroidx/compose/material/icons/Icons$Rounded;)V
    .locals 0
    .annotation runtime Lqc/a;
    .end annotation

    return-void
.end method
