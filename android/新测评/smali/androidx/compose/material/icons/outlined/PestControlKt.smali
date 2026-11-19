.class public final Landroidx/compose/material/icons/outlined/PestControlKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_pestControl",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "PestControl",
        "Landroidx/compose/material/icons/Icons$Outlined;",
        "getPestControl",
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
        "SMAP\nPestControl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PestControl.kt\nandroidx/compose/material/icons/outlined/PestControlKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,93:1\n212#2,12:94\n233#2,18:107\n253#2:144\n233#2,18:145\n253#2:182\n174#3:106\n705#4,2:125\n717#4,2:127\n719#4,11:133\n705#4,2:163\n717#4,2:165\n719#4,11:171\n72#5,4:129\n72#5,4:167\n*S KotlinDebug\n*F\n+ 1 PestControl.kt\nandroidx/compose/material/icons/outlined/PestControlKt\n*L\n29#1:94,12\n30#1:107,18\n30#1:144\n81#1:145,18\n81#1:182\n29#1:106\n30#1:125,2\n30#1:127,2\n30#1:133,11\n81#1:163,2\n81#1:165,2\n81#1:171,11\n30#1:129,4\n81#1:167,4\n*E\n"
    }
.end annotation


# static fields
.field private static _pestControl:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getPestControl(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/outlined/PestControlKt;->_pestControl:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Outlined.PestControl"

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
    const/high16 v4, 0x41700000    # 15.0f

    .line 71
    .line 72
    const/high16 v6, 0x41a80000    # 21.0f

    .line 73
    .line 74
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v4, -0x40000000    # -2.0f

    .line 78
    .line 79
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 80
    .line 81
    .line 82
    const v4, -0x3fbb851f    # -3.07f

    .line 83
    .line 84
    .line 85
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 86
    .line 87
    .line 88
    const v25, -0x419eb852    # -0.22f

    .line 89
    .line 90
    .line 91
    const v26, -0x406e147b    # -1.14f

    .line 92
    .line 93
    .line 94
    const v21, -0x42b33333    # -0.05f

    .line 95
    .line 96
    .line 97
    const v22, -0x413851ec    # -0.39f

    .line 98
    .line 99
    .line 100
    const v23, -0x420a3d71    # -0.12f

    .line 101
    .line 102
    .line 103
    const v24, -0x40bae148    # -0.77f

    .line 104
    .line 105
    .line 106
    move-object/from16 v20, v2

    .line 107
    .line 108
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 109
    .line 110
    .line 111
    const v4, -0x404147ae    # -1.49f

    .line 112
    .line 113
    .line 114
    const v6, 0x40251eb8    # 2.58f

    .line 115
    .line 116
    .line 117
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 118
    .line 119
    .line 120
    const v4, -0x40228f5c    # -1.73f

    .line 121
    .line 122
    .line 123
    const/high16 v6, -0x40800000    # -1.0f

    .line 124
    .line 125
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 126
    .line 127
    .line 128
    const v4, 0x41875c29    # 16.92f

    .line 129
    .line 130
    .line 131
    const/high16 v6, 0x41200000    # 10.0f

    .line 132
    .line 133
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 134
    .line 135
    .line 136
    const v25, -0x40828f5c    # -0.99f

    .line 137
    .line 138
    .line 139
    const v26, -0x405ae148    # -1.29f

    .line 140
    .line 141
    .line 142
    const v21, -0x4170a3d7    # -0.28f

    .line 143
    .line 144
    .line 145
    const v22, -0x410a3d71    # -0.48f

    .line 146
    .line 147
    .line 148
    const v23, -0x40e147ae    # -0.62f

    .line 149
    .line 150
    .line 151
    const v24, -0x40970a3d    # -0.91f

    .line 152
    .line 153
    .line 154
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 155
    .line 156
    .line 157
    const v25, -0x40eb851f    # -0.58f

    .line 158
    .line 159
    .line 160
    const v26, -0x3fc70a3d    # -2.89f

    .line 161
    .line 162
    .line 163
    const v21, 0x3dcccccd    # 0.1f

    .line 164
    .line 165
    .line 166
    const v22, -0x40f0a3d7    # -0.56f

    .line 167
    .line 168
    .line 169
    const v23, 0x3e4ccccd    # 0.2f

    .line 170
    .line 171
    .line 172
    const v24, -0x4027ae14    # -1.69f

    .line 173
    .line 174
    .line 175
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 176
    .line 177
    .line 178
    const/high16 v4, 0x41880000    # 17.0f

    .line 179
    .line 180
    const v6, 0x408570a4    # 4.17f

    .line 181
    .line 182
    .line 183
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 184
    .line 185
    .line 186
    const v4, -0x404b851f    # -1.41f

    .line 187
    .line 188
    .line 189
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 190
    .line 191
    .line 192
    const v4, -0x4023d70a    # -1.72f

    .line 193
    .line 194
    .line 195
    const v6, 0x3fdc28f6    # 1.72f

    .line 196
    .line 197
    .line 198
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 199
    .line 200
    .line 201
    const v25, -0x3f9147ae    # -3.73f

    .line 202
    .line 203
    .line 204
    const/16 v26, 0x0

    .line 205
    .line 206
    const v21, -0x4028f5c3    # -1.68f

    .line 207
    .line 208
    .line 209
    const v22, -0x409c28f6    # -0.89f

    .line 210
    .line 211
    .line 212
    const v23, -0x3fb9999a    # -3.1f

    .line 213
    .line 214
    .line 215
    const v24, -0x41570a3d    # -0.33f

    .line 216
    .line 217
    .line 218
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 219
    .line 220
    .line 221
    const v4, 0x41068f5c    # 8.41f

    .line 222
    .line 223
    .line 224
    const v6, 0x4030a3d7    # 2.76f

    .line 225
    .line 226
    .line 227
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 228
    .line 229
    .line 230
    const/high16 v4, 0x40e00000    # 7.0f

    .line 231
    .line 232
    const v6, 0x408570a4    # 4.17f

    .line 233
    .line 234
    .line 235
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 236
    .line 237
    .line 238
    const v4, 0x3fd33333    # 1.65f

    .line 239
    .line 240
    .line 241
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 242
    .line 243
    .line 244
    const v25, -0x40eb851f    # -0.58f

    .line 245
    .line 246
    .line 247
    const v26, 0x4038f5c3    # 2.89f

    .line 248
    .line 249
    .line 250
    const v21, -0x40b851ec    # -0.78f

    .line 251
    .line 252
    .line 253
    const v22, 0x3f99999a    # 1.2f

    .line 254
    .line 255
    .line 256
    const v23, -0x40d1eb85    # -0.68f

    .line 257
    .line 258
    .line 259
    const v24, 0x4015c28f    # 2.34f

    .line 260
    .line 261
    .line 262
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 263
    .line 264
    .line 265
    const v25, 0x40e28f5c    # 7.08f

    .line 266
    .line 267
    .line 268
    const/high16 v26, 0x41200000    # 10.0f

    .line 269
    .line 270
    const v21, 0x40f66666    # 7.7f

    .line 271
    .line 272
    .line 273
    const v22, 0x4111999a    # 9.1f

    .line 274
    .line 275
    .line 276
    const v23, 0x40eb851f    # 7.36f

    .line 277
    .line 278
    .line 279
    const v24, 0x41187ae1    # 9.53f

    .line 280
    .line 281
    .line 282
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 283
    .line 284
    .line 285
    const v4, 0x4096b852    # 4.71f

    .line 286
    .line 287
    .line 288
    const v6, 0x410a147b    # 8.63f

    .line 289
    .line 290
    .line 291
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 292
    .line 293
    .line 294
    const v4, 0x3fdd70a4    # 1.73f

    .line 295
    .line 296
    .line 297
    const/high16 v6, -0x40800000    # -1.0f

    .line 298
    .line 299
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 300
    .line 301
    .line 302
    const v4, 0x3fbeb852    # 1.49f

    .line 303
    .line 304
    .line 305
    const v6, 0x40251eb8    # 2.58f

    .line 306
    .line 307
    .line 308
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 309
    .line 310
    .line 311
    const v25, -0x419eb852    # -0.22f

    .line 312
    .line 313
    .line 314
    const v26, 0x3f91eb85    # 1.14f

    .line 315
    .line 316
    .line 317
    const v21, -0x42333333    # -0.1f

    .line 318
    .line 319
    .line 320
    const v22, 0x3ebd70a4    # 0.37f

    .line 321
    .line 322
    .line 323
    const v23, -0x41d1eb85    # -0.17f

    .line 324
    .line 325
    .line 326
    const/high16 v24, 0x3f400000    # 0.75f

    .line 327
    .line 328
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 329
    .line 330
    .line 331
    const/high16 v4, 0x40400000    # 3.0f

    .line 332
    .line 333
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 334
    .line 335
    .line 336
    const/high16 v4, 0x40000000    # 2.0f

    .line 337
    .line 338
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 339
    .line 340
    .line 341
    const v4, 0x40447ae1    # 3.07f

    .line 342
    .line 343
    .line 344
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 345
    .line 346
    .line 347
    const v25, 0x3e6147ae    # 0.22f

    .line 348
    .line 349
    .line 350
    const v21, 0x3d4ccccd    # 0.05f

    .line 351
    .line 352
    .line 353
    const v22, 0x3ec7ae14    # 0.39f

    .line 354
    .line 355
    .line 356
    const v23, 0x3df5c28f    # 0.12f

    .line 357
    .line 358
    .line 359
    const v24, 0x3f451eb8    # 0.77f

    .line 360
    .line 361
    .line 362
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 363
    .line 364
    .line 365
    const v4, -0x3fdae148    # -2.58f

    .line 366
    .line 367
    .line 368
    const v6, 0x3fbeb852    # 1.49f

    .line 369
    .line 370
    .line 371
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 372
    .line 373
    .line 374
    const/high16 v4, 0x3f800000    # 1.0f

    .line 375
    .line 376
    const v6, 0x3fdd70a4    # 1.73f

    .line 377
    .line 378
    .line 379
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 380
    .line 381
    .line 382
    const v4, 0x40e28f5c    # 7.08f

    .line 383
    .line 384
    .line 385
    const/high16 v6, 0x41900000    # 18.0f

    .line 386
    .line 387
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 388
    .line 389
    .line 390
    const v25, 0x409d70a4    # 4.92f

    .line 391
    .line 392
    .line 393
    const/high16 v26, 0x40400000    # 3.0f

    .line 394
    .line 395
    const v21, 0x3f8a3d71    # 1.08f

    .line 396
    .line 397
    .line 398
    const v22, 0x3fe7ae14    # 1.81f

    .line 399
    .line 400
    .line 401
    const v23, 0x403851ec    # 2.88f

    .line 402
    .line 403
    .line 404
    const/high16 v24, 0x40400000    # 3.0f

    .line 405
    .line 406
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 407
    .line 408
    .line 409
    const v4, 0x409d70a4    # 4.92f

    .line 410
    .line 411
    .line 412
    const/high16 v6, -0x3fc00000    # -3.0f

    .line 413
    .line 414
    const v7, 0x4075c28f    # 3.84f

    .line 415
    .line 416
    .line 417
    const v8, -0x4067ae14    # -1.19f

    .line 418
    .line 419
    .line 420
    invoke-virtual {v2, v7, v8, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 421
    .line 422
    .line 423
    const v4, 0x4017ae14    # 2.37f

    .line 424
    .line 425
    .line 426
    const v6, 0x3faf5c29    # 1.37f

    .line 427
    .line 428
    .line 429
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 430
    .line 431
    .line 432
    const/high16 v4, 0x3f800000    # 1.0f

    .line 433
    .line 434
    const v6, -0x40228f5c    # -1.73f

    .line 435
    .line 436
    .line 437
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 438
    .line 439
    .line 440
    const v4, -0x3fdae148    # -2.58f

    .line 441
    .line 442
    .line 443
    const v6, -0x404147ae    # -1.49f

    .line 444
    .line 445
    .line 446
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 447
    .line 448
    .line 449
    const v25, 0x3e6147ae    # 0.22f

    .line 450
    .line 451
    .line 452
    const v26, -0x406e147b    # -1.14f

    .line 453
    .line 454
    .line 455
    const v21, 0x3dcccccd    # 0.1f

    .line 456
    .line 457
    .line 458
    const v22, -0x41428f5c    # -0.37f

    .line 459
    .line 460
    .line 461
    const v23, 0x3e2e147b    # 0.17f

    .line 462
    .line 463
    .line 464
    const/high16 v24, -0x40c00000    # -0.75f

    .line 465
    .line 466
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 467
    .line 468
    .line 469
    const/high16 v4, 0x41a80000    # 21.0f

    .line 470
    .line 471
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 472
    .line 473
    .line 474
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 475
    .line 476
    .line 477
    const/high16 v4, 0x40c00000    # 6.0f

    .line 478
    .line 479
    const/high16 v6, 0x41400000    # 12.0f

    .line 480
    .line 481
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 482
    .line 483
    .line 484
    const v25, 0x3ff0a3d7    # 1.88f

    .line 485
    .line 486
    .line 487
    const v26, 0x3fae147b    # 1.36f

    .line 488
    .line 489
    .line 490
    const v21, 0x3f6147ae    # 0.88f

    .line 491
    .line 492
    .line 493
    const/16 v22, 0x0

    .line 494
    .line 495
    const v23, 0x3fcf5c29    # 1.62f

    .line 496
    .line 497
    .line 498
    const v24, 0x3f11eb85    # 0.57f

    .line 499
    .line 500
    .line 501
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 502
    .line 503
    .line 504
    const/high16 v25, 0x41400000    # 12.0f

    .line 505
    .line 506
    const/high16 v26, 0x40e00000    # 7.0f

    .line 507
    .line 508
    const v21, 0x4154a3d7    # 13.29f

    .line 509
    .line 510
    .line 511
    const v22, 0x40e428f6    # 7.13f

    .line 512
    .line 513
    .line 514
    const v23, 0x414a8f5c    # 12.66f

    .line 515
    .line 516
    .line 517
    const/high16 v24, 0x40e00000    # 7.0f

    .line 518
    .line 519
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 520
    .line 521
    .line 522
    const v4, -0x400f5c29    # -1.88f

    .line 523
    .line 524
    .line 525
    const v6, 0x3eb851ec    # 0.36f

    .line 526
    .line 527
    .line 528
    const v7, -0x405ae148    # -1.29f

    .line 529
    .line 530
    .line 531
    const v8, 0x3e051eb8    # 0.13f

    .line 532
    .line 533
    .line 534
    invoke-virtual {v2, v7, v8, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 535
    .line 536
    .line 537
    const/high16 v26, 0x40c00000    # 6.0f

    .line 538
    .line 539
    const v21, 0x4126147b    # 10.38f

    .line 540
    .line 541
    .line 542
    const v22, 0x40d23d71    # 6.57f

    .line 543
    .line 544
    .line 545
    const v23, 0x4131eb85    # 11.12f

    .line 546
    .line 547
    .line 548
    const/high16 v24, 0x40c00000    # 6.0f

    .line 549
    .line 550
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 551
    .line 552
    .line 553
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 554
    .line 555
    .line 556
    const/high16 v4, 0x41980000    # 19.0f

    .line 557
    .line 558
    const/high16 v6, 0x41400000    # 12.0f

    .line 559
    .line 560
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 561
    .line 562
    .line 563
    const/high16 v25, -0x3f800000    # -4.0f

    .line 564
    .line 565
    const/high16 v26, -0x3f600000    # -5.0f

    .line 566
    .line 567
    const v21, -0x3ff28f5c    # -2.21f

    .line 568
    .line 569
    .line 570
    const/16 v22, 0x0

    .line 571
    .line 572
    const/high16 v23, -0x3f800000    # -4.0f

    .line 573
    .line 574
    const v24, -0x3ff0a3d7    # -2.24f

    .line 575
    .line 576
    .line 577
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 578
    .line 579
    .line 580
    const v4, 0x3fe51eb8    # 1.79f

    .line 581
    .line 582
    .line 583
    const/high16 v6, -0x3f600000    # -5.0f

    .line 584
    .line 585
    const/high16 v7, 0x40800000    # 4.0f

    .line 586
    .line 587
    invoke-virtual {v2, v4, v6, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 588
    .line 589
    .line 590
    const v4, 0x400f5c29    # 2.24f

    .line 591
    .line 592
    .line 593
    const/high16 v6, 0x40a00000    # 5.0f

    .line 594
    .line 595
    invoke-virtual {v2, v7, v4, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 596
    .line 597
    .line 598
    const v4, 0x41635c29    # 14.21f

    .line 599
    .line 600
    .line 601
    const/high16 v6, 0x41980000    # 19.0f

    .line 602
    .line 603
    const/high16 v7, 0x41400000    # 12.0f

    .line 604
    .line 605
    invoke-virtual {v2, v4, v6, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 606
    .line 607
    .line 608
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 609
    .line 610
    .line 611
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 612
    .line 613
    .line 614
    move-result-object v2

    .line 615
    const/16 v16, 0x3800

    .line 616
    .line 617
    const/16 v17, 0x0

    .line 618
    .line 619
    const/high16 v6, 0x3f800000    # 1.0f

    .line 620
    .line 621
    const/high16 v8, 0x3f800000    # 1.0f

    .line 622
    .line 623
    const/4 v7, 0x0

    .line 624
    const/high16 v9, 0x3f800000    # 1.0f

    .line 625
    .line 626
    const/high16 v12, 0x3f800000    # 1.0f

    .line 627
    .line 628
    const/4 v13, 0x0

    .line 629
    const/4 v14, 0x0

    .line 630
    const/4 v15, 0x0

    .line 631
    const-string v4, ""

    .line 632
    .line 633
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 634
    .line 635
    .line 636
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 637
    .line 638
    .line 639
    move-result v3

    .line 640
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 641
    .line 642
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 643
    .line 644
    .line 645
    move-result-wide v6

    .line 646
    const/4 v0, 0x0

    .line 647
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 648
    .line 649
    .line 650
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 651
    .line 652
    .line 653
    move-result v10

    .line 654
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 655
    .line 656
    .line 657
    move-result v11

    .line 658
    new-instance v0, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 659
    .line 660
    invoke-direct {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 661
    .line 662
    .line 663
    const/high16 v2, 0x41300000    # 11.0f

    .line 664
    .line 665
    invoke-virtual {v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 666
    .line 667
    .line 668
    const/high16 v2, 0x40000000    # 2.0f

    .line 669
    .line 670
    invoke-virtual {v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 671
    .line 672
    .line 673
    const/high16 v2, 0x40c00000    # 6.0f

    .line 674
    .line 675
    invoke-virtual {v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 676
    .line 677
    .line 678
    const/high16 v2, -0x40000000    # -2.0f

    .line 679
    .line 680
    invoke-virtual {v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 681
    .line 682
    .line 683
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 684
    .line 685
    .line 686
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 687
    .line 688
    .line 689
    move-result-object v2

    .line 690
    const/high16 v6, 0x3f800000    # 1.0f

    .line 691
    .line 692
    const/4 v7, 0x0

    .line 693
    const-string v4, ""

    .line 694
    .line 695
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 696
    .line 697
    .line 698
    move-result-object v0

    .line 699
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 700
    .line 701
    .line 702
    move-result-object v0

    .line 703
    sput-object v0, Landroidx/compose/material/icons/outlined/PestControlKt;->_pestControl:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 704
    .line 705
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 706
    .line 707
    .line 708
    return-object v0
.end method
