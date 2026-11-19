.class public final Landroidx/compose/material/icons/filled/CompostKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_compost",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "Compost",
        "Landroidx/compose/material/icons/Icons$Filled;",
        "getCompost",
        "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;",
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
        "SMAP\nCompost.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Compost.kt\nandroidx/compose/material/icons/filled/CompostKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,70:1\n212#2,12:71\n233#2,18:84\n253#2:121\n174#3:83\n705#4,2:102\n717#4,2:104\n719#4,11:110\n72#5,4:106\n*S KotlinDebug\n*F\n+ 1 Compost.kt\nandroidx/compose/material/icons/filled/CompostKt\n*L\n29#1:71,12\n30#1:84,18\n30#1:121\n29#1:83\n30#1:102,2\n30#1:104,2\n30#1:110,11\n30#1:106,4\n*E\n"
    }
.end annotation


# static fields
.field private static _compost:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getCompost(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/filled/CompostKt;->_compost:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Filled.Compost"

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
    const v0, 0x414deb85    # 12.87f

    .line 71
    .line 72
    .line 73
    const v2, 0x413cf5c3    # 11.81f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v17, -0x41428f5c    # -0.37f

    .line 80
    .line 81
    .line 82
    const v18, -0x405851ec    # -1.31f

    .line 83
    .line 84
    .line 85
    const v13, -0x41947ae1    # -0.23f

    .line 86
    .line 87
    .line 88
    const v14, -0x413d70a4    # -0.38f

    .line 89
    .line 90
    .line 91
    const v15, -0x41428f5c    # -0.37f

    .line 92
    .line 93
    .line 94
    const v16, -0x40ab851f    # -0.83f

    .line 95
    .line 96
    .line 97
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 98
    .line 99
    .line 100
    const/high16 v17, 0x41700000    # 15.0f

    .line 101
    .line 102
    const/high16 v18, 0x41000000    # 8.0f

    .line 103
    .line 104
    const/high16 v13, 0x41480000    # 12.5f

    .line 105
    .line 106
    const v14, 0x4111eb85    # 9.12f

    .line 107
    .line 108
    .line 109
    const v15, 0x4159eb85    # 13.62f

    .line 110
    .line 111
    .line 112
    const/high16 v16, 0x41000000    # 8.0f

    .line 113
    .line 114
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 115
    .line 116
    .line 117
    const/high16 v0, 0x3f800000    # 1.0f

    .line 118
    .line 119
    const/4 v2, 0x0

    .line 120
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 121
    .line 122
    .line 123
    const/high16 v17, 0x40000000    # 2.0f

    .line 124
    .line 125
    const/high16 v18, -0x40800000    # -1.0f

    .line 126
    .line 127
    const v13, 0x3fc147ae    # 1.51f

    .line 128
    .line 129
    .line 130
    const/4 v14, 0x0

    .line 131
    const/high16 v15, 0x40000000    # 2.0f

    .line 132
    .line 133
    const/high16 v16, -0x40800000    # -1.0f

    .line 134
    .line 135
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 136
    .line 137
    .line 138
    const v0, 0x3f0ccccd    # 0.55f

    .line 139
    .line 140
    .line 141
    const/high16 v2, -0x3fc00000    # -3.0f

    .line 142
    .line 143
    const/high16 v4, 0x40c00000    # 6.0f

    .line 144
    .line 145
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 146
    .line 147
    .line 148
    const v17, -0x40570a3d    # -1.32f

    .line 149
    .line 150
    .line 151
    const v18, -0x413d70a4    # -0.38f

    .line 152
    .line 153
    .line 154
    const v13, -0x41051eb8    # -0.49f

    .line 155
    .line 156
    .line 157
    const v15, -0x408f5c29    # -0.94f

    .line 158
    .line 159
    .line 160
    const v16, -0x41f0a3d7    # -0.14f

    .line 161
    .line 162
    .line 163
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 164
    .line 165
    .line 166
    const v17, -0x40bd70a4    # -0.76f

    .line 167
    .line 168
    .line 169
    const v18, 0x403d70a4    # 2.96f

    .line 170
    .line 171
    .line 172
    const v13, -0x418a3d71    # -0.24f

    .line 173
    .line 174
    .line 175
    const v14, 0x3f23d70a    # 0.64f

    .line 176
    .line 177
    .line 178
    const v15, -0x40e8f5c3    # -0.59f

    .line 179
    .line 180
    .line 181
    const v16, 0x3fe147ae    # 1.76f

    .line 182
    .line 183
    .line 184
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 185
    .line 186
    .line 187
    const v17, 0x403147ae    # 2.77f

    .line 188
    .line 189
    .line 190
    const v18, 0x3fe28f5c    # 1.77f

    .line 191
    .line 192
    .line 193
    const v13, 0x3fa147ae    # 1.26f

    .line 194
    .line 195
    .line 196
    const v14, 0x3e6147ae    # 0.22f

    .line 197
    .line 198
    .line 199
    const v15, 0x4011eb85    # 2.28f

    .line 200
    .line 201
    .line 202
    const v16, 0x3f63d70a    # 0.89f

    .line 203
    .line 204
    .line 205
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 206
    .line 207
    .line 208
    const v17, 0x4033d70a    # 2.81f

    .line 209
    .line 210
    .line 211
    const v18, -0x3f54cccd    # -5.35f

    .line 212
    .line 213
    .line 214
    const v13, 0x3fd851ec    # 1.69f

    .line 215
    .line 216
    .line 217
    const v14, -0x406a3d71    # -1.17f

    .line 218
    .line 219
    .line 220
    const v15, 0x4033d70a    # 2.81f

    .line 221
    .line 222
    .line 223
    const v16, -0x3fb7ae14    # -3.13f

    .line 224
    .line 225
    .line 226
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 227
    .line 228
    .line 229
    const/high16 v0, 0x40400000    # 3.0f

    .line 230
    .line 231
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 232
    .line 233
    .line 234
    const/high16 v17, -0x3ee80000    # -9.5f

    .line 235
    .line 236
    const/high16 v18, 0x41180000    # 9.5f

    .line 237
    .line 238
    const/4 v13, 0x0

    .line 239
    const v14, 0x40a7ae14    # 5.24f

    .line 240
    .line 241
    .line 242
    const v15, -0x3f77ae14    # -4.26f

    .line 243
    .line 244
    .line 245
    const/high16 v16, 0x41180000    # 9.5f

    .line 246
    .line 247
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 248
    .line 249
    .line 250
    const v0, 0x4189eb85    # 17.24f

    .line 251
    .line 252
    .line 253
    const/high16 v2, 0x41400000    # 12.0f

    .line 254
    .line 255
    const/high16 v4, 0x40200000    # 2.5f

    .line 256
    .line 257
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 258
    .line 259
    .line 260
    const v0, 0x40d851ec    # 6.76f

    .line 261
    .line 262
    .line 263
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 264
    .line 265
    .line 266
    const/4 v0, 0x0

    .line 267
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 268
    .line 269
    .line 270
    const/high16 v0, 0x40800000    # 4.0f

    .line 271
    .line 272
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 273
    .line 274
    .line 275
    const/high16 v0, -0x3f800000    # -4.0f

    .line 276
    .line 277
    const/high16 v2, 0x40800000    # 4.0f

    .line 278
    .line 279
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 280
    .line 281
    .line 282
    const/high16 v0, 0x40b00000    # 5.5f

    .line 283
    .line 284
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 285
    .line 286
    .line 287
    const/high16 v17, -0x3f300000    # -6.5f

    .line 288
    .line 289
    const/high16 v18, 0x40d00000    # 6.5f

    .line 290
    .line 291
    const v13, -0x3f9ae148    # -3.58f

    .line 292
    .line 293
    .line 294
    const/4 v14, 0x0

    .line 295
    const/high16 v15, -0x3f300000    # -6.5f

    .line 296
    .line 297
    const v16, 0x403ae148    # 2.92f

    .line 298
    .line 299
    .line 300
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 301
    .line 302
    .line 303
    const v17, 0x4033d70a    # 2.81f

    .line 304
    .line 305
    .line 306
    const v18, 0x40ab3333    # 5.35f

    .line 307
    .line 308
    .line 309
    const/4 v13, 0x0

    .line 310
    const v14, 0x400d70a4    # 2.21f

    .line 311
    .line 312
    .line 313
    const v15, 0x3f8e147b    # 1.11f

    .line 314
    .line 315
    .line 316
    const v16, 0x408570a4    # 4.17f

    .line 317
    .line 318
    .line 319
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 320
    .line 321
    .line 322
    const v17, 0x403eb852    # 2.98f

    .line 323
    .line 324
    .line 325
    const v18, -0x4019999a    # -1.8f

    .line 326
    .line 327
    .line 328
    const v13, 0x3f028f5c    # 0.51f

    .line 329
    .line 330
    .line 331
    const v14, -0x40947ae1    # -0.92f

    .line 332
    .line 333
    .line 334
    const v15, 0x3fd0a3d7    # 1.63f

    .line 335
    .line 336
    .line 337
    const v16, -0x4030a3d7    # -1.62f

    .line 338
    .line 339
    .line 340
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 341
    .line 342
    .line 343
    const v17, -0x41051eb8    # -0.49f

    .line 344
    .line 345
    .line 346
    const v18, -0x3ffe147b    # -2.03f

    .line 347
    .line 348
    .line 349
    const v13, -0x4247ae14    # -0.09f

    .line 350
    .line 351
    .line 352
    const v14, -0x40cf5c29    # -0.69f

    .line 353
    .line 354
    .line 355
    const v15, -0x417ae148    # -0.26f

    .line 356
    .line 357
    .line 358
    const v16, -0x404a3d71    # -1.42f

    .line 359
    .line 360
    .line 361
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 362
    .line 363
    .line 364
    const/high16 v17, 0x41180000    # 9.5f

    .line 365
    .line 366
    const/high16 v18, 0x41600000    # 14.0f

    .line 367
    .line 368
    const v13, 0x41273333    # 10.45f

    .line 369
    .line 370
    .line 371
    const v14, 0x415d1eb8    # 13.82f

    .line 372
    .line 373
    .line 374
    const/high16 v15, 0x41200000    # 10.0f

    .line 375
    .line 376
    const/high16 v16, 0x41600000    # 14.0f

    .line 377
    .line 378
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 379
    .line 380
    .line 381
    const/high16 v17, -0x40000000    # -2.0f

    .line 382
    .line 383
    const/high16 v18, -0x40000000    # -2.0f

    .line 384
    .line 385
    const v13, -0x40733333    # -1.1f

    .line 386
    .line 387
    .line 388
    const/4 v14, 0x0

    .line 389
    const/high16 v15, -0x40000000    # -2.0f

    .line 390
    .line 391
    const v16, -0x4099999a    # -0.9f

    .line 392
    .line 393
    .line 394
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 395
    .line 396
    .line 397
    const v0, -0x40828f5c    # -0.99f

    .line 398
    .line 399
    .line 400
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 401
    .line 402
    .line 403
    const/high16 v17, -0x41000000    # -0.5f

    .line 404
    .line 405
    const v18, -0x403eb852    # -1.51f

    .line 406
    .line 407
    .line 408
    const/4 v13, 0x0

    .line 409
    const v14, -0x40f0a3d7    # -0.56f

    .line 410
    .line 411
    .line 412
    const v15, -0x41bd70a4    # -0.19f

    .line 413
    .line 414
    .line 415
    const v16, -0x40747ae1    # -1.09f

    .line 416
    .line 417
    .line 418
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 419
    .line 420
    .line 421
    const/high16 v17, 0x40900000    # 4.5f

    .line 422
    .line 423
    const/high16 v18, 0x40200000    # 2.5f

    .line 424
    .line 425
    const/4 v14, 0x0

    .line 426
    const v15, 0x408e6666    # 4.45f

    .line 427
    .line 428
    .line 429
    const v16, -0x41947ae1    # -0.23f

    .line 430
    .line 431
    .line 432
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 433
    .line 434
    .line 435
    const v17, -0x41d1eb85    # -0.17f

    .line 436
    .line 437
    .line 438
    const v18, 0x3f4ccccd    # 0.8f

    .line 439
    .line 440
    .line 441
    const v14, 0x3e947ae1    # 0.29f

    .line 442
    .line 443
    .line 444
    const v15, -0x428a3d71    # -0.06f

    .line 445
    .line 446
    .line 447
    const v16, 0x3f0f5c29    # 0.56f

    .line 448
    .line 449
    .line 450
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 451
    .line 452
    .line 453
    const/high16 v17, 0x41200000    # 10.0f

    .line 454
    .line 455
    const/high16 v18, 0x41400000    # 12.0f

    .line 456
    .line 457
    const v13, 0x412e8f5c    # 10.91f

    .line 458
    .line 459
    .line 460
    const v14, 0x4147ae14    # 12.48f

    .line 461
    .line 462
    .line 463
    const v15, 0x4127851f    # 10.47f

    .line 464
    .line 465
    .line 466
    const v16, 0x41433333    # 12.2f

    .line 467
    .line 468
    .line 469
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 470
    .line 471
    .line 472
    const/high16 v17, 0x40000000    # 2.0f

    .line 473
    .line 474
    const v18, 0x40266666    # 2.6f

    .line 475
    .line 476
    .line 477
    const v13, 0x3f147ae1    # 0.58f

    .line 478
    .line 479
    .line 480
    const v14, 0x3edc28f6    # 0.43f

    .line 481
    .line 482
    .line 483
    const v15, 0x3faf5c29    # 1.37f

    .line 484
    .line 485
    .line 486
    const v16, 0x3faf5c29    # 1.37f

    .line 487
    .line 488
    .line 489
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 490
    .line 491
    .line 492
    const/high16 v17, 0x40400000    # 3.0f

    .line 493
    .line 494
    const v18, -0x3f6ccccd    # -4.6f

    .line 495
    .line 496
    .line 497
    const v13, 0x3f2b851f    # 0.67f

    .line 498
    .line 499
    .line 500
    const v14, -0x4030a3d7    # -1.62f

    .line 501
    .line 502
    .line 503
    const v15, 0x3fd70a3d    # 1.68f

    .line 504
    .line 505
    .line 506
    const v16, -0x3faeb852    # -3.27f

    .line 507
    .line 508
    .line 509
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 510
    .line 511
    .line 512
    const v17, 0x414deb85    # 12.87f

    .line 513
    .line 514
    .line 515
    const v18, 0x413cf5c3    # 11.81f

    .line 516
    .line 517
    .line 518
    const v13, 0x4163d70a    # 14.24f

    .line 519
    .line 520
    .line 521
    const v14, 0x412851ec    # 10.52f

    .line 522
    .line 523
    .line 524
    const v15, 0x41587ae1    # 13.53f

    .line 525
    .line 526
    .line 527
    const v16, 0x4131eb85    # 11.12f

    .line 528
    .line 529
    .line 530
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 531
    .line 532
    .line 533
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 534
    .line 535
    .line 536
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 537
    .line 538
    .line 539
    move-result-object v2

    .line 540
    const/16 v16, 0x3800

    .line 541
    .line 542
    const/16 v17, 0x0

    .line 543
    .line 544
    const/high16 v6, 0x3f800000    # 1.0f

    .line 545
    .line 546
    const/high16 v8, 0x3f800000    # 1.0f

    .line 547
    .line 548
    const/4 v7, 0x0

    .line 549
    const/high16 v9, 0x3f800000    # 1.0f

    .line 550
    .line 551
    const/high16 v12, 0x3f800000    # 1.0f

    .line 552
    .line 553
    const/4 v13, 0x0

    .line 554
    const/4 v14, 0x0

    .line 555
    const/4 v15, 0x0

    .line 556
    const-string v4, ""

    .line 557
    .line 558
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 559
    .line 560
    .line 561
    move-result-object v0

    .line 562
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 563
    .line 564
    .line 565
    move-result-object v0

    .line 566
    sput-object v0, Landroidx/compose/material/icons/filled/CompostKt;->_compost:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 567
    .line 568
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 569
    .line 570
    .line 571
    return-object v0
.end method
