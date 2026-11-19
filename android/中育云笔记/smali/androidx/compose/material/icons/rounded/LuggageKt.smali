.class public final Landroidx/compose/material/icons/rounded/LuggageKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _luggage:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getLuggage(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/LuggageKt;->_luggage:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.Luggage"

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
    const/high16 v0, 0x41880000    # 17.0f

    .line 71
    .line 72
    const/high16 v2, 0x40c00000    # 6.0f

    .line 73
    .line 74
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v0, -0x40000000    # -2.0f

    .line 78
    .line 79
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 80
    .line 81
    .line 82
    const/high16 v0, 0x40400000    # 3.0f

    .line 83
    .line 84
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 85
    .line 86
    .line 87
    const/high16 v17, -0x40800000    # -1.0f

    .line 88
    .line 89
    const/high16 v18, -0x40800000    # -1.0f

    .line 90
    .line 91
    const/4 v13, 0x0

    .line 92
    const v14, -0x40f33333    # -0.55f

    .line 93
    .line 94
    .line 95
    const v15, -0x4119999a    # -0.45f

    .line 96
    .line 97
    .line 98
    const/high16 v16, -0x40800000    # -1.0f

    .line 99
    .line 100
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 101
    .line 102
    .line 103
    const/high16 v0, -0x3f800000    # -4.0f

    .line 104
    .line 105
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 106
    .line 107
    .line 108
    const/high16 v17, 0x41100000    # 9.0f

    .line 109
    .line 110
    const/high16 v18, 0x40400000    # 3.0f

    .line 111
    .line 112
    const v13, 0x41173333    # 9.45f

    .line 113
    .line 114
    .line 115
    const/high16 v14, 0x40000000    # 2.0f

    .line 116
    .line 117
    const/high16 v15, 0x41100000    # 9.0f

    .line 118
    .line 119
    const v16, 0x401ccccd    # 2.45f

    .line 120
    .line 121
    .line 122
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 123
    .line 124
    .line 125
    const/high16 v0, 0x40400000    # 3.0f

    .line 126
    .line 127
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 128
    .line 129
    .line 130
    const/high16 v0, 0x40e00000    # 7.0f

    .line 131
    .line 132
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 133
    .line 134
    .line 135
    const/high16 v17, 0x40a00000    # 5.0f

    .line 136
    .line 137
    const/high16 v18, 0x41000000    # 8.0f

    .line 138
    .line 139
    const v13, 0x40bccccd    # 5.9f

    .line 140
    .line 141
    .line 142
    const/high16 v14, 0x40c00000    # 6.0f

    .line 143
    .line 144
    const/high16 v15, 0x40a00000    # 5.0f

    .line 145
    .line 146
    const v16, 0x40dccccd    # 6.9f

    .line 147
    .line 148
    .line 149
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 150
    .line 151
    .line 152
    const/high16 v0, 0x41300000    # 11.0f

    .line 153
    .line 154
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 155
    .line 156
    .line 157
    const/high16 v17, 0x40000000    # 2.0f

    .line 158
    .line 159
    const/high16 v18, 0x40000000    # 2.0f

    .line 160
    .line 161
    const/4 v13, 0x0

    .line 162
    const v14, 0x3f8ccccd    # 1.1f

    .line 163
    .line 164
    .line 165
    const v15, 0x3f666666    # 0.9f

    .line 166
    .line 167
    .line 168
    const/high16 v16, 0x40000000    # 2.0f

    .line 169
    .line 170
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 171
    .line 172
    .line 173
    const/high16 v17, 0x3f800000    # 1.0f

    .line 174
    .line 175
    const/high16 v18, 0x3f800000    # 1.0f

    .line 176
    .line 177
    const v14, 0x3f0ccccd    # 0.55f

    .line 178
    .line 179
    .line 180
    const v15, 0x3ee66666    # 0.45f

    .line 181
    .line 182
    .line 183
    const/high16 v16, 0x3f800000    # 1.0f

    .line 184
    .line 185
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 186
    .line 187
    .line 188
    const/high16 v18, -0x40800000    # -1.0f

    .line 189
    .line 190
    const v13, 0x3f0ccccd    # 0.55f

    .line 191
    .line 192
    .line 193
    const/4 v14, 0x0

    .line 194
    const/high16 v15, 0x3f800000    # 1.0f

    .line 195
    .line 196
    const v16, -0x4119999a    # -0.45f

    .line 197
    .line 198
    .line 199
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 200
    .line 201
    .line 202
    const/high16 v0, 0x40c00000    # 6.0f

    .line 203
    .line 204
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 205
    .line 206
    .line 207
    const/high16 v18, 0x3f800000    # 1.0f

    .line 208
    .line 209
    const/4 v13, 0x0

    .line 210
    const v14, 0x3f0ccccd    # 0.55f

    .line 211
    .line 212
    .line 213
    const v15, 0x3ee66666    # 0.45f

    .line 214
    .line 215
    .line 216
    const/high16 v16, 0x3f800000    # 1.0f

    .line 217
    .line 218
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 219
    .line 220
    .line 221
    const/high16 v18, -0x40800000    # -1.0f

    .line 222
    .line 223
    const v13, 0x3f0ccccd    # 0.55f

    .line 224
    .line 225
    .line 226
    const/4 v14, 0x0

    .line 227
    const/high16 v15, 0x3f800000    # 1.0f

    .line 228
    .line 229
    const v16, -0x4119999a    # -0.45f

    .line 230
    .line 231
    .line 232
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 233
    .line 234
    .line 235
    const/high16 v17, 0x40000000    # 2.0f

    .line 236
    .line 237
    const/high16 v18, -0x40000000    # -2.0f

    .line 238
    .line 239
    const v13, 0x3f8ccccd    # 1.1f

    .line 240
    .line 241
    .line 242
    const/high16 v15, 0x40000000    # 2.0f

    .line 243
    .line 244
    const v16, -0x4099999a    # -0.9f

    .line 245
    .line 246
    .line 247
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 248
    .line 249
    .line 250
    const/high16 v0, 0x41000000    # 8.0f

    .line 251
    .line 252
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 253
    .line 254
    .line 255
    const/high16 v17, 0x41880000    # 17.0f

    .line 256
    .line 257
    const/high16 v18, 0x40c00000    # 6.0f

    .line 258
    .line 259
    const/high16 v13, 0x41980000    # 19.0f

    .line 260
    .line 261
    const v14, 0x40dccccd    # 6.9f

    .line 262
    .line 263
    .line 264
    const v15, 0x4190cccd    # 18.1f

    .line 265
    .line 266
    .line 267
    const/high16 v16, 0x40c00000    # 6.0f

    .line 268
    .line 269
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 270
    .line 271
    .line 272
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 273
    .line 274
    .line 275
    const/high16 v0, 0x410c0000    # 8.75f

    .line 276
    .line 277
    const/high16 v2, 0x41900000    # 18.0f

    .line 278
    .line 279
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 280
    .line 281
    .line 282
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 283
    .line 284
    .line 285
    const/high16 v17, 0x41000000    # 8.0f

    .line 286
    .line 287
    const/high16 v18, 0x418a0000    # 17.25f

    .line 288
    .line 289
    const v13, 0x410570a4    # 8.34f

    .line 290
    .line 291
    .line 292
    const/high16 v14, 0x41900000    # 18.0f

    .line 293
    .line 294
    const/high16 v15, 0x41000000    # 8.0f

    .line 295
    .line 296
    const v16, 0x418d47ae    # 17.66f

    .line 297
    .line 298
    .line 299
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 300
    .line 301
    .line 302
    const/high16 v0, -0x3f100000    # -7.5f

    .line 303
    .line 304
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 305
    .line 306
    .line 307
    const/high16 v17, 0x410c0000    # 8.75f

    .line 308
    .line 309
    const/high16 v18, 0x41100000    # 9.0f

    .line 310
    .line 311
    const/high16 v13, 0x41000000    # 8.0f

    .line 312
    .line 313
    const v14, 0x411570a4    # 9.34f

    .line 314
    .line 315
    .line 316
    const v15, 0x410570a4    # 8.34f

    .line 317
    .line 318
    .line 319
    const/high16 v16, 0x41100000    # 9.0f

    .line 320
    .line 321
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 322
    .line 323
    .line 324
    const/4 v0, 0x0

    .line 325
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 326
    .line 327
    .line 328
    const/high16 v17, 0x41180000    # 9.5f

    .line 329
    .line 330
    const/high16 v18, 0x411c0000    # 9.75f

    .line 331
    .line 332
    const v13, 0x41128f5c    # 9.16f

    .line 333
    .line 334
    .line 335
    const/high16 v14, 0x41100000    # 9.0f

    .line 336
    .line 337
    const/high16 v15, 0x41180000    # 9.5f

    .line 338
    .line 339
    const v16, 0x411570a4    # 9.34f

    .line 340
    .line 341
    .line 342
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 343
    .line 344
    .line 345
    const/high16 v0, 0x40f00000    # 7.5f

    .line 346
    .line 347
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 348
    .line 349
    .line 350
    const/high16 v17, 0x410c0000    # 8.75f

    .line 351
    .line 352
    const/high16 v18, 0x41900000    # 18.0f

    .line 353
    .line 354
    const/high16 v13, 0x41180000    # 9.5f

    .line 355
    .line 356
    const v14, 0x418d47ae    # 17.66f

    .line 357
    .line 358
    .line 359
    const v15, 0x41128f5c    # 9.16f

    .line 360
    .line 361
    .line 362
    const/high16 v16, 0x41900000    # 18.0f

    .line 363
    .line 364
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 365
    .line 366
    .line 367
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 368
    .line 369
    .line 370
    const/high16 v0, 0x41400000    # 12.0f

    .line 371
    .line 372
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 373
    .line 374
    .line 375
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 376
    .line 377
    .line 378
    const/high16 v17, -0x40c00000    # -0.75f

    .line 379
    .line 380
    const/high16 v18, -0x40c00000    # -0.75f

    .line 381
    .line 382
    const v13, -0x412e147b    # -0.41f

    .line 383
    .line 384
    .line 385
    const/4 v14, 0x0

    .line 386
    const/high16 v15, -0x40c00000    # -0.75f

    .line 387
    .line 388
    const v16, -0x4151eb85    # -0.34f

    .line 389
    .line 390
    .line 391
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 392
    .line 393
    .line 394
    const/high16 v0, -0x3f100000    # -7.5f

    .line 395
    .line 396
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 397
    .line 398
    .line 399
    const/high16 v17, 0x41400000    # 12.0f

    .line 400
    .line 401
    const/high16 v18, 0x41100000    # 9.0f

    .line 402
    .line 403
    const/high16 v13, 0x41340000    # 11.25f

    .line 404
    .line 405
    const v14, 0x411570a4    # 9.34f

    .line 406
    .line 407
    .line 408
    const v15, 0x413970a4    # 11.59f

    .line 409
    .line 410
    .line 411
    const/high16 v16, 0x41100000    # 9.0f

    .line 412
    .line 413
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 414
    .line 415
    .line 416
    const/4 v0, 0x0

    .line 417
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 418
    .line 419
    .line 420
    const/high16 v17, 0x3f400000    # 0.75f

    .line 421
    .line 422
    const/high16 v18, 0x3f400000    # 0.75f

    .line 423
    .line 424
    const v13, 0x3ed1eb85    # 0.41f

    .line 425
    .line 426
    .line 427
    const/4 v14, 0x0

    .line 428
    const/high16 v15, 0x3f400000    # 0.75f

    .line 429
    .line 430
    const v16, 0x3eae147b    # 0.34f

    .line 431
    .line 432
    .line 433
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 434
    .line 435
    .line 436
    const/high16 v0, 0x40f00000    # 7.5f

    .line 437
    .line 438
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 439
    .line 440
    .line 441
    const/high16 v17, 0x41400000    # 12.0f

    .line 442
    .line 443
    const/high16 v18, 0x41900000    # 18.0f

    .line 444
    .line 445
    const/high16 v13, 0x414c0000    # 12.75f

    .line 446
    .line 447
    const v14, 0x418d47ae    # 17.66f

    .line 448
    .line 449
    .line 450
    const v15, 0x41468f5c    # 12.41f

    .line 451
    .line 452
    .line 453
    const/high16 v16, 0x41900000    # 18.0f

    .line 454
    .line 455
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 456
    .line 457
    .line 458
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 459
    .line 460
    .line 461
    const/high16 v0, 0x41580000    # 13.5f

    .line 462
    .line 463
    const/high16 v2, 0x40c00000    # 6.0f

    .line 464
    .line 465
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 466
    .line 467
    .line 468
    const/high16 v0, -0x3fc00000    # -3.0f

    .line 469
    .line 470
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 471
    .line 472
    .line 473
    const/high16 v0, 0x40600000    # 3.5f

    .line 474
    .line 475
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 476
    .line 477
    .line 478
    const/high16 v0, 0x40400000    # 3.0f

    .line 479
    .line 480
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 481
    .line 482
    .line 483
    const/high16 v0, 0x40c00000    # 6.0f

    .line 484
    .line 485
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 486
    .line 487
    .line 488
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 489
    .line 490
    .line 491
    const/high16 v0, 0x41740000    # 15.25f

    .line 492
    .line 493
    const/high16 v2, 0x41900000    # 18.0f

    .line 494
    .line 495
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 496
    .line 497
    .line 498
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 499
    .line 500
    .line 501
    const/high16 v17, -0x40c00000    # -0.75f

    .line 502
    .line 503
    const/high16 v18, -0x40c00000    # -0.75f

    .line 504
    .line 505
    const v13, -0x412e147b    # -0.41f

    .line 506
    .line 507
    .line 508
    const/4 v14, 0x0

    .line 509
    const/high16 v15, -0x40c00000    # -0.75f

    .line 510
    .line 511
    const v16, -0x4151eb85    # -0.34f

    .line 512
    .line 513
    .line 514
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 515
    .line 516
    .line 517
    const/high16 v0, -0x3f100000    # -7.5f

    .line 518
    .line 519
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 520
    .line 521
    .line 522
    const/high16 v17, 0x41740000    # 15.25f

    .line 523
    .line 524
    const/high16 v18, 0x41100000    # 9.0f

    .line 525
    .line 526
    const/high16 v13, 0x41680000    # 14.5f

    .line 527
    .line 528
    const v14, 0x411570a4    # 9.34f

    .line 529
    .line 530
    .line 531
    const v15, 0x416d70a4    # 14.84f

    .line 532
    .line 533
    .line 534
    const/high16 v16, 0x41100000    # 9.0f

    .line 535
    .line 536
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 537
    .line 538
    .line 539
    const/4 v0, 0x0

    .line 540
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 541
    .line 542
    .line 543
    const/high16 v17, 0x41800000    # 16.0f

    .line 544
    .line 545
    const/high16 v18, 0x411c0000    # 9.75f

    .line 546
    .line 547
    const v13, 0x417a8f5c    # 15.66f

    .line 548
    .line 549
    .line 550
    const/high16 v14, 0x41100000    # 9.0f

    .line 551
    .line 552
    const/high16 v15, 0x41800000    # 16.0f

    .line 553
    .line 554
    const v16, 0x411570a4    # 9.34f

    .line 555
    .line 556
    .line 557
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 558
    .line 559
    .line 560
    const/high16 v0, 0x40f00000    # 7.5f

    .line 561
    .line 562
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 563
    .line 564
    .line 565
    const/high16 v17, 0x41740000    # 15.25f

    .line 566
    .line 567
    const/high16 v18, 0x41900000    # 18.0f

    .line 568
    .line 569
    const/high16 v13, 0x41800000    # 16.0f

    .line 570
    .line 571
    const v14, 0x418d47ae    # 17.66f

    .line 572
    .line 573
    .line 574
    const v15, 0x417a8f5c    # 15.66f

    .line 575
    .line 576
    .line 577
    const/high16 v16, 0x41900000    # 18.0f

    .line 578
    .line 579
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 580
    .line 581
    .line 582
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 583
    .line 584
    .line 585
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 586
    .line 587
    .line 588
    move-result-object v2

    .line 589
    const/16 v16, 0x3800

    .line 590
    .line 591
    const/16 v17, 0x0

    .line 592
    .line 593
    const/high16 v6, 0x3f800000    # 1.0f

    .line 594
    .line 595
    const/high16 v8, 0x3f800000    # 1.0f

    .line 596
    .line 597
    const/4 v7, 0x0

    .line 598
    const/high16 v9, 0x3f800000    # 1.0f

    .line 599
    .line 600
    const/high16 v12, 0x3f800000    # 1.0f

    .line 601
    .line 602
    const/4 v13, 0x0

    .line 603
    const/4 v14, 0x0

    .line 604
    const/4 v15, 0x0

    .line 605
    const-string v4, ""

    .line 606
    .line 607
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 608
    .line 609
    .line 610
    move-result-object v0

    .line 611
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 612
    .line 613
    .line 614
    move-result-object v0

    .line 615
    sput-object v0, Landroidx/compose/material/icons/rounded/LuggageKt;->_luggage:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 616
    .line 617
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 618
    .line 619
    .line 620
    return-object v0
.end method
