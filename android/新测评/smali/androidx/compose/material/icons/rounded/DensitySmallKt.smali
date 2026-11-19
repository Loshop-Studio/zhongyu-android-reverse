.class public final Landroidx/compose/material/icons/rounded/DensitySmallKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_densitySmall",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "DensitySmall",
        "Landroidx/compose/material/icons/Icons$Rounded;",
        "getDensitySmall",
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
        "SMAP\nDensitySmall.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DensitySmall.kt\nandroidx/compose/material/icons/rounded/DensitySmallKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,83:1\n212#2,12:84\n233#2,18:97\n253#2:134\n233#2,18:135\n253#2:172\n233#2,18:173\n253#2:210\n233#2,18:211\n253#2:248\n174#3:96\n705#4,2:115\n717#4,2:117\n719#4,11:123\n705#4,2:153\n717#4,2:155\n719#4,11:161\n705#4,2:191\n717#4,2:193\n719#4,11:199\n705#4,2:229\n717#4,2:231\n719#4,11:237\n72#5,4:119\n72#5,4:157\n72#5,4:195\n72#5,4:233\n*S KotlinDebug\n*F\n+ 1 DensitySmall.kt\nandroidx/compose/material/icons/rounded/DensitySmallKt\n*L\n29#1:84,12\n30#1:97,18\n30#1:134\n42#1:135,18\n42#1:172\n54#1:173,18\n54#1:210\n66#1:211,18\n66#1:248\n29#1:96\n30#1:115,2\n30#1:117,2\n30#1:123,11\n42#1:153,2\n42#1:155,2\n42#1:161,11\n54#1:191,2\n54#1:193,2\n54#1:199,11\n66#1:229,2\n66#1:231,2\n66#1:237,11\n30#1:119,4\n42#1:157,4\n54#1:195,4\n66#1:233,4\n*E\n"
    }
.end annotation


# static fields
.field private static _densitySmall:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getDensitySmall(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/DensitySmallKt;->_densitySmall:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.DensitySmall"

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
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 73
    .line 74
    .line 75
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    const/high16 v25, 0x3f800000    # 1.0f

    .line 79
    .line 80
    const/high16 v26, 0x3f800000    # 1.0f

    .line 81
    .line 82
    const/16 v21, 0x0

    .line 83
    .line 84
    const v22, 0x3f0ccccd    # 0.55f

    .line 85
    .line 86
    .line 87
    const v23, 0x3ee66666    # 0.45f

    .line 88
    .line 89
    .line 90
    const/high16 v24, 0x3f800000    # 1.0f

    .line 91
    .line 92
    move-object/from16 v20, v2

    .line 93
    .line 94
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 95
    .line 96
    .line 97
    const/high16 v4, 0x41800000    # 16.0f

    .line 98
    .line 99
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 100
    .line 101
    .line 102
    const/high16 v26, -0x40800000    # -1.0f

    .line 103
    .line 104
    const v21, 0x3f0ccccd    # 0.55f

    .line 105
    .line 106
    .line 107
    const/16 v22, 0x0

    .line 108
    .line 109
    const/high16 v23, 0x3f800000    # 1.0f

    .line 110
    .line 111
    const v24, -0x4119999a    # -0.45f

    .line 112
    .line 113
    .line 114
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 115
    .line 116
    .line 117
    const/4 v4, 0x0

    .line 118
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 119
    .line 120
    .line 121
    const/high16 v25, -0x40800000    # -1.0f

    .line 122
    .line 123
    const/16 v21, 0x0

    .line 124
    .line 125
    const v22, -0x40f33333    # -0.55f

    .line 126
    .line 127
    .line 128
    const v23, -0x4119999a    # -0.45f

    .line 129
    .line 130
    .line 131
    const/high16 v24, -0x40800000    # -1.0f

    .line 132
    .line 133
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 134
    .line 135
    .line 136
    const/high16 v4, 0x40800000    # 4.0f

    .line 137
    .line 138
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 139
    .line 140
    .line 141
    const/high16 v25, 0x40400000    # 3.0f

    .line 142
    .line 143
    const/high16 v26, 0x40400000    # 3.0f

    .line 144
    .line 145
    const v21, 0x405ccccd    # 3.45f

    .line 146
    .line 147
    .line 148
    const/high16 v22, 0x40000000    # 2.0f

    .line 149
    .line 150
    const/high16 v23, 0x40400000    # 3.0f

    .line 151
    .line 152
    const v24, 0x401ccccd    # 2.45f

    .line 153
    .line 154
    .line 155
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 156
    .line 157
    .line 158
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 159
    .line 160
    .line 161
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 162
    .line 163
    .line 164
    move-result-object v2

    .line 165
    const/16 v16, 0x3800

    .line 166
    .line 167
    const/16 v17, 0x0

    .line 168
    .line 169
    const/high16 v6, 0x3f800000    # 1.0f

    .line 170
    .line 171
    const/high16 v8, 0x3f800000    # 1.0f

    .line 172
    .line 173
    const/4 v7, 0x0

    .line 174
    const/high16 v9, 0x3f800000    # 1.0f

    .line 175
    .line 176
    const/high16 v12, 0x3f800000    # 1.0f

    .line 177
    .line 178
    const/4 v13, 0x0

    .line 179
    const/4 v14, 0x0

    .line 180
    const/4 v15, 0x0

    .line 181
    const-string v4, ""

    .line 182
    .line 183
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 184
    .line 185
    .line 186
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 187
    .line 188
    .line 189
    move-result v3

    .line 190
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 191
    .line 192
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 193
    .line 194
    .line 195
    move-result-wide v6

    .line 196
    const/4 v2, 0x0

    .line 197
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 198
    .line 199
    .line 200
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 201
    .line 202
    .line 203
    move-result v10

    .line 204
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 205
    .line 206
    .line 207
    move-result v11

    .line 208
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 209
    .line 210
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 211
    .line 212
    .line 213
    const/high16 v4, 0x41b00000    # 22.0f

    .line 214
    .line 215
    const/high16 v6, 0x40800000    # 4.0f

    .line 216
    .line 217
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 218
    .line 219
    .line 220
    const/high16 v4, 0x41800000    # 16.0f

    .line 221
    .line 222
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 223
    .line 224
    .line 225
    const/high16 v25, 0x3f800000    # 1.0f

    .line 226
    .line 227
    const/high16 v26, -0x40800000    # -1.0f

    .line 228
    .line 229
    const v21, 0x3f0ccccd    # 0.55f

    .line 230
    .line 231
    .line 232
    const/16 v22, 0x0

    .line 233
    .line 234
    const/high16 v23, 0x3f800000    # 1.0f

    .line 235
    .line 236
    const v24, -0x4119999a    # -0.45f

    .line 237
    .line 238
    .line 239
    move-object/from16 v20, v2

    .line 240
    .line 241
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 242
    .line 243
    .line 244
    const/4 v4, 0x0

    .line 245
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 246
    .line 247
    .line 248
    const/high16 v25, -0x40800000    # -1.0f

    .line 249
    .line 250
    const/16 v21, 0x0

    .line 251
    .line 252
    const v22, -0x40f33333    # -0.55f

    .line 253
    .line 254
    .line 255
    const v23, -0x4119999a    # -0.45f

    .line 256
    .line 257
    .line 258
    const/high16 v24, -0x40800000    # -1.0f

    .line 259
    .line 260
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 261
    .line 262
    .line 263
    const/high16 v4, 0x40800000    # 4.0f

    .line 264
    .line 265
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 266
    .line 267
    .line 268
    const/high16 v26, 0x3f800000    # 1.0f

    .line 269
    .line 270
    const v21, -0x40f33333    # -0.55f

    .line 271
    .line 272
    .line 273
    const/16 v22, 0x0

    .line 274
    .line 275
    const/high16 v23, -0x40800000    # -1.0f

    .line 276
    .line 277
    const v24, 0x3ee66666    # 0.45f

    .line 278
    .line 279
    .line 280
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 281
    .line 282
    .line 283
    const/4 v4, 0x0

    .line 284
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 285
    .line 286
    .line 287
    const/high16 v25, 0x40800000    # 4.0f

    .line 288
    .line 289
    const/high16 v26, 0x41b00000    # 22.0f

    .line 290
    .line 291
    const/high16 v21, 0x40400000    # 3.0f

    .line 292
    .line 293
    const v22, 0x41ac6666    # 21.55f

    .line 294
    .line 295
    .line 296
    const v23, 0x405ccccd    # 3.45f

    .line 297
    .line 298
    .line 299
    const/high16 v24, 0x41b00000    # 22.0f

    .line 300
    .line 301
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 302
    .line 303
    .line 304
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 305
    .line 306
    .line 307
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 308
    .line 309
    .line 310
    move-result-object v2

    .line 311
    const/high16 v6, 0x3f800000    # 1.0f

    .line 312
    .line 313
    const/4 v7, 0x0

    .line 314
    const-string v4, ""

    .line 315
    .line 316
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 317
    .line 318
    .line 319
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 320
    .line 321
    .line 322
    move-result v3

    .line 323
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 324
    .line 325
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 326
    .line 327
    .line 328
    move-result-wide v6

    .line 329
    const/4 v2, 0x0

    .line 330
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 331
    .line 332
    .line 333
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 334
    .line 335
    .line 336
    move-result v10

    .line 337
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 338
    .line 339
    .line 340
    move-result v11

    .line 341
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 342
    .line 343
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 344
    .line 345
    .line 346
    const/high16 v4, 0x41800000    # 16.0f

    .line 347
    .line 348
    const/high16 v6, 0x40800000    # 4.0f

    .line 349
    .line 350
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 351
    .line 352
    .line 353
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 354
    .line 355
    .line 356
    const/high16 v25, 0x3f800000    # 1.0f

    .line 357
    .line 358
    const/high16 v26, -0x40800000    # -1.0f

    .line 359
    .line 360
    const v21, 0x3f0ccccd    # 0.55f

    .line 361
    .line 362
    .line 363
    const/16 v22, 0x0

    .line 364
    .line 365
    const/high16 v23, 0x3f800000    # 1.0f

    .line 366
    .line 367
    const v24, -0x4119999a    # -0.45f

    .line 368
    .line 369
    .line 370
    move-object/from16 v20, v2

    .line 371
    .line 372
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 373
    .line 374
    .line 375
    const/4 v4, 0x0

    .line 376
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 377
    .line 378
    .line 379
    const/high16 v25, -0x40800000    # -1.0f

    .line 380
    .line 381
    const/16 v21, 0x0

    .line 382
    .line 383
    const v22, -0x40f33333    # -0.55f

    .line 384
    .line 385
    .line 386
    const v23, -0x4119999a    # -0.45f

    .line 387
    .line 388
    .line 389
    const/high16 v24, -0x40800000    # -1.0f

    .line 390
    .line 391
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 392
    .line 393
    .line 394
    const/high16 v4, 0x40800000    # 4.0f

    .line 395
    .line 396
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 397
    .line 398
    .line 399
    const/high16 v26, 0x3f800000    # 1.0f

    .line 400
    .line 401
    const v21, -0x40f33333    # -0.55f

    .line 402
    .line 403
    .line 404
    const/16 v22, 0x0

    .line 405
    .line 406
    const/high16 v23, -0x40800000    # -1.0f

    .line 407
    .line 408
    const v24, 0x3ee66666    # 0.45f

    .line 409
    .line 410
    .line 411
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 412
    .line 413
    .line 414
    const/4 v4, 0x0

    .line 415
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 416
    .line 417
    .line 418
    const/high16 v25, 0x40800000    # 4.0f

    .line 419
    .line 420
    const/high16 v26, 0x41800000    # 16.0f

    .line 421
    .line 422
    const/high16 v21, 0x40400000    # 3.0f

    .line 423
    .line 424
    const v22, 0x4178cccd    # 15.55f

    .line 425
    .line 426
    .line 427
    const v23, 0x405ccccd    # 3.45f

    .line 428
    .line 429
    .line 430
    const/high16 v24, 0x41800000    # 16.0f

    .line 431
    .line 432
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 433
    .line 434
    .line 435
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 436
    .line 437
    .line 438
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 439
    .line 440
    .line 441
    move-result-object v2

    .line 442
    const/high16 v6, 0x3f800000    # 1.0f

    .line 443
    .line 444
    const/4 v7, 0x0

    .line 445
    const-string v4, ""

    .line 446
    .line 447
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 448
    .line 449
    .line 450
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 451
    .line 452
    .line 453
    move-result v3

    .line 454
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 455
    .line 456
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 457
    .line 458
    .line 459
    move-result-wide v6

    .line 460
    const/4 v0, 0x0

    .line 461
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 462
    .line 463
    .line 464
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 465
    .line 466
    .line 467
    move-result v10

    .line 468
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 469
    .line 470
    .line 471
    move-result v11

    .line 472
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 473
    .line 474
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 475
    .line 476
    .line 477
    const/high16 v0, 0x41200000    # 10.0f

    .line 478
    .line 479
    const/high16 v2, 0x40800000    # 4.0f

    .line 480
    .line 481
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 482
    .line 483
    .line 484
    const/high16 v0, 0x41800000    # 16.0f

    .line 485
    .line 486
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 487
    .line 488
    .line 489
    const/high16 v17, 0x3f800000    # 1.0f

    .line 490
    .line 491
    const/high16 v18, -0x40800000    # -1.0f

    .line 492
    .line 493
    const v13, 0x3f0ccccd    # 0.55f

    .line 494
    .line 495
    .line 496
    const/high16 v15, 0x3f800000    # 1.0f

    .line 497
    .line 498
    const v16, -0x4119999a    # -0.45f

    .line 499
    .line 500
    .line 501
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 502
    .line 503
    .line 504
    const/4 v0, 0x0

    .line 505
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 506
    .line 507
    .line 508
    const/high16 v17, -0x40800000    # -1.0f

    .line 509
    .line 510
    const/4 v13, 0x0

    .line 511
    const v14, -0x40f33333    # -0.55f

    .line 512
    .line 513
    .line 514
    const v15, -0x4119999a    # -0.45f

    .line 515
    .line 516
    .line 517
    const/high16 v16, -0x40800000    # -1.0f

    .line 518
    .line 519
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 520
    .line 521
    .line 522
    const/high16 v0, 0x40800000    # 4.0f

    .line 523
    .line 524
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 525
    .line 526
    .line 527
    const/high16 v17, 0x40400000    # 3.0f

    .line 528
    .line 529
    const/high16 v18, 0x41100000    # 9.0f

    .line 530
    .line 531
    const v13, 0x405ccccd    # 3.45f

    .line 532
    .line 533
    .line 534
    const/high16 v14, 0x41000000    # 8.0f

    .line 535
    .line 536
    const/high16 v15, 0x40400000    # 3.0f

    .line 537
    .line 538
    const v16, 0x41073333    # 8.45f

    .line 539
    .line 540
    .line 541
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 542
    .line 543
    .line 544
    const/4 v0, 0x0

    .line 545
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 546
    .line 547
    .line 548
    const/high16 v17, 0x40800000    # 4.0f

    .line 549
    .line 550
    const/high16 v18, 0x41200000    # 10.0f

    .line 551
    .line 552
    const/high16 v13, 0x40400000    # 3.0f

    .line 553
    .line 554
    const v14, 0x4118cccd    # 9.55f

    .line 555
    .line 556
    .line 557
    const v15, 0x405ccccd    # 3.45f

    .line 558
    .line 559
    .line 560
    const/high16 v16, 0x41200000    # 10.0f

    .line 561
    .line 562
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 563
    .line 564
    .line 565
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 566
    .line 567
    .line 568
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 569
    .line 570
    .line 571
    move-result-object v2

    .line 572
    const/16 v16, 0x3800

    .line 573
    .line 574
    const/16 v17, 0x0

    .line 575
    .line 576
    const/high16 v6, 0x3f800000    # 1.0f

    .line 577
    .line 578
    const/4 v7, 0x0

    .line 579
    const/high16 v12, 0x3f800000    # 1.0f

    .line 580
    .line 581
    const/4 v13, 0x0

    .line 582
    const/4 v14, 0x0

    .line 583
    const/4 v15, 0x0

    .line 584
    const-string v4, ""

    .line 585
    .line 586
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 587
    .line 588
    .line 589
    move-result-object v0

    .line 590
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 591
    .line 592
    .line 593
    move-result-object v0

    .line 594
    sput-object v0, Landroidx/compose/material/icons/rounded/DensitySmallKt;->_densitySmall:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 595
    .line 596
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 597
    .line 598
    .line 599
    return-object v0
.end method
