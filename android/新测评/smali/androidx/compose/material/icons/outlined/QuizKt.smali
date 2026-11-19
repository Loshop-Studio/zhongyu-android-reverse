.class public final Landroidx/compose/material/icons/outlined/QuizKt;
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
        "Landroidx/compose/material/icons/Icons$Outlined;",
        "getQuiz",
        "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;",
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
        "SMAP\nQuiz.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Quiz.kt\nandroidx/compose/material/icons/outlined/QuizKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,81:1\n212#2,12:82\n233#2,18:95\n253#2:132\n174#3:94\n705#4,2:113\n717#4,2:115\n719#4,11:121\n72#5,4:117\n*S KotlinDebug\n*F\n+ 1 Quiz.kt\nandroidx/compose/material/icons/outlined/QuizKt\n*L\n29#1:82,12\n30#1:95,18\n30#1:132\n29#1:94\n30#1:113,2\n30#1:115,2\n30#1:121,11\n30#1:117,4\n*E\n"
    }
.end annotation


# static fields
.field private static _quiz:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getQuiz(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/outlined/QuizKt;->_quiz:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Outlined.Quiz"

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
    const/high16 v0, 0x40c00000    # 6.0f

    .line 71
    .line 72
    const/high16 v2, 0x40800000    # 4.0f

    .line 73
    .line 74
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v0, 0x40000000    # 2.0f

    .line 78
    .line 79
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 80
    .line 81
    .line 82
    const/high16 v0, 0x41600000    # 14.0f

    .line 83
    .line 84
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 85
    .line 86
    .line 87
    const/high16 v17, 0x40000000    # 2.0f

    .line 88
    .line 89
    const/high16 v18, 0x40000000    # 2.0f

    .line 90
    .line 91
    const/4 v13, 0x0

    .line 92
    const v14, 0x3f8ccccd    # 1.1f

    .line 93
    .line 94
    .line 95
    const v15, 0x3f666666    # 0.9f

    .line 96
    .line 97
    .line 98
    const/high16 v16, 0x40000000    # 2.0f

    .line 99
    .line 100
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 101
    .line 102
    .line 103
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 104
    .line 105
    .line 106
    const/high16 v0, -0x40000000    # -2.0f

    .line 107
    .line 108
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 109
    .line 110
    .line 111
    const/high16 v0, 0x40800000    # 4.0f

    .line 112
    .line 113
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 114
    .line 115
    .line 116
    const/high16 v0, 0x40c00000    # 6.0f

    .line 117
    .line 118
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 119
    .line 120
    .line 121
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 122
    .line 123
    .line 124
    const/high16 v0, 0x41a00000    # 20.0f

    .line 125
    .line 126
    const/high16 v2, 0x40000000    # 2.0f

    .line 127
    .line 128
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 129
    .line 130
    .line 131
    const/high16 v0, 0x41000000    # 8.0f

    .line 132
    .line 133
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 134
    .line 135
    .line 136
    const/high16 v17, 0x40c00000    # 6.0f

    .line 137
    .line 138
    const/high16 v18, 0x40800000    # 4.0f

    .line 139
    .line 140
    const v13, 0x40dccccd    # 6.9f

    .line 141
    .line 142
    .line 143
    const/high16 v14, 0x40000000    # 2.0f

    .line 144
    .line 145
    const/high16 v15, 0x40c00000    # 6.0f

    .line 146
    .line 147
    const v16, 0x4039999a    # 2.9f

    .line 148
    .line 149
    .line 150
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 151
    .line 152
    .line 153
    const/high16 v0, 0x41400000    # 12.0f

    .line 154
    .line 155
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 156
    .line 157
    .line 158
    const/high16 v17, 0x40000000    # 2.0f

    .line 159
    .line 160
    const/high16 v18, 0x40000000    # 2.0f

    .line 161
    .line 162
    const/4 v13, 0x0

    .line 163
    const v14, 0x3f8ccccd    # 1.1f

    .line 164
    .line 165
    .line 166
    const v15, 0x3f666666    # 0.9f

    .line 167
    .line 168
    .line 169
    const/high16 v16, 0x40000000    # 2.0f

    .line 170
    .line 171
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 172
    .line 173
    .line 174
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 175
    .line 176
    .line 177
    const/high16 v18, -0x40000000    # -2.0f

    .line 178
    .line 179
    const v13, 0x3f8ccccd    # 1.1f

    .line 180
    .line 181
    .line 182
    const/4 v14, 0x0

    .line 183
    const/high16 v15, 0x40000000    # 2.0f

    .line 184
    .line 185
    const v16, -0x4099999a    # -0.9f

    .line 186
    .line 187
    .line 188
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 189
    .line 190
    .line 191
    const/high16 v0, 0x40800000    # 4.0f

    .line 192
    .line 193
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 194
    .line 195
    .line 196
    const/high16 v17, 0x41a00000    # 20.0f

    .line 197
    .line 198
    const/high16 v18, 0x40000000    # 2.0f

    .line 199
    .line 200
    const/high16 v13, 0x41b00000    # 22.0f

    .line 201
    .line 202
    const v14, 0x4039999a    # 2.9f

    .line 203
    .line 204
    .line 205
    const v15, 0x41a8cccd    # 21.1f

    .line 206
    .line 207
    .line 208
    const/high16 v16, 0x40000000    # 2.0f

    .line 209
    .line 210
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 211
    .line 212
    .line 213
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 214
    .line 215
    .line 216
    const/high16 v0, 0x41800000    # 16.0f

    .line 217
    .line 218
    const/high16 v2, 0x41a00000    # 20.0f

    .line 219
    .line 220
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 221
    .line 222
    .line 223
    const/high16 v0, 0x41000000    # 8.0f

    .line 224
    .line 225
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 226
    .line 227
    .line 228
    const/high16 v0, 0x40800000    # 4.0f

    .line 229
    .line 230
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 231
    .line 232
    .line 233
    const/high16 v0, 0x41400000    # 12.0f

    .line 234
    .line 235
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 236
    .line 237
    .line 238
    const/high16 v0, 0x41800000    # 16.0f

    .line 239
    .line 240
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 241
    .line 242
    .line 243
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 244
    .line 245
    .line 246
    const v0, 0x415828f6    # 13.51f

    .line 247
    .line 248
    .line 249
    const v2, 0x41228f5c    # 10.16f

    .line 250
    .line 251
    .line 252
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 253
    .line 254
    .line 255
    const v17, 0x3fd0a3d7    # 1.63f

    .line 256
    .line 257
    .line 258
    const v18, -0x4019999a    # -1.8f

    .line 259
    .line 260
    .line 261
    const v13, 0x3ed1eb85    # 0.41f

    .line 262
    .line 263
    .line 264
    const v14, -0x40c51eb8    # -0.73f

    .line 265
    .line 266
    .line 267
    const v15, 0x3f970a3d    # 1.18f

    .line 268
    .line 269
    .line 270
    const v16, -0x406b851f    # -1.16f

    .line 271
    .line 272
    .line 273
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 274
    .line 275
    .line 276
    const v17, -0x406e147b    # -1.14f

    .line 277
    .line 278
    .line 279
    const v18, -0x4007ae14    # -1.94f

    .line 280
    .line 281
    .line 282
    const v13, 0x3ef5c28f    # 0.48f

    .line 283
    .line 284
    .line 285
    const v14, -0x40d1eb85    # -0.68f

    .line 286
    .line 287
    .line 288
    const v15, 0x3e570a3d    # 0.21f

    .line 289
    .line 290
    .line 291
    const v16, -0x4007ae14    # -1.94f

    .line 292
    .line 293
    .line 294
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 295
    .line 296
    .line 297
    const/high16 v17, -0x40400000    # -1.5f

    .line 298
    .line 299
    const v18, 0x3f9d70a4    # 1.23f

    .line 300
    .line 301
    .line 302
    const v13, -0x409eb852    # -0.88f

    .line 303
    .line 304
    .line 305
    const/4 v14, 0x0

    .line 306
    const v15, -0x40570a3d    # -1.32f

    .line 307
    .line 308
    .line 309
    const v16, 0x3f2b851f    # 0.67f

    .line 310
    .line 311
    .line 312
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 313
    .line 314
    .line 315
    const v0, -0x4050a3d7    # -1.37f

    .line 316
    .line 317
    .line 318
    const v2, -0x40ee147b    # -0.57f

    .line 319
    .line 320
    .line 321
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 322
    .line 323
    .line 324
    const v17, 0x415fd70a    # 13.99f

    .line 325
    .line 326
    .line 327
    const/high16 v18, 0x40a00000    # 5.0f

    .line 328
    .line 329
    const v13, 0x413828f6    # 11.51f

    .line 330
    .line 331
    .line 332
    const v14, 0x40beb852    # 5.96f

    .line 333
    .line 334
    .line 335
    const v15, 0x414851ec    # 12.52f

    .line 336
    .line 337
    .line 338
    const/high16 v16, 0x40a00000    # 5.0f

    .line 339
    .line 340
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 341
    .line 342
    .line 343
    const v17, 0x4020a3d7    # 2.51f

    .line 344
    .line 345
    .line 346
    const v18, 0x3fa147ae    # 1.26f

    .line 347
    .line 348
    .line 349
    const v13, 0x3f9d70a4    # 1.23f

    .line 350
    .line 351
    .line 352
    const/4 v14, 0x0

    .line 353
    const v15, 0x40051eb8    # 2.08f

    .line 354
    .line 355
    .line 356
    const v16, 0x3f0f5c29    # 0.56f

    .line 357
    .line 358
    .line 359
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 360
    .line 361
    .line 362
    const v17, 0x3c23d70a    # 0.01f

    .line 363
    .line 364
    .line 365
    const v18, 0x40247ae1    # 2.57f

    .line 366
    .line 367
    .line 368
    const v13, 0x3ebd70a4    # 0.37f

    .line 369
    .line 370
    .line 371
    const v14, 0x3f19999a    # 0.6f

    .line 372
    .line 373
    .line 374
    const v15, 0x3f147ae1    # 0.58f

    .line 375
    .line 376
    .line 377
    const v16, 0x3fdd70a4    # 1.73f

    .line 378
    .line 379
    .line 380
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 381
    .line 382
    .line 383
    const v17, -0x403851ec    # -1.56f

    .line 384
    .line 385
    .line 386
    const v18, 0x3fe7ae14    # 1.81f

    .line 387
    .line 388
    .line 389
    const v13, -0x40deb852    # -0.63f

    .line 390
    .line 391
    .line 392
    const v14, 0x3f6e147b    # 0.93f

    .line 393
    .line 394
    .line 395
    const v15, -0x40628f5c    # -1.23f

    .line 396
    .line 397
    .line 398
    const v16, 0x3f9ae148    # 1.21f

    .line 399
    .line 400
    .line 401
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 402
    .line 403
    .line 404
    const v17, -0x41c7ae14    # -0.18f

    .line 405
    .line 406
    .line 407
    const v18, 0x3f970a3d    # 1.18f

    .line 408
    .line 409
    .line 410
    const v13, -0x41fae148    # -0.13f

    .line 411
    .line 412
    .line 413
    const v14, 0x3e75c28f    # 0.24f

    .line 414
    .line 415
    .line 416
    const v15, -0x41c7ae14    # -0.18f

    .line 417
    .line 418
    .line 419
    const v16, 0x3ecccccd    # 0.4f

    .line 420
    .line 421
    .line 422
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 423
    .line 424
    .line 425
    const v0, -0x403d70a4    # -1.52f

    .line 426
    .line 427
    .line 428
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 429
    .line 430
    .line 431
    const v17, 0x415828f6    # 13.51f

    .line 432
    .line 433
    .line 434
    const v18, 0x41228f5c    # 10.16f

    .line 435
    .line 436
    .line 437
    const v13, 0x415428f6    # 13.26f

    .line 438
    .line 439
    .line 440
    const v14, 0x41368f5c    # 11.41f

    .line 441
    .line 442
    .line 443
    const v15, 0x41530a3d    # 13.19f

    .line 444
    .line 445
    .line 446
    const v16, 0x412bd70a    # 10.74f

    .line 447
    .line 448
    .line 449
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 450
    .line 451
    .line 452
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 453
    .line 454
    .line 455
    const v0, 0x414f3333    # 12.95f

    .line 456
    .line 457
    .line 458
    const v2, 0x415f3333    # 13.95f

    .line 459
    .line 460
    .line 461
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 462
    .line 463
    .line 464
    const v17, 0x3f866666    # 1.05f

    .line 465
    .line 466
    .line 467
    const v18, -0x407ae148    # -1.04f

    .line 468
    .line 469
    .line 470
    const/4 v13, 0x0

    .line 471
    const v14, -0x40e8f5c3    # -0.59f

    .line 472
    .line 473
    .line 474
    const v15, 0x3ef0a3d7    # 0.47f

    .line 475
    .line 476
    .line 477
    const v16, -0x407ae148    # -1.04f

    .line 478
    .line 479
    .line 480
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 481
    .line 482
    .line 483
    const v17, 0x3f851eb8    # 1.04f

    .line 484
    .line 485
    .line 486
    const v18, 0x3f851eb8    # 1.04f

    .line 487
    .line 488
    .line 489
    const v13, 0x3f170a3d    # 0.59f

    .line 490
    .line 491
    .line 492
    const/4 v14, 0x0

    .line 493
    const v15, 0x3f851eb8    # 1.04f

    .line 494
    .line 495
    .line 496
    const v16, 0x3ee66666    # 0.45f

    .line 497
    .line 498
    .line 499
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 500
    .line 501
    .line 502
    const v17, -0x407ae148    # -1.04f

    .line 503
    .line 504
    .line 505
    const v18, 0x3f866666    # 1.05f

    .line 506
    .line 507
    .line 508
    const/4 v13, 0x0

    .line 509
    const v14, 0x3f147ae1    # 0.58f

    .line 510
    .line 511
    .line 512
    const v15, -0x411eb852    # -0.44f

    .line 513
    .line 514
    .line 515
    const v16, 0x3f866666    # 1.05f

    .line 516
    .line 517
    .line 518
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 519
    .line 520
    .line 521
    const v17, 0x414f3333    # 12.95f

    .line 522
    .line 523
    .line 524
    const v18, 0x415f3333    # 13.95f

    .line 525
    .line 526
    .line 527
    const v13, 0x4156b852    # 13.42f

    .line 528
    .line 529
    .line 530
    const/high16 v14, 0x41700000    # 15.0f

    .line 531
    .line 532
    const v15, 0x414f3333    # 12.95f

    .line 533
    .line 534
    .line 535
    const v16, 0x41687ae1    # 14.53f

    .line 536
    .line 537
    .line 538
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 539
    .line 540
    .line 541
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 542
    .line 543
    .line 544
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 545
    .line 546
    .line 547
    move-result-object v2

    .line 548
    const/16 v16, 0x3800

    .line 549
    .line 550
    const/16 v17, 0x0

    .line 551
    .line 552
    const/high16 v6, 0x3f800000    # 1.0f

    .line 553
    .line 554
    const/high16 v8, 0x3f800000    # 1.0f

    .line 555
    .line 556
    const/4 v7, 0x0

    .line 557
    const/high16 v9, 0x3f800000    # 1.0f

    .line 558
    .line 559
    const/high16 v12, 0x3f800000    # 1.0f

    .line 560
    .line 561
    const/4 v13, 0x0

    .line 562
    const/4 v14, 0x0

    .line 563
    const/4 v15, 0x0

    .line 564
    const-string v4, ""

    .line 565
    .line 566
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 567
    .line 568
    .line 569
    move-result-object v0

    .line 570
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 571
    .line 572
    .line 573
    move-result-object v0

    .line 574
    sput-object v0, Landroidx/compose/material/icons/outlined/QuizKt;->_quiz:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 575
    .line 576
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 577
    .line 578
    .line 579
    return-object v0
.end method
