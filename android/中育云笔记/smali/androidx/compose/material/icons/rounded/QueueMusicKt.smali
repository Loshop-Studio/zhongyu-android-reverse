.class public final Landroidx/compose/material/icons/rounded/QueueMusicKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _queueMusic:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getQueueMusic(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/QueueMusicKt;->_queueMusic:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.QueueMusic"

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
    const/high16 v0, 0x41600000    # 14.0f

    .line 71
    .line 72
    const/high16 v2, 0x40c00000    # 6.0f

    .line 73
    .line 74
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v0, 0x40800000    # 4.0f

    .line 78
    .line 79
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 80
    .line 81
    .line 82
    const/high16 v17, -0x40800000    # -1.0f

    .line 83
    .line 84
    const/high16 v18, 0x3f800000    # 1.0f

    .line 85
    .line 86
    const v13, -0x40f33333    # -0.55f

    .line 87
    .line 88
    .line 89
    const/4 v14, 0x0

    .line 90
    const/high16 v15, -0x40800000    # -1.0f

    .line 91
    .line 92
    const v16, 0x3ee66666    # 0.45f

    .line 93
    .line 94
    .line 95
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 96
    .line 97
    .line 98
    const v0, 0x3ee66666    # 0.45f

    .line 99
    .line 100
    .line 101
    const/high16 v2, 0x3f800000    # 1.0f

    .line 102
    .line 103
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 104
    .line 105
    .line 106
    const/high16 v0, 0x41200000    # 10.0f

    .line 107
    .line 108
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 109
    .line 110
    .line 111
    const/high16 v17, 0x3f800000    # 1.0f

    .line 112
    .line 113
    const/high16 v18, -0x40800000    # -1.0f

    .line 114
    .line 115
    const v13, 0x3f0ccccd    # 0.55f

    .line 116
    .line 117
    .line 118
    const/high16 v15, 0x3f800000    # 1.0f

    .line 119
    .line 120
    const v16, -0x4119999a    # -0.45f

    .line 121
    .line 122
    .line 123
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 124
    .line 125
    .line 126
    const v0, -0x4119999a    # -0.45f

    .line 127
    .line 128
    .line 129
    const/high16 v2, -0x40800000    # -1.0f

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
    const/high16 v0, 0x41600000    # 14.0f

    .line 138
    .line 139
    const/high16 v2, 0x41200000    # 10.0f

    .line 140
    .line 141
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 142
    .line 143
    .line 144
    const/high16 v0, 0x41200000    # 10.0f

    .line 145
    .line 146
    const/high16 v2, 0x40800000    # 4.0f

    .line 147
    .line 148
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 149
    .line 150
    .line 151
    const/high16 v17, -0x40800000    # -1.0f

    .line 152
    .line 153
    const/high16 v18, 0x3f800000    # 1.0f

    .line 154
    .line 155
    const v13, -0x40f33333    # -0.55f

    .line 156
    .line 157
    .line 158
    const/high16 v15, -0x40800000    # -1.0f

    .line 159
    .line 160
    const v16, 0x3ee66666    # 0.45f

    .line 161
    .line 162
    .line 163
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 164
    .line 165
    .line 166
    const v0, 0x3ee66666    # 0.45f

    .line 167
    .line 168
    .line 169
    const/high16 v2, 0x3f800000    # 1.0f

    .line 170
    .line 171
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 172
    .line 173
    .line 174
    const/high16 v0, 0x41200000    # 10.0f

    .line 175
    .line 176
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

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
    const/high16 v15, 0x3f800000    # 1.0f

    .line 187
    .line 188
    const v16, -0x4119999a    # -0.45f

    .line 189
    .line 190
    .line 191
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 192
    .line 193
    .line 194
    const v0, -0x4119999a    # -0.45f

    .line 195
    .line 196
    .line 197
    const/high16 v2, -0x40800000    # -1.0f

    .line 198
    .line 199
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 200
    .line 201
    .line 202
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 203
    .line 204
    .line 205
    const/high16 v0, 0x41800000    # 16.0f

    .line 206
    .line 207
    const/high16 v2, 0x40800000    # 4.0f

    .line 208
    .line 209
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 210
    .line 211
    .line 212
    const/high16 v0, 0x40c00000    # 6.0f

    .line 213
    .line 214
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 215
    .line 216
    .line 217
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 218
    .line 219
    .line 220
    const v0, -0x4119999a    # -0.45f

    .line 221
    .line 222
    .line 223
    const/high16 v2, -0x40800000    # -1.0f

    .line 224
    .line 225
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 226
    .line 227
    .line 228
    const/high16 v0, 0x41600000    # 14.0f

    .line 229
    .line 230
    const/high16 v2, 0x40800000    # 4.0f

    .line 231
    .line 232
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 233
    .line 234
    .line 235
    const/high16 v17, -0x40800000    # -1.0f

    .line 236
    .line 237
    const/high16 v18, 0x3f800000    # 1.0f

    .line 238
    .line 239
    const v13, -0x40f33333    # -0.55f

    .line 240
    .line 241
    .line 242
    const/high16 v15, -0x40800000    # -1.0f

    .line 243
    .line 244
    const v16, 0x3ee66666    # 0.45f

    .line 245
    .line 246
    .line 247
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 248
    .line 249
    .line 250
    const v0, 0x3ee66666    # 0.45f

    .line 251
    .line 252
    .line 253
    const/high16 v2, 0x3f800000    # 1.0f

    .line 254
    .line 255
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 256
    .line 257
    .line 258
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 259
    .line 260
    .line 261
    const/high16 v0, 0x41980000    # 19.0f

    .line 262
    .line 263
    const/high16 v2, 0x40c00000    # 6.0f

    .line 264
    .line 265
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 266
    .line 267
    .line 268
    const/high16 v17, -0x40000000    # -2.0f

    .line 269
    .line 270
    const/high16 v18, 0x40000000    # 2.0f

    .line 271
    .line 272
    const v13, -0x40733333    # -1.1f

    .line 273
    .line 274
    .line 275
    const/high16 v15, -0x40000000    # -2.0f

    .line 276
    .line 277
    const v16, 0x3f666666    # 0.9f

    .line 278
    .line 279
    .line 280
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 281
    .line 282
    .line 283
    const v0, 0x40c5c28f    # 6.18f

    .line 284
    .line 285
    .line 286
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 287
    .line 288
    .line 289
    const/high16 v17, -0x40800000    # -1.0f

    .line 290
    .line 291
    const v18, -0x41c7ae14    # -0.18f

    .line 292
    .line 293
    .line 294
    const v13, -0x416147ae    # -0.31f

    .line 295
    .line 296
    .line 297
    const v14, -0x421eb852    # -0.11f

    .line 298
    .line 299
    .line 300
    const v15, -0x40d9999a    # -0.65f

    .line 301
    .line 302
    .line 303
    const v16, -0x41c7ae14    # -0.18f

    .line 304
    .line 305
    .line 306
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 307
    .line 308
    .line 309
    const v17, -0x3fc33333    # -2.95f

    .line 310
    .line 311
    .line 312
    const v18, 0x40628f5c    # 3.54f

    .line 313
    .line 314
    .line 315
    const v13, -0x40147ae1    # -1.84f

    .line 316
    .line 317
    .line 318
    const/4 v14, 0x0

    .line 319
    const v15, -0x3fae147b    # -3.28f

    .line 320
    .line 321
    .line 322
    const v16, 0x3fd1eb85    # 1.64f

    .line 323
    .line 324
    .line 325
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 326
    .line 327
    .line 328
    const v17, 0x401a3d71    # 2.41f

    .line 329
    .line 330
    .line 331
    const v18, 0x401a3d71    # 2.41f

    .line 332
    .line 333
    .line 334
    const v13, 0x3e570a3d    # 0.21f

    .line 335
    .line 336
    .line 337
    const v14, 0x3f9ae148    # 1.21f

    .line 338
    .line 339
    .line 340
    const v15, 0x3f99999a    # 1.2f

    .line 341
    .line 342
    .line 343
    const v16, 0x400ccccd    # 2.2f

    .line 344
    .line 345
    .line 346
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 347
    .line 348
    .line 349
    const v17, 0x40628f5c    # 3.54f

    .line 350
    .line 351
    .line 352
    const v18, -0x3fc33333    # -2.95f

    .line 353
    .line 354
    .line 355
    const v13, 0x3ff33333    # 1.9f

    .line 356
    .line 357
    .line 358
    const v14, 0x3ea8f5c3    # 0.33f

    .line 359
    .line 360
    .line 361
    const v15, 0x40628f5c    # 3.54f

    .line 362
    .line 363
    .line 364
    const v16, -0x4071eb85    # -1.11f

    .line 365
    .line 366
    .line 367
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 368
    .line 369
    .line 370
    const/high16 v0, 0x41000000    # 8.0f

    .line 371
    .line 372
    const/high16 v2, 0x41980000    # 19.0f

    .line 373
    .line 374
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 375
    .line 376
    .line 377
    const/high16 v0, 0x40000000    # 2.0f

    .line 378
    .line 379
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 380
    .line 381
    .line 382
    const/high16 v17, 0x3f800000    # 1.0f

    .line 383
    .line 384
    const/high16 v18, -0x40800000    # -1.0f

    .line 385
    .line 386
    const v13, 0x3f0ccccd    # 0.55f

    .line 387
    .line 388
    .line 389
    const/4 v14, 0x0

    .line 390
    const/high16 v15, 0x3f800000    # 1.0f

    .line 391
    .line 392
    const v16, -0x4119999a    # -0.45f

    .line 393
    .line 394
    .line 395
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 396
    .line 397
    .line 398
    const v0, -0x4119999a    # -0.45f

    .line 399
    .line 400
    .line 401
    const/high16 v2, -0x40800000    # -1.0f

    .line 402
    .line 403
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 404
    .line 405
    .line 406
    const/high16 v0, -0x40000000    # -2.0f

    .line 407
    .line 408
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 409
    .line 410
    .line 411
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 412
    .line 413
    .line 414
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 415
    .line 416
    .line 417
    move-result-object v2

    .line 418
    const/16 v16, 0x3800

    .line 419
    .line 420
    const/16 v17, 0x0

    .line 421
    .line 422
    const/high16 v6, 0x3f800000    # 1.0f

    .line 423
    .line 424
    const/high16 v8, 0x3f800000    # 1.0f

    .line 425
    .line 426
    const/4 v7, 0x0

    .line 427
    const/high16 v9, 0x3f800000    # 1.0f

    .line 428
    .line 429
    const/high16 v12, 0x3f800000    # 1.0f

    .line 430
    .line 431
    const/4 v13, 0x0

    .line 432
    const/4 v15, 0x0

    .line 433
    const-string v4, ""

    .line 434
    .line 435
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 436
    .line 437
    .line 438
    move-result-object v0

    .line 439
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 440
    .line 441
    .line 442
    move-result-object v0

    .line 443
    sput-object v0, Landroidx/compose/material/icons/rounded/QueueMusicKt;->_queueMusic:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 444
    .line 445
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 446
    .line 447
    .line 448
    return-object v0
.end method

.method public static synthetic getQueueMusic$annotations(Landroidx/compose/material/icons/Icons$Rounded;)V
    .locals 0
    .annotation runtime Lqc/a;
    .end annotation

    return-void
.end method
