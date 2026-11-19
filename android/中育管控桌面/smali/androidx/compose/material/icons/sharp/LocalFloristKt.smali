.class public final Landroidx/compose/material/icons/sharp/LocalFloristKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_localFlorist",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "LocalFlorist",
        "Landroidx/compose/material/icons/Icons$Sharp;",
        "getLocalFlorist",
        "(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;",
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
        "SMAP\nLocalFlorist.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LocalFlorist.kt\nandroidx/compose/material/icons/sharp/LocalFloristKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,73:1\n212#2,12:74\n233#2,18:87\n253#2:124\n174#3:86\n705#4,2:105\n717#4,2:107\n719#4,11:113\n72#5,4:109\n*S KotlinDebug\n*F\n+ 1 LocalFlorist.kt\nandroidx/compose/material/icons/sharp/LocalFloristKt\n*L\n29#1:74,12\n30#1:87,18\n30#1:124\n29#1:86\n30#1:105,2\n30#1:107,2\n30#1:113,11\n30#1:109,4\n*E\n"
    }
.end annotation


# static fields
.field private static _localFlorist:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getLocalFlorist(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/sharp/LocalFloristKt;->_localFlorist:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Sharp.LocalFlorist"

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
    const/high16 v0, 0x41b00000    # 22.0f

    .line 71
    .line 72
    const/high16 v2, 0x41400000    # 12.0f

    .line 73
    .line 74
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v17, 0x41100000    # 9.0f

    .line 78
    .line 79
    const/high16 v18, -0x3ef00000    # -9.0f

    .line 80
    .line 81
    const v13, 0x409f0a3d    # 4.97f

    .line 82
    .line 83
    .line 84
    const/4 v14, 0x0

    .line 85
    const/high16 v15, 0x41100000    # 9.0f

    .line 86
    .line 87
    const v16, -0x3f7f0a3d    # -4.03f

    .line 88
    .line 89
    .line 90
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 91
    .line 92
    .line 93
    const/high16 v17, -0x3ef00000    # -9.0f

    .line 94
    .line 95
    const/high16 v18, 0x41100000    # 9.0f

    .line 96
    .line 97
    const v13, -0x3f60f5c3    # -4.97f

    .line 98
    .line 99
    .line 100
    const/high16 v15, -0x3ef00000    # -9.0f

    .line 101
    .line 102
    const v16, 0x4080f5c3    # 4.03f

    .line 103
    .line 104
    .line 105
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 106
    .line 107
    .line 108
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 109
    .line 110
    .line 111
    const v0, 0x40b33333    # 5.6f

    .line 112
    .line 113
    .line 114
    const/high16 v2, 0x41240000    # 10.25f

    .line 115
    .line 116
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 117
    .line 118
    .line 119
    const/high16 v17, 0x40200000    # 2.5f

    .line 120
    .line 121
    const/high16 v18, 0x40200000    # 2.5f

    .line 122
    .line 123
    const/4 v13, 0x0

    .line 124
    const v14, 0x3fb0a3d7    # 1.38f

    .line 125
    .line 126
    .line 127
    const v15, 0x3f8f5c29    # 1.12f

    .line 128
    .line 129
    .line 130
    const/high16 v16, 0x40200000    # 2.5f

    .line 131
    .line 132
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 133
    .line 134
    .line 135
    const v17, 0x3fb5c28f    # 1.42f

    .line 136
    .line 137
    .line 138
    const v18, -0x411eb852    # -0.44f

    .line 139
    .line 140
    .line 141
    const v13, 0x3f07ae14    # 0.53f

    .line 142
    .line 143
    .line 144
    const/4 v14, 0x0

    .line 145
    const v15, 0x3f8147ae    # 1.01f

    .line 146
    .line 147
    .line 148
    const v16, -0x41dc28f6    # -0.16f

    .line 149
    .line 150
    .line 151
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 152
    .line 153
    .line 154
    const v0, 0x3e428f5c    # 0.19f

    .line 155
    .line 156
    .line 157
    const v2, -0x435c28f6    # -0.02f

    .line 158
    .line 159
    .line 160
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 161
    .line 162
    .line 163
    const/high16 v17, 0x40200000    # 2.5f

    .line 164
    .line 165
    const/high16 v18, 0x40200000    # 2.5f

    .line 166
    .line 167
    const/4 v13, 0x0

    .line 168
    const v14, 0x3fb0a3d7    # 1.38f

    .line 169
    .line 170
    .line 171
    const v15, 0x3f8f5c29    # 1.12f

    .line 172
    .line 173
    .line 174
    const/high16 v16, 0x40200000    # 2.5f

    .line 175
    .line 176
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 177
    .line 178
    .line 179
    const v0, -0x4070a3d7    # -1.12f

    .line 180
    .line 181
    .line 182
    const/high16 v2, -0x3fe00000    # -2.5f

    .line 183
    .line 184
    const/high16 v4, 0x40200000    # 2.5f

    .line 185
    .line 186
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 187
    .line 188
    .line 189
    const v0, -0x41bd70a4    # -0.19f

    .line 190
    .line 191
    .line 192
    const v2, -0x435c28f6    # -0.02f

    .line 193
    .line 194
    .line 195
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 196
    .line 197
    .line 198
    const v17, 0x3fb5c28f    # 1.42f

    .line 199
    .line 200
    .line 201
    const v18, 0x3ee147ae    # 0.44f

    .line 202
    .line 203
    .line 204
    const v13, 0x3ecccccd    # 0.4f

    .line 205
    .line 206
    .line 207
    const v14, 0x3e8f5c29    # 0.28f

    .line 208
    .line 209
    .line 210
    const v15, 0x3f63d70a    # 0.89f

    .line 211
    .line 212
    .line 213
    const v16, 0x3ee147ae    # 0.44f

    .line 214
    .line 215
    .line 216
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 217
    .line 218
    .line 219
    const/high16 v17, 0x40200000    # 2.5f

    .line 220
    .line 221
    const/high16 v18, -0x3fe00000    # -2.5f

    .line 222
    .line 223
    const v13, 0x3fb0a3d7    # 1.38f

    .line 224
    .line 225
    .line 226
    const/4 v14, 0x0

    .line 227
    const/high16 v15, 0x40200000    # 2.5f

    .line 228
    .line 229
    const v16, -0x4070a3d7    # -1.12f

    .line 230
    .line 231
    .line 232
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 233
    .line 234
    .line 235
    const v17, -0x4048f5c3    # -1.43f

    .line 236
    .line 237
    .line 238
    const/high16 v18, -0x3ff00000    # -2.25f

    .line 239
    .line 240
    const/4 v13, 0x0

    .line 241
    const/high16 v14, -0x40800000    # -1.0f

    .line 242
    .line 243
    const v15, -0x40e8f5c3    # -0.59f

    .line 244
    .line 245
    .line 246
    const v16, -0x40133333    # -1.85f

    .line 247
    .line 248
    .line 249
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 250
    .line 251
    .line 252
    const v17, 0x3fb70a3d    # 1.43f

    .line 253
    .line 254
    .line 255
    const v13, 0x3f570a3d    # 0.84f

    .line 256
    .line 257
    .line 258
    const v14, -0x41333333    # -0.4f

    .line 259
    .line 260
    .line 261
    const v15, 0x3fb70a3d    # 1.43f

    .line 262
    .line 263
    .line 264
    const/high16 v16, -0x40600000    # -1.25f

    .line 265
    .line 266
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 267
    .line 268
    .line 269
    const/high16 v17, -0x3fe00000    # -2.5f

    .line 270
    .line 271
    const/high16 v18, -0x3fe00000    # -2.5f

    .line 272
    .line 273
    const/4 v13, 0x0

    .line 274
    const v14, -0x404f5c29    # -1.38f

    .line 275
    .line 276
    .line 277
    const v15, -0x4070a3d7    # -1.12f

    .line 278
    .line 279
    .line 280
    const/high16 v16, -0x3fe00000    # -2.5f

    .line 281
    .line 282
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 283
    .line 284
    .line 285
    const v17, -0x404a3d71    # -1.42f

    .line 286
    .line 287
    .line 288
    const v18, 0x3ee147ae    # 0.44f

    .line 289
    .line 290
    .line 291
    const v13, -0x40f851ec    # -0.53f

    .line 292
    .line 293
    .line 294
    const/4 v14, 0x0

    .line 295
    const v15, -0x407eb852    # -1.01f

    .line 296
    .line 297
    .line 298
    const v16, 0x3e23d70a    # 0.16f

    .line 299
    .line 300
    .line 301
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 302
    .line 303
    .line 304
    const v0, 0x3ca3d70a    # 0.02f

    .line 305
    .line 306
    .line 307
    const v2, -0x41bd70a4    # -0.19f

    .line 308
    .line 309
    .line 310
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 311
    .line 312
    .line 313
    const/high16 v17, 0x41400000    # 12.0f

    .line 314
    .line 315
    const/high16 v18, 0x3f800000    # 1.0f

    .line 316
    .line 317
    const/high16 v13, 0x41680000    # 14.5f

    .line 318
    .line 319
    const v14, 0x4007ae14    # 2.12f

    .line 320
    .line 321
    .line 322
    const v15, 0x4156147b    # 13.38f

    .line 323
    .line 324
    .line 325
    const/high16 v16, 0x3f800000    # 1.0f

    .line 326
    .line 327
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 328
    .line 329
    .line 330
    const v0, 0x4007ae14    # 2.12f

    .line 331
    .line 332
    .line 333
    const/high16 v2, 0x40600000    # 3.5f

    .line 334
    .line 335
    const/high16 v4, 0x41180000    # 9.5f

    .line 336
    .line 337
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 338
    .line 339
    .line 340
    const v0, 0x3ca3d70a    # 0.02f

    .line 341
    .line 342
    .line 343
    const v2, 0x3e428f5c    # 0.19f

    .line 344
    .line 345
    .line 346
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 347
    .line 348
    .line 349
    const v17, -0x404a3d71    # -1.42f

    .line 350
    .line 351
    .line 352
    const v18, -0x411eb852    # -0.44f

    .line 353
    .line 354
    .line 355
    const v13, -0x41333333    # -0.4f

    .line 356
    .line 357
    .line 358
    const v14, -0x4170a3d7    # -0.28f

    .line 359
    .line 360
    .line 361
    const v15, -0x409c28f6    # -0.89f

    .line 362
    .line 363
    .line 364
    const v16, -0x411eb852    # -0.44f

    .line 365
    .line 366
    .line 367
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 368
    .line 369
    .line 370
    const/high16 v17, -0x3fe00000    # -2.5f

    .line 371
    .line 372
    const/high16 v18, 0x40200000    # 2.5f

    .line 373
    .line 374
    const v13, -0x404f5c29    # -1.38f

    .line 375
    .line 376
    .line 377
    const/4 v14, 0x0

    .line 378
    const/high16 v15, -0x3fe00000    # -2.5f

    .line 379
    .line 380
    const v16, 0x3f8f5c29    # 1.12f

    .line 381
    .line 382
    .line 383
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 384
    .line 385
    .line 386
    const v17, 0x3fb70a3d    # 1.43f

    .line 387
    .line 388
    .line 389
    const/high16 v18, 0x40100000    # 2.25f

    .line 390
    .line 391
    const/4 v13, 0x0

    .line 392
    const/high16 v14, 0x3f800000    # 1.0f

    .line 393
    .line 394
    const v15, 0x3f170a3d    # 0.59f

    .line 395
    .line 396
    .line 397
    const v16, 0x3feccccd    # 1.85f

    .line 398
    .line 399
    .line 400
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 401
    .line 402
    .line 403
    const v17, -0x4048f5c3    # -1.43f

    .line 404
    .line 405
    .line 406
    const v13, -0x40a8f5c3    # -0.84f

    .line 407
    .line 408
    .line 409
    const v14, 0x3ecccccd    # 0.4f

    .line 410
    .line 411
    .line 412
    const v15, -0x4048f5c3    # -1.43f

    .line 413
    .line 414
    .line 415
    const/high16 v16, 0x3fa00000    # 1.25f

    .line 416
    .line 417
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 418
    .line 419
    .line 420
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 421
    .line 422
    .line 423
    const/high16 v0, 0x40b00000    # 5.5f

    .line 424
    .line 425
    const/high16 v2, 0x41400000    # 12.0f

    .line 426
    .line 427
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 428
    .line 429
    .line 430
    const/high16 v17, 0x40200000    # 2.5f

    .line 431
    .line 432
    const/high16 v18, 0x40200000    # 2.5f

    .line 433
    .line 434
    const v13, 0x3fb0a3d7    # 1.38f

    .line 435
    .line 436
    .line 437
    const/4 v14, 0x0

    .line 438
    const/high16 v15, 0x40200000    # 2.5f

    .line 439
    .line 440
    const v16, 0x3f8f5c29    # 1.12f

    .line 441
    .line 442
    .line 443
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 444
    .line 445
    .line 446
    const v0, -0x4070a3d7    # -1.12f

    .line 447
    .line 448
    .line 449
    const/high16 v2, -0x3fe00000    # -2.5f

    .line 450
    .line 451
    const/high16 v4, 0x40200000    # 2.5f

    .line 452
    .line 453
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 454
    .line 455
    .line 456
    const v0, 0x4116147b    # 9.38f

    .line 457
    .line 458
    .line 459
    const/high16 v2, 0x41000000    # 8.0f

    .line 460
    .line 461
    const/high16 v4, 0x41180000    # 9.5f

    .line 462
    .line 463
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 464
    .line 465
    .line 466
    const v0, 0x3f8f5c29    # 1.12f

    .line 467
    .line 468
    .line 469
    const/high16 v2, -0x3fe00000    # -2.5f

    .line 470
    .line 471
    const/high16 v4, 0x40200000    # 2.5f

    .line 472
    .line 473
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 474
    .line 475
    .line 476
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 477
    .line 478
    .line 479
    const/high16 v0, 0x40400000    # 3.0f

    .line 480
    .line 481
    const/high16 v2, 0x41500000    # 13.0f

    .line 482
    .line 483
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 484
    .line 485
    .line 486
    const/high16 v17, 0x41100000    # 9.0f

    .line 487
    .line 488
    const/high16 v18, 0x41100000    # 9.0f

    .line 489
    .line 490
    const/4 v13, 0x0

    .line 491
    const v14, 0x409f0a3d    # 4.97f

    .line 492
    .line 493
    .line 494
    const v15, 0x4080f5c3    # 4.03f

    .line 495
    .line 496
    .line 497
    const/high16 v16, 0x41100000    # 9.0f

    .line 498
    .line 499
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 500
    .line 501
    .line 502
    const/high16 v17, -0x3ef00000    # -9.0f

    .line 503
    .line 504
    const/high16 v18, -0x3ef00000    # -9.0f

    .line 505
    .line 506
    const v14, -0x3f60f5c3    # -4.97f

    .line 507
    .line 508
    .line 509
    const v15, -0x3f7f0a3d    # -4.03f

    .line 510
    .line 511
    .line 512
    const/high16 v16, -0x3ef00000    # -9.0f

    .line 513
    .line 514
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 515
    .line 516
    .line 517
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 518
    .line 519
    .line 520
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 521
    .line 522
    .line 523
    move-result-object v2

    .line 524
    const/16 v16, 0x3800

    .line 525
    .line 526
    const/16 v17, 0x0

    .line 527
    .line 528
    const/high16 v6, 0x3f800000    # 1.0f

    .line 529
    .line 530
    const/high16 v8, 0x3f800000    # 1.0f

    .line 531
    .line 532
    const/4 v7, 0x0

    .line 533
    const/high16 v9, 0x3f800000    # 1.0f

    .line 534
    .line 535
    const/high16 v12, 0x3f800000    # 1.0f

    .line 536
    .line 537
    const/4 v14, 0x0

    .line 538
    const/4 v15, 0x0

    .line 539
    const-string v4, ""

    .line 540
    .line 541
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 542
    .line 543
    .line 544
    move-result-object v0

    .line 545
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 546
    .line 547
    .line 548
    move-result-object v0

    .line 549
    sput-object v0, Landroidx/compose/material/icons/sharp/LocalFloristKt;->_localFlorist:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 550
    .line 551
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 552
    .line 553
    .line 554
    return-object v0
.end method
