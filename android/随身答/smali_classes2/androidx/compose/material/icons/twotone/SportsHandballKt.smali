.class public final Landroidx/compose/material/icons/twotone/SportsHandballKt;
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
        "Landroidx/compose/material/icons/Icons$TwoTone;",
        "getSportsHandball",
        "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;",
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
        "SMAP\nSportsHandball.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SportsHandball.kt\nandroidx/compose/material/icons/twotone/SportsHandballKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,69:1\n212#2,12:70\n233#2,18:83\n253#2:120\n233#2,18:121\n253#2:158\n233#2,18:159\n253#2:196\n174#3:82\n705#4,2:101\n717#4,2:103\n719#4,11:109\n705#4,2:139\n717#4,2:141\n719#4,11:147\n705#4,2:177\n717#4,2:179\n719#4,11:185\n72#5,4:105\n72#5,4:143\n72#5,4:181\n*S KotlinDebug\n*F\n+ 1 SportsHandball.kt\nandroidx/compose/material/icons/twotone/SportsHandballKt\n*L\n29#1:70,12\n30#1:83,18\n30#1:120\n38#1:121,18\n38#1:158\n56#1:159,18\n56#1:196\n29#1:82\n30#1:101,2\n30#1:103,2\n30#1:109,11\n38#1:139,2\n38#1:141,2\n38#1:147,11\n56#1:177,2\n56#1:179,2\n56#1:185,11\n30#1:105,4\n38#1:143,4\n56#1:181,4\n*E\n"
    }
.end annotation


# static fields
.field private static _sportsHandball:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getSportsHandball(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/SportsHandballKt;->_sportsHandball:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.SportsHandball"

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
    const v25, -0x40170a3d    # -1.82f

    .line 247
    .line 248
    .line 249
    const v26, -0x3f25c28f    # -6.82f

    .line 250
    .line 251
    .line 252
    const v21, -0x3fe7ae14    # -2.38f

    .line 253
    .line 254
    .line 255
    const v22, -0x404f5c29    # -1.38f

    .line 256
    .line 257
    .line 258
    const v23, -0x3fb33333    # -3.2f

    .line 259
    .line 260
    .line 261
    const v24, -0x3f71eb85    # -4.44f

    .line 262
    .line 263
    .line 264
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 265
    .line 266
    .line 267
    const v4, -0x40228f5c    # -1.73f

    .line 268
    .line 269
    .line 270
    const/high16 v6, -0x40800000    # -1.0f

    .line 271
    .line 272
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 273
    .line 274
    .line 275
    const v25, 0x412a8f5c    # 10.66f

    .line 276
    .line 277
    .line 278
    const v26, 0x41166666    # 9.4f

    .line 279
    .line 280
    .line 281
    const v21, 0x4101999a    # 8.1f

    .line 282
    .line 283
    .line 284
    const v22, 0x40751eb8    # 3.83f

    .line 285
    .line 286
    .line 287
    const v23, 0x4109999a    # 8.6f

    .line 288
    .line 289
    .line 290
    const v24, 0x40e6b852    # 7.21f

    .line 291
    .line 292
    .line 293
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 294
    .line 295
    .line 296
    const v4, -0x3f5b3333    # -5.15f

    .line 297
    .line 298
    .line 299
    const v6, 0x410eb852    # 8.92f

    .line 300
    .line 301
    .line 302
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 303
    .line 304
    .line 305
    const/high16 v4, 0x3f800000    # 1.0f

    .line 306
    .line 307
    const v6, 0x3fdd70a4    # 1.73f

    .line 308
    .line 309
    .line 310
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 311
    .line 312
    .line 313
    const/high16 v4, 0x3fc00000    # 1.5f

    .line 314
    .line 315
    const v6, -0x3fd9999a    # -2.6f

    .line 316
    .line 317
    .line 318
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 319
    .line 320
    .line 321
    const/high16 v4, 0x3f800000    # 1.0f

    .line 322
    .line 323
    const v6, 0x3fdd70a4    # 1.73f

    .line 324
    .line 325
    .line 326
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 327
    .line 328
    .line 329
    const/high16 v4, -0x3fc00000    # -3.0f

    .line 330
    .line 331
    const v6, 0x40a66666    # 5.2f

    .line 332
    .line 333
    .line 334
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 335
    .line 336
    .line 337
    const/high16 v4, 0x3f800000    # 1.0f

    .line 338
    .line 339
    const v6, 0x3fdd70a4    # 1.73f

    .line 340
    .line 341
    .line 342
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 343
    .line 344
    .line 345
    const v4, 0x40c947ae    # 6.29f

    .line 346
    .line 347
    .line 348
    const v6, -0x3ed1c28f    # -10.89f

    .line 349
    .line 350
    .line 351
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 352
    .line 353
    .line 354
    const v25, 0x3e9eb852    # 0.31f

    .line 355
    .line 356
    .line 357
    const v26, 0x40aeb852    # 5.46f

    .line 358
    .line 359
    .line 360
    const v21, 0x3f91eb85    # 1.14f

    .line 361
    .line 362
    .line 363
    const v22, 0x3fc66666    # 1.55f

    .line 364
    .line 365
    .line 366
    const v23, 0x3faa3d71    # 1.33f

    .line 367
    .line 368
    .line 369
    const v24, 0x406c28f6    # 3.69f

    .line 370
    .line 371
    .line 372
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 373
    .line 374
    .line 375
    const/high16 v4, 0x3f800000    # 1.0f

    .line 376
    .line 377
    const v6, 0x3fdd70a4    # 1.73f

    .line 378
    .line 379
    .line 380
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 381
    .line 382
    .line 383
    const v25, 0x417d70a4    # 15.84f

    .line 384
    .line 385
    .line 386
    const v26, 0x41268f5c    # 10.41f

    .line 387
    .line 388
    .line 389
    const v21, 0x41990a3d    # 19.13f

    .line 390
    .line 391
    .line 392
    const v22, 0x4185eb85    # 16.74f

    .line 393
    .line 394
    .line 395
    const v23, 0x41967ae1    # 18.81f

    .line 396
    .line 397
    .line 398
    const v24, 0x414e8f5c    # 12.91f

    .line 399
    .line 400
    .line 401
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 402
    .line 403
    .line 404
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 405
    .line 406
    .line 407
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 408
    .line 409
    .line 410
    move-result-object v2

    .line 411
    const/high16 v6, 0x3f800000    # 1.0f

    .line 412
    .line 413
    const/4 v7, 0x0

    .line 414
    const-string v4, ""

    .line 415
    .line 416
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 417
    .line 418
    .line 419
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 420
    .line 421
    .line 422
    move-result v3

    .line 423
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 424
    .line 425
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 426
    .line 427
    .line 428
    move-result-wide v6

    .line 429
    const/4 v0, 0x0

    .line 430
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 431
    .line 432
    .line 433
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 434
    .line 435
    .line 436
    move-result v10

    .line 437
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 438
    .line 439
    .line 440
    move-result v11

    .line 441
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 442
    .line 443
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 444
    .line 445
    .line 446
    const/high16 v0, 0x414c0000    # 12.75f

    .line 447
    .line 448
    const v2, 0x40733333    # 3.8f

    .line 449
    .line 450
    .line 451
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 452
    .line 453
    .line 454
    const v17, 0x40033333    # 2.05f

    .line 455
    .line 456
    .line 457
    const v18, -0x40f33333    # -0.55f

    .line 458
    .line 459
    .line 460
    const v13, 0x3f3851ec    # 0.72f

    .line 461
    .line 462
    .line 463
    const v14, 0x3ed1eb85    # 0.41f

    .line 464
    .line 465
    .line 466
    const v15, 0x3fd0a3d7    # 1.63f

    .line 467
    .line 468
    .line 469
    const v16, 0x3e2e147b    # 0.17f

    .line 470
    .line 471
    .line 472
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 473
    .line 474
    .line 475
    const v17, -0x40f33333    # -0.55f

    .line 476
    .line 477
    .line 478
    const v18, -0x3ffccccd    # -2.05f

    .line 479
    .line 480
    .line 481
    const v13, 0x3ed1eb85    # 0.41f

    .line 482
    .line 483
    .line 484
    const v14, -0x40c7ae14    # -0.72f

    .line 485
    .line 486
    .line 487
    const v15, 0x3e2e147b    # 0.17f

    .line 488
    .line 489
    .line 490
    const v16, -0x402f5c29    # -1.63f

    .line 491
    .line 492
    .line 493
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 494
    .line 495
    .line 496
    const v17, -0x3ffccccd    # -2.05f

    .line 497
    .line 498
    .line 499
    const v18, 0x3f0ccccd    # 0.55f

    .line 500
    .line 501
    .line 502
    const v13, -0x40c7ae14    # -0.72f

    .line 503
    .line 504
    .line 505
    const v14, -0x412e147b    # -0.41f

    .line 506
    .line 507
    .line 508
    const v15, -0x402f5c29    # -1.63f

    .line 509
    .line 510
    .line 511
    const v16, -0x41d1eb85    # -0.17f

    .line 512
    .line 513
    .line 514
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 515
    .line 516
    .line 517
    const/high16 v17, 0x414c0000    # 12.75f

    .line 518
    .line 519
    const v18, 0x40733333    # 3.8f

    .line 520
    .line 521
    .line 522
    const v13, 0x413ca3d7    # 11.79f

    .line 523
    .line 524
    .line 525
    const v14, 0x401e147b    # 2.47f

    .line 526
    .line 527
    .line 528
    const v15, 0x41407ae1    # 12.03f

    .line 529
    .line 530
    .line 531
    const v16, 0x4058f5c3    # 3.39f

    .line 532
    .line 533
    .line 534
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 535
    .line 536
    .line 537
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 538
    .line 539
    .line 540
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 541
    .line 542
    .line 543
    move-result-object v2

    .line 544
    const/16 v16, 0x3800

    .line 545
    .line 546
    const/16 v17, 0x0

    .line 547
    .line 548
    const/high16 v6, 0x3f800000    # 1.0f

    .line 549
    .line 550
    const/4 v7, 0x0

    .line 551
    const/high16 v12, 0x3f800000    # 1.0f

    .line 552
    .line 553
    const/4 v13, 0x0

    .line 554
    const/4 v14, 0x0

    .line 555
    const/4 v15, 0x0

    .line 556
    const-string v4, ""

    .line 557
    .line 558
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 559
    .line 560
    .line 561
    move-result-object v0

    .line 562
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 563
    .line 564
    .line 565
    move-result-object v0

    .line 566
    sput-object v0, Landroidx/compose/material/icons/twotone/SportsHandballKt;->_sportsHandball:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 567
    .line 568
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 569
    .line 570
    .line 571
    return-object v0
.end method
