.class public final Landroidx/compose/material/icons/twotone/ThumbsUpDownKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_thumbsUpDown",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "ThumbsUpDown",
        "Landroidx/compose/material/icons/Icons$TwoTone;",
        "getThumbsUpDown",
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
        "SMAP\nThumbsUpDown.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThumbsUpDown.kt\nandroidx/compose/material/icons/twotone/ThumbsUpDownKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,107:1\n212#2,12:108\n233#2,18:121\n253#2:158\n233#2,18:159\n253#2:196\n174#3:120\n705#4,2:139\n717#4,2:141\n719#4,11:147\n705#4,2:177\n717#4,2:179\n719#4,11:185\n72#5,4:143\n72#5,4:181\n*S KotlinDebug\n*F\n+ 1 ThumbsUpDown.kt\nandroidx/compose/material/icons/twotone/ThumbsUpDownKt\n*L\n29#1:108,12\n30#1:121,18\n30#1:158\n84#1:159,18\n84#1:196\n29#1:120\n30#1:139,2\n30#1:141,2\n30#1:147,11\n84#1:177,2\n84#1:179,2\n84#1:185,11\n30#1:143,4\n84#1:181,4\n*E\n"
    }
.end annotation


# static fields
.field private static _thumbsUpDown:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getThumbsUpDown(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/ThumbsUpDownKt;->_thumbsUpDown:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.ThumbsUpDown"

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
    const/4 v2, 0x0

    .line 50
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 51
    .line 52
    .line 53
    sget-object v18, Landroidx/compose/ui/graphics/StrokeCap;->Companion:Landroidx/compose/ui/graphics/StrokeCap$Companion;

    .line 54
    .line 55
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 56
    .line 57
    .line 58
    move-result v10

    .line 59
    sget-object v19, Landroidx/compose/ui/graphics/StrokeJoin;->Companion:Landroidx/compose/ui/graphics/StrokeJoin$Companion;

    .line 60
    .line 61
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 62
    .line 63
    .line 64
    move-result v11

    .line 65
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 66
    .line 67
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 68
    .line 69
    .line 70
    const/high16 v4, 0x40c00000    # 6.0f

    .line 71
    .line 72
    const/high16 v6, 0x41400000    # 12.0f

    .line 73
    .line 74
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v25, -0x40800000    # -1.0f

    .line 78
    .line 79
    const/high16 v26, -0x40800000    # -1.0f

    .line 80
    .line 81
    const/16 v21, 0x0

    .line 82
    .line 83
    const v22, -0x40f33333    # -0.55f

    .line 84
    .line 85
    .line 86
    const v23, -0x4119999a    # -0.45f

    .line 87
    .line 88
    .line 89
    const/high16 v24, -0x40800000    # -1.0f

    .line 90
    .line 91
    move-object/from16 v20, v2

    .line 92
    .line 93
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 94
    .line 95
    .line 96
    const v4, 0x40ba3d71    # 5.82f

    .line 97
    .line 98
    .line 99
    const/high16 v6, 0x40a00000    # 5.0f

    .line 100
    .line 101
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 102
    .line 103
    .line 104
    const v4, 0x3f28f5c3    # 0.66f

    .line 105
    .line 106
    .line 107
    const v6, -0x3fb47ae1    # -3.18f

    .line 108
    .line 109
    .line 110
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 111
    .line 112
    .line 113
    const v4, 0x3ca3d70a    # 0.02f

    .line 114
    .line 115
    .line 116
    const v6, -0x41947ae1    # -0.23f

    .line 117
    .line 118
    .line 119
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 120
    .line 121
    .line 122
    const v25, -0x41570a3d    # -0.33f

    .line 123
    .line 124
    .line 125
    const v26, -0x40b33333    # -0.8f

    .line 126
    .line 127
    .line 128
    const v22, -0x416147ae    # -0.31f

    .line 129
    .line 130
    .line 131
    const v23, -0x41fae148    # -0.13f

    .line 132
    .line 133
    .line 134
    const v24, -0x40e8f5c3    # -0.59f

    .line 135
    .line 136
    .line 137
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 138
    .line 139
    .line 140
    const v4, 0x40ac28f6    # 5.38f

    .line 141
    .line 142
    .line 143
    const/4 v6, 0x0

    .line 144
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 145
    .line 146
    .line 147
    const v4, 0x3ee147ae    # 0.44f

    .line 148
    .line 149
    .line 150
    const v6, 0x409e147b    # 4.94f

    .line 151
    .line 152
    .line 153
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 154
    .line 155
    .line 156
    const/16 v25, 0x0

    .line 157
    .line 158
    const/high16 v26, 0x40c00000    # 6.0f

    .line 159
    .line 160
    const v21, 0x3e2e147b    # 0.17f

    .line 161
    .line 162
    .line 163
    const v22, 0x40a6b852    # 5.21f

    .line 164
    .line 165
    .line 166
    const/16 v23, 0x0

    .line 167
    .line 168
    const v24, 0x40b2e148    # 5.59f

    .line 169
    .line 170
    .line 171
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 172
    .line 173
    .line 174
    const/high16 v4, 0x40d00000    # 6.5f

    .line 175
    .line 176
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 177
    .line 178
    .line 179
    const/high16 v25, 0x3fc00000    # 1.5f

    .line 180
    .line 181
    const/high16 v26, 0x3fc00000    # 1.5f

    .line 182
    .line 183
    const/16 v21, 0x0

    .line 184
    .line 185
    const v22, 0x3f547ae1    # 0.83f

    .line 186
    .line 187
    .line 188
    const v23, 0x3f2b851f    # 0.67f

    .line 189
    .line 190
    .line 191
    const/high16 v24, 0x3fc00000    # 1.5f

    .line 192
    .line 193
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 194
    .line 195
    .line 196
    const/high16 v4, 0x40d80000    # 6.75f

    .line 197
    .line 198
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 199
    .line 200
    .line 201
    const v25, 0x3fb0a3d7    # 1.38f

    .line 202
    .line 203
    .line 204
    const v26, -0x40970a3d    # -0.91f

    .line 205
    .line 206
    .line 207
    const v21, 0x3f1eb852    # 0.62f

    .line 208
    .line 209
    .line 210
    const/16 v22, 0x0

    .line 211
    .line 212
    const v23, 0x3f933333    # 1.15f

    .line 213
    .line 214
    .line 215
    const v24, -0x413d70a4    # -0.38f

    .line 216
    .line 217
    .line 218
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 219
    .line 220
    .line 221
    const v4, 0x4010a3d7    # 2.26f

    .line 222
    .line 223
    .line 224
    const v6, -0x3f56b852    # -5.29f

    .line 225
    .line 226
    .line 227
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 228
    .line 229
    .line 230
    const v25, 0x3de147ae    # 0.11f

    .line 231
    .line 232
    .line 233
    const v26, -0x40f33333    # -0.55f

    .line 234
    .line 235
    .line 236
    const v21, 0x3d8f5c29    # 0.07f

    .line 237
    .line 238
    .line 239
    const v22, -0x41d1eb85    # -0.17f

    .line 240
    .line 241
    .line 242
    const v23, 0x3de147ae    # 0.11f

    .line 243
    .line 244
    .line 245
    const v24, -0x4147ae14    # -0.36f

    .line 246
    .line 247
    .line 248
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 249
    .line 250
    .line 251
    const/high16 v4, 0x40c00000    # 6.0f

    .line 252
    .line 253
    const/high16 v6, 0x41400000    # 12.0f

    .line 254
    .line 255
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 256
    .line 257
    .line 258
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 259
    .line 260
    .line 261
    const v4, 0x40e428f6    # 7.13f

    .line 262
    .line 263
    .line 264
    const/high16 v6, 0x41200000    # 10.0f

    .line 265
    .line 266
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 267
    .line 268
    .line 269
    const v4, 0x40fd70a4    # 7.92f

    .line 270
    .line 271
    .line 272
    const/high16 v6, 0x41400000    # 12.0f

    .line 273
    .line 274
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 275
    .line 276
    .line 277
    const/high16 v4, 0x40000000    # 2.0f

    .line 278
    .line 279
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 280
    .line 281
    .line 282
    const v4, 0x40c6b852    # 6.21f

    .line 283
    .line 284
    .line 285
    const/high16 v6, 0x40000000    # 2.0f

    .line 286
    .line 287
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 288
    .line 289
    .line 290
    const v4, -0x4008f5c3    # -1.93f

    .line 291
    .line 292
    .line 293
    const v6, 0x3ff70a3d    # 1.93f

    .line 294
    .line 295
    .line 296
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 297
    .line 298
    .line 299
    const v4, 0x40570a3d    # 3.36f

    .line 300
    .line 301
    .line 302
    const/high16 v6, 0x40e00000    # 7.0f

    .line 303
    .line 304
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 305
    .line 306
    .line 307
    const/high16 v4, 0x40e00000    # 7.0f

    .line 308
    .line 309
    const/high16 v6, 0x41200000    # 10.0f

    .line 310
    .line 311
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 312
    .line 313
    .line 314
    const v4, 0x3e051eb8    # 0.13f

    .line 315
    .line 316
    .line 317
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 318
    .line 319
    .line 320
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 321
    .line 322
    .line 323
    const/high16 v4, 0x41b40000    # 22.5f

    .line 324
    .line 325
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 326
    .line 327
    .line 328
    const/high16 v4, -0x3f280000    # -6.75f

    .line 329
    .line 330
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 331
    .line 332
    .line 333
    const v25, -0x404f5c29    # -1.38f

    .line 334
    .line 335
    .line 336
    const v26, 0x3f68f5c3    # 0.91f

    .line 337
    .line 338
    .line 339
    const v21, -0x40e147ae    # -0.62f

    .line 340
    .line 341
    .line 342
    const/16 v22, 0x0

    .line 343
    .line 344
    const v23, -0x406ccccd    # -1.15f

    .line 345
    .line 346
    .line 347
    const v24, 0x3ec28f5c    # 0.38f

    .line 348
    .line 349
    .line 350
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 351
    .line 352
    .line 353
    const v4, -0x3fef5c29    # -2.26f

    .line 354
    .line 355
    .line 356
    const v6, 0x40a947ae    # 5.29f

    .line 357
    .line 358
    .line 359
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 360
    .line 361
    .line 362
    const v25, -0x421eb852    # -0.11f

    .line 363
    .line 364
    .line 365
    const v26, 0x3f0ccccd    # 0.55f

    .line 366
    .line 367
    .line 368
    const v21, -0x4270a3d7    # -0.07f

    .line 369
    .line 370
    .line 371
    const v22, 0x3e2e147b    # 0.17f

    .line 372
    .line 373
    .line 374
    const v23, -0x421eb852    # -0.11f

    .line 375
    .line 376
    .line 377
    const v24, 0x3eb851ec    # 0.36f

    .line 378
    .line 379
    .line 380
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 381
    .line 382
    .line 383
    const/high16 v4, 0x41900000    # 18.0f

    .line 384
    .line 385
    const/high16 v6, 0x41400000    # 12.0f

    .line 386
    .line 387
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 388
    .line 389
    .line 390
    const/high16 v25, 0x3f800000    # 1.0f

    .line 391
    .line 392
    const/high16 v26, 0x3f800000    # 1.0f

    .line 393
    .line 394
    const/16 v21, 0x0

    .line 395
    .line 396
    const v22, 0x3f0ccccd    # 0.55f

    .line 397
    .line 398
    .line 399
    const v23, 0x3ee66666    # 0.45f

    .line 400
    .line 401
    .line 402
    const/high16 v24, 0x3f800000    # 1.0f

    .line 403
    .line 404
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 405
    .line 406
    .line 407
    const v4, 0x40a5c28f    # 5.18f

    .line 408
    .line 409
    .line 410
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 411
    .line 412
    .line 413
    const v4, -0x40d70a3d    # -0.66f

    .line 414
    .line 415
    .line 416
    const v6, 0x404b851f    # 3.18f

    .line 417
    .line 418
    .line 419
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 420
    .line 421
    .line 422
    const v4, -0x435c28f6    # -0.02f

    .line 423
    .line 424
    .line 425
    const v6, 0x3e75c28f    # 0.24f

    .line 426
    .line 427
    .line 428
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 429
    .line 430
    .line 431
    const v25, 0x3ea8f5c3    # 0.33f

    .line 432
    .line 433
    .line 434
    const v26, 0x3f4ccccd    # 0.8f

    .line 435
    .line 436
    .line 437
    const v22, 0x3e9eb852    # 0.31f

    .line 438
    .line 439
    .line 440
    const v23, 0x3e051eb8    # 0.13f

    .line 441
    .line 442
    .line 443
    const v24, 0x3f170a3d    # 0.59f

    .line 444
    .line 445
    .line 446
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 447
    .line 448
    .line 449
    const v4, 0x3f4a3d71    # 0.79f

    .line 450
    .line 451
    .line 452
    const v6, 0x3f47ae14    # 0.78f

    .line 453
    .line 454
    .line 455
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 456
    .line 457
    .line 458
    const v4, -0x3f61eb85    # -4.94f

    .line 459
    .line 460
    .line 461
    const v6, 0x409e147b    # 4.94f

    .line 462
    .line 463
    .line 464
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 465
    .line 466
    .line 467
    const v25, 0x3ee147ae    # 0.44f

    .line 468
    .line 469
    .line 470
    const v26, -0x407851ec    # -1.06f

    .line 471
    .line 472
    .line 473
    const v21, 0x3e8a3d71    # 0.27f

    .line 474
    .line 475
    .line 476
    const v22, -0x4175c28f    # -0.27f

    .line 477
    .line 478
    .line 479
    const v23, 0x3ee147ae    # 0.44f

    .line 480
    .line 481
    .line 482
    const v24, -0x40d9999a    # -0.65f

    .line 483
    .line 484
    .line 485
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 486
    .line 487
    .line 488
    const/high16 v4, -0x3f300000    # -6.5f

    .line 489
    .line 490
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 491
    .line 492
    .line 493
    const/high16 v25, -0x40400000    # -1.5f

    .line 494
    .line 495
    const/high16 v26, -0x40400000    # -1.5f

    .line 496
    .line 497
    const/16 v21, 0x0

    .line 498
    .line 499
    const v22, -0x40ab851f    # -0.83f

    .line 500
    .line 501
    .line 502
    const v23, -0x40d47ae1    # -0.67f

    .line 503
    .line 504
    .line 505
    const/high16 v24, -0x40400000    # -1.5f

    .line 506
    .line 507
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 508
    .line 509
    .line 510
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 511
    .line 512
    .line 513
    const v4, 0x418e51ec    # 17.79f

    .line 514
    .line 515
    .line 516
    const/high16 v6, 0x41b00000    # 22.0f

    .line 517
    .line 518
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 519
    .line 520
    .line 521
    const v4, -0x4008f5c3    # -1.93f

    .line 522
    .line 523
    .line 524
    const v6, 0x3ff70a3d    # 1.93f

    .line 525
    .line 526
    .line 527
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 528
    .line 529
    .line 530
    const v4, 0x3f11eb85    # 0.57f

    .line 531
    .line 532
    .line 533
    const v6, -0x3fd1eb85    # -2.72f

    .line 534
    .line 535
    .line 536
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 537
    .line 538
    .line 539
    const/high16 v4, 0x41880000    # 17.0f

    .line 540
    .line 541
    const/high16 v6, 0x41600000    # 14.0f

    .line 542
    .line 543
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 544
    .line 545
    .line 546
    const v4, -0x41fae148    # -0.13f

    .line 547
    .line 548
    .line 549
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 550
    .line 551
    .line 552
    const v4, 0x4180a3d7    # 16.08f

    .line 553
    .line 554
    .line 555
    const/high16 v6, 0x41400000    # 12.0f

    .line 556
    .line 557
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 558
    .line 559
    .line 560
    const/high16 v4, 0x41b00000    # 22.0f

    .line 561
    .line 562
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 563
    .line 564
    .line 565
    const v4, 0x40b947ae    # 5.79f

    .line 566
    .line 567
    .line 568
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 569
    .line 570
    .line 571
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 572
    .line 573
    .line 574
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 575
    .line 576
    .line 577
    move-result-object v2

    .line 578
    const/16 v16, 0x3800

    .line 579
    .line 580
    const/16 v17, 0x0

    .line 581
    .line 582
    const/high16 v6, 0x3f800000    # 1.0f

    .line 583
    .line 584
    const/high16 v8, 0x3f800000    # 1.0f

    .line 585
    .line 586
    const/4 v7, 0x0

    .line 587
    const/high16 v9, 0x3f800000    # 1.0f

    .line 588
    .line 589
    const/high16 v12, 0x3f800000    # 1.0f

    .line 590
    .line 591
    const/4 v13, 0x0

    .line 592
    const/4 v14, 0x0

    .line 593
    const/4 v15, 0x0

    .line 594
    const-string v4, ""

    .line 595
    .line 596
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 597
    .line 598
    .line 599
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 600
    .line 601
    .line 602
    move-result v3

    .line 603
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 604
    .line 605
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 606
    .line 607
    .line 608
    move-result-wide v6

    .line 609
    const/4 v0, 0x0

    .line 610
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 611
    .line 612
    .line 613
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 614
    .line 615
    .line 616
    move-result v10

    .line 617
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 618
    .line 619
    .line 620
    move-result v11

    .line 621
    new-instance v0, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 622
    .line 623
    invoke-direct {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 624
    .line 625
    .line 626
    const v2, 0x407b851f    # 3.93f

    .line 627
    .line 628
    .line 629
    const v4, 0x4088f5c3    # 4.28f

    .line 630
    .line 631
    .line 632
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 633
    .line 634
    .line 635
    const v2, 0x40c6b852    # 6.21f

    .line 636
    .line 637
    .line 638
    const/high16 v4, 0x40000000    # 2.0f

    .line 639
    .line 640
    invoke-virtual {v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 641
    .line 642
    .line 643
    const/high16 v2, 0x41400000    # 12.0f

    .line 644
    .line 645
    invoke-virtual {v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 646
    .line 647
    .line 648
    const v2, 0x40bd70a4    # 5.92f

    .line 649
    .line 650
    .line 651
    invoke-virtual {v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 652
    .line 653
    .line 654
    const v2, 0x40e428f6    # 7.13f

    .line 655
    .line 656
    .line 657
    const/high16 v4, 0x41200000    # 10.0f

    .line 658
    .line 659
    invoke-virtual {v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 660
    .line 661
    .line 662
    const/high16 v2, 0x40e00000    # 7.0f

    .line 663
    .line 664
    invoke-virtual {v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 665
    .line 666
    .line 667
    const v2, 0x40570a3d    # 3.36f

    .line 668
    .line 669
    .line 670
    invoke-virtual {v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 671
    .line 672
    .line 673
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 674
    .line 675
    .line 676
    const v2, 0x4186f5c3    # 16.87f

    .line 677
    .line 678
    .line 679
    const/high16 v4, 0x41600000    # 14.0f

    .line 680
    .line 681
    invoke-virtual {v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 682
    .line 683
    .line 684
    const/high16 v2, 0x41880000    # 17.0f

    .line 685
    .line 686
    invoke-virtual {v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 687
    .line 688
    .line 689
    const v2, 0x40d47ae1    # 6.64f

    .line 690
    .line 691
    .line 692
    invoke-virtual {v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 693
    .line 694
    .line 695
    const v2, -0x40ee147b    # -0.57f

    .line 696
    .line 697
    .line 698
    const v4, 0x402e147b    # 2.72f

    .line 699
    .line 700
    .line 701
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 702
    .line 703
    .line 704
    const v2, 0x418e51ec    # 17.79f

    .line 705
    .line 706
    .line 707
    const/high16 v4, 0x41b00000    # 22.0f

    .line 708
    .line 709
    invoke-virtual {v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 710
    .line 711
    .line 712
    const/high16 v2, 0x41400000    # 12.0f

    .line 713
    .line 714
    invoke-virtual {v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 715
    .line 716
    .line 717
    const v2, -0x3f428f5c    # -5.92f

    .line 718
    .line 719
    .line 720
    invoke-virtual {v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 721
    .line 722
    .line 723
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 724
    .line 725
    .line 726
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 727
    .line 728
    .line 729
    move-result-object v2

    .line 730
    const v6, 0x3e99999a    # 0.3f

    .line 731
    .line 732
    .line 733
    const v8, 0x3e99999a    # 0.3f

    .line 734
    .line 735
    .line 736
    const/4 v7, 0x0

    .line 737
    const-string v4, ""

    .line 738
    .line 739
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 740
    .line 741
    .line 742
    move-result-object v0

    .line 743
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 744
    .line 745
    .line 746
    move-result-object v0

    .line 747
    sput-object v0, Landroidx/compose/material/icons/twotone/ThumbsUpDownKt;->_thumbsUpDown:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 748
    .line 749
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 750
    .line 751
    .line 752
    return-object v0
.end method
