.class public final Landroidx/compose/material/icons/twotone/DirectionsTransitFilledKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_directionsTransitFilled",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "DirectionsTransitFilled",
        "Landroidx/compose/material/icons/Icons$TwoTone;",
        "getDirectionsTransitFilled",
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
        "SMAP\nDirectionsTransitFilled.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DirectionsTransitFilled.kt\nandroidx/compose/material/icons/twotone/DirectionsTransitFilledKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,120:1\n212#2,12:121\n233#2,18:134\n253#2:171\n233#2,18:172\n253#2:209\n233#2,18:210\n253#2:247\n233#2,18:248\n253#2:285\n233#2,18:286\n253#2:323\n174#3:133\n705#4,2:152\n717#4,2:154\n719#4,11:160\n705#4,2:190\n717#4,2:192\n719#4,11:198\n705#4,2:228\n717#4,2:230\n719#4,11:236\n705#4,2:266\n717#4,2:268\n719#4,11:274\n705#4,2:304\n717#4,2:306\n719#4,11:312\n72#5,4:156\n72#5,4:194\n72#5,4:232\n72#5,4:270\n72#5,4:308\n*S KotlinDebug\n*F\n+ 1 DirectionsTransitFilled.kt\nandroidx/compose/material/icons/twotone/DirectionsTransitFilledKt\n*L\n29#1:121,12\n30#1:134,18\n30#1:171\n39#1:172,18\n39#1:209\n61#1:210,18\n61#1:247\n103#1:248,18\n103#1:285\n109#1:286,18\n109#1:323\n29#1:133\n30#1:152,2\n30#1:154,2\n30#1:160,11\n39#1:190,2\n39#1:192,2\n39#1:198,11\n61#1:228,2\n61#1:230,2\n61#1:236,11\n103#1:266,2\n103#1:268,2\n103#1:274,11\n109#1:304,2\n109#1:306,2\n109#1:312,11\n30#1:156,4\n39#1:194,4\n61#1:232,4\n103#1:270,4\n109#1:308,4\n*E\n"
    }
.end annotation


# static fields
.field private static _directionsTransitFilled:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getDirectionsTransitFilled(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 28

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/DirectionsTransitFilledKt;->_directionsTransitFilled:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.DirectionsTransitFilled"

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
    const/high16 v6, 0x41500000    # 13.0f

    .line 73
    .line 74
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const v4, 0x409570a4    # 4.67f

    .line 78
    .line 79
    .line 80
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 81
    .line 82
    .line 83
    const/high16 v25, 0x41400000    # 12.0f

    .line 84
    .line 85
    const/high16 v26, 0x40800000    # 4.0f

    .line 86
    .line 87
    const v21, 0x41890a3d    # 17.13f

    .line 88
    .line 89
    .line 90
    const v22, 0x408eb852    # 4.46f

    .line 91
    .line 92
    .line 93
    const v23, 0x417b5c29    # 15.71f

    .line 94
    .line 95
    .line 96
    const/high16 v24, 0x40800000    # 4.0f

    .line 97
    .line 98
    move-object/from16 v20, v2

    .line 99
    .line 100
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 101
    .line 102
    .line 103
    const v25, 0x40cdc28f    # 6.43f

    .line 104
    .line 105
    .line 106
    const/high16 v26, 0x40a00000    # 5.0f

    .line 107
    .line 108
    const v21, 0x4107ae14    # 8.48f

    .line 109
    .line 110
    .line 111
    const/high16 v22, 0x40800000    # 4.0f

    .line 112
    .line 113
    const v23, 0x40e0f5c3    # 7.03f

    .line 114
    .line 115
    .line 116
    const v24, 0x408f5c29    # 4.48f

    .line 117
    .line 118
    .line 119
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 120
    .line 121
    .line 122
    const/high16 v4, 0x41300000    # 11.0f

    .line 123
    .line 124
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 125
    .line 126
    .line 127
    const/high16 v4, 0x41500000    # 13.0f

    .line 128
    .line 129
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 130
    .line 131
    .line 132
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 133
    .line 134
    .line 135
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 136
    .line 137
    .line 138
    move-result-object v2

    .line 139
    const/16 v16, 0x3800

    .line 140
    .line 141
    const/16 v17, 0x0

    .line 142
    .line 143
    const v6, 0x3e99999a    # 0.3f

    .line 144
    .line 145
    .line 146
    const v8, 0x3e99999a    # 0.3f

    .line 147
    .line 148
    .line 149
    const/4 v7, 0x0

    .line 150
    const/high16 v9, 0x3f800000    # 1.0f

    .line 151
    .line 152
    const/high16 v12, 0x3f800000    # 1.0f

    .line 153
    .line 154
    const/4 v13, 0x0

    .line 155
    const/4 v14, 0x0

    .line 156
    const/4 v15, 0x0

    .line 157
    const-string v4, ""

    .line 158
    .line 159
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 160
    .line 161
    .line 162
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 163
    .line 164
    .line 165
    move-result v3

    .line 166
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 167
    .line 168
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 169
    .line 170
    .line 171
    move-result-wide v6

    .line 172
    const/4 v2, 0x0

    .line 173
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 174
    .line 175
    .line 176
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 177
    .line 178
    .line 179
    move-result v10

    .line 180
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 181
    .line 182
    .line 183
    move-result v11

    .line 184
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 185
    .line 186
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 187
    .line 188
    .line 189
    const/high16 v4, 0x40c00000    # 6.0f

    .line 190
    .line 191
    const/high16 v6, 0x41780000    # 15.5f

    .line 192
    .line 193
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 194
    .line 195
    .line 196
    const/high16 v25, 0x40f00000    # 7.5f

    .line 197
    .line 198
    const/high16 v26, 0x41880000    # 17.0f

    .line 199
    .line 200
    const/high16 v21, 0x40c00000    # 6.0f

    .line 201
    .line 202
    const v22, 0x4182a3d7    # 16.33f

    .line 203
    .line 204
    .line 205
    const v23, 0x40d570a4    # 6.67f

    .line 206
    .line 207
    .line 208
    const/high16 v24, 0x41880000    # 17.0f

    .line 209
    .line 210
    move-object/from16 v20, v2

    .line 211
    .line 212
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 213
    .line 214
    .line 215
    const/high16 v4, 0x41100000    # 9.0f

    .line 216
    .line 217
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 218
    .line 219
    .line 220
    const/high16 v25, 0x3fc00000    # 1.5f

    .line 221
    .line 222
    const/high16 v26, -0x40400000    # -1.5f

    .line 223
    .line 224
    const v21, 0x3f547ae1    # 0.83f

    .line 225
    .line 226
    .line 227
    const/16 v22, 0x0

    .line 228
    .line 229
    const/high16 v23, 0x3fc00000    # 1.5f

    .line 230
    .line 231
    const v24, -0x40d47ae1    # -0.67f

    .line 232
    .line 233
    .line 234
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 235
    .line 236
    .line 237
    const/high16 v4, 0x41400000    # 12.0f

    .line 238
    .line 239
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 240
    .line 241
    .line 242
    const/high16 v4, 0x40c00000    # 6.0f

    .line 243
    .line 244
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 245
    .line 246
    .line 247
    const/high16 v4, 0x41780000    # 15.5f

    .line 248
    .line 249
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 250
    .line 251
    .line 252
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 253
    .line 254
    .line 255
    const/high16 v6, 0x41500000    # 13.0f

    .line 256
    .line 257
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 258
    .line 259
    .line 260
    const/high16 v26, 0x3fc00000    # 1.5f

    .line 261
    .line 262
    const v24, 0x3f2b851f    # 0.67f

    .line 263
    .line 264
    .line 265
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 266
    .line 267
    .line 268
    const v4, 0x4182a3d7    # 16.33f

    .line 269
    .line 270
    .line 271
    const/high16 v6, 0x41800000    # 16.0f

    .line 272
    .line 273
    const/high16 v7, 0x41780000    # 15.5f

    .line 274
    .line 275
    invoke-virtual {v2, v4, v6, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 276
    .line 277
    .line 278
    const v4, 0x417547ae    # 15.33f

    .line 279
    .line 280
    .line 281
    const/high16 v6, 0x41600000    # 14.0f

    .line 282
    .line 283
    const/high16 v7, 0x41680000    # 14.5f

    .line 284
    .line 285
    invoke-virtual {v2, v6, v4, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 286
    .line 287
    .line 288
    const v4, 0x416ab852    # 14.67f

    .line 289
    .line 290
    .line 291
    const/high16 v6, 0x41780000    # 15.5f

    .line 292
    .line 293
    const/high16 v7, 0x41500000    # 13.0f

    .line 294
    .line 295
    invoke-virtual {v2, v4, v7, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 296
    .line 297
    .line 298
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 299
    .line 300
    .line 301
    const/high16 v4, 0x41080000    # 8.5f

    .line 302
    .line 303
    const/high16 v6, 0x41500000    # 13.0f

    .line 304
    .line 305
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 306
    .line 307
    .line 308
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 309
    .line 310
    .line 311
    const v4, 0x411547ae    # 9.33f

    .line 312
    .line 313
    .line 314
    const/high16 v6, 0x41080000    # 8.5f

    .line 315
    .line 316
    const/high16 v7, 0x41800000    # 16.0f

    .line 317
    .line 318
    invoke-virtual {v2, v4, v7, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 319
    .line 320
    .line 321
    const v4, 0x417547ae    # 15.33f

    .line 322
    .line 323
    .line 324
    const/high16 v6, 0x41680000    # 14.5f

    .line 325
    .line 326
    const/high16 v7, 0x40e00000    # 7.0f

    .line 327
    .line 328
    invoke-virtual {v2, v7, v4, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 329
    .line 330
    .line 331
    const v4, 0x40f570a4    # 7.67f

    .line 332
    .line 333
    .line 334
    const/high16 v6, 0x41080000    # 8.5f

    .line 335
    .line 336
    const/high16 v7, 0x41500000    # 13.0f

    .line 337
    .line 338
    invoke-virtual {v2, v4, v7, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 339
    .line 340
    .line 341
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 342
    .line 343
    .line 344
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 345
    .line 346
    .line 347
    move-result-object v2

    .line 348
    const v6, 0x3e99999a    # 0.3f

    .line 349
    .line 350
    .line 351
    const/4 v7, 0x0

    .line 352
    const-string v4, ""

    .line 353
    .line 354
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 355
    .line 356
    .line 357
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 358
    .line 359
    .line 360
    move-result v3

    .line 361
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 362
    .line 363
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 364
    .line 365
    .line 366
    move-result-wide v6

    .line 367
    const/4 v2, 0x0

    .line 368
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 369
    .line 370
    .line 371
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 372
    .line 373
    .line 374
    move-result v10

    .line 375
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 376
    .line 377
    .line 378
    move-result v11

    .line 379
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 380
    .line 381
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 382
    .line 383
    .line 384
    const/high16 v4, 0x40000000    # 2.0f

    .line 385
    .line 386
    const/high16 v6, 0x41400000    # 12.0f

    .line 387
    .line 388
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 389
    .line 390
    .line 391
    const/high16 v25, 0x40800000    # 4.0f

    .line 392
    .line 393
    const/high16 v26, 0x40c00000    # 6.0f

    .line 394
    .line 395
    const/high16 v21, 0x41000000    # 8.0f

    .line 396
    .line 397
    const/high16 v22, 0x40000000    # 2.0f

    .line 398
    .line 399
    const/high16 v23, 0x40800000    # 4.0f

    .line 400
    .line 401
    const/high16 v24, 0x40200000    # 2.5f

    .line 402
    .line 403
    move-object/from16 v20, v2

    .line 404
    .line 405
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 406
    .line 407
    .line 408
    const/high16 v4, 0x41180000    # 9.5f

    .line 409
    .line 410
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 411
    .line 412
    .line 413
    const/high16 v25, 0x40f00000    # 7.5f

    .line 414
    .line 415
    const/high16 v26, 0x41980000    # 19.0f

    .line 416
    .line 417
    const/high16 v21, 0x40800000    # 4.0f

    .line 418
    .line 419
    const v22, 0x418b70a4    # 17.43f

    .line 420
    .line 421
    .line 422
    const v23, 0x40b23d71    # 5.57f

    .line 423
    .line 424
    .line 425
    const/high16 v24, 0x41980000    # 19.0f

    .line 426
    .line 427
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 428
    .line 429
    .line 430
    const/high16 v4, 0x41a00000    # 20.0f

    .line 431
    .line 432
    const/high16 v6, 0x40c00000    # 6.0f

    .line 433
    .line 434
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 435
    .line 436
    .line 437
    const/high16 v4, 0x3f800000    # 1.0f

    .line 438
    .line 439
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 440
    .line 441
    .line 442
    const/high16 v4, 0x41400000    # 12.0f

    .line 443
    .line 444
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 445
    .line 446
    .line 447
    const/high16 v4, -0x40800000    # -1.0f

    .line 448
    .line 449
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 450
    .line 451
    .line 452
    const/high16 v6, -0x40400000    # -1.5f

    .line 453
    .line 454
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 455
    .line 456
    .line 457
    const/high16 v25, 0x40600000    # 3.5f

    .line 458
    .line 459
    const/high16 v26, -0x3fa00000    # -3.5f

    .line 460
    .line 461
    const v21, 0x3ff70a3d    # 1.93f

    .line 462
    .line 463
    .line 464
    const/16 v22, 0x0

    .line 465
    .line 466
    const/high16 v23, 0x40600000    # 3.5f

    .line 467
    .line 468
    const v24, -0x40370a3d    # -1.57f

    .line 469
    .line 470
    .line 471
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 472
    .line 473
    .line 474
    const/high16 v4, 0x40c00000    # 6.0f

    .line 475
    .line 476
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 477
    .line 478
    .line 479
    const/high16 v25, 0x41400000    # 12.0f

    .line 480
    .line 481
    const/high16 v26, 0x40000000    # 2.0f

    .line 482
    .line 483
    const/high16 v21, 0x41a00000    # 20.0f

    .line 484
    .line 485
    const/high16 v22, 0x40200000    # 2.5f

    .line 486
    .line 487
    const v23, 0x41835c29    # 16.42f

    .line 488
    .line 489
    .line 490
    const/high16 v24, 0x40000000    # 2.0f

    .line 491
    .line 492
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 493
    .line 494
    .line 495
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 496
    .line 497
    .line 498
    const/high16 v4, 0x40800000    # 4.0f

    .line 499
    .line 500
    const/high16 v6, 0x41400000    # 12.0f

    .line 501
    .line 502
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 503
    .line 504
    .line 505
    const v25, 0x40b570a4    # 5.67f

    .line 506
    .line 507
    .line 508
    const/high16 v26, 0x3f800000    # 1.0f

    .line 509
    .line 510
    const v21, 0x406d70a4    # 3.71f

    .line 511
    .line 512
    .line 513
    const/16 v22, 0x0

    .line 514
    .line 515
    const v23, 0x40a428f6    # 5.13f

    .line 516
    .line 517
    .line 518
    const v24, 0x3eeb851f    # 0.46f

    .line 519
    .line 520
    .line 521
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 522
    .line 523
    .line 524
    const/high16 v4, 0x41500000    # 13.0f

    .line 525
    .line 526
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 527
    .line 528
    .line 529
    const/high16 v4, -0x40000000    # -2.0f

    .line 530
    .line 531
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 532
    .line 533
    .line 534
    const v4, 0x40cdc28f    # 6.43f

    .line 535
    .line 536
    .line 537
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 538
    .line 539
    .line 540
    const/high16 v25, 0x41400000    # 12.0f

    .line 541
    .line 542
    const/high16 v26, 0x40800000    # 4.0f

    .line 543
    .line 544
    const v21, 0x40e0f5c3    # 7.03f

    .line 545
    .line 546
    .line 547
    const v22, 0x408f5c29    # 4.48f

    .line 548
    .line 549
    .line 550
    const v23, 0x4107ae14    # 8.48f

    .line 551
    .line 552
    .line 553
    const/high16 v24, 0x40800000    # 4.0f

    .line 554
    .line 555
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 556
    .line 557
    .line 558
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 559
    .line 560
    .line 561
    const/high16 v4, 0x40e00000    # 7.0f

    .line 562
    .line 563
    const/high16 v6, 0x40c00000    # 6.0f

    .line 564
    .line 565
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 566
    .line 567
    .line 568
    const/high16 v4, 0x40a00000    # 5.0f

    .line 569
    .line 570
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 571
    .line 572
    .line 573
    const/high16 v4, 0x40400000    # 3.0f

    .line 574
    .line 575
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 576
    .line 577
    .line 578
    const/high16 v4, 0x40c00000    # 6.0f

    .line 579
    .line 580
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 581
    .line 582
    .line 583
    const/high16 v4, 0x40e00000    # 7.0f

    .line 584
    .line 585
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 586
    .line 587
    .line 588
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 589
    .line 590
    .line 591
    const/high16 v4, 0x41900000    # 18.0f

    .line 592
    .line 593
    const/high16 v6, 0x41780000    # 15.5f

    .line 594
    .line 595
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 596
    .line 597
    .line 598
    const/high16 v25, -0x40400000    # -1.5f

    .line 599
    .line 600
    const/high16 v26, 0x3fc00000    # 1.5f

    .line 601
    .line 602
    const/16 v21, 0x0

    .line 603
    .line 604
    const v22, 0x3f547ae1    # 0.83f

    .line 605
    .line 606
    .line 607
    const v23, -0x40d47ae1    # -0.67f

    .line 608
    .line 609
    .line 610
    const/high16 v24, 0x3fc00000    # 1.5f

    .line 611
    .line 612
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 613
    .line 614
    .line 615
    const/high16 v4, -0x3ef00000    # -9.0f

    .line 616
    .line 617
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 618
    .line 619
    .line 620
    const/high16 v25, 0x40c00000    # 6.0f

    .line 621
    .line 622
    const/high16 v26, 0x41780000    # 15.5f

    .line 623
    .line 624
    const v21, 0x40d570a4    # 6.67f

    .line 625
    .line 626
    .line 627
    const/high16 v22, 0x41880000    # 17.0f

    .line 628
    .line 629
    const/high16 v23, 0x40c00000    # 6.0f

    .line 630
    .line 631
    const v24, 0x4182a3d7    # 16.33f

    .line 632
    .line 633
    .line 634
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 635
    .line 636
    .line 637
    const/high16 v4, 0x41400000    # 12.0f

    .line 638
    .line 639
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 640
    .line 641
    .line 642
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 643
    .line 644
    .line 645
    const/high16 v4, 0x41780000    # 15.5f

    .line 646
    .line 647
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 648
    .line 649
    .line 650
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 651
    .line 652
    .line 653
    const/high16 v4, 0x41200000    # 10.0f

    .line 654
    .line 655
    const/high16 v6, 0x41900000    # 18.0f

    .line 656
    .line 657
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 658
    .line 659
    .line 660
    const/high16 v4, -0x3f600000    # -5.0f

    .line 661
    .line 662
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 663
    .line 664
    .line 665
    const/high16 v4, 0x40e00000    # 7.0f

    .line 666
    .line 667
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 668
    .line 669
    .line 670
    const/high16 v4, 0x40a00000    # 5.0f

    .line 671
    .line 672
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 673
    .line 674
    .line 675
    const/high16 v4, 0x41200000    # 10.0f

    .line 676
    .line 677
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 678
    .line 679
    .line 680
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 681
    .line 682
    .line 683
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 684
    .line 685
    .line 686
    move-result-object v2

    .line 687
    const/high16 v6, 0x3f800000    # 1.0f

    .line 688
    .line 689
    const/high16 v8, 0x3f800000    # 1.0f

    .line 690
    .line 691
    const/4 v7, 0x0

    .line 692
    const-string v4, ""

    .line 693
    .line 694
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 695
    .line 696
    .line 697
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 698
    .line 699
    .line 700
    move-result v3

    .line 701
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 702
    .line 703
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 704
    .line 705
    .line 706
    move-result-wide v6

    .line 707
    const/4 v2, 0x0

    .line 708
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 709
    .line 710
    .line 711
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 712
    .line 713
    .line 714
    move-result v10

    .line 715
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 716
    .line 717
    .line 718
    move-result v11

    .line 719
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 720
    .line 721
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 722
    .line 723
    .line 724
    const/high16 v4, 0x41080000    # 8.5f

    .line 725
    .line 726
    const/high16 v6, 0x41680000    # 14.5f

    .line 727
    .line 728
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 729
    .line 730
    .line 731
    const/4 v4, 0x0

    .line 732
    const/high16 v6, -0x40400000    # -1.5f

    .line 733
    .line 734
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 735
    .line 736
    .line 737
    const/high16 v26, 0x40400000    # 3.0f

    .line 738
    .line 739
    const/16 v27, 0x0

    .line 740
    .line 741
    const/high16 v21, 0x3fc00000    # 1.5f

    .line 742
    .line 743
    const/high16 v22, 0x3fc00000    # 1.5f

    .line 744
    .line 745
    const/16 v23, 0x0

    .line 746
    .line 747
    const/16 v24, 0x1

    .line 748
    .line 749
    const/16 v25, 0x1

    .line 750
    .line 751
    move-object/from16 v20, v2

    .line 752
    .line 753
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 754
    .line 755
    .line 756
    const/high16 v26, -0x3fc00000    # -3.0f

    .line 757
    .line 758
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 759
    .line 760
    .line 761
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 762
    .line 763
    .line 764
    move-result-object v2

    .line 765
    const/high16 v6, 0x3f800000    # 1.0f

    .line 766
    .line 767
    const/4 v7, 0x0

    .line 768
    const-string v4, ""

    .line 769
    .line 770
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 771
    .line 772
    .line 773
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 774
    .line 775
    .line 776
    move-result v3

    .line 777
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 778
    .line 779
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 780
    .line 781
    .line 782
    move-result-wide v6

    .line 783
    const/4 v0, 0x0

    .line 784
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 785
    .line 786
    .line 787
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 788
    .line 789
    .line 790
    move-result v10

    .line 791
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 792
    .line 793
    .line 794
    move-result v11

    .line 795
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 796
    .line 797
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 798
    .line 799
    .line 800
    const/high16 v0, 0x41680000    # 14.5f

    .line 801
    .line 802
    const/high16 v2, 0x41780000    # 15.5f

    .line 803
    .line 804
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 805
    .line 806
    .line 807
    const/4 v0, 0x0

    .line 808
    const/high16 v2, -0x40400000    # -1.5f

    .line 809
    .line 810
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 811
    .line 812
    .line 813
    const/high16 v18, 0x40400000    # 3.0f

    .line 814
    .line 815
    const/16 v19, 0x0

    .line 816
    .line 817
    const/high16 v13, 0x3fc00000    # 1.5f

    .line 818
    .line 819
    const/high16 v14, 0x3fc00000    # 1.5f

    .line 820
    .line 821
    const/16 v16, 0x1

    .line 822
    .line 823
    const/16 v17, 0x1

    .line 824
    .line 825
    invoke-virtual/range {v12 .. v19}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 826
    .line 827
    .line 828
    const/high16 v18, -0x3fc00000    # -3.0f

    .line 829
    .line 830
    invoke-virtual/range {v12 .. v19}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 831
    .line 832
    .line 833
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 834
    .line 835
    .line 836
    move-result-object v2

    .line 837
    const/16 v16, 0x3800

    .line 838
    .line 839
    const/16 v17, 0x0

    .line 840
    .line 841
    const/high16 v6, 0x3f800000    # 1.0f

    .line 842
    .line 843
    const/4 v7, 0x0

    .line 844
    const/high16 v12, 0x3f800000    # 1.0f

    .line 845
    .line 846
    const/4 v13, 0x0

    .line 847
    const/4 v14, 0x0

    .line 848
    const-string v4, ""

    .line 849
    .line 850
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 851
    .line 852
    .line 853
    move-result-object v0

    .line 854
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 855
    .line 856
    .line 857
    move-result-object v0

    .line 858
    sput-object v0, Landroidx/compose/material/icons/twotone/DirectionsTransitFilledKt;->_directionsTransitFilled:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 859
    .line 860
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 861
    .line 862
    .line 863
    return-object v0
.end method
