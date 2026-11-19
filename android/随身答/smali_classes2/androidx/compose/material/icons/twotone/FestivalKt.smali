.class public final Landroidx/compose/material/icons/twotone/FestivalKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_festival",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "Festival",
        "Landroidx/compose/material/icons/Icons$TwoTone;",
        "getFestival",
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
        "SMAP\nFestival.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Festival.kt\nandroidx/compose/material/icons/twotone/FestivalKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,147:1\n212#2,12:148\n233#2,18:161\n253#2:198\n233#2,18:199\n253#2:236\n233#2,18:237\n253#2:274\n233#2,18:275\n253#2:312\n233#2,18:313\n253#2:350\n233#2,18:351\n253#2:388\n233#2,18:389\n253#2:426\n233#2,18:427\n253#2:464\n174#3:160\n705#4,2:179\n717#4,2:181\n719#4,11:187\n705#4,2:217\n717#4,2:219\n719#4,11:225\n705#4,2:255\n717#4,2:257\n719#4,11:263\n705#4,2:293\n717#4,2:295\n719#4,11:301\n705#4,2:331\n717#4,2:333\n719#4,11:339\n705#4,2:369\n717#4,2:371\n719#4,11:377\n705#4,2:407\n717#4,2:409\n719#4,11:415\n705#4,2:445\n717#4,2:447\n719#4,11:453\n72#5,4:183\n72#5,4:221\n72#5,4:259\n72#5,4:297\n72#5,4:335\n72#5,4:373\n72#5,4:411\n72#5,4:449\n*S KotlinDebug\n*F\n+ 1 Festival.kt\nandroidx/compose/material/icons/twotone/FestivalKt\n*L\n29#1:148,12\n30#1:161,18\n30#1:198\n39#1:199,18\n39#1:236\n46#1:237,18\n46#1:274\n53#1:275,18\n53#1:312\n60#1:313,18\n60#1:350\n67#1:351,18\n67#1:388\n74#1:389,18\n74#1:426\n83#1:427,18\n83#1:464\n29#1:160\n30#1:179,2\n30#1:181,2\n30#1:187,11\n39#1:217,2\n39#1:219,2\n39#1:225,11\n46#1:255,2\n46#1:257,2\n46#1:263,11\n53#1:293,2\n53#1:295,2\n53#1:301,11\n60#1:331,2\n60#1:333,2\n60#1:339,11\n67#1:369,2\n67#1:371,2\n67#1:377,11\n74#1:407,2\n74#1:409,2\n74#1:415,11\n83#1:445,2\n83#1:447,2\n83#1:453,11\n30#1:183,4\n39#1:221,4\n46#1:259,4\n53#1:297,4\n60#1:335,4\n67#1:373,4\n74#1:411,4\n83#1:449,4\n*E\n"
    }
.end annotation


# static fields
.field private static _festival:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getFestival(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/FestivalKt;->_festival:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.Festival"

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
    const v4, 0x40a7ae14    # 5.24f

    .line 71
    .line 72
    .line 73
    const v6, 0x4166b852    # 14.42f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v25, 0x40951eb8    # 4.66f

    .line 80
    .line 81
    .line 82
    const/high16 v26, 0x41a00000    # 20.0f

    .line 83
    .line 84
    const v21, 0x40a66666    # 5.2f

    .line 85
    .line 86
    .line 87
    const v22, 0x418170a4    # 16.18f

    .line 88
    .line 89
    .line 90
    const v23, 0x40a1eb85    # 5.06f

    .line 91
    .line 92
    .line 93
    const v24, 0x41911eb8    # 18.14f

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
    const v4, 0x402ae148    # 2.67f

    .line 102
    .line 103
    .line 104
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 105
    .line 106
    .line 107
    const v25, 0x3f051eb8    # 0.52f

    .line 108
    .line 109
    .line 110
    const v26, -0x3f423d71    # -5.93f

    .line 111
    .line 112
    .line 113
    const v21, 0x3e8a3d71    # 0.27f

    .line 114
    .line 115
    .line 116
    const v22, -0x4007ae14    # -1.94f

    .line 117
    .line 118
    .line 119
    const v23, 0x3edc28f6    # 0.43f

    .line 120
    .line 121
    .line 122
    const v24, -0x3f7dc28f    # -4.07f

    .line 123
    .line 124
    .line 125
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 126
    .line 127
    .line 128
    const/high16 v25, 0x40e00000    # 7.0f

    .line 129
    .line 130
    const v26, 0x41570a3d    # 13.44f

    .line 131
    .line 132
    .line 133
    const v21, 0x40f147ae    # 7.54f

    .line 134
    .line 135
    .line 136
    const v22, 0x415e6666    # 13.9f

    .line 137
    .line 138
    .line 139
    const/high16 v23, 0x40e80000    # 7.25f

    .line 140
    .line 141
    const v24, 0x415b3333    # 13.7f

    .line 142
    .line 143
    .line 144
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 145
    .line 146
    .line 147
    const v25, 0x40a7ae14    # 5.24f

    .line 148
    .line 149
    .line 150
    const v26, 0x4166b852    # 14.42f

    .line 151
    .line 152
    .line 153
    const v21, 0x40d0f5c3    # 6.53f

    .line 154
    .line 155
    .line 156
    const v22, 0x415ee148    # 13.93f

    .line 157
    .line 158
    .line 159
    const v23, 0x40bd70a4    # 5.92f

    .line 160
    .line 161
    .line 162
    const v24, 0x416451ec    # 14.27f

    .line 163
    .line 164
    .line 165
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 166
    .line 167
    .line 168
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 169
    .line 170
    .line 171
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 172
    .line 173
    .line 174
    move-result-object v2

    .line 175
    const/16 v16, 0x3800

    .line 176
    .line 177
    const/16 v17, 0x0

    .line 178
    .line 179
    const v6, 0x3e99999a    # 0.3f

    .line 180
    .line 181
    .line 182
    const v8, 0x3e99999a    # 0.3f

    .line 183
    .line 184
    .line 185
    const/4 v7, 0x0

    .line 186
    const/high16 v9, 0x3f800000    # 1.0f

    .line 187
    .line 188
    const/high16 v12, 0x3f800000    # 1.0f

    .line 189
    .line 190
    const/4 v13, 0x0

    .line 191
    const/4 v14, 0x0

    .line 192
    const/4 v15, 0x0

    .line 193
    const-string v4, ""

    .line 194
    .line 195
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 196
    .line 197
    .line 198
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 199
    .line 200
    .line 201
    move-result v3

    .line 202
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 203
    .line 204
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 205
    .line 206
    .line 207
    move-result-wide v6

    .line 208
    const/4 v2, 0x0

    .line 209
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 210
    .line 211
    .line 212
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 213
    .line 214
    .line 215
    move-result v10

    .line 216
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 217
    .line 218
    .line 219
    move-result v11

    .line 220
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 221
    .line 222
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 223
    .line 224
    .line 225
    const/high16 v4, 0x41300000    # 11.0f

    .line 226
    .line 227
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 228
    .line 229
    .line 230
    const/high16 v4, 0x41000000    # 8.0f

    .line 231
    .line 232
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 233
    .line 234
    .line 235
    const/high16 v25, 0x3fc00000    # 1.5f

    .line 236
    .line 237
    const/high16 v26, 0x3fc00000    # 1.5f

    .line 238
    .line 239
    const/16 v21, 0x0

    .line 240
    .line 241
    const v22, 0x3f547ae1    # 0.83f

    .line 242
    .line 243
    .line 244
    const v23, 0x3f2b851f    # 0.67f

    .line 245
    .line 246
    .line 247
    const/high16 v24, 0x3fc00000    # 1.5f

    .line 248
    .line 249
    move-object/from16 v20, v2

    .line 250
    .line 251
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 252
    .line 253
    .line 254
    const v4, 0x413d47ae    # 11.83f

    .line 255
    .line 256
    .line 257
    const/high16 v6, 0x41300000    # 11.0f

    .line 258
    .line 259
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 260
    .line 261
    .line 262
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 263
    .line 264
    .line 265
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 266
    .line 267
    .line 268
    move-result-object v2

    .line 269
    const v6, 0x3e99999a    # 0.3f

    .line 270
    .line 271
    .line 272
    const/4 v7, 0x0

    .line 273
    const-string v4, ""

    .line 274
    .line 275
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 276
    .line 277
    .line 278
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 279
    .line 280
    .line 281
    move-result v3

    .line 282
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 283
    .line 284
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 285
    .line 286
    .line 287
    move-result-wide v6

    .line 288
    const/4 v2, 0x0

    .line 289
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 290
    .line 291
    .line 292
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 293
    .line 294
    .line 295
    move-result v10

    .line 296
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 297
    .line 298
    .line 299
    move-result v11

    .line 300
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 301
    .line 302
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 303
    .line 304
    .line 305
    const/high16 v4, 0x40c00000    # 6.0f

    .line 306
    .line 307
    const/high16 v6, 0x41300000    # 11.0f

    .line 308
    .line 309
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 310
    .line 311
    .line 312
    const/high16 v4, 0x40400000    # 3.0f

    .line 313
    .line 314
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 315
    .line 316
    .line 317
    move-object/from16 v20, v2

    .line 318
    .line 319
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 320
    .line 321
    .line 322
    const/high16 v4, 0x40c00000    # 6.0f

    .line 323
    .line 324
    const v6, 0x413d47ae    # 11.83f

    .line 325
    .line 326
    .line 327
    const/high16 v7, 0x41300000    # 11.0f

    .line 328
    .line 329
    invoke-virtual {v2, v4, v6, v4, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 330
    .line 331
    .line 332
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 333
    .line 334
    .line 335
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 336
    .line 337
    .line 338
    move-result-object v2

    .line 339
    const v6, 0x3e99999a    # 0.3f

    .line 340
    .line 341
    .line 342
    const/4 v7, 0x0

    .line 343
    const-string v4, ""

    .line 344
    .line 345
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 346
    .line 347
    .line 348
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 349
    .line 350
    .line 351
    move-result v3

    .line 352
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 353
    .line 354
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 355
    .line 356
    .line 357
    move-result-wide v6

    .line 358
    const/4 v2, 0x0

    .line 359
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 360
    .line 361
    .line 362
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 363
    .line 364
    .line 365
    move-result v10

    .line 366
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 367
    .line 368
    .line 369
    move-result v11

    .line 370
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 371
    .line 372
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 373
    .line 374
    .line 375
    const v4, 0x4096b852    # 4.71f

    .line 376
    .line 377
    .line 378
    const/high16 v6, 0x41400000    # 12.0f

    .line 379
    .line 380
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 381
    .line 382
    .line 383
    const v25, 0x40bc7ae1    # 5.89f

    .line 384
    .line 385
    .line 386
    const/high16 v26, 0x41100000    # 9.0f

    .line 387
    .line 388
    const v21, 0x412ab852    # 10.67f

    .line 389
    .line 390
    .line 391
    const v22, 0x40bb3333    # 5.85f

    .line 392
    .line 393
    .line 394
    const v23, 0x410828f6    # 8.51f

    .line 395
    .line 396
    .line 397
    const v24, 0x40f1999a    # 7.55f

    .line 398
    .line 399
    .line 400
    move-object/from16 v20, v2

    .line 401
    .line 402
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 403
    .line 404
    .line 405
    const v4, 0x4143ae14    # 12.23f

    .line 406
    .line 407
    .line 408
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 409
    .line 410
    .line 411
    const/high16 v25, 0x41400000    # 12.0f

    .line 412
    .line 413
    const v26, 0x4096b852    # 4.71f

    .line 414
    .line 415
    .line 416
    const v21, 0x4177d70a    # 15.49f

    .line 417
    .line 418
    .line 419
    const v22, 0x40f1999a    # 7.55f

    .line 420
    .line 421
    .line 422
    const v23, 0x415547ae    # 13.33f

    .line 423
    .line 424
    .line 425
    const v24, 0x40bb3333    # 5.85f

    .line 426
    .line 427
    .line 428
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 429
    .line 430
    .line 431
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 432
    .line 433
    .line 434
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 435
    .line 436
    .line 437
    move-result-object v2

    .line 438
    const v6, 0x3e99999a    # 0.3f

    .line 439
    .line 440
    .line 441
    const/4 v7, 0x0

    .line 442
    const-string v4, ""

    .line 443
    .line 444
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 445
    .line 446
    .line 447
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 448
    .line 449
    .line 450
    move-result v3

    .line 451
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 452
    .line 453
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 454
    .line 455
    .line 456
    move-result-wide v6

    .line 457
    const/4 v2, 0x0

    .line 458
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 459
    .line 460
    .line 461
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 462
    .line 463
    .line 464
    move-result v10

    .line 465
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 466
    .line 467
    .line 468
    move-result v11

    .line 469
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 470
    .line 471
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 472
    .line 473
    .line 474
    const/high16 v4, 0x419c0000    # 19.5f

    .line 475
    .line 476
    const/high16 v6, 0x41480000    # 12.5f

    .line 477
    .line 478
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 479
    .line 480
    .line 481
    const/high16 v25, 0x3fc00000    # 1.5f

    .line 482
    .line 483
    const/high16 v26, -0x40400000    # -1.5f

    .line 484
    .line 485
    const v21, 0x3f547ae1    # 0.83f

    .line 486
    .line 487
    .line 488
    const/16 v22, 0x0

    .line 489
    .line 490
    const/high16 v23, 0x3fc00000    # 1.5f

    .line 491
    .line 492
    const v24, -0x40d47ae1    # -0.67f

    .line 493
    .line 494
    .line 495
    move-object/from16 v20, v2

    .line 496
    .line 497
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 498
    .line 499
    .line 500
    const/high16 v4, -0x3fc00000    # -3.0f

    .line 501
    .line 502
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 503
    .line 504
    .line 505
    const/high16 v25, 0x419c0000    # 19.5f

    .line 506
    .line 507
    const/high16 v26, 0x41480000    # 12.5f

    .line 508
    .line 509
    const/high16 v21, 0x41900000    # 18.0f

    .line 510
    .line 511
    const v22, 0x413d47ae    # 11.83f

    .line 512
    .line 513
    .line 514
    const v23, 0x41955c29    # 18.67f

    .line 515
    .line 516
    .line 517
    const/high16 v24, 0x41480000    # 12.5f

    .line 518
    .line 519
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 520
    .line 521
    .line 522
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 523
    .line 524
    .line 525
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 526
    .line 527
    .line 528
    move-result-object v2

    .line 529
    const v6, 0x3e99999a    # 0.3f

    .line 530
    .line 531
    .line 532
    const/4 v7, 0x0

    .line 533
    const-string v4, ""

    .line 534
    .line 535
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 536
    .line 537
    .line 538
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 539
    .line 540
    .line 541
    move-result v3

    .line 542
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 543
    .line 544
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 545
    .line 546
    .line 547
    move-result-wide v6

    .line 548
    const/4 v2, 0x0

    .line 549
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 550
    .line 551
    .line 552
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 553
    .line 554
    .line 555
    move-result v10

    .line 556
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 557
    .line 558
    .line 559
    move-result v11

    .line 560
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 561
    .line 562
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 563
    .line 564
    .line 565
    const/high16 v4, 0x41680000    # 14.5f

    .line 566
    .line 567
    const/high16 v6, 0x41480000    # 12.5f

    .line 568
    .line 569
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 570
    .line 571
    .line 572
    const/high16 v25, 0x3fc00000    # 1.5f

    .line 573
    .line 574
    const/high16 v26, -0x40400000    # -1.5f

    .line 575
    .line 576
    const v21, 0x3f547ae1    # 0.83f

    .line 577
    .line 578
    .line 579
    const/16 v22, 0x0

    .line 580
    .line 581
    const/high16 v23, 0x3fc00000    # 1.5f

    .line 582
    .line 583
    const v24, -0x40d47ae1    # -0.67f

    .line 584
    .line 585
    .line 586
    move-object/from16 v20, v2

    .line 587
    .line 588
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 589
    .line 590
    .line 591
    const/high16 v4, -0x3fc00000    # -3.0f

    .line 592
    .line 593
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 594
    .line 595
    .line 596
    const/high16 v25, 0x41680000    # 14.5f

    .line 597
    .line 598
    const/high16 v26, 0x41480000    # 12.5f

    .line 599
    .line 600
    const/high16 v21, 0x41500000    # 13.0f

    .line 601
    .line 602
    const v22, 0x413d47ae    # 11.83f

    .line 603
    .line 604
    .line 605
    const v23, 0x415ab852    # 13.67f

    .line 606
    .line 607
    .line 608
    const/high16 v24, 0x41480000    # 12.5f

    .line 609
    .line 610
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 611
    .line 612
    .line 613
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 614
    .line 615
    .line 616
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 617
    .line 618
    .line 619
    move-result-object v2

    .line 620
    const v6, 0x3e99999a    # 0.3f

    .line 621
    .line 622
    .line 623
    const/4 v7, 0x0

    .line 624
    const-string v4, ""

    .line 625
    .line 626
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 627
    .line 628
    .line 629
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 630
    .line 631
    .line 632
    move-result v3

    .line 633
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 634
    .line 635
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 636
    .line 637
    .line 638
    move-result-wide v6

    .line 639
    const/4 v2, 0x0

    .line 640
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 641
    .line 642
    .line 643
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 644
    .line 645
    .line 646
    move-result v10

    .line 647
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 648
    .line 649
    .line 650
    move-result v11

    .line 651
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 652
    .line 653
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 654
    .line 655
    .line 656
    const/high16 v4, 0x41880000    # 17.0f

    .line 657
    .line 658
    const v6, 0x41570a3d    # 13.44f

    .line 659
    .line 660
    .line 661
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 662
    .line 663
    .line 664
    const v25, -0x40a66666    # -0.85f

    .line 665
    .line 666
    .line 667
    const v26, 0x3f1eb852    # 0.62f

    .line 668
    .line 669
    .line 670
    const/high16 v21, -0x41800000    # -0.25f

    .line 671
    .line 672
    const/high16 v22, 0x3e800000    # 0.25f

    .line 673
    .line 674
    const v23, -0x40f5c28f    # -0.54f

    .line 675
    .line 676
    .line 677
    const v24, 0x3ee66666    # 0.45f

    .line 678
    .line 679
    .line 680
    move-object/from16 v20, v2

    .line 681
    .line 682
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 683
    .line 684
    .line 685
    const v25, 0x3f051eb8    # 0.52f

    .line 686
    .line 687
    .line 688
    const v26, 0x40bdc28f    # 5.93f

    .line 689
    .line 690
    .line 691
    const v21, 0x3dcccccd    # 0.1f

    .line 692
    .line 693
    .line 694
    const v22, 0x3fef5c29    # 1.87f

    .line 695
    .line 696
    .line 697
    const v23, 0x3e851eb8    # 0.26f

    .line 698
    .line 699
    .line 700
    const/high16 v24, 0x40800000    # 4.0f

    .line 701
    .line 702
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 703
    .line 704
    .line 705
    const v4, 0x402ae148    # 2.67f

    .line 706
    .line 707
    .line 708
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 709
    .line 710
    .line 711
    const v25, -0x40ee147b    # -0.57f

    .line 712
    .line 713
    .line 714
    const v26, -0x3f4d70a4    # -5.58f

    .line 715
    .line 716
    .line 717
    const v21, -0x413851ec    # -0.39f

    .line 718
    .line 719
    .line 720
    const v22, -0x4011eb85    # -1.86f

    .line 721
    .line 722
    .line 723
    const v23, -0x40f5c28f    # -0.54f

    .line 724
    .line 725
    .line 726
    const v24, -0x3f8b851f    # -3.82f

    .line 727
    .line 728
    .line 729
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 730
    .line 731
    .line 732
    const/high16 v25, 0x41880000    # 17.0f

    .line 733
    .line 734
    const v26, 0x41570a3d    # 13.44f

    .line 735
    .line 736
    .line 737
    const v21, 0x4190a3d7    # 18.08f

    .line 738
    .line 739
    .line 740
    const v22, 0x416451ec    # 14.27f

    .line 741
    .line 742
    .line 743
    const v23, 0x418bc28f    # 17.47f

    .line 744
    .line 745
    .line 746
    const v24, 0x415ee148    # 13.93f

    .line 747
    .line 748
    .line 749
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 750
    .line 751
    .line 752
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 753
    .line 754
    .line 755
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 756
    .line 757
    .line 758
    move-result-object v2

    .line 759
    const v6, 0x3e99999a    # 0.3f

    .line 760
    .line 761
    .line 762
    const/4 v7, 0x0

    .line 763
    const-string v4, ""

    .line 764
    .line 765
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 766
    .line 767
    .line 768
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 769
    .line 770
    .line 771
    move-result v3

    .line 772
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 773
    .line 774
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 775
    .line 776
    .line 777
    move-result-wide v6

    .line 778
    const/4 v0, 0x0

    .line 779
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 780
    .line 781
    .line 782
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 783
    .line 784
    .line 785
    move-result v10

    .line 786
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 787
    .line 788
    .line 789
    move-result v11

    .line 790
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 791
    .line 792
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 793
    .line 794
    .line 795
    const/high16 v0, 0x40000000    # 2.0f

    .line 796
    .line 797
    const/high16 v2, 0x41400000    # 12.0f

    .line 798
    .line 799
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 800
    .line 801
    .line 802
    const/high16 v17, -0x3ed00000    # -11.0f

    .line 803
    .line 804
    const/high16 v18, 0x40e00000    # 7.0f

    .line 805
    .line 806
    const/high16 v15, -0x3f600000    # -5.0f

    .line 807
    .line 808
    const/high16 v16, 0x40a00000    # 5.0f

    .line 809
    .line 810
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 811
    .line 812
    .line 813
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 814
    .line 815
    .line 816
    const v17, 0x400f5c29    # 2.24f

    .line 817
    .line 818
    .line 819
    const v18, 0x4050a3d7    # 3.26f

    .line 820
    .line 821
    .line 822
    const v14, 0x3fbeb852    # 1.49f

    .line 823
    .line 824
    .line 825
    const v15, 0x3f6e147b    # 0.93f

    .line 826
    .line 827
    .line 828
    const/high16 v16, 0x40300000    # 2.75f

    .line 829
    .line 830
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 831
    .line 832
    .line 833
    const/high16 v17, 0x40000000    # 2.0f

    .line 834
    .line 835
    const/high16 v18, 0x41b00000    # 22.0f

    .line 836
    .line 837
    const v13, 0x404ccccd    # 3.2f

    .line 838
    .line 839
    .line 840
    const v14, 0x4186147b    # 16.76f

    .line 841
    .line 842
    .line 843
    const v15, 0x403ae148    # 2.92f

    .line 844
    .line 845
    .line 846
    const v16, 0x419d851f    # 19.69f

    .line 847
    .line 848
    .line 849
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 850
    .line 851
    .line 852
    const/high16 v0, 0x41a00000    # 20.0f

    .line 853
    .line 854
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 855
    .line 856
    .line 857
    const v17, -0x406147ae    # -1.24f

    .line 858
    .line 859
    .line 860
    const v18, -0x3f0851ec    # -7.74f

    .line 861
    .line 862
    .line 863
    const v13, -0x40947ae1    # -0.92f

    .line 864
    .line 865
    .line 866
    const v14, -0x3fec28f6    # -2.31f

    .line 867
    .line 868
    .line 869
    const v15, -0x40666666    # -1.2f

    .line 870
    .line 871
    .line 872
    const v16, -0x3f5851ec    # -5.24f

    .line 873
    .line 874
    .line 875
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 876
    .line 877
    .line 878
    const/high16 v17, 0x41b80000    # 23.0f

    .line 879
    .line 880
    const/high16 v18, 0x41300000    # 11.0f

    .line 881
    .line 882
    const v13, 0x41b08f5c    # 22.07f

    .line 883
    .line 884
    .line 885
    const/high16 v14, 0x415c0000    # 13.75f

    .line 886
    .line 887
    const/high16 v15, 0x41b80000    # 23.0f

    .line 888
    .line 889
    const v16, 0x4147d70a    # 12.49f

    .line 890
    .line 891
    .line 892
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 893
    .line 894
    .line 895
    const/high16 v0, 0x41100000    # 9.0f

    .line 896
    .line 897
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 898
    .line 899
    .line 900
    const/high16 v17, 0x41400000    # 12.0f

    .line 901
    .line 902
    const/high16 v18, 0x40000000    # 2.0f

    .line 903
    .line 904
    const/high16 v13, 0x41880000    # 17.0f

    .line 905
    .line 906
    const/high16 v14, 0x40e00000    # 7.0f

    .line 907
    .line 908
    const/high16 v15, 0x41400000    # 12.0f

    .line 909
    .line 910
    const/high16 v16, 0x40000000    # 2.0f

    .line 911
    .line 912
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 913
    .line 914
    .line 915
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 916
    .line 917
    .line 918
    const v0, 0x4096b852    # 4.71f

    .line 919
    .line 920
    .line 921
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 922
    .line 923
    .line 924
    const v17, 0x40c3851f    # 6.11f

    .line 925
    .line 926
    .line 927
    const v18, 0x408947ae    # 4.29f

    .line 928
    .line 929
    .line 930
    const v13, 0x3faa3d71    # 1.33f

    .line 931
    .line 932
    .line 933
    const v14, 0x3f91eb85    # 1.14f

    .line 934
    .line 935
    .line 936
    const v15, 0x405f5c29    # 3.49f

    .line 937
    .line 938
    .line 939
    const v16, 0x4035c28f    # 2.84f

    .line 940
    .line 941
    .line 942
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 943
    .line 944
    .line 945
    const v0, 0x40bc7ae1    # 5.89f

    .line 946
    .line 947
    .line 948
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 949
    .line 950
    .line 951
    const/high16 v17, 0x41400000    # 12.0f

    .line 952
    .line 953
    const v18, 0x4096b852    # 4.71f

    .line 954
    .line 955
    .line 956
    const v13, 0x410828f6    # 8.51f

    .line 957
    .line 958
    .line 959
    const v14, 0x40f1999a    # 7.55f

    .line 960
    .line 961
    .line 962
    const v15, 0x412ab852    # 10.67f

    .line 963
    .line 964
    .line 965
    const v16, 0x40bb3333    # 5.85f

    .line 966
    .line 967
    .line 968
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 969
    .line 970
    .line 971
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 972
    .line 973
    .line 974
    const/high16 v0, 0x40400000    # 3.0f

    .line 975
    .line 976
    const/high16 v2, 0x41300000    # 11.0f

    .line 977
    .line 978
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 979
    .line 980
    .line 981
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 982
    .line 983
    .line 984
    const/high16 v17, -0x40400000    # -1.5f

    .line 985
    .line 986
    const/high16 v18, 0x3fc00000    # 1.5f

    .line 987
    .line 988
    const/4 v13, 0x0

    .line 989
    const v14, 0x3f547ae1    # 0.83f

    .line 990
    .line 991
    .line 992
    const v15, -0x40d47ae1    # -0.67f

    .line 993
    .line 994
    .line 995
    const/high16 v16, 0x3fc00000    # 1.5f

    .line 996
    .line 997
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 998
    .line 999
    .line 1000
    const v0, 0x413d47ae    # 11.83f

    .line 1001
    .line 1002
    .line 1003
    const/high16 v2, 0x40400000    # 3.0f

    .line 1004
    .line 1005
    const/high16 v4, 0x41300000    # 11.0f

    .line 1006
    .line 1007
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1008
    .line 1009
    .line 1010
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1011
    .line 1012
    .line 1013
    const v0, 0x40ea8f5c    # 7.33f

    .line 1014
    .line 1015
    .line 1016
    const/high16 v2, 0x41a00000    # 20.0f

    .line 1017
    .line 1018
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1019
    .line 1020
    .line 1021
    const v0, 0x40951eb8    # 4.66f

    .line 1022
    .line 1023
    .line 1024
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1025
    .line 1026
    .line 1027
    const v17, 0x3f11eb85    # 0.57f

    .line 1028
    .line 1029
    .line 1030
    const v18, -0x3f4d70a4    # -5.58f

    .line 1031
    .line 1032
    .line 1033
    const v13, 0x3ec7ae14    # 0.39f

    .line 1034
    .line 1035
    .line 1036
    const v14, -0x4011eb85    # -1.86f

    .line 1037
    .line 1038
    .line 1039
    const v15, 0x3f0a3d71    # 0.54f

    .line 1040
    .line 1041
    .line 1042
    const v16, -0x3f8b851f    # -3.82f

    .line 1043
    .line 1044
    .line 1045
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1046
    .line 1047
    .line 1048
    const v17, 0x3fe147ae    # 1.76f

    .line 1049
    .line 1050
    .line 1051
    const v18, -0x40851eb8    # -0.98f

    .line 1052
    .line 1053
    .line 1054
    const v13, 0x3f2e147b    # 0.68f

    .line 1055
    .line 1056
    .line 1057
    const v14, -0x41e66666    # -0.15f

    .line 1058
    .line 1059
    .line 1060
    const v15, 0x3fa51eb8    # 1.29f

    .line 1061
    .line 1062
    .line 1063
    const v16, -0x41051eb8    # -0.49f

    .line 1064
    .line 1065
    .line 1066
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1067
    .line 1068
    .line 1069
    const v17, 0x3f59999a    # 0.85f

    .line 1070
    .line 1071
    .line 1072
    const v18, 0x3f1eb852    # 0.62f

    .line 1073
    .line 1074
    .line 1075
    const/high16 v13, 0x3e800000    # 0.25f

    .line 1076
    .line 1077
    const/high16 v14, 0x3e800000    # 0.25f

    .line 1078
    .line 1079
    const v15, 0x3f0a3d71    # 0.54f

    .line 1080
    .line 1081
    .line 1082
    const v16, 0x3ee66666    # 0.45f

    .line 1083
    .line 1084
    .line 1085
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1086
    .line 1087
    .line 1088
    const v17, 0x40ea8f5c    # 7.33f

    .line 1089
    .line 1090
    .line 1091
    const/high16 v18, 0x41a00000    # 20.0f

    .line 1092
    .line 1093
    const v13, 0x40f851ec    # 7.76f

    .line 1094
    .line 1095
    .line 1096
    const v14, 0x417ee148    # 15.93f

    .line 1097
    .line 1098
    .line 1099
    const v15, 0x40f33333    # 7.6f

    .line 1100
    .line 1101
    .line 1102
    const v16, 0x41907ae1    # 18.06f

    .line 1103
    .line 1104
    .line 1105
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1106
    .line 1107
    .line 1108
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1109
    .line 1110
    .line 1111
    const/high16 v0, 0x41000000    # 8.0f

    .line 1112
    .line 1113
    const/high16 v2, 0x41300000    # 11.0f

    .line 1114
    .line 1115
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1116
    .line 1117
    .line 1118
    const/high16 v0, 0x40400000    # 3.0f

    .line 1119
    .line 1120
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1121
    .line 1122
    .line 1123
    const/high16 v17, -0x40400000    # -1.5f

    .line 1124
    .line 1125
    const/high16 v18, 0x3fc00000    # 1.5f

    .line 1126
    .line 1127
    const/4 v13, 0x0

    .line 1128
    const v14, 0x3f547ae1    # 0.83f

    .line 1129
    .line 1130
    .line 1131
    const v15, -0x40d47ae1    # -0.67f

    .line 1132
    .line 1133
    .line 1134
    const/high16 v16, 0x3fc00000    # 1.5f

    .line 1135
    .line 1136
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1137
    .line 1138
    .line 1139
    const v0, 0x413d47ae    # 11.83f

    .line 1140
    .line 1141
    .line 1142
    const/high16 v2, 0x41000000    # 8.0f

    .line 1143
    .line 1144
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1145
    .line 1146
    .line 1147
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1148
    .line 1149
    .line 1150
    const v0, 0x4115999a    # 9.35f

    .line 1151
    .line 1152
    .line 1153
    const/high16 v2, 0x41a00000    # 20.0f

    .line 1154
    .line 1155
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1156
    .line 1157
    .line 1158
    const v17, 0x3ef5c28f    # 0.48f

    .line 1159
    .line 1160
    .line 1161
    const v18, -0x3f4f0a3d    # -5.53f

    .line 1162
    .line 1163
    .line 1164
    const v13, 0x3e75c28f    # 0.24f

    .line 1165
    .line 1166
    .line 1167
    const v14, -0x4015c28f    # -1.83f

    .line 1168
    .line 1169
    .line 1170
    const v15, 0x3ec7ae14    # 0.39f

    .line 1171
    .line 1172
    .line 1173
    const v16, -0x3f8e147b    # -3.78f

    .line 1174
    .line 1175
    .line 1176
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1177
    .line 1178
    .line 1179
    const v17, 0x400ae148    # 2.17f

    .line 1180
    .line 1181
    .line 1182
    const v18, -0x407d70a4    # -1.02f

    .line 1183
    .line 1184
    .line 1185
    const v13, 0x3f570a3d    # 0.84f

    .line 1186
    .line 1187
    .line 1188
    const v14, -0x425c28f6    # -0.08f

    .line 1189
    .line 1190
    .line 1191
    const v15, 0x3fce147b    # 1.61f

    .line 1192
    .line 1193
    .line 1194
    const v16, -0x4119999a    # -0.45f

    .line 1195
    .line 1196
    .line 1197
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1198
    .line 1199
    .line 1200
    const v18, 0x3f828f5c    # 1.02f

    .line 1201
    .line 1202
    .line 1203
    const v13, 0x3f0f5c29    # 0.56f

    .line 1204
    .line 1205
    .line 1206
    const v14, 0x3f11eb85    # 0.57f

    .line 1207
    .line 1208
    .line 1209
    const v15, 0x3fa8f5c3    # 1.32f

    .line 1210
    .line 1211
    .line 1212
    const v16, 0x3f70a3d7    # 0.94f

    .line 1213
    .line 1214
    .line 1215
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1216
    .line 1217
    .line 1218
    const v17, 0x3ef5c28f    # 0.48f

    .line 1219
    .line 1220
    .line 1221
    const v18, 0x40b0f5c3    # 5.53f

    .line 1222
    .line 1223
    .line 1224
    const v13, 0x3dcccccd    # 0.1f

    .line 1225
    .line 1226
    .line 1227
    const/high16 v14, 0x3fe00000    # 1.75f

    .line 1228
    .line 1229
    const v15, 0x3e75c28f    # 0.24f

    .line 1230
    .line 1231
    .line 1232
    const v16, 0x406ccccd    # 3.7f

    .line 1233
    .line 1234
    .line 1235
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1236
    .line 1237
    .line 1238
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1239
    .line 1240
    .line 1241
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1242
    .line 1243
    .line 1244
    const/high16 v0, 0x41680000    # 14.5f

    .line 1245
    .line 1246
    const/high16 v2, 0x41480000    # 12.5f

    .line 1247
    .line 1248
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1249
    .line 1250
    .line 1251
    const/high16 v17, -0x40400000    # -1.5f

    .line 1252
    .line 1253
    const/high16 v18, -0x40400000    # -1.5f

    .line 1254
    .line 1255
    const v13, -0x40ab851f    # -0.83f

    .line 1256
    .line 1257
    .line 1258
    const/4 v14, 0x0

    .line 1259
    const/high16 v15, -0x40400000    # -1.5f

    .line 1260
    .line 1261
    const v16, -0x40d47ae1    # -0.67f

    .line 1262
    .line 1263
    .line 1264
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1265
    .line 1266
    .line 1267
    const/high16 v0, 0x40400000    # 3.0f

    .line 1268
    .line 1269
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1270
    .line 1271
    .line 1272
    const/high16 v17, 0x41680000    # 14.5f

    .line 1273
    .line 1274
    const/high16 v18, 0x41480000    # 12.5f

    .line 1275
    .line 1276
    const/high16 v13, 0x41800000    # 16.0f

    .line 1277
    .line 1278
    const v14, 0x413d47ae    # 11.83f

    .line 1279
    .line 1280
    .line 1281
    const v15, 0x417547ae    # 15.33f

    .line 1282
    .line 1283
    .line 1284
    const/high16 v16, 0x41480000    # 12.5f

    .line 1285
    .line 1286
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1287
    .line 1288
    .line 1289
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1290
    .line 1291
    .line 1292
    const v0, 0x41855c29    # 16.67f

    .line 1293
    .line 1294
    .line 1295
    const/high16 v2, 0x41a00000    # 20.0f

    .line 1296
    .line 1297
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1298
    .line 1299
    .line 1300
    const v17, -0x40fae148    # -0.52f

    .line 1301
    .line 1302
    .line 1303
    const v18, -0x3f423d71    # -5.93f

    .line 1304
    .line 1305
    .line 1306
    const v13, -0x4175c28f    # -0.27f

    .line 1307
    .line 1308
    .line 1309
    const v14, -0x4007ae14    # -1.94f

    .line 1310
    .line 1311
    .line 1312
    const v15, -0x4123d70a    # -0.43f

    .line 1313
    .line 1314
    .line 1315
    const v16, -0x3f7dc28f    # -4.07f

    .line 1316
    .line 1317
    .line 1318
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1319
    .line 1320
    .line 1321
    const v17, 0x3f59999a    # 0.85f

    .line 1322
    .line 1323
    .line 1324
    const v18, -0x40e147ae    # -0.62f

    .line 1325
    .line 1326
    .line 1327
    const v13, 0x3e9eb852    # 0.31f

    .line 1328
    .line 1329
    .line 1330
    const v14, -0x41d1eb85    # -0.17f

    .line 1331
    .line 1332
    .line 1333
    const v15, 0x3f1c28f6    # 0.61f

    .line 1334
    .line 1335
    .line 1336
    const v16, -0x41428f5c    # -0.37f

    .line 1337
    .line 1338
    .line 1339
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1340
    .line 1341
    .line 1342
    const v17, 0x3fe147ae    # 1.76f

    .line 1343
    .line 1344
    .line 1345
    const v18, 0x3f7ae148    # 0.98f

    .line 1346
    .line 1347
    .line 1348
    const v13, 0x3ef0a3d7    # 0.47f

    .line 1349
    .line 1350
    .line 1351
    const v14, 0x3ef5c28f    # 0.48f

    .line 1352
    .line 1353
    .line 1354
    const v15, 0x3f8a3d71    # 1.08f

    .line 1355
    .line 1356
    .line 1357
    const v16, 0x3f547ae1    # 0.83f

    .line 1358
    .line 1359
    .line 1360
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1361
    .line 1362
    .line 1363
    const v17, 0x3f11eb85    # 0.57f

    .line 1364
    .line 1365
    .line 1366
    const v18, 0x40b28f5c    # 5.58f

    .line 1367
    .line 1368
    .line 1369
    const v13, 0x3cf5c28f    # 0.03f

    .line 1370
    .line 1371
    .line 1372
    const v14, 0x3fe147ae    # 1.76f

    .line 1373
    .line 1374
    .line 1375
    const v15, 0x3e3851ec    # 0.18f

    .line 1376
    .line 1377
    .line 1378
    const v16, 0x406e147b    # 3.72f

    .line 1379
    .line 1380
    .line 1381
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1382
    .line 1383
    .line 1384
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1385
    .line 1386
    .line 1387
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1388
    .line 1389
    .line 1390
    const/high16 v0, 0x419c0000    # 19.5f

    .line 1391
    .line 1392
    const/high16 v2, 0x41480000    # 12.5f

    .line 1393
    .line 1394
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1395
    .line 1396
    .line 1397
    const/high16 v17, -0x40400000    # -1.5f

    .line 1398
    .line 1399
    const/high16 v18, -0x40400000    # -1.5f

    .line 1400
    .line 1401
    const v13, -0x40ab851f    # -0.83f

    .line 1402
    .line 1403
    .line 1404
    const/4 v14, 0x0

    .line 1405
    const/high16 v15, -0x40400000    # -1.5f

    .line 1406
    .line 1407
    const v16, -0x40d47ae1    # -0.67f

    .line 1408
    .line 1409
    .line 1410
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1411
    .line 1412
    .line 1413
    const/high16 v0, 0x40400000    # 3.0f

    .line 1414
    .line 1415
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1416
    .line 1417
    .line 1418
    const/high16 v17, 0x419c0000    # 19.5f

    .line 1419
    .line 1420
    const/high16 v18, 0x41480000    # 12.5f

    .line 1421
    .line 1422
    const/high16 v13, 0x41a80000    # 21.0f

    .line 1423
    .line 1424
    const v14, 0x413d47ae    # 11.83f

    .line 1425
    .line 1426
    .line 1427
    const v15, 0x41a2a3d7    # 20.33f

    .line 1428
    .line 1429
    .line 1430
    const/high16 v16, 0x41480000    # 12.5f

    .line 1431
    .line 1432
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1433
    .line 1434
    .line 1435
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1436
    .line 1437
    .line 1438
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 1439
    .line 1440
    .line 1441
    move-result-object v2

    .line 1442
    const/16 v16, 0x3800

    .line 1443
    .line 1444
    const/16 v17, 0x0

    .line 1445
    .line 1446
    const/high16 v6, 0x3f800000    # 1.0f

    .line 1447
    .line 1448
    const/high16 v8, 0x3f800000    # 1.0f

    .line 1449
    .line 1450
    const/4 v7, 0x0

    .line 1451
    const/high16 v12, 0x3f800000    # 1.0f

    .line 1452
    .line 1453
    const/4 v13, 0x0

    .line 1454
    const/4 v14, 0x0

    .line 1455
    const/4 v15, 0x0

    .line 1456
    const-string v4, ""

    .line 1457
    .line 1458
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 1459
    .line 1460
    .line 1461
    move-result-object v0

    .line 1462
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1463
    .line 1464
    .line 1465
    move-result-object v0

    .line 1466
    sput-object v0, Landroidx/compose/material/icons/twotone/FestivalKt;->_festival:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1467
    .line 1468
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 1469
    .line 1470
    .line 1471
    return-object v0
.end method
