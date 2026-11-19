.class public final Landroidx/compose/material/icons/rounded/HlsKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _hls:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getHls(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/HlsKt;->_hls:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.Hls"

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
    const/high16 v0, 0x412c0000    # 10.75f

    .line 71
    .line 72
    const/high16 v2, 0x41100000    # 9.0f

    .line 73
    .line 74
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v17, 0x41200000    # 10.0f

    .line 78
    .line 79
    const/high16 v18, 0x411c0000    # 9.75f

    .line 80
    .line 81
    const v13, 0x412570a4    # 10.34f

    .line 82
    .line 83
    .line 84
    const/high16 v14, 0x41100000    # 9.0f

    .line 85
    .line 86
    const/high16 v15, 0x41200000    # 10.0f

    .line 87
    .line 88
    const v16, 0x411570a4    # 9.34f

    .line 89
    .line 90
    .line 91
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 92
    .line 93
    .line 94
    const/high16 v0, 0x41600000    # 14.0f

    .line 95
    .line 96
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 97
    .line 98
    .line 99
    const/high16 v17, 0x3f800000    # 1.0f

    .line 100
    .line 101
    const/high16 v18, 0x3f800000    # 1.0f

    .line 102
    .line 103
    const/4 v13, 0x0

    .line 104
    const v14, 0x3f0ccccd    # 0.55f

    .line 105
    .line 106
    .line 107
    const v15, 0x3ee66666    # 0.45f

    .line 108
    .line 109
    .line 110
    const/high16 v16, 0x3f800000    # 1.0f

    .line 111
    .line 112
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 113
    .line 114
    .line 115
    const/high16 v0, 0x40100000    # 2.25f

    .line 116
    .line 117
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 118
    .line 119
    .line 120
    const/high16 v17, 0x3f400000    # 0.75f

    .line 121
    .line 122
    const/high16 v18, -0x40c00000    # -0.75f

    .line 123
    .line 124
    const v13, 0x3ed1eb85    # 0.41f

    .line 125
    .line 126
    .line 127
    const/4 v14, 0x0

    .line 128
    const/high16 v15, 0x3f400000    # 0.75f

    .line 129
    .line 130
    const v16, -0x4151eb85    # -0.34f

    .line 131
    .line 132
    .line 133
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 134
    .line 135
    .line 136
    const v0, -0x4151eb85    # -0.34f

    .line 137
    .line 138
    .line 139
    const/high16 v2, -0x40c00000    # -0.75f

    .line 140
    .line 141
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 142
    .line 143
    .line 144
    const/high16 v0, 0x41380000    # 11.5f

    .line 145
    .line 146
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 147
    .line 148
    .line 149
    const/high16 v0, 0x411c0000    # 9.75f

    .line 150
    .line 151
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 152
    .line 153
    .line 154
    const/high16 v17, 0x412c0000    # 10.75f

    .line 155
    .line 156
    const/high16 v18, 0x41100000    # 9.0f

    .line 157
    .line 158
    const/high16 v13, 0x41380000    # 11.5f

    .line 159
    .line 160
    const v14, 0x411570a4    # 9.34f

    .line 161
    .line 162
    .line 163
    const v15, 0x41328f5c    # 11.16f

    .line 164
    .line 165
    .line 166
    const/high16 v16, 0x41100000    # 9.0f

    .line 167
    .line 168
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 169
    .line 170
    .line 171
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 172
    .line 173
    .line 174
    const/high16 v0, 0x41280000    # 10.5f

    .line 175
    .line 176
    const v2, 0x419851ec    # 19.04f

    .line 177
    .line 178
    .line 179
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 180
    .line 181
    .line 182
    const v17, 0x3f35c28f    # 0.71f

    .line 183
    .line 184
    .line 185
    const/high16 v18, 0x3f000000    # 0.5f

    .line 186
    .line 187
    const v13, 0x3dcccccd    # 0.1f

    .line 188
    .line 189
    .line 190
    const v14, 0x3e947ae1    # 0.29f

    .line 191
    .line 192
    .line 193
    const v15, 0x3ec28f5c    # 0.38f

    .line 194
    .line 195
    .line 196
    const/high16 v16, 0x3f000000    # 0.5f

    .line 197
    .line 198
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 199
    .line 200
    .line 201
    const/high16 v17, 0x3f400000    # 0.75f

    .line 202
    .line 203
    const/high16 v18, -0x40c00000    # -0.75f

    .line 204
    .line 205
    const v13, 0x3ed1eb85    # 0.41f

    .line 206
    .line 207
    .line 208
    const/4 v14, 0x0

    .line 209
    const/high16 v15, 0x3f400000    # 0.75f

    .line 210
    .line 211
    const v16, -0x4151eb85    # -0.34f

    .line 212
    .line 213
    .line 214
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 215
    .line 216
    .line 217
    const/high16 v0, 0x41200000    # 10.0f

    .line 218
    .line 219
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 220
    .line 221
    .line 222
    const/high16 v17, -0x40800000    # -1.0f

    .line 223
    .line 224
    const/high16 v18, -0x40800000    # -1.0f

    .line 225
    .line 226
    const/4 v13, 0x0

    .line 227
    const v14, -0x40f33333    # -0.55f

    .line 228
    .line 229
    .line 230
    const v15, -0x4119999a    # -0.45f

    .line 231
    .line 232
    .line 233
    const/high16 v16, -0x40800000    # -1.0f

    .line 234
    .line 235
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 236
    .line 237
    .line 238
    const/high16 v0, -0x3fc00000    # -3.0f

    .line 239
    .line 240
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 241
    .line 242
    .line 243
    const/high16 v18, 0x3f800000    # 1.0f

    .line 244
    .line 245
    const v13, -0x40f33333    # -0.55f

    .line 246
    .line 247
    .line 248
    const/4 v14, 0x0

    .line 249
    const/high16 v15, -0x40800000    # -1.0f

    .line 250
    .line 251
    const v16, 0x3ee66666    # 0.45f

    .line 252
    .line 253
    .line 254
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 255
    .line 256
    .line 257
    const/high16 v0, 0x3fc00000    # 1.5f

    .line 258
    .line 259
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 260
    .line 261
    .line 262
    const/high16 v17, 0x3f800000    # 1.0f

    .line 263
    .line 264
    const/4 v13, 0x0

    .line 265
    const v14, 0x3f0ccccd    # 0.55f

    .line 266
    .line 267
    .line 268
    const v15, 0x3ee66666    # 0.45f

    .line 269
    .line 270
    .line 271
    const/high16 v16, 0x3f800000    # 1.0f

    .line 272
    .line 273
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 274
    .line 275
    .line 276
    const/high16 v0, 0x41980000    # 19.0f

    .line 277
    .line 278
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 279
    .line 280
    .line 281
    const/high16 v0, 0x3f800000    # 1.0f

    .line 282
    .line 283
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 284
    .line 285
    .line 286
    const v0, -0x3ffd70a4    # -2.04f

    .line 287
    .line 288
    .line 289
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 290
    .line 291
    .line 292
    const/4 v0, 0x0

    .line 293
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 294
    .line 295
    .line 296
    const v17, -0x40ca3d71    # -0.71f

    .line 297
    .line 298
    .line 299
    const/high16 v18, -0x41000000    # -0.5f

    .line 300
    .line 301
    const v13, -0x42333333    # -0.1f

    .line 302
    .line 303
    .line 304
    const v14, -0x416b851f    # -0.29f

    .line 305
    .line 306
    .line 307
    const v15, -0x413d70a4    # -0.38f

    .line 308
    .line 309
    .line 310
    const/high16 v16, -0x41000000    # -0.5f

    .line 311
    .line 312
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 313
    .line 314
    .line 315
    const/high16 v17, -0x40c00000    # -0.75f

    .line 316
    .line 317
    const/high16 v18, 0x3f400000    # 0.75f

    .line 318
    .line 319
    const v13, -0x412e147b    # -0.41f

    .line 320
    .line 321
    .line 322
    const/4 v14, 0x0

    .line 323
    const/high16 v15, -0x40c00000    # -0.75f

    .line 324
    .line 325
    const v16, 0x3eae147b    # 0.34f

    .line 326
    .line 327
    .line 328
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 329
    .line 330
    .line 331
    const/high16 v0, 0x41600000    # 14.0f

    .line 332
    .line 333
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 334
    .line 335
    .line 336
    const/high16 v17, 0x3f800000    # 1.0f

    .line 337
    .line 338
    const/high16 v18, 0x3f800000    # 1.0f

    .line 339
    .line 340
    const/4 v13, 0x0

    .line 341
    const v14, 0x3f0ccccd    # 0.55f

    .line 342
    .line 343
    .line 344
    const v15, 0x3ee66666    # 0.45f

    .line 345
    .line 346
    .line 347
    const/high16 v16, 0x3f800000    # 1.0f

    .line 348
    .line 349
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 350
    .line 351
    .line 352
    const/high16 v0, 0x40400000    # 3.0f

    .line 353
    .line 354
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 355
    .line 356
    .line 357
    const/high16 v18, -0x40800000    # -1.0f

    .line 358
    .line 359
    const v13, 0x3f0ccccd    # 0.55f

    .line 360
    .line 361
    .line 362
    const/4 v14, 0x0

    .line 363
    const/high16 v15, 0x3f800000    # 1.0f

    .line 364
    .line 365
    const v16, -0x4119999a    # -0.45f

    .line 366
    .line 367
    .line 368
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 369
    .line 370
    .line 371
    const/high16 v0, -0x40400000    # -1.5f

    .line 372
    .line 373
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 374
    .line 375
    .line 376
    const/high16 v17, -0x40800000    # -1.0f

    .line 377
    .line 378
    const/4 v13, 0x0

    .line 379
    const v14, -0x40f33333    # -0.55f

    .line 380
    .line 381
    .line 382
    const v15, -0x4119999a    # -0.45f

    .line 383
    .line 384
    .line 385
    const/high16 v16, -0x40800000    # -1.0f

    .line 386
    .line 387
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 388
    .line 389
    .line 390
    const/high16 v0, 0x41880000    # 17.0f

    .line 391
    .line 392
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 393
    .line 394
    .line 395
    const/high16 v0, -0x40800000    # -1.0f

    .line 396
    .line 397
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 398
    .line 399
    .line 400
    const/high16 v0, 0x41280000    # 10.5f

    .line 401
    .line 402
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 403
    .line 404
    .line 405
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 406
    .line 407
    .line 408
    const/high16 v0, 0x41000000    # 8.0f

    .line 409
    .line 410
    const/high16 v2, 0x411c0000    # 9.75f

    .line 411
    .line 412
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 413
    .line 414
    .line 415
    const/high16 v17, 0x40e80000    # 7.25f

    .line 416
    .line 417
    const/high16 v18, 0x41100000    # 9.0f

    .line 418
    .line 419
    const/high16 v13, 0x41000000    # 8.0f

    .line 420
    .line 421
    const v14, 0x411570a4    # 9.34f

    .line 422
    .line 423
    .line 424
    const v15, 0x40f51eb8    # 7.66f

    .line 425
    .line 426
    .line 427
    const/high16 v16, 0x41100000    # 9.0f

    .line 428
    .line 429
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 430
    .line 431
    .line 432
    const v0, 0x411570a4    # 9.34f

    .line 433
    .line 434
    .line 435
    const/high16 v2, 0x40d00000    # 6.5f

    .line 436
    .line 437
    const/high16 v4, 0x411c0000    # 9.75f

    .line 438
    .line 439
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 440
    .line 441
    .line 442
    const/high16 v0, 0x41300000    # 11.0f

    .line 443
    .line 444
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 445
    .line 446
    .line 447
    const/high16 v0, -0x40000000    # -2.0f

    .line 448
    .line 449
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 450
    .line 451
    .line 452
    const/high16 v0, 0x411c0000    # 9.75f

    .line 453
    .line 454
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 455
    .line 456
    .line 457
    const/high16 v17, 0x40700000    # 3.75f

    .line 458
    .line 459
    const/high16 v13, 0x40900000    # 4.5f

    .line 460
    .line 461
    const v15, 0x40851eb8    # 4.16f

    .line 462
    .line 463
    .line 464
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 465
    .line 466
    .line 467
    const v0, 0x411570a4    # 9.34f

    .line 468
    .line 469
    .line 470
    const/high16 v2, 0x40400000    # 3.0f

    .line 471
    .line 472
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 473
    .line 474
    .line 475
    const/high16 v0, 0x40900000    # 4.5f

    .line 476
    .line 477
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 478
    .line 479
    .line 480
    const/high16 v18, 0x41700000    # 15.0f

    .line 481
    .line 482
    const/high16 v13, 0x40400000    # 3.0f

    .line 483
    .line 484
    const v14, 0x416a8f5c    # 14.66f

    .line 485
    .line 486
    .line 487
    const v15, 0x4055c28f    # 3.34f

    .line 488
    .line 489
    .line 490
    const/high16 v16, 0x41700000    # 15.0f

    .line 491
    .line 492
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 493
    .line 494
    .line 495
    const/high16 v0, 0x3f400000    # 0.75f

    .line 496
    .line 497
    const v2, -0x4151eb85    # -0.34f

    .line 498
    .line 499
    .line 500
    const/high16 v4, -0x40c00000    # -0.75f

    .line 501
    .line 502
    invoke-virtual {v12, v0, v2, v0, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 503
    .line 504
    .line 505
    const/high16 v0, 0x41480000    # 12.5f

    .line 506
    .line 507
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 508
    .line 509
    .line 510
    const/high16 v0, 0x40000000    # 2.0f

    .line 511
    .line 512
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 513
    .line 514
    .line 515
    const/high16 v0, 0x3fe00000    # 1.75f

    .line 516
    .line 517
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 518
    .line 519
    .line 520
    const/high16 v17, 0x40e80000    # 7.25f

    .line 521
    .line 522
    const/high16 v13, 0x40d00000    # 6.5f

    .line 523
    .line 524
    const v15, 0x40dae148    # 6.84f

    .line 525
    .line 526
    .line 527
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 528
    .line 529
    .line 530
    const v0, 0x416a8f5c    # 14.66f

    .line 531
    .line 532
    .line 533
    const/high16 v2, 0x41640000    # 14.25f

    .line 534
    .line 535
    const/high16 v4, 0x41000000    # 8.0f

    .line 536
    .line 537
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 538
    .line 539
    .line 540
    const/high16 v0, 0x411c0000    # 9.75f

    .line 541
    .line 542
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 543
    .line 544
    .line 545
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 546
    .line 547
    .line 548
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 549
    .line 550
    .line 551
    move-result-object v2

    .line 552
    const/16 v16, 0x3800

    .line 553
    .line 554
    const/16 v17, 0x0

    .line 555
    .line 556
    const/high16 v6, 0x3f800000    # 1.0f

    .line 557
    .line 558
    const/high16 v8, 0x3f800000    # 1.0f

    .line 559
    .line 560
    const/4 v7, 0x0

    .line 561
    const/high16 v9, 0x3f800000    # 1.0f

    .line 562
    .line 563
    const/high16 v12, 0x3f800000    # 1.0f

    .line 564
    .line 565
    const/4 v13, 0x0

    .line 566
    const/4 v14, 0x0

    .line 567
    const/4 v15, 0x0

    .line 568
    const-string v4, ""

    .line 569
    .line 570
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 571
    .line 572
    .line 573
    move-result-object v0

    .line 574
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 575
    .line 576
    .line 577
    move-result-object v0

    .line 578
    sput-object v0, Landroidx/compose/material/icons/rounded/HlsKt;->_hls:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 579
    .line 580
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 581
    .line 582
    .line 583
    return-object v0
.end method
