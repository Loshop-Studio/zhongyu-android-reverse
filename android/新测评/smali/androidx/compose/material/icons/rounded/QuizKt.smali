.class public final Landroidx/compose/material/icons/rounded/QuizKt;
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
        "Landroidx/compose/material/icons/Icons$Rounded;",
        "getQuiz",
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
        "SMAP\nQuiz.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Quiz.kt\nandroidx/compose/material/icons/rounded/QuizKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,83:1\n212#2,12:84\n233#2,18:97\n253#2:134\n233#2,18:135\n253#2:172\n174#3:96\n705#4,2:115\n717#4,2:117\n719#4,11:123\n705#4,2:153\n717#4,2:155\n719#4,11:161\n72#5,4:119\n72#5,4:157\n*S KotlinDebug\n*F\n+ 1 Quiz.kt\nandroidx/compose/material/icons/rounded/QuizKt\n*L\n29#1:84,12\n30#1:97,18\n30#1:134\n43#1:135,18\n43#1:172\n29#1:96\n30#1:115,2\n30#1:117,2\n30#1:123,11\n43#1:153,2\n43#1:155,2\n43#1:161,11\n30#1:119,4\n43#1:157,4\n*E\n"
    }
.end annotation


# static fields
.field private static _quiz:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getQuiz(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/QuizKt;->_quiz:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.Quiz"

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
    const/high16 v4, 0x41880000    # 17.0f

    .line 71
    .line 72
    const/high16 v6, 0x41a00000    # 20.0f

    .line 73
    .line 74
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v4, 0x40800000    # 4.0f

    .line 78
    .line 79
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 80
    .line 81
    .line 82
    const/high16 v4, 0x40e00000    # 7.0f

    .line 83
    .line 84
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 85
    .line 86
    .line 87
    const/high16 v25, -0x40800000    # -1.0f

    .line 88
    .line 89
    const/high16 v26, -0x40800000    # -1.0f

    .line 90
    .line 91
    const/16 v21, 0x0

    .line 92
    .line 93
    const v22, -0x40f33333    # -0.55f

    .line 94
    .line 95
    .line 96
    const v23, -0x4119999a    # -0.45f

    .line 97
    .line 98
    .line 99
    const/high16 v24, -0x40800000    # -1.0f

    .line 100
    .line 101
    move-object/from16 v20, v2

    .line 102
    .line 103
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 104
    .line 105
    .line 106
    const v4, 0x40ce6666    # 6.45f

    .line 107
    .line 108
    .line 109
    const/high16 v6, 0x40e00000    # 7.0f

    .line 110
    .line 111
    const/high16 v7, 0x40000000    # 2.0f

    .line 112
    .line 113
    invoke-virtual {v2, v7, v4, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 114
    .line 115
    .line 116
    const/high16 v4, 0x41500000    # 13.0f

    .line 117
    .line 118
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 119
    .line 120
    .line 121
    const/high16 v25, 0x40000000    # 2.0f

    .line 122
    .line 123
    const/high16 v26, 0x40000000    # 2.0f

    .line 124
    .line 125
    const v22, 0x3f8ccccd    # 1.1f

    .line 126
    .line 127
    .line 128
    const v23, 0x3f666666    # 0.9f

    .line 129
    .line 130
    .line 131
    const/high16 v24, 0x40000000    # 2.0f

    .line 132
    .line 133
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 134
    .line 135
    .line 136
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 137
    .line 138
    .line 139
    const/high16 v25, 0x3f800000    # 1.0f

    .line 140
    .line 141
    const/high16 v26, -0x40800000    # -1.0f

    .line 142
    .line 143
    const v21, 0x3f0ccccd    # 0.55f

    .line 144
    .line 145
    .line 146
    const/16 v22, 0x0

    .line 147
    .line 148
    const/high16 v23, 0x3f800000    # 1.0f

    .line 149
    .line 150
    const v24, -0x4119999a    # -0.45f

    .line 151
    .line 152
    .line 153
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 154
    .line 155
    .line 156
    const v4, 0x418c6666    # 17.55f

    .line 157
    .line 158
    .line 159
    const/high16 v6, 0x41880000    # 17.0f

    .line 160
    .line 161
    const/high16 v7, 0x41a00000    # 20.0f

    .line 162
    .line 163
    invoke-virtual {v2, v4, v7, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 164
    .line 165
    .line 166
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 167
    .line 168
    .line 169
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 170
    .line 171
    .line 172
    move-result-object v2

    .line 173
    const/16 v16, 0x3800

    .line 174
    .line 175
    const/16 v17, 0x0

    .line 176
    .line 177
    const/high16 v6, 0x3f800000    # 1.0f

    .line 178
    .line 179
    const/high16 v8, 0x3f800000    # 1.0f

    .line 180
    .line 181
    const/4 v7, 0x0

    .line 182
    const/high16 v9, 0x3f800000    # 1.0f

    .line 183
    .line 184
    const/high16 v12, 0x3f800000    # 1.0f

    .line 185
    .line 186
    const/4 v13, 0x0

    .line 187
    const/4 v14, 0x0

    .line 188
    const/4 v15, 0x0

    .line 189
    const-string v4, ""

    .line 190
    .line 191
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 192
    .line 193
    .line 194
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 195
    .line 196
    .line 197
    move-result v3

    .line 198
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 199
    .line 200
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 201
    .line 202
    .line 203
    move-result-wide v6

    .line 204
    const/4 v0, 0x0

    .line 205
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 206
    .line 207
    .line 208
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 209
    .line 210
    .line 211
    move-result v10

    .line 212
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 213
    .line 214
    .line 215
    move-result v11

    .line 216
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 217
    .line 218
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 219
    .line 220
    .line 221
    const/high16 v0, 0x40000000    # 2.0f

    .line 222
    .line 223
    const/high16 v2, 0x41a00000    # 20.0f

    .line 224
    .line 225
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 226
    .line 227
    .line 228
    const/high16 v0, 0x41000000    # 8.0f

    .line 229
    .line 230
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 231
    .line 232
    .line 233
    const/high16 v17, 0x40c00000    # 6.0f

    .line 234
    .line 235
    const/high16 v18, 0x40800000    # 4.0f

    .line 236
    .line 237
    const v13, 0x40dccccd    # 6.9f

    .line 238
    .line 239
    .line 240
    const/high16 v14, 0x40000000    # 2.0f

    .line 241
    .line 242
    const/high16 v15, 0x40c00000    # 6.0f

    .line 243
    .line 244
    const v16, 0x4039999a    # 2.9f

    .line 245
    .line 246
    .line 247
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 248
    .line 249
    .line 250
    const/high16 v0, 0x41400000    # 12.0f

    .line 251
    .line 252
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 253
    .line 254
    .line 255
    const/high16 v17, 0x40000000    # 2.0f

    .line 256
    .line 257
    const/high16 v18, 0x40000000    # 2.0f

    .line 258
    .line 259
    const/4 v13, 0x0

    .line 260
    const v14, 0x3f8ccccd    # 1.1f

    .line 261
    .line 262
    .line 263
    const v15, 0x3f666666    # 0.9f

    .line 264
    .line 265
    .line 266
    const/high16 v16, 0x40000000    # 2.0f

    .line 267
    .line 268
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 269
    .line 270
    .line 271
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 272
    .line 273
    .line 274
    const/high16 v18, -0x40000000    # -2.0f

    .line 275
    .line 276
    const v13, 0x3f8ccccd    # 1.1f

    .line 277
    .line 278
    .line 279
    const/4 v14, 0x0

    .line 280
    const/high16 v15, 0x40000000    # 2.0f

    .line 281
    .line 282
    const v16, -0x4099999a    # -0.9f

    .line 283
    .line 284
    .line 285
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 286
    .line 287
    .line 288
    const/high16 v0, 0x40800000    # 4.0f

    .line 289
    .line 290
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 291
    .line 292
    .line 293
    const/high16 v17, 0x41a00000    # 20.0f

    .line 294
    .line 295
    const/high16 v18, 0x40000000    # 2.0f

    .line 296
    .line 297
    const/high16 v13, 0x41b00000    # 22.0f

    .line 298
    .line 299
    const v14, 0x4039999a    # 2.9f

    .line 300
    .line 301
    .line 302
    const v15, 0x41a8cccd    # 21.1f

    .line 303
    .line 304
    .line 305
    const/high16 v16, 0x40000000    # 2.0f

    .line 306
    .line 307
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 308
    .line 309
    .line 310
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 311
    .line 312
    .line 313
    const v0, 0x416028f6    # 14.01f

    .line 314
    .line 315
    .line 316
    const/high16 v2, 0x41700000    # 15.0f

    .line 317
    .line 318
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 319
    .line 320
    .line 321
    const v17, -0x4079999a    # -1.05f

    .line 322
    .line 323
    .line 324
    const v18, -0x4079999a    # -1.05f

    .line 325
    .line 326
    .line 327
    const v13, -0x40e8f5c3    # -0.59f

    .line 328
    .line 329
    .line 330
    const/4 v14, 0x0

    .line 331
    const v15, -0x4079999a    # -1.05f

    .line 332
    .line 333
    .line 334
    const v16, -0x410f5c29    # -0.47f

    .line 335
    .line 336
    .line 337
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 338
    .line 339
    .line 340
    const v17, 0x3f866666    # 1.05f

    .line 341
    .line 342
    .line 343
    const v18, -0x407ae148    # -1.04f

    .line 344
    .line 345
    .line 346
    const/4 v13, 0x0

    .line 347
    const v14, -0x40e8f5c3    # -0.59f

    .line 348
    .line 349
    .line 350
    const v15, 0x3ef0a3d7    # 0.47f

    .line 351
    .line 352
    .line 353
    const v16, -0x407ae148    # -1.04f

    .line 354
    .line 355
    .line 356
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 357
    .line 358
    .line 359
    const v17, 0x3f851eb8    # 1.04f

    .line 360
    .line 361
    .line 362
    const v18, 0x3f851eb8    # 1.04f

    .line 363
    .line 364
    .line 365
    const v13, 0x3f170a3d    # 0.59f

    .line 366
    .line 367
    .line 368
    const/4 v14, 0x0

    .line 369
    const v15, 0x3f851eb8    # 1.04f

    .line 370
    .line 371
    .line 372
    const v16, 0x3ee66666    # 0.45f

    .line 373
    .line 374
    .line 375
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 376
    .line 377
    .line 378
    const v17, 0x416028f6    # 14.01f

    .line 379
    .line 380
    .line 381
    const/high16 v18, 0x41700000    # 15.0f

    .line 382
    .line 383
    const v13, 0x4170a3d7    # 15.04f

    .line 384
    .line 385
    .line 386
    const v14, 0x41687ae1    # 14.53f

    .line 387
    .line 388
    .line 389
    const v15, 0x4169999a    # 14.6f

    .line 390
    .line 391
    .line 392
    const/high16 v16, 0x41700000    # 15.0f

    .line 393
    .line 394
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 395
    .line 396
    .line 397
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 398
    .line 399
    .line 400
    const v0, 0x4184147b    # 16.51f

    .line 401
    .line 402
    .line 403
    const v2, 0x410d47ae    # 8.83f

    .line 404
    .line 405
    .line 406
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 407
    .line 408
    .line 409
    const v17, -0x403851ec    # -1.56f

    .line 410
    .line 411
    .line 412
    const v18, 0x3fe7ae14    # 1.81f

    .line 413
    .line 414
    .line 415
    const v13, -0x40deb852    # -0.63f

    .line 416
    .line 417
    .line 418
    const v14, 0x3f6e147b    # 0.93f

    .line 419
    .line 420
    .line 421
    const v15, -0x40628f5c    # -1.23f

    .line 422
    .line 423
    .line 424
    const v16, 0x3f9ae148    # 1.21f

    .line 425
    .line 426
    .line 427
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 428
    .line 429
    .line 430
    const v17, -0x41dc28f6    # -0.16f

    .line 431
    .line 432
    .line 433
    const v18, 0x3efae148    # 0.49f

    .line 434
    .line 435
    .line 436
    const v13, -0x425c28f6    # -0.08f

    .line 437
    .line 438
    .line 439
    const v14, 0x3e0f5c29    # 0.14f

    .line 440
    .line 441
    .line 442
    const v15, -0x41fae148    # -0.13f

    .line 443
    .line 444
    .line 445
    const v16, 0x3e851eb8    # 0.26f

    .line 446
    .line 447
    .line 448
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 449
    .line 450
    .line 451
    const/high16 v17, -0x40c00000    # -0.75f

    .line 452
    .line 453
    const v18, 0x3f2e147b    # 0.68f

    .line 454
    .line 455
    .line 456
    const v13, -0x42b33333    # -0.05f

    .line 457
    .line 458
    .line 459
    const v14, 0x3ec7ae14    # 0.39f

    .line 460
    .line 461
    .line 462
    const v15, -0x4147ae14    # -0.36f

    .line 463
    .line 464
    .line 465
    const v16, 0x3f2e147b    # 0.68f

    .line 466
    .line 467
    .line 468
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 469
    .line 470
    .line 471
    const v0, -0x430a3d71    # -0.03f

    .line 472
    .line 473
    .line 474
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 475
    .line 476
    .line 477
    const v18, -0x40ae147b    # -0.82f

    .line 478
    .line 479
    .line 480
    const v13, -0x411eb852    # -0.44f

    .line 481
    .line 482
    .line 483
    const/4 v14, 0x0

    .line 484
    const v15, -0x40b5c28f    # -0.79f

    .line 485
    .line 486
    .line 487
    const v16, -0x413d70a4    # -0.38f

    .line 488
    .line 489
    .line 490
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 491
    .line 492
    .line 493
    const/high16 v17, 0x3e800000    # 0.25f

    .line 494
    .line 495
    const v18, -0x40a8f5c3    # -0.84f

    .line 496
    .line 497
    .line 498
    const v13, 0x3cf5c28f    # 0.03f

    .line 499
    .line 500
    .line 501
    const v14, -0x4170a3d7    # -0.28f

    .line 502
    .line 503
    .line 504
    const v15, 0x3db851ec    # 0.09f

    .line 505
    .line 506
    .line 507
    const v16, -0x40ee147b    # -0.57f

    .line 508
    .line 509
    .line 510
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 511
    .line 512
    .line 513
    const v17, 0x3fd0a3d7    # 1.63f

    .line 514
    .line 515
    .line 516
    const v18, -0x4019999a    # -1.8f

    .line 517
    .line 518
    .line 519
    const v13, 0x3ed1eb85    # 0.41f

    .line 520
    .line 521
    .line 522
    const v14, -0x40c51eb8    # -0.73f

    .line 523
    .line 524
    .line 525
    const v15, 0x3f970a3d    # 1.18f

    .line 526
    .line 527
    .line 528
    const v16, -0x406b851f    # -1.16f

    .line 529
    .line 530
    .line 531
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 532
    .line 533
    .line 534
    const v17, -0x406e147b    # -1.14f

    .line 535
    .line 536
    .line 537
    const v18, -0x4007ae14    # -1.94f

    .line 538
    .line 539
    .line 540
    const v13, 0x3ef5c28f    # 0.48f

    .line 541
    .line 542
    .line 543
    const v14, -0x40d1eb85    # -0.68f

    .line 544
    .line 545
    .line 546
    const v15, 0x3e570a3d    # 0.21f

    .line 547
    .line 548
    .line 549
    const v16, -0x4007ae14    # -1.94f

    .line 550
    .line 551
    .line 552
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 553
    .line 554
    .line 555
    const v17, -0x405eb852    # -1.26f

    .line 556
    .line 557
    .line 558
    const v18, 0x3f333333    # 0.7f

    .line 559
    .line 560
    .line 561
    const v13, -0x40e3d70a    # -0.61f

    .line 562
    .line 563
    .line 564
    const/4 v14, 0x0

    .line 565
    const v15, -0x407eb852    # -1.01f

    .line 566
    .line 567
    .line 568
    const v16, 0x3ea3d70a    # 0.32f

    .line 569
    .line 570
    .line 571
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 572
    .line 573
    .line 574
    const v17, -0x409c28f6    # -0.89f

    .line 575
    .line 576
    .line 577
    const/high16 v18, 0x3e800000    # 0.25f

    .line 578
    .line 579
    const v13, -0x41bd70a4    # -0.19f

    .line 580
    .line 581
    .line 582
    const v14, 0x3e947ae1    # 0.29f

    .line 583
    .line 584
    .line 585
    const v15, -0x40ee147b    # -0.57f

    .line 586
    .line 587
    .line 588
    const v16, 0x3ec7ae14    # 0.39f

    .line 589
    .line 590
    .line 591
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 592
    .line 593
    .line 594
    const/4 v0, 0x0

    .line 595
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 596
    .line 597
    .line 598
    const v17, -0x4151eb85    # -0.34f

    .line 599
    .line 600
    .line 601
    const v18, -0x40770a3d    # -1.07f

    .line 602
    .line 603
    .line 604
    const v13, -0x4128f5c3    # -0.42f

    .line 605
    .line 606
    .line 607
    const v14, -0x41c7ae14    # -0.18f

    .line 608
    .line 609
    .line 610
    const v15, -0x40e66666    # -0.6f

    .line 611
    .line 612
    .line 613
    const v16, -0x40cccccd    # -0.7f

    .line 614
    .line 615
    .line 616
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 617
    .line 618
    .line 619
    const v17, 0x415fd70a    # 13.99f

    .line 620
    .line 621
    .line 622
    const/high16 v18, 0x40a00000    # 5.0f

    .line 623
    .line 624
    const v13, 0x414051ec    # 12.02f

    .line 625
    .line 626
    .line 627
    const v14, 0x40b1999a    # 5.55f

    .line 628
    .line 629
    .line 630
    const v15, 0x414deb85    # 12.87f

    .line 631
    .line 632
    .line 633
    const/high16 v16, 0x40a00000    # 5.0f

    .line 634
    .line 635
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 636
    .line 637
    .line 638
    const v17, 0x4020a3d7    # 2.51f

    .line 639
    .line 640
    .line 641
    const v18, 0x3fa147ae    # 1.26f

    .line 642
    .line 643
    .line 644
    const v13, 0x3f9d70a4    # 1.23f

    .line 645
    .line 646
    .line 647
    const/4 v14, 0x0

    .line 648
    const v15, 0x40051eb8    # 2.08f

    .line 649
    .line 650
    .line 651
    const v16, 0x3f0f5c29    # 0.56f

    .line 652
    .line 653
    .line 654
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 655
    .line 656
    .line 657
    const v17, 0x4184147b    # 16.51f

    .line 658
    .line 659
    .line 660
    const v18, 0x410d47ae    # 8.83f

    .line 661
    .line 662
    .line 663
    const v13, 0x4186f5c3    # 16.87f

    .line 664
    .line 665
    .line 666
    const v14, 0x40dbd70a    # 6.87f

    .line 667
    .line 668
    .line 669
    const v15, 0x4188a3d7    # 17.08f

    .line 670
    .line 671
    .line 672
    const v16, 0x40ffae14    # 7.99f

    .line 673
    .line 674
    .line 675
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 676
    .line 677
    .line 678
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 679
    .line 680
    .line 681
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 682
    .line 683
    .line 684
    move-result-object v2

    .line 685
    const/16 v16, 0x3800

    .line 686
    .line 687
    const/16 v17, 0x0

    .line 688
    .line 689
    const/high16 v6, 0x3f800000    # 1.0f

    .line 690
    .line 691
    const/4 v7, 0x0

    .line 692
    const/high16 v12, 0x3f800000    # 1.0f

    .line 693
    .line 694
    const/4 v13, 0x0

    .line 695
    const/4 v14, 0x0

    .line 696
    const/4 v15, 0x0

    .line 697
    const-string v4, ""

    .line 698
    .line 699
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 700
    .line 701
    .line 702
    move-result-object v0

    .line 703
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 704
    .line 705
    .line 706
    move-result-object v0

    .line 707
    sput-object v0, Landroidx/compose/material/icons/rounded/QuizKt;->_quiz:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 708
    .line 709
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 710
    .line 711
    .line 712
    return-object v0
.end method
