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
        "SMAP\nSettings.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Settings.kt\nandroidx/compose/material/icons/filled/SettingsKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,83:1\n122#2:84\n116#2,3:85\n119#2,3:89\n132#2,18:92\n152#2:129\n175#3:88\n694#4,2:110\n706#4,2:112\n708#4,11:118\n53#5,4:114\n*S KotlinDebug\n*F\n+ 1 Settings.kt\nandroidx/compose/material/icons/filled/SettingsKt\n*L\n29#1:84\n29#1:85,3\n29#1:89,3\n30#1:92,18\n30#1:129\n29#1:88\n30#1:110,2\n30#1:112,2\n30#1:118,11\n30#1:114,4\n*E\n"
    }
.end annotation


# static fields
.field private static _settings:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getSettings(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 30

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    move-object/from16 v1, p0

    .line 4
    .line 5
    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    sget-object v0, Landroidx/compose/material/icons/filled/SettingsKt;->_settings:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    return-object v0

    .line 16
    :cond_0
    const-string v2, "Filled.Settings"

    .line 17
    .line 18
    new-instance v1, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 19
    .line 20
    move-object v13, v1

    .line 21
    const/high16 v0, 0x41c00000    # 24.0f

    .line 22
    .line 23
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 28
    .line 29
    .line 30
    move-result v4

    .line 31
    const/high16 v5, 0x41c00000    # 24.0f

    .line 32
    .line 33
    const/high16 v6, 0x41c00000    # 24.0f

    .line 34
    .line 35
    const-wide/16 v7, 0x0

    .line 36
    .line 37
    const/4 v9, 0x0

    .line 38
    const/4 v10, 0x0

    .line 39
    const/16 v11, 0xe0

    .line 40
    .line 41
    const/4 v12, 0x0

    .line 42
    invoke-direct/range {v1 .. v12}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;-><init>(Ljava/lang/String;FFFFJIZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 43
    .line 44
    .line 45
    const/high16 v18, 0x3f800000    # 1.0f

    .line 46
    .line 47
    const/high16 v20, 0x3f800000    # 1.0f

    .line 48
    .line 49
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 50
    .line 51
    .line 52
    move-result v15

    .line 53
    new-instance v0, Landroidx/compose/ui/graphics/SolidColor;

    .line 54
    .line 55
    move-object/from16 v17, v0

    .line 56
    .line 57
    sget-object v1, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    .line 58
    .line 59
    invoke-virtual {v1}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 60
    .line 61
    .line 62
    move-result-wide v1

    .line 63
    const/4 v3, 0x0

    .line 64
    invoke-direct {v0, v1, v2, v3}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 65
    .line 66
    .line 67
    const/16 v19, 0x0

    .line 68
    .line 69
    const/high16 v21, 0x3f800000    # 1.0f

    .line 70
    .line 71
    sget-object v0, Landroidx/compose/ui/graphics/StrokeCap;->Companion:Landroidx/compose/ui/graphics/StrokeCap$Companion;

    .line 72
    .line 73
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 74
    .line 75
    .line 76
    move-result v22

    .line 77
    sget-object v0, Landroidx/compose/ui/graphics/StrokeJoin;->Companion:Landroidx/compose/ui/graphics/StrokeJoin$Companion;

    .line 78
    .line 79
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 80
    .line 81
    .line 82
    move-result v23

    .line 83
    const/high16 v24, 0x3f800000    # 1.0f

    .line 84
    .line 85
    const-string v16, ""

    .line 86
    .line 87
    new-instance v7, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 88
    .line 89
    invoke-direct {v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 90
    .line 91
    .line 92
    const v8, 0x41991eb8    # 19.14f

    .line 93
    .line 94
    .line 95
    const v9, 0x414f0a3d    # 12.94f

    .line 96
    .line 97
    .line 98
    invoke-virtual {v7, v8, v9}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 99
    .line 100
    .line 101
    const v1, 0x3d23d70a    # 0.04f

    .line 102
    .line 103
    .line 104
    const v2, -0x41666666    # -0.3f

    .line 105
    .line 106
    .line 107
    const v3, 0x3d75c28f    # 0.06f

    .line 108
    .line 109
    .line 110
    const v4, -0x40e3d70a    # -0.61f

    .line 111
    .line 112
    .line 113
    const v5, 0x3d75c28f    # 0.06f

    .line 114
    .line 115
    .line 116
    const v6, -0x408f5c29    # -0.94f

    .line 117
    .line 118
    .line 119
    move-object v0, v7

    .line 120
    invoke-virtual/range {v0 .. v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 121
    .line 122
    .line 123
    const/4 v1, 0x0

    .line 124
    const v2, -0x415c28f6    # -0.32f

    .line 125
    .line 126
    .line 127
    const v3, -0x435c28f6    # -0.02f

    .line 128
    .line 129
    .line 130
    const v4, -0x40dc28f6    # -0.64f

    .line 131
    .line 132
    .line 133
    const v5, -0x4270a3d7    # -0.07f

    .line 134
    .line 135
    .line 136
    invoke-virtual/range {v0 .. v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 137
    .line 138
    .line 139
    const v0, -0x4035c28f    # -1.58f

    .line 140
    .line 141
    .line 142
    const v10, 0x4001eb85    # 2.03f

    .line 143
    .line 144
    .line 145
    invoke-virtual {v7, v10, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 146
    .line 147
    .line 148
    const v1, 0x3e3851ec    # 0.18f

    .line 149
    .line 150
    .line 151
    const v2, -0x41f0a3d7    # -0.14f

    .line 152
    .line 153
    .line 154
    const v3, 0x3e6b851f    # 0.23f

    .line 155
    .line 156
    .line 157
    const v4, -0x412e147b    # -0.41f

    .line 158
    .line 159
    .line 160
    const v5, 0x3df5c28f    # 0.12f

    .line 161
    .line 162
    .line 163
    const v6, -0x40e3d70a    # -0.61f

    .line 164
    .line 165
    .line 166
    move-object v0, v7

    .line 167
    invoke-virtual/range {v0 .. v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 168
    .line 169
    .line 170
    const v0, -0x400a3d71    # -1.92f

    .line 171
    .line 172
    .line 173
    const v11, -0x3fab851f    # -3.32f

    .line 174
    .line 175
    .line 176
    invoke-virtual {v7, v0, v11}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 177
    .line 178
    .line 179
    const v1, -0x420a3d71    # -0.12f

    .line 180
    .line 181
    .line 182
    const v2, -0x419eb852    # -0.22f

    .line 183
    .line 184
    .line 185
    const v3, -0x41428f5c    # -0.37f

    .line 186
    .line 187
    .line 188
    const v4, -0x416b851f    # -0.29f

    .line 189
    .line 190
    .line 191
    const v5, -0x40e8f5c3    # -0.59f

    .line 192
    .line 193
    .line 194
    const v6, -0x419eb852    # -0.22f

    .line 195
    .line 196
    .line 197
    move-object v0, v7

    .line 198
    invoke-virtual/range {v0 .. v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 199
    .line 200
    .line 201
    const v0, -0x3fe70a3d    # -2.39f

    .line 202
    .line 203
    .line 204
    const v12, 0x3f75c28f    # 0.96f

    .line 205
    .line 206
    .line 207
    invoke-virtual {v7, v0, v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 208
    .line 209
    .line 210
    const/high16 v1, -0x41000000    # -0.5f

    .line 211
    .line 212
    const v2, -0x413d70a4    # -0.38f

    .line 213
    .line 214
    .line 215
    const v3, -0x407c28f6    # -1.03f

    .line 216
    .line 217
    .line 218
    const v4, -0x40cccccd    # -0.7f

    .line 219
    .line 220
    .line 221
    const v5, -0x4030a3d7    # -1.62f

    .line 222
    .line 223
    .line 224
    const v6, -0x408f5c29    # -0.94f

    .line 225
    .line 226
    .line 227
    move-object v0, v7

    .line 228
    invoke-virtual/range {v0 .. v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 229
    .line 230
    .line 231
    const v0, 0x41666666    # 14.4f

    .line 232
    .line 233
    .line 234
    const v1, 0x4033d70a    # 2.81f

    .line 235
    .line 236
    .line 237
    invoke-virtual {v7, v0, v1}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 238
    .line 239
    .line 240
    const v1, -0x42dc28f6    # -0.04f

    .line 241
    .line 242
    .line 243
    const v2, -0x418a3d71    # -0.24f

    .line 244
    .line 245
    .line 246
    const v3, -0x418a3d71    # -0.24f

    .line 247
    .line 248
    .line 249
    const v4, -0x412e147b    # -0.41f

    .line 250
    .line 251
    .line 252
    const v5, -0x410a3d71    # -0.48f

    .line 253
    .line 254
    .line 255
    const v6, -0x412e147b    # -0.41f

    .line 256
    .line 257
    .line 258
    move-object v0, v7

    .line 259
    invoke-virtual/range {v0 .. v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 260
    .line 261
    .line 262
    const v0, -0x3f8a3d71    # -3.84f

    .line 263
    .line 264
    .line 265
    invoke-virtual {v7, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 266
    .line 267
    .line 268
    const v1, -0x418a3d71    # -0.24f

    .line 269
    .line 270
    .line 271
    const/4 v2, 0x0

    .line 272
    const v3, -0x4123d70a    # -0.43f

    .line 273
    .line 274
    .line 275
    const v4, 0x3e2e147b    # 0.17f

    .line 276
    .line 277
    .line 278
    const v5, -0x410f5c29    # -0.47f

    .line 279
    .line 280
    .line 281
    const v6, 0x3ed1eb85    # 0.41f

    .line 282
    .line 283
    .line 284
    move-object v0, v7

    .line 285
    invoke-virtual/range {v0 .. v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 286
    .line 287
    .line 288
    const/high16 v0, 0x41140000    # 9.25f

    .line 289
    .line 290
    const v1, 0x40ab3333    # 5.35f

    .line 291
    .line 292
    .line 293
    invoke-virtual {v7, v0, v1}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 294
    .line 295
    .line 296
    const v1, 0x410a8f5c    # 8.66f

    .line 297
    .line 298
    .line 299
    const v2, 0x40b2e148    # 5.59f

    .line 300
    .line 301
    .line 302
    const v3, 0x4101eb85    # 8.12f

    .line 303
    .line 304
    .line 305
    const v4, 0x40bd70a4    # 5.92f

    .line 306
    .line 307
    .line 308
    const v5, 0x40f428f6    # 7.63f

    .line 309
    .line 310
    .line 311
    const v6, 0x40c947ae    # 6.29f

    .line 312
    .line 313
    .line 314
    move-object v0, v7

    .line 315
    invoke-virtual/range {v0 .. v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 316
    .line 317
    .line 318
    const v0, 0x40a7ae14    # 5.24f

    .line 319
    .line 320
    .line 321
    const v1, 0x40aa8f5c    # 5.33f

    .line 322
    .line 323
    .line 324
    invoke-virtual {v7, v0, v1}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 325
    .line 326
    .line 327
    const v1, -0x419eb852    # -0.22f

    .line 328
    .line 329
    .line 330
    const v2, -0x425c28f6    # -0.08f

    .line 331
    .line 332
    .line 333
    const v3, -0x410f5c29    # -0.47f

    .line 334
    .line 335
    .line 336
    const/4 v4, 0x0

    .line 337
    const v5, -0x40e8f5c3    # -0.59f

    .line 338
    .line 339
    .line 340
    const v6, 0x3e6147ae    # 0.22f

    .line 341
    .line 342
    .line 343
    move-object v0, v7

    .line 344
    invoke-virtual/range {v0 .. v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 345
    .line 346
    .line 347
    const v0, 0x402f5c29    # 2.74f

    .line 348
    .line 349
    .line 350
    const v1, 0x410deb85    # 8.87f

    .line 351
    .line 352
    .line 353
    invoke-virtual {v7, v0, v1}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 354
    .line 355
    .line 356
    const v1, 0x4027ae14    # 2.62f

    .line 357
    .line 358
    .line 359
    const v2, 0x411147ae    # 9.08f

    .line 360
    .line 361
    .line 362
    const v3, 0x402a3d71    # 2.66f

    .line 363
    .line 364
    .line 365
    const v4, 0x411570a4    # 9.34f

    .line 366
    .line 367
    .line 368
    const v5, 0x40370a3d    # 2.86f

    .line 369
    .line 370
    .line 371
    const v6, 0x4117ae14    # 9.48f

    .line 372
    .line 373
    .line 374
    move-object v0, v7

    .line 375
    invoke-virtual/range {v0 .. v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 376
    .line 377
    .line 378
    const v14, 0x3fca3d71    # 1.58f

    .line 379
    .line 380
    .line 381
    invoke-virtual {v7, v10, v14}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 382
    .line 383
    .line 384
    const v1, 0x409ae148    # 4.84f

    .line 385
    .line 386
    .line 387
    const v2, 0x4135c28f    # 11.36f

    .line 388
    .line 389
    .line 390
    const v3, 0x4099999a    # 4.8f

    .line 391
    .line 392
    .line 393
    const v4, 0x413b0a3d    # 11.69f

    .line 394
    .line 395
    .line 396
    const v5, 0x4099999a    # 4.8f

    .line 397
    .line 398
    .line 399
    const/high16 v6, 0x41400000    # 12.0f

    .line 400
    .line 401
    invoke-virtual/range {v0 .. v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 402
    .line 403
    .line 404
    const v0, 0x3d8f5c29    # 0.07f

    .line 405
    .line 406
    .line 407
    const v1, 0x3f70a3d7    # 0.94f

    .line 408
    .line 409
    .line 410
    const v2, 0x3ca3d70a    # 0.02f

    .line 411
    .line 412
    .line 413
    const v3, 0x3f23d70a    # 0.64f

    .line 414
    .line 415
    .line 416
    invoke-virtual {v7, v2, v3, v0, v1}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 417
    .line 418
    .line 419
    const v0, -0x3ffe147b    # -2.03f

    .line 420
    .line 421
    .line 422
    invoke-virtual {v7, v0, v14}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 423
    .line 424
    .line 425
    const v1, -0x41c7ae14    # -0.18f

    .line 426
    .line 427
    .line 428
    const v2, 0x3e0f5c29    # 0.14f

    .line 429
    .line 430
    .line 431
    const v3, -0x41947ae1    # -0.23f

    .line 432
    .line 433
    .line 434
    const v4, 0x3ed1eb85    # 0.41f

    .line 435
    .line 436
    .line 437
    const v5, -0x420a3d71    # -0.12f

    .line 438
    .line 439
    .line 440
    const v6, 0x3f1c28f6    # 0.61f

    .line 441
    .line 442
    .line 443
    move-object v0, v7

    .line 444
    invoke-virtual/range {v0 .. v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 445
    .line 446
    .line 447
    const v0, 0x40547ae1    # 3.32f

    .line 448
    .line 449
    .line 450
    const v10, 0x3ff5c28f    # 1.92f

    .line 451
    .line 452
    .line 453
    invoke-virtual {v7, v10, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 454
    .line 455
    .line 456
    const v1, 0x3df5c28f    # 0.12f

    .line 457
    .line 458
    .line 459
    const v2, 0x3e6147ae    # 0.22f

    .line 460
    .line 461
    .line 462
    const v3, 0x3ebd70a4    # 0.37f

    .line 463
    .line 464
    .line 465
    const v4, 0x3e947ae1    # 0.29f

    .line 466
    .line 467
    .line 468
    const v5, 0x3f170a3d    # 0.59f

    .line 469
    .line 470
    .line 471
    const v6, 0x3e6147ae    # 0.22f

    .line 472
    .line 473
    .line 474
    move-object v0, v7

    .line 475
    invoke-virtual/range {v0 .. v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 476
    .line 477
    .line 478
    const v0, -0x408a3d71    # -0.96f

    .line 479
    .line 480
    .line 481
    const v14, 0x4018f5c3    # 2.39f

    .line 482
    .line 483
    .line 484
    invoke-virtual {v7, v14, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 485
    .line 486
    .line 487
    const/high16 v1, 0x3f000000    # 0.5f

    .line 488
    .line 489
    const v2, 0x3ec28f5c    # 0.38f

    .line 490
    .line 491
    .line 492
    const v3, 0x3f83d70a    # 1.03f

    .line 493
    .line 494
    .line 495
    const v4, 0x3f333333    # 0.7f

    .line 496
    .line 497
    .line 498
    const v5, 0x3fcf5c29    # 1.62f

    .line 499
    .line 500
    .line 501
    const v6, 0x3f70a3d7    # 0.94f

    .line 502
    .line 503
    .line 504
    move-object v0, v7

    .line 505
    invoke-virtual/range {v0 .. v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 506
    .line 507
    .line 508
    const v0, 0x40228f5c    # 2.54f

    .line 509
    .line 510
    .line 511
    const v6, 0x3eb851ec    # 0.36f

    .line 512
    .line 513
    .line 514
    invoke-virtual {v7, v6, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 515
    .line 516
    .line 517
    const v1, 0x3d4ccccd    # 0.05f

    .line 518
    .line 519
    .line 520
    const v2, 0x3e75c28f    # 0.24f

    .line 521
    .line 522
    .line 523
    const v3, 0x3e75c28f    # 0.24f

    .line 524
    .line 525
    .line 526
    const v4, 0x3ed1eb85    # 0.41f

    .line 527
    .line 528
    .line 529
    const v5, 0x3ef5c28f    # 0.48f

    .line 530
    .line 531
    .line 532
    const v25, 0x3ed1eb85    # 0.41f

    .line 533
    .line 534
    .line 535
    move-object v0, v7

    .line 536
    move v8, v6

    .line 537
    move/from16 v6, v25

    .line 538
    .line 539
    invoke-virtual/range {v0 .. v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 540
    .line 541
    .line 542
    const v0, 0x4075c28f    # 3.84f

    .line 543
    .line 544
    .line 545
    invoke-virtual {v7, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 546
    .line 547
    .line 548
    const v1, 0x3e75c28f    # 0.24f

    .line 549
    .line 550
    .line 551
    const/4 v2, 0x0

    .line 552
    const v3, 0x3ee147ae    # 0.44f

    .line 553
    .line 554
    .line 555
    const v4, -0x41d1eb85    # -0.17f

    .line 556
    .line 557
    .line 558
    const v5, 0x3ef0a3d7    # 0.47f

    .line 559
    .line 560
    .line 561
    const v6, -0x412e147b    # -0.41f

    .line 562
    .line 563
    .line 564
    move-object v0, v7

    .line 565
    invoke-virtual/range {v0 .. v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 566
    .line 567
    .line 568
    const v0, -0x3fdd70a4    # -2.54f

    .line 569
    .line 570
    .line 571
    invoke-virtual {v7, v8, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 572
    .line 573
    .line 574
    const v1, 0x3f170a3d    # 0.59f

    .line 575
    .line 576
    .line 577
    const v2, -0x418a3d71    # -0.24f

    .line 578
    .line 579
    .line 580
    const v3, 0x3f90a3d7    # 1.13f

    .line 581
    .line 582
    .line 583
    const v4, -0x40f0a3d7    # -0.56f

    .line 584
    .line 585
    .line 586
    const v5, 0x3fcf5c29    # 1.62f

    .line 587
    .line 588
    .line 589
    const v6, -0x408f5c29    # -0.94f

    .line 590
    .line 591
    .line 592
    move-object v0, v7

    .line 593
    invoke-virtual/range {v0 .. v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 594
    .line 595
    .line 596
    invoke-virtual {v7, v14, v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 597
    .line 598
    .line 599
    const v1, 0x3e6147ae    # 0.22f

    .line 600
    .line 601
    .line 602
    const v2, 0x3da3d70a    # 0.08f

    .line 603
    .line 604
    .line 605
    const v3, 0x3ef0a3d7    # 0.47f

    .line 606
    .line 607
    .line 608
    const/4 v4, 0x0

    .line 609
    const v5, 0x3f170a3d    # 0.59f

    .line 610
    .line 611
    .line 612
    const v6, -0x419eb852    # -0.22f

    .line 613
    .line 614
    .line 615
    invoke-virtual/range {v0 .. v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 616
    .line 617
    .line 618
    invoke-virtual {v7, v10, v11}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 619
    .line 620
    .line 621
    const v1, 0x3df5c28f    # 0.12f

    .line 622
    .line 623
    .line 624
    const v2, -0x419eb852    # -0.22f

    .line 625
    .line 626
    .line 627
    const v3, 0x3d8f5c29    # 0.07f

    .line 628
    .line 629
    .line 630
    const v4, -0x410f5c29    # -0.47f

    .line 631
    .line 632
    .line 633
    const v5, -0x420a3d71    # -0.12f

    .line 634
    .line 635
    .line 636
    const v6, -0x40e3d70a    # -0.61f

    .line 637
    .line 638
    .line 639
    invoke-virtual/range {v0 .. v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 640
    .line 641
    .line 642
    const v0, 0x41991eb8    # 19.14f

    .line 643
    .line 644
    .line 645
    invoke-virtual {v7, v0, v9}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 646
    .line 647
    .line 648
    invoke-virtual {v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 649
    .line 650
    .line 651
    const/high16 v8, 0x41400000    # 12.0f

    .line 652
    .line 653
    const v9, 0x4179999a    # 15.6f

    .line 654
    .line 655
    .line 656
    invoke-virtual {v7, v8, v9}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 657
    .line 658
    .line 659
    const v1, -0x40028f5c    # -1.98f

    .line 660
    .line 661
    .line 662
    const/4 v2, 0x0

    .line 663
    const v3, -0x3f99999a    # -3.6f

    .line 664
    .line 665
    .line 666
    const v4, -0x4030a3d7    # -1.62f

    .line 667
    .line 668
    .line 669
    const v5, -0x3f99999a    # -3.6f

    .line 670
    .line 671
    .line 672
    const v6, -0x3f99999a    # -3.6f

    .line 673
    .line 674
    .line 675
    move-object v0, v7

    .line 676
    invoke-virtual/range {v0 .. v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 677
    .line 678
    .line 679
    const v0, 0x3fcf5c29    # 1.62f

    .line 680
    .line 681
    .line 682
    const v1, -0x3f99999a    # -3.6f

    .line 683
    .line 684
    .line 685
    const v2, 0x40666666    # 3.6f

    .line 686
    .line 687
    .line 688
    invoke-virtual {v7, v0, v1, v2, v1}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 689
    .line 690
    .line 691
    invoke-virtual {v7, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 692
    .line 693
    .line 694
    const v0, 0x415fae14    # 13.98f

    .line 695
    .line 696
    .line 697
    invoke-virtual {v7, v0, v9, v8, v9}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 698
    .line 699
    .line 700
    invoke-virtual {v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 701
    .line 702
    .line 703
    invoke-virtual {v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 704
    .line 705
    .line 706
    move-result-object v14

    .line 707
    const/16 v25, 0x0

    .line 708
    .line 709
    const/16 v26, 0x0

    .line 710
    .line 711
    const/16 v27, 0x0

    .line 712
    .line 713
    const/16 v28, 0x3800

    .line 714
    .line 715
    const/16 v29, 0x0

    .line 716
    .line 717
    invoke-static/range {v13 .. v29}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 718
    .line 719
    .line 720
    move-result-object v0

    .line 721
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 722
    .line 723
    .line 724
    move-result-object v0

    .line 725
    sput-object v0, Landroidx/compose/material/icons/filled/SettingsKt;->_settings:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 726
    .line 727
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 728
    .line 729
    .line 730
    return-object v0
.end method
