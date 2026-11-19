.class public final Landroidx/compose/material/icons/rounded/SavingsKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_savings",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "Savings",
        "Landroidx/compose/material/icons/Icons$Rounded;",
        "getSavings",
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
        "SMAP\nSavings.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Savings.kt\nandroidx/compose/material/icons/rounded/SavingsKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,78:1\n212#2,12:79\n233#2,18:92\n253#2:129\n174#3:91\n705#4,2:110\n717#4,2:112\n719#4,11:118\n72#5,4:114\n*S KotlinDebug\n*F\n+ 1 Savings.kt\nandroidx/compose/material/icons/rounded/SavingsKt\n*L\n29#1:79,12\n30#1:92,18\n30#1:129\n29#1:91\n30#1:110,2\n30#1:112,2\n30#1:118,11\n30#1:114,4\n*E\n"
    }
.end annotation


# static fields
.field private static _savings:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getSavings(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/SavingsKt;->_savings:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.Savings"

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
    const/high16 v0, 0x40f00000    # 7.5f

    .line 71
    .line 72
    const v2, 0x419ea3d7    # 19.83f

    .line 73
    .line 74
    .line 75
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    const v0, -0x3feeb852    # -2.27f

    .line 79
    .line 80
    .line 81
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 82
    .line 83
    .line 84
    const v17, 0x3ea3d70a    # 0.32f

    .line 85
    .line 86
    .line 87
    const v18, -0x406ccccd    # -1.15f

    .line 88
    .line 89
    .line 90
    const v13, 0x3d8f5c29    # 0.07f

    .line 91
    .line 92
    .line 93
    const v14, -0x4128f5c3    # -0.42f

    .line 94
    .line 95
    .line 96
    const v15, 0x3e3851ec    # 0.18f

    .line 97
    .line 98
    .line 99
    const v16, -0x40b0a3d7    # -0.81f

    .line 100
    .line 101
    .line 102
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 103
    .line 104
    .line 105
    const v17, 0x3db851ec    # 0.09f

    .line 106
    .line 107
    .line 108
    const v18, -0x40a147ae    # -0.87f

    .line 109
    .line 110
    .line 111
    const v13, 0x3de147ae    # 0.11f

    .line 112
    .line 113
    .line 114
    const v14, -0x417ae148    # -0.26f

    .line 115
    .line 116
    .line 117
    const v15, 0x3e19999a    # 0.15f

    .line 118
    .line 119
    .line 120
    const v16, -0x40f0a3d7    # -0.56f

    .line 121
    .line 122
    .line 123
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 124
    .line 125
    .line 126
    const v17, 0x41833333    # 16.4f

    .line 127
    .line 128
    .line 129
    const/high16 v18, 0x40000000    # 2.0f

    .line 130
    .line 131
    const v13, 0x418eb852    # 17.84f

    .line 132
    .line 133
    .line 134
    const v14, 0x401f5c29    # 2.49f

    .line 135
    .line 136
    .line 137
    const v15, 0x41891eb8    # 17.14f

    .line 138
    .line 139
    .line 140
    const v16, 0x3ffeb852    # 1.99f

    .line 141
    .line 142
    .line 143
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 144
    .line 145
    .line 146
    const v17, -0x3f866666    # -3.9f

    .line 147
    .line 148
    .line 149
    const v13, -0x40347ae1    # -1.59f

    .line 150
    .line 151
    .line 152
    const v14, 0x3cf5c28f    # 0.03f

    .line 153
    .line 154
    .line 155
    const/high16 v15, -0x3fc00000    # -3.0f

    .line 156
    .line 157
    const v16, 0x3f4f5c29    # 0.81f

    .line 158
    .line 159
    .line 160
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 161
    .line 162
    .line 163
    const/high16 v0, -0x3f600000    # -5.0f

    .line 164
    .line 165
    const/4 v2, 0x0

    .line 166
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 167
    .line 168
    .line 169
    const/high16 v17, 0x40000000    # 2.0f

    .line 170
    .line 171
    const/high16 v18, 0x41180000    # 9.5f

    .line 172
    .line 173
    const v13, 0x408eb852    # 4.46f

    .line 174
    .line 175
    .line 176
    const/high16 v14, 0x40800000    # 4.0f

    .line 177
    .line 178
    const/high16 v15, 0x40000000    # 2.0f

    .line 179
    .line 180
    const v16, 0x40ceb852    # 6.46f

    .line 181
    .line 182
    .line 183
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 184
    .line 185
    .line 186
    const v17, 0x40051eb8    # 2.08f

    .line 187
    .line 188
    .line 189
    const v18, 0x4120a3d7    # 10.04f

    .line 190
    .line 191
    .line 192
    const/4 v13, 0x0

    .line 193
    const/high16 v14, 0x40100000    # 2.25f

    .line 194
    .line 195
    const v15, 0x3faf5c29    # 1.37f

    .line 196
    .line 197
    .line 198
    const v16, 0x40ef5c29    # 7.48f

    .line 199
    .line 200
    .line 201
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 202
    .line 203
    .line 204
    const v17, 0x40c051ec    # 6.01f

    .line 205
    .line 206
    .line 207
    const/high16 v18, 0x41a80000    # 21.0f

    .line 208
    .line 209
    const v13, 0x408a3d71    # 4.32f

    .line 210
    .line 211
    .line 212
    const v14, 0x41a33333    # 20.4f

    .line 213
    .line 214
    .line 215
    const v15, 0x40a3851f    # 5.11f

    .line 216
    .line 217
    .line 218
    const/high16 v16, 0x41a80000    # 21.0f

    .line 219
    .line 220
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 221
    .line 222
    .line 223
    const/high16 v0, 0x41000000    # 8.0f

    .line 224
    .line 225
    const/high16 v2, 0x41a80000    # 21.0f

    .line 226
    .line 227
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 228
    .line 229
    .line 230
    const/high16 v17, 0x40000000    # 2.0f

    .line 231
    .line 232
    const/high16 v18, -0x40000000    # -2.0f

    .line 233
    .line 234
    const v13, 0x3f8ccccd    # 1.1f

    .line 235
    .line 236
    .line 237
    const/4 v14, 0x0

    .line 238
    const/high16 v15, 0x40000000    # 2.0f

    .line 239
    .line 240
    const v16, -0x4099999a    # -0.9f

    .line 241
    .line 242
    .line 243
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 244
    .line 245
    .line 246
    const/4 v0, 0x0

    .line 247
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 248
    .line 249
    .line 250
    const/high16 v0, 0x40000000    # 2.0f

    .line 251
    .line 252
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 253
    .line 254
    .line 255
    const/4 v0, 0x0

    .line 256
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 257
    .line 258
    .line 259
    const/high16 v18, 0x40000000    # 2.0f

    .line 260
    .line 261
    const/4 v13, 0x0

    .line 262
    const v14, 0x3f8ccccd    # 1.1f

    .line 263
    .line 264
    .line 265
    const v15, 0x3f666666    # 0.9f

    .line 266
    .line 267
    .line 268
    const/high16 v16, 0x40000000    # 2.0f

    .line 269
    .line 270
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 271
    .line 272
    .line 273
    const v0, 0x4000a3d7    # 2.01f

    .line 274
    .line 275
    .line 276
    const/4 v2, 0x0

    .line 277
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 278
    .line 279
    .line 280
    const v17, 0x3ff5c28f    # 1.92f

    .line 281
    .line 282
    .line 283
    const v18, -0x4048f5c3    # -1.43f

    .line 284
    .line 285
    .line 286
    const v13, 0x3f6147ae    # 0.88f

    .line 287
    .line 288
    .line 289
    const/4 v14, 0x0

    .line 290
    const v15, 0x3fd47ae1    # 1.66f

    .line 291
    .line 292
    .line 293
    const v16, -0x40eb851f    # -0.58f

    .line 294
    .line 295
    .line 296
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 297
    .line 298
    .line 299
    const/high16 v0, 0x3fa00000    # 1.25f

    .line 300
    .line 301
    const v2, -0x3f7ae148    # -4.16f

    .line 302
    .line 303
    .line 304
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 305
    .line 306
    .line 307
    const v0, 0x4008f5c3    # 2.14f

    .line 308
    .line 309
    .line 310
    const v2, -0x40c7ae14    # -0.72f

    .line 311
    .line 312
    .line 313
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 314
    .line 315
    .line 316
    const v17, 0x3f2e147b    # 0.68f

    .line 317
    .line 318
    .line 319
    const v18, -0x408ccccd    # -0.95f

    .line 320
    .line 321
    .line 322
    const v13, 0x3ed1eb85    # 0.41f

    .line 323
    .line 324
    .line 325
    const v14, -0x41f0a3d7    # -0.14f

    .line 326
    .line 327
    .line 328
    const v15, 0x3f2e147b    # 0.68f

    .line 329
    .line 330
    .line 331
    const v16, -0x40fae148    # -0.52f

    .line 332
    .line 333
    .line 334
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 335
    .line 336
    .line 337
    const/high16 v0, 0x41080000    # 8.5f

    .line 338
    .line 339
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 340
    .line 341
    .line 342
    const/high16 v17, -0x40800000    # -1.0f

    .line 343
    .line 344
    const/high16 v18, -0x40800000    # -1.0f

    .line 345
    .line 346
    const/4 v13, 0x0

    .line 347
    const v14, -0x40f33333    # -0.55f

    .line 348
    .line 349
    .line 350
    const v15, -0x4119999a    # -0.45f

    .line 351
    .line 352
    .line 353
    const/high16 v16, -0x40800000    # -1.0f

    .line 354
    .line 355
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 356
    .line 357
    .line 358
    const v0, 0x419ea3d7    # 19.83f

    .line 359
    .line 360
    .line 361
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 362
    .line 363
    .line 364
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 365
    .line 366
    .line 367
    const/high16 v0, 0x41400000    # 12.0f

    .line 368
    .line 369
    const/high16 v2, 0x41100000    # 9.0f

    .line 370
    .line 371
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 372
    .line 373
    .line 374
    const/high16 v0, 0x41100000    # 9.0f

    .line 375
    .line 376
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 377
    .line 378
    .line 379
    const/high16 v17, 0x41000000    # 8.0f

    .line 380
    .line 381
    const/high16 v18, 0x41000000    # 8.0f

    .line 382
    .line 383
    const v13, 0x41073333    # 8.45f

    .line 384
    .line 385
    .line 386
    const/high16 v14, 0x41100000    # 9.0f

    .line 387
    .line 388
    const/high16 v15, 0x41000000    # 8.0f

    .line 389
    .line 390
    const v16, 0x4108cccd    # 8.55f

    .line 391
    .line 392
    .line 393
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 394
    .line 395
    .line 396
    const/4 v0, 0x0

    .line 397
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 398
    .line 399
    .line 400
    const/high16 v17, 0x3f800000    # 1.0f

    .line 401
    .line 402
    const/high16 v18, -0x40800000    # -1.0f

    .line 403
    .line 404
    const/4 v13, 0x0

    .line 405
    const v14, -0x40f33333    # -0.55f

    .line 406
    .line 407
    .line 408
    const v15, 0x3ee66666    # 0.45f

    .line 409
    .line 410
    .line 411
    const/high16 v16, -0x40800000    # -1.0f

    .line 412
    .line 413
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 414
    .line 415
    .line 416
    const/high16 v0, 0x40400000    # 3.0f

    .line 417
    .line 418
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 419
    .line 420
    .line 421
    const/high16 v18, 0x3f800000    # 1.0f

    .line 422
    .line 423
    const v13, 0x3f0ccccd    # 0.55f

    .line 424
    .line 425
    .line 426
    const/4 v14, 0x0

    .line 427
    const/high16 v15, 0x3f800000    # 1.0f

    .line 428
    .line 429
    const v16, 0x3ee66666    # 0.45f

    .line 430
    .line 431
    .line 432
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 433
    .line 434
    .line 435
    const/4 v0, 0x0

    .line 436
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 437
    .line 438
    .line 439
    const/high16 v17, 0x41400000    # 12.0f

    .line 440
    .line 441
    const/high16 v18, 0x41100000    # 9.0f

    .line 442
    .line 443
    const/high16 v13, 0x41500000    # 13.0f

    .line 444
    .line 445
    const v14, 0x4108cccd    # 8.55f

    .line 446
    .line 447
    .line 448
    const v15, 0x4148cccd    # 12.55f

    .line 449
    .line 450
    .line 451
    const/high16 v16, 0x41100000    # 9.0f

    .line 452
    .line 453
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 454
    .line 455
    .line 456
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 457
    .line 458
    .line 459
    const/high16 v0, 0x41800000    # 16.0f

    .line 460
    .line 461
    const/high16 v2, 0x41300000    # 11.0f

    .line 462
    .line 463
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 464
    .line 465
    .line 466
    const/high16 v17, -0x40800000    # -1.0f

    .line 467
    .line 468
    const/high16 v18, -0x40800000    # -1.0f

    .line 469
    .line 470
    const v13, -0x40f33333    # -0.55f

    .line 471
    .line 472
    .line 473
    const/4 v14, 0x0

    .line 474
    const/high16 v15, -0x40800000    # -1.0f

    .line 475
    .line 476
    const v16, -0x4119999a    # -0.45f

    .line 477
    .line 478
    .line 479
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 480
    .line 481
    .line 482
    const/high16 v17, 0x3f800000    # 1.0f

    .line 483
    .line 484
    const/4 v13, 0x0

    .line 485
    const v14, -0x40f33333    # -0.55f

    .line 486
    .line 487
    .line 488
    const v15, 0x3ee66666    # 0.45f

    .line 489
    .line 490
    .line 491
    const/high16 v16, -0x40800000    # -1.0f

    .line 492
    .line 493
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 494
    .line 495
    .line 496
    const v0, 0x3ee66666    # 0.45f

    .line 497
    .line 498
    .line 499
    const/high16 v2, 0x3f800000    # 1.0f

    .line 500
    .line 501
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 502
    .line 503
    .line 504
    const/high16 v17, 0x41800000    # 16.0f

    .line 505
    .line 506
    const/high16 v18, 0x41300000    # 11.0f

    .line 507
    .line 508
    const/high16 v13, 0x41880000    # 17.0f

    .line 509
    .line 510
    const v14, 0x4128cccd    # 10.55f

    .line 511
    .line 512
    .line 513
    const v15, 0x41846666    # 16.55f

    .line 514
    .line 515
    .line 516
    const/high16 v16, 0x41300000    # 11.0f

    .line 517
    .line 518
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 519
    .line 520
    .line 521
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 522
    .line 523
    .line 524
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 525
    .line 526
    .line 527
    move-result-object v2

    .line 528
    const/16 v16, 0x3800

    .line 529
    .line 530
    const/16 v17, 0x0

    .line 531
    .line 532
    const/high16 v6, 0x3f800000    # 1.0f

    .line 533
    .line 534
    const/high16 v8, 0x3f800000    # 1.0f

    .line 535
    .line 536
    const/4 v7, 0x0

    .line 537
    const/high16 v9, 0x3f800000    # 1.0f

    .line 538
    .line 539
    const/high16 v12, 0x3f800000    # 1.0f

    .line 540
    .line 541
    const/4 v13, 0x0

    .line 542
    const/4 v14, 0x0

    .line 543
    const/4 v15, 0x0

    .line 544
    const-string v4, ""

    .line 545
    .line 546
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 547
    .line 548
    .line 549
    move-result-object v0

    .line 550
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 551
    .line 552
    .line 553
    move-result-object v0

    .line 554
    sput-object v0, Landroidx/compose/material/icons/rounded/SavingsKt;->_savings:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 555
    .line 556
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 557
    .line 558
    .line 559
    return-object v0
.end method
