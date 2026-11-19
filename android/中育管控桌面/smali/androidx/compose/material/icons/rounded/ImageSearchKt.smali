.class public final Landroidx/compose/material/icons/rounded/ImageSearchKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_imageSearch",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "ImageSearch",
        "Landroidx/compose/material/icons/Icons$Rounded;",
        "getImageSearch",
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
        "SMAP\nImageSearch.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageSearch.kt\nandroidx/compose/material/icons/rounded/ImageSearchKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,85:1\n212#2,12:86\n233#2,18:99\n253#2:136\n174#3:98\n705#4,2:117\n717#4,2:119\n719#4,11:125\n72#5,4:121\n*S KotlinDebug\n*F\n+ 1 ImageSearch.kt\nandroidx/compose/material/icons/rounded/ImageSearchKt\n*L\n29#1:86,12\n30#1:99,18\n30#1:136\n29#1:98\n30#1:117,2\n30#1:119,2\n30#1:125,11\n30#1:121,4\n*E\n"
    }
.end annotation


# static fields
.field private static _imageSearch:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getImageSearch(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/ImageSearchKt;->_imageSearch:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.ImageSearch"

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
    const/high16 v0, 0x41700000    # 15.0f

    .line 71
    .line 72
    const/high16 v2, 0x41900000    # 18.0f

    .line 73
    .line 74
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v0, 0x40800000    # 4.0f

    .line 78
    .line 79
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 80
    .line 81
    .line 82
    const/high16 v17, -0x40800000    # -1.0f

    .line 83
    .line 84
    const/high16 v18, 0x3f800000    # 1.0f

    .line 85
    .line 86
    const/4 v13, 0x0

    .line 87
    const v14, 0x3f0ccccd    # 0.55f

    .line 88
    .line 89
    .line 90
    const v15, -0x4119999a    # -0.45f

    .line 91
    .line 92
    .line 93
    const/high16 v16, 0x3f800000    # 1.0f

    .line 94
    .line 95
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 96
    .line 97
    .line 98
    const/high16 v0, 0x40a00000    # 5.0f

    .line 99
    .line 100
    const/high16 v2, 0x41a00000    # 20.0f

    .line 101
    .line 102
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 103
    .line 104
    .line 105
    const/high16 v18, -0x40800000    # -1.0f

    .line 106
    .line 107
    const v13, -0x40f33333    # -0.55f

    .line 108
    .line 109
    .line 110
    const/4 v14, 0x0

    .line 111
    const/high16 v15, -0x40800000    # -1.0f

    .line 112
    .line 113
    const v16, -0x4119999a    # -0.45f

    .line 114
    .line 115
    .line 116
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 117
    .line 118
    .line 119
    const/high16 v0, 0x40e00000    # 7.0f

    .line 120
    .line 121
    const/high16 v2, 0x40800000    # 4.0f

    .line 122
    .line 123
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 124
    .line 125
    .line 126
    const/high16 v17, 0x3f800000    # 1.0f

    .line 127
    .line 128
    const/4 v13, 0x0

    .line 129
    const v14, -0x40f33333    # -0.55f

    .line 130
    .line 131
    .line 132
    const v15, 0x3ee66666    # 0.45f

    .line 133
    .line 134
    .line 135
    const/high16 v16, -0x40800000    # -1.0f

    .line 136
    .line 137
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 138
    .line 139
    .line 140
    const v0, 0x404147ae    # 3.02f

    .line 141
    .line 142
    .line 143
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 144
    .line 145
    .line 146
    const v13, 0x3f0ccccd    # 0.55f

    .line 147
    .line 148
    .line 149
    const/4 v14, 0x0

    .line 150
    const/high16 v15, 0x3f800000    # 1.0f

    .line 151
    .line 152
    const v16, -0x4119999a    # -0.45f

    .line 153
    .line 154
    .line 155
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 156
    .line 157
    .line 158
    const v0, -0x4119999a    # -0.45f

    .line 159
    .line 160
    .line 161
    const/high16 v2, -0x40800000    # -1.0f

    .line 162
    .line 163
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 164
    .line 165
    .line 166
    const/high16 v0, 0x40800000    # 4.0f

    .line 167
    .line 168
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 169
    .line 170
    .line 171
    const/high16 v17, -0x40000000    # -2.0f

    .line 172
    .line 173
    const/high16 v18, 0x40000000    # 2.0f

    .line 174
    .line 175
    const v13, -0x40733333    # -1.1f

    .line 176
    .line 177
    .line 178
    const/high16 v15, -0x40000000    # -2.0f

    .line 179
    .line 180
    const v16, 0x3f666666    # 0.9f

    .line 181
    .line 182
    .line 183
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 184
    .line 185
    .line 186
    const/high16 v0, 0x41600000    # 14.0f

    .line 187
    .line 188
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 189
    .line 190
    .line 191
    const/high16 v17, 0x40000000    # 2.0f

    .line 192
    .line 193
    const/4 v13, 0x0

    .line 194
    const v14, 0x3f8ccccd    # 1.1f

    .line 195
    .line 196
    .line 197
    const v15, 0x3f666666    # 0.9f

    .line 198
    .line 199
    .line 200
    const/high16 v16, 0x40000000    # 2.0f

    .line 201
    .line 202
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 203
    .line 204
    .line 205
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 206
    .line 207
    .line 208
    const/high16 v18, -0x40000000    # -2.0f

    .line 209
    .line 210
    const v13, 0x3f8ccccd    # 1.1f

    .line 211
    .line 212
    .line 213
    const/4 v14, 0x0

    .line 214
    const/high16 v15, 0x40000000    # 2.0f

    .line 215
    .line 216
    const v16, -0x4099999a    # -0.9f

    .line 217
    .line 218
    .line 219
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 220
    .line 221
    .line 222
    const/high16 v0, -0x3f600000    # -5.0f

    .line 223
    .line 224
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 225
    .line 226
    .line 227
    const/high16 v17, -0x40800000    # -1.0f

    .line 228
    .line 229
    const/high16 v18, -0x40800000    # -1.0f

    .line 230
    .line 231
    const/4 v13, 0x0

    .line 232
    const v14, -0x40f33333    # -0.55f

    .line 233
    .line 234
    .line 235
    const v15, -0x4119999a    # -0.45f

    .line 236
    .line 237
    .line 238
    const/high16 v16, -0x40800000    # -1.0f

    .line 239
    .line 240
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 241
    .line 242
    .line 243
    const v0, 0x3ee66666    # 0.45f

    .line 244
    .line 245
    .line 246
    const/high16 v2, 0x3f800000    # 1.0f

    .line 247
    .line 248
    const/high16 v4, -0x40800000    # -1.0f

    .line 249
    .line 250
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 251
    .line 252
    .line 253
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 254
    .line 255
    .line 256
    const/high16 v0, 0x41780000    # 15.5f

    .line 257
    .line 258
    const/high16 v2, 0x41900000    # 18.0f

    .line 259
    .line 260
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 261
    .line 262
    .line 263
    const v0, 0x40d0a3d7    # 6.52f

    .line 264
    .line 265
    .line 266
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 267
    .line 268
    .line 269
    const v17, -0x413851ec    # -0.39f

    .line 270
    .line 271
    .line 272
    const v18, -0x40b0a3d7    # -0.81f

    .line 273
    .line 274
    .line 275
    const v13, -0x4128f5c3    # -0.42f

    .line 276
    .line 277
    .line 278
    const/4 v14, 0x0

    .line 279
    const v15, -0x40d9999a    # -0.65f

    .line 280
    .line 281
    .line 282
    const v16, -0x410a3d71    # -0.48f

    .line 283
    .line 284
    .line 285
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 286
    .line 287
    .line 288
    const v0, 0x3fdeb852    # 1.74f

    .line 289
    .line 290
    .line 291
    const v2, -0x3ff147ae    # -2.23f

    .line 292
    .line 293
    .line 294
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 295
    .line 296
    .line 297
    const v17, 0x3f47ae14    # 0.78f

    .line 298
    .line 299
    .line 300
    const v18, -0x43dc28f6    # -0.01f

    .line 301
    .line 302
    .line 303
    const v13, 0x3e4ccccd    # 0.2f

    .line 304
    .line 305
    .line 306
    const/high16 v14, -0x41800000    # -0.25f

    .line 307
    .line 308
    const v15, 0x3f147ae1    # 0.58f

    .line 309
    .line 310
    .line 311
    const v16, -0x417ae148    # -0.26f

    .line 312
    .line 313
    .line 314
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 315
    .line 316
    .line 317
    const v0, 0x3fc7ae14    # 1.56f

    .line 318
    .line 319
    .line 320
    const v2, 0x3ff0a3d7    # 1.88f

    .line 321
    .line 322
    .line 323
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 324
    .line 325
    .line 326
    const v0, 0x40166666    # 2.35f

    .line 327
    .line 328
    .line 329
    const v2, -0x3fbeb852    # -3.02f

    .line 330
    .line 331
    .line 332
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 333
    .line 334
    .line 335
    const v17, 0x3f4a3d71    # 0.79f

    .line 336
    .line 337
    .line 338
    const v18, 0x3c23d70a    # 0.01f

    .line 339
    .line 340
    .line 341
    const v14, -0x417ae148    # -0.26f

    .line 342
    .line 343
    .line 344
    const v15, 0x3f19999a    # 0.6f

    .line 345
    .line 346
    .line 347
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 348
    .line 349
    .line 350
    const v0, 0x40233333    # 2.55f

    .line 351
    .line 352
    .line 353
    const v2, 0x4058f5c3    # 3.39f

    .line 354
    .line 355
    .line 356
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 357
    .line 358
    .line 359
    const v17, -0x41333333    # -0.4f

    .line 360
    .line 361
    .line 362
    const v18, 0x3f4a3d71    # 0.79f

    .line 363
    .line 364
    .line 365
    const/high16 v13, 0x3e800000    # 0.25f

    .line 366
    .line 367
    const v14, 0x3ea3d70a    # 0.32f

    .line 368
    .line 369
    .line 370
    const v15, 0x3c23d70a    # 0.01f

    .line 371
    .line 372
    .line 373
    const v16, 0x3f4a3d71    # 0.79f

    .line 374
    .line 375
    .line 376
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 377
    .line 378
    .line 379
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 380
    .line 381
    .line 382
    const v0, 0x419a6666    # 19.3f

    .line 383
    .line 384
    .line 385
    const v2, 0x410e3d71    # 8.89f

    .line 386
    .line 387
    .line 388
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 389
    .line 390
    .line 391
    const v17, 0x3f30a3d7    # 0.69f

    .line 392
    .line 393
    .line 394
    const v18, -0x3fd5c28f    # -2.66f

    .line 395
    .line 396
    .line 397
    const v13, 0x3ef5c28f    # 0.48f

    .line 398
    .line 399
    .line 400
    const v14, -0x40bae148    # -0.77f

    .line 401
    .line 402
    .line 403
    const/high16 v15, 0x3f400000    # 0.75f

    .line 404
    .line 405
    const v16, -0x402a3d71    # -1.67f

    .line 406
    .line 407
    .line 408
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 409
    .line 410
    .line 411
    const v17, -0x3f81eb85    # -3.97f

    .line 412
    .line 413
    .line 414
    const v18, -0x3f79999a    # -4.2f

    .line 415
    .line 416
    .line 417
    const v13, -0x41fae148    # -0.13f

    .line 418
    .line 419
    .line 420
    const v14, -0x3ff66666    # -2.15f

    .line 421
    .line 422
    .line 423
    const v15, -0x40147ae1    # -1.84f

    .line 424
    .line 425
    .line 426
    const v16, -0x3f81eb85    # -3.97f

    .line 427
    .line 428
    .line 429
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 430
    .line 431
    .line 432
    const/high16 v17, 0x41300000    # 11.0f

    .line 433
    .line 434
    const/high16 v18, 0x40d00000    # 6.5f

    .line 435
    .line 436
    const v13, 0x4154cccd    # 13.3f

    .line 437
    .line 438
    .line 439
    const v14, 0x3fdd70a4    # 1.73f

    .line 440
    .line 441
    .line 442
    const/high16 v15, 0x41300000    # 11.0f

    .line 443
    .line 444
    const v16, 0x4075c28f    # 3.84f

    .line 445
    .line 446
    .line 447
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 448
    .line 449
    .line 450
    const v17, 0x408fae14    # 4.49f

    .line 451
    .line 452
    .line 453
    const/high16 v18, 0x40900000    # 4.5f

    .line 454
    .line 455
    const/4 v13, 0x0

    .line 456
    const v14, 0x401f5c29    # 2.49f

    .line 457
    .line 458
    .line 459
    const v15, 0x4000a3d7    # 2.01f

    .line 460
    .line 461
    .line 462
    const/high16 v16, 0x40900000    # 4.5f

    .line 463
    .line 464
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 465
    .line 466
    .line 467
    const v17, 0x4018f5c3    # 2.39f

    .line 468
    .line 469
    .line 470
    const v18, -0x40cccccd    # -0.7f

    .line 471
    .line 472
    .line 473
    const v13, 0x3f6147ae    # 0.88f

    .line 474
    .line 475
    .line 476
    const/4 v14, 0x0

    .line 477
    const v15, 0x3fd9999a    # 1.7f

    .line 478
    .line 479
    .line 480
    const v16, -0x417ae148    # -0.26f

    .line 481
    .line 482
    .line 483
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 484
    .line 485
    .line 486
    const v0, 0x401a3d71    # 2.41f

    .line 487
    .line 488
    .line 489
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 490
    .line 491
    .line 492
    const v17, 0x3fb5c28f    # 1.42f

    .line 493
    .line 494
    .line 495
    const/16 v18, 0x0

    .line 496
    .line 497
    const v13, 0x3ec7ae14    # 0.39f

    .line 498
    .line 499
    .line 500
    const v14, 0x3ec7ae14    # 0.39f

    .line 501
    .line 502
    .line 503
    const v15, 0x3f83d70a    # 1.03f

    .line 504
    .line 505
    .line 506
    const v16, 0x3ec7ae14    # 0.39f

    .line 507
    .line 508
    .line 509
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 510
    .line 511
    .line 512
    const/16 v17, 0x0

    .line 513
    .line 514
    const v18, -0x404a3d71    # -1.42f

    .line 515
    .line 516
    .line 517
    const v14, -0x413851ec    # -0.39f

    .line 518
    .line 519
    .line 520
    const v15, 0x3ec7ae14    # 0.39f

    .line 521
    .line 522
    .line 523
    const v16, -0x407c28f6    # -1.03f

    .line 524
    .line 525
    .line 526
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 527
    .line 528
    .line 529
    const v0, -0x3fe5c28f    # -2.41f

    .line 530
    .line 531
    .line 532
    const v2, -0x3fe66666    # -2.4f

    .line 533
    .line 534
    .line 535
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 536
    .line 537
    .line 538
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 539
    .line 540
    .line 541
    const/high16 v0, 0x41100000    # 9.0f

    .line 542
    .line 543
    const/high16 v2, 0x41780000    # 15.5f

    .line 544
    .line 545
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 546
    .line 547
    .line 548
    const/high16 v17, 0x41500000    # 13.0f

    .line 549
    .line 550
    const/high16 v18, 0x40d00000    # 6.5f

    .line 551
    .line 552
    const v13, 0x4161eb85    # 14.12f

    .line 553
    .line 554
    .line 555
    const/high16 v14, 0x41100000    # 9.0f

    .line 556
    .line 557
    const/high16 v15, 0x41500000    # 13.0f

    .line 558
    .line 559
    const v16, 0x40fc28f6    # 7.88f

    .line 560
    .line 561
    .line 562
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 563
    .line 564
    .line 565
    const v0, 0x4161eb85    # 14.12f

    .line 566
    .line 567
    .line 568
    const/high16 v4, 0x40800000    # 4.0f

    .line 569
    .line 570
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 571
    .line 572
    .line 573
    const v0, 0x40a3d70a    # 5.12f

    .line 574
    .line 575
    .line 576
    const/high16 v2, 0x40d00000    # 6.5f

    .line 577
    .line 578
    const/high16 v4, 0x41900000    # 18.0f

    .line 579
    .line 580
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 581
    .line 582
    .line 583
    const v0, 0x41870a3d    # 16.88f

    .line 584
    .line 585
    .line 586
    const/high16 v2, 0x41100000    # 9.0f

    .line 587
    .line 588
    const/high16 v4, 0x41780000    # 15.5f

    .line 589
    .line 590
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 591
    .line 592
    .line 593
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 594
    .line 595
    .line 596
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 597
    .line 598
    .line 599
    move-result-object v2

    .line 600
    const/16 v16, 0x3800

    .line 601
    .line 602
    const/16 v17, 0x0

    .line 603
    .line 604
    const/high16 v6, 0x3f800000    # 1.0f

    .line 605
    .line 606
    const/high16 v8, 0x3f800000    # 1.0f

    .line 607
    .line 608
    const/4 v7, 0x0

    .line 609
    const/high16 v9, 0x3f800000    # 1.0f

    .line 610
    .line 611
    const/high16 v12, 0x3f800000    # 1.0f

    .line 612
    .line 613
    const/4 v13, 0x0

    .line 614
    const/4 v14, 0x0

    .line 615
    const/4 v15, 0x0

    .line 616
    const-string v4, ""

    .line 617
    .line 618
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 619
    .line 620
    .line 621
    move-result-object v0

    .line 622
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 623
    .line 624
    .line 625
    move-result-object v0

    .line 626
    sput-object v0, Landroidx/compose/material/icons/rounded/ImageSearchKt;->_imageSearch:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 627
    .line 628
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 629
    .line 630
    .line 631
    return-object v0
.end method
