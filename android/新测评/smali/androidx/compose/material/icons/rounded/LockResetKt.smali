.class public final Landroidx/compose/material/icons/rounded/LockResetKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_lockReset",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "LockReset",
        "Landroidx/compose/material/icons/Icons$Rounded;",
        "getLockReset",
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
        "SMAP\nLockReset.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LockReset.kt\nandroidx/compose/material/icons/rounded/LockResetKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,77:1\n212#2,12:78\n233#2,18:91\n253#2:128\n174#3:90\n705#4,2:109\n717#4,2:111\n719#4,11:117\n72#5,4:113\n*S KotlinDebug\n*F\n+ 1 LockReset.kt\nandroidx/compose/material/icons/rounded/LockResetKt\n*L\n29#1:78,12\n30#1:91,18\n30#1:128\n29#1:90\n30#1:109,2\n30#1:111,2\n30#1:117,11\n30#1:113,4\n*E\n"
    }
.end annotation


# static fields
.field private static _lockReset:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getLockReset(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/LockResetKt;->_lockReset:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.LockReset"

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
    const v0, 0x415428f6    # 13.26f

    .line 71
    .line 72
    .line 73
    const/high16 v2, 0x40400000    # 3.0f

    .line 74
    .line 75
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    const/high16 v17, 0x40800000    # 4.0f

    .line 79
    .line 80
    const/high16 v18, 0x41400000    # 12.0f

    .line 81
    .line 82
    const v13, 0x4102b852    # 8.17f

    .line 83
    .line 84
    .line 85
    const v14, 0x40370a3d    # 2.86f

    .line 86
    .line 87
    .line 88
    const/high16 v15, 0x40800000    # 4.0f

    .line 89
    .line 90
    const v16, 0x40de147b    # 6.94f

    .line 91
    .line 92
    .line 93
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 94
    .line 95
    .line 96
    const v0, 0x400d70a4    # 2.21f

    .line 97
    .line 98
    .line 99
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 100
    .line 101
    .line 102
    const v17, -0x414ccccd    # -0.35f

    .line 103
    .line 104
    .line 105
    const v18, 0x3f59999a    # 0.85f

    .line 106
    .line 107
    .line 108
    const v13, -0x4119999a    # -0.45f

    .line 109
    .line 110
    .line 111
    const/4 v14, 0x0

    .line 112
    const v15, -0x40d47ae1    # -0.67f

    .line 113
    .line 114
    .line 115
    const v16, 0x3f0a3d71    # 0.54f

    .line 116
    .line 117
    .line 118
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 119
    .line 120
    .line 121
    const v0, 0x40328f5c    # 2.79f

    .line 122
    .line 123
    .line 124
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 125
    .line 126
    .line 127
    const v17, 0x3f35c28f    # 0.71f

    .line 128
    .line 129
    .line 130
    const/16 v18, 0x0

    .line 131
    .line 132
    const v13, 0x3e4ccccd    # 0.2f

    .line 133
    .line 134
    .line 135
    const v14, 0x3e4ccccd    # 0.2f

    .line 136
    .line 137
    .line 138
    const v15, 0x3f028f5c    # 0.51f

    .line 139
    .line 140
    .line 141
    const v16, 0x3e4ccccd    # 0.2f

    .line 142
    .line 143
    .line 144
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 145
    .line 146
    .line 147
    const v0, 0x40333333    # 2.8f

    .line 148
    .line 149
    .line 150
    const v2, -0x3fcd70a4    # -2.79f

    .line 151
    .line 152
    .line 153
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 154
    .line 155
    .line 156
    const v17, 0x40f947ae    # 7.79f

    .line 157
    .line 158
    .line 159
    const/high16 v18, 0x41400000    # 12.0f

    .line 160
    .line 161
    const v13, 0x41075c29    # 8.46f

    .line 162
    .line 163
    .line 164
    const v14, 0x4148a3d7    # 12.54f

    .line 165
    .line 166
    .line 167
    const v15, 0x4103d70a    # 8.24f

    .line 168
    .line 169
    .line 170
    const/high16 v16, 0x41400000    # 12.0f

    .line 171
    .line 172
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 173
    .line 174
    .line 175
    const/high16 v0, 0x40c00000    # 6.0f

    .line 176
    .line 177
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 178
    .line 179
    .line 180
    const v17, 0x40e33333    # 7.1f

    .line 181
    .line 182
    .line 183
    const/high16 v18, -0x3f200000    # -7.0f

    .line 184
    .line 185
    const/4 v13, 0x0

    .line 186
    const v14, -0x3f870a3d    # -3.89f

    .line 187
    .line 188
    .line 189
    const v15, 0x404ccccd    # 3.2f

    .line 190
    .line 191
    .line 192
    const v16, -0x3f1e147b    # -7.06f

    .line 193
    .line 194
    .line 195
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 196
    .line 197
    .line 198
    const v17, 0x40dccccd    # 6.9f

    .line 199
    .line 200
    .line 201
    const v18, 0x40dccccd    # 6.9f

    .line 202
    .line 203
    .line 204
    const v13, 0x406d70a4    # 3.71f

    .line 205
    .line 206
    .line 207
    const v14, 0x3d4ccccd    # 0.05f

    .line 208
    .line 209
    .line 210
    const v15, 0x40dae148    # 6.84f

    .line 211
    .line 212
    .line 213
    const v16, 0x404b851f    # 3.18f

    .line 214
    .line 215
    .line 216
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 217
    .line 218
    .line 219
    const/high16 v17, -0x3f200000    # -7.0f

    .line 220
    .line 221
    const v18, 0x40e33333    # 7.1f

    .line 222
    .line 223
    .line 224
    const v13, 0x3d75c28f    # 0.06f

    .line 225
    .line 226
    .line 227
    const v14, 0x407a3d71    # 3.91f

    .line 228
    .line 229
    .line 230
    const v15, -0x3fb9999a    # -3.1f

    .line 231
    .line 232
    .line 233
    const v16, 0x40e33333    # 7.1f

    .line 234
    .line 235
    .line 236
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 237
    .line 238
    .line 239
    const v17, -0x3f78a3d7    # -4.23f

    .line 240
    .line 241
    .line 242
    const v18, -0x4048f5c3    # -1.43f

    .line 243
    .line 244
    .line 245
    const v13, -0x40347ae1    # -1.59f

    .line 246
    .line 247
    .line 248
    const/4 v14, 0x0

    .line 249
    const v15, -0x3fbccccd    # -3.05f

    .line 250
    .line 251
    .line 252
    const v16, -0x40f851ec    # -0.53f

    .line 253
    .line 254
    .line 255
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 256
    .line 257
    .line 258
    const v17, -0x405851ec    # -1.31f

    .line 259
    .line 260
    .line 261
    const v18, 0x3db851ec    # 0.09f

    .line 262
    .line 263
    .line 264
    const v13, -0x41333333    # -0.4f

    .line 265
    .line 266
    .line 267
    const v14, -0x41666666    # -0.3f

    .line 268
    .line 269
    .line 270
    const v15, -0x408a3d71    # -0.96f

    .line 271
    .line 272
    .line 273
    const v16, -0x4175c28f    # -0.27f

    .line 274
    .line 275
    .line 276
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 277
    .line 278
    .line 279
    const/4 v0, 0x0

    .line 280
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 281
    .line 282
    .line 283
    const v17, 0x3db851ec    # 0.09f

    .line 284
    .line 285
    .line 286
    const/high16 v18, 0x3fc00000    # 1.5f

    .line 287
    .line 288
    const v13, -0x4123d70a    # -0.43f

    .line 289
    .line 290
    .line 291
    const v14, 0x3edc28f6    # 0.43f

    .line 292
    .line 293
    .line 294
    const v15, -0x413851ec    # -0.39f

    .line 295
    .line 296
    .line 297
    const v16, 0x3f91eb85    # 1.14f

    .line 298
    .line 299
    .line 300
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 301
    .line 302
    .line 303
    const/high16 v17, 0x41500000    # 13.0f

    .line 304
    .line 305
    const/high16 v18, 0x41a80000    # 21.0f

    .line 306
    .line 307
    const v13, 0x4110f5c3    # 9.06f

    .line 308
    .line 309
    .line 310
    const v14, 0x41a27ae1    # 20.31f

    .line 311
    .line 312
    .line 313
    const v15, 0x412f3333    # 10.95f

    .line 314
    .line 315
    .line 316
    const/high16 v16, 0x41a80000    # 21.0f

    .line 317
    .line 318
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 319
    .line 320
    .line 321
    const/high16 v17, 0x41100000    # 9.0f

    .line 322
    .line 323
    const/high16 v18, -0x3eec0000    # -9.25f

    .line 324
    .line 325
    const v13, 0x40a1eb85    # 5.06f

    .line 326
    .line 327
    .line 328
    const/4 v14, 0x0

    .line 329
    const v15, 0x41123d71    # 9.14f

    .line 330
    .line 331
    .line 332
    const v16, -0x3f7a8f5c    # -4.17f

    .line 333
    .line 334
    .line 335
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 336
    .line 337
    .line 338
    const v17, 0x415428f6    # 13.26f

    .line 339
    .line 340
    .line 341
    const/high16 v18, 0x40400000    # 3.0f

    .line 342
    .line 343
    const v13, 0x41aef5c3    # 21.87f

    .line 344
    .line 345
    .line 346
    const v14, 0x40e1999a    # 7.05f

    .line 347
    .line 348
    .line 349
    const v15, 0x418f999a    # 17.95f

    .line 350
    .line 351
    .line 352
    const v16, 0x404851ec    # 3.13f

    .line 353
    .line 354
    .line 355
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 356
    .line 357
    .line 358
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 359
    .line 360
    .line 361
    const/high16 v0, 0x41700000    # 15.0f

    .line 362
    .line 363
    const/high16 v2, 0x41300000    # 11.0f

    .line 364
    .line 365
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 366
    .line 367
    .line 368
    const/high16 v0, -0x40800000    # -1.0f

    .line 369
    .line 370
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 371
    .line 372
    .line 373
    const/high16 v17, -0x40000000    # -2.0f

    .line 374
    .line 375
    const/high16 v18, -0x40000000    # -2.0f

    .line 376
    .line 377
    const/4 v13, 0x0

    .line 378
    const v14, -0x40733333    # -1.1f

    .line 379
    .line 380
    .line 381
    const v15, -0x4099999a    # -0.9f

    .line 382
    .line 383
    .line 384
    const/high16 v16, -0x40000000    # -2.0f

    .line 385
    .line 386
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 387
    .line 388
    .line 389
    const v0, 0x3f666666    # 0.9f

    .line 390
    .line 391
    .line 392
    const/high16 v2, 0x40000000    # 2.0f

    .line 393
    .line 394
    const/high16 v4, -0x40000000    # -2.0f

    .line 395
    .line 396
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 397
    .line 398
    .line 399
    const/high16 v0, 0x3f800000    # 1.0f

    .line 400
    .line 401
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 402
    .line 403
    .line 404
    const/high16 v17, -0x40800000    # -1.0f

    .line 405
    .line 406
    const/high16 v18, 0x3f800000    # 1.0f

    .line 407
    .line 408
    const v13, -0x40f33333    # -0.55f

    .line 409
    .line 410
    .line 411
    const/4 v14, 0x0

    .line 412
    const/high16 v15, -0x40800000    # -1.0f

    .line 413
    .line 414
    const v16, 0x3ee66666    # 0.45f

    .line 415
    .line 416
    .line 417
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 418
    .line 419
    .line 420
    const/high16 v0, 0x40400000    # 3.0f

    .line 421
    .line 422
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 423
    .line 424
    .line 425
    const/high16 v17, 0x3f800000    # 1.0f

    .line 426
    .line 427
    const/4 v13, 0x0

    .line 428
    const v14, 0x3f0ccccd    # 0.55f

    .line 429
    .line 430
    .line 431
    const v15, 0x3ee66666    # 0.45f

    .line 432
    .line 433
    .line 434
    const/high16 v16, 0x3f800000    # 1.0f

    .line 435
    .line 436
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 437
    .line 438
    .line 439
    const/high16 v0, 0x40800000    # 4.0f

    .line 440
    .line 441
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 442
    .line 443
    .line 444
    const/high16 v18, -0x40800000    # -1.0f

    .line 445
    .line 446
    const v13, 0x3f0ccccd    # 0.55f

    .line 447
    .line 448
    .line 449
    const/4 v14, 0x0

    .line 450
    const/high16 v15, 0x3f800000    # 1.0f

    .line 451
    .line 452
    const v16, -0x4119999a    # -0.45f

    .line 453
    .line 454
    .line 455
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 456
    .line 457
    .line 458
    const/high16 v0, -0x3fc00000    # -3.0f

    .line 459
    .line 460
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 461
    .line 462
    .line 463
    const/high16 v17, 0x41700000    # 15.0f

    .line 464
    .line 465
    const/high16 v18, 0x41300000    # 11.0f

    .line 466
    .line 467
    const/high16 v13, 0x41800000    # 16.0f

    .line 468
    .line 469
    const v14, 0x41373333    # 11.45f

    .line 470
    .line 471
    .line 472
    const v15, 0x4178cccd    # 15.55f

    .line 473
    .line 474
    .line 475
    const/high16 v16, 0x41300000    # 11.0f

    .line 476
    .line 477
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 478
    .line 479
    .line 480
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 481
    .line 482
    .line 483
    const/high16 v0, 0x41600000    # 14.0f

    .line 484
    .line 485
    const/high16 v2, 0x41300000    # 11.0f

    .line 486
    .line 487
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 488
    .line 489
    .line 490
    const/high16 v0, -0x40000000    # -2.0f

    .line 491
    .line 492
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 493
    .line 494
    .line 495
    const/high16 v0, -0x40800000    # -1.0f

    .line 496
    .line 497
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 498
    .line 499
    .line 500
    const/high16 v17, 0x3f800000    # 1.0f

    .line 501
    .line 502
    const/high16 v18, -0x40800000    # -1.0f

    .line 503
    .line 504
    const/4 v13, 0x0

    .line 505
    const v14, -0x40f33333    # -0.55f

    .line 506
    .line 507
    .line 508
    const v15, 0x3ee66666    # 0.45f

    .line 509
    .line 510
    .line 511
    const/high16 v16, -0x40800000    # -1.0f

    .line 512
    .line 513
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 514
    .line 515
    .line 516
    const v0, 0x3ee66666    # 0.45f

    .line 517
    .line 518
    .line 519
    const/high16 v2, 0x3f800000    # 1.0f

    .line 520
    .line 521
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 522
    .line 523
    .line 524
    const/high16 v0, 0x41300000    # 11.0f

    .line 525
    .line 526
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 527
    .line 528
    .line 529
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 530
    .line 531
    .line 532
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 533
    .line 534
    .line 535
    move-result-object v2

    .line 536
    const/16 v16, 0x3800

    .line 537
    .line 538
    const/16 v17, 0x0

    .line 539
    .line 540
    const/high16 v6, 0x3f800000    # 1.0f

    .line 541
    .line 542
    const/high16 v8, 0x3f800000    # 1.0f

    .line 543
    .line 544
    const/4 v7, 0x0

    .line 545
    const/high16 v9, 0x3f800000    # 1.0f

    .line 546
    .line 547
    const/high16 v12, 0x3f800000    # 1.0f

    .line 548
    .line 549
    const/4 v14, 0x0

    .line 550
    const/4 v15, 0x0

    .line 551
    const-string v4, ""

    .line 552
    .line 553
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 554
    .line 555
    .line 556
    move-result-object v0

    .line 557
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 558
    .line 559
    .line 560
    move-result-object v0

    .line 561
    sput-object v0, Landroidx/compose/material/icons/rounded/LockResetKt;->_lockReset:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 562
    .line 563
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 564
    .line 565
    .line 566
    return-object v0
.end method
