.class public final Landroidx/compose/material/icons/twotone/SickKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_sick",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "Sick",
        "Landroidx/compose/material/icons/Icons$TwoTone;",
        "getSick",
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
        "SMAP\nSick.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sick.kt\nandroidx/compose/material/icons/twotone/SickKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,98:1\n212#2,12:99\n233#2,18:112\n253#2:149\n174#3:111\n705#4,2:130\n717#4,2:132\n719#4,11:138\n72#5,4:134\n*S KotlinDebug\n*F\n+ 1 Sick.kt\nandroidx/compose/material/icons/twotone/SickKt\n*L\n29#1:99,12\n30#1:112,18\n30#1:149\n29#1:111\n30#1:130,2\n30#1:132,2\n30#1:138,11\n30#1:134,4\n*E\n"
    }
.end annotation


# static fields
.field private static _sick:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getSick(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/SickKt;->_sick:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.Sick"

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
    const v0, 0x4128f5c3    # 10.56f

    .line 71
    .line 72
    .line 73
    const v2, 0x40ea3d71    # 7.32f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v0, 0x4106147b    # 8.38f

    .line 80
    .line 81
    .line 82
    const/high16 v2, 0x41180000    # 9.5f

    .line 83
    .line 84
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 85
    .line 86
    .line 87
    const v0, 0x41070a3d    # 8.44f

    .line 88
    .line 89
    .line 90
    const v2, 0x40ea3d71    # 7.32f

    .line 91
    .line 92
    .line 93
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 94
    .line 95
    .line 96
    const v0, -0x407851ec    # -1.06f

    .line 97
    .line 98
    .line 99
    const v2, 0x3f87ae14    # 1.06f

    .line 100
    .line 101
    .line 102
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 103
    .line 104
    .line 105
    const/high16 v0, 0x41280000    # 10.5f

    .line 106
    .line 107
    const/high16 v2, 0x41180000    # 9.5f

    .line 108
    .line 109
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 110
    .line 111
    .line 112
    const v0, -0x3ff851ec    # -2.12f

    .line 113
    .line 114
    .line 115
    const v2, 0x4007ae14    # 2.12f

    .line 116
    .line 117
    .line 118
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 119
    .line 120
    .line 121
    const v0, 0x4128f5c3    # 10.56f

    .line 122
    .line 123
    .line 124
    const v2, 0x40ea3d71    # 7.32f

    .line 125
    .line 126
    .line 127
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 128
    .line 129
    .line 130
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 131
    .line 132
    .line 133
    const/high16 v0, 0x40900000    # 4.5f

    .line 134
    .line 135
    const/high16 v2, 0x41100000    # 9.0f

    .line 136
    .line 137
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 138
    .line 139
    .line 140
    const v17, 0x3da3d70a    # 0.08f

    .line 141
    .line 142
    .line 143
    const v18, 0x3c23d70a    # 0.01f

    .line 144
    .line 145
    .line 146
    const v13, 0x3cf5c28f    # 0.03f

    .line 147
    .line 148
    .line 149
    const/4 v14, 0x0

    .line 150
    const v15, 0x3d4ccccd    # 0.05f

    .line 151
    .line 152
    .line 153
    const v16, 0x3c23d70a    # 0.01f

    .line 154
    .line 155
    .line 156
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 157
    .line 158
    .line 159
    const/high16 v17, 0x41400000    # 12.0f

    .line 160
    .line 161
    const/high16 v18, 0x40800000    # 4.0f

    .line 162
    .line 163
    const v13, 0x40b8a3d7    # 5.77f

    .line 164
    .line 165
    .line 166
    const v14, 0x40c23d71    # 6.07f

    .line 167
    .line 168
    .line 169
    const v15, 0x410a3d71    # 8.64f

    .line 170
    .line 171
    .line 172
    const/high16 v16, 0x40800000    # 4.0f

    .line 173
    .line 174
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 175
    .line 176
    .line 177
    const v17, 0x40b3851f    # 5.61f

    .line 178
    .line 179
    .line 180
    const v18, 0x40133333    # 2.3f

    .line 181
    .line 182
    .line 183
    const v13, 0x400c28f6    # 2.19f

    .line 184
    .line 185
    .line 186
    const/4 v14, 0x0

    .line 187
    const v15, 0x40851eb8    # 4.16f

    .line 188
    .line 189
    .line 190
    const v16, 0x3f6147ae    # 0.88f

    .line 191
    .line 192
    .line 193
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 194
    .line 195
    .line 196
    const v17, 0x3f4f5c29    # 0.81f

    .line 197
    .line 198
    .line 199
    const v18, -0x40051eb8    # -1.96f

    .line 200
    .line 201
    .line 202
    const v13, 0x3e19999a    # 0.15f

    .line 203
    .line 204
    .line 205
    const v14, -0x40e66666    # -0.6f

    .line 206
    .line 207
    .line 208
    const v15, 0x3ee66666    # 0.45f

    .line 209
    .line 210
    .line 211
    const v16, -0x405ae148    # -1.29f

    .line 212
    .line 213
    .line 214
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 215
    .line 216
    .line 217
    const v17, 0x413fd70a    # 11.99f

    .line 218
    .line 219
    .line 220
    const/high16 v18, 0x40000000    # 2.0f

    .line 221
    .line 222
    const v13, 0x418570a4    # 16.68f

    .line 223
    .line 224
    .line 225
    const v14, 0x403851ec    # 2.88f

    .line 226
    .line 227
    .line 228
    const v15, 0x41670a3d    # 14.44f

    .line 229
    .line 230
    .line 231
    const/high16 v16, 0x40000000    # 2.0f

    .line 232
    .line 233
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 234
    .line 235
    .line 236
    const v17, -0x3ee30a3d    # -9.81f

    .line 237
    .line 238
    .line 239
    const v18, 0x41023d71    # 8.14f

    .line 240
    .line 241
    .line 242
    const v13, -0x3f63d70a    # -4.88f

    .line 243
    .line 244
    .line 245
    const/4 v14, 0x0

    .line 246
    const v15, -0x3ef0f5c3    # -8.94f

    .line 247
    .line 248
    .line 249
    const v16, 0x4060a3d7    # 3.51f

    .line 250
    .line 251
    .line 252
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 253
    .line 254
    .line 255
    const/high16 v17, 0x40900000    # 4.5f

    .line 256
    .line 257
    const/high16 v18, 0x41100000    # 9.0f

    .line 258
    .line 259
    const v13, 0x402f5c29    # 2.74f

    .line 260
    .line 261
    .line 262
    const v14, 0x41170a3d    # 9.44f

    .line 263
    .line 264
    .line 265
    const v15, 0x4065c28f    # 3.59f

    .line 266
    .line 267
    .line 268
    const/high16 v16, 0x41100000    # 9.0f

    .line 269
    .line 270
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 271
    .line 272
    .line 273
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 274
    .line 275
    .line 276
    const/high16 v0, 0x41a80000    # 21.0f

    .line 277
    .line 278
    const/high16 v2, 0x41280000    # 10.5f

    .line 279
    .line 280
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 281
    .line 282
    .line 283
    const v17, -0x4067ae14    # -1.19f

    .line 284
    .line 285
    .line 286
    const v18, -0x419eb852    # -0.22f

    .line 287
    .line 288
    .line 289
    const v13, -0x4128f5c3    # -0.42f

    .line 290
    .line 291
    .line 292
    const/4 v14, 0x0

    .line 293
    const v15, -0x40ae147b    # -0.82f

    .line 294
    .line 295
    .line 296
    const v16, -0x4247ae14    # -0.09f

    .line 297
    .line 298
    .line 299
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 300
    .line 301
    .line 302
    const/high16 v17, 0x41a00000    # 20.0f

    .line 303
    .line 304
    const/high16 v18, 0x41400000    # 12.0f

    .line 305
    .line 306
    const v13, 0x419f70a4    # 19.93f

    .line 307
    .line 308
    .line 309
    const v14, 0x412d47ae    # 10.83f

    .line 310
    .line 311
    .line 312
    const/high16 v15, 0x41a00000    # 20.0f

    .line 313
    .line 314
    const v16, 0x41368f5c    # 11.41f

    .line 315
    .line 316
    .line 317
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 318
    .line 319
    .line 320
    const/high16 v17, -0x3f000000    # -8.0f

    .line 321
    .line 322
    const/high16 v18, 0x41000000    # 8.0f

    .line 323
    .line 324
    const/4 v13, 0x0

    .line 325
    const v14, 0x408d70a4    # 4.42f

    .line 326
    .line 327
    .line 328
    const v15, -0x3f9ae148    # -3.58f

    .line 329
    .line 330
    .line 331
    const/high16 v16, 0x41000000    # 8.0f

    .line 332
    .line 333
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 334
    .line 335
    .line 336
    const v17, -0x3f128f5c    # -7.42f

    .line 337
    .line 338
    .line 339
    const v18, -0x3f5fae14    # -5.01f

    .line 340
    .line 341
    .line 342
    const v13, -0x3fa8f5c3    # -3.36f

    .line 343
    .line 344
    .line 345
    const/4 v14, 0x0

    .line 346
    const v15, -0x3f38a3d7    # -6.23f

    .line 347
    .line 348
    .line 349
    const v16, -0x3ffb851f    # -2.07f

    .line 350
    .line 351
    .line 352
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 353
    .line 354
    .line 355
    const/high16 v17, 0x40900000    # 4.5f

    .line 356
    .line 357
    const/high16 v18, 0x41700000    # 15.0f

    .line 358
    .line 359
    const v13, 0x4091999a    # 4.55f

    .line 360
    .line 361
    .line 362
    const v14, 0x416fd70a    # 14.99f

    .line 363
    .line 364
    .line 365
    const v15, 0x4090f5c3    # 4.53f

    .line 366
    .line 367
    .line 368
    const/high16 v16, 0x41700000    # 15.0f

    .line 369
    .line 370
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 371
    .line 372
    .line 373
    const/high16 v17, -0x40400000    # -1.5f

    .line 374
    .line 375
    const v18, -0x41333333    # -0.4f

    .line 376
    .line 377
    .line 378
    const v13, -0x40fae148    # -0.52f

    .line 379
    .line 380
    .line 381
    const/4 v14, 0x0

    .line 382
    const v15, -0x407ae148    # -1.04f

    .line 383
    .line 384
    .line 385
    const v16, -0x41f0a3d7    # -0.14f

    .line 386
    .line 387
    .line 388
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 389
    .line 390
    .line 391
    const v17, -0x40ae147b    # -0.82f

    .line 392
    .line 393
    .line 394
    const v18, -0x40cccccd    # -0.7f

    .line 395
    .line 396
    .line 397
    const v13, -0x415c28f6    # -0.32f

    .line 398
    .line 399
    .line 400
    const v14, -0x41c7ae14    # -0.18f

    .line 401
    .line 402
    .line 403
    const v15, -0x40e8f5c3    # -0.59f

    .line 404
    .line 405
    .line 406
    const v16, -0x4128f5c3    # -0.42f

    .line 407
    .line 408
    .line 409
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 410
    .line 411
    .line 412
    const v17, 0x411ccccd    # 9.8f

    .line 413
    .line 414
    .line 415
    const v18, 0x4101999a    # 8.1f

    .line 416
    .line 417
    .line 418
    const v13, 0x3f63d70a    # 0.89f

    .line 419
    .line 420
    .line 421
    const v14, 0x4093851f    # 4.61f

    .line 422
    .line 423
    .line 424
    const v15, 0x409dc28f    # 4.93f

    .line 425
    .line 426
    .line 427
    const v16, 0x4101999a    # 8.1f

    .line 428
    .line 429
    .line 430
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 431
    .line 432
    .line 433
    const/high16 v17, 0x41b00000    # 22.0f

    .line 434
    .line 435
    const/high16 v18, 0x41400000    # 12.0f

    .line 436
    .line 437
    const v13, 0x418c28f6    # 17.52f

    .line 438
    .line 439
    .line 440
    const/high16 v14, 0x41b00000    # 22.0f

    .line 441
    .line 442
    const/high16 v15, 0x41b00000    # 22.0f

    .line 443
    .line 444
    const v16, 0x418c28f6    # 17.52f

    .line 445
    .line 446
    .line 447
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 448
    .line 449
    .line 450
    const v17, -0x41f0a3d7    # -0.14f

    .line 451
    .line 452
    .line 453
    const v18, -0x4030a3d7    # -1.62f

    .line 454
    .line 455
    .line 456
    const/4 v13, 0x0

    .line 457
    const v14, -0x40f33333    # -0.55f

    .line 458
    .line 459
    .line 460
    const v15, -0x428a3d71    # -0.06f

    .line 461
    .line 462
    .line 463
    const v16, -0x40747ae1    # -1.09f

    .line 464
    .line 465
    .line 466
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 467
    .line 468
    .line 469
    const/high16 v17, 0x41a80000    # 21.0f

    .line 470
    .line 471
    const/high16 v18, 0x41280000    # 10.5f

    .line 472
    .line 473
    const v13, 0x41aca3d7    # 21.58f

    .line 474
    .line 475
    .line 476
    const v14, 0x41273333    # 10.45f

    .line 477
    .line 478
    .line 479
    const v15, 0x41aa6666    # 21.3f

    .line 480
    .line 481
    .line 482
    const/high16 v16, 0x41280000    # 10.5f

    .line 483
    .line 484
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 485
    .line 486
    .line 487
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 488
    .line 489
    .line 490
    const/high16 v0, 0x40400000    # 3.0f

    .line 491
    .line 492
    const/high16 v2, 0x41a80000    # 21.0f

    .line 493
    .line 494
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 495
    .line 496
    .line 497
    const/high16 v17, -0x40000000    # -2.0f

    .line 498
    .line 499
    const/high16 v18, 0x40800000    # 4.0f

    .line 500
    .line 501
    const/4 v13, 0x0

    .line 502
    const/4 v14, 0x0

    .line 503
    const/high16 v15, -0x40000000    # -2.0f

    .line 504
    .line 505
    const v16, 0x4039999a    # 2.9f

    .line 506
    .line 507
    .line 508
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 509
    .line 510
    .line 511
    const/high16 v17, 0x40000000    # 2.0f

    .line 512
    .line 513
    const/high16 v18, 0x40000000    # 2.0f

    .line 514
    .line 515
    const v14, 0x3f8ccccd    # 1.1f

    .line 516
    .line 517
    .line 518
    const v15, 0x3f666666    # 0.9f

    .line 519
    .line 520
    .line 521
    const/high16 v16, 0x40000000    # 2.0f

    .line 522
    .line 523
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 524
    .line 525
    .line 526
    const v0, -0x4099999a    # -0.9f

    .line 527
    .line 528
    .line 529
    const/high16 v2, -0x40000000    # -2.0f

    .line 530
    .line 531
    const/high16 v4, 0x40000000    # 2.0f

    .line 532
    .line 533
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 534
    .line 535
    .line 536
    const/high16 v17, 0x41a80000    # 21.0f

    .line 537
    .line 538
    const/high16 v18, 0x40400000    # 3.0f

    .line 539
    .line 540
    const/high16 v13, 0x41b80000    # 23.0f

    .line 541
    .line 542
    const v14, 0x40bccccd    # 5.9f

    .line 543
    .line 544
    .line 545
    const/high16 v15, 0x41a80000    # 21.0f

    .line 546
    .line 547
    const/high16 v16, 0x40400000    # 3.0f

    .line 548
    .line 549
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 550
    .line 551
    .line 552
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 553
    .line 554
    .line 555
    const v0, 0x40ec28f6    # 7.38f

    .line 556
    .line 557
    .line 558
    const v2, 0x4179eb85    # 15.62f

    .line 559
    .line 560
    .line 561
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 562
    .line 563
    .line 564
    const/high16 v0, 0x41580000    # 13.5f

    .line 565
    .line 566
    const/high16 v2, 0x41180000    # 9.5f

    .line 567
    .line 568
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 569
    .line 570
    .line 571
    const v0, 0x4007ae14    # 2.12f

    .line 572
    .line 573
    .line 574
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 575
    .line 576
    .line 577
    const v0, -0x407851ec    # -1.06f

    .line 578
    .line 579
    .line 580
    const v2, 0x3f87ae14    # 1.06f

    .line 581
    .line 582
    .line 583
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 584
    .line 585
    .line 586
    const v0, 0x4179eb85    # 15.62f

    .line 587
    .line 588
    .line 589
    const/high16 v2, 0x41180000    # 9.5f

    .line 590
    .line 591
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 592
    .line 593
    .line 594
    const v0, -0x407851ec    # -1.06f

    .line 595
    .line 596
    .line 597
    const v2, 0x3f87ae14    # 1.06f

    .line 598
    .line 599
    .line 600
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 601
    .line 602
    .line 603
    const v0, 0x40ec28f6    # 7.38f

    .line 604
    .line 605
    .line 606
    const v2, 0x4179eb85    # 15.62f

    .line 607
    .line 608
    .line 609
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 610
    .line 611
    .line 612
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 613
    .line 614
    .line 615
    const/high16 v0, 0x41880000    # 17.0f

    .line 616
    .line 617
    const v2, 0x4108f5c3    # 8.56f

    .line 618
    .line 619
    .line 620
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 621
    .line 622
    .line 623
    const v17, 0x405c28f6    # 3.44f

    .line 624
    .line 625
    .line 626
    const/high16 v18, -0x40000000    # -2.0f

    .line 627
    .line 628
    const v13, 0x3f30a3d7    # 0.69f

    .line 629
    .line 630
    .line 631
    const v14, -0x4067ae14    # -1.19f

    .line 632
    .line 633
    .line 634
    const v15, 0x3ffc28f6    # 1.97f

    .line 635
    .line 636
    .line 637
    const/high16 v16, -0x40000000    # -2.0f

    .line 638
    .line 639
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 640
    .line 641
    .line 642
    const v0, 0x3f4f5c29    # 0.81f

    .line 643
    .line 644
    .line 645
    const v2, 0x405c28f6    # 3.44f

    .line 646
    .line 647
    .line 648
    const/high16 v6, 0x40300000    # 2.75f

    .line 649
    .line 650
    invoke-virtual {v12, v6, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 651
    .line 652
    .line 653
    const v0, 0x3fd70a3d    # 1.68f

    .line 654
    .line 655
    .line 656
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 657
    .line 658
    .line 659
    const v17, -0x3f5c28f6    # -5.12f

    .line 660
    .line 661
    .line 662
    const/high16 v18, -0x3fa00000    # -3.5f

    .line 663
    .line 664
    const v13, -0x40b33333    # -0.8f

    .line 665
    .line 666
    .line 667
    const v14, -0x3ffccccd    # -2.05f

    .line 668
    .line 669
    .line 670
    const v15, -0x3fcd70a4    # -2.79f

    .line 671
    .line 672
    .line 673
    const/high16 v16, -0x3fa00000    # -3.5f

    .line 674
    .line 675
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 676
    .line 677
    .line 678
    const v17, -0x3fe47ae1    # -2.43f

    .line 679
    .line 680
    .line 681
    const v18, 0x3f11eb85    # 0.57f

    .line 682
    .line 683
    .line 684
    const v13, -0x40a147ae    # -0.87f

    .line 685
    .line 686
    .line 687
    const/4 v14, 0x0

    .line 688
    const v15, -0x40266666    # -1.7f

    .line 689
    .line 690
    .line 691
    const v16, 0x3e4ccccd    # 0.2f

    .line 692
    .line 693
    .line 694
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 695
    .line 696
    .line 697
    const/4 v0, 0x0

    .line 698
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 699
    .line 700
    .line 701
    const v0, 0x40bfae14    # 5.99f

    .line 702
    .line 703
    .line 704
    const/high16 v2, 0x41400000    # 12.0f

    .line 705
    .line 706
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 707
    .line 708
    .line 709
    const v17, -0x40c28f5c    # -0.74f

    .line 710
    .line 711
    .line 712
    const v18, -0x405ae148    # -1.29f

    .line 713
    .line 714
    .line 715
    const/4 v13, 0x0

    .line 716
    const v14, -0x40fae148    # -0.52f

    .line 717
    .line 718
    .line 719
    const v15, -0x417ae148    # -0.26f

    .line 720
    .line 721
    .line 722
    const v16, -0x407d70a4    # -1.02f

    .line 723
    .line 724
    .line 725
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 726
    .line 727
    .line 728
    const v17, -0x3ffccccd    # -2.05f

    .line 729
    .line 730
    .line 731
    const v18, 0x3f0ccccd    # 0.55f

    .line 732
    .line 733
    .line 734
    const v13, -0x40c7ae14    # -0.72f

    .line 735
    .line 736
    .line 737
    const v14, -0x412e147b    # -0.41f

    .line 738
    .line 739
    .line 740
    const v15, -0x402f5c29    # -1.63f

    .line 741
    .line 742
    .line 743
    const v16, -0x41d1eb85    # -0.17f

    .line 744
    .line 745
    .line 746
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 747
    .line 748
    .line 749
    const v17, 0x3f0ccccd    # 0.55f

    .line 750
    .line 751
    .line 752
    const v18, 0x40033333    # 2.05f

    .line 753
    .line 754
    .line 755
    const v13, -0x412e147b    # -0.41f

    .line 756
    .line 757
    .line 758
    const v14, 0x3f3851ec    # 0.72f

    .line 759
    .line 760
    .line 761
    const v15, -0x41d1eb85    # -0.17f

    .line 762
    .line 763
    .line 764
    const v16, 0x3fd0a3d7    # 1.63f

    .line 765
    .line 766
    .line 767
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 768
    .line 769
    .line 770
    const v17, 0x3fbeb852    # 1.49f

    .line 771
    .line 772
    .line 773
    const/16 v18, 0x0

    .line 774
    .line 775
    const v13, 0x3ef5c28f    # 0.48f

    .line 776
    .line 777
    .line 778
    const v14, 0x3e8f5c29    # 0.28f

    .line 779
    .line 780
    .line 781
    const v15, 0x3f866666    # 1.05f

    .line 782
    .line 783
    .line 784
    const/high16 v16, 0x3e800000    # 0.25f

    .line 785
    .line 786
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 787
    .line 788
    .line 789
    const v0, 0x403e147b    # 2.97f

    .line 790
    .line 791
    .line 792
    const v2, 0x3fdc28f6    # 1.72f

    .line 793
    .line 794
    .line 795
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 796
    .line 797
    .line 798
    const/4 v0, 0x0

    .line 799
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 800
    .line 801
    .line 802
    const v17, 0x40dc28f6    # 6.88f

    .line 803
    .line 804
    .line 805
    const/high16 v18, 0x41880000    # 17.0f

    .line 806
    .line 807
    const v13, 0x40f47ae1    # 7.64f

    .line 808
    .line 809
    .line 810
    const v14, 0x4178f5c3    # 15.56f

    .line 811
    .line 812
    .line 813
    const v15, 0x40e5c28f    # 7.18f

    .line 814
    .line 815
    .line 816
    const v16, 0x4181eb85    # 16.24f

    .line 817
    .line 818
    .line 819
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 820
    .line 821
    .line 822
    const v0, 0x4108f5c3    # 8.56f

    .line 823
    .line 824
    .line 825
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 826
    .line 827
    .line 828
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 829
    .line 830
    .line 831
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 832
    .line 833
    .line 834
    move-result-object v2

    .line 835
    const/16 v16, 0x3800

    .line 836
    .line 837
    const/16 v17, 0x0

    .line 838
    .line 839
    const/high16 v6, 0x3f800000    # 1.0f

    .line 840
    .line 841
    const/high16 v8, 0x3f800000    # 1.0f

    .line 842
    .line 843
    const/4 v7, 0x0

    .line 844
    const/high16 v9, 0x3f800000    # 1.0f

    .line 845
    .line 846
    const/high16 v12, 0x3f800000    # 1.0f

    .line 847
    .line 848
    const/4 v13, 0x0

    .line 849
    const/4 v14, 0x0

    .line 850
    const/4 v15, 0x0

    .line 851
    const-string v4, ""

    .line 852
    .line 853
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 854
    .line 855
    .line 856
    move-result-object v0

    .line 857
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 858
    .line 859
    .line 860
    move-result-object v0

    .line 861
    sput-object v0, Landroidx/compose/material/icons/twotone/SickKt;->_sick:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 862
    .line 863
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 864
    .line 865
    .line 866
    return-object v0
.end method
