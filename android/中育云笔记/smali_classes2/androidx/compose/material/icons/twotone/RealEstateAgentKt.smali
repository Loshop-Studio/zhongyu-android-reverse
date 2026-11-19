.class public final Landroidx/compose/material/icons/twotone/RealEstateAgentKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _realEstateAgent:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getRealEstateAgent(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/RealEstateAgentKt;->_realEstateAgent:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.RealEstateAgent"

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
    const v4, 0x41170a3d    # 9.44f

    .line 71
    .line 72
    .line 73
    const/high16 v6, 0x41280000    # 10.5f

    .line 74
    .line 75
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    const v4, 0x40aa3d71    # 5.32f

    .line 79
    .line 80
    .line 81
    const v6, 0x3ffeb852    # 1.99f

    .line 82
    .line 83
    .line 84
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 85
    .line 86
    .line 87
    const v25, 0x402f5c29    # 2.74f

    .line 88
    .line 89
    .line 90
    const v26, 0x40247ae1    # 2.57f

    .line 91
    .line 92
    .line 93
    const v21, 0x3f9eb852    # 1.24f

    .line 94
    .line 95
    .line 96
    const v22, 0x3eeb851f    # 0.46f

    .line 97
    .line 98
    .line 99
    const v23, 0x400d70a4    # 2.21f

    .line 100
    .line 101
    .line 102
    const v24, 0x3fb47ae1    # 1.41f

    .line 103
    .line 104
    .line 105
    move-object/from16 v20, v2

    .line 106
    .line 107
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 108
    .line 109
    .line 110
    const/high16 v4, 0x41600000    # 14.0f

    .line 111
    .line 112
    const/high16 v6, 0x41980000    # 19.0f

    .line 113
    .line 114
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 115
    .line 116
    .line 117
    const/high16 v4, 0x40f00000    # 7.5f

    .line 118
    .line 119
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 120
    .line 121
    .line 122
    const/high16 v4, 0x40800000    # 4.0f

    .line 123
    .line 124
    const/high16 v6, 0x41600000    # 14.0f

    .line 125
    .line 126
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 127
    .line 128
    .line 129
    const/high16 v4, 0x40f00000    # 7.5f

    .line 130
    .line 131
    const/high16 v6, 0x41100000    # 9.0f

    .line 132
    .line 133
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 134
    .line 135
    .line 136
    const/high16 v4, 0x41100000    # 9.0f

    .line 137
    .line 138
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 139
    .line 140
    .line 141
    const v4, 0x3ea8f5c3    # 0.33f

    .line 142
    .line 143
    .line 144
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 145
    .line 146
    .line 147
    const v4, 0x41170a3d    # 9.44f

    .line 148
    .line 149
    .line 150
    const/high16 v6, 0x41280000    # 10.5f

    .line 151
    .line 152
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 153
    .line 154
    .line 155
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 156
    .line 157
    .line 158
    const/high16 v4, 0x41680000    # 14.5f

    .line 159
    .line 160
    const/high16 v6, 0x40e00000    # 7.0f

    .line 161
    .line 162
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 163
    .line 164
    .line 165
    const/high16 v4, 0x3f800000    # 1.0f

    .line 166
    .line 167
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 168
    .line 169
    .line 170
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 171
    .line 172
    .line 173
    const/high16 v4, -0x40800000    # -1.0f

    .line 174
    .line 175
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 176
    .line 177
    .line 178
    const/high16 v4, 0x40e00000    # 7.0f

    .line 179
    .line 180
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 181
    .line 182
    .line 183
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 184
    .line 185
    .line 186
    const/high16 v4, 0x41680000    # 14.5f

    .line 187
    .line 188
    const/high16 v6, 0x41100000    # 9.0f

    .line 189
    .line 190
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 191
    .line 192
    .line 193
    const/high16 v4, 0x3f800000    # 1.0f

    .line 194
    .line 195
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 196
    .line 197
    .line 198
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 199
    .line 200
    .line 201
    const/high16 v4, -0x40800000    # -1.0f

    .line 202
    .line 203
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 204
    .line 205
    .line 206
    const/high16 v4, 0x41100000    # 9.0f

    .line 207
    .line 208
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 209
    .line 210
    .line 211
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 212
    .line 213
    .line 214
    const/high16 v4, 0x41480000    # 12.5f

    .line 215
    .line 216
    const/high16 v6, 0x40e00000    # 7.0f

    .line 217
    .line 218
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 219
    .line 220
    .line 221
    const/high16 v4, 0x3f800000    # 1.0f

    .line 222
    .line 223
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 224
    .line 225
    .line 226
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 227
    .line 228
    .line 229
    const/high16 v4, -0x40800000    # -1.0f

    .line 230
    .line 231
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 232
    .line 233
    .line 234
    const/high16 v4, 0x40e00000    # 7.0f

    .line 235
    .line 236
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 237
    .line 238
    .line 239
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 240
    .line 241
    .line 242
    const/high16 v4, 0x41480000    # 12.5f

    .line 243
    .line 244
    const/high16 v6, 0x41100000    # 9.0f

    .line 245
    .line 246
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 247
    .line 248
    .line 249
    const/high16 v4, 0x3f800000    # 1.0f

    .line 250
    .line 251
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 252
    .line 253
    .line 254
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 255
    .line 256
    .line 257
    const/high16 v4, -0x40800000    # -1.0f

    .line 258
    .line 259
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 260
    .line 261
    .line 262
    const/high16 v4, 0x41100000    # 9.0f

    .line 263
    .line 264
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 265
    .line 266
    .line 267
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 268
    .line 269
    .line 270
    const/high16 v4, 0x41500000    # 13.0f

    .line 271
    .line 272
    const/high16 v6, 0x40400000    # 3.0f

    .line 273
    .line 274
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 275
    .line 276
    .line 277
    const/high16 v4, 0x40000000    # 2.0f

    .line 278
    .line 279
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 280
    .line 281
    .line 282
    const/high16 v4, 0x40e00000    # 7.0f

    .line 283
    .line 284
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 285
    .line 286
    .line 287
    const/high16 v4, 0x40400000    # 3.0f

    .line 288
    .line 289
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 290
    .line 291
    .line 292
    const/high16 v4, 0x41500000    # 13.0f

    .line 293
    .line 294
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 295
    .line 296
    .line 297
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 298
    .line 299
    .line 300
    const v4, 0x419f3333    # 19.9f

    .line 301
    .line 302
    .line 303
    const v6, 0x41948f5c    # 18.57f

    .line 304
    .line 305
    .line 306
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 307
    .line 308
    .line 309
    const v4, -0x3f423d71    # -5.93f

    .line 310
    .line 311
    .line 312
    const v6, 0x3feb851f    # 1.84f

    .line 313
    .line 314
    .line 315
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 316
    .line 317
    .line 318
    const v4, 0x4193d70a    # 18.48f

    .line 319
    .line 320
    .line 321
    const/high16 v6, 0x40e00000    # 7.0f

    .line 322
    .line 323
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 324
    .line 325
    .line 326
    const/high16 v4, 0x41500000    # 13.0f

    .line 327
    .line 328
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 329
    .line 330
    .line 331
    const v4, 0x3fce147b    # 1.61f

    .line 332
    .line 333
    .line 334
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 335
    .line 336
    .line 337
    const v4, 0x400ae148    # 2.17f

    .line 338
    .line 339
    .line 340
    const v6, 0x40ba3d71    # 5.82f

    .line 341
    .line 342
    .line 343
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 344
    .line 345
    .line 346
    const/high16 v25, 0x41700000    # 15.0f

    .line 347
    .line 348
    const/high16 v26, 0x41800000    # 16.0f

    .line 349
    .line 350
    const v21, 0x416c51ec    # 14.77f

    .line 351
    .line 352
    .line 353
    const v22, 0x4174cccd    # 15.3f

    .line 354
    .line 355
    .line 356
    const/high16 v23, 0x41700000    # 15.0f

    .line 357
    .line 358
    const v24, 0x417a147b    # 15.63f

    .line 359
    .line 360
    .line 361
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 362
    .line 363
    .line 364
    const v25, -0x3feccccd    # -2.3f

    .line 365
    .line 366
    .line 367
    const v26, -0x41e66666    # -0.15f

    .line 368
    .line 369
    .line 370
    const/16 v21, 0x0

    .line 371
    .line 372
    const/16 v22, 0x0

    .line 373
    .line 374
    const v23, -0x400147ae    # -1.99f

    .line 375
    .line 376
    .line 377
    const v24, -0x42b33333    # -0.05f

    .line 378
    .line 379
    .line 380
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 381
    .line 382
    .line 383
    const v4, -0x3fe7ae14    # -2.38f

    .line 384
    .line 385
    .line 386
    const v6, -0x40b5c28f    # -0.79f

    .line 387
    .line 388
    .line 389
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 390
    .line 391
    .line 392
    const v4, -0x40deb852    # -0.63f

    .line 393
    .line 394
    .line 395
    const v6, 0x3ff33333    # 1.9f

    .line 396
    .line 397
    .line 398
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 399
    .line 400
    .line 401
    const v4, 0x401851ec    # 2.38f

    .line 402
    .line 403
    .line 404
    const v6, 0x3f4a3d71    # 0.79f

    .line 405
    .line 406
    .line 407
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 408
    .line 409
    .line 410
    const v25, 0x3fca3d71    # 1.58f

    .line 411
    .line 412
    .line 413
    const v26, 0x3e851eb8    # 0.26f

    .line 414
    .line 415
    .line 416
    const v21, 0x3f028f5c    # 0.51f

    .line 417
    .line 418
    .line 419
    const v22, 0x3e2e147b    # 0.17f

    .line 420
    .line 421
    .line 422
    const v23, 0x3f851eb8    # 1.04f

    .line 423
    .line 424
    .line 425
    const v24, 0x3e851eb8    # 0.26f

    .line 426
    .line 427
    .line 428
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 429
    .line 430
    .line 431
    const/high16 v4, 0x41980000    # 19.0f

    .line 432
    .line 433
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 434
    .line 435
    .line 436
    const v25, 0x419f3333    # 19.9f

    .line 437
    .line 438
    .line 439
    const v26, 0x41948f5c    # 18.57f

    .line 440
    .line 441
    .line 442
    const v21, 0x419b1eb8    # 19.39f

    .line 443
    .line 444
    .line 445
    const v22, 0x4190147b    # 18.01f

    .line 446
    .line 447
    .line 448
    const v23, 0x419deb85    # 19.74f

    .line 449
    .line 450
    .line 451
    const v24, 0x4191eb85    # 18.24f

    .line 452
    .line 453
    .line 454
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 455
    .line 456
    .line 457
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 458
    .line 459
    .line 460
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 461
    .line 462
    .line 463
    move-result-object v2

    .line 464
    const/16 v16, 0x3800

    .line 465
    .line 466
    const/16 v17, 0x0

    .line 467
    .line 468
    const v6, 0x3e99999a    # 0.3f

    .line 469
    .line 470
    .line 471
    const v8, 0x3e99999a    # 0.3f

    .line 472
    .line 473
    .line 474
    const/4 v7, 0x0

    .line 475
    const/high16 v9, 0x3f800000    # 1.0f

    .line 476
    .line 477
    const/high16 v12, 0x3f800000    # 1.0f

    .line 478
    .line 479
    const/4 v13, 0x0

    .line 480
    const/4 v14, 0x0

    .line 481
    const/4 v15, 0x0

    .line 482
    const-string v4, ""

    .line 483
    .line 484
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 485
    .line 486
    .line 487
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 488
    .line 489
    .line 490
    move-result v3

    .line 491
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 492
    .line 493
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 494
    .line 495
    .line 496
    move-result-wide v6

    .line 497
    const/4 v0, 0x0

    .line 498
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 499
    .line 500
    .line 501
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 502
    .line 503
    .line 504
    move-result v10

    .line 505
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 506
    .line 507
    .line 508
    move-result v11

    .line 509
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 510
    .line 511
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 512
    .line 513
    .line 514
    const/high16 v0, 0x41780000    # 15.5f

    .line 515
    .line 516
    const/high16 v2, 0x40e00000    # 7.0f

    .line 517
    .line 518
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 519
    .line 520
    .line 521
    const/high16 v0, -0x40800000    # -1.0f

    .line 522
    .line 523
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 524
    .line 525
    .line 526
    const/high16 v0, 0x3f800000    # 1.0f

    .line 527
    .line 528
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 529
    .line 530
    .line 531
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 532
    .line 533
    .line 534
    const/high16 v0, 0x40e00000    # 7.0f

    .line 535
    .line 536
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 537
    .line 538
    .line 539
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 540
    .line 541
    .line 542
    const/high16 v0, 0x41580000    # 13.5f

    .line 543
    .line 544
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 545
    .line 546
    .line 547
    const/high16 v0, -0x40800000    # -1.0f

    .line 548
    .line 549
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 550
    .line 551
    .line 552
    const/high16 v0, 0x3f800000    # 1.0f

    .line 553
    .line 554
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 555
    .line 556
    .line 557
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 558
    .line 559
    .line 560
    const/high16 v0, 0x40e00000    # 7.0f

    .line 561
    .line 562
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 563
    .line 564
    .line 565
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 566
    .line 567
    .line 568
    const/high16 v0, 0x41780000    # 15.5f

    .line 569
    .line 570
    const/high16 v2, 0x41100000    # 9.0f

    .line 571
    .line 572
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 573
    .line 574
    .line 575
    const/high16 v0, -0x40800000    # -1.0f

    .line 576
    .line 577
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 578
    .line 579
    .line 580
    const/high16 v0, 0x3f800000    # 1.0f

    .line 581
    .line 582
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 583
    .line 584
    .line 585
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 586
    .line 587
    .line 588
    const/high16 v0, 0x41100000    # 9.0f

    .line 589
    .line 590
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 591
    .line 592
    .line 593
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 594
    .line 595
    .line 596
    const/high16 v0, 0x41580000    # 13.5f

    .line 597
    .line 598
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 599
    .line 600
    .line 601
    const/high16 v0, -0x40800000    # -1.0f

    .line 602
    .line 603
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 604
    .line 605
    .line 606
    const/high16 v0, 0x3f800000    # 1.0f

    .line 607
    .line 608
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 609
    .line 610
    .line 611
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 612
    .line 613
    .line 614
    const/high16 v0, 0x41100000    # 9.0f

    .line 615
    .line 616
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 617
    .line 618
    .line 619
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 620
    .line 621
    .line 622
    const/high16 v0, 0x41a80000    # 21.0f

    .line 623
    .line 624
    const/high16 v2, 0x40d00000    # 6.5f

    .line 625
    .line 626
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 627
    .line 628
    .line 629
    const/high16 v0, 0x41600000    # 14.0f

    .line 630
    .line 631
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 632
    .line 633
    .line 634
    const/high16 v0, -0x40000000    # -2.0f

    .line 635
    .line 636
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 637
    .line 638
    .line 639
    const/high16 v0, 0x40f00000    # 7.5f

    .line 640
    .line 641
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 642
    .line 643
    .line 644
    const/high16 v0, 0x40800000    # 4.0f

    .line 645
    .line 646
    const/high16 v2, 0x41600000    # 14.0f

    .line 647
    .line 648
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 649
    .line 650
    .line 651
    const/high16 v0, 0x40f00000    # 7.5f

    .line 652
    .line 653
    const/high16 v2, 0x41100000    # 9.0f

    .line 654
    .line 655
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 656
    .line 657
    .line 658
    const/high16 v0, 0x41100000    # 9.0f

    .line 659
    .line 660
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 661
    .line 662
    .line 663
    const/high16 v0, 0x40e00000    # 7.0f

    .line 664
    .line 665
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 666
    .line 667
    .line 668
    const/high16 v0, 0x40d00000    # 6.5f

    .line 669
    .line 670
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 671
    .line 672
    .line 673
    const/high16 v0, -0x3f600000    # -5.0f

    .line 674
    .line 675
    const/high16 v2, 0x40e00000    # 7.0f

    .line 676
    .line 677
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 678
    .line 679
    .line 680
    const/high16 v0, 0x41a80000    # 21.0f

    .line 681
    .line 682
    const/high16 v2, 0x40d00000    # 6.5f

    .line 683
    .line 684
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 685
    .line 686
    .line 687
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 688
    .line 689
    .line 690
    const/high16 v0, 0x41800000    # 16.0f

    .line 691
    .line 692
    const/high16 v2, 0x41980000    # 19.0f

    .line 693
    .line 694
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 695
    .line 696
    .line 697
    const/high16 v0, -0x40000000    # -2.0f

    .line 698
    .line 699
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 700
    .line 701
    .line 702
    const v17, -0x4010a3d7    # -1.87f

    .line 703
    .line 704
    .line 705
    const v18, -0x3fd33333    # -2.7f

    .line 706
    .line 707
    .line 708
    const v14, -0x40666666    # -1.2f

    .line 709
    .line 710
    .line 711
    const/high16 v15, -0x40c00000    # -0.75f

    .line 712
    .line 713
    const v16, -0x3fee147b    # -2.28f

    .line 714
    .line 715
    .line 716
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 717
    .line 718
    .line 719
    const v0, 0x410f851f    # 8.97f

    .line 720
    .line 721
    .line 722
    const/high16 v2, 0x41300000    # 11.0f

    .line 723
    .line 724
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 725
    .line 726
    .line 727
    const/high16 v0, 0x3f800000    # 1.0f

    .line 728
    .line 729
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 730
    .line 731
    .line 732
    const/high16 v0, 0x41300000    # 11.0f

    .line 733
    .line 734
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 735
    .line 736
    .line 737
    const/high16 v0, 0x40c00000    # 6.0f

    .line 738
    .line 739
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 740
    .line 741
    .line 742
    const v0, -0x4047ae14    # -1.44f

    .line 743
    .line 744
    .line 745
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 746
    .line 747
    .line 748
    const v0, 0x3ff851ec    # 1.94f

    .line 749
    .line 750
    .line 751
    const/high16 v2, 0x40e00000    # 7.0f

    .line 752
    .line 753
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 754
    .line 755
    .line 756
    const/high16 v0, 0x41000000    # 8.0f

    .line 757
    .line 758
    const/high16 v2, -0x3fe00000    # -2.5f

    .line 759
    .line 760
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 761
    .line 762
    .line 763
    const/high16 v0, -0x40800000    # -1.0f

    .line 764
    .line 765
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 766
    .line 767
    .line 768
    const/high16 v17, 0x41980000    # 19.0f

    .line 769
    .line 770
    const/high16 v18, 0x41800000    # 16.0f

    .line 771
    .line 772
    const/high16 v13, 0x41b00000    # 22.0f

    .line 773
    .line 774
    const v14, 0x418ab852    # 17.34f

    .line 775
    .line 776
    .line 777
    const v15, 0x41a547ae    # 20.66f

    .line 778
    .line 779
    .line 780
    const/high16 v16, 0x41800000    # 16.0f

    .line 781
    .line 782
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 783
    .line 784
    .line 785
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 786
    .line 787
    .line 788
    const/high16 v0, 0x41a00000    # 20.0f

    .line 789
    .line 790
    const/high16 v2, 0x40400000    # 3.0f

    .line 791
    .line 792
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 793
    .line 794
    .line 795
    const/high16 v0, -0x3f200000    # -7.0f

    .line 796
    .line 797
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 798
    .line 799
    .line 800
    const/high16 v0, 0x40000000    # 2.0f

    .line 801
    .line 802
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 803
    .line 804
    .line 805
    const/high16 v0, 0x40e00000    # 7.0f

    .line 806
    .line 807
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 808
    .line 809
    .line 810
    const/high16 v0, 0x40400000    # 3.0f

    .line 811
    .line 812
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 813
    .line 814
    .line 815
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 816
    .line 817
    .line 818
    const v0, 0x415f851f    # 13.97f

    .line 819
    .line 820
    .line 821
    const v2, 0x41a347ae    # 20.41f

    .line 822
    .line 823
    .line 824
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 825
    .line 826
    .line 827
    const v0, 0x4193d70a    # 18.48f

    .line 828
    .line 829
    .line 830
    const/high16 v2, 0x40e00000    # 7.0f

    .line 831
    .line 832
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 833
    .line 834
    .line 835
    const/high16 v0, 0x41500000    # 13.0f

    .line 836
    .line 837
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 838
    .line 839
    .line 840
    const v0, 0x3fce147b    # 1.61f

    .line 841
    .line 842
    .line 843
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 844
    .line 845
    .line 846
    const v0, 0x400ae148    # 2.17f

    .line 847
    .line 848
    .line 849
    const v2, 0x40ba3d71    # 5.82f

    .line 850
    .line 851
    .line 852
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 853
    .line 854
    .line 855
    const/high16 v17, 0x41700000    # 15.0f

    .line 856
    .line 857
    const v13, 0x416c51ec    # 14.77f

    .line 858
    .line 859
    .line 860
    const v14, 0x4174cccd    # 15.3f

    .line 861
    .line 862
    .line 863
    const/high16 v15, 0x41700000    # 15.0f

    .line 864
    .line 865
    const v16, 0x417a147b    # 15.63f

    .line 866
    .line 867
    .line 868
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 869
    .line 870
    .line 871
    const v17, -0x3feccccd    # -2.3f

    .line 872
    .line 873
    .line 874
    const v18, -0x41e66666    # -0.15f

    .line 875
    .line 876
    .line 877
    const/4 v13, 0x0

    .line 878
    const/4 v14, 0x0

    .line 879
    const v15, -0x400147ae    # -1.99f

    .line 880
    .line 881
    .line 882
    const v16, -0x42b33333    # -0.05f

    .line 883
    .line 884
    .line 885
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 886
    .line 887
    .line 888
    const v0, -0x3fe7ae14    # -2.38f

    .line 889
    .line 890
    .line 891
    const v2, -0x40b5c28f    # -0.79f

    .line 892
    .line 893
    .line 894
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 895
    .line 896
    .line 897
    const v0, -0x40deb852    # -0.63f

    .line 898
    .line 899
    .line 900
    const v2, 0x3ff33333    # 1.9f

    .line 901
    .line 902
    .line 903
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 904
    .line 905
    .line 906
    const v0, 0x401851ec    # 2.38f

    .line 907
    .line 908
    .line 909
    const v2, 0x3f4a3d71    # 0.79f

    .line 910
    .line 911
    .line 912
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 913
    .line 914
    .line 915
    const v17, 0x3fca3d71    # 1.58f

    .line 916
    .line 917
    .line 918
    const v18, 0x3e851eb8    # 0.26f

    .line 919
    .line 920
    .line 921
    const v13, 0x3f028f5c    # 0.51f

    .line 922
    .line 923
    .line 924
    const v14, 0x3e2e147b    # 0.17f

    .line 925
    .line 926
    .line 927
    const v15, 0x3f851eb8    # 1.04f

    .line 928
    .line 929
    .line 930
    const v16, 0x3e851eb8    # 0.26f

    .line 931
    .line 932
    .line 933
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 934
    .line 935
    .line 936
    const/high16 v0, 0x41980000    # 19.0f

    .line 937
    .line 938
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 939
    .line 940
    .line 941
    const v17, 0x3f666666    # 0.9f

    .line 942
    .line 943
    .line 944
    const v18, 0x3f0f5c29    # 0.56f

    .line 945
    .line 946
    .line 947
    const v13, 0x3ec7ae14    # 0.39f

    .line 948
    .line 949
    .line 950
    const/4 v14, 0x0

    .line 951
    const v15, 0x3f3d70a4    # 0.74f

    .line 952
    .line 953
    .line 954
    const v16, 0x3e6b851f    # 0.23f

    .line 955
    .line 956
    .line 957
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 958
    .line 959
    .line 960
    const v0, 0x415f851f    # 13.97f

    .line 961
    .line 962
    .line 963
    const v2, 0x41a347ae    # 20.41f

    .line 964
    .line 965
    .line 966
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 967
    .line 968
    .line 969
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 970
    .line 971
    .line 972
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 973
    .line 974
    .line 975
    move-result-object v2

    .line 976
    const/16 v16, 0x3800

    .line 977
    .line 978
    const/16 v17, 0x0

    .line 979
    .line 980
    const/high16 v6, 0x3f800000    # 1.0f

    .line 981
    .line 982
    const/high16 v8, 0x3f800000    # 1.0f

    .line 983
    .line 984
    const/4 v7, 0x0

    .line 985
    const/high16 v12, 0x3f800000    # 1.0f

    .line 986
    .line 987
    const/4 v13, 0x0

    .line 988
    const/4 v15, 0x0

    .line 989
    const-string v4, ""

    .line 990
    .line 991
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 992
    .line 993
    .line 994
    move-result-object v0

    .line 995
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 996
    .line 997
    .line 998
    move-result-object v0

    .line 999
    sput-object v0, Landroidx/compose/material/icons/twotone/RealEstateAgentKt;->_realEstateAgent:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1000
    .line 1001
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 1002
    .line 1003
    .line 1004
    return-object v0
.end method
