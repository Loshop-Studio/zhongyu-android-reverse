.class public final Landroidx/compose/material/icons/rounded/EditRoadKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_editRoad",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "EditRoad",
        "Landroidx/compose/material/icons/Icons$Rounded;",
        "getEditRoad",
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
        "SMAP\nEditRoad.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EditRoad.kt\nandroidx/compose/material/icons/rounded/EditRoadKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,112:1\n212#2,12:113\n233#2,18:126\n253#2:163\n233#2,18:164\n253#2:201\n233#2,18:202\n253#2:239\n233#2,18:240\n253#2:277\n233#2,18:278\n253#2:315\n233#2,18:316\n253#2:353\n174#3:125\n705#4,2:144\n717#4,2:146\n719#4,11:152\n705#4,2:182\n717#4,2:184\n719#4,11:190\n705#4,2:220\n717#4,2:222\n719#4,11:228\n705#4,2:258\n717#4,2:260\n719#4,11:266\n705#4,2:296\n717#4,2:298\n719#4,11:304\n705#4,2:334\n717#4,2:336\n719#4,11:342\n72#5,4:148\n72#5,4:186\n72#5,4:224\n72#5,4:262\n72#5,4:300\n72#5,4:338\n*S KotlinDebug\n*F\n+ 1 EditRoad.kt\nandroidx/compose/material/icons/rounded/EditRoadKt\n*L\n29#1:113,12\n30#1:126,18\n30#1:163\n40#1:164,18\n40#1:201\n52#1:202,18\n52#1:239\n64#1:240,18\n64#1:277\n76#1:278,18\n76#1:315\n88#1:316,18\n88#1:353\n29#1:125\n30#1:144,2\n30#1:146,2\n30#1:152,11\n40#1:182,2\n40#1:184,2\n40#1:190,11\n52#1:220,2\n52#1:222,2\n52#1:228,11\n64#1:258,2\n64#1:260,2\n64#1:266,11\n76#1:296,2\n76#1:298,2\n76#1:304,11\n88#1:334,2\n88#1:336,2\n88#1:342,11\n30#1:148,4\n40#1:186,4\n52#1:224,4\n64#1:262,4\n76#1:300,4\n88#1:338,4\n*E\n"
    }
.end annotation


# static fields
.field private static _editRoad:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getEditRoad(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/EditRoadKt;->_editRoad:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.EditRoad"

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
    const/high16 v6, 0x41880000    # 17.0f

    .line 73
    .line 74
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 78
    .line 79
    .line 80
    const/high16 v25, -0x40800000    # -1.0f

    .line 81
    .line 82
    const/high16 v26, 0x3f800000    # 1.0f

    .line 83
    .line 84
    const v21, -0x40f33333    # -0.55f

    .line 85
    .line 86
    .line 87
    const/16 v22, 0x0

    .line 88
    .line 89
    const/high16 v23, -0x40800000    # -1.0f

    .line 90
    .line 91
    const v24, 0x3ee66666    # 0.45f

    .line 92
    .line 93
    .line 94
    move-object/from16 v20, v2

    .line 95
    .line 96
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 97
    .line 98
    .line 99
    const v4, 0x40dccccd    # 6.9f

    .line 100
    .line 101
    .line 102
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 103
    .line 104
    .line 105
    const/high16 v4, -0x40000000    # -2.0f

    .line 106
    .line 107
    const/high16 v6, 0x40000000    # 2.0f

    .line 108
    .line 109
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 110
    .line 111
    .line 112
    const/high16 v4, 0x40a00000    # 5.0f

    .line 113
    .line 114
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 115
    .line 116
    .line 117
    const/high16 v25, 0x41880000    # 17.0f

    .line 118
    .line 119
    const/high16 v26, 0x40800000    # 4.0f

    .line 120
    .line 121
    const/high16 v21, 0x41900000    # 18.0f

    .line 122
    .line 123
    const v22, 0x408e6666    # 4.45f

    .line 124
    .line 125
    .line 126
    const v23, 0x418c6666    # 17.55f

    .line 127
    .line 128
    .line 129
    const/high16 v24, 0x40800000    # 4.0f

    .line 130
    .line 131
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 132
    .line 133
    .line 134
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 135
    .line 136
    .line 137
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 138
    .line 139
    .line 140
    move-result-object v2

    .line 141
    const/16 v16, 0x3800

    .line 142
    .line 143
    const/16 v17, 0x0

    .line 144
    .line 145
    const/high16 v6, 0x3f800000    # 1.0f

    .line 146
    .line 147
    const/high16 v8, 0x3f800000    # 1.0f

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
    const/high16 v4, 0x41a00000    # 20.0f

    .line 190
    .line 191
    const/high16 v6, 0x40a00000    # 5.0f

    .line 192
    .line 193
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 194
    .line 195
    .line 196
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 197
    .line 198
    .line 199
    const/high16 v25, 0x3f800000    # 1.0f

    .line 200
    .line 201
    const/high16 v26, -0x40800000    # -1.0f

    .line 202
    .line 203
    const v21, 0x3f0ccccd    # 0.55f

    .line 204
    .line 205
    .line 206
    const/16 v22, 0x0

    .line 207
    .line 208
    const/high16 v23, 0x3f800000    # 1.0f

    .line 209
    .line 210
    const v24, -0x4119999a    # -0.45f

    .line 211
    .line 212
    .line 213
    move-object/from16 v20, v2

    .line 214
    .line 215
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 216
    .line 217
    .line 218
    const/high16 v4, 0x40a00000    # 5.0f

    .line 219
    .line 220
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 221
    .line 222
    .line 223
    const/high16 v25, -0x40800000    # -1.0f

    .line 224
    .line 225
    const/16 v21, 0x0

    .line 226
    .line 227
    const v22, -0x40f33333    # -0.55f

    .line 228
    .line 229
    .line 230
    const v23, -0x4119999a    # -0.45f

    .line 231
    .line 232
    .line 233
    const/high16 v24, -0x40800000    # -1.0f

    .line 234
    .line 235
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 236
    .line 237
    .line 238
    const/4 v4, 0x0

    .line 239
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 240
    .line 241
    .line 242
    const/high16 v25, 0x40800000    # 4.0f

    .line 243
    .line 244
    const/high16 v26, 0x40a00000    # 5.0f

    .line 245
    .line 246
    const v21, 0x408e6666    # 4.45f

    .line 247
    .line 248
    .line 249
    const/high16 v22, 0x40800000    # 4.0f

    .line 250
    .line 251
    const/high16 v23, 0x40800000    # 4.0f

    .line 252
    .line 253
    const v24, 0x408e6666    # 4.45f

    .line 254
    .line 255
    .line 256
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 257
    .line 258
    .line 259
    const/high16 v4, 0x41600000    # 14.0f

    .line 260
    .line 261
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 262
    .line 263
    .line 264
    const/high16 v25, 0x40a00000    # 5.0f

    .line 265
    .line 266
    const/high16 v26, 0x41a00000    # 20.0f

    .line 267
    .line 268
    const/high16 v21, 0x40800000    # 4.0f

    .line 269
    .line 270
    const v22, 0x419c6666    # 19.55f

    .line 271
    .line 272
    .line 273
    const v23, 0x408e6666    # 4.45f

    .line 274
    .line 275
    .line 276
    const/high16 v24, 0x41a00000    # 20.0f

    .line 277
    .line 278
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 279
    .line 280
    .line 281
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 282
    .line 283
    .line 284
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 285
    .line 286
    .line 287
    move-result-object v2

    .line 288
    const/high16 v6, 0x3f800000    # 1.0f

    .line 289
    .line 290
    const/4 v7, 0x0

    .line 291
    const-string v4, ""

    .line 292
    .line 293
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 294
    .line 295
    .line 296
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 297
    .line 298
    .line 299
    move-result v3

    .line 300
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 301
    .line 302
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 303
    .line 304
    .line 305
    move-result-wide v6

    .line 306
    const/4 v2, 0x0

    .line 307
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 308
    .line 309
    .line 310
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 311
    .line 312
    .line 313
    move-result v10

    .line 314
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 315
    .line 316
    .line 317
    move-result v11

    .line 318
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 319
    .line 320
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 321
    .line 322
    .line 323
    const/high16 v4, 0x41000000    # 8.0f

    .line 324
    .line 325
    const/high16 v6, 0x41300000    # 11.0f

    .line 326
    .line 327
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 328
    .line 329
    .line 330
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 331
    .line 332
    .line 333
    const/high16 v25, 0x3f800000    # 1.0f

    .line 334
    .line 335
    const/high16 v26, -0x40800000    # -1.0f

    .line 336
    .line 337
    const v21, 0x3f0ccccd    # 0.55f

    .line 338
    .line 339
    .line 340
    const/16 v22, 0x0

    .line 341
    .line 342
    const/high16 v23, 0x3f800000    # 1.0f

    .line 343
    .line 344
    const v24, -0x4119999a    # -0.45f

    .line 345
    .line 346
    .line 347
    move-object/from16 v20, v2

    .line 348
    .line 349
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 350
    .line 351
    .line 352
    const/high16 v4, 0x40a00000    # 5.0f

    .line 353
    .line 354
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 355
    .line 356
    .line 357
    const/high16 v25, -0x40800000    # -1.0f

    .line 358
    .line 359
    const/16 v21, 0x0

    .line 360
    .line 361
    const v22, -0x40f33333    # -0.55f

    .line 362
    .line 363
    .line 364
    const v23, -0x4119999a    # -0.45f

    .line 365
    .line 366
    .line 367
    const/high16 v24, -0x40800000    # -1.0f

    .line 368
    .line 369
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 370
    .line 371
    .line 372
    const/4 v4, 0x0

    .line 373
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 374
    .line 375
    .line 376
    const/high16 v26, 0x3f800000    # 1.0f

    .line 377
    .line 378
    const v21, -0x40f33333    # -0.55f

    .line 379
    .line 380
    .line 381
    const/16 v22, 0x0

    .line 382
    .line 383
    const/high16 v23, -0x40800000    # -1.0f

    .line 384
    .line 385
    const v24, 0x3ee66666    # 0.45f

    .line 386
    .line 387
    .line 388
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 389
    .line 390
    .line 391
    const/high16 v4, 0x40000000    # 2.0f

    .line 392
    .line 393
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 394
    .line 395
    .line 396
    const/high16 v25, 0x41300000    # 11.0f

    .line 397
    .line 398
    const/high16 v26, 0x41000000    # 8.0f

    .line 399
    .line 400
    const/high16 v21, 0x41200000    # 10.0f

    .line 401
    .line 402
    const v22, 0x40f1999a    # 7.55f

    .line 403
    .line 404
    .line 405
    const v23, 0x41273333    # 10.45f

    .line 406
    .line 407
    .line 408
    const/high16 v24, 0x41000000    # 8.0f

    .line 409
    .line 410
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 411
    .line 412
    .line 413
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 414
    .line 415
    .line 416
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 417
    .line 418
    .line 419
    move-result-object v2

    .line 420
    const/high16 v6, 0x3f800000    # 1.0f

    .line 421
    .line 422
    const/4 v7, 0x0

    .line 423
    const-string v4, ""

    .line 424
    .line 425
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 426
    .line 427
    .line 428
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 429
    .line 430
    .line 431
    move-result v3

    .line 432
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 433
    .line 434
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 435
    .line 436
    .line 437
    move-result-wide v6

    .line 438
    const/4 v2, 0x0

    .line 439
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 440
    .line 441
    .line 442
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 443
    .line 444
    .line 445
    move-result v10

    .line 446
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 447
    .line 448
    .line 449
    move-result v11

    .line 450
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 451
    .line 452
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 453
    .line 454
    .line 455
    const/high16 v4, 0x41600000    # 14.0f

    .line 456
    .line 457
    const/high16 v6, 0x41300000    # 11.0f

    .line 458
    .line 459
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 460
    .line 461
    .line 462
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 463
    .line 464
    .line 465
    const/high16 v25, 0x3f800000    # 1.0f

    .line 466
    .line 467
    const/high16 v26, -0x40800000    # -1.0f

    .line 468
    .line 469
    const v21, 0x3f0ccccd    # 0.55f

    .line 470
    .line 471
    .line 472
    const/16 v22, 0x0

    .line 473
    .line 474
    const/high16 v23, 0x3f800000    # 1.0f

    .line 475
    .line 476
    const v24, -0x4119999a    # -0.45f

    .line 477
    .line 478
    .line 479
    move-object/from16 v20, v2

    .line 480
    .line 481
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 482
    .line 483
    .line 484
    const/high16 v4, -0x40000000    # -2.0f

    .line 485
    .line 486
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 487
    .line 488
    .line 489
    const/high16 v25, -0x40800000    # -1.0f

    .line 490
    .line 491
    const/16 v21, 0x0

    .line 492
    .line 493
    const v22, -0x40f33333    # -0.55f

    .line 494
    .line 495
    .line 496
    const v23, -0x4119999a    # -0.45f

    .line 497
    .line 498
    .line 499
    const/high16 v24, -0x40800000    # -1.0f

    .line 500
    .line 501
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 502
    .line 503
    .line 504
    const/4 v4, 0x0

    .line 505
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 506
    .line 507
    .line 508
    const/high16 v26, 0x3f800000    # 1.0f

    .line 509
    .line 510
    const v21, -0x40f33333    # -0.55f

    .line 511
    .line 512
    .line 513
    const/16 v22, 0x0

    .line 514
    .line 515
    const/high16 v23, -0x40800000    # -1.0f

    .line 516
    .line 517
    const v24, 0x3ee66666    # 0.45f

    .line 518
    .line 519
    .line 520
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 521
    .line 522
    .line 523
    const/high16 v4, 0x40000000    # 2.0f

    .line 524
    .line 525
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 526
    .line 527
    .line 528
    const/high16 v25, 0x41300000    # 11.0f

    .line 529
    .line 530
    const/high16 v26, 0x41600000    # 14.0f

    .line 531
    .line 532
    const/high16 v21, 0x41200000    # 10.0f

    .line 533
    .line 534
    const v22, 0x4158cccd    # 13.55f

    .line 535
    .line 536
    .line 537
    const v23, 0x41273333    # 10.45f

    .line 538
    .line 539
    .line 540
    const/high16 v24, 0x41600000    # 14.0f

    .line 541
    .line 542
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 543
    .line 544
    .line 545
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 546
    .line 547
    .line 548
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 549
    .line 550
    .line 551
    move-result-object v2

    .line 552
    const/high16 v6, 0x3f800000    # 1.0f

    .line 553
    .line 554
    const/4 v7, 0x0

    .line 555
    const-string v4, ""

    .line 556
    .line 557
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 558
    .line 559
    .line 560
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 561
    .line 562
    .line 563
    move-result v3

    .line 564
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 565
    .line 566
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 567
    .line 568
    .line 569
    move-result-wide v6

    .line 570
    const/4 v2, 0x0

    .line 571
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 572
    .line 573
    .line 574
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 575
    .line 576
    .line 577
    move-result v10

    .line 578
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 579
    .line 580
    .line 581
    move-result v11

    .line 582
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 583
    .line 584
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 585
    .line 586
    .line 587
    const/high16 v4, 0x41a00000    # 20.0f

    .line 588
    .line 589
    const/high16 v6, 0x41300000    # 11.0f

    .line 590
    .line 591
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 592
    .line 593
    .line 594
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 595
    .line 596
    .line 597
    const/high16 v25, 0x3f800000    # 1.0f

    .line 598
    .line 599
    const/high16 v26, -0x40800000    # -1.0f

    .line 600
    .line 601
    const v21, 0x3f0ccccd    # 0.55f

    .line 602
    .line 603
    .line 604
    const/16 v22, 0x0

    .line 605
    .line 606
    const/high16 v23, 0x3f800000    # 1.0f

    .line 607
    .line 608
    const v24, -0x4119999a    # -0.45f

    .line 609
    .line 610
    .line 611
    move-object/from16 v20, v2

    .line 612
    .line 613
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 614
    .line 615
    .line 616
    const/high16 v4, -0x40000000    # -2.0f

    .line 617
    .line 618
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 619
    .line 620
    .line 621
    const/high16 v25, -0x40800000    # -1.0f

    .line 622
    .line 623
    const/16 v21, 0x0

    .line 624
    .line 625
    const v22, -0x40f33333    # -0.55f

    .line 626
    .line 627
    .line 628
    const v23, -0x4119999a    # -0.45f

    .line 629
    .line 630
    .line 631
    const/high16 v24, -0x40800000    # -1.0f

    .line 632
    .line 633
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 634
    .line 635
    .line 636
    const/4 v4, 0x0

    .line 637
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 638
    .line 639
    .line 640
    const/high16 v26, 0x3f800000    # 1.0f

    .line 641
    .line 642
    const v21, -0x40f33333    # -0.55f

    .line 643
    .line 644
    .line 645
    const/16 v22, 0x0

    .line 646
    .line 647
    const/high16 v23, -0x40800000    # -1.0f

    .line 648
    .line 649
    const v24, 0x3ee66666    # 0.45f

    .line 650
    .line 651
    .line 652
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 653
    .line 654
    .line 655
    const/high16 v4, 0x40000000    # 2.0f

    .line 656
    .line 657
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 658
    .line 659
    .line 660
    const/high16 v25, 0x41300000    # 11.0f

    .line 661
    .line 662
    const/high16 v26, 0x41a00000    # 20.0f

    .line 663
    .line 664
    const/high16 v21, 0x41200000    # 10.0f

    .line 665
    .line 666
    const v22, 0x419c6666    # 19.55f

    .line 667
    .line 668
    .line 669
    const v23, 0x41273333    # 10.45f

    .line 670
    .line 671
    .line 672
    const/high16 v24, 0x41a00000    # 20.0f

    .line 673
    .line 674
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 675
    .line 676
    .line 677
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 678
    .line 679
    .line 680
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 681
    .line 682
    .line 683
    move-result-object v2

    .line 684
    const/high16 v6, 0x3f800000    # 1.0f

    .line 685
    .line 686
    const/4 v7, 0x0

    .line 687
    const-string v4, ""

    .line 688
    .line 689
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 690
    .line 691
    .line 692
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 693
    .line 694
    .line 695
    move-result v3

    .line 696
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 697
    .line 698
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 699
    .line 700
    .line 701
    move-result-wide v6

    .line 702
    const/4 v0, 0x0

    .line 703
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 704
    .line 705
    .line 706
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 707
    .line 708
    .line 709
    move-result v10

    .line 710
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 711
    .line 712
    .line 713
    move-result v11

    .line 714
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 715
    .line 716
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 717
    .line 718
    .line 719
    const v0, 0x41b47ae1    # 22.56f

    .line 720
    .line 721
    .line 722
    const v2, 0x414970a4    # 12.59f

    .line 723
    .line 724
    .line 725
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 726
    .line 727
    .line 728
    const v0, -0x406ccccd    # -1.15f

    .line 729
    .line 730
    .line 731
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 732
    .line 733
    .line 734
    const v17, -0x3ff851ec    # -2.12f

    .line 735
    .line 736
    .line 737
    const/16 v18, 0x0

    .line 738
    .line 739
    const v13, -0x40e8f5c3    # -0.59f

    .line 740
    .line 741
    .line 742
    const v14, -0x40e8f5c3    # -0.59f

    .line 743
    .line 744
    .line 745
    const v15, -0x403ae148    # -1.54f

    .line 746
    .line 747
    .line 748
    const v16, -0x40e8f5c3    # -0.59f

    .line 749
    .line 750
    .line 751
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 752
    .line 753
    .line 754
    const v0, 0x4185d70a    # 16.73f

    .line 755
    .line 756
    .line 757
    const/high16 v2, 0x41600000    # 14.0f

    .line 758
    .line 759
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 760
    .line 761
    .line 762
    const v0, 0x403147ae    # 2.77f

    .line 763
    .line 764
    .line 765
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 766
    .line 767
    .line 768
    const/high16 v17, 0x3f000000    # 0.5f

    .line 769
    .line 770
    const/high16 v18, 0x3f000000    # 0.5f

    .line 771
    .line 772
    const/4 v13, 0x0

    .line 773
    const v14, 0x3e8f5c29    # 0.28f

    .line 774
    .line 775
    .line 776
    const v15, 0x3e6147ae    # 0.22f

    .line 777
    .line 778
    .line 779
    const/high16 v16, 0x3f000000    # 0.5f

    .line 780
    .line 781
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 782
    .line 783
    .line 784
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 785
    .line 786
    .line 787
    const v0, 0x40a947ae    # 5.29f

    .line 788
    .line 789
    .line 790
    const v2, -0x3f56b852    # -5.29f

    .line 791
    .line 792
    .line 793
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 794
    .line 795
    .line 796
    const v17, 0x41b47ae1    # 22.56f

    .line 797
    .line 798
    .line 799
    const v18, 0x414970a4    # 12.59f

    .line 800
    .line 801
    .line 802
    const v13, 0x41b93333    # 23.15f

    .line 803
    .line 804
    .line 805
    const v14, 0x4161eb85    # 14.12f

    .line 806
    .line 807
    .line 808
    const v15, 0x41b93333    # 23.15f

    .line 809
    .line 810
    .line 811
    const v16, 0x4152b852    # 13.17f

    .line 812
    .line 813
    .line 814
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 815
    .line 816
    .line 817
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 818
    .line 819
    .line 820
    const v0, 0x4193999a    # 18.45f

    .line 821
    .line 822
    .line 823
    const v2, 0x4184a3d7    # 16.58f

    .line 824
    .line 825
    .line 826
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 827
    .line 828
    .line 829
    const v0, -0x407c28f6    # -1.03f

    .line 830
    .line 831
    .line 832
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 833
    .line 834
    .line 835
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 836
    .line 837
    .line 838
    const/high16 v0, 0x41980000    # 19.0f

    .line 839
    .line 840
    const v2, 0x415f851f    # 13.97f

    .line 841
    .line 842
    .line 843
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 844
    .line 845
    .line 846
    const v0, 0x41a03d71    # 20.03f

    .line 847
    .line 848
    .line 849
    const/high16 v2, 0x41700000    # 15.0f

    .line 850
    .line 851
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 852
    .line 853
    .line 854
    const v0, 0x4193999a    # 18.45f

    .line 855
    .line 856
    .line 857
    const v2, 0x4184a3d7    # 16.58f

    .line 858
    .line 859
    .line 860
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 861
    .line 862
    .line 863
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 864
    .line 865
    .line 866
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 867
    .line 868
    .line 869
    move-result-object v2

    .line 870
    const/16 v16, 0x3800

    .line 871
    .line 872
    const/16 v17, 0x0

    .line 873
    .line 874
    const/high16 v6, 0x3f800000    # 1.0f

    .line 875
    .line 876
    const/4 v7, 0x0

    .line 877
    const/high16 v12, 0x3f800000    # 1.0f

    .line 878
    .line 879
    const/4 v13, 0x0

    .line 880
    const/4 v14, 0x0

    .line 881
    const/4 v15, 0x0

    .line 882
    const-string v4, ""

    .line 883
    .line 884
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 885
    .line 886
    .line 887
    move-result-object v0

    .line 888
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 889
    .line 890
    .line 891
    move-result-object v0

    .line 892
    sput-object v0, Landroidx/compose/material/icons/rounded/EditRoadKt;->_editRoad:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 893
    .line 894
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 895
    .line 896
    .line 897
    return-object v0
.end method
