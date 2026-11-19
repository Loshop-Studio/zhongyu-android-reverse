.class public final Landroidx/compose/material/icons/rounded/UnfoldMoreDoubleKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_unfoldMoreDouble",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "UnfoldMoreDouble",
        "Landroidx/compose/material/icons/Icons$Rounded;",
        "getUnfoldMoreDouble",
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
        "SMAP\nUnfoldMoreDouble.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UnfoldMoreDouble.kt\nandroidx/compose/material/icons/rounded/UnfoldMoreDoubleKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,87:1\n212#2,12:88\n233#2,18:101\n253#2:138\n233#2,18:139\n253#2:176\n233#2,18:177\n253#2:214\n233#2,18:215\n253#2:252\n174#3:100\n705#4,2:119\n717#4,2:121\n719#4,11:127\n705#4,2:157\n717#4,2:159\n719#4,11:165\n705#4,2:195\n717#4,2:197\n719#4,11:203\n705#4,2:233\n717#4,2:235\n719#4,11:241\n72#5,4:123\n72#5,4:161\n72#5,4:199\n72#5,4:237\n*S KotlinDebug\n*F\n+ 1 UnfoldMoreDouble.kt\nandroidx/compose/material/icons/rounded/UnfoldMoreDoubleKt\n*L\n29#1:88,12\n30#1:101,18\n30#1:138\n43#1:139,18\n43#1:176\n56#1:177,18\n56#1:214\n69#1:215,18\n69#1:252\n29#1:100\n30#1:119,2\n30#1:121,2\n30#1:127,11\n43#1:157,2\n43#1:159,2\n43#1:165,11\n56#1:195,2\n56#1:197,2\n56#1:203,11\n69#1:233,2\n69#1:235,2\n69#1:241,11\n30#1:123,4\n43#1:161,4\n56#1:199,4\n69#1:237,4\n*E\n"
    }
.end annotation


# static fields
.field private static _unfoldMoreDouble:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getUnfoldMoreDouble(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/UnfoldMoreDoubleKt;->_unfoldMoreDouble:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.UnfoldMoreDouble"

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
    const v4, 0x40a947ae    # 5.29f

    .line 71
    .line 72
    .line 73
    const v6, 0x41187ae1    # 9.53f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v4, 0x40351eb8    # 2.83f

    .line 80
    .line 81
    .line 82
    const/high16 v6, 0x41400000    # 12.0f

    .line 83
    .line 84
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 85
    .line 86
    .line 87
    const v4, 0x401d70a4    # 2.46f

    .line 88
    .line 89
    .line 90
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 91
    .line 92
    .line 93
    const v25, 0x3fb47ae1    # 1.41f

    .line 94
    .line 95
    .line 96
    const/16 v26, 0x0

    .line 97
    .line 98
    const v21, 0x3ec7ae14    # 0.39f

    .line 99
    .line 100
    .line 101
    const v22, 0x3ec7ae14    # 0.39f

    .line 102
    .line 103
    .line 104
    const v23, 0x3f828f5c    # 1.02f

    .line 105
    .line 106
    .line 107
    const v24, 0x3ec7ae14    # 0.39f

    .line 108
    .line 109
    .line 110
    move-object/from16 v20, v2

    .line 111
    .line 112
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 113
    .line 114
    .line 115
    const v4, -0x404b851f    # -1.41f

    .line 116
    .line 117
    .line 118
    const/4 v6, 0x0

    .line 119
    const v7, -0x407d70a4    # -1.02f

    .line 120
    .line 121
    .line 122
    const v8, 0x3ec7ae14    # 0.39f

    .line 123
    .line 124
    .line 125
    invoke-virtual {v2, v8, v7, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 126
    .line 127
    .line 128
    const v4, 0x3f333333    # 0.7f

    .line 129
    .line 130
    .line 131
    const v6, 0x414b3333    # 12.7f

    .line 132
    .line 133
    .line 134
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 135
    .line 136
    .line 137
    const v25, -0x404b851f    # -1.41f

    .line 138
    .line 139
    .line 140
    const v21, -0x413851ec    # -0.39f

    .line 141
    .line 142
    .line 143
    const v22, -0x413851ec    # -0.39f

    .line 144
    .line 145
    .line 146
    const v23, -0x407d70a4    # -1.02f

    .line 147
    .line 148
    .line 149
    const v24, -0x413851ec    # -0.39f

    .line 150
    .line 151
    .line 152
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 153
    .line 154
    .line 155
    const v4, 0x407851ec    # 3.88f

    .line 156
    .line 157
    .line 158
    const v6, 0x4101eb85    # 8.12f

    .line 159
    .line 160
    .line 161
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 162
    .line 163
    .line 164
    const/16 v25, 0x0

    .line 165
    .line 166
    const v26, 0x3fb47ae1    # 1.41f

    .line 167
    .line 168
    .line 169
    const v22, 0x3ec7ae14    # 0.39f

    .line 170
    .line 171
    .line 172
    const v23, -0x413851ec    # -0.39f

    .line 173
    .line 174
    .line 175
    const v24, 0x3f828f5c    # 1.02f

    .line 176
    .line 177
    .line 178
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 179
    .line 180
    .line 181
    const v4, 0x40b5c28f    # 5.68f

    .line 182
    .line 183
    .line 184
    const v6, 0x41123d71    # 9.14f

    .line 185
    .line 186
    .line 187
    const v7, 0x40a947ae    # 5.29f

    .line 188
    .line 189
    .line 190
    const v8, 0x41187ae1    # 9.53f

    .line 191
    .line 192
    .line 193
    invoke-virtual {v2, v6, v4, v8, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 194
    .line 195
    .line 196
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 197
    .line 198
    .line 199
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 200
    .line 201
    .line 202
    move-result-object v2

    .line 203
    const/16 v16, 0x3800

    .line 204
    .line 205
    const/16 v17, 0x0

    .line 206
    .line 207
    const/high16 v6, 0x3f800000    # 1.0f

    .line 208
    .line 209
    const/high16 v8, 0x3f800000    # 1.0f

    .line 210
    .line 211
    const/4 v7, 0x0

    .line 212
    const/high16 v9, 0x3f800000    # 1.0f

    .line 213
    .line 214
    const/high16 v12, 0x3f800000    # 1.0f

    .line 215
    .line 216
    const/4 v13, 0x0

    .line 217
    const/4 v14, 0x0

    .line 218
    const/4 v15, 0x0

    .line 219
    const-string v4, ""

    .line 220
    .line 221
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 222
    .line 223
    .line 224
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 225
    .line 226
    .line 227
    move-result v3

    .line 228
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 229
    .line 230
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 231
    .line 232
    .line 233
    move-result-wide v6

    .line 234
    const/4 v2, 0x0

    .line 235
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 236
    .line 237
    .line 238
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 239
    .line 240
    .line 241
    move-result v10

    .line 242
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 243
    .line 244
    .line 245
    move-result v11

    .line 246
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 247
    .line 248
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 249
    .line 250
    .line 251
    const v4, 0x4124a3d7    # 10.29f

    .line 252
    .line 253
    .line 254
    const v6, 0x41187ae1    # 9.53f

    .line 255
    .line 256
    .line 257
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 258
    .line 259
    .line 260
    const v4, 0x40fa8f5c    # 7.83f

    .line 261
    .line 262
    .line 263
    const/high16 v6, 0x41400000    # 12.0f

    .line 264
    .line 265
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 266
    .line 267
    .line 268
    const v4, 0x401d70a4    # 2.46f

    .line 269
    .line 270
    .line 271
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 272
    .line 273
    .line 274
    const v25, 0x3fb47ae1    # 1.41f

    .line 275
    .line 276
    .line 277
    const/16 v26, 0x0

    .line 278
    .line 279
    const v21, 0x3ec7ae14    # 0.39f

    .line 280
    .line 281
    .line 282
    const v23, 0x3f828f5c    # 1.02f

    .line 283
    .line 284
    .line 285
    const v24, 0x3ec7ae14    # 0.39f

    .line 286
    .line 287
    .line 288
    move-object/from16 v20, v2

    .line 289
    .line 290
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 291
    .line 292
    .line 293
    const v4, -0x404b851f    # -1.41f

    .line 294
    .line 295
    .line 296
    const/4 v6, 0x0

    .line 297
    const v7, -0x407d70a4    # -1.02f

    .line 298
    .line 299
    .line 300
    const v8, 0x3ec7ae14    # 0.39f

    .line 301
    .line 302
    .line 303
    invoke-virtual {v2, v8, v7, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 304
    .line 305
    .line 306
    const v4, 0x40b66666    # 5.7f

    .line 307
    .line 308
    .line 309
    const v6, 0x414b3333    # 12.7f

    .line 310
    .line 311
    .line 312
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 313
    .line 314
    .line 315
    const v25, -0x404b851f    # -1.41f

    .line 316
    .line 317
    .line 318
    const v21, -0x413851ec    # -0.39f

    .line 319
    .line 320
    .line 321
    const v22, -0x413851ec    # -0.39f

    .line 322
    .line 323
    .line 324
    const v23, -0x407d70a4    # -1.02f

    .line 325
    .line 326
    .line 327
    const v24, -0x413851ec    # -0.39f

    .line 328
    .line 329
    .line 330
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 331
    .line 332
    .line 333
    const v4, 0x410e147b    # 8.88f

    .line 334
    .line 335
    .line 336
    const v6, 0x4101eb85    # 8.12f

    .line 337
    .line 338
    .line 339
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 340
    .line 341
    .line 342
    const/16 v25, 0x0

    .line 343
    .line 344
    const v26, 0x3fb47ae1    # 1.41f

    .line 345
    .line 346
    .line 347
    const v22, 0x3ec7ae14    # 0.39f

    .line 348
    .line 349
    .line 350
    const v23, -0x413851ec    # -0.39f

    .line 351
    .line 352
    .line 353
    const v24, 0x3f828f5c    # 1.02f

    .line 354
    .line 355
    .line 356
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 357
    .line 358
    .line 359
    const v4, 0x412ae148    # 10.68f

    .line 360
    .line 361
    .line 362
    const v6, 0x4124a3d7    # 10.29f

    .line 363
    .line 364
    .line 365
    const v7, 0x41123d71    # 9.14f

    .line 366
    .line 367
    .line 368
    const v8, 0x41187ae1    # 9.53f

    .line 369
    .line 370
    .line 371
    invoke-virtual {v2, v7, v4, v8, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 372
    .line 373
    .line 374
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 375
    .line 376
    .line 377
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 378
    .line 379
    .line 380
    move-result-object v2

    .line 381
    const/high16 v6, 0x3f800000    # 1.0f

    .line 382
    .line 383
    const/high16 v8, 0x3f800000    # 1.0f

    .line 384
    .line 385
    const/4 v7, 0x0

    .line 386
    const-string v4, ""

    .line 387
    .line 388
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 389
    .line 390
    .line 391
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 392
    .line 393
    .line 394
    move-result v3

    .line 395
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 396
    .line 397
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 398
    .line 399
    .line 400
    move-result-wide v6

    .line 401
    const/4 v2, 0x0

    .line 402
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 403
    .line 404
    .line 405
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 406
    .line 407
    .line 408
    move-result v10

    .line 409
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 410
    .line 411
    .line 412
    move-result v11

    .line 413
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 414
    .line 415
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 416
    .line 417
    .line 418
    const v4, 0x415b5c29    # 13.71f

    .line 419
    .line 420
    .line 421
    const v6, 0x4167851f    # 14.47f

    .line 422
    .line 423
    .line 424
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 425
    .line 426
    .line 427
    const v4, 0x41815c29    # 16.17f

    .line 428
    .line 429
    .line 430
    const/high16 v6, 0x41400000    # 12.0f

    .line 431
    .line 432
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 433
    .line 434
    .line 435
    const v4, -0x3fe28f5c    # -2.46f

    .line 436
    .line 437
    .line 438
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 439
    .line 440
    .line 441
    const v25, -0x404b851f    # -1.41f

    .line 442
    .line 443
    .line 444
    const/16 v26, 0x0

    .line 445
    .line 446
    const v22, -0x413851ec    # -0.39f

    .line 447
    .line 448
    .line 449
    const v23, -0x407d70a4    # -1.02f

    .line 450
    .line 451
    .line 452
    const v24, -0x413851ec    # -0.39f

    .line 453
    .line 454
    .line 455
    move-object/from16 v20, v2

    .line 456
    .line 457
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 458
    .line 459
    .line 460
    const/16 v25, 0x0

    .line 461
    .line 462
    const v26, 0x3fb47ae1    # 1.41f

    .line 463
    .line 464
    .line 465
    const v22, 0x3ec7ae14    # 0.39f

    .line 466
    .line 467
    .line 468
    const v23, -0x413851ec    # -0.39f

    .line 469
    .line 470
    .line 471
    const v24, 0x3f828f5c    # 1.02f

    .line 472
    .line 473
    .line 474
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 475
    .line 476
    .line 477
    const v4, 0x404b851f    # 3.18f

    .line 478
    .line 479
    .line 480
    const v6, 0x404ae148    # 3.17f

    .line 481
    .line 482
    .line 483
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 484
    .line 485
    .line 486
    const v25, 0x3fb47ae1    # 1.41f

    .line 487
    .line 488
    .line 489
    const/16 v26, 0x0

    .line 490
    .line 491
    const v21, 0x3ec7ae14    # 0.39f

    .line 492
    .line 493
    .line 494
    const v23, 0x3f828f5c    # 1.02f

    .line 495
    .line 496
    .line 497
    const v24, 0x3ec7ae14    # 0.39f

    .line 498
    .line 499
    .line 500
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 501
    .line 502
    .line 503
    const v4, -0x3fb47ae1    # -3.18f

    .line 504
    .line 505
    .line 506
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 507
    .line 508
    .line 509
    const/16 v25, 0x0

    .line 510
    .line 511
    const v26, -0x404b851f    # -1.41f

    .line 512
    .line 513
    .line 514
    const v22, -0x413851ec    # -0.39f

    .line 515
    .line 516
    .line 517
    const v23, 0x3ec7ae14    # 0.39f

    .line 518
    .line 519
    .line 520
    const v24, -0x407d70a4    # -1.02f

    .line 521
    .line 522
    .line 523
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 524
    .line 525
    .line 526
    const v25, 0x4167851f    # 14.47f

    .line 527
    .line 528
    .line 529
    const v26, 0x415b5c29    # 13.71f

    .line 530
    .line 531
    .line 532
    const v21, 0x4177d70a    # 15.49f

    .line 533
    .line 534
    .line 535
    const v22, 0x41551eb8    # 13.32f

    .line 536
    .line 537
    .line 538
    const v23, 0x416dc28f    # 14.86f

    .line 539
    .line 540
    .line 541
    const v24, 0x41551eb8    # 13.32f

    .line 542
    .line 543
    .line 544
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 545
    .line 546
    .line 547
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 548
    .line 549
    .line 550
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 551
    .line 552
    .line 553
    move-result-object v2

    .line 554
    const/high16 v6, 0x3f800000    # 1.0f

    .line 555
    .line 556
    const/4 v7, 0x0

    .line 557
    const-string v4, ""

    .line 558
    .line 559
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 560
    .line 561
    .line 562
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 563
    .line 564
    .line 565
    move-result v3

    .line 566
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 567
    .line 568
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 569
    .line 570
    .line 571
    move-result-wide v6

    .line 572
    const/4 v0, 0x0

    .line 573
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 574
    .line 575
    .line 576
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 577
    .line 578
    .line 579
    move-result v10

    .line 580
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 581
    .line 582
    .line 583
    move-result v11

    .line 584
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 585
    .line 586
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 587
    .line 588
    .line 589
    const v0, 0x4195c28f    # 18.72f

    .line 590
    .line 591
    .line 592
    const v2, 0x4167851f    # 14.47f

    .line 593
    .line 594
    .line 595
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 596
    .line 597
    .line 598
    const v0, 0x41a95c29    # 21.17f

    .line 599
    .line 600
    .line 601
    const/high16 v2, 0x41400000    # 12.0f

    .line 602
    .line 603
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 604
    .line 605
    .line 606
    const v0, -0x3fe28f5c    # -2.46f

    .line 607
    .line 608
    .line 609
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 610
    .line 611
    .line 612
    const v17, -0x404b851f    # -1.41f

    .line 613
    .line 614
    .line 615
    const/16 v18, 0x0

    .line 616
    .line 617
    const v13, -0x413851ec    # -0.39f

    .line 618
    .line 619
    .line 620
    const v14, -0x413851ec    # -0.39f

    .line 621
    .line 622
    .line 623
    const v15, -0x407d70a4    # -1.02f

    .line 624
    .line 625
    .line 626
    const v16, -0x413851ec    # -0.39f

    .line 627
    .line 628
    .line 629
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 630
    .line 631
    .line 632
    const/16 v17, 0x0

    .line 633
    .line 634
    const v18, 0x3fb47ae1    # 1.41f

    .line 635
    .line 636
    .line 637
    const v14, 0x3ec7ae14    # 0.39f

    .line 638
    .line 639
    .line 640
    const v15, -0x413851ec    # -0.39f

    .line 641
    .line 642
    .line 643
    const v16, 0x3f828f5c    # 1.02f

    .line 644
    .line 645
    .line 646
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 647
    .line 648
    .line 649
    const v0, 0x404b851f    # 3.18f

    .line 650
    .line 651
    .line 652
    const v2, 0x404ae148    # 3.17f

    .line 653
    .line 654
    .line 655
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 656
    .line 657
    .line 658
    const v17, 0x3fb47ae1    # 1.41f

    .line 659
    .line 660
    .line 661
    const/16 v18, 0x0

    .line 662
    .line 663
    const v13, 0x3ec7ae14    # 0.39f

    .line 664
    .line 665
    .line 666
    const v15, 0x3f828f5c    # 1.02f

    .line 667
    .line 668
    .line 669
    const v16, 0x3ec7ae14    # 0.39f

    .line 670
    .line 671
    .line 672
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 673
    .line 674
    .line 675
    const v0, -0x3fb51eb8    # -3.17f

    .line 676
    .line 677
    .line 678
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 679
    .line 680
    .line 681
    const/16 v17, 0x0

    .line 682
    .line 683
    const v18, -0x404b851f    # -1.41f

    .line 684
    .line 685
    .line 686
    const v14, -0x413851ec    # -0.39f

    .line 687
    .line 688
    .line 689
    const v15, 0x3ec7ae14    # 0.39f

    .line 690
    .line 691
    .line 692
    const v16, -0x407d70a4    # -1.02f

    .line 693
    .line 694
    .line 695
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 696
    .line 697
    .line 698
    const v0, 0x416dc28f    # 14.86f

    .line 699
    .line 700
    .line 701
    const v2, 0x4192a3d7    # 18.33f

    .line 702
    .line 703
    .line 704
    const v4, 0x4195c28f    # 18.72f

    .line 705
    .line 706
    .line 707
    const v6, 0x4167851f    # 14.47f

    .line 708
    .line 709
    .line 710
    invoke-virtual {v12, v0, v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 711
    .line 712
    .line 713
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 714
    .line 715
    .line 716
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 717
    .line 718
    .line 719
    move-result-object v2

    .line 720
    const/16 v16, 0x3800

    .line 721
    .line 722
    const/16 v17, 0x0

    .line 723
    .line 724
    const/high16 v6, 0x3f800000    # 1.0f

    .line 725
    .line 726
    const/4 v7, 0x0

    .line 727
    const/high16 v12, 0x3f800000    # 1.0f

    .line 728
    .line 729
    const/4 v13, 0x0

    .line 730
    const/4 v14, 0x0

    .line 731
    const/4 v15, 0x0

    .line 732
    const-string v4, ""

    .line 733
    .line 734
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 735
    .line 736
    .line 737
    move-result-object v0

    .line 738
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 739
    .line 740
    .line 741
    move-result-object v0

    .line 742
    sput-object v0, Landroidx/compose/material/icons/rounded/UnfoldMoreDoubleKt;->_unfoldMoreDouble:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 743
    .line 744
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 745
    .line 746
    .line 747
    return-object v0
.end method
