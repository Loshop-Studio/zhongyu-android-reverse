.class public final Landroidx/compose/material/icons/rounded/WifiTetheringKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_wifiTethering",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "WifiTethering",
        "Landroidx/compose/material/icons/Icons$Rounded;",
        "getWifiTethering",
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
        "SMAP\nWifiTethering.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WifiTethering.kt\nandroidx/compose/material/icons/rounded/WifiTetheringKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,73:1\n212#2,12:74\n233#2,18:87\n253#2:124\n174#3:86\n705#4,2:105\n717#4,2:107\n719#4,11:113\n72#5,4:109\n*S KotlinDebug\n*F\n+ 1 WifiTethering.kt\nandroidx/compose/material/icons/rounded/WifiTetheringKt\n*L\n29#1:74,12\n30#1:87,18\n30#1:124\n29#1:86\n30#1:105,2\n30#1:107,2\n30#1:113,11\n30#1:109,4\n*E\n"
    }
.end annotation


# static fields
.field private static _wifiTethering:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getWifiTethering(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/WifiTetheringKt;->_wifiTethering:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.WifiTethering"

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
    const/high16 v0, 0x41400000    # 12.0f

    .line 71
    .line 72
    const/high16 v2, 0x41300000    # 11.0f

    .line 73
    .line 74
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v17, -0x40000000    # -2.0f

    .line 78
    .line 79
    const/high16 v18, 0x40000000    # 2.0f

    .line 80
    .line 81
    const v13, -0x40733333    # -1.1f

    .line 82
    .line 83
    .line 84
    const/4 v14, 0x0

    .line 85
    const/high16 v15, -0x40000000    # -2.0f

    .line 86
    .line 87
    const v16, 0x3f666666    # 0.9f

    .line 88
    .line 89
    .line 90
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 91
    .line 92
    .line 93
    const v0, 0x3f666666    # 0.9f

    .line 94
    .line 95
    .line 96
    const/high16 v2, 0x40000000    # 2.0f

    .line 97
    .line 98
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 99
    .line 100
    .line 101
    const v0, -0x4099999a    # -0.9f

    .line 102
    .line 103
    .line 104
    const/high16 v2, -0x40000000    # -2.0f

    .line 105
    .line 106
    const/high16 v4, 0x40000000    # 2.0f

    .line 107
    .line 108
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 109
    .line 110
    .line 111
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 112
    .line 113
    .line 114
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 115
    .line 116
    .line 117
    const/high16 v0, 0x41900000    # 18.0f

    .line 118
    .line 119
    const/high16 v2, 0x41500000    # 13.0f

    .line 120
    .line 121
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 122
    .line 123
    .line 124
    const/high16 v17, -0x3f280000    # -6.75f

    .line 125
    .line 126
    const v18, -0x3f41999a    # -5.95f

    .line 127
    .line 128
    .line 129
    const/4 v13, 0x0

    .line 130
    const v14, -0x3f9c28f6    # -3.56f

    .line 131
    .line 132
    .line 133
    const v15, -0x3fb8f5c3    # -3.11f

    .line 134
    .line 135
    .line 136
    const v16, -0x3f333333    # -6.4f

    .line 137
    .line 138
    .line 139
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 140
    .line 141
    .line 142
    const v17, -0x3f5a3d71    # -5.18f

    .line 143
    .line 144
    .line 145
    const v18, 0x40a0a3d7    # 5.02f

    .line 146
    .line 147
    .line 148
    const v13, -0x3fd851ec    # -2.62f

    .line 149
    .line 150
    .line 151
    const v14, 0x3ea3d70a    # 0.32f

    .line 152
    .line 153
    .line 154
    const v15, -0x3f670a3d    # -4.78f

    .line 155
    .line 156
    .line 157
    const v16, 0x401a3d71    # 2.41f

    .line 158
    .line 159
    .line 160
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 161
    .line 162
    .line 163
    const v17, 0x3ff70a3d    # 1.93f

    .line 164
    .line 165
    .line 166
    const v18, 0x40accccd    # 5.4f

    .line 167
    .line 168
    .line 169
    const v13, -0x41570a3d    # -0.33f

    .line 170
    .line 171
    .line 172
    const v14, 0x4009999a    # 2.15f

    .line 173
    .line 174
    .line 175
    const v15, 0x3efae148    # 0.49f

    .line 176
    .line 177
    .line 178
    const v16, 0x4083851f    # 4.11f

    .line 179
    .line 180
    .line 181
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 182
    .line 183
    .line 184
    const v17, 0x3fc7ae14    # 1.56f

    .line 185
    .line 186
    .line 187
    const v18, -0x41947ae1    # -0.23f

    .line 188
    .line 189
    .line 190
    const v13, 0x3ef5c28f    # 0.48f

    .line 191
    .line 192
    .line 193
    const v14, 0x3edc28f6    # 0.43f

    .line 194
    .line 195
    .line 196
    const v15, 0x3f9d70a4    # 1.23f

    .line 197
    .line 198
    .line 199
    const v16, 0x3ea8f5c3    # 0.33f

    .line 200
    .line 201
    .line 202
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 203
    .line 204
    .line 205
    const v0, -0x43dc28f6    # -0.01f

    .line 206
    .line 207
    .line 208
    const v2, 0x3c23d70a    # 0.01f

    .line 209
    .line 210
    .line 211
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 212
    .line 213
    .line 214
    const v17, -0x419eb852    # -0.22f

    .line 215
    .line 216
    .line 217
    const v18, -0x405eb852    # -1.26f

    .line 218
    .line 219
    .line 220
    const v13, 0x3e75c28f    # 0.24f

    .line 221
    .line 222
    .line 223
    const v14, -0x4128f5c3    # -0.42f

    .line 224
    .line 225
    .line 226
    const v15, 0x3e0f5c29    # 0.14f

    .line 227
    .line 228
    .line 229
    const v16, -0x4091eb85    # -0.93f

    .line 230
    .line 231
    .line 232
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 233
    .line 234
    .line 235
    const v17, -0x4063d70a    # -1.22f

    .line 236
    .line 237
    .line 238
    const v18, -0x3f83d70a    # -3.94f

    .line 239
    .line 240
    .line 241
    const v13, -0x407c28f6    # -1.03f

    .line 242
    .line 243
    .line 244
    const v14, -0x4091eb85    # -0.93f

    .line 245
    .line 246
    .line 247
    const v15, -0x40347ae1    # -1.59f

    .line 248
    .line 249
    .line 250
    const v16, -0x3fe851ec    # -2.37f

    .line 251
    .line 252
    .line 253
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 254
    .line 255
    .line 256
    const v17, 0x4039999a    # 2.9f

    .line 257
    .line 258
    .line 259
    const v18, -0x3fc5c28f    # -2.91f

    .line 260
    .line 261
    .line 262
    const v13, 0x3ea8f5c3    # 0.33f

    .line 263
    .line 264
    .line 265
    const v14, -0x404a3d71    # -1.42f

    .line 266
    .line 267
    .line 268
    const v15, 0x3fbd70a4    # 1.48f

    .line 269
    .line 270
    .line 271
    const v16, -0x3fdb851f    # -2.57f

    .line 272
    .line 273
    .line 274
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 275
    .line 276
    .line 277
    const/high16 v17, 0x41800000    # 16.0f

    .line 278
    .line 279
    const/high16 v18, 0x41500000    # 13.0f

    .line 280
    .line 281
    const v13, 0x415a6666    # 13.65f

    .line 282
    .line 283
    .line 284
    const v14, 0x4107d70a    # 8.49f

    .line 285
    .line 286
    .line 287
    const/high16 v15, 0x41800000    # 16.0f

    .line 288
    .line 289
    const v16, 0x4127851f    # 10.47f

    .line 290
    .line 291
    .line 292
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 293
    .line 294
    .line 295
    const v17, -0x4055c28f    # -1.33f

    .line 296
    .line 297
    .line 298
    const v18, 0x403d70a4    # 2.96f

    .line 299
    .line 300
    .line 301
    const/4 v13, 0x0

    .line 302
    const v14, 0x3f970a3d    # 1.18f

    .line 303
    .line 304
    .line 305
    const v15, -0x40fae148    # -0.52f

    .line 306
    .line 307
    .line 308
    const v16, 0x400eb852    # 2.23f

    .line 309
    .line 310
    .line 311
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 312
    .line 313
    .line 314
    const v17, -0x41947ae1    # -0.23f

    .line 315
    .line 316
    .line 317
    const v18, 0x3fa147ae    # 1.26f

    .line 318
    .line 319
    .line 320
    const v13, -0x4147ae14    # -0.36f

    .line 321
    .line 322
    .line 323
    const v14, 0x3ea3d70a    # 0.32f

    .line 324
    .line 325
    .line 326
    const v15, -0x410f5c29    # -0.47f

    .line 327
    .line 328
    .line 329
    const v16, 0x3f570a3d    # 0.84f

    .line 330
    .line 331
    .line 332
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 333
    .line 334
    .line 335
    const v0, 0x3c23d70a    # 0.01f

    .line 336
    .line 337
    .line 338
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 339
    .line 340
    .line 341
    const/high16 v17, 0x3fc00000    # 1.5f

    .line 342
    .line 343
    const v18, 0x3e8f5c29    # 0.28f

    .line 344
    .line 345
    .line 346
    const v13, 0x3e9eb852    # 0.31f

    .line 347
    .line 348
    .line 349
    const v14, 0x3f07ae14    # 0.53f

    .line 350
    .line 351
    .line 352
    const v15, 0x3f83d70a    # 1.03f

    .line 353
    .line 354
    .line 355
    const v16, 0x3f30a3d7    # 0.69f

    .line 356
    .line 357
    .line 358
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 359
    .line 360
    .line 361
    const/high16 v17, 0x41900000    # 18.0f

    .line 362
    .line 363
    const/high16 v18, 0x41500000    # 13.0f

    .line 364
    .line 365
    const v13, 0x4189999a    # 17.2f

    .line 366
    .line 367
    .line 368
    const v14, 0x418347ae    # 16.41f

    .line 369
    .line 370
    .line 371
    const/high16 v15, 0x41900000    # 18.0f

    .line 372
    .line 373
    const v16, 0x416ccccd    # 14.8f

    .line 374
    .line 375
    .line 376
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 377
    .line 378
    .line 379
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 380
    .line 381
    .line 382
    const v0, 0x412d47ae    # 10.83f

    .line 383
    .line 384
    .line 385
    const v2, 0x40447ae1    # 3.07f

    .line 386
    .line 387
    .line 388
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 389
    .line 390
    .line 391
    const v17, -0x3ef3851f    # -8.78f

    .line 392
    .line 393
    .line 394
    const v18, 0x410f5c29    # 8.96f

    .line 395
    .line 396
    .line 397
    const v13, -0x3f6c28f6    # -4.62f

    .line 398
    .line 399
    .line 400
    const v14, 0x3f051eb8    # 0.52f

    .line 401
    .line 402
    .line 403
    const v15, -0x3efa6666    # -8.35f

    .line 404
    .line 405
    .line 406
    const v16, 0x408a8f5c    # 4.33f

    .line 407
    .line 408
    .line 409
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 410
    .line 411
    .line 412
    const v17, 0x4080a3d7    # 4.02f

    .line 413
    .line 414
    .line 415
    const v18, 0x411028f6    # 9.01f

    .line 416
    .line 417
    .line 418
    const v13, -0x414ccccd    # -0.35f

    .line 419
    .line 420
    .line 421
    const v14, 0x406ccccd    # 3.7f

    .line 422
    .line 423
    .line 424
    const v15, 0x3fa8f5c3    # 1.32f

    .line 425
    .line 426
    .line 427
    const v16, 0x40e0a3d7    # 7.02f

    .line 428
    .line 429
    .line 430
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 431
    .line 432
    .line 433
    const v17, 0x3fbae148    # 1.46f

    .line 434
    .line 435
    .line 436
    const v18, -0x416147ae    # -0.31f

    .line 437
    .line 438
    .line 439
    const v13, 0x3ef5c28f    # 0.48f

    .line 440
    .line 441
    .line 442
    const v14, 0x3eb33333    # 0.35f

    .line 443
    .line 444
    .line 445
    const v15, 0x3f947ae1    # 1.16f

    .line 446
    .line 447
    .line 448
    const v16, 0x3e4ccccd    # 0.2f

    .line 449
    .line 450
    .line 451
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 452
    .line 453
    .line 454
    const v17, -0x417ae148    # -0.26f

    .line 455
    .line 456
    .line 457
    const v18, -0x405ae148    # -1.29f

    .line 458
    .line 459
    .line 460
    const/high16 v13, 0x3e800000    # 0.25f

    .line 461
    .line 462
    const v14, -0x4123d70a    # -0.43f

    .line 463
    .line 464
    .line 465
    const v15, 0x3e0f5c29    # 0.14f

    .line 466
    .line 467
    .line 468
    const v16, -0x40828f5c    # -0.99f

    .line 469
    .line 470
    .line 471
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 472
    .line 473
    .line 474
    const v17, -0x3fb5c28f    # -3.16f

    .line 475
    .line 476
    .line 477
    const v18, -0x3f09999a    # -7.7f

    .line 478
    .line 479
    .line 480
    const v13, -0x3fee147b    # -2.28f

    .line 481
    .line 482
    .line 483
    const v14, -0x4027ae14    # -1.69f

    .line 484
    .line 485
    .line 486
    const v15, -0x3f966666    # -3.65f

    .line 487
    .line 488
    .line 489
    const v16, -0x3f6e6666    # -4.55f

    .line 490
    .line 491
    .line 492
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 493
    .line 494
    .line 495
    const v17, 0x40df5c29    # 6.98f

    .line 496
    .line 497
    .line 498
    const v18, -0x3f2a3d71    # -6.68f

    .line 499
    .line 500
    .line 501
    const v13, 0x3f0a3d71    # 0.54f

    .line 502
    .line 503
    .line 504
    const/high16 v14, -0x3fa00000    # -3.5f

    .line 505
    .line 506
    const v15, 0x405d70a4    # 3.46f

    .line 507
    .line 508
    .line 509
    const v16, -0x3f36b852    # -6.29f

    .line 510
    .line 511
    .line 512
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 513
    .line 514
    .line 515
    const/high16 v17, 0x41a00000    # 20.0f

    .line 516
    .line 517
    const/high16 v18, 0x41500000    # 13.0f

    .line 518
    .line 519
    const v13, 0x417e8f5c    # 15.91f

    .line 520
    .line 521
    .line 522
    const v14, 0x409051ec    # 4.51f

    .line 523
    .line 524
    .line 525
    const/high16 v15, 0x41a00000    # 20.0f

    .line 526
    .line 527
    const v16, 0x41047ae1    # 8.28f

    .line 528
    .line 529
    .line 530
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 531
    .line 532
    .line 533
    const v17, -0x3faeb852    # -3.27f

    .line 534
    .line 535
    .line 536
    const v18, 0x40ce147b    # 6.44f

    .line 537
    .line 538
    .line 539
    const/4 v13, 0x0

    .line 540
    const v14, 0x4029999a    # 2.65f

    .line 541
    .line 542
    .line 543
    const v15, -0x405ae148    # -1.29f

    .line 544
    .line 545
    .line 546
    const v16, 0x409f5c29    # 4.98f

    .line 547
    .line 548
    .line 549
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 550
    .line 551
    .line 552
    const v17, -0x417ae148    # -0.26f

    .line 553
    .line 554
    .line 555
    const v18, 0x3fa51eb8    # 1.29f

    .line 556
    .line 557
    .line 558
    const v13, -0x41333333    # -0.4f

    .line 559
    .line 560
    .line 561
    const v14, 0x3e99999a    # 0.3f

    .line 562
    .line 563
    .line 564
    const v15, -0x40fd70a4    # -0.51f

    .line 565
    .line 566
    .line 567
    const v16, 0x3f59999a    # 0.85f

    .line 568
    .line 569
    .line 570
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 571
    .line 572
    .line 573
    const v17, 0x3fbae148    # 1.46f

    .line 574
    .line 575
    .line 576
    const v18, 0x3e9eb852    # 0.31f

    .line 577
    .line 578
    .line 579
    const v13, 0x3e99999a    # 0.3f

    .line 580
    .line 581
    .line 582
    const v14, 0x3f051eb8    # 0.52f

    .line 583
    .line 584
    .line 585
    const v15, 0x3f7ae148    # 0.98f

    .line 586
    .line 587
    .line 588
    const v16, 0x3f28f5c3    # 0.66f

    .line 589
    .line 590
    .line 591
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 592
    .line 593
    .line 594
    const/high16 v17, 0x41b00000    # 22.0f

    .line 595
    .line 596
    const/high16 v18, 0x41500000    # 13.0f

    .line 597
    .line 598
    const v13, 0x41a33333    # 20.4f

    .line 599
    .line 600
    .line 601
    const v14, 0x4199c28f    # 19.22f

    .line 602
    .line 603
    .line 604
    const/high16 v15, 0x41b00000    # 22.0f

    .line 605
    .line 606
    const v16, 0x41826666    # 16.3f

    .line 607
    .line 608
    .line 609
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 610
    .line 611
    .line 612
    const v17, -0x3ecd47ae    # -11.17f

    .line 613
    .line 614
    .line 615
    const v18, -0x3ee11eb8    # -9.93f

    .line 616
    .line 617
    .line 618
    const/4 v13, 0x0

    .line 619
    const v14, -0x3f42e148    # -5.91f

    .line 620
    .line 621
    .line 622
    const v15, -0x3f5bd70a    # -5.13f

    .line 623
    .line 624
    .line 625
    const v16, -0x3ed6147b    # -10.62f

    .line 626
    .line 627
    .line 628
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 629
    .line 630
    .line 631
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 632
    .line 633
    .line 634
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 635
    .line 636
    .line 637
    move-result-object v2

    .line 638
    const/16 v16, 0x3800

    .line 639
    .line 640
    const/16 v17, 0x0

    .line 641
    .line 642
    const/high16 v6, 0x3f800000    # 1.0f

    .line 643
    .line 644
    const/high16 v8, 0x3f800000    # 1.0f

    .line 645
    .line 646
    const/4 v7, 0x0

    .line 647
    const/high16 v9, 0x3f800000    # 1.0f

    .line 648
    .line 649
    const/high16 v12, 0x3f800000    # 1.0f

    .line 650
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
    sput-object v0, Landroidx/compose/material/icons/rounded/WifiTetheringKt;->_wifiTethering:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 664
    .line 665
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 666
    .line 667
    .line 668
    return-object v0
.end method
