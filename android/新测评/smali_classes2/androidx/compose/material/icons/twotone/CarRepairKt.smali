.class public final Landroidx/compose/material/icons/twotone/CarRepairKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_carRepair",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "CarRepair",
        "Landroidx/compose/material/icons/Icons$TwoTone;",
        "getCarRepair",
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
        "SMAP\nCarRepair.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CarRepair.kt\nandroidx/compose/material/icons/twotone/CarRepairKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,119:1\n212#2,12:120\n233#2,18:133\n253#2:170\n233#2,18:171\n253#2:208\n233#2,18:209\n253#2:246\n233#2,18:247\n253#2:284\n233#2,18:285\n253#2:322\n174#3:132\n705#4,2:151\n717#4,2:153\n719#4,11:159\n705#4,2:189\n717#4,2:191\n719#4,11:197\n705#4,2:227\n717#4,2:229\n719#4,11:235\n705#4,2:265\n717#4,2:267\n719#4,11:273\n705#4,2:303\n717#4,2:305\n719#4,11:311\n72#5,4:155\n72#5,4:193\n72#5,4:231\n72#5,4:269\n72#5,4:307\n*S KotlinDebug\n*F\n+ 1 CarRepair.kt\nandroidx/compose/material/icons/twotone/CarRepairKt\n*L\n29#1:120,12\n30#1:133,18\n30#1:170\n52#1:171,18\n52#1:208\n58#1:209,18\n58#1:246\n64#1:247,18\n64#1:284\n103#1:285,18\n103#1:322\n29#1:132\n30#1:151,2\n30#1:153,2\n30#1:159,11\n52#1:189,2\n52#1:191,2\n52#1:197,11\n58#1:227,2\n58#1:229,2\n58#1:235,11\n64#1:265,2\n64#1:267,2\n64#1:273,11\n103#1:303,2\n103#1:305,2\n103#1:311,11\n30#1:155,4\n52#1:193,4\n58#1:231,4\n64#1:269,4\n103#1:307,4\n*E\n"
    }
.end annotation


# static fields
.field private static _carRepair:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getCarRepair(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 28

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/CarRepairKt;->_carRepair:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.CarRepair"

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
    const/high16 v4, 0x41880000    # 17.0f

    .line 71
    .line 72
    const v6, 0x411028f6    # 9.01f

    .line 73
    .line 74
    .line 75
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    const/high16 v4, 0x41100000    # 9.0f

    .line 79
    .line 80
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 81
    .line 82
    .line 83
    const/high16 v4, 0x40e00000    # 7.0f

    .line 84
    .line 85
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 86
    .line 87
    .line 88
    const v4, 0x3c23d70a    # 0.01f

    .line 89
    .line 90
    .line 91
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 92
    .line 93
    .line 94
    const/high16 v4, 0x41400000    # 12.0f

    .line 95
    .line 96
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 97
    .line 98
    .line 99
    const/high16 v4, 0x41200000    # 10.0f

    .line 100
    .line 101
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 102
    .line 103
    .line 104
    const v4, 0x411028f6    # 9.01f

    .line 105
    .line 106
    .line 107
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 108
    .line 109
    .line 110
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 111
    .line 112
    .line 113
    const/high16 v4, 0x41100000    # 9.0f

    .line 114
    .line 115
    const/high16 v6, 0x41380000    # 11.5f

    .line 116
    .line 117
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 118
    .line 119
    .line 120
    const/high16 v25, -0x40800000    # -1.0f

    .line 121
    .line 122
    const/high16 v26, -0x40800000    # -1.0f

    .line 123
    .line 124
    const v21, -0x40f33333    # -0.55f

    .line 125
    .line 126
    .line 127
    const/16 v22, 0x0

    .line 128
    .line 129
    const/high16 v23, -0x40800000    # -1.0f

    .line 130
    .line 131
    const v24, -0x4119999a    # -0.45f

    .line 132
    .line 133
    .line 134
    move-object/from16 v20, v2

    .line 135
    .line 136
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 137
    .line 138
    .line 139
    const v4, 0x3ee66666    # 0.45f

    .line 140
    .line 141
    .line 142
    const/high16 v6, -0x40800000    # -1.0f

    .line 143
    .line 144
    const/high16 v7, 0x3f800000    # 1.0f

    .line 145
    .line 146
    invoke-virtual {v2, v4, v6, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 147
    .line 148
    .line 149
    const/high16 v6, 0x3f800000    # 1.0f

    .line 150
    .line 151
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 152
    .line 153
    .line 154
    const v4, 0x4118cccd    # 9.55f

    .line 155
    .line 156
    .line 157
    const/high16 v6, 0x41100000    # 9.0f

    .line 158
    .line 159
    const/high16 v7, 0x41380000    # 11.5f

    .line 160
    .line 161
    invoke-virtual {v2, v4, v7, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 162
    .line 163
    .line 164
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 165
    .line 166
    .line 167
    const/high16 v4, 0x41700000    # 15.0f

    .line 168
    .line 169
    const/high16 v6, 0x41380000    # 11.5f

    .line 170
    .line 171
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 172
    .line 173
    .line 174
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 175
    .line 176
    .line 177
    const v4, 0x3ee66666    # 0.45f

    .line 178
    .line 179
    .line 180
    const/high16 v6, -0x40800000    # -1.0f

    .line 181
    .line 182
    const/high16 v7, 0x3f800000    # 1.0f

    .line 183
    .line 184
    invoke-virtual {v2, v4, v6, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 185
    .line 186
    .line 187
    const/high16 v6, 0x3f800000    # 1.0f

    .line 188
    .line 189
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 190
    .line 191
    .line 192
    const v4, 0x4178cccd    # 15.55f

    .line 193
    .line 194
    .line 195
    const/high16 v6, 0x41700000    # 15.0f

    .line 196
    .line 197
    const/high16 v7, 0x41380000    # 11.5f

    .line 198
    .line 199
    invoke-virtual {v2, v4, v7, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 200
    .line 201
    .line 202
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 203
    .line 204
    .line 205
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 206
    .line 207
    .line 208
    move-result-object v2

    .line 209
    const/16 v16, 0x3800

    .line 210
    .line 211
    const/16 v17, 0x0

    .line 212
    .line 213
    const v6, 0x3e99999a    # 0.3f

    .line 214
    .line 215
    .line 216
    const v8, 0x3e99999a    # 0.3f

    .line 217
    .line 218
    .line 219
    const/4 v7, 0x0

    .line 220
    const/high16 v9, 0x3f800000    # 1.0f

    .line 221
    .line 222
    const/high16 v12, 0x3f800000    # 1.0f

    .line 223
    .line 224
    const/4 v13, 0x0

    .line 225
    const/4 v14, 0x0

    .line 226
    const/4 v15, 0x0

    .line 227
    const-string v4, ""

    .line 228
    .line 229
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 230
    .line 231
    .line 232
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 233
    .line 234
    .line 235
    move-result v3

    .line 236
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 237
    .line 238
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 239
    .line 240
    .line 241
    move-result-wide v6

    .line 242
    const/4 v2, 0x0

    .line 243
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 244
    .line 245
    .line 246
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 247
    .line 248
    .line 249
    move-result v10

    .line 250
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 251
    .line 252
    .line 253
    move-result v11

    .line 254
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 255
    .line 256
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 257
    .line 258
    .line 259
    const/high16 v4, 0x41280000    # 10.5f

    .line 260
    .line 261
    const/high16 v6, 0x41100000    # 9.0f

    .line 262
    .line 263
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 264
    .line 265
    .line 266
    const/high16 v4, -0x40800000    # -1.0f

    .line 267
    .line 268
    const/4 v6, 0x0

    .line 269
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 270
    .line 271
    .line 272
    const/high16 v26, 0x40000000    # 2.0f

    .line 273
    .line 274
    const/16 v27, 0x0

    .line 275
    .line 276
    const/high16 v21, 0x3f800000    # 1.0f

    .line 277
    .line 278
    const/high16 v22, 0x3f800000    # 1.0f

    .line 279
    .line 280
    const/16 v23, 0x0

    .line 281
    .line 282
    const/16 v24, 0x1

    .line 283
    .line 284
    const/16 v25, 0x1

    .line 285
    .line 286
    move-object/from16 v20, v2

    .line 287
    .line 288
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 289
    .line 290
    .line 291
    const/high16 v26, -0x40000000    # -2.0f

    .line 292
    .line 293
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 294
    .line 295
    .line 296
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 297
    .line 298
    .line 299
    move-result-object v2

    .line 300
    const/high16 v6, 0x3f800000    # 1.0f

    .line 301
    .line 302
    const/high16 v8, 0x3f800000    # 1.0f

    .line 303
    .line 304
    const/4 v7, 0x0

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
    const/high16 v4, 0x41280000    # 10.5f

    .line 338
    .line 339
    const/high16 v6, 0x41700000    # 15.0f

    .line 340
    .line 341
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 342
    .line 343
    .line 344
    const/high16 v4, -0x40800000    # -1.0f

    .line 345
    .line 346
    const/4 v6, 0x0

    .line 347
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 348
    .line 349
    .line 350
    const/high16 v26, 0x40000000    # 2.0f

    .line 351
    .line 352
    move-object/from16 v20, v2

    .line 353
    .line 354
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 355
    .line 356
    .line 357
    const/high16 v26, -0x40000000    # -2.0f

    .line 358
    .line 359
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 360
    .line 361
    .line 362
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 363
    .line 364
    .line 365
    move-result-object v2

    .line 366
    const/high16 v6, 0x3f800000    # 1.0f

    .line 367
    .line 368
    const/4 v7, 0x0

    .line 369
    const-string v4, ""

    .line 370
    .line 371
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 372
    .line 373
    .line 374
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 375
    .line 376
    .line 377
    move-result v3

    .line 378
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 379
    .line 380
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 381
    .line 382
    .line 383
    move-result-wide v6

    .line 384
    const/4 v2, 0x0

    .line 385
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 386
    .line 387
    .line 388
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 389
    .line 390
    .line 391
    move-result v10

    .line 392
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 393
    .line 394
    .line 395
    move-result v11

    .line 396
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 397
    .line 398
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 399
    .line 400
    .line 401
    const v4, 0x40b8f5c3    # 5.78f

    .line 402
    .line 403
    .line 404
    const/high16 v6, 0x41800000    # 16.0f

    .line 405
    .line 406
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 407
    .line 408
    .line 409
    const v4, 0x3ee147ae    # 0.44f

    .line 410
    .line 411
    .line 412
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 413
    .line 414
    .line 415
    const/high16 v25, 0x40e00000    # 7.0f

    .line 416
    .line 417
    const v26, 0x41730a3d    # 15.19f

    .line 418
    .line 419
    .line 420
    const v21, 0x40d4cccd    # 6.65f

    .line 421
    .line 422
    .line 423
    const/high16 v22, 0x41800000    # 16.0f

    .line 424
    .line 425
    const/high16 v23, 0x40e00000    # 7.0f

    .line 426
    .line 427
    const v24, 0x417a3d71    # 15.64f

    .line 428
    .line 429
    .line 430
    move-object/from16 v20, v2

    .line 431
    .line 432
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 433
    .line 434
    .line 435
    const/high16 v4, 0x41600000    # 14.0f

    .line 436
    .line 437
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 438
    .line 439
    .line 440
    const/high16 v4, 0x41200000    # 10.0f

    .line 441
    .line 442
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 443
    .line 444
    .line 445
    const v4, 0x3f9851ec    # 1.19f

    .line 446
    .line 447
    .line 448
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 449
    .line 450
    .line 451
    const v25, 0x3f47ae14    # 0.78f

    .line 452
    .line 453
    .line 454
    const v26, 0x3f4f5c29    # 0.81f

    .line 455
    .line 456
    .line 457
    const/16 v21, 0x0

    .line 458
    .line 459
    const v22, 0x3ee66666    # 0.45f

    .line 460
    .line 461
    .line 462
    const v23, 0x3eae147b    # 0.34f

    .line 463
    .line 464
    .line 465
    const v24, 0x3f4f5c29    # 0.81f

    .line 466
    .line 467
    .line 468
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 469
    .line 470
    .line 471
    const v4, 0x3ee147ae    # 0.44f

    .line 472
    .line 473
    .line 474
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 475
    .line 476
    .line 477
    const v26, -0x40b0a3d7    # -0.81f

    .line 478
    .line 479
    .line 480
    const v21, 0x3edc28f6    # 0.43f

    .line 481
    .line 482
    .line 483
    const/16 v22, 0x0

    .line 484
    .line 485
    const v23, 0x3f47ae14    # 0.78f

    .line 486
    .line 487
    .line 488
    const v24, -0x4147ae14    # -0.36f

    .line 489
    .line 490
    .line 491
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 492
    .line 493
    .line 494
    const/high16 v4, -0x3f300000    # -6.5f

    .line 495
    .line 496
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 497
    .line 498
    .line 499
    const v25, -0x403851ec    # -1.56f

    .line 500
    .line 501
    .line 502
    const v26, -0x3f69eb85    # -4.69f

    .line 503
    .line 504
    .line 505
    const/16 v21, 0x0

    .line 506
    .line 507
    const v23, -0x40547ae1    # -1.34f

    .line 508
    .line 509
    .line 510
    const v24, -0x3f7f0a3d    # -4.03f

    .line 511
    .line 512
    .line 513
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 514
    .line 515
    .line 516
    const v25, -0x41bd70a4    # -0.19f

    .line 517
    .line 518
    .line 519
    const v26, -0x41333333    # -0.4f

    .line 520
    .line 521
    .line 522
    const v21, -0x42b33333    # -0.05f

    .line 523
    .line 524
    .line 525
    const v22, -0x41dc28f6    # -0.16f

    .line 526
    .line 527
    .line 528
    const v23, -0x420a3d71    # -0.12f

    .line 529
    .line 530
    .line 531
    const v24, -0x416b851f    # -0.29f

    .line 532
    .line 533
    .line 534
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 535
    .line 536
    .line 537
    const v25, -0x42b33333    # -0.05f

    .line 538
    .line 539
    .line 540
    const v26, -0x4270a3d7    # -0.07f

    .line 541
    .line 542
    .line 543
    const v21, -0x435c28f6    # -0.02f

    .line 544
    .line 545
    .line 546
    const v22, -0x435c28f6    # -0.02f

    .line 547
    .line 548
    .line 549
    const v23, -0x430a3d71    # -0.03f

    .line 550
    .line 551
    .line 552
    const v24, -0x42dc28f6    # -0.04f

    .line 553
    .line 554
    .line 555
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 556
    .line 557
    .line 558
    const v25, 0x41823d71    # 16.28f

    .line 559
    .line 560
    .line 561
    const/high16 v26, 0x40400000    # 3.0f

    .line 562
    .line 563
    const v21, 0x41868f5c    # 16.82f

    .line 564
    .line 565
    .line 566
    const v22, 0x4040a3d7    # 3.01f

    .line 567
    .line 568
    .line 569
    const v23, 0x41823d71    # 16.28f

    .line 570
    .line 571
    .line 572
    const/high16 v24, 0x40400000    # 3.0f

    .line 573
    .line 574
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 575
    .line 576
    .line 577
    const v4, 0x40f70a3d    # 7.72f

    .line 578
    .line 579
    .line 580
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 581
    .line 582
    .line 583
    const v25, -0x40947ae1    # -0.92f

    .line 584
    .line 585
    .line 586
    const v26, 0x3f0a3d71    # 0.54f

    .line 587
    .line 588
    .line 589
    const/16 v21, 0x0

    .line 590
    .line 591
    const/16 v22, 0x0

    .line 592
    .line 593
    const v23, -0x40f5c28f    # -0.54f

    .line 594
    .line 595
    .line 596
    const v24, 0x3c23d70a    # 0.01f

    .line 597
    .line 598
    .line 599
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 600
    .line 601
    .line 602
    const/high16 v25, 0x40d80000    # 6.75f

    .line 603
    .line 604
    const v26, 0x40666666    # 3.6f

    .line 605
    .line 606
    .line 607
    const v21, 0x40d8f5c3    # 6.78f

    .line 608
    .line 609
    .line 610
    const v22, 0x4063d70a    # 3.56f

    .line 611
    .line 612
    .line 613
    const v23, 0x40d8a3d7    # 6.77f

    .line 614
    .line 615
    .line 616
    const v24, 0x40651eb8    # 3.58f

    .line 617
    .line 618
    .line 619
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 620
    .line 621
    .line 622
    const v25, 0x40d1eb85    # 6.56f

    .line 623
    .line 624
    .line 625
    const/high16 v26, 0x40800000    # 4.0f

    .line 626
    .line 627
    const v21, 0x40d5c28f    # 6.68f

    .line 628
    .line 629
    .line 630
    const v22, 0x406d70a4    # 3.71f

    .line 631
    .line 632
    .line 633
    const v23, 0x40d3851f    # 6.61f

    .line 634
    .line 635
    .line 636
    const v24, 0x4075c28f    # 3.84f

    .line 637
    .line 638
    .line 639
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 640
    .line 641
    .line 642
    const/high16 v25, 0x40a00000    # 5.0f

    .line 643
    .line 644
    const v26, 0x410b0a3d    # 8.69f

    .line 645
    .line 646
    .line 647
    const v21, 0x40cae148    # 6.34f

    .line 648
    .line 649
    .line 650
    const v22, 0x40951eb8    # 4.66f

    .line 651
    .line 652
    .line 653
    const/high16 v23, 0x40a00000    # 5.0f

    .line 654
    .line 655
    const v24, 0x410b0a3d    # 8.69f

    .line 656
    .line 657
    .line 658
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 659
    .line 660
    .line 661
    const/high16 v4, 0x40d00000    # 6.5f

    .line 662
    .line 663
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 664
    .line 665
    .line 666
    const v25, 0x40b8f5c3    # 5.78f

    .line 667
    .line 668
    .line 669
    const/high16 v26, 0x41800000    # 16.0f

    .line 670
    .line 671
    const/high16 v21, 0x40a00000    # 5.0f

    .line 672
    .line 673
    const v22, 0x417a3d71    # 15.64f

    .line 674
    .line 675
    .line 676
    const v23, 0x40ab3333    # 5.35f

    .line 677
    .line 678
    .line 679
    const/high16 v24, 0x41800000    # 16.0f

    .line 680
    .line 681
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 682
    .line 683
    .line 684
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 685
    .line 686
    .line 687
    const/high16 v4, 0x40a00000    # 5.0f

    .line 688
    .line 689
    const v6, 0x410547ae    # 8.33f

    .line 690
    .line 691
    .line 692
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 693
    .line 694
    .line 695
    const v4, 0x40eae148    # 7.34f

    .line 696
    .line 697
    .line 698
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 699
    .line 700
    .line 701
    const v4, 0x3e6b851f    # 0.23f

    .line 702
    .line 703
    .line 704
    const v6, 0x3f30a3d7    # 0.69f

    .line 705
    .line 706
    .line 707
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 708
    .line 709
    .line 710
    const v4, 0x4182a3d7    # 16.33f

    .line 711
    .line 712
    .line 713
    const/high16 v6, 0x40e00000    # 7.0f

    .line 714
    .line 715
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 716
    .line 717
    .line 718
    const v4, 0x40f570a4    # 7.67f

    .line 719
    .line 720
    .line 721
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 722
    .line 723
    .line 724
    const/high16 v4, 0x40a00000    # 5.0f

    .line 725
    .line 726
    const v6, 0x410547ae    # 8.33f

    .line 727
    .line 728
    .line 729
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 730
    .line 731
    .line 732
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 733
    .line 734
    .line 735
    const v4, 0x411028f6    # 9.01f

    .line 736
    .line 737
    .line 738
    const/high16 v6, 0x40e00000    # 7.0f

    .line 739
    .line 740
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 741
    .line 742
    .line 743
    const/high16 v4, 0x41100000    # 9.0f

    .line 744
    .line 745
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 746
    .line 747
    .line 748
    const/high16 v4, 0x41200000    # 10.0f

    .line 749
    .line 750
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 751
    .line 752
    .line 753
    const v4, 0x3c23d70a    # 0.01f

    .line 754
    .line 755
    .line 756
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 757
    .line 758
    .line 759
    const/high16 v4, 0x41400000    # 12.0f

    .line 760
    .line 761
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 762
    .line 763
    .line 764
    const/high16 v4, 0x40e00000    # 7.0f

    .line 765
    .line 766
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 767
    .line 768
    .line 769
    const v4, 0x411028f6    # 9.01f

    .line 770
    .line 771
    .line 772
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 773
    .line 774
    .line 775
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 776
    .line 777
    .line 778
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 779
    .line 780
    .line 781
    move-result-object v2

    .line 782
    const/high16 v6, 0x3f800000    # 1.0f

    .line 783
    .line 784
    const/4 v7, 0x0

    .line 785
    const-string v4, ""

    .line 786
    .line 787
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 788
    .line 789
    .line 790
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 791
    .line 792
    .line 793
    move-result v3

    .line 794
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 795
    .line 796
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 797
    .line 798
    .line 799
    move-result-wide v6

    .line 800
    const/4 v0, 0x0

    .line 801
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 802
    .line 803
    .line 804
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 805
    .line 806
    .line 807
    move-result v10

    .line 808
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 809
    .line 810
    .line 811
    move-result v11

    .line 812
    new-instance v0, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 813
    .line 814
    invoke-direct {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 815
    .line 816
    .line 817
    const/high16 v2, 0x40800000    # 4.0f

    .line 818
    .line 819
    const v4, 0x4188147b    # 17.01f

    .line 820
    .line 821
    .line 822
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 823
    .line 824
    .line 825
    const v2, 0x3ffeb852    # 1.99f

    .line 826
    .line 827
    .line 828
    const/4 v4, 0x0

    .line 829
    invoke-virtual {v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 830
    .line 831
    .line 832
    const/high16 v2, 0x40e00000    # 7.0f

    .line 833
    .line 834
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 835
    .line 836
    .line 837
    const/high16 v2, 0x40400000    # 3.0f

    .line 838
    .line 839
    invoke-virtual {v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 840
    .line 841
    .line 842
    const/high16 v2, 0x40000000    # 2.0f

    .line 843
    .line 844
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 845
    .line 846
    .line 847
    const/high16 v2, -0x3fc00000    # -3.0f

    .line 848
    .line 849
    invoke-virtual {v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 850
    .line 851
    .line 852
    const/high16 v2, 0x40e00000    # 7.0f

    .line 853
    .line 854
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 855
    .line 856
    .line 857
    const v2, -0x400147ae    # -1.99f

    .line 858
    .line 859
    .line 860
    invoke-virtual {v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 861
    .line 862
    .line 863
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 864
    .line 865
    .line 866
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 867
    .line 868
    .line 869
    move-result-object v2

    .line 870
    const/high16 v6, 0x3f800000    # 1.0f

    .line 871
    .line 872
    const/4 v7, 0x0

    .line 873
    const-string v4, ""

    .line 874
    .line 875
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 876
    .line 877
    .line 878
    move-result-object v0

    .line 879
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 880
    .line 881
    .line 882
    move-result-object v0

    .line 883
    sput-object v0, Landroidx/compose/material/icons/twotone/CarRepairKt;->_carRepair:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 884
    .line 885
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 886
    .line 887
    .line 888
    return-object v0
.end method
