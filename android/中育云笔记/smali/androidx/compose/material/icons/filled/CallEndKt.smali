.class public final Landroidx/compose/material/icons/filled/CallEndKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _callEnd:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getCallEnd(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/filled/CallEndKt;->_callEnd:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Filled.CallEnd"

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
    const/high16 v0, 0x41400000    # 12.0f

    .line 71
    .line 72
    const/high16 v2, 0x41100000    # 9.0f

    .line 73
    .line 74
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const v17, -0x3f6ccccd    # -4.6f

    .line 78
    .line 79
    .line 80
    const v18, 0x3f3851ec    # 0.72f

    .line 81
    .line 82
    .line 83
    const v13, -0x40333333    # -1.6f

    .line 84
    .line 85
    .line 86
    const/4 v14, 0x0

    .line 87
    const v15, -0x3fb66666    # -3.15f

    .line 88
    .line 89
    .line 90
    const/high16 v16, 0x3e800000    # 0.25f

    .line 91
    .line 92
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 93
    .line 94
    .line 95
    const v0, 0x40466666    # 3.1f

    .line 96
    .line 97
    .line 98
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 99
    .line 100
    .line 101
    const v17, -0x40f0a3d7    # -0.56f

    .line 102
    .line 103
    .line 104
    const v18, 0x3f666666    # 0.9f

    .line 105
    .line 106
    .line 107
    const/4 v13, 0x0

    .line 108
    const v14, 0x3ec7ae14    # 0.39f

    .line 109
    .line 110
    .line 111
    const v15, -0x41947ae1    # -0.23f

    .line 112
    .line 113
    .line 114
    const v16, 0x3f3d70a4    # 0.74f

    .line 115
    .line 116
    .line 117
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 118
    .line 119
    .line 120
    const v17, -0x3fd5c28f    # -2.66f

    .line 121
    .line 122
    .line 123
    const v18, 0x3feccccd    # 1.85f

    .line 124
    .line 125
    .line 126
    const v13, -0x40851eb8    # -0.98f

    .line 127
    .line 128
    .line 129
    const v14, 0x3efae148    # 0.49f

    .line 130
    .line 131
    .line 132
    const v15, -0x4010a3d7    # -1.87f

    .line 133
    .line 134
    .line 135
    const v16, 0x3f8f5c29    # 1.12f

    .line 136
    .line 137
    .line 138
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 139
    .line 140
    .line 141
    const v17, -0x40cccccd    # -0.7f

    .line 142
    .line 143
    .line 144
    const v18, 0x3e8f5c29    # 0.28f

    .line 145
    .line 146
    .line 147
    const v13, -0x41c7ae14    # -0.18f

    .line 148
    .line 149
    .line 150
    const v14, 0x3e3851ec    # 0.18f

    .line 151
    .line 152
    .line 153
    const v15, -0x4123d70a    # -0.43f

    .line 154
    .line 155
    .line 156
    const v16, 0x3e8f5c29    # 0.28f

    .line 157
    .line 158
    .line 159
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 160
    .line 161
    .line 162
    const v17, -0x40ca3d71    # -0.71f

    .line 163
    .line 164
    .line 165
    const v18, -0x416b851f    # -0.29f

    .line 166
    .line 167
    .line 168
    const v13, -0x4170a3d7    # -0.28f

    .line 169
    .line 170
    .line 171
    const/4 v14, 0x0

    .line 172
    const v15, -0x40f851ec    # -0.53f

    .line 173
    .line 174
    .line 175
    const v16, -0x421eb852    # -0.11f

    .line 176
    .line 177
    .line 178
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 179
    .line 180
    .line 181
    const v0, 0x3e947ae1    # 0.29f

    .line 182
    .line 183
    .line 184
    const v2, 0x415147ae    # 13.08f

    .line 185
    .line 186
    .line 187
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 188
    .line 189
    .line 190
    const v17, -0x416b851f    # -0.29f

    .line 191
    .line 192
    .line 193
    const v18, -0x40cccccd    # -0.7f

    .line 194
    .line 195
    .line 196
    const v13, -0x41c7ae14    # -0.18f

    .line 197
    .line 198
    .line 199
    const v14, -0x41d1eb85    # -0.17f

    .line 200
    .line 201
    .line 202
    const v15, -0x416b851f    # -0.29f

    .line 203
    .line 204
    .line 205
    const v16, -0x4128f5c3    # -0.42f

    .line 206
    .line 207
    .line 208
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 209
    .line 210
    .line 211
    const v17, 0x3e947ae1    # 0.29f

    .line 212
    .line 213
    .line 214
    const v18, -0x40ca3d71    # -0.71f

    .line 215
    .line 216
    .line 217
    const/4 v13, 0x0

    .line 218
    const v14, -0x4170a3d7    # -0.28f

    .line 219
    .line 220
    .line 221
    const v15, 0x3de147ae    # 0.11f

    .line 222
    .line 223
    .line 224
    const v16, -0x40f851ec    # -0.53f

    .line 225
    .line 226
    .line 227
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 228
    .line 229
    .line 230
    const/high16 v17, 0x41400000    # 12.0f

    .line 231
    .line 232
    const/high16 v18, 0x40e00000    # 7.0f

    .line 233
    .line 234
    const v13, 0x4055c28f    # 3.34f

    .line 235
    .line 236
    .line 237
    const v14, 0x410c7ae1    # 8.78f

    .line 238
    .line 239
    .line 240
    const v15, 0x40eeb852    # 7.46f

    .line 241
    .line 242
    .line 243
    const/high16 v16, 0x40e00000    # 7.0f

    .line 244
    .line 245
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 246
    .line 247
    .line 248
    const v0, 0x413b5c29    # 11.71f

    .line 249
    .line 250
    .line 251
    const v2, 0x409570a4    # 4.67f

    .line 252
    .line 253
    .line 254
    const v4, 0x410a8f5c    # 8.66f

    .line 255
    .line 256
    .line 257
    const v6, 0x3fe3d70a    # 1.78f

    .line 258
    .line 259
    .line 260
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 261
    .line 262
    .line 263
    const v17, 0x3e947ae1    # 0.29f

    .line 264
    .line 265
    .line 266
    const v18, 0x3f35c28f    # 0.71f

    .line 267
    .line 268
    .line 269
    const v13, 0x3e3851ec    # 0.18f

    .line 270
    .line 271
    .line 272
    const v14, 0x3e3851ec    # 0.18f

    .line 273
    .line 274
    .line 275
    const v15, 0x3e947ae1    # 0.29f

    .line 276
    .line 277
    .line 278
    const v16, 0x3edc28f6    # 0.43f

    .line 279
    .line 280
    .line 281
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 282
    .line 283
    .line 284
    const v17, -0x416b851f    # -0.29f

    .line 285
    .line 286
    .line 287
    const/4 v13, 0x0

    .line 288
    const v14, 0x3e8f5c29    # 0.28f

    .line 289
    .line 290
    .line 291
    const v15, -0x421eb852    # -0.11f

    .line 292
    .line 293
    .line 294
    const v16, 0x3f07ae14    # 0.53f

    .line 295
    .line 296
    .line 297
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 298
    .line 299
    .line 300
    const v0, -0x3fe147ae    # -2.48f

    .line 301
    .line 302
    .line 303
    const v2, 0x401eb852    # 2.48f

    .line 304
    .line 305
    .line 306
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 307
    .line 308
    .line 309
    const v17, -0x40ca3d71    # -0.71f

    .line 310
    .line 311
    .line 312
    const v18, 0x3e947ae1    # 0.29f

    .line 313
    .line 314
    .line 315
    const v13, -0x41c7ae14    # -0.18f

    .line 316
    .line 317
    .line 318
    const v14, 0x3e3851ec    # 0.18f

    .line 319
    .line 320
    .line 321
    const v15, -0x4123d70a    # -0.43f

    .line 322
    .line 323
    .line 324
    const v16, 0x3e947ae1    # 0.29f

    .line 325
    .line 326
    .line 327
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 328
    .line 329
    .line 330
    const v17, -0x40cccccd    # -0.7f

    .line 331
    .line 332
    .line 333
    const v18, -0x4170a3d7    # -0.28f

    .line 334
    .line 335
    .line 336
    const v13, -0x4175c28f    # -0.27f

    .line 337
    .line 338
    .line 339
    const/4 v14, 0x0

    .line 340
    const v15, -0x40fae148    # -0.52f

    .line 341
    .line 342
    .line 343
    const v16, -0x421eb852    # -0.11f

    .line 344
    .line 345
    .line 346
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 347
    .line 348
    .line 349
    const v17, -0x3fd51eb8    # -2.67f

    .line 350
    .line 351
    .line 352
    const v18, -0x40133333    # -1.85f

    .line 353
    .line 354
    .line 355
    const v13, -0x40b5c28f    # -0.79f

    .line 356
    .line 357
    .line 358
    const v14, -0x40c28f5c    # -0.74f

    .line 359
    .line 360
    .line 361
    const v15, -0x4027ae14    # -1.69f

    .line 362
    .line 363
    .line 364
    const v16, -0x4051eb85    # -1.36f

    .line 365
    .line 366
    .line 367
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 368
    .line 369
    .line 370
    const v17, -0x40f0a3d7    # -0.56f

    .line 371
    .line 372
    .line 373
    const v18, -0x4099999a    # -0.9f

    .line 374
    .line 375
    .line 376
    const v13, -0x41570a3d    # -0.33f

    .line 377
    .line 378
    .line 379
    const v14, -0x41dc28f6    # -0.16f

    .line 380
    .line 381
    .line 382
    const v15, -0x40f0a3d7    # -0.56f

    .line 383
    .line 384
    .line 385
    const/high16 v16, -0x41000000    # -0.5f

    .line 386
    .line 387
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 388
    .line 389
    .line 390
    const v0, -0x3fb9999a    # -3.1f

    .line 391
    .line 392
    .line 393
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 394
    .line 395
    .line 396
    const/high16 v17, 0x41400000    # 12.0f

    .line 397
    .line 398
    const/high16 v18, 0x41100000    # 9.0f

    .line 399
    .line 400
    const v13, 0x41726666    # 15.15f

    .line 401
    .line 402
    .line 403
    const/high16 v14, 0x41140000    # 9.25f

    .line 404
    .line 405
    const v15, 0x4159999a    # 13.6f

    .line 406
    .line 407
    .line 408
    const/high16 v16, 0x41100000    # 9.0f

    .line 409
    .line 410
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 411
    .line 412
    .line 413
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 414
    .line 415
    .line 416
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 417
    .line 418
    .line 419
    move-result-object v2

    .line 420
    const/16 v16, 0x3800

    .line 421
    .line 422
    const/16 v17, 0x0

    .line 423
    .line 424
    const/high16 v6, 0x3f800000    # 1.0f

    .line 425
    .line 426
    const/high16 v8, 0x3f800000    # 1.0f

    .line 427
    .line 428
    const/4 v7, 0x0

    .line 429
    const/high16 v9, 0x3f800000    # 1.0f

    .line 430
    .line 431
    const/high16 v12, 0x3f800000    # 1.0f

    .line 432
    .line 433
    const/4 v13, 0x0

    .line 434
    const/4 v14, 0x0

    .line 435
    const/4 v15, 0x0

    .line 436
    const-string v4, ""

    .line 437
    .line 438
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 439
    .line 440
    .line 441
    move-result-object v0

    .line 442
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 443
    .line 444
    .line 445
    move-result-object v0

    .line 446
    sput-object v0, Landroidx/compose/material/icons/filled/CallEndKt;->_callEnd:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 447
    .line 448
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 449
    .line 450
    .line 451
    return-object v0
.end method
