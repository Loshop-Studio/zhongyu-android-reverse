.class public final Landroidx/compose/material/icons/rounded/PublishedWithChangesKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_publishedWithChanges",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "PublishedWithChanges",
        "Landroidx/compose/material/icons/Icons$Rounded;",
        "getPublishedWithChanges",
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
        "SMAP\nPublishedWithChanges.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PublishedWithChanges.kt\nandroidx/compose/material/icons/rounded/PublishedWithChangesKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,82:1\n212#2,12:83\n233#2,18:96\n253#2:133\n174#3:95\n705#4,2:114\n717#4,2:116\n719#4,11:122\n72#5,4:118\n*S KotlinDebug\n*F\n+ 1 PublishedWithChanges.kt\nandroidx/compose/material/icons/rounded/PublishedWithChangesKt\n*L\n29#1:83,12\n30#1:96,18\n30#1:133\n29#1:95\n30#1:114,2\n30#1:116,2\n30#1:122,11\n30#1:118,4\n*E\n"
    }
.end annotation


# static fields
.field private static _publishedWithChanges:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getPublishedWithChanges(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/PublishedWithChangesKt;->_publishedWithChanges:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.PublishedWithChanges"

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
    const v0, 0x4187999a    # 16.95f

    .line 71
    .line 72
    .line 73
    const v2, 0x4123ae14    # 10.23f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v0, -0x3f4ae148    # -5.66f

    .line 80
    .line 81
    .line 82
    const v2, 0x40b51eb8    # 5.66f

    .line 83
    .line 84
    .line 85
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 86
    .line 87
    .line 88
    const v17, -0x404b851f    # -1.41f

    .line 89
    .line 90
    .line 91
    const/16 v18, 0x0

    .line 92
    .line 93
    const v13, -0x413851ec    # -0.39f

    .line 94
    .line 95
    .line 96
    const v14, 0x3ec7ae14    # 0.39f

    .line 97
    .line 98
    .line 99
    const v15, -0x407d70a4    # -1.02f

    .line 100
    .line 101
    .line 102
    const v16, 0x3ec7ae14    # 0.39f

    .line 103
    .line 104
    .line 105
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 106
    .line 107
    .line 108
    const v0, -0x3fcae148    # -2.83f

    .line 109
    .line 110
    .line 111
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 112
    .line 113
    .line 114
    const/16 v17, 0x0

    .line 115
    .line 116
    const v18, -0x404b851f    # -1.41f

    .line 117
    .line 118
    .line 119
    const v14, -0x413851ec    # -0.39f

    .line 120
    .line 121
    .line 122
    const v15, -0x413851ec    # -0.39f

    .line 123
    .line 124
    .line 125
    const v16, -0x407d70a4    # -1.02f

    .line 126
    .line 127
    .line 128
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 129
    .line 130
    .line 131
    const/4 v0, 0x0

    .line 132
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 133
    .line 134
    .line 135
    const v17, 0x3fb47ae1    # 1.41f

    .line 136
    .line 137
    .line 138
    const/16 v18, 0x0

    .line 139
    .line 140
    const v13, 0x3ec7ae14    # 0.39f

    .line 141
    .line 142
    .line 143
    const v15, 0x3f828f5c    # 1.02f

    .line 144
    .line 145
    .line 146
    const v16, -0x413851ec    # -0.39f

    .line 147
    .line 148
    .line 149
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 150
    .line 151
    .line 152
    const v0, 0x4007ae14    # 2.12f

    .line 153
    .line 154
    .line 155
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 156
    .line 157
    .line 158
    const v0, 0x409e6666    # 4.95f

    .line 159
    .line 160
    .line 161
    const v2, -0x3f61999a    # -4.95f

    .line 162
    .line 163
    .line 164
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 165
    .line 166
    .line 167
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 168
    .line 169
    .line 170
    const/4 v0, 0x0

    .line 171
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 172
    .line 173
    .line 174
    const v17, 0x4187999a    # 16.95f

    .line 175
    .line 176
    .line 177
    const v18, 0x4123ae14    # 10.23f

    .line 178
    .line 179
    .line 180
    const v13, 0x418ab852    # 17.34f

    .line 181
    .line 182
    .line 183
    const v14, 0x41135c29    # 9.21f

    .line 184
    .line 185
    .line 186
    const v15, 0x418ab852    # 17.34f

    .line 187
    .line 188
    .line 189
    const v16, 0x411d70a4    # 9.84f

    .line 190
    .line 191
    .line 192
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 193
    .line 194
    .line 195
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 196
    .line 197
    .line 198
    const/high16 v0, 0x40800000    # 4.0f

    .line 199
    .line 200
    const/high16 v2, 0x41400000    # 12.0f

    .line 201
    .line 202
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 203
    .line 204
    .line 205
    const v17, 0x4027ae14    # 2.62f

    .line 206
    .line 207
    .line 208
    const v18, -0x3f43d70a    # -5.88f

    .line 209
    .line 210
    .line 211
    const/4 v13, 0x0

    .line 212
    const v14, -0x3feae148    # -2.33f

    .line 213
    .line 214
    .line 215
    const v15, 0x3f828f5c    # 1.02f

    .line 216
    .line 217
    .line 218
    const v16, -0x3f728f5c    # -4.42f

    .line 219
    .line 220
    .line 221
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 222
    .line 223
    .line 224
    const v0, 0x3fc3d70a    # 1.53f

    .line 225
    .line 226
    .line 227
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 228
    .line 229
    .line 230
    const/high16 v17, 0x41100000    # 9.0f

    .line 231
    .line 232
    const v18, 0x40e947ae    # 7.29f

    .line 233
    .line 234
    .line 235
    const v13, 0x41075c29    # 8.46f

    .line 236
    .line 237
    .line 238
    const v14, 0x40feb852    # 7.96f

    .line 239
    .line 240
    .line 241
    const/high16 v15, 0x41100000    # 9.0f

    .line 242
    .line 243
    const v16, 0x40f7ae14    # 7.74f

    .line 244
    .line 245
    .line 246
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 247
    .line 248
    .line 249
    const/high16 v0, 0x40400000    # 3.0f

    .line 250
    .line 251
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 252
    .line 253
    .line 254
    const/high16 v17, -0x41000000    # -0.5f

    .line 255
    .line 256
    const/high16 v18, -0x41000000    # -0.5f

    .line 257
    .line 258
    const/4 v13, 0x0

    .line 259
    const v14, -0x4170a3d7    # -0.28f

    .line 260
    .line 261
    .line 262
    const v15, -0x419eb852    # -0.22f

    .line 263
    .line 264
    .line 265
    const/high16 v16, -0x41000000    # -0.5f

    .line 266
    .line 267
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 268
    .line 269
    .line 270
    const v0, 0x4086b852    # 4.21f

    .line 271
    .line 272
    .line 273
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 274
    .line 275
    .line 276
    const v17, -0x414ccccd    # -0.35f

    .line 277
    .line 278
    .line 279
    const v18, 0x3f59999a    # 0.85f

    .line 280
    .line 281
    .line 282
    const v13, -0x4119999a    # -0.45f

    .line 283
    .line 284
    .line 285
    const/4 v14, 0x0

    .line 286
    const v15, -0x40d47ae1    # -0.67f

    .line 287
    .line 288
    .line 289
    const v16, 0x3f0a3d71    # 0.54f

    .line 290
    .line 291
    .line 292
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 293
    .line 294
    .line 295
    const v0, 0x40a66666    # 5.2f

    .line 296
    .line 297
    .line 298
    const v2, 0x40966666    # 4.7f

    .line 299
    .line 300
    .line 301
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 302
    .line 303
    .line 304
    const/high16 v17, 0x40000000    # 2.0f

    .line 305
    .line 306
    const/high16 v18, 0x41400000    # 12.0f

    .line 307
    .line 308
    const v13, 0x404f5c29    # 3.24f

    .line 309
    .line 310
    .line 311
    const v14, 0x40d0a3d7    # 6.52f

    .line 312
    .line 313
    .line 314
    const/high16 v15, 0x40000000    # 2.0f

    .line 315
    .line 316
    const v16, 0x4111c28f    # 9.11f

    .line 317
    .line 318
    .line 319
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 320
    .line 321
    .line 322
    const v17, 0x40f851ec    # 7.76f

    .line 323
    .line 324
    .line 325
    const/high16 v18, 0x411c0000    # 9.75f

    .line 326
    .line 327
    const/4 v13, 0x0

    .line 328
    const/high16 v14, 0x40980000    # 4.75f

    .line 329
    .line 330
    const v15, 0x40547ae1    # 3.32f

    .line 331
    .line 332
    .line 333
    const v16, 0x410bae14    # 8.73f

    .line 334
    .line 335
    .line 336
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 337
    .line 338
    .line 339
    const v17, 0x3f9eb852    # 1.24f

    .line 340
    .line 341
    .line 342
    const v18, -0x40851eb8    # -0.98f

    .line 343
    .line 344
    .line 345
    const v13, 0x3f2147ae    # 0.63f

    .line 346
    .line 347
    .line 348
    const v14, 0x3e0f5c29    # 0.14f

    .line 349
    .line 350
    .line 351
    const v15, 0x3f9eb852    # 1.24f

    .line 352
    .line 353
    .line 354
    const v16, -0x41570a3d    # -0.33f

    .line 355
    .line 356
    .line 357
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 358
    .line 359
    .line 360
    const/4 v0, 0x0

    .line 361
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 362
    .line 363
    .line 364
    const v17, -0x40b5c28f    # -0.79f

    .line 365
    .line 366
    .line 367
    const/4 v13, 0x0

    .line 368
    const v14, -0x410f5c29    # -0.47f

    .line 369
    .line 370
    .line 371
    const v15, -0x41570a3d    # -0.33f

    .line 372
    .line 373
    .line 374
    const v16, -0x40a147ae    # -0.87f

    .line 375
    .line 376
    .line 377
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 378
    .line 379
    .line 380
    const/high16 v17, 0x40800000    # 4.0f

    .line 381
    .line 382
    const/high16 v18, 0x41400000    # 12.0f

    .line 383
    .line 384
    const v13, 0x40d51eb8    # 6.66f

    .line 385
    .line 386
    .line 387
    const v14, 0x4197d70a    # 18.98f

    .line 388
    .line 389
    .line 390
    const/high16 v15, 0x40800000    # 4.0f

    .line 391
    .line 392
    const v16, 0x417ccccd    # 15.8f

    .line 393
    .line 394
    .line 395
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 396
    .line 397
    .line 398
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 399
    .line 400
    .line 401
    const/high16 v0, 0x41b00000    # 22.0f

    .line 402
    .line 403
    const/high16 v2, 0x41400000    # 12.0f

    .line 404
    .line 405
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 406
    .line 407
    .line 408
    const v17, -0x3f07ae14    # -7.76f

    .line 409
    .line 410
    .line 411
    const/high16 v18, -0x3ee40000    # -9.75f

    .line 412
    .line 413
    const/4 v13, 0x0

    .line 414
    const/high16 v14, -0x3f680000    # -4.75f

    .line 415
    .line 416
    const v15, -0x3fab851f    # -3.32f

    .line 417
    .line 418
    .line 419
    const v16, -0x3ef451ec    # -8.73f

    .line 420
    .line 421
    .line 422
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 423
    .line 424
    .line 425
    const/high16 v17, 0x41500000    # 13.0f

    .line 426
    .line 427
    const v18, 0x404eb852    # 3.23f

    .line 428
    .line 429
    .line 430
    const v13, 0x4159c28f    # 13.61f

    .line 431
    .line 432
    .line 433
    const v14, 0x40070a3d    # 2.11f

    .line 434
    .line 435
    .line 436
    const/high16 v15, 0x41500000    # 13.0f

    .line 437
    .line 438
    const v16, 0x40251eb8    # 2.58f

    .line 439
    .line 440
    .line 441
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 442
    .line 443
    .line 444
    const/4 v0, 0x0

    .line 445
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 446
    .line 447
    .line 448
    const v17, 0x3f4a3d71    # 0.79f

    .line 449
    .line 450
    .line 451
    const v18, 0x3f7ae148    # 0.98f

    .line 452
    .line 453
    .line 454
    const/4 v13, 0x0

    .line 455
    const v14, 0x3ef0a3d7    # 0.47f

    .line 456
    .line 457
    .line 458
    const v15, 0x3ea8f5c3    # 0.33f

    .line 459
    .line 460
    .line 461
    const v16, 0x3f5eb852    # 0.87f

    .line 462
    .line 463
    .line 464
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 465
    .line 466
    .line 467
    const/high16 v17, 0x41a00000    # 20.0f

    .line 468
    .line 469
    const/high16 v18, 0x41400000    # 12.0f

    .line 470
    .line 471
    const v13, 0x418ab852    # 17.34f

    .line 472
    .line 473
    .line 474
    const v14, 0x40a0a3d7    # 5.02f

    .line 475
    .line 476
    .line 477
    const/high16 v15, 0x41a00000    # 20.0f

    .line 478
    .line 479
    const v16, 0x41033333    # 8.2f

    .line 480
    .line 481
    .line 482
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 483
    .line 484
    .line 485
    const v17, -0x3fd851ec    # -2.62f

    .line 486
    .line 487
    .line 488
    const v18, 0x40bc28f6    # 5.88f

    .line 489
    .line 490
    .line 491
    const/4 v13, 0x0

    .line 492
    const v14, 0x40151eb8    # 2.33f

    .line 493
    .line 494
    .line 495
    const v15, -0x407d70a4    # -1.02f

    .line 496
    .line 497
    .line 498
    const v16, 0x408d70a4    # 4.42f

    .line 499
    .line 500
    .line 501
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 502
    .line 503
    .line 504
    const v0, -0x403c28f6    # -1.53f

    .line 505
    .line 506
    .line 507
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 508
    .line 509
    .line 510
    const/high16 v17, 0x41700000    # 15.0f

    .line 511
    .line 512
    const v18, 0x4185ae14    # 16.71f

    .line 513
    .line 514
    .line 515
    const v13, 0x4178a3d7    # 15.54f

    .line 516
    .line 517
    .line 518
    const v14, 0x418051ec    # 16.04f

    .line 519
    .line 520
    .line 521
    const/high16 v15, 0x41700000    # 15.0f

    .line 522
    .line 523
    const v16, 0x4182147b    # 16.26f

    .line 524
    .line 525
    .line 526
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 527
    .line 528
    .line 529
    const/high16 v0, 0x41a80000    # 21.0f

    .line 530
    .line 531
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 532
    .line 533
    .line 534
    const/high16 v17, 0x3f000000    # 0.5f

    .line 535
    .line 536
    const/high16 v18, 0x3f000000    # 0.5f

    .line 537
    .line 538
    const/4 v13, 0x0

    .line 539
    const v14, 0x3e8f5c29    # 0.28f

    .line 540
    .line 541
    .line 542
    const v15, 0x3e6147ae    # 0.22f

    .line 543
    .line 544
    .line 545
    const/high16 v16, 0x3f000000    # 0.5f

    .line 546
    .line 547
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 548
    .line 549
    .line 550
    const v0, 0x408947ae    # 4.29f

    .line 551
    .line 552
    .line 553
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 554
    .line 555
    .line 556
    const v17, 0x3eb33333    # 0.35f

    .line 557
    .line 558
    .line 559
    const v18, -0x40a66666    # -0.85f

    .line 560
    .line 561
    .line 562
    const v13, 0x3ee66666    # 0.45f

    .line 563
    .line 564
    .line 565
    const/4 v14, 0x0

    .line 566
    const v15, 0x3f2b851f    # 0.67f

    .line 567
    .line 568
    .line 569
    const v16, -0x40f5c28f    # -0.54f

    .line 570
    .line 571
    .line 572
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 573
    .line 574
    .line 575
    const v0, 0x41966666    # 18.8f

    .line 576
    .line 577
    .line 578
    const v2, 0x419a6666    # 19.3f

    .line 579
    .line 580
    .line 581
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 582
    .line 583
    .line 584
    const/high16 v17, 0x41b00000    # 22.0f

    .line 585
    .line 586
    const/high16 v18, 0x41400000    # 12.0f

    .line 587
    .line 588
    const v13, 0x41a6147b    # 20.76f

    .line 589
    .line 590
    .line 591
    const v14, 0x418bd70a    # 17.48f

    .line 592
    .line 593
    .line 594
    const/high16 v15, 0x41b00000    # 22.0f

    .line 595
    .line 596
    const v16, 0x416e3d71    # 14.89f

    .line 597
    .line 598
    .line 599
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 600
    .line 601
    .line 602
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 603
    .line 604
    .line 605
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 606
    .line 607
    .line 608
    move-result-object v2

    .line 609
    const/16 v16, 0x3800

    .line 610
    .line 611
    const/16 v17, 0x0

    .line 612
    .line 613
    const/high16 v6, 0x3f800000    # 1.0f

    .line 614
    .line 615
    const/high16 v8, 0x3f800000    # 1.0f

    .line 616
    .line 617
    const/4 v7, 0x0

    .line 618
    const/high16 v9, 0x3f800000    # 1.0f

    .line 619
    .line 620
    const/high16 v12, 0x3f800000    # 1.0f

    .line 621
    .line 622
    const/4 v13, 0x0

    .line 623
    const/4 v14, 0x0

    .line 624
    const/4 v15, 0x0

    .line 625
    const-string v4, ""

    .line 626
    .line 627
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 628
    .line 629
    .line 630
    move-result-object v0

    .line 631
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 632
    .line 633
    .line 634
    move-result-object v0

    .line 635
    sput-object v0, Landroidx/compose/material/icons/rounded/PublishedWithChangesKt;->_publishedWithChanges:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 636
    .line 637
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 638
    .line 639
    .line 640
    return-object v0
.end method
