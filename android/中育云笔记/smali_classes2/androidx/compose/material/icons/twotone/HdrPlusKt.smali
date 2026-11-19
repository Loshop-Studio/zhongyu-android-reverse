.class public final Landroidx/compose/material/icons/twotone/HdrPlusKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _hdrPlus:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getHdrPlus(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/HdrPlusKt;->_hdrPlus:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.HdrPlus"

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
    const/high16 v4, 0x40800000    # 4.0f

    .line 71
    .line 72
    const/high16 v6, 0x41400000    # 12.0f

    .line 73
    .line 74
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v25, -0x3f000000    # -8.0f

    .line 78
    .line 79
    const/high16 v26, 0x41000000    # 8.0f

    .line 80
    .line 81
    const v21, -0x3f72e148    # -4.41f

    .line 82
    .line 83
    .line 84
    const/16 v22, 0x0

    .line 85
    .line 86
    const/high16 v23, -0x3f000000    # -8.0f

    .line 87
    .line 88
    const v24, 0x4065c28f    # 3.59f

    .line 89
    .line 90
    .line 91
    move-object/from16 v20, v2

    .line 92
    .line 93
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 94
    .line 95
    .line 96
    const/high16 v25, 0x40400000    # 3.0f

    .line 97
    .line 98
    const v26, 0x40c7ae14    # 6.24f

    .line 99
    .line 100
    .line 101
    const/16 v21, 0x0

    .line 102
    .line 103
    const v22, 0x402147ae    # 2.52f

    .line 104
    .line 105
    .line 106
    const v23, 0x3f95c28f    # 1.17f

    .line 107
    .line 108
    .line 109
    const v24, 0x4098a3d7    # 4.77f

    .line 110
    .line 111
    .line 112
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 113
    .line 114
    .line 115
    const/high16 v4, 0x41500000    # 13.0f

    .line 116
    .line 117
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 118
    .line 119
    .line 120
    const/high16 v4, 0x40600000    # 3.5f

    .line 121
    .line 122
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 123
    .line 124
    .line 125
    const/high16 v25, 0x3fc00000    # 1.5f

    .line 126
    .line 127
    const/high16 v26, 0x3fc00000    # 1.5f

    .line 128
    .line 129
    const v21, 0x3f4ccccd    # 0.8f

    .line 130
    .line 131
    .line 132
    const/16 v22, 0x0

    .line 133
    .line 134
    const/high16 v23, 0x3fc00000    # 1.5f

    .line 135
    .line 136
    const v24, 0x3f333333    # 0.7f

    .line 137
    .line 138
    .line 139
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 140
    .line 141
    .line 142
    const/high16 v4, 0x3f800000    # 1.0f

    .line 143
    .line 144
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 145
    .line 146
    .line 147
    const v25, -0x4099999a    # -0.9f

    .line 148
    .line 149
    .line 150
    const v26, 0x3fb33333    # 1.4f

    .line 151
    .line 152
    .line 153
    const/16 v21, 0x0

    .line 154
    .line 155
    const v22, 0x3f19999a    # 0.6f

    .line 156
    .line 157
    .line 158
    const v23, -0x41333333    # -0.4f

    .line 159
    .line 160
    .line 161
    const v24, 0x3f8ccccd    # 1.1f

    .line 162
    .line 163
    .line 164
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 165
    .line 166
    .line 167
    const/high16 v4, 0x41980000    # 19.0f

    .line 168
    .line 169
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 170
    .line 171
    .line 172
    const/high16 v4, -0x40400000    # -1.5f

    .line 173
    .line 174
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 175
    .line 176
    .line 177
    const v4, -0x4099999a    # -0.9f

    .line 178
    .line 179
    .line 180
    const/high16 v6, -0x40000000    # -2.0f

    .line 181
    .line 182
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 183
    .line 184
    .line 185
    const/high16 v4, 0x41080000    # 8.5f

    .line 186
    .line 187
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 188
    .line 189
    .line 190
    const/high16 v4, 0x40000000    # 2.0f

    .line 191
    .line 192
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 193
    .line 194
    .line 195
    const v4, 0x4102147b    # 8.13f

    .line 196
    .line 197
    .line 198
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 199
    .line 200
    .line 201
    const v25, 0x4077ae14    # 3.87f

    .line 202
    .line 203
    .line 204
    const/high16 v26, 0x3f800000    # 1.0f

    .line 205
    .line 206
    const v21, 0x3f933333    # 1.15f

    .line 207
    .line 208
    .line 209
    const v22, 0x3f23d70a    # 0.64f

    .line 210
    .line 211
    .line 212
    const v23, 0x401e147b    # 2.47f

    .line 213
    .line 214
    .line 215
    const/high16 v24, 0x3f800000    # 1.0f

    .line 216
    .line 217
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 218
    .line 219
    .line 220
    const/high16 v25, 0x41000000    # 8.0f

    .line 221
    .line 222
    const/high16 v26, -0x3f000000    # -8.0f

    .line 223
    .line 224
    const v21, 0x408d1eb8    # 4.41f

    .line 225
    .line 226
    .line 227
    const/16 v22, 0x0

    .line 228
    .line 229
    const/high16 v23, 0x41000000    # 8.0f

    .line 230
    .line 231
    const v24, -0x3f9a3d71    # -3.59f

    .line 232
    .line 233
    .line 234
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 235
    .line 236
    .line 237
    const/high16 v25, 0x41400000    # 12.0f

    .line 238
    .line 239
    const/high16 v26, 0x40800000    # 4.0f

    .line 240
    .line 241
    const/high16 v21, 0x41a00000    # 20.0f

    .line 242
    .line 243
    const v22, 0x40f2e148    # 7.59f

    .line 244
    .line 245
    .line 246
    const v23, 0x418347ae    # 16.41f

    .line 247
    .line 248
    .line 249
    const/high16 v24, 0x40800000    # 4.0f

    .line 250
    .line 251
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 252
    .line 253
    .line 254
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 255
    .line 256
    .line 257
    const/high16 v4, 0x41400000    # 12.0f

    .line 258
    .line 259
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 260
    .line 261
    .line 262
    const/high16 v4, -0x40400000    # -1.5f

    .line 263
    .line 264
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 265
    .line 266
    .line 267
    const/high16 v4, 0x41180000    # 9.5f

    .line 268
    .line 269
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 270
    .line 271
    .line 272
    const/high16 v4, -0x40000000    # -2.0f

    .line 273
    .line 274
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 275
    .line 276
    .line 277
    const/high16 v4, 0x41400000    # 12.0f

    .line 278
    .line 279
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 280
    .line 281
    .line 282
    const/high16 v4, 0x40e00000    # 7.0f

    .line 283
    .line 284
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 285
    .line 286
    .line 287
    const/high16 v4, 0x40c00000    # 6.0f

    .line 288
    .line 289
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 290
    .line 291
    .line 292
    const/high16 v4, 0x3fc00000    # 1.5f

    .line 293
    .line 294
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 295
    .line 296
    .line 297
    const/high16 v4, 0x40000000    # 2.0f

    .line 298
    .line 299
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 300
    .line 301
    .line 302
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 303
    .line 304
    .line 305
    const/high16 v4, 0x40c00000    # 6.0f

    .line 306
    .line 307
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 308
    .line 309
    .line 310
    const/high16 v4, 0x41400000    # 12.0f

    .line 311
    .line 312
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 313
    .line 314
    .line 315
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 316
    .line 317
    .line 318
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 319
    .line 320
    .line 321
    const/high16 v4, 0x418c0000    # 17.5f

    .line 322
    .line 323
    const/high16 v6, 0x41800000    # 16.0f

    .line 324
    .line 325
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 326
    .line 327
    .line 328
    const/high16 v4, 0x41800000    # 16.0f

    .line 329
    .line 330
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 331
    .line 332
    .line 333
    const/high16 v4, 0x3fc00000    # 1.5f

    .line 334
    .line 335
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 336
    .line 337
    .line 338
    const/high16 v4, -0x40400000    # -1.5f

    .line 339
    .line 340
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 341
    .line 342
    .line 343
    const/high16 v4, 0x41800000    # 16.0f

    .line 344
    .line 345
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 346
    .line 347
    .line 348
    const/high16 v4, 0x41500000    # 13.0f

    .line 349
    .line 350
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 351
    .line 352
    .line 353
    const/high16 v4, -0x40400000    # -1.5f

    .line 354
    .line 355
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 356
    .line 357
    .line 358
    const/high16 v4, 0x3fc00000    # 1.5f

    .line 359
    .line 360
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 361
    .line 362
    .line 363
    const/high16 v4, 0x41500000    # 13.0f

    .line 364
    .line 365
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 366
    .line 367
    .line 368
    const/high16 v4, 0x41800000    # 16.0f

    .line 369
    .line 370
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 371
    .line 372
    .line 373
    const v4, 0x3fbeb852    # 1.49f

    .line 374
    .line 375
    .line 376
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 377
    .line 378
    .line 379
    const/high16 v4, 0x3fc00000    # 1.5f

    .line 380
    .line 381
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 382
    .line 383
    .line 384
    const/high16 v4, 0x41800000    # 16.0f

    .line 385
    .line 386
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 387
    .line 388
    .line 389
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 390
    .line 391
    .line 392
    const/high16 v4, 0x418c0000    # 17.5f

    .line 393
    .line 394
    const/high16 v6, 0x41280000    # 10.5f

    .line 395
    .line 396
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 397
    .line 398
    .line 399
    const/high16 v25, -0x40400000    # -1.5f

    .line 400
    .line 401
    const/high16 v26, 0x3fc00000    # 1.5f

    .line 402
    .line 403
    const/16 v21, 0x0

    .line 404
    .line 405
    const v22, 0x3f4ccccd    # 0.8f

    .line 406
    .line 407
    .line 408
    const v23, -0x40cccccd    # -0.7f

    .line 409
    .line 410
    .line 411
    const/high16 v24, 0x3fc00000    # 1.5f

    .line 412
    .line 413
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 414
    .line 415
    .line 416
    const/high16 v4, -0x3fc00000    # -3.0f

    .line 417
    .line 418
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 419
    .line 420
    .line 421
    const/high16 v4, 0x40c00000    # 6.0f

    .line 422
    .line 423
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 424
    .line 425
    .line 426
    const/high16 v4, 0x40400000    # 3.0f

    .line 427
    .line 428
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 429
    .line 430
    .line 431
    const/high16 v25, 0x3fc00000    # 1.5f

    .line 432
    .line 433
    const v21, 0x3f4ccccd    # 0.8f

    .line 434
    .line 435
    .line 436
    const/16 v22, 0x0

    .line 437
    .line 438
    const/high16 v23, 0x3fc00000    # 1.5f

    .line 439
    .line 440
    const v24, 0x3f333333    # 0.7f

    .line 441
    .line 442
    .line 443
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 444
    .line 445
    .line 446
    const/high16 v4, 0x41280000    # 10.5f

    .line 447
    .line 448
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 449
    .line 450
    .line 451
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 452
    .line 453
    .line 454
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 455
    .line 456
    .line 457
    move-result-object v2

    .line 458
    const/16 v16, 0x3800

    .line 459
    .line 460
    const/16 v17, 0x0

    .line 461
    .line 462
    const v6, 0x3e99999a    # 0.3f

    .line 463
    .line 464
    .line 465
    const v8, 0x3e99999a    # 0.3f

    .line 466
    .line 467
    .line 468
    const/4 v7, 0x0

    .line 469
    const/high16 v9, 0x3f800000    # 1.0f

    .line 470
    .line 471
    const/high16 v12, 0x3f800000    # 1.0f

    .line 472
    .line 473
    const/4 v13, 0x0

    .line 474
    const/4 v14, 0x0

    .line 475
    const/4 v15, 0x0

    .line 476
    const-string v4, ""

    .line 477
    .line 478
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 479
    .line 480
    .line 481
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 482
    .line 483
    .line 484
    move-result v3

    .line 485
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 486
    .line 487
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 488
    .line 489
    .line 490
    move-result-wide v6

    .line 491
    const/4 v2, 0x0

    .line 492
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 493
    .line 494
    .line 495
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 496
    .line 497
    .line 498
    move-result v10

    .line 499
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 500
    .line 501
    .line 502
    move-result v11

    .line 503
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 504
    .line 505
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 506
    .line 507
    .line 508
    const/high16 v4, 0x40f00000    # 7.5f

    .line 509
    .line 510
    const/high16 v6, 0x41680000    # 14.5f

    .line 511
    .line 512
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 513
    .line 514
    .line 515
    const/high16 v4, 0x3fc00000    # 1.5f

    .line 516
    .line 517
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 518
    .line 519
    .line 520
    const/high16 v4, 0x40400000    # 3.0f

    .line 521
    .line 522
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 523
    .line 524
    .line 525
    const/high16 v4, -0x40400000    # -1.5f

    .line 526
    .line 527
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 528
    .line 529
    .line 530
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 531
    .line 532
    .line 533
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 534
    .line 535
    .line 536
    move-result-object v2

    .line 537
    const v6, 0x3e99999a    # 0.3f

    .line 538
    .line 539
    .line 540
    const/4 v7, 0x0

    .line 541
    const-string v4, ""

    .line 542
    .line 543
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 544
    .line 545
    .line 546
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 547
    .line 548
    .line 549
    move-result v3

    .line 550
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 551
    .line 552
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 553
    .line 554
    .line 555
    move-result-wide v6

    .line 556
    const/4 v2, 0x0

    .line 557
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 558
    .line 559
    .line 560
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 561
    .line 562
    .line 563
    move-result v10

    .line 564
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 565
    .line 566
    .line 567
    move-result v11

    .line 568
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 569
    .line 570
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 571
    .line 572
    .line 573
    const/high16 v4, 0x41680000    # 14.5f

    .line 574
    .line 575
    const/high16 v6, 0x41080000    # 8.5f

    .line 576
    .line 577
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 578
    .line 579
    .line 580
    const/high16 v4, 0x40000000    # 2.0f

    .line 581
    .line 582
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 583
    .line 584
    .line 585
    const/high16 v4, 0x3f800000    # 1.0f

    .line 586
    .line 587
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 588
    .line 589
    .line 590
    const/high16 v4, -0x40000000    # -2.0f

    .line 591
    .line 592
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 593
    .line 594
    .line 595
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 596
    .line 597
    .line 598
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 599
    .line 600
    .line 601
    move-result-object v2

    .line 602
    const v6, 0x3e99999a    # 0.3f

    .line 603
    .line 604
    .line 605
    const/4 v7, 0x0

    .line 606
    const-string v4, ""

    .line 607
    .line 608
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 609
    .line 610
    .line 611
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 612
    .line 613
    .line 614
    move-result v3

    .line 615
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 616
    .line 617
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 618
    .line 619
    .line 620
    move-result-wide v6

    .line 621
    const/4 v2, 0x0

    .line 622
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 623
    .line 624
    .line 625
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 626
    .line 627
    .line 628
    move-result v10

    .line 629
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 630
    .line 631
    .line 632
    move-result v11

    .line 633
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 634
    .line 635
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 636
    .line 637
    .line 638
    const/high16 v4, 0x40000000    # 2.0f

    .line 639
    .line 640
    const/high16 v6, 0x41400000    # 12.0f

    .line 641
    .line 642
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 643
    .line 644
    .line 645
    const/high16 v25, 0x40000000    # 2.0f

    .line 646
    .line 647
    const/high16 v26, 0x41400000    # 12.0f

    .line 648
    .line 649
    const v21, 0x40cf5c29    # 6.48f

    .line 650
    .line 651
    .line 652
    const/high16 v22, 0x40000000    # 2.0f

    .line 653
    .line 654
    const/high16 v23, 0x40000000    # 2.0f

    .line 655
    .line 656
    const v24, 0x40cf5c29    # 6.48f

    .line 657
    .line 658
    .line 659
    move-object/from16 v20, v2

    .line 660
    .line 661
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 662
    .line 663
    .line 664
    const v4, 0x408f5c29    # 4.48f

    .line 665
    .line 666
    .line 667
    const/high16 v6, 0x41200000    # 10.0f

    .line 668
    .line 669
    invoke-virtual {v2, v4, v6, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 670
    .line 671
    .line 672
    const v4, -0x3f70a3d7    # -4.48f

    .line 673
    .line 674
    .line 675
    const/high16 v6, -0x3ee00000    # -10.0f

    .line 676
    .line 677
    const/high16 v7, 0x41200000    # 10.0f

    .line 678
    .line 679
    invoke-virtual {v2, v7, v4, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 680
    .line 681
    .line 682
    const v4, 0x418c28f6    # 17.52f

    .line 683
    .line 684
    .line 685
    const/high16 v6, 0x40000000    # 2.0f

    .line 686
    .line 687
    const/high16 v7, 0x41400000    # 12.0f

    .line 688
    .line 689
    invoke-virtual {v2, v4, v6, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 690
    .line 691
    .line 692
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 693
    .line 694
    .line 695
    const/high16 v4, 0x41a00000    # 20.0f

    .line 696
    .line 697
    const/high16 v6, 0x41400000    # 12.0f

    .line 698
    .line 699
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 700
    .line 701
    .line 702
    const v25, -0x3f8851ec    # -3.87f

    .line 703
    .line 704
    .line 705
    const/high16 v26, -0x40800000    # -1.0f

    .line 706
    .line 707
    const v21, -0x404ccccd    # -1.4f

    .line 708
    .line 709
    .line 710
    const/16 v22, 0x0

    .line 711
    .line 712
    const v23, -0x3fd1eb85    # -2.72f

    .line 713
    .line 714
    .line 715
    const v24, -0x4147ae14    # -0.36f

    .line 716
    .line 717
    .line 718
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 719
    .line 720
    .line 721
    const/high16 v4, 0x41080000    # 8.5f

    .line 722
    .line 723
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 724
    .line 725
    .line 726
    const/high16 v4, -0x40000000    # -2.0f

    .line 727
    .line 728
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 729
    .line 730
    .line 731
    const v4, 0x3f8ccccd    # 1.1f

    .line 732
    .line 733
    .line 734
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 735
    .line 736
    .line 737
    const v4, 0x3f666666    # 0.9f

    .line 738
    .line 739
    .line 740
    const/high16 v6, 0x40000000    # 2.0f

    .line 741
    .line 742
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 743
    .line 744
    .line 745
    const/high16 v4, 0x41400000    # 12.0f

    .line 746
    .line 747
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 748
    .line 749
    .line 750
    const v4, -0x3ff9999a    # -2.1f

    .line 751
    .line 752
    .line 753
    const v6, -0x4099999a    # -0.9f

    .line 754
    .line 755
    .line 756
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 757
    .line 758
    .line 759
    const v25, 0x3f666666    # 0.9f

    .line 760
    .line 761
    .line 762
    const v26, -0x404ccccd    # -1.4f

    .line 763
    .line 764
    .line 765
    const/high16 v21, 0x3f000000    # 0.5f

    .line 766
    .line 767
    const v22, -0x41666666    # -0.3f

    .line 768
    .line 769
    .line 770
    const v23, 0x3f666666    # 0.9f

    .line 771
    .line 772
    .line 773
    const v24, -0x40b33333    # -0.8f

    .line 774
    .line 775
    .line 776
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 777
    .line 778
    .line 779
    const/high16 v4, -0x40800000    # -1.0f

    .line 780
    .line 781
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 782
    .line 783
    .line 784
    const/high16 v25, -0x40400000    # -1.5f

    .line 785
    .line 786
    const/high16 v26, -0x40400000    # -1.5f

    .line 787
    .line 788
    const/16 v21, 0x0

    .line 789
    .line 790
    const v22, -0x40b33333    # -0.8f

    .line 791
    .line 792
    .line 793
    const v23, -0x40cccccd    # -0.7f

    .line 794
    .line 795
    .line 796
    const/high16 v24, -0x40400000    # -1.5f

    .line 797
    .line 798
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 799
    .line 800
    .line 801
    const/high16 v4, 0x40e00000    # 7.0f

    .line 802
    .line 803
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 804
    .line 805
    .line 806
    const v4, 0x40a7ae14    # 5.24f

    .line 807
    .line 808
    .line 809
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 810
    .line 811
    .line 812
    const/high16 v25, 0x40800000    # 4.0f

    .line 813
    .line 814
    const/high16 v26, 0x41400000    # 12.0f

    .line 815
    .line 816
    const v21, 0x40a570a4    # 5.17f

    .line 817
    .line 818
    .line 819
    const v22, 0x418628f6    # 16.77f

    .line 820
    .line 821
    .line 822
    const/high16 v23, 0x40800000    # 4.0f

    .line 823
    .line 824
    const v24, 0x416851ec    # 14.52f

    .line 825
    .line 826
    .line 827
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 828
    .line 829
    .line 830
    const/high16 v25, 0x41000000    # 8.0f

    .line 831
    .line 832
    const/high16 v26, -0x3f000000    # -8.0f

    .line 833
    .line 834
    const/16 v21, 0x0

    .line 835
    .line 836
    const v22, -0x3f72e148    # -4.41f

    .line 837
    .line 838
    .line 839
    const v23, 0x4065c28f    # 3.59f

    .line 840
    .line 841
    .line 842
    const/high16 v24, -0x3f000000    # -8.0f

    .line 843
    .line 844
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 845
    .line 846
    .line 847
    const v4, 0x4065c28f    # 3.59f

    .line 848
    .line 849
    .line 850
    const/high16 v6, 0x41000000    # 8.0f

    .line 851
    .line 852
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 853
    .line 854
    .line 855
    const/high16 v25, 0x41400000    # 12.0f

    .line 856
    .line 857
    const/high16 v26, 0x41a00000    # 20.0f

    .line 858
    .line 859
    const/high16 v21, 0x41a00000    # 20.0f

    .line 860
    .line 861
    const v22, 0x418347ae    # 16.41f

    .line 862
    .line 863
    .line 864
    const v23, 0x418347ae    # 16.41f

    .line 865
    .line 866
    .line 867
    const/high16 v24, 0x41a00000    # 20.0f

    .line 868
    .line 869
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 870
    .line 871
    .line 872
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 873
    .line 874
    .line 875
    const/high16 v4, 0x41780000    # 15.5f

    .line 876
    .line 877
    const/high16 v6, 0x41080000    # 8.5f

    .line 878
    .line 879
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 880
    .line 881
    .line 882
    const/high16 v4, -0x40800000    # -1.0f

    .line 883
    .line 884
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 885
    .line 886
    .line 887
    const/high16 v4, 0x40000000    # 2.0f

    .line 888
    .line 889
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 890
    .line 891
    .line 892
    const/high16 v4, 0x3f800000    # 1.0f

    .line 893
    .line 894
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 895
    .line 896
    .line 897
    const/high16 v4, 0x41080000    # 8.5f

    .line 898
    .line 899
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 900
    .line 901
    .line 902
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 903
    .line 904
    .line 905
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 906
    .line 907
    .line 908
    move-result-object v2

    .line 909
    const/high16 v6, 0x3f800000    # 1.0f

    .line 910
    .line 911
    const/high16 v8, 0x3f800000    # 1.0f

    .line 912
    .line 913
    const/4 v7, 0x0

    .line 914
    const-string v4, ""

    .line 915
    .line 916
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 917
    .line 918
    .line 919
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 920
    .line 921
    .line 922
    move-result v3

    .line 923
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 924
    .line 925
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 926
    .line 927
    .line 928
    move-result-wide v6

    .line 929
    const/4 v2, 0x0

    .line 930
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 931
    .line 932
    .line 933
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 934
    .line 935
    .line 936
    move-result v10

    .line 937
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 938
    .line 939
    .line 940
    move-result v11

    .line 941
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 942
    .line 943
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 944
    .line 945
    .line 946
    const/high16 v4, 0x41000000    # 8.0f

    .line 947
    .line 948
    const/high16 v6, 0x41280000    # 10.5f

    .line 949
    .line 950
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 951
    .line 952
    .line 953
    const/high16 v4, -0x40000000    # -2.0f

    .line 954
    .line 955
    const/4 v6, 0x0

    .line 956
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 957
    .line 958
    .line 959
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 960
    .line 961
    .line 962
    const/high16 v4, -0x40400000    # -1.5f

    .line 963
    .line 964
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 965
    .line 966
    .line 967
    const/high16 v4, 0x40c00000    # 6.0f

    .line 968
    .line 969
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 970
    .line 971
    .line 972
    const/high16 v4, 0x3fc00000    # 1.5f

    .line 973
    .line 974
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 975
    .line 976
    .line 977
    const/high16 v4, -0x3fe00000    # -2.5f

    .line 978
    .line 979
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 980
    .line 981
    .line 982
    const/high16 v4, 0x40000000    # 2.0f

    .line 983
    .line 984
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 985
    .line 986
    .line 987
    const/high16 v4, 0x40200000    # 2.5f

    .line 988
    .line 989
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 990
    .line 991
    .line 992
    const/high16 v4, 0x3fc00000    # 1.5f

    .line 993
    .line 994
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 995
    .line 996
    .line 997
    const/high16 v4, -0x3f400000    # -6.0f

    .line 998
    .line 999
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1000
    .line 1001
    .line 1002
    const/high16 v4, -0x40400000    # -1.5f

    .line 1003
    .line 1004
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1005
    .line 1006
    .line 1007
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1008
    .line 1009
    .line 1010
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 1011
    .line 1012
    .line 1013
    move-result-object v2

    .line 1014
    const/high16 v6, 0x3f800000    # 1.0f

    .line 1015
    .line 1016
    const/4 v7, 0x0

    .line 1017
    const-string v4, ""

    .line 1018
    .line 1019
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 1020
    .line 1021
    .line 1022
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 1023
    .line 1024
    .line 1025
    move-result v3

    .line 1026
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 1027
    .line 1028
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 1029
    .line 1030
    .line 1031
    move-result-wide v6

    .line 1032
    const/4 v2, 0x0

    .line 1033
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 1034
    .line 1035
    .line 1036
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 1037
    .line 1038
    .line 1039
    move-result v10

    .line 1040
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 1041
    .line 1042
    .line 1043
    move-result v11

    .line 1044
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1045
    .line 1046
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 1047
    .line 1048
    .line 1049
    const/high16 v4, 0x40c00000    # 6.0f

    .line 1050
    .line 1051
    const/high16 v6, 0x41800000    # 16.0f

    .line 1052
    .line 1053
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1054
    .line 1055
    .line 1056
    const/high16 v4, -0x3fc00000    # -3.0f

    .line 1057
    .line 1058
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1059
    .line 1060
    .line 1061
    const/high16 v4, 0x40c00000    # 6.0f

    .line 1062
    .line 1063
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1064
    .line 1065
    .line 1066
    const/high16 v4, 0x40400000    # 3.0f

    .line 1067
    .line 1068
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1069
    .line 1070
    .line 1071
    const/high16 v25, 0x3fc00000    # 1.5f

    .line 1072
    .line 1073
    const/high16 v26, -0x40400000    # -1.5f

    .line 1074
    .line 1075
    const v21, 0x3f4ccccd    # 0.8f

    .line 1076
    .line 1077
    .line 1078
    const/16 v22, 0x0

    .line 1079
    .line 1080
    const/high16 v23, 0x3fc00000    # 1.5f

    .line 1081
    .line 1082
    const v24, -0x40cccccd    # -0.7f

    .line 1083
    .line 1084
    .line 1085
    move-object/from16 v20, v2

    .line 1086
    .line 1087
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1088
    .line 1089
    .line 1090
    const/high16 v4, -0x3fc00000    # -3.0f

    .line 1091
    .line 1092
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1093
    .line 1094
    .line 1095
    const/high16 v25, 0x41800000    # 16.0f

    .line 1096
    .line 1097
    const/high16 v26, 0x40c00000    # 6.0f

    .line 1098
    .line 1099
    const/high16 v21, 0x418c0000    # 17.5f

    .line 1100
    .line 1101
    const v22, 0x40d66666    # 6.7f

    .line 1102
    .line 1103
    .line 1104
    const v23, 0x41866666    # 16.8f

    .line 1105
    .line 1106
    .line 1107
    const/high16 v24, 0x40c00000    # 6.0f

    .line 1108
    .line 1109
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1110
    .line 1111
    .line 1112
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1113
    .line 1114
    .line 1115
    const/high16 v4, 0x41280000    # 10.5f

    .line 1116
    .line 1117
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1118
    .line 1119
    .line 1120
    const/high16 v4, -0x40400000    # -1.5f

    .line 1121
    .line 1122
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1123
    .line 1124
    .line 1125
    const/high16 v4, -0x3fc00000    # -3.0f

    .line 1126
    .line 1127
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1128
    .line 1129
    .line 1130
    const/high16 v4, 0x41800000    # 16.0f

    .line 1131
    .line 1132
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1133
    .line 1134
    .line 1135
    const/high16 v4, 0x41280000    # 10.5f

    .line 1136
    .line 1137
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1138
    .line 1139
    .line 1140
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1141
    .line 1142
    .line 1143
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 1144
    .line 1145
    .line 1146
    move-result-object v2

    .line 1147
    const/high16 v6, 0x3f800000    # 1.0f

    .line 1148
    .line 1149
    const/4 v7, 0x0

    .line 1150
    const-string v4, ""

    .line 1151
    .line 1152
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 1153
    .line 1154
    .line 1155
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 1156
    .line 1157
    .line 1158
    move-result v3

    .line 1159
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 1160
    .line 1161
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 1162
    .line 1163
    .line 1164
    move-result-wide v6

    .line 1165
    const/4 v0, 0x0

    .line 1166
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 1167
    .line 1168
    .line 1169
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 1170
    .line 1171
    .line 1172
    move-result v10

    .line 1173
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 1174
    .line 1175
    .line 1176
    move-result v11

    .line 1177
    new-instance v0, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1178
    .line 1179
    invoke-direct {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 1180
    .line 1181
    .line 1182
    const/high16 v2, 0x41500000    # 13.0f

    .line 1183
    .line 1184
    const/high16 v4, 0x41800000    # 16.0f

    .line 1185
    .line 1186
    invoke-virtual {v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1187
    .line 1188
    .line 1189
    const/high16 v2, -0x40400000    # -1.5f

    .line 1190
    .line 1191
    const/4 v4, 0x0

    .line 1192
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1193
    .line 1194
    .line 1195
    const/high16 v2, 0x3fc00000    # 1.5f

    .line 1196
    .line 1197
    invoke-virtual {v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1198
    .line 1199
    .line 1200
    const/high16 v2, -0x40400000    # -1.5f

    .line 1201
    .line 1202
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1203
    .line 1204
    .line 1205
    const/high16 v2, 0x3fc00000    # 1.5f

    .line 1206
    .line 1207
    invoke-virtual {v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1208
    .line 1209
    .line 1210
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1211
    .line 1212
    .line 1213
    invoke-virtual {v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1214
    .line 1215
    .line 1216
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1217
    .line 1218
    .line 1219
    const/high16 v2, -0x40400000    # -1.5f

    .line 1220
    .line 1221
    invoke-virtual {v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1222
    .line 1223
    .line 1224
    const/high16 v2, 0x3fc00000    # 1.5f

    .line 1225
    .line 1226
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1227
    .line 1228
    .line 1229
    const v2, -0x403eb852    # -1.51f

    .line 1230
    .line 1231
    .line 1232
    invoke-virtual {v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1233
    .line 1234
    .line 1235
    const/high16 v2, -0x40400000    # -1.5f

    .line 1236
    .line 1237
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1238
    .line 1239
    .line 1240
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1241
    .line 1242
    .line 1243
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 1244
    .line 1245
    .line 1246
    move-result-object v2

    .line 1247
    const/high16 v6, 0x3f800000    # 1.0f

    .line 1248
    .line 1249
    const/4 v7, 0x0

    .line 1250
    const-string v4, ""

    .line 1251
    .line 1252
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 1253
    .line 1254
    .line 1255
    move-result-object v0

    .line 1256
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1257
    .line 1258
    .line 1259
    move-result-object v0

    .line 1260
    sput-object v0, Landroidx/compose/material/icons/twotone/HdrPlusKt;->_hdrPlus:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1261
    .line 1262
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 1263
    .line 1264
    .line 1265
    return-object v0
.end method
