.class public final Landroidx/compose/material/icons/rounded/CurrencyBitcoinKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _currencyBitcoin:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getCurrencyBitcoin(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/CurrencyBitcoinKt;->_currencyBitcoin:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.CurrencyBitcoin"

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
    const/high16 v0, 0x41200000    # 10.0f

    .line 71
    .line 72
    const/high16 v2, 0x40e00000    # 7.0f

    .line 73
    .line 74
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v0, 0x40800000    # 4.0f

    .line 78
    .line 79
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 80
    .line 81
    .line 82
    const/high16 v17, 0x40000000    # 2.0f

    .line 83
    .line 84
    const/high16 v18, 0x40000000    # 2.0f

    .line 85
    .line 86
    const v13, 0x3f8ccccd    # 1.1f

    .line 87
    .line 88
    .line 89
    const/4 v14, 0x0

    .line 90
    const/high16 v15, 0x40000000    # 2.0f

    .line 91
    .line 92
    const v16, 0x3f666666    # 0.9f

    .line 93
    .line 94
    .line 95
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 96
    .line 97
    .line 98
    const v0, -0x4099999a    # -0.9f

    .line 99
    .line 100
    .line 101
    const/high16 v2, -0x40000000    # -2.0f

    .line 102
    .line 103
    const/high16 v4, 0x40000000    # 2.0f

    .line 104
    .line 105
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 106
    .line 107
    .line 108
    const/high16 v0, -0x3f800000    # -4.0f

    .line 109
    .line 110
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 111
    .line 112
    .line 113
    const/high16 v0, 0x40e00000    # 7.0f

    .line 114
    .line 115
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 116
    .line 117
    .line 118
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 119
    .line 120
    .line 121
    const/high16 v0, 0x41880000    # 17.0f

    .line 122
    .line 123
    const/high16 v2, 0x41700000    # 15.0f

    .line 124
    .line 125
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 126
    .line 127
    .line 128
    const/high16 v0, -0x3f600000    # -5.0f

    .line 129
    .line 130
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 131
    .line 132
    .line 133
    const/high16 v0, -0x3f800000    # -4.0f

    .line 134
    .line 135
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 136
    .line 137
    .line 138
    const/high16 v0, 0x40a00000    # 5.0f

    .line 139
    .line 140
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 141
    .line 142
    .line 143
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 144
    .line 145
    .line 146
    const v0, 0x4180cccd    # 16.1f

    .line 147
    .line 148
    .line 149
    const/high16 v2, 0x41880000    # 17.0f

    .line 150
    .line 151
    const/high16 v4, 0x41700000    # 15.0f

    .line 152
    .line 153
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 154
    .line 155
    .line 156
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 157
    .line 158
    .line 159
    const/high16 v0, 0x41700000    # 15.0f

    .line 160
    .line 161
    const/high16 v2, 0x40800000    # 4.0f

    .line 162
    .line 163
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 164
    .line 165
    .line 166
    const/high16 v17, -0x40800000    # -1.0f

    .line 167
    .line 168
    const/high16 v18, -0x40800000    # -1.0f

    .line 169
    .line 170
    const/4 v13, 0x0

    .line 171
    const v14, -0x40f33333    # -0.55f

    .line 172
    .line 173
    .line 174
    const v15, -0x4119999a    # -0.45f

    .line 175
    .line 176
    .line 177
    const/high16 v16, -0x40800000    # -1.0f

    .line 178
    .line 179
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 180
    .line 181
    .line 182
    const v0, 0x3ee66666    # 0.45f

    .line 183
    .line 184
    .line 185
    const/high16 v2, -0x40800000    # -1.0f

    .line 186
    .line 187
    const/high16 v4, 0x3f800000    # 1.0f

    .line 188
    .line 189
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 190
    .line 191
    .line 192
    const/high16 v0, 0x3f800000    # 1.0f

    .line 193
    .line 194
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 195
    .line 196
    .line 197
    const/high16 v0, -0x40000000    # -2.0f

    .line 198
    .line 199
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 200
    .line 201
    .line 202
    const/high16 v0, 0x40800000    # 4.0f

    .line 203
    .line 204
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 205
    .line 206
    .line 207
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 208
    .line 209
    .line 210
    const v0, 0x405ccccd    # 3.45f

    .line 211
    .line 212
    .line 213
    const/high16 v2, 0x41100000    # 9.0f

    .line 214
    .line 215
    const/high16 v4, 0x40800000    # 4.0f

    .line 216
    .line 217
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 218
    .line 219
    .line 220
    const/high16 v0, 0x3f800000    # 1.0f

    .line 221
    .line 222
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 223
    .line 224
    .line 225
    const/high16 v0, 0x40e00000    # 7.0f

    .line 226
    .line 227
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 228
    .line 229
    .line 230
    const/high16 v17, 0x40c00000    # 6.0f

    .line 231
    .line 232
    const/high16 v18, 0x40c00000    # 6.0f

    .line 233
    .line 234
    const v13, 0x40ce6666    # 6.45f

    .line 235
    .line 236
    .line 237
    const/high16 v14, 0x40a00000    # 5.0f

    .line 238
    .line 239
    const/high16 v15, 0x40c00000    # 6.0f

    .line 240
    .line 241
    const v16, 0x40ae6666    # 5.45f

    .line 242
    .line 243
    .line 244
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 245
    .line 246
    .line 247
    const v0, 0x3ee66666    # 0.45f

    .line 248
    .line 249
    .line 250
    const/high16 v2, 0x3f800000    # 1.0f

    .line 251
    .line 252
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 253
    .line 254
    .line 255
    const/high16 v0, 0x3f800000    # 1.0f

    .line 256
    .line 257
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 258
    .line 259
    .line 260
    const/high16 v0, 0x41200000    # 10.0f

    .line 261
    .line 262
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 263
    .line 264
    .line 265
    const/high16 v0, 0x40e00000    # 7.0f

    .line 266
    .line 267
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 268
    .line 269
    .line 270
    const/high16 v17, -0x40800000    # -1.0f

    .line 271
    .line 272
    const/high16 v18, 0x3f800000    # 1.0f

    .line 273
    .line 274
    const v13, -0x40f33333    # -0.55f

    .line 275
    .line 276
    .line 277
    const/4 v14, 0x0

    .line 278
    const/high16 v15, -0x40800000    # -1.0f

    .line 279
    .line 280
    const v16, 0x3ee66666    # 0.45f

    .line 281
    .line 282
    .line 283
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 284
    .line 285
    .line 286
    const v0, 0x3ee66666    # 0.45f

    .line 287
    .line 288
    .line 289
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 290
    .line 291
    .line 292
    const/high16 v0, 0x40000000    # 2.0f

    .line 293
    .line 294
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 295
    .line 296
    .line 297
    const/high16 v0, 0x3f800000    # 1.0f

    .line 298
    .line 299
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 300
    .line 301
    .line 302
    const/high16 v17, 0x3f800000    # 1.0f

    .line 303
    .line 304
    const/4 v13, 0x0

    .line 305
    const v14, 0x3f0ccccd    # 0.55f

    .line 306
    .line 307
    .line 308
    const v15, 0x3ee66666    # 0.45f

    .line 309
    .line 310
    .line 311
    const/high16 v16, 0x3f800000    # 1.0f

    .line 312
    .line 313
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 314
    .line 315
    .line 316
    const v0, -0x4119999a    # -0.45f

    .line 317
    .line 318
    .line 319
    const/high16 v2, -0x40800000    # -1.0f

    .line 320
    .line 321
    const/high16 v4, 0x3f800000    # 1.0f

    .line 322
    .line 323
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 324
    .line 325
    .line 326
    const/high16 v0, -0x40800000    # -1.0f

    .line 327
    .line 328
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 329
    .line 330
    .line 331
    const/high16 v0, 0x40000000    # 2.0f

    .line 332
    .line 333
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 334
    .line 335
    .line 336
    const/high16 v0, 0x3f800000    # 1.0f

    .line 337
    .line 338
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 339
    .line 340
    .line 341
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 342
    .line 343
    .line 344
    const v0, -0x4119999a    # -0.45f

    .line 345
    .line 346
    .line 347
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 348
    .line 349
    .line 350
    const/high16 v0, -0x40800000    # -1.0f

    .line 351
    .line 352
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 353
    .line 354
    .line 355
    const/high16 v17, 0x40800000    # 4.0f

    .line 356
    .line 357
    const/high16 v18, -0x3f800000    # -4.0f

    .line 358
    .line 359
    const v13, 0x400d70a4    # 2.21f

    .line 360
    .line 361
    .line 362
    const/4 v14, 0x0

    .line 363
    const/high16 v15, 0x40800000    # 4.0f

    .line 364
    .line 365
    const v16, -0x401ae148    # -1.79f

    .line 366
    .line 367
    .line 368
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 369
    .line 370
    .line 371
    const v17, -0x4007ae14    # -1.94f

    .line 372
    .line 373
    .line 374
    const v18, -0x3fa47ae1    # -3.43f

    .line 375
    .line 376
    .line 377
    const/4 v13, 0x0

    .line 378
    const v14, -0x40466666    # -1.45f

    .line 379
    .line 380
    .line 381
    const v15, -0x40b851ec    # -0.78f

    .line 382
    .line 383
    .line 384
    const v16, -0x3fd147ae    # -2.73f

    .line 385
    .line 386
    .line 387
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 388
    .line 389
    .line 390
    const/high16 v17, 0x41900000    # 18.0f

    .line 391
    .line 392
    const/high16 v18, 0x41100000    # 9.0f

    .line 393
    .line 394
    const v13, 0x418d3333    # 17.65f

    .line 395
    .line 396
    .line 397
    const v14, 0x412e147b    # 10.88f

    .line 398
    .line 399
    .line 400
    const/high16 v15, 0x41900000    # 18.0f

    .line 401
    .line 402
    const v16, 0x411fae14    # 9.98f

    .line 403
    .line 404
    .line 405
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 406
    .line 407
    .line 408
    const/high16 v17, -0x3fc00000    # -3.0f

    .line 409
    .line 410
    const v18, -0x3f8851ec    # -3.87f

    .line 411
    .line 412
    .line 413
    const/4 v13, 0x0

    .line 414
    const v14, -0x4011eb85    # -1.86f

    .line 415
    .line 416
    .line 417
    const v15, -0x405d70a4    # -1.27f

    .line 418
    .line 419
    .line 420
    const v16, -0x3fa47ae1    # -3.43f

    .line 421
    .line 422
    .line 423
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 424
    .line 425
    .line 426
    const/high16 v0, 0x41700000    # 15.0f

    .line 427
    .line 428
    const/high16 v2, 0x40800000    # 4.0f

    .line 429
    .line 430
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 431
    .line 432
    .line 433
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 434
    .line 435
    .line 436
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 437
    .line 438
    .line 439
    move-result-object v2

    .line 440
    const/16 v16, 0x3800

    .line 441
    .line 442
    const/16 v17, 0x0

    .line 443
    .line 444
    const/high16 v6, 0x3f800000    # 1.0f

    .line 445
    .line 446
    const/high16 v8, 0x3f800000    # 1.0f

    .line 447
    .line 448
    const/4 v7, 0x0

    .line 449
    const/high16 v9, 0x3f800000    # 1.0f

    .line 450
    .line 451
    const/high16 v12, 0x3f800000    # 1.0f

    .line 452
    .line 453
    const/4 v14, 0x0

    .line 454
    const/4 v15, 0x0

    .line 455
    const-string v4, ""

    .line 456
    .line 457
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 458
    .line 459
    .line 460
    move-result-object v0

    .line 461
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 462
    .line 463
    .line 464
    move-result-object v0

    .line 465
    sput-object v0, Landroidx/compose/material/icons/rounded/CurrencyBitcoinKt;->_currencyBitcoin:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 466
    .line 467
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 468
    .line 469
    .line 470
    return-object v0
.end method
