.class public final Landroidx/compose/material/icons/twotone/LunchDiningKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_lunchDining",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "LunchDining",
        "Landroidx/compose/material/icons/Icons$TwoTone;",
        "getLunchDining",
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
        "SMAP\nLunchDining.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LunchDining.kt\nandroidx/compose/material/icons/twotone/LunchDiningKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,100:1\n212#2,12:101\n233#2,18:114\n253#2:151\n233#2,18:152\n253#2:189\n233#2,18:190\n253#2:227\n233#2,18:228\n253#2:265\n233#2,18:266\n253#2:303\n174#3:113\n705#4,2:132\n717#4,2:134\n719#4,11:140\n705#4,2:170\n717#4,2:172\n719#4,11:178\n705#4,2:208\n717#4,2:210\n719#4,11:216\n705#4,2:246\n717#4,2:248\n719#4,11:254\n705#4,2:284\n717#4,2:286\n719#4,11:292\n72#5,4:136\n72#5,4:174\n72#5,4:212\n72#5,4:250\n72#5,4:288\n*S KotlinDebug\n*F\n+ 1 LunchDining.kt\nandroidx/compose/material/icons/twotone/LunchDiningKt\n*L\n29#1:101,12\n30#1:114,18\n30#1:151\n37#1:152,18\n37#1:189\n45#1:190,18\n45#1:227\n61#1:228,18\n61#1:265\n79#1:266,18\n79#1:303\n29#1:113\n30#1:132,2\n30#1:134,2\n30#1:140,11\n37#1:170,2\n37#1:172,2\n37#1:178,11\n45#1:208,2\n45#1:210,2\n45#1:216,11\n61#1:246,2\n61#1:248,2\n61#1:254,11\n79#1:284,2\n79#1:286,2\n79#1:292,11\n30#1:136,4\n37#1:174,4\n45#1:212,4\n61#1:250,4\n79#1:288,4\n*E\n"
    }
.end annotation


# static fields
.field private static _lunchDining:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getLunchDining(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/LunchDiningKt;->_lunchDining:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.LunchDining"

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
    const/high16 v4, 0x41900000    # 18.0f

    .line 71
    .line 72
    const/high16 v6, 0x40800000    # 4.0f

    .line 73
    .line 74
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v4, 0x41800000    # 16.0f

    .line 78
    .line 79
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 80
    .line 81
    .line 82
    const/high16 v4, 0x3f800000    # 1.0f

    .line 83
    .line 84
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 85
    .line 86
    .line 87
    const/high16 v4, -0x3e800000    # -16.0f

    .line 88
    .line 89
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 90
    .line 91
    .line 92
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 93
    .line 94
    .line 95
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 96
    .line 97
    .line 98
    move-result-object v2

    .line 99
    const/16 v16, 0x3800

    .line 100
    .line 101
    const/16 v17, 0x0

    .line 102
    .line 103
    const v6, 0x3e99999a    # 0.3f

    .line 104
    .line 105
    .line 106
    const/high16 v8, 0x3f800000    # 1.0f

    .line 107
    .line 108
    const/4 v7, 0x0

    .line 109
    const/high16 v9, 0x3f800000    # 1.0f

    .line 110
    .line 111
    const/high16 v12, 0x3f800000    # 1.0f

    .line 112
    .line 113
    const/4 v13, 0x0

    .line 114
    const/4 v14, 0x0

    .line 115
    const/4 v15, 0x0

    .line 116
    const-string v4, ""

    .line 117
    .line 118
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 119
    .line 120
    .line 121
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 122
    .line 123
    .line 124
    move-result v3

    .line 125
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 126
    .line 127
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 128
    .line 129
    .line 130
    move-result-wide v6

    .line 131
    const/4 v2, 0x0

    .line 132
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 133
    .line 134
    .line 135
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 136
    .line 137
    .line 138
    move-result v10

    .line 139
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 140
    .line 141
    .line 142
    move-result v11

    .line 143
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 144
    .line 145
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 146
    .line 147
    .line 148
    const/high16 v4, 0x41400000    # 12.0f

    .line 149
    .line 150
    const/high16 v6, 0x40a00000    # 5.0f

    .line 151
    .line 152
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 153
    .line 154
    .line 155
    const v25, 0x4085c28f    # 4.18f

    .line 156
    .line 157
    .line 158
    const/high16 v26, 0x41000000    # 8.0f

    .line 159
    .line 160
    const v21, 0x4109c28f    # 8.61f

    .line 161
    .line 162
    .line 163
    const/high16 v22, 0x40a00000    # 5.0f

    .line 164
    .line 165
    const v23, 0x40a051ec    # 5.01f

    .line 166
    .line 167
    .line 168
    const v24, 0x40b9eb85    # 5.81f

    .line 169
    .line 170
    .line 171
    move-object/from16 v20, v2

    .line 172
    .line 173
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 174
    .line 175
    .line 176
    const v4, 0x417a8f5c    # 15.66f

    .line 177
    .line 178
    .line 179
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 180
    .line 181
    .line 182
    const v25, -0x40d70a3d    # -0.66f

    .line 183
    .line 184
    .line 185
    const v26, -0x407eb852    # -1.01f

    .line 186
    .line 187
    .line 188
    const v21, -0x41fae148    # -0.13f

    .line 189
    .line 190
    .line 191
    const v22, -0x41428f5c    # -0.37f

    .line 192
    .line 193
    .line 194
    const v23, -0x414ccccd    # -0.35f

    .line 195
    .line 196
    .line 197
    const v24, -0x40cccccd    # -0.7f

    .line 198
    .line 199
    .line 200
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 201
    .line 202
    .line 203
    const/high16 v25, 0x41400000    # 12.0f

    .line 204
    .line 205
    const/high16 v26, 0x40a00000    # 5.0f

    .line 206
    .line 207
    const v21, 0x418f70a4    # 17.93f

    .line 208
    .line 209
    .line 210
    const v22, 0x40b75c29    # 5.73f

    .line 211
    .line 212
    .line 213
    const v23, 0x4174f5c3    # 15.31f

    .line 214
    .line 215
    .line 216
    const/high16 v24, 0x40a00000    # 5.0f

    .line 217
    .line 218
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 219
    .line 220
    .line 221
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 222
    .line 223
    .line 224
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 225
    .line 226
    .line 227
    move-result-object v2

    .line 228
    const v6, 0x3e99999a    # 0.3f

    .line 229
    .line 230
    .line 231
    const/4 v7, 0x0

    .line 232
    const-string v4, ""

    .line 233
    .line 234
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 235
    .line 236
    .line 237
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 238
    .line 239
    .line 240
    move-result v3

    .line 241
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 242
    .line 243
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 244
    .line 245
    .line 246
    move-result-wide v6

    .line 247
    const/4 v2, 0x0

    .line 248
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 249
    .line 250
    .line 251
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 252
    .line 253
    .line 254
    move-result v10

    .line 255
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 256
    .line 257
    .line 258
    move-result v11

    .line 259
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 260
    .line 261
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 262
    .line 263
    .line 264
    const/high16 v4, 0x41980000    # 19.0f

    .line 265
    .line 266
    const/high16 v6, 0x40000000    # 2.0f

    .line 267
    .line 268
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 269
    .line 270
    .line 271
    const/high16 v25, 0x40000000    # 2.0f

    .line 272
    .line 273
    const/high16 v26, 0x40000000    # 2.0f

    .line 274
    .line 275
    const/16 v21, 0x0

    .line 276
    .line 277
    const v22, 0x3f8ccccd    # 1.1f

    .line 278
    .line 279
    .line 280
    const v23, 0x3f666666    # 0.9f

    .line 281
    .line 282
    .line 283
    const/high16 v24, 0x40000000    # 2.0f

    .line 284
    .line 285
    move-object/from16 v20, v2

    .line 286
    .line 287
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 288
    .line 289
    .line 290
    const/high16 v4, 0x41800000    # 16.0f

    .line 291
    .line 292
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 293
    .line 294
    .line 295
    const/high16 v26, -0x40000000    # -2.0f

    .line 296
    .line 297
    const v21, 0x3f8ccccd    # 1.1f

    .line 298
    .line 299
    .line 300
    const/16 v22, 0x0

    .line 301
    .line 302
    const/high16 v23, 0x40000000    # 2.0f

    .line 303
    .line 304
    const v24, -0x4099999a    # -0.9f

    .line 305
    .line 306
    .line 307
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 308
    .line 309
    .line 310
    const/high16 v4, -0x3fc00000    # -3.0f

    .line 311
    .line 312
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 313
    .line 314
    .line 315
    const/high16 v4, 0x40000000    # 2.0f

    .line 316
    .line 317
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 318
    .line 319
    .line 320
    const/high16 v4, 0x41980000    # 19.0f

    .line 321
    .line 322
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 323
    .line 324
    .line 325
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 326
    .line 327
    .line 328
    const/high16 v4, 0x41900000    # 18.0f

    .line 329
    .line 330
    const/high16 v6, 0x40800000    # 4.0f

    .line 331
    .line 332
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 333
    .line 334
    .line 335
    const/high16 v4, 0x41800000    # 16.0f

    .line 336
    .line 337
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 338
    .line 339
    .line 340
    const/high16 v4, 0x3f800000    # 1.0f

    .line 341
    .line 342
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 343
    .line 344
    .line 345
    const/high16 v4, 0x40800000    # 4.0f

    .line 346
    .line 347
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 348
    .line 349
    .line 350
    const/high16 v4, 0x41900000    # 18.0f

    .line 351
    .line 352
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 353
    .line 354
    .line 355
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 356
    .line 357
    .line 358
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 359
    .line 360
    .line 361
    move-result-object v2

    .line 362
    const/high16 v6, 0x3f800000    # 1.0f

    .line 363
    .line 364
    const/4 v7, 0x0

    .line 365
    const-string v4, ""

    .line 366
    .line 367
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 368
    .line 369
    .line 370
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 371
    .line 372
    .line 373
    move-result v3

    .line 374
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 375
    .line 376
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 377
    .line 378
    .line 379
    move-result-wide v6

    .line 380
    const/4 v2, 0x0

    .line 381
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 382
    .line 383
    .line 384
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 385
    .line 386
    .line 387
    move-result v10

    .line 388
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 389
    .line 390
    .line 391
    move-result v11

    .line 392
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 393
    .line 394
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 395
    .line 396
    .line 397
    const v4, 0x419547ae    # 18.66f

    .line 398
    .line 399
    .line 400
    const/high16 v6, 0x41380000    # 11.5f

    .line 401
    .line 402
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 403
    .line 404
    .line 405
    const v25, -0x3faae148    # -3.33f

    .line 406
    .line 407
    .line 408
    const/high16 v26, 0x3f800000    # 1.0f

    .line 409
    .line 410
    const v21, -0x40066666    # -1.95f

    .line 411
    .line 412
    .line 413
    const v23, -0x3ffa3d71    # -2.09f

    .line 414
    .line 415
    .line 416
    const/high16 v24, 0x3f800000    # 1.0f

    .line 417
    .line 418
    move-object/from16 v20, v2

    .line 419
    .line 420
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 421
    .line 422
    .line 423
    const/high16 v26, -0x40800000    # -1.0f

    .line 424
    .line 425
    const v21, -0x4067ae14    # -1.19f

    .line 426
    .line 427
    .line 428
    const v23, -0x404a3d71    # -1.42f

    .line 429
    .line 430
    .line 431
    const/high16 v24, -0x40800000    # -1.0f

    .line 432
    .line 433
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 434
    .line 435
    .line 436
    const/high16 v26, 0x3f800000    # 1.0f

    .line 437
    .line 438
    const v21, -0x40066666    # -1.95f

    .line 439
    .line 440
    .line 441
    const v23, -0x3ffa3d71    # -2.09f

    .line 442
    .line 443
    .line 444
    const/high16 v24, 0x3f800000    # 1.0f

    .line 445
    .line 446
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 447
    .line 448
    .line 449
    const/high16 v26, -0x40800000    # -1.0f

    .line 450
    .line 451
    const v21, -0x4067ae14    # -1.19f

    .line 452
    .line 453
    .line 454
    const v23, -0x404a3d71    # -1.42f

    .line 455
    .line 456
    .line 457
    const/high16 v24, -0x40800000    # -1.0f

    .line 458
    .line 459
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 460
    .line 461
    .line 462
    const/high16 v26, 0x3f800000    # 1.0f

    .line 463
    .line 464
    const v21, -0x40066666    # -1.95f

    .line 465
    .line 466
    .line 467
    const v23, -0x3ffa3d71    # -2.09f

    .line 468
    .line 469
    .line 470
    const/high16 v24, 0x3f800000    # 1.0f

    .line 471
    .line 472
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 473
    .line 474
    .line 475
    const/high16 v4, 0x40000000    # 2.0f

    .line 476
    .line 477
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 478
    .line 479
    .line 480
    const v25, 0x40566666    # 3.35f

    .line 481
    .line 482
    .line 483
    const/high16 v26, -0x40800000    # -1.0f

    .line 484
    .line 485
    const v21, 0x3ff33333    # 1.9f

    .line 486
    .line 487
    .line 488
    const v23, 0x400ae148    # 2.17f

    .line 489
    .line 490
    .line 491
    const/high16 v24, -0x40800000    # -1.0f

    .line 492
    .line 493
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 494
    .line 495
    .line 496
    const v25, 0x40551eb8    # 3.33f

    .line 497
    .line 498
    .line 499
    const/high16 v26, 0x3f800000    # 1.0f

    .line 500
    .line 501
    const v21, 0x3f9851ec    # 1.19f

    .line 502
    .line 503
    .line 504
    const v23, 0x3fb5c28f    # 1.42f

    .line 505
    .line 506
    .line 507
    const/high16 v24, 0x3f800000    # 1.0f

    .line 508
    .line 509
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 510
    .line 511
    .line 512
    const/high16 v26, -0x40800000    # -1.0f

    .line 513
    .line 514
    const v21, 0x3ff9999a    # 1.95f

    .line 515
    .line 516
    .line 517
    const v23, 0x4005c28f    # 2.09f

    .line 518
    .line 519
    .line 520
    const/high16 v24, -0x40800000    # -1.0f

    .line 521
    .line 522
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 523
    .line 524
    .line 525
    const/high16 v26, 0x3f800000    # 1.0f

    .line 526
    .line 527
    const v21, 0x3f9851ec    # 1.19f

    .line 528
    .line 529
    .line 530
    const v23, 0x3fb5c28f    # 1.42f

    .line 531
    .line 532
    .line 533
    const/high16 v24, 0x3f800000    # 1.0f

    .line 534
    .line 535
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 536
    .line 537
    .line 538
    const/high16 v26, -0x40800000    # -1.0f

    .line 539
    .line 540
    const v21, 0x3ff9999a    # 1.95f

    .line 541
    .line 542
    .line 543
    const v23, 0x4005c28f    # 2.09f

    .line 544
    .line 545
    .line 546
    const/high16 v24, -0x40800000    # -1.0f

    .line 547
    .line 548
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 549
    .line 550
    .line 551
    const v25, 0x40547ae1    # 3.32f

    .line 552
    .line 553
    .line 554
    const/high16 v26, 0x3f800000    # 1.0f

    .line 555
    .line 556
    const v21, 0x3f9851ec    # 1.19f

    .line 557
    .line 558
    .line 559
    const v23, 0x3fb33333    # 1.4f

    .line 560
    .line 561
    .line 562
    const v24, 0x3f7ae148    # 0.98f

    .line 563
    .line 564
    .line 565
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 566
    .line 567
    .line 568
    const v4, -0x43dc28f6    # -0.01f

    .line 569
    .line 570
    .line 571
    const v6, -0x40028f5c    # -1.98f

    .line 572
    .line 573
    .line 574
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 575
    .line 576
    .line 577
    const v25, 0x419547ae    # 18.66f

    .line 578
    .line 579
    .line 580
    const/high16 v26, 0x41380000    # 11.5f

    .line 581
    .line 582
    const v21, 0x41a30a3d    # 20.38f

    .line 583
    .line 584
    .line 585
    const v22, 0x41430a3d    # 12.19f

    .line 586
    .line 587
    .line 588
    const v23, 0x41a2f5c3    # 20.37f

    .line 589
    .line 590
    .line 591
    const/high16 v24, 0x41380000    # 11.5f

    .line 592
    .line 593
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 594
    .line 595
    .line 596
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 597
    .line 598
    .line 599
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 600
    .line 601
    .line 602
    move-result-object v2

    .line 603
    const/high16 v6, 0x3f800000    # 1.0f

    .line 604
    .line 605
    const/4 v7, 0x0

    .line 606
    const-string v4, ""

    .line 607
    .line 608
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 609
    .line 610
    .line 611
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 612
    .line 613
    .line 614
    move-result v3

    .line 615
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 616
    .line 617
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 618
    .line 619
    .line 620
    move-result-wide v6

    .line 621
    const/4 v0, 0x0

    .line 622
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 623
    .line 624
    .line 625
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 626
    .line 627
    .line 628
    move-result v10

    .line 629
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 630
    .line 631
    .line 632
    move-result v11

    .line 633
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 634
    .line 635
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 636
    .line 637
    .line 638
    const/high16 v0, 0x41100000    # 9.0f

    .line 639
    .line 640
    const/high16 v2, 0x41b00000    # 22.0f

    .line 641
    .line 642
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 643
    .line 644
    .line 645
    const/high16 v17, -0x3ee00000    # -10.0f

    .line 646
    .line 647
    const/high16 v18, -0x3f400000    # -6.0f

    .line 648
    .line 649
    const v13, 0x3ca3d70a    # 0.02f

    .line 650
    .line 651
    .line 652
    const/high16 v14, -0x3f800000    # -4.0f

    .line 653
    .line 654
    const v15, -0x3f770a3d    # -4.28f

    .line 655
    .line 656
    .line 657
    const/high16 v16, -0x3f400000    # -6.0f

    .line 658
    .line 659
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 660
    .line 661
    .line 662
    const/high16 v17, 0x40000000    # 2.0f

    .line 663
    .line 664
    const/high16 v18, 0x41100000    # 9.0f

    .line 665
    .line 666
    const v13, 0x40c947ae    # 6.29f

    .line 667
    .line 668
    .line 669
    const/high16 v14, 0x40400000    # 3.0f

    .line 670
    .line 671
    const/high16 v15, 0x40000000    # 2.0f

    .line 672
    .line 673
    const/high16 v16, 0x40a00000    # 5.0f

    .line 674
    .line 675
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 676
    .line 677
    .line 678
    const/high16 v0, 0x3f800000    # 1.0f

    .line 679
    .line 680
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 681
    .line 682
    .line 683
    const/high16 v0, 0x41a00000    # 20.0f

    .line 684
    .line 685
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 686
    .line 687
    .line 688
    const/high16 v0, 0x41100000    # 9.0f

    .line 689
    .line 690
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 691
    .line 692
    .line 693
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 694
    .line 695
    .line 696
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 697
    .line 698
    .line 699
    const/high16 v0, 0x41000000    # 8.0f

    .line 700
    .line 701
    const v2, 0x4085c28f    # 4.18f

    .line 702
    .line 703
    .line 704
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 705
    .line 706
    .line 707
    const/high16 v17, 0x41400000    # 12.0f

    .line 708
    .line 709
    const/high16 v18, 0x40a00000    # 5.0f

    .line 710
    .line 711
    const v13, 0x40a051ec    # 5.01f

    .line 712
    .line 713
    .line 714
    const v14, 0x40b9eb85    # 5.81f

    .line 715
    .line 716
    .line 717
    const v15, 0x4109c28f    # 8.61f

    .line 718
    .line 719
    .line 720
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 721
    .line 722
    .line 723
    const v17, 0x40e6147b    # 7.19f

    .line 724
    .line 725
    .line 726
    const v18, 0x3ffeb852    # 1.99f

    .line 727
    .line 728
    .line 729
    const v13, 0x4053d70a    # 3.31f

    .line 730
    .line 731
    .line 732
    const/4 v14, 0x0

    .line 733
    const v15, 0x40bdc28f    # 5.93f

    .line 734
    .line 735
    .line 736
    const v16, 0x3f3ae148    # 0.73f

    .line 737
    .line 738
    .line 739
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 740
    .line 741
    .line 742
    const v17, 0x419eb852    # 19.84f

    .line 743
    .line 744
    .line 745
    const/high16 v18, 0x41000000    # 8.0f

    .line 746
    .line 747
    const v13, 0x419beb85    # 19.49f

    .line 748
    .line 749
    .line 750
    const v14, 0x40e9999a    # 7.3f

    .line 751
    .line 752
    .line 753
    const v15, 0x419dae14    # 19.71f

    .line 754
    .line 755
    .line 756
    const v16, 0x40f428f6    # 7.63f

    .line 757
    .line 758
    .line 759
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 760
    .line 761
    .line 762
    const v0, 0x4085c28f    # 4.18f

    .line 763
    .line 764
    .line 765
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 766
    .line 767
    .line 768
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 769
    .line 770
    .line 771
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 772
    .line 773
    .line 774
    move-result-object v2

    .line 775
    const/16 v16, 0x3800

    .line 776
    .line 777
    const/16 v17, 0x0

    .line 778
    .line 779
    const/high16 v6, 0x3f800000    # 1.0f

    .line 780
    .line 781
    const/4 v7, 0x0

    .line 782
    const/high16 v12, 0x3f800000    # 1.0f

    .line 783
    .line 784
    const/4 v13, 0x0

    .line 785
    const/4 v14, 0x0

    .line 786
    const/4 v15, 0x0

    .line 787
    const-string v4, ""

    .line 788
    .line 789
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 790
    .line 791
    .line 792
    move-result-object v0

    .line 793
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 794
    .line 795
    .line 796
    move-result-object v0

    .line 797
    sput-object v0, Landroidx/compose/material/icons/twotone/LunchDiningKt;->_lunchDining:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 798
    .line 799
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 800
    .line 801
    .line 802
    return-object v0
.end method
