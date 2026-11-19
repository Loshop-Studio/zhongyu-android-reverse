.class public final Landroidx/compose/material/icons/rounded/EventRepeatKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _eventRepeat:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getEventRepeat(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/EventRepeatKt;->_eventRepeat:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.EventRepeat"

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
    const/high16 v2, 0x41a80000    # 21.0f

    .line 73
    .line 74
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v0, 0x40c00000    # 6.0f

    .line 78
    .line 79
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 80
    .line 81
    .line 82
    const/high16 v17, -0x40000000    # -2.0f

    .line 83
    .line 84
    const/high16 v18, -0x40000000    # -2.0f

    .line 85
    .line 86
    const/4 v13, 0x0

    .line 87
    const v14, -0x40733333    # -1.1f

    .line 88
    .line 89
    .line 90
    const v15, -0x4099999a    # -0.9f

    .line 91
    .line 92
    .line 93
    const/high16 v16, -0x40000000    # -2.0f

    .line 94
    .line 95
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 96
    .line 97
    .line 98
    const/high16 v0, -0x40800000    # -1.0f

    .line 99
    .line 100
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 101
    .line 102
    .line 103
    const/high16 v0, 0x40400000    # 3.0f

    .line 104
    .line 105
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 106
    .line 107
    .line 108
    const/high16 v17, -0x40800000    # -1.0f

    .line 109
    .line 110
    const/high16 v18, -0x40800000    # -1.0f

    .line 111
    .line 112
    const v14, -0x40f33333    # -0.55f

    .line 113
    .line 114
    .line 115
    const v15, -0x4119999a    # -0.45f

    .line 116
    .line 117
    .line 118
    const/high16 v16, -0x40800000    # -1.0f

    .line 119
    .line 120
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 121
    .line 122
    .line 123
    const v0, 0x3ee66666    # 0.45f

    .line 124
    .line 125
    .line 126
    const/high16 v2, 0x3f800000    # 1.0f

    .line 127
    .line 128
    const/high16 v4, -0x40800000    # -1.0f

    .line 129
    .line 130
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 131
    .line 132
    .line 133
    const/high16 v0, 0x3f800000    # 1.0f

    .line 134
    .line 135
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 136
    .line 137
    .line 138
    const/high16 v0, 0x41000000    # 8.0f

    .line 139
    .line 140
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 141
    .line 142
    .line 143
    const/high16 v0, 0x40400000    # 3.0f

    .line 144
    .line 145
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 146
    .line 147
    .line 148
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 149
    .line 150
    .line 151
    const v0, 0x401ccccd    # 2.45f

    .line 152
    .line 153
    .line 154
    const/high16 v2, 0x40400000    # 3.0f

    .line 155
    .line 156
    const/high16 v4, 0x40c00000    # 6.0f

    .line 157
    .line 158
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 159
    .line 160
    .line 161
    const/high16 v0, 0x3f800000    # 1.0f

    .line 162
    .line 163
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 164
    .line 165
    .line 166
    const/high16 v0, 0x40a00000    # 5.0f

    .line 167
    .line 168
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 169
    .line 170
    .line 171
    const/high16 v17, 0x40400000    # 3.0f

    .line 172
    .line 173
    const/high16 v18, 0x40c00000    # 6.0f

    .line 174
    .line 175
    const v13, 0x4079999a    # 3.9f

    .line 176
    .line 177
    .line 178
    const/high16 v14, 0x40800000    # 4.0f

    .line 179
    .line 180
    const/high16 v15, 0x40400000    # 3.0f

    .line 181
    .line 182
    const v16, 0x409ccccd    # 4.9f

    .line 183
    .line 184
    .line 185
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 186
    .line 187
    .line 188
    const/high16 v0, 0x41600000    # 14.0f

    .line 189
    .line 190
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 191
    .line 192
    .line 193
    const/high16 v17, 0x40000000    # 2.0f

    .line 194
    .line 195
    const/high16 v18, 0x40000000    # 2.0f

    .line 196
    .line 197
    const/4 v13, 0x0

    .line 198
    const v14, 0x3f8ccccd    # 1.1f

    .line 199
    .line 200
    .line 201
    const v15, 0x3f666666    # 0.9f

    .line 202
    .line 203
    .line 204
    const/high16 v16, 0x40000000    # 2.0f

    .line 205
    .line 206
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 207
    .line 208
    .line 209
    const/high16 v0, 0x40e00000    # 7.0f

    .line 210
    .line 211
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 212
    .line 213
    .line 214
    const/high16 v0, -0x40000000    # -2.0f

    .line 215
    .line 216
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 217
    .line 218
    .line 219
    const/high16 v0, 0x40a00000    # 5.0f

    .line 220
    .line 221
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 222
    .line 223
    .line 224
    const/high16 v0, 0x41200000    # 10.0f

    .line 225
    .line 226
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 227
    .line 228
    .line 229
    const/high16 v0, 0x41600000    # 14.0f

    .line 230
    .line 231
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 232
    .line 233
    .line 234
    const/high16 v0, 0x40000000    # 2.0f

    .line 235
    .line 236
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 237
    .line 238
    .line 239
    const/high16 v0, 0x41a80000    # 21.0f

    .line 240
    .line 241
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 242
    .line 243
    .line 244
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 245
    .line 246
    .line 247
    const v0, 0x4172147b    # 15.13f

    .line 248
    .line 249
    .line 250
    const/high16 v2, 0x41a00000    # 20.0f

    .line 251
    .line 252
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 253
    .line 254
    .line 255
    const v17, -0x40d1eb85    # -0.68f

    .line 256
    .line 257
    .line 258
    const v18, 0x3f87ae14    # 1.06f

    .line 259
    .line 260
    .line 261
    const v13, -0x40f33333    # -0.55f

    .line 262
    .line 263
    .line 264
    const/4 v14, 0x0

    .line 265
    const v15, -0x40970a3d    # -0.91f

    .line 266
    .line 267
    .line 268
    const v16, 0x3f0f5c29    # 0.56f

    .line 269
    .line 270
    .line 271
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 272
    .line 273
    .line 274
    const/high16 v17, 0x41980000    # 19.0f

    .line 275
    .line 276
    const/high16 v18, 0x41c00000    # 24.0f

    .line 277
    .line 278
    const v13, 0x4173ae14    # 15.23f

    .line 279
    .line 280
    .line 281
    const v14, 0x41b651ec    # 22.79f

    .line 282
    .line 283
    .line 284
    const v15, 0x4187c28f    # 16.97f

    .line 285
    .line 286
    .line 287
    const/high16 v16, 0x41c00000    # 24.0f

    .line 288
    .line 289
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 290
    .line 291
    .line 292
    const/high16 v17, 0x40a00000    # 5.0f

    .line 293
    .line 294
    const/high16 v18, -0x3f600000    # -5.0f

    .line 295
    .line 296
    const v13, 0x4030a3d7    # 2.76f

    .line 297
    .line 298
    .line 299
    const/4 v14, 0x0

    .line 300
    const/high16 v15, 0x40a00000    # 5.0f

    .line 301
    .line 302
    const v16, -0x3ff0a3d7    # -2.24f

    .line 303
    .line 304
    .line 305
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 306
    .line 307
    .line 308
    const v0, -0x3ff0a3d7    # -2.24f

    .line 309
    .line 310
    .line 311
    const/high16 v2, -0x3f600000    # -5.0f

    .line 312
    .line 313
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 314
    .line 315
    .line 316
    const/high16 v17, -0x3fa00000    # -3.5f

    .line 317
    .line 318
    const v18, 0x3fb70a3d    # 1.43f

    .line 319
    .line 320
    .line 321
    const v13, -0x4051eb85    # -1.36f

    .line 322
    .line 323
    .line 324
    const v15, -0x3fd9999a    # -2.6f

    .line 325
    .line 326
    .line 327
    const v16, 0x3f0ccccd    # 0.55f

    .line 328
    .line 329
    .line 330
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 331
    .line 332
    .line 333
    const v0, -0x40d1eb85    # -0.68f

    .line 334
    .line 335
    .line 336
    const/4 v2, 0x0

    .line 337
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 338
    .line 339
    .line 340
    const/high16 v17, -0x40c00000    # -0.75f

    .line 341
    .line 342
    const/high16 v18, -0x40c00000    # -0.75f

    .line 343
    .line 344
    const/4 v13, 0x0

    .line 345
    const v14, -0x412e147b    # -0.41f

    .line 346
    .line 347
    .line 348
    const v15, -0x4151eb85    # -0.34f

    .line 349
    .line 350
    .line 351
    const/high16 v16, -0x40c00000    # -0.75f

    .line 352
    .line 353
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 354
    .line 355
    .line 356
    const/4 v0, 0x0

    .line 357
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 358
    .line 359
    .line 360
    const/high16 v17, 0x41600000    # 14.0f

    .line 361
    .line 362
    const/high16 v18, 0x416c0000    # 14.75f

    .line 363
    .line 364
    const v13, 0x416570a4    # 14.34f

    .line 365
    .line 366
    .line 367
    const/high16 v14, 0x41600000    # 14.0f

    .line 368
    .line 369
    const/high16 v15, 0x41600000    # 14.0f

    .line 370
    .line 371
    const v16, 0x416570a4    # 14.34f

    .line 372
    .line 373
    .line 374
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 375
    .line 376
    .line 377
    const/high16 v0, 0x41880000    # 17.0f

    .line 378
    .line 379
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 380
    .line 381
    .line 382
    const/high16 v17, 0x3f800000    # 1.0f

    .line 383
    .line 384
    const/high16 v18, 0x3f800000    # 1.0f

    .line 385
    .line 386
    const/4 v13, 0x0

    .line 387
    const v14, 0x3f0ccccd    # 0.55f

    .line 388
    .line 389
    .line 390
    const v15, 0x3ee66666    # 0.45f

    .line 391
    .line 392
    .line 393
    const/high16 v16, 0x3f800000    # 1.0f

    .line 394
    .line 395
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 396
    .line 397
    .line 398
    const/high16 v0, 0x40100000    # 2.25f

    .line 399
    .line 400
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 401
    .line 402
    .line 403
    const/high16 v17, 0x3f400000    # 0.75f

    .line 404
    .line 405
    const/high16 v18, -0x40c00000    # -0.75f

    .line 406
    .line 407
    const v13, 0x3ed1eb85    # 0.41f

    .line 408
    .line 409
    .line 410
    const/4 v14, 0x0

    .line 411
    const/high16 v15, 0x3f400000    # 0.75f

    .line 412
    .line 413
    const v16, -0x4151eb85    # -0.34f

    .line 414
    .line 415
    .line 416
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 417
    .line 418
    .line 419
    const/4 v0, 0x0

    .line 420
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 421
    .line 422
    .line 423
    const/high16 v17, -0x40c00000    # -0.75f

    .line 424
    .line 425
    const/4 v13, 0x0

    .line 426
    const v14, -0x412e147b    # -0.41f

    .line 427
    .line 428
    .line 429
    const v15, -0x4151eb85    # -0.34f

    .line 430
    .line 431
    .line 432
    const/high16 v16, -0x40c00000    # -0.75f

    .line 433
    .line 434
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 435
    .line 436
    .line 437
    const v0, -0x40cccccd    # -0.7f

    .line 438
    .line 439
    .line 440
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 441
    .line 442
    .line 443
    const v17, 0x401ccccd    # 2.45f

    .line 444
    .line 445
    .line 446
    const/high16 v18, -0x40800000    # -1.0f

    .line 447
    .line 448
    const v13, 0x3f2147ae    # 0.63f

    .line 449
    .line 450
    .line 451
    const v14, -0x40e147ae    # -0.62f

    .line 452
    .line 453
    .line 454
    const/high16 v15, 0x3fc00000    # 1.5f

    .line 455
    .line 456
    const/high16 v16, -0x40800000    # -1.0f

    .line 457
    .line 458
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 459
    .line 460
    .line 461
    const/high16 v17, 0x40600000    # 3.5f

    .line 462
    .line 463
    const/high16 v18, 0x40600000    # 3.5f

    .line 464
    .line 465
    const v13, 0x3ff70a3d    # 1.93f

    .line 466
    .line 467
    .line 468
    const/4 v14, 0x0

    .line 469
    const/high16 v15, 0x40600000    # 3.5f

    .line 470
    .line 471
    const v16, 0x3fc8f5c3    # 1.57f

    .line 472
    .line 473
    .line 474
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 475
    .line 476
    .line 477
    const v0, -0x40370a3d    # -1.57f

    .line 478
    .line 479
    .line 480
    const/high16 v2, -0x3fa00000    # -3.5f

    .line 481
    .line 482
    const/high16 v4, 0x40600000    # 3.5f

    .line 483
    .line 484
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 485
    .line 486
    .line 487
    const v17, -0x3fb3d70a    # -3.19f

    .line 488
    .line 489
    .line 490
    const v18, -0x3ffc28f6    # -2.06f

    .line 491
    .line 492
    .line 493
    const v13, -0x404a3d71    # -1.42f

    .line 494
    .line 495
    .line 496
    const v15, -0x3fd70a3d    # -2.64f

    .line 497
    .line 498
    .line 499
    const v16, -0x40a66666    # -0.85f

    .line 500
    .line 501
    .line 502
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 503
    .line 504
    .line 505
    const v17, 0x4172147b    # 15.13f

    .line 506
    .line 507
    .line 508
    const/high16 v18, 0x41a00000    # 20.0f

    .line 509
    .line 510
    const v13, 0x417b0a3d    # 15.69f

    .line 511
    .line 512
    .line 513
    const v14, 0x41a15c29    # 20.17f

    .line 514
    .line 515
    .line 516
    const v15, 0x4176b852    # 15.42f

    .line 517
    .line 518
    .line 519
    const/high16 v16, 0x41a00000    # 20.0f

    .line 520
    .line 521
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 522
    .line 523
    .line 524
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 525
    .line 526
    .line 527
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 528
    .line 529
    .line 530
    move-result-object v2

    .line 531
    const/16 v16, 0x3800

    .line 532
    .line 533
    const/16 v17, 0x0

    .line 534
    .line 535
    const/high16 v6, 0x3f800000    # 1.0f

    .line 536
    .line 537
    const/high16 v8, 0x3f800000    # 1.0f

    .line 538
    .line 539
    const/4 v7, 0x0

    .line 540
    const/high16 v9, 0x3f800000    # 1.0f

    .line 541
    .line 542
    const/high16 v12, 0x3f800000    # 1.0f

    .line 543
    .line 544
    const/4 v13, 0x0

    .line 545
    const/4 v14, 0x0

    .line 546
    const/4 v15, 0x0

    .line 547
    const-string v4, ""

    .line 548
    .line 549
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 550
    .line 551
    .line 552
    move-result-object v0

    .line 553
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 554
    .line 555
    .line 556
    move-result-object v0

    .line 557
    sput-object v0, Landroidx/compose/material/icons/rounded/EventRepeatKt;->_eventRepeat:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 558
    .line 559
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 560
    .line 561
    .line 562
    return-object v0
.end method
