.class public final Landroidx/compose/material/icons/outlined/SettingsKt;
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
        "Landroidx/compose/material/icons/Icons$Outlined;",
        "getSettings",
        "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;",
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
        "SMAP\nSettings.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Settings.kt\nandroidx/compose/material/icons/outlined/SettingsKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,145:1\n122#2:146\n116#2,3:147\n119#2,3:151\n132#2,18:154\n152#2:191\n175#3:150\n694#4,2:172\n706#4,2:174\n708#4,11:180\n53#5,4:176\n*S KotlinDebug\n*F\n+ 1 Settings.kt\nandroidx/compose/material/icons/outlined/SettingsKt\n*L\n29#1:146\n29#1:147,3\n29#1:151,3\n30#1:154,18\n30#1:191\n29#1:150\n30#1:172,2\n30#1:174,2\n30#1:180,11\n30#1:176,4\n*E\n"
    }
.end annotation


# static fields
.field private static _settings:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getSettings(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;
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
    sget-object v0, Landroidx/compose/material/icons/outlined/SettingsKt;->_settings:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Outlined.Settings"

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
    const v0, 0x419b70a4    # 19.43f

    .line 93
    .line 94
    .line 95
    const v1, 0x414fae14    # 12.98f

    .line 96
    .line 97
    .line 98
    invoke-virtual {v7, v0, v1}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 99
    .line 100
    .line 101
    const v1, 0x3d23d70a    # 0.04f

    .line 102
    .line 103
    .line 104
    const v2, -0x415c28f6    # -0.32f

    .line 105
    .line 106
    .line 107
    const v3, 0x3d8f5c29    # 0.07f

    .line 108
    .line 109
    .line 110
    const v4, -0x40dc28f6    # -0.64f

    .line 111
    .line 112
    .line 113
    const v5, 0x3d8f5c29    # 0.07f

    .line 114
    .line 115
    .line 116
    const v6, -0x40851eb8    # -0.98f

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
    const v2, -0x4151eb85    # -0.34f

    .line 125
    .line 126
    .line 127
    const v3, -0x430a3d71    # -0.03f

    .line 128
    .line 129
    .line 130
    const v4, -0x40d70a3d    # -0.66f

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
    const v8, 0x40070a3d    # 2.11f

    .line 140
    .line 141
    .line 142
    const v9, -0x402ccccd    # -1.65f

    .line 143
    .line 144
    .line 145
    invoke-virtual {v7, v8, v9}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 146
    .line 147
    .line 148
    const v1, 0x3e428f5c    # 0.19f

    .line 149
    .line 150
    .line 151
    const v2, -0x41e66666    # -0.15f

    .line 152
    .line 153
    .line 154
    const v3, 0x3e75c28f    # 0.24f

    .line 155
    .line 156
    .line 157
    const v4, -0x4128f5c3    # -0.42f

    .line 158
    .line 159
    .line 160
    const v5, 0x3df5c28f    # 0.12f

    .line 161
    .line 162
    .line 163
    const v6, -0x40dc28f6    # -0.64f

    .line 164
    .line 165
    .line 166
    invoke-virtual/range {v0 .. v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 167
    .line 168
    .line 169
    const/high16 v10, -0x40000000    # -2.0f

    .line 170
    .line 171
    const v11, -0x3fa28f5c    # -3.46f

    .line 172
    .line 173
    .line 174
    invoke-virtual {v7, v10, v11}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 175
    .line 176
    .line 177
    const v1, -0x4247ae14    # -0.09f

    .line 178
    .line 179
    .line 180
    const v2, -0x41dc28f6    # -0.16f

    .line 181
    .line 182
    .line 183
    const v3, -0x417ae148    # -0.26f

    .line 184
    .line 185
    .line 186
    const/high16 v4, -0x41800000    # -0.25f

    .line 187
    .line 188
    const v5, -0x411eb852    # -0.44f

    .line 189
    .line 190
    .line 191
    const/high16 v6, -0x41800000    # -0.25f

    .line 192
    .line 193
    invoke-virtual/range {v0 .. v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 194
    .line 195
    .line 196
    const v1, -0x428a3d71    # -0.06f

    .line 197
    .line 198
    .line 199
    const/4 v2, 0x0

    .line 200
    const v3, -0x420a3d71    # -0.12f

    .line 201
    .line 202
    .line 203
    const v4, 0x3c23d70a    # 0.01f

    .line 204
    .line 205
    .line 206
    const v5, -0x41d1eb85    # -0.17f

    .line 207
    .line 208
    .line 209
    const v6, 0x3cf5c28f    # 0.03f

    .line 210
    .line 211
    .line 212
    invoke-virtual/range {v0 .. v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 213
    .line 214
    .line 215
    const v12, -0x3fe0a3d7    # -2.49f

    .line 216
    .line 217
    .line 218
    const/high16 v14, 0x3f800000    # 1.0f

    .line 219
    .line 220
    invoke-virtual {v7, v12, v14}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 221
    .line 222
    .line 223
    const v1, -0x40fae148    # -0.52f

    .line 224
    .line 225
    .line 226
    const v2, -0x41333333    # -0.4f

    .line 227
    .line 228
    .line 229
    const v3, -0x4075c28f    # -1.08f

    .line 230
    .line 231
    .line 232
    const v4, -0x40c51eb8    # -0.73f

    .line 233
    .line 234
    .line 235
    const v5, -0x4027ae14    # -1.69f

    .line 236
    .line 237
    .line 238
    const v6, -0x40851eb8    # -0.98f

    .line 239
    .line 240
    .line 241
    invoke-virtual/range {v0 .. v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 242
    .line 243
    .line 244
    const v6, -0x413d70a4    # -0.38f

    .line 245
    .line 246
    .line 247
    const v5, -0x3fd66666    # -2.65f

    .line 248
    .line 249
    .line 250
    invoke-virtual {v7, v6, v5}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 251
    .line 252
    .line 253
    const v1, 0x41675c29    # 14.46f

    .line 254
    .line 255
    .line 256
    const v2, 0x400b851f    # 2.18f

    .line 257
    .line 258
    .line 259
    const/high16 v3, 0x41640000    # 14.25f

    .line 260
    .line 261
    const/high16 v4, 0x40000000    # 2.0f

    .line 262
    .line 263
    const/high16 v25, 0x41600000    # 14.0f

    .line 264
    .line 265
    const/high16 v26, 0x40000000    # 2.0f

    .line 266
    .line 267
    move v9, v5

    .line 268
    move/from16 v5, v25

    .line 269
    .line 270
    move v11, v6

    .line 271
    move/from16 v6, v26

    .line 272
    .line 273
    invoke-virtual/range {v0 .. v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 274
    .line 275
    .line 276
    const/high16 v6, -0x3f800000    # -4.0f

    .line 277
    .line 278
    invoke-virtual {v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 279
    .line 280
    .line 281
    const/high16 v1, -0x41800000    # -0.25f

    .line 282
    .line 283
    const/4 v2, 0x0

    .line 284
    const v3, -0x41147ae1    # -0.46f

    .line 285
    .line 286
    .line 287
    const v4, 0x3e3851ec    # 0.18f

    .line 288
    .line 289
    .line 290
    const v5, -0x41051eb8    # -0.49f

    .line 291
    .line 292
    .line 293
    const v26, 0x3ed70a3d    # 0.42f

    .line 294
    .line 295
    .line 296
    move/from16 v6, v26

    .line 297
    .line 298
    invoke-virtual/range {v0 .. v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 299
    .line 300
    .line 301
    const v6, 0x4029999a    # 2.65f

    .line 302
    .line 303
    .line 304
    invoke-virtual {v7, v11, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 305
    .line 306
    .line 307
    const v1, -0x40e3d70a    # -0.61f

    .line 308
    .line 309
    .line 310
    const/high16 v2, 0x3e800000    # 0.25f

    .line 311
    .line 312
    const v3, -0x406a3d71    # -1.17f

    .line 313
    .line 314
    .line 315
    const v4, 0x3f170a3d    # 0.59f

    .line 316
    .line 317
    .line 318
    const v5, -0x4027ae14    # -1.69f

    .line 319
    .line 320
    .line 321
    const v11, 0x3f7ae148    # 0.98f

    .line 322
    .line 323
    .line 324
    move v14, v6

    .line 325
    move v6, v11

    .line 326
    invoke-virtual/range {v0 .. v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 327
    .line 328
    .line 329
    const/high16 v0, -0x40800000    # -1.0f

    .line 330
    .line 331
    invoke-virtual {v7, v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 332
    .line 333
    .line 334
    const v1, -0x428a3d71    # -0.06f

    .line 335
    .line 336
    .line 337
    const v2, -0x435c28f6    # -0.02f

    .line 338
    .line 339
    .line 340
    const v3, -0x420a3d71    # -0.12f

    .line 341
    .line 342
    .line 343
    const v4, -0x430a3d71    # -0.03f

    .line 344
    .line 345
    .line 346
    const v5, -0x41c7ae14    # -0.18f

    .line 347
    .line 348
    .line 349
    const v6, -0x430a3d71    # -0.03f

    .line 350
    .line 351
    .line 352
    move-object v0, v7

    .line 353
    invoke-virtual/range {v0 .. v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 354
    .line 355
    .line 356
    const v1, -0x41d1eb85    # -0.17f

    .line 357
    .line 358
    .line 359
    const/4 v2, 0x0

    .line 360
    const v3, -0x4151eb85    # -0.34f

    .line 361
    .line 362
    .line 363
    const v4, 0x3db851ec    # 0.09f

    .line 364
    .line 365
    .line 366
    const v5, -0x4123d70a    # -0.43f

    .line 367
    .line 368
    .line 369
    const/high16 v6, 0x3e800000    # 0.25f

    .line 370
    .line 371
    invoke-virtual/range {v0 .. v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 372
    .line 373
    .line 374
    const v0, 0x405d70a4    # 3.46f

    .line 375
    .line 376
    .line 377
    invoke-virtual {v7, v10, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 378
    .line 379
    .line 380
    const v1, -0x41fae148    # -0.13f

    .line 381
    .line 382
    .line 383
    const v2, 0x3e6147ae    # 0.22f

    .line 384
    .line 385
    .line 386
    const v3, -0x4270a3d7    # -0.07f

    .line 387
    .line 388
    .line 389
    const v4, 0x3efae148    # 0.49f

    .line 390
    .line 391
    .line 392
    const v5, 0x3df5c28f    # 0.12f

    .line 393
    .line 394
    .line 395
    const v6, 0x3f23d70a    # 0.64f

    .line 396
    .line 397
    .line 398
    move-object v0, v7

    .line 399
    invoke-virtual/range {v0 .. v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 400
    .line 401
    .line 402
    const v0, 0x3fd33333    # 1.65f

    .line 403
    .line 404
    .line 405
    invoke-virtual {v7, v8, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 406
    .line 407
    .line 408
    const v1, -0x42dc28f6    # -0.04f

    .line 409
    .line 410
    .line 411
    const v2, 0x3ea3d70a    # 0.32f

    .line 412
    .line 413
    .line 414
    const v4, 0x3f266666    # 0.65f

    .line 415
    .line 416
    .line 417
    const v5, -0x4270a3d7    # -0.07f

    .line 418
    .line 419
    .line 420
    const v6, 0x3f7ae148    # 0.98f

    .line 421
    .line 422
    .line 423
    move-object v0, v7

    .line 424
    invoke-virtual/range {v0 .. v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 425
    .line 426
    .line 427
    const/4 v1, 0x0

    .line 428
    const v2, 0x3ea8f5c3    # 0.33f

    .line 429
    .line 430
    .line 431
    const v3, 0x3cf5c28f    # 0.03f

    .line 432
    .line 433
    .line 434
    const v4, 0x3f28f5c3    # 0.66f

    .line 435
    .line 436
    .line 437
    const v5, 0x3d8f5c29    # 0.07f

    .line 438
    .line 439
    .line 440
    invoke-virtual/range {v0 .. v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 441
    .line 442
    .line 443
    const v0, -0x3ff8f5c3    # -2.11f

    .line 444
    .line 445
    .line 446
    const v1, 0x3fd33333    # 1.65f

    .line 447
    .line 448
    .line 449
    invoke-virtual {v7, v0, v1}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 450
    .line 451
    .line 452
    const v1, -0x41bd70a4    # -0.19f

    .line 453
    .line 454
    .line 455
    const v2, 0x3e19999a    # 0.15f

    .line 456
    .line 457
    .line 458
    const v3, -0x418a3d71    # -0.24f

    .line 459
    .line 460
    .line 461
    const v4, 0x3ed70a3d    # 0.42f

    .line 462
    .line 463
    .line 464
    const v5, -0x420a3d71    # -0.12f

    .line 465
    .line 466
    .line 467
    const v6, 0x3f23d70a    # 0.64f

    .line 468
    .line 469
    .line 470
    move-object v0, v7

    .line 471
    invoke-virtual/range {v0 .. v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 472
    .line 473
    .line 474
    const v0, 0x405d70a4    # 3.46f

    .line 475
    .line 476
    .line 477
    const/high16 v8, 0x40000000    # 2.0f

    .line 478
    .line 479
    invoke-virtual {v7, v8, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 480
    .line 481
    .line 482
    const v1, 0x3db851ec    # 0.09f

    .line 483
    .line 484
    .line 485
    const v2, 0x3e23d70a    # 0.16f

    .line 486
    .line 487
    .line 488
    const v3, 0x3e851eb8    # 0.26f

    .line 489
    .line 490
    .line 491
    const/high16 v4, 0x3e800000    # 0.25f

    .line 492
    .line 493
    const v5, 0x3ee147ae    # 0.44f

    .line 494
    .line 495
    .line 496
    const/high16 v6, 0x3e800000    # 0.25f

    .line 497
    .line 498
    move-object v0, v7

    .line 499
    invoke-virtual/range {v0 .. v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 500
    .line 501
    .line 502
    const v1, 0x3d75c28f    # 0.06f

    .line 503
    .line 504
    .line 505
    const/4 v2, 0x0

    .line 506
    const v3, 0x3df5c28f    # 0.12f

    .line 507
    .line 508
    .line 509
    const v4, -0x43dc28f6    # -0.01f

    .line 510
    .line 511
    .line 512
    const v5, 0x3e2e147b    # 0.17f

    .line 513
    .line 514
    .line 515
    const v6, -0x430a3d71    # -0.03f

    .line 516
    .line 517
    .line 518
    invoke-virtual/range {v0 .. v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 519
    .line 520
    .line 521
    const v0, 0x401f5c29    # 2.49f

    .line 522
    .line 523
    .line 524
    const/high16 v1, -0x40800000    # -1.0f

    .line 525
    .line 526
    invoke-virtual {v7, v0, v1}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 527
    .line 528
    .line 529
    const v1, 0x3f051eb8    # 0.52f

    .line 530
    .line 531
    .line 532
    const v2, 0x3ecccccd    # 0.4f

    .line 533
    .line 534
    .line 535
    const v3, 0x3f8a3d71    # 1.08f

    .line 536
    .line 537
    .line 538
    const v4, 0x3f3ae148    # 0.73f

    .line 539
    .line 540
    .line 541
    const v5, 0x3fd851ec    # 1.69f

    .line 542
    .line 543
    .line 544
    const v6, 0x3f7ae148    # 0.98f

    .line 545
    .line 546
    .line 547
    move-object v0, v7

    .line 548
    invoke-virtual/range {v0 .. v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 549
    .line 550
    .line 551
    const v0, 0x3ec28f5c    # 0.38f

    .line 552
    .line 553
    .line 554
    invoke-virtual {v7, v0, v14}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 555
    .line 556
    .line 557
    const v1, 0x3cf5c28f    # 0.03f

    .line 558
    .line 559
    .line 560
    const v2, 0x3e75c28f    # 0.24f

    .line 561
    .line 562
    .line 563
    const v3, 0x3e75c28f    # 0.24f

    .line 564
    .line 565
    .line 566
    const v4, 0x3ed70a3d    # 0.42f

    .line 567
    .line 568
    .line 569
    const v5, 0x3efae148    # 0.49f

    .line 570
    .line 571
    .line 572
    const v6, 0x3ed70a3d    # 0.42f

    .line 573
    .line 574
    .line 575
    move-object v0, v7

    .line 576
    invoke-virtual/range {v0 .. v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 577
    .line 578
    .line 579
    const/high16 v11, 0x40800000    # 4.0f

    .line 580
    .line 581
    invoke-virtual {v7, v11}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 582
    .line 583
    .line 584
    const/high16 v1, 0x3e800000    # 0.25f

    .line 585
    .line 586
    const/4 v2, 0x0

    .line 587
    const v3, 0x3eeb851f    # 0.46f

    .line 588
    .line 589
    .line 590
    const v4, -0x41c7ae14    # -0.18f

    .line 591
    .line 592
    .line 593
    const v6, -0x4128f5c3    # -0.42f

    .line 594
    .line 595
    .line 596
    invoke-virtual/range {v0 .. v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 597
    .line 598
    .line 599
    const v0, 0x3ec28f5c    # 0.38f

    .line 600
    .line 601
    .line 602
    invoke-virtual {v7, v0, v9}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 603
    .line 604
    .line 605
    const v1, 0x3f1c28f6    # 0.61f

    .line 606
    .line 607
    .line 608
    const/high16 v2, -0x41800000    # -0.25f

    .line 609
    .line 610
    const v3, 0x3f95c28f    # 1.17f

    .line 611
    .line 612
    .line 613
    const v4, -0x40e8f5c3    # -0.59f

    .line 614
    .line 615
    .line 616
    const v5, 0x3fd851ec    # 1.69f

    .line 617
    .line 618
    .line 619
    const v6, -0x40851eb8    # -0.98f

    .line 620
    .line 621
    .line 622
    move-object v0, v7

    .line 623
    invoke-virtual/range {v0 .. v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 624
    .line 625
    .line 626
    const v0, 0x401f5c29    # 2.49f

    .line 627
    .line 628
    .line 629
    const/high16 v1, 0x3f800000    # 1.0f

    .line 630
    .line 631
    invoke-virtual {v7, v0, v1}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 632
    .line 633
    .line 634
    const v1, 0x3d75c28f    # 0.06f

    .line 635
    .line 636
    .line 637
    const v2, 0x3ca3d70a    # 0.02f

    .line 638
    .line 639
    .line 640
    const v3, 0x3df5c28f    # 0.12f

    .line 641
    .line 642
    .line 643
    const v4, 0x3cf5c28f    # 0.03f

    .line 644
    .line 645
    .line 646
    const v5, 0x3e3851ec    # 0.18f

    .line 647
    .line 648
    .line 649
    const v6, 0x3cf5c28f    # 0.03f

    .line 650
    .line 651
    .line 652
    move-object v0, v7

    .line 653
    invoke-virtual/range {v0 .. v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 654
    .line 655
    .line 656
    const v1, 0x3e2e147b    # 0.17f

    .line 657
    .line 658
    .line 659
    const/4 v2, 0x0

    .line 660
    const v3, 0x3eae147b    # 0.34f

    .line 661
    .line 662
    .line 663
    const v4, -0x4247ae14    # -0.09f

    .line 664
    .line 665
    .line 666
    const v5, 0x3edc28f6    # 0.43f

    .line 667
    .line 668
    .line 669
    const/high16 v6, -0x41800000    # -0.25f

    .line 670
    .line 671
    invoke-virtual/range {v0 .. v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 672
    .line 673
    .line 674
    const v0, -0x3fa28f5c    # -3.46f

    .line 675
    .line 676
    .line 677
    invoke-virtual {v7, v8, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 678
    .line 679
    .line 680
    const v1, 0x3df5c28f    # 0.12f

    .line 681
    .line 682
    .line 683
    const v2, -0x419eb852    # -0.22f

    .line 684
    .line 685
    .line 686
    const v3, 0x3d8f5c29    # 0.07f

    .line 687
    .line 688
    .line 689
    const v4, -0x41051eb8    # -0.49f

    .line 690
    .line 691
    .line 692
    const v5, -0x420a3d71    # -0.12f

    .line 693
    .line 694
    .line 695
    const v6, -0x40dc28f6    # -0.64f

    .line 696
    .line 697
    .line 698
    move-object v0, v7

    .line 699
    invoke-virtual/range {v0 .. v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 700
    .line 701
    .line 702
    const v0, -0x3ff8f5c3    # -2.11f

    .line 703
    .line 704
    .line 705
    const v1, -0x402ccccd    # -1.65f

    .line 706
    .line 707
    .line 708
    invoke-virtual {v7, v0, v1}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 709
    .line 710
    .line 711
    invoke-virtual {v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 712
    .line 713
    .line 714
    const v0, 0x418b999a    # 17.45f

    .line 715
    .line 716
    .line 717
    const v1, 0x413451ec    # 11.27f

    .line 718
    .line 719
    .line 720
    invoke-virtual {v7, v0, v1}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 721
    .line 722
    .line 723
    const v1, 0x3d23d70a    # 0.04f

    .line 724
    .line 725
    .line 726
    const v2, 0x3e9eb852    # 0.31f

    .line 727
    .line 728
    .line 729
    const v3, 0x3d4ccccd    # 0.05f

    .line 730
    .line 731
    .line 732
    const v4, 0x3f051eb8    # 0.52f

    .line 733
    .line 734
    .line 735
    const v5, 0x3d4ccccd    # 0.05f

    .line 736
    .line 737
    .line 738
    const v6, 0x3f3ae148    # 0.73f

    .line 739
    .line 740
    .line 741
    move-object v0, v7

    .line 742
    invoke-virtual/range {v0 .. v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 743
    .line 744
    .line 745
    const/4 v1, 0x0

    .line 746
    const v2, 0x3e570a3d    # 0.21f

    .line 747
    .line 748
    .line 749
    const v3, -0x435c28f6    # -0.02f

    .line 750
    .line 751
    .line 752
    const v4, 0x3edc28f6    # 0.43f

    .line 753
    .line 754
    .line 755
    const v5, -0x42b33333    # -0.05f

    .line 756
    .line 757
    .line 758
    invoke-virtual/range {v0 .. v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 759
    .line 760
    .line 761
    const v0, -0x41f0a3d7    # -0.14f

    .line 762
    .line 763
    .line 764
    const v9, 0x3f90a3d7    # 1.13f

    .line 765
    .line 766
    .line 767
    invoke-virtual {v7, v0, v9}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 768
    .line 769
    .line 770
    const v0, 0x3f63d70a    # 0.89f

    .line 771
    .line 772
    .line 773
    const v12, 0x3f333333    # 0.7f

    .line 774
    .line 775
    .line 776
    invoke-virtual {v7, v0, v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 777
    .line 778
    .line 779
    const v0, 0x3f8a3d71    # 1.08f

    .line 780
    .line 781
    .line 782
    const v1, 0x3f570a3d    # 0.84f

    .line 783
    .line 784
    .line 785
    invoke-virtual {v7, v0, v1}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 786
    .line 787
    .line 788
    const v0, 0x3f9ae148    # 1.21f

    .line 789
    .line 790
    .line 791
    const v14, -0x40cccccd    # -0.7f

    .line 792
    .line 793
    .line 794
    invoke-virtual {v7, v14, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 795
    .line 796
    .line 797
    const v0, -0x405d70a4    # -1.27f

    .line 798
    .line 799
    .line 800
    const v1, -0x40fd70a4    # -0.51f

    .line 801
    .line 802
    .line 803
    invoke-virtual {v7, v0, v1}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 804
    .line 805
    .line 806
    const v0, -0x407ae148    # -1.04f

    .line 807
    .line 808
    .line 809
    const v1, -0x4128f5c3    # -0.42f

    .line 810
    .line 811
    .line 812
    invoke-virtual {v7, v0, v1}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 813
    .line 814
    .line 815
    const v0, -0x4099999a    # -0.9f

    .line 816
    .line 817
    .line 818
    const v1, 0x3f2e147b    # 0.68f

    .line 819
    .line 820
    .line 821
    invoke-virtual {v7, v0, v1}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 822
    .line 823
    .line 824
    const v1, -0x4123d70a    # -0.43f

    .line 825
    .line 826
    .line 827
    const v2, 0x3ea3d70a    # 0.32f

    .line 828
    .line 829
    .line 830
    const v3, -0x40a8f5c3    # -0.84f

    .line 831
    .line 832
    .line 833
    const v4, 0x3f0f5c29    # 0.56f

    .line 834
    .line 835
    .line 836
    const/high16 v5, -0x40600000    # -1.25f

    .line 837
    .line 838
    move-object v0, v7

    .line 839
    invoke-virtual/range {v0 .. v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 840
    .line 841
    .line 842
    const v6, -0x407851ec    # -1.06f

    .line 843
    .line 844
    .line 845
    const v5, 0x3edc28f6    # 0.43f

    .line 846
    .line 847
    .line 848
    invoke-virtual {v7, v6, v5}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 849
    .line 850
    .line 851
    const v0, -0x41dc28f6    # -0.16f

    .line 852
    .line 853
    .line 854
    invoke-virtual {v7, v0, v9}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 855
    .line 856
    .line 857
    const v0, -0x41b33333    # -0.2f

    .line 858
    .line 859
    .line 860
    const v1, 0x3faccccd    # 1.35f

    .line 861
    .line 862
    .line 863
    invoke-virtual {v7, v0, v1}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 864
    .line 865
    .line 866
    const v0, -0x404ccccd    # -1.4f

    .line 867
    .line 868
    .line 869
    invoke-virtual {v7, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 870
    .line 871
    .line 872
    const v0, -0x41bd70a4    # -0.19f

    .line 873
    .line 874
    .line 875
    const v1, -0x40533333    # -1.35f

    .line 876
    .line 877
    .line 878
    invoke-virtual {v7, v0, v1}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 879
    .line 880
    .line 881
    const v0, -0x41dc28f6    # -0.16f

    .line 882
    .line 883
    .line 884
    const v4, -0x406f5c29    # -1.13f

    .line 885
    .line 886
    .line 887
    invoke-virtual {v7, v0, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 888
    .line 889
    .line 890
    const v3, -0x4123d70a    # -0.43f

    .line 891
    .line 892
    .line 893
    invoke-virtual {v7, v6, v3}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 894
    .line 895
    .line 896
    const v1, -0x4123d70a    # -0.43f

    .line 897
    .line 898
    .line 899
    const v2, -0x41c7ae14    # -0.18f

    .line 900
    .line 901
    .line 902
    const v25, -0x40ab851f    # -0.83f

    .line 903
    .line 904
    .line 905
    const v26, -0x412e147b    # -0.41f

    .line 906
    .line 907
    .line 908
    const v27, -0x40628f5c    # -1.23f

    .line 909
    .line 910
    .line 911
    const v28, -0x40ca3d71    # -0.71f

    .line 912
    .line 913
    .line 914
    move-object v0, v7

    .line 915
    move v8, v3

    .line 916
    move/from16 v3, v25

    .line 917
    .line 918
    move v10, v4

    .line 919
    move/from16 v4, v26

    .line 920
    .line 921
    move v11, v5

    .line 922
    move/from16 v5, v27

    .line 923
    .line 924
    move v9, v6

    .line 925
    move/from16 v6, v28

    .line 926
    .line 927
    invoke-virtual/range {v0 .. v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 928
    .line 929
    .line 930
    const v0, -0x40970a3d    # -0.91f

    .line 931
    .line 932
    .line 933
    invoke-virtual {v7, v0, v14}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 934
    .line 935
    .line 936
    invoke-virtual {v7, v9, v11}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 937
    .line 938
    .line 939
    const v0, -0x405d70a4    # -1.27f

    .line 940
    .line 941
    .line 942
    const v1, 0x3f028f5c    # 0.51f

    .line 943
    .line 944
    .line 945
    invoke-virtual {v7, v0, v1}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 946
    .line 947
    .line 948
    const v0, -0x40651eb8    # -1.21f

    .line 949
    .line 950
    .line 951
    invoke-virtual {v7, v14, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 952
    .line 953
    .line 954
    const v0, 0x3f8a3d71    # 1.08f

    .line 955
    .line 956
    .line 957
    const v1, -0x40a8f5c3    # -0.84f

    .line 958
    .line 959
    .line 960
    invoke-virtual {v7, v0, v1}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 961
    .line 962
    .line 963
    const v0, 0x3f63d70a    # 0.89f

    .line 964
    .line 965
    .line 966
    invoke-virtual {v7, v0, v14}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 967
    .line 968
    .line 969
    const v0, -0x41f0a3d7    # -0.14f

    .line 970
    .line 971
    .line 972
    invoke-virtual {v7, v0, v10}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 973
    .line 974
    .line 975
    const v1, -0x430a3d71    # -0.03f

    .line 976
    .line 977
    .line 978
    const v2, -0x416147ae    # -0.31f

    .line 979
    .line 980
    .line 981
    const v3, -0x42b33333    # -0.05f

    .line 982
    .line 983
    .line 984
    const v4, -0x40f5c28f    # -0.54f

    .line 985
    .line 986
    .line 987
    const v5, -0x42b33333    # -0.05f

    .line 988
    .line 989
    .line 990
    const v6, -0x40c28f5c    # -0.74f

    .line 991
    .line 992
    .line 993
    move-object v0, v7

    .line 994
    invoke-virtual/range {v0 .. v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 995
    .line 996
    .line 997
    const v0, 0x3d4ccccd    # 0.05f

    .line 998
    .line 999
    .line 1000
    const v1, -0x40c51eb8    # -0.73f

    .line 1001
    .line 1002
    .line 1003
    const v2, 0x3ca3d70a    # 0.02f

    .line 1004
    .line 1005
    .line 1006
    invoke-virtual {v7, v2, v8, v0, v1}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1007
    .line 1008
    .line 1009
    const v0, 0x3e0f5c29    # 0.14f

    .line 1010
    .line 1011
    .line 1012
    invoke-virtual {v7, v0, v10}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1013
    .line 1014
    .line 1015
    const v0, -0x409c28f6    # -0.89f

    .line 1016
    .line 1017
    .line 1018
    invoke-virtual {v7, v0, v14}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1019
    .line 1020
    .line 1021
    const v0, -0x4075c28f    # -1.08f

    .line 1022
    .line 1023
    .line 1024
    const v1, -0x40a8f5c3    # -0.84f

    .line 1025
    .line 1026
    .line 1027
    invoke-virtual {v7, v0, v1}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1028
    .line 1029
    .line 1030
    const v0, -0x40651eb8    # -1.21f

    .line 1031
    .line 1032
    .line 1033
    invoke-virtual {v7, v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1034
    .line 1035
    .line 1036
    const v0, 0x3fa28f5c    # 1.27f

    .line 1037
    .line 1038
    .line 1039
    const v1, 0x3f028f5c    # 0.51f

    .line 1040
    .line 1041
    .line 1042
    invoke-virtual {v7, v0, v1}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1043
    .line 1044
    .line 1045
    const v0, 0x3f851eb8    # 1.04f

    .line 1046
    .line 1047
    .line 1048
    const v1, 0x3ed70a3d    # 0.42f

    .line 1049
    .line 1050
    .line 1051
    invoke-virtual {v7, v0, v1}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1052
    .line 1053
    .line 1054
    const v0, -0x40d1eb85    # -0.68f

    .line 1055
    .line 1056
    .line 1057
    const v9, 0x3f666666    # 0.9f

    .line 1058
    .line 1059
    .line 1060
    invoke-virtual {v7, v9, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1061
    .line 1062
    .line 1063
    const v1, 0x3edc28f6    # 0.43f

    .line 1064
    .line 1065
    .line 1066
    const v2, -0x415c28f6    # -0.32f

    .line 1067
    .line 1068
    .line 1069
    const v3, 0x3f570a3d    # 0.84f

    .line 1070
    .line 1071
    .line 1072
    const v4, -0x40f0a3d7    # -0.56f

    .line 1073
    .line 1074
    .line 1075
    const/high16 v5, 0x3fa00000    # 1.25f

    .line 1076
    .line 1077
    const v6, -0x40c51eb8    # -0.73f

    .line 1078
    .line 1079
    .line 1080
    move-object v0, v7

    .line 1081
    invoke-virtual/range {v0 .. v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1082
    .line 1083
    .line 1084
    const v14, 0x3f87ae14    # 1.06f

    .line 1085
    .line 1086
    .line 1087
    invoke-virtual {v7, v14, v8}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1088
    .line 1089
    .line 1090
    const v0, 0x3e23d70a    # 0.16f

    .line 1091
    .line 1092
    .line 1093
    invoke-virtual {v7, v0, v10}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1094
    .line 1095
    .line 1096
    const v0, 0x3e4ccccd    # 0.2f

    .line 1097
    .line 1098
    .line 1099
    const v1, -0x40533333    # -1.35f

    .line 1100
    .line 1101
    .line 1102
    invoke-virtual {v7, v0, v1}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1103
    .line 1104
    .line 1105
    const v0, 0x3fb1eb85    # 1.39f

    .line 1106
    .line 1107
    .line 1108
    invoke-virtual {v7, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1109
    .line 1110
    .line 1111
    const v0, 0x3e428f5c    # 0.19f

    .line 1112
    .line 1113
    .line 1114
    const v1, 0x3faccccd    # 1.35f

    .line 1115
    .line 1116
    .line 1117
    invoke-virtual {v7, v0, v1}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1118
    .line 1119
    .line 1120
    const v0, 0x3e23d70a    # 0.16f

    .line 1121
    .line 1122
    .line 1123
    const v1, 0x3f90a3d7    # 1.13f

    .line 1124
    .line 1125
    .line 1126
    invoke-virtual {v7, v0, v1}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1127
    .line 1128
    .line 1129
    invoke-virtual {v7, v14, v11}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1130
    .line 1131
    .line 1132
    const v1, 0x3edc28f6    # 0.43f

    .line 1133
    .line 1134
    .line 1135
    const v2, 0x3e3851ec    # 0.18f

    .line 1136
    .line 1137
    .line 1138
    const v3, 0x3f547ae1    # 0.83f

    .line 1139
    .line 1140
    .line 1141
    const v4, 0x3ed1eb85    # 0.41f

    .line 1142
    .line 1143
    .line 1144
    const v5, 0x3f9d70a4    # 1.23f

    .line 1145
    .line 1146
    .line 1147
    const v6, 0x3f35c28f    # 0.71f

    .line 1148
    .line 1149
    .line 1150
    move-object v0, v7

    .line 1151
    invoke-virtual/range {v0 .. v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1152
    .line 1153
    .line 1154
    const v0, 0x3f68f5c3    # 0.91f

    .line 1155
    .line 1156
    .line 1157
    invoke-virtual {v7, v0, v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1158
    .line 1159
    .line 1160
    invoke-virtual {v7, v14, v8}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1161
    .line 1162
    .line 1163
    const v0, 0x3fa28f5c    # 1.27f

    .line 1164
    .line 1165
    .line 1166
    const v1, -0x40fd70a4    # -0.51f

    .line 1167
    .line 1168
    .line 1169
    invoke-virtual {v7, v0, v1}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1170
    .line 1171
    .line 1172
    const v0, 0x3f9ae148    # 1.21f

    .line 1173
    .line 1174
    .line 1175
    invoke-virtual {v7, v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1176
    .line 1177
    .line 1178
    const v0, -0x40770a3d    # -1.07f

    .line 1179
    .line 1180
    .line 1181
    const v1, 0x3f59999a    # 0.85f

    .line 1182
    .line 1183
    .line 1184
    invoke-virtual {v7, v0, v1}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1185
    .line 1186
    .line 1187
    const v0, -0x409c28f6    # -0.89f

    .line 1188
    .line 1189
    .line 1190
    invoke-virtual {v7, v0, v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1191
    .line 1192
    .line 1193
    const v0, 0x3e0f5c29    # 0.14f

    .line 1194
    .line 1195
    .line 1196
    const v1, 0x3f90a3d7    # 1.13f

    .line 1197
    .line 1198
    .line 1199
    invoke-virtual {v7, v0, v1}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1200
    .line 1201
    .line 1202
    invoke-virtual {v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1203
    .line 1204
    .line 1205
    const/high16 v0, 0x41400000    # 12.0f

    .line 1206
    .line 1207
    const/high16 v1, 0x41000000    # 8.0f

    .line 1208
    .line 1209
    invoke-virtual {v7, v0, v1}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1210
    .line 1211
    .line 1212
    const v1, -0x3ff28f5c    # -2.21f

    .line 1213
    .line 1214
    .line 1215
    const/4 v2, 0x0

    .line 1216
    const/high16 v3, -0x3f800000    # -4.0f

    .line 1217
    .line 1218
    const v4, 0x3fe51eb8    # 1.79f

    .line 1219
    .line 1220
    .line 1221
    const/high16 v5, -0x3f800000    # -4.0f

    .line 1222
    .line 1223
    const/high16 v6, 0x40800000    # 4.0f

    .line 1224
    .line 1225
    move-object v0, v7

    .line 1226
    invoke-virtual/range {v0 .. v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1227
    .line 1228
    .line 1229
    const v0, 0x3fe51eb8    # 1.79f

    .line 1230
    .line 1231
    .line 1232
    const/high16 v1, 0x40800000    # 4.0f

    .line 1233
    .line 1234
    invoke-virtual {v7, v0, v1, v1, v1}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1235
    .line 1236
    .line 1237
    const v0, -0x401ae148    # -1.79f

    .line 1238
    .line 1239
    .line 1240
    const/high16 v2, -0x3f800000    # -4.0f

    .line 1241
    .line 1242
    invoke-virtual {v7, v1, v0, v1, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1243
    .line 1244
    .line 1245
    invoke-virtual {v7, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1246
    .line 1247
    .line 1248
    invoke-virtual {v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1249
    .line 1250
    .line 1251
    const/high16 v0, 0x41400000    # 12.0f

    .line 1252
    .line 1253
    const/high16 v1, 0x41600000    # 14.0f

    .line 1254
    .line 1255
    invoke-virtual {v7, v0, v1}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1256
    .line 1257
    .line 1258
    const v1, -0x40733333    # -1.1f

    .line 1259
    .line 1260
    .line 1261
    const/4 v2, 0x0

    .line 1262
    const/high16 v3, -0x40000000    # -2.0f

    .line 1263
    .line 1264
    const v4, -0x4099999a    # -0.9f

    .line 1265
    .line 1266
    .line 1267
    const/high16 v5, -0x40000000    # -2.0f

    .line 1268
    .line 1269
    const/high16 v6, -0x40000000    # -2.0f

    .line 1270
    .line 1271
    move-object v0, v7

    .line 1272
    invoke-virtual/range {v0 .. v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1273
    .line 1274
    .line 1275
    const/high16 v0, -0x40000000    # -2.0f

    .line 1276
    .line 1277
    const/high16 v1, 0x40000000    # 2.0f

    .line 1278
    .line 1279
    invoke-virtual {v7, v9, v0, v1, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1280
    .line 1281
    .line 1282
    invoke-virtual {v7, v1, v9, v1, v1}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1283
    .line 1284
    .line 1285
    const v2, -0x4099999a    # -0.9f

    .line 1286
    .line 1287
    .line 1288
    invoke-virtual {v7, v2, v1, v0, v1}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1289
    .line 1290
    .line 1291
    invoke-virtual {v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1292
    .line 1293
    .line 1294
    invoke-virtual {v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 1295
    .line 1296
    .line 1297
    move-result-object v14

    .line 1298
    const/16 v25, 0x0

    .line 1299
    .line 1300
    const/16 v26, 0x0

    .line 1301
    .line 1302
    const/16 v27, 0x0

    .line 1303
    .line 1304
    const/16 v28, 0x3800

    .line 1305
    .line 1306
    const/16 v29, 0x0

    .line 1307
    .line 1308
    invoke-static/range {v13 .. v29}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 1309
    .line 1310
    .line 1311
    move-result-object v0

    .line 1312
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1313
    .line 1314
    .line 1315
    move-result-object v0

    .line 1316
    sput-object v0, Landroidx/compose/material/icons/outlined/SettingsKt;->_settings:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1317
    .line 1318
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 1319
    .line 1320
    .line 1321
    return-object v0
.end method
