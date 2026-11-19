.class public final Landroidx/compose/material/icons/twotone/QuizKt;
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
        "Landroidx/compose/material/icons/Icons$TwoTone;",
        "getQuiz",
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
        "SMAP\nQuiz.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Quiz.kt\nandroidx/compose/material/icons/twotone/QuizKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,122:1\n212#2,12:123\n233#2,18:136\n253#2:173\n233#2,18:174\n253#2:211\n174#3:135\n705#4,2:154\n717#4,2:156\n719#4,11:162\n705#4,2:192\n717#4,2:194\n719#4,11:200\n72#5,4:158\n72#5,4:196\n*S KotlinDebug\n*F\n+ 1 Quiz.kt\nandroidx/compose/material/icons/twotone/QuizKt\n*L\n29#1:123,12\n30#1:136,18\n30#1:173\n71#1:174,18\n71#1:211\n29#1:135\n30#1:154,2\n30#1:156,2\n30#1:162,11\n71#1:192,2\n71#1:194,2\n71#1:200,11\n30#1:158,4\n71#1:196,4\n*E\n"
    }
.end annotation


# static fields
.field private static _quiz:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getQuiz(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/QuizKt;->_quiz:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.Quiz"

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
    const/high16 v4, 0x41000000    # 8.0f

    .line 71
    .line 72
    const/high16 v6, 0x40800000    # 4.0f

    .line 73
    .line 74
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v4, 0x41400000    # 12.0f

    .line 78
    .line 79
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 80
    .line 81
    .line 82
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 83
    .line 84
    .line 85
    const/high16 v4, 0x40800000    # 4.0f

    .line 86
    .line 87
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 88
    .line 89
    .line 90
    const/high16 v4, 0x41000000    # 8.0f

    .line 91
    .line 92
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 93
    .line 94
    .line 95
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 96
    .line 97
    .line 98
    const v4, 0x416bd70a    # 14.74f

    .line 99
    .line 100
    .line 101
    const v6, 0x416b0a3d    # 14.69f

    .line 102
    .line 103
    .line 104
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 105
    .line 106
    .line 107
    const v25, 0x416028f6    # 14.01f

    .line 108
    .line 109
    .line 110
    const/high16 v26, 0x41700000    # 15.0f

    .line 111
    .line 112
    const v21, 0x4168a3d7    # 14.54f

    .line 113
    .line 114
    .line 115
    const v22, 0x416e6666    # 14.9f

    .line 116
    .line 117
    .line 118
    const v23, 0x4164cccd    # 14.3f

    .line 119
    .line 120
    .line 121
    const/high16 v24, 0x41700000    # 15.0f

    .line 122
    .line 123
    move-object/from16 v20, v2

    .line 124
    .line 125
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 126
    .line 127
    .line 128
    const v25, -0x40c28f5c    # -0.74f

    .line 129
    .line 130
    .line 131
    const v26, -0x416147ae    # -0.31f

    .line 132
    .line 133
    .line 134
    const v21, -0x416b851f    # -0.29f

    .line 135
    .line 136
    .line 137
    const/16 v22, 0x0

    .line 138
    .line 139
    const v23, -0x40f5c28f    # -0.54f

    .line 140
    .line 141
    .line 142
    const v24, -0x42333333    # -0.1f

    .line 143
    .line 144
    .line 145
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 146
    .line 147
    .line 148
    const v25, -0x416147ae    # -0.31f

    .line 149
    .line 150
    .line 151
    const v26, -0x40c28f5c    # -0.74f

    .line 152
    .line 153
    .line 154
    const v21, -0x41a8f5c3    # -0.21f

    .line 155
    .line 156
    .line 157
    const v22, -0x41a8f5c3    # -0.21f

    .line 158
    .line 159
    .line 160
    const v23, -0x416147ae    # -0.31f

    .line 161
    .line 162
    .line 163
    const v24, -0x4119999a    # -0.45f

    .line 164
    .line 165
    .line 166
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 167
    .line 168
    .line 169
    const v25, 0x3e9eb852    # 0.31f

    .line 170
    .line 171
    .line 172
    const/16 v21, 0x0

    .line 173
    .line 174
    const v22, -0x416b851f    # -0.29f

    .line 175
    .line 176
    .line 177
    const v23, 0x3dcccccd    # 0.1f

    .line 178
    .line 179
    .line 180
    const v24, -0x40f5c28f    # -0.54f

    .line 181
    .line 182
    .line 183
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 184
    .line 185
    .line 186
    const v25, 0x3f3d70a4    # 0.74f

    .line 187
    .line 188
    .line 189
    const v26, -0x41666666    # -0.3f

    .line 190
    .line 191
    .line 192
    const v21, 0x3e570a3d    # 0.21f

    .line 193
    .line 194
    .line 195
    const v22, -0x41b33333    # -0.2f

    .line 196
    .line 197
    .line 198
    const v23, 0x3ee66666    # 0.45f

    .line 199
    .line 200
    .line 201
    const v24, -0x41666666    # -0.3f

    .line 202
    .line 203
    .line 204
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 205
    .line 206
    .line 207
    const v26, 0x3e99999a    # 0.3f

    .line 208
    .line 209
    .line 210
    const v21, 0x3e947ae1    # 0.29f

    .line 211
    .line 212
    .line 213
    const/16 v22, 0x0

    .line 214
    .line 215
    const v23, 0x3f0a3d71    # 0.54f

    .line 216
    .line 217
    .line 218
    const v24, 0x3dcccccd    # 0.1f

    .line 219
    .line 220
    .line 221
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 222
    .line 223
    .line 224
    const v25, 0x3e99999a    # 0.3f

    .line 225
    .line 226
    .line 227
    const v26, 0x3f3d70a4    # 0.74f

    .line 228
    .line 229
    .line 230
    const v21, 0x3e4ccccd    # 0.2f

    .line 231
    .line 232
    .line 233
    const v22, 0x3e4ccccd    # 0.2f

    .line 234
    .line 235
    .line 236
    const v23, 0x3e99999a    # 0.3f

    .line 237
    .line 238
    .line 239
    const v24, 0x3ee66666    # 0.45f

    .line 240
    .line 241
    .line 242
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 243
    .line 244
    .line 245
    const v25, 0x416bd70a    # 14.74f

    .line 246
    .line 247
    .line 248
    const v26, 0x416b0a3d    # 14.69f

    .line 249
    .line 250
    .line 251
    const v21, 0x4170cccd    # 15.05f

    .line 252
    .line 253
    .line 254
    const v22, 0x4163d70a    # 14.24f

    .line 255
    .line 256
    .line 257
    const v23, 0x416f0a3d    # 14.94f

    .line 258
    .line 259
    .line 260
    const v24, 0x4167d70a    # 14.49f

    .line 261
    .line 262
    .line 263
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 264
    .line 265
    .line 266
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 267
    .line 268
    .line 269
    const v4, 0x4184147b    # 16.51f

    .line 270
    .line 271
    .line 272
    const v6, 0x410d47ae    # 8.83f

    .line 273
    .line 274
    .line 275
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 276
    .line 277
    .line 278
    const v25, -0x40947ae1    # -0.92f

    .line 279
    .line 280
    .line 281
    const v26, 0x3f87ae14    # 1.06f

    .line 282
    .line 283
    .line 284
    const v21, -0x41947ae1    # -0.23f

    .line 285
    .line 286
    .line 287
    const v22, 0x3eae147b    # 0.34f

    .line 288
    .line 289
    .line 290
    const v23, -0x40f5c28f    # -0.54f

    .line 291
    .line 292
    .line 293
    const v24, 0x3f30a3d7    # 0.69f

    .line 294
    .line 295
    .line 296
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 297
    .line 298
    .line 299
    const v25, -0x40dc28f6    # -0.64f

    .line 300
    .line 301
    .line 302
    const/high16 v26, 0x3f400000    # 0.75f

    .line 303
    .line 304
    const v21, -0x41666666    # -0.3f

    .line 305
    .line 306
    .line 307
    const v22, 0x3e8a3d71    # 0.27f

    .line 308
    .line 309
    .line 310
    const v23, -0x40fd70a4    # -0.51f

    .line 311
    .line 312
    .line 313
    const v24, 0x3f051eb8    # 0.52f

    .line 314
    .line 315
    .line 316
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 317
    .line 318
    .line 319
    const v25, -0x41c7ae14    # -0.18f

    .line 320
    .line 321
    .line 322
    const v26, 0x3f47ae14    # 0.78f

    .line 323
    .line 324
    .line 325
    const v21, -0x420a3d71    # -0.12f

    .line 326
    .line 327
    .line 328
    const v22, 0x3e6b851f    # 0.23f

    .line 329
    .line 330
    .line 331
    const v23, -0x41c7ae14    # -0.18f

    .line 332
    .line 333
    .line 334
    const v24, 0x3efae148    # 0.49f

    .line 335
    .line 336
    .line 337
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 338
    .line 339
    .line 340
    const v4, 0x3ecccccd    # 0.4f

    .line 341
    .line 342
    .line 343
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 344
    .line 345
    .line 346
    const v4, -0x403d70a4    # -1.52f

    .line 347
    .line 348
    .line 349
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 350
    .line 351
    .line 352
    const v4, -0x40f0a3d7    # -0.56f

    .line 353
    .line 354
    .line 355
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 356
    .line 357
    .line 358
    const v25, 0x3e851eb8    # 0.26f

    .line 359
    .line 360
    .line 361
    const v26, -0x40747ae1    # -1.09f

    .line 362
    .line 363
    .line 364
    const/16 v21, 0x0

    .line 365
    .line 366
    const v22, -0x4128f5c3    # -0.42f

    .line 367
    .line 368
    .line 369
    const v23, 0x3db851ec    # 0.09f

    .line 370
    .line 371
    .line 372
    const v24, -0x40b851ec    # -0.78f

    .line 373
    .line 374
    .line 375
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 376
    .line 377
    .line 378
    const v25, 0x41675c29    # 14.46f

    .line 379
    .line 380
    .line 381
    const v26, 0x4111999a    # 9.1f

    .line 382
    .line 383
    .line 384
    const v21, 0x415b0a3d    # 13.69f

    .line 385
    .line 386
    .line 387
    const v22, 0x411d999a    # 9.85f

    .line 388
    .line 389
    .line 390
    const/high16 v23, 0x41600000    # 14.0f

    .line 391
    .line 392
    const/high16 v24, 0x41180000    # 9.5f

    .line 393
    .line 394
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 395
    .line 396
    .line 397
    const v25, 0x3f30a3d7    # 0.69f

    .line 398
    .line 399
    .line 400
    const v26, -0x40c28f5c    # -0.74f

    .line 401
    .line 402
    .line 403
    const v21, 0x3ea3d70a    # 0.32f

    .line 404
    .line 405
    .line 406
    const v22, -0x416b851f    # -0.29f

    .line 407
    .line 408
    .line 409
    const v23, 0x3f0ccccd    # 0.55f

    .line 410
    .line 411
    .line 412
    const v24, -0x40f5c28f    # -0.54f

    .line 413
    .line 414
    .line 415
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 416
    .line 417
    .line 418
    const v25, 0x3e570a3d    # 0.21f

    .line 419
    .line 420
    .line 421
    const v26, -0x40c7ae14    # -0.72f

    .line 422
    .line 423
    .line 424
    const v21, 0x3e0f5c29    # 0.14f

    .line 425
    .line 426
    .line 427
    const v22, -0x41b33333    # -0.2f

    .line 428
    .line 429
    .line 430
    const v23, 0x3e570a3d    # 0.21f

    .line 431
    .line 432
    .line 433
    const v24, -0x411eb852    # -0.44f

    .line 434
    .line 435
    .line 436
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 437
    .line 438
    .line 439
    const v25, -0x4147ae14    # -0.36f

    .line 440
    .line 441
    .line 442
    const v26, -0x40a147ae    # -0.87f

    .line 443
    .line 444
    .line 445
    const/16 v21, 0x0

    .line 446
    .line 447
    const v22, -0x4147ae14    # -0.36f

    .line 448
    .line 449
    .line 450
    const v23, -0x420a3d71    # -0.12f

    .line 451
    .line 452
    .line 453
    const v24, -0x40d9999a    # -0.65f

    .line 454
    .line 455
    .line 456
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 457
    .line 458
    .line 459
    const v25, -0x40828f5c    # -0.99f

    .line 460
    .line 461
    .line 462
    const v26, -0x4151eb85    # -0.34f

    .line 463
    .line 464
    .line 465
    const v21, -0x418a3d71    # -0.24f

    .line 466
    .line 467
    .line 468
    const v22, -0x41947ae1    # -0.23f

    .line 469
    .line 470
    .line 471
    const v23, -0x40ee147b    # -0.57f

    .line 472
    .line 473
    .line 474
    const v24, -0x4151eb85    # -0.34f

    .line 475
    .line 476
    .line 477
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 478
    .line 479
    .line 480
    const v25, -0x4087ae14    # -0.97f

    .line 481
    .line 482
    .line 483
    const v26, 0x3eb851ec    # 0.36f

    .line 484
    .line 485
    .line 486
    const v21, -0x41333333    # -0.4f

    .line 487
    .line 488
    .line 489
    const/16 v22, 0x0

    .line 490
    .line 491
    const v23, -0x40c7ae14    # -0.72f

    .line 492
    .line 493
    .line 494
    const v24, 0x3df5c28f    # 0.12f

    .line 495
    .line 496
    .line 497
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 498
    .line 499
    .line 500
    const v25, -0x40f851ec    # -0.53f

    .line 501
    .line 502
    .line 503
    const v26, 0x3f5eb852    # 0.87f

    .line 504
    .line 505
    .line 506
    const/high16 v21, -0x41800000    # -0.25f

    .line 507
    .line 508
    const v22, 0x3e75c28f    # 0.24f

    .line 509
    .line 510
    .line 511
    const v23, -0x4128f5c3    # -0.42f

    .line 512
    .line 513
    .line 514
    const v24, 0x3f07ae14    # 0.53f

    .line 515
    .line 516
    .line 517
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 518
    .line 519
    .line 520
    const v4, -0x40ee147b    # -0.57f

    .line 521
    .line 522
    .line 523
    const v6, -0x4050a3d7    # -1.37f

    .line 524
    .line 525
    .line 526
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 527
    .line 528
    .line 529
    const/high16 v25, 0x3f800000    # 1.0f

    .line 530
    .line 531
    const v26, -0x40466666    # -1.45f

    .line 532
    .line 533
    .line 534
    const v21, 0x3e3851ec    # 0.18f

    .line 535
    .line 536
    .line 537
    const v22, -0x40f33333    # -0.55f

    .line 538
    .line 539
    .line 540
    const v23, 0x3f051eb8    # 0.52f

    .line 541
    .line 542
    .line 543
    const v24, -0x407c28f6    # -1.03f

    .line 544
    .line 545
    .line 546
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 547
    .line 548
    .line 549
    const v25, 0x415fd70a    # 13.99f

    .line 550
    .line 551
    .line 552
    const/high16 v26, 0x40a00000    # 5.0f

    .line 553
    .line 554
    const v21, 0x414a147b    # 12.63f

    .line 555
    .line 556
    .line 557
    const v22, 0x40a6b852    # 5.21f

    .line 558
    .line 559
    .line 560
    const/high16 v23, 0x41540000    # 13.25f

    .line 561
    .line 562
    const/high16 v24, 0x40a00000    # 5.0f

    .line 563
    .line 564
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 565
    .line 566
    .line 567
    const v25, 0x3fbeb852    # 1.49f

    .line 568
    .line 569
    .line 570
    const v26, 0x3ea8f5c3    # 0.33f

    .line 571
    .line 572
    .line 573
    const v21, 0x3f0f5c29    # 0.56f

    .line 574
    .line 575
    .line 576
    const/16 v22, 0x0

    .line 577
    .line 578
    const v23, 0x3f866666    # 1.05f

    .line 579
    .line 580
    .line 581
    const v24, 0x3de147ae    # 0.11f

    .line 582
    .line 583
    .line 584
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 585
    .line 586
    .line 587
    const v25, 0x3f828f5c    # 1.02f

    .line 588
    .line 589
    .line 590
    const v26, 0x3f6e147b    # 0.93f

    .line 591
    .line 592
    .line 593
    const v21, 0x3ee147ae    # 0.44f

    .line 594
    .line 595
    .line 596
    const v22, 0x3e6147ae    # 0.22f

    .line 597
    .line 598
    .line 599
    const v23, 0x3f47ae14    # 0.78f

    .line 600
    .line 601
    .line 602
    const v24, 0x3f07ae14    # 0.53f

    .line 603
    .line 604
    .line 605
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 606
    .line 607
    .line 608
    const v25, 0x3eb851ec    # 0.36f

    .line 609
    .line 610
    .line 611
    const v26, 0x3faa3d71    # 1.33f

    .line 612
    .line 613
    .line 614
    const v21, 0x3e75c28f    # 0.24f

    .line 615
    .line 616
    .line 617
    const v22, 0x3ecccccd    # 0.4f

    .line 618
    .line 619
    .line 620
    const v23, 0x3eb851ec    # 0.36f

    .line 621
    .line 622
    .line 623
    const v24, 0x3f570a3d    # 0.84f

    .line 624
    .line 625
    .line 626
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 627
    .line 628
    .line 629
    const v25, 0x4184147b    # 16.51f

    .line 630
    .line 631
    .line 632
    const v26, 0x410d47ae    # 8.83f

    .line 633
    .line 634
    .line 635
    const v21, 0x4186e148    # 16.86f

    .line 636
    .line 637
    .line 638
    const v22, 0x410147ae    # 8.08f

    .line 639
    .line 640
    .line 641
    const/high16 v23, 0x41860000    # 16.75f

    .line 642
    .line 643
    const v24, 0x4107d70a    # 8.49f

    .line 644
    .line 645
    .line 646
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 647
    .line 648
    .line 649
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 650
    .line 651
    .line 652
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 653
    .line 654
    .line 655
    move-result-object v2

    .line 656
    const/16 v16, 0x3800

    .line 657
    .line 658
    const/16 v17, 0x0

    .line 659
    .line 660
    const v6, 0x3e99999a    # 0.3f

    .line 661
    .line 662
    .line 663
    const v8, 0x3e99999a    # 0.3f

    .line 664
    .line 665
    .line 666
    const/4 v7, 0x0

    .line 667
    const/high16 v9, 0x3f800000    # 1.0f

    .line 668
    .line 669
    const/high16 v12, 0x3f800000    # 1.0f

    .line 670
    .line 671
    const/4 v13, 0x0

    .line 672
    const/4 v14, 0x0

    .line 673
    const/4 v15, 0x0

    .line 674
    const-string v4, ""

    .line 675
    .line 676
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 677
    .line 678
    .line 679
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 680
    .line 681
    .line 682
    move-result v3

    .line 683
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 684
    .line 685
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 686
    .line 687
    .line 688
    move-result-wide v6

    .line 689
    const/4 v0, 0x0

    .line 690
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 691
    .line 692
    .line 693
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 694
    .line 695
    .line 696
    move-result v10

    .line 697
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 698
    .line 699
    .line 700
    move-result v11

    .line 701
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 702
    .line 703
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 704
    .line 705
    .line 706
    const/high16 v0, 0x40c00000    # 6.0f

    .line 707
    .line 708
    const/high16 v2, 0x40800000    # 4.0f

    .line 709
    .line 710
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 711
    .line 712
    .line 713
    const/high16 v0, 0x40000000    # 2.0f

    .line 714
    .line 715
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 716
    .line 717
    .line 718
    const/high16 v0, 0x41600000    # 14.0f

    .line 719
    .line 720
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 721
    .line 722
    .line 723
    const/high16 v17, 0x40000000    # 2.0f

    .line 724
    .line 725
    const/high16 v18, 0x40000000    # 2.0f

    .line 726
    .line 727
    const v14, 0x3f8ccccd    # 1.1f

    .line 728
    .line 729
    .line 730
    const v15, 0x3f666666    # 0.9f

    .line 731
    .line 732
    .line 733
    const/high16 v16, 0x40000000    # 2.0f

    .line 734
    .line 735
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 736
    .line 737
    .line 738
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 739
    .line 740
    .line 741
    const/high16 v0, -0x40000000    # -2.0f

    .line 742
    .line 743
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 744
    .line 745
    .line 746
    const/high16 v0, 0x40800000    # 4.0f

    .line 747
    .line 748
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 749
    .line 750
    .line 751
    const/high16 v0, 0x40c00000    # 6.0f

    .line 752
    .line 753
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 754
    .line 755
    .line 756
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 757
    .line 758
    .line 759
    const/high16 v0, 0x41a00000    # 20.0f

    .line 760
    .line 761
    const/high16 v2, 0x40000000    # 2.0f

    .line 762
    .line 763
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 764
    .line 765
    .line 766
    const/high16 v0, 0x41000000    # 8.0f

    .line 767
    .line 768
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 769
    .line 770
    .line 771
    const/high16 v17, 0x40c00000    # 6.0f

    .line 772
    .line 773
    const/high16 v18, 0x40800000    # 4.0f

    .line 774
    .line 775
    const v13, 0x40dccccd    # 6.9f

    .line 776
    .line 777
    .line 778
    const/high16 v14, 0x40000000    # 2.0f

    .line 779
    .line 780
    const/high16 v15, 0x40c00000    # 6.0f

    .line 781
    .line 782
    const v16, 0x4039999a    # 2.9f

    .line 783
    .line 784
    .line 785
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 786
    .line 787
    .line 788
    const/high16 v0, 0x41400000    # 12.0f

    .line 789
    .line 790
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 791
    .line 792
    .line 793
    const/high16 v17, 0x40000000    # 2.0f

    .line 794
    .line 795
    const/high16 v18, 0x40000000    # 2.0f

    .line 796
    .line 797
    const/4 v13, 0x0

    .line 798
    const v14, 0x3f8ccccd    # 1.1f

    .line 799
    .line 800
    .line 801
    const v15, 0x3f666666    # 0.9f

    .line 802
    .line 803
    .line 804
    const/high16 v16, 0x40000000    # 2.0f

    .line 805
    .line 806
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 807
    .line 808
    .line 809
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 810
    .line 811
    .line 812
    const/high16 v18, -0x40000000    # -2.0f

    .line 813
    .line 814
    const v13, 0x3f8ccccd    # 1.1f

    .line 815
    .line 816
    .line 817
    const/4 v14, 0x0

    .line 818
    const/high16 v15, 0x40000000    # 2.0f

    .line 819
    .line 820
    const v16, -0x4099999a    # -0.9f

    .line 821
    .line 822
    .line 823
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 824
    .line 825
    .line 826
    const/high16 v0, 0x40800000    # 4.0f

    .line 827
    .line 828
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 829
    .line 830
    .line 831
    const/high16 v17, 0x41a00000    # 20.0f

    .line 832
    .line 833
    const/high16 v18, 0x40000000    # 2.0f

    .line 834
    .line 835
    const/high16 v13, 0x41b00000    # 22.0f

    .line 836
    .line 837
    const v14, 0x4039999a    # 2.9f

    .line 838
    .line 839
    .line 840
    const v15, 0x41a8cccd    # 21.1f

    .line 841
    .line 842
    .line 843
    const/high16 v16, 0x40000000    # 2.0f

    .line 844
    .line 845
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 846
    .line 847
    .line 848
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 849
    .line 850
    .line 851
    const/high16 v0, 0x41800000    # 16.0f

    .line 852
    .line 853
    const/high16 v2, 0x41a00000    # 20.0f

    .line 854
    .line 855
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 856
    .line 857
    .line 858
    const/high16 v0, 0x41000000    # 8.0f

    .line 859
    .line 860
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 861
    .line 862
    .line 863
    const/high16 v0, 0x40800000    # 4.0f

    .line 864
    .line 865
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 866
    .line 867
    .line 868
    const/high16 v0, 0x41400000    # 12.0f

    .line 869
    .line 870
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 871
    .line 872
    .line 873
    const/high16 v0, 0x41800000    # 16.0f

    .line 874
    .line 875
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 876
    .line 877
    .line 878
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 879
    .line 880
    .line 881
    const v0, 0x415828f6    # 13.51f

    .line 882
    .line 883
    .line 884
    const v2, 0x41228f5c    # 10.16f

    .line 885
    .line 886
    .line 887
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 888
    .line 889
    .line 890
    const v17, 0x3fd0a3d7    # 1.63f

    .line 891
    .line 892
    .line 893
    const v18, -0x4019999a    # -1.8f

    .line 894
    .line 895
    .line 896
    const v13, 0x3ed1eb85    # 0.41f

    .line 897
    .line 898
    .line 899
    const v14, -0x40c51eb8    # -0.73f

    .line 900
    .line 901
    .line 902
    const v15, 0x3f970a3d    # 1.18f

    .line 903
    .line 904
    .line 905
    const v16, -0x406b851f    # -1.16f

    .line 906
    .line 907
    .line 908
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 909
    .line 910
    .line 911
    const v17, -0x406e147b    # -1.14f

    .line 912
    .line 913
    .line 914
    const v18, -0x4007ae14    # -1.94f

    .line 915
    .line 916
    .line 917
    const v13, 0x3ef5c28f    # 0.48f

    .line 918
    .line 919
    .line 920
    const v14, -0x40d1eb85    # -0.68f

    .line 921
    .line 922
    .line 923
    const v15, 0x3e570a3d    # 0.21f

    .line 924
    .line 925
    .line 926
    const v16, -0x4007ae14    # -1.94f

    .line 927
    .line 928
    .line 929
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 930
    .line 931
    .line 932
    const/high16 v17, -0x40400000    # -1.5f

    .line 933
    .line 934
    const v18, 0x3f9d70a4    # 1.23f

    .line 935
    .line 936
    .line 937
    const v13, -0x409eb852    # -0.88f

    .line 938
    .line 939
    .line 940
    const/4 v14, 0x0

    .line 941
    const v15, -0x40570a3d    # -1.32f

    .line 942
    .line 943
    .line 944
    const v16, 0x3f2b851f    # 0.67f

    .line 945
    .line 946
    .line 947
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 948
    .line 949
    .line 950
    const v0, -0x40ee147b    # -0.57f

    .line 951
    .line 952
    .line 953
    const v2, -0x4050a3d7    # -1.37f

    .line 954
    .line 955
    .line 956
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 957
    .line 958
    .line 959
    const v17, 0x415fd70a    # 13.99f

    .line 960
    .line 961
    .line 962
    const/high16 v18, 0x40a00000    # 5.0f

    .line 963
    .line 964
    const v13, 0x413828f6    # 11.51f

    .line 965
    .line 966
    .line 967
    const v14, 0x40beb852    # 5.96f

    .line 968
    .line 969
    .line 970
    const v15, 0x414851ec    # 12.52f

    .line 971
    .line 972
    .line 973
    const/high16 v16, 0x40a00000    # 5.0f

    .line 974
    .line 975
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 976
    .line 977
    .line 978
    const v17, 0x4020a3d7    # 2.51f

    .line 979
    .line 980
    .line 981
    const v18, 0x3fa147ae    # 1.26f

    .line 982
    .line 983
    .line 984
    const v13, 0x3f9d70a4    # 1.23f

    .line 985
    .line 986
    .line 987
    const/4 v14, 0x0

    .line 988
    const v15, 0x40051eb8    # 2.08f

    .line 989
    .line 990
    .line 991
    const v16, 0x3f0f5c29    # 0.56f

    .line 992
    .line 993
    .line 994
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 995
    .line 996
    .line 997
    const v17, 0x3c23d70a    # 0.01f

    .line 998
    .line 999
    .line 1000
    const v18, 0x40247ae1    # 2.57f

    .line 1001
    .line 1002
    .line 1003
    const v13, 0x3ebd70a4    # 0.37f

    .line 1004
    .line 1005
    .line 1006
    const v14, 0x3f19999a    # 0.6f

    .line 1007
    .line 1008
    .line 1009
    const v15, 0x3f147ae1    # 0.58f

    .line 1010
    .line 1011
    .line 1012
    const v16, 0x3fdd70a4    # 1.73f

    .line 1013
    .line 1014
    .line 1015
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1016
    .line 1017
    .line 1018
    const v17, -0x403851ec    # -1.56f

    .line 1019
    .line 1020
    .line 1021
    const v18, 0x3fe7ae14    # 1.81f

    .line 1022
    .line 1023
    .line 1024
    const v13, -0x40deb852    # -0.63f

    .line 1025
    .line 1026
    .line 1027
    const v14, 0x3f6e147b    # 0.93f

    .line 1028
    .line 1029
    .line 1030
    const v15, -0x40628f5c    # -1.23f

    .line 1031
    .line 1032
    .line 1033
    const v16, 0x3f9ae148    # 1.21f

    .line 1034
    .line 1035
    .line 1036
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1037
    .line 1038
    .line 1039
    const v17, -0x41c7ae14    # -0.18f

    .line 1040
    .line 1041
    .line 1042
    const v18, 0x3f970a3d    # 1.18f

    .line 1043
    .line 1044
    .line 1045
    const v13, -0x41fae148    # -0.13f

    .line 1046
    .line 1047
    .line 1048
    const v14, 0x3e75c28f    # 0.24f

    .line 1049
    .line 1050
    .line 1051
    const v15, -0x41c7ae14    # -0.18f

    .line 1052
    .line 1053
    .line 1054
    const v16, 0x3ecccccd    # 0.4f

    .line 1055
    .line 1056
    .line 1057
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1058
    .line 1059
    .line 1060
    const v0, -0x403d70a4    # -1.52f

    .line 1061
    .line 1062
    .line 1063
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1064
    .line 1065
    .line 1066
    const v17, 0x415828f6    # 13.51f

    .line 1067
    .line 1068
    .line 1069
    const v18, 0x41228f5c    # 10.16f

    .line 1070
    .line 1071
    .line 1072
    const v13, 0x415428f6    # 13.26f

    .line 1073
    .line 1074
    .line 1075
    const v14, 0x41368f5c    # 11.41f

    .line 1076
    .line 1077
    .line 1078
    const v15, 0x41530a3d    # 13.19f

    .line 1079
    .line 1080
    .line 1081
    const v16, 0x412bd70a    # 10.74f

    .line 1082
    .line 1083
    .line 1084
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1085
    .line 1086
    .line 1087
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1088
    .line 1089
    .line 1090
    const v0, 0x414f3333    # 12.95f

    .line 1091
    .line 1092
    .line 1093
    const v2, 0x415f3333    # 13.95f

    .line 1094
    .line 1095
    .line 1096
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1097
    .line 1098
    .line 1099
    const v17, 0x3f866666    # 1.05f

    .line 1100
    .line 1101
    .line 1102
    const v18, -0x407ae148    # -1.04f

    .line 1103
    .line 1104
    .line 1105
    const/4 v13, 0x0

    .line 1106
    const v14, -0x40e8f5c3    # -0.59f

    .line 1107
    .line 1108
    .line 1109
    const v15, 0x3ef0a3d7    # 0.47f

    .line 1110
    .line 1111
    .line 1112
    const v16, -0x407ae148    # -1.04f

    .line 1113
    .line 1114
    .line 1115
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1116
    .line 1117
    .line 1118
    const v17, 0x3f851eb8    # 1.04f

    .line 1119
    .line 1120
    .line 1121
    const v18, 0x3f851eb8    # 1.04f

    .line 1122
    .line 1123
    .line 1124
    const v13, 0x3f170a3d    # 0.59f

    .line 1125
    .line 1126
    .line 1127
    const/4 v14, 0x0

    .line 1128
    const v15, 0x3f851eb8    # 1.04f

    .line 1129
    .line 1130
    .line 1131
    const v16, 0x3ee66666    # 0.45f

    .line 1132
    .line 1133
    .line 1134
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1135
    .line 1136
    .line 1137
    const v17, -0x407ae148    # -1.04f

    .line 1138
    .line 1139
    .line 1140
    const v18, 0x3f866666    # 1.05f

    .line 1141
    .line 1142
    .line 1143
    const/4 v13, 0x0

    .line 1144
    const v14, 0x3f147ae1    # 0.58f

    .line 1145
    .line 1146
    .line 1147
    const v15, -0x411eb852    # -0.44f

    .line 1148
    .line 1149
    .line 1150
    const v16, 0x3f866666    # 1.05f

    .line 1151
    .line 1152
    .line 1153
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1154
    .line 1155
    .line 1156
    const v17, 0x414f3333    # 12.95f

    .line 1157
    .line 1158
    .line 1159
    const v18, 0x415f3333    # 13.95f

    .line 1160
    .line 1161
    .line 1162
    const v13, 0x4156b852    # 13.42f

    .line 1163
    .line 1164
    .line 1165
    const/high16 v14, 0x41700000    # 15.0f

    .line 1166
    .line 1167
    const v15, 0x414f3333    # 12.95f

    .line 1168
    .line 1169
    .line 1170
    const v16, 0x41687ae1    # 14.53f

    .line 1171
    .line 1172
    .line 1173
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1174
    .line 1175
    .line 1176
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1177
    .line 1178
    .line 1179
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 1180
    .line 1181
    .line 1182
    move-result-object v2

    .line 1183
    const/16 v16, 0x3800

    .line 1184
    .line 1185
    const/16 v17, 0x0

    .line 1186
    .line 1187
    const/high16 v6, 0x3f800000    # 1.0f

    .line 1188
    .line 1189
    const/high16 v8, 0x3f800000    # 1.0f

    .line 1190
    .line 1191
    const/4 v7, 0x0

    .line 1192
    const/high16 v12, 0x3f800000    # 1.0f

    .line 1193
    .line 1194
    const/4 v13, 0x0

    .line 1195
    const/4 v14, 0x0

    .line 1196
    const/4 v15, 0x0

    .line 1197
    const-string v4, ""

    .line 1198
    .line 1199
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 1200
    .line 1201
    .line 1202
    move-result-object v0

    .line 1203
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1204
    .line 1205
    .line 1206
    move-result-object v0

    .line 1207
    sput-object v0, Landroidx/compose/material/icons/twotone/QuizKt;->_quiz:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1208
    .line 1209
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 1210
    .line 1211
    .line 1212
    return-object v0
.end method
