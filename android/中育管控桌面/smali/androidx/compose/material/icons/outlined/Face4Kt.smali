.class public final Landroidx/compose/material/icons/outlined/Face4Kt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_face4",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "Face4",
        "Landroidx/compose/material/icons/Icons$Outlined;",
        "getFace4",
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
        "SMAP\nFace4.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Face4.kt\nandroidx/compose/material/icons/outlined/Face4Kt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,86:1\n212#2,12:87\n233#2,18:100\n253#2:137\n233#2,18:138\n253#2:175\n233#2,18:176\n253#2:213\n174#3:99\n705#4,2:118\n717#4,2:120\n719#4,11:126\n705#4,2:156\n717#4,2:158\n719#4,11:164\n705#4,2:194\n717#4,2:196\n719#4,11:202\n72#5,4:122\n72#5,4:160\n72#5,4:198\n*S KotlinDebug\n*F\n+ 1 Face4.kt\nandroidx/compose/material/icons/outlined/Face4Kt\n*L\n29#1:87,12\n30#1:100,18\n30#1:137\n69#1:138,18\n69#1:175\n75#1:176,18\n75#1:213\n29#1:99\n30#1:118,2\n30#1:120,2\n30#1:126,11\n69#1:156,2\n69#1:158,2\n69#1:164,11\n75#1:194,2\n75#1:196,2\n75#1:202,11\n30#1:122,4\n69#1:160,4\n75#1:198,4\n*E\n"
    }
.end annotation


# static fields
.field private static _face4:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getFace4(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 28

    .line 1
    sget-object v0, Landroidx/compose/material/icons/outlined/Face4Kt;->_face4:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Outlined.Face4"

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
    const/high16 v4, 0x40000000    # 2.0f

    .line 71
    .line 72
    const/high16 v6, 0x41400000    # 12.0f

    .line 73
    .line 74
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v25, -0x3fd00000    # -2.75f

    .line 78
    .line 79
    const v26, 0x3ec7ae14    # 0.39f

    .line 80
    .line 81
    .line 82
    const v21, -0x408a3d71    # -0.96f

    .line 83
    .line 84
    .line 85
    const/16 v22, 0x0

    .line 86
    .line 87
    const v23, -0x400f5c29    # -1.88f

    .line 88
    .line 89
    .line 90
    const v24, 0x3e0f5c29    # 0.14f

    .line 91
    .line 92
    .line 93
    move-object/from16 v20, v2

    .line 94
    .line 95
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 96
    .line 97
    .line 98
    const/high16 v25, 0x40a00000    # 5.0f

    .line 99
    .line 100
    const/16 v26, 0x0

    .line 101
    .line 102
    const v21, 0x4105eb85    # 8.37f

    .line 103
    .line 104
    .line 105
    const v22, 0x3f75c28f    # 0.96f

    .line 106
    .line 107
    .line 108
    const v23, 0x40d9999a    # 6.8f

    .line 109
    .line 110
    .line 111
    const/16 v24, 0x0

    .line 112
    .line 113
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 114
    .line 115
    .line 116
    const/16 v25, 0x0

    .line 117
    .line 118
    const/high16 v26, 0x40a00000    # 5.0f

    .line 119
    .line 120
    const v21, 0x400f5c29    # 2.24f

    .line 121
    .line 122
    .line 123
    const/16 v22, 0x0

    .line 124
    .line 125
    const/16 v23, 0x0

    .line 126
    .line 127
    const v24, 0x400f5c29    # 2.24f

    .line 128
    .line 129
    .line 130
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 131
    .line 132
    .line 133
    const v25, 0x4018f5c3    # 2.39f

    .line 134
    .line 135
    .line 136
    const/high16 v26, 0x40880000    # 4.25f

    .line 137
    .line 138
    const/16 v21, 0x0

    .line 139
    .line 140
    const v22, 0x3fe66666    # 1.8f

    .line 141
    .line 142
    .line 143
    const v23, 0x3f75c28f    # 0.96f

    .line 144
    .line 145
    .line 146
    const v24, 0x4057ae14    # 3.37f

    .line 147
    .line 148
    .line 149
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 150
    .line 151
    .line 152
    const/high16 v25, 0x40000000    # 2.0f

    .line 153
    .line 154
    const/high16 v26, 0x41400000    # 12.0f

    .line 155
    .line 156
    const v21, 0x4008f5c3    # 2.14f

    .line 157
    .line 158
    .line 159
    const v22, 0x4121eb85    # 10.12f

    .line 160
    .line 161
    .line 162
    const/high16 v23, 0x40000000    # 2.0f

    .line 163
    .line 164
    const v24, 0x4130a3d7    # 11.04f

    .line 165
    .line 166
    .line 167
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 168
    .line 169
    .line 170
    const/high16 v25, 0x41200000    # 10.0f

    .line 171
    .line 172
    const/high16 v26, 0x41200000    # 10.0f

    .line 173
    .line 174
    const/16 v21, 0x0

    .line 175
    .line 176
    const v22, 0x40b0a3d7    # 5.52f

    .line 177
    .line 178
    .line 179
    const v23, 0x408f5c29    # 4.48f

    .line 180
    .line 181
    .line 182
    const/high16 v24, 0x41200000    # 10.0f

    .line 183
    .line 184
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 185
    .line 186
    .line 187
    const v4, -0x3f70a3d7    # -4.48f

    .line 188
    .line 189
    .line 190
    const/high16 v6, -0x3ee00000    # -10.0f

    .line 191
    .line 192
    const/high16 v7, 0x41200000    # 10.0f

    .line 193
    .line 194
    invoke-virtual {v2, v7, v4, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 195
    .line 196
    .line 197
    const v4, 0x418c28f6    # 17.52f

    .line 198
    .line 199
    .line 200
    const/high16 v6, 0x40000000    # 2.0f

    .line 201
    .line 202
    const/high16 v7, 0x41400000    # 12.0f

    .line 203
    .line 204
    invoke-virtual {v2, v4, v6, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 205
    .line 206
    .line 207
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 208
    .line 209
    .line 210
    const/high16 v4, 0x40800000    # 4.0f

    .line 211
    .line 212
    const/high16 v6, 0x41400000    # 12.0f

    .line 213
    .line 214
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 215
    .line 216
    .line 217
    const v25, 0x40dae148    # 6.84f

    .line 218
    .line 219
    .line 220
    const v26, 0x407851ec    # 3.88f

    .line 221
    .line 222
    .line 223
    const v21, 0x4039999a    # 2.9f

    .line 224
    .line 225
    .line 226
    const/16 v22, 0x0

    .line 227
    .line 228
    const v23, 0x40ae147b    # 5.44f

    .line 229
    .line 230
    .line 231
    const v24, 0x3fc7ae14    # 1.56f

    .line 232
    .line 233
    .line 234
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 235
    .line 236
    .line 237
    const/high16 v25, 0x418c0000    # 17.5f

    .line 238
    .line 239
    const/high16 v26, 0x41000000    # 8.0f

    .line 240
    .line 241
    const v21, 0x419347ae    # 18.41f

    .line 242
    .line 243
    .line 244
    const v22, 0x40fe6666    # 7.95f

    .line 245
    .line 246
    .line 247
    const v23, 0x418fae14    # 17.96f

    .line 248
    .line 249
    .line 250
    const/high16 v24, 0x41000000    # 8.0f

    .line 251
    .line 252
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 253
    .line 254
    .line 255
    const v25, -0x3f251eb8    # -6.84f

    .line 256
    .line 257
    .line 258
    const v26, -0x3f87ae14    # -3.88f

    .line 259
    .line 260
    .line 261
    const v21, -0x3fc66666    # -2.9f

    .line 262
    .line 263
    .line 264
    const/16 v22, 0x0

    .line 265
    .line 266
    const v23, -0x3f51eb85    # -5.44f

    .line 267
    .line 268
    .line 269
    const v24, -0x403851ec    # -1.56f

    .line 270
    .line 271
    .line 272
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 273
    .line 274
    .line 275
    const/4 v4, 0x0

    .line 276
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 277
    .line 278
    .line 279
    const/high16 v25, 0x41400000    # 12.0f

    .line 280
    .line 281
    const/high16 v26, 0x40800000    # 4.0f

    .line 282
    .line 283
    const v21, 0x413170a4    # 11.09f

    .line 284
    .line 285
    .line 286
    const v22, 0x4081999a    # 4.05f

    .line 287
    .line 288
    .line 289
    const v23, 0x4138a3d7    # 11.54f

    .line 290
    .line 291
    .line 292
    const/high16 v24, 0x40800000    # 4.0f

    .line 293
    .line 294
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 295
    .line 296
    .line 297
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 298
    .line 299
    .line 300
    const v4, 0x4117851f    # 9.47f

    .line 301
    .line 302
    .line 303
    const v6, 0x408d70a4    # 4.42f

    .line 304
    .line 305
    .line 306
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 307
    .line 308
    .line 309
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 310
    .line 311
    .line 312
    const v25, 0x410147ae    # 8.08f

    .line 313
    .line 314
    .line 315
    const v26, 0x40a0f5c3    # 5.03f

    .line 316
    .line 317
    .line 318
    const v21, 0x40a1999a    # 5.05f

    .line 319
    .line 320
    .line 321
    const v22, 0x40f28f5c    # 7.58f

    .line 322
    .line 323
    .line 324
    const v23, 0x40cbd70a    # 6.37f

    .line 325
    .line 326
    .line 327
    const/high16 v24, 0x40c00000    # 6.0f

    .line 328
    .line 329
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 330
    .line 331
    .line 332
    const v25, 0x408d70a4    # 4.42f

    .line 333
    .line 334
    .line 335
    const v26, 0x4117851f    # 9.47f

    .line 336
    .line 337
    .line 338
    const v21, 0x40ee6666    # 7.45f

    .line 339
    .line 340
    .line 341
    const v22, 0x40dd70a4    # 6.92f

    .line 342
    .line 343
    .line 344
    const v23, 0x40c428f6    # 6.13f

    .line 345
    .line 346
    .line 347
    const/high16 v24, 0x41080000    # 8.5f

    .line 348
    .line 349
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 350
    .line 351
    .line 352
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 353
    .line 354
    .line 355
    const/high16 v4, 0x40a00000    # 5.0f

    .line 356
    .line 357
    const/high16 v6, 0x40000000    # 2.0f

    .line 358
    .line 359
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 360
    .line 361
    .line 362
    const/high16 v25, 0x40400000    # 3.0f

    .line 363
    .line 364
    const/high16 v26, -0x3fc00000    # -3.0f

    .line 365
    .line 366
    const/16 v21, 0x0

    .line 367
    .line 368
    const v22, -0x402ccccd    # -1.65f

    .line 369
    .line 370
    .line 371
    const v23, 0x3faccccd    # 1.35f

    .line 372
    .line 373
    .line 374
    const/high16 v24, -0x3fc00000    # -3.0f

    .line 375
    .line 376
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 377
    .line 378
    .line 379
    const v25, 0x40166666    # 2.35f

    .line 380
    .line 381
    .line 382
    const v26, 0x3f933333    # 1.15f

    .line 383
    .line 384
    .line 385
    const v21, 0x3f733333    # 0.95f

    .line 386
    .line 387
    .line 388
    const/16 v22, 0x0

    .line 389
    .line 390
    const v23, 0x3fe66666    # 1.8f

    .line 391
    .line 392
    .line 393
    const v24, 0x3eeb851f    # 0.46f

    .line 394
    .line 395
    .line 396
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 397
    .line 398
    .line 399
    const v25, 0x4049999a    # 3.15f

    .line 400
    .line 401
    .line 402
    const v26, 0x40eb3333    # 7.35f

    .line 403
    .line 404
    .line 405
    const v21, 0x40b1eb85    # 5.56f

    .line 406
    .line 407
    .line 408
    const v22, 0x4082e148    # 4.09f

    .line 409
    .line 410
    .line 411
    const v23, 0x4082e148    # 4.09f

    .line 412
    .line 413
    .line 414
    const v24, 0x40b1eb85    # 5.56f

    .line 415
    .line 416
    .line 417
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 418
    .line 419
    .line 420
    const/high16 v25, 0x40000000    # 2.0f

    .line 421
    .line 422
    const/high16 v26, 0x40a00000    # 5.0f

    .line 423
    .line 424
    const v21, 0x401d70a4    # 2.46f

    .line 425
    .line 426
    .line 427
    const v22, 0x40d9999a    # 6.8f

    .line 428
    .line 429
    .line 430
    const/high16 v23, 0x40000000    # 2.0f

    .line 431
    .line 432
    const v24, 0x40be6666    # 5.95f

    .line 433
    .line 434
    .line 435
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 436
    .line 437
    .line 438
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 439
    .line 440
    .line 441
    const/high16 v4, 0x41a00000    # 20.0f

    .line 442
    .line 443
    const/high16 v6, 0x41400000    # 12.0f

    .line 444
    .line 445
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 446
    .line 447
    .line 448
    const/high16 v25, -0x3f000000    # -8.0f

    .line 449
    .line 450
    const/high16 v26, -0x3f000000    # -8.0f

    .line 451
    .line 452
    const v21, -0x3f72e148    # -4.41f

    .line 453
    .line 454
    .line 455
    const/16 v22, 0x0

    .line 456
    .line 457
    const/high16 v23, -0x3f000000    # -8.0f

    .line 458
    .line 459
    const v24, -0x3f9a3d71    # -3.59f

    .line 460
    .line 461
    .line 462
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 463
    .line 464
    .line 465
    const v25, 0x3c23d70a    # 0.01f

    .line 466
    .line 467
    .line 468
    const v26, -0x41e66666    # -0.15f

    .line 469
    .line 470
    .line 471
    const/16 v21, 0x0

    .line 472
    .line 473
    const v22, -0x42b33333    # -0.05f

    .line 474
    .line 475
    .line 476
    const v23, 0x3c23d70a    # 0.01f

    .line 477
    .line 478
    .line 479
    const v24, -0x42333333    # -0.1f

    .line 480
    .line 481
    .line 482
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 483
    .line 484
    .line 485
    const v25, 0x40b7ae14    # 5.74f

    .line 486
    .line 487
    .line 488
    const v26, -0x3f4e6666    # -5.55f

    .line 489
    .line 490
    .line 491
    const v21, 0x40266666    # 2.6f

    .line 492
    .line 493
    .line 494
    const v22, -0x40851eb8    # -0.98f

    .line 495
    .line 496
    .line 497
    const v23, 0x4095c28f    # 4.68f

    .line 498
    .line 499
    .line 500
    const v24, -0x3fc0a3d7    # -2.99f

    .line 501
    .line 502
    .line 503
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 504
    .line 505
    .line 506
    const/high16 v25, 0x418c0000    # 17.5f

    .line 507
    .line 508
    const/high16 v26, 0x41200000    # 10.0f

    .line 509
    .line 510
    const v21, 0x413947ae    # 11.58f

    .line 511
    .line 512
    .line 513
    const v22, 0x4108f5c3    # 8.56f

    .line 514
    .line 515
    .line 516
    const v23, 0x4165eb85    # 14.37f

    .line 517
    .line 518
    .line 519
    const/high16 v24, 0x41200000    # 10.0f

    .line 520
    .line 521
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 522
    .line 523
    .line 524
    const v25, 0x400ae148    # 2.17f

    .line 525
    .line 526
    .line 527
    const v26, -0x418a3d71    # -0.24f

    .line 528
    .line 529
    .line 530
    const/high16 v21, 0x3f400000    # 0.75f

    .line 531
    .line 532
    const/16 v22, 0x0

    .line 533
    .line 534
    const v23, 0x3fbc28f6    # 1.47f

    .line 535
    .line 536
    .line 537
    const v24, -0x4247ae14    # -0.09f

    .line 538
    .line 539
    .line 540
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 541
    .line 542
    .line 543
    const/high16 v25, 0x41a00000    # 20.0f

    .line 544
    .line 545
    const/high16 v26, 0x41400000    # 12.0f

    .line 546
    .line 547
    const v21, 0x419f0a3d    # 19.88f

    .line 548
    .line 549
    .line 550
    const v22, 0x4127851f    # 10.47f

    .line 551
    .line 552
    .line 553
    const/high16 v23, 0x41a00000    # 20.0f

    .line 554
    .line 555
    const v24, 0x4133851f    # 11.22f

    .line 556
    .line 557
    .line 558
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 559
    .line 560
    .line 561
    const/high16 v25, 0x41400000    # 12.0f

    .line 562
    .line 563
    const/high16 v26, 0x41a00000    # 20.0f

    .line 564
    .line 565
    const/high16 v21, 0x41a00000    # 20.0f

    .line 566
    .line 567
    const v22, 0x418347ae    # 16.41f

    .line 568
    .line 569
    .line 570
    const v23, 0x418347ae    # 16.41f

    .line 571
    .line 572
    .line 573
    const/high16 v24, 0x41a00000    # 20.0f

    .line 574
    .line 575
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 576
    .line 577
    .line 578
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 579
    .line 580
    .line 581
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

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
    const/high16 v8, 0x3f800000    # 1.0f

    .line 592
    .line 593
    const/4 v7, 0x0

    .line 594
    const/high16 v9, 0x3f800000    # 1.0f

    .line 595
    .line 596
    const/high16 v12, 0x3f800000    # 1.0f

    .line 597
    .line 598
    const/4 v13, 0x0

    .line 599
    const/4 v14, 0x0

    .line 600
    const/4 v15, 0x0

    .line 601
    const-string v4, ""

    .line 602
    .line 603
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 604
    .line 605
    .line 606
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 607
    .line 608
    .line 609
    move-result v3

    .line 610
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 611
    .line 612
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 613
    .line 614
    .line 615
    move-result-wide v6

    .line 616
    const/4 v2, 0x0

    .line 617
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 618
    .line 619
    .line 620
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 621
    .line 622
    .line 623
    move-result v10

    .line 624
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 625
    .line 626
    .line 627
    move-result v11

    .line 628
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 629
    .line 630
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 631
    .line 632
    .line 633
    const/high16 v4, 0x41100000    # 9.0f

    .line 634
    .line 635
    const/high16 v6, 0x41500000    # 13.0f

    .line 636
    .line 637
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 638
    .line 639
    .line 640
    const/high16 v4, -0x40600000    # -1.25f

    .line 641
    .line 642
    const/4 v6, 0x0

    .line 643
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 644
    .line 645
    .line 646
    const/high16 v26, 0x40200000    # 2.5f

    .line 647
    .line 648
    const/16 v27, 0x0

    .line 649
    .line 650
    const/high16 v21, 0x3fa00000    # 1.25f

    .line 651
    .line 652
    const/high16 v22, 0x3fa00000    # 1.25f

    .line 653
    .line 654
    const/16 v23, 0x0

    .line 655
    .line 656
    const/16 v24, 0x1

    .line 657
    .line 658
    const/16 v25, 0x1

    .line 659
    .line 660
    move-object/from16 v20, v2

    .line 661
    .line 662
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 663
    .line 664
    .line 665
    const/high16 v26, -0x3fe00000    # -2.5f

    .line 666
    .line 667
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 668
    .line 669
    .line 670
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 671
    .line 672
    .line 673
    move-result-object v2

    .line 674
    const/high16 v6, 0x3f800000    # 1.0f

    .line 675
    .line 676
    const/4 v7, 0x0

    .line 677
    const-string v4, ""

    .line 678
    .line 679
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 680
    .line 681
    .line 682
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 683
    .line 684
    .line 685
    move-result v3

    .line 686
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 687
    .line 688
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 689
    .line 690
    .line 691
    move-result-wide v6

    .line 692
    const/4 v0, 0x0

    .line 693
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 694
    .line 695
    .line 696
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 697
    .line 698
    .line 699
    move-result v10

    .line 700
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 701
    .line 702
    .line 703
    move-result v11

    .line 704
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 705
    .line 706
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 707
    .line 708
    .line 709
    const/high16 v0, 0x41700000    # 15.0f

    .line 710
    .line 711
    const/high16 v2, 0x41500000    # 13.0f

    .line 712
    .line 713
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 714
    .line 715
    .line 716
    const/high16 v0, -0x40600000    # -1.25f

    .line 717
    .line 718
    const/4 v2, 0x0

    .line 719
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 720
    .line 721
    .line 722
    const/high16 v18, 0x40200000    # 2.5f

    .line 723
    .line 724
    const/16 v19, 0x0

    .line 725
    .line 726
    const/high16 v13, 0x3fa00000    # 1.25f

    .line 727
    .line 728
    const/high16 v14, 0x3fa00000    # 1.25f

    .line 729
    .line 730
    const/16 v16, 0x1

    .line 731
    .line 732
    const/16 v17, 0x1

    .line 733
    .line 734
    invoke-virtual/range {v12 .. v19}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 735
    .line 736
    .line 737
    const/high16 v18, -0x3fe00000    # -2.5f

    .line 738
    .line 739
    invoke-virtual/range {v12 .. v19}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 740
    .line 741
    .line 742
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 743
    .line 744
    .line 745
    move-result-object v2

    .line 746
    const/16 v16, 0x3800

    .line 747
    .line 748
    const/16 v17, 0x0

    .line 749
    .line 750
    const/high16 v6, 0x3f800000    # 1.0f

    .line 751
    .line 752
    const/4 v7, 0x0

    .line 753
    const/high16 v12, 0x3f800000    # 1.0f

    .line 754
    .line 755
    const/4 v13, 0x0

    .line 756
    const/4 v14, 0x0

    .line 757
    const-string v4, ""

    .line 758
    .line 759
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 760
    .line 761
    .line 762
    move-result-object v0

    .line 763
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 764
    .line 765
    .line 766
    move-result-object v0

    .line 767
    sput-object v0, Landroidx/compose/material/icons/outlined/Face4Kt;->_face4:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 768
    .line 769
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 770
    .line 771
    .line 772
    return-object v0
.end method
