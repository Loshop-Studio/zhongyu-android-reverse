.class public final Landroidx/compose/material/icons/outlined/InterestsKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _interests:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getInterests(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/outlined/InterestsKt;->_interests:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Outlined.Interests"

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
    const v0, 0x40e0a3d7    # 7.02f

    .line 71
    .line 72
    .line 73
    const/high16 v2, 0x41500000    # 13.0f

    .line 74
    .line 75
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    const/high16 v17, -0x3f800000    # -4.0f

    .line 79
    .line 80
    const/high16 v18, 0x40800000    # 4.0f

    .line 81
    .line 82
    const v13, -0x3ff28f5c    # -2.21f

    .line 83
    .line 84
    .line 85
    const/4 v14, 0x0

    .line 86
    const/high16 v15, -0x3f800000    # -4.0f

    .line 87
    .line 88
    const v16, 0x3fe51eb8    # 1.79f

    .line 89
    .line 90
    .line 91
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 92
    .line 93
    .line 94
    const v0, 0x3fe51eb8    # 1.79f

    .line 95
    .line 96
    .line 97
    const/high16 v2, 0x40800000    # 4.0f

    .line 98
    .line 99
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 100
    .line 101
    .line 102
    const v0, -0x401ae148    # -1.79f

    .line 103
    .line 104
    .line 105
    const/high16 v2, -0x3f800000    # -4.0f

    .line 106
    .line 107
    const/high16 v4, 0x40800000    # 4.0f

    .line 108
    .line 109
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 110
    .line 111
    .line 112
    const v0, 0x4113ae14    # 9.23f

    .line 113
    .line 114
    .line 115
    const v2, 0x40e0a3d7    # 7.02f

    .line 116
    .line 117
    .line 118
    const/high16 v4, 0x41500000    # 13.0f

    .line 119
    .line 120
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 121
    .line 122
    .line 123
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 124
    .line 125
    .line 126
    const v0, 0x40e0a3d7    # 7.02f

    .line 127
    .line 128
    .line 129
    const/high16 v2, 0x41980000    # 19.0f

    .line 130
    .line 131
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 132
    .line 133
    .line 134
    const/high16 v17, -0x40000000    # -2.0f

    .line 135
    .line 136
    const/high16 v18, -0x40000000    # -2.0f

    .line 137
    .line 138
    const v13, -0x40733333    # -1.1f

    .line 139
    .line 140
    .line 141
    const/high16 v15, -0x40000000    # -2.0f

    .line 142
    .line 143
    const v16, -0x4099999a    # -0.9f

    .line 144
    .line 145
    .line 146
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 147
    .line 148
    .line 149
    const/high16 v0, -0x40000000    # -2.0f

    .line 150
    .line 151
    const v2, 0x3f666666    # 0.9f

    .line 152
    .line 153
    .line 154
    const/high16 v4, 0x40000000    # 2.0f

    .line 155
    .line 156
    invoke-virtual {v12, v2, v0, v4, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 157
    .line 158
    .line 159
    const v0, 0x3f666666    # 0.9f

    .line 160
    .line 161
    .line 162
    const/high16 v2, 0x40000000    # 2.0f

    .line 163
    .line 164
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 165
    .line 166
    .line 167
    const v0, 0x4101eb85    # 8.12f

    .line 168
    .line 169
    .line 170
    const v2, 0x40e0a3d7    # 7.02f

    .line 171
    .line 172
    .line 173
    const/high16 v4, 0x41980000    # 19.0f

    .line 174
    .line 175
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 176
    .line 177
    .line 178
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 179
    .line 180
    .line 181
    const/high16 v0, 0x41500000    # 13.0f

    .line 182
    .line 183
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 184
    .line 185
    .line 186
    const/high16 v0, 0x41000000    # 8.0f

    .line 187
    .line 188
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 189
    .line 190
    .line 191
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 192
    .line 193
    .line 194
    const/high16 v0, -0x3f000000    # -8.0f

    .line 195
    .line 196
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 197
    .line 198
    .line 199
    const/high16 v0, 0x41500000    # 13.0f

    .line 200
    .line 201
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 202
    .line 203
    .line 204
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 205
    .line 206
    .line 207
    const/high16 v0, 0x41980000    # 19.0f

    .line 208
    .line 209
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 210
    .line 211
    .line 212
    const/high16 v0, -0x3f800000    # -4.0f

    .line 213
    .line 214
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 215
    .line 216
    .line 217
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 218
    .line 219
    .line 220
    const/high16 v0, 0x40800000    # 4.0f

    .line 221
    .line 222
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 223
    .line 224
    .line 225
    const/high16 v0, 0x41980000    # 19.0f

    .line 226
    .line 227
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 228
    .line 229
    .line 230
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 231
    .line 232
    .line 233
    const/high16 v0, 0x40e00000    # 7.0f

    .line 234
    .line 235
    const/high16 v2, 0x40000000    # 2.0f

    .line 236
    .line 237
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 238
    .line 239
    .line 240
    const/high16 v0, -0x3f600000    # -5.0f

    .line 241
    .line 242
    const/high16 v2, 0x41100000    # 9.0f

    .line 243
    .line 244
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 245
    .line 246
    .line 247
    const/high16 v0, 0x41200000    # 10.0f

    .line 248
    .line 249
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 250
    .line 251
    .line 252
    const/high16 v0, 0x40e00000    # 7.0f

    .line 253
    .line 254
    const/high16 v2, 0x40000000    # 2.0f

    .line 255
    .line 256
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 257
    .line 258
    .line 259
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 260
    .line 261
    .line 262
    const v0, 0x40c3d70a    # 6.12f

    .line 263
    .line 264
    .line 265
    const/high16 v2, 0x40e00000    # 7.0f

    .line 266
    .line 267
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 268
    .line 269
    .line 270
    const v0, 0x4109999a    # 8.6f

    .line 271
    .line 272
    .line 273
    const/high16 v2, 0x41100000    # 9.0f

    .line 274
    .line 275
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 276
    .line 277
    .line 278
    const v0, 0x40accccd    # 5.4f

    .line 279
    .line 280
    .line 281
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 282
    .line 283
    .line 284
    const v0, 0x40c3d70a    # 6.12f

    .line 285
    .line 286
    .line 287
    const/high16 v2, 0x40e00000    # 7.0f

    .line 288
    .line 289
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 290
    .line 291
    .line 292
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 293
    .line 294
    .line 295
    const/high16 v0, 0x419a0000    # 19.25f

    .line 296
    .line 297
    const/high16 v2, 0x40200000    # 2.5f

    .line 298
    .line 299
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 300
    .line 301
    .line 302
    const/high16 v17, -0x3ff00000    # -2.25f

    .line 303
    .line 304
    const v18, 0x3f95c28f    # 1.17f

    .line 305
    .line 306
    .line 307
    const v13, -0x407851ec    # -1.06f

    .line 308
    .line 309
    .line 310
    const v15, -0x401851ec    # -1.81f

    .line 311
    .line 312
    .line 313
    const v16, 0x3f0f5c29    # 0.56f

    .line 314
    .line 315
    .line 316
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 317
    .line 318
    .line 319
    const v18, -0x406a3d71    # -1.17f

    .line 320
    .line 321
    .line 322
    const v13, -0x411eb852    # -0.44f

    .line 323
    .line 324
    .line 325
    const v14, -0x40e3d70a    # -0.61f

    .line 326
    .line 327
    .line 328
    const v15, -0x4067ae14    # -1.19f

    .line 329
    .line 330
    .line 331
    const v16, -0x406a3d71    # -1.17f

    .line 332
    .line 333
    .line 334
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 335
    .line 336
    .line 337
    const/high16 v17, 0x41400000    # 12.0f

    .line 338
    .line 339
    const/high16 v18, 0x40a80000    # 5.25f

    .line 340
    .line 341
    const v13, 0x41530a3d    # 13.19f

    .line 342
    .line 343
    .line 344
    const/high16 v14, 0x40200000    # 2.5f

    .line 345
    .line 346
    const/high16 v15, 0x41400000    # 12.0f

    .line 347
    .line 348
    const v16, 0x4071eb85    # 3.78f

    .line 349
    .line 350
    .line 351
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 352
    .line 353
    .line 354
    const/high16 v17, 0x40a00000    # 5.0f

    .line 355
    .line 356
    const/high16 v18, 0x40b80000    # 5.75f

    .line 357
    .line 358
    const/4 v13, 0x0

    .line 359
    const/high16 v14, 0x40000000    # 2.0f

    .line 360
    .line 361
    const v15, 0x401ae148    # 2.42f

    .line 362
    .line 363
    .line 364
    const v16, 0x405ae148    # 3.42f

    .line 365
    .line 366
    .line 367
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 368
    .line 369
    .line 370
    const/high16 v18, -0x3f480000    # -5.75f

    .line 371
    .line 372
    const v13, 0x40251eb8    # 2.58f

    .line 373
    .line 374
    .line 375
    const v14, -0x3feae148    # -2.33f

    .line 376
    .line 377
    .line 378
    const/high16 v15, 0x40a00000    # 5.0f

    .line 379
    .line 380
    const/high16 v16, -0x3f900000    # -3.75f

    .line 381
    .line 382
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 383
    .line 384
    .line 385
    const/high16 v17, 0x419a0000    # 19.25f

    .line 386
    .line 387
    const/high16 v18, 0x40200000    # 2.5f

    .line 388
    .line 389
    const/high16 v13, 0x41b00000    # 22.0f

    .line 390
    .line 391
    const v14, 0x4071eb85    # 3.78f

    .line 392
    .line 393
    .line 394
    const v15, 0x41a67ae1    # 20.81f

    .line 395
    .line 396
    .line 397
    const/high16 v16, 0x40200000    # 2.5f

    .line 398
    .line 399
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 400
    .line 401
    .line 402
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 403
    .line 404
    .line 405
    const v0, 0x4105999a    # 8.35f

    .line 406
    .line 407
    .line 408
    const/high16 v2, 0x41880000    # 17.0f

    .line 409
    .line 410
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 411
    .line 412
    .line 413
    const/high16 v17, -0x3fc00000    # -3.0f

    .line 414
    .line 415
    const v18, -0x3fb9999a    # -3.1f

    .line 416
    .line 417
    .line 418
    const v13, -0x40466666    # -1.45f

    .line 419
    .line 420
    .line 421
    const v14, -0x4063d70a    # -1.22f

    .line 422
    .line 423
    .line 424
    const/high16 v15, -0x3fc00000    # -3.0f

    .line 425
    .line 426
    const v16, -0x3fe66666    # -2.4f

    .line 427
    .line 428
    .line 429
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 430
    .line 431
    .line 432
    const/high16 v17, 0x3f400000    # 0.75f

    .line 433
    .line 434
    const/high16 v18, -0x40c00000    # -0.75f

    .line 435
    .line 436
    const/4 v13, 0x0

    .line 437
    const v14, -0x4123d70a    # -0.43f

    .line 438
    .line 439
    .line 440
    const v15, 0x3eb33333    # 0.35f

    .line 441
    .line 442
    .line 443
    const/high16 v16, -0x40c00000    # -0.75f

    .line 444
    .line 445
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 446
    .line 447
    .line 448
    const v17, 0x3f3ae148    # 0.73f

    .line 449
    .line 450
    .line 451
    const v18, 0x3ebd70a4    # 0.37f

    .line 452
    .line 453
    .line 454
    const v13, 0x3e9eb852    # 0.31f

    .line 455
    .line 456
    .line 457
    const/4 v14, 0x0

    .line 458
    const v15, 0x3f051eb8    # 0.52f

    .line 459
    .line 460
    .line 461
    const v16, 0x3e2e147b    # 0.17f

    .line 462
    .line 463
    .line 464
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 465
    .line 466
    .line 467
    const v0, 0x40c9999a    # 6.3f

    .line 468
    .line 469
    .line 470
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 471
    .line 472
    .line 473
    const v0, 0x3fc28f5c    # 1.52f

    .line 474
    .line 475
    .line 476
    const v2, -0x4048f5c3    # -1.43f

    .line 477
    .line 478
    .line 479
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 480
    .line 481
    .line 482
    const v18, -0x41428f5c    # -0.37f

    .line 483
    .line 484
    .line 485
    const v13, 0x3e570a3d    # 0.21f

    .line 486
    .line 487
    .line 488
    const v14, -0x41b33333    # -0.2f

    .line 489
    .line 490
    .line 491
    const v15, 0x3ed70a3d    # 0.42f

    .line 492
    .line 493
    .line 494
    const v16, -0x41428f5c    # -0.37f

    .line 495
    .line 496
    .line 497
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 498
    .line 499
    .line 500
    const/high16 v17, 0x3f400000    # 0.75f

    .line 501
    .line 502
    const/high16 v18, 0x3f400000    # 0.75f

    .line 503
    .line 504
    const v13, 0x3ecccccd    # 0.4f

    .line 505
    .line 506
    .line 507
    const/4 v14, 0x0

    .line 508
    const/high16 v15, 0x3f400000    # 0.75f

    .line 509
    .line 510
    const v16, 0x3ea3d70a    # 0.32f

    .line 511
    .line 512
    .line 513
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 514
    .line 515
    .line 516
    const/high16 v17, 0x41880000    # 17.0f

    .line 517
    .line 518
    const v18, 0x4105999a    # 8.35f

    .line 519
    .line 520
    .line 521
    const/high16 v13, 0x41a00000    # 20.0f

    .line 522
    .line 523
    const v14, 0x40be6666    # 5.95f

    .line 524
    .line 525
    .line 526
    const v15, 0x4193999a    # 18.45f

    .line 527
    .line 528
    .line 529
    const v16, 0x40e428f6    # 7.13f

    .line 530
    .line 531
    .line 532
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 533
    .line 534
    .line 535
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 536
    .line 537
    .line 538
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 539
    .line 540
    .line 541
    move-result-object v2

    .line 542
    const/16 v16, 0x3800

    .line 543
    .line 544
    const/16 v17, 0x0

    .line 545
    .line 546
    const/high16 v6, 0x3f800000    # 1.0f

    .line 547
    .line 548
    const/high16 v8, 0x3f800000    # 1.0f

    .line 549
    .line 550
    const/4 v7, 0x0

    .line 551
    const/high16 v9, 0x3f800000    # 1.0f

    .line 552
    .line 553
    const/high16 v12, 0x3f800000    # 1.0f

    .line 554
    .line 555
    const/4 v13, 0x0

    .line 556
    const/4 v14, 0x0

    .line 557
    const/4 v15, 0x0

    .line 558
    const-string v4, ""

    .line 559
    .line 560
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 561
    .line 562
    .line 563
    move-result-object v0

    .line 564
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 565
    .line 566
    .line 567
    move-result-object v0

    .line 568
    sput-object v0, Landroidx/compose/material/icons/outlined/InterestsKt;->_interests:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 569
    .line 570
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 571
    .line 572
    .line 573
    return-object v0
.end method
