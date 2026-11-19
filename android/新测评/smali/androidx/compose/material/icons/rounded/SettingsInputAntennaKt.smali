.class public final Landroidx/compose/material/icons/rounded/SettingsInputAntennaKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_settingsInputAntenna",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "SettingsInputAntenna",
        "Landroidx/compose/material/icons/Icons$Rounded;",
        "getSettingsInputAntenna",
        "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;",
        "material-icons-extended_release"
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
        "SMAP\nSettingsInputAntenna.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SettingsInputAntenna.kt\nandroidx/compose/material/icons/rounded/SettingsInputAntennaKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,73:1\n212#2,12:74\n233#2,18:87\n253#2:124\n174#3:86\n705#4,2:105\n717#4,2:107\n719#4,11:113\n72#5,4:109\n*S KotlinDebug\n*F\n+ 1 SettingsInputAntenna.kt\nandroidx/compose/material/icons/rounded/SettingsInputAntennaKt\n*L\n29#1:74,12\n30#1:87,18\n30#1:124\n29#1:86\n30#1:105,2\n30#1:107,2\n30#1:113,11\n30#1:109,4\n*E\n"
    }
.end annotation


# static fields
.field private static _settingsInputAntenna:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getSettingsInputAntenna(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/SettingsInputAntennaKt;->_settingsInputAntenna:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

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
    const-string v2, "Rounded.SettingsInputAntenna"

    .line 33
    .line 34
    invoke-direct/range {v1 .. v12}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;-><init>(Ljava/lang/String;FFFFJIZILkotlin/jvm/internal/DefaultConstructorMarker;)V

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
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

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
    const/high16 v0, 0x40a00000    # 5.0f

    .line 71
    .line 72
    const/high16 v2, 0x41400000    # 12.0f

    .line 73
    .line 74
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const v17, -0x3f22e148    # -6.91f

    .line 78
    .line 79
    .line 80
    const v18, 0x40bbd70a    # 5.87f

    .line 81
    .line 82
    .line 83
    const v13, -0x3fa147ae    # -3.48f

    .line 84
    .line 85
    .line 86
    const/4 v14, 0x0

    .line 87
    const v15, -0x3f3428f6    # -6.37f

    .line 88
    .line 89
    .line 90
    const v16, 0x40228f5c    # 2.54f

    .line 91
    .line 92
    .line 93
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 94
    .line 95
    .line 96
    const/high16 v17, 0x3f800000    # 1.0f

    .line 97
    .line 98
    const v18, 0x3f90a3d7    # 1.13f

    .line 99
    .line 100
    .line 101
    const v13, -0x42333333    # -0.1f

    .line 102
    .line 103
    .line 104
    const v14, 0x3f170a3d    # 0.59f

    .line 105
    .line 106
    .line 107
    const v15, 0x3ec7ae14    # 0.39f

    .line 108
    .line 109
    .line 110
    const v16, 0x3f90a3d7    # 1.13f

    .line 111
    .line 112
    .line 113
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 114
    .line 115
    .line 116
    const v17, 0x3f7ae148    # 0.98f

    .line 117
    .line 118
    .line 119
    const v18, -0x40a66666    # -0.85f

    .line 120
    .line 121
    .line 122
    const v13, 0x3efae148    # 0.49f

    .line 123
    .line 124
    .line 125
    const/4 v14, 0x0

    .line 126
    const v15, 0x3f666666    # 0.9f

    .line 127
    .line 128
    .line 129
    const v16, -0x4147ae14    # -0.36f

    .line 130
    .line 131
    .line 132
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 133
    .line 134
    .line 135
    const/high16 v17, 0x41400000    # 12.0f

    .line 136
    .line 137
    const/high16 v18, 0x40e00000    # 7.0f

    .line 138
    .line 139
    const v13, 0x40ef5c29    # 7.48f

    .line 140
    .line 141
    .line 142
    const v14, 0x410ca3d7    # 8.79f

    .line 143
    .line 144
    .line 145
    const v15, 0x41187ae1    # 9.53f

    .line 146
    .line 147
    .line 148
    const/high16 v16, 0x40e00000    # 7.0f

    .line 149
    .line 150
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 151
    .line 152
    .line 153
    const v0, 0x409dc28f    # 4.93f

    .line 154
    .line 155
    .line 156
    const v2, 0x4084cccd    # 4.15f

    .line 157
    .line 158
    .line 159
    const v4, 0x4090a3d7    # 4.52f

    .line 160
    .line 161
    .line 162
    const v6, 0x3fe51eb8    # 1.79f

    .line 163
    .line 164
    .line 165
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 166
    .line 167
    .line 168
    const v17, 0x3f7ae148    # 0.98f

    .line 169
    .line 170
    .line 171
    const v18, 0x3f59999a    # 0.85f

    .line 172
    .line 173
    .line 174
    const v13, 0x3da3d70a    # 0.08f

    .line 175
    .line 176
    .line 177
    const v14, 0x3efae148    # 0.49f

    .line 178
    .line 179
    .line 180
    const v15, 0x3efae148    # 0.49f

    .line 181
    .line 182
    .line 183
    const v16, 0x3f59999a    # 0.85f

    .line 184
    .line 185
    .line 186
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 187
    .line 188
    .line 189
    const v17, 0x3f7d70a4    # 0.99f

    .line 190
    .line 191
    .line 192
    const v18, -0x406f5c29    # -1.13f

    .line 193
    .line 194
    .line 195
    const v13, 0x3f1c28f6    # 0.61f

    .line 196
    .line 197
    .line 198
    const/4 v14, 0x0

    .line 199
    const v15, 0x3f8b851f    # 1.09f

    .line 200
    .line 201
    .line 202
    const v16, -0x40f5c28f    # -0.54f

    .line 203
    .line 204
    .line 205
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 206
    .line 207
    .line 208
    const/high16 v17, 0x41400000    # 12.0f

    .line 209
    .line 210
    const/high16 v18, 0x40a00000    # 5.0f

    .line 211
    .line 212
    const v13, 0x4192f5c3    # 18.37f

    .line 213
    .line 214
    .line 215
    const v14, 0x40f147ae    # 7.54f

    .line 216
    .line 217
    .line 218
    const v15, 0x4177ae14    # 15.48f

    .line 219
    .line 220
    .line 221
    const/high16 v16, 0x40a00000    # 5.0f

    .line 222
    .line 223
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 224
    .line 225
    .line 226
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 227
    .line 228
    .line 229
    const v0, 0x4164a3d7    # 14.29f

    .line 230
    .line 231
    .line 232
    const/high16 v2, 0x41500000    # 13.0f

    .line 233
    .line 234
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 235
    .line 236
    .line 237
    const v17, 0x3fb47ae1    # 1.41f

    .line 238
    .line 239
    .line 240
    const v18, -0x3fc0a3d7    # -2.99f

    .line 241
    .line 242
    .line 243
    const v13, 0x3f88f5c3    # 1.07f

    .line 244
    .line 245
    .line 246
    const v14, -0x410a3d71    # -0.48f

    .line 247
    .line 248
    .line 249
    const v15, 0x3fe147ae    # 1.76f

    .line 250
    .line 251
    .line 252
    const v16, -0x402b851f    # -1.66f

    .line 253
    .line 254
    .line 255
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 256
    .line 257
    .line 258
    const v17, -0x4028f5c3    # -1.68f

    .line 259
    .line 260
    .line 261
    const v18, -0x40266666    # -1.7f

    .line 262
    .line 263
    .line 264
    const v13, -0x419eb852    # -0.22f

    .line 265
    .line 266
    .line 267
    const v14, -0x40b0a3d7    # -0.81f

    .line 268
    .line 269
    .line 270
    const v15, -0x40a147ae    # -0.87f

    .line 271
    .line 272
    .line 273
    const v16, -0x4043d70a    # -1.47f

    .line 274
    .line 275
    .line 276
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 277
    .line 278
    .line 279
    const/high16 v17, 0x41180000    # 9.5f

    .line 280
    .line 281
    const/high16 v18, 0x41400000    # 12.0f

    .line 282
    .line 283
    const v13, 0x4130a3d7    # 11.04f

    .line 284
    .line 285
    .line 286
    const v14, 0x4111eb85    # 9.12f

    .line 287
    .line 288
    .line 289
    const/high16 v15, 0x41180000    # 9.5f

    .line 290
    .line 291
    const v16, 0x4126147b    # 10.38f

    .line 292
    .line 293
    .line 294
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 295
    .line 296
    .line 297
    const/high16 v17, 0x3fc00000    # 1.5f

    .line 298
    .line 299
    const v18, 0x40128f5c    # 2.29f

    .line 300
    .line 301
    .line 302
    const/4 v13, 0x0

    .line 303
    const v14, 0x3f828f5c    # 1.02f

    .line 304
    .line 305
    .line 306
    const v15, 0x3f1eb852    # 0.62f

    .line 307
    .line 308
    .line 309
    const v16, 0x3ff33333    # 1.9f

    .line 310
    .line 311
    .line 312
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 313
    .line 314
    .line 315
    const v0, 0x40533333    # 3.3f

    .line 316
    .line 317
    .line 318
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 319
    .line 320
    .line 321
    const v0, -0x3fd28f5c    # -2.71f

    .line 322
    .line 323
    .line 324
    const v2, 0x402ccccd    # 2.7f

    .line 325
    .line 326
    .line 327
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 328
    .line 329
    .line 330
    const/16 v17, 0x0

    .line 331
    .line 332
    const v18, 0x3fb47ae1    # 1.41f

    .line 333
    .line 334
    .line 335
    const v13, -0x413851ec    # -0.39f

    .line 336
    .line 337
    .line 338
    const v14, 0x3ec7ae14    # 0.39f

    .line 339
    .line 340
    .line 341
    const v15, -0x413851ec    # -0.39f

    .line 342
    .line 343
    .line 344
    const v16, 0x3f828f5c    # 1.02f

    .line 345
    .line 346
    .line 347
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 348
    .line 349
    .line 350
    const v17, 0x3fb47ae1    # 1.41f

    .line 351
    .line 352
    .line 353
    const/16 v18, 0x0

    .line 354
    .line 355
    const v13, 0x3ec7ae14    # 0.39f

    .line 356
    .line 357
    .line 358
    const v15, 0x3f828f5c    # 1.02f

    .line 359
    .line 360
    .line 361
    const v16, 0x3ec7ae14    # 0.39f

    .line 362
    .line 363
    .line 364
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 365
    .line 366
    .line 367
    const v0, -0x3feccccd    # -2.3f

    .line 368
    .line 369
    .line 370
    const v2, 0x40133333    # 2.3f

    .line 371
    .line 372
    .line 373
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 374
    .line 375
    .line 376
    const v0, 0x40133333    # 2.3f

    .line 377
    .line 378
    .line 379
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 380
    .line 381
    .line 382
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 383
    .line 384
    .line 385
    const/4 v0, 0x0

    .line 386
    const v2, -0x404b851f    # -1.41f

    .line 387
    .line 388
    .line 389
    const v4, 0x3ec7ae14    # 0.39f

    .line 390
    .line 391
    .line 392
    const v6, -0x407d70a4    # -1.02f

    .line 393
    .line 394
    .line 395
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 396
    .line 397
    .line 398
    const v0, 0x418cb852    # 17.59f

    .line 399
    .line 400
    .line 401
    const/high16 v2, 0x41500000    # 13.0f

    .line 402
    .line 403
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 404
    .line 405
    .line 406
    const v0, 0x4164a3d7    # 14.29f

    .line 407
    .line 408
    .line 409
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 410
    .line 411
    .line 412
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 413
    .line 414
    .line 415
    const/high16 v0, 0x3f800000    # 1.0f

    .line 416
    .line 417
    const/high16 v2, 0x41400000    # 12.0f

    .line 418
    .line 419
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 420
    .line 421
    .line 422
    const v17, 0x3f866666    # 1.05f

    .line 423
    .line 424
    .line 425
    const v18, 0x412e6666    # 10.9f

    .line 426
    .line 427
    .line 428
    const v13, 0x40c9999a    # 6.3f

    .line 429
    .line 430
    .line 431
    const/high16 v14, 0x3f800000    # 1.0f

    .line 432
    .line 433
    const v15, 0x3fce147b    # 1.61f

    .line 434
    .line 435
    .line 436
    const v16, 0x40aae148    # 5.34f

    .line 437
    .line 438
    .line 439
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 440
    .line 441
    .line 442
    const v17, 0x40033333    # 2.05f

    .line 443
    .line 444
    .line 445
    const/high16 v18, 0x41400000    # 12.0f

    .line 446
    .line 447
    const/high16 v13, 0x3f800000    # 1.0f

    .line 448
    .line 449
    const v14, 0x4137d70a    # 11.49f

    .line 450
    .line 451
    .line 452
    const v15, 0x3fbae148    # 1.46f

    .line 453
    .line 454
    .line 455
    const/high16 v16, 0x41400000    # 12.0f

    .line 456
    .line 457
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 458
    .line 459
    .line 460
    const v17, 0x3f7d70a4    # 0.99f

    .line 461
    .line 462
    .line 463
    const v18, -0x409eb852    # -0.88f

    .line 464
    .line 465
    .line 466
    const v13, 0x3f028f5c    # 0.51f

    .line 467
    .line 468
    .line 469
    const/4 v14, 0x0

    .line 470
    const v15, 0x3f70a3d7    # 0.94f

    .line 471
    .line 472
    .line 473
    const v16, -0x413d70a4    # -0.38f

    .line 474
    .line 475
    .line 476
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 477
    .line 478
    .line 479
    const/high16 v17, 0x41400000    # 12.0f

    .line 480
    .line 481
    const/high16 v18, 0x40400000    # 3.0f

    .line 482
    .line 483
    const v13, 0x405eb852    # 3.48f

    .line 484
    .line 485
    .line 486
    const v14, 0x40d1eb85    # 6.56f

    .line 487
    .line 488
    .line 489
    const v15, 0x40ea8f5c    # 7.33f

    .line 490
    .line 491
    .line 492
    const/high16 v16, 0x40400000    # 3.0f

    .line 493
    .line 494
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 495
    .line 496
    .line 497
    const v0, 0x410f5c29    # 8.96f

    .line 498
    .line 499
    .line 500
    const v2, 0x4101eb85    # 8.12f

    .line 501
    .line 502
    .line 503
    const v4, 0x410851ec    # 8.52f

    .line 504
    .line 505
    .line 506
    const v6, 0x4063d70a    # 3.56f

    .line 507
    .line 508
    .line 509
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 510
    .line 511
    .line 512
    const v17, 0x3f7d70a4    # 0.99f

    .line 513
    .line 514
    .line 515
    const v18, 0x3f6147ae    # 0.88f

    .line 516
    .line 517
    .line 518
    const v13, 0x3d4ccccd    # 0.05f

    .line 519
    .line 520
    .line 521
    const/high16 v14, 0x3f000000    # 0.5f

    .line 522
    .line 523
    const v15, 0x3ef5c28f    # 0.48f

    .line 524
    .line 525
    .line 526
    const v16, 0x3f6147ae    # 0.88f

    .line 527
    .line 528
    .line 529
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 530
    .line 531
    .line 532
    const/high16 v17, 0x3f800000    # 1.0f

    .line 533
    .line 534
    const v18, -0x40733333    # -1.1f

    .line 535
    .line 536
    .line 537
    const v13, 0x3f170a3d    # 0.59f

    .line 538
    .line 539
    .line 540
    const/4 v14, 0x0

    .line 541
    const v15, 0x3f87ae14    # 1.06f

    .line 542
    .line 543
    .line 544
    const v16, -0x40fd70a4    # -0.51f

    .line 545
    .line 546
    .line 547
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 548
    .line 549
    .line 550
    const/high16 v17, 0x41400000    # 12.0f

    .line 551
    .line 552
    const/high16 v18, 0x3f800000    # 1.0f

    .line 553
    .line 554
    const v13, 0x41b31eb8    # 22.39f

    .line 555
    .line 556
    .line 557
    const v14, 0x40aae148    # 5.34f

    .line 558
    .line 559
    .line 560
    const v15, 0x418d999a    # 17.7f

    .line 561
    .line 562
    .line 563
    const/high16 v16, 0x3f800000    # 1.0f

    .line 564
    .line 565
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 566
    .line 567
    .line 568
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 569
    .line 570
    .line 571
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 572
    .line 573
    .line 574
    move-result-object v2

    .line 575
    const/16 v16, 0x3800

    .line 576
    .line 577
    const/16 v17, 0x0

    .line 578
    .line 579
    const/high16 v6, 0x3f800000    # 1.0f

    .line 580
    .line 581
    const/high16 v8, 0x3f800000    # 1.0f

    .line 582
    .line 583
    const/4 v7, 0x0

    .line 584
    const/high16 v9, 0x3f800000    # 1.0f

    .line 585
    .line 586
    const/high16 v12, 0x3f800000    # 1.0f

    .line 587
    .line 588
    const/4 v13, 0x0

    .line 589
    const/4 v14, 0x0

    .line 590
    const/4 v15, 0x0

    .line 591
    const-string v4, ""

    .line 592
    .line 593
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 594
    .line 595
    .line 596
    move-result-object v0

    .line 597
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 598
    .line 599
    .line 600
    move-result-object v0

    .line 601
    sput-object v0, Landroidx/compose/material/icons/rounded/SettingsInputAntennaKt;->_settingsInputAntenna:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 602
    .line 603
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 604
    .line 605
    .line 606
    return-object v0
.end method
