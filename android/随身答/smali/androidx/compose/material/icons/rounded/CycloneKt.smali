.class public final Landroidx/compose/material/icons/rounded/CycloneKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_cyclone",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "Cyclone",
        "Landroidx/compose/material/icons/Icons$Rounded;",
        "getCyclone",
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
        "SMAP\nCyclone.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Cyclone.kt\nandroidx/compose/material/icons/rounded/CycloneKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,83:1\n212#2,12:84\n233#2,18:97\n253#2:134\n233#2,18:135\n253#2:172\n174#3:96\n705#4,2:115\n717#4,2:117\n719#4,11:123\n705#4,2:153\n717#4,2:155\n719#4,11:161\n72#5,4:119\n72#5,4:157\n*S KotlinDebug\n*F\n+ 1 Cyclone.kt\nandroidx/compose/material/icons/rounded/CycloneKt\n*L\n29#1:84,12\n30#1:97,18\n30#1:134\n44#1:135,18\n44#1:172\n29#1:96\n30#1:115,2\n30#1:117,2\n30#1:123,11\n44#1:153,2\n44#1:155,2\n44#1:161,11\n30#1:119,4\n44#1:157,4\n*E\n"
    }
.end annotation


# static fields
.field private static _cyclone:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getCyclone(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/CycloneKt;->_cyclone:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.Cyclone"

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
    const/high16 v4, 0x41000000    # 8.0f

    .line 71
    .line 72
    const/high16 v6, 0x41400000    # 12.0f

    .line 73
    .line 74
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v25, -0x3f800000    # -4.0f

    .line 78
    .line 79
    const/high16 v26, 0x40800000    # 4.0f

    .line 80
    .line 81
    const v21, -0x3ff28f5c    # -2.21f

    .line 82
    .line 83
    .line 84
    const/16 v22, 0x0

    .line 85
    .line 86
    const/high16 v23, -0x3f800000    # -4.0f

    .line 87
    .line 88
    const v24, 0x3fe51eb8    # 1.79f

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
    const/high16 v25, 0x40800000    # 4.0f

    .line 97
    .line 98
    const/16 v21, 0x0

    .line 99
    .line 100
    const v22, 0x400d70a4    # 2.21f

    .line 101
    .line 102
    .line 103
    const v23, 0x3fe51eb8    # 1.79f

    .line 104
    .line 105
    .line 106
    const/high16 v24, 0x40800000    # 4.0f

    .line 107
    .line 108
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 109
    .line 110
    .line 111
    const/high16 v26, -0x3f800000    # -4.0f

    .line 112
    .line 113
    const v21, 0x400d70a4    # 2.21f

    .line 114
    .line 115
    .line 116
    const/16 v22, 0x0

    .line 117
    .line 118
    const/high16 v23, 0x40800000    # 4.0f

    .line 119
    .line 120
    const v24, -0x401ae148    # -1.79f

    .line 121
    .line 122
    .line 123
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 124
    .line 125
    .line 126
    const/high16 v25, 0x41400000    # 12.0f

    .line 127
    .line 128
    const/high16 v26, 0x41000000    # 8.0f

    .line 129
    .line 130
    const/high16 v21, 0x41800000    # 16.0f

    .line 131
    .line 132
    const v22, 0x411ca3d7    # 9.79f

    .line 133
    .line 134
    .line 135
    const v23, 0x41635c29    # 14.21f

    .line 136
    .line 137
    .line 138
    const/high16 v24, 0x41000000    # 8.0f

    .line 139
    .line 140
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 141
    .line 142
    .line 143
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 144
    .line 145
    .line 146
    const/high16 v4, 0x41600000    # 14.0f

    .line 147
    .line 148
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 149
    .line 150
    .line 151
    const/high16 v25, -0x40000000    # -2.0f

    .line 152
    .line 153
    const/high16 v26, -0x40000000    # -2.0f

    .line 154
    .line 155
    const v21, -0x40733333    # -1.1f

    .line 156
    .line 157
    .line 158
    const/16 v22, 0x0

    .line 159
    .line 160
    const/high16 v23, -0x40000000    # -2.0f

    .line 161
    .line 162
    const v24, -0x4099999a    # -0.9f

    .line 163
    .line 164
    .line 165
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 166
    .line 167
    .line 168
    const/high16 v25, 0x40000000    # 2.0f

    .line 169
    .line 170
    const/16 v21, 0x0

    .line 171
    .line 172
    const v22, -0x40733333    # -1.1f

    .line 173
    .line 174
    .line 175
    const v23, 0x3f666666    # 0.9f

    .line 176
    .line 177
    .line 178
    const/high16 v24, -0x40000000    # -2.0f

    .line 179
    .line 180
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 181
    .line 182
    .line 183
    const v4, 0x3f666666    # 0.9f

    .line 184
    .line 185
    .line 186
    const/high16 v6, 0x40000000    # 2.0f

    .line 187
    .line 188
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 189
    .line 190
    .line 191
    const/high16 v25, 0x41400000    # 12.0f

    .line 192
    .line 193
    const/high16 v26, 0x41600000    # 14.0f

    .line 194
    .line 195
    const/high16 v21, 0x41600000    # 14.0f

    .line 196
    .line 197
    const v22, 0x4151999a    # 13.1f

    .line 198
    .line 199
    .line 200
    const v23, 0x4151999a    # 13.1f

    .line 201
    .line 202
    .line 203
    const/high16 v24, 0x41600000    # 14.0f

    .line 204
    .line 205
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 206
    .line 207
    .line 208
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 209
    .line 210
    .line 211
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 212
    .line 213
    .line 214
    move-result-object v2

    .line 215
    const/16 v16, 0x3800

    .line 216
    .line 217
    const/16 v17, 0x0

    .line 218
    .line 219
    const/high16 v6, 0x3f800000    # 1.0f

    .line 220
    .line 221
    const/high16 v8, 0x3f800000    # 1.0f

    .line 222
    .line 223
    const/4 v7, 0x0

    .line 224
    const/high16 v9, 0x3f800000    # 1.0f

    .line 225
    .line 226
    const/high16 v12, 0x3f800000    # 1.0f

    .line 227
    .line 228
    const/4 v13, 0x0

    .line 229
    const/4 v14, 0x0

    .line 230
    const/4 v15, 0x0

    .line 231
    const-string v4, ""

    .line 232
    .line 233
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 234
    .line 235
    .line 236
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 237
    .line 238
    .line 239
    move-result v3

    .line 240
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 241
    .line 242
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 243
    .line 244
    .line 245
    move-result-wide v6

    .line 246
    const/4 v0, 0x0

    .line 247
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 248
    .line 249
    .line 250
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 251
    .line 252
    .line 253
    move-result v10

    .line 254
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 255
    .line 256
    .line 257
    move-result v11

    .line 258
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 259
    .line 260
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 261
    .line 262
    .line 263
    const v0, 0x40c3851f    # 6.11f

    .line 264
    .line 265
    .line 266
    const/high16 v2, 0x41b00000    # 22.0f

    .line 267
    .line 268
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 269
    .line 270
    .line 271
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 272
    .line 273
    .line 274
    const v17, -0x40c28f5c    # -0.74f

    .line 275
    .line 276
    .line 277
    const v18, -0x4087ae14    # -0.97f

    .line 278
    .line 279
    .line 280
    const v14, -0x41147ae1    # -0.46f

    .line 281
    .line 282
    .line 283
    const v15, -0x41666666    # -0.3f

    .line 284
    .line 285
    .line 286
    const v16, -0x40a3d70a    # -0.86f

    .line 287
    .line 288
    .line 289
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 290
    .line 291
    .line 292
    const/high16 v17, 0x41400000    # 12.0f

    .line 293
    .line 294
    const/high16 v18, 0x40800000    # 4.0f

    .line 295
    .line 296
    const v13, 0x4199d70a    # 19.23f

    .line 297
    .line 298
    .line 299
    const v14, 0x40933333    # 4.6f

    .line 300
    .line 301
    .line 302
    const v15, 0x41803d71    # 16.03f

    .line 303
    .line 304
    .line 305
    const/high16 v16, 0x40800000    # 4.0f

    .line 306
    .line 307
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 308
    .line 309
    .line 310
    const v17, 0x40ceb852    # 6.46f

    .line 311
    .line 312
    .line 313
    const v18, 0x40c7ae14    # 6.24f

    .line 314
    .line 315
    .line 316
    const v13, 0x411d999a    # 9.85f

    .line 317
    .line 318
    .line 319
    const/high16 v14, 0x40800000    # 4.0f

    .line 320
    .line 321
    const v15, 0x40fc7ae1    # 7.89f

    .line 322
    .line 323
    .line 324
    const v16, 0x409b851f    # 4.86f

    .line 325
    .line 326
    .line 327
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 328
    .line 329
    .line 330
    const v17, 0x3f1eb852    # 0.62f

    .line 331
    .line 332
    .line 333
    const v18, -0x3fc28f5c    # -2.96f

    .line 334
    .line 335
    .line 336
    const v13, 0x3dcccccd    # 0.1f

    .line 337
    .line 338
    .line 339
    const v14, -0x40d9999a    # -0.65f

    .line 340
    .line 341
    .line 342
    const v15, 0x3e8f5c29    # 0.28f

    .line 343
    .line 344
    .line 345
    const v16, -0x4027ae14    # -1.69f

    .line 346
    .line 347
    .line 348
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 349
    .line 350
    .line 351
    const v17, 0x40c3851f    # 6.11f

    .line 352
    .line 353
    .line 354
    const/high16 v18, 0x40000000    # 2.0f

    .line 355
    .line 356
    const/high16 v13, 0x40e80000    # 7.25f

    .line 357
    .line 358
    const v14, 0x4028f5c3    # 2.64f

    .line 359
    .line 360
    .line 361
    const v15, 0x40d8f5c3    # 6.78f

    .line 362
    .line 363
    .line 364
    const/high16 v16, 0x40000000    # 2.0f

    .line 365
    .line 366
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 367
    .line 368
    .line 369
    const/4 v0, 0x0

    .line 370
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 371
    .line 372
    .line 373
    const v17, 0x40a47ae1    # 5.14f

    .line 374
    .line 375
    .line 376
    const v18, 0x402f5c29    # 2.74f

    .line 377
    .line 378
    .line 379
    const v13, 0x40b51eb8    # 5.66f

    .line 380
    .line 381
    .line 382
    const/high16 v14, 0x40000000    # 2.0f

    .line 383
    .line 384
    const v15, 0x40a851ec    # 5.26f

    .line 385
    .line 386
    .line 387
    const v16, 0x40133333    # 2.3f

    .line 388
    .line 389
    .line 390
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 391
    .line 392
    .line 393
    const/high16 v17, 0x40800000    # 4.0f

    .line 394
    .line 395
    const/high16 v18, 0x41400000    # 12.0f

    .line 396
    .line 397
    const v13, 0x40933333    # 4.6f

    .line 398
    .line 399
    .line 400
    const v14, 0x4098a3d7    # 4.77f

    .line 401
    .line 402
    .line 403
    const/high16 v15, 0x40800000    # 4.0f

    .line 404
    .line 405
    const v16, 0x40ff0a3d    # 7.97f

    .line 406
    .line 407
    .line 408
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 409
    .line 410
    .line 411
    const v17, 0x400f5c29    # 2.24f

    .line 412
    .line 413
    .line 414
    const v18, 0x40b147ae    # 5.54f

    .line 415
    .line 416
    .line 417
    const/4 v13, 0x0

    .line 418
    const v14, 0x4009999a    # 2.15f

    .line 419
    .line 420
    .line 421
    const v15, 0x3f5c28f6    # 0.86f

    .line 422
    .line 423
    .line 424
    const v16, 0x4083851f    # 4.11f

    .line 425
    .line 426
    .line 427
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 428
    .line 429
    .line 430
    const v17, -0x3fc28f5c    # -2.96f

    .line 431
    .line 432
    .line 433
    const v18, -0x40e147ae    # -0.62f

    .line 434
    .line 435
    .line 436
    const v13, -0x40d9999a    # -0.65f

    .line 437
    .line 438
    .line 439
    const v14, -0x42333333    # -0.1f

    .line 440
    .line 441
    .line 442
    const v15, -0x4027ae14    # -1.69f

    .line 443
    .line 444
    .line 445
    const v16, -0x4170a3d7    # -0.28f

    .line 446
    .line 447
    .line 448
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 449
    .line 450
    .line 451
    const/high16 v17, 0x40000000    # 2.0f

    .line 452
    .line 453
    const v18, 0x418f1eb8    # 17.89f

    .line 454
    .line 455
    .line 456
    const v13, 0x4028f5c3    # 2.64f

    .line 457
    .line 458
    .line 459
    const/high16 v14, 0x41860000    # 16.75f

    .line 460
    .line 461
    const/high16 v15, 0x40000000    # 2.0f

    .line 462
    .line 463
    const v16, 0x4189c28f    # 17.22f

    .line 464
    .line 465
    .line 466
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 467
    .line 468
    .line 469
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 470
    .line 471
    .line 472
    const v17, 0x3f3d70a4    # 0.74f

    .line 473
    .line 474
    .line 475
    const v18, 0x3f7851ec    # 0.97f

    .line 476
    .line 477
    .line 478
    const/4 v13, 0x0

    .line 479
    const v14, 0x3eeb851f    # 0.46f

    .line 480
    .line 481
    .line 482
    const v15, 0x3e99999a    # 0.3f

    .line 483
    .line 484
    .line 485
    const v16, 0x3f5c28f6    # 0.86f

    .line 486
    .line 487
    .line 488
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 489
    .line 490
    .line 491
    const/high16 v17, 0x41400000    # 12.0f

    .line 492
    .line 493
    const/high16 v18, 0x41a00000    # 20.0f

    .line 494
    .line 495
    const v13, 0x4098a3d7    # 4.77f

    .line 496
    .line 497
    .line 498
    const v14, 0x419b3333    # 19.4f

    .line 499
    .line 500
    .line 501
    const v15, 0x40ff0a3d    # 7.97f

    .line 502
    .line 503
    .line 504
    const/high16 v16, 0x41a00000    # 20.0f

    .line 505
    .line 506
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 507
    .line 508
    .line 509
    const v17, 0x40b147ae    # 5.54f

    .line 510
    .line 511
    .line 512
    const v18, -0x3ff0a3d7    # -2.24f

    .line 513
    .line 514
    .line 515
    const v13, 0x4009999a    # 2.15f

    .line 516
    .line 517
    .line 518
    const/4 v14, 0x0

    .line 519
    const v15, 0x4083851f    # 4.11f

    .line 520
    .line 521
    .line 522
    const v16, -0x40a3d70a    # -0.86f

    .line 523
    .line 524
    .line 525
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 526
    .line 527
    .line 528
    const v17, -0x40e147ae    # -0.62f

    .line 529
    .line 530
    .line 531
    const v18, 0x403d70a4    # 2.96f

    .line 532
    .line 533
    .line 534
    const v13, -0x42333333    # -0.1f

    .line 535
    .line 536
    .line 537
    const v14, 0x3f266666    # 0.65f

    .line 538
    .line 539
    .line 540
    const v15, -0x4170a3d7    # -0.28f

    .line 541
    .line 542
    .line 543
    const v16, 0x3fd851ec    # 1.69f

    .line 544
    .line 545
    .line 546
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 547
    .line 548
    .line 549
    const v17, 0x3f7851ec    # 0.97f

    .line 550
    .line 551
    .line 552
    const v18, 0x3fa3d70a    # 1.28f

    .line 553
    .line 554
    .line 555
    const v13, -0x41d1eb85    # -0.17f

    .line 556
    .line 557
    .line 558
    const v14, 0x3f23d70a    # 0.64f

    .line 559
    .line 560
    .line 561
    const v15, 0x3e99999a    # 0.3f

    .line 562
    .line 563
    .line 564
    const v16, 0x3fa3d70a    # 1.28f

    .line 565
    .line 566
    .line 567
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 568
    .line 569
    .line 570
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 571
    .line 572
    .line 573
    const v18, -0x40c28f5c    # -0.74f

    .line 574
    .line 575
    .line 576
    const v13, 0x3eeb851f    # 0.46f

    .line 577
    .line 578
    .line 579
    const/4 v14, 0x0

    .line 580
    const v15, 0x3f5c28f6    # 0.86f

    .line 581
    .line 582
    .line 583
    const v16, -0x41666666    # -0.3f

    .line 584
    .line 585
    .line 586
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 587
    .line 588
    .line 589
    const/high16 v17, 0x41a00000    # 20.0f

    .line 590
    .line 591
    const/high16 v18, 0x41400000    # 12.0f

    .line 592
    .line 593
    const v13, 0x419b3333    # 19.4f

    .line 594
    .line 595
    .line 596
    const v14, 0x4199d70a    # 19.23f

    .line 597
    .line 598
    .line 599
    const/high16 v15, 0x41a00000    # 20.0f

    .line 600
    .line 601
    const v16, 0x41803d71    # 16.03f

    .line 602
    .line 603
    .line 604
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 605
    .line 606
    .line 607
    const v17, -0x3ff0a3d7    # -2.24f

    .line 608
    .line 609
    .line 610
    const v18, -0x3f4eb852    # -5.54f

    .line 611
    .line 612
    .line 613
    const/4 v13, 0x0

    .line 614
    const v14, -0x3ff66666    # -2.15f

    .line 615
    .line 616
    .line 617
    const v15, -0x40a3d70a    # -0.86f

    .line 618
    .line 619
    .line 620
    const v16, -0x3f7c7ae1    # -4.11f

    .line 621
    .line 622
    .line 623
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 624
    .line 625
    .line 626
    const v17, 0x403d70a4    # 2.96f

    .line 627
    .line 628
    .line 629
    const v18, 0x3f1eb852    # 0.62f

    .line 630
    .line 631
    .line 632
    const v13, 0x3f266666    # 0.65f

    .line 633
    .line 634
    .line 635
    const v14, 0x3dcccccd    # 0.1f

    .line 636
    .line 637
    .line 638
    const v15, 0x3fd851ec    # 1.69f

    .line 639
    .line 640
    .line 641
    const v16, 0x3e8f5c29    # 0.28f

    .line 642
    .line 643
    .line 644
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 645
    .line 646
    .line 647
    const/high16 v17, 0x41b00000    # 22.0f

    .line 648
    .line 649
    const v18, 0x40c3851f    # 6.11f

    .line 650
    .line 651
    .line 652
    const v13, 0x41aae148    # 21.36f

    .line 653
    .line 654
    .line 655
    const/high16 v14, 0x40e80000    # 7.25f

    .line 656
    .line 657
    const/high16 v15, 0x41b00000    # 22.0f

    .line 658
    .line 659
    const v16, 0x40d8f5c3    # 6.78f

    .line 660
    .line 661
    .line 662
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 663
    .line 664
    .line 665
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 666
    .line 667
    .line 668
    const/high16 v0, 0x41900000    # 18.0f

    .line 669
    .line 670
    const/high16 v2, 0x41400000    # 12.0f

    .line 671
    .line 672
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 673
    .line 674
    .line 675
    const/high16 v17, -0x3f400000    # -6.0f

    .line 676
    .line 677
    const/high16 v18, -0x3f400000    # -6.0f

    .line 678
    .line 679
    const v13, -0x3fac28f6    # -3.31f

    .line 680
    .line 681
    .line 682
    const/4 v14, 0x0

    .line 683
    const/high16 v15, -0x3f400000    # -6.0f

    .line 684
    .line 685
    const v16, -0x3fd3d70a    # -2.69f

    .line 686
    .line 687
    .line 688
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 689
    .line 690
    .line 691
    const/high16 v0, -0x3f400000    # -6.0f

    .line 692
    .line 693
    const v2, 0x402c28f6    # 2.69f

    .line 694
    .line 695
    .line 696
    const/high16 v4, 0x40c00000    # 6.0f

    .line 697
    .line 698
    invoke-virtual {v12, v2, v0, v4, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 699
    .line 700
    .line 701
    const v0, 0x402c28f6    # 2.69f

    .line 702
    .line 703
    .line 704
    const/high16 v2, 0x40c00000    # 6.0f

    .line 705
    .line 706
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 707
    .line 708
    .line 709
    const v0, 0x4174f5c3    # 15.31f

    .line 710
    .line 711
    .line 712
    const/high16 v2, 0x41900000    # 18.0f

    .line 713
    .line 714
    const/high16 v4, 0x41400000    # 12.0f

    .line 715
    .line 716
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 717
    .line 718
    .line 719
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 720
    .line 721
    .line 722
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 723
    .line 724
    .line 725
    move-result-object v2

    .line 726
    const/16 v16, 0x3800

    .line 727
    .line 728
    const/16 v17, 0x0

    .line 729
    .line 730
    const/high16 v6, 0x3f800000    # 1.0f

    .line 731
    .line 732
    const/4 v7, 0x0

    .line 733
    const/high16 v12, 0x3f800000    # 1.0f

    .line 734
    .line 735
    const/4 v13, 0x0

    .line 736
    const/4 v15, 0x0

    .line 737
    const-string v4, ""

    .line 738
    .line 739
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 740
    .line 741
    .line 742
    move-result-object v0

    .line 743
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 744
    .line 745
    .line 746
    move-result-object v0

    .line 747
    sput-object v0, Landroidx/compose/material/icons/rounded/CycloneKt;->_cyclone:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 748
    .line 749
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 750
    .line 751
    .line 752
    return-object v0
.end method
