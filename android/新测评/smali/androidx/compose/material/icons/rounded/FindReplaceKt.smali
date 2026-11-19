.class public final Landroidx/compose/material/icons/rounded/FindReplaceKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_findReplace",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "FindReplace",
        "Landroidx/compose/material/icons/Icons$Rounded;",
        "getFindReplace",
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
        "SMAP\nFindReplace.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FindReplace.kt\nandroidx/compose/material/icons/rounded/FindReplaceKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,72:1\n212#2,12:73\n233#2,18:86\n253#2:123\n174#3:85\n705#4,2:104\n717#4,2:106\n719#4,11:112\n72#5,4:108\n*S KotlinDebug\n*F\n+ 1 FindReplace.kt\nandroidx/compose/material/icons/rounded/FindReplaceKt\n*L\n29#1:73,12\n30#1:86,18\n30#1:123\n29#1:85\n30#1:104,2\n30#1:106,2\n30#1:112,11\n30#1:108,4\n*E\n"
    }
.end annotation


# static fields
.field private static _findReplace:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getFindReplace(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/FindReplaceKt;->_findReplace:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.FindReplace"

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
    const/high16 v0, 0x41300000    # 11.0f

    .line 71
    .line 72
    const/high16 v2, 0x40c00000    # 6.0f

    .line 73
    .line 74
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const v17, 0x40628f5c    # 3.54f

    .line 78
    .line 79
    .line 80
    const v18, 0x3fbae148    # 1.46f

    .line 81
    .line 82
    .line 83
    const v13, 0x3fb0a3d7    # 1.38f

    .line 84
    .line 85
    .line 86
    const/4 v14, 0x0

    .line 87
    const v15, 0x402851ec    # 2.63f

    .line 88
    .line 89
    .line 90
    const v16, 0x3f0f5c29    # 0.56f

    .line 91
    .line 92
    .line 93
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 94
    .line 95
    .line 96
    const v0, 0x3fd851ec    # 1.69f

    .line 97
    .line 98
    .line 99
    const v2, -0x4027ae14    # -1.69f

    .line 100
    .line 101
    .line 102
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 103
    .line 104
    .line 105
    const v17, 0x3eb851ec    # 0.36f

    .line 106
    .line 107
    .line 108
    const v18, 0x3f59999a    # 0.85f

    .line 109
    .line 110
    .line 111
    const v13, -0x416147ae    # -0.31f

    .line 112
    .line 113
    .line 114
    const v14, 0x3e9eb852    # 0.31f

    .line 115
    .line 116
    .line 117
    const v15, -0x4247ae14    # -0.09f

    .line 118
    .line 119
    .line 120
    const v16, 0x3f59999a    # 0.85f

    .line 121
    .line 122
    .line 123
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 124
    .line 125
    .line 126
    const v0, 0x408947ae    # 4.29f

    .line 127
    .line 128
    .line 129
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 130
    .line 131
    .line 132
    const/high16 v17, 0x3f000000    # 0.5f

    .line 133
    .line 134
    const/high16 v18, -0x41000000    # -0.5f

    .line 135
    .line 136
    const v13, 0x3e8f5c29    # 0.28f

    .line 137
    .line 138
    .line 139
    const/4 v14, 0x0

    .line 140
    const/high16 v15, 0x3f000000    # 0.5f

    .line 141
    .line 142
    const v16, -0x419eb852    # -0.22f

    .line 143
    .line 144
    .line 145
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 146
    .line 147
    .line 148
    const/high16 v0, 0x41900000    # 18.0f

    .line 149
    .line 150
    const v2, 0x40a6b852    # 5.21f

    .line 151
    .line 152
    .line 153
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 154
    .line 155
    .line 156
    const v17, -0x40a66666    # -0.85f

    .line 157
    .line 158
    .line 159
    const v18, -0x414ccccd    # -0.35f

    .line 160
    .line 161
    .line 162
    const/4 v13, 0x0

    .line 163
    const v14, -0x4119999a    # -0.45f

    .line 164
    .line 165
    .line 166
    const v15, -0x40f5c28f    # -0.54f

    .line 167
    .line 168
    .line 169
    const v16, -0x40d47ae1    # -0.67f

    .line 170
    .line 171
    .line 172
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 173
    .line 174
    .line 175
    const v0, 0x3f99999a    # 1.2f

    .line 176
    .line 177
    .line 178
    const v2, -0x40666666    # -1.2f

    .line 179
    .line 180
    .line 181
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 182
    .line 183
    .line 184
    const/high16 v17, 0x41300000    # 11.0f

    .line 185
    .line 186
    const/high16 v18, 0x40800000    # 4.0f

    .line 187
    .line 188
    const v13, 0x416ae148    # 14.68f

    .line 189
    .line 190
    .line 191
    const v14, 0x4098f5c3    # 4.78f

    .line 192
    .line 193
    .line 194
    const v15, 0x414ee148    # 12.93f

    .line 195
    .line 196
    .line 197
    const/high16 v16, 0x40800000    # 4.0f

    .line 198
    .line 199
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 200
    .line 201
    .line 202
    const v17, 0x408d70a4    # 4.42f

    .line 203
    .line 204
    .line 205
    const v18, 0x410a3d71    # 8.64f

    .line 206
    .line 207
    .line 208
    const v13, 0x40feb852    # 7.96f

    .line 209
    .line 210
    .line 211
    const/high16 v14, 0x40800000    # 4.0f

    .line 212
    .line 213
    const v15, 0x40ac28f6    # 5.38f

    .line 214
    .line 215
    .line 216
    const v16, 0x40be147b    # 5.94f

    .line 217
    .line 218
    .line 219
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 220
    .line 221
    .line 222
    const v17, 0x3f6e147b    # 0.93f

    .line 223
    .line 224
    .line 225
    const v18, 0x3fae147b    # 1.36f

    .line 226
    .line 227
    .line 228
    const v13, -0x418a3d71    # -0.24f

    .line 229
    .line 230
    .line 231
    const v14, 0x3f28f5c3    # 0.66f

    .line 232
    .line 233
    .line 234
    const v15, 0x3e6b851f    # 0.23f

    .line 235
    .line 236
    .line 237
    const v16, 0x3fae147b    # 1.36f

    .line 238
    .line 239
    .line 240
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 241
    .line 242
    .line 243
    const v18, -0x40d70a3d    # -0.66f

    .line 244
    .line 245
    .line 246
    const v13, 0x3ed70a3d    # 0.42f

    .line 247
    .line 248
    .line 249
    const/4 v14, 0x0

    .line 250
    const v15, 0x3f4a3d71    # 0.79f

    .line 251
    .line 252
    .line 253
    const v16, -0x417ae148    # -0.26f

    .line 254
    .line 255
    .line 256
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 257
    .line 258
    .line 259
    const/high16 v17, 0x41300000    # 11.0f

    .line 260
    .line 261
    const/high16 v18, 0x40c00000    # 6.0f

    .line 262
    .line 263
    const v13, 0x40deb852    # 6.96f

    .line 264
    .line 265
    .line 266
    const v14, 0x40eccccd    # 7.4f

    .line 267
    .line 268
    .line 269
    const v15, 0x410d1eb8    # 8.82f

    .line 270
    .line 271
    .line 272
    const/high16 v16, 0x40c00000    # 6.0f

    .line 273
    .line 274
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 275
    .line 276
    .line 277
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 278
    .line 279
    .line 280
    const v0, 0x41851eb8    # 16.64f

    .line 281
    .line 282
    .line 283
    const v2, 0x41723d71    # 15.14f

    .line 284
    .line 285
    .line 286
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 287
    .line 288
    .line 289
    const v17, 0x3f733333    # 0.95f

    .line 290
    .line 291
    .line 292
    const v18, -0x4019999a    # -1.8f

    .line 293
    .line 294
    .line 295
    const v13, 0x3ecccccd    # 0.4f

    .line 296
    .line 297
    .line 298
    const v14, -0x40f5c28f    # -0.54f

    .line 299
    .line 300
    .line 301
    const v15, 0x3f3851ec    # 0.72f

    .line 302
    .line 303
    .line 304
    const v16, -0x406ccccd    # -1.15f

    .line 305
    .line 306
    .line 307
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 308
    .line 309
    .line 310
    const v17, -0x408f5c29    # -0.94f

    .line 311
    .line 312
    .line 313
    const v18, -0x40547ae1    # -1.34f

    .line 314
    .line 315
    .line 316
    const v13, 0x3e6b851f    # 0.23f

    .line 317
    .line 318
    .line 319
    const v14, -0x40d9999a    # -0.65f

    .line 320
    .line 321
    .line 322
    const/high16 v15, -0x41800000    # -0.25f

    .line 323
    .line 324
    const v16, -0x40547ae1    # -1.34f

    .line 325
    .line 326
    .line 327
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 328
    .line 329
    .line 330
    const v17, -0x4091eb85    # -0.93f

    .line 331
    .line 332
    .line 333
    const v18, 0x3f28f5c3    # 0.66f

    .line 334
    .line 335
    .line 336
    const v13, -0x4128f5c3    # -0.42f

    .line 337
    .line 338
    .line 339
    const/4 v14, 0x0

    .line 340
    const v15, -0x40b5c28f    # -0.79f

    .line 341
    .line 342
    .line 343
    const v16, 0x3e851eb8    # 0.26f

    .line 344
    .line 345
    .line 346
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 347
    .line 348
    .line 349
    const/high16 v17, 0x41300000    # 11.0f

    .line 350
    .line 351
    const/high16 v18, 0x41800000    # 16.0f

    .line 352
    .line 353
    const v13, 0x4170a3d7    # 15.04f

    .line 354
    .line 355
    .line 356
    const v14, 0x4169999a    # 14.6f

    .line 357
    .line 358
    .line 359
    const v15, 0x4152e148    # 13.18f

    .line 360
    .line 361
    .line 362
    const/high16 v16, 0x41800000    # 16.0f

    .line 363
    .line 364
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 365
    .line 366
    .line 367
    const v17, -0x3f9d70a4    # -3.54f

    .line 368
    .line 369
    .line 370
    const v18, -0x40451eb8    # -1.46f

    .line 371
    .line 372
    .line 373
    const v13, -0x404f5c29    # -1.38f

    .line 374
    .line 375
    .line 376
    const/4 v14, 0x0

    .line 377
    const v15, -0x3fd7ae14    # -2.63f

    .line 378
    .line 379
    .line 380
    const v16, -0x40f0a3d7    # -0.56f

    .line 381
    .line 382
    .line 383
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 384
    .line 385
    .line 386
    const v0, 0x3fd851ec    # 1.69f

    .line 387
    .line 388
    .line 389
    const v2, -0x4027ae14    # -1.69f

    .line 390
    .line 391
    .line 392
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 393
    .line 394
    .line 395
    const v17, -0x4147ae14    # -0.36f

    .line 396
    .line 397
    .line 398
    const v18, -0x40a66666    # -0.85f

    .line 399
    .line 400
    .line 401
    const v13, 0x3e9eb852    # 0.31f

    .line 402
    .line 403
    .line 404
    const v14, -0x416147ae    # -0.31f

    .line 405
    .line 406
    .line 407
    const v15, 0x3db851ec    # 0.09f

    .line 408
    .line 409
    .line 410
    const v16, -0x40a66666    # -0.85f

    .line 411
    .line 412
    .line 413
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 414
    .line 415
    .line 416
    const/high16 v0, 0x40900000    # 4.5f

    .line 417
    .line 418
    const/high16 v2, 0x41400000    # 12.0f

    .line 419
    .line 420
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 421
    .line 422
    .line 423
    const/high16 v17, -0x41000000    # -0.5f

    .line 424
    .line 425
    const/high16 v18, 0x3f000000    # 0.5f

    .line 426
    .line 427
    const v13, -0x4170a3d7    # -0.28f

    .line 428
    .line 429
    .line 430
    const/4 v14, 0x0

    .line 431
    const/high16 v15, -0x41000000    # -0.5f

    .line 432
    .line 433
    const v16, 0x3e6147ae    # 0.22f

    .line 434
    .line 435
    .line 436
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 437
    .line 438
    .line 439
    const v0, 0x408947ae    # 4.29f

    .line 440
    .line 441
    .line 442
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 443
    .line 444
    .line 445
    const v17, 0x3f59999a    # 0.85f

    .line 446
    .line 447
    .line 448
    const v18, 0x3eb33333    # 0.35f

    .line 449
    .line 450
    .line 451
    const/4 v13, 0x0

    .line 452
    const v14, 0x3ee66666    # 0.45f

    .line 453
    .line 454
    .line 455
    const v15, 0x3f0a3d71    # 0.54f

    .line 456
    .line 457
    .line 458
    const v16, 0x3f2b851f    # 0.67f

    .line 459
    .line 460
    .line 461
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 462
    .line 463
    .line 464
    const v0, 0x3f99999a    # 1.2f

    .line 465
    .line 466
    .line 467
    const v2, -0x40666666    # -1.2f

    .line 468
    .line 469
    .line 470
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 471
    .line 472
    .line 473
    const/high16 v17, 0x41300000    # 11.0f

    .line 474
    .line 475
    const/high16 v18, 0x41900000    # 18.0f

    .line 476
    .line 477
    const v13, 0x40ea3d71    # 7.32f

    .line 478
    .line 479
    .line 480
    const v14, 0x4189c28f    # 17.22f

    .line 481
    .line 482
    .line 483
    const v15, 0x41111eb8    # 9.07f

    .line 484
    .line 485
    .line 486
    const/high16 v16, 0x41900000    # 18.0f

    .line 487
    .line 488
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 489
    .line 490
    .line 491
    const v17, 0x40847ae1    # 4.14f

    .line 492
    .line 493
    .line 494
    const v18, -0x4051eb85    # -1.36f

    .line 495
    .line 496
    .line 497
    const v13, 0x3fc66666    # 1.55f

    .line 498
    .line 499
    .line 500
    const/4 v14, 0x0

    .line 501
    const v15, 0x403eb852    # 2.98f

    .line 502
    .line 503
    .line 504
    const v16, -0x40fd70a4    # -0.51f

    .line 505
    .line 506
    .line 507
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 508
    .line 509
    .line 510
    const v0, 0x4083851f    # 4.11f

    .line 511
    .line 512
    .line 513
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 514
    .line 515
    .line 516
    const v17, 0x3fbeb852    # 1.49f

    .line 517
    .line 518
    .line 519
    const/16 v18, 0x0

    .line 520
    .line 521
    const v13, 0x3ed1eb85    # 0.41f

    .line 522
    .line 523
    .line 524
    const v14, 0x3ed1eb85    # 0.41f

    .line 525
    .line 526
    .line 527
    const v15, 0x3f8a3d71    # 1.08f

    .line 528
    .line 529
    .line 530
    const v16, 0x3ed1eb85    # 0.41f

    .line 531
    .line 532
    .line 533
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 534
    .line 535
    .line 536
    const/16 v17, 0x0

    .line 537
    .line 538
    const v18, -0x404147ae    # -1.49f

    .line 539
    .line 540
    .line 541
    const v14, -0x412e147b    # -0.41f

    .line 542
    .line 543
    .line 544
    const v15, 0x3ed1eb85    # 0.41f

    .line 545
    .line 546
    .line 547
    const v16, -0x4075c28f    # -1.08f

    .line 548
    .line 549
    .line 550
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 551
    .line 552
    .line 553
    const v0, -0x3f7ccccd    # -4.1f

    .line 554
    .line 555
    .line 556
    const v2, -0x3f7c28f6    # -4.12f

    .line 557
    .line 558
    .line 559
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 560
    .line 561
    .line 562
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 563
    .line 564
    .line 565
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 566
    .line 567
    .line 568
    move-result-object v2

    .line 569
    const/16 v16, 0x3800

    .line 570
    .line 571
    const/16 v17, 0x0

    .line 572
    .line 573
    const/high16 v6, 0x3f800000    # 1.0f

    .line 574
    .line 575
    const/high16 v8, 0x3f800000    # 1.0f

    .line 576
    .line 577
    const/4 v7, 0x0

    .line 578
    const/high16 v9, 0x3f800000    # 1.0f

    .line 579
    .line 580
    const/high16 v12, 0x3f800000    # 1.0f

    .line 581
    .line 582
    const/4 v13, 0x0

    .line 583
    const/4 v14, 0x0

    .line 584
    const/4 v15, 0x0

    .line 585
    const-string v4, ""

    .line 586
    .line 587
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 588
    .line 589
    .line 590
    move-result-object v0

    .line 591
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 592
    .line 593
    .line 594
    move-result-object v0

    .line 595
    sput-object v0, Landroidx/compose/material/icons/rounded/FindReplaceKt;->_findReplace:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 596
    .line 597
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 598
    .line 599
    .line 600
    return-object v0
.end method
