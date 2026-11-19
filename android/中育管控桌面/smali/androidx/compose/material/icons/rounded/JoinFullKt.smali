.class public final Landroidx/compose/material/icons/rounded/JoinFullKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_joinFull",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "JoinFull",
        "Landroidx/compose/material/icons/Icons$Rounded;",
        "getJoinFull",
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
        "SMAP\nJoinFull.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JoinFull.kt\nandroidx/compose/material/icons/rounded/JoinFullKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,65:1\n212#2,12:66\n233#2,18:79\n253#2:116\n233#2,18:117\n253#2:154\n233#2,18:155\n253#2:192\n174#3:78\n705#4,2:97\n717#4,2:99\n719#4,11:105\n705#4,2:135\n717#4,2:137\n719#4,11:143\n705#4,2:173\n717#4,2:175\n719#4,11:181\n72#5,4:101\n72#5,4:139\n72#5,4:177\n*S KotlinDebug\n*F\n+ 1 JoinFull.kt\nandroidx/compose/material/icons/rounded/JoinFullKt\n*L\n29#1:66,12\n30#1:79,18\n30#1:116\n40#1:117,18\n40#1:154\n50#1:155,18\n50#1:192\n29#1:78\n30#1:97,2\n30#1:99,2\n30#1:105,11\n40#1:135,2\n40#1:137,2\n40#1:143,11\n50#1:173,2\n50#1:175,2\n50#1:181,11\n30#1:101,4\n40#1:139,4\n50#1:177,4\n*E\n"
    }
.end annotation


# static fields
.field private static _joinFull:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getJoinFull(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/JoinFullKt;->_joinFull:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.JoinFull"

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
    const v4, 0x414ae148    # 12.68f

    .line 71
    .line 72
    .line 73
    const v6, 0x40d9999a    # 6.8f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v25, -0x4050a3d7    # -1.37f

    .line 80
    .line 81
    .line 82
    const/16 v26, 0x0

    .line 83
    .line 84
    const v21, -0x413851ec    # -0.39f

    .line 85
    .line 86
    .line 87
    const v22, -0x414ccccd    # -0.35f

    .line 88
    .line 89
    .line 90
    const v23, -0x40851eb8    # -0.98f

    .line 91
    .line 92
    .line 93
    const v24, -0x414ccccd    # -0.35f

    .line 94
    .line 95
    .line 96
    move-object/from16 v20, v2

    .line 97
    .line 98
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 99
    .line 100
    .line 101
    const/high16 v25, 0x41100000    # 9.0f

    .line 102
    .line 103
    const/high16 v26, 0x41400000    # 12.0f

    .line 104
    .line 105
    const v21, 0x4115999a    # 9.35f

    .line 106
    .line 107
    .line 108
    const v22, 0x4108f5c3    # 8.56f

    .line 109
    .line 110
    .line 111
    const/high16 v23, 0x41100000    # 9.0f

    .line 112
    .line 113
    const v24, 0x412d70a4    # 10.84f

    .line 114
    .line 115
    .line 116
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 117
    .line 118
    .line 119
    const v25, 0x40147ae1    # 2.32f

    .line 120
    .line 121
    .line 122
    const v26, 0x40a66666    # 5.2f

    .line 123
    .line 124
    .line 125
    const/16 v21, 0x0

    .line 126
    .line 127
    const v22, 0x3f933333    # 1.15f

    .line 128
    .line 129
    .line 130
    const v23, 0x3eb33333    # 0.35f

    .line 131
    .line 132
    .line 133
    const v24, 0x405c28f6    # 3.44f

    .line 134
    .line 135
    .line 136
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 137
    .line 138
    .line 139
    const v25, 0x3faf5c29    # 1.37f

    .line 140
    .line 141
    .line 142
    const/16 v26, 0x0

    .line 143
    .line 144
    const v21, 0x3ec7ae14    # 0.39f

    .line 145
    .line 146
    .line 147
    const v22, 0x3eb33333    # 0.35f

    .line 148
    .line 149
    .line 150
    const v23, 0x3f7ae148    # 0.98f

    .line 151
    .line 152
    .line 153
    const v24, 0x3eb33333    # 0.35f

    .line 154
    .line 155
    .line 156
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 157
    .line 158
    .line 159
    const/high16 v25, 0x41700000    # 15.0f

    .line 160
    .line 161
    const/high16 v26, 0x41400000    # 12.0f

    .line 162
    .line 163
    const v21, 0x416a6666    # 14.65f

    .line 164
    .line 165
    .line 166
    const v22, 0x41770a3d    # 15.44f

    .line 167
    .line 168
    .line 169
    const/high16 v23, 0x41700000    # 15.0f

    .line 170
    .line 171
    const v24, 0x41528f5c    # 13.16f

    .line 172
    .line 173
    .line 174
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 175
    .line 176
    .line 177
    const v25, 0x414ae148    # 12.68f

    .line 178
    .line 179
    .line 180
    const v26, 0x40d9999a    # 6.8f

    .line 181
    .line 182
    .line 183
    const/high16 v21, 0x41700000    # 15.0f

    .line 184
    .line 185
    const v22, 0x412d999a    # 10.85f

    .line 186
    .line 187
    .line 188
    const v23, 0x416a6666    # 14.65f

    .line 189
    .line 190
    .line 191
    const v24, 0x4108f5c3    # 8.56f

    .line 192
    .line 193
    .line 194
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 195
    .line 196
    .line 197
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 198
    .line 199
    .line 200
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 201
    .line 202
    .line 203
    move-result-object v2

    .line 204
    const/16 v16, 0x3800

    .line 205
    .line 206
    const/16 v17, 0x0

    .line 207
    .line 208
    const/high16 v6, 0x3f800000    # 1.0f

    .line 209
    .line 210
    const/high16 v8, 0x3f800000    # 1.0f

    .line 211
    .line 212
    const/4 v7, 0x0

    .line 213
    const/high16 v9, 0x3f800000    # 1.0f

    .line 214
    .line 215
    const/high16 v12, 0x3f800000    # 1.0f

    .line 216
    .line 217
    const/4 v13, 0x0

    .line 218
    const/4 v14, 0x0

    .line 219
    const/4 v15, 0x0

    .line 220
    const-string v4, ""

    .line 221
    .line 222
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 223
    .line 224
    .line 225
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 226
    .line 227
    .line 228
    move-result v3

    .line 229
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 230
    .line 231
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 232
    .line 233
    .line 234
    move-result-wide v6

    .line 235
    const/4 v2, 0x0

    .line 236
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 237
    .line 238
    .line 239
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 240
    .line 241
    .line 242
    move-result v10

    .line 243
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 244
    .line 245
    .line 246
    move-result v11

    .line 247
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 248
    .line 249
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 250
    .line 251
    .line 252
    const/high16 v4, 0x40f00000    # 7.5f

    .line 253
    .line 254
    const/high16 v6, 0x41400000    # 12.0f

    .line 255
    .line 256
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 257
    .line 258
    .line 259
    const v25, 0x4041eb85    # 3.03f

    .line 260
    .line 261
    .line 262
    const/high16 v26, -0x3f300000    # -6.5f

    .line 263
    .line 264
    const/16 v21, 0x0

    .line 265
    .line 266
    const v22, -0x4087ae14    # -0.97f

    .line 267
    .line 268
    .line 269
    const v23, 0x3e6b851f    # 0.23f

    .line 270
    .line 271
    .line 272
    const v24, -0x3f7ae148    # -4.16f

    .line 273
    .line 274
    .line 275
    move-object/from16 v20, v2

    .line 276
    .line 277
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 278
    .line 279
    .line 280
    const/high16 v25, 0x41000000    # 8.0f

    .line 281
    .line 282
    const/high16 v26, 0x40a00000    # 5.0f

    .line 283
    .line 284
    const/high16 v21, 0x411c0000    # 9.75f

    .line 285
    .line 286
    const v22, 0x40a6147b    # 5.19f

    .line 287
    .line 288
    .line 289
    const v23, 0x410e6666    # 8.9f

    .line 290
    .line 291
    .line 292
    const/high16 v24, 0x40a00000    # 5.0f

    .line 293
    .line 294
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 295
    .line 296
    .line 297
    const/high16 v25, -0x3f200000    # -7.0f

    .line 298
    .line 299
    const/high16 v26, 0x40e00000    # 7.0f

    .line 300
    .line 301
    const v21, -0x3f88f5c3    # -3.86f

    .line 302
    .line 303
    .line 304
    const/16 v22, 0x0

    .line 305
    .line 306
    const/high16 v23, -0x3f200000    # -7.0f

    .line 307
    .line 308
    const v24, 0x4048f5c3    # 3.14f

    .line 309
    .line 310
    .line 311
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 312
    .line 313
    .line 314
    const v4, 0x4048f5c3    # 3.14f

    .line 315
    .line 316
    .line 317
    const/high16 v6, 0x40e00000    # 7.0f

    .line 318
    .line 319
    invoke-virtual {v2, v4, v6, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 320
    .line 321
    .line 322
    const v25, 0x4021eb85    # 2.53f

    .line 323
    .line 324
    .line 325
    const/high16 v26, -0x41000000    # -0.5f

    .line 326
    .line 327
    const v21, 0x3f666666    # 0.9f

    .line 328
    .line 329
    .line 330
    const/high16 v23, 0x3fe00000    # 1.75f

    .line 331
    .line 332
    const v24, -0x41bd70a4    # -0.19f

    .line 333
    .line 334
    .line 335
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 336
    .line 337
    .line 338
    const/high16 v25, 0x40f00000    # 7.5f

    .line 339
    .line 340
    const/high16 v26, 0x41400000    # 12.0f

    .line 341
    .line 342
    const v21, 0x40f75c29    # 7.73f

    .line 343
    .line 344
    .line 345
    const v22, 0x418147ae    # 16.16f

    .line 346
    .line 347
    .line 348
    const/high16 v23, 0x40f00000    # 7.5f

    .line 349
    .line 350
    const v24, 0x414f851f    # 12.97f

    .line 351
    .line 352
    .line 353
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 354
    .line 355
    .line 356
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 357
    .line 358
    .line 359
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 360
    .line 361
    .line 362
    move-result-object v2

    .line 363
    const/high16 v6, 0x3f800000    # 1.0f

    .line 364
    .line 365
    const/4 v7, 0x0

    .line 366
    const-string v4, ""

    .line 367
    .line 368
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 369
    .line 370
    .line 371
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 372
    .line 373
    .line 374
    move-result v3

    .line 375
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 376
    .line 377
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 378
    .line 379
    .line 380
    move-result-wide v6

    .line 381
    const/4 v0, 0x0

    .line 382
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 383
    .line 384
    .line 385
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 386
    .line 387
    .line 388
    move-result v10

    .line 389
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 390
    .line 391
    .line 392
    move-result v11

    .line 393
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 394
    .line 395
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 396
    .line 397
    .line 398
    const/high16 v0, 0x41800000    # 16.0f

    .line 399
    .line 400
    const/high16 v2, 0x40a00000    # 5.0f

    .line 401
    .line 402
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 403
    .line 404
    .line 405
    const v17, -0x3fde147b    # -2.53f

    .line 406
    .line 407
    .line 408
    const/high16 v18, 0x3f000000    # 0.5f

    .line 409
    .line 410
    const v13, -0x4099999a    # -0.9f

    .line 411
    .line 412
    .line 413
    const/high16 v15, -0x40200000    # -1.75f

    .line 414
    .line 415
    const v16, 0x3e428f5c    # 0.19f

    .line 416
    .line 417
    .line 418
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 419
    .line 420
    .line 421
    const v17, 0x4041eb85    # 3.03f

    .line 422
    .line 423
    .line 424
    const/high16 v18, 0x40d00000    # 6.5f

    .line 425
    .line 426
    const v13, 0x40333333    # 2.8f

    .line 427
    .line 428
    .line 429
    const v14, 0x4015c28f    # 2.34f

    .line 430
    .line 431
    .line 432
    const v15, 0x4041eb85    # 3.03f

    .line 433
    .line 434
    .line 435
    const v16, 0x40b0f5c3    # 5.53f

    .line 436
    .line 437
    .line 438
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 439
    .line 440
    .line 441
    const v17, -0x3fbe147b    # -3.03f

    .line 442
    .line 443
    .line 444
    const/4 v13, 0x0

    .line 445
    const v14, 0x3f7851ec    # 0.97f

    .line 446
    .line 447
    .line 448
    const v15, -0x41947ae1    # -0.23f

    .line 449
    .line 450
    .line 451
    const v16, 0x40851eb8    # 4.16f

    .line 452
    .line 453
    .line 454
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 455
    .line 456
    .line 457
    const/high16 v17, 0x41800000    # 16.0f

    .line 458
    .line 459
    const/high16 v18, 0x41980000    # 19.0f

    .line 460
    .line 461
    const/high16 v13, 0x41640000    # 14.25f

    .line 462
    .line 463
    const v14, 0x41967ae1    # 18.81f

    .line 464
    .line 465
    .line 466
    const v15, 0x4171999a    # 15.1f

    .line 467
    .line 468
    .line 469
    const/high16 v16, 0x41980000    # 19.0f

    .line 470
    .line 471
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 472
    .line 473
    .line 474
    const/high16 v17, 0x40e00000    # 7.0f

    .line 475
    .line 476
    const/high16 v18, -0x3f200000    # -7.0f

    .line 477
    .line 478
    const v13, 0x40770a3d    # 3.86f

    .line 479
    .line 480
    .line 481
    const/4 v14, 0x0

    .line 482
    const/high16 v15, 0x40e00000    # 7.0f

    .line 483
    .line 484
    const v16, -0x3fb70a3d    # -3.14f

    .line 485
    .line 486
    .line 487
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 488
    .line 489
    .line 490
    const v0, 0x419ee148    # 19.86f

    .line 491
    .line 492
    .line 493
    const/high16 v2, 0x41800000    # 16.0f

    .line 494
    .line 495
    const/high16 v4, 0x40a00000    # 5.0f

    .line 496
    .line 497
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 498
    .line 499
    .line 500
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 501
    .line 502
    .line 503
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 504
    .line 505
    .line 506
    move-result-object v2

    .line 507
    const/16 v16, 0x3800

    .line 508
    .line 509
    const/16 v17, 0x0

    .line 510
    .line 511
    const/high16 v6, 0x3f800000    # 1.0f

    .line 512
    .line 513
    const/4 v7, 0x0

    .line 514
    const/high16 v12, 0x3f800000    # 1.0f

    .line 515
    .line 516
    const/4 v13, 0x0

    .line 517
    const/4 v15, 0x0

    .line 518
    const-string v4, ""

    .line 519
    .line 520
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 521
    .line 522
    .line 523
    move-result-object v0

    .line 524
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 525
    .line 526
    .line 527
    move-result-object v0

    .line 528
    sput-object v0, Landroidx/compose/material/icons/rounded/JoinFullKt;->_joinFull:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 529
    .line 530
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 531
    .line 532
    .line 533
    return-object v0
.end method
