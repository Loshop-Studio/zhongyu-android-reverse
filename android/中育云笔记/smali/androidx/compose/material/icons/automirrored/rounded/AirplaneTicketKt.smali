.class public final Landroidx/compose/material/icons/automirrored/rounded/AirplaneTicketKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _airplaneTicket:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getAirplaneTicket(Landroidx/compose/material/icons/Icons$AutoMirrored$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/automirrored/rounded/AirplaneTicketKt;->_airplaneTicket:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const/4 v10, 0x1

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
    const-string v2, "AutoMirrored.Rounded.AirplaneTicket"

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
    const v0, 0x41a1851f    # 20.19f

    .line 71
    .line 72
    .line 73
    const/high16 v2, 0x40800000    # 4.0f

    .line 74
    .line 75
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    const/high16 v0, 0x40800000    # 4.0f

    .line 79
    .line 80
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 81
    .line 82
    .line 83
    const v17, 0x4000a3d7    # 2.01f

    .line 84
    .line 85
    .line 86
    const/high16 v18, 0x40c00000    # 6.0f

    .line 87
    .line 88
    const v13, 0x4039999a    # 2.9f

    .line 89
    .line 90
    .line 91
    const/high16 v14, 0x40800000    # 4.0f

    .line 92
    .line 93
    const v15, 0x4000a3d7    # 2.01f

    .line 94
    .line 95
    .line 96
    const v16, 0x409ccccd    # 4.9f

    .line 97
    .line 98
    .line 99
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 100
    .line 101
    .line 102
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 103
    .line 104
    .line 105
    const/high16 v17, 0x40800000    # 4.0f

    .line 106
    .line 107
    const/high16 v18, 0x41400000    # 12.0f

    .line 108
    .line 109
    const v13, 0x40470a3d    # 3.11f

    .line 110
    .line 111
    .line 112
    const/high16 v14, 0x41200000    # 10.0f

    .line 113
    .line 114
    const/high16 v15, 0x40800000    # 4.0f

    .line 115
    .line 116
    const v16, 0x412e6666    # 10.9f

    .line 117
    .line 118
    .line 119
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 120
    .line 121
    .line 122
    const v0, -0x409c28f6    # -0.89f

    .line 123
    .line 124
    .line 125
    const/high16 v2, -0x40000000    # -2.0f

    .line 126
    .line 127
    const/high16 v4, 0x40000000    # 2.0f

    .line 128
    .line 129
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 130
    .line 131
    .line 132
    const/high16 v0, 0x40800000    # 4.0f

    .line 133
    .line 134
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 135
    .line 136
    .line 137
    const/high16 v17, 0x40000000    # 2.0f

    .line 138
    .line 139
    const/high16 v18, 0x40000000    # 2.0f

    .line 140
    .line 141
    const/4 v13, 0x0

    .line 142
    const v14, 0x3f8ccccd    # 1.1f

    .line 143
    .line 144
    .line 145
    const v15, 0x3f666666    # 0.9f

    .line 146
    .line 147
    .line 148
    const/high16 v16, 0x40000000    # 2.0f

    .line 149
    .line 150
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 151
    .line 152
    .line 153
    const/high16 v0, 0x41800000    # 16.0f

    .line 154
    .line 155
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 156
    .line 157
    .line 158
    const/high16 v18, -0x40000000    # -2.0f

    .line 159
    .line 160
    const v13, 0x3f8ccccd    # 1.1f

    .line 161
    .line 162
    .line 163
    const/4 v14, 0x0

    .line 164
    const/high16 v15, 0x40000000    # 2.0f

    .line 165
    .line 166
    const v16, -0x4099999a    # -0.9f

    .line 167
    .line 168
    .line 169
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 170
    .line 171
    .line 172
    const/high16 v0, 0x40c00000    # 6.0f

    .line 173
    .line 174
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 175
    .line 176
    .line 177
    const v17, 0x41a1851f    # 20.19f

    .line 178
    .line 179
    .line 180
    const/high16 v18, 0x40800000    # 4.0f

    .line 181
    .line 182
    const/high16 v13, 0x41b00000    # 22.0f

    .line 183
    .line 184
    const v14, 0x409ccccd    # 4.9f

    .line 185
    .line 186
    .line 187
    const v15, 0x41a9851f    # 21.19f

    .line 188
    .line 189
    .line 190
    const/high16 v16, 0x40800000    # 4.0f

    .line 191
    .line 192
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 193
    .line 194
    .line 195
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 196
    .line 197
    .line 198
    const v0, 0x418dd70a    # 17.73f

    .line 199
    .line 200
    .line 201
    const v2, 0x4154cccd    # 13.3f

    .line 202
    .line 203
    .line 204
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 205
    .line 206
    .line 207
    const v0, -0x3ef828f6    # -8.49f

    .line 208
    .line 209
    .line 210
    const v2, 0x4010a3d7    # 2.26f

    .line 211
    .line 212
    .line 213
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 214
    .line 215
    .line 216
    const v17, -0x40f0a3d7    # -0.56f

    .line 217
    .line 218
    .line 219
    const v18, -0x41947ae1    # -0.23f

    .line 220
    .line 221
    .line 222
    const v13, -0x419eb852    # -0.22f

    .line 223
    .line 224
    .line 225
    const v14, 0x3d75c28f    # 0.06f

    .line 226
    .line 227
    .line 228
    const v15, -0x4119999a    # -0.45f

    .line 229
    .line 230
    .line 231
    const v16, -0x42dc28f6    # -0.04f

    .line 232
    .line 233
    .line 234
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 235
    .line 236
    .line 237
    const v0, -0x4070a3d7    # -1.12f

    .line 238
    .line 239
    .line 240
    const v2, -0x40066666    # -1.95f

    .line 241
    .line 242
    .line 243
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 244
    .line 245
    .line 246
    const v17, 0x3ea3d70a    # 0.32f

    .line 247
    .line 248
    .line 249
    const v18, -0x40b851ec    # -0.78f

    .line 250
    .line 251
    .line 252
    const v13, -0x41c7ae14    # -0.18f

    .line 253
    .line 254
    .line 255
    const v14, -0x41666666    # -0.3f

    .line 256
    .line 257
    .line 258
    const v15, -0x43dc28f6    # -0.01f

    .line 259
    .line 260
    .line 261
    const v16, -0x40cf5c29    # -0.69f

    .line 262
    .line 263
    .line 264
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 265
    .line 266
    .line 267
    const/4 v0, 0x0

    .line 268
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 269
    .line 270
    .line 271
    const v17, 0x3ef0a3d7    # 0.47f

    .line 272
    .line 273
    .line 274
    const v18, 0x3dcccccd    # 0.1f

    .line 275
    .line 276
    .line 277
    const v13, 0x3e23d70a    # 0.16f

    .line 278
    .line 279
    .line 280
    const v14, -0x42dc28f6    # -0.04f

    .line 281
    .line 282
    .line 283
    const v15, 0x3eae147b    # 0.34f

    .line 284
    .line 285
    .line 286
    const v16, -0x43dc28f6    # -0.01f

    .line 287
    .line 288
    .line 289
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 290
    .line 291
    .line 292
    const v0, 0x3f866666    # 1.05f

    .line 293
    .line 294
    .line 295
    const v2, 0x3f51eb85    # 0.82f

    .line 296
    .line 297
    .line 298
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 299
    .line 300
    .line 301
    const v0, 0x4018f5c3    # 2.39f

    .line 302
    .line 303
    .line 304
    const v2, -0x40dc28f6    # -0.64f

    .line 305
    .line 306
    .line 307
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 308
    .line 309
    .line 310
    const v0, 0x411e6666    # 9.9f

    .line 311
    .line 312
    .line 313
    const v2, 0x4119999a    # 9.6f

    .line 314
    .line 315
    .line 316
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 317
    .line 318
    .line 319
    const v18, -0x406ccccd    # -1.15f

    .line 320
    .line 321
    .line 322
    const v13, -0x417ae148    # -0.26f

    .line 323
    .line 324
    .line 325
    const v14, -0x411eb852    # -0.44f

    .line 326
    .line 327
    .line 328
    const v15, -0x435c28f6    # -0.02f

    .line 329
    .line 330
    .line 331
    const v16, -0x407eb852    # -1.01f

    .line 332
    .line 333
    .line 334
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 335
    .line 336
    .line 337
    const/4 v0, 0x0

    .line 338
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 339
    .line 340
    .line 341
    const v17, 0x3f3d70a4    # 0.74f

    .line 342
    .line 343
    .line 344
    const v18, 0x3e3851ec    # 0.18f

    .line 345
    .line 346
    .line 347
    const v13, 0x3e851eb8    # 0.26f

    .line 348
    .line 349
    .line 350
    const v14, -0x4270a3d7    # -0.07f

    .line 351
    .line 352
    .line 353
    const v15, 0x3f0a3d71    # 0.54f

    .line 354
    .line 355
    .line 356
    const/16 v16, 0x0

    .line 357
    .line 358
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 359
    .line 360
    .line 361
    const v0, 0x406c28f6    # 3.69f

    .line 362
    .line 363
    .line 364
    const v2, 0x405c28f6    # 3.44f

    .line 365
    .line 366
    .line 367
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 368
    .line 369
    .line 370
    const v0, 0x401c28f6    # 2.44f

    .line 371
    .line 372
    .line 373
    const v2, -0x40d9999a    # -0.65f

    .line 374
    .line 375
    .line 376
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 377
    .line 378
    .line 379
    const v17, 0x3f970a3d    # 1.18f

    .line 380
    .line 381
    .line 382
    const v18, 0x3f2e147b    # 0.68f

    .line 383
    .line 384
    .line 385
    const v13, 0x3f028f5c    # 0.51f

    .line 386
    .line 387
    .line 388
    const v14, -0x41f0a3d7    # -0.14f

    .line 389
    .line 390
    .line 391
    const v15, 0x3f851eb8    # 1.04f

    .line 392
    .line 393
    .line 394
    const v16, 0x3e2e147b    # 0.17f

    .line 395
    .line 396
    .line 397
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 398
    .line 399
    .line 400
    const v17, 0x418dd70a    # 17.73f

    .line 401
    .line 402
    .line 403
    const v18, 0x4154cccd    # 13.3f

    .line 404
    .line 405
    .line 406
    const v13, 0x41946666    # 18.55f

    .line 407
    .line 408
    .line 409
    const v14, 0x4149eb85    # 12.62f

    .line 410
    .line 411
    .line 412
    const/high16 v15, 0x41920000    # 18.25f

    .line 413
    .line 414
    const v16, 0x41526666    # 13.15f

    .line 415
    .line 416
    .line 417
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 418
    .line 419
    .line 420
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 421
    .line 422
    .line 423
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 424
    .line 425
    .line 426
    move-result-object v2

    .line 427
    const/16 v16, 0x3800

    .line 428
    .line 429
    const/16 v17, 0x0

    .line 430
    .line 431
    const/high16 v6, 0x3f800000    # 1.0f

    .line 432
    .line 433
    const/high16 v8, 0x3f800000    # 1.0f

    .line 434
    .line 435
    const/4 v7, 0x0

    .line 436
    const/high16 v9, 0x3f800000    # 1.0f

    .line 437
    .line 438
    const/high16 v12, 0x3f800000    # 1.0f

    .line 439
    .line 440
    const/4 v13, 0x0

    .line 441
    const/4 v14, 0x0

    .line 442
    const/4 v15, 0x0

    .line 443
    const-string v4, ""

    .line 444
    .line 445
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 446
    .line 447
    .line 448
    move-result-object v0

    .line 449
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 450
    .line 451
    .line 452
    move-result-object v0

    .line 453
    sput-object v0, Landroidx/compose/material/icons/automirrored/rounded/AirplaneTicketKt;->_airplaneTicket:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 454
    .line 455
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 456
    .line 457
    .line 458
    return-object v0
.end method
