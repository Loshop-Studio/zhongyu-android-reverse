.class public final Landroidx/compose/material/icons/rounded/LayersClearKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_layersClear",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "LayersClear",
        "Landroidx/compose/material/icons/Icons$Rounded;",
        "getLayersClear",
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
        "SMAP\nLayersClear.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayersClear.kt\nandroidx/compose/material/icons/rounded/LayersClearKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,75:1\n212#2,12:76\n233#2,18:89\n253#2:126\n174#3:88\n705#4,2:107\n717#4,2:109\n719#4,11:115\n72#5,4:111\n*S KotlinDebug\n*F\n+ 1 LayersClear.kt\nandroidx/compose/material/icons/rounded/LayersClearKt\n*L\n29#1:76,12\n30#1:89,18\n30#1:126\n29#1:88\n30#1:107,2\n30#1:109,2\n30#1:115,11\n30#1:111,4\n*E\n"
    }
.end annotation


# static fields
.field private static _layersClear:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getLayersClear(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/LayersClearKt;->_layersClear:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.LayersClear"

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
    const v0, 0x411ca3d7    # 9.79f

    .line 71
    .line 72
    .line 73
    const v2, 0x419feb85    # 19.99f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const/16 v17, 0x0

    .line 80
    .line 81
    const v18, -0x4035c28f    # -1.58f

    .line 82
    .line 83
    .line 84
    const v13, 0x3f028f5c    # 0.51f

    .line 85
    .line 86
    .line 87
    const v14, -0x41333333    # -0.4f

    .line 88
    .line 89
    .line 90
    const v15, 0x3f028f5c    # 0.51f

    .line 91
    .line 92
    .line 93
    const v16, -0x4068f5c3    # -1.18f

    .line 94
    .line 95
    .line 96
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 97
    .line 98
    .line 99
    const v0, -0x3f27ae14    # -6.76f

    .line 100
    .line 101
    .line 102
    const v2, -0x3f57ae14    # -5.26f

    .line 103
    .line 104
    .line 105
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 106
    .line 107
    .line 108
    const v17, -0x3fe28f5c    # -2.46f

    .line 109
    .line 110
    .line 111
    const/16 v18, 0x0

    .line 112
    .line 113
    const v13, -0x40c7ae14    # -0.72f

    .line 114
    .line 115
    .line 116
    const v14, -0x40f0a3d7    # -0.56f

    .line 117
    .line 118
    .line 119
    const v15, -0x40228f5c    # -1.73f

    .line 120
    .line 121
    .line 122
    const v16, -0x40f0a3d7    # -0.56f

    .line 123
    .line 124
    .line 125
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 126
    .line 127
    .line 128
    const v0, 0x41168f5c    # 9.41f

    .line 129
    .line 130
    .line 131
    const v2, 0x4080a3d7    # 4.02f

    .line 132
    .line 133
    .line 134
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 135
    .line 136
    .line 137
    const v0, 0x40fc28f6    # 7.88f

    .line 138
    .line 139
    .line 140
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 141
    .line 142
    .line 143
    const v0, 0x402ccccd    # 2.7f

    .line 144
    .line 145
    .line 146
    const v2, -0x3ff8f5c3    # -2.11f

    .line 147
    .line 148
    .line 149
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 150
    .line 151
    .line 152
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 153
    .line 154
    .line 155
    const v0, 0x41547ae1    # 13.28f

    .line 156
    .line 157
    .line 158
    const v2, 0x419feb85    # 19.99f

    .line 159
    .line 160
    .line 161
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 162
    .line 163
    .line 164
    const v0, -0x43dc28f6    # -0.01f

    .line 165
    .line 166
    .line 167
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 168
    .line 169
    .line 170
    const v17, -0x4063d70a    # -1.22f

    .line 171
    .line 172
    .line 173
    const v13, -0x4147ae14    # -0.36f

    .line 174
    .line 175
    .line 176
    const v14, -0x4170a3d7    # -0.28f

    .line 177
    .line 178
    .line 179
    const v15, -0x40a3d70a    # -0.86f

    .line 180
    .line 181
    .line 182
    const v16, -0x4170a3d7    # -0.28f

    .line 183
    .line 184
    .line 185
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 186
    .line 187
    .line 188
    const v0, -0x42b33333    # -0.05f

    .line 189
    .line 190
    .line 191
    const v2, 0x3d23d70a    # 0.04f

    .line 192
    .line 193
    .line 194
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 195
    .line 196
    .line 197
    const v0, 0x3fb33333    # 1.4f

    .line 198
    .line 199
    .line 200
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 201
    .line 202
    .line 203
    const v17, -0x420a3d71    # -0.12f

    .line 204
    .line 205
    .line 206
    const v18, -0x4048f5c3    # -1.43f

    .line 207
    .line 208
    .line 209
    const v13, 0x3ebd70a4    # 0.37f

    .line 210
    .line 211
    .line 212
    const v14, -0x412e147b    # -0.41f

    .line 213
    .line 214
    .line 215
    const v15, 0x3eae147b    # 0.34f

    .line 216
    .line 217
    .line 218
    const v16, -0x40770a3d    # -1.07f

    .line 219
    .line 220
    .line 221
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 222
    .line 223
    .line 224
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 225
    .line 226
    .line 227
    const v0, 0x41ab851f    # 21.44f

    .line 228
    .line 229
    .line 230
    const v2, 0x41970a3d    # 18.88f

    .line 231
    .line 232
    .line 233
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 234
    .line 235
    .line 236
    const v0, 0x4083d70a    # 4.12f

    .line 237
    .line 238
    .line 239
    const v2, 0x3fc7ae14    # 1.56f

    .line 240
    .line 241
    .line 242
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 243
    .line 244
    .line 245
    const v17, -0x404b851f    # -1.41f

    .line 246
    .line 247
    .line 248
    const/16 v18, 0x0

    .line 249
    .line 250
    const v13, -0x413851ec    # -0.39f

    .line 251
    .line 252
    .line 253
    const v14, -0x413851ec    # -0.39f

    .line 254
    .line 255
    .line 256
    const v15, -0x407d70a4    # -1.02f

    .line 257
    .line 258
    .line 259
    const v16, -0x413851ec    # -0.39f

    .line 260
    .line 261
    .line 262
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 263
    .line 264
    .line 265
    const/16 v17, 0x0

    .line 266
    .line 267
    const v18, 0x3fb47ae1    # 1.41f

    .line 268
    .line 269
    .line 270
    const v14, 0x3ec7ae14    # 0.39f

    .line 271
    .line 272
    .line 273
    const v15, -0x413851ec    # -0.39f

    .line 274
    .line 275
    .line 276
    const v16, 0x3f828f5c    # 1.02f

    .line 277
    .line 278
    .line 279
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 280
    .line 281
    .line 282
    const v0, 0x406147ae    # 3.52f

    .line 283
    .line 284
    .line 285
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 286
    .line 287
    .line 288
    const v0, -0x3ff1eb85    # -2.22f

    .line 289
    .line 290
    .line 291
    const v2, 0x3fdc28f6    # 1.72f

    .line 292
    .line 293
    .line 294
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 295
    .line 296
    .line 297
    const v18, 0x3fca3d71    # 1.58f

    .line 298
    .line 299
    .line 300
    const v13, -0x40fd70a4    # -0.51f

    .line 301
    .line 302
    .line 303
    const v14, 0x3ecccccd    # 0.4f

    .line 304
    .line 305
    .line 306
    const v15, -0x40fd70a4    # -0.51f

    .line 307
    .line 308
    .line 309
    const v16, 0x3f970a3d    # 1.18f

    .line 310
    .line 311
    .line 312
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 313
    .line 314
    .line 315
    const v0, 0x40a851ec    # 5.26f

    .line 316
    .line 317
    .line 318
    const v2, 0x40d851ec    # 6.76f

    .line 319
    .line 320
    .line 321
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 322
    .line 323
    .line 324
    const v17, 0x401d70a4    # 2.46f

    .line 325
    .line 326
    .line 327
    const/16 v18, 0x0

    .line 328
    .line 329
    const v13, 0x3f3851ec    # 0.72f

    .line 330
    .line 331
    .line 332
    const v14, 0x3f0f5c29    # 0.56f

    .line 333
    .line 334
    .line 335
    const v15, 0x3fdd70a4    # 1.73f

    .line 336
    .line 337
    .line 338
    const v16, 0x3f0f5c29    # 0.56f

    .line 339
    .line 340
    .line 341
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 342
    .line 343
    .line 344
    const v0, 0x3f5eb852    # 0.87f

    .line 345
    .line 346
    .line 347
    const v2, -0x40d1eb85    # -0.68f

    .line 348
    .line 349
    .line 350
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 351
    .line 352
    .line 353
    const v0, 0x3fb5c28f    # 1.42f

    .line 354
    .line 355
    .line 356
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 357
    .line 358
    .line 359
    const v0, -0x3fc51eb8    # -2.92f

    .line 360
    .line 361
    .line 362
    const v2, 0x401147ae    # 2.27f

    .line 363
    .line 364
    .line 365
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 366
    .line 367
    .line 368
    const v17, -0x40628f5c    # -1.23f

    .line 369
    .line 370
    .line 371
    const v13, -0x4147ae14    # -0.36f

    .line 372
    .line 373
    .line 374
    const v14, 0x3e8f5c29    # 0.28f

    .line 375
    .line 376
    .line 377
    const v15, -0x40a147ae    # -0.87f

    .line 378
    .line 379
    .line 380
    const v16, 0x3e8f5c29    # 0.28f

    .line 381
    .line 382
    .line 383
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 384
    .line 385
    .line 386
    const v0, -0x3f3b3333    # -6.15f

    .line 387
    .line 388
    .line 389
    const v2, -0x3f670a3d    # -4.78f

    .line 390
    .line 391
    .line 392
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 393
    .line 394
    .line 395
    const v17, -0x4063d70a    # -1.22f

    .line 396
    .line 397
    .line 398
    const v14, -0x4170a3d7    # -0.28f

    .line 399
    .line 400
    .line 401
    const v15, -0x40a3d70a    # -0.86f

    .line 402
    .line 403
    .line 404
    const v16, -0x4170a3d7    # -0.28f

    .line 405
    .line 406
    .line 407
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 408
    .line 409
    .line 410
    const/16 v17, 0x0

    .line 411
    .line 412
    const v18, 0x3fc8f5c3    # 1.57f

    .line 413
    .line 414
    .line 415
    const v13, -0x40fd70a4    # -0.51f

    .line 416
    .line 417
    .line 418
    const v14, 0x3ecccccd    # 0.4f

    .line 419
    .line 420
    .line 421
    const v15, -0x40fd70a4    # -0.51f

    .line 422
    .line 423
    .line 424
    const v16, 0x3f95c28f    # 1.17f

    .line 425
    .line 426
    .line 427
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 428
    .line 429
    .line 430
    const v0, 0x40a851ec    # 5.26f

    .line 431
    .line 432
    .line 433
    const v2, 0x40d851ec    # 6.76f

    .line 434
    .line 435
    .line 436
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 437
    .line 438
    .line 439
    const v17, 0x401d70a4    # 2.46f

    .line 440
    .line 441
    .line 442
    const/16 v18, 0x0

    .line 443
    .line 444
    const v13, 0x3f3851ec    # 0.72f

    .line 445
    .line 446
    .line 447
    const v14, 0x3f0f5c29    # 0.56f

    .line 448
    .line 449
    .line 450
    const v15, 0x3fdd70a4    # 1.73f

    .line 451
    .line 452
    .line 453
    const v16, 0x3f0f5c29    # 0.56f

    .line 454
    .line 455
    .line 456
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 457
    .line 458
    .line 459
    const v0, 0x406e147b    # 3.72f

    .line 460
    .line 461
    .line 462
    const v2, -0x3fc70a3d    # -2.89f

    .line 463
    .line 464
    .line 465
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 466
    .line 467
    .line 468
    const v0, 0x40447ae1    # 3.07f

    .line 469
    .line 470
    .line 471
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 472
    .line 473
    .line 474
    const v17, 0x3fb47ae1    # 1.41f

    .line 475
    .line 476
    .line 477
    const v13, 0x3ec7ae14    # 0.39f

    .line 478
    .line 479
    .line 480
    const v14, 0x3ec7ae14    # 0.39f

    .line 481
    .line 482
    .line 483
    const v15, 0x3f828f5c    # 1.02f

    .line 484
    .line 485
    .line 486
    const v16, 0x3ec7ae14    # 0.39f

    .line 487
    .line 488
    .line 489
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 490
    .line 491
    .line 492
    const v17, 0x3ca3d70a    # 0.02f

    .line 493
    .line 494
    .line 495
    const v18, -0x404b851f    # -1.41f

    .line 496
    .line 497
    .line 498
    const v13, 0x3ed1eb85    # 0.41f

    .line 499
    .line 500
    .line 501
    const v14, -0x413851ec    # -0.39f

    .line 502
    .line 503
    .line 504
    const v15, 0x3ed1eb85    # 0.41f

    .line 505
    .line 506
    .line 507
    const v16, -0x407d70a4    # -1.02f

    .line 508
    .line 509
    .line 510
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 511
    .line 512
    .line 513
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 514
    .line 515
    .line 516
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 517
    .line 518
    .line 519
    move-result-object v2

    .line 520
    const/16 v16, 0x3800

    .line 521
    .line 522
    const/16 v17, 0x0

    .line 523
    .line 524
    const/high16 v6, 0x3f800000    # 1.0f

    .line 525
    .line 526
    const/high16 v8, 0x3f800000    # 1.0f

    .line 527
    .line 528
    const/4 v7, 0x0

    .line 529
    const/high16 v9, 0x3f800000    # 1.0f

    .line 530
    .line 531
    const/high16 v12, 0x3f800000    # 1.0f

    .line 532
    .line 533
    const/4 v13, 0x0

    .line 534
    const/4 v14, 0x0

    .line 535
    const/4 v15, 0x0

    .line 536
    const-string v4, ""

    .line 537
    .line 538
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 539
    .line 540
    .line 541
    move-result-object v0

    .line 542
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 543
    .line 544
    .line 545
    move-result-object v0

    .line 546
    sput-object v0, Landroidx/compose/material/icons/rounded/LayersClearKt;->_layersClear:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 547
    .line 548
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 549
    .line 550
    .line 551
    return-object v0
.end method
