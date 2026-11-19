.class public final Landroidx/compose/material/icons/rounded/FireHydrantAltKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _fireHydrantAlt:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getFireHydrantAlt(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/FireHydrantAltKt;->_fireHydrantAlt:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.FireHydrantAlt"

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
    const/4 v2, 0x0

    .line 50
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 51
    .line 52
    .line 53
    sget-object v18, Landroidx/compose/ui/graphics/StrokeCap;->Companion:Landroidx/compose/ui/graphics/StrokeCap$Companion;

    .line 54
    .line 55
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 56
    .line 57
    .line 58
    move-result v10

    .line 59
    sget-object v19, Landroidx/compose/ui/graphics/StrokeJoin;->Companion:Landroidx/compose/ui/graphics/StrokeJoin$Companion;

    .line 60
    .line 61
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 62
    .line 63
    .line 64
    move-result v11

    .line 65
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 66
    .line 67
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 68
    .line 69
    .line 70
    const/high16 v4, 0x41980000    # 19.0f

    .line 71
    .line 72
    const/high16 v6, 0x41300000    # 11.0f

    .line 73
    .line 74
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v4, -0x40800000    # -1.0f

    .line 78
    .line 79
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 80
    .line 81
    .line 82
    const/high16 v4, 0x41000000    # 8.0f

    .line 83
    .line 84
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 85
    .line 86
    .line 87
    const/high16 v4, 0x3f800000    # 1.0f

    .line 88
    .line 89
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 90
    .line 91
    .line 92
    const/high16 v25, 0x3f800000    # 1.0f

    .line 93
    .line 94
    const/high16 v26, -0x40800000    # -1.0f

    .line 95
    .line 96
    const v21, 0x3f0ccccd    # 0.55f

    .line 97
    .line 98
    .line 99
    const/16 v22, 0x0

    .line 100
    .line 101
    const/high16 v23, 0x3f800000    # 1.0f

    .line 102
    .line 103
    const v24, -0x4119999a    # -0.45f

    .line 104
    .line 105
    .line 106
    move-object/from16 v20, v2

    .line 107
    .line 108
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 109
    .line 110
    .line 111
    const/4 v4, 0x0

    .line 112
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 113
    .line 114
    .line 115
    const/high16 v25, -0x40800000    # -1.0f

    .line 116
    .line 117
    const/16 v21, 0x0

    .line 118
    .line 119
    const v22, -0x40f33333    # -0.55f

    .line 120
    .line 121
    .line 122
    const v23, -0x4119999a    # -0.45f

    .line 123
    .line 124
    .line 125
    const/high16 v24, -0x40800000    # -1.0f

    .line 126
    .line 127
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 128
    .line 129
    .line 130
    const v4, -0x40533333    # -1.35f

    .line 131
    .line 132
    .line 133
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 134
    .line 135
    .line 136
    const/high16 v25, 0x41400000    # 12.0f

    .line 137
    .line 138
    const/high16 v26, 0x40000000    # 2.0f

    .line 139
    .line 140
    const v21, 0x4186a3d7    # 16.83f

    .line 141
    .line 142
    .line 143
    const v22, 0x406ae148    # 3.67f

    .line 144
    .line 145
    .line 146
    const v23, 0x4169c28f    # 14.61f

    .line 147
    .line 148
    .line 149
    const/high16 v24, 0x40000000    # 2.0f

    .line 150
    .line 151
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 152
    .line 153
    .line 154
    const v4, 0x40cb3333    # 6.35f

    .line 155
    .line 156
    .line 157
    const/high16 v6, 0x40c00000    # 6.0f

    .line 158
    .line 159
    const v7, 0x40e570a4    # 7.17f

    .line 160
    .line 161
    .line 162
    const v8, 0x406ae148    # 3.67f

    .line 163
    .line 164
    .line 165
    invoke-virtual {v2, v7, v8, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 166
    .line 167
    .line 168
    const/high16 v4, 0x40a00000    # 5.0f

    .line 169
    .line 170
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 171
    .line 172
    .line 173
    const/high16 v25, 0x40800000    # 4.0f

    .line 174
    .line 175
    const/high16 v26, 0x40e00000    # 7.0f

    .line 176
    .line 177
    const v21, 0x408e6666    # 4.45f

    .line 178
    .line 179
    .line 180
    const/high16 v22, 0x40c00000    # 6.0f

    .line 181
    .line 182
    const/high16 v23, 0x40800000    # 4.0f

    .line 183
    .line 184
    const v24, 0x40ce6666    # 6.45f

    .line 185
    .line 186
    .line 187
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 188
    .line 189
    .line 190
    const/4 v4, 0x0

    .line 191
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 192
    .line 193
    .line 194
    const/high16 v25, 0x3f800000    # 1.0f

    .line 195
    .line 196
    const/high16 v26, 0x3f800000    # 1.0f

    .line 197
    .line 198
    const/16 v21, 0x0

    .line 199
    .line 200
    const v22, 0x3f0ccccd    # 0.55f

    .line 201
    .line 202
    .line 203
    const v23, 0x3ee66666    # 0.45f

    .line 204
    .line 205
    .line 206
    const/high16 v24, 0x3f800000    # 1.0f

    .line 207
    .line 208
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 209
    .line 210
    .line 211
    const/high16 v4, 0x3f800000    # 1.0f

    .line 212
    .line 213
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 214
    .line 215
    .line 216
    const/high16 v4, 0x40400000    # 3.0f

    .line 217
    .line 218
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 219
    .line 220
    .line 221
    const/high16 v4, 0x40a00000    # 5.0f

    .line 222
    .line 223
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 224
    .line 225
    .line 226
    const/high16 v25, -0x40000000    # -2.0f

    .line 227
    .line 228
    const/high16 v26, 0x40000000    # 2.0f

    .line 229
    .line 230
    const v21, -0x40733333    # -1.1f

    .line 231
    .line 232
    .line 233
    const/16 v22, 0x0

    .line 234
    .line 235
    const/high16 v23, -0x40000000    # -2.0f

    .line 236
    .line 237
    const v24, 0x3f666666    # 0.9f

    .line 238
    .line 239
    .line 240
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 241
    .line 242
    .line 243
    const/high16 v4, 0x40000000    # 2.0f

    .line 244
    .line 245
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 246
    .line 247
    .line 248
    const/high16 v25, 0x40000000    # 2.0f

    .line 249
    .line 250
    const/16 v21, 0x0

    .line 251
    .line 252
    const v22, 0x3f8ccccd    # 1.1f

    .line 253
    .line 254
    .line 255
    const v23, 0x3f666666    # 0.9f

    .line 256
    .line 257
    .line 258
    const/high16 v24, 0x40000000    # 2.0f

    .line 259
    .line 260
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 261
    .line 262
    .line 263
    const/high16 v4, 0x3f800000    # 1.0f

    .line 264
    .line 265
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 266
    .line 267
    .line 268
    const/high16 v4, 0x40400000    # 3.0f

    .line 269
    .line 270
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 271
    .line 272
    .line 273
    const/high16 v4, 0x40a00000    # 5.0f

    .line 274
    .line 275
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 276
    .line 277
    .line 278
    const/high16 v25, -0x40800000    # -1.0f

    .line 279
    .line 280
    const/high16 v26, 0x3f800000    # 1.0f

    .line 281
    .line 282
    const v21, -0x40f33333    # -0.55f

    .line 283
    .line 284
    .line 285
    const/16 v22, 0x0

    .line 286
    .line 287
    const/high16 v23, -0x40800000    # -1.0f

    .line 288
    .line 289
    const v24, 0x3ee66666    # 0.45f

    .line 290
    .line 291
    .line 292
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 293
    .line 294
    .line 295
    const/4 v4, 0x0

    .line 296
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 297
    .line 298
    .line 299
    const/high16 v25, 0x3f800000    # 1.0f

    .line 300
    .line 301
    const/16 v21, 0x0

    .line 302
    .line 303
    const v22, 0x3f0ccccd    # 0.55f

    .line 304
    .line 305
    .line 306
    const v23, 0x3ee66666    # 0.45f

    .line 307
    .line 308
    .line 309
    const/high16 v24, 0x3f800000    # 1.0f

    .line 310
    .line 311
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 312
    .line 313
    .line 314
    const/high16 v4, 0x41600000    # 14.0f

    .line 315
    .line 316
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 317
    .line 318
    .line 319
    const/high16 v26, -0x40800000    # -1.0f

    .line 320
    .line 321
    const v21, 0x3f0ccccd    # 0.55f

    .line 322
    .line 323
    .line 324
    const/16 v22, 0x0

    .line 325
    .line 326
    const/high16 v23, 0x3f800000    # 1.0f

    .line 327
    .line 328
    const v24, -0x4119999a    # -0.45f

    .line 329
    .line 330
    .line 331
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 332
    .line 333
    .line 334
    const/4 v4, 0x0

    .line 335
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 336
    .line 337
    .line 338
    const/high16 v25, -0x40800000    # -1.0f

    .line 339
    .line 340
    const/16 v21, 0x0

    .line 341
    .line 342
    const v22, -0x40f33333    # -0.55f

    .line 343
    .line 344
    .line 345
    const v23, -0x4119999a    # -0.45f

    .line 346
    .line 347
    .line 348
    const/high16 v24, -0x40800000    # -1.0f

    .line 349
    .line 350
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 351
    .line 352
    .line 353
    const/high16 v4, -0x40800000    # -1.0f

    .line 354
    .line 355
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 356
    .line 357
    .line 358
    const/high16 v4, -0x3fc00000    # -3.0f

    .line 359
    .line 360
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 361
    .line 362
    .line 363
    const/high16 v4, 0x3f800000    # 1.0f

    .line 364
    .line 365
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 366
    .line 367
    .line 368
    const/high16 v25, 0x40000000    # 2.0f

    .line 369
    .line 370
    const/high16 v26, -0x40000000    # -2.0f

    .line 371
    .line 372
    const v21, 0x3f8ccccd    # 1.1f

    .line 373
    .line 374
    .line 375
    const/16 v22, 0x0

    .line 376
    .line 377
    const/high16 v23, 0x40000000    # 2.0f

    .line 378
    .line 379
    const v24, -0x4099999a    # -0.9f

    .line 380
    .line 381
    .line 382
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 383
    .line 384
    .line 385
    const/high16 v4, -0x40000000    # -2.0f

    .line 386
    .line 387
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 388
    .line 389
    .line 390
    const/high16 v25, 0x41980000    # 19.0f

    .line 391
    .line 392
    const/high16 v26, 0x41300000    # 11.0f

    .line 393
    .line 394
    const/high16 v21, 0x41a80000    # 21.0f

    .line 395
    .line 396
    const v22, 0x413e6666    # 11.9f

    .line 397
    .line 398
    .line 399
    const v23, 0x41a0cccd    # 20.1f

    .line 400
    .line 401
    .line 402
    const/high16 v24, 0x41300000    # 11.0f

    .line 403
    .line 404
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 405
    .line 406
    .line 407
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 408
    .line 409
    .line 410
    const/high16 v4, 0x418c0000    # 17.5f

    .line 411
    .line 412
    const/high16 v6, 0x41400000    # 12.0f

    .line 413
    .line 414
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 415
    .line 416
    .line 417
    const/high16 v25, -0x3fa00000    # -3.5f

    .line 418
    .line 419
    const/high16 v26, -0x3fa00000    # -3.5f

    .line 420
    .line 421
    const v21, -0x4008f5c3    # -1.93f

    .line 422
    .line 423
    .line 424
    const/16 v22, 0x0

    .line 425
    .line 426
    const/high16 v23, -0x3fa00000    # -3.5f

    .line 427
    .line 428
    const v24, -0x40370a3d    # -1.57f

    .line 429
    .line 430
    .line 431
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 432
    .line 433
    .line 434
    const/high16 v4, -0x3fa00000    # -3.5f

    .line 435
    .line 436
    const v6, 0x3fc8f5c3    # 1.57f

    .line 437
    .line 438
    .line 439
    const/high16 v7, 0x40600000    # 3.5f

    .line 440
    .line 441
    invoke-virtual {v2, v6, v4, v7, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 442
    .line 443
    .line 444
    const v4, 0x3fc8f5c3    # 1.57f

    .line 445
    .line 446
    .line 447
    const/high16 v6, 0x40600000    # 3.5f

    .line 448
    .line 449
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 450
    .line 451
    .line 452
    const v4, 0x415ee148    # 13.93f

    .line 453
    .line 454
    .line 455
    const/high16 v6, 0x418c0000    # 17.5f

    .line 456
    .line 457
    const/high16 v7, 0x41400000    # 12.0f

    .line 458
    .line 459
    invoke-virtual {v2, v4, v6, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 460
    .line 461
    .line 462
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 463
    .line 464
    .line 465
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 466
    .line 467
    .line 468
    move-result-object v2

    .line 469
    const/16 v16, 0x3800

    .line 470
    .line 471
    const/16 v17, 0x0

    .line 472
    .line 473
    const/high16 v6, 0x3f800000    # 1.0f

    .line 474
    .line 475
    const/high16 v8, 0x3f800000    # 1.0f

    .line 476
    .line 477
    const/4 v7, 0x0

    .line 478
    const/high16 v9, 0x3f800000    # 1.0f

    .line 479
    .line 480
    const/high16 v12, 0x3f800000    # 1.0f

    .line 481
    .line 482
    const/4 v13, 0x0

    .line 483
    const/4 v14, 0x0

    .line 484
    const/4 v15, 0x0

    .line 485
    const-string v4, ""

    .line 486
    .line 487
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 488
    .line 489
    .line 490
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 491
    .line 492
    .line 493
    move-result v3

    .line 494
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 495
    .line 496
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 497
    .line 498
    .line 499
    move-result-wide v6

    .line 500
    const/4 v0, 0x0

    .line 501
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 502
    .line 503
    .line 504
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 505
    .line 506
    .line 507
    move-result v10

    .line 508
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 509
    .line 510
    .line 511
    move-result v11

    .line 512
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 513
    .line 514
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 515
    .line 516
    .line 517
    const/high16 v0, 0x41600000    # 14.0f

    .line 518
    .line 519
    const/high16 v2, 0x41400000    # 12.0f

    .line 520
    .line 521
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 522
    .line 523
    .line 524
    const/high16 v0, -0x40400000    # -1.5f

    .line 525
    .line 526
    const/4 v2, 0x0

    .line 527
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 528
    .line 529
    .line 530
    const/high16 v18, 0x40400000    # 3.0f

    .line 531
    .line 532
    const/16 v19, 0x0

    .line 533
    .line 534
    const/high16 v13, 0x3fc00000    # 1.5f

    .line 535
    .line 536
    const/high16 v14, 0x3fc00000    # 1.5f

    .line 537
    .line 538
    const/16 v16, 0x1

    .line 539
    .line 540
    const/16 v17, 0x1

    .line 541
    .line 542
    invoke-virtual/range {v12 .. v19}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 543
    .line 544
    .line 545
    const/high16 v18, -0x3fc00000    # -3.0f

    .line 546
    .line 547
    invoke-virtual/range {v12 .. v19}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 548
    .line 549
    .line 550
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 551
    .line 552
    .line 553
    move-result-object v2

    .line 554
    const/16 v16, 0x3800

    .line 555
    .line 556
    const/16 v17, 0x0

    .line 557
    .line 558
    const/high16 v6, 0x3f800000    # 1.0f

    .line 559
    .line 560
    const/4 v7, 0x0

    .line 561
    const/high16 v12, 0x3f800000    # 1.0f

    .line 562
    .line 563
    const/4 v13, 0x0

    .line 564
    const/4 v14, 0x0

    .line 565
    const-string v4, ""

    .line 566
    .line 567
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 568
    .line 569
    .line 570
    move-result-object v0

    .line 571
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 572
    .line 573
    .line 574
    move-result-object v0

    .line 575
    sput-object v0, Landroidx/compose/material/icons/rounded/FireHydrantAltKt;->_fireHydrantAlt:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 576
    .line 577
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 578
    .line 579
    .line 580
    return-object v0
.end method
