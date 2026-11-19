.class public final Landroidx/compose/material/icons/rounded/NordicWalkingKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_nordicWalking",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "NordicWalking",
        "Landroidx/compose/material/icons/Icons$Rounded;",
        "getNordicWalking",
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
        "SMAP\nNordicWalking.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NordicWalking.kt\nandroidx/compose/material/icons/rounded/NordicWalkingKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,84:1\n212#2,12:85\n233#2,18:98\n253#2:135\n174#3:97\n705#4,2:116\n717#4,2:118\n719#4,11:124\n72#5,4:120\n*S KotlinDebug\n*F\n+ 1 NordicWalking.kt\nandroidx/compose/material/icons/rounded/NordicWalkingKt\n*L\n29#1:85,12\n30#1:98,18\n30#1:135\n29#1:97\n30#1:116,2\n30#1:118,2\n30#1:124,11\n30#1:120,4\n*E\n"
    }
.end annotation


# static fields
.field private static _nordicWalking:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getNordicWalking(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/NordicWalkingKt;->_nordicWalking:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.NordicWalking"

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
    const/high16 v0, 0x41920000    # 18.25f

    .line 71
    .line 72
    const/high16 v2, 0x41b80000    # 23.0f

    .line 73
    .line 74
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v17, -0x40c00000    # -0.75f

    .line 78
    .line 79
    const/high16 v18, -0x40c00000    # -0.75f

    .line 80
    .line 81
    const v13, -0x412e147b    # -0.41f

    .line 82
    .line 83
    .line 84
    const/4 v14, 0x0

    .line 85
    const/high16 v15, -0x40c00000    # -0.75f

    .line 86
    .line 87
    const v16, -0x4151eb85    # -0.34f

    .line 88
    .line 89
    .line 90
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 91
    .line 92
    .line 93
    const/high16 v0, 0x41600000    # 14.0f

    .line 94
    .line 95
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 96
    .line 97
    .line 98
    const/high16 v0, 0x41980000    # 19.0f

    .line 99
    .line 100
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 101
    .line 102
    .line 103
    const/high16 v0, 0x41040000    # 8.25f

    .line 104
    .line 105
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 106
    .line 107
    .line 108
    const/high16 v17, 0x41920000    # 18.25f

    .line 109
    .line 110
    const/high16 v18, 0x41b80000    # 23.0f

    .line 111
    .line 112
    const/high16 v13, 0x41980000    # 19.0f

    .line 113
    .line 114
    const v14, 0x41b547ae    # 22.66f

    .line 115
    .line 116
    .line 117
    const v15, 0x419547ae    # 18.66f

    .line 118
    .line 119
    .line 120
    const/high16 v16, 0x41b80000    # 23.0f

    .line 121
    .line 122
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 123
    .line 124
    .line 125
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 126
    .line 127
    .line 128
    const v0, 0x409dc28f    # 4.93f

    .line 129
    .line 130
    .line 131
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 132
    .line 133
    .line 134
    const v17, 0x3f3ae148    # 0.73f

    .line 135
    .line 136
    .line 137
    const v18, -0x40e8f5c3    # -0.59f

    .line 138
    .line 139
    .line 140
    const v13, 0x3eb33333    # 0.35f

    .line 141
    .line 142
    .line 143
    const/4 v14, 0x0

    .line 144
    const v15, 0x3f28f5c3    # 0.66f

    .line 145
    .line 146
    .line 147
    const v16, -0x418a3d71    # -0.24f

    .line 148
    .line 149
    .line 150
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 151
    .line 152
    .line 153
    const v0, 0x40f0f5c3    # 7.53f

    .line 154
    .line 155
    .line 156
    const/high16 v2, 0x41600000    # 14.0f

    .line 157
    .line 158
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 159
    .line 160
    .line 161
    const/high16 v0, 0x40c00000    # 6.0f

    .line 162
    .line 163
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 164
    .line 165
    .line 166
    const v0, -0x4019999a    # -1.8f

    .line 167
    .line 168
    .line 169
    const v2, 0x410170a4    # 8.09f

    .line 170
    .line 171
    .line 172
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 173
    .line 174
    .line 175
    const v17, 0x409dc28f    # 4.93f

    .line 176
    .line 177
    .line 178
    const/high16 v18, 0x41b80000    # 23.0f

    .line 179
    .line 180
    const v13, 0x40833333    # 4.1f

    .line 181
    .line 182
    .line 183
    const v14, 0x41b47ae1    # 22.56f

    .line 184
    .line 185
    .line 186
    const v15, 0x408e6666    # 4.45f

    .line 187
    .line 188
    .line 189
    const/high16 v16, 0x41b80000    # 23.0f

    .line 190
    .line 191
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 192
    .line 193
    .line 194
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 195
    .line 196
    .line 197
    const/high16 v0, 0x40b00000    # 5.5f

    .line 198
    .line 199
    const/high16 v2, 0x41580000    # 13.5f

    .line 200
    .line 201
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 202
    .line 203
    .line 204
    const/high16 v17, 0x40000000    # 2.0f

    .line 205
    .line 206
    const/high16 v18, -0x40000000    # -2.0f

    .line 207
    .line 208
    const v13, 0x3f8ccccd    # 1.1f

    .line 209
    .line 210
    .line 211
    const/4 v14, 0x0

    .line 212
    const/high16 v15, 0x40000000    # 2.0f

    .line 213
    .line 214
    const v16, -0x4099999a    # -0.9f

    .line 215
    .line 216
    .line 217
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 218
    .line 219
    .line 220
    const v0, -0x4099999a    # -0.9f

    .line 221
    .line 222
    .line 223
    const/high16 v2, -0x40000000    # -2.0f

    .line 224
    .line 225
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 226
    .line 227
    .line 228
    const v0, 0x3f666666    # 0.9f

    .line 229
    .line 230
    .line 231
    const/high16 v2, 0x40000000    # 2.0f

    .line 232
    .line 233
    const/high16 v4, -0x40000000    # -2.0f

    .line 234
    .line 235
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 236
    .line 237
    .line 238
    const v0, 0x41466666    # 12.4f

    .line 239
    .line 240
    .line 241
    const/high16 v2, 0x40b00000    # 5.5f

    .line 242
    .line 243
    const/high16 v4, 0x41580000    # 13.5f

    .line 244
    .line 245
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 246
    .line 247
    .line 248
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 249
    .line 250
    .line 251
    const/high16 v0, 0x41600000    # 14.0f

    .line 252
    .line 253
    const/high16 v2, 0x41b80000    # 23.0f

    .line 254
    .line 255
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 256
    .line 257
    .line 258
    const/high16 v17, 0x3f800000    # 1.0f

    .line 259
    .line 260
    const/high16 v18, -0x40800000    # -1.0f

    .line 261
    .line 262
    const v13, 0x3f0ccccd    # 0.55f

    .line 263
    .line 264
    .line 265
    const/high16 v15, 0x3f800000    # 1.0f

    .line 266
    .line 267
    const v16, -0x4119999a    # -0.45f

    .line 268
    .line 269
    .line 270
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 271
    .line 272
    .line 273
    const v0, -0x3f4b851f    # -5.64f

    .line 274
    .line 275
    .line 276
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 277
    .line 278
    .line 279
    const v17, -0x40e147ae    # -0.62f

    .line 280
    .line 281
    .line 282
    const v18, -0x40466666    # -1.45f

    .line 283
    .line 284
    .line 285
    const/4 v13, 0x0

    .line 286
    const v14, -0x40f33333    # -0.55f

    .line 287
    .line 288
    .line 289
    const v15, -0x419eb852    # -0.22f

    .line 290
    .line 291
    .line 292
    const v16, -0x40770a3d    # -1.07f

    .line 293
    .line 294
    .line 295
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 296
    .line 297
    .line 298
    const v0, 0x414e6666    # 12.9f

    .line 299
    .line 300
    .line 301
    const/high16 v2, 0x41580000    # 13.5f

    .line 302
    .line 303
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 304
    .line 305
    .line 306
    const v0, 0x3f19999a    # 0.6f

    .line 307
    .line 308
    .line 309
    const/high16 v2, -0x3fc00000    # -3.0f

    .line 310
    .line 311
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 312
    .line 313
    .line 314
    const v17, 0x408b851f    # 4.36f

    .line 315
    .line 316
    .line 317
    const v18, 0x401a3d71    # 2.41f

    .line 318
    .line 319
    .line 320
    const v13, 0x3f88f5c3    # 1.07f

    .line 321
    .line 322
    .line 323
    const v14, 0x3f9eb852    # 1.24f

    .line 324
    .line 325
    .line 326
    const v15, 0x4027ae14    # 2.62f

    .line 327
    .line 328
    .line 329
    const v16, 0x400851ec    # 2.13f

    .line 330
    .line 331
    .line 332
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 333
    .line 334
    .line 335
    const v17, 0x3f91eb85    # 1.14f

    .line 336
    .line 337
    .line 338
    const v18, -0x40828f5c    # -0.99f

    .line 339
    .line 340
    .line 341
    const v13, 0x3f19999a    # 0.6f

    .line 342
    .line 343
    .line 344
    const v14, 0x3dcccccd    # 0.1f

    .line 345
    .line 346
    .line 347
    const v15, 0x3f91eb85    # 1.14f

    .line 348
    .line 349
    .line 350
    const v16, -0x413d70a4    # -0.38f

    .line 351
    .line 352
    .line 353
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 354
    .line 355
    .line 356
    const v17, -0x40ab851f    # -0.83f

    .line 357
    .line 358
    .line 359
    const v18, -0x40851eb8    # -0.98f

    .line 360
    .line 361
    .line 362
    const/4 v13, 0x0

    .line 363
    const v14, -0x41051eb8    # -0.49f

    .line 364
    .line 365
    .line 366
    const v15, -0x414ccccd    # -0.35f

    .line 367
    .line 368
    .line 369
    const v16, -0x40970a3d    # -0.91f

    .line 370
    .line 371
    .line 372
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 373
    .line 374
    .line 375
    const v17, -0x3fa1eb85    # -3.47f

    .line 376
    .line 377
    .line 378
    const v18, -0x3feae148    # -2.33f

    .line 379
    .line 380
    .line 381
    const v13, -0x403c28f6    # -1.53f

    .line 382
    .line 383
    .line 384
    const v14, -0x418a3d71    # -0.24f

    .line 385
    .line 386
    .line 387
    const v15, -0x3fcd70a4    # -2.79f

    .line 388
    .line 389
    .line 390
    const v16, -0x406e147b    # -1.14f

    .line 391
    .line 392
    .line 393
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 394
    .line 395
    .line 396
    const v0, -0x40333333    # -1.6f

    .line 397
    .line 398
    .line 399
    const/high16 v2, -0x40800000    # -1.0f

    .line 400
    .line 401
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 402
    .line 403
    .line 404
    const v17, -0x3fd5c28f    # -2.66f

    .line 405
    .line 406
    .line 407
    const v18, -0x40a8f5c3    # -0.84f

    .line 408
    .line 409
    .line 410
    const v13, -0x40f0a3d7    # -0.56f

    .line 411
    .line 412
    .line 413
    const v14, -0x409c28f6    # -0.89f

    .line 414
    .line 415
    .line 416
    const v15, -0x4028f5c3    # -1.68f

    .line 417
    .line 418
    .line 419
    const/high16 v16, -0x40600000    # -1.25f

    .line 420
    .line 421
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 422
    .line 423
    .line 424
    const v0, 0x40e70a3d    # 7.22f

    .line 425
    .line 426
    .line 427
    const v2, 0x40f8f5c3    # 7.78f

    .line 428
    .line 429
    .line 430
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 431
    .line 432
    .line 433
    const/high16 v17, 0x40c00000    # 6.0f

    .line 434
    .line 435
    const v18, 0x4119eb85    # 9.62f

    .line 436
    .line 437
    .line 438
    const v13, 0x40cf5c29    # 6.48f

    .line 439
    .line 440
    .line 441
    const v14, 0x4101999a    # 8.1f

    .line 442
    .line 443
    .line 444
    const/high16 v15, 0x40c00000    # 6.0f

    .line 445
    .line 446
    const v16, 0x410d1eb8    # 8.82f

    .line 447
    .line 448
    .line 449
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 450
    .line 451
    .line 452
    const/high16 v0, 0x41400000    # 12.0f

    .line 453
    .line 454
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 455
    .line 456
    .line 457
    const/high16 v17, 0x3f800000    # 1.0f

    .line 458
    .line 459
    const/high16 v18, 0x3f800000    # 1.0f

    .line 460
    .line 461
    const/4 v13, 0x0

    .line 462
    const v14, 0x3f0ccccd    # 0.55f

    .line 463
    .line 464
    .line 465
    const v15, 0x3ee66666    # 0.45f

    .line 466
    .line 467
    .line 468
    const/high16 v16, 0x3f800000    # 1.0f

    .line 469
    .line 470
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 471
    .line 472
    .line 473
    const v0, -0x4119999a    # -0.45f

    .line 474
    .line 475
    .line 476
    const/high16 v2, 0x3f800000    # 1.0f

    .line 477
    .line 478
    const/high16 v4, -0x40800000    # -1.0f

    .line 479
    .line 480
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 481
    .line 482
    .line 483
    const v0, 0x4119999a    # 9.6f

    .line 484
    .line 485
    .line 486
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 487
    .line 488
    .line 489
    const v0, 0x3fe66666    # 1.8f

    .line 490
    .line 491
    .line 492
    const v2, -0x40cccccd    # -0.7f

    .line 493
    .line 494
    .line 495
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 496
    .line 497
    .line 498
    const/high16 v0, 0x40e80000    # 7.25f

    .line 499
    .line 500
    const v2, 0x41ae147b    # 21.76f

    .line 501
    .line 502
    .line 503
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 504
    .line 505
    .line 506
    const v17, 0x410451ec    # 8.27f

    .line 507
    .line 508
    .line 509
    const/high16 v18, 0x41b80000    # 23.0f

    .line 510
    .line 511
    const v13, 0x40e3d70a    # 7.12f

    .line 512
    .line 513
    .line 514
    const v14, 0x41b33333    # 22.4f

    .line 515
    .line 516
    .line 517
    const v15, 0x40f3851f    # 7.61f

    .line 518
    .line 519
    .line 520
    const/high16 v16, 0x41b80000    # 23.0f

    .line 521
    .line 522
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 523
    .line 524
    .line 525
    const v17, 0x3f828f5c    # 1.02f

    .line 526
    .line 527
    .line 528
    const v18, -0x40b0a3d7    # -0.81f

    .line 529
    .line 530
    .line 531
    const v13, 0x3efae148    # 0.49f

    .line 532
    .line 533
    .line 534
    const/4 v14, 0x0

    .line 535
    const v15, 0x3f68f5c3    # 0.91f

    .line 536
    .line 537
    .line 538
    const v16, -0x4151eb85    # -0.34f

    .line 539
    .line 540
    .line 541
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 542
    .line 543
    .line 544
    const v0, 0x412e6666    # 10.9f

    .line 545
    .line 546
    .line 547
    const/high16 v2, 0x41700000    # 15.0f

    .line 548
    .line 549
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 550
    .line 551
    .line 552
    const v0, 0x40066666    # 2.1f

    .line 553
    .line 554
    .line 555
    const/high16 v2, 0x40000000    # 2.0f

    .line 556
    .line 557
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 558
    .line 559
    .line 560
    const/high16 v0, 0x40a00000    # 5.0f

    .line 561
    .line 562
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 563
    .line 564
    .line 565
    const/high16 v17, 0x41600000    # 14.0f

    .line 566
    .line 567
    const/high16 v18, 0x41b80000    # 23.0f

    .line 568
    .line 569
    const/high16 v13, 0x41500000    # 13.0f

    .line 570
    .line 571
    const v14, 0x41b46666    # 22.55f

    .line 572
    .line 573
    .line 574
    const v15, 0x41573333    # 13.45f

    .line 575
    .line 576
    .line 577
    const/high16 v16, 0x41b80000    # 23.0f

    .line 578
    .line 579
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 580
    .line 581
    .line 582
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 583
    .line 584
    .line 585
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 586
    .line 587
    .line 588
    move-result-object v2

    .line 589
    const/16 v16, 0x3800

    .line 590
    .line 591
    const/16 v17, 0x0

    .line 592
    .line 593
    const/high16 v6, 0x3f800000    # 1.0f

    .line 594
    .line 595
    const/high16 v8, 0x3f800000    # 1.0f

    .line 596
    .line 597
    const/4 v7, 0x0

    .line 598
    const/high16 v9, 0x3f800000    # 1.0f

    .line 599
    .line 600
    const/high16 v12, 0x3f800000    # 1.0f

    .line 601
    .line 602
    const/4 v13, 0x0

    .line 603
    const/4 v14, 0x0

    .line 604
    const/4 v15, 0x0

    .line 605
    const-string v4, ""

    .line 606
    .line 607
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 608
    .line 609
    .line 610
    move-result-object v0

    .line 611
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 612
    .line 613
    .line 614
    move-result-object v0

    .line 615
    sput-object v0, Landroidx/compose/material/icons/rounded/NordicWalkingKt;->_nordicWalking:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 616
    .line 617
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 618
    .line 619
    .line 620
    return-object v0
.end method
