.class public final Landroidx/compose/material/icons/twotone/JoinFullKt;
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
        "Landroidx/compose/material/icons/Icons$TwoTone;",
        "getJoinFull",
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
        "SMAP\nJoinFull.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JoinFull.kt\nandroidx/compose/material/icons/twotone/JoinFullKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,61:1\n212#2,12:62\n233#2,18:75\n253#2:112\n233#2,18:113\n253#2:150\n233#2,18:151\n253#2:188\n174#3:74\n705#4,2:93\n717#4,2:95\n719#4,11:101\n705#4,2:131\n717#4,2:133\n719#4,11:139\n705#4,2:169\n717#4,2:171\n719#4,11:177\n72#5,4:97\n72#5,4:135\n72#5,4:173\n*S KotlinDebug\n*F\n+ 1 JoinFull.kt\nandroidx/compose/material/icons/twotone/JoinFullKt\n*L\n29#1:62,12\n30#1:75,18\n30#1:112\n36#1:113,18\n36#1:150\n46#1:151,18\n46#1:188\n29#1:74\n30#1:93,2\n30#1:95,2\n30#1:101,11\n36#1:131,2\n36#1:133,2\n36#1:139,11\n46#1:169,2\n46#1:171,2\n46#1:177,11\n30#1:97,4\n36#1:135,4\n46#1:173,4\n*E\n"
    }
.end annotation


# static fields
.field private static _joinFull:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getJoinFull(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 28

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/JoinFullKt;->_joinFull:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.JoinFull"

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
    const/high16 v4, 0x41100000    # 9.0f

    .line 71
    .line 72
    const/high16 v6, 0x41400000    # 12.0f

    .line 73
    .line 74
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v26, 0x40c00000    # 6.0f

    .line 78
    .line 79
    const/16 v27, 0x0

    .line 80
    .line 81
    const/high16 v21, 0x40400000    # 3.0f

    .line 82
    .line 83
    const v22, 0x40b7ae14    # 5.74f

    .line 84
    .line 85
    .line 86
    const/16 v23, 0x0

    .line 87
    .line 88
    const/16 v24, 0x1

    .line 89
    .line 90
    const/16 v25, 0x0

    .line 91
    .line 92
    move-object/from16 v20, v2

    .line 93
    .line 94
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 95
    .line 96
    .line 97
    const/high16 v26, -0x3f400000    # -6.0f

    .line 98
    .line 99
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 100
    .line 101
    .line 102
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 103
    .line 104
    .line 105
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 106
    .line 107
    .line 108
    move-result-object v2

    .line 109
    const/16 v16, 0x3800

    .line 110
    .line 111
    const/16 v17, 0x0

    .line 112
    .line 113
    const/high16 v6, 0x3f800000    # 1.0f

    .line 114
    .line 115
    const/high16 v8, 0x3f800000    # 1.0f

    .line 116
    .line 117
    const/4 v7, 0x0

    .line 118
    const/high16 v9, 0x3f800000    # 1.0f

    .line 119
    .line 120
    const/high16 v12, 0x3f800000    # 1.0f

    .line 121
    .line 122
    const/4 v13, 0x0

    .line 123
    const/4 v14, 0x0

    .line 124
    const/4 v15, 0x0

    .line 125
    const-string v4, ""

    .line 126
    .line 127
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 128
    .line 129
    .line 130
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 131
    .line 132
    .line 133
    move-result v3

    .line 134
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 135
    .line 136
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 137
    .line 138
    .line 139
    move-result-wide v6

    .line 140
    const/4 v2, 0x0

    .line 141
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 142
    .line 143
    .line 144
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 145
    .line 146
    .line 147
    move-result v10

    .line 148
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 149
    .line 150
    .line 151
    move-result v11

    .line 152
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 153
    .line 154
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 155
    .line 156
    .line 157
    const/high16 v4, 0x40f00000    # 7.5f

    .line 158
    .line 159
    const/high16 v6, 0x41400000    # 12.0f

    .line 160
    .line 161
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 162
    .line 163
    .line 164
    const v25, 0x4041eb85    # 3.03f

    .line 165
    .line 166
    .line 167
    const/high16 v26, -0x3f300000    # -6.5f

    .line 168
    .line 169
    const/16 v21, 0x0

    .line 170
    .line 171
    const v22, -0x4087ae14    # -0.97f

    .line 172
    .line 173
    .line 174
    const v23, 0x3e6b851f    # 0.23f

    .line 175
    .line 176
    .line 177
    const v24, -0x3f7ae148    # -4.16f

    .line 178
    .line 179
    .line 180
    move-object/from16 v20, v2

    .line 181
    .line 182
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 183
    .line 184
    .line 185
    const/high16 v25, 0x41000000    # 8.0f

    .line 186
    .line 187
    const/high16 v26, 0x40a00000    # 5.0f

    .line 188
    .line 189
    const/high16 v21, 0x411c0000    # 9.75f

    .line 190
    .line 191
    const v22, 0x40a6147b    # 5.19f

    .line 192
    .line 193
    .line 194
    const v23, 0x410e6666    # 8.9f

    .line 195
    .line 196
    .line 197
    const/high16 v24, 0x40a00000    # 5.0f

    .line 198
    .line 199
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 200
    .line 201
    .line 202
    const/high16 v25, -0x3f200000    # -7.0f

    .line 203
    .line 204
    const/high16 v26, 0x40e00000    # 7.0f

    .line 205
    .line 206
    const v21, -0x3f88f5c3    # -3.86f

    .line 207
    .line 208
    .line 209
    const/16 v22, 0x0

    .line 210
    .line 211
    const/high16 v23, -0x3f200000    # -7.0f

    .line 212
    .line 213
    const v24, 0x4048f5c3    # 3.14f

    .line 214
    .line 215
    .line 216
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 217
    .line 218
    .line 219
    const v4, 0x4048f5c3    # 3.14f

    .line 220
    .line 221
    .line 222
    const/high16 v6, 0x40e00000    # 7.0f

    .line 223
    .line 224
    invoke-virtual {v2, v4, v6, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 225
    .line 226
    .line 227
    const v25, 0x4021eb85    # 2.53f

    .line 228
    .line 229
    .line 230
    const/high16 v26, -0x41000000    # -0.5f

    .line 231
    .line 232
    const v21, 0x3f666666    # 0.9f

    .line 233
    .line 234
    .line 235
    const/high16 v23, 0x3fe00000    # 1.75f

    .line 236
    .line 237
    const v24, -0x41bd70a4    # -0.19f

    .line 238
    .line 239
    .line 240
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 241
    .line 242
    .line 243
    const/high16 v25, 0x40f00000    # 7.5f

    .line 244
    .line 245
    const/high16 v26, 0x41400000    # 12.0f

    .line 246
    .line 247
    const v21, 0x40f75c29    # 7.73f

    .line 248
    .line 249
    .line 250
    const v22, 0x418147ae    # 16.16f

    .line 251
    .line 252
    .line 253
    const/high16 v23, 0x40f00000    # 7.5f

    .line 254
    .line 255
    const v24, 0x414f851f    # 12.97f

    .line 256
    .line 257
    .line 258
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 259
    .line 260
    .line 261
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 262
    .line 263
    .line 264
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 265
    .line 266
    .line 267
    move-result-object v2

    .line 268
    const/high16 v6, 0x3f800000    # 1.0f

    .line 269
    .line 270
    const/4 v7, 0x0

    .line 271
    const-string v4, ""

    .line 272
    .line 273
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 274
    .line 275
    .line 276
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 277
    .line 278
    .line 279
    move-result v3

    .line 280
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 281
    .line 282
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 283
    .line 284
    .line 285
    move-result-wide v6

    .line 286
    const/4 v0, 0x0

    .line 287
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 288
    .line 289
    .line 290
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 291
    .line 292
    .line 293
    move-result v10

    .line 294
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 295
    .line 296
    .line 297
    move-result v11

    .line 298
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 299
    .line 300
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 301
    .line 302
    .line 303
    const/high16 v0, 0x41800000    # 16.0f

    .line 304
    .line 305
    const/high16 v2, 0x40a00000    # 5.0f

    .line 306
    .line 307
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 308
    .line 309
    .line 310
    const v17, -0x3fde147b    # -2.53f

    .line 311
    .line 312
    .line 313
    const/high16 v18, 0x3f000000    # 0.5f

    .line 314
    .line 315
    const v13, -0x4099999a    # -0.9f

    .line 316
    .line 317
    .line 318
    const/high16 v15, -0x40200000    # -1.75f

    .line 319
    .line 320
    const v16, 0x3e428f5c    # 0.19f

    .line 321
    .line 322
    .line 323
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 324
    .line 325
    .line 326
    const v17, 0x4041eb85    # 3.03f

    .line 327
    .line 328
    .line 329
    const/high16 v18, 0x40d00000    # 6.5f

    .line 330
    .line 331
    const v13, 0x40333333    # 2.8f

    .line 332
    .line 333
    .line 334
    const v14, 0x4015c28f    # 2.34f

    .line 335
    .line 336
    .line 337
    const v15, 0x4041eb85    # 3.03f

    .line 338
    .line 339
    .line 340
    const v16, 0x40b0f5c3    # 5.53f

    .line 341
    .line 342
    .line 343
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 344
    .line 345
    .line 346
    const v17, -0x3fbe147b    # -3.03f

    .line 347
    .line 348
    .line 349
    const/4 v13, 0x0

    .line 350
    const v14, 0x3f7851ec    # 0.97f

    .line 351
    .line 352
    .line 353
    const v15, -0x41947ae1    # -0.23f

    .line 354
    .line 355
    .line 356
    const v16, 0x40851eb8    # 4.16f

    .line 357
    .line 358
    .line 359
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 360
    .line 361
    .line 362
    const/high16 v17, 0x41800000    # 16.0f

    .line 363
    .line 364
    const/high16 v18, 0x41980000    # 19.0f

    .line 365
    .line 366
    const/high16 v13, 0x41640000    # 14.25f

    .line 367
    .line 368
    const v14, 0x41967ae1    # 18.81f

    .line 369
    .line 370
    .line 371
    const v15, 0x4171999a    # 15.1f

    .line 372
    .line 373
    .line 374
    const/high16 v16, 0x41980000    # 19.0f

    .line 375
    .line 376
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 377
    .line 378
    .line 379
    const/high16 v17, 0x40e00000    # 7.0f

    .line 380
    .line 381
    const/high16 v18, -0x3f200000    # -7.0f

    .line 382
    .line 383
    const v13, 0x40770a3d    # 3.86f

    .line 384
    .line 385
    .line 386
    const/4 v14, 0x0

    .line 387
    const/high16 v15, 0x40e00000    # 7.0f

    .line 388
    .line 389
    const v16, -0x3fb70a3d    # -3.14f

    .line 390
    .line 391
    .line 392
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 393
    .line 394
    .line 395
    const v0, 0x419ee148    # 19.86f

    .line 396
    .line 397
    .line 398
    const/high16 v2, 0x41800000    # 16.0f

    .line 399
    .line 400
    const/high16 v4, 0x40a00000    # 5.0f

    .line 401
    .line 402
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 403
    .line 404
    .line 405
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 406
    .line 407
    .line 408
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 409
    .line 410
    .line 411
    move-result-object v2

    .line 412
    const/16 v16, 0x3800

    .line 413
    .line 414
    const/16 v17, 0x0

    .line 415
    .line 416
    const/high16 v6, 0x3f800000    # 1.0f

    .line 417
    .line 418
    const/4 v7, 0x0

    .line 419
    const/high16 v12, 0x3f800000    # 1.0f

    .line 420
    .line 421
    const/4 v13, 0x0

    .line 422
    const/4 v15, 0x0

    .line 423
    const-string v4, ""

    .line 424
    .line 425
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 426
    .line 427
    .line 428
    move-result-object v0

    .line 429
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 430
    .line 431
    .line 432
    move-result-object v0

    .line 433
    sput-object v0, Landroidx/compose/material/icons/twotone/JoinFullKt;->_joinFull:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 434
    .line 435
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 436
    .line 437
    .line 438
    return-object v0
.end method
