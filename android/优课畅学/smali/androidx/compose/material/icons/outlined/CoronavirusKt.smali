.class public final Landroidx/compose/material/icons/outlined/CoronavirusKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _coronavirus:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getCoronavirus(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/outlined/CoronavirusKt;->_coronavirus:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Outlined.Coronavirus"

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
    const/high16 v0, 0x41180000    # 9.5f

    .line 71
    .line 72
    const/high16 v2, 0x41400000    # 12.0f

    .line 73
    .line 74
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v17, -0x40800000    # -1.0f

    .line 78
    .line 79
    const/high16 v18, 0x3f800000    # 1.0f

    .line 80
    .line 81
    const/4 v13, 0x0

    .line 82
    const v14, 0x3f0ccccd    # 0.55f

    .line 83
    .line 84
    .line 85
    const v15, -0x4119999a    # -0.45f

    .line 86
    .line 87
    .line 88
    const/high16 v16, 0x3f800000    # 1.0f

    .line 89
    .line 90
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 91
    .line 92
    .line 93
    const v0, -0x4119999a    # -0.45f

    .line 94
    .line 95
    .line 96
    const/high16 v2, -0x40800000    # -1.0f

    .line 97
    .line 98
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 99
    .line 100
    .line 101
    const/high16 v17, 0x3f800000    # 1.0f

    .line 102
    .line 103
    const/high16 v18, -0x40800000    # -1.0f

    .line 104
    .line 105
    const v14, -0x40f33333    # -0.55f

    .line 106
    .line 107
    .line 108
    const v15, 0x3ee66666    # 0.45f

    .line 109
    .line 110
    .line 111
    const/high16 v16, -0x40800000    # -1.0f

    .line 112
    .line 113
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 114
    .line 115
    .line 116
    const v0, 0x41373333    # 11.45f

    .line 117
    .line 118
    .line 119
    const/high16 v2, 0x41180000    # 9.5f

    .line 120
    .line 121
    const/high16 v4, 0x41400000    # 12.0f

    .line 122
    .line 123
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 124
    .line 125
    .line 126
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 127
    .line 128
    .line 129
    const/high16 v0, 0x415c0000    # 13.75f

    .line 130
    .line 131
    const/high16 v2, 0x41200000    # 10.0f

    .line 132
    .line 133
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 134
    .line 135
    .line 136
    const v13, 0x3f0ccccd    # 0.55f

    .line 137
    .line 138
    .line 139
    const/4 v14, 0x0

    .line 140
    const/high16 v15, 0x3f800000    # 1.0f

    .line 141
    .line 142
    const v16, -0x4119999a    # -0.45f

    .line 143
    .line 144
    .line 145
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 146
    .line 147
    .line 148
    const v0, -0x4119999a    # -0.45f

    .line 149
    .line 150
    .line 151
    const/high16 v2, -0x40800000    # -1.0f

    .line 152
    .line 153
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 154
    .line 155
    .line 156
    const v0, 0x3ee66666    # 0.45f

    .line 157
    .line 158
    .line 159
    const/high16 v2, 0x3f800000    # 1.0f

    .line 160
    .line 161
    const/high16 v4, -0x40800000    # -1.0f

    .line 162
    .line 163
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 164
    .line 165
    .line 166
    const v0, 0x41533333    # 13.2f

    .line 167
    .line 168
    .line 169
    const/high16 v2, 0x415c0000    # 13.75f

    .line 170
    .line 171
    const/high16 v4, 0x41200000    # 10.0f

    .line 172
    .line 173
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 174
    .line 175
    .line 176
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 177
    .line 178
    .line 179
    const/high16 v0, 0x41240000    # 10.25f

    .line 180
    .line 181
    const/high16 v2, 0x41200000    # 10.0f

    .line 182
    .line 183
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 184
    .line 185
    .line 186
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 187
    .line 188
    .line 189
    const v0, -0x4119999a    # -0.45f

    .line 190
    .line 191
    .line 192
    const/high16 v2, -0x40800000    # -1.0f

    .line 193
    .line 194
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 195
    .line 196
    .line 197
    const v0, 0x3ee66666    # 0.45f

    .line 198
    .line 199
    .line 200
    const/high16 v2, 0x3f800000    # 1.0f

    .line 201
    .line 202
    const/high16 v4, -0x40800000    # -1.0f

    .line 203
    .line 204
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 205
    .line 206
    .line 207
    const v0, 0x411b3333    # 9.7f

    .line 208
    .line 209
    .line 210
    const/high16 v2, 0x41240000    # 10.25f

    .line 211
    .line 212
    const/high16 v4, 0x41200000    # 10.0f

    .line 213
    .line 214
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 215
    .line 216
    .line 217
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 218
    .line 219
    .line 220
    const/high16 v0, 0x41600000    # 14.0f

    .line 221
    .line 222
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 223
    .line 224
    .line 225
    const/high16 v17, -0x40800000    # -1.0f

    .line 226
    .line 227
    const/high16 v18, 0x3f800000    # 1.0f

    .line 228
    .line 229
    const v13, -0x40f33333    # -0.55f

    .line 230
    .line 231
    .line 232
    const/high16 v15, -0x40800000    # -1.0f

    .line 233
    .line 234
    const v16, 0x3ee66666    # 0.45f

    .line 235
    .line 236
    .line 237
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 238
    .line 239
    .line 240
    const/high16 v17, 0x3f800000    # 1.0f

    .line 241
    .line 242
    const/4 v13, 0x0

    .line 243
    const v14, 0x3f0ccccd    # 0.55f

    .line 244
    .line 245
    .line 246
    const v15, 0x3ee66666    # 0.45f

    .line 247
    .line 248
    .line 249
    const/high16 v16, 0x3f800000    # 1.0f

    .line 250
    .line 251
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 252
    .line 253
    .line 254
    const v0, -0x4119999a    # -0.45f

    .line 255
    .line 256
    .line 257
    const/high16 v2, 0x3f800000    # 1.0f

    .line 258
    .line 259
    const/high16 v4, -0x40800000    # -1.0f

    .line 260
    .line 261
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 262
    .line 263
    .line 264
    const/high16 v17, 0x41240000    # 10.25f

    .line 265
    .line 266
    const/high16 v18, 0x41600000    # 14.0f

    .line 267
    .line 268
    const/high16 v13, 0x41340000    # 11.25f

    .line 269
    .line 270
    const v14, 0x41673333    # 14.45f

    .line 271
    .line 272
    .line 273
    const v15, 0x412ccccd    # 10.8f

    .line 274
    .line 275
    .line 276
    const/high16 v16, 0x41600000    # 14.0f

    .line 277
    .line 278
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 279
    .line 280
    .line 281
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 282
    .line 283
    .line 284
    const/high16 v0, 0x41b00000    # 22.0f

    .line 285
    .line 286
    const/high16 v2, 0x41340000    # 11.25f

    .line 287
    .line 288
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 289
    .line 290
    .line 291
    const/high16 v0, 0x3fc00000    # 1.5f

    .line 292
    .line 293
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 294
    .line 295
    .line 296
    const/high16 v17, -0x40c00000    # -0.75f

    .line 297
    .line 298
    const/high16 v18, 0x3f400000    # 0.75f

    .line 299
    .line 300
    const/4 v13, 0x0

    .line 301
    const v14, 0x3ed1eb85    # 0.41f

    .line 302
    .line 303
    .line 304
    const v15, -0x4151eb85    # -0.34f

    .line 305
    .line 306
    .line 307
    const/high16 v16, 0x3f400000    # 0.75f

    .line 308
    .line 309
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 310
    .line 311
    .line 312
    const/high16 v18, -0x40c00000    # -0.75f

    .line 313
    .line 314
    const v13, -0x412e147b    # -0.41f

    .line 315
    .line 316
    .line 317
    const/4 v14, 0x0

    .line 318
    const/high16 v15, -0x40c00000    # -0.75f

    .line 319
    .line 320
    const v16, -0x4151eb85    # -0.34f

    .line 321
    .line 322
    .line 323
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 324
    .line 325
    .line 326
    const v0, -0x403ae148    # -1.54f

    .line 327
    .line 328
    .line 329
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 330
    .line 331
    .line 332
    const v17, -0x403d70a4    # -1.52f

    .line 333
    .line 334
    .line 335
    const v18, 0x4069999a    # 3.65f

    .line 336
    .line 337
    .line 338
    const v13, -0x41e66666    # -0.15f

    .line 339
    .line 340
    .line 341
    const v14, 0x3faf5c29    # 1.37f

    .line 342
    .line 343
    .line 344
    const v15, -0x40cf5c29    # -0.69f

    .line 345
    .line 346
    .line 347
    const v16, 0x402851ec    # 2.63f

    .line 348
    .line 349
    .line 350
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 351
    .line 352
    .line 353
    const v0, 0x3f8b851f    # 1.09f

    .line 354
    .line 355
    .line 356
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 357
    .line 358
    .line 359
    const v0, -0x43dc28f6    # -0.01f

    .line 360
    .line 361
    .line 362
    const v2, 0x3c23d70a    # 0.01f

    .line 363
    .line 364
    .line 365
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 366
    .line 367
    .line 368
    const v17, 0x3f87ae14    # 1.06f

    .line 369
    .line 370
    .line 371
    const/16 v18, 0x0

    .line 372
    .line 373
    const v13, 0x3e947ae1    # 0.29f

    .line 374
    .line 375
    .line 376
    const v14, -0x416b851f    # -0.29f

    .line 377
    .line 378
    .line 379
    const v15, 0x3f451eb8    # 0.77f

    .line 380
    .line 381
    .line 382
    const v16, -0x416b851f    # -0.29f

    .line 383
    .line 384
    .line 385
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 386
    .line 387
    .line 388
    const/16 v17, 0x0

    .line 389
    .line 390
    const v18, 0x3f87ae14    # 1.06f

    .line 391
    .line 392
    .line 393
    const v14, 0x3e947ae1    # 0.29f

    .line 394
    .line 395
    .line 396
    const v15, 0x3e947ae1    # 0.29f

    .line 397
    .line 398
    .line 399
    const v16, 0x3f451eb8    # 0.77f

    .line 400
    .line 401
    .line 402
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 403
    .line 404
    .line 405
    const v0, -0x407851ec    # -1.06f

    .line 406
    .line 407
    .line 408
    const v2, 0x3f87ae14    # 1.06f

    .line 409
    .line 410
    .line 411
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 412
    .line 413
    .line 414
    const v17, -0x407851ec    # -1.06f

    .line 415
    .line 416
    .line 417
    const/16 v18, 0x0

    .line 418
    .line 419
    const v13, -0x416b851f    # -0.29f

    .line 420
    .line 421
    .line 422
    const v15, -0x40bae148    # -0.77f

    .line 423
    .line 424
    .line 425
    const v16, 0x3e947ae1    # 0.29f

    .line 426
    .line 427
    .line 428
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 429
    .line 430
    .line 431
    const v17, -0x43dc28f6    # -0.01f

    .line 432
    .line 433
    .line 434
    const v18, -0x4079999a    # -1.05f

    .line 435
    .line 436
    .line 437
    const v14, -0x416b851f    # -0.29f

    .line 438
    .line 439
    .line 440
    const v15, -0x416b851f    # -0.29f

    .line 441
    .line 442
    .line 443
    const v16, -0x40bd70a4    # -0.76f

    .line 444
    .line 445
    .line 446
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 447
    .line 448
    .line 449
    const v0, -0x40747ae1    # -1.09f

    .line 450
    .line 451
    .line 452
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 453
    .line 454
    .line 455
    const v17, -0x3f970a3d    # -3.64f

    .line 456
    .line 457
    .line 458
    const v18, 0x3fc147ae    # 1.51f

    .line 459
    .line 460
    .line 461
    const v13, -0x407d70a4    # -1.02f

    .line 462
    .line 463
    .line 464
    const v14, 0x3f51eb85    # 0.82f

    .line 465
    .line 466
    .line 467
    const v15, -0x3feeb852    # -2.27f

    .line 468
    .line 469
    .line 470
    const v16, 0x3fae147b    # 1.36f

    .line 471
    .line 472
    .line 473
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 474
    .line 475
    .line 476
    const v0, 0x3fc51eb8    # 1.54f

    .line 477
    .line 478
    .line 479
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 480
    .line 481
    .line 482
    const v0, 0x3c23d70a    # 0.01f

    .line 483
    .line 484
    .line 485
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 486
    .line 487
    .line 488
    const/high16 v17, 0x3f400000    # 0.75f

    .line 489
    .line 490
    const/high16 v18, 0x3f400000    # 0.75f

    .line 491
    .line 492
    const v13, 0x3ed1eb85    # 0.41f

    .line 493
    .line 494
    .line 495
    const/4 v14, 0x0

    .line 496
    const/high16 v15, 0x3f400000    # 0.75f

    .line 497
    .line 498
    const v16, 0x3eae147b    # 0.34f

    .line 499
    .line 500
    .line 501
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 502
    .line 503
    .line 504
    const/high16 v17, -0x40c00000    # -0.75f

    .line 505
    .line 506
    const/4 v13, 0x0

    .line 507
    const v14, 0x3ed1eb85    # 0.41f

    .line 508
    .line 509
    .line 510
    const v15, -0x4151eb85    # -0.34f

    .line 511
    .line 512
    .line 513
    const/high16 v16, 0x3f400000    # 0.75f

    .line 514
    .line 515
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 516
    .line 517
    .line 518
    const/high16 v0, -0x40400000    # -1.5f

    .line 519
    .line 520
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 521
    .line 522
    .line 523
    const/high16 v18, -0x40c00000    # -0.75f

    .line 524
    .line 525
    const v13, -0x412e147b    # -0.41f

    .line 526
    .line 527
    .line 528
    const/4 v14, 0x0

    .line 529
    const/high16 v15, -0x40c00000    # -0.75f

    .line 530
    .line 531
    const v16, -0x4151eb85    # -0.34f

    .line 532
    .line 533
    .line 534
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 535
    .line 536
    .line 537
    const v17, 0x3f3d70a4    # 0.74f

    .line 538
    .line 539
    .line 540
    const/4 v13, 0x0

    .line 541
    const v14, -0x412e147b    # -0.41f

    .line 542
    .line 543
    .line 544
    const v15, 0x3ea8f5c3    # 0.33f

    .line 545
    .line 546
    .line 547
    const v16, -0x40c28f5c    # -0.74f

    .line 548
    .line 549
    .line 550
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 551
    .line 552
    .line 553
    const v0, -0x4039999a    # -1.55f

    .line 554
    .line 555
    .line 556
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 557
    .line 558
    .line 559
    const v17, -0x3f97ae14    # -3.63f

    .line 560
    .line 561
    .line 562
    const v18, -0x403eb852    # -1.51f

    .line 563
    .line 564
    .line 565
    const v13, -0x4050a3d7    # -1.37f

    .line 566
    .line 567
    .line 568
    const v14, -0x41e66666    # -0.15f

    .line 569
    .line 570
    .line 571
    const v15, -0x3fd851ec    # -2.62f

    .line 572
    .line 573
    .line 574
    const v16, -0x40cf5c29    # -0.69f

    .line 575
    .line 576
    .line 577
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 578
    .line 579
    .line 580
    const v0, -0x40747ae1    # -1.09f

    .line 581
    .line 582
    .line 583
    const v2, 0x3f8b851f    # 1.09f

    .line 584
    .line 585
    .line 586
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 587
    .line 588
    .line 589
    const v0, 0x3c23d70a    # 0.01f

    .line 590
    .line 591
    .line 592
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 593
    .line 594
    .line 595
    const/16 v17, 0x0

    .line 596
    .line 597
    const v18, 0x3f87ae14    # 1.06f

    .line 598
    .line 599
    .line 600
    const v13, 0x3e947ae1    # 0.29f

    .line 601
    .line 602
    .line 603
    const v14, 0x3e947ae1    # 0.29f

    .line 604
    .line 605
    .line 606
    const v15, 0x3e947ae1    # 0.29f

    .line 607
    .line 608
    .line 609
    const v16, 0x3f451eb8    # 0.77f

    .line 610
    .line 611
    .line 612
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 613
    .line 614
    .line 615
    const v17, -0x407851ec    # -1.06f

    .line 616
    .line 617
    .line 618
    const/16 v18, 0x0

    .line 619
    .line 620
    const v13, -0x416b851f    # -0.29f

    .line 621
    .line 622
    .line 623
    const v15, -0x40bae148    # -0.77f

    .line 624
    .line 625
    .line 626
    const v16, 0x3e947ae1    # 0.29f

    .line 627
    .line 628
    .line 629
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 630
    .line 631
    .line 632
    const v0, 0x408ccccd    # 4.4f

    .line 633
    .line 634
    .line 635
    const v2, 0x419451ec    # 18.54f

    .line 636
    .line 637
    .line 638
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 639
    .line 640
    .line 641
    const/16 v17, 0x0

    .line 642
    .line 643
    const v18, -0x407851ec    # -1.06f

    .line 644
    .line 645
    .line 646
    const v14, -0x416b851f    # -0.29f

    .line 647
    .line 648
    .line 649
    const v15, -0x416b851f    # -0.29f

    .line 650
    .line 651
    .line 652
    const v16, -0x40bae148    # -0.77f

    .line 653
    .line 654
    .line 655
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 656
    .line 657
    .line 658
    const v17, 0x3f866666    # 1.05f

    .line 659
    .line 660
    .line 661
    const v18, -0x43dc28f6    # -0.01f

    .line 662
    .line 663
    .line 664
    const v13, 0x3e947ae1    # 0.29f

    .line 665
    .line 666
    .line 667
    const v15, 0x3f428f5c    # 0.76f

    .line 668
    .line 669
    .line 670
    const v16, -0x416b851f    # -0.29f

    .line 671
    .line 672
    .line 673
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 674
    .line 675
    .line 676
    const v0, -0x40747ae1    # -1.09f

    .line 677
    .line 678
    .line 679
    const v2, 0x3f8b851f    # 1.09f

    .line 680
    .line 681
    .line 682
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 683
    .line 684
    .line 685
    const/high16 v17, -0x40400000    # -1.5f

    .line 686
    .line 687
    const v18, -0x3f97ae14    # -3.63f

    .line 688
    .line 689
    .line 690
    const v13, -0x40ae147b    # -0.82f

    .line 691
    .line 692
    .line 693
    const v14, -0x407d70a4    # -1.02f

    .line 694
    .line 695
    .line 696
    const v15, -0x4051eb85    # -1.36f

    .line 697
    .line 698
    .line 699
    const v16, -0x3fef5c29    # -2.26f

    .line 700
    .line 701
    .line 702
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 703
    .line 704
    .line 705
    const/high16 v0, 0x40600000    # 3.5f

    .line 706
    .line 707
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 708
    .line 709
    .line 710
    const/high16 v17, -0x40c00000    # -0.75f

    .line 711
    .line 712
    const/high16 v18, 0x3f400000    # 0.75f

    .line 713
    .line 714
    const/4 v13, 0x0

    .line 715
    const v14, 0x3ed1eb85    # 0.41f

    .line 716
    .line 717
    .line 718
    const v15, -0x4151eb85    # -0.34f

    .line 719
    .line 720
    .line 721
    const/high16 v16, 0x3f400000    # 0.75f

    .line 722
    .line 723
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 724
    .line 725
    .line 726
    const/high16 v17, 0x40000000    # 2.0f

    .line 727
    .line 728
    const/high16 v18, 0x414c0000    # 12.75f

    .line 729
    .line 730
    const v13, 0x4015c28f    # 2.34f

    .line 731
    .line 732
    .line 733
    const/high16 v14, 0x41580000    # 13.5f

    .line 734
    .line 735
    const/high16 v15, 0x40000000    # 2.0f

    .line 736
    .line 737
    const v16, 0x41528f5c    # 13.16f

    .line 738
    .line 739
    .line 740
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 741
    .line 742
    .line 743
    const/high16 v0, -0x40400000    # -1.5f

    .line 744
    .line 745
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 746
    .line 747
    .line 748
    const/high16 v17, 0x3f400000    # 0.75f

    .line 749
    .line 750
    const/high16 v18, -0x40c00000    # -0.75f

    .line 751
    .line 752
    const/4 v13, 0x0

    .line 753
    const v14, -0x412e147b    # -0.41f

    .line 754
    .line 755
    .line 756
    const v15, 0x3eae147b    # 0.34f

    .line 757
    .line 758
    .line 759
    const/high16 v16, -0x40c00000    # -0.75f

    .line 760
    .line 761
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 762
    .line 763
    .line 764
    const/high16 v18, 0x3f400000    # 0.75f

    .line 765
    .line 766
    const v13, 0x3ed1eb85    # 0.41f

    .line 767
    .line 768
    .line 769
    const/4 v14, 0x0

    .line 770
    const/high16 v15, 0x3f400000    # 0.75f

    .line 771
    .line 772
    const v16, 0x3eae147b    # 0.34f

    .line 773
    .line 774
    .line 775
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 776
    .line 777
    .line 778
    const v0, 0x3fc51eb8    # 1.54f

    .line 779
    .line 780
    .line 781
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 782
    .line 783
    .line 784
    const/high16 v17, 0x3fc00000    # 1.5f

    .line 785
    .line 786
    const v18, -0x3f97ae14    # -3.63f

    .line 787
    .line 788
    .line 789
    const v13, 0x3e19999a    # 0.15f

    .line 790
    .line 791
    .line 792
    const v14, -0x4050a3d7    # -1.37f

    .line 793
    .line 794
    .line 795
    const v15, 0x3f30a3d7    # 0.69f

    .line 796
    .line 797
    .line 798
    const v16, -0x3fd8f5c3    # -2.61f

    .line 799
    .line 800
    .line 801
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 802
    .line 803
    .line 804
    const v0, 0x40ae6666    # 5.45f

    .line 805
    .line 806
    .line 807
    const v2, 0x40d0f5c3    # 6.53f

    .line 808
    .line 809
    .line 810
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 811
    .line 812
    .line 813
    const v17, 0x408ccccd    # 4.4f

    .line 814
    .line 815
    .line 816
    const v18, 0x40d0a3d7    # 6.52f

    .line 817
    .line 818
    .line 819
    const v13, 0x40a51eb8    # 5.16f

    .line 820
    .line 821
    .line 822
    const v14, 0x40d9eb85    # 6.81f

    .line 823
    .line 824
    .line 825
    const v15, 0x4096147b    # 4.69f

    .line 826
    .line 827
    .line 828
    const v16, 0x40d9eb85    # 6.81f

    .line 829
    .line 830
    .line 831
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 832
    .line 833
    .line 834
    const/16 v17, 0x0

    .line 835
    .line 836
    const v18, -0x407851ec    # -1.06f

    .line 837
    .line 838
    .line 839
    const v13, -0x416b851f    # -0.29f

    .line 840
    .line 841
    .line 842
    const v14, -0x416b851f    # -0.29f

    .line 843
    .line 844
    .line 845
    const v15, -0x416b851f    # -0.29f

    .line 846
    .line 847
    .line 848
    const v16, -0x40bae148    # -0.77f

    .line 849
    .line 850
    .line 851
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 852
    .line 853
    .line 854
    const v0, 0x40aeb852    # 5.46f

    .line 855
    .line 856
    .line 857
    const v2, 0x408ccccd    # 4.4f

    .line 858
    .line 859
    .line 860
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 861
    .line 862
    .line 863
    const v17, 0x3f87ae14    # 1.06f

    .line 864
    .line 865
    .line 866
    const/16 v18, 0x0

    .line 867
    .line 868
    const v13, 0x3e947ae1    # 0.29f

    .line 869
    .line 870
    .line 871
    const v15, 0x3f451eb8    # 0.77f

    .line 872
    .line 873
    .line 874
    const v16, -0x416b851f    # -0.29f

    .line 875
    .line 876
    .line 877
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 878
    .line 879
    .line 880
    const/16 v17, 0x0

    .line 881
    .line 882
    const v18, 0x3f87ae14    # 1.06f

    .line 883
    .line 884
    .line 885
    const v14, 0x3e947ae1    # 0.29f

    .line 886
    .line 887
    .line 888
    const v15, 0x3e947ae1    # 0.29f

    .line 889
    .line 890
    .line 891
    const v16, 0x3f451eb8    # 0.77f

    .line 892
    .line 893
    .line 894
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 895
    .line 896
    .line 897
    const v0, 0x40d051ec    # 6.51f

    .line 898
    .line 899
    .line 900
    const v2, 0x40af0a3d    # 5.47f

    .line 901
    .line 902
    .line 903
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 904
    .line 905
    .line 906
    const v0, 0x40f33333    # 7.6f

    .line 907
    .line 908
    .line 909
    const v2, 0x40d1eb85    # 6.56f

    .line 910
    .line 911
    .line 912
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 913
    .line 914
    .line 915
    const v17, 0x406851ec    # 3.63f

    .line 916
    .line 917
    .line 918
    const v18, -0x403eb852    # -1.51f

    .line 919
    .line 920
    .line 921
    const v13, 0x3f828f5c    # 1.02f

    .line 922
    .line 923
    .line 924
    const v14, -0x40ae147b    # -0.82f

    .line 925
    .line 926
    .line 927
    const v15, 0x4010a3d7    # 2.26f

    .line 928
    .line 929
    .line 930
    const v16, -0x4051eb85    # -1.36f

    .line 931
    .line 932
    .line 933
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 934
    .line 935
    .line 936
    const/high16 v0, 0x40600000    # 3.5f

    .line 937
    .line 938
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 939
    .line 940
    .line 941
    const v17, -0x40c28f5c    # -0.74f

    .line 942
    .line 943
    .line 944
    const/high16 v18, -0x40c00000    # -0.75f

    .line 945
    .line 946
    const v13, -0x412e147b    # -0.41f

    .line 947
    .line 948
    .line 949
    const v14, -0x43dc28f6    # -0.01f

    .line 950
    .line 951
    .line 952
    const v15, -0x40c28f5c    # -0.74f

    .line 953
    .line 954
    .line 955
    const v16, -0x4151eb85    # -0.34f

    .line 956
    .line 957
    .line 958
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 959
    .line 960
    .line 961
    const/high16 v17, 0x41340000    # 11.25f

    .line 962
    .line 963
    const/high16 v18, 0x40000000    # 2.0f

    .line 964
    .line 965
    const/high16 v13, 0x41280000    # 10.5f

    .line 966
    .line 967
    const v14, 0x4015c28f    # 2.34f

    .line 968
    .line 969
    .line 970
    const v15, 0x412d70a4    # 10.84f

    .line 971
    .line 972
    .line 973
    const/high16 v16, 0x40000000    # 2.0f

    .line 974
    .line 975
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 976
    .line 977
    .line 978
    const/high16 v0, 0x3fc00000    # 1.5f

    .line 979
    .line 980
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 981
    .line 982
    .line 983
    const/high16 v17, 0x3f400000    # 0.75f

    .line 984
    .line 985
    const/high16 v18, 0x3f400000    # 0.75f

    .line 986
    .line 987
    const v13, 0x3ed1eb85    # 0.41f

    .line 988
    .line 989
    .line 990
    const/4 v14, 0x0

    .line 991
    const/high16 v15, 0x3f400000    # 0.75f

    .line 992
    .line 993
    const v16, 0x3eae147b    # 0.34f

    .line 994
    .line 995
    .line 996
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 997
    .line 998
    .line 999
    const/high16 v17, -0x40c00000    # -0.75f

    .line 1000
    .line 1001
    const/4 v13, 0x0

    .line 1002
    const v14, 0x3ed1eb85    # 0.41f

    .line 1003
    .line 1004
    .line 1005
    const v15, -0x4151eb85    # -0.34f

    .line 1006
    .line 1007
    .line 1008
    const/high16 v16, 0x3f400000    # 0.75f

    .line 1009
    .line 1010
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1011
    .line 1012
    .line 1013
    const v0, -0x43dc28f6    # -0.01f

    .line 1014
    .line 1015
    .line 1016
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1017
    .line 1018
    .line 1019
    const v0, 0x3fc51eb8    # 1.54f

    .line 1020
    .line 1021
    .line 1022
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1023
    .line 1024
    .line 1025
    const v17, 0x4068f5c3    # 3.64f

    .line 1026
    .line 1027
    .line 1028
    const v18, 0x3fc147ae    # 1.51f

    .line 1029
    .line 1030
    .line 1031
    const v13, 0x3faf5c29    # 1.37f

    .line 1032
    .line 1033
    .line 1034
    const v14, 0x3e0f5c29    # 0.14f

    .line 1035
    .line 1036
    .line 1037
    const v15, 0x4027ae14    # 2.62f

    .line 1038
    .line 1039
    .line 1040
    const v16, 0x3f30a3d7    # 0.69f

    .line 1041
    .line 1042
    .line 1043
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1044
    .line 1045
    .line 1046
    const v0, -0x40747ae1    # -1.09f

    .line 1047
    .line 1048
    .line 1049
    const v2, 0x3f8b851f    # 1.09f

    .line 1050
    .line 1051
    .line 1052
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1053
    .line 1054
    .line 1055
    const v17, 0x3c23d70a    # 0.01f

    .line 1056
    .line 1057
    .line 1058
    const v18, -0x4079999a    # -1.05f

    .line 1059
    .line 1060
    .line 1061
    const v13, -0x416b851f    # -0.29f

    .line 1062
    .line 1063
    .line 1064
    const v14, -0x416b851f    # -0.29f

    .line 1065
    .line 1066
    .line 1067
    const v15, -0x4170a3d7    # -0.28f

    .line 1068
    .line 1069
    .line 1070
    const v16, -0x40bd70a4    # -0.76f

    .line 1071
    .line 1072
    .line 1073
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1074
    .line 1075
    .line 1076
    const v17, 0x3f87ae14    # 1.06f

    .line 1077
    .line 1078
    .line 1079
    const/16 v18, 0x0

    .line 1080
    .line 1081
    const v13, 0x3e947ae1    # 0.29f

    .line 1082
    .line 1083
    .line 1084
    const v15, 0x3f451eb8    # 0.77f

    .line 1085
    .line 1086
    .line 1087
    const v16, -0x416b851f    # -0.29f

    .line 1088
    .line 1089
    .line 1090
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1091
    .line 1092
    .line 1093
    const v0, 0x3f87ae14    # 1.06f

    .line 1094
    .line 1095
    .line 1096
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1097
    .line 1098
    .line 1099
    const/16 v17, 0x0

    .line 1100
    .line 1101
    const v18, 0x3f87ae14    # 1.06f

    .line 1102
    .line 1103
    .line 1104
    const v14, 0x3e947ae1    # 0.29f

    .line 1105
    .line 1106
    .line 1107
    const v15, 0x3e947ae1    # 0.29f

    .line 1108
    .line 1109
    .line 1110
    const v16, 0x3f451eb8    # 0.77f

    .line 1111
    .line 1112
    .line 1113
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1114
    .line 1115
    .line 1116
    const v0, 0x3e947ae1    # 0.29f

    .line 1117
    .line 1118
    .line 1119
    const/4 v2, 0x0

    .line 1120
    const v4, -0x407851ec    # -1.06f

    .line 1121
    .line 1122
    .line 1123
    const v6, -0x40bae148    # -0.77f

    .line 1124
    .line 1125
    .line 1126
    invoke-virtual {v12, v6, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1127
    .line 1128
    .line 1129
    const v0, -0x43dc28f6    # -0.01f

    .line 1130
    .line 1131
    .line 1132
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1133
    .line 1134
    .line 1135
    const v0, 0x418b851f    # 17.44f

    .line 1136
    .line 1137
    .line 1138
    const v2, 0x40f33333    # 7.6f

    .line 1139
    .line 1140
    .line 1141
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1142
    .line 1143
    .line 1144
    const v17, 0x3fc28f5c    # 1.52f

    .line 1145
    .line 1146
    .line 1147
    const v18, 0x4069999a    # 3.65f

    .line 1148
    .line 1149
    .line 1150
    const v13, 0x3f51eb85    # 0.82f

    .line 1151
    .line 1152
    .line 1153
    const v14, 0x3f828f5c    # 1.02f

    .line 1154
    .line 1155
    .line 1156
    const v15, 0x3faf5c29    # 1.37f

    .line 1157
    .line 1158
    .line 1159
    const v16, 0x401147ae    # 2.27f

    .line 1160
    .line 1161
    .line 1162
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1163
    .line 1164
    .line 1165
    const v0, 0x3fc51eb8    # 1.54f

    .line 1166
    .line 1167
    .line 1168
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1169
    .line 1170
    .line 1171
    const/high16 v17, 0x3f400000    # 0.75f

    .line 1172
    .line 1173
    const/high16 v18, -0x40c00000    # -0.75f

    .line 1174
    .line 1175
    const/4 v13, 0x0

    .line 1176
    const v14, -0x412e147b    # -0.41f

    .line 1177
    .line 1178
    .line 1179
    const v15, 0x3eae147b    # 0.34f

    .line 1180
    .line 1181
    .line 1182
    const/high16 v16, -0x40c00000    # -0.75f

    .line 1183
    .line 1184
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1185
    .line 1186
    .line 1187
    const/high16 v17, 0x41b00000    # 22.0f

    .line 1188
    .line 1189
    const/high16 v18, 0x41340000    # 11.25f

    .line 1190
    .line 1191
    const v13, 0x41ad47ae    # 21.66f

    .line 1192
    .line 1193
    .line 1194
    const/high16 v14, 0x41280000    # 10.5f

    .line 1195
    .line 1196
    const/high16 v15, 0x41b00000    # 22.0f

    .line 1197
    .line 1198
    const v16, 0x412d70a4    # 10.84f

    .line 1199
    .line 1200
    .line 1201
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1202
    .line 1203
    .line 1204
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1205
    .line 1206
    .line 1207
    const/high16 v0, 0x41880000    # 17.0f

    .line 1208
    .line 1209
    const/high16 v2, 0x41400000    # 12.0f

    .line 1210
    .line 1211
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1212
    .line 1213
    .line 1214
    const/high16 v17, -0x3f600000    # -5.0f

    .line 1215
    .line 1216
    const/high16 v18, -0x3f600000    # -5.0f

    .line 1217
    .line 1218
    const/4 v13, 0x0

    .line 1219
    const v14, -0x3fcf5c29    # -2.76f

    .line 1220
    .line 1221
    .line 1222
    const v15, -0x3ff0a3d7    # -2.24f

    .line 1223
    .line 1224
    .line 1225
    const/high16 v16, -0x3f600000    # -5.0f

    .line 1226
    .line 1227
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1228
    .line 1229
    .line 1230
    const v0, 0x400f5c29    # 2.24f

    .line 1231
    .line 1232
    .line 1233
    const/high16 v2, -0x3f600000    # -5.0f

    .line 1234
    .line 1235
    const/high16 v4, 0x40a00000    # 5.0f

    .line 1236
    .line 1237
    const/high16 v6, -0x3f600000    # -5.0f

    .line 1238
    .line 1239
    invoke-virtual {v12, v6, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1240
    .line 1241
    .line 1242
    const/high16 v2, 0x40a00000    # 5.0f

    .line 1243
    .line 1244
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1245
    .line 1246
    .line 1247
    const v0, 0x416c28f6    # 14.76f

    .line 1248
    .line 1249
    .line 1250
    const/high16 v2, 0x41880000    # 17.0f

    .line 1251
    .line 1252
    const/high16 v4, 0x41400000    # 12.0f

    .line 1253
    .line 1254
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1255
    .line 1256
    .line 1257
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1258
    .line 1259
    .line 1260
    const/high16 v0, 0x41300000    # 11.0f

    .line 1261
    .line 1262
    const/high16 v2, 0x41400000    # 12.0f

    .line 1263
    .line 1264
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1265
    .line 1266
    .line 1267
    const/high16 v17, -0x40800000    # -1.0f

    .line 1268
    .line 1269
    const/high16 v18, 0x3f800000    # 1.0f

    .line 1270
    .line 1271
    const v13, -0x40f33333    # -0.55f

    .line 1272
    .line 1273
    .line 1274
    const/4 v14, 0x0

    .line 1275
    const/high16 v15, -0x40800000    # -1.0f

    .line 1276
    .line 1277
    const v16, 0x3ee66666    # 0.45f

    .line 1278
    .line 1279
    .line 1280
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1281
    .line 1282
    .line 1283
    const/high16 v17, 0x3f800000    # 1.0f

    .line 1284
    .line 1285
    const/4 v13, 0x0

    .line 1286
    const v14, 0x3f0ccccd    # 0.55f

    .line 1287
    .line 1288
    .line 1289
    const v15, 0x3ee66666    # 0.45f

    .line 1290
    .line 1291
    .line 1292
    const/high16 v16, 0x3f800000    # 1.0f

    .line 1293
    .line 1294
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1295
    .line 1296
    .line 1297
    const v0, -0x4119999a    # -0.45f

    .line 1298
    .line 1299
    .line 1300
    const/high16 v2, 0x3f800000    # 1.0f

    .line 1301
    .line 1302
    const/high16 v4, -0x40800000    # -1.0f

    .line 1303
    .line 1304
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1305
    .line 1306
    .line 1307
    const/high16 v17, 0x41400000    # 12.0f

    .line 1308
    .line 1309
    const/high16 v18, 0x41300000    # 11.0f

    .line 1310
    .line 1311
    const/high16 v13, 0x41500000    # 13.0f

    .line 1312
    .line 1313
    const v14, 0x41373333    # 11.45f

    .line 1314
    .line 1315
    .line 1316
    const v15, 0x4148cccd    # 12.55f

    .line 1317
    .line 1318
    .line 1319
    const/high16 v16, 0x41300000    # 11.0f

    .line 1320
    .line 1321
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1322
    .line 1323
    .line 1324
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1325
    .line 1326
    .line 1327
    const/high16 v0, 0x41780000    # 15.5f

    .line 1328
    .line 1329
    const/high16 v2, 0x41300000    # 11.0f

    .line 1330
    .line 1331
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1332
    .line 1333
    .line 1334
    const/high16 v17, -0x40800000    # -1.0f

    .line 1335
    .line 1336
    const/high16 v18, 0x3f800000    # 1.0f

    .line 1337
    .line 1338
    const v13, -0x40f33333    # -0.55f

    .line 1339
    .line 1340
    .line 1341
    const/4 v14, 0x0

    .line 1342
    const/high16 v15, -0x40800000    # -1.0f

    .line 1343
    .line 1344
    const v16, 0x3ee66666    # 0.45f

    .line 1345
    .line 1346
    .line 1347
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1348
    .line 1349
    .line 1350
    const/high16 v17, 0x3f800000    # 1.0f

    .line 1351
    .line 1352
    const/4 v13, 0x0

    .line 1353
    const v14, 0x3f0ccccd    # 0.55f

    .line 1354
    .line 1355
    .line 1356
    const v15, 0x3ee66666    # 0.45f

    .line 1357
    .line 1358
    .line 1359
    const/high16 v16, 0x3f800000    # 1.0f

    .line 1360
    .line 1361
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1362
    .line 1363
    .line 1364
    const v0, -0x4119999a    # -0.45f

    .line 1365
    .line 1366
    .line 1367
    const/high16 v2, 0x3f800000    # 1.0f

    .line 1368
    .line 1369
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1370
    .line 1371
    .line 1372
    const/high16 v17, 0x41780000    # 15.5f

    .line 1373
    .line 1374
    const/high16 v18, 0x41300000    # 11.0f

    .line 1375
    .line 1376
    const/high16 v13, 0x41840000    # 16.5f

    .line 1377
    .line 1378
    const v14, 0x41373333    # 11.45f

    .line 1379
    .line 1380
    .line 1381
    const v15, 0x41806666    # 16.05f

    .line 1382
    .line 1383
    .line 1384
    const/high16 v16, 0x41300000    # 11.0f

    .line 1385
    .line 1386
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1387
    .line 1388
    .line 1389
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1390
    .line 1391
    .line 1392
    const/high16 v0, 0x41600000    # 14.0f

    .line 1393
    .line 1394
    const/high16 v2, 0x415c0000    # 13.75f

    .line 1395
    .line 1396
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1397
    .line 1398
    .line 1399
    const/high16 v17, -0x40800000    # -1.0f

    .line 1400
    .line 1401
    const/high16 v18, 0x3f800000    # 1.0f

    .line 1402
    .line 1403
    const v13, -0x40f33333    # -0.55f

    .line 1404
    .line 1405
    .line 1406
    const/4 v14, 0x0

    .line 1407
    const/high16 v15, -0x40800000    # -1.0f

    .line 1408
    .line 1409
    const v16, 0x3ee66666    # 0.45f

    .line 1410
    .line 1411
    .line 1412
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1413
    .line 1414
    .line 1415
    const/high16 v17, 0x3f800000    # 1.0f

    .line 1416
    .line 1417
    const/4 v13, 0x0

    .line 1418
    const v14, 0x3f0ccccd    # 0.55f

    .line 1419
    .line 1420
    .line 1421
    const v15, 0x3ee66666    # 0.45f

    .line 1422
    .line 1423
    .line 1424
    const/high16 v16, 0x3f800000    # 1.0f

    .line 1425
    .line 1426
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1427
    .line 1428
    .line 1429
    const v0, -0x4119999a    # -0.45f

    .line 1430
    .line 1431
    .line 1432
    const/high16 v2, 0x3f800000    # 1.0f

    .line 1433
    .line 1434
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1435
    .line 1436
    .line 1437
    const/high16 v17, 0x415c0000    # 13.75f

    .line 1438
    .line 1439
    const/high16 v18, 0x41600000    # 14.0f

    .line 1440
    .line 1441
    const/high16 v13, 0x416c0000    # 14.75f

    .line 1442
    .line 1443
    const v14, 0x41673333    # 14.45f

    .line 1444
    .line 1445
    .line 1446
    const v15, 0x4164cccd    # 14.3f

    .line 1447
    .line 1448
    .line 1449
    const/high16 v16, 0x41600000    # 14.0f

    .line 1450
    .line 1451
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1452
    .line 1453
    .line 1454
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1455
    .line 1456
    .line 1457
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 1458
    .line 1459
    .line 1460
    move-result-object v2

    .line 1461
    const/16 v16, 0x3800

    .line 1462
    .line 1463
    const/16 v17, 0x0

    .line 1464
    .line 1465
    const/high16 v6, 0x3f800000    # 1.0f

    .line 1466
    .line 1467
    const/high16 v8, 0x3f800000    # 1.0f

    .line 1468
    .line 1469
    const/4 v7, 0x0

    .line 1470
    const/high16 v9, 0x3f800000    # 1.0f

    .line 1471
    .line 1472
    const/high16 v12, 0x3f800000    # 1.0f

    .line 1473
    .line 1474
    const/4 v13, 0x0

    .line 1475
    const/4 v14, 0x0

    .line 1476
    const/4 v15, 0x0

    .line 1477
    const-string v4, ""

    .line 1478
    .line 1479
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 1480
    .line 1481
    .line 1482
    move-result-object v0

    .line 1483
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1484
    .line 1485
    .line 1486
    move-result-object v0

    .line 1487
    sput-object v0, Landroidx/compose/material/icons/outlined/CoronavirusKt;->_coronavirus:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1488
    .line 1489
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 1490
    .line 1491
    .line 1492
    return-object v0
.end method
