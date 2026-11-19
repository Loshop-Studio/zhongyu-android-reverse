.class public final Landroidx/compose/material/icons/twotone/LightbulbCircleKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_lightbulbCircle",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "LightbulbCircle",
        "Landroidx/compose/material/icons/Icons$TwoTone;",
        "getLightbulbCircle",
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
        "SMAP\nLightbulbCircle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LightbulbCircle.kt\nandroidx/compose/material/icons/twotone/LightbulbCircleKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,105:1\n212#2,12:106\n233#2,18:119\n253#2:156\n233#2,18:157\n253#2:194\n233#2,18:195\n253#2:232\n233#2,18:233\n253#2:270\n233#2,18:271\n253#2:308\n174#3:118\n705#4,2:137\n717#4,2:139\n719#4,11:145\n705#4,2:175\n717#4,2:177\n719#4,11:183\n705#4,2:213\n717#4,2:215\n719#4,11:221\n705#4,2:251\n717#4,2:253\n719#4,11:259\n705#4,2:289\n717#4,2:291\n719#4,11:297\n72#5,4:141\n72#5,4:179\n72#5,4:217\n72#5,4:255\n72#5,4:293\n*S KotlinDebug\n*F\n+ 1 LightbulbCircle.kt\nandroidx/compose/material/icons/twotone/LightbulbCircleKt\n*L\n29#1:106,12\n30#1:119,18\n30#1:156\n56#1:157,18\n56#1:194\n70#1:195,18\n70#1:232\n77#1:233,18\n77#1:270\n84#1:271,18\n84#1:308\n29#1:118\n30#1:137,2\n30#1:139,2\n30#1:145,11\n56#1:175,2\n56#1:177,2\n56#1:183,11\n70#1:213,2\n70#1:215,2\n70#1:221,11\n77#1:251,2\n77#1:253,2\n77#1:259,11\n84#1:289,2\n84#1:291,2\n84#1:297,11\n30#1:141,4\n56#1:179,4\n70#1:217,4\n77#1:255,4\n84#1:293,4\n*E\n"
    }
.end annotation


# static fields
.field private static _lightbulbCircle:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getLightbulbCircle(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/LightbulbCircleKt;->_lightbulbCircle:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.LightbulbCircle"

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
    const/high16 v25, -0x3f000000    # -8.0f

    .line 78
    .line 79
    const/high16 v26, 0x41000000    # 8.0f

    .line 80
    .line 81
    const v21, -0x3f72e148    # -4.41f

    .line 82
    .line 83
    .line 84
    const/16 v22, 0x0

    .line 85
    .line 86
    const/high16 v23, -0x3f000000    # -8.0f

    .line 87
    .line 88
    const v24, 0x4065c28f    # 3.59f

    .line 89
    .line 90
    .line 91
    move-object/from16 v20, v2

    .line 92
    .line 93
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 94
    .line 95
    .line 96
    const v4, 0x4065c28f    # 3.59f

    .line 97
    .line 98
    .line 99
    const/high16 v6, 0x41000000    # 8.0f

    .line 100
    .line 101
    invoke-virtual {v2, v4, v6, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 102
    .line 103
    .line 104
    const v4, -0x3f9a3d71    # -3.59f

    .line 105
    .line 106
    .line 107
    const/high16 v6, -0x3f000000    # -8.0f

    .line 108
    .line 109
    const/high16 v7, 0x41000000    # 8.0f

    .line 110
    .line 111
    invoke-virtual {v2, v7, v4, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 112
    .line 113
    .line 114
    const v4, 0x418347ae    # 16.41f

    .line 115
    .line 116
    .line 117
    const/high16 v6, 0x40800000    # 4.0f

    .line 118
    .line 119
    const/high16 v7, 0x41400000    # 12.0f

    .line 120
    .line 121
    invoke-virtual {v2, v4, v6, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 122
    .line 123
    .line 124
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 125
    .line 126
    .line 127
    const/high16 v4, 0x41980000    # 19.0f

    .line 128
    .line 129
    const/high16 v6, 0x41400000    # 12.0f

    .line 130
    .line 131
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 132
    .line 133
    .line 134
    const/high16 v25, -0x40400000    # -1.5f

    .line 135
    .line 136
    const/high16 v26, -0x40400000    # -1.5f

    .line 137
    .line 138
    const v21, -0x40ab851f    # -0.83f

    .line 139
    .line 140
    .line 141
    const/high16 v23, -0x40400000    # -1.5f

    .line 142
    .line 143
    const v24, -0x40d47ae1    # -0.67f

    .line 144
    .line 145
    .line 146
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 147
    .line 148
    .line 149
    const/high16 v4, 0x40400000    # 3.0f

    .line 150
    .line 151
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 152
    .line 153
    .line 154
    const/high16 v25, 0x41400000    # 12.0f

    .line 155
    .line 156
    const/high16 v26, 0x41980000    # 19.0f

    .line 157
    .line 158
    const/high16 v21, 0x41580000    # 13.5f

    .line 159
    .line 160
    const v22, 0x4192a3d7    # 18.33f

    .line 161
    .line 162
    .line 163
    const v23, 0x414d47ae    # 12.83f

    .line 164
    .line 165
    .line 166
    const/high16 v24, 0x41980000    # 19.0f

    .line 167
    .line 168
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 169
    .line 170
    .line 171
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 172
    .line 173
    .line 174
    const/high16 v4, 0x41840000    # 16.5f

    .line 175
    .line 176
    const/high16 v6, 0x41700000    # 15.0f

    .line 177
    .line 178
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 179
    .line 180
    .line 181
    const/high16 v4, 0x41100000    # 9.0f

    .line 182
    .line 183
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 184
    .line 185
    .line 186
    const/high16 v4, 0x41700000    # 15.0f

    .line 187
    .line 188
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 189
    .line 190
    .line 191
    const/high16 v4, 0x40c00000    # 6.0f

    .line 192
    .line 193
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 194
    .line 195
    .line 196
    const/high16 v4, 0x41840000    # 16.5f

    .line 197
    .line 198
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 199
    .line 200
    .line 201
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 202
    .line 203
    .line 204
    const v4, 0x416f851f    # 14.97f

    .line 205
    .line 206
    .line 207
    const/high16 v6, 0x41600000    # 14.0f

    .line 208
    .line 209
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 210
    .line 211
    .line 212
    const v4, 0x41107ae1    # 9.03f

    .line 213
    .line 214
    .line 215
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 216
    .line 217
    .line 218
    const/high16 v25, 0x40e00000    # 7.0f

    .line 219
    .line 220
    const/high16 v26, 0x41200000    # 10.0f

    .line 221
    .line 222
    const v21, 0x40f9999a    # 7.8f

    .line 223
    .line 224
    .line 225
    const v22, 0x415170a4    # 13.09f

    .line 226
    .line 227
    .line 228
    const/high16 v23, 0x40e00000    # 7.0f

    .line 229
    .line 230
    const v24, 0x413a3d71    # 11.64f

    .line 231
    .line 232
    .line 233
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 234
    .line 235
    .line 236
    const/high16 v25, 0x40a00000    # 5.0f

    .line 237
    .line 238
    const/high16 v26, -0x3f600000    # -5.0f

    .line 239
    .line 240
    const/16 v21, 0x0

    .line 241
    .line 242
    const v22, -0x3fcf5c29    # -2.76f

    .line 243
    .line 244
    .line 245
    const v23, 0x400f5c29    # 2.24f

    .line 246
    .line 247
    .line 248
    const/high16 v24, -0x3f600000    # -5.0f

    .line 249
    .line 250
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 251
    .line 252
    .line 253
    const v4, 0x400f5c29    # 2.24f

    .line 254
    .line 255
    .line 256
    const/high16 v6, 0x40a00000    # 5.0f

    .line 257
    .line 258
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 259
    .line 260
    .line 261
    const v25, 0x416f851f    # 14.97f

    .line 262
    .line 263
    .line 264
    const/high16 v26, 0x41600000    # 14.0f

    .line 265
    .line 266
    const/high16 v21, 0x41880000    # 17.0f

    .line 267
    .line 268
    const v22, 0x413a3d71    # 11.64f

    .line 269
    .line 270
    .line 271
    const v23, 0x4181999a    # 16.2f

    .line 272
    .line 273
    .line 274
    const v24, 0x415170a4    # 13.09f

    .line 275
    .line 276
    .line 277
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 278
    .line 279
    .line 280
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 281
    .line 282
    .line 283
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 284
    .line 285
    .line 286
    move-result-object v2

    .line 287
    const/16 v16, 0x3800

    .line 288
    .line 289
    const/16 v17, 0x0

    .line 290
    .line 291
    const v6, 0x3e99999a    # 0.3f

    .line 292
    .line 293
    .line 294
    const v8, 0x3e99999a    # 0.3f

    .line 295
    .line 296
    .line 297
    const/4 v7, 0x0

    .line 298
    const/high16 v9, 0x3f800000    # 1.0f

    .line 299
    .line 300
    const/high16 v12, 0x3f800000    # 1.0f

    .line 301
    .line 302
    const/4 v13, 0x0

    .line 303
    const/4 v14, 0x0

    .line 304
    const/4 v15, 0x0

    .line 305
    const-string v4, ""

    .line 306
    .line 307
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 308
    .line 309
    .line 310
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 311
    .line 312
    .line 313
    move-result v3

    .line 314
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 315
    .line 316
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 317
    .line 318
    .line 319
    move-result-wide v6

    .line 320
    const/4 v2, 0x0

    .line 321
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 322
    .line 323
    .line 324
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 325
    .line 326
    .line 327
    move-result v10

    .line 328
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 329
    .line 330
    .line 331
    move-result v11

    .line 332
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 333
    .line 334
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 335
    .line 336
    .line 337
    const/high16 v4, 0x40000000    # 2.0f

    .line 338
    .line 339
    const/high16 v6, 0x41400000    # 12.0f

    .line 340
    .line 341
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 342
    .line 343
    .line 344
    const/high16 v25, 0x40000000    # 2.0f

    .line 345
    .line 346
    const/high16 v26, 0x41400000    # 12.0f

    .line 347
    .line 348
    const v21, 0x40cf5c29    # 6.48f

    .line 349
    .line 350
    .line 351
    const/high16 v22, 0x40000000    # 2.0f

    .line 352
    .line 353
    const/high16 v23, 0x40000000    # 2.0f

    .line 354
    .line 355
    const v24, 0x40cf5c29    # 6.48f

    .line 356
    .line 357
    .line 358
    move-object/from16 v20, v2

    .line 359
    .line 360
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 361
    .line 362
    .line 363
    const v4, 0x408f5c29    # 4.48f

    .line 364
    .line 365
    .line 366
    const/high16 v6, 0x41200000    # 10.0f

    .line 367
    .line 368
    invoke-virtual {v2, v4, v6, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 369
    .line 370
    .line 371
    const v4, -0x3f70a3d7    # -4.48f

    .line 372
    .line 373
    .line 374
    const/high16 v6, -0x3ee00000    # -10.0f

    .line 375
    .line 376
    const/high16 v7, 0x41200000    # 10.0f

    .line 377
    .line 378
    invoke-virtual {v2, v7, v4, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 379
    .line 380
    .line 381
    const v4, 0x418c28f6    # 17.52f

    .line 382
    .line 383
    .line 384
    const/high16 v6, 0x40000000    # 2.0f

    .line 385
    .line 386
    const/high16 v7, 0x41400000    # 12.0f

    .line 387
    .line 388
    invoke-virtual {v2, v4, v6, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 389
    .line 390
    .line 391
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 392
    .line 393
    .line 394
    const/high16 v4, 0x41a00000    # 20.0f

    .line 395
    .line 396
    const/high16 v6, 0x41400000    # 12.0f

    .line 397
    .line 398
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 399
    .line 400
    .line 401
    const/high16 v25, -0x3f000000    # -8.0f

    .line 402
    .line 403
    const/high16 v26, -0x3f000000    # -8.0f

    .line 404
    .line 405
    const v21, -0x3f72e148    # -4.41f

    .line 406
    .line 407
    .line 408
    const/16 v22, 0x0

    .line 409
    .line 410
    const/high16 v23, -0x3f000000    # -8.0f

    .line 411
    .line 412
    const v24, -0x3f9a3d71    # -3.59f

    .line 413
    .line 414
    .line 415
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 416
    .line 417
    .line 418
    const/high16 v4, -0x3f000000    # -8.0f

    .line 419
    .line 420
    const v6, 0x4065c28f    # 3.59f

    .line 421
    .line 422
    .line 423
    const/high16 v7, 0x41000000    # 8.0f

    .line 424
    .line 425
    invoke-virtual {v2, v6, v4, v7, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 426
    .line 427
    .line 428
    const v4, 0x4065c28f    # 3.59f

    .line 429
    .line 430
    .line 431
    const/high16 v6, 0x41000000    # 8.0f

    .line 432
    .line 433
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 434
    .line 435
    .line 436
    const v4, 0x418347ae    # 16.41f

    .line 437
    .line 438
    .line 439
    const/high16 v6, 0x41a00000    # 20.0f

    .line 440
    .line 441
    const/high16 v7, 0x41400000    # 12.0f

    .line 442
    .line 443
    invoke-virtual {v2, v4, v6, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 444
    .line 445
    .line 446
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 447
    .line 448
    .line 449
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 450
    .line 451
    .line 452
    move-result-object v2

    .line 453
    const/high16 v6, 0x3f800000    # 1.0f

    .line 454
    .line 455
    const/high16 v8, 0x3f800000    # 1.0f

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
    const/high16 v4, 0x41980000    # 19.0f

    .line 491
    .line 492
    const/high16 v6, 0x41400000    # 12.0f

    .line 493
    .line 494
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 495
    .line 496
    .line 497
    const/high16 v25, 0x3fc00000    # 1.5f

    .line 498
    .line 499
    const/high16 v26, -0x40400000    # -1.5f

    .line 500
    .line 501
    const v21, 0x3f547ae1    # 0.83f

    .line 502
    .line 503
    .line 504
    const/high16 v23, 0x3fc00000    # 1.5f

    .line 505
    .line 506
    const v24, -0x40d47ae1    # -0.67f

    .line 507
    .line 508
    .line 509
    move-object/from16 v20, v2

    .line 510
    .line 511
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 512
    .line 513
    .line 514
    const/high16 v4, -0x3fc00000    # -3.0f

    .line 515
    .line 516
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 517
    .line 518
    .line 519
    const/high16 v25, 0x41400000    # 12.0f

    .line 520
    .line 521
    const/high16 v26, 0x41980000    # 19.0f

    .line 522
    .line 523
    const/high16 v21, 0x41280000    # 10.5f

    .line 524
    .line 525
    const v22, 0x4192a3d7    # 18.33f

    .line 526
    .line 527
    .line 528
    const v23, 0x4132b852    # 11.17f

    .line 529
    .line 530
    .line 531
    const/high16 v24, 0x41980000    # 19.0f

    .line 532
    .line 533
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 534
    .line 535
    .line 536
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 537
    .line 538
    .line 539
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 540
    .line 541
    .line 542
    move-result-object v2

    .line 543
    const/high16 v6, 0x3f800000    # 1.0f

    .line 544
    .line 545
    const/4 v7, 0x0

    .line 546
    const-string v4, ""

    .line 547
    .line 548
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 549
    .line 550
    .line 551
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 552
    .line 553
    .line 554
    move-result v3

    .line 555
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 556
    .line 557
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 558
    .line 559
    .line 560
    move-result-wide v6

    .line 561
    const/4 v2, 0x0

    .line 562
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 563
    .line 564
    .line 565
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 566
    .line 567
    .line 568
    move-result v10

    .line 569
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 570
    .line 571
    .line 572
    move-result v11

    .line 573
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 574
    .line 575
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 576
    .line 577
    .line 578
    const/high16 v4, 0x41100000    # 9.0f

    .line 579
    .line 580
    const/high16 v6, 0x41700000    # 15.0f

    .line 581
    .line 582
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 583
    .line 584
    .line 585
    const/high16 v4, 0x40c00000    # 6.0f

    .line 586
    .line 587
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 588
    .line 589
    .line 590
    const/high16 v4, 0x3fc00000    # 1.5f

    .line 591
    .line 592
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 593
    .line 594
    .line 595
    const/high16 v4, -0x3f400000    # -6.0f

    .line 596
    .line 597
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 598
    .line 599
    .line 600
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 601
    .line 602
    .line 603
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 604
    .line 605
    .line 606
    move-result-object v2

    .line 607
    const/high16 v6, 0x3f800000    # 1.0f

    .line 608
    .line 609
    const/4 v7, 0x0

    .line 610
    const-string v4, ""

    .line 611
    .line 612
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 613
    .line 614
    .line 615
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 616
    .line 617
    .line 618
    move-result v3

    .line 619
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 620
    .line 621
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 622
    .line 623
    .line 624
    move-result-wide v6

    .line 625
    const/4 v0, 0x0

    .line 626
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 627
    .line 628
    .line 629
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 630
    .line 631
    .line 632
    move-result v10

    .line 633
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 634
    .line 635
    .line 636
    move-result v11

    .line 637
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 638
    .line 639
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 640
    .line 641
    .line 642
    const/high16 v0, 0x40a00000    # 5.0f

    .line 643
    .line 644
    const/high16 v2, 0x41400000    # 12.0f

    .line 645
    .line 646
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 647
    .line 648
    .line 649
    const/high16 v17, -0x3f600000    # -5.0f

    .line 650
    .line 651
    const/high16 v18, 0x40a00000    # 5.0f

    .line 652
    .line 653
    const v13, -0x3fcf5c29    # -2.76f

    .line 654
    .line 655
    .line 656
    const/high16 v15, -0x3f600000    # -5.0f

    .line 657
    .line 658
    const v16, 0x400f5c29    # 2.24f

    .line 659
    .line 660
    .line 661
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 662
    .line 663
    .line 664
    const v17, 0x4001eb85    # 2.03f

    .line 665
    .line 666
    .line 667
    const/high16 v18, 0x40800000    # 4.0f

    .line 668
    .line 669
    const/4 v13, 0x0

    .line 670
    const v14, 0x3fd1eb85    # 1.64f

    .line 671
    .line 672
    .line 673
    const v15, 0x3f4ccccd    # 0.8f

    .line 674
    .line 675
    .line 676
    const v16, 0x4045c28f    # 3.09f

    .line 677
    .line 678
    .line 679
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 680
    .line 681
    .line 682
    const v0, 0x40be6666    # 5.95f

    .line 683
    .line 684
    .line 685
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 686
    .line 687
    .line 688
    const/high16 v17, 0x41880000    # 17.0f

    .line 689
    .line 690
    const/high16 v18, 0x41200000    # 10.0f

    .line 691
    .line 692
    const v13, 0x4181999a    # 16.2f

    .line 693
    .line 694
    .line 695
    const v14, 0x415170a4    # 13.09f

    .line 696
    .line 697
    .line 698
    const/high16 v15, 0x41880000    # 17.0f

    .line 699
    .line 700
    const v16, 0x413a3d71    # 11.64f

    .line 701
    .line 702
    .line 703
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 704
    .line 705
    .line 706
    const/high16 v17, 0x41400000    # 12.0f

    .line 707
    .line 708
    const/high16 v18, 0x40a00000    # 5.0f

    .line 709
    .line 710
    const/high16 v13, 0x41880000    # 17.0f

    .line 711
    .line 712
    const v14, 0x40e7ae14    # 7.24f

    .line 713
    .line 714
    .line 715
    const v15, 0x416c28f6    # 14.76f

    .line 716
    .line 717
    .line 718
    const/high16 v16, 0x40a00000    # 5.0f

    .line 719
    .line 720
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 721
    .line 722
    .line 723
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 724
    .line 725
    .line 726
    const v0, 0x4166e148    # 14.43f

    .line 727
    .line 728
    .line 729
    const/high16 v2, 0x41480000    # 12.5f

    .line 730
    .line 731
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 732
    .line 733
    .line 734
    const v0, 0x41191eb8    # 9.57f

    .line 735
    .line 736
    .line 737
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 738
    .line 739
    .line 740
    const/high16 v17, 0x41080000    # 8.5f

    .line 741
    .line 742
    const/high16 v18, 0x41200000    # 10.0f

    .line 743
    .line 744
    const v13, 0x410e3d71    # 8.89f

    .line 745
    .line 746
    .line 747
    const v14, 0x413d70a4    # 11.84f

    .line 748
    .line 749
    .line 750
    const/high16 v15, 0x41080000    # 8.5f

    .line 751
    .line 752
    const v16, 0x412f3333    # 10.95f

    .line 753
    .line 754
    .line 755
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 756
    .line 757
    .line 758
    const/high16 v17, 0x40600000    # 3.5f

    .line 759
    .line 760
    const/high16 v18, -0x3fa00000    # -3.5f

    .line 761
    .line 762
    const/4 v13, 0x0

    .line 763
    const v14, -0x4008f5c3    # -1.93f

    .line 764
    .line 765
    .line 766
    const v15, 0x3fc8f5c3    # 1.57f

    .line 767
    .line 768
    .line 769
    const/high16 v16, -0x3fa00000    # -3.5f

    .line 770
    .line 771
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 772
    .line 773
    .line 774
    const v0, 0x3fc8f5c3    # 1.57f

    .line 775
    .line 776
    .line 777
    const/high16 v2, 0x40600000    # 3.5f

    .line 778
    .line 779
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 780
    .line 781
    .line 782
    const v17, 0x4166e148    # 14.43f

    .line 783
    .line 784
    .line 785
    const/high16 v18, 0x41480000    # 12.5f

    .line 786
    .line 787
    const/high16 v13, 0x41780000    # 15.5f

    .line 788
    .line 789
    const v14, 0x412f3333    # 10.95f

    .line 790
    .line 791
    .line 792
    const v15, 0x4171c28f    # 15.11f

    .line 793
    .line 794
    .line 795
    const v16, 0x413d70a4    # 11.84f

    .line 796
    .line 797
    .line 798
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 799
    .line 800
    .line 801
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 802
    .line 803
    .line 804
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 805
    .line 806
    .line 807
    move-result-object v2

    .line 808
    const/16 v16, 0x3800

    .line 809
    .line 810
    const/16 v17, 0x0

    .line 811
    .line 812
    const/high16 v6, 0x3f800000    # 1.0f

    .line 813
    .line 814
    const/4 v7, 0x0

    .line 815
    const/high16 v12, 0x3f800000    # 1.0f

    .line 816
    .line 817
    const/4 v13, 0x0

    .line 818
    const/4 v14, 0x0

    .line 819
    const/4 v15, 0x0

    .line 820
    const-string v4, ""

    .line 821
    .line 822
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 823
    .line 824
    .line 825
    move-result-object v0

    .line 826
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 827
    .line 828
    .line 829
    move-result-object v0

    .line 830
    sput-object v0, Landroidx/compose/material/icons/twotone/LightbulbCircleKt;->_lightbulbCircle:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 831
    .line 832
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 833
    .line 834
    .line 835
    return-object v0
.end method
