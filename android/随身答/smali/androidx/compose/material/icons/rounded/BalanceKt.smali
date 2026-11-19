.class public final Landroidx/compose/material/icons/rounded/BalanceKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_balance",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "Balance",
        "Landroidx/compose/material/icons/Icons$Rounded;",
        "getBalance",
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
        "SMAP\nBalance.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Balance.kt\nandroidx/compose/material/icons/rounded/BalanceKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,90:1\n212#2,12:91\n233#2,18:104\n253#2:141\n174#3:103\n705#4,2:122\n717#4,2:124\n719#4,11:130\n72#5,4:126\n*S KotlinDebug\n*F\n+ 1 Balance.kt\nandroidx/compose/material/icons/rounded/BalanceKt\n*L\n29#1:91,12\n30#1:104,18\n30#1:141\n29#1:103\n30#1:122,2\n30#1:124,2\n30#1:130,11\n30#1:126,4\n*E\n"
    }
.end annotation


# static fields
.field private static _balance:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getBalance(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/BalanceKt;->_balance:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.Balance"

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
    const/high16 v0, 0x41980000    # 19.0f

    .line 71
    .line 72
    const/high16 v2, 0x41500000    # 13.0f

    .line 73
    .line 74
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const v0, 0x40fa8f5c    # 7.83f

    .line 78
    .line 79
    .line 80
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 81
    .line 82
    .line 83
    const v17, 0x3fea3d71    # 1.83f

    .line 84
    .line 85
    .line 86
    const v18, -0x4015c28f    # -1.83f

    .line 87
    .line 88
    .line 89
    const v13, 0x3f59999a    # 0.85f

    .line 90
    .line 91
    .line 92
    const v14, -0x41666666    # -0.3f

    .line 93
    .line 94
    .line 95
    const v15, 0x3fc3d70a    # 1.53f

    .line 96
    .line 97
    .line 98
    const v16, -0x40851eb8    # -0.98f

    .line 99
    .line 100
    .line 101
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 102
    .line 103
    .line 104
    const/high16 v0, 0x41900000    # 18.0f

    .line 105
    .line 106
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 107
    .line 108
    .line 109
    const v0, 0x40cfae14    # 6.49f

    .line 110
    .line 111
    .line 112
    const v2, -0x3fce147b    # -2.78f

    .line 113
    .line 114
    .line 115
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 116
    .line 117
    .line 118
    const v17, -0x421eb852    # -0.11f

    .line 119
    .line 120
    .line 121
    const/high16 v18, 0x3fa00000    # 1.25f

    .line 122
    .line 123
    const v13, -0x41d1eb85    # -0.17f

    .line 124
    .line 125
    .line 126
    const v14, 0x3ec7ae14    # 0.39f

    .line 127
    .line 128
    .line 129
    const v15, -0x41947ae1    # -0.23f

    .line 130
    .line 131
    .line 132
    const v16, 0x3f570a3d    # 0.84f

    .line 133
    .line 134
    .line 135
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 136
    .line 137
    .line 138
    const v17, 0x4058f5c3    # 3.39f

    .line 139
    .line 140
    .line 141
    const v18, 0x4010a3d7    # 2.26f

    .line 142
    .line 143
    .line 144
    const v13, 0x3ec7ae14    # 0.39f

    .line 145
    .line 146
    .line 147
    const v14, 0x3fa66666    # 1.3f

    .line 148
    .line 149
    .line 150
    const v15, 0x3fe147ae    # 1.76f

    .line 151
    .line 152
    .line 153
    const v16, 0x4010a3d7    # 2.26f

    .line 154
    .line 155
    .line 156
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 157
    .line 158
    .line 159
    const v0, -0x3fef5c29    # -2.26f

    .line 160
    .line 161
    .line 162
    const v2, 0x4058f5c3    # 3.39f

    .line 163
    .line 164
    .line 165
    const v4, -0x408a3d71    # -0.96f

    .line 166
    .line 167
    .line 168
    const v6, 0x4040a3d7    # 3.01f

    .line 169
    .line 170
    .line 171
    invoke-virtual {v12, v6, v4, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 172
    .line 173
    .line 174
    const v17, -0x421eb852    # -0.11f

    .line 175
    .line 176
    .line 177
    const/high16 v18, -0x40600000    # -1.25f

    .line 178
    .line 179
    const v13, 0x3df5c28f    # 0.12f

    .line 180
    .line 181
    .line 182
    const v14, -0x412e147b    # -0.41f

    .line 183
    .line 184
    .line 185
    const v15, 0x3d75c28f    # 0.06f

    .line 186
    .line 187
    .line 188
    const v16, -0x40a3d70a    # -0.86f

    .line 189
    .line 190
    .line 191
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 192
    .line 193
    .line 194
    const/high16 v0, 0x40c00000    # 6.0f

    .line 195
    .line 196
    const/high16 v2, 0x41980000    # 19.0f

    .line 197
    .line 198
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 199
    .line 200
    .line 201
    const/high16 v0, 0x3f800000    # 1.0f

    .line 202
    .line 203
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 204
    .line 205
    .line 206
    const/high16 v17, 0x3f800000    # 1.0f

    .line 207
    .line 208
    const/high16 v18, -0x40800000    # -1.0f

    .line 209
    .line 210
    const v13, 0x3f0ccccd    # 0.55f

    .line 211
    .line 212
    .line 213
    const/4 v14, 0x0

    .line 214
    const/high16 v15, 0x3f800000    # 1.0f

    .line 215
    .line 216
    const v16, -0x4119999a    # -0.45f

    .line 217
    .line 218
    .line 219
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 220
    .line 221
    .line 222
    const v0, -0x4119999a    # -0.45f

    .line 223
    .line 224
    .line 225
    const/high16 v2, -0x40800000    # -1.0f

    .line 226
    .line 227
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 228
    .line 229
    .line 230
    const v0, -0x3f5a8f5c    # -5.17f

    .line 231
    .line 232
    .line 233
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 234
    .line 235
    .line 236
    const/high16 v17, 0x41400000    # 12.0f

    .line 237
    .line 238
    const/high16 v18, 0x40000000    # 2.0f

    .line 239
    .line 240
    const v13, 0x4166b852    # 14.42f

    .line 241
    .line 242
    .line 243
    const v14, 0x40351eb8    # 2.83f

    .line 244
    .line 245
    .line 246
    const v15, 0x4154f5c3    # 13.31f

    .line 247
    .line 248
    .line 249
    const/high16 v16, 0x40000000    # 2.0f

    .line 250
    .line 251
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 252
    .line 253
    .line 254
    const v0, 0x40351eb8    # 2.83f

    .line 255
    .line 256
    .line 257
    const v2, 0x4112b852    # 9.17f

    .line 258
    .line 259
    .line 260
    const/high16 v4, 0x40800000    # 4.0f

    .line 261
    .line 262
    const v6, 0x411947ae    # 9.58f

    .line 263
    .line 264
    .line 265
    invoke-virtual {v12, v6, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 266
    .line 267
    .line 268
    const/high16 v0, 0x40800000    # 4.0f

    .line 269
    .line 270
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 271
    .line 272
    .line 273
    const/high16 v17, 0x40400000    # 3.0f

    .line 274
    .line 275
    const/high16 v18, 0x40a00000    # 5.0f

    .line 276
    .line 277
    const v13, 0x405ccccd    # 3.45f

    .line 278
    .line 279
    .line 280
    const/high16 v14, 0x40800000    # 4.0f

    .line 281
    .line 282
    const/high16 v15, 0x40400000    # 3.0f

    .line 283
    .line 284
    const v16, 0x408e6666    # 4.45f

    .line 285
    .line 286
    .line 287
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 288
    .line 289
    .line 290
    const/high16 v17, 0x3f800000    # 1.0f

    .line 291
    .line 292
    const/high16 v18, 0x3f800000    # 1.0f

    .line 293
    .line 294
    const/4 v13, 0x0

    .line 295
    const v14, 0x3f0ccccd    # 0.55f

    .line 296
    .line 297
    .line 298
    const v15, 0x3ee66666    # 0.45f

    .line 299
    .line 300
    .line 301
    const/high16 v16, 0x3f800000    # 1.0f

    .line 302
    .line 303
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 304
    .line 305
    .line 306
    const/high16 v0, 0x3f800000    # 1.0f

    .line 307
    .line 308
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 309
    .line 310
    .line 311
    const v0, 0x40cfae14    # 6.49f

    .line 312
    .line 313
    .line 314
    const v2, -0x3fce147b    # -2.78f

    .line 315
    .line 316
    .line 317
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 318
    .line 319
    .line 320
    const v17, -0x421eb852    # -0.11f

    .line 321
    .line 322
    .line 323
    const/high16 v18, 0x3fa00000    # 1.25f

    .line 324
    .line 325
    const v13, -0x41d1eb85    # -0.17f

    .line 326
    .line 327
    .line 328
    const v14, 0x3ec7ae14    # 0.39f

    .line 329
    .line 330
    .line 331
    const v15, -0x41947ae1    # -0.23f

    .line 332
    .line 333
    .line 334
    const v16, 0x3f570a3d    # 0.84f

    .line 335
    .line 336
    .line 337
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 338
    .line 339
    .line 340
    const/high16 v17, 0x40b00000    # 5.5f

    .line 341
    .line 342
    const/high16 v18, 0x41800000    # 16.0f

    .line 343
    .line 344
    const v13, 0x401f5c29    # 2.49f

    .line 345
    .line 346
    .line 347
    const v14, 0x4170a3d7    # 15.04f

    .line 348
    .line 349
    .line 350
    const v15, 0x4077ae14    # 3.87f

    .line 351
    .line 352
    .line 353
    const/high16 v16, 0x41800000    # 16.0f

    .line 354
    .line 355
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 356
    .line 357
    .line 358
    const v0, -0x3fef5c29    # -2.26f

    .line 359
    .line 360
    .line 361
    const v2, 0x4058f5c3    # 3.39f

    .line 362
    .line 363
    .line 364
    const v4, -0x408a3d71    # -0.96f

    .line 365
    .line 366
    .line 367
    const v6, 0x4040a3d7    # 3.01f

    .line 368
    .line 369
    .line 370
    invoke-virtual {v12, v6, v4, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 371
    .line 372
    .line 373
    const v17, -0x421eb852    # -0.11f

    .line 374
    .line 375
    .line 376
    const/high16 v18, -0x40600000    # -1.25f

    .line 377
    .line 378
    const v13, 0x3df5c28f    # 0.12f

    .line 379
    .line 380
    .line 381
    const v14, -0x412e147b    # -0.41f

    .line 382
    .line 383
    .line 384
    const v15, 0x3d75c28f    # 0.06f

    .line 385
    .line 386
    .line 387
    const v16, -0x40a3d70a    # -0.86f

    .line 388
    .line 389
    .line 390
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 391
    .line 392
    .line 393
    const/high16 v0, 0x40c00000    # 6.0f

    .line 394
    .line 395
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 396
    .line 397
    .line 398
    const v0, 0x404ae148    # 3.17f

    .line 399
    .line 400
    .line 401
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 402
    .line 403
    .line 404
    const v17, 0x3fea3d71    # 1.83f

    .line 405
    .line 406
    .line 407
    const v18, 0x3fea3d71    # 1.83f

    .line 408
    .line 409
    .line 410
    const v13, 0x3e99999a    # 0.3f

    .line 411
    .line 412
    .line 413
    const v14, 0x3f59999a    # 0.85f

    .line 414
    .line 415
    .line 416
    const v15, 0x3f7ae148    # 0.98f

    .line 417
    .line 418
    .line 419
    const v16, 0x3fc3d70a    # 1.53f

    .line 420
    .line 421
    .line 422
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 423
    .line 424
    .line 425
    const/high16 v0, 0x41980000    # 19.0f

    .line 426
    .line 427
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 428
    .line 429
    .line 430
    const/high16 v0, 0x41300000    # 11.0f

    .line 431
    .line 432
    const/high16 v2, 0x41980000    # 19.0f

    .line 433
    .line 434
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 435
    .line 436
    .line 437
    const/high16 v0, 0x40400000    # 3.0f

    .line 438
    .line 439
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 440
    .line 441
    .line 442
    const/high16 v17, -0x40800000    # -1.0f

    .line 443
    .line 444
    const/high16 v18, 0x3f800000    # 1.0f

    .line 445
    .line 446
    const v13, -0x40f33333    # -0.55f

    .line 447
    .line 448
    .line 449
    const/4 v14, 0x0

    .line 450
    const/high16 v15, -0x40800000    # -1.0f

    .line 451
    .line 452
    const v16, 0x3ee66666    # 0.45f

    .line 453
    .line 454
    .line 455
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 456
    .line 457
    .line 458
    const v0, 0x3ee66666    # 0.45f

    .line 459
    .line 460
    .line 461
    const/high16 v2, 0x3f800000    # 1.0f

    .line 462
    .line 463
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 464
    .line 465
    .line 466
    const/high16 v0, 0x41900000    # 18.0f

    .line 467
    .line 468
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 469
    .line 470
    .line 471
    const/high16 v17, 0x3f800000    # 1.0f

    .line 472
    .line 473
    const/high16 v18, -0x40800000    # -1.0f

    .line 474
    .line 475
    const v13, 0x3f0ccccd    # 0.55f

    .line 476
    .line 477
    .line 478
    const/high16 v15, 0x3f800000    # 1.0f

    .line 479
    .line 480
    const v16, -0x4119999a    # -0.45f

    .line 481
    .line 482
    .line 483
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 484
    .line 485
    .line 486
    const v0, -0x4119999a    # -0.45f

    .line 487
    .line 488
    .line 489
    const/high16 v2, -0x40800000    # -1.0f

    .line 490
    .line 491
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 492
    .line 493
    .line 494
    const/high16 v0, -0x3f000000    # -8.0f

    .line 495
    .line 496
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 497
    .line 498
    .line 499
    const v0, 0x41a2f5c3    # 20.37f

    .line 500
    .line 501
    .line 502
    const/high16 v2, 0x41500000    # 13.0f

    .line 503
    .line 504
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 505
    .line 506
    .line 507
    const v0, -0x3f90a3d7    # -3.74f

    .line 508
    .line 509
    .line 510
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 511
    .line 512
    .line 513
    const v0, 0x3fef5c29    # 1.87f

    .line 514
    .line 515
    .line 516
    const v2, -0x3f747ae1    # -4.36f

    .line 517
    .line 518
    .line 519
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 520
    .line 521
    .line 522
    const v0, 0x41a2f5c3    # 20.37f

    .line 523
    .line 524
    .line 525
    const/high16 v2, 0x41500000    # 13.0f

    .line 526
    .line 527
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 528
    .line 529
    .line 530
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 531
    .line 532
    .line 533
    const v0, 0x40ebd70a    # 7.37f

    .line 534
    .line 535
    .line 536
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 537
    .line 538
    .line 539
    const v0, 0x406851ec    # 3.63f

    .line 540
    .line 541
    .line 542
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 543
    .line 544
    .line 545
    const/high16 v0, 0x40b00000    # 5.5f

    .line 546
    .line 547
    const v2, 0x410a3d71    # 8.64f

    .line 548
    .line 549
    .line 550
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 551
    .line 552
    .line 553
    const v0, 0x40ebd70a    # 7.37f

    .line 554
    .line 555
    .line 556
    const/high16 v2, 0x41500000    # 13.0f

    .line 557
    .line 558
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 559
    .line 560
    .line 561
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 562
    .line 563
    .line 564
    const/high16 v0, 0x41400000    # 12.0f

    .line 565
    .line 566
    const/high16 v2, 0x40c00000    # 6.0f

    .line 567
    .line 568
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 569
    .line 570
    .line 571
    const/high16 v17, -0x40800000    # -1.0f

    .line 572
    .line 573
    const v13, -0x40f33333    # -0.55f

    .line 574
    .line 575
    .line 576
    const/high16 v15, -0x40800000    # -1.0f

    .line 577
    .line 578
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 579
    .line 580
    .line 581
    const/high16 v17, 0x3f800000    # 1.0f

    .line 582
    .line 583
    const/4 v13, 0x0

    .line 584
    const v14, -0x40f33333    # -0.55f

    .line 585
    .line 586
    .line 587
    const v15, 0x3ee66666    # 0.45f

    .line 588
    .line 589
    .line 590
    const/high16 v16, -0x40800000    # -1.0f

    .line 591
    .line 592
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 593
    .line 594
    .line 595
    const v0, 0x3ee66666    # 0.45f

    .line 596
    .line 597
    .line 598
    const/high16 v2, 0x3f800000    # 1.0f

    .line 599
    .line 600
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 601
    .line 602
    .line 603
    const/high16 v17, 0x41400000    # 12.0f

    .line 604
    .line 605
    const/high16 v18, 0x40c00000    # 6.0f

    .line 606
    .line 607
    const/high16 v13, 0x41500000    # 13.0f

    .line 608
    .line 609
    const v14, 0x40b1999a    # 5.55f

    .line 610
    .line 611
    .line 612
    const v15, 0x4148cccd    # 12.55f

    .line 613
    .line 614
    .line 615
    const/high16 v16, 0x40c00000    # 6.0f

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
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 624
    .line 625
    .line 626
    move-result-object v2

    .line 627
    const/16 v16, 0x3800

    .line 628
    .line 629
    const/16 v17, 0x0

    .line 630
    .line 631
    const/high16 v6, 0x3f800000    # 1.0f

    .line 632
    .line 633
    const/high16 v8, 0x3f800000    # 1.0f

    .line 634
    .line 635
    const/4 v7, 0x0

    .line 636
    const/high16 v9, 0x3f800000    # 1.0f

    .line 637
    .line 638
    const/high16 v12, 0x3f800000    # 1.0f

    .line 639
    .line 640
    const/4 v13, 0x0

    .line 641
    const/4 v14, 0x0

    .line 642
    const/4 v15, 0x0

    .line 643
    const-string v4, ""

    .line 644
    .line 645
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 646
    .line 647
    .line 648
    move-result-object v0

    .line 649
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 650
    .line 651
    .line 652
    move-result-object v0

    .line 653
    sput-object v0, Landroidx/compose/material/icons/rounded/BalanceKt;->_balance:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 654
    .line 655
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 656
    .line 657
    .line 658
    return-object v0
.end method
