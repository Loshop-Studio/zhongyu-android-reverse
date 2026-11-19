.class public final Landroidx/compose/material/icons/outlined/VideoSettingsKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_videoSettings",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "VideoSettings",
        "Landroidx/compose/material/icons/Icons$Outlined;",
        "getVideoSettings",
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
        "SMAP\nVideoSettings.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VideoSettings.kt\nandroidx/compose/material/icons/outlined/VideoSettingsKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,104:1\n212#2,12:105\n233#2,18:118\n253#2:155\n233#2,18:156\n253#2:193\n233#2,18:194\n253#2:231\n174#3:117\n705#4,2:136\n717#4,2:138\n719#4,11:144\n705#4,2:174\n717#4,2:176\n719#4,11:182\n705#4,2:212\n717#4,2:214\n719#4,11:220\n72#5,4:140\n72#5,4:178\n72#5,4:216\n*S KotlinDebug\n*F\n+ 1 VideoSettings.kt\nandroidx/compose/material/icons/outlined/VideoSettingsKt\n*L\n29#1:105,12\n30#1:118,18\n30#1:155\n47#1:156,18\n47#1:193\n53#1:194,18\n53#1:231\n29#1:117\n30#1:136,2\n30#1:138,2\n30#1:144,11\n47#1:174,2\n47#1:176,2\n47#1:182,11\n53#1:212,2\n53#1:214,2\n53#1:220,11\n30#1:140,4\n47#1:178,4\n53#1:216,4\n*E\n"
    }
.end annotation


# static fields
.field private static _videoSettings:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getVideoSettings(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/outlined/VideoSettingsKt;->_videoSettings:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Outlined.VideoSettings"

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
    const/high16 v4, 0x40c00000    # 6.0f

    .line 71
    .line 72
    const/high16 v6, 0x40400000    # 3.0f

    .line 73
    .line 74
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v4, 0x41900000    # 18.0f

    .line 78
    .line 79
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 80
    .line 81
    .line 82
    const/high16 v4, 0x40a00000    # 5.0f

    .line 83
    .line 84
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 85
    .line 86
    .line 87
    const/high16 v4, 0x40000000    # 2.0f

    .line 88
    .line 89
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 90
    .line 91
    .line 92
    const/high16 v4, 0x40c00000    # 6.0f

    .line 93
    .line 94
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 95
    .line 96
    .line 97
    const/high16 v25, -0x40000000    # -2.0f

    .line 98
    .line 99
    const/high16 v26, -0x40000000    # -2.0f

    .line 100
    .line 101
    const/16 v21, 0x0

    .line 102
    .line 103
    const v22, -0x40733333    # -1.1f

    .line 104
    .line 105
    .line 106
    const v23, -0x4099999a    # -0.9f

    .line 107
    .line 108
    .line 109
    const/high16 v24, -0x40000000    # -2.0f

    .line 110
    .line 111
    move-object/from16 v20, v2

    .line 112
    .line 113
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 114
    .line 115
    .line 116
    const/high16 v4, 0x40400000    # 3.0f

    .line 117
    .line 118
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 119
    .line 120
    .line 121
    const/high16 v25, 0x3f800000    # 1.0f

    .line 122
    .line 123
    const/high16 v26, 0x40c00000    # 6.0f

    .line 124
    .line 125
    const v21, 0x3ff33333    # 1.9f

    .line 126
    .line 127
    .line 128
    const/high16 v22, 0x40800000    # 4.0f

    .line 129
    .line 130
    const/high16 v23, 0x3f800000    # 1.0f

    .line 131
    .line 132
    const v24, 0x409ccccd    # 4.9f

    .line 133
    .line 134
    .line 135
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 136
    .line 137
    .line 138
    const/high16 v4, 0x41400000    # 12.0f

    .line 139
    .line 140
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 141
    .line 142
    .line 143
    const/high16 v25, 0x40000000    # 2.0f

    .line 144
    .line 145
    const/high16 v26, 0x40000000    # 2.0f

    .line 146
    .line 147
    const/16 v21, 0x0

    .line 148
    .line 149
    const v22, 0x3f8ccccd    # 1.1f

    .line 150
    .line 151
    .line 152
    const v23, 0x3f666666    # 0.9f

    .line 153
    .line 154
    .line 155
    const/high16 v24, 0x40000000    # 2.0f

    .line 156
    .line 157
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 158
    .line 159
    .line 160
    const/high16 v4, 0x41100000    # 9.0f

    .line 161
    .line 162
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 163
    .line 164
    .line 165
    const/high16 v4, -0x40000000    # -2.0f

    .line 166
    .line 167
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 168
    .line 169
    .line 170
    const/high16 v4, 0x40400000    # 3.0f

    .line 171
    .line 172
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 173
    .line 174
    .line 175
    const/high16 v4, 0x40c00000    # 6.0f

    .line 176
    .line 177
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 178
    .line 179
    .line 180
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 181
    .line 182
    .line 183
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 184
    .line 185
    .line 186
    move-result-object v2

    .line 187
    const/16 v16, 0x3800

    .line 188
    .line 189
    const/16 v17, 0x0

    .line 190
    .line 191
    const/high16 v6, 0x3f800000    # 1.0f

    .line 192
    .line 193
    const/high16 v8, 0x3f800000    # 1.0f

    .line 194
    .line 195
    const/4 v7, 0x0

    .line 196
    const/high16 v9, 0x3f800000    # 1.0f

    .line 197
    .line 198
    const/high16 v12, 0x3f800000    # 1.0f

    .line 199
    .line 200
    const/4 v13, 0x0

    .line 201
    const/4 v14, 0x0

    .line 202
    const/4 v15, 0x0

    .line 203
    const-string v4, ""

    .line 204
    .line 205
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 206
    .line 207
    .line 208
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 209
    .line 210
    .line 211
    move-result v3

    .line 212
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 213
    .line 214
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 215
    .line 216
    .line 217
    move-result-wide v6

    .line 218
    const/4 v2, 0x0

    .line 219
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 220
    .line 221
    .line 222
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 223
    .line 224
    .line 225
    move-result v10

    .line 226
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 227
    .line 228
    .line 229
    move-result v11

    .line 230
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 231
    .line 232
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 233
    .line 234
    .line 235
    const/high16 v4, 0x41700000    # 15.0f

    .line 236
    .line 237
    const/high16 v6, 0x41400000    # 12.0f

    .line 238
    .line 239
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 240
    .line 241
    .line 242
    const/high16 v4, -0x3f400000    # -6.0f

    .line 243
    .line 244
    const/high16 v6, -0x3f800000    # -4.0f

    .line 245
    .line 246
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 247
    .line 248
    .line 249
    const/4 v4, 0x0

    .line 250
    const/high16 v6, 0x41000000    # 8.0f

    .line 251
    .line 252
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 253
    .line 254
    .line 255
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 256
    .line 257
    .line 258
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 259
    .line 260
    .line 261
    move-result-object v2

    .line 262
    const/high16 v6, 0x3f800000    # 1.0f

    .line 263
    .line 264
    const/4 v7, 0x0

    .line 265
    const-string v4, ""

    .line 266
    .line 267
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 268
    .line 269
    .line 270
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 271
    .line 272
    .line 273
    move-result v3

    .line 274
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 275
    .line 276
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 277
    .line 278
    .line 279
    move-result-wide v6

    .line 280
    const/4 v0, 0x0

    .line 281
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 282
    .line 283
    .line 284
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 285
    .line 286
    .line 287
    move-result v10

    .line 288
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 289
    .line 290
    .line 291
    move-result v11

    .line 292
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 293
    .line 294
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 295
    .line 296
    .line 297
    const v0, 0x419370a4    # 18.43f

    .line 298
    .line 299
    .line 300
    const v2, 0x41b5ae14    # 22.71f

    .line 301
    .line 302
    .line 303
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 304
    .line 305
    .line 306
    const v17, 0x3c23d70a    # 0.01f

    .line 307
    .line 308
    .line 309
    const v18, -0x40a3d70a    # -0.86f

    .line 310
    .line 311
    .line 312
    const v13, 0x3cf5c28f    # 0.03f

    .line 313
    .line 314
    .line 315
    const v14, -0x416b851f    # -0.29f

    .line 316
    .line 317
    .line 318
    const v15, 0x3d23d70a    # 0.04f

    .line 319
    .line 320
    .line 321
    const v16, -0x40eb851f    # -0.58f

    .line 322
    .line 323
    .line 324
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 325
    .line 326
    .line 327
    const v0, -0x40a66666    # -0.85f

    .line 328
    .line 329
    .line 330
    const v2, 0x3f88f5c3    # 1.07f

    .line 331
    .line 332
    .line 333
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 334
    .line 335
    .line 336
    const v17, 0x3d75c28f    # 0.06f

    .line 337
    .line 338
    .line 339
    const v18, -0x415c28f6    # -0.32f

    .line 340
    .line 341
    .line 342
    const v13, 0x3dcccccd    # 0.1f

    .line 343
    .line 344
    .line 345
    const v14, -0x425c28f6    # -0.08f

    .line 346
    .line 347
    .line 348
    const v15, 0x3df5c28f    # 0.12f

    .line 349
    .line 350
    .line 351
    const v16, -0x41a8f5c3    # -0.21f

    .line 352
    .line 353
    .line 354
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 355
    .line 356
    .line 357
    const v0, -0x401ae148    # -1.79f

    .line 358
    .line 359
    .line 360
    const v2, -0x407c28f6    # -1.03f

    .line 361
    .line 362
    .line 363
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 364
    .line 365
    .line 366
    const v17, -0x416147ae    # -0.31f

    .line 367
    .line 368
    .line 369
    const v18, -0x421eb852    # -0.11f

    .line 370
    .line 371
    .line 372
    const v13, -0x428a3d71    # -0.06f

    .line 373
    .line 374
    .line 375
    const v14, -0x421eb852    # -0.11f

    .line 376
    .line 377
    .line 378
    const v15, -0x41bd70a4    # -0.19f

    .line 379
    .line 380
    .line 381
    const v16, -0x41e66666    # -0.15f

    .line 382
    .line 383
    .line 384
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 385
    .line 386
    .line 387
    const v0, 0x41a9d70a    # 21.23f

    .line 388
    .line 389
    .line 390
    const/high16 v2, 0x41700000    # 15.0f

    .line 391
    .line 392
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 393
    .line 394
    .line 395
    const/high16 v17, -0x40c00000    # -0.75f

    .line 396
    .line 397
    const v18, -0x4128f5c3    # -0.42f

    .line 398
    .line 399
    .line 400
    const v13, -0x41947ae1    # -0.23f

    .line 401
    .line 402
    .line 403
    const v14, -0x41d1eb85    # -0.17f

    .line 404
    .line 405
    .line 406
    const v15, -0x410a3d71    # -0.48f

    .line 407
    .line 408
    .line 409
    const v16, -0x416147ae    # -0.31f

    .line 410
    .line 411
    .line 412
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 413
    .line 414
    .line 415
    const v0, -0x4051eb85    # -1.36f

    .line 416
    .line 417
    .line 418
    const v2, -0x41b33333    # -0.2f

    .line 419
    .line 420
    .line 421
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 422
    .line 423
    .line 424
    const v17, 0x41a03d71    # 20.03f

    .line 425
    .line 426
    .line 427
    const/high16 v18, 0x41500000    # 13.0f

    .line 428
    .line 429
    const v13, 0x41a2147b    # 20.26f

    .line 430
    .line 431
    .line 432
    const v14, 0x415170a4    # 13.09f

    .line 433
    .line 434
    .line 435
    const v15, 0x41a147ae    # 20.16f

    .line 436
    .line 437
    .line 438
    const/high16 v16, 0x41500000    # 13.0f

    .line 439
    .line 440
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 441
    .line 442
    .line 443
    const v0, -0x3ffb851f    # -2.07f

    .line 444
    .line 445
    .line 446
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 447
    .line 448
    .line 449
    const/high16 v17, -0x41800000    # -0.25f

    .line 450
    .line 451
    const v18, 0x3e570a3d    # 0.21f

    .line 452
    .line 453
    .line 454
    const v13, -0x420a3d71    # -0.12f

    .line 455
    .line 456
    .line 457
    const/4 v14, 0x0

    .line 458
    const v15, -0x41947ae1    # -0.23f

    .line 459
    .line 460
    .line 461
    const v16, 0x3db851ec    # 0.09f

    .line 462
    .line 463
    .line 464
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 465
    .line 466
    .line 467
    const v0, 0x3fae147b    # 1.36f

    .line 468
    .line 469
    .line 470
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 471
    .line 472
    .line 473
    const v17, -0x40c28f5c    # -0.74f

    .line 474
    .line 475
    .line 476
    const v18, 0x3ed70a3d    # 0.42f

    .line 477
    .line 478
    .line 479
    const v13, -0x417ae148    # -0.26f

    .line 480
    .line 481
    .line 482
    const v14, 0x3de147ae    # 0.11f

    .line 483
    .line 484
    .line 485
    const v15, -0x40fd70a4    # -0.51f

    .line 486
    .line 487
    .line 488
    const v16, 0x3e851eb8    # 0.26f

    .line 489
    .line 490
    .line 491
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 492
    .line 493
    .line 494
    const v0, -0x405c28f6    # -1.28f

    .line 495
    .line 496
    .line 497
    const/high16 v2, -0x41000000    # -0.5f

    .line 498
    .line 499
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 500
    .line 501
    .line 502
    const v17, -0x416147ae    # -0.31f

    .line 503
    .line 504
    .line 505
    const v18, 0x3de147ae    # 0.11f

    .line 506
    .line 507
    .line 508
    const v13, -0x420a3d71    # -0.12f

    .line 509
    .line 510
    .line 511
    const v14, -0x42b33333    # -0.05f

    .line 512
    .line 513
    .line 514
    const/high16 v15, -0x41800000    # -0.25f

    .line 515
    .line 516
    const/16 v16, 0x0

    .line 517
    .line 518
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 519
    .line 520
    .line 521
    const v0, 0x3fe51eb8    # 1.79f

    .line 522
    .line 523
    .line 524
    const v2, -0x407c28f6    # -1.03f

    .line 525
    .line 526
    .line 527
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 528
    .line 529
    .line 530
    const v17, 0x3d75c28f    # 0.06f

    .line 531
    .line 532
    .line 533
    const v18, 0x3ea3d70a    # 0.32f

    .line 534
    .line 535
    .line 536
    const v13, -0x428a3d71    # -0.06f

    .line 537
    .line 538
    .line 539
    const v14, 0x3de147ae    # 0.11f

    .line 540
    .line 541
    .line 542
    const v15, -0x42dc28f6    # -0.04f

    .line 543
    .line 544
    .line 545
    const v16, 0x3e75c28f    # 0.24f

    .line 546
    .line 547
    .line 548
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 549
    .line 550
    .line 551
    const v0, 0x3f5c28f6    # 0.86f

    .line 552
    .line 553
    .line 554
    const v2, 0x3f88f5c3    # 1.07f

    .line 555
    .line 556
    .line 557
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 558
    .line 559
    .line 560
    const v17, -0x43dc28f6    # -0.01f

    .line 561
    .line 562
    .line 563
    const v18, 0x3f5c28f6    # 0.86f

    .line 564
    .line 565
    .line 566
    const v13, -0x430a3d71    # -0.03f

    .line 567
    .line 568
    .line 569
    const v14, 0x3e947ae1    # 0.29f

    .line 570
    .line 571
    .line 572
    const v16, 0x3f147ae1    # 0.58f

    .line 573
    .line 574
    .line 575
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 576
    .line 577
    .line 578
    const v0, -0x40770a3d    # -1.07f

    .line 579
    .line 580
    .line 581
    const v2, 0x3f59999a    # 0.85f

    .line 582
    .line 583
    .line 584
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 585
    .line 586
    .line 587
    const v17, -0x428a3d71    # -0.06f

    .line 588
    .line 589
    .line 590
    const v18, 0x3ea3d70a    # 0.32f

    .line 591
    .line 592
    .line 593
    const v13, -0x42333333    # -0.1f

    .line 594
    .line 595
    .line 596
    const v14, 0x3da3d70a    # 0.08f

    .line 597
    .line 598
    .line 599
    const v15, -0x420a3d71    # -0.12f

    .line 600
    .line 601
    .line 602
    const v16, 0x3e570a3d    # 0.21f

    .line 603
    .line 604
    .line 605
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 606
    .line 607
    .line 608
    const v0, 0x3f83d70a    # 1.03f

    .line 609
    .line 610
    .line 611
    const v2, 0x3fe51eb8    # 1.79f

    .line 612
    .line 613
    .line 614
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 615
    .line 616
    .line 617
    const v17, 0x3e9eb852    # 0.31f

    .line 618
    .line 619
    .line 620
    const v18, 0x3de147ae    # 0.11f

    .line 621
    .line 622
    .line 623
    const v13, 0x3d75c28f    # 0.06f

    .line 624
    .line 625
    .line 626
    const v14, 0x3de147ae    # 0.11f

    .line 627
    .line 628
    .line 629
    const v15, 0x3e428f5c    # 0.19f

    .line 630
    .line 631
    .line 632
    const v16, 0x3e19999a    # 0.15f

    .line 633
    .line 634
    .line 635
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 636
    .line 637
    .line 638
    const v0, 0x3fa28f5c    # 1.27f

    .line 639
    .line 640
    .line 641
    const/high16 v2, -0x41000000    # -0.5f

    .line 642
    .line 643
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 644
    .line 645
    .line 646
    const/high16 v17, 0x3f400000    # 0.75f

    .line 647
    .line 648
    const v18, 0x3ed70a3d    # 0.42f

    .line 649
    .line 650
    .line 651
    const v13, 0x3e6b851f    # 0.23f

    .line 652
    .line 653
    .line 654
    const v14, 0x3e2e147b    # 0.17f

    .line 655
    .line 656
    .line 657
    const v15, 0x3ef5c28f    # 0.48f

    .line 658
    .line 659
    .line 660
    const v16, 0x3e9eb852    # 0.31f

    .line 661
    .line 662
    .line 663
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 664
    .line 665
    .line 666
    const v0, 0x3e4ccccd    # 0.2f

    .line 667
    .line 668
    .line 669
    const v2, 0x3fae147b    # 1.36f

    .line 670
    .line 671
    .line 672
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 673
    .line 674
    .line 675
    const/high16 v17, 0x3e800000    # 0.25f

    .line 676
    .line 677
    const v18, 0x3e570a3d    # 0.21f

    .line 678
    .line 679
    .line 680
    const v13, 0x3ca3d70a    # 0.02f

    .line 681
    .line 682
    .line 683
    const v14, 0x3df5c28f    # 0.12f

    .line 684
    .line 685
    .line 686
    const v15, 0x3df5c28f    # 0.12f

    .line 687
    .line 688
    .line 689
    const v16, 0x3e570a3d    # 0.21f

    .line 690
    .line 691
    .line 692
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 693
    .line 694
    .line 695
    const v0, 0x40047ae1    # 2.07f

    .line 696
    .line 697
    .line 698
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 699
    .line 700
    .line 701
    const v18, -0x41a8f5c3    # -0.21f

    .line 702
    .line 703
    .line 704
    const v13, 0x3df5c28f    # 0.12f

    .line 705
    .line 706
    .line 707
    const/4 v14, 0x0

    .line 708
    const v15, 0x3e6b851f    # 0.23f

    .line 709
    .line 710
    .line 711
    const v16, -0x4247ae14    # -0.09f

    .line 712
    .line 713
    .line 714
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 715
    .line 716
    .line 717
    const v0, 0x3e4ccccd    # 0.2f

    .line 718
    .line 719
    .line 720
    const v2, -0x4051eb85    # -1.36f

    .line 721
    .line 722
    .line 723
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 724
    .line 725
    .line 726
    const v17, 0x3f3d70a4    # 0.74f

    .line 727
    .line 728
    .line 729
    const v18, -0x4128f5c3    # -0.42f

    .line 730
    .line 731
    .line 732
    const v13, 0x3e851eb8    # 0.26f

    .line 733
    .line 734
    .line 735
    const v14, -0x421eb852    # -0.11f

    .line 736
    .line 737
    .line 738
    const v15, 0x3f028f5c    # 0.51f

    .line 739
    .line 740
    .line 741
    const v16, -0x417ae148    # -0.26f

    .line 742
    .line 743
    .line 744
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 745
    .line 746
    .line 747
    const v0, 0x3fa3d70a    # 1.28f

    .line 748
    .line 749
    .line 750
    const/high16 v2, 0x3f000000    # 0.5f

    .line 751
    .line 752
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 753
    .line 754
    .line 755
    const v17, 0x3e9eb852    # 0.31f

    .line 756
    .line 757
    .line 758
    const v18, -0x421eb852    # -0.11f

    .line 759
    .line 760
    .line 761
    const v13, 0x3df5c28f    # 0.12f

    .line 762
    .line 763
    .line 764
    const v14, 0x3d4ccccd    # 0.05f

    .line 765
    .line 766
    .line 767
    const/high16 v15, 0x3e800000    # 0.25f

    .line 768
    .line 769
    const/16 v16, 0x0

    .line 770
    .line 771
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 772
    .line 773
    .line 774
    const v0, 0x3f83d70a    # 1.03f

    .line 775
    .line 776
    .line 777
    const v2, -0x401ae148    # -1.79f

    .line 778
    .line 779
    .line 780
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 781
    .line 782
    .line 783
    const v17, -0x428a3d71    # -0.06f

    .line 784
    .line 785
    .line 786
    const v18, -0x415c28f6    # -0.32f

    .line 787
    .line 788
    .line 789
    const v13, 0x3d75c28f    # 0.06f

    .line 790
    .line 791
    .line 792
    const v14, -0x421eb852    # -0.11f

    .line 793
    .line 794
    .line 795
    const v15, 0x3d23d70a    # 0.04f

    .line 796
    .line 797
    .line 798
    const v16, -0x418a3d71    # -0.24f

    .line 799
    .line 800
    .line 801
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 802
    .line 803
    .line 804
    const v0, 0x419370a4    # 18.43f

    .line 805
    .line 806
    .line 807
    const v2, 0x41b5ae14    # 22.71f

    .line 808
    .line 809
    .line 810
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 811
    .line 812
    .line 813
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 814
    .line 815
    .line 816
    const/high16 v0, 0x41980000    # 19.0f

    .line 817
    .line 818
    const/high16 v2, 0x419c0000    # 19.5f

    .line 819
    .line 820
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 821
    .line 822
    .line 823
    const/high16 v17, -0x40400000    # -1.5f

    .line 824
    .line 825
    const/high16 v18, -0x40400000    # -1.5f

    .line 826
    .line 827
    const v13, -0x40ab851f    # -0.83f

    .line 828
    .line 829
    .line 830
    const/4 v14, 0x0

    .line 831
    const/high16 v15, -0x40400000    # -1.5f

    .line 832
    .line 833
    const v16, -0x40d47ae1    # -0.67f

    .line 834
    .line 835
    .line 836
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 837
    .line 838
    .line 839
    const/high16 v0, -0x40400000    # -1.5f

    .line 840
    .line 841
    const/high16 v2, -0x40400000    # -1.5f

    .line 842
    .line 843
    const v4, 0x3f2b851f    # 0.67f

    .line 844
    .line 845
    .line 846
    const/high16 v6, 0x3fc00000    # 1.5f

    .line 847
    .line 848
    invoke-virtual {v12, v4, v0, v6, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 849
    .line 850
    .line 851
    const v0, 0x3f2b851f    # 0.67f

    .line 852
    .line 853
    .line 854
    const/high16 v2, 0x3fc00000    # 1.5f

    .line 855
    .line 856
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 857
    .line 858
    .line 859
    const v0, 0x419ea3d7    # 19.83f

    .line 860
    .line 861
    .line 862
    const/high16 v2, 0x41980000    # 19.0f

    .line 863
    .line 864
    const/high16 v4, 0x419c0000    # 19.5f

    .line 865
    .line 866
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 867
    .line 868
    .line 869
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 870
    .line 871
    .line 872
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 873
    .line 874
    .line 875
    move-result-object v2

    .line 876
    const/16 v16, 0x3800

    .line 877
    .line 878
    const/16 v17, 0x0

    .line 879
    .line 880
    const/high16 v6, 0x3f800000    # 1.0f

    .line 881
    .line 882
    const/4 v7, 0x0

    .line 883
    const/high16 v12, 0x3f800000    # 1.0f

    .line 884
    .line 885
    const/4 v13, 0x0

    .line 886
    const/4 v15, 0x0

    .line 887
    const-string v4, ""

    .line 888
    .line 889
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 890
    .line 891
    .line 892
    move-result-object v0

    .line 893
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 894
    .line 895
    .line 896
    move-result-object v0

    .line 897
    sput-object v0, Landroidx/compose/material/icons/outlined/VideoSettingsKt;->_videoSettings:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 898
    .line 899
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 900
    .line 901
    .line 902
    return-object v0
.end method
