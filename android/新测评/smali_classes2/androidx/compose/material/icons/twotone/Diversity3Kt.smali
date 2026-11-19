.class public final Landroidx/compose/material/icons/twotone/Diversity3Kt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_diversity3",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "Diversity3",
        "Landroidx/compose/material/icons/Icons$TwoTone;",
        "getDiversity3",
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
        "SMAP\nDiversity3.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Diversity3.kt\nandroidx/compose/material/icons/twotone/Diversity3Kt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,91:1\n212#2,12:92\n233#2,18:105\n253#2:142\n233#2,18:143\n253#2:180\n233#2,18:181\n253#2:218\n233#2,18:219\n253#2:256\n233#2,18:257\n253#2:294\n174#3:104\n705#4,2:123\n717#4,2:125\n719#4,11:131\n705#4,2:161\n717#4,2:163\n719#4,11:169\n705#4,2:199\n717#4,2:201\n719#4,11:207\n705#4,2:237\n717#4,2:239\n719#4,11:245\n705#4,2:275\n717#4,2:277\n719#4,11:283\n72#5,4:127\n72#5,4:165\n72#5,4:203\n72#5,4:241\n72#5,4:279\n*S KotlinDebug\n*F\n+ 1 Diversity3.kt\nandroidx/compose/material/icons/twotone/Diversity3Kt\n*L\n29#1:92,12\n30#1:105,18\n30#1:142\n40#1:143,18\n40#1:180\n49#1:181,18\n49#1:218\n58#1:219,18\n58#1:256\n66#1:257,18\n66#1:294\n29#1:104\n30#1:123,2\n30#1:125,2\n30#1:131,11\n40#1:161,2\n40#1:163,2\n40#1:169,11\n49#1:199,2\n49#1:201,2\n49#1:207,11\n58#1:237,2\n58#1:239,2\n58#1:245,11\n66#1:275,2\n66#1:277,2\n66#1:283,11\n30#1:127,4\n40#1:165,4\n49#1:203,4\n58#1:241,4\n66#1:279,4\n*E\n"
    }
.end annotation


# static fields
.field private static _diversity3:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getDiversity3(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/Diversity3Kt;->_diversity3:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.Diversity3"

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
    const v4, 0x40ca3d71    # 6.32f

    .line 71
    .line 72
    .line 73
    const v6, 0x415028f6    # 13.01f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v25, 0x401ccccd    # 2.45f

    .line 80
    .line 81
    .line 82
    const v26, 0x3fab851f    # 1.34f

    .line 83
    .line 84
    .line 85
    const v21, 0x3f75c28f    # 0.96f

    .line 86
    .line 87
    .line 88
    const v22, 0x3ca3d70a    # 0.02f

    .line 89
    .line 90
    .line 91
    const v23, 0x3feccccd    # 1.85f

    .line 92
    .line 93
    .line 94
    const/high16 v24, 0x3f000000    # 0.5f

    .line 95
    .line 96
    move-object/from16 v20, v2

    .line 97
    .line 98
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 99
    .line 100
    .line 101
    const/high16 v25, 0x41400000    # 12.0f

    .line 102
    .line 103
    const/high16 v26, 0x41800000    # 16.0f

    .line 104
    .line 105
    const/high16 v21, 0x41180000    # 9.5f

    .line 106
    .line 107
    const v22, 0x4176147b    # 15.38f

    .line 108
    .line 109
    .line 110
    const v23, 0x412b5c29    # 10.71f

    .line 111
    .line 112
    .line 113
    const/high16 v24, 0x41800000    # 16.0f

    .line 114
    .line 115
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 116
    .line 117
    .line 118
    const v25, 0x404eb852    # 3.23f

    .line 119
    .line 120
    .line 121
    const v26, -0x402b851f    # -1.66f

    .line 122
    .line 123
    .line 124
    const v21, 0x3fa51eb8    # 1.29f

    .line 125
    .line 126
    .line 127
    const/16 v22, 0x0

    .line 128
    .line 129
    const/high16 v23, 0x40200000    # 2.5f

    .line 130
    .line 131
    const v24, -0x40e147ae    # -0.62f

    .line 132
    .line 133
    .line 134
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 135
    .line 136
    .line 137
    const v25, 0x401ccccd    # 2.45f

    .line 138
    .line 139
    .line 140
    const v26, -0x40547ae1    # -1.34f

    .line 141
    .line 142
    .line 143
    const v21, 0x3f19999a    # 0.6f

    .line 144
    .line 145
    .line 146
    const v22, -0x40a8f5c3    # -0.84f

    .line 147
    .line 148
    .line 149
    const v23, 0x3fbeb852    # 1.49f

    .line 150
    .line 151
    .line 152
    const v24, -0x40570a3d    # -1.32f

    .line 153
    .line 154
    .line 155
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 156
    .line 157
    .line 158
    const/high16 v25, 0x41400000    # 12.0f

    .line 159
    .line 160
    const/high16 v26, 0x41300000    # 11.0f

    .line 161
    .line 162
    const v21, 0x4187ae14    # 16.96f

    .line 163
    .line 164
    .line 165
    const v22, 0x413c7ae1    # 11.78f

    .line 166
    .line 167
    .line 168
    const v23, 0x416147ae    # 14.08f

    .line 169
    .line 170
    .line 171
    const/high16 v24, 0x41300000    # 11.0f

    .line 172
    .line 173
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 174
    .line 175
    .line 176
    const v25, 0x40ca3d71    # 6.32f

    .line 177
    .line 178
    .line 179
    const v26, 0x415028f6    # 13.01f

    .line 180
    .line 181
    .line 182
    const v21, 0x411ee148    # 9.93f

    .line 183
    .line 184
    .line 185
    const/high16 v22, 0x41300000    # 11.0f

    .line 186
    .line 187
    const v23, 0x40e147ae    # 7.04f

    .line 188
    .line 189
    .line 190
    const v24, 0x413c7ae1    # 11.78f

    .line 191
    .line 192
    .line 193
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 194
    .line 195
    .line 196
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 197
    .line 198
    .line 199
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 200
    .line 201
    .line 202
    move-result-object v2

    .line 203
    const/16 v16, 0x3800

    .line 204
    .line 205
    const/16 v17, 0x0

    .line 206
    .line 207
    const/high16 v6, 0x3f800000    # 1.0f

    .line 208
    .line 209
    const/high16 v8, 0x3f800000    # 1.0f

    .line 210
    .line 211
    const/4 v7, 0x0

    .line 212
    const/high16 v9, 0x3f800000    # 1.0f

    .line 213
    .line 214
    const/high16 v12, 0x3f800000    # 1.0f

    .line 215
    .line 216
    const/4 v13, 0x0

    .line 217
    const/4 v14, 0x0

    .line 218
    const/4 v15, 0x0

    .line 219
    const-string v4, ""

    .line 220
    .line 221
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 222
    .line 223
    .line 224
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 225
    .line 226
    .line 227
    move-result v3

    .line 228
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 229
    .line 230
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 231
    .line 232
    .line 233
    move-result-wide v6

    .line 234
    const/4 v2, 0x0

    .line 235
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 236
    .line 237
    .line 238
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 239
    .line 240
    .line 241
    move-result v10

    .line 242
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 243
    .line 244
    .line 245
    move-result v11

    .line 246
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 247
    .line 248
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 249
    .line 250
    .line 251
    const/high16 v4, 0x41500000    # 13.0f

    .line 252
    .line 253
    const/high16 v6, 0x40800000    # 4.0f

    .line 254
    .line 255
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 256
    .line 257
    .line 258
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 259
    .line 260
    .line 261
    const/high16 v25, 0x40400000    # 3.0f

    .line 262
    .line 263
    const/high16 v26, -0x3fc00000    # -3.0f

    .line 264
    .line 265
    const v21, 0x3fd47ae1    # 1.66f

    .line 266
    .line 267
    .line 268
    const/16 v22, 0x0

    .line 269
    .line 270
    const/high16 v23, 0x40400000    # 3.0f

    .line 271
    .line 272
    const v24, -0x40547ae1    # -1.34f

    .line 273
    .line 274
    .line 275
    move-object/from16 v20, v2

    .line 276
    .line 277
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 278
    .line 279
    .line 280
    const/high16 v25, -0x3fc00000    # -3.0f

    .line 281
    .line 282
    const/16 v21, 0x0

    .line 283
    .line 284
    const v22, -0x402b851f    # -1.66f

    .line 285
    .line 286
    .line 287
    const v23, -0x40547ae1    # -1.34f

    .line 288
    .line 289
    .line 290
    const/high16 v24, -0x3fc00000    # -3.0f

    .line 291
    .line 292
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 293
    .line 294
    .line 295
    const v4, 0x3fab851f    # 1.34f

    .line 296
    .line 297
    .line 298
    const/high16 v6, 0x40400000    # 3.0f

    .line 299
    .line 300
    const/high16 v7, -0x3fc00000    # -3.0f

    .line 301
    .line 302
    invoke-virtual {v2, v7, v4, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 303
    .line 304
    .line 305
    const/high16 v25, 0x40800000    # 4.0f

    .line 306
    .line 307
    const/high16 v26, 0x41500000    # 13.0f

    .line 308
    .line 309
    const/high16 v21, 0x3f800000    # 1.0f

    .line 310
    .line 311
    const v22, 0x413a8f5c    # 11.66f

    .line 312
    .line 313
    .line 314
    const v23, 0x4015c28f    # 2.34f

    .line 315
    .line 316
    .line 317
    const/high16 v24, 0x41500000    # 13.0f

    .line 318
    .line 319
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 320
    .line 321
    .line 322
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 323
    .line 324
    .line 325
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 326
    .line 327
    .line 328
    move-result-object v2

    .line 329
    const/high16 v6, 0x3f800000    # 1.0f

    .line 330
    .line 331
    const/4 v7, 0x0

    .line 332
    const-string v4, ""

    .line 333
    .line 334
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 335
    .line 336
    .line 337
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 338
    .line 339
    .line 340
    move-result v3

    .line 341
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 342
    .line 343
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 344
    .line 345
    .line 346
    move-result-wide v6

    .line 347
    const/4 v2, 0x0

    .line 348
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 349
    .line 350
    .line 351
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 352
    .line 353
    .line 354
    move-result v10

    .line 355
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 356
    .line 357
    .line 358
    move-result v11

    .line 359
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 360
    .line 361
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 362
    .line 363
    .line 364
    const/high16 v4, 0x41a00000    # 20.0f

    .line 365
    .line 366
    const/high16 v6, 0x41500000    # 13.0f

    .line 367
    .line 368
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 369
    .line 370
    .line 371
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 372
    .line 373
    .line 374
    const/high16 v25, 0x40400000    # 3.0f

    .line 375
    .line 376
    const/high16 v26, -0x3fc00000    # -3.0f

    .line 377
    .line 378
    const v21, 0x3fd47ae1    # 1.66f

    .line 379
    .line 380
    .line 381
    const/16 v22, 0x0

    .line 382
    .line 383
    const/high16 v23, 0x40400000    # 3.0f

    .line 384
    .line 385
    const v24, -0x40547ae1    # -1.34f

    .line 386
    .line 387
    .line 388
    move-object/from16 v20, v2

    .line 389
    .line 390
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 391
    .line 392
    .line 393
    const/high16 v25, -0x3fc00000    # -3.0f

    .line 394
    .line 395
    const/16 v21, 0x0

    .line 396
    .line 397
    const v22, -0x402b851f    # -1.66f

    .line 398
    .line 399
    .line 400
    const v23, -0x40547ae1    # -1.34f

    .line 401
    .line 402
    .line 403
    const/high16 v24, -0x3fc00000    # -3.0f

    .line 404
    .line 405
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 406
    .line 407
    .line 408
    const v4, 0x3fab851f    # 1.34f

    .line 409
    .line 410
    .line 411
    const/high16 v6, 0x40400000    # 3.0f

    .line 412
    .line 413
    const/high16 v7, -0x3fc00000    # -3.0f

    .line 414
    .line 415
    invoke-virtual {v2, v7, v4, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 416
    .line 417
    .line 418
    const/high16 v25, 0x41a00000    # 20.0f

    .line 419
    .line 420
    const/high16 v26, 0x41500000    # 13.0f

    .line 421
    .line 422
    const/high16 v21, 0x41880000    # 17.0f

    .line 423
    .line 424
    const v22, 0x413a8f5c    # 11.66f

    .line 425
    .line 426
    .line 427
    const v23, 0x4192b852    # 18.34f

    .line 428
    .line 429
    .line 430
    const/high16 v24, 0x41500000    # 13.0f

    .line 431
    .line 432
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 433
    .line 434
    .line 435
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 436
    .line 437
    .line 438
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 439
    .line 440
    .line 441
    move-result-object v2

    .line 442
    const/high16 v6, 0x3f800000    # 1.0f

    .line 443
    .line 444
    const/4 v7, 0x0

    .line 445
    const-string v4, ""

    .line 446
    .line 447
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 448
    .line 449
    .line 450
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 451
    .line 452
    .line 453
    move-result v3

    .line 454
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 455
    .line 456
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 457
    .line 458
    .line 459
    move-result-wide v6

    .line 460
    const/4 v2, 0x0

    .line 461
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 462
    .line 463
    .line 464
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 465
    .line 466
    .line 467
    move-result v10

    .line 468
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 469
    .line 470
    .line 471
    move-result v11

    .line 472
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 473
    .line 474
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 475
    .line 476
    .line 477
    const/high16 v4, 0x41400000    # 12.0f

    .line 478
    .line 479
    const/high16 v6, 0x41200000    # 10.0f

    .line 480
    .line 481
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 482
    .line 483
    .line 484
    const/high16 v25, 0x40400000    # 3.0f

    .line 485
    .line 486
    const/high16 v26, -0x3fc00000    # -3.0f

    .line 487
    .line 488
    const v21, 0x3fd47ae1    # 1.66f

    .line 489
    .line 490
    .line 491
    const/16 v22, 0x0

    .line 492
    .line 493
    const/high16 v23, 0x40400000    # 3.0f

    .line 494
    .line 495
    const v24, -0x40547ae1    # -1.34f

    .line 496
    .line 497
    .line 498
    move-object/from16 v20, v2

    .line 499
    .line 500
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 501
    .line 502
    .line 503
    const/high16 v25, -0x3fc00000    # -3.0f

    .line 504
    .line 505
    const/16 v21, 0x0

    .line 506
    .line 507
    const v22, -0x402b851f    # -1.66f

    .line 508
    .line 509
    .line 510
    const v23, -0x40547ae1    # -1.34f

    .line 511
    .line 512
    .line 513
    const/high16 v24, -0x3fc00000    # -3.0f

    .line 514
    .line 515
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 516
    .line 517
    .line 518
    const v4, 0x40aae148    # 5.34f

    .line 519
    .line 520
    .line 521
    const/high16 v6, 0x41100000    # 9.0f

    .line 522
    .line 523
    const/high16 v7, 0x40e00000    # 7.0f

    .line 524
    .line 525
    invoke-virtual {v2, v6, v4, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 526
    .line 527
    .line 528
    const/high16 v25, 0x41400000    # 12.0f

    .line 529
    .line 530
    const/high16 v26, 0x41200000    # 10.0f

    .line 531
    .line 532
    const/high16 v21, 0x41100000    # 9.0f

    .line 533
    .line 534
    const v22, 0x410a8f5c    # 8.66f

    .line 535
    .line 536
    .line 537
    const v23, 0x412570a4    # 10.34f

    .line 538
    .line 539
    .line 540
    const/high16 v24, 0x41200000    # 10.0f

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
    const/4 v0, 0x0

    .line 571
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

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
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 583
    .line 584
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 585
    .line 586
    .line 587
    const/high16 v0, 0x41a80000    # 21.0f

    .line 588
    .line 589
    const/high16 v2, 0x41600000    # 14.0f

    .line 590
    .line 591
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 592
    .line 593
    .line 594
    const v0, -0x3faeb852    # -3.27f

    .line 595
    .line 596
    .line 597
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 598
    .line 599
    .line 600
    const v17, -0x4028f5c3    # -1.68f

    .line 601
    .line 602
    .line 603
    const v18, 0x3f6b851f    # 0.92f

    .line 604
    .line 605
    .line 606
    const v13, -0x40bae148    # -0.77f

    .line 607
    .line 608
    .line 609
    const v15, -0x40533333    # -1.35f

    .line 610
    .line 611
    .line 612
    const v16, 0x3ee66666    # 0.45f

    .line 613
    .line 614
    .line 615
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 616
    .line 617
    .line 618
    const/high16 v17, 0x41400000    # 12.0f

    .line 619
    .line 620
    const/high16 v18, 0x41880000    # 17.0f

    .line 621
    .line 622
    const v13, 0x4180147b    # 16.01f

    .line 623
    .line 624
    .line 625
    const v14, 0x416fae14    # 14.98f

    .line 626
    .line 627
    .line 628
    const v15, 0x416b0a3d    # 14.69f

    .line 629
    .line 630
    .line 631
    const/high16 v16, 0x41880000    # 17.0f

    .line 632
    .line 633
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 634
    .line 635
    .line 636
    const v17, -0x3f7e6666    # -4.05f

    .line 637
    .line 638
    .line 639
    const v18, -0x3ffae148    # -2.08f

    .line 640
    .line 641
    .line 642
    const v13, -0x4048f5c3    # -1.43f

    .line 643
    .line 644
    .line 645
    const/4 v14, 0x0

    .line 646
    const v15, -0x3fbe147b    # -3.03f

    .line 647
    .line 648
    .line 649
    const v16, -0x40dc28f6    # -0.64f

    .line 650
    .line 651
    .line 652
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 653
    .line 654
    .line 655
    const v17, 0x40c8a3d7    # 6.27f

    .line 656
    .line 657
    .line 658
    const/high16 v18, 0x41600000    # 14.0f

    .line 659
    .line 660
    const v13, 0x40f1eb85    # 7.56f

    .line 661
    .line 662
    .line 663
    const v14, 0x4165eb85    # 14.37f

    .line 664
    .line 665
    .line 666
    const v15, 0x40de6666    # 6.95f

    .line 667
    .line 668
    .line 669
    const/high16 v16, 0x41600000    # 14.0f

    .line 670
    .line 671
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 672
    .line 673
    .line 674
    const/high16 v0, 0x40400000    # 3.0f

    .line 675
    .line 676
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 677
    .line 678
    .line 679
    const/high16 v17, -0x40000000    # -2.0f

    .line 680
    .line 681
    const/high16 v18, 0x40000000    # 2.0f

    .line 682
    .line 683
    const v13, -0x40733333    # -1.1f

    .line 684
    .line 685
    .line 686
    const/4 v14, 0x0

    .line 687
    const/high16 v15, -0x40000000    # -2.0f

    .line 688
    .line 689
    const v16, 0x3f666666    # 0.9f

    .line 690
    .line 691
    .line 692
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 693
    .line 694
    .line 695
    const/high16 v0, 0x40800000    # 4.0f

    .line 696
    .line 697
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 698
    .line 699
    .line 700
    const/high16 v0, 0x40e00000    # 7.0f

    .line 701
    .line 702
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 703
    .line 704
    .line 705
    const v0, -0x3fef5c29    # -2.26f

    .line 706
    .line 707
    .line 708
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 709
    .line 710
    .line 711
    const/high16 v17, 0x40800000    # 4.0f

    .line 712
    .line 713
    const v18, 0x3fa147ae    # 1.26f

    .line 714
    .line 715
    .line 716
    const v13, 0x3f933333    # 1.15f

    .line 717
    .line 718
    .line 719
    const v14, 0x3f4ccccd    # 0.8f

    .line 720
    .line 721
    .line 722
    const v15, 0x40228f5c    # 2.54f

    .line 723
    .line 724
    .line 725
    const v16, 0x3fa147ae    # 1.26f

    .line 726
    .line 727
    .line 728
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 729
    .line 730
    .line 731
    const v0, -0x41147ae1    # -0.46f

    .line 732
    .line 733
    .line 734
    const v2, -0x405eb852    # -1.26f

    .line 735
    .line 736
    .line 737
    const/high16 v4, 0x40800000    # 4.0f

    .line 738
    .line 739
    const v6, 0x40366666    # 2.85f

    .line 740
    .line 741
    .line 742
    invoke-virtual {v12, v6, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 743
    .line 744
    .line 745
    const/high16 v0, 0x41a00000    # 20.0f

    .line 746
    .line 747
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 748
    .line 749
    .line 750
    const/high16 v0, 0x40e00000    # 7.0f

    .line 751
    .line 752
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 753
    .line 754
    .line 755
    const/high16 v0, -0x3f800000    # -4.0f

    .line 756
    .line 757
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 758
    .line 759
    .line 760
    const/high16 v17, 0x41a80000    # 21.0f

    .line 761
    .line 762
    const/high16 v18, 0x41600000    # 14.0f

    .line 763
    .line 764
    const/high16 v13, 0x41b80000    # 23.0f

    .line 765
    .line 766
    const v14, 0x416e6666    # 14.9f

    .line 767
    .line 768
    .line 769
    const v15, 0x41b0cccd    # 22.1f

    .line 770
    .line 771
    .line 772
    const/high16 v16, 0x41600000    # 14.0f

    .line 773
    .line 774
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 775
    .line 776
    .line 777
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 778
    .line 779
    .line 780
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 781
    .line 782
    .line 783
    move-result-object v2

    .line 784
    const/16 v16, 0x3800

    .line 785
    .line 786
    const/16 v17, 0x0

    .line 787
    .line 788
    const/high16 v6, 0x3f800000    # 1.0f

    .line 789
    .line 790
    const/4 v7, 0x0

    .line 791
    const/high16 v12, 0x3f800000    # 1.0f

    .line 792
    .line 793
    const/4 v13, 0x0

    .line 794
    const/4 v14, 0x0

    .line 795
    const/4 v15, 0x0

    .line 796
    const-string v4, ""

    .line 797
    .line 798
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 799
    .line 800
    .line 801
    move-result-object v0

    .line 802
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 803
    .line 804
    .line 805
    move-result-object v0

    .line 806
    sput-object v0, Landroidx/compose/material/icons/twotone/Diversity3Kt;->_diversity3:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 807
    .line 808
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 809
    .line 810
    .line 811
    return-object v0
.end method
