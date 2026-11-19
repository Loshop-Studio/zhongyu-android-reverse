.class public final Landroidx/compose/material/icons/rounded/ViewModuleKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _viewModule:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getViewModule(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/ViewModuleKt;->_viewModule:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.ViewModule"

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
    const v0, 0x416ab852    # 14.67f

    .line 71
    .line 72
    .line 73
    const/high16 v2, 0x40c00000    # 6.0f

    .line 74
    .line 75
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    const/high16 v0, 0x40900000    # 4.5f

    .line 79
    .line 80
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 81
    .line 82
    .line 83
    const/high16 v17, -0x40800000    # -1.0f

    .line 84
    .line 85
    const/high16 v18, 0x3f800000    # 1.0f

    .line 86
    .line 87
    const/4 v13, 0x0

    .line 88
    const v14, 0x3f0ccccd    # 0.55f

    .line 89
    .line 90
    .line 91
    const v15, -0x4119999a    # -0.45f

    .line 92
    .line 93
    .line 94
    const/high16 v16, 0x3f800000    # 1.0f

    .line 95
    .line 96
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 97
    .line 98
    .line 99
    const v0, -0x3faae148    # -3.33f

    .line 100
    .line 101
    .line 102
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 103
    .line 104
    .line 105
    const/high16 v18, -0x40800000    # -1.0f

    .line 106
    .line 107
    const v13, -0x40f33333    # -0.55f

    .line 108
    .line 109
    .line 110
    const/4 v14, 0x0

    .line 111
    const/high16 v15, -0x40800000    # -1.0f

    .line 112
    .line 113
    const v16, -0x4119999a    # -0.45f

    .line 114
    .line 115
    .line 116
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 117
    .line 118
    .line 119
    const/high16 v0, 0x40c00000    # 6.0f

    .line 120
    .line 121
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 122
    .line 123
    .line 124
    const/high16 v17, 0x3f800000    # 1.0f

    .line 125
    .line 126
    const/4 v13, 0x0

    .line 127
    const v14, -0x40f33333    # -0.55f

    .line 128
    .line 129
    .line 130
    const v15, 0x3ee66666    # 0.45f

    .line 131
    .line 132
    .line 133
    const/high16 v16, -0x40800000    # -1.0f

    .line 134
    .line 135
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 136
    .line 137
    .line 138
    const v0, 0x40551eb8    # 3.33f

    .line 139
    .line 140
    .line 141
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 142
    .line 143
    .line 144
    const v17, 0x416ab852    # 14.67f

    .line 145
    .line 146
    .line 147
    const/high16 v18, 0x40c00000    # 6.0f

    .line 148
    .line 149
    const v13, 0x4163851f    # 14.22f

    .line 150
    .line 151
    .line 152
    const/high16 v14, 0x40a00000    # 5.0f

    .line 153
    .line 154
    const v15, 0x416ab852    # 14.67f

    .line 155
    .line 156
    .line 157
    const v16, 0x40ae6666    # 5.45f

    .line 158
    .line 159
    .line 160
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 161
    .line 162
    .line 163
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 164
    .line 165
    .line 166
    const v0, 0x41855c29    # 16.67f

    .line 167
    .line 168
    .line 169
    const/high16 v2, 0x41380000    # 11.5f

    .line 170
    .line 171
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 172
    .line 173
    .line 174
    const/high16 v0, 0x41a00000    # 20.0f

    .line 175
    .line 176
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 177
    .line 178
    .line 179
    const/high16 v17, 0x3f800000    # 1.0f

    .line 180
    .line 181
    const/high16 v18, -0x40800000    # -1.0f

    .line 182
    .line 183
    const v13, 0x3f0ccccd    # 0.55f

    .line 184
    .line 185
    .line 186
    const/4 v14, 0x0

    .line 187
    const/high16 v15, 0x3f800000    # 1.0f

    .line 188
    .line 189
    const v16, -0x4119999a    # -0.45f

    .line 190
    .line 191
    .line 192
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 193
    .line 194
    .line 195
    const/high16 v0, 0x40c00000    # 6.0f

    .line 196
    .line 197
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 198
    .line 199
    .line 200
    const/high16 v17, -0x40800000    # -1.0f

    .line 201
    .line 202
    const/4 v13, 0x0

    .line 203
    const v14, -0x40f33333    # -0.55f

    .line 204
    .line 205
    .line 206
    const v15, -0x4119999a    # -0.45f

    .line 207
    .line 208
    .line 209
    const/high16 v16, -0x40800000    # -1.0f

    .line 210
    .line 211
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 212
    .line 213
    .line 214
    const v0, -0x3faae148    # -3.33f

    .line 215
    .line 216
    .line 217
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 218
    .line 219
    .line 220
    const/high16 v18, 0x3f800000    # 1.0f

    .line 221
    .line 222
    const v13, -0x40f33333    # -0.55f

    .line 223
    .line 224
    .line 225
    const/4 v14, 0x0

    .line 226
    const/high16 v15, -0x40800000    # -1.0f

    .line 227
    .line 228
    const v16, 0x3ee66666    # 0.45f

    .line 229
    .line 230
    .line 231
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 232
    .line 233
    .line 234
    const/high16 v0, 0x40900000    # 4.5f

    .line 235
    .line 236
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 237
    .line 238
    .line 239
    const v17, 0x41855c29    # 16.67f

    .line 240
    .line 241
    .line 242
    const/high16 v18, 0x41380000    # 11.5f

    .line 243
    .line 244
    const v13, 0x417ab852    # 15.67f

    .line 245
    .line 246
    .line 247
    const v14, 0x4130cccd    # 11.05f

    .line 248
    .line 249
    .line 250
    const v15, 0x4180e148    # 16.11f

    .line 251
    .line 252
    .line 253
    const/high16 v16, 0x41380000    # 11.5f

    .line 254
    .line 255
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 256
    .line 257
    .line 258
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 259
    .line 260
    .line 261
    const v0, 0x416ab852    # 14.67f

    .line 262
    .line 263
    .line 264
    const/high16 v2, 0x41900000    # 18.0f

    .line 265
    .line 266
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 267
    .line 268
    .line 269
    const/high16 v0, -0x3f700000    # -4.5f

    .line 270
    .line 271
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 272
    .line 273
    .line 274
    const/high16 v17, -0x40800000    # -1.0f

    .line 275
    .line 276
    const/high16 v18, -0x40800000    # -1.0f

    .line 277
    .line 278
    const/4 v13, 0x0

    .line 279
    const v14, -0x40f33333    # -0.55f

    .line 280
    .line 281
    .line 282
    const v15, -0x4119999a    # -0.45f

    .line 283
    .line 284
    .line 285
    const/high16 v16, -0x40800000    # -1.0f

    .line 286
    .line 287
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 288
    .line 289
    .line 290
    const v0, -0x3faae148    # -3.33f

    .line 291
    .line 292
    .line 293
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 294
    .line 295
    .line 296
    const/high16 v18, 0x3f800000    # 1.0f

    .line 297
    .line 298
    const v13, -0x40f33333    # -0.55f

    .line 299
    .line 300
    .line 301
    const/4 v14, 0x0

    .line 302
    const/high16 v15, -0x40800000    # -1.0f

    .line 303
    .line 304
    const v16, 0x3ee66666    # 0.45f

    .line 305
    .line 306
    .line 307
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 308
    .line 309
    .line 310
    const/high16 v0, 0x41900000    # 18.0f

    .line 311
    .line 312
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 313
    .line 314
    .line 315
    const/high16 v17, 0x3f800000    # 1.0f

    .line 316
    .line 317
    const/4 v13, 0x0

    .line 318
    const v14, 0x3f0ccccd    # 0.55f

    .line 319
    .line 320
    .line 321
    const v15, 0x3ee66666    # 0.45f

    .line 322
    .line 323
    .line 324
    const/high16 v16, 0x3f800000    # 1.0f

    .line 325
    .line 326
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 327
    .line 328
    .line 329
    const v0, 0x40551eb8    # 3.33f

    .line 330
    .line 331
    .line 332
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 333
    .line 334
    .line 335
    const v17, 0x416ab852    # 14.67f

    .line 336
    .line 337
    .line 338
    const/high16 v18, 0x41900000    # 18.0f

    .line 339
    .line 340
    const v13, 0x4163851f    # 14.22f

    .line 341
    .line 342
    .line 343
    const/high16 v14, 0x41980000    # 19.0f

    .line 344
    .line 345
    const v15, 0x416ab852    # 14.67f

    .line 346
    .line 347
    .line 348
    const v16, 0x41946666    # 18.55f

    .line 349
    .line 350
    .line 351
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 352
    .line 353
    .line 354
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 355
    .line 356
    .line 357
    const v0, 0x417ab852    # 15.67f

    .line 358
    .line 359
    .line 360
    const/high16 v2, 0x41580000    # 13.5f

    .line 361
    .line 362
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 363
    .line 364
    .line 365
    const/high16 v0, 0x41900000    # 18.0f

    .line 366
    .line 367
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 368
    .line 369
    .line 370
    const/high16 v17, 0x3f800000    # 1.0f

    .line 371
    .line 372
    const/high16 v18, 0x3f800000    # 1.0f

    .line 373
    .line 374
    const/4 v13, 0x0

    .line 375
    const v14, 0x3f0ccccd    # 0.55f

    .line 376
    .line 377
    .line 378
    const v15, 0x3ee66666    # 0.45f

    .line 379
    .line 380
    .line 381
    const/high16 v16, 0x3f800000    # 1.0f

    .line 382
    .line 383
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 384
    .line 385
    .line 386
    const/high16 v0, 0x41a00000    # 20.0f

    .line 387
    .line 388
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 389
    .line 390
    .line 391
    const/high16 v18, -0x40800000    # -1.0f

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
    const v16, -0x4119999a    # -0.45f

    .line 400
    .line 401
    .line 402
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 403
    .line 404
    .line 405
    const/high16 v0, -0x3f700000    # -4.5f

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
    const v14, -0x40f33333    # -0.55f

    .line 414
    .line 415
    .line 416
    const v15, -0x4119999a    # -0.45f

    .line 417
    .line 418
    .line 419
    const/high16 v16, -0x40800000    # -1.0f

    .line 420
    .line 421
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 422
    .line 423
    .line 424
    const v0, -0x3faae148    # -3.33f

    .line 425
    .line 426
    .line 427
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 428
    .line 429
    .line 430
    const v17, 0x417ab852    # 15.67f

    .line 431
    .line 432
    .line 433
    const/high16 v18, 0x41580000    # 13.5f

    .line 434
    .line 435
    const v13, 0x4180e148    # 16.11f

    .line 436
    .line 437
    .line 438
    const/high16 v14, 0x41480000    # 12.5f

    .line 439
    .line 440
    const v15, 0x417ab852    # 15.67f

    .line 441
    .line 442
    .line 443
    const v16, 0x414f3333    # 12.95f

    .line 444
    .line 445
    .line 446
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 447
    .line 448
    .line 449
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 450
    .line 451
    .line 452
    const v0, 0x40ea8f5c    # 7.33f

    .line 453
    .line 454
    .line 455
    const/high16 v2, 0x41480000    # 12.5f

    .line 456
    .line 457
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 458
    .line 459
    .line 460
    const/high16 v0, 0x40800000    # 4.0f

    .line 461
    .line 462
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 463
    .line 464
    .line 465
    const/high16 v17, -0x40800000    # -1.0f

    .line 466
    .line 467
    const/high16 v18, 0x3f800000    # 1.0f

    .line 468
    .line 469
    const v13, -0x40f33333    # -0.55f

    .line 470
    .line 471
    .line 472
    const/4 v14, 0x0

    .line 473
    const/high16 v15, -0x40800000    # -1.0f

    .line 474
    .line 475
    const v16, 0x3ee66666    # 0.45f

    .line 476
    .line 477
    .line 478
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 479
    .line 480
    .line 481
    const/high16 v0, 0x41900000    # 18.0f

    .line 482
    .line 483
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 484
    .line 485
    .line 486
    const/high16 v17, 0x3f800000    # 1.0f

    .line 487
    .line 488
    const/4 v13, 0x0

    .line 489
    const v14, 0x3f0ccccd    # 0.55f

    .line 490
    .line 491
    .line 492
    const v15, 0x3ee66666    # 0.45f

    .line 493
    .line 494
    .line 495
    const/high16 v16, 0x3f800000    # 1.0f

    .line 496
    .line 497
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 498
    .line 499
    .line 500
    const v0, 0x40551eb8    # 3.33f

    .line 501
    .line 502
    .line 503
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 504
    .line 505
    .line 506
    const/high16 v18, -0x40800000    # -1.0f

    .line 507
    .line 508
    const v13, 0x3f0ccccd    # 0.55f

    .line 509
    .line 510
    .line 511
    const/4 v14, 0x0

    .line 512
    const/high16 v15, 0x3f800000    # 1.0f

    .line 513
    .line 514
    const v16, -0x4119999a    # -0.45f

    .line 515
    .line 516
    .line 517
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 518
    .line 519
    .line 520
    const/high16 v0, -0x3f700000    # -4.5f

    .line 521
    .line 522
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 523
    .line 524
    .line 525
    const v17, 0x40ea8f5c    # 7.33f

    .line 526
    .line 527
    .line 528
    const/high16 v18, 0x41480000    # 12.5f

    .line 529
    .line 530
    const v13, 0x410547ae    # 8.33f

    .line 531
    .line 532
    .line 533
    const v14, 0x414f3333    # 12.95f

    .line 534
    .line 535
    .line 536
    const v15, 0x40fc7ae1    # 7.89f

    .line 537
    .line 538
    .line 539
    const/high16 v16, 0x41480000    # 12.5f

    .line 540
    .line 541
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 542
    .line 543
    .line 544
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 545
    .line 546
    .line 547
    const v0, 0x410547ae    # 8.33f

    .line 548
    .line 549
    .line 550
    const/high16 v2, 0x41280000    # 10.5f

    .line 551
    .line 552
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 553
    .line 554
    .line 555
    const/high16 v0, 0x40c00000    # 6.0f

    .line 556
    .line 557
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 558
    .line 559
    .line 560
    const/high16 v17, -0x40800000    # -1.0f

    .line 561
    .line 562
    const/high16 v18, -0x40800000    # -1.0f

    .line 563
    .line 564
    const/4 v13, 0x0

    .line 565
    const v14, -0x40f33333    # -0.55f

    .line 566
    .line 567
    .line 568
    const v15, -0x4119999a    # -0.45f

    .line 569
    .line 570
    .line 571
    const/high16 v16, -0x40800000    # -1.0f

    .line 572
    .line 573
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 574
    .line 575
    .line 576
    const/high16 v0, 0x40800000    # 4.0f

    .line 577
    .line 578
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 579
    .line 580
    .line 581
    const/high16 v17, 0x40400000    # 3.0f

    .line 582
    .line 583
    const/high16 v18, 0x40c00000    # 6.0f

    .line 584
    .line 585
    const v13, 0x405ccccd    # 3.45f

    .line 586
    .line 587
    .line 588
    const/high16 v14, 0x40a00000    # 5.0f

    .line 589
    .line 590
    const/high16 v15, 0x40400000    # 3.0f

    .line 591
    .line 592
    const v16, 0x40ae6666    # 5.45f

    .line 593
    .line 594
    .line 595
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 596
    .line 597
    .line 598
    const/high16 v0, 0x40900000    # 4.5f

    .line 599
    .line 600
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 601
    .line 602
    .line 603
    const/high16 v17, 0x3f800000    # 1.0f

    .line 604
    .line 605
    const/high16 v18, 0x3f800000    # 1.0f

    .line 606
    .line 607
    const/4 v13, 0x0

    .line 608
    const v14, 0x3f0ccccd    # 0.55f

    .line 609
    .line 610
    .line 611
    const v15, 0x3ee66666    # 0.45f

    .line 612
    .line 613
    .line 614
    const/high16 v16, 0x3f800000    # 1.0f

    .line 615
    .line 616
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 617
    .line 618
    .line 619
    const v0, 0x40551eb8    # 3.33f

    .line 620
    .line 621
    .line 622
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 623
    .line 624
    .line 625
    const v17, 0x410547ae    # 8.33f

    .line 626
    .line 627
    .line 628
    const/high16 v18, 0x41280000    # 10.5f

    .line 629
    .line 630
    const v13, 0x40fc7ae1    # 7.89f

    .line 631
    .line 632
    .line 633
    const/high16 v14, 0x41380000    # 11.5f

    .line 634
    .line 635
    const v15, 0x410547ae    # 8.33f

    .line 636
    .line 637
    .line 638
    const v16, 0x4130cccd    # 11.05f

    .line 639
    .line 640
    .line 641
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 642
    .line 643
    .line 644
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 645
    .line 646
    .line 647
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 648
    .line 649
    .line 650
    move-result-object v2

    .line 651
    const/16 v16, 0x3800

    .line 652
    .line 653
    const/16 v17, 0x0

    .line 654
    .line 655
    const/high16 v6, 0x3f800000    # 1.0f

    .line 656
    .line 657
    const/high16 v8, 0x3f800000    # 1.0f

    .line 658
    .line 659
    const/4 v7, 0x0

    .line 660
    const/high16 v9, 0x3f800000    # 1.0f

    .line 661
    .line 662
    const/high16 v12, 0x3f800000    # 1.0f

    .line 663
    .line 664
    const/4 v13, 0x0

    .line 665
    const/4 v14, 0x0

    .line 666
    const/4 v15, 0x0

    .line 667
    const-string v4, ""

    .line 668
    .line 669
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 670
    .line 671
    .line 672
    move-result-object v0

    .line 673
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 674
    .line 675
    .line 676
    move-result-object v0

    .line 677
    sput-object v0, Landroidx/compose/material/icons/rounded/ViewModuleKt;->_viewModule:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 678
    .line 679
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 680
    .line 681
    .line 682
    return-object v0
.end method
