.class public final Landroidx/compose/material/icons/outlined/ToysKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_toys",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "Toys",
        "Landroidx/compose/material/icons/Icons$Outlined;",
        "getToys",
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
        "SMAP\nToys.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Toys.kt\nandroidx/compose/material/icons/outlined/ToysKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,101:1\n212#2,12:102\n233#2,18:115\n253#2:152\n174#3:114\n705#4,2:133\n717#4,2:135\n719#4,11:141\n72#5,4:137\n*S KotlinDebug\n*F\n+ 1 Toys.kt\nandroidx/compose/material/icons/outlined/ToysKt\n*L\n29#1:102,12\n30#1:115,18\n30#1:152\n29#1:114\n30#1:133,2\n30#1:135,2\n30#1:141,11\n30#1:137,4\n*E\n"
    }
.end annotation


# static fields
.field private static _toys:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getToys(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/outlined/ToysKt;->_toys:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Outlined.Toys"

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
    const/high16 v0, 0x41960000    # 18.75f

    .line 71
    .line 72
    const v2, 0x412147ae    # 10.08f

    .line 73
    .line 74
    .line 75
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    const v0, 0x418b3333    # 17.4f

    .line 79
    .line 80
    .line 81
    const v2, 0x40c1999a    # 6.05f

    .line 82
    .line 83
    .line 84
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 85
    .line 86
    .line 87
    const v17, 0x4168f5c3    # 14.56f

    .line 88
    .line 89
    .line 90
    const/high16 v18, 0x40800000    # 4.0f

    .line 91
    .line 92
    const/high16 v13, 0x41880000    # 17.0f

    .line 93
    .line 94
    const v14, 0x409a3d71    # 4.82f

    .line 95
    .line 96
    .line 97
    const v15, 0x417d999a    # 15.85f

    .line 98
    .line 99
    .line 100
    const/high16 v16, 0x40800000    # 4.0f

    .line 101
    .line 102
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 103
    .line 104
    .line 105
    const v0, 0x41170a3d    # 9.44f

    .line 106
    .line 107
    .line 108
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 109
    .line 110
    .line 111
    const v17, 0x40d33333    # 6.6f

    .line 112
    .line 113
    .line 114
    const v18, 0x40c1999a    # 6.05f

    .line 115
    .line 116
    .line 117
    const v13, 0x41026666    # 8.15f

    .line 118
    .line 119
    .line 120
    const/high16 v14, 0x40800000    # 4.0f

    .line 121
    .line 122
    const/high16 v15, 0x40e00000    # 7.0f

    .line 123
    .line 124
    const v16, 0x409a3d71    # 4.82f

    .line 125
    .line 126
    .line 127
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 128
    .line 129
    .line 130
    const v0, 0x40b9eb85    # 5.81f

    .line 131
    .line 132
    .line 133
    const v2, 0x41066666    # 8.4f

    .line 134
    .line 135
    .line 136
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 137
    .line 138
    .line 139
    const v0, 0x408d1eb8    # 4.41f

    .line 140
    .line 141
    .line 142
    const/high16 v2, 0x40e00000    # 7.0f

    .line 143
    .line 144
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 145
    .line 146
    .line 147
    const v0, 0x3e947ae1    # 0.29f

    .line 148
    .line 149
    .line 150
    const v2, -0x416b851f    # -0.29f

    .line 151
    .line 152
    .line 153
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 154
    .line 155
    .line 156
    const/16 v17, 0x0

    .line 157
    .line 158
    const v18, -0x404b851f    # -1.41f

    .line 159
    .line 160
    .line 161
    const v13, 0x3ec7ae14    # 0.39f

    .line 162
    .line 163
    .line 164
    const v14, -0x413851ec    # -0.39f

    .line 165
    .line 166
    .line 167
    const v15, 0x3ec7ae14    # 0.39f

    .line 168
    .line 169
    .line 170
    const v16, -0x407d70a4    # -1.02f

    .line 171
    .line 172
    .line 173
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 174
    .line 175
    .line 176
    const v17, -0x404b851f    # -1.41f

    .line 177
    .line 178
    .line 179
    const/16 v18, 0x0

    .line 180
    .line 181
    const v13, -0x413851ec    # -0.39f

    .line 182
    .line 183
    .line 184
    const v15, -0x407d70a4    # -1.02f

    .line 185
    .line 186
    .line 187
    const v16, -0x413851ec    # -0.39f

    .line 188
    .line 189
    .line 190
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 191
    .line 192
    .line 193
    const/high16 v0, -0x40000000    # -2.0f

    .line 194
    .line 195
    const/high16 v2, 0x40000000    # 2.0f

    .line 196
    .line 197
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 198
    .line 199
    .line 200
    const/16 v17, 0x0

    .line 201
    .line 202
    const v18, 0x3fb47ae1    # 1.41f

    .line 203
    .line 204
    .line 205
    const v14, 0x3ec7ae14    # 0.39f

    .line 206
    .line 207
    .line 208
    const v15, -0x413851ec    # -0.39f

    .line 209
    .line 210
    .line 211
    const v16, 0x3f828f5c    # 1.02f

    .line 212
    .line 213
    .line 214
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 215
    .line 216
    .line 217
    const v17, 0x3fb47ae1    # 1.41f

    .line 218
    .line 219
    .line 220
    const/16 v18, 0x0

    .line 221
    .line 222
    const v13, 0x3ec7ae14    # 0.39f

    .line 223
    .line 224
    .line 225
    const v15, 0x3f828f5c    # 1.02f

    .line 226
    .line 227
    .line 228
    const v16, 0x3ec7ae14    # 0.39f

    .line 229
    .line 230
    .line 231
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 232
    .line 233
    .line 234
    const/high16 v0, 0x40400000    # 3.0f

    .line 235
    .line 236
    const v2, 0x41068f5c    # 8.41f

    .line 237
    .line 238
    .line 239
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 240
    .line 241
    .line 242
    const v0, 0x3fe51eb8    # 1.79f

    .line 243
    .line 244
    .line 245
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 246
    .line 247
    .line 248
    const/high16 v17, 0x40000000    # 2.0f

    .line 249
    .line 250
    const/high16 v18, 0x41600000    # 14.0f

    .line 251
    .line 252
    const v13, 0x404b851f    # 3.18f

    .line 253
    .line 254
    .line 255
    const v14, 0x412b851f    # 10.72f

    .line 256
    .line 257
    .line 258
    const/high16 v15, 0x40000000    # 2.0f

    .line 259
    .line 260
    const v16, 0x4143851f    # 12.22f

    .line 261
    .line 262
    .line 263
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 264
    .line 265
    .line 266
    const v17, 0x40033333    # 2.05f

    .line 267
    .line 268
    .line 269
    const v18, 0x405e147b    # 3.47f

    .line 270
    .line 271
    .line 272
    const/4 v13, 0x0

    .line 273
    const v14, 0x3fbeb852    # 1.49f

    .line 274
    .line 275
    .line 276
    const v15, 0x3f547ae1    # 0.83f

    .line 277
    .line 278
    .line 279
    const v16, 0x4031eb85    # 2.78f

    .line 280
    .line 281
    .line 282
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 283
    .line 284
    .line 285
    const/high16 v17, 0x40e00000    # 7.0f

    .line 286
    .line 287
    const/high16 v18, 0x41a00000    # 20.0f

    .line 288
    .line 289
    const v13, 0x4088a3d7    # 4.27f

    .line 290
    .line 291
    .line 292
    const v14, 0x41973333    # 18.9f

    .line 293
    .line 294
    .line 295
    const v15, 0x40b051ec    # 5.51f

    .line 296
    .line 297
    .line 298
    const/high16 v16, 0x41a00000    # 20.0f

    .line 299
    .line 300
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 301
    .line 302
    .line 303
    const v17, 0x40347ae1    # 2.82f

    .line 304
    .line 305
    .line 306
    const/high16 v18, -0x40000000    # -2.0f

    .line 307
    .line 308
    const v13, 0x3fa66666    # 1.3f

    .line 309
    .line 310
    .line 311
    const/4 v14, 0x0

    .line 312
    const v15, 0x4019999a    # 2.4f

    .line 313
    .line 314
    .line 315
    const v16, -0x40a8f5c3    # -0.84f

    .line 316
    .line 317
    .line 318
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 319
    .line 320
    .line 321
    const v0, 0x408bd70a    # 4.37f

    .line 322
    .line 323
    .line 324
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 325
    .line 326
    .line 327
    const/high16 v18, 0x40000000    # 2.0f

    .line 328
    .line 329
    const v13, 0x3ed1eb85    # 0.41f

    .line 330
    .line 331
    .line 332
    const v14, 0x3f947ae1    # 1.16f

    .line 333
    .line 334
    .line 335
    const v15, 0x3fc147ae    # 1.51f

    .line 336
    .line 337
    .line 338
    const/high16 v16, 0x40000000    # 2.0f

    .line 339
    .line 340
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 341
    .line 342
    .line 343
    const v17, 0x403ccccd    # 2.95f

    .line 344
    .line 345
    .line 346
    const v18, -0x3fde147b    # -2.53f

    .line 347
    .line 348
    .line 349
    const v13, 0x3fbeb852    # 1.49f

    .line 350
    .line 351
    .line 352
    const/4 v14, 0x0

    .line 353
    const v15, 0x402eb852    # 2.73f

    .line 354
    .line 355
    .line 356
    const v16, -0x40733333    # -1.1f

    .line 357
    .line 358
    .line 359
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 360
    .line 361
    .line 362
    const/high16 v17, 0x41b00000    # 22.0f

    .line 363
    .line 364
    const/high16 v18, 0x41600000    # 14.0f

    .line 365
    .line 366
    const v13, 0x41a95c29    # 21.17f

    .line 367
    .line 368
    .line 369
    const v14, 0x41863d71    # 16.78f

    .line 370
    .line 371
    .line 372
    const/high16 v15, 0x41b00000    # 22.0f

    .line 373
    .line 374
    const v16, 0x4177d70a    # 15.49f

    .line 375
    .line 376
    .line 377
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 378
    .line 379
    .line 380
    const/high16 v17, 0x41960000    # 18.75f

    .line 381
    .line 382
    const v18, 0x412147ae    # 10.08f

    .line 383
    .line 384
    .line 385
    const/high16 v13, 0x41b00000    # 22.0f

    .line 386
    .line 387
    const v14, 0x4140cccd    # 12.05f

    .line 388
    .line 389
    .line 390
    const v15, 0x41a4cccd    # 20.6f

    .line 391
    .line 392
    .line 393
    const v16, 0x4126e148    # 10.43f

    .line 394
    .line 395
    .line 396
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 397
    .line 398
    .line 399
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 400
    .line 401
    .line 402
    const/high16 v0, 0x40c00000    # 6.0f

    .line 403
    .line 404
    const/high16 v2, 0x41500000    # 13.0f

    .line 405
    .line 406
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 407
    .line 408
    .line 409
    const v0, 0x3fc7ae14    # 1.56f

    .line 410
    .line 411
    .line 412
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 413
    .line 414
    .line 415
    const v17, 0x3f733333    # 0.95f

    .line 416
    .line 417
    .line 418
    const v18, 0x3f2e147b    # 0.68f

    .line 419
    .line 420
    .line 421
    const v13, 0x3edc28f6    # 0.43f

    .line 422
    .line 423
    .line 424
    const/4 v14, 0x0

    .line 425
    const v15, 0x3f4f5c29    # 0.81f

    .line 426
    .line 427
    .line 428
    const v16, 0x3e8a3d71    # 0.27f

    .line 429
    .line 430
    .line 431
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 432
    .line 433
    .line 434
    const v0, 0x4184e148    # 16.61f

    .line 435
    .line 436
    .line 437
    const/high16 v2, 0x41200000    # 10.0f

    .line 438
    .line 439
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 440
    .line 441
    .line 442
    const/high16 v0, 0x41500000    # 13.0f

    .line 443
    .line 444
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 445
    .line 446
    .line 447
    const/high16 v0, 0x40c00000    # 6.0f

    .line 448
    .line 449
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 450
    .line 451
    .line 452
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 453
    .line 454
    .line 455
    const v0, 0x40d5c28f    # 6.68f

    .line 456
    .line 457
    .line 458
    const v2, 0x4107d70a    # 8.49f

    .line 459
    .line 460
    .line 461
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 462
    .line 463
    .line 464
    const v17, 0x41170a3d    # 9.44f

    .line 465
    .line 466
    .line 467
    const/high16 v18, 0x40c00000    # 6.0f

    .line 468
    .line 469
    const v13, 0x410a147b    # 8.63f

    .line 470
    .line 471
    .line 472
    const v14, 0x40c8a3d7    # 6.27f

    .line 473
    .line 474
    .line 475
    const v15, 0x411028f6    # 9.01f

    .line 476
    .line 477
    .line 478
    const/high16 v16, 0x40c00000    # 6.0f

    .line 479
    .line 480
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 481
    .line 482
    .line 483
    const/high16 v0, 0x41300000    # 11.0f

    .line 484
    .line 485
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 486
    .line 487
    .line 488
    const/high16 v0, 0x40800000    # 4.0f

    .line 489
    .line 490
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 491
    .line 492
    .line 493
    const v0, 0x40ed1eb8    # 7.41f

    .line 494
    .line 495
    .line 496
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 497
    .line 498
    .line 499
    const v0, 0x40ec7ae1    # 7.39f

    .line 500
    .line 501
    .line 502
    const v2, 0x411fae14    # 9.98f

    .line 503
    .line 504
    .line 505
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 506
    .line 507
    .line 508
    const v0, 0x40d5c28f    # 6.68f

    .line 509
    .line 510
    .line 511
    const v2, 0x4107d70a    # 8.49f

    .line 512
    .line 513
    .line 514
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 515
    .line 516
    .line 517
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 518
    .line 519
    .line 520
    const/high16 v0, 0x40e00000    # 7.0f

    .line 521
    .line 522
    const/high16 v2, 0x41900000    # 18.0f

    .line 523
    .line 524
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 525
    .line 526
    .line 527
    const/high16 v17, -0x40800000    # -1.0f

    .line 528
    .line 529
    const/high16 v18, -0x40800000    # -1.0f

    .line 530
    .line 531
    const v13, -0x40f33333    # -0.55f

    .line 532
    .line 533
    .line 534
    const/4 v14, 0x0

    .line 535
    const/high16 v15, -0x40800000    # -1.0f

    .line 536
    .line 537
    const v16, -0x4119999a    # -0.45f

    .line 538
    .line 539
    .line 540
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 541
    .line 542
    .line 543
    const/high16 v0, -0x40800000    # -1.0f

    .line 544
    .line 545
    const v2, 0x3ee66666    # 0.45f

    .line 546
    .line 547
    .line 548
    const/high16 v4, 0x3f800000    # 1.0f

    .line 549
    .line 550
    invoke-virtual {v12, v2, v0, v4, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 551
    .line 552
    .line 553
    const v0, 0x3ee66666    # 0.45f

    .line 554
    .line 555
    .line 556
    const/high16 v2, 0x3f800000    # 1.0f

    .line 557
    .line 558
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 559
    .line 560
    .line 561
    const v0, 0x40f1999a    # 7.55f

    .line 562
    .line 563
    .line 564
    const/high16 v2, 0x40e00000    # 7.0f

    .line 565
    .line 566
    const/high16 v4, 0x41900000    # 18.0f

    .line 567
    .line 568
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 569
    .line 570
    .line 571
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 572
    .line 573
    .line 574
    const/high16 v0, 0x41880000    # 17.0f

    .line 575
    .line 576
    const/high16 v2, 0x41900000    # 18.0f

    .line 577
    .line 578
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 579
    .line 580
    .line 581
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 582
    .line 583
    .line 584
    const/high16 v0, -0x40800000    # -1.0f

    .line 585
    .line 586
    const v2, 0x3ee66666    # 0.45f

    .line 587
    .line 588
    .line 589
    const/high16 v4, 0x3f800000    # 1.0f

    .line 590
    .line 591
    invoke-virtual {v12, v2, v0, v4, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 592
    .line 593
    .line 594
    const v0, 0x3ee66666    # 0.45f

    .line 595
    .line 596
    .line 597
    const/high16 v2, 0x3f800000    # 1.0f

    .line 598
    .line 599
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 600
    .line 601
    .line 602
    const v0, 0x418c6666    # 17.55f

    .line 603
    .line 604
    .line 605
    const/high16 v2, 0x41880000    # 17.0f

    .line 606
    .line 607
    const/high16 v4, 0x41900000    # 18.0f

    .line 608
    .line 609
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 610
    .line 611
    .line 612
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 613
    .line 614
    .line 615
    const v0, 0x419beb85    # 19.49f

    .line 616
    .line 617
    .line 618
    const v2, 0x41751eb8    # 15.32f

    .line 619
    .line 620
    .line 621
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 622
    .line 623
    .line 624
    const/high16 v17, 0x41880000    # 17.0f

    .line 625
    .line 626
    const/high16 v18, 0x41600000    # 14.0f

    .line 627
    .line 628
    const v13, 0x4197999a    # 18.95f

    .line 629
    .line 630
    .line 631
    const v14, 0x41687ae1    # 14.53f

    .line 632
    .line 633
    .line 634
    const v15, 0x41903d71    # 18.03f

    .line 635
    .line 636
    .line 637
    const/high16 v16, 0x41600000    # 14.0f

    .line 638
    .line 639
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 640
    .line 641
    .line 642
    const v17, -0x3fcb851f    # -2.82f

    .line 643
    .line 644
    .line 645
    const/high16 v18, 0x40000000    # 2.0f

    .line 646
    .line 647
    const v13, -0x4059999a    # -1.3f

    .line 648
    .line 649
    .line 650
    const/4 v14, 0x0

    .line 651
    const v15, -0x3fe66666    # -2.4f

    .line 652
    .line 653
    .line 654
    const v16, 0x3f570a3d    # 0.84f

    .line 655
    .line 656
    .line 657
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 658
    .line 659
    .line 660
    const v0, 0x411d1eb8    # 9.82f

    .line 661
    .line 662
    .line 663
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 664
    .line 665
    .line 666
    const/high16 v17, 0x40e00000    # 7.0f

    .line 667
    .line 668
    const/high16 v18, 0x41600000    # 14.0f

    .line 669
    .line 670
    const v13, 0x41166666    # 9.4f

    .line 671
    .line 672
    .line 673
    const v14, 0x416d70a4    # 14.84f

    .line 674
    .line 675
    .line 676
    const v15, 0x4104cccd    # 8.3f

    .line 677
    .line 678
    .line 679
    const/high16 v16, 0x41600000    # 14.0f

    .line 680
    .line 681
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 682
    .line 683
    .line 684
    const v17, -0x3fe0a3d7    # -2.49f

    .line 685
    .line 686
    .line 687
    const v18, 0x3fa8f5c3    # 1.32f

    .line 688
    .line 689
    .line 690
    const v13, -0x407c28f6    # -1.03f

    .line 691
    .line 692
    .line 693
    const/4 v14, 0x0

    .line 694
    const v15, -0x40066666    # -1.95f

    .line 695
    .line 696
    .line 697
    const v16, 0x3f07ae14    # 0.53f

    .line 698
    .line 699
    .line 700
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 701
    .line 702
    .line 703
    const/high16 v17, 0x40800000    # 4.0f

    .line 704
    .line 705
    const/high16 v18, 0x41600000    # 14.0f

    .line 706
    .line 707
    const v13, 0x40866666    # 4.2f

    .line 708
    .line 709
    .line 710
    const v14, 0x416f851f    # 14.97f

    .line 711
    .line 712
    .line 713
    const/high16 v15, 0x40800000    # 4.0f

    .line 714
    .line 715
    const v16, 0x416828f6    # 14.51f

    .line 716
    .line 717
    .line 718
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 719
    .line 720
    .line 721
    const/high16 v17, 0x40000000    # 2.0f

    .line 722
    .line 723
    const/high16 v18, -0x40000000    # -2.0f

    .line 724
    .line 725
    const/4 v13, 0x0

    .line 726
    const v14, -0x40733333    # -1.1f

    .line 727
    .line 728
    .line 729
    const v15, 0x3f666666    # 0.9f

    .line 730
    .line 731
    .line 732
    const/high16 v16, -0x40000000    # -2.0f

    .line 733
    .line 734
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 735
    .line 736
    .line 737
    const/high16 v0, 0x41400000    # 12.0f

    .line 738
    .line 739
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 740
    .line 741
    .line 742
    const/high16 v18, 0x40000000    # 2.0f

    .line 743
    .line 744
    const v13, 0x3f8ccccd    # 1.1f

    .line 745
    .line 746
    .line 747
    const/4 v14, 0x0

    .line 748
    const/high16 v15, 0x40000000    # 2.0f

    .line 749
    .line 750
    const v16, 0x3f666666    # 0.9f

    .line 751
    .line 752
    .line 753
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 754
    .line 755
    .line 756
    const v17, 0x419beb85    # 19.49f

    .line 757
    .line 758
    .line 759
    const v18, 0x41751eb8    # 15.32f

    .line 760
    .line 761
    .line 762
    const/high16 v13, 0x41a00000    # 20.0f

    .line 763
    .line 764
    const v14, 0x416828f6    # 14.51f

    .line 765
    .line 766
    .line 767
    const v15, 0x419e6666    # 19.8f

    .line 768
    .line 769
    .line 770
    const v16, 0x416f851f    # 14.97f

    .line 771
    .line 772
    .line 773
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 774
    .line 775
    .line 776
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 777
    .line 778
    .line 779
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 780
    .line 781
    .line 782
    move-result-object v2

    .line 783
    const/16 v16, 0x3800

    .line 784
    .line 785
    const/16 v17, 0x0

    .line 786
    .line 787
    const/high16 v6, 0x3f800000    # 1.0f

    .line 788
    .line 789
    const/high16 v8, 0x3f800000    # 1.0f

    .line 790
    .line 791
    const/4 v7, 0x0

    .line 792
    const/high16 v9, 0x3f800000    # 1.0f

    .line 793
    .line 794
    const/high16 v12, 0x3f800000    # 1.0f

    .line 795
    .line 796
    const/4 v13, 0x0

    .line 797
    const/4 v14, 0x0

    .line 798
    const/4 v15, 0x0

    .line 799
    const-string v4, ""

    .line 800
    .line 801
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 802
    .line 803
    .line 804
    move-result-object v0

    .line 805
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 806
    .line 807
    .line 808
    move-result-object v0

    .line 809
    sput-object v0, Landroidx/compose/material/icons/outlined/ToysKt;->_toys:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 810
    .line 811
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 812
    .line 813
    .line 814
    return-object v0
.end method
