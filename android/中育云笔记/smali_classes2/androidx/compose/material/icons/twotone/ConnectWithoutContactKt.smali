.class public final Landroidx/compose/material/icons/twotone/ConnectWithoutContactKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _connectWithoutContact:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getConnectWithoutContact(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/ConnectWithoutContactKt;->_connectWithoutContact:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.ConnectWithoutContact"

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
    const/high16 v0, 0x41600000    # 14.0f

    .line 71
    .line 72
    const/high16 v2, 0x41300000    # 11.0f

    .line 73
    .line 74
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v0, 0x41100000    # 9.0f

    .line 78
    .line 79
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 80
    .line 81
    .line 82
    const/high16 v17, 0x41100000    # 9.0f

    .line 83
    .line 84
    const/high16 v18, -0x3ef00000    # -9.0f

    .line 85
    .line 86
    const/4 v13, 0x0

    .line 87
    const v14, -0x3f60f5c3    # -4.97f

    .line 88
    .line 89
    .line 90
    const v15, 0x4080f5c3    # 4.03f

    .line 91
    .line 92
    .line 93
    const/high16 v16, -0x3ef00000    # -9.0f

    .line 94
    .line 95
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 96
    .line 97
    .line 98
    const/high16 v0, 0x40000000    # 2.0f

    .line 99
    .line 100
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 101
    .line 102
    .line 103
    const/high16 v17, 0x41300000    # 11.0f

    .line 104
    .line 105
    const/high16 v18, 0x41600000    # 14.0f

    .line 106
    .line 107
    const v13, 0x4162147b    # 14.13f

    .line 108
    .line 109
    .line 110
    const/high16 v14, 0x40e00000    # 7.0f

    .line 111
    .line 112
    const/high16 v15, 0x41300000    # 11.0f

    .line 113
    .line 114
    const v16, 0x4122147b    # 10.13f

    .line 115
    .line 116
    .line 117
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 118
    .line 119
    .line 120
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 121
    .line 122
    .line 123
    const/high16 v0, 0x41900000    # 18.0f

    .line 124
    .line 125
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 126
    .line 127
    .line 128
    const/high16 v0, 0x41100000    # 9.0f

    .line 129
    .line 130
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 131
    .line 132
    .line 133
    const/high16 v17, -0x3f600000    # -5.0f

    .line 134
    .line 135
    const/high16 v18, 0x40a00000    # 5.0f

    .line 136
    .line 137
    const v13, -0x3fcf5c29    # -2.76f

    .line 138
    .line 139
    .line 140
    const/4 v14, 0x0

    .line 141
    const/high16 v15, -0x3f600000    # -5.0f

    .line 142
    .line 143
    const v16, 0x400f5c29    # 2.24f

    .line 144
    .line 145
    .line 146
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 147
    .line 148
    .line 149
    const/high16 v0, 0x40000000    # 2.0f

    .line 150
    .line 151
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 152
    .line 153
    .line 154
    const/high16 v17, 0x41900000    # 18.0f

    .line 155
    .line 156
    const/high16 v18, 0x41300000    # 11.0f

    .line 157
    .line 158
    const/high16 v13, 0x41700000    # 15.0f

    .line 159
    .line 160
    const v14, 0x414570a4    # 12.34f

    .line 161
    .line 162
    .line 163
    const v15, 0x4182b852    # 16.34f

    .line 164
    .line 165
    .line 166
    const/high16 v16, 0x41300000    # 11.0f

    .line 167
    .line 168
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 169
    .line 170
    .line 171
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 172
    .line 173
    .line 174
    const/high16 v0, 0x40800000    # 4.0f

    .line 175
    .line 176
    const/high16 v2, 0x40e00000    # 7.0f

    .line 177
    .line 178
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 179
    .line 180
    .line 181
    const/high16 v17, -0x40000000    # -2.0f

    .line 182
    .line 183
    const/high16 v18, -0x40000000    # -2.0f

    .line 184
    .line 185
    const/4 v13, 0x0

    .line 186
    const v14, -0x4071eb85    # -1.11f

    .line 187
    .line 188
    .line 189
    const v15, -0x409c28f6    # -0.89f

    .line 190
    .line 191
    .line 192
    const/high16 v16, -0x40000000    # -2.0f

    .line 193
    .line 194
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 195
    .line 196
    .line 197
    const v0, 0x4038f5c3    # 2.89f

    .line 198
    .line 199
    .line 200
    const/high16 v2, 0x40400000    # 3.0f

    .line 201
    .line 202
    const/high16 v4, 0x40800000    # 4.0f

    .line 203
    .line 204
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 205
    .line 206
    .line 207
    const v0, 0x3f63d70a    # 0.89f

    .line 208
    .line 209
    .line 210
    const/high16 v2, 0x40000000    # 2.0f

    .line 211
    .line 212
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 213
    .line 214
    .line 215
    const v0, 0x40a3851f    # 5.11f

    .line 216
    .line 217
    .line 218
    const/high16 v2, 0x40800000    # 4.0f

    .line 219
    .line 220
    const/high16 v4, 0x40e00000    # 7.0f

    .line 221
    .line 222
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 223
    .line 224
    .line 225
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 226
    .line 227
    .line 228
    const v0, 0x41373333    # 11.45f

    .line 229
    .line 230
    .line 231
    const/high16 v2, 0x40900000    # 4.5f

    .line 232
    .line 233
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 234
    .line 235
    .line 236
    const/high16 v0, -0x40000000    # -2.0f

    .line 237
    .line 238
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 239
    .line 240
    .line 241
    const/high16 v17, 0x40d00000    # 6.5f

    .line 242
    .line 243
    const/high16 v18, 0x40e00000    # 7.0f

    .line 244
    .line 245
    const v13, 0x41135c29    # 9.21f

    .line 246
    .line 247
    .line 248
    const v14, 0x40bd70a4    # 5.92f

    .line 249
    .line 250
    .line 251
    const v15, 0x40ffae14    # 7.99f

    .line 252
    .line 253
    .line 254
    const/high16 v16, 0x40e00000    # 7.0f

    .line 255
    .line 256
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 257
    .line 258
    .line 259
    const/high16 v0, -0x3fc00000    # -3.0f

    .line 260
    .line 261
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 262
    .line 263
    .line 264
    const/high16 v17, 0x40000000    # 2.0f

    .line 265
    .line 266
    const/high16 v18, 0x41080000    # 8.5f

    .line 267
    .line 268
    const v13, 0x402ae148    # 2.67f

    .line 269
    .line 270
    .line 271
    const/high16 v14, 0x40e00000    # 7.0f

    .line 272
    .line 273
    const/high16 v15, 0x40000000    # 2.0f

    .line 274
    .line 275
    const v16, 0x40f570a4    # 7.67f

    .line 276
    .line 277
    .line 278
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 279
    .line 280
    .line 281
    const/high16 v0, 0x41300000    # 11.0f

    .line 282
    .line 283
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 284
    .line 285
    .line 286
    const/high16 v0, 0x40c00000    # 6.0f

    .line 287
    .line 288
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 289
    .line 290
    .line 291
    const v0, 0x410bd70a    # 8.74f

    .line 292
    .line 293
    .line 294
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 295
    .line 296
    .line 297
    const v17, 0x41373333    # 11.45f

    .line 298
    .line 299
    .line 300
    const/high16 v18, 0x40900000    # 4.5f

    .line 301
    .line 302
    const v13, 0x411dc28f    # 9.86f

    .line 303
    .line 304
    .line 305
    const v14, 0x41026666    # 8.15f

    .line 306
    .line 307
    .line 308
    const/high16 v15, 0x41340000    # 11.25f

    .line 309
    .line 310
    const v16, 0x40d051ec    # 6.51f

    .line 311
    .line 312
    .line 313
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 314
    .line 315
    .line 316
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 317
    .line 318
    .line 319
    const/high16 v0, 0x41980000    # 19.0f

    .line 320
    .line 321
    const/high16 v2, 0x41880000    # 17.0f

    .line 322
    .line 323
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 324
    .line 325
    .line 326
    const/high16 v17, 0x40000000    # 2.0f

    .line 327
    .line 328
    const/high16 v18, -0x40000000    # -2.0f

    .line 329
    .line 330
    const v13, 0x3f8e147b    # 1.11f

    .line 331
    .line 332
    .line 333
    const/4 v14, 0x0

    .line 334
    const/high16 v15, 0x40000000    # 2.0f

    .line 335
    .line 336
    const v16, -0x409c28f6    # -0.89f

    .line 337
    .line 338
    .line 339
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 340
    .line 341
    .line 342
    const v0, -0x409c28f6    # -0.89f

    .line 343
    .line 344
    .line 345
    const/high16 v2, -0x40000000    # -2.0f

    .line 346
    .line 347
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 348
    .line 349
    .line 350
    const v0, 0x3f63d70a    # 0.89f

    .line 351
    .line 352
    .line 353
    const/high16 v2, 0x40000000    # 2.0f

    .line 354
    .line 355
    const/high16 v4, -0x40000000    # -2.0f

    .line 356
    .line 357
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 358
    .line 359
    .line 360
    const v0, 0x418f1eb8    # 17.89f

    .line 361
    .line 362
    .line 363
    const/high16 v2, 0x41980000    # 19.0f

    .line 364
    .line 365
    const/high16 v4, 0x41880000    # 17.0f

    .line 366
    .line 367
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 368
    .line 369
    .line 370
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 371
    .line 372
    .line 373
    const/high16 v0, 0x41a40000    # 20.5f

    .line 374
    .line 375
    const/high16 v2, 0x41900000    # 18.0f

    .line 376
    .line 377
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 378
    .line 379
    .line 380
    const/high16 v0, -0x3fc00000    # -3.0f

    .line 381
    .line 382
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 383
    .line 384
    .line 385
    const v17, -0x3fc33333    # -2.95f

    .line 386
    .line 387
    .line 388
    const/high16 v18, -0x3fe00000    # -2.5f

    .line 389
    .line 390
    const v13, -0x404147ae    # -1.49f

    .line 391
    .line 392
    .line 393
    const v15, -0x3fd28f5c    # -2.71f

    .line 394
    .line 395
    .line 396
    const v16, -0x4075c28f    # -1.08f

    .line 397
    .line 398
    .line 399
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 400
    .line 401
    .line 402
    const/high16 v0, -0x40000000    # -2.0f

    .line 403
    .line 404
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 405
    .line 406
    .line 407
    const v17, 0x405ccccd    # 3.45f

    .line 408
    .line 409
    .line 410
    const v18, 0x4087ae14    # 4.24f

    .line 411
    .line 412
    .line 413
    const v13, 0x3e4ccccd    # 0.2f

    .line 414
    .line 415
    .line 416
    const v14, 0x4000a3d7    # 2.01f

    .line 417
    .line 418
    .line 419
    const v15, 0x3fcb851f    # 1.59f

    .line 420
    .line 421
    .line 422
    const v16, 0x4069999a    # 3.65f

    .line 423
    .line 424
    .line 425
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 426
    .line 427
    .line 428
    const/high16 v0, 0x41b00000    # 22.0f

    .line 429
    .line 430
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 431
    .line 432
    .line 433
    const/high16 v0, 0x40c00000    # 6.0f

    .line 434
    .line 435
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 436
    .line 437
    .line 438
    const/high16 v0, -0x3fe00000    # -2.5f

    .line 439
    .line 440
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 441
    .line 442
    .line 443
    const/high16 v17, 0x41a40000    # 20.5f

    .line 444
    .line 445
    const/high16 v18, 0x41900000    # 18.0f

    .line 446
    .line 447
    const/high16 v13, 0x41b00000    # 22.0f

    .line 448
    .line 449
    const v14, 0x41955c29    # 18.67f

    .line 450
    .line 451
    .line 452
    const v15, 0x41aaa3d7    # 21.33f

    .line 453
    .line 454
    .line 455
    const/high16 v16, 0x41900000    # 18.0f

    .line 456
    .line 457
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 458
    .line 459
    .line 460
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 461
    .line 462
    .line 463
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 464
    .line 465
    .line 466
    move-result-object v2

    .line 467
    const/16 v16, 0x3800

    .line 468
    .line 469
    const/16 v17, 0x0

    .line 470
    .line 471
    const/high16 v6, 0x3f800000    # 1.0f

    .line 472
    .line 473
    const/high16 v8, 0x3f800000    # 1.0f

    .line 474
    .line 475
    const/4 v7, 0x0

    .line 476
    const/high16 v9, 0x3f800000    # 1.0f

    .line 477
    .line 478
    const/high16 v12, 0x3f800000    # 1.0f

    .line 479
    .line 480
    const/4 v13, 0x0

    .line 481
    const/4 v14, 0x0

    .line 482
    const/4 v15, 0x0

    .line 483
    const-string v4, ""

    .line 484
    .line 485
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 486
    .line 487
    .line 488
    move-result-object v0

    .line 489
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 490
    .line 491
    .line 492
    move-result-object v0

    .line 493
    sput-object v0, Landroidx/compose/material/icons/twotone/ConnectWithoutContactKt;->_connectWithoutContact:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 494
    .line 495
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 496
    .line 497
    .line 498
    return-object v0
.end method
