.class public final Landroidx/compose/material/icons/twotone/PersonSearchKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_personSearch",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "PersonSearch",
        "Landroidx/compose/material/icons/Icons$TwoTone;",
        "getPersonSearch",
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
        "SMAP\nPersonSearch.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PersonSearch.kt\nandroidx/compose/material/icons/twotone/PersonSearchKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,91:1\n212#2,12:92\n233#2,18:105\n253#2:142\n233#2,18:143\n253#2:180\n233#2,18:181\n253#2:218\n233#2,18:219\n253#2:256\n233#2,18:257\n253#2:294\n174#3:104\n705#4,2:123\n717#4,2:125\n719#4,11:131\n705#4,2:161\n717#4,2:163\n719#4,11:169\n705#4,2:199\n717#4,2:201\n719#4,11:207\n705#4,2:237\n717#4,2:239\n719#4,11:245\n705#4,2:275\n717#4,2:277\n719#4,11:283\n72#5,4:127\n72#5,4:165\n72#5,4:203\n72#5,4:241\n72#5,4:279\n*S KotlinDebug\n*F\n+ 1 PersonSearch.kt\nandroidx/compose/material/icons/twotone/PersonSearchKt\n*L\n29#1:92,12\n30#1:105,18\n30#1:142\n41#1:143,18\n41#1:180\n55#1:181,18\n55#1:218\n62#1:219,18\n62#1:256\n80#1:257,18\n80#1:294\n29#1:104\n30#1:123,2\n30#1:125,2\n30#1:131,11\n41#1:161,2\n41#1:163,2\n41#1:169,11\n55#1:199,2\n55#1:201,2\n55#1:207,11\n62#1:237,2\n62#1:239,2\n62#1:245,11\n80#1:275,2\n80#1:277,2\n80#1:283,11\n30#1:127,4\n41#1:165,4\n55#1:203,4\n62#1:241,4\n80#1:279,4\n*E\n"
    }
.end annotation


# static fields
.field private static _personSearch:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getPersonSearch(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/PersonSearchKt;->_personSearch:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.PersonSearch"

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
    const/high16 v4, 0x41900000    # 18.0f

    .line 71
    .line 72
    const/high16 v6, 0x40800000    # 4.0f

    .line 73
    .line 74
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v25, 0x40c00000    # 6.0f

    .line 78
    .line 79
    const/high16 v26, -0x40000000    # -2.0f

    .line 80
    .line 81
    const v21, 0x3e6147ae    # 0.22f

    .line 82
    .line 83
    .line 84
    const v22, -0x40c7ae14    # -0.72f

    .line 85
    .line 86
    .line 87
    const v23, 0x4053d70a    # 3.31f

    .line 88
    .line 89
    .line 90
    const/high16 v24, -0x40000000    # -2.0f

    .line 91
    .line 92
    move-object/from16 v20, v2

    .line 93
    .line 94
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 95
    .line 96
    .line 97
    const v25, 0x3eb33333    # 0.35f

    .line 98
    .line 99
    .line 100
    const v26, -0x400147ae    # -1.99f

    .line 101
    .line 102
    .line 103
    const/16 v21, 0x0

    .line 104
    .line 105
    const v22, -0x40cccccd    # -0.7f

    .line 106
    .line 107
    .line 108
    const v23, 0x3e051eb8    # 0.13f

    .line 109
    .line 110
    .line 111
    const v24, -0x4050a3d7    # -1.37f

    .line 112
    .line 113
    .line 114
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 115
    .line 116
    .line 117
    const/high16 v25, 0x40000000    # 2.0f

    .line 118
    .line 119
    const/high16 v26, 0x41900000    # 18.0f

    .line 120
    .line 121
    const v21, 0x40f3d70a    # 7.62f

    .line 122
    .line 123
    .line 124
    const v22, 0x415e8f5c    # 13.91f

    .line 125
    .line 126
    .line 127
    const/high16 v23, 0x40000000    # 2.0f

    .line 128
    .line 129
    const v24, 0x417451ec    # 15.27f

    .line 130
    .line 131
    .line 132
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 133
    .line 134
    .line 135
    const/high16 v4, 0x40000000    # 2.0f

    .line 136
    .line 137
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 138
    .line 139
    .line 140
    const v4, 0x4118a3d7    # 9.54f

    .line 141
    .line 142
    .line 143
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 144
    .line 145
    .line 146
    const v25, -0x4067ae14    # -1.19f

    .line 147
    .line 148
    .line 149
    const/high16 v26, -0x40000000    # -2.0f

    .line 150
    .line 151
    const v21, -0x40fae148    # -0.52f

    .line 152
    .line 153
    .line 154
    const v22, -0x40eb851f    # -0.58f

    .line 155
    .line 156
    .line 157
    const v23, -0x4091eb85    # -0.93f

    .line 158
    .line 159
    .line 160
    const/high16 v24, -0x40600000    # -1.25f

    .line 161
    .line 162
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 163
    .line 164
    .line 165
    const/high16 v4, 0x40800000    # 4.0f

    .line 166
    .line 167
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 168
    .line 169
    .line 170
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 171
    .line 172
    .line 173
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 174
    .line 175
    .line 176
    move-result-object v2

    .line 177
    const/16 v16, 0x3800

    .line 178
    .line 179
    const/16 v17, 0x0

    .line 180
    .line 181
    const/high16 v6, 0x3f800000    # 1.0f

    .line 182
    .line 183
    const/high16 v8, 0x3f800000    # 1.0f

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
    const/high16 v4, 0x41500000    # 13.0f

    .line 226
    .line 227
    const/high16 v6, 0x41200000    # 10.0f

    .line 228
    .line 229
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 230
    .line 231
    .line 232
    const/high16 v25, 0x40800000    # 4.0f

    .line 233
    .line 234
    const/high16 v26, -0x3f800000    # -4.0f

    .line 235
    .line 236
    const v21, 0x400d70a4    # 2.21f

    .line 237
    .line 238
    .line 239
    const/16 v22, 0x0

    .line 240
    .line 241
    const/high16 v23, 0x40800000    # 4.0f

    .line 242
    .line 243
    const v24, -0x401ae148    # -1.79f

    .line 244
    .line 245
    .line 246
    move-object/from16 v20, v2

    .line 247
    .line 248
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 249
    .line 250
    .line 251
    const/high16 v25, -0x3f800000    # -4.0f

    .line 252
    .line 253
    const/16 v21, 0x0

    .line 254
    .line 255
    const v22, -0x3ff28f5c    # -2.21f

    .line 256
    .line 257
    .line 258
    const v23, -0x401ae148    # -1.79f

    .line 259
    .line 260
    .line 261
    const/high16 v24, -0x3f800000    # -4.0f

    .line 262
    .line 263
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 264
    .line 265
    .line 266
    const/high16 v25, 0x40c00000    # 6.0f

    .line 267
    .line 268
    const/high16 v26, 0x41100000    # 9.0f

    .line 269
    .line 270
    const v21, 0x40f947ae    # 7.79f

    .line 271
    .line 272
    .line 273
    const/high16 v22, 0x40a00000    # 5.0f

    .line 274
    .line 275
    const/high16 v23, 0x40c00000    # 6.0f

    .line 276
    .line 277
    const v24, 0x40d947ae    # 6.79f

    .line 278
    .line 279
    .line 280
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 281
    .line 282
    .line 283
    const/high16 v25, 0x41200000    # 10.0f

    .line 284
    .line 285
    const/high16 v26, 0x41500000    # 13.0f

    .line 286
    .line 287
    const/high16 v21, 0x40c00000    # 6.0f

    .line 288
    .line 289
    const v22, 0x41335c29    # 11.21f

    .line 290
    .line 291
    .line 292
    const v23, 0x40f947ae    # 7.79f

    .line 293
    .line 294
    .line 295
    const/high16 v24, 0x41500000    # 13.0f

    .line 296
    .line 297
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 298
    .line 299
    .line 300
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 301
    .line 302
    .line 303
    const/high16 v4, 0x40e00000    # 7.0f

    .line 304
    .line 305
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 306
    .line 307
    .line 308
    const/high16 v25, 0x40000000    # 2.0f

    .line 309
    .line 310
    const/high16 v26, 0x40000000    # 2.0f

    .line 311
    .line 312
    const v21, 0x3f8ccccd    # 1.1f

    .line 313
    .line 314
    .line 315
    const/16 v22, 0x0

    .line 316
    .line 317
    const/high16 v23, 0x40000000    # 2.0f

    .line 318
    .line 319
    const v24, 0x3f63d70a    # 0.89f

    .line 320
    .line 321
    .line 322
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 323
    .line 324
    .line 325
    const/high16 v25, -0x40000000    # -2.0f

    .line 326
    .line 327
    const/16 v21, 0x0

    .line 328
    .line 329
    const v22, 0x3f8ccccd    # 1.1f

    .line 330
    .line 331
    .line 332
    const v23, -0x4099999a    # -0.9f

    .line 333
    .line 334
    .line 335
    const/high16 v24, 0x40000000    # 2.0f

    .line 336
    .line 337
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 338
    .line 339
    .line 340
    const v4, -0x4099999a    # -0.9f

    .line 341
    .line 342
    .line 343
    const/high16 v6, -0x40000000    # -2.0f

    .line 344
    .line 345
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 346
    .line 347
    .line 348
    const/high16 v25, 0x41200000    # 10.0f

    .line 349
    .line 350
    const/high16 v26, 0x40e00000    # 7.0f

    .line 351
    .line 352
    const/high16 v21, 0x41000000    # 8.0f

    .line 353
    .line 354
    const v22, 0x40fc7ae1    # 7.89f

    .line 355
    .line 356
    .line 357
    const v23, 0x410e6666    # 8.9f

    .line 358
    .line 359
    .line 360
    const/high16 v24, 0x40e00000    # 7.0f

    .line 361
    .line 362
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 363
    .line 364
    .line 365
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 366
    .line 367
    .line 368
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 369
    .line 370
    .line 371
    move-result-object v2

    .line 372
    const/high16 v6, 0x3f800000    # 1.0f

    .line 373
    .line 374
    const/4 v7, 0x0

    .line 375
    const-string v4, ""

    .line 376
    .line 377
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 378
    .line 379
    .line 380
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 381
    .line 382
    .line 383
    move-result v3

    .line 384
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 385
    .line 386
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 387
    .line 388
    .line 389
    move-result-wide v6

    .line 390
    const/4 v2, 0x0

    .line 391
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 392
    .line 393
    .line 394
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 395
    .line 396
    .line 397
    move-result v10

    .line 398
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 399
    .line 400
    .line 401
    move-result v11

    .line 402
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 403
    .line 404
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 405
    .line 406
    .line 407
    const v4, 0x4125999a    # 10.35f

    .line 408
    .line 409
    .line 410
    const/high16 v6, 0x41900000    # 18.0f

    .line 411
    .line 412
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 413
    .line 414
    .line 415
    const v25, -0x414ccccd    # -0.35f

    .line 416
    .line 417
    .line 418
    const/high16 v26, -0x40000000    # -2.0f

    .line 419
    .line 420
    const/16 v21, 0x0

    .line 421
    .line 422
    const/16 v22, 0x0

    .line 423
    .line 424
    const v23, -0x414ccccd    # -0.35f

    .line 425
    .line 426
    .line 427
    const v24, -0x40b5c28f    # -0.79f

    .line 428
    .line 429
    .line 430
    move-object/from16 v20, v2

    .line 431
    .line 432
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 433
    .line 434
    .line 435
    const/high16 v25, -0x3f400000    # -6.0f

    .line 436
    .line 437
    const/high16 v26, 0x40000000    # 2.0f

    .line 438
    .line 439
    const v21, -0x3fd3d70a    # -2.69f

    .line 440
    .line 441
    .line 442
    const v23, -0x3f475c29    # -5.77f

    .line 443
    .line 444
    .line 445
    const v24, 0x3fa3d70a    # 1.28f

    .line 446
    .line 447
    .line 448
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 449
    .line 450
    .line 451
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 452
    .line 453
    .line 454
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 455
    .line 456
    .line 457
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 458
    .line 459
    .line 460
    move-result-object v2

    .line 461
    const v6, 0x3e99999a    # 0.3f

    .line 462
    .line 463
    .line 464
    const v8, 0x3e99999a    # 0.3f

    .line 465
    .line 466
    .line 467
    const/4 v7, 0x0

    .line 468
    const-string v4, ""

    .line 469
    .line 470
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 471
    .line 472
    .line 473
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 474
    .line 475
    .line 476
    move-result v3

    .line 477
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 478
    .line 479
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 480
    .line 481
    .line 482
    move-result-wide v6

    .line 483
    const/4 v2, 0x0

    .line 484
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 485
    .line 486
    .line 487
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 488
    .line 489
    .line 490
    move-result v10

    .line 491
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 492
    .line 493
    .line 494
    move-result v11

    .line 495
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 496
    .line 497
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 498
    .line 499
    .line 500
    const v4, 0x419b70a4    # 19.43f

    .line 501
    .line 502
    .line 503
    const v6, 0x419028f6    # 18.02f

    .line 504
    .line 505
    .line 506
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 507
    .line 508
    .line 509
    const/high16 v25, 0x41a00000    # 20.0f

    .line 510
    .line 511
    const/high16 v26, 0x41800000    # 16.0f

    .line 512
    .line 513
    const v21, 0x419e51ec    # 19.79f

    .line 514
    .line 515
    .line 516
    const v22, 0x418b70a4    # 17.43f

    .line 517
    .line 518
    .line 519
    const/high16 v23, 0x41a00000    # 20.0f

    .line 520
    .line 521
    const v24, 0x4185eb85    # 16.74f

    .line 522
    .line 523
    .line 524
    move-object/from16 v20, v2

    .line 525
    .line 526
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 527
    .line 528
    .line 529
    const/high16 v25, -0x3f800000    # -4.0f

    .line 530
    .line 531
    const/high16 v26, -0x3f800000    # -4.0f

    .line 532
    .line 533
    const/16 v21, 0x0

    .line 534
    .line 535
    const v22, -0x3ff28f5c    # -2.21f

    .line 536
    .line 537
    .line 538
    const v23, -0x401ae148    # -1.79f

    .line 539
    .line 540
    .line 541
    const/high16 v24, -0x3f800000    # -4.0f

    .line 542
    .line 543
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 544
    .line 545
    .line 546
    const v4, 0x3fe51eb8    # 1.79f

    .line 547
    .line 548
    .line 549
    const/high16 v6, -0x3f800000    # -4.0f

    .line 550
    .line 551
    const/high16 v7, 0x40800000    # 4.0f

    .line 552
    .line 553
    invoke-virtual {v2, v6, v4, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 554
    .line 555
    .line 556
    const/high16 v25, 0x40800000    # 4.0f

    .line 557
    .line 558
    const/high16 v26, 0x40800000    # 4.0f

    .line 559
    .line 560
    const v22, 0x400d70a4    # 2.21f

    .line 561
    .line 562
    .line 563
    const v23, 0x3fe51eb8    # 1.79f

    .line 564
    .line 565
    .line 566
    const/high16 v24, 0x40800000    # 4.0f

    .line 567
    .line 568
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 569
    .line 570
    .line 571
    const v25, 0x400147ae    # 2.02f

    .line 572
    .line 573
    .line 574
    const v26, -0x40ee147b    # -0.57f

    .line 575
    .line 576
    .line 577
    const v21, 0x3f3d70a4    # 0.74f

    .line 578
    .line 579
    .line 580
    const/16 v22, 0x0

    .line 581
    .line 582
    const v23, 0x3fb70a3d    # 1.43f

    .line 583
    .line 584
    .line 585
    const v24, -0x419eb852    # -0.22f

    .line 586
    .line 587
    .line 588
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 589
    .line 590
    .line 591
    const v25, 0x40247ae1    # 2.57f

    .line 592
    .line 593
    .line 594
    const v26, 0x40247ae1    # 2.57f

    .line 595
    .line 596
    .line 597
    const v21, 0x3f6e147b    # 0.93f

    .line 598
    .line 599
    .line 600
    const v22, 0x3f6e147b    # 0.93f

    .line 601
    .line 602
    .line 603
    const v23, 0x3fcf5c29    # 1.62f

    .line 604
    .line 605
    .line 606
    const v24, 0x3fcf5c29    # 1.62f

    .line 607
    .line 608
    .line 609
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 610
    .line 611
    .line 612
    const/high16 v4, 0x41b00000    # 22.0f

    .line 613
    .line 614
    const v6, 0x41a4b852    # 20.59f

    .line 615
    .line 616
    .line 617
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 618
    .line 619
    .line 620
    const v25, 0x419b70a4    # 19.43f

    .line 621
    .line 622
    .line 623
    const v26, 0x419028f6    # 18.02f

    .line 624
    .line 625
    .line 626
    const/high16 v21, 0x41a40000    # 20.5f

    .line 627
    .line 628
    const v22, 0x4198b852    # 19.09f

    .line 629
    .line 630
    .line 631
    const v23, 0x41a9ae14    # 21.21f

    .line 632
    .line 633
    .line 634
    const v24, 0x419e51ec    # 19.79f

    .line 635
    .line 636
    .line 637
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 638
    .line 639
    .line 640
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 641
    .line 642
    .line 643
    const/high16 v4, 0x41800000    # 16.0f

    .line 644
    .line 645
    const/high16 v6, 0x41900000    # 18.0f

    .line 646
    .line 647
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 648
    .line 649
    .line 650
    const/high16 v25, -0x40000000    # -2.0f

    .line 651
    .line 652
    const/high16 v26, -0x40000000    # -2.0f

    .line 653
    .line 654
    const v21, -0x40733333    # -1.1f

    .line 655
    .line 656
    .line 657
    const/16 v22, 0x0

    .line 658
    .line 659
    const/high16 v23, -0x40000000    # -2.0f

    .line 660
    .line 661
    const v24, -0x4099999a    # -0.9f

    .line 662
    .line 663
    .line 664
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 665
    .line 666
    .line 667
    const/high16 v25, 0x40000000    # 2.0f

    .line 668
    .line 669
    const/16 v21, 0x0

    .line 670
    .line 671
    const v22, -0x40733333    # -1.1f

    .line 672
    .line 673
    .line 674
    const v23, 0x3f666666    # 0.9f

    .line 675
    .line 676
    .line 677
    const/high16 v24, -0x40000000    # -2.0f

    .line 678
    .line 679
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 680
    .line 681
    .line 682
    const v4, 0x3f666666    # 0.9f

    .line 683
    .line 684
    .line 685
    const/high16 v6, 0x40000000    # 2.0f

    .line 686
    .line 687
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 688
    .line 689
    .line 690
    const/high16 v25, 0x41800000    # 16.0f

    .line 691
    .line 692
    const/high16 v26, 0x41900000    # 18.0f

    .line 693
    .line 694
    const/high16 v21, 0x41900000    # 18.0f

    .line 695
    .line 696
    const v22, 0x4188cccd    # 17.1f

    .line 697
    .line 698
    .line 699
    const v23, 0x4188cccd    # 17.1f

    .line 700
    .line 701
    .line 702
    const/high16 v24, 0x41900000    # 18.0f

    .line 703
    .line 704
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 705
    .line 706
    .line 707
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 708
    .line 709
    .line 710
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 711
    .line 712
    .line 713
    move-result-object v2

    .line 714
    const/high16 v6, 0x3f800000    # 1.0f

    .line 715
    .line 716
    const/high16 v8, 0x3f800000    # 1.0f

    .line 717
    .line 718
    const/4 v7, 0x0

    .line 719
    const-string v4, ""

    .line 720
    .line 721
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 722
    .line 723
    .line 724
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 725
    .line 726
    .line 727
    move-result v3

    .line 728
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 729
    .line 730
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 731
    .line 732
    .line 733
    move-result-wide v6

    .line 734
    const/4 v0, 0x0

    .line 735
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 736
    .line 737
    .line 738
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 739
    .line 740
    .line 741
    move-result v10

    .line 742
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 743
    .line 744
    .line 745
    move-result v11

    .line 746
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 747
    .line 748
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 749
    .line 750
    .line 751
    const/high16 v0, 0x41100000    # 9.0f

    .line 752
    .line 753
    const/high16 v2, 0x41200000    # 10.0f

    .line 754
    .line 755
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 756
    .line 757
    .line 758
    const/4 v0, 0x0

    .line 759
    const/high16 v2, -0x40000000    # -2.0f

    .line 760
    .line 761
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 762
    .line 763
    .line 764
    const/high16 v18, 0x40800000    # 4.0f

    .line 765
    .line 766
    const/16 v19, 0x0

    .line 767
    .line 768
    const/high16 v13, 0x40000000    # 2.0f

    .line 769
    .line 770
    const/high16 v14, 0x40000000    # 2.0f

    .line 771
    .line 772
    const/16 v16, 0x1

    .line 773
    .line 774
    const/16 v17, 0x1

    .line 775
    .line 776
    invoke-virtual/range {v12 .. v19}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 777
    .line 778
    .line 779
    const/high16 v18, -0x3f800000    # -4.0f

    .line 780
    .line 781
    invoke-virtual/range {v12 .. v19}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 782
    .line 783
    .line 784
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 785
    .line 786
    .line 787
    move-result-object v2

    .line 788
    const/16 v16, 0x3800

    .line 789
    .line 790
    const/16 v17, 0x0

    .line 791
    .line 792
    const v6, 0x3e99999a    # 0.3f

    .line 793
    .line 794
    .line 795
    const v8, 0x3e99999a    # 0.3f

    .line 796
    .line 797
    .line 798
    const/4 v7, 0x0

    .line 799
    const/high16 v12, 0x3f800000    # 1.0f

    .line 800
    .line 801
    const/4 v13, 0x0

    .line 802
    const/4 v14, 0x0

    .line 803
    const-string v4, ""

    .line 804
    .line 805
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 806
    .line 807
    .line 808
    move-result-object v0

    .line 809
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 810
    .line 811
    .line 812
    move-result-object v0

    .line 813
    sput-object v0, Landroidx/compose/material/icons/twotone/PersonSearchKt;->_personSearch:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 814
    .line 815
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 816
    .line 817
    .line 818
    return-object v0
.end method
