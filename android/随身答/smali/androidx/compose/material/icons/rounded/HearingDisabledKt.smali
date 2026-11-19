.class public final Landroidx/compose/material/icons/rounded/HearingDisabledKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_hearingDisabled",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "HearingDisabled",
        "Landroidx/compose/material/icons/Icons$Rounded;",
        "getHearingDisabled",
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
        "SMAP\nHearingDisabled.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HearingDisabled.kt\nandroidx/compose/material/icons/rounded/HearingDisabledKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,90:1\n212#2,12:91\n233#2,18:104\n253#2:141\n174#3:103\n705#4,2:122\n717#4,2:124\n719#4,11:130\n72#5,4:126\n*S KotlinDebug\n*F\n+ 1 HearingDisabled.kt\nandroidx/compose/material/icons/rounded/HearingDisabledKt\n*L\n29#1:91,12\n30#1:104,18\n30#1:141\n29#1:103\n30#1:122,2\n30#1:124,2\n30#1:130,11\n30#1:126,4\n*E\n"
    }
.end annotation


# static fields
.field private static _hearingDisabled:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getHearingDisabled(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/HearingDisabledKt;->_hearingDisabled:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.HearingDisabled"

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
    const v0, 0x4187ae14    # 16.96f

    .line 71
    .line 72
    .line 73
    const v2, 0x40533333    # 3.3f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v17, 0x3d8f5c29    # 0.07f

    .line 80
    .line 81
    .line 82
    const v18, -0x40570a3d    # -1.32f

    .line 83
    .line 84
    .line 85
    const v13, -0x415c28f6    # -0.32f

    .line 86
    .line 87
    .line 88
    const v14, -0x413851ec    # -0.39f

    .line 89
    .line 90
    .line 91
    const v15, -0x416b851f    # -0.29f

    .line 92
    .line 93
    .line 94
    const v16, -0x408a3d71    # -0.96f

    .line 95
    .line 96
    .line 97
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 98
    .line 99
    .line 100
    const v0, 0x3c23d70a    # 0.01f

    .line 101
    .line 102
    .line 103
    const v2, -0x43dc28f6    # -0.01f

    .line 104
    .line 105
    .line 106
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 107
    .line 108
    .line 109
    const v17, 0x3fbeb852    # 1.49f

    .line 110
    .line 111
    .line 112
    const v18, 0x3da3d70a    # 0.08f

    .line 113
    .line 114
    .line 115
    const v13, 0x3ed70a3d    # 0.42f

    .line 116
    .line 117
    .line 118
    const v14, -0x4128f5c3    # -0.42f

    .line 119
    .line 120
    .line 121
    const v15, 0x3f8f5c29    # 1.12f

    .line 122
    .line 123
    .line 124
    const v16, -0x413d70a4    # -0.38f

    .line 125
    .line 126
    .line 127
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 128
    .line 129
    .line 130
    const/high16 v17, 0x41a80000    # 21.0f

    .line 131
    .line 132
    const/high16 v18, 0x41100000    # 9.0f

    .line 133
    .line 134
    const v13, 0x41a08f5c    # 20.07f

    .line 135
    .line 136
    .line 137
    const v14, 0x407c28f6    # 3.94f

    .line 138
    .line 139
    .line 140
    const/high16 v15, 0x41a80000    # 21.0f

    .line 141
    .line 142
    const v16, 0x40cb851f    # 6.36f

    .line 143
    .line 144
    .line 145
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 146
    .line 147
    .line 148
    const v17, -0x3fe8f5c3    # -2.36f

    .line 149
    .line 150
    .line 151
    const v18, 0x40d9eb85    # 6.81f

    .line 152
    .line 153
    .line 154
    const/4 v13, 0x0

    .line 155
    const v14, 0x40247ae1    # 2.57f

    .line 156
    .line 157
    .line 158
    const v15, -0x409c28f6    # -0.89f

    .line 159
    .line 160
    .line 161
    const v16, 0x409e147b    # 4.94f

    .line 162
    .line 163
    .line 164
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 165
    .line 166
    .line 167
    const v0, -0x4048f5c3    # -1.43f

    .line 168
    .line 169
    .line 170
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 171
    .line 172
    .line 173
    const/high16 v17, 0x41980000    # 19.0f

    .line 174
    .line 175
    const/high16 v18, 0x41100000    # 9.0f

    .line 176
    .line 177
    const v13, 0x4192a3d7    # 18.33f

    .line 178
    .line 179
    .line 180
    const v14, 0x414e147b    # 12.88f

    .line 181
    .line 182
    .line 183
    const/high16 v15, 0x41980000    # 19.0f

    .line 184
    .line 185
    const v16, 0x413051ec    # 11.02f

    .line 186
    .line 187
    .line 188
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 189
    .line 190
    .line 191
    const v17, 0x4187ae14    # 16.96f

    .line 192
    .line 193
    .line 194
    const v18, 0x40533333    # 3.3f

    .line 195
    .line 196
    .line 197
    const/high16 v13, 0x41980000    # 19.0f

    .line 198
    .line 199
    const v14, 0x40da8f5c    # 6.83f

    .line 200
    .line 201
    .line 202
    const v15, 0x4191d70a    # 18.23f

    .line 203
    .line 204
    .line 205
    const v16, 0x409ae148    # 4.84f

    .line 206
    .line 207
    .line 208
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 209
    .line 210
    .line 211
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 212
    .line 213
    .line 214
    const v0, 0x40951eb8    # 4.66f

    .line 215
    .line 216
    .line 217
    const v2, 0x40efae14    # 7.49f

    .line 218
    .line 219
    .line 220
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 221
    .line 222
    .line 223
    const/high16 v17, 0x41200000    # 10.0f

    .line 224
    .line 225
    const/high16 v18, 0x40800000    # 4.0f

    .line 226
    .line 227
    const v13, 0x4103ae14    # 8.23f

    .line 228
    .line 229
    .line 230
    const v14, 0x4087ae14    # 4.24f

    .line 231
    .line 232
    .line 233
    const v15, 0x411147ae    # 9.08f

    .line 234
    .line 235
    .line 236
    const/high16 v16, 0x40800000    # 4.0f

    .line 237
    .line 238
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 239
    .line 240
    .line 241
    const/high16 v17, 0x40a00000    # 5.0f

    .line 242
    .line 243
    const/high16 v18, 0x40a00000    # 5.0f

    .line 244
    .line 245
    const v13, 0x40333333    # 2.8f

    .line 246
    .line 247
    .line 248
    const/4 v14, 0x0

    .line 249
    const/high16 v15, 0x40a00000    # 5.0f

    .line 250
    .line 251
    const v16, 0x400ccccd    # 2.2f

    .line 252
    .line 253
    .line 254
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 255
    .line 256
    .line 257
    const v17, -0x40deb852    # -0.63f

    .line 258
    .line 259
    .line 260
    const v18, 0x40228f5c    # 2.54f

    .line 261
    .line 262
    .line 263
    const/4 v13, 0x0

    .line 264
    const v14, 0x3f4ccccd    # 0.8f

    .line 265
    .line 266
    .line 267
    const v15, -0x41947ae1    # -0.23f

    .line 268
    .line 269
    .line 270
    const v16, 0x3fd851ec    # 1.69f

    .line 271
    .line 272
    .line 273
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 274
    .line 275
    .line 276
    const v0, 0x3fbd70a4    # 1.48f

    .line 277
    .line 278
    .line 279
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 280
    .line 281
    .line 282
    const v17, 0x3da3d70a    # 0.08f

    .line 283
    .line 284
    .line 285
    const v18, -0x41fae148    # -0.13f

    .line 286
    .line 287
    .line 288
    const v13, 0x3ca3d70a    # 0.02f

    .line 289
    .line 290
    .line 291
    const v14, -0x42dc28f6    # -0.04f

    .line 292
    .line 293
    .line 294
    const v15, 0x3d4ccccd    # 0.05f

    .line 295
    .line 296
    .line 297
    const v16, -0x425c28f6    # -0.08f

    .line 298
    .line 299
    .line 300
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 301
    .line 302
    .line 303
    const/high16 v17, 0x41880000    # 17.0f

    .line 304
    .line 305
    const/high16 v18, 0x41100000    # 9.0f

    .line 306
    .line 307
    const v13, 0x4184f5c3    # 16.62f

    .line 308
    .line 309
    .line 310
    const v14, 0x413a6666    # 11.65f

    .line 311
    .line 312
    .line 313
    const/high16 v15, 0x41880000    # 17.0f

    .line 314
    .line 315
    const v16, 0x412428f6    # 10.26f

    .line 316
    .line 317
    .line 318
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 319
    .line 320
    .line 321
    const/high16 v17, -0x3f200000    # -7.0f

    .line 322
    .line 323
    const/high16 v18, -0x3f200000    # -7.0f

    .line 324
    .line 325
    const/4 v13, 0x0

    .line 326
    const v14, -0x3f847ae1    # -3.93f

    .line 327
    .line 328
    .line 329
    const v15, -0x3fbb851f    # -3.07f

    .line 330
    .line 331
    .line 332
    const/high16 v16, -0x3f200000    # -7.0f

    .line 333
    .line 334
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 335
    .line 336
    .line 337
    const v17, 0x40c0f5c3    # 6.03f

    .line 338
    .line 339
    .line 340
    const v18, 0x404ccccd    # 3.2f

    .line 341
    .line 342
    .line 343
    const v13, 0x410828f6    # 8.51f

    .line 344
    .line 345
    .line 346
    const/high16 v14, 0x40000000    # 2.0f

    .line 347
    .line 348
    const v15, 0x40e4cccd    # 7.15f

    .line 349
    .line 350
    .line 351
    const v16, 0x401c28f6    # 2.44f

    .line 352
    .line 353
    .line 354
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 355
    .line 356
    .line 357
    const v0, 0x40951eb8    # 4.66f

    .line 358
    .line 359
    .line 360
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 361
    .line 362
    .line 363
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 364
    .line 365
    .line 366
    const/high16 v0, 0x41200000    # 10.0f

    .line 367
    .line 368
    const/high16 v2, 0x40d00000    # 6.5f

    .line 369
    .line 370
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 371
    .line 372
    .line 373
    const v17, -0x40e8f5c3    # -0.59f

    .line 374
    .line 375
    .line 376
    const v18, 0x3da3d70a    # 0.08f

    .line 377
    .line 378
    .line 379
    const v13, -0x41a8f5c3    # -0.21f

    .line 380
    .line 381
    .line 382
    const/4 v14, 0x0

    .line 383
    const v15, -0x41333333    # -0.4f

    .line 384
    .line 385
    .line 386
    const v16, 0x3cf5c28f    # 0.03f

    .line 387
    .line 388
    .line 389
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 390
    .line 391
    .line 392
    const v0, 0x4040a3d7    # 3.01f

    .line 393
    .line 394
    .line 395
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 396
    .line 397
    .line 398
    const/high16 v17, 0x41480000    # 12.5f

    .line 399
    .line 400
    const/high16 v18, 0x41100000    # 9.0f

    .line 401
    .line 402
    const v13, 0x4147851f    # 12.47f

    .line 403
    .line 404
    .line 405
    const v14, 0x41166666    # 9.4f

    .line 406
    .line 407
    .line 408
    const/high16 v15, 0x41480000    # 12.5f

    .line 409
    .line 410
    const v16, 0x41135c29    # 9.21f

    .line 411
    .line 412
    .line 413
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 414
    .line 415
    .line 416
    const/high16 v17, 0x41200000    # 10.0f

    .line 417
    .line 418
    const/high16 v18, 0x40d00000    # 6.5f

    .line 419
    .line 420
    const/high16 v13, 0x41480000    # 12.5f

    .line 421
    .line 422
    const v14, 0x40f3d70a    # 7.62f

    .line 423
    .line 424
    .line 425
    const v15, 0x4136147b    # 11.38f

    .line 426
    .line 427
    .line 428
    const/high16 v16, 0x40d00000    # 6.5f

    .line 429
    .line 430
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 431
    .line 432
    .line 433
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 434
    .line 435
    .line 436
    const v0, 0x41a3eb85    # 20.49f

    .line 437
    .line 438
    .line 439
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 440
    .line 441
    .line 442
    const v0, 0x4060a3d7    # 3.51f

    .line 443
    .line 444
    .line 445
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 446
    .line 447
    .line 448
    const v17, -0x404b851f    # -1.41f

    .line 449
    .line 450
    .line 451
    const/16 v18, 0x0

    .line 452
    .line 453
    const v13, -0x413851ec    # -0.39f

    .line 454
    .line 455
    .line 456
    const v14, -0x413851ec    # -0.39f

    .line 457
    .line 458
    .line 459
    const v15, -0x407d70a4    # -1.02f

    .line 460
    .line 461
    .line 462
    const v16, -0x413851ec    # -0.39f

    .line 463
    .line 464
    .line 465
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 466
    .line 467
    .line 468
    const/16 v17, 0x0

    .line 469
    .line 470
    const v18, 0x3fb47ae1    # 1.41f

    .line 471
    .line 472
    .line 473
    const v14, 0x3ec7ae14    # 0.39f

    .line 474
    .line 475
    .line 476
    const v15, -0x413851ec    # -0.39f

    .line 477
    .line 478
    .line 479
    const v16, 0x3f828f5c    # 1.02f

    .line 480
    .line 481
    .line 482
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 483
    .line 484
    .line 485
    const v0, 0x3fb5c28f    # 1.42f

    .line 486
    .line 487
    .line 488
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 489
    .line 490
    .line 491
    const v17, -0x4123d70a    # -0.43f

    .line 492
    .line 493
    .line 494
    const v18, 0x3fc51eb8    # 1.54f

    .line 495
    .line 496
    .line 497
    const v13, -0x41b33333    # -0.2f

    .line 498
    .line 499
    .line 500
    const v14, 0x3efae148    # 0.49f

    .line 501
    .line 502
    .line 503
    const v15, -0x414ccccd    # -0.35f

    .line 504
    .line 505
    .line 506
    const/high16 v16, 0x3f800000    # 1.0f

    .line 507
    .line 508
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 509
    .line 510
    .line 511
    const v17, 0x4081eb85    # 4.06f

    .line 512
    .line 513
    .line 514
    const/high16 v18, 0x41100000    # 9.0f

    .line 515
    .line 516
    const v13, 0x403f5c29    # 2.99f

    .line 517
    .line 518
    .line 519
    const v14, 0x4107851f    # 8.47f

    .line 520
    .line 521
    .line 522
    const v15, 0x405e147b    # 3.47f

    .line 523
    .line 524
    .line 525
    const/high16 v16, 0x41100000    # 9.0f

    .line 526
    .line 527
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 528
    .line 529
    .line 530
    const v0, 0x40833333    # 4.1f

    .line 531
    .line 532
    .line 533
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 534
    .line 535
    .line 536
    const v17, 0x3f75c28f    # 0.96f

    .line 537
    .line 538
    .line 539
    const v18, -0x40ae147b    # -0.82f

    .line 540
    .line 541
    .line 542
    const v13, 0x3ef5c28f    # 0.48f

    .line 543
    .line 544
    .line 545
    const/4 v14, 0x0

    .line 546
    const v15, 0x3f63d70a    # 0.89f

    .line 547
    .line 548
    .line 549
    const v16, -0x414ccccd    # -0.35f

    .line 550
    .line 551
    .line 552
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 553
    .line 554
    .line 555
    const v17, 0x40a3d70a    # 5.12f

    .line 556
    .line 557
    .line 558
    const v18, 0x40fe6666    # 7.95f

    .line 559
    .line 560
    .line 561
    const v13, 0x40a28f5c    # 5.08f

    .line 562
    .line 563
    .line 564
    const v14, 0x4101999a    # 8.1f

    .line 565
    .line 566
    .line 567
    const v15, 0x40a33333    # 5.1f

    .line 568
    .line 569
    .line 570
    const v16, 0x410051ec    # 8.02f

    .line 571
    .line 572
    .line 573
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 574
    .line 575
    .line 576
    const v0, 0x40d3d70a    # 6.62f

    .line 577
    .line 578
    .line 579
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 580
    .line 581
    .line 582
    const v17, -0x3feeb852    # -2.27f

    .line 583
    .line 584
    .line 585
    const v18, 0x4039999a    # 2.9f

    .line 586
    .line 587
    .line 588
    const v13, -0x409eb852    # -0.88f

    .line 589
    .line 590
    .line 591
    const v14, 0x3f2e147b    # 0.68f

    .line 592
    .line 593
    .line 594
    const v15, -0x401c28f6    # -1.78f

    .line 595
    .line 596
    .line 597
    const v16, 0x3fb47ae1    # 1.41f

    .line 598
    .line 599
    .line 600
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 601
    .line 602
    .line 603
    const v17, -0x40251eb8    # -1.71f

    .line 604
    .line 605
    .line 606
    const v18, 0x401851ec    # 2.38f

    .line 607
    .line 608
    .line 609
    const/high16 v13, -0x41000000    # -0.5f

    .line 610
    .line 611
    const/high16 v14, 0x3fc00000    # 1.5f

    .line 612
    .line 613
    const/high16 v15, -0x40800000    # -1.0f

    .line 614
    .line 615
    const v16, 0x4000a3d7    # 2.01f

    .line 616
    .line 617
    .line 618
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 619
    .line 620
    .line 621
    const/high16 v17, 0x40e00000    # 7.0f

    .line 622
    .line 623
    const/high16 v18, 0x41a00000    # 20.0f

    .line 624
    .line 625
    const v13, 0x40f1eb85    # 7.56f

    .line 626
    .line 627
    .line 628
    const v14, 0x419f851f    # 19.94f

    .line 629
    .line 630
    .line 631
    const v15, 0x40e947ae    # 7.29f

    .line 632
    .line 633
    .line 634
    const/high16 v16, 0x41a00000    # 20.0f

    .line 635
    .line 636
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 637
    .line 638
    .line 639
    const v17, -0x400ccccd    # -1.9f

    .line 640
    .line 641
    .line 642
    const v18, -0x4050a3d7    # -1.37f

    .line 643
    .line 644
    .line 645
    const v13, -0x409eb852    # -0.88f

    .line 646
    .line 647
    .line 648
    const/4 v14, 0x0

    .line 649
    const v15, -0x402f5c29    # -1.63f

    .line 650
    .line 651
    .line 652
    const v16, -0x40eb851f    # -0.58f

    .line 653
    .line 654
    .line 655
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 656
    .line 657
    .line 658
    const v17, 0x4084cccd    # 4.15f

    .line 659
    .line 660
    .line 661
    const/high16 v18, 0x41900000    # 18.0f

    .line 662
    .line 663
    const v13, 0x409f0a3d    # 4.97f

    .line 664
    .line 665
    .line 666
    const v14, 0x4191eb85    # 18.24f

    .line 667
    .line 668
    .line 669
    const v15, 0x40923d71    # 4.57f

    .line 670
    .line 671
    .line 672
    const/high16 v16, 0x41900000    # 18.0f

    .line 673
    .line 674
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 675
    .line 676
    .line 677
    const v17, 0x404ccccd    # 3.2f

    .line 678
    .line 679
    .line 680
    const v18, 0x419a147b    # 19.26f

    .line 681
    .line 682
    .line 683
    const v13, 0x405f5c29    # 3.49f

    .line 684
    .line 685
    .line 686
    const/high16 v14, 0x41900000    # 18.0f

    .line 687
    .line 688
    const/high16 v15, 0x40400000    # 3.0f

    .line 689
    .line 690
    const v16, 0x41951eb8    # 18.64f

    .line 691
    .line 692
    .line 693
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 694
    .line 695
    .line 696
    const/high16 v17, 0x40e00000    # 7.0f

    .line 697
    .line 698
    const/high16 v18, 0x41b00000    # 22.0f

    .line 699
    .line 700
    const v13, 0x406eb852    # 3.73f

    .line 701
    .line 702
    .line 703
    const v14, 0x41a6cccd    # 20.85f

    .line 704
    .line 705
    .line 706
    const v15, 0x40a75c29    # 5.23f

    .line 707
    .line 708
    .line 709
    const/high16 v16, 0x41b00000    # 22.0f

    .line 710
    .line 711
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 712
    .line 713
    .line 714
    const v17, 0x3fd1eb85    # 1.64f

    .line 715
    .line 716
    .line 717
    const v18, -0x414ccccd    # -0.35f

    .line 718
    .line 719
    .line 720
    const v13, 0x3f11eb85    # 0.57f

    .line 721
    .line 722
    .line 723
    const/4 v14, 0x0

    .line 724
    const v15, 0x3f90a3d7    # 1.13f

    .line 725
    .line 726
    .line 727
    const v16, -0x420a3d71    # -0.12f

    .line 728
    .line 729
    .line 730
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 731
    .line 732
    .line 733
    const v17, 0x402eb852    # 2.73f

    .line 734
    .line 735
    .line 736
    const v18, -0x3f9ccccd    # -3.55f

    .line 737
    .line 738
    .line 739
    const v13, 0x3fae147b    # 1.36f

    .line 740
    .line 741
    .line 742
    const v14, -0x40ca3d71    # -0.71f

    .line 743
    .line 744
    .line 745
    const v15, 0x400851ec    # 2.13f

    .line 746
    .line 747
    .line 748
    const v16, -0x40228f5c    # -1.73f

    .line 749
    .line 750
    .line 751
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 752
    .line 753
    .line 754
    const v17, 0x3fdae148    # 1.71f

    .line 755
    .line 756
    .line 757
    const v18, -0x3ffccccd    # -2.05f

    .line 758
    .line 759
    .line 760
    const v13, 0x3ea3d70a    # 0.32f

    .line 761
    .line 762
    .line 763
    const v14, -0x40851eb8    # -0.98f

    .line 764
    .line 765
    .line 766
    const v15, 0x3f666666    # 0.9f

    .line 767
    .line 768
    .line 769
    const v16, -0x4048f5c3    # -1.43f

    .line 770
    .line 771
    .line 772
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 773
    .line 774
    .line 775
    const v17, 0x3da3d70a    # 0.08f

    .line 776
    .line 777
    .line 778
    const v18, -0x428a3d71    # -0.06f

    .line 779
    .line 780
    .line 781
    const v13, 0x3cf5c28f    # 0.03f

    .line 782
    .line 783
    .line 784
    const v14, -0x435c28f6    # -0.02f

    .line 785
    .line 786
    .line 787
    const v15, 0x3d4ccccd    # 0.05f

    .line 788
    .line 789
    .line 790
    const v16, -0x42dc28f6    # -0.04f

    .line 791
    .line 792
    .line 793
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 794
    .line 795
    .line 796
    const v0, 0x40bd1eb8    # 5.91f

    .line 797
    .line 798
    .line 799
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 800
    .line 801
    .line 802
    const v17, 0x3fb47ae1    # 1.41f

    .line 803
    .line 804
    .line 805
    const/16 v18, 0x0

    .line 806
    .line 807
    const v13, 0x3ec7ae14    # 0.39f

    .line 808
    .line 809
    .line 810
    const v14, 0x3ec7ae14    # 0.39f

    .line 811
    .line 812
    .line 813
    const v15, 0x3f828f5c    # 1.02f

    .line 814
    .line 815
    .line 816
    const v16, 0x3ec7ae14    # 0.39f

    .line 817
    .line 818
    .line 819
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 820
    .line 821
    .line 822
    const v17, 0x41a3eb85    # 20.49f

    .line 823
    .line 824
    .line 825
    const v18, 0x41a3eb85    # 20.49f

    .line 826
    .line 827
    .line 828
    const v13, 0x41a70a3d    # 20.88f

    .line 829
    .line 830
    .line 831
    const v14, 0x41ac147b    # 21.51f

    .line 832
    .line 833
    .line 834
    const v15, 0x41a70a3d    # 20.88f

    .line 835
    .line 836
    .line 837
    const v16, 0x41a70a3d    # 20.88f

    .line 838
    .line 839
    .line 840
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 841
    .line 842
    .line 843
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 844
    .line 845
    .line 846
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 847
    .line 848
    .line 849
    move-result-object v2

    .line 850
    const/16 v16, 0x3800

    .line 851
    .line 852
    const/16 v17, 0x0

    .line 853
    .line 854
    const/high16 v6, 0x3f800000    # 1.0f

    .line 855
    .line 856
    const/high16 v8, 0x3f800000    # 1.0f

    .line 857
    .line 858
    const/4 v7, 0x0

    .line 859
    const/high16 v9, 0x3f800000    # 1.0f

    .line 860
    .line 861
    const/high16 v12, 0x3f800000    # 1.0f

    .line 862
    .line 863
    const/4 v13, 0x0

    .line 864
    const/4 v14, 0x0

    .line 865
    const/4 v15, 0x0

    .line 866
    const-string v4, ""

    .line 867
    .line 868
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 869
    .line 870
    .line 871
    move-result-object v0

    .line 872
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 873
    .line 874
    .line 875
    move-result-object v0

    .line 876
    sput-object v0, Landroidx/compose/material/icons/rounded/HearingDisabledKt;->_hearingDisabled:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 877
    .line 878
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 879
    .line 880
    .line 881
    return-object v0
.end method
