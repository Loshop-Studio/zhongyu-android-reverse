.class public final Landroidx/compose/material/icons/outlined/LivingKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _living:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getLiving(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/outlined/LivingKt;->_living:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Outlined.Living"

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
    const/high16 v0, 0x418e0000    # 17.75f

    .line 71
    .line 72
    const v2, 0x4125999a    # 10.35f

    .line 73
    .line 74
    .line 75
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    const/high16 v0, 0x41100000    # 9.0f

    .line 79
    .line 80
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 81
    .line 82
    .line 83
    const/high16 v17, -0x3fc00000    # -3.0f

    .line 84
    .line 85
    const/high16 v18, -0x3fc00000    # -3.0f

    .line 86
    .line 87
    const/4 v13, 0x0

    .line 88
    const v14, -0x402b851f    # -1.66f

    .line 89
    .line 90
    .line 91
    const v15, -0x40547ae1    # -1.34f

    .line 92
    .line 93
    .line 94
    const/high16 v16, -0x3fc00000    # -3.0f

    .line 95
    .line 96
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 97
    .line 98
    .line 99
    const/high16 v0, -0x3f500000    # -5.5f

    .line 100
    .line 101
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 102
    .line 103
    .line 104
    const/high16 v18, 0x40400000    # 3.0f

    .line 105
    .line 106
    const v13, -0x402b851f    # -1.66f

    .line 107
    .line 108
    .line 109
    const/4 v14, 0x0

    .line 110
    const/high16 v15, -0x3fc00000    # -3.0f

    .line 111
    .line 112
    const v16, 0x3fab851f    # 1.34f

    .line 113
    .line 114
    .line 115
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 116
    .line 117
    .line 118
    const v0, 0x3faccccd    # 1.35f

    .line 119
    .line 120
    .line 121
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 122
    .line 123
    .line 124
    const/high16 v17, 0x40a00000    # 5.0f

    .line 125
    .line 126
    const/high16 v18, 0x41480000    # 12.5f

    .line 127
    .line 128
    const v13, 0x40b051ec    # 5.51f

    .line 129
    .line 130
    .line 131
    const v14, 0x412c7ae1    # 10.78f

    .line 132
    .line 133
    .line 134
    const/high16 v15, 0x40a00000    # 5.0f

    .line 135
    .line 136
    const v16, 0x413947ae    # 11.58f

    .line 137
    .line 138
    .line 139
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 140
    .line 141
    .line 142
    const/high16 v0, 0x41800000    # 16.0f

    .line 143
    .line 144
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 145
    .line 146
    .line 147
    const/high16 v17, 0x40000000    # 2.0f

    .line 148
    .line 149
    const/high16 v18, 0x40000000    # 2.0f

    .line 150
    .line 151
    const/4 v13, 0x0

    .line 152
    const v14, 0x3f8ccccd    # 1.1f

    .line 153
    .line 154
    .line 155
    const v15, 0x3f666666    # 0.9f

    .line 156
    .line 157
    .line 158
    const/high16 v16, 0x40000000    # 2.0f

    .line 159
    .line 160
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 161
    .line 162
    .line 163
    const/high16 v0, 0x41200000    # 10.0f

    .line 164
    .line 165
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 166
    .line 167
    .line 168
    const/high16 v18, -0x40000000    # -2.0f

    .line 169
    .line 170
    const v13, 0x3f8ccccd    # 1.1f

    .line 171
    .line 172
    .line 173
    const/4 v14, 0x0

    .line 174
    const/high16 v15, 0x40000000    # 2.0f

    .line 175
    .line 176
    const v16, -0x4099999a    # -0.9f

    .line 177
    .line 178
    .line 179
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 180
    .line 181
    .line 182
    const/high16 v0, -0x3fa00000    # -3.5f

    .line 183
    .line 184
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 185
    .line 186
    .line 187
    const/high16 v17, 0x418e0000    # 17.75f

    .line 188
    .line 189
    const v18, 0x4125999a    # 10.35f

    .line 190
    .line 191
    .line 192
    const/high16 v13, 0x41980000    # 19.0f

    .line 193
    .line 194
    const v14, 0x413947ae    # 11.58f

    .line 195
    .line 196
    .line 197
    const v15, 0x4193eb85    # 18.49f

    .line 198
    .line 199
    .line 200
    const v16, 0x412c7ae1    # 10.78f

    .line 201
    .line 202
    .line 203
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 204
    .line 205
    .line 206
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 207
    .line 208
    .line 209
    const/high16 v0, 0x41140000    # 9.25f

    .line 210
    .line 211
    const/high16 v2, 0x40f00000    # 7.5f

    .line 212
    .line 213
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 214
    .line 215
    .line 216
    const/high16 v0, 0x40b00000    # 5.5f

    .line 217
    .line 218
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 219
    .line 220
    .line 221
    const/high16 v17, 0x3fc00000    # 1.5f

    .line 222
    .line 223
    const/high16 v18, 0x3fc00000    # 1.5f

    .line 224
    .line 225
    const v13, 0x3f547ae1    # 0.83f

    .line 226
    .line 227
    .line 228
    const/4 v14, 0x0

    .line 229
    const/high16 v15, 0x3fc00000    # 1.5f

    .line 230
    .line 231
    const v16, 0x3f2b851f    # 0.67f

    .line 232
    .line 233
    .line 234
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 235
    .line 236
    .line 237
    const v0, 0x3f83d70a    # 1.03f

    .line 238
    .line 239
    .line 240
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 241
    .line 242
    .line 243
    const/high16 v17, 0x41600000    # 14.0f

    .line 244
    .line 245
    const/high16 v18, 0x41480000    # 12.5f

    .line 246
    .line 247
    const v13, 0x416fd70a    # 14.99f

    .line 248
    .line 249
    .line 250
    const v14, 0x41226666    # 10.15f

    .line 251
    .line 252
    .line 253
    const/high16 v15, 0x41600000    # 14.0f

    .line 254
    .line 255
    const v16, 0x41333333    # 11.2f

    .line 256
    .line 257
    .line 258
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 259
    .line 260
    .line 261
    const/high16 v0, 0x41500000    # 13.0f

    .line 262
    .line 263
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 264
    .line 265
    .line 266
    const/high16 v0, -0x3f800000    # -4.0f

    .line 267
    .line 268
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 269
    .line 270
    .line 271
    const/high16 v0, -0x41000000    # -0.5f

    .line 272
    .line 273
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 274
    .line 275
    .line 276
    const/high16 v17, -0x3ff00000    # -2.25f

    .line 277
    .line 278
    const v18, -0x3fe1eb85    # -2.47f

    .line 279
    .line 280
    .line 281
    const/4 v13, 0x0

    .line 282
    const v14, -0x4059999a    # -1.3f

    .line 283
    .line 284
    .line 285
    const v15, -0x40828f5c    # -0.99f

    .line 286
    .line 287
    .line 288
    const v16, -0x3fe9999a    # -2.35f

    .line 289
    .line 290
    .line 291
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 292
    .line 293
    .line 294
    const/high16 v0, 0x41100000    # 9.0f

    .line 295
    .line 296
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 297
    .line 298
    .line 299
    const/high16 v17, 0x41140000    # 9.25f

    .line 300
    .line 301
    const/high16 v18, 0x40f00000    # 7.5f

    .line 302
    .line 303
    const/high16 v13, 0x40f80000    # 7.75f

    .line 304
    .line 305
    const v14, 0x4102b852    # 8.17f

    .line 306
    .line 307
    .line 308
    const v15, 0x4106b852    # 8.42f

    .line 309
    .line 310
    .line 311
    const/high16 v16, 0x40f00000    # 7.5f

    .line 312
    .line 313
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 314
    .line 315
    .line 316
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 317
    .line 318
    .line 319
    const/high16 v0, 0x418c0000    # 17.5f

    .line 320
    .line 321
    const/high16 v2, 0x41800000    # 16.0f

    .line 322
    .line 323
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 324
    .line 325
    .line 326
    const/high16 v17, -0x41000000    # -0.5f

    .line 327
    .line 328
    const/high16 v18, 0x3f000000    # 0.5f

    .line 329
    .line 330
    const/4 v13, 0x0

    .line 331
    const v14, 0x3e8f5c29    # 0.28f

    .line 332
    .line 333
    .line 334
    const v15, -0x419eb852    # -0.22f

    .line 335
    .line 336
    .line 337
    const/high16 v16, 0x3f000000    # 0.5f

    .line 338
    .line 339
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 340
    .line 341
    .line 342
    const/high16 v0, 0x40e00000    # 7.0f

    .line 343
    .line 344
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 345
    .line 346
    .line 347
    const/high16 v18, -0x41000000    # -0.5f

    .line 348
    .line 349
    const v13, -0x4170a3d7    # -0.28f

    .line 350
    .line 351
    .line 352
    const/4 v14, 0x0

    .line 353
    const/high16 v15, -0x41000000    # -0.5f

    .line 354
    .line 355
    const v16, -0x419eb852    # -0.22f

    .line 356
    .line 357
    .line 358
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 359
    .line 360
    .line 361
    const/high16 v0, -0x3fa00000    # -3.5f

    .line 362
    .line 363
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 364
    .line 365
    .line 366
    const/high16 v17, 0x3f800000    # 1.0f

    .line 367
    .line 368
    const/high16 v18, -0x40800000    # -1.0f

    .line 369
    .line 370
    const/4 v13, 0x0

    .line 371
    const v14, -0x40f33333    # -0.55f

    .line 372
    .line 373
    .line 374
    const v15, 0x3ee66666    # 0.45f

    .line 375
    .line 376
    .line 377
    const/high16 v16, -0x40800000    # -1.0f

    .line 378
    .line 379
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 380
    .line 381
    .line 382
    const v0, 0x3ee66666    # 0.45f

    .line 383
    .line 384
    .line 385
    const/high16 v2, 0x3f800000    # 1.0f

    .line 386
    .line 387
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 388
    .line 389
    .line 390
    const/high16 v0, 0x40000000    # 2.0f

    .line 391
    .line 392
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 393
    .line 394
    .line 395
    const/high16 v0, 0x40e00000    # 7.0f

    .line 396
    .line 397
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 398
    .line 399
    .line 400
    const/high16 v0, -0x40000000    # -2.0f

    .line 401
    .line 402
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 403
    .line 404
    .line 405
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 406
    .line 407
    .line 408
    const/high16 v18, 0x3f800000    # 1.0f

    .line 409
    .line 410
    const v13, 0x3f0ccccd    # 0.55f

    .line 411
    .line 412
    .line 413
    const/4 v14, 0x0

    .line 414
    const/high16 v15, 0x3f800000    # 1.0f

    .line 415
    .line 416
    const v16, 0x3ee66666    # 0.45f

    .line 417
    .line 418
    .line 419
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 420
    .line 421
    .line 422
    const/high16 v0, 0x41800000    # 16.0f

    .line 423
    .line 424
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 425
    .line 426
    .line 427
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 428
    .line 429
    .line 430
    const/high16 v0, 0x41a00000    # 20.0f

    .line 431
    .line 432
    const/high16 v2, 0x40800000    # 4.0f

    .line 433
    .line 434
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 435
    .line 436
    .line 437
    const/high16 v0, 0x41800000    # 16.0f

    .line 438
    .line 439
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 440
    .line 441
    .line 442
    const/high16 v0, 0x40800000    # 4.0f

    .line 443
    .line 444
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 445
    .line 446
    .line 447
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 448
    .line 449
    .line 450
    const/high16 v0, 0x41a00000    # 20.0f

    .line 451
    .line 452
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 453
    .line 454
    .line 455
    const/high16 v0, 0x40000000    # 2.0f

    .line 456
    .line 457
    const/high16 v2, 0x41a00000    # 20.0f

    .line 458
    .line 459
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 460
    .line 461
    .line 462
    const/high16 v0, 0x40800000    # 4.0f

    .line 463
    .line 464
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 465
    .line 466
    .line 467
    const/high16 v17, 0x40000000    # 2.0f

    .line 468
    .line 469
    const/high16 v18, 0x40800000    # 4.0f

    .line 470
    .line 471
    const v13, 0x4039999a    # 2.9f

    .line 472
    .line 473
    .line 474
    const/high16 v14, 0x40000000    # 2.0f

    .line 475
    .line 476
    const/high16 v15, 0x40000000    # 2.0f

    .line 477
    .line 478
    const v16, 0x4039999a    # 2.9f

    .line 479
    .line 480
    .line 481
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 482
    .line 483
    .line 484
    const/high16 v0, 0x41800000    # 16.0f

    .line 485
    .line 486
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 487
    .line 488
    .line 489
    const/high16 v18, 0x40000000    # 2.0f

    .line 490
    .line 491
    const/4 v13, 0x0

    .line 492
    const v14, 0x3f8ccccd    # 1.1f

    .line 493
    .line 494
    .line 495
    const v15, 0x3f666666    # 0.9f

    .line 496
    .line 497
    .line 498
    const/high16 v16, 0x40000000    # 2.0f

    .line 499
    .line 500
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 501
    .line 502
    .line 503
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 504
    .line 505
    .line 506
    const/high16 v18, -0x40000000    # -2.0f

    .line 507
    .line 508
    const v13, 0x3f8ccccd    # 1.1f

    .line 509
    .line 510
    .line 511
    const/4 v14, 0x0

    .line 512
    const/high16 v15, 0x40000000    # 2.0f

    .line 513
    .line 514
    const v16, -0x4099999a    # -0.9f

    .line 515
    .line 516
    .line 517
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 518
    .line 519
    .line 520
    const/high16 v0, 0x40800000    # 4.0f

    .line 521
    .line 522
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 523
    .line 524
    .line 525
    const/high16 v17, 0x41a00000    # 20.0f

    .line 526
    .line 527
    const/high16 v18, 0x40000000    # 2.0f

    .line 528
    .line 529
    const/high16 v13, 0x41b00000    # 22.0f

    .line 530
    .line 531
    const v14, 0x4039999a    # 2.9f

    .line 532
    .line 533
    .line 534
    const v15, 0x41a8cccd    # 21.1f

    .line 535
    .line 536
    .line 537
    const/high16 v16, 0x40000000    # 2.0f

    .line 538
    .line 539
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 540
    .line 541
    .line 542
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 543
    .line 544
    .line 545
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 546
    .line 547
    .line 548
    move-result-object v2

    .line 549
    const/16 v16, 0x3800

    .line 550
    .line 551
    const/16 v17, 0x0

    .line 552
    .line 553
    const/high16 v6, 0x3f800000    # 1.0f

    .line 554
    .line 555
    const/high16 v8, 0x3f800000    # 1.0f

    .line 556
    .line 557
    const/4 v7, 0x0

    .line 558
    const/high16 v9, 0x3f800000    # 1.0f

    .line 559
    .line 560
    const/high16 v12, 0x3f800000    # 1.0f

    .line 561
    .line 562
    const/4 v13, 0x0

    .line 563
    const/4 v14, 0x0

    .line 564
    const/4 v15, 0x0

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
    sput-object v0, Landroidx/compose/material/icons/outlined/LivingKt;->_living:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 576
    .line 577
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 578
    .line 579
    .line 580
    return-object v0
.end method
