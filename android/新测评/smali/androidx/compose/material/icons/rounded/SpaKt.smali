.class public final Landroidx/compose/material/icons/rounded/SpaKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_spa",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "Spa",
        "Landroidx/compose/material/icons/Icons$Rounded;",
        "getSpa",
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
        "SMAP\nSpa.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Spa.kt\nandroidx/compose/material/icons/rounded/SpaKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,62:1\n212#2,12:63\n233#2,18:76\n253#2:113\n174#3:75\n705#4,2:94\n717#4,2:96\n719#4,11:102\n72#5,4:98\n*S KotlinDebug\n*F\n+ 1 Spa.kt\nandroidx/compose/material/icons/rounded/SpaKt\n*L\n29#1:63,12\n30#1:76,18\n30#1:113\n29#1:75\n30#1:94,2\n30#1:96,2\n30#1:102,11\n30#1:98,4\n*E\n"
    }
.end annotation


# static fields
.field private static _spa:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getSpa(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/SpaKt;->_spa:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.Spa"

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
    const v0, 0x4177d70a    # 15.49f

    .line 71
    .line 72
    .line 73
    const v2, 0x411a147b    # 9.63f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v17, -0x3fd70a3d    # -2.64f

    .line 80
    .line 81
    .line 82
    const v18, -0x3f27ae14    # -6.76f

    .line 83
    .line 84
    .line 85
    const v13, -0x41dc28f6    # -0.16f

    .line 86
    .line 87
    .line 88
    const v14, -0x3fe51eb8    # -2.42f

    .line 89
    .line 90
    .line 91
    const v15, -0x407c28f6    # -1.03f

    .line 92
    .line 93
    .line 94
    const v16, -0x3f66b852    # -4.79f

    .line 95
    .line 96
    .line 97
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 98
    .line 99
    .line 100
    const v17, -0x40370a3d    # -1.57f

    .line 101
    .line 102
    .line 103
    const/16 v18, 0x0

    .line 104
    .line 105
    const v13, -0x412e147b    # -0.41f

    .line 106
    .line 107
    .line 108
    const/high16 v14, -0x41000000    # -0.5f

    .line 109
    .line 110
    const v15, -0x406b851f    # -1.16f

    .line 111
    .line 112
    .line 113
    const/high16 v16, -0x41000000    # -0.5f

    .line 114
    .line 115
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 116
    .line 117
    .line 118
    const v17, -0x3fceb852    # -2.77f

    .line 119
    .line 120
    .line 121
    const v18, 0x40d851ec    # 6.76f

    .line 122
    .line 123
    .line 124
    const v13, -0x402ccccd    # -1.65f

    .line 125
    .line 126
    .line 127
    const v14, 0x3ffd70a4    # 1.98f

    .line 128
    .line 129
    .line 130
    const v15, -0x3fdb851f    # -2.57f

    .line 131
    .line 132
    .line 133
    const v16, 0x408b3333    # 4.35f

    .line 134
    .line 135
    .line 136
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 137
    .line 138
    .line 139
    const v17, 0x405f5c29    # 3.49f

    .line 140
    .line 141
    .line 142
    const v18, 0x402851ec    # 2.63f

    .line 143
    .line 144
    .line 145
    const v13, 0x3fa3d70a    # 1.28f

    .line 146
    .line 147
    .line 148
    const v14, 0x3f2e147b    # 0.68f

    .line 149
    .line 150
    .line 151
    const v15, 0x401d70a4    # 2.46f

    .line 152
    .line 153
    .line 154
    const v16, 0x3fc7ae14    # 1.56f

    .line 155
    .line 156
    .line 157
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 158
    .line 159
    .line 160
    const v18, -0x3fd7ae14    # -2.63f

    .line 161
    .line 162
    .line 163
    const v13, 0x3f83d70a    # 1.03f

    .line 164
    .line 165
    .line 166
    const v14, -0x407851ec    # -1.06f

    .line 167
    .line 168
    .line 169
    const v15, 0x400d70a4    # 2.21f

    .line 170
    .line 171
    .line 172
    const v16, -0x4007ae14    # -1.94f

    .line 173
    .line 174
    .line 175
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 176
    .line 177
    .line 178
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 179
    .line 180
    .line 181
    const v0, 0x410fd70a    # 8.99f

    .line 182
    .line 183
    .line 184
    const v2, 0x41447ae1    # 12.28f

    .line 185
    .line 186
    .line 187
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 188
    .line 189
    .line 190
    const v17, -0x4119999a    # -0.45f

    .line 191
    .line 192
    .line 193
    const v18, -0x416b851f    # -0.29f

    .line 194
    .line 195
    .line 196
    const v13, -0x41f0a3d7    # -0.14f

    .line 197
    .line 198
    .line 199
    const v14, -0x42333333    # -0.1f

    .line 200
    .line 201
    .line 202
    const v15, -0x41666666    # -0.3f

    .line 203
    .line 204
    .line 205
    const v16, -0x41bd70a4    # -0.19f

    .line 206
    .line 207
    .line 208
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 209
    .line 210
    .line 211
    const v17, 0x3ee66666    # 0.45f

    .line 212
    .line 213
    .line 214
    const v18, 0x3e947ae1    # 0.29f

    .line 215
    .line 216
    .line 217
    const v13, 0x3e19999a    # 0.15f

    .line 218
    .line 219
    .line 220
    const v14, 0x3de147ae    # 0.11f

    .line 221
    .line 222
    .line 223
    const v15, 0x3e9eb852    # 0.31f

    .line 224
    .line 225
    .line 226
    const v16, 0x3e428f5c    # 0.19f

    .line 227
    .line 228
    .line 229
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 230
    .line 231
    .line 232
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 233
    .line 234
    .line 235
    const v0, 0x41768f5c    # 15.41f

    .line 236
    .line 237
    .line 238
    const v2, 0x41407ae1    # 12.03f

    .line 239
    .line 240
    .line 241
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 242
    .line 243
    .line 244
    const v17, -0x41333333    # -0.4f

    .line 245
    .line 246
    .line 247
    const v18, 0x3e851eb8    # 0.26f

    .line 248
    .line 249
    .line 250
    const v13, -0x41fae148    # -0.13f

    .line 251
    .line 252
    .line 253
    const v14, 0x3db851ec    # 0.09f

    .line 254
    .line 255
    .line 256
    const v15, -0x4175c28f    # -0.27f

    .line 257
    .line 258
    .line 259
    const v16, 0x3e23d70a    # 0.16f

    .line 260
    .line 261
    .line 262
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 263
    .line 264
    .line 265
    const v17, 0x3ecccccd    # 0.4f

    .line 266
    .line 267
    .line 268
    const v18, -0x417ae148    # -0.26f

    .line 269
    .line 270
    .line 271
    const v13, 0x3e051eb8    # 0.13f

    .line 272
    .line 273
    .line 274
    const v14, -0x42333333    # -0.1f

    .line 275
    .line 276
    .line 277
    const v15, 0x3e8a3d71    # 0.27f

    .line 278
    .line 279
    .line 280
    const v16, -0x41d1eb85    # -0.17f

    .line 281
    .line 282
    .line 283
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 284
    .line 285
    .line 286
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 287
    .line 288
    .line 289
    const/high16 v0, 0x41400000    # 12.0f

    .line 290
    .line 291
    const v2, 0x41773333    # 15.45f

    .line 292
    .line 293
    .line 294
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 295
    .line 296
    .line 297
    const v17, -0x3ef2b852    # -8.83f

    .line 298
    .line 299
    .line 300
    const v18, -0x3f53851f    # -5.39f

    .line 301
    .line 302
    .line 303
    const v13, -0x40066666    # -1.95f

    .line 304
    .line 305
    .line 306
    const v14, -0x3fc1eb85    # -2.97f

    .line 307
    .line 308
    .line 309
    const v15, -0x3f5b851f    # -5.14f

    .line 310
    .line 311
    .line 312
    const v16, -0x3f5f0a3d    # -5.03f

    .line 313
    .line 314
    .line 315
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 316
    .line 317
    .line 318
    const v17, -0x4071eb85    # -1.11f

    .line 319
    .line 320
    .line 321
    const v18, 0x3f8e147b    # 1.11f

    .line 322
    .line 323
    .line 324
    const v13, -0x40dc28f6    # -0.64f

    .line 325
    .line 326
    .line 327
    const v14, -0x428a3d71    # -0.06f

    .line 328
    .line 329
    .line 330
    const v15, -0x406a3d71    # -1.17f

    .line 331
    .line 332
    .line 333
    const v16, 0x3ef0a3d7    # 0.47f

    .line 334
    .line 335
    .line 336
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 337
    .line 338
    .line 339
    const v17, 0x40ff5c29    # 7.98f

    .line 340
    .line 341
    .line 342
    const v18, 0x412547ae    # 10.33f

    .line 343
    .line 344
    .line 345
    const v13, 0x3ee66666    # 0.45f

    .line 346
    .line 347
    .line 348
    const v14, 0x4099999a    # 4.8f

    .line 349
    .line 350
    .line 351
    const v15, 0x4069999a    # 3.65f

    .line 352
    .line 353
    .line 354
    const v16, 0x410c7ae1    # 8.78f

    .line 355
    .line 356
    .line 357
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 358
    .line 359
    .line 360
    const v17, 0x3ffc28f6    # 1.97f

    .line 361
    .line 362
    .line 363
    const v18, 0x3f028f5c    # 0.51f

    .line 364
    .line 365
    .line 366
    const v13, 0x3f2147ae    # 0.63f

    .line 367
    .line 368
    .line 369
    const v14, 0x3e6b851f    # 0.23f

    .line 370
    .line 371
    .line 372
    const v15, 0x3fa51eb8    # 1.29f

    .line 373
    .line 374
    .line 375
    const v16, 0x3ecccccd    # 0.4f

    .line 376
    .line 377
    .line 378
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 379
    .line 380
    .line 381
    const v18, -0x40fd70a4    # -0.51f

    .line 382
    .line 383
    .line 384
    const v13, 0x3f2e147b    # 0.68f

    .line 385
    .line 386
    .line 387
    const v14, -0x420a3d71    # -0.12f

    .line 388
    .line 389
    .line 390
    const v15, 0x3faa3d71    # 1.33f

    .line 391
    .line 392
    .line 393
    const v16, -0x416b851f    # -0.29f

    .line 394
    .line 395
    .line 396
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 397
    .line 398
    .line 399
    const v17, 0x40ff5c29    # 7.98f

    .line 400
    .line 401
    .line 402
    const v18, -0x3edab852    # -10.33f

    .line 403
    .line 404
    .line 405
    const v13, 0x408a8f5c    # 4.33f

    .line 406
    .line 407
    .line 408
    const v14, -0x4039999a    # -1.55f

    .line 409
    .line 410
    .line 411
    const v15, 0x40f0f5c3    # 7.53f

    .line 412
    .line 413
    .line 414
    const v16, -0x3f4f5c29    # -5.52f

    .line 415
    .line 416
    .line 417
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 418
    .line 419
    .line 420
    const v17, -0x4071eb85    # -1.11f

    .line 421
    .line 422
    .line 423
    const v18, -0x4071eb85    # -1.11f

    .line 424
    .line 425
    .line 426
    const v13, 0x3d75c28f    # 0.06f

    .line 427
    .line 428
    .line 429
    const v14, -0x40dc28f6    # -0.64f

    .line 430
    .line 431
    .line 432
    const v15, -0x410a3d71    # -0.48f

    .line 433
    .line 434
    .line 435
    const v16, -0x406a3d71    # -1.17f

    .line 436
    .line 437
    .line 438
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 439
    .line 440
    .line 441
    const v17, -0x3ef26666    # -8.85f

    .line 442
    .line 443
    .line 444
    const v18, 0x40ac7ae1    # 5.39f

    .line 445
    .line 446
    .line 447
    const v13, -0x3f928f5c    # -3.71f

    .line 448
    .line 449
    .line 450
    const v14, 0x3eb851ec    # 0.36f

    .line 451
    .line 452
    .line 453
    const v15, -0x3f233333    # -6.9f

    .line 454
    .line 455
    .line 456
    const v16, 0x401ae148    # 2.42f

    .line 457
    .line 458
    .line 459
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 460
    .line 461
    .line 462
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 463
    .line 464
    .line 465
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 466
    .line 467
    .line 468
    move-result-object v2

    .line 469
    const/16 v16, 0x3800

    .line 470
    .line 471
    const/16 v17, 0x0

    .line 472
    .line 473
    const/high16 v6, 0x3f800000    # 1.0f

    .line 474
    .line 475
    const/high16 v8, 0x3f800000    # 1.0f

    .line 476
    .line 477
    const/4 v7, 0x0

    .line 478
    const/high16 v9, 0x3f800000    # 1.0f

    .line 479
    .line 480
    const/high16 v12, 0x3f800000    # 1.0f

    .line 481
    .line 482
    const/4 v13, 0x0

    .line 483
    const/4 v14, 0x0

    .line 484
    const/4 v15, 0x0

    .line 485
    const-string v4, ""

    .line 486
    .line 487
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 488
    .line 489
    .line 490
    move-result-object v0

    .line 491
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 492
    .line 493
    .line 494
    move-result-object v0

    .line 495
    sput-object v0, Landroidx/compose/material/icons/rounded/SpaKt;->_spa:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 496
    .line 497
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 498
    .line 499
    .line 500
    return-object v0
.end method
