.class public final Landroidx/compose/material/icons/outlined/FrontHandKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_frontHand",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "FrontHand",
        "Landroidx/compose/material/icons/Icons$Outlined;",
        "getFrontHand",
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
        "SMAP\nFrontHand.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FrontHand.kt\nandroidx/compose/material/icons/outlined/FrontHandKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,85:1\n212#2,12:86\n233#2,18:99\n253#2:136\n174#3:98\n705#4,2:117\n717#4,2:119\n719#4,11:125\n72#5,4:121\n*S KotlinDebug\n*F\n+ 1 FrontHand.kt\nandroidx/compose/material/icons/outlined/FrontHandKt\n*L\n29#1:86,12\n30#1:99,18\n30#1:136\n29#1:98\n30#1:117,2\n30#1:119,2\n30#1:125,11\n30#1:121,4\n*E\n"
    }
.end annotation


# static fields
.field private static _frontHand:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getFrontHand(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/outlined/FrontHandKt;->_frontHand:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Outlined.FrontHand"

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
    const/high16 v0, 0x41940000    # 18.5f

    .line 71
    .line 72
    const/high16 v2, 0x41000000    # 8.0f

    .line 73
    .line 74
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v17, -0x41000000    # -0.5f

    .line 78
    .line 79
    const v18, 0x3d4ccccd    # 0.05f

    .line 80
    .line 81
    .line 82
    const v13, -0x41d1eb85    # -0.17f

    .line 83
    .line 84
    .line 85
    const/4 v14, 0x0

    .line 86
    const v15, -0x4151eb85    # -0.34f

    .line 87
    .line 88
    .line 89
    const v16, 0x3ca3d70a    # 0.02f

    .line 90
    .line 91
    .line 92
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 93
    .line 94
    .line 95
    const/high16 v0, 0x40900000    # 4.5f

    .line 96
    .line 97
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 98
    .line 99
    .line 100
    const/high16 v17, 0x41780000    # 15.5f

    .line 101
    .line 102
    const/high16 v18, 0x40000000    # 2.0f

    .line 103
    .line 104
    const/high16 v13, 0x41900000    # 18.0f

    .line 105
    .line 106
    const v14, 0x4047ae14    # 3.12f

    .line 107
    .line 108
    .line 109
    const v15, 0x41870a3d    # 16.88f

    .line 110
    .line 111
    .line 112
    const/high16 v16, 0x40000000    # 2.0f

    .line 113
    .line 114
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 115
    .line 116
    .line 117
    const v17, -0x40f5c28f    # -0.54f

    .line 118
    .line 119
    .line 120
    const v18, 0x3d75c28f    # 0.06f

    .line 121
    .line 122
    .line 123
    const v13, -0x41bd70a4    # -0.19f

    .line 124
    .line 125
    .line 126
    const/4 v14, 0x0

    .line 127
    const v15, -0x41428f5c    # -0.37f

    .line 128
    .line 129
    .line 130
    const v16, 0x3ca3d70a    # 0.02f

    .line 131
    .line 132
    .line 133
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 134
    .line 135
    .line 136
    const/high16 v17, 0x41480000    # 12.5f

    .line 137
    .line 138
    const/16 v18, 0x0

    .line 139
    .line 140
    const/high16 v13, 0x416c0000    # 14.75f

    .line 141
    .line 142
    const v14, 0x3f63d70a    # 0.89f

    .line 143
    .line 144
    .line 145
    const v15, 0x415bae14    # 13.73f

    .line 146
    .line 147
    .line 148
    const/16 v16, 0x0

    .line 149
    .line 150
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 151
    .line 152
    .line 153
    const v17, -0x3feae148    # -2.33f

    .line 154
    .line 155
    .line 156
    const v18, 0x3fcb851f    # 1.59f

    .line 157
    .line 158
    .line 159
    const v13, -0x407851ec    # -1.06f

    .line 160
    .line 161
    .line 162
    const/4 v14, 0x0

    .line 163
    const v15, -0x40051eb8    # -1.96f

    .line 164
    .line 165
    .line 166
    const v16, 0x3f28f5c3    # 0.66f

    .line 167
    .line 168
    .line 169
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 170
    .line 171
    .line 172
    const/high16 v17, 0x41180000    # 9.5f

    .line 173
    .line 174
    const/high16 v18, 0x3fc00000    # 1.5f

    .line 175
    .line 176
    const v13, 0x411f5c29    # 9.96f

    .line 177
    .line 178
    .line 179
    const v14, 0x3fc3d70a    # 1.53f

    .line 180
    .line 181
    .line 182
    const v15, 0x411bae14    # 9.73f

    .line 183
    .line 184
    .line 185
    const/high16 v16, 0x3fc00000    # 1.5f

    .line 186
    .line 187
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 188
    .line 189
    .line 190
    const/high16 v17, 0x40e00000    # 7.0f

    .line 191
    .line 192
    const/high16 v18, 0x40800000    # 4.0f

    .line 193
    .line 194
    const v13, 0x4101eb85    # 8.12f

    .line 195
    .line 196
    .line 197
    const/high16 v14, 0x3fc00000    # 1.5f

    .line 198
    .line 199
    const/high16 v15, 0x40e00000    # 7.0f

    .line 200
    .line 201
    const v16, 0x4027ae14    # 2.62f

    .line 202
    .line 203
    .line 204
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 205
    .line 206
    .line 207
    const v0, 0x3f0ccccd    # 0.55f

    .line 208
    .line 209
    .line 210
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 211
    .line 212
    .line 213
    const/high16 v17, 0x40d00000    # 6.5f

    .line 214
    .line 215
    const/high16 v18, 0x40900000    # 4.5f

    .line 216
    .line 217
    const v13, 0x40dae148    # 6.84f

    .line 218
    .line 219
    .line 220
    const v14, 0x4090a3d7    # 4.52f

    .line 221
    .line 222
    .line 223
    const v15, 0x40d570a4    # 6.67f

    .line 224
    .line 225
    .line 226
    const/high16 v16, 0x40900000    # 4.5f

    .line 227
    .line 228
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 229
    .line 230
    .line 231
    const/high16 v17, 0x40800000    # 4.0f

    .line 232
    .line 233
    const/high16 v18, 0x40e00000    # 7.0f

    .line 234
    .line 235
    const v13, 0x40a3d70a    # 5.12f

    .line 236
    .line 237
    .line 238
    const/high16 v14, 0x40900000    # 4.5f

    .line 239
    .line 240
    const/high16 v15, 0x40800000    # 4.0f

    .line 241
    .line 242
    const v16, 0x40b3d70a    # 5.62f

    .line 243
    .line 244
    .line 245
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 246
    .line 247
    .line 248
    const/high16 v0, 0x41080000    # 8.5f

    .line 249
    .line 250
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 251
    .line 252
    .line 253
    const/high16 v17, 0x41080000    # 8.5f

    .line 254
    .line 255
    const/high16 v18, 0x41080000    # 8.5f

    .line 256
    .line 257
    const/4 v13, 0x0

    .line 258
    const v14, 0x4096147b    # 4.69f

    .line 259
    .line 260
    .line 261
    const v15, 0x4073d70a    # 3.81f

    .line 262
    .line 263
    .line 264
    const/high16 v16, 0x41080000    # 8.5f

    .line 265
    .line 266
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 267
    .line 268
    .line 269
    const v0, -0x3f8c28f6    # -3.81f

    .line 270
    .line 271
    .line 272
    const/high16 v2, -0x3ef80000    # -8.5f

    .line 273
    .line 274
    const/high16 v4, 0x41080000    # 8.5f

    .line 275
    .line 276
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 277
    .line 278
    .line 279
    const/high16 v0, -0x3f600000    # -5.0f

    .line 280
    .line 281
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 282
    .line 283
    .line 284
    const/high16 v17, 0x41940000    # 18.5f

    .line 285
    .line 286
    const/high16 v18, 0x41000000    # 8.0f

    .line 287
    .line 288
    const/high16 v13, 0x41a80000    # 21.0f

    .line 289
    .line 290
    const v14, 0x4111eb85    # 9.12f

    .line 291
    .line 292
    .line 293
    const v15, 0x419f0a3d    # 19.88f

    .line 294
    .line 295
    .line 296
    const/high16 v16, 0x41000000    # 8.0f

    .line 297
    .line 298
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 299
    .line 300
    .line 301
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 302
    .line 303
    .line 304
    const/high16 v0, 0x41980000    # 19.0f

    .line 305
    .line 306
    const/high16 v2, 0x41780000    # 15.5f

    .line 307
    .line 308
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 309
    .line 310
    .line 311
    const/high16 v17, -0x3f300000    # -6.5f

    .line 312
    .line 313
    const/high16 v18, 0x40d00000    # 6.5f

    .line 314
    .line 315
    const/4 v13, 0x0

    .line 316
    const v14, 0x4065c28f    # 3.59f

    .line 317
    .line 318
    .line 319
    const v15, -0x3fc5c28f    # -2.91f

    .line 320
    .line 321
    .line 322
    const/high16 v16, 0x40d00000    # 6.5f

    .line 323
    .line 324
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 325
    .line 326
    .line 327
    const v0, 0x4198b852    # 19.09f

    .line 328
    .line 329
    .line 330
    const/high16 v2, 0x40c00000    # 6.0f

    .line 331
    .line 332
    const/high16 v4, 0x41780000    # 15.5f

    .line 333
    .line 334
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 335
    .line 336
    .line 337
    const/high16 v0, 0x40e00000    # 7.0f

    .line 338
    .line 339
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 340
    .line 341
    .line 342
    const/high16 v17, 0x3f000000    # 0.5f

    .line 343
    .line 344
    const/high16 v18, -0x41000000    # -0.5f

    .line 345
    .line 346
    const v14, -0x4170a3d7    # -0.28f

    .line 347
    .line 348
    .line 349
    const v15, 0x3e6147ae    # 0.22f

    .line 350
    .line 351
    .line 352
    const/high16 v16, -0x41000000    # -0.5f

    .line 353
    .line 354
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 355
    .line 356
    .line 357
    const v0, 0x40d70a3d    # 6.72f

    .line 358
    .line 359
    .line 360
    const/high16 v2, 0x40e00000    # 7.0f

    .line 361
    .line 362
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 363
    .line 364
    .line 365
    const/high16 v0, 0x40a00000    # 5.0f

    .line 366
    .line 367
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 368
    .line 369
    .line 370
    const/high16 v0, 0x40000000    # 2.0f

    .line 371
    .line 372
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 373
    .line 374
    .line 375
    const/high16 v0, 0x40800000    # 4.0f

    .line 376
    .line 377
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 378
    .line 379
    .line 380
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 381
    .line 382
    .line 383
    const v0, 0x406e147b    # 3.72f

    .line 384
    .line 385
    .line 386
    const/high16 v2, 0x41200000    # 10.0f

    .line 387
    .line 388
    const/high16 v4, 0x40800000    # 4.0f

    .line 389
    .line 390
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 391
    .line 392
    .line 393
    const/high16 v0, 0x40e00000    # 7.0f

    .line 394
    .line 395
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 396
    .line 397
    .line 398
    const/high16 v0, 0x40000000    # 2.0f

    .line 399
    .line 400
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 401
    .line 402
    .line 403
    const/high16 v0, 0x40200000    # 2.5f

    .line 404
    .line 405
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 406
    .line 407
    .line 408
    const/high16 v17, 0x41480000    # 12.5f

    .line 409
    .line 410
    const/high16 v18, 0x40000000    # 2.0f

    .line 411
    .line 412
    const/high16 v13, 0x41400000    # 12.0f

    .line 413
    .line 414
    const v14, 0x400e147b    # 2.22f

    .line 415
    .line 416
    .line 417
    const v15, 0x4143851f    # 12.22f

    .line 418
    .line 419
    .line 420
    const/high16 v16, 0x40000000    # 2.0f

    .line 421
    .line 422
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 423
    .line 424
    .line 425
    const v0, 0x400e147b    # 2.22f

    .line 426
    .line 427
    .line 428
    const/high16 v2, 0x41500000    # 13.0f

    .line 429
    .line 430
    const/high16 v4, 0x40200000    # 2.5f

    .line 431
    .line 432
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 433
    .line 434
    .line 435
    const/high16 v0, 0x41300000    # 11.0f

    .line 436
    .line 437
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 438
    .line 439
    .line 440
    const/high16 v0, 0x40000000    # 2.0f

    .line 441
    .line 442
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 443
    .line 444
    .line 445
    const/high16 v0, 0x40900000    # 4.5f

    .line 446
    .line 447
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 448
    .line 449
    .line 450
    const/high16 v17, 0x41780000    # 15.5f

    .line 451
    .line 452
    const/high16 v18, 0x40800000    # 4.0f

    .line 453
    .line 454
    const/high16 v13, 0x41700000    # 15.0f

    .line 455
    .line 456
    const v14, 0x40870a3d    # 4.22f

    .line 457
    .line 458
    .line 459
    const v15, 0x4173851f    # 15.22f

    .line 460
    .line 461
    .line 462
    const/high16 v16, 0x40800000    # 4.0f

    .line 463
    .line 464
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 465
    .line 466
    .line 467
    const v0, 0x40870a3d    # 4.22f

    .line 468
    .line 469
    .line 470
    const/high16 v2, 0x41800000    # 16.0f

    .line 471
    .line 472
    const/high16 v4, 0x40900000    # 4.5f

    .line 473
    .line 474
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 475
    .line 476
    .line 477
    const v0, 0x410eb852    # 8.92f

    .line 478
    .line 479
    .line 480
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 481
    .line 482
    .line 483
    const/high16 v17, -0x3fc00000    # -3.0f

    .line 484
    .line 485
    const v18, 0x40928f5c    # 4.58f

    .line 486
    .line 487
    .line 488
    const v13, -0x401d70a4    # -1.77f

    .line 489
    .line 490
    .line 491
    const v14, 0x3f451eb8    # 0.77f

    .line 492
    .line 493
    .line 494
    const/high16 v15, -0x3fc00000    # -3.0f

    .line 495
    .line 496
    const v16, 0x4021eb85    # 2.53f

    .line 497
    .line 498
    .line 499
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 500
    .line 501
    .line 502
    const/high16 v0, 0x40000000    # 2.0f

    .line 503
    .line 504
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 505
    .line 506
    .line 507
    const/high16 v17, 0x40400000    # 3.0f

    .line 508
    .line 509
    const/high16 v18, -0x3fc00000    # -3.0f

    .line 510
    .line 511
    const/4 v13, 0x0

    .line 512
    const v14, -0x402b851f    # -1.66f

    .line 513
    .line 514
    .line 515
    const v15, 0x3fab851f    # 1.34f

    .line 516
    .line 517
    .line 518
    const/high16 v16, -0x3fc00000    # -3.0f

    .line 519
    .line 520
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 521
    .line 522
    .line 523
    const/high16 v0, -0x3f700000    # -4.5f

    .line 524
    .line 525
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 526
    .line 527
    .line 528
    const/high16 v17, 0x3f000000    # 0.5f

    .line 529
    .line 530
    const/high16 v18, -0x41000000    # -0.5f

    .line 531
    .line 532
    const v14, -0x4170a3d7    # -0.28f

    .line 533
    .line 534
    .line 535
    const v15, 0x3e6147ae    # 0.22f

    .line 536
    .line 537
    .line 538
    const/high16 v16, -0x41000000    # -0.5f

    .line 539
    .line 540
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 541
    .line 542
    .line 543
    const v0, 0x3e6147ae    # 0.22f

    .line 544
    .line 545
    .line 546
    const/high16 v2, 0x3f000000    # 0.5f

    .line 547
    .line 548
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 549
    .line 550
    .line 551
    const/high16 v0, 0x41780000    # 15.5f

    .line 552
    .line 553
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 554
    .line 555
    .line 556
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 557
    .line 558
    .line 559
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 560
    .line 561
    .line 562
    move-result-object v2

    .line 563
    const/16 v16, 0x3800

    .line 564
    .line 565
    const/16 v17, 0x0

    .line 566
    .line 567
    const/high16 v6, 0x3f800000    # 1.0f

    .line 568
    .line 569
    const/high16 v8, 0x3f800000    # 1.0f

    .line 570
    .line 571
    const/4 v7, 0x0

    .line 572
    const/high16 v9, 0x3f800000    # 1.0f

    .line 573
    .line 574
    const/high16 v12, 0x3f800000    # 1.0f

    .line 575
    .line 576
    const/4 v14, 0x0

    .line 577
    const/4 v15, 0x0

    .line 578
    const-string v4, ""

    .line 579
    .line 580
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 581
    .line 582
    .line 583
    move-result-object v0

    .line 584
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 585
    .line 586
    .line 587
    move-result-object v0

    .line 588
    sput-object v0, Landroidx/compose/material/icons/outlined/FrontHandKt;->_frontHand:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 589
    .line 590
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 591
    .line 592
    .line 593
    return-object v0
.end method
