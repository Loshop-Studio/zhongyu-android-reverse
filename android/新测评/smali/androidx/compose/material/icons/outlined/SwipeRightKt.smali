.class public final Landroidx/compose/material/icons/outlined/SwipeRightKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_swipeRight",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "SwipeRight",
        "Landroidx/compose/material/icons/Icons$Outlined;",
        "getSwipeRight",
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
        "SMAP\nSwipeRight.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SwipeRight.kt\nandroidx/compose/material/icons/outlined/SwipeRightKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,80:1\n212#2,12:81\n233#2,18:94\n253#2:131\n174#3:93\n705#4,2:112\n717#4,2:114\n719#4,11:120\n72#5,4:116\n*S KotlinDebug\n*F\n+ 1 SwipeRight.kt\nandroidx/compose/material/icons/outlined/SwipeRightKt\n*L\n29#1:81,12\n30#1:94,18\n30#1:131\n29#1:93\n30#1:112,2\n30#1:114,2\n30#1:120,11\n30#1:116,4\n*E\n"
    }
.end annotation


# static fields
.field private static _swipeRight:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getSwipeRight(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/outlined/SwipeRightKt;->_swipeRight:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Outlined.SwipeRight"

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
    const v0, 0x41971eb8    # 18.89f

    .line 71
    .line 72
    .line 73
    const v2, 0x415c51ec    # 13.77f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v0, -0x3f8ccccd    # -3.8f

    .line 80
    .line 81
    .line 82
    const v2, -0x402a3d71    # -1.67f

    .line 83
    .line 84
    .line 85
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 86
    .line 87
    .line 88
    const v17, 0x416a6666    # 14.65f

    .line 89
    .line 90
    .line 91
    const/high16 v18, 0x41400000    # 12.0f

    .line 92
    .line 93
    const v13, 0x416f5c29    # 14.96f

    .line 94
    .line 95
    .line 96
    const v14, 0x4140a3d7    # 12.04f

    .line 97
    .line 98
    .line 99
    const v15, 0x416cf5c3    # 14.81f

    .line 100
    .line 101
    .line 102
    const/high16 v16, 0x41400000    # 12.0f

    .line 103
    .line 104
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 105
    .line 106
    .line 107
    const/high16 v0, 0x41600000    # 14.0f

    .line 108
    .line 109
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 110
    .line 111
    .line 112
    const/high16 v0, 0x40f00000    # 7.5f

    .line 113
    .line 114
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 115
    .line 116
    .line 117
    const/high16 v17, 0x41380000    # 11.5f

    .line 118
    .line 119
    const/high16 v18, 0x40a00000    # 5.0f

    .line 120
    .line 121
    const/high16 v13, 0x41600000    # 14.0f

    .line 122
    .line 123
    const v14, 0x40c3d70a    # 6.12f

    .line 124
    .line 125
    .line 126
    const v15, 0x414e147b    # 12.88f

    .line 127
    .line 128
    .line 129
    const/high16 v16, 0x40a00000    # 5.0f

    .line 130
    .line 131
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 132
    .line 133
    .line 134
    const v0, 0x40c3d70a    # 6.12f

    .line 135
    .line 136
    .line 137
    const/high16 v2, 0x41100000    # 9.0f

    .line 138
    .line 139
    const/high16 v4, 0x40f00000    # 7.5f

    .line 140
    .line 141
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 142
    .line 143
    .line 144
    const v0, 0x41026666    # 8.15f

    .line 145
    .line 146
    .line 147
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 148
    .line 149
    .line 150
    const v0, -0x4010a3d7    # -1.87f

    .line 151
    .line 152
    .line 153
    const v2, -0x41333333    # -0.4f

    .line 154
    .line 155
    .line 156
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 157
    .line 158
    .line 159
    const v17, -0x40228f5c    # -1.73f

    .line 160
    .line 161
    .line 162
    const v18, 0x3f0f5c29    # 0.56f

    .line 163
    .line 164
    .line 165
    const v13, -0x41bd70a4    # -0.19f

    .line 166
    .line 167
    .line 168
    const v14, -0x430a3d71    # -0.03f

    .line 169
    .line 170
    .line 171
    const v15, -0x407d70a4    # -1.02f

    .line 172
    .line 173
    .line 174
    const v16, -0x41e66666    # -0.15f

    .line 175
    .line 176
    .line 177
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 178
    .line 179
    .line 180
    const/high16 v0, 0x40800000    # 4.0f

    .line 181
    .line 182
    const v2, 0x4189c28f    # 17.22f

    .line 183
    .line 184
    .line 185
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 186
    .line 187
    .line 188
    const v0, 0x40a3d70a    # 5.12f

    .line 189
    .line 190
    .line 191
    const v2, 0x40a6147b    # 5.19f

    .line 192
    .line 193
    .line 194
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 195
    .line 196
    .line 197
    const v17, 0x41287ae1    # 10.53f

    .line 198
    .line 199
    .line 200
    const/high16 v18, 0x41b80000    # 23.0f

    .line 201
    .line 202
    const v13, 0x4117d70a    # 9.49f

    .line 203
    .line 204
    .line 205
    const v14, 0x41b651ec    # 22.79f

    .line 206
    .line 207
    .line 208
    const/high16 v15, 0x41200000    # 10.0f

    .line 209
    .line 210
    const/high16 v16, 0x41b80000    # 23.0f

    .line 211
    .line 212
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 213
    .line 214
    .line 215
    const v0, 0x40d1999a    # 6.55f

    .line 216
    .line 217
    .line 218
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 219
    .line 220
    .line 221
    const v17, 0x3ffc28f6    # 1.97f

    .line 222
    .line 223
    .line 224
    const v18, -0x402a3d71    # -1.67f

    .line 225
    .line 226
    .line 227
    const v13, 0x3f7ae148    # 0.98f

    .line 228
    .line 229
    .line 230
    const/4 v14, 0x0

    .line 231
    const v15, 0x3fe7ae14    # 1.81f

    .line 232
    .line 233
    .line 234
    const v16, -0x40cccccd    # -0.7f

    .line 235
    .line 236
    .line 237
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 238
    .line 239
    .line 240
    const v0, 0x3f6b851f    # 0.92f

    .line 241
    .line 242
    .line 243
    const v2, -0x3f51eb85    # -5.44f

    .line 244
    .line 245
    .line 246
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 247
    .line 248
    .line 249
    const v17, 0x41971eb8    # 18.89f

    .line 250
    .line 251
    .line 252
    const v18, 0x415c51ec    # 13.77f

    .line 253
    .line 254
    .line 255
    const v13, 0x41a0f5c3    # 20.12f

    .line 256
    .line 257
    .line 258
    const v14, 0x41707ae1    # 15.03f

    .line 259
    .line 260
    .line 261
    const v15, 0x419d70a4    # 19.68f

    .line 262
    .line 263
    .line 264
    const v16, 0x4162b852    # 14.17f

    .line 265
    .line 266
    .line 267
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 268
    .line 269
    .line 270
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 271
    .line 272
    .line 273
    const/high16 v0, 0x41a80000    # 21.0f

    .line 274
    .line 275
    const v2, 0x4188a3d7    # 17.08f

    .line 276
    .line 277
    .line 278
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 279
    .line 280
    .line 281
    const v0, -0x3f2e6666    # -6.55f

    .line 282
    .line 283
    .line 284
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 285
    .line 286
    .line 287
    const v0, -0x3f933333    # -3.7f

    .line 288
    .line 289
    .line 290
    const v2, -0x3f8e147b    # -3.78f

    .line 291
    .line 292
    .line 293
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 294
    .line 295
    .line 296
    const/high16 v0, 0x41300000    # 11.0f

    .line 297
    .line 298
    const v2, 0x4190e148    # 18.11f

    .line 299
    .line 300
    .line 301
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 302
    .line 303
    .line 304
    const/high16 v0, 0x40f00000    # 7.5f

    .line 305
    .line 306
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 307
    .line 308
    .line 309
    const/high16 v17, 0x41380000    # 11.5f

    .line 310
    .line 311
    const/high16 v18, 0x40e00000    # 7.0f

    .line 312
    .line 313
    const/high16 v13, 0x41300000    # 11.0f

    .line 314
    .line 315
    const v14, 0x40e70a3d    # 7.22f

    .line 316
    .line 317
    .line 318
    const v15, 0x4133851f    # 11.22f

    .line 319
    .line 320
    .line 321
    const/high16 v16, 0x40e00000    # 7.0f

    .line 322
    .line 323
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 324
    .line 325
    .line 326
    const v0, 0x40e70a3d    # 7.22f

    .line 327
    .line 328
    .line 329
    const/high16 v2, 0x41400000    # 12.0f

    .line 330
    .line 331
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 332
    .line 333
    .line 334
    const v0, 0x40c5c28f    # 6.18f

    .line 335
    .line 336
    .line 337
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 338
    .line 339
    .line 340
    const v0, 0x3fe147ae    # 1.76f

    .line 341
    .line 342
    .line 343
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 344
    .line 345
    .line 346
    const/high16 v0, 0x41900000    # 18.0f

    .line 347
    .line 348
    const v2, 0x4178f5c3    # 15.56f

    .line 349
    .line 350
    .line 351
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 352
    .line 353
    .line 354
    const/high16 v0, 0x41a80000    # 21.0f

    .line 355
    .line 356
    const v2, 0x4188a3d7    # 17.08f

    .line 357
    .line 358
    .line 359
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 360
    .line 361
    .line 362
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 363
    .line 364
    .line 365
    const/high16 v0, 0x40200000    # 2.5f

    .line 366
    .line 367
    const/high16 v2, 0x41400000    # 12.0f

    .line 368
    .line 369
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 370
    .line 371
    .line 372
    const v17, 0x40647ae1    # 3.57f

    .line 373
    .line 374
    .line 375
    const v13, 0x40e851ec    # 7.26f

    .line 376
    .line 377
    .line 378
    const/high16 v14, 0x40200000    # 2.5f

    .line 379
    .line 380
    const v15, 0x408a8f5c    # 4.33f

    .line 381
    .line 382
    .line 383
    const v16, 0x40a0a3d7    # 5.02f

    .line 384
    .line 385
    .line 386
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 387
    .line 388
    .line 389
    const/high16 v0, 0x40000000    # 2.0f

    .line 390
    .line 391
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 392
    .line 393
    .line 394
    const/high16 v17, 0x41200000    # 10.0f

    .line 395
    .line 396
    const/high16 v18, -0x3f400000    # -6.0f

    .line 397
    .line 398
    const v13, 0x3f3ae148    # 0.73f

    .line 399
    .line 400
    .line 401
    const v14, -0x3fc7ae14    # -2.88f

    .line 402
    .line 403
    .line 404
    const v15, 0x409051ec    # 4.51f

    .line 405
    .line 406
    .line 407
    const/high16 v16, -0x3f400000    # -6.0f

    .line 408
    .line 409
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 410
    .line 411
    .line 412
    const/high16 v17, 0x41080000    # 8.5f

    .line 413
    .line 414
    const v18, 0x404147ae    # 3.02f

    .line 415
    .line 416
    .line 417
    const v13, 0x404e147b    # 3.22f

    .line 418
    .line 419
    .line 420
    const/4 v14, 0x0

    .line 421
    const v15, 0x40c5c28f    # 6.18f

    .line 422
    .line 423
    .line 424
    const v16, 0x3f90a3d7    # 1.13f

    .line 425
    .line 426
    .line 427
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 428
    .line 429
    .line 430
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 431
    .line 432
    .line 433
    const/high16 v0, 0x41b00000    # 22.0f

    .line 434
    .line 435
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 436
    .line 437
    .line 438
    const/high16 v0, 0x40a00000    # 5.0f

    .line 439
    .line 440
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 441
    .line 442
    .line 443
    const/high16 v0, -0x3f600000    # -5.0f

    .line 444
    .line 445
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 446
    .line 447
    .line 448
    const/high16 v0, 0x40b00000    # 5.5f

    .line 449
    .line 450
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 451
    .line 452
    .line 453
    const v0, 0x403a3d71    # 2.91f

    .line 454
    .line 455
    .line 456
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 457
    .line 458
    .line 459
    const/high16 v17, 0x41400000    # 12.0f

    .line 460
    .line 461
    const/high16 v18, 0x40200000    # 2.5f

    .line 462
    .line 463
    const v13, 0x418e51ec    # 17.79f

    .line 464
    .line 465
    .line 466
    const v14, 0x4068f5c3    # 3.64f

    .line 467
    .line 468
    .line 469
    const v15, 0x41707ae1    # 15.03f

    .line 470
    .line 471
    .line 472
    const/high16 v16, 0x40200000    # 2.5f

    .line 473
    .line 474
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 475
    .line 476
    .line 477
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 478
    .line 479
    .line 480
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 481
    .line 482
    .line 483
    move-result-object v2

    .line 484
    const/16 v16, 0x3800

    .line 485
    .line 486
    const/16 v17, 0x0

    .line 487
    .line 488
    const/high16 v6, 0x3f800000    # 1.0f

    .line 489
    .line 490
    const/high16 v8, 0x3f800000    # 1.0f

    .line 491
    .line 492
    const/4 v7, 0x0

    .line 493
    const/high16 v9, 0x3f800000    # 1.0f

    .line 494
    .line 495
    const/high16 v12, 0x3f800000    # 1.0f

    .line 496
    .line 497
    const/4 v13, 0x0

    .line 498
    const/4 v14, 0x0

    .line 499
    const/4 v15, 0x0

    .line 500
    const-string v4, ""

    .line 501
    .line 502
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 503
    .line 504
    .line 505
    move-result-object v0

    .line 506
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 507
    .line 508
    .line 509
    move-result-object v0

    .line 510
    sput-object v0, Landroidx/compose/material/icons/outlined/SwipeRightKt;->_swipeRight:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 511
    .line 512
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 513
    .line 514
    .line 515
    return-object v0
.end method
