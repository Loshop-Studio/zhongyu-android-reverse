.class public final Landroidx/compose/material/icons/outlined/CameraKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_camera",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "Camera",
        "Landroidx/compose/material/icons/Icons$Outlined;",
        "getCamera",
        "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;",
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
        "SMAP\nCamera.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Camera.kt\nandroidx/compose/material/icons/outlined/CameraKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,82:1\n212#2,12:83\n233#2,18:96\n253#2:133\n174#3:95\n705#4,2:114\n717#4,2:116\n719#4,11:122\n72#5,4:118\n*S KotlinDebug\n*F\n+ 1 Camera.kt\nandroidx/compose/material/icons/outlined/CameraKt\n*L\n29#1:83,12\n30#1:96,18\n30#1:133\n29#1:95\n30#1:114,2\n30#1:116,2\n30#1:122,11\n30#1:118,4\n*E\n"
    }
.end annotation


# static fields
.field private static _camera:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getCamera(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/outlined/CameraKt;->_camera:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Outlined.Camera"

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
    const/high16 v0, 0x41640000    # 14.25f

    .line 71
    .line 72
    const v2, 0x4010a3d7    # 2.26f

    .line 73
    .line 74
    .line 75
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    const v0, -0x425c28f6    # -0.08f

    .line 79
    .line 80
    .line 81
    const v2, -0x42dc28f6    # -0.04f

    .line 82
    .line 83
    .line 84
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 85
    .line 86
    .line 87
    const v0, -0x43dc28f6    # -0.01f

    .line 88
    .line 89
    .line 90
    const v2, 0x3ca3d70a    # 0.02f

    .line 91
    .line 92
    .line 93
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 94
    .line 95
    .line 96
    const/high16 v17, 0x41400000    # 12.0f

    .line 97
    .line 98
    const/high16 v18, 0x40000000    # 2.0f

    .line 99
    .line 100
    const v13, 0x41575c29    # 13.46f

    .line 101
    .line 102
    .line 103
    const v14, 0x4005c28f    # 2.09f

    .line 104
    .line 105
    .line 106
    const v15, 0x414bd70a    # 12.74f

    .line 107
    .line 108
    .line 109
    const/high16 v16, 0x40000000    # 2.0f

    .line 110
    .line 111
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 112
    .line 113
    .line 114
    const/high16 v17, 0x40000000    # 2.0f

    .line 115
    .line 116
    const/high16 v18, 0x41400000    # 12.0f

    .line 117
    .line 118
    const v13, 0x40cf5c29    # 6.48f

    .line 119
    .line 120
    .line 121
    const/high16 v14, 0x40000000    # 2.0f

    .line 122
    .line 123
    const/high16 v15, 0x40000000    # 2.0f

    .line 124
    .line 125
    const v16, 0x40cf5c29    # 6.48f

    .line 126
    .line 127
    .line 128
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 129
    .line 130
    .line 131
    const v0, 0x408f5c29    # 4.48f

    .line 132
    .line 133
    .line 134
    const/high16 v2, 0x41200000    # 10.0f

    .line 135
    .line 136
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 137
    .line 138
    .line 139
    const v0, -0x3f70a3d7    # -4.48f

    .line 140
    .line 141
    .line 142
    const/high16 v2, -0x3ee00000    # -10.0f

    .line 143
    .line 144
    const/high16 v4, 0x41200000    # 10.0f

    .line 145
    .line 146
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 147
    .line 148
    .line 149
    const/high16 v17, -0x3f080000    # -7.75f

    .line 150
    .line 151
    const v18, -0x3ee428f6    # -9.74f

    .line 152
    .line 153
    .line 154
    const/4 v13, 0x0

    .line 155
    const/high16 v14, -0x3f680000    # -4.75f

    .line 156
    .line 157
    const v15, -0x3fac28f6    # -3.31f

    .line 158
    .line 159
    .line 160
    const v16, -0x3ef47ae1    # -8.72f

    .line 161
    .line 162
    .line 163
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 164
    .line 165
    .line 166
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 167
    .line 168
    .line 169
    const v0, 0x419b47ae    # 19.41f

    .line 170
    .line 171
    .line 172
    const/high16 v2, 0x41100000    # 9.0f

    .line 173
    .line 174
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 175
    .line 176
    .line 177
    const v0, -0x3f0051ec    # -7.99f

    .line 178
    .line 179
    .line 180
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 181
    .line 182
    .line 183
    const v0, 0x402d70a4    # 2.71f

    .line 184
    .line 185
    .line 186
    const v2, -0x3f69999a    # -4.7f

    .line 187
    .line 188
    .line 189
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 190
    .line 191
    .line 192
    const v17, 0x40a8f5c3    # 5.28f

    .line 193
    .line 194
    .line 195
    const v18, 0x40966666    # 4.7f

    .line 196
    .line 197
    .line 198
    const v13, 0x4019999a    # 2.4f

    .line 199
    .line 200
    .line 201
    const v14, 0x3f28f5c3    # 0.66f

    .line 202
    .line 203
    .line 204
    const v15, 0x408b3333    # 4.35f

    .line 205
    .line 206
    .line 207
    const v16, 0x401ae148    # 2.42f

    .line 208
    .line 209
    .line 210
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 211
    .line 212
    .line 213
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 214
    .line 215
    .line 216
    const v0, 0x4151999a    # 13.1f

    .line 217
    .line 218
    .line 219
    const v2, 0x40828f5c    # 4.08f

    .line 220
    .line 221
    .line 222
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 223
    .line 224
    .line 225
    const v0, 0x412451ec    # 10.27f

    .line 226
    .line 227
    .line 228
    const/high16 v2, 0x41100000    # 9.0f

    .line 229
    .line 230
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 231
    .line 232
    .line 233
    const v0, -0x406ccccd    # -1.15f

    .line 234
    .line 235
    .line 236
    const/high16 v2, 0x40000000    # 2.0f

    .line 237
    .line 238
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 239
    .line 240
    .line 241
    const v0, 0x40cccccd    # 6.4f

    .line 242
    .line 243
    .line 244
    const v2, 0x40c9999a    # 6.3f

    .line 245
    .line 246
    .line 247
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 248
    .line 249
    .line 250
    const/high16 v17, 0x41400000    # 12.0f

    .line 251
    .line 252
    const/high16 v18, 0x40800000    # 4.0f

    .line 253
    .line 254
    const v13, 0x40fae148    # 7.84f

    .line 255
    .line 256
    .line 257
    const v14, 0x409c28f6    # 4.88f

    .line 258
    .line 259
    .line 260
    const v15, 0x411d1eb8    # 9.82f

    .line 261
    .line 262
    .line 263
    const/high16 v16, 0x40800000    # 4.0f

    .line 264
    .line 265
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 266
    .line 267
    .line 268
    const v17, 0x3f8ccccd    # 1.1f

    .line 269
    .line 270
    .line 271
    const v18, 0x3da3d70a    # 0.08f

    .line 272
    .line 273
    .line 274
    const v13, 0x3ebd70a4    # 0.37f

    .line 275
    .line 276
    .line 277
    const/4 v14, 0x0

    .line 278
    const v15, 0x3f3d70a4    # 0.74f

    .line 279
    .line 280
    .line 281
    const v16, 0x3cf5c28f    # 0.03f

    .line 282
    .line 283
    .line 284
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 285
    .line 286
    .line 287
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 288
    .line 289
    .line 290
    const v0, 0x40b66666    # 5.7f

    .line 291
    .line 292
    .line 293
    const v2, 0x40e2e148    # 7.09f

    .line 294
    .line 295
    .line 296
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 297
    .line 298
    .line 299
    const v0, 0x4108a3d7    # 8.54f

    .line 300
    .line 301
    .line 302
    const/high16 v2, 0x41400000    # 12.0f

    .line 303
    .line 304
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 305
    .line 306
    .line 307
    const v0, 0x3f933333    # 1.15f

    .line 308
    .line 309
    .line 310
    const/high16 v2, 0x40000000    # 2.0f

    .line 311
    .line 312
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 313
    .line 314
    .line 315
    const v0, 0x408851ec    # 4.26f

    .line 316
    .line 317
    .line 318
    const/high16 v2, 0x41600000    # 14.0f

    .line 319
    .line 320
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 321
    .line 322
    .line 323
    const/high16 v17, 0x40800000    # 4.0f

    .line 324
    .line 325
    const/high16 v18, 0x41400000    # 12.0f

    .line 326
    .line 327
    const v13, 0x40833333    # 4.1f

    .line 328
    .line 329
    .line 330
    const v14, 0x4155c28f    # 13.36f

    .line 331
    .line 332
    .line 333
    const/high16 v15, 0x40800000    # 4.0f

    .line 334
    .line 335
    const v16, 0x414b0a3d    # 12.69f

    .line 336
    .line 337
    .line 338
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 339
    .line 340
    .line 341
    const v17, 0x3fd9999a    # 1.7f

    .line 342
    .line 343
    .line 344
    const v18, -0x3f62e148    # -4.91f

    .line 345
    .line 346
    .line 347
    const/4 v13, 0x0

    .line 348
    const v14, -0x40133333    # -1.85f

    .line 349
    .line 350
    .line 351
    const v15, 0x3f23d70a    # 0.64f

    .line 352
    .line 353
    .line 354
    const v16, -0x3f9ccccd    # -3.55f

    .line 355
    .line 356
    .line 357
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 358
    .line 359
    .line 360
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 361
    .line 362
    .line 363
    const v0, 0x4092e148    # 4.59f

    .line 364
    .line 365
    .line 366
    const/high16 v2, 0x41700000    # 15.0f

    .line 367
    .line 368
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 369
    .line 370
    .line 371
    const v0, 0x40ff5c29    # 7.98f

    .line 372
    .line 373
    .line 374
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 375
    .line 376
    .line 377
    const v0, -0x3fd28f5c    # -2.71f

    .line 378
    .line 379
    .line 380
    const v2, 0x40966666    # 4.7f

    .line 381
    .line 382
    .line 383
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 384
    .line 385
    .line 386
    const v17, -0x3f575c29    # -5.27f

    .line 387
    .line 388
    .line 389
    const v18, -0x3f69999a    # -4.7f

    .line 390
    .line 391
    .line 392
    const v13, -0x3fe66666    # -2.4f

    .line 393
    .line 394
    .line 395
    const v14, -0x40d47ae1    # -0.67f

    .line 396
    .line 397
    .line 398
    const v15, -0x3f751eb8    # -4.34f

    .line 399
    .line 400
    .line 401
    const v16, -0x3fe51eb8    # -2.42f

    .line 402
    .line 403
    .line 404
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 405
    .line 406
    .line 407
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 408
    .line 409
    .line 410
    const v0, 0x412e6666    # 10.9f

    .line 411
    .line 412
    .line 413
    const v2, 0x419f47ae    # 19.91f

    .line 414
    .line 415
    .line 416
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 417
    .line 418
    .line 419
    const v0, 0x416e3d71    # 14.89f

    .line 420
    .line 421
    .line 422
    const/high16 v2, 0x41500000    # 13.0f

    .line 423
    .line 424
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 425
    .line 426
    .line 427
    const v0, 0x402e147b    # 2.72f

    .line 428
    .line 429
    .line 430
    const v2, 0x40966666    # 4.7f

    .line 431
    .line 432
    .line 433
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 434
    .line 435
    .line 436
    const/high16 v17, 0x41400000    # 12.0f

    .line 437
    .line 438
    const/high16 v18, 0x41a00000    # 20.0f

    .line 439
    .line 440
    const v13, 0x418147ae    # 16.16f

    .line 441
    .line 442
    .line 443
    const v14, 0x4198f5c3    # 19.12f

    .line 444
    .line 445
    .line 446
    const v15, 0x4162e148    # 14.18f

    .line 447
    .line 448
    .line 449
    const/high16 v16, 0x41a00000    # 20.0f

    .line 450
    .line 451
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 452
    .line 453
    .line 454
    const v17, -0x40733333    # -1.1f

    .line 455
    .line 456
    .line 457
    const v18, -0x4247ae14    # -0.09f

    .line 458
    .line 459
    .line 460
    const v13, -0x413d70a4    # -0.38f

    .line 461
    .line 462
    .line 463
    const/4 v14, 0x0

    .line 464
    const v15, -0x40c28f5c    # -0.74f

    .line 465
    .line 466
    .line 467
    const v16, -0x42dc28f6    # -0.04f

    .line 468
    .line 469
    .line 470
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 471
    .line 472
    .line 473
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 474
    .line 475
    .line 476
    const v0, 0x41926666    # 18.3f

    .line 477
    .line 478
    .line 479
    const v2, 0x418747ae    # 16.91f

    .line 480
    .line 481
    .line 482
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 483
    .line 484
    .line 485
    const/high16 v0, -0x3f800000    # -4.0f

    .line 486
    .line 487
    const v2, -0x3f22e148    # -6.91f

    .line 488
    .line 489
    .line 490
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 491
    .line 492
    .line 493
    const v0, 0x40adc28f    # 5.43f

    .line 494
    .line 495
    .line 496
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 497
    .line 498
    .line 499
    const v17, 0x3e8a3d71    # 0.27f

    .line 500
    .line 501
    .line 502
    const/high16 v18, 0x40000000    # 2.0f

    .line 503
    .line 504
    const v13, 0x3e2e147b    # 0.17f

    .line 505
    .line 506
    .line 507
    const v14, 0x3f23d70a    # 0.64f

    .line 508
    .line 509
    .line 510
    const v15, 0x3e8a3d71    # 0.27f

    .line 511
    .line 512
    .line 513
    const v16, 0x3fa7ae14    # 1.31f

    .line 514
    .line 515
    .line 516
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 517
    .line 518
    .line 519
    const v17, -0x40266666    # -1.7f

    .line 520
    .line 521
    .line 522
    const v18, 0x409d1eb8    # 4.91f

    .line 523
    .line 524
    .line 525
    const/4 v13, 0x0

    .line 526
    const v14, 0x3feccccd    # 1.85f

    .line 527
    .line 528
    .line 529
    const v15, -0x40dc28f6    # -0.64f

    .line 530
    .line 531
    .line 532
    const v16, 0x40633333    # 3.55f

    .line 533
    .line 534
    .line 535
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 536
    .line 537
    .line 538
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 539
    .line 540
    .line 541
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 542
    .line 543
    .line 544
    move-result-object v2

    .line 545
    const/16 v16, 0x3800

    .line 546
    .line 547
    const/16 v17, 0x0

    .line 548
    .line 549
    const/high16 v6, 0x3f800000    # 1.0f

    .line 550
    .line 551
    const/high16 v8, 0x3f800000    # 1.0f

    .line 552
    .line 553
    const/4 v7, 0x0

    .line 554
    const/high16 v9, 0x3f800000    # 1.0f

    .line 555
    .line 556
    const/high16 v12, 0x3f800000    # 1.0f

    .line 557
    .line 558
    const/4 v14, 0x0

    .line 559
    const/4 v15, 0x0

    .line 560
    const-string v4, ""

    .line 561
    .line 562
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 563
    .line 564
    .line 565
    move-result-object v0

    .line 566
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 567
    .line 568
    .line 569
    move-result-object v0

    .line 570
    sput-object v0, Landroidx/compose/material/icons/outlined/CameraKt;->_camera:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 571
    .line 572
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 573
    .line 574
    .line 575
    return-object v0
.end method
