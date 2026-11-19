.class public final Landroidx/compose/material/icons/twotone/BadgeKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _badge:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getBadge(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/BadgeKt;->_badge:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.Badge"

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
    const/high16 v4, 0x41600000    # 14.0f

    .line 71
    .line 72
    const/high16 v6, 0x41580000    # 13.5f

    .line 73
    .line 74
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v4, 0x40800000    # 4.0f

    .line 78
    .line 79
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 80
    .line 81
    .line 82
    const/high16 v4, 0x41400000    # 12.0f

    .line 83
    .line 84
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 85
    .line 86
    .line 87
    const/high16 v4, -0x3f800000    # -4.0f

    .line 88
    .line 89
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 90
    .line 91
    .line 92
    const/high16 v4, 0x41580000    # 13.5f

    .line 93
    .line 94
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 95
    .line 96
    .line 97
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 98
    .line 99
    .line 100
    const/high16 v4, 0x41600000    # 14.0f

    .line 101
    .line 102
    const/high16 v6, 0x41840000    # 16.5f

    .line 103
    .line 104
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 105
    .line 106
    .line 107
    const/high16 v4, 0x40800000    # 4.0f

    .line 108
    .line 109
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 110
    .line 111
    .line 112
    const/high16 v4, 0x41700000    # 15.0f

    .line 113
    .line 114
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 115
    .line 116
    .line 117
    const/high16 v4, -0x3f800000    # -4.0f

    .line 118
    .line 119
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 120
    .line 121
    .line 122
    const/high16 v4, 0x41840000    # 16.5f

    .line 123
    .line 124
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 125
    .line 126
    .line 127
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 128
    .line 129
    .line 130
    const/high16 v4, 0x40e00000    # 7.0f

    .line 131
    .line 132
    const/high16 v6, 0x41a00000    # 20.0f

    .line 133
    .line 134
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 135
    .line 136
    .line 137
    const/high16 v4, -0x3f600000    # -5.0f

    .line 138
    .line 139
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 140
    .line 141
    .line 142
    const/high16 v4, 0x40800000    # 4.0f

    .line 143
    .line 144
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 145
    .line 146
    .line 147
    const/high16 v25, -0x40000000    # -2.0f

    .line 148
    .line 149
    const/high16 v26, -0x40000000    # -2.0f

    .line 150
    .line 151
    const/16 v21, 0x0

    .line 152
    .line 153
    const v22, -0x40733333    # -1.1f

    .line 154
    .line 155
    .line 156
    const v23, -0x4099999a    # -0.9f

    .line 157
    .line 158
    .line 159
    const/high16 v24, -0x40000000    # -2.0f

    .line 160
    .line 161
    move-object/from16 v20, v2

    .line 162
    .line 163
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 164
    .line 165
    .line 166
    const/high16 v4, -0x40000000    # -2.0f

    .line 167
    .line 168
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 169
    .line 170
    .line 171
    const/high16 v25, 0x41100000    # 9.0f

    .line 172
    .line 173
    const/high16 v26, 0x40800000    # 4.0f

    .line 174
    .line 175
    const v21, 0x411e6666    # 9.9f

    .line 176
    .line 177
    .line 178
    const/high16 v22, 0x40000000    # 2.0f

    .line 179
    .line 180
    const/high16 v23, 0x41100000    # 9.0f

    .line 181
    .line 182
    const v24, 0x4039999a    # 2.9f

    .line 183
    .line 184
    .line 185
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 186
    .line 187
    .line 188
    const/high16 v4, 0x40400000    # 3.0f

    .line 189
    .line 190
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 191
    .line 192
    .line 193
    const/high16 v4, 0x40800000    # 4.0f

    .line 194
    .line 195
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 196
    .line 197
    .line 198
    const/high16 v25, 0x40000000    # 2.0f

    .line 199
    .line 200
    const/high16 v26, 0x41100000    # 9.0f

    .line 201
    .line 202
    const v21, 0x4039999a    # 2.9f

    .line 203
    .line 204
    .line 205
    const/high16 v22, 0x40e00000    # 7.0f

    .line 206
    .line 207
    const/high16 v23, 0x40000000    # 2.0f

    .line 208
    .line 209
    const v24, 0x40fccccd    # 7.9f

    .line 210
    .line 211
    .line 212
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 213
    .line 214
    .line 215
    const/high16 v4, 0x41300000    # 11.0f

    .line 216
    .line 217
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 218
    .line 219
    .line 220
    const/high16 v26, 0x40000000    # 2.0f

    .line 221
    .line 222
    const/16 v21, 0x0

    .line 223
    .line 224
    const v22, 0x3f8ccccd    # 1.1f

    .line 225
    .line 226
    .line 227
    const v23, 0x3f666666    # 0.9f

    .line 228
    .line 229
    .line 230
    const/high16 v24, 0x40000000    # 2.0f

    .line 231
    .line 232
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 233
    .line 234
    .line 235
    const/high16 v4, 0x41800000    # 16.0f

    .line 236
    .line 237
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 238
    .line 239
    .line 240
    const/high16 v26, -0x40000000    # -2.0f

    .line 241
    .line 242
    const v21, 0x3f8ccccd    # 1.1f

    .line 243
    .line 244
    .line 245
    const/16 v22, 0x0

    .line 246
    .line 247
    const/high16 v23, 0x40000000    # 2.0f

    .line 248
    .line 249
    const v24, -0x4099999a    # -0.9f

    .line 250
    .line 251
    .line 252
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 253
    .line 254
    .line 255
    const/high16 v4, 0x41100000    # 9.0f

    .line 256
    .line 257
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 258
    .line 259
    .line 260
    const/high16 v25, 0x41a00000    # 20.0f

    .line 261
    .line 262
    const/high16 v26, 0x40e00000    # 7.0f

    .line 263
    .line 264
    const/high16 v21, 0x41b00000    # 22.0f

    .line 265
    .line 266
    const v22, 0x40fccccd    # 7.9f

    .line 267
    .line 268
    .line 269
    const v23, 0x41a8cccd    # 21.1f

    .line 270
    .line 271
    .line 272
    const/high16 v24, 0x40e00000    # 7.0f

    .line 273
    .line 274
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 275
    .line 276
    .line 277
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 278
    .line 279
    .line 280
    const/high16 v4, 0x41300000    # 11.0f

    .line 281
    .line 282
    const/high16 v6, 0x40800000    # 4.0f

    .line 283
    .line 284
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 285
    .line 286
    .line 287
    const/high16 v4, 0x40000000    # 2.0f

    .line 288
    .line 289
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 290
    .line 291
    .line 292
    const/high16 v4, 0x40a00000    # 5.0f

    .line 293
    .line 294
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 295
    .line 296
    .line 297
    const/high16 v4, -0x40000000    # -2.0f

    .line 298
    .line 299
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 300
    .line 301
    .line 302
    const/high16 v4, 0x40800000    # 4.0f

    .line 303
    .line 304
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 305
    .line 306
    .line 307
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 308
    .line 309
    .line 310
    const/high16 v4, 0x41a00000    # 20.0f

    .line 311
    .line 312
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 313
    .line 314
    .line 315
    const/high16 v4, 0x40800000    # 4.0f

    .line 316
    .line 317
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 318
    .line 319
    .line 320
    const/high16 v4, 0x41100000    # 9.0f

    .line 321
    .line 322
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 323
    .line 324
    .line 325
    const/high16 v4, 0x40a00000    # 5.0f

    .line 326
    .line 327
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 328
    .line 329
    .line 330
    const/high16 v25, 0x40000000    # 2.0f

    .line 331
    .line 332
    const/high16 v26, 0x40000000    # 2.0f

    .line 333
    .line 334
    const/16 v21, 0x0

    .line 335
    .line 336
    const v22, 0x3f8ccccd    # 1.1f

    .line 337
    .line 338
    .line 339
    const v23, 0x3f666666    # 0.9f

    .line 340
    .line 341
    .line 342
    const/high16 v24, 0x40000000    # 2.0f

    .line 343
    .line 344
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 345
    .line 346
    .line 347
    const/high16 v4, 0x40000000    # 2.0f

    .line 348
    .line 349
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 350
    .line 351
    .line 352
    const/high16 v26, -0x40000000    # -2.0f

    .line 353
    .line 354
    const v21, 0x3f8ccccd    # 1.1f

    .line 355
    .line 356
    .line 357
    const/16 v22, 0x0

    .line 358
    .line 359
    const/high16 v23, 0x40000000    # 2.0f

    .line 360
    .line 361
    const v24, -0x4099999a    # -0.9f

    .line 362
    .line 363
    .line 364
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 365
    .line 366
    .line 367
    const/high16 v4, 0x40a00000    # 5.0f

    .line 368
    .line 369
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 370
    .line 371
    .line 372
    const/high16 v4, 0x41a00000    # 20.0f

    .line 373
    .line 374
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 375
    .line 376
    .line 377
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 378
    .line 379
    .line 380
    const/high16 v4, 0x41700000    # 15.0f

    .line 381
    .line 382
    const/high16 v6, 0x41100000    # 9.0f

    .line 383
    .line 384
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 385
    .line 386
    .line 387
    const/high16 v25, 0x3fc00000    # 1.5f

    .line 388
    .line 389
    const/high16 v26, -0x40400000    # -1.5f

    .line 390
    .line 391
    const v21, 0x3f547ae1    # 0.83f

    .line 392
    .line 393
    .line 394
    const/high16 v23, 0x3fc00000    # 1.5f

    .line 395
    .line 396
    const v24, -0x40d47ae1    # -0.67f

    .line 397
    .line 398
    .line 399
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 400
    .line 401
    .line 402
    const/high16 v25, -0x40400000    # -1.5f

    .line 403
    .line 404
    const/16 v21, 0x0

    .line 405
    .line 406
    const v22, -0x40ab851f    # -0.83f

    .line 407
    .line 408
    .line 409
    const v23, -0x40d47ae1    # -0.67f

    .line 410
    .line 411
    .line 412
    const/high16 v24, -0x40400000    # -1.5f

    .line 413
    .line 414
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 415
    .line 416
    .line 417
    const v4, 0x3f2b851f    # 0.67f

    .line 418
    .line 419
    .line 420
    const/high16 v6, 0x3fc00000    # 1.5f

    .line 421
    .line 422
    const/high16 v7, -0x40400000    # -1.5f

    .line 423
    .line 424
    invoke-virtual {v2, v7, v4, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 425
    .line 426
    .line 427
    const/high16 v25, 0x41100000    # 9.0f

    .line 428
    .line 429
    const/high16 v26, 0x41700000    # 15.0f

    .line 430
    .line 431
    const/high16 v21, 0x40f00000    # 7.5f

    .line 432
    .line 433
    const v22, 0x416547ae    # 14.33f

    .line 434
    .line 435
    .line 436
    const v23, 0x4102b852    # 8.17f

    .line 437
    .line 438
    .line 439
    const/high16 v24, 0x41700000    # 15.0f

    .line 440
    .line 441
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 442
    .line 443
    .line 444
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 445
    .line 446
    .line 447
    const v4, 0x413147ae    # 11.08f

    .line 448
    .line 449
    .line 450
    const v6, 0x418170a4    # 16.18f

    .line 451
    .line 452
    .line 453
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 454
    .line 455
    .line 456
    const/high16 v26, 0x417c0000    # 15.75f

    .line 457
    .line 458
    const v21, 0x41270a3d    # 10.44f

    .line 459
    .line 460
    .line 461
    const v22, 0x417e6666    # 15.9f

    .line 462
    .line 463
    .line 464
    const v23, 0x411bd70a    # 9.74f

    .line 465
    .line 466
    .line 467
    const/high16 v24, 0x417c0000    # 15.75f

    .line 468
    .line 469
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 470
    .line 471
    .line 472
    const v4, -0x4047ae14    # -1.44f

    .line 473
    .line 474
    .line 475
    const v6, -0x3ffae148    # -2.08f

    .line 476
    .line 477
    .line 478
    const v7, 0x3edc28f6    # 0.43f

    .line 479
    .line 480
    .line 481
    const v8, 0x3e19999a    # 0.15f

    .line 482
    .line 483
    .line 484
    invoke-virtual {v2, v4, v8, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 485
    .line 486
    .line 487
    const/high16 v25, 0x40c00000    # 6.0f

    .line 488
    .line 489
    const v26, 0x418c8f5c    # 17.57f

    .line 490
    .line 491
    .line 492
    const v21, 0x40cb851f    # 6.36f

    .line 493
    .line 494
    .line 495
    const v22, 0x41835c29    # 16.42f

    .line 496
    .line 497
    .line 498
    const/high16 v23, 0x40c00000    # 6.0f

    .line 499
    .line 500
    const v24, 0x4187ae14    # 16.96f

    .line 501
    .line 502
    .line 503
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 504
    .line 505
    .line 506
    const/high16 v4, 0x41900000    # 18.0f

    .line 507
    .line 508
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 509
    .line 510
    .line 511
    const/high16 v4, 0x40c00000    # 6.0f

    .line 512
    .line 513
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 514
    .line 515
    .line 516
    const v4, -0x4123d70a    # -0.43f

    .line 517
    .line 518
    .line 519
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 520
    .line 521
    .line 522
    const v25, 0x413147ae    # 11.08f

    .line 523
    .line 524
    .line 525
    const v26, 0x418170a4    # 16.18f

    .line 526
    .line 527
    .line 528
    const/high16 v21, 0x41400000    # 12.0f

    .line 529
    .line 530
    const v22, 0x4187ae14    # 16.96f

    .line 531
    .line 532
    .line 533
    const v23, 0x413a3d71    # 11.64f

    .line 534
    .line 535
    .line 536
    const v24, 0x41835c29    # 16.42f

    .line 537
    .line 538
    .line 539
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 540
    .line 541
    .line 542
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 543
    .line 544
    .line 545
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 546
    .line 547
    .line 548
    move-result-object v2

    .line 549
    const/16 v16, 0x3800

    .line 550
    .line 551
    const/16 v17, 0x0

    .line 552
    .line 553
    const/high16 v6, 0x3f800000    # 1.0f

    .line 554
    .line 555
    const/high16 v8, 0x3f800000    # 1.0f

    .line 556
    .line 557
    const/4 v7, 0x0

    .line 558
    const/high16 v9, 0x3f800000    # 1.0f

    .line 559
    .line 560
    const/high16 v12, 0x3f800000    # 1.0f

    .line 561
    .line 562
    const/4 v13, 0x0

    .line 563
    const/4 v14, 0x0

    .line 564
    const/4 v15, 0x0

    .line 565
    const-string v4, ""

    .line 566
    .line 567
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 568
    .line 569
    .line 570
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 571
    .line 572
    .line 573
    move-result v3

    .line 574
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 575
    .line 576
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 577
    .line 578
    .line 579
    move-result-wide v6

    .line 580
    const/4 v0, 0x0

    .line 581
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 582
    .line 583
    .line 584
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 585
    .line 586
    .line 587
    move-result v10

    .line 588
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 589
    .line 590
    .line 591
    move-result v11

    .line 592
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 593
    .line 594
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 595
    .line 596
    .line 597
    const/high16 v0, 0x41500000    # 13.0f

    .line 598
    .line 599
    const/high16 v2, 0x41300000    # 11.0f

    .line 600
    .line 601
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 602
    .line 603
    .line 604
    const/high16 v0, -0x40000000    # -2.0f

    .line 605
    .line 606
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 607
    .line 608
    .line 609
    const/high16 v17, -0x40000000    # -2.0f

    .line 610
    .line 611
    const/high16 v18, -0x40000000    # -2.0f

    .line 612
    .line 613
    const v13, -0x40733333    # -1.1f

    .line 614
    .line 615
    .line 616
    const/high16 v15, -0x40000000    # -2.0f

    .line 617
    .line 618
    const v16, -0x4099999a    # -0.9f

    .line 619
    .line 620
    .line 621
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 622
    .line 623
    .line 624
    const/high16 v0, 0x40800000    # 4.0f

    .line 625
    .line 626
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 627
    .line 628
    .line 629
    const/high16 v0, 0x41300000    # 11.0f

    .line 630
    .line 631
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 632
    .line 633
    .line 634
    const/high16 v0, 0x41800000    # 16.0f

    .line 635
    .line 636
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 637
    .line 638
    .line 639
    const/high16 v0, 0x41100000    # 9.0f

    .line 640
    .line 641
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 642
    .line 643
    .line 644
    const/high16 v0, -0x3f600000    # -5.0f

    .line 645
    .line 646
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 647
    .line 648
    .line 649
    const/high16 v17, 0x41500000    # 13.0f

    .line 650
    .line 651
    const/high16 v18, 0x41300000    # 11.0f

    .line 652
    .line 653
    const/high16 v13, 0x41700000    # 15.0f

    .line 654
    .line 655
    const v14, 0x4121999a    # 10.1f

    .line 656
    .line 657
    .line 658
    const v15, 0x4161999a    # 14.1f

    .line 659
    .line 660
    .line 661
    const/high16 v16, 0x41300000    # 11.0f

    .line 662
    .line 663
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 664
    .line 665
    .line 666
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 667
    .line 668
    .line 669
    const/high16 v0, 0x41400000    # 12.0f

    .line 670
    .line 671
    const/high16 v2, 0x41100000    # 9.0f

    .line 672
    .line 673
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 674
    .line 675
    .line 676
    const/high16 v17, 0x3fc00000    # 1.5f

    .line 677
    .line 678
    const/high16 v18, 0x3fc00000    # 1.5f

    .line 679
    .line 680
    const v13, 0x3f547ae1    # 0.83f

    .line 681
    .line 682
    .line 683
    const/4 v14, 0x0

    .line 684
    const/high16 v15, 0x3fc00000    # 1.5f

    .line 685
    .line 686
    const v16, 0x3f2b851f    # 0.67f

    .line 687
    .line 688
    .line 689
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 690
    .line 691
    .line 692
    const/high16 v17, -0x40400000    # -1.5f

    .line 693
    .line 694
    const/4 v13, 0x0

    .line 695
    const v14, 0x3f547ae1    # 0.83f

    .line 696
    .line 697
    .line 698
    const v15, -0x40d47ae1    # -0.67f

    .line 699
    .line 700
    .line 701
    const/high16 v16, 0x3fc00000    # 1.5f

    .line 702
    .line 703
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 704
    .line 705
    .line 706
    const v0, -0x40d47ae1    # -0.67f

    .line 707
    .line 708
    .line 709
    const/high16 v2, -0x40400000    # -1.5f

    .line 710
    .line 711
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 712
    .line 713
    .line 714
    const/high16 v17, 0x41100000    # 9.0f

    .line 715
    .line 716
    const/high16 v18, 0x41400000    # 12.0f

    .line 717
    .line 718
    const/high16 v13, 0x40f00000    # 7.5f

    .line 719
    .line 720
    const v14, 0x414ab852    # 12.67f

    .line 721
    .line 722
    .line 723
    const v15, 0x4102b852    # 8.17f

    .line 724
    .line 725
    .line 726
    const/high16 v16, 0x41400000    # 12.0f

    .line 727
    .line 728
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 729
    .line 730
    .line 731
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 732
    .line 733
    .line 734
    const/high16 v0, 0x41400000    # 12.0f

    .line 735
    .line 736
    const/high16 v2, 0x41900000    # 18.0f

    .line 737
    .line 738
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 739
    .line 740
    .line 741
    const/high16 v0, 0x40c00000    # 6.0f

    .line 742
    .line 743
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 744
    .line 745
    .line 746
    const v0, -0x4123d70a    # -0.43f

    .line 747
    .line 748
    .line 749
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 750
    .line 751
    .line 752
    const v17, 0x3f6b851f    # 0.92f

    .line 753
    .line 754
    .line 755
    const v18, -0x404e147b    # -1.39f

    .line 756
    .line 757
    .line 758
    const/4 v13, 0x0

    .line 759
    const v14, -0x40e66666    # -0.6f

    .line 760
    .line 761
    .line 762
    const v15, 0x3eb851ec    # 0.36f

    .line 763
    .line 764
    .line 765
    const v16, -0x406ccccd    # -1.15f

    .line 766
    .line 767
    .line 768
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 769
    .line 770
    .line 771
    const/high16 v17, 0x41100000    # 9.0f

    .line 772
    .line 773
    const/high16 v18, 0x417c0000    # 15.75f

    .line 774
    .line 775
    const v13, 0x40f1eb85    # 7.56f

    .line 776
    .line 777
    .line 778
    const v14, 0x417e6666    # 15.9f

    .line 779
    .line 780
    .line 781
    const v15, 0x410428f6    # 8.26f

    .line 782
    .line 783
    .line 784
    const/high16 v16, 0x417c0000    # 15.75f

    .line 785
    .line 786
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 787
    .line 788
    .line 789
    const v0, 0x3fb851ec    # 1.44f

    .line 790
    .line 791
    .line 792
    const v2, 0x40051eb8    # 2.08f

    .line 793
    .line 794
    .line 795
    const v4, 0x3edc28f6    # 0.43f

    .line 796
    .line 797
    .line 798
    const v6, 0x3e19999a    # 0.15f

    .line 799
    .line 800
    .line 801
    invoke-virtual {v12, v0, v6, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 802
    .line 803
    .line 804
    const v17, 0x3f6b851f    # 0.92f

    .line 805
    .line 806
    .line 807
    const v18, 0x3fb1eb85    # 1.39f

    .line 808
    .line 809
    .line 810
    const v13, 0x3f0ccccd    # 0.55f

    .line 811
    .line 812
    .line 813
    const v14, 0x3e75c28f    # 0.24f

    .line 814
    .line 815
    .line 816
    const v15, 0x3f6b851f    # 0.92f

    .line 817
    .line 818
    .line 819
    const v16, 0x3f47ae14    # 0.78f

    .line 820
    .line 821
    .line 822
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 823
    .line 824
    .line 825
    const/high16 v0, 0x41900000    # 18.0f

    .line 826
    .line 827
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 828
    .line 829
    .line 830
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 831
    .line 832
    .line 833
    const/high16 v0, 0x41840000    # 16.5f

    .line 834
    .line 835
    const/high16 v2, 0x41900000    # 18.0f

    .line 836
    .line 837
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 838
    .line 839
    .line 840
    const/high16 v0, -0x3f800000    # -4.0f

    .line 841
    .line 842
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 843
    .line 844
    .line 845
    const/high16 v0, 0x41700000    # 15.0f

    .line 846
    .line 847
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 848
    .line 849
    .line 850
    const/high16 v0, 0x40800000    # 4.0f

    .line 851
    .line 852
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 853
    .line 854
    .line 855
    const/high16 v0, 0x41840000    # 16.5f

    .line 856
    .line 857
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 858
    .line 859
    .line 860
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 861
    .line 862
    .line 863
    const/high16 v0, 0x41580000    # 13.5f

    .line 864
    .line 865
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 866
    .line 867
    .line 868
    const/high16 v0, -0x3f800000    # -4.0f

    .line 869
    .line 870
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 871
    .line 872
    .line 873
    const/high16 v0, 0x41400000    # 12.0f

    .line 874
    .line 875
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 876
    .line 877
    .line 878
    const/high16 v0, 0x40800000    # 4.0f

    .line 879
    .line 880
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 881
    .line 882
    .line 883
    const/high16 v0, 0x41580000    # 13.5f

    .line 884
    .line 885
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 886
    .line 887
    .line 888
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 889
    .line 890
    .line 891
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 892
    .line 893
    .line 894
    move-result-object v2

    .line 895
    const/16 v16, 0x3800

    .line 896
    .line 897
    const/16 v17, 0x0

    .line 898
    .line 899
    const v6, 0x3e99999a    # 0.3f

    .line 900
    .line 901
    .line 902
    const v8, 0x3e99999a    # 0.3f

    .line 903
    .line 904
    .line 905
    const/4 v7, 0x0

    .line 906
    const/high16 v12, 0x3f800000    # 1.0f

    .line 907
    .line 908
    const/4 v13, 0x0

    .line 909
    const/4 v14, 0x0

    .line 910
    const/4 v15, 0x0

    .line 911
    const-string v4, ""

    .line 912
    .line 913
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 914
    .line 915
    .line 916
    move-result-object v0

    .line 917
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 918
    .line 919
    .line 920
    move-result-object v0

    .line 921
    sput-object v0, Landroidx/compose/material/icons/twotone/BadgeKt;->_badge:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 922
    .line 923
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 924
    .line 925
    .line 926
    return-object v0
.end method
