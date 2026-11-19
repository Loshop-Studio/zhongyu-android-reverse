.class public final Landroidx/compose/material/icons/rounded/FoodBankKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _foodBank:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getFoodBank(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/FoodBankKt;->_foodBank:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.FoodBank"

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
    const v0, 0x412ccccd    # 10.8f

    .line 71
    .line 72
    .line 73
    const v2, 0x4079999a    # 3.9f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const/high16 v0, 0x40900000    # 4.5f

    .line 80
    .line 81
    const/high16 v2, -0x3f400000    # -6.0f

    .line 82
    .line 83
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 84
    .line 85
    .line 86
    const/high16 v17, 0x40800000    # 4.0f

    .line 87
    .line 88
    const/high16 v18, 0x41200000    # 10.0f

    .line 89
    .line 90
    const v13, 0x4089999a    # 4.3f

    .line 91
    .line 92
    .line 93
    const v14, 0x410c7ae1    # 8.78f

    .line 94
    .line 95
    .line 96
    const/high16 v15, 0x40800000    # 4.0f

    .line 97
    .line 98
    const v16, 0x4115eb85    # 9.37f

    .line 99
    .line 100
    .line 101
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 102
    .line 103
    .line 104
    const/high16 v0, 0x41100000    # 9.0f

    .line 105
    .line 106
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 107
    .line 108
    .line 109
    const/high16 v17, 0x40000000    # 2.0f

    .line 110
    .line 111
    const/high16 v18, 0x40000000    # 2.0f

    .line 112
    .line 113
    const/4 v13, 0x0

    .line 114
    const v14, 0x3f8ccccd    # 1.1f

    .line 115
    .line 116
    .line 117
    const v15, 0x3f666666    # 0.9f

    .line 118
    .line 119
    .line 120
    const/high16 v16, 0x40000000    # 2.0f

    .line 121
    .line 122
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 123
    .line 124
    .line 125
    const/high16 v0, 0x41400000    # 12.0f

    .line 126
    .line 127
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 128
    .line 129
    .line 130
    const/high16 v18, -0x40000000    # -2.0f

    .line 131
    .line 132
    const v13, 0x3f8ccccd    # 1.1f

    .line 133
    .line 134
    .line 135
    const/4 v14, 0x0

    .line 136
    const/high16 v15, 0x40000000    # 2.0f

    .line 137
    .line 138
    const v16, -0x4099999a    # -0.9f

    .line 139
    .line 140
    .line 141
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 142
    .line 143
    .line 144
    const/high16 v0, -0x3ef00000    # -9.0f

    .line 145
    .line 146
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 147
    .line 148
    .line 149
    const v17, -0x40b33333    # -0.8f

    .line 150
    .line 151
    .line 152
    const v18, -0x40333333    # -1.6f

    .line 153
    .line 154
    .line 155
    const/4 v13, 0x0

    .line 156
    const v14, -0x40deb852    # -0.63f

    .line 157
    .line 158
    .line 159
    const v15, -0x41666666    # -0.3f

    .line 160
    .line 161
    .line 162
    const v16, -0x4063d70a    # -1.22f

    .line 163
    .line 164
    .line 165
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 166
    .line 167
    .line 168
    const/high16 v0, -0x3f700000    # -4.5f

    .line 169
    .line 170
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 171
    .line 172
    .line 173
    const v17, 0x412ccccd    # 10.8f

    .line 174
    .line 175
    .line 176
    const v18, 0x4079999a    # 3.9f

    .line 177
    .line 178
    .line 179
    const v13, 0x4147d70a    # 12.49f

    .line 180
    .line 181
    .line 182
    const v14, 0x4057ae14    # 3.37f

    .line 183
    .line 184
    .line 185
    const v15, 0x413828f6    # 11.51f

    .line 186
    .line 187
    .line 188
    const v16, 0x4057ae14    # 3.37f

    .line 189
    .line 190
    .line 191
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 192
    .line 193
    .line 194
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 195
    .line 196
    .line 197
    const/high16 v0, 0x41480000    # 12.5f

    .line 198
    .line 199
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 200
    .line 201
    .line 202
    const/high16 v17, -0x40400000    # -1.5f

    .line 203
    .line 204
    const/high16 v18, 0x3fc00000    # 1.5f

    .line 205
    .line 206
    const/4 v13, 0x0

    .line 207
    const v14, 0x3f547ae1    # 0.83f

    .line 208
    .line 209
    .line 210
    const v15, -0x40d47ae1    # -0.67f

    .line 211
    .line 212
    .line 213
    const/high16 v16, 0x3fc00000    # 1.5f

    .line 214
    .line 215
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 216
    .line 217
    .line 218
    const/high16 v0, 0x40600000    # 3.5f

    .line 219
    .line 220
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 221
    .line 222
    .line 223
    const/high16 v17, -0x41000000    # -0.5f

    .line 224
    .line 225
    const/high16 v18, 0x3f000000    # 0.5f

    .line 226
    .line 227
    const v14, 0x3e8f5c29    # 0.28f

    .line 228
    .line 229
    .line 230
    const v15, -0x419eb852    # -0.22f

    .line 231
    .line 232
    .line 233
    const/high16 v16, 0x3f000000    # 0.5f

    .line 234
    .line 235
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 236
    .line 237
    .line 238
    const/4 v0, 0x0

    .line 239
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 240
    .line 241
    .line 242
    const/high16 v18, -0x41000000    # -0.5f

    .line 243
    .line 244
    const v13, -0x4170a3d7    # -0.28f

    .line 245
    .line 246
    .line 247
    const/4 v14, 0x0

    .line 248
    const/high16 v15, -0x41000000    # -0.5f

    .line 249
    .line 250
    const v16, -0x419eb852    # -0.22f

    .line 251
    .line 252
    .line 253
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 254
    .line 255
    .line 256
    const/high16 v0, 0x41600000    # 14.0f

    .line 257
    .line 258
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 259
    .line 260
    .line 261
    const/high16 v17, -0x40400000    # -1.5f

    .line 262
    .line 263
    const/high16 v18, -0x40400000    # -1.5f

    .line 264
    .line 265
    const v13, -0x40ab851f    # -0.83f

    .line 266
    .line 267
    .line 268
    const/high16 v15, -0x40400000    # -1.5f

    .line 269
    .line 270
    const v16, -0x40d47ae1    # -0.67f

    .line 271
    .line 272
    .line 273
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 274
    .line 275
    .line 276
    const/high16 v0, 0x41200000    # 10.0f

    .line 277
    .line 278
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 279
    .line 280
    .line 281
    const/high16 v17, 0x3f000000    # 0.5f

    .line 282
    .line 283
    const/high16 v18, -0x41000000    # -0.5f

    .line 284
    .line 285
    const/4 v13, 0x0

    .line 286
    const v14, -0x4170a3d7    # -0.28f

    .line 287
    .line 288
    .line 289
    const v15, 0x3e6147ae    # 0.22f

    .line 290
    .line 291
    .line 292
    const/high16 v16, -0x41000000    # -0.5f

    .line 293
    .line 294
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 295
    .line 296
    .line 297
    const/4 v0, 0x0

    .line 298
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 299
    .line 300
    .line 301
    const/high16 v18, 0x3f000000    # 0.5f

    .line 302
    .line 303
    const v13, 0x3e8f5c29    # 0.28f

    .line 304
    .line 305
    .line 306
    const/4 v14, 0x0

    .line 307
    const/high16 v15, 0x3f000000    # 0.5f

    .line 308
    .line 309
    const v16, 0x3e6147ae    # 0.22f

    .line 310
    .line 311
    .line 312
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 313
    .line 314
    .line 315
    const/high16 v0, 0x40200000    # 2.5f

    .line 316
    .line 317
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 318
    .line 319
    .line 320
    const/high16 v0, 0x41200000    # 10.0f

    .line 321
    .line 322
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 323
    .line 324
    .line 325
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 326
    .line 327
    .line 328
    const/high16 v18, -0x41000000    # -0.5f

    .line 329
    .line 330
    const/4 v13, 0x0

    .line 331
    const v14, -0x4170a3d7    # -0.28f

    .line 332
    .line 333
    .line 334
    const v15, 0x3e6147ae    # 0.22f

    .line 335
    .line 336
    .line 337
    const/high16 v16, -0x41000000    # -0.5f

    .line 338
    .line 339
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 340
    .line 341
    .line 342
    const/4 v0, 0x0

    .line 343
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 344
    .line 345
    .line 346
    const/high16 v18, 0x3f000000    # 0.5f

    .line 347
    .line 348
    const v13, 0x3e8f5c29    # 0.28f

    .line 349
    .line 350
    .line 351
    const/4 v14, 0x0

    .line 352
    const/high16 v15, 0x3f000000    # 0.5f

    .line 353
    .line 354
    const v16, 0x3e6147ae    # 0.22f

    .line 355
    .line 356
    .line 357
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 358
    .line 359
    .line 360
    const/high16 v0, 0x40200000    # 2.5f

    .line 361
    .line 362
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 363
    .line 364
    .line 365
    const/high16 v0, 0x3f000000    # 0.5f

    .line 366
    .line 367
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 368
    .line 369
    .line 370
    const/high16 v0, 0x41200000    # 10.0f

    .line 371
    .line 372
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 373
    .line 374
    .line 375
    const/high16 v18, -0x41000000    # -0.5f

    .line 376
    .line 377
    const/4 v13, 0x0

    .line 378
    const v14, -0x4170a3d7    # -0.28f

    .line 379
    .line 380
    .line 381
    const v15, 0x3e6147ae    # 0.22f

    .line 382
    .line 383
    .line 384
    const/high16 v16, -0x41000000    # -0.5f

    .line 385
    .line 386
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 387
    .line 388
    .line 389
    const/4 v0, 0x0

    .line 390
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 391
    .line 392
    .line 393
    const/high16 v18, 0x3f000000    # 0.5f

    .line 394
    .line 395
    const v13, 0x3e8f5c29    # 0.28f

    .line 396
    .line 397
    .line 398
    const/4 v14, 0x0

    .line 399
    const/high16 v15, 0x3f000000    # 0.5f

    .line 400
    .line 401
    const v16, 0x3e6147ae    # 0.22f

    .line 402
    .line 403
    .line 404
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 405
    .line 406
    .line 407
    const/high16 v0, 0x41480000    # 12.5f

    .line 408
    .line 409
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 410
    .line 411
    .line 412
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 413
    .line 414
    .line 415
    const/high16 v0, 0x41900000    # 18.0f

    .line 416
    .line 417
    const/high16 v2, 0x41680000    # 14.5f

    .line 418
    .line 419
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 420
    .line 421
    .line 422
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 423
    .line 424
    .line 425
    const/high16 v17, -0x41000000    # -0.5f

    .line 426
    .line 427
    const/high16 v18, -0x41000000    # -0.5f

    .line 428
    .line 429
    const v13, -0x4170a3d7    # -0.28f

    .line 430
    .line 431
    .line 432
    const/high16 v15, -0x41000000    # -0.5f

    .line 433
    .line 434
    const v16, -0x419eb852    # -0.22f

    .line 435
    .line 436
    .line 437
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 438
    .line 439
    .line 440
    const/high16 v0, -0x3fc00000    # -3.0f

    .line 441
    .line 442
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 443
    .line 444
    .line 445
    const/high16 v0, -0x41000000    # -0.5f

    .line 446
    .line 447
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 448
    .line 449
    .line 450
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 451
    .line 452
    .line 453
    const/high16 v0, -0x3fe00000    # -2.5f

    .line 454
    .line 455
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 456
    .line 457
    .line 458
    const v17, 0x3fae147b    # 1.36f

    .line 459
    .line 460
    .line 461
    const v18, -0x400e147b    # -1.89f

    .line 462
    .line 463
    .line 464
    const/4 v13, 0x0

    .line 465
    const v14, -0x409eb852    # -0.88f

    .line 466
    .line 467
    .line 468
    const v15, 0x3f11eb85    # 0.57f

    .line 469
    .line 470
    .line 471
    const v16, -0x402f5c29    # -1.63f

    .line 472
    .line 473
    .line 474
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 475
    .line 476
    .line 477
    const/high16 v17, 0x41700000    # 15.0f

    .line 478
    .line 479
    const v18, 0x412170a4    # 10.09f

    .line 480
    .line 481
    .line 482
    const v13, 0x416ab852    # 14.67f

    .line 483
    .line 484
    .line 485
    const/high16 v14, 0x41180000    # 9.5f

    .line 486
    .line 487
    const/high16 v15, 0x41700000    # 15.0f

    .line 488
    .line 489
    const/high16 v16, 0x411c0000    # 9.75f

    .line 490
    .line 491
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 492
    .line 493
    .line 494
    const v0, 0x40ed1eb8    # 7.41f

    .line 495
    .line 496
    .line 497
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 498
    .line 499
    .line 500
    const/high16 v17, 0x41680000    # 14.5f

    .line 501
    .line 502
    const/high16 v18, 0x41900000    # 18.0f

    .line 503
    .line 504
    const/high16 v13, 0x41700000    # 15.0f

    .line 505
    .line 506
    const v14, 0x418e3d71    # 17.78f

    .line 507
    .line 508
    .line 509
    const v15, 0x416c7ae1    # 14.78f

    .line 510
    .line 511
    .line 512
    const/high16 v16, 0x41900000    # 18.0f

    .line 513
    .line 514
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 515
    .line 516
    .line 517
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 518
    .line 519
    .line 520
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 521
    .line 522
    .line 523
    move-result-object v2

    .line 524
    const/16 v16, 0x3800

    .line 525
    .line 526
    const/16 v17, 0x0

    .line 527
    .line 528
    const/high16 v6, 0x3f800000    # 1.0f

    .line 529
    .line 530
    const/high16 v8, 0x3f800000    # 1.0f

    .line 531
    .line 532
    const/4 v7, 0x0

    .line 533
    const/high16 v9, 0x3f800000    # 1.0f

    .line 534
    .line 535
    const/high16 v12, 0x3f800000    # 1.0f

    .line 536
    .line 537
    const/4 v13, 0x0

    .line 538
    const/4 v14, 0x0

    .line 539
    const/4 v15, 0x0

    .line 540
    const-string v4, ""

    .line 541
    .line 542
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 543
    .line 544
    .line 545
    move-result-object v0

    .line 546
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 547
    .line 548
    .line 549
    move-result-object v0

    .line 550
    sput-object v0, Landroidx/compose/material/icons/rounded/FoodBankKt;->_foodBank:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 551
    .line 552
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 553
    .line 554
    .line 555
    return-object v0
.end method
