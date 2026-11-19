.class public final Landroidx/compose/material/icons/rounded/_24mpKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static __24mp:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final get_24mp(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/_24mpKt;->__24mp:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded._24mp"

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
    const/high16 v6, 0x40400000    # 3.0f

    .line 73
    .line 74
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v4, 0x40a00000    # 5.0f

    .line 78
    .line 79
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 80
    .line 81
    .line 82
    const/high16 v25, 0x40400000    # 3.0f

    .line 83
    .line 84
    const/high16 v26, 0x40a00000    # 5.0f

    .line 85
    .line 86
    const v21, 0x4079999a    # 3.9f

    .line 87
    .line 88
    .line 89
    const/high16 v22, 0x40400000    # 3.0f

    .line 90
    .line 91
    const/high16 v23, 0x40400000    # 3.0f

    .line 92
    .line 93
    const v24, 0x4079999a    # 3.9f

    .line 94
    .line 95
    .line 96
    move-object/from16 v20, v2

    .line 97
    .line 98
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 99
    .line 100
    .line 101
    const/high16 v4, 0x41600000    # 14.0f

    .line 102
    .line 103
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 104
    .line 105
    .line 106
    const/high16 v25, 0x40000000    # 2.0f

    .line 107
    .line 108
    const/high16 v26, 0x40000000    # 2.0f

    .line 109
    .line 110
    const/16 v21, 0x0

    .line 111
    .line 112
    const v22, 0x3f8ccccd    # 1.1f

    .line 113
    .line 114
    .line 115
    const v23, 0x3f666666    # 0.9f

    .line 116
    .line 117
    .line 118
    const/high16 v24, 0x40000000    # 2.0f

    .line 119
    .line 120
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 121
    .line 122
    .line 123
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 124
    .line 125
    .line 126
    const/high16 v26, -0x40000000    # -2.0f

    .line 127
    .line 128
    const v21, 0x3f8ccccd    # 1.1f

    .line 129
    .line 130
    .line 131
    const/16 v22, 0x0

    .line 132
    .line 133
    const/high16 v23, 0x40000000    # 2.0f

    .line 134
    .line 135
    const v24, -0x4099999a    # -0.9f

    .line 136
    .line 137
    .line 138
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 139
    .line 140
    .line 141
    const/high16 v4, 0x40a00000    # 5.0f

    .line 142
    .line 143
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 144
    .line 145
    .line 146
    const/high16 v25, 0x41980000    # 19.0f

    .line 147
    .line 148
    const/high16 v26, 0x40400000    # 3.0f

    .line 149
    .line 150
    const/high16 v21, 0x41a80000    # 21.0f

    .line 151
    .line 152
    const v22, 0x4079999a    # 3.9f

    .line 153
    .line 154
    .line 155
    const v23, 0x41a0cccd    # 20.1f

    .line 156
    .line 157
    .line 158
    const/high16 v24, 0x40400000    # 3.0f

    .line 159
    .line 160
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 161
    .line 162
    .line 163
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 164
    .line 165
    .line 166
    const/high16 v4, 0x40d00000    # 6.5f

    .line 167
    .line 168
    const/high16 v6, 0x41100000    # 9.0f

    .line 169
    .line 170
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 171
    .line 172
    .line 173
    const/high16 v25, 0x3f800000    # 1.0f

    .line 174
    .line 175
    const/high16 v26, -0x40800000    # -1.0f

    .line 176
    .line 177
    const/16 v21, 0x0

    .line 178
    .line 179
    const v22, -0x40f33333    # -0.55f

    .line 180
    .line 181
    .line 182
    const v23, 0x3ee66666    # 0.45f

    .line 183
    .line 184
    .line 185
    const/high16 v24, -0x40800000    # -1.0f

    .line 186
    .line 187
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 188
    .line 189
    .line 190
    const/high16 v4, 0x40000000    # 2.0f

    .line 191
    .line 192
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 193
    .line 194
    .line 195
    const/high16 v4, 0x40e00000    # 7.0f

    .line 196
    .line 197
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 198
    .line 199
    .line 200
    const/high16 v4, 0x40e80000    # 7.25f

    .line 201
    .line 202
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 203
    .line 204
    .line 205
    const/high16 v25, 0x40d00000    # 6.5f

    .line 206
    .line 207
    const/high16 v26, 0x40c80000    # 6.25f

    .line 208
    .line 209
    const v21, 0x40dae148    # 6.84f

    .line 210
    .line 211
    .line 212
    const/high16 v22, 0x40e00000    # 7.0f

    .line 213
    .line 214
    const/high16 v23, 0x40d00000    # 6.5f

    .line 215
    .line 216
    const v24, 0x40d51eb8    # 6.66f

    .line 217
    .line 218
    .line 219
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 220
    .line 221
    .line 222
    const v4, 0x40dae148    # 6.84f

    .line 223
    .line 224
    .line 225
    const/high16 v6, 0x40b00000    # 5.5f

    .line 226
    .line 227
    const/high16 v7, 0x40e80000    # 7.25f

    .line 228
    .line 229
    invoke-virtual {v2, v4, v6, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 230
    .line 231
    .line 232
    const/high16 v4, 0x41200000    # 10.0f

    .line 233
    .line 234
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 235
    .line 236
    .line 237
    const/high16 v25, 0x3f800000    # 1.0f

    .line 238
    .line 239
    const/high16 v26, 0x3f800000    # 1.0f

    .line 240
    .line 241
    const v21, 0x3f0ccccd    # 0.55f

    .line 242
    .line 243
    .line 244
    const/16 v22, 0x0

    .line 245
    .line 246
    const/high16 v23, 0x3f800000    # 1.0f

    .line 247
    .line 248
    const v24, 0x3ee66666    # 0.45f

    .line 249
    .line 250
    .line 251
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 252
    .line 253
    .line 254
    const/high16 v4, 0x41000000    # 8.0f

    .line 255
    .line 256
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 257
    .line 258
    .line 259
    const/high16 v25, -0x40800000    # -1.0f

    .line 260
    .line 261
    const/16 v21, 0x0

    .line 262
    .line 263
    const v22, 0x3f0ccccd    # 0.55f

    .line 264
    .line 265
    .line 266
    const v23, -0x4119999a    # -0.45f

    .line 267
    .line 268
    .line 269
    const/high16 v24, 0x3f800000    # 1.0f

    .line 270
    .line 271
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 272
    .line 273
    .line 274
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 275
    .line 276
    .line 277
    const/high16 v4, 0x3f800000    # 1.0f

    .line 278
    .line 279
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 280
    .line 281
    .line 282
    const/high16 v4, 0x40100000    # 2.25f

    .line 283
    .line 284
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 285
    .line 286
    .line 287
    const/high16 v25, 0x3f400000    # 0.75f

    .line 288
    .line 289
    const/high16 v26, 0x3f400000    # 0.75f

    .line 290
    .line 291
    const v21, 0x3ed1eb85    # 0.41f

    .line 292
    .line 293
    .line 294
    const/16 v22, 0x0

    .line 295
    .line 296
    const/high16 v23, 0x3f400000    # 0.75f

    .line 297
    .line 298
    const v24, 0x3eae147b    # 0.34f

    .line 299
    .line 300
    .line 301
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 302
    .line 303
    .line 304
    const v4, -0x4151eb85    # -0.34f

    .line 305
    .line 306
    .line 307
    const/high16 v6, -0x40c00000    # -0.75f

    .line 308
    .line 309
    const/high16 v7, 0x3f400000    # 0.75f

    .line 310
    .line 311
    invoke-virtual {v2, v4, v7, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 312
    .line 313
    .line 314
    const/high16 v4, 0x40f00000    # 7.5f

    .line 315
    .line 316
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 317
    .line 318
    .line 319
    const/high16 v25, -0x40800000    # -1.0f

    .line 320
    .line 321
    const/high16 v26, -0x40800000    # -1.0f

    .line 322
    .line 323
    const v21, -0x40f33333    # -0.55f

    .line 324
    .line 325
    .line 326
    const/high16 v23, -0x40800000    # -1.0f

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
    const/high16 v4, 0x41100000    # 9.0f

    .line 335
    .line 336
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 337
    .line 338
    .line 339
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 340
    .line 341
    .line 342
    const/high16 v4, 0x41480000    # 12.5f

    .line 343
    .line 344
    const/high16 v6, 0x418e0000    # 17.75f

    .line 345
    .line 346
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 347
    .line 348
    .line 349
    const/high16 v25, -0x40c00000    # -0.75f

    .line 350
    .line 351
    const/high16 v26, 0x3f400000    # 0.75f

    .line 352
    .line 353
    const/16 v21, 0x0

    .line 354
    .line 355
    const v22, 0x3ed1eb85    # 0.41f

    .line 356
    .line 357
    .line 358
    const v23, -0x4151eb85    # -0.34f

    .line 359
    .line 360
    .line 361
    const/high16 v24, 0x3f400000    # 0.75f

    .line 362
    .line 363
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 364
    .line 365
    .line 366
    const/high16 v4, 0x41300000    # 11.0f

    .line 367
    .line 368
    const v6, 0x419147ae    # 18.16f

    .line 369
    .line 370
    .line 371
    const/high16 v7, 0x418e0000    # 17.75f

    .line 372
    .line 373
    invoke-virtual {v2, v4, v6, v4, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 374
    .line 375
    .line 376
    const/high16 v4, 0x41600000    # 14.0f

    .line 377
    .line 378
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 379
    .line 380
    .line 381
    const/high16 v4, -0x40800000    # -1.0f

    .line 382
    .line 383
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 384
    .line 385
    .line 386
    const/high16 v4, 0x40100000    # 2.25f

    .line 387
    .line 388
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 389
    .line 390
    .line 391
    const/high16 v25, 0x41140000    # 9.25f

    .line 392
    .line 393
    const/high16 v26, 0x41880000    # 17.0f

    .line 394
    .line 395
    const/high16 v21, 0x41200000    # 10.0f

    .line 396
    .line 397
    const v22, 0x418547ae    # 16.66f

    .line 398
    .line 399
    .line 400
    const v23, 0x411a8f5c    # 9.66f

    .line 401
    .line 402
    .line 403
    const/high16 v24, 0x41880000    # 17.0f

    .line 404
    .line 405
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 406
    .line 407
    .line 408
    const v4, 0x418547ae    # 16.66f

    .line 409
    .line 410
    .line 411
    const/high16 v6, 0x41820000    # 16.25f

    .line 412
    .line 413
    const/high16 v7, 0x41080000    # 8.5f

    .line 414
    .line 415
    invoke-virtual {v2, v7, v4, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 416
    .line 417
    .line 418
    const/high16 v4, 0x41600000    # 14.0f

    .line 419
    .line 420
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 421
    .line 422
    .line 423
    const/high16 v4, -0x40800000    # -1.0f

    .line 424
    .line 425
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 426
    .line 427
    .line 428
    const/high16 v4, 0x40700000    # 3.75f

    .line 429
    .line 430
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 431
    .line 432
    .line 433
    const/high16 v25, -0x40c00000    # -0.75f

    .line 434
    .line 435
    const/high16 v26, 0x3f400000    # 0.75f

    .line 436
    .line 437
    const/16 v21, 0x0

    .line 438
    .line 439
    const v22, 0x3ed1eb85    # 0.41f

    .line 440
    .line 441
    .line 442
    const v23, -0x4151eb85    # -0.34f

    .line 443
    .line 444
    .line 445
    const/high16 v24, 0x3f400000    # 0.75f

    .line 446
    .line 447
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 448
    .line 449
    .line 450
    const/high16 v4, 0x40c00000    # 6.0f

    .line 451
    .line 452
    const v6, 0x419147ae    # 18.16f

    .line 453
    .line 454
    .line 455
    const/high16 v7, 0x418e0000    # 17.75f

    .line 456
    .line 457
    invoke-virtual {v2, v4, v6, v4, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 458
    .line 459
    .line 460
    const/high16 v4, 0x41580000    # 13.5f

    .line 461
    .line 462
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 463
    .line 464
    .line 465
    const/high16 v25, 0x3f800000    # 1.0f

    .line 466
    .line 467
    const/high16 v26, -0x40800000    # -1.0f

    .line 468
    .line 469
    const v22, -0x40f33333    # -0.55f

    .line 470
    .line 471
    .line 472
    const v23, 0x3ee66666    # 0.45f

    .line 473
    .line 474
    .line 475
    const/high16 v24, -0x40800000    # -1.0f

    .line 476
    .line 477
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 478
    .line 479
    .line 480
    const/high16 v4, 0x40900000    # 4.5f

    .line 481
    .line 482
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 483
    .line 484
    .line 485
    const/high16 v26, 0x3f800000    # 1.0f

    .line 486
    .line 487
    const v21, 0x3f0ccccd    # 0.55f

    .line 488
    .line 489
    .line 490
    const/16 v22, 0x0

    .line 491
    .line 492
    const/high16 v23, 0x3f800000    # 1.0f

    .line 493
    .line 494
    const v24, 0x3ee66666    # 0.45f

    .line 495
    .line 496
    .line 497
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 498
    .line 499
    .line 500
    const/high16 v4, 0x418e0000    # 17.75f

    .line 501
    .line 502
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 503
    .line 504
    .line 505
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 506
    .line 507
    .line 508
    const/high16 v4, 0x41900000    # 18.0f

    .line 509
    .line 510
    const/high16 v6, 0x41800000    # 16.0f

    .line 511
    .line 512
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 513
    .line 514
    .line 515
    const/high16 v25, -0x40800000    # -1.0f

    .line 516
    .line 517
    const/16 v21, 0x0

    .line 518
    .line 519
    const v22, 0x3f0ccccd    # 0.55f

    .line 520
    .line 521
    .line 522
    const v23, -0x4119999a    # -0.45f

    .line 523
    .line 524
    .line 525
    const/high16 v24, 0x3f800000    # 1.0f

    .line 526
    .line 527
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 528
    .line 529
    .line 530
    const/high16 v4, -0x40000000    # -2.0f

    .line 531
    .line 532
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 533
    .line 534
    .line 535
    const/high16 v4, 0x3f400000    # 0.75f

    .line 536
    .line 537
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 538
    .line 539
    .line 540
    const/high16 v25, -0x40c00000    # -0.75f

    .line 541
    .line 542
    const/high16 v26, 0x3f400000    # 0.75f

    .line 543
    .line 544
    const v22, 0x3ed1eb85    # 0.41f

    .line 545
    .line 546
    .line 547
    const v23, -0x4151eb85    # -0.34f

    .line 548
    .line 549
    .line 550
    const/high16 v24, 0x3f400000    # 0.75f

    .line 551
    .line 552
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 553
    .line 554
    .line 555
    const v4, -0x4151eb85    # -0.34f

    .line 556
    .line 557
    .line 558
    const/high16 v6, -0x40c00000    # -0.75f

    .line 559
    .line 560
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 561
    .line 562
    .line 563
    const/high16 v4, 0x41580000    # 13.5f

    .line 564
    .line 565
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 566
    .line 567
    .line 568
    const/high16 v25, 0x3f800000    # 1.0f

    .line 569
    .line 570
    const/high16 v26, -0x40800000    # -1.0f

    .line 571
    .line 572
    const v22, -0x40f33333    # -0.55f

    .line 573
    .line 574
    .line 575
    const v23, 0x3ee66666    # 0.45f

    .line 576
    .line 577
    .line 578
    const/high16 v24, -0x40800000    # -1.0f

    .line 579
    .line 580
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 581
    .line 582
    .line 583
    const/high16 v4, 0x41880000    # 17.0f

    .line 584
    .line 585
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 586
    .line 587
    .line 588
    const/high16 v26, 0x3f800000    # 1.0f

    .line 589
    .line 590
    const v21, 0x3f0ccccd    # 0.55f

    .line 591
    .line 592
    .line 593
    const/16 v22, 0x0

    .line 594
    .line 595
    const/high16 v23, 0x3f800000    # 1.0f

    .line 596
    .line 597
    const v24, 0x3ee66666    # 0.45f

    .line 598
    .line 599
    .line 600
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 601
    .line 602
    .line 603
    const/high16 v4, 0x41800000    # 16.0f

    .line 604
    .line 605
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 606
    .line 607
    .line 608
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 609
    .line 610
    .line 611
    const/high16 v4, 0x41200000    # 10.0f

    .line 612
    .line 613
    const/high16 v6, 0x418e0000    # 17.75f

    .line 614
    .line 615
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 616
    .line 617
    .line 618
    const/high16 v4, 0x418c0000    # 17.5f

    .line 619
    .line 620
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 621
    .line 622
    .line 623
    const/high16 v4, 0x3f400000    # 0.75f

    .line 624
    .line 625
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 626
    .line 627
    .line 628
    const/high16 v25, -0x40c00000    # -0.75f

    .line 629
    .line 630
    const/high16 v26, 0x3f400000    # 0.75f

    .line 631
    .line 632
    const/16 v21, 0x0

    .line 633
    .line 634
    const v22, 0x3ed1eb85    # 0.41f

    .line 635
    .line 636
    .line 637
    const v23, -0x4151eb85    # -0.34f

    .line 638
    .line 639
    .line 640
    const/high16 v24, 0x3f400000    # 0.75f

    .line 641
    .line 642
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 643
    .line 644
    .line 645
    const v4, 0x41328f5c    # 11.16f

    .line 646
    .line 647
    .line 648
    const/high16 v6, 0x412c0000    # 10.75f

    .line 649
    .line 650
    const/high16 v7, 0x41800000    # 16.0f

    .line 651
    .line 652
    invoke-virtual {v2, v7, v4, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 653
    .line 654
    .line 655
    const/high16 v4, 0x41200000    # 10.0f

    .line 656
    .line 657
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 658
    .line 659
    .line 660
    const/high16 v4, -0x40000000    # -2.0f

    .line 661
    .line 662
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 663
    .line 664
    .line 665
    const/high16 v25, -0x40800000    # -1.0f

    .line 666
    .line 667
    const/high16 v26, -0x40800000    # -1.0f

    .line 668
    .line 669
    const v21, -0x40f33333    # -0.55f

    .line 670
    .line 671
    .line 672
    const/16 v22, 0x0

    .line 673
    .line 674
    const/high16 v23, -0x40800000    # -1.0f

    .line 675
    .line 676
    const v24, -0x4119999a    # -0.45f

    .line 677
    .line 678
    .line 679
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 680
    .line 681
    .line 682
    const/high16 v4, 0x40c80000    # 6.25f

    .line 683
    .line 684
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 685
    .line 686
    .line 687
    const/high16 v25, 0x3f400000    # 0.75f

    .line 688
    .line 689
    const/high16 v26, -0x40c00000    # -0.75f

    .line 690
    .line 691
    const/16 v21, 0x0

    .line 692
    .line 693
    const v22, -0x412e147b    # -0.41f

    .line 694
    .line 695
    .line 696
    const v23, 0x3eae147b    # 0.34f

    .line 697
    .line 698
    .line 699
    const/high16 v24, -0x40c00000    # -0.75f

    .line 700
    .line 701
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 702
    .line 703
    .line 704
    const v4, 0x3eae147b    # 0.34f

    .line 705
    .line 706
    .line 707
    const/high16 v6, 0x3f400000    # 0.75f

    .line 708
    .line 709
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 710
    .line 711
    .line 712
    const/high16 v4, 0x41080000    # 8.5f

    .line 713
    .line 714
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 715
    .line 716
    .line 717
    const/high16 v4, 0x41800000    # 16.0f

    .line 718
    .line 719
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 720
    .line 721
    .line 722
    const/high16 v4, 0x40c80000    # 6.25f

    .line 723
    .line 724
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 725
    .line 726
    .line 727
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 728
    .line 729
    .line 730
    const v4, 0x3eae147b    # 0.34f

    .line 731
    .line 732
    .line 733
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 734
    .line 735
    .line 736
    const/high16 v4, 0x41080000    # 8.5f

    .line 737
    .line 738
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 739
    .line 740
    .line 741
    const/high16 v4, 0x3e800000    # 0.25f

    .line 742
    .line 743
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 744
    .line 745
    .line 746
    const/high16 v26, 0x3f400000    # 0.75f

    .line 747
    .line 748
    const v21, 0x3ed1eb85    # 0.41f

    .line 749
    .line 750
    .line 751
    const/16 v22, 0x0

    .line 752
    .line 753
    const/high16 v23, 0x3f400000    # 0.75f

    .line 754
    .line 755
    const v24, 0x3eae147b    # 0.34f

    .line 756
    .line 757
    .line 758
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 759
    .line 760
    .line 761
    const v4, 0x419147ae    # 18.16f

    .line 762
    .line 763
    .line 764
    const/high16 v6, 0x41200000    # 10.0f

    .line 765
    .line 766
    const/high16 v7, 0x418e0000    # 17.75f

    .line 767
    .line 768
    invoke-virtual {v2, v4, v6, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 769
    .line 770
    .line 771
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 772
    .line 773
    .line 774
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 775
    .line 776
    .line 777
    move-result-object v2

    .line 778
    const/16 v16, 0x3800

    .line 779
    .line 780
    const/16 v17, 0x0

    .line 781
    .line 782
    const/high16 v6, 0x3f800000    # 1.0f

    .line 783
    .line 784
    const/high16 v8, 0x3f800000    # 1.0f

    .line 785
    .line 786
    const/4 v7, 0x0

    .line 787
    const/high16 v9, 0x3f800000    # 1.0f

    .line 788
    .line 789
    const/high16 v12, 0x3f800000    # 1.0f

    .line 790
    .line 791
    const/4 v13, 0x0

    .line 792
    const/4 v14, 0x0

    .line 793
    const/4 v15, 0x0

    .line 794
    const-string v4, ""

    .line 795
    .line 796
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 797
    .line 798
    .line 799
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 800
    .line 801
    .line 802
    move-result v3

    .line 803
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 804
    .line 805
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 806
    .line 807
    .line 808
    move-result-wide v6

    .line 809
    const/4 v0, 0x0

    .line 810
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 811
    .line 812
    .line 813
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 814
    .line 815
    .line 816
    move-result v10

    .line 817
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 818
    .line 819
    .line 820
    move-result v11

    .line 821
    new-instance v0, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 822
    .line 823
    invoke-direct {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 824
    .line 825
    .line 826
    const/high16 v2, 0x41700000    # 15.0f

    .line 827
    .line 828
    const/high16 v4, 0x41600000    # 14.0f

    .line 829
    .line 830
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 831
    .line 832
    .line 833
    const/high16 v2, 0x3fc00000    # 1.5f

    .line 834
    .line 835
    invoke-virtual {v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 836
    .line 837
    .line 838
    invoke-virtual {v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 839
    .line 840
    .line 841
    const/high16 v2, -0x40400000    # -1.5f

    .line 842
    .line 843
    invoke-virtual {v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 844
    .line 845
    .line 846
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 847
    .line 848
    .line 849
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 850
    .line 851
    .line 852
    move-result-object v2

    .line 853
    const/high16 v6, 0x3f800000    # 1.0f

    .line 854
    .line 855
    const/4 v7, 0x0

    .line 856
    const-string v4, ""

    .line 857
    .line 858
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 859
    .line 860
    .line 861
    move-result-object v0

    .line 862
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 863
    .line 864
    .line 865
    move-result-object v0

    .line 866
    sput-object v0, Landroidx/compose/material/icons/rounded/_24mpKt;->__24mp:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 867
    .line 868
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 869
    .line 870
    .line 871
    return-object v0
.end method
