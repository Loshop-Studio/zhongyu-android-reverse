.class public final Landroidx/compose/material/icons/twotone/CircleNotificationsKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_circleNotifications",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "CircleNotifications",
        "Landroidx/compose/material/icons/Icons$TwoTone;",
        "getCircleNotifications",
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
        "SMAP\nCircleNotifications.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CircleNotifications.kt\nandroidx/compose/material/icons/twotone/CircleNotificationsKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,104:1\n212#2,12:105\n233#2,18:118\n253#2:155\n233#2,18:156\n253#2:193\n174#3:117\n705#4,2:136\n717#4,2:138\n719#4,11:144\n705#4,2:174\n717#4,2:176\n719#4,11:182\n72#5,4:140\n72#5,4:178\n*S KotlinDebug\n*F\n+ 1 CircleNotifications.kt\nandroidx/compose/material/icons/twotone/CircleNotificationsKt\n*L\n29#1:105,12\n30#1:118,18\n30#1:155\n58#1:156,18\n58#1:193\n29#1:117\n30#1:136,2\n30#1:138,2\n30#1:144,11\n58#1:174,2\n58#1:176,2\n58#1:182,11\n30#1:140,4\n58#1:178,4\n*E\n"
    }
.end annotation


# static fields
.field private static _circleNotifications:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getCircleNotifications(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/CircleNotificationsKt;->_circleNotifications:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.CircleNotifications"

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
    const/high16 v25, 0x41000000    # 8.0f

    .line 105
    .line 106
    const/high16 v26, -0x3f000000    # -8.0f

    .line 107
    .line 108
    const v21, 0x408d1eb8    # 4.41f

    .line 109
    .line 110
    .line 111
    const/high16 v23, 0x41000000    # 8.0f

    .line 112
    .line 113
    const v24, -0x3f9a3d71    # -3.59f

    .line 114
    .line 115
    .line 116
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 117
    .line 118
    .line 119
    const v4, 0x418347ae    # 16.41f

    .line 120
    .line 121
    .line 122
    const/high16 v6, 0x40800000    # 4.0f

    .line 123
    .line 124
    const/high16 v7, 0x41400000    # 12.0f

    .line 125
    .line 126
    invoke-virtual {v2, v4, v6, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 127
    .line 128
    .line 129
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 130
    .line 131
    .line 132
    const/high16 v4, 0x41940000    # 18.5f

    .line 133
    .line 134
    const/high16 v6, 0x41400000    # 12.0f

    .line 135
    .line 136
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 137
    .line 138
    .line 139
    const/high16 v25, -0x40400000    # -1.5f

    .line 140
    .line 141
    const/high16 v26, -0x40400000    # -1.5f

    .line 142
    .line 143
    const v21, -0x40ab851f    # -0.83f

    .line 144
    .line 145
    .line 146
    const/high16 v23, -0x40400000    # -1.5f

    .line 147
    .line 148
    const v24, -0x40d47ae1    # -0.67f

    .line 149
    .line 150
    .line 151
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 152
    .line 153
    .line 154
    const/high16 v4, 0x40400000    # 3.0f

    .line 155
    .line 156
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 157
    .line 158
    .line 159
    const/high16 v25, 0x41400000    # 12.0f

    .line 160
    .line 161
    const/high16 v26, 0x41940000    # 18.5f

    .line 162
    .line 163
    const/high16 v21, 0x41580000    # 13.5f

    .line 164
    .line 165
    const v22, 0x418ea3d7    # 17.83f

    .line 166
    .line 167
    .line 168
    const v23, 0x414d47ae    # 12.83f

    .line 169
    .line 170
    .line 171
    const/high16 v24, 0x41940000    # 18.5f

    .line 172
    .line 173
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 174
    .line 175
    .line 176
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 177
    .line 178
    .line 179
    const/high16 v4, 0x41880000    # 17.0f

    .line 180
    .line 181
    const/high16 v6, 0x41800000    # 16.0f

    .line 182
    .line 183
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 184
    .line 185
    .line 186
    const/high16 v4, 0x40e00000    # 7.0f

    .line 187
    .line 188
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 189
    .line 190
    .line 191
    const/high16 v4, -0x40000000    # -2.0f

    .line 192
    .line 193
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 194
    .line 195
    .line 196
    const/high16 v4, 0x3f800000    # 1.0f

    .line 197
    .line 198
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 199
    .line 200
    .line 201
    const v4, -0x3fd8f5c3    # -2.61f

    .line 202
    .line 203
    .line 204
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 205
    .line 206
    .line 207
    const/high16 v25, 0x41300000    # 11.0f

    .line 208
    .line 209
    const/high16 v26, 0x40e00000    # 7.0f

    .line 210
    .line 211
    const/high16 v21, 0x41000000    # 8.0f

    .line 212
    .line 213
    const v22, 0x411451ec    # 9.27f

    .line 214
    .line 215
    .line 216
    const v23, 0x41107ae1    # 9.03f

    .line 217
    .line 218
    .line 219
    const v24, 0x40ef0a3d    # 7.47f

    .line 220
    .line 221
    .line 222
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 223
    .line 224
    .line 225
    const/high16 v4, 0x40d00000    # 6.5f

    .line 226
    .line 227
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 228
    .line 229
    .line 230
    const/high16 v25, 0x3f800000    # 1.0f

    .line 231
    .line 232
    const/high16 v26, -0x40800000    # -1.0f

    .line 233
    .line 234
    const/16 v21, 0x0

    .line 235
    .line 236
    const v22, -0x40ee147b    # -0.57f

    .line 237
    .line 238
    .line 239
    const v23, 0x3edc28f6    # 0.43f

    .line 240
    .line 241
    .line 242
    const/high16 v24, -0x40800000    # -1.0f

    .line 243
    .line 244
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 245
    .line 246
    .line 247
    const v4, 0x3edc28f6    # 0.43f

    .line 248
    .line 249
    .line 250
    const/high16 v6, 0x3f800000    # 1.0f

    .line 251
    .line 252
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 253
    .line 254
    .line 255
    const/high16 v4, 0x40e00000    # 7.0f

    .line 256
    .line 257
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 258
    .line 259
    .line 260
    const/high16 v25, 0x40400000    # 3.0f

    .line 261
    .line 262
    const v26, 0x408c7ae1    # 4.39f

    .line 263
    .line 264
    .line 265
    const v21, 0x3ffc28f6    # 1.97f

    .line 266
    .line 267
    .line 268
    const v22, 0x3ef0a3d7    # 0.47f

    .line 269
    .line 270
    .line 271
    const/high16 v23, 0x40400000    # 3.0f

    .line 272
    .line 273
    const v24, 0x4011eb85    # 2.28f

    .line 274
    .line 275
    .line 276
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 277
    .line 278
    .line 279
    const/high16 v4, 0x41600000    # 14.0f

    .line 280
    .line 281
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 282
    .line 283
    .line 284
    const/high16 v4, 0x3f800000    # 1.0f

    .line 285
    .line 286
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 287
    .line 288
    .line 289
    const/high16 v4, 0x41800000    # 16.0f

    .line 290
    .line 291
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 292
    .line 293
    .line 294
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 295
    .line 296
    .line 297
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 298
    .line 299
    .line 300
    move-result-object v2

    .line 301
    const/16 v16, 0x3800

    .line 302
    .line 303
    const/16 v17, 0x0

    .line 304
    .line 305
    const v6, 0x3e99999a    # 0.3f

    .line 306
    .line 307
    .line 308
    const v8, 0x3e99999a    # 0.3f

    .line 309
    .line 310
    .line 311
    const/4 v7, 0x0

    .line 312
    const/high16 v9, 0x3f800000    # 1.0f

    .line 313
    .line 314
    const/high16 v12, 0x3f800000    # 1.0f

    .line 315
    .line 316
    const/4 v13, 0x0

    .line 317
    const/4 v14, 0x0

    .line 318
    const/4 v15, 0x0

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
    const/4 v0, 0x0

    .line 335
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

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
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 347
    .line 348
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 349
    .line 350
    .line 351
    const/high16 v0, 0x41940000    # 18.5f

    .line 352
    .line 353
    const/high16 v2, 0x41400000    # 12.0f

    .line 354
    .line 355
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 356
    .line 357
    .line 358
    const/high16 v17, 0x3fc00000    # 1.5f

    .line 359
    .line 360
    const/high16 v18, -0x40400000    # -1.5f

    .line 361
    .line 362
    const v13, 0x3f547ae1    # 0.83f

    .line 363
    .line 364
    .line 365
    const/high16 v15, 0x3fc00000    # 1.5f

    .line 366
    .line 367
    const v16, -0x40d47ae1    # -0.67f

    .line 368
    .line 369
    .line 370
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 371
    .line 372
    .line 373
    const/high16 v0, -0x3fc00000    # -3.0f

    .line 374
    .line 375
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 376
    .line 377
    .line 378
    const/high16 v17, 0x41400000    # 12.0f

    .line 379
    .line 380
    const/high16 v18, 0x41940000    # 18.5f

    .line 381
    .line 382
    const/high16 v13, 0x41280000    # 10.5f

    .line 383
    .line 384
    const v14, 0x418ea3d7    # 17.83f

    .line 385
    .line 386
    .line 387
    const v15, 0x4132b852    # 11.17f

    .line 388
    .line 389
    .line 390
    const/high16 v16, 0x41940000    # 18.5f

    .line 391
    .line 392
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 393
    .line 394
    .line 395
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 396
    .line 397
    .line 398
    const/high16 v0, 0x40000000    # 2.0f

    .line 399
    .line 400
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 401
    .line 402
    .line 403
    const/high16 v17, 0x40000000    # 2.0f

    .line 404
    .line 405
    const/high16 v18, 0x41400000    # 12.0f

    .line 406
    .line 407
    const v13, 0x40cf5c29    # 6.48f

    .line 408
    .line 409
    .line 410
    const/high16 v14, 0x40000000    # 2.0f

    .line 411
    .line 412
    const/high16 v15, 0x40000000    # 2.0f

    .line 413
    .line 414
    const v16, 0x40cf5c29    # 6.48f

    .line 415
    .line 416
    .line 417
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 418
    .line 419
    .line 420
    const v0, 0x408f5c29    # 4.48f

    .line 421
    .line 422
    .line 423
    const/high16 v2, 0x41200000    # 10.0f

    .line 424
    .line 425
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 426
    .line 427
    .line 428
    const/high16 v17, 0x41200000    # 10.0f

    .line 429
    .line 430
    const/high16 v18, -0x3ee00000    # -10.0f

    .line 431
    .line 432
    const v13, 0x40b0a3d7    # 5.52f

    .line 433
    .line 434
    .line 435
    const/4 v14, 0x0

    .line 436
    const/high16 v15, 0x41200000    # 10.0f

    .line 437
    .line 438
    const v16, -0x3f70a3d7    # -4.48f

    .line 439
    .line 440
    .line 441
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 442
    .line 443
    .line 444
    const v0, 0x418c28f6    # 17.52f

    .line 445
    .line 446
    .line 447
    const/high16 v2, 0x40000000    # 2.0f

    .line 448
    .line 449
    const/high16 v4, 0x41400000    # 12.0f

    .line 450
    .line 451
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 452
    .line 453
    .line 454
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 455
    .line 456
    .line 457
    const/high16 v0, 0x41a00000    # 20.0f

    .line 458
    .line 459
    const/high16 v2, 0x41400000    # 12.0f

    .line 460
    .line 461
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 462
    .line 463
    .line 464
    const/high16 v17, -0x3f000000    # -8.0f

    .line 465
    .line 466
    const/high16 v18, -0x3f000000    # -8.0f

    .line 467
    .line 468
    const v13, -0x3f72e148    # -4.41f

    .line 469
    .line 470
    .line 471
    const/high16 v15, -0x3f000000    # -8.0f

    .line 472
    .line 473
    const v16, -0x3f9a3d71    # -3.59f

    .line 474
    .line 475
    .line 476
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 477
    .line 478
    .line 479
    const/high16 v0, -0x3f000000    # -8.0f

    .line 480
    .line 481
    const v2, 0x4065c28f    # 3.59f

    .line 482
    .line 483
    .line 484
    const/high16 v4, 0x41000000    # 8.0f

    .line 485
    .line 486
    invoke-virtual {v12, v2, v0, v4, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 487
    .line 488
    .line 489
    const/high16 v17, 0x41000000    # 8.0f

    .line 490
    .line 491
    const/high16 v18, 0x41000000    # 8.0f

    .line 492
    .line 493
    const v13, 0x408d1eb8    # 4.41f

    .line 494
    .line 495
    .line 496
    const/high16 v15, 0x41000000    # 8.0f

    .line 497
    .line 498
    const v16, 0x4065c28f    # 3.59f

    .line 499
    .line 500
    .line 501
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 502
    .line 503
    .line 504
    const v0, 0x418347ae    # 16.41f

    .line 505
    .line 506
    .line 507
    const/high16 v2, 0x41a00000    # 20.0f

    .line 508
    .line 509
    const/high16 v4, 0x41400000    # 12.0f

    .line 510
    .line 511
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 512
    .line 513
    .line 514
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 515
    .line 516
    .line 517
    const v0, 0x41363d71    # 11.39f

    .line 518
    .line 519
    .line 520
    const/high16 v2, 0x41800000    # 16.0f

    .line 521
    .line 522
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 523
    .line 524
    .line 525
    const/high16 v17, -0x3fc00000    # -3.0f

    .line 526
    .line 527
    const v18, -0x3f73851f    # -4.39f

    .line 528
    .line 529
    .line 530
    const/4 v13, 0x0

    .line 531
    const v14, -0x3ff8f5c3    # -2.11f

    .line 532
    .line 533
    .line 534
    const v15, -0x407c28f6    # -1.03f

    .line 535
    .line 536
    .line 537
    const v16, -0x3f851eb8    # -3.92f

    .line 538
    .line 539
    .line 540
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 541
    .line 542
    .line 543
    const/high16 v0, 0x40d00000    # 6.5f

    .line 544
    .line 545
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 546
    .line 547
    .line 548
    const/high16 v17, -0x40800000    # -1.0f

    .line 549
    .line 550
    const/high16 v18, -0x40800000    # -1.0f

    .line 551
    .line 552
    const v14, -0x40ee147b    # -0.57f

    .line 553
    .line 554
    .line 555
    const v15, -0x4123d70a    # -0.43f

    .line 556
    .line 557
    .line 558
    const/high16 v16, -0x40800000    # -1.0f

    .line 559
    .line 560
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 561
    .line 562
    .line 563
    const v0, 0x3edc28f6    # 0.43f

    .line 564
    .line 565
    .line 566
    const/high16 v2, -0x40800000    # -1.0f

    .line 567
    .line 568
    const/high16 v4, 0x3f800000    # 1.0f

    .line 569
    .line 570
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 571
    .line 572
    .line 573
    const/high16 v0, 0x40e00000    # 7.0f

    .line 574
    .line 575
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 576
    .line 577
    .line 578
    const/high16 v17, -0x3fc00000    # -3.0f

    .line 579
    .line 580
    const v18, 0x408c7ae1    # 4.39f

    .line 581
    .line 582
    .line 583
    const v13, -0x4003d70a    # -1.97f

    .line 584
    .line 585
    .line 586
    const v14, 0x3ef0a3d7    # 0.47f

    .line 587
    .line 588
    .line 589
    const/high16 v15, -0x3fc00000    # -3.0f

    .line 590
    .line 591
    const v16, 0x401147ae    # 2.27f

    .line 592
    .line 593
    .line 594
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 595
    .line 596
    .line 597
    const/high16 v0, 0x41600000    # 14.0f

    .line 598
    .line 599
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 600
    .line 601
    .line 602
    const/high16 v0, 0x40e00000    # 7.0f

    .line 603
    .line 604
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 605
    .line 606
    .line 607
    const/high16 v0, 0x40000000    # 2.0f

    .line 608
    .line 609
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 610
    .line 611
    .line 612
    const/high16 v0, 0x41200000    # 10.0f

    .line 613
    .line 614
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 615
    .line 616
    .line 617
    const/high16 v0, -0x40000000    # -2.0f

    .line 618
    .line 619
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 620
    .line 621
    .line 622
    const/high16 v0, -0x40800000    # -1.0f

    .line 623
    .line 624
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 625
    .line 626
    .line 627
    const v0, 0x41363d71    # 11.39f

    .line 628
    .line 629
    .line 630
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 631
    .line 632
    .line 633
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 634
    .line 635
    .line 636
    const/high16 v0, 0x41600000    # 14.0f

    .line 637
    .line 638
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 639
    .line 640
    .line 641
    const/high16 v0, -0x3f800000    # -4.0f

    .line 642
    .line 643
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 644
    .line 645
    .line 646
    const/high16 v0, -0x3fc00000    # -3.0f

    .line 647
    .line 648
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 649
    .line 650
    .line 651
    const/high16 v17, 0x40000000    # 2.0f

    .line 652
    .line 653
    const/high16 v18, -0x40000000    # -2.0f

    .line 654
    .line 655
    const/4 v13, 0x0

    .line 656
    const v14, -0x40733333    # -1.1f

    .line 657
    .line 658
    .line 659
    const v15, 0x3f666666    # 0.9f

    .line 660
    .line 661
    .line 662
    const/high16 v16, -0x40000000    # -2.0f

    .line 663
    .line 664
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 665
    .line 666
    .line 667
    const v0, 0x3f666666    # 0.9f

    .line 668
    .line 669
    .line 670
    const/high16 v2, 0x40000000    # 2.0f

    .line 671
    .line 672
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 673
    .line 674
    .line 675
    const/high16 v0, 0x41600000    # 14.0f

    .line 676
    .line 677
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 678
    .line 679
    .line 680
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 681
    .line 682
    .line 683
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 684
    .line 685
    .line 686
    move-result-object v2

    .line 687
    const/16 v16, 0x3800

    .line 688
    .line 689
    const/16 v17, 0x0

    .line 690
    .line 691
    const/high16 v6, 0x3f800000    # 1.0f

    .line 692
    .line 693
    const/high16 v8, 0x3f800000    # 1.0f

    .line 694
    .line 695
    const/4 v7, 0x0

    .line 696
    const/high16 v12, 0x3f800000    # 1.0f

    .line 697
    .line 698
    const/4 v14, 0x0

    .line 699
    const/4 v15, 0x0

    .line 700
    const-string v4, ""

    .line 701
    .line 702
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 703
    .line 704
    .line 705
    move-result-object v0

    .line 706
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 707
    .line 708
    .line 709
    move-result-object v0

    .line 710
    sput-object v0, Landroidx/compose/material/icons/twotone/CircleNotificationsKt;->_circleNotifications:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 711
    .line 712
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 713
    .line 714
    .line 715
    return-object v0
.end method
