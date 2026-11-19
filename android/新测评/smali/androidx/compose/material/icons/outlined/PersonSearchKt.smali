.class public final Landroidx/compose/material/icons/outlined/PersonSearchKt;
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
        "Landroidx/compose/material/icons/Icons$Outlined;",
        "getPersonSearch",
        "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;",
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
        "SMAP\nPersonSearch.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PersonSearch.kt\nandroidx/compose/material/icons/outlined/PersonSearchKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,78:1\n212#2,12:79\n233#2,18:92\n253#2:129\n233#2,18:130\n253#2:167\n233#2,18:168\n253#2:205\n174#3:91\n705#4,2:110\n717#4,2:112\n719#4,11:118\n705#4,2:148\n717#4,2:150\n719#4,11:156\n705#4,2:186\n717#4,2:188\n719#4,11:194\n72#5,4:114\n72#5,4:152\n72#5,4:190\n*S KotlinDebug\n*F\n+ 1 PersonSearch.kt\nandroidx/compose/material/icons/outlined/PersonSearchKt\n*L\n29#1:79,12\n30#1:92,18\n30#1:129\n44#1:130,18\n44#1:167\n55#1:168,18\n55#1:205\n29#1:91\n30#1:110,2\n30#1:112,2\n30#1:118,11\n44#1:148,2\n44#1:150,2\n44#1:156,11\n55#1:186,2\n55#1:188,2\n55#1:194,11\n30#1:114,4\n44#1:152,4\n55#1:190,4\n*E\n"
    }
.end annotation


# static fields
.field private static _personSearch:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getPersonSearch(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/outlined/PersonSearchKt;->_personSearch:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Outlined.PersonSearch"

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
    const/high16 v4, 0x41400000    # 12.0f

    .line 71
    .line 72
    const/high16 v6, 0x41200000    # 10.0f

    .line 73
    .line 74
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v25, 0x40800000    # 4.0f

    .line 78
    .line 79
    const/high16 v26, -0x3f800000    # -4.0f

    .line 80
    .line 81
    const v21, 0x400d70a4    # 2.21f

    .line 82
    .line 83
    .line 84
    const/16 v22, 0x0

    .line 85
    .line 86
    const/high16 v23, 0x40800000    # 4.0f

    .line 87
    .line 88
    const v24, -0x401ae148    # -1.79f

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
    const/high16 v25, -0x3f800000    # -4.0f

    .line 97
    .line 98
    const/16 v21, 0x0

    .line 99
    .line 100
    const v22, -0x3ff28f5c    # -2.21f

    .line 101
    .line 102
    .line 103
    const v23, -0x401ae148    # -1.79f

    .line 104
    .line 105
    .line 106
    const/high16 v24, -0x3f800000    # -4.0f

    .line 107
    .line 108
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 109
    .line 110
    .line 111
    const v4, 0x40b947ae    # 5.79f

    .line 112
    .line 113
    .line 114
    const/high16 v6, 0x40c00000    # 6.0f

    .line 115
    .line 116
    const/high16 v7, 0x41000000    # 8.0f

    .line 117
    .line 118
    invoke-virtual {v2, v6, v4, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 119
    .line 120
    .line 121
    const/high16 v25, 0x41200000    # 10.0f

    .line 122
    .line 123
    const/high16 v26, 0x41400000    # 12.0f

    .line 124
    .line 125
    const/high16 v21, 0x40c00000    # 6.0f

    .line 126
    .line 127
    const v22, 0x41235c29    # 10.21f

    .line 128
    .line 129
    .line 130
    const v23, 0x40f947ae    # 7.79f

    .line 131
    .line 132
    .line 133
    const/high16 v24, 0x41400000    # 12.0f

    .line 134
    .line 135
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 136
    .line 137
    .line 138
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 139
    .line 140
    .line 141
    const/high16 v4, 0x41200000    # 10.0f

    .line 142
    .line 143
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 144
    .line 145
    .line 146
    const/high16 v25, 0x40000000    # 2.0f

    .line 147
    .line 148
    const/high16 v26, 0x40000000    # 2.0f

    .line 149
    .line 150
    const v21, 0x3f8ccccd    # 1.1f

    .line 151
    .line 152
    .line 153
    const/16 v22, 0x0

    .line 154
    .line 155
    const/high16 v23, 0x40000000    # 2.0f

    .line 156
    .line 157
    const v24, 0x3f666666    # 0.9f

    .line 158
    .line 159
    .line 160
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 161
    .line 162
    .line 163
    const/high16 v25, -0x40000000    # -2.0f

    .line 164
    .line 165
    const/16 v21, 0x0

    .line 166
    .line 167
    const v22, 0x3f8ccccd    # 1.1f

    .line 168
    .line 169
    .line 170
    const v23, -0x4099999a    # -0.9f

    .line 171
    .line 172
    .line 173
    const/high16 v24, 0x40000000    # 2.0f

    .line 174
    .line 175
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 176
    .line 177
    .line 178
    const v4, 0x4111999a    # 9.1f

    .line 179
    .line 180
    .line 181
    const/high16 v6, 0x41000000    # 8.0f

    .line 182
    .line 183
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 184
    .line 185
    .line 186
    const/high16 v25, 0x41200000    # 10.0f

    .line 187
    .line 188
    const/high16 v26, 0x40c00000    # 6.0f

    .line 189
    .line 190
    const/high16 v21, 0x41000000    # 8.0f

    .line 191
    .line 192
    const v22, 0x40dccccd    # 6.9f

    .line 193
    .line 194
    .line 195
    const v23, 0x410e6666    # 8.9f

    .line 196
    .line 197
    .line 198
    const/high16 v24, 0x40c00000    # 6.0f

    .line 199
    .line 200
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 201
    .line 202
    .line 203
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 204
    .line 205
    .line 206
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 207
    .line 208
    .line 209
    move-result-object v2

    .line 210
    const/16 v16, 0x3800

    .line 211
    .line 212
    const/16 v17, 0x0

    .line 213
    .line 214
    const/high16 v6, 0x3f800000    # 1.0f

    .line 215
    .line 216
    const/high16 v8, 0x3f800000    # 1.0f

    .line 217
    .line 218
    const/4 v7, 0x0

    .line 219
    const/high16 v9, 0x3f800000    # 1.0f

    .line 220
    .line 221
    const/high16 v12, 0x3f800000    # 1.0f

    .line 222
    .line 223
    const/4 v13, 0x0

    .line 224
    const/4 v14, 0x0

    .line 225
    const/4 v15, 0x0

    .line 226
    const-string v4, ""

    .line 227
    .line 228
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 229
    .line 230
    .line 231
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 232
    .line 233
    .line 234
    move-result v3

    .line 235
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 236
    .line 237
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 238
    .line 239
    .line 240
    move-result-wide v6

    .line 241
    const/4 v2, 0x0

    .line 242
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 243
    .line 244
    .line 245
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 246
    .line 247
    .line 248
    move-result v10

    .line 249
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 250
    .line 251
    .line 252
    move-result v11

    .line 253
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 254
    .line 255
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 256
    .line 257
    .line 258
    const/high16 v4, 0x41900000    # 18.0f

    .line 259
    .line 260
    const/high16 v6, 0x40800000    # 4.0f

    .line 261
    .line 262
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 263
    .line 264
    .line 265
    const/high16 v25, 0x40c00000    # 6.0f

    .line 266
    .line 267
    const/high16 v26, -0x40000000    # -2.0f

    .line 268
    .line 269
    const v21, 0x3e6147ae    # 0.22f

    .line 270
    .line 271
    .line 272
    const v22, -0x40c7ae14    # -0.72f

    .line 273
    .line 274
    .line 275
    const v23, 0x4053d70a    # 3.31f

    .line 276
    .line 277
    .line 278
    const/high16 v24, -0x40000000    # -2.0f

    .line 279
    .line 280
    move-object/from16 v20, v2

    .line 281
    .line 282
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 283
    .line 284
    .line 285
    const v25, 0x3eb33333    # 0.35f

    .line 286
    .line 287
    .line 288
    const v26, -0x400147ae    # -1.99f

    .line 289
    .line 290
    .line 291
    const/16 v21, 0x0

    .line 292
    .line 293
    const v22, -0x40cccccd    # -0.7f

    .line 294
    .line 295
    .line 296
    const v23, 0x3e051eb8    # 0.13f

    .line 297
    .line 298
    .line 299
    const v24, -0x4050a3d7    # -1.37f

    .line 300
    .line 301
    .line 302
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 303
    .line 304
    .line 305
    const/high16 v25, 0x40000000    # 2.0f

    .line 306
    .line 307
    const/high16 v26, 0x41900000    # 18.0f

    .line 308
    .line 309
    const v21, 0x40f3d70a    # 7.62f

    .line 310
    .line 311
    .line 312
    const v22, 0x415e8f5c    # 13.91f

    .line 313
    .line 314
    .line 315
    const/high16 v23, 0x40000000    # 2.0f

    .line 316
    .line 317
    const v24, 0x417451ec    # 15.27f

    .line 318
    .line 319
    .line 320
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 321
    .line 322
    .line 323
    const/high16 v4, 0x40000000    # 2.0f

    .line 324
    .line 325
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 326
    .line 327
    .line 328
    const v4, 0x4118a3d7    # 9.54f

    .line 329
    .line 330
    .line 331
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 332
    .line 333
    .line 334
    const v25, -0x4067ae14    # -1.19f

    .line 335
    .line 336
    .line 337
    const/high16 v26, -0x40000000    # -2.0f

    .line 338
    .line 339
    const v21, -0x40fae148    # -0.52f

    .line 340
    .line 341
    .line 342
    const v22, -0x40eb851f    # -0.58f

    .line 343
    .line 344
    .line 345
    const v23, -0x4091eb85    # -0.93f

    .line 346
    .line 347
    .line 348
    const/high16 v24, -0x40600000    # -1.25f

    .line 349
    .line 350
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 351
    .line 352
    .line 353
    const/high16 v4, 0x40800000    # 4.0f

    .line 354
    .line 355
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 356
    .line 357
    .line 358
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 359
    .line 360
    .line 361
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 362
    .line 363
    .line 364
    move-result-object v2

    .line 365
    const/high16 v6, 0x3f800000    # 1.0f

    .line 366
    .line 367
    const/4 v7, 0x0

    .line 368
    const-string v4, ""

    .line 369
    .line 370
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 371
    .line 372
    .line 373
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 374
    .line 375
    .line 376
    move-result v3

    .line 377
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 378
    .line 379
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 380
    .line 381
    .line 382
    move-result-wide v6

    .line 383
    const/4 v0, 0x0

    .line 384
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 385
    .line 386
    .line 387
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 388
    .line 389
    .line 390
    move-result v10

    .line 391
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 392
    .line 393
    .line 394
    move-result v11

    .line 395
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 396
    .line 397
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 398
    .line 399
    .line 400
    const v0, 0x419b70a4    # 19.43f

    .line 401
    .line 402
    .line 403
    const v2, 0x419028f6    # 18.02f

    .line 404
    .line 405
    .line 406
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 407
    .line 408
    .line 409
    const/high16 v17, 0x41a00000    # 20.0f

    .line 410
    .line 411
    const/high16 v18, 0x41800000    # 16.0f

    .line 412
    .line 413
    const v13, 0x419e51ec    # 19.79f

    .line 414
    .line 415
    .line 416
    const v14, 0x418b70a4    # 17.43f

    .line 417
    .line 418
    .line 419
    const/high16 v15, 0x41a00000    # 20.0f

    .line 420
    .line 421
    const v16, 0x4185eb85    # 16.74f

    .line 422
    .line 423
    .line 424
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 425
    .line 426
    .line 427
    const/high16 v17, -0x3f800000    # -4.0f

    .line 428
    .line 429
    const/high16 v18, -0x3f800000    # -4.0f

    .line 430
    .line 431
    const/4 v13, 0x0

    .line 432
    const v14, -0x3ff28f5c    # -2.21f

    .line 433
    .line 434
    .line 435
    const v15, -0x401ae148    # -1.79f

    .line 436
    .line 437
    .line 438
    const/high16 v16, -0x3f800000    # -4.0f

    .line 439
    .line 440
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 441
    .line 442
    .line 443
    const v0, 0x3fe51eb8    # 1.79f

    .line 444
    .line 445
    .line 446
    const/high16 v2, -0x3f800000    # -4.0f

    .line 447
    .line 448
    const/high16 v4, 0x40800000    # 4.0f

    .line 449
    .line 450
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 451
    .line 452
    .line 453
    const/high16 v17, 0x40800000    # 4.0f

    .line 454
    .line 455
    const/high16 v18, 0x40800000    # 4.0f

    .line 456
    .line 457
    const v14, 0x400d70a4    # 2.21f

    .line 458
    .line 459
    .line 460
    const v15, 0x3fe51eb8    # 1.79f

    .line 461
    .line 462
    .line 463
    const/high16 v16, 0x40800000    # 4.0f

    .line 464
    .line 465
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 466
    .line 467
    .line 468
    const v17, 0x400147ae    # 2.02f

    .line 469
    .line 470
    .line 471
    const v18, -0x40ee147b    # -0.57f

    .line 472
    .line 473
    .line 474
    const v13, 0x3f3d70a4    # 0.74f

    .line 475
    .line 476
    .line 477
    const/4 v14, 0x0

    .line 478
    const v15, 0x3fb70a3d    # 1.43f

    .line 479
    .line 480
    .line 481
    const v16, -0x419eb852    # -0.22f

    .line 482
    .line 483
    .line 484
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 485
    .line 486
    .line 487
    const v17, 0x40247ae1    # 2.57f

    .line 488
    .line 489
    .line 490
    const v18, 0x40247ae1    # 2.57f

    .line 491
    .line 492
    .line 493
    const v13, 0x3f6e147b    # 0.93f

    .line 494
    .line 495
    .line 496
    const v14, 0x3f6e147b    # 0.93f

    .line 497
    .line 498
    .line 499
    const v15, 0x3fcf5c29    # 1.62f

    .line 500
    .line 501
    .line 502
    const v16, 0x3fcf5c29    # 1.62f

    .line 503
    .line 504
    .line 505
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 506
    .line 507
    .line 508
    const/high16 v0, 0x41b00000    # 22.0f

    .line 509
    .line 510
    const v2, 0x41a4b852    # 20.59f

    .line 511
    .line 512
    .line 513
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 514
    .line 515
    .line 516
    const v17, 0x419b70a4    # 19.43f

    .line 517
    .line 518
    .line 519
    const v18, 0x419028f6    # 18.02f

    .line 520
    .line 521
    .line 522
    const/high16 v13, 0x41a40000    # 20.5f

    .line 523
    .line 524
    const v14, 0x4198b852    # 19.09f

    .line 525
    .line 526
    .line 527
    const v15, 0x41a9ae14    # 21.21f

    .line 528
    .line 529
    .line 530
    const v16, 0x419e51ec    # 19.79f

    .line 531
    .line 532
    .line 533
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 534
    .line 535
    .line 536
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 537
    .line 538
    .line 539
    const/high16 v0, 0x41800000    # 16.0f

    .line 540
    .line 541
    const/high16 v2, 0x41900000    # 18.0f

    .line 542
    .line 543
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 544
    .line 545
    .line 546
    const/high16 v17, -0x40000000    # -2.0f

    .line 547
    .line 548
    const/high16 v18, -0x40000000    # -2.0f

    .line 549
    .line 550
    const v13, -0x40733333    # -1.1f

    .line 551
    .line 552
    .line 553
    const/4 v14, 0x0

    .line 554
    const/high16 v15, -0x40000000    # -2.0f

    .line 555
    .line 556
    const v16, -0x4099999a    # -0.9f

    .line 557
    .line 558
    .line 559
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 560
    .line 561
    .line 562
    const/high16 v17, 0x40000000    # 2.0f

    .line 563
    .line 564
    const/4 v13, 0x0

    .line 565
    const v14, -0x40733333    # -1.1f

    .line 566
    .line 567
    .line 568
    const v15, 0x3f666666    # 0.9f

    .line 569
    .line 570
    .line 571
    const/high16 v16, -0x40000000    # -2.0f

    .line 572
    .line 573
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 574
    .line 575
    .line 576
    const v0, 0x3f666666    # 0.9f

    .line 577
    .line 578
    .line 579
    const/high16 v2, 0x40000000    # 2.0f

    .line 580
    .line 581
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 582
    .line 583
    .line 584
    const/high16 v17, 0x41800000    # 16.0f

    .line 585
    .line 586
    const/high16 v18, 0x41900000    # 18.0f

    .line 587
    .line 588
    const/high16 v13, 0x41900000    # 18.0f

    .line 589
    .line 590
    const v14, 0x4188cccd    # 17.1f

    .line 591
    .line 592
    .line 593
    const v15, 0x4188cccd    # 17.1f

    .line 594
    .line 595
    .line 596
    const/high16 v16, 0x41900000    # 18.0f

    .line 597
    .line 598
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 599
    .line 600
    .line 601
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 602
    .line 603
    .line 604
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 605
    .line 606
    .line 607
    move-result-object v2

    .line 608
    const/16 v16, 0x3800

    .line 609
    .line 610
    const/16 v17, 0x0

    .line 611
    .line 612
    const/high16 v6, 0x3f800000    # 1.0f

    .line 613
    .line 614
    const/4 v7, 0x0

    .line 615
    const/high16 v12, 0x3f800000    # 1.0f

    .line 616
    .line 617
    const/4 v13, 0x0

    .line 618
    const/4 v14, 0x0

    .line 619
    const/4 v15, 0x0

    .line 620
    const-string v4, ""

    .line 621
    .line 622
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 623
    .line 624
    .line 625
    move-result-object v0

    .line 626
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 627
    .line 628
    .line 629
    move-result-object v0

    .line 630
    sput-object v0, Landroidx/compose/material/icons/outlined/PersonSearchKt;->_personSearch:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 631
    .line 632
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 633
    .line 634
    .line 635
    return-object v0
.end method
