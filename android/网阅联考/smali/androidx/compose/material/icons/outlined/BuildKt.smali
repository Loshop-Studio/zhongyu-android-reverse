.class public final Landroidx/compose/material/icons/outlined/BuildKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_build",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "Build",
        "Landroidx/compose/material/icons/Icons$Outlined;",
        "getBuild",
        "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;",
        "material-icons-core_release"
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
        "SMAP\nBuild.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Build.kt\nandroidx/compose/material/icons/outlined/BuildKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,65:1\n122#2:66\n116#2,3:67\n119#2,3:71\n132#2,18:74\n152#2:111\n175#3:70\n694#4,2:92\n706#4,2:94\n708#4,11:100\n53#5,4:96\n*S KotlinDebug\n*F\n+ 1 Build.kt\nandroidx/compose/material/icons/outlined/BuildKt\n*L\n29#1:66\n29#1:67,3\n29#1:71,3\n30#1:74,18\n30#1:111\n29#1:70\n30#1:92,2\n30#1:94,2\n30#1:100,11\n30#1:96,4\n*E\n"
    }
.end annotation


# static fields
.field private static _build:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getBuild(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 30

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    move-object/from16 v1, p0

    .line 4
    .line 5
    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    sget-object v0, Landroidx/compose/material/icons/outlined/BuildKt;->_build:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    return-object v0

    .line 16
    :cond_0
    const-string v2, "Outlined.Build"

    .line 17
    .line 18
    new-instance v1, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 19
    .line 20
    move-object v13, v1

    .line 21
    const/high16 v0, 0x41c00000    # 24.0f

    .line 22
    .line 23
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 28
    .line 29
    .line 30
    move-result v4

    .line 31
    const/high16 v5, 0x41c00000    # 24.0f

    .line 32
    .line 33
    const/high16 v6, 0x41c00000    # 24.0f

    .line 34
    .line 35
    const-wide/16 v7, 0x0

    .line 36
    .line 37
    const/4 v9, 0x0

    .line 38
    const/4 v10, 0x0

    .line 39
    const/16 v11, 0xe0

    .line 40
    .line 41
    const/4 v12, 0x0

    .line 42
    invoke-direct/range {v1 .. v12}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;-><init>(Ljava/lang/String;FFFFJIZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 43
    .line 44
    .line 45
    const/high16 v18, 0x3f800000    # 1.0f

    .line 46
    .line 47
    const/high16 v20, 0x3f800000    # 1.0f

    .line 48
    .line 49
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 50
    .line 51
    .line 52
    move-result v15

    .line 53
    new-instance v0, Landroidx/compose/ui/graphics/SolidColor;

    .line 54
    .line 55
    move-object/from16 v17, v0

    .line 56
    .line 57
    sget-object v1, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    .line 58
    .line 59
    invoke-virtual {v1}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 60
    .line 61
    .line 62
    move-result-wide v1

    .line 63
    const/4 v3, 0x0

    .line 64
    invoke-direct {v0, v1, v2, v3}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 65
    .line 66
    .line 67
    const/16 v19, 0x0

    .line 68
    .line 69
    const/high16 v21, 0x3f800000    # 1.0f

    .line 70
    .line 71
    sget-object v0, Landroidx/compose/ui/graphics/StrokeCap;->Companion:Landroidx/compose/ui/graphics/StrokeCap$Companion;

    .line 72
    .line 73
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 74
    .line 75
    .line 76
    move-result v22

    .line 77
    sget-object v0, Landroidx/compose/ui/graphics/StrokeJoin;->Companion:Landroidx/compose/ui/graphics/StrokeJoin$Companion;

    .line 78
    .line 79
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 80
    .line 81
    .line 82
    move-result v23

    .line 83
    const/high16 v24, 0x3f800000    # 1.0f

    .line 84
    .line 85
    const-string v16, ""

    .line 86
    .line 87
    new-instance v7, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 88
    .line 89
    invoke-direct {v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 90
    .line 91
    .line 92
    const v0, 0x41b4e148    # 22.61f

    .line 93
    .line 94
    .line 95
    const v1, 0x4197eb85    # 18.99f

    .line 96
    .line 97
    .line 98
    invoke-virtual {v7, v0, v1}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 99
    .line 100
    .line 101
    const v0, -0x3eeeb852    # -9.08f

    .line 102
    .line 103
    .line 104
    invoke-virtual {v7, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 105
    .line 106
    .line 107
    const v1, 0x3f6e147b    # 0.93f

    .line 108
    .line 109
    .line 110
    const v2, -0x3fea3d71    # -2.34f

    .line 111
    .line 112
    .line 113
    const v3, 0x3ee66666    # 0.45f

    .line 114
    .line 115
    .line 116
    const v4, -0x3f5ccccd    # -5.1f

    .line 117
    .line 118
    .line 119
    const v5, -0x4047ae14    # -1.44f

    .line 120
    .line 121
    .line 122
    const/high16 v6, -0x3f200000    # -7.0f

    .line 123
    .line 124
    move-object v0, v7

    .line 125
    invoke-virtual/range {v0 .. v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 126
    .line 127
    .line 128
    const v1, 0x411ca3d7    # 9.79f

    .line 129
    .line 130
    .line 131
    const v2, 0x3f1c28f6    # 0.61f

    .line 132
    .line 133
    .line 134
    const v3, 0x40c6b852    # 6.21f

    .line 135
    .line 136
    .line 137
    const v4, 0x3ecccccd    # 0.4f

    .line 138
    .line 139
    .line 140
    const v5, 0x406a3d71    # 3.66f

    .line 141
    .line 142
    .line 143
    const v6, 0x4010a3d7    # 2.26f

    .line 144
    .line 145
    .line 146
    invoke-virtual/range {v0 .. v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 147
    .line 148
    .line 149
    const/high16 v0, 0x40f00000    # 7.5f

    .line 150
    .line 151
    const v1, 0x40c3851f    # 6.11f

    .line 152
    .line 153
    .line 154
    invoke-virtual {v7, v0, v1}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 155
    .line 156
    .line 157
    const v0, 0x40c28f5c    # 6.08f

    .line 158
    .line 159
    .line 160
    const v1, 0x40f0a3d7    # 7.52f

    .line 161
    .line 162
    .line 163
    invoke-virtual {v7, v0, v1}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 164
    .line 165
    .line 166
    const/high16 v0, 0x40100000    # 2.25f

    .line 167
    .line 168
    const v1, 0x406c28f6    # 3.69f

    .line 169
    .line 170
    .line 171
    invoke-virtual {v7, v0, v1}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 172
    .line 173
    .line 174
    const v1, 0x3ec7ae14    # 0.39f

    .line 175
    .line 176
    .line 177
    const v2, 0x40c75c29    # 6.23f

    .line 178
    .line 179
    .line 180
    const v3, 0x3f19999a    # 0.6f

    .line 181
    .line 182
    .line 183
    const v4, 0x411d1eb8    # 9.82f

    .line 184
    .line 185
    .line 186
    const v5, 0x4039999a    # 2.9f

    .line 187
    .line 188
    .line 189
    const v6, 0x4141c28f    # 12.11f

    .line 190
    .line 191
    .line 192
    move-object v0, v7

    .line 193
    invoke-virtual/range {v0 .. v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 194
    .line 195
    .line 196
    const v1, 0x3fee147b    # 1.86f

    .line 197
    .line 198
    .line 199
    const v2, 0x3fee147b    # 1.86f

    .line 200
    .line 201
    .line 202
    const v3, 0x40923d71    # 4.57f

    .line 203
    .line 204
    .line 205
    const v4, 0x40166666    # 2.35f

    .line 206
    .line 207
    .line 208
    const v5, 0x40dc7ae1    # 6.89f

    .line 209
    .line 210
    .line 211
    const v6, 0x3fbd70a4    # 1.48f

    .line 212
    .line 213
    .line 214
    invoke-virtual/range {v0 .. v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 215
    .line 216
    .line 217
    const v0, 0x4111c28f    # 9.11f

    .line 218
    .line 219
    .line 220
    invoke-virtual {v7, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 221
    .line 222
    .line 223
    const v1, 0x3ec7ae14    # 0.39f

    .line 224
    .line 225
    .line 226
    const v2, 0x3ec7ae14    # 0.39f

    .line 227
    .line 228
    .line 229
    const v3, 0x3f828f5c    # 1.02f

    .line 230
    .line 231
    .line 232
    const v4, 0x3ec7ae14    # 0.39f

    .line 233
    .line 234
    .line 235
    const v5, 0x3fb47ae1    # 1.41f

    .line 236
    .line 237
    .line 238
    const/4 v6, 0x0

    .line 239
    move-object v0, v7

    .line 240
    invoke-virtual/range {v0 .. v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 241
    .line 242
    .line 243
    const v0, 0x40133333    # 2.3f

    .line 244
    .line 245
    .line 246
    const v1, -0x3feccccd    # -2.3f

    .line 247
    .line 248
    .line 249
    invoke-virtual {v7, v0, v1}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 250
    .line 251
    .line 252
    const v1, 0x3ecccccd    # 0.4f

    .line 253
    .line 254
    .line 255
    const v2, -0x413d70a4    # -0.38f

    .line 256
    .line 257
    .line 258
    const v3, 0x3ecccccd    # 0.4f

    .line 259
    .line 260
    .line 261
    const v4, -0x407eb852    # -1.01f

    .line 262
    .line 263
    .line 264
    const/4 v5, 0x0

    .line 265
    const v6, -0x404b851f    # -1.41f

    .line 266
    .line 267
    .line 268
    move-object v0, v7

    .line 269
    invoke-virtual/range {v0 .. v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 270
    .line 271
    .line 272
    invoke-virtual {v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 273
    .line 274
    .line 275
    const v0, 0x419ce148    # 19.61f

    .line 276
    .line 277
    .line 278
    const v1, 0x41a4b852    # 20.59f

    .line 279
    .line 280
    .line 281
    invoke-virtual {v7, v0, v1}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 282
    .line 283
    .line 284
    const v0, -0x3ee8a3d7    # -9.46f

    .line 285
    .line 286
    .line 287
    invoke-virtual {v7, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 288
    .line 289
    .line 290
    const v1, -0x40e3d70a    # -0.61f

    .line 291
    .line 292
    .line 293
    const v2, 0x3ee66666    # 0.45f

    .line 294
    .line 295
    .line 296
    const v3, -0x405ae148    # -1.29f

    .line 297
    .line 298
    .line 299
    const v4, 0x3f3851ec    # 0.72f

    .line 300
    .line 301
    .line 302
    const/high16 v5, -0x40000000    # -2.0f

    .line 303
    .line 304
    const v6, 0x3f51eb85    # 0.82f

    .line 305
    .line 306
    .line 307
    move-object v0, v7

    .line 308
    invoke-virtual/range {v0 .. v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 309
    .line 310
    .line 311
    const v1, -0x4051eb85    # -1.36f

    .line 312
    .line 313
    .line 314
    const v2, 0x3e4ccccd    # 0.2f

    .line 315
    .line 316
    .line 317
    const v3, -0x3fcd70a4    # -2.79f

    .line 318
    .line 319
    .line 320
    const v4, -0x41a8f5c3    # -0.21f

    .line 321
    .line 322
    .line 323
    const v5, -0x3f8ae148    # -3.83f

    .line 324
    .line 325
    .line 326
    const/high16 v6, -0x40600000    # -1.25f

    .line 327
    .line 328
    invoke-virtual/range {v0 .. v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 329
    .line 330
    .line 331
    const v1, 0x4057ae14    # 3.37f

    .line 332
    .line 333
    .line 334
    const v2, 0x411c28f6    # 9.76f

    .line 335
    .line 336
    .line 337
    const v3, 0x403b851f    # 2.93f

    .line 338
    .line 339
    .line 340
    const/high16 v4, 0x41080000    # 8.5f

    .line 341
    .line 342
    const/high16 v5, 0x40400000    # 3.0f

    .line 343
    .line 344
    const v6, 0x40e851ec    # 7.26f

    .line 345
    .line 346
    .line 347
    invoke-virtual/range {v0 .. v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 348
    .line 349
    .line 350
    const v0, 0x4045c28f    # 3.09f

    .line 351
    .line 352
    .line 353
    invoke-virtual {v7, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 354
    .line 355
    .line 356
    const v0, 0x4087ae14    # 4.24f

    .line 357
    .line 358
    .line 359
    const v1, -0x3f7851ec    # -4.24f

    .line 360
    .line 361
    .line 362
    invoke-virtual {v7, v0, v1}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 363
    .line 364
    .line 365
    const v0, -0x3fba3d71    # -3.09f

    .line 366
    .line 367
    .line 368
    invoke-virtual {v7, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 369
    .line 370
    .line 371
    const v1, 0x3f9eb852    # 1.24f

    .line 372
    .line 373
    .line 374
    const v2, -0x4270a3d7    # -0.07f

    .line 375
    .line 376
    .line 377
    const v3, 0x401f5c29    # 2.49f

    .line 378
    .line 379
    .line 380
    const v4, 0x3ebd70a4    # 0.37f

    .line 381
    .line 382
    .line 383
    const v5, 0x405c28f6    # 3.44f

    .line 384
    .line 385
    .line 386
    const v6, 0x3fa7ae14    # 1.31f

    .line 387
    .line 388
    .line 389
    move-object v0, v7

    .line 390
    invoke-virtual/range {v0 .. v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 391
    .line 392
    .line 393
    const v1, 0x3f8a3d71    # 1.08f

    .line 394
    .line 395
    .line 396
    const v2, 0x3f8a3d71    # 1.08f

    .line 397
    .line 398
    .line 399
    const v3, 0x3fbeb852    # 1.49f

    .line 400
    .line 401
    .line 402
    const v4, 0x40247ae1    # 2.57f

    .line 403
    .line 404
    .line 405
    const v5, 0x3f9eb852    # 1.24f

    .line 406
    .line 407
    .line 408
    const v6, 0x407d70a4    # 3.96f

    .line 409
    .line 410
    .line 411
    invoke-virtual/range {v0 .. v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 412
    .line 413
    .line 414
    const v1, -0x420a3d71    # -0.12f

    .line 415
    .line 416
    .line 417
    const v2, 0x3f35c28f    # 0.71f

    .line 418
    .line 419
    .line 420
    const v3, -0x4128f5c3    # -0.42f

    .line 421
    .line 422
    .line 423
    const v4, 0x3faf5c29    # 1.37f

    .line 424
    .line 425
    .line 426
    const v5, -0x409eb852    # -0.88f

    .line 427
    .line 428
    .line 429
    const v6, 0x3ffae148    # 1.96f

    .line 430
    .line 431
    .line 432
    invoke-virtual/range {v0 .. v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 433
    .line 434
    .line 435
    const v0, 0x41173333    # 9.45f

    .line 436
    .line 437
    .line 438
    invoke-virtual {v7, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 439
    .line 440
    .line 441
    const v0, -0x409eb852    # -0.88f

    .line 442
    .line 443
    .line 444
    const v1, 0x3f63d70a    # 0.89f

    .line 445
    .line 446
    .line 447
    invoke-virtual {v7, v0, v1}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 448
    .line 449
    .line 450
    invoke-virtual {v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 451
    .line 452
    .line 453
    invoke-virtual {v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 454
    .line 455
    .line 456
    move-result-object v14

    .line 457
    const/16 v25, 0x0

    .line 458
    .line 459
    const/16 v26, 0x0

    .line 460
    .line 461
    const/16 v27, 0x0

    .line 462
    .line 463
    const/16 v28, 0x3800

    .line 464
    .line 465
    const/16 v29, 0x0

    .line 466
    .line 467
    invoke-static/range {v13 .. v29}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 468
    .line 469
    .line 470
    move-result-object v0

    .line 471
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 472
    .line 473
    .line 474
    move-result-object v0

    .line 475
    sput-object v0, Landroidx/compose/material/icons/outlined/BuildKt;->_build:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 476
    .line 477
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 478
    .line 479
    .line 480
    return-object v0
.end method
