.class public final Landroidx/compose/material/icons/twotone/PanoramaHorizontalSelectKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_panoramaHorizontalSelect",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "PanoramaHorizontalSelect",
        "Landroidx/compose/material/icons/Icons$TwoTone;",
        "getPanoramaHorizontalSelect",
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
        "SMAP\nPanoramaHorizontalSelect.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PanoramaHorizontalSelect.kt\nandroidx/compose/material/icons/twotone/PanoramaHorizontalSelectKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,67:1\n212#2,12:68\n233#2,18:81\n253#2:118\n233#2,18:119\n253#2:156\n174#3:80\n705#4,2:99\n717#4,2:101\n719#4,11:107\n705#4,2:137\n717#4,2:139\n719#4,11:145\n72#5,4:103\n72#5,4:141\n*S KotlinDebug\n*F\n+ 1 PanoramaHorizontalSelect.kt\nandroidx/compose/material/icons/twotone/PanoramaHorizontalSelectKt\n*L\n29#1:68,12\n30#1:81,18\n30#1:118\n40#1:119,18\n40#1:156\n29#1:80\n30#1:99,2\n30#1:101,2\n30#1:107,11\n40#1:137,2\n40#1:139,2\n40#1:145,11\n30#1:103,4\n40#1:141,4\n*E\n"
    }
.end annotation


# static fields
.field private static _panoramaHorizontalSelect:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getPanoramaHorizontalSelect(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/PanoramaHorizontalSelectKt;->_panoramaHorizontalSelect:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.PanoramaHorizontalSelect"

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
    const v4, 0x40cc28f6    # 6.38f

    .line 71
    .line 72
    .line 73
    const/high16 v6, 0x40800000    # 4.0f

    .line 74
    .line 75
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    const/high16 v4, 0x41340000    # 11.25f

    .line 79
    .line 80
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 81
    .line 82
    .line 83
    const/high16 v25, 0x41000000    # 8.0f

    .line 84
    .line 85
    const v26, -0x406f5c29    # -1.13f

    .line 86
    .line 87
    .line 88
    const v21, 0x4000a3d7    # 2.01f

    .line 89
    .line 90
    .line 91
    const v22, -0x40e8f5c3    # -0.59f

    .line 92
    .line 93
    .line 94
    const v23, 0x4093851f    # 4.61f

    .line 95
    .line 96
    .line 97
    const v24, -0x406f5c29    # -1.13f

    .line 98
    .line 99
    .line 100
    move-object/from16 v20, v2

    .line 101
    .line 102
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 103
    .line 104
    .line 105
    const v26, 0x3f90a3d7    # 1.13f

    .line 106
    .line 107
    .line 108
    const v21, 0x405851ec    # 3.38f

    .line 109
    .line 110
    .line 111
    const/16 v22, 0x0

    .line 112
    .line 113
    const v23, 0x40bfae14    # 5.99f

    .line 114
    .line 115
    .line 116
    const v24, 0x3f0a3d71    # 0.54f

    .line 117
    .line 118
    .line 119
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 120
    .line 121
    .line 122
    const v4, 0x40cbd70a    # 6.37f

    .line 123
    .line 124
    .line 125
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 126
    .line 127
    .line 128
    const/high16 v25, -0x3f000000    # -8.0f

    .line 129
    .line 130
    const v21, -0x3fff5c29    # -2.01f

    .line 131
    .line 132
    .line 133
    const v22, 0x3f170a3d    # 0.59f

    .line 134
    .line 135
    .line 136
    const v23, -0x3f6c28f6    # -4.62f

    .line 137
    .line 138
    .line 139
    const v24, 0x3f90a3d7    # 1.13f

    .line 140
    .line 141
    .line 142
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 143
    .line 144
    .line 145
    const/high16 v25, 0x40800000    # 4.0f

    .line 146
    .line 147
    const v26, 0x40cc28f6    # 6.38f

    .line 148
    .line 149
    .line 150
    const v21, 0x41151eb8    # 9.32f

    .line 151
    .line 152
    .line 153
    const/high16 v22, 0x40f00000    # 7.5f

    .line 154
    .line 155
    const v23, 0x40d28f5c    # 6.58f

    .line 156
    .line 157
    .line 158
    const v24, 0x40e3851f    # 7.11f

    .line 159
    .line 160
    .line 161
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 162
    .line 163
    .line 164
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 165
    .line 166
    .line 167
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 168
    .line 169
    .line 170
    move-result-object v2

    .line 171
    const/16 v16, 0x3800

    .line 172
    .line 173
    const/16 v17, 0x0

    .line 174
    .line 175
    const v6, 0x3e99999a    # 0.3f

    .line 176
    .line 177
    .line 178
    const v8, 0x3e99999a    # 0.3f

    .line 179
    .line 180
    .line 181
    const/4 v7, 0x0

    .line 182
    const/high16 v9, 0x3f800000    # 1.0f

    .line 183
    .line 184
    const/high16 v12, 0x3f800000    # 1.0f

    .line 185
    .line 186
    const/4 v13, 0x0

    .line 187
    const/4 v14, 0x0

    .line 188
    const/4 v15, 0x0

    .line 189
    const-string v4, ""

    .line 190
    .line 191
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 192
    .line 193
    .line 194
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 195
    .line 196
    .line 197
    move-result v3

    .line 198
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 199
    .line 200
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 201
    .line 202
    .line 203
    move-result-wide v6

    .line 204
    const/4 v0, 0x0

    .line 205
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 206
    .line 207
    .line 208
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 209
    .line 210
    .line 211
    move-result v10

    .line 212
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 213
    .line 214
    .line 215
    move-result v11

    .line 216
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 217
    .line 218
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 219
    .line 220
    .line 221
    const v0, 0x41a8147b    # 21.01f

    .line 222
    .line 223
    .line 224
    const/high16 v2, 0x40800000    # 4.0f

    .line 225
    .line 226
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 227
    .line 228
    .line 229
    const/high16 v17, 0x41400000    # 12.0f

    .line 230
    .line 231
    const/high16 v18, 0x40b00000    # 5.5f

    .line 232
    .line 233
    const v13, 0x41a3999a    # 20.45f

    .line 234
    .line 235
    .line 236
    const/high16 v14, 0x40800000    # 4.0f

    .line 237
    .line 238
    const v15, 0x418b3333    # 17.4f

    .line 239
    .line 240
    .line 241
    const/high16 v16, 0x40b00000    # 5.5f

    .line 242
    .line 243
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 244
    .line 245
    .line 246
    const v17, -0x3eefd70a    # -9.01f

    .line 247
    .line 248
    .line 249
    const v18, -0x404147ae    # -1.49f

    .line 250
    .line 251
    .line 252
    const v13, -0x3f56147b    # -5.31f

    .line 253
    .line 254
    .line 255
    const/4 v14, 0x0

    .line 256
    const v15, -0x3ef828f6    # -8.49f

    .line 257
    .line 258
    .line 259
    const v16, -0x404147ae    # -1.49f

    .line 260
    .line 261
    .line 262
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 263
    .line 264
    .line 265
    const/high16 v17, 0x40000000    # 2.0f

    .line 266
    .line 267
    const v18, 0x40a0a3d7    # 5.02f

    .line 268
    .line 269
    .line 270
    const v13, 0x401d70a4    # 2.46f

    .line 271
    .line 272
    .line 273
    const v14, 0x408051ec    # 4.01f

    .line 274
    .line 275
    .line 276
    const/high16 v15, 0x40000000    # 2.0f

    .line 277
    .line 278
    const v16, 0x408e6666    # 4.45f

    .line 279
    .line 280
    .line 281
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 282
    .line 283
    .line 284
    const/high16 v0, 0x41980000    # 19.0f

    .line 285
    .line 286
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 287
    .line 288
    .line 289
    const v17, 0x3f7d70a4    # 0.99f

    .line 290
    .line 291
    .line 292
    const/high16 v18, 0x3f800000    # 1.0f

    .line 293
    .line 294
    const/4 v13, 0x0

    .line 295
    const v14, 0x3f11eb85    # 0.57f

    .line 296
    .line 297
    .line 298
    const v15, 0x3eeb851f    # 0.46f

    .line 299
    .line 300
    .line 301
    const/high16 v16, 0x3f800000    # 1.0f

    .line 302
    .line 303
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 304
    .line 305
    .line 306
    const v17, 0x411028f6    # 9.01f

    .line 307
    .line 308
    .line 309
    const/high16 v18, -0x40400000    # -1.5f

    .line 310
    .line 311
    const v13, 0x3f11eb85    # 0.57f

    .line 312
    .line 313
    .line 314
    const/4 v14, 0x0

    .line 315
    const v15, 0x40633333    # 3.55f

    .line 316
    .line 317
    .line 318
    const/high16 v16, -0x40400000    # -1.5f

    .line 319
    .line 320
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 321
    .line 322
    .line 323
    const/high16 v18, 0x3fc00000    # 1.5f

    .line 324
    .line 325
    const v13, 0x40ad70a4    # 5.42f

    .line 326
    .line 327
    .line 328
    const v15, 0x41070a3d    # 8.44f

    .line 329
    .line 330
    .line 331
    const/high16 v16, 0x3fc00000    # 1.5f

    .line 332
    .line 333
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 334
    .line 335
    .line 336
    const v17, 0x3f7d70a4    # 0.99f

    .line 337
    .line 338
    .line 339
    const/high16 v18, -0x40800000    # -1.0f

    .line 340
    .line 341
    const v13, 0x3f07ae14    # 0.53f

    .line 342
    .line 343
    .line 344
    const v15, 0x3f7d70a4    # 0.99f

    .line 345
    .line 346
    .line 347
    const v16, -0x4123d70a    # -0.43f

    .line 348
    .line 349
    .line 350
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 351
    .line 352
    .line 353
    const/high16 v0, 0x40a00000    # 5.0f

    .line 354
    .line 355
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 356
    .line 357
    .line 358
    const v17, 0x41a8147b    # 21.01f

    .line 359
    .line 360
    .line 361
    const/high16 v18, 0x40800000    # 4.0f

    .line 362
    .line 363
    const/high16 v13, 0x41b00000    # 22.0f

    .line 364
    .line 365
    const v14, 0x408dc28f    # 4.43f

    .line 366
    .line 367
    .line 368
    const v15, 0x41ac51ec    # 21.54f

    .line 369
    .line 370
    .line 371
    const/high16 v16, 0x40800000    # 4.0f

    .line 372
    .line 373
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 374
    .line 375
    .line 376
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 377
    .line 378
    .line 379
    const/high16 v0, 0x41a00000    # 20.0f

    .line 380
    .line 381
    const v2, 0x418d0a3d    # 17.63f

    .line 382
    .line 383
    .line 384
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 385
    .line 386
    .line 387
    const/high16 v17, -0x3f000000    # -8.0f

    .line 388
    .line 389
    const v18, -0x406f5c29    # -1.13f

    .line 390
    .line 391
    .line 392
    const v13, -0x3fff5c29    # -2.01f

    .line 393
    .line 394
    .line 395
    const v14, -0x40e8f5c3    # -0.59f

    .line 396
    .line 397
    .line 398
    const v15, -0x3f6c28f6    # -4.62f

    .line 399
    .line 400
    .line 401
    const v16, -0x406f5c29    # -1.13f

    .line 402
    .line 403
    .line 404
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 405
    .line 406
    .line 407
    const v18, 0x3f90a3d7    # 1.13f

    .line 408
    .line 409
    .line 410
    const v13, -0x3fa70a3d    # -3.39f

    .line 411
    .line 412
    .line 413
    const/4 v14, 0x0

    .line 414
    const v15, -0x3f4051ec    # -5.99f

    .line 415
    .line 416
    .line 417
    const v16, 0x3f0a3d71    # 0.54f

    .line 418
    .line 419
    .line 420
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 421
    .line 422
    .line 423
    const v0, 0x40cc28f6    # 6.38f

    .line 424
    .line 425
    .line 426
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 427
    .line 428
    .line 429
    const/high16 v17, 0x41400000    # 12.0f

    .line 430
    .line 431
    const/high16 v18, 0x40f00000    # 7.5f

    .line 432
    .line 433
    const v13, 0x40d28f5c    # 6.58f

    .line 434
    .line 435
    .line 436
    const v14, 0x40e3851f    # 7.11f

    .line 437
    .line 438
    .line 439
    const v15, 0x41151eb8    # 9.32f

    .line 440
    .line 441
    .line 442
    const/high16 v16, 0x40f00000    # 7.5f

    .line 443
    .line 444
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 445
    .line 446
    .line 447
    const/high16 v17, 0x41000000    # 8.0f

    .line 448
    .line 449
    const v18, -0x406f5c29    # -1.13f

    .line 450
    .line 451
    .line 452
    const v13, 0x405851ec    # 3.38f

    .line 453
    .line 454
    .line 455
    const/4 v14, 0x0

    .line 456
    const v15, 0x40bfae14    # 5.99f

    .line 457
    .line 458
    .line 459
    const v16, -0x40f5c28f    # -0.54f

    .line 460
    .line 461
    .line 462
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 463
    .line 464
    .line 465
    const v0, 0x418d0a3d    # 17.63f

    .line 466
    .line 467
    .line 468
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 469
    .line 470
    .line 471
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 472
    .line 473
    .line 474
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 475
    .line 476
    .line 477
    move-result-object v2

    .line 478
    const/16 v16, 0x3800

    .line 479
    .line 480
    const/16 v17, 0x0

    .line 481
    .line 482
    const/high16 v6, 0x3f800000    # 1.0f

    .line 483
    .line 484
    const/high16 v8, 0x3f800000    # 1.0f

    .line 485
    .line 486
    const/4 v7, 0x0

    .line 487
    const/high16 v12, 0x3f800000    # 1.0f

    .line 488
    .line 489
    const/4 v13, 0x0

    .line 490
    const/4 v15, 0x0

    .line 491
    const-string v4, ""

    .line 492
    .line 493
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 494
    .line 495
    .line 496
    move-result-object v0

    .line 497
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 498
    .line 499
    .line 500
    move-result-object v0

    .line 501
    sput-object v0, Landroidx/compose/material/icons/twotone/PanoramaHorizontalSelectKt;->_panoramaHorizontalSelect:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 502
    .line 503
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 504
    .line 505
    .line 506
    return-object v0
.end method
