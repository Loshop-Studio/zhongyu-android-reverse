.class public final Landroidx/compose/material/icons/outlined/CopyrightKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_copyright",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "Copyright",
        "Landroidx/compose/material/icons/Icons$Outlined;",
        "getCopyright",
        "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;",
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
        "SMAP\nCopyright.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Copyright.kt\nandroidx/compose/material/icons/outlined/CopyrightKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,87:1\n212#2,12:88\n233#2,18:101\n253#2:138\n174#3:100\n705#4,2:119\n717#4,2:121\n719#4,11:127\n72#5,4:123\n*S KotlinDebug\n*F\n+ 1 Copyright.kt\nandroidx/compose/material/icons/outlined/CopyrightKt\n*L\n29#1:88,12\n30#1:101,18\n30#1:138\n29#1:100\n30#1:119,2\n30#1:121,2\n30#1:127,11\n30#1:123,4\n*E\n"
    }
.end annotation


# static fields
.field private static _copyright:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getCopyright(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/outlined/CopyrightKt;->_copyright:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Outlined.Copyright"

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
    const v0, 0x412147ae    # 10.08f

    .line 71
    .line 72
    .line 73
    const v2, 0x412dc28f    # 10.86f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v17, 0x3e99999a    # 0.3f

    .line 80
    .line 81
    .line 82
    const v18, -0x40a147ae    # -0.87f

    .line 83
    .line 84
    .line 85
    const v13, 0x3d4ccccd    # 0.05f

    .line 86
    .line 87
    .line 88
    const v14, -0x41570a3d    # -0.33f

    .line 89
    .line 90
    .line 91
    const v15, 0x3e23d70a    # 0.16f

    .line 92
    .line 93
    .line 94
    const v16, -0x40e147ae    # -0.62f

    .line 95
    .line 96
    .line 97
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 98
    .line 99
    .line 100
    const v0, 0x3f170a3d    # 0.59f

    .line 101
    .line 102
    .line 103
    const v2, -0x40e147ae    # -0.62f

    .line 104
    .line 105
    .line 106
    const v4, 0x3eae147b    # 0.34f

    .line 107
    .line 108
    .line 109
    const v6, -0x41147ae1    # -0.46f

    .line 110
    .line 111
    .line 112
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 113
    .line 114
    .line 115
    const v17, 0x3f68f5c3    # 0.91f

    .line 116
    .line 117
    .line 118
    const v18, -0x41947ae1    # -0.23f

    .line 119
    .line 120
    .line 121
    const v13, 0x3e75c28f    # 0.24f

    .line 122
    .line 123
    .line 124
    const v14, -0x41e66666    # -0.15f

    .line 125
    .line 126
    .line 127
    const v15, 0x3f0a3d71    # 0.54f

    .line 128
    .line 129
    .line 130
    const v16, -0x419eb852    # -0.22f

    .line 131
    .line 132
    .line 133
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 134
    .line 135
    .line 136
    const v17, 0x3f2147ae    # 0.63f

    .line 137
    .line 138
    .line 139
    const v18, 0x3e051eb8    # 0.13f

    .line 140
    .line 141
    .line 142
    const v13, 0x3e6b851f    # 0.23f

    .line 143
    .line 144
    .line 145
    const v14, 0x3c23d70a    # 0.01f

    .line 146
    .line 147
    .line 148
    const v15, 0x3ee147ae    # 0.44f

    .line 149
    .line 150
    .line 151
    const v16, 0x3d4ccccd    # 0.05f

    .line 152
    .line 153
    .line 154
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 155
    .line 156
    .line 157
    const v17, 0x3f051eb8    # 0.52f

    .line 158
    .line 159
    .line 160
    const v18, 0x3eb851ec    # 0.36f

    .line 161
    .line 162
    .line 163
    const v13, 0x3e4ccccd    # 0.2f

    .line 164
    .line 165
    .line 166
    const v14, 0x3db851ec    # 0.09f

    .line 167
    .line 168
    .line 169
    const v15, 0x3ec28f5c    # 0.38f

    .line 170
    .line 171
    .line 172
    const v16, 0x3e570a3d    # 0.21f

    .line 173
    .line 174
    .line 175
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 176
    .line 177
    .line 178
    const/high16 v0, 0x3e800000    # 0.25f

    .line 179
    .line 180
    const v2, 0x3f07ae14    # 0.53f

    .line 181
    .line 182
    .line 183
    const v4, 0x3ea8f5c3    # 0.33f

    .line 184
    .line 185
    .line 186
    const v6, 0x3eae147b    # 0.34f

    .line 187
    .line 188
    .line 189
    invoke-virtual {v12, v0, v4, v6, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 190
    .line 191
    .line 192
    const v0, 0x3e0f5c29    # 0.14f

    .line 193
    .line 194
    .line 195
    const v2, 0x3f23d70a    # 0.64f

    .line 196
    .line 197
    .line 198
    const v4, 0x3e051eb8    # 0.13f

    .line 199
    .line 200
    .line 201
    const v6, 0x3ed70a3d    # 0.42f

    .line 202
    .line 203
    .line 204
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 205
    .line 206
    .line 207
    const v0, 0x3fe51eb8    # 1.79f

    .line 208
    .line 209
    .line 210
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 211
    .line 212
    .line 213
    const v17, -0x4170a3d7    # -0.28f

    .line 214
    .line 215
    .line 216
    const v18, -0x405ae148    # -1.29f

    .line 217
    .line 218
    .line 219
    const v13, -0x435c28f6    # -0.02f

    .line 220
    .line 221
    .line 222
    const v14, -0x410f5c29    # -0.47f

    .line 223
    .line 224
    .line 225
    const v15, -0x421eb852    # -0.11f

    .line 226
    .line 227
    .line 228
    const v16, -0x4099999a    # -0.9f

    .line 229
    .line 230
    .line 231
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 232
    .line 233
    .line 234
    const v0, -0x40cccccd    # -0.7f

    .line 235
    .line 236
    .line 237
    const v2, -0x407eb852    # -1.01f

    .line 238
    .line 239
    .line 240
    const v4, -0x41333333    # -0.4f

    .line 241
    .line 242
    .line 243
    const v6, -0x40c51eb8    # -0.73f

    .line 244
    .line 245
    .line 246
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 247
    .line 248
    .line 249
    const/high16 v0, -0x41000000    # -0.5f

    .line 250
    .line 251
    const v2, -0x4075c28f    # -1.08f

    .line 252
    .line 253
    .line 254
    const v4, -0x40d70a3d    # -0.66f

    .line 255
    .line 256
    .line 257
    invoke-virtual {v12, v4, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 258
    .line 259
    .line 260
    const v0, -0x404e147b    # -1.39f

    .line 261
    .line 262
    .line 263
    const v2, -0x41947ae1    # -0.23f

    .line 264
    .line 265
    .line 266
    const v4, -0x409eb852    # -0.88f

    .line 267
    .line 268
    .line 269
    invoke-virtual {v12, v4, v2, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 270
    .line 271
    .line 272
    const v17, -0x40266666    # -1.7f

    .line 273
    .line 274
    .line 275
    const v18, 0x3eae147b    # 0.34f

    .line 276
    .line 277
    .line 278
    const v13, -0x40d9999a    # -0.65f

    .line 279
    .line 280
    .line 281
    const/4 v14, 0x0

    .line 282
    const v15, -0x4063d70a    # -1.22f

    .line 283
    .line 284
    .line 285
    const v16, 0x3de147ae    # 0.11f

    .line 286
    .line 287
    .line 288
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 289
    .line 290
    .line 291
    const v0, -0x40666666    # -1.2f

    .line 292
    .line 293
    .line 294
    const v2, 0x3f6b851f    # 0.92f

    .line 295
    .line 296
    .line 297
    const v4, 0x3f07ae14    # 0.53f

    .line 298
    .line 299
    .line 300
    const v6, -0x409eb852    # -0.88f

    .line 301
    .line 302
    .line 303
    invoke-virtual {v12, v6, v4, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 304
    .line 305
    .line 306
    const v0, -0x40ca3d71    # -0.71f

    .line 307
    .line 308
    .line 309
    const v2, 0x3fae147b    # 1.36f

    .line 310
    .line 311
    .line 312
    const v4, -0x40f0a3d7    # -0.56f

    .line 313
    .line 314
    .line 315
    const v6, 0x3f570a3d    # 0.84f

    .line 316
    .line 317
    .line 318
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 319
    .line 320
    .line 321
    const v0, 0x4134a3d7    # 11.29f

    .line 322
    .line 323
    .line 324
    const v2, 0x413deb85    # 11.87f

    .line 325
    .line 326
    .line 327
    const/high16 v4, 0x41000000    # 8.0f

    .line 328
    .line 329
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 330
    .line 331
    .line 332
    const v0, 0x3e8a3d71    # 0.27f

    .line 333
    .line 334
    .line 335
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 336
    .line 337
    .line 338
    const v17, 0x3e6b851f    # 0.23f

    .line 339
    .line 340
    .line 341
    const v18, 0x3fd1eb85    # 1.64f

    .line 342
    .line 343
    .line 344
    const/4 v13, 0x0

    .line 345
    const v14, 0x3f147ae1    # 0.58f

    .line 346
    .line 347
    .line 348
    const v15, 0x3da3d70a    # 0.08f

    .line 349
    .line 350
    .line 351
    const v16, 0x3f8f5c29    # 1.12f

    .line 352
    .line 353
    .line 354
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 355
    .line 356
    .line 357
    const v0, 0x3f35c28f    # 0.71f

    .line 358
    .line 359
    .line 360
    const v2, 0x3faccccd    # 1.35f

    .line 361
    .line 362
    .line 363
    const v4, 0x3ec7ae14    # 0.39f

    .line 364
    .line 365
    .line 366
    const v6, 0x3f7851ec    # 0.97f

    .line 367
    .line 368
    .line 369
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 370
    .line 371
    .line 372
    const v0, 0x3f99999a    # 1.2f

    .line 373
    .line 374
    .line 375
    const v2, 0x3f68f5c3    # 0.91f

    .line 376
    .line 377
    .line 378
    const v4, 0x3f3851ec    # 0.72f

    .line 379
    .line 380
    .line 381
    const v6, 0x3f30a3d7    # 0.69f

    .line 382
    .line 383
    .line 384
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 385
    .line 386
    .line 387
    const v17, 0x3fd9999a    # 1.7f

    .line 388
    .line 389
    .line 390
    const v18, 0x3eae147b    # 0.34f

    .line 391
    .line 392
    .line 393
    const v13, 0x3ef5c28f    # 0.48f

    .line 394
    .line 395
    .line 396
    const v14, 0x3e6147ae    # 0.22f

    .line 397
    .line 398
    .line 399
    const v15, 0x3f866666    # 1.05f

    .line 400
    .line 401
    .line 402
    const v16, 0x3eae147b    # 0.34f

    .line 403
    .line 404
    .line 405
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 406
    .line 407
    .line 408
    const v17, 0x3fa8f5c3    # 1.32f

    .line 409
    .line 410
    .line 411
    const v18, -0x41947ae1    # -0.23f

    .line 412
    .line 413
    .line 414
    const v13, 0x3ef0a3d7    # 0.47f

    .line 415
    .line 416
    .line 417
    const/4 v14, 0x0

    .line 418
    const v15, 0x3f68f5c3    # 0.91f

    .line 419
    .line 420
    .line 421
    const v16, -0x425c28f6    # -0.08f

    .line 422
    .line 423
    .line 424
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 425
    .line 426
    .line 427
    const v0, 0x3f8a3d71    # 1.08f

    .line 428
    .line 429
    .line 430
    const v2, -0x40deb852    # -0.63f

    .line 431
    .line 432
    .line 433
    const v4, -0x4147ae14    # -0.36f

    .line 434
    .line 435
    .line 436
    const v6, 0x3f451eb8    # 0.77f

    .line 437
    .line 438
    .line 439
    invoke-virtual {v12, v6, v4, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 440
    .line 441
    .line 442
    const v0, 0x3f3d70a4    # 0.74f

    .line 443
    .line 444
    .line 445
    const v2, -0x408f5c29    # -0.94f

    .line 446
    .line 447
    .line 448
    const v4, 0x3f0f5c29    # 0.56f

    .line 449
    .line 450
    .line 451
    const v6, -0x40eb851f    # -0.58f

    .line 452
    .line 453
    .line 454
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 455
    .line 456
    .line 457
    const v0, -0x40c28f5c    # -0.74f

    .line 458
    .line 459
    .line 460
    const v2, -0x406ccccd    # -1.15f

    .line 461
    .line 462
    .line 463
    const v4, 0x3e99999a    # 0.3f

    .line 464
    .line 465
    .line 466
    const v6, 0x3e947ae1    # 0.29f

    .line 467
    .line 468
    .line 469
    invoke-virtual {v12, v6, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 470
    .line 471
    .line 472
    const v0, -0x401ae148    # -1.79f

    .line 473
    .line 474
    .line 475
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 476
    .line 477
    .line 478
    const v17, -0x41e66666    # -0.15f

    .line 479
    .line 480
    .line 481
    const v18, 0x3f147ae1    # 0.58f

    .line 482
    .line 483
    .line 484
    const v13, -0x43dc28f6    # -0.01f

    .line 485
    .line 486
    .line 487
    const v14, 0x3e570a3d    # 0.21f

    .line 488
    .line 489
    .line 490
    const v15, -0x428a3d71    # -0.06f

    .line 491
    .line 492
    .line 493
    const v16, 0x3ecccccd    # 0.4f

    .line 494
    .line 495
    .line 496
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 497
    .line 498
    .line 499
    const v0, -0x41a8f5c3    # -0.21f

    .line 500
    .line 501
    .line 502
    const v2, 0x3eeb851f    # 0.46f

    .line 503
    .line 504
    .line 505
    const v4, -0x4147ae14    # -0.36f

    .line 506
    .line 507
    .line 508
    const v6, 0x3ea8f5c3    # 0.33f

    .line 509
    .line 510
    .line 511
    invoke-virtual {v12, v0, v6, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 512
    .line 513
    .line 514
    const v0, 0x3e6b851f    # 0.23f

    .line 515
    .line 516
    .line 517
    const v2, -0x40fae148    # -0.52f

    .line 518
    .line 519
    .line 520
    const v4, 0x3e99999a    # 0.3f

    .line 521
    .line 522
    .line 523
    const v6, -0x415c28f6    # -0.32f

    .line 524
    .line 525
    .line 526
    invoke-virtual {v12, v6, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 527
    .line 528
    .line 529
    const v17, -0x40e66666    # -0.6f

    .line 530
    .line 531
    .line 532
    const v18, 0x3dcccccd    # 0.1f

    .line 533
    .line 534
    .line 535
    const v13, -0x41bd70a4    # -0.19f

    .line 536
    .line 537
    .line 538
    const v14, 0x3d8f5c29    # 0.07f

    .line 539
    .line 540
    .line 541
    const v15, -0x413851ec    # -0.39f

    .line 542
    .line 543
    .line 544
    const v16, 0x3db851ec    # 0.09f

    .line 545
    .line 546
    .line 547
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 548
    .line 549
    .line 550
    const v17, -0x409c28f6    # -0.89f

    .line 551
    .line 552
    .line 553
    const v18, -0x41947ae1    # -0.23f

    .line 554
    .line 555
    .line 556
    const v13, -0x4147ae14    # -0.36f

    .line 557
    .line 558
    .line 559
    const v14, -0x43dc28f6    # -0.01f

    .line 560
    .line 561
    .line 562
    const v15, -0x40d70a3d    # -0.66f

    .line 563
    .line 564
    .line 565
    const v16, -0x425c28f6    # -0.08f

    .line 566
    .line 567
    .line 568
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 569
    .line 570
    .line 571
    const v17, -0x40e8f5c3    # -0.59f

    .line 572
    .line 573
    .line 574
    const v18, -0x40e147ae    # -0.62f

    .line 575
    .line 576
    .line 577
    const/high16 v13, -0x41800000    # -0.25f

    .line 578
    .line 579
    const v14, -0x41dc28f6    # -0.16f

    .line 580
    .line 581
    .line 582
    const v15, -0x4119999a    # -0.45f

    .line 583
    .line 584
    .line 585
    const v16, -0x41428f5c    # -0.37f

    .line 586
    .line 587
    .line 588
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 589
    .line 590
    .line 591
    const v0, -0x40f33333    # -0.55f

    .line 592
    .line 593
    .line 594
    const v2, -0x41666666    # -0.3f

    .line 595
    .line 596
    .line 597
    const v4, -0x409eb852    # -0.88f

    .line 598
    .line 599
    .line 600
    const/high16 v6, -0x41800000    # -0.25f

    .line 601
    .line 602
    invoke-virtual {v12, v6, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 603
    .line 604
    .line 605
    const v0, -0x40d47ae1    # -0.67f

    .line 606
    .line 607
    .line 608
    const/high16 v2, -0x40800000    # -1.0f

    .line 609
    .line 610
    const v4, -0x425c28f6    # -0.08f

    .line 611
    .line 612
    .line 613
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 614
    .line 615
    .line 616
    const v0, -0x4175c28f    # -0.27f

    .line 617
    .line 618
    .line 619
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 620
    .line 621
    .line 622
    const v17, 0x3da3d70a    # 0.08f

    .line 623
    .line 624
    .line 625
    const v18, -0x407eb852    # -1.01f

    .line 626
    .line 627
    .line 628
    const/4 v13, 0x0

    .line 629
    const v14, -0x414ccccd    # -0.35f

    .line 630
    .line 631
    .line 632
    const v15, 0x3cf5c28f    # 0.03f

    .line 633
    .line 634
    .line 635
    const v16, -0x40d1eb85    # -0.68f

    .line 636
    .line 637
    .line 638
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 639
    .line 640
    .line 641
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 642
    .line 643
    .line 644
    const/high16 v0, 0x40000000    # 2.0f

    .line 645
    .line 646
    const/high16 v2, 0x41400000    # 12.0f

    .line 647
    .line 648
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 649
    .line 650
    .line 651
    const/high16 v17, 0x40000000    # 2.0f

    .line 652
    .line 653
    const/high16 v18, 0x41400000    # 12.0f

    .line 654
    .line 655
    const v13, 0x40cf5c29    # 6.48f

    .line 656
    .line 657
    .line 658
    const/high16 v14, 0x40000000    # 2.0f

    .line 659
    .line 660
    const/high16 v15, 0x40000000    # 2.0f

    .line 661
    .line 662
    const v16, 0x40cf5c29    # 6.48f

    .line 663
    .line 664
    .line 665
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 666
    .line 667
    .line 668
    const v0, 0x408f5c29    # 4.48f

    .line 669
    .line 670
    .line 671
    const/high16 v2, 0x41200000    # 10.0f

    .line 672
    .line 673
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 674
    .line 675
    .line 676
    const v0, -0x3f70a3d7    # -4.48f

    .line 677
    .line 678
    .line 679
    const/high16 v2, -0x3ee00000    # -10.0f

    .line 680
    .line 681
    const/high16 v4, 0x41200000    # 10.0f

    .line 682
    .line 683
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 684
    .line 685
    .line 686
    const v0, 0x418c28f6    # 17.52f

    .line 687
    .line 688
    .line 689
    const/high16 v2, 0x40000000    # 2.0f

    .line 690
    .line 691
    const/high16 v4, 0x41400000    # 12.0f

    .line 692
    .line 693
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 694
    .line 695
    .line 696
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 697
    .line 698
    .line 699
    const/high16 v0, 0x41a00000    # 20.0f

    .line 700
    .line 701
    const/high16 v2, 0x41400000    # 12.0f

    .line 702
    .line 703
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 704
    .line 705
    .line 706
    const/high16 v17, -0x3f000000    # -8.0f

    .line 707
    .line 708
    const/high16 v18, -0x3f000000    # -8.0f

    .line 709
    .line 710
    const v13, -0x3f72e148    # -4.41f

    .line 711
    .line 712
    .line 713
    const/4 v14, 0x0

    .line 714
    const/high16 v15, -0x3f000000    # -8.0f

    .line 715
    .line 716
    const v16, -0x3f9a3d71    # -3.59f

    .line 717
    .line 718
    .line 719
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 720
    .line 721
    .line 722
    const v0, 0x4065c28f    # 3.59f

    .line 723
    .line 724
    .line 725
    const/high16 v2, -0x3f000000    # -8.0f

    .line 726
    .line 727
    const/high16 v4, 0x41000000    # 8.0f

    .line 728
    .line 729
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 730
    .line 731
    .line 732
    const/high16 v2, 0x41000000    # 8.0f

    .line 733
    .line 734
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 735
    .line 736
    .line 737
    const v0, -0x3f9a3d71    # -3.59f

    .line 738
    .line 739
    .line 740
    const/high16 v2, -0x3f000000    # -8.0f

    .line 741
    .line 742
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 743
    .line 744
    .line 745
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 746
    .line 747
    .line 748
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 749
    .line 750
    .line 751
    move-result-object v2

    .line 752
    const/16 v16, 0x3800

    .line 753
    .line 754
    const/16 v17, 0x0

    .line 755
    .line 756
    const/high16 v6, 0x3f800000    # 1.0f

    .line 757
    .line 758
    const/high16 v8, 0x3f800000    # 1.0f

    .line 759
    .line 760
    const/4 v7, 0x0

    .line 761
    const/high16 v9, 0x3f800000    # 1.0f

    .line 762
    .line 763
    const/high16 v12, 0x3f800000    # 1.0f

    .line 764
    .line 765
    const/4 v13, 0x0

    .line 766
    const/4 v15, 0x0

    .line 767
    const-string v4, ""

    .line 768
    .line 769
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 770
    .line 771
    .line 772
    move-result-object v0

    .line 773
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 774
    .line 775
    .line 776
    move-result-object v0

    .line 777
    sput-object v0, Landroidx/compose/material/icons/outlined/CopyrightKt;->_copyright:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 778
    .line 779
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 780
    .line 781
    .line 782
    return-object v0
.end method
