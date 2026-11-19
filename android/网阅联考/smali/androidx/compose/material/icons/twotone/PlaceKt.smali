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
        "SMAP\nPlace.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Place.kt\nandroidx/compose/material/icons/twotone/PlaceKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,65:1\n122#2:66\n116#2,3:67\n119#2,3:71\n132#2,18:74\n152#2:111\n132#2,18:112\n152#2:149\n175#3:70\n694#4,2:92\n706#4,2:94\n708#4,11:100\n694#4,2:130\n706#4,2:132\n708#4,11:138\n53#5,4:96\n53#5,4:134\n*S KotlinDebug\n*F\n+ 1 Place.kt\nandroidx/compose/material/icons/twotone/PlaceKt\n*L\n29#1:66\n29#1:67,3\n29#1:71,3\n30#1:74,18\n30#1:111\n40#1:112,18\n40#1:149\n29#1:70\n30#1:92,2\n30#1:94,2\n30#1:100,11\n40#1:130,2\n40#1:132,2\n40#1:138,11\n30#1:96,4\n40#1:134,4\n*E\n"
    }
.end annotation


# static fields
.field private static _place:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getPlace(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 47

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    move-object/from16 v1, p0

    .line 4
    .line 5
    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    sget-object v0, Landroidx/compose/material/icons/twotone/PlaceKt;->_place:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    return-object v0

    .line 16
    :cond_0
    const-string v2, "TwoTone.Place"

    .line 17
    .line 18
    new-instance v1, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 19
    .line 20
    move-object/from16 v30, v1

    .line 21
    .line 22
    move-object v13, v1

    .line 23
    const/high16 v0, 0x41c00000    # 24.0f

    .line 24
    .line 25
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 30
    .line 31
    .line 32
    move-result v4

    .line 33
    const/high16 v5, 0x41c00000    # 24.0f

    .line 34
    .line 35
    const/high16 v6, 0x41c00000    # 24.0f

    .line 36
    .line 37
    const-wide/16 v7, 0x0

    .line 38
    .line 39
    const/4 v9, 0x0

    .line 40
    const/4 v10, 0x0

    .line 41
    const/16 v11, 0xe0

    .line 42
    .line 43
    const/4 v12, 0x0

    .line 44
    invoke-direct/range {v1 .. v12}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;-><init>(Ljava/lang/String;FFFFJIZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 45
    .line 46
    .line 47
    const v18, 0x3e99999a    # 0.3f

    .line 48
    .line 49
    .line 50
    const/high16 v20, 0x3f800000    # 1.0f

    .line 51
    .line 52
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 53
    .line 54
    .line 55
    move-result v15

    .line 56
    new-instance v0, Landroidx/compose/ui/graphics/SolidColor;

    .line 57
    .line 58
    move-object/from16 v17, v0

    .line 59
    .line 60
    sget-object v1, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    .line 61
    .line 62
    invoke-virtual {v1}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 63
    .line 64
    .line 65
    move-result-wide v2

    .line 66
    const/4 v4, 0x0

    .line 67
    invoke-direct {v0, v2, v3, v4}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 68
    .line 69
    .line 70
    const/16 v19, 0x0

    .line 71
    .line 72
    const/high16 v21, 0x3f800000    # 1.0f

    .line 73
    .line 74
    sget-object v0, Landroidx/compose/ui/graphics/StrokeCap;->Companion:Landroidx/compose/ui/graphics/StrokeCap$Companion;

    .line 75
    .line 76
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 77
    .line 78
    .line 79
    move-result v22

    .line 80
    sget-object v2, Landroidx/compose/ui/graphics/StrokeJoin;->Companion:Landroidx/compose/ui/graphics/StrokeJoin$Companion;

    .line 81
    .line 82
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 83
    .line 84
    .line 85
    move-result v23

    .line 86
    const/high16 v24, 0x3f800000    # 1.0f

    .line 87
    .line 88
    const-string v16, ""

    .line 89
    .line 90
    new-instance v3, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 91
    .line 92
    invoke-direct {v3}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 93
    .line 94
    .line 95
    const/high16 v12, 0x41940000    # 18.5f

    .line 96
    .line 97
    const v14, 0x41233333    # 10.2f

    .line 98
    .line 99
    .line 100
    invoke-virtual {v3, v12, v14}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 101
    .line 102
    .line 103
    const/4 v6, 0x0

    .line 104
    const v7, 0x40247ae1    # 2.57f

    .line 105
    .line 106
    .line 107
    const v8, -0x3ff9999a    # -2.1f

    .line 108
    .line 109
    .line 110
    const v9, 0x40b947ae    # 5.79f

    .line 111
    .line 112
    .line 113
    const v10, -0x3f3ae148    # -6.16f

    .line 114
    .line 115
    .line 116
    const v11, 0x411828f6    # 9.51f

    .line 117
    .line 118
    .line 119
    move-object v5, v3

    .line 120
    invoke-virtual/range {v5 .. v11}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 121
    .line 122
    .line 123
    const v5, 0x41a0147b    # 20.01f

    .line 124
    .line 125
    .line 126
    const/high16 v11, 0x41400000    # 12.0f

    .line 127
    .line 128
    invoke-virtual {v3, v11, v5}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 129
    .line 130
    .line 131
    const v5, -0x4151eb85    # -0.34f

    .line 132
    .line 133
    .line 134
    const v6, -0x416147ae    # -0.31f

    .line 135
    .line 136
    .line 137
    invoke-virtual {v3, v5, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 138
    .line 139
    .line 140
    const v6, 0x40f33333    # 7.6f

    .line 141
    .line 142
    .line 143
    const v7, 0x417fd70a    # 15.99f

    .line 144
    .line 145
    .line 146
    const/high16 v8, 0x40b00000    # 5.5f

    .line 147
    .line 148
    const v9, 0x414c51ec    # 12.77f

    .line 149
    .line 150
    .line 151
    const/high16 v10, 0x40b00000    # 5.5f

    .line 152
    .line 153
    const v25, 0x41233333    # 10.2f

    .line 154
    .line 155
    .line 156
    move-object v5, v3

    .line 157
    move/from16 v11, v25

    .line 158
    .line 159
    invoke-virtual/range {v5 .. v11}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 160
    .line 161
    .line 162
    const/4 v6, 0x0

    .line 163
    const v7, -0x3f8a3d71    # -3.84f

    .line 164
    .line 165
    .line 166
    const v8, 0x40347ae1    # 2.82f

    .line 167
    .line 168
    .line 169
    const v9, -0x3f29999a    # -6.7f

    .line 170
    .line 171
    .line 172
    const/high16 v10, 0x40d00000    # 6.5f

    .line 173
    .line 174
    const v11, -0x3f29999a    # -6.7f

    .line 175
    .line 176
    .line 177
    invoke-virtual/range {v5 .. v11}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 178
    .line 179
    .line 180
    const v5, 0x40cb3333    # 6.35f

    .line 181
    .line 182
    .line 183
    invoke-virtual {v3, v12, v5, v12, v14}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 184
    .line 185
    .line 186
    invoke-virtual {v3}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 187
    .line 188
    .line 189
    invoke-virtual {v3}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 190
    .line 191
    .line 192
    move-result-object v3

    .line 193
    move v5, v14

    .line 194
    move-object v14, v3

    .line 195
    const/16 v25, 0x0

    .line 196
    .line 197
    const/16 v26, 0x0

    .line 198
    .line 199
    const/16 v27, 0x0

    .line 200
    .line 201
    const/16 v28, 0x3800

    .line 202
    .line 203
    const/16 v29, 0x0

    .line 204
    .line 205
    invoke-static/range {v13 .. v29}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 206
    .line 207
    .line 208
    const/high16 v35, 0x3f800000    # 1.0f

    .line 209
    .line 210
    const/high16 v37, 0x3f800000    # 1.0f

    .line 211
    .line 212
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 213
    .line 214
    .line 215
    move-result v32

    .line 216
    new-instance v3, Landroidx/compose/ui/graphics/SolidColor;

    .line 217
    .line 218
    move-object/from16 v34, v3

    .line 219
    .line 220
    invoke-virtual {v1}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 221
    .line 222
    .line 223
    move-result-wide v6

    .line 224
    invoke-direct {v3, v6, v7, v4}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 225
    .line 226
    .line 227
    const/16 v36, 0x0

    .line 228
    .line 229
    const/high16 v38, 0x3f800000    # 1.0f

    .line 230
    .line 231
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 232
    .line 233
    .line 234
    move-result v39

    .line 235
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 236
    .line 237
    .line 238
    move-result v40

    .line 239
    const/high16 v41, 0x3f800000    # 1.0f

    .line 240
    .line 241
    const-string v33, ""

    .line 242
    .line 243
    new-instance v0, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 244
    .line 245
    invoke-direct {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 246
    .line 247
    .line 248
    const/high16 v1, 0x40000000    # 2.0f

    .line 249
    .line 250
    const/high16 v2, 0x41400000    # 12.0f

    .line 251
    .line 252
    invoke-virtual {v0, v2, v1}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 253
    .line 254
    .line 255
    const v7, 0x40866666    # 4.2f

    .line 256
    .line 257
    .line 258
    const/4 v8, 0x0

    .line 259
    const/high16 v9, 0x41000000    # 8.0f

    .line 260
    .line 261
    const v10, 0x404e147b    # 3.22f

    .line 262
    .line 263
    .line 264
    const/high16 v11, 0x41000000    # 8.0f

    .line 265
    .line 266
    const v12, 0x41033333    # 8.2f

    .line 267
    .line 268
    .line 269
    move-object v6, v0

    .line 270
    invoke-virtual/range {v6 .. v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 271
    .line 272
    .line 273
    const/4 v7, 0x0

    .line 274
    const v8, 0x40547ae1    # 3.32f

    .line 275
    .line 276
    .line 277
    const v9, -0x3fd51eb8    # -2.67f

    .line 278
    .line 279
    .line 280
    const/high16 v10, 0x40e80000    # 7.25f

    .line 281
    .line 282
    const/high16 v11, -0x3f000000    # -8.0f

    .line 283
    .line 284
    const v12, 0x413ccccd    # 11.8f

    .line 285
    .line 286
    .line 287
    invoke-virtual/range {v6 .. v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 288
    .line 289
    .line 290
    const v7, -0x3f5570a4    # -5.33f

    .line 291
    .line 292
    .line 293
    const v8, -0x3f6e6666    # -4.55f

    .line 294
    .line 295
    .line 296
    const/high16 v9, -0x3f000000    # -8.0f

    .line 297
    .line 298
    const v10, -0x3ef851ec    # -8.48f

    .line 299
    .line 300
    .line 301
    const v12, -0x3ec33333    # -11.8f

    .line 302
    .line 303
    .line 304
    invoke-virtual/range {v6 .. v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 305
    .line 306
    .line 307
    const/high16 v7, 0x40800000    # 4.0f

    .line 308
    .line 309
    const v8, 0x40a70a3d    # 5.22f

    .line 310
    .line 311
    .line 312
    const v9, 0x40f9999a    # 7.8f

    .line 313
    .line 314
    .line 315
    const/high16 v10, 0x40000000    # 2.0f

    .line 316
    .line 317
    const/high16 v11, 0x41400000    # 12.0f

    .line 318
    .line 319
    const/high16 v12, 0x40000000    # 2.0f

    .line 320
    .line 321
    invoke-virtual/range {v6 .. v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 322
    .line 323
    .line 324
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 325
    .line 326
    .line 327
    const/high16 v3, 0x41900000    # 18.0f

    .line 328
    .line 329
    invoke-virtual {v0, v3, v5}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 330
    .line 331
    .line 332
    const/high16 v7, 0x41900000    # 18.0f

    .line 333
    .line 334
    const v8, 0x40d23d71    # 6.57f

    .line 335
    .line 336
    .line 337
    const v9, 0x4175999a    # 15.35f

    .line 338
    .line 339
    .line 340
    const/high16 v10, 0x40800000    # 4.0f

    .line 341
    .line 342
    const/high16 v12, 0x40800000    # 4.0f

    .line 343
    .line 344
    invoke-virtual/range {v6 .. v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 345
    .line 346
    .line 347
    const v3, 0x40247ae1    # 2.57f

    .line 348
    .line 349
    .line 350
    const v4, 0x40c66666    # 6.2f

    .line 351
    .line 352
    .line 353
    const/high16 v5, -0x3f400000    # -6.0f

    .line 354
    .line 355
    invoke-virtual {v0, v5, v3, v5, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 356
    .line 357
    .line 358
    const/4 v7, 0x0

    .line 359
    const v8, 0x4015c28f    # 2.34f

    .line 360
    .line 361
    .line 362
    const v9, 0x3ff9999a    # 1.95f

    .line 363
    .line 364
    .line 365
    const v10, 0x40ae147b    # 5.44f

    .line 366
    .line 367
    .line 368
    const/high16 v11, 0x40c00000    # 6.0f

    .line 369
    .line 370
    const v12, 0x41123d71    # 9.14f

    .line 371
    .line 372
    .line 373
    invoke-virtual/range {v6 .. v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 374
    .line 375
    .line 376
    const v7, 0x41806666    # 16.05f

    .line 377
    .line 378
    .line 379
    const v8, 0x417a3d71    # 15.64f

    .line 380
    .line 381
    .line 382
    const/high16 v9, 0x41900000    # 18.0f

    .line 383
    .line 384
    const v10, 0x4148a3d7    # 12.54f

    .line 385
    .line 386
    .line 387
    const/high16 v11, 0x41900000    # 18.0f

    .line 388
    .line 389
    const v12, 0x41233333    # 10.2f

    .line 390
    .line 391
    .line 392
    invoke-virtual/range {v6 .. v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 393
    .line 394
    .line 395
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 396
    .line 397
    .line 398
    invoke-virtual {v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 399
    .line 400
    .line 401
    const v7, -0x40733333    # -1.1f

    .line 402
    .line 403
    .line 404
    const/4 v8, 0x0

    .line 405
    const/high16 v9, -0x40000000    # -2.0f

    .line 406
    .line 407
    const v10, -0x4099999a    # -0.9f

    .line 408
    .line 409
    .line 410
    const/high16 v11, -0x40000000    # -2.0f

    .line 411
    .line 412
    const/high16 v12, -0x40000000    # -2.0f

    .line 413
    .line 414
    invoke-virtual/range {v6 .. v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 415
    .line 416
    .line 417
    const v3, 0x3f666666    # 0.9f

    .line 418
    .line 419
    .line 420
    const/high16 v4, -0x40000000    # -2.0f

    .line 421
    .line 422
    invoke-virtual {v0, v3, v4, v1, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 423
    .line 424
    .line 425
    invoke-virtual {v0, v1, v3, v1, v1}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 426
    .line 427
    .line 428
    const v1, 0x4151999a    # 13.1f

    .line 429
    .line 430
    .line 431
    invoke-virtual {v0, v1, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 432
    .line 433
    .line 434
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 435
    .line 436
    .line 437
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 438
    .line 439
    .line 440
    move-result-object v31

    .line 441
    const/16 v42, 0x0

    .line 442
    .line 443
    const/16 v43, 0x0

    .line 444
    .line 445
    const/16 v44, 0x0

    .line 446
    .line 447
    const/16 v45, 0x3800

    .line 448
    .line 449
    const/16 v46, 0x0

    .line 450
    .line 451
    invoke-static/range {v30 .. v46}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 452
    .line 453
    .line 454
    move-result-object v0

    .line 455
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 456
    .line 457
    .line 458
    move-result-object v0

    .line 459
    sput-object v0, Landroidx/compose/material/icons/twotone/PlaceKt;->_place:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 460
    .line 461
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 462
    .line 463
    .line 464
    return-object v0
.end method
