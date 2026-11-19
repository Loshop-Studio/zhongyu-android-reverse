.class public final Landroidx/compose/material/icons/rounded/SwapCallsKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_swapCalls",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "SwapCalls",
        "Landroidx/compose/material/icons/Icons$Rounded;",
        "getSwapCalls",
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
        "SMAP\nSwapCalls.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SwapCalls.kt\nandroidx/compose/material/icons/rounded/SwapCallsKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,67:1\n212#2,12:68\n233#2,18:81\n253#2:118\n174#3:80\n705#4,2:99\n717#4,2:101\n719#4,11:107\n72#5,4:103\n*S KotlinDebug\n*F\n+ 1 SwapCalls.kt\nandroidx/compose/material/icons/rounded/SwapCallsKt\n*L\n29#1:68,12\n30#1:81,18\n30#1:118\n29#1:80\n30#1:99,2\n30#1:101,2\n30#1:107,11\n30#1:103,4\n*E\n"
    }
.end annotation


# static fields
.field private static _swapCalls:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getSwapCalls(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/SwapCallsKt;->_swapCalls:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.SwapCalls"

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
    const v0, 0x418d3333    # 17.65f

    .line 71
    .line 72
    .line 73
    const v2, 0x408b3333    # 4.35f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v0, 0x40328f5c    # 2.79f

    .line 80
    .line 81
    .line 82
    const v2, -0x3fcd70a4    # -2.79f

    .line 83
    .line 84
    .line 85
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 86
    .line 87
    .line 88
    const v17, 0x3eb33333    # 0.35f

    .line 89
    .line 90
    .line 91
    const v18, 0x3f5c28f6    # 0.86f

    .line 92
    .line 93
    .line 94
    const v13, -0x415c28f6    # -0.32f

    .line 95
    .line 96
    .line 97
    const v14, 0x3ea3d70a    # 0.32f

    .line 98
    .line 99
    .line 100
    const v15, -0x42333333    # -0.1f

    .line 101
    .line 102
    .line 103
    const v16, 0x3f5c28f6    # 0.86f

    .line 104
    .line 105
    .line 106
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 107
    .line 108
    .line 109
    const/high16 v0, 0x41880000    # 17.0f

    .line 110
    .line 111
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 112
    .line 113
    .line 114
    const v0, 0x40dc28f6    # 6.88f

    .line 115
    .line 116
    .line 117
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 118
    .line 119
    .line 120
    const v17, -0x402b851f    # -1.66f

    .line 121
    .line 122
    .line 123
    const v18, 0x4005c28f    # 2.09f

    .line 124
    .line 125
    .line 126
    const/4 v13, 0x0

    .line 127
    const/high16 v14, 0x3f800000    # 1.0f

    .line 128
    .line 129
    const v15, -0x40d47ae1    # -0.67f

    .line 130
    .line 131
    .line 132
    const v16, 0x3ff70a3d    # 1.93f

    .line 133
    .line 134
    .line 135
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 136
    .line 137
    .line 138
    const v17, -0x3fea3d71    # -2.34f

    .line 139
    .line 140
    .line 141
    const v18, -0x4003d70a    # -1.97f

    .line 142
    .line 143
    .line 144
    const/high16 v13, -0x40600000    # -1.25f

    .line 145
    .line 146
    const v14, 0x3e570a3d    # 0.21f

    .line 147
    .line 148
    .line 149
    const v15, -0x3fea3d71    # -2.34f

    .line 150
    .line 151
    .line 152
    const v16, -0x40bd70a4    # -0.76f

    .line 153
    .line 154
    .line 155
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 156
    .line 157
    .line 158
    const v0, 0x4102b852    # 8.17f

    .line 159
    .line 160
    .line 161
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 162
    .line 163
    .line 164
    const v17, -0x3f98f5c3    # -3.61f

    .line 165
    .line 166
    .line 167
    const v18, -0x3f7b3333    # -4.15f

    .line 168
    .line 169
    .line 170
    const/4 v13, 0x0

    .line 171
    const v14, -0x3ffa3d71    # -2.09f

    .line 172
    .line 173
    .line 174
    const v15, -0x403c28f6    # -1.53f

    .line 175
    .line 176
    .line 177
    const v16, -0x3f833333    # -3.95f

    .line 178
    .line 179
    .line 180
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 181
    .line 182
    .line 183
    const/high16 v17, 0x40a00000    # 5.0f

    .line 184
    .line 185
    const/high16 v18, 0x41000000    # 8.0f

    .line 186
    .line 187
    const v13, 0x40e051ec    # 7.01f

    .line 188
    .line 189
    .line 190
    const v14, 0x40728f5c    # 3.79f

    .line 191
    .line 192
    .line 193
    const/high16 v15, 0x40a00000    # 5.0f

    .line 194
    .line 195
    const v16, 0x40b51eb8    # 5.66f

    .line 196
    .line 197
    .line 198
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 199
    .line 200
    .line 201
    const/high16 v0, 0x40e00000    # 7.0f

    .line 202
    .line 203
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 204
    .line 205
    .line 206
    const v0, 0x404d70a4    # 3.21f

    .line 207
    .line 208
    .line 209
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 210
    .line 211
    .line 212
    const v17, -0x414ccccd    # -0.35f

    .line 213
    .line 214
    .line 215
    const v18, 0x3f59999a    # 0.85f

    .line 216
    .line 217
    .line 218
    const v13, -0x4119999a    # -0.45f

    .line 219
    .line 220
    .line 221
    const/4 v14, 0x0

    .line 222
    const v15, -0x40d47ae1    # -0.67f

    .line 223
    .line 224
    .line 225
    const v16, 0x3f0a3d71    # 0.54f

    .line 226
    .line 227
    .line 228
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 229
    .line 230
    .line 231
    const v0, 0x40328f5c    # 2.79f

    .line 232
    .line 233
    .line 234
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 235
    .line 236
    .line 237
    const v17, 0x3f35c28f    # 0.71f

    .line 238
    .line 239
    .line 240
    const/16 v18, 0x0

    .line 241
    .line 242
    const v13, 0x3e4ccccd    # 0.2f

    .line 243
    .line 244
    .line 245
    const v14, 0x3e4ccccd    # 0.2f

    .line 246
    .line 247
    .line 248
    const v15, 0x3f028f5c    # 0.51f

    .line 249
    .line 250
    .line 251
    const v16, 0x3e4ccccd    # 0.2f

    .line 252
    .line 253
    .line 254
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 255
    .line 256
    .line 257
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 258
    .line 259
    .line 260
    const v17, -0x4147ae14    # -0.36f

    .line 261
    .line 262
    .line 263
    const v18, -0x40a66666    # -0.85f

    .line 264
    .line 265
    .line 266
    const v13, 0x3e9eb852    # 0.31f

    .line 267
    .line 268
    .line 269
    const v14, -0x416147ae    # -0.31f

    .line 270
    .line 271
    .line 272
    const v15, 0x3db851ec    # 0.09f

    .line 273
    .line 274
    .line 275
    const v16, -0x40a66666    # -0.85f

    .line 276
    .line 277
    .line 278
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 279
    .line 280
    .line 281
    const/high16 v0, 0x40e00000    # 7.0f

    .line 282
    .line 283
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 284
    .line 285
    .line 286
    const v0, 0x4101eb85    # 8.12f

    .line 287
    .line 288
    .line 289
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 290
    .line 291
    .line 292
    const v17, 0x3fd47ae1    # 1.66f

    .line 293
    .line 294
    .line 295
    const v18, -0x3ffa3d71    # -2.09f

    .line 296
    .line 297
    .line 298
    const/4 v13, 0x0

    .line 299
    const/high16 v14, -0x40800000    # -1.0f

    .line 300
    .line 301
    const v15, 0x3f2b851f    # 0.67f

    .line 302
    .line 303
    .line 304
    const v16, -0x4008f5c3    # -1.93f

    .line 305
    .line 306
    .line 307
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 308
    .line 309
    .line 310
    const/high16 v17, 0x41300000    # 11.0f

    .line 311
    .line 312
    const/high16 v18, 0x41000000    # 8.0f

    .line 313
    .line 314
    const v13, 0x411e8f5c    # 9.91f

    .line 315
    .line 316
    .line 317
    const v14, 0x40ba3d71    # 5.82f

    .line 318
    .line 319
    .line 320
    const/high16 v15, 0x41300000    # 11.0f

    .line 321
    .line 322
    const v16, 0x40d947ae    # 6.79f

    .line 323
    .line 324
    .line 325
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 326
    .line 327
    .line 328
    const v0, 0x40da8f5c    # 6.83f

    .line 329
    .line 330
    .line 331
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 332
    .line 333
    .line 334
    const v17, 0x40670a3d    # 3.61f

    .line 335
    .line 336
    .line 337
    const v18, 0x4084cccd    # 4.15f

    .line 338
    .line 339
    .line 340
    const/4 v13, 0x0

    .line 341
    const v14, 0x4005c28f    # 2.09f

    .line 342
    .line 343
    .line 344
    const v15, 0x3fc3d70a    # 1.53f

    .line 345
    .line 346
    .line 347
    const v16, 0x407ccccd    # 3.95f

    .line 348
    .line 349
    .line 350
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 351
    .line 352
    .line 353
    const/high16 v17, 0x41980000    # 19.0f

    .line 354
    .line 355
    const/high16 v18, 0x41700000    # 15.0f

    .line 356
    .line 357
    const v13, 0x4187eb85    # 16.99f

    .line 358
    .line 359
    .line 360
    const v14, 0x4199ae14    # 19.21f

    .line 361
    .line 362
    .line 363
    const/high16 v15, 0x41980000    # 19.0f

    .line 364
    .line 365
    const v16, 0x418ab852    # 17.34f

    .line 366
    .line 367
    .line 368
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 369
    .line 370
    .line 371
    const/high16 v0, 0x41000000    # 8.0f

    .line 372
    .line 373
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 374
    .line 375
    .line 376
    const v0, 0x3fe51eb8    # 1.79f

    .line 377
    .line 378
    .line 379
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 380
    .line 381
    .line 382
    const v17, 0x3eb33333    # 0.35f

    .line 383
    .line 384
    .line 385
    const v18, -0x40a66666    # -0.85f

    .line 386
    .line 387
    .line 388
    const v13, 0x3ee66666    # 0.45f

    .line 389
    .line 390
    .line 391
    const/4 v14, 0x0

    .line 392
    const v15, 0x3f2b851f    # 0.67f

    .line 393
    .line 394
    .line 395
    const v16, -0x40f5c28f    # -0.54f

    .line 396
    .line 397
    .line 398
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 399
    .line 400
    .line 401
    const v0, -0x3fcd70a4    # -2.79f

    .line 402
    .line 403
    .line 404
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 405
    .line 406
    .line 407
    const v17, -0x40cccccd    # -0.7f

    .line 408
    .line 409
    .line 410
    const v18, -0x43dc28f6    # -0.01f

    .line 411
    .line 412
    .line 413
    const v13, -0x41bd70a4    # -0.19f

    .line 414
    .line 415
    .line 416
    const v14, -0x41b33333    # -0.2f

    .line 417
    .line 418
    .line 419
    const v15, -0x40fd70a4    # -0.51f

    .line 420
    .line 421
    .line 422
    const v16, -0x41b33333    # -0.2f

    .line 423
    .line 424
    .line 425
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 426
    .line 427
    .line 428
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 429
    .line 430
    .line 431
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 432
    .line 433
    .line 434
    move-result-object v2

    .line 435
    const/16 v16, 0x3800

    .line 436
    .line 437
    const/16 v17, 0x0

    .line 438
    .line 439
    const/high16 v6, 0x3f800000    # 1.0f

    .line 440
    .line 441
    const/high16 v8, 0x3f800000    # 1.0f

    .line 442
    .line 443
    const/4 v7, 0x0

    .line 444
    const/high16 v9, 0x3f800000    # 1.0f

    .line 445
    .line 446
    const/high16 v12, 0x3f800000    # 1.0f

    .line 447
    .line 448
    const/4 v13, 0x0

    .line 449
    const/4 v14, 0x0

    .line 450
    const/4 v15, 0x0

    .line 451
    const-string v4, ""

    .line 452
    .line 453
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 454
    .line 455
    .line 456
    move-result-object v0

    .line 457
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 458
    .line 459
    .line 460
    move-result-object v0

    .line 461
    sput-object v0, Landroidx/compose/material/icons/rounded/SwapCallsKt;->_swapCalls:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 462
    .line 463
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 464
    .line 465
    .line 466
    return-object v0
.end method
