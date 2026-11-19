.class public final Landroidx/compose/material/icons/twotone/PlaceKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_place",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "Place",
        "Landroidx/compose/material/icons/Icons$TwoTone;",
        "getPlace",
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
        "SMAP\nPlace.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Place.kt\nandroidx/compose/material/icons/twotone/PlaceKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,65:1\n212#2,12:66\n233#2,18:79\n253#2:116\n233#2,18:117\n253#2:154\n174#3:78\n705#4,2:97\n717#4,2:99\n719#4,11:105\n705#4,2:135\n717#4,2:137\n719#4,11:143\n72#5,4:101\n72#5,4:139\n*S KotlinDebug\n*F\n+ 1 Place.kt\nandroidx/compose/material/icons/twotone/PlaceKt\n*L\n29#1:66,12\n30#1:79,18\n30#1:116\n40#1:117,18\n40#1:154\n29#1:78\n30#1:97,2\n30#1:99,2\n30#1:105,11\n40#1:135,2\n40#1:137,2\n40#1:143,11\n30#1:101,4\n40#1:139,4\n*E\n"
    }
.end annotation


# static fields
.field private static _place:Landroidx/compose/ui/graphics/vector/ImageVector;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field


# direct methods
.method public static final getPlace(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27
    .param p0    # Landroidx/compose/material/icons/Icons$TwoTone;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/PlaceKt;->_place:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.Place"

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
    const v2, 0x41233333    # 10.2f

    .line 66
    .line 67
    .line 68
    const/high16 v4, 0x41940000    # 18.5f

    .line 69
    .line 70
    invoke-static {v4, v2}, Lg/a;->a(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 71
    .line 72
    .line 73
    move-result-object v20

    .line 74
    const v25, -0x3f3ae148    # -6.16f

    .line 75
    .line 76
    .line 77
    const v26, 0x411828f6    # 9.51f

    .line 78
    .line 79
    .line 80
    const/16 v21, 0x0

    .line 81
    .line 82
    const v22, 0x40247ae1    # 2.57f

    .line 83
    .line 84
    .line 85
    const v23, -0x3ff9999a    # -2.1f

    .line 86
    .line 87
    .line 88
    const v24, 0x40b947ae    # 5.79f

    .line 89
    .line 90
    .line 91
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 92
    .line 93
    .line 94
    move-object/from16 v2, v20

    .line 95
    .line 96
    const v4, 0x41a0147b    # 20.01f

    .line 97
    .line 98
    .line 99
    const/high16 v6, 0x41400000    # 12.0f

    .line 100
    .line 101
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 102
    .line 103
    .line 104
    const v4, -0x4151eb85    # -0.34f

    .line 105
    .line 106
    .line 107
    const v6, -0x416147ae    # -0.31f

    .line 108
    .line 109
    .line 110
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 111
    .line 112
    .line 113
    const/high16 v25, 0x40b00000    # 5.5f

    .line 114
    .line 115
    const v26, 0x41233333    # 10.2f

    .line 116
    .line 117
    .line 118
    const v21, 0x40f33333    # 7.6f

    .line 119
    .line 120
    .line 121
    const v22, 0x417fd70a    # 15.99f

    .line 122
    .line 123
    .line 124
    const/high16 v23, 0x40b00000    # 5.5f

    .line 125
    .line 126
    const v24, 0x414c51ec    # 12.77f

    .line 127
    .line 128
    .line 129
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 130
    .line 131
    .line 132
    const/high16 v25, 0x40d00000    # 6.5f

    .line 133
    .line 134
    const v26, -0x3f29999a    # -6.7f

    .line 135
    .line 136
    .line 137
    const/16 v21, 0x0

    .line 138
    .line 139
    const v22, -0x3f8a3d71    # -3.84f

    .line 140
    .line 141
    .line 142
    const v23, 0x40347ae1    # 2.82f

    .line 143
    .line 144
    .line 145
    const v24, -0x3f29999a    # -6.7f

    .line 146
    .line 147
    .line 148
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 149
    .line 150
    .line 151
    const v4, 0x40cb3333    # 6.35f

    .line 152
    .line 153
    .line 154
    const v6, 0x41233333    # 10.2f

    .line 155
    .line 156
    .line 157
    const/high16 v7, 0x41940000    # 18.5f

    .line 158
    .line 159
    invoke-virtual {v2, v7, v4, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 160
    .line 161
    .line 162
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 163
    .line 164
    .line 165
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 166
    .line 167
    .line 168
    move-result-object v2

    .line 169
    const/16 v16, 0x3800

    .line 170
    .line 171
    const/16 v17, 0x0

    .line 172
    .line 173
    const v6, 0x3e99999a    # 0.3f

    .line 174
    .line 175
    .line 176
    const/high16 v8, 0x3f800000    # 1.0f

    .line 177
    .line 178
    const/4 v7, 0x0

    .line 179
    const/high16 v9, 0x3f800000    # 1.0f

    .line 180
    .line 181
    const/high16 v12, 0x3f800000    # 1.0f

    .line 182
    .line 183
    const/4 v13, 0x0

    .line 184
    const/4 v14, 0x0

    .line 185
    const/4 v15, 0x0

    .line 186
    const-string v4, ""

    .line 187
    .line 188
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 189
    .line 190
    .line 191
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 192
    .line 193
    .line 194
    move-result v3

    .line 195
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 196
    .line 197
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 198
    .line 199
    .line 200
    move-result-wide v6

    .line 201
    const/4 v0, 0x0

    .line 202
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/e;)V

    .line 203
    .line 204
    .line 205
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 206
    .line 207
    .line 208
    move-result v10

    .line 209
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 210
    .line 211
    .line 212
    move-result v11

    .line 213
    const/high16 v0, 0x40000000    # 2.0f

    .line 214
    .line 215
    const/high16 v2, 0x41400000    # 12.0f

    .line 216
    .line 217
    invoke-static {v2, v0}, Lg/a;->a(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 218
    .line 219
    .line 220
    move-result-object v12

    .line 221
    const/high16 v17, 0x41000000    # 8.0f

    .line 222
    .line 223
    const v18, 0x41033333    # 8.2f

    .line 224
    .line 225
    .line 226
    const v13, 0x40866666    # 4.2f

    .line 227
    .line 228
    .line 229
    const/high16 v15, 0x41000000    # 8.0f

    .line 230
    .line 231
    const v16, 0x404e147b    # 3.22f

    .line 232
    .line 233
    .line 234
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 235
    .line 236
    .line 237
    const/high16 v17, -0x3f000000    # -8.0f

    .line 238
    .line 239
    const v18, 0x413ccccd    # 11.8f

    .line 240
    .line 241
    .line 242
    const/4 v13, 0x0

    .line 243
    const v14, 0x40547ae1    # 3.32f

    .line 244
    .line 245
    .line 246
    const v15, -0x3fd51eb8    # -2.67f

    .line 247
    .line 248
    .line 249
    const/high16 v16, 0x40e80000    # 7.25f

    .line 250
    .line 251
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 252
    .line 253
    .line 254
    const v18, -0x3ec33333    # -11.8f

    .line 255
    .line 256
    .line 257
    const v13, -0x3f5570a4    # -5.33f

    .line 258
    .line 259
    .line 260
    const v14, -0x3f6e6666    # -4.55f

    .line 261
    .line 262
    .line 263
    const/high16 v15, -0x3f000000    # -8.0f

    .line 264
    .line 265
    const v16, -0x3ef851ec    # -8.48f

    .line 266
    .line 267
    .line 268
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 269
    .line 270
    .line 271
    const/high16 v17, 0x41400000    # 12.0f

    .line 272
    .line 273
    const/high16 v18, 0x40000000    # 2.0f

    .line 274
    .line 275
    const/high16 v13, 0x40800000    # 4.0f

    .line 276
    .line 277
    const v14, 0x40a70a3d    # 5.22f

    .line 278
    .line 279
    .line 280
    const v15, 0x40f9999a    # 7.8f

    .line 281
    .line 282
    .line 283
    const/high16 v16, 0x40000000    # 2.0f

    .line 284
    .line 285
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 286
    .line 287
    .line 288
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 289
    .line 290
    .line 291
    const/high16 v0, 0x41900000    # 18.0f

    .line 292
    .line 293
    const v2, 0x41233333    # 10.2f

    .line 294
    .line 295
    .line 296
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 297
    .line 298
    .line 299
    const/high16 v18, 0x40800000    # 4.0f

    .line 300
    .line 301
    const/high16 v13, 0x41900000    # 18.0f

    .line 302
    .line 303
    const v14, 0x40d23d71    # 6.57f

    .line 304
    .line 305
    .line 306
    const v15, 0x4175999a    # 15.35f

    .line 307
    .line 308
    .line 309
    const/high16 v16, 0x40800000    # 4.0f

    .line 310
    .line 311
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 312
    .line 313
    .line 314
    const v0, 0x40247ae1    # 2.57f

    .line 315
    .line 316
    .line 317
    const v2, 0x40c66666    # 6.2f

    .line 318
    .line 319
    .line 320
    const/high16 v4, -0x3f400000    # -6.0f

    .line 321
    .line 322
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 323
    .line 324
    .line 325
    const/high16 v17, 0x40c00000    # 6.0f

    .line 326
    .line 327
    const v18, 0x41123d71    # 9.14f

    .line 328
    .line 329
    .line 330
    const/4 v13, 0x0

    .line 331
    const v14, 0x4015c28f    # 2.34f

    .line 332
    .line 333
    .line 334
    const v15, 0x3ff9999a    # 1.95f

    .line 335
    .line 336
    .line 337
    const v16, 0x40ae147b    # 5.44f

    .line 338
    .line 339
    .line 340
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 341
    .line 342
    .line 343
    const/high16 v17, 0x41900000    # 18.0f

    .line 344
    .line 345
    const v18, 0x41233333    # 10.2f

    .line 346
    .line 347
    .line 348
    const v13, 0x41806666    # 16.05f

    .line 349
    .line 350
    .line 351
    const v14, 0x417a3d71    # 15.64f

    .line 352
    .line 353
    .line 354
    const/high16 v15, 0x41900000    # 18.0f

    .line 355
    .line 356
    const v16, 0x4148a3d7    # 12.54f

    .line 357
    .line 358
    .line 359
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 360
    .line 361
    .line 362
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 363
    .line 364
    .line 365
    const/high16 v0, 0x41400000    # 12.0f

    .line 366
    .line 367
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 368
    .line 369
    .line 370
    const/high16 v17, -0x40000000    # -2.0f

    .line 371
    .line 372
    const/high16 v18, -0x40000000    # -2.0f

    .line 373
    .line 374
    const v13, -0x40733333    # -1.1f

    .line 375
    .line 376
    .line 377
    const/4 v14, 0x0

    .line 378
    const/high16 v15, -0x40000000    # -2.0f

    .line 379
    .line 380
    const v16, -0x4099999a    # -0.9f

    .line 381
    .line 382
    .line 383
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 384
    .line 385
    .line 386
    const/high16 v0, -0x40000000    # -2.0f

    .line 387
    .line 388
    const v2, 0x3f666666    # 0.9f

    .line 389
    .line 390
    .line 391
    const/high16 v4, 0x40000000    # 2.0f

    .line 392
    .line 393
    invoke-virtual {v12, v2, v0, v4, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 394
    .line 395
    .line 396
    const v0, 0x3f666666    # 0.9f

    .line 397
    .line 398
    .line 399
    const/high16 v2, 0x40000000    # 2.0f

    .line 400
    .line 401
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 402
    .line 403
    .line 404
    const v0, 0x4151999a    # 13.1f

    .line 405
    .line 406
    .line 407
    const/high16 v2, 0x41400000    # 12.0f

    .line 408
    .line 409
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 410
    .line 411
    .line 412
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 413
    .line 414
    .line 415
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 416
    .line 417
    .line 418
    move-result-object v2

    .line 419
    const/16 v16, 0x3800

    .line 420
    .line 421
    const/16 v17, 0x0

    .line 422
    .line 423
    const/high16 v6, 0x3f800000    # 1.0f

    .line 424
    .line 425
    const/4 v7, 0x0

    .line 426
    const/high16 v12, 0x3f800000    # 1.0f

    .line 427
    .line 428
    const/4 v13, 0x0

    .line 429
    const/4 v15, 0x0

    .line 430
    const-string v4, ""

    .line 431
    .line 432
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 433
    .line 434
    .line 435
    move-result-object v0

    .line 436
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 437
    .line 438
    .line 439
    move-result-object v0

    .line 440
    sput-object v0, Landroidx/compose/material/icons/twotone/PlaceKt;->_place:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 441
    .line 442
    invoke-static {v0}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 443
    .line 444
    .line 445
    return-object v0
.end method
