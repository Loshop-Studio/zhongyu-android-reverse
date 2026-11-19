.class public final Landroidx/compose/material/icons/rounded/AddShoppingCartKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _addShoppingCart:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getAddShoppingCart(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/AddShoppingCartKt;->_addShoppingCart:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.AddShoppingCart"

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
    const/high16 v2, 0x41100000    # 9.0f

    .line 73
    .line 74
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 78
    .line 79
    .line 80
    const/high16 v17, 0x3f800000    # 1.0f

    .line 81
    .line 82
    const/high16 v18, -0x40800000    # -1.0f

    .line 83
    .line 84
    const v13, 0x3f0ccccd    # 0.55f

    .line 85
    .line 86
    .line 87
    const/4 v14, 0x0

    .line 88
    const/high16 v15, 0x3f800000    # 1.0f

    .line 89
    .line 90
    const v16, -0x4119999a    # -0.45f

    .line 91
    .line 92
    .line 93
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 94
    .line 95
    .line 96
    const/high16 v0, 0x40c00000    # 6.0f

    .line 97
    .line 98
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 99
    .line 100
    .line 101
    const/high16 v0, 0x40000000    # 2.0f

    .line 102
    .line 103
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 104
    .line 105
    .line 106
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 107
    .line 108
    .line 109
    const/4 v0, 0x0

    .line 110
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 111
    .line 112
    .line 113
    const/high16 v17, -0x40800000    # -1.0f

    .line 114
    .line 115
    const/4 v13, 0x0

    .line 116
    const v14, -0x40f33333    # -0.55f

    .line 117
    .line 118
    .line 119
    const v15, -0x4119999a    # -0.45f

    .line 120
    .line 121
    .line 122
    const/high16 v16, -0x40800000    # -1.0f

    .line 123
    .line 124
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 125
    .line 126
    .line 127
    const/high16 v0, -0x40000000    # -2.0f

    .line 128
    .line 129
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 130
    .line 131
    .line 132
    const/high16 v0, 0x40000000    # 2.0f

    .line 133
    .line 134
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 135
    .line 136
    .line 137
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 138
    .line 139
    .line 140
    const/4 v0, 0x0

    .line 141
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 142
    .line 143
    .line 144
    const/high16 v18, 0x3f800000    # 1.0f

    .line 145
    .line 146
    const v13, -0x40f33333    # -0.55f

    .line 147
    .line 148
    .line 149
    const/4 v14, 0x0

    .line 150
    const/high16 v15, -0x40800000    # -1.0f

    .line 151
    .line 152
    const v16, 0x3ee66666    # 0.45f

    .line 153
    .line 154
    .line 155
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 156
    .line 157
    .line 158
    const/high16 v0, 0x40000000    # 2.0f

    .line 159
    .line 160
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 161
    .line 162
    .line 163
    const/high16 v0, 0x41100000    # 9.0f

    .line 164
    .line 165
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 166
    .line 167
    .line 168
    const/high16 v17, 0x41000000    # 8.0f

    .line 169
    .line 170
    const/high16 v18, 0x40a00000    # 5.0f

    .line 171
    .line 172
    const v13, 0x41073333    # 8.45f

    .line 173
    .line 174
    .line 175
    const/high16 v14, 0x40800000    # 4.0f

    .line 176
    .line 177
    const/high16 v15, 0x41000000    # 8.0f

    .line 178
    .line 179
    const v16, 0x408e6666    # 4.45f

    .line 180
    .line 181
    .line 182
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 183
    .line 184
    .line 185
    const/4 v0, 0x0

    .line 186
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 187
    .line 188
    .line 189
    const/high16 v17, 0x3f800000    # 1.0f

    .line 190
    .line 191
    const/high16 v18, 0x3f800000    # 1.0f

    .line 192
    .line 193
    const/4 v13, 0x0

    .line 194
    const v14, 0x3f0ccccd    # 0.55f

    .line 195
    .line 196
    .line 197
    const v15, 0x3ee66666    # 0.45f

    .line 198
    .line 199
    .line 200
    const/high16 v16, 0x3f800000    # 1.0f

    .line 201
    .line 202
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 203
    .line 204
    .line 205
    const/high16 v0, 0x40000000    # 2.0f

    .line 206
    .line 207
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 208
    .line 209
    .line 210
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 211
    .line 212
    .line 213
    const/high16 v17, 0x41400000    # 12.0f

    .line 214
    .line 215
    const/high16 v18, 0x41100000    # 9.0f

    .line 216
    .line 217
    const/high16 v13, 0x41300000    # 11.0f

    .line 218
    .line 219
    const v14, 0x4108cccd    # 8.55f

    .line 220
    .line 221
    .line 222
    const v15, 0x41373333    # 11.45f

    .line 223
    .line 224
    .line 225
    const/high16 v16, 0x41100000    # 9.0f

    .line 226
    .line 227
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 228
    .line 229
    .line 230
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 231
    .line 232
    .line 233
    const/high16 v0, 0x40e00000    # 7.0f

    .line 234
    .line 235
    const/high16 v2, 0x41900000    # 18.0f

    .line 236
    .line 237
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 238
    .line 239
    .line 240
    const v17, -0x400147ae    # -1.99f

    .line 241
    .line 242
    .line 243
    const/high16 v18, 0x40000000    # 2.0f

    .line 244
    .line 245
    const v13, -0x40733333    # -1.1f

    .line 246
    .line 247
    .line 248
    const/4 v14, 0x0

    .line 249
    const v15, -0x400147ae    # -1.99f

    .line 250
    .line 251
    .line 252
    const v16, 0x3f666666    # 0.9f

    .line 253
    .line 254
    .line 255
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 256
    .line 257
    .line 258
    const v0, 0x40bccccd    # 5.9f

    .line 259
    .line 260
    .line 261
    const/high16 v2, 0x41b00000    # 22.0f

    .line 262
    .line 263
    const/high16 v4, 0x40e00000    # 7.0f

    .line 264
    .line 265
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 266
    .line 267
    .line 268
    const v0, -0x4099999a    # -0.9f

    .line 269
    .line 270
    .line 271
    const/high16 v2, -0x40000000    # -2.0f

    .line 272
    .line 273
    const/high16 v4, 0x40000000    # 2.0f

    .line 274
    .line 275
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 276
    .line 277
    .line 278
    const v0, 0x4101999a    # 8.1f

    .line 279
    .line 280
    .line 281
    const/high16 v2, 0x40e00000    # 7.0f

    .line 282
    .line 283
    const/high16 v4, 0x41900000    # 18.0f

    .line 284
    .line 285
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 286
    .line 287
    .line 288
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 289
    .line 290
    .line 291
    const/high16 v0, 0x41880000    # 17.0f

    .line 292
    .line 293
    const/high16 v2, 0x41900000    # 18.0f

    .line 294
    .line 295
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 296
    .line 297
    .line 298
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 299
    .line 300
    .line 301
    const v0, 0x3f63d70a    # 0.89f

    .line 302
    .line 303
    .line 304
    const v2, 0x3ffeb852    # 1.99f

    .line 305
    .line 306
    .line 307
    const/high16 v4, 0x40000000    # 2.0f

    .line 308
    .line 309
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 310
    .line 311
    .line 312
    const v0, -0x4099999a    # -0.9f

    .line 313
    .line 314
    .line 315
    const/high16 v2, -0x40000000    # -2.0f

    .line 316
    .line 317
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 318
    .line 319
    .line 320
    const v0, 0x4190cccd    # 18.1f

    .line 321
    .line 322
    .line 323
    const/high16 v2, 0x41880000    # 17.0f

    .line 324
    .line 325
    const/high16 v4, 0x41900000    # 18.0f

    .line 326
    .line 327
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 328
    .line 329
    .line 330
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 331
    .line 332
    .line 333
    const/high16 v0, 0x41500000    # 13.0f

    .line 334
    .line 335
    const v2, 0x4101999a    # 8.1f

    .line 336
    .line 337
    .line 338
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 339
    .line 340
    .line 341
    const v0, 0x40ee6666    # 7.45f

    .line 342
    .line 343
    .line 344
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 345
    .line 346
    .line 347
    const/high16 v17, 0x3fe00000    # 1.75f

    .line 348
    .line 349
    const v18, -0x407c28f6    # -1.03f

    .line 350
    .line 351
    .line 352
    const/high16 v13, 0x3f400000    # 0.75f

    .line 353
    .line 354
    const v15, 0x3fb47ae1    # 1.41f

    .line 355
    .line 356
    .line 357
    const v16, -0x412e147b    # -0.41f

    .line 358
    .line 359
    .line 360
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 361
    .line 362
    .line 363
    const v0, 0x404f5c29    # 3.24f

    .line 364
    .line 365
    .line 366
    const v2, -0x3f3b851f    # -6.14f

    .line 367
    .line 368
    .line 369
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 370
    .line 371
    .line 372
    const v17, -0x41333333    # -0.4f

    .line 373
    .line 374
    .line 375
    const v18, -0x40547ae1    # -1.34f

    .line 376
    .line 377
    .line 378
    const/high16 v13, 0x3e800000    # 0.25f

    .line 379
    .line 380
    const v14, -0x410a3d71    # -0.48f

    .line 381
    .line 382
    .line 383
    const v15, 0x3da3d70a    # 0.08f

    .line 384
    .line 385
    .line 386
    const v16, -0x4075c28f    # -1.08f

    .line 387
    .line 388
    .line 389
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 390
    .line 391
    .line 392
    const/4 v0, 0x0

    .line 393
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 394
    .line 395
    .line 396
    const v17, -0x4051eb85    # -1.36f

    .line 397
    .line 398
    .line 399
    const v18, 0x3ed1eb85    # 0.41f

    .line 400
    .line 401
    .line 402
    const v13, -0x41051eb8    # -0.49f

    .line 403
    .line 404
    .line 405
    const v14, -0x4175c28f    # -0.27f

    .line 406
    .line 407
    .line 408
    const v15, -0x40733333    # -1.1f

    .line 409
    .line 410
    .line 411
    const v16, -0x425c28f6    # -0.08f

    .line 412
    .line 413
    .line 414
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 415
    .line 416
    .line 417
    const v0, 0x4178cccd    # 15.55f

    .line 418
    .line 419
    .line 420
    const/high16 v2, 0x41300000    # 11.0f

    .line 421
    .line 422
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 423
    .line 424
    .line 425
    const v0, 0x41087ae1    # 8.53f

    .line 426
    .line 427
    .line 428
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 429
    .line 430
    .line 431
    const v0, 0x4088a3d7    # 4.27f

    .line 432
    .line 433
    .line 434
    const/high16 v2, 0x40000000    # 2.0f

    .line 435
    .line 436
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 437
    .line 438
    .line 439
    const/high16 v0, 0x40000000    # 2.0f

    .line 440
    .line 441
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 442
    .line 443
    .line 444
    const/high16 v17, 0x3f800000    # 1.0f

    .line 445
    .line 446
    const/high16 v18, 0x40400000    # 3.0f

    .line 447
    .line 448
    const v13, 0x3fb9999a    # 1.45f

    .line 449
    .line 450
    .line 451
    const/high16 v14, 0x40000000    # 2.0f

    .line 452
    .line 453
    const/high16 v15, 0x3f800000    # 1.0f

    .line 454
    .line 455
    const v16, 0x401ccccd    # 2.45f

    .line 456
    .line 457
    .line 458
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 459
    .line 460
    .line 461
    const/4 v0, 0x0

    .line 462
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 463
    .line 464
    .line 465
    const/high16 v18, 0x3f800000    # 1.0f

    .line 466
    .line 467
    const/4 v13, 0x0

    .line 468
    const v14, 0x3f0ccccd    # 0.55f

    .line 469
    .line 470
    .line 471
    const v15, 0x3ee66666    # 0.45f

    .line 472
    .line 473
    .line 474
    const/high16 v16, 0x3f800000    # 1.0f

    .line 475
    .line 476
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 477
    .line 478
    .line 479
    const/high16 v0, 0x3f800000    # 1.0f

    .line 480
    .line 481
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 482
    .line 483
    .line 484
    const v0, 0x40666666    # 3.6f

    .line 485
    .line 486
    .line 487
    const v2, 0x40f2e148    # 7.59f

    .line 488
    .line 489
    .line 490
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 491
    .line 492
    .line 493
    const v0, -0x40533333    # -1.35f

    .line 494
    .line 495
    .line 496
    const v2, 0x401c28f6    # 2.44f

    .line 497
    .line 498
    .line 499
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 500
    .line 501
    .line 502
    const/high16 v17, 0x40e00000    # 7.0f

    .line 503
    .line 504
    const/high16 v18, 0x41880000    # 17.0f

    .line 505
    .line 506
    const v13, 0x4090a3d7    # 4.52f

    .line 507
    .line 508
    .line 509
    const v14, 0x4175eb85    # 15.37f

    .line 510
    .line 511
    .line 512
    const v15, 0x40af5c29    # 5.48f

    .line 513
    .line 514
    .line 515
    const/high16 v16, 0x41880000    # 17.0f

    .line 516
    .line 517
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 518
    .line 519
    .line 520
    const/high16 v0, 0x41300000    # 11.0f

    .line 521
    .line 522
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 523
    .line 524
    .line 525
    const/high16 v17, 0x3f800000    # 1.0f

    .line 526
    .line 527
    const/high16 v18, -0x40800000    # -1.0f

    .line 528
    .line 529
    const v13, 0x3f0ccccd    # 0.55f

    .line 530
    .line 531
    .line 532
    const/4 v14, 0x0

    .line 533
    const/high16 v15, 0x3f800000    # 1.0f

    .line 534
    .line 535
    const v16, -0x4119999a    # -0.45f

    .line 536
    .line 537
    .line 538
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 539
    .line 540
    .line 541
    const/4 v0, 0x0

    .line 542
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 543
    .line 544
    .line 545
    const/high16 v17, -0x40800000    # -1.0f

    .line 546
    .line 547
    const/4 v13, 0x0

    .line 548
    const v14, -0x40f33333    # -0.55f

    .line 549
    .line 550
    .line 551
    const v15, -0x4119999a    # -0.45f

    .line 552
    .line 553
    .line 554
    const/high16 v16, -0x40800000    # -1.0f

    .line 555
    .line 556
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 557
    .line 558
    .line 559
    const/high16 v0, 0x40e00000    # 7.0f

    .line 560
    .line 561
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 562
    .line 563
    .line 564
    const/high16 v0, 0x41500000    # 13.0f

    .line 565
    .line 566
    const v2, 0x4101999a    # 8.1f

    .line 567
    .line 568
    .line 569
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 570
    .line 571
    .line 572
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 573
    .line 574
    .line 575
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 576
    .line 577
    .line 578
    move-result-object v2

    .line 579
    const/16 v16, 0x3800

    .line 580
    .line 581
    const/16 v17, 0x0

    .line 582
    .line 583
    const/high16 v6, 0x3f800000    # 1.0f

    .line 584
    .line 585
    const/high16 v8, 0x3f800000    # 1.0f

    .line 586
    .line 587
    const/4 v7, 0x0

    .line 588
    const/high16 v9, 0x3f800000    # 1.0f

    .line 589
    .line 590
    const/high16 v12, 0x3f800000    # 1.0f

    .line 591
    .line 592
    const/4 v14, 0x0

    .line 593
    const/4 v15, 0x0

    .line 594
    const-string v4, ""

    .line 595
    .line 596
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 597
    .line 598
    .line 599
    move-result-object v0

    .line 600
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 601
    .line 602
    .line 603
    move-result-object v0

    .line 604
    sput-object v0, Landroidx/compose/material/icons/rounded/AddShoppingCartKt;->_addShoppingCart:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 605
    .line 606
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 607
    .line 608
    .line 609
    return-object v0
.end method
