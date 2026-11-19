.class public final Landroidx/compose/material/icons/sharp/QuizKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_quiz",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "Quiz",
        "Landroidx/compose/material/icons/Icons$Sharp;",
        "getQuiz",
        "(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;",
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
        "SMAP\nQuiz.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Quiz.kt\nandroidx/compose/material/icons/sharp/QuizKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,71:1\n212#2,12:72\n233#2,18:85\n253#2:122\n233#2,18:123\n253#2:160\n174#3:84\n705#4,2:103\n717#4,2:105\n719#4,11:111\n705#4,2:141\n717#4,2:143\n719#4,11:149\n72#5,4:107\n72#5,4:145\n*S KotlinDebug\n*F\n+ 1 Quiz.kt\nandroidx/compose/material/icons/sharp/QuizKt\n*L\n29#1:72,12\n30#1:85,18\n30#1:122\n39#1:123,18\n39#1:160\n29#1:84\n30#1:103,2\n30#1:105,2\n30#1:111,11\n39#1:141,2\n39#1:143,2\n39#1:149,11\n30#1:107,4\n39#1:145,4\n*E\n"
    }
.end annotation


# static fields
.field private static _quiz:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getQuiz(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 20

    .line 1
    sget-object v0, Landroidx/compose/material/icons/sharp/QuizKt;->_quiz:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Sharp.Quiz"

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
    const/high16 v4, 0x40800000    # 4.0f

    .line 71
    .line 72
    const/high16 v6, 0x40c00000    # 6.0f

    .line 73
    .line 74
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v4, -0x40000000    # -2.0f

    .line 78
    .line 79
    const/4 v6, 0x0

    .line 80
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 81
    .line 82
    .line 83
    const/high16 v4, 0x41800000    # 16.0f

    .line 84
    .line 85
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 86
    .line 87
    .line 88
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 89
    .line 90
    .line 91
    const/high16 v4, -0x40000000    # -2.0f

    .line 92
    .line 93
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 94
    .line 95
    .line 96
    const/high16 v4, -0x3ea00000    # -14.0f

    .line 97
    .line 98
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 99
    .line 100
    .line 101
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 102
    .line 103
    .line 104
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 105
    .line 106
    .line 107
    move-result-object v2

    .line 108
    const/16 v16, 0x3800

    .line 109
    .line 110
    const/16 v17, 0x0

    .line 111
    .line 112
    const/high16 v6, 0x3f800000    # 1.0f

    .line 113
    .line 114
    const/high16 v8, 0x3f800000    # 1.0f

    .line 115
    .line 116
    const/4 v7, 0x0

    .line 117
    const/high16 v9, 0x3f800000    # 1.0f

    .line 118
    .line 119
    const/high16 v12, 0x3f800000    # 1.0f

    .line 120
    .line 121
    const/4 v13, 0x0

    .line 122
    const/4 v14, 0x0

    .line 123
    const/4 v15, 0x0

    .line 124
    const-string v4, ""

    .line 125
    .line 126
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 127
    .line 128
    .line 129
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 130
    .line 131
    .line 132
    move-result v3

    .line 133
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 134
    .line 135
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 136
    .line 137
    .line 138
    move-result-wide v6

    .line 139
    const/4 v0, 0x0

    .line 140
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 141
    .line 142
    .line 143
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 144
    .line 145
    .line 146
    move-result v10

    .line 147
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 148
    .line 149
    .line 150
    move-result v11

    .line 151
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 152
    .line 153
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 154
    .line 155
    .line 156
    const/high16 v0, 0x40000000    # 2.0f

    .line 157
    .line 158
    const/high16 v2, 0x40c00000    # 6.0f

    .line 159
    .line 160
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 161
    .line 162
    .line 163
    const/high16 v0, 0x41800000    # 16.0f

    .line 164
    .line 165
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 166
    .line 167
    .line 168
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 169
    .line 170
    .line 171
    const/high16 v0, 0x40000000    # 2.0f

    .line 172
    .line 173
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 174
    .line 175
    .line 176
    const/high16 v0, 0x40c00000    # 6.0f

    .line 177
    .line 178
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 179
    .line 180
    .line 181
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 182
    .line 183
    .line 184
    const v0, 0x415828f6    # 13.51f

    .line 185
    .line 186
    .line 187
    const v2, 0x41228f5c    # 10.16f

    .line 188
    .line 189
    .line 190
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 191
    .line 192
    .line 193
    const v17, 0x3fd0a3d7    # 1.63f

    .line 194
    .line 195
    .line 196
    const v18, -0x4019999a    # -1.8f

    .line 197
    .line 198
    .line 199
    const v13, 0x3ed1eb85    # 0.41f

    .line 200
    .line 201
    .line 202
    const v14, -0x40c51eb8    # -0.73f

    .line 203
    .line 204
    .line 205
    const v15, 0x3f970a3d    # 1.18f

    .line 206
    .line 207
    .line 208
    const v16, -0x406b851f    # -1.16f

    .line 209
    .line 210
    .line 211
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 212
    .line 213
    .line 214
    const v17, -0x406e147b    # -1.14f

    .line 215
    .line 216
    .line 217
    const v18, -0x4007ae14    # -1.94f

    .line 218
    .line 219
    .line 220
    const v13, 0x3ef5c28f    # 0.48f

    .line 221
    .line 222
    .line 223
    const v14, -0x40d1eb85    # -0.68f

    .line 224
    .line 225
    .line 226
    const v15, 0x3e570a3d    # 0.21f

    .line 227
    .line 228
    .line 229
    const v16, -0x4007ae14    # -1.94f

    .line 230
    .line 231
    .line 232
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 233
    .line 234
    .line 235
    const/high16 v17, -0x40400000    # -1.5f

    .line 236
    .line 237
    const v18, 0x3f9d70a4    # 1.23f

    .line 238
    .line 239
    .line 240
    const v13, -0x409eb852    # -0.88f

    .line 241
    .line 242
    .line 243
    const/4 v14, 0x0

    .line 244
    const v15, -0x40570a3d    # -1.32f

    .line 245
    .line 246
    .line 247
    const v16, 0x3f2b851f    # 0.67f

    .line 248
    .line 249
    .line 250
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 251
    .line 252
    .line 253
    const v0, -0x4050a3d7    # -1.37f

    .line 254
    .line 255
    .line 256
    const v2, -0x40ee147b    # -0.57f

    .line 257
    .line 258
    .line 259
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 260
    .line 261
    .line 262
    const v17, 0x415fd70a    # 13.99f

    .line 263
    .line 264
    .line 265
    const/high16 v18, 0x40a00000    # 5.0f

    .line 266
    .line 267
    const v13, 0x413828f6    # 11.51f

    .line 268
    .line 269
    .line 270
    const v14, 0x40beb852    # 5.96f

    .line 271
    .line 272
    .line 273
    const v15, 0x414851ec    # 12.52f

    .line 274
    .line 275
    .line 276
    const/high16 v16, 0x40a00000    # 5.0f

    .line 277
    .line 278
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 279
    .line 280
    .line 281
    const v17, 0x4020a3d7    # 2.51f

    .line 282
    .line 283
    .line 284
    const v18, 0x3fa147ae    # 1.26f

    .line 285
    .line 286
    .line 287
    const v13, 0x3f9d70a4    # 1.23f

    .line 288
    .line 289
    .line 290
    const/4 v14, 0x0

    .line 291
    const v15, 0x40051eb8    # 2.08f

    .line 292
    .line 293
    .line 294
    const v16, 0x3f0f5c29    # 0.56f

    .line 295
    .line 296
    .line 297
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 298
    .line 299
    .line 300
    const v17, 0x3c23d70a    # 0.01f

    .line 301
    .line 302
    .line 303
    const v18, 0x40247ae1    # 2.57f

    .line 304
    .line 305
    .line 306
    const v13, 0x3ebd70a4    # 0.37f

    .line 307
    .line 308
    .line 309
    const v14, 0x3f19999a    # 0.6f

    .line 310
    .line 311
    .line 312
    const v15, 0x3f147ae1    # 0.58f

    .line 313
    .line 314
    .line 315
    const v16, 0x3fdd70a4    # 1.73f

    .line 316
    .line 317
    .line 318
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 319
    .line 320
    .line 321
    const v17, -0x403851ec    # -1.56f

    .line 322
    .line 323
    .line 324
    const v18, 0x3fe7ae14    # 1.81f

    .line 325
    .line 326
    .line 327
    const v13, -0x40deb852    # -0.63f

    .line 328
    .line 329
    .line 330
    const v14, 0x3f6e147b    # 0.93f

    .line 331
    .line 332
    .line 333
    const v15, -0x40628f5c    # -1.23f

    .line 334
    .line 335
    .line 336
    const v16, 0x3f9ae148    # 1.21f

    .line 337
    .line 338
    .line 339
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 340
    .line 341
    .line 342
    const v17, -0x41c7ae14    # -0.18f

    .line 343
    .line 344
    .line 345
    const v18, 0x3f970a3d    # 1.18f

    .line 346
    .line 347
    .line 348
    const v13, -0x41fae148    # -0.13f

    .line 349
    .line 350
    .line 351
    const v14, 0x3e75c28f    # 0.24f

    .line 352
    .line 353
    .line 354
    const v15, -0x41c7ae14    # -0.18f

    .line 355
    .line 356
    .line 357
    const v16, 0x3ecccccd    # 0.4f

    .line 358
    .line 359
    .line 360
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 361
    .line 362
    .line 363
    const v0, -0x403d70a4    # -1.52f

    .line 364
    .line 365
    .line 366
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 367
    .line 368
    .line 369
    const v17, 0x415828f6    # 13.51f

    .line 370
    .line 371
    .line 372
    const v18, 0x41228f5c    # 10.16f

    .line 373
    .line 374
    .line 375
    const v13, 0x415428f6    # 13.26f

    .line 376
    .line 377
    .line 378
    const v14, 0x41368f5c    # 11.41f

    .line 379
    .line 380
    .line 381
    const v15, 0x41530a3d    # 13.19f

    .line 382
    .line 383
    .line 384
    const v16, 0x412bd70a    # 10.74f

    .line 385
    .line 386
    .line 387
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 388
    .line 389
    .line 390
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 391
    .line 392
    .line 393
    const v0, 0x414f3333    # 12.95f

    .line 394
    .line 395
    .line 396
    const v2, 0x415f3333    # 13.95f

    .line 397
    .line 398
    .line 399
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 400
    .line 401
    .line 402
    const v17, 0x3f866666    # 1.05f

    .line 403
    .line 404
    .line 405
    const v18, -0x407ae148    # -1.04f

    .line 406
    .line 407
    .line 408
    const/4 v13, 0x0

    .line 409
    const v14, -0x40e8f5c3    # -0.59f

    .line 410
    .line 411
    .line 412
    const v15, 0x3ef0a3d7    # 0.47f

    .line 413
    .line 414
    .line 415
    const v16, -0x407ae148    # -1.04f

    .line 416
    .line 417
    .line 418
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 419
    .line 420
    .line 421
    const v17, 0x3f851eb8    # 1.04f

    .line 422
    .line 423
    .line 424
    const v18, 0x3f851eb8    # 1.04f

    .line 425
    .line 426
    .line 427
    const v13, 0x3f170a3d    # 0.59f

    .line 428
    .line 429
    .line 430
    const/4 v14, 0x0

    .line 431
    const v15, 0x3f851eb8    # 1.04f

    .line 432
    .line 433
    .line 434
    const v16, 0x3ee66666    # 0.45f

    .line 435
    .line 436
    .line 437
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 438
    .line 439
    .line 440
    const v17, -0x407ae148    # -1.04f

    .line 441
    .line 442
    .line 443
    const v18, 0x3f866666    # 1.05f

    .line 444
    .line 445
    .line 446
    const/4 v13, 0x0

    .line 447
    const v14, 0x3f147ae1    # 0.58f

    .line 448
    .line 449
    .line 450
    const v15, -0x411eb852    # -0.44f

    .line 451
    .line 452
    .line 453
    const v16, 0x3f866666    # 1.05f

    .line 454
    .line 455
    .line 456
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 457
    .line 458
    .line 459
    const v17, 0x414f3333    # 12.95f

    .line 460
    .line 461
    .line 462
    const v18, 0x415f3333    # 13.95f

    .line 463
    .line 464
    .line 465
    const v13, 0x4156b852    # 13.42f

    .line 466
    .line 467
    .line 468
    const/high16 v14, 0x41700000    # 15.0f

    .line 469
    .line 470
    const v15, 0x414f3333    # 12.95f

    .line 471
    .line 472
    .line 473
    const v16, 0x41687ae1    # 14.53f

    .line 474
    .line 475
    .line 476
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 477
    .line 478
    .line 479
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 480
    .line 481
    .line 482
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 483
    .line 484
    .line 485
    move-result-object v2

    .line 486
    const/16 v16, 0x3800

    .line 487
    .line 488
    const/16 v17, 0x0

    .line 489
    .line 490
    const/high16 v6, 0x3f800000    # 1.0f

    .line 491
    .line 492
    const/4 v7, 0x0

    .line 493
    const/high16 v12, 0x3f800000    # 1.0f

    .line 494
    .line 495
    const/4 v13, 0x0

    .line 496
    const/4 v14, 0x0

    .line 497
    const/4 v15, 0x0

    .line 498
    const-string v4, ""

    .line 499
    .line 500
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 501
    .line 502
    .line 503
    move-result-object v0

    .line 504
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 505
    .line 506
    .line 507
    move-result-object v0

    .line 508
    sput-object v0, Landroidx/compose/material/icons/sharp/QuizKt;->_quiz:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 509
    .line 510
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 511
    .line 512
    .line 513
    return-object v0
.end method
