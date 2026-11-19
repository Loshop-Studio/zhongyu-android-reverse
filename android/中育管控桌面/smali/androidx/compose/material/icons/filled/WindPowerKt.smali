.class public final Landroidx/compose/material/icons/filled/WindPowerKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_windPower",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "WindPower",
        "Landroidx/compose/material/icons/Icons$Filled;",
        "getWindPower",
        "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;",
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
        "SMAP\nWindPower.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindPower.kt\nandroidx/compose/material/icons/filled/WindPowerKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,106:1\n212#2,12:107\n233#2,18:120\n253#2:157\n233#2,18:158\n253#2:195\n233#2,18:196\n253#2:233\n233#2,18:234\n253#2:271\n233#2,18:272\n253#2:309\n233#2,18:310\n253#2:347\n233#2,18:348\n253#2:385\n174#3:119\n705#4,2:138\n717#4,2:140\n719#4,11:146\n705#4,2:176\n717#4,2:178\n719#4,11:184\n705#4,2:214\n717#4,2:216\n719#4,11:222\n705#4,2:252\n717#4,2:254\n719#4,11:260\n705#4,2:290\n717#4,2:292\n719#4,11:298\n705#4,2:328\n717#4,2:330\n719#4,11:336\n705#4,2:366\n717#4,2:368\n719#4,11:374\n72#5,4:142\n72#5,4:180\n72#5,4:218\n72#5,4:256\n72#5,4:294\n72#5,4:332\n72#5,4:370\n*S KotlinDebug\n*F\n+ 1 WindPower.kt\nandroidx/compose/material/icons/filled/WindPowerKt\n*L\n29#1:107,12\n30#1:120,18\n30#1:157\n37#1:158,18\n37#1:195\n44#1:196,18\n44#1:233\n51#1:234,18\n51#1:271\n63#1:272,18\n63#1:309\n75#1:310,18\n75#1:347\n93#1:348,18\n93#1:385\n29#1:119\n30#1:138,2\n30#1:140,2\n30#1:146,11\n37#1:176,2\n37#1:178,2\n37#1:184,11\n44#1:214,2\n44#1:216,2\n44#1:222,11\n51#1:252,2\n51#1:254,2\n51#1:260,11\n63#1:290,2\n63#1:292,2\n63#1:298,11\n75#1:328,2\n75#1:330,2\n75#1:336,11\n93#1:366,2\n93#1:368,2\n93#1:374,11\n30#1:142,4\n37#1:180,4\n44#1:218,4\n51#1:256,4\n63#1:294,4\n75#1:332,4\n93#1:370,4\n*E\n"
    }
.end annotation


# static fields
.field private static _windPower:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getWindPower(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/filled/WindPowerKt;->_windPower:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Filled.WindPower"

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
    const/high16 v4, 0x40800000    # 4.0f

    .line 71
    .line 72
    const/high16 v6, 0x40400000    # 3.0f

    .line 73
    .line 74
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v4, 0x40c00000    # 6.0f

    .line 78
    .line 79
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 80
    .line 81
    .line 82
    const/high16 v4, 0x40000000    # 2.0f

    .line 83
    .line 84
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 85
    .line 86
    .line 87
    const/high16 v4, -0x3f400000    # -6.0f

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
    const/high16 v6, 0x3f800000    # 1.0f

    .line 104
    .line 105
    const/high16 v8, 0x3f800000    # 1.0f

    .line 106
    .line 107
    const/4 v7, 0x0

    .line 108
    const/high16 v9, 0x3f800000    # 1.0f

    .line 109
    .line 110
    const/high16 v12, 0x3f800000    # 1.0f

    .line 111
    .line 112
    const/4 v13, 0x0

    .line 113
    const/4 v14, 0x0

    .line 114
    const/4 v15, 0x0

    .line 115
    const-string v4, ""

    .line 116
    .line 117
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 118
    .line 119
    .line 120
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 121
    .line 122
    .line 123
    move-result v3

    .line 124
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 125
    .line 126
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 127
    .line 128
    .line 129
    move-result-wide v6

    .line 130
    const/4 v2, 0x0

    .line 131
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 132
    .line 133
    .line 134
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 135
    .line 136
    .line 137
    move-result v10

    .line 138
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 139
    .line 140
    .line 141
    move-result v11

    .line 142
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 143
    .line 144
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 145
    .line 146
    .line 147
    const/high16 v4, 0x3f800000    # 1.0f

    .line 148
    .line 149
    const/high16 v6, 0x40e00000    # 7.0f

    .line 150
    .line 151
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 152
    .line 153
    .line 154
    const/high16 v4, 0x40a00000    # 5.0f

    .line 155
    .line 156
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 157
    .line 158
    .line 159
    const/high16 v4, 0x40000000    # 2.0f

    .line 160
    .line 161
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 162
    .line 163
    .line 164
    const/high16 v4, -0x3f600000    # -5.0f

    .line 165
    .line 166
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 167
    .line 168
    .line 169
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 170
    .line 171
    .line 172
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 173
    .line 174
    .line 175
    move-result-object v2

    .line 176
    const/high16 v6, 0x3f800000    # 1.0f

    .line 177
    .line 178
    const/4 v7, 0x0

    .line 179
    const-string v4, ""

    .line 180
    .line 181
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 182
    .line 183
    .line 184
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 185
    .line 186
    .line 187
    move-result v3

    .line 188
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 189
    .line 190
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 191
    .line 192
    .line 193
    move-result-wide v6

    .line 194
    const/4 v2, 0x0

    .line 195
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 196
    .line 197
    .line 198
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 199
    .line 200
    .line 201
    move-result v10

    .line 202
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 203
    .line 204
    .line 205
    move-result v11

    .line 206
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 207
    .line 208
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 209
    .line 210
    .line 211
    const/high16 v4, 0x41980000    # 19.0f

    .line 212
    .line 213
    const/high16 v6, 0x40400000    # 3.0f

    .line 214
    .line 215
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 216
    .line 217
    .line 218
    const/high16 v4, 0x40a00000    # 5.0f

    .line 219
    .line 220
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 221
    .line 222
    .line 223
    const/high16 v4, 0x40000000    # 2.0f

    .line 224
    .line 225
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 226
    .line 227
    .line 228
    const/high16 v4, -0x3f600000    # -5.0f

    .line 229
    .line 230
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 231
    .line 232
    .line 233
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 234
    .line 235
    .line 236
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 237
    .line 238
    .line 239
    move-result-object v2

    .line 240
    const/high16 v6, 0x3f800000    # 1.0f

    .line 241
    .line 242
    const/4 v7, 0x0

    .line 243
    const-string v4, ""

    .line 244
    .line 245
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 246
    .line 247
    .line 248
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 249
    .line 250
    .line 251
    move-result v3

    .line 252
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 253
    .line 254
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 255
    .line 256
    .line 257
    move-result-wide v6

    .line 258
    const/4 v2, 0x0

    .line 259
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 260
    .line 261
    .line 262
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 263
    .line 264
    .line 265
    move-result v10

    .line 266
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 267
    .line 268
    .line 269
    move-result v11

    .line 270
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 271
    .line 272
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 273
    .line 274
    .line 275
    const v4, 0x415bae14    # 13.73f

    .line 276
    .line 277
    .line 278
    const v6, 0x4129c28f    # 10.61f

    .line 279
    .line 280
    .line 281
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 282
    .line 283
    .line 284
    const v25, 0x3fc8f5c3    # 1.57f

    .line 285
    .line 286
    .line 287
    const v26, 0x3fbae148    # 1.46f

    .line 288
    .line 289
    .line 290
    const/high16 v21, 0x3f400000    # 0.75f

    .line 291
    .line 292
    const v22, 0x3e6b851f    # 0.23f

    .line 293
    .line 294
    .line 295
    const v23, 0x3fa66666    # 1.3f

    .line 296
    .line 297
    .line 298
    const v24, 0x3f47ae14    # 0.78f

    .line 299
    .line 300
    .line 301
    move-object/from16 v20, v2

    .line 302
    .line 303
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 304
    .line 305
    .line 306
    const v4, 0x4088a3d7    # 4.27f

    .line 307
    .line 308
    .line 309
    const v6, -0x3f1c7ae1    # -7.11f

    .line 310
    .line 311
    .line 312
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 313
    .line 314
    .line 315
    const v25, -0x40b851ec    # -0.78f

    .line 316
    .line 317
    .line 318
    const v26, -0x3fb7ae14    # -3.13f

    .line 319
    .line 320
    .line 321
    const v21, 0x3f266666    # 0.65f

    .line 322
    .line 323
    .line 324
    const v22, -0x4075c28f    # -1.08f

    .line 325
    .line 326
    .line 327
    const v23, 0x3e99999a    # 0.3f

    .line 328
    .line 329
    .line 330
    const v24, -0x3fe147ae    # -2.48f

    .line 331
    .line 332
    .line 333
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 334
    .line 335
    .line 336
    const v25, -0x3fd147ae    # -2.73f

    .line 337
    .line 338
    .line 339
    const v26, 0x3e947ae1    # 0.29f

    .line 340
    .line 341
    .line 342
    const v21, -0x40a147ae    # -0.87f

    .line 343
    .line 344
    .line 345
    const v22, -0x40fae148    # -0.52f

    .line 346
    .line 347
    .line 348
    const v23, -0x400147ae    # -1.99f

    .line 349
    .line 350
    .line 351
    const v24, -0x412e147b    # -0.41f

    .line 352
    .line 353
    .line 354
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 355
    .line 356
    .line 357
    const v4, -0x3fa47ae1    # -3.43f

    .line 358
    .line 359
    .line 360
    const v6, 0x404d70a4    # 3.21f

    .line 361
    .line 362
    .line 363
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 364
    .line 365
    .line 366
    const/high16 v25, 0x41400000    # 12.0f

    .line 367
    .line 368
    const v26, 0x40d8f5c3    # 6.78f

    .line 369
    .line 370
    .line 371
    const v21, 0x4143ae14    # 12.23f

    .line 372
    .line 373
    .line 374
    const v22, 0x40b66666    # 5.7f

    .line 375
    .line 376
    .line 377
    const/high16 v23, 0x41400000    # 12.0f

    .line 378
    .line 379
    const v24, 0x40c75c29    # 6.23f

    .line 380
    .line 381
    .line 382
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 383
    .line 384
    .line 385
    const v4, 0x407b851f    # 3.93f

    .line 386
    .line 387
    .line 388
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 389
    .line 390
    .line 391
    const v25, 0x415bae14    # 13.73f

    .line 392
    .line 393
    .line 394
    const v26, 0x4129c28f    # 10.61f

    .line 395
    .line 396
    .line 397
    const v21, 0x4145c28f    # 12.36f

    .line 398
    .line 399
    .line 400
    const v22, 0x4128f5c3    # 10.56f

    .line 401
    .line 402
    .line 403
    const v23, 0x414fae14    # 12.98f

    .line 404
    .line 405
    .line 406
    const v24, 0x4126147b    # 10.38f

    .line 407
    .line 408
    .line 409
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 410
    .line 411
    .line 412
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 413
    .line 414
    .line 415
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 416
    .line 417
    .line 418
    move-result-object v2

    .line 419
    const/high16 v6, 0x3f800000    # 1.0f

    .line 420
    .line 421
    const/4 v7, 0x0

    .line 422
    const-string v4, ""

    .line 423
    .line 424
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 425
    .line 426
    .line 427
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 428
    .line 429
    .line 430
    move-result v3

    .line 431
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 432
    .line 433
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 434
    .line 435
    .line 436
    move-result-wide v6

    .line 437
    const/4 v2, 0x0

    .line 438
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 439
    .line 440
    .line 441
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 442
    .line 443
    .line 444
    move-result v10

    .line 445
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 446
    .line 447
    .line 448
    move-result v11

    .line 449
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 450
    .line 451
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 452
    .line 453
    .line 454
    const v4, 0x414451ec    # 12.27f

    .line 455
    .line 456
    .line 457
    const v6, 0x4129c28f    # 10.61f

    .line 458
    .line 459
    .line 460
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 461
    .line 462
    .line 463
    const v25, 0x3f63d70a    # 0.89f

    .line 464
    .line 465
    .line 466
    const v26, -0x405d70a4    # -1.27f

    .line 467
    .line 468
    .line 469
    const v21, 0x3e23d70a    # 0.16f

    .line 470
    .line 471
    .line 472
    const v22, -0x40fae148    # -0.52f

    .line 473
    .line 474
    .line 475
    const v23, 0x3ef5c28f    # 0.48f

    .line 476
    .line 477
    .line 478
    const v24, -0x408a3d71    # -0.96f

    .line 479
    .line 480
    .line 481
    move-object/from16 v20, v2

    .line 482
    .line 483
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 484
    .line 485
    .line 486
    const v4, 0x4051eb85    # 3.28f

    .line 487
    .line 488
    .line 489
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 490
    .line 491
    .line 492
    const/high16 v25, 0x3f800000    # 1.0f

    .line 493
    .line 494
    const v26, 0x41547ae1    # 13.28f

    .line 495
    .line 496
    .line 497
    const v21, 0x400147ae    # 2.02f

    .line 498
    .line 499
    .line 500
    const/high16 v22, 0x41300000    # 11.0f

    .line 501
    .line 502
    const/high16 v23, 0x3f800000    # 1.0f

    .line 503
    .line 504
    const v24, 0x414051ec    # 12.02f

    .line 505
    .line 506
    .line 507
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 508
    .line 509
    .line 510
    const v25, 0x3fd33333    # 1.65f

    .line 511
    .line 512
    .line 513
    const v26, 0x400c28f6    # 2.19f

    .line 514
    .line 515
    .line 516
    const/16 v21, 0x0

    .line 517
    .line 518
    const v22, 0x3f828f5c    # 1.02f

    .line 519
    .line 520
    .line 521
    const v23, 0x3f2b851f    # 0.67f

    .line 522
    .line 523
    .line 524
    const v24, 0x3ff47ae1    # 1.91f

    .line 525
    .line 526
    .line 527
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 528
    .line 529
    .line 530
    const v4, 0x409051ec    # 4.51f

    .line 531
    .line 532
    .line 533
    const v6, 0x3fa51eb8    # 1.29f

    .line 534
    .line 535
    .line 536
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 537
    .line 538
    .line 539
    const v25, 0x3fca3d71    # 1.58f

    .line 540
    .line 541
    .line 542
    const v26, -0x41a8f5c3    # -0.21f

    .line 543
    .line 544
    .line 545
    const v21, 0x3f07ae14    # 0.53f

    .line 546
    .line 547
    .line 548
    const v22, 0x3e19999a    # 0.15f

    .line 549
    .line 550
    .line 551
    const v23, 0x3f8ccccd    # 1.1f

    .line 552
    .line 553
    .line 554
    const v24, 0x3da3d70a    # 0.08f

    .line 555
    .line 556
    .line 557
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 558
    .line 559
    .line 560
    const v4, 0x402c28f6    # 2.69f

    .line 561
    .line 562
    .line 563
    const v6, -0x4031eb85    # -1.61f

    .line 564
    .line 565
    .line 566
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 567
    .line 568
    .line 569
    const v25, 0x4129c28f    # 10.61f

    .line 570
    .line 571
    .line 572
    const v26, 0x414451ec    # 12.27f

    .line 573
    .line 574
    .line 575
    const v21, 0x412a8f5c    # 10.66f

    .line 576
    .line 577
    .line 578
    const v22, 0x41651eb8    # 14.32f

    .line 579
    .line 580
    .line 581
    const v23, 0x4124cccd    # 10.3f

    .line 582
    .line 583
    .line 584
    const v24, 0x415451ec    # 13.27f

    .line 585
    .line 586
    .line 587
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 588
    .line 589
    .line 590
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 591
    .line 592
    .line 593
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 594
    .line 595
    .line 596
    move-result-object v2

    .line 597
    const/high16 v6, 0x3f800000    # 1.0f

    .line 598
    .line 599
    const/4 v7, 0x0

    .line 600
    const-string v4, ""

    .line 601
    .line 602
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 603
    .line 604
    .line 605
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 606
    .line 607
    .line 608
    move-result v3

    .line 609
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 610
    .line 611
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 612
    .line 613
    .line 614
    move-result-wide v6

    .line 615
    const/4 v2, 0x0

    .line 616
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 617
    .line 618
    .line 619
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 620
    .line 621
    .line 622
    move-result v10

    .line 623
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 624
    .line 625
    .line 626
    move-result v11

    .line 627
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 628
    .line 629
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 630
    .line 631
    .line 632
    const v4, 0x41b1ae14    # 22.21f

    .line 633
    .line 634
    .line 635
    const v6, 0x4194e148    # 18.61f

    .line 636
    .line 637
    .line 638
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 639
    .line 640
    .line 641
    const v4, -0x3fee147b    # -2.28f

    .line 642
    .line 643
    .line 644
    const v6, -0x3f7ccccd    # -4.1f

    .line 645
    .line 646
    .line 647
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 648
    .line 649
    .line 650
    const v25, -0x405eb852    # -1.26f

    .line 651
    .line 652
    .line 653
    const v26, -0x4087ae14    # -0.97f

    .line 654
    .line 655
    .line 656
    const v21, -0x4175c28f    # -0.27f

    .line 657
    .line 658
    .line 659
    const v22, -0x410a3d71    # -0.48f

    .line 660
    .line 661
    .line 662
    const v23, -0x40c51eb8    # -0.73f

    .line 663
    .line 664
    .line 665
    const v24, -0x40ab851f    # -0.83f

    .line 666
    .line 667
    .line 668
    move-object/from16 v20, v2

    .line 669
    .line 670
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 671
    .line 672
    .line 673
    const v4, -0x3fb47ae1    # -3.18f

    .line 674
    .line 675
    .line 676
    const v6, -0x40b33333    # -0.8f

    .line 677
    .line 678
    .line 679
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 680
    .line 681
    .line 682
    const v25, -0x42333333    # -0.1f

    .line 683
    .line 684
    .line 685
    const v26, 0x3f7d70a4    # 0.99f

    .line 686
    .line 687
    .line 688
    const v21, 0x3cf5c28f    # 0.03f

    .line 689
    .line 690
    .line 691
    const v22, 0x3ea3d70a    # 0.32f

    .line 692
    .line 693
    .line 694
    const/16 v23, 0x0

    .line 695
    .line 696
    const v24, 0x3f28f5c3    # 0.66f

    .line 697
    .line 698
    .line 699
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 700
    .line 701
    .line 702
    const v25, -0x3fe70a3d    # -2.39f

    .line 703
    .line 704
    .line 705
    const v26, 0x3fe28f5c    # 1.77f

    .line 706
    .line 707
    .line 708
    const v21, -0x415c28f6    # -0.32f

    .line 709
    .line 710
    .line 711
    const v22, 0x3f87ae14    # 1.06f

    .line 712
    .line 713
    .line 714
    const v23, -0x405c28f6    # -1.28f

    .line 715
    .line 716
    .line 717
    const v24, 0x3fe28f5c    # 1.77f

    .line 718
    .line 719
    .line 720
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 721
    .line 722
    .line 723
    const/high16 v25, -0x40800000    # -1.0f

    .line 724
    .line 725
    const v26, -0x419eb852    # -0.22f

    .line 726
    .line 727
    .line 728
    const v21, -0x40e3d70a    # -0.61f

    .line 729
    .line 730
    .line 731
    const/16 v22, 0x0

    .line 732
    .line 733
    const v23, -0x40828f5c    # -0.99f

    .line 734
    .line 735
    .line 736
    const v24, -0x419eb852    # -0.22f

    .line 737
    .line 738
    .line 739
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 740
    .line 741
    .line 742
    const/high16 v4, 0x41a80000    # 21.0f

    .line 743
    .line 744
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 745
    .line 746
    .line 747
    const/high16 v25, -0x40000000    # -2.0f

    .line 748
    .line 749
    const/high16 v26, 0x40000000    # 2.0f

    .line 750
    .line 751
    const v21, -0x40733333    # -1.1f

    .line 752
    .line 753
    .line 754
    const/high16 v23, -0x40000000    # -2.0f

    .line 755
    .line 756
    const v24, 0x3f666666    # 0.9f

    .line 757
    .line 758
    .line 759
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 760
    .line 761
    .line 762
    const/high16 v4, 0x40c00000    # 6.0f

    .line 763
    .line 764
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 765
    .line 766
    .line 767
    const/high16 v26, -0x40000000    # -2.0f

    .line 768
    .line 769
    const/16 v21, 0x0

    .line 770
    .line 771
    const v22, -0x40733333    # -1.1f

    .line 772
    .line 773
    .line 774
    const v23, -0x4099999a    # -0.9f

    .line 775
    .line 776
    .line 777
    const/high16 v24, -0x40000000    # -2.0f

    .line 778
    .line 779
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 780
    .line 781
    .line 782
    const v4, -0x3f770a3d    # -4.28f

    .line 783
    .line 784
    .line 785
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 786
    .line 787
    .line 788
    const v4, 0x4093851f    # 4.61f

    .line 789
    .line 790
    .line 791
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 792
    .line 793
    .line 794
    const v25, 0x404e147b    # 3.22f

    .line 795
    .line 796
    .line 797
    const/16 v26, 0x0

    .line 798
    .line 799
    const v21, 0x3f63d70a    # 0.89f

    .line 800
    .line 801
    .line 802
    const v22, 0x3f63d70a    # 0.89f

    .line 803
    .line 804
    .line 805
    const v23, 0x40151eb8    # 2.33f

    .line 806
    .line 807
    .line 808
    const v24, 0x3f63d70a    # 0.89f

    .line 809
    .line 810
    .line 811
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 812
    .line 813
    .line 814
    const v25, 0x41b1ae14    # 22.21f

    .line 815
    .line 816
    .line 817
    const v26, 0x4194e148    # 18.61f

    .line 818
    .line 819
    .line 820
    const v21, 0x41b46666    # 22.55f

    .line 821
    .line 822
    .line 823
    const v22, 0x41a4e148    # 20.61f

    .line 824
    .line 825
    .line 826
    const v23, 0x41b5ae14    # 22.71f

    .line 827
    .line 828
    .line 829
    const/high16 v24, 0x419c0000    # 19.5f

    .line 830
    .line 831
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 832
    .line 833
    .line 834
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 835
    .line 836
    .line 837
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 838
    .line 839
    .line 840
    move-result-object v2

    .line 841
    const/high16 v6, 0x3f800000    # 1.0f

    .line 842
    .line 843
    const/4 v7, 0x0

    .line 844
    const-string v4, ""

    .line 845
    .line 846
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 847
    .line 848
    .line 849
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 850
    .line 851
    .line 852
    move-result v3

    .line 853
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 854
    .line 855
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 856
    .line 857
    .line 858
    move-result-wide v6

    .line 859
    const/4 v0, 0x0

    .line 860
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 861
    .line 862
    .line 863
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 864
    .line 865
    .line 866
    move-result v10

    .line 867
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 868
    .line 869
    .line 870
    move-result v11

    .line 871
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 872
    .line 873
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 874
    .line 875
    .line 876
    const v0, 0x4148f5c3    # 12.56f

    .line 877
    .line 878
    .line 879
    const v2, 0x4166e148    # 14.43f

    .line 880
    .line 881
    .line 882
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 883
    .line 884
    .line 885
    const v17, 0x3fef5c29    # 1.87f

    .line 886
    .line 887
    .line 888
    const/high16 v18, -0x40800000    # -1.0f

    .line 889
    .line 890
    const v13, 0x3f4a3d71    # 0.79f

    .line 891
    .line 892
    .line 893
    const v14, 0x3e75c28f    # 0.24f

    .line 894
    .line 895
    .line 896
    const v15, 0x3fd0a3d7    # 1.63f

    .line 897
    .line 898
    .line 899
    const v16, -0x41b33333    # -0.2f

    .line 900
    .line 901
    .line 902
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 903
    .line 904
    .line 905
    const/high16 v17, -0x40800000    # -1.0f

    .line 906
    .line 907
    const v18, -0x4010a3d7    # -1.87f

    .line 908
    .line 909
    .line 910
    const v13, 0x3e75c28f    # 0.24f

    .line 911
    .line 912
    .line 913
    const v14, -0x40b5c28f    # -0.79f

    .line 914
    .line 915
    .line 916
    const v15, -0x41b33333    # -0.2f

    .line 917
    .line 918
    .line 919
    const v16, -0x402f5c29    # -1.63f

    .line 920
    .line 921
    .line 922
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 923
    .line 924
    .line 925
    const v17, -0x4010a3d7    # -1.87f

    .line 926
    .line 927
    .line 928
    const/high16 v18, 0x3f800000    # 1.0f

    .line 929
    .line 930
    const v13, -0x40b5c28f    # -0.79f

    .line 931
    .line 932
    .line 933
    const v14, -0x418a3d71    # -0.24f

    .line 934
    .line 935
    .line 936
    const v15, -0x402f5c29    # -1.63f

    .line 937
    .line 938
    .line 939
    const v16, 0x3e4ccccd    # 0.2f

    .line 940
    .line 941
    .line 942
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 943
    .line 944
    .line 945
    const v17, 0x4148f5c3    # 12.56f

    .line 946
    .line 947
    .line 948
    const v18, 0x4166e148    # 14.43f

    .line 949
    .line 950
    .line 951
    const v13, 0x41351eb8    # 11.32f

    .line 952
    .line 953
    .line 954
    const v14, 0x4155999a    # 13.35f

    .line 955
    .line 956
    .line 957
    const v15, 0x413c51ec    # 11.77f

    .line 958
    .line 959
    .line 960
    const v16, 0x41630a3d    # 14.19f

    .line 961
    .line 962
    .line 963
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 964
    .line 965
    .line 966
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 967
    .line 968
    .line 969
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 970
    .line 971
    .line 972
    move-result-object v2

    .line 973
    const/16 v16, 0x3800

    .line 974
    .line 975
    const/16 v17, 0x0

    .line 976
    .line 977
    const/high16 v6, 0x3f800000    # 1.0f

    .line 978
    .line 979
    const/4 v7, 0x0

    .line 980
    const/high16 v12, 0x3f800000    # 1.0f

    .line 981
    .line 982
    const/4 v13, 0x0

    .line 983
    const/4 v14, 0x0

    .line 984
    const/4 v15, 0x0

    .line 985
    const-string v4, ""

    .line 986
    .line 987
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 988
    .line 989
    .line 990
    move-result-object v0

    .line 991
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 992
    .line 993
    .line 994
    move-result-object v0

    .line 995
    sput-object v0, Landroidx/compose/material/icons/filled/WindPowerKt;->_windPower:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 996
    .line 997
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 998
    .line 999
    .line 1000
    return-object v0
.end method
