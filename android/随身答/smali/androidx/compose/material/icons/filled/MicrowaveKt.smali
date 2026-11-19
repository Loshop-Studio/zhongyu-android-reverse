.class public final Landroidx/compose/material/icons/filled/MicrowaveKt;
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
        "Landroidx/compose/material/icons/Icons$Filled;",
        "getMicrowave",
        "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;",
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
        "SMAP\nMicrowave.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Microwave.kt\nandroidx/compose/material/icons/filled/MicrowaveKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,95:1\n212#2,12:96\n233#2,18:109\n253#2:146\n174#3:108\n705#4,2:127\n717#4,2:129\n719#4,11:135\n72#5,4:131\n*S KotlinDebug\n*F\n+ 1 Microwave.kt\nandroidx/compose/material/icons/filled/MicrowaveKt\n*L\n29#1:96,12\n30#1:109,18\n30#1:146\n29#1:108\n30#1:127,2\n30#1:129,2\n30#1:135,11\n30#1:131,4\n*E\n"
    }
.end annotation


# static fields
.field private static _microwave:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getMicrowave(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/filled/MicrowaveKt;->_microwave:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Filled.Microwave"

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
    const v0, 0x40d9999a    # 6.8f

    .line 71
    .line 72
    .line 73
    const v2, 0x4129c28f    # 10.61f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v0, 0x40abd70a    # 5.37f

    .line 80
    .line 81
    .line 82
    const v2, 0x41130a3d    # 9.19f

    .line 83
    .line 84
    .line 85
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 86
    .line 87
    .line 88
    const/high16 v17, 0x40f80000    # 7.75f

    .line 89
    .line 90
    const/high16 v18, 0x41000000    # 8.0f

    .line 91
    .line 92
    const v13, 0x40b75c29    # 5.73f

    .line 93
    .line 94
    .line 95
    const v14, 0x410ca3d7    # 8.79f

    .line 96
    .line 97
    .line 98
    const v15, 0x40d2e148    # 6.59f

    .line 99
    .line 100
    .line 101
    const/high16 v16, 0x41000000    # 8.0f

    .line 102
    .line 103
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 104
    .line 105
    .line 106
    const v17, 0x3fe7ae14    # 1.81f

    .line 107
    .line 108
    .line 109
    const v18, 0x3f2b851f    # 0.67f

    .line 110
    .line 111
    .line 112
    const v13, 0x3f4ccccd    # 0.8f

    .line 113
    .line 114
    .line 115
    const/4 v14, 0x0

    .line 116
    const v15, 0x3fb1eb85    # 1.39f

    .line 117
    .line 118
    .line 119
    const v16, 0x3ec7ae14    # 0.39f

    .line 120
    .line 121
    .line 122
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 123
    .line 124
    .line 125
    const/high16 v17, 0x41240000    # 10.25f

    .line 126
    .line 127
    const/high16 v18, 0x41100000    # 9.0f

    .line 128
    .line 129
    const v13, 0x411deb85    # 9.87f

    .line 130
    .line 131
    .line 132
    const v14, 0x410e147b    # 8.88f

    .line 133
    .line 134
    .line 135
    const v15, 0x41211eb8    # 10.07f

    .line 136
    .line 137
    .line 138
    const/high16 v16, 0x41100000    # 9.0f

    .line 139
    .line 140
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 141
    .line 142
    .line 143
    const v17, 0x3f733333    # 0.95f

    .line 144
    .line 145
    .line 146
    const v18, -0x40e3d70a    # -0.61f

    .line 147
    .line 148
    .line 149
    const v13, 0x3ebd70a4    # 0.37f

    .line 150
    .line 151
    .line 152
    const/4 v14, 0x0

    .line 153
    const v15, 0x3f4ccccd    # 0.8f

    .line 154
    .line 155
    .line 156
    const v16, -0x412e147b    # -0.41f

    .line 157
    .line 158
    .line 159
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 160
    .line 161
    .line 162
    const v0, 0x3fb5c28f    # 1.42f

    .line 163
    .line 164
    .line 165
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 166
    .line 167
    .line 168
    const v17, -0x3fe851ec    # -2.37f

    .line 169
    .line 170
    .line 171
    const v18, 0x3f9851ec    # 1.19f

    .line 172
    .line 173
    .line 174
    const v13, -0x4147ae14    # -0.36f

    .line 175
    .line 176
    .line 177
    const v14, 0x3ecccccd    # 0.4f

    .line 178
    .line 179
    .line 180
    const v15, -0x4063d70a    # -1.22f

    .line 181
    .line 182
    .line 183
    const v16, 0x3f9851ec    # 1.19f

    .line 184
    .line 185
    .line 186
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 187
    .line 188
    .line 189
    const v17, -0x401ae148    # -1.79f

    .line 190
    .line 191
    .line 192
    const v18, -0x40d70a3d    # -0.66f

    .line 193
    .line 194
    .line 195
    const v13, -0x40b5c28f    # -0.79f

    .line 196
    .line 197
    .line 198
    const/4 v14, 0x0

    .line 199
    const v15, -0x4050a3d7    # -1.37f

    .line 200
    .line 201
    .line 202
    const v16, -0x413d70a4    # -0.38f

    .line 203
    .line 204
    .line 205
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 206
    .line 207
    .line 208
    const/high16 v17, 0x40f80000    # 7.75f

    .line 209
    .line 210
    const/high16 v18, 0x41200000    # 10.0f

    .line 211
    .line 212
    const v13, 0x4102147b    # 8.13f

    .line 213
    .line 214
    .line 215
    const v14, 0x4121eb85    # 10.12f

    .line 216
    .line 217
    .line 218
    const v15, 0x40fe147b    # 7.94f

    .line 219
    .line 220
    .line 221
    const/high16 v16, 0x41200000    # 10.0f

    .line 222
    .line 223
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 224
    .line 225
    .line 226
    const v17, 0x40d9999a    # 6.8f

    .line 227
    .line 228
    .line 229
    const v18, 0x4129c28f    # 10.61f

    .line 230
    .line 231
    .line 232
    const v13, 0x40ec28f6    # 7.38f

    .line 233
    .line 234
    .line 235
    const/high16 v14, 0x41200000    # 10.0f

    .line 236
    .line 237
    const v15, 0x40de6666    # 6.95f

    .line 238
    .line 239
    .line 240
    const v16, 0x41268f5c    # 10.41f

    .line 241
    .line 242
    .line 243
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 244
    .line 245
    .line 246
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 247
    .line 248
    .line 249
    const/high16 v0, 0x40f80000    # 7.75f

    .line 250
    .line 251
    const/high16 v2, 0x41700000    # 15.0f

    .line 252
    .line 253
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 254
    .line 255
    .line 256
    const v17, 0x3f35c28f    # 0.71f

    .line 257
    .line 258
    .line 259
    const v18, 0x3eae147b    # 0.34f

    .line 260
    .line 261
    .line 262
    const v13, 0x3e428f5c    # 0.19f

    .line 263
    .line 264
    .line 265
    const/4 v14, 0x0

    .line 266
    const v15, 0x3ec28f5c    # 0.38f

    .line 267
    .line 268
    .line 269
    const v16, 0x3df5c28f    # 0.12f

    .line 270
    .line 271
    .line 272
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 273
    .line 274
    .line 275
    const v17, 0x3fe51eb8    # 1.79f

    .line 276
    .line 277
    .line 278
    const v18, 0x3f28f5c3    # 0.66f

    .line 279
    .line 280
    .line 281
    const v13, 0x3ed70a3d    # 0.42f

    .line 282
    .line 283
    .line 284
    const v14, 0x3e8f5c29    # 0.28f

    .line 285
    .line 286
    .line 287
    const/high16 v15, 0x3f800000    # 1.0f

    .line 288
    .line 289
    const v16, 0x3f28f5c3    # 0.66f

    .line 290
    .line 291
    .line 292
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 293
    .line 294
    .line 295
    const v17, 0x4017ae14    # 2.37f

    .line 296
    .line 297
    .line 298
    const v18, -0x4067ae14    # -1.19f

    .line 299
    .line 300
    .line 301
    const v13, 0x3f947ae1    # 1.16f

    .line 302
    .line 303
    .line 304
    const/4 v14, 0x0

    .line 305
    const v15, 0x4000a3d7    # 2.01f

    .line 306
    .line 307
    .line 308
    const v16, -0x40b5c28f    # -0.79f

    .line 309
    .line 310
    .line 311
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 312
    .line 313
    .line 314
    const v0, -0x404a3d71    # -1.42f

    .line 315
    .line 316
    .line 317
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 318
    .line 319
    .line 320
    const v17, -0x408ccccd    # -0.95f

    .line 321
    .line 322
    .line 323
    const v18, 0x3f1c28f6    # 0.61f

    .line 324
    .line 325
    .line 326
    const v13, -0x41e66666    # -0.15f

    .line 327
    .line 328
    .line 329
    const v14, 0x3e4ccccd    # 0.2f

    .line 330
    .line 331
    .line 332
    const v15, -0x40e8f5c3    # -0.59f

    .line 333
    .line 334
    .line 335
    const v16, 0x3f1c28f6    # 0.61f

    .line 336
    .line 337
    .line 338
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 339
    .line 340
    .line 341
    const v17, -0x40cf5c29    # -0.69f

    .line 342
    .line 343
    .line 344
    const v18, -0x41570a3d    # -0.33f

    .line 345
    .line 346
    .line 347
    const v13, -0x41c7ae14    # -0.18f

    .line 348
    .line 349
    .line 350
    const/4 v14, 0x0

    .line 351
    const v15, -0x413d70a4    # -0.38f

    .line 352
    .line 353
    .line 354
    const v16, -0x420a3d71    # -0.12f

    .line 355
    .line 356
    .line 357
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 358
    .line 359
    .line 360
    const/high16 v17, 0x40f80000    # 7.75f

    .line 361
    .line 362
    const/high16 v18, 0x41500000    # 13.0f

    .line 363
    .line 364
    const v13, 0x41123d71    # 9.14f

    .line 365
    .line 366
    .line 367
    const v14, 0x41563d71    # 13.39f

    .line 368
    .line 369
    .line 370
    const v15, 0x4108cccd    # 8.55f

    .line 371
    .line 372
    .line 373
    const/high16 v16, 0x41500000    # 13.0f

    .line 374
    .line 375
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 376
    .line 377
    .line 378
    const v17, -0x3fe7ae14    # -2.38f

    .line 379
    .line 380
    .line 381
    const v18, 0x3f9851ec    # 1.19f

    .line 382
    .line 383
    .line 384
    const v13, -0x406b851f    # -1.16f

    .line 385
    .line 386
    .line 387
    const/4 v14, 0x0

    .line 388
    const v15, -0x3ffeb852    # -2.02f

    .line 389
    .line 390
    .line 391
    const v16, 0x3f4a3d71    # 0.79f

    .line 392
    .line 393
    .line 394
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 395
    .line 396
    .line 397
    const v0, 0x3fb5c28f    # 1.42f

    .line 398
    .line 399
    .line 400
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 401
    .line 402
    .line 403
    const/high16 v17, 0x40f80000    # 7.75f

    .line 404
    .line 405
    const/high16 v18, 0x41700000    # 15.0f

    .line 406
    .line 407
    const v13, 0x40de6666    # 6.95f

    .line 408
    .line 409
    .line 410
    const v14, 0x41768f5c    # 15.41f

    .line 411
    .line 412
    .line 413
    const v15, 0x40ec28f6    # 7.38f

    .line 414
    .line 415
    .line 416
    const/high16 v16, 0x41700000    # 15.0f

    .line 417
    .line 418
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 419
    .line 420
    .line 421
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 422
    .line 423
    .line 424
    const/high16 v0, 0x41b00000    # 22.0f

    .line 425
    .line 426
    const/high16 v2, 0x40c00000    # 6.0f

    .line 427
    .line 428
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 429
    .line 430
    .line 431
    const/high16 v0, 0x41400000    # 12.0f

    .line 432
    .line 433
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 434
    .line 435
    .line 436
    const/high16 v17, -0x40000000    # -2.0f

    .line 437
    .line 438
    const/high16 v18, 0x40000000    # 2.0f

    .line 439
    .line 440
    const/4 v13, 0x0

    .line 441
    const v14, 0x3f8ccccd    # 1.1f

    .line 442
    .line 443
    .line 444
    const v15, -0x4099999a    # -0.9f

    .line 445
    .line 446
    .line 447
    const/high16 v16, 0x40000000    # 2.0f

    .line 448
    .line 449
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 450
    .line 451
    .line 452
    const/high16 v0, 0x40800000    # 4.0f

    .line 453
    .line 454
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 455
    .line 456
    .line 457
    const/high16 v18, -0x40000000    # -2.0f

    .line 458
    .line 459
    const v13, -0x40733333    # -1.1f

    .line 460
    .line 461
    .line 462
    const/4 v14, 0x0

    .line 463
    const/high16 v15, -0x40000000    # -2.0f

    .line 464
    .line 465
    const v16, -0x4099999a    # -0.9f

    .line 466
    .line 467
    .line 468
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 469
    .line 470
    .line 471
    const/high16 v0, 0x40c00000    # 6.0f

    .line 472
    .line 473
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 474
    .line 475
    .line 476
    const/high16 v17, 0x40000000    # 2.0f

    .line 477
    .line 478
    const/4 v13, 0x0

    .line 479
    const v14, -0x40733333    # -1.1f

    .line 480
    .line 481
    .line 482
    const v15, 0x3f666666    # 0.9f

    .line 483
    .line 484
    .line 485
    const/high16 v16, -0x40000000    # -2.0f

    .line 486
    .line 487
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 488
    .line 489
    .line 490
    const/high16 v0, 0x41800000    # 16.0f

    .line 491
    .line 492
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 493
    .line 494
    .line 495
    const/high16 v17, 0x41b00000    # 22.0f

    .line 496
    .line 497
    const/high16 v18, 0x40c00000    # 6.0f

    .line 498
    .line 499
    const v13, 0x41a8cccd    # 21.1f

    .line 500
    .line 501
    .line 502
    const/high16 v14, 0x40800000    # 4.0f

    .line 503
    .line 504
    const/high16 v15, 0x41b00000    # 22.0f

    .line 505
    .line 506
    const v16, 0x409ccccd    # 4.9f

    .line 507
    .line 508
    .line 509
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 510
    .line 511
    .line 512
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 513
    .line 514
    .line 515
    const/high16 v0, 0x41600000    # 14.0f

    .line 516
    .line 517
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 518
    .line 519
    .line 520
    const/high16 v0, 0x40800000    # 4.0f

    .line 521
    .line 522
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 523
    .line 524
    .line 525
    const/high16 v0, 0x41400000    # 12.0f

    .line 526
    .line 527
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 528
    .line 529
    .line 530
    const/high16 v0, 0x41200000    # 10.0f

    .line 531
    .line 532
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 533
    .line 534
    .line 535
    const/high16 v0, 0x40c00000    # 6.0f

    .line 536
    .line 537
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 538
    .line 539
    .line 540
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 541
    .line 542
    .line 543
    const/high16 v0, 0x41800000    # 16.0f

    .line 544
    .line 545
    const/high16 v2, 0x41980000    # 19.0f

    .line 546
    .line 547
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 548
    .line 549
    .line 550
    const/high16 v17, -0x40800000    # -1.0f

    .line 551
    .line 552
    const/high16 v18, -0x40800000    # -1.0f

    .line 553
    .line 554
    const/4 v13, 0x0

    .line 555
    const v14, -0x40f33333    # -0.55f

    .line 556
    .line 557
    .line 558
    const v15, -0x4119999a    # -0.45f

    .line 559
    .line 560
    .line 561
    const/high16 v16, -0x40800000    # -1.0f

    .line 562
    .line 563
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 564
    .line 565
    .line 566
    const/high16 v18, 0x3f800000    # 1.0f

    .line 567
    .line 568
    const v13, -0x40f33333    # -0.55f

    .line 569
    .line 570
    .line 571
    const/4 v14, 0x0

    .line 572
    const/high16 v15, -0x40800000    # -1.0f

    .line 573
    .line 574
    const v16, 0x3ee66666    # 0.45f

    .line 575
    .line 576
    .line 577
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 578
    .line 579
    .line 580
    const/high16 v17, 0x3f800000    # 1.0f

    .line 581
    .line 582
    const/4 v13, 0x0

    .line 583
    const v14, 0x3f0ccccd    # 0.55f

    .line 584
    .line 585
    .line 586
    const v15, 0x3ee66666    # 0.45f

    .line 587
    .line 588
    .line 589
    const/high16 v16, 0x3f800000    # 1.0f

    .line 590
    .line 591
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 592
    .line 593
    .line 594
    const/high16 v17, 0x41980000    # 19.0f

    .line 595
    .line 596
    const/high16 v18, 0x41800000    # 16.0f

    .line 597
    .line 598
    const v13, 0x41946666    # 18.55f

    .line 599
    .line 600
    .line 601
    const/high16 v14, 0x41880000    # 17.0f

    .line 602
    .line 603
    const/high16 v15, 0x41980000    # 19.0f

    .line 604
    .line 605
    const v16, 0x41846666    # 16.55f

    .line 606
    .line 607
    .line 608
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 609
    .line 610
    .line 611
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 612
    .line 613
    .line 614
    const/high16 v0, 0x41980000    # 19.0f

    .line 615
    .line 616
    const/high16 v2, 0x41400000    # 12.0f

    .line 617
    .line 618
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 619
    .line 620
    .line 621
    const/high16 v17, -0x40800000    # -1.0f

    .line 622
    .line 623
    const/high16 v18, -0x40800000    # -1.0f

    .line 624
    .line 625
    const/4 v13, 0x0

    .line 626
    const v14, -0x40f33333    # -0.55f

    .line 627
    .line 628
    .line 629
    const v15, -0x4119999a    # -0.45f

    .line 630
    .line 631
    .line 632
    const/high16 v16, -0x40800000    # -1.0f

    .line 633
    .line 634
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 635
    .line 636
    .line 637
    const/high16 v18, 0x3f800000    # 1.0f

    .line 638
    .line 639
    const v13, -0x40f33333    # -0.55f

    .line 640
    .line 641
    .line 642
    const/4 v14, 0x0

    .line 643
    const/high16 v15, -0x40800000    # -1.0f

    .line 644
    .line 645
    const v16, 0x3ee66666    # 0.45f

    .line 646
    .line 647
    .line 648
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 649
    .line 650
    .line 651
    const/high16 v17, 0x3f800000    # 1.0f

    .line 652
    .line 653
    const/4 v13, 0x0

    .line 654
    const v14, 0x3f0ccccd    # 0.55f

    .line 655
    .line 656
    .line 657
    const v15, 0x3ee66666    # 0.45f

    .line 658
    .line 659
    .line 660
    const/high16 v16, 0x3f800000    # 1.0f

    .line 661
    .line 662
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 663
    .line 664
    .line 665
    const/high16 v17, 0x41980000    # 19.0f

    .line 666
    .line 667
    const/high16 v18, 0x41400000    # 12.0f

    .line 668
    .line 669
    const v13, 0x41946666    # 18.55f

    .line 670
    .line 671
    .line 672
    const/high16 v14, 0x41500000    # 13.0f

    .line 673
    .line 674
    const/high16 v15, 0x41980000    # 19.0f

    .line 675
    .line 676
    const v16, 0x4148cccd    # 12.55f

    .line 677
    .line 678
    .line 679
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 680
    .line 681
    .line 682
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 683
    .line 684
    .line 685
    const/high16 v0, 0x40e00000    # 7.0f

    .line 686
    .line 687
    const/high16 v2, 0x41980000    # 19.0f

    .line 688
    .line 689
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 690
    .line 691
    .line 692
    const/high16 v0, -0x40000000    # -2.0f

    .line 693
    .line 694
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 695
    .line 696
    .line 697
    const/high16 v0, 0x40000000    # 2.0f

    .line 698
    .line 699
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 700
    .line 701
    .line 702
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 703
    .line 704
    .line 705
    const/high16 v0, 0x40e00000    # 7.0f

    .line 706
    .line 707
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 708
    .line 709
    .line 710
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 711
    .line 712
    .line 713
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 714
    .line 715
    .line 716
    move-result-object v2

    .line 717
    const/16 v16, 0x3800

    .line 718
    .line 719
    const/16 v17, 0x0

    .line 720
    .line 721
    const/high16 v6, 0x3f800000    # 1.0f

    .line 722
    .line 723
    const/high16 v8, 0x3f800000    # 1.0f

    .line 724
    .line 725
    const/4 v7, 0x0

    .line 726
    const/high16 v9, 0x3f800000    # 1.0f

    .line 727
    .line 728
    const/high16 v12, 0x3f800000    # 1.0f

    .line 729
    .line 730
    const/4 v13, 0x0

    .line 731
    const/4 v14, 0x0

    .line 732
    const/4 v15, 0x0

    .line 733
    const-string v4, ""

    .line 734
    .line 735
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 736
    .line 737
    .line 738
    move-result-object v0

    .line 739
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 740
    .line 741
    .line 742
    move-result-object v0

    .line 743
    sput-object v0, Landroidx/compose/material/icons/filled/MicrowaveKt;->_microwave:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 744
    .line 745
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 746
    .line 747
    .line 748
    return-object v0
.end method
