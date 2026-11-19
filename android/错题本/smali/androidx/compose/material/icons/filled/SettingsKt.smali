.class public final Landroidx/compose/material/icons/filled/SettingsKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_settings",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "Settings",
        "Landroidx/compose/material/icons/Icons$Filled;",
        "getSettings",
        "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;",
        "material-icons-core_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nSettings.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Settings.kt\nandroidx/compose/material/icons/filled/SettingsKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,83:1\n212#2,12:84\n233#2,18:97\n253#2:134\n174#3:96\n705#4,2:115\n717#4,2:117\n719#4,11:123\n72#5,4:119\n*S KotlinDebug\n*F\n+ 1 Settings.kt\nandroidx/compose/material/icons/filled/SettingsKt\n*L\n29#1:84,12\n30#1:97,18\n30#1:134\n29#1:96\n30#1:115,2\n30#1:117,2\n30#1:123,11\n30#1:119,4\n*E\n"
    }
.end annotation


# static fields
.field private static _settings:Landroidx/compose/ui/graphics/vector/ImageVector;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field


# direct methods
.method public static final getSettings(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19
    .param p0    # Landroidx/compose/material/icons/Icons$Filled;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    sget-object v0, Landroidx/compose/material/icons/filled/SettingsKt;->_settings:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-static {v0}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

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
    const-string v2, "Filled.Settings"

    .line 33
    .line 34
    invoke-direct/range {v1 .. v12}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;-><init>(Ljava/lang/String;FFFFJIZILkotlin/jvm/internal/e;)V

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
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/e;)V

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
    const v0, 0x414f0a3d    # 12.94f

    .line 66
    .line 67
    .line 68
    const v2, 0x41991eb8    # 19.14f

    .line 69
    .line 70
    .line 71
    invoke-static {v2, v0}, Lg/a;->a(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 72
    .line 73
    .line 74
    move-result-object v12

    .line 75
    const v17, 0x3d75c28f    # 0.06f

    .line 76
    .line 77
    .line 78
    const v18, -0x408f5c29    # -0.94f

    .line 79
    .line 80
    .line 81
    const v13, 0x3d23d70a    # 0.04f

    .line 82
    .line 83
    .line 84
    const v14, -0x41666666    # -0.3f

    .line 85
    .line 86
    .line 87
    const v15, 0x3d75c28f    # 0.06f

    .line 88
    .line 89
    .line 90
    const v16, -0x40e3d70a    # -0.61f

    .line 91
    .line 92
    .line 93
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 94
    .line 95
    .line 96
    const v17, -0x4270a3d7    # -0.07f

    .line 97
    .line 98
    .line 99
    const/4 v13, 0x0

    .line 100
    const v14, -0x415c28f6    # -0.32f

    .line 101
    .line 102
    .line 103
    const v15, -0x435c28f6    # -0.02f

    .line 104
    .line 105
    .line 106
    const v16, -0x40dc28f6    # -0.64f

    .line 107
    .line 108
    .line 109
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 110
    .line 111
    .line 112
    const v0, -0x4035c28f    # -1.58f

    .line 113
    .line 114
    .line 115
    const v2, 0x4001eb85    # 2.03f

    .line 116
    .line 117
    .line 118
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 119
    .line 120
    .line 121
    const v17, 0x3df5c28f    # 0.12f

    .line 122
    .line 123
    .line 124
    const v18, -0x40e3d70a    # -0.61f

    .line 125
    .line 126
    .line 127
    const v13, 0x3e3851ec    # 0.18f

    .line 128
    .line 129
    .line 130
    const v14, -0x41f0a3d7    # -0.14f

    .line 131
    .line 132
    .line 133
    const v15, 0x3e6b851f    # 0.23f

    .line 134
    .line 135
    .line 136
    const v16, -0x412e147b    # -0.41f

    .line 137
    .line 138
    .line 139
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 140
    .line 141
    .line 142
    const v0, -0x400a3d71    # -1.92f

    .line 143
    .line 144
    .line 145
    const v2, -0x3fab851f    # -3.32f

    .line 146
    .line 147
    .line 148
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 149
    .line 150
    .line 151
    const v17, -0x40e8f5c3    # -0.59f

    .line 152
    .line 153
    .line 154
    const v18, -0x419eb852    # -0.22f

    .line 155
    .line 156
    .line 157
    const v13, -0x420a3d71    # -0.12f

    .line 158
    .line 159
    .line 160
    const v14, -0x419eb852    # -0.22f

    .line 161
    .line 162
    .line 163
    const v15, -0x41428f5c    # -0.37f

    .line 164
    .line 165
    .line 166
    const v16, -0x416b851f    # -0.29f

    .line 167
    .line 168
    .line 169
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 170
    .line 171
    .line 172
    const v0, -0x3fe70a3d    # -2.39f

    .line 173
    .line 174
    .line 175
    const v2, 0x3f75c28f    # 0.96f

    .line 176
    .line 177
    .line 178
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 179
    .line 180
    .line 181
    const v17, -0x4030a3d7    # -1.62f

    .line 182
    .line 183
    .line 184
    const v18, -0x408f5c29    # -0.94f

    .line 185
    .line 186
    .line 187
    const/high16 v13, -0x41000000    # -0.5f

    .line 188
    .line 189
    const v14, -0x413d70a4    # -0.38f

    .line 190
    .line 191
    .line 192
    const v15, -0x407c28f6    # -1.03f

    .line 193
    .line 194
    .line 195
    const v16, -0x40cccccd    # -0.7f

    .line 196
    .line 197
    .line 198
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 199
    .line 200
    .line 201
    const v0, 0x41666666    # 14.4f

    .line 202
    .line 203
    .line 204
    const v2, 0x4033d70a    # 2.81f

    .line 205
    .line 206
    .line 207
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 208
    .line 209
    .line 210
    const v17, -0x410a3d71    # -0.48f

    .line 211
    .line 212
    .line 213
    const v18, -0x412e147b    # -0.41f

    .line 214
    .line 215
    .line 216
    const v13, -0x42dc28f6    # -0.04f

    .line 217
    .line 218
    .line 219
    const v14, -0x418a3d71    # -0.24f

    .line 220
    .line 221
    .line 222
    const v15, -0x418a3d71    # -0.24f

    .line 223
    .line 224
    .line 225
    const v16, -0x412e147b    # -0.41f

    .line 226
    .line 227
    .line 228
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 229
    .line 230
    .line 231
    const v0, -0x3f8a3d71    # -3.84f

    .line 232
    .line 233
    .line 234
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 235
    .line 236
    .line 237
    const v17, -0x410f5c29    # -0.47f

    .line 238
    .line 239
    .line 240
    const v18, 0x3ed1eb85    # 0.41f

    .line 241
    .line 242
    .line 243
    const v13, -0x418a3d71    # -0.24f

    .line 244
    .line 245
    .line 246
    const/4 v14, 0x0

    .line 247
    const v15, -0x4123d70a    # -0.43f

    .line 248
    .line 249
    .line 250
    const v16, 0x3e2e147b    # 0.17f

    .line 251
    .line 252
    .line 253
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 254
    .line 255
    .line 256
    const/high16 v0, 0x41140000    # 9.25f

    .line 257
    .line 258
    const v2, 0x40ab3333    # 5.35f

    .line 259
    .line 260
    .line 261
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 262
    .line 263
    .line 264
    const v17, 0x40f428f6    # 7.63f

    .line 265
    .line 266
    .line 267
    const v18, 0x40c947ae    # 6.29f

    .line 268
    .line 269
    .line 270
    const v13, 0x410a8f5c    # 8.66f

    .line 271
    .line 272
    .line 273
    const v14, 0x40b2e148    # 5.59f

    .line 274
    .line 275
    .line 276
    const v15, 0x4101eb85    # 8.12f

    .line 277
    .line 278
    .line 279
    const v16, 0x40bd70a4    # 5.92f

    .line 280
    .line 281
    .line 282
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 283
    .line 284
    .line 285
    const v0, 0x40a7ae14    # 5.24f

    .line 286
    .line 287
    .line 288
    const v2, 0x40aa8f5c    # 5.33f

    .line 289
    .line 290
    .line 291
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 292
    .line 293
    .line 294
    const v17, -0x40e8f5c3    # -0.59f

    .line 295
    .line 296
    .line 297
    const v18, 0x3e6147ae    # 0.22f

    .line 298
    .line 299
    .line 300
    const v13, -0x419eb852    # -0.22f

    .line 301
    .line 302
    .line 303
    const v14, -0x425c28f6    # -0.08f

    .line 304
    .line 305
    .line 306
    const v15, -0x410f5c29    # -0.47f

    .line 307
    .line 308
    .line 309
    const/16 v16, 0x0

    .line 310
    .line 311
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 312
    .line 313
    .line 314
    const v0, 0x402f5c29    # 2.74f

    .line 315
    .line 316
    .line 317
    const v2, 0x410deb85    # 8.87f

    .line 318
    .line 319
    .line 320
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 321
    .line 322
    .line 323
    const v17, 0x40370a3d    # 2.86f

    .line 324
    .line 325
    .line 326
    const v18, 0x4117ae14    # 9.48f

    .line 327
    .line 328
    .line 329
    const v13, 0x4027ae14    # 2.62f

    .line 330
    .line 331
    .line 332
    const v14, 0x411147ae    # 9.08f

    .line 333
    .line 334
    .line 335
    const v15, 0x402a3d71    # 2.66f

    .line 336
    .line 337
    .line 338
    const v16, 0x411570a4    # 9.34f

    .line 339
    .line 340
    .line 341
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 342
    .line 343
    .line 344
    const v0, 0x3fca3d71    # 1.58f

    .line 345
    .line 346
    .line 347
    const v2, 0x4001eb85    # 2.03f

    .line 348
    .line 349
    .line 350
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 351
    .line 352
    .line 353
    const v17, 0x4099999a    # 4.8f

    .line 354
    .line 355
    .line 356
    const/high16 v18, 0x41400000    # 12.0f

    .line 357
    .line 358
    const v13, 0x409ae148    # 4.84f

    .line 359
    .line 360
    .line 361
    const v14, 0x4135c28f    # 11.36f

    .line 362
    .line 363
    .line 364
    const v15, 0x4099999a    # 4.8f

    .line 365
    .line 366
    .line 367
    const v16, 0x413b0a3d    # 11.69f

    .line 368
    .line 369
    .line 370
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 371
    .line 372
    .line 373
    const v0, 0x3d8f5c29    # 0.07f

    .line 374
    .line 375
    .line 376
    const v2, 0x3f70a3d7    # 0.94f

    .line 377
    .line 378
    .line 379
    const v4, 0x3ca3d70a    # 0.02f

    .line 380
    .line 381
    .line 382
    const v6, 0x3f23d70a    # 0.64f

    .line 383
    .line 384
    .line 385
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 386
    .line 387
    .line 388
    const v0, -0x3ffe147b    # -2.03f

    .line 389
    .line 390
    .line 391
    const v2, 0x3fca3d71    # 1.58f

    .line 392
    .line 393
    .line 394
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 395
    .line 396
    .line 397
    const v17, -0x420a3d71    # -0.12f

    .line 398
    .line 399
    .line 400
    const v18, 0x3f1c28f6    # 0.61f

    .line 401
    .line 402
    .line 403
    const v13, -0x41c7ae14    # -0.18f

    .line 404
    .line 405
    .line 406
    const v14, 0x3e0f5c29    # 0.14f

    .line 407
    .line 408
    .line 409
    const v15, -0x41947ae1    # -0.23f

    .line 410
    .line 411
    .line 412
    const v16, 0x3ed1eb85    # 0.41f

    .line 413
    .line 414
    .line 415
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 416
    .line 417
    .line 418
    const v0, 0x40547ae1    # 3.32f

    .line 419
    .line 420
    .line 421
    const v2, 0x3ff5c28f    # 1.92f

    .line 422
    .line 423
    .line 424
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 425
    .line 426
    .line 427
    const v17, 0x3f170a3d    # 0.59f

    .line 428
    .line 429
    .line 430
    const v18, 0x3e6147ae    # 0.22f

    .line 431
    .line 432
    .line 433
    const v13, 0x3df5c28f    # 0.12f

    .line 434
    .line 435
    .line 436
    const v14, 0x3e6147ae    # 0.22f

    .line 437
    .line 438
    .line 439
    const v15, 0x3ebd70a4    # 0.37f

    .line 440
    .line 441
    .line 442
    const v16, 0x3e947ae1    # 0.29f

    .line 443
    .line 444
    .line 445
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 446
    .line 447
    .line 448
    const v0, -0x408a3d71    # -0.96f

    .line 449
    .line 450
    .line 451
    const v2, 0x4018f5c3    # 2.39f

    .line 452
    .line 453
    .line 454
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 455
    .line 456
    .line 457
    const v17, 0x3fcf5c29    # 1.62f

    .line 458
    .line 459
    .line 460
    const v18, 0x3f70a3d7    # 0.94f

    .line 461
    .line 462
    .line 463
    const/high16 v13, 0x3f000000    # 0.5f

    .line 464
    .line 465
    const v14, 0x3ec28f5c    # 0.38f

    .line 466
    .line 467
    .line 468
    const v15, 0x3f83d70a    # 1.03f

    .line 469
    .line 470
    .line 471
    const v16, 0x3f333333    # 0.7f

    .line 472
    .line 473
    .line 474
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 475
    .line 476
    .line 477
    const v0, 0x40228f5c    # 2.54f

    .line 478
    .line 479
    .line 480
    const v2, 0x3eb851ec    # 0.36f

    .line 481
    .line 482
    .line 483
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 484
    .line 485
    .line 486
    const v17, 0x3ef5c28f    # 0.48f

    .line 487
    .line 488
    .line 489
    const v18, 0x3ed1eb85    # 0.41f

    .line 490
    .line 491
    .line 492
    const v13, 0x3d4ccccd    # 0.05f

    .line 493
    .line 494
    .line 495
    const v14, 0x3e75c28f    # 0.24f

    .line 496
    .line 497
    .line 498
    const v15, 0x3e75c28f    # 0.24f

    .line 499
    .line 500
    .line 501
    const v16, 0x3ed1eb85    # 0.41f

    .line 502
    .line 503
    .line 504
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 505
    .line 506
    .line 507
    const v0, 0x4075c28f    # 3.84f

    .line 508
    .line 509
    .line 510
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 511
    .line 512
    .line 513
    const v17, 0x3ef0a3d7    # 0.47f

    .line 514
    .line 515
    .line 516
    const v18, -0x412e147b    # -0.41f

    .line 517
    .line 518
    .line 519
    const v13, 0x3e75c28f    # 0.24f

    .line 520
    .line 521
    .line 522
    const/4 v14, 0x0

    .line 523
    const v15, 0x3ee147ae    # 0.44f

    .line 524
    .line 525
    .line 526
    const v16, -0x41d1eb85    # -0.17f

    .line 527
    .line 528
    .line 529
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 530
    .line 531
    .line 532
    const v0, -0x3fdd70a4    # -2.54f

    .line 533
    .line 534
    .line 535
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 536
    .line 537
    .line 538
    const v17, 0x3fcf5c29    # 1.62f

    .line 539
    .line 540
    .line 541
    const v18, -0x408f5c29    # -0.94f

    .line 542
    .line 543
    .line 544
    const v13, 0x3f170a3d    # 0.59f

    .line 545
    .line 546
    .line 547
    const v14, -0x418a3d71    # -0.24f

    .line 548
    .line 549
    .line 550
    const v15, 0x3f90a3d7    # 1.13f

    .line 551
    .line 552
    .line 553
    const v16, -0x40f0a3d7    # -0.56f

    .line 554
    .line 555
    .line 556
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 557
    .line 558
    .line 559
    const v0, 0x4018f5c3    # 2.39f

    .line 560
    .line 561
    .line 562
    const v2, 0x3f75c28f    # 0.96f

    .line 563
    .line 564
    .line 565
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 566
    .line 567
    .line 568
    const v17, 0x3f170a3d    # 0.59f

    .line 569
    .line 570
    .line 571
    const v18, -0x419eb852    # -0.22f

    .line 572
    .line 573
    .line 574
    const v13, 0x3e6147ae    # 0.22f

    .line 575
    .line 576
    .line 577
    const v14, 0x3da3d70a    # 0.08f

    .line 578
    .line 579
    .line 580
    const v15, 0x3ef0a3d7    # 0.47f

    .line 581
    .line 582
    .line 583
    const/16 v16, 0x0

    .line 584
    .line 585
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 586
    .line 587
    .line 588
    const v0, 0x3ff5c28f    # 1.92f

    .line 589
    .line 590
    .line 591
    const v2, -0x3fab851f    # -3.32f

    .line 592
    .line 593
    .line 594
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 595
    .line 596
    .line 597
    const v17, -0x420a3d71    # -0.12f

    .line 598
    .line 599
    .line 600
    const v18, -0x40e3d70a    # -0.61f

    .line 601
    .line 602
    .line 603
    const v13, 0x3df5c28f    # 0.12f

    .line 604
    .line 605
    .line 606
    const v14, -0x419eb852    # -0.22f

    .line 607
    .line 608
    .line 609
    const v15, 0x3d8f5c29    # 0.07f

    .line 610
    .line 611
    .line 612
    const v16, -0x410f5c29    # -0.47f

    .line 613
    .line 614
    .line 615
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 616
    .line 617
    .line 618
    const v0, 0x414f0a3d    # 12.94f

    .line 619
    .line 620
    .line 621
    const v2, 0x41991eb8    # 19.14f

    .line 622
    .line 623
    .line 624
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 625
    .line 626
    .line 627
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 628
    .line 629
    .line 630
    const/high16 v0, 0x41400000    # 12.0f

    .line 631
    .line 632
    const v2, 0x4179999a    # 15.6f

    .line 633
    .line 634
    .line 635
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 636
    .line 637
    .line 638
    const v17, -0x3f99999a    # -3.6f

    .line 639
    .line 640
    .line 641
    const v18, -0x3f99999a    # -3.6f

    .line 642
    .line 643
    .line 644
    const v13, -0x40028f5c    # -1.98f

    .line 645
    .line 646
    .line 647
    const/4 v14, 0x0

    .line 648
    const v15, -0x3f99999a    # -3.6f

    .line 649
    .line 650
    .line 651
    const v16, -0x4030a3d7    # -1.62f

    .line 652
    .line 653
    .line 654
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 655
    .line 656
    .line 657
    const v0, -0x3f99999a    # -3.6f

    .line 658
    .line 659
    .line 660
    const v2, 0x3fcf5c29    # 1.62f

    .line 661
    .line 662
    .line 663
    const v4, 0x40666666    # 3.6f

    .line 664
    .line 665
    .line 666
    invoke-virtual {v12, v2, v0, v4, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 667
    .line 668
    .line 669
    const v0, 0x3fcf5c29    # 1.62f

    .line 670
    .line 671
    .line 672
    const v2, 0x40666666    # 3.6f

    .line 673
    .line 674
    .line 675
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 676
    .line 677
    .line 678
    const v0, 0x415fae14    # 13.98f

    .line 679
    .line 680
    .line 681
    const/high16 v2, 0x41400000    # 12.0f

    .line 682
    .line 683
    const v4, 0x4179999a    # 15.6f

    .line 684
    .line 685
    .line 686
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 687
    .line 688
    .line 689
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 690
    .line 691
    .line 692
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 693
    .line 694
    .line 695
    move-result-object v2

    .line 696
    const/16 v16, 0x3800

    .line 697
    .line 698
    const/16 v17, 0x0

    .line 699
    .line 700
    const/high16 v6, 0x3f800000    # 1.0f

    .line 701
    .line 702
    const/high16 v8, 0x3f800000    # 1.0f

    .line 703
    .line 704
    const/4 v7, 0x0

    .line 705
    const/high16 v9, 0x3f800000    # 1.0f

    .line 706
    .line 707
    const/high16 v12, 0x3f800000    # 1.0f

    .line 708
    .line 709
    const/4 v13, 0x0

    .line 710
    const/4 v15, 0x0

    .line 711
    const-string v4, ""

    .line 712
    .line 713
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 714
    .line 715
    .line 716
    move-result-object v0

    .line 717
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 718
    .line 719
    .line 720
    move-result-object v0

    .line 721
    sput-object v0, Landroidx/compose/material/icons/filled/SettingsKt;->_settings:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 722
    .line 723
    invoke-static {v0}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 724
    .line 725
    .line 726
    return-object v0
.end method
