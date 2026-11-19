.class public final Landroidx/compose/material/icons/rounded/FestivalKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_festival",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "Festival",
        "Landroidx/compose/material/icons/Icons$Rounded;",
        "getFestival",
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
        "SMAP\nFestival.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Festival.kt\nandroidx/compose/material/icons/rounded/FestivalKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,99:1\n212#2,12:100\n233#2,18:113\n253#2:150\n174#3:112\n705#4,2:131\n717#4,2:133\n719#4,11:139\n72#5,4:135\n*S KotlinDebug\n*F\n+ 1 Festival.kt\nandroidx/compose/material/icons/rounded/FestivalKt\n*L\n29#1:100,12\n30#1:113,18\n30#1:150\n29#1:112\n30#1:131,2\n30#1:133,2\n30#1:139,11\n30#1:135,4\n*E\n"
    }
.end annotation


# static fields
.field private static _festival:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getFestival(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/FestivalKt;->_festival:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.Festival"

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
    const/high16 v0, 0x41b80000    # 23.0f

    .line 71
    .line 72
    const/high16 v2, 0x41300000    # 11.0f

    .line 73
    .line 74
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const v0, -0x40e3d70a    # -0.61f

    .line 78
    .line 79
    .line 80
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 81
    .line 82
    .line 83
    const v17, -0x40628f5c    # -1.23f

    .line 84
    .line 85
    .line 86
    const v18, -0x40147ae1    # -1.84f

    .line 87
    .line 88
    .line 89
    const/4 v13, 0x0

    .line 90
    const v14, -0x40b33333    # -0.8f

    .line 91
    .line 92
    .line 93
    const v15, -0x410a3d71    # -0.48f

    .line 94
    .line 95
    .line 96
    const v16, -0x403ae148    # -1.54f

    .line 97
    .line 98
    .line 99
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 100
    .line 101
    .line 102
    const v17, -0x3ef851ec    # -8.48f

    .line 103
    .line 104
    .line 105
    const v18, -0x3f5428f6    # -5.37f

    .line 106
    .line 107
    .line 108
    const v13, -0x3f966666    # -3.65f

    .line 109
    .line 110
    .line 111
    const v14, -0x40428f5c    # -1.48f

    .line 112
    .line 113
    .line 114
    const v15, -0x3f26147b    # -6.81f

    .line 115
    .line 116
    .line 117
    const v16, -0x3f847ae1    # -3.93f

    .line 118
    .line 119
    .line 120
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 121
    .line 122
    .line 123
    const v17, -0x3fdae148    # -2.58f

    .line 124
    .line 125
    .line 126
    const/16 v18, 0x0

    .line 127
    .line 128
    const v13, -0x40c28f5c    # -0.74f

    .line 129
    .line 130
    .line 131
    const v14, -0x40dc28f6    # -0.64f

    .line 132
    .line 133
    .line 134
    const v15, -0x40147ae1    # -1.84f

    .line 135
    .line 136
    .line 137
    const v16, -0x40dc28f6    # -0.64f

    .line 138
    .line 139
    .line 140
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 141
    .line 142
    .line 143
    const v17, 0x400eb852    # 2.23f

    .line 144
    .line 145
    .line 146
    const v18, 0x4108cccd    # 8.55f

    .line 147
    .line 148
    .line 149
    const v13, 0x41107ae1    # 9.03f

    .line 150
    .line 151
    .line 152
    const v14, 0x4093d70a    # 4.62f

    .line 153
    .line 154
    .line 155
    const v15, 0x40bc28f6    # 5.88f

    .line 156
    .line 157
    .line 158
    const v16, 0x40e1eb85    # 7.06f

    .line 159
    .line 160
    .line 161
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 162
    .line 163
    .line 164
    const/high16 v17, 0x3f800000    # 1.0f

    .line 165
    .line 166
    const v18, 0x41263d71    # 10.39f

    .line 167
    .line 168
    .line 169
    const v13, 0x3fbd70a4    # 1.48f

    .line 170
    .line 171
    .line 172
    const v14, 0x410d999a    # 8.85f

    .line 173
    .line 174
    .line 175
    const/high16 v15, 0x3f800000    # 1.0f

    .line 176
    .line 177
    const v16, 0x411947ae    # 9.58f

    .line 178
    .line 179
    .line 180
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 181
    .line 182
    .line 183
    const/high16 v0, 0x41300000    # 11.0f

    .line 184
    .line 185
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 186
    .line 187
    .line 188
    const v17, 0x400f5c29    # 2.24f

    .line 189
    .line 190
    .line 191
    const v18, 0x4050a3d7    # 3.26f

    .line 192
    .line 193
    .line 194
    const/4 v13, 0x0

    .line 195
    const v14, 0x3fbeb852    # 1.49f

    .line 196
    .line 197
    .line 198
    const v15, 0x3f6e147b    # 0.93f

    .line 199
    .line 200
    .line 201
    const/high16 v16, 0x40300000    # 2.75f

    .line 202
    .line 203
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 204
    .line 205
    .line 206
    const v17, -0x40fae148    # -0.52f

    .line 207
    .line 208
    .line 209
    const v18, 0x40a947ae    # 5.29f

    .line 210
    .line 211
    .line 212
    const v13, -0x430a3d71    # -0.03f

    .line 213
    .line 214
    .line 215
    const v14, 0x3fd70a3d    # 1.68f

    .line 216
    .line 217
    .line 218
    const v15, -0x41dc28f6    # -0.16f

    .line 219
    .line 220
    .line 221
    const v16, 0x40633333    # 3.55f

    .line 222
    .line 223
    .line 224
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 225
    .line 226
    .line 227
    const v17, 0x409570a4    # 4.67f

    .line 228
    .line 229
    .line 230
    const/high16 v18, 0x41b00000    # 22.0f

    .line 231
    .line 232
    const v13, 0x401d70a4    # 2.46f

    .line 233
    .line 234
    .line 235
    const v14, 0x41a67ae1    # 20.81f

    .line 236
    .line 237
    .line 238
    const v15, 0x405851ec    # 3.38f

    .line 239
    .line 240
    .line 241
    const/high16 v16, 0x41b00000    # 22.0f

    .line 242
    .line 243
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 244
    .line 245
    .line 246
    const v0, 0x416ab852    # 14.67f

    .line 247
    .line 248
    .line 249
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 250
    .line 251
    .line 252
    const v17, 0x3ff9999a    # 1.95f

    .line 253
    .line 254
    .line 255
    const v18, -0x3fe33333    # -2.45f

    .line 256
    .line 257
    .line 258
    const v13, 0x3fa51eb8    # 1.29f

    .line 259
    .line 260
    .line 261
    const/4 v14, 0x0

    .line 262
    const v15, 0x400d70a4    # 2.21f

    .line 263
    .line 264
    .line 265
    const v16, -0x4067ae14    # -1.19f

    .line 266
    .line 267
    .line 268
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 269
    .line 270
    .line 271
    const v17, -0x40fae148    # -0.52f

    .line 272
    .line 273
    .line 274
    const v18, -0x3f56b852    # -5.29f

    .line 275
    .line 276
    .line 277
    const v13, -0x4147ae14    # -0.36f

    .line 278
    .line 279
    .line 280
    const/high16 v14, -0x40200000    # -1.75f

    .line 281
    .line 282
    const/high16 v15, -0x41000000    # -0.5f

    .line 283
    .line 284
    const v16, -0x3f9851ec    # -3.62f

    .line 285
    .line 286
    .line 287
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 288
    .line 289
    .line 290
    const/high16 v17, 0x41b80000    # 23.0f

    .line 291
    .line 292
    const/high16 v18, 0x41300000    # 11.0f

    .line 293
    .line 294
    const v13, 0x41b08f5c    # 22.07f

    .line 295
    .line 296
    .line 297
    const/high16 v14, 0x415c0000    # 13.75f

    .line 298
    .line 299
    const/high16 v15, 0x41b80000    # 23.0f

    .line 300
    .line 301
    const v16, 0x4147d70a    # 12.49f

    .line 302
    .line 303
    .line 304
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 305
    .line 306
    .line 307
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 308
    .line 309
    .line 310
    const/high16 v0, 0x41400000    # 12.0f

    .line 311
    .line 312
    const v2, 0x4096b852    # 4.71f

    .line 313
    .line 314
    .line 315
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 316
    .line 317
    .line 318
    const v17, 0x40c3851f    # 6.11f

    .line 319
    .line 320
    .line 321
    const v18, 0x408947ae    # 4.29f

    .line 322
    .line 323
    .line 324
    const v13, 0x3faa3d71    # 1.33f

    .line 325
    .line 326
    .line 327
    const v14, 0x3f91eb85    # 1.14f

    .line 328
    .line 329
    .line 330
    const v15, 0x405f5c29    # 3.49f

    .line 331
    .line 332
    .line 333
    const v16, 0x4035c28f    # 2.84f

    .line 334
    .line 335
    .line 336
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 337
    .line 338
    .line 339
    const v0, 0x40bc7ae1    # 5.89f

    .line 340
    .line 341
    .line 342
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 343
    .line 344
    .line 345
    const/high16 v17, 0x41400000    # 12.0f

    .line 346
    .line 347
    const v18, 0x4096b852    # 4.71f

    .line 348
    .line 349
    .line 350
    const v13, 0x410828f6    # 8.51f

    .line 351
    .line 352
    .line 353
    const v14, 0x40f1999a    # 7.55f

    .line 354
    .line 355
    .line 356
    const v15, 0x412ab852    # 10.67f

    .line 357
    .line 358
    .line 359
    const v16, 0x40bb3333    # 5.85f

    .line 360
    .line 361
    .line 362
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 363
    .line 364
    .line 365
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 366
    .line 367
    .line 368
    const/high16 v0, 0x41500000    # 13.0f

    .line 369
    .line 370
    const/high16 v2, 0x41300000    # 11.0f

    .line 371
    .line 372
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 373
    .line 374
    .line 375
    const/high16 v0, 0x40400000    # 3.0f

    .line 376
    .line 377
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 378
    .line 379
    .line 380
    const/high16 v17, -0x40400000    # -1.5f

    .line 381
    .line 382
    const/high16 v18, 0x3fc00000    # 1.5f

    .line 383
    .line 384
    const/4 v13, 0x0

    .line 385
    const v14, 0x3f547ae1    # 0.83f

    .line 386
    .line 387
    .line 388
    const v15, -0x40d47ae1    # -0.67f

    .line 389
    .line 390
    .line 391
    const/high16 v16, 0x3fc00000    # 1.5f

    .line 392
    .line 393
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 394
    .line 395
    .line 396
    const v0, 0x413d47ae    # 11.83f

    .line 397
    .line 398
    .line 399
    const/high16 v2, 0x41500000    # 13.0f

    .line 400
    .line 401
    const/high16 v4, 0x41300000    # 11.0f

    .line 402
    .line 403
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 404
    .line 405
    .line 406
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 407
    .line 408
    .line 409
    const/high16 v0, 0x41180000    # 9.5f

    .line 410
    .line 411
    const/high16 v2, 0x41480000    # 12.5f

    .line 412
    .line 413
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 414
    .line 415
    .line 416
    const/high16 v17, 0x41000000    # 8.0f

    .line 417
    .line 418
    const/high16 v18, 0x41300000    # 11.0f

    .line 419
    .line 420
    const v13, 0x410ab852    # 8.67f

    .line 421
    .line 422
    .line 423
    const/high16 v14, 0x41480000    # 12.5f

    .line 424
    .line 425
    const/high16 v15, 0x41000000    # 8.0f

    .line 426
    .line 427
    const v16, 0x413d47ae    # 11.83f

    .line 428
    .line 429
    .line 430
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 431
    .line 432
    .line 433
    const/high16 v0, 0x40400000    # 3.0f

    .line 434
    .line 435
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 436
    .line 437
    .line 438
    const/high16 v17, 0x41180000    # 9.5f

    .line 439
    .line 440
    const/high16 v18, 0x41480000    # 12.5f

    .line 441
    .line 442
    const/high16 v13, 0x41300000    # 11.0f

    .line 443
    .line 444
    const v14, 0x413d47ae    # 11.83f

    .line 445
    .line 446
    .line 447
    const v15, 0x412547ae    # 10.33f

    .line 448
    .line 449
    .line 450
    const/high16 v16, 0x41480000    # 12.5f

    .line 451
    .line 452
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 453
    .line 454
    .line 455
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 456
    .line 457
    .line 458
    const/high16 v0, 0x40c00000    # 6.0f

    .line 459
    .line 460
    const/high16 v2, 0x41300000    # 11.0f

    .line 461
    .line 462
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 463
    .line 464
    .line 465
    const/high16 v17, -0x40400000    # -1.5f

    .line 466
    .line 467
    const/high16 v18, 0x3fc00000    # 1.5f

    .line 468
    .line 469
    const/4 v13, 0x0

    .line 470
    const v14, 0x3f547ae1    # 0.83f

    .line 471
    .line 472
    .line 473
    const v15, -0x40d47ae1    # -0.67f

    .line 474
    .line 475
    .line 476
    const/high16 v16, 0x3fc00000    # 1.5f

    .line 477
    .line 478
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 479
    .line 480
    .line 481
    const v0, 0x413d47ae    # 11.83f

    .line 482
    .line 483
    .line 484
    const/high16 v2, 0x40400000    # 3.0f

    .line 485
    .line 486
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 487
    .line 488
    .line 489
    const/high16 v0, 0x40c00000    # 6.0f

    .line 490
    .line 491
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 492
    .line 493
    .line 494
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 495
    .line 496
    .line 497
    const v0, 0x40951eb8    # 4.66f

    .line 498
    .line 499
    .line 500
    const/high16 v2, 0x41a00000    # 20.0f

    .line 501
    .line 502
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 503
    .line 504
    .line 505
    const v17, 0x3f11eb85    # 0.57f

    .line 506
    .line 507
    .line 508
    const v18, -0x3f4d70a4    # -5.58f

    .line 509
    .line 510
    .line 511
    const v13, 0x3ec7ae14    # 0.39f

    .line 512
    .line 513
    .line 514
    const v14, -0x4011eb85    # -1.86f

    .line 515
    .line 516
    .line 517
    const v15, 0x3f0a3d71    # 0.54f

    .line 518
    .line 519
    .line 520
    const v16, -0x3f8b851f    # -3.82f

    .line 521
    .line 522
    .line 523
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 524
    .line 525
    .line 526
    const v17, 0x3fe147ae    # 1.76f

    .line 527
    .line 528
    .line 529
    const v18, -0x40851eb8    # -0.98f

    .line 530
    .line 531
    .line 532
    const v13, 0x3f2e147b    # 0.68f

    .line 533
    .line 534
    .line 535
    const v14, -0x41e66666    # -0.15f

    .line 536
    .line 537
    .line 538
    const v15, 0x3fa51eb8    # 1.29f

    .line 539
    .line 540
    .line 541
    const v16, -0x41051eb8    # -0.49f

    .line 542
    .line 543
    .line 544
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 545
    .line 546
    .line 547
    const v17, 0x3f59999a    # 0.85f

    .line 548
    .line 549
    .line 550
    const v18, 0x3f1eb852    # 0.62f

    .line 551
    .line 552
    .line 553
    const/high16 v13, 0x3e800000    # 0.25f

    .line 554
    .line 555
    const/high16 v14, 0x3e800000    # 0.25f

    .line 556
    .line 557
    const v15, 0x3f0a3d71    # 0.54f

    .line 558
    .line 559
    .line 560
    const v16, 0x3ee66666    # 0.45f

    .line 561
    .line 562
    .line 563
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 564
    .line 565
    .line 566
    const v17, -0x40fae148    # -0.52f

    .line 567
    .line 568
    .line 569
    const v18, 0x40bdc28f    # 5.93f

    .line 570
    .line 571
    .line 572
    const v13, -0x42333333    # -0.1f

    .line 573
    .line 574
    .line 575
    const v14, 0x3fef5c29    # 1.87f

    .line 576
    .line 577
    .line 578
    const v15, -0x417ae148    # -0.26f

    .line 579
    .line 580
    .line 581
    const/high16 v16, 0x40800000    # 4.0f

    .line 582
    .line 583
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 584
    .line 585
    .line 586
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 587
    .line 588
    .line 589
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 590
    .line 591
    .line 592
    const v0, 0x4115999a    # 9.35f

    .line 593
    .line 594
    .line 595
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 596
    .line 597
    .line 598
    const v17, 0x3ef5c28f    # 0.48f

    .line 599
    .line 600
    .line 601
    const v18, -0x3f4f0a3d    # -5.53f

    .line 602
    .line 603
    .line 604
    const v13, 0x3e75c28f    # 0.24f

    .line 605
    .line 606
    .line 607
    const v14, -0x4015c28f    # -1.83f

    .line 608
    .line 609
    .line 610
    const v15, 0x3ec7ae14    # 0.39f

    .line 611
    .line 612
    .line 613
    const v16, -0x3f8e147b    # -3.78f

    .line 614
    .line 615
    .line 616
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 617
    .line 618
    .line 619
    const v17, 0x400ae148    # 2.17f

    .line 620
    .line 621
    .line 622
    const v18, -0x407d70a4    # -1.02f

    .line 623
    .line 624
    .line 625
    const v13, 0x3f570a3d    # 0.84f

    .line 626
    .line 627
    .line 628
    const v14, -0x425c28f6    # -0.08f

    .line 629
    .line 630
    .line 631
    const v15, 0x3fce147b    # 1.61f

    .line 632
    .line 633
    .line 634
    const v16, -0x4119999a    # -0.45f

    .line 635
    .line 636
    .line 637
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 638
    .line 639
    .line 640
    const v18, 0x3f828f5c    # 1.02f

    .line 641
    .line 642
    .line 643
    const v13, 0x3f0f5c29    # 0.56f

    .line 644
    .line 645
    .line 646
    const v14, 0x3f11eb85    # 0.57f

    .line 647
    .line 648
    .line 649
    const v15, 0x3fa8f5c3    # 1.32f

    .line 650
    .line 651
    .line 652
    const v16, 0x3f70a3d7    # 0.94f

    .line 653
    .line 654
    .line 655
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 656
    .line 657
    .line 658
    const v17, 0x3ef5c28f    # 0.48f

    .line 659
    .line 660
    .line 661
    const v18, 0x40b0f5c3    # 5.53f

    .line 662
    .line 663
    .line 664
    const v13, 0x3dcccccd    # 0.1f

    .line 665
    .line 666
    .line 667
    const/high16 v14, 0x3fe00000    # 1.75f

    .line 668
    .line 669
    const v15, 0x3e75c28f    # 0.24f

    .line 670
    .line 671
    .line 672
    const v16, 0x406ccccd    # 3.7f

    .line 673
    .line 674
    .line 675
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 676
    .line 677
    .line 678
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 679
    .line 680
    .line 681
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 682
    .line 683
    .line 684
    const v0, 0x41855c29    # 16.67f

    .line 685
    .line 686
    .line 687
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 688
    .line 689
    .line 690
    const v17, -0x40fae148    # -0.52f

    .line 691
    .line 692
    .line 693
    const v18, -0x3f423d71    # -5.93f

    .line 694
    .line 695
    .line 696
    const v13, -0x4175c28f    # -0.27f

    .line 697
    .line 698
    .line 699
    const v14, -0x4007ae14    # -1.94f

    .line 700
    .line 701
    .line 702
    const v15, -0x4123d70a    # -0.43f

    .line 703
    .line 704
    .line 705
    const v16, -0x3f7dc28f    # -4.07f

    .line 706
    .line 707
    .line 708
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 709
    .line 710
    .line 711
    const v17, 0x3f59999a    # 0.85f

    .line 712
    .line 713
    .line 714
    const v18, -0x40e147ae    # -0.62f

    .line 715
    .line 716
    .line 717
    const v13, 0x3e9eb852    # 0.31f

    .line 718
    .line 719
    .line 720
    const v14, -0x41d1eb85    # -0.17f

    .line 721
    .line 722
    .line 723
    const v15, 0x3f1c28f6    # 0.61f

    .line 724
    .line 725
    .line 726
    const v16, -0x41428f5c    # -0.37f

    .line 727
    .line 728
    .line 729
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 730
    .line 731
    .line 732
    const v17, 0x3fe147ae    # 1.76f

    .line 733
    .line 734
    .line 735
    const v18, 0x3f7ae148    # 0.98f

    .line 736
    .line 737
    .line 738
    const v13, 0x3ef0a3d7    # 0.47f

    .line 739
    .line 740
    .line 741
    const v14, 0x3ef5c28f    # 0.48f

    .line 742
    .line 743
    .line 744
    const v15, 0x3f8a3d71    # 1.08f

    .line 745
    .line 746
    .line 747
    const v16, 0x3f547ae1    # 0.83f

    .line 748
    .line 749
    .line 750
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 751
    .line 752
    .line 753
    const v17, 0x3f11eb85    # 0.57f

    .line 754
    .line 755
    .line 756
    const v18, 0x40b28f5c    # 5.58f

    .line 757
    .line 758
    .line 759
    const v13, 0x3cf5c28f    # 0.03f

    .line 760
    .line 761
    .line 762
    const v14, 0x3fe147ae    # 1.76f

    .line 763
    .line 764
    .line 765
    const v15, 0x3e3851ec    # 0.18f

    .line 766
    .line 767
    .line 768
    const v16, 0x406e147b    # 3.72f

    .line 769
    .line 770
    .line 771
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 772
    .line 773
    .line 774
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 775
    .line 776
    .line 777
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 778
    .line 779
    .line 780
    const/high16 v0, 0x419c0000    # 19.5f

    .line 781
    .line 782
    const/high16 v2, 0x41480000    # 12.5f

    .line 783
    .line 784
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 785
    .line 786
    .line 787
    const/high16 v17, -0x40400000    # -1.5f

    .line 788
    .line 789
    const/high16 v18, -0x40400000    # -1.5f

    .line 790
    .line 791
    const v13, -0x40ab851f    # -0.83f

    .line 792
    .line 793
    .line 794
    const/4 v14, 0x0

    .line 795
    const/high16 v15, -0x40400000    # -1.5f

    .line 796
    .line 797
    const v16, -0x40d47ae1    # -0.67f

    .line 798
    .line 799
    .line 800
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 801
    .line 802
    .line 803
    const/high16 v0, 0x40400000    # 3.0f

    .line 804
    .line 805
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 806
    .line 807
    .line 808
    const/high16 v17, 0x419c0000    # 19.5f

    .line 809
    .line 810
    const/high16 v18, 0x41480000    # 12.5f

    .line 811
    .line 812
    const/high16 v13, 0x41a80000    # 21.0f

    .line 813
    .line 814
    const v14, 0x413d47ae    # 11.83f

    .line 815
    .line 816
    .line 817
    const v15, 0x41a2a3d7    # 20.33f

    .line 818
    .line 819
    .line 820
    const/high16 v16, 0x41480000    # 12.5f

    .line 821
    .line 822
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 823
    .line 824
    .line 825
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 826
    .line 827
    .line 828
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 829
    .line 830
    .line 831
    move-result-object v2

    .line 832
    const/16 v16, 0x3800

    .line 833
    .line 834
    const/16 v17, 0x0

    .line 835
    .line 836
    const/high16 v6, 0x3f800000    # 1.0f

    .line 837
    .line 838
    const/high16 v8, 0x3f800000    # 1.0f

    .line 839
    .line 840
    const/4 v7, 0x0

    .line 841
    const/high16 v9, 0x3f800000    # 1.0f

    .line 842
    .line 843
    const/high16 v12, 0x3f800000    # 1.0f

    .line 844
    .line 845
    const/4 v13, 0x0

    .line 846
    const/4 v14, 0x0

    .line 847
    const/4 v15, 0x0

    .line 848
    const-string v4, ""

    .line 849
    .line 850
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 851
    .line 852
    .line 853
    move-result-object v0

    .line 854
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 855
    .line 856
    .line 857
    move-result-object v0

    .line 858
    sput-object v0, Landroidx/compose/material/icons/rounded/FestivalKt;->_festival:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 859
    .line 860
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 861
    .line 862
    .line 863
    return-object v0
.end method
