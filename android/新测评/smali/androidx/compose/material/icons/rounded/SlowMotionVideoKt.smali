.class public final Landroidx/compose/material/icons/rounded/SlowMotionVideoKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_slowMotionVideo",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "SlowMotionVideo",
        "Landroidx/compose/material/icons/Icons$Rounded;",
        "getSlowMotionVideo",
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
        "SMAP\nSlowMotionVideo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SlowMotionVideo.kt\nandroidx/compose/material/icons/rounded/SlowMotionVideoKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,87:1\n212#2,12:88\n233#2,18:101\n253#2:138\n174#3:100\n705#4,2:119\n717#4,2:121\n719#4,11:127\n72#5,4:123\n*S KotlinDebug\n*F\n+ 1 SlowMotionVideo.kt\nandroidx/compose/material/icons/rounded/SlowMotionVideoKt\n*L\n29#1:88,12\n30#1:101,18\n30#1:138\n29#1:100\n30#1:119,2\n30#1:121,2\n30#1:127,11\n30#1:123,4\n*E\n"
    }
.end annotation


# static fields
.field private static _slowMotionVideo:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getSlowMotionVideo(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/SlowMotionVideoKt;->_slowMotionVideo:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.SlowMotionVideo"

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
    const/high16 v0, 0x41200000    # 10.0f

    .line 71
    .line 72
    const/high16 v2, 0x41080000    # 8.5f

    .line 73
    .line 74
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v0, 0x40e00000    # 7.0f

    .line 78
    .line 79
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 80
    .line 81
    .line 82
    const v17, 0x3f4ccccd    # 0.8f

    .line 83
    .line 84
    .line 85
    const v18, 0x3ecccccd    # 0.4f

    .line 86
    .line 87
    .line 88
    const/4 v13, 0x0

    .line 89
    const v14, 0x3ed1eb85    # 0.41f

    .line 90
    .line 91
    .line 92
    const v15, 0x3ef0a3d7    # 0.47f

    .line 93
    .line 94
    .line 95
    const v16, 0x3f266666    # 0.65f

    .line 96
    .line 97
    .line 98
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 99
    .line 100
    .line 101
    const v0, 0x409570a4    # 4.67f

    .line 102
    .line 103
    .line 104
    const/high16 v2, -0x3fa00000    # -3.5f

    .line 105
    .line 106
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 107
    .line 108
    .line 109
    const/16 v17, 0x0

    .line 110
    .line 111
    const v18, -0x40b33333    # -0.8f

    .line 112
    .line 113
    .line 114
    const v13, 0x3e8a3d71    # 0.27f

    .line 115
    .line 116
    .line 117
    const v14, -0x41b33333    # -0.2f

    .line 118
    .line 119
    .line 120
    const v15, 0x3e8a3d71    # 0.27f

    .line 121
    .line 122
    .line 123
    const v16, -0x40e66666    # -0.6f

    .line 124
    .line 125
    .line 126
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 127
    .line 128
    .line 129
    const v0, 0x412ccccd    # 10.8f

    .line 130
    .line 131
    .line 132
    const v2, 0x4101999a    # 8.1f

    .line 133
    .line 134
    .line 135
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 136
    .line 137
    .line 138
    const v17, -0x40b33333    # -0.8f

    .line 139
    .line 140
    .line 141
    const v18, 0x3ecccccd    # 0.4f

    .line 142
    .line 143
    .line 144
    const v13, -0x41570a3d    # -0.33f

    .line 145
    .line 146
    .line 147
    const/high16 v14, -0x41800000    # -0.25f

    .line 148
    .line 149
    const v15, -0x40b33333    # -0.8f

    .line 150
    .line 151
    .line 152
    const v16, -0x43dc28f6    # -0.01f

    .line 153
    .line 154
    .line 155
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 156
    .line 157
    .line 158
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 159
    .line 160
    .line 161
    const/high16 v0, 0x41300000    # 11.0f

    .line 162
    .line 163
    const v2, 0x404eb852    # 3.23f

    .line 164
    .line 165
    .line 166
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 167
    .line 168
    .line 169
    const v17, -0x40651eb8    # -1.21f

    .line 170
    .line 171
    .line 172
    const v18, -0x40828f5c    # -0.99f

    .line 173
    .line 174
    .line 175
    const/4 v13, 0x0

    .line 176
    const v14, -0x40dc28f6    # -0.64f

    .line 177
    .line 178
    .line 179
    const v15, -0x40e8f5c3    # -0.59f

    .line 180
    .line 181
    .line 182
    const v16, -0x406f5c29    # -1.13f

    .line 183
    .line 184
    .line 185
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 186
    .line 187
    .line 188
    const v17, -0x3fb851ec    # -3.12f

    .line 189
    .line 190
    .line 191
    const v18, 0x3fa66666    # 1.3f

    .line 192
    .line 193
    .line 194
    const v13, -0x4070a3d7    # -1.12f

    .line 195
    .line 196
    .line 197
    const v14, 0x3e851eb8    # 0.26f

    .line 198
    .line 199
    .line 200
    const v15, -0x3ff47ae1    # -2.18f

    .line 201
    .line 202
    .line 203
    const v16, 0x3f333333    # 0.7f

    .line 204
    .line 205
    .line 206
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 207
    .line 208
    .line 209
    const v17, -0x41dc28f6    # -0.16f

    .line 210
    .line 211
    .line 212
    const v18, 0x3fc66666    # 1.55f

    .line 213
    .line 214
    .line 215
    const v13, -0x40f851ec    # -0.53f

    .line 216
    .line 217
    .line 218
    const v14, 0x3eae147b    # 0.34f

    .line 219
    .line 220
    .line 221
    const v15, -0x40e3d70a    # -0.61f

    .line 222
    .line 223
    .line 224
    const v16, 0x3f8ccccd    # 1.1f

    .line 225
    .line 226
    .line 227
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 228
    .line 229
    .line 230
    const v17, 0x3f9ae148    # 1.21f

    .line 231
    .line 232
    .line 233
    const v18, 0x3e23d70a    # 0.16f

    .line 234
    .line 235
    .line 236
    const v13, 0x3ea3d70a    # 0.32f

    .line 237
    .line 238
    .line 239
    const v14, 0x3ea3d70a    # 0.32f

    .line 240
    .line 241
    .line 242
    const v15, 0x3f547ae1    # 0.83f

    .line 243
    .line 244
    .line 245
    const v16, 0x3ecccccd    # 0.4f

    .line 246
    .line 247
    .line 248
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 249
    .line 250
    .line 251
    const v17, 0x40228f5c    # 2.54f

    .line 252
    .line 253
    .line 254
    const v18, -0x4079999a    # -1.05f

    .line 255
    .line 256
    .line 257
    const v13, 0x3f451eb8    # 0.77f

    .line 258
    .line 259
    .line 260
    const v14, -0x41051eb8    # -0.49f

    .line 261
    .line 262
    .line 263
    const v15, 0x3fcf5c29    # 1.62f

    .line 264
    .line 265
    .line 266
    const v16, -0x40a66666    # -0.85f

    .line 267
    .line 268
    .line 269
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 270
    .line 271
    .line 272
    const v17, 0x3f3d70a4    # 0.74f

    .line 273
    .line 274
    .line 275
    const v18, -0x4087ae14    # -0.97f

    .line 276
    .line 277
    .line 278
    const v13, 0x3ee147ae    # 0.44f

    .line 279
    .line 280
    .line 281
    const v14, -0x42333333    # -0.1f

    .line 282
    .line 283
    .line 284
    const v15, 0x3f3d70a4    # 0.74f

    .line 285
    .line 286
    .line 287
    const v16, -0x40fd70a4    # -0.51f

    .line 288
    .line 289
    .line 290
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 291
    .line 292
    .line 293
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 294
    .line 295
    .line 296
    const v0, 0x40a33333    # 5.1f

    .line 297
    .line 298
    .line 299
    const v2, 0x40d051ec    # 6.51f

    .line 300
    .line 301
    .line 302
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 303
    .line 304
    .line 305
    const v17, -0x4039999a    # -1.55f

    .line 306
    .line 307
    .line 308
    const v18, 0x3e23d70a    # 0.16f

    .line 309
    .line 310
    .line 311
    const v13, -0x41147ae1    # -0.46f

    .line 312
    .line 313
    .line 314
    const v14, -0x4119999a    # -0.45f

    .line 315
    .line 316
    .line 317
    const v15, -0x40651eb8    # -1.21f

    .line 318
    .line 319
    .line 320
    const v16, -0x413d70a4    # -0.38f

    .line 321
    .line 322
    .line 323
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 324
    .line 325
    .line 326
    const v17, -0x4059999a    # -1.3f

    .line 327
    .line 328
    .line 329
    const v18, 0x4047ae14    # 3.12f

    .line 330
    .line 331
    .line 332
    const v13, -0x40e66666    # -0.6f

    .line 333
    .line 334
    .line 335
    const v14, 0x3f70a3d7    # 0.94f

    .line 336
    .line 337
    .line 338
    const v15, -0x407ae148    # -1.04f

    .line 339
    .line 340
    .line 341
    const/high16 v16, 0x40000000    # 2.0f

    .line 342
    .line 343
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 344
    .line 345
    .line 346
    const v17, 0x3f7ae148    # 0.98f

    .line 347
    .line 348
    .line 349
    const v18, 0x3f9ae148    # 1.21f

    .line 350
    .line 351
    .line 352
    const v13, -0x41f0a3d7    # -0.14f

    .line 353
    .line 354
    .line 355
    const v14, 0x3f1eb852    # 0.62f

    .line 356
    .line 357
    .line 358
    const v15, 0x3eae147b    # 0.34f

    .line 359
    .line 360
    .line 361
    const v16, 0x3f9ae148    # 1.21f

    .line 362
    .line 363
    .line 364
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 365
    .line 366
    .line 367
    const v17, 0x3f75c28f    # 0.96f

    .line 368
    .line 369
    .line 370
    const v18, -0x40c28f5c    # -0.74f

    .line 371
    .line 372
    .line 373
    const v13, 0x3ee66666    # 0.45f

    .line 374
    .line 375
    .line 376
    const/4 v14, 0x0

    .line 377
    const v15, 0x3f5eb852    # 0.87f

    .line 378
    .line 379
    .line 380
    const v16, -0x41666666    # -0.3f

    .line 381
    .line 382
    .line 383
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 384
    .line 385
    .line 386
    const v17, 0x3f866666    # 1.05f

    .line 387
    .line 388
    .line 389
    const v18, -0x3fde147b    # -2.53f

    .line 390
    .line 391
    .line 392
    const v13, 0x3e4ccccd    # 0.2f

    .line 393
    .line 394
    .line 395
    const v14, -0x40970a3d    # -0.91f

    .line 396
    .line 397
    .line 398
    const v15, 0x3f11eb85    # 0.57f

    .line 399
    .line 400
    .line 401
    const v16, -0x401d70a4    # -1.77f

    .line 402
    .line 403
    .line 404
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 405
    .line 406
    .line 407
    const v17, -0x41f0a3d7    # -0.14f

    .line 408
    .line 409
    .line 410
    const v18, -0x4063d70a    # -1.22f

    .line 411
    .line 412
    .line 413
    const v13, 0x3e851eb8    # 0.26f

    .line 414
    .line 415
    .line 416
    const v14, -0x413851ec    # -0.39f

    .line 417
    .line 418
    .line 419
    const v15, 0x3e3851ec    # 0.18f

    .line 420
    .line 421
    .line 422
    const v16, -0x4099999a    # -0.9f

    .line 423
    .line 424
    .line 425
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 426
    .line 427
    .line 428
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 429
    .line 430
    .line 431
    const/high16 v0, 0x41500000    # 13.0f

    .line 432
    .line 433
    const v2, 0x404eb852    # 3.23f

    .line 434
    .line 435
    .line 436
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 437
    .line 438
    .line 439
    const v17, -0x40828f5c    # -0.99f

    .line 440
    .line 441
    .line 442
    const v18, 0x3f9ae148    # 1.21f

    .line 443
    .line 444
    .line 445
    const v13, -0x40dc28f6    # -0.64f

    .line 446
    .line 447
    .line 448
    const/4 v14, 0x0

    .line 449
    const v15, -0x406f5c29    # -1.13f

    .line 450
    .line 451
    .line 452
    const v16, 0x3f170a3d    # 0.59f

    .line 453
    .line 454
    .line 455
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 456
    .line 457
    .line 458
    const v17, 0x3fa66666    # 1.3f

    .line 459
    .line 460
    .line 461
    const v18, 0x4047ae14    # 3.12f

    .line 462
    .line 463
    .line 464
    const v13, 0x3e851eb8    # 0.26f

    .line 465
    .line 466
    .line 467
    const v14, 0x3f8f5c29    # 1.12f

    .line 468
    .line 469
    .line 470
    const v15, 0x3f333333    # 0.7f

    .line 471
    .line 472
    .line 473
    const v16, 0x400ae148    # 2.17f

    .line 474
    .line 475
    .line 476
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 477
    .line 478
    .line 479
    const v17, 0x3fc66666    # 1.55f

    .line 480
    .line 481
    .line 482
    const v18, 0x3e23d70a    # 0.16f

    .line 483
    .line 484
    .line 485
    const v13, 0x3eae147b    # 0.34f

    .line 486
    .line 487
    .line 488
    const v14, 0x3f0a3d71    # 0.54f

    .line 489
    .line 490
    .line 491
    const v15, 0x3f8ccccd    # 1.1f

    .line 492
    .line 493
    .line 494
    const v16, 0x3f1c28f6    # 0.61f

    .line 495
    .line 496
    .line 497
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 498
    .line 499
    .line 500
    const v17, 0x3e19999a    # 0.15f

    .line 501
    .line 502
    .line 503
    const v18, -0x40651eb8    # -1.21f

    .line 504
    .line 505
    .line 506
    const v13, 0x3ea3d70a    # 0.32f

    .line 507
    .line 508
    .line 509
    const v14, -0x415c28f6    # -0.32f

    .line 510
    .line 511
    .line 512
    const v15, 0x3ecccccd    # 0.4f

    .line 513
    .line 514
    .line 515
    const v16, -0x40ab851f    # -0.83f

    .line 516
    .line 517
    .line 518
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 519
    .line 520
    .line 521
    const v17, -0x4079999a    # -1.05f

    .line 522
    .line 523
    .line 524
    const v18, -0x3fde147b    # -2.53f

    .line 525
    .line 526
    .line 527
    const v13, -0x41051eb8    # -0.49f

    .line 528
    .line 529
    .line 530
    const v14, -0x40bd70a4    # -0.76f

    .line 531
    .line 532
    .line 533
    const v15, -0x40a66666    # -0.85f

    .line 534
    .line 535
    .line 536
    const v16, -0x4031eb85    # -1.61f

    .line 537
    .line 538
    .line 539
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 540
    .line 541
    .line 542
    const v17, -0x408a3d71    # -0.96f

    .line 543
    .line 544
    .line 545
    const/high16 v18, -0x40c00000    # -0.75f

    .line 546
    .line 547
    const v13, -0x4247ae14    # -0.09f

    .line 548
    .line 549
    .line 550
    const v14, -0x4119999a    # -0.45f

    .line 551
    .line 552
    .line 553
    const/high16 v15, -0x41000000    # -0.5f

    .line 554
    .line 555
    const/high16 v16, -0x40c00000    # -0.75f

    .line 556
    .line 557
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 558
    .line 559
    .line 560
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 561
    .line 562
    .line 563
    const v0, 0x40d570a4    # 6.67f

    .line 564
    .line 565
    .line 566
    const v2, 0x41a3999a    # 20.45f

    .line 567
    .line 568
    .line 569
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 570
    .line 571
    .line 572
    const v17, 0x4047ae14    # 3.12f

    .line 573
    .line 574
    .line 575
    const v18, 0x3fa66666    # 1.3f

    .line 576
    .line 577
    .line 578
    const v13, 0x3f733333    # 0.95f

    .line 579
    .line 580
    .line 581
    const v14, 0x3f19999a    # 0.6f

    .line 582
    .line 583
    .line 584
    const/high16 v15, 0x40000000    # 2.0f

    .line 585
    .line 586
    const v16, 0x3f851eb8    # 1.04f

    .line 587
    .line 588
    .line 589
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 590
    .line 591
    .line 592
    const v17, 0x3f9ae148    # 1.21f

    .line 593
    .line 594
    .line 595
    const v18, -0x40851eb8    # -0.98f

    .line 596
    .line 597
    .line 598
    const v13, 0x3f1eb852    # 0.62f

    .line 599
    .line 600
    .line 601
    const v14, 0x3e0f5c29    # 0.14f

    .line 602
    .line 603
    .line 604
    const v15, 0x3f9ae148    # 1.21f

    .line 605
    .line 606
    .line 607
    const v16, -0x414ccccd    # -0.35f

    .line 608
    .line 609
    .line 610
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 611
    .line 612
    .line 613
    const v17, -0x40c28f5c    # -0.74f

    .line 614
    .line 615
    .line 616
    const v18, -0x408a3d71    # -0.96f

    .line 617
    .line 618
    .line 619
    const/4 v13, 0x0

    .line 620
    const v14, -0x4119999a    # -0.45f

    .line 621
    .line 622
    .line 623
    const v15, -0x41666666    # -0.3f

    .line 624
    .line 625
    .line 626
    const v16, -0x40a147ae    # -0.87f

    .line 627
    .line 628
    .line 629
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 630
    .line 631
    .line 632
    const v17, -0x3fde147b    # -2.53f

    .line 633
    .line 634
    .line 635
    const v18, -0x4079999a    # -1.05f

    .line 636
    .line 637
    .line 638
    const v13, -0x40970a3d    # -0.91f

    .line 639
    .line 640
    .line 641
    const v14, -0x41b33333    # -0.2f

    .line 642
    .line 643
    .line 644
    const v15, -0x401d70a4    # -1.77f

    .line 645
    .line 646
    .line 647
    const v16, -0x40ee147b    # -0.57f

    .line 648
    .line 649
    .line 650
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 651
    .line 652
    .line 653
    const v17, -0x40651eb8    # -1.21f

    .line 654
    .line 655
    .line 656
    const v18, 0x3e23d70a    # 0.16f

    .line 657
    .line 658
    .line 659
    const v13, -0x413851ec    # -0.39f

    .line 660
    .line 661
    .line 662
    const v14, -0x418a3d71    # -0.24f

    .line 663
    .line 664
    .line 665
    const v15, -0x409c28f6    # -0.89f

    .line 666
    .line 667
    .line 668
    const v16, -0x41d1eb85    # -0.17f

    .line 669
    .line 670
    .line 671
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 672
    .line 673
    .line 674
    const v17, 0x3e19999a    # 0.15f

    .line 675
    .line 676
    .line 677
    const v18, 0x3fc3d70a    # 1.53f

    .line 678
    .line 679
    .line 680
    const v13, -0x41147ae1    # -0.46f

    .line 681
    .line 682
    .line 683
    const v14, 0x3ee147ae    # 0.44f

    .line 684
    .line 685
    .line 686
    const v15, -0x413851ec    # -0.39f

    .line 687
    .line 688
    .line 689
    const v16, 0x3f9851ec    # 1.19f

    .line 690
    .line 691
    .line 692
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 693
    .line 694
    .line 695
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 696
    .line 697
    .line 698
    const/high16 v0, 0x41b00000    # 22.0f

    .line 699
    .line 700
    const/high16 v2, 0x41400000    # 12.0f

    .line 701
    .line 702
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 703
    .line 704
    .line 705
    const v17, -0x3f08a3d7    # -7.73f

    .line 706
    .line 707
    .line 708
    const v18, 0x411bd70a    # 9.74f

    .line 709
    .line 710
    .line 711
    const/4 v13, 0x0

    .line 712
    const v14, 0x40975c29    # 4.73f

    .line 713
    .line 714
    .line 715
    const v15, -0x3faccccd    # -3.3f

    .line 716
    .line 717
    .line 718
    const v16, 0x410b5c29    # 8.71f

    .line 719
    .line 720
    .line 721
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 722
    .line 723
    .line 724
    const v17, -0x4063d70a    # -1.22f

    .line 725
    .line 726
    .line 727
    const v18, -0x40851eb8    # -0.98f

    .line 728
    .line 729
    .line 730
    const v13, -0x40e147ae    # -0.62f

    .line 731
    .line 732
    .line 733
    const v14, 0x3e19999a    # 0.15f

    .line 734
    .line 735
    .line 736
    const v15, -0x4063d70a    # -1.22f

    .line 737
    .line 738
    .line 739
    const v16, -0x4151eb85    # -0.34f

    .line 740
    .line 741
    .line 742
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 743
    .line 744
    .line 745
    const/high16 v17, 0x3f400000    # 0.75f

    .line 746
    .line 747
    const v18, -0x4087ae14    # -0.97f

    .line 748
    .line 749
    .line 750
    const/4 v13, 0x0

    .line 751
    const v14, -0x41147ae1    # -0.46f

    .line 752
    .line 753
    .line 754
    const v15, 0x3e9eb852    # 0.31f

    .line 755
    .line 756
    .line 757
    const v16, -0x40a3d70a    # -0.86f

    .line 758
    .line 759
    .line 760
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 761
    .line 762
    .line 763
    const v17, 0x40c66666    # 6.2f

    .line 764
    .line 765
    .line 766
    const v18, -0x3f06b852    # -7.79f

    .line 767
    .line 768
    .line 769
    const v13, 0x40633333    # 3.55f

    .line 770
    .line 771
    .line 772
    const v14, -0x40ae147b    # -0.82f

    .line 773
    .line 774
    .line 775
    const v15, 0x40c66666    # 6.2f

    .line 776
    .line 777
    .line 778
    const/high16 v16, -0x3f800000    # -4.0f

    .line 779
    .line 780
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 781
    .line 782
    .line 783
    const v0, -0x3f39999a    # -6.2f

    .line 784
    .line 785
    .line 786
    const v2, -0x3f06b852    # -7.79f

    .line 787
    .line 788
    .line 789
    const v4, -0x3fd66666    # -2.65f

    .line 790
    .line 791
    .line 792
    const v6, -0x3f20f5c3    # -6.97f

    .line 793
    .line 794
    .line 795
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 796
    .line 797
    .line 798
    const/high16 v17, -0x40c00000    # -0.75f

    .line 799
    .line 800
    const v18, -0x4087ae14    # -0.97f

    .line 801
    .line 802
    .line 803
    const v13, -0x411eb852    # -0.44f

    .line 804
    .line 805
    .line 806
    const v14, -0x42333333    # -0.1f

    .line 807
    .line 808
    .line 809
    const/high16 v15, -0x40c00000    # -0.75f

    .line 810
    .line 811
    const v16, -0x40fd70a4    # -0.51f

    .line 812
    .line 813
    .line 814
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 815
    .line 816
    .line 817
    const v17, 0x3f9c28f6    # 1.22f

    .line 818
    .line 819
    .line 820
    const v18, -0x40851eb8    # -0.98f

    .line 821
    .line 822
    .line 823
    const/4 v13, 0x0

    .line 824
    const v14, -0x40dc28f6    # -0.64f

    .line 825
    .line 826
    .line 827
    const v15, 0x3f19999a    # 0.6f

    .line 828
    .line 829
    .line 830
    const v16, -0x406f5c29    # -1.13f

    .line 831
    .line 832
    .line 833
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 834
    .line 835
    .line 836
    const/high16 v17, 0x41b00000    # 22.0f

    .line 837
    .line 838
    const/high16 v18, 0x41400000    # 12.0f

    .line 839
    .line 840
    const v13, 0x4195999a    # 18.7f

    .line 841
    .line 842
    .line 843
    const v14, 0x40528f5c    # 3.29f

    .line 844
    .line 845
    .line 846
    const/high16 v15, 0x41b00000    # 22.0f

    .line 847
    .line 848
    const v16, 0x40e8a3d7    # 7.27f

    .line 849
    .line 850
    .line 851
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 852
    .line 853
    .line 854
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 855
    .line 856
    .line 857
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 858
    .line 859
    .line 860
    move-result-object v2

    .line 861
    const/16 v16, 0x3800

    .line 862
    .line 863
    const/16 v17, 0x0

    .line 864
    .line 865
    const/high16 v6, 0x3f800000    # 1.0f

    .line 866
    .line 867
    const/high16 v8, 0x3f800000    # 1.0f

    .line 868
    .line 869
    const/4 v7, 0x0

    .line 870
    const/high16 v9, 0x3f800000    # 1.0f

    .line 871
    .line 872
    const/high16 v12, 0x3f800000    # 1.0f

    .line 873
    .line 874
    const/4 v13, 0x0

    .line 875
    const/4 v14, 0x0

    .line 876
    const/4 v15, 0x0

    .line 877
    const-string v4, ""

    .line 878
    .line 879
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 880
    .line 881
    .line 882
    move-result-object v0

    .line 883
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 884
    .line 885
    .line 886
    move-result-object v0

    .line 887
    sput-object v0, Landroidx/compose/material/icons/rounded/SlowMotionVideoKt;->_slowMotionVideo:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 888
    .line 889
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 890
    .line 891
    .line 892
    return-object v0
.end method
