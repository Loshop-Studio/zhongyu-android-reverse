.class public final Landroidx/compose/material/icons/twotone/SportsBaseballKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_sportsBaseball",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "SportsBaseball",
        "Landroidx/compose/material/icons/Icons$TwoTone;",
        "getSportsBaseball",
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
        "SMAP\nSportsBaseball.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SportsBaseball.kt\nandroidx/compose/material/icons/twotone/SportsBaseballKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,93:1\n212#2,12:94\n233#2,18:107\n253#2:144\n233#2,18:145\n253#2:182\n233#2,18:183\n253#2:220\n233#2,18:221\n253#2:258\n174#3:106\n705#4,2:125\n717#4,2:127\n719#4,11:133\n705#4,2:163\n717#4,2:165\n719#4,11:171\n705#4,2:201\n717#4,2:203\n719#4,11:209\n705#4,2:239\n717#4,2:241\n719#4,11:247\n72#5,4:129\n72#5,4:167\n72#5,4:205\n72#5,4:243\n*S KotlinDebug\n*F\n+ 1 SportsBaseball.kt\nandroidx/compose/material/icons/twotone/SportsBaseballKt\n*L\n29#1:94,12\n30#1:107,18\n30#1:144\n38#1:145,18\n38#1:182\n50#1:183,18\n50#1:220\n58#1:221,18\n58#1:258\n29#1:106\n30#1:125,2\n30#1:127,2\n30#1:133,11\n38#1:163,2\n38#1:165,2\n38#1:171,11\n50#1:201,2\n50#1:203,2\n50#1:209,11\n58#1:239,2\n58#1:241,2\n58#1:247,11\n30#1:129,4\n38#1:167,4\n50#1:205,4\n58#1:243,4\n*E\n"
    }
.end annotation


# static fields
.field private static _sportsBaseball:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getSportsBaseball(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/SportsBaseballKt;->_sportsBaseball:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.SportsBaseball"

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
    const v4, 0x40e70a3d    # 7.22f

    .line 71
    .line 72
    .line 73
    const v6, 0x40b3851f    # 5.61f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const/high16 v25, 0x40800000    # 4.0f

    .line 80
    .line 81
    const/high16 v26, 0x41400000    # 12.0f

    .line 82
    .line 83
    const v21, 0x40933333    # 4.6f

    .line 84
    .line 85
    .line 86
    const v22, 0x4108cccd    # 8.55f

    .line 87
    .line 88
    .line 89
    const/high16 v23, 0x40800000    # 4.0f

    .line 90
    .line 91
    const v24, 0x41233333    # 10.2f

    .line 92
    .line 93
    .line 94
    move-object/from16 v20, v2

    .line 95
    .line 96
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 97
    .line 98
    .line 99
    const v4, 0x405ccccd    # 3.45f

    .line 100
    .line 101
    .line 102
    const v6, 0x4098f5c3    # 4.78f

    .line 103
    .line 104
    .line 105
    const v7, 0x3fce147b    # 1.61f

    .line 106
    .line 107
    .line 108
    const v8, 0x3f19999a    # 0.6f

    .line 109
    .line 110
    .line 111
    invoke-virtual {v2, v8, v4, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 112
    .line 113
    .line 114
    const/high16 v25, 0x41000000    # 8.0f

    .line 115
    .line 116
    const v21, 0x40e1eb85    # 7.06f

    .line 117
    .line 118
    .line 119
    const v22, 0x417b0a3d    # 15.69f

    .line 120
    .line 121
    .line 122
    const/high16 v23, 0x41000000    # 8.0f

    .line 123
    .line 124
    const v24, 0x415f3333    # 13.95f

    .line 125
    .line 126
    .line 127
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 128
    .line 129
    .line 130
    const v4, 0x4104f5c3    # 8.31f

    .line 131
    .line 132
    .line 133
    const v6, 0x40e1eb85    # 7.06f

    .line 134
    .line 135
    .line 136
    const v7, 0x40e70a3d    # 7.22f

    .line 137
    .line 138
    .line 139
    const v8, 0x40b3851f    # 5.61f

    .line 140
    .line 141
    .line 142
    invoke-virtual {v2, v6, v4, v8, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 143
    .line 144
    .line 145
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 146
    .line 147
    .line 148
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 149
    .line 150
    .line 151
    move-result-object v2

    .line 152
    const/16 v16, 0x3800

    .line 153
    .line 154
    const/16 v17, 0x0

    .line 155
    .line 156
    const v6, 0x3e99999a    # 0.3f

    .line 157
    .line 158
    .line 159
    const v8, 0x3e99999a    # 0.3f

    .line 160
    .line 161
    .line 162
    const/4 v7, 0x0

    .line 163
    const/high16 v9, 0x3f800000    # 1.0f

    .line 164
    .line 165
    const/high16 v12, 0x3f800000    # 1.0f

    .line 166
    .line 167
    const/4 v13, 0x0

    .line 168
    const/4 v14, 0x0

    .line 169
    const/4 v15, 0x0

    .line 170
    const-string v4, ""

    .line 171
    .line 172
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 173
    .line 174
    .line 175
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 176
    .line 177
    .line 178
    move-result v3

    .line 179
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 180
    .line 181
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 182
    .line 183
    .line 184
    move-result-wide v6

    .line 185
    const/4 v2, 0x0

    .line 186
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 187
    .line 188
    .line 189
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 190
    .line 191
    .line 192
    move-result v10

    .line 193
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 194
    .line 195
    .line 196
    move-result v11

    .line 197
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 198
    .line 199
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 200
    .line 201
    .line 202
    const/high16 v4, 0x41600000    # 14.0f

    .line 203
    .line 204
    const/high16 v6, 0x41400000    # 12.0f

    .line 205
    .line 206
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 207
    .line 208
    .line 209
    const/high16 v25, 0x40400000    # 3.0f

    .line 210
    .line 211
    const v26, -0x3f3851ec    # -6.24f

    .line 212
    .line 213
    .line 214
    const/16 v21, 0x0

    .line 215
    .line 216
    const v22, -0x3fdeb852    # -2.52f

    .line 217
    .line 218
    .line 219
    const v23, 0x3f95c28f    # 1.17f

    .line 220
    .line 221
    .line 222
    const v24, -0x3f675c29    # -4.77f

    .line 223
    .line 224
    .line 225
    move-object/from16 v20, v2

    .line 226
    .line 227
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 228
    .line 229
    .line 230
    const/high16 v25, 0x41400000    # 12.0f

    .line 231
    .line 232
    const/high16 v26, 0x40800000    # 4.0f

    .line 233
    .line 234
    const v21, 0x417a147b    # 15.63f

    .line 235
    .line 236
    .line 237
    const v22, 0x40951eb8    # 4.66f

    .line 238
    .line 239
    .line 240
    const v23, 0x415e3d71    # 13.89f

    .line 241
    .line 242
    .line 243
    const/high16 v24, 0x40800000    # 4.0f

    .line 244
    .line 245
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 246
    .line 247
    .line 248
    const v4, 0x4105eb85    # 8.37f

    .line 249
    .line 250
    .line 251
    const v6, 0x40951eb8    # 4.66f

    .line 252
    .line 253
    .line 254
    const v7, 0x40b851ec    # 5.76f

    .line 255
    .line 256
    .line 257
    const/high16 v8, 0x40e00000    # 7.0f

    .line 258
    .line 259
    invoke-virtual {v2, v4, v6, v8, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 260
    .line 261
    .line 262
    const/high16 v25, 0x40400000    # 3.0f

    .line 263
    .line 264
    const v26, 0x40c7ae14    # 6.24f

    .line 265
    .line 266
    .line 267
    const v21, 0x3fea3d71    # 1.83f

    .line 268
    .line 269
    .line 270
    const v22, 0x3fbc28f6    # 1.47f

    .line 271
    .line 272
    .line 273
    const/high16 v23, 0x40400000    # 3.0f

    .line 274
    .line 275
    const v24, 0x406d70a4    # 3.71f

    .line 276
    .line 277
    .line 278
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 279
    .line 280
    .line 281
    const v4, -0x406a3d71    # -1.17f

    .line 282
    .line 283
    .line 284
    const/high16 v6, -0x3fc00000    # -3.0f

    .line 285
    .line 286
    const v7, 0x40c7ae14    # 6.24f

    .line 287
    .line 288
    .line 289
    const v8, 0x4098a3d7    # 4.77f

    .line 290
    .line 291
    .line 292
    invoke-virtual {v2, v4, v8, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 293
    .line 294
    .line 295
    const/high16 v25, 0x40a00000    # 5.0f

    .line 296
    .line 297
    const v26, 0x3fe147ae    # 1.76f

    .line 298
    .line 299
    .line 300
    const v21, 0x3faf5c29    # 1.37f

    .line 301
    .line 302
    .line 303
    const v22, 0x3f8ccccd    # 1.1f

    .line 304
    .line 305
    .line 306
    const v23, 0x40470a3d    # 3.11f

    .line 307
    .line 308
    .line 309
    const v24, 0x3fe147ae    # 1.76f

    .line 310
    .line 311
    .line 312
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 313
    .line 314
    .line 315
    const v4, -0x40d70a3d    # -0.66f

    .line 316
    .line 317
    .line 318
    const v6, -0x401eb852    # -1.76f

    .line 319
    .line 320
    .line 321
    const/high16 v7, 0x40a00000    # 5.0f

    .line 322
    .line 323
    const v8, 0x406851ec    # 3.63f

    .line 324
    .line 325
    .line 326
    invoke-virtual {v2, v8, v4, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 327
    .line 328
    .line 329
    const/high16 v25, 0x41600000    # 14.0f

    .line 330
    .line 331
    const/high16 v26, 0x41400000    # 12.0f

    .line 332
    .line 333
    const v21, 0x4172b852    # 15.17f

    .line 334
    .line 335
    .line 336
    const v22, 0x418628f6    # 16.77f

    .line 337
    .line 338
    .line 339
    const/high16 v23, 0x41600000    # 14.0f

    .line 340
    .line 341
    const v24, 0x416851ec    # 14.52f

    .line 342
    .line 343
    .line 344
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 345
    .line 346
    .line 347
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 348
    .line 349
    .line 350
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 351
    .line 352
    .line 353
    move-result-object v2

    .line 354
    const v6, 0x3e99999a    # 0.3f

    .line 355
    .line 356
    .line 357
    const v8, 0x3e99999a    # 0.3f

    .line 358
    .line 359
    .line 360
    const/4 v7, 0x0

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
    const/4 v2, 0x0

    .line 377
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

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
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 389
    .line 390
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 391
    .line 392
    .line 393
    const v4, 0x41931eb8    # 18.39f

    .line 394
    .line 395
    .line 396
    const v6, 0x40e70a3d    # 7.22f

    .line 397
    .line 398
    .line 399
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 400
    .line 401
    .line 402
    const/high16 v25, 0x41800000    # 16.0f

    .line 403
    .line 404
    const v21, 0x4187851f    # 16.94f

    .line 405
    .line 406
    .line 407
    const v22, 0x4104f5c3    # 8.31f

    .line 408
    .line 409
    .line 410
    const/high16 v23, 0x41800000    # 16.0f

    .line 411
    .line 412
    const v24, 0x4120cccd    # 10.05f

    .line 413
    .line 414
    .line 415
    move-object/from16 v20, v2

    .line 416
    .line 417
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 418
    .line 419
    .line 420
    const v4, 0x406c28f6    # 3.69f

    .line 421
    .line 422
    .line 423
    const v6, 0x4018f5c3    # 2.39f

    .line 424
    .line 425
    .line 426
    const v7, 0x3f70a3d7    # 0.94f

    .line 427
    .line 428
    .line 429
    const v8, 0x4098f5c3    # 4.78f

    .line 430
    .line 431
    .line 432
    invoke-virtual {v2, v7, v4, v6, v8}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 433
    .line 434
    .line 435
    const/high16 v25, 0x41a00000    # 20.0f

    .line 436
    .line 437
    const v21, 0x419b3333    # 19.4f

    .line 438
    .line 439
    .line 440
    const v22, 0x41773333    # 15.45f

    .line 441
    .line 442
    .line 443
    const/high16 v23, 0x41a00000    # 20.0f

    .line 444
    .line 445
    const v24, 0x415ccccd    # 13.8f

    .line 446
    .line 447
    .line 448
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 449
    .line 450
    .line 451
    const v4, 0x4108cccd    # 8.55f

    .line 452
    .line 453
    .line 454
    const v6, 0x419b3333    # 19.4f

    .line 455
    .line 456
    .line 457
    const v7, 0x41931eb8    # 18.39f

    .line 458
    .line 459
    .line 460
    const v8, 0x40e70a3d    # 7.22f

    .line 461
    .line 462
    .line 463
    invoke-virtual {v2, v6, v4, v7, v8}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 464
    .line 465
    .line 466
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 467
    .line 468
    .line 469
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 470
    .line 471
    .line 472
    move-result-object v2

    .line 473
    const v6, 0x3e99999a    # 0.3f

    .line 474
    .line 475
    .line 476
    const v8, 0x3e99999a    # 0.3f

    .line 477
    .line 478
    .line 479
    const/4 v7, 0x0

    .line 480
    const-string v4, ""

    .line 481
    .line 482
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 483
    .line 484
    .line 485
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 486
    .line 487
    .line 488
    move-result v3

    .line 489
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 490
    .line 491
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 492
    .line 493
    .line 494
    move-result-wide v6

    .line 495
    const/4 v0, 0x0

    .line 496
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 497
    .line 498
    .line 499
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 500
    .line 501
    .line 502
    move-result v10

    .line 503
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 504
    .line 505
    .line 506
    move-result v11

    .line 507
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 508
    .line 509
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 510
    .line 511
    .line 512
    const/high16 v0, 0x40000000    # 2.0f

    .line 513
    .line 514
    const/high16 v2, 0x41400000    # 12.0f

    .line 515
    .line 516
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 517
    .line 518
    .line 519
    const/high16 v17, 0x40000000    # 2.0f

    .line 520
    .line 521
    const/high16 v18, 0x41400000    # 12.0f

    .line 522
    .line 523
    const v13, 0x40cf5c29    # 6.48f

    .line 524
    .line 525
    .line 526
    const/high16 v14, 0x40000000    # 2.0f

    .line 527
    .line 528
    const/high16 v15, 0x40000000    # 2.0f

    .line 529
    .line 530
    const v16, 0x40cf5c29    # 6.48f

    .line 531
    .line 532
    .line 533
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 534
    .line 535
    .line 536
    const/high16 v17, 0x41200000    # 10.0f

    .line 537
    .line 538
    const/high16 v18, 0x41200000    # 10.0f

    .line 539
    .line 540
    const/4 v13, 0x0

    .line 541
    const v14, 0x40b0a3d7    # 5.52f

    .line 542
    .line 543
    .line 544
    const v15, 0x408f5c29    # 4.48f

    .line 545
    .line 546
    .line 547
    const/high16 v16, 0x41200000    # 10.0f

    .line 548
    .line 549
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 550
    .line 551
    .line 552
    const v0, -0x3f70a3d7    # -4.48f

    .line 553
    .line 554
    .line 555
    const/high16 v2, -0x3ee00000    # -10.0f

    .line 556
    .line 557
    const/high16 v4, 0x41200000    # 10.0f

    .line 558
    .line 559
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 560
    .line 561
    .line 562
    const/high16 v17, 0x41400000    # 12.0f

    .line 563
    .line 564
    const/high16 v18, 0x40000000    # 2.0f

    .line 565
    .line 566
    const/high16 v13, 0x41b00000    # 22.0f

    .line 567
    .line 568
    const v14, 0x40cf5c29    # 6.48f

    .line 569
    .line 570
    .line 571
    const v15, 0x418c28f6    # 17.52f

    .line 572
    .line 573
    .line 574
    const/high16 v16, 0x40000000    # 2.0f

    .line 575
    .line 576
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 577
    .line 578
    .line 579
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 580
    .line 581
    .line 582
    const v0, 0x41863d71    # 16.78f

    .line 583
    .line 584
    .line 585
    const v2, 0x40b3851f    # 5.61f

    .line 586
    .line 587
    .line 588
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 589
    .line 590
    .line 591
    const/high16 v17, 0x40800000    # 4.0f

    .line 592
    .line 593
    const/high16 v18, 0x41400000    # 12.0f

    .line 594
    .line 595
    const v13, 0x40933333    # 4.6f

    .line 596
    .line 597
    .line 598
    const v14, 0x41773333    # 15.45f

    .line 599
    .line 600
    .line 601
    const/high16 v15, 0x40800000    # 4.0f

    .line 602
    .line 603
    const v16, 0x415ccccd    # 13.8f

    .line 604
    .line 605
    .line 606
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 607
    .line 608
    .line 609
    const v0, -0x3fa33333    # -3.45f

    .line 610
    .line 611
    .line 612
    const v2, -0x3f670a3d    # -4.78f

    .line 613
    .line 614
    .line 615
    const v4, 0x3fce147b    # 1.61f

    .line 616
    .line 617
    .line 618
    const v6, 0x3f19999a    # 0.6f

    .line 619
    .line 620
    .line 621
    invoke-virtual {v12, v6, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 622
    .line 623
    .line 624
    const/high16 v17, 0x41000000    # 8.0f

    .line 625
    .line 626
    const v13, 0x40e1eb85    # 7.06f

    .line 627
    .line 628
    .line 629
    const v14, 0x4104f5c3    # 8.31f

    .line 630
    .line 631
    .line 632
    const/high16 v15, 0x41000000    # 8.0f

    .line 633
    .line 634
    const v16, 0x4120cccd    # 10.05f

    .line 635
    .line 636
    .line 637
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 638
    .line 639
    .line 640
    const v0, 0x417b0a3d    # 15.69f

    .line 641
    .line 642
    .line 643
    const v2, 0x40e1eb85    # 7.06f

    .line 644
    .line 645
    .line 646
    const v4, 0x41863d71    # 16.78f

    .line 647
    .line 648
    .line 649
    const v6, 0x40b3851f    # 5.61f

    .line 650
    .line 651
    .line 652
    invoke-virtual {v12, v2, v0, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 653
    .line 654
    .line 655
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 656
    .line 657
    .line 658
    const/high16 v0, 0x41a00000    # 20.0f

    .line 659
    .line 660
    const/high16 v2, 0x41400000    # 12.0f

    .line 661
    .line 662
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 663
    .line 664
    .line 665
    const/high16 v17, -0x3f600000    # -5.0f

    .line 666
    .line 667
    const v18, -0x401eb852    # -1.76f

    .line 668
    .line 669
    .line 670
    const v13, -0x400e147b    # -1.89f

    .line 671
    .line 672
    .line 673
    const/4 v14, 0x0

    .line 674
    const v15, -0x3f97ae14    # -3.63f

    .line 675
    .line 676
    .line 677
    const v16, -0x40d70a3d    # -0.66f

    .line 678
    .line 679
    .line 680
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 681
    .line 682
    .line 683
    const/high16 v17, 0x40400000    # 3.0f

    .line 684
    .line 685
    const v18, -0x3f3851ec    # -6.24f

    .line 686
    .line 687
    .line 688
    const v13, 0x3fea3d71    # 1.83f

    .line 689
    .line 690
    .line 691
    const v14, -0x4043d70a    # -1.47f

    .line 692
    .line 693
    .line 694
    const/high16 v15, 0x40400000    # 3.0f

    .line 695
    .line 696
    const v16, -0x3f928f5c    # -3.71f

    .line 697
    .line 698
    .line 699
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 700
    .line 701
    .line 702
    const v0, 0x410d47ae    # 8.83f

    .line 703
    .line 704
    .line 705
    const v2, 0x40e75c29    # 7.23f

    .line 706
    .line 707
    .line 708
    const v4, 0x40b851ec    # 5.76f

    .line 709
    .line 710
    .line 711
    const/high16 v6, 0x40e00000    # 7.0f

    .line 712
    .line 713
    invoke-virtual {v12, v0, v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 714
    .line 715
    .line 716
    const/high16 v17, 0x41400000    # 12.0f

    .line 717
    .line 718
    const/high16 v18, 0x40800000    # 4.0f

    .line 719
    .line 720
    const v13, 0x4105eb85    # 8.37f

    .line 721
    .line 722
    .line 723
    const v14, 0x40951eb8    # 4.66f

    .line 724
    .line 725
    .line 726
    const v15, 0x4121c28f    # 10.11f

    .line 727
    .line 728
    .line 729
    const/high16 v16, 0x40800000    # 4.0f

    .line 730
    .line 731
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 732
    .line 733
    .line 734
    const v0, 0x3f28f5c3    # 0.66f

    .line 735
    .line 736
    .line 737
    const v2, 0x3fe147ae    # 1.76f

    .line 738
    .line 739
    .line 740
    const/high16 v4, 0x40a00000    # 5.0f

    .line 741
    .line 742
    const v6, 0x406851ec    # 3.63f

    .line 743
    .line 744
    .line 745
    invoke-virtual {v12, v6, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 746
    .line 747
    .line 748
    const/high16 v17, -0x3fc00000    # -3.0f

    .line 749
    .line 750
    const v18, 0x40c7ae14    # 6.24f

    .line 751
    .line 752
    .line 753
    const v13, -0x4015c28f    # -1.83f

    .line 754
    .line 755
    .line 756
    const v14, 0x3fbc28f6    # 1.47f

    .line 757
    .line 758
    .line 759
    const/high16 v15, -0x3fc00000    # -3.0f

    .line 760
    .line 761
    const v16, 0x406d70a4    # 3.71f

    .line 762
    .line 763
    .line 764
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 765
    .line 766
    .line 767
    const v0, 0x3f95c28f    # 1.17f

    .line 768
    .line 769
    .line 770
    const/high16 v2, 0x40400000    # 3.0f

    .line 771
    .line 772
    const v4, 0x40c7ae14    # 6.24f

    .line 773
    .line 774
    .line 775
    const v6, 0x4098a3d7    # 4.77f

    .line 776
    .line 777
    .line 778
    invoke-virtual {v12, v0, v6, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 779
    .line 780
    .line 781
    const/high16 v17, 0x41400000    # 12.0f

    .line 782
    .line 783
    const/high16 v18, 0x41a00000    # 20.0f

    .line 784
    .line 785
    const v13, 0x417a147b    # 15.63f

    .line 786
    .line 787
    .line 788
    const v14, 0x419ab852    # 19.34f

    .line 789
    .line 790
    .line 791
    const v15, 0x415e3d71    # 13.89f

    .line 792
    .line 793
    .line 794
    const/high16 v16, 0x41a00000    # 20.0f

    .line 795
    .line 796
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 797
    .line 798
    .line 799
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 800
    .line 801
    .line 802
    const v0, 0x41863d71    # 16.78f

    .line 803
    .line 804
    .line 805
    const v2, 0x41931eb8    # 18.39f

    .line 806
    .line 807
    .line 808
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 809
    .line 810
    .line 811
    const/high16 v17, 0x41800000    # 16.0f

    .line 812
    .line 813
    const/high16 v18, 0x41400000    # 12.0f

    .line 814
    .line 815
    const v13, 0x4187851f    # 16.94f

    .line 816
    .line 817
    .line 818
    const v14, 0x417b0a3d    # 15.69f

    .line 819
    .line 820
    .line 821
    const/high16 v15, 0x41800000    # 16.0f

    .line 822
    .line 823
    const v16, 0x415f3333    # 13.95f

    .line 824
    .line 825
    .line 826
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 827
    .line 828
    .line 829
    const v0, -0x3f93d70a    # -3.69f

    .line 830
    .line 831
    .line 832
    const v2, -0x3f670a3d    # -4.78f

    .line 833
    .line 834
    .line 835
    const v4, 0x4018f5c3    # 2.39f

    .line 836
    .line 837
    .line 838
    const v6, 0x3f70a3d7    # 0.94f

    .line 839
    .line 840
    .line 841
    invoke-virtual {v12, v6, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 842
    .line 843
    .line 844
    const/high16 v17, 0x41a00000    # 20.0f

    .line 845
    .line 846
    const v13, 0x419b3333    # 19.4f

    .line 847
    .line 848
    .line 849
    const v14, 0x4108cccd    # 8.55f

    .line 850
    .line 851
    .line 852
    const/high16 v15, 0x41a00000    # 20.0f

    .line 853
    .line 854
    const v16, 0x41233333    # 10.2f

    .line 855
    .line 856
    .line 857
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 858
    .line 859
    .line 860
    const v0, 0x41773333    # 15.45f

    .line 861
    .line 862
    .line 863
    const v2, 0x419b3333    # 19.4f

    .line 864
    .line 865
    .line 866
    const v4, 0x41863d71    # 16.78f

    .line 867
    .line 868
    .line 869
    const v6, 0x41931eb8    # 18.39f

    .line 870
    .line 871
    .line 872
    invoke-virtual {v12, v2, v0, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 873
    .line 874
    .line 875
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 876
    .line 877
    .line 878
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 879
    .line 880
    .line 881
    move-result-object v2

    .line 882
    const/16 v16, 0x3800

    .line 883
    .line 884
    const/16 v17, 0x0

    .line 885
    .line 886
    const/high16 v6, 0x3f800000    # 1.0f

    .line 887
    .line 888
    const/high16 v8, 0x3f800000    # 1.0f

    .line 889
    .line 890
    const/4 v7, 0x0

    .line 891
    const/high16 v12, 0x3f800000    # 1.0f

    .line 892
    .line 893
    const/4 v13, 0x0

    .line 894
    const/4 v14, 0x0

    .line 895
    const/4 v15, 0x0

    .line 896
    const-string v4, ""

    .line 897
    .line 898
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 899
    .line 900
    .line 901
    move-result-object v0

    .line 902
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 903
    .line 904
    .line 905
    move-result-object v0

    .line 906
    sput-object v0, Landroidx/compose/material/icons/twotone/SportsBaseballKt;->_sportsBaseball:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 907
    .line 908
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 909
    .line 910
    .line 911
    return-object v0
.end method
