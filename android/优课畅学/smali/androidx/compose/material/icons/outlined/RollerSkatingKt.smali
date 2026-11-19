.class public final Landroidx/compose/material/icons/outlined/RollerSkatingKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _rollerSkating:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getRollerSkating(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/outlined/RollerSkatingKt;->_rollerSkating:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Outlined.RollerSkating"

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
    const/high16 v2, 0x41400000    # 12.0f

    .line 73
    .line 74
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const v17, -0x3fc5c28f    # -2.91f

    .line 78
    .line 79
    .line 80
    const v18, -0x3f8b851f    # -3.82f

    .line 81
    .line 82
    .line 83
    const/4 v13, 0x0

    .line 84
    const v14, -0x401ae148    # -1.79f

    .line 85
    .line 86
    .line 87
    const v15, -0x4067ae14    # -1.19f

    .line 88
    .line 89
    .line 90
    const v16, -0x3faa3d71    # -3.34f

    .line 91
    .line 92
    .line 93
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 94
    .line 95
    .line 96
    const v0, -0x3fd851ec    # -2.62f

    .line 97
    .line 98
    .line 99
    const v2, -0x40c28f5c    # -0.74f

    .line 100
    .line 101
    .line 102
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 103
    .line 104
    .line 105
    const/high16 v17, 0x41500000    # 13.0f

    .line 106
    .line 107
    const/high16 v18, 0x40b00000    # 5.5f

    .line 108
    .line 109
    const v13, 0x4159eb85    # 13.62f

    .line 110
    .line 111
    .line 112
    const v14, 0x40e6147b    # 7.19f

    .line 113
    .line 114
    .line 115
    const/high16 v15, 0x41500000    # 13.0f

    .line 116
    .line 117
    const v16, 0x40cc7ae1    # 6.39f

    .line 118
    .line 119
    .line 120
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 121
    .line 122
    .line 123
    const/high16 v0, 0x3f800000    # 1.0f

    .line 124
    .line 125
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 126
    .line 127
    .line 128
    const/high16 v0, 0x40800000    # 4.0f

    .line 129
    .line 130
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 131
    .line 132
    .line 133
    const/high16 v0, 0x41700000    # 15.0f

    .line 134
    .line 135
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 136
    .line 137
    .line 138
    const/high16 v0, 0x41800000    # 16.0f

    .line 139
    .line 140
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 141
    .line 142
    .line 143
    const/high16 v0, 0x41400000    # 12.0f

    .line 144
    .line 145
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 146
    .line 147
    .line 148
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 149
    .line 150
    .line 151
    const/high16 v0, 0x41900000    # 18.0f

    .line 152
    .line 153
    const/high16 v2, 0x41600000    # 14.0f

    .line 154
    .line 155
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 156
    .line 157
    .line 158
    const/high16 v0, 0x40c00000    # 6.0f

    .line 159
    .line 160
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 161
    .line 162
    .line 163
    const/high16 v0, 0x40400000    # 3.0f

    .line 164
    .line 165
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 166
    .line 167
    .line 168
    const/high16 v0, 0x40a00000    # 5.0f

    .line 169
    .line 170
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 171
    .line 172
    .line 173
    const/high16 v0, 0x3f800000    # 1.0f

    .line 174
    .line 175
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 176
    .line 177
    .line 178
    const/high16 v0, 0x41180000    # 9.5f

    .line 179
    .line 180
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 181
    .line 182
    .line 183
    const/high16 v17, 0x41100000    # 9.0f

    .line 184
    .line 185
    const/high16 v18, 0x40900000    # 4.5f

    .line 186
    .line 187
    const v13, 0x4113851f    # 9.22f

    .line 188
    .line 189
    .line 190
    const/high16 v14, 0x40800000    # 4.0f

    .line 191
    .line 192
    const/high16 v15, 0x41100000    # 9.0f

    .line 193
    .line 194
    const v16, 0x40870a3d    # 4.22f

    .line 195
    .line 196
    .line 197
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 198
    .line 199
    .line 200
    const/high16 v17, 0x41180000    # 9.5f

    .line 201
    .line 202
    const/high16 v18, 0x40a00000    # 5.0f

    .line 203
    .line 204
    const/high16 v13, 0x41100000    # 9.0f

    .line 205
    .line 206
    const v14, 0x4098f5c3    # 4.78f

    .line 207
    .line 208
    .line 209
    const v15, 0x4113851f    # 9.22f

    .line 210
    .line 211
    .line 212
    const/high16 v16, 0x40a00000    # 5.0f

    .line 213
    .line 214
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 215
    .line 216
    .line 217
    const/high16 v0, 0x41300000    # 11.0f

    .line 218
    .line 219
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 220
    .line 221
    .line 222
    const v0, 0x3dcccccd    # 0.1f

    .line 223
    .line 224
    .line 225
    const/high16 v2, 0x3f800000    # 1.0f

    .line 226
    .line 227
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 228
    .line 229
    .line 230
    const/high16 v0, 0x41180000    # 9.5f

    .line 231
    .line 232
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 233
    .line 234
    .line 235
    const/high16 v17, 0x41100000    # 9.0f

    .line 236
    .line 237
    const/high16 v18, 0x40d00000    # 6.5f

    .line 238
    .line 239
    const v13, 0x4113851f    # 9.22f

    .line 240
    .line 241
    .line 242
    const/high16 v14, 0x40c00000    # 6.0f

    .line 243
    .line 244
    const/high16 v15, 0x41100000    # 9.0f

    .line 245
    .line 246
    const v16, 0x40c70a3d    # 6.22f

    .line 247
    .line 248
    .line 249
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 250
    .line 251
    .line 252
    const/high16 v17, 0x41180000    # 9.5f

    .line 253
    .line 254
    const/high16 v18, 0x40e00000    # 7.0f

    .line 255
    .line 256
    const/high16 v13, 0x41100000    # 9.0f

    .line 257
    .line 258
    const v14, 0x40d8f5c3    # 6.78f

    .line 259
    .line 260
    .line 261
    const v15, 0x4113851f    # 9.22f

    .line 262
    .line 263
    .line 264
    const/high16 v16, 0x40e00000    # 7.0f

    .line 265
    .line 266
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 267
    .line 268
    .line 269
    const v0, 0x3fe7ae14    # 1.81f

    .line 270
    .line 271
    .line 272
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 273
    .line 274
    .line 275
    const v17, 0x40266666    # 2.6f

    .line 276
    .line 277
    .line 278
    const v18, 0x40170a3d    # 2.36f

    .line 279
    .line 280
    .line 281
    const v13, 0x3ee66666    # 0.45f

    .line 282
    .line 283
    .line 284
    const v14, 0x3f8f5c29    # 1.12f

    .line 285
    .line 286
    .line 287
    const v15, 0x3fb33333    # 1.4f

    .line 288
    .line 289
    .line 290
    const v16, 0x4000a3d7    # 2.01f

    .line 291
    .line 292
    .line 293
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 294
    .line 295
    .line 296
    const v0, 0x4027ae14    # 2.62f

    .line 297
    .line 298
    .line 299
    const v2, 0x3f3ae148    # 0.73f

    .line 300
    .line 301
    .line 302
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 303
    .line 304
    .line 305
    const/high16 v17, 0x41900000    # 18.0f

    .line 306
    .line 307
    const/high16 v18, 0x41400000    # 12.0f

    .line 308
    .line 309
    const v13, 0x418b3333    # 17.4f

    .line 310
    .line 311
    .line 312
    const v14, 0x412547ae    # 10.33f

    .line 313
    .line 314
    .line 315
    const/high16 v15, 0x41900000    # 18.0f

    .line 316
    .line 317
    const v16, 0x4131999a    # 11.1f

    .line 318
    .line 319
    .line 320
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 321
    .line 322
    .line 323
    const/high16 v0, 0x41600000    # 14.0f

    .line 324
    .line 325
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 326
    .line 327
    .line 328
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 329
    .line 330
    .line 331
    const/high16 v0, 0x40a00000    # 5.0f

    .line 332
    .line 333
    const/high16 v2, 0x41880000    # 17.0f

    .line 334
    .line 335
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 336
    .line 337
    .line 338
    const/high16 v17, -0x3fc00000    # -3.0f

    .line 339
    .line 340
    const/high16 v18, 0x40400000    # 3.0f

    .line 341
    .line 342
    const v13, -0x402b851f    # -1.66f

    .line 343
    .line 344
    .line 345
    const/4 v14, 0x0

    .line 346
    const/high16 v15, -0x3fc00000    # -3.0f

    .line 347
    .line 348
    const v16, 0x3fab851f    # 1.34f

    .line 349
    .line 350
    .line 351
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 352
    .line 353
    .line 354
    const v0, 0x3fab851f    # 1.34f

    .line 355
    .line 356
    .line 357
    const/high16 v2, 0x40400000    # 3.0f

    .line 358
    .line 359
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 360
    .line 361
    .line 362
    const/high16 v0, -0x3fc00000    # -3.0f

    .line 363
    .line 364
    const v2, -0x40547ae1    # -1.34f

    .line 365
    .line 366
    .line 367
    const/high16 v4, 0x40400000    # 3.0f

    .line 368
    .line 369
    invoke-virtual {v12, v4, v2, v4, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 370
    .line 371
    .line 372
    const v0, 0x40d51eb8    # 6.66f

    .line 373
    .line 374
    .line 375
    const/high16 v2, 0x40a00000    # 5.0f

    .line 376
    .line 377
    const/high16 v4, 0x41880000    # 17.0f

    .line 378
    .line 379
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 380
    .line 381
    .line 382
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 383
    .line 384
    .line 385
    const/high16 v0, 0x41a80000    # 21.0f

    .line 386
    .line 387
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 388
    .line 389
    .line 390
    const/high16 v17, -0x40800000    # -1.0f

    .line 391
    .line 392
    const/high16 v18, -0x40800000    # -1.0f

    .line 393
    .line 394
    const v13, -0x40f33333    # -0.55f

    .line 395
    .line 396
    .line 397
    const/high16 v15, -0x40800000    # -1.0f

    .line 398
    .line 399
    const v16, -0x4119999a    # -0.45f

    .line 400
    .line 401
    .line 402
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 403
    .line 404
    .line 405
    const/high16 v17, 0x3f800000    # 1.0f

    .line 406
    .line 407
    const/4 v13, 0x0

    .line 408
    const v14, -0x40f33333    # -0.55f

    .line 409
    .line 410
    .line 411
    const v15, 0x3ee66666    # 0.45f

    .line 412
    .line 413
    .line 414
    const/high16 v16, -0x40800000    # -1.0f

    .line 415
    .line 416
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 417
    .line 418
    .line 419
    const v0, 0x3ee66666    # 0.45f

    .line 420
    .line 421
    .line 422
    const/high16 v2, 0x3f800000    # 1.0f

    .line 423
    .line 424
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 425
    .line 426
    .line 427
    const/high16 v17, 0x40a00000    # 5.0f

    .line 428
    .line 429
    const/high16 v18, 0x41a80000    # 21.0f

    .line 430
    .line 431
    const/high16 v13, 0x40c00000    # 6.0f

    .line 432
    .line 433
    const v14, 0x41a46666    # 20.55f

    .line 434
    .line 435
    .line 436
    const v15, 0x40b1999a    # 5.55f

    .line 437
    .line 438
    .line 439
    const/high16 v16, 0x41a80000    # 21.0f

    .line 440
    .line 441
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 442
    .line 443
    .line 444
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 445
    .line 446
    .line 447
    const/high16 v0, 0x41980000    # 19.0f

    .line 448
    .line 449
    const/high16 v2, 0x41880000    # 17.0f

    .line 450
    .line 451
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 452
    .line 453
    .line 454
    const/high16 v17, -0x3fc00000    # -3.0f

    .line 455
    .line 456
    const/high16 v18, 0x40400000    # 3.0f

    .line 457
    .line 458
    const v13, -0x402b851f    # -1.66f

    .line 459
    .line 460
    .line 461
    const/4 v14, 0x0

    .line 462
    const/high16 v15, -0x3fc00000    # -3.0f

    .line 463
    .line 464
    const v16, 0x3fab851f    # 1.34f

    .line 465
    .line 466
    .line 467
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 468
    .line 469
    .line 470
    const v0, 0x3fab851f    # 1.34f

    .line 471
    .line 472
    .line 473
    const/high16 v2, 0x40400000    # 3.0f

    .line 474
    .line 475
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 476
    .line 477
    .line 478
    const/high16 v0, -0x3fc00000    # -3.0f

    .line 479
    .line 480
    const v2, -0x40547ae1    # -1.34f

    .line 481
    .line 482
    .line 483
    const/high16 v4, 0x40400000    # 3.0f

    .line 484
    .line 485
    invoke-virtual {v12, v4, v2, v4, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 486
    .line 487
    .line 488
    const v0, 0x41a547ae    # 20.66f

    .line 489
    .line 490
    .line 491
    const/high16 v2, 0x41980000    # 19.0f

    .line 492
    .line 493
    const/high16 v4, 0x41880000    # 17.0f

    .line 494
    .line 495
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 496
    .line 497
    .line 498
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 499
    .line 500
    .line 501
    const/high16 v0, 0x41980000    # 19.0f

    .line 502
    .line 503
    const/high16 v2, 0x41a80000    # 21.0f

    .line 504
    .line 505
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 506
    .line 507
    .line 508
    const/high16 v17, -0x40800000    # -1.0f

    .line 509
    .line 510
    const/high16 v18, -0x40800000    # -1.0f

    .line 511
    .line 512
    const v13, -0x40f33333    # -0.55f

    .line 513
    .line 514
    .line 515
    const/high16 v15, -0x40800000    # -1.0f

    .line 516
    .line 517
    const v16, -0x4119999a    # -0.45f

    .line 518
    .line 519
    .line 520
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 521
    .line 522
    .line 523
    const/high16 v17, 0x3f800000    # 1.0f

    .line 524
    .line 525
    const/4 v13, 0x0

    .line 526
    const v14, -0x40f33333    # -0.55f

    .line 527
    .line 528
    .line 529
    const v15, 0x3ee66666    # 0.45f

    .line 530
    .line 531
    .line 532
    const/high16 v16, -0x40800000    # -1.0f

    .line 533
    .line 534
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 535
    .line 536
    .line 537
    const v0, 0x3ee66666    # 0.45f

    .line 538
    .line 539
    .line 540
    const/high16 v2, 0x3f800000    # 1.0f

    .line 541
    .line 542
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 543
    .line 544
    .line 545
    const/high16 v17, 0x41980000    # 19.0f

    .line 546
    .line 547
    const/high16 v18, 0x41a80000    # 21.0f

    .line 548
    .line 549
    const/high16 v13, 0x41a00000    # 20.0f

    .line 550
    .line 551
    const v14, 0x41a46666    # 20.55f

    .line 552
    .line 553
    .line 554
    const v15, 0x419c6666    # 19.55f

    .line 555
    .line 556
    .line 557
    const/high16 v16, 0x41a80000    # 21.0f

    .line 558
    .line 559
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 560
    .line 561
    .line 562
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 563
    .line 564
    .line 565
    const/high16 v0, 0x41400000    # 12.0f

    .line 566
    .line 567
    const/high16 v2, 0x41880000    # 17.0f

    .line 568
    .line 569
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 570
    .line 571
    .line 572
    const/high16 v17, -0x3fc00000    # -3.0f

    .line 573
    .line 574
    const/high16 v18, 0x40400000    # 3.0f

    .line 575
    .line 576
    const v13, -0x402b851f    # -1.66f

    .line 577
    .line 578
    .line 579
    const/4 v14, 0x0

    .line 580
    const/high16 v15, -0x3fc00000    # -3.0f

    .line 581
    .line 582
    const v16, 0x3fab851f    # 1.34f

    .line 583
    .line 584
    .line 585
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 586
    .line 587
    .line 588
    const v0, 0x3fab851f    # 1.34f

    .line 589
    .line 590
    .line 591
    const/high16 v2, 0x40400000    # 3.0f

    .line 592
    .line 593
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 594
    .line 595
    .line 596
    const/high16 v0, -0x3fc00000    # -3.0f

    .line 597
    .line 598
    const v2, -0x40547ae1    # -1.34f

    .line 599
    .line 600
    .line 601
    const/high16 v4, 0x40400000    # 3.0f

    .line 602
    .line 603
    invoke-virtual {v12, v4, v2, v4, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 604
    .line 605
    .line 606
    const v0, 0x415a8f5c    # 13.66f

    .line 607
    .line 608
    .line 609
    const/high16 v2, 0x41400000    # 12.0f

    .line 610
    .line 611
    const/high16 v4, 0x41880000    # 17.0f

    .line 612
    .line 613
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 614
    .line 615
    .line 616
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 617
    .line 618
    .line 619
    const/high16 v0, 0x41a80000    # 21.0f

    .line 620
    .line 621
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 622
    .line 623
    .line 624
    const/high16 v17, -0x40800000    # -1.0f

    .line 625
    .line 626
    const/high16 v18, -0x40800000    # -1.0f

    .line 627
    .line 628
    const v13, -0x40f33333    # -0.55f

    .line 629
    .line 630
    .line 631
    const/high16 v15, -0x40800000    # -1.0f

    .line 632
    .line 633
    const v16, -0x4119999a    # -0.45f

    .line 634
    .line 635
    .line 636
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 637
    .line 638
    .line 639
    const/high16 v17, 0x3f800000    # 1.0f

    .line 640
    .line 641
    const/4 v13, 0x0

    .line 642
    const v14, -0x40f33333    # -0.55f

    .line 643
    .line 644
    .line 645
    const v15, 0x3ee66666    # 0.45f

    .line 646
    .line 647
    .line 648
    const/high16 v16, -0x40800000    # -1.0f

    .line 649
    .line 650
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 651
    .line 652
    .line 653
    const v0, 0x3ee66666    # 0.45f

    .line 654
    .line 655
    .line 656
    const/high16 v2, 0x3f800000    # 1.0f

    .line 657
    .line 658
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 659
    .line 660
    .line 661
    const/high16 v17, 0x41400000    # 12.0f

    .line 662
    .line 663
    const/high16 v18, 0x41a80000    # 21.0f

    .line 664
    .line 665
    const/high16 v13, 0x41500000    # 13.0f

    .line 666
    .line 667
    const v14, 0x41a46666    # 20.55f

    .line 668
    .line 669
    .line 670
    const v15, 0x4148cccd    # 12.55f

    .line 671
    .line 672
    .line 673
    const/high16 v16, 0x41a80000    # 21.0f

    .line 674
    .line 675
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 676
    .line 677
    .line 678
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 679
    .line 680
    .line 681
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 682
    .line 683
    .line 684
    move-result-object v2

    .line 685
    const/16 v16, 0x3800

    .line 686
    .line 687
    const/16 v17, 0x0

    .line 688
    .line 689
    const/high16 v6, 0x3f800000    # 1.0f

    .line 690
    .line 691
    const/high16 v8, 0x3f800000    # 1.0f

    .line 692
    .line 693
    const/4 v7, 0x0

    .line 694
    const/high16 v9, 0x3f800000    # 1.0f

    .line 695
    .line 696
    const/high16 v12, 0x3f800000    # 1.0f

    .line 697
    .line 698
    const/4 v13, 0x0

    .line 699
    const/4 v14, 0x0

    .line 700
    const/4 v15, 0x0

    .line 701
    const-string v4, ""

    .line 702
    .line 703
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 704
    .line 705
    .line 706
    move-result-object v0

    .line 707
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 708
    .line 709
    .line 710
    move-result-object v0

    .line 711
    sput-object v0, Landroidx/compose/material/icons/outlined/RollerSkatingKt;->_rollerSkating:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 712
    .line 713
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 714
    .line 715
    .line 716
    return-object v0
.end method
