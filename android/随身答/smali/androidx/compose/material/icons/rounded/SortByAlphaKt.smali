.class public final Landroidx/compose/material/icons/rounded/SortByAlphaKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_sortByAlpha",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "SortByAlpha",
        "Landroidx/compose/material/icons/Icons$Rounded;",
        "getSortByAlpha",
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
        "SMAP\nSortByAlpha.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SortByAlpha.kt\nandroidx/compose/material/icons/rounded/SortByAlphaKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,82:1\n212#2,12:83\n233#2,18:96\n253#2:133\n174#3:95\n705#4,2:114\n717#4,2:116\n719#4,11:122\n72#5,4:118\n*S KotlinDebug\n*F\n+ 1 SortByAlpha.kt\nandroidx/compose/material/icons/rounded/SortByAlphaKt\n*L\n29#1:83,12\n30#1:96,18\n30#1:133\n29#1:95\n30#1:114,2\n30#1:116,2\n30#1:122,11\n30#1:118,4\n*E\n"
    }
.end annotation


# static fields
.field private static _sortByAlpha:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getSortByAlpha(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/SortByAlphaKt;->_sortByAlpha:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.SortByAlpha"

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
    const v0, 0x414ee148    # 12.93f

    .line 71
    .line 72
    .line 73
    const v2, 0x4029999a    # 2.65f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v17, -0x40ca3d71    # -0.71f

    .line 80
    .line 81
    .line 82
    const/16 v18, 0x0

    .line 83
    .line 84
    const v13, -0x41b33333    # -0.2f

    .line 85
    .line 86
    .line 87
    const v14, -0x41b33333    # -0.2f

    .line 88
    .line 89
    .line 90
    const v15, -0x40fd70a4    # -0.51f

    .line 91
    .line 92
    .line 93
    const v16, -0x41b33333    # -0.2f

    .line 94
    .line 95
    .line 96
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 97
    .line 98
    .line 99
    const v0, 0x4000a3d7    # 2.01f

    .line 100
    .line 101
    .line 102
    const v2, -0x3fff5c29    # -2.01f

    .line 103
    .line 104
    .line 105
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 106
    .line 107
    .line 108
    const v0, 0x40970a3d    # 4.72f

    .line 109
    .line 110
    .line 111
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 112
    .line 113
    .line 114
    const/high16 v0, -0x40000000    # -2.0f

    .line 115
    .line 116
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 117
    .line 118
    .line 119
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 120
    .line 121
    .line 122
    const v0, 0x4143ae14    # 12.23f

    .line 123
    .line 124
    .line 125
    const v2, 0x41aacccd    # 21.35f

    .line 126
    .line 127
    .line 128
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 129
    .line 130
    .line 131
    const v17, 0x3f35c28f    # 0.71f

    .line 132
    .line 133
    .line 134
    const v13, 0x3e4ccccd    # 0.2f

    .line 135
    .line 136
    .line 137
    const v14, 0x3e4ccccd    # 0.2f

    .line 138
    .line 139
    .line 140
    const v15, 0x3f028f5c    # 0.51f

    .line 141
    .line 142
    .line 143
    const v16, 0x3e4ccccd    # 0.2f

    .line 144
    .line 145
    .line 146
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 147
    .line 148
    .line 149
    const v0, -0x40028f5c    # -1.98f

    .line 150
    .line 151
    .line 152
    const v2, 0x3ffd70a4    # 1.98f

    .line 153
    .line 154
    .line 155
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 156
    .line 157
    .line 158
    const v0, -0x3f6ae148    # -4.66f

    .line 159
    .line 160
    .line 161
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 162
    .line 163
    .line 164
    const v0, 0x3ffc28f6    # 1.97f

    .line 165
    .line 166
    .line 167
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 168
    .line 169
    .line 170
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 171
    .line 172
    .line 173
    const v0, 0x412fae14    # 10.98f

    .line 174
    .line 175
    .line 176
    const v2, 0x418dd70a    # 17.73f

    .line 177
    .line 178
    .line 179
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 180
    .line 181
    .line 182
    const v17, 0x3f4a3d71    # 0.79f

    .line 183
    .line 184
    .line 185
    const v18, -0x406b851f    # -1.16f

    .line 186
    .line 187
    .line 188
    const v13, 0x3f19999a    # 0.6f

    .line 189
    .line 190
    .line 191
    const/4 v14, 0x0

    .line 192
    const v15, 0x3f8147ae    # 1.01f

    .line 193
    .line 194
    .line 195
    const v16, -0x40e66666    # -0.6f

    .line 196
    .line 197
    .line 198
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 199
    .line 200
    .line 201
    const v0, 0x4100a3d7    # 8.04f

    .line 202
    .line 203
    .line 204
    const v2, 0x40e0f5c3    # 7.03f

    .line 205
    .line 206
    .line 207
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 208
    .line 209
    .line 210
    const v17, -0x4070a3d7    # -1.12f

    .line 211
    .line 212
    .line 213
    const v18, -0x40bd70a4    # -0.76f

    .line 214
    .line 215
    .line 216
    const v13, -0x41c7ae14    # -0.18f

    .line 217
    .line 218
    .line 219
    const v14, -0x41147ae1    # -0.46f

    .line 220
    .line 221
    .line 222
    const v15, -0x40deb852    # -0.63f

    .line 223
    .line 224
    .line 225
    const v16, -0x40bd70a4    # -0.76f

    .line 226
    .line 227
    .line 228
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 229
    .line 230
    .line 231
    const v18, 0x3f428f5c    # 0.76f

    .line 232
    .line 233
    .line 234
    const v13, -0x41051eb8    # -0.49f

    .line 235
    .line 236
    .line 237
    const/4 v14, 0x0

    .line 238
    const v15, -0x408f5c29    # -0.94f

    .line 239
    .line 240
    .line 241
    const v16, 0x3e99999a    # 0.3f

    .line 242
    .line 243
    .line 244
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 245
    .line 246
    .line 247
    const v0, -0x3f90a3d7    # -3.74f

    .line 248
    .line 249
    .line 250
    const v2, 0x41187ae1    # 9.53f

    .line 251
    .line 252
    .line 253
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 254
    .line 255
    .line 256
    const v17, 0x3f4a3d71    # 0.79f

    .line 257
    .line 258
    .line 259
    const v18, 0x3f947ae1    # 1.16f

    .line 260
    .line 261
    .line 262
    const v13, -0x419eb852    # -0.22f

    .line 263
    .line 264
    .line 265
    const v14, 0x3f0f5c29    # 0.56f

    .line 266
    .line 267
    .line 268
    const v15, 0x3e428f5c    # 0.19f

    .line 269
    .line 270
    .line 271
    const v16, 0x3f947ae1    # 1.16f

    .line 272
    .line 273
    .line 274
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 275
    .line 276
    .line 277
    const v17, 0x3f4ccccd    # 0.8f

    .line 278
    .line 279
    .line 280
    const v18, -0x40f33333    # -0.55f

    .line 281
    .line 282
    .line 283
    const v13, 0x3eb33333    # 0.35f

    .line 284
    .line 285
    .line 286
    const/4 v14, 0x0

    .line 287
    const v15, 0x3f2b851f    # 0.67f

    .line 288
    .line 289
    .line 290
    const v16, -0x419eb852    # -0.22f

    .line 291
    .line 292
    .line 293
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 294
    .line 295
    .line 296
    const v0, -0x400ccccd    # -1.9f

    .line 297
    .line 298
    .line 299
    const v2, 0x3f35c28f    # 0.71f

    .line 300
    .line 301
    .line 302
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 303
    .line 304
    .line 305
    const v0, 0x40a3851f    # 5.11f

    .line 306
    .line 307
    .line 308
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 309
    .line 310
    .line 311
    const v0, 0x3ff33333    # 1.9f

    .line 312
    .line 313
    .line 314
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 315
    .line 316
    .line 317
    const v18, 0x3f0f5c29    # 0.56f

    .line 318
    .line 319
    .line 320
    const v13, 0x3e051eb8    # 0.13f

    .line 321
    .line 322
    .line 323
    const v14, 0x3eae147b    # 0.34f

    .line 324
    .line 325
    .line 326
    const v15, 0x3ee66666    # 0.45f

    .line 327
    .line 328
    .line 329
    const v16, 0x3f0f5c29    # 0.56f

    .line 330
    .line 331
    .line 332
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 333
    .line 334
    .line 335
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 336
    .line 337
    .line 338
    const v0, 0x415a3d71    # 13.64f

    .line 339
    .line 340
    .line 341
    const v2, 0x409f0a3d    # 4.97f

    .line 342
    .line 343
    .line 344
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 345
    .line 346
    .line 347
    const v0, -0x3f5a3d71    # -5.18f

    .line 348
    .line 349
    .line 350
    const v2, 0x3ff851ec    # 1.94f

    .line 351
    .line 352
    .line 353
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 354
    .line 355
    .line 356
    const v0, 0x40a5c28f    # 5.18f

    .line 357
    .line 358
    .line 359
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 360
    .line 361
    .line 362
    const v0, 0x415a3d71    # 13.64f

    .line 363
    .line 364
    .line 365
    const v2, 0x409f0a3d    # 4.97f

    .line 366
    .line 367
    .line 368
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 369
    .line 370
    .line 371
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 372
    .line 373
    .line 374
    const v0, 0x41a86666    # 21.05f

    .line 375
    .line 376
    .line 377
    const v2, 0x41811eb8    # 16.14f

    .line 378
    .line 379
    .line 380
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 381
    .line 382
    .line 383
    const v0, -0x3f5570a4    # -5.33f

    .line 384
    .line 385
    .line 386
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 387
    .line 388
    .line 389
    const v0, 0x40b70a3d    # 5.72f

    .line 390
    .line 391
    .line 392
    const v2, -0x3efb5c29    # -8.29f

    .line 393
    .line 394
    .line 395
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 396
    .line 397
    .line 398
    const v17, -0x40ae147b    # -0.82f

    .line 399
    .line 400
    .line 401
    const v18, -0x40370a3d    # -1.57f

    .line 402
    .line 403
    .line 404
    const v13, 0x3eeb851f    # 0.46f

    .line 405
    .line 406
    .line 407
    const v14, -0x40d70a3d    # -0.66f

    .line 408
    .line 409
    .line 410
    const v15, -0x435c28f6    # -0.02f

    .line 411
    .line 412
    .line 413
    const v16, -0x40370a3d    # -1.57f

    .line 414
    .line 415
    .line 416
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 417
    .line 418
    .line 419
    const v0, -0x3f30a3d7    # -6.48f

    .line 420
    .line 421
    .line 422
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 423
    .line 424
    .line 425
    const v17, -0x40b5c28f    # -0.79f

    .line 426
    .line 427
    .line 428
    const v18, 0x3f4ccccd    # 0.8f

    .line 429
    .line 430
    .line 431
    const v13, -0x411eb852    # -0.44f

    .line 432
    .line 433
    .line 434
    const/4 v14, 0x0

    .line 435
    const v15, -0x40b5c28f    # -0.79f

    .line 436
    .line 437
    .line 438
    const v16, 0x3eb851ec    # 0.36f

    .line 439
    .line 440
    .line 441
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 442
    .line 443
    .line 444
    const v0, 0x3c23d70a    # 0.01f

    .line 445
    .line 446
    .line 447
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 448
    .line 449
    .line 450
    const v17, 0x3f4a3d71    # 0.79f

    .line 451
    .line 452
    .line 453
    const/4 v13, 0x0

    .line 454
    const v14, 0x3ee147ae    # 0.44f

    .line 455
    .line 456
    .line 457
    const v15, 0x3eb851ec    # 0.36f

    .line 458
    .line 459
    .line 460
    const v16, 0x3f4ccccd    # 0.8f

    .line 461
    .line 462
    .line 463
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 464
    .line 465
    .line 466
    const v0, 0x40a2e148    # 5.09f

    .line 467
    .line 468
    .line 469
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 470
    .line 471
    .line 472
    const v0, -0x3f48a3d7    # -5.73f

    .line 473
    .line 474
    .line 475
    const v2, 0x41047ae1    # 8.28f

    .line 476
    .line 477
    .line 478
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 479
    .line 480
    .line 481
    const v17, 0x3f51eb85    # 0.82f

    .line 482
    .line 483
    .line 484
    const v18, 0x3fc8f5c3    # 1.57f

    .line 485
    .line 486
    .line 487
    const v13, -0x41147ae1    # -0.46f

    .line 488
    .line 489
    .line 490
    const v14, 0x3f28f5c3    # 0.66f

    .line 491
    .line 492
    .line 493
    const v15, 0x3ca3d70a    # 0.02f

    .line 494
    .line 495
    .line 496
    const v16, 0x3fc8f5c3    # 1.57f

    .line 497
    .line 498
    .line 499
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 500
    .line 501
    .line 502
    const v0, 0x40d70a3d    # 6.72f

    .line 503
    .line 504
    .line 505
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 506
    .line 507
    .line 508
    const v17, 0x3f4a3d71    # 0.79f

    .line 509
    .line 510
    .line 511
    const v18, -0x40b5c28f    # -0.79f

    .line 512
    .line 513
    .line 514
    const v13, 0x3ee147ae    # 0.44f

    .line 515
    .line 516
    .line 517
    const/4 v14, 0x0

    .line 518
    const v15, 0x3f4a3d71    # 0.79f

    .line 519
    .line 520
    .line 521
    const v16, -0x4147ae14    # -0.36f

    .line 522
    .line 523
    .line 524
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 525
    .line 526
    .line 527
    const v17, -0x40b851ec    # -0.78f

    .line 528
    .line 529
    .line 530
    const v18, -0x40b0a3d7    # -0.81f

    .line 531
    .line 532
    .line 533
    const v13, 0x3ca3d70a    # 0.02f

    .line 534
    .line 535
    .line 536
    const v14, -0x4119999a    # -0.45f

    .line 537
    .line 538
    .line 539
    const v15, -0x4151eb85    # -0.34f

    .line 540
    .line 541
    .line 542
    const v16, -0x40b0a3d7    # -0.81f

    .line 543
    .line 544
    .line 545
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 546
    .line 547
    .line 548
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 549
    .line 550
    .line 551
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 552
    .line 553
    .line 554
    move-result-object v2

    .line 555
    const/16 v16, 0x3800

    .line 556
    .line 557
    const/16 v17, 0x0

    .line 558
    .line 559
    const/high16 v6, 0x3f800000    # 1.0f

    .line 560
    .line 561
    const/high16 v8, 0x3f800000    # 1.0f

    .line 562
    .line 563
    const/4 v7, 0x0

    .line 564
    const/high16 v9, 0x3f800000    # 1.0f

    .line 565
    .line 566
    const/high16 v12, 0x3f800000    # 1.0f

    .line 567
    .line 568
    const/4 v13, 0x0

    .line 569
    const/4 v14, 0x0

    .line 570
    const/4 v15, 0x0

    .line 571
    const-string v4, ""

    .line 572
    .line 573
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 574
    .line 575
    .line 576
    move-result-object v0

    .line 577
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 578
    .line 579
    .line 580
    move-result-object v0

    .line 581
    sput-object v0, Landroidx/compose/material/icons/rounded/SortByAlphaKt;->_sortByAlpha:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 582
    .line 583
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 584
    .line 585
    .line 586
    return-object v0
.end method
