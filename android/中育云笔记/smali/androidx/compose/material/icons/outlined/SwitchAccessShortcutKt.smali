.class public final Landroidx/compose/material/icons/outlined/SwitchAccessShortcutKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _switchAccessShortcut:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getSwitchAccessShortcut(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/outlined/SwitchAccessShortcutKt;->_switchAccessShortcut:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Outlined.SwitchAccessShortcut"

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
    const v0, 0x40e1eb85    # 7.06f

    .line 71
    .line 72
    .line 73
    const v2, 0x410f0a3d    # 8.94f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const/high16 v0, 0x40a00000    # 5.0f

    .line 80
    .line 81
    const/high16 v2, 0x41000000    # 8.0f

    .line 82
    .line 83
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 84
    .line 85
    .line 86
    const v0, -0x408f5c29    # -0.94f

    .line 87
    .line 88
    .line 89
    const v2, 0x4003d70a    # 2.06f

    .line 90
    .line 91
    .line 92
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 93
    .line 94
    .line 95
    const/high16 v0, 0x40a00000    # 5.0f

    .line 96
    .line 97
    const/high16 v2, 0x41000000    # 8.0f

    .line 98
    .line 99
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 100
    .line 101
    .line 102
    const v0, 0x3f70a3d7    # 0.94f

    .line 103
    .line 104
    .line 105
    const v2, 0x4003d70a    # 2.06f

    .line 106
    .line 107
    .line 108
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 109
    .line 110
    .line 111
    const/high16 v0, 0x41300000    # 11.0f

    .line 112
    .line 113
    const/high16 v2, 0x41000000    # 8.0f

    .line 114
    .line 115
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 116
    .line 117
    .line 118
    const v0, 0x410f0a3d    # 8.94f

    .line 119
    .line 120
    .line 121
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 122
    .line 123
    .line 124
    const/high16 v0, 0x41300000    # 11.0f

    .line 125
    .line 126
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 127
    .line 128
    .line 129
    const v0, 0x40e1eb85    # 7.06f

    .line 130
    .line 131
    .line 132
    const v2, 0x410f0a3d    # 8.94f

    .line 133
    .line 134
    .line 135
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 136
    .line 137
    .line 138
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 139
    .line 140
    .line 141
    const/high16 v0, 0x41a80000    # 21.0f

    .line 142
    .line 143
    const/high16 v2, 0x41000000    # 8.0f

    .line 144
    .line 145
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 146
    .line 147
    .line 148
    const v0, -0x3ffc28f6    # -2.06f

    .line 149
    .line 150
    .line 151
    const v2, 0x3f70a3d7    # 0.94f

    .line 152
    .line 153
    .line 154
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 155
    .line 156
    .line 157
    const/high16 v0, 0x41900000    # 18.0f

    .line 158
    .line 159
    const/high16 v2, 0x41300000    # 11.0f

    .line 160
    .line 161
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 162
    .line 163
    .line 164
    const v0, -0x3ffc28f6    # -2.06f

    .line 165
    .line 166
    .line 167
    const v2, -0x408f5c29    # -0.94f

    .line 168
    .line 169
    .line 170
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 171
    .line 172
    .line 173
    const/high16 v0, 0x41700000    # 15.0f

    .line 174
    .line 175
    const/high16 v2, 0x41000000    # 8.0f

    .line 176
    .line 177
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 178
    .line 179
    .line 180
    const v0, -0x408f5c29    # -0.94f

    .line 181
    .line 182
    .line 183
    const v2, 0x4003d70a    # 2.06f

    .line 184
    .line 185
    .line 186
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 187
    .line 188
    .line 189
    const/high16 v0, 0x41900000    # 18.0f

    .line 190
    .line 191
    const/high16 v2, 0x40a00000    # 5.0f

    .line 192
    .line 193
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 194
    .line 195
    .line 196
    const v0, 0x3f70a3d7    # 0.94f

    .line 197
    .line 198
    .line 199
    const v2, 0x4003d70a    # 2.06f

    .line 200
    .line 201
    .line 202
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 203
    .line 204
    .line 205
    const/high16 v0, 0x41a80000    # 21.0f

    .line 206
    .line 207
    const/high16 v2, 0x41000000    # 8.0f

    .line 208
    .line 209
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 210
    .line 211
    .line 212
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 213
    .line 214
    .line 215
    const v0, 0x4145eb85    # 12.37f

    .line 216
    .line 217
    .line 218
    const v2, 0x408bd70a    # 4.37f

    .line 219
    .line 220
    .line 221
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 222
    .line 223
    .line 224
    const/high16 v0, 0x40400000    # 3.0f

    .line 225
    .line 226
    const/high16 v2, 0x41500000    # 13.0f

    .line 227
    .line 228
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 229
    .line 230
    .line 231
    const v0, 0x3faf5c29    # 1.37f

    .line 232
    .line 233
    .line 234
    const v2, 0x3f2147ae    # 0.63f

    .line 235
    .line 236
    .line 237
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 238
    .line 239
    .line 240
    const/high16 v0, 0x41700000    # 15.0f

    .line 241
    .line 242
    const/high16 v2, 0x40a00000    # 5.0f

    .line 243
    .line 244
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 245
    .line 246
    .line 247
    const v0, -0x4050a3d7    # -1.37f

    .line 248
    .line 249
    .line 250
    const v2, 0x3f2147ae    # 0.63f

    .line 251
    .line 252
    .line 253
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 254
    .line 255
    .line 256
    const/high16 v0, 0x41500000    # 13.0f

    .line 257
    .line 258
    const/high16 v2, 0x40e00000    # 7.0f

    .line 259
    .line 260
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 261
    .line 262
    .line 263
    const v0, -0x40deb852    # -0.63f

    .line 264
    .line 265
    .line 266
    const v2, -0x4050a3d7    # -1.37f

    .line 267
    .line 268
    .line 269
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 270
    .line 271
    .line 272
    const/high16 v0, 0x41300000    # 11.0f

    .line 273
    .line 274
    const/high16 v2, 0x40a00000    # 5.0f

    .line 275
    .line 276
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 277
    .line 278
    .line 279
    const v0, 0x4145eb85    # 12.37f

    .line 280
    .line 281
    .line 282
    const v2, 0x408bd70a    # 4.37f

    .line 283
    .line 284
    .line 285
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 286
    .line 287
    .line 288
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 289
    .line 290
    .line 291
    const/high16 v0, 0x41400000    # 12.0f

    .line 292
    .line 293
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 294
    .line 295
    .line 296
    const v17, 0x405c28f6    # 3.44f

    .line 297
    .line 298
    .line 299
    const/high16 v18, -0x3f000000    # -8.0f

    .line 300
    .line 301
    const/4 v13, 0x0

    .line 302
    const v14, -0x3fba3d71    # -3.09f

    .line 303
    .line 304
    .line 305
    const v15, 0x3fb0a3d7    # 1.38f

    .line 306
    .line 307
    .line 308
    const v16, -0x3f41eb85    # -5.94f

    .line 309
    .line 310
    .line 311
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 312
    .line 313
    .line 314
    const/high16 v0, 0x40800000    # 4.0f

    .line 315
    .line 316
    const/high16 v2, 0x41400000    # 12.0f

    .line 317
    .line 318
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 319
    .line 320
    .line 321
    const/high16 v0, 0x40000000    # 2.0f

    .line 322
    .line 323
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 324
    .line 325
    .line 326
    const/high16 v0, 0x40e00000    # 7.0f

    .line 327
    .line 328
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 329
    .line 330
    .line 331
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 332
    .line 333
    .line 334
    const/high16 v0, -0x40000000    # -2.0f

    .line 335
    .line 336
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 337
    .line 338
    .line 339
    const/4 v0, 0x0

    .line 340
    const v2, -0x3f91eb85    # -3.72f

    .line 341
    .line 342
    .line 343
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 344
    .line 345
    .line 346
    const/high16 v17, -0x3fc00000    # -3.0f

    .line 347
    .line 348
    const v18, 0x40d70a3d    # 6.72f

    .line 349
    .line 350
    .line 351
    const v13, -0x4019999a    # -1.8f

    .line 352
    .line 353
    .line 354
    const v14, 0x3fdeb852    # 1.74f

    .line 355
    .line 356
    .line 357
    const/high16 v15, -0x3fc00000    # -3.0f

    .line 358
    .line 359
    const v16, 0x40866666    # 4.2f

    .line 360
    .line 361
    .line 362
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 363
    .line 364
    .line 365
    const/high16 v17, 0x40a00000    # 5.0f

    .line 366
    .line 367
    const v18, 0x40fa3d71    # 7.82f

    .line 368
    .line 369
    .line 370
    const/4 v13, 0x0

    .line 371
    const v14, 0x40547ae1    # 3.32f

    .line 372
    .line 373
    .line 374
    const v15, 0x40066666    # 2.1f

    .line 375
    .line 376
    .line 377
    const v16, 0x40cb851f    # 6.36f

    .line 378
    .line 379
    .line 380
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 381
    .line 382
    .line 383
    const/high16 v0, 0x41980000    # 19.0f

    .line 384
    .line 385
    const/high16 v2, 0x41b00000    # 22.0f

    .line 386
    .line 387
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 388
    .line 389
    .line 390
    const/high16 v17, 0x41400000    # 12.0f

    .line 391
    .line 392
    const/high16 v18, 0x41400000    # 12.0f

    .line 393
    .line 394
    const v13, 0x416e8f5c    # 14.91f

    .line 395
    .line 396
    .line 397
    const v14, 0x41a347ae    # 20.41f

    .line 398
    .line 399
    .line 400
    const/high16 v15, 0x41400000    # 12.0f

    .line 401
    .line 402
    const v16, 0x4182cccd    # 16.35f

    .line 403
    .line 404
    .line 405
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 406
    .line 407
    .line 408
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 409
    .line 410
    .line 411
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 412
    .line 413
    .line 414
    move-result-object v2

    .line 415
    const/16 v16, 0x3800

    .line 416
    .line 417
    const/16 v17, 0x0

    .line 418
    .line 419
    const/high16 v6, 0x3f800000    # 1.0f

    .line 420
    .line 421
    const/high16 v8, 0x3f800000    # 1.0f

    .line 422
    .line 423
    const/4 v7, 0x0

    .line 424
    const/high16 v9, 0x3f800000    # 1.0f

    .line 425
    .line 426
    const/high16 v12, 0x3f800000    # 1.0f

    .line 427
    .line 428
    const/4 v13, 0x0

    .line 429
    const/4 v14, 0x0

    .line 430
    const/4 v15, 0x0

    .line 431
    const-string v4, ""

    .line 432
    .line 433
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 434
    .line 435
    .line 436
    move-result-object v0

    .line 437
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 438
    .line 439
    .line 440
    move-result-object v0

    .line 441
    sput-object v0, Landroidx/compose/material/icons/outlined/SwitchAccessShortcutKt;->_switchAccessShortcut:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 442
    .line 443
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 444
    .line 445
    .line 446
    return-object v0
.end method
