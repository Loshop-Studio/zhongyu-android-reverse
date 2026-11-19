.class public final Landroidx/compose/material/icons/rounded/KayakingKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_kayaking",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "Kayaking",
        "Landroidx/compose/material/icons/Icons$Rounded;",
        "getKayaking",
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
        "SMAP\nKayaking.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Kayaking.kt\nandroidx/compose/material/icons/rounded/KayakingKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,108:1\n212#2,12:109\n233#2,18:122\n253#2:159\n174#3:121\n705#4,2:140\n717#4,2:142\n719#4,11:148\n72#5,4:144\n*S KotlinDebug\n*F\n+ 1 Kayaking.kt\nandroidx/compose/material/icons/rounded/KayakingKt\n*L\n29#1:109,12\n30#1:122,18\n30#1:159\n29#1:121\n30#1:140,2\n30#1:142,2\n30#1:148,11\n30#1:144,4\n*E\n"
    }
.end annotation


# static fields
.field private static _kayaking:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getKayaking(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/KayakingKt;->_kayaking:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.Kayaking"

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
    const/high16 v0, 0x41b00000    # 22.0f

    .line 71
    .line 72
    const/high16 v2, 0x40000000    # 2.0f

    .line 73
    .line 74
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v17, 0x3f800000    # 1.0f

    .line 78
    .line 79
    const/high16 v18, -0x40800000    # -1.0f

    .line 80
    .line 81
    const/4 v13, 0x0

    .line 82
    const v14, -0x40f33333    # -0.55f

    .line 83
    .line 84
    .line 85
    const v15, 0x3ee66666    # 0.45f

    .line 86
    .line 87
    .line 88
    const/high16 v16, -0x40800000    # -1.0f

    .line 89
    .line 90
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 91
    .line 92
    .line 93
    const/4 v0, 0x0

    .line 94
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 95
    .line 96
    .line 97
    const v17, 0x4021eb85    # 2.53f

    .line 98
    .line 99
    .line 100
    const v18, -0x40cccccd    # -0.7f

    .line 101
    .line 102
    .line 103
    const v13, 0x3f5eb852    # 0.87f

    .line 104
    .line 105
    .line 106
    const/4 v14, 0x0

    .line 107
    const v15, 0x3fdd70a4    # 1.73f

    .line 108
    .line 109
    .line 110
    const v16, -0x418a3d71    # -0.24f

    .line 111
    .line 112
    .line 113
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 114
    .line 115
    .line 116
    const v17, 0x3f70a3d7    # 0.94f

    .line 117
    .line 118
    .line 119
    const/16 v18, 0x0

    .line 120
    .line 121
    const v13, 0x3e947ae1    # 0.29f

    .line 122
    .line 123
    .line 124
    const v14, -0x41dc28f6    # -0.16f

    .line 125
    .line 126
    .line 127
    const v15, 0x3f266666    # 0.65f

    .line 128
    .line 129
    .line 130
    const v16, -0x41d1eb85    # -0.17f

    .line 131
    .line 132
    .line 133
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 134
    .line 135
    .line 136
    const v17, 0x40a1eb85    # 5.06f

    .line 137
    .line 138
    .line 139
    const v13, 0x3fcb851f    # 1.59f

    .line 140
    .line 141
    .line 142
    const v14, 0x3f666666    # 0.9f

    .line 143
    .line 144
    .line 145
    const v15, 0x405eb852    # 3.48f

    .line 146
    .line 147
    .line 148
    const v16, 0x3f666666    # 0.9f

    .line 149
    .line 150
    .line 151
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 152
    .line 153
    .line 154
    const v17, 0x3f70a3d7    # 0.94f

    .line 155
    .line 156
    .line 157
    const v13, 0x3e947ae1    # 0.29f

    .line 158
    .line 159
    .line 160
    const v14, -0x41dc28f6    # -0.16f

    .line 161
    .line 162
    .line 163
    const v15, 0x3f266666    # 0.65f

    .line 164
    .line 165
    .line 166
    const v16, -0x41dc28f6    # -0.16f

    .line 167
    .line 168
    .line 169
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 170
    .line 171
    .line 172
    const v17, 0x40a1eb85    # 5.06f

    .line 173
    .line 174
    .line 175
    const v13, 0x3fcb851f    # 1.59f

    .line 176
    .line 177
    .line 178
    const v14, 0x3f666666    # 0.9f

    .line 179
    .line 180
    .line 181
    const v15, 0x405eb852    # 3.48f

    .line 182
    .line 183
    .line 184
    const v16, 0x3f666666    # 0.9f

    .line 185
    .line 186
    .line 187
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 188
    .line 189
    .line 190
    const v17, 0x3f70a3d7    # 0.94f

    .line 191
    .line 192
    .line 193
    const v13, 0x3e947ae1    # 0.29f

    .line 194
    .line 195
    .line 196
    const v14, -0x41dc28f6    # -0.16f

    .line 197
    .line 198
    .line 199
    const v15, 0x3f266666    # 0.65f

    .line 200
    .line 201
    .line 202
    const v16, -0x41dc28f6    # -0.16f

    .line 203
    .line 204
    .line 205
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 206
    .line 207
    .line 208
    const/high16 v17, 0x41a80000    # 21.0f

    .line 209
    .line 210
    const/high16 v18, 0x41a80000    # 21.0f

    .line 211
    .line 212
    const v13, 0x419a28f6    # 19.27f

    .line 213
    .line 214
    .line 215
    const v14, 0x41a6147b    # 20.76f

    .line 216
    .line 217
    .line 218
    const v15, 0x41a10a3d    # 20.13f

    .line 219
    .line 220
    .line 221
    const/high16 v16, 0x41a80000    # 21.0f

    .line 222
    .line 223
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 224
    .line 225
    .line 226
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 227
    .line 228
    .line 229
    const/high16 v17, 0x3f800000    # 1.0f

    .line 230
    .line 231
    const/high16 v18, 0x3f800000    # 1.0f

    .line 232
    .line 233
    const v13, 0x3f0ccccd    # 0.55f

    .line 234
    .line 235
    .line 236
    const/4 v14, 0x0

    .line 237
    const/high16 v15, 0x3f800000    # 1.0f

    .line 238
    .line 239
    const v16, 0x3ee66666    # 0.45f

    .line 240
    .line 241
    .line 242
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 243
    .line 244
    .line 245
    const v0, -0x4119999a    # -0.45f

    .line 246
    .line 247
    .line 248
    const/high16 v2, -0x40800000    # -1.0f

    .line 249
    .line 250
    const/high16 v4, 0x3f800000    # 1.0f

    .line 251
    .line 252
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 253
    .line 254
    .line 255
    const/4 v0, 0x0

    .line 256
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 257
    .line 258
    .line 259
    const/high16 v17, -0x3fc00000    # -3.0f

    .line 260
    .line 261
    const/high16 v18, -0x40c00000    # -0.75f

    .line 262
    .line 263
    const v13, -0x407c28f6    # -1.03f

    .line 264
    .line 265
    .line 266
    const v15, -0x3ffc28f6    # -2.06f

    .line 267
    .line 268
    .line 269
    const/high16 v16, -0x41800000    # -0.25f

    .line 270
    .line 271
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 272
    .line 273
    .line 274
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 275
    .line 276
    .line 277
    const v17, -0x3f3d1eb8    # -6.09f

    .line 278
    .line 279
    .line 280
    const v18, -0x42b33333    # -0.05f

    .line 281
    .line 282
    .line 283
    const v13, -0x400a3d71    # -1.92f

    .line 284
    .line 285
    .line 286
    const v14, 0x3f828f5c    # 1.02f

    .line 287
    .line 288
    .line 289
    const v15, -0x3f7a3d71    # -4.18f

    .line 290
    .line 291
    .line 292
    const/high16 v16, 0x3f800000    # 1.0f

    .line 293
    .line 294
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 295
    .line 296
    .line 297
    const v17, -0x3f4d70a4    # -5.58f

    .line 298
    .line 299
    .line 300
    const v18, -0x41f0a3d7    # -0.14f

    .line 301
    .line 302
    .line 303
    const v13, -0x401ae148    # -1.79f

    .line 304
    .line 305
    .line 306
    const v14, 0x3f5eb852    # 0.87f

    .line 307
    .line 308
    .line 309
    const v15, -0x3f851eb8    # -3.92f

    .line 310
    .line 311
    .line 312
    const v16, 0x3f7ae148    # 0.98f

    .line 313
    .line 314
    .line 315
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 316
    .line 317
    .line 318
    const/high16 v17, 0x40400000    # 3.0f

    .line 319
    .line 320
    const/high16 v18, 0x41b80000    # 23.0f

    .line 321
    .line 322
    const v13, 0x40a9999a    # 5.3f

    .line 323
    .line 324
    .line 325
    const v14, 0x41b5851f    # 22.69f

    .line 326
    .line 327
    .line 328
    const v15, 0x4084cccd    # 4.15f

    .line 329
    .line 330
    .line 331
    const/high16 v16, 0x41b80000    # 23.0f

    .line 332
    .line 333
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 334
    .line 335
    .line 336
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 337
    .line 338
    .line 339
    const/high16 v17, 0x40000000    # 2.0f

    .line 340
    .line 341
    const/high16 v18, 0x41b00000    # 22.0f

    .line 342
    .line 343
    const v13, 0x401ccccd    # 2.45f

    .line 344
    .line 345
    .line 346
    const/high16 v14, 0x41b80000    # 23.0f

    .line 347
    .line 348
    const/high16 v15, 0x40000000    # 2.0f

    .line 349
    .line 350
    const v16, 0x41b46666    # 22.55f

    .line 351
    .line 352
    .line 353
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 354
    .line 355
    .line 356
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 357
    .line 358
    .line 359
    const/high16 v0, 0x41400000    # 12.0f

    .line 360
    .line 361
    const/high16 v2, 0x40b00000    # 5.5f

    .line 362
    .line 363
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 364
    .line 365
    .line 366
    const/high16 v17, -0x40000000    # -2.0f

    .line 367
    .line 368
    const/high16 v18, 0x40000000    # 2.0f

    .line 369
    .line 370
    const v13, -0x40733333    # -1.1f

    .line 371
    .line 372
    .line 373
    const/4 v14, 0x0

    .line 374
    const/high16 v15, -0x40000000    # -2.0f

    .line 375
    .line 376
    const v16, 0x3f666666    # 0.9f

    .line 377
    .line 378
    .line 379
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 380
    .line 381
    .line 382
    const v0, 0x3f666666    # 0.9f

    .line 383
    .line 384
    .line 385
    const/high16 v2, 0x40000000    # 2.0f

    .line 386
    .line 387
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 388
    .line 389
    .line 390
    const v0, -0x4099999a    # -0.9f

    .line 391
    .line 392
    .line 393
    const/high16 v2, -0x40000000    # -2.0f

    .line 394
    .line 395
    const/high16 v4, 0x40000000    # 2.0f

    .line 396
    .line 397
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 398
    .line 399
    .line 400
    const v0, 0x4151999a    # 13.1f

    .line 401
    .line 402
    .line 403
    const/high16 v2, 0x41400000    # 12.0f

    .line 404
    .line 405
    const/high16 v4, 0x40b00000    # 5.5f

    .line 406
    .line 407
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 408
    .line 409
    .line 410
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 411
    .line 412
    .line 413
    const v0, 0x41abc28f    # 21.47f

    .line 414
    .line 415
    .line 416
    const v2, 0x4193999a    # 18.45f

    .line 417
    .line 418
    .line 419
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 420
    .line 421
    .line 422
    const v17, -0x404b851f    # -1.41f

    .line 423
    .line 424
    .line 425
    const v18, 0x3ed70a3d    # 0.42f

    .line 426
    .line 427
    .line 428
    const v13, -0x4128f5c3    # -0.42f

    .line 429
    .line 430
    .line 431
    const v14, 0x3e0f5c29    # 0.14f

    .line 432
    .line 433
    .line 434
    const v15, -0x4099999a    # -0.9f

    .line 435
    .line 436
    .line 437
    const v16, 0x3e8f5c29    # 0.28f

    .line 438
    .line 439
    .line 440
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 441
    .line 442
    .line 443
    const v17, -0x40466666    # -1.45f

    .line 444
    .line 445
    .line 446
    const v18, -0x40bae148    # -0.77f

    .line 447
    .line 448
    .line 449
    const v13, -0x40f851ec    # -0.53f

    .line 450
    .line 451
    .line 452
    const v14, -0x41e66666    # -0.15f

    .line 453
    .line 454
    .line 455
    const v15, -0x407c28f6    # -1.03f

    .line 456
    .line 457
    .line 458
    const v16, -0x4123d70a    # -0.43f

    .line 459
    .line 460
    .line 461
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 462
    .line 463
    .line 464
    const v17, -0x40628f5c    # -1.23f

    .line 465
    .line 466
    .line 467
    const/16 v18, 0x0

    .line 468
    .line 469
    const v13, -0x414ccccd    # -0.35f

    .line 470
    .line 471
    .line 472
    const v14, -0x416b851f    # -0.29f

    .line 473
    .line 474
    .line 475
    const v15, -0x40a147ae    # -0.87f

    .line 476
    .line 477
    .line 478
    const v16, -0x416b851f    # -0.29f

    .line 479
    .line 480
    .line 481
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 482
    .line 483
    .line 484
    const/high16 v17, 0x41700000    # 15.0f

    .line 485
    .line 486
    const/high16 v18, 0x41980000    # 19.0f

    .line 487
    .line 488
    const v13, 0x4185c28f    # 16.72f

    .line 489
    .line 490
    .line 491
    const v14, 0x41950a3d    # 18.63f

    .line 492
    .line 493
    .line 494
    const v15, 0x417e6666    # 15.9f

    .line 495
    .line 496
    .line 497
    const/high16 v16, 0x41980000    # 19.0f

    .line 498
    .line 499
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 500
    .line 501
    .line 502
    const v0, -0x40970a3d    # -0.91f

    .line 503
    .line 504
    .line 505
    const v2, -0x3fe70a3d    # -2.39f

    .line 506
    .line 507
    .line 508
    const v4, -0x41428f5c    # -0.37f

    .line 509
    .line 510
    .line 511
    const v6, -0x4023d70a    # -1.72f

    .line 512
    .line 513
    .line 514
    invoke-virtual {v12, v6, v4, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 515
    .line 516
    .line 517
    const v17, -0x4063d70a    # -1.22f

    .line 518
    .line 519
    .line 520
    const/16 v18, 0x0

    .line 521
    .line 522
    const v13, -0x414ccccd    # -0.35f

    .line 523
    .line 524
    .line 525
    const v14, -0x4170a3d7    # -0.28f

    .line 526
    .line 527
    .line 528
    const v15, -0x40a147ae    # -0.87f

    .line 529
    .line 530
    .line 531
    const v16, -0x4170a3d7    # -0.28f

    .line 532
    .line 533
    .line 534
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 535
    .line 536
    .line 537
    const/high16 v17, 0x41100000    # 9.0f

    .line 538
    .line 539
    const/high16 v18, 0x41980000    # 19.0f

    .line 540
    .line 541
    const v13, 0x412b851f    # 10.72f

    .line 542
    .line 543
    .line 544
    const v14, 0x41950a3d    # 18.63f

    .line 545
    .line 546
    .line 547
    const v15, 0x411e6666    # 9.9f

    .line 548
    .line 549
    .line 550
    const/high16 v16, 0x41980000    # 19.0f

    .line 551
    .line 552
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 553
    .line 554
    .line 555
    invoke-virtual {v12, v6, v4, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 556
    .line 557
    .line 558
    const v17, -0x40628f5c    # -1.23f

    .line 559
    .line 560
    .line 561
    const/16 v18, 0x0

    .line 562
    .line 563
    const v13, -0x414ccccd    # -0.35f

    .line 564
    .line 565
    .line 566
    const v14, -0x416b851f    # -0.29f

    .line 567
    .line 568
    .line 569
    const v15, -0x40a147ae    # -0.87f

    .line 570
    .line 571
    .line 572
    const v16, -0x4170a3d7    # -0.28f

    .line 573
    .line 574
    .line 575
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 576
    .line 577
    .line 578
    const v17, -0x40466666    # -1.45f

    .line 579
    .line 580
    .line 581
    const v18, 0x3f451eb8    # 0.77f

    .line 582
    .line 583
    .line 584
    const v13, -0x4123d70a    # -0.43f

    .line 585
    .line 586
    .line 587
    const v14, 0x3eb33333    # 0.35f

    .line 588
    .line 589
    .line 590
    const v15, -0x40947ae1    # -0.92f

    .line 591
    .line 592
    .line 593
    const v16, 0x3f1eb852    # 0.62f

    .line 594
    .line 595
    .line 596
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 597
    .line 598
    .line 599
    const v17, -0x404ccccd    # -1.4f

    .line 600
    .line 601
    .line 602
    const v18, -0x4128f5c3    # -0.42f

    .line 603
    .line 604
    .line 605
    const v13, -0x40fd70a4    # -0.51f

    .line 606
    .line 607
    .line 608
    const v14, -0x41f0a3d7    # -0.14f

    .line 609
    .line 610
    .line 611
    const v15, -0x40851eb8    # -0.98f

    .line 612
    .line 613
    .line 614
    const v16, -0x4170a3d7    # -0.28f

    .line 615
    .line 616
    .line 617
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 618
    .line 619
    .line 620
    const/16 v17, 0x0

    .line 621
    .line 622
    const v18, -0x400ccccd    # -1.9f

    .line 623
    .line 624
    .line 625
    const v13, -0x40947ae1    # -0.92f

    .line 626
    .line 627
    .line 628
    const v14, -0x41666666    # -0.3f

    .line 629
    .line 630
    .line 631
    const v15, -0x40947ae1    # -0.92f

    .line 632
    .line 633
    .line 634
    const v16, -0x40333333    # -1.6f

    .line 635
    .line 636
    .line 637
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 638
    .line 639
    .line 640
    const v17, 0x40933333    # 4.6f

    .line 641
    .line 642
    .line 643
    const v18, -0x406f5c29    # -1.13f

    .line 644
    .line 645
    .line 646
    const v13, 0x3f9ae148    # 1.21f

    .line 647
    .line 648
    .line 649
    const v14, -0x413851ec    # -0.39f

    .line 650
    .line 651
    .line 652
    const v15, 0x40328f5c    # 2.79f

    .line 653
    .line 654
    .line 655
    const v16, -0x40ae147b    # -0.82f

    .line 656
    .line 657
    .line 658
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 659
    .line 660
    .line 661
    const v0, 0x3faccccd    # 1.35f

    .line 662
    .line 663
    .line 664
    const v2, -0x3f7a8f5c    # -4.17f

    .line 665
    .line 666
    .line 667
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 668
    .line 669
    .line 670
    const v17, 0x401147ae    # 2.27f

    .line 671
    .line 672
    .line 673
    const v18, -0x406b851f    # -1.16f

    .line 674
    .line 675
    .line 676
    const v13, 0x3e9eb852    # 0.31f

    .line 677
    .line 678
    .line 679
    const v14, -0x408ccccd    # -0.95f

    .line 680
    .line 681
    .line 682
    const v15, 0x3fa8f5c3    # 1.32f

    .line 683
    .line 684
    .line 685
    const v16, -0x4043d70a    # -1.47f

    .line 686
    .line 687
    .line 688
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 689
    .line 690
    .line 691
    const v17, 0x3e8a3d71    # 0.27f

    .line 692
    .line 693
    .line 694
    const v18, 0x3de147ae    # 0.11f

    .line 695
    .line 696
    .line 697
    const v13, 0x3db851ec    # 0.09f

    .line 698
    .line 699
    .line 700
    const v14, 0x3cf5c28f    # 0.03f

    .line 701
    .line 702
    .line 703
    const v15, 0x3e428f5c    # 0.19f

    .line 704
    .line 705
    .line 706
    const v16, 0x3d8f5c29    # 0.07f

    .line 707
    .line 708
    .line 709
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 710
    .line 711
    .line 712
    const/4 v0, 0x0

    .line 713
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 714
    .line 715
    .line 716
    const v0, 0x401e147b    # 2.47f

    .line 717
    .line 718
    .line 719
    const v2, 0x3fa66666    # 1.3f

    .line 720
    .line 721
    .line 722
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 723
    .line 724
    .line 725
    const v0, 0x4035c28f    # 2.84f

    .line 726
    .line 727
    .line 728
    const/high16 v2, -0x40400000    # -1.5f

    .line 729
    .line 730
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 731
    .line 732
    .line 733
    const v0, 0x3fd33333    # 1.65f

    .line 734
    .line 735
    .line 736
    const v2, -0x3f928f5c    # -3.71f

    .line 737
    .line 738
    .line 739
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 740
    .line 741
    .line 742
    const v0, -0x4147ae14    # -0.36f

    .line 743
    .line 744
    .line 745
    const v2, -0x4091eb85    # -0.93f

    .line 746
    .line 747
    .line 748
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 749
    .line 750
    .line 751
    const v17, 0x3ca3d70a    # 0.02f

    .line 752
    .line 753
    .line 754
    const v18, -0x40bd70a4    # -0.76f

    .line 755
    .line 756
    .line 757
    const v13, -0x42333333    # -0.1f

    .line 758
    .line 759
    .line 760
    const/high16 v14, -0x41800000    # -0.25f

    .line 761
    .line 762
    const v15, -0x4247ae14    # -0.09f

    .line 763
    .line 764
    .line 765
    const v16, -0x40fae148    # -0.52f

    .line 766
    .line 767
    .line 768
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 769
    .line 770
    .line 771
    const v0, 0x3f3d70a4    # 0.74f

    .line 772
    .line 773
    .line 774
    const v2, -0x4028f5c3    # -1.68f

    .line 775
    .line 776
    .line 777
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 778
    .line 779
    .line 780
    const v17, 0x3fa8f5c3    # 1.32f

    .line 781
    .line 782
    .line 783
    const v18, -0x40fd70a4    # -0.51f

    .line 784
    .line 785
    .line 786
    const v13, 0x3e6147ae    # 0.22f

    .line 787
    .line 788
    .line 789
    const v14, -0x40fd70a4    # -0.51f

    .line 790
    .line 791
    .line 792
    const v15, 0x3f51eb85    # 0.82f

    .line 793
    .line 794
    .line 795
    const v16, -0x40c51eb8    # -0.73f

    .line 796
    .line 797
    .line 798
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 799
    .line 800
    .line 801
    const v0, 0x3faf5c29    # 1.37f

    .line 802
    .line 803
    .line 804
    const v2, 0x3f1c28f6    # 0.61f

    .line 805
    .line 806
    .line 807
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 808
    .line 809
    .line 810
    const/high16 v17, 0x3f000000    # 0.5f

    .line 811
    .line 812
    const v18, 0x3fa8f5c3    # 1.32f

    .line 813
    .line 814
    .line 815
    const/high16 v13, 0x3f000000    # 0.5f

    .line 816
    .line 817
    const v14, 0x3e6b851f    # 0.23f

    .line 818
    .line 819
    .line 820
    const v15, 0x3f3ae148    # 0.73f

    .line 821
    .line 822
    .line 823
    const v16, 0x3f51eb85    # 0.82f

    .line 824
    .line 825
    .line 826
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 827
    .line 828
    .line 829
    const/high16 v0, -0x40c00000    # -0.75f

    .line 830
    .line 831
    const v2, 0x3fd70a3d    # 1.68f

    .line 832
    .line 833
    .line 834
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 835
    .line 836
    .line 837
    const v17, -0x40f0a3d7    # -0.56f

    .line 838
    .line 839
    .line 840
    const v18, 0x3f07ae14    # 0.53f

    .line 841
    .line 842
    .line 843
    const v13, -0x421eb852    # -0.11f

    .line 844
    .line 845
    .line 846
    const v14, 0x3e75c28f    # 0.24f

    .line 847
    .line 848
    .line 849
    const v15, -0x416147ae    # -0.31f

    .line 850
    .line 851
    .line 852
    const v16, 0x3edc28f6    # 0.43f

    .line 853
    .line 854
    .line 855
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 856
    .line 857
    .line 858
    const v0, 0x419ae148    # 19.36f

    .line 859
    .line 860
    .line 861
    const v2, 0x40dccccd    # 6.9f

    .line 862
    .line 863
    .line 864
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 865
    .line 866
    .line 867
    const v0, -0x3f91eb85    # -3.72f

    .line 868
    .line 869
    .line 870
    const v2, 0x410570a4    # 8.34f

    .line 871
    .line 872
    .line 873
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 874
    .line 875
    .line 876
    const v17, 0x40ba3d71    # 5.82f

    .line 877
    .line 878
    .line 879
    const v18, 0x3fa7ae14    # 1.31f

    .line 880
    .line 881
    .line 882
    const v13, 0x40151eb8    # 2.33f

    .line 883
    .line 884
    .line 885
    const v14, 0x3e99999a    # 0.3f

    .line 886
    .line 887
    .line 888
    const v15, 0x408b3333    # 4.35f

    .line 889
    .line 890
    .line 891
    const v16, 0x3f570a3d    # 0.84f

    .line 892
    .line 893
    .line 894
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 895
    .line 896
    .line 897
    const v17, 0x41abc28f    # 21.47f

    .line 898
    .line 899
    .line 900
    const v18, 0x4193999a    # 18.45f

    .line 901
    .line 902
    .line 903
    const v13, 0x41b31eb8    # 22.39f

    .line 904
    .line 905
    .line 906
    const v14, 0x4186cccd    # 16.85f

    .line 907
    .line 908
    .line 909
    const v15, 0x41b33333    # 22.4f

    .line 910
    .line 911
    .line 912
    const v16, 0x41913333    # 18.15f

    .line 913
    .line 914
    .line 915
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 916
    .line 917
    .line 918
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 919
    .line 920
    .line 921
    const v0, 0x414f5c29    # 12.96f

    .line 922
    .line 923
    .line 924
    const v2, 0x417051ec    # 15.02f

    .line 925
    .line 926
    .line 927
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 928
    .line 929
    .line 930
    const v0, -0x40e8f5c3    # -0.59f

    .line 931
    .line 932
    .line 933
    const v2, 0x3e9eb852    # 0.31f

    .line 934
    .line 935
    .line 936
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 937
    .line 938
    .line 939
    const v17, -0x4011eb85    # -1.86f

    .line 940
    .line 941
    .line 942
    const/16 v18, 0x0

    .line 943
    .line 944
    const v13, -0x40eb851f    # -0.58f

    .line 945
    .line 946
    .line 947
    const v14, 0x3e9eb852    # 0.31f

    .line 948
    .line 949
    .line 950
    const v15, -0x405c28f6    # -1.28f

    .line 951
    .line 952
    .line 953
    const v16, 0x3e9eb852    # 0.31f

    .line 954
    .line 955
    .line 956
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 957
    .line 958
    .line 959
    const v0, -0x40b0a3d7    # -0.81f

    .line 960
    .line 961
    .line 962
    const v2, -0x4123d70a    # -0.43f

    .line 963
    .line 964
    .line 965
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 966
    .line 967
    .line 968
    const v0, -0x40ca3d71    # -0.71f

    .line 969
    .line 970
    .line 971
    const v2, 0x400ae148    # 2.17f

    .line 972
    .line 973
    .line 974
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 975
    .line 976
    .line 977
    const/high16 v17, 0x41400000    # 12.0f

    .line 978
    .line 979
    const/high16 v18, 0x41700000    # 15.0f

    .line 980
    .line 981
    const v13, 0x4135c28f    # 11.36f

    .line 982
    .line 983
    .line 984
    const v14, 0x417028f6    # 15.01f

    .line 985
    .line 986
    .line 987
    const v15, 0x413ae148    # 11.68f

    .line 988
    .line 989
    .line 990
    const/high16 v16, 0x41700000    # 15.0f

    .line 991
    .line 992
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 993
    .line 994
    .line 995
    const v17, 0x40047ae1    # 2.07f

    .line 996
    .line 997
    .line 998
    const v18, 0x3da3d70a    # 0.08f

    .line 999
    .line 1000
    .line 1001
    const v13, 0x3f35c28f    # 0.71f

    .line 1002
    .line 1003
    .line 1004
    const/4 v14, 0x0

    .line 1005
    const v15, 0x3fb33333    # 1.4f

    .line 1006
    .line 1007
    .line 1008
    const v16, 0x3cf5c28f    # 0.03f

    .line 1009
    .line 1010
    .line 1011
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1012
    .line 1013
    .line 1014
    const v0, 0x414f5c29    # 12.96f

    .line 1015
    .line 1016
    .line 1017
    const v2, 0x417051ec    # 15.02f

    .line 1018
    .line 1019
    .line 1020
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1021
    .line 1022
    .line 1023
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1024
    .line 1025
    .line 1026
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 1027
    .line 1028
    .line 1029
    move-result-object v2

    .line 1030
    const/16 v16, 0x3800

    .line 1031
    .line 1032
    const/16 v17, 0x0

    .line 1033
    .line 1034
    const/high16 v6, 0x3f800000    # 1.0f

    .line 1035
    .line 1036
    const/high16 v8, 0x3f800000    # 1.0f

    .line 1037
    .line 1038
    const/4 v7, 0x0

    .line 1039
    const/high16 v9, 0x3f800000    # 1.0f

    .line 1040
    .line 1041
    const/high16 v12, 0x3f800000    # 1.0f

    .line 1042
    .line 1043
    const/4 v13, 0x0

    .line 1044
    const/4 v15, 0x0

    .line 1045
    const-string v4, ""

    .line 1046
    .line 1047
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 1048
    .line 1049
    .line 1050
    move-result-object v0

    .line 1051
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1052
    .line 1053
    .line 1054
    move-result-object v0

    .line 1055
    sput-object v0, Landroidx/compose/material/icons/rounded/KayakingKt;->_kayaking:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1056
    .line 1057
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 1058
    .line 1059
    .line 1060
    return-object v0
.end method
