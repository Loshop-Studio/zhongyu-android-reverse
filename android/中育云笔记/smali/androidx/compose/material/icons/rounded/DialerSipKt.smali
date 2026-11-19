.class public final Landroidx/compose/material/icons/rounded/DialerSipKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _dialerSip:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getDialerSip(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/DialerSipKt;->_dialerSip:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.DialerSip"

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
    const/high16 v0, 0x41840000    # 16.5f

    .line 71
    .line 72
    const/high16 v2, 0x41000000    # 8.0f

    .line 73
    .line 74
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v17, 0x3f000000    # 0.5f

    .line 78
    .line 79
    const/high16 v18, -0x41000000    # -0.5f

    .line 80
    .line 81
    const v13, 0x3e8f5c29    # 0.28f

    .line 82
    .line 83
    .line 84
    const/4 v14, 0x0

    .line 85
    const/high16 v15, 0x3f000000    # 0.5f

    .line 86
    .line 87
    const v16, -0x419eb852    # -0.22f

    .line 88
    .line 89
    .line 90
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 91
    .line 92
    .line 93
    const/high16 v0, -0x3f800000    # -4.0f

    .line 94
    .line 95
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 96
    .line 97
    .line 98
    const/high16 v17, -0x41000000    # -0.5f

    .line 99
    .line 100
    const/4 v13, 0x0

    .line 101
    const v14, -0x4170a3d7    # -0.28f

    .line 102
    .line 103
    .line 104
    const v15, -0x419eb852    # -0.22f

    .line 105
    .line 106
    .line 107
    const/high16 v16, -0x41000000    # -0.5f

    .line 108
    .line 109
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 110
    .line 111
    .line 112
    const v0, 0x3e6147ae    # 0.22f

    .line 113
    .line 114
    .line 115
    const/high16 v2, 0x3f000000    # 0.5f

    .line 116
    .line 117
    const/high16 v4, -0x41000000    # -0.5f

    .line 118
    .line 119
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 120
    .line 121
    .line 122
    const/high16 v0, 0x40800000    # 4.0f

    .line 123
    .line 124
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 125
    .line 126
    .line 127
    const/high16 v17, 0x3f000000    # 0.5f

    .line 128
    .line 129
    const/high16 v18, 0x3f000000    # 0.5f

    .line 130
    .line 131
    const v14, 0x3e8f5c29    # 0.28f

    .line 132
    .line 133
    .line 134
    const v15, 0x3e6147ae    # 0.22f

    .line 135
    .line 136
    .line 137
    const/high16 v16, 0x3f000000    # 0.5f

    .line 138
    .line 139
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 140
    .line 141
    .line 142
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 143
    .line 144
    .line 145
    const/high16 v0, 0x41480000    # 12.5f

    .line 146
    .line 147
    const/high16 v2, 0x40e00000    # 7.0f

    .line 148
    .line 149
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 150
    .line 151
    .line 152
    const/high16 v17, -0x41000000    # -0.5f

    .line 153
    .line 154
    const v13, -0x4170a3d7    # -0.28f

    .line 155
    .line 156
    .line 157
    const/4 v14, 0x0

    .line 158
    const/high16 v15, -0x41000000    # -0.5f

    .line 159
    .line 160
    const v16, 0x3e6147ae    # 0.22f

    .line 161
    .line 162
    .line 163
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 164
    .line 165
    .line 166
    const v0, 0x3e6147ae    # 0.22f

    .line 167
    .line 168
    .line 169
    const/high16 v2, 0x3f000000    # 0.5f

    .line 170
    .line 171
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 172
    .line 173
    .line 174
    const v0, 0x3ff9999a    # 1.95f

    .line 175
    .line 176
    .line 177
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 178
    .line 179
    .line 180
    const v17, 0x3f0ccccd    # 0.55f

    .line 181
    .line 182
    .line 183
    const v18, -0x40f33333    # -0.55f

    .line 184
    .line 185
    .line 186
    const v13, 0x3e99999a    # 0.3f

    .line 187
    .line 188
    .line 189
    const v15, 0x3f0ccccd    # 0.55f

    .line 190
    .line 191
    .line 192
    const/high16 v16, -0x41800000    # -0.25f

    .line 193
    .line 194
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 195
    .line 196
    .line 197
    const v0, -0x400ccccd    # -1.9f

    .line 198
    .line 199
    .line 200
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 201
    .line 202
    .line 203
    const v17, -0x40f33333    # -0.55f

    .line 204
    .line 205
    .line 206
    const/4 v13, 0x0

    .line 207
    const v14, -0x41666666    # -0.3f

    .line 208
    .line 209
    .line 210
    const/high16 v15, -0x41800000    # -0.25f

    .line 211
    .line 212
    const v16, -0x40f33333    # -0.55f

    .line 213
    .line 214
    .line 215
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 216
    .line 217
    .line 218
    const/high16 v0, 0x40a00000    # 5.0f

    .line 219
    .line 220
    const/high16 v2, 0x41500000    # 13.0f

    .line 221
    .line 222
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 223
    .line 224
    .line 225
    const/high16 v0, 0x41500000    # 13.0f

    .line 226
    .line 227
    const/high16 v2, 0x40800000    # 4.0f

    .line 228
    .line 229
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 230
    .line 231
    .line 232
    const/high16 v0, 0x3fc00000    # 1.5f

    .line 233
    .line 234
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 235
    .line 236
    .line 237
    const/high16 v17, 0x3f000000    # 0.5f

    .line 238
    .line 239
    const/high16 v18, -0x41000000    # -0.5f

    .line 240
    .line 241
    const v13, 0x3e8f5c29    # 0.28f

    .line 242
    .line 243
    .line 244
    const/4 v14, 0x0

    .line 245
    const/high16 v15, 0x3f000000    # 0.5f

    .line 246
    .line 247
    const v16, -0x419eb852    # -0.22f

    .line 248
    .line 249
    .line 250
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 251
    .line 252
    .line 253
    const v0, -0x419eb852    # -0.22f

    .line 254
    .line 255
    .line 256
    const/high16 v2, -0x41000000    # -0.5f

    .line 257
    .line 258
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 259
    .line 260
    .line 261
    const v0, -0x40066666    # -1.95f

    .line 262
    .line 263
    .line 264
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 265
    .line 266
    .line 267
    const v17, -0x40f33333    # -0.55f

    .line 268
    .line 269
    .line 270
    const v18, 0x3f0ccccd    # 0.55f

    .line 271
    .line 272
    .line 273
    const v13, -0x41666666    # -0.3f

    .line 274
    .line 275
    .line 276
    const v15, -0x40f33333    # -0.55f

    .line 277
    .line 278
    .line 279
    const/high16 v16, 0x3e800000    # 0.25f

    .line 280
    .line 281
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 282
    .line 283
    .line 284
    const v0, 0x3ff1eb85    # 1.89f

    .line 285
    .line 286
    .line 287
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 288
    .line 289
    .line 290
    const v17, 0x3f0ccccd    # 0.55f

    .line 291
    .line 292
    .line 293
    const v18, 0x3f0f5c29    # 0.56f

    .line 294
    .line 295
    .line 296
    const/4 v13, 0x0

    .line 297
    const v14, 0x3e9eb852    # 0.31f

    .line 298
    .line 299
    .line 300
    const/high16 v15, 0x3e800000    # 0.25f

    .line 301
    .line 302
    const v16, 0x3f0f5c29    # 0.56f

    .line 303
    .line 304
    .line 305
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 306
    .line 307
    .line 308
    const/high16 v0, 0x41600000    # 14.0f

    .line 309
    .line 310
    const/high16 v2, 0x40c00000    # 6.0f

    .line 311
    .line 312
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 313
    .line 314
    .line 315
    const/high16 v0, 0x3f800000    # 1.0f

    .line 316
    .line 317
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 318
    .line 319
    .line 320
    const/high16 v0, -0x40400000    # -1.5f

    .line 321
    .line 322
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 323
    .line 324
    .line 325
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 326
    .line 327
    .line 328
    const v0, 0x41a3999a    # 20.45f

    .line 329
    .line 330
    .line 331
    const/high16 v2, 0x40400000    # 3.0f

    .line 332
    .line 333
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 334
    .line 335
    .line 336
    const v0, -0x400e147b    # -1.89f

    .line 337
    .line 338
    .line 339
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 340
    .line 341
    .line 342
    const v17, -0x40f0a3d7    # -0.56f

    .line 343
    .line 344
    .line 345
    const v18, 0x3f0ccccd    # 0.55f

    .line 346
    .line 347
    .line 348
    const v13, -0x416147ae    # -0.31f

    .line 349
    .line 350
    .line 351
    const/4 v14, 0x0

    .line 352
    const v15, -0x40f0a3d7    # -0.56f

    .line 353
    .line 354
    .line 355
    const/high16 v16, 0x3e800000    # 0.25f

    .line 356
    .line 357
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 358
    .line 359
    .line 360
    const/high16 v0, 0x41900000    # 18.0f

    .line 361
    .line 362
    const/high16 v2, 0x40f00000    # 7.5f

    .line 363
    .line 364
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 365
    .line 366
    .line 367
    const/high16 v17, 0x3f000000    # 0.5f

    .line 368
    .line 369
    const/high16 v18, 0x3f000000    # 0.5f

    .line 370
    .line 371
    const/4 v13, 0x0

    .line 372
    const v14, 0x3e8f5c29    # 0.28f

    .line 373
    .line 374
    .line 375
    const v15, 0x3e6147ae    # 0.22f

    .line 376
    .line 377
    .line 378
    const/high16 v16, 0x3f000000    # 0.5f

    .line 379
    .line 380
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 381
    .line 382
    .line 383
    const v0, -0x419eb852    # -0.22f

    .line 384
    .line 385
    .line 386
    const/high16 v2, 0x3f000000    # 0.5f

    .line 387
    .line 388
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 389
    .line 390
    .line 391
    const/high16 v0, 0x41980000    # 19.0f

    .line 392
    .line 393
    const/high16 v2, 0x40c00000    # 6.0f

    .line 394
    .line 395
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 396
    .line 397
    .line 398
    const v0, 0x3fb9999a    # 1.45f

    .line 399
    .line 400
    .line 401
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 402
    .line 403
    .line 404
    const v17, 0x3f0ccccd    # 0.55f

    .line 405
    .line 406
    .line 407
    const v18, -0x40f33333    # -0.55f

    .line 408
    .line 409
    .line 410
    const v13, 0x3e99999a    # 0.3f

    .line 411
    .line 412
    .line 413
    const/4 v14, 0x0

    .line 414
    const v15, 0x3f0ccccd    # 0.55f

    .line 415
    .line 416
    .line 417
    const/high16 v16, -0x41800000    # -0.25f

    .line 418
    .line 419
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 420
    .line 421
    .line 422
    const v0, -0x400ccccd    # -1.9f

    .line 423
    .line 424
    .line 425
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 426
    .line 427
    .line 428
    const v17, -0x40f33333    # -0.55f

    .line 429
    .line 430
    .line 431
    const/4 v13, 0x0

    .line 432
    const v14, -0x41666666    # -0.3f

    .line 433
    .line 434
    .line 435
    const/high16 v15, -0x41800000    # -0.25f

    .line 436
    .line 437
    const v16, -0x40f33333    # -0.55f

    .line 438
    .line 439
    .line 440
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 441
    .line 442
    .line 443
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 444
    .line 445
    .line 446
    const/high16 v0, 0x41a00000    # 20.0f

    .line 447
    .line 448
    const/high16 v2, 0x40a00000    # 5.0f

    .line 449
    .line 450
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 451
    .line 452
    .line 453
    const/high16 v0, -0x40800000    # -1.0f

    .line 454
    .line 455
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 456
    .line 457
    .line 458
    const/high16 v0, 0x41980000    # 19.0f

    .line 459
    .line 460
    const/high16 v2, 0x40800000    # 4.0f

    .line 461
    .line 462
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 463
    .line 464
    .line 465
    const/high16 v0, 0x3f800000    # 1.0f

    .line 466
    .line 467
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 468
    .line 469
    .line 470
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 471
    .line 472
    .line 473
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 474
    .line 475
    .line 476
    const v0, 0x4199ae14    # 19.21f

    .line 477
    .line 478
    .line 479
    const v2, 0x417451ec    # 15.27f

    .line 480
    .line 481
    .line 482
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 483
    .line 484
    .line 485
    const v0, -0x3fdd70a4    # -2.54f

    .line 486
    .line 487
    .line 488
    const v2, -0x416b851f    # -0.29f

    .line 489
    .line 490
    .line 491
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 492
    .line 493
    .line 494
    const v17, -0x402e147b    # -1.64f

    .line 495
    .line 496
    .line 497
    const v18, 0x3f11eb85    # 0.57f

    .line 498
    .line 499
    .line 500
    const v13, -0x40e3d70a    # -0.61f

    .line 501
    .line 502
    .line 503
    const v14, -0x4270a3d7    # -0.07f

    .line 504
    .line 505
    .line 506
    const v15, -0x40651eb8    # -1.21f

    .line 507
    .line 508
    .line 509
    const v16, 0x3e0f5c29    # 0.14f

    .line 510
    .line 511
    .line 512
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 513
    .line 514
    .line 515
    const v0, -0x40147ae1    # -1.84f

    .line 516
    .line 517
    .line 518
    const v2, 0x3feb851f    # 1.84f

    .line 519
    .line 520
    .line 521
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 522
    .line 523
    .line 524
    const v17, -0x3f2d1eb8    # -6.59f

    .line 525
    .line 526
    .line 527
    const v18, -0x3f2d1eb8    # -6.59f

    .line 528
    .line 529
    .line 530
    const v13, -0x3fcae148    # -2.83f

    .line 531
    .line 532
    .line 533
    const v14, -0x4047ae14    # -1.44f

    .line 534
    .line 535
    .line 536
    const v15, -0x3f5b3333    # -5.15f

    .line 537
    .line 538
    .line 539
    const/high16 v16, -0x3f900000    # -3.75f

    .line 540
    .line 541
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 542
    .line 543
    .line 544
    const v0, 0x3feccccd    # 1.85f

    .line 545
    .line 546
    .line 547
    const v2, -0x40133333    # -1.85f

    .line 548
    .line 549
    .line 550
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 551
    .line 552
    .line 553
    const v17, 0x3f11eb85    # 0.57f

    .line 554
    .line 555
    .line 556
    const v18, -0x402e147b    # -1.64f

    .line 557
    .line 558
    .line 559
    const v13, 0x3edc28f6    # 0.43f

    .line 560
    .line 561
    .line 562
    const v14, -0x4123d70a    # -0.43f

    .line 563
    .line 564
    .line 565
    const v15, 0x3f23d70a    # 0.64f

    .line 566
    .line 567
    .line 568
    const v16, -0x407ae148    # -1.04f

    .line 569
    .line 570
    .line 571
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 572
    .line 573
    .line 574
    const v0, -0x3fdeb852    # -2.52f

    .line 575
    .line 576
    .line 577
    const v2, -0x416b851f    # -0.29f

    .line 578
    .line 579
    .line 580
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 581
    .line 582
    .line 583
    const v17, -0x40028f5c    # -1.98f

    .line 584
    .line 585
    .line 586
    const v18, -0x401c28f6    # -1.78f

    .line 587
    .line 588
    .line 589
    const v13, -0x421eb852    # -0.11f

    .line 590
    .line 591
    .line 592
    const v14, -0x407eb852    # -1.01f

    .line 593
    .line 594
    .line 595
    const v15, -0x4087ae14    # -0.97f

    .line 596
    .line 597
    .line 598
    const v16, -0x401c28f6    # -1.78f

    .line 599
    .line 600
    .line 601
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 602
    .line 603
    .line 604
    const v0, 0x40a0a3d7    # 5.02f

    .line 605
    .line 606
    .line 607
    const v2, 0x4040a3d7    # 3.01f

    .line 608
    .line 609
    .line 610
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 611
    .line 612
    .line 613
    const/high16 v17, -0x40000000    # -2.0f

    .line 614
    .line 615
    const v18, 0x40047ae1    # 2.07f

    .line 616
    .line 617
    .line 618
    const v13, -0x406f5c29    # -1.13f

    .line 619
    .line 620
    .line 621
    const/4 v14, 0x0

    .line 622
    const v15, -0x3ffb851f    # -2.07f

    .line 623
    .line 624
    .line 625
    const v16, 0x3f70a3d7    # 0.94f

    .line 626
    .line 627
    .line 628
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 629
    .line 630
    .line 631
    const v17, 0x417e3d71    # 15.89f

    .line 632
    .line 633
    .line 634
    const v18, 0x417e3d71    # 15.89f

    .line 635
    .line 636
    .line 637
    const v13, 0x3f07ae14    # 0.53f

    .line 638
    .line 639
    .line 640
    const v14, 0x4108a3d7    # 8.54f

    .line 641
    .line 642
    .line 643
    const v15, 0x40eb851f    # 7.36f

    .line 644
    .line 645
    .line 646
    const v16, 0x4175c28f    # 15.36f

    .line 647
    .line 648
    .line 649
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 650
    .line 651
    .line 652
    const v17, 0x40047ae1    # 2.07f

    .line 653
    .line 654
    .line 655
    const/high16 v18, -0x40000000    # -2.0f

    .line 656
    .line 657
    const v13, 0x3f90a3d7    # 1.13f

    .line 658
    .line 659
    .line 660
    const v14, 0x3d8f5c29    # 0.07f

    .line 661
    .line 662
    .line 663
    const v15, 0x40047ae1    # 2.07f

    .line 664
    .line 665
    .line 666
    const v16, -0x40a147ae    # -0.87f

    .line 667
    .line 668
    .line 669
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 670
    .line 671
    .line 672
    const v0, -0x40228f5c    # -1.73f

    .line 673
    .line 674
    .line 675
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 676
    .line 677
    .line 678
    const v17, -0x401d70a4    # -1.77f

    .line 679
    .line 680
    .line 681
    const v18, -0x4003d70a    # -1.97f

    .line 682
    .line 683
    .line 684
    const v13, 0x3c23d70a    # 0.01f

    .line 685
    .line 686
    .line 687
    const/high16 v14, -0x40800000    # -1.0f

    .line 688
    .line 689
    const v15, -0x40bd70a4    # -0.76f

    .line 690
    .line 691
    .line 692
    const v16, -0x4011eb85    # -1.86f

    .line 693
    .line 694
    .line 695
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 696
    .line 697
    .line 698
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 699
    .line 700
    .line 701
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 702
    .line 703
    .line 704
    move-result-object v2

    .line 705
    const/16 v16, 0x3800

    .line 706
    .line 707
    const/16 v17, 0x0

    .line 708
    .line 709
    const/high16 v6, 0x3f800000    # 1.0f

    .line 710
    .line 711
    const/high16 v8, 0x3f800000    # 1.0f

    .line 712
    .line 713
    const/4 v7, 0x0

    .line 714
    const/high16 v9, 0x3f800000    # 1.0f

    .line 715
    .line 716
    const/high16 v12, 0x3f800000    # 1.0f

    .line 717
    .line 718
    const/4 v13, 0x0

    .line 719
    const/4 v14, 0x0

    .line 720
    const/4 v15, 0x0

    .line 721
    const-string v4, ""

    .line 722
    .line 723
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 724
    .line 725
    .line 726
    move-result-object v0

    .line 727
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 728
    .line 729
    .line 730
    move-result-object v0

    .line 731
    sput-object v0, Landroidx/compose/material/icons/rounded/DialerSipKt;->_dialerSip:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 732
    .line 733
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 734
    .line 735
    .line 736
    return-object v0
.end method
