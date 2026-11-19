.class public final Landroidx/compose/material/icons/twotone/LocationOnKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_locationOn",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "LocationOn",
        "Landroidx/compose/material/icons/Icons$TwoTone;",
        "getLocationOn",
        "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;",
        "material-icons-core_release"
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
        "SMAP\nLocationOn.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LocationOn.kt\nandroidx/compose/material/icons/twotone/LocationOnKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,69:1\n212#2,12:70\n233#2,18:83\n253#2:120\n233#2,18:121\n253#2:158\n233#2,18:159\n253#2:196\n174#3:82\n705#4,2:101\n717#4,2:103\n719#4,11:109\n705#4,2:139\n717#4,2:141\n719#4,11:147\n705#4,2:177\n717#4,2:179\n719#4,11:185\n72#5,4:105\n72#5,4:143\n72#5,4:181\n*S KotlinDebug\n*F\n+ 1 LocationOn.kt\nandroidx/compose/material/icons/twotone/LocationOnKt\n*L\n29#1:70,12\n30#1:83,18\n30#1:120\n44#1:121,18\n44#1:158\n58#1:159,18\n58#1:196\n29#1:82\n30#1:101,2\n30#1:103,2\n30#1:109,11\n44#1:139,2\n44#1:141,2\n44#1:147,11\n58#1:177,2\n58#1:179,2\n58#1:185,11\n30#1:105,4\n44#1:143,4\n58#1:181,4\n*E\n"
    }
.end annotation


# static fields
.field private static _locationOn:Landroidx/compose/ui/graphics/vector/ImageVector;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field


# direct methods
.method public static final getLocationOn(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27
    .param p0    # Landroidx/compose/material/icons/Icons$TwoTone;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/LocationOnKt;->_locationOn:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-static {v0}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

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
    const-string v2, "TwoTone.LocationOn"

    .line 33
    .line 34
    invoke-direct/range {v1 .. v12}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;-><init>(Ljava/lang/String;FFFFJIZILkotlin/jvm/internal/e;)V

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
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/e;)V

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
    const/high16 v2, 0x40800000    # 4.0f

    .line 66
    .line 67
    const/high16 v4, 0x41400000    # 12.0f

    .line 68
    .line 69
    invoke-static {v4, v2}, Lg/a;->a(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 70
    .line 71
    .line 72
    move-result-object v20

    .line 73
    const/high16 v25, 0x40e00000    # 7.0f

    .line 74
    .line 75
    const/high16 v26, 0x41100000    # 9.0f

    .line 76
    .line 77
    const v21, 0x4113d70a    # 9.24f

    .line 78
    .line 79
    .line 80
    const/high16 v22, 0x40800000    # 4.0f

    .line 81
    .line 82
    const/high16 v23, 0x40e00000    # 7.0f

    .line 83
    .line 84
    const v24, 0x40c7ae14    # 6.24f

    .line 85
    .line 86
    .line 87
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 88
    .line 89
    .line 90
    const/high16 v25, 0x40a00000    # 5.0f

    .line 91
    .line 92
    const v26, 0x411e147b    # 9.88f

    .line 93
    .line 94
    .line 95
    const/16 v21, 0x0

    .line 96
    .line 97
    const v22, 0x40366666    # 2.85f

    .line 98
    .line 99
    .line 100
    const v23, 0x403ae148    # 2.92f

    .line 101
    .line 102
    .line 103
    const v24, 0x40e6b852    # 7.21f

    .line 104
    .line 105
    .line 106
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 107
    .line 108
    .line 109
    const v26, -0x3ee1eb85    # -9.88f

    .line 110
    .line 111
    .line 112
    const v21, 0x40070a3d    # 2.11f

    .line 113
    .line 114
    .line 115
    const v22, -0x3fd3d70a    # -2.69f

    .line 116
    .line 117
    .line 118
    const/high16 v23, 0x40a00000    # 5.0f

    .line 119
    .line 120
    const/high16 v24, -0x3f200000    # -7.0f

    .line 121
    .line 122
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 123
    .line 124
    .line 125
    const/high16 v25, -0x3f600000    # -5.0f

    .line 126
    .line 127
    const/high16 v26, -0x3f600000    # -5.0f

    .line 128
    .line 129
    const/16 v21, 0x0

    .line 130
    .line 131
    const v22, -0x3fcf5c29    # -2.76f

    .line 132
    .line 133
    .line 134
    const v23, -0x3ff0a3d7    # -2.24f

    .line 135
    .line 136
    .line 137
    const/high16 v24, -0x3f600000    # -5.0f

    .line 138
    .line 139
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 140
    .line 141
    .line 142
    move-object/from16 v2, v20

    .line 143
    .line 144
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 145
    .line 146
    .line 147
    const/high16 v4, 0x41380000    # 11.5f

    .line 148
    .line 149
    const/high16 v6, 0x41400000    # 12.0f

    .line 150
    .line 151
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 152
    .line 153
    .line 154
    const/high16 v25, -0x3fe00000    # -2.5f

    .line 155
    .line 156
    const/high16 v26, -0x3fe00000    # -2.5f

    .line 157
    .line 158
    const v21, -0x404f5c29    # -1.38f

    .line 159
    .line 160
    .line 161
    const/16 v22, 0x0

    .line 162
    .line 163
    const/high16 v23, -0x3fe00000    # -2.5f

    .line 164
    .line 165
    const v24, -0x4070a3d7    # -1.12f

    .line 166
    .line 167
    .line 168
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 169
    .line 170
    .line 171
    const v4, 0x3f8f5c29    # 1.12f

    .line 172
    .line 173
    .line 174
    const/high16 v6, -0x3fe00000    # -2.5f

    .line 175
    .line 176
    const/high16 v7, 0x40200000    # 2.5f

    .line 177
    .line 178
    invoke-virtual {v2, v4, v6, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 179
    .line 180
    .line 181
    const/high16 v6, 0x40200000    # 2.5f

    .line 182
    .line 183
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 184
    .line 185
    .line 186
    const v4, -0x4070a3d7    # -1.12f

    .line 187
    .line 188
    .line 189
    const/high16 v6, -0x3fe00000    # -2.5f

    .line 190
    .line 191
    invoke-static {v2, v4, v7, v6, v7}, Lg/a;->h(Landroidx/compose/ui/graphics/vector/PathBuilder;FFFF)Ljava/util/List;

    .line 192
    .line 193
    .line 194
    move-result-object v2

    .line 195
    const/16 v16, 0x3800

    .line 196
    .line 197
    const/16 v17, 0x0

    .line 198
    .line 199
    const v6, 0x3e99999a    # 0.3f

    .line 200
    .line 201
    .line 202
    const v8, 0x3e99999a    # 0.3f

    .line 203
    .line 204
    .line 205
    const/4 v7, 0x0

    .line 206
    const/high16 v9, 0x3f800000    # 1.0f

    .line 207
    .line 208
    const/high16 v12, 0x3f800000    # 1.0f

    .line 209
    .line 210
    const/4 v13, 0x0

    .line 211
    const/4 v14, 0x0

    .line 212
    const/4 v15, 0x0

    .line 213
    const-string v4, ""

    .line 214
    .line 215
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 216
    .line 217
    .line 218
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 219
    .line 220
    .line 221
    move-result v3

    .line 222
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 223
    .line 224
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 225
    .line 226
    .line 227
    move-result-wide v6

    .line 228
    const/4 v2, 0x0

    .line 229
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/e;)V

    .line 230
    .line 231
    .line 232
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 233
    .line 234
    .line 235
    move-result v10

    .line 236
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 237
    .line 238
    .line 239
    move-result v11

    .line 240
    const/high16 v2, 0x40000000    # 2.0f

    .line 241
    .line 242
    const/high16 v4, 0x41400000    # 12.0f

    .line 243
    .line 244
    invoke-static {v4, v2}, Lg/a;->a(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 245
    .line 246
    .line 247
    move-result-object v20

    .line 248
    const/high16 v25, 0x40a00000    # 5.0f

    .line 249
    .line 250
    const/high16 v26, 0x41100000    # 9.0f

    .line 251
    .line 252
    const v21, 0x4102147b    # 8.13f

    .line 253
    .line 254
    .line 255
    const/high16 v22, 0x40000000    # 2.0f

    .line 256
    .line 257
    const/high16 v23, 0x40a00000    # 5.0f

    .line 258
    .line 259
    const v24, 0x40a428f6    # 5.13f

    .line 260
    .line 261
    .line 262
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 263
    .line 264
    .line 265
    const/high16 v25, 0x40e00000    # 7.0f

    .line 266
    .line 267
    const/high16 v26, 0x41500000    # 13.0f

    .line 268
    .line 269
    const/16 v21, 0x0

    .line 270
    .line 271
    const/high16 v22, 0x40a80000    # 5.25f

    .line 272
    .line 273
    const/high16 v23, 0x40e00000    # 7.0f

    .line 274
    .line 275
    const/high16 v24, 0x41500000    # 13.0f

    .line 276
    .line 277
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 278
    .line 279
    .line 280
    move-object/from16 v2, v20

    .line 281
    .line 282
    const/high16 v4, -0x3f080000    # -7.75f

    .line 283
    .line 284
    const/high16 v6, -0x3eb00000    # -13.0f

    .line 285
    .line 286
    const/high16 v7, 0x40e00000    # 7.0f

    .line 287
    .line 288
    invoke-virtual {v2, v7, v4, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 289
    .line 290
    .line 291
    const/high16 v25, -0x3f200000    # -7.0f

    .line 292
    .line 293
    const/high16 v26, -0x3f200000    # -7.0f

    .line 294
    .line 295
    const v22, -0x3f8851ec    # -3.87f

    .line 296
    .line 297
    .line 298
    const v23, -0x3fb7ae14    # -3.13f

    .line 299
    .line 300
    .line 301
    const/high16 v24, -0x3f200000    # -7.0f

    .line 302
    .line 303
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 304
    .line 305
    .line 306
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 307
    .line 308
    .line 309
    const/high16 v4, 0x41100000    # 9.0f

    .line 310
    .line 311
    const/high16 v6, 0x40e00000    # 7.0f

    .line 312
    .line 313
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 314
    .line 315
    .line 316
    const/high16 v25, 0x40a00000    # 5.0f

    .line 317
    .line 318
    const/high16 v26, -0x3f600000    # -5.0f

    .line 319
    .line 320
    const v22, -0x3fcf5c29    # -2.76f

    .line 321
    .line 322
    .line 323
    const v23, 0x400f5c29    # 2.24f

    .line 324
    .line 325
    .line 326
    const/high16 v24, -0x3f600000    # -5.0f

    .line 327
    .line 328
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 329
    .line 330
    .line 331
    const v4, 0x400f5c29    # 2.24f

    .line 332
    .line 333
    .line 334
    const/high16 v6, 0x40a00000    # 5.0f

    .line 335
    .line 336
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 337
    .line 338
    .line 339
    const/high16 v25, -0x3f600000    # -5.0f

    .line 340
    .line 341
    const v26, 0x411e147b    # 9.88f

    .line 342
    .line 343
    .line 344
    const v22, 0x403851ec    # 2.88f

    .line 345
    .line 346
    .line 347
    const v23, -0x3fc7ae14    # -2.88f

    .line 348
    .line 349
    .line 350
    const v24, 0x40e6147b    # 7.19f

    .line 351
    .line 352
    .line 353
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 354
    .line 355
    .line 356
    const/high16 v25, 0x40e00000    # 7.0f

    .line 357
    .line 358
    const/high16 v26, 0x41100000    # 9.0f

    .line 359
    .line 360
    const v21, 0x411eb852    # 9.92f

    .line 361
    .line 362
    .line 363
    const v22, 0x4181ae14    # 16.21f

    .line 364
    .line 365
    .line 366
    const/high16 v23, 0x40e00000    # 7.0f

    .line 367
    .line 368
    const v24, 0x413d999a    # 11.85f

    .line 369
    .line 370
    .line 371
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 372
    .line 373
    .line 374
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 375
    .line 376
    .line 377
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 378
    .line 379
    .line 380
    move-result-object v2

    .line 381
    const/high16 v6, 0x3f800000    # 1.0f

    .line 382
    .line 383
    const/high16 v8, 0x3f800000    # 1.0f

    .line 384
    .line 385
    const/4 v7, 0x0

    .line 386
    const-string v4, ""

    .line 387
    .line 388
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 389
    .line 390
    .line 391
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 392
    .line 393
    .line 394
    move-result v3

    .line 395
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 396
    .line 397
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 398
    .line 399
    .line 400
    move-result-wide v6

    .line 401
    const/4 v0, 0x0

    .line 402
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/e;)V

    .line 403
    .line 404
    .line 405
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 406
    .line 407
    .line 408
    move-result v10

    .line 409
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 410
    .line 411
    .line 412
    move-result v11

    .line 413
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 414
    .line 415
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 416
    .line 417
    .line 418
    const/high16 v0, 0x41100000    # 9.0f

    .line 419
    .line 420
    const/high16 v2, 0x41400000    # 12.0f

    .line 421
    .line 422
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 423
    .line 424
    .line 425
    const/4 v0, 0x0

    .line 426
    const/high16 v2, -0x3fe00000    # -2.5f

    .line 427
    .line 428
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 429
    .line 430
    .line 431
    const/high16 v18, 0x40a00000    # 5.0f

    .line 432
    .line 433
    const/16 v19, 0x0

    .line 434
    .line 435
    const/high16 v13, 0x40200000    # 2.5f

    .line 436
    .line 437
    const/high16 v14, 0x40200000    # 2.5f

    .line 438
    .line 439
    const/16 v16, 0x1

    .line 440
    .line 441
    const/16 v17, 0x1

    .line 442
    .line 443
    invoke-virtual/range {v12 .. v19}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 444
    .line 445
    .line 446
    const/high16 v18, -0x3f600000    # -5.0f

    .line 447
    .line 448
    invoke-virtual/range {v12 .. v19}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 449
    .line 450
    .line 451
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 452
    .line 453
    .line 454
    move-result-object v2

    .line 455
    const/16 v16, 0x3800

    .line 456
    .line 457
    const/16 v17, 0x0

    .line 458
    .line 459
    const/high16 v6, 0x3f800000    # 1.0f

    .line 460
    .line 461
    const/4 v7, 0x0

    .line 462
    const/high16 v12, 0x3f800000    # 1.0f

    .line 463
    .line 464
    const/4 v13, 0x0

    .line 465
    const/4 v14, 0x0

    .line 466
    const-string v4, ""

    .line 467
    .line 468
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 469
    .line 470
    .line 471
    move-result-object v0

    .line 472
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 473
    .line 474
    .line 475
    move-result-object v0

    .line 476
    sput-object v0, Landroidx/compose/material/icons/twotone/LocationOnKt;->_locationOn:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 477
    .line 478
    invoke-static {v0}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 479
    .line 480
    .line 481
    return-object v0
.end method
