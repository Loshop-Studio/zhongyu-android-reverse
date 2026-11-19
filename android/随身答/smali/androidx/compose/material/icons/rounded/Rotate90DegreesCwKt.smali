.class public final Landroidx/compose/material/icons/rounded/Rotate90DegreesCwKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_rotate90DegreesCw",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "Rotate90DegreesCw",
        "Landroidx/compose/material/icons/Icons$Rounded;",
        "getRotate90DegreesCw",
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
        "SMAP\nRotate90DegreesCw.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Rotate90DegreesCw.kt\nandroidx/compose/material/icons/rounded/Rotate90DegreesCwKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,67:1\n212#2,12:68\n233#2,18:81\n253#2:118\n233#2,18:119\n253#2:156\n174#3:80\n705#4,2:99\n717#4,2:101\n719#4,11:107\n705#4,2:137\n717#4,2:139\n719#4,11:145\n72#5,4:103\n72#5,4:141\n*S KotlinDebug\n*F\n+ 1 Rotate90DegreesCw.kt\nandroidx/compose/material/icons/rounded/Rotate90DegreesCwKt\n*L\n29#1:68,12\n30#1:81,18\n30#1:118\n50#1:119,18\n50#1:156\n29#1:80\n30#1:99,2\n30#1:101,2\n30#1:107,11\n50#1:137,2\n50#1:139,2\n50#1:145,11\n30#1:103,4\n50#1:141,4\n*E\n"
    }
.end annotation


# static fields
.field private static _rotate90DegreesCw:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getRotate90DegreesCw(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/Rotate90DegreesCwKt;->_rotate90DegreesCw:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.Rotate90DegreesCw"

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
    const v4, 0x40770a3d    # 3.86f

    .line 71
    .line 72
    .line 73
    const v6, 0x4193ae14    # 18.46f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v25, 0x412bd70a    # 10.74f

    .line 80
    .line 81
    .line 82
    const v26, 0x40328f5c    # 2.79f

    .line 83
    .line 84
    .line 85
    const v21, 0x4029999a    # 2.65f

    .line 86
    .line 87
    .line 88
    const v22, 0x405ccccd    # 3.45f

    .line 89
    .line 90
    .line 91
    const v23, 0x40e3851f    # 7.11f

    .line 92
    .line 93
    .line 94
    const v24, 0x408bd70a    # 4.37f

    .line 95
    .line 96
    .line 97
    move-object/from16 v20, v2

    .line 98
    .line 99
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 100
    .line 101
    .line 102
    const v25, 0x3e8a3d71    # 0.27f

    .line 103
    .line 104
    .line 105
    const v26, -0x403851ec    # -1.56f

    .line 106
    .line 107
    .line 108
    const v21, 0x3f1c28f6    # 0.61f

    .line 109
    .line 110
    .line 111
    const v22, -0x4175c28f    # -0.27f

    .line 112
    .line 113
    .line 114
    const v23, 0x3f3d70a4    # 0.74f

    .line 115
    .line 116
    .line 117
    const v24, -0x40747ae1    # -1.09f

    .line 118
    .line 119
    .line 120
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 121
    .line 122
    .line 123
    const v4, -0x42b33333    # -0.05f

    .line 124
    .line 125
    .line 126
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 127
    .line 128
    .line 129
    const v25, -0x40733333    # -1.1f

    .line 130
    .line 131
    .line 132
    const v26, -0x41bd70a4    # -0.19f

    .line 133
    .line 134
    .line 135
    const v21, -0x416b851f    # -0.29f

    .line 136
    .line 137
    .line 138
    const v22, -0x416b851f    # -0.29f

    .line 139
    .line 140
    .line 141
    const v23, -0x40c7ae14    # -0.72f

    .line 142
    .line 143
    .line 144
    const v24, -0x414ccccd    # -0.35f

    .line 145
    .line 146
    .line 147
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 148
    .line 149
    .line 150
    const v25, -0x3ef6b852    # -8.58f

    .line 151
    .line 152
    .line 153
    const v26, -0x3fd851ec    # -2.62f

    .line 154
    .line 155
    .line 156
    const v21, -0x3fc28f5c    # -2.96f

    .line 157
    .line 158
    .line 159
    const v22, 0x3f9eb852    # 1.24f

    .line 160
    .line 161
    .line 162
    const v23, -0x3f2d1eb8    # -6.59f

    .line 163
    .line 164
    .line 165
    const v24, 0x3ebd70a4    # 0.37f

    .line 166
    .line 167
    .line 168
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 169
    .line 170
    .line 171
    const v25, 0x3d4ccccd    # 0.05f

    .line 172
    .line 173
    .line 174
    const v26, -0x3f08a3d7    # -7.73f

    .line 175
    .line 176
    .line 177
    const v21, -0x4035c28f    # -1.58f

    .line 178
    .line 179
    .line 180
    const v22, -0x3fe851ec    # -2.37f

    .line 181
    .line 182
    .line 183
    const v23, -0x4039999a    # -1.55f

    .line 184
    .line 185
    .line 186
    const v24, -0x3f5428f6    # -5.37f

    .line 187
    .line 188
    .line 189
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 190
    .line 191
    .line 192
    const/high16 v25, 0x41300000    # 11.0f

    .line 193
    .line 194
    const v26, 0x40c0f5c3    # 6.03f

    .line 195
    .line 196
    .line 197
    const v21, 0x40d33333    # 6.6f

    .line 198
    .line 199
    .line 200
    const v22, 0x40e0f5c3    # 7.03f

    .line 201
    .line 202
    .line 203
    const v23, 0x410ccccd    # 8.8f

    .line 204
    .line 205
    .line 206
    const v24, 0x40c0f5c3    # 6.03f

    .line 207
    .line 208
    .line 209
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 210
    .line 211
    .line 212
    const v4, 0x3fe147ae    # 1.76f

    .line 213
    .line 214
    .line 215
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 216
    .line 217
    .line 218
    const v25, 0x3f5c28f6    # 0.86f

    .line 219
    .line 220
    .line 221
    const v26, 0x3eb851ec    # 0.36f

    .line 222
    .line 223
    .line 224
    const/16 v21, 0x0

    .line 225
    .line 226
    const v22, 0x3ee66666    # 0.45f

    .line 227
    .line 228
    .line 229
    const v23, 0x3f0a3d71    # 0.54f

    .line 230
    .line 231
    .line 232
    const v24, 0x3f2b851f    # 0.67f

    .line 233
    .line 234
    .line 235
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 236
    .line 237
    .line 238
    const v4, 0x40328f5c    # 2.79f

    .line 239
    .line 240
    .line 241
    const v6, -0x3fcd70a4    # -2.79f

    .line 242
    .line 243
    .line 244
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 245
    .line 246
    .line 247
    const/16 v25, 0x0

    .line 248
    .line 249
    const v26, -0x40ca3d71    # -0.71f

    .line 250
    .line 251
    .line 252
    const v21, 0x3e4ccccd    # 0.2f

    .line 253
    .line 254
    .line 255
    const v22, -0x41b33333    # -0.2f

    .line 256
    .line 257
    .line 258
    const v23, 0x3e4ccccd    # 0.2f

    .line 259
    .line 260
    .line 261
    const v24, -0x40fd70a4    # -0.51f

    .line 262
    .line 263
    .line 264
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 265
    .line 266
    .line 267
    const v4, -0x3fcccccd    # -2.8f

    .line 268
    .line 269
    .line 270
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 271
    .line 272
    .line 273
    const/high16 v25, 0x41300000    # 11.0f

    .line 274
    .line 275
    const v26, 0x400d70a4    # 2.21f

    .line 276
    .line 277
    .line 278
    const v21, 0x4138a3d7    # 11.54f

    .line 279
    .line 280
    .line 281
    const v22, 0x3fc51eb8    # 1.54f

    .line 282
    .line 283
    .line 284
    const/high16 v23, 0x41300000    # 11.0f

    .line 285
    .line 286
    const v24, 0x3fe147ae    # 1.76f

    .line 287
    .line 288
    .line 289
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 290
    .line 291
    .line 292
    const v4, 0x3fe66666    # 1.8f

    .line 293
    .line 294
    .line 295
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 296
    .line 297
    .line 298
    const v25, -0x3f151eb8    # -7.34f

    .line 299
    .line 300
    .line 301
    const v26, 0x4071eb85    # 3.78f

    .line 302
    .line 303
    .line 304
    const v21, -0x3fcf5c29    # -2.76f

    .line 305
    .line 306
    .line 307
    const/16 v22, 0x0

    .line 308
    .line 309
    const v23, -0x3f4f5c29    # -5.52f

    .line 310
    .line 311
    .line 312
    const/high16 v24, 0x3fa00000    # 1.25f

    .line 313
    .line 314
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 315
    .line 316
    .line 317
    const v25, 0x40770a3d    # 3.86f

    .line 318
    .line 319
    .line 320
    const v26, 0x4193ae14    # 18.46f

    .line 321
    .line 322
    .line 323
    const v21, 0x3fb0a3d7    # 1.38f

    .line 324
    .line 325
    .line 326
    const v22, 0x412f5c29    # 10.96f

    .line 327
    .line 328
    .line 329
    const v23, 0x3fbae148    # 1.46f

    .line 330
    .line 331
    .line 332
    const v24, 0x4175eb85    # 15.37f

    .line 333
    .line 334
    .line 335
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 336
    .line 337
    .line 338
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 339
    .line 340
    .line 341
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 342
    .line 343
    .line 344
    move-result-object v2

    .line 345
    const/16 v16, 0x3800

    .line 346
    .line 347
    const/16 v17, 0x0

    .line 348
    .line 349
    const/high16 v6, 0x3f800000    # 1.0f

    .line 350
    .line 351
    const/high16 v8, 0x3f800000    # 1.0f

    .line 352
    .line 353
    const/4 v7, 0x0

    .line 354
    const/high16 v9, 0x3f800000    # 1.0f

    .line 355
    .line 356
    const/high16 v12, 0x3f800000    # 1.0f

    .line 357
    .line 358
    const/4 v13, 0x0

    .line 359
    const/4 v14, 0x0

    .line 360
    const/4 v15, 0x0

    .line 361
    const-string v4, ""

    .line 362
    .line 363
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 364
    .line 365
    .line 366
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 367
    .line 368
    .line 369
    move-result v3

    .line 370
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 371
    .line 372
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 373
    .line 374
    .line 375
    move-result-wide v6

    .line 376
    const/4 v0, 0x0

    .line 377
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 378
    .line 379
    .line 380
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 381
    .line 382
    .line 383
    move-result v10

    .line 384
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 385
    .line 386
    .line 387
    move-result v11

    .line 388
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 389
    .line 390
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 391
    .line 392
    .line 393
    const v0, 0x40f6b852    # 7.71f

    .line 394
    .line 395
    .line 396
    const v2, 0x418d999a    # 17.7f

    .line 397
    .line 398
    .line 399
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 400
    .line 401
    .line 402
    const v17, -0x404b851f    # -1.41f

    .line 403
    .line 404
    .line 405
    const/16 v18, 0x0

    .line 406
    .line 407
    const v13, -0x413851ec    # -0.39f

    .line 408
    .line 409
    .line 410
    const v14, -0x413851ec    # -0.39f

    .line 411
    .line 412
    .line 413
    const v15, -0x407d70a4    # -1.02f

    .line 414
    .line 415
    .line 416
    const v16, -0x413851ec    # -0.39f

    .line 417
    .line 418
    .line 419
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 420
    .line 421
    .line 422
    const v0, 0x40928f5c    # 4.58f

    .line 423
    .line 424
    .line 425
    const v2, -0x3f6d1eb8    # -4.59f

    .line 426
    .line 427
    .line 428
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 429
    .line 430
    .line 431
    const/16 v17, 0x0

    .line 432
    .line 433
    const v18, 0x3fb47ae1    # 1.41f

    .line 434
    .line 435
    .line 436
    const v14, 0x3ec7ae14    # 0.39f

    .line 437
    .line 438
    .line 439
    const v15, -0x413851ec    # -0.39f

    .line 440
    .line 441
    .line 442
    const v16, 0x3f828f5c    # 1.02f

    .line 443
    .line 444
    .line 445
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 446
    .line 447
    .line 448
    const v0, 0x4092e148    # 4.59f

    .line 449
    .line 450
    .line 451
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 452
    .line 453
    .line 454
    const v17, 0x3fb47ae1    # 1.41f

    .line 455
    .line 456
    .line 457
    const/16 v18, 0x0

    .line 458
    .line 459
    const v13, 0x3ec7ae14    # 0.39f

    .line 460
    .line 461
    .line 462
    const v15, 0x3f828f5c    # 1.02f

    .line 463
    .line 464
    .line 465
    const v16, 0x3ec7ae14    # 0.39f

    .line 466
    .line 467
    .line 468
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 469
    .line 470
    .line 471
    const v0, -0x3f6d1eb8    # -4.59f

    .line 472
    .line 473
    .line 474
    const v2, 0x4092e148    # 4.59f

    .line 475
    .line 476
    .line 477
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 478
    .line 479
    .line 480
    const/16 v17, 0x0

    .line 481
    .line 482
    const v18, -0x404b851f    # -1.41f

    .line 483
    .line 484
    .line 485
    const v14, -0x413851ec    # -0.39f

    .line 486
    .line 487
    .line 488
    const v15, 0x3ec7ae14    # 0.39f

    .line 489
    .line 490
    .line 491
    const v16, -0x407d70a4    # -1.02f

    .line 492
    .line 493
    .line 494
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 495
    .line 496
    .line 497
    const v0, 0x40f6b852    # 7.71f

    .line 498
    .line 499
    .line 500
    const v2, 0x418d999a    # 17.7f

    .line 501
    .line 502
    .line 503
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 504
    .line 505
    .line 506
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 507
    .line 508
    .line 509
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 510
    .line 511
    .line 512
    move-result-object v2

    .line 513
    const/16 v16, 0x3800

    .line 514
    .line 515
    const/16 v17, 0x0

    .line 516
    .line 517
    const/high16 v6, 0x3f800000    # 1.0f

    .line 518
    .line 519
    const/4 v7, 0x0

    .line 520
    const/high16 v12, 0x3f800000    # 1.0f

    .line 521
    .line 522
    const/4 v13, 0x0

    .line 523
    const/4 v14, 0x0

    .line 524
    const/4 v15, 0x0

    .line 525
    const-string v4, ""

    .line 526
    .line 527
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 528
    .line 529
    .line 530
    move-result-object v0

    .line 531
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 532
    .line 533
    .line 534
    move-result-object v0

    .line 535
    sput-object v0, Landroidx/compose/material/icons/rounded/Rotate90DegreesCwKt;->_rotate90DegreesCw:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 536
    .line 537
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 538
    .line 539
    .line 540
    return-object v0
.end method
