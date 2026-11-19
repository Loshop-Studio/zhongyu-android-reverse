.class public final Landroidx/compose/material/icons/rounded/SentimentVerySatisfiedKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_sentimentVerySatisfied",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "SentimentVerySatisfied",
        "Landroidx/compose/material/icons/Icons$Rounded;",
        "getSentimentVerySatisfied",
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
        "SMAP\nSentimentVerySatisfied.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SentimentVerySatisfied.kt\nandroidx/compose/material/icons/rounded/SentimentVerySatisfiedKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,78:1\n212#2,12:79\n233#2,18:92\n253#2:129\n174#3:91\n705#4,2:110\n717#4,2:112\n719#4,11:118\n72#5,4:114\n*S KotlinDebug\n*F\n+ 1 SentimentVerySatisfied.kt\nandroidx/compose/material/icons/rounded/SentimentVerySatisfiedKt\n*L\n29#1:79,12\n30#1:92,18\n30#1:129\n29#1:91\n30#1:110,2\n30#1:112,2\n30#1:118,11\n30#1:114,4\n*E\n"
    }
.end annotation


# static fields
.field private static _sentimentVerySatisfied:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getSentimentVerySatisfied(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/SentimentVerySatisfiedKt;->_sentimentVerySatisfied:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.SentimentVerySatisfied"

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
    const v0, 0x410e147b    # 8.88f

    .line 71
    .line 72
    .line 73
    const v2, 0x411f0a3d    # 9.94f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v0, 0x3f07ae14    # 0.53f

    .line 80
    .line 81
    .line 82
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 83
    .line 84
    .line 85
    const v17, 0x3f87ae14    # 1.06f

    .line 86
    .line 87
    .line 88
    const/16 v18, 0x0

    .line 89
    .line 90
    const v13, 0x3e947ae1    # 0.29f

    .line 91
    .line 92
    .line 93
    const v14, 0x3e947ae1    # 0.29f

    .line 94
    .line 95
    .line 96
    const v15, 0x3f451eb8    # 0.77f

    .line 97
    .line 98
    .line 99
    const v16, 0x3e947ae1    # 0.29f

    .line 100
    .line 101
    .line 102
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 103
    .line 104
    .line 105
    const/16 v17, 0x0

    .line 106
    .line 107
    const v18, -0x407851ec    # -1.06f

    .line 108
    .line 109
    .line 110
    const v14, -0x416b851f    # -0.29f

    .line 111
    .line 112
    .line 113
    const v15, 0x3e947ae1    # 0.29f

    .line 114
    .line 115
    .line 116
    const v16, -0x40bae148    # -0.77f

    .line 117
    .line 118
    .line 119
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 120
    .line 121
    .line 122
    const v0, -0x409eb852    # -0.88f

    .line 123
    .line 124
    .line 125
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 126
    .line 127
    .line 128
    const v17, -0x404b851f    # -1.41f

    .line 129
    .line 130
    .line 131
    const/16 v18, 0x0

    .line 132
    .line 133
    const v13, -0x413851ec    # -0.39f

    .line 134
    .line 135
    .line 136
    const v14, -0x413851ec    # -0.39f

    .line 137
    .line 138
    .line 139
    const v15, -0x407d70a4    # -1.02f

    .line 140
    .line 141
    .line 142
    const v16, -0x413851ec    # -0.39f

    .line 143
    .line 144
    .line 145
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 146
    .line 147
    .line 148
    const v0, -0x409c28f6    # -0.89f

    .line 149
    .line 150
    .line 151
    const v2, 0x3f6147ae    # 0.88f

    .line 152
    .line 153
    .line 154
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 155
    .line 156
    .line 157
    const/16 v17, 0x0

    .line 158
    .line 159
    const v18, 0x3f87ae14    # 1.06f

    .line 160
    .line 161
    .line 162
    const v13, -0x416b851f    # -0.29f

    .line 163
    .line 164
    .line 165
    const v14, 0x3e947ae1    # 0.29f

    .line 166
    .line 167
    .line 168
    const v15, -0x416b851f    # -0.29f

    .line 169
    .line 170
    .line 171
    const v16, 0x3f451eb8    # 0.77f

    .line 172
    .line 173
    .line 174
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 175
    .line 176
    .line 177
    const v17, 0x3f87ae14    # 1.06f

    .line 178
    .line 179
    .line 180
    const/16 v18, 0x0

    .line 181
    .line 182
    const v13, 0x3e947ae1    # 0.29f

    .line 183
    .line 184
    .line 185
    const v15, 0x3f451eb8    # 0.77f

    .line 186
    .line 187
    .line 188
    const v16, 0x3e947ae1    # 0.29f

    .line 189
    .line 190
    .line 191
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 192
    .line 193
    .line 194
    const v0, -0x40f851ec    # -0.53f

    .line 195
    .line 196
    .line 197
    const v2, 0x3f07ae14    # 0.53f

    .line 198
    .line 199
    .line 200
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 201
    .line 202
    .line 203
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 204
    .line 205
    .line 206
    const/high16 v0, 0x418c0000    # 17.5f

    .line 207
    .line 208
    const/high16 v2, 0x41400000    # 12.0f

    .line 209
    .line 210
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 211
    .line 212
    .line 213
    const/high16 v17, 0x40980000    # 4.75f

    .line 214
    .line 215
    const/high16 v18, -0x3fd00000    # -2.75f

    .line 216
    .line 217
    const v13, 0x4001eb85    # 2.03f

    .line 218
    .line 219
    .line 220
    const/4 v14, 0x0

    .line 221
    const v15, 0x40733333    # 3.8f

    .line 222
    .line 223
    .line 224
    const v16, -0x4071eb85    # -1.11f

    .line 225
    .line 226
    .line 227
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 228
    .line 229
    .line 230
    const v17, -0x411eb852    # -0.44f

    .line 231
    .line 232
    .line 233
    const/high16 v18, -0x40c00000    # -0.75f

    .line 234
    .line 235
    const v13, 0x3e428f5c    # 0.19f

    .line 236
    .line 237
    .line 238
    const v14, -0x41570a3d    # -0.33f

    .line 239
    .line 240
    .line 241
    const v15, -0x42b33333    # -0.05f

    .line 242
    .line 243
    .line 244
    const/high16 v16, -0x40c00000    # -0.75f

    .line 245
    .line 246
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 247
    .line 248
    .line 249
    const v0, 0x40f6147b    # 7.69f

    .line 250
    .line 251
    .line 252
    const/high16 v2, 0x41600000    # 14.0f

    .line 253
    .line 254
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 255
    .line 256
    .line 257
    const/high16 v18, 0x3f400000    # 0.75f

    .line 258
    .line 259
    const v13, -0x413d70a4    # -0.38f

    .line 260
    .line 261
    .line 262
    const/4 v14, 0x0

    .line 263
    const v15, -0x40deb852    # -0.63f

    .line 264
    .line 265
    .line 266
    const v16, 0x3ed70a3d    # 0.42f

    .line 267
    .line 268
    .line 269
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 270
    .line 271
    .line 272
    const/high16 v17, 0x40980000    # 4.75f

    .line 273
    .line 274
    const/high16 v18, 0x40300000    # 2.75f

    .line 275
    .line 276
    const v13, 0x3f733333    # 0.95f

    .line 277
    .line 278
    .line 279
    const v14, 0x3fd1eb85    # 1.64f

    .line 280
    .line 281
    .line 282
    const v15, 0x402e147b    # 2.72f

    .line 283
    .line 284
    .line 285
    const/high16 v16, 0x40300000    # 2.75f

    .line 286
    .line 287
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 288
    .line 289
    .line 290
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 291
    .line 292
    .line 293
    const v0, 0x41587ae1    # 13.53f

    .line 294
    .line 295
    .line 296
    const v2, 0x4127851f    # 10.47f

    .line 297
    .line 298
    .line 299
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 300
    .line 301
    .line 302
    const v17, 0x3f87ae14    # 1.06f

    .line 303
    .line 304
    .line 305
    const/16 v18, 0x0

    .line 306
    .line 307
    const v13, 0x3e947ae1    # 0.29f

    .line 308
    .line 309
    .line 310
    const v14, 0x3e947ae1    # 0.29f

    .line 311
    .line 312
    .line 313
    const v15, 0x3f451eb8    # 0.77f

    .line 314
    .line 315
    .line 316
    const v16, 0x3e947ae1    # 0.29f

    .line 317
    .line 318
    .line 319
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 320
    .line 321
    .line 322
    const v0, -0x40f851ec    # -0.53f

    .line 323
    .line 324
    .line 325
    const v2, 0x3f07ae14    # 0.53f

    .line 326
    .line 327
    .line 328
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 329
    .line 330
    .line 331
    const v0, 0x3f07ae14    # 0.53f

    .line 332
    .line 333
    .line 334
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 335
    .line 336
    .line 337
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 338
    .line 339
    .line 340
    const/16 v17, 0x0

    .line 341
    .line 342
    const v18, -0x407851ec    # -1.06f

    .line 343
    .line 344
    .line 345
    const v14, -0x416b851f    # -0.29f

    .line 346
    .line 347
    .line 348
    const v15, 0x3e947ae1    # 0.29f

    .line 349
    .line 350
    .line 351
    const v16, -0x40bae148    # -0.77f

    .line 352
    .line 353
    .line 354
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 355
    .line 356
    .line 357
    const v0, -0x409eb852    # -0.88f

    .line 358
    .line 359
    .line 360
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 361
    .line 362
    .line 363
    const v17, -0x404b851f    # -1.41f

    .line 364
    .line 365
    .line 366
    const/16 v18, 0x0

    .line 367
    .line 368
    const v13, -0x413851ec    # -0.39f

    .line 369
    .line 370
    .line 371
    const v14, -0x413851ec    # -0.39f

    .line 372
    .line 373
    .line 374
    const v15, -0x407d70a4    # -1.02f

    .line 375
    .line 376
    .line 377
    const v16, -0x413851ec    # -0.39f

    .line 378
    .line 379
    .line 380
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 381
    .line 382
    .line 383
    const v0, 0x3f6147ae    # 0.88f

    .line 384
    .line 385
    .line 386
    const v2, -0x409eb852    # -0.88f

    .line 387
    .line 388
    .line 389
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 390
    .line 391
    .line 392
    const v17, -0x43dc28f6    # -0.01f

    .line 393
    .line 394
    .line 395
    const v18, 0x3f87ae14    # 1.06f

    .line 396
    .line 397
    .line 398
    const v13, -0x41666666    # -0.3f

    .line 399
    .line 400
    .line 401
    const v14, 0x3e947ae1    # 0.29f

    .line 402
    .line 403
    .line 404
    const v15, -0x41666666    # -0.3f

    .line 405
    .line 406
    .line 407
    const v16, 0x3f451eb8    # 0.77f

    .line 408
    .line 409
    .line 410
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 411
    .line 412
    .line 413
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 414
    .line 415
    .line 416
    const v0, 0x413fd70a    # 11.99f

    .line 417
    .line 418
    .line 419
    const/high16 v2, 0x40000000    # 2.0f

    .line 420
    .line 421
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 422
    .line 423
    .line 424
    const/high16 v17, 0x40000000    # 2.0f

    .line 425
    .line 426
    const/high16 v18, 0x41400000    # 12.0f

    .line 427
    .line 428
    const v13, 0x40cf0a3d    # 6.47f

    .line 429
    .line 430
    .line 431
    const/high16 v14, 0x40000000    # 2.0f

    .line 432
    .line 433
    const/high16 v15, 0x40000000    # 2.0f

    .line 434
    .line 435
    const v16, 0x40cf0a3d    # 6.47f

    .line 436
    .line 437
    .line 438
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 439
    .line 440
    .line 441
    const v0, 0x408f0a3d    # 4.47f

    .line 442
    .line 443
    .line 444
    const v2, 0x411fd70a    # 9.99f

    .line 445
    .line 446
    .line 447
    const/high16 v4, 0x41200000    # 10.0f

    .line 448
    .line 449
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 450
    .line 451
    .line 452
    const v0, 0x418c3d71    # 17.53f

    .line 453
    .line 454
    .line 455
    const/high16 v2, 0x41b00000    # 22.0f

    .line 456
    .line 457
    const/high16 v4, 0x41400000    # 12.0f

    .line 458
    .line 459
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 460
    .line 461
    .line 462
    const v0, 0x418c28f6    # 17.52f

    .line 463
    .line 464
    .line 465
    const v2, 0x413fd70a    # 11.99f

    .line 466
    .line 467
    .line 468
    const/high16 v4, 0x40000000    # 2.0f

    .line 469
    .line 470
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 471
    .line 472
    .line 473
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 474
    .line 475
    .line 476
    const/high16 v0, 0x41a00000    # 20.0f

    .line 477
    .line 478
    const/high16 v2, 0x41400000    # 12.0f

    .line 479
    .line 480
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 481
    .line 482
    .line 483
    const/high16 v17, -0x3f000000    # -8.0f

    .line 484
    .line 485
    const/high16 v18, -0x3f000000    # -8.0f

    .line 486
    .line 487
    const v13, -0x3f728f5c    # -4.42f

    .line 488
    .line 489
    .line 490
    const/4 v14, 0x0

    .line 491
    const/high16 v15, -0x3f000000    # -8.0f

    .line 492
    .line 493
    const v16, -0x3f9ae148    # -3.58f

    .line 494
    .line 495
    .line 496
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 497
    .line 498
    .line 499
    const v0, 0x40651eb8    # 3.58f

    .line 500
    .line 501
    .line 502
    const/high16 v2, -0x3f000000    # -8.0f

    .line 503
    .line 504
    const/high16 v4, 0x41000000    # 8.0f

    .line 505
    .line 506
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 507
    .line 508
    .line 509
    const/high16 v2, 0x41000000    # 8.0f

    .line 510
    .line 511
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 512
    .line 513
    .line 514
    const v0, -0x3f9ae148    # -3.58f

    .line 515
    .line 516
    .line 517
    const/high16 v2, -0x3f000000    # -8.0f

    .line 518
    .line 519
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 520
    .line 521
    .line 522
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 523
    .line 524
    .line 525
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 526
    .line 527
    .line 528
    move-result-object v2

    .line 529
    const/16 v16, 0x3800

    .line 530
    .line 531
    const/16 v17, 0x0

    .line 532
    .line 533
    const/high16 v6, 0x3f800000    # 1.0f

    .line 534
    .line 535
    const/high16 v8, 0x3f800000    # 1.0f

    .line 536
    .line 537
    const/4 v7, 0x0

    .line 538
    const/high16 v9, 0x3f800000    # 1.0f

    .line 539
    .line 540
    const/high16 v12, 0x3f800000    # 1.0f

    .line 541
    .line 542
    const/4 v13, 0x0

    .line 543
    const/4 v15, 0x0

    .line 544
    const-string v4, ""

    .line 545
    .line 546
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 547
    .line 548
    .line 549
    move-result-object v0

    .line 550
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 551
    .line 552
    .line 553
    move-result-object v0

    .line 554
    sput-object v0, Landroidx/compose/material/icons/rounded/SentimentVerySatisfiedKt;->_sentimentVerySatisfied:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 555
    .line 556
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 557
    .line 558
    .line 559
    return-object v0
.end method
