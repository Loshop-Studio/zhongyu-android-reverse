.class public final Landroidx/compose/material/icons/outlined/MicExternalOffKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_micExternalOff",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "MicExternalOff",
        "Landroidx/compose/material/icons/Icons$Outlined;",
        "getMicExternalOff",
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
        "SMAP\nMicExternalOff.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MicExternalOff.kt\nandroidx/compose/material/icons/outlined/MicExternalOffKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,87:1\n212#2,12:88\n233#2,18:101\n253#2:138\n233#2,18:139\n253#2:176\n233#2,18:177\n253#2:214\n174#3:100\n705#4,2:119\n717#4,2:121\n719#4,11:127\n705#4,2:157\n717#4,2:159\n719#4,11:165\n705#4,2:195\n717#4,2:197\n719#4,11:203\n72#5,4:123\n72#5,4:161\n72#5,4:199\n*S KotlinDebug\n*F\n+ 1 MicExternalOff.kt\nandroidx/compose/material/icons/outlined/MicExternalOffKt\n*L\n29#1:88,12\n30#1:101,18\n30#1:138\n38#1:139,18\n38#1:176\n52#1:177,18\n52#1:214\n29#1:100\n30#1:119,2\n30#1:121,2\n30#1:127,11\n38#1:157,2\n38#1:159,2\n38#1:165,11\n52#1:195,2\n52#1:197,2\n52#1:203,11\n30#1:123,4\n38#1:161,4\n52#1:199,4\n*E\n"
    }
.end annotation


# static fields
.field private static _micExternalOff:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getMicExternalOff(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/outlined/MicExternalOffKt;->_micExternalOff:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Outlined.MicExternalOff"

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
    const/high16 v4, 0x40a00000    # 5.0f

    .line 71
    .line 72
    const/high16 v6, 0x41200000    # 10.0f

    .line 73
    .line 74
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v25, -0x3fc00000    # -3.0f

    .line 78
    .line 79
    const/high16 v26, -0x3fc00000    # -3.0f

    .line 80
    .line 81
    const/16 v21, 0x0

    .line 82
    .line 83
    const v22, -0x402b851f    # -1.66f

    .line 84
    .line 85
    .line 86
    const v23, -0x40547ae1    # -1.34f

    .line 87
    .line 88
    .line 89
    const/high16 v24, -0x3fc00000    # -3.0f

    .line 90
    .line 91
    move-object/from16 v20, v2

    .line 92
    .line 93
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 94
    .line 95
    .line 96
    const v25, 0x40aa8f5c    # 5.33f

    .line 97
    .line 98
    .line 99
    const/high16 v26, 0x40200000    # 2.5f

    .line 100
    .line 101
    const v21, 0x40cc28f6    # 6.38f

    .line 102
    .line 103
    .line 104
    const/high16 v22, 0x40000000    # 2.0f

    .line 105
    .line 106
    const v23, 0x40b9eb85    # 5.81f

    .line 107
    .line 108
    .line 109
    const v24, 0x400c28f6    # 2.19f

    .line 110
    .line 111
    .line 112
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 113
    .line 114
    .line 115
    const v4, 0x4084cccd    # 4.15f

    .line 116
    .line 117
    .line 118
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 119
    .line 120
    .line 121
    const/high16 v25, 0x41200000    # 10.0f

    .line 122
    .line 123
    const/high16 v26, 0x40a00000    # 5.0f

    .line 124
    .line 125
    const v21, 0x411ccccd    # 9.8f

    .line 126
    .line 127
    .line 128
    const v22, 0x40c5c28f    # 6.18f

    .line 129
    .line 130
    .line 131
    const/high16 v23, 0x41200000    # 10.0f

    .line 132
    .line 133
    const v24, 0x40b3851f    # 5.61f

    .line 134
    .line 135
    .line 136
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 137
    .line 138
    .line 139
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 140
    .line 141
    .line 142
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 143
    .line 144
    .line 145
    move-result-object v2

    .line 146
    const/16 v16, 0x3800

    .line 147
    .line 148
    const/16 v17, 0x0

    .line 149
    .line 150
    const/high16 v6, 0x3f800000    # 1.0f

    .line 151
    .line 152
    const/high16 v8, 0x3f800000    # 1.0f

    .line 153
    .line 154
    const/4 v7, 0x0

    .line 155
    const/high16 v9, 0x3f800000    # 1.0f

    .line 156
    .line 157
    const/high16 v12, 0x3f800000    # 1.0f

    .line 158
    .line 159
    const/4 v13, 0x0

    .line 160
    const/4 v14, 0x0

    .line 161
    const/4 v15, 0x0

    .line 162
    const-string v4, ""

    .line 163
    .line 164
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 165
    .line 166
    .line 167
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 168
    .line 169
    .line 170
    move-result v3

    .line 171
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 172
    .line 173
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 174
    .line 175
    .line 176
    move-result-wide v6

    .line 177
    const/4 v2, 0x0

    .line 178
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 179
    .line 180
    .line 181
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 182
    .line 183
    .line 184
    move-result v10

    .line 185
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 186
    .line 187
    .line 188
    move-result v11

    .line 189
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 190
    .line 191
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 192
    .line 193
    .line 194
    const/high16 v4, 0x41600000    # 14.0f

    .line 195
    .line 196
    const/high16 v6, 0x40c00000    # 6.0f

    .line 197
    .line 198
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 199
    .line 200
    .line 201
    const/high16 v25, 0x40000000    # 2.0f

    .line 202
    .line 203
    const/high16 v26, -0x40000000    # -2.0f

    .line 204
    .line 205
    const/16 v21, 0x0

    .line 206
    .line 207
    const v22, -0x40733333    # -1.1f

    .line 208
    .line 209
    .line 210
    const v23, 0x3f666666    # 0.9f

    .line 211
    .line 212
    .line 213
    const/high16 v24, -0x40000000    # -2.0f

    .line 214
    .line 215
    move-object/from16 v20, v2

    .line 216
    .line 217
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 218
    .line 219
    .line 220
    const v4, 0x3f666666    # 0.9f

    .line 221
    .line 222
    .line 223
    const/high16 v6, 0x40000000    # 2.0f

    .line 224
    .line 225
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 226
    .line 227
    .line 228
    const v4, 0x4112b852    # 9.17f

    .line 229
    .line 230
    .line 231
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 232
    .line 233
    .line 234
    const/high16 v4, 0x40000000    # 2.0f

    .line 235
    .line 236
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 237
    .line 238
    .line 239
    const/high16 v4, 0x40c00000    # 6.0f

    .line 240
    .line 241
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 242
    .line 243
    .line 244
    const/high16 v25, -0x3f800000    # -4.0f

    .line 245
    .line 246
    const/high16 v26, -0x3f800000    # -4.0f

    .line 247
    .line 248
    const v22, -0x3ff28f5c    # -2.21f

    .line 249
    .line 250
    .line 251
    const v23, -0x401ae148    # -1.79f

    .line 252
    .line 253
    .line 254
    const/high16 v24, -0x3f800000    # -4.0f

    .line 255
    .line 256
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 257
    .line 258
    .line 259
    const v4, 0x3fe51eb8    # 1.79f

    .line 260
    .line 261
    .line 262
    const/high16 v6, -0x3f800000    # -4.0f

    .line 263
    .line 264
    const/high16 v7, 0x40800000    # 4.0f

    .line 265
    .line 266
    invoke-virtual {v2, v6, v4, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 267
    .line 268
    .line 269
    const v4, 0x404ae148    # 3.17f

    .line 270
    .line 271
    .line 272
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 273
    .line 274
    .line 275
    const/high16 v4, 0x40000000    # 2.0f

    .line 276
    .line 277
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 278
    .line 279
    .line 280
    const/high16 v4, 0x40c00000    # 6.0f

    .line 281
    .line 282
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 283
    .line 284
    .line 285
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 286
    .line 287
    .line 288
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 289
    .line 290
    .line 291
    move-result-object v2

    .line 292
    const/high16 v6, 0x3f800000    # 1.0f

    .line 293
    .line 294
    const/4 v7, 0x0

    .line 295
    const-string v4, ""

    .line 296
    .line 297
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 298
    .line 299
    .line 300
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 301
    .line 302
    .line 303
    move-result v3

    .line 304
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 305
    .line 306
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 307
    .line 308
    .line 309
    move-result-wide v6

    .line 310
    const/4 v0, 0x0

    .line 311
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 312
    .line 313
    .line 314
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 315
    .line 316
    .line 317
    move-result v10

    .line 318
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 319
    .line 320
    .line 321
    move-result v11

    .line 322
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 323
    .line 324
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 325
    .line 326
    .line 327
    const v0, 0x40066666    # 2.1f

    .line 328
    .line 329
    .line 330
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 331
    .line 332
    .line 333
    const v0, 0x3f30a3d7    # 0.69f

    .line 334
    .line 335
    .line 336
    const v2, 0x4060a3d7    # 3.51f

    .line 337
    .line 338
    .line 339
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 340
    .line 341
    .line 342
    const v0, 0x40a570a4    # 5.17f

    .line 343
    .line 344
    .line 345
    const/high16 v2, 0x41000000    # 8.0f

    .line 346
    .line 347
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 348
    .line 349
    .line 350
    const/high16 v0, 0x40800000    # 4.0f

    .line 351
    .line 352
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 353
    .line 354
    .line 355
    const/high16 v0, 0x41200000    # 10.0f

    .line 356
    .line 357
    const/high16 v2, 0x3f800000    # 1.0f

    .line 358
    .line 359
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 360
    .line 361
    .line 362
    const/high16 v0, 0x3f800000    # 1.0f

    .line 363
    .line 364
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 365
    .line 366
    .line 367
    const/high16 v17, 0x40800000    # 4.0f

    .line 368
    .line 369
    const/high16 v18, 0x40800000    # 4.0f

    .line 370
    .line 371
    const v14, 0x400d70a4    # 2.21f

    .line 372
    .line 373
    .line 374
    const v15, 0x3fe51eb8    # 1.79f

    .line 375
    .line 376
    .line 377
    const/high16 v16, 0x40800000    # 4.0f

    .line 378
    .line 379
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 380
    .line 381
    .line 382
    const v0, -0x401ae148    # -1.79f

    .line 383
    .line 384
    .line 385
    const/high16 v2, -0x3f800000    # -4.0f

    .line 386
    .line 387
    const/high16 v4, 0x40800000    # 4.0f

    .line 388
    .line 389
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 390
    .line 391
    .line 392
    const v0, -0x406a3d71    # -1.17f

    .line 393
    .line 394
    .line 395
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 396
    .line 397
    .line 398
    const v0, 0x40cfae14    # 6.49f

    .line 399
    .line 400
    .line 401
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 402
    .line 403
    .line 404
    const v0, 0x3fb47ae1    # 1.41f

    .line 405
    .line 406
    .line 407
    const v2, -0x404b851f    # -1.41f

    .line 408
    .line 409
    .line 410
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 411
    .line 412
    .line 413
    const v0, 0x40066666    # 2.1f

    .line 414
    .line 415
    .line 416
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 417
    .line 418
    .line 419
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 420
    .line 421
    .line 422
    const/high16 v0, 0x41800000    # 16.0f

    .line 423
    .line 424
    const v2, 0x40e6147b    # 7.19f

    .line 425
    .line 426
    .line 427
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 428
    .line 429
    .line 430
    const v0, 0x40d9eb85    # 6.81f

    .line 431
    .line 432
    .line 433
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 434
    .line 435
    .line 436
    const v0, -0x40e66666    # -0.6f

    .line 437
    .line 438
    .line 439
    const/high16 v2, -0x3f400000    # -6.0f

    .line 440
    .line 441
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 442
    .line 443
    .line 444
    const v0, 0x3f75c28f    # 0.96f

    .line 445
    .line 446
    .line 447
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 448
    .line 449
    .line 450
    const v0, 0x3f0f5c29    # 0.56f

    .line 451
    .line 452
    .line 453
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 454
    .line 455
    .line 456
    const/high16 v0, 0x41800000    # 16.0f

    .line 457
    .line 458
    const v2, 0x40e6147b    # 7.19f

    .line 459
    .line 460
    .line 461
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 462
    .line 463
    .line 464
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 465
    .line 466
    .line 467
    const/high16 v0, 0x41900000    # 18.0f

    .line 468
    .line 469
    const/high16 v2, 0x41400000    # 12.0f

    .line 470
    .line 471
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 472
    .line 473
    .line 474
    const/high16 v17, -0x40000000    # -2.0f

    .line 475
    .line 476
    const/high16 v18, 0x40000000    # 2.0f

    .line 477
    .line 478
    const v14, 0x3f8ccccd    # 1.1f

    .line 479
    .line 480
    .line 481
    const v15, -0x4099999a    # -0.9f

    .line 482
    .line 483
    .line 484
    const/high16 v16, 0x40000000    # 2.0f

    .line 485
    .line 486
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 487
    .line 488
    .line 489
    const v0, -0x4099999a    # -0.9f

    .line 490
    .line 491
    .line 492
    const/high16 v2, -0x40000000    # -2.0f

    .line 493
    .line 494
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 495
    .line 496
    .line 497
    const/high16 v0, 0x3f800000    # 1.0f

    .line 498
    .line 499
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 500
    .line 501
    .line 502
    const v0, -0x3f4c7ae1    # -5.61f

    .line 503
    .line 504
    .line 505
    const v2, 0x3f0f5c29    # 0.56f

    .line 506
    .line 507
    .line 508
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 509
    .line 510
    .line 511
    const v0, 0x416d47ae    # 14.83f

    .line 512
    .line 513
    .line 514
    const/high16 v2, 0x41400000    # 12.0f

    .line 515
    .line 516
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 517
    .line 518
    .line 519
    const/high16 v0, 0x41900000    # 18.0f

    .line 520
    .line 521
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 522
    .line 523
    .line 524
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 525
    .line 526
    .line 527
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 528
    .line 529
    .line 530
    move-result-object v2

    .line 531
    const/16 v16, 0x3800

    .line 532
    .line 533
    const/16 v17, 0x0

    .line 534
    .line 535
    const/high16 v6, 0x3f800000    # 1.0f

    .line 536
    .line 537
    const/4 v7, 0x0

    .line 538
    const/high16 v12, 0x3f800000    # 1.0f

    .line 539
    .line 540
    const/4 v14, 0x0

    .line 541
    const/4 v15, 0x0

    .line 542
    const-string v4, ""

    .line 543
    .line 544
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 545
    .line 546
    .line 547
    move-result-object v0

    .line 548
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 549
    .line 550
    .line 551
    move-result-object v0

    .line 552
    sput-object v0, Landroidx/compose/material/icons/outlined/MicExternalOffKt;->_micExternalOff:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 553
    .line 554
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 555
    .line 556
    .line 557
    return-object v0
.end method
