.class public final Landroidx/compose/material/icons/rounded/LocalFireDepartmentKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_localFireDepartment",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "LocalFireDepartment",
        "Landroidx/compose/material/icons/Icons$Rounded;",
        "getLocalFireDepartment",
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
        "SMAP\nLocalFireDepartment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LocalFireDepartment.kt\nandroidx/compose/material/icons/rounded/LocalFireDepartmentKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,65:1\n212#2,12:66\n233#2,18:79\n253#2:116\n233#2,18:117\n253#2:154\n174#3:78\n705#4,2:97\n717#4,2:99\n719#4,11:105\n705#4,2:135\n717#4,2:137\n719#4,11:143\n72#5,4:101\n72#5,4:139\n*S KotlinDebug\n*F\n+ 1 LocalFireDepartment.kt\nandroidx/compose/material/icons/rounded/LocalFireDepartmentKt\n*L\n29#1:66,12\n30#1:79,18\n30#1:116\n40#1:117,18\n40#1:154\n29#1:78\n30#1:97,2\n30#1:99,2\n30#1:105,11\n40#1:135,2\n40#1:137,2\n40#1:143,11\n30#1:101,4\n40#1:139,4\n*E\n"
    }
.end annotation


# static fields
.field private static _localFireDepartment:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getLocalFireDepartment(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/LocalFireDepartmentKt;->_localFireDepartment:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.LocalFireDepartment"

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
    const v4, 0x414e6666    # 12.9f

    .line 71
    .line 72
    .line 73
    const/high16 v6, 0x41400000    # 12.0f

    .line 74
    .line 75
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    const v4, -0x3ffe147b    # -2.03f

    .line 79
    .line 80
    .line 81
    const/high16 v6, 0x40000000    # 2.0f

    .line 82
    .line 83
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 84
    .line 85
    .line 86
    const v25, -0x4091eb85    # -0.93f

    .line 87
    .line 88
    .line 89
    const v26, 0x3fd5c28f    # 1.67f

    .line 90
    .line 91
    .line 92
    const v21, -0x41147ae1    # -0.46f

    .line 93
    .line 94
    .line 95
    const v22, 0x3eeb851f    # 0.46f

    .line 96
    .line 97
    .line 98
    const v23, -0x40ae147b    # -0.82f

    .line 99
    .line 100
    .line 101
    const v24, 0x3f83d70a    # 1.03f

    .line 102
    .line 103
    .line 104
    move-object/from16 v20, v2

    .line 105
    .line 106
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 107
    .line 108
    .line 109
    const/high16 v25, 0x41400000    # 12.0f

    .line 110
    .line 111
    const/high16 v26, 0x41a00000    # 20.0f

    .line 112
    .line 113
    const v21, 0x410bd70a    # 8.74f

    .line 114
    .line 115
    .line 116
    const v22, 0x419347ae    # 18.41f

    .line 117
    .line 118
    .line 119
    const v23, 0x4122e148    # 10.18f

    .line 120
    .line 121
    .line 122
    const/high16 v24, 0x41a00000    # 20.0f

    .line 123
    .line 124
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 125
    .line 126
    .line 127
    const v4, 0x403d70a4    # 2.96f

    .line 128
    .line 129
    .line 130
    const v6, -0x3fa51eb8    # -3.42f

    .line 131
    .line 132
    .line 133
    const v7, 0x4050a3d7    # 3.26f

    .line 134
    .line 135
    .line 136
    const v8, -0x40347ae1    # -1.59f

    .line 137
    .line 138
    .line 139
    invoke-virtual {v2, v7, v8, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 140
    .line 141
    .line 142
    const v25, -0x4091eb85    # -0.93f

    .line 143
    .line 144
    .line 145
    const v26, -0x402a3d71    # -1.67f

    .line 146
    .line 147
    .line 148
    const v21, -0x421eb852    # -0.11f

    .line 149
    .line 150
    .line 151
    const v22, -0x40dc28f6    # -0.64f

    .line 152
    .line 153
    .line 154
    const v23, -0x41147ae1    # -0.46f

    .line 155
    .line 156
    .line 157
    const v24, -0x4063d70a    # -1.22f

    .line 158
    .line 159
    .line 160
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 161
    .line 162
    .line 163
    const v4, 0x414e6666    # 12.9f

    .line 164
    .line 165
    .line 166
    const/high16 v6, 0x41400000    # 12.0f

    .line 167
    .line 168
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 169
    .line 170
    .line 171
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 172
    .line 173
    .line 174
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 175
    .line 176
    .line 177
    move-result-object v2

    .line 178
    const/16 v16, 0x3800

    .line 179
    .line 180
    const/16 v17, 0x0

    .line 181
    .line 182
    const/high16 v6, 0x3f800000    # 1.0f

    .line 183
    .line 184
    const/high16 v8, 0x3f800000    # 1.0f

    .line 185
    .line 186
    const/4 v7, 0x0

    .line 187
    const/high16 v9, 0x3f800000    # 1.0f

    .line 188
    .line 189
    const/high16 v12, 0x3f800000    # 1.0f

    .line 190
    .line 191
    const/4 v13, 0x0

    .line 192
    const/4 v14, 0x0

    .line 193
    const/4 v15, 0x0

    .line 194
    const-string v4, ""

    .line 195
    .line 196
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 197
    .line 198
    .line 199
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 200
    .line 201
    .line 202
    move-result v3

    .line 203
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 204
    .line 205
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 206
    .line 207
    .line 208
    move-result-wide v6

    .line 209
    const/4 v0, 0x0

    .line 210
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 211
    .line 212
    .line 213
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 214
    .line 215
    .line 216
    move-result v10

    .line 217
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 218
    .line 219
    .line 220
    move-result v11

    .line 221
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 222
    .line 223
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 224
    .line 225
    .line 226
    const v0, 0x40d1999a    # 6.55f

    .line 227
    .line 228
    .line 229
    const v2, 0x4178f5c3    # 15.56f

    .line 230
    .line 231
    .line 232
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 233
    .line 234
    .line 235
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 236
    .line 237
    .line 238
    const/high16 v17, 0x41400000    # 12.0f

    .line 239
    .line 240
    const v18, 0x40a9999a    # 5.3f

    .line 241
    .line 242
    .line 243
    const v13, 0x4166147b    # 14.38f

    .line 244
    .line 245
    .line 246
    const v14, 0x410051ec    # 8.02f

    .line 247
    .line 248
    .line 249
    const/high16 v15, 0x41400000    # 12.0f

    .line 250
    .line 251
    const v16, 0x40e6147b    # 7.19f

    .line 252
    .line 253
    .line 254
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 255
    .line 256
    .line 257
    const v0, 0x407147ae    # 3.77f

    .line 258
    .line 259
    .line 260
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 261
    .line 262
    .line 263
    const v17, -0x4039999a    # -1.55f

    .line 264
    .line 265
    .line 266
    const v18, -0x40a8f5c3    # -0.84f

    .line 267
    .line 268
    .line 269
    const/4 v13, 0x0

    .line 270
    const v14, -0x40b33333    # -0.8f

    .line 271
    .line 272
    .line 273
    const v15, -0x409c28f6    # -0.89f

    .line 274
    .line 275
    .line 276
    const v16, -0x405c28f6    # -1.28f

    .line 277
    .line 278
    .line 279
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 280
    .line 281
    .line 282
    const/high16 v17, 0x40800000    # 4.0f

    .line 283
    .line 284
    const/high16 v18, 0x41500000    # 13.0f

    .line 285
    .line 286
    const v13, 0x4101eb85    # 8.12f

    .line 287
    .line 288
    .line 289
    const v14, 0x408fae14    # 4.49f

    .line 290
    .line 291
    .line 292
    const/high16 v15, 0x40800000    # 4.0f

    .line 293
    .line 294
    const v16, 0x40ff0a3d    # 7.97f

    .line 295
    .line 296
    .line 297
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 298
    .line 299
    .line 300
    const v17, 0x4078f5c3    # 3.89f

    .line 301
    .line 302
    .line 303
    const v18, 0x40db851f    # 6.86f

    .line 304
    .line 305
    .line 306
    const/4 v13, 0x0

    .line 307
    const v14, 0x403ae148    # 2.92f

    .line 308
    .line 309
    .line 310
    const v15, 0x3fc7ae14    # 1.56f

    .line 311
    .line 312
    .line 313
    const v16, 0x40af0a3d    # 5.47f

    .line 314
    .line 315
    .line 316
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 317
    .line 318
    .line 319
    const v17, -0x40b0a3d7    # -0.81f

    .line 320
    .line 321
    .line 322
    const v18, -0x3f947ae1    # -3.68f

    .line 323
    .line 324
    .line 325
    const v13, -0x40ca3d71    # -0.71f

    .line 326
    .line 327
    .line 328
    const v14, -0x407d70a4    # -1.02f

    .line 329
    .line 330
    .line 331
    const v15, -0x407851ec    # -1.06f

    .line 332
    .line 333
    .line 334
    const v16, -0x3fec28f6    # -2.31f

    .line 335
    .line 336
    .line 337
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 338
    .line 339
    .line 340
    const v17, 0x3fc147ae    # 1.51f

    .line 341
    .line 342
    .line 343
    const v18, -0x3fd1eb85    # -2.72f

    .line 344
    .line 345
    .line 346
    const v13, 0x3e428f5c    # 0.19f

    .line 347
    .line 348
    .line 349
    const v14, -0x407ae148    # -1.04f

    .line 350
    .line 351
    .line 352
    const/high16 v15, 0x3f400000    # 0.75f

    .line 353
    .line 354
    const v16, -0x40028f5c    # -1.98f

    .line 355
    .line 356
    .line 357
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 358
    .line 359
    .line 360
    const v0, 0x402d70a4    # 2.71f

    .line 361
    .line 362
    .line 363
    const v2, -0x3fd51eb8    # -2.67f

    .line 364
    .line 365
    .line 366
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 367
    .line 368
    .line 369
    const v17, 0x3fb33333    # 1.4f

    .line 370
    .line 371
    .line 372
    const/16 v18, 0x0

    .line 373
    .line 374
    const v13, 0x3ec7ae14    # 0.39f

    .line 375
    .line 376
    .line 377
    const v14, -0x413d70a4    # -0.38f

    .line 378
    .line 379
    .line 380
    const v15, 0x3f8147ae    # 1.01f

    .line 381
    .line 382
    .line 383
    const v16, -0x413d70a4    # -0.38f

    .line 384
    .line 385
    .line 386
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 387
    .line 388
    .line 389
    const v0, 0x402eb852    # 2.73f

    .line 390
    .line 391
    .line 392
    const v2, 0x402c28f6    # 2.69f

    .line 393
    .line 394
    .line 395
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 396
    .line 397
    .line 398
    const v17, 0x3fbd70a4    # 1.48f

    .line 399
    .line 400
    .line 401
    const v18, 0x402b851f    # 2.68f

    .line 402
    .line 403
    .line 404
    const v13, 0x3f3d70a4    # 0.74f

    .line 405
    .line 406
    .line 407
    const v14, 0x3f3ae148    # 0.73f

    .line 408
    .line 409
    .line 410
    const v15, 0x3fa66666    # 1.3f

    .line 411
    .line 412
    .line 413
    const v16, 0x3fd33333    # 1.65f

    .line 414
    .line 415
    .line 416
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 417
    .line 418
    .line 419
    const v17, -0x40bae148    # -0.77f

    .line 420
    .line 421
    .line 422
    const v18, 0x406a3d71    # 3.66f

    .line 423
    .line 424
    .line 425
    const/high16 v13, 0x3e800000    # 0.25f

    .line 426
    .line 427
    const v14, 0x3fae147b    # 1.36f

    .line 428
    .line 429
    .line 430
    const v15, -0x4270a3d7    # -0.07f

    .line 431
    .line 432
    .line 433
    const v16, 0x4028f5c3    # 2.64f

    .line 434
    .line 435
    .line 436
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 437
    .line 438
    .line 439
    const v17, 0x406d70a4    # 3.71f

    .line 440
    .line 441
    .line 442
    const v18, -0x3f566666    # -5.3f

    .line 443
    .line 444
    .line 445
    const v13, 0x3ff1eb85    # 1.89f

    .line 446
    .line 447
    .line 448
    const v14, -0x406ccccd    # -1.15f

    .line 449
    .line 450
    .line 451
    const v15, 0x40528f5c    # 3.29f

    .line 452
    .line 453
    .line 454
    const v16, -0x3fbc28f6    # -3.06f

    .line 455
    .line 456
    .line 457
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 458
    .line 459
    .line 460
    const v17, -0x3fb1eb85    # -3.22f

    .line 461
    .line 462
    .line 463
    const v18, -0x3efe6666    # -8.1f

    .line 464
    .line 465
    .line 466
    const v13, 0x3f1c28f6    # 0.61f

    .line 467
    .line 468
    .line 469
    const v14, -0x3faeb852    # -3.27f

    .line 470
    .line 471
    .line 472
    const v15, -0x40b0a3d7    # -0.81f

    .line 473
    .line 474
    .line 475
    const v16, -0x3f3428f6    # -6.37f

    .line 476
    .line 477
    .line 478
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 479
    .line 480
    .line 481
    const v17, 0x4178f5c3    # 15.56f

    .line 482
    .line 483
    .line 484
    const v18, 0x40d1999a    # 6.55f

    .line 485
    .line 486
    .line 487
    const v13, 0x41826666    # 16.3f

    .line 488
    .line 489
    .line 490
    const v14, 0x40c570a4    # 6.17f

    .line 491
    .line 492
    .line 493
    const v15, 0x417d47ae    # 15.83f

    .line 494
    .line 495
    .line 496
    const v16, 0x40c70a3d    # 6.22f

    .line 497
    .line 498
    .line 499
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 500
    .line 501
    .line 502
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 503
    .line 504
    .line 505
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 506
    .line 507
    .line 508
    move-result-object v2

    .line 509
    const/16 v16, 0x3800

    .line 510
    .line 511
    const/16 v17, 0x0

    .line 512
    .line 513
    const/high16 v6, 0x3f800000    # 1.0f

    .line 514
    .line 515
    const/4 v7, 0x0

    .line 516
    const/high16 v12, 0x3f800000    # 1.0f

    .line 517
    .line 518
    const/4 v13, 0x0

    .line 519
    const/4 v14, 0x0

    .line 520
    const/4 v15, 0x0

    .line 521
    const-string v4, ""

    .line 522
    .line 523
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 524
    .line 525
    .line 526
    move-result-object v0

    .line 527
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 528
    .line 529
    .line 530
    move-result-object v0

    .line 531
    sput-object v0, Landroidx/compose/material/icons/rounded/LocalFireDepartmentKt;->_localFireDepartment:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 532
    .line 533
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 534
    .line 535
    .line 536
    return-object v0
.end method
