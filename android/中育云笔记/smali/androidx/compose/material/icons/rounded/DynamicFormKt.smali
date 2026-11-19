.class public final Landroidx/compose/material/icons/rounded/DynamicFormKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _dynamicForm:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getDynamicForm(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/DynamicFormKt;->_dynamicForm:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.DynamicForm"

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
    const v0, 0x41ad70a4    # 21.68f

    .line 71
    .line 72
    .line 73
    const v2, 0x411b5c29    # 9.71f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v0, -0x3f91eb85    # -3.72f

    .line 80
    .line 81
    .line 82
    const v2, 0x41030a3d    # 8.19f

    .line 83
    .line 84
    .line 85
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 86
    .line 87
    .line 88
    const/high16 v17, 0x41880000    # 17.0f

    .line 89
    .line 90
    const v18, 0x418d851f    # 17.69f

    .line 91
    .line 92
    .line 93
    const v13, 0x418dd70a    # 17.73f

    .line 94
    .line 95
    .line 96
    const v14, 0x41931eb8    # 18.39f

    .line 97
    .line 98
    .line 99
    const/high16 v15, 0x41880000    # 17.0f

    .line 100
    .line 101
    const v16, 0x4191d70a    # 18.23f

    .line 102
    .line 103
    .line 104
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 105
    .line 106
    .line 107
    const/high16 v0, 0x41300000    # 11.0f

    .line 108
    .line 109
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 110
    .line 111
    .line 112
    const/high16 v0, -0x40400000    # -1.5f

    .line 113
    .line 114
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 115
    .line 116
    .line 117
    const/high16 v17, -0x41000000    # -0.5f

    .line 118
    .line 119
    const/high16 v18, -0x41000000    # -0.5f

    .line 120
    .line 121
    const v13, -0x4170a3d7    # -0.28f

    .line 122
    .line 123
    .line 124
    const/4 v14, 0x0

    .line 125
    const/high16 v15, -0x41000000    # -0.5f

    .line 126
    .line 127
    const v16, -0x419eb852    # -0.22f

    .line 128
    .line 129
    .line 130
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 131
    .line 132
    .line 133
    const/high16 v0, -0x3f400000    # -6.0f

    .line 134
    .line 135
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 136
    .line 137
    .line 138
    const/high16 v17, 0x41780000    # 15.5f

    .line 139
    .line 140
    const/high16 v18, 0x40800000    # 4.0f

    .line 141
    .line 142
    const/high16 v13, 0x41700000    # 15.0f

    .line 143
    .line 144
    const v14, 0x40870a3d    # 4.22f

    .line 145
    .line 146
    .line 147
    const v15, 0x4173851f    # 15.22f

    .line 148
    .line 149
    .line 150
    const/high16 v16, 0x40800000    # 4.0f

    .line 151
    .line 152
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 153
    .line 154
    .line 155
    const v0, 0x40b851ec    # 5.76f

    .line 156
    .line 157
    .line 158
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 159
    .line 160
    .line 161
    const v17, 0x3eeb851f    # 0.46f

    .line 162
    .line 163
    .line 164
    const v18, 0x3f30a3d7    # 0.69f

    .line 165
    .line 166
    .line 167
    const v13, 0x3eb33333    # 0.35f

    .line 168
    .line 169
    .line 170
    const/4 v14, 0x0

    .line 171
    const v15, 0x3f19999a    # 0.6f

    .line 172
    .line 173
    .line 174
    const v16, 0x3eb851ec    # 0.36f

    .line 175
    .line 176
    .line 177
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 178
    .line 179
    .line 180
    const/high16 v0, 0x41a00000    # 20.0f

    .line 181
    .line 182
    const/high16 v2, 0x41100000    # 9.0f

    .line 183
    .line 184
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 185
    .line 186
    .line 187
    const v0, 0x3f9c28f6    # 1.22f

    .line 188
    .line 189
    .line 190
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 191
    .line 192
    .line 193
    const v17, 0x41ad70a4    # 21.68f

    .line 194
    .line 195
    .line 196
    const v18, 0x411b5c29    # 9.71f

    .line 197
    .line 198
    .line 199
    const v13, 0x41acb852    # 21.59f

    .line 200
    .line 201
    .line 202
    const/high16 v14, 0x41100000    # 9.0f

    .line 203
    .line 204
    const v15, 0x41aea3d7    # 21.83f

    .line 205
    .line 206
    .line 207
    const v16, 0x4116147b    # 9.38f

    .line 208
    .line 209
    .line 210
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 211
    .line 212
    .line 213
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 214
    .line 215
    .line 216
    const/high16 v0, 0x41700000    # 15.0f

    .line 217
    .line 218
    const/high16 v2, 0x41500000    # 13.0f

    .line 219
    .line 220
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 221
    .line 222
    .line 223
    const/high16 v0, 0x40e00000    # 7.0f

    .line 224
    .line 225
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 226
    .line 227
    .line 228
    const/high16 v0, 0x40800000    # 4.0f

    .line 229
    .line 230
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 231
    .line 232
    .line 233
    const/high16 v17, -0x40000000    # -2.0f

    .line 234
    .line 235
    const/high16 v18, -0x40000000    # -2.0f

    .line 236
    .line 237
    const v13, -0x40733333    # -1.1f

    .line 238
    .line 239
    .line 240
    const/4 v14, 0x0

    .line 241
    const/high16 v15, -0x40000000    # -2.0f

    .line 242
    .line 243
    const v16, -0x4099999a    # -0.9f

    .line 244
    .line 245
    .line 246
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 247
    .line 248
    .line 249
    const/high16 v0, -0x3fc00000    # -3.0f

    .line 250
    .line 251
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 252
    .line 253
    .line 254
    const/high16 v17, 0x40000000    # 2.0f

    .line 255
    .line 256
    const/4 v13, 0x0

    .line 257
    const v14, -0x40733333    # -1.1f

    .line 258
    .line 259
    .line 260
    const v15, 0x3f666666    # 0.9f

    .line 261
    .line 262
    .line 263
    const/high16 v16, -0x40000000    # -2.0f

    .line 264
    .line 265
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 266
    .line 267
    .line 268
    const/high16 v0, 0x41700000    # 15.0f

    .line 269
    .line 270
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 271
    .line 272
    .line 273
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 274
    .line 275
    .line 276
    const/high16 v0, 0x41840000    # 16.5f

    .line 277
    .line 278
    const/high16 v2, 0x40c80000    # 6.25f

    .line 279
    .line 280
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 281
    .line 282
    .line 283
    const/high16 v17, -0x40c00000    # -0.75f

    .line 284
    .line 285
    const/high16 v18, -0x40c00000    # -0.75f

    .line 286
    .line 287
    const v14, -0x412e147b    # -0.41f

    .line 288
    .line 289
    .line 290
    const v15, -0x4151eb85    # -0.34f

    .line 291
    .line 292
    .line 293
    const/high16 v16, -0x40c00000    # -0.75f

    .line 294
    .line 295
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 296
    .line 297
    .line 298
    const v0, 0x3eae147b    # 0.34f

    .line 299
    .line 300
    .line 301
    const/high16 v2, 0x3f400000    # 0.75f

    .line 302
    .line 303
    const/high16 v4, -0x40c00000    # -0.75f

    .line 304
    .line 305
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 306
    .line 307
    .line 308
    const/high16 v17, 0x3f400000    # 0.75f

    .line 309
    .line 310
    const/high16 v18, 0x3f400000    # 0.75f

    .line 311
    .line 312
    const v14, 0x3ed1eb85    # 0.41f

    .line 313
    .line 314
    .line 315
    const v15, 0x3eae147b    # 0.34f

    .line 316
    .line 317
    .line 318
    const/high16 v16, 0x3f400000    # 0.75f

    .line 319
    .line 320
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 321
    .line 322
    .line 323
    const v0, 0x418747ae    # 16.91f

    .line 324
    .line 325
    .line 326
    const/high16 v2, 0x41840000    # 16.5f

    .line 327
    .line 328
    const/high16 v4, 0x40c80000    # 6.25f

    .line 329
    .line 330
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 331
    .line 332
    .line 333
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 334
    .line 335
    .line 336
    const/high16 v0, 0x40800000    # 4.0f

    .line 337
    .line 338
    const/high16 v2, 0x41500000    # 13.0f

    .line 339
    .line 340
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 341
    .line 342
    .line 343
    const/high16 v0, 0x40e00000    # 7.0f

    .line 344
    .line 345
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 346
    .line 347
    .line 348
    const/high16 v0, 0x40800000    # 4.0f

    .line 349
    .line 350
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 351
    .line 352
    .line 353
    const/high16 v17, -0x40000000    # -2.0f

    .line 354
    .line 355
    const/high16 v18, -0x40000000    # -2.0f

    .line 356
    .line 357
    const v13, -0x40733333    # -1.1f

    .line 358
    .line 359
    .line 360
    const/4 v14, 0x0

    .line 361
    const/high16 v15, -0x40000000    # -2.0f

    .line 362
    .line 363
    const v16, -0x4099999a    # -0.9f

    .line 364
    .line 365
    .line 366
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 367
    .line 368
    .line 369
    const/high16 v0, 0x40c00000    # 6.0f

    .line 370
    .line 371
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 372
    .line 373
    .line 374
    const/high16 v17, 0x40000000    # 2.0f

    .line 375
    .line 376
    const/4 v13, 0x0

    .line 377
    const v14, -0x40733333    # -1.1f

    .line 378
    .line 379
    .line 380
    const v15, 0x3f666666    # 0.9f

    .line 381
    .line 382
    .line 383
    const/high16 v16, -0x40000000    # -2.0f

    .line 384
    .line 385
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 386
    .line 387
    .line 388
    const/high16 v0, 0x41500000    # 13.0f

    .line 389
    .line 390
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 391
    .line 392
    .line 393
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 394
    .line 395
    .line 396
    const/high16 v0, 0x40f00000    # 7.5f

    .line 397
    .line 398
    const/high16 v2, 0x40c80000    # 6.25f

    .line 399
    .line 400
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 401
    .line 402
    .line 403
    const/high16 v17, -0x40c00000    # -0.75f

    .line 404
    .line 405
    const/high16 v18, -0x40c00000    # -0.75f

    .line 406
    .line 407
    const v14, -0x412e147b    # -0.41f

    .line 408
    .line 409
    .line 410
    const v15, -0x4151eb85    # -0.34f

    .line 411
    .line 412
    .line 413
    const/high16 v16, -0x40c00000    # -0.75f

    .line 414
    .line 415
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 416
    .line 417
    .line 418
    const v0, 0x40e2e148    # 7.09f

    .line 419
    .line 420
    .line 421
    const/high16 v2, 0x40980000    # 4.75f

    .line 422
    .line 423
    const/high16 v4, 0x40f00000    # 7.5f

    .line 424
    .line 425
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 426
    .line 427
    .line 428
    const/high16 v17, 0x3f400000    # 0.75f

    .line 429
    .line 430
    const/high16 v18, 0x3f400000    # 0.75f

    .line 431
    .line 432
    const v14, 0x3ed1eb85    # 0.41f

    .line 433
    .line 434
    .line 435
    const v15, 0x3eae147b    # 0.34f

    .line 436
    .line 437
    .line 438
    const/high16 v16, 0x3f400000    # 0.75f

    .line 439
    .line 440
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 441
    .line 442
    .line 443
    const v0, 0x40fd1eb8    # 7.91f

    .line 444
    .line 445
    .line 446
    const/high16 v2, 0x40f00000    # 7.5f

    .line 447
    .line 448
    const/high16 v4, 0x40c80000    # 6.25f

    .line 449
    .line 450
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 451
    .line 452
    .line 453
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 454
    .line 455
    .line 456
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 457
    .line 458
    .line 459
    move-result-object v2

    .line 460
    const/16 v16, 0x3800

    .line 461
    .line 462
    const/16 v17, 0x0

    .line 463
    .line 464
    const/high16 v6, 0x3f800000    # 1.0f

    .line 465
    .line 466
    const/high16 v8, 0x3f800000    # 1.0f

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
    const/4 v14, 0x0

    .line 474
    const/4 v15, 0x0

    .line 475
    const-string v4, ""

    .line 476
    .line 477
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 478
    .line 479
    .line 480
    move-result-object v0

    .line 481
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 482
    .line 483
    .line 484
    move-result-object v0

    .line 485
    sput-object v0, Landroidx/compose/material/icons/rounded/DynamicFormKt;->_dynamicForm:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 486
    .line 487
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 488
    .line 489
    .line 490
    return-object v0
.end method
