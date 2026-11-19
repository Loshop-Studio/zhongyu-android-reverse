.class public final Landroidx/compose/material/icons/outlined/BuildCircleKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_buildCircle",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "BuildCircle",
        "Landroidx/compose/material/icons/Icons$Outlined;",
        "getBuildCircle",
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
        "SMAP\nBuildCircle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BuildCircle.kt\nandroidx/compose/material/icons/outlined/BuildCircleKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,66:1\n212#2,12:67\n233#2,18:80\n253#2:117\n233#2,18:118\n253#2:155\n174#3:79\n705#4,2:98\n717#4,2:100\n719#4,11:106\n705#4,2:136\n717#4,2:138\n719#4,11:144\n72#5,4:102\n72#5,4:140\n*S KotlinDebug\n*F\n+ 1 BuildCircle.kt\nandroidx/compose/material/icons/outlined/BuildCircleKt\n*L\n30#1:67,12\n31#1:80,18\n31#1:117\n45#1:118,18\n45#1:155\n30#1:79\n31#1:98,2\n31#1:100,2\n31#1:106,11\n45#1:136,2\n45#1:138,2\n45#1:144,11\n31#1:102,4\n45#1:140,4\n*E\n"
    }
.end annotation


# static fields
.field private static _buildCircle:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getBuildCircle(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 28

    .line 1
    sget-object v0, Landroidx/compose/material/icons/outlined/BuildCircleKt;->_buildCircle:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Outlined.BuildCircle"

    .line 33
    .line 34
    invoke-direct/range {v1 .. v12}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;-><init>(Ljava/lang/String;FFFFJIZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 35
    .line 36
    .line 37
    sget-object v0, Landroidx/compose/ui/graphics/PathFillType;->Companion:Landroidx/compose/ui/graphics/PathFillType$Companion;

    .line 38
    .line 39
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/PathFillType$Companion;->getEvenOdd-Rg-k1Os()I

    .line 40
    .line 41
    .line 42
    move-result v3

    .line 43
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 44
    .line 45
    sget-object v18, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    .line 46
    .line 47
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 48
    .line 49
    .line 50
    move-result-wide v6

    .line 51
    const/4 v2, 0x0

    .line 52
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 53
    .line 54
    .line 55
    sget-object v19, Landroidx/compose/ui/graphics/StrokeCap;->Companion:Landroidx/compose/ui/graphics/StrokeCap$Companion;

    .line 56
    .line 57
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 58
    .line 59
    .line 60
    move-result v10

    .line 61
    sget-object v20, Landroidx/compose/ui/graphics/StrokeJoin;->Companion:Landroidx/compose/ui/graphics/StrokeJoin$Companion;

    .line 62
    .line 63
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 64
    .line 65
    .line 66
    move-result v11

    .line 67
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 68
    .line 69
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 70
    .line 71
    .line 72
    const/high16 v4, 0x40000000    # 2.0f

    .line 73
    .line 74
    const/high16 v6, 0x41400000    # 12.0f

    .line 75
    .line 76
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const/high16 v26, 0x40000000    # 2.0f

    .line 80
    .line 81
    const/high16 v27, 0x41400000    # 12.0f

    .line 82
    .line 83
    const v22, 0x40cf5c29    # 6.48f

    .line 84
    .line 85
    .line 86
    const/high16 v23, 0x40000000    # 2.0f

    .line 87
    .line 88
    const/high16 v24, 0x40000000    # 2.0f

    .line 89
    .line 90
    const v25, 0x40cf5c29    # 6.48f

    .line 91
    .line 92
    .line 93
    move-object/from16 v21, v2

    .line 94
    .line 95
    invoke-virtual/range {v21 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 96
    .line 97
    .line 98
    const/high16 v26, 0x41200000    # 10.0f

    .line 99
    .line 100
    const/high16 v27, 0x41200000    # 10.0f

    .line 101
    .line 102
    const/16 v22, 0x0

    .line 103
    .line 104
    const v23, 0x40b0a3d7    # 5.52f

    .line 105
    .line 106
    .line 107
    const v24, 0x408f5c29    # 4.48f

    .line 108
    .line 109
    .line 110
    const/high16 v25, 0x41200000    # 10.0f

    .line 111
    .line 112
    invoke-virtual/range {v21 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 113
    .line 114
    .line 115
    const v4, -0x3f70a3d7    # -4.48f

    .line 116
    .line 117
    .line 118
    const/high16 v6, -0x3ee00000    # -10.0f

    .line 119
    .line 120
    const/high16 v7, 0x41200000    # 10.0f

    .line 121
    .line 122
    invoke-virtual {v2, v7, v4, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 123
    .line 124
    .line 125
    const/high16 v26, 0x41400000    # 12.0f

    .line 126
    .line 127
    const/high16 v27, 0x40000000    # 2.0f

    .line 128
    .line 129
    const/high16 v22, 0x41b00000    # 22.0f

    .line 130
    .line 131
    const v23, 0x40cf5c29    # 6.48f

    .line 132
    .line 133
    .line 134
    const v24, 0x418c28f6    # 17.52f

    .line 135
    .line 136
    .line 137
    const/high16 v25, 0x40000000    # 2.0f

    .line 138
    .line 139
    invoke-virtual/range {v21 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 140
    .line 141
    .line 142
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 143
    .line 144
    .line 145
    const/high16 v4, 0x41a00000    # 20.0f

    .line 146
    .line 147
    const/high16 v6, 0x41400000    # 12.0f

    .line 148
    .line 149
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 150
    .line 151
    .line 152
    const/high16 v26, -0x3f000000    # -8.0f

    .line 153
    .line 154
    const/high16 v27, -0x3f000000    # -8.0f

    .line 155
    .line 156
    const v22, -0x3f72e148    # -4.41f

    .line 157
    .line 158
    .line 159
    const/16 v23, 0x0

    .line 160
    .line 161
    const/high16 v24, -0x3f000000    # -8.0f

    .line 162
    .line 163
    const v25, -0x3f9a3d71    # -3.59f

    .line 164
    .line 165
    .line 166
    invoke-virtual/range {v21 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 167
    .line 168
    .line 169
    const/high16 v26, 0x41000000    # 8.0f

    .line 170
    .line 171
    const/16 v22, 0x0

    .line 172
    .line 173
    const v23, -0x3f72e148    # -4.41f

    .line 174
    .line 175
    .line 176
    const v24, 0x4065c28f    # 3.59f

    .line 177
    .line 178
    .line 179
    const/high16 v25, -0x3f000000    # -8.0f

    .line 180
    .line 181
    invoke-virtual/range {v21 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 182
    .line 183
    .line 184
    const v4, 0x4065c28f    # 3.59f

    .line 185
    .line 186
    .line 187
    const/high16 v6, 0x41000000    # 8.0f

    .line 188
    .line 189
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 190
    .line 191
    .line 192
    const/high16 v26, 0x41400000    # 12.0f

    .line 193
    .line 194
    const/high16 v27, 0x41a00000    # 20.0f

    .line 195
    .line 196
    const/high16 v22, 0x41a00000    # 20.0f

    .line 197
    .line 198
    const v23, 0x418347ae    # 16.41f

    .line 199
    .line 200
    .line 201
    const v24, 0x418347ae    # 16.41f

    .line 202
    .line 203
    .line 204
    const/high16 v25, 0x41a00000    # 20.0f

    .line 205
    .line 206
    invoke-virtual/range {v21 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 207
    .line 208
    .line 209
    invoke-virtual/range {v21 .. v21}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 210
    .line 211
    .line 212
    invoke-virtual/range {v21 .. v21}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 213
    .line 214
    .line 215
    move-result-object v2

    .line 216
    const/16 v16, 0x3800

    .line 217
    .line 218
    const/16 v17, 0x0

    .line 219
    .line 220
    const/high16 v6, 0x3f800000    # 1.0f

    .line 221
    .line 222
    const/high16 v8, 0x3f800000    # 1.0f

    .line 223
    .line 224
    const/4 v7, 0x0

    .line 225
    const/high16 v9, 0x3f800000    # 1.0f

    .line 226
    .line 227
    const/high16 v12, 0x3f800000    # 1.0f

    .line 228
    .line 229
    const/4 v13, 0x0

    .line 230
    const/4 v14, 0x0

    .line 231
    const/4 v15, 0x0

    .line 232
    const-string v4, ""

    .line 233
    .line 234
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 235
    .line 236
    .line 237
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/PathFillType$Companion;->getEvenOdd-Rg-k1Os()I

    .line 238
    .line 239
    .line 240
    move-result v3

    .line 241
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 242
    .line 243
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 244
    .line 245
    .line 246
    move-result-wide v6

    .line 247
    const/4 v0, 0x0

    .line 248
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 249
    .line 250
    .line 251
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 252
    .line 253
    .line 254
    move-result v10

    .line 255
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 256
    .line 257
    .line 258
    move-result v11

    .line 259
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 260
    .line 261
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 262
    .line 263
    .line 264
    const v0, 0x4136147b    # 11.38f

    .line 265
    .line 266
    .line 267
    const v2, 0x4157d70a    # 13.49f

    .line 268
    .line 269
    .line 270
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 271
    .line 272
    .line 273
    const v17, -0x40b0a3d7    # -0.81f

    .line 274
    .line 275
    .line 276
    const v18, -0x3f9851ec    # -3.62f

    .line 277
    .line 278
    .line 279
    const v13, 0x3edc28f6    # 0.43f

    .line 280
    .line 281
    .line 282
    const v14, -0x4063d70a    # -1.22f

    .line 283
    .line 284
    .line 285
    const v15, 0x3e2e147b    # 0.17f

    .line 286
    .line 287
    .line 288
    const v16, -0x3fd70a3d    # -2.64f

    .line 289
    .line 290
    .line 291
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 292
    .line 293
    .line 294
    const v17, -0x3f7ccccd    # -4.1f

    .line 295
    .line 296
    .line 297
    const v18, -0x40e8f5c3    # -0.59f

    .line 298
    .line 299
    .line 300
    const v13, -0x4071eb85    # -1.11f

    .line 301
    .line 302
    .line 303
    const v14, -0x4071eb85    # -1.11f

    .line 304
    .line 305
    .line 306
    const v15, -0x3fcd70a4    # -2.79f

    .line 307
    .line 308
    .line 309
    const v16, -0x4059999a    # -1.3f

    .line 310
    .line 311
    .line 312
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 313
    .line 314
    .line 315
    const v0, 0x40166666    # 2.35f

    .line 316
    .line 317
    .line 318
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 319
    .line 320
    .line 321
    const v0, -0x404b851f    # -1.41f

    .line 322
    .line 323
    .line 324
    const v2, 0x3fb47ae1    # 1.41f

    .line 325
    .line 326
    .line 327
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 328
    .line 329
    .line 330
    const v0, 0x40e570a4    # 7.17f

    .line 331
    .line 332
    .line 333
    const v2, 0x410947ae    # 8.58f

    .line 334
    .line 335
    .line 336
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 337
    .line 338
    .line 339
    const v17, 0x3f170a3d    # 0.59f

    .line 340
    .line 341
    .line 342
    const v18, 0x40833333    # 4.1f

    .line 343
    .line 344
    .line 345
    const v13, -0x40ca3d71    # -0.71f

    .line 346
    .line 347
    .line 348
    const v14, 0x3fa8f5c3    # 1.32f

    .line 349
    .line 350
    .line 351
    const v15, -0x40fae148    # -0.52f

    .line 352
    .line 353
    .line 354
    const v16, 0x403f5c29    # 2.99f

    .line 355
    .line 356
    .line 357
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 358
    .line 359
    .line 360
    const v17, 0x4067ae14    # 3.62f

    .line 361
    .line 362
    .line 363
    const v18, 0x3f4f5c29    # 0.81f

    .line 364
    .line 365
    .line 366
    const v13, 0x3f7ae148    # 0.98f

    .line 367
    .line 368
    .line 369
    const v14, 0x3f7ae148    # 0.98f

    .line 370
    .line 371
    .line 372
    const v15, 0x4019999a    # 2.4f

    .line 373
    .line 374
    .line 375
    const v16, 0x3f9eb852    # 1.24f

    .line 376
    .line 377
    .line 378
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 379
    .line 380
    .line 381
    const v0, 0x405a3d71    # 3.41f

    .line 382
    .line 383
    .line 384
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 385
    .line 386
    .line 387
    const v17, 0x3f35c28f    # 0.71f

    .line 388
    .line 389
    .line 390
    const/16 v18, 0x0

    .line 391
    .line 392
    const v13, 0x3e4ccccd    # 0.2f

    .line 393
    .line 394
    .line 395
    const v14, 0x3e4ccccd    # 0.2f

    .line 396
    .line 397
    .line 398
    const v15, 0x3f028f5c    # 0.51f

    .line 399
    .line 400
    .line 401
    const v16, 0x3e4ccccd    # 0.2f

    .line 402
    .line 403
    .line 404
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 405
    .line 406
    .line 407
    const v0, 0x3fb33333    # 1.4f

    .line 408
    .line 409
    .line 410
    const v2, -0x404ccccd    # -1.4f

    .line 411
    .line 412
    .line 413
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 414
    .line 415
    .line 416
    const/16 v17, 0x0

    .line 417
    .line 418
    const v18, -0x40ca3d71    # -0.71f

    .line 419
    .line 420
    .line 421
    const v14, -0x41b33333    # -0.2f

    .line 422
    .line 423
    .line 424
    const v15, 0x3e4ccccd    # 0.2f

    .line 425
    .line 426
    .line 427
    const v16, -0x40fd70a4    # -0.51f

    .line 428
    .line 429
    .line 430
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 431
    .line 432
    .line 433
    const v0, 0x4136147b    # 11.38f

    .line 434
    .line 435
    .line 436
    const v2, 0x4157d70a    # 13.49f

    .line 437
    .line 438
    .line 439
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 440
    .line 441
    .line 442
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 443
    .line 444
    .line 445
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 446
    .line 447
    .line 448
    move-result-object v2

    .line 449
    const/16 v16, 0x3800

    .line 450
    .line 451
    const/16 v17, 0x0

    .line 452
    .line 453
    const/high16 v6, 0x3f800000    # 1.0f

    .line 454
    .line 455
    const/4 v7, 0x0

    .line 456
    const/high16 v12, 0x3f800000    # 1.0f

    .line 457
    .line 458
    const/4 v13, 0x0

    .line 459
    const/4 v14, 0x0

    .line 460
    const/4 v15, 0x0

    .line 461
    const-string v4, ""

    .line 462
    .line 463
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 464
    .line 465
    .line 466
    move-result-object v0

    .line 467
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 468
    .line 469
    .line 470
    move-result-object v0

    .line 471
    sput-object v0, Landroidx/compose/material/icons/outlined/BuildCircleKt;->_buildCircle:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 472
    .line 473
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 474
    .line 475
    .line 476
    return-object v0
.end method
