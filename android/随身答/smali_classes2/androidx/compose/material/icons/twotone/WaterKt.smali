.class public final Landroidx/compose/material/icons/twotone/WaterKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_water",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "Water",
        "Landroidx/compose/material/icons/Icons$TwoTone;",
        "getWater",
        "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;",
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
        "SMAP\nWater.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Water.kt\nandroidx/compose/material/icons/twotone/WaterKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,89:1\n212#2,12:90\n233#2,18:103\n253#2:140\n174#3:102\n705#4,2:121\n717#4,2:123\n719#4,11:129\n72#5,4:125\n*S KotlinDebug\n*F\n+ 1 Water.kt\nandroidx/compose/material/icons/twotone/WaterKt\n*L\n29#1:90,12\n30#1:103,18\n30#1:140\n29#1:102\n30#1:121,2\n30#1:123,2\n30#1:129,11\n30#1:125,4\n*E\n"
    }
.end annotation


# static fields
.field private static _water:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getWater(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/WaterKt;->_water:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.Water"

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
    const/high16 v0, 0x41600000    # 14.0f

    .line 71
    .line 72
    const v2, 0x41afd70a    # 21.98f

    .line 73
    .line 74
    .line 75
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    const/high16 v0, 0x41b00000    # 22.0f

    .line 79
    .line 80
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 81
    .line 82
    .line 83
    const v0, 0x41afd70a    # 21.98f

    .line 84
    .line 85
    .line 86
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 87
    .line 88
    .line 89
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 90
    .line 91
    .line 92
    const/high16 v0, 0x41500000    # 13.0f

    .line 93
    .line 94
    const v2, 0x40ab3333    # 5.35f

    .line 95
    .line 96
    .line 97
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 98
    .line 99
    .line 100
    const v17, 0x40551eb8    # 3.33f

    .line 101
    .line 102
    .line 103
    const/high16 v18, 0x3f800000    # 1.0f

    .line 104
    .line 105
    const v13, 0x3f9851ec    # 1.19f

    .line 106
    .line 107
    .line 108
    const/4 v14, 0x0

    .line 109
    const v15, 0x3fb5c28f    # 1.42f

    .line 110
    .line 111
    .line 112
    const/high16 v16, 0x3f800000    # 1.0f

    .line 113
    .line 114
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 115
    .line 116
    .line 117
    const/high16 v18, -0x40800000    # -1.0f

    .line 118
    .line 119
    const v13, 0x3ff9999a    # 1.95f

    .line 120
    .line 121
    .line 122
    const v15, 0x4005c28f    # 2.09f

    .line 123
    .line 124
    .line 125
    const/high16 v16, -0x40800000    # -1.0f

    .line 126
    .line 127
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 128
    .line 129
    .line 130
    const/high16 v18, 0x3f800000    # 1.0f

    .line 131
    .line 132
    const v13, 0x3f9851ec    # 1.19f

    .line 133
    .line 134
    .line 135
    const v15, 0x3fb5c28f    # 1.42f

    .line 136
    .line 137
    .line 138
    const/high16 v16, 0x3f800000    # 1.0f

    .line 139
    .line 140
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 141
    .line 142
    .line 143
    const/high16 v18, -0x40800000    # -1.0f

    .line 144
    .line 145
    const v13, 0x3ff9999a    # 1.95f

    .line 146
    .line 147
    .line 148
    const v15, 0x4005c28f    # 2.09f

    .line 149
    .line 150
    .line 151
    const/high16 v16, -0x40800000    # -1.0f

    .line 152
    .line 153
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 154
    .line 155
    .line 156
    const v17, 0x4053d70a    # 3.31f

    .line 157
    .line 158
    .line 159
    const/high16 v18, 0x3f800000    # 1.0f

    .line 160
    .line 161
    const v13, 0x3f9851ec    # 1.19f

    .line 162
    .line 163
    .line 164
    const v15, 0x3fb33333    # 1.4f

    .line 165
    .line 166
    .line 167
    const v16, 0x3f7ae148    # 0.98f

    .line 168
    .line 169
    .line 170
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 171
    .line 172
    .line 173
    const/high16 v0, -0x40000000    # -2.0f

    .line 174
    .line 175
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 176
    .line 177
    .line 178
    const v17, -0x3faae148    # -3.33f

    .line 179
    .line 180
    .line 181
    const/high16 v18, -0x40800000    # -1.0f

    .line 182
    .line 183
    const v13, -0x4067ae14    # -1.19f

    .line 184
    .line 185
    .line 186
    const v15, -0x404a3d71    # -1.42f

    .line 187
    .line 188
    .line 189
    const/high16 v16, -0x40800000    # -1.0f

    .line 190
    .line 191
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 192
    .line 193
    .line 194
    const/high16 v18, 0x3f800000    # 1.0f

    .line 195
    .line 196
    const v13, -0x40066666    # -1.95f

    .line 197
    .line 198
    .line 199
    const v15, -0x3ffa3d71    # -2.09f

    .line 200
    .line 201
    .line 202
    const/high16 v16, 0x3f800000    # 1.0f

    .line 203
    .line 204
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 205
    .line 206
    .line 207
    const/high16 v18, -0x40800000    # -1.0f

    .line 208
    .line 209
    const v13, -0x4067ae14    # -1.19f

    .line 210
    .line 211
    .line 212
    const v15, -0x404a3d71    # -1.42f

    .line 213
    .line 214
    .line 215
    const/high16 v16, -0x40800000    # -1.0f

    .line 216
    .line 217
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 218
    .line 219
    .line 220
    const/high16 v18, 0x3f800000    # 1.0f

    .line 221
    .line 222
    const v13, -0x40066666    # -1.95f

    .line 223
    .line 224
    .line 225
    const v15, -0x3ffa3d71    # -2.09f

    .line 226
    .line 227
    .line 228
    const/high16 v16, 0x3f800000    # 1.0f

    .line 229
    .line 230
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 231
    .line 232
    .line 233
    const/high16 v18, -0x40800000    # -1.0f

    .line 234
    .line 235
    const v13, -0x4067ae14    # -1.19f

    .line 236
    .line 237
    .line 238
    const v15, -0x404a3d71    # -1.42f

    .line 239
    .line 240
    .line 241
    const/high16 v16, -0x40800000    # -1.0f

    .line 242
    .line 243
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 244
    .line 245
    .line 246
    const/high16 v17, 0x40000000    # 2.0f

    .line 247
    .line 248
    const/high16 v18, 0x41400000    # 12.0f

    .line 249
    .line 250
    const v13, 0x405851ec    # 3.38f

    .line 251
    .line 252
    .line 253
    const/high16 v14, 0x41300000    # 11.0f

    .line 254
    .line 255
    const v15, 0x404f5c29    # 3.24f

    .line 256
    .line 257
    .line 258
    const/high16 v16, 0x41400000    # 12.0f

    .line 259
    .line 260
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 261
    .line 262
    .line 263
    const/high16 v0, 0x40000000    # 2.0f

    .line 264
    .line 265
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 266
    .line 267
    .line 268
    const v17, 0x40ab3333    # 5.35f

    .line 269
    .line 270
    .line 271
    const/high16 v18, 0x41500000    # 13.0f

    .line 272
    .line 273
    const v13, 0x4079999a    # 3.9f

    .line 274
    .line 275
    .line 276
    const/high16 v14, 0x41600000    # 14.0f

    .line 277
    .line 278
    const v15, 0x408570a4    # 4.17f

    .line 279
    .line 280
    .line 281
    const/high16 v16, 0x41500000    # 13.0f

    .line 282
    .line 283
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 284
    .line 285
    .line 286
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 287
    .line 288
    .line 289
    const v0, 0x41955c29    # 18.67f

    .line 290
    .line 291
    .line 292
    const/high16 v2, 0x41700000    # 15.0f

    .line 293
    .line 294
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 295
    .line 296
    .line 297
    const v17, -0x3faae148    # -3.33f

    .line 298
    .line 299
    .line 300
    const/high16 v18, 0x3f800000    # 1.0f

    .line 301
    .line 302
    const v13, -0x40066666    # -1.95f

    .line 303
    .line 304
    .line 305
    const/4 v14, 0x0

    .line 306
    const v15, -0x3ffa3d71    # -2.09f

    .line 307
    .line 308
    .line 309
    const/high16 v16, 0x3f800000    # 1.0f

    .line 310
    .line 311
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 312
    .line 313
    .line 314
    const/high16 v18, -0x40800000    # -1.0f

    .line 315
    .line 316
    const v13, -0x4067ae14    # -1.19f

    .line 317
    .line 318
    .line 319
    const v15, -0x404a3d71    # -1.42f

    .line 320
    .line 321
    .line 322
    const/high16 v16, -0x40800000    # -1.0f

    .line 323
    .line 324
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 325
    .line 326
    .line 327
    const v17, -0x3faa3d71    # -3.34f

    .line 328
    .line 329
    .line 330
    const/high16 v18, 0x3f800000    # 1.0f

    .line 331
    .line 332
    const v13, -0x40066666    # -1.95f

    .line 333
    .line 334
    .line 335
    const v15, -0x3ff9999a    # -2.1f

    .line 336
    .line 337
    .line 338
    const/high16 v16, 0x3f800000    # 1.0f

    .line 339
    .line 340
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 341
    .line 342
    .line 343
    const v17, -0x3faae148    # -3.33f

    .line 344
    .line 345
    .line 346
    const/high16 v18, -0x40800000    # -1.0f

    .line 347
    .line 348
    const v13, -0x406147ae    # -1.24f

    .line 349
    .line 350
    .line 351
    const v15, -0x404f5c29    # -1.38f

    .line 352
    .line 353
    .line 354
    const/high16 v16, -0x40800000    # -1.0f

    .line 355
    .line 356
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 357
    .line 358
    .line 359
    const v17, -0x3faa3d71    # -3.34f

    .line 360
    .line 361
    .line 362
    const/high16 v18, 0x3f800000    # 1.0f

    .line 363
    .line 364
    const v13, -0x40066666    # -1.95f

    .line 365
    .line 366
    .line 367
    const v15, -0x3ff9999a    # -2.1f

    .line 368
    .line 369
    .line 370
    const/high16 v16, 0x3f800000    # 1.0f

    .line 371
    .line 372
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 373
    .line 374
    .line 375
    const/high16 v0, 0x40000000    # 2.0f

    .line 376
    .line 377
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 378
    .line 379
    .line 380
    const v17, 0x4055c28f    # 3.34f

    .line 381
    .line 382
    .line 383
    const/high16 v18, -0x40800000    # -1.0f

    .line 384
    .line 385
    const v13, 0x3ff9999a    # 1.95f

    .line 386
    .line 387
    .line 388
    const v15, 0x40070a3d    # 2.11f

    .line 389
    .line 390
    .line 391
    const/high16 v16, -0x40800000    # -1.0f

    .line 392
    .line 393
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 394
    .line 395
    .line 396
    const v17, 0x40551eb8    # 3.33f

    .line 397
    .line 398
    .line 399
    const/high16 v18, 0x3f800000    # 1.0f

    .line 400
    .line 401
    const v13, 0x3f9eb852    # 1.24f

    .line 402
    .line 403
    .line 404
    const v15, 0x3fb0a3d7    # 1.38f

    .line 405
    .line 406
    .line 407
    const/high16 v16, 0x3f800000    # 1.0f

    .line 408
    .line 409
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 410
    .line 411
    .line 412
    const v17, 0x4055c28f    # 3.34f

    .line 413
    .line 414
    .line 415
    const/high16 v18, -0x40800000    # -1.0f

    .line 416
    .line 417
    const v13, 0x3ff9999a    # 1.95f

    .line 418
    .line 419
    .line 420
    const v15, 0x40066666    # 2.1f

    .line 421
    .line 422
    .line 423
    const/high16 v16, -0x40800000    # -1.0f

    .line 424
    .line 425
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 426
    .line 427
    .line 428
    const v17, 0x40551eb8    # 3.33f

    .line 429
    .line 430
    .line 431
    const/high16 v18, 0x3f800000    # 1.0f

    .line 432
    .line 433
    const v13, 0x3f9851ec    # 1.19f

    .line 434
    .line 435
    .line 436
    const v15, 0x3fb5c28f    # 1.42f

    .line 437
    .line 438
    .line 439
    const/high16 v16, 0x3f800000    # 1.0f

    .line 440
    .line 441
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 442
    .line 443
    .line 444
    const/high16 v18, -0x40800000    # -1.0f

    .line 445
    .line 446
    const v13, 0x3ff851ec    # 1.94f

    .line 447
    .line 448
    .line 449
    const v15, 0x4005c28f    # 2.09f

    .line 450
    .line 451
    .line 452
    const/high16 v16, -0x40800000    # -1.0f

    .line 453
    .line 454
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 455
    .line 456
    .line 457
    const/high16 v18, 0x3f800000    # 1.0f

    .line 458
    .line 459
    const v13, 0x3f9851ec    # 1.19f

    .line 460
    .line 461
    .line 462
    const v15, 0x3fb5c28f    # 1.42f

    .line 463
    .line 464
    .line 465
    const/high16 v16, 0x3f800000    # 1.0f

    .line 466
    .line 467
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 468
    .line 469
    .line 470
    const/high16 v0, -0x40000000    # -2.0f

    .line 471
    .line 472
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 473
    .line 474
    .line 475
    const v17, 0x41955c29    # 18.67f

    .line 476
    .line 477
    .line 478
    const/high16 v18, 0x41700000    # 15.0f

    .line 479
    .line 480
    const v13, 0x41a6147b    # 20.76f

    .line 481
    .line 482
    .line 483
    const/high16 v14, 0x41800000    # 16.0f

    .line 484
    .line 485
    const v15, 0x41a4f5c3    # 20.62f

    .line 486
    .line 487
    .line 488
    const/high16 v16, 0x41700000    # 15.0f

    .line 489
    .line 490
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 491
    .line 492
    .line 493
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 494
    .line 495
    .line 496
    const/high16 v0, 0x41100000    # 9.0f

    .line 497
    .line 498
    const v2, 0x40ab3333    # 5.35f

    .line 499
    .line 500
    .line 501
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 502
    .line 503
    .line 504
    const v17, 0x40551eb8    # 3.33f

    .line 505
    .line 506
    .line 507
    const/high16 v18, 0x3f800000    # 1.0f

    .line 508
    .line 509
    const v13, 0x3f9851ec    # 1.19f

    .line 510
    .line 511
    .line 512
    const/4 v14, 0x0

    .line 513
    const v15, 0x3fb5c28f    # 1.42f

    .line 514
    .line 515
    .line 516
    const/high16 v16, 0x3f800000    # 1.0f

    .line 517
    .line 518
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 519
    .line 520
    .line 521
    const/high16 v18, -0x40800000    # -1.0f

    .line 522
    .line 523
    const v13, 0x3ff9999a    # 1.95f

    .line 524
    .line 525
    .line 526
    const v15, 0x4005c28f    # 2.09f

    .line 527
    .line 528
    .line 529
    const/high16 v16, -0x40800000    # -1.0f

    .line 530
    .line 531
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 532
    .line 533
    .line 534
    const/high16 v18, 0x3f800000    # 1.0f

    .line 535
    .line 536
    const v13, 0x3f9851ec    # 1.19f

    .line 537
    .line 538
    .line 539
    const v15, 0x3fb5c28f    # 1.42f

    .line 540
    .line 541
    .line 542
    const/high16 v16, 0x3f800000    # 1.0f

    .line 543
    .line 544
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 545
    .line 546
    .line 547
    const/high16 v18, -0x40800000    # -1.0f

    .line 548
    .line 549
    const v13, 0x3ff9999a    # 1.95f

    .line 550
    .line 551
    .line 552
    const v15, 0x4005c28f    # 2.09f

    .line 553
    .line 554
    .line 555
    const/high16 v16, -0x40800000    # -1.0f

    .line 556
    .line 557
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 558
    .line 559
    .line 560
    const v17, 0x4053d70a    # 3.31f

    .line 561
    .line 562
    .line 563
    const/high16 v18, 0x3f800000    # 1.0f

    .line 564
    .line 565
    const v13, 0x3f9851ec    # 1.19f

    .line 566
    .line 567
    .line 568
    const v15, 0x3fb33333    # 1.4f

    .line 569
    .line 570
    .line 571
    const v16, 0x3f7ae148    # 0.98f

    .line 572
    .line 573
    .line 574
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 575
    .line 576
    .line 577
    const/high16 v0, 0x41000000    # 8.0f

    .line 578
    .line 579
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 580
    .line 581
    .line 582
    const v17, -0x3faae148    # -3.33f

    .line 583
    .line 584
    .line 585
    const/high16 v18, -0x40800000    # -1.0f

    .line 586
    .line 587
    const v13, -0x4067ae14    # -1.19f

    .line 588
    .line 589
    .line 590
    const v15, -0x404a3d71    # -1.42f

    .line 591
    .line 592
    .line 593
    const/high16 v16, -0x40800000    # -1.0f

    .line 594
    .line 595
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 596
    .line 597
    .line 598
    const/high16 v18, 0x3f800000    # 1.0f

    .line 599
    .line 600
    const v13, -0x40066666    # -1.95f

    .line 601
    .line 602
    .line 603
    const v15, -0x3ffa3d71    # -2.09f

    .line 604
    .line 605
    .line 606
    const/high16 v16, 0x3f800000    # 1.0f

    .line 607
    .line 608
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 609
    .line 610
    .line 611
    const/high16 v18, -0x40800000    # -1.0f

    .line 612
    .line 613
    const v13, -0x4067ae14    # -1.19f

    .line 614
    .line 615
    .line 616
    const v15, -0x404a3d71    # -1.42f

    .line 617
    .line 618
    .line 619
    const/high16 v16, -0x40800000    # -1.0f

    .line 620
    .line 621
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 622
    .line 623
    .line 624
    const v17, 0x410a8f5c    # 8.66f

    .line 625
    .line 626
    .line 627
    const/high16 v18, 0x41000000    # 8.0f

    .line 628
    .line 629
    const v13, 0x4120a3d7    # 10.04f

    .line 630
    .line 631
    .line 632
    const/high16 v14, 0x40e00000    # 7.0f

    .line 633
    .line 634
    const v15, 0x411e6666    # 9.9f

    .line 635
    .line 636
    .line 637
    const/high16 v16, 0x41000000    # 8.0f

    .line 638
    .line 639
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 640
    .line 641
    .line 642
    const v17, 0x40aa8f5c    # 5.33f

    .line 643
    .line 644
    .line 645
    const/high16 v18, 0x40e00000    # 7.0f

    .line 646
    .line 647
    const v13, 0x40ef0a3d    # 7.47f

    .line 648
    .line 649
    .line 650
    const/high16 v14, 0x41000000    # 8.0f

    .line 651
    .line 652
    const v15, 0x40e7ae14    # 7.24f

    .line 653
    .line 654
    .line 655
    const/high16 v16, 0x40e00000    # 7.0f

    .line 656
    .line 657
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 658
    .line 659
    .line 660
    const/high16 v17, 0x40000000    # 2.0f

    .line 661
    .line 662
    const/high16 v18, 0x41000000    # 8.0f

    .line 663
    .line 664
    const v13, 0x405851ec    # 3.38f

    .line 665
    .line 666
    .line 667
    const/high16 v14, 0x40e00000    # 7.0f

    .line 668
    .line 669
    const v15, 0x404f5c29    # 3.24f

    .line 670
    .line 671
    .line 672
    const/high16 v16, 0x41000000    # 8.0f

    .line 673
    .line 674
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 675
    .line 676
    .line 677
    const/high16 v0, 0x40000000    # 2.0f

    .line 678
    .line 679
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 680
    .line 681
    .line 682
    const v17, 0x40ab3333    # 5.35f

    .line 683
    .line 684
    .line 685
    const/high16 v18, 0x41100000    # 9.0f

    .line 686
    .line 687
    const v13, 0x4079999a    # 3.9f

    .line 688
    .line 689
    .line 690
    const/high16 v14, 0x41200000    # 10.0f

    .line 691
    .line 692
    const v15, 0x408570a4    # 4.17f

    .line 693
    .line 694
    .line 695
    const/high16 v16, 0x41100000    # 9.0f

    .line 696
    .line 697
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 698
    .line 699
    .line 700
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 701
    .line 702
    .line 703
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 704
    .line 705
    .line 706
    move-result-object v2

    .line 707
    const/16 v16, 0x3800

    .line 708
    .line 709
    const/16 v17, 0x0

    .line 710
    .line 711
    const/high16 v6, 0x3f800000    # 1.0f

    .line 712
    .line 713
    const/high16 v8, 0x3f800000    # 1.0f

    .line 714
    .line 715
    const/4 v7, 0x0

    .line 716
    const/high16 v9, 0x3f800000    # 1.0f

    .line 717
    .line 718
    const/high16 v12, 0x3f800000    # 1.0f

    .line 719
    .line 720
    const/4 v13, 0x0

    .line 721
    const/4 v14, 0x0

    .line 722
    const/4 v15, 0x0

    .line 723
    const-string v4, ""

    .line 724
    .line 725
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 726
    .line 727
    .line 728
    move-result-object v0

    .line 729
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 730
    .line 731
    .line 732
    move-result-object v0

    .line 733
    sput-object v0, Landroidx/compose/material/icons/twotone/WaterKt;->_water:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 734
    .line 735
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 736
    .line 737
    .line 738
    return-object v0
.end method
