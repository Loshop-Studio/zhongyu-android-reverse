.class public final Landroidx/compose/material/icons/rounded/DownloadingKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_downloading",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "Downloading",
        "Landroidx/compose/material/icons/Icons$Rounded;",
        "getDownloading",
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
        "SMAP\nDownloading.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Downloading.kt\nandroidx/compose/material/icons/rounded/DownloadingKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,103:1\n212#2,12:104\n233#2,18:117\n253#2:154\n174#3:116\n705#4,2:135\n717#4,2:137\n719#4,11:143\n72#5,4:139\n*S KotlinDebug\n*F\n+ 1 Downloading.kt\nandroidx/compose/material/icons/rounded/DownloadingKt\n*L\n29#1:104,12\n30#1:117,18\n30#1:154\n29#1:116\n30#1:135,2\n30#1:137,2\n30#1:143,11\n30#1:139,4\n*E\n"
    }
.end annotation


# static fields
.field private static _downloading:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getDownloading(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/DownloadingKt;->_downloading:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.Downloading"

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
    const v0, 0x418aa3d7    # 17.33f

    .line 71
    .line 72
    .line 73
    const v2, 0x40633333    # 3.55f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v17, -0x3fb851ec    # -3.12f

    .line 80
    .line 81
    .line 82
    const v18, -0x4059999a    # -1.3f

    .line 83
    .line 84
    .line 85
    const v13, -0x408f5c29    # -0.94f

    .line 86
    .line 87
    .line 88
    const v14, -0x40e66666    # -0.6f

    .line 89
    .line 90
    .line 91
    const v15, -0x400147ae    # -1.99f

    .line 92
    .line 93
    .line 94
    const v16, -0x407ae148    # -1.04f

    .line 95
    .line 96
    .line 97
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 98
    .line 99
    .line 100
    const/high16 v17, 0x41500000    # 13.0f

    .line 101
    .line 102
    const v18, 0x404eb852    # 3.23f

    .line 103
    .line 104
    .line 105
    const v13, 0x415970a4    # 13.59f

    .line 106
    .line 107
    .line 108
    const v14, 0x40070a3d    # 2.11f

    .line 109
    .line 110
    .line 111
    const/high16 v15, 0x41500000    # 13.0f

    .line 112
    .line 113
    const v16, 0x4025c28f    # 2.59f

    .line 114
    .line 115
    .line 116
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 117
    .line 118
    .line 119
    const/4 v0, 0x0

    .line 120
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 121
    .line 122
    .line 123
    const v17, 0x3f3d70a4    # 0.74f

    .line 124
    .line 125
    .line 126
    const v18, 0x3f7851ec    # 0.97f

    .line 127
    .line 128
    .line 129
    const/4 v13, 0x0

    .line 130
    const v14, 0x3ee66666    # 0.45f

    .line 131
    .line 132
    .line 133
    const v15, 0x3e99999a    # 0.3f

    .line 134
    .line 135
    .line 136
    const v16, 0x3f5eb852    # 0.87f

    .line 137
    .line 138
    .line 139
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 140
    .line 141
    .line 142
    const v17, 0x4021eb85    # 2.53f

    .line 143
    .line 144
    .line 145
    const v18, 0x3f866666    # 1.05f

    .line 146
    .line 147
    .line 148
    const v13, 0x3f68f5c3    # 0.91f

    .line 149
    .line 150
    .line 151
    const v14, 0x3e4ccccd    # 0.2f

    .line 152
    .line 153
    .line 154
    const v15, 0x3fe28f5c    # 1.77f

    .line 155
    .line 156
    .line 157
    const v16, 0x3f0f5c29    # 0.56f

    .line 158
    .line 159
    .line 160
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 161
    .line 162
    .line 163
    const v17, 0x3f9c28f6    # 1.22f

    .line 164
    .line 165
    .line 166
    const v18, -0x41dc28f6    # -0.16f

    .line 167
    .line 168
    .line 169
    const v13, 0x3ec7ae14    # 0.39f

    .line 170
    .line 171
    .line 172
    const/high16 v14, 0x3e800000    # 0.25f

    .line 173
    .line 174
    const v15, 0x3f63d70a    # 0.89f

    .line 175
    .line 176
    .line 177
    const v16, 0x3e2e147b    # 0.17f

    .line 178
    .line 179
    .line 180
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 181
    .line 182
    .line 183
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 184
    .line 185
    .line 186
    const v17, 0x418aa3d7    # 17.33f

    .line 187
    .line 188
    .line 189
    const v18, 0x40633333    # 3.55f

    .line 190
    .line 191
    .line 192
    const v13, 0x418f851f    # 17.94f

    .line 193
    .line 194
    .line 195
    const v14, 0x40947ae1    # 4.64f

    .line 196
    .line 197
    .line 198
    const v15, 0x418ef5c3    # 17.87f

    .line 199
    .line 200
    .line 201
    const v16, 0x4078f5c3    # 3.89f

    .line 202
    .line 203
    .line 204
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 205
    .line 206
    .line 207
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 208
    .line 209
    .line 210
    const/high16 v0, 0x41300000    # 11.0f

    .line 211
    .line 212
    const v2, 0x41a628f6    # 20.77f

    .line 213
    .line 214
    .line 215
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 216
    .line 217
    .line 218
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 219
    .line 220
    .line 221
    const v17, 0x3f7ae148    # 0.98f

    .line 222
    .line 223
    .line 224
    const v18, -0x40651eb8    # -1.21f

    .line 225
    .line 226
    .line 227
    const v13, 0x3f23d70a    # 0.64f

    .line 228
    .line 229
    .line 230
    const/4 v14, 0x0

    .line 231
    const v15, 0x3f90a3d7    # 1.13f

    .line 232
    .line 233
    .line 234
    const v16, -0x40e8f5c3    # -0.59f

    .line 235
    .line 236
    .line 237
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 238
    .line 239
    .line 240
    const v17, -0x4059999a    # -1.3f

    .line 241
    .line 242
    .line 243
    const v18, -0x3fb851ec    # -3.12f

    .line 244
    .line 245
    .line 246
    const v13, -0x417ae148    # -0.26f

    .line 247
    .line 248
    .line 249
    const v14, -0x4070a3d7    # -1.12f

    .line 250
    .line 251
    .line 252
    const v15, -0x40cccccd    # -0.7f

    .line 253
    .line 254
    .line 255
    const v16, -0x3ff51eb8    # -2.17f

    .line 256
    .line 257
    .line 258
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 259
    .line 260
    .line 261
    const v17, -0x4039999a    # -1.55f

    .line 262
    .line 263
    .line 264
    const v18, -0x41dc28f6    # -0.16f

    .line 265
    .line 266
    .line 267
    const v13, -0x4151eb85    # -0.34f

    .line 268
    .line 269
    .line 270
    const v14, -0x40f5c28f    # -0.54f

    .line 271
    .line 272
    .line 273
    const v15, -0x40733333    # -1.1f

    .line 274
    .line 275
    .line 276
    const v16, -0x40e3d70a    # -0.61f

    .line 277
    .line 278
    .line 279
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 280
    .line 281
    .line 282
    const/4 v0, 0x0

    .line 283
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 284
    .line 285
    .line 286
    const v17, -0x41dc28f6    # -0.16f

    .line 287
    .line 288
    .line 289
    const v18, 0x3f9c28f6    # 1.22f

    .line 290
    .line 291
    .line 292
    const v13, -0x415c28f6    # -0.32f

    .line 293
    .line 294
    .line 295
    const v14, 0x3ea3d70a    # 0.32f

    .line 296
    .line 297
    .line 298
    const v15, -0x41333333    # -0.4f

    .line 299
    .line 300
    .line 301
    const v16, 0x3f547ae1    # 0.83f

    .line 302
    .line 303
    .line 304
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 305
    .line 306
    .line 307
    const v17, 0x3f866666    # 1.05f

    .line 308
    .line 309
    .line 310
    const v18, 0x4021eb85    # 2.53f

    .line 311
    .line 312
    .line 313
    const v13, 0x3efae148    # 0.49f

    .line 314
    .line 315
    .line 316
    const v14, 0x3f451eb8    # 0.77f

    .line 317
    .line 318
    .line 319
    const v15, 0x3f59999a    # 0.85f

    .line 320
    .line 321
    .line 322
    const v16, 0x3fcf5c29    # 1.62f

    .line 323
    .line 324
    .line 325
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 326
    .line 327
    .line 328
    const v17, 0x41a628f6    # 20.77f

    .line 329
    .line 330
    .line 331
    const/high16 v18, 0x41300000    # 11.0f

    .line 332
    .line 333
    const v13, 0x419f3333    # 19.9f

    .line 334
    .line 335
    .line 336
    const v14, 0x412b3333    # 10.7f

    .line 337
    .line 338
    .line 339
    const v15, 0x41a27ae1    # 20.31f

    .line 340
    .line 341
    .line 342
    const/high16 v16, 0x41300000    # 11.0f

    .line 343
    .line 344
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 345
    .line 346
    .line 347
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 348
    .line 349
    .line 350
    const v0, 0x418beb85    # 17.49f

    .line 351
    .line 352
    .line 353
    const v2, 0x41973333    # 18.9f

    .line 354
    .line 355
    .line 356
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 357
    .line 358
    .line 359
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 360
    .line 361
    .line 362
    const v17, 0x3fc66666    # 1.55f

    .line 363
    .line 364
    .line 365
    const v18, -0x41e66666    # -0.15f

    .line 366
    .line 367
    .line 368
    const v13, 0x3ee66666    # 0.45f

    .line 369
    .line 370
    .line 371
    const v14, 0x3ee66666    # 0.45f

    .line 372
    .line 373
    .line 374
    const v15, 0x3f9ae148    # 1.21f

    .line 375
    .line 376
    .line 377
    const v16, 0x3ec28f5c    # 0.38f

    .line 378
    .line 379
    .line 380
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 381
    .line 382
    .line 383
    const v17, 0x3fa66666    # 1.3f

    .line 384
    .line 385
    .line 386
    const v18, -0x3fb8f5c3    # -3.11f

    .line 387
    .line 388
    .line 389
    const v13, 0x3f19999a    # 0.6f

    .line 390
    .line 391
    .line 392
    const v14, -0x408f5c29    # -0.94f

    .line 393
    .line 394
    .line 395
    const v15, 0x3f851eb8    # 1.04f

    .line 396
    .line 397
    .line 398
    const v16, -0x400147ae    # -1.99f

    .line 399
    .line 400
    .line 401
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 402
    .line 403
    .line 404
    const v17, -0x40851eb8    # -0.98f

    .line 405
    .line 406
    .line 407
    const v18, -0x40651eb8    # -1.21f

    .line 408
    .line 409
    .line 410
    const v13, 0x3e0f5c29    # 0.14f

    .line 411
    .line 412
    .line 413
    const v14, -0x40e147ae    # -0.62f

    .line 414
    .line 415
    .line 416
    const v15, -0x414ccccd    # -0.35f

    .line 417
    .line 418
    .line 419
    const v16, -0x40651eb8    # -1.21f

    .line 420
    .line 421
    .line 422
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 423
    .line 424
    .line 425
    const/4 v0, 0x0

    .line 426
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 427
    .line 428
    .line 429
    const v17, -0x4087ae14    # -0.97f

    .line 430
    .line 431
    .line 432
    const v18, 0x3f3d70a4    # 0.74f

    .line 433
    .line 434
    .line 435
    const v13, -0x4119999a    # -0.45f

    .line 436
    .line 437
    .line 438
    const/4 v14, 0x0

    .line 439
    const v15, -0x40a147ae    # -0.87f

    .line 440
    .line 441
    .line 442
    const v16, 0x3e99999a    # 0.3f

    .line 443
    .line 444
    .line 445
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 446
    .line 447
    .line 448
    const v17, -0x4079999a    # -1.05f

    .line 449
    .line 450
    .line 451
    const v18, 0x4021eb85    # 2.53f

    .line 452
    .line 453
    .line 454
    const v13, -0x41b33333    # -0.2f

    .line 455
    .line 456
    .line 457
    const v14, 0x3f68f5c3    # 0.91f

    .line 458
    .line 459
    .line 460
    const v15, -0x40ee147b    # -0.57f

    .line 461
    .line 462
    .line 463
    const v16, 0x3fe147ae    # 1.76f

    .line 464
    .line 465
    .line 466
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 467
    .line 468
    .line 469
    const v17, 0x41973333    # 18.9f

    .line 470
    .line 471
    .line 472
    const v18, 0x418beb85    # 17.49f

    .line 473
    .line 474
    .line 475
    const/high16 v13, 0x41940000    # 18.5f

    .line 476
    .line 477
    const v14, 0x418547ae    # 16.66f

    .line 478
    .line 479
    .line 480
    const v15, 0x4194a3d7    # 18.58f

    .line 481
    .line 482
    .line 483
    const v16, 0x41895c29    # 17.17f

    .line 484
    .line 485
    .line 486
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 487
    .line 488
    .line 489
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 490
    .line 491
    .line 492
    const/high16 v0, 0x41500000    # 13.0f

    .line 493
    .line 494
    const v2, 0x41a628f6    # 20.77f

    .line 495
    .line 496
    .line 497
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 498
    .line 499
    .line 500
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 501
    .line 502
    .line 503
    const v17, 0x3f9ae148    # 1.21f

    .line 504
    .line 505
    .line 506
    const v18, 0x3f7ae148    # 0.98f

    .line 507
    .line 508
    .line 509
    const/4 v13, 0x0

    .line 510
    const v14, 0x3f23d70a    # 0.64f

    .line 511
    .line 512
    .line 513
    const v15, 0x3f170a3d    # 0.59f

    .line 514
    .line 515
    .line 516
    const v16, 0x3f90a3d7    # 1.13f

    .line 517
    .line 518
    .line 519
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 520
    .line 521
    .line 522
    const v17, 0x40470a3d    # 3.11f

    .line 523
    .line 524
    .line 525
    const v18, -0x4059999a    # -1.3f

    .line 526
    .line 527
    .line 528
    const v13, 0x3f8f5c29    # 1.12f

    .line 529
    .line 530
    .line 531
    const v14, -0x417ae148    # -0.26f

    .line 532
    .line 533
    .line 534
    const v15, 0x400ae148    # 2.17f

    .line 535
    .line 536
    .line 537
    const v16, -0x40cccccd    # -0.7f

    .line 538
    .line 539
    .line 540
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 541
    .line 542
    .line 543
    const v17, 0x3e23d70a    # 0.16f

    .line 544
    .line 545
    .line 546
    const v18, -0x4039999a    # -1.55f

    .line 547
    .line 548
    .line 549
    const v13, 0x3f0a3d71    # 0.54f

    .line 550
    .line 551
    .line 552
    const v14, -0x4151eb85    # -0.34f

    .line 553
    .line 554
    .line 555
    const v15, 0x3f1c28f6    # 0.61f

    .line 556
    .line 557
    .line 558
    const v16, -0x40733333    # -1.1f

    .line 559
    .line 560
    .line 561
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 562
    .line 563
    .line 564
    const/4 v0, 0x0

    .line 565
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 566
    .line 567
    .line 568
    const v17, -0x40651eb8    # -1.21f

    .line 569
    .line 570
    .line 571
    const v18, -0x41e66666    # -0.15f

    .line 572
    .line 573
    .line 574
    const v13, -0x415c28f6    # -0.32f

    .line 575
    .line 576
    .line 577
    const v14, -0x415c28f6    # -0.32f

    .line 578
    .line 579
    .line 580
    const v15, -0x40ab851f    # -0.83f

    .line 581
    .line 582
    .line 583
    const v16, -0x41333333    # -0.4f

    .line 584
    .line 585
    .line 586
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 587
    .line 588
    .line 589
    const v17, -0x3fde147b    # -2.53f

    .line 590
    .line 591
    .line 592
    const v18, 0x3f866666    # 1.05f

    .line 593
    .line 594
    .line 595
    const v13, -0x40bd70a4    # -0.76f

    .line 596
    .line 597
    .line 598
    const v14, 0x3efae148    # 0.49f

    .line 599
    .line 600
    .line 601
    const v15, -0x4031eb85    # -1.61f

    .line 602
    .line 603
    .line 604
    const v16, 0x3f59999a    # 0.85f

    .line 605
    .line 606
    .line 607
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 608
    .line 609
    .line 610
    const/high16 v17, 0x41500000    # 13.0f

    .line 611
    .line 612
    const v18, 0x41a628f6    # 20.77f

    .line 613
    .line 614
    .line 615
    const v13, 0x4154cccd    # 13.3f

    .line 616
    .line 617
    .line 618
    const v14, 0x419f3333    # 19.9f

    .line 619
    .line 620
    .line 621
    const/high16 v15, 0x41500000    # 13.0f

    .line 622
    .line 623
    const v16, 0x41a27ae1    # 20.31f

    .line 624
    .line 625
    .line 626
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 627
    .line 628
    .line 629
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 630
    .line 631
    .line 632
    const/high16 v0, 0x41400000    # 12.0f

    .line 633
    .line 634
    const/high16 v2, 0x41500000    # 13.0f

    .line 635
    .line 636
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 637
    .line 638
    .line 639
    const/high16 v0, 0x41000000    # 8.0f

    .line 640
    .line 641
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 642
    .line 643
    .line 644
    const/high16 v17, -0x40800000    # -1.0f

    .line 645
    .line 646
    const/high16 v18, -0x40800000    # -1.0f

    .line 647
    .line 648
    const/4 v13, 0x0

    .line 649
    const v14, -0x40f33333    # -0.55f

    .line 650
    .line 651
    .line 652
    const v15, -0x4119999a    # -0.45f

    .line 653
    .line 654
    .line 655
    const/high16 v16, -0x40800000    # -1.0f

    .line 656
    .line 657
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 658
    .line 659
    .line 660
    const/4 v0, 0x0

    .line 661
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 662
    .line 663
    .line 664
    const/high16 v18, 0x3f800000    # 1.0f

    .line 665
    .line 666
    const v13, -0x40f33333    # -0.55f

    .line 667
    .line 668
    .line 669
    const/4 v14, 0x0

    .line 670
    const/high16 v15, -0x40800000    # -1.0f

    .line 671
    .line 672
    const v16, 0x3ee66666    # 0.45f

    .line 673
    .line 674
    .line 675
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 676
    .line 677
    .line 678
    const/high16 v0, 0x40800000    # 4.0f

    .line 679
    .line 680
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 681
    .line 682
    .line 683
    const v0, 0x41168f5c    # 9.41f

    .line 684
    .line 685
    .line 686
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 687
    .line 688
    .line 689
    const v17, -0x40ca3d71    # -0.71f

    .line 690
    .line 691
    .line 692
    const v18, 0x3fdae148    # 1.71f

    .line 693
    .line 694
    .line 695
    const v13, -0x409c28f6    # -0.89f

    .line 696
    .line 697
    .line 698
    const v15, -0x40547ae1    # -1.34f

    .line 699
    .line 700
    .line 701
    const v16, 0x3f8a3d71    # 1.08f

    .line 702
    .line 703
    .line 704
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 705
    .line 706
    .line 707
    const v0, 0x4025c28f    # 2.59f

    .line 708
    .line 709
    .line 710
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 711
    .line 712
    .line 713
    const v17, 0x3fb47ae1    # 1.41f

    .line 714
    .line 715
    .line 716
    const/16 v18, 0x0

    .line 717
    .line 718
    const v13, 0x3ec7ae14    # 0.39f

    .line 719
    .line 720
    .line 721
    const v14, 0x3ec7ae14    # 0.39f

    .line 722
    .line 723
    .line 724
    const v15, 0x3f828f5c    # 1.02f

    .line 725
    .line 726
    .line 727
    const v16, 0x3ec7ae14    # 0.39f

    .line 728
    .line 729
    .line 730
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 731
    .line 732
    .line 733
    const v0, -0x3fda3d71    # -2.59f

    .line 734
    .line 735
    .line 736
    const v2, 0x4025c28f    # 2.59f

    .line 737
    .line 738
    .line 739
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 740
    .line 741
    .line 742
    const v17, -0x40ca3d71    # -0.71f

    .line 743
    .line 744
    .line 745
    const v18, -0x40251eb8    # -1.71f

    .line 746
    .line 747
    .line 748
    const v13, 0x3f2147ae    # 0.63f

    .line 749
    .line 750
    .line 751
    const v14, -0x40deb852    # -0.63f

    .line 752
    .line 753
    .line 754
    const v15, 0x3e3851ec    # 0.18f

    .line 755
    .line 756
    .line 757
    const v16, -0x40251eb8    # -1.71f

    .line 758
    .line 759
    .line 760
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 761
    .line 762
    .line 763
    const/high16 v0, 0x41500000    # 13.0f

    .line 764
    .line 765
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 766
    .line 767
    .line 768
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 769
    .line 770
    .line 771
    const/high16 v0, 0x41300000    # 11.0f

    .line 772
    .line 773
    const v2, 0x41a628f6    # 20.77f

    .line 774
    .line 775
    .line 776
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 777
    .line 778
    .line 779
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 780
    .line 781
    .line 782
    const v17, -0x40651eb8    # -1.21f

    .line 783
    .line 784
    .line 785
    const v18, 0x3f7d70a4    # 0.99f

    .line 786
    .line 787
    .line 788
    const/4 v13, 0x0

    .line 789
    const v14, 0x3f23d70a    # 0.64f

    .line 790
    .line 791
    .line 792
    const v15, -0x40e8f5c3    # -0.59f

    .line 793
    .line 794
    .line 795
    const v16, 0x3f90a3d7    # 1.13f

    .line 796
    .line 797
    .line 798
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 799
    .line 800
    .line 801
    const/high16 v17, 0x40000000    # 2.0f

    .line 802
    .line 803
    const/high16 v18, 0x41400000    # 12.0f

    .line 804
    .line 805
    const v13, 0x40aa8f5c    # 5.33f

    .line 806
    .line 807
    .line 808
    const/high16 v14, 0x41a60000    # 20.75f

    .line 809
    .line 810
    const/high16 v15, 0x40000000    # 2.0f

    .line 811
    .line 812
    const v16, 0x418628f6    # 16.77f

    .line 813
    .line 814
    .line 815
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 816
    .line 817
    .line 818
    const v0, 0x40f947ae    # 7.79f

    .line 819
    .line 820
    .line 821
    const/high16 v2, -0x3ee40000    # -9.75f

    .line 822
    .line 823
    const v4, 0x40551eb8    # 3.33f

    .line 824
    .line 825
    .line 826
    const/high16 v6, -0x3ef40000    # -8.75f

    .line 827
    .line 828
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 829
    .line 830
    .line 831
    const/high16 v17, 0x41300000    # 11.0f

    .line 832
    .line 833
    const v18, 0x404eb852    # 3.23f

    .line 834
    .line 835
    .line 836
    const v13, 0x41268f5c    # 10.41f

    .line 837
    .line 838
    .line 839
    const v14, 0x40070a3d    # 2.11f

    .line 840
    .line 841
    .line 842
    const/high16 v15, 0x41300000    # 11.0f

    .line 843
    .line 844
    const v16, 0x4025c28f    # 2.59f

    .line 845
    .line 846
    .line 847
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 848
    .line 849
    .line 850
    const/4 v0, 0x0

    .line 851
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 852
    .line 853
    .line 854
    const v17, -0x40bd70a4    # -0.76f

    .line 855
    .line 856
    .line 857
    const v18, 0x3f7851ec    # 0.97f

    .line 858
    .line 859
    .line 860
    const/4 v13, 0x0

    .line 861
    const v14, 0x3eeb851f    # 0.46f

    .line 862
    .line 863
    .line 864
    const v15, -0x416147ae    # -0.31f

    .line 865
    .line 866
    .line 867
    const v16, 0x3f5eb852    # 0.87f

    .line 868
    .line 869
    .line 870
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 871
    .line 872
    .line 873
    const/high16 v17, 0x40800000    # 4.0f

    .line 874
    .line 875
    const/high16 v18, 0x41400000    # 12.0f

    .line 876
    .line 877
    const v13, 0x40d570a4    # 6.67f

    .line 878
    .line 879
    .line 880
    const/high16 v14, 0x40a00000    # 5.0f

    .line 881
    .line 882
    const/high16 v15, 0x40800000    # 4.0f

    .line 883
    .line 884
    const v16, 0x41030a3d    # 8.19f

    .line 885
    .line 886
    .line 887
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 888
    .line 889
    .line 890
    const v0, 0x40c7ae14    # 6.24f

    .line 891
    .line 892
    .line 893
    const v2, 0x40f9999a    # 7.8f

    .line 894
    .line 895
    .line 896
    const v4, 0x402ae148    # 2.67f

    .line 897
    .line 898
    .line 899
    const/high16 v6, 0x40e00000    # 7.0f

    .line 900
    .line 901
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 902
    .line 903
    .line 904
    const/high16 v17, 0x41300000    # 11.0f

    .line 905
    .line 906
    const v18, 0x41a628f6    # 20.77f

    .line 907
    .line 908
    .line 909
    const v13, 0x412b0a3d    # 10.69f

    .line 910
    .line 911
    .line 912
    const v14, 0x419f3333    # 19.9f

    .line 913
    .line 914
    .line 915
    const/high16 v15, 0x41300000    # 11.0f

    .line 916
    .line 917
    const v16, 0x41a27ae1    # 20.31f

    .line 918
    .line 919
    .line 920
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 921
    .line 922
    .line 923
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 924
    .line 925
    .line 926
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 927
    .line 928
    .line 929
    move-result-object v2

    .line 930
    const/16 v16, 0x3800

    .line 931
    .line 932
    const/16 v17, 0x0

    .line 933
    .line 934
    const/high16 v6, 0x3f800000    # 1.0f

    .line 935
    .line 936
    const/high16 v8, 0x3f800000    # 1.0f

    .line 937
    .line 938
    const/4 v7, 0x0

    .line 939
    const/high16 v9, 0x3f800000    # 1.0f

    .line 940
    .line 941
    const/high16 v12, 0x3f800000    # 1.0f

    .line 942
    .line 943
    const/4 v13, 0x0

    .line 944
    const/4 v14, 0x0

    .line 945
    const/4 v15, 0x0

    .line 946
    const-string v4, ""

    .line 947
    .line 948
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 949
    .line 950
    .line 951
    move-result-object v0

    .line 952
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 953
    .line 954
    .line 955
    move-result-object v0

    .line 956
    sput-object v0, Landroidx/compose/material/icons/rounded/DownloadingKt;->_downloading:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 957
    .line 958
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 959
    .line 960
    .line 961
    return-object v0
.end method
