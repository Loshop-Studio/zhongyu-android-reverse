.class public final Landroidx/compose/material/icons/rounded/TouchAppKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_touchApp",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "TouchApp",
        "Landroidx/compose/material/icons/Icons$Rounded;",
        "getTouchApp",
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
        "SMAP\nTouchApp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TouchApp.kt\nandroidx/compose/material/icons/rounded/TouchAppKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,65:1\n212#2,12:66\n233#2,18:79\n253#2:116\n174#3:78\n705#4,2:97\n717#4,2:99\n719#4,11:105\n72#5,4:101\n*S KotlinDebug\n*F\n+ 1 TouchApp.kt\nandroidx/compose/material/icons/rounded/TouchAppKt\n*L\n29#1:66,12\n30#1:79,18\n30#1:116\n29#1:78\n30#1:97,2\n30#1:99,2\n30#1:105,11\n30#1:101,4\n*E\n"
    }
.end annotation


# static fields
.field private static _touchApp:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getTouchApp(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/TouchAppKt;->_touchApp:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.TouchApp"

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
    const/4 v0, 0x0

    .line 50
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 51
    .line 52
    .line 53
    sget-object v0, Landroidx/compose/ui/graphics/StrokeCap;->Companion:Landroidx/compose/ui/graphics/StrokeCap$Companion;

    .line 54
    .line 55
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 56
    .line 57
    .line 58
    move-result v10

    .line 59
    sget-object v0, Landroidx/compose/ui/graphics/StrokeJoin;->Companion:Landroidx/compose/ui/graphics/StrokeJoin$Companion;

    .line 60
    .line 61
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 62
    .line 63
    .line 64
    move-result v11

    .line 65
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 66
    .line 67
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 68
    .line 69
    .line 70
    const v0, 0x410ca3d7    # 8.79f

    .line 71
    .line 72
    .line 73
    const v2, 0x4113d70a    # 9.24f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const/high16 v0, 0x40b00000    # 5.5f

    .line 80
    .line 81
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 82
    .line 83
    .line 84
    const/high16 v17, 0x40200000    # 2.5f

    .line 85
    .line 86
    const/high16 v18, -0x3fe00000    # -2.5f

    .line 87
    .line 88
    const/4 v13, 0x0

    .line 89
    const v14, -0x404f5c29    # -1.38f

    .line 90
    .line 91
    .line 92
    const v15, 0x3f8f5c29    # 1.12f

    .line 93
    .line 94
    .line 95
    const/high16 v16, -0x3fe00000    # -2.5f

    .line 96
    .line 97
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 98
    .line 99
    .line 100
    const v0, 0x3f8f5c29    # 1.12f

    .line 101
    .line 102
    .line 103
    const/high16 v2, 0x40200000    # 2.5f

    .line 104
    .line 105
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 106
    .line 107
    .line 108
    const v0, 0x406f5c29    # 3.74f

    .line 109
    .line 110
    .line 111
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 112
    .line 113
    .line 114
    const/high16 v17, 0x40000000    # 2.0f

    .line 115
    .line 116
    const v18, -0x3f90a3d7    # -3.74f

    .line 117
    .line 118
    .line 119
    const v13, 0x3f9ae148    # 1.21f

    .line 120
    .line 121
    .line 122
    const v14, -0x40b0a3d7    # -0.81f

    .line 123
    .line 124
    .line 125
    const/high16 v15, 0x40000000    # 2.0f

    .line 126
    .line 127
    const v16, -0x3ff47ae1    # -2.18f

    .line 128
    .line 129
    .line 130
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 131
    .line 132
    .line 133
    const/high16 v17, -0x3f700000    # -4.5f

    .line 134
    .line 135
    const/high16 v18, -0x3f700000    # -4.5f

    .line 136
    .line 137
    const/4 v13, 0x0

    .line 138
    const v14, -0x3fe0a3d7    # -2.49f

    .line 139
    .line 140
    .line 141
    const v15, -0x3fff5c29    # -2.01f

    .line 142
    .line 143
    .line 144
    const/high16 v16, -0x3f700000    # -4.5f

    .line 145
    .line 146
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 147
    .line 148
    .line 149
    const v0, 0x4000a3d7    # 2.01f

    .line 150
    .line 151
    .line 152
    const/high16 v2, 0x40900000    # 4.5f

    .line 153
    .line 154
    const/high16 v4, -0x3f700000    # -4.5f

    .line 155
    .line 156
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 157
    .line 158
    .line 159
    const v17, 0x410ca3d7    # 8.79f

    .line 160
    .line 161
    .line 162
    const v18, 0x4113d70a    # 9.24f

    .line 163
    .line 164
    .line 165
    const v13, 0x40d947ae    # 6.79f

    .line 166
    .line 167
    .line 168
    const v14, 0x40e1eb85    # 7.06f

    .line 169
    .line 170
    .line 171
    const v15, 0x40f28f5c    # 7.58f

    .line 172
    .line 173
    .line 174
    const v16, 0x4106e148    # 8.43f

    .line 175
    .line 176
    .line 177
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 178
    .line 179
    .line 180
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 181
    .line 182
    .line 183
    const v0, 0x413b5c29    # 11.71f

    .line 184
    .line 185
    .line 186
    const v2, 0x4164a3d7    # 14.29f

    .line 187
    .line 188
    .line 189
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 190
    .line 191
    .line 192
    const v17, -0x409c28f6    # -0.89f

    .line 193
    .line 194
    .line 195
    const v18, -0x41a8f5c3    # -0.21f

    .line 196
    .line 197
    .line 198
    const v13, -0x4170a3d7    # -0.28f

    .line 199
    .line 200
    .line 201
    const v14, -0x41f0a3d7    # -0.14f

    .line 202
    .line 203
    .line 204
    const v15, -0x40eb851f    # -0.58f

    .line 205
    .line 206
    .line 207
    const v16, -0x41a8f5c3    # -0.21f

    .line 208
    .line 209
    .line 210
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 211
    .line 212
    .line 213
    const v0, -0x40e3d70a    # -0.61f

    .line 214
    .line 215
    .line 216
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 217
    .line 218
    .line 219
    const/high16 v0, -0x3f400000    # -6.0f

    .line 220
    .line 221
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 222
    .line 223
    .line 224
    const/high16 v17, -0x40400000    # -1.5f

    .line 225
    .line 226
    const/high16 v18, -0x40400000    # -1.5f

    .line 227
    .line 228
    const/4 v13, 0x0

    .line 229
    const v14, -0x40ab851f    # -0.83f

    .line 230
    .line 231
    .line 232
    const v15, -0x40d47ae1    # -0.67f

    .line 233
    .line 234
    .line 235
    const/high16 v16, -0x40400000    # -1.5f

    .line 236
    .line 237
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 238
    .line 239
    .line 240
    const v0, 0x3f2b851f    # 0.67f

    .line 241
    .line 242
    .line 243
    const/high16 v2, 0x3fc00000    # 1.5f

    .line 244
    .line 245
    const/high16 v4, -0x40400000    # -1.5f

    .line 246
    .line 247
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 248
    .line 249
    .line 250
    const v0, 0x412bd70a    # 10.74f

    .line 251
    .line 252
    .line 253
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 254
    .line 255
    .line 256
    const v0, -0x3fa3d70a    # -3.44f

    .line 257
    .line 258
    .line 259
    const v2, -0x40c7ae14    # -0.72f

    .line 260
    .line 261
    .line 262
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 263
    .line 264
    .line 265
    const v17, -0x407c28f6    # -1.03f

    .line 266
    .line 267
    .line 268
    const v18, 0x3e9eb852    # 0.31f

    .line 269
    .line 270
    .line 271
    const v13, -0x41428f5c    # -0.37f

    .line 272
    .line 273
    .line 274
    const v14, -0x425c28f6    # -0.08f

    .line 275
    .line 276
    .line 277
    const v15, -0x40bd70a4    # -0.76f

    .line 278
    .line 279
    .line 280
    const v16, 0x3d23d70a    # 0.04f

    .line 281
    .line 282
    .line 283
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 284
    .line 285
    .line 286
    const/16 v17, 0x0

    .line 287
    .line 288
    const v18, 0x3fca3d71    # 1.58f

    .line 289
    .line 290
    .line 291
    const v13, -0x4123d70a    # -0.43f

    .line 292
    .line 293
    .line 294
    const v14, 0x3ee147ae    # 0.44f

    .line 295
    .line 296
    .line 297
    const v15, -0x4123d70a    # -0.43f

    .line 298
    .line 299
    .line 300
    const v16, 0x3f91eb85    # 1.14f

    .line 301
    .line 302
    .line 303
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 304
    .line 305
    .line 306
    const v0, 0x408051ec    # 4.01f

    .line 307
    .line 308
    .line 309
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 310
    .line 311
    .line 312
    const/high16 v17, 0x412c0000    # 10.75f

    .line 313
    .line 314
    const/high16 v18, 0x41b00000    # 22.0f

    .line 315
    .line 316
    const v13, 0x411b5c29    # 9.71f

    .line 317
    .line 318
    .line 319
    const v14, 0x41ae51ec    # 21.79f

    .line 320
    .line 321
    .line 322
    const v15, 0x4123851f    # 10.22f

    .line 323
    .line 324
    .line 325
    const/high16 v16, 0x41b00000    # 22.0f

    .line 326
    .line 327
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 328
    .line 329
    .line 330
    const v0, 0x40c33333    # 6.1f

    .line 331
    .line 332
    .line 333
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 334
    .line 335
    .line 336
    const v17, 0x3ffd70a4    # 1.98f

    .line 337
    .line 338
    .line 339
    const v18, -0x4023d70a    # -1.72f

    .line 340
    .line 341
    .line 342
    const/high16 v13, 0x3f800000    # 1.0f

    .line 343
    .line 344
    const/4 v14, 0x0

    .line 345
    const v15, 0x3feb851f    # 1.84f

    .line 346
    .line 347
    .line 348
    const v16, -0x40c51eb8    # -0.73f

    .line 349
    .line 350
    .line 351
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 352
    .line 353
    .line 354
    const v0, 0x3f2147ae    # 0.63f

    .line 355
    .line 356
    .line 357
    const v2, -0x3f70f5c3    # -4.47f

    .line 358
    .line 359
    .line 360
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 361
    .line 362
    .line 363
    const v17, -0x40747ae1    # -1.09f

    .line 364
    .line 365
    .line 366
    const v18, -0x3ffb851f    # -2.07f

    .line 367
    .line 368
    .line 369
    const v13, 0x3df5c28f    # 0.12f

    .line 370
    .line 371
    .line 372
    const v14, -0x40a66666    # -0.85f

    .line 373
    .line 374
    .line 375
    const v15, -0x415c28f6    # -0.32f

    .line 376
    .line 377
    .line 378
    const v16, -0x4027ae14    # -1.69f

    .line 379
    .line 380
    .line 381
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 382
    .line 383
    .line 384
    const v0, 0x413b5c29    # 11.71f

    .line 385
    .line 386
    .line 387
    const v2, 0x4164a3d7    # 14.29f

    .line 388
    .line 389
    .line 390
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 391
    .line 392
    .line 393
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 394
    .line 395
    .line 396
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 397
    .line 398
    .line 399
    move-result-object v2

    .line 400
    const/16 v16, 0x3800

    .line 401
    .line 402
    const/16 v17, 0x0

    .line 403
    .line 404
    const/high16 v6, 0x3f800000    # 1.0f

    .line 405
    .line 406
    const/high16 v8, 0x3f800000    # 1.0f

    .line 407
    .line 408
    const/4 v7, 0x0

    .line 409
    const/high16 v9, 0x3f800000    # 1.0f

    .line 410
    .line 411
    const/high16 v12, 0x3f800000    # 1.0f

    .line 412
    .line 413
    const/4 v13, 0x0

    .line 414
    const/4 v14, 0x0

    .line 415
    const/4 v15, 0x0

    .line 416
    const-string v4, ""

    .line 417
    .line 418
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 419
    .line 420
    .line 421
    move-result-object v0

    .line 422
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 423
    .line 424
    .line 425
    move-result-object v0

    .line 426
    sput-object v0, Landroidx/compose/material/icons/rounded/TouchAppKt;->_touchApp:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 427
    .line 428
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 429
    .line 430
    .line 431
    return-object v0
.end method
