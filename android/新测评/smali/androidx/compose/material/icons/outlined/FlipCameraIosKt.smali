.class public final Landroidx/compose/material/icons/outlined/FlipCameraIosKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_flipCameraIos",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "FlipCameraIos",
        "Landroidx/compose/material/icons/Icons$Outlined;",
        "getFlipCameraIos",
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
        "SMAP\nFlipCameraIos.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlipCameraIos.kt\nandroidx/compose/material/icons/outlined/FlipCameraIosKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,91:1\n212#2,12:92\n233#2,18:105\n253#2:142\n233#2,18:143\n253#2:180\n233#2,18:181\n253#2:218\n174#3:104\n705#4,2:123\n717#4,2:125\n719#4,11:131\n705#4,2:161\n717#4,2:163\n719#4,11:169\n705#4,2:199\n717#4,2:201\n719#4,11:207\n72#5,4:127\n72#5,4:165\n72#5,4:203\n*S KotlinDebug\n*F\n+ 1 FlipCameraIos.kt\nandroidx/compose/material/icons/outlined/FlipCameraIosKt\n*L\n29#1:92,12\n30#1:105,18\n30#1:142\n60#1:143,18\n60#1:180\n73#1:181,18\n73#1:218\n29#1:104\n30#1:123,2\n30#1:125,2\n30#1:131,11\n60#1:161,2\n60#1:163,2\n60#1:169,11\n73#1:199,2\n73#1:201,2\n73#1:207,11\n30#1:127,4\n60#1:165,4\n73#1:203,4\n*E\n"
    }
.end annotation


# static fields
.field private static _flipCameraIos:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getFlipCameraIos(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/outlined/FlipCameraIosKt;->_flipCameraIos:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Outlined.FlipCameraIos"

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
    const/high16 v4, 0x41a00000    # 20.0f

    .line 71
    .line 72
    const/high16 v6, 0x40a00000    # 5.0f

    .line 73
    .line 74
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const v4, -0x3fb51eb8    # -3.17f

    .line 78
    .line 79
    .line 80
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 81
    .line 82
    .line 83
    const/high16 v4, 0x41700000    # 15.0f

    .line 84
    .line 85
    const/high16 v6, 0x40400000    # 3.0f

    .line 86
    .line 87
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 88
    .line 89
    .line 90
    const/high16 v4, 0x41100000    # 9.0f

    .line 91
    .line 92
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 93
    .line 94
    .line 95
    const v4, 0x40e570a4    # 7.17f

    .line 96
    .line 97
    .line 98
    const/high16 v6, 0x40a00000    # 5.0f

    .line 99
    .line 100
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 101
    .line 102
    .line 103
    const/high16 v4, 0x40800000    # 4.0f

    .line 104
    .line 105
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 106
    .line 107
    .line 108
    const/high16 v25, 0x40000000    # 2.0f

    .line 109
    .line 110
    const/high16 v26, 0x40e00000    # 7.0f

    .line 111
    .line 112
    const v21, 0x4039999a    # 2.9f

    .line 113
    .line 114
    .line 115
    const/high16 v22, 0x40a00000    # 5.0f

    .line 116
    .line 117
    const/high16 v23, 0x40000000    # 2.0f

    .line 118
    .line 119
    const v24, 0x40bccccd    # 5.9f

    .line 120
    .line 121
    .line 122
    move-object/from16 v20, v2

    .line 123
    .line 124
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 125
    .line 126
    .line 127
    const/high16 v4, 0x41400000    # 12.0f

    .line 128
    .line 129
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 130
    .line 131
    .line 132
    const/high16 v26, 0x40000000    # 2.0f

    .line 133
    .line 134
    const/16 v21, 0x0

    .line 135
    .line 136
    const v22, 0x3f8ccccd    # 1.1f

    .line 137
    .line 138
    .line 139
    const v23, 0x3f666666    # 0.9f

    .line 140
    .line 141
    .line 142
    const/high16 v24, 0x40000000    # 2.0f

    .line 143
    .line 144
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 145
    .line 146
    .line 147
    const/high16 v4, 0x41800000    # 16.0f

    .line 148
    .line 149
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 150
    .line 151
    .line 152
    const/high16 v26, -0x40000000    # -2.0f

    .line 153
    .line 154
    const v21, 0x3f8ccccd    # 1.1f

    .line 155
    .line 156
    .line 157
    const/16 v22, 0x0

    .line 158
    .line 159
    const/high16 v23, 0x40000000    # 2.0f

    .line 160
    .line 161
    const v24, -0x4099999a    # -0.9f

    .line 162
    .line 163
    .line 164
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 165
    .line 166
    .line 167
    const/high16 v4, 0x40e00000    # 7.0f

    .line 168
    .line 169
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 170
    .line 171
    .line 172
    const/high16 v25, 0x41a00000    # 20.0f

    .line 173
    .line 174
    const/high16 v26, 0x40a00000    # 5.0f

    .line 175
    .line 176
    const/high16 v21, 0x41b00000    # 22.0f

    .line 177
    .line 178
    const v22, 0x40bccccd    # 5.9f

    .line 179
    .line 180
    .line 181
    const v23, 0x41a8cccd    # 21.1f

    .line 182
    .line 183
    .line 184
    const/high16 v24, 0x40a00000    # 5.0f

    .line 185
    .line 186
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 187
    .line 188
    .line 189
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 190
    .line 191
    .line 192
    const/high16 v4, 0x41980000    # 19.0f

    .line 193
    .line 194
    const/high16 v6, 0x41a00000    # 20.0f

    .line 195
    .line 196
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 197
    .line 198
    .line 199
    const/high16 v4, 0x40800000    # 4.0f

    .line 200
    .line 201
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 202
    .line 203
    .line 204
    const/high16 v4, 0x40e00000    # 7.0f

    .line 205
    .line 206
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 207
    .line 208
    .line 209
    const v4, 0x404ae148    # 3.17f

    .line 210
    .line 211
    .line 212
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 213
    .line 214
    .line 215
    const v4, 0x3f6147ae    # 0.88f

    .line 216
    .line 217
    .line 218
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 219
    .line 220
    .line 221
    const v4, 0x3f170a3d    # 0.59f

    .line 222
    .line 223
    .line 224
    const v6, -0x40d9999a    # -0.65f

    .line 225
    .line 226
    .line 227
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 228
    .line 229
    .line 230
    const v4, 0x411e147b    # 9.88f

    .line 231
    .line 232
    .line 233
    const/high16 v6, 0x40a00000    # 5.0f

    .line 234
    .line 235
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 236
    .line 237
    .line 238
    const v4, 0x4087ae14    # 4.24f

    .line 239
    .line 240
    .line 241
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 242
    .line 243
    .line 244
    const v4, 0x3f9eb852    # 1.24f

    .line 245
    .line 246
    .line 247
    const v6, 0x3faccccd    # 1.35f

    .line 248
    .line 249
    .line 250
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 251
    .line 252
    .line 253
    const v4, 0x417f3333    # 15.95f

    .line 254
    .line 255
    .line 256
    const/high16 v6, 0x40e00000    # 7.0f

    .line 257
    .line 258
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 259
    .line 260
    .line 261
    const v4, 0x3f6147ae    # 0.88f

    .line 262
    .line 263
    .line 264
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 265
    .line 266
    .line 267
    const/high16 v4, 0x41a00000    # 20.0f

    .line 268
    .line 269
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 270
    .line 271
    .line 272
    const/high16 v4, 0x41980000    # 19.0f

    .line 273
    .line 274
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 275
    .line 276
    .line 277
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 278
    .line 279
    .line 280
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 281
    .line 282
    .line 283
    move-result-object v2

    .line 284
    const/16 v16, 0x3800

    .line 285
    .line 286
    const/16 v17, 0x0

    .line 287
    .line 288
    const/high16 v6, 0x3f800000    # 1.0f

    .line 289
    .line 290
    const/high16 v8, 0x3f800000    # 1.0f

    .line 291
    .line 292
    const/4 v7, 0x0

    .line 293
    const/high16 v9, 0x3f800000    # 1.0f

    .line 294
    .line 295
    const/high16 v12, 0x3f800000    # 1.0f

    .line 296
    .line 297
    const/4 v13, 0x0

    .line 298
    const/4 v14, 0x0

    .line 299
    const/4 v15, 0x0

    .line 300
    const-string v4, ""

    .line 301
    .line 302
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 303
    .line 304
    .line 305
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 306
    .line 307
    .line 308
    move-result v3

    .line 309
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 310
    .line 311
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 312
    .line 313
    .line 314
    move-result-wide v6

    .line 315
    const/4 v2, 0x0

    .line 316
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 317
    .line 318
    .line 319
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 320
    .line 321
    .line 322
    move-result v10

    .line 323
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 324
    .line 325
    .line 326
    move-result v11

    .line 327
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 328
    .line 329
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 330
    .line 331
    .line 332
    const/high16 v4, 0x41880000    # 17.0f

    .line 333
    .line 334
    const/high16 v6, 0x41400000    # 12.0f

    .line 335
    .line 336
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 337
    .line 338
    .line 339
    const/high16 v25, -0x3f800000    # -4.0f

    .line 340
    .line 341
    const/high16 v26, -0x3f800000    # -4.0f

    .line 342
    .line 343
    const v21, -0x3ff28f5c    # -2.21f

    .line 344
    .line 345
    .line 346
    const/16 v22, 0x0

    .line 347
    .line 348
    const/high16 v23, -0x3f800000    # -4.0f

    .line 349
    .line 350
    const v24, -0x401ae148    # -1.79f

    .line 351
    .line 352
    .line 353
    move-object/from16 v20, v2

    .line 354
    .line 355
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 356
    .line 357
    .line 358
    const/high16 v4, 0x40000000    # 2.0f

    .line 359
    .line 360
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 361
    .line 362
    .line 363
    const/high16 v4, -0x3fe00000    # -2.5f

    .line 364
    .line 365
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 366
    .line 367
    .line 368
    const/high16 v4, 0x41500000    # 13.0f

    .line 369
    .line 370
    const/high16 v6, 0x40a00000    # 5.0f

    .line 371
    .line 372
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 373
    .line 374
    .line 375
    const/high16 v4, 0x40000000    # 2.0f

    .line 376
    .line 377
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 378
    .line 379
    .line 380
    const/high16 v25, 0x40a00000    # 5.0f

    .line 381
    .line 382
    const/high16 v26, 0x40a00000    # 5.0f

    .line 383
    .line 384
    const/16 v21, 0x0

    .line 385
    .line 386
    const v22, 0x4030a3d7    # 2.76f

    .line 387
    .line 388
    .line 389
    const v23, 0x400f5c29    # 2.24f

    .line 390
    .line 391
    .line 392
    const/high16 v24, 0x40a00000    # 5.0f

    .line 393
    .line 394
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 395
    .line 396
    .line 397
    const v25, 0x40170a3d    # 2.36f

    .line 398
    .line 399
    .line 400
    const v26, -0x40e147ae    # -0.62f

    .line 401
    .line 402
    .line 403
    const v21, 0x3f5c28f6    # 0.86f

    .line 404
    .line 405
    .line 406
    const/16 v22, 0x0

    .line 407
    .line 408
    const v23, 0x3fd33333    # 1.65f

    .line 409
    .line 410
    .line 411
    const v24, -0x418a3d71    # -0.24f

    .line 412
    .line 413
    .line 414
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 415
    .line 416
    .line 417
    const v4, -0x40c28f5c    # -0.74f

    .line 418
    .line 419
    .line 420
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 421
    .line 422
    .line 423
    const/high16 v25, 0x41400000    # 12.0f

    .line 424
    .line 425
    const/high16 v26, 0x41880000    # 17.0f

    .line 426
    .line 427
    const v21, 0x4152147b    # 13.13f

    .line 428
    .line 429
    .line 430
    const v22, 0x4186f5c3    # 16.87f

    .line 431
    .line 432
    .line 433
    const v23, 0x414947ae    # 12.58f

    .line 434
    .line 435
    .line 436
    const/high16 v24, 0x41880000    # 17.0f

    .line 437
    .line 438
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 439
    .line 440
    .line 441
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 442
    .line 443
    .line 444
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 445
    .line 446
    .line 447
    move-result-object v2

    .line 448
    const/high16 v6, 0x3f800000    # 1.0f

    .line 449
    .line 450
    const/4 v7, 0x0

    .line 451
    const-string v4, ""

    .line 452
    .line 453
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 454
    .line 455
    .line 456
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 457
    .line 458
    .line 459
    move-result v3

    .line 460
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 461
    .line 462
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 463
    .line 464
    .line 465
    move-result-wide v6

    .line 466
    const/4 v0, 0x0

    .line 467
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 468
    .line 469
    .line 470
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 471
    .line 472
    .line 473
    move-result v10

    .line 474
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 475
    .line 476
    .line 477
    move-result v11

    .line 478
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 479
    .line 480
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 481
    .line 482
    .line 483
    const/high16 v0, 0x41000000    # 8.0f

    .line 484
    .line 485
    const/high16 v2, 0x41400000    # 12.0f

    .line 486
    .line 487
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 488
    .line 489
    .line 490
    const v17, -0x3fe8f5c3    # -2.36f

    .line 491
    .line 492
    .line 493
    const v18, 0x3f1eb852    # 0.62f

    .line 494
    .line 495
    .line 496
    const v13, -0x40a3d70a    # -0.86f

    .line 497
    .line 498
    .line 499
    const v15, -0x402ccccd    # -1.65f

    .line 500
    .line 501
    .line 502
    const v16, 0x3e75c28f    # 0.24f

    .line 503
    .line 504
    .line 505
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 506
    .line 507
    .line 508
    const v0, 0x3f3d70a4    # 0.74f

    .line 509
    .line 510
    .line 511
    const v2, 0x3f3ae148    # 0.73f

    .line 512
    .line 513
    .line 514
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 515
    .line 516
    .line 517
    const/high16 v17, 0x41400000    # 12.0f

    .line 518
    .line 519
    const/high16 v18, 0x41100000    # 9.0f

    .line 520
    .line 521
    const v13, 0x412deb85    # 10.87f

    .line 522
    .line 523
    .line 524
    const v14, 0x4112147b    # 9.13f

    .line 525
    .line 526
    .line 527
    const v15, 0x4136b852    # 11.42f

    .line 528
    .line 529
    .line 530
    const/high16 v16, 0x41100000    # 9.0f

    .line 531
    .line 532
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 533
    .line 534
    .line 535
    const/high16 v17, 0x40800000    # 4.0f

    .line 536
    .line 537
    const/high16 v18, 0x40800000    # 4.0f

    .line 538
    .line 539
    const v13, 0x400d70a4    # 2.21f

    .line 540
    .line 541
    .line 542
    const/4 v14, 0x0

    .line 543
    const/high16 v15, 0x40800000    # 4.0f

    .line 544
    .line 545
    const v16, 0x3fe51eb8    # 1.79f

    .line 546
    .line 547
    .line 548
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 549
    .line 550
    .line 551
    const/high16 v0, -0x40000000    # -2.0f

    .line 552
    .line 553
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 554
    .line 555
    .line 556
    const/high16 v0, 0x40200000    # 2.5f

    .line 557
    .line 558
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 559
    .line 560
    .line 561
    const/high16 v0, 0x41500000    # 13.0f

    .line 562
    .line 563
    const/high16 v2, 0x41980000    # 19.0f

    .line 564
    .line 565
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 566
    .line 567
    .line 568
    const/high16 v0, -0x40000000    # -2.0f

    .line 569
    .line 570
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 571
    .line 572
    .line 573
    const/high16 v17, 0x41400000    # 12.0f

    .line 574
    .line 575
    const/high16 v18, 0x41000000    # 8.0f

    .line 576
    .line 577
    const/high16 v13, 0x41880000    # 17.0f

    .line 578
    .line 579
    const v14, 0x4123d70a    # 10.24f

    .line 580
    .line 581
    .line 582
    const v15, 0x416c28f6    # 14.76f

    .line 583
    .line 584
    .line 585
    const/high16 v16, 0x41000000    # 8.0f

    .line 586
    .line 587
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 588
    .line 589
    .line 590
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 591
    .line 592
    .line 593
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 594
    .line 595
    .line 596
    move-result-object v2

    .line 597
    const/16 v16, 0x3800

    .line 598
    .line 599
    const/16 v17, 0x0

    .line 600
    .line 601
    const/high16 v6, 0x3f800000    # 1.0f

    .line 602
    .line 603
    const/4 v7, 0x0

    .line 604
    const/high16 v12, 0x3f800000    # 1.0f

    .line 605
    .line 606
    const/4 v13, 0x0

    .line 607
    const/4 v14, 0x0

    .line 608
    const/4 v15, 0x0

    .line 609
    const-string v4, ""

    .line 610
    .line 611
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 612
    .line 613
    .line 614
    move-result-object v0

    .line 615
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 616
    .line 617
    .line 618
    move-result-object v0

    .line 619
    sput-object v0, Landroidx/compose/material/icons/outlined/FlipCameraIosKt;->_flipCameraIos:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 620
    .line 621
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 622
    .line 623
    .line 624
    return-object v0
.end method
