.class public final Landroidx/compose/material/icons/rounded/FrontHandKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _frontHand:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getFrontHand(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/FrontHandKt;->_frontHand:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.FrontHand"

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
    const/high16 v0, 0x41680000    # 14.5f

    .line 71
    .line 72
    const/high16 v2, 0x41940000    # 18.5f

    .line 73
    .line 74
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v17, -0x41000000    # -0.5f

    .line 78
    .line 79
    const/high16 v18, 0x3f000000    # 0.5f

    .line 80
    .line 81
    const/4 v13, 0x0

    .line 82
    const v14, 0x3e8f5c29    # 0.28f

    .line 83
    .line 84
    .line 85
    const v15, -0x419eb852    # -0.22f

    .line 86
    .line 87
    .line 88
    const/high16 v16, 0x3f000000    # 0.5f

    .line 89
    .line 90
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 91
    .line 92
    .line 93
    const/4 v0, 0x0

    .line 94
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 95
    .line 96
    .line 97
    const v17, -0x3fc1eb85    # -2.97f

    .line 98
    .line 99
    .line 100
    const v18, 0x40251eb8    # 2.58f

    .line 101
    .line 102
    .line 103
    const v13, -0x403eb852    # -1.51f

    .line 104
    .line 105
    .line 106
    const/4 v14, 0x0

    .line 107
    const v15, -0x3fceb852    # -2.77f

    .line 108
    .line 109
    .line 110
    const v16, 0x3f8f5c29    # 1.12f

    .line 111
    .line 112
    .line 113
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 114
    .line 115
    .line 116
    const v17, 0x4168a3d7    # 14.54f

    .line 117
    .line 118
    .line 119
    const/high16 v18, 0x41900000    # 18.0f

    .line 120
    .line 121
    const/high16 v13, 0x41700000    # 15.0f

    .line 122
    .line 123
    const v14, 0x418e8f5c    # 17.82f

    .line 124
    .line 125
    .line 126
    const v15, 0x416c7ae1    # 14.78f

    .line 127
    .line 128
    .line 129
    const/high16 v16, 0x41900000    # 18.0f

    .line 130
    .line 131
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 132
    .line 133
    .line 134
    const/high16 v17, -0x41000000    # -0.5f

    .line 135
    .line 136
    const v18, -0x40ee147b    # -0.57f

    .line 137
    .line 138
    .line 139
    const v13, -0x41666666    # -0.3f

    .line 140
    .line 141
    .line 142
    const/4 v14, 0x0

    .line 143
    const v15, -0x40f5c28f    # -0.54f

    .line 144
    .line 145
    .line 146
    const v16, -0x4175c28f    # -0.27f

    .line 147
    .line 148
    .line 149
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 150
    .line 151
    .line 152
    const v17, 0x405d70a4    # 3.46f

    .line 153
    .line 154
    .line 155
    const v18, -0x3fa66666    # -3.4f

    .line 156
    .line 157
    .line 158
    const v13, 0x3e851eb8    # 0.26f

    .line 159
    .line 160
    .line 161
    const v14, -0x401d70a4    # -1.77f

    .line 162
    .line 163
    .line 164
    const v15, 0x3fd70a3d    # 1.68f

    .line 165
    .line 166
    .line 167
    const v16, -0x3fb51eb8    # -3.17f

    .line 168
    .line 169
    .line 170
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 171
    .line 172
    .line 173
    const v0, -0x3ed3851f    # -10.78f

    .line 174
    .line 175
    .line 176
    const/4 v2, 0x0

    .line 177
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 178
    .line 179
    .line 180
    const/high16 v17, 0x41820000    # 16.25f

    .line 181
    .line 182
    const/high16 v18, 0x40000000    # 2.0f

    .line 183
    .line 184
    const/high16 v13, 0x418c0000    # 17.5f

    .line 185
    .line 186
    const v14, 0x4023d70a    # 2.56f

    .line 187
    .line 188
    .line 189
    const v15, 0x4187851f    # 16.94f

    .line 190
    .line 191
    .line 192
    const/high16 v16, 0x40000000    # 2.0f

    .line 193
    .line 194
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 195
    .line 196
    .line 197
    const/high16 v17, 0x41700000    # 15.0f

    .line 198
    .line 199
    const/high16 v18, 0x40500000    # 3.25f

    .line 200
    .line 201
    const v13, 0x4178f5c3    # 15.56f

    .line 202
    .line 203
    .line 204
    const/high16 v14, 0x40000000    # 2.0f

    .line 205
    .line 206
    const/high16 v15, 0x41700000    # 15.0f

    .line 207
    .line 208
    const v16, 0x4023d70a    # 2.56f

    .line 209
    .line 210
    .line 211
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 212
    .line 213
    .line 214
    const/high16 v0, 0x40e80000    # 7.25f

    .line 215
    .line 216
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 217
    .line 218
    .line 219
    const/high16 v17, -0x41000000    # -0.5f

    .line 220
    .line 221
    const/high16 v18, 0x3f000000    # 0.5f

    .line 222
    .line 223
    const/4 v13, 0x0

    .line 224
    const v14, 0x3e8f5c29    # 0.28f

    .line 225
    .line 226
    .line 227
    const v15, -0x419eb852    # -0.22f

    .line 228
    .line 229
    .line 230
    const/high16 v16, 0x3f000000    # 0.5f

    .line 231
    .line 232
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 233
    .line 234
    .line 235
    const v0, 0x412c7ae1    # 10.78f

    .line 236
    .line 237
    .line 238
    const/high16 v2, 0x41280000    # 10.5f

    .line 239
    .line 240
    const/high16 v4, 0x41600000    # 14.0f

    .line 241
    .line 242
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 243
    .line 244
    .line 245
    const/high16 v0, 0x3fa00000    # 1.25f

    .line 246
    .line 247
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 248
    .line 249
    .line 250
    const/high16 v17, 0x414c0000    # 12.75f

    .line 251
    .line 252
    const/16 v18, 0x0

    .line 253
    .line 254
    const/high16 v13, 0x41600000    # 14.0f

    .line 255
    .line 256
    const v14, 0x3f0f5c29    # 0.56f

    .line 257
    .line 258
    .line 259
    const v15, 0x41570a3d    # 13.44f

    .line 260
    .line 261
    .line 262
    const/16 v16, 0x0

    .line 263
    .line 264
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 265
    .line 266
    .line 267
    const v0, 0x3f0f5c29    # 0.56f

    .line 268
    .line 269
    .line 270
    const/high16 v2, 0x3fa00000    # 1.25f

    .line 271
    .line 272
    const/high16 v4, 0x41380000    # 11.5f

    .line 273
    .line 274
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 275
    .line 276
    .line 277
    const/high16 v0, 0x41140000    # 9.25f

    .line 278
    .line 279
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 280
    .line 281
    .line 282
    const/high16 v17, -0x41000000    # -0.5f

    .line 283
    .line 284
    const/high16 v18, 0x3f000000    # 0.5f

    .line 285
    .line 286
    const/4 v13, 0x0

    .line 287
    const v14, 0x3e8f5c29    # 0.28f

    .line 288
    .line 289
    .line 290
    const v15, -0x419eb852    # -0.22f

    .line 291
    .line 292
    .line 293
    const/high16 v16, 0x3f000000    # 0.5f

    .line 294
    .line 295
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 296
    .line 297
    .line 298
    const v0, -0x419eb852    # -0.22f

    .line 299
    .line 300
    .line 301
    const/high16 v2, -0x41000000    # -0.5f

    .line 302
    .line 303
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 304
    .line 305
    .line 306
    const/high16 v0, 0x40300000    # 2.75f

    .line 307
    .line 308
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 309
    .line 310
    .line 311
    const/high16 v17, -0x40600000    # -1.25f

    .line 312
    .line 313
    const/high16 v18, -0x40600000    # -1.25f

    .line 314
    .line 315
    const v14, -0x40cf5c29    # -0.69f

    .line 316
    .line 317
    .line 318
    const v15, -0x40f0a3d7    # -0.56f

    .line 319
    .line 320
    .line 321
    const/high16 v16, -0x40600000    # -1.25f

    .line 322
    .line 323
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 324
    .line 325
    .line 326
    const v0, 0x4003d70a    # 2.06f

    .line 327
    .line 328
    .line 329
    const/high16 v2, 0x41000000    # 8.0f

    .line 330
    .line 331
    const/high16 v4, 0x40300000    # 2.75f

    .line 332
    .line 333
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 334
    .line 335
    .line 336
    const/high16 v0, 0x410c0000    # 8.75f

    .line 337
    .line 338
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 339
    .line 340
    .line 341
    const/high16 v17, 0x40f00000    # 7.5f

    .line 342
    .line 343
    const/high16 v18, 0x41400000    # 12.0f

    .line 344
    .line 345
    const/high16 v13, 0x41000000    # 8.0f

    .line 346
    .line 347
    const v14, 0x413c7ae1    # 11.78f

    .line 348
    .line 349
    .line 350
    const v15, 0x40f8f5c3    # 7.78f

    .line 351
    .line 352
    .line 353
    const/high16 v16, 0x41400000    # 12.0f

    .line 354
    .line 355
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 356
    .line 357
    .line 358
    const v0, 0x413c7ae1    # 11.78f

    .line 359
    .line 360
    .line 361
    const/high16 v2, 0x40e00000    # 7.0f

    .line 362
    .line 363
    const/high16 v4, 0x41380000    # 11.5f

    .line 364
    .line 365
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 366
    .line 367
    .line 368
    const/high16 v0, 0x40b80000    # 5.75f

    .line 369
    .line 370
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 371
    .line 372
    .line 373
    const/high16 v17, 0x40b80000    # 5.75f

    .line 374
    .line 375
    const/high16 v18, 0x40900000    # 4.5f

    .line 376
    .line 377
    const/high16 v13, 0x40e00000    # 7.0f

    .line 378
    .line 379
    const v14, 0x40a1eb85    # 5.06f

    .line 380
    .line 381
    .line 382
    const v15, 0x40ce147b    # 6.44f

    .line 383
    .line 384
    .line 385
    const/high16 v16, 0x40900000    # 4.5f

    .line 386
    .line 387
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 388
    .line 389
    .line 390
    const v0, 0x40a1eb85    # 5.06f

    .line 391
    .line 392
    .line 393
    const/high16 v2, 0x40900000    # 4.5f

    .line 394
    .line 395
    const/high16 v4, 0x40b80000    # 5.75f

    .line 396
    .line 397
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 398
    .line 399
    .line 400
    const/high16 v0, 0x41200000    # 10.0f

    .line 401
    .line 402
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 403
    .line 404
    .line 405
    const/high16 v17, 0x41040000    # 8.25f

    .line 406
    .line 407
    const/high16 v18, 0x41040000    # 8.25f

    .line 408
    .line 409
    const/4 v13, 0x0

    .line 410
    const v14, 0x4091eb85    # 4.56f

    .line 411
    .line 412
    .line 413
    const v15, 0x406c28f6    # 3.69f

    .line 414
    .line 415
    .line 416
    const/high16 v16, 0x41040000    # 8.25f

    .line 417
    .line 418
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 419
    .line 420
    .line 421
    const v0, 0x41a27ae1    # 20.31f

    .line 422
    .line 423
    .line 424
    const/high16 v2, 0x417c0000    # 15.75f

    .line 425
    .line 426
    const/high16 v4, 0x41a80000    # 21.0f

    .line 427
    .line 428
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 429
    .line 430
    .line 431
    const/high16 v0, -0x3f300000    # -6.5f

    .line 432
    .line 433
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 434
    .line 435
    .line 436
    const/high16 v17, 0x419e0000    # 19.75f

    .line 437
    .line 438
    const/high16 v18, 0x41000000    # 8.0f

    .line 439
    .line 440
    const/high16 v13, 0x41a80000    # 21.0f

    .line 441
    .line 442
    const v14, 0x4108f5c3    # 8.56f

    .line 443
    .line 444
    .line 445
    const v15, 0x41a3851f    # 20.44f

    .line 446
    .line 447
    .line 448
    const/high16 v16, 0x41000000    # 8.0f

    .line 449
    .line 450
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 451
    .line 452
    .line 453
    const v0, 0x4108f5c3    # 8.56f

    .line 454
    .line 455
    .line 456
    const/high16 v2, 0x41140000    # 9.25f

    .line 457
    .line 458
    const/high16 v4, 0x41940000    # 18.5f

    .line 459
    .line 460
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 461
    .line 462
    .line 463
    const/high16 v0, 0x41680000    # 14.5f

    .line 464
    .line 465
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 466
    .line 467
    .line 468
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 469
    .line 470
    .line 471
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 472
    .line 473
    .line 474
    move-result-object v2

    .line 475
    const/16 v16, 0x3800

    .line 476
    .line 477
    const/16 v17, 0x0

    .line 478
    .line 479
    const/high16 v6, 0x3f800000    # 1.0f

    .line 480
    .line 481
    const/high16 v8, 0x3f800000    # 1.0f

    .line 482
    .line 483
    const/4 v7, 0x0

    .line 484
    const/high16 v9, 0x3f800000    # 1.0f

    .line 485
    .line 486
    const/high16 v12, 0x3f800000    # 1.0f

    .line 487
    .line 488
    const/4 v13, 0x0

    .line 489
    const/4 v14, 0x0

    .line 490
    const/4 v15, 0x0

    .line 491
    const-string v4, ""

    .line 492
    .line 493
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 494
    .line 495
    .line 496
    move-result-object v0

    .line 497
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 498
    .line 499
    .line 500
    move-result-object v0

    .line 501
    sput-object v0, Landroidx/compose/material/icons/rounded/FrontHandKt;->_frontHand:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 502
    .line 503
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 504
    .line 505
    .line 506
    return-object v0
.end method
