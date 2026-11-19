.class public final Landroidx/compose/material/icons/rounded/SettingsBackupRestoreKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _settingsBackupRestore:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getSettingsBackupRestore(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/SettingsBackupRestoreKt;->_settingsBackupRestore:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.SettingsBackupRestore"

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
    const v0, 0x413c51ec    # 11.77f

    .line 71
    .line 72
    .line 73
    const/high16 v2, 0x40400000    # 3.0f

    .line 74
    .line 75
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    const v17, -0x3f2ccccd    # -6.6f

    .line 79
    .line 80
    .line 81
    const v18, 0x404a3d71    # 3.16f

    .line 82
    .line 83
    .line 84
    const v13, -0x3fd66666    # -2.65f

    .line 85
    .line 86
    .line 87
    const v14, 0x3d8f5c29    # 0.07f

    .line 88
    .line 89
    .line 90
    const/high16 v15, -0x3f600000    # -5.0f

    .line 91
    .line 92
    const v16, 0x3fa3d70a    # 1.28f

    .line 93
    .line 94
    .line 95
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 96
    .line 97
    .line 98
    const v0, 0x40766666    # 3.85f

    .line 99
    .line 100
    .line 101
    const v2, 0x409b3333    # 4.85f

    .line 102
    .line 103
    .line 104
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 105
    .line 106
    .line 107
    const/high16 v17, 0x40400000    # 3.0f

    .line 108
    .line 109
    const v18, 0x40a6b852    # 5.21f

    .line 110
    .line 111
    .line 112
    const v13, 0x40628f5c    # 3.54f

    .line 113
    .line 114
    .line 115
    const v14, 0x409147ae    # 4.54f

    .line 116
    .line 117
    .line 118
    const/high16 v15, 0x40400000    # 3.0f

    .line 119
    .line 120
    const v16, 0x409851ec    # 4.76f

    .line 121
    .line 122
    .line 123
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 124
    .line 125
    .line 126
    const/high16 v0, 0x41180000    # 9.5f

    .line 127
    .line 128
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 129
    .line 130
    .line 131
    const/high16 v17, 0x40600000    # 3.5f

    .line 132
    .line 133
    const/high16 v18, 0x41200000    # 10.0f

    .line 134
    .line 135
    const/high16 v13, 0x40400000    # 3.0f

    .line 136
    .line 137
    const v14, 0x411c7ae1    # 9.78f

    .line 138
    .line 139
    .line 140
    const v15, 0x404e147b    # 3.22f

    .line 141
    .line 142
    .line 143
    const/high16 v16, 0x41200000    # 10.0f

    .line 144
    .line 145
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 146
    .line 147
    .line 148
    const v0, 0x408947ae    # 4.29f

    .line 149
    .line 150
    .line 151
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 152
    .line 153
    .line 154
    const v17, 0x3eb33333    # 0.35f

    .line 155
    .line 156
    .line 157
    const v18, -0x40a66666    # -0.85f

    .line 158
    .line 159
    .line 160
    const v13, 0x3ee66666    # 0.45f

    .line 161
    .line 162
    .line 163
    const/4 v14, 0x0

    .line 164
    const v15, 0x3f2b851f    # 0.67f

    .line 165
    .line 166
    .line 167
    const v16, -0x40f5c28f    # -0.54f

    .line 168
    .line 169
    .line 170
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 171
    .line 172
    .line 173
    const v0, 0x40d2e148    # 6.59f

    .line 174
    .line 175
    .line 176
    const v2, 0x40f2e148    # 7.59f

    .line 177
    .line 178
    .line 179
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 180
    .line 181
    .line 182
    const/high16 v17, 0x41400000    # 12.0f

    .line 183
    .line 184
    const/high16 v18, 0x40a00000    # 5.0f

    .line 185
    .line 186
    const v13, 0x40fc28f6    # 7.88f

    .line 187
    .line 188
    .line 189
    const v14, 0x40c0a3d7    # 6.02f

    .line 190
    .line 191
    .line 192
    const v15, 0x411d1eb8    # 9.82f

    .line 193
    .line 194
    .line 195
    const/high16 v16, 0x40a00000    # 5.0f

    .line 196
    .line 197
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 198
    .line 199
    .line 200
    const v17, 0x40db851f    # 6.86f

    .line 201
    .line 202
    .line 203
    const v18, 0x41068f5c    # 8.41f

    .line 204
    .line 205
    .line 206
    const v13, 0x408a3d71    # 4.32f

    .line 207
    .line 208
    .line 209
    const/4 v14, 0x0

    .line 210
    const v15, 0x40f7ae14    # 7.74f

    .line 211
    .line 212
    .line 213
    const v16, 0x407c28f6    # 3.94f

    .line 214
    .line 215
    .line 216
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 217
    .line 218
    .line 219
    const v17, -0x3f4d70a4    # -5.58f

    .line 220
    .line 221
    .line 222
    const v18, 0x40af0a3d    # 5.47f

    .line 223
    .line 224
    .line 225
    const v13, -0x40f5c28f    # -0.54f

    .line 226
    .line 227
    .line 228
    const v14, 0x403147ae    # 2.77f

    .line 229
    .line 230
    .line 231
    const v15, -0x3fcc28f6    # -2.81f

    .line 232
    .line 233
    .line 234
    const v16, 0x409f5c29    # 4.98f

    .line 235
    .line 236
    .line 237
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 238
    .line 239
    .line 240
    const v17, -0x3eff3333    # -8.05f

    .line 241
    .line 242
    .line 243
    const v18, -0x3f5ae148    # -5.16f

    .line 244
    .line 245
    .line 246
    const v13, -0x3f8ccccd    # -3.8f

    .line 247
    .line 248
    .line 249
    const v14, 0x3f2e147b    # 0.68f

    .line 250
    .line 251
    .line 252
    const v15, -0x3f1a3d71    # -7.18f

    .line 253
    .line 254
    .line 255
    const v16, -0x402147ae    # -1.74f

    .line 256
    .line 257
    .line 258
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 259
    .line 260
    .line 261
    const v17, 0x4088a3d7    # 4.27f

    .line 262
    .line 263
    .line 264
    const/high16 v18, 0x41500000    # 13.0f

    .line 265
    .line 266
    const v13, 0x40a3851f    # 5.11f

    .line 267
    .line 268
    .line 269
    const v14, 0x4154cccd    # 13.3f

    .line 270
    .line 271
    .line 272
    const v15, 0x4096b852    # 4.71f

    .line 273
    .line 274
    .line 275
    const/high16 v16, 0x41500000    # 13.0f

    .line 276
    .line 277
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 278
    .line 279
    .line 280
    const/4 v0, 0x0

    .line 281
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 282
    .line 283
    .line 284
    const v17, -0x40851eb8    # -0.98f

    .line 285
    .line 286
    .line 287
    const v18, 0x3f9d70a4    # 1.23f

    .line 288
    .line 289
    .line 290
    const v13, -0x40d9999a    # -0.65f

    .line 291
    .line 292
    .line 293
    const/4 v14, 0x0

    .line 294
    const v15, -0x406e147b    # -1.14f

    .line 295
    .line 296
    .line 297
    const v16, 0x3f1c28f6    # 0.61f

    .line 298
    .line 299
    .line 300
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 301
    .line 302
    .line 303
    const/high16 v17, 0x41400000    # 12.0f

    .line 304
    .line 305
    const/high16 v18, 0x41a80000    # 21.0f

    .line 306
    .line 307
    const v13, 0x4088f5c3    # 4.28f

    .line 308
    .line 309
    .line 310
    const v14, 0x4190f5c3    # 18.12f

    .line 311
    .line 312
    .line 313
    const v15, 0x40f9999a    # 7.8f

    .line 314
    .line 315
    .line 316
    const/high16 v16, 0x41a80000    # 21.0f

    .line 317
    .line 318
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 319
    .line 320
    .line 321
    const/high16 v17, 0x41100000    # 9.0f

    .line 322
    .line 323
    const v18, -0x3eebd70a    # -9.26f

    .line 324
    .line 325
    .line 326
    const v13, 0x40a1eb85    # 5.06f

    .line 327
    .line 328
    .line 329
    const/4 v14, 0x0

    .line 330
    const v15, 0x41123d71    # 9.14f

    .line 331
    .line 332
    .line 333
    const v16, -0x3f7a8f5c    # -4.17f

    .line 334
    .line 335
    .line 336
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 337
    .line 338
    .line 339
    const v17, 0x413c51ec    # 11.77f

    .line 340
    .line 341
    .line 342
    const/high16 v18, 0x40400000    # 3.0f

    .line 343
    .line 344
    const v13, 0x41a6e148    # 20.86f

    .line 345
    .line 346
    .line 347
    const v14, 0x40db851f    # 6.86f

    .line 348
    .line 349
    .line 350
    const v15, 0x41853333    # 16.65f

    .line 351
    .line 352
    .line 353
    const v16, 0x403851ec    # 2.88f

    .line 354
    .line 355
    .line 356
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 357
    .line 358
    .line 359
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 360
    .line 361
    .line 362
    const/high16 v0, 0x41400000    # 12.0f

    .line 363
    .line 364
    const/high16 v2, 0x41600000    # 14.0f

    .line 365
    .line 366
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 367
    .line 368
    .line 369
    const/high16 v17, -0x40000000    # -2.0f

    .line 370
    .line 371
    const/high16 v18, -0x40000000    # -2.0f

    .line 372
    .line 373
    const/4 v13, 0x0

    .line 374
    const v14, -0x40733333    # -1.1f

    .line 375
    .line 376
    .line 377
    const v15, -0x4099999a    # -0.9f

    .line 378
    .line 379
    .line 380
    const/high16 v16, -0x40000000    # -2.0f

    .line 381
    .line 382
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 383
    .line 384
    .line 385
    const v0, 0x3f666666    # 0.9f

    .line 386
    .line 387
    .line 388
    const/high16 v2, -0x40000000    # -2.0f

    .line 389
    .line 390
    const/high16 v4, 0x40000000    # 2.0f

    .line 391
    .line 392
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 393
    .line 394
    .line 395
    const/high16 v2, 0x40000000    # 2.0f

    .line 396
    .line 397
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 398
    .line 399
    .line 400
    const v0, 0x4151999a    # 13.1f

    .line 401
    .line 402
    .line 403
    const/high16 v2, 0x41400000    # 12.0f

    .line 404
    .line 405
    const/high16 v4, 0x41600000    # 14.0f

    .line 406
    .line 407
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 408
    .line 409
    .line 410
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 411
    .line 412
    .line 413
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 414
    .line 415
    .line 416
    move-result-object v2

    .line 417
    const/16 v16, 0x3800

    .line 418
    .line 419
    const/16 v17, 0x0

    .line 420
    .line 421
    const/high16 v6, 0x3f800000    # 1.0f

    .line 422
    .line 423
    const/high16 v8, 0x3f800000    # 1.0f

    .line 424
    .line 425
    const/4 v7, 0x0

    .line 426
    const/high16 v9, 0x3f800000    # 1.0f

    .line 427
    .line 428
    const/high16 v12, 0x3f800000    # 1.0f

    .line 429
    .line 430
    const/4 v14, 0x0

    .line 431
    const/4 v15, 0x0

    .line 432
    const-string v4, ""

    .line 433
    .line 434
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 435
    .line 436
    .line 437
    move-result-object v0

    .line 438
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 439
    .line 440
    .line 441
    move-result-object v0

    .line 442
    sput-object v0, Landroidx/compose/material/icons/rounded/SettingsBackupRestoreKt;->_settingsBackupRestore:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 443
    .line 444
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 445
    .line 446
    .line 447
    return-object v0
.end method
