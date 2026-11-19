.class public final Landroidx/compose/material/icons/twotone/SailingKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_sailing",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "Sailing",
        "Landroidx/compose/material/icons/Icons$TwoTone;",
        "getSailing",
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
        "SMAP\nSailing.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sailing.kt\nandroidx/compose/material/icons/twotone/SailingKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,100:1\n212#2,12:101\n233#2,18:114\n253#2:151\n233#2,18:152\n253#2:189\n174#3:113\n705#4,2:132\n717#4,2:134\n719#4,11:140\n705#4,2:170\n717#4,2:172\n719#4,11:178\n72#5,4:136\n72#5,4:174\n*S KotlinDebug\n*F\n+ 1 Sailing.kt\nandroidx/compose/material/icons/twotone/SailingKt\n*L\n29#1:101,12\n30#1:114,18\n30#1:151\n43#1:152,18\n43#1:189\n29#1:113\n30#1:132,2\n30#1:134,2\n30#1:140,11\n43#1:170,2\n43#1:172,2\n43#1:178,11\n30#1:136,4\n43#1:174,4\n*E\n"
    }
.end annotation


# static fields
.field private static _sailing:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getSailing(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/SailingKt;->_sailing:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.Sailing"

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
    const/high16 v4, 0x41380000    # 11.5f

    .line 71
    .line 72
    const/high16 v6, 0x41100000    # 9.0f

    .line 73
    .line 74
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const v4, 0x40da8f5c    # 6.83f

    .line 78
    .line 79
    .line 80
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 81
    .line 82
    .line 83
    const v4, 0x4106147b    # 8.38f

    .line 84
    .line 85
    .line 86
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 87
    .line 88
    .line 89
    const/high16 v4, 0x41380000    # 11.5f

    .line 90
    .line 91
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 92
    .line 93
    .line 94
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 95
    .line 96
    .line 97
    const v4, 0x40a7ae14    # 5.24f

    .line 98
    .line 99
    .line 100
    const v6, 0x4176147b    # 15.38f

    .line 101
    .line 102
    .line 103
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 104
    .line 105
    .line 106
    const v25, 0x405a3d71    # 3.41f

    .line 107
    .line 108
    .line 109
    const v26, 0x40c851ec    # 6.26f

    .line 110
    .line 111
    .line 112
    const v21, 0x3fb5c28f    # 1.42f

    .line 113
    .line 114
    .line 115
    const v22, 0x3fc28f5c    # 1.52f

    .line 116
    .line 117
    .line 118
    const v23, 0x403851ec    # 2.88f

    .line 119
    .line 120
    .line 121
    const v24, 0x406e147b    # 3.72f

    .line 122
    .line 123
    .line 124
    move-object/from16 v20, v2

    .line 125
    .line 126
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 127
    .line 128
    .line 129
    const v4, -0x3f947ae1    # -3.68f

    .line 130
    .line 131
    .line 132
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 133
    .line 134
    .line 135
    const v25, 0x3ec7ae14    # 0.39f

    .line 136
    .line 137
    .line 138
    const/high16 v26, -0x3f800000    # -4.0f

    .line 139
    .line 140
    const v21, 0x3e570a3d    # 0.21f

    .line 141
    .line 142
    .line 143
    const v22, -0x40733333    # -1.1f

    .line 144
    .line 145
    .line 146
    const v23, 0x3ec7ae14    # 0.39f

    .line 147
    .line 148
    .line 149
    const v24, -0x3fe28f5c    # -2.46f

    .line 150
    .line 151
    .line 152
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 153
    .line 154
    .line 155
    const v25, 0x4176147b    # 15.38f

    .line 156
    .line 157
    .line 158
    const v26, 0x40a7ae14    # 5.24f

    .line 159
    .line 160
    .line 161
    const/high16 v21, 0x41780000    # 15.5f

    .line 162
    .line 163
    const v22, 0x40d6b852    # 6.71f

    .line 164
    .line 165
    .line 166
    const v23, 0x41773333    # 15.45f

    .line 167
    .line 168
    .line 169
    const v24, 0x40be6666    # 5.95f

    .line 170
    .line 171
    .line 172
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 173
    .line 174
    .line 175
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 176
    .line 177
    .line 178
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 179
    .line 180
    .line 181
    move-result-object v2

    .line 182
    const/16 v16, 0x3800

    .line 183
    .line 184
    const/16 v17, 0x0

    .line 185
    .line 186
    const v6, 0x3e99999a    # 0.3f

    .line 187
    .line 188
    .line 189
    const v8, 0x3e99999a    # 0.3f

    .line 190
    .line 191
    .line 192
    const/4 v7, 0x0

    .line 193
    const/high16 v9, 0x3f800000    # 1.0f

    .line 194
    .line 195
    const/high16 v12, 0x3f800000    # 1.0f

    .line 196
    .line 197
    const/4 v13, 0x0

    .line 198
    const/4 v14, 0x0

    .line 199
    const/4 v15, 0x0

    .line 200
    const-string v4, ""

    .line 201
    .line 202
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 203
    .line 204
    .line 205
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 206
    .line 207
    .line 208
    move-result v3

    .line 209
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 210
    .line 211
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 212
    .line 213
    .line 214
    move-result-wide v6

    .line 215
    const/4 v0, 0x0

    .line 216
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 217
    .line 218
    .line 219
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 220
    .line 221
    .line 222
    move-result v10

    .line 223
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 224
    .line 225
    .line 226
    move-result v11

    .line 227
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 228
    .line 229
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 230
    .line 231
    .line 232
    const/high16 v0, 0x41300000    # 11.0f

    .line 233
    .line 234
    const/high16 v2, 0x41580000    # 13.5f

    .line 235
    .line 236
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 237
    .line 238
    .line 239
    const/high16 v0, 0x40000000    # 2.0f

    .line 240
    .line 241
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 242
    .line 243
    .line 244
    const/high16 v0, 0x40400000    # 3.0f

    .line 245
    .line 246
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 247
    .line 248
    .line 249
    const/high16 v0, 0x41300000    # 11.0f

    .line 250
    .line 251
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 252
    .line 253
    .line 254
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 255
    .line 256
    .line 257
    const/high16 v0, 0x41380000    # 11.5f

    .line 258
    .line 259
    const/high16 v2, 0x41100000    # 9.0f

    .line 260
    .line 261
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 262
    .line 263
    .line 264
    const v0, 0x40da8f5c    # 6.83f

    .line 265
    .line 266
    .line 267
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 268
    .line 269
    .line 270
    const v0, 0x4106147b    # 8.38f

    .line 271
    .line 272
    .line 273
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 274
    .line 275
    .line 276
    const/high16 v0, 0x41380000    # 11.5f

    .line 277
    .line 278
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 279
    .line 280
    .line 281
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 282
    .line 283
    .line 284
    const/high16 v0, 0x41a80000    # 21.0f

    .line 285
    .line 286
    const/high16 v2, 0x41580000    # 13.5f

    .line 287
    .line 288
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 289
    .line 290
    .line 291
    const/high16 v17, 0x41480000    # 12.5f

    .line 292
    .line 293
    const/high16 v18, 0x3f800000    # 1.0f

    .line 294
    .line 295
    const/high16 v13, 0x41a80000    # 21.0f

    .line 296
    .line 297
    const/high16 v14, 0x40d00000    # 6.5f

    .line 298
    .line 299
    const/high16 v15, 0x41680000    # 14.5f

    .line 300
    .line 301
    const/high16 v16, 0x3f800000    # 1.0f

    .line 302
    .line 303
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 304
    .line 305
    .line 306
    const/high16 v17, 0x3f800000    # 1.0f

    .line 307
    .line 308
    const/high16 v18, 0x40d00000    # 6.5f

    .line 309
    .line 310
    const/4 v13, 0x0

    .line 311
    const/4 v14, 0x0

    .line 312
    const/high16 v15, 0x3f800000    # 1.0f

    .line 313
    .line 314
    const/high16 v16, 0x40400000    # 3.0f

    .line 315
    .line 316
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 317
    .line 318
    .line 319
    const/high16 v0, 0x40c00000    # 6.0f

    .line 320
    .line 321
    const/high16 v2, -0x40800000    # -1.0f

    .line 322
    .line 323
    invoke-virtual {v12, v2, v0, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 324
    .line 325
    .line 326
    const/high16 v0, 0x41a80000    # 21.0f

    .line 327
    .line 328
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 329
    .line 330
    .line 331
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 332
    .line 333
    .line 334
    const v0, 0x40a7ae14    # 5.24f

    .line 335
    .line 336
    .line 337
    const v2, 0x4176147b    # 15.38f

    .line 338
    .line 339
    .line 340
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 341
    .line 342
    .line 343
    const v17, 0x405a3d71    # 3.41f

    .line 344
    .line 345
    .line 346
    const v18, 0x40c851ec    # 6.26f

    .line 347
    .line 348
    .line 349
    const v13, 0x3fb5c28f    # 1.42f

    .line 350
    .line 351
    .line 352
    const v14, 0x3fc28f5c    # 1.52f

    .line 353
    .line 354
    .line 355
    const v15, 0x403851ec    # 2.88f

    .line 356
    .line 357
    .line 358
    const v16, 0x406e147b    # 3.72f

    .line 359
    .line 360
    .line 361
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 362
    .line 363
    .line 364
    const v0, -0x3f947ae1    # -3.68f

    .line 365
    .line 366
    .line 367
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 368
    .line 369
    .line 370
    const v17, 0x3ec7ae14    # 0.39f

    .line 371
    .line 372
    .line 373
    const/high16 v18, -0x3f800000    # -4.0f

    .line 374
    .line 375
    const v13, 0x3e570a3d    # 0.21f

    .line 376
    .line 377
    .line 378
    const v14, -0x40733333    # -1.1f

    .line 379
    .line 380
    .line 381
    const v15, 0x3ec7ae14    # 0.39f

    .line 382
    .line 383
    .line 384
    const v16, -0x3fe28f5c    # -2.46f

    .line 385
    .line 386
    .line 387
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 388
    .line 389
    .line 390
    const v17, 0x4176147b    # 15.38f

    .line 391
    .line 392
    .line 393
    const v18, 0x40a7ae14    # 5.24f

    .line 394
    .line 395
    .line 396
    const/high16 v13, 0x41780000    # 15.5f

    .line 397
    .line 398
    const v14, 0x40d6b852    # 6.71f

    .line 399
    .line 400
    .line 401
    const v15, 0x41773333    # 15.45f

    .line 402
    .line 403
    .line 404
    const v16, 0x40be6666    # 5.95f

    .line 405
    .line 406
    .line 407
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 408
    .line 409
    .line 410
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 411
    .line 412
    .line 413
    const/high16 v0, 0x41700000    # 15.0f

    .line 414
    .line 415
    const/high16 v2, 0x41b00000    # 22.0f

    .line 416
    .line 417
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 418
    .line 419
    .line 420
    const/high16 v0, 0x40000000    # 2.0f

    .line 421
    .line 422
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 423
    .line 424
    .line 425
    const v17, 0x40151eb8    # 2.33f

    .line 426
    .line 427
    .line 428
    const v18, 0x406eb852    # 3.73f

    .line 429
    .line 430
    .line 431
    const v13, 0x3e9eb852    # 0.31f

    .line 432
    .line 433
    .line 434
    const v14, 0x3fc3d70a    # 1.53f

    .line 435
    .line 436
    .line 437
    const v15, 0x3f947ae1    # 1.16f

    .line 438
    .line 439
    .line 440
    const v16, 0x4035c28f    # 2.84f

    .line 441
    .line 442
    .line 443
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 444
    .line 445
    .line 446
    const/high16 v17, 0x40c00000    # 6.0f

    .line 447
    .line 448
    const/high16 v18, 0x418c0000    # 17.5f

    .line 449
    .line 450
    const v13, 0x409f5c29    # 4.98f

    .line 451
    .line 452
    .line 453
    const v14, 0x4193ae14    # 18.46f

    .line 454
    .line 455
    .line 456
    const v15, 0x40b1999a    # 5.55f

    .line 457
    .line 458
    .line 459
    const v16, 0x4190147b    # 18.01f

    .line 460
    .line 461
    .line 462
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 463
    .line 464
    .line 465
    const/high16 v17, 0x41100000    # 9.0f

    .line 466
    .line 467
    const/high16 v18, 0x41980000    # 19.0f

    .line 468
    .line 469
    const v13, 0x40d75c29    # 6.73f

    .line 470
    .line 471
    .line 472
    const v14, 0x4192b852    # 18.34f

    .line 473
    .line 474
    .line 475
    const v15, 0x40f9999a    # 7.8f

    .line 476
    .line 477
    .line 478
    const/high16 v16, 0x41980000    # 19.0f

    .line 479
    .line 480
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 481
    .line 482
    .line 483
    const v0, 0x401147ae    # 2.27f

    .line 484
    .line 485
    .line 486
    const/high16 v2, -0x40400000    # -1.5f

    .line 487
    .line 488
    const v4, -0x40d70a3d    # -0.66f

    .line 489
    .line 490
    .line 491
    const/high16 v6, 0x40400000    # 3.0f

    .line 492
    .line 493
    invoke-virtual {v12, v0, v4, v6, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 494
    .line 495
    .line 496
    const/high16 v17, 0x40400000    # 3.0f

    .line 497
    .line 498
    const/high16 v18, 0x3fc00000    # 1.5f

    .line 499
    .line 500
    const v13, 0x3f3ae148    # 0.73f

    .line 501
    .line 502
    .line 503
    const v14, 0x3f570a3d    # 0.84f

    .line 504
    .line 505
    .line 506
    const v15, 0x3fe66666    # 1.8f

    .line 507
    .line 508
    .line 509
    const/high16 v16, 0x3fc00000    # 1.5f

    .line 510
    .line 511
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 512
    .line 513
    .line 514
    const v0, 0x4010a3d7    # 2.26f

    .line 515
    .line 516
    .line 517
    invoke-virtual {v12, v0, v4, v6, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 518
    .line 519
    .line 520
    const v17, 0x3fd5c28f    # 1.67f

    .line 521
    .line 522
    .line 523
    const v18, 0x3f9d70a4    # 1.23f

    .line 524
    .line 525
    .line 526
    const v13, 0x3ee66666    # 0.45f

    .line 527
    .line 528
    .line 529
    const v14, 0x3f028f5c    # 0.51f

    .line 530
    .line 531
    .line 532
    const v15, 0x3f828f5c    # 1.02f

    .line 533
    .line 534
    .line 535
    const v16, 0x3f75c28f    # 0.96f

    .line 536
    .line 537
    .line 538
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 539
    .line 540
    .line 541
    const/high16 v17, 0x41b00000    # 22.0f

    .line 542
    .line 543
    const/high16 v18, 0x41700000    # 15.0f

    .line 544
    .line 545
    const v13, 0x41a6b852    # 20.84f

    .line 546
    .line 547
    .line 548
    const v14, 0x418eb852    # 17.84f

    .line 549
    .line 550
    .line 551
    const v15, 0x41ad851f    # 21.69f

    .line 552
    .line 553
    .line 554
    const v16, 0x41843d71    # 16.53f

    .line 555
    .line 556
    .line 557
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 558
    .line 559
    .line 560
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 561
    .line 562
    .line 563
    const/high16 v0, 0x41b80000    # 23.0f

    .line 564
    .line 565
    const/high16 v2, 0x41b00000    # 22.0f

    .line 566
    .line 567
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 568
    .line 569
    .line 570
    const/high16 v0, -0x40000000    # -2.0f

    .line 571
    .line 572
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 573
    .line 574
    .line 575
    const/high16 v0, -0x40800000    # -1.0f

    .line 576
    .line 577
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 578
    .line 579
    .line 580
    const/high16 v17, -0x3fc00000    # -3.0f

    .line 581
    .line 582
    const/high16 v18, -0x40800000    # -1.0f

    .line 583
    .line 584
    const v13, -0x407ae148    # -1.04f

    .line 585
    .line 586
    .line 587
    const/4 v14, 0x0

    .line 588
    const v15, -0x3ffae148    # -2.08f

    .line 589
    .line 590
    .line 591
    const v16, -0x414ccccd    # -0.35f

    .line 592
    .line 593
    .line 594
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 595
    .line 596
    .line 597
    const/high16 v17, -0x3f400000    # -6.0f

    .line 598
    .line 599
    const/16 v18, 0x0

    .line 600
    .line 601
    const v13, -0x4015c28f    # -1.83f

    .line 602
    .line 603
    .line 604
    const v14, 0x3fa66666    # 1.3f

    .line 605
    .line 606
    .line 607
    const v15, -0x3f7a8f5c    # -4.17f

    .line 608
    .line 609
    .line 610
    const v16, 0x3fa66666    # 1.3f

    .line 611
    .line 612
    .line 613
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 614
    .line 615
    .line 616
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 617
    .line 618
    .line 619
    const/high16 v17, -0x3fc00000    # -3.0f

    .line 620
    .line 621
    const/high16 v18, 0x3f800000    # 1.0f

    .line 622
    .line 623
    const v13, -0x40970a3d    # -0.91f

    .line 624
    .line 625
    .line 626
    const v14, 0x3f266666    # 0.65f

    .line 627
    .line 628
    .line 629
    const v15, -0x40051eb8    # -1.96f

    .line 630
    .line 631
    .line 632
    const/high16 v16, 0x3f800000    # 1.0f

    .line 633
    .line 634
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 635
    .line 636
    .line 637
    const/high16 v0, 0x40000000    # 2.0f

    .line 638
    .line 639
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 640
    .line 641
    .line 642
    const/4 v0, 0x0

    .line 643
    const/high16 v2, 0x40000000    # 2.0f

    .line 644
    .line 645
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 646
    .line 647
    .line 648
    const/high16 v0, 0x3f800000    # 1.0f

    .line 649
    .line 650
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 651
    .line 652
    .line 653
    const/high16 v17, 0x40400000    # 3.0f

    .line 654
    .line 655
    const/high16 v18, -0x40c00000    # -0.75f

    .line 656
    .line 657
    const v13, 0x3f83d70a    # 1.03f

    .line 658
    .line 659
    .line 660
    const/4 v14, 0x0

    .line 661
    const v15, 0x40033333    # 2.05f

    .line 662
    .line 663
    .line 664
    const/high16 v16, -0x41800000    # -0.25f

    .line 665
    .line 666
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 667
    .line 668
    .line 669
    const/high16 v17, 0x40c00000    # 6.0f

    .line 670
    .line 671
    const/16 v18, 0x0

    .line 672
    .line 673
    const v13, 0x3ff1eb85    # 1.89f

    .line 674
    .line 675
    .line 676
    const/high16 v14, 0x3f800000    # 1.0f

    .line 677
    .line 678
    const v15, 0x4083851f    # 4.11f

    .line 679
    .line 680
    .line 681
    const/high16 v16, 0x3f800000    # 1.0f

    .line 682
    .line 683
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 684
    .line 685
    .line 686
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 687
    .line 688
    .line 689
    const/4 v0, 0x0

    .line 690
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 691
    .line 692
    .line 693
    const/high16 v17, 0x40400000    # 3.0f

    .line 694
    .line 695
    const/high16 v18, 0x3f400000    # 0.75f

    .line 696
    .line 697
    const v13, 0x3f733333    # 0.95f

    .line 698
    .line 699
    .line 700
    const/high16 v14, 0x3f000000    # 0.5f

    .line 701
    .line 702
    const v15, 0x3ffc28f6    # 1.97f

    .line 703
    .line 704
    .line 705
    const/high16 v16, 0x3f400000    # 0.75f

    .line 706
    .line 707
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 708
    .line 709
    .line 710
    const/high16 v0, 0x41b00000    # 22.0f

    .line 711
    .line 712
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 713
    .line 714
    .line 715
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 716
    .line 717
    .line 718
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 719
    .line 720
    .line 721
    move-result-object v2

    .line 722
    const/16 v16, 0x3800

    .line 723
    .line 724
    const/16 v17, 0x0

    .line 725
    .line 726
    const/high16 v6, 0x3f800000    # 1.0f

    .line 727
    .line 728
    const/high16 v8, 0x3f800000    # 1.0f

    .line 729
    .line 730
    const/4 v7, 0x0

    .line 731
    const/high16 v12, 0x3f800000    # 1.0f

    .line 732
    .line 733
    const/4 v13, 0x0

    .line 734
    const/4 v14, 0x0

    .line 735
    const/4 v15, 0x0

    .line 736
    const-string v4, ""

    .line 737
    .line 738
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 739
    .line 740
    .line 741
    move-result-object v0

    .line 742
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 743
    .line 744
    .line 745
    move-result-object v0

    .line 746
    sput-object v0, Landroidx/compose/material/icons/twotone/SailingKt;->_sailing:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 747
    .line 748
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 749
    .line 750
    .line 751
    return-object v0
.end method
