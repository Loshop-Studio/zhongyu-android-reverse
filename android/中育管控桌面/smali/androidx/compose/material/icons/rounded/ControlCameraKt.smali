.class public final Landroidx/compose/material/icons/rounded/ControlCameraKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_controlCamera",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "ControlCamera",
        "Landroidx/compose/material/icons/Icons$Rounded;",
        "getControlCamera",
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
        "SMAP\nControlCamera.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ControlCamera.kt\nandroidx/compose/material/icons/rounded/ControlCameraKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,87:1\n212#2,12:88\n233#2,18:101\n253#2:138\n233#2,18:139\n253#2:176\n174#3:100\n705#4,2:119\n717#4,2:121\n719#4,11:127\n705#4,2:157\n717#4,2:159\n719#4,11:165\n72#5,4:123\n72#5,4:161\n*S KotlinDebug\n*F\n+ 1 ControlCamera.kt\nandroidx/compose/material/icons/rounded/ControlCameraKt\n*L\n29#1:88,12\n30#1:101,18\n30#1:138\n76#1:139,18\n76#1:176\n29#1:100\n30#1:119,2\n30#1:121,2\n30#1:127,11\n76#1:157,2\n76#1:159,2\n76#1:165,11\n30#1:123,4\n76#1:161,4\n*E\n"
    }
.end annotation


# static fields
.field private static _controlCamera:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getControlCamera(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/ControlCameraKt;->_controlCamera:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.ControlCamera"

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
    const v4, 0x4094cccd    # 4.65f

    .line 71
    .line 72
    .line 73
    const v6, 0x4115999a    # 9.35f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v4, 0x4134cccd    # 11.3f

    .line 80
    .line 81
    .line 82
    const v6, 0x402ccccd    # 2.7f

    .line 83
    .line 84
    .line 85
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 86
    .line 87
    .line 88
    const/16 v25, 0x0

    .line 89
    .line 90
    const v26, 0x3fb47ae1    # 1.41f

    .line 91
    .line 92
    .line 93
    const v21, -0x413851ec    # -0.39f

    .line 94
    .line 95
    .line 96
    const v22, 0x3ec7ae14    # 0.39f

    .line 97
    .line 98
    .line 99
    const v23, -0x413851ec    # -0.39f

    .line 100
    .line 101
    .line 102
    const v24, 0x3f828f5c    # 1.02f

    .line 103
    .line 104
    .line 105
    move-object/from16 v20, v2

    .line 106
    .line 107
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 108
    .line 109
    .line 110
    const v4, 0x3ff9999a    # 1.95f

    .line 111
    .line 112
    .line 113
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 114
    .line 115
    .line 116
    const v25, 0x3fe28f5c    # 1.77f

    .line 117
    .line 118
    .line 119
    const/16 v26, 0x0

    .line 120
    .line 121
    const v21, 0x3efae148    # 0.49f

    .line 122
    .line 123
    .line 124
    const v22, 0x3efae148    # 0.49f

    .line 125
    .line 126
    .line 127
    const v23, 0x3fa3d70a    # 1.28f

    .line 128
    .line 129
    .line 130
    const v24, 0x3efae148    # 0.49f

    .line 131
    .line 132
    .line 133
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 134
    .line 135
    .line 136
    const/16 v25, 0x0

    .line 137
    .line 138
    const v26, -0x401eb852    # -1.76f

    .line 139
    .line 140
    .line 141
    const v21, 0x3ef5c28f    # 0.48f

    .line 142
    .line 143
    .line 144
    const v22, -0x41051eb8    # -0.49f

    .line 145
    .line 146
    .line 147
    const v23, 0x3ef5c28f    # 0.48f

    .line 148
    .line 149
    .line 150
    const v24, -0x405d70a4    # -1.27f

    .line 151
    .line 152
    .line 153
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 154
    .line 155
    .line 156
    const v4, -0x4099999a    # -0.9f

    .line 157
    .line 158
    .line 159
    const v6, -0x409eb852    # -0.88f

    .line 160
    .line 161
    .line 162
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 163
    .line 164
    .line 165
    const v4, -0x409c28f6    # -0.89f

    .line 166
    .line 167
    .line 168
    const v6, 0x3f6147ae    # 0.88f

    .line 169
    .line 170
    .line 171
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 172
    .line 173
    .line 174
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 175
    .line 176
    .line 177
    const v4, -0x41051eb8    # -0.49f

    .line 178
    .line 179
    .line 180
    const v6, -0x401d70a4    # -1.77f

    .line 181
    .line 182
    .line 183
    const/4 v7, 0x0

    .line 184
    const v8, -0x405c28f6    # -1.28f

    .line 185
    .line 186
    .line 187
    invoke-virtual {v2, v8, v4, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 188
    .line 189
    .line 190
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 191
    .line 192
    .line 193
    const v4, 0x418ca3d7    # 17.58f

    .line 194
    .line 195
    .line 196
    const v6, 0x4115999a    # 9.35f

    .line 197
    .line 198
    .line 199
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 200
    .line 201
    .line 202
    const v26, 0x3fe147ae    # 1.76f

    .line 203
    .line 204
    .line 205
    const v21, -0x410a3d71    # -0.48f

    .line 206
    .line 207
    .line 208
    const v22, 0x3efae148    # 0.49f

    .line 209
    .line 210
    .line 211
    const v23, -0x410a3d71    # -0.48f

    .line 212
    .line 213
    .line 214
    const v24, 0x3fa28f5c    # 1.27f

    .line 215
    .line 216
    .line 217
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 218
    .line 219
    .line 220
    const v4, 0x3f63d70a    # 0.89f

    .line 221
    .line 222
    .line 223
    const v6, 0x3f6147ae    # 0.88f

    .line 224
    .line 225
    .line 226
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 227
    .line 228
    .line 229
    const v6, -0x409eb852    # -0.88f

    .line 230
    .line 231
    .line 232
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 233
    .line 234
    .line 235
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 236
    .line 237
    .line 238
    const v25, 0x3fe28f5c    # 1.77f

    .line 239
    .line 240
    .line 241
    const/16 v26, 0x0

    .line 242
    .line 243
    const v21, 0x3efae148    # 0.49f

    .line 244
    .line 245
    .line 246
    const v23, 0x3fa3d70a    # 1.28f

    .line 247
    .line 248
    .line 249
    const v24, 0x3efae148    # 0.49f

    .line 250
    .line 251
    .line 252
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 253
    .line 254
    .line 255
    const v4, -0x40066666    # -1.95f

    .line 256
    .line 257
    .line 258
    const v6, 0x3ff9999a    # 1.95f

    .line 259
    .line 260
    .line 261
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 262
    .line 263
    .line 264
    const/16 v25, 0x0

    .line 265
    .line 266
    const v26, -0x404b851f    # -1.41f

    .line 267
    .line 268
    .line 269
    const v21, 0x3ec7ae14    # 0.39f

    .line 270
    .line 271
    .line 272
    const v22, -0x413851ec    # -0.39f

    .line 273
    .line 274
    .line 275
    const v23, 0x3ec7ae14    # 0.39f

    .line 276
    .line 277
    .line 278
    const v24, -0x407d70a4    # -1.02f

    .line 279
    .line 280
    .line 281
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 282
    .line 283
    .line 284
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 285
    .line 286
    .line 287
    const v25, -0x401d70a4    # -1.77f

    .line 288
    .line 289
    .line 290
    const v26, 0x3c23d70a    # 0.01f

    .line 291
    .line 292
    .line 293
    const v21, -0x41051eb8    # -0.49f

    .line 294
    .line 295
    .line 296
    const v22, -0x410a3d71    # -0.48f

    .line 297
    .line 298
    .line 299
    const v23, -0x405ae148    # -1.29f

    .line 300
    .line 301
    .line 302
    const v24, -0x410a3d71    # -0.48f

    .line 303
    .line 304
    .line 305
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 306
    .line 307
    .line 308
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 309
    .line 310
    .line 311
    const v4, 0x4193ae14    # 18.46f

    .line 312
    .line 313
    .line 314
    const/high16 v6, 0x41400000    # 12.0f

    .line 315
    .line 316
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 317
    .line 318
    .line 319
    const v4, -0x409c28f6    # -0.89f

    .line 320
    .line 321
    .line 322
    const v6, -0x409eb852    # -0.88f

    .line 323
    .line 324
    .line 325
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 326
    .line 327
    .line 328
    const v25, -0x401eb852    # -1.76f

    .line 329
    .line 330
    .line 331
    const/16 v26, 0x0

    .line 332
    .line 333
    const v23, -0x405d70a4    # -1.27f

    .line 334
    .line 335
    .line 336
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 337
    .line 338
    .line 339
    const/16 v25, 0x0

    .line 340
    .line 341
    const v26, 0x3fe28f5c    # 1.77f

    .line 342
    .line 343
    .line 344
    const v22, 0x3efae148    # 0.49f

    .line 345
    .line 346
    .line 347
    const v23, -0x41051eb8    # -0.49f

    .line 348
    .line 349
    .line 350
    const v24, 0x3fa3d70a    # 1.28f

    .line 351
    .line 352
    .line 353
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 354
    .line 355
    .line 356
    const v4, 0x3ff9999a    # 1.95f

    .line 357
    .line 358
    .line 359
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 360
    .line 361
    .line 362
    const v25, 0x3fb47ae1    # 1.41f

    .line 363
    .line 364
    .line 365
    const/16 v26, 0x0

    .line 366
    .line 367
    const v21, 0x3ec7ae14    # 0.39f

    .line 368
    .line 369
    .line 370
    const v22, 0x3ec7ae14    # 0.39f

    .line 371
    .line 372
    .line 373
    const v23, 0x3f828f5c    # 1.02f

    .line 374
    .line 375
    .line 376
    const v24, 0x3ec7ae14    # 0.39f

    .line 377
    .line 378
    .line 379
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 380
    .line 381
    .line 382
    const v4, -0x40066666    # -1.95f

    .line 383
    .line 384
    .line 385
    const v6, 0x3ff9999a    # 1.95f

    .line 386
    .line 387
    .line 388
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 389
    .line 390
    .line 391
    const/16 v25, 0x0

    .line 392
    .line 393
    const v26, -0x401d70a4    # -1.77f

    .line 394
    .line 395
    .line 396
    const v21, 0x3efae148    # 0.49f

    .line 397
    .line 398
    .line 399
    const v22, -0x41051eb8    # -0.49f

    .line 400
    .line 401
    .line 402
    const v23, 0x3efae148    # 0.49f

    .line 403
    .line 404
    .line 405
    const v24, -0x405c28f6    # -1.28f

    .line 406
    .line 407
    .line 408
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 409
    .line 410
    .line 411
    const v25, -0x401eb852    # -1.76f

    .line 412
    .line 413
    .line 414
    const/16 v26, 0x0

    .line 415
    .line 416
    const v21, -0x41051eb8    # -0.49f

    .line 417
    .line 418
    .line 419
    const v22, -0x410a3d71    # -0.48f

    .line 420
    .line 421
    .line 422
    const v23, -0x405d70a4    # -1.27f

    .line 423
    .line 424
    .line 425
    const v24, -0x410a3d71    # -0.48f

    .line 426
    .line 427
    .line 428
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 429
    .line 430
    .line 431
    const v4, -0x4099999a    # -0.9f

    .line 432
    .line 433
    .line 434
    const v6, 0x3f6147ae    # 0.88f

    .line 435
    .line 436
    .line 437
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 438
    .line 439
    .line 440
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 441
    .line 442
    .line 443
    const v4, 0x40cd70a4    # 6.42f

    .line 444
    .line 445
    .line 446
    const v6, 0x4115999a    # 9.35f

    .line 447
    .line 448
    .line 449
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 450
    .line 451
    .line 452
    const v25, 0x3fe147ae    # 1.76f

    .line 453
    .line 454
    .line 455
    const v21, 0x3efae148    # 0.49f

    .line 456
    .line 457
    .line 458
    const v22, 0x3ef5c28f    # 0.48f

    .line 459
    .line 460
    .line 461
    const v23, 0x3fa28f5c    # 1.27f

    .line 462
    .line 463
    .line 464
    const v24, 0x3ef5c28f    # 0.48f

    .line 465
    .line 466
    .line 467
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 468
    .line 469
    .line 470
    const v4, 0x3f63d70a    # 0.89f

    .line 471
    .line 472
    .line 473
    const v6, -0x409eb852    # -0.88f

    .line 474
    .line 475
    .line 476
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 477
    .line 478
    .line 479
    const v6, 0x3f6147ae    # 0.88f

    .line 480
    .line 481
    .line 482
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 483
    .line 484
    .line 485
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 486
    .line 487
    .line 488
    const/16 v25, 0x0

    .line 489
    .line 490
    const v26, -0x401d70a4    # -1.77f

    .line 491
    .line 492
    .line 493
    const v22, -0x41051eb8    # -0.49f

    .line 494
    .line 495
    .line 496
    const v23, 0x3efae148    # 0.49f

    .line 497
    .line 498
    .line 499
    const v24, -0x405c28f6    # -1.28f

    .line 500
    .line 501
    .line 502
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 503
    .line 504
    .line 505
    const v4, 0x414b3333    # 12.7f

    .line 506
    .line 507
    .line 508
    const v6, 0x402ccccd    # 2.7f

    .line 509
    .line 510
    .line 511
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 512
    .line 513
    .line 514
    const v25, -0x404b851f    # -1.41f

    .line 515
    .line 516
    .line 517
    const/16 v26, 0x0

    .line 518
    .line 519
    const v21, -0x413851ec    # -0.39f

    .line 520
    .line 521
    .line 522
    const v22, -0x413851ec    # -0.39f

    .line 523
    .line 524
    .line 525
    const v23, -0x407d70a4    # -1.02f

    .line 526
    .line 527
    .line 528
    const v24, -0x413851ec    # -0.39f

    .line 529
    .line 530
    .line 531
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 532
    .line 533
    .line 534
    const v4, 0x4094cccd    # 4.65f

    .line 535
    .line 536
    .line 537
    const v6, 0x4115999a    # 9.35f

    .line 538
    .line 539
    .line 540
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 541
    .line 542
    .line 543
    const/16 v25, 0x0

    .line 544
    .line 545
    const v26, 0x3fe28f5c    # 1.77f

    .line 546
    .line 547
    .line 548
    const v21, -0x41051eb8    # -0.49f

    .line 549
    .line 550
    .line 551
    const v22, 0x3efae148    # 0.49f

    .line 552
    .line 553
    .line 554
    const v23, -0x41051eb8    # -0.49f

    .line 555
    .line 556
    .line 557
    const v24, 0x3fa51eb8    # 1.29f

    .line 558
    .line 559
    .line 560
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 561
    .line 562
    .line 563
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 564
    .line 565
    .line 566
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 567
    .line 568
    .line 569
    move-result-object v2

    .line 570
    const/16 v16, 0x3800

    .line 571
    .line 572
    const/16 v17, 0x0

    .line 573
    .line 574
    const/high16 v6, 0x3f800000    # 1.0f

    .line 575
    .line 576
    const/high16 v8, 0x3f800000    # 1.0f

    .line 577
    .line 578
    const/4 v7, 0x0

    .line 579
    const/high16 v9, 0x3f800000    # 1.0f

    .line 580
    .line 581
    const/high16 v12, 0x3f800000    # 1.0f

    .line 582
    .line 583
    const/4 v13, 0x0

    .line 584
    const/4 v14, 0x0

    .line 585
    const/4 v15, 0x0

    .line 586
    const-string v4, ""

    .line 587
    .line 588
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 589
    .line 590
    .line 591
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 592
    .line 593
    .line 594
    move-result v3

    .line 595
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 596
    .line 597
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 598
    .line 599
    .line 600
    move-result-wide v6

    .line 601
    const/4 v0, 0x0

    .line 602
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 603
    .line 604
    .line 605
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 606
    .line 607
    .line 608
    move-result v10

    .line 609
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 610
    .line 611
    .line 612
    move-result v11

    .line 613
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 614
    .line 615
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 616
    .line 617
    .line 618
    const/high16 v0, 0x41400000    # 12.0f

    .line 619
    .line 620
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 621
    .line 622
    .line 623
    const/high16 v0, -0x3fc00000    # -3.0f

    .line 624
    .line 625
    const/4 v2, 0x0

    .line 626
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 627
    .line 628
    .line 629
    const/high16 v18, 0x40c00000    # 6.0f

    .line 630
    .line 631
    const/16 v19, 0x0

    .line 632
    .line 633
    const/high16 v13, 0x40400000    # 3.0f

    .line 634
    .line 635
    const/high16 v14, 0x40400000    # 3.0f

    .line 636
    .line 637
    const/16 v16, 0x1

    .line 638
    .line 639
    const/16 v17, 0x1

    .line 640
    .line 641
    invoke-virtual/range {v12 .. v19}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 642
    .line 643
    .line 644
    const/high16 v18, -0x3f400000    # -6.0f

    .line 645
    .line 646
    invoke-virtual/range {v12 .. v19}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 647
    .line 648
    .line 649
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 650
    .line 651
    .line 652
    move-result-object v2

    .line 653
    const/16 v16, 0x3800

    .line 654
    .line 655
    const/16 v17, 0x0

    .line 656
    .line 657
    const/high16 v6, 0x3f800000    # 1.0f

    .line 658
    .line 659
    const/4 v7, 0x0

    .line 660
    const/high16 v12, 0x3f800000    # 1.0f

    .line 661
    .line 662
    const/4 v13, 0x0

    .line 663
    const/4 v14, 0x0

    .line 664
    const-string v4, ""

    .line 665
    .line 666
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 667
    .line 668
    .line 669
    move-result-object v0

    .line 670
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 671
    .line 672
    .line 673
    move-result-object v0

    .line 674
    sput-object v0, Landroidx/compose/material/icons/rounded/ControlCameraKt;->_controlCamera:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 675
    .line 676
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 677
    .line 678
    .line 679
    return-object v0
.end method
