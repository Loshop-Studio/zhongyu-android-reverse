.class public final Landroidx/compose/material/icons/rounded/CrueltyFreeKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_crueltyFree",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "CrueltyFree",
        "Landroidx/compose/material/icons/Icons$Rounded;",
        "getCrueltyFree",
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
        "SMAP\nCrueltyFree.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CrueltyFree.kt\nandroidx/compose/material/icons/rounded/CrueltyFreeKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,83:1\n212#2,12:84\n233#2,18:97\n253#2:134\n174#3:96\n705#4,2:115\n717#4,2:117\n719#4,11:123\n72#5,4:119\n*S KotlinDebug\n*F\n+ 1 CrueltyFree.kt\nandroidx/compose/material/icons/rounded/CrueltyFreeKt\n*L\n29#1:84,12\n30#1:97,18\n30#1:134\n29#1:96\n30#1:115,2\n30#1:117,2\n30#1:123,11\n30#1:119,4\n*E\n"
    }
.end annotation


# static fields
.field private static _crueltyFree:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getCrueltyFree(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/CrueltyFreeKt;->_crueltyFree:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.CrueltyFree"

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
    const v0, 0x4186b852    # 16.84f

    .line 71
    .line 72
    .line 73
    const v2, 0x416851ec    # 14.52f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v17, -0x40b5c28f    # -0.79f

    .line 80
    .line 81
    .line 82
    const v18, -0x40a8f5c3    # -0.84f

    .line 83
    .line 84
    .line 85
    const v13, -0x417ae148    # -0.26f

    .line 86
    .line 87
    .line 88
    const v14, -0x41bd70a4    # -0.19f

    .line 89
    .line 90
    .line 91
    const v15, -0x40e147ae    # -0.62f

    .line 92
    .line 93
    .line 94
    const v16, -0x40deb852    # -0.63f

    .line 95
    .line 96
    .line 97
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 98
    .line 99
    .line 100
    const/high16 v17, 0x41980000    # 19.0f

    .line 101
    .line 102
    const/high16 v18, 0x40a00000    # 5.0f

    .line 103
    .line 104
    const v13, 0x4189eb85    # 17.24f

    .line 105
    .line 106
    .line 107
    const v14, 0x414028f6    # 12.01f

    .line 108
    .line 109
    .line 110
    const/high16 v15, 0x41980000    # 19.0f

    .line 111
    .line 112
    const v16, 0x410deb85    # 8.87f

    .line 113
    .line 114
    .line 115
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 116
    .line 117
    .line 118
    const/high16 v17, -0x40000000    # -2.0f

    .line 119
    .line 120
    const/high16 v18, -0x3fc00000    # -3.0f

    .line 121
    .line 122
    const/4 v13, 0x0

    .line 123
    const v14, -0x40066666    # -1.95f

    .line 124
    .line 125
    .line 126
    const v15, -0x40c28f5c    # -0.74f

    .line 127
    .line 128
    .line 129
    const/high16 v16, -0x3fc00000    # -3.0f

    .line 130
    .line 131
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 132
    .line 133
    .line 134
    const/high16 v17, -0x3f600000    # -5.0f

    .line 135
    .line 136
    const v18, 0x40bf0a3d    # 5.97f

    .line 137
    .line 138
    .line 139
    const v13, -0x403ae148    # -1.54f

    .line 140
    .line 141
    .line 142
    const/4 v14, 0x0

    .line 143
    const v15, -0x3f828f5c    # -3.96f

    .line 144
    .line 145
    .line 146
    const v16, 0x4003d70a    # 2.06f

    .line 147
    .line 148
    .line 149
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 150
    .line 151
    .line 152
    const/high16 v17, 0x40e00000    # 7.0f

    .line 153
    .line 154
    const/high16 v18, 0x40000000    # 2.0f

    .line 155
    .line 156
    const v13, 0x412f5c29    # 10.96f

    .line 157
    .line 158
    .line 159
    const v14, 0x4081eb85    # 4.06f

    .line 160
    .line 161
    .line 162
    const v15, 0x4108a3d7    # 8.54f

    .line 163
    .line 164
    .line 165
    const/high16 v16, 0x40000000    # 2.0f

    .line 166
    .line 167
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 168
    .line 169
    .line 170
    const/high16 v17, 0x40a00000    # 5.0f

    .line 171
    .line 172
    const/high16 v18, 0x40a00000    # 5.0f

    .line 173
    .line 174
    const v13, 0x40b7ae14    # 5.74f

    .line 175
    .line 176
    .line 177
    const/high16 v14, 0x40000000    # 2.0f

    .line 178
    .line 179
    const/high16 v15, 0x40a00000    # 5.0f

    .line 180
    .line 181
    const v16, 0x40433333    # 3.05f

    .line 182
    .line 183
    .line 184
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 185
    .line 186
    .line 187
    const v17, 0x403ccccd    # 2.95f

    .line 188
    .line 189
    .line 190
    const v18, 0x410ae148    # 8.68f

    .line 191
    .line 192
    .line 193
    const/4 v13, 0x0

    .line 194
    const v14, 0x4077ae14    # 3.87f

    .line 195
    .line 196
    .line 197
    const v15, 0x3fe147ae    # 1.76f

    .line 198
    .line 199
    .line 200
    const v16, 0x40e051ec    # 7.01f

    .line 201
    .line 202
    .line 203
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 204
    .line 205
    .line 206
    const v17, -0x40b5c28f    # -0.79f

    .line 207
    .line 208
    .line 209
    const v18, 0x3f570a3d    # 0.84f

    .line 210
    .line 211
    .line 212
    const v13, -0x41d1eb85    # -0.17f

    .line 213
    .line 214
    .line 215
    const v14, 0x3e570a3d    # 0.21f

    .line 216
    .line 217
    .line 218
    const v15, -0x40f851ec    # -0.53f

    .line 219
    .line 220
    .line 221
    const v16, 0x3f266666    # 0.65f

    .line 222
    .line 223
    .line 224
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 225
    .line 226
    .line 227
    const v17, -0x402b851f    # -1.66f

    .line 228
    .line 229
    .line 230
    const v18, 0x403eb852    # 2.98f

    .line 231
    .line 232
    .line 233
    const/high16 v13, -0x41000000    # -0.5f

    .line 234
    .line 235
    const v14, 0x3ed1eb85    # 0.41f

    .line 236
    .line 237
    .line 238
    const v15, -0x402b851f    # -1.66f

    .line 239
    .line 240
    .line 241
    const v16, 0x3faf5c29    # 1.37f

    .line 242
    .line 243
    .line 244
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 245
    .line 246
    .line 247
    const/high16 v17, 0x40800000    # 4.0f

    .line 248
    .line 249
    const/high16 v18, 0x40800000    # 4.0f

    .line 250
    .line 251
    const/4 v13, 0x0

    .line 252
    const v14, 0x400d70a4    # 2.21f

    .line 253
    .line 254
    .line 255
    const v15, 0x3fe51eb8    # 1.79f

    .line 256
    .line 257
    .line 258
    const/high16 v16, 0x40800000    # 4.0f

    .line 259
    .line 260
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 261
    .line 262
    .line 263
    const/high16 v17, 0x40200000    # 2.5f

    .line 264
    .line 265
    const v18, -0x40f0a3d7    # -0.56f

    .line 266
    .line 267
    .line 268
    const v13, 0x3fc66666    # 1.55f

    .line 269
    .line 270
    .line 271
    const/4 v14, 0x0

    .line 272
    const/high16 v15, 0x40200000    # 2.5f

    .line 273
    .line 274
    const v16, -0x40f0a3d7    # -0.56f

    .line 275
    .line 276
    .line 277
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 278
    .line 279
    .line 280
    const v0, 0x3f733333    # 0.95f

    .line 281
    .line 282
    .line 283
    const/high16 v2, 0x40200000    # 2.5f

    .line 284
    .line 285
    const v4, 0x3f0f5c29    # 0.56f

    .line 286
    .line 287
    .line 288
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 289
    .line 290
    .line 291
    const/high16 v17, 0x40800000    # 4.0f

    .line 292
    .line 293
    const/high16 v18, -0x3f800000    # -4.0f

    .line 294
    .line 295
    const v13, 0x400d70a4    # 2.21f

    .line 296
    .line 297
    .line 298
    const/high16 v15, 0x40800000    # 4.0f

    .line 299
    .line 300
    const v16, -0x401ae148    # -1.79f

    .line 301
    .line 302
    .line 303
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 304
    .line 305
    .line 306
    const v17, 0x4186b852    # 16.84f

    .line 307
    .line 308
    .line 309
    const v18, 0x416851ec    # 14.52f

    .line 310
    .line 311
    .line 312
    const/high16 v13, 0x41940000    # 18.5f

    .line 313
    .line 314
    const v14, 0x417e3d71    # 15.89f

    .line 315
    .line 316
    .line 317
    const v15, 0x418ab852    # 17.34f

    .line 318
    .line 319
    .line 320
    const v16, 0x416ee148    # 14.93f

    .line 321
    .line 322
    .line 323
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 324
    .line 325
    .line 326
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 327
    .line 328
    .line 329
    const v0, 0x4115999a    # 9.35f

    .line 330
    .line 331
    .line 332
    const v2, 0x41433333    # 12.2f

    .line 333
    .line 334
    .line 335
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 336
    .line 337
    .line 338
    const/high16 v17, 0x40e00000    # 7.0f

    .line 339
    .line 340
    const/high16 v18, 0x40a00000    # 5.0f

    .line 341
    .line 342
    const v13, 0x410570a4    # 8.34f

    .line 343
    .line 344
    .line 345
    const v14, 0x412b3333    # 10.7f

    .line 346
    .line 347
    .line 348
    const/high16 v15, 0x40e00000    # 7.0f

    .line 349
    .line 350
    const v16, 0x4101eb85    # 8.12f

    .line 351
    .line 352
    .line 353
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 354
    .line 355
    .line 356
    const v17, 0x3df5c28f    # 0.12f

    .line 357
    .line 358
    .line 359
    const v18, -0x4087ae14    # -0.97f

    .line 360
    .line 361
    .line 362
    const/4 v13, 0x0

    .line 363
    const v14, -0x41051eb8    # -0.49f

    .line 364
    .line 365
    .line 366
    const v15, 0x3d75c28f    # 0.06f

    .line 367
    .line 368
    .line 369
    const v16, -0x40b33333    # -0.8f

    .line 370
    .line 371
    .line 372
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 373
    .line 374
    .line 375
    const v17, 0x405851ec    # 3.38f

    .line 376
    .line 377
    .line 378
    const v18, 0x40f47ae1    # 7.64f

    .line 379
    .line 380
    .line 381
    const v13, 0x3f70a3d7    # 0.94f

    .line 382
    .line 383
    .line 384
    const v14, 0x3e9eb852    # 0.31f

    .line 385
    .line 386
    .line 387
    const v15, 0x404f5c29    # 3.24f

    .line 388
    .line 389
    .line 390
    const v16, 0x402d70a4    # 2.71f

    .line 391
    .line 392
    .line 393
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 394
    .line 395
    .line 396
    const v17, 0x4115999a    # 9.35f

    .line 397
    .line 398
    .line 399
    const v18, 0x41433333    # 12.2f

    .line 400
    .line 401
    .line 402
    const v13, 0x41207ae1    # 10.03f

    .line 403
    .line 404
    .line 405
    const v14, 0x413ca3d7    # 11.79f

    .line 406
    .line 407
    .line 408
    const v15, 0x411a8f5c    # 9.66f

    .line 409
    .line 410
    .line 411
    const v16, 0x413f851f    # 11.97f

    .line 412
    .line 413
    .line 414
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 415
    .line 416
    .line 417
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 418
    .line 419
    .line 420
    const/high16 v0, 0x41280000    # 10.5f

    .line 421
    .line 422
    const/high16 v2, 0x41860000    # 16.75f

    .line 423
    .line 424
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 425
    .line 426
    .line 427
    const/high16 v17, -0x41000000    # -0.5f

    .line 428
    .line 429
    const/high16 v18, -0x40c00000    # -0.75f

    .line 430
    .line 431
    const v13, -0x4170a3d7    # -0.28f

    .line 432
    .line 433
    .line 434
    const/4 v14, 0x0

    .line 435
    const/high16 v15, -0x41000000    # -0.5f

    .line 436
    .line 437
    const v16, -0x4151eb85    # -0.34f

    .line 438
    .line 439
    .line 440
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 441
    .line 442
    .line 443
    const/high16 v17, 0x3f000000    # 0.5f

    .line 444
    .line 445
    const/4 v13, 0x0

    .line 446
    const v14, -0x412e147b    # -0.41f

    .line 447
    .line 448
    .line 449
    const v15, 0x3e6147ae    # 0.22f

    .line 450
    .line 451
    .line 452
    const/high16 v16, -0x40c00000    # -0.75f

    .line 453
    .line 454
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 455
    .line 456
    .line 457
    const/high16 v0, 0x41800000    # 16.0f

    .line 458
    .line 459
    const v2, 0x417970a4    # 15.59f

    .line 460
    .line 461
    .line 462
    const/high16 v4, 0x41300000    # 11.0f

    .line 463
    .line 464
    invoke-virtual {v12, v4, v2, v4, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 465
    .line 466
    .line 467
    const/high16 v17, 0x41280000    # 10.5f

    .line 468
    .line 469
    const/high16 v18, 0x41860000    # 16.75f

    .line 470
    .line 471
    const/high16 v13, 0x41300000    # 11.0f

    .line 472
    .line 473
    const v14, 0x418347ae    # 16.41f

    .line 474
    .line 475
    .line 476
    const v15, 0x412c7ae1    # 10.78f

    .line 477
    .line 478
    .line 479
    const/high16 v16, 0x41860000    # 16.75f

    .line 480
    .line 481
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 482
    .line 483
    .line 484
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 485
    .line 486
    .line 487
    const/high16 v0, 0x41400000    # 12.0f

    .line 488
    .line 489
    const/high16 v2, 0x419c0000    # 19.5f

    .line 490
    .line 491
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 492
    .line 493
    .line 494
    const/high16 v17, -0x40800000    # -1.0f

    .line 495
    .line 496
    const/high16 v18, -0x40800000    # -1.0f

    .line 497
    .line 498
    const v13, -0x40f33333    # -0.55f

    .line 499
    .line 500
    .line 501
    const/4 v14, 0x0

    .line 502
    const/high16 v15, -0x40800000    # -1.0f

    .line 503
    .line 504
    const v16, -0x40c7ae14    # -0.72f

    .line 505
    .line 506
    .line 507
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 508
    .line 509
    .line 510
    const/high16 v17, 0x3f800000    # 1.0f

    .line 511
    .line 512
    const/high16 v18, -0x41000000    # -0.5f

    .line 513
    .line 514
    const/4 v13, 0x0

    .line 515
    const v14, -0x4170a3d7    # -0.28f

    .line 516
    .line 517
    .line 518
    const v15, 0x3ee66666    # 0.45f

    .line 519
    .line 520
    .line 521
    const/high16 v16, -0x41000000    # -0.5f

    .line 522
    .line 523
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 524
    .line 525
    .line 526
    const v0, 0x3e6147ae    # 0.22f

    .line 527
    .line 528
    .line 529
    const/high16 v2, 0x3f000000    # 0.5f

    .line 530
    .line 531
    const/high16 v4, 0x3f800000    # 1.0f

    .line 532
    .line 533
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 534
    .line 535
    .line 536
    const/high16 v17, 0x41400000    # 12.0f

    .line 537
    .line 538
    const/high16 v18, 0x419c0000    # 19.5f

    .line 539
    .line 540
    const/high16 v13, 0x41500000    # 13.0f

    .line 541
    .line 542
    const v14, 0x41963d71    # 18.78f

    .line 543
    .line 544
    .line 545
    const v15, 0x4148cccd    # 12.55f

    .line 546
    .line 547
    .line 548
    const/high16 v16, 0x419c0000    # 19.5f

    .line 549
    .line 550
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 551
    .line 552
    .line 553
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 554
    .line 555
    .line 556
    const/high16 v0, 0x41580000    # 13.5f

    .line 557
    .line 558
    const/high16 v2, 0x41860000    # 16.75f

    .line 559
    .line 560
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 561
    .line 562
    .line 563
    const/high16 v17, -0x41000000    # -0.5f

    .line 564
    .line 565
    const/high16 v18, -0x40c00000    # -0.75f

    .line 566
    .line 567
    const v13, -0x4170a3d7    # -0.28f

    .line 568
    .line 569
    .line 570
    const/4 v14, 0x0

    .line 571
    const/high16 v15, -0x41000000    # -0.5f

    .line 572
    .line 573
    const v16, -0x4151eb85    # -0.34f

    .line 574
    .line 575
    .line 576
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 577
    .line 578
    .line 579
    const/high16 v17, 0x3f000000    # 0.5f

    .line 580
    .line 581
    const/4 v13, 0x0

    .line 582
    const v14, -0x412e147b    # -0.41f

    .line 583
    .line 584
    .line 585
    const v15, 0x3e6147ae    # 0.22f

    .line 586
    .line 587
    .line 588
    const/high16 v16, -0x40c00000    # -0.75f

    .line 589
    .line 590
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 591
    .line 592
    .line 593
    const/high16 v0, 0x41600000    # 14.0f

    .line 594
    .line 595
    const/high16 v2, 0x41800000    # 16.0f

    .line 596
    .line 597
    const v4, 0x417970a4    # 15.59f

    .line 598
    .line 599
    .line 600
    invoke-virtual {v12, v0, v4, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 601
    .line 602
    .line 603
    const/high16 v17, 0x41580000    # 13.5f

    .line 604
    .line 605
    const/high16 v18, 0x41860000    # 16.75f

    .line 606
    .line 607
    const/high16 v13, 0x41600000    # 14.0f

    .line 608
    .line 609
    const v14, 0x418347ae    # 16.41f

    .line 610
    .line 611
    .line 612
    const v15, 0x415c7ae1    # 13.78f

    .line 613
    .line 614
    .line 615
    const/high16 v16, 0x41860000    # 16.75f

    .line 616
    .line 617
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 618
    .line 619
    .line 620
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 621
    .line 622
    .line 623
    const v0, 0x413ab852    # 11.67f

    .line 624
    .line 625
    .line 626
    const/high16 v2, 0x41580000    # 13.5f

    .line 627
    .line 628
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 629
    .line 630
    .line 631
    const v17, 0x405851ec    # 3.38f

    .line 632
    .line 633
    .line 634
    const v18, -0x3f0b851f    # -7.64f

    .line 635
    .line 636
    .line 637
    const v13, 0x3e0f5c29    # 0.14f

    .line 638
    .line 639
    .line 640
    const v14, -0x3f623d71    # -4.93f

    .line 641
    .line 642
    .line 643
    const v15, 0x401c28f6    # 2.44f

    .line 644
    .line 645
    .line 646
    const v16, -0x3f1570a4    # -7.33f

    .line 647
    .line 648
    .line 649
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 650
    .line 651
    .line 652
    const/high16 v17, 0x41880000    # 17.0f

    .line 653
    .line 654
    const/high16 v18, 0x40a00000    # 5.0f

    .line 655
    .line 656
    const v13, 0x4187851f    # 16.94f

    .line 657
    .line 658
    .line 659
    const v14, 0x40866666    # 4.2f

    .line 660
    .line 661
    .line 662
    const/high16 v15, 0x41880000    # 17.0f

    .line 663
    .line 664
    const v16, 0x409051ec    # 4.51f

    .line 665
    .line 666
    .line 667
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 668
    .line 669
    .line 670
    const v17, -0x3fe9999a    # -2.35f

    .line 671
    .line 672
    .line 673
    const v18, 0x40e66666    # 7.2f

    .line 674
    .line 675
    .line 676
    const/4 v13, 0x0

    .line 677
    const v14, 0x4047ae14    # 3.12f

    .line 678
    .line 679
    .line 680
    const v15, -0x40547ae1    # -1.34f

    .line 681
    .line 682
    .line 683
    const v16, 0x40b66666    # 5.7f

    .line 684
    .line 685
    .line 686
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 687
    .line 688
    .line 689
    const/high16 v17, 0x41580000    # 13.5f

    .line 690
    .line 691
    const v18, 0x413ab852    # 11.67f

    .line 692
    .line 693
    .line 694
    const v13, 0x416570a4    # 14.34f

    .line 695
    .line 696
    .line 697
    const v14, 0x413f851f    # 11.97f

    .line 698
    .line 699
    .line 700
    const v15, 0x415f851f    # 13.97f

    .line 701
    .line 702
    .line 703
    const v16, 0x413ca3d7    # 11.79f

    .line 704
    .line 705
    .line 706
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 707
    .line 708
    .line 709
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 710
    .line 711
    .line 712
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 713
    .line 714
    .line 715
    move-result-object v2

    .line 716
    const/16 v16, 0x3800

    .line 717
    .line 718
    const/16 v17, 0x0

    .line 719
    .line 720
    const/high16 v6, 0x3f800000    # 1.0f

    .line 721
    .line 722
    const/high16 v8, 0x3f800000    # 1.0f

    .line 723
    .line 724
    const/4 v7, 0x0

    .line 725
    const/high16 v9, 0x3f800000    # 1.0f

    .line 726
    .line 727
    const/high16 v12, 0x3f800000    # 1.0f

    .line 728
    .line 729
    const/4 v13, 0x0

    .line 730
    const/4 v14, 0x0

    .line 731
    const/4 v15, 0x0

    .line 732
    const-string v4, ""

    .line 733
    .line 734
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 735
    .line 736
    .line 737
    move-result-object v0

    .line 738
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 739
    .line 740
    .line 741
    move-result-object v0

    .line 742
    sput-object v0, Landroidx/compose/material/icons/rounded/CrueltyFreeKt;->_crueltyFree:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 743
    .line 744
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 745
    .line 746
    .line 747
    return-object v0
.end method
