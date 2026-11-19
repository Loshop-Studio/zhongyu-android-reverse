.class public final Landroidx/compose/material/icons/rounded/SportsHandballKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_sportsHandball",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "SportsHandball",
        "Landroidx/compose/material/icons/Icons$Rounded;",
        "getSportsHandball",
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
        "SMAP\nSportsHandball.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SportsHandball.kt\nandroidx/compose/material/icons/rounded/SportsHandballKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,73:1\n212#2,12:74\n233#2,18:87\n253#2:124\n233#2,18:125\n253#2:162\n233#2,18:163\n253#2:200\n174#3:86\n705#4,2:105\n717#4,2:107\n719#4,11:113\n705#4,2:143\n717#4,2:145\n719#4,11:151\n705#4,2:181\n717#4,2:183\n719#4,11:189\n72#5,4:109\n72#5,4:147\n72#5,4:185\n*S KotlinDebug\n*F\n+ 1 SportsHandball.kt\nandroidx/compose/material/icons/rounded/SportsHandballKt\n*L\n29#1:74,12\n30#1:87,18\n30#1:124\n38#1:125,18\n38#1:162\n60#1:163,18\n60#1:200\n29#1:86\n30#1:105,2\n30#1:107,2\n30#1:113,11\n38#1:143,2\n38#1:145,2\n38#1:151,11\n60#1:181,2\n60#1:183,2\n60#1:189,11\n30#1:109,4\n38#1:147,4\n60#1:185,4\n*E\n"
    }
.end annotation


# static fields
.field private static _sportsHandball:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getSportsHandball(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/SportsHandballKt;->_sportsHandball:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.SportsHandball"

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
    const/4 v2, 0x0

    .line 50
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 51
    .line 52
    .line 53
    sget-object v18, Landroidx/compose/ui/graphics/StrokeCap;->Companion:Landroidx/compose/ui/graphics/StrokeCap$Companion;

    .line 54
    .line 55
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 56
    .line 57
    .line 58
    move-result v10

    .line 59
    sget-object v19, Landroidx/compose/ui/graphics/StrokeJoin;->Companion:Landroidx/compose/ui/graphics/StrokeJoin$Companion;

    .line 60
    .line 61
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 62
    .line 63
    .line 64
    move-result v11

    .line 65
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 66
    .line 67
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 68
    .line 69
    .line 70
    const v4, 0x416451ec    # 14.27f

    .line 71
    .line 72
    .line 73
    const/high16 v6, 0x40c00000    # 6.0f

    .line 74
    .line 75
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    const/high16 v25, 0x41700000    # 15.0f

    .line 79
    .line 80
    const v26, 0x410bae14    # 8.73f

    .line 81
    .line 82
    .line 83
    const v21, 0x415b851f    # 13.72f

    .line 84
    .line 85
    .line 86
    const v22, 0x40de6666    # 6.95f

    .line 87
    .line 88
    .line 89
    const v23, 0x4160cccd    # 14.05f

    .line 90
    .line 91
    .line 92
    const v24, 0x4102e148    # 8.18f

    .line 93
    .line 94
    .line 95
    move-object/from16 v20, v2

    .line 96
    .line 97
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 98
    .line 99
    .line 100
    const v25, 0x402eb852    # 2.73f

    .line 101
    .line 102
    .line 103
    const v26, -0x40c51eb8    # -0.73f

    .line 104
    .line 105
    .line 106
    const v21, 0x3f733333    # 0.95f

    .line 107
    .line 108
    .line 109
    const v22, 0x3f0ccccd    # 0.55f

    .line 110
    .line 111
    .line 112
    const v23, 0x400b851f    # 2.18f

    .line 113
    .line 114
    .line 115
    const v24, 0x3e6147ae    # 0.22f

    .line 116
    .line 117
    .line 118
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 119
    .line 120
    .line 121
    const v25, -0x40c51eb8    # -0.73f

    .line 122
    .line 123
    .line 124
    const v26, -0x3fd147ae    # -2.73f

    .line 125
    .line 126
    .line 127
    const v21, 0x3f0ccccd    # 0.55f

    .line 128
    .line 129
    .line 130
    const v22, -0x408ccccd    # -0.95f

    .line 131
    .line 132
    .line 133
    const v23, 0x3e6147ae    # 0.22f

    .line 134
    .line 135
    .line 136
    const v24, -0x3ff47ae1    # -2.18f

    .line 137
    .line 138
    .line 139
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 140
    .line 141
    .line 142
    const v25, 0x416451ec    # 14.27f

    .line 143
    .line 144
    .line 145
    const/high16 v26, 0x40c00000    # 6.0f

    .line 146
    .line 147
    const v21, 0x41806666    # 16.05f

    .line 148
    .line 149
    .line 150
    const v22, 0x40970a3d    # 4.72f

    .line 151
    .line 152
    .line 153
    const v23, 0x416d1eb8    # 14.82f

    .line 154
    .line 155
    .line 156
    const v24, 0x40a1999a    # 5.05f

    .line 157
    .line 158
    .line 159
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 160
    .line 161
    .line 162
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 163
    .line 164
    .line 165
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 166
    .line 167
    .line 168
    move-result-object v2

    .line 169
    const/16 v16, 0x3800

    .line 170
    .line 171
    const/16 v17, 0x0

    .line 172
    .line 173
    const/high16 v6, 0x3f800000    # 1.0f

    .line 174
    .line 175
    const/high16 v8, 0x3f800000    # 1.0f

    .line 176
    .line 177
    const/4 v7, 0x0

    .line 178
    const/high16 v9, 0x3f800000    # 1.0f

    .line 179
    .line 180
    const/high16 v12, 0x3f800000    # 1.0f

    .line 181
    .line 182
    const/4 v13, 0x0

    .line 183
    const/4 v14, 0x0

    .line 184
    const/4 v15, 0x0

    .line 185
    const-string v4, ""

    .line 186
    .line 187
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 188
    .line 189
    .line 190
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 191
    .line 192
    .line 193
    move-result v3

    .line 194
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 195
    .line 196
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 197
    .line 198
    .line 199
    move-result-wide v6

    .line 200
    const/4 v2, 0x0

    .line 201
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 202
    .line 203
    .line 204
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 205
    .line 206
    .line 207
    move-result v10

    .line 208
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 209
    .line 210
    .line 211
    move-result v11

    .line 212
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 213
    .line 214
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 215
    .line 216
    .line 217
    const v4, 0x417d70a4    # 15.84f

    .line 218
    .line 219
    .line 220
    const v6, 0x41268f5c    # 10.41f

    .line 221
    .line 222
    .line 223
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 224
    .line 225
    .line 226
    const v25, -0x3fd9999a    # -2.6f

    .line 227
    .line 228
    .line 229
    const/high16 v26, -0x40400000    # -1.5f

    .line 230
    .line 231
    const/16 v21, 0x0

    .line 232
    .line 233
    const/16 v22, 0x0

    .line 234
    .line 235
    const v23, -0x402f5c29    # -1.63f

    .line 236
    .line 237
    .line 238
    const v24, -0x408f5c29    # -0.94f

    .line 239
    .line 240
    .line 241
    move-object/from16 v20, v2

    .line 242
    .line 243
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 244
    .line 245
    .line 246
    const v25, -0x3ff47ae1    # -2.18f

    .line 247
    .line 248
    .line 249
    const v26, -0x3f3dc28f    # -6.07f

    .line 250
    .line 251
    .line 252
    const v21, -0x3ff7ae14    # -2.13f

    .line 253
    .line 254
    .line 255
    const v22, -0x406147ae    # -1.24f

    .line 256
    .line 257
    .line 258
    const v23, -0x3fbf5c29    # -3.01f

    .line 259
    .line 260
    .line 261
    const v24, -0x3f8ae148    # -3.83f

    .line 262
    .line 263
    .line 264
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 265
    .line 266
    .line 267
    const v25, -0x4123d70a    # -0.43f

    .line 268
    .line 269
    .line 270
    const v26, -0x40651eb8    # -1.21f

    .line 271
    .line 272
    .line 273
    const v21, 0x3e2e147b    # 0.17f

    .line 274
    .line 275
    .line 276
    const v22, -0x41147ae1    # -0.46f

    .line 277
    .line 278
    .line 279
    const v23, -0x43dc28f6    # -0.01f

    .line 280
    .line 281
    .line 282
    const v24, -0x4087ae14    # -0.97f

    .line 283
    .line 284
    .line 285
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 286
    .line 287
    .line 288
    const v25, 0x41133333    # 9.2f

    .line 289
    .line 290
    .line 291
    const v26, 0x400851ec    # 2.13f

    .line 292
    .line 293
    .line 294
    const v21, 0x4121999a    # 10.1f

    .line 295
    .line 296
    .line 297
    const v22, 0x3faa3d71    # 1.33f

    .line 298
    .line 299
    .line 300
    const v23, 0x41168f5c    # 9.41f

    .line 301
    .line 302
    .line 303
    const v24, 0x3fc7ae14    # 1.56f

    .line 304
    .line 305
    .line 306
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 307
    .line 308
    .line 309
    const v25, 0x412a8f5c    # 10.66f

    .line 310
    .line 311
    .line 312
    const v26, 0x41166666    # 9.4f

    .line 313
    .line 314
    .line 315
    const/high16 v21, 0x41040000    # 8.25f

    .line 316
    .line 317
    const v22, 0x40947ae1    # 4.64f

    .line 318
    .line 319
    .line 320
    const v23, 0x410d999a    # 8.85f

    .line 321
    .line 322
    .line 323
    const v24, 0x40ef5c29    # 7.48f

    .line 324
    .line 325
    .line 326
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 327
    .line 328
    .line 329
    const v4, -0x3f6b3333    # -4.65f

    .line 330
    .line 331
    .line 332
    const v6, 0x4100cccd    # 8.05f

    .line 333
    .line 334
    .line 335
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 336
    .line 337
    .line 338
    const v25, 0x3ebd70a4    # 0.37f

    .line 339
    .line 340
    .line 341
    const v26, 0x3faf5c29    # 1.37f

    .line 342
    .line 343
    .line 344
    const v21, -0x4170a3d7    # -0.28f

    .line 345
    .line 346
    .line 347
    const v22, 0x3ef5c28f    # 0.48f

    .line 348
    .line 349
    .line 350
    const v23, -0x421eb852    # -0.11f

    .line 351
    .line 352
    .line 353
    const v24, 0x3f8b851f    # 1.09f

    .line 354
    .line 355
    .line 356
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 357
    .line 358
    .line 359
    const v25, 0x3faf5c29    # 1.37f

    .line 360
    .line 361
    .line 362
    const v26, -0x41428f5c    # -0.37f

    .line 363
    .line 364
    .line 365
    const v21, 0x3ef5c28f    # 0.48f

    .line 366
    .line 367
    .line 368
    const v22, 0x3e8f5c29    # 0.28f

    .line 369
    .line 370
    .line 371
    const v23, 0x3f8b851f    # 1.09f

    .line 372
    .line 373
    .line 374
    const v24, 0x3de147ae    # 0.11f

    .line 375
    .line 376
    .line 377
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 378
    .line 379
    .line 380
    const v4, -0x40228f5c    # -1.73f

    .line 381
    .line 382
    .line 383
    const/high16 v6, 0x3f800000    # 1.0f

    .line 384
    .line 385
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 386
    .line 387
    .line 388
    const v4, 0x3fdd70a4    # 1.73f

    .line 389
    .line 390
    .line 391
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 392
    .line 393
    .line 394
    const/high16 v4, -0x3fe00000    # -2.5f

    .line 395
    .line 396
    const v6, 0x408a8f5c    # 4.33f

    .line 397
    .line 398
    .line 399
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 400
    .line 401
    .line 402
    const v25, 0x3ebd70a4    # 0.37f

    .line 403
    .line 404
    .line 405
    const v26, 0x3faf5c29    # 1.37f

    .line 406
    .line 407
    .line 408
    const v21, -0x4170a3d7    # -0.28f

    .line 409
    .line 410
    .line 411
    const v22, 0x3ef5c28f    # 0.48f

    .line 412
    .line 413
    .line 414
    const v23, -0x421eb852    # -0.11f

    .line 415
    .line 416
    .line 417
    const v24, 0x3f8b851f    # 1.09f

    .line 418
    .line 419
    .line 420
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 421
    .line 422
    .line 423
    const v25, 0x3faf5c29    # 1.37f

    .line 424
    .line 425
    .line 426
    const v26, -0x41428f5c    # -0.37f

    .line 427
    .line 428
    .line 429
    const v21, 0x3ef5c28f    # 0.48f

    .line 430
    .line 431
    .line 432
    const v22, 0x3e8f5c29    # 0.28f

    .line 433
    .line 434
    .line 435
    const v23, 0x3f8b851f    # 1.09f

    .line 436
    .line 437
    .line 438
    const v24, 0x3de147ae    # 0.11f

    .line 439
    .line 440
    .line 441
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 442
    .line 443
    .line 444
    const v4, 0x40b947ae    # 5.79f

    .line 445
    .line 446
    .line 447
    const v6, -0x3edfae14    # -10.02f

    .line 448
    .line 449
    .line 450
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 451
    .line 452
    .line 453
    const v25, 0x3f28f5c3    # 0.66f

    .line 454
    .line 455
    .line 456
    const v26, 0x40970a3d    # 4.72f

    .line 457
    .line 458
    .line 459
    const v21, 0x3f7ae148    # 0.98f

    .line 460
    .line 461
    .line 462
    const v22, 0x3fab851f    # 1.34f

    .line 463
    .line 464
    .line 465
    const v23, 0x3fa147ae    # 1.26f

    .line 466
    .line 467
    .line 468
    const v24, 0x4047ae14    # 3.12f

    .line 469
    .line 470
    .line 471
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 472
    .line 473
    .line 474
    const v25, 0x3edc28f6    # 0.43f

    .line 475
    .line 476
    .line 477
    const v26, 0x3f99999a    # 1.2f

    .line 478
    .line 479
    .line 480
    const v21, -0x41d1eb85    # -0.17f

    .line 481
    .line 482
    .line 483
    const v22, 0x3ee66666    # 0.45f

    .line 484
    .line 485
    .line 486
    const v23, 0x3ca3d70a    # 0.02f

    .line 487
    .line 488
    .line 489
    const v24, 0x3f75c28f    # 0.96f

    .line 490
    .line 491
    .line 492
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 493
    .line 494
    .line 495
    const v25, 0x3fb851ec    # 1.44f

    .line 496
    .line 497
    .line 498
    const/high16 v26, -0x41000000    # -0.5f

    .line 499
    .line 500
    const v21, 0x3f07ae14    # 0.53f

    .line 501
    .line 502
    .line 503
    const v22, 0x3e9eb852    # 0.31f

    .line 504
    .line 505
    .line 506
    const v23, 0x3f9c28f6    # 1.22f

    .line 507
    .line 508
    .line 509
    const v24, 0x3da3d70a    # 0.08f

    .line 510
    .line 511
    .line 512
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 513
    .line 514
    .line 515
    const v25, 0x417d70a4    # 15.84f

    .line 516
    .line 517
    .line 518
    const v26, 0x41268f5c    # 10.41f

    .line 519
    .line 520
    .line 521
    const v21, 0x4198147b    # 19.01f

    .line 522
    .line 523
    .line 524
    const v22, 0x417d47ae    # 15.83f

    .line 525
    .line 526
    .line 527
    const v23, 0x4193999a    # 18.45f

    .line 528
    .line 529
    .line 530
    const v24, 0x4149c28f    # 12.61f

    .line 531
    .line 532
    .line 533
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 534
    .line 535
    .line 536
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 537
    .line 538
    .line 539
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 540
    .line 541
    .line 542
    move-result-object v2

    .line 543
    const/high16 v6, 0x3f800000    # 1.0f

    .line 544
    .line 545
    const/4 v7, 0x0

    .line 546
    const-string v4, ""

    .line 547
    .line 548
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 549
    .line 550
    .line 551
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 552
    .line 553
    .line 554
    move-result v3

    .line 555
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 556
    .line 557
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 558
    .line 559
    .line 560
    move-result-wide v6

    .line 561
    const/4 v0, 0x0

    .line 562
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 563
    .line 564
    .line 565
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 566
    .line 567
    .line 568
    move-result v10

    .line 569
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 570
    .line 571
    .line 572
    move-result v11

    .line 573
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 574
    .line 575
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 576
    .line 577
    .line 578
    const/high16 v0, 0x414c0000    # 12.75f

    .line 579
    .line 580
    const v2, 0x40733333    # 3.8f

    .line 581
    .line 582
    .line 583
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 584
    .line 585
    .line 586
    const v17, 0x40033333    # 2.05f

    .line 587
    .line 588
    .line 589
    const v18, -0x40f33333    # -0.55f

    .line 590
    .line 591
    .line 592
    const v13, 0x3f3851ec    # 0.72f

    .line 593
    .line 594
    .line 595
    const v14, 0x3ed1eb85    # 0.41f

    .line 596
    .line 597
    .line 598
    const v15, 0x3fd0a3d7    # 1.63f

    .line 599
    .line 600
    .line 601
    const v16, 0x3e2e147b    # 0.17f

    .line 602
    .line 603
    .line 604
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 605
    .line 606
    .line 607
    const v17, -0x40f33333    # -0.55f

    .line 608
    .line 609
    .line 610
    const v18, -0x3ffccccd    # -2.05f

    .line 611
    .line 612
    .line 613
    const v13, 0x3ed1eb85    # 0.41f

    .line 614
    .line 615
    .line 616
    const v14, -0x40c7ae14    # -0.72f

    .line 617
    .line 618
    .line 619
    const v15, 0x3e2e147b    # 0.17f

    .line 620
    .line 621
    .line 622
    const v16, -0x402f5c29    # -1.63f

    .line 623
    .line 624
    .line 625
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 626
    .line 627
    .line 628
    const v17, -0x3ffccccd    # -2.05f

    .line 629
    .line 630
    .line 631
    const v18, 0x3f0ccccd    # 0.55f

    .line 632
    .line 633
    .line 634
    const v13, -0x40c7ae14    # -0.72f

    .line 635
    .line 636
    .line 637
    const v14, -0x412e147b    # -0.41f

    .line 638
    .line 639
    .line 640
    const v15, -0x402f5c29    # -1.63f

    .line 641
    .line 642
    .line 643
    const v16, -0x41d1eb85    # -0.17f

    .line 644
    .line 645
    .line 646
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 647
    .line 648
    .line 649
    const/high16 v17, 0x414c0000    # 12.75f

    .line 650
    .line 651
    const v18, 0x40733333    # 3.8f

    .line 652
    .line 653
    .line 654
    const v13, 0x413ca3d7    # 11.79f

    .line 655
    .line 656
    .line 657
    const v14, 0x401e147b    # 2.47f

    .line 658
    .line 659
    .line 660
    const v15, 0x41407ae1    # 12.03f

    .line 661
    .line 662
    .line 663
    const v16, 0x4058f5c3    # 3.39f

    .line 664
    .line 665
    .line 666
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 667
    .line 668
    .line 669
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 670
    .line 671
    .line 672
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 673
    .line 674
    .line 675
    move-result-object v2

    .line 676
    const/16 v16, 0x3800

    .line 677
    .line 678
    const/16 v17, 0x0

    .line 679
    .line 680
    const/high16 v6, 0x3f800000    # 1.0f

    .line 681
    .line 682
    const/4 v7, 0x0

    .line 683
    const/high16 v12, 0x3f800000    # 1.0f

    .line 684
    .line 685
    const/4 v13, 0x0

    .line 686
    const/4 v14, 0x0

    .line 687
    const/4 v15, 0x0

    .line 688
    const-string v4, ""

    .line 689
    .line 690
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 691
    .line 692
    .line 693
    move-result-object v0

    .line 694
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 695
    .line 696
    .line 697
    move-result-object v0

    .line 698
    sput-object v0, Landroidx/compose/material/icons/rounded/SportsHandballKt;->_sportsHandball:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 699
    .line 700
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 701
    .line 702
    .line 703
    return-object v0
.end method
