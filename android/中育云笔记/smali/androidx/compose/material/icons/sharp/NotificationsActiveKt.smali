.class public final Landroidx/compose/material/icons/sharp/NotificationsActiveKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _notificationsActive:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getNotificationsActive(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/sharp/NotificationsActiveKt;->_notificationsActive:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Sharp.NotificationsActive"

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
    const v0, 0x40f28f5c    # 7.58f

    .line 71
    .line 72
    .line 73
    const v2, 0x40828f5c    # 4.08f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v0, 0x40c4cccd    # 6.15f

    .line 80
    .line 81
    .line 82
    const v2, 0x4029999a    # 2.65f

    .line 83
    .line 84
    .line 85
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 86
    .line 87
    .line 88
    const v17, 0x4001eb85    # 2.03f

    .line 89
    .line 90
    .line 91
    const/high16 v18, 0x41280000    # 10.5f

    .line 92
    .line 93
    const/high16 v13, 0x40700000    # 3.75f

    .line 94
    .line 95
    const v14, 0x408f5c29    # 4.48f

    .line 96
    .line 97
    .line 98
    const v15, 0x400ae148    # 2.17f

    .line 99
    .line 100
    .line 101
    const v16, 0x40e9999a    # 7.3f

    .line 102
    .line 103
    .line 104
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 105
    .line 106
    .line 107
    const/high16 v0, 0x40000000    # 2.0f

    .line 108
    .line 109
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 110
    .line 111
    .line 112
    const v17, 0x40633333    # 3.55f

    .line 113
    .line 114
    .line 115
    const v18, -0x3f328f5c    # -6.42f

    .line 116
    .line 117
    .line 118
    const v13, 0x3e19999a    # 0.15f

    .line 119
    .line 120
    .line 121
    const v14, -0x3fd66666    # -2.65f

    .line 122
    .line 123
    .line 124
    const v15, 0x3fc147ae    # 1.51f

    .line 125
    .line 126
    .line 127
    const v16, -0x3f60f5c3    # -4.97f

    .line 128
    .line 129
    .line 130
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 131
    .line 132
    .line 133
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 134
    .line 135
    .line 136
    const v0, 0x419fc28f    # 19.97f

    .line 137
    .line 138
    .line 139
    const/high16 v2, 0x41280000    # 10.5f

    .line 140
    .line 141
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 142
    .line 143
    .line 144
    const/high16 v0, 0x40000000    # 2.0f

    .line 145
    .line 146
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 147
    .line 148
    .line 149
    const v17, -0x3f7c28f6    # -4.12f

    .line 150
    .line 151
    .line 152
    const v18, -0x3f04cccd    # -7.85f

    .line 153
    .line 154
    .line 155
    const v13, -0x41e66666    # -0.15f

    .line 156
    .line 157
    .line 158
    const v14, -0x3fb33333    # -3.2f

    .line 159
    .line 160
    .line 161
    const v15, -0x40228f5c    # -1.73f

    .line 162
    .line 163
    .line 164
    const v16, -0x3f3f5c29    # -6.02f

    .line 165
    .line 166
    .line 167
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 168
    .line 169
    .line 170
    const v0, -0x404a3d71    # -1.42f

    .line 171
    .line 172
    .line 173
    const v2, 0x3fb70a3d    # 1.43f

    .line 174
    .line 175
    .line 176
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 177
    .line 178
    .line 179
    const v17, 0x40628f5c    # 3.54f

    .line 180
    .line 181
    .line 182
    const v18, 0x40cd70a4    # 6.42f

    .line 183
    .line 184
    .line 185
    const v13, 0x400147ae    # 2.02f

    .line 186
    .line 187
    .line 188
    const v14, 0x3fb9999a    # 1.45f

    .line 189
    .line 190
    .line 191
    const v15, 0x4058f5c3    # 3.39f

    .line 192
    .line 193
    .line 194
    const v16, 0x407147ae    # 3.77f

    .line 195
    .line 196
    .line 197
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 198
    .line 199
    .line 200
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 201
    .line 202
    .line 203
    const/high16 v0, 0x41900000    # 18.0f

    .line 204
    .line 205
    const/high16 v2, 0x41300000    # 11.0f

    .line 206
    .line 207
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 208
    .line 209
    .line 210
    const/high16 v17, -0x3f700000    # -4.5f

    .line 211
    .line 212
    const v18, -0x3f35c28f    # -6.32f

    .line 213
    .line 214
    .line 215
    const/4 v13, 0x0

    .line 216
    const v14, -0x3fbb851f    # -3.07f

    .line 217
    .line 218
    .line 219
    const v15, -0x402e147b    # -1.64f

    .line 220
    .line 221
    .line 222
    const v16, -0x3f4b851f    # -5.64f

    .line 223
    .line 224
    .line 225
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 226
    .line 227
    .line 228
    const/high16 v0, 0x41580000    # 13.5f

    .line 229
    .line 230
    const/high16 v2, 0x40200000    # 2.5f

    .line 231
    .line 232
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 233
    .line 234
    .line 235
    const/high16 v0, -0x3fc00000    # -3.0f

    .line 236
    .line 237
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 238
    .line 239
    .line 240
    const v0, 0x400b851f    # 2.18f

    .line 241
    .line 242
    .line 243
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 244
    .line 245
    .line 246
    const/high16 v17, 0x40c00000    # 6.0f

    .line 247
    .line 248
    const/high16 v18, 0x41300000    # 11.0f

    .line 249
    .line 250
    const v13, 0x40f428f6    # 7.63f

    .line 251
    .line 252
    .line 253
    const v14, 0x40ab851f    # 5.36f

    .line 254
    .line 255
    .line 256
    const/high16 v15, 0x40c00000    # 6.0f

    .line 257
    .line 258
    const v16, 0x40fd70a4    # 7.92f

    .line 259
    .line 260
    .line 261
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 262
    .line 263
    .line 264
    const/high16 v0, 0x40a00000    # 5.0f

    .line 265
    .line 266
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 267
    .line 268
    .line 269
    const/high16 v0, -0x40000000    # -2.0f

    .line 270
    .line 271
    const/high16 v2, 0x40000000    # 2.0f

    .line 272
    .line 273
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 274
    .line 275
    .line 276
    const/high16 v0, 0x3f800000    # 1.0f

    .line 277
    .line 278
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 279
    .line 280
    .line 281
    const/high16 v0, 0x41800000    # 16.0f

    .line 282
    .line 283
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 284
    .line 285
    .line 286
    const/high16 v0, -0x40800000    # -1.0f

    .line 287
    .line 288
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 289
    .line 290
    .line 291
    const/high16 v0, -0x40000000    # -2.0f

    .line 292
    .line 293
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 294
    .line 295
    .line 296
    const/high16 v0, -0x3f600000    # -5.0f

    .line 297
    .line 298
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 299
    .line 300
    .line 301
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 302
    .line 303
    .line 304
    const/high16 v0, 0x41400000    # 12.0f

    .line 305
    .line 306
    const/high16 v2, 0x41b00000    # 22.0f

    .line 307
    .line 308
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 309
    .line 310
    .line 311
    const v17, 0x3ecccccd    # 0.4f

    .line 312
    .line 313
    .line 314
    const v18, -0x42dc28f6    # -0.04f

    .line 315
    .line 316
    .line 317
    const v13, 0x3e0f5c29    # 0.14f

    .line 318
    .line 319
    .line 320
    const/4 v14, 0x0

    .line 321
    const v15, 0x3e8a3d71    # 0.27f

    .line 322
    .line 323
    .line 324
    const v16, -0x43dc28f6    # -0.01f

    .line 325
    .line 326
    .line 327
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 328
    .line 329
    .line 330
    const v17, 0x3fb851ec    # 1.44f

    .line 331
    .line 332
    .line 333
    const v18, -0x4068f5c3    # -1.18f

    .line 334
    .line 335
    .line 336
    const v13, 0x3f266666    # 0.65f

    .line 337
    .line 338
    .line 339
    const v14, -0x41f0a3d7    # -0.14f

    .line 340
    .line 341
    .line 342
    const v15, 0x3f970a3d    # 1.18f

    .line 343
    .line 344
    .line 345
    const v16, -0x40eb851f    # -0.58f

    .line 346
    .line 347
    .line 348
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 349
    .line 350
    .line 351
    const v17, 0x3e19999a    # 0.15f

    .line 352
    .line 353
    .line 354
    const v18, -0x40b851ec    # -0.78f

    .line 355
    .line 356
    .line 357
    const v13, 0x3dcccccd    # 0.1f

    .line 358
    .line 359
    .line 360
    const v14, -0x418a3d71    # -0.24f

    .line 361
    .line 362
    .line 363
    const v15, 0x3e19999a    # 0.15f

    .line 364
    .line 365
    .line 366
    const/high16 v16, -0x41000000    # -0.5f

    .line 367
    .line 368
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 369
    .line 370
    .line 371
    const/high16 v0, -0x3f800000    # -4.0f

    .line 372
    .line 373
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 374
    .line 375
    .line 376
    const v17, 0x4000a3d7    # 2.01f

    .line 377
    .line 378
    .line 379
    const/high16 v18, 0x40000000    # 2.0f

    .line 380
    .line 381
    const v13, 0x3c23d70a    # 0.01f

    .line 382
    .line 383
    .line 384
    const v14, 0x3f8ccccd    # 1.1f

    .line 385
    .line 386
    .line 387
    const v15, 0x3f666666    # 0.9f

    .line 388
    .line 389
    .line 390
    const/high16 v16, 0x40000000    # 2.0f

    .line 391
    .line 392
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 393
    .line 394
    .line 395
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 396
    .line 397
    .line 398
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 399
    .line 400
    .line 401
    move-result-object v2

    .line 402
    const/16 v16, 0x3800

    .line 403
    .line 404
    const/16 v17, 0x0

    .line 405
    .line 406
    const/high16 v6, 0x3f800000    # 1.0f

    .line 407
    .line 408
    const/high16 v8, 0x3f800000    # 1.0f

    .line 409
    .line 410
    const/4 v7, 0x0

    .line 411
    const/high16 v9, 0x3f800000    # 1.0f

    .line 412
    .line 413
    const/high16 v12, 0x3f800000    # 1.0f

    .line 414
    .line 415
    const/4 v13, 0x0

    .line 416
    const/4 v14, 0x0

    .line 417
    const/4 v15, 0x0

    .line 418
    const-string v4, ""

    .line 419
    .line 420
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 421
    .line 422
    .line 423
    move-result-object v0

    .line 424
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 425
    .line 426
    .line 427
    move-result-object v0

    .line 428
    sput-object v0, Landroidx/compose/material/icons/sharp/NotificationsActiveKt;->_notificationsActive:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 429
    .line 430
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 431
    .line 432
    .line 433
    return-object v0
.end method
