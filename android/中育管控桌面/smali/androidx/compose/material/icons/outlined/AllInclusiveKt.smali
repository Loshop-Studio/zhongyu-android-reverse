.class public final Landroidx/compose/material/icons/outlined/AllInclusiveKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_allInclusive",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "AllInclusive",
        "Landroidx/compose/material/icons/Icons$Outlined;",
        "getAllInclusive",
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
        "SMAP\nAllInclusive.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AllInclusive.kt\nandroidx/compose/material/icons/outlined/AllInclusiveKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,63:1\n212#2,12:64\n233#2,18:77\n253#2:114\n174#3:76\n705#4,2:95\n717#4,2:97\n719#4,11:103\n72#5,4:99\n*S KotlinDebug\n*F\n+ 1 AllInclusive.kt\nandroidx/compose/material/icons/outlined/AllInclusiveKt\n*L\n29#1:64,12\n30#1:77,18\n30#1:114\n29#1:76\n30#1:95,2\n30#1:97,2\n30#1:103,11\n30#1:99,4\n*E\n"
    }
.end annotation


# static fields
.field private static _allInclusive:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getAllInclusive(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/outlined/AllInclusiveKt;->_allInclusive:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Outlined.AllInclusive"

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
    const v0, 0x4194cccd    # 18.6f

    .line 71
    .line 72
    .line 73
    const v2, 0x40d3d70a    # 6.62f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v17, -0x3f8eb852    # -3.77f

    .line 80
    .line 81
    .line 82
    const v18, 0x3fc3d70a    # 1.53f

    .line 83
    .line 84
    .line 85
    const v13, -0x4047ae14    # -1.44f

    .line 86
    .line 87
    .line 88
    const/4 v14, 0x0

    .line 89
    const v15, -0x3fcccccd    # -2.8f

    .line 90
    .line 91
    .line 92
    const v16, 0x3f0f5c29    # 0.56f

    .line 93
    .line 94
    .line 95
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 96
    .line 97
    .line 98
    const v0, 0x40f9999a    # 7.8f

    .line 99
    .line 100
    .line 101
    const v2, 0x41663d71    # 14.39f

    .line 102
    .line 103
    .line 104
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 105
    .line 106
    .line 107
    const v17, -0x3fe66666    # -2.4f

    .line 108
    .line 109
    .line 110
    const v18, 0x3f7d70a4    # 0.99f

    .line 111
    .line 112
    .line 113
    const v13, -0x40dc28f6    # -0.64f

    .line 114
    .line 115
    .line 116
    const v14, 0x3f23d70a    # 0.64f

    .line 117
    .line 118
    .line 119
    const v15, -0x404147ae    # -1.49f

    .line 120
    .line 121
    .line 122
    const v16, 0x3f7d70a4    # 0.99f

    .line 123
    .line 124
    .line 125
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 126
    .line 127
    .line 128
    const v17, -0x3fa70a3d    # -3.39f

    .line 129
    .line 130
    .line 131
    const v18, -0x3fa7ae14    # -3.38f

    .line 132
    .line 133
    .line 134
    const v13, -0x4010a3d7    # -1.87f

    .line 135
    .line 136
    .line 137
    const/4 v14, 0x0

    .line 138
    const v15, -0x3fa70a3d    # -3.39f

    .line 139
    .line 140
    .line 141
    const v16, -0x403eb852    # -1.51f

    .line 142
    .line 143
    .line 144
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 145
    .line 146
    .line 147
    const v0, 0x4061eb85    # 3.53f

    .line 148
    .line 149
    .line 150
    const v2, 0x40accccd    # 5.4f

    .line 151
    .line 152
    .line 153
    const v4, 0x4109eb85    # 8.62f

    .line 154
    .line 155
    .line 156
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 157
    .line 158
    .line 159
    const v17, 0x401c28f6    # 2.44f

    .line 160
    .line 161
    .line 162
    const v18, 0x3f83d70a    # 1.03f

    .line 163
    .line 164
    .line 165
    const v13, 0x3f68f5c3    # 0.91f

    .line 166
    .line 167
    .line 168
    const v15, 0x3fe147ae    # 1.76f

    .line 169
    .line 170
    .line 171
    const v16, 0x3eb33333    # 0.35f

    .line 172
    .line 173
    .line 174
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 175
    .line 176
    .line 177
    const v0, 0x3f90a3d7    # 1.13f

    .line 178
    .line 179
    .line 180
    const/high16 v2, 0x3f800000    # 1.0f

    .line 181
    .line 182
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 183
    .line 184
    .line 185
    const v0, 0x3fc147ae    # 1.51f

    .line 186
    .line 187
    .line 188
    const v2, -0x40547ae1    # -1.34f

    .line 189
    .line 190
    .line 191
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 192
    .line 193
    .line 194
    const v0, 0x4113851f    # 9.22f

    .line 195
    .line 196
    .line 197
    const v2, 0x41033333    # 8.2f

    .line 198
    .line 199
    .line 200
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 201
    .line 202
    .line 203
    const v17, 0x40accccd    # 5.4f

    .line 204
    .line 205
    .line 206
    const v18, 0x40d3d70a    # 6.62f

    .line 207
    .line 208
    .line 209
    const v13, 0x41033333    # 8.2f

    .line 210
    .line 211
    .line 212
    const v14, 0x40e5c28f    # 7.18f

    .line 213
    .line 214
    .line 215
    const v15, 0x40dae148    # 6.84f

    .line 216
    .line 217
    .line 218
    const v16, 0x40d3d70a    # 6.62f

    .line 219
    .line 220
    .line 221
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 222
    .line 223
    .line 224
    const/16 v17, 0x0

    .line 225
    .line 226
    const/high16 v18, 0x41400000    # 12.0f

    .line 227
    .line 228
    const v13, 0x401ae148    # 2.42f

    .line 229
    .line 230
    .line 231
    const v14, 0x40d3d70a    # 6.62f

    .line 232
    .line 233
    .line 234
    const/4 v15, 0x0

    .line 235
    const v16, 0x4110a3d7    # 9.04f

    .line 236
    .line 237
    .line 238
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 239
    .line 240
    .line 241
    const v0, 0x401ae148    # 2.42f

    .line 242
    .line 243
    .line 244
    const v2, 0x40ac28f6    # 5.38f

    .line 245
    .line 246
    .line 247
    const v4, 0x40accccd    # 5.4f

    .line 248
    .line 249
    .line 250
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 251
    .line 252
    .line 253
    const v17, 0x407147ae    # 3.77f

    .line 254
    .line 255
    .line 256
    const v18, -0x403c28f6    # -1.53f

    .line 257
    .line 258
    .line 259
    const v13, 0x3fb851ec    # 1.44f

    .line 260
    .line 261
    .line 262
    const/4 v14, 0x0

    .line 263
    const v15, 0x40333333    # 2.8f

    .line 264
    .line 265
    .line 266
    const v16, -0x40f0a3d7    # -0.56f

    .line 267
    .line 268
    .line 269
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 270
    .line 271
    .line 272
    const v0, 0x40e0f5c3    # 7.03f

    .line 273
    .line 274
    .line 275
    const v2, -0x3f3851ec    # -6.24f

    .line 276
    .line 277
    .line 278
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 279
    .line 280
    .line 281
    const v17, 0x4019999a    # 2.4f

    .line 282
    .line 283
    .line 284
    const v18, -0x40828f5c    # -0.99f

    .line 285
    .line 286
    .line 287
    const v13, 0x3f23d70a    # 0.64f

    .line 288
    .line 289
    .line 290
    const v14, -0x40dc28f6    # -0.64f

    .line 291
    .line 292
    .line 293
    const v15, 0x3fbeb852    # 1.49f

    .line 294
    .line 295
    .line 296
    const v16, -0x40828f5c    # -0.99f

    .line 297
    .line 298
    .line 299
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 300
    .line 301
    .line 302
    const v17, 0x4058f5c3    # 3.39f

    .line 303
    .line 304
    .line 305
    const v18, 0x405851ec    # 3.38f

    .line 306
    .line 307
    .line 308
    const v13, 0x3fef5c29    # 1.87f

    .line 309
    .line 310
    .line 311
    const/4 v14, 0x0

    .line 312
    const v15, 0x4058f5c3    # 3.39f

    .line 313
    .line 314
    .line 315
    const v16, 0x3fc147ae    # 1.51f

    .line 316
    .line 317
    .line 318
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 319
    .line 320
    .line 321
    const v0, -0x403d70a4    # -1.52f

    .line 322
    .line 323
    .line 324
    const v2, -0x3fa70a3d    # -3.39f

    .line 325
    .line 326
    .line 327
    const v4, 0x405851ec    # 3.38f

    .line 328
    .line 329
    .line 330
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 331
    .line 332
    .line 333
    const v17, -0x3fe3d70a    # -2.44f

    .line 334
    .line 335
    .line 336
    const v18, -0x407c28f6    # -1.03f

    .line 337
    .line 338
    .line 339
    const v13, -0x4099999a    # -0.9f

    .line 340
    .line 341
    .line 342
    const v15, -0x401eb852    # -1.76f

    .line 343
    .line 344
    .line 345
    const v16, -0x414ccccd    # -0.35f

    .line 346
    .line 347
    .line 348
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 349
    .line 350
    .line 351
    const v0, -0x406e147b    # -1.14f

    .line 352
    .line 353
    .line 354
    const v2, -0x407eb852    # -1.01f

    .line 355
    .line 356
    .line 357
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 358
    .line 359
    .line 360
    const v0, -0x403eb852    # -1.51f

    .line 361
    .line 362
    .line 363
    const v2, 0x3fab851f    # 1.34f

    .line 364
    .line 365
    .line 366
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 367
    .line 368
    .line 369
    const v0, 0x3fa28f5c    # 1.27f

    .line 370
    .line 371
    .line 372
    const v2, 0x3f8f5c29    # 1.12f

    .line 373
    .line 374
    .line 375
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 376
    .line 377
    .line 378
    const v17, 0x40747ae1    # 3.82f

    .line 379
    .line 380
    .line 381
    const v18, 0x3fc8f5c3    # 1.57f

    .line 382
    .line 383
    .line 384
    const v13, 0x3f828f5c    # 1.02f

    .line 385
    .line 386
    .line 387
    const v14, 0x3f8147ae    # 1.01f

    .line 388
    .line 389
    .line 390
    const v15, 0x4017ae14    # 2.37f

    .line 391
    .line 392
    .line 393
    const v16, 0x3fc8f5c3    # 1.57f

    .line 394
    .line 395
    .line 396
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 397
    .line 398
    .line 399
    const v17, 0x40accccd    # 5.4f

    .line 400
    .line 401
    .line 402
    const v18, -0x3f53d70a    # -5.38f

    .line 403
    .line 404
    .line 405
    const v13, 0x403eb852    # 2.98f

    .line 406
    .line 407
    .line 408
    const/4 v14, 0x0

    .line 409
    const v15, 0x40accccd    # 5.4f

    .line 410
    .line 411
    .line 412
    const v16, -0x3fe5c28f    # -2.41f

    .line 413
    .line 414
    .line 415
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 416
    .line 417
    .line 418
    const v0, -0x3fe51eb8    # -2.42f

    .line 419
    .line 420
    .line 421
    const v2, -0x3f533333    # -5.4f

    .line 422
    .line 423
    .line 424
    const v4, -0x3f5428f6    # -5.37f

    .line 425
    .line 426
    .line 427
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 428
    .line 429
    .line 430
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 431
    .line 432
    .line 433
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 434
    .line 435
    .line 436
    move-result-object v2

    .line 437
    const/16 v16, 0x3800

    .line 438
    .line 439
    const/16 v17, 0x0

    .line 440
    .line 441
    const/high16 v6, 0x3f800000    # 1.0f

    .line 442
    .line 443
    const/high16 v8, 0x3f800000    # 1.0f

    .line 444
    .line 445
    const/4 v7, 0x0

    .line 446
    const/high16 v9, 0x3f800000    # 1.0f

    .line 447
    .line 448
    const/high16 v12, 0x3f800000    # 1.0f

    .line 449
    .line 450
    const/4 v13, 0x0

    .line 451
    const/4 v15, 0x0

    .line 452
    const-string v4, ""

    .line 453
    .line 454
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 455
    .line 456
    .line 457
    move-result-object v0

    .line 458
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 459
    .line 460
    .line 461
    move-result-object v0

    .line 462
    sput-object v0, Landroidx/compose/material/icons/outlined/AllInclusiveKt;->_allInclusive:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 463
    .line 464
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 465
    .line 466
    .line 467
    return-object v0
.end method
