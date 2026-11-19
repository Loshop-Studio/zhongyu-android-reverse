.class public final Landroidx/compose/material/icons/twotone/DirectionsSubwayKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_directionsSubway",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "DirectionsSubway",
        "Landroidx/compose/material/icons/Icons$TwoTone;",
        "getDirectionsSubway",
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
        "SMAP\nDirectionsSubway.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DirectionsSubway.kt\nandroidx/compose/material/icons/twotone/DirectionsSubwayKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,114:1\n212#2,12:115\n233#2,18:128\n253#2:165\n233#2,18:166\n253#2:203\n233#2,18:204\n253#2:241\n233#2,18:242\n253#2:279\n174#3:127\n705#4,2:146\n717#4,2:148\n719#4,11:154\n705#4,2:184\n717#4,2:186\n719#4,11:192\n705#4,2:222\n717#4,2:224\n719#4,11:230\n705#4,2:260\n717#4,2:262\n719#4,11:268\n72#5,4:150\n72#5,4:188\n72#5,4:226\n72#5,4:264\n*S KotlinDebug\n*F\n+ 1 DirectionsSubway.kt\nandroidx/compose/material/icons/twotone/DirectionsSubwayKt\n*L\n29#1:115,12\n30#1:128,18\n30#1:165\n57#1:166,18\n57#1:203\n97#1:204,18\n97#1:241\n103#1:242,18\n103#1:279\n29#1:127\n30#1:146,2\n30#1:148,2\n30#1:154,11\n57#1:184,2\n57#1:186,2\n57#1:192,11\n97#1:222,2\n97#1:224,2\n97#1:230,11\n103#1:260,2\n103#1:262,2\n103#1:268,11\n30#1:150,4\n57#1:188,4\n97#1:226,4\n103#1:264,4\n*E\n"
    }
.end annotation


# static fields
.field private static _directionsSubway:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getDirectionsSubway(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 28

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/DirectionsSubwayKt;->_directionsSubway:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.DirectionsSubway"

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
    const/high16 v6, 0x41400000    # 12.0f

    .line 73
    .line 74
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const v25, -0x3f4dc28f    # -5.57f

    .line 78
    .line 79
    .line 80
    const/high16 v26, 0x3f800000    # 1.0f

    .line 81
    .line 82
    const v21, -0x3f9f5c29    # -3.51f

    .line 83
    .line 84
    .line 85
    const/16 v22, 0x0

    .line 86
    .line 87
    const v23, -0x3f6147ae    # -4.96f

    .line 88
    .line 89
    .line 90
    const v24, 0x3ef5c28f    # 0.48f

    .line 91
    .line 92
    .line 93
    move-object/from16 v20, v2

    .line 94
    .line 95
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 96
    .line 97
    .line 98
    const v4, 0x4133ae14    # 11.23f

    .line 99
    .line 100
    .line 101
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 102
    .line 103
    .line 104
    const v25, -0x3f4ae148    # -5.66f

    .line 105
    .line 106
    .line 107
    const/high16 v26, -0x40800000    # -1.0f

    .line 108
    .line 109
    const v21, -0x40f5c28f    # -0.54f

    .line 110
    .line 111
    .line 112
    const v22, -0x40f5c28f    # -0.54f

    .line 113
    .line 114
    .line 115
    const v23, -0x40066666    # -1.95f

    .line 116
    .line 117
    .line 118
    const/high16 v24, -0x40800000    # -1.0f

    .line 119
    .line 120
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 121
    .line 122
    .line 123
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 124
    .line 125
    .line 126
    const/high16 v4, 0x41780000    # 15.5f

    .line 127
    .line 128
    const/high16 v6, 0x40c00000    # 6.0f

    .line 129
    .line 130
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 131
    .line 132
    .line 133
    const/high16 v25, 0x3fc00000    # 1.5f

    .line 134
    .line 135
    const/high16 v26, 0x3fc00000    # 1.5f

    .line 136
    .line 137
    const/16 v21, 0x0

    .line 138
    .line 139
    const v22, 0x3f547ae1    # 0.83f

    .line 140
    .line 141
    .line 142
    const v23, 0x3f2b851f    # 0.67f

    .line 143
    .line 144
    .line 145
    const/high16 v24, 0x3fc00000    # 1.5f

    .line 146
    .line 147
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 148
    .line 149
    .line 150
    const/high16 v4, 0x41100000    # 9.0f

    .line 151
    .line 152
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 153
    .line 154
    .line 155
    const/high16 v26, -0x40400000    # -1.5f

    .line 156
    .line 157
    const v21, 0x3f547ae1    # 0.83f

    .line 158
    .line 159
    .line 160
    const/16 v22, 0x0

    .line 161
    .line 162
    const/high16 v23, 0x3fc00000    # 1.5f

    .line 163
    .line 164
    const v24, -0x40d47ae1    # -0.67f

    .line 165
    .line 166
    .line 167
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 168
    .line 169
    .line 170
    const/high16 v4, 0x41900000    # 18.0f

    .line 171
    .line 172
    const/high16 v6, 0x41400000    # 12.0f

    .line 173
    .line 174
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 175
    .line 176
    .line 177
    const/high16 v4, 0x40c00000    # 6.0f

    .line 178
    .line 179
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 180
    .line 181
    .line 182
    const/high16 v4, 0x40600000    # 3.5f

    .line 183
    .line 184
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 185
    .line 186
    .line 187
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 188
    .line 189
    .line 190
    const/high16 v4, 0x41780000    # 15.5f

    .line 191
    .line 192
    const/high16 v6, 0x41500000    # 13.0f

    .line 193
    .line 194
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 195
    .line 196
    .line 197
    const/high16 v26, 0x3fc00000    # 1.5f

    .line 198
    .line 199
    const v24, 0x3f2b851f    # 0.67f

    .line 200
    .line 201
    .line 202
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 203
    .line 204
    .line 205
    const v4, -0x40d47ae1    # -0.67f

    .line 206
    .line 207
    .line 208
    const/high16 v6, 0x3fc00000    # 1.5f

    .line 209
    .line 210
    const/high16 v7, -0x40400000    # -1.5f

    .line 211
    .line 212
    invoke-virtual {v2, v4, v6, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 213
    .line 214
    .line 215
    const/high16 v6, -0x40400000    # -1.5f

    .line 216
    .line 217
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 218
    .line 219
    .line 220
    const v4, 0x3f2b851f    # 0.67f

    .line 221
    .line 222
    .line 223
    const/high16 v6, 0x3fc00000    # 1.5f

    .line 224
    .line 225
    invoke-virtual {v2, v4, v7, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 226
    .line 227
    .line 228
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 229
    .line 230
    .line 231
    const/high16 v4, 0x41080000    # 8.5f

    .line 232
    .line 233
    const/high16 v6, 0x41500000    # 13.0f

    .line 234
    .line 235
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 236
    .line 237
    .line 238
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 239
    .line 240
    .line 241
    const v4, 0x411547ae    # 9.33f

    .line 242
    .line 243
    .line 244
    const/high16 v6, 0x41800000    # 16.0f

    .line 245
    .line 246
    const/high16 v7, 0x41080000    # 8.5f

    .line 247
    .line 248
    invoke-virtual {v2, v4, v6, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 249
    .line 250
    .line 251
    const v4, 0x417547ae    # 15.33f

    .line 252
    .line 253
    .line 254
    const/high16 v6, 0x41680000    # 14.5f

    .line 255
    .line 256
    const/high16 v7, 0x40e00000    # 7.0f

    .line 257
    .line 258
    invoke-virtual {v2, v7, v4, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 259
    .line 260
    .line 261
    const v4, 0x40f570a4    # 7.67f

    .line 262
    .line 263
    .line 264
    const/high16 v6, 0x41080000    # 8.5f

    .line 265
    .line 266
    const/high16 v7, 0x41500000    # 13.0f

    .line 267
    .line 268
    invoke-virtual {v2, v4, v7, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 269
    .line 270
    .line 271
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 272
    .line 273
    .line 274
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 275
    .line 276
    .line 277
    move-result-object v2

    .line 278
    const/16 v16, 0x3800

    .line 279
    .line 280
    const/16 v17, 0x0

    .line 281
    .line 282
    const v6, 0x3e99999a    # 0.3f

    .line 283
    .line 284
    .line 285
    const v8, 0x3e99999a    # 0.3f

    .line 286
    .line 287
    .line 288
    const/4 v7, 0x0

    .line 289
    const/high16 v9, 0x3f800000    # 1.0f

    .line 290
    .line 291
    const/high16 v12, 0x3f800000    # 1.0f

    .line 292
    .line 293
    const/4 v13, 0x0

    .line 294
    const/4 v14, 0x0

    .line 295
    const/4 v15, 0x0

    .line 296
    const-string v4, ""

    .line 297
    .line 298
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 299
    .line 300
    .line 301
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 302
    .line 303
    .line 304
    move-result v3

    .line 305
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 306
    .line 307
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 308
    .line 309
    .line 310
    move-result-wide v6

    .line 311
    const/4 v2, 0x0

    .line 312
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 313
    .line 314
    .line 315
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 316
    .line 317
    .line 318
    move-result v10

    .line 319
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 320
    .line 321
    .line 322
    move-result v11

    .line 323
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 324
    .line 325
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 326
    .line 327
    .line 328
    const/high16 v4, 0x40000000    # 2.0f

    .line 329
    .line 330
    const/high16 v6, 0x41400000    # 12.0f

    .line 331
    .line 332
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 333
    .line 334
    .line 335
    const/high16 v25, -0x3f000000    # -8.0f

    .line 336
    .line 337
    const/high16 v26, 0x40800000    # 4.0f

    .line 338
    .line 339
    const/high16 v21, -0x3f800000    # -4.0f

    .line 340
    .line 341
    const/high16 v23, -0x3f000000    # -8.0f

    .line 342
    .line 343
    const/high16 v24, 0x3f000000    # 0.5f

    .line 344
    .line 345
    move-object/from16 v20, v2

    .line 346
    .line 347
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 348
    .line 349
    .line 350
    const/high16 v4, 0x41180000    # 9.5f

    .line 351
    .line 352
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 353
    .line 354
    .line 355
    const/high16 v25, 0x40f00000    # 7.5f

    .line 356
    .line 357
    const/high16 v26, 0x41980000    # 19.0f

    .line 358
    .line 359
    const/high16 v21, 0x40800000    # 4.0f

    .line 360
    .line 361
    const v22, 0x418b70a4    # 17.43f

    .line 362
    .line 363
    .line 364
    const v23, 0x40b23d71    # 5.57f

    .line 365
    .line 366
    .line 367
    const/high16 v24, 0x41980000    # 19.0f

    .line 368
    .line 369
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 370
    .line 371
    .line 372
    const/high16 v4, 0x41a40000    # 20.5f

    .line 373
    .line 374
    const/high16 v6, 0x40c00000    # 6.0f

    .line 375
    .line 376
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 377
    .line 378
    .line 379
    const/high16 v4, 0x3f000000    # 0.5f

    .line 380
    .line 381
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 382
    .line 383
    .line 384
    const/high16 v4, 0x41400000    # 12.0f

    .line 385
    .line 386
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 387
    .line 388
    .line 389
    const/high16 v4, -0x41000000    # -0.5f

    .line 390
    .line 391
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 392
    .line 393
    .line 394
    const/high16 v4, 0x41840000    # 16.5f

    .line 395
    .line 396
    const/high16 v6, 0x41980000    # 19.0f

    .line 397
    .line 398
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 399
    .line 400
    .line 401
    const/high16 v25, 0x40600000    # 3.5f

    .line 402
    .line 403
    const/high16 v26, -0x3fa00000    # -3.5f

    .line 404
    .line 405
    const v21, 0x3ff70a3d    # 1.93f

    .line 406
    .line 407
    .line 408
    const/16 v22, 0x0

    .line 409
    .line 410
    const/high16 v23, 0x40600000    # 3.5f

    .line 411
    .line 412
    const v24, -0x40370a3d    # -1.57f

    .line 413
    .line 414
    .line 415
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 416
    .line 417
    .line 418
    const/high16 v4, 0x41a00000    # 20.0f

    .line 419
    .line 420
    const/high16 v6, 0x40c00000    # 6.0f

    .line 421
    .line 422
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 423
    .line 424
    .line 425
    const/high16 v25, -0x3f000000    # -8.0f

    .line 426
    .line 427
    const/high16 v26, -0x3f800000    # -4.0f

    .line 428
    .line 429
    const/16 v21, 0x0

    .line 430
    .line 431
    const/high16 v22, -0x3fa00000    # -3.5f

    .line 432
    .line 433
    const v23, -0x3f9ae148    # -3.58f

    .line 434
    .line 435
    .line 436
    const/high16 v24, -0x3f800000    # -4.0f

    .line 437
    .line 438
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 439
    .line 440
    .line 441
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 442
    .line 443
    .line 444
    const/high16 v4, 0x40800000    # 4.0f

    .line 445
    .line 446
    const/high16 v6, 0x41400000    # 12.0f

    .line 447
    .line 448
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 449
    .line 450
    .line 451
    const v25, 0x40b51eb8    # 5.66f

    .line 452
    .line 453
    .line 454
    const/high16 v26, 0x3f800000    # 1.0f

    .line 455
    .line 456
    const v21, 0x406d70a4    # 3.71f

    .line 457
    .line 458
    .line 459
    const/16 v22, 0x0

    .line 460
    .line 461
    const v23, 0x40a3d70a    # 5.12f

    .line 462
    .line 463
    .line 464
    const v24, 0x3eeb851f    # 0.46f

    .line 465
    .line 466
    .line 467
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 468
    .line 469
    .line 470
    const v4, 0x40cdc28f    # 6.43f

    .line 471
    .line 472
    .line 473
    const/high16 v6, 0x40a00000    # 5.0f

    .line 474
    .line 475
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 476
    .line 477
    .line 478
    const v25, 0x40b23d71    # 5.57f

    .line 479
    .line 480
    .line 481
    const/high16 v26, -0x40800000    # -1.0f

    .line 482
    .line 483
    const v21, 0x3f1c28f6    # 0.61f

    .line 484
    .line 485
    .line 486
    const v22, -0x40fae148    # -0.52f

    .line 487
    .line 488
    .line 489
    const v23, 0x4003d70a    # 2.06f

    .line 490
    .line 491
    .line 492
    const/high16 v24, -0x40800000    # -1.0f

    .line 493
    .line 494
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 495
    .line 496
    .line 497
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 498
    .line 499
    .line 500
    const/high16 v4, 0x40e00000    # 7.0f

    .line 501
    .line 502
    const/high16 v6, 0x40c00000    # 6.0f

    .line 503
    .line 504
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 505
    .line 506
    .line 507
    const/high16 v4, 0x40a00000    # 5.0f

    .line 508
    .line 509
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 510
    .line 511
    .line 512
    const/high16 v4, 0x40400000    # 3.0f

    .line 513
    .line 514
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 515
    .line 516
    .line 517
    const/high16 v4, 0x41200000    # 10.0f

    .line 518
    .line 519
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 520
    .line 521
    .line 522
    const/high16 v4, 0x40e00000    # 7.0f

    .line 523
    .line 524
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 525
    .line 526
    .line 527
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 528
    .line 529
    .line 530
    const/high16 v4, 0x41900000    # 18.0f

    .line 531
    .line 532
    const/high16 v6, 0x41780000    # 15.5f

    .line 533
    .line 534
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 535
    .line 536
    .line 537
    const/high16 v25, -0x40400000    # -1.5f

    .line 538
    .line 539
    const/high16 v26, 0x3fc00000    # 1.5f

    .line 540
    .line 541
    const/16 v21, 0x0

    .line 542
    .line 543
    const v22, 0x3f547ae1    # 0.83f

    .line 544
    .line 545
    .line 546
    const v23, -0x40d47ae1    # -0.67f

    .line 547
    .line 548
    .line 549
    const/high16 v24, 0x3fc00000    # 1.5f

    .line 550
    .line 551
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 552
    .line 553
    .line 554
    const/high16 v4, -0x3ef00000    # -9.0f

    .line 555
    .line 556
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 557
    .line 558
    .line 559
    const/high16 v26, -0x40400000    # -1.5f

    .line 560
    .line 561
    const v21, -0x40ab851f    # -0.83f

    .line 562
    .line 563
    .line 564
    const/16 v22, 0x0

    .line 565
    .line 566
    const/high16 v23, -0x40400000    # -1.5f

    .line 567
    .line 568
    const v24, -0x40d47ae1    # -0.67f

    .line 569
    .line 570
    .line 571
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 572
    .line 573
    .line 574
    const/high16 v4, 0x40c00000    # 6.0f

    .line 575
    .line 576
    const/high16 v6, 0x41400000    # 12.0f

    .line 577
    .line 578
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 579
    .line 580
    .line 581
    const/high16 v4, 0x41400000    # 12.0f

    .line 582
    .line 583
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 584
    .line 585
    .line 586
    const/high16 v4, 0x40600000    # 3.5f

    .line 587
    .line 588
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 589
    .line 590
    .line 591
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 592
    .line 593
    .line 594
    const/high16 v4, 0x41200000    # 10.0f

    .line 595
    .line 596
    const/high16 v6, 0x41900000    # 18.0f

    .line 597
    .line 598
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 599
    .line 600
    .line 601
    const/high16 v4, -0x3f600000    # -5.0f

    .line 602
    .line 603
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 604
    .line 605
    .line 606
    const/high16 v4, 0x40e00000    # 7.0f

    .line 607
    .line 608
    const/high16 v6, 0x41500000    # 13.0f

    .line 609
    .line 610
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 611
    .line 612
    .line 613
    const/high16 v4, 0x40a00000    # 5.0f

    .line 614
    .line 615
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 616
    .line 617
    .line 618
    const/high16 v4, 0x40400000    # 3.0f

    .line 619
    .line 620
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 621
    .line 622
    .line 623
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 624
    .line 625
    .line 626
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 627
    .line 628
    .line 629
    move-result-object v2

    .line 630
    const/high16 v6, 0x3f800000    # 1.0f

    .line 631
    .line 632
    const/high16 v8, 0x3f800000    # 1.0f

    .line 633
    .line 634
    const/4 v7, 0x0

    .line 635
    const-string v4, ""

    .line 636
    .line 637
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 638
    .line 639
    .line 640
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 641
    .line 642
    .line 643
    move-result v3

    .line 644
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 645
    .line 646
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 647
    .line 648
    .line 649
    move-result-wide v6

    .line 650
    const/4 v2, 0x0

    .line 651
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 652
    .line 653
    .line 654
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 655
    .line 656
    .line 657
    move-result v10

    .line 658
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 659
    .line 660
    .line 661
    move-result v11

    .line 662
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 663
    .line 664
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 665
    .line 666
    .line 667
    const/high16 v4, 0x41680000    # 14.5f

    .line 668
    .line 669
    const/high16 v6, 0x41080000    # 8.5f

    .line 670
    .line 671
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 672
    .line 673
    .line 674
    const/4 v4, 0x0

    .line 675
    const/high16 v6, -0x40400000    # -1.5f

    .line 676
    .line 677
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 678
    .line 679
    .line 680
    const/high16 v26, 0x40400000    # 3.0f

    .line 681
    .line 682
    const/16 v27, 0x0

    .line 683
    .line 684
    const/high16 v21, 0x3fc00000    # 1.5f

    .line 685
    .line 686
    const/high16 v22, 0x3fc00000    # 1.5f

    .line 687
    .line 688
    const/16 v23, 0x0

    .line 689
    .line 690
    const/16 v24, 0x1

    .line 691
    .line 692
    const/16 v25, 0x1

    .line 693
    .line 694
    move-object/from16 v20, v2

    .line 695
    .line 696
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 697
    .line 698
    .line 699
    const/high16 v26, -0x3fc00000    # -3.0f

    .line 700
    .line 701
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 702
    .line 703
    .line 704
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 705
    .line 706
    .line 707
    move-result-object v2

    .line 708
    const/high16 v6, 0x3f800000    # 1.0f

    .line 709
    .line 710
    const/4 v7, 0x0

    .line 711
    const-string v4, ""

    .line 712
    .line 713
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 714
    .line 715
    .line 716
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 717
    .line 718
    .line 719
    move-result v3

    .line 720
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 721
    .line 722
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 723
    .line 724
    .line 725
    move-result-wide v6

    .line 726
    const/4 v0, 0x0

    .line 727
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 728
    .line 729
    .line 730
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 731
    .line 732
    .line 733
    move-result v10

    .line 734
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 735
    .line 736
    .line 737
    move-result v11

    .line 738
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 739
    .line 740
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 741
    .line 742
    .line 743
    const/high16 v0, 0x41680000    # 14.5f

    .line 744
    .line 745
    const/high16 v2, 0x41780000    # 15.5f

    .line 746
    .line 747
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 748
    .line 749
    .line 750
    const/4 v0, 0x0

    .line 751
    const/high16 v2, -0x40400000    # -1.5f

    .line 752
    .line 753
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 754
    .line 755
    .line 756
    const/high16 v18, 0x40400000    # 3.0f

    .line 757
    .line 758
    const/16 v19, 0x0

    .line 759
    .line 760
    const/high16 v13, 0x3fc00000    # 1.5f

    .line 761
    .line 762
    const/high16 v14, 0x3fc00000    # 1.5f

    .line 763
    .line 764
    const/16 v16, 0x1

    .line 765
    .line 766
    const/16 v17, 0x1

    .line 767
    .line 768
    invoke-virtual/range {v12 .. v19}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 769
    .line 770
    .line 771
    const/high16 v18, -0x3fc00000    # -3.0f

    .line 772
    .line 773
    invoke-virtual/range {v12 .. v19}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 774
    .line 775
    .line 776
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 777
    .line 778
    .line 779
    move-result-object v2

    .line 780
    const/16 v16, 0x3800

    .line 781
    .line 782
    const/16 v17, 0x0

    .line 783
    .line 784
    const/high16 v6, 0x3f800000    # 1.0f

    .line 785
    .line 786
    const/4 v7, 0x0

    .line 787
    const/high16 v12, 0x3f800000    # 1.0f

    .line 788
    .line 789
    const/4 v13, 0x0

    .line 790
    const/4 v14, 0x0

    .line 791
    const-string v4, ""

    .line 792
    .line 793
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 794
    .line 795
    .line 796
    move-result-object v0

    .line 797
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 798
    .line 799
    .line 800
    move-result-object v0

    .line 801
    sput-object v0, Landroidx/compose/material/icons/twotone/DirectionsSubwayKt;->_directionsSubway:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 802
    .line 803
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 804
    .line 805
    .line 806
    return-object v0
.end method
