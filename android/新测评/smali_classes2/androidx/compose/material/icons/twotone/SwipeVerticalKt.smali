.class public final Landroidx/compose/material/icons/twotone/SwipeVerticalKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_swipeVertical",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "SwipeVertical",
        "Landroidx/compose/material/icons/Icons$TwoTone;",
        "getSwipeVertical",
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
        "SMAP\nSwipeVertical.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SwipeVertical.kt\nandroidx/compose/material/icons/twotone/SwipeVerticalKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,103:1\n212#2,12:104\n233#2,18:117\n253#2:154\n233#2,18:155\n253#2:192\n174#3:116\n705#4,2:135\n717#4,2:137\n719#4,11:143\n705#4,2:173\n717#4,2:175\n719#4,11:181\n72#5,4:139\n72#5,4:177\n*S KotlinDebug\n*F\n+ 1 SwipeVertical.kt\nandroidx/compose/material/icons/twotone/SwipeVerticalKt\n*L\n29#1:104,12\n30#1:117,18\n30#1:154\n44#1:155,18\n44#1:192\n29#1:116\n30#1:135,2\n30#1:137,2\n30#1:143,11\n44#1:173,2\n44#1:175,2\n44#1:181,11\n30#1:139,4\n44#1:177,4\n*E\n"
    }
.end annotation


# static fields
.field private static _swipeVertical:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getSwipeVertical(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/SwipeVerticalKt;->_swipeVertical:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.SwipeVertical"

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
    const v4, 0x418ab852    # 17.34f

    .line 71
    .line 72
    .line 73
    const v6, 0x41abeb85    # 21.49f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const/high16 v4, 0x41a00000    # 20.0f

    .line 80
    .line 81
    const/high16 v6, 0x41780000    # 15.5f

    .line 82
    .line 83
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 84
    .line 85
    .line 86
    const v4, -0x40051eb8    # -1.96f

    .line 87
    .line 88
    .line 89
    const v6, -0x3f628f5c    # -4.92f

    .line 90
    .line 91
    .line 92
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 93
    .line 94
    .line 95
    const v4, -0x409eb852    # -0.88f

    .line 96
    .line 97
    .line 98
    const v6, 0x4085c28f    # 4.18f

    .line 99
    .line 100
    .line 101
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 102
    .line 103
    .line 104
    const v4, -0x3ee4cccd    # -9.7f

    .line 105
    .line 106
    .line 107
    const v6, -0x3f766666    # -4.3f

    .line 108
    .line 109
    .line 110
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 111
    .line 112
    .line 113
    const/high16 v25, 0x3e800000    # 0.25f

    .line 114
    .line 115
    const v26, -0x40d70a3d    # -0.66f

    .line 116
    .line 117
    .line 118
    const v21, -0x421eb852    # -0.11f

    .line 119
    .line 120
    .line 121
    const/high16 v22, -0x41800000    # -0.25f

    .line 122
    .line 123
    const/16 v23, 0x0

    .line 124
    .line 125
    const v24, -0x40f33333    # -0.55f

    .line 126
    .line 127
    .line 128
    move-object/from16 v20, v2

    .line 129
    .line 130
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 131
    .line 132
    .line 133
    const v25, 0x3f28f5c3    # 0.66f

    .line 134
    .line 135
    .line 136
    const/high16 v26, 0x3e800000    # 0.25f

    .line 137
    .line 138
    const/high16 v21, 0x3e800000    # 0.25f

    .line 139
    .line 140
    const v22, -0x421eb852    # -0.11f

    .line 141
    .line 142
    .line 143
    const v23, 0x3f0ccccd    # 0.55f

    .line 144
    .line 145
    .line 146
    const/16 v24, 0x0

    .line 147
    .line 148
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 149
    .line 150
    .line 151
    const v4, 0x40b4cccd    # 5.65f

    .line 152
    .line 153
    .line 154
    const/high16 v6, 0x40200000    # 2.5f

    .line 155
    .line 156
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 157
    .line 158
    .line 159
    const v4, -0x40ca3d71    # -0.71f

    .line 160
    .line 161
    .line 162
    const v6, 0x3fce147b    # 1.61f

    .line 163
    .line 164
    .line 165
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 166
    .line 167
    .line 168
    const/high16 v4, 0x41400000    # 12.0f

    .line 169
    .line 170
    const v6, 0x41a10a3d    # 20.13f

    .line 171
    .line 172
    .line 173
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 174
    .line 175
    .line 176
    const v4, 0x418ab852    # 17.34f

    .line 177
    .line 178
    .line 179
    const v6, 0x41abeb85    # 21.49f

    .line 180
    .line 181
    .line 182
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 183
    .line 184
    .line 185
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 186
    .line 187
    .line 188
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 189
    .line 190
    .line 191
    move-result-object v2

    .line 192
    const/16 v16, 0x3800

    .line 193
    .line 194
    const/16 v17, 0x0

    .line 195
    .line 196
    const v6, 0x3e99999a    # 0.3f

    .line 197
    .line 198
    .line 199
    const v8, 0x3e99999a    # 0.3f

    .line 200
    .line 201
    .line 202
    const/4 v7, 0x0

    .line 203
    const/high16 v9, 0x3f800000    # 1.0f

    .line 204
    .line 205
    const/high16 v12, 0x3f800000    # 1.0f

    .line 206
    .line 207
    const/4 v13, 0x0

    .line 208
    const/4 v14, 0x0

    .line 209
    const/4 v15, 0x0

    .line 210
    const-string v4, ""

    .line 211
    .line 212
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 213
    .line 214
    .line 215
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 216
    .line 217
    .line 218
    move-result v3

    .line 219
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 220
    .line 221
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 222
    .line 223
    .line 224
    move-result-wide v6

    .line 225
    const/4 v0, 0x0

    .line 226
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 227
    .line 228
    .line 229
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 230
    .line 231
    .line 232
    move-result v10

    .line 233
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 234
    .line 235
    .line 236
    move-result v11

    .line 237
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 238
    .line 239
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 240
    .line 241
    .line 242
    const/high16 v0, 0x40000000    # 2.0f

    .line 243
    .line 244
    const/high16 v2, 0x3f800000    # 1.0f

    .line 245
    .line 246
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 247
    .line 248
    .line 249
    const/high16 v0, 0x40600000    # 3.5f

    .line 250
    .line 251
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 252
    .line 253
    .line 254
    const/high16 v0, 0x40c00000    # 6.0f

    .line 255
    .line 256
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 257
    .line 258
    .line 259
    const/high16 v0, 0x3fc00000    # 1.5f

    .line 260
    .line 261
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 262
    .line 263
    .line 264
    const/high16 v0, 0x40e00000    # 7.0f

    .line 265
    .line 266
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 267
    .line 268
    .line 269
    const/high16 v0, 0x40900000    # 4.5f

    .line 270
    .line 271
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 272
    .line 273
    .line 274
    const v0, 0x4082e148    # 4.09f

    .line 275
    .line 276
    .line 277
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 278
    .line 279
    .line 280
    const/high16 v17, -0x3fc00000    # -3.0f

    .line 281
    .line 282
    const v18, 0x40fd1eb8    # 7.91f

    .line 283
    .line 284
    .line 285
    const v13, -0x4011eb85    # -1.86f

    .line 286
    .line 287
    .line 288
    const v14, 0x40070a3d    # 2.11f

    .line 289
    .line 290
    .line 291
    const/high16 v15, -0x3fc00000    # -3.0f

    .line 292
    .line 293
    const v16, 0x409c28f6    # 4.88f

    .line 294
    .line 295
    .line 296
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 297
    .line 298
    .line 299
    const/high16 v0, 0x40400000    # 3.0f

    .line 300
    .line 301
    const v2, 0x40fd1eb8    # 7.91f

    .line 302
    .line 303
    .line 304
    const v4, 0x3f91eb85    # 1.14f

    .line 305
    .line 306
    .line 307
    const v6, 0x40b947ae    # 5.79f

    .line 308
    .line 309
    .line 310
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 311
    .line 312
    .line 313
    const/high16 v0, 0x41880000    # 17.0f

    .line 314
    .line 315
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 316
    .line 317
    .line 318
    const/high16 v0, 0x40c00000    # 6.0f

    .line 319
    .line 320
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 321
    .line 322
    .line 323
    const/high16 v0, 0x40600000    # 3.5f

    .line 324
    .line 325
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 326
    .line 327
    .line 328
    const/high16 v0, 0x41b00000    # 22.0f

    .line 329
    .line 330
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 331
    .line 332
    .line 333
    const/high16 v0, 0x40900000    # 4.5f

    .line 334
    .line 335
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 336
    .line 337
    .line 338
    const/high16 v0, 0x3f800000    # 1.0f

    .line 339
    .line 340
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 341
    .line 342
    .line 343
    const/high16 v0, -0x40400000    # -1.5f

    .line 344
    .line 345
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 346
    .line 347
    .line 348
    const v0, 0x400147ae    # 2.02f

    .line 349
    .line 350
    .line 351
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 352
    .line 353
    .line 354
    const/16 v17, 0x0

    .line 355
    .line 356
    const/high16 v18, 0x41400000    # 12.0f

    .line 357
    .line 358
    const v13, 0x3f90a3d7    # 1.13f

    .line 359
    .line 360
    .line 361
    const v14, 0x419170a4    # 18.18f

    .line 362
    .line 363
    .line 364
    const/4 v15, 0x0

    .line 365
    const v16, 0x4173851f    # 15.22f

    .line 366
    .line 367
    .line 368
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 369
    .line 370
    .line 371
    const v0, 0x404147ae    # 3.02f

    .line 372
    .line 373
    .line 374
    const/high16 v2, -0x3ef80000    # -8.5f

    .line 375
    .line 376
    const v4, 0x3f90a3d7    # 1.13f

    .line 377
    .line 378
    .line 379
    const v6, -0x3f3a3d71    # -6.18f

    .line 380
    .line 381
    .line 382
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 383
    .line 384
    .line 385
    const/high16 v0, 0x3f800000    # 1.0f

    .line 386
    .line 387
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 388
    .line 389
    .line 390
    const/high16 v0, 0x40000000    # 2.0f

    .line 391
    .line 392
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 393
    .line 394
    .line 395
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 396
    .line 397
    .line 398
    const v0, 0x41a1c28f    # 20.22f

    .line 399
    .line 400
    .line 401
    const/high16 v2, 0x41200000    # 10.0f

    .line 402
    .line 403
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 404
    .line 405
    .line 406
    const v0, -0x3f7b3333    # -4.15f

    .line 407
    .line 408
    .line 409
    const v2, 0x3c23d70a    # 0.01f

    .line 410
    .line 411
    .line 412
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 413
    .line 414
    .line 415
    const v17, -0x4119999a    # -0.45f

    .line 416
    .line 417
    .line 418
    const v18, 0x3da3d70a    # 0.08f

    .line 419
    .line 420
    .line 421
    const v13, -0x41dc28f6    # -0.16f

    .line 422
    .line 423
    .line 424
    const v14, -0x43dc28f6    # -0.01f

    .line 425
    .line 426
    .line 427
    const v15, -0x416147ae    # -0.31f

    .line 428
    .line 429
    .line 430
    const v16, 0x3ca3d70a    # 0.02f

    .line 431
    .line 432
    .line 433
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 434
    .line 435
    .line 436
    const v0, -0x40e8f5c3    # -0.59f

    .line 437
    .line 438
    .line 439
    const v2, 0x3e851eb8    # 0.26f

    .line 440
    .line 441
    .line 442
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 443
    .line 444
    .line 445
    const v0, 0x41533333    # 13.2f

    .line 446
    .line 447
    .line 448
    const/high16 v2, 0x40c80000    # 6.25f

    .line 449
    .line 450
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 451
    .line 452
    .line 453
    const v17, -0x3faccccd    # -3.3f

    .line 454
    .line 455
    .line 456
    const v18, -0x405d70a4    # -1.27f

    .line 457
    .line 458
    .line 459
    const v13, -0x40f0a3d7    # -0.56f

    .line 460
    .line 461
    .line 462
    const v14, -0x405eb852    # -1.26f

    .line 463
    .line 464
    .line 465
    const v15, -0x3ffd70a4    # -2.04f

    .line 466
    .line 467
    .line 468
    const v16, -0x4015c28f    # -1.83f

    .line 469
    .line 470
    .line 471
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 472
    .line 473
    .line 474
    const v0, -0x405d70a4    # -1.27f

    .line 475
    .line 476
    .line 477
    const v2, 0x40533333    # 3.3f

    .line 478
    .line 479
    .line 480
    const v4, -0x4015c28f    # -1.83f

    .line 481
    .line 482
    .line 483
    const v6, 0x40028f5c    # 2.04f

    .line 484
    .line 485
    .line 486
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 487
    .line 488
    .line 489
    const v0, 0x40533333    # 3.3f

    .line 490
    .line 491
    .line 492
    const v2, 0x40ee6666    # 7.45f

    .line 493
    .line 494
    .line 495
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 496
    .line 497
    .line 498
    const v0, -0x4010a3d7    # -1.87f

    .line 499
    .line 500
    .line 501
    const v2, 0x3ec7ae14    # 0.39f

    .line 502
    .line 503
    .line 504
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 505
    .line 506
    .line 507
    const v17, -0x4051eb85    # -1.36f

    .line 508
    .line 509
    .line 510
    const v18, 0x3f9ae148    # 1.21f

    .line 511
    .line 512
    .line 513
    const v13, -0x41bd70a4    # -0.19f

    .line 514
    .line 515
    .line 516
    const v14, 0x3d4ccccd    # 0.05f

    .line 517
    .line 518
    .line 519
    const v15, -0x40828f5c    # -0.99f

    .line 520
    .line 521
    .line 522
    const v16, 0x3e8a3d71    # 0.27f

    .line 523
    .line 524
    .line 525
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 526
    .line 527
    .line 528
    const/high16 v0, 0x41000000    # 8.0f

    .line 529
    .line 530
    const v2, 0x4199851f    # 19.19f

    .line 531
    .line 532
    .line 533
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 534
    .line 535
    .line 536
    const v0, 0x40d8f5c3    # 6.78f

    .line 537
    .line 538
    .line 539
    const v2, 0x402ae148    # 2.67f

    .line 540
    .line 541
    .line 542
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 543
    .line 544
    .line 545
    const v17, 0x3fc3d70a    # 1.53f

    .line 546
    .line 547
    .line 548
    const v18, -0x42dc28f6    # -0.04f

    .line 549
    .line 550
    .line 551
    const v13, 0x3efae148    # 0.49f

    .line 552
    .line 553
    .line 554
    const v14, 0x3e428f5c    # 0.19f

    .line 555
    .line 556
    .line 557
    const v15, 0x3f866666    # 1.05f

    .line 558
    .line 559
    .line 560
    const v16, 0x3e3851ec    # 0.18f

    .line 561
    .line 562
    .line 563
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 564
    .line 565
    .line 566
    const v0, 0x40bfae14    # 5.99f

    .line 567
    .line 568
    .line 569
    const v2, -0x3fd66666    # -2.65f

    .line 570
    .line 571
    .line 572
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 573
    .line 574
    .line 575
    const v17, 0x3f90a3d7    # 1.13f

    .line 576
    .line 577
    .line 578
    const v18, -0x3feb851f    # -2.32f

    .line 579
    .line 580
    .line 581
    const v13, 0x3f63d70a    # 0.89f

    .line 582
    .line 583
    .line 584
    const v14, -0x41333333    # -0.4f

    .line 585
    .line 586
    .line 587
    const v15, 0x3faf5c29    # 1.37f

    .line 588
    .line 589
    .line 590
    const v16, -0x404f5c29    # -1.38f

    .line 591
    .line 592
    .line 593
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 594
    .line 595
    .line 596
    const v0, -0x4051eb85    # -1.36f

    .line 597
    .line 598
    .line 599
    const v2, -0x3f551eb8    # -5.34f

    .line 600
    .line 601
    .line 602
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 603
    .line 604
    .line 605
    const v17, 0x41a1c28f    # 20.22f

    .line 606
    .line 607
    .line 608
    const/high16 v18, 0x41200000    # 10.0f

    .line 609
    .line 610
    const v13, 0x41aecccd    # 21.85f

    .line 611
    .line 612
    .line 613
    const v14, 0x412a6666    # 10.65f

    .line 614
    .line 615
    .line 616
    const v15, 0x41a8cccd    # 21.1f

    .line 617
    .line 618
    .line 619
    const v16, 0x4120a3d7    # 10.04f

    .line 620
    .line 621
    .line 622
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 623
    .line 624
    .line 625
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 626
    .line 627
    .line 628
    const v0, 0x418ab852    # 17.34f

    .line 629
    .line 630
    .line 631
    const v2, 0x41abeb85    # 21.49f

    .line 632
    .line 633
    .line 634
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 635
    .line 636
    .line 637
    const/high16 v0, 0x41a00000    # 20.0f

    .line 638
    .line 639
    const/high16 v2, 0x41780000    # 15.5f

    .line 640
    .line 641
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 642
    .line 643
    .line 644
    const v0, -0x40051eb8    # -1.96f

    .line 645
    .line 646
    .line 647
    const v2, -0x3f628f5c    # -4.92f

    .line 648
    .line 649
    .line 650
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 651
    .line 652
    .line 653
    const v0, -0x409eb852    # -0.88f

    .line 654
    .line 655
    .line 656
    const v2, 0x4085c28f    # 4.18f

    .line 657
    .line 658
    .line 659
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 660
    .line 661
    .line 662
    const v0, -0x3ee4cccd    # -9.7f

    .line 663
    .line 664
    .line 665
    const v2, -0x3f766666    # -4.3f

    .line 666
    .line 667
    .line 668
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 669
    .line 670
    .line 671
    const/high16 v17, 0x3e800000    # 0.25f

    .line 672
    .line 673
    const v18, -0x40d70a3d    # -0.66f

    .line 674
    .line 675
    .line 676
    const v13, -0x421eb852    # -0.11f

    .line 677
    .line 678
    .line 679
    const/high16 v14, -0x41800000    # -0.25f

    .line 680
    .line 681
    const/4 v15, 0x0

    .line 682
    const v16, -0x40f33333    # -0.55f

    .line 683
    .line 684
    .line 685
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 686
    .line 687
    .line 688
    const v17, 0x3f28f5c3    # 0.66f

    .line 689
    .line 690
    .line 691
    const/high16 v18, 0x3e800000    # 0.25f

    .line 692
    .line 693
    const/high16 v13, 0x3e800000    # 0.25f

    .line 694
    .line 695
    const v14, -0x421eb852    # -0.11f

    .line 696
    .line 697
    .line 698
    const v15, 0x3f0ccccd    # 0.55f

    .line 699
    .line 700
    .line 701
    const/16 v16, 0x0

    .line 702
    .line 703
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 704
    .line 705
    .line 706
    const v0, 0x40b4cccd    # 5.65f

    .line 707
    .line 708
    .line 709
    const/high16 v2, 0x40200000    # 2.5f

    .line 710
    .line 711
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 712
    .line 713
    .line 714
    const v0, -0x40ca3d71    # -0.71f

    .line 715
    .line 716
    .line 717
    const v2, 0x3fce147b    # 1.61f

    .line 718
    .line 719
    .line 720
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 721
    .line 722
    .line 723
    const/high16 v0, 0x41400000    # 12.0f

    .line 724
    .line 725
    const v2, 0x41a10a3d    # 20.13f

    .line 726
    .line 727
    .line 728
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 729
    .line 730
    .line 731
    const v0, 0x418ab852    # 17.34f

    .line 732
    .line 733
    .line 734
    const v2, 0x41abeb85    # 21.49f

    .line 735
    .line 736
    .line 737
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 738
    .line 739
    .line 740
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 741
    .line 742
    .line 743
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 744
    .line 745
    .line 746
    move-result-object v2

    .line 747
    const/16 v16, 0x3800

    .line 748
    .line 749
    const/16 v17, 0x0

    .line 750
    .line 751
    const/high16 v6, 0x3f800000    # 1.0f

    .line 752
    .line 753
    const/high16 v8, 0x3f800000    # 1.0f

    .line 754
    .line 755
    const/4 v7, 0x0

    .line 756
    const/high16 v12, 0x3f800000    # 1.0f

    .line 757
    .line 758
    const/4 v13, 0x0

    .line 759
    const/4 v14, 0x0

    .line 760
    const/4 v15, 0x0

    .line 761
    const-string v4, ""

    .line 762
    .line 763
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 764
    .line 765
    .line 766
    move-result-object v0

    .line 767
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 768
    .line 769
    .line 770
    move-result-object v0

    .line 771
    sput-object v0, Landroidx/compose/material/icons/twotone/SwipeVerticalKt;->_swipeVertical:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 772
    .line 773
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 774
    .line 775
    .line 776
    return-object v0
.end method
