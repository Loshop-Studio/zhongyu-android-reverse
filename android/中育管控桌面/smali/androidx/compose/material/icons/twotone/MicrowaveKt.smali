.class public final Landroidx/compose/material/icons/twotone/MicrowaveKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_microwave",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "Microwave",
        "Landroidx/compose/material/icons/Icons$TwoTone;",
        "getMicrowave",
        "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;",
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
        "SMAP\nMicrowave.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Microwave.kt\nandroidx/compose/material/icons/twotone/MicrowaveKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,165:1\n212#2,12:166\n233#2,18:179\n253#2:216\n233#2,18:217\n253#2:254\n174#3:178\n705#4,2:197\n717#4,2:199\n719#4,11:205\n705#4,2:235\n717#4,2:237\n719#4,11:243\n72#5,4:201\n72#5,4:239\n*S KotlinDebug\n*F\n+ 1 Microwave.kt\nandroidx/compose/material/icons/twotone/MicrowaveKt\n*L\n29#1:166,12\n30#1:179,18\n30#1:216\n86#1:217,18\n86#1:254\n29#1:178\n30#1:197,2\n30#1:199,2\n30#1:205,11\n86#1:235,2\n86#1:237,2\n86#1:243,11\n30#1:201,4\n86#1:239,4\n*E\n"
    }
.end annotation


# static fields
.field private static _microwave:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getMicrowave(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/MicrowaveKt;->_microwave:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.Microwave"

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
    const/high16 v4, 0x40800000    # 4.0f

    .line 71
    .line 72
    const/high16 v6, 0x41900000    # 18.0f

    .line 73
    .line 74
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v4, 0x41200000    # 10.0f

    .line 78
    .line 79
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 80
    .line 81
    .line 82
    const/high16 v4, 0x40c00000    # 6.0f

    .line 83
    .line 84
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 85
    .line 86
    .line 87
    const/high16 v4, 0x40800000    # 4.0f

    .line 88
    .line 89
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 90
    .line 91
    .line 92
    const/high16 v4, 0x41900000    # 18.0f

    .line 93
    .line 94
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 95
    .line 96
    .line 97
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 98
    .line 99
    .line 100
    const/high16 v4, 0x41000000    # 8.0f

    .line 101
    .line 102
    const/high16 v6, 0x40f80000    # 7.75f

    .line 103
    .line 104
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 105
    .line 106
    .line 107
    const v25, 0x3fe7ae14    # 1.81f

    .line 108
    .line 109
    .line 110
    const v26, 0x3f2b851f    # 0.67f

    .line 111
    .line 112
    .line 113
    const v21, 0x3f4ccccd    # 0.8f

    .line 114
    .line 115
    .line 116
    const/16 v22, 0x0

    .line 117
    .line 118
    const v23, 0x3fb1eb85    # 1.39f

    .line 119
    .line 120
    .line 121
    const v24, 0x3ec7ae14    # 0.39f

    .line 122
    .line 123
    .line 124
    move-object/from16 v20, v2

    .line 125
    .line 126
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 127
    .line 128
    .line 129
    const/high16 v25, 0x41240000    # 10.25f

    .line 130
    .line 131
    const/high16 v26, 0x41100000    # 9.0f

    .line 132
    .line 133
    const v21, 0x411deb85    # 9.87f

    .line 134
    .line 135
    .line 136
    const v22, 0x410e147b    # 8.88f

    .line 137
    .line 138
    .line 139
    const v23, 0x41211eb8    # 10.07f

    .line 140
    .line 141
    .line 142
    const/high16 v24, 0x41100000    # 9.0f

    .line 143
    .line 144
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 145
    .line 146
    .line 147
    const v25, 0x3f733333    # 0.95f

    .line 148
    .line 149
    .line 150
    const v26, -0x40e3d70a    # -0.61f

    .line 151
    .line 152
    .line 153
    const v21, 0x3ebd70a4    # 0.37f

    .line 154
    .line 155
    .line 156
    const/16 v22, 0x0

    .line 157
    .line 158
    const v23, 0x3f4ccccd    # 0.8f

    .line 159
    .line 160
    .line 161
    const v24, -0x412e147b    # -0.41f

    .line 162
    .line 163
    .line 164
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 165
    .line 166
    .line 167
    const v4, 0x3fb5c28f    # 1.42f

    .line 168
    .line 169
    .line 170
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 171
    .line 172
    .line 173
    const v25, -0x3fe851ec    # -2.37f

    .line 174
    .line 175
    .line 176
    const v26, 0x3f9851ec    # 1.19f

    .line 177
    .line 178
    .line 179
    const v21, -0x4147ae14    # -0.36f

    .line 180
    .line 181
    .line 182
    const v22, 0x3ecccccd    # 0.4f

    .line 183
    .line 184
    .line 185
    const v23, -0x4063d70a    # -1.22f

    .line 186
    .line 187
    .line 188
    const v24, 0x3f9851ec    # 1.19f

    .line 189
    .line 190
    .line 191
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 192
    .line 193
    .line 194
    const v25, -0x401ae148    # -1.79f

    .line 195
    .line 196
    .line 197
    const v26, -0x40d70a3d    # -0.66f

    .line 198
    .line 199
    .line 200
    const v21, -0x40b5c28f    # -0.79f

    .line 201
    .line 202
    .line 203
    const/16 v22, 0x0

    .line 204
    .line 205
    const v23, -0x4050a3d7    # -1.37f

    .line 206
    .line 207
    .line 208
    const v24, -0x413d70a4    # -0.38f

    .line 209
    .line 210
    .line 211
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 212
    .line 213
    .line 214
    const/high16 v25, 0x40f80000    # 7.75f

    .line 215
    .line 216
    const/high16 v26, 0x41200000    # 10.0f

    .line 217
    .line 218
    const v21, 0x4102147b    # 8.13f

    .line 219
    .line 220
    .line 221
    const v22, 0x4121eb85    # 10.12f

    .line 222
    .line 223
    .line 224
    const v23, 0x40fe147b    # 7.94f

    .line 225
    .line 226
    .line 227
    const/high16 v24, 0x41200000    # 10.0f

    .line 228
    .line 229
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 230
    .line 231
    .line 232
    const v25, -0x408ccccd    # -0.95f

    .line 233
    .line 234
    .line 235
    const v26, 0x3f1c28f6    # 0.61f

    .line 236
    .line 237
    .line 238
    const v21, -0x41428f5c    # -0.37f

    .line 239
    .line 240
    .line 241
    const/16 v22, 0x0

    .line 242
    .line 243
    const v23, -0x40b33333    # -0.8f

    .line 244
    .line 245
    .line 246
    const v24, 0x3ed1eb85    # 0.41f

    .line 247
    .line 248
    .line 249
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 250
    .line 251
    .line 252
    const v4, 0x41130a3d    # 9.19f

    .line 253
    .line 254
    .line 255
    const v6, 0x40abd70a    # 5.37f

    .line 256
    .line 257
    .line 258
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 259
    .line 260
    .line 261
    const/high16 v25, 0x40f80000    # 7.75f

    .line 262
    .line 263
    const/high16 v26, 0x41000000    # 8.0f

    .line 264
    .line 265
    const v21, 0x40b75c29    # 5.73f

    .line 266
    .line 267
    .line 268
    const v22, 0x410ca3d7    # 8.79f

    .line 269
    .line 270
    .line 271
    const v23, 0x40d2e148    # 6.59f

    .line 272
    .line 273
    .line 274
    const/high16 v24, 0x41000000    # 8.0f

    .line 275
    .line 276
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 277
    .line 278
    .line 279
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 280
    .line 281
    .line 282
    const/high16 v4, 0x40f80000    # 7.75f

    .line 283
    .line 284
    const/high16 v6, 0x41500000    # 13.0f

    .line 285
    .line 286
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 287
    .line 288
    .line 289
    const v25, 0x3fe7ae14    # 1.81f

    .line 290
    .line 291
    .line 292
    const v26, 0x3f2b851f    # 0.67f

    .line 293
    .line 294
    .line 295
    const v21, 0x3f4ccccd    # 0.8f

    .line 296
    .line 297
    .line 298
    const/16 v22, 0x0

    .line 299
    .line 300
    const v23, 0x3fb1eb85    # 1.39f

    .line 301
    .line 302
    .line 303
    const v24, 0x3ec7ae14    # 0.39f

    .line 304
    .line 305
    .line 306
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 307
    .line 308
    .line 309
    const/high16 v25, 0x41240000    # 10.25f

    .line 310
    .line 311
    const/high16 v26, 0x41600000    # 14.0f

    .line 312
    .line 313
    const v21, 0x411deb85    # 9.87f

    .line 314
    .line 315
    .line 316
    const v22, 0x415e147b    # 13.88f

    .line 317
    .line 318
    .line 319
    const v23, 0x41211eb8    # 10.07f

    .line 320
    .line 321
    .line 322
    const/high16 v24, 0x41600000    # 14.0f

    .line 323
    .line 324
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 325
    .line 326
    .line 327
    const v25, 0x3f733333    # 0.95f

    .line 328
    .line 329
    .line 330
    const v26, -0x40e3d70a    # -0.61f

    .line 331
    .line 332
    .line 333
    const v21, 0x3ebd70a4    # 0.37f

    .line 334
    .line 335
    .line 336
    const/16 v22, 0x0

    .line 337
    .line 338
    const v23, 0x3f4ccccd    # 0.8f

    .line 339
    .line 340
    .line 341
    const v24, -0x412e147b    # -0.41f

    .line 342
    .line 343
    .line 344
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 345
    .line 346
    .line 347
    const v4, 0x3fb5c28f    # 1.42f

    .line 348
    .line 349
    .line 350
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 351
    .line 352
    .line 353
    const v25, -0x3fe851ec    # -2.37f

    .line 354
    .line 355
    .line 356
    const v26, 0x3f9851ec    # 1.19f

    .line 357
    .line 358
    .line 359
    const v21, -0x4147ae14    # -0.36f

    .line 360
    .line 361
    .line 362
    const v22, 0x3ecccccd    # 0.4f

    .line 363
    .line 364
    .line 365
    const v23, -0x4063d70a    # -1.22f

    .line 366
    .line 367
    .line 368
    const v24, 0x3f9851ec    # 1.19f

    .line 369
    .line 370
    .line 371
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 372
    .line 373
    .line 374
    const v25, -0x401ae148    # -1.79f

    .line 375
    .line 376
    .line 377
    const v26, -0x40d70a3d    # -0.66f

    .line 378
    .line 379
    .line 380
    const v21, -0x40b5c28f    # -0.79f

    .line 381
    .line 382
    .line 383
    const/16 v22, 0x0

    .line 384
    .line 385
    const v23, -0x4050a3d7    # -1.37f

    .line 386
    .line 387
    .line 388
    const v24, -0x413d70a4    # -0.38f

    .line 389
    .line 390
    .line 391
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 392
    .line 393
    .line 394
    const/high16 v25, 0x40f80000    # 7.75f

    .line 395
    .line 396
    const/high16 v26, 0x41700000    # 15.0f

    .line 397
    .line 398
    const v21, 0x4102147b    # 8.13f

    .line 399
    .line 400
    .line 401
    const v22, 0x4171eb85    # 15.12f

    .line 402
    .line 403
    .line 404
    const v23, 0x40fe147b    # 7.94f

    .line 405
    .line 406
    .line 407
    const/high16 v24, 0x41700000    # 15.0f

    .line 408
    .line 409
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 410
    .line 411
    .line 412
    const v25, -0x408ccccd    # -0.95f

    .line 413
    .line 414
    .line 415
    const v26, 0x3f1c28f6    # 0.61f

    .line 416
    .line 417
    .line 418
    const v21, -0x41428f5c    # -0.37f

    .line 419
    .line 420
    .line 421
    const/16 v22, 0x0

    .line 422
    .line 423
    const v23, -0x40b33333    # -0.8f

    .line 424
    .line 425
    .line 426
    const v24, 0x3ed1eb85    # 0.41f

    .line 427
    .line 428
    .line 429
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 430
    .line 431
    .line 432
    const v4, -0x404a3d71    # -1.42f

    .line 433
    .line 434
    .line 435
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 436
    .line 437
    .line 438
    const/high16 v25, 0x40f80000    # 7.75f

    .line 439
    .line 440
    const/high16 v26, 0x41500000    # 13.0f

    .line 441
    .line 442
    const v21, 0x40b75c29    # 5.73f

    .line 443
    .line 444
    .line 445
    const v22, 0x415ca3d7    # 13.79f

    .line 446
    .line 447
    .line 448
    const v23, 0x40d2e148    # 6.59f

    .line 449
    .line 450
    .line 451
    const/high16 v24, 0x41500000    # 13.0f

    .line 452
    .line 453
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 454
    .line 455
    .line 456
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 457
    .line 458
    .line 459
    const/high16 v4, 0x41800000    # 16.0f

    .line 460
    .line 461
    const/high16 v6, 0x40c00000    # 6.0f

    .line 462
    .line 463
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 464
    .line 465
    .line 466
    const/high16 v4, 0x41400000    # 12.0f

    .line 467
    .line 468
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 469
    .line 470
    .line 471
    const/high16 v4, 0x40800000    # 4.0f

    .line 472
    .line 473
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 474
    .line 475
    .line 476
    const/high16 v4, 0x40c00000    # 6.0f

    .line 477
    .line 478
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 479
    .line 480
    .line 481
    const/high16 v4, 0x41800000    # 16.0f

    .line 482
    .line 483
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 484
    .line 485
    .line 486
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 487
    .line 488
    .line 489
    const/high16 v4, 0x41880000    # 17.0f

    .line 490
    .line 491
    const/high16 v6, 0x41900000    # 18.0f

    .line 492
    .line 493
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 494
    .line 495
    .line 496
    const/high16 v25, -0x40800000    # -1.0f

    .line 497
    .line 498
    const/high16 v26, -0x40800000    # -1.0f

    .line 499
    .line 500
    const v21, -0x40f33333    # -0.55f

    .line 501
    .line 502
    .line 503
    const/16 v22, 0x0

    .line 504
    .line 505
    const/high16 v23, -0x40800000    # -1.0f

    .line 506
    .line 507
    const v24, -0x4119999a    # -0.45f

    .line 508
    .line 509
    .line 510
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 511
    .line 512
    .line 513
    const/high16 v25, 0x3f800000    # 1.0f

    .line 514
    .line 515
    const/16 v21, 0x0

    .line 516
    .line 517
    const v22, -0x40f33333    # -0.55f

    .line 518
    .line 519
    .line 520
    const v23, 0x3ee66666    # 0.45f

    .line 521
    .line 522
    .line 523
    const/high16 v24, -0x40800000    # -1.0f

    .line 524
    .line 525
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 526
    .line 527
    .line 528
    const/high16 v26, 0x3f800000    # 1.0f

    .line 529
    .line 530
    const v21, 0x3f0ccccd    # 0.55f

    .line 531
    .line 532
    .line 533
    const/16 v22, 0x0

    .line 534
    .line 535
    const/high16 v23, 0x3f800000    # 1.0f

    .line 536
    .line 537
    const v24, 0x3ee66666    # 0.45f

    .line 538
    .line 539
    .line 540
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 541
    .line 542
    .line 543
    const/high16 v25, 0x41900000    # 18.0f

    .line 544
    .line 545
    const/high16 v26, 0x41880000    # 17.0f

    .line 546
    .line 547
    const/high16 v21, 0x41980000    # 19.0f

    .line 548
    .line 549
    const v22, 0x41846666    # 16.55f

    .line 550
    .line 551
    .line 552
    const v23, 0x41946666    # 18.55f

    .line 553
    .line 554
    .line 555
    const/high16 v24, 0x41880000    # 17.0f

    .line 556
    .line 557
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 558
    .line 559
    .line 560
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 561
    .line 562
    .line 563
    const/high16 v4, 0x41500000    # 13.0f

    .line 564
    .line 565
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 566
    .line 567
    .line 568
    const/high16 v25, -0x40800000    # -1.0f

    .line 569
    .line 570
    const/high16 v26, -0x40800000    # -1.0f

    .line 571
    .line 572
    const v21, -0x40f33333    # -0.55f

    .line 573
    .line 574
    .line 575
    const/16 v22, 0x0

    .line 576
    .line 577
    const/high16 v23, -0x40800000    # -1.0f

    .line 578
    .line 579
    const v24, -0x4119999a    # -0.45f

    .line 580
    .line 581
    .line 582
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 583
    .line 584
    .line 585
    const/high16 v25, 0x3f800000    # 1.0f

    .line 586
    .line 587
    const/16 v21, 0x0

    .line 588
    .line 589
    const v22, -0x40f33333    # -0.55f

    .line 590
    .line 591
    .line 592
    const v23, 0x3ee66666    # 0.45f

    .line 593
    .line 594
    .line 595
    const/high16 v24, -0x40800000    # -1.0f

    .line 596
    .line 597
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 598
    .line 599
    .line 600
    const/high16 v26, 0x3f800000    # 1.0f

    .line 601
    .line 602
    const v21, 0x3f0ccccd    # 0.55f

    .line 603
    .line 604
    .line 605
    const/16 v22, 0x0

    .line 606
    .line 607
    const/high16 v23, 0x3f800000    # 1.0f

    .line 608
    .line 609
    const v24, 0x3ee66666    # 0.45f

    .line 610
    .line 611
    .line 612
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 613
    .line 614
    .line 615
    const/high16 v25, 0x41900000    # 18.0f

    .line 616
    .line 617
    const/high16 v26, 0x41500000    # 13.0f

    .line 618
    .line 619
    const/high16 v21, 0x41980000    # 19.0f

    .line 620
    .line 621
    const v22, 0x4148cccd    # 12.55f

    .line 622
    .line 623
    .line 624
    const v23, 0x41946666    # 18.55f

    .line 625
    .line 626
    .line 627
    const/high16 v24, 0x41500000    # 13.0f

    .line 628
    .line 629
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 630
    .line 631
    .line 632
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 633
    .line 634
    .line 635
    const/high16 v4, 0x41980000    # 19.0f

    .line 636
    .line 637
    const/high16 v6, 0x41100000    # 9.0f

    .line 638
    .line 639
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 640
    .line 641
    .line 642
    const/high16 v4, -0x40000000    # -2.0f

    .line 643
    .line 644
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 645
    .line 646
    .line 647
    const/high16 v4, 0x40e00000    # 7.0f

    .line 648
    .line 649
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 650
    .line 651
    .line 652
    const/high16 v4, 0x40000000    # 2.0f

    .line 653
    .line 654
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 655
    .line 656
    .line 657
    const/high16 v4, 0x41100000    # 9.0f

    .line 658
    .line 659
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 660
    .line 661
    .line 662
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 663
    .line 664
    .line 665
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 666
    .line 667
    .line 668
    move-result-object v2

    .line 669
    const/16 v16, 0x3800

    .line 670
    .line 671
    const/16 v17, 0x0

    .line 672
    .line 673
    const v6, 0x3e99999a    # 0.3f

    .line 674
    .line 675
    .line 676
    const v8, 0x3e99999a    # 0.3f

    .line 677
    .line 678
    .line 679
    const/4 v7, 0x0

    .line 680
    const/high16 v9, 0x3f800000    # 1.0f

    .line 681
    .line 682
    const/high16 v12, 0x3f800000    # 1.0f

    .line 683
    .line 684
    const/4 v13, 0x0

    .line 685
    const/4 v14, 0x0

    .line 686
    const/4 v15, 0x0

    .line 687
    const-string v4, ""

    .line 688
    .line 689
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 690
    .line 691
    .line 692
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 693
    .line 694
    .line 695
    move-result v3

    .line 696
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 697
    .line 698
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 699
    .line 700
    .line 701
    move-result-wide v6

    .line 702
    const/4 v0, 0x0

    .line 703
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 704
    .line 705
    .line 706
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 707
    .line 708
    .line 709
    move-result v10

    .line 710
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 711
    .line 712
    .line 713
    move-result v11

    .line 714
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 715
    .line 716
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 717
    .line 718
    .line 719
    const/high16 v0, 0x41a00000    # 20.0f

    .line 720
    .line 721
    const/high16 v2, 0x40800000    # 4.0f

    .line 722
    .line 723
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 724
    .line 725
    .line 726
    const/high16 v0, 0x40800000    # 4.0f

    .line 727
    .line 728
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 729
    .line 730
    .line 731
    const/high16 v17, 0x40000000    # 2.0f

    .line 732
    .line 733
    const/high16 v18, 0x40c00000    # 6.0f

    .line 734
    .line 735
    const v13, 0x4039999a    # 2.9f

    .line 736
    .line 737
    .line 738
    const/high16 v14, 0x40800000    # 4.0f

    .line 739
    .line 740
    const/high16 v15, 0x40000000    # 2.0f

    .line 741
    .line 742
    const v16, 0x409ccccd    # 4.9f

    .line 743
    .line 744
    .line 745
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 746
    .line 747
    .line 748
    const/high16 v0, 0x41400000    # 12.0f

    .line 749
    .line 750
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 751
    .line 752
    .line 753
    const/high16 v18, 0x40000000    # 2.0f

    .line 754
    .line 755
    const/4 v13, 0x0

    .line 756
    const v14, 0x3f8ccccd    # 1.1f

    .line 757
    .line 758
    .line 759
    const v15, 0x3f666666    # 0.9f

    .line 760
    .line 761
    .line 762
    const/high16 v16, 0x40000000    # 2.0f

    .line 763
    .line 764
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 765
    .line 766
    .line 767
    const/high16 v0, 0x41800000    # 16.0f

    .line 768
    .line 769
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 770
    .line 771
    .line 772
    const/high16 v18, -0x40000000    # -2.0f

    .line 773
    .line 774
    const v13, 0x3f8ccccd    # 1.1f

    .line 775
    .line 776
    .line 777
    const/4 v14, 0x0

    .line 778
    const/high16 v15, 0x40000000    # 2.0f

    .line 779
    .line 780
    const v16, -0x4099999a    # -0.9f

    .line 781
    .line 782
    .line 783
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 784
    .line 785
    .line 786
    const/high16 v0, 0x40c00000    # 6.0f

    .line 787
    .line 788
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 789
    .line 790
    .line 791
    const/high16 v17, 0x41a00000    # 20.0f

    .line 792
    .line 793
    const/high16 v18, 0x40800000    # 4.0f

    .line 794
    .line 795
    const/high16 v13, 0x41b00000    # 22.0f

    .line 796
    .line 797
    const v14, 0x409ccccd    # 4.9f

    .line 798
    .line 799
    .line 800
    const v15, 0x41a8cccd    # 21.1f

    .line 801
    .line 802
    .line 803
    const/high16 v16, 0x40800000    # 4.0f

    .line 804
    .line 805
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 806
    .line 807
    .line 808
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 809
    .line 810
    .line 811
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 812
    .line 813
    .line 814
    const/high16 v0, 0x41200000    # 10.0f

    .line 815
    .line 816
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 817
    .line 818
    .line 819
    const/high16 v0, 0x41400000    # 12.0f

    .line 820
    .line 821
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 822
    .line 823
    .line 824
    const/high16 v0, 0x40800000    # 4.0f

    .line 825
    .line 826
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 827
    .line 828
    .line 829
    const/high16 v0, 0x40c00000    # 6.0f

    .line 830
    .line 831
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 832
    .line 833
    .line 834
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 835
    .line 836
    .line 837
    const/high16 v0, 0x41a00000    # 20.0f

    .line 838
    .line 839
    const/high16 v2, 0x41900000    # 18.0f

    .line 840
    .line 841
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 842
    .line 843
    .line 844
    const/high16 v0, -0x3f800000    # -4.0f

    .line 845
    .line 846
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 847
    .line 848
    .line 849
    const/high16 v0, 0x40c00000    # 6.0f

    .line 850
    .line 851
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 852
    .line 853
    .line 854
    const/high16 v0, 0x40800000    # 4.0f

    .line 855
    .line 856
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 857
    .line 858
    .line 859
    const/high16 v0, 0x41900000    # 18.0f

    .line 860
    .line 861
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 862
    .line 863
    .line 864
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 865
    .line 866
    .line 867
    const/high16 v0, 0x41980000    # 19.0f

    .line 868
    .line 869
    const/high16 v2, 0x41100000    # 9.0f

    .line 870
    .line 871
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 872
    .line 873
    .line 874
    const/high16 v0, -0x40000000    # -2.0f

    .line 875
    .line 876
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 877
    .line 878
    .line 879
    const/high16 v0, 0x40e00000    # 7.0f

    .line 880
    .line 881
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 882
    .line 883
    .line 884
    const/high16 v0, 0x40000000    # 2.0f

    .line 885
    .line 886
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 887
    .line 888
    .line 889
    const/high16 v0, 0x41100000    # 9.0f

    .line 890
    .line 891
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 892
    .line 893
    .line 894
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 895
    .line 896
    .line 897
    const/high16 v0, 0x41500000    # 13.0f

    .line 898
    .line 899
    const/high16 v2, 0x41900000    # 18.0f

    .line 900
    .line 901
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 902
    .line 903
    .line 904
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 905
    .line 906
    .line 907
    const/high16 v17, -0x40800000    # -1.0f

    .line 908
    .line 909
    const/high16 v18, -0x40800000    # -1.0f

    .line 910
    .line 911
    const v13, -0x40f33333    # -0.55f

    .line 912
    .line 913
    .line 914
    const/4 v14, 0x0

    .line 915
    const/high16 v15, -0x40800000    # -1.0f

    .line 916
    .line 917
    const v16, -0x4119999a    # -0.45f

    .line 918
    .line 919
    .line 920
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 921
    .line 922
    .line 923
    const/4 v0, 0x0

    .line 924
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 925
    .line 926
    .line 927
    const/high16 v17, 0x3f800000    # 1.0f

    .line 928
    .line 929
    const/4 v13, 0x0

    .line 930
    const v14, -0x40f33333    # -0.55f

    .line 931
    .line 932
    .line 933
    const v15, 0x3ee66666    # 0.45f

    .line 934
    .line 935
    .line 936
    const/high16 v16, -0x40800000    # -1.0f

    .line 937
    .line 938
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 939
    .line 940
    .line 941
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 942
    .line 943
    .line 944
    const/high16 v18, 0x3f800000    # 1.0f

    .line 945
    .line 946
    const v13, 0x3f0ccccd    # 0.55f

    .line 947
    .line 948
    .line 949
    const/4 v14, 0x0

    .line 950
    const/high16 v15, 0x3f800000    # 1.0f

    .line 951
    .line 952
    const v16, 0x3ee66666    # 0.45f

    .line 953
    .line 954
    .line 955
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 956
    .line 957
    .line 958
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 959
    .line 960
    .line 961
    const/high16 v17, 0x41900000    # 18.0f

    .line 962
    .line 963
    const/high16 v18, 0x41500000    # 13.0f

    .line 964
    .line 965
    const/high16 v13, 0x41980000    # 19.0f

    .line 966
    .line 967
    const v14, 0x4148cccd    # 12.55f

    .line 968
    .line 969
    .line 970
    const v15, 0x41946666    # 18.55f

    .line 971
    .line 972
    .line 973
    const/high16 v16, 0x41500000    # 13.0f

    .line 974
    .line 975
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 976
    .line 977
    .line 978
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 979
    .line 980
    .line 981
    const/high16 v0, 0x41880000    # 17.0f

    .line 982
    .line 983
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 984
    .line 985
    .line 986
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 987
    .line 988
    .line 989
    const/high16 v17, -0x40800000    # -1.0f

    .line 990
    .line 991
    const/high16 v18, -0x40800000    # -1.0f

    .line 992
    .line 993
    const v13, -0x40f33333    # -0.55f

    .line 994
    .line 995
    .line 996
    const/4 v14, 0x0

    .line 997
    const/high16 v15, -0x40800000    # -1.0f

    .line 998
    .line 999
    const v16, -0x4119999a    # -0.45f

    .line 1000
    .line 1001
    .line 1002
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1003
    .line 1004
    .line 1005
    const/4 v0, 0x0

    .line 1006
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1007
    .line 1008
    .line 1009
    const/high16 v17, 0x3f800000    # 1.0f

    .line 1010
    .line 1011
    const/4 v13, 0x0

    .line 1012
    const v14, -0x40f33333    # -0.55f

    .line 1013
    .line 1014
    .line 1015
    const v15, 0x3ee66666    # 0.45f

    .line 1016
    .line 1017
    .line 1018
    const/high16 v16, -0x40800000    # -1.0f

    .line 1019
    .line 1020
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1021
    .line 1022
    .line 1023
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1024
    .line 1025
    .line 1026
    const/high16 v18, 0x3f800000    # 1.0f

    .line 1027
    .line 1028
    const v13, 0x3f0ccccd    # 0.55f

    .line 1029
    .line 1030
    .line 1031
    const/4 v14, 0x0

    .line 1032
    const/high16 v15, 0x3f800000    # 1.0f

    .line 1033
    .line 1034
    const v16, 0x3ee66666    # 0.45f

    .line 1035
    .line 1036
    .line 1037
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1038
    .line 1039
    .line 1040
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1041
    .line 1042
    .line 1043
    const/high16 v17, 0x41900000    # 18.0f

    .line 1044
    .line 1045
    const/high16 v18, 0x41880000    # 17.0f

    .line 1046
    .line 1047
    const/high16 v13, 0x41980000    # 19.0f

    .line 1048
    .line 1049
    const v14, 0x41846666    # 16.55f

    .line 1050
    .line 1051
    .line 1052
    const v15, 0x41946666    # 18.55f

    .line 1053
    .line 1054
    .line 1055
    const/high16 v16, 0x41880000    # 17.0f

    .line 1056
    .line 1057
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1058
    .line 1059
    .line 1060
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1061
    .line 1062
    .line 1063
    const/high16 v0, 0x41240000    # 10.25f

    .line 1064
    .line 1065
    const/high16 v2, 0x41800000    # 16.0f

    .line 1066
    .line 1067
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1068
    .line 1069
    .line 1070
    const v17, -0x401ae148    # -1.79f

    .line 1071
    .line 1072
    .line 1073
    const v18, -0x40d70a3d    # -0.66f

    .line 1074
    .line 1075
    .line 1076
    const v13, -0x40b5c28f    # -0.79f

    .line 1077
    .line 1078
    .line 1079
    const/4 v14, 0x0

    .line 1080
    const v15, -0x4050a3d7    # -1.37f

    .line 1081
    .line 1082
    .line 1083
    const v16, -0x413d70a4    # -0.38f

    .line 1084
    .line 1085
    .line 1086
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1087
    .line 1088
    .line 1089
    const/high16 v17, 0x40f80000    # 7.75f

    .line 1090
    .line 1091
    const/high16 v18, 0x41700000    # 15.0f

    .line 1092
    .line 1093
    const v13, 0x4102147b    # 8.13f

    .line 1094
    .line 1095
    .line 1096
    const v14, 0x4171eb85    # 15.12f

    .line 1097
    .line 1098
    .line 1099
    const v15, 0x40fe147b    # 7.94f

    .line 1100
    .line 1101
    .line 1102
    const/high16 v16, 0x41700000    # 15.0f

    .line 1103
    .line 1104
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1105
    .line 1106
    .line 1107
    const v17, -0x408ccccd    # -0.95f

    .line 1108
    .line 1109
    .line 1110
    const v18, 0x3f1c28f6    # 0.61f

    .line 1111
    .line 1112
    .line 1113
    const v13, -0x41428f5c    # -0.37f

    .line 1114
    .line 1115
    .line 1116
    const/4 v14, 0x0

    .line 1117
    const v15, -0x40b33333    # -0.8f

    .line 1118
    .line 1119
    .line 1120
    const v16, 0x3ed1eb85    # 0.41f

    .line 1121
    .line 1122
    .line 1123
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1124
    .line 1125
    .line 1126
    const v0, -0x404a3d71    # -1.42f

    .line 1127
    .line 1128
    .line 1129
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1130
    .line 1131
    .line 1132
    const/high16 v17, 0x40f80000    # 7.75f

    .line 1133
    .line 1134
    const/high16 v18, 0x41500000    # 13.0f

    .line 1135
    .line 1136
    const v13, 0x40b75c29    # 5.73f

    .line 1137
    .line 1138
    .line 1139
    const v14, 0x415ca3d7    # 13.79f

    .line 1140
    .line 1141
    .line 1142
    const v15, 0x40d2e148    # 6.59f

    .line 1143
    .line 1144
    .line 1145
    const/high16 v16, 0x41500000    # 13.0f

    .line 1146
    .line 1147
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1148
    .line 1149
    .line 1150
    const v17, 0x3fe7ae14    # 1.81f

    .line 1151
    .line 1152
    .line 1153
    const v18, 0x3f2b851f    # 0.67f

    .line 1154
    .line 1155
    .line 1156
    const v13, 0x3f4ccccd    # 0.8f

    .line 1157
    .line 1158
    .line 1159
    const/4 v14, 0x0

    .line 1160
    const v15, 0x3fb1eb85    # 1.39f

    .line 1161
    .line 1162
    .line 1163
    const v16, 0x3ec7ae14    # 0.39f

    .line 1164
    .line 1165
    .line 1166
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1167
    .line 1168
    .line 1169
    const/high16 v17, 0x41240000    # 10.25f

    .line 1170
    .line 1171
    const/high16 v18, 0x41600000    # 14.0f

    .line 1172
    .line 1173
    const v13, 0x411deb85    # 9.87f

    .line 1174
    .line 1175
    .line 1176
    const v14, 0x415e147b    # 13.88f

    .line 1177
    .line 1178
    .line 1179
    const v15, 0x41211eb8    # 10.07f

    .line 1180
    .line 1181
    .line 1182
    const/high16 v16, 0x41600000    # 14.0f

    .line 1183
    .line 1184
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1185
    .line 1186
    .line 1187
    const v17, 0x3f733333    # 0.95f

    .line 1188
    .line 1189
    .line 1190
    const v18, -0x40e3d70a    # -0.61f

    .line 1191
    .line 1192
    .line 1193
    const v13, 0x3ebd70a4    # 0.37f

    .line 1194
    .line 1195
    .line 1196
    const/4 v14, 0x0

    .line 1197
    const v15, 0x3f4ccccd    # 0.8f

    .line 1198
    .line 1199
    .line 1200
    const v16, -0x412e147b    # -0.41f

    .line 1201
    .line 1202
    .line 1203
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1204
    .line 1205
    .line 1206
    const v0, 0x3fb5c28f    # 1.42f

    .line 1207
    .line 1208
    .line 1209
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1210
    .line 1211
    .line 1212
    const/high16 v17, 0x41240000    # 10.25f

    .line 1213
    .line 1214
    const/high16 v18, 0x41800000    # 16.0f

    .line 1215
    .line 1216
    const v13, 0x414428f6    # 12.26f

    .line 1217
    .line 1218
    .line 1219
    const v14, 0x41735c29    # 15.21f

    .line 1220
    .line 1221
    .line 1222
    const v15, 0x41368f5c    # 11.41f

    .line 1223
    .line 1224
    .line 1225
    const/high16 v16, 0x41800000    # 16.0f

    .line 1226
    .line 1227
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1228
    .line 1229
    .line 1230
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1231
    .line 1232
    .line 1233
    const/high16 v0, 0x41240000    # 10.25f

    .line 1234
    .line 1235
    const/high16 v2, 0x41300000    # 11.0f

    .line 1236
    .line 1237
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1238
    .line 1239
    .line 1240
    const v17, -0x401ae148    # -1.79f

    .line 1241
    .line 1242
    .line 1243
    const v18, -0x40d70a3d    # -0.66f

    .line 1244
    .line 1245
    .line 1246
    const v13, -0x40b5c28f    # -0.79f

    .line 1247
    .line 1248
    .line 1249
    const/4 v14, 0x0

    .line 1250
    const v15, -0x4050a3d7    # -1.37f

    .line 1251
    .line 1252
    .line 1253
    const v16, -0x413d70a4    # -0.38f

    .line 1254
    .line 1255
    .line 1256
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1257
    .line 1258
    .line 1259
    const/high16 v17, 0x40f80000    # 7.75f

    .line 1260
    .line 1261
    const/high16 v18, 0x41200000    # 10.0f

    .line 1262
    .line 1263
    const v13, 0x4102147b    # 8.13f

    .line 1264
    .line 1265
    .line 1266
    const v14, 0x4121eb85    # 10.12f

    .line 1267
    .line 1268
    .line 1269
    const v15, 0x40fe147b    # 7.94f

    .line 1270
    .line 1271
    .line 1272
    const/high16 v16, 0x41200000    # 10.0f

    .line 1273
    .line 1274
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1275
    .line 1276
    .line 1277
    const v17, -0x408ccccd    # -0.95f

    .line 1278
    .line 1279
    .line 1280
    const v18, 0x3f1c28f6    # 0.61f

    .line 1281
    .line 1282
    .line 1283
    const v13, -0x41428f5c    # -0.37f

    .line 1284
    .line 1285
    .line 1286
    const/4 v14, 0x0

    .line 1287
    const v15, -0x40b33333    # -0.8f

    .line 1288
    .line 1289
    .line 1290
    const v16, 0x3ed1eb85    # 0.41f

    .line 1291
    .line 1292
    .line 1293
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1294
    .line 1295
    .line 1296
    const v0, 0x41130a3d    # 9.19f

    .line 1297
    .line 1298
    .line 1299
    const v2, 0x40abd70a    # 5.37f

    .line 1300
    .line 1301
    .line 1302
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1303
    .line 1304
    .line 1305
    const/high16 v17, 0x40f80000    # 7.75f

    .line 1306
    .line 1307
    const/high16 v18, 0x41000000    # 8.0f

    .line 1308
    .line 1309
    const v13, 0x40b75c29    # 5.73f

    .line 1310
    .line 1311
    .line 1312
    const v14, 0x410ca3d7    # 8.79f

    .line 1313
    .line 1314
    .line 1315
    const v15, 0x40d2e148    # 6.59f

    .line 1316
    .line 1317
    .line 1318
    const/high16 v16, 0x41000000    # 8.0f

    .line 1319
    .line 1320
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1321
    .line 1322
    .line 1323
    const v17, 0x3fe7ae14    # 1.81f

    .line 1324
    .line 1325
    .line 1326
    const v18, 0x3f2b851f    # 0.67f

    .line 1327
    .line 1328
    .line 1329
    const v13, 0x3f4ccccd    # 0.8f

    .line 1330
    .line 1331
    .line 1332
    const/4 v14, 0x0

    .line 1333
    const v15, 0x3fb1eb85    # 1.39f

    .line 1334
    .line 1335
    .line 1336
    const v16, 0x3ec7ae14    # 0.39f

    .line 1337
    .line 1338
    .line 1339
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1340
    .line 1341
    .line 1342
    const/high16 v17, 0x41240000    # 10.25f

    .line 1343
    .line 1344
    const/high16 v18, 0x41100000    # 9.0f

    .line 1345
    .line 1346
    const v13, 0x411deb85    # 9.87f

    .line 1347
    .line 1348
    .line 1349
    const v14, 0x410e147b    # 8.88f

    .line 1350
    .line 1351
    .line 1352
    const v15, 0x41211eb8    # 10.07f

    .line 1353
    .line 1354
    .line 1355
    const/high16 v16, 0x41100000    # 9.0f

    .line 1356
    .line 1357
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1358
    .line 1359
    .line 1360
    const v17, 0x3f733333    # 0.95f

    .line 1361
    .line 1362
    .line 1363
    const v18, -0x40e3d70a    # -0.61f

    .line 1364
    .line 1365
    .line 1366
    const v13, 0x3ebd70a4    # 0.37f

    .line 1367
    .line 1368
    .line 1369
    const/4 v14, 0x0

    .line 1370
    const v15, 0x3f4ccccd    # 0.8f

    .line 1371
    .line 1372
    .line 1373
    const v16, -0x412e147b    # -0.41f

    .line 1374
    .line 1375
    .line 1376
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1377
    .line 1378
    .line 1379
    const v0, 0x3fb5c28f    # 1.42f

    .line 1380
    .line 1381
    .line 1382
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1383
    .line 1384
    .line 1385
    const/high16 v17, 0x41240000    # 10.25f

    .line 1386
    .line 1387
    const/high16 v18, 0x41300000    # 11.0f

    .line 1388
    .line 1389
    const v13, 0x414428f6    # 12.26f

    .line 1390
    .line 1391
    .line 1392
    const v14, 0x41235c29    # 10.21f

    .line 1393
    .line 1394
    .line 1395
    const v15, 0x41368f5c    # 11.41f

    .line 1396
    .line 1397
    .line 1398
    const/high16 v16, 0x41300000    # 11.0f

    .line 1399
    .line 1400
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1401
    .line 1402
    .line 1403
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1404
    .line 1405
    .line 1406
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 1407
    .line 1408
    .line 1409
    move-result-object v2

    .line 1410
    const/16 v16, 0x3800

    .line 1411
    .line 1412
    const/16 v17, 0x0

    .line 1413
    .line 1414
    const/high16 v6, 0x3f800000    # 1.0f

    .line 1415
    .line 1416
    const/high16 v8, 0x3f800000    # 1.0f

    .line 1417
    .line 1418
    const/4 v7, 0x0

    .line 1419
    const/high16 v12, 0x3f800000    # 1.0f

    .line 1420
    .line 1421
    const/4 v13, 0x0

    .line 1422
    const/4 v14, 0x0

    .line 1423
    const/4 v15, 0x0

    .line 1424
    const-string v4, ""

    .line 1425
    .line 1426
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 1427
    .line 1428
    .line 1429
    move-result-object v0

    .line 1430
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1431
    .line 1432
    .line 1433
    move-result-object v0

    .line 1434
    sput-object v0, Landroidx/compose/material/icons/twotone/MicrowaveKt;->_microwave:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1435
    .line 1436
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 1437
    .line 1438
    .line 1439
    return-object v0
.end method
