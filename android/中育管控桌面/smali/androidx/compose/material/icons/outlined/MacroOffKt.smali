.class public final Landroidx/compose/material/icons/outlined/MacroOffKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_macroOff",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "MacroOff",
        "Landroidx/compose/material/icons/Icons$Outlined;",
        "getMacroOff",
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
        "SMAP\nMacroOff.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MacroOff.kt\nandroidx/compose/material/icons/outlined/MacroOffKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,123:1\n212#2,12:124\n233#2,18:137\n253#2:174\n233#2,18:175\n253#2:212\n233#2,18:213\n253#2:250\n233#2,18:251\n253#2:288\n174#3:136\n705#4,2:155\n717#4,2:157\n719#4,11:163\n705#4,2:193\n717#4,2:195\n719#4,11:201\n705#4,2:231\n717#4,2:233\n719#4,11:239\n705#4,2:269\n717#4,2:271\n719#4,11:277\n72#5,4:159\n72#5,4:197\n72#5,4:235\n72#5,4:273\n*S KotlinDebug\n*F\n+ 1 MacroOff.kt\nandroidx/compose/material/icons/outlined/MacroOffKt\n*L\n29#1:124,12\n30#1:137,18\n30#1:174\n79#1:175,18\n79#1:212\n86#1:213,18\n86#1:250\n96#1:251,18\n96#1:288\n29#1:136\n30#1:155,2\n30#1:157,2\n30#1:163,11\n79#1:193,2\n79#1:195,2\n79#1:201,11\n86#1:231,2\n86#1:233,2\n86#1:239,11\n96#1:269,2\n96#1:271,2\n96#1:277,11\n30#1:159,4\n79#1:197,4\n86#1:235,4\n96#1:273,4\n*E\n"
    }
.end annotation


# static fields
.field private static _macroOff:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getMacroOff(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/outlined/MacroOffKt;->_macroOff:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Outlined.MacroOff"

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
    const v4, 0x410a8f5c    # 8.66f

    .line 71
    .line 72
    .line 73
    const v6, 0x409dc28f    # 4.93f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v25, 0x4114cccd    # 9.3f

    .line 80
    .line 81
    .line 82
    const v26, 0x40a428f6    # 5.13f

    .line 83
    .line 84
    .line 85
    const v21, 0x410e6666    # 8.9f

    .line 86
    .line 87
    .line 88
    const v22, 0x409dc28f    # 4.93f

    .line 89
    .line 90
    .line 91
    const v23, 0x4111eb85    # 9.12f

    .line 92
    .line 93
    .line 94
    const/high16 v24, 0x40a00000    # 5.0f

    .line 95
    .line 96
    move-object/from16 v20, v2

    .line 97
    .line 98
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 99
    .line 100
    .line 101
    const v4, 0x3f4f5c29    # 0.81f

    .line 102
    .line 103
    .line 104
    const v6, 0x3f0f5c29    # 0.56f

    .line 105
    .line 106
    .line 107
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 108
    .line 109
    .line 110
    const v25, 0x41163d71    # 9.39f

    .line 111
    .line 112
    .line 113
    const v26, 0x40d1eb85    # 6.56f

    .line 114
    .line 115
    .line 116
    const v21, 0x411d1eb8    # 9.82f

    .line 117
    .line 118
    .line 119
    const v22, 0x40bdc28f    # 5.93f

    .line 120
    .line 121
    .line 122
    const v23, 0x41191eb8    # 9.57f

    .line 123
    .line 124
    .line 125
    const v24, 0x40c75c29    # 6.23f

    .line 126
    .line 127
    .line 128
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 129
    .line 130
    .line 131
    const v4, 0x3fd47ae1    # 1.66f

    .line 132
    .line 133
    .line 134
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 135
    .line 136
    .line 137
    const/high16 v25, 0x41300000    # 11.0f

    .line 138
    .line 139
    const/high16 v26, 0x41000000    # 8.0f

    .line 140
    .line 141
    const v21, 0x41307ae1    # 11.03f

    .line 142
    .line 143
    .line 144
    const v22, 0x41023d71    # 8.14f

    .line 145
    .line 146
    .line 147
    const/high16 v23, 0x41300000    # 11.0f

    .line 148
    .line 149
    const v24, 0x410147ae    # 8.08f

    .line 150
    .line 151
    .line 152
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 153
    .line 154
    .line 155
    const/high16 v25, 0x3f800000    # 1.0f

    .line 156
    .line 157
    const/high16 v26, -0x40800000    # -1.0f

    .line 158
    .line 159
    const/16 v21, 0x0

    .line 160
    .line 161
    const v22, -0x40f33333    # -0.55f

    .line 162
    .line 163
    .line 164
    const v23, 0x3ee66666    # 0.45f

    .line 165
    .line 166
    .line 167
    const/high16 v24, -0x40800000    # -1.0f

    .line 168
    .line 169
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 170
    .line 171
    .line 172
    const v4, 0x3ee66666    # 0.45f

    .line 173
    .line 174
    .line 175
    const/high16 v6, 0x3f800000    # 1.0f

    .line 176
    .line 177
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 178
    .line 179
    .line 180
    const v4, -0x4119999a    # -0.45f

    .line 181
    .line 182
    .line 183
    const/high16 v6, -0x40800000    # -1.0f

    .line 184
    .line 185
    const/high16 v7, 0x3f800000    # 1.0f

    .line 186
    .line 187
    invoke-virtual {v2, v4, v7, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 188
    .line 189
    .line 190
    const v25, -0x419eb852    # -0.22f

    .line 191
    .line 192
    .line 193
    const v26, -0x42dc28f6    # -0.04f

    .line 194
    .line 195
    .line 196
    const v21, -0x425c28f6    # -0.08f

    .line 197
    .line 198
    .line 199
    const/16 v22, 0x0

    .line 200
    .line 201
    const v23, -0x41f0a3d7    # -0.14f

    .line 202
    .line 203
    .line 204
    const v24, -0x430a3d71    # -0.03f

    .line 205
    .line 206
    .line 207
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 208
    .line 209
    .line 210
    const v4, 0x4081eb85    # 4.06f

    .line 211
    .line 212
    .line 213
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 214
    .line 215
    .line 216
    const v25, 0x402851ec    # 2.63f

    .line 217
    .line 218
    .line 219
    const v26, -0x3fba3d71    # -3.09f

    .line 220
    .line 221
    .line 222
    const v21, 0x3fbeb852    # 1.49f

    .line 223
    .line 224
    .line 225
    const v22, -0x418a3d71    # -0.24f

    .line 226
    .line 227
    .line 228
    const v23, 0x402851ec    # 2.63f

    .line 229
    .line 230
    .line 231
    const v24, -0x403c28f6    # -1.53f

    .line 232
    .line 233
    .line 234
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 235
    .line 236
    .line 237
    const v25, -0x40d47ae1    # -0.67f

    .line 238
    .line 239
    .line 240
    const v26, -0x4008f5c3    # -1.93f

    .line 241
    .line 242
    .line 243
    const/16 v21, 0x0

    .line 244
    .line 245
    const v22, -0x40ca3d71    # -0.71f

    .line 246
    .line 247
    .line 248
    const/high16 v23, -0x41800000    # -0.25f

    .line 249
    .line 250
    const v24, -0x404e147b    # -1.39f

    .line 251
    .line 252
    .line 253
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 254
    .line 255
    .line 256
    const v25, 0x3f2b851f    # 0.67f

    .line 257
    .line 258
    .line 259
    const v21, 0x3edc28f6    # 0.43f

    .line 260
    .line 261
    .line 262
    const v22, -0x40f5c28f    # -0.54f

    .line 263
    .line 264
    .line 265
    const v23, 0x3f2b851f    # 0.67f

    .line 266
    .line 267
    .line 268
    const v24, -0x4063d70a    # -1.22f

    .line 269
    .line 270
    .line 271
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 272
    .line 273
    .line 274
    const v25, -0x3fb70a3d    # -3.14f

    .line 275
    .line 276
    .line 277
    const v26, -0x3fb70a3d    # -3.14f

    .line 278
    .line 279
    .line 280
    const/16 v21, 0x0

    .line 281
    .line 282
    const v22, -0x40228f5c    # -1.73f

    .line 283
    .line 284
    .line 285
    const v23, -0x404b851f    # -1.41f

    .line 286
    .line 287
    .line 288
    const v24, -0x3fb70a3d    # -3.14f

    .line 289
    .line 290
    .line 291
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 292
    .line 293
    .line 294
    const v25, -0x4123d70a    # -0.43f

    .line 295
    .line 296
    .line 297
    const v26, 0x3cf5c28f    # 0.03f

    .line 298
    .line 299
    .line 300
    const v21, -0x41e66666    # -0.15f

    .line 301
    .line 302
    .line 303
    const/16 v22, 0x0

    .line 304
    .line 305
    const v23, -0x416b851f    # -0.29f

    .line 306
    .line 307
    .line 308
    const v24, 0x3c23d70a    # 0.01f

    .line 309
    .line 310
    .line 311
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 312
    .line 313
    .line 314
    const/high16 v25, 0x41400000    # 12.0f

    .line 315
    .line 316
    const/high16 v26, 0x3f800000    # 1.0f

    .line 317
    .line 318
    const v21, 0x41670a3d    # 14.44f

    .line 319
    .line 320
    .line 321
    const v22, 0x3fe7ae14    # 1.81f

    .line 322
    .line 323
    .line 324
    const v23, 0x4154f5c3    # 13.31f

    .line 325
    .line 326
    .line 327
    const/high16 v24, 0x3f800000    # 1.0f

    .line 328
    .line 329
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 330
    .line 331
    .line 332
    const v4, 0x411170a4    # 9.09f

    .line 333
    .line 334
    .line 335
    const v6, 0x403d70a4    # 2.96f

    .line 336
    .line 337
    .line 338
    const v7, 0x4118f5c3    # 9.56f

    .line 339
    .line 340
    .line 341
    const v8, 0x3fe7ae14    # 1.81f

    .line 342
    .line 343
    .line 344
    invoke-virtual {v2, v7, v8, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 345
    .line 346
    .line 347
    const v25, 0x410a8f5c    # 8.66f

    .line 348
    .line 349
    .line 350
    const v26, 0x403b851f    # 2.93f

    .line 351
    .line 352
    .line 353
    const v21, 0x410f3333    # 8.95f

    .line 354
    .line 355
    .line 356
    const v22, 0x403c28f6    # 2.94f

    .line 357
    .line 358
    .line 359
    const v23, 0x410ccccd    # 8.8f

    .line 360
    .line 361
    .line 362
    const v24, 0x403b851f    # 2.93f

    .line 363
    .line 364
    .line 365
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 366
    .line 367
    .line 368
    const v25, -0x3ffa3d71    # -2.09f

    .line 369
    .line 370
    .line 371
    const v26, 0x3f4f5c29    # 0.81f

    .line 372
    .line 373
    .line 374
    const v21, -0x40b33333    # -0.8f

    .line 375
    .line 376
    .line 377
    const/16 v22, 0x0

    .line 378
    .line 379
    const v23, -0x403c28f6    # -1.53f

    .line 380
    .line 381
    .line 382
    const v24, 0x3e9eb852    # 0.31f

    .line 383
    .line 384
    .line 385
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 386
    .line 387
    .line 388
    const v4, 0x3fb5c28f    # 1.42f

    .line 389
    .line 390
    .line 391
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 392
    .line 393
    .line 394
    const v25, 0x410a8f5c    # 8.66f

    .line 395
    .line 396
    .line 397
    const v26, 0x409dc28f    # 4.93f

    .line 398
    .line 399
    .line 400
    const v21, 0x41030a3d    # 8.19f

    .line 401
    .line 402
    .line 403
    const v22, 0x40a0f5c3    # 5.03f

    .line 404
    .line 405
    .line 406
    const v23, 0x41068f5c    # 8.41f

    .line 407
    .line 408
    .line 409
    const v24, 0x409dc28f    # 4.93f

    .line 410
    .line 411
    .line 412
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 413
    .line 414
    .line 415
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 416
    .line 417
    .line 418
    const v4, 0x417570a4    # 15.34f

    .line 419
    .line 420
    .line 421
    const v6, 0x41311eb8    # 11.07f

    .line 422
    .line 423
    .line 424
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 425
    .line 426
    .line 427
    const v25, -0x40dc28f6    # -0.64f

    .line 428
    .line 429
    .line 430
    const v26, -0x41b33333    # -0.2f

    .line 431
    .line 432
    .line 433
    const v21, -0x418a3d71    # -0.24f

    .line 434
    .line 435
    .line 436
    const/16 v22, 0x0

    .line 437
    .line 438
    const v23, -0x41147ae1    # -0.46f

    .line 439
    .line 440
    .line 441
    const v24, -0x4270a3d7    # -0.07f

    .line 442
    .line 443
    .line 444
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 445
    .line 446
    .line 447
    const v4, -0x40b0a3d7    # -0.81f

    .line 448
    .line 449
    .line 450
    const v6, -0x40ee147b    # -0.57f

    .line 451
    .line 452
    .line 453
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 454
    .line 455
    .line 456
    const v25, 0x3f87ae14    # 1.06f

    .line 457
    .line 458
    .line 459
    const v26, -0x4015c28f    # -1.83f

    .line 460
    .line 461
    .line 462
    const v21, 0x3f0ccccd    # 0.55f

    .line 463
    .line 464
    .line 465
    const v22, -0x4119999a    # -0.45f

    .line 466
    .line 467
    .line 468
    const v23, 0x3f70a3d7    # 0.94f

    .line 469
    .line 470
    .line 471
    const v24, -0x40747ae1    # -1.09f

    .line 472
    .line 473
    .line 474
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 475
    .line 476
    .line 477
    const v4, 0x3f6147ae    # 0.88f

    .line 478
    .line 479
    .line 480
    const v6, 0x3ed70a3d    # 0.42f

    .line 481
    .line 482
    .line 483
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 484
    .line 485
    .line 486
    const v25, 0x3f28f5c3    # 0.66f

    .line 487
    .line 488
    .line 489
    const v26, 0x3f83d70a    # 1.03f

    .line 490
    .line 491
    .line 492
    const v21, 0x3ecccccd    # 0.4f

    .line 493
    .line 494
    .line 495
    const v22, 0x3e428f5c    # 0.19f

    .line 496
    .line 497
    .line 498
    const v23, 0x3f28f5c3    # 0.66f

    .line 499
    .line 500
    .line 501
    const v24, 0x3f170a3d    # 0.59f

    .line 502
    .line 503
    .line 504
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 505
    .line 506
    .line 507
    const v25, 0x417570a4    # 15.34f

    .line 508
    .line 509
    .line 510
    const v26, 0x41311eb8    # 11.07f

    .line 511
    .line 512
    .line 513
    const v21, 0x4183eb85    # 16.49f

    .line 514
    .line 515
    .line 516
    const v22, 0x4128f5c3    # 10.56f

    .line 517
    .line 518
    .line 519
    const v23, 0x417f851f    # 15.97f

    .line 520
    .line 521
    .line 522
    const v24, 0x41311eb8    # 11.07f

    .line 523
    .line 524
    .line 525
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 526
    .line 527
    .line 528
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 529
    .line 530
    .line 531
    const v4, 0x40a428f6    # 5.13f

    .line 532
    .line 533
    .line 534
    const v6, 0x416b0a3d    # 14.69f

    .line 535
    .line 536
    .line 537
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 538
    .line 539
    .line 540
    const v25, 0x3f266666    # 0.65f

    .line 541
    .line 542
    .line 543
    const v26, -0x41b33333    # -0.2f

    .line 544
    .line 545
    .line 546
    const v21, 0x3e4ccccd    # 0.2f

    .line 547
    .line 548
    .line 549
    const v22, -0x41fae148    # -0.13f

    .line 550
    .line 551
    .line 552
    const v23, 0x3ed70a3d    # 0.42f

    .line 553
    .line 554
    .line 555
    const v24, -0x41b33333    # -0.2f

    .line 556
    .line 557
    .line 558
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 559
    .line 560
    .line 561
    const v25, 0x3f91eb85    # 1.14f

    .line 562
    .line 563
    .line 564
    const v26, 0x3f91eb85    # 1.14f

    .line 565
    .line 566
    .line 567
    const v21, 0x3f2147ae    # 0.63f

    .line 568
    .line 569
    .line 570
    const/16 v22, 0x0

    .line 571
    .line 572
    const v23, 0x3f91eb85    # 1.14f

    .line 573
    .line 574
    .line 575
    const v24, 0x3f028f5c    # 0.51f

    .line 576
    .line 577
    .line 578
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 579
    .line 580
    .line 581
    const v25, -0x40d70a3d    # -0.66f

    .line 582
    .line 583
    .line 584
    const v26, 0x3f83d70a    # 1.03f

    .line 585
    .line 586
    .line 587
    const/16 v21, 0x0

    .line 588
    .line 589
    const v22, 0x3ee147ae    # 0.44f

    .line 590
    .line 591
    .line 592
    const/high16 v23, -0x41800000    # -0.25f

    .line 593
    .line 594
    const v24, 0x3f547ae1    # 0.83f

    .line 595
    .line 596
    .line 597
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 598
    .line 599
    .line 600
    const v4, -0x409eb852    # -0.88f

    .line 601
    .line 602
    .line 603
    const v6, 0x3ed70a3d    # 0.42f

    .line 604
    .line 605
    .line 606
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 607
    .line 608
    .line 609
    const v25, -0x40770a3d    # -1.07f

    .line 610
    .line 611
    .line 612
    const v26, -0x4015c28f    # -1.83f

    .line 613
    .line 614
    .line 615
    const v21, -0x420a3d71    # -0.12f

    .line 616
    .line 617
    .line 618
    const v22, -0x40c28f5c    # -0.74f

    .line 619
    .line 620
    .line 621
    const v23, -0x40fd70a4    # -0.51f

    .line 622
    .line 623
    .line 624
    const v24, -0x404f5c29    # -1.38f

    .line 625
    .line 626
    .line 627
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 628
    .line 629
    .line 630
    const v4, 0x40a428f6    # 5.13f

    .line 631
    .line 632
    .line 633
    const v6, 0x416b0a3d    # 14.69f

    .line 634
    .line 635
    .line 636
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 637
    .line 638
    .line 639
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 640
    .line 641
    .line 642
    const/high16 v4, 0x41400000    # 12.0f

    .line 643
    .line 644
    const/high16 v6, 0x40400000    # 3.0f

    .line 645
    .line 646
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 647
    .line 648
    .line 649
    const v25, 0x3f91eb85    # 1.14f

    .line 650
    .line 651
    .line 652
    const v26, 0x3f8ccccd    # 1.1f

    .line 653
    .line 654
    .line 655
    const v21, 0x3f1eb852    # 0.62f

    .line 656
    .line 657
    .line 658
    const/16 v22, 0x0

    .line 659
    .line 660
    const v23, 0x3f8f5c29    # 1.12f

    .line 661
    .line 662
    .line 663
    const v24, 0x3efae148    # 0.49f

    .line 664
    .line 665
    .line 666
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 667
    .line 668
    .line 669
    const v4, -0x421eb852    # -0.11f

    .line 670
    .line 671
    .line 672
    const v6, 0x3f8b851f    # 1.09f

    .line 673
    .line 674
    .line 675
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 676
    .line 677
    .line 678
    const/high16 v25, 0x41400000    # 12.0f

    .line 679
    .line 680
    const/high16 v26, 0x40a00000    # 5.0f

    .line 681
    .line 682
    const v21, 0x414b5c29    # 12.71f

    .line 683
    .line 684
    .line 685
    const v22, 0x40a23d71    # 5.07f

    .line 686
    .line 687
    .line 688
    const v23, 0x4145c28f    # 12.36f

    .line 689
    .line 690
    .line 691
    const/high16 v24, 0x40a00000    # 5.0f

    .line 692
    .line 693
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 694
    .line 695
    .line 696
    const v4, -0x407d70a4    # -1.02f

    .line 697
    .line 698
    .line 699
    const v6, 0x3e428f5c    # 0.19f

    .line 700
    .line 701
    .line 702
    const v7, -0x40cccccd    # -0.7f

    .line 703
    .line 704
    .line 705
    const v8, 0x3d8f5c29    # 0.07f

    .line 706
    .line 707
    .line 708
    invoke-virtual {v2, v7, v8, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 709
    .line 710
    .line 711
    const v4, 0x412dc28f    # 10.86f

    .line 712
    .line 713
    .line 714
    const v6, 0x40833333    # 4.1f

    .line 715
    .line 716
    .line 717
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 718
    .line 719
    .line 720
    const/high16 v26, 0x40400000    # 3.0f

    .line 721
    .line 722
    const v21, 0x412e147b    # 10.88f

    .line 723
    .line 724
    .line 725
    const v22, 0x405f5c29    # 3.49f

    .line 726
    .line 727
    .line 728
    const v23, 0x4136147b    # 11.38f

    .line 729
    .line 730
    .line 731
    const/high16 v24, 0x40400000    # 3.0f

    .line 732
    .line 733
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 734
    .line 735
    .line 736
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 737
    .line 738
    .line 739
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 740
    .line 741
    .line 742
    move-result-object v2

    .line 743
    const/16 v16, 0x3800

    .line 744
    .line 745
    const/16 v17, 0x0

    .line 746
    .line 747
    const/high16 v6, 0x3f800000    # 1.0f

    .line 748
    .line 749
    const/high16 v8, 0x3f800000    # 1.0f

    .line 750
    .line 751
    const/4 v7, 0x0

    .line 752
    const/high16 v9, 0x3f800000    # 1.0f

    .line 753
    .line 754
    const/high16 v12, 0x3f800000    # 1.0f

    .line 755
    .line 756
    const/4 v13, 0x0

    .line 757
    const/4 v14, 0x0

    .line 758
    const/4 v15, 0x0

    .line 759
    const-string v4, ""

    .line 760
    .line 761
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 762
    .line 763
    .line 764
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 765
    .line 766
    .line 767
    move-result v3

    .line 768
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 769
    .line 770
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 771
    .line 772
    .line 773
    move-result-wide v6

    .line 774
    const/4 v2, 0x0

    .line 775
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 776
    .line 777
    .line 778
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 779
    .line 780
    .line 781
    move-result v10

    .line 782
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 783
    .line 784
    .line 785
    move-result v11

    .line 786
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 787
    .line 788
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 789
    .line 790
    .line 791
    const v4, 0x41893333    # 17.15f

    .line 792
    .line 793
    .line 794
    const v6, 0x419fd70a    # 19.98f

    .line 795
    .line 796
    .line 797
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 798
    .line 799
    .line 800
    const/high16 v25, 0x41a80000    # 21.0f

    .line 801
    .line 802
    const/high16 v26, 0x41500000    # 13.0f

    .line 803
    .line 804
    const v21, 0x41a50a3d    # 20.63f

    .line 805
    .line 806
    .line 807
    const v22, 0x417e8f5c    # 15.91f

    .line 808
    .line 809
    .line 810
    const/high16 v23, 0x41a80000    # 21.0f

    .line 811
    .line 812
    const/high16 v24, 0x41680000    # 14.5f

    .line 813
    .line 814
    move-object/from16 v20, v2

    .line 815
    .line 816
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 817
    .line 818
    .line 819
    const v25, -0x3f7b3333    # -4.15f

    .line 820
    .line 821
    .line 822
    const v26, 0x3f828f5c    # 1.02f

    .line 823
    .line 824
    .line 825
    const/high16 v21, -0x40400000    # -1.5f

    .line 826
    .line 827
    const/16 v22, 0x0

    .line 828
    .line 829
    const v23, -0x3fc5c28f    # -2.91f

    .line 830
    .line 831
    .line 832
    const v24, 0x3ebd70a4    # 0.37f

    .line 833
    .line 834
    .line 835
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 836
    .line 837
    .line 838
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 839
    .line 840
    .line 841
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 842
    .line 843
    .line 844
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 845
    .line 846
    .line 847
    move-result-object v2

    .line 848
    const/high16 v6, 0x3f800000    # 1.0f

    .line 849
    .line 850
    const/4 v7, 0x0

    .line 851
    const-string v4, ""

    .line 852
    .line 853
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 854
    .line 855
    .line 856
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 857
    .line 858
    .line 859
    move-result v3

    .line 860
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 861
    .line 862
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 863
    .line 864
    .line 865
    move-result-wide v6

    .line 866
    const/4 v2, 0x0

    .line 867
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 868
    .line 869
    .line 870
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 871
    .line 872
    .line 873
    move-result v10

    .line 874
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 875
    .line 876
    .line 877
    move-result v11

    .line 878
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 879
    .line 880
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 881
    .line 882
    .line 883
    const/high16 v4, 0x41500000    # 13.0f

    .line 884
    .line 885
    const/high16 v6, 0x40400000    # 3.0f

    .line 886
    .line 887
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 888
    .line 889
    .line 890
    const/high16 v25, 0x41100000    # 9.0f

    .line 891
    .line 892
    const/high16 v26, 0x41100000    # 9.0f

    .line 893
    .line 894
    const/16 v21, 0x0

    .line 895
    .line 896
    const v22, 0x409f0a3d    # 4.97f

    .line 897
    .line 898
    .line 899
    const v23, 0x4080f5c3    # 4.03f

    .line 900
    .line 901
    .line 902
    const/high16 v24, 0x41100000    # 9.0f

    .line 903
    .line 904
    move-object/from16 v20, v2

    .line 905
    .line 906
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 907
    .line 908
    .line 909
    const/high16 v25, 0x40400000    # 3.0f

    .line 910
    .line 911
    const/high16 v26, 0x41500000    # 13.0f

    .line 912
    .line 913
    const/high16 v21, 0x41400000    # 12.0f

    .line 914
    .line 915
    const v22, 0x41883d71    # 17.03f

    .line 916
    .line 917
    .line 918
    const v23, 0x40ff0a3d    # 7.97f

    .line 919
    .line 920
    .line 921
    const/high16 v24, 0x41500000    # 13.0f

    .line 922
    .line 923
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 924
    .line 925
    .line 926
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 927
    .line 928
    .line 929
    const v4, 0x40ae147b    # 5.44f

    .line 930
    .line 931
    .line 932
    const v6, 0x41770a3d    # 15.44f

    .line 933
    .line 934
    .line 935
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 936
    .line 937
    .line 938
    const v25, 0x4083d70a    # 4.12f

    .line 939
    .line 940
    .line 941
    const v26, 0x4083d70a    # 4.12f

    .line 942
    .line 943
    .line 944
    const v21, 0x3ff33333    # 1.9f

    .line 945
    .line 946
    .line 947
    const v22, 0x3f35c28f    # 0.71f

    .line 948
    .line 949
    .line 950
    const v23, 0x405ae148    # 3.42f

    .line 951
    .line 952
    .line 953
    const v24, 0x400e147b    # 2.22f

    .line 954
    .line 955
    .line 956
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 957
    .line 958
    .line 959
    const v25, 0x40ae147b    # 5.44f

    .line 960
    .line 961
    .line 962
    const v26, 0x41770a3d    # 15.44f

    .line 963
    .line 964
    .line 965
    const v21, 0x40f51eb8    # 7.66f

    .line 966
    .line 967
    .line 968
    const v22, 0x4196cccd    # 18.85f

    .line 969
    .line 970
    .line 971
    const v23, 0x40c4cccd    # 6.15f

    .line 972
    .line 973
    .line 974
    const v24, 0x418ab852    # 17.34f

    .line 975
    .line 976
    .line 977
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 978
    .line 979
    .line 980
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 981
    .line 982
    .line 983
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 984
    .line 985
    .line 986
    move-result-object v2

    .line 987
    const/high16 v6, 0x3f800000    # 1.0f

    .line 988
    .line 989
    const/4 v7, 0x0

    .line 990
    const-string v4, ""

    .line 991
    .line 992
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 993
    .line 994
    .line 995
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 996
    .line 997
    .line 998
    move-result v3

    .line 999
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 1000
    .line 1001
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 1002
    .line 1003
    .line 1004
    move-result-wide v6

    .line 1005
    const/4 v0, 0x0

    .line 1006
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 1007
    .line 1008
    .line 1009
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 1010
    .line 1011
    .line 1012
    move-result v10

    .line 1013
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 1014
    .line 1015
    .line 1016
    move-result v11

    .line 1017
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1018
    .line 1019
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 1020
    .line 1021
    .line 1022
    const v0, 0x4033d70a    # 2.81f

    .line 1023
    .line 1024
    .line 1025
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1026
    .line 1027
    .line 1028
    const v0, 0x3fb1eb85    # 1.39f

    .line 1029
    .line 1030
    .line 1031
    const v2, 0x40870a3d    # 4.22f

    .line 1032
    .line 1033
    .line 1034
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1035
    .line 1036
    .line 1037
    const v0, 0x408d70a4    # 4.42f

    .line 1038
    .line 1039
    .line 1040
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1041
    .line 1042
    .line 1043
    const v17, -0x41666666    # -0.3f

    .line 1044
    .line 1045
    .line 1046
    const v18, 0x3fa51eb8    # 1.29f

    .line 1047
    .line 1048
    .line 1049
    const v13, -0x41bd70a4    # -0.19f

    .line 1050
    .line 1051
    .line 1052
    const v14, 0x3ecccccd    # 0.4f

    .line 1053
    .line 1054
    .line 1055
    const v15, -0x41666666    # -0.3f

    .line 1056
    .line 1057
    .line 1058
    const v16, 0x3f570a3d    # 0.84f

    .line 1059
    .line 1060
    .line 1061
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1062
    .line 1063
    .line 1064
    const v17, 0x4049999a    # 3.15f

    .line 1065
    .line 1066
    .line 1067
    const v18, 0x4048f5c3    # 3.14f

    .line 1068
    .line 1069
    .line 1070
    const/4 v13, 0x0

    .line 1071
    const v14, 0x3fdd70a4    # 1.73f

    .line 1072
    .line 1073
    .line 1074
    const v15, 0x3fb47ae1    # 1.41f

    .line 1075
    .line 1076
    .line 1077
    const v16, 0x4048f5c3    # 3.14f

    .line 1078
    .line 1079
    .line 1080
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1081
    .line 1082
    .line 1083
    const v17, 0x3edc28f6    # 0.43f

    .line 1084
    .line 1085
    .line 1086
    const v18, -0x430a3d71    # -0.03f

    .line 1087
    .line 1088
    .line 1089
    const v13, 0x3e19999a    # 0.15f

    .line 1090
    .line 1091
    .line 1092
    const/4 v14, 0x0

    .line 1093
    const v15, 0x3e947ae1    # 0.29f

    .line 1094
    .line 1095
    .line 1096
    const v16, -0x43dc28f6    # -0.01f

    .line 1097
    .line 1098
    .line 1099
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1100
    .line 1101
    .line 1102
    const/high16 v17, 0x41400000    # 12.0f

    .line 1103
    .line 1104
    const/high16 v18, 0x41700000    # 15.0f

    .line 1105
    .line 1106
    const v13, 0x4118f5c3    # 9.56f

    .line 1107
    .line 1108
    .line 1109
    const v14, 0x41630a3d    # 14.19f

    .line 1110
    .line 1111
    .line 1112
    const v15, 0x412b0a3d    # 10.69f

    .line 1113
    .line 1114
    .line 1115
    const/high16 v16, 0x41700000    # 15.0f

    .line 1116
    .line 1117
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1118
    .line 1119
    .line 1120
    const v17, 0x3e23d70a    # 0.16f

    .line 1121
    .line 1122
    .line 1123
    const v18, -0x43dc28f6    # -0.01f

    .line 1124
    .line 1125
    .line 1126
    const v13, 0x3d4ccccd    # 0.05f

    .line 1127
    .line 1128
    .line 1129
    const/4 v14, 0x0

    .line 1130
    const v15, 0x3de147ae    # 0.11f

    .line 1131
    .line 1132
    .line 1133
    const v16, -0x43dc28f6    # -0.01f

    .line 1134
    .line 1135
    .line 1136
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1137
    .line 1138
    .line 1139
    const v0, 0x3fd1eb85    # 1.64f

    .line 1140
    .line 1141
    .line 1142
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1143
    .line 1144
    .line 1145
    const/high16 v17, 0x41400000    # 12.0f

    .line 1146
    .line 1147
    const/high16 v18, 0x41b00000    # 22.0f

    .line 1148
    .line 1149
    const v13, 0x414ab852    # 12.67f

    .line 1150
    .line 1151
    .line 1152
    const v14, 0x4190f5c3    # 18.12f

    .line 1153
    .line 1154
    .line 1155
    const/high16 v15, 0x41400000    # 12.0f

    .line 1156
    .line 1157
    const v16, 0x419fd70a    # 19.98f

    .line 1158
    .line 1159
    .line 1160
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1161
    .line 1162
    .line 1163
    const v17, 0x40ac28f6    # 5.38f

    .line 1164
    .line 1165
    .line 1166
    const v18, -0x4019999a    # -1.8f

    .line 1167
    .line 1168
    .line 1169
    const v13, 0x400147ae    # 2.02f

    .line 1170
    .line 1171
    .line 1172
    const/4 v14, 0x0

    .line 1173
    const v15, 0x407851ec    # 3.88f

    .line 1174
    .line 1175
    .line 1176
    const v16, -0x40d47ae1    # -0.67f

    .line 1177
    .line 1178
    .line 1179
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1180
    .line 1181
    .line 1182
    const v0, 0x4019999a    # 2.4f

    .line 1183
    .line 1184
    .line 1185
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1186
    .line 1187
    .line 1188
    const v0, 0x3fb47ae1    # 1.41f

    .line 1189
    .line 1190
    .line 1191
    const v2, -0x404b851f    # -1.41f

    .line 1192
    .line 1193
    .line 1194
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1195
    .line 1196
    .line 1197
    const v0, 0x4033d70a    # 2.81f

    .line 1198
    .line 1199
    .line 1200
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1201
    .line 1202
    .line 1203
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1204
    .line 1205
    .line 1206
    const v0, 0x41670a3d    # 14.44f

    .line 1207
    .line 1208
    .line 1209
    const v2, 0x419c7ae1    # 19.56f

    .line 1210
    .line 1211
    .line 1212
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1213
    .line 1214
    .line 1215
    const v17, 0x3f4a3d71    # 0.79f

    .line 1216
    .line 1217
    .line 1218
    const/high16 v18, -0x40400000    # -1.5f

    .line 1219
    .line 1220
    const v13, 0x3e4ccccd    # 0.2f

    .line 1221
    .line 1222
    .line 1223
    const v14, -0x40f5c28f    # -0.54f

    .line 1224
    .line 1225
    .line 1226
    const v15, 0x3ef0a3d7    # 0.47f

    .line 1227
    .line 1228
    .line 1229
    const v16, -0x407ae148    # -1.04f

    .line 1230
    .line 1231
    .line 1232
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1233
    .line 1234
    .line 1235
    const v0, 0x3f3851ec    # 0.72f

    .line 1236
    .line 1237
    .line 1238
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1239
    .line 1240
    .line 1241
    const v17, 0x41670a3d    # 14.44f

    .line 1242
    .line 1243
    .line 1244
    const v18, 0x419c7ae1    # 19.56f

    .line 1245
    .line 1246
    .line 1247
    const v13, 0x4177ae14    # 15.48f

    .line 1248
    .line 1249
    .line 1250
    const v14, 0x4198b852    # 19.09f

    .line 1251
    .line 1252
    .line 1253
    const v15, 0x416fae14    # 14.98f

    .line 1254
    .line 1255
    .line 1256
    const v16, 0x419ae148    # 19.36f

    .line 1257
    .line 1258
    .line 1259
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1260
    .line 1261
    .line 1262
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1263
    .line 1264
    .line 1265
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 1266
    .line 1267
    .line 1268
    move-result-object v2

    .line 1269
    const/16 v16, 0x3800

    .line 1270
    .line 1271
    const/16 v17, 0x0

    .line 1272
    .line 1273
    const/high16 v6, 0x3f800000    # 1.0f

    .line 1274
    .line 1275
    const/4 v7, 0x0

    .line 1276
    const/high16 v12, 0x3f800000    # 1.0f

    .line 1277
    .line 1278
    const/4 v13, 0x0

    .line 1279
    const/4 v14, 0x0

    .line 1280
    const/4 v15, 0x0

    .line 1281
    const-string v4, ""

    .line 1282
    .line 1283
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 1284
    .line 1285
    .line 1286
    move-result-object v0

    .line 1287
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1288
    .line 1289
    .line 1290
    move-result-object v0

    .line 1291
    sput-object v0, Landroidx/compose/material/icons/outlined/MacroOffKt;->_macroOff:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1292
    .line 1293
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 1294
    .line 1295
    .line 1296
    return-object v0
.end method
