.class public final Landroidx/compose/material/icons/rounded/ClosedCaptionOffKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _closedCaptionOff:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getClosedCaptionOff(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/ClosedCaptionOffKt;->_closedCaptionOff:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.ClosedCaptionOff"

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
    const/high16 v0, 0x41980000    # 19.0f

    .line 71
    .line 72
    const/high16 v2, 0x40800000    # 4.0f

    .line 73
    .line 74
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v0, 0x40a00000    # 5.0f

    .line 78
    .line 79
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 80
    .line 81
    .line 82
    const/high16 v17, 0x40400000    # 3.0f

    .line 83
    .line 84
    const/high16 v18, 0x40c00000    # 6.0f

    .line 85
    .line 86
    const v13, 0x4078f5c3    # 3.89f

    .line 87
    .line 88
    .line 89
    const/high16 v14, 0x40800000    # 4.0f

    .line 90
    .line 91
    const/high16 v15, 0x40400000    # 3.0f

    .line 92
    .line 93
    const v16, 0x409ccccd    # 4.9f

    .line 94
    .line 95
    .line 96
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 97
    .line 98
    .line 99
    const/high16 v0, 0x41400000    # 12.0f

    .line 100
    .line 101
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 102
    .line 103
    .line 104
    const/high16 v17, 0x40000000    # 2.0f

    .line 105
    .line 106
    const/high16 v18, 0x40000000    # 2.0f

    .line 107
    .line 108
    const/4 v13, 0x0

    .line 109
    const v14, 0x3f8ccccd    # 1.1f

    .line 110
    .line 111
    .line 112
    const v15, 0x3f63d70a    # 0.89f

    .line 113
    .line 114
    .line 115
    const/high16 v16, 0x40000000    # 2.0f

    .line 116
    .line 117
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 118
    .line 119
    .line 120
    const/high16 v0, 0x41600000    # 14.0f

    .line 121
    .line 122
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 123
    .line 124
    .line 125
    const/high16 v18, -0x40000000    # -2.0f

    .line 126
    .line 127
    const v13, 0x3f8ccccd    # 1.1f

    .line 128
    .line 129
    .line 130
    const/4 v14, 0x0

    .line 131
    const/high16 v15, 0x40000000    # 2.0f

    .line 132
    .line 133
    const v16, -0x4099999a    # -0.9f

    .line 134
    .line 135
    .line 136
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 137
    .line 138
    .line 139
    const/high16 v0, 0x40c00000    # 6.0f

    .line 140
    .line 141
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 142
    .line 143
    .line 144
    const/high16 v17, 0x41980000    # 19.0f

    .line 145
    .line 146
    const/high16 v18, 0x40800000    # 4.0f

    .line 147
    .line 148
    const/high16 v13, 0x41a80000    # 21.0f

    .line 149
    .line 150
    const v14, 0x409ccccd    # 4.9f

    .line 151
    .line 152
    .line 153
    const v15, 0x41a0cccd    # 20.1f

    .line 154
    .line 155
    .line 156
    const/high16 v16, 0x40800000    # 4.0f

    .line 157
    .line 158
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 159
    .line 160
    .line 161
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 162
    .line 163
    .line 164
    const/high16 v0, 0x41300000    # 11.0f

    .line 165
    .line 166
    const/high16 v2, 0x41280000    # 10.5f

    .line 167
    .line 168
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 169
    .line 170
    .line 171
    const/high16 v17, -0x41000000    # -0.5f

    .line 172
    .line 173
    const/high16 v18, 0x3f000000    # 0.5f

    .line 174
    .line 175
    const/4 v13, 0x0

    .line 176
    const v14, 0x3e8f5c29    # 0.28f

    .line 177
    .line 178
    .line 179
    const v15, -0x419eb852    # -0.22f

    .line 180
    .line 181
    .line 182
    const/high16 v16, 0x3f000000    # 0.5f

    .line 183
    .line 184
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 185
    .line 186
    .line 187
    const/high16 v0, 0x41200000    # 10.0f

    .line 188
    .line 189
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 190
    .line 191
    .line 192
    const/high16 v18, -0x41000000    # -0.5f

    .line 193
    .line 194
    const v13, -0x4170a3d7    # -0.28f

    .line 195
    .line 196
    .line 197
    const/4 v14, 0x0

    .line 198
    const/high16 v15, -0x41000000    # -0.5f

    .line 199
    .line 200
    const v16, -0x419eb852    # -0.22f

    .line 201
    .line 202
    .line 203
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 204
    .line 205
    .line 206
    const/high16 v0, -0x40000000    # -2.0f

    .line 207
    .line 208
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 209
    .line 210
    .line 211
    const/high16 v0, 0x40400000    # 3.0f

    .line 212
    .line 213
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 214
    .line 215
    .line 216
    const/high16 v0, 0x40000000    # 2.0f

    .line 217
    .line 218
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 219
    .line 220
    .line 221
    const/high16 v17, 0x3f000000    # 0.5f

    .line 222
    .line 223
    const/4 v13, 0x0

    .line 224
    const v14, -0x4170a3d7    # -0.28f

    .line 225
    .line 226
    .line 227
    const v15, 0x3e6147ae    # 0.22f

    .line 228
    .line 229
    .line 230
    const/high16 v16, -0x41000000    # -0.5f

    .line 231
    .line 232
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 233
    .line 234
    .line 235
    const/high16 v0, 0x3f000000    # 0.5f

    .line 236
    .line 237
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 238
    .line 239
    .line 240
    const/high16 v18, 0x3f000000    # 0.5f

    .line 241
    .line 242
    const v13, 0x3e8f5c29    # 0.28f

    .line 243
    .line 244
    .line 245
    const/4 v14, 0x0

    .line 246
    const/high16 v15, 0x3f000000    # 0.5f

    .line 247
    .line 248
    const v16, 0x3e6147ae    # 0.22f

    .line 249
    .line 250
    .line 251
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 252
    .line 253
    .line 254
    const/high16 v0, 0x41600000    # 14.0f

    .line 255
    .line 256
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 257
    .line 258
    .line 259
    const/high16 v17, -0x40800000    # -1.0f

    .line 260
    .line 261
    const/high16 v18, 0x3f800000    # 1.0f

    .line 262
    .line 263
    const/4 v13, 0x0

    .line 264
    const v14, 0x3f0ccccd    # 0.55f

    .line 265
    .line 266
    .line 267
    const v15, -0x4119999a    # -0.45f

    .line 268
    .line 269
    .line 270
    const/high16 v16, 0x3f800000    # 1.0f

    .line 271
    .line 272
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 273
    .line 274
    .line 275
    const/high16 v0, 0x40e00000    # 7.0f

    .line 276
    .line 277
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 278
    .line 279
    .line 280
    const/high16 v18, -0x40800000    # -1.0f

    .line 281
    .line 282
    const v13, -0x40f33333    # -0.55f

    .line 283
    .line 284
    .line 285
    const/4 v14, 0x0

    .line 286
    const/high16 v15, -0x40800000    # -1.0f

    .line 287
    .line 288
    const v16, -0x4119999a    # -0.45f

    .line 289
    .line 290
    .line 291
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 292
    .line 293
    .line 294
    const/high16 v0, -0x3f800000    # -4.0f

    .line 295
    .line 296
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 297
    .line 298
    .line 299
    const/high16 v17, 0x3f800000    # 1.0f

    .line 300
    .line 301
    const/4 v13, 0x0

    .line 302
    const v14, -0x40f33333    # -0.55f

    .line 303
    .line 304
    .line 305
    const v15, 0x3ee66666    # 0.45f

    .line 306
    .line 307
    .line 308
    const/high16 v16, -0x40800000    # -1.0f

    .line 309
    .line 310
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 311
    .line 312
    .line 313
    const/high16 v0, 0x40400000    # 3.0f

    .line 314
    .line 315
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 316
    .line 317
    .line 318
    const/high16 v18, 0x3f800000    # 1.0f

    .line 319
    .line 320
    const v13, 0x3f0ccccd    # 0.55f

    .line 321
    .line 322
    .line 323
    const/4 v14, 0x0

    .line 324
    const/high16 v15, 0x3f800000    # 1.0f

    .line 325
    .line 326
    const v16, 0x3ee66666    # 0.45f

    .line 327
    .line 328
    .line 329
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 330
    .line 331
    .line 332
    const/high16 v0, 0x41280000    # 10.5f

    .line 333
    .line 334
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 335
    .line 336
    .line 337
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 338
    .line 339
    .line 340
    const/high16 v0, 0x41900000    # 18.0f

    .line 341
    .line 342
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 343
    .line 344
    .line 345
    const/high16 v17, -0x41000000    # -0.5f

    .line 346
    .line 347
    const/high16 v18, 0x3f000000    # 0.5f

    .line 348
    .line 349
    const/4 v13, 0x0

    .line 350
    const v14, 0x3e8f5c29    # 0.28f

    .line 351
    .line 352
    .line 353
    const v15, -0x419eb852    # -0.22f

    .line 354
    .line 355
    .line 356
    const/high16 v16, 0x3f000000    # 0.5f

    .line 357
    .line 358
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 359
    .line 360
    .line 361
    const/high16 v0, 0x41880000    # 17.0f

    .line 362
    .line 363
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 364
    .line 365
    .line 366
    const/high16 v18, -0x41000000    # -0.5f

    .line 367
    .line 368
    const v13, -0x4170a3d7    # -0.28f

    .line 369
    .line 370
    .line 371
    const/4 v14, 0x0

    .line 372
    const/high16 v15, -0x41000000    # -0.5f

    .line 373
    .line 374
    const v16, -0x419eb852    # -0.22f

    .line 375
    .line 376
    .line 377
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 378
    .line 379
    .line 380
    const/high16 v0, -0x40000000    # -2.0f

    .line 381
    .line 382
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 383
    .line 384
    .line 385
    const/high16 v0, 0x40400000    # 3.0f

    .line 386
    .line 387
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 388
    .line 389
    .line 390
    const/high16 v0, 0x40000000    # 2.0f

    .line 391
    .line 392
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 393
    .line 394
    .line 395
    const/high16 v17, 0x3f000000    # 0.5f

    .line 396
    .line 397
    const/4 v13, 0x0

    .line 398
    const v14, -0x4170a3d7    # -0.28f

    .line 399
    .line 400
    .line 401
    const v15, 0x3e6147ae    # 0.22f

    .line 402
    .line 403
    .line 404
    const/high16 v16, -0x41000000    # -0.5f

    .line 405
    .line 406
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 407
    .line 408
    .line 409
    const/high16 v0, 0x3f000000    # 0.5f

    .line 410
    .line 411
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 412
    .line 413
    .line 414
    const/high16 v18, 0x3f000000    # 0.5f

    .line 415
    .line 416
    const v13, 0x3e8f5c29    # 0.28f

    .line 417
    .line 418
    .line 419
    const/4 v14, 0x0

    .line 420
    const/high16 v15, 0x3f000000    # 0.5f

    .line 421
    .line 422
    const v16, 0x3e6147ae    # 0.22f

    .line 423
    .line 424
    .line 425
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 426
    .line 427
    .line 428
    const/high16 v0, 0x41600000    # 14.0f

    .line 429
    .line 430
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 431
    .line 432
    .line 433
    const/high16 v17, -0x40800000    # -1.0f

    .line 434
    .line 435
    const/high16 v18, 0x3f800000    # 1.0f

    .line 436
    .line 437
    const/4 v13, 0x0

    .line 438
    const v14, 0x3f0ccccd    # 0.55f

    .line 439
    .line 440
    .line 441
    const v15, -0x4119999a    # -0.45f

    .line 442
    .line 443
    .line 444
    const/high16 v16, 0x3f800000    # 1.0f

    .line 445
    .line 446
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 447
    .line 448
    .line 449
    const/high16 v0, -0x3fc00000    # -3.0f

    .line 450
    .line 451
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 452
    .line 453
    .line 454
    const/high16 v18, -0x40800000    # -1.0f

    .line 455
    .line 456
    const v13, -0x40f33333    # -0.55f

    .line 457
    .line 458
    .line 459
    const/4 v14, 0x0

    .line 460
    const/high16 v15, -0x40800000    # -1.0f

    .line 461
    .line 462
    const v16, -0x4119999a    # -0.45f

    .line 463
    .line 464
    .line 465
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 466
    .line 467
    .line 468
    const/high16 v0, -0x3f800000    # -4.0f

    .line 469
    .line 470
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 471
    .line 472
    .line 473
    const/high16 v17, 0x3f800000    # 1.0f

    .line 474
    .line 475
    const/4 v13, 0x0

    .line 476
    const v14, -0x40f33333    # -0.55f

    .line 477
    .line 478
    .line 479
    const v15, 0x3ee66666    # 0.45f

    .line 480
    .line 481
    .line 482
    const/high16 v16, -0x40800000    # -1.0f

    .line 483
    .line 484
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 485
    .line 486
    .line 487
    const/high16 v0, 0x40400000    # 3.0f

    .line 488
    .line 489
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 490
    .line 491
    .line 492
    const/high16 v18, 0x3f800000    # 1.0f

    .line 493
    .line 494
    const v13, 0x3f0ccccd    # 0.55f

    .line 495
    .line 496
    .line 497
    const/4 v14, 0x0

    .line 498
    const/high16 v15, 0x3f800000    # 1.0f

    .line 499
    .line 500
    const v16, 0x3ee66666    # 0.45f

    .line 501
    .line 502
    .line 503
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 504
    .line 505
    .line 506
    const/high16 v0, 0x41280000    # 10.5f

    .line 507
    .line 508
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 509
    .line 510
    .line 511
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 512
    .line 513
    .line 514
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 515
    .line 516
    .line 517
    move-result-object v2

    .line 518
    const/16 v16, 0x3800

    .line 519
    .line 520
    const/16 v17, 0x0

    .line 521
    .line 522
    const/high16 v6, 0x3f800000    # 1.0f

    .line 523
    .line 524
    const/high16 v8, 0x3f800000    # 1.0f

    .line 525
    .line 526
    const/4 v7, 0x0

    .line 527
    const/high16 v9, 0x3f800000    # 1.0f

    .line 528
    .line 529
    const/high16 v12, 0x3f800000    # 1.0f

    .line 530
    .line 531
    const/4 v13, 0x0

    .line 532
    const/4 v15, 0x0

    .line 533
    const-string v4, ""

    .line 534
    .line 535
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 536
    .line 537
    .line 538
    move-result-object v0

    .line 539
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 540
    .line 541
    .line 542
    move-result-object v0

    .line 543
    sput-object v0, Landroidx/compose/material/icons/rounded/ClosedCaptionOffKt;->_closedCaptionOff:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 544
    .line 545
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 546
    .line 547
    .line 548
    return-object v0
.end method
