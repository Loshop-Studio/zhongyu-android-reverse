.class public final Landroidx/compose/material/icons/filled/StyleKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_style",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "Style",
        "Landroidx/compose/material/icons/Icons$Filled;",
        "getStyle",
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
        "SMAP\nStyle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Style.kt\nandroidx/compose/material/icons/filled/StyleKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,68:1\n212#2,12:69\n233#2,18:82\n253#2:119\n174#3:81\n705#4,2:100\n717#4,2:102\n719#4,11:108\n72#5,4:104\n*S KotlinDebug\n*F\n+ 1 Style.kt\nandroidx/compose/material/icons/filled/StyleKt\n*L\n29#1:69,12\n30#1:82,18\n30#1:119\n29#1:81\n30#1:100,2\n30#1:102,2\n30#1:108,11\n30#1:104,4\n*E\n"
    }
.end annotation


# static fields
.field private static _style:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getStyle(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/filled/StyleKt;->_style:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Filled.Style"

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
    const v0, 0x4021eb85    # 2.53f

    .line 71
    .line 72
    .line 73
    const v2, 0x419d3333    # 19.65f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v0, 0x3fab851f    # 1.34f

    .line 80
    .line 81
    .line 82
    const v2, 0x3f0f5c29    # 0.56f

    .line 83
    .line 84
    .line 85
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 86
    .line 87
    .line 88
    const v0, -0x3eef851f    # -9.03f

    .line 89
    .line 90
    .line 91
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 92
    .line 93
    .line 94
    const v0, -0x3fe47ae1    # -2.43f

    .line 95
    .line 96
    .line 97
    const v2, 0x40bb851f    # 5.86f

    .line 98
    .line 99
    .line 100
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 101
    .line 102
    .line 103
    const v17, 0x3f8b851f    # 1.09f

    .line 104
    .line 105
    .line 106
    const v18, 0x40270a3d    # 2.61f

    .line 107
    .line 108
    .line 109
    const v13, -0x412e147b    # -0.41f

    .line 110
    .line 111
    .line 112
    const v14, 0x3f828f5c    # 1.02f

    .line 113
    .line 114
    .line 115
    const v15, 0x3da3d70a    # 0.08f

    .line 116
    .line 117
    .line 118
    const v16, 0x400c28f6    # 2.19f

    .line 119
    .line 120
    .line 121
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 122
    .line 123
    .line 124
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 125
    .line 126
    .line 127
    const v0, 0x41b03d71    # 22.03f

    .line 128
    .line 129
    .line 130
    const v2, 0x417f3333    # 15.95f

    .line 131
    .line 132
    .line 133
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 134
    .line 135
    .line 136
    const v0, 0x41888f5c    # 17.07f

    .line 137
    .line 138
    .line 139
    const v2, 0x407eb852    # 3.98f

    .line 140
    .line 141
    .line 142
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 143
    .line 144
    .line 145
    const v17, -0x401851ec    # -1.81f

    .line 146
    .line 147
    .line 148
    const v18, -0x40628f5c    # -1.23f

    .line 149
    .line 150
    .line 151
    const v13, -0x416147ae    # -0.31f

    .line 152
    .line 153
    .line 154
    const/high16 v14, -0x40c00000    # -0.75f

    .line 155
    .line 156
    const v15, -0x407ae148    # -1.04f

    .line 157
    .line 158
    .line 159
    const v16, -0x40651eb8    # -1.21f

    .line 160
    .line 161
    .line 162
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 163
    .line 164
    .line 165
    const v17, -0x40b5c28f    # -0.79f

    .line 166
    .line 167
    .line 168
    const v18, 0x3e19999a    # 0.15f

    .line 169
    .line 170
    .line 171
    const v13, -0x417ae148    # -0.26f

    .line 172
    .line 173
    .line 174
    const/4 v14, 0x0

    .line 175
    const v15, -0x40f851ec    # -0.53f

    .line 176
    .line 177
    .line 178
    const v16, 0x3d23d70a    # 0.04f

    .line 179
    .line 180
    .line 181
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 182
    .line 183
    .line 184
    const v0, 0x40e33333    # 7.1f

    .line 185
    .line 186
    .line 187
    const v2, 0x40be6666    # 5.95f

    .line 188
    .line 189
    .line 190
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 191
    .line 192
    .line 193
    const v17, -0x40628f5c    # -1.23f

    .line 194
    .line 195
    .line 196
    const v18, 0x3fe66666    # 1.8f

    .line 197
    .line 198
    .line 199
    const/high16 v13, -0x40c00000    # -0.75f

    .line 200
    .line 201
    const v14, 0x3e9eb852    # 0.31f

    .line 202
    .line 203
    .line 204
    const v15, -0x40651eb8    # -1.21f

    .line 205
    .line 206
    .line 207
    const v16, 0x3f83d70a    # 1.03f

    .line 208
    .line 209
    .line 210
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 211
    .line 212
    .line 213
    const v17, 0x3e19999a    # 0.15f

    .line 214
    .line 215
    .line 216
    const v18, 0x3f4ccccd    # 0.8f

    .line 217
    .line 218
    .line 219
    const v13, -0x43dc28f6    # -0.01f

    .line 220
    .line 221
    .line 222
    const v14, 0x3e8a3d71    # 0.27f

    .line 223
    .line 224
    .line 225
    const v15, 0x3d23d70a    # 0.04f

    .line 226
    .line 227
    .line 228
    const v16, 0x3f0a3d71    # 0.54f

    .line 229
    .line 230
    .line 231
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 232
    .line 233
    .line 234
    const v0, 0x409eb852    # 4.96f

    .line 235
    .line 236
    .line 237
    const v2, 0x413f851f    # 11.97f

    .line 238
    .line 239
    .line 240
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 241
    .line 242
    .line 243
    const v17, 0x3fea3d71    # 1.83f

    .line 244
    .line 245
    .line 246
    const v18, 0x3f9d70a4    # 1.23f

    .line 247
    .line 248
    .line 249
    const v13, 0x3e9eb852    # 0.31f

    .line 250
    .line 251
    .line 252
    const v14, 0x3f428f5c    # 0.76f

    .line 253
    .line 254
    .line 255
    const v15, 0x3f866666    # 1.05f

    .line 256
    .line 257
    .line 258
    const v16, 0x3f9c28f6    # 1.22f

    .line 259
    .line 260
    .line 261
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 262
    .line 263
    .line 264
    const v17, 0x3f451eb8    # 0.77f

    .line 265
    .line 266
    .line 267
    const v18, -0x41e66666    # -0.15f

    .line 268
    .line 269
    .line 270
    const v13, 0x3e851eb8    # 0.26f

    .line 271
    .line 272
    .line 273
    const/4 v14, 0x0

    .line 274
    const v15, 0x3f051eb8    # 0.52f

    .line 275
    .line 276
    .line 277
    const v16, -0x42b33333    # -0.05f

    .line 278
    .line 279
    .line 280
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 281
    .line 282
    .line 283
    const v0, 0x40eb851f    # 7.36f

    .line 284
    .line 285
    .line 286
    const v2, -0x3fbccccd    # -3.05f

    .line 287
    .line 288
    .line 289
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 290
    .line 291
    .line 292
    const v17, 0x3f8b851f    # 1.09f

    .line 293
    .line 294
    .line 295
    const v18, -0x3fd9999a    # -2.6f

    .line 296
    .line 297
    .line 298
    const v13, 0x3f828f5c    # 1.02f

    .line 299
    .line 300
    .line 301
    const v14, -0x4128f5c3    # -0.42f

    .line 302
    .line 303
    .line 304
    const v15, 0x3fc147ae    # 1.51f

    .line 305
    .line 306
    .line 307
    const v16, -0x40347ae1    # -1.59f

    .line 308
    .line 309
    .line 310
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 311
    .line 312
    .line 313
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 314
    .line 315
    .line 316
    const v0, 0x40fc28f6    # 7.88f

    .line 317
    .line 318
    .line 319
    const/high16 v2, 0x410c0000    # 8.75f

    .line 320
    .line 321
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 322
    .line 323
    .line 324
    const/high16 v17, -0x40800000    # -1.0f

    .line 325
    .line 326
    const/high16 v18, -0x40800000    # -1.0f

    .line 327
    .line 328
    const v13, -0x40f33333    # -0.55f

    .line 329
    .line 330
    .line 331
    const/4 v14, 0x0

    .line 332
    const/high16 v15, -0x40800000    # -1.0f

    .line 333
    .line 334
    const v16, -0x4119999a    # -0.45f

    .line 335
    .line 336
    .line 337
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 338
    .line 339
    .line 340
    const v0, 0x3ee66666    # 0.45f

    .line 341
    .line 342
    .line 343
    const/high16 v2, -0x40800000    # -1.0f

    .line 344
    .line 345
    const/high16 v4, 0x3f800000    # 1.0f

    .line 346
    .line 347
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 348
    .line 349
    .line 350
    const/high16 v2, 0x3f800000    # 1.0f

    .line 351
    .line 352
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 353
    .line 354
    .line 355
    const v0, -0x4119999a    # -0.45f

    .line 356
    .line 357
    .line 358
    const/high16 v2, -0x40800000    # -1.0f

    .line 359
    .line 360
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 361
    .line 362
    .line 363
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 364
    .line 365
    .line 366
    const v0, 0x40bc28f6    # 5.88f

    .line 367
    .line 368
    .line 369
    const/high16 v2, 0x419e0000    # 19.75f

    .line 370
    .line 371
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 372
    .line 373
    .line 374
    const/high16 v17, 0x40000000    # 2.0f

    .line 375
    .line 376
    const/high16 v18, 0x40000000    # 2.0f

    .line 377
    .line 378
    const/4 v13, 0x0

    .line 379
    const v14, 0x3f8ccccd    # 1.1f

    .line 380
    .line 381
    .line 382
    const v15, 0x3f666666    # 0.9f

    .line 383
    .line 384
    .line 385
    const/high16 v16, 0x40000000    # 2.0f

    .line 386
    .line 387
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 388
    .line 389
    .line 390
    const v0, 0x3fb9999a    # 1.45f

    .line 391
    .line 392
    .line 393
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 394
    .line 395
    .line 396
    const v0, -0x3fa33333    # -3.45f

    .line 397
    .line 398
    .line 399
    const v2, -0x3efa8f5c    # -8.34f

    .line 400
    .line 401
    .line 402
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 403
    .line 404
    .line 405
    const v0, 0x40cae148    # 6.34f

    .line 406
    .line 407
    .line 408
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 409
    .line 410
    .line 411
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 412
    .line 413
    .line 414
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 415
    .line 416
    .line 417
    move-result-object v2

    .line 418
    const/16 v16, 0x3800

    .line 419
    .line 420
    const/16 v17, 0x0

    .line 421
    .line 422
    const/high16 v6, 0x3f800000    # 1.0f

    .line 423
    .line 424
    const/high16 v8, 0x3f800000    # 1.0f

    .line 425
    .line 426
    const/4 v7, 0x0

    .line 427
    const/high16 v9, 0x3f800000    # 1.0f

    .line 428
    .line 429
    const/high16 v12, 0x3f800000    # 1.0f

    .line 430
    .line 431
    const/4 v14, 0x0

    .line 432
    const/4 v15, 0x0

    .line 433
    const-string v4, ""

    .line 434
    .line 435
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 436
    .line 437
    .line 438
    move-result-object v0

    .line 439
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 440
    .line 441
    .line 442
    move-result-object v0

    .line 443
    sput-object v0, Landroidx/compose/material/icons/filled/StyleKt;->_style:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 444
    .line 445
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 446
    .line 447
    .line 448
    return-object v0
.end method
