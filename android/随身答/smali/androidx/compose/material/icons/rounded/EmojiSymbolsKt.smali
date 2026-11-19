.class public final Landroidx/compose/material/icons/rounded/EmojiSymbolsKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_emojiSymbols",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "EmojiSymbols",
        "Landroidx/compose/material/icons/Icons$Rounded;",
        "getEmojiSymbols",
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
        "SMAP\nEmojiSymbols.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EmojiSymbols.kt\nandroidx/compose/material/icons/rounded/EmojiSymbolsKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,141:1\n212#2,12:142\n233#2,18:155\n253#2:192\n233#2,18:193\n253#2:230\n233#2,18:231\n253#2:268\n233#2,18:269\n253#2:306\n233#2,18:307\n253#2:344\n233#2,18:345\n253#2:382\n233#2,18:383\n253#2:420\n174#3:154\n705#4,2:173\n717#4,2:175\n719#4,11:181\n705#4,2:211\n717#4,2:213\n719#4,11:219\n705#4,2:249\n717#4,2:251\n719#4,11:257\n705#4,2:287\n717#4,2:289\n719#4,11:295\n705#4,2:325\n717#4,2:327\n719#4,11:333\n705#4,2:363\n717#4,2:365\n719#4,11:371\n705#4,2:401\n717#4,2:403\n719#4,11:409\n72#5,4:177\n72#5,4:215\n72#5,4:253\n72#5,4:291\n72#5,4:329\n72#5,4:367\n72#5,4:405\n*S KotlinDebug\n*F\n+ 1 EmojiSymbols.kt\nandroidx/compose/material/icons/rounded/EmojiSymbolsKt\n*L\n29#1:142,12\n30#1:155,18\n30#1:192\n45#1:193,18\n45#1:230\n55#1:231,18\n55#1:268\n65#1:269,18\n65#1:306\n71#1:307,18\n71#1:344\n77#1:345,18\n77#1:382\n92#1:383,18\n92#1:420\n29#1:154\n30#1:173,2\n30#1:175,2\n30#1:181,11\n45#1:211,2\n45#1:213,2\n45#1:219,11\n55#1:249,2\n55#1:251,2\n55#1:257,11\n65#1:287,2\n65#1:289,2\n65#1:295,11\n71#1:325,2\n71#1:327,2\n71#1:333,11\n77#1:363,2\n77#1:365,2\n77#1:371,11\n92#1:401,2\n92#1:403,2\n92#1:409,11\n30#1:177,4\n45#1:215,4\n55#1:253,4\n65#1:291,4\n71#1:329,4\n77#1:367,4\n92#1:405,4\n*E\n"
    }
.end annotation


# static fields
.field private static _emojiSymbols:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getEmojiSymbols(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 28

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/EmojiSymbolsKt;->_emojiSymbols:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.EmojiSymbols"

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
    const/high16 v4, 0x40800000    # 4.0f

    .line 78
    .line 79
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 80
    .line 81
    .line 82
    const/high16 v25, 0x40400000    # 3.0f

    .line 83
    .line 84
    const/high16 v26, 0x40c00000    # 6.0f

    .line 85
    .line 86
    const v21, 0x405ccccd    # 3.45f

    .line 87
    .line 88
    .line 89
    const/high16 v22, 0x40a00000    # 5.0f

    .line 90
    .line 91
    const/high16 v23, 0x40400000    # 3.0f

    .line 92
    .line 93
    const v24, 0x40ae6666    # 5.45f

    .line 94
    .line 95
    .line 96
    move-object/from16 v20, v2

    .line 97
    .line 98
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 99
    .line 100
    .line 101
    const/high16 v25, 0x3f800000    # 1.0f

    .line 102
    .line 103
    const/high16 v26, 0x3f800000    # 1.0f

    .line 104
    .line 105
    const/16 v21, 0x0

    .line 106
    .line 107
    const v22, 0x3f0ccccd    # 0.55f

    .line 108
    .line 109
    .line 110
    const v23, 0x3ee66666    # 0.45f

    .line 111
    .line 112
    .line 113
    const/high16 v24, 0x3f800000    # 1.0f

    .line 114
    .line 115
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 116
    .line 117
    .line 118
    const/high16 v4, 0x40000000    # 2.0f

    .line 119
    .line 120
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 121
    .line 122
    .line 123
    const/high16 v4, 0x40400000    # 3.0f

    .line 124
    .line 125
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 126
    .line 127
    .line 128
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 129
    .line 130
    .line 131
    const v4, -0x4119999a    # -0.45f

    .line 132
    .line 133
    .line 134
    const/high16 v6, -0x40800000    # -1.0f

    .line 135
    .line 136
    const/high16 v7, 0x3f800000    # 1.0f

    .line 137
    .line 138
    invoke-virtual {v2, v7, v4, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 139
    .line 140
    .line 141
    const/high16 v4, 0x40e00000    # 7.0f

    .line 142
    .line 143
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 144
    .line 145
    .line 146
    const/high16 v4, 0x40000000    # 2.0f

    .line 147
    .line 148
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 149
    .line 150
    .line 151
    const/high16 v26, -0x40800000    # -1.0f

    .line 152
    .line 153
    const v21, 0x3f0ccccd    # 0.55f

    .line 154
    .line 155
    .line 156
    const/16 v22, 0x0

    .line 157
    .line 158
    const/high16 v23, 0x3f800000    # 1.0f

    .line 159
    .line 160
    const v24, -0x4119999a    # -0.45f

    .line 161
    .line 162
    .line 163
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 164
    .line 165
    .line 166
    const/high16 v25, 0x41200000    # 10.0f

    .line 167
    .line 168
    const/high16 v26, 0x40a00000    # 5.0f

    .line 169
    .line 170
    const/high16 v21, 0x41300000    # 11.0f

    .line 171
    .line 172
    const v22, 0x40ae6666    # 5.45f

    .line 173
    .line 174
    .line 175
    const v23, 0x4128cccd    # 10.55f

    .line 176
    .line 177
    .line 178
    const/high16 v24, 0x40a00000    # 5.0f

    .line 179
    .line 180
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 181
    .line 182
    .line 183
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 184
    .line 185
    .line 186
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 187
    .line 188
    .line 189
    move-result-object v2

    .line 190
    const/16 v16, 0x3800

    .line 191
    .line 192
    const/16 v17, 0x0

    .line 193
    .line 194
    const/high16 v6, 0x3f800000    # 1.0f

    .line 195
    .line 196
    const/high16 v8, 0x3f800000    # 1.0f

    .line 197
    .line 198
    const/4 v7, 0x0

    .line 199
    const/high16 v9, 0x3f800000    # 1.0f

    .line 200
    .line 201
    const/high16 v12, 0x3f800000    # 1.0f

    .line 202
    .line 203
    const/4 v13, 0x0

    .line 204
    const/4 v14, 0x0

    .line 205
    const/4 v15, 0x0

    .line 206
    const-string v4, ""

    .line 207
    .line 208
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 209
    .line 210
    .line 211
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 212
    .line 213
    .line 214
    move-result v3

    .line 215
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 216
    .line 217
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 218
    .line 219
    .line 220
    move-result-wide v6

    .line 221
    const/4 v2, 0x0

    .line 222
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 223
    .line 224
    .line 225
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 226
    .line 227
    .line 228
    move-result v10

    .line 229
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 230
    .line 231
    .line 232
    move-result v11

    .line 233
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 234
    .line 235
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 236
    .line 237
    .line 238
    const/high16 v4, 0x41200000    # 10.0f

    .line 239
    .line 240
    const/high16 v6, 0x40000000    # 2.0f

    .line 241
    .line 242
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 243
    .line 244
    .line 245
    const/high16 v4, 0x40800000    # 4.0f

    .line 246
    .line 247
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 248
    .line 249
    .line 250
    const/high16 v25, 0x40400000    # 3.0f

    .line 251
    .line 252
    const/high16 v26, 0x40400000    # 3.0f

    .line 253
    .line 254
    const v21, 0x405ccccd    # 3.45f

    .line 255
    .line 256
    .line 257
    const/high16 v22, 0x40000000    # 2.0f

    .line 258
    .line 259
    const/high16 v23, 0x40400000    # 3.0f

    .line 260
    .line 261
    const v24, 0x401ccccd    # 2.45f

    .line 262
    .line 263
    .line 264
    move-object/from16 v20, v2

    .line 265
    .line 266
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 267
    .line 268
    .line 269
    const v4, 0x3ee66666    # 0.45f

    .line 270
    .line 271
    .line 272
    const/high16 v6, 0x3f800000    # 1.0f

    .line 273
    .line 274
    invoke-virtual {v2, v4, v6, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 275
    .line 276
    .line 277
    const/high16 v4, 0x40c00000    # 6.0f

    .line 278
    .line 279
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 280
    .line 281
    .line 282
    const/high16 v25, 0x3f800000    # 1.0f

    .line 283
    .line 284
    const/high16 v26, -0x40800000    # -1.0f

    .line 285
    .line 286
    const v21, 0x3f0ccccd    # 0.55f

    .line 287
    .line 288
    .line 289
    const/16 v22, 0x0

    .line 290
    .line 291
    const/high16 v23, 0x3f800000    # 1.0f

    .line 292
    .line 293
    const v24, -0x4119999a    # -0.45f

    .line 294
    .line 295
    .line 296
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 297
    .line 298
    .line 299
    const v4, 0x4128cccd    # 10.55f

    .line 300
    .line 301
    .line 302
    const/high16 v6, 0x41200000    # 10.0f

    .line 303
    .line 304
    const/high16 v7, 0x40000000    # 2.0f

    .line 305
    .line 306
    invoke-virtual {v2, v4, v7, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 307
    .line 308
    .line 309
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 310
    .line 311
    .line 312
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 313
    .line 314
    .line 315
    move-result-object v2

    .line 316
    const/high16 v6, 0x3f800000    # 1.0f

    .line 317
    .line 318
    const/4 v7, 0x0

    .line 319
    const-string v4, ""

    .line 320
    .line 321
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 322
    .line 323
    .line 324
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 325
    .line 326
    .line 327
    move-result v3

    .line 328
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 329
    .line 330
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 331
    .line 332
    .line 333
    move-result-wide v6

    .line 334
    const/4 v2, 0x0

    .line 335
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 336
    .line 337
    .line 338
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 339
    .line 340
    .line 341
    move-result v10

    .line 342
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 343
    .line 344
    .line 345
    move-result v11

    .line 346
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 347
    .line 348
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 349
    .line 350
    .line 351
    const v4, 0x41a71eb8    # 20.89f

    .line 352
    .line 353
    .line 354
    const v6, 0x4151c28f    # 13.11f

    .line 355
    .line 356
    .line 357
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 358
    .line 359
    .line 360
    const v25, -0x404b851f    # -1.41f

    .line 361
    .line 362
    .line 363
    const/16 v26, 0x0

    .line 364
    .line 365
    const v21, -0x413851ec    # -0.39f

    .line 366
    .line 367
    .line 368
    const v22, -0x413851ec    # -0.39f

    .line 369
    .line 370
    .line 371
    const v23, -0x407d70a4    # -1.02f

    .line 372
    .line 373
    .line 374
    const v24, -0x413851ec    # -0.39f

    .line 375
    .line 376
    .line 377
    move-object/from16 v20, v2

    .line 378
    .line 379
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 380
    .line 381
    .line 382
    const v4, 0x40cb851f    # 6.36f

    .line 383
    .line 384
    .line 385
    const v6, -0x3f347ae1    # -6.36f

    .line 386
    .line 387
    .line 388
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 389
    .line 390
    .line 391
    const/16 v25, 0x0

    .line 392
    .line 393
    const v26, 0x3fb47ae1    # 1.41f

    .line 394
    .line 395
    .line 396
    const v22, 0x3ec7ae14    # 0.39f

    .line 397
    .line 398
    .line 399
    const v23, -0x413851ec    # -0.39f

    .line 400
    .line 401
    .line 402
    const v24, 0x3f828f5c    # 1.02f

    .line 403
    .line 404
    .line 405
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 406
    .line 407
    .line 408
    const v25, 0x3fb47ae1    # 1.41f

    .line 409
    .line 410
    .line 411
    const/16 v26, 0x0

    .line 412
    .line 413
    const v21, 0x3ec7ae14    # 0.39f

    .line 414
    .line 415
    .line 416
    const v23, 0x3f828f5c    # 1.02f

    .line 417
    .line 418
    .line 419
    const v24, 0x3ec7ae14    # 0.39f

    .line 420
    .line 421
    .line 422
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 423
    .line 424
    .line 425
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 426
    .line 427
    .line 428
    const v25, 0x41a71eb8    # 20.89f

    .line 429
    .line 430
    .line 431
    const v26, 0x4151c28f    # 13.11f

    .line 432
    .line 433
    .line 434
    const v21, 0x41aa3d71    # 21.28f

    .line 435
    .line 436
    .line 437
    const v22, 0x4162147b    # 14.13f

    .line 438
    .line 439
    .line 440
    const v23, 0x41aa3d71    # 21.28f

    .line 441
    .line 442
    .line 443
    const/high16 v24, 0x41580000    # 13.5f

    .line 444
    .line 445
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 446
    .line 447
    .line 448
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 449
    .line 450
    .line 451
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 452
    .line 453
    .line 454
    move-result-object v2

    .line 455
    const/high16 v6, 0x3f800000    # 1.0f

    .line 456
    .line 457
    const/4 v7, 0x0

    .line 458
    const-string v4, ""

    .line 459
    .line 460
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 461
    .line 462
    .line 463
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 464
    .line 465
    .line 466
    move-result v3

    .line 467
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 468
    .line 469
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 470
    .line 471
    .line 472
    move-result-wide v6

    .line 473
    const/4 v2, 0x0

    .line 474
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 475
    .line 476
    .line 477
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 478
    .line 479
    .line 480
    move-result v10

    .line 481
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 482
    .line 483
    .line 484
    move-result v11

    .line 485
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 486
    .line 487
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 488
    .line 489
    .line 490
    const/high16 v4, 0x41680000    # 14.5f

    .line 491
    .line 492
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 493
    .line 494
    .line 495
    const/high16 v4, -0x40400000    # -1.5f

    .line 496
    .line 497
    const/4 v6, 0x0

    .line 498
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 499
    .line 500
    .line 501
    const/high16 v26, 0x40400000    # 3.0f

    .line 502
    .line 503
    const/16 v27, 0x0

    .line 504
    .line 505
    const/high16 v21, 0x3fc00000    # 1.5f

    .line 506
    .line 507
    const/high16 v22, 0x3fc00000    # 1.5f

    .line 508
    .line 509
    const/16 v23, 0x0

    .line 510
    .line 511
    const/16 v24, 0x1

    .line 512
    .line 513
    const/16 v25, 0x1

    .line 514
    .line 515
    move-object/from16 v20, v2

    .line 516
    .line 517
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 518
    .line 519
    .line 520
    const/high16 v26, -0x3fc00000    # -3.0f

    .line 521
    .line 522
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 523
    .line 524
    .line 525
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 526
    .line 527
    .line 528
    move-result-object v2

    .line 529
    const/high16 v6, 0x3f800000    # 1.0f

    .line 530
    .line 531
    const/4 v7, 0x0

    .line 532
    const-string v4, ""

    .line 533
    .line 534
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 535
    .line 536
    .line 537
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 538
    .line 539
    .line 540
    move-result v3

    .line 541
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 542
    .line 543
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 544
    .line 545
    .line 546
    move-result-wide v6

    .line 547
    const/4 v2, 0x0

    .line 548
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 549
    .line 550
    .line 551
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 552
    .line 553
    .line 554
    move-result v10

    .line 555
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 556
    .line 557
    .line 558
    move-result v11

    .line 559
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 560
    .line 561
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 562
    .line 563
    .line 564
    const/high16 v4, 0x419c0000    # 19.5f

    .line 565
    .line 566
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 567
    .line 568
    .line 569
    const/high16 v4, -0x40400000    # -1.5f

    .line 570
    .line 571
    const/4 v6, 0x0

    .line 572
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 573
    .line 574
    .line 575
    const/high16 v26, 0x40400000    # 3.0f

    .line 576
    .line 577
    move-object/from16 v20, v2

    .line 578
    .line 579
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 580
    .line 581
    .line 582
    const/high16 v26, -0x3fc00000    # -3.0f

    .line 583
    .line 584
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 585
    .line 586
    .line 587
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 588
    .line 589
    .line 590
    move-result-object v2

    .line 591
    const/high16 v6, 0x3f800000    # 1.0f

    .line 592
    .line 593
    const/4 v7, 0x0

    .line 594
    const-string v4, ""

    .line 595
    .line 596
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 597
    .line 598
    .line 599
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 600
    .line 601
    .line 602
    move-result v3

    .line 603
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 604
    .line 605
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 606
    .line 607
    .line 608
    move-result-wide v6

    .line 609
    const/4 v2, 0x0

    .line 610
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 611
    .line 612
    .line 613
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 614
    .line 615
    .line 616
    move-result v10

    .line 617
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 618
    .line 619
    .line 620
    move-result v11

    .line 621
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 622
    .line 623
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 624
    .line 625
    .line 626
    const/high16 v4, 0x41780000    # 15.5f

    .line 627
    .line 628
    const/high16 v6, 0x41300000    # 11.0f

    .line 629
    .line 630
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 631
    .line 632
    .line 633
    const/high16 v25, 0x40200000    # 2.5f

    .line 634
    .line 635
    const/high16 v26, -0x3fe00000    # -2.5f

    .line 636
    .line 637
    const v21, 0x3fb0a3d7    # 1.38f

    .line 638
    .line 639
    .line 640
    const/16 v22, 0x0

    .line 641
    .line 642
    const/high16 v23, 0x40200000    # 2.5f

    .line 643
    .line 644
    const v24, -0x4070a3d7    # -1.12f

    .line 645
    .line 646
    .line 647
    move-object/from16 v20, v2

    .line 648
    .line 649
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 650
    .line 651
    .line 652
    const/high16 v4, 0x40800000    # 4.0f

    .line 653
    .line 654
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 655
    .line 656
    .line 657
    const/high16 v4, 0x40000000    # 2.0f

    .line 658
    .line 659
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 660
    .line 661
    .line 662
    const/high16 v25, 0x3f800000    # 1.0f

    .line 663
    .line 664
    const/high16 v26, -0x40800000    # -1.0f

    .line 665
    .line 666
    const v21, 0x3f0ccccd    # 0.55f

    .line 667
    .line 668
    .line 669
    const/high16 v23, 0x3f800000    # 1.0f

    .line 670
    .line 671
    const v24, -0x4119999a    # -0.45f

    .line 672
    .line 673
    .line 674
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 675
    .line 676
    .line 677
    const/high16 v25, -0x40800000    # -1.0f

    .line 678
    .line 679
    const/16 v21, 0x0

    .line 680
    .line 681
    const v22, -0x40f33333    # -0.55f

    .line 682
    .line 683
    .line 684
    const v23, -0x4119999a    # -0.45f

    .line 685
    .line 686
    .line 687
    const/high16 v24, -0x40800000    # -1.0f

    .line 688
    .line 689
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 690
    .line 691
    .line 692
    const/high16 v4, -0x40000000    # -2.0f

    .line 693
    .line 694
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 695
    .line 696
    .line 697
    const/high16 v26, 0x3f800000    # 1.0f

    .line 698
    .line 699
    const v21, -0x40f33333    # -0.55f

    .line 700
    .line 701
    .line 702
    const/16 v22, 0x0

    .line 703
    .line 704
    const/high16 v23, -0x40800000    # -1.0f

    .line 705
    .line 706
    const v24, 0x3ee66666    # 0.45f

    .line 707
    .line 708
    .line 709
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 710
    .line 711
    .line 712
    const v4, 0x4060a3d7    # 3.51f

    .line 713
    .line 714
    .line 715
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 716
    .line 717
    .line 718
    const/high16 v25, 0x41780000    # 15.5f

    .line 719
    .line 720
    const/high16 v26, 0x40c00000    # 6.0f

    .line 721
    .line 722
    const v21, 0x4184a3d7    # 16.58f

    .line 723
    .line 724
    .line 725
    const v22, 0x40c6147b    # 6.19f

    .line 726
    .line 727
    .line 728
    const v23, 0x41808f5c    # 16.07f

    .line 729
    .line 730
    .line 731
    const/high16 v24, 0x40c00000    # 6.0f

    .line 732
    .line 733
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 734
    .line 735
    .line 736
    const/high16 v25, 0x41500000    # 13.0f

    .line 737
    .line 738
    const/high16 v26, 0x41080000    # 8.5f

    .line 739
    .line 740
    const v21, 0x4161eb85    # 14.12f

    .line 741
    .line 742
    .line 743
    const/high16 v22, 0x40c00000    # 6.0f

    .line 744
    .line 745
    const/high16 v23, 0x41500000    # 13.0f

    .line 746
    .line 747
    const v24, 0x40e3d70a    # 7.12f

    .line 748
    .line 749
    .line 750
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 751
    .line 752
    .line 753
    const/high16 v25, 0x41780000    # 15.5f

    .line 754
    .line 755
    const/high16 v26, 0x41300000    # 11.0f

    .line 756
    .line 757
    const/high16 v21, 0x41500000    # 13.0f

    .line 758
    .line 759
    const v22, 0x411e147b    # 9.88f

    .line 760
    .line 761
    .line 762
    const v23, 0x4161eb85    # 14.12f

    .line 763
    .line 764
    .line 765
    const/high16 v24, 0x41300000    # 11.0f

    .line 766
    .line 767
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 768
    .line 769
    .line 770
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 771
    .line 772
    .line 773
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 774
    .line 775
    .line 776
    move-result-object v2

    .line 777
    const/high16 v6, 0x3f800000    # 1.0f

    .line 778
    .line 779
    const/4 v7, 0x0

    .line 780
    const-string v4, ""

    .line 781
    .line 782
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 783
    .line 784
    .line 785
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 786
    .line 787
    .line 788
    move-result v3

    .line 789
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 790
    .line 791
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 792
    .line 793
    .line 794
    move-result-wide v6

    .line 795
    const/4 v0, 0x0

    .line 796
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 797
    .line 798
    .line 799
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 800
    .line 801
    .line 802
    move-result v10

    .line 803
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 804
    .line 805
    .line 806
    move-result v11

    .line 807
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 808
    .line 809
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 810
    .line 811
    .line 812
    const v0, 0x4190b852    # 18.09f

    .line 813
    .line 814
    .line 815
    const v2, 0x41273333    # 10.45f

    .line 816
    .line 817
    .line 818
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 819
    .line 820
    .line 821
    const/16 v17, 0x0

    .line 822
    .line 823
    const v18, -0x404b851f    # -1.41f

    .line 824
    .line 825
    .line 826
    const v13, 0x3ec7ae14    # 0.39f

    .line 827
    .line 828
    .line 829
    const v14, -0x413851ec    # -0.39f

    .line 830
    .line 831
    .line 832
    const v15, 0x3ec7ae14    # 0.39f

    .line 833
    .line 834
    .line 835
    const v16, -0x407d70a4    # -1.02f

    .line 836
    .line 837
    .line 838
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 839
    .line 840
    .line 841
    const v17, -0x404b851f    # -1.41f

    .line 842
    .line 843
    .line 844
    const/16 v18, 0x0

    .line 845
    .line 846
    const v13, -0x413851ec    # -0.39f

    .line 847
    .line 848
    .line 849
    const v15, -0x407d70a4    # -1.02f

    .line 850
    .line 851
    .line 852
    const v16, -0x413851ec    # -0.39f

    .line 853
    .line 854
    .line 855
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 856
    .line 857
    .line 858
    const v0, 0x3f35c28f    # 0.71f

    .line 859
    .line 860
    .line 861
    const v2, -0x40ca3d71    # -0.71f

    .line 862
    .line 863
    .line 864
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 865
    .line 866
    .line 867
    const v0, -0x40ca3d71    # -0.71f

    .line 868
    .line 869
    .line 870
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 871
    .line 872
    .line 873
    const v0, -0x414ccccd    # -0.35f

    .line 874
    .line 875
    .line 876
    const v2, 0x3eb33333    # 0.35f

    .line 877
    .line 878
    .line 879
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 880
    .line 881
    .line 882
    const/16 v17, 0x0

    .line 883
    .line 884
    const v18, -0x3f9d70a4    # -3.54f

    .line 885
    .line 886
    .line 887
    const v13, 0x3f7ae148    # 0.98f

    .line 888
    .line 889
    .line 890
    const v14, -0x40851eb8    # -0.98f

    .line 891
    .line 892
    .line 893
    const v15, 0x3f7ae148    # 0.98f

    .line 894
    .line 895
    .line 896
    const v16, -0x3fdc28f6    # -2.56f

    .line 897
    .line 898
    .line 899
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 900
    .line 901
    .line 902
    const/4 v0, 0x0

    .line 903
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 904
    .line 905
    .line 906
    const v17, -0x401d70a4    # -1.77f

    .line 907
    .line 908
    .line 909
    const v18, -0x40c51eb8    # -0.73f

    .line 910
    .line 911
    .line 912
    const v13, -0x41051eb8    # -0.49f

    .line 913
    .line 914
    .line 915
    const v14, -0x41051eb8    # -0.49f

    .line 916
    .line 917
    .line 918
    const v15, -0x406f5c29    # -1.13f

    .line 919
    .line 920
    .line 921
    const v16, -0x40c51eb8    # -0.73f

    .line 922
    .line 923
    .line 924
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 925
    .line 926
    .line 927
    const v18, 0x3f3ae148    # 0.73f

    .line 928
    .line 929
    .line 930
    const v13, -0x40dc28f6    # -0.64f

    .line 931
    .line 932
    .line 933
    const/4 v14, 0x0

    .line 934
    const v15, -0x405c28f6    # -1.28f

    .line 935
    .line 936
    .line 937
    const v16, 0x3e75c28f    # 0.24f

    .line 938
    .line 939
    .line 940
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 941
    .line 942
    .line 943
    const/16 v17, 0x0

    .line 944
    .line 945
    const v18, 0x40628f5c    # 3.54f

    .line 946
    .line 947
    .line 948
    const v13, -0x40851eb8    # -0.98f

    .line 949
    .line 950
    .line 951
    const v14, 0x3f7ae148    # 0.98f

    .line 952
    .line 953
    .line 954
    const v15, -0x40851eb8    # -0.98f

    .line 955
    .line 956
    .line 957
    const v16, 0x4023d70a    # 2.56f

    .line 958
    .line 959
    .line 960
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 961
    .line 962
    .line 963
    const v0, 0x3eb33333    # 0.35f

    .line 964
    .line 965
    .line 966
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 967
    .line 968
    .line 969
    const v0, 0x3f87ae14    # 1.06f

    .line 970
    .line 971
    .line 972
    const v2, -0x407851ec    # -1.06f

    .line 973
    .line 974
    .line 975
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 976
    .line 977
    .line 978
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 979
    .line 980
    .line 981
    const/high16 v17, 0x40b00000    # 5.5f

    .line 982
    .line 983
    const/high16 v18, 0x41b00000    # 22.0f

    .line 984
    .line 985
    const v13, 0x40870a3d    # 4.22f

    .line 986
    .line 987
    .line 988
    const v14, 0x41ae147b    # 21.76f

    .line 989
    .line 990
    .line 991
    const v15, 0x409b851f    # 4.86f

    .line 992
    .line 993
    .line 994
    const/high16 v16, 0x41b00000    # 22.0f

    .line 995
    .line 996
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 997
    .line 998
    .line 999
    const v17, 0x3fe28f5c    # 1.77f

    .line 1000
    .line 1001
    .line 1002
    const v18, -0x40c51eb8    # -0.73f

    .line 1003
    .line 1004
    .line 1005
    const v13, 0x3f23d70a    # 0.64f

    .line 1006
    .line 1007
    .line 1008
    const/4 v14, 0x0

    .line 1009
    const v15, 0x3fa3d70a    # 1.28f

    .line 1010
    .line 1011
    .line 1012
    const v16, -0x418a3d71    # -0.24f

    .line 1013
    .line 1014
    .line 1015
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1016
    .line 1017
    .line 1018
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1019
    .line 1020
    .line 1021
    const v0, 0x3f35c28f    # 0.71f

    .line 1022
    .line 1023
    .line 1024
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1025
    .line 1026
    .line 1027
    const v17, 0x3fb47ae1    # 1.41f

    .line 1028
    .line 1029
    .line 1030
    const/16 v18, 0x0

    .line 1031
    .line 1032
    const v13, 0x3ec7ae14    # 0.39f

    .line 1033
    .line 1034
    .line 1035
    const v14, 0x3ec7ae14    # 0.39f

    .line 1036
    .line 1037
    .line 1038
    const v15, 0x3f828f5c    # 1.02f

    .line 1039
    .line 1040
    .line 1041
    const v16, 0x3ec7ae14    # 0.39f

    .line 1042
    .line 1043
    .line 1044
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1045
    .line 1046
    .line 1047
    const/16 v17, 0x0

    .line 1048
    .line 1049
    const v18, -0x404b851f    # -1.41f

    .line 1050
    .line 1051
    .line 1052
    const v14, -0x413851ec    # -0.39f

    .line 1053
    .line 1054
    .line 1055
    const v15, 0x3ec7ae14    # 0.39f

    .line 1056
    .line 1057
    .line 1058
    const v16, -0x407d70a4    # -1.02f

    .line 1059
    .line 1060
    .line 1061
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1062
    .line 1063
    .line 1064
    const v0, -0x40ca3d71    # -0.71f

    .line 1065
    .line 1066
    .line 1067
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1068
    .line 1069
    .line 1070
    const/4 v0, 0x0

    .line 1071
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1072
    .line 1073
    .line 1074
    const v0, 0x4190b852    # 18.09f

    .line 1075
    .line 1076
    .line 1077
    const v2, 0x41273333    # 10.45f

    .line 1078
    .line 1079
    .line 1080
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1081
    .line 1082
    .line 1083
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1084
    .line 1085
    .line 1086
    const v0, 0x41633333    # 14.2f

    .line 1087
    .line 1088
    .line 1089
    const v2, 0x40bb3333    # 5.85f

    .line 1090
    .line 1091
    .line 1092
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1093
    .line 1094
    .line 1095
    const v17, 0x3eb33333    # 0.35f

    .line 1096
    .line 1097
    .line 1098
    const v18, -0x41e66666    # -0.15f

    .line 1099
    .line 1100
    .line 1101
    const v13, 0x3df5c28f    # 0.12f

    .line 1102
    .line 1103
    .line 1104
    const v14, -0x420a3d71    # -0.12f

    .line 1105
    .line 1106
    .line 1107
    const v15, 0x3e851eb8    # 0.26f

    .line 1108
    .line 1109
    .line 1110
    const v16, -0x41e66666    # -0.15f

    .line 1111
    .line 1112
    .line 1113
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1114
    .line 1115
    .line 1116
    const v0, 0x3cf5c28f    # 0.03f

    .line 1117
    .line 1118
    .line 1119
    const v2, 0x3e19999a    # 0.15f

    .line 1120
    .line 1121
    .line 1122
    const v4, 0x3eb33333    # 0.35f

    .line 1123
    .line 1124
    .line 1125
    const v6, 0x3e6b851f    # 0.23f

    .line 1126
    .line 1127
    .line 1128
    invoke-virtual {v12, v6, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1129
    .line 1130
    .line 1131
    const/16 v17, 0x0

    .line 1132
    .line 1133
    const v18, 0x3f35c28f    # 0.71f

    .line 1134
    .line 1135
    .line 1136
    const v13, 0x3e428f5c    # 0.19f

    .line 1137
    .line 1138
    .line 1139
    const v14, 0x3e4ccccd    # 0.2f

    .line 1140
    .line 1141
    .line 1142
    const v15, 0x3e428f5c    # 0.19f

    .line 1143
    .line 1144
    .line 1145
    const v16, 0x3f028f5c    # 0.51f

    .line 1146
    .line 1147
    .line 1148
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1149
    .line 1150
    .line 1151
    const v0, -0x414ccccd    # -0.35f

    .line 1152
    .line 1153
    .line 1154
    const v2, 0x3eb33333    # 0.35f

    .line 1155
    .line 1156
    .line 1157
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1158
    .line 1159
    .line 1160
    const v0, 0x416e6666    # 14.9f

    .line 1161
    .line 1162
    .line 1163
    const v2, 0x40bb3333    # 5.85f

    .line 1164
    .line 1165
    .line 1166
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1167
    .line 1168
    .line 1169
    const v17, -0x41e66666    # -0.15f

    .line 1170
    .line 1171
    .line 1172
    const v18, -0x414ccccd    # -0.35f

    .line 1173
    .line 1174
    .line 1175
    const v13, -0x420a3d71    # -0.12f

    .line 1176
    .line 1177
    .line 1178
    const v14, -0x420a3d71    # -0.12f

    .line 1179
    .line 1180
    .line 1181
    const v15, -0x41e66666    # -0.15f

    .line 1182
    .line 1183
    .line 1184
    const v16, -0x417ae148    # -0.26f

    .line 1185
    .line 1186
    .line 1187
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1188
    .line 1189
    .line 1190
    const v0, 0x40b75c29    # 5.73f

    .line 1191
    .line 1192
    .line 1193
    const v2, 0x41651eb8    # 14.32f

    .line 1194
    .line 1195
    .line 1196
    const v4, 0x41633333    # 14.2f

    .line 1197
    .line 1198
    .line 1199
    const v6, 0x40bb3333    # 5.85f

    .line 1200
    .line 1201
    .line 1202
    invoke-virtual {v12, v0, v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1203
    .line 1204
    .line 1205
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1206
    .line 1207
    .line 1208
    const v0, 0x419ecccd    # 19.85f

    .line 1209
    .line 1210
    .line 1211
    const v2, 0x40bb3333    # 5.85f

    .line 1212
    .line 1213
    .line 1214
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1215
    .line 1216
    .line 1217
    const/high16 v17, 0x40b00000    # 5.5f

    .line 1218
    .line 1219
    const/high16 v18, 0x41a00000    # 20.0f

    .line 1220
    .line 1221
    const v13, 0x40b75c29    # 5.73f

    .line 1222
    .line 1223
    .line 1224
    const v14, 0x419fc28f    # 19.97f

    .line 1225
    .line 1226
    .line 1227
    const v15, 0x40b2e148    # 5.59f

    .line 1228
    .line 1229
    .line 1230
    const/high16 v16, 0x41a00000    # 20.0f

    .line 1231
    .line 1232
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1233
    .line 1234
    .line 1235
    const v0, -0x430a3d71    # -0.03f

    .line 1236
    .line 1237
    .line 1238
    const v2, -0x41e66666    # -0.15f

    .line 1239
    .line 1240
    .line 1241
    const v4, -0x414ccccd    # -0.35f

    .line 1242
    .line 1243
    .line 1244
    const v6, -0x41947ae1    # -0.23f

    .line 1245
    .line 1246
    .line 1247
    invoke-virtual {v12, v6, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1248
    .line 1249
    .line 1250
    const/high16 v17, 0x40a00000    # 5.0f

    .line 1251
    .line 1252
    const/high16 v18, 0x419c0000    # 19.5f

    .line 1253
    .line 1254
    const v13, 0x40a0f5c3    # 5.03f

    .line 1255
    .line 1256
    .line 1257
    const v14, 0x419dd70a    # 19.73f

    .line 1258
    .line 1259
    .line 1260
    const/high16 v15, 0x40a00000    # 5.0f

    .line 1261
    .line 1262
    const v16, 0x419cb852    # 19.59f

    .line 1263
    .line 1264
    .line 1265
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1266
    .line 1267
    .line 1268
    const v0, -0x41947ae1    # -0.23f

    .line 1269
    .line 1270
    .line 1271
    const v2, 0x3e19999a    # 0.15f

    .line 1272
    .line 1273
    .line 1274
    const v6, 0x3cf5c28f    # 0.03f

    .line 1275
    .line 1276
    .line 1277
    invoke-virtual {v12, v6, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1278
    .line 1279
    .line 1280
    const v0, 0x3f87ae14    # 1.06f

    .line 1281
    .line 1282
    .line 1283
    const v2, -0x407851ec    # -1.06f

    .line 1284
    .line 1285
    .line 1286
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1287
    .line 1288
    .line 1289
    const v0, 0x3f35c28f    # 0.71f

    .line 1290
    .line 1291
    .line 1292
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1293
    .line 1294
    .line 1295
    const v0, 0x419ecccd    # 19.85f

    .line 1296
    .line 1297
    .line 1298
    const v2, 0x40bb3333    # 5.85f

    .line 1299
    .line 1300
    .line 1301
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1302
    .line 1303
    .line 1304
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1305
    .line 1306
    .line 1307
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 1308
    .line 1309
    .line 1310
    move-result-object v2

    .line 1311
    const/16 v16, 0x3800

    .line 1312
    .line 1313
    const/16 v17, 0x0

    .line 1314
    .line 1315
    const/high16 v6, 0x3f800000    # 1.0f

    .line 1316
    .line 1317
    const/4 v7, 0x0

    .line 1318
    const/high16 v12, 0x3f800000    # 1.0f

    .line 1319
    .line 1320
    const/4 v13, 0x0

    .line 1321
    const/4 v14, 0x0

    .line 1322
    const/4 v15, 0x0

    .line 1323
    const-string v4, ""

    .line 1324
    .line 1325
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 1326
    .line 1327
    .line 1328
    move-result-object v0

    .line 1329
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1330
    .line 1331
    .line 1332
    move-result-object v0

    .line 1333
    sput-object v0, Landroidx/compose/material/icons/rounded/EmojiSymbolsKt;->_emojiSymbols:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1334
    .line 1335
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 1336
    .line 1337
    .line 1338
    return-object v0
.end method
