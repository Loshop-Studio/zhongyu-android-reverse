.class public final Landroidx/compose/material/icons/rounded/SatelliteAltKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_satelliteAlt",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "SatelliteAlt",
        "Landroidx/compose/material/icons/Icons$Rounded;",
        "getSatelliteAlt",
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
        "SMAP\nSatelliteAlt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SatelliteAlt.kt\nandroidx/compose/material/icons/rounded/SatelliteAltKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,113:1\n212#2,12:114\n233#2,18:127\n253#2:164\n174#3:126\n705#4,2:145\n717#4,2:147\n719#4,11:153\n72#5,4:149\n*S KotlinDebug\n*F\n+ 1 SatelliteAlt.kt\nandroidx/compose/material/icons/rounded/SatelliteAltKt\n*L\n29#1:114,12\n30#1:127,18\n30#1:164\n29#1:126\n30#1:145,2\n30#1:147,2\n30#1:153,11\n30#1:149,4\n*E\n"
    }
.end annotation


# static fields
.field private static _satelliteAlt:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getSatelliteAlt(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/SatelliteAltKt;->_satelliteAlt:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.SatelliteAlt"

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
    const v0, 0x41a7999a    # 20.95f

    .line 71
    .line 72
    .line 73
    const v2, 0x416e147b    # 14.88f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v17, -0x3f3dc28f    # -6.07f

    .line 80
    .line 81
    .line 82
    const v18, 0x40c23d71    # 6.07f

    .line 83
    .line 84
    .line 85
    const v13, -0x41333333    # -0.4f

    .line 86
    .line 87
    .line 88
    const v14, 0x404b851f    # 3.18f

    .line 89
    .line 90
    .line 91
    const v15, -0x3fc70a3d    # -2.89f

    .line 92
    .line 93
    .line 94
    const v16, 0x40b570a4    # 5.67f

    .line 95
    .line 96
    .line 97
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 98
    .line 99
    .line 100
    const/high16 v17, 0x41600000    # 14.0f

    .line 101
    .line 102
    const v18, 0x41af851f    # 21.94f

    .line 103
    .line 104
    .line 105
    const v13, 0x4165eb85    # 14.37f

    .line 106
    .line 107
    .line 108
    const v14, 0x41a8147b    # 21.01f

    .line 109
    .line 110
    .line 111
    const/high16 v15, 0x41600000    # 14.0f

    .line 112
    .line 113
    const v16, 0x41ab851f    # 21.44f

    .line 114
    .line 115
    .line 116
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 117
    .line 118
    .line 119
    const v17, 0x3c23d70a    # 0.01f

    .line 120
    .line 121
    .line 122
    const v18, 0x3df5c28f    # 0.12f

    .line 123
    .line 124
    .line 125
    const/4 v13, 0x0

    .line 126
    const v14, 0x3d23d70a    # 0.04f

    .line 127
    .line 128
    .line 129
    const/4 v15, 0x0

    .line 130
    const v16, 0x3da3d70a    # 0.08f

    .line 131
    .line 132
    .line 133
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 134
    .line 135
    .line 136
    const v17, 0x3f8f5c29    # 1.12f

    .line 137
    .line 138
    .line 139
    const v18, 0x3f5eb852    # 0.87f

    .line 140
    .line 141
    .line 142
    const v13, 0x3d8f5c29    # 0.07f

    .line 143
    .line 144
    .line 145
    const v14, 0x3f0ccccd    # 0.55f

    .line 146
    .line 147
    .line 148
    const v15, 0x3f11eb85    # 0.57f

    .line 149
    .line 150
    .line 151
    const v16, 0x3f70a3d7    # 0.94f

    .line 152
    .line 153
    .line 154
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 155
    .line 156
    .line 157
    const v17, 0x40f9eb85    # 7.81f

    .line 158
    .line 159
    .line 160
    const v18, -0x3f06147b    # -7.81f

    .line 161
    .line 162
    .line 163
    const v13, 0x4082e148    # 4.09f

    .line 164
    .line 165
    .line 166
    const v14, -0x40fd70a4    # -0.51f

    .line 167
    .line 168
    .line 169
    const v15, 0x40e9999a    # 7.3f

    .line 170
    .line 171
    .line 172
    const v16, -0x3f91eb85    # -3.72f

    .line 173
    .line 174
    .line 175
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 176
    .line 177
    .line 178
    const v17, -0x409eb852    # -0.88f

    .line 179
    .line 180
    .line 181
    const v18, -0x4071eb85    # -1.11f

    .line 182
    .line 183
    .line 184
    const v13, 0x3d75c28f    # 0.06f

    .line 185
    .line 186
    .line 187
    const v14, -0x40f33333    # -0.55f

    .line 188
    .line 189
    .line 190
    const v15, -0x41570a3d    # -0.33f

    .line 191
    .line 192
    .line 193
    const v16, -0x4079999a    # -1.05f

    .line 194
    .line 195
    .line 196
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 197
    .line 198
    .line 199
    const v17, 0x41a7999a    # 20.95f

    .line 200
    .line 201
    .line 202
    const v18, 0x416e147b    # 14.88f

    .line 203
    .line 204
    .line 205
    const v13, 0x41ac147b    # 21.51f

    .line 206
    .line 207
    .line 208
    const v14, 0x415f0a3d    # 13.94f

    .line 209
    .line 210
    .line 211
    const v15, 0x41a8147b    # 21.01f

    .line 212
    .line 213
    .line 214
    const v16, 0x416547ae    # 14.33f

    .line 215
    .line 216
    .line 217
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 218
    .line 219
    .line 220
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 221
    .line 222
    .line 223
    const v0, 0x4196b852    # 18.84f

    .line 224
    .line 225
    .line 226
    const v2, 0x417428f6    # 15.26f

    .line 227
    .line 228
    .line 229
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 230
    .line 231
    .line 232
    const v17, -0x40c7ae14    # -0.72f

    .line 233
    .line 234
    .line 235
    const v18, -0x4063d70a    # -1.22f

    .line 236
    .line 237
    .line 238
    const v13, 0x3e0f5c29    # 0.14f

    .line 239
    .line 240
    .line 241
    const v14, -0x40f851ec    # -0.53f

    .line 242
    .line 243
    .line 244
    const v15, -0x41c7ae14    # -0.18f

    .line 245
    .line 246
    .line 247
    const v16, -0x4075c28f    # -1.08f

    .line 248
    .line 249
    .line 250
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 251
    .line 252
    .line 253
    const v17, -0x4063d70a    # -1.22f

    .line 254
    .line 255
    .line 256
    const v18, 0x3f3851ec    # 0.72f

    .line 257
    .line 258
    .line 259
    const v13, -0x40f5c28f    # -0.54f

    .line 260
    .line 261
    .line 262
    const v14, -0x41f0a3d7    # -0.14f

    .line 263
    .line 264
    .line 265
    const v15, -0x4075c28f    # -1.08f

    .line 266
    .line 267
    .line 268
    const v16, 0x3e3851ec    # 0.18f

    .line 269
    .line 270
    .line 271
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 272
    .line 273
    .line 274
    const v17, -0x3ff66666    # -2.15f

    .line 275
    .line 276
    .line 277
    const v18, 0x4009999a    # 2.15f

    .line 278
    .line 279
    .line 280
    const v13, -0x4175c28f    # -0.27f

    .line 281
    .line 282
    .line 283
    const v14, 0x3f866666    # 1.05f

    .line 284
    .line 285
    .line 286
    const v15, -0x40747ae1    # -1.09f

    .line 287
    .line 288
    .line 289
    const v16, 0x3fef5c29    # 1.87f

    .line 290
    .line 291
    .line 292
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 293
    .line 294
    .line 295
    const/high16 v17, 0x41600000    # 14.0f

    .line 296
    .line 297
    const v18, 0x418f0a3d    # 17.88f

    .line 298
    .line 299
    .line 300
    const v13, 0x4164cccd    # 14.3f

    .line 301
    .line 302
    .line 303
    const v14, 0x41883d71    # 17.03f

    .line 304
    .line 305
    .line 306
    const/high16 v15, 0x41600000    # 14.0f

    .line 307
    .line 308
    const v16, 0x418b70a4    # 17.43f

    .line 309
    .line 310
    .line 311
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 312
    .line 313
    .line 314
    const v17, 0x3cf5c28f    # 0.03f

    .line 315
    .line 316
    .line 317
    const/high16 v18, 0x3e800000    # 0.25f

    .line 318
    .line 319
    const/4 v13, 0x0

    .line 320
    const v14, 0x3da3d70a    # 0.08f

    .line 321
    .line 322
    .line 323
    const v15, 0x3c23d70a    # 0.01f

    .line 324
    .line 325
    .line 326
    const v16, 0x3e2e147b    # 0.17f

    .line 327
    .line 328
    .line 329
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 330
    .line 331
    .line 332
    const v17, 0x3f9c28f6    # 1.22f

    .line 333
    .line 334
    .line 335
    const v18, 0x3f3851ec    # 0.72f

    .line 336
    .line 337
    .line 338
    const v13, 0x3e0f5c29    # 0.14f

    .line 339
    .line 340
    .line 341
    const v14, 0x3f07ae14    # 0.53f

    .line 342
    .line 343
    .line 344
    const v15, 0x3f30a3d7    # 0.69f

    .line 345
    .line 346
    .line 347
    const v16, 0x3f59999a    # 0.85f

    .line 348
    .line 349
    .line 350
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 351
    .line 352
    .line 353
    const v17, 0x4196b852    # 18.84f

    .line 354
    .line 355
    .line 356
    const v18, 0x417428f6    # 15.26f

    .line 357
    .line 358
    .line 359
    const v13, 0x418828f6    # 17.02f

    .line 360
    .line 361
    .line 362
    const v14, 0x41930a3d    # 18.38f

    .line 363
    .line 364
    .line 365
    const v15, 0x41931eb8    # 18.39f

    .line 366
    .line 367
    .line 368
    const v16, 0x4188147b    # 17.01f

    .line 369
    .line 370
    .line 371
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 372
    .line 373
    .line 374
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 375
    .line 376
    .line 377
    const v0, 0x41ae6666    # 21.8f

    .line 378
    .line 379
    .line 380
    const v2, 0x4083d70a    # 4.12f

    .line 381
    .line 382
    .line 383
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 384
    .line 385
    .line 386
    const v0, -0x3f9d70a4    # -3.54f

    .line 387
    .line 388
    .line 389
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 390
    .line 391
    .line 392
    const v17, -0x3fcae148    # -2.83f

    .line 393
    .line 394
    .line 395
    const/16 v18, 0x0

    .line 396
    .line 397
    const v13, -0x40b851ec    # -0.78f

    .line 398
    .line 399
    .line 400
    const v14, -0x40b851ec    # -0.78f

    .line 401
    .line 402
    .line 403
    const v15, -0x3ffccccd    # -2.05f

    .line 404
    .line 405
    .line 406
    const v16, -0x40b851ec    # -0.78f

    .line 407
    .line 408
    .line 409
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 410
    .line 411
    .line 412
    const v0, 0x404b851f    # 3.18f

    .line 413
    .line 414
    .line 415
    const v2, -0x3fb47ae1    # -3.18f

    .line 416
    .line 417
    .line 418
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 419
    .line 420
    .line 421
    const/16 v17, 0x0

    .line 422
    .line 423
    const v18, 0x40351eb8    # 2.83f

    .line 424
    .line 425
    .line 426
    const v14, 0x3f47ae14    # 0.78f

    .line 427
    .line 428
    .line 429
    const v15, -0x40b851ec    # -0.78f

    .line 430
    .line 431
    .line 432
    const v16, 0x40033333    # 2.05f

    .line 433
    .line 434
    .line 435
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 436
    .line 437
    .line 438
    const v0, 0x3f9eb852    # 1.24f

    .line 439
    .line 440
    .line 441
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 442
    .line 443
    .line 444
    const v0, 0x3f35c28f    # 0.71f

    .line 445
    .line 446
    .line 447
    const v2, -0x40ca3d71    # -0.71f

    .line 448
    .line 449
    .line 450
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 451
    .line 452
    .line 453
    const v0, 0x4138cccd    # 11.55f

    .line 454
    .line 455
    .line 456
    const v2, 0x40e9999a    # 7.3f

    .line 457
    .line 458
    .line 459
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 460
    .line 461
    .line 462
    const v17, -0x3fcae148    # -2.83f

    .line 463
    .line 464
    .line 465
    const/16 v18, 0x0

    .line 466
    .line 467
    const v14, -0x40b851ec    # -0.78f

    .line 468
    .line 469
    .line 470
    const v15, -0x3ffccccd    # -2.05f

    .line 471
    .line 472
    .line 473
    const v16, -0x40b851ec    # -0.78f

    .line 474
    .line 475
    .line 476
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 477
    .line 478
    .line 479
    const v0, 0x40e9999a    # 7.3f

    .line 480
    .line 481
    .line 482
    const v2, 0x410b851f    # 8.72f

    .line 483
    .line 484
    .line 485
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 486
    .line 487
    .line 488
    const/16 v17, 0x0

    .line 489
    .line 490
    const v18, 0x40351eb8    # 2.83f

    .line 491
    .line 492
    .line 493
    const v14, 0x3f47ae14    # 0.78f

    .line 494
    .line 495
    .line 496
    const v15, -0x40b851ec    # -0.78f

    .line 497
    .line 498
    .line 499
    const v16, 0x40033333    # 2.05f

    .line 500
    .line 501
    .line 502
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 503
    .line 504
    .line 505
    const v0, 0x3f9eb852    # 1.24f

    .line 506
    .line 507
    .line 508
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 509
    .line 510
    .line 511
    const v0, 0x3f35c28f    # 0.71f

    .line 512
    .line 513
    .line 514
    const v2, -0x40ca3d71    # -0.71f

    .line 515
    .line 516
    .line 517
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 518
    .line 519
    .line 520
    const/high16 v0, 0x41440000    # 12.25f

    .line 521
    .line 522
    const v2, 0x40d33333    # 6.6f

    .line 523
    .line 524
    .line 525
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 526
    .line 527
    .line 528
    const v17, -0x3fcae148    # -2.83f

    .line 529
    .line 530
    .line 531
    const/16 v18, 0x0

    .line 532
    .line 533
    const v14, -0x40b851ec    # -0.78f

    .line 534
    .line 535
    .line 536
    const v15, -0x3ffccccd    # -2.05f

    .line 537
    .line 538
    .line 539
    const v16, -0x40b851ec    # -0.78f

    .line 540
    .line 541
    .line 542
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 543
    .line 544
    .line 545
    const v0, 0x404b851f    # 3.18f

    .line 546
    .line 547
    .line 548
    const v2, -0x3fb47ae1    # -3.18f

    .line 549
    .line 550
    .line 551
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 552
    .line 553
    .line 554
    const/16 v17, 0x0

    .line 555
    .line 556
    const v18, 0x40351eb8    # 2.83f

    .line 557
    .line 558
    .line 559
    const v14, 0x3f47ae14    # 0.78f

    .line 560
    .line 561
    .line 562
    const v15, -0x40b851ec    # -0.78f

    .line 563
    .line 564
    .line 565
    const v16, 0x40033333    # 2.05f

    .line 566
    .line 567
    .line 568
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 569
    .line 570
    .line 571
    const v0, 0x40628f5c    # 3.54f

    .line 572
    .line 573
    .line 574
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 575
    .line 576
    .line 577
    const v17, 0x40351eb8    # 2.83f

    .line 578
    .line 579
    .line 580
    const/16 v18, 0x0

    .line 581
    .line 582
    const v13, 0x3f47ae14    # 0.78f

    .line 583
    .line 584
    .line 585
    const v15, 0x40033333    # 2.05f

    .line 586
    .line 587
    .line 588
    const v16, 0x3f47ae14    # 0.78f

    .line 589
    .line 590
    .line 591
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 592
    .line 593
    .line 594
    const v0, 0x404b851f    # 3.18f

    .line 595
    .line 596
    .line 597
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 598
    .line 599
    .line 600
    const/16 v17, 0x0

    .line 601
    .line 602
    const v18, -0x3fcae148    # -2.83f

    .line 603
    .line 604
    .line 605
    const v14, -0x40b851ec    # -0.78f

    .line 606
    .line 607
    .line 608
    const v15, 0x3f47ae14    # 0.78f

    .line 609
    .line 610
    .line 611
    const v16, -0x3ffccccd    # -2.05f

    .line 612
    .line 613
    .line 614
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 615
    .line 616
    .line 617
    const v0, -0x406147ae    # -1.24f

    .line 618
    .line 619
    .line 620
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 621
    .line 622
    .line 623
    const v0, 0x3f35c28f    # 0.71f

    .line 624
    .line 625
    .line 626
    const v2, -0x40ca3d71    # -0.71f

    .line 627
    .line 628
    .line 629
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 630
    .line 631
    .line 632
    const v0, 0x3f9eb852    # 1.24f

    .line 633
    .line 634
    .line 635
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 636
    .line 637
    .line 638
    const v17, 0x40351eb8    # 2.83f

    .line 639
    .line 640
    .line 641
    const/16 v18, 0x0

    .line 642
    .line 643
    const v14, 0x3f47ae14    # 0.78f

    .line 644
    .line 645
    .line 646
    const v15, 0x40033333    # 2.05f

    .line 647
    .line 648
    .line 649
    const v16, 0x3f47ae14    # 0.78f

    .line 650
    .line 651
    .line 652
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 653
    .line 654
    .line 655
    const v0, 0x3fb47ae1    # 1.41f

    .line 656
    .line 657
    .line 658
    const v2, -0x404b851f    # -1.41f

    .line 659
    .line 660
    .line 661
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 662
    .line 663
    .line 664
    const/16 v17, 0x0

    .line 665
    .line 666
    const v18, -0x3fcae148    # -2.83f

    .line 667
    .line 668
    .line 669
    const v14, -0x40b851ec    # -0.78f

    .line 670
    .line 671
    .line 672
    const v15, 0x3f47ae14    # 0.78f

    .line 673
    .line 674
    .line 675
    const v16, -0x3ffccccd    # -2.05f

    .line 676
    .line 677
    .line 678
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 679
    .line 680
    .line 681
    const v0, 0x415d70a4    # 13.84f

    .line 682
    .line 683
    .line 684
    const v2, 0x4119999a    # 9.6f

    .line 685
    .line 686
    .line 687
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 688
    .line 689
    .line 690
    const v0, 0x3f35c28f    # 0.71f

    .line 691
    .line 692
    .line 693
    const v2, -0x40ca3d71    # -0.71f

    .line 694
    .line 695
    .line 696
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 697
    .line 698
    .line 699
    const v0, 0x3f9eb852    # 1.24f

    .line 700
    .line 701
    .line 702
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 703
    .line 704
    .line 705
    const v17, 0x40351eb8    # 2.83f

    .line 706
    .line 707
    .line 708
    const/16 v18, 0x0

    .line 709
    .line 710
    const v14, 0x3f47ae14    # 0.78f

    .line 711
    .line 712
    .line 713
    const v15, 0x40033333    # 2.05f

    .line 714
    .line 715
    .line 716
    const v16, 0x3f47ae14    # 0.78f

    .line 717
    .line 718
    .line 719
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 720
    .line 721
    .line 722
    const v0, 0x404b851f    # 3.18f

    .line 723
    .line 724
    .line 725
    const v2, -0x3fb47ae1    # -3.18f

    .line 726
    .line 727
    .line 728
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 729
    .line 730
    .line 731
    const v17, 0x41ae6666    # 21.8f

    .line 732
    .line 733
    .line 734
    const v18, 0x4083d70a    # 4.12f

    .line 735
    .line 736
    .line 737
    const v13, 0x41b4a3d7    # 22.58f

    .line 738
    .line 739
    .line 740
    const v14, 0x40c570a4    # 6.17f

    .line 741
    .line 742
    .line 743
    const v15, 0x41b4a3d7    # 22.58f

    .line 744
    .line 745
    .line 746
    const v16, 0x409ccccd    # 4.9f

    .line 747
    .line 748
    .line 749
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 750
    .line 751
    .line 752
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 753
    .line 754
    .line 755
    const v0, 0x41a30a3d    # 20.38f

    .line 756
    .line 757
    .line 758
    const v2, 0x40b147ae    # 5.54f

    .line 759
    .line 760
    .line 761
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 762
    .line 763
    .line 764
    const v0, 0x4186cccd    # 16.85f

    .line 765
    .line 766
    .line 767
    const/high16 v2, 0x40000000    # 2.0f

    .line 768
    .line 769
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 770
    .line 771
    .line 772
    const v0, -0x407851ec    # -1.06f

    .line 773
    .line 774
    .line 775
    const v2, 0x3f87ae14    # 1.06f

    .line 776
    .line 777
    .line 778
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 779
    .line 780
    .line 781
    const v0, 0x40628f5c    # 3.54f

    .line 782
    .line 783
    .line 784
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 785
    .line 786
    .line 787
    const v0, 0x41a30a3d    # 20.38f

    .line 788
    .line 789
    .line 790
    const v2, 0x40b147ae    # 5.54f

    .line 791
    .line 792
    .line 793
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 794
    .line 795
    .line 796
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 797
    .line 798
    .line 799
    const v0, 0x4192147b    # 18.26f

    .line 800
    .line 801
    .line 802
    const v2, 0x40f51eb8    # 7.66f

    .line 803
    .line 804
    .line 805
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 806
    .line 807
    .line 808
    const v0, -0x3f9d70a4    # -3.54f

    .line 809
    .line 810
    .line 811
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 812
    .line 813
    .line 814
    const v0, -0x407851ec    # -1.06f

    .line 815
    .line 816
    .line 817
    const v2, 0x3f87ae14    # 1.06f

    .line 818
    .line 819
    .line 820
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 821
    .line 822
    .line 823
    const v0, 0x40628f5c    # 3.54f

    .line 824
    .line 825
    .line 826
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 827
    .line 828
    .line 829
    const v0, 0x4192147b    # 18.26f

    .line 830
    .line 831
    .line 832
    const v2, 0x40f51eb8    # 7.66f

    .line 833
    .line 834
    .line 835
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 836
    .line 837
    .line 838
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 839
    .line 840
    .line 841
    const v0, 0x4189999a    # 17.2f

    .line 842
    .line 843
    .line 844
    const v2, 0x410b851f    # 8.72f

    .line 845
    .line 846
    .line 847
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 848
    .line 849
    .line 850
    const v0, -0x3f9d70a4    # -3.54f

    .line 851
    .line 852
    .line 853
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 854
    .line 855
    .line 856
    const v0, -0x407851ec    # -1.06f

    .line 857
    .line 858
    .line 859
    const v2, 0x3f87ae14    # 1.06f

    .line 860
    .line 861
    .line 862
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 863
    .line 864
    .line 865
    const v0, 0x40628f5c    # 3.54f

    .line 866
    .line 867
    .line 868
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 869
    .line 870
    .line 871
    const v0, 0x4189999a    # 17.2f

    .line 872
    .line 873
    .line 874
    const v2, 0x410b851f    # 8.72f

    .line 875
    .line 876
    .line 877
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 878
    .line 879
    .line 880
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 881
    .line 882
    .line 883
    const v0, 0x419a8f5c    # 19.32f

    .line 884
    .line 885
    .line 886
    const v2, 0x40d33333    # 6.6f

    .line 887
    .line 888
    .line 889
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 890
    .line 891
    .line 892
    const v0, -0x3f9d70a4    # -3.54f

    .line 893
    .line 894
    .line 895
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 896
    .line 897
    .line 898
    const v0, 0x4186cccd    # 16.85f

    .line 899
    .line 900
    .line 901
    const/high16 v2, 0x40000000    # 2.0f

    .line 902
    .line 903
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 904
    .line 905
    .line 906
    const v0, 0x40628f5c    # 3.54f

    .line 907
    .line 908
    .line 909
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 910
    .line 911
    .line 912
    const v0, 0x419a8f5c    # 19.32f

    .line 913
    .line 914
    .line 915
    const v2, 0x40d33333    # 6.6f

    .line 916
    .line 917
    .line 918
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 919
    .line 920
    .line 921
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 922
    .line 923
    .line 924
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 925
    .line 926
    .line 927
    move-result-object v2

    .line 928
    const/16 v16, 0x3800

    .line 929
    .line 930
    const/16 v17, 0x0

    .line 931
    .line 932
    const/high16 v6, 0x3f800000    # 1.0f

    .line 933
    .line 934
    const/high16 v8, 0x3f800000    # 1.0f

    .line 935
    .line 936
    const/4 v7, 0x0

    .line 937
    const/high16 v9, 0x3f800000    # 1.0f

    .line 938
    .line 939
    const/high16 v12, 0x3f800000    # 1.0f

    .line 940
    .line 941
    const/4 v13, 0x0

    .line 942
    const/4 v14, 0x0

    .line 943
    const/4 v15, 0x0

    .line 944
    const-string v4, ""

    .line 945
    .line 946
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 947
    .line 948
    .line 949
    move-result-object v0

    .line 950
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 951
    .line 952
    .line 953
    move-result-object v0

    .line 954
    sput-object v0, Landroidx/compose/material/icons/rounded/SatelliteAltKt;->_satelliteAlt:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 955
    .line 956
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 957
    .line 958
    .line 959
    return-object v0
.end method
