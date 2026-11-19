.class public final Landroidx/compose/material/icons/rounded/PhoneMissedKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u001e\u0010\u0002\u001a\u00020\u0001*\u00020\u00038FX\u0087\u0004\u00a2\u0006\u000c\u0012\u0004\u0008\u0004\u0010\u0005\u001a\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "_phoneMissed",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "PhoneMissed",
        "Landroidx/compose/material/icons/Icons$Rounded;",
        "getPhoneMissed$annotations",
        "(Landroidx/compose/material/icons/Icons$Rounded;)V",
        "getPhoneMissed",
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
        "SMAP\nPhoneMissed.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PhoneMissed.kt\nandroidx/compose/material/icons/rounded/PhoneMissedKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,77:1\n212#2,12:78\n233#2,18:91\n253#2:128\n174#3:90\n705#4,2:109\n717#4,2:111\n719#4,11:117\n72#5,4:113\n*S KotlinDebug\n*F\n+ 1 PhoneMissed.kt\nandroidx/compose/material/icons/rounded/PhoneMissedKt\n*L\n35#1:78,12\n36#1:91,18\n36#1:128\n35#1:90\n36#1:109,2\n36#1:111,2\n36#1:117,11\n36#1:113,4\n*E\n"
    }
.end annotation


# static fields
.field private static _phoneMissed:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getPhoneMissed(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/PhoneMissedKt;->_phoneMissed:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.PhoneMissed"

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
    const v0, 0x41b8b852    # 23.09f

    .line 71
    .line 72
    .line 73
    const v2, 0x4181999a    # 16.2f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v17, -0x3e4e8f5c    # -22.18f

    .line 80
    .line 81
    .line 82
    const/16 v18, 0x0

    .line 83
    .line 84
    const v13, -0x3f3570a4    # -6.33f

    .line 85
    .line 86
    .line 87
    const v14, -0x3f4d1eb8    # -5.59f

    .line 88
    .line 89
    .line 90
    const v15, -0x3e823d71    # -15.86f

    .line 91
    .line 92
    .line 93
    const v16, -0x3f4d1eb8    # -5.59f

    .line 94
    .line 95
    .line 96
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 97
    .line 98
    .line 99
    const v17, -0x42b33333    # -0.05f

    .line 100
    .line 101
    .line 102
    const v18, 0x4035c28f    # 2.84f

    .line 103
    .line 104
    .line 105
    const v13, -0x40a8f5c3    # -0.84f

    .line 106
    .line 107
    .line 108
    const v14, 0x3f3d70a4    # 0.74f

    .line 109
    .line 110
    .line 111
    const v15, -0x40a8f5c3    # -0.84f

    .line 112
    .line 113
    .line 114
    const v16, 0x40033333    # 2.05f

    .line 115
    .line 116
    .line 117
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 118
    .line 119
    .line 120
    const v0, 0x3f99999a    # 1.2f

    .line 121
    .line 122
    .line 123
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 124
    .line 125
    .line 126
    const v17, 0x4027ae14    # 2.62f

    .line 127
    .line 128
    .line 129
    const v18, 0x3e19999a    # 0.15f

    .line 130
    .line 131
    .line 132
    const v13, 0x3f35c28f    # 0.71f

    .line 133
    .line 134
    .line 135
    const v14, 0x3f35c28f    # 0.71f

    .line 136
    .line 137
    .line 138
    const v15, 0x3feb851f    # 1.84f

    .line 139
    .line 140
    .line 141
    const v16, 0x3f451eb8    # 0.77f

    .line 142
    .line 143
    .line 144
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 145
    .line 146
    .line 147
    const v0, 0x3ffc28f6    # 1.97f

    .line 148
    .line 149
    .line 150
    const v2, -0x40370a3d    # -1.57f

    .line 151
    .line 152
    .line 153
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 154
    .line 155
    .line 156
    const/high16 v17, 0x3f400000    # 0.75f

    .line 157
    .line 158
    const v18, -0x4039999a    # -1.55f

    .line 159
    .line 160
    .line 161
    const v13, 0x3ef0a3d7    # 0.47f

    .line 162
    .line 163
    .line 164
    const v14, -0x41428f5c    # -0.37f

    .line 165
    .line 166
    .line 167
    const/high16 v15, 0x3f400000    # 0.75f

    .line 168
    .line 169
    const v16, -0x408f5c29    # -0.94f

    .line 170
    .line 171
    .line 172
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 173
    .line 174
    .line 175
    const v0, 0x416b3333    # 14.7f

    .line 176
    .line 177
    .line 178
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 179
    .line 180
    .line 181
    const v17, 0x41133333    # 9.2f

    .line 182
    .line 183
    .line 184
    const/16 v18, 0x0

    .line 185
    .line 186
    const v13, 0x403eb852    # 2.98f

    .line 187
    .line 188
    .line 189
    const v14, -0x4087ae14    # -0.97f

    .line 190
    .line 191
    .line 192
    const v15, 0x40c6b852    # 6.21f

    .line 193
    .line 194
    .line 195
    const v16, -0x40851eb8    # -0.98f

    .line 196
    .line 197
    .line 198
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 199
    .line 200
    .line 201
    const v0, 0x40251eb8    # 2.58f

    .line 202
    .line 203
    .line 204
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 205
    .line 206
    .line 207
    const/high16 v17, 0x3f400000    # 0.75f

    .line 208
    .line 209
    const v18, 0x3fc66666    # 1.55f

    .line 210
    .line 211
    .line 212
    const/4 v13, 0x0

    .line 213
    const v14, 0x3f19999a    # 0.6f

    .line 214
    .line 215
    .line 216
    const v15, 0x3e8f5c29    # 0.28f

    .line 217
    .line 218
    .line 219
    const v16, 0x3f95c28f    # 1.17f

    .line 220
    .line 221
    .line 222
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 223
    .line 224
    .line 225
    const v0, 0x3ffae148    # 1.96f

    .line 226
    .line 227
    .line 228
    const v2, 0x3fc7ae14    # 1.56f

    .line 229
    .line 230
    .line 231
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 232
    .line 233
    .line 234
    const v17, 0x4027ae14    # 2.62f

    .line 235
    .line 236
    .line 237
    const v18, -0x41e66666    # -0.15f

    .line 238
    .line 239
    .line 240
    const v13, 0x3f4a3d71    # 0.79f

    .line 241
    .line 242
    .line 243
    const v14, 0x3f1eb852    # 0.62f

    .line 244
    .line 245
    .line 246
    const v15, 0x3ff47ae1    # 1.91f

    .line 247
    .line 248
    .line 249
    const v16, 0x3f0f5c29    # 0.56f

    .line 250
    .line 251
    .line 252
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 253
    .line 254
    .line 255
    const v0, -0x40666666    # -1.2f

    .line 256
    .line 257
    .line 258
    const v2, 0x3f99999a    # 1.2f

    .line 259
    .line 260
    .line 261
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 262
    .line 263
    .line 264
    const v17, -0x42dc28f6    # -0.04f

    .line 265
    .line 266
    .line 267
    const v18, -0x3fca3d71    # -2.84f

    .line 268
    .line 269
    .line 270
    const v13, 0x3f4ccccd    # 0.8f

    .line 271
    .line 272
    .line 273
    const v14, -0x40b5c28f    # -0.79f

    .line 274
    .line 275
    .line 276
    const v15, 0x3f4a3d71    # 0.79f

    .line 277
    .line 278
    .line 279
    const v16, -0x3ff9999a    # -2.1f

    .line 280
    .line 281
    .line 282
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 283
    .line 284
    .line 285
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 286
    .line 287
    .line 288
    const/high16 v0, 0x41100000    # 9.0f

    .line 289
    .line 290
    const/high16 v2, 0x40c00000    # 6.0f

    .line 291
    .line 292
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 293
    .line 294
    .line 295
    const/high16 v17, 0x3f800000    # 1.0f

    .line 296
    .line 297
    const/high16 v18, -0x40800000    # -1.0f

    .line 298
    .line 299
    const v13, 0x3f0ccccd    # 0.55f

    .line 300
    .line 301
    .line 302
    const/4 v14, 0x0

    .line 303
    const/high16 v15, 0x3f800000    # 1.0f

    .line 304
    .line 305
    const v16, -0x4119999a    # -0.45f

    .line 306
    .line 307
    .line 308
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 309
    .line 310
    .line 311
    const v0, 0x40cdc28f    # 6.43f

    .line 312
    .line 313
    .line 314
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 315
    .line 316
    .line 317
    const v0, 0x4087ae14    # 4.24f

    .line 318
    .line 319
    .line 320
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 321
    .line 322
    .line 323
    const v17, 0x3fb47ae1    # 1.41f

    .line 324
    .line 325
    .line 326
    const/16 v18, 0x0

    .line 327
    .line 328
    const v13, 0x3ec7ae14    # 0.39f

    .line 329
    .line 330
    .line 331
    const v14, 0x3ec7ae14    # 0.39f

    .line 332
    .line 333
    .line 334
    const v15, 0x3f828f5c    # 1.02f

    .line 335
    .line 336
    .line 337
    const v16, 0x3ec7ae14    # 0.39f

    .line 338
    .line 339
    .line 340
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 341
    .line 342
    .line 343
    const v0, 0x40b51eb8    # 5.66f

    .line 344
    .line 345
    .line 346
    const v2, -0x3f4ae148    # -5.66f

    .line 347
    .line 348
    .line 349
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 350
    .line 351
    .line 352
    const/16 v17, 0x0

    .line 353
    .line 354
    const v18, -0x404b851f    # -1.41f

    .line 355
    .line 356
    .line 357
    const v14, -0x413851ec    # -0.39f

    .line 358
    .line 359
    .line 360
    const v15, 0x3ec7ae14    # 0.39f

    .line 361
    .line 362
    .line 363
    const v16, -0x407d70a4    # -1.02f

    .line 364
    .line 365
    .line 366
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 367
    .line 368
    .line 369
    const v17, -0x404b851f    # -1.41f

    .line 370
    .line 371
    .line 372
    const/16 v18, 0x0

    .line 373
    .line 374
    const v13, -0x413851ec    # -0.39f

    .line 375
    .line 376
    .line 377
    const v15, -0x407d70a4    # -1.02f

    .line 378
    .line 379
    .line 380
    const v16, -0x413851ec    # -0.39f

    .line 381
    .line 382
    .line 383
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 384
    .line 385
    .line 386
    const v0, -0x3f61999a    # -4.95f

    .line 387
    .line 388
    .line 389
    const v2, 0x409e6666    # 4.95f

    .line 390
    .line 391
    .line 392
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 393
    .line 394
    .line 395
    const v0, 0x41066666    # 8.4f

    .line 396
    .line 397
    .line 398
    const/high16 v2, 0x40a00000    # 5.0f

    .line 399
    .line 400
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 401
    .line 402
    .line 403
    const/high16 v0, 0x41200000    # 10.0f

    .line 404
    .line 405
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 406
    .line 407
    .line 408
    const/high16 v17, 0x3f800000    # 1.0f

    .line 409
    .line 410
    const/high16 v18, -0x40800000    # -1.0f

    .line 411
    .line 412
    const v13, 0x3f0ccccd    # 0.55f

    .line 413
    .line 414
    .line 415
    const/4 v14, 0x0

    .line 416
    const/high16 v15, 0x3f800000    # 1.0f

    .line 417
    .line 418
    const v16, -0x4119999a    # -0.45f

    .line 419
    .line 420
    .line 421
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 422
    .line 423
    .line 424
    const v0, -0x4119999a    # -0.45f

    .line 425
    .line 426
    .line 427
    const/high16 v2, -0x40800000    # -1.0f

    .line 428
    .line 429
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 430
    .line 431
    .line 432
    const/high16 v0, 0x40c00000    # 6.0f

    .line 433
    .line 434
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 435
    .line 436
    .line 437
    const/high16 v17, -0x40800000    # -1.0f

    .line 438
    .line 439
    const/high16 v18, 0x3f800000    # 1.0f

    .line 440
    .line 441
    const v13, -0x40f33333    # -0.55f

    .line 442
    .line 443
    .line 444
    const/high16 v15, -0x40800000    # -1.0f

    .line 445
    .line 446
    const v16, 0x3ee66666    # 0.45f

    .line 447
    .line 448
    .line 449
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 450
    .line 451
    .line 452
    const/high16 v0, 0x40800000    # 4.0f

    .line 453
    .line 454
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 455
    .line 456
    .line 457
    const/high16 v17, 0x3f800000    # 1.0f

    .line 458
    .line 459
    const/4 v13, 0x0

    .line 460
    const v14, 0x3f0ccccd    # 0.55f

    .line 461
    .line 462
    .line 463
    const v15, 0x3ee66666    # 0.45f

    .line 464
    .line 465
    .line 466
    const/high16 v16, 0x3f800000    # 1.0f

    .line 467
    .line 468
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 469
    .line 470
    .line 471
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 472
    .line 473
    .line 474
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 475
    .line 476
    .line 477
    move-result-object v2

    .line 478
    const/16 v16, 0x3800

    .line 479
    .line 480
    const/16 v17, 0x0

    .line 481
    .line 482
    const/high16 v6, 0x3f800000    # 1.0f

    .line 483
    .line 484
    const/high16 v8, 0x3f800000    # 1.0f

    .line 485
    .line 486
    const/4 v7, 0x0

    .line 487
    const/high16 v9, 0x3f800000    # 1.0f

    .line 488
    .line 489
    const/high16 v12, 0x3f800000    # 1.0f

    .line 490
    .line 491
    const/4 v14, 0x0

    .line 492
    const/4 v15, 0x0

    .line 493
    const-string v4, ""

    .line 494
    .line 495
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 496
    .line 497
    .line 498
    move-result-object v0

    .line 499
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 500
    .line 501
    .line 502
    move-result-object v0

    .line 503
    sput-object v0, Landroidx/compose/material/icons/rounded/PhoneMissedKt;->_phoneMissed:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 504
    .line 505
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 506
    .line 507
    .line 508
    return-object v0
.end method

.method public static synthetic getPhoneMissed$annotations(Landroidx/compose/material/icons/Icons$Rounded;)V
    .locals 0
    .annotation runtime Lkotlin/Deprecated;
        message = "Use the AutoMirrored version at Icons.AutoMirrored.Rounded.PhoneMissed"
        replaceWith = .subannotation Lkotlin/ReplaceWith;
            expression = "Icons.AutoMirrored.Rounded.PhoneMissed"
            imports = {
                "androidx.compose.material.icons.automirrored.rounded.PhoneMissed"
            }
        .end subannotation
    .end annotation

    return-void
.end method
