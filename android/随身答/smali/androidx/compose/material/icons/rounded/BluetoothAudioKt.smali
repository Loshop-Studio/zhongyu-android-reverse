.class public final Landroidx/compose/material/icons/rounded/BluetoothAudioKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_bluetoothAudio",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "BluetoothAudio",
        "Landroidx/compose/material/icons/Icons$Rounded;",
        "getBluetoothAudio",
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
        "SMAP\nBluetoothAudio.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BluetoothAudio.kt\nandroidx/compose/material/icons/rounded/BluetoothAudioKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,86:1\n212#2,12:87\n233#2,18:100\n253#2:137\n174#3:99\n705#4,2:118\n717#4,2:120\n719#4,11:126\n72#5,4:122\n*S KotlinDebug\n*F\n+ 1 BluetoothAudio.kt\nandroidx/compose/material/icons/rounded/BluetoothAudioKt\n*L\n29#1:87,12\n30#1:100,18\n30#1:137\n29#1:99\n30#1:118,2\n30#1:120,2\n30#1:126,11\n30#1:122,4\n*E\n"
    }
.end annotation


# static fields
.field private static _bluetoothAudio:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getBluetoothAudio(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/BluetoothAudioKt;->_bluetoothAudio:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.BluetoothAudio"

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
    const v0, 0x417fae14    # 15.98f

    .line 71
    .line 72
    .line 73
    const v2, 0x41247ae1    # 10.28f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v0, -0x404f5c29    # -1.38f

    .line 80
    .line 81
    .line 82
    const v2, 0x3fb0a3d7    # 1.38f

    .line 83
    .line 84
    .line 85
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 86
    .line 87
    .line 88
    const/16 v17, 0x0

    .line 89
    .line 90
    const v18, 0x3f35c28f    # 0.71f

    .line 91
    .line 92
    .line 93
    const v13, -0x41b33333    # -0.2f

    .line 94
    .line 95
    .line 96
    const v14, 0x3e4ccccd    # 0.2f

    .line 97
    .line 98
    .line 99
    const v15, -0x41b33333    # -0.2f

    .line 100
    .line 101
    .line 102
    const v16, 0x3f028f5c    # 0.51f

    .line 103
    .line 104
    .line 105
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 106
    .line 107
    .line 108
    const v0, 0x3fb0a3d7    # 1.38f

    .line 109
    .line 110
    .line 111
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 112
    .line 113
    .line 114
    const v17, 0x3f59999a    # 0.85f

    .line 115
    .line 116
    .line 117
    const v18, -0x41947ae1    # -0.23f

    .line 118
    .line 119
    .line 120
    const v13, 0x3e8f5c29    # 0.28f

    .line 121
    .line 122
    .line 123
    const v14, 0x3e8f5c29    # 0.28f

    .line 124
    .line 125
    .line 126
    const/high16 v15, 0x3f400000    # 0.75f

    .line 127
    .line 128
    const v16, 0x3e19999a    # 0.15f

    .line 129
    .line 130
    .line 131
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 132
    .line 133
    .line 134
    const v17, 0x3e2e147b    # 0.17f

    .line 135
    .line 136
    .line 137
    const v18, -0x403d70a4    # -1.52f

    .line 138
    .line 139
    .line 140
    const v13, 0x3de147ae    # 0.11f

    .line 141
    .line 142
    .line 143
    const/high16 v14, -0x41000000    # -0.5f

    .line 144
    .line 145
    const v15, 0x3e2e147b    # 0.17f

    .line 146
    .line 147
    .line 148
    const/high16 v16, -0x40800000    # -1.0f

    .line 149
    .line 150
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 151
    .line 152
    .line 153
    const v17, -0x41c7ae14    # -0.18f

    .line 154
    .line 155
    .line 156
    const v18, -0x40428f5c    # -1.48f

    .line 157
    .line 158
    .line 159
    const/4 v13, 0x0

    .line 160
    const v14, -0x40fd70a4    # -0.51f

    .line 161
    .line 162
    .line 163
    const v15, -0x428a3d71    # -0.06f

    .line 164
    .line 165
    .line 166
    const v16, -0x407eb852    # -1.01f

    .line 167
    .line 168
    .line 169
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 170
    .line 171
    .line 172
    const v17, -0x40a8f5c3    # -0.84f

    .line 173
    .line 174
    .line 175
    const v18, -0x418a3d71    # -0.24f

    .line 176
    .line 177
    .line 178
    const v13, -0x4247ae14    # -0.09f

    .line 179
    .line 180
    .line 181
    const v14, -0x413d70a4    # -0.38f

    .line 182
    .line 183
    .line 184
    const v15, -0x40f0a3d7    # -0.56f

    .line 185
    .line 186
    .line 187
    const v16, -0x40fae148    # -0.52f

    .line 188
    .line 189
    .line 190
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 191
    .line 192
    .line 193
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 194
    .line 195
    .line 196
    const v0, 0x41a0cccd    # 20.1f

    .line 197
    .line 198
    .line 199
    const v2, 0x40f8f5c3    # 7.78f

    .line 200
    .line 201
    .line 202
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 203
    .line 204
    .line 205
    const v17, -0x404ccccd    # -1.4f

    .line 206
    .line 207
    .line 208
    const/high16 v13, -0x41800000    # -0.25f

    .line 209
    .line 210
    const v14, -0x40f33333    # -0.55f

    .line 211
    .line 212
    .line 213
    const v15, -0x40851eb8    # -0.98f

    .line 214
    .line 215
    .line 216
    const v16, -0x40d47ae1    # -0.67f

    .line 217
    .line 218
    .line 219
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 220
    .line 221
    .line 222
    const v17, -0x41d1eb85    # -0.17f

    .line 223
    .line 224
    .line 225
    const v18, 0x3f7ae148    # 0.98f

    .line 226
    .line 227
    .line 228
    const v13, -0x417ae148    # -0.26f

    .line 229
    .line 230
    .line 231
    const v14, 0x3e851eb8    # 0.26f

    .line 232
    .line 233
    .line 234
    const v15, -0x416147ae    # -0.31f

    .line 235
    .line 236
    .line 237
    const v16, 0x3f23d70a    # 0.64f

    .line 238
    .line 239
    .line 240
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 241
    .line 242
    .line 243
    const v17, 0x3f3851ec    # 0.72f

    .line 244
    .line 245
    .line 246
    const v18, 0x405e147b    # 3.47f

    .line 247
    .line 248
    .line 249
    const v13, 0x3eeb851f    # 0.46f

    .line 250
    .line 251
    .line 252
    const v14, 0x3f88f5c3    # 1.07f

    .line 253
    .line 254
    .line 255
    const v15, 0x3f3851ec    # 0.72f

    .line 256
    .line 257
    .line 258
    const v16, 0x400f5c29    # 2.24f

    .line 259
    .line 260
    .line 261
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 262
    .line 263
    .line 264
    const v17, -0x40c51eb8    # -0.73f

    .line 265
    .line 266
    .line 267
    const v18, 0x405f5c29    # 3.49f

    .line 268
    .line 269
    .line 270
    const/4 v13, 0x0

    .line 271
    const v14, 0x3f9eb852    # 1.24f

    .line 272
    .line 273
    .line 274
    const v15, -0x417ae148    # -0.26f

    .line 275
    .line 276
    .line 277
    const v16, 0x401ae148    # 2.42f

    .line 278
    .line 279
    .line 280
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 281
    .line 282
    .line 283
    const v17, 0x3e23d70a    # 0.16f

    .line 284
    .line 285
    .line 286
    const v18, 0x3f70a3d7    # 0.94f

    .line 287
    .line 288
    .line 289
    const v13, -0x41f0a3d7    # -0.14f

    .line 290
    .line 291
    .line 292
    const v14, 0x3ea3d70a    # 0.32f

    .line 293
    .line 294
    .line 295
    const v15, -0x4247ae14    # -0.09f

    .line 296
    .line 297
    .line 298
    const v16, 0x3f30a3d7    # 0.69f

    .line 299
    .line 300
    .line 301
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 302
    .line 303
    .line 304
    const v17, 0x3faccccd    # 1.35f

    .line 305
    .line 306
    .line 307
    const v18, -0x41947ae1    # -0.23f

    .line 308
    .line 309
    .line 310
    const v13, 0x3ed1eb85    # 0.41f

    .line 311
    .line 312
    .line 313
    const v14, 0x3ed1eb85    # 0.41f

    .line 314
    .line 315
    .line 316
    const v15, 0x3f8ccccd    # 1.1f

    .line 317
    .line 318
    .line 319
    const v16, 0x3e947ae1    # 0.29f

    .line 320
    .line 321
    .line 322
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 323
    .line 324
    .line 325
    const v17, 0x3f7ae148    # 0.98f

    .line 326
    .line 327
    .line 328
    const v18, -0x3f766666    # -4.3f

    .line 329
    .line 330
    .line 331
    const v13, 0x3f2147ae    # 0.63f

    .line 332
    .line 333
    .line 334
    const v14, -0x4059999a    # -1.3f

    .line 335
    .line 336
    .line 337
    const v15, 0x3f7ae148    # 0.98f

    .line 338
    .line 339
    .line 340
    const v16, -0x3fcf5c29    # -2.76f

    .line 341
    .line 342
    .line 343
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 344
    .line 345
    .line 346
    const v17, -0x40970a3d    # -0.91f

    .line 347
    .line 348
    .line 349
    const v18, -0x3f7c7ae1    # -4.11f

    .line 350
    .line 351
    .line 352
    const v13, -0x43dc28f6    # -0.01f

    .line 353
    .line 354
    .line 355
    const v14, -0x40466666    # -1.45f

    .line 356
    .line 357
    .line 358
    const v15, -0x41570a3d    # -0.33f

    .line 359
    .line 360
    .line 361
    const v16, -0x3fc9999a    # -2.85f

    .line 362
    .line 363
    .line 364
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 365
    .line 366
    .line 367
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 368
    .line 369
    .line 370
    const v0, 0x41363d71    # 11.39f

    .line 371
    .line 372
    .line 373
    const/high16 v2, 0x41400000    # 12.0f

    .line 374
    .line 375
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 376
    .line 377
    .line 378
    const v0, 0x4065c28f    # 3.59f

    .line 379
    .line 380
    .line 381
    const v2, -0x3f9ae148    # -3.58f

    .line 382
    .line 383
    .line 384
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 385
    .line 386
    .line 387
    const/16 v17, 0x0

    .line 388
    .line 389
    const v18, -0x404a3d71    # -1.42f

    .line 390
    .line 391
    .line 392
    const v13, 0x3ec7ae14    # 0.39f

    .line 393
    .line 394
    .line 395
    const v14, -0x413851ec    # -0.39f

    .line 396
    .line 397
    .line 398
    const v15, 0x3ec7ae14    # 0.39f

    .line 399
    .line 400
    .line 401
    const v16, -0x407d70a4    # -1.02f

    .line 402
    .line 403
    .line 404
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 405
    .line 406
    .line 407
    const v0, -0x3f76b852    # -4.29f

    .line 408
    .line 409
    .line 410
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 411
    .line 412
    .line 413
    const v17, -0x40251eb8    # -1.71f

    .line 414
    .line 415
    .line 416
    const v18, 0x3f35c28f    # 0.71f

    .line 417
    .line 418
    .line 419
    const v13, -0x40deb852    # -0.63f

    .line 420
    .line 421
    .line 422
    const v14, -0x40deb852    # -0.63f

    .line 423
    .line 424
    .line 425
    const v15, -0x40251eb8    # -1.71f

    .line 426
    .line 427
    .line 428
    const v16, -0x41c7ae14    # -0.18f

    .line 429
    .line 430
    .line 431
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 432
    .line 433
    .line 434
    const v0, 0x410fae14    # 8.98f

    .line 435
    .line 436
    .line 437
    const v2, 0x4119999a    # 9.6f

    .line 438
    .line 439
    .line 440
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 441
    .line 442
    .line 443
    const v0, 0x40a2e148    # 5.09f

    .line 444
    .line 445
    .line 446
    const v2, 0x40b66666    # 5.7f

    .line 447
    .line 448
    .line 449
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 450
    .line 451
    .line 452
    const v17, -0x404b851f    # -1.41f

    .line 453
    .line 454
    .line 455
    const/16 v18, 0x0

    .line 456
    .line 457
    const v13, -0x413851ec    # -0.39f

    .line 458
    .line 459
    .line 460
    const v14, -0x413851ec    # -0.39f

    .line 461
    .line 462
    .line 463
    const v15, -0x407d70a4    # -1.02f

    .line 464
    .line 465
    .line 466
    const v16, -0x413851ec    # -0.39f

    .line 467
    .line 468
    .line 469
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 470
    .line 471
    .line 472
    const/16 v17, 0x0

    .line 473
    .line 474
    const v18, 0x3fb47ae1    # 1.41f

    .line 475
    .line 476
    .line 477
    const v14, 0x3ec7ae14    # 0.39f

    .line 478
    .line 479
    .line 480
    const v15, -0x413851ec    # -0.39f

    .line 481
    .line 482
    .line 483
    const v16, 0x3f828f5c    # 1.02f

    .line 484
    .line 485
    .line 486
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 487
    .line 488
    .line 489
    const v0, 0x41091eb8    # 8.57f

    .line 490
    .line 491
    .line 492
    const/high16 v2, 0x41400000    # 12.0f

    .line 493
    .line 494
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 495
    .line 496
    .line 497
    const v0, -0x3f63851f    # -4.89f

    .line 498
    .line 499
    .line 500
    const v2, 0x409c7ae1    # 4.89f

    .line 501
    .line 502
    .line 503
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 504
    .line 505
    .line 506
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 507
    .line 508
    .line 509
    const v17, 0x3fb47ae1    # 1.41f

    .line 510
    .line 511
    .line 512
    const/16 v18, 0x0

    .line 513
    .line 514
    const v13, 0x3ec7ae14    # 0.39f

    .line 515
    .line 516
    .line 517
    const v15, 0x3f828f5c    # 1.02f

    .line 518
    .line 519
    .line 520
    const v16, 0x3ec7ae14    # 0.39f

    .line 521
    .line 522
    .line 523
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 524
    .line 525
    .line 526
    const v0, 0x4078f5c3    # 3.89f

    .line 527
    .line 528
    .line 529
    const v2, -0x3f870a3d    # -3.89f

    .line 530
    .line 531
    .line 532
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 533
    .line 534
    .line 535
    const v0, 0x40c5c28f    # 6.18f

    .line 536
    .line 537
    .line 538
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 539
    .line 540
    .line 541
    const v17, 0x3fdae148    # 1.71f

    .line 542
    .line 543
    .line 544
    const v18, 0x3f35c28f    # 0.71f

    .line 545
    .line 546
    .line 547
    const/4 v13, 0x0

    .line 548
    const v14, 0x3f63d70a    # 0.89f

    .line 549
    .line 550
    .line 551
    const v15, 0x3f8a3d71    # 1.08f

    .line 552
    .line 553
    .line 554
    const v16, 0x3fab851f    # 1.34f

    .line 555
    .line 556
    .line 557
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 558
    .line 559
    .line 560
    const v0, 0x4089999a    # 4.3f

    .line 561
    .line 562
    .line 563
    const v2, -0x3f766666    # -4.3f

    .line 564
    .line 565
    .line 566
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 567
    .line 568
    .line 569
    const/16 v17, 0x0

    .line 570
    .line 571
    const v18, -0x404a3d71    # -1.42f

    .line 572
    .line 573
    .line 574
    const v13, 0x3ec7ae14    # 0.39f

    .line 575
    .line 576
    .line 577
    const v14, -0x413851ec    # -0.39f

    .line 578
    .line 579
    .line 580
    const v15, 0x3ec7ae14    # 0.39f

    .line 581
    .line 582
    .line 583
    const v16, -0x407d70a4    # -1.02f

    .line 584
    .line 585
    .line 586
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 587
    .line 588
    .line 589
    const v0, 0x41363d71    # 11.39f

    .line 590
    .line 591
    .line 592
    const/high16 v2, 0x41400000    # 12.0f

    .line 593
    .line 594
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 595
    .line 596
    .line 597
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 598
    .line 599
    .line 600
    const v0, 0x40ba8f5c    # 5.83f

    .line 601
    .line 602
    .line 603
    const v2, 0x412fae14    # 10.98f

    .line 604
    .line 605
    .line 606
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 607
    .line 608
    .line 609
    const v0, 0x3ff0a3d7    # 1.88f

    .line 610
    .line 611
    .line 612
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 613
    .line 614
    .line 615
    const v0, -0x400f5c29    # -1.88f

    .line 616
    .line 617
    .line 618
    const v2, 0x3ff0a3d7    # 1.88f

    .line 619
    .line 620
    .line 621
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 622
    .line 623
    .line 624
    const v0, 0x40ba8f5c    # 5.83f

    .line 625
    .line 626
    .line 627
    const v2, 0x412fae14    # 10.98f

    .line 628
    .line 629
    .line 630
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 631
    .line 632
    .line 633
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 634
    .line 635
    .line 636
    const v0, 0x41915c29    # 18.17f

    .line 637
    .line 638
    .line 639
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 640
    .line 641
    .line 642
    const v0, -0x3f8f5c29    # -3.76f

    .line 643
    .line 644
    .line 645
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 646
    .line 647
    .line 648
    const v0, 0x3ff0a3d7    # 1.88f

    .line 649
    .line 650
    .line 651
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 652
    .line 653
    .line 654
    const v0, -0x400f5c29    # -1.88f

    .line 655
    .line 656
    .line 657
    const v2, 0x3ff0a3d7    # 1.88f

    .line 658
    .line 659
    .line 660
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 661
    .line 662
    .line 663
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 664
    .line 665
    .line 666
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 667
    .line 668
    .line 669
    move-result-object v2

    .line 670
    const/16 v16, 0x3800

    .line 671
    .line 672
    const/16 v17, 0x0

    .line 673
    .line 674
    const/high16 v6, 0x3f800000    # 1.0f

    .line 675
    .line 676
    const/high16 v8, 0x3f800000    # 1.0f

    .line 677
    .line 678
    const/4 v7, 0x0

    .line 679
    const/high16 v9, 0x3f800000    # 1.0f

    .line 680
    .line 681
    const/high16 v12, 0x3f800000    # 1.0f

    .line 682
    .line 683
    const/4 v13, 0x0

    .line 684
    const/4 v14, 0x0

    .line 685
    const/4 v15, 0x0

    .line 686
    const-string v4, ""

    .line 687
    .line 688
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 689
    .line 690
    .line 691
    move-result-object v0

    .line 692
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 693
    .line 694
    .line 695
    move-result-object v0

    .line 696
    sput-object v0, Landroidx/compose/material/icons/rounded/BluetoothAudioKt;->_bluetoothAudio:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 697
    .line 698
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 699
    .line 700
    .line 701
    return-object v0
.end method
