.class public final Landroidx/compose/material/icons/rounded/_9kKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static __9k:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final get_9k(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/_9kKt;->__9k:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded._9k"

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
    const/high16 v0, 0x41000000    # 8.0f

    .line 71
    .line 72
    const/high16 v2, 0x41200000    # 10.0f

    .line 73
    .line 74
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v0, 0x3fc00000    # 1.5f

    .line 78
    .line 79
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 80
    .line 81
    .line 82
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 83
    .line 84
    .line 85
    const/high16 v0, 0x41000000    # 8.0f

    .line 86
    .line 87
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 88
    .line 89
    .line 90
    const/high16 v0, 0x41200000    # 10.0f

    .line 91
    .line 92
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 93
    .line 94
    .line 95
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 96
    .line 97
    .line 98
    const/high16 v0, 0x41980000    # 19.0f

    .line 99
    .line 100
    const/high16 v2, 0x40400000    # 3.0f

    .line 101
    .line 102
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 103
    .line 104
    .line 105
    const/high16 v0, 0x40a00000    # 5.0f

    .line 106
    .line 107
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 108
    .line 109
    .line 110
    const/high16 v17, 0x40400000    # 3.0f

    .line 111
    .line 112
    const/high16 v18, 0x40a00000    # 5.0f

    .line 113
    .line 114
    const v13, 0x4079999a    # 3.9f

    .line 115
    .line 116
    .line 117
    const/high16 v14, 0x40400000    # 3.0f

    .line 118
    .line 119
    const/high16 v15, 0x40400000    # 3.0f

    .line 120
    .line 121
    const v16, 0x4079999a    # 3.9f

    .line 122
    .line 123
    .line 124
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 125
    .line 126
    .line 127
    const/high16 v0, 0x41600000    # 14.0f

    .line 128
    .line 129
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 130
    .line 131
    .line 132
    const/high16 v17, 0x40000000    # 2.0f

    .line 133
    .line 134
    const/high16 v18, 0x40000000    # 2.0f

    .line 135
    .line 136
    const/4 v13, 0x0

    .line 137
    const v14, 0x3f8ccccd    # 1.1f

    .line 138
    .line 139
    .line 140
    const v15, 0x3f666666    # 0.9f

    .line 141
    .line 142
    .line 143
    const/high16 v16, 0x40000000    # 2.0f

    .line 144
    .line 145
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 146
    .line 147
    .line 148
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 149
    .line 150
    .line 151
    const/high16 v18, -0x40000000    # -2.0f

    .line 152
    .line 153
    const v13, 0x3f8ccccd    # 1.1f

    .line 154
    .line 155
    .line 156
    const/4 v14, 0x0

    .line 157
    const/high16 v15, 0x40000000    # 2.0f

    .line 158
    .line 159
    const v16, -0x4099999a    # -0.9f

    .line 160
    .line 161
    .line 162
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 163
    .line 164
    .line 165
    const/high16 v0, 0x40a00000    # 5.0f

    .line 166
    .line 167
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 168
    .line 169
    .line 170
    const/high16 v17, 0x41980000    # 19.0f

    .line 171
    .line 172
    const/high16 v18, 0x40400000    # 3.0f

    .line 173
    .line 174
    const/high16 v13, 0x41a80000    # 21.0f

    .line 175
    .line 176
    const v14, 0x4079999a    # 3.9f

    .line 177
    .line 178
    .line 179
    const v15, 0x41a0cccd    # 20.1f

    .line 180
    .line 181
    .line 182
    const/high16 v16, 0x40400000    # 3.0f

    .line 183
    .line 184
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 185
    .line 186
    .line 187
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 188
    .line 189
    .line 190
    const/high16 v0, 0x41300000    # 11.0f

    .line 191
    .line 192
    const/high16 v2, 0x41600000    # 14.0f

    .line 193
    .line 194
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 195
    .line 196
    .line 197
    const/high16 v17, -0x40800000    # -1.0f

    .line 198
    .line 199
    const/high16 v18, 0x3f800000    # 1.0f

    .line 200
    .line 201
    const/4 v13, 0x0

    .line 202
    const v14, 0x3f0ccccd    # 0.55f

    .line 203
    .line 204
    .line 205
    const v15, -0x4119999a    # -0.45f

    .line 206
    .line 207
    .line 208
    const/high16 v16, 0x3f800000    # 1.0f

    .line 209
    .line 210
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 211
    .line 212
    .line 213
    const/high16 v0, 0x40e80000    # 7.25f

    .line 214
    .line 215
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 216
    .line 217
    .line 218
    const/high16 v17, -0x40c00000    # -0.75f

    .line 219
    .line 220
    const/high16 v18, -0x40c00000    # -0.75f

    .line 221
    .line 222
    const v13, -0x412e147b    # -0.41f

    .line 223
    .line 224
    .line 225
    const/4 v14, 0x0

    .line 226
    const/high16 v15, -0x40c00000    # -0.75f

    .line 227
    .line 228
    const v16, -0x4151eb85    # -0.34f

    .line 229
    .line 230
    .line 231
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 232
    .line 233
    .line 234
    const/4 v0, 0x0

    .line 235
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 236
    .line 237
    .line 238
    const/high16 v17, 0x3f400000    # 0.75f

    .line 239
    .line 240
    const/4 v13, 0x0

    .line 241
    const v14, -0x412e147b    # -0.41f

    .line 242
    .line 243
    .line 244
    const v15, 0x3eae147b    # 0.34f

    .line 245
    .line 246
    .line 247
    const/high16 v16, -0x40c00000    # -0.75f

    .line 248
    .line 249
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 250
    .line 251
    .line 252
    const/high16 v0, 0x41180000    # 9.5f

    .line 253
    .line 254
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 255
    .line 256
    .line 257
    const/high16 v0, -0x40800000    # -1.0f

    .line 258
    .line 259
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 260
    .line 261
    .line 262
    const/high16 v0, -0x40000000    # -2.0f

    .line 263
    .line 264
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 265
    .line 266
    .line 267
    const/high16 v17, -0x40800000    # -1.0f

    .line 268
    .line 269
    const/high16 v18, -0x40800000    # -1.0f

    .line 270
    .line 271
    const v13, -0x40f33333    # -0.55f

    .line 272
    .line 273
    .line 274
    const/4 v14, 0x0

    .line 275
    const/high16 v15, -0x40800000    # -1.0f

    .line 276
    .line 277
    const v16, -0x4119999a    # -0.45f

    .line 278
    .line 279
    .line 280
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 281
    .line 282
    .line 283
    const/high16 v0, 0x41200000    # 10.0f

    .line 284
    .line 285
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 286
    .line 287
    .line 288
    const/high16 v17, 0x3f800000    # 1.0f

    .line 289
    .line 290
    const/4 v13, 0x0

    .line 291
    const v14, -0x40f33333    # -0.55f

    .line 292
    .line 293
    .line 294
    const v15, 0x3ee66666    # 0.45f

    .line 295
    .line 296
    .line 297
    const/high16 v16, -0x40800000    # -1.0f

    .line 298
    .line 299
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 300
    .line 301
    .line 302
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 303
    .line 304
    .line 305
    const/high16 v18, 0x3f800000    # 1.0f

    .line 306
    .line 307
    const v13, 0x3f0ccccd    # 0.55f

    .line 308
    .line 309
    .line 310
    const/4 v14, 0x0

    .line 311
    const/high16 v15, 0x3f800000    # 1.0f

    .line 312
    .line 313
    const v16, 0x3ee66666    # 0.45f

    .line 314
    .line 315
    .line 316
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 317
    .line 318
    .line 319
    const/high16 v0, 0x41600000    # 14.0f

    .line 320
    .line 321
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 322
    .line 323
    .line 324
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 325
    .line 326
    .line 327
    const/high16 v0, 0x41700000    # 15.0f

    .line 328
    .line 329
    const v2, 0x4184b852    # 16.59f

    .line 330
    .line 331
    .line 332
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 333
    .line 334
    .line 335
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 336
    .line 337
    .line 338
    const v17, -0x40f33333    # -0.55f

    .line 339
    .line 340
    .line 341
    const v18, -0x4175c28f    # -0.27f

    .line 342
    .line 343
    .line 344
    const v13, -0x419eb852    # -0.22f

    .line 345
    .line 346
    .line 347
    const v15, -0x4128f5c3    # -0.42f

    .line 348
    .line 349
    .line 350
    const v16, -0x42333333    # -0.1f

    .line 351
    .line 352
    .line 353
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 354
    .line 355
    .line 356
    const v0, -0x403ae148    # -1.54f

    .line 357
    .line 358
    .line 359
    const v2, -0x40028f5c    # -1.98f

    .line 360
    .line 361
    .line 362
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 363
    .line 364
    .line 365
    const v0, 0x3fc66666    # 1.55f

    .line 366
    .line 367
    .line 368
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 369
    .line 370
    .line 371
    const v17, -0x40cccccd    # -0.7f

    .line 372
    .line 373
    .line 374
    const v18, 0x3f333333    # 0.7f

    .line 375
    .line 376
    .line 377
    const/4 v13, 0x0

    .line 378
    const v14, 0x3ec7ae14    # 0.39f

    .line 379
    .line 380
    .line 381
    const v15, -0x416147ae    # -0.31f

    .line 382
    .line 383
    .line 384
    const v16, 0x3f333333    # 0.7f

    .line 385
    .line 386
    .line 387
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 388
    .line 389
    .line 390
    const v0, 0x415b3333    # 13.7f

    .line 391
    .line 392
    .line 393
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 394
    .line 395
    .line 396
    const v18, -0x40cccccd    # -0.7f

    .line 397
    .line 398
    .line 399
    const v13, -0x413851ec    # -0.39f

    .line 400
    .line 401
    .line 402
    const/4 v14, 0x0

    .line 403
    const v15, -0x40cccccd    # -0.7f

    .line 404
    .line 405
    .line 406
    const v16, -0x416147ae    # -0.31f

    .line 407
    .line 408
    .line 409
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 410
    .line 411
    .line 412
    const v0, 0x411b3333    # 9.7f

    .line 413
    .line 414
    .line 415
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 416
    .line 417
    .line 418
    const v17, 0x415b3333    # 13.7f

    .line 419
    .line 420
    .line 421
    const/high16 v18, 0x41100000    # 9.0f

    .line 422
    .line 423
    const/high16 v13, 0x41500000    # 13.0f

    .line 424
    .line 425
    const v14, 0x4114f5c3    # 9.31f

    .line 426
    .line 427
    .line 428
    const v15, 0x4154f5c3    # 13.31f

    .line 429
    .line 430
    .line 431
    const/high16 v16, 0x41100000    # 9.0f

    .line 432
    .line 433
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 434
    .line 435
    .line 436
    const v0, 0x3db851ec    # 0.09f

    .line 437
    .line 438
    .line 439
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 440
    .line 441
    .line 442
    const v17, 0x3f333333    # 0.7f

    .line 443
    .line 444
    .line 445
    const v18, 0x3f333333    # 0.7f

    .line 446
    .line 447
    .line 448
    const v13, 0x3ec7ae14    # 0.39f

    .line 449
    .line 450
    .line 451
    const/4 v14, 0x0

    .line 452
    const v15, 0x3f333333    # 0.7f

    .line 453
    .line 454
    .line 455
    const v16, 0x3e9eb852    # 0.31f

    .line 456
    .line 457
    .line 458
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 459
    .line 460
    .line 461
    const v0, 0x3fc66666    # 1.55f

    .line 462
    .line 463
    .line 464
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 465
    .line 466
    .line 467
    const v0, 0x3fc51eb8    # 1.54f

    .line 468
    .line 469
    .line 470
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 471
    .line 472
    .line 473
    const v17, 0x4184b852    # 16.59f

    .line 474
    .line 475
    .line 476
    const/high16 v18, 0x41100000    # 9.0f

    .line 477
    .line 478
    const v13, 0x41815c29    # 16.17f

    .line 479
    .line 480
    .line 481
    const v14, 0x4111999a    # 9.1f

    .line 482
    .line 483
    .line 484
    const v15, 0x41830a3d    # 16.38f

    .line 485
    .line 486
    .line 487
    const/high16 v16, 0x41100000    # 9.0f

    .line 488
    .line 489
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 490
    .line 491
    .line 492
    const/4 v0, 0x0

    .line 493
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 494
    .line 495
    .line 496
    const v17, 0x3f0f5c29    # 0.56f

    .line 497
    .line 498
    .line 499
    const v18, 0x3f8f5c29    # 1.12f

    .line 500
    .line 501
    .line 502
    const v13, 0x3f147ae1    # 0.58f

    .line 503
    .line 504
    .line 505
    const/4 v14, 0x0

    .line 506
    const v15, 0x3f68f5c3    # 0.91f

    .line 507
    .line 508
    .line 509
    const v16, 0x3f28f5c3    # 0.66f

    .line 510
    .line 511
    .line 512
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 513
    .line 514
    .line 515
    const/high16 v0, 0x417c0000    # 15.75f

    .line 516
    .line 517
    const/high16 v2, 0x41400000    # 12.0f

    .line 518
    .line 519
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 520
    .line 521
    .line 522
    const v0, 0x3fb47ae1    # 1.41f

    .line 523
    .line 524
    .line 525
    const v2, 0x3ff0a3d7    # 1.88f

    .line 526
    .line 527
    .line 528
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 529
    .line 530
    .line 531
    const v17, 0x4184b852    # 16.59f

    .line 532
    .line 533
    .line 534
    const/high16 v18, 0x41700000    # 15.0f

    .line 535
    .line 536
    const/high16 v13, 0x418c0000    # 17.5f

    .line 537
    .line 538
    const v14, 0x416570a4    # 14.34f

    .line 539
    .line 540
    .line 541
    const v15, 0x41895c29    # 17.17f

    .line 542
    .line 543
    .line 544
    const/high16 v16, 0x41700000    # 15.0f

    .line 545
    .line 546
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 547
    .line 548
    .line 549
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 550
    .line 551
    .line 552
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 553
    .line 554
    .line 555
    move-result-object v2

    .line 556
    const/16 v16, 0x3800

    .line 557
    .line 558
    const/16 v17, 0x0

    .line 559
    .line 560
    const/high16 v6, 0x3f800000    # 1.0f

    .line 561
    .line 562
    const/high16 v8, 0x3f800000    # 1.0f

    .line 563
    .line 564
    const/4 v7, 0x0

    .line 565
    const/high16 v9, 0x3f800000    # 1.0f

    .line 566
    .line 567
    const/high16 v12, 0x3f800000    # 1.0f

    .line 568
    .line 569
    const/4 v13, 0x0

    .line 570
    const/4 v14, 0x0

    .line 571
    const/4 v15, 0x0

    .line 572
    const-string v4, ""

    .line 573
    .line 574
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 575
    .line 576
    .line 577
    move-result-object v0

    .line 578
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 579
    .line 580
    .line 581
    move-result-object v0

    .line 582
    sput-object v0, Landroidx/compose/material/icons/rounded/_9kKt;->__9k:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 583
    .line 584
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 585
    .line 586
    .line 587
    return-object v0
.end method
