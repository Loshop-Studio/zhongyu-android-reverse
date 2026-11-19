.class public final Landroidx/compose/material/icons/rounded/TextRotationAngleupKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_textRotationAngleup",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "TextRotationAngleup",
        "Landroidx/compose/material/icons/Icons$Rounded;",
        "getTextRotationAngleup",
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
        "SMAP\nTextRotationAngleup.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextRotationAngleup.kt\nandroidx/compose/material/icons/rounded/TextRotationAngleupKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,68:1\n212#2,12:69\n233#2,18:82\n253#2:119\n174#3:81\n705#4,2:100\n717#4,2:102\n719#4,11:108\n72#5,4:104\n*S KotlinDebug\n*F\n+ 1 TextRotationAngleup.kt\nandroidx/compose/material/icons/rounded/TextRotationAngleupKt\n*L\n29#1:69,12\n30#1:82,18\n30#1:119\n29#1:81\n30#1:100,2\n30#1:102,2\n30#1:108,11\n30#1:104,4\n*E\n"
    }
.end annotation


# static fields
.field private static _textRotationAngleup:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getTextRotationAngleup(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/TextRotationAngleupKt;->_textRotationAngleup:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.TextRotationAngleup"

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
    const v0, 0x418ce148    # 17.61f

    .line 71
    .line 72
    .line 73
    const v2, 0x411d999a    # 9.85f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v0, 0x3f0f5c29    # 0.56f

    .line 80
    .line 81
    .line 82
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 83
    .line 84
    .line 85
    const v0, -0x3ef851ec    # -8.48f

    .line 86
    .line 87
    .line 88
    const v2, 0x4107d70a    # 8.49f

    .line 89
    .line 90
    .line 91
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 92
    .line 93
    .line 94
    const/16 v17, 0x0

    .line 95
    .line 96
    const v18, 0x3fb47ae1    # 1.41f

    .line 97
    .line 98
    .line 99
    const v13, -0x413851ec    # -0.39f

    .line 100
    .line 101
    .line 102
    const v14, 0x3ec7ae14    # 0.39f

    .line 103
    .line 104
    .line 105
    const v15, -0x413851ec    # -0.39f

    .line 106
    .line 107
    .line 108
    const v16, 0x3f828f5c    # 1.02f

    .line 109
    .line 110
    .line 111
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 112
    .line 113
    .line 114
    const v17, 0x3fb47ae1    # 1.41f

    .line 115
    .line 116
    .line 117
    const/16 v18, 0x0

    .line 118
    .line 119
    const v13, 0x3ec7ae14    # 0.39f

    .line 120
    .line 121
    .line 122
    const v15, 0x3f828f5c    # 1.02f

    .line 123
    .line 124
    .line 125
    const v16, 0x3ec7ae14    # 0.39f

    .line 126
    .line 127
    .line 128
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 129
    .line 130
    .line 131
    const v0, -0x3ef828f6    # -8.49f

    .line 132
    .line 133
    .line 134
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 135
    .line 136
    .line 137
    const v0, 0x3f0f5c29    # 0.56f

    .line 138
    .line 139
    .line 140
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 141
    .line 142
    .line 143
    const v17, 0x3f59999a    # 0.85f

    .line 144
    .line 145
    .line 146
    const v18, -0x4151eb85    # -0.34f

    .line 147
    .line 148
    .line 149
    const v13, 0x3e9eb852    # 0.31f

    .line 150
    .line 151
    .line 152
    const v14, 0x3ea3d70a    # 0.32f

    .line 153
    .line 154
    .line 155
    const v15, 0x3f59999a    # 0.85f

    .line 156
    .line 157
    .line 158
    const v16, 0x3dcccccd    # 0.1f

    .line 159
    .line 160
    .line 161
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 162
    .line 163
    .line 164
    const/high16 v0, 0x41a80000    # 21.0f

    .line 165
    .line 166
    const/high16 v2, 0x41180000    # 9.5f

    .line 167
    .line 168
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 169
    .line 170
    .line 171
    const/high16 v17, -0x41000000    # -0.5f

    .line 172
    .line 173
    const/high16 v18, -0x41000000    # -0.5f

    .line 174
    .line 175
    const/4 v13, 0x0

    .line 176
    const v14, -0x4170a3d7    # -0.28f

    .line 177
    .line 178
    .line 179
    const v15, -0x419eb852    # -0.22f

    .line 180
    .line 181
    .line 182
    const/high16 v16, -0x41000000    # -0.5f

    .line 183
    .line 184
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 185
    .line 186
    .line 187
    const v0, -0x3fdd70a4    # -2.54f

    .line 188
    .line 189
    .line 190
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 191
    .line 192
    .line 193
    const v17, -0x414ccccd    # -0.35f

    .line 194
    .line 195
    .line 196
    const v18, 0x3f59999a    # 0.85f

    .line 197
    .line 198
    .line 199
    const v13, -0x411eb852    # -0.44f

    .line 200
    .line 201
    .line 202
    const/4 v14, 0x0

    .line 203
    const v15, -0x40d70a3d    # -0.66f

    .line 204
    .line 205
    .line 206
    const v16, 0x3f0a3d71    # 0.54f

    .line 207
    .line 208
    .line 209
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 210
    .line 211
    .line 212
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 213
    .line 214
    .line 215
    const v0, 0x4107ae14    # 8.48f

    .line 216
    .line 217
    .line 218
    const/high16 v2, 0x414c0000    # 12.75f

    .line 219
    .line 220
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 221
    .line 222
    .line 223
    const v0, 0x40628f5c    # 3.54f

    .line 224
    .line 225
    .line 226
    const v2, -0x3f9d70a4    # -3.54f

    .line 227
    .line 228
    .line 229
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 230
    .line 231
    .line 232
    const v0, 0x3fcccccd    # 1.6f

    .line 233
    .line 234
    .line 235
    const v2, 0x3f2b851f    # 0.67f

    .line 236
    .line 237
    .line 238
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 239
    .line 240
    .line 241
    const v17, 0x3f866666    # 1.05f

    .line 242
    .line 243
    .line 244
    const v18, -0x41a8f5c3    # -0.21f

    .line 245
    .line 246
    .line 247
    const v13, 0x3eb851ec    # 0.36f

    .line 248
    .line 249
    .line 250
    const v14, 0x3e19999a    # 0.15f

    .line 251
    .line 252
    .line 253
    const v15, 0x3f451eb8    # 0.77f

    .line 254
    .line 255
    .line 256
    const v16, 0x3d8f5c29    # 0.07f

    .line 257
    .line 258
    .line 259
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 260
    .line 261
    .line 262
    const v17, -0x415c28f6    # -0.32f

    .line 263
    .line 264
    .line 265
    const v18, -0x40370a3d    # -1.57f

    .line 266
    .line 267
    .line 268
    const v13, 0x3efae148    # 0.49f

    .line 269
    .line 270
    .line 271
    const v14, -0x41051eb8    # -0.49f

    .line 272
    .line 273
    .line 274
    const v15, 0x3ea3d70a    # 0.32f

    .line 275
    .line 276
    .line 277
    const v16, -0x405851ec    # -1.31f

    .line 278
    .line 279
    .line 280
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 281
    .line 282
    .line 283
    const v0, 0x40a851ec    # 5.26f

    .line 284
    .line 285
    .line 286
    const/high16 v2, 0x40900000    # 4.5f

    .line 287
    .line 288
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 289
    .line 290
    .line 291
    const v17, -0x40628f5c    # -1.23f

    .line 292
    .line 293
    .line 294
    const v18, 0x3e851eb8    # 0.26f

    .line 295
    .line 296
    .line 297
    const v13, -0x4123d70a    # -0.43f

    .line 298
    .line 299
    .line 300
    const v14, -0x41dc28f6    # -0.16f

    .line 301
    .line 302
    .line 303
    const v15, -0x40970a3d    # -0.91f

    .line 304
    .line 305
    .line 306
    const v16, -0x428a3d71    # -0.06f

    .line 307
    .line 308
    .line 309
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 310
    .line 311
    .line 312
    const/high16 v17, -0x41800000    # -0.25f

    .line 313
    .line 314
    const v18, 0x3f9d70a4    # 1.23f

    .line 315
    .line 316
    .line 317
    const v13, -0x415c28f6    # -0.32f

    .line 318
    .line 319
    .line 320
    const v14, 0x3ea3d70a    # 0.32f

    .line 321
    .line 322
    .line 323
    const v15, -0x4128f5c3    # -0.42f

    .line 324
    .line 325
    .line 326
    const v16, 0x3f4ccccd    # 0.8f

    .line 327
    .line 328
    .line 329
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 330
    .line 331
    .line 332
    const v0, 0x40670a3d    # 3.61f

    .line 333
    .line 334
    .line 335
    const v2, 0x411170a4    # 9.09f

    .line 336
    .line 337
    .line 338
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 339
    .line 340
    .line 341
    const v17, 0x3fc8f5c3    # 1.57f

    .line 342
    .line 343
    .line 344
    const v18, 0x3ea3d70a    # 0.32f

    .line 345
    .line 346
    .line 347
    const/high16 v13, 0x3e800000    # 0.25f

    .line 348
    .line 349
    const v14, 0x3f23d70a    # 0.64f

    .line 350
    .line 351
    .line 352
    const v15, 0x3f8a3d71    # 1.08f

    .line 353
    .line 354
    .line 355
    const v16, 0x3f4f5c29    # 0.81f

    .line 356
    .line 357
    .line 358
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 359
    .line 360
    .line 361
    const v17, 0x3e570a3d    # 0.21f

    .line 362
    .line 363
    .line 364
    const v18, -0x4079999a    # -1.05f

    .line 365
    .line 366
    .line 367
    const v13, 0x3e8f5c29    # 0.28f

    .line 368
    .line 369
    .line 370
    const v14, -0x4170a3d7    # -0.28f

    .line 371
    .line 372
    .line 373
    const v15, 0x3eb851ec    # 0.36f

    .line 374
    .line 375
    .line 376
    const v16, -0x40cf5c29    # -0.69f

    .line 377
    .line 378
    .line 379
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 380
    .line 381
    .line 382
    const v0, -0x40cf5c29    # -0.69f

    .line 383
    .line 384
    .line 385
    const v2, -0x40333333    # -1.6f

    .line 386
    .line 387
    .line 388
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 389
    .line 390
    .line 391
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 392
    .line 393
    .line 394
    const v0, 0x40f51eb8    # 7.66f

    .line 395
    .line 396
    .line 397
    const v2, 0x41307ae1    # 11.03f

    .line 398
    .line 399
    .line 400
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 401
    .line 402
    .line 403
    const v0, 0x40adc28f    # 5.43f

    .line 404
    .line 405
    .line 406
    const v2, 0x40c51eb8    # 6.16f

    .line 407
    .line 408
    .line 409
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 410
    .line 411
    .line 412
    const v0, 0x409bd70a    # 4.87f

    .line 413
    .line 414
    .line 415
    const v2, 0x400eb852    # 2.23f

    .line 416
    .line 417
    .line 418
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 419
    .line 420
    .line 421
    const v0, -0x3fd70a3d    # -2.64f

    .line 422
    .line 423
    .line 424
    const v2, 0x4028f5c3    # 2.64f

    .line 425
    .line 426
    .line 427
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 428
    .line 429
    .line 430
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 431
    .line 432
    .line 433
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 434
    .line 435
    .line 436
    move-result-object v2

    .line 437
    const/16 v16, 0x3800

    .line 438
    .line 439
    const/16 v17, 0x0

    .line 440
    .line 441
    const/high16 v6, 0x3f800000    # 1.0f

    .line 442
    .line 443
    const/high16 v8, 0x3f800000    # 1.0f

    .line 444
    .line 445
    const/4 v7, 0x0

    .line 446
    const/high16 v9, 0x3f800000    # 1.0f

    .line 447
    .line 448
    const/high16 v12, 0x3f800000    # 1.0f

    .line 449
    .line 450
    const/4 v13, 0x0

    .line 451
    const/4 v14, 0x0

    .line 452
    const/4 v15, 0x0

    .line 453
    const-string v4, ""

    .line 454
    .line 455
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 456
    .line 457
    .line 458
    move-result-object v0

    .line 459
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 460
    .line 461
    .line 462
    move-result-object v0

    .line 463
    sput-object v0, Landroidx/compose/material/icons/rounded/TextRotationAngleupKt;->_textRotationAngleup:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 464
    .line 465
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 466
    .line 467
    .line 468
    return-object v0
.end method
