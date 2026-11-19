.class public final Landroidx/compose/material/icons/rounded/_9kPlusKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static __9kPlus:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final get_9kPlus(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/_9kPlusKt;->__9kPlus:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded._9kPlus"

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
    const/high16 v0, 0x40f00000    # 7.5f

    .line 71
    .line 72
    const/high16 v2, 0x41200000    # 10.0f

    .line 73
    .line 74
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v0, 0x3f800000    # 1.0f

    .line 78
    .line 79
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 80
    .line 81
    .line 82
    const/high16 v0, 0x3fc00000    # 1.5f

    .line 83
    .line 84
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 85
    .line 86
    .line 87
    const/high16 v0, -0x40800000    # -1.0f

    .line 88
    .line 89
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 90
    .line 91
    .line 92
    const/high16 v0, 0x41200000    # 10.0f

    .line 93
    .line 94
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 95
    .line 96
    .line 97
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 98
    .line 99
    .line 100
    const/high16 v0, 0x41980000    # 19.0f

    .line 101
    .line 102
    const/high16 v2, 0x40400000    # 3.0f

    .line 103
    .line 104
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 105
    .line 106
    .line 107
    const/high16 v0, 0x40a00000    # 5.0f

    .line 108
    .line 109
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 110
    .line 111
    .line 112
    const/high16 v17, 0x40400000    # 3.0f

    .line 113
    .line 114
    const/high16 v18, 0x40a00000    # 5.0f

    .line 115
    .line 116
    const v13, 0x4079999a    # 3.9f

    .line 117
    .line 118
    .line 119
    const/high16 v14, 0x40400000    # 3.0f

    .line 120
    .line 121
    const/high16 v15, 0x40400000    # 3.0f

    .line 122
    .line 123
    const v16, 0x4079999a    # 3.9f

    .line 124
    .line 125
    .line 126
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 127
    .line 128
    .line 129
    const/high16 v0, 0x41600000    # 14.0f

    .line 130
    .line 131
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 132
    .line 133
    .line 134
    const/high16 v17, 0x40000000    # 2.0f

    .line 135
    .line 136
    const/high16 v18, 0x40000000    # 2.0f

    .line 137
    .line 138
    const/4 v13, 0x0

    .line 139
    const v14, 0x3f8ccccd    # 1.1f

    .line 140
    .line 141
    .line 142
    const v15, 0x3f666666    # 0.9f

    .line 143
    .line 144
    .line 145
    const/high16 v16, 0x40000000    # 2.0f

    .line 146
    .line 147
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 148
    .line 149
    .line 150
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 151
    .line 152
    .line 153
    const/high16 v18, -0x40000000    # -2.0f

    .line 154
    .line 155
    const v13, 0x3f8ccccd    # 1.1f

    .line 156
    .line 157
    .line 158
    const/4 v14, 0x0

    .line 159
    const/high16 v15, 0x40000000    # 2.0f

    .line 160
    .line 161
    const v16, -0x4099999a    # -0.9f

    .line 162
    .line 163
    .line 164
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 165
    .line 166
    .line 167
    const/high16 v0, 0x40a00000    # 5.0f

    .line 168
    .line 169
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 170
    .line 171
    .line 172
    const/high16 v17, 0x41980000    # 19.0f

    .line 173
    .line 174
    const/high16 v18, 0x40400000    # 3.0f

    .line 175
    .line 176
    const/high16 v13, 0x41a80000    # 21.0f

    .line 177
    .line 178
    const v14, 0x4079999a    # 3.9f

    .line 179
    .line 180
    .line 181
    const v15, 0x41a0cccd    # 20.1f

    .line 182
    .line 183
    .line 184
    const/high16 v16, 0x40400000    # 3.0f

    .line 185
    .line 186
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 187
    .line 188
    .line 189
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 190
    .line 191
    .line 192
    const/high16 v0, 0x41600000    # 14.0f

    .line 193
    .line 194
    const/high16 v2, 0x41200000    # 10.0f

    .line 195
    .line 196
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 197
    .line 198
    .line 199
    const/high16 v17, -0x40800000    # -1.0f

    .line 200
    .line 201
    const/high16 v18, 0x3f800000    # 1.0f

    .line 202
    .line 203
    const/4 v13, 0x0

    .line 204
    const v14, 0x3f0ccccd    # 0.55f

    .line 205
    .line 206
    .line 207
    const v15, -0x4119999a    # -0.45f

    .line 208
    .line 209
    .line 210
    const/high16 v16, 0x3f800000    # 1.0f

    .line 211
    .line 212
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 213
    .line 214
    .line 215
    const/high16 v0, 0x40d80000    # 6.75f

    .line 216
    .line 217
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 218
    .line 219
    .line 220
    const/high16 v17, 0x40c00000    # 6.0f

    .line 221
    .line 222
    const/high16 v18, 0x41640000    # 14.25f

    .line 223
    .line 224
    const v13, 0x40cae148    # 6.34f

    .line 225
    .line 226
    .line 227
    const/high16 v14, 0x41700000    # 15.0f

    .line 228
    .line 229
    const/high16 v15, 0x40c00000    # 6.0f

    .line 230
    .line 231
    const v16, 0x416a8f5c    # 14.66f

    .line 232
    .line 233
    .line 234
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 235
    .line 236
    .line 237
    const/4 v0, 0x0

    .line 238
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 239
    .line 240
    .line 241
    const/high16 v17, 0x3f400000    # 0.75f

    .line 242
    .line 243
    const/high16 v18, -0x40c00000    # -0.75f

    .line 244
    .line 245
    const/4 v13, 0x0

    .line 246
    const v14, -0x412e147b    # -0.41f

    .line 247
    .line 248
    .line 249
    const v15, 0x3eae147b    # 0.34f

    .line 250
    .line 251
    .line 252
    const/high16 v16, -0x40c00000    # -0.75f

    .line 253
    .line 254
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 255
    .line 256
    .line 257
    const/high16 v0, 0x41080000    # 8.5f

    .line 258
    .line 259
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 260
    .line 261
    .line 262
    const/high16 v0, -0x40800000    # -1.0f

    .line 263
    .line 264
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 265
    .line 266
    .line 267
    const/high16 v0, 0x40e00000    # 7.0f

    .line 268
    .line 269
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 270
    .line 271
    .line 272
    const/high16 v17, -0x40800000    # -1.0f

    .line 273
    .line 274
    const/high16 v18, -0x40800000    # -1.0f

    .line 275
    .line 276
    const v13, -0x40f33333    # -0.55f

    .line 277
    .line 278
    .line 279
    const/4 v14, 0x0

    .line 280
    const/high16 v15, -0x40800000    # -1.0f

    .line 281
    .line 282
    const v16, -0x4119999a    # -0.45f

    .line 283
    .line 284
    .line 285
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 286
    .line 287
    .line 288
    const/high16 v0, 0x41200000    # 10.0f

    .line 289
    .line 290
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 291
    .line 292
    .line 293
    const/high16 v17, 0x3f800000    # 1.0f

    .line 294
    .line 295
    const/4 v13, 0x0

    .line 296
    const v14, -0x40f33333    # -0.55f

    .line 297
    .line 298
    .line 299
    const v15, 0x3ee66666    # 0.45f

    .line 300
    .line 301
    .line 302
    const/high16 v16, -0x40800000    # -1.0f

    .line 303
    .line 304
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 305
    .line 306
    .line 307
    const/high16 v0, 0x40000000    # 2.0f

    .line 308
    .line 309
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 310
    .line 311
    .line 312
    const/high16 v18, 0x3f800000    # 1.0f

    .line 313
    .line 314
    const v13, 0x3f0ccccd    # 0.55f

    .line 315
    .line 316
    .line 317
    const/4 v14, 0x0

    .line 318
    const/high16 v15, 0x3f800000    # 1.0f

    .line 319
    .line 320
    const v16, 0x3ee66666    # 0.45f

    .line 321
    .line 322
    .line 323
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 324
    .line 325
    .line 326
    const/high16 v0, 0x41600000    # 14.0f

    .line 327
    .line 328
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 329
    .line 330
    .line 331
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 332
    .line 333
    .line 334
    const/high16 v0, 0x41700000    # 15.0f

    .line 335
    .line 336
    const v2, 0x416970a4    # 14.59f

    .line 337
    .line 338
    .line 339
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 340
    .line 341
    .line 342
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 343
    .line 344
    .line 345
    const v17, -0x40f33333    # -0.55f

    .line 346
    .line 347
    .line 348
    const v18, -0x4175c28f    # -0.27f

    .line 349
    .line 350
    .line 351
    const v13, -0x419eb852    # -0.22f

    .line 352
    .line 353
    .line 354
    const v15, -0x4128f5c3    # -0.42f

    .line 355
    .line 356
    .line 357
    const v16, -0x42333333    # -0.1f

    .line 358
    .line 359
    .line 360
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 361
    .line 362
    .line 363
    const v0, -0x403ae148    # -1.54f

    .line 364
    .line 365
    .line 366
    const v2, -0x40028f5c    # -1.98f

    .line 367
    .line 368
    .line 369
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 370
    .line 371
    .line 372
    const v0, 0x3fc66666    # 1.55f

    .line 373
    .line 374
    .line 375
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 376
    .line 377
    .line 378
    const v17, -0x40cccccd    # -0.7f

    .line 379
    .line 380
    .line 381
    const v18, 0x3f333333    # 0.7f

    .line 382
    .line 383
    .line 384
    const/4 v13, 0x0

    .line 385
    const v14, 0x3ec7ae14    # 0.39f

    .line 386
    .line 387
    .line 388
    const v15, -0x416147ae    # -0.31f

    .line 389
    .line 390
    .line 391
    const v16, 0x3f333333    # 0.7f

    .line 392
    .line 393
    .line 394
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 395
    .line 396
    .line 397
    const v0, 0x413b3333    # 11.7f

    .line 398
    .line 399
    .line 400
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 401
    .line 402
    .line 403
    const v18, -0x40cccccd    # -0.7f

    .line 404
    .line 405
    .line 406
    const v13, -0x413851ec    # -0.39f

    .line 407
    .line 408
    .line 409
    const/4 v14, 0x0

    .line 410
    const v15, -0x40cccccd    # -0.7f

    .line 411
    .line 412
    .line 413
    const v16, -0x416147ae    # -0.31f

    .line 414
    .line 415
    .line 416
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 417
    .line 418
    .line 419
    const v0, 0x411b3333    # 9.7f

    .line 420
    .line 421
    .line 422
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 423
    .line 424
    .line 425
    const v17, 0x413b3333    # 11.7f

    .line 426
    .line 427
    .line 428
    const/high16 v18, 0x41100000    # 9.0f

    .line 429
    .line 430
    const/high16 v13, 0x41300000    # 11.0f

    .line 431
    .line 432
    const v14, 0x4114f5c3    # 9.31f

    .line 433
    .line 434
    .line 435
    const v15, 0x4134f5c3    # 11.31f

    .line 436
    .line 437
    .line 438
    const/high16 v16, 0x41100000    # 9.0f

    .line 439
    .line 440
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 441
    .line 442
    .line 443
    const v0, 0x3db851ec    # 0.09f

    .line 444
    .line 445
    .line 446
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 447
    .line 448
    .line 449
    const v17, 0x3f333333    # 0.7f

    .line 450
    .line 451
    .line 452
    const v18, 0x3f333333    # 0.7f

    .line 453
    .line 454
    .line 455
    const v13, 0x3ec7ae14    # 0.39f

    .line 456
    .line 457
    .line 458
    const/4 v14, 0x0

    .line 459
    const v15, 0x3f333333    # 0.7f

    .line 460
    .line 461
    .line 462
    const v16, 0x3e9eb852    # 0.31f

    .line 463
    .line 464
    .line 465
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 466
    .line 467
    .line 468
    const v0, 0x3fc66666    # 1.55f

    .line 469
    .line 470
    .line 471
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 472
    .line 473
    .line 474
    const v0, 0x3fc51eb8    # 1.54f

    .line 475
    .line 476
    .line 477
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 478
    .line 479
    .line 480
    const v17, 0x416970a4    # 14.59f

    .line 481
    .line 482
    .line 483
    const/high16 v18, 0x41100000    # 9.0f

    .line 484
    .line 485
    const v13, 0x4162b852    # 14.17f

    .line 486
    .line 487
    .line 488
    const v14, 0x4111999a    # 9.1f

    .line 489
    .line 490
    .line 491
    const v15, 0x4166147b    # 14.38f

    .line 492
    .line 493
    .line 494
    const/high16 v16, 0x41100000    # 9.0f

    .line 495
    .line 496
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 497
    .line 498
    .line 499
    const/4 v0, 0x0

    .line 500
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 501
    .line 502
    .line 503
    const v17, 0x3f0f5c29    # 0.56f

    .line 504
    .line 505
    .line 506
    const v18, 0x3f8f5c29    # 1.12f

    .line 507
    .line 508
    .line 509
    const v13, 0x3f147ae1    # 0.58f

    .line 510
    .line 511
    .line 512
    const/4 v14, 0x0

    .line 513
    const v15, 0x3f68f5c3    # 0.91f

    .line 514
    .line 515
    .line 516
    const v16, 0x3f28f5c3    # 0.66f

    .line 517
    .line 518
    .line 519
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 520
    .line 521
    .line 522
    const/high16 v0, 0x415c0000    # 13.75f

    .line 523
    .line 524
    const/high16 v2, 0x41400000    # 12.0f

    .line 525
    .line 526
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 527
    .line 528
    .line 529
    const v0, 0x3fb47ae1    # 1.41f

    .line 530
    .line 531
    .line 532
    const v2, 0x3ff0a3d7    # 1.88f

    .line 533
    .line 534
    .line 535
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 536
    .line 537
    .line 538
    const v17, 0x416970a4    # 14.59f

    .line 539
    .line 540
    .line 541
    const/high16 v18, 0x41700000    # 15.0f

    .line 542
    .line 543
    const/high16 v13, 0x41780000    # 15.5f

    .line 544
    .line 545
    const v14, 0x416570a4    # 14.34f

    .line 546
    .line 547
    .line 548
    const v15, 0x4172b852    # 15.17f

    .line 549
    .line 550
    .line 551
    const/high16 v16, 0x41700000    # 15.0f

    .line 552
    .line 553
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 554
    .line 555
    .line 556
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 557
    .line 558
    .line 559
    const/high16 v0, 0x41940000    # 18.5f

    .line 560
    .line 561
    const/high16 v2, 0x41480000    # 12.5f

    .line 562
    .line 563
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 564
    .line 565
    .line 566
    const/high16 v0, -0x40800000    # -1.0f

    .line 567
    .line 568
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 569
    .line 570
    .line 571
    const/high16 v0, 0x3f800000    # 1.0f

    .line 572
    .line 573
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 574
    .line 575
    .line 576
    const/high16 v17, -0x41000000    # -0.5f

    .line 577
    .line 578
    const/high16 v18, 0x3f000000    # 0.5f

    .line 579
    .line 580
    const/4 v13, 0x0

    .line 581
    const v14, 0x3e8f5c29    # 0.28f

    .line 582
    .line 583
    .line 584
    const v15, -0x419eb852    # -0.22f

    .line 585
    .line 586
    .line 587
    const/high16 v16, 0x3f000000    # 0.5f

    .line 588
    .line 589
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 590
    .line 591
    .line 592
    const/4 v0, 0x0

    .line 593
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 594
    .line 595
    .line 596
    const/high16 v18, -0x41000000    # -0.5f

    .line 597
    .line 598
    const v13, -0x4170a3d7    # -0.28f

    .line 599
    .line 600
    .line 601
    const/4 v14, 0x0

    .line 602
    const/high16 v15, -0x41000000    # -0.5f

    .line 603
    .line 604
    const v16, -0x419eb852    # -0.22f

    .line 605
    .line 606
    .line 607
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 608
    .line 609
    .line 610
    const/high16 v0, -0x40800000    # -1.0f

    .line 611
    .line 612
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 613
    .line 614
    .line 615
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 616
    .line 617
    .line 618
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 619
    .line 620
    .line 621
    const/4 v0, 0x0

    .line 622
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 623
    .line 624
    .line 625
    const/high16 v17, 0x3f000000    # 0.5f

    .line 626
    .line 627
    const/4 v13, 0x0

    .line 628
    const v14, -0x4170a3d7    # -0.28f

    .line 629
    .line 630
    .line 631
    const v15, 0x3e6147ae    # 0.22f

    .line 632
    .line 633
    .line 634
    const/high16 v16, -0x41000000    # -0.5f

    .line 635
    .line 636
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 637
    .line 638
    .line 639
    const/high16 v0, 0x3f800000    # 1.0f

    .line 640
    .line 641
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 642
    .line 643
    .line 644
    const/high16 v0, -0x40800000    # -1.0f

    .line 645
    .line 646
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 647
    .line 648
    .line 649
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 650
    .line 651
    .line 652
    const/4 v0, 0x0

    .line 653
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 654
    .line 655
    .line 656
    const/high16 v18, 0x3f000000    # 0.5f

    .line 657
    .line 658
    const v13, 0x3e8f5c29    # 0.28f

    .line 659
    .line 660
    .line 661
    const/4 v14, 0x0

    .line 662
    const/high16 v15, 0x3f000000    # 0.5f

    .line 663
    .line 664
    const v16, 0x3e6147ae    # 0.22f

    .line 665
    .line 666
    .line 667
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 668
    .line 669
    .line 670
    const/high16 v0, 0x3f800000    # 1.0f

    .line 671
    .line 672
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 673
    .line 674
    .line 675
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 676
    .line 677
    .line 678
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 679
    .line 680
    .line 681
    const/4 v0, 0x0

    .line 682
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 683
    .line 684
    .line 685
    const/high16 v17, 0x41940000    # 18.5f

    .line 686
    .line 687
    const/high16 v18, 0x41480000    # 12.5f

    .line 688
    .line 689
    const/high16 v13, 0x41980000    # 19.0f

    .line 690
    .line 691
    const v14, 0x41447ae1    # 12.28f

    .line 692
    .line 693
    .line 694
    const v15, 0x41963d71    # 18.78f

    .line 695
    .line 696
    .line 697
    const/high16 v16, 0x41480000    # 12.5f

    .line 698
    .line 699
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 700
    .line 701
    .line 702
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 703
    .line 704
    .line 705
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 706
    .line 707
    .line 708
    move-result-object v2

    .line 709
    const/16 v16, 0x3800

    .line 710
    .line 711
    const/16 v17, 0x0

    .line 712
    .line 713
    const/high16 v6, 0x3f800000    # 1.0f

    .line 714
    .line 715
    const/high16 v8, 0x3f800000    # 1.0f

    .line 716
    .line 717
    const/4 v7, 0x0

    .line 718
    const/high16 v9, 0x3f800000    # 1.0f

    .line 719
    .line 720
    const/high16 v12, 0x3f800000    # 1.0f

    .line 721
    .line 722
    const/4 v13, 0x0

    .line 723
    const/4 v14, 0x0

    .line 724
    const/4 v15, 0x0

    .line 725
    const-string v4, ""

    .line 726
    .line 727
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 728
    .line 729
    .line 730
    move-result-object v0

    .line 731
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 732
    .line 733
    .line 734
    move-result-object v0

    .line 735
    sput-object v0, Landroidx/compose/material/icons/rounded/_9kPlusKt;->__9kPlus:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 736
    .line 737
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 738
    .line 739
    .line 740
    return-object v0
.end method
