.class public final Landroidx/compose/material/icons/rounded/LandslideKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_landslide",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "Landslide",
        "Landroidx/compose/material/icons/Icons$Rounded;",
        "getLandslide",
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
        "SMAP\nLandslide.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Landslide.kt\nandroidx/compose/material/icons/rounded/LandslideKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,98:1\n212#2,12:99\n233#2,18:112\n253#2:149\n233#2,18:150\n253#2:187\n233#2,18:188\n253#2:225\n233#2,18:226\n253#2:263\n233#2,18:264\n253#2:301\n174#3:111\n705#4,2:130\n717#4,2:132\n719#4,11:138\n705#4,2:168\n717#4,2:170\n719#4,11:176\n705#4,2:206\n717#4,2:208\n719#4,11:214\n705#4,2:244\n717#4,2:246\n719#4,11:252\n705#4,2:282\n717#4,2:284\n719#4,11:290\n72#5,4:134\n72#5,4:172\n72#5,4:210\n72#5,4:248\n72#5,4:286\n*S KotlinDebug\n*F\n+ 1 Landslide.kt\nandroidx/compose/material/icons/rounded/LandslideKt\n*L\n29#1:99,12\n30#1:112,18\n30#1:149\n39#1:150,18\n39#1:187\n50#1:188,18\n50#1:225\n61#1:226,18\n61#1:263\n77#1:264,18\n77#1:301\n29#1:111\n30#1:130,2\n30#1:132,2\n30#1:138,11\n39#1:168,2\n39#1:170,2\n39#1:176,11\n50#1:206,2\n50#1:208,2\n50#1:214,11\n61#1:244,2\n61#1:246,2\n61#1:252,11\n77#1:282,2\n77#1:284,2\n77#1:290,11\n30#1:134,4\n39#1:172,4\n50#1:210,4\n61#1:248,4\n77#1:286,4\n*E\n"
    }
.end annotation


# static fields
.field private static _landslide:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getLandslide(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/LandslideKt;->_landslide:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.Landslide"

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
    const v4, 0x4177851f    # 15.47f

    .line 71
    .line 72
    .line 73
    const v6, 0x415ca3d7    # 13.79f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v4, -0x407c28f6    # -1.03f

    .line 80
    .line 81
    .line 82
    const v6, -0x3fdae148    # -2.58f

    .line 83
    .line 84
    .line 85
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 86
    .line 87
    .line 88
    const v4, -0x3f23851f    # -6.89f

    .line 89
    .line 90
    .line 91
    const v6, 0x40128f5c    # 2.29f

    .line 92
    .line 93
    .line 94
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 95
    .line 96
    .line 97
    const v4, -0x403ae148    # -1.54f

    .line 98
    .line 99
    .line 100
    const/high16 v6, -0x3f800000    # -4.0f

    .line 101
    .line 102
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 103
    .line 104
    .line 105
    const/4 v4, 0x0

    .line 106
    const v6, 0x40066666    # 2.1f

    .line 107
    .line 108
    .line 109
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 110
    .line 111
    .line 112
    const v4, 0x3fab851f    # 1.34f

    .line 113
    .line 114
    .line 115
    const/high16 v6, 0x40800000    # 4.0f

    .line 116
    .line 117
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 118
    .line 119
    .line 120
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 121
    .line 122
    .line 123
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 124
    .line 125
    .line 126
    move-result-object v2

    .line 127
    const/16 v16, 0x3800

    .line 128
    .line 129
    const/16 v17, 0x0

    .line 130
    .line 131
    const/high16 v6, 0x3f800000    # 1.0f

    .line 132
    .line 133
    const/high16 v8, 0x3f800000    # 1.0f

    .line 134
    .line 135
    const/4 v7, 0x0

    .line 136
    const/high16 v9, 0x3f800000    # 1.0f

    .line 137
    .line 138
    const/high16 v12, 0x3f800000    # 1.0f

    .line 139
    .line 140
    const/4 v13, 0x0

    .line 141
    const/4 v14, 0x0

    .line 142
    const/4 v15, 0x0

    .line 143
    const-string v4, ""

    .line 144
    .line 145
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 146
    .line 147
    .line 148
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 149
    .line 150
    .line 151
    move-result v3

    .line 152
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 153
    .line 154
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 155
    .line 156
    .line 157
    move-result-wide v6

    .line 158
    const/4 v2, 0x0

    .line 159
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 160
    .line 161
    .line 162
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 163
    .line 164
    .line 165
    move-result v10

    .line 166
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 167
    .line 168
    .line 169
    move-result v11

    .line 170
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 171
    .line 172
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 173
    .line 174
    .line 175
    const v4, 0x4136b852    # 11.42f

    .line 176
    .line 177
    .line 178
    const v6, 0x41291eb8    # 10.57f

    .line 179
    .line 180
    .line 181
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 182
    .line 183
    .line 184
    const v4, 0x4109999a    # 8.6f

    .line 185
    .line 186
    .line 187
    const v6, 0x410ccccd    # 8.8f

    .line 188
    .line 189
    .line 190
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 191
    .line 192
    .line 193
    const/high16 v25, 0x40e00000    # 7.0f

    .line 194
    .line 195
    const/high16 v26, 0x41000000    # 8.0f

    .line 196
    .line 197
    const v21, 0x4103851f    # 8.22f

    .line 198
    .line 199
    .line 200
    const v22, 0x4104cccd    # 8.3f

    .line 201
    .line 202
    .line 203
    const v23, 0x40f428f6    # 7.63f

    .line 204
    .line 205
    .line 206
    const/high16 v24, 0x41000000    # 8.0f

    .line 207
    .line 208
    move-object/from16 v20, v2

    .line 209
    .line 210
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 211
    .line 212
    .line 213
    const/high16 v4, 0x40800000    # 4.0f

    .line 214
    .line 215
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 216
    .line 217
    .line 218
    const/high16 v25, -0x40000000    # -2.0f

    .line 219
    .line 220
    const/high16 v26, 0x40000000    # 2.0f

    .line 221
    .line 222
    const v21, -0x40733333    # -1.1f

    .line 223
    .line 224
    .line 225
    const/16 v22, 0x0

    .line 226
    .line 227
    const/high16 v23, -0x40000000    # -2.0f

    .line 228
    .line 229
    const v24, 0x3f666666    # 0.9f

    .line 230
    .line 231
    .line 232
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 233
    .line 234
    .line 235
    const v4, 0x3fce147b    # 1.61f

    .line 236
    .line 237
    .line 238
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 239
    .line 240
    .line 241
    const v4, 0x3faa3d71    # 1.33f

    .line 242
    .line 243
    .line 244
    const/high16 v6, 0x40800000    # 4.0f

    .line 245
    .line 246
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 247
    .line 248
    .line 249
    const v4, 0x4136b852    # 11.42f

    .line 250
    .line 251
    .line 252
    const v6, 0x41291eb8    # 10.57f

    .line 253
    .line 254
    .line 255
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 256
    .line 257
    .line 258
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 259
    .line 260
    .line 261
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 262
    .line 263
    .line 264
    move-result-object v2

    .line 265
    const/high16 v6, 0x3f800000    # 1.0f

    .line 266
    .line 267
    const/4 v7, 0x0

    .line 268
    const-string v4, ""

    .line 269
    .line 270
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 271
    .line 272
    .line 273
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 274
    .line 275
    .line 276
    move-result v3

    .line 277
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 278
    .line 279
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 280
    .line 281
    .line 282
    move-result-wide v6

    .line 283
    const/4 v2, 0x0

    .line 284
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 285
    .line 286
    .line 287
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 288
    .line 289
    .line 290
    move-result v10

    .line 291
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 292
    .line 293
    .line 294
    move-result v11

    .line 295
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 296
    .line 297
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 298
    .line 299
    .line 300
    const v4, 0x41986666    # 19.05f

    .line 301
    .line 302
    .line 303
    const/high16 v6, 0x40c00000    # 6.0f

    .line 304
    .line 305
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 306
    .line 307
    .line 308
    const v4, -0x4055c28f    # -1.33f

    .line 309
    .line 310
    .line 311
    const/high16 v6, -0x3f800000    # -4.0f

    .line 312
    .line 313
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 314
    .line 315
    .line 316
    const/high16 v4, 0x41a00000    # 20.0f

    .line 317
    .line 318
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 319
    .line 320
    .line 321
    const/high16 v25, 0x40000000    # 2.0f

    .line 322
    .line 323
    const/16 v21, 0x0

    .line 324
    .line 325
    const v22, 0x3f8ccccd    # 1.1f

    .line 326
    .line 327
    .line 328
    const v23, 0x3f666666    # 0.9f

    .line 329
    .line 330
    .line 331
    const/high16 v24, 0x40000000    # 2.0f

    .line 332
    .line 333
    move-object/from16 v20, v2

    .line 334
    .line 335
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 336
    .line 337
    .line 338
    const/high16 v4, 0x41600000    # 14.0f

    .line 339
    .line 340
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 341
    .line 342
    .line 343
    const v25, 0x3fcccccd    # 1.6f

    .line 344
    .line 345
    .line 346
    const v26, -0x3fb33333    # -3.2f

    .line 347
    .line 348
    .line 349
    const v21, 0x3fd33333    # 1.65f

    .line 350
    .line 351
    .line 352
    const/16 v22, 0x0

    .line 353
    .line 354
    const v23, 0x4025c28f    # 2.59f

    .line 355
    .line 356
    .line 357
    const v24, -0x400f5c29    # -1.88f

    .line 358
    .line 359
    .line 360
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 361
    .line 362
    .line 363
    const v4, -0x3fdb851f    # -2.57f

    .line 364
    .line 365
    .line 366
    const v6, -0x3fa51eb8    # -3.42f

    .line 367
    .line 368
    .line 369
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 370
    .line 371
    .line 372
    const v4, 0x41986666    # 19.05f

    .line 373
    .line 374
    .line 375
    const/high16 v6, 0x40c00000    # 6.0f

    .line 376
    .line 377
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 378
    .line 379
    .line 380
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 381
    .line 382
    .line 383
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 384
    .line 385
    .line 386
    move-result-object v2

    .line 387
    const/high16 v6, 0x3f800000    # 1.0f

    .line 388
    .line 389
    const/4 v7, 0x0

    .line 390
    const-string v4, ""

    .line 391
    .line 392
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 393
    .line 394
    .line 395
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 396
    .line 397
    .line 398
    move-result v3

    .line 399
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 400
    .line 401
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 402
    .line 403
    .line 404
    move-result-wide v6

    .line 405
    const/4 v2, 0x0

    .line 406
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 407
    .line 408
    .line 409
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 410
    .line 411
    .line 412
    move-result v10

    .line 413
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 414
    .line 415
    .line 416
    move-result v11

    .line 417
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 418
    .line 419
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 420
    .line 421
    .line 422
    const/high16 v4, 0x41880000    # 17.0f

    .line 423
    .line 424
    const v6, 0x4094cccd    # 4.65f

    .line 425
    .line 426
    .line 427
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 428
    .line 429
    .line 430
    const v4, 0x4028f5c3    # 2.64f

    .line 431
    .line 432
    .line 433
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 434
    .line 435
    .line 436
    const v25, -0x4031eb85    # -1.61f

    .line 437
    .line 438
    .line 439
    const v26, -0x40051eb8    # -1.96f

    .line 440
    .line 441
    .line 442
    const/16 v21, 0x0

    .line 443
    .line 444
    const v22, -0x408ccccd    # -0.95f

    .line 445
    .line 446
    .line 447
    const v23, -0x40d47ae1    # -0.67f

    .line 448
    .line 449
    .line 450
    const v24, -0x401d70a4    # -1.77f

    .line 451
    .line 452
    .line 453
    move-object/from16 v20, v2

    .line 454
    .line 455
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 456
    .line 457
    .line 458
    const v4, -0x40fae148    # -0.52f

    .line 459
    .line 460
    .line 461
    const v6, -0x3fdae148    # -2.58f

    .line 462
    .line 463
    .line 464
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 465
    .line 466
    .line 467
    const/high16 v25, -0x40400000    # -1.5f

    .line 468
    .line 469
    const v26, 0x3e99999a    # 0.3f

    .line 470
    .line 471
    .line 472
    const v21, -0x40fae148    # -0.52f

    .line 473
    .line 474
    .line 475
    const v22, -0x42333333    # -0.1f

    .line 476
    .line 477
    .line 478
    const v23, -0x407851ec    # -1.06f

    .line 479
    .line 480
    .line 481
    const/16 v24, 0x0

    .line 482
    .line 483
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 484
    .line 485
    .line 486
    const v4, 0x411e3d71    # 9.89f

    .line 487
    .line 488
    .line 489
    const v6, 0x3fb47ae1    # 1.41f

    .line 490
    .line 491
    .line 492
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 493
    .line 494
    .line 495
    const/high16 v25, 0x41100000    # 9.0f

    .line 496
    .line 497
    const v26, 0x40447ae1    # 3.07f

    .line 498
    .line 499
    .line 500
    const v21, 0x411547ae    # 9.33f

    .line 501
    .line 502
    .line 503
    const v22, 0x3fe3d70a    # 1.78f

    .line 504
    .line 505
    .line 506
    const/high16 v23, 0x41100000    # 9.0f

    .line 507
    .line 508
    const v24, 0x4019999a    # 2.4f

    .line 509
    .line 510
    .line 511
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 512
    .line 513
    .line 514
    const v4, 0x3fee147b    # 1.86f

    .line 515
    .line 516
    .line 517
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 518
    .line 519
    .line 520
    const v25, 0x411e3d71    # 9.89f

    .line 521
    .line 522
    .line 523
    const v26, 0x40d2e148    # 6.59f

    .line 524
    .line 525
    .line 526
    const/high16 v21, 0x41100000    # 9.0f

    .line 527
    .line 528
    const v22, 0x40b33333    # 5.6f

    .line 529
    .line 530
    .line 531
    const v23, 0x411547ae    # 9.33f

    .line 532
    .line 533
    .line 534
    const v24, 0x40c70a3d    # 6.22f

    .line 535
    .line 536
    .line 537
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 538
    .line 539
    .line 540
    const v4, 0x3f9d70a4    # 1.23f

    .line 541
    .line 542
    .line 543
    const v6, 0x3f51eb85    # 0.82f

    .line 544
    .line 545
    .line 546
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 547
    .line 548
    .line 549
    const v25, 0x3feccccd    # 1.85f

    .line 550
    .line 551
    .line 552
    const v26, 0x3e428f5c    # 0.19f

    .line 553
    .line 554
    .line 555
    const v21, 0x3f0ccccd    # 0.55f

    .line 556
    .line 557
    .line 558
    const v22, 0x3ebd70a4    # 0.37f

    .line 559
    .line 560
    .line 561
    const v23, 0x3f9eb852    # 1.24f

    .line 562
    .line 563
    .line 564
    const v24, 0x3ee147ae    # 0.44f

    .line 565
    .line 566
    .line 567
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 568
    .line 569
    .line 570
    const v4, 0x403147ae    # 2.77f

    .line 571
    .line 572
    .line 573
    const v6, -0x4071eb85    # -1.11f

    .line 574
    .line 575
    .line 576
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 577
    .line 578
    .line 579
    const/high16 v25, 0x41880000    # 17.0f

    .line 580
    .line 581
    const v26, 0x4094cccd    # 4.65f

    .line 582
    .line 583
    .line 584
    const/high16 v21, 0x41840000    # 16.5f

    .line 585
    .line 586
    const v22, 0x40c66666    # 6.2f

    .line 587
    .line 588
    .line 589
    const/high16 v23, 0x41880000    # 17.0f

    .line 590
    .line 591
    const v24, 0x40aeb852    # 5.46f

    .line 592
    .line 593
    .line 594
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 595
    .line 596
    .line 597
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 598
    .line 599
    .line 600
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 601
    .line 602
    .line 603
    move-result-object v2

    .line 604
    const/high16 v6, 0x3f800000    # 1.0f

    .line 605
    .line 606
    const/4 v7, 0x0

    .line 607
    const-string v4, ""

    .line 608
    .line 609
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 610
    .line 611
    .line 612
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 613
    .line 614
    .line 615
    move-result v3

    .line 616
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 617
    .line 618
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 619
    .line 620
    .line 621
    move-result-wide v6

    .line 622
    const/4 v0, 0x0

    .line 623
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 624
    .line 625
    .line 626
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 627
    .line 628
    .line 629
    move-result v10

    .line 630
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 631
    .line 632
    .line 633
    move-result v11

    .line 634
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 635
    .line 636
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 637
    .line 638
    .line 639
    const/high16 v0, 0x418e0000    # 17.75f

    .line 640
    .line 641
    const v2, 0x40f33333    # 7.6f

    .line 642
    .line 643
    .line 644
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 645
    .line 646
    .line 647
    const/high16 v0, -0x40800000    # -1.0f

    .line 648
    .line 649
    const v2, 0x3f4ccccd    # 0.8f

    .line 650
    .line 651
    .line 652
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 653
    .line 654
    .line 655
    const/high16 v17, 0x41800000    # 16.0f

    .line 656
    .line 657
    const v18, 0x411f5c29    # 9.96f

    .line 658
    .line 659
    .line 660
    const v13, 0x41823d71    # 16.28f

    .line 661
    .line 662
    .line 663
    const v14, 0x410c7ae1    # 8.78f

    .line 664
    .line 665
    .line 666
    const/high16 v15, 0x41800000    # 16.0f

    .line 667
    .line 668
    const v16, 0x4115999a    # 9.35f

    .line 669
    .line 670
    .line 671
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 672
    .line 673
    .line 674
    const v0, 0x3f8a3d71    # 1.08f

    .line 675
    .line 676
    .line 677
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 678
    .line 679
    .line 680
    const/high16 v17, 0x3f400000    # 0.75f

    .line 681
    .line 682
    const v18, 0x3fc7ae14    # 1.56f

    .line 683
    .line 684
    .line 685
    const/4 v13, 0x0

    .line 686
    const v14, 0x3f1c28f6    # 0.61f

    .line 687
    .line 688
    .line 689
    const v15, 0x3e8f5c29    # 0.28f

    .line 690
    .line 691
    .line 692
    const v16, 0x3f970a3d    # 1.18f

    .line 693
    .line 694
    .line 695
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 696
    .line 697
    .line 698
    const v0, 0x3f23d70a    # 0.64f

    .line 699
    .line 700
    .line 701
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 702
    .line 703
    .line 704
    const v17, 0x4003d70a    # 2.06f

    .line 705
    .line 706
    .line 707
    const v18, 0x3e8a3d71    # 0.27f

    .line 708
    .line 709
    .line 710
    const v13, 0x3f147ae1    # 0.58f

    .line 711
    .line 712
    .line 713
    const v14, 0x3ef0a3d7    # 0.47f

    .line 714
    .line 715
    .line 716
    const v15, 0x3fb0a3d7    # 1.38f

    .line 717
    .line 718
    .line 719
    const v16, 0x3f11eb85    # 0.57f

    .line 720
    .line 721
    .line 722
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 723
    .line 724
    .line 725
    const v0, 0x400ccccd    # 2.2f

    .line 726
    .line 727
    .line 728
    const v2, -0x40851eb8    # -0.98f

    .line 729
    .line 730
    .line 731
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 732
    .line 733
    .line 734
    const/high16 v17, 0x41b80000    # 23.0f

    .line 735
    .line 736
    const v18, 0x412b3333    # 10.7f

    .line 737
    .line 738
    .line 739
    const v13, 0x41b43d71    # 22.53f

    .line 740
    .line 741
    .line 742
    const v14, 0x41435c29    # 12.21f

    .line 743
    .line 744
    .line 745
    const/high16 v15, 0x41b80000    # 23.0f

    .line 746
    .line 747
    const v16, 0x4137d70a    # 11.49f

    .line 748
    .line 749
    .line 750
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 751
    .line 752
    .line 753
    const v0, 0x4119999a    # 9.6f

    .line 754
    .line 755
    .line 756
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 757
    .line 758
    .line 759
    const v17, -0x40370a3d    # -1.57f

    .line 760
    .line 761
    .line 762
    const v18, -0x40066666    # -1.95f

    .line 763
    .line 764
    .line 765
    const/4 v13, 0x0

    .line 766
    const v14, -0x408f5c29    # -0.94f

    .line 767
    .line 768
    .line 769
    const v15, -0x40d9999a    # -0.65f

    .line 770
    .line 771
    .line 772
    const/high16 v16, -0x40200000    # -1.75f

    .line 773
    .line 774
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 775
    .line 776
    .line 777
    const/high16 v0, -0x40000000    # -2.0f

    .line 778
    .line 779
    const v2, -0x411eb852    # -0.44f

    .line 780
    .line 781
    .line 782
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 783
    .line 784
    .line 785
    const/high16 v17, 0x418e0000    # 17.75f

    .line 786
    .line 787
    const v18, 0x40f33333    # 7.6f

    .line 788
    .line 789
    .line 790
    const v13, 0x4196b852    # 18.84f

    .line 791
    .line 792
    .line 793
    const v14, 0x40e28f5c    # 7.08f

    .line 794
    .line 795
    .line 796
    const v15, 0x4191c28f    # 18.22f

    .line 797
    .line 798
    .line 799
    const v16, 0x40e70a3d    # 7.22f

    .line 800
    .line 801
    .line 802
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 803
    .line 804
    .line 805
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 806
    .line 807
    .line 808
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 809
    .line 810
    .line 811
    move-result-object v2

    .line 812
    const/16 v16, 0x3800

    .line 813
    .line 814
    const/16 v17, 0x0

    .line 815
    .line 816
    const/high16 v6, 0x3f800000    # 1.0f

    .line 817
    .line 818
    const/4 v7, 0x0

    .line 819
    const/high16 v12, 0x3f800000    # 1.0f

    .line 820
    .line 821
    const/4 v13, 0x0

    .line 822
    const/4 v14, 0x0

    .line 823
    const/4 v15, 0x0

    .line 824
    const-string v4, ""

    .line 825
    .line 826
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 827
    .line 828
    .line 829
    move-result-object v0

    .line 830
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 831
    .line 832
    .line 833
    move-result-object v0

    .line 834
    sput-object v0, Landroidx/compose/material/icons/rounded/LandslideKt;->_landslide:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 835
    .line 836
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 837
    .line 838
    .line 839
    return-object v0
.end method
