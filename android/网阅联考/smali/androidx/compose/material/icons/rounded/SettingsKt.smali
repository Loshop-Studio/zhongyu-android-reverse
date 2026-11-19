.class public final Landroidx/compose/material/icons/rounded/SettingsKt;
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
        "Landroidx/compose/material/icons/Icons$Rounded;",
        "getSettings",
        "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;",
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
        "SMAP\nSettings.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Settings.kt\nandroidx/compose/material/icons/rounded/SettingsKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,83:1\n122#2:84\n116#2,3:85\n119#2,3:89\n132#2,18:92\n152#2:129\n175#3:88\n694#4,2:110\n706#4,2:112\n708#4,11:118\n53#5,4:114\n*S KotlinDebug\n*F\n+ 1 Settings.kt\nandroidx/compose/material/icons/rounded/SettingsKt\n*L\n29#1:84\n29#1:85,3\n29#1:89,3\n30#1:92,18\n30#1:129\n29#1:88\n30#1:110,2\n30#1:112,2\n30#1:118,11\n30#1:114,4\n*E\n"
    }
.end annotation


# static fields
.field private static _settings:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getSettings(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
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
    sget-object v0, Landroidx/compose/material/icons/rounded/SettingsKt;->_settings:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.Settings"

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
    const/high16 v0, 0x419c0000    # 19.5f

    .line 93
    .line 94
    const/high16 v1, 0x41400000    # 12.0f

    .line 95
    .line 96
    invoke-virtual {v7, v0, v1}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 97
    .line 98
    .line 99
    const/4 v1, 0x0

    .line 100
    const v2, -0x41947ae1    # -0.23f

    .line 101
    .line 102
    .line 103
    const v3, -0x43dc28f6    # -0.01f

    .line 104
    .line 105
    .line 106
    const v4, -0x4119999a    # -0.45f

    .line 107
    .line 108
    .line 109
    const v5, -0x430a3d71    # -0.03f

    .line 110
    .line 111
    .line 112
    const v6, -0x40d1eb85    # -0.68f

    .line 113
    .line 114
    .line 115
    move-object v0, v7

    .line 116
    invoke-virtual/range {v0 .. v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 117
    .line 118
    .line 119
    const v8, 0x3fee147b    # 1.86f

    .line 120
    .line 121
    .line 122
    const v9, -0x404b851f    # -1.41f

    .line 123
    .line 124
    .line 125
    invoke-virtual {v7, v8, v9}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 126
    .line 127
    .line 128
    const v1, 0x3ecccccd    # 0.4f

    .line 129
    .line 130
    .line 131
    const v2, -0x41666666    # -0.3f

    .line 132
    .line 133
    .line 134
    const v3, 0x3f028f5c    # 0.51f

    .line 135
    .line 136
    .line 137
    const v4, -0x40a3d70a    # -0.86f

    .line 138
    .line 139
    .line 140
    const v5, 0x3e851eb8    # 0.26f

    .line 141
    .line 142
    .line 143
    const v6, -0x4059999a    # -1.3f

    .line 144
    .line 145
    .line 146
    invoke-virtual/range {v0 .. v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 147
    .line 148
    .line 149
    const v0, -0x4010a3d7    # -1.87f

    .line 150
    .line 151
    .line 152
    const v10, -0x3fb147ae    # -3.23f

    .line 153
    .line 154
    .line 155
    invoke-virtual {v7, v0, v10}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 156
    .line 157
    .line 158
    const/high16 v1, -0x41800000    # -0.25f

    .line 159
    .line 160
    const v2, -0x411eb852    # -0.44f

    .line 161
    .line 162
    .line 163
    const v3, -0x40b5c28f    # -0.79f

    .line 164
    .line 165
    .line 166
    const v4, -0x40e147ae    # -0.62f

    .line 167
    .line 168
    .line 169
    const/high16 v5, -0x40600000    # -1.25f

    .line 170
    .line 171
    const v6, -0x4128f5c3    # -0.42f

    .line 172
    .line 173
    .line 174
    move-object v0, v7

    .line 175
    invoke-virtual/range {v0 .. v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 176
    .line 177
    .line 178
    const v0, -0x3ff66666    # -2.15f

    .line 179
    .line 180
    .line 181
    const v11, 0x3f68f5c3    # 0.91f

    .line 182
    .line 183
    .line 184
    invoke-virtual {v7, v0, v11}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 185
    .line 186
    .line 187
    const v1, -0x41428f5c    # -0.37f

    .line 188
    .line 189
    .line 190
    const v2, -0x417ae148    # -0.26f

    .line 191
    .line 192
    .line 193
    const v3, -0x40bd70a4    # -0.76f

    .line 194
    .line 195
    .line 196
    const v4, -0x41051eb8    # -0.49f

    .line 197
    .line 198
    .line 199
    const v5, -0x406a3d71    # -1.17f

    .line 200
    .line 201
    .line 202
    const v6, -0x40d1eb85    # -0.68f

    .line 203
    .line 204
    .line 205
    move-object v0, v7

    .line 206
    invoke-virtual/range {v0 .. v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 207
    .line 208
    .line 209
    const v0, -0x416b851f    # -0.29f

    .line 210
    .line 211
    .line 212
    const v12, -0x3fec28f6    # -2.31f

    .line 213
    .line 214
    .line 215
    invoke-virtual {v7, v0, v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 216
    .line 217
    .line 218
    const v1, 0x416ccccd    # 14.8f

    .line 219
    .line 220
    .line 221
    const v2, 0x401851ec    # 2.38f

    .line 222
    .line 223
    .line 224
    const v3, 0x4165eb85    # 14.37f

    .line 225
    .line 226
    .line 227
    const/high16 v4, 0x40000000    # 2.0f

    .line 228
    .line 229
    const v5, 0x415deb85    # 13.87f

    .line 230
    .line 231
    .line 232
    const/high16 v6, 0x40000000    # 2.0f

    .line 233
    .line 234
    move-object v0, v7

    .line 235
    invoke-virtual/range {v0 .. v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 236
    .line 237
    .line 238
    const v0, -0x3f9147ae    # -3.73f

    .line 239
    .line 240
    .line 241
    invoke-virtual {v7, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 242
    .line 243
    .line 244
    const v1, 0x411a147b    # 9.63f

    .line 245
    .line 246
    .line 247
    const/high16 v2, 0x40000000    # 2.0f

    .line 248
    .line 249
    const v3, 0x41133333    # 9.2f

    .line 250
    .line 251
    .line 252
    const v4, 0x401851ec    # 2.38f

    .line 253
    .line 254
    .line 255
    const v5, 0x41123d71    # 9.14f

    .line 256
    .line 257
    .line 258
    const v6, 0x403851ec    # 2.88f

    .line 259
    .line 260
    .line 261
    move-object v0, v7

    .line 262
    invoke-virtual/range {v0 .. v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 263
    .line 264
    .line 265
    const v0, 0x410d999a    # 8.85f

    .line 266
    .line 267
    .line 268
    const v1, 0x40a6147b    # 5.19f

    .line 269
    .line 270
    .line 271
    invoke-virtual {v7, v0, v1}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 272
    .line 273
    .line 274
    const v1, -0x412e147b    # -0.41f

    .line 275
    .line 276
    .line 277
    const v2, 0x3e428f5c    # 0.19f

    .line 278
    .line 279
    .line 280
    const v3, -0x40b33333    # -0.8f

    .line 281
    .line 282
    .line 283
    const v4, 0x3ed70a3d    # 0.42f

    .line 284
    .line 285
    .line 286
    const v5, -0x406a3d71    # -1.17f

    .line 287
    .line 288
    .line 289
    const v6, 0x3f2e147b    # 0.68f

    .line 290
    .line 291
    .line 292
    move-object v0, v7

    .line 293
    invoke-virtual/range {v0 .. v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 294
    .line 295
    .line 296
    const v0, 0x40b0f5c3    # 5.53f

    .line 297
    .line 298
    .line 299
    const v1, 0x409eb852    # 4.96f

    .line 300
    .line 301
    .line 302
    invoke-virtual {v7, v0, v1}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 303
    .line 304
    .line 305
    const v1, -0x41147ae1    # -0.46f

    .line 306
    .line 307
    .line 308
    const v2, -0x41b33333    # -0.2f

    .line 309
    .line 310
    .line 311
    const/high16 v3, -0x40800000    # -1.0f

    .line 312
    .line 313
    const v4, -0x435c28f6    # -0.02f

    .line 314
    .line 315
    .line 316
    const/high16 v5, -0x40600000    # -1.25f

    .line 317
    .line 318
    const v6, 0x3ed70a3d    # 0.42f

    .line 319
    .line 320
    .line 321
    move-object v0, v7

    .line 322
    invoke-virtual/range {v0 .. v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 323
    .line 324
    .line 325
    const v0, 0x401a3d71    # 2.41f

    .line 326
    .line 327
    .line 328
    const v1, 0x4109eb85    # 8.62f

    .line 329
    .line 330
    .line 331
    invoke-virtual {v7, v0, v1}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 332
    .line 333
    .line 334
    const/high16 v1, -0x41800000    # -0.25f

    .line 335
    .line 336
    const v2, 0x3ee147ae    # 0.44f

    .line 337
    .line 338
    .line 339
    const v3, -0x41f0a3d7    # -0.14f

    .line 340
    .line 341
    .line 342
    const v4, 0x3f7d70a4    # 0.99f

    .line 343
    .line 344
    .line 345
    const v5, 0x3e851eb8    # 0.26f

    .line 346
    .line 347
    .line 348
    const v6, 0x3fa66666    # 1.3f

    .line 349
    .line 350
    .line 351
    move-object v0, v7

    .line 352
    invoke-virtual/range {v0 .. v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 353
    .line 354
    .line 355
    const v14, 0x3fb47ae1    # 1.41f

    .line 356
    .line 357
    .line 358
    invoke-virtual {v7, v8, v14}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 359
    .line 360
    .line 361
    const v1, 0x409051ec    # 4.51f

    .line 362
    .line 363
    .line 364
    const v2, 0x4138cccd    # 11.55f

    .line 365
    .line 366
    .line 367
    const/high16 v3, 0x40900000    # 4.5f

    .line 368
    .line 369
    const v4, 0x413c51ec    # 11.77f

    .line 370
    .line 371
    .line 372
    const/high16 v5, 0x40900000    # 4.5f

    .line 373
    .line 374
    const/high16 v6, 0x41400000    # 12.0f

    .line 375
    .line 376
    invoke-virtual/range {v0 .. v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 377
    .line 378
    .line 379
    const v0, 0x3cf5c28f    # 0.03f

    .line 380
    .line 381
    .line 382
    const v1, 0x3f2e147b    # 0.68f

    .line 383
    .line 384
    .line 385
    const v2, 0x3c23d70a    # 0.01f

    .line 386
    .line 387
    .line 388
    const v3, 0x3ee66666    # 0.45f

    .line 389
    .line 390
    .line 391
    invoke-virtual {v7, v2, v3, v0, v1}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 392
    .line 393
    .line 394
    const v8, -0x4011eb85    # -1.86f

    .line 395
    .line 396
    .line 397
    invoke-virtual {v7, v8, v14}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 398
    .line 399
    .line 400
    const v1, -0x41333333    # -0.4f

    .line 401
    .line 402
    .line 403
    const v2, 0x3e99999a    # 0.3f

    .line 404
    .line 405
    .line 406
    const v3, -0x40fd70a4    # -0.51f

    .line 407
    .line 408
    .line 409
    const v4, 0x3f5c28f6    # 0.86f

    .line 410
    .line 411
    .line 412
    const v5, -0x417ae148    # -0.26f

    .line 413
    .line 414
    .line 415
    const v6, 0x3fa66666    # 1.3f

    .line 416
    .line 417
    .line 418
    move-object v0, v7

    .line 419
    invoke-virtual/range {v0 .. v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 420
    .line 421
    .line 422
    const v0, 0x404eb852    # 3.23f

    .line 423
    .line 424
    .line 425
    const v14, 0x3fef5c29    # 1.87f

    .line 426
    .line 427
    .line 428
    invoke-virtual {v7, v14, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 429
    .line 430
    .line 431
    const/high16 v1, 0x3e800000    # 0.25f

    .line 432
    .line 433
    const v2, 0x3ee147ae    # 0.44f

    .line 434
    .line 435
    .line 436
    const v3, 0x3f4a3d71    # 0.79f

    .line 437
    .line 438
    .line 439
    const v4, 0x3f1eb852    # 0.62f

    .line 440
    .line 441
    .line 442
    const/high16 v5, 0x3fa00000    # 1.25f

    .line 443
    .line 444
    const v6, 0x3ed70a3d    # 0.42f

    .line 445
    .line 446
    .line 447
    move-object v0, v7

    .line 448
    invoke-virtual/range {v0 .. v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 449
    .line 450
    .line 451
    const v0, -0x40970a3d    # -0.91f

    .line 452
    .line 453
    .line 454
    const v6, 0x4009999a    # 2.15f

    .line 455
    .line 456
    .line 457
    invoke-virtual {v7, v6, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 458
    .line 459
    .line 460
    const v1, 0x3ebd70a4    # 0.37f

    .line 461
    .line 462
    .line 463
    const v2, 0x3e851eb8    # 0.26f

    .line 464
    .line 465
    .line 466
    const v3, 0x3f428f5c    # 0.76f

    .line 467
    .line 468
    .line 469
    const v4, 0x3efae148    # 0.49f

    .line 470
    .line 471
    .line 472
    const v5, 0x3f95c28f    # 1.17f

    .line 473
    .line 474
    .line 475
    const v25, 0x3f2e147b    # 0.68f

    .line 476
    .line 477
    .line 478
    move-object v0, v7

    .line 479
    move v8, v6

    .line 480
    move/from16 v6, v25

    .line 481
    .line 482
    invoke-virtual/range {v0 .. v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 483
    .line 484
    .line 485
    const v0, 0x4013d70a    # 2.31f

    .line 486
    .line 487
    .line 488
    const v6, 0x3e947ae1    # 0.29f

    .line 489
    .line 490
    .line 491
    invoke-virtual {v7, v6, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 492
    .line 493
    .line 494
    const v1, 0x41133333    # 9.2f

    .line 495
    .line 496
    .line 497
    const v2, 0x41acf5c3    # 21.62f

    .line 498
    .line 499
    .line 500
    const v3, 0x411a147b    # 9.63f

    .line 501
    .line 502
    .line 503
    const/high16 v4, 0x41b00000    # 22.0f

    .line 504
    .line 505
    const v5, 0x4122147b    # 10.13f

    .line 506
    .line 507
    .line 508
    const/high16 v25, 0x41b00000    # 22.0f

    .line 509
    .line 510
    move-object v0, v7

    .line 511
    move v9, v6

    .line 512
    move/from16 v6, v25

    .line 513
    .line 514
    invoke-virtual/range {v0 .. v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 515
    .line 516
    .line 517
    const v0, 0x406eb852    # 3.73f

    .line 518
    .line 519
    .line 520
    invoke-virtual {v7, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 521
    .line 522
    .line 523
    const/high16 v1, 0x3f000000    # 0.5f

    .line 524
    .line 525
    const/4 v2, 0x0

    .line 526
    const v3, 0x3f6e147b    # 0.93f

    .line 527
    .line 528
    .line 529
    const v4, -0x413d70a4    # -0.38f

    .line 530
    .line 531
    .line 532
    const v5, 0x3f7d70a4    # 0.99f

    .line 533
    .line 534
    .line 535
    const v6, -0x409eb852    # -0.88f

    .line 536
    .line 537
    .line 538
    move-object v0, v7

    .line 539
    invoke-virtual/range {v0 .. v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 540
    .line 541
    .line 542
    invoke-virtual {v7, v9, v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 543
    .line 544
    .line 545
    const v1, 0x3ed1eb85    # 0.41f

    .line 546
    .line 547
    .line 548
    const v2, -0x41bd70a4    # -0.19f

    .line 549
    .line 550
    .line 551
    const v3, 0x3f4ccccd    # 0.8f

    .line 552
    .line 553
    .line 554
    const v4, -0x4128f5c3    # -0.42f

    .line 555
    .line 556
    .line 557
    const v5, 0x3f95c28f    # 1.17f

    .line 558
    .line 559
    .line 560
    const v6, -0x40d1eb85    # -0.68f

    .line 561
    .line 562
    .line 563
    invoke-virtual/range {v0 .. v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 564
    .line 565
    .line 566
    invoke-virtual {v7, v8, v11}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 567
    .line 568
    .line 569
    const v1, 0x3eeb851f    # 0.46f

    .line 570
    .line 571
    .line 572
    const v2, 0x3e4ccccd    # 0.2f

    .line 573
    .line 574
    .line 575
    const/high16 v3, 0x3f800000    # 1.0f

    .line 576
    .line 577
    const v4, 0x3ca3d70a    # 0.02f

    .line 578
    .line 579
    .line 580
    const/high16 v5, 0x3fa00000    # 1.25f

    .line 581
    .line 582
    const v6, -0x4128f5c3    # -0.42f

    .line 583
    .line 584
    .line 585
    invoke-virtual/range {v0 .. v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 586
    .line 587
    .line 588
    invoke-virtual {v7, v14, v10}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 589
    .line 590
    .line 591
    const/high16 v1, 0x3e800000    # 0.25f

    .line 592
    .line 593
    const v2, -0x411eb852    # -0.44f

    .line 594
    .line 595
    .line 596
    const v3, 0x3e0f5c29    # 0.14f

    .line 597
    .line 598
    .line 599
    const v4, -0x40828f5c    # -0.99f

    .line 600
    .line 601
    .line 602
    const v5, -0x417ae148    # -0.26f

    .line 603
    .line 604
    .line 605
    const v6, -0x4059999a    # -1.3f

    .line 606
    .line 607
    .line 608
    invoke-virtual/range {v0 .. v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 609
    .line 610
    .line 611
    const v0, -0x4011eb85    # -1.86f

    .line 612
    .line 613
    .line 614
    const v1, -0x404b851f    # -1.41f

    .line 615
    .line 616
    .line 617
    invoke-virtual {v7, v0, v1}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 618
    .line 619
    .line 620
    const v1, 0x419beb85    # 19.49f

    .line 621
    .line 622
    .line 623
    const v2, 0x41473333    # 12.45f

    .line 624
    .line 625
    .line 626
    const/high16 v3, 0x419c0000    # 19.5f

    .line 627
    .line 628
    const v4, 0x4143ae14    # 12.23f

    .line 629
    .line 630
    .line 631
    const/high16 v5, 0x419c0000    # 19.5f

    .line 632
    .line 633
    const/high16 v6, 0x41400000    # 12.0f

    .line 634
    .line 635
    move-object v0, v7

    .line 636
    invoke-virtual/range {v0 .. v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 637
    .line 638
    .line 639
    invoke-virtual {v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 640
    .line 641
    .line 642
    const v8, 0x4140a3d7    # 12.04f

    .line 643
    .line 644
    .line 645
    const/high16 v9, 0x41780000    # 15.5f

    .line 646
    .line 647
    invoke-virtual {v7, v8, v9}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 648
    .line 649
    .line 650
    const v1, -0x4008f5c3    # -1.93f

    .line 651
    .line 652
    .line 653
    const/4 v2, 0x0

    .line 654
    const/high16 v3, -0x3fa00000    # -3.5f

    .line 655
    .line 656
    const v4, -0x40370a3d    # -1.57f

    .line 657
    .line 658
    .line 659
    const/high16 v5, -0x3fa00000    # -3.5f

    .line 660
    .line 661
    const/high16 v6, -0x3fa00000    # -3.5f

    .line 662
    .line 663
    invoke-virtual/range {v0 .. v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 664
    .line 665
    .line 666
    const v0, 0x3fc8f5c3    # 1.57f

    .line 667
    .line 668
    .line 669
    const/high16 v1, -0x3fa00000    # -3.5f

    .line 670
    .line 671
    const/high16 v2, 0x40600000    # 3.5f

    .line 672
    .line 673
    invoke-virtual {v7, v0, v1, v2, v1}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 674
    .line 675
    .line 676
    invoke-virtual {v7, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 677
    .line 678
    .line 679
    const v0, 0x415f851f    # 13.97f

    .line 680
    .line 681
    .line 682
    invoke-virtual {v7, v0, v9, v8, v9}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 683
    .line 684
    .line 685
    invoke-virtual {v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 686
    .line 687
    .line 688
    invoke-virtual {v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 689
    .line 690
    .line 691
    move-result-object v14

    .line 692
    const/16 v25, 0x0

    .line 693
    .line 694
    const/16 v26, 0x0

    .line 695
    .line 696
    const/16 v27, 0x0

    .line 697
    .line 698
    const/16 v28, 0x3800

    .line 699
    .line 700
    const/16 v29, 0x0

    .line 701
    .line 702
    invoke-static/range {v13 .. v29}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 703
    .line 704
    .line 705
    move-result-object v0

    .line 706
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 707
    .line 708
    .line 709
    move-result-object v0

    .line 710
    sput-object v0, Landroidx/compose/material/icons/rounded/SettingsKt;->_settings:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 711
    .line 712
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 713
    .line 714
    .line 715
    return-object v0
.end method
