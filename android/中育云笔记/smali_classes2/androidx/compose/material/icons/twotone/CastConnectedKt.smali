.class public final Landroidx/compose/material/icons/twotone/CastConnectedKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _castConnected:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getCastConnected(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/CastConnectedKt;->_castConnected:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.CastConnected"

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
    const/high16 v4, 0x41100000    # 9.0f

    .line 71
    .line 72
    const/high16 v6, 0x41880000    # 17.0f

    .line 73
    .line 74
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const v4, 0x40be6666    # 5.95f

    .line 78
    .line 79
    .line 80
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 81
    .line 82
    .line 83
    const v25, 0x40d1eb85    # 6.56f

    .line 84
    .line 85
    .line 86
    const/high16 v26, 0x40c00000    # 6.0f

    .line 87
    .line 88
    const v21, 0x40351eb8    # 2.83f

    .line 89
    .line 90
    .line 91
    const v22, 0x3f95c28f    # 1.17f

    .line 92
    .line 93
    .line 94
    const v23, 0x40a4cccd    # 5.15f

    .line 95
    .line 96
    .line 97
    const v24, 0x40533333    # 3.3f

    .line 98
    .line 99
    .line 100
    move-object/from16 v20, v2

    .line 101
    .line 102
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 103
    .line 104
    .line 105
    const/high16 v4, 0x41880000    # 17.0f

    .line 106
    .line 107
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 108
    .line 109
    .line 110
    const/high16 v4, 0x41100000    # 9.0f

    .line 111
    .line 112
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 113
    .line 114
    .line 115
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 116
    .line 117
    .line 118
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 119
    .line 120
    .line 121
    move-result-object v2

    .line 122
    const/16 v16, 0x3800

    .line 123
    .line 124
    const/16 v17, 0x0

    .line 125
    .line 126
    const v6, 0x3e99999a    # 0.3f

    .line 127
    .line 128
    .line 129
    const v8, 0x3e99999a    # 0.3f

    .line 130
    .line 131
    .line 132
    const/4 v7, 0x0

    .line 133
    const/high16 v9, 0x3f800000    # 1.0f

    .line 134
    .line 135
    const/high16 v12, 0x3f800000    # 1.0f

    .line 136
    .line 137
    const/4 v13, 0x0

    .line 138
    const/4 v14, 0x0

    .line 139
    const/4 v15, 0x0

    .line 140
    const-string v4, ""

    .line 141
    .line 142
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 143
    .line 144
    .line 145
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 146
    .line 147
    .line 148
    move-result v3

    .line 149
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 150
    .line 151
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 152
    .line 153
    .line 154
    move-result-wide v6

    .line 155
    const/4 v0, 0x0

    .line 156
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 157
    .line 158
    .line 159
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 160
    .line 161
    .line 162
    move-result v10

    .line 163
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 164
    .line 165
    .line 166
    move-result v11

    .line 167
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 168
    .line 169
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 170
    .line 171
    .line 172
    const/high16 v0, 0x41900000    # 18.0f

    .line 173
    .line 174
    const/high16 v2, 0x3f800000    # 1.0f

    .line 175
    .line 176
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 177
    .line 178
    .line 179
    const/high16 v0, 0x40400000    # 3.0f

    .line 180
    .line 181
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 182
    .line 183
    .line 184
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 185
    .line 186
    .line 187
    const/high16 v17, -0x3fc00000    # -3.0f

    .line 188
    .line 189
    const/high16 v18, -0x3fc00000    # -3.0f

    .line 190
    .line 191
    const v14, -0x402b851f    # -1.66f

    .line 192
    .line 193
    .line 194
    const v15, -0x40547ae1    # -1.34f

    .line 195
    .line 196
    .line 197
    const/high16 v16, -0x3fc00000    # -3.0f

    .line 198
    .line 199
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 200
    .line 201
    .line 202
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 203
    .line 204
    .line 205
    const/high16 v0, 0x41600000    # 14.0f

    .line 206
    .line 207
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 208
    .line 209
    .line 210
    const/high16 v0, 0x40000000    # 2.0f

    .line 211
    .line 212
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 213
    .line 214
    .line 215
    const/high16 v17, 0x40a00000    # 5.0f

    .line 216
    .line 217
    const/high16 v18, 0x40a00000    # 5.0f

    .line 218
    .line 219
    const v13, 0x4030a3d7    # 2.76f

    .line 220
    .line 221
    .line 222
    const/4 v14, 0x0

    .line 223
    const/high16 v15, 0x40a00000    # 5.0f

    .line 224
    .line 225
    const v16, 0x400f5c29    # 2.24f

    .line 226
    .line 227
    .line 228
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 229
    .line 230
    .line 231
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 232
    .line 233
    .line 234
    const/high16 v17, -0x3f200000    # -7.0f

    .line 235
    .line 236
    const/high16 v18, -0x3f200000    # -7.0f

    .line 237
    .line 238
    const/4 v13, 0x0

    .line 239
    const v14, -0x3f8851ec    # -3.87f

    .line 240
    .line 241
    .line 242
    const v15, -0x3fb7ae14    # -3.13f

    .line 243
    .line 244
    .line 245
    const/high16 v16, -0x3f200000    # -7.0f

    .line 246
    .line 247
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 248
    .line 249
    .line 250
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 251
    .line 252
    .line 253
    const/high16 v0, 0x41200000    # 10.0f

    .line 254
    .line 255
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 256
    .line 257
    .line 258
    const/high16 v0, 0x40000000    # 2.0f

    .line 259
    .line 260
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 261
    .line 262
    .line 263
    const/high16 v17, 0x41100000    # 9.0f

    .line 264
    .line 265
    const/high16 v18, 0x41100000    # 9.0f

    .line 266
    .line 267
    const v13, 0x409f0a3d    # 4.97f

    .line 268
    .line 269
    .line 270
    const/4 v14, 0x0

    .line 271
    const/high16 v15, 0x41100000    # 9.0f

    .line 272
    .line 273
    const v16, 0x4080f5c3    # 4.03f

    .line 274
    .line 275
    .line 276
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 277
    .line 278
    .line 279
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 280
    .line 281
    .line 282
    const/high16 v17, -0x3ed00000    # -11.0f

    .line 283
    .line 284
    const/high16 v18, -0x3ed00000    # -11.0f

    .line 285
    .line 286
    const/4 v13, 0x0

    .line 287
    const v14, -0x3f3d70a4    # -6.08f

    .line 288
    .line 289
    .line 290
    const v15, -0x3f623d71    # -4.93f

    .line 291
    .line 292
    .line 293
    const/high16 v16, -0x3ed00000    # -11.0f

    .line 294
    .line 295
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 296
    .line 297
    .line 298
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 299
    .line 300
    .line 301
    const/high16 v0, 0x41a80000    # 21.0f

    .line 302
    .line 303
    const/high16 v2, 0x40400000    # 3.0f

    .line 304
    .line 305
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 306
    .line 307
    .line 308
    const/high16 v0, 0x40400000    # 3.0f

    .line 309
    .line 310
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 311
    .line 312
    .line 313
    const/high16 v17, -0x40000000    # -2.0f

    .line 314
    .line 315
    const/high16 v18, 0x40000000    # 2.0f

    .line 316
    .line 317
    const v13, -0x40733333    # -1.1f

    .line 318
    .line 319
    .line 320
    const/4 v14, 0x0

    .line 321
    const/high16 v15, -0x40000000    # -2.0f

    .line 322
    .line 323
    const v16, 0x3f666666    # 0.9f

    .line 324
    .line 325
    .line 326
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 327
    .line 328
    .line 329
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 330
    .line 331
    .line 332
    const/high16 v0, 0x40000000    # 2.0f

    .line 333
    .line 334
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 335
    .line 336
    .line 337
    const/high16 v0, 0x40a00000    # 5.0f

    .line 338
    .line 339
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 340
    .line 341
    .line 342
    const/high16 v0, 0x41900000    # 18.0f

    .line 343
    .line 344
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 345
    .line 346
    .line 347
    const/high16 v0, 0x41600000    # 14.0f

    .line 348
    .line 349
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 350
    .line 351
    .line 352
    const/high16 v0, -0x3f200000    # -7.0f

    .line 353
    .line 354
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 355
    .line 356
    .line 357
    const/high16 v0, 0x40000000    # 2.0f

    .line 358
    .line 359
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 360
    .line 361
    .line 362
    const/high16 v0, 0x40e00000    # 7.0f

    .line 363
    .line 364
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 365
    .line 366
    .line 367
    const/high16 v17, 0x40000000    # 2.0f

    .line 368
    .line 369
    const/high16 v18, -0x40000000    # -2.0f

    .line 370
    .line 371
    const v13, 0x3f8ccccd    # 1.1f

    .line 372
    .line 373
    .line 374
    const/high16 v15, 0x40000000    # 2.0f

    .line 375
    .line 376
    const v16, -0x4099999a    # -0.9f

    .line 377
    .line 378
    .line 379
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 380
    .line 381
    .line 382
    const/high16 v0, 0x41b80000    # 23.0f

    .line 383
    .line 384
    const/high16 v2, 0x40a00000    # 5.0f

    .line 385
    .line 386
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 387
    .line 388
    .line 389
    const/high16 v17, -0x40000000    # -2.0f

    .line 390
    .line 391
    const/4 v13, 0x0

    .line 392
    const v14, -0x40733333    # -1.1f

    .line 393
    .line 394
    .line 395
    const v15, -0x4099999a    # -0.9f

    .line 396
    .line 397
    .line 398
    const/high16 v16, -0x40000000    # -2.0f

    .line 399
    .line 400
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 401
    .line 402
    .line 403
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 404
    .line 405
    .line 406
    const/high16 v0, 0x40e00000    # 7.0f

    .line 407
    .line 408
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 409
    .line 410
    .line 411
    const v0, 0x3fd0a3d7    # 1.63f

    .line 412
    .line 413
    .line 414
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 415
    .line 416
    .line 417
    const v17, 0x3f733333    # 0.95f

    .line 418
    .line 419
    .line 420
    const v18, 0x3ebd70a4    # 0.37f

    .line 421
    .line 422
    .line 423
    const v13, 0x3ea3d70a    # 0.32f

    .line 424
    .line 425
    .line 426
    const v14, 0x3dcccccd    # 0.1f

    .line 427
    .line 428
    .line 429
    const v15, 0x3f2147ae    # 0.63f

    .line 430
    .line 431
    .line 432
    const v16, 0x3e75c28f    # 0.24f

    .line 433
    .line 434
    .line 435
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 436
    .line 437
    .line 438
    const/high16 v0, 0x41100000    # 9.0f

    .line 439
    .line 440
    const/high16 v2, 0x41880000    # 17.0f

    .line 441
    .line 442
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 443
    .line 444
    .line 445
    const/high16 v0, 0x40c00000    # 6.0f

    .line 446
    .line 447
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 448
    .line 449
    .line 450
    const v0, -0x3f7051ec    # -4.49f

    .line 451
    .line 452
    .line 453
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 454
    .line 455
    .line 456
    const v17, 0x3ed70a3d    # 0.42f

    .line 457
    .line 458
    .line 459
    const v18, 0x3f6147ae    # 0.88f

    .line 460
    .line 461
    .line 462
    const v13, 0x3e19999a    # 0.15f

    .line 463
    .line 464
    .line 465
    const v14, 0x3e947ae1    # 0.29f

    .line 466
    .line 467
    .line 468
    const v15, 0x3e947ae1    # 0.29f

    .line 469
    .line 470
    .line 471
    const v16, 0x3f147ae1    # 0.58f

    .line 472
    .line 473
    .line 474
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 475
    .line 476
    .line 477
    const v17, 0x3ee147ae    # 0.44f

    .line 478
    .line 479
    .line 480
    const v18, 0x3f8f5c29    # 1.12f

    .line 481
    .line 482
    .line 483
    const v13, 0x3e23d70a    # 0.16f

    .line 484
    .line 485
    .line 486
    const v14, 0x3eb851ec    # 0.36f

    .line 487
    .line 488
    .line 489
    const v15, 0x3e9eb852    # 0.31f

    .line 490
    .line 491
    .line 492
    const v16, 0x3f3d70a4    # 0.74f

    .line 493
    .line 494
    .line 495
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 496
    .line 497
    .line 498
    const/high16 v0, 0x41980000    # 19.0f

    .line 499
    .line 500
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 501
    .line 502
    .line 503
    const/high16 v2, 0x40e00000    # 7.0f

    .line 504
    .line 505
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 506
    .line 507
    .line 508
    const/high16 v0, 0x40e00000    # 7.0f

    .line 509
    .line 510
    const/high16 v2, 0x40a00000    # 5.0f

    .line 511
    .line 512
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 513
    .line 514
    .line 515
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 516
    .line 517
    .line 518
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 519
    .line 520
    .line 521
    move-result-object v2

    .line 522
    const/16 v16, 0x3800

    .line 523
    .line 524
    const/16 v17, 0x0

    .line 525
    .line 526
    const/high16 v6, 0x3f800000    # 1.0f

    .line 527
    .line 528
    const/high16 v8, 0x3f800000    # 1.0f

    .line 529
    .line 530
    const/4 v7, 0x0

    .line 531
    const/high16 v12, 0x3f800000    # 1.0f

    .line 532
    .line 533
    const/4 v13, 0x0

    .line 534
    const/4 v14, 0x0

    .line 535
    const/4 v15, 0x0

    .line 536
    const-string v4, ""

    .line 537
    .line 538
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 539
    .line 540
    .line 541
    move-result-object v0

    .line 542
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 543
    .line 544
    .line 545
    move-result-object v0

    .line 546
    sput-object v0, Landroidx/compose/material/icons/twotone/CastConnectedKt;->_castConnected:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 547
    .line 548
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 549
    .line 550
    .line 551
    return-object v0
.end method
