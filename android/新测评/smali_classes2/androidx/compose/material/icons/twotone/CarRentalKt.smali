.class public final Landroidx/compose/material/icons/twotone/CarRentalKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_carRental",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "CarRental",
        "Landroidx/compose/material/icons/Icons$TwoTone;",
        "getCarRental",
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
        "SMAP\nCarRental.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CarRental.kt\nandroidx/compose/material/icons/twotone/CarRentalKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,129:1\n212#2,12:130\n233#2,18:143\n253#2:180\n233#2,18:181\n253#2:218\n233#2,18:219\n253#2:256\n233#2,18:257\n253#2:294\n233#2,18:295\n253#2:332\n174#3:142\n705#4,2:161\n717#4,2:163\n719#4,11:169\n705#4,2:199\n717#4,2:201\n719#4,11:207\n705#4,2:237\n717#4,2:239\n719#4,11:245\n705#4,2:275\n717#4,2:277\n719#4,11:283\n705#4,2:313\n717#4,2:315\n719#4,11:321\n72#5,4:165\n72#5,4:203\n72#5,4:241\n72#5,4:279\n72#5,4:317\n*S KotlinDebug\n*F\n+ 1 CarRental.kt\nandroidx/compose/material/icons/twotone/CarRentalKt\n*L\n29#1:130,12\n30#1:143,18\n30#1:180\n52#1:181,18\n52#1:218\n58#1:219,18\n58#1:256\n64#1:257,18\n64#1:294\n103#1:295,18\n103#1:332\n29#1:142\n30#1:161,2\n30#1:163,2\n30#1:169,11\n52#1:199,2\n52#1:201,2\n52#1:207,11\n58#1:237,2\n58#1:239,2\n58#1:245,11\n64#1:275,2\n64#1:277,2\n64#1:283,11\n103#1:313,2\n103#1:315,2\n103#1:321,11\n30#1:165,4\n52#1:203,4\n58#1:241,4\n64#1:279,4\n103#1:317,4\n*E\n"
    }
.end annotation


# static fields
.field private static _carRental:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getCarRental(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 28

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/CarRentalKt;->_carRental:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.CarRental"

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
    const/high16 v4, 0x40e00000    # 7.0f

    .line 71
    .line 72
    const v6, 0x417028f6    # 15.01f

    .line 73
    .line 74
    .line 75
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    const/high16 v4, 0x41900000    # 18.0f

    .line 79
    .line 80
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 81
    .line 82
    .line 83
    const/high16 v4, 0x41200000    # 10.0f

    .line 84
    .line 85
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 86
    .line 87
    .line 88
    const v4, -0x3fc0a3d7    # -2.99f

    .line 89
    .line 90
    .line 91
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 92
    .line 93
    .line 94
    const/high16 v4, 0x41700000    # 15.0f

    .line 95
    .line 96
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 97
    .line 98
    .line 99
    const/high16 v4, 0x40e00000    # 7.0f

    .line 100
    .line 101
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 102
    .line 103
    .line 104
    const v4, 0x417028f6    # 15.01f

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
    const/high16 v4, 0x41700000    # 15.0f

    .line 114
    .line 115
    const/high16 v6, 0x41780000    # 15.5f

    .line 116
    .line 117
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 118
    .line 119
    .line 120
    const/high16 v25, 0x3f800000    # 1.0f

    .line 121
    .line 122
    const/high16 v26, 0x3f800000    # 1.0f

    .line 123
    .line 124
    const v21, 0x3f0ccccd    # 0.55f

    .line 125
    .line 126
    .line 127
    const/16 v22, 0x0

    .line 128
    .line 129
    const/high16 v23, 0x3f800000    # 1.0f

    .line 130
    .line 131
    const v24, 0x3ee66666    # 0.45f

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
    const v4, -0x4119999a    # -0.45f

    .line 140
    .line 141
    .line 142
    const/high16 v6, 0x3f800000    # 1.0f

    .line 143
    .line 144
    const/high16 v7, -0x40800000    # -1.0f

    .line 145
    .line 146
    invoke-virtual {v2, v4, v6, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 147
    .line 148
    .line 149
    const/high16 v6, -0x40800000    # -1.0f

    .line 150
    .line 151
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 152
    .line 153
    .line 154
    const v4, 0x41673333    # 14.45f

    .line 155
    .line 156
    .line 157
    const/high16 v6, 0x41700000    # 15.0f

    .line 158
    .line 159
    const/high16 v7, 0x41780000    # 15.5f

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
    const/high16 v4, 0x41100000    # 9.0f

    .line 168
    .line 169
    const/high16 v6, 0x41780000    # 15.5f

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
    const v4, -0x4119999a    # -0.45f

    .line 178
    .line 179
    .line 180
    const/high16 v6, 0x3f800000    # 1.0f

    .line 181
    .line 182
    const/high16 v7, -0x40800000    # -1.0f

    .line 183
    .line 184
    invoke-virtual {v2, v4, v6, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 185
    .line 186
    .line 187
    const/high16 v6, -0x40800000    # -1.0f

    .line 188
    .line 189
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 190
    .line 191
    .line 192
    const v4, 0x41073333    # 8.45f

    .line 193
    .line 194
    .line 195
    const/high16 v6, 0x41100000    # 9.0f

    .line 196
    .line 197
    const/high16 v7, 0x41780000    # 15.5f

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
    const/high16 v4, 0x41840000    # 16.5f

    .line 260
    .line 261
    const/high16 v6, 0x41100000    # 9.0f

    .line 262
    .line 263
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 264
    .line 265
    .line 266
    const/4 v4, 0x0

    .line 267
    const/high16 v6, -0x40800000    # -1.0f

    .line 268
    .line 269
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

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
    const/high16 v4, 0x41840000    # 16.5f

    .line 338
    .line 339
    const/high16 v6, 0x41700000    # 15.0f

    .line 340
    .line 341
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 342
    .line 343
    .line 344
    const/4 v4, 0x0

    .line 345
    const/high16 v6, -0x40800000    # -1.0f

    .line 346
    .line 347
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

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
    const/high16 v4, 0x418a0000    # 17.25f

    .line 402
    .line 403
    const v6, 0x4119999a    # 9.6f

    .line 404
    .line 405
    .line 406
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 407
    .line 408
    .line 409
    const v25, -0x42b33333    # -0.05f

    .line 410
    .line 411
    .line 412
    const v26, -0x4270a3d7    # -0.07f

    .line 413
    .line 414
    .line 415
    const v21, -0x435c28f6    # -0.02f

    .line 416
    .line 417
    .line 418
    const v22, -0x435c28f6    # -0.02f

    .line 419
    .line 420
    .line 421
    const v23, -0x430a3d71    # -0.03f

    .line 422
    .line 423
    .line 424
    const v24, -0x42dc28f6    # -0.04f

    .line 425
    .line 426
    .line 427
    move-object/from16 v20, v2

    .line 428
    .line 429
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 430
    .line 431
    .line 432
    const v25, 0x41823d71    # 16.28f

    .line 433
    .line 434
    .line 435
    const/high16 v26, 0x41100000    # 9.0f

    .line 436
    .line 437
    const v21, 0x41868f5c    # 16.82f

    .line 438
    .line 439
    .line 440
    const v22, 0x411028f6    # 9.01f

    .line 441
    .line 442
    .line 443
    const v23, 0x41823d71    # 16.28f

    .line 444
    .line 445
    .line 446
    const/high16 v24, 0x41100000    # 9.0f

    .line 447
    .line 448
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 449
    .line 450
    .line 451
    const v4, 0x40f70a3d    # 7.72f

    .line 452
    .line 453
    .line 454
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 455
    .line 456
    .line 457
    const v25, -0x40947ae1    # -0.92f

    .line 458
    .line 459
    .line 460
    const v26, 0x3f0a3d71    # 0.54f

    .line 461
    .line 462
    .line 463
    const/16 v21, 0x0

    .line 464
    .line 465
    const/16 v22, 0x0

    .line 466
    .line 467
    const v23, -0x40f5c28f    # -0.54f

    .line 468
    .line 469
    .line 470
    const v24, 0x3c23d70a    # 0.01f

    .line 471
    .line 472
    .line 473
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 474
    .line 475
    .line 476
    const/high16 v25, 0x40d80000    # 6.75f

    .line 477
    .line 478
    const v26, 0x4119999a    # 9.6f

    .line 479
    .line 480
    .line 481
    const v21, 0x40d8f5c3    # 6.78f

    .line 482
    .line 483
    .line 484
    const v22, 0x4118f5c3    # 9.56f

    .line 485
    .line 486
    .line 487
    const v23, 0x40d8a3d7    # 6.77f

    .line 488
    .line 489
    .line 490
    const v24, 0x411947ae    # 9.58f

    .line 491
    .line 492
    .line 493
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 494
    .line 495
    .line 496
    const v25, 0x40d1eb85    # 6.56f

    .line 497
    .line 498
    .line 499
    const/high16 v26, 0x41200000    # 10.0f

    .line 500
    .line 501
    const v21, 0x40d5c28f    # 6.68f

    .line 502
    .line 503
    .line 504
    const v22, 0x411b5c29    # 9.71f

    .line 505
    .line 506
    .line 507
    const v23, 0x40d3851f    # 6.61f

    .line 508
    .line 509
    .line 510
    const v24, 0x411d70a4    # 9.84f

    .line 511
    .line 512
    .line 513
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 514
    .line 515
    .line 516
    const/high16 v25, 0x40a00000    # 5.0f

    .line 517
    .line 518
    const v26, 0x416b0a3d    # 14.69f

    .line 519
    .line 520
    .line 521
    const v21, 0x40cae148    # 6.34f

    .line 522
    .line 523
    .line 524
    const v22, 0x412a8f5c    # 10.66f

    .line 525
    .line 526
    .line 527
    const v23, 0x40ba3d71    # 5.82f

    .line 528
    .line 529
    .line 530
    const v24, 0x4143851f    # 12.22f

    .line 531
    .line 532
    .line 533
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 534
    .line 535
    .line 536
    const/high16 v4, 0x40d00000    # 6.5f

    .line 537
    .line 538
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 539
    .line 540
    .line 541
    const v25, 0x40b8f5c3    # 5.78f

    .line 542
    .line 543
    .line 544
    const/high16 v26, 0x41b00000    # 22.0f

    .line 545
    .line 546
    const/high16 v21, 0x40a00000    # 5.0f

    .line 547
    .line 548
    const v22, 0x41ad1eb8    # 21.64f

    .line 549
    .line 550
    .line 551
    const v23, 0x40ab3333    # 5.35f

    .line 552
    .line 553
    .line 554
    const/high16 v24, 0x41b00000    # 22.0f

    .line 555
    .line 556
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 557
    .line 558
    .line 559
    const v4, 0x3ee147ae    # 0.44f

    .line 560
    .line 561
    .line 562
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 563
    .line 564
    .line 565
    const/high16 v25, 0x40e00000    # 7.0f

    .line 566
    .line 567
    const v26, 0x41a9851f    # 21.19f

    .line 568
    .line 569
    .line 570
    const v21, 0x40d4cccd    # 6.65f

    .line 571
    .line 572
    .line 573
    const/high16 v22, 0x41b00000    # 22.0f

    .line 574
    .line 575
    const/high16 v23, 0x40e00000    # 7.0f

    .line 576
    .line 577
    const v24, 0x41ad1eb8    # 21.64f

    .line 578
    .line 579
    .line 580
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 581
    .line 582
    .line 583
    const/high16 v4, 0x41a00000    # 20.0f

    .line 584
    .line 585
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 586
    .line 587
    .line 588
    const/high16 v4, 0x41200000    # 10.0f

    .line 589
    .line 590
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 591
    .line 592
    .line 593
    const v4, 0x3f9851ec    # 1.19f

    .line 594
    .line 595
    .line 596
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 597
    .line 598
    .line 599
    const v25, 0x3f47ae14    # 0.78f

    .line 600
    .line 601
    .line 602
    const v26, 0x3f4f5c29    # 0.81f

    .line 603
    .line 604
    .line 605
    const/16 v21, 0x0

    .line 606
    .line 607
    const v22, 0x3ee66666    # 0.45f

    .line 608
    .line 609
    .line 610
    const v23, 0x3eae147b    # 0.34f

    .line 611
    .line 612
    .line 613
    const v24, 0x3f4f5c29    # 0.81f

    .line 614
    .line 615
    .line 616
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 617
    .line 618
    .line 619
    const v4, 0x3ee147ae    # 0.44f

    .line 620
    .line 621
    .line 622
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 623
    .line 624
    .line 625
    const v26, -0x40b0a3d7    # -0.81f

    .line 626
    .line 627
    .line 628
    const v21, 0x3edc28f6    # 0.43f

    .line 629
    .line 630
    .line 631
    const/16 v22, 0x0

    .line 632
    .line 633
    const v23, 0x3f47ae14    # 0.78f

    .line 634
    .line 635
    .line 636
    const v24, -0x4147ae14    # -0.36f

    .line 637
    .line 638
    .line 639
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 640
    .line 641
    .line 642
    const/high16 v4, -0x3f300000    # -6.5f

    .line 643
    .line 644
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 645
    .line 646
    .line 647
    const v25, -0x403851ec    # -1.56f

    .line 648
    .line 649
    .line 650
    const v26, -0x3f69eb85    # -4.69f

    .line 651
    .line 652
    .line 653
    const v21, -0x40ae147b    # -0.82f

    .line 654
    .line 655
    .line 656
    const v22, -0x3fe28f5c    # -2.46f

    .line 657
    .line 658
    .line 659
    const v23, -0x40547ae1    # -1.34f

    .line 660
    .line 661
    .line 662
    const v24, -0x3f7f0a3d    # -4.03f

    .line 663
    .line 664
    .line 665
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 666
    .line 667
    .line 668
    const/high16 v25, 0x418a0000    # 17.25f

    .line 669
    .line 670
    const v26, 0x4119999a    # 9.6f

    .line 671
    .line 672
    .line 673
    const v21, 0x418b1eb8    # 17.39f

    .line 674
    .line 675
    .line 676
    const v22, 0x411d70a4    # 9.84f

    .line 677
    .line 678
    .line 679
    const v23, 0x418a8f5c    # 17.32f

    .line 680
    .line 681
    .line 682
    const v24, 0x411b5c29    # 9.71f

    .line 683
    .line 684
    .line 685
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 686
    .line 687
    .line 688
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 689
    .line 690
    .line 691
    const/high16 v4, 0x41300000    # 11.0f

    .line 692
    .line 693
    const v6, 0x410547ae    # 8.33f

    .line 694
    .line 695
    .line 696
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 697
    .line 698
    .line 699
    const v4, 0x40eae148    # 7.34f

    .line 700
    .line 701
    .line 702
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 703
    .line 704
    .line 705
    const v4, 0x3e6b851f    # 0.23f

    .line 706
    .line 707
    .line 708
    const v6, 0x3f30a3d7    # 0.69f

    .line 709
    .line 710
    .line 711
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 712
    .line 713
    .line 714
    const v4, 0x4182a3d7    # 16.33f

    .line 715
    .line 716
    .line 717
    const/high16 v6, 0x41500000    # 13.0f

    .line 718
    .line 719
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 720
    .line 721
    .line 722
    const v4, 0x40f570a4    # 7.67f

    .line 723
    .line 724
    .line 725
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 726
    .line 727
    .line 728
    const/high16 v4, 0x41300000    # 11.0f

    .line 729
    .line 730
    const v6, 0x410547ae    # 8.33f

    .line 731
    .line 732
    .line 733
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 734
    .line 735
    .line 736
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 737
    .line 738
    .line 739
    const/high16 v4, 0x41880000    # 17.0f

    .line 740
    .line 741
    const v6, 0x417028f6    # 15.01f

    .line 742
    .line 743
    .line 744
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 745
    .line 746
    .line 747
    const/high16 v4, 0x41900000    # 18.0f

    .line 748
    .line 749
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 750
    .line 751
    .line 752
    const/high16 v4, 0x40e00000    # 7.0f

    .line 753
    .line 754
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 755
    .line 756
    .line 757
    const v4, -0x3fc0a3d7    # -2.99f

    .line 758
    .line 759
    .line 760
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 761
    .line 762
    .line 763
    const/high16 v4, 0x41700000    # 15.0f

    .line 764
    .line 765
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 766
    .line 767
    .line 768
    const/high16 v4, 0x41200000    # 10.0f

    .line 769
    .line 770
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 771
    .line 772
    .line 773
    const v4, 0x417028f6    # 15.01f

    .line 774
    .line 775
    .line 776
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 777
    .line 778
    .line 779
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 780
    .line 781
    .line 782
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 783
    .line 784
    .line 785
    move-result-object v2

    .line 786
    const/high16 v6, 0x3f800000    # 1.0f

    .line 787
    .line 788
    const/4 v7, 0x0

    .line 789
    const-string v4, ""

    .line 790
    .line 791
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 792
    .line 793
    .line 794
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 795
    .line 796
    .line 797
    move-result v3

    .line 798
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 799
    .line 800
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 801
    .line 802
    .line 803
    move-result-wide v6

    .line 804
    const/4 v0, 0x0

    .line 805
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 806
    .line 807
    .line 808
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 809
    .line 810
    .line 811
    move-result v10

    .line 812
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 813
    .line 814
    .line 815
    move-result v11

    .line 816
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 817
    .line 818
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 819
    .line 820
    .line 821
    const/high16 v0, 0x40400000    # 3.0f

    .line 822
    .line 823
    const v2, 0x412d47ae    # 10.83f

    .line 824
    .line 825
    .line 826
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 827
    .line 828
    .line 829
    const/high16 v17, 0x41000000    # 8.0f

    .line 830
    .line 831
    const/high16 v18, 0x3f800000    # 1.0f

    .line 832
    .line 833
    const v13, 0x41268f5c    # 10.41f

    .line 834
    .line 835
    .line 836
    const v14, 0x3fea3d71    # 1.83f

    .line 837
    .line 838
    .line 839
    const v15, 0x4114cccd    # 9.3f

    .line 840
    .line 841
    .line 842
    const/high16 v16, 0x3f800000    # 1.0f

    .line 843
    .line 844
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 845
    .line 846
    .line 847
    const/high16 v17, 0x40a00000    # 5.0f

    .line 848
    .line 849
    const/high16 v18, 0x40800000    # 4.0f

    .line 850
    .line 851
    const v13, 0x40cae148    # 6.34f

    .line 852
    .line 853
    .line 854
    const/high16 v14, 0x3f800000    # 1.0f

    .line 855
    .line 856
    const/high16 v15, 0x40a00000    # 5.0f

    .line 857
    .line 858
    const v16, 0x4015c28f    # 2.34f

    .line 859
    .line 860
    .line 861
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 862
    .line 863
    .line 864
    const/high16 v17, 0x40400000    # 3.0f

    .line 865
    .line 866
    const/high16 v18, 0x40400000    # 3.0f

    .line 867
    .line 868
    const/4 v13, 0x0

    .line 869
    const v14, 0x3fd33333    # 1.65f

    .line 870
    .line 871
    .line 872
    const v15, 0x3fab851f    # 1.34f

    .line 873
    .line 874
    .line 875
    const/high16 v16, 0x40400000    # 3.0f

    .line 876
    .line 877
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 878
    .line 879
    .line 880
    const v17, 0x40351eb8    # 2.83f

    .line 881
    .line 882
    .line 883
    const/high16 v18, -0x40000000    # -2.0f

    .line 884
    .line 885
    const v13, 0x3fa66666    # 1.3f

    .line 886
    .line 887
    .line 888
    const/4 v14, 0x0

    .line 889
    const v15, 0x401a3d71    # 2.41f

    .line 890
    .line 891
    .line 892
    const v16, -0x40a8f5c3    # -0.84f

    .line 893
    .line 894
    .line 895
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 896
    .line 897
    .line 898
    const/high16 v0, 0x41800000    # 16.0f

    .line 899
    .line 900
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 901
    .line 902
    .line 903
    const/high16 v0, 0x40000000    # 2.0f

    .line 904
    .line 905
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 906
    .line 907
    .line 908
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 909
    .line 910
    .line 911
    const/high16 v0, 0x40a00000    # 5.0f

    .line 912
    .line 913
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 914
    .line 915
    .line 916
    const/high16 v0, 0x3f800000    # 1.0f

    .line 917
    .line 918
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 919
    .line 920
    .line 921
    const/high16 v0, 0x40400000    # 3.0f

    .line 922
    .line 923
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 924
    .line 925
    .line 926
    const v0, 0x412d47ae    # 10.83f

    .line 927
    .line 928
    .line 929
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 930
    .line 931
    .line 932
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 933
    .line 934
    .line 935
    const/high16 v0, 0x41000000    # 8.0f

    .line 936
    .line 937
    const/high16 v2, 0x40a00000    # 5.0f

    .line 938
    .line 939
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 940
    .line 941
    .line 942
    const/high16 v17, 0x40e00000    # 7.0f

    .line 943
    .line 944
    const/high16 v18, 0x40800000    # 4.0f

    .line 945
    .line 946
    const v13, 0x40ee6666    # 7.45f

    .line 947
    .line 948
    .line 949
    const/high16 v14, 0x40a00000    # 5.0f

    .line 950
    .line 951
    const/high16 v15, 0x40e00000    # 7.0f

    .line 952
    .line 953
    const v16, 0x4091999a    # 4.55f

    .line 954
    .line 955
    .line 956
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 957
    .line 958
    .line 959
    const v0, 0x3ee66666    # 0.45f

    .line 960
    .line 961
    .line 962
    const/high16 v2, 0x3f800000    # 1.0f

    .line 963
    .line 964
    const/high16 v4, -0x40800000    # -1.0f

    .line 965
    .line 966
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 967
    .line 968
    .line 969
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 970
    .line 971
    .line 972
    const v0, 0x4108cccd    # 8.55f

    .line 973
    .line 974
    .line 975
    const/high16 v2, 0x41000000    # 8.0f

    .line 976
    .line 977
    const/high16 v4, 0x40a00000    # 5.0f

    .line 978
    .line 979
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 980
    .line 981
    .line 982
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 983
    .line 984
    .line 985
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 986
    .line 987
    .line 988
    move-result-object v2

    .line 989
    const/16 v16, 0x3800

    .line 990
    .line 991
    const/16 v17, 0x0

    .line 992
    .line 993
    const/high16 v6, 0x3f800000    # 1.0f

    .line 994
    .line 995
    const/4 v7, 0x0

    .line 996
    const/high16 v12, 0x3f800000    # 1.0f

    .line 997
    .line 998
    const/4 v13, 0x0

    .line 999
    const/4 v14, 0x0

    .line 1000
    const/4 v15, 0x0

    .line 1001
    const-string v4, ""

    .line 1002
    .line 1003
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 1004
    .line 1005
    .line 1006
    move-result-object v0

    .line 1007
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1008
    .line 1009
    .line 1010
    move-result-object v0

    .line 1011
    sput-object v0, Landroidx/compose/material/icons/twotone/CarRentalKt;->_carRental:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1012
    .line 1013
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 1014
    .line 1015
    .line 1016
    return-object v0
.end method
