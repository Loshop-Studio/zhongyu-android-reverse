.class public final Landroidx/compose/material/icons/twotone/DirectionsBusKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_directionsBus",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "DirectionsBus",
        "Landroidx/compose/material/icons/Icons$TwoTone;",
        "getDirectionsBus",
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
        "SMAP\nDirectionsBus.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DirectionsBus.kt\nandroidx/compose/material/icons/twotone/DirectionsBusKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,119:1\n212#2,12:120\n233#2,18:133\n253#2:170\n233#2,18:171\n253#2:208\n233#2,18:209\n253#2:246\n233#2,18:247\n253#2:284\n174#3:132\n705#4,2:151\n717#4,2:153\n719#4,11:159\n705#4,2:189\n717#4,2:191\n719#4,11:197\n705#4,2:227\n717#4,2:229\n719#4,11:235\n705#4,2:265\n717#4,2:267\n719#4,11:273\n72#5,4:155\n72#5,4:193\n72#5,4:231\n72#5,4:269\n*S KotlinDebug\n*F\n+ 1 DirectionsBus.kt\nandroidx/compose/material/icons/twotone/DirectionsBusKt\n*L\n29#1:120,12\n30#1:133,18\n30#1:170\n59#1:171,18\n59#1:208\n102#1:209,18\n102#1:246\n108#1:247,18\n108#1:284\n29#1:132\n30#1:151,2\n30#1:153,2\n30#1:159,11\n59#1:189,2\n59#1:191,2\n59#1:197,11\n102#1:227,2\n102#1:229,2\n102#1:235,11\n108#1:265,2\n108#1:267,2\n108#1:273,11\n30#1:155,4\n59#1:193,4\n102#1:231,4\n108#1:269,4\n*E\n"
    }
.end annotation


# static fields
.field private static _directionsBus:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getDirectionsBus(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 28

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/DirectionsBusKt;->_directionsBus:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.DirectionsBus"

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
    const v4, 0x418af5c3    # 17.37f

    .line 71
    .line 72
    .line 73
    const/high16 v6, 0x41880000    # 17.0f

    .line 74
    .line 75
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    const v4, -0x4175c28f    # -0.27f

    .line 79
    .line 80
    .line 81
    const v6, 0x3e947ae1    # 0.29f

    .line 82
    .line 83
    .line 84
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 85
    .line 86
    .line 87
    const v25, 0x3eae147b    # 0.34f

    .line 88
    .line 89
    .line 90
    const v26, -0x40c51eb8    # -0.73f

    .line 91
    .line 92
    .line 93
    const v21, 0x3e051eb8    # 0.13f

    .line 94
    .line 95
    .line 96
    const v22, -0x421eb852    # -0.11f

    .line 97
    .line 98
    .line 99
    const v23, 0x3eae147b    # 0.34f

    .line 100
    .line 101
    .line 102
    const v24, -0x4147ae14    # -0.36f

    .line 103
    .line 104
    .line 105
    move-object/from16 v20, v2

    .line 106
    .line 107
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 108
    .line 109
    .line 110
    const/high16 v4, -0x3f800000    # -4.0f

    .line 111
    .line 112
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 113
    .line 114
    .line 115
    const/high16 v4, 0x40c00000    # 6.0f

    .line 116
    .line 117
    const/high16 v6, 0x41400000    # 12.0f

    .line 118
    .line 119
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 120
    .line 121
    .line 122
    const/high16 v4, 0x40800000    # 4.0f

    .line 123
    .line 124
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 125
    .line 126
    .line 127
    const v26, 0x3f3ae148    # 0.73f

    .line 128
    .line 129
    .line 130
    const/16 v21, 0x0

    .line 131
    .line 132
    const v22, 0x3ebd70a4    # 0.37f

    .line 133
    .line 134
    .line 135
    const v23, 0x3e570a3d    # 0.21f

    .line 136
    .line 137
    .line 138
    const v24, 0x3f1eb852    # 0.62f

    .line 139
    .line 140
    .line 141
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 142
    .line 143
    .line 144
    const v4, 0x3e8a3d71    # 0.27f

    .line 145
    .line 146
    .line 147
    const v6, 0x3e947ae1    # 0.29f

    .line 148
    .line 149
    .line 150
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 151
    .line 152
    .line 153
    const v4, 0x412bd70a    # 10.74f

    .line 154
    .line 155
    .line 156
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 157
    .line 158
    .line 159
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 160
    .line 161
    .line 162
    const/high16 v4, 0x41800000    # 16.0f

    .line 163
    .line 164
    const/high16 v6, 0x41080000    # 8.5f

    .line 165
    .line 166
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 167
    .line 168
    .line 169
    const/high16 v25, -0x40400000    # -1.5f

    .line 170
    .line 171
    const/high16 v26, -0x40400000    # -1.5f

    .line 172
    .line 173
    const v21, -0x40ab851f    # -0.83f

    .line 174
    .line 175
    .line 176
    const/16 v22, 0x0

    .line 177
    .line 178
    const/high16 v23, -0x40400000    # -1.5f

    .line 179
    .line 180
    const v24, -0x40d47ae1    # -0.67f

    .line 181
    .line 182
    .line 183
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 184
    .line 185
    .line 186
    const v4, 0x40f570a4    # 7.67f

    .line 187
    .line 188
    .line 189
    const/high16 v6, 0x41500000    # 13.0f

    .line 190
    .line 191
    const/high16 v7, 0x41080000    # 8.5f

    .line 192
    .line 193
    invoke-virtual {v2, v4, v6, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 194
    .line 195
    .line 196
    const v4, 0x3f2b851f    # 0.67f

    .line 197
    .line 198
    .line 199
    const/high16 v6, 0x3fc00000    # 1.5f

    .line 200
    .line 201
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 202
    .line 203
    .line 204
    const v4, 0x411547ae    # 9.33f

    .line 205
    .line 206
    .line 207
    const/high16 v6, 0x41800000    # 16.0f

    .line 208
    .line 209
    invoke-virtual {v2, v4, v6, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 210
    .line 211
    .line 212
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 213
    .line 214
    .line 215
    const/high16 v4, 0x41600000    # 14.0f

    .line 216
    .line 217
    const/high16 v6, 0x41680000    # 14.5f

    .line 218
    .line 219
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 220
    .line 221
    .line 222
    const/high16 v25, 0x3fc00000    # 1.5f

    .line 223
    .line 224
    const/16 v21, 0x0

    .line 225
    .line 226
    const v22, -0x40ab851f    # -0.83f

    .line 227
    .line 228
    .line 229
    const v23, 0x3f2b851f    # 0.67f

    .line 230
    .line 231
    .line 232
    const/high16 v24, -0x40400000    # -1.5f

    .line 233
    .line 234
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 235
    .line 236
    .line 237
    const v4, 0x3f2b851f    # 0.67f

    .line 238
    .line 239
    .line 240
    const/high16 v6, 0x3fc00000    # 1.5f

    .line 241
    .line 242
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 243
    .line 244
    .line 245
    const v4, -0x40d47ae1    # -0.67f

    .line 246
    .line 247
    .line 248
    const/high16 v6, -0x40400000    # -1.5f

    .line 249
    .line 250
    const/high16 v7, 0x3fc00000    # 1.5f

    .line 251
    .line 252
    invoke-virtual {v2, v4, v7, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 253
    .line 254
    .line 255
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 256
    .line 257
    .line 258
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 259
    .line 260
    .line 261
    const/high16 v4, 0x40800000    # 4.0f

    .line 262
    .line 263
    const/high16 v6, 0x41400000    # 12.0f

    .line 264
    .line 265
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 266
    .line 267
    .line 268
    const v25, -0x3f4ae148    # -5.66f

    .line 269
    .line 270
    .line 271
    const v26, 0x3f7d70a4    # 0.99f

    .line 272
    .line 273
    .line 274
    const v21, -0x3f93d70a    # -3.69f

    .line 275
    .line 276
    .line 277
    const/16 v22, 0x0

    .line 278
    .line 279
    const v23, -0x3f5c7ae1    # -5.11f

    .line 280
    .line 281
    .line 282
    const v24, 0x3eeb851f    # 0.46f

    .line 283
    .line 284
    .line 285
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 286
    .line 287
    .line 288
    const v4, 0x4134f5c3    # 11.31f

    .line 289
    .line 290
    .line 291
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 292
    .line 293
    .line 294
    const/high16 v25, 0x41400000    # 12.0f

    .line 295
    .line 296
    const/high16 v26, 0x40800000    # 4.0f

    .line 297
    .line 298
    const v21, 0x4188e148    # 17.11f

    .line 299
    .line 300
    .line 301
    const v22, 0x408eb852    # 4.46f

    .line 302
    .line 303
    .line 304
    const v23, 0x417b0a3d    # 15.69f

    .line 305
    .line 306
    .line 307
    const/high16 v24, 0x40800000    # 4.0f

    .line 308
    .line 309
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 310
    .line 311
    .line 312
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 313
    .line 314
    .line 315
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 316
    .line 317
    .line 318
    move-result-object v2

    .line 319
    const/16 v16, 0x3800

    .line 320
    .line 321
    const/16 v17, 0x0

    .line 322
    .line 323
    const v6, 0x3e99999a    # 0.3f

    .line 324
    .line 325
    .line 326
    const v8, 0x3e99999a    # 0.3f

    .line 327
    .line 328
    .line 329
    const/4 v7, 0x0

    .line 330
    const/high16 v9, 0x3f800000    # 1.0f

    .line 331
    .line 332
    const/high16 v12, 0x3f800000    # 1.0f

    .line 333
    .line 334
    const/4 v13, 0x0

    .line 335
    const/4 v14, 0x0

    .line 336
    const/4 v15, 0x0

    .line 337
    const-string v4, ""

    .line 338
    .line 339
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 340
    .line 341
    .line 342
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 343
    .line 344
    .line 345
    move-result v3

    .line 346
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 347
    .line 348
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 349
    .line 350
    .line 351
    move-result-wide v6

    .line 352
    const/4 v2, 0x0

    .line 353
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 354
    .line 355
    .line 356
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 357
    .line 358
    .line 359
    move-result v10

    .line 360
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 361
    .line 362
    .line 363
    move-result v11

    .line 364
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 365
    .line 366
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 367
    .line 368
    .line 369
    const/high16 v4, 0x41a80000    # 21.0f

    .line 370
    .line 371
    const/high16 v6, 0x41880000    # 17.0f

    .line 372
    .line 373
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 374
    .line 375
    .line 376
    const/high16 v4, 0x3f800000    # 1.0f

    .line 377
    .line 378
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 379
    .line 380
    .line 381
    const/high16 v25, 0x3f800000    # 1.0f

    .line 382
    .line 383
    const/high16 v26, -0x40800000    # -1.0f

    .line 384
    .line 385
    const v21, 0x3f0ccccd    # 0.55f

    .line 386
    .line 387
    .line 388
    const/16 v22, 0x0

    .line 389
    .line 390
    const/high16 v23, 0x3f800000    # 1.0f

    .line 391
    .line 392
    const v24, -0x4119999a    # -0.45f

    .line 393
    .line 394
    .line 395
    move-object/from16 v20, v2

    .line 396
    .line 397
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 398
    .line 399
    .line 400
    const v4, -0x401c28f6    # -1.78f

    .line 401
    .line 402
    .line 403
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 404
    .line 405
    .line 406
    const v26, -0x3ff1eb85    # -2.22f

    .line 407
    .line 408
    .line 409
    const v21, 0x3f1c28f6    # 0.61f

    .line 410
    .line 411
    .line 412
    const v22, -0x40f33333    # -0.55f

    .line 413
    .line 414
    .line 415
    const v24, -0x40547ae1    # -1.34f

    .line 416
    .line 417
    .line 418
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 419
    .line 420
    .line 421
    const/high16 v4, 0x40c00000    # 6.0f

    .line 422
    .line 423
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 424
    .line 425
    .line 426
    const/high16 v25, -0x3f000000    # -8.0f

    .line 427
    .line 428
    const/high16 v26, -0x3f800000    # -4.0f

    .line 429
    .line 430
    const/16 v21, 0x0

    .line 431
    .line 432
    const/high16 v22, -0x3fa00000    # -3.5f

    .line 433
    .line 434
    const v23, -0x3f9ae148    # -3.58f

    .line 435
    .line 436
    .line 437
    const/high16 v24, -0x3f800000    # -4.0f

    .line 438
    .line 439
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 440
    .line 441
    .line 442
    const/high16 v4, 0x3f000000    # 0.5f

    .line 443
    .line 444
    const/high16 v6, -0x3f000000    # -8.0f

    .line 445
    .line 446
    const/high16 v7, 0x40800000    # 4.0f

    .line 447
    .line 448
    invoke-virtual {v2, v6, v4, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 449
    .line 450
    .line 451
    const/high16 v4, 0x41200000    # 10.0f

    .line 452
    .line 453
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 454
    .line 455
    .line 456
    const/high16 v25, 0x3f800000    # 1.0f

    .line 457
    .line 458
    const v26, 0x400e147b    # 2.22f

    .line 459
    .line 460
    .line 461
    const v22, 0x3f6147ae    # 0.88f

    .line 462
    .line 463
    .line 464
    const v23, 0x3ec7ae14    # 0.39f

    .line 465
    .line 466
    .line 467
    const v24, 0x3fd5c28f    # 1.67f

    .line 468
    .line 469
    .line 470
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 471
    .line 472
    .line 473
    const/high16 v4, 0x41a00000    # 20.0f

    .line 474
    .line 475
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 476
    .line 477
    .line 478
    const/high16 v26, 0x3f800000    # 1.0f

    .line 479
    .line 480
    const v22, 0x3f0ccccd    # 0.55f

    .line 481
    .line 482
    .line 483
    const v23, 0x3ee66666    # 0.45f

    .line 484
    .line 485
    .line 486
    const/high16 v24, 0x3f800000    # 1.0f

    .line 487
    .line 488
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 489
    .line 490
    .line 491
    const/high16 v4, 0x3f800000    # 1.0f

    .line 492
    .line 493
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 494
    .line 495
    .line 496
    const/high16 v26, -0x40800000    # -1.0f

    .line 497
    .line 498
    const v21, 0x3f0ccccd    # 0.55f

    .line 499
    .line 500
    .line 501
    const/16 v22, 0x0

    .line 502
    .line 503
    const/high16 v23, 0x3f800000    # 1.0f

    .line 504
    .line 505
    const v24, -0x4119999a    # -0.45f

    .line 506
    .line 507
    .line 508
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 509
    .line 510
    .line 511
    const/high16 v4, -0x40800000    # -1.0f

    .line 512
    .line 513
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 514
    .line 515
    .line 516
    const/high16 v4, 0x41000000    # 8.0f

    .line 517
    .line 518
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 519
    .line 520
    .line 521
    const/high16 v4, 0x3f800000    # 1.0f

    .line 522
    .line 523
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 524
    .line 525
    .line 526
    const/high16 v26, 0x3f800000    # 1.0f

    .line 527
    .line 528
    const/16 v21, 0x0

    .line 529
    .line 530
    const v22, 0x3f0ccccd    # 0.55f

    .line 531
    .line 532
    .line 533
    const v23, 0x3ee66666    # 0.45f

    .line 534
    .line 535
    .line 536
    const/high16 v24, 0x3f800000    # 1.0f

    .line 537
    .line 538
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 539
    .line 540
    .line 541
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 542
    .line 543
    .line 544
    const/high16 v4, 0x40800000    # 4.0f

    .line 545
    .line 546
    const/high16 v6, 0x41400000    # 12.0f

    .line 547
    .line 548
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 549
    .line 550
    .line 551
    const v25, 0x40b51eb8    # 5.66f

    .line 552
    .line 553
    .line 554
    const v26, 0x3f7d70a4    # 0.99f

    .line 555
    .line 556
    .line 557
    const v21, 0x406c28f6    # 3.69f

    .line 558
    .line 559
    .line 560
    const/16 v22, 0x0

    .line 561
    .line 562
    const v23, 0x40a3851f    # 5.11f

    .line 563
    .line 564
    .line 565
    const v24, 0x3eeb851f    # 0.46f

    .line 566
    .line 567
    .line 568
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 569
    .line 570
    .line 571
    const v4, 0x40cae148    # 6.34f

    .line 572
    .line 573
    .line 574
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 575
    .line 576
    .line 577
    const/high16 v25, 0x41400000    # 12.0f

    .line 578
    .line 579
    const/high16 v26, 0x40800000    # 4.0f

    .line 580
    .line 581
    const v21, 0x40dc7ae1    # 6.89f

    .line 582
    .line 583
    .line 584
    const v22, 0x408eb852    # 4.46f

    .line 585
    .line 586
    .line 587
    const v23, 0x4104f5c3    # 8.31f

    .line 588
    .line 589
    .line 590
    const/high16 v24, 0x40800000    # 4.0f

    .line 591
    .line 592
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 593
    .line 594
    .line 595
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 596
    .line 597
    .line 598
    const v4, 0x40dfae14    # 6.99f

    .line 599
    .line 600
    .line 601
    const/high16 v6, 0x40c00000    # 6.0f

    .line 602
    .line 603
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 604
    .line 605
    .line 606
    const/high16 v4, 0x41400000    # 12.0f

    .line 607
    .line 608
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 609
    .line 610
    .line 611
    const/high16 v4, 0x41200000    # 10.0f

    .line 612
    .line 613
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 614
    .line 615
    .line 616
    const/high16 v4, 0x40c00000    # 6.0f

    .line 617
    .line 618
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 619
    .line 620
    .line 621
    const v4, 0x40dfae14    # 6.99f

    .line 622
    .line 623
    .line 624
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 625
    .line 626
    .line 627
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 628
    .line 629
    .line 630
    const/high16 v4, 0x41000000    # 8.0f

    .line 631
    .line 632
    const/high16 v6, 0x41880000    # 17.0f

    .line 633
    .line 634
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 635
    .line 636
    .line 637
    const v4, 0x40d428f6    # 6.63f

    .line 638
    .line 639
    .line 640
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 641
    .line 642
    .line 643
    const v4, -0x416b851f    # -0.29f

    .line 644
    .line 645
    .line 646
    const v6, -0x4175c28f    # -0.27f

    .line 647
    .line 648
    .line 649
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 650
    .line 651
    .line 652
    const/high16 v25, 0x40c00000    # 6.0f

    .line 653
    .line 654
    const/high16 v26, 0x41800000    # 16.0f

    .line 655
    .line 656
    const v21, 0x40c6b852    # 6.21f

    .line 657
    .line 658
    .line 659
    const v22, 0x4184f5c3    # 16.62f

    .line 660
    .line 661
    .line 662
    const/high16 v23, 0x40c00000    # 6.0f

    .line 663
    .line 664
    const v24, 0x4182f5c3    # 16.37f

    .line 665
    .line 666
    .line 667
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 668
    .line 669
    .line 670
    const/high16 v4, -0x3f800000    # -4.0f

    .line 671
    .line 672
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 673
    .line 674
    .line 675
    const/high16 v4, 0x41400000    # 12.0f

    .line 676
    .line 677
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 678
    .line 679
    .line 680
    const/high16 v4, 0x40800000    # 4.0f

    .line 681
    .line 682
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 683
    .line 684
    .line 685
    const v25, -0x4151eb85    # -0.34f

    .line 686
    .line 687
    .line 688
    const v26, 0x3f3ae148    # 0.73f

    .line 689
    .line 690
    .line 691
    const/16 v21, 0x0

    .line 692
    .line 693
    const v22, 0x3ebd70a4    # 0.37f

    .line 694
    .line 695
    .line 696
    const v23, -0x41a8f5c3    # -0.21f

    .line 697
    .line 698
    .line 699
    const v24, 0x3f1eb852    # 0.62f

    .line 700
    .line 701
    .line 702
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 703
    .line 704
    .line 705
    const v4, -0x416b851f    # -0.29f

    .line 706
    .line 707
    .line 708
    const v6, 0x3e8a3d71    # 0.27f

    .line 709
    .line 710
    .line 711
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 712
    .line 713
    .line 714
    const/high16 v4, 0x41000000    # 8.0f

    .line 715
    .line 716
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 717
    .line 718
    .line 719
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 720
    .line 721
    .line 722
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 723
    .line 724
    .line 725
    move-result-object v2

    .line 726
    const/high16 v6, 0x3f800000    # 1.0f

    .line 727
    .line 728
    const/high16 v8, 0x3f800000    # 1.0f

    .line 729
    .line 730
    const/4 v7, 0x0

    .line 731
    const-string v4, ""

    .line 732
    .line 733
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 734
    .line 735
    .line 736
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 737
    .line 738
    .line 739
    move-result v3

    .line 740
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 741
    .line 742
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 743
    .line 744
    .line 745
    move-result-wide v6

    .line 746
    const/4 v2, 0x0

    .line 747
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 748
    .line 749
    .line 750
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 751
    .line 752
    .line 753
    move-result v10

    .line 754
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 755
    .line 756
    .line 757
    move-result v11

    .line 758
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 759
    .line 760
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 761
    .line 762
    .line 763
    const/high16 v4, 0x41680000    # 14.5f

    .line 764
    .line 765
    const/high16 v6, 0x41080000    # 8.5f

    .line 766
    .line 767
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 768
    .line 769
    .line 770
    const/4 v4, 0x0

    .line 771
    const/high16 v6, -0x40400000    # -1.5f

    .line 772
    .line 773
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 774
    .line 775
    .line 776
    const/high16 v26, 0x40400000    # 3.0f

    .line 777
    .line 778
    const/16 v27, 0x0

    .line 779
    .line 780
    const/high16 v21, 0x3fc00000    # 1.5f

    .line 781
    .line 782
    const/high16 v22, 0x3fc00000    # 1.5f

    .line 783
    .line 784
    const/16 v23, 0x0

    .line 785
    .line 786
    const/16 v24, 0x1

    .line 787
    .line 788
    const/16 v25, 0x1

    .line 789
    .line 790
    move-object/from16 v20, v2

    .line 791
    .line 792
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 793
    .line 794
    .line 795
    const/high16 v26, -0x3fc00000    # -3.0f

    .line 796
    .line 797
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 798
    .line 799
    .line 800
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 801
    .line 802
    .line 803
    move-result-object v2

    .line 804
    const/high16 v6, 0x3f800000    # 1.0f

    .line 805
    .line 806
    const/4 v7, 0x0

    .line 807
    const-string v4, ""

    .line 808
    .line 809
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 810
    .line 811
    .line 812
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 813
    .line 814
    .line 815
    move-result v3

    .line 816
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 817
    .line 818
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 819
    .line 820
    .line 821
    move-result-wide v6

    .line 822
    const/4 v0, 0x0

    .line 823
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 824
    .line 825
    .line 826
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 827
    .line 828
    .line 829
    move-result v10

    .line 830
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 831
    .line 832
    .line 833
    move-result v11

    .line 834
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 835
    .line 836
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 837
    .line 838
    .line 839
    const/high16 v0, 0x41780000    # 15.5f

    .line 840
    .line 841
    const/high16 v2, 0x41680000    # 14.5f

    .line 842
    .line 843
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 844
    .line 845
    .line 846
    const/4 v0, 0x0

    .line 847
    const/high16 v2, -0x40400000    # -1.5f

    .line 848
    .line 849
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 850
    .line 851
    .line 852
    const/high16 v18, 0x40400000    # 3.0f

    .line 853
    .line 854
    const/16 v19, 0x0

    .line 855
    .line 856
    const/high16 v13, 0x3fc00000    # 1.5f

    .line 857
    .line 858
    const/high16 v14, 0x3fc00000    # 1.5f

    .line 859
    .line 860
    const/16 v16, 0x1

    .line 861
    .line 862
    const/16 v17, 0x1

    .line 863
    .line 864
    invoke-virtual/range {v12 .. v19}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 865
    .line 866
    .line 867
    const/high16 v18, -0x3fc00000    # -3.0f

    .line 868
    .line 869
    invoke-virtual/range {v12 .. v19}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 870
    .line 871
    .line 872
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 873
    .line 874
    .line 875
    move-result-object v2

    .line 876
    const/16 v16, 0x3800

    .line 877
    .line 878
    const/16 v17, 0x0

    .line 879
    .line 880
    const/high16 v6, 0x3f800000    # 1.0f

    .line 881
    .line 882
    const/4 v7, 0x0

    .line 883
    const/high16 v12, 0x3f800000    # 1.0f

    .line 884
    .line 885
    const/4 v13, 0x0

    .line 886
    const/4 v14, 0x0

    .line 887
    const-string v4, ""

    .line 888
    .line 889
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 890
    .line 891
    .line 892
    move-result-object v0

    .line 893
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 894
    .line 895
    .line 896
    move-result-object v0

    .line 897
    sput-object v0, Landroidx/compose/material/icons/twotone/DirectionsBusKt;->_directionsBus:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 898
    .line 899
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 900
    .line 901
    .line 902
    return-object v0
.end method
