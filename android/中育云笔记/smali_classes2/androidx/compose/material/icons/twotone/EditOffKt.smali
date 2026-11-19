.class public final Landroidx/compose/material/icons/twotone/EditOffKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _editOff:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getEditOff(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 20

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/EditOffKt;->_editOff:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.EditOff"

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
    const v4, 0x4190a3d7    # 18.08f

    .line 71
    .line 72
    .line 73
    const/high16 v6, 0x40a00000    # 5.0f

    .line 74
    .line 75
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    const/high16 v4, 0x41980000    # 19.0f

    .line 79
    .line 80
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 81
    .line 82
    .line 83
    const v4, 0x3f6b851f    # 0.92f

    .line 84
    .line 85
    .line 86
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 87
    .line 88
    .line 89
    const v4, 0x40a3d70a    # 5.12f

    .line 90
    .line 91
    .line 92
    const v6, -0x3f5c28f6    # -5.12f

    .line 93
    .line 94
    .line 95
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 96
    .line 97
    .line 98
    const v4, -0x40947ae1    # -0.92f

    .line 99
    .line 100
    .line 101
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 102
    .line 103
    .line 104
    const v4, 0x4190a3d7    # 18.08f

    .line 105
    .line 106
    .line 107
    const/high16 v6, 0x40a00000    # 5.0f

    .line 108
    .line 109
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 110
    .line 111
    .line 112
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 113
    .line 114
    .line 115
    const v4, 0x411051ec    # 9.02f

    .line 116
    .line 117
    .line 118
    const v6, 0x4160f5c3    # 14.06f

    .line 119
    .line 120
    .line 121
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 122
    .line 123
    .line 124
    const v4, 0x3f8e147b    # 1.11f

    .line 125
    .line 126
    .line 127
    const v6, -0x4071eb85    # -1.11f

    .line 128
    .line 129
    .line 130
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 131
    .line 132
    .line 133
    const v4, 0x3f6b851f    # 0.92f

    .line 134
    .line 135
    .line 136
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 137
    .line 138
    .line 139
    const v4, 0x3f8e147b    # 1.11f

    .line 140
    .line 141
    .line 142
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 143
    .line 144
    .line 145
    const v4, 0x411051ec    # 9.02f

    .line 146
    .line 147
    .line 148
    const v6, 0x4160f5c3    # 14.06f

    .line 149
    .line 150
    .line 151
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 152
    .line 153
    .line 154
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 155
    .line 156
    .line 157
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 158
    .line 159
    .line 160
    move-result-object v2

    .line 161
    const/16 v16, 0x3800

    .line 162
    .line 163
    const/16 v17, 0x0

    .line 164
    .line 165
    const v6, 0x3e99999a    # 0.3f

    .line 166
    .line 167
    .line 168
    const v8, 0x3e99999a    # 0.3f

    .line 169
    .line 170
    .line 171
    const/4 v7, 0x0

    .line 172
    const/high16 v9, 0x3f800000    # 1.0f

    .line 173
    .line 174
    const/high16 v12, 0x3f800000    # 1.0f

    .line 175
    .line 176
    const/4 v13, 0x0

    .line 177
    const/4 v14, 0x0

    .line 178
    const/4 v15, 0x0

    .line 179
    const-string v4, ""

    .line 180
    .line 181
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 182
    .line 183
    .line 184
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 185
    .line 186
    .line 187
    move-result v3

    .line 188
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 189
    .line 190
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 191
    .line 192
    .line 193
    move-result-wide v6

    .line 194
    const/4 v0, 0x0

    .line 195
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 196
    .line 197
    .line 198
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 199
    .line 200
    .line 201
    move-result v10

    .line 202
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 203
    .line 204
    .line 205
    move-result v11

    .line 206
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 207
    .line 208
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 209
    .line 210
    .line 211
    const v0, 0x411051ec    # 9.02f

    .line 212
    .line 213
    .line 214
    const v2, 0x4160f5c3    # 14.06f

    .line 215
    .line 216
    .line 217
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 218
    .line 219
    .line 220
    const v0, 0x3f6b851f    # 0.92f

    .line 221
    .line 222
    .line 223
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 224
    .line 225
    .line 226
    const v0, 0x3f8e147b    # 1.11f

    .line 227
    .line 228
    .line 229
    const v2, -0x4071eb85    # -1.11f

    .line 230
    .line 231
    .line 232
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 233
    .line 234
    .line 235
    const v0, 0x3fb47ae1    # 1.41f

    .line 236
    .line 237
    .line 238
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 239
    .line 240
    .line 241
    const v0, -0x3fdeb852    # -2.52f

    .line 242
    .line 243
    .line 244
    const v2, 0x402147ae    # 2.52f

    .line 245
    .line 246
    .line 247
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 248
    .line 249
    .line 250
    const/high16 v0, -0x3f900000    # -3.75f

    .line 251
    .line 252
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 253
    .line 254
    .line 255
    const v0, -0x3fdeb852    # -2.52f

    .line 256
    .line 257
    .line 258
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 259
    .line 260
    .line 261
    const v0, 0x3fb47ae1    # 1.41f

    .line 262
    .line 263
    .line 264
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 265
    .line 266
    .line 267
    const v0, 0x411051ec    # 9.02f

    .line 268
    .line 269
    .line 270
    const v2, 0x4160f5c3    # 14.06f

    .line 271
    .line 272
    .line 273
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 274
    .line 275
    .line 276
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 277
    .line 278
    .line 279
    const v0, 0x40e147ae    # 7.04f

    .line 280
    .line 281
    .line 282
    const v2, 0x41a5ae14    # 20.71f

    .line 283
    .line 284
    .line 285
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 286
    .line 287
    .line 288
    const/16 v17, 0x0

    .line 289
    .line 290
    const v18, -0x404b851f    # -1.41f

    .line 291
    .line 292
    .line 293
    const v13, 0x3ec7ae14    # 0.39f

    .line 294
    .line 295
    .line 296
    const v14, -0x413851ec    # -0.39f

    .line 297
    .line 298
    .line 299
    const v15, 0x3ec7ae14    # 0.39f

    .line 300
    .line 301
    .line 302
    const v16, -0x407d70a4    # -1.02f

    .line 303
    .line 304
    .line 305
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 306
    .line 307
    .line 308
    const v0, -0x3fea3d71    # -2.34f

    .line 309
    .line 310
    .line 311
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 312
    .line 313
    .line 314
    const v17, 0x418d47ae    # 17.66f

    .line 315
    .line 316
    .line 317
    const/high16 v18, 0x40400000    # 3.0f

    .line 318
    .line 319
    const v13, 0x41915c29    # 18.17f

    .line 320
    .line 321
    .line 322
    const v14, 0x4045c28f    # 3.09f

    .line 323
    .line 324
    .line 325
    const v15, 0x418f5c29    # 17.92f

    .line 326
    .line 327
    .line 328
    const/high16 v16, 0x40400000    # 3.0f

    .line 329
    .line 330
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 331
    .line 332
    .line 333
    const v0, -0x40cccccd    # -0.7f

    .line 334
    .line 335
    .line 336
    const v2, 0x3e947ae1    # 0.29f

    .line 337
    .line 338
    .line 339
    const v4, -0x40fd70a4    # -0.51f

    .line 340
    .line 341
    .line 342
    const v6, 0x3dcccccd    # 0.1f

    .line 343
    .line 344
    .line 345
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 346
    .line 347
    .line 348
    const v0, -0x4015c28f    # -1.83f

    .line 349
    .line 350
    .line 351
    const v2, 0x3fea3d71    # 1.83f

    .line 352
    .line 353
    .line 354
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 355
    .line 356
    .line 357
    const/high16 v0, 0x40700000    # 3.75f

    .line 358
    .line 359
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 360
    .line 361
    .line 362
    const v0, 0x40e147ae    # 7.04f

    .line 363
    .line 364
    .line 365
    const v2, 0x41a5ae14    # 20.71f

    .line 366
    .line 367
    .line 368
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 369
    .line 370
    .line 371
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 372
    .line 373
    .line 374
    const v0, 0x4033d70a    # 2.81f

    .line 375
    .line 376
    .line 377
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 378
    .line 379
    .line 380
    const v0, 0x3fb1eb85    # 1.39f

    .line 381
    .line 382
    .line 383
    const v2, 0x40870a3d    # 4.22f

    .line 384
    .line 385
    .line 386
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 387
    .line 388
    .line 389
    const v0, 0x40ea3d71    # 7.32f

    .line 390
    .line 391
    .line 392
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 393
    .line 394
    .line 395
    const/high16 v0, 0x40400000    # 3.0f

    .line 396
    .line 397
    const/high16 v2, 0x418a0000    # 17.25f

    .line 398
    .line 399
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 400
    .line 401
    .line 402
    const/high16 v0, 0x41a80000    # 21.0f

    .line 403
    .line 404
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 405
    .line 406
    .line 407
    const/high16 v0, 0x40700000    # 3.75f

    .line 408
    .line 409
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 410
    .line 411
    .line 412
    const v0, 0x40b6b852    # 5.71f

    .line 413
    .line 414
    .line 415
    const v2, -0x3f4947ae    # -5.71f

    .line 416
    .line 417
    .line 418
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 419
    .line 420
    .line 421
    const v0, 0x40ea3d71    # 7.32f

    .line 422
    .line 423
    .line 424
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 425
    .line 426
    .line 427
    const v0, -0x404b851f    # -1.41f

    .line 428
    .line 429
    .line 430
    const v2, 0x3fb47ae1    # 1.41f

    .line 431
    .line 432
    .line 433
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 434
    .line 435
    .line 436
    const v0, 0x4033d70a    # 2.81f

    .line 437
    .line 438
    .line 439
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 440
    .line 441
    .line 442
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 443
    .line 444
    .line 445
    const v0, 0x40bd70a4    # 5.92f

    .line 446
    .line 447
    .line 448
    const/high16 v2, 0x41980000    # 19.0f

    .line 449
    .line 450
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 451
    .line 452
    .line 453
    const/high16 v0, 0x40a00000    # 5.0f

    .line 454
    .line 455
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 456
    .line 457
    .line 458
    const v0, -0x40947ae1    # -0.92f

    .line 459
    .line 460
    .line 461
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 462
    .line 463
    .line 464
    const v0, 0x40a428f6    # 5.13f

    .line 465
    .line 466
    .line 467
    const v2, -0x3f5bd70a    # -5.13f

    .line 468
    .line 469
    .line 470
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 471
    .line 472
    .line 473
    const v0, 0x3f6b851f    # 0.92f

    .line 474
    .line 475
    .line 476
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 477
    .line 478
    .line 479
    const v0, 0x40bd70a4    # 5.92f

    .line 480
    .line 481
    .line 482
    const/high16 v2, 0x41980000    # 19.0f

    .line 483
    .line 484
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 485
    .line 486
    .line 487
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 488
    .line 489
    .line 490
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 491
    .line 492
    .line 493
    move-result-object v2

    .line 494
    const/16 v16, 0x3800

    .line 495
    .line 496
    const/16 v17, 0x0

    .line 497
    .line 498
    const/high16 v6, 0x3f800000    # 1.0f

    .line 499
    .line 500
    const/high16 v8, 0x3f800000    # 1.0f

    .line 501
    .line 502
    const/4 v7, 0x0

    .line 503
    const/high16 v12, 0x3f800000    # 1.0f

    .line 504
    .line 505
    const/4 v13, 0x0

    .line 506
    const/4 v14, 0x0

    .line 507
    const/4 v15, 0x0

    .line 508
    const-string v4, ""

    .line 509
    .line 510
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 511
    .line 512
    .line 513
    move-result-object v0

    .line 514
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 515
    .line 516
    .line 517
    move-result-object v0

    .line 518
    sput-object v0, Landroidx/compose/material/icons/twotone/EditOffKt;->_editOff:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 519
    .line 520
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 521
    .line 522
    .line 523
    return-object v0
.end method
