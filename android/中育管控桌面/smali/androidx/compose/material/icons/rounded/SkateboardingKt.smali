.class public final Landroidx/compose/material/icons/rounded/SkateboardingKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_skateboarding",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "Skateboarding",
        "Landroidx/compose/material/icons/Icons$Rounded;",
        "getSkateboarding",
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
        "SMAP\nSkateboarding.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Skateboarding.kt\nandroidx/compose/material/icons/rounded/SkateboardingKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,100:1\n212#2,12:101\n233#2,18:114\n253#2:151\n174#3:113\n705#4,2:132\n717#4,2:134\n719#4,11:140\n72#5,4:136\n*S KotlinDebug\n*F\n+ 1 Skateboarding.kt\nandroidx/compose/material/icons/rounded/SkateboardingKt\n*L\n29#1:101,12\n30#1:114,18\n30#1:151\n29#1:113\n30#1:132,2\n30#1:134,2\n30#1:140,11\n30#1:136,4\n*E\n"
    }
.end annotation


# static fields
.field private static _skateboarding:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getSkateboarding(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/SkateboardingKt;->_skateboarding:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.Skateboarding"

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
    const/high16 v0, 0x40400000    # 3.0f

    .line 71
    .line 72
    const/high16 v2, 0x41500000    # 13.0f

    .line 73
    .line 74
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v17, 0x40000000    # 2.0f

    .line 78
    .line 79
    const/high16 v18, -0x40000000    # -2.0f

    .line 80
    .line 81
    const/4 v13, 0x0

    .line 82
    const v14, -0x40733333    # -1.1f

    .line 83
    .line 84
    .line 85
    const v15, 0x3f666666    # 0.9f

    .line 86
    .line 87
    .line 88
    const/high16 v16, -0x40000000    # -2.0f

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
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 99
    .line 100
    .line 101
    const/high16 v17, -0x40000000    # -2.0f

    .line 102
    .line 103
    const/high16 v18, 0x40000000    # 2.0f

    .line 104
    .line 105
    const v14, 0x3f8ccccd    # 1.1f

    .line 106
    .line 107
    .line 108
    const v15, -0x4099999a    # -0.9f

    .line 109
    .line 110
    .line 111
    const/high16 v16, 0x40000000    # 2.0f

    .line 112
    .line 113
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 114
    .line 115
    .line 116
    const v0, 0x40833333    # 4.1f

    .line 117
    .line 118
    .line 119
    const/high16 v2, 0x40400000    # 3.0f

    .line 120
    .line 121
    const/high16 v4, 0x41500000    # 13.0f

    .line 122
    .line 123
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 124
    .line 125
    .line 126
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 127
    .line 128
    .line 129
    const/high16 v0, 0x40e80000    # 7.25f

    .line 130
    .line 131
    const/high16 v2, 0x41b40000    # 22.5f

    .line 132
    .line 133
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 134
    .line 135
    .line 136
    const/high16 v17, -0x40c00000    # -0.75f

    .line 137
    .line 138
    const/high16 v18, 0x3f400000    # 0.75f

    .line 139
    .line 140
    const v13, -0x412e147b    # -0.41f

    .line 141
    .line 142
    .line 143
    const/4 v14, 0x0

    .line 144
    const/high16 v15, -0x40c00000    # -0.75f

    .line 145
    .line 146
    const v16, 0x3eae147b    # 0.34f

    .line 147
    .line 148
    .line 149
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 150
    .line 151
    .line 152
    const v0, 0x40dae148    # 6.84f

    .line 153
    .line 154
    .line 155
    const/high16 v2, 0x40e80000    # 7.25f

    .line 156
    .line 157
    const/high16 v4, 0x41c00000    # 24.0f

    .line 158
    .line 159
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 160
    .line 161
    .line 162
    const v0, 0x41bd47ae    # 23.66f

    .line 163
    .line 164
    .line 165
    const/high16 v2, 0x41ba0000    # 23.25f

    .line 166
    .line 167
    const/high16 v4, 0x41000000    # 8.0f

    .line 168
    .line 169
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 170
    .line 171
    .line 172
    const v0, 0x40f51eb8    # 7.66f

    .line 173
    .line 174
    .line 175
    const/high16 v2, 0x40e80000    # 7.25f

    .line 176
    .line 177
    const/high16 v4, 0x41b40000    # 22.5f

    .line 178
    .line 179
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 180
    .line 181
    .line 182
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 183
    .line 184
    .line 185
    const/high16 v0, 0x417c0000    # 15.75f

    .line 186
    .line 187
    const/high16 v2, 0x41b40000    # 22.5f

    .line 188
    .line 189
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 190
    .line 191
    .line 192
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 193
    .line 194
    .line 195
    const v0, 0x417570a4    # 15.34f

    .line 196
    .line 197
    .line 198
    const/high16 v2, 0x417c0000    # 15.75f

    .line 199
    .line 200
    const/high16 v4, 0x41c00000    # 24.0f

    .line 201
    .line 202
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 203
    .line 204
    .line 205
    const v0, -0x4151eb85    # -0.34f

    .line 206
    .line 207
    .line 208
    const/high16 v2, -0x40c00000    # -0.75f

    .line 209
    .line 210
    const/high16 v4, 0x3f400000    # 0.75f

    .line 211
    .line 212
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 213
    .line 214
    .line 215
    const v0, 0x418147ae    # 16.16f

    .line 216
    .line 217
    .line 218
    const/high16 v2, 0x417c0000    # 15.75f

    .line 219
    .line 220
    const/high16 v4, 0x41b40000    # 22.5f

    .line 221
    .line 222
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 223
    .line 224
    .line 225
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 226
    .line 227
    .line 228
    const v0, 0x4199eb85    # 19.24f

    .line 229
    .line 230
    .line 231
    const/high16 v2, 0x41980000    # 19.0f

    .line 232
    .line 233
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 234
    .line 235
    .line 236
    const v17, -0x40e8f5c3    # -0.59f

    .line 237
    .line 238
    .line 239
    const v18, 0x3e99999a    # 0.3f

    .line 240
    .line 241
    .line 242
    const v13, -0x418a3d71    # -0.24f

    .line 243
    .line 244
    .line 245
    const v15, -0x4119999a    # -0.45f

    .line 246
    .line 247
    .line 248
    const v16, 0x3de147ae    # 0.11f

    .line 249
    .line 250
    .line 251
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 252
    .line 253
    .line 254
    const v17, -0x3fe66666    # -2.4f

    .line 255
    .line 256
    .line 257
    const v18, 0x3f99999a    # 1.2f

    .line 258
    .line 259
    .line 260
    const v13, -0x40f33333    # -0.55f

    .line 261
    .line 262
    .line 263
    const v14, 0x3f3ae148    # 0.73f

    .line 264
    .line 265
    .line 266
    const v15, -0x404a3d71    # -1.42f

    .line 267
    .line 268
    .line 269
    const v16, 0x3f99999a    # 1.2f

    .line 270
    .line 271
    .line 272
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 273
    .line 274
    .line 275
    const/high16 v0, 0x41800000    # 16.0f

    .line 276
    .line 277
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 278
    .line 279
    .line 280
    const v0, -0x3f63d70a    # -4.88f

    .line 281
    .line 282
    .line 283
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 284
    .line 285
    .line 286
    const v17, -0x408ccccd    # -0.95f

    .line 287
    .line 288
    .line 289
    const v18, -0x40266666    # -1.7f

    .line 290
    .line 291
    .line 292
    const/4 v13, 0x0

    .line 293
    const v14, -0x40cf5c29    # -0.69f

    .line 294
    .line 295
    .line 296
    const v15, -0x4147ae14    # -0.36f

    .line 297
    .line 298
    .line 299
    const v16, -0x40547ae1    # -1.34f

    .line 300
    .line 301
    .line 302
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 303
    .line 304
    .line 305
    const v0, -0x3fa851ec    # -3.37f

    .line 306
    .line 307
    .line 308
    const v2, -0x3ffae148    # -2.08f

    .line 309
    .line 310
    .line 311
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 312
    .line 313
    .line 314
    const v0, 0x3fe66666    # 1.8f

    .line 315
    .line 316
    .line 317
    const v2, -0x3fc70a3d    # -2.89f

    .line 318
    .line 319
    .line 320
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 321
    .line 322
    .line 323
    const v17, 0x408c7ae1    # 4.39f

    .line 324
    .line 325
    .line 326
    const v18, 0x403d70a4    # 2.96f

    .line 327
    .line 328
    .line 329
    const v13, 0x3f75c28f    # 0.96f

    .line 330
    .line 331
    .line 332
    const v14, 0x3fc3d70a    # 1.53f

    .line 333
    .line 334
    .line 335
    const v15, 0x40228f5c    # 2.54f

    .line 336
    .line 337
    .line 338
    const v16, 0x4028f5c3    # 2.64f

    .line 339
    .line 340
    .line 341
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 342
    .line 343
    .line 344
    const v17, 0x3f90a3d7    # 1.13f

    .line 345
    .line 346
    .line 347
    const v18, -0x40828f5c    # -0.99f

    .line 348
    .line 349
    .line 350
    const v13, 0x3f19999a    # 0.6f

    .line 351
    .line 352
    .line 353
    const v14, 0x3de147ae    # 0.11f

    .line 354
    .line 355
    .line 356
    const v15, 0x3f90a3d7    # 1.13f

    .line 357
    .line 358
    .line 359
    const v16, -0x413851ec    # -0.39f

    .line 360
    .line 361
    .line 362
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 363
    .line 364
    .line 365
    const/4 v0, 0x0

    .line 366
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 367
    .line 368
    .line 369
    const v17, -0x40ab851f    # -0.83f

    .line 370
    .line 371
    .line 372
    const v18, -0x40851eb8    # -0.98f

    .line 373
    .line 374
    .line 375
    const/4 v13, 0x0

    .line 376
    const v14, -0x410a3d71    # -0.48f

    .line 377
    .line 378
    .line 379
    const v15, -0x414ccccd    # -0.35f

    .line 380
    .line 381
    .line 382
    const v16, -0x409c28f6    # -0.89f

    .line 383
    .line 384
    .line 385
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 386
    .line 387
    .line 388
    const v17, -0x3faccccd    # -3.3f

    .line 389
    .line 390
    .line 391
    const v18, -0x3fd70a3d    # -2.64f

    .line 392
    .line 393
    .line 394
    const v13, -0x404147ae    # -1.49f

    .line 395
    .line 396
    .line 397
    const v14, -0x4170a3d7    # -0.28f

    .line 398
    .line 399
    .line 400
    const v15, -0x3fd1eb85    # -2.72f

    .line 401
    .line 402
    .line 403
    const v16, -0x405ae148    # -1.29f

    .line 404
    .line 405
    .line 406
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 407
    .line 408
    .line 409
    const v0, -0x40fae148    # -0.52f

    .line 410
    .line 411
    .line 412
    const v2, -0x40651eb8    # -1.21f

    .line 413
    .line 414
    .line 415
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 416
    .line 417
    .line 418
    const v17, 0x414b3333    # 12.7f

    .line 419
    .line 420
    .line 421
    const/high16 v18, 0x40a00000    # 5.0f

    .line 422
    .line 423
    const v13, 0x41628f5c    # 14.16f

    .line 424
    .line 425
    .line 426
    const v14, 0x40b47ae1    # 5.64f

    .line 427
    .line 428
    .line 429
    const v15, 0x4159c28f    # 13.61f

    .line 430
    .line 431
    .line 432
    const/high16 v16, 0x40a00000    # 5.0f

    .line 433
    .line 434
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 435
    .line 436
    .line 437
    const v0, 0x4101c28f    # 8.11f

    .line 438
    .line 439
    .line 440
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 441
    .line 442
    .line 443
    const v17, -0x40266666    # -1.7f

    .line 444
    .line 445
    .line 446
    const v18, 0x3f70a3d7    # 0.94f

    .line 447
    .line 448
    .line 449
    const v13, -0x40cf5c29    # -0.69f

    .line 450
    .line 451
    .line 452
    const/4 v14, 0x0

    .line 453
    const v15, -0x4055c28f    # -1.33f

    .line 454
    .line 455
    .line 456
    const v16, 0x3eb851ec    # 0.36f

    .line 457
    .line 458
    .line 459
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 460
    .line 461
    .line 462
    const v0, 0x40a0f5c3    # 5.03f

    .line 463
    .line 464
    .line 465
    const v2, 0x41026666    # 8.15f

    .line 466
    .line 467
    .line 468
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 469
    .line 470
    .line 471
    const v17, 0x40ab3333    # 5.35f

    .line 472
    .line 473
    .line 474
    const v18, 0x41187ae1    # 9.53f

    .line 475
    .line 476
    .line 477
    const v13, 0x4097ae14    # 4.74f

    .line 478
    .line 479
    .line 480
    const v14, 0x4109eb85    # 8.62f

    .line 481
    .line 482
    .line 483
    const v15, 0x409c28f6    # 4.88f

    .line 484
    .line 485
    .line 486
    const v16, 0x4113d70a    # 9.24f

    .line 487
    .line 488
    .line 489
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 490
    .line 491
    .line 492
    const/4 v0, 0x0

    .line 493
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 494
    .line 495
    .line 496
    const v17, 0x3fb0a3d7    # 1.38f

    .line 497
    .line 498
    .line 499
    const v18, -0x415c28f6    # -0.32f

    .line 500
    .line 501
    .line 502
    const v13, 0x3ef0a3d7    # 0.47f

    .line 503
    .line 504
    .line 505
    const v14, 0x3e947ae1    # 0.29f

    .line 506
    .line 507
    .line 508
    const v15, 0x3f8b851f    # 1.09f

    .line 509
    .line 510
    .line 511
    const v16, 0x3e19999a    # 0.15f

    .line 512
    .line 513
    .line 514
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 515
    .line 516
    .line 517
    const v0, 0x4101999a    # 8.1f

    .line 518
    .line 519
    .line 520
    const/high16 v2, 0x40e00000    # 7.0f

    .line 521
    .line 522
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 523
    .line 524
    .line 525
    const v0, 0x40166666    # 2.35f

    .line 526
    .line 527
    .line 528
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 529
    .line 530
    .line 531
    const v0, -0x3fe66666    # -2.4f

    .line 532
    .line 533
    .line 534
    const v2, 0x4075c28f    # 3.84f

    .line 535
    .line 536
    .line 537
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 538
    .line 539
    .line 540
    const v17, -0x41a8f5c3    # -0.21f

    .line 541
    .line 542
    .line 543
    const v18, 0x3fd5c28f    # 1.67f

    .line 544
    .line 545
    .line 546
    const v13, -0x416147ae    # -0.31f

    .line 547
    .line 548
    .line 549
    const/high16 v14, 0x3f000000    # 0.5f

    .line 550
    .line 551
    const v15, -0x413851ec    # -0.39f

    .line 552
    .line 553
    .line 554
    const v16, 0x3f8e147b    # 1.11f

    .line 555
    .line 556
    .line 557
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 558
    .line 559
    .line 560
    const v0, 0x3fab851f    # 1.34f

    .line 561
    .line 562
    .line 563
    const v2, 0x4084cccd    # 4.15f

    .line 564
    .line 565
    .line 566
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 567
    .line 568
    .line 569
    const v0, -0x3fb851ec    # -3.12f

    .line 570
    .line 571
    .line 572
    const v2, 0x4070a3d7    # 3.76f

    .line 573
    .line 574
    .line 575
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 576
    .line 577
    .line 578
    const v17, -0x40251eb8    # -1.71f

    .line 579
    .line 580
    .line 581
    const v18, -0x4070a3d7    # -1.12f

    .line 582
    .line 583
    .line 584
    const v13, -0x40cccccd    # -0.7f

    .line 585
    .line 586
    .line 587
    const v14, -0x41dc28f6    # -0.16f

    .line 588
    .line 589
    .line 590
    const v15, -0x4059999a    # -1.3f

    .line 591
    .line 592
    .line 593
    const v16, -0x40ee147b    # -0.57f

    .line 594
    .line 595
    .line 596
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 597
    .line 598
    .line 599
    const/high16 v17, 0x40700000    # 3.75f

    .line 600
    .line 601
    const/high16 v18, 0x41980000    # 19.0f

    .line 602
    .line 603
    const v13, 0x4086b852    # 4.21f

    .line 604
    .line 605
    .line 606
    const v14, 0x4198e148    # 19.11f

    .line 607
    .line 608
    .line 609
    const v15, 0x407f5c29    # 3.99f

    .line 610
    .line 611
    .line 612
    const/high16 v16, 0x41980000    # 19.0f

    .line 613
    .line 614
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 615
    .line 616
    .line 617
    const/high16 v17, 0x40400000    # 3.0f

    .line 618
    .line 619
    const/high16 v18, 0x419e0000    # 19.75f

    .line 620
    .line 621
    const v13, 0x4053d70a    # 3.31f

    .line 622
    .line 623
    .line 624
    const/high16 v14, 0x41980000    # 19.0f

    .line 625
    .line 626
    const/high16 v15, 0x40400000    # 3.0f

    .line 627
    .line 628
    const v16, 0x419ae148    # 19.36f

    .line 629
    .line 630
    .line 631
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 632
    .line 633
    .line 634
    const v17, 0x3e19999a    # 0.15f

    .line 635
    .line 636
    .line 637
    const v18, 0x3ee66666    # 0.45f

    .line 638
    .line 639
    .line 640
    const/4 v13, 0x0

    .line 641
    const v14, 0x3e19999a    # 0.15f

    .line 642
    .line 643
    .line 644
    const v15, 0x3d4ccccd    # 0.05f

    .line 645
    .line 646
    .line 647
    const v16, 0x3e9eb852    # 0.31f

    .line 648
    .line 649
    .line 650
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 651
    .line 652
    .line 653
    const v17, 0x40666666    # 3.6f

    .line 654
    .line 655
    .line 656
    const v18, 0x3fe66666    # 1.8f

    .line 657
    .line 658
    .line 659
    const v13, 0x3f51eb85    # 0.82f

    .line 660
    .line 661
    .line 662
    const v14, 0x3f8ccccd    # 1.1f

    .line 663
    .line 664
    .line 665
    const v15, 0x400851ec    # 2.13f

    .line 666
    .line 667
    .line 668
    const v16, 0x3fe66666    # 1.8f

    .line 669
    .line 670
    .line 671
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 672
    .line 673
    .line 674
    const/high16 v0, 0x41180000    # 9.5f

    .line 675
    .line 676
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 677
    .line 678
    .line 679
    const v18, -0x4019999a    # -1.8f

    .line 680
    .line 681
    .line 682
    const v13, 0x3fbc28f6    # 1.47f

    .line 683
    .line 684
    .line 685
    const/4 v14, 0x0

    .line 686
    const v15, 0x4031eb85    # 2.78f

    .line 687
    .line 688
    .line 689
    const v16, -0x40cccccd    # -0.7f

    .line 690
    .line 691
    .line 692
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 693
    .line 694
    .line 695
    const v17, 0x3e19999a    # 0.15f

    .line 696
    .line 697
    .line 698
    const v18, -0x4119999a    # -0.45f

    .line 699
    .line 700
    .line 701
    const v13, 0x3dcccccd    # 0.1f

    .line 702
    .line 703
    .line 704
    const v14, -0x41f0a3d7    # -0.14f

    .line 705
    .line 706
    .line 707
    const v15, 0x3e19999a    # 0.15f

    .line 708
    .line 709
    .line 710
    const v16, -0x41666666    # -0.3f

    .line 711
    .line 712
    .line 713
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 714
    .line 715
    .line 716
    const v17, 0x4199eb85    # 19.24f

    .line 717
    .line 718
    .line 719
    const/high16 v18, 0x41980000    # 19.0f

    .line 720
    .line 721
    const/high16 v13, 0x41a00000    # 20.0f

    .line 722
    .line 723
    const v14, 0x419ae148    # 19.36f

    .line 724
    .line 725
    .line 726
    const v15, 0x419d70a4    # 19.68f

    .line 727
    .line 728
    .line 729
    const/high16 v16, 0x41980000    # 19.0f

    .line 730
    .line 731
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 732
    .line 733
    .line 734
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 735
    .line 736
    .line 737
    const/high16 v0, 0x41600000    # 14.0f

    .line 738
    .line 739
    const/high16 v2, 0x41a40000    # 20.5f

    .line 740
    .line 741
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 742
    .line 743
    .line 744
    const v0, 0x4109999a    # 8.6f

    .line 745
    .line 746
    .line 747
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 748
    .line 749
    .line 750
    const v0, 0x400d70a4    # 2.21f

    .line 751
    .line 752
    .line 753
    const v2, -0x3fd51eb8    # -2.67f

    .line 754
    .line 755
    .line 756
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 757
    .line 758
    .line 759
    const v17, 0x3ebd70a4    # 0.37f

    .line 760
    .line 761
    .line 762
    const v18, -0x4011eb85    # -1.86f

    .line 763
    .line 764
    .line 765
    const v13, 0x3edc28f6    # 0.43f

    .line 766
    .line 767
    .line 768
    const v14, -0x40fae148    # -0.52f

    .line 769
    .line 770
    .line 771
    const v15, 0x3f11eb85    # 0.57f

    .line 772
    .line 773
    .line 774
    const v16, -0x40651eb8    # -1.21f

    .line 775
    .line 776
    .line 777
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 778
    .line 779
    .line 780
    const/high16 v0, 0x41280000    # 10.5f

    .line 781
    .line 782
    const v2, 0x415b3333    # 13.7f

    .line 783
    .line 784
    .line 785
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 786
    .line 787
    .line 788
    const/high16 v0, 0x40600000    # 3.5f

    .line 789
    .line 790
    const v2, 0x400ccccd    # 2.2f

    .line 791
    .line 792
    .line 793
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 794
    .line 795
    .line 796
    const/high16 v0, 0x41a40000    # 20.5f

    .line 797
    .line 798
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 799
    .line 800
    .line 801
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 802
    .line 803
    .line 804
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 805
    .line 806
    .line 807
    move-result-object v2

    .line 808
    const/16 v16, 0x3800

    .line 809
    .line 810
    const/16 v17, 0x0

    .line 811
    .line 812
    const/high16 v6, 0x3f800000    # 1.0f

    .line 813
    .line 814
    const/high16 v8, 0x3f800000    # 1.0f

    .line 815
    .line 816
    const/4 v7, 0x0

    .line 817
    const/high16 v9, 0x3f800000    # 1.0f

    .line 818
    .line 819
    const/high16 v12, 0x3f800000    # 1.0f

    .line 820
    .line 821
    const/4 v13, 0x0

    .line 822
    const/4 v14, 0x0

    .line 823
    const/4 v15, 0x0

    .line 824
    const-string v4, ""

    .line 825
    .line 826
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 827
    .line 828
    .line 829
    move-result-object v0

    .line 830
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 831
    .line 832
    .line 833
    move-result-object v0

    .line 834
    sput-object v0, Landroidx/compose/material/icons/rounded/SkateboardingKt;->_skateboarding:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 835
    .line 836
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 837
    .line 838
    .line 839
    return-object v0
.end method
