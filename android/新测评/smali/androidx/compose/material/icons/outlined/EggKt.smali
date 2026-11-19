.class public final Landroidx/compose/material/icons/outlined/EggKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_egg",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "Egg",
        "Landroidx/compose/material/icons/Icons$Outlined;",
        "getEgg",
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
        "SMAP\nEgg.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Egg.kt\nandroidx/compose/material/icons/outlined/EggKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,59:1\n212#2,12:60\n233#2,18:73\n253#2:110\n233#2,18:111\n253#2:148\n174#3:72\n705#4,2:91\n717#4,2:93\n719#4,11:99\n705#4,2:129\n717#4,2:131\n719#4,11:137\n72#5,4:95\n72#5,4:133\n*S KotlinDebug\n*F\n+ 1 Egg.kt\nandroidx/compose/material/icons/outlined/EggKt\n*L\n29#1:60,12\n30#1:73,18\n30#1:110\n44#1:111,18\n44#1:148\n29#1:72\n30#1:91,2\n30#1:93,2\n30#1:99,11\n44#1:129,2\n44#1:131,2\n44#1:137,11\n30#1:95,4\n44#1:133,4\n*E\n"
    }
.end annotation


# static fields
.field private static _egg:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getEgg(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/outlined/EggKt;->_egg:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Outlined.Egg"

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
    const/high16 v4, 0x40400000    # 3.0f

    .line 71
    .line 72
    const/high16 v6, 0x41400000    # 12.0f

    .line 73
    .line 74
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v25, 0x40a00000    # 5.0f

    .line 78
    .line 79
    const/high16 v26, 0x41600000    # 14.0f

    .line 80
    .line 81
    const/high16 v21, 0x41080000    # 8.5f

    .line 82
    .line 83
    const/high16 v22, 0x40400000    # 3.0f

    .line 84
    .line 85
    const/high16 v23, 0x40a00000    # 5.0f

    .line 86
    .line 87
    const v24, 0x411547ae    # 9.33f

    .line 88
    .line 89
    .line 90
    move-object/from16 v20, v2

    .line 91
    .line 92
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 93
    .line 94
    .line 95
    const/high16 v25, 0x40e00000    # 7.0f

    .line 96
    .line 97
    const/high16 v26, 0x40e00000    # 7.0f

    .line 98
    .line 99
    const/16 v21, 0x0

    .line 100
    .line 101
    const v22, 0x4077ae14    # 3.87f

    .line 102
    .line 103
    .line 104
    const v23, 0x404851ec    # 3.13f

    .line 105
    .line 106
    .line 107
    const/high16 v24, 0x40e00000    # 7.0f

    .line 108
    .line 109
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 110
    .line 111
    .line 112
    const/high16 v26, -0x3f200000    # -7.0f

    .line 113
    .line 114
    const v21, 0x4077ae14    # 3.87f

    .line 115
    .line 116
    .line 117
    const/16 v22, 0x0

    .line 118
    .line 119
    const/high16 v23, 0x40e00000    # 7.0f

    .line 120
    .line 121
    const v24, -0x3fb7ae14    # -3.13f

    .line 122
    .line 123
    .line 124
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 125
    .line 126
    .line 127
    const/high16 v25, 0x41400000    # 12.0f

    .line 128
    .line 129
    const/high16 v26, 0x40400000    # 3.0f

    .line 130
    .line 131
    const/high16 v21, 0x41980000    # 19.0f

    .line 132
    .line 133
    const v22, 0x411547ae    # 9.33f

    .line 134
    .line 135
    .line 136
    const/high16 v23, 0x41780000    # 15.5f

    .line 137
    .line 138
    const/high16 v24, 0x40400000    # 3.0f

    .line 139
    .line 140
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 141
    .line 142
    .line 143
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 144
    .line 145
    .line 146
    const/high16 v4, 0x41980000    # 19.0f

    .line 147
    .line 148
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 149
    .line 150
    .line 151
    const/high16 v25, -0x3f600000    # -5.0f

    .line 152
    .line 153
    const/high16 v26, -0x3f600000    # -5.0f

    .line 154
    .line 155
    const v21, -0x3fcf5c29    # -2.76f

    .line 156
    .line 157
    .line 158
    const/16 v22, 0x0

    .line 159
    .line 160
    const/high16 v23, -0x3f600000    # -5.0f

    .line 161
    .line 162
    const v24, -0x3ff0a3d7    # -2.24f

    .line 163
    .line 164
    .line 165
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 166
    .line 167
    .line 168
    const/high16 v25, 0x40a00000    # 5.0f

    .line 169
    .line 170
    const/high16 v26, -0x3ef00000    # -9.0f

    .line 171
    .line 172
    const/16 v21, 0x0

    .line 173
    .line 174
    const v22, -0x3f7d1eb8    # -4.09f

    .line 175
    .line 176
    .line 177
    const v23, 0x40447ae1    # 3.07f

    .line 178
    .line 179
    .line 180
    const/high16 v24, -0x3ef00000    # -9.0f

    .line 181
    .line 182
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 183
    .line 184
    .line 185
    const v4, 0x409d1eb8    # 4.91f

    .line 186
    .line 187
    .line 188
    const/high16 v6, 0x41100000    # 9.0f

    .line 189
    .line 190
    const/high16 v7, 0x40a00000    # 5.0f

    .line 191
    .line 192
    invoke-virtual {v2, v7, v4, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 193
    .line 194
    .line 195
    const/high16 v25, 0x41400000    # 12.0f

    .line 196
    .line 197
    const/high16 v26, 0x41980000    # 19.0f

    .line 198
    .line 199
    const/high16 v21, 0x41880000    # 17.0f

    .line 200
    .line 201
    const v22, 0x4186147b    # 16.76f

    .line 202
    .line 203
    .line 204
    const v23, 0x416c28f6    # 14.76f

    .line 205
    .line 206
    .line 207
    const/high16 v24, 0x41980000    # 19.0f

    .line 208
    .line 209
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 210
    .line 211
    .line 212
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 213
    .line 214
    .line 215
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 216
    .line 217
    .line 218
    move-result-object v2

    .line 219
    const/16 v16, 0x3800

    .line 220
    .line 221
    const/16 v17, 0x0

    .line 222
    .line 223
    const/high16 v6, 0x3f800000    # 1.0f

    .line 224
    .line 225
    const/high16 v8, 0x3f800000    # 1.0f

    .line 226
    .line 227
    const/4 v7, 0x0

    .line 228
    const/high16 v9, 0x3f800000    # 1.0f

    .line 229
    .line 230
    const/high16 v12, 0x3f800000    # 1.0f

    .line 231
    .line 232
    const/4 v13, 0x0

    .line 233
    const/4 v14, 0x0

    .line 234
    const/4 v15, 0x0

    .line 235
    const-string v4, ""

    .line 236
    .line 237
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 238
    .line 239
    .line 240
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 241
    .line 242
    .line 243
    move-result v3

    .line 244
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 245
    .line 246
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 247
    .line 248
    .line 249
    move-result-wide v6

    .line 250
    const/4 v0, 0x0

    .line 251
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 252
    .line 253
    .line 254
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 255
    .line 256
    .line 257
    move-result v10

    .line 258
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 259
    .line 260
    .line 261
    move-result v11

    .line 262
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 263
    .line 264
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 265
    .line 266
    .line 267
    const/high16 v0, 0x41500000    # 13.0f

    .line 268
    .line 269
    const/high16 v2, 0x41800000    # 16.0f

    .line 270
    .line 271
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 272
    .line 273
    .line 274
    const/high16 v17, -0x3fc00000    # -3.0f

    .line 275
    .line 276
    const/high16 v18, -0x3fc00000    # -3.0f

    .line 277
    .line 278
    const v13, -0x40eb851f    # -0.58f

    .line 279
    .line 280
    .line 281
    const/high16 v15, -0x3fc00000    # -3.0f

    .line 282
    .line 283
    const v16, -0x425c28f6    # -0.08f

    .line 284
    .line 285
    .line 286
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 287
    .line 288
    .line 289
    const/high16 v17, -0x40800000    # -1.0f

    .line 290
    .line 291
    const/high16 v18, -0x40800000    # -1.0f

    .line 292
    .line 293
    const/4 v13, 0x0

    .line 294
    const v14, -0x40f33333    # -0.55f

    .line 295
    .line 296
    .line 297
    const v15, -0x4119999a    # -0.45f

    .line 298
    .line 299
    .line 300
    const/high16 v16, -0x40800000    # -1.0f

    .line 301
    .line 302
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 303
    .line 304
    .line 305
    const v0, 0x3ee66666    # 0.45f

    .line 306
    .line 307
    .line 308
    const/high16 v2, 0x3f800000    # 1.0f

    .line 309
    .line 310
    const/high16 v4, -0x40800000    # -1.0f

    .line 311
    .line 312
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 313
    .line 314
    .line 315
    const/high16 v17, 0x40a00000    # 5.0f

    .line 316
    .line 317
    const/high16 v18, 0x40a00000    # 5.0f

    .line 318
    .line 319
    const/high16 v14, 0x40400000    # 3.0f

    .line 320
    .line 321
    const v15, 0x3ffeb852    # 1.99f

    .line 322
    .line 323
    .line 324
    const/high16 v16, 0x40a00000    # 5.0f

    .line 325
    .line 326
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 327
    .line 328
    .line 329
    const/high16 v17, 0x3f800000    # 1.0f

    .line 330
    .line 331
    const/high16 v18, -0x40800000    # -1.0f

    .line 332
    .line 333
    const v13, 0x3f0ccccd    # 0.55f

    .line 334
    .line 335
    .line 336
    const/4 v14, 0x0

    .line 337
    const/high16 v15, 0x3f800000    # 1.0f

    .line 338
    .line 339
    const v16, -0x4119999a    # -0.45f

    .line 340
    .line 341
    .line 342
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 343
    .line 344
    .line 345
    const v0, 0x4158cccd    # 13.55f

    .line 346
    .line 347
    .line 348
    const/high16 v2, 0x41500000    # 13.0f

    .line 349
    .line 350
    const/high16 v4, 0x41800000    # 16.0f

    .line 351
    .line 352
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 353
    .line 354
    .line 355
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 356
    .line 357
    .line 358
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 359
    .line 360
    .line 361
    move-result-object v2

    .line 362
    const/16 v16, 0x3800

    .line 363
    .line 364
    const/16 v17, 0x0

    .line 365
    .line 366
    const/high16 v6, 0x3f800000    # 1.0f

    .line 367
    .line 368
    const/4 v7, 0x0

    .line 369
    const/high16 v12, 0x3f800000    # 1.0f

    .line 370
    .line 371
    const/4 v13, 0x0

    .line 372
    const/4 v15, 0x0

    .line 373
    const-string v4, ""

    .line 374
    .line 375
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 376
    .line 377
    .line 378
    move-result-object v0

    .line 379
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 380
    .line 381
    .line 382
    move-result-object v0

    .line 383
    sput-object v0, Landroidx/compose/material/icons/outlined/EggKt;->_egg:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 384
    .line 385
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 386
    .line 387
    .line 388
    return-object v0
.end method
