.class public final Landroidx/compose/material/icons/rounded/NumbersKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_numbers",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "Numbers",
        "Landroidx/compose/material/icons/Icons$Rounded;",
        "getNumbers",
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
        "SMAP\nNumbers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Numbers.kt\nandroidx/compose/material/icons/rounded/NumbersKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,89:1\n212#2,12:90\n233#2,18:103\n253#2:140\n174#3:102\n705#4,2:121\n717#4,2:123\n719#4,11:129\n72#5,4:125\n*S KotlinDebug\n*F\n+ 1 Numbers.kt\nandroidx/compose/material/icons/rounded/NumbersKt\n*L\n29#1:90,12\n30#1:103,18\n30#1:140\n29#1:102\n30#1:121,2\n30#1:123,2\n30#1:129,11\n30#1:125,4\n*E\n"
    }
.end annotation


# static fields
.field private static _numbers:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getNumbers(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/NumbersKt;->_numbers:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.Numbers"

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
    const v0, 0x41a570a4    # 20.68f

    .line 71
    .line 72
    .line 73
    const v2, 0x411451ec    # 9.27f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v0, -0x428a3d71    # -0.06f

    .line 80
    .line 81
    .line 82
    const v2, 0x3c23d70a    # 0.01f

    .line 83
    .line 84
    .line 85
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 86
    .line 87
    .line 88
    const v17, 0x419e147b    # 19.76f

    .line 89
    .line 90
    .line 91
    const/high16 v18, 0x41000000    # 8.0f

    .line 92
    .line 93
    const v13, 0x41a6cccd    # 20.85f

    .line 94
    .line 95
    .line 96
    const v14, 0x410970a4    # 8.59f

    .line 97
    .line 98
    .line 99
    const v15, 0x41a31eb8    # 20.39f

    .line 100
    .line 101
    .line 102
    const/high16 v16, 0x41000000    # 8.0f

    .line 103
    .line 104
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 105
    .line 106
    .line 107
    const/high16 v0, 0x41880000    # 17.0f

    .line 108
    .line 109
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 110
    .line 111
    .line 112
    const v0, -0x3fcd70a4    # -2.79f

    .line 113
    .line 114
    .line 115
    const v2, 0x3f333333    # 0.7f

    .line 116
    .line 117
    .line 118
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 119
    .line 120
    .line 121
    const v17, 0x4186147b    # 16.76f

    .line 122
    .line 123
    .line 124
    const/high16 v18, 0x40800000    # 4.0f

    .line 125
    .line 126
    const v13, 0x418ecccd    # 17.85f

    .line 127
    .line 128
    .line 129
    const v14, 0x4092e148    # 4.59f

    .line 130
    .line 131
    .line 132
    const v15, 0x418b1eb8    # 17.39f

    .line 133
    .line 134
    .line 135
    const/high16 v16, 0x40800000    # 4.0f

    .line 136
    .line 137
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 138
    .line 139
    .line 140
    const/4 v0, 0x0

    .line 141
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 142
    .line 143
    .line 144
    const v17, -0x408f5c29    # -0.94f

    .line 145
    .line 146
    .line 147
    const v18, 0x3f3ae148    # 0.73f

    .line 148
    .line 149
    .line 150
    const v13, -0x4119999a    # -0.45f

    .line 151
    .line 152
    .line 153
    const/4 v14, 0x0

    .line 154
    const v15, -0x40ab851f    # -0.83f

    .line 155
    .line 156
    .line 157
    const v16, 0x3e99999a    # 0.3f

    .line 158
    .line 159
    .line 160
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 161
    .line 162
    .line 163
    const/high16 v0, 0x41000000    # 8.0f

    .line 164
    .line 165
    const/high16 v2, 0x41700000    # 15.0f

    .line 166
    .line 167
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 168
    .line 169
    .line 170
    const/high16 v0, -0x3f800000    # -4.0f

    .line 171
    .line 172
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 173
    .line 174
    .line 175
    const v0, -0x3fcd70a4    # -2.79f

    .line 176
    .line 177
    .line 178
    const v2, 0x3f333333    # 0.7f

    .line 179
    .line 180
    .line 181
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 182
    .line 183
    .line 184
    const v17, 0x412c28f6    # 10.76f

    .line 185
    .line 186
    .line 187
    const/high16 v18, 0x40800000    # 4.0f

    .line 188
    .line 189
    const v13, 0x413d999a    # 11.85f

    .line 190
    .line 191
    .line 192
    const v14, 0x4092e148    # 4.59f

    .line 193
    .line 194
    .line 195
    const v15, 0x41363d71    # 11.39f

    .line 196
    .line 197
    .line 198
    const/high16 v16, 0x40800000    # 4.0f

    .line 199
    .line 200
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 201
    .line 202
    .line 203
    const/4 v0, 0x0

    .line 204
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 205
    .line 206
    .line 207
    const v17, -0x408f5c29    # -0.94f

    .line 208
    .line 209
    .line 210
    const v18, 0x3f3ae148    # 0.73f

    .line 211
    .line 212
    .line 213
    const v13, -0x4119999a    # -0.45f

    .line 214
    .line 215
    .line 216
    const/4 v14, 0x0

    .line 217
    const v15, -0x40ab851f    # -0.83f

    .line 218
    .line 219
    .line 220
    const v16, 0x3e99999a    # 0.3f

    .line 221
    .line 222
    .line 223
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 224
    .line 225
    .line 226
    const/high16 v0, 0x41100000    # 9.0f

    .line 227
    .line 228
    const/high16 v2, 0x41000000    # 8.0f

    .line 229
    .line 230
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 231
    .line 232
    .line 233
    const v0, 0x40b851ec    # 5.76f

    .line 234
    .line 235
    .line 236
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 237
    .line 238
    .line 239
    const v17, 0x409a3d71    # 4.82f

    .line 240
    .line 241
    .line 242
    const v18, 0x410bae14    # 8.73f

    .line 243
    .line 244
    .line 245
    const v13, 0x40a9eb85    # 5.31f

    .line 246
    .line 247
    .line 248
    const/high16 v14, 0x41000000    # 8.0f

    .line 249
    .line 250
    const v15, 0x409d70a4    # 4.92f

    .line 251
    .line 252
    .line 253
    const v16, 0x4104cccd    # 8.3f

    .line 254
    .line 255
    .line 256
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 257
    .line 258
    .line 259
    const v0, 0x4099999a    # 4.8f

    .line 260
    .line 261
    .line 262
    const v2, 0x410ca3d7    # 8.79f

    .line 263
    .line 264
    .line 265
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 266
    .line 267
    .line 268
    const v17, 0x40b7ae14    # 5.74f

    .line 269
    .line 270
    .line 271
    const/high16 v18, 0x41200000    # 10.0f

    .line 272
    .line 273
    const v13, 0x4094cccd    # 4.65f

    .line 274
    .line 275
    .line 276
    const v14, 0x41168f5c    # 9.41f

    .line 277
    .line 278
    .line 279
    const v15, 0x40a3851f    # 5.11f

    .line 280
    .line 281
    .line 282
    const/high16 v16, 0x41200000    # 10.0f

    .line 283
    .line 284
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 285
    .line 286
    .line 287
    const/high16 v0, 0x41080000    # 8.5f

    .line 288
    .line 289
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 290
    .line 291
    .line 292
    const/high16 v0, -0x40800000    # -1.0f

    .line 293
    .line 294
    const/high16 v2, 0x40800000    # 4.0f

    .line 295
    .line 296
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 297
    .line 298
    .line 299
    const v0, 0x408851ec    # 4.26f

    .line 300
    .line 301
    .line 302
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 303
    .line 304
    .line 305
    const v17, -0x408f5c29    # -0.94f

    .line 306
    .line 307
    .line 308
    const v18, 0x3f3ae148    # 0.73f

    .line 309
    .line 310
    .line 311
    const v13, -0x4119999a    # -0.45f

    .line 312
    .line 313
    .line 314
    const/4 v14, 0x0

    .line 315
    const v15, -0x40ab851f    # -0.83f

    .line 316
    .line 317
    .line 318
    const v16, 0x3e99999a    # 0.3f

    .line 319
    .line 320
    .line 321
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 322
    .line 323
    .line 324
    const v0, 0x40533333    # 3.3f

    .line 325
    .line 326
    .line 327
    const v2, 0x416ca3d7    # 14.79f

    .line 328
    .line 329
    .line 330
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 331
    .line 332
    .line 333
    const v17, 0x4087ae14    # 4.24f

    .line 334
    .line 335
    .line 336
    const/high16 v18, 0x41800000    # 16.0f

    .line 337
    .line 338
    const v13, 0x4049999a    # 3.15f

    .line 339
    .line 340
    .line 341
    const v14, 0x41768f5c    # 15.41f

    .line 342
    .line 343
    .line 344
    const v15, 0x40670a3d    # 3.61f

    .line 345
    .line 346
    .line 347
    const/high16 v16, 0x41800000    # 16.0f

    .line 348
    .line 349
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 350
    .line 351
    .line 352
    const/high16 v0, 0x40e00000    # 7.0f

    .line 353
    .line 354
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 355
    .line 356
    .line 357
    const v0, 0x40328f5c    # 2.79f

    .line 358
    .line 359
    .line 360
    const v2, -0x40cccccd    # -0.7f

    .line 361
    .line 362
    .line 363
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 364
    .line 365
    .line 366
    const v17, 0x40e7ae14    # 7.24f

    .line 367
    .line 368
    .line 369
    const/high16 v18, 0x41a00000    # 20.0f

    .line 370
    .line 371
    const v13, 0x40c4cccd    # 6.15f

    .line 372
    .line 373
    .line 374
    const v14, 0x419b47ae    # 19.41f

    .line 375
    .line 376
    .line 377
    const v15, 0x40d3851f    # 6.61f

    .line 378
    .line 379
    .line 380
    const/high16 v16, 0x41a00000    # 20.0f

    .line 381
    .line 382
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 383
    .line 384
    .line 385
    const/4 v0, 0x0

    .line 386
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 387
    .line 388
    .line 389
    const v17, 0x3f70a3d7    # 0.94f

    .line 390
    .line 391
    .line 392
    const v18, -0x40c51eb8    # -0.73f

    .line 393
    .line 394
    .line 395
    const v13, 0x3ee66666    # 0.45f

    .line 396
    .line 397
    .line 398
    const/4 v14, 0x0

    .line 399
    const v15, 0x3f547ae1    # 0.83f

    .line 400
    .line 401
    .line 402
    const v16, -0x41666666    # -0.3f

    .line 403
    .line 404
    .line 405
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 406
    .line 407
    .line 408
    const/high16 v0, 0x41800000    # 16.0f

    .line 409
    .line 410
    const/high16 v2, 0x41100000    # 9.0f

    .line 411
    .line 412
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 413
    .line 414
    .line 415
    const/high16 v0, 0x40800000    # 4.0f

    .line 416
    .line 417
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 418
    .line 419
    .line 420
    const v0, 0x40328f5c    # 2.79f

    .line 421
    .line 422
    .line 423
    const v2, -0x40cccccd    # -0.7f

    .line 424
    .line 425
    .line 426
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 427
    .line 428
    .line 429
    const v17, 0x4153d70a    # 13.24f

    .line 430
    .line 431
    .line 432
    const/high16 v18, 0x41a00000    # 20.0f

    .line 433
    .line 434
    const v13, 0x41426666    # 12.15f

    .line 435
    .line 436
    .line 437
    const v14, 0x419b47ae    # 19.41f

    .line 438
    .line 439
    .line 440
    const v15, 0x4149c28f    # 12.61f

    .line 441
    .line 442
    .line 443
    const/high16 v16, 0x41a00000    # 20.0f

    .line 444
    .line 445
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 446
    .line 447
    .line 448
    const/4 v0, 0x0

    .line 449
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 450
    .line 451
    .line 452
    const v17, 0x3f70a3d7    # 0.94f

    .line 453
    .line 454
    .line 455
    const v18, -0x40c51eb8    # -0.73f

    .line 456
    .line 457
    .line 458
    const v13, 0x3ee66666    # 0.45f

    .line 459
    .line 460
    .line 461
    const/4 v14, 0x0

    .line 462
    const v15, 0x3f547ae1    # 0.83f

    .line 463
    .line 464
    .line 465
    const v16, -0x41666666    # -0.3f

    .line 466
    .line 467
    .line 468
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 469
    .line 470
    .line 471
    const/high16 v0, 0x41800000    # 16.0f

    .line 472
    .line 473
    const/high16 v2, 0x41700000    # 15.0f

    .line 474
    .line 475
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 476
    .line 477
    .line 478
    const v0, 0x404f5c29    # 3.24f

    .line 479
    .line 480
    .line 481
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 482
    .line 483
    .line 484
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 485
    .line 486
    .line 487
    const v0, -0x428a3d71    # -0.06f

    .line 488
    .line 489
    .line 490
    const v2, 0x3c23d70a    # 0.01f

    .line 491
    .line 492
    .line 493
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 494
    .line 495
    .line 496
    const v17, -0x408f5c29    # -0.94f

    .line 497
    .line 498
    .line 499
    const v18, -0x40651eb8    # -1.21f

    .line 500
    .line 501
    .line 502
    const v13, 0x3e19999a    # 0.15f

    .line 503
    .line 504
    .line 505
    const v14, -0x40e3d70a    # -0.61f

    .line 506
    .line 507
    .line 508
    const v15, -0x416147ae    # -0.31f

    .line 509
    .line 510
    .line 511
    const v16, -0x40651eb8    # -1.21f

    .line 512
    .line 513
    .line 514
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 515
    .line 516
    .line 517
    const/high16 v0, 0x41780000    # 15.5f

    .line 518
    .line 519
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 520
    .line 521
    .line 522
    const/high16 v0, 0x3f800000    # 1.0f

    .line 523
    .line 524
    const/high16 v2, -0x3f800000    # -4.0f

    .line 525
    .line 526
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 527
    .line 528
    .line 529
    const v0, 0x404f5c29    # 3.24f

    .line 530
    .line 531
    .line 532
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 533
    .line 534
    .line 535
    const v17, 0x41a570a4    # 20.68f

    .line 536
    .line 537
    .line 538
    const v18, 0x411451ec    # 9.27f

    .line 539
    .line 540
    .line 541
    const v13, 0x41a1851f    # 20.19f

    .line 542
    .line 543
    .line 544
    const/high16 v14, 0x41200000    # 10.0f

    .line 545
    .line 546
    const v15, 0x41a4a3d7    # 20.58f

    .line 547
    .line 548
    .line 549
    const v16, 0x411b3333    # 9.7f

    .line 550
    .line 551
    .line 552
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 553
    .line 554
    .line 555
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 556
    .line 557
    .line 558
    const/high16 v0, 0x41600000    # 14.0f

    .line 559
    .line 560
    const/high16 v2, 0x41580000    # 13.5f

    .line 561
    .line 562
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 563
    .line 564
    .line 565
    const/high16 v0, -0x3f800000    # -4.0f

    .line 566
    .line 567
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 568
    .line 569
    .line 570
    const/high16 v0, 0x3f800000    # 1.0f

    .line 571
    .line 572
    const/high16 v2, -0x3f800000    # -4.0f

    .line 573
    .line 574
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 575
    .line 576
    .line 577
    const/high16 v0, 0x40800000    # 4.0f

    .line 578
    .line 579
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 580
    .line 581
    .line 582
    const/high16 v0, 0x41600000    # 14.0f

    .line 583
    .line 584
    const/high16 v2, 0x41580000    # 13.5f

    .line 585
    .line 586
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 587
    .line 588
    .line 589
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 590
    .line 591
    .line 592
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 593
    .line 594
    .line 595
    move-result-object v2

    .line 596
    const/16 v16, 0x3800

    .line 597
    .line 598
    const/16 v17, 0x0

    .line 599
    .line 600
    const/high16 v6, 0x3f800000    # 1.0f

    .line 601
    .line 602
    const/high16 v8, 0x3f800000    # 1.0f

    .line 603
    .line 604
    const/4 v7, 0x0

    .line 605
    const/high16 v9, 0x3f800000    # 1.0f

    .line 606
    .line 607
    const/high16 v12, 0x3f800000    # 1.0f

    .line 608
    .line 609
    const/4 v13, 0x0

    .line 610
    const/4 v14, 0x0

    .line 611
    const/4 v15, 0x0

    .line 612
    const-string v4, ""

    .line 613
    .line 614
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 615
    .line 616
    .line 617
    move-result-object v0

    .line 618
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 619
    .line 620
    .line 621
    move-result-object v0

    .line 622
    sput-object v0, Landroidx/compose/material/icons/rounded/NumbersKt;->_numbers:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 623
    .line 624
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 625
    .line 626
    .line 627
    return-object v0
.end method
