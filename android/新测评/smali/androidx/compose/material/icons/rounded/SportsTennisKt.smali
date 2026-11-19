.class public final Landroidx/compose/material/icons/rounded/SportsTennisKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_sportsTennis",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "SportsTennis",
        "Landroidx/compose/material/icons/Icons$Rounded;",
        "getSportsTennis",
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
        "SMAP\nSportsTennis.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SportsTennis.kt\nandroidx/compose/material/icons/rounded/SportsTennisKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,74:1\n212#2,12:75\n233#2,18:88\n253#2:125\n233#2,18:126\n253#2:163\n174#3:87\n705#4,2:106\n717#4,2:108\n719#4,11:114\n705#4,2:144\n717#4,2:146\n719#4,11:152\n72#5,4:110\n72#5,4:148\n*S KotlinDebug\n*F\n+ 1 SportsTennis.kt\nandroidx/compose/material/icons/rounded/SportsTennisKt\n*L\n29#1:75,12\n30#1:88,18\n30#1:125\n51#1:126,18\n51#1:163\n29#1:87\n30#1:106,2\n30#1:108,2\n30#1:114,11\n51#1:144,2\n51#1:146,2\n51#1:152,11\n30#1:110,4\n51#1:148,4\n*E\n"
    }
.end annotation


# static fields
.field private static _sportsTennis:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getSportsTennis(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/SportsTennisKt;->_sportsTennis:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.SportsTennis"

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
    const/4 v2, 0x0

    .line 50
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 51
    .line 52
    .line 53
    sget-object v18, Landroidx/compose/ui/graphics/StrokeCap;->Companion:Landroidx/compose/ui/graphics/StrokeCap$Companion;

    .line 54
    .line 55
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 56
    .line 57
    .line 58
    move-result v10

    .line 59
    sget-object v19, Landroidx/compose/ui/graphics/StrokeJoin;->Companion:Landroidx/compose/ui/graphics/StrokeJoin$Companion;

    .line 60
    .line 61
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 62
    .line 63
    .line 64
    move-result v11

    .line 65
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 66
    .line 67
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 68
    .line 69
    .line 70
    const v4, 0x419c28f6    # 19.52f

    .line 71
    .line 72
    .line 73
    const v6, 0x401f5c29    # 2.49f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v25, -0x3ee73333    # -9.55f

    .line 80
    .line 81
    .line 82
    const v26, 0x3f87ae14    # 1.06f

    .line 83
    .line 84
    .line 85
    const v21, -0x3fea3d71    # -2.34f

    .line 86
    .line 87
    .line 88
    const v22, -0x3fea3d71    # -2.34f

    .line 89
    .line 90
    .line 91
    const v23, -0x3f2c28f6    # -6.62f

    .line 92
    .line 93
    .line 94
    const v24, -0x4010a3d7    # -1.87f

    .line 95
    .line 96
    .line 97
    move-object/from16 v20, v2

    .line 98
    .line 99
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 100
    .line 101
    .line 102
    const v25, -0x3fdd70a4    # -2.54f

    .line 103
    .line 104
    .line 105
    const v26, 0x40aeb852    # 5.46f

    .line 106
    .line 107
    .line 108
    const v21, -0x40333333    # -1.6f

    .line 109
    .line 110
    .line 111
    const v22, 0x3fcccccd    # 1.6f

    .line 112
    .line 113
    .line 114
    const v23, -0x3fdeb852    # -2.52f

    .line 115
    .line 116
    .line 117
    const v24, 0x4077ae14    # 3.87f

    .line 118
    .line 119
    .line 120
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 121
    .line 122
    .line 123
    const v25, -0x40533333    # -1.35f

    .line 124
    .line 125
    .line 126
    const/high16 v26, 0x40b00000    # 5.5f

    .line 127
    .line 128
    const v21, -0x435c28f6    # -0.02f

    .line 129
    .line 130
    .line 131
    const v22, 0x3fca3d71    # 1.58f

    .line 132
    .line 133
    .line 134
    const v23, 0x3e851eb8    # 0.26f

    .line 135
    .line 136
    .line 137
    const v24, 0x4078f5c3    # 3.89f

    .line 138
    .line 139
    .line 140
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 141
    .line 142
    .line 143
    const v4, 0x4061eb85    # 3.53f

    .line 144
    .line 145
    .line 146
    const v6, -0x3f9d70a4    # -3.54f

    .line 147
    .line 148
    .line 149
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 150
    .line 151
    .line 152
    const/16 v25, 0x0

    .line 153
    .line 154
    const v26, 0x3fb5c28f    # 1.42f

    .line 155
    .line 156
    .line 157
    const v21, -0x413851ec    # -0.39f

    .line 158
    .line 159
    .line 160
    const v22, 0x3ec7ae14    # 0.39f

    .line 161
    .line 162
    .line 163
    const v23, -0x413851ec    # -0.39f

    .line 164
    .line 165
    .line 166
    const v24, 0x3f828f5c    # 1.02f

    .line 167
    .line 168
    .line 169
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 170
    .line 171
    .line 172
    const/4 v4, 0x0

    .line 173
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 174
    .line 175
    .line 176
    const v25, 0x3fb5c28f    # 1.42f

    .line 177
    .line 178
    .line 179
    const/16 v26, 0x0

    .line 180
    .line 181
    const v21, 0x3ec7ae14    # 0.39f

    .line 182
    .line 183
    .line 184
    const v23, 0x3f828f5c    # 1.02f

    .line 185
    .line 186
    .line 187
    const v24, 0x3ec7ae14    # 0.39f

    .line 188
    .line 189
    .line 190
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 191
    .line 192
    .line 193
    const v4, 0x4061eb85    # 3.53f

    .line 194
    .line 195
    .line 196
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 197
    .line 198
    .line 199
    const/high16 v25, 0x40b00000    # 5.5f

    .line 200
    .line 201
    const v26, -0x40533333    # -1.35f

    .line 202
    .line 203
    .line 204
    const v21, 0x3fce147b    # 1.61f

    .line 205
    .line 206
    .line 207
    const v22, -0x4031eb85    # -1.61f

    .line 208
    .line 209
    .line 210
    const v23, 0x407ae148    # 3.92f

    .line 211
    .line 212
    .line 213
    const v24, -0x4055c28f    # -1.33f

    .line 214
    .line 215
    .line 216
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 217
    .line 218
    .line 219
    const v4, 0x40aeb852    # 5.46f

    .line 220
    .line 221
    .line 222
    const v6, -0x3fdd70a4    # -2.54f

    .line 223
    .line 224
    .line 225
    const v7, 0x40770a3d    # 3.86f

    .line 226
    .line 227
    .line 228
    const v8, -0x408f5c29    # -0.94f

    .line 229
    .line 230
    .line 231
    invoke-virtual {v2, v7, v8, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 232
    .line 233
    .line 234
    const v25, 0x419c28f6    # 19.52f

    .line 235
    .line 236
    .line 237
    const v26, 0x401f5c29    # 2.49f

    .line 238
    .line 239
    .line 240
    const v21, 0x41ab0a3d    # 21.38f

    .line 241
    .line 242
    .line 243
    const v22, 0x4111c28f    # 9.11f

    .line 244
    .line 245
    .line 246
    const v23, 0x41aee148    # 21.86f

    .line 247
    .line 248
    .line 249
    const v24, 0x409a8f5c    # 4.83f

    .line 250
    .line 251
    .line 252
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 253
    .line 254
    .line 255
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 256
    .line 257
    .line 258
    const v4, 0x413ae148    # 11.68f

    .line 259
    .line 260
    .line 261
    const v6, 0x41251eb8    # 10.32f

    .line 262
    .line 263
    .line 264
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 265
    .line 266
    .line 267
    const v25, 0x3f87ae14    # 1.06f

    .line 268
    .line 269
    .line 270
    const v26, -0x3f28f5c3    # -6.72f

    .line 271
    .line 272
    .line 273
    const v21, -0x403c28f6    # -1.53f

    .line 274
    .line 275
    .line 276
    const v22, -0x403c28f6    # -1.53f

    .line 277
    .line 278
    .line 279
    const v23, -0x4079999a    # -1.05f

    .line 280
    .line 281
    .line 282
    const v24, -0x3f6c7ae1    # -4.61f

    .line 283
    .line 284
    .line 285
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 286
    .line 287
    .line 288
    const v4, 0x40d70a3d    # 6.72f

    .line 289
    .line 290
    .line 291
    const v6, -0x407851ec    # -1.06f

    .line 292
    .line 293
    .line 294
    const v7, 0x40a5c28f    # 5.18f

    .line 295
    .line 296
    .line 297
    const v8, -0x3fda3d71    # -2.59f

    .line 298
    .line 299
    .line 300
    invoke-virtual {v2, v7, v8, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 301
    .line 302
    .line 303
    const v25, -0x407851ec    # -1.06f

    .line 304
    .line 305
    .line 306
    const v26, 0x40d70a3d    # 6.72f

    .line 307
    .line 308
    .line 309
    const v21, 0x3fc3d70a    # 1.53f

    .line 310
    .line 311
    .line 312
    const v22, 0x3fc3d70a    # 1.53f

    .line 313
    .line 314
    .line 315
    const v23, 0x3f866666    # 1.05f

    .line 316
    .line 317
    .line 318
    const v24, 0x4093851f    # 4.61f

    .line 319
    .line 320
    .line 321
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 322
    .line 323
    .line 324
    const v4, 0x413dc28f    # 11.86f

    .line 325
    .line 326
    .line 327
    const v6, 0x41535c29    # 13.21f

    .line 328
    .line 329
    .line 330
    const v7, 0x413ae148    # 11.68f

    .line 331
    .line 332
    .line 333
    const v8, 0x41251eb8    # 10.32f

    .line 334
    .line 335
    .line 336
    invoke-virtual {v2, v4, v6, v8, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 337
    .line 338
    .line 339
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 340
    .line 341
    .line 342
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 343
    .line 344
    .line 345
    move-result-object v2

    .line 346
    const/16 v16, 0x3800

    .line 347
    .line 348
    const/16 v17, 0x0

    .line 349
    .line 350
    const/high16 v6, 0x3f800000    # 1.0f

    .line 351
    .line 352
    const/high16 v8, 0x3f800000    # 1.0f

    .line 353
    .line 354
    const/4 v7, 0x0

    .line 355
    const/high16 v9, 0x3f800000    # 1.0f

    .line 356
    .line 357
    const/high16 v12, 0x3f800000    # 1.0f

    .line 358
    .line 359
    const/4 v13, 0x0

    .line 360
    const/4 v14, 0x0

    .line 361
    const/4 v15, 0x0

    .line 362
    const-string v4, ""

    .line 363
    .line 364
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 365
    .line 366
    .line 367
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 368
    .line 369
    .line 370
    move-result v3

    .line 371
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 372
    .line 373
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 374
    .line 375
    .line 376
    move-result-wide v6

    .line 377
    const/4 v0, 0x0

    .line 378
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 379
    .line 380
    .line 381
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 382
    .line 383
    .line 384
    move-result v10

    .line 385
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 386
    .line 387
    .line 388
    move-result v11

    .line 389
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 390
    .line 391
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 392
    .line 393
    .line 394
    const/high16 v0, 0x41880000    # 17.0f

    .line 395
    .line 396
    const/high16 v2, 0x41900000    # 18.0f

    .line 397
    .line 398
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 399
    .line 400
    .line 401
    const v17, 0x3fb47ae1    # 1.41f

    .line 402
    .line 403
    .line 404
    const v18, 0x3f170a3d    # 0.59f

    .line 405
    .line 406
    .line 407
    const v13, 0x3f07ae14    # 0.53f

    .line 408
    .line 409
    .line 410
    const v15, 0x3f851eb8    # 1.04f

    .line 411
    .line 412
    .line 413
    const v16, 0x3e570a3d    # 0.21f

    .line 414
    .line 415
    .line 416
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 417
    .line 418
    .line 419
    const/16 v17, 0x0

    .line 420
    .line 421
    const v18, 0x40351eb8    # 2.83f

    .line 422
    .line 423
    .line 424
    const v13, 0x3f47ae14    # 0.78f

    .line 425
    .line 426
    .line 427
    const v14, 0x3f47ae14    # 0.78f

    .line 428
    .line 429
    .line 430
    const v15, 0x3f47ae14    # 0.78f

    .line 431
    .line 432
    .line 433
    const v16, 0x40033333    # 2.05f

    .line 434
    .line 435
    .line 436
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 437
    .line 438
    .line 439
    const/high16 v17, 0x41900000    # 18.0f

    .line 440
    .line 441
    const/high16 v18, 0x41a80000    # 21.0f

    .line 442
    .line 443
    const v13, 0x419851ec    # 19.04f

    .line 444
    .line 445
    .line 446
    const v14, 0x41a651ec    # 20.79f

    .line 447
    .line 448
    .line 449
    const v15, 0x41943d71    # 18.53f

    .line 450
    .line 451
    .line 452
    const/high16 v16, 0x41a80000    # 21.0f

    .line 453
    .line 454
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 455
    .line 456
    .line 457
    const v0, -0x404b851f    # -1.41f

    .line 458
    .line 459
    .line 460
    const v2, -0x40e8f5c3    # -0.59f

    .line 461
    .line 462
    .line 463
    const v4, -0x407ae148    # -1.04f

    .line 464
    .line 465
    .line 466
    const v6, -0x41a8f5c3    # -0.21f

    .line 467
    .line 468
    .line 469
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 470
    .line 471
    .line 472
    const/16 v17, 0x0

    .line 473
    .line 474
    const v18, -0x3fcae148    # -2.83f

    .line 475
    .line 476
    .line 477
    const v13, -0x40b851ec    # -0.78f

    .line 478
    .line 479
    .line 480
    const v14, -0x40b851ec    # -0.78f

    .line 481
    .line 482
    .line 483
    const v15, -0x40b851ec    # -0.78f

    .line 484
    .line 485
    .line 486
    const v16, -0x3ffccccd    # -2.05f

    .line 487
    .line 488
    .line 489
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 490
    .line 491
    .line 492
    const/high16 v17, 0x41900000    # 18.0f

    .line 493
    .line 494
    const/high16 v18, 0x41880000    # 17.0f

    .line 495
    .line 496
    const v13, 0x4187ae14    # 16.96f

    .line 497
    .line 498
    .line 499
    const v14, 0x4189ae14    # 17.21f

    .line 500
    .line 501
    .line 502
    const v15, 0x418bc28f    # 17.47f

    .line 503
    .line 504
    .line 505
    const/high16 v16, 0x41880000    # 17.0f

    .line 506
    .line 507
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 508
    .line 509
    .line 510
    const/high16 v0, 0x41700000    # 15.0f

    .line 511
    .line 512
    const/high16 v2, 0x41900000    # 18.0f

    .line 513
    .line 514
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 515
    .line 516
    .line 517
    const v17, -0x3fcae148    # -2.83f

    .line 518
    .line 519
    .line 520
    const v18, 0x3f95c28f    # 1.17f

    .line 521
    .line 522
    .line 523
    const v13, -0x407d70a4    # -1.02f

    .line 524
    .line 525
    .line 526
    const/4 v14, 0x0

    .line 527
    const v15, -0x3ffccccd    # -2.05f

    .line 528
    .line 529
    .line 530
    const v16, 0x3ec7ae14    # 0.39f

    .line 531
    .line 532
    .line 533
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 534
    .line 535
    .line 536
    const/16 v17, 0x0

    .line 537
    .line 538
    const v18, 0x40b51eb8    # 5.66f

    .line 539
    .line 540
    .line 541
    const v13, -0x403851ec    # -1.56f

    .line 542
    .line 543
    .line 544
    const v14, 0x3fc7ae14    # 1.56f

    .line 545
    .line 546
    .line 547
    const v15, -0x403851ec    # -1.56f

    .line 548
    .line 549
    .line 550
    const v16, 0x4082e148    # 4.09f

    .line 551
    .line 552
    .line 553
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 554
    .line 555
    .line 556
    const/high16 v17, 0x41900000    # 18.0f

    .line 557
    .line 558
    const/high16 v18, 0x41b80000    # 23.0f

    .line 559
    .line 560
    const v13, 0x417f3333    # 15.95f

    .line 561
    .line 562
    .line 563
    const v14, 0x41b4e148    # 22.61f

    .line 564
    .line 565
    .line 566
    const v15, 0x4187d70a    # 16.98f

    .line 567
    .line 568
    .line 569
    const/high16 v16, 0x41b80000    # 23.0f

    .line 570
    .line 571
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 572
    .line 573
    .line 574
    const v0, 0x40351eb8    # 2.83f

    .line 575
    .line 576
    .line 577
    const v2, -0x406a3d71    # -1.17f

    .line 578
    .line 579
    .line 580
    const v4, 0x40033333    # 2.05f

    .line 581
    .line 582
    .line 583
    const v6, -0x413851ec    # -0.39f

    .line 584
    .line 585
    .line 586
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 587
    .line 588
    .line 589
    const/16 v17, 0x0

    .line 590
    .line 591
    const v18, -0x3f4ae148    # -5.66f

    .line 592
    .line 593
    .line 594
    const v13, 0x3fc7ae14    # 1.56f

    .line 595
    .line 596
    .line 597
    const v14, -0x403851ec    # -1.56f

    .line 598
    .line 599
    .line 600
    const v15, 0x3fc7ae14    # 1.56f

    .line 601
    .line 602
    .line 603
    const v16, -0x3f7d1eb8    # -4.09f

    .line 604
    .line 605
    .line 606
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 607
    .line 608
    .line 609
    const/high16 v17, 0x41900000    # 18.0f

    .line 610
    .line 611
    const/high16 v18, 0x41700000    # 15.0f

    .line 612
    .line 613
    const v13, 0x41a06666    # 20.05f

    .line 614
    .line 615
    .line 616
    const v14, 0x41763d71    # 15.39f

    .line 617
    .line 618
    .line 619
    const v15, 0x419828f6    # 19.02f

    .line 620
    .line 621
    .line 622
    const/high16 v16, 0x41700000    # 15.0f

    .line 623
    .line 624
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 625
    .line 626
    .line 627
    const/high16 v0, 0x41700000    # 15.0f

    .line 628
    .line 629
    const/high16 v2, 0x41900000    # 18.0f

    .line 630
    .line 631
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 632
    .line 633
    .line 634
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 635
    .line 636
    .line 637
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 638
    .line 639
    .line 640
    move-result-object v2

    .line 641
    const/16 v16, 0x3800

    .line 642
    .line 643
    const/16 v17, 0x0

    .line 644
    .line 645
    const/high16 v6, 0x3f800000    # 1.0f

    .line 646
    .line 647
    const/4 v7, 0x0

    .line 648
    const/high16 v12, 0x3f800000    # 1.0f

    .line 649
    .line 650
    const/4 v13, 0x0

    .line 651
    const/4 v14, 0x0

    .line 652
    const/4 v15, 0x0

    .line 653
    const-string v4, ""

    .line 654
    .line 655
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 656
    .line 657
    .line 658
    move-result-object v0

    .line 659
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 660
    .line 661
    .line 662
    move-result-object v0

    .line 663
    sput-object v0, Landroidx/compose/material/icons/rounded/SportsTennisKt;->_sportsTennis:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 664
    .line 665
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 666
    .line 667
    .line 668
    return-object v0
.end method
