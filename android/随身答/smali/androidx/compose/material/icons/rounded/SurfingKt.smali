.class public final Landroidx/compose/material/icons/rounded/SurfingKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_surfing",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "Surfing",
        "Landroidx/compose/material/icons/Icons$Rounded;",
        "getSurfing",
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
        "SMAP\nSurfing.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Surfing.kt\nandroidx/compose/material/icons/rounded/SurfingKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,102:1\n212#2,12:103\n233#2,18:116\n253#2:153\n174#3:115\n705#4,2:134\n717#4,2:136\n719#4,11:142\n72#5,4:138\n*S KotlinDebug\n*F\n+ 1 Surfing.kt\nandroidx/compose/material/icons/rounded/SurfingKt\n*L\n29#1:103,12\n30#1:116,18\n30#1:153\n29#1:115\n30#1:134,2\n30#1:136,2\n30#1:142,11\n30#1:138,4\n*E\n"
    }
.end annotation


# static fields
.field private static _surfing:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getSurfing(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/SurfingKt;->_surfing:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.Surfing"

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
    const/high16 v0, 0x41880000    # 17.0f

    .line 71
    .line 72
    const/high16 v2, 0x3fc00000    # 1.5f

    .line 73
    .line 74
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v17, -0x40000000    # -2.0f

    .line 78
    .line 79
    const/high16 v18, 0x40000000    # 2.0f

    .line 80
    .line 81
    const v13, -0x40733333    # -1.1f

    .line 82
    .line 83
    .line 84
    const/4 v14, 0x0

    .line 85
    const/high16 v15, -0x40000000    # -2.0f

    .line 86
    .line 87
    const v16, 0x3f666666    # 0.9f

    .line 88
    .line 89
    .line 90
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 91
    .line 92
    .line 93
    const v0, 0x3f666666    # 0.9f

    .line 94
    .line 95
    .line 96
    const/high16 v2, 0x40000000    # 2.0f

    .line 97
    .line 98
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 99
    .line 100
    .line 101
    const v0, -0x4099999a    # -0.9f

    .line 102
    .line 103
    .line 104
    const/high16 v2, -0x40000000    # -2.0f

    .line 105
    .line 106
    const/high16 v4, 0x40000000    # 2.0f

    .line 107
    .line 108
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 109
    .line 110
    .line 111
    const v0, 0x4190cccd    # 18.1f

    .line 112
    .line 113
    .line 114
    const/high16 v2, 0x41880000    # 17.0f

    .line 115
    .line 116
    const/high16 v4, 0x3fc00000    # 1.5f

    .line 117
    .line 118
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 119
    .line 120
    .line 121
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 122
    .line 123
    .line 124
    const/high16 v0, 0x41b00000    # 22.0f

    .line 125
    .line 126
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 127
    .line 128
    .line 129
    const/high16 v17, -0x40800000    # -1.0f

    .line 130
    .line 131
    const/high16 v18, 0x3f800000    # 1.0f

    .line 132
    .line 133
    const/4 v13, 0x0

    .line 134
    const v14, 0x3f0ccccd    # 0.55f

    .line 135
    .line 136
    .line 137
    const v15, -0x4119999a    # -0.45f

    .line 138
    .line 139
    .line 140
    const/high16 v16, 0x3f800000    # 1.0f

    .line 141
    .line 142
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 143
    .line 144
    .line 145
    const/4 v0, 0x0

    .line 146
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 147
    .line 148
    .line 149
    const/high16 v17, -0x3fc00000    # -3.0f

    .line 150
    .line 151
    const/high16 v18, -0x40c00000    # -0.75f

    .line 152
    .line 153
    const v13, -0x407c28f6    # -1.03f

    .line 154
    .line 155
    .line 156
    const/4 v14, 0x0

    .line 157
    const v15, -0x3ffccccd    # -2.05f

    .line 158
    .line 159
    .line 160
    const/high16 v16, -0x41800000    # -0.25f

    .line 161
    .line 162
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 163
    .line 164
    .line 165
    const v17, -0x3f3d1eb8    # -6.09f

    .line 166
    .line 167
    .line 168
    const v18, -0x42b33333    # -0.05f

    .line 169
    .line 170
    .line 171
    const v13, -0x400a3d71    # -1.92f

    .line 172
    .line 173
    .line 174
    const v14, 0x3f828f5c    # 1.02f

    .line 175
    .line 176
    .line 177
    const v15, -0x3f7a3d71    # -4.18f

    .line 178
    .line 179
    .line 180
    const/high16 v16, 0x3f800000    # 1.0f

    .line 181
    .line 182
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 183
    .line 184
    .line 185
    const v17, -0x3f4d70a4    # -5.58f

    .line 186
    .line 187
    .line 188
    const v18, -0x41f0a3d7    # -0.14f

    .line 189
    .line 190
    .line 191
    const v13, -0x401ae148    # -1.79f

    .line 192
    .line 193
    .line 194
    const v14, 0x3f5eb852    # 0.87f

    .line 195
    .line 196
    .line 197
    const v15, -0x3f851eb8    # -3.92f

    .line 198
    .line 199
    .line 200
    const v16, 0x3f7ae148    # 0.98f

    .line 201
    .line 202
    .line 203
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 204
    .line 205
    .line 206
    const/high16 v17, 0x40400000    # 3.0f

    .line 207
    .line 208
    const/high16 v18, 0x41b80000    # 23.0f

    .line 209
    .line 210
    const v13, 0x40a9999a    # 5.3f

    .line 211
    .line 212
    .line 213
    const v14, 0x41b5851f    # 22.69f

    .line 214
    .line 215
    .line 216
    const v15, 0x4084cccd    # 4.15f

    .line 217
    .line 218
    .line 219
    const/high16 v16, 0x41b80000    # 23.0f

    .line 220
    .line 221
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 222
    .line 223
    .line 224
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 225
    .line 226
    .line 227
    const/high16 v17, -0x40800000    # -1.0f

    .line 228
    .line 229
    const/high16 v18, -0x40800000    # -1.0f

    .line 230
    .line 231
    const v13, -0x40f33333    # -0.55f

    .line 232
    .line 233
    .line 234
    const/4 v14, 0x0

    .line 235
    const/high16 v15, -0x40800000    # -1.0f

    .line 236
    .line 237
    const v16, -0x4119999a    # -0.45f

    .line 238
    .line 239
    .line 240
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 241
    .line 242
    .line 243
    const/high16 v17, 0x3f800000    # 1.0f

    .line 244
    .line 245
    const/4 v13, 0x0

    .line 246
    const v14, -0x40f33333    # -0.55f

    .line 247
    .line 248
    .line 249
    const v15, 0x3ee66666    # 0.45f

    .line 250
    .line 251
    .line 252
    const/high16 v16, -0x40800000    # -1.0f

    .line 253
    .line 254
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 255
    .line 256
    .line 257
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 258
    .line 259
    .line 260
    const v17, 0x4021eb85    # 2.53f

    .line 261
    .line 262
    .line 263
    const v18, -0x40cccccd    # -0.7f

    .line 264
    .line 265
    .line 266
    const v13, 0x3f5eb852    # 0.87f

    .line 267
    .line 268
    .line 269
    const/4 v14, 0x0

    .line 270
    const v15, 0x3fdd70a4    # 1.73f

    .line 271
    .line 272
    .line 273
    const v16, -0x418a3d71    # -0.24f

    .line 274
    .line 275
    .line 276
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 277
    .line 278
    .line 279
    const v17, 0x3f70a3d7    # 0.94f

    .line 280
    .line 281
    .line 282
    const/16 v18, 0x0

    .line 283
    .line 284
    const v13, 0x3e947ae1    # 0.29f

    .line 285
    .line 286
    .line 287
    const v14, -0x41dc28f6    # -0.16f

    .line 288
    .line 289
    .line 290
    const v15, 0x3f266666    # 0.65f

    .line 291
    .line 292
    .line 293
    const v16, -0x41d1eb85    # -0.17f

    .line 294
    .line 295
    .line 296
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 297
    .line 298
    .line 299
    const v17, 0x40a1eb85    # 5.06f

    .line 300
    .line 301
    .line 302
    const v13, 0x3fcb851f    # 1.59f

    .line 303
    .line 304
    .line 305
    const v14, 0x3f666666    # 0.9f

    .line 306
    .line 307
    .line 308
    const v15, 0x405eb852    # 3.48f

    .line 309
    .line 310
    .line 311
    const v16, 0x3f666666    # 0.9f

    .line 312
    .line 313
    .line 314
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 315
    .line 316
    .line 317
    const v17, 0x3f70a3d7    # 0.94f

    .line 318
    .line 319
    .line 320
    const v13, 0x3e947ae1    # 0.29f

    .line 321
    .line 322
    .line 323
    const v14, -0x41dc28f6    # -0.16f

    .line 324
    .line 325
    .line 326
    const v15, 0x3f266666    # 0.65f

    .line 327
    .line 328
    .line 329
    const v16, -0x41dc28f6    # -0.16f

    .line 330
    .line 331
    .line 332
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 333
    .line 334
    .line 335
    const v17, 0x40a1eb85    # 5.06f

    .line 336
    .line 337
    .line 338
    const v13, 0x3fcb851f    # 1.59f

    .line 339
    .line 340
    .line 341
    const v14, 0x3f666666    # 0.9f

    .line 342
    .line 343
    .line 344
    const v15, 0x405eb852    # 3.48f

    .line 345
    .line 346
    .line 347
    const v16, 0x3f666666    # 0.9f

    .line 348
    .line 349
    .line 350
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 351
    .line 352
    .line 353
    const v17, 0x3f70a3d7    # 0.94f

    .line 354
    .line 355
    .line 356
    const v13, 0x3e947ae1    # 0.29f

    .line 357
    .line 358
    .line 359
    const v14, -0x41dc28f6    # -0.16f

    .line 360
    .line 361
    .line 362
    const v15, 0x3f266666    # 0.65f

    .line 363
    .line 364
    .line 365
    const v16, -0x41dc28f6    # -0.16f

    .line 366
    .line 367
    .line 368
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 369
    .line 370
    .line 371
    const/high16 v17, 0x41a80000    # 21.0f

    .line 372
    .line 373
    const/high16 v18, 0x41a80000    # 21.0f

    .line 374
    .line 375
    const v13, 0x419a28f6    # 19.27f

    .line 376
    .line 377
    .line 378
    const v14, 0x41a6147b    # 20.76f

    .line 379
    .line 380
    .line 381
    const v15, 0x41a10a3d    # 20.13f

    .line 382
    .line 383
    .line 384
    const/high16 v16, 0x41a80000    # 21.0f

    .line 385
    .line 386
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 387
    .line 388
    .line 389
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 390
    .line 391
    .line 392
    const/high16 v17, 0x41b00000    # 22.0f

    .line 393
    .line 394
    const/high16 v18, 0x41b00000    # 22.0f

    .line 395
    .line 396
    const v13, 0x41ac6666    # 21.55f

    .line 397
    .line 398
    .line 399
    const/high16 v14, 0x41a80000    # 21.0f

    .line 400
    .line 401
    const/high16 v15, 0x41b00000    # 22.0f

    .line 402
    .line 403
    const v16, 0x41ab999a    # 21.45f

    .line 404
    .line 405
    .line 406
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 407
    .line 408
    .line 409
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 410
    .line 411
    .line 412
    const v0, 0x4100a3d7    # 8.04f

    .line 413
    .line 414
    .line 415
    const v2, 0x4196e148    # 18.86f

    .line 416
    .line 417
    .line 418
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 419
    .line 420
    .line 421
    const/high16 v17, 0x41100000    # 9.0f

    .line 422
    .line 423
    const/high16 v18, 0x41980000    # 19.0f

    .line 424
    .line 425
    const v13, 0x4105999a    # 8.35f

    .line 426
    .line 427
    .line 428
    const v14, 0x4197999a    # 18.95f

    .line 429
    .line 430
    .line 431
    const v15, 0x410ab852    # 8.67f

    .line 432
    .line 433
    .line 434
    const/high16 v16, 0x41980000    # 19.0f

    .line 435
    .line 436
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 437
    .line 438
    .line 439
    const v17, 0x4018f5c3    # 2.39f

    .line 440
    .line 441
    .line 442
    const v18, -0x40970a3d    # -0.91f

    .line 443
    .line 444
    .line 445
    const v13, 0x3f666666    # 0.9f

    .line 446
    .line 447
    .line 448
    const/4 v14, 0x0

    .line 449
    const v15, 0x3fdc28f6    # 1.72f

    .line 450
    .line 451
    .line 452
    const v16, -0x41428f5c    # -0.37f

    .line 453
    .line 454
    .line 455
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 456
    .line 457
    .line 458
    const v17, 0x3f9c28f6    # 1.22f

    .line 459
    .line 460
    .line 461
    const/16 v18, 0x0

    .line 462
    .line 463
    const v13, 0x3eb33333    # 0.35f

    .line 464
    .line 465
    .line 466
    const v14, -0x4170a3d7    # -0.28f

    .line 467
    .line 468
    .line 469
    const v15, 0x3f5eb852    # 0.87f

    .line 470
    .line 471
    .line 472
    const v16, -0x4170a3d7    # -0.28f

    .line 473
    .line 474
    .line 475
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 476
    .line 477
    .line 478
    const/high16 v17, 0x41700000    # 15.0f

    .line 479
    .line 480
    const/high16 v18, 0x41980000    # 19.0f

    .line 481
    .line 482
    const v13, 0x41547ae1    # 13.28f

    .line 483
    .line 484
    .line 485
    const v14, 0x41950a3d    # 18.63f

    .line 486
    .line 487
    .line 488
    const v15, 0x4161999a    # 14.1f

    .line 489
    .line 490
    .line 491
    const/high16 v16, 0x41980000    # 19.0f

    .line 492
    .line 493
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 494
    .line 495
    .line 496
    const v0, 0x4018f5c3    # 2.39f

    .line 497
    .line 498
    .line 499
    const v2, -0x40970a3d    # -0.91f

    .line 500
    .line 501
    .line 502
    const v4, 0x3fdc28f6    # 1.72f

    .line 503
    .line 504
    .line 505
    const v6, -0x41428f5c    # -0.37f

    .line 506
    .line 507
    .line 508
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 509
    .line 510
    .line 511
    const v17, 0x3de147ae    # 0.11f

    .line 512
    .line 513
    .line 514
    const v18, -0x4270a3d7    # -0.07f

    .line 515
    .line 516
    .line 517
    const v13, 0x3cf5c28f    # 0.03f

    .line 518
    .line 519
    .line 520
    const v14, -0x430a3d71    # -0.03f

    .line 521
    .line 522
    .line 523
    const v15, 0x3d8f5c29    # 0.07f

    .line 524
    .line 525
    .line 526
    const v16, -0x42b33333    # -0.05f

    .line 527
    .line 528
    .line 529
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 530
    .line 531
    .line 532
    const/high16 v17, -0x40400000    # -1.5f

    .line 533
    .line 534
    const v18, -0x406a3d71    # -1.17f

    .line 535
    .line 536
    .line 537
    const v13, -0x41147ae1    # -0.46f

    .line 538
    .line 539
    .line 540
    const v14, -0x413851ec    # -0.39f

    .line 541
    .line 542
    .line 543
    const v15, -0x4087ae14    # -0.97f

    .line 544
    .line 545
    .line 546
    const v16, -0x40b5c28f    # -0.79f

    .line 547
    .line 548
    .line 549
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 550
    .line 551
    .line 552
    const v0, -0x3fc851ec    # -2.87f

    .line 553
    .line 554
    .line 555
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 556
    .line 557
    .line 558
    const v17, -0x40bae148    # -0.77f

    .line 559
    .line 560
    .line 561
    const v18, -0x40370a3d    # -1.57f

    .line 562
    .line 563
    .line 564
    const/4 v13, 0x0

    .line 565
    const v14, -0x40e3d70a    # -0.61f

    .line 566
    .line 567
    .line 568
    const v15, -0x4170a3d7    # -0.28f

    .line 569
    .line 570
    .line 571
    const v16, -0x4067ae14    # -1.19f

    .line 572
    .line 573
    .line 574
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 575
    .line 576
    .line 577
    const v0, 0x4142b852    # 12.17f

    .line 578
    .line 579
    .line 580
    const/high16 v2, 0x41200000    # 10.0f

    .line 581
    .line 582
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 583
    .line 584
    .line 585
    const/high16 v0, 0x40100000    # 2.25f

    .line 586
    .line 587
    const v2, -0x403d70a4    # -1.52f

    .line 588
    .line 589
    .line 590
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 591
    .line 592
    .line 593
    const v17, 0x409dc28f    # 4.93f

    .line 594
    .line 595
    .line 596
    const v18, 0x405b851f    # 3.43f

    .line 597
    .line 598
    .line 599
    const v13, 0x3f83d70a    # 1.03f

    .line 600
    .line 601
    .line 602
    const v14, 0x3fe51eb8    # 1.79f

    .line 603
    .line 604
    .line 605
    const v15, 0x40347ae1    # 2.82f

    .line 606
    .line 607
    .line 608
    const v16, 0x40451eb8    # 3.08f

    .line 609
    .line 610
    .line 611
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 612
    .line 613
    .line 614
    const v17, 0x3f91eb85    # 1.14f

    .line 615
    .line 616
    .line 617
    const/high16 v18, -0x40800000    # -1.0f

    .line 618
    .line 619
    const v13, 0x3f19999a    # 0.6f

    .line 620
    .line 621
    .line 622
    const v14, 0x3dcccccd    # 0.1f

    .line 623
    .line 624
    .line 625
    const v15, 0x3f91eb85    # 1.14f

    .line 626
    .line 627
    .line 628
    const v16, -0x413851ec    # -0.39f

    .line 629
    .line 630
    .line 631
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 632
    .line 633
    .line 634
    const v17, -0x40a8f5c3    # -0.84f

    .line 635
    .line 636
    .line 637
    const v18, -0x40851eb8    # -0.98f

    .line 638
    .line 639
    .line 640
    const/4 v13, 0x0

    .line 641
    const v14, -0x41051eb8    # -0.49f

    .line 642
    .line 643
    .line 644
    const v15, -0x4147ae14    # -0.36f

    .line 645
    .line 646
    .line 647
    const v16, -0x4099999a    # -0.9f

    .line 648
    .line 649
    .line 650
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 651
    .line 652
    .line 653
    const v17, -0x3f9f5c29    # -3.51f

    .line 654
    .line 655
    .line 656
    const v18, -0x3fe28f5c    # -2.46f

    .line 657
    .line 658
    .line 659
    const/high16 v13, -0x40400000    # -1.5f

    .line 660
    .line 661
    const/high16 v14, -0x41800000    # -0.25f

    .line 662
    .line 663
    const v15, -0x3fce147b    # -2.78f

    .line 664
    .line 665
    .line 666
    const v16, -0x4068f5c3    # -1.18f

    .line 667
    .line 668
    .line 669
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 670
    .line 671
    .line 672
    const v0, -0x409eb852    # -0.88f

    .line 673
    .line 674
    .line 675
    const v2, -0x4039999a    # -1.55f

    .line 676
    .line 677
    .line 678
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 679
    .line 680
    .line 681
    const v17, -0x4063d70a    # -1.22f

    .line 682
    .line 683
    .line 684
    const v18, -0x409c28f6    # -0.89f

    .line 685
    .line 686
    .line 687
    const v13, -0x416b851f    # -0.29f

    .line 688
    .line 689
    .line 690
    const v14, -0x40fae148    # -0.52f

    .line 691
    .line 692
    .line 693
    const v15, -0x40bae148    # -0.77f

    .line 694
    .line 695
    .line 696
    const v16, -0x40b33333    # -0.8f

    .line 697
    .line 698
    .line 699
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 700
    .line 701
    .line 702
    const v0, 0x4114f5c3    # 9.31f

    .line 703
    .line 704
    .line 705
    const v2, 0x4084cccd    # 4.15f

    .line 706
    .line 707
    .line 708
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 709
    .line 710
    .line 711
    const/high16 v17, -0x40400000    # -1.5f

    .line 712
    .line 713
    const v18, 0x3ea3d70a    # 0.32f

    .line 714
    .line 715
    .line 716
    const v13, -0x40fae148    # -0.52f

    .line 717
    .line 718
    .line 719
    const v14, -0x42333333    # -0.1f

    .line 720
    .line 721
    .line 722
    const v15, -0x407851ec    # -1.06f

    .line 723
    .line 724
    .line 725
    const v16, 0x3ca3d70a    # 0.02f

    .line 726
    .line 727
    .line 728
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 729
    .line 730
    .line 731
    const v0, 0x40ba3d71    # 5.82f

    .line 732
    .line 733
    .line 734
    const v2, 0x40ba8f5c    # 5.83f

    .line 735
    .line 736
    .line 737
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 738
    .line 739
    .line 740
    const v17, 0x40b1eb85    # 5.56f

    .line 741
    .line 742
    .line 743
    const v18, 0x40e70a3d    # 7.22f

    .line 744
    .line 745
    .line 746
    const v13, 0x40abd70a    # 5.37f

    .line 747
    .line 748
    .line 749
    const v14, 0x40c4cccd    # 6.15f

    .line 750
    .line 751
    .line 752
    const/high16 v15, 0x40a80000    # 5.25f

    .line 753
    .line 754
    const v16, 0x40d8a3d7    # 6.77f

    .line 755
    .line 756
    .line 757
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 758
    .line 759
    .line 760
    const v17, 0x40deb852    # 6.96f

    .line 761
    .line 762
    .line 763
    const v18, 0x40efae14    # 7.49f

    .line 764
    .line 765
    .line 766
    const v13, 0x40bc28f6    # 5.88f

    .line 767
    .line 768
    .line 769
    const v14, 0x40f5c28f    # 7.68f

    .line 770
    .line 771
    .line 772
    const/high16 v15, 0x40d00000    # 6.5f

    .line 773
    .line 774
    const v16, 0x40f9999a    # 7.8f

    .line 775
    .line 776
    .line 777
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 778
    .line 779
    .line 780
    const v0, 0x3ffeb852    # 1.99f

    .line 781
    .line 782
    .line 783
    const v2, -0x4050a3d7    # -1.37f

    .line 784
    .line 785
    .line 786
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 787
    .line 788
    .line 789
    const v0, 0x3ebd70a4    # 0.37f

    .line 790
    .line 791
    .line 792
    const/high16 v2, 0x40000000    # 2.0f

    .line 793
    .line 794
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 795
    .line 796
    .line 797
    const v0, 0x410ccccd    # 8.8f

    .line 798
    .line 799
    .line 800
    const v2, 0x40fe147b    # 7.94f

    .line 801
    .line 802
    .line 803
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 804
    .line 805
    .line 806
    const v17, 0x41007ae1    # 8.03f

    .line 807
    .line 808
    .line 809
    const v18, 0x411bae14    # 9.73f

    .line 810
    .line 811
    .line 812
    const v13, 0x41033333    # 8.2f

    .line 813
    .line 814
    .line 815
    const v14, 0x4105999a    # 8.35f

    .line 816
    .line 817
    .line 818
    const v15, 0x40fd1eb8    # 7.91f

    .line 819
    .line 820
    .line 821
    const v16, 0x4110f5c3    # 9.06f

    .line 822
    .line 823
    .line 824
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 825
    .line 826
    .line 827
    const v0, 0x3f051eb8    # 0.52f

    .line 828
    .line 829
    .line 830
    const v2, 0x40466666    # 3.1f

    .line 831
    .line 832
    .line 833
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 834
    .line 835
    .line 836
    const v17, 0x409b3333    # 4.85f

    .line 837
    .line 838
    .line 839
    const/high16 v18, 0x41400000    # 12.0f

    .line 840
    .line 841
    const v13, 0x40e428f6    # 7.13f

    .line 842
    .line 843
    .line 844
    const v14, 0x4144f5c3    # 12.31f

    .line 845
    .line 846
    .line 847
    const v15, 0x40ba8f5c    # 5.83f

    .line 848
    .line 849
    .line 850
    const/high16 v16, 0x41400000    # 12.0f

    .line 851
    .line 852
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 853
    .line 854
    .line 855
    const/high16 v17, 0x40400000    # 3.0f

    .line 856
    .line 857
    const v18, 0x41547ae1    # 13.28f

    .line 858
    .line 859
    .line 860
    const v13, 0x408051ec    # 4.01f

    .line 861
    .line 862
    .line 863
    const/high16 v14, 0x41400000    # 12.0f

    .line 864
    .line 865
    const/high16 v15, 0x40400000    # 3.0f

    .line 866
    .line 867
    const/high16 v16, 0x41440000    # 12.25f

    .line 868
    .line 869
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 870
    .line 871
    .line 872
    const v17, 0x4100a3d7    # 8.04f

    .line 873
    .line 874
    .line 875
    const v18, 0x4196e148    # 18.86f

    .line 876
    .line 877
    .line 878
    const/high16 v13, 0x40400000    # 3.0f

    .line 879
    .line 880
    const v14, 0x416b851f    # 14.72f

    .line 881
    .line 882
    .line 883
    const v15, 0x40a6147b    # 5.19f

    .line 884
    .line 885
    .line 886
    const v16, 0x41873333    # 16.9f

    .line 887
    .line 888
    .line 889
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 890
    .line 891
    .line 892
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 893
    .line 894
    .line 895
    const/high16 v0, 0x41600000    # 14.0f

    .line 896
    .line 897
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 898
    .line 899
    .line 900
    const/high16 v0, 0x3fc00000    # 1.5f

    .line 901
    .line 902
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 903
    .line 904
    .line 905
    const v17, -0x3faf5c29    # -3.26f

    .line 906
    .line 907
    .line 908
    const/high16 v18, -0x40200000    # -1.75f

    .line 909
    .line 910
    const v13, -0x40b851ec    # -0.78f

    .line 911
    .line 912
    .line 913
    const v14, -0x410a3d71    # -0.48f

    .line 914
    .line 915
    .line 916
    const v15, -0x3fea3d71    # -2.34f

    .line 917
    .line 918
    .line 919
    const v16, -0x4055c28f    # -1.33f

    .line 920
    .line 921
    .line 922
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 923
    .line 924
    .line 925
    const v0, 0x4124cccd    # 10.3f

    .line 926
    .line 927
    .line 928
    const v2, 0x4131999a    # 11.1f

    .line 929
    .line 930
    .line 931
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 932
    .line 933
    .line 934
    const/high16 v0, 0x41600000    # 14.0f

    .line 935
    .line 936
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 937
    .line 938
    .line 939
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 940
    .line 941
    .line 942
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 943
    .line 944
    .line 945
    move-result-object v2

    .line 946
    const/16 v16, 0x3800

    .line 947
    .line 948
    const/16 v17, 0x0

    .line 949
    .line 950
    const/high16 v6, 0x3f800000    # 1.0f

    .line 951
    .line 952
    const/high16 v8, 0x3f800000    # 1.0f

    .line 953
    .line 954
    const/4 v7, 0x0

    .line 955
    const/high16 v9, 0x3f800000    # 1.0f

    .line 956
    .line 957
    const/high16 v12, 0x3f800000    # 1.0f

    .line 958
    .line 959
    const/4 v13, 0x0

    .line 960
    const/4 v14, 0x0

    .line 961
    const/4 v15, 0x0

    .line 962
    const-string v4, ""

    .line 963
    .line 964
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 965
    .line 966
    .line 967
    move-result-object v0

    .line 968
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 969
    .line 970
    .line 971
    move-result-object v0

    .line 972
    sput-object v0, Landroidx/compose/material/icons/rounded/SurfingKt;->_surfing:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 973
    .line 974
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 975
    .line 976
    .line 977
    return-object v0
.end method
