.class public final Landroidx/compose/material/icons/filled/NetworkCheckKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_networkCheck",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "NetworkCheck",
        "Landroidx/compose/material/icons/Icons$Filled;",
        "getNetworkCheck",
        "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;",
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
        "SMAP\nNetworkCheck.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NetworkCheck.kt\nandroidx/compose/material/icons/filled/NetworkCheckKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,72:1\n212#2,12:73\n233#2,18:86\n253#2:123\n174#3:85\n705#4,2:104\n717#4,2:106\n719#4,11:112\n72#5,4:108\n*S KotlinDebug\n*F\n+ 1 NetworkCheck.kt\nandroidx/compose/material/icons/filled/NetworkCheckKt\n*L\n29#1:73,12\n30#1:86,18\n30#1:123\n29#1:85\n30#1:104,2\n30#1:106,2\n30#1:112,11\n30#1:108,4\n*E\n"
    }
.end annotation


# static fields
.field private static _networkCheck:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getNetworkCheck(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/filled/NetworkCheckKt;->_networkCheck:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Filled.NetworkCheck"

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
    const v0, 0x417e6666    # 15.9f

    .line 71
    .line 72
    .line 73
    const/high16 v2, 0x40a00000    # 5.0f

    .line 74
    .line 75
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    const v17, -0x412e147b    # -0.41f

    .line 79
    .line 80
    .line 81
    const v18, 0x3e6b851f    # 0.23f

    .line 82
    .line 83
    .line 84
    const v13, -0x41d1eb85    # -0.17f

    .line 85
    .line 86
    .line 87
    const/4 v14, 0x0

    .line 88
    const v15, -0x415c28f6    # -0.32f

    .line 89
    .line 90
    .line 91
    const v16, 0x3db851ec    # 0.09f

    .line 92
    .line 93
    .line 94
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 95
    .line 96
    .line 97
    const v0, -0x4270a3d7    # -0.07f

    .line 98
    .line 99
    .line 100
    const v2, 0x3e19999a    # 0.15f

    .line 101
    .line 102
    .line 103
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 104
    .line 105
    .line 106
    const v0, -0x3f5a3d71    # -5.18f

    .line 107
    .line 108
    .line 109
    const v2, 0x413a6666    # 11.65f

    .line 110
    .line 111
    .line 112
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 113
    .line 114
    .line 115
    const v17, -0x417ae148    # -0.26f

    .line 116
    .line 117
    .line 118
    const v18, 0x3f75c28f    # 0.96f

    .line 119
    .line 120
    .line 121
    const v13, -0x41dc28f6    # -0.16f

    .line 122
    .line 123
    .line 124
    const v14, 0x3e947ae1    # 0.29f

    .line 125
    .line 126
    .line 127
    const v15, -0x417ae148    # -0.26f

    .line 128
    .line 129
    .line 130
    const v16, 0x3f1c28f6    # 0.61f

    .line 131
    .line 132
    .line 133
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 134
    .line 135
    .line 136
    const v17, 0x4000a3d7    # 2.01f

    .line 137
    .line 138
    .line 139
    const v18, 0x4000a3d7    # 2.01f

    .line 140
    .line 141
    .line 142
    const/4 v13, 0x0

    .line 143
    const v14, 0x3f8e147b    # 1.11f

    .line 144
    .line 145
    .line 146
    const v15, 0x3f666666    # 0.9f

    .line 147
    .line 148
    .line 149
    const v16, 0x4000a3d7    # 2.01f

    .line 150
    .line 151
    .line 152
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 153
    .line 154
    .line 155
    const v17, 0x3ffae148    # 1.96f

    .line 156
    .line 157
    .line 158
    const v18, -0x40347ae1    # -1.59f

    .line 159
    .line 160
    .line 161
    const v13, 0x3f75c28f    # 0.96f

    .line 162
    .line 163
    .line 164
    const/4 v14, 0x0

    .line 165
    const v15, 0x3fe28f5c    # 1.77f

    .line 166
    .line 167
    .line 168
    const v16, -0x40d1eb85    # -0.68f

    .line 169
    .line 170
    .line 171
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 172
    .line 173
    .line 174
    const v0, 0x3c23d70a    # 0.01f

    .line 175
    .line 176
    .line 177
    const v2, -0x430a3d71    # -0.03f

    .line 178
    .line 179
    .line 180
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 181
    .line 182
    .line 183
    const v0, 0x41833333    # 16.4f

    .line 184
    .line 185
    .line 186
    const/high16 v2, 0x40b00000    # 5.5f

    .line 187
    .line 188
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 189
    .line 190
    .line 191
    const/high16 v17, -0x41000000    # -0.5f

    .line 192
    .line 193
    const/high16 v18, -0x41000000    # -0.5f

    .line 194
    .line 195
    const/4 v13, 0x0

    .line 196
    const v14, -0x4170a3d7    # -0.28f

    .line 197
    .line 198
    .line 199
    const v15, -0x419eb852    # -0.22f

    .line 200
    .line 201
    .line 202
    const/high16 v16, -0x41000000    # -0.5f

    .line 203
    .line 204
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 205
    .line 206
    .line 207
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 208
    .line 209
    .line 210
    const/high16 v0, 0x3f800000    # 1.0f

    .line 211
    .line 212
    const/high16 v2, 0x41100000    # 9.0f

    .line 213
    .line 214
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 215
    .line 216
    .line 217
    const/high16 v0, 0x40000000    # 2.0f

    .line 218
    .line 219
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 220
    .line 221
    .line 222
    const v17, 0x41287ae1    # 10.53f

    .line 223
    .line 224
    .line 225
    const v18, -0x3f9851ec    # -3.62f

    .line 226
    .line 227
    .line 228
    const v13, 0x403851ec    # 2.88f

    .line 229
    .line 230
    .line 231
    const v14, -0x3fc7ae14    # -2.88f

    .line 232
    .line 233
    .line 234
    const v15, 0x40d947ae    # 6.79f

    .line 235
    .line 236
    .line 237
    const v16, -0x3f7d70a4    # -4.08f

    .line 238
    .line 239
    .line 240
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 241
    .line 242
    .line 243
    const v0, 0x3f9851ec    # 1.19f

    .line 244
    .line 245
    .line 246
    const v2, -0x3fd47ae1    # -2.68f

    .line 247
    .line 248
    .line 249
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 250
    .line 251
    .line 252
    const/high16 v17, 0x3f800000    # 1.0f

    .line 253
    .line 254
    const/high16 v18, 0x41100000    # 9.0f

    .line 255
    .line 256
    const v13, 0x411e3d71    # 9.89f

    .line 257
    .line 258
    .line 259
    const v14, 0x4075c28f    # 3.84f

    .line 260
    .line 261
    .line 262
    const v15, 0x4097ae14    # 4.74f

    .line 263
    .line 264
    .line 265
    const v16, 0x40a8a3d7    # 5.27f

    .line 266
    .line 267
    .line 268
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 269
    .line 270
    .line 271
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 272
    .line 273
    .line 274
    const/high16 v0, 0x41a80000    # 21.0f

    .line 275
    .line 276
    const/high16 v2, 0x41300000    # 11.0f

    .line 277
    .line 278
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 279
    .line 280
    .line 281
    const/high16 v0, -0x40000000    # -2.0f

    .line 282
    .line 283
    const/high16 v2, 0x40000000    # 2.0f

    .line 284
    .line 285
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 286
    .line 287
    .line 288
    const v17, -0x3f4d1eb8    # -5.59f

    .line 289
    .line 290
    .line 291
    const v18, -0x3f9b851f    # -3.57f

    .line 292
    .line 293
    .line 294
    const v13, -0x402e147b    # -1.64f

    .line 295
    .line 296
    .line 297
    const v14, -0x402e147b    # -1.64f

    .line 298
    .line 299
    .line 300
    const v15, -0x3f9ccccd    # -3.55f

    .line 301
    .line 302
    .line 303
    const v16, -0x3fcb851f    # -2.82f

    .line 304
    .line 305
    .line 306
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 307
    .line 308
    .line 309
    const v0, -0x40f851ec    # -0.53f

    .line 310
    .line 311
    .line 312
    const v2, 0x40347ae1    # 2.82f

    .line 313
    .line 314
    .line 315
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 316
    .line 317
    .line 318
    const v17, 0x4083d70a    # 4.12f

    .line 319
    .line 320
    .line 321
    const/high16 v18, 0x40300000    # 2.75f

    .line 322
    .line 323
    const/high16 v13, 0x3fc00000    # 1.5f

    .line 324
    .line 325
    const v14, 0x3f1eb852    # 0.62f

    .line 326
    .line 327
    .line 328
    const v15, 0x4039999a    # 2.9f

    .line 329
    .line 330
    .line 331
    const v16, 0x3fc3d70a    # 1.53f

    .line 332
    .line 333
    .line 334
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 335
    .line 336
    .line 337
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 338
    .line 339
    .line 340
    const/high16 v0, 0x41880000    # 17.0f

    .line 341
    .line 342
    const/high16 v2, 0x41700000    # 15.0f

    .line 343
    .line 344
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 345
    .line 346
    .line 347
    const/high16 v0, -0x40000000    # -2.0f

    .line 348
    .line 349
    const/high16 v2, 0x40000000    # 2.0f

    .line 350
    .line 351
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 352
    .line 353
    .line 354
    const v17, -0x3fd5c28f    # -2.66f

    .line 355
    .line 356
    .line 357
    const v18, -0x400e147b    # -1.89f

    .line 358
    .line 359
    .line 360
    const v13, -0x40b33333    # -0.8f

    .line 361
    .line 362
    .line 363
    const v14, -0x40b33333    # -0.8f

    .line 364
    .line 365
    .line 366
    const v15, -0x40266666    # -1.7f

    .line 367
    .line 368
    .line 369
    const v16, -0x404a3d71    # -1.42f

    .line 370
    .line 371
    .line 372
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 373
    .line 374
    .line 375
    const v0, -0x40f33333    # -0.55f

    .line 376
    .line 377
    .line 378
    const v2, 0x403ae148    # 2.92f

    .line 379
    .line 380
    .line 381
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 382
    .line 383
    .line 384
    const v17, 0x3f9ae148    # 1.21f

    .line 385
    .line 386
    .line 387
    const v18, 0x3f7851ec    # 0.97f

    .line 388
    .line 389
    .line 390
    const v13, 0x3ed70a3d    # 0.42f

    .line 391
    .line 392
    .line 393
    const v14, 0x3e8a3d71    # 0.27f

    .line 394
    .line 395
    .line 396
    const v15, 0x3f547ae1    # 0.83f

    .line 397
    .line 398
    .line 399
    const v16, 0x3f170a3d    # 0.59f

    .line 400
    .line 401
    .line 402
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 403
    .line 404
    .line 405
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 406
    .line 407
    .line 408
    const/high16 v0, 0x41500000    # 13.0f

    .line 409
    .line 410
    const/high16 v2, 0x40a00000    # 5.0f

    .line 411
    .line 412
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 413
    .line 414
    .line 415
    const/high16 v0, 0x40000000    # 2.0f

    .line 416
    .line 417
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 418
    .line 419
    .line 420
    const v17, 0x4080f5c3    # 4.03f

    .line 421
    .line 422
    .line 423
    const/high16 v18, -0x40000000    # -2.0f

    .line 424
    .line 425
    const v13, 0x3f90a3d7    # 1.13f

    .line 426
    .line 427
    .line 428
    const v14, -0x406f5c29    # -1.13f

    .line 429
    .line 430
    .line 431
    const v15, 0x4023d70a    # 2.56f

    .line 432
    .line 433
    .line 434
    const v16, -0x401ae148    # -1.79f

    .line 435
    .line 436
    .line 437
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 438
    .line 439
    .line 440
    const v0, 0x3fa3d70a    # 1.28f

    .line 441
    .line 442
    .line 443
    const v2, -0x3fc7ae14    # -2.88f

    .line 444
    .line 445
    .line 446
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 447
    .line 448
    .line 449
    const v17, -0x3f16147b    # -7.31f

    .line 450
    .line 451
    .line 452
    const v18, 0x403851ec    # 2.88f

    .line 453
    .line 454
    .line 455
    const v13, -0x3fd7ae14    # -2.63f

    .line 456
    .line 457
    .line 458
    const v14, -0x425c28f6    # -0.08f

    .line 459
    .line 460
    .line 461
    const v15, -0x3f566666    # -5.3f

    .line 462
    .line 463
    .line 464
    const v16, 0x3f5eb852    # 0.87f

    .line 465
    .line 466
    .line 467
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 468
    .line 469
    .line 470
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 471
    .line 472
    .line 473
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 474
    .line 475
    .line 476
    move-result-object v2

    .line 477
    const/16 v16, 0x3800

    .line 478
    .line 479
    const/16 v17, 0x0

    .line 480
    .line 481
    const/high16 v6, 0x3f800000    # 1.0f

    .line 482
    .line 483
    const/high16 v8, 0x3f800000    # 1.0f

    .line 484
    .line 485
    const/4 v7, 0x0

    .line 486
    const/high16 v9, 0x3f800000    # 1.0f

    .line 487
    .line 488
    const/high16 v12, 0x3f800000    # 1.0f

    .line 489
    .line 490
    const/4 v13, 0x0

    .line 491
    const/4 v14, 0x0

    .line 492
    const/4 v15, 0x0

    .line 493
    const-string v4, ""

    .line 494
    .line 495
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 496
    .line 497
    .line 498
    move-result-object v0

    .line 499
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 500
    .line 501
    .line 502
    move-result-object v0

    .line 503
    sput-object v0, Landroidx/compose/material/icons/filled/NetworkCheckKt;->_networkCheck:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 504
    .line 505
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 506
    .line 507
    .line 508
    return-object v0
.end method
