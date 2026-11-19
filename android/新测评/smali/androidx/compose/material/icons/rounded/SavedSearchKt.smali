.class public final Landroidx/compose/material/icons/rounded/SavedSearchKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_savedSearch",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "SavedSearch",
        "Landroidx/compose/material/icons/Icons$Rounded;",
        "getSavedSearch",
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
        "SMAP\nSavedSearch.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SavedSearch.kt\nandroidx/compose/material/icons/rounded/SavedSearchKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,68:1\n212#2,12:69\n233#2,18:82\n253#2:119\n233#2,18:120\n253#2:157\n174#3:81\n705#4,2:100\n717#4,2:102\n719#4,11:108\n705#4,2:138\n717#4,2:140\n719#4,11:146\n72#5,4:104\n72#5,4:142\n*S KotlinDebug\n*F\n+ 1 SavedSearch.kt\nandroidx/compose/material/icons/rounded/SavedSearchKt\n*L\n29#1:69,12\n30#1:82,18\n30#1:119\n50#1:120,18\n50#1:157\n29#1:81\n30#1:100,2\n30#1:102,2\n30#1:108,11\n50#1:138,2\n50#1:140,2\n50#1:146,11\n30#1:104,4\n50#1:142,4\n*E\n"
    }
.end annotation


# static fields
.field private static _savedSearch:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getSavedSearch(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/SavedSearchKt;->_savedSearch:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.SavedSearch"

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
    const v4, 0x4154f5c3    # 13.31f

    .line 71
    .line 72
    .line 73
    const v6, 0x416bae14    # 14.73f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v25, 0x3f7ae148    # 0.98f

    .line 80
    .line 81
    .line 82
    const v26, -0x3f4851ec    # -5.74f

    .line 83
    .line 84
    .line 85
    const v21, 0x3f90a3d7    # 1.13f

    .line 86
    .line 87
    .line 88
    const v22, -0x4039999a    # -1.55f

    .line 89
    .line 90
    .line 91
    const v23, 0x3fd0a3d7    # 1.63f

    .line 92
    .line 93
    .line 94
    const v24, -0x3f9ae148    # -3.58f

    .line 95
    .line 96
    .line 97
    move-object/from16 v20, v2

    .line 98
    .line 99
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 100
    .line 101
    .line 102
    const v25, -0x3f64cccd    # -4.85f

    .line 103
    .line 104
    .line 105
    const v26, -0x3f71eb85    # -4.44f

    .line 106
    .line 107
    .line 108
    const v21, -0x40d1eb85    # -0.68f

    .line 109
    .line 110
    .line 111
    const v22, -0x3ff147ae    # -2.23f

    .line 112
    .line 113
    .line 114
    const v23, -0x3fdb851f    # -2.57f

    .line 115
    .line 116
    .line 117
    const v24, -0x3f8147ae    # -3.98f

    .line 118
    .line 119
    .line 120
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 121
    .line 122
    .line 123
    const v25, 0x4048f5c3    # 3.14f

    .line 124
    .line 125
    .line 126
    const v26, 0x412dc28f    # 10.86f

    .line 127
    .line 128
    .line 129
    const v21, 0x40c6b852    # 6.21f

    .line 130
    .line 131
    .line 132
    const v22, 0x400ccccd    # 2.2f

    .line 133
    .line 134
    .line 135
    const v23, 0x400ccccd    # 2.2f

    .line 136
    .line 137
    .line 138
    const v24, 0x40c70a3d    # 6.22f

    .line 139
    .line 140
    .line 141
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 142
    .line 143
    .line 144
    const v25, 0x408e147b    # 4.44f

    .line 145
    .line 146
    .line 147
    const v26, 0x409b3333    # 4.85f

    .line 148
    .line 149
    .line 150
    const v21, 0x3eeb851f    # 0.46f

    .line 151
    .line 152
    .line 153
    const v22, 0x40128f5c    # 2.29f

    .line 154
    .line 155
    .line 156
    const v23, 0x400d70a4    # 2.21f

    .line 157
    .line 158
    .line 159
    const v24, 0x4085c28f    # 4.18f

    .line 160
    .line 161
    .line 162
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 163
    .line 164
    .line 165
    const v25, 0x40b7ae14    # 5.74f

    .line 166
    .line 167
    .line 168
    const v26, -0x40851eb8    # -0.98f

    .line 169
    .line 170
    .line 171
    const v21, 0x400a3d71    # 2.16f

    .line 172
    .line 173
    .line 174
    const v22, 0x3f266666    # 0.65f

    .line 175
    .line 176
    .line 177
    const v23, 0x4086147b    # 4.19f

    .line 178
    .line 179
    .line 180
    const v24, 0x3e19999a    # 0.15f

    .line 181
    .line 182
    .line 183
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 184
    .line 185
    .line 186
    const v4, 0x40b1eb85    # 5.56f

    .line 187
    .line 188
    .line 189
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 190
    .line 191
    .line 192
    const v25, 0x3fb47ae1    # 1.41f

    .line 193
    .line 194
    .line 195
    const/16 v26, 0x0

    .line 196
    .line 197
    const v21, 0x3ec7ae14    # 0.39f

    .line 198
    .line 199
    .line 200
    const v22, 0x3ec7ae14    # 0.39f

    .line 201
    .line 202
    .line 203
    const v23, 0x3f828f5c    # 1.02f

    .line 204
    .line 205
    .line 206
    const v24, 0x3ec7ae14    # 0.39f

    .line 207
    .line 208
    .line 209
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 210
    .line 211
    .line 212
    const/4 v4, 0x0

    .line 213
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 214
    .line 215
    .line 216
    const/16 v25, 0x0

    .line 217
    .line 218
    const v26, -0x404b851f    # -1.41f

    .line 219
    .line 220
    .line 221
    const v22, -0x413851ec    # -0.39f

    .line 222
    .line 223
    .line 224
    const v23, 0x3ec7ae14    # 0.39f

    .line 225
    .line 226
    .line 227
    const v24, -0x407d70a4    # -1.02f

    .line 228
    .line 229
    .line 230
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 231
    .line 232
    .line 233
    const v4, 0x4154f5c3    # 13.31f

    .line 234
    .line 235
    .line 236
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 237
    .line 238
    .line 239
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 240
    .line 241
    .line 242
    const/high16 v4, 0x41180000    # 9.5f

    .line 243
    .line 244
    const/high16 v6, 0x41600000    # 14.0f

    .line 245
    .line 246
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 247
    .line 248
    .line 249
    const/high16 v25, 0x40a00000    # 5.0f

    .line 250
    .line 251
    const/high16 v26, 0x41180000    # 9.5f

    .line 252
    .line 253
    const v21, 0x40e051ec    # 7.01f

    .line 254
    .line 255
    .line 256
    const/high16 v22, 0x41600000    # 14.0f

    .line 257
    .line 258
    const/high16 v23, 0x40a00000    # 5.0f

    .line 259
    .line 260
    const v24, 0x413fd70a    # 11.99f

    .line 261
    .line 262
    .line 263
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 264
    .line 265
    .line 266
    const/high16 v4, 0x40a00000    # 5.0f

    .line 267
    .line 268
    const v6, 0x40e051ec    # 7.01f

    .line 269
    .line 270
    .line 271
    const/high16 v7, 0x41180000    # 9.5f

    .line 272
    .line 273
    invoke-virtual {v2, v6, v4, v7, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 274
    .line 275
    .line 276
    const v4, 0x40e051ec    # 7.01f

    .line 277
    .line 278
    .line 279
    const/high16 v6, 0x41180000    # 9.5f

    .line 280
    .line 281
    const/high16 v7, 0x41600000    # 14.0f

    .line 282
    .line 283
    invoke-virtual {v2, v7, v4, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 284
    .line 285
    .line 286
    const v4, 0x413fd70a    # 11.99f

    .line 287
    .line 288
    .line 289
    invoke-virtual {v2, v4, v7, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 290
    .line 291
    .line 292
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 293
    .line 294
    .line 295
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 296
    .line 297
    .line 298
    move-result-object v2

    .line 299
    const/16 v16, 0x3800

    .line 300
    .line 301
    const/16 v17, 0x0

    .line 302
    .line 303
    const/high16 v6, 0x3f800000    # 1.0f

    .line 304
    .line 305
    const/high16 v8, 0x3f800000    # 1.0f

    .line 306
    .line 307
    const/4 v7, 0x0

    .line 308
    const/high16 v9, 0x3f800000    # 1.0f

    .line 309
    .line 310
    const/high16 v12, 0x3f800000    # 1.0f

    .line 311
    .line 312
    const/4 v13, 0x0

    .line 313
    const/4 v14, 0x0

    .line 314
    const/4 v15, 0x0

    .line 315
    const-string v4, ""

    .line 316
    .line 317
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 318
    .line 319
    .line 320
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 321
    .line 322
    .line 323
    move-result v3

    .line 324
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 325
    .line 326
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 327
    .line 328
    .line 329
    move-result-wide v6

    .line 330
    const/4 v0, 0x0

    .line 331
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 332
    .line 333
    .line 334
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 335
    .line 336
    .line 337
    move-result v10

    .line 338
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 339
    .line 340
    .line 341
    move-result v11

    .line 342
    new-instance v0, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 343
    .line 344
    invoke-direct {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 345
    .line 346
    .line 347
    const v2, 0x4124a3d7    # 10.29f

    .line 348
    .line 349
    .line 350
    const v4, 0x41070a3d    # 8.44f

    .line 351
    .line 352
    .line 353
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 354
    .line 355
    .line 356
    const v2, -0x3fe3d70a    # -2.44f

    .line 357
    .line 358
    .line 359
    const v4, -0x40b5c28f    # -0.79f

    .line 360
    .line 361
    .line 362
    invoke-virtual {v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 363
    .line 364
    .line 365
    const v2, 0x401c28f6    # 2.44f

    .line 366
    .line 367
    .line 368
    invoke-virtual {v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 369
    .line 370
    .line 371
    const v2, -0x3fe28f5c    # -2.46f

    .line 372
    .line 373
    .line 374
    const/4 v4, 0x0

    .line 375
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 376
    .line 377
    .line 378
    const v2, 0x3fcb851f    # 1.59f

    .line 379
    .line 380
    .line 381
    const v4, 0x4000a3d7    # 2.01f

    .line 382
    .line 383
    .line 384
    invoke-virtual {v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 385
    .line 386
    .line 387
    const v2, 0x401e147b    # 2.47f

    .line 388
    .line 389
    .line 390
    const v4, -0x40bae148    # -0.77f

    .line 391
    .line 392
    .line 393
    invoke-virtual {v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 394
    .line 395
    .line 396
    const v2, -0x403c28f6    # -1.53f

    .line 397
    .line 398
    .line 399
    const v4, 0x4000a3d7    # 2.01f

    .line 400
    .line 401
    .line 402
    invoke-virtual {v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 403
    .line 404
    .line 405
    const v2, 0x3fc3d70a    # 1.53f

    .line 406
    .line 407
    .line 408
    invoke-virtual {v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 409
    .line 410
    .line 411
    const v2, -0x3fe1eb85    # -2.47f

    .line 412
    .line 413
    .line 414
    const v4, -0x40bae148    # -0.77f

    .line 415
    .line 416
    .line 417
    invoke-virtual {v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 418
    .line 419
    .line 420
    const v2, -0x40347ae1    # -1.59f

    .line 421
    .line 422
    .line 423
    const v4, 0x4000a3d7    # 2.01f

    .line 424
    .line 425
    .line 426
    invoke-virtual {v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 427
    .line 428
    .line 429
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 430
    .line 431
    .line 432
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 433
    .line 434
    .line 435
    move-result-object v2

    .line 436
    const/high16 v6, 0x3f800000    # 1.0f

    .line 437
    .line 438
    const/4 v7, 0x0

    .line 439
    const-string v4, ""

    .line 440
    .line 441
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 442
    .line 443
    .line 444
    move-result-object v0

    .line 445
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 446
    .line 447
    .line 448
    move-result-object v0

    .line 449
    sput-object v0, Landroidx/compose/material/icons/rounded/SavedSearchKt;->_savedSearch:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 450
    .line 451
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 452
    .line 453
    .line 454
    return-object v0
.end method
