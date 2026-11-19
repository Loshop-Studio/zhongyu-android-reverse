.class public final Landroidx/compose/material/icons/outlined/DonutSmallKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_donutSmall",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "DonutSmall",
        "Landroidx/compose/material/icons/Icons$Outlined;",
        "getDonutSmall",
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
        "SMAP\nDonutSmall.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DonutSmall.kt\nandroidx/compose/material/icons/outlined/DonutSmallKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,77:1\n212#2,12:78\n233#2,18:91\n253#2:128\n174#3:90\n705#4,2:109\n717#4,2:111\n719#4,11:117\n72#5,4:113\n*S KotlinDebug\n*F\n+ 1 DonutSmall.kt\nandroidx/compose/material/icons/outlined/DonutSmallKt\n*L\n29#1:78,12\n30#1:91,18\n30#1:128\n29#1:90\n30#1:109,2\n30#1:111,2\n30#1:117,11\n30#1:113,4\n*E\n"
    }
.end annotation


# static fields
.field private static _donutSmall:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getDonutSmall(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/outlined/DonutSmallKt;->_donutSmall:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Outlined.DonutSmall"

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
    const/high16 v0, 0x41300000    # 11.0f

    .line 71
    .line 72
    const v2, 0x416d1eb8    # 14.82f

    .line 73
    .line 74
    .line 75
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    const v0, 0x40e428f6    # 7.13f

    .line 79
    .line 80
    .line 81
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 82
    .line 83
    .line 84
    const v17, -0x3ef0cccd    # -8.95f

    .line 85
    .line 86
    .line 87
    const v18, -0x3ef0cccd    # -8.95f

    .line 88
    .line 89
    .line 90
    const v13, -0x410f5c29    # -0.47f

    .line 91
    .line 92
    .line 93
    const v14, -0x3f68f5c3    # -4.72f

    .line 94
    .line 95
    .line 96
    const v15, -0x3f78a3d7    # -4.23f

    .line 97
    .line 98
    .line 99
    const v16, -0x3ef851ec    # -8.48f

    .line 100
    .line 101
    .line 102
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 103
    .line 104
    .line 105
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 106
    .line 107
    .line 108
    const v17, 0x3fe8f5c3    # 1.82f

    .line 109
    .line 110
    .line 111
    const v18, 0x3fe8f5c3    # 1.82f

    .line 112
    .line 113
    .line 114
    const v13, 0x3f59999a    # 0.85f

    .line 115
    .line 116
    .line 117
    const v14, 0x3e9eb852    # 0.31f

    .line 118
    .line 119
    .line 120
    const v15, 0x3fc147ae    # 1.51f

    .line 121
    .line 122
    .line 123
    const v16, 0x3f7851ec    # 0.97f

    .line 124
    .line 125
    .line 126
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 127
    .line 128
    .line 129
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 130
    .line 131
    .line 132
    const v0, 0x40928f5c    # 4.58f

    .line 133
    .line 134
    .line 135
    const/high16 v2, 0x41700000    # 15.0f

    .line 136
    .line 137
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 138
    .line 139
    .line 140
    const v17, 0x419b5c29    # 19.42f

    .line 141
    .line 142
    .line 143
    const/high16 v18, 0x41100000    # 9.0f

    .line 144
    .line 145
    const/high16 v13, 0x41880000    # 17.0f

    .line 146
    .line 147
    const v14, 0x40accccd    # 5.4f

    .line 148
    .line 149
    .line 150
    const v15, 0x4194cccd    # 18.6f

    .line 151
    .line 152
    .line 153
    const/high16 v16, 0x40e00000    # 7.0f

    .line 154
    .line 155
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 156
    .line 157
    .line 158
    const v0, -0x3fa47ae1    # -3.43f

    .line 159
    .line 160
    .line 161
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 162
    .line 163
    .line 164
    const v17, -0x40828f5c    # -0.99f

    .line 165
    .line 166
    .line 167
    const v18, -0x40828f5c    # -0.99f

    .line 168
    .line 169
    .line 170
    const v13, -0x4170a3d7    # -0.28f

    .line 171
    .line 172
    .line 173
    const v14, -0x41428f5c    # -0.37f

    .line 174
    .line 175
    .line 176
    const v15, -0x40e147ae    # -0.62f

    .line 177
    .line 178
    .line 179
    const v16, -0x40ca3d71    # -0.71f

    .line 180
    .line 181
    .line 182
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 183
    .line 184
    .line 185
    const v0, 0x40928f5c    # 4.58f

    .line 186
    .line 187
    .line 188
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 189
    .line 190
    .line 191
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 192
    .line 193
    .line 194
    const/high16 v0, 0x40000000    # 2.0f

    .line 195
    .line 196
    const/high16 v2, 0x41400000    # 12.0f

    .line 197
    .line 198
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 199
    .line 200
    .line 201
    const/high16 v17, 0x41100000    # 9.0f

    .line 202
    .line 203
    const v18, 0x411f3333    # 9.95f

    .line 204
    .line 205
    .line 206
    const/4 v13, 0x0

    .line 207
    const v14, 0x40a6147b    # 5.19f

    .line 208
    .line 209
    .line 210
    const v15, 0x407ccccd    # 3.95f

    .line 211
    .line 212
    .line 213
    const v16, 0x41173333    # 9.45f

    .line 214
    .line 215
    .line 216
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 217
    .line 218
    .line 219
    const v0, -0x3f1bd70a    # -7.13f

    .line 220
    .line 221
    .line 222
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 223
    .line 224
    .line 225
    const/high16 v18, 0x41400000    # 12.0f

    .line 226
    .line 227
    const v13, 0x411d70a4    # 9.84f

    .line 228
    .line 229
    .line 230
    const v14, 0x41666666    # 14.4f

    .line 231
    .line 232
    .line 233
    const/high16 v15, 0x41100000    # 9.0f

    .line 234
    .line 235
    const v16, 0x4154cccd    # 13.3f

    .line 236
    .line 237
    .line 238
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 239
    .line 240
    .line 241
    const/high16 v17, 0x40000000    # 2.0f

    .line 242
    .line 243
    const v18, -0x3fcb851f    # -2.82f

    .line 244
    .line 245
    .line 246
    const/4 v13, 0x0

    .line 247
    const v14, -0x4059999a    # -1.3f

    .line 248
    .line 249
    .line 250
    const v15, 0x3f570a3d    # 0.84f

    .line 251
    .line 252
    .line 253
    const v16, -0x3fe66666    # -2.4f

    .line 254
    .line 255
    .line 256
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 257
    .line 258
    .line 259
    const v0, 0x40033333    # 2.05f

    .line 260
    .line 261
    .line 262
    const/high16 v2, 0x41300000    # 11.0f

    .line 263
    .line 264
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 265
    .line 266
    .line 267
    const/high16 v17, -0x3ef00000    # -9.0f

    .line 268
    .line 269
    const v18, 0x411f3333    # 9.95f

    .line 270
    .line 271
    .line 272
    const v13, -0x3f5e6666    # -5.05f

    .line 273
    .line 274
    .line 275
    const/high16 v14, 0x3f000000    # 0.5f

    .line 276
    .line 277
    const/high16 v15, -0x3ef00000    # -9.0f

    .line 278
    .line 279
    const v16, 0x409851ec    # 4.76f

    .line 280
    .line 281
    .line 282
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 283
    .line 284
    .line 285
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 286
    .line 287
    .line 288
    const/high16 v0, 0x41100000    # 9.0f

    .line 289
    .line 290
    const v2, 0x40928f5c    # 4.58f

    .line 291
    .line 292
    .line 293
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 294
    .line 295
    .line 296
    const v0, 0x405c28f6    # 3.44f

    .line 297
    .line 298
    .line 299
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 300
    .line 301
    .line 302
    const/high16 v17, -0x40000000    # -2.0f

    .line 303
    .line 304
    const v18, 0x407eb852    # 3.98f

    .line 305
    .line 306
    .line 307
    const v13, -0x40628f5c    # -1.23f

    .line 308
    .line 309
    .line 310
    const v14, 0x3f6b851f    # 0.92f

    .line 311
    .line 312
    .line 313
    const/high16 v15, -0x40000000    # -2.0f

    .line 314
    .line 315
    const v16, 0x4018f5c3    # 2.39f

    .line 316
    .line 317
    .line 318
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 319
    .line 320
    .line 321
    const/high16 v17, 0x40000000    # 2.0f

    .line 322
    .line 323
    const v18, 0x407f5c29    # 3.99f

    .line 324
    .line 325
    .line 326
    const/4 v13, 0x0

    .line 327
    const v14, 0x3fcb851f    # 1.59f

    .line 328
    .line 329
    .line 330
    const v15, 0x3f451eb8    # 0.77f

    .line 331
    .line 332
    .line 333
    const v16, 0x4043d70a    # 3.06f

    .line 334
    .line 335
    .line 336
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 337
    .line 338
    .line 339
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 340
    .line 341
    .line 342
    const/high16 v17, 0x40800000    # 4.0f

    .line 343
    .line 344
    const/high16 v18, 0x41400000    # 12.0f

    .line 345
    .line 346
    const v13, 0x40c147ae    # 6.04f

    .line 347
    .line 348
    .line 349
    const v14, 0x4191eb85    # 18.24f

    .line 350
    .line 351
    .line 352
    const/high16 v15, 0x40800000    # 4.0f

    .line 353
    .line 354
    const v16, 0x4175999a    # 15.35f

    .line 355
    .line 356
    .line 357
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 358
    .line 359
    .line 360
    const/high16 v17, 0x40a00000    # 5.0f

    .line 361
    .line 362
    const v18, -0x3f128f5c    # -7.42f

    .line 363
    .line 364
    .line 365
    const/4 v13, 0x0

    .line 366
    const v14, -0x3fa9999a    # -3.35f

    .line 367
    .line 368
    .line 369
    const v15, 0x40028f5c    # 2.04f

    .line 370
    .line 371
    .line 372
    const v16, -0x3f3851ec    # -6.24f

    .line 373
    .line 374
    .line 375
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 376
    .line 377
    .line 378
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 379
    .line 380
    .line 381
    const/high16 v0, 0x41500000    # 13.0f

    .line 382
    .line 383
    const v2, 0x416d1eb8    # 14.82f

    .line 384
    .line 385
    .line 386
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 387
    .line 388
    .line 389
    const v0, 0x40e428f6    # 7.13f

    .line 390
    .line 391
    .line 392
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 393
    .line 394
    .line 395
    const v17, 0x410f3333    # 8.95f

    .line 396
    .line 397
    .line 398
    const v18, -0x3ef0cccd    # -8.95f

    .line 399
    .line 400
    .line 401
    const v13, 0x40970a3d    # 4.72f

    .line 402
    .line 403
    .line 404
    const v14, -0x410f5c29    # -0.47f

    .line 405
    .line 406
    .line 407
    const v15, 0x4107ae14    # 8.48f

    .line 408
    .line 409
    .line 410
    const v16, -0x3f78a3d7    # -4.23f

    .line 411
    .line 412
    .line 413
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 414
    .line 415
    .line 416
    const v0, -0x3f1bd70a    # -7.13f

    .line 417
    .line 418
    .line 419
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 420
    .line 421
    .line 422
    const v17, -0x40170a3d    # -1.82f

    .line 423
    .line 424
    .line 425
    const v18, 0x3fe8f5c3    # 1.82f

    .line 426
    .line 427
    .line 428
    const v13, -0x416147ae    # -0.31f

    .line 429
    .line 430
    .line 431
    const v14, 0x3f59999a    # 0.85f

    .line 432
    .line 433
    .line 434
    const v15, -0x4087ae14    # -0.97f

    .line 435
    .line 436
    .line 437
    const v16, 0x3fc147ae    # 1.51f

    .line 438
    .line 439
    .line 440
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 441
    .line 442
    .line 443
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 444
    .line 445
    .line 446
    const v0, 0x417fd70a    # 15.99f

    .line 447
    .line 448
    .line 449
    const/high16 v2, 0x41700000    # 15.0f

    .line 450
    .line 451
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 452
    .line 453
    .line 454
    const v17, 0x3f7d70a4    # 0.99f

    .line 455
    .line 456
    .line 457
    const v18, -0x40828f5c    # -0.99f

    .line 458
    .line 459
    .line 460
    const v13, 0x3ebd70a4    # 0.37f

    .line 461
    .line 462
    .line 463
    const v14, -0x4170a3d7    # -0.28f

    .line 464
    .line 465
    .line 466
    const v15, 0x3f35c28f    # 0.71f

    .line 467
    .line 468
    .line 469
    const v16, -0x40e3d70a    # -0.61f

    .line 470
    .line 471
    .line 472
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 473
    .line 474
    .line 475
    const v0, 0x405b851f    # 3.43f

    .line 476
    .line 477
    .line 478
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 479
    .line 480
    .line 481
    const/high16 v17, 0x41700000    # 15.0f

    .line 482
    .line 483
    const v18, 0x419b5c29    # 19.42f

    .line 484
    .line 485
    .line 486
    const v13, 0x4194cccd    # 18.6f

    .line 487
    .line 488
    .line 489
    const/high16 v14, 0x41880000    # 17.0f

    .line 490
    .line 491
    const/high16 v15, 0x41880000    # 17.0f

    .line 492
    .line 493
    const v16, 0x4194cccd    # 18.6f

    .line 494
    .line 495
    .line 496
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 497
    .line 498
    .line 499
    const v0, -0x3fa47ae1    # -3.43f

    .line 500
    .line 501
    .line 502
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 503
    .line 504
    .line 505
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 506
    .line 507
    .line 508
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 509
    .line 510
    .line 511
    move-result-object v2

    .line 512
    const/16 v16, 0x3800

    .line 513
    .line 514
    const/16 v17, 0x0

    .line 515
    .line 516
    const/high16 v6, 0x3f800000    # 1.0f

    .line 517
    .line 518
    const/high16 v8, 0x3f800000    # 1.0f

    .line 519
    .line 520
    const/4 v7, 0x0

    .line 521
    const/high16 v9, 0x3f800000    # 1.0f

    .line 522
    .line 523
    const/high16 v12, 0x3f800000    # 1.0f

    .line 524
    .line 525
    const/4 v13, 0x0

    .line 526
    const/4 v14, 0x0

    .line 527
    const/4 v15, 0x0

    .line 528
    const-string v4, ""

    .line 529
    .line 530
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 531
    .line 532
    .line 533
    move-result-object v0

    .line 534
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 535
    .line 536
    .line 537
    move-result-object v0

    .line 538
    sput-object v0, Landroidx/compose/material/icons/outlined/DonutSmallKt;->_donutSmall:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 539
    .line 540
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 541
    .line 542
    .line 543
    return-object v0
.end method
