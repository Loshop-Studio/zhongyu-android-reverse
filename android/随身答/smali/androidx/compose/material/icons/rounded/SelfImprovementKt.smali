.class public final Landroidx/compose/material/icons/rounded/SelfImprovementKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_selfImprovement",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "SelfImprovement",
        "Landroidx/compose/material/icons/Icons$Rounded;",
        "getSelfImprovement",
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
        "SMAP\nSelfImprovement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelfImprovement.kt\nandroidx/compose/material/icons/rounded/SelfImprovementKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,78:1\n212#2,12:79\n233#2,18:92\n253#2:129\n233#2,18:130\n253#2:167\n174#3:91\n705#4,2:110\n717#4,2:112\n719#4,11:118\n705#4,2:148\n717#4,2:150\n719#4,11:156\n72#5,4:114\n72#5,4:152\n*S KotlinDebug\n*F\n+ 1 SelfImprovement.kt\nandroidx/compose/material/icons/rounded/SelfImprovementKt\n*L\n29#1:79,12\n30#1:92,18\n30#1:129\n36#1:130,18\n36#1:167\n29#1:91\n30#1:110,2\n30#1:112,2\n30#1:118,11\n36#1:148,2\n36#1:150,2\n36#1:156,11\n30#1:114,4\n36#1:152,4\n*E\n"
    }
.end annotation


# static fields
.field private static _selfImprovement:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getSelfImprovement(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 28

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/SelfImprovementKt;->_selfImprovement:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.SelfImprovement"

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
    const/high16 v6, 0x40c00000    # 6.0f

    .line 73
    .line 74
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v4, -0x40000000    # -2.0f

    .line 78
    .line 79
    const/4 v6, 0x0

    .line 80
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 81
    .line 82
    .line 83
    const/high16 v26, 0x40800000    # 4.0f

    .line 84
    .line 85
    const/16 v27, 0x0

    .line 86
    .line 87
    const/high16 v21, 0x40000000    # 2.0f

    .line 88
    .line 89
    const/high16 v22, 0x40000000    # 2.0f

    .line 90
    .line 91
    const/16 v23, 0x0

    .line 92
    .line 93
    const/16 v24, 0x1

    .line 94
    .line 95
    const/16 v25, 0x1

    .line 96
    .line 97
    move-object/from16 v20, v2

    .line 98
    .line 99
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 100
    .line 101
    .line 102
    const/high16 v26, -0x3f800000    # -4.0f

    .line 103
    .line 104
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 105
    .line 106
    .line 107
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 108
    .line 109
    .line 110
    move-result-object v2

    .line 111
    const/16 v16, 0x3800

    .line 112
    .line 113
    const/16 v17, 0x0

    .line 114
    .line 115
    const/high16 v6, 0x3f800000    # 1.0f

    .line 116
    .line 117
    const/high16 v8, 0x3f800000    # 1.0f

    .line 118
    .line 119
    const/4 v7, 0x0

    .line 120
    const/high16 v9, 0x3f800000    # 1.0f

    .line 121
    .line 122
    const/high16 v12, 0x3f800000    # 1.0f

    .line 123
    .line 124
    const/4 v13, 0x0

    .line 125
    const/4 v14, 0x0

    .line 126
    const/4 v15, 0x0

    .line 127
    const-string v4, ""

    .line 128
    .line 129
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 130
    .line 131
    .line 132
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 133
    .line 134
    .line 135
    move-result v3

    .line 136
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 137
    .line 138
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 139
    .line 140
    .line 141
    move-result-wide v6

    .line 142
    const/4 v0, 0x0

    .line 143
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 144
    .line 145
    .line 146
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 147
    .line 148
    .line 149
    move-result v10

    .line 150
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 151
    .line 152
    .line 153
    move-result v11

    .line 154
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 155
    .line 156
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 157
    .line 158
    .line 159
    const v0, 0x416f0a3d    # 14.94f

    .line 160
    .line 161
    .line 162
    const/high16 v2, 0x41a80000    # 21.0f

    .line 163
    .line 164
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 165
    .line 166
    .line 167
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 168
    .line 169
    .line 170
    const v17, -0x40a66666    # -0.85f

    .line 171
    .line 172
    .line 173
    const v18, -0x40851eb8    # -0.98f

    .line 174
    .line 175
    .line 176
    const/high16 v14, -0x41000000    # -0.5f

    .line 177
    .line 178
    const v15, -0x4147ae14    # -0.36f

    .line 179
    .line 180
    .line 181
    const v16, -0x4091eb85    # -0.93f

    .line 182
    .line 183
    .line 184
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 185
    .line 186
    .line 187
    const/high16 v17, -0x3f680000    # -4.75f

    .line 188
    .line 189
    const v18, -0x3fd7ae14    # -2.63f

    .line 190
    .line 191
    .line 192
    const v13, -0x400f5c29    # -1.88f

    .line 193
    .line 194
    .line 195
    const v14, -0x41a8f5c3    # -0.21f

    .line 196
    .line 197
    .line 198
    const v15, -0x3fa0a3d7    # -3.49f

    .line 199
    .line 200
    .line 201
    const v16, -0x406f5c29    # -1.13f

    .line 202
    .line 203
    .line 204
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 205
    .line 206
    .line 207
    const v0, -0x40333333    # -1.6f

    .line 208
    .line 209
    .line 210
    const v2, -0x40547ae1    # -1.34f

    .line 211
    .line 212
    .line 213
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 214
    .line 215
    .line 216
    const v17, 0x41487ae1    # 12.53f

    .line 217
    .line 218
    .line 219
    const/high16 v18, 0x41100000    # 9.0f

    .line 220
    .line 221
    const v13, 0x415ae148    # 13.68f

    .line 222
    .line 223
    .line 224
    const v14, 0x411428f6    # 9.26f

    .line 225
    .line 226
    .line 227
    const v15, 0x4151eb85    # 13.12f

    .line 228
    .line 229
    .line 230
    const/high16 v16, 0x41100000    # 9.0f

    .line 231
    .line 232
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 233
    .line 234
    .line 235
    const v0, -0x4079999a    # -1.05f

    .line 236
    .line 237
    .line 238
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 239
    .line 240
    .line 241
    const v17, -0x403c28f6    # -1.53f

    .line 242
    .line 243
    .line 244
    const v18, 0x3f3851ec    # 0.72f

    .line 245
    .line 246
    .line 247
    const v13, -0x40e8f5c3    # -0.59f

    .line 248
    .line 249
    .line 250
    const/4 v14, 0x0

    .line 251
    const v15, -0x406ccccd    # -1.15f

    .line 252
    .line 253
    .line 254
    const v16, 0x3e851eb8    # 0.26f

    .line 255
    .line 256
    .line 257
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 258
    .line 259
    .line 260
    const v0, 0x3fcccccd    # 1.6f

    .line 261
    .line 262
    .line 263
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 264
    .line 265
    .line 266
    const/high16 v17, -0x3f680000    # -4.75f

    .line 267
    .line 268
    const v18, 0x402851ec    # 2.63f

    .line 269
    .line 270
    .line 271
    const/high16 v13, -0x40600000    # -1.25f

    .line 272
    .line 273
    const/high16 v14, 0x3fc00000    # 1.5f

    .line 274
    .line 275
    const v15, -0x3fc851ec    # -2.87f

    .line 276
    .line 277
    .line 278
    const v16, 0x401ae148    # 2.42f

    .line 279
    .line 280
    .line 281
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 282
    .line 283
    .line 284
    const/high16 v17, 0x40400000    # 3.0f

    .line 285
    .line 286
    const v18, 0x416f0a3d    # 14.94f

    .line 287
    .line 288
    .line 289
    const v13, 0x40570a3d    # 3.36f

    .line 290
    .line 291
    .line 292
    const v14, 0x416028f6    # 14.01f

    .line 293
    .line 294
    .line 295
    const/high16 v15, 0x40400000    # 3.0f

    .line 296
    .line 297
    const v16, 0x41670a3d    # 14.44f

    .line 298
    .line 299
    .line 300
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 301
    .line 302
    .line 303
    const/4 v0, 0x0

    .line 304
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 305
    .line 306
    .line 307
    const v17, 0x3f90a3d7    # 1.13f

    .line 308
    .line 309
    .line 310
    const/high16 v18, 0x3f800000    # 1.0f

    .line 311
    .line 312
    const/4 v13, 0x0

    .line 313
    const v14, 0x3f19999a    # 0.6f

    .line 314
    .line 315
    .line 316
    const v15, 0x3f07ae14    # 0.53f

    .line 317
    .line 318
    .line 319
    const v16, 0x3f88f5c3    # 1.07f

    .line 320
    .line 321
    .line 322
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 323
    .line 324
    .line 325
    const v17, 0x40bbd70a    # 5.87f

    .line 326
    .line 327
    .line 328
    const v18, -0x3fb3d70a    # -3.19f

    .line 329
    .line 330
    .line 331
    const v13, 0x40133333    # 2.3f

    .line 332
    .line 333
    .line 334
    const v14, -0x4175c28f    # -0.27f

    .line 335
    .line 336
    .line 337
    const v15, 0x408a3d71    # 4.32f

    .line 338
    .line 339
    .line 340
    const v16, -0x404e147b    # -1.39f

    .line 341
    .line 342
    .line 343
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 344
    .line 345
    .line 346
    const/high16 v0, 0x41700000    # 15.0f

    .line 347
    .line 348
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 349
    .line 350
    .line 351
    const v0, -0x3f8f5c29    # -3.76f

    .line 352
    .line 353
    .line 354
    const/high16 v2, 0x3fc00000    # 1.5f

    .line 355
    .line 356
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 357
    .line 358
    .line 359
    const v17, -0x40628f5c    # -1.23f

    .line 360
    .line 361
    .line 362
    const v18, 0x3fc3d70a    # 1.53f

    .line 363
    .line 364
    .line 365
    const v13, -0x40d9999a    # -0.65f

    .line 366
    .line 367
    .line 368
    const v14, 0x3e851eb8    # 0.26f

    .line 369
    .line 370
    .line 371
    const v15, -0x406b851f    # -1.16f

    .line 372
    .line 373
    .line 374
    const v16, 0x3f547ae1    # 0.83f

    .line 375
    .line 376
    .line 377
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 378
    .line 379
    .line 380
    const v17, 0x40d947ae    # 6.79f

    .line 381
    .line 382
    .line 383
    const/high16 v18, 0x41a00000    # 20.0f

    .line 384
    .line 385
    const v13, 0x409d1eb8    # 4.91f

    .line 386
    .line 387
    .line 388
    const v14, 0x4198cccd    # 19.1f

    .line 389
    .line 390
    .line 391
    const v15, 0x40b7ae14    # 5.74f

    .line 392
    .line 393
    .line 394
    const/high16 v16, 0x41a00000    # 20.0f

    .line 395
    .line 396
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 397
    .line 398
    .line 399
    const/high16 v0, 0x41100000    # 9.0f

    .line 400
    .line 401
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 402
    .line 403
    .line 404
    const/high16 v0, -0x41000000    # -0.5f

    .line 405
    .line 406
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 407
    .line 408
    .line 409
    const/high16 v17, 0x40200000    # 2.5f

    .line 410
    .line 411
    const/high16 v18, -0x3fe00000    # -2.5f

    .line 412
    .line 413
    const/4 v13, 0x0

    .line 414
    const v14, -0x404f5c29    # -1.38f

    .line 415
    .line 416
    .line 417
    const v15, 0x3f8f5c29    # 1.12f

    .line 418
    .line 419
    .line 420
    const/high16 v16, -0x3fe00000    # -2.5f

    .line 421
    .line 422
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 423
    .line 424
    .line 425
    const/high16 v0, 0x40400000    # 3.0f

    .line 426
    .line 427
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 428
    .line 429
    .line 430
    const/high16 v17, 0x3f000000    # 0.5f

    .line 431
    .line 432
    const/high16 v18, 0x3f000000    # 0.5f

    .line 433
    .line 434
    const v13, 0x3e8f5c29    # 0.28f

    .line 435
    .line 436
    .line 437
    const/4 v14, 0x0

    .line 438
    const/high16 v15, 0x3f000000    # 0.5f

    .line 439
    .line 440
    const v16, 0x3e6147ae    # 0.22f

    .line 441
    .line 442
    .line 443
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 444
    .line 445
    .line 446
    const v0, 0x416c7ae1    # 14.78f

    .line 447
    .line 448
    .line 449
    const/high16 v2, 0x41680000    # 14.5f

    .line 450
    .line 451
    const/high16 v4, 0x41900000    # 18.0f

    .line 452
    .line 453
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 454
    .line 455
    .line 456
    const/high16 v0, -0x3fc00000    # -3.0f

    .line 457
    .line 458
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 459
    .line 460
    .line 461
    const/high16 v17, -0x40400000    # -1.5f

    .line 462
    .line 463
    const/high16 v18, 0x3fc00000    # 1.5f

    .line 464
    .line 465
    const v13, -0x40ab851f    # -0.83f

    .line 466
    .line 467
    .line 468
    const/high16 v15, -0x40400000    # -1.5f

    .line 469
    .line 470
    const v16, 0x3f2b851f    # 0.67f

    .line 471
    .line 472
    .line 473
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 474
    .line 475
    .line 476
    const/high16 v0, 0x41a00000    # 20.0f

    .line 477
    .line 478
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 479
    .line 480
    .line 481
    const v0, 0x40e33333    # 7.1f

    .line 482
    .line 483
    .line 484
    const/4 v2, 0x0

    .line 485
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 486
    .line 487
    .line 488
    const v17, 0x3feccccd    # 1.85f

    .line 489
    .line 490
    .line 491
    const v18, -0x4050a3d7    # -1.37f

    .line 492
    .line 493
    .line 494
    const v13, 0x3f59999a    # 0.85f

    .line 495
    .line 496
    .line 497
    const v15, 0x3fd33333    # 1.65f

    .line 498
    .line 499
    .line 500
    const v16, -0x40f5c28f    # -0.54f

    .line 501
    .line 502
    .line 503
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 504
    .line 505
    .line 506
    const v17, -0x4075c28f    # -1.08f

    .line 507
    .line 508
    .line 509
    const v18, -0x3ffae148    # -2.08f

    .line 510
    .line 511
    .line 512
    const v13, 0x3e570a3d    # 0.21f

    .line 513
    .line 514
    .line 515
    const v14, -0x409c28f6    # -0.89f

    .line 516
    .line 517
    .line 518
    const v15, -0x4175c28f    # -0.27f

    .line 519
    .line 520
    .line 521
    const v16, -0x401eb852    # -1.76f

    .line 522
    .line 523
    .line 524
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 525
    .line 526
    .line 527
    const/high16 v0, 0x41600000    # 14.0f

    .line 528
    .line 529
    const/high16 v2, 0x41700000    # 15.0f

    .line 530
    .line 531
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 532
    .line 533
    .line 534
    const/high16 v0, -0x3ff00000    # -2.25f

    .line 535
    .line 536
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 537
    .line 538
    .line 539
    const v17, 0x40bbd70a    # 5.87f

    .line 540
    .line 541
    .line 542
    const v18, 0x404c28f6    # 3.19f

    .line 543
    .line 544
    .line 545
    const v13, 0x3fc7ae14    # 1.56f

    .line 546
    .line 547
    .line 548
    const v14, 0x3fe66666    # 1.8f

    .line 549
    .line 550
    .line 551
    const v15, 0x40647ae1    # 3.57f

    .line 552
    .line 553
    .line 554
    const v16, 0x403a3d71    # 2.91f

    .line 555
    .line 556
    .line 557
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 558
    .line 559
    .line 560
    const/high16 v17, 0x41a80000    # 21.0f

    .line 561
    .line 562
    const v18, 0x416f0a3d    # 14.94f

    .line 563
    .line 564
    .line 565
    const v13, 0x41a3c28f    # 20.47f

    .line 566
    .line 567
    .line 568
    const/high16 v14, 0x41800000    # 16.0f

    .line 569
    .line 570
    const/high16 v15, 0x41a80000    # 21.0f

    .line 571
    .line 572
    const v16, 0x4178a3d7    # 15.54f

    .line 573
    .line 574
    .line 575
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 576
    .line 577
    .line 578
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 579
    .line 580
    .line 581
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 582
    .line 583
    .line 584
    move-result-object v2

    .line 585
    const/16 v16, 0x3800

    .line 586
    .line 587
    const/16 v17, 0x0

    .line 588
    .line 589
    const/high16 v6, 0x3f800000    # 1.0f

    .line 590
    .line 591
    const/4 v7, 0x0

    .line 592
    const/high16 v12, 0x3f800000    # 1.0f

    .line 593
    .line 594
    const/4 v13, 0x0

    .line 595
    const/4 v14, 0x0

    .line 596
    const/4 v15, 0x0

    .line 597
    const-string v4, ""

    .line 598
    .line 599
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 600
    .line 601
    .line 602
    move-result-object v0

    .line 603
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 604
    .line 605
    .line 606
    move-result-object v0

    .line 607
    sput-object v0, Landroidx/compose/material/icons/rounded/SelfImprovementKt;->_selfImprovement:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 608
    .line 609
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 610
    .line 611
    .line 612
    return-object v0
.end method
