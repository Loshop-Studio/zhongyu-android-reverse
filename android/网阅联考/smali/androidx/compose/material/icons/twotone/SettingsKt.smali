.class public final Landroidx/compose/material/icons/twotone/SettingsKt;
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
        "Landroidx/compose/material/icons/Icons$TwoTone;",
        "getSettings",
        "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;",
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
        "SMAP\nSettings.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Settings.kt\nandroidx/compose/material/icons/twotone/SettingsKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,205:1\n122#2:206\n116#2,3:207\n119#2,3:211\n132#2,18:214\n152#2:251\n132#2,18:252\n152#2:289\n175#3:210\n694#4,2:232\n706#4,2:234\n708#4,11:240\n694#4,2:270\n706#4,2:272\n708#4,11:278\n53#5,4:236\n53#5,4:274\n*S KotlinDebug\n*F\n+ 1 Settings.kt\nandroidx/compose/material/icons/twotone/SettingsKt\n*L\n29#1:206\n29#1:207,3\n29#1:211,3\n30#1:214,18\n30#1:251\n90#1:252,18\n90#1:289\n29#1:210\n30#1:232,2\n30#1:234,2\n30#1:240,11\n90#1:270,2\n90#1:272,2\n90#1:278,11\n30#1:236,4\n90#1:274,4\n*E\n"
    }
.end annotation


# static fields
.field private static _settings:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getSettings(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 47

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
    sget-object v0, Landroidx/compose/material/icons/twotone/SettingsKt;->_settings:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.Settings"

    .line 17
    .line 18
    new-instance v1, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 19
    .line 20
    move-object/from16 v30, v1

    .line 21
    .line 22
    move-object v13, v1

    .line 23
    const/high16 v0, 0x41c00000    # 24.0f

    .line 24
    .line 25
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 30
    .line 31
    .line 32
    move-result v4

    .line 33
    const/high16 v5, 0x41c00000    # 24.0f

    .line 34
    .line 35
    const/high16 v6, 0x41c00000    # 24.0f

    .line 36
    .line 37
    const-wide/16 v7, 0x0

    .line 38
    .line 39
    const/4 v9, 0x0

    .line 40
    const/4 v10, 0x0

    .line 41
    const/16 v11, 0xe0

    .line 42
    .line 43
    const/4 v12, 0x0

    .line 44
    invoke-direct/range {v1 .. v12}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;-><init>(Ljava/lang/String;FFFFJIZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 45
    .line 46
    .line 47
    const v18, 0x3e99999a    # 0.3f

    .line 48
    .line 49
    .line 50
    const v20, 0x3e99999a    # 0.3f

    .line 51
    .line 52
    .line 53
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 54
    .line 55
    .line 56
    move-result v15

    .line 57
    new-instance v0, Landroidx/compose/ui/graphics/SolidColor;

    .line 58
    .line 59
    move-object/from16 v17, v0

    .line 60
    .line 61
    sget-object v1, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    .line 62
    .line 63
    invoke-virtual {v1}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 64
    .line 65
    .line 66
    move-result-wide v2

    .line 67
    const/4 v4, 0x0

    .line 68
    invoke-direct {v0, v2, v3, v4}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 69
    .line 70
    .line 71
    const/16 v19, 0x0

    .line 72
    .line 73
    const/high16 v21, 0x3f800000    # 1.0f

    .line 74
    .line 75
    sget-object v0, Landroidx/compose/ui/graphics/StrokeCap;->Companion:Landroidx/compose/ui/graphics/StrokeCap$Companion;

    .line 76
    .line 77
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 78
    .line 79
    .line 80
    move-result v22

    .line 81
    sget-object v2, Landroidx/compose/ui/graphics/StrokeJoin;->Companion:Landroidx/compose/ui/graphics/StrokeJoin$Companion;

    .line 82
    .line 83
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 84
    .line 85
    .line 86
    move-result v23

    .line 87
    const/high16 v24, 0x3f800000    # 1.0f

    .line 88
    .line 89
    const-string v16, ""

    .line 90
    .line 91
    new-instance v10, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 92
    .line 93
    invoke-direct {v10}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 94
    .line 95
    .line 96
    const v3, 0x419a3d71    # 19.28f

    .line 97
    .line 98
    .line 99
    const v4, 0x4109999a    # 8.6f

    .line 100
    .line 101
    .line 102
    invoke-virtual {v10, v3, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 103
    .line 104
    .line 105
    const v11, -0x40cccccd    # -0.7f

    .line 106
    .line 107
    .line 108
    const v12, -0x40651eb8    # -1.21f

    .line 109
    .line 110
    .line 111
    invoke-virtual {v10, v11, v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 112
    .line 113
    .line 114
    const v14, -0x405d70a4    # -1.27f

    .line 115
    .line 116
    .line 117
    const v9, 0x3f028f5c    # 0.51f

    .line 118
    .line 119
    .line 120
    invoke-virtual {v10, v14, v9}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 121
    .line 122
    .line 123
    const v8, -0x407851ec    # -1.06f

    .line 124
    .line 125
    .line 126
    const v7, 0x3edc28f6    # 0.43f

    .line 127
    .line 128
    .line 129
    invoke-virtual {v10, v8, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 130
    .line 131
    .line 132
    const v3, -0x40970a3d    # -0.91f

    .line 133
    .line 134
    .line 135
    invoke-virtual {v10, v3, v11}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 136
    .line 137
    .line 138
    const v4, -0x413851ec    # -0.39f

    .line 139
    .line 140
    .line 141
    const v5, -0x41666666    # -0.3f

    .line 142
    .line 143
    .line 144
    const v6, -0x40b33333    # -0.8f

    .line 145
    .line 146
    .line 147
    const v25, -0x40f5c28f    # -0.54f

    .line 148
    .line 149
    .line 150
    const v26, -0x40628f5c    # -1.23f

    .line 151
    .line 152
    .line 153
    const v27, -0x40ca3d71    # -0.71f

    .line 154
    .line 155
    .line 156
    move-object v3, v10

    .line 157
    move v12, v7

    .line 158
    move/from16 v7, v25

    .line 159
    .line 160
    move v12, v8

    .line 161
    move/from16 v8, v26

    .line 162
    .line 163
    move/from16 v9, v27

    .line 164
    .line 165
    invoke-virtual/range {v3 .. v9}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 166
    .line 167
    .line 168
    const v9, -0x4123d70a    # -0.43f

    .line 169
    .line 170
    .line 171
    invoke-virtual {v10, v12, v9}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 172
    .line 173
    .line 174
    const v8, -0x41dc28f6    # -0.16f

    .line 175
    .line 176
    .line 177
    const v7, -0x406f5c29    # -1.13f

    .line 178
    .line 179
    .line 180
    invoke-virtual {v10, v8, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 181
    .line 182
    .line 183
    const v3, 0x414b3333    # 12.7f

    .line 184
    .line 185
    .line 186
    const/high16 v6, 0x40800000    # 4.0f

    .line 187
    .line 188
    invoke-virtual {v10, v3, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 189
    .line 190
    .line 191
    const v3, -0x404ccccd    # -1.4f

    .line 192
    .line 193
    .line 194
    invoke-virtual {v10, v3}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 195
    .line 196
    .line 197
    const v3, -0x41bd70a4    # -0.19f

    .line 198
    .line 199
    .line 200
    const v4, 0x3faccccd    # 1.35f

    .line 201
    .line 202
    .line 203
    invoke-virtual {v10, v3, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 204
    .line 205
    .line 206
    const v5, 0x3f90a3d7    # 1.13f

    .line 207
    .line 208
    .line 209
    invoke-virtual {v10, v8, v5}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 210
    .line 211
    .line 212
    const v3, 0x3ee147ae    # 0.44f

    .line 213
    .line 214
    .line 215
    invoke-virtual {v10, v12, v3}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 216
    .line 217
    .line 218
    const v4, -0x412e147b    # -0.41f

    .line 219
    .line 220
    .line 221
    const v25, 0x3e2e147b    # 0.17f

    .line 222
    .line 223
    .line 224
    const v26, -0x40ae147b    # -0.82f

    .line 225
    .line 226
    .line 227
    const v27, 0x3ed1eb85    # 0.41f

    .line 228
    .line 229
    .line 230
    const/high16 v28, -0x40600000    # -1.25f

    .line 231
    .line 232
    const v29, 0x3f3ae148    # 0.73f

    .line 233
    .line 234
    .line 235
    move-object v3, v10

    .line 236
    move v12, v5

    .line 237
    move/from16 v5, v25

    .line 238
    .line 239
    move/from16 v6, v26

    .line 240
    .line 241
    move/from16 v7, v27

    .line 242
    .line 243
    move/from16 v8, v28

    .line 244
    .line 245
    move/from16 v9, v29

    .line 246
    .line 247
    invoke-virtual/range {v3 .. v9}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 248
    .line 249
    .line 250
    const v3, -0x4099999a    # -0.9f

    .line 251
    .line 252
    .line 253
    const v4, 0x3f2e147b    # 0.68f

    .line 254
    .line 255
    .line 256
    invoke-virtual {v10, v3, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 257
    .line 258
    .line 259
    const v3, -0x4079999a    # -1.05f

    .line 260
    .line 261
    .line 262
    const v4, -0x4128f5c3    # -0.42f

    .line 263
    .line 264
    .line 265
    invoke-virtual {v10, v3, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 266
    .line 267
    .line 268
    const v3, -0x40fae148    # -0.52f

    .line 269
    .line 270
    .line 271
    invoke-virtual {v10, v14, v3}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 272
    .line 273
    .line 274
    const v9, 0x3f9ae148    # 1.21f

    .line 275
    .line 276
    .line 277
    invoke-virtual {v10, v11, v9}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 278
    .line 279
    .line 280
    const v3, 0x3f8a3d71    # 1.08f

    .line 281
    .line 282
    .line 283
    const v4, 0x3f570a3d    # 0.84f

    .line 284
    .line 285
    .line 286
    invoke-virtual {v10, v3, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 287
    .line 288
    .line 289
    const v8, 0x3f63d70a    # 0.89f

    .line 290
    .line 291
    .line 292
    const v7, 0x3f333333    # 0.7f

    .line 293
    .line 294
    .line 295
    invoke-virtual {v10, v8, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 296
    .line 297
    .line 298
    const v6, -0x41f0a3d7    # -0.14f

    .line 299
    .line 300
    .line 301
    invoke-virtual {v10, v6, v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 302
    .line 303
    .line 304
    const v4, -0x430a3d71    # -0.03f

    .line 305
    .line 306
    .line 307
    const v5, 0x3e99999a    # 0.3f

    .line 308
    .line 309
    .line 310
    const v25, -0x42b33333    # -0.05f

    .line 311
    .line 312
    .line 313
    const v26, 0x3f07ae14    # 0.53f

    .line 314
    .line 315
    .line 316
    const v27, -0x42b33333    # -0.05f

    .line 317
    .line 318
    .line 319
    const v28, 0x3f3ae148    # 0.73f

    .line 320
    .line 321
    .line 322
    move-object v3, v10

    .line 323
    move/from16 v6, v25

    .line 324
    .line 325
    move v11, v7

    .line 326
    move/from16 v7, v26

    .line 327
    .line 328
    move/from16 v8, v27

    .line 329
    .line 330
    move/from16 v9, v28

    .line 331
    .line 332
    invoke-virtual/range {v3 .. v9}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 333
    .line 334
    .line 335
    const v3, 0x3d4ccccd    # 0.05f

    .line 336
    .line 337
    .line 338
    const v4, 0x3f3ae148    # 0.73f

    .line 339
    .line 340
    .line 341
    const v5, 0x3ca3d70a    # 0.02f

    .line 342
    .line 343
    .line 344
    const v6, 0x3edc28f6    # 0.43f

    .line 345
    .line 346
    .line 347
    invoke-virtual {v10, v5, v6, v3, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 348
    .line 349
    .line 350
    const v9, 0x3e0f5c29    # 0.14f

    .line 351
    .line 352
    .line 353
    invoke-virtual {v10, v9, v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 354
    .line 355
    .line 356
    const v8, -0x409c28f6    # -0.89f

    .line 357
    .line 358
    .line 359
    invoke-virtual {v10, v8, v11}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 360
    .line 361
    .line 362
    const v3, -0x4075c28f    # -1.08f

    .line 363
    .line 364
    .line 365
    const v4, 0x3f570a3d    # 0.84f

    .line 366
    .line 367
    .line 368
    invoke-virtual {v10, v3, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 369
    .line 370
    .line 371
    const v7, 0x3f9ae148    # 1.21f

    .line 372
    .line 373
    .line 374
    invoke-virtual {v10, v11, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 375
    .line 376
    .line 377
    const v3, -0x40fd70a4    # -0.51f

    .line 378
    .line 379
    .line 380
    const v6, 0x3fa28f5c    # 1.27f

    .line 381
    .line 382
    .line 383
    invoke-virtual {v10, v6, v3}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 384
    .line 385
    .line 386
    const v5, 0x3f87ae14    # 1.06f

    .line 387
    .line 388
    .line 389
    const v4, -0x4123d70a    # -0.43f

    .line 390
    .line 391
    .line 392
    invoke-virtual {v10, v5, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 393
    .line 394
    .line 395
    const v3, 0x3f68f5c3    # 0.91f

    .line 396
    .line 397
    .line 398
    invoke-virtual {v10, v3, v11}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 399
    .line 400
    .line 401
    const v25, 0x3ec7ae14    # 0.39f

    .line 402
    .line 403
    .line 404
    const v26, 0x3e99999a    # 0.3f

    .line 405
    .line 406
    .line 407
    const v27, 0x3f4ccccd    # 0.8f

    .line 408
    .line 409
    .line 410
    const v28, 0x3f0a3d71    # 0.54f

    .line 411
    .line 412
    .line 413
    const v29, 0x3f9d70a4    # 1.23f

    .line 414
    .line 415
    .line 416
    const v32, 0x3f35c28f    # 0.71f

    .line 417
    .line 418
    .line 419
    move-object v3, v10

    .line 420
    move v11, v4

    .line 421
    move/from16 v4, v25

    .line 422
    .line 423
    move v11, v5

    .line 424
    move/from16 v5, v26

    .line 425
    .line 426
    move/from16 v6, v27

    .line 427
    .line 428
    move/from16 v7, v28

    .line 429
    .line 430
    move/from16 v8, v29

    .line 431
    .line 432
    move/from16 v9, v32

    .line 433
    .line 434
    invoke-virtual/range {v3 .. v9}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 435
    .line 436
    .line 437
    const v3, 0x3edc28f6    # 0.43f

    .line 438
    .line 439
    .line 440
    invoke-virtual {v10, v11, v3}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 441
    .line 442
    .line 443
    const v3, 0x3e23d70a    # 0.16f

    .line 444
    .line 445
    .line 446
    invoke-virtual {v10, v3, v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 447
    .line 448
    .line 449
    const v3, 0x3e428f5c    # 0.19f

    .line 450
    .line 451
    .line 452
    const v4, 0x3fae147b    # 1.36f

    .line 453
    .line 454
    .line 455
    invoke-virtual {v10, v3, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 456
    .line 457
    .line 458
    const v3, 0x3fb1eb85    # 1.39f

    .line 459
    .line 460
    .line 461
    invoke-virtual {v10, v3}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 462
    .line 463
    .line 464
    const v3, 0x3e428f5c    # 0.19f

    .line 465
    .line 466
    .line 467
    const v4, -0x40533333    # -1.35f

    .line 468
    .line 469
    .line 470
    invoke-virtual {v10, v3, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 471
    .line 472
    .line 473
    const v3, 0x3e23d70a    # 0.16f

    .line 474
    .line 475
    .line 476
    const v9, -0x406f5c29    # -1.13f

    .line 477
    .line 478
    .line 479
    invoke-virtual {v10, v3, v9}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 480
    .line 481
    .line 482
    const v3, -0x4123d70a    # -0.43f

    .line 483
    .line 484
    .line 485
    invoke-virtual {v10, v11, v3}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 486
    .line 487
    .line 488
    const v4, 0x3ed1eb85    # 0.41f

    .line 489
    .line 490
    .line 491
    const v5, -0x41d1eb85    # -0.17f

    .line 492
    .line 493
    .line 494
    const v6, 0x3f51eb85    # 0.82f

    .line 495
    .line 496
    .line 497
    const v7, -0x412e147b    # -0.41f

    .line 498
    .line 499
    .line 500
    const/high16 v8, 0x3fa00000    # 1.25f

    .line 501
    .line 502
    const v25, -0x40c51eb8    # -0.73f

    .line 503
    .line 504
    .line 505
    move-object v3, v10

    .line 506
    move v11, v9

    .line 507
    move/from16 v9, v25

    .line 508
    .line 509
    invoke-virtual/range {v3 .. v9}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 510
    .line 511
    .line 512
    const v3, 0x3f666666    # 0.9f

    .line 513
    .line 514
    .line 515
    const v4, -0x40d1eb85    # -0.68f

    .line 516
    .line 517
    .line 518
    invoke-virtual {v10, v3, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 519
    .line 520
    .line 521
    const v3, 0x3f851eb8    # 1.04f

    .line 522
    .line 523
    .line 524
    const v4, 0x3ed70a3d    # 0.42f

    .line 525
    .line 526
    .line 527
    invoke-virtual {v10, v3, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 528
    .line 529
    .line 530
    const v8, 0x3f028f5c    # 0.51f

    .line 531
    .line 532
    .line 533
    const v9, 0x3fa28f5c    # 1.27f

    .line 534
    .line 535
    .line 536
    invoke-virtual {v10, v9, v8}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 537
    .line 538
    .line 539
    const v3, -0x40651eb8    # -1.21f

    .line 540
    .line 541
    .line 542
    const v4, 0x3f333333    # 0.7f

    .line 543
    .line 544
    .line 545
    invoke-virtual {v10, v4, v3}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 546
    .line 547
    .line 548
    const v3, -0x4075c28f    # -1.08f

    .line 549
    .line 550
    .line 551
    const v4, -0x40a8f5c3    # -0.84f

    .line 552
    .line 553
    .line 554
    invoke-virtual {v10, v3, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 555
    .line 556
    .line 557
    const v3, -0x40cccccd    # -0.7f

    .line 558
    .line 559
    .line 560
    const v7, -0x409c28f6    # -0.89f

    .line 561
    .line 562
    .line 563
    invoke-virtual {v10, v7, v3}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 564
    .line 565
    .line 566
    const v6, 0x3e0f5c29    # 0.14f

    .line 567
    .line 568
    .line 569
    invoke-virtual {v10, v6, v11}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 570
    .line 571
    .line 572
    const v4, 0x3d23d70a    # 0.04f

    .line 573
    .line 574
    .line 575
    const v5, -0x416147ae    # -0.31f

    .line 576
    .line 577
    .line 578
    const v25, 0x3d4ccccd    # 0.05f

    .line 579
    .line 580
    .line 581
    const v26, -0x40fae148    # -0.52f

    .line 582
    .line 583
    .line 584
    const v27, 0x3d4ccccd    # 0.05f

    .line 585
    .line 586
    .line 587
    const v28, -0x40c51eb8    # -0.73f

    .line 588
    .line 589
    .line 590
    move-object v3, v10

    .line 591
    move/from16 v6, v25

    .line 592
    .line 593
    move/from16 v7, v26

    .line 594
    .line 595
    move/from16 v8, v27

    .line 596
    .line 597
    move/from16 v9, v28

    .line 598
    .line 599
    invoke-virtual/range {v3 .. v9}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 600
    .line 601
    .line 602
    const/4 v4, 0x0

    .line 603
    const v5, -0x41a8f5c3    # -0.21f

    .line 604
    .line 605
    .line 606
    const v6, -0x435c28f6    # -0.02f

    .line 607
    .line 608
    .line 609
    const v7, -0x4123d70a    # -0.43f

    .line 610
    .line 611
    .line 612
    const v8, -0x42b33333    # -0.05f

    .line 613
    .line 614
    .line 615
    const v9, -0x40c51eb8    # -0.73f

    .line 616
    .line 617
    .line 618
    invoke-virtual/range {v3 .. v9}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 619
    .line 620
    .line 621
    const v9, -0x41f0a3d7    # -0.14f

    .line 622
    .line 623
    .line 624
    invoke-virtual {v10, v9, v11}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 625
    .line 626
    .line 627
    const v3, -0x40cccccd    # -0.7f

    .line 628
    .line 629
    .line 630
    const v8, 0x3f63d70a    # 0.89f

    .line 631
    .line 632
    .line 633
    invoke-virtual {v10, v8, v3}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 634
    .line 635
    .line 636
    const v3, 0x3f8ccccd    # 1.1f

    .line 637
    .line 638
    .line 639
    const v4, -0x40a8f5c3    # -0.84f

    .line 640
    .line 641
    .line 642
    invoke-virtual {v10, v3, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 643
    .line 644
    .line 645
    invoke-virtual {v10}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 646
    .line 647
    .line 648
    const/high16 v3, 0x41400000    # 12.0f

    .line 649
    .line 650
    const/high16 v4, 0x41800000    # 16.0f

    .line 651
    .line 652
    invoke-virtual {v10, v3, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 653
    .line 654
    .line 655
    const v4, -0x3ff28f5c    # -2.21f

    .line 656
    .line 657
    .line 658
    const/4 v5, 0x0

    .line 659
    const/high16 v6, -0x3f800000    # -4.0f

    .line 660
    .line 661
    const v7, -0x401ae148    # -1.79f

    .line 662
    .line 663
    .line 664
    const/high16 v25, -0x3f800000    # -4.0f

    .line 665
    .line 666
    const/high16 v26, -0x3f800000    # -4.0f

    .line 667
    .line 668
    move-object v3, v10

    .line 669
    move v11, v8

    .line 670
    move/from16 v8, v25

    .line 671
    .line 672
    move v11, v9

    .line 673
    move/from16 v9, v26

    .line 674
    .line 675
    invoke-virtual/range {v3 .. v9}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 676
    .line 677
    .line 678
    const v3, 0x3fe51eb8    # 1.79f

    .line 679
    .line 680
    .line 681
    const/high16 v4, -0x3f800000    # -4.0f

    .line 682
    .line 683
    const/high16 v5, 0x40800000    # 4.0f

    .line 684
    .line 685
    invoke-virtual {v10, v3, v4, v5, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 686
    .line 687
    .line 688
    invoke-virtual {v10, v5, v3, v5, v5}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 689
    .line 690
    .line 691
    const v3, -0x401ae148    # -1.79f

    .line 692
    .line 693
    .line 694
    invoke-virtual {v10, v3, v5, v4, v5}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 695
    .line 696
    .line 697
    invoke-virtual {v10}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 698
    .line 699
    .line 700
    invoke-virtual {v10}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 701
    .line 702
    .line 703
    move-result-object v3

    .line 704
    move v6, v14

    .line 705
    move-object v14, v3

    .line 706
    const/16 v25, 0x0

    .line 707
    .line 708
    const/16 v26, 0x0

    .line 709
    .line 710
    const/16 v27, 0x0

    .line 711
    .line 712
    const/16 v28, 0x3800

    .line 713
    .line 714
    const/16 v29, 0x0

    .line 715
    .line 716
    invoke-static/range {v13 .. v29}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 717
    .line 718
    .line 719
    const/high16 v35, 0x3f800000    # 1.0f

    .line 720
    .line 721
    const/high16 v37, 0x3f800000    # 1.0f

    .line 722
    .line 723
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 724
    .line 725
    .line 726
    move-result v32

    .line 727
    new-instance v3, Landroidx/compose/ui/graphics/SolidColor;

    .line 728
    .line 729
    move-object/from16 v34, v3

    .line 730
    .line 731
    invoke-virtual {v1}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 732
    .line 733
    .line 734
    move-result-wide v7

    .line 735
    const/4 v1, 0x0

    .line 736
    invoke-direct {v3, v7, v8, v1}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 737
    .line 738
    .line 739
    const/16 v36, 0x0

    .line 740
    .line 741
    const/high16 v38, 0x3f800000    # 1.0f

    .line 742
    .line 743
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 744
    .line 745
    .line 746
    move-result v39

    .line 747
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 748
    .line 749
    .line 750
    move-result v40

    .line 751
    const/high16 v41, 0x3f800000    # 1.0f

    .line 752
    .line 753
    const-string v33, ""

    .line 754
    .line 755
    new-instance v0, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 756
    .line 757
    invoke-direct {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 758
    .line 759
    .line 760
    const v1, 0x419b70a4    # 19.43f

    .line 761
    .line 762
    .line 763
    const v2, 0x414fae14    # 12.98f

    .line 764
    .line 765
    .line 766
    invoke-virtual {v0, v1, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 767
    .line 768
    .line 769
    const v14, 0x3d23d70a    # 0.04f

    .line 770
    .line 771
    .line 772
    const v15, -0x415c28f6    # -0.32f

    .line 773
    .line 774
    .line 775
    const v16, 0x3d8f5c29    # 0.07f

    .line 776
    .line 777
    .line 778
    const v17, -0x40dc28f6    # -0.64f

    .line 779
    .line 780
    .line 781
    const v18, 0x3d8f5c29    # 0.07f

    .line 782
    .line 783
    .line 784
    const v19, -0x40851eb8    # -0.98f

    .line 785
    .line 786
    .line 787
    move-object v13, v0

    .line 788
    invoke-virtual/range {v13 .. v19}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 789
    .line 790
    .line 791
    const/4 v14, 0x0

    .line 792
    const v15, -0x4151eb85    # -0.34f

    .line 793
    .line 794
    .line 795
    const v16, -0x430a3d71    # -0.03f

    .line 796
    .line 797
    .line 798
    const v17, -0x40d70a3d    # -0.66f

    .line 799
    .line 800
    .line 801
    const v18, -0x4270a3d7    # -0.07f

    .line 802
    .line 803
    .line 804
    invoke-virtual/range {v13 .. v19}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 805
    .line 806
    .line 807
    const v1, 0x40070a3d    # 2.11f

    .line 808
    .line 809
    .line 810
    const v2, -0x402ccccd    # -1.65f

    .line 811
    .line 812
    .line 813
    invoke-virtual {v0, v1, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 814
    .line 815
    .line 816
    const v14, 0x3e428f5c    # 0.19f

    .line 817
    .line 818
    .line 819
    const v15, -0x41e66666    # -0.15f

    .line 820
    .line 821
    .line 822
    const v16, 0x3e75c28f    # 0.24f

    .line 823
    .line 824
    .line 825
    const v17, -0x4128f5c3    # -0.42f

    .line 826
    .line 827
    .line 828
    const v18, 0x3df5c28f    # 0.12f

    .line 829
    .line 830
    .line 831
    const v19, -0x40dc28f6    # -0.64f

    .line 832
    .line 833
    .line 834
    invoke-virtual/range {v13 .. v19}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 835
    .line 836
    .line 837
    const v1, -0x3fa28f5c    # -3.46f

    .line 838
    .line 839
    .line 840
    const/high16 v2, -0x40000000    # -2.0f

    .line 841
    .line 842
    invoke-virtual {v0, v2, v1}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 843
    .line 844
    .line 845
    const v14, -0x4247ae14    # -0.09f

    .line 846
    .line 847
    .line 848
    const v15, -0x41dc28f6    # -0.16f

    .line 849
    .line 850
    .line 851
    const v16, -0x417ae148    # -0.26f

    .line 852
    .line 853
    .line 854
    const/high16 v17, -0x41800000    # -0.25f

    .line 855
    .line 856
    const v18, -0x411eb852    # -0.44f

    .line 857
    .line 858
    .line 859
    const/high16 v19, -0x41800000    # -0.25f

    .line 860
    .line 861
    invoke-virtual/range {v13 .. v19}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 862
    .line 863
    .line 864
    const v14, -0x428a3d71    # -0.06f

    .line 865
    .line 866
    .line 867
    const/4 v15, 0x0

    .line 868
    const v16, -0x420a3d71    # -0.12f

    .line 869
    .line 870
    .line 871
    const v17, 0x3c23d70a    # 0.01f

    .line 872
    .line 873
    .line 874
    const v18, -0x41d1eb85    # -0.17f

    .line 875
    .line 876
    .line 877
    const v19, 0x3cf5c28f    # 0.03f

    .line 878
    .line 879
    .line 880
    invoke-virtual/range {v13 .. v19}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 881
    .line 882
    .line 883
    const v1, -0x3fe0a3d7    # -2.49f

    .line 884
    .line 885
    .line 886
    const/high16 v3, 0x3f800000    # 1.0f

    .line 887
    .line 888
    invoke-virtual {v0, v1, v3}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 889
    .line 890
    .line 891
    const v14, -0x40fae148    # -0.52f

    .line 892
    .line 893
    .line 894
    const v15, -0x41333333    # -0.4f

    .line 895
    .line 896
    .line 897
    const v16, -0x4075c28f    # -1.08f

    .line 898
    .line 899
    .line 900
    const v17, -0x40c51eb8    # -0.73f

    .line 901
    .line 902
    .line 903
    const v18, -0x4027ae14    # -1.69f

    .line 904
    .line 905
    .line 906
    const v19, -0x40851eb8    # -0.98f

    .line 907
    .line 908
    .line 909
    invoke-virtual/range {v13 .. v19}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 910
    .line 911
    .line 912
    const v1, -0x413d70a4    # -0.38f

    .line 913
    .line 914
    .line 915
    const v3, -0x3fd66666    # -2.65f

    .line 916
    .line 917
    .line 918
    invoke-virtual {v0, v1, v3}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 919
    .line 920
    .line 921
    const v14, 0x41675c29    # 14.46f

    .line 922
    .line 923
    .line 924
    const v15, 0x400b851f    # 2.18f

    .line 925
    .line 926
    .line 927
    const/high16 v16, 0x41640000    # 14.25f

    .line 928
    .line 929
    const/high16 v17, 0x40000000    # 2.0f

    .line 930
    .line 931
    const/high16 v18, 0x41600000    # 14.0f

    .line 932
    .line 933
    const/high16 v19, 0x40000000    # 2.0f

    .line 934
    .line 935
    invoke-virtual/range {v13 .. v19}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 936
    .line 937
    .line 938
    invoke-virtual {v0, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 939
    .line 940
    .line 941
    const/high16 v14, -0x41800000    # -0.25f

    .line 942
    .line 943
    const/4 v15, 0x0

    .line 944
    const v16, -0x41147ae1    # -0.46f

    .line 945
    .line 946
    .line 947
    const v17, 0x3e3851ec    # 0.18f

    .line 948
    .line 949
    .line 950
    const v18, -0x41051eb8    # -0.49f

    .line 951
    .line 952
    .line 953
    const v19, 0x3ed70a3d    # 0.42f

    .line 954
    .line 955
    .line 956
    invoke-virtual/range {v13 .. v19}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 957
    .line 958
    .line 959
    const v3, 0x4029999a    # 2.65f

    .line 960
    .line 961
    .line 962
    invoke-virtual {v0, v1, v3}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 963
    .line 964
    .line 965
    const v14, -0x40e3d70a    # -0.61f

    .line 966
    .line 967
    .line 968
    const/high16 v15, 0x3e800000    # 0.25f

    .line 969
    .line 970
    const v16, -0x406a3d71    # -1.17f

    .line 971
    .line 972
    .line 973
    const v17, 0x3f170a3d    # 0.59f

    .line 974
    .line 975
    .line 976
    const v18, -0x4027ae14    # -1.69f

    .line 977
    .line 978
    .line 979
    const v19, 0x3f7ae148    # 0.98f

    .line 980
    .line 981
    .line 982
    invoke-virtual/range {v13 .. v19}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 983
    .line 984
    .line 985
    const v1, -0x3fe0a3d7    # -2.49f

    .line 986
    .line 987
    .line 988
    const/high16 v3, -0x40800000    # -1.0f

    .line 989
    .line 990
    invoke-virtual {v0, v1, v3}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 991
    .line 992
    .line 993
    const v14, -0x428a3d71    # -0.06f

    .line 994
    .line 995
    .line 996
    const v15, -0x435c28f6    # -0.02f

    .line 997
    .line 998
    .line 999
    const v16, -0x420a3d71    # -0.12f

    .line 1000
    .line 1001
    .line 1002
    const v17, -0x430a3d71    # -0.03f

    .line 1003
    .line 1004
    .line 1005
    const v18, -0x41c7ae14    # -0.18f

    .line 1006
    .line 1007
    .line 1008
    const v19, -0x430a3d71    # -0.03f

    .line 1009
    .line 1010
    .line 1011
    invoke-virtual/range {v13 .. v19}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1012
    .line 1013
    .line 1014
    const v14, -0x41d1eb85    # -0.17f

    .line 1015
    .line 1016
    .line 1017
    const/4 v15, 0x0

    .line 1018
    const v16, -0x4151eb85    # -0.34f

    .line 1019
    .line 1020
    .line 1021
    const v17, 0x3db851ec    # 0.09f

    .line 1022
    .line 1023
    .line 1024
    const v18, -0x4123d70a    # -0.43f

    .line 1025
    .line 1026
    .line 1027
    const/high16 v19, 0x3e800000    # 0.25f

    .line 1028
    .line 1029
    invoke-virtual/range {v13 .. v19}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1030
    .line 1031
    .line 1032
    const v1, 0x405d70a4    # 3.46f

    .line 1033
    .line 1034
    .line 1035
    invoke-virtual {v0, v2, v1}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1036
    .line 1037
    .line 1038
    const v14, -0x41fae148    # -0.13f

    .line 1039
    .line 1040
    .line 1041
    const v15, 0x3e6147ae    # 0.22f

    .line 1042
    .line 1043
    .line 1044
    const v16, -0x4270a3d7    # -0.07f

    .line 1045
    .line 1046
    .line 1047
    const v17, 0x3efae148    # 0.49f

    .line 1048
    .line 1049
    .line 1050
    const v18, 0x3df5c28f    # 0.12f

    .line 1051
    .line 1052
    .line 1053
    const v19, 0x3f23d70a    # 0.64f

    .line 1054
    .line 1055
    .line 1056
    invoke-virtual/range {v13 .. v19}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1057
    .line 1058
    .line 1059
    const v1, 0x40070a3d    # 2.11f

    .line 1060
    .line 1061
    .line 1062
    const v3, 0x3fd33333    # 1.65f

    .line 1063
    .line 1064
    .line 1065
    invoke-virtual {v0, v1, v3}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1066
    .line 1067
    .line 1068
    const v14, -0x42dc28f6    # -0.04f

    .line 1069
    .line 1070
    .line 1071
    const v15, 0x3ea3d70a    # 0.32f

    .line 1072
    .line 1073
    .line 1074
    const v17, 0x3f266666    # 0.65f

    .line 1075
    .line 1076
    .line 1077
    const v18, -0x4270a3d7    # -0.07f

    .line 1078
    .line 1079
    .line 1080
    const v19, 0x3f7ae148    # 0.98f

    .line 1081
    .line 1082
    .line 1083
    invoke-virtual/range {v13 .. v19}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1084
    .line 1085
    .line 1086
    const v1, 0x3d8f5c29    # 0.07f

    .line 1087
    .line 1088
    .line 1089
    const v3, 0x3f7ae148    # 0.98f

    .line 1090
    .line 1091
    .line 1092
    const v7, 0x3cf5c28f    # 0.03f

    .line 1093
    .line 1094
    .line 1095
    const v8, 0x3f28f5c3    # 0.66f

    .line 1096
    .line 1097
    .line 1098
    invoke-virtual {v0, v7, v8, v1, v3}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1099
    .line 1100
    .line 1101
    const v1, -0x3ff8f5c3    # -2.11f

    .line 1102
    .line 1103
    .line 1104
    const v3, 0x3fd33333    # 1.65f

    .line 1105
    .line 1106
    .line 1107
    invoke-virtual {v0, v1, v3}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1108
    .line 1109
    .line 1110
    const v14, -0x41bd70a4    # -0.19f

    .line 1111
    .line 1112
    .line 1113
    const v15, 0x3e19999a    # 0.15f

    .line 1114
    .line 1115
    .line 1116
    const v16, -0x418a3d71    # -0.24f

    .line 1117
    .line 1118
    .line 1119
    const v17, 0x3ed70a3d    # 0.42f

    .line 1120
    .line 1121
    .line 1122
    const v18, -0x420a3d71    # -0.12f

    .line 1123
    .line 1124
    .line 1125
    const v19, 0x3f23d70a    # 0.64f

    .line 1126
    .line 1127
    .line 1128
    invoke-virtual/range {v13 .. v19}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1129
    .line 1130
    .line 1131
    const v1, 0x405d70a4    # 3.46f

    .line 1132
    .line 1133
    .line 1134
    const/high16 v3, 0x40000000    # 2.0f

    .line 1135
    .line 1136
    invoke-virtual {v0, v3, v1}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1137
    .line 1138
    .line 1139
    const v14, 0x3db851ec    # 0.09f

    .line 1140
    .line 1141
    .line 1142
    const v15, 0x3e23d70a    # 0.16f

    .line 1143
    .line 1144
    .line 1145
    const v16, 0x3e851eb8    # 0.26f

    .line 1146
    .line 1147
    .line 1148
    const/high16 v17, 0x3e800000    # 0.25f

    .line 1149
    .line 1150
    const v18, 0x3ee147ae    # 0.44f

    .line 1151
    .line 1152
    .line 1153
    const/high16 v19, 0x3e800000    # 0.25f

    .line 1154
    .line 1155
    invoke-virtual/range {v13 .. v19}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1156
    .line 1157
    .line 1158
    const v14, 0x3d75c28f    # 0.06f

    .line 1159
    .line 1160
    .line 1161
    const/4 v15, 0x0

    .line 1162
    const v16, 0x3df5c28f    # 0.12f

    .line 1163
    .line 1164
    .line 1165
    const v17, -0x43dc28f6    # -0.01f

    .line 1166
    .line 1167
    .line 1168
    const v18, 0x3e2e147b    # 0.17f

    .line 1169
    .line 1170
    .line 1171
    const v19, -0x430a3d71    # -0.03f

    .line 1172
    .line 1173
    .line 1174
    invoke-virtual/range {v13 .. v19}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1175
    .line 1176
    .line 1177
    const v1, 0x401f5c29    # 2.49f

    .line 1178
    .line 1179
    .line 1180
    const/high16 v7, -0x40800000    # -1.0f

    .line 1181
    .line 1182
    invoke-virtual {v0, v1, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1183
    .line 1184
    .line 1185
    const v14, 0x3f051eb8    # 0.52f

    .line 1186
    .line 1187
    .line 1188
    const v15, 0x3ecccccd    # 0.4f

    .line 1189
    .line 1190
    .line 1191
    const v16, 0x3f8a3d71    # 1.08f

    .line 1192
    .line 1193
    .line 1194
    const v17, 0x3f3ae148    # 0.73f

    .line 1195
    .line 1196
    .line 1197
    const v18, 0x3fd851ec    # 1.69f

    .line 1198
    .line 1199
    .line 1200
    const v19, 0x3f7ae148    # 0.98f

    .line 1201
    .line 1202
    .line 1203
    invoke-virtual/range {v13 .. v19}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1204
    .line 1205
    .line 1206
    const v1, 0x3ec28f5c    # 0.38f

    .line 1207
    .line 1208
    .line 1209
    const v7, 0x4029999a    # 2.65f

    .line 1210
    .line 1211
    .line 1212
    invoke-virtual {v0, v1, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1213
    .line 1214
    .line 1215
    const v14, 0x3cf5c28f    # 0.03f

    .line 1216
    .line 1217
    .line 1218
    const v15, 0x3e75c28f    # 0.24f

    .line 1219
    .line 1220
    .line 1221
    const v16, 0x3e75c28f    # 0.24f

    .line 1222
    .line 1223
    .line 1224
    const v17, 0x3ed70a3d    # 0.42f

    .line 1225
    .line 1226
    .line 1227
    const v18, 0x3efae148    # 0.49f

    .line 1228
    .line 1229
    .line 1230
    const v19, 0x3ed70a3d    # 0.42f

    .line 1231
    .line 1232
    .line 1233
    invoke-virtual/range {v13 .. v19}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1234
    .line 1235
    .line 1236
    invoke-virtual {v0, v5}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1237
    .line 1238
    .line 1239
    const/high16 v14, 0x3e800000    # 0.25f

    .line 1240
    .line 1241
    const/4 v15, 0x0

    .line 1242
    const v16, 0x3eeb851f    # 0.46f

    .line 1243
    .line 1244
    .line 1245
    const v17, -0x41c7ae14    # -0.18f

    .line 1246
    .line 1247
    .line 1248
    const v19, -0x4128f5c3    # -0.42f

    .line 1249
    .line 1250
    .line 1251
    invoke-virtual/range {v13 .. v19}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1252
    .line 1253
    .line 1254
    const v7, -0x3fd66666    # -2.65f

    .line 1255
    .line 1256
    .line 1257
    invoke-virtual {v0, v1, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1258
    .line 1259
    .line 1260
    const v14, 0x3f1c28f6    # 0.61f

    .line 1261
    .line 1262
    .line 1263
    const/high16 v15, -0x41800000    # -0.25f

    .line 1264
    .line 1265
    const v16, 0x3f95c28f    # 1.17f

    .line 1266
    .line 1267
    .line 1268
    const v17, -0x40e8f5c3    # -0.59f

    .line 1269
    .line 1270
    .line 1271
    const v18, 0x3fd851ec    # 1.69f

    .line 1272
    .line 1273
    .line 1274
    const v19, -0x40851eb8    # -0.98f

    .line 1275
    .line 1276
    .line 1277
    invoke-virtual/range {v13 .. v19}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1278
    .line 1279
    .line 1280
    const v1, 0x401f5c29    # 2.49f

    .line 1281
    .line 1282
    .line 1283
    const/high16 v7, 0x3f800000    # 1.0f

    .line 1284
    .line 1285
    invoke-virtual {v0, v1, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1286
    .line 1287
    .line 1288
    const v14, 0x3d75c28f    # 0.06f

    .line 1289
    .line 1290
    .line 1291
    const v15, 0x3ca3d70a    # 0.02f

    .line 1292
    .line 1293
    .line 1294
    const v16, 0x3df5c28f    # 0.12f

    .line 1295
    .line 1296
    .line 1297
    const v17, 0x3cf5c28f    # 0.03f

    .line 1298
    .line 1299
    .line 1300
    const v18, 0x3e3851ec    # 0.18f

    .line 1301
    .line 1302
    .line 1303
    const v19, 0x3cf5c28f    # 0.03f

    .line 1304
    .line 1305
    .line 1306
    invoke-virtual/range {v13 .. v19}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1307
    .line 1308
    .line 1309
    const v14, 0x3e2e147b    # 0.17f

    .line 1310
    .line 1311
    .line 1312
    const/4 v15, 0x0

    .line 1313
    const v16, 0x3eae147b    # 0.34f

    .line 1314
    .line 1315
    .line 1316
    const v17, -0x4247ae14    # -0.09f

    .line 1317
    .line 1318
    .line 1319
    const v18, 0x3edc28f6    # 0.43f

    .line 1320
    .line 1321
    .line 1322
    const/high16 v19, -0x41800000    # -0.25f

    .line 1323
    .line 1324
    invoke-virtual/range {v13 .. v19}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1325
    .line 1326
    .line 1327
    const v1, -0x3fa28f5c    # -3.46f

    .line 1328
    .line 1329
    .line 1330
    invoke-virtual {v0, v3, v1}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1331
    .line 1332
    .line 1333
    const v14, 0x3df5c28f    # 0.12f

    .line 1334
    .line 1335
    .line 1336
    const v15, -0x419eb852    # -0.22f

    .line 1337
    .line 1338
    .line 1339
    const v16, 0x3d8f5c29    # 0.07f

    .line 1340
    .line 1341
    .line 1342
    const v17, -0x41051eb8    # -0.49f

    .line 1343
    .line 1344
    .line 1345
    const v18, -0x420a3d71    # -0.12f

    .line 1346
    .line 1347
    .line 1348
    const v19, -0x40dc28f6    # -0.64f

    .line 1349
    .line 1350
    .line 1351
    invoke-virtual/range {v13 .. v19}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1352
    .line 1353
    .line 1354
    const v1, -0x3ff8f5c3    # -2.11f

    .line 1355
    .line 1356
    .line 1357
    const v7, -0x402ccccd    # -1.65f

    .line 1358
    .line 1359
    .line 1360
    invoke-virtual {v0, v1, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1361
    .line 1362
    .line 1363
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1364
    .line 1365
    .line 1366
    const v1, 0x418b999a    # 17.45f

    .line 1367
    .line 1368
    .line 1369
    const v7, 0x413451ec    # 11.27f

    .line 1370
    .line 1371
    .line 1372
    invoke-virtual {v0, v1, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1373
    .line 1374
    .line 1375
    const v14, 0x3d23d70a    # 0.04f

    .line 1376
    .line 1377
    .line 1378
    const v15, 0x3e9eb852    # 0.31f

    .line 1379
    .line 1380
    .line 1381
    const v16, 0x3d4ccccd    # 0.05f

    .line 1382
    .line 1383
    .line 1384
    const v17, 0x3f051eb8    # 0.52f

    .line 1385
    .line 1386
    .line 1387
    const v18, 0x3d4ccccd    # 0.05f

    .line 1388
    .line 1389
    .line 1390
    const v19, 0x3f3ae148    # 0.73f

    .line 1391
    .line 1392
    .line 1393
    invoke-virtual/range {v13 .. v19}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1394
    .line 1395
    .line 1396
    const/4 v14, 0x0

    .line 1397
    const v15, 0x3e570a3d    # 0.21f

    .line 1398
    .line 1399
    .line 1400
    const v16, -0x435c28f6    # -0.02f

    .line 1401
    .line 1402
    .line 1403
    const v17, 0x3edc28f6    # 0.43f

    .line 1404
    .line 1405
    .line 1406
    const v18, -0x42b33333    # -0.05f

    .line 1407
    .line 1408
    .line 1409
    invoke-virtual/range {v13 .. v19}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1410
    .line 1411
    .line 1412
    invoke-virtual {v0, v11, v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1413
    .line 1414
    .line 1415
    const v1, 0x3f63d70a    # 0.89f

    .line 1416
    .line 1417
    .line 1418
    const v7, 0x3f333333    # 0.7f

    .line 1419
    .line 1420
    .line 1421
    invoke-virtual {v0, v1, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1422
    .line 1423
    .line 1424
    const v1, 0x3f8a3d71    # 1.08f

    .line 1425
    .line 1426
    .line 1427
    const v7, 0x3f570a3d    # 0.84f

    .line 1428
    .line 1429
    .line 1430
    invoke-virtual {v0, v1, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1431
    .line 1432
    .line 1433
    const v1, 0x3f9ae148    # 1.21f

    .line 1434
    .line 1435
    .line 1436
    const v7, -0x40cccccd    # -0.7f

    .line 1437
    .line 1438
    .line 1439
    invoke-virtual {v0, v7, v1}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1440
    .line 1441
    .line 1442
    const v7, -0x40fd70a4    # -0.51f

    .line 1443
    .line 1444
    .line 1445
    invoke-virtual {v0, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1446
    .line 1447
    .line 1448
    const v7, -0x407ae148    # -1.04f

    .line 1449
    .line 1450
    .line 1451
    const v8, -0x4128f5c3    # -0.42f

    .line 1452
    .line 1453
    .line 1454
    invoke-virtual {v0, v7, v8}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1455
    .line 1456
    .line 1457
    const v7, -0x4099999a    # -0.9f

    .line 1458
    .line 1459
    .line 1460
    const v8, 0x3f2e147b    # 0.68f

    .line 1461
    .line 1462
    .line 1463
    invoke-virtual {v0, v7, v8}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1464
    .line 1465
    .line 1466
    const v14, -0x4123d70a    # -0.43f

    .line 1467
    .line 1468
    .line 1469
    const v15, 0x3ea3d70a    # 0.32f

    .line 1470
    .line 1471
    .line 1472
    const v16, -0x40a8f5c3    # -0.84f

    .line 1473
    .line 1474
    .line 1475
    const v17, 0x3f0f5c29    # 0.56f

    .line 1476
    .line 1477
    .line 1478
    const/high16 v18, -0x40600000    # -1.25f

    .line 1479
    .line 1480
    invoke-virtual/range {v13 .. v19}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1481
    .line 1482
    .line 1483
    const v7, 0x3edc28f6    # 0.43f

    .line 1484
    .line 1485
    .line 1486
    const v8, -0x407851ec    # -1.06f

    .line 1487
    .line 1488
    .line 1489
    invoke-virtual {v0, v8, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1490
    .line 1491
    .line 1492
    const v7, -0x41dc28f6    # -0.16f

    .line 1493
    .line 1494
    .line 1495
    invoke-virtual {v0, v7, v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1496
    .line 1497
    .line 1498
    const v9, -0x41b33333    # -0.2f

    .line 1499
    .line 1500
    .line 1501
    const v10, 0x3faccccd    # 1.35f

    .line 1502
    .line 1503
    .line 1504
    invoke-virtual {v0, v9, v10}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1505
    .line 1506
    .line 1507
    const v9, -0x404ccccd    # -1.4f

    .line 1508
    .line 1509
    .line 1510
    invoke-virtual {v0, v9}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1511
    .line 1512
    .line 1513
    const v9, -0x41bd70a4    # -0.19f

    .line 1514
    .line 1515
    .line 1516
    const v10, -0x40533333    # -1.35f

    .line 1517
    .line 1518
    .line 1519
    invoke-virtual {v0, v9, v10}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1520
    .line 1521
    .line 1522
    const v9, -0x406f5c29    # -1.13f

    .line 1523
    .line 1524
    .line 1525
    invoke-virtual {v0, v7, v9}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1526
    .line 1527
    .line 1528
    const v7, -0x4123d70a    # -0.43f

    .line 1529
    .line 1530
    .line 1531
    invoke-virtual {v0, v8, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1532
    .line 1533
    .line 1534
    const v15, -0x41c7ae14    # -0.18f

    .line 1535
    .line 1536
    .line 1537
    const v16, -0x40ab851f    # -0.83f

    .line 1538
    .line 1539
    .line 1540
    const v17, -0x412e147b    # -0.41f

    .line 1541
    .line 1542
    .line 1543
    const v18, -0x40628f5c    # -1.23f

    .line 1544
    .line 1545
    .line 1546
    const v19, -0x40ca3d71    # -0.71f

    .line 1547
    .line 1548
    .line 1549
    invoke-virtual/range {v13 .. v19}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1550
    .line 1551
    .line 1552
    const v7, -0x40970a3d    # -0.91f

    .line 1553
    .line 1554
    .line 1555
    const v8, -0x40cccccd    # -0.7f

    .line 1556
    .line 1557
    .line 1558
    invoke-virtual {v0, v7, v8}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1559
    .line 1560
    .line 1561
    const v7, 0x3edc28f6    # 0.43f

    .line 1562
    .line 1563
    .line 1564
    const v9, -0x407851ec    # -1.06f

    .line 1565
    .line 1566
    .line 1567
    invoke-virtual {v0, v9, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1568
    .line 1569
    .line 1570
    const v7, 0x3f028f5c    # 0.51f

    .line 1571
    .line 1572
    .line 1573
    invoke-virtual {v0, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1574
    .line 1575
    .line 1576
    const v6, -0x40651eb8    # -1.21f

    .line 1577
    .line 1578
    .line 1579
    invoke-virtual {v0, v8, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1580
    .line 1581
    .line 1582
    const v6, 0x3f8a3d71    # 1.08f

    .line 1583
    .line 1584
    .line 1585
    const v9, -0x40a8f5c3    # -0.84f

    .line 1586
    .line 1587
    .line 1588
    invoke-virtual {v0, v6, v9}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1589
    .line 1590
    .line 1591
    const v6, 0x3f63d70a    # 0.89f

    .line 1592
    .line 1593
    .line 1594
    invoke-virtual {v0, v6, v8}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1595
    .line 1596
    .line 1597
    const v6, -0x406f5c29    # -1.13f

    .line 1598
    .line 1599
    .line 1600
    invoke-virtual {v0, v11, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1601
    .line 1602
    .line 1603
    const v14, -0x430a3d71    # -0.03f

    .line 1604
    .line 1605
    .line 1606
    const v15, -0x416147ae    # -0.31f

    .line 1607
    .line 1608
    .line 1609
    const v16, -0x42b33333    # -0.05f

    .line 1610
    .line 1611
    .line 1612
    const v17, -0x40f5c28f    # -0.54f

    .line 1613
    .line 1614
    .line 1615
    const v18, -0x42b33333    # -0.05f

    .line 1616
    .line 1617
    .line 1618
    const v19, -0x40c28f5c    # -0.74f

    .line 1619
    .line 1620
    .line 1621
    invoke-virtual/range {v13 .. v19}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1622
    .line 1623
    .line 1624
    const v6, 0x3d4ccccd    # 0.05f

    .line 1625
    .line 1626
    .line 1627
    const v8, -0x40c51eb8    # -0.73f

    .line 1628
    .line 1629
    .line 1630
    const v9, 0x3ca3d70a    # 0.02f

    .line 1631
    .line 1632
    .line 1633
    const v10, -0x4123d70a    # -0.43f

    .line 1634
    .line 1635
    .line 1636
    invoke-virtual {v0, v9, v10, v6, v8}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1637
    .line 1638
    .line 1639
    const v6, 0x3e0f5c29    # 0.14f

    .line 1640
    .line 1641
    .line 1642
    const v8, -0x406f5c29    # -1.13f

    .line 1643
    .line 1644
    .line 1645
    invoke-virtual {v0, v6, v8}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1646
    .line 1647
    .line 1648
    const v8, -0x409c28f6    # -0.89f

    .line 1649
    .line 1650
    .line 1651
    const v9, -0x40cccccd    # -0.7f

    .line 1652
    .line 1653
    .line 1654
    invoke-virtual {v0, v8, v9}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1655
    .line 1656
    .line 1657
    const v9, -0x4075c28f    # -1.08f

    .line 1658
    .line 1659
    .line 1660
    const v10, -0x40a8f5c3    # -0.84f

    .line 1661
    .line 1662
    .line 1663
    invoke-virtual {v0, v9, v10}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1664
    .line 1665
    .line 1666
    const v9, -0x40651eb8    # -1.21f

    .line 1667
    .line 1668
    .line 1669
    const v10, 0x3f333333    # 0.7f

    .line 1670
    .line 1671
    .line 1672
    invoke-virtual {v0, v10, v9}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1673
    .line 1674
    .line 1675
    const v9, 0x3fa28f5c    # 1.27f

    .line 1676
    .line 1677
    .line 1678
    invoke-virtual {v0, v9, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1679
    .line 1680
    .line 1681
    const v7, 0x3f851eb8    # 1.04f

    .line 1682
    .line 1683
    .line 1684
    const v10, 0x3ed70a3d    # 0.42f

    .line 1685
    .line 1686
    .line 1687
    invoke-virtual {v0, v7, v10}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1688
    .line 1689
    .line 1690
    const v7, 0x3f666666    # 0.9f

    .line 1691
    .line 1692
    .line 1693
    const v10, -0x40d1eb85    # -0.68f

    .line 1694
    .line 1695
    .line 1696
    invoke-virtual {v0, v7, v10}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1697
    .line 1698
    .line 1699
    const v14, 0x3edc28f6    # 0.43f

    .line 1700
    .line 1701
    .line 1702
    const v15, -0x415c28f6    # -0.32f

    .line 1703
    .line 1704
    .line 1705
    const v16, 0x3f570a3d    # 0.84f

    .line 1706
    .line 1707
    .line 1708
    const v17, -0x40f0a3d7    # -0.56f

    .line 1709
    .line 1710
    .line 1711
    const/high16 v18, 0x3fa00000    # 1.25f

    .line 1712
    .line 1713
    const v19, -0x40c51eb8    # -0.73f

    .line 1714
    .line 1715
    .line 1716
    invoke-virtual/range {v13 .. v19}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1717
    .line 1718
    .line 1719
    const v7, 0x3f87ae14    # 1.06f

    .line 1720
    .line 1721
    .line 1722
    const v10, -0x4123d70a    # -0.43f

    .line 1723
    .line 1724
    .line 1725
    invoke-virtual {v0, v7, v10}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1726
    .line 1727
    .line 1728
    const v7, 0x3e23d70a    # 0.16f

    .line 1729
    .line 1730
    .line 1731
    const v10, -0x406f5c29    # -1.13f

    .line 1732
    .line 1733
    .line 1734
    invoke-virtual {v0, v7, v10}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1735
    .line 1736
    .line 1737
    const v7, 0x3e4ccccd    # 0.2f

    .line 1738
    .line 1739
    .line 1740
    const v10, -0x40533333    # -1.35f

    .line 1741
    .line 1742
    .line 1743
    invoke-virtual {v0, v7, v10}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1744
    .line 1745
    .line 1746
    const v7, 0x3fb1eb85    # 1.39f

    .line 1747
    .line 1748
    .line 1749
    invoke-virtual {v0, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1750
    .line 1751
    .line 1752
    const v7, 0x3e428f5c    # 0.19f

    .line 1753
    .line 1754
    .line 1755
    const v10, 0x3faccccd    # 1.35f

    .line 1756
    .line 1757
    .line 1758
    invoke-virtual {v0, v7, v10}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1759
    .line 1760
    .line 1761
    const v7, 0x3e23d70a    # 0.16f

    .line 1762
    .line 1763
    .line 1764
    invoke-virtual {v0, v7, v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1765
    .line 1766
    .line 1767
    const v7, 0x3f87ae14    # 1.06f

    .line 1768
    .line 1769
    .line 1770
    const v10, 0x3edc28f6    # 0.43f

    .line 1771
    .line 1772
    .line 1773
    invoke-virtual {v0, v7, v10}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1774
    .line 1775
    .line 1776
    const v15, 0x3e3851ec    # 0.18f

    .line 1777
    .line 1778
    .line 1779
    const v16, 0x3f547ae1    # 0.83f

    .line 1780
    .line 1781
    .line 1782
    const v17, 0x3ed1eb85    # 0.41f

    .line 1783
    .line 1784
    .line 1785
    const v18, 0x3f9d70a4    # 1.23f

    .line 1786
    .line 1787
    .line 1788
    const v19, 0x3f35c28f    # 0.71f

    .line 1789
    .line 1790
    .line 1791
    invoke-virtual/range {v13 .. v19}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1792
    .line 1793
    .line 1794
    const v7, 0x3f68f5c3    # 0.91f

    .line 1795
    .line 1796
    .line 1797
    const v10, 0x3f333333    # 0.7f

    .line 1798
    .line 1799
    .line 1800
    invoke-virtual {v0, v7, v10}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1801
    .line 1802
    .line 1803
    const v7, 0x3f87ae14    # 1.06f

    .line 1804
    .line 1805
    .line 1806
    const v11, -0x4123d70a    # -0.43f

    .line 1807
    .line 1808
    .line 1809
    invoke-virtual {v0, v7, v11}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1810
    .line 1811
    .line 1812
    const v7, -0x40fd70a4    # -0.51f

    .line 1813
    .line 1814
    .line 1815
    invoke-virtual {v0, v9, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1816
    .line 1817
    .line 1818
    invoke-virtual {v0, v10, v1}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1819
    .line 1820
    .line 1821
    const v1, -0x40770a3d    # -1.07f

    .line 1822
    .line 1823
    .line 1824
    const v7, 0x3f59999a    # 0.85f

    .line 1825
    .line 1826
    .line 1827
    invoke-virtual {v0, v1, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1828
    .line 1829
    .line 1830
    invoke-virtual {v0, v8, v10}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1831
    .line 1832
    .line 1833
    invoke-virtual {v0, v6, v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1834
    .line 1835
    .line 1836
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1837
    .line 1838
    .line 1839
    const/high16 v1, 0x41400000    # 12.0f

    .line 1840
    .line 1841
    const/high16 v6, 0x41000000    # 8.0f

    .line 1842
    .line 1843
    invoke-virtual {v0, v1, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1844
    .line 1845
    .line 1846
    const v14, -0x3ff28f5c    # -2.21f

    .line 1847
    .line 1848
    .line 1849
    const/4 v15, 0x0

    .line 1850
    const/high16 v16, -0x3f800000    # -4.0f

    .line 1851
    .line 1852
    const v17, 0x3fe51eb8    # 1.79f

    .line 1853
    .line 1854
    .line 1855
    const/high16 v18, -0x3f800000    # -4.0f

    .line 1856
    .line 1857
    const/high16 v19, 0x40800000    # 4.0f

    .line 1858
    .line 1859
    invoke-virtual/range {v13 .. v19}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1860
    .line 1861
    .line 1862
    const v1, 0x3fe51eb8    # 1.79f

    .line 1863
    .line 1864
    .line 1865
    invoke-virtual {v0, v1, v5, v5, v5}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1866
    .line 1867
    .line 1868
    const v1, -0x401ae148    # -1.79f

    .line 1869
    .line 1870
    .line 1871
    invoke-virtual {v0, v5, v1, v5, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1872
    .line 1873
    .line 1874
    invoke-virtual {v0, v1, v4, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1875
    .line 1876
    .line 1877
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1878
    .line 1879
    .line 1880
    const/high16 v1, 0x41400000    # 12.0f

    .line 1881
    .line 1882
    const/high16 v4, 0x41600000    # 14.0f

    .line 1883
    .line 1884
    invoke-virtual {v0, v1, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1885
    .line 1886
    .line 1887
    const v14, -0x40733333    # -1.1f

    .line 1888
    .line 1889
    .line 1890
    const/high16 v16, -0x40000000    # -2.0f

    .line 1891
    .line 1892
    const v17, -0x4099999a    # -0.9f

    .line 1893
    .line 1894
    .line 1895
    const/high16 v18, -0x40000000    # -2.0f

    .line 1896
    .line 1897
    const/high16 v19, -0x40000000    # -2.0f

    .line 1898
    .line 1899
    invoke-virtual/range {v13 .. v19}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1900
    .line 1901
    .line 1902
    const v1, 0x3f666666    # 0.9f

    .line 1903
    .line 1904
    .line 1905
    invoke-virtual {v0, v1, v2, v3, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1906
    .line 1907
    .line 1908
    invoke-virtual {v0, v3, v1, v3, v3}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1909
    .line 1910
    .line 1911
    const v1, -0x4099999a    # -0.9f

    .line 1912
    .line 1913
    .line 1914
    invoke-virtual {v0, v1, v3, v2, v3}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1915
    .line 1916
    .line 1917
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1918
    .line 1919
    .line 1920
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 1921
    .line 1922
    .line 1923
    move-result-object v31

    .line 1924
    const/16 v42, 0x0

    .line 1925
    .line 1926
    const/16 v43, 0x0

    .line 1927
    .line 1928
    const/16 v44, 0x0

    .line 1929
    .line 1930
    const/16 v45, 0x3800

    .line 1931
    .line 1932
    const/16 v46, 0x0

    .line 1933
    .line 1934
    invoke-static/range {v30 .. v46}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 1935
    .line 1936
    .line 1937
    move-result-object v0

    .line 1938
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1939
    .line 1940
    .line 1941
    move-result-object v0

    .line 1942
    sput-object v0, Landroidx/compose/material/icons/twotone/SettingsKt;->_settings:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1943
    .line 1944
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 1945
    .line 1946
    .line 1947
    return-object v0
.end method
