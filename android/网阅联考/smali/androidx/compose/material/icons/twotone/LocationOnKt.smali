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
        "SMAP\nLocationOn.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LocationOn.kt\nandroidx/compose/material/icons/twotone/LocationOnKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,69:1\n122#2:70\n116#2,3:71\n119#2,3:75\n132#2,18:78\n152#2:115\n132#2,18:116\n152#2:153\n132#2,18:154\n152#2:191\n175#3:74\n694#4,2:96\n706#4,2:98\n708#4,11:104\n694#4,2:134\n706#4,2:136\n708#4,11:142\n694#4,2:172\n706#4,2:174\n708#4,11:180\n53#5,4:100\n53#5,4:138\n53#5,4:176\n*S KotlinDebug\n*F\n+ 1 LocationOn.kt\nandroidx/compose/material/icons/twotone/LocationOnKt\n*L\n29#1:70\n29#1:71,3\n29#1:75,3\n30#1:78,18\n30#1:115\n44#1:116,18\n44#1:153\n58#1:154,18\n58#1:191\n29#1:74\n30#1:96,2\n30#1:98,2\n30#1:104,11\n44#1:134,2\n44#1:136,2\n44#1:142,11\n58#1:172,2\n58#1:174,2\n58#1:180,11\n30#1:100,4\n44#1:138,4\n58#1:176,4\n*E\n"
    }
.end annotation


# static fields
.field private static _locationOn:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getLocationOn(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 64

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
    sget-object v0, Landroidx/compose/material/icons/twotone/LocationOnKt;->_locationOn:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.LocationOn"

    .line 17
    .line 18
    new-instance v1, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 19
    .line 20
    move-object/from16 v47, v1

    .line 21
    .line 22
    move-object/from16 v30, v1

    .line 23
    .line 24
    move-object v13, v1

    .line 25
    const/high16 v0, 0x41c00000    # 24.0f

    .line 26
    .line 27
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 32
    .line 33
    .line 34
    move-result v4

    .line 35
    const/high16 v5, 0x41c00000    # 24.0f

    .line 36
    .line 37
    const/high16 v6, 0x41c00000    # 24.0f

    .line 38
    .line 39
    const-wide/16 v7, 0x0

    .line 40
    .line 41
    const/4 v9, 0x0

    .line 42
    const/4 v10, 0x0

    .line 43
    const/16 v11, 0xe0

    .line 44
    .line 45
    const/4 v12, 0x0

    .line 46
    invoke-direct/range {v1 .. v12}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;-><init>(Ljava/lang/String;FFFFJIZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 47
    .line 48
    .line 49
    const v18, 0x3e99999a    # 0.3f

    .line 50
    .line 51
    .line 52
    const v20, 0x3e99999a    # 0.3f

    .line 53
    .line 54
    .line 55
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 56
    .line 57
    .line 58
    move-result v15

    .line 59
    new-instance v0, Landroidx/compose/ui/graphics/SolidColor;

    .line 60
    .line 61
    move-object/from16 v17, v0

    .line 62
    .line 63
    sget-object v1, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    .line 64
    .line 65
    invoke-virtual {v1}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 66
    .line 67
    .line 68
    move-result-wide v2

    .line 69
    const/4 v4, 0x0

    .line 70
    invoke-direct {v0, v2, v3, v4}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 71
    .line 72
    .line 73
    const/16 v19, 0x0

    .line 74
    .line 75
    const/high16 v21, 0x3f800000    # 1.0f

    .line 76
    .line 77
    sget-object v0, Landroidx/compose/ui/graphics/StrokeCap;->Companion:Landroidx/compose/ui/graphics/StrokeCap$Companion;

    .line 78
    .line 79
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 80
    .line 81
    .line 82
    move-result v22

    .line 83
    sget-object v2, Landroidx/compose/ui/graphics/StrokeJoin;->Companion:Landroidx/compose/ui/graphics/StrokeJoin$Companion;

    .line 84
    .line 85
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 86
    .line 87
    .line 88
    move-result v23

    .line 89
    const/high16 v24, 0x3f800000    # 1.0f

    .line 90
    .line 91
    const-string v16, ""

    .line 92
    .line 93
    new-instance v3, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 94
    .line 95
    invoke-direct {v3}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 96
    .line 97
    .line 98
    const/high16 v5, 0x40800000    # 4.0f

    .line 99
    .line 100
    const/high16 v12, 0x41400000    # 12.0f

    .line 101
    .line 102
    invoke-virtual {v3, v12, v5}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 103
    .line 104
    .line 105
    const v6, 0x4113d70a    # 9.24f

    .line 106
    .line 107
    .line 108
    const/high16 v7, 0x40800000    # 4.0f

    .line 109
    .line 110
    const/high16 v8, 0x40e00000    # 7.0f

    .line 111
    .line 112
    const v9, 0x40c7ae14    # 6.24f

    .line 113
    .line 114
    .line 115
    const/high16 v10, 0x40e00000    # 7.0f

    .line 116
    .line 117
    const/high16 v11, 0x41100000    # 9.0f

    .line 118
    .line 119
    move-object v5, v3

    .line 120
    invoke-virtual/range {v5 .. v11}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 121
    .line 122
    .line 123
    const/4 v6, 0x0

    .line 124
    const v7, 0x40366666    # 2.85f

    .line 125
    .line 126
    .line 127
    const v8, 0x403ae148    # 2.92f

    .line 128
    .line 129
    .line 130
    const v9, 0x40e6b852    # 7.21f

    .line 131
    .line 132
    .line 133
    const/high16 v10, 0x40a00000    # 5.0f

    .line 134
    .line 135
    const v11, 0x411e147b    # 9.88f

    .line 136
    .line 137
    .line 138
    invoke-virtual/range {v5 .. v11}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 139
    .line 140
    .line 141
    const v6, 0x40070a3d    # 2.11f

    .line 142
    .line 143
    .line 144
    const v7, -0x3fd3d70a    # -2.69f

    .line 145
    .line 146
    .line 147
    const/high16 v8, 0x40a00000    # 5.0f

    .line 148
    .line 149
    const/high16 v9, -0x3f200000    # -7.0f

    .line 150
    .line 151
    const v11, -0x3ee1eb85    # -9.88f

    .line 152
    .line 153
    .line 154
    invoke-virtual/range {v5 .. v11}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 155
    .line 156
    .line 157
    const/4 v6, 0x0

    .line 158
    const v7, -0x3fcf5c29    # -2.76f

    .line 159
    .line 160
    .line 161
    const v8, -0x3ff0a3d7    # -2.24f

    .line 162
    .line 163
    .line 164
    const/high16 v9, -0x3f600000    # -5.0f

    .line 165
    .line 166
    const/high16 v10, -0x3f600000    # -5.0f

    .line 167
    .line 168
    const/high16 v11, -0x3f600000    # -5.0f

    .line 169
    .line 170
    invoke-virtual/range {v5 .. v11}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 171
    .line 172
    .line 173
    invoke-virtual {v3}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 174
    .line 175
    .line 176
    const/high16 v5, 0x41380000    # 11.5f

    .line 177
    .line 178
    invoke-virtual {v3, v12, v5}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 179
    .line 180
    .line 181
    const v6, -0x404f5c29    # -1.38f

    .line 182
    .line 183
    .line 184
    const/4 v7, 0x0

    .line 185
    const/high16 v8, -0x3fe00000    # -2.5f

    .line 186
    .line 187
    const v9, -0x4070a3d7    # -1.12f

    .line 188
    .line 189
    .line 190
    const/high16 v10, -0x3fe00000    # -2.5f

    .line 191
    .line 192
    const/high16 v11, -0x3fe00000    # -2.5f

    .line 193
    .line 194
    move-object v5, v3

    .line 195
    invoke-virtual/range {v5 .. v11}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 196
    .line 197
    .line 198
    const v5, 0x3f8f5c29    # 1.12f

    .line 199
    .line 200
    .line 201
    const/high16 v6, -0x3fe00000    # -2.5f

    .line 202
    .line 203
    const/high16 v7, 0x40200000    # 2.5f

    .line 204
    .line 205
    invoke-virtual {v3, v5, v6, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 206
    .line 207
    .line 208
    invoke-virtual {v3, v7, v5, v7, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 209
    .line 210
    .line 211
    const v5, -0x4070a3d7    # -1.12f

    .line 212
    .line 213
    .line 214
    invoke-virtual {v3, v5, v7, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 215
    .line 216
    .line 217
    invoke-virtual {v3}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 218
    .line 219
    .line 220
    invoke-virtual {v3}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 221
    .line 222
    .line 223
    move-result-object v14

    .line 224
    const/16 v25, 0x0

    .line 225
    .line 226
    const/16 v26, 0x0

    .line 227
    .line 228
    const/16 v27, 0x0

    .line 229
    .line 230
    const/16 v28, 0x3800

    .line 231
    .line 232
    const/16 v29, 0x0

    .line 233
    .line 234
    invoke-static/range {v13 .. v29}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 235
    .line 236
    .line 237
    const/high16 v35, 0x3f800000    # 1.0f

    .line 238
    .line 239
    const/high16 v37, 0x3f800000    # 1.0f

    .line 240
    .line 241
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 242
    .line 243
    .line 244
    move-result v32

    .line 245
    new-instance v3, Landroidx/compose/ui/graphics/SolidColor;

    .line 246
    .line 247
    move-object/from16 v34, v3

    .line 248
    .line 249
    invoke-virtual {v1}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 250
    .line 251
    .line 252
    move-result-wide v7

    .line 253
    invoke-direct {v3, v7, v8, v4}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 254
    .line 255
    .line 256
    const/16 v36, 0x0

    .line 257
    .line 258
    const/high16 v38, 0x3f800000    # 1.0f

    .line 259
    .line 260
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 261
    .line 262
    .line 263
    move-result v39

    .line 264
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 265
    .line 266
    .line 267
    move-result v40

    .line 268
    const/high16 v41, 0x3f800000    # 1.0f

    .line 269
    .line 270
    const-string v33, ""

    .line 271
    .line 272
    new-instance v3, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 273
    .line 274
    invoke-direct {v3}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 275
    .line 276
    .line 277
    const/high16 v5, 0x40000000    # 2.0f

    .line 278
    .line 279
    invoke-virtual {v3, v12, v5}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 280
    .line 281
    .line 282
    const v14, 0x4102147b    # 8.13f

    .line 283
    .line 284
    .line 285
    const/high16 v15, 0x40000000    # 2.0f

    .line 286
    .line 287
    const/high16 v16, 0x40a00000    # 5.0f

    .line 288
    .line 289
    const v17, 0x40a428f6    # 5.13f

    .line 290
    .line 291
    .line 292
    const/high16 v18, 0x40a00000    # 5.0f

    .line 293
    .line 294
    const/high16 v19, 0x41100000    # 9.0f

    .line 295
    .line 296
    move-object v13, v3

    .line 297
    invoke-virtual/range {v13 .. v19}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 298
    .line 299
    .line 300
    const/4 v14, 0x0

    .line 301
    const/high16 v15, 0x40a80000    # 5.25f

    .line 302
    .line 303
    const/high16 v16, 0x40e00000    # 7.0f

    .line 304
    .line 305
    const/high16 v17, 0x41500000    # 13.0f

    .line 306
    .line 307
    const/high16 v18, 0x40e00000    # 7.0f

    .line 308
    .line 309
    const/high16 v19, 0x41500000    # 13.0f

    .line 310
    .line 311
    invoke-virtual/range {v13 .. v19}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 312
    .line 313
    .line 314
    const/high16 v5, -0x3f080000    # -7.75f

    .line 315
    .line 316
    const/high16 v7, -0x3eb00000    # -13.0f

    .line 317
    .line 318
    const/high16 v8, 0x40e00000    # 7.0f

    .line 319
    .line 320
    invoke-virtual {v3, v8, v5, v8, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 321
    .line 322
    .line 323
    const v15, -0x3f8851ec    # -3.87f

    .line 324
    .line 325
    .line 326
    const v16, -0x3fb7ae14    # -3.13f

    .line 327
    .line 328
    .line 329
    const/high16 v17, -0x3f200000    # -7.0f

    .line 330
    .line 331
    const/high16 v18, -0x3f200000    # -7.0f

    .line 332
    .line 333
    const/high16 v19, -0x3f200000    # -7.0f

    .line 334
    .line 335
    invoke-virtual/range {v13 .. v19}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 336
    .line 337
    .line 338
    invoke-virtual {v3}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 339
    .line 340
    .line 341
    const/high16 v5, 0x41100000    # 9.0f

    .line 342
    .line 343
    invoke-virtual {v3, v8, v5}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 344
    .line 345
    .line 346
    const v15, -0x3fcf5c29    # -2.76f

    .line 347
    .line 348
    .line 349
    const v16, 0x400f5c29    # 2.24f

    .line 350
    .line 351
    .line 352
    const/high16 v17, -0x3f600000    # -5.0f

    .line 353
    .line 354
    const/high16 v18, 0x40a00000    # 5.0f

    .line 355
    .line 356
    const/high16 v19, -0x3f600000    # -5.0f

    .line 357
    .line 358
    invoke-virtual/range {v13 .. v19}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 359
    .line 360
    .line 361
    const v7, 0x400f5c29    # 2.24f

    .line 362
    .line 363
    .line 364
    const/high16 v8, 0x40a00000    # 5.0f

    .line 365
    .line 366
    invoke-virtual {v3, v8, v7, v8, v8}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 367
    .line 368
    .line 369
    const v15, 0x403851ec    # 2.88f

    .line 370
    .line 371
    .line 372
    const v16, -0x3fc7ae14    # -2.88f

    .line 373
    .line 374
    .line 375
    const v17, 0x40e6147b    # 7.19f

    .line 376
    .line 377
    .line 378
    const/high16 v18, -0x3f600000    # -5.0f

    .line 379
    .line 380
    const v19, 0x411e147b    # 9.88f

    .line 381
    .line 382
    .line 383
    invoke-virtual/range {v13 .. v19}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 384
    .line 385
    .line 386
    const v14, 0x411eb852    # 9.92f

    .line 387
    .line 388
    .line 389
    const v15, 0x4181ae14    # 16.21f

    .line 390
    .line 391
    .line 392
    const/high16 v16, 0x40e00000    # 7.0f

    .line 393
    .line 394
    const v17, 0x413d999a    # 11.85f

    .line 395
    .line 396
    .line 397
    const/high16 v18, 0x40e00000    # 7.0f

    .line 398
    .line 399
    const/high16 v19, 0x41100000    # 9.0f

    .line 400
    .line 401
    invoke-virtual/range {v13 .. v19}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 402
    .line 403
    .line 404
    invoke-virtual {v3}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 405
    .line 406
    .line 407
    invoke-virtual {v3}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 408
    .line 409
    .line 410
    move-result-object v31

    .line 411
    const/16 v42, 0x0

    .line 412
    .line 413
    const/16 v43, 0x0

    .line 414
    .line 415
    const/16 v44, 0x0

    .line 416
    .line 417
    const/16 v45, 0x3800

    .line 418
    .line 419
    const/16 v46, 0x0

    .line 420
    .line 421
    invoke-static/range {v30 .. v46}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 422
    .line 423
    .line 424
    const/high16 v52, 0x3f800000    # 1.0f

    .line 425
    .line 426
    const/high16 v54, 0x3f800000    # 1.0f

    .line 427
    .line 428
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 429
    .line 430
    .line 431
    move-result v49

    .line 432
    new-instance v3, Landroidx/compose/ui/graphics/SolidColor;

    .line 433
    .line 434
    move-object/from16 v51, v3

    .line 435
    .line 436
    invoke-virtual {v1}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 437
    .line 438
    .line 439
    move-result-wide v7

    .line 440
    invoke-direct {v3, v7, v8, v4}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 441
    .line 442
    .line 443
    const/16 v53, 0x0

    .line 444
    .line 445
    const/high16 v55, 0x3f800000    # 1.0f

    .line 446
    .line 447
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 448
    .line 449
    .line 450
    move-result v56

    .line 451
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 452
    .line 453
    .line 454
    move-result v57

    .line 455
    const/high16 v58, 0x3f800000    # 1.0f

    .line 456
    .line 457
    const-string v50, ""

    .line 458
    .line 459
    new-instance v0, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 460
    .line 461
    invoke-direct {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 462
    .line 463
    .line 464
    invoke-virtual {v0, v12, v5}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 465
    .line 466
    .line 467
    const/4 v1, 0x0

    .line 468
    invoke-virtual {v0, v6, v1}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 469
    .line 470
    .line 471
    const/high16 v14, 0x40200000    # 2.5f

    .line 472
    .line 473
    const/high16 v15, 0x40200000    # 2.5f

    .line 474
    .line 475
    const/16 v16, 0x0

    .line 476
    .line 477
    const/16 v17, 0x1

    .line 478
    .line 479
    const/16 v18, 0x1

    .line 480
    .line 481
    const/high16 v19, 0x40a00000    # 5.0f

    .line 482
    .line 483
    const/16 v20, 0x0

    .line 484
    .line 485
    move-object v13, v0

    .line 486
    invoke-virtual/range {v13 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 487
    .line 488
    .line 489
    const/high16 v19, -0x3f600000    # -5.0f

    .line 490
    .line 491
    invoke-virtual/range {v13 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 492
    .line 493
    .line 494
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 495
    .line 496
    .line 497
    move-result-object v48

    .line 498
    const/16 v59, 0x0

    .line 499
    .line 500
    const/16 v60, 0x0

    .line 501
    .line 502
    const/16 v61, 0x0

    .line 503
    .line 504
    const/16 v62, 0x3800

    .line 505
    .line 506
    const/16 v63, 0x0

    .line 507
    .line 508
    invoke-static/range {v47 .. v63}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 509
    .line 510
    .line 511
    move-result-object v0

    .line 512
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 513
    .line 514
    .line 515
    move-result-object v0

    .line 516
    sput-object v0, Landroidx/compose/material/icons/twotone/LocationOnKt;->_locationOn:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 517
    .line 518
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 519
    .line 520
    .line 521
    return-object v0
.end method
