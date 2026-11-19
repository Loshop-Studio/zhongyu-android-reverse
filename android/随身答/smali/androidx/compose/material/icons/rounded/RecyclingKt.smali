.class public final Landroidx/compose/material/icons/rounded/RecyclingKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_recycling",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "Recycling",
        "Landroidx/compose/material/icons/Icons$Rounded;",
        "getRecycling",
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
        "SMAP\nRecycling.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Recycling.kt\nandroidx/compose/material/icons/rounded/RecyclingKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,109:1\n212#2,12:110\n233#2,18:123\n253#2:160\n174#3:122\n705#4,2:141\n717#4,2:143\n719#4,11:149\n72#5,4:145\n*S KotlinDebug\n*F\n+ 1 Recycling.kt\nandroidx/compose/material/icons/rounded/RecyclingKt\n*L\n29#1:110,12\n30#1:123,18\n30#1:160\n29#1:122\n30#1:141,2\n30#1:143,2\n30#1:149,11\n30#1:145,4\n*E\n"
    }
.end annotation


# static fields
.field private static _recycling:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getRecycling(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/RecyclingKt;->_recycling:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.Recycling"

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
    const v0, 0x40ed1eb8    # 7.41f

    .line 71
    .line 72
    .line 73
    const v2, 0x40c66666    # 6.2f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v17, 0x40c0f5c3    # 6.03f

    .line 80
    .line 81
    .line 82
    const v18, 0x40d75c29    # 6.73f

    .line 83
    .line 84
    .line 85
    const v13, 0x40bf0a3d    # 5.97f

    .line 86
    .line 87
    .line 88
    const v14, 0x40e8a3d7    # 7.27f

    .line 89
    .line 90
    .line 91
    const v15, 0x40bc7ae1    # 5.89f

    .line 92
    .line 93
    .line 94
    const v16, 0x40deb852    # 6.96f

    .line 95
    .line 96
    .line 97
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 98
    .line 99
    .line 100
    const v0, 0x40e66666    # 7.2f

    .line 101
    .line 102
    .line 103
    const v2, 0x4098f5c3    # 4.78f

    .line 104
    .line 105
    .line 106
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 107
    .line 108
    .line 109
    const v0, 0x3f83d70a    # 1.03f

    .line 110
    .line 111
    .line 112
    const v2, -0x40251eb8    # -1.71f

    .line 113
    .line 114
    .line 115
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 116
    .line 117
    .line 118
    const v17, 0x3fdc28f6    # 1.72f

    .line 119
    .line 120
    .line 121
    const/16 v18, 0x0

    .line 122
    .line 123
    const v13, 0x3ec7ae14    # 0.39f

    .line 124
    .line 125
    .line 126
    const v14, -0x40d9999a    # -0.65f

    .line 127
    .line 128
    .line 129
    const v15, 0x3faa3d71    # 1.33f

    .line 130
    .line 131
    .line 132
    const v16, -0x40d9999a    # -0.65f

    .line 133
    .line 134
    .line 135
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 136
    .line 137
    .line 138
    const v0, 0x3fbd70a4    # 1.48f

    .line 139
    .line 140
    .line 141
    const v2, 0x401d70a4    # 2.46f

    .line 142
    .line 143
    .line 144
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 145
    .line 146
    .line 147
    const v0, -0x40628f5c    # -1.23f

    .line 148
    .line 149
    .line 150
    const v2, 0x4003d70a    # 2.06f

    .line 151
    .line 152
    .line 153
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 154
    .line 155
    .line 156
    const v0, -0x40c7ae14    # -0.72f

    .line 157
    .line 158
    .line 159
    const v2, 0x3f99999a    # 1.2f

    .line 160
    .line 161
    .line 162
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 163
    .line 164
    .line 165
    const v17, 0x410c51ec    # 8.77f

    .line 166
    .line 167
    .line 168
    const v18, 0x410f5c29    # 8.96f

    .line 169
    .line 170
    .line 171
    const v13, 0x41151eb8    # 9.32f

    .line 172
    .line 173
    .line 174
    const v14, 0x411051ec    # 9.02f

    .line 175
    .line 176
    .line 177
    const v15, 0x411028f6    # 9.01f

    .line 178
    .line 179
    .line 180
    const v16, 0x4111999a    # 9.1f

    .line 181
    .line 182
    .line 183
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 184
    .line 185
    .line 186
    const v0, 0x40ed1eb8    # 7.41f

    .line 187
    .line 188
    .line 189
    const v2, 0x40c66666    # 6.2f

    .line 190
    .line 191
    .line 192
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 193
    .line 194
    .line 195
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 196
    .line 197
    .line 198
    const v0, 0x41adc28f    # 21.72f

    .line 199
    .line 200
    .line 201
    const v2, 0x414f851f    # 12.97f

    .line 202
    .line 203
    .line 204
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 205
    .line 206
    .line 207
    const v0, -0x40547ae1    # -1.34f

    .line 208
    .line 209
    .line 210
    const v2, -0x3ff0a3d7    # -2.24f

    .line 211
    .line 212
    .line 213
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 214
    .line 215
    .line 216
    const v17, -0x40d1eb85    # -0.68f

    .line 217
    .line 218
    .line 219
    const v18, -0x41c7ae14    # -0.18f

    .line 220
    .line 221
    .line 222
    const v13, -0x41f0a3d7    # -0.14f

    .line 223
    .line 224
    .line 225
    const v14, -0x41947ae1    # -0.23f

    .line 226
    .line 227
    .line 228
    const v15, -0x411eb852    # -0.44f

    .line 229
    .line 230
    .line 231
    const v16, -0x416147ae    # -0.31f

    .line 232
    .line 233
    .line 234
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 235
    .line 236
    .line 237
    const v0, -0x3fd9999a    # -2.6f

    .line 238
    .line 239
    .line 240
    const/high16 v2, 0x3fc00000    # 1.5f

    .line 241
    .line 242
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 243
    .line 244
    .line 245
    const v17, -0x41c7ae14    # -0.18f

    .line 246
    .line 247
    .line 248
    const v18, 0x3f30a3d7    # 0.69f

    .line 249
    .line 250
    .line 251
    const v13, -0x418a3d71    # -0.24f

    .line 252
    .line 253
    .line 254
    const v14, 0x3e0f5c29    # 0.14f

    .line 255
    .line 256
    .line 257
    const v15, -0x415c28f6    # -0.32f

    .line 258
    .line 259
    .line 260
    const v16, 0x3ee66666    # 0.45f

    .line 261
    .line 262
    .line 263
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 264
    .line 265
    .line 266
    const v0, 0x4196f5c3    # 18.87f

    .line 267
    .line 268
    .line 269
    const/high16 v2, 0x41800000    # 16.0f

    .line 270
    .line 271
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 272
    .line 273
    .line 274
    const v0, 0x3f8b851f    # 1.09f

    .line 275
    .line 276
    .line 277
    const/4 v2, 0x0

    .line 278
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 279
    .line 280
    .line 281
    const v17, 0x3fcb851f    # 1.59f

    .line 282
    .line 283
    .line 284
    const v18, -0x40c51eb8    # -0.73f

    .line 285
    .line 286
    .line 287
    const v13, 0x3f1c28f6    # 0.61f

    .line 288
    .line 289
    .line 290
    const/4 v14, 0x0

    .line 291
    const v15, 0x3f99999a    # 1.2f

    .line 292
    .line 293
    .line 294
    const v16, -0x417ae148    # -0.26f

    .line 295
    .line 296
    .line 297
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 298
    .line 299
    .line 300
    const/high16 v17, 0x41b00000    # 22.0f

    .line 301
    .line 302
    const/high16 v18, 0x41600000    # 14.0f

    .line 303
    .line 304
    const v13, 0x41aecccd    # 21.85f

    .line 305
    .line 306
    .line 307
    const v14, 0x416e6666    # 14.9f

    .line 308
    .line 309
    .line 310
    const/high16 v15, 0x41b00000    # 22.0f

    .line 311
    .line 312
    const v16, 0x41673333    # 14.45f

    .line 313
    .line 314
    .line 315
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 316
    .line 317
    .line 318
    const v17, 0x41adc28f    # 21.72f

    .line 319
    .line 320
    .line 321
    const v18, 0x414f851f    # 12.97f

    .line 322
    .line 323
    .line 324
    const/high16 v13, 0x41b00000    # 22.0f

    .line 325
    .line 326
    const v14, 0x415a3d71    # 13.64f

    .line 327
    .line 328
    .line 329
    const v15, 0x41af3333    # 21.9f

    .line 330
    .line 331
    .line 332
    const v16, 0x4154a3d7    # 13.29f

    .line 333
    .line 334
    .line 335
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 336
    .line 337
    .line 338
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 339
    .line 340
    .line 341
    const/high16 v0, 0x41a80000    # 21.0f

    .line 342
    .line 343
    const/high16 v2, 0x41800000    # 16.0f

    .line 344
    .line 345
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 346
    .line 347
    .line 348
    const/high16 v0, 0x3fc00000    # 1.5f

    .line 349
    .line 350
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 351
    .line 352
    .line 353
    const v17, 0x3fe51eb8    # 1.79f

    .line 354
    .line 355
    .line 356
    const v18, -0x4071eb85    # -1.11f

    .line 357
    .line 358
    .line 359
    const v13, 0x3f428f5c    # 0.76f

    .line 360
    .line 361
    .line 362
    const/4 v14, 0x0

    .line 363
    const v15, 0x3fb9999a    # 1.45f

    .line 364
    .line 365
    .line 366
    const v16, -0x4123d70a    # -0.43f

    .line 367
    .line 368
    .line 369
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 370
    .line 371
    .line 372
    const v0, 0x41a5eb85    # 20.74f

    .line 373
    .line 374
    .line 375
    const/high16 v2, 0x41880000    # 17.0f

    .line 376
    .line 377
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 378
    .line 379
    .line 380
    const/high16 v0, 0x41800000    # 16.0f

    .line 381
    .line 382
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 383
    .line 384
    .line 385
    const v0, -0x40b5c28f    # -0.79f

    .line 386
    .line 387
    .line 388
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 389
    .line 390
    .line 391
    const v17, -0x40a66666    # -0.85f

    .line 392
    .line 393
    .line 394
    const v18, -0x414ccccd    # -0.35f

    .line 395
    .line 396
    .line 397
    const/4 v13, 0x0

    .line 398
    const v14, -0x4119999a    # -0.45f

    .line 399
    .line 400
    .line 401
    const v15, -0x40f5c28f    # -0.54f

    .line 402
    .line 403
    .line 404
    const v16, -0x40d47ae1    # -0.67f

    .line 405
    .line 406
    .line 407
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 408
    .line 409
    .line 410
    const v0, -0x3fcd70a4    # -2.79f

    .line 411
    .line 412
    .line 413
    const v2, 0x40328f5c    # 2.79f

    .line 414
    .line 415
    .line 416
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 417
    .line 418
    .line 419
    const/16 v17, 0x0

    .line 420
    .line 421
    const v18, 0x3f35c28f    # 0.71f

    .line 422
    .line 423
    .line 424
    const v13, -0x41b33333    # -0.2f

    .line 425
    .line 426
    .line 427
    const v14, 0x3e4ccccd    # 0.2f

    .line 428
    .line 429
    .line 430
    const v15, -0x41b33333    # -0.2f

    .line 431
    .line 432
    .line 433
    const v16, 0x3f028f5c    # 0.51f

    .line 434
    .line 435
    .line 436
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 437
    .line 438
    .line 439
    const v0, 0x40328f5c    # 2.79f

    .line 440
    .line 441
    .line 442
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 443
    .line 444
    .line 445
    const v17, 0x3f59999a    # 0.85f

    .line 446
    .line 447
    .line 448
    const v18, -0x414ccccd    # -0.35f

    .line 449
    .line 450
    .line 451
    const v13, 0x3e9eb852    # 0.31f

    .line 452
    .line 453
    .line 454
    const v14, 0x3e9eb852    # 0.31f

    .line 455
    .line 456
    .line 457
    const v15, 0x3f59999a    # 0.85f

    .line 458
    .line 459
    .line 460
    const v16, 0x3db851ec    # 0.09f

    .line 461
    .line 462
    .line 463
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 464
    .line 465
    .line 466
    const/high16 v0, 0x41a80000    # 21.0f

    .line 467
    .line 468
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 469
    .line 470
    .line 471
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 472
    .line 473
    .line 474
    const/high16 v0, 0x41180000    # 9.5f

    .line 475
    .line 476
    const/high16 v2, 0x41880000    # 17.0f

    .line 477
    .line 478
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 479
    .line 480
    .line 481
    const v0, 0x40b66666    # 5.7f

    .line 482
    .line 483
    .line 484
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 485
    .line 486
    .line 487
    const v0, -0x40a8f5c3    # -0.84f

    .line 488
    .line 489
    .line 490
    const v2, 0x3fb47ae1    # 1.41f

    .line 491
    .line 492
    .line 493
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 494
    .line 495
    .line 496
    const v17, -0x428a3d71    # -0.06f

    .line 497
    .line 498
    .line 499
    const v18, 0x3fd33333    # 1.65f

    .line 500
    .line 501
    .line 502
    const v13, -0x41666666    # -0.3f

    .line 503
    .line 504
    .line 505
    const/high16 v14, 0x3f000000    # 0.5f

    .line 506
    .line 507
    const v15, -0x415c28f6    # -0.32f

    .line 508
    .line 509
    .line 510
    const v16, 0x3f8f5c29    # 1.12f

    .line 511
    .line 512
    .line 513
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 514
    .line 515
    .line 516
    const/4 v0, 0x0

    .line 517
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 518
    .line 519
    .line 520
    const v17, 0x40ca3d71    # 6.32f

    .line 521
    .line 522
    .line 523
    const/high16 v18, 0x41a80000    # 21.0f

    .line 524
    .line 525
    const v13, 0x40a28f5c    # 5.08f

    .line 526
    .line 527
    .line 528
    const v14, 0x41a50a3d    # 20.63f

    .line 529
    .line 530
    .line 531
    const v15, 0x40b570a4    # 5.67f

    .line 532
    .line 533
    .line 534
    const/high16 v16, 0x41a80000    # 21.0f

    .line 535
    .line 536
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 537
    .line 538
    .line 539
    const/high16 v0, 0x41180000    # 9.5f

    .line 540
    .line 541
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 542
    .line 543
    .line 544
    const/high16 v17, 0x3f000000    # 0.5f

    .line 545
    .line 546
    const/high16 v18, -0x41000000    # -0.5f

    .line 547
    .line 548
    const v13, 0x3e8f5c29    # 0.28f

    .line 549
    .line 550
    .line 551
    const/4 v14, 0x0

    .line 552
    const/high16 v15, 0x3f000000    # 0.5f

    .line 553
    .line 554
    const v16, -0x419eb852    # -0.22f

    .line 555
    .line 556
    .line 557
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 558
    .line 559
    .line 560
    const/high16 v0, -0x3fc00000    # -3.0f

    .line 561
    .line 562
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 563
    .line 564
    .line 565
    const/high16 v17, 0x41180000    # 9.5f

    .line 566
    .line 567
    const/high16 v18, 0x41880000    # 17.0f

    .line 568
    .line 569
    const/high16 v13, 0x41200000    # 10.0f

    .line 570
    .line 571
    const v14, 0x4189c28f    # 17.22f

    .line 572
    .line 573
    .line 574
    const v15, 0x411c7ae1    # 9.78f

    .line 575
    .line 576
    .line 577
    const/high16 v16, 0x41880000    # 17.0f

    .line 578
    .line 579
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 580
    .line 581
    .line 582
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 583
    .line 584
    .line 585
    const v0, 0x4165999a    # 14.35f

    .line 586
    .line 587
    .line 588
    const v2, 0x40c3d70a    # 6.12f

    .line 589
    .line 590
    .line 591
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 592
    .line 593
    .line 594
    const v0, 0x3f333333    # 0.7f

    .line 595
    .line 596
    .line 597
    const v2, 0x3ed70a3d    # 0.42f

    .line 598
    .line 599
    .line 600
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 601
    .line 602
    .line 603
    const v17, 0x3f3d70a4    # 0.74f

    .line 604
    .line 605
    .line 606
    const v18, -0x40f33333    # -0.55f

    .line 607
    .line 608
    .line 609
    const v13, 0x3ec28f5c    # 0.38f

    .line 610
    .line 611
    .line 612
    const v14, 0x3e6b851f    # 0.23f

    .line 613
    .line 614
    .line 615
    const v15, 0x3f59999a    # 0.85f

    .line 616
    .line 617
    .line 618
    const v16, -0x420a3d71    # -0.12f

    .line 619
    .line 620
    .line 621
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 622
    .line 623
    .line 624
    const v0, 0x40d33333    # 6.6f

    .line 625
    .line 626
    .line 627
    const v2, 0x4126147b    # 10.38f

    .line 628
    .line 629
    .line 630
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 631
    .line 632
    .line 633
    const/high16 v17, 0x40c00000    # 6.0f

    .line 634
    .line 635
    const v18, 0x412051ec    # 10.02f

    .line 636
    .line 637
    .line 638
    const v13, 0x40d147ae    # 6.54f

    .line 639
    .line 640
    .line 641
    const v14, 0x4121eb85    # 10.12f

    .line 642
    .line 643
    .line 644
    const v15, 0x40c8a3d7    # 6.27f

    .line 645
    .line 646
    .line 647
    const v16, 0x411f3333    # 9.95f

    .line 648
    .line 649
    .line 650
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 651
    .line 652
    .line 653
    const v0, -0x3f8ae148    # -3.83f

    .line 654
    .line 655
    .line 656
    const v2, 0x3f75c28f    # 0.96f

    .line 657
    .line 658
    .line 659
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 660
    .line 661
    .line 662
    const v17, -0x41f0a3d7    # -0.14f

    .line 663
    .line 664
    .line 665
    const v18, 0x3f68f5c3    # 0.91f

    .line 666
    .line 667
    .line 668
    const v13, -0x4123d70a    # -0.43f

    .line 669
    .line 670
    .line 671
    const v14, 0x3de147ae    # 0.11f

    .line 672
    .line 673
    .line 674
    const v15, -0x40fae148    # -0.52f

    .line 675
    .line 676
    .line 677
    const v16, 0x3f2e147b    # 0.68f

    .line 678
    .line 679
    .line 680
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 681
    .line 682
    .line 683
    const v0, 0x3f28f5c3    # 0.66f

    .line 684
    .line 685
    .line 686
    const v2, 0x3ecccccd    # 0.4f

    .line 687
    .line 688
    .line 689
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 690
    .line 691
    .line 692
    const v0, -0x412e147b    # -0.41f

    .line 693
    .line 694
    .line 695
    const v2, 0x3f30a3d7    # 0.69f

    .line 696
    .line 697
    .line 698
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 699
    .line 700
    .line 701
    const v17, -0x4270a3d7    # -0.07f

    .line 702
    .line 703
    .line 704
    const v18, 0x3ff5c28f    # 1.92f

    .line 705
    .line 706
    .line 707
    const v13, -0x414ccccd    # -0.35f

    .line 708
    .line 709
    .line 710
    const v14, 0x3f170a3d    # 0.59f

    .line 711
    .line 712
    .line 713
    const v15, -0x413d70a4    # -0.38f

    .line 714
    .line 715
    .line 716
    const v16, 0x3fa7ae14    # 1.31f

    .line 717
    .line 718
    .line 719
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 720
    .line 721
    .line 722
    const v0, 0x3fd0a3d7    # 1.63f

    .line 723
    .line 724
    .line 725
    const v2, 0x4050a3d7    # 3.26f

    .line 726
    .line 727
    .line 728
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 729
    .line 730
    .line 731
    const v0, 0x4165999a    # 14.35f

    .line 732
    .line 733
    .line 734
    const v2, 0x40c3d70a    # 6.12f

    .line 735
    .line 736
    .line 737
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 738
    .line 739
    .line 740
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 741
    .line 742
    .line 743
    const v0, 0x40a47ae1    # 5.14f

    .line 744
    .line 745
    .line 746
    const v2, 0x418828f6    # 17.02f

    .line 747
    .line 748
    .line 749
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 750
    .line 751
    .line 752
    const v0, -0x4059999a    # -1.3f

    .line 753
    .line 754
    .line 755
    const v2, -0x3ff51eb8    # -2.17f

    .line 756
    .line 757
    .line 758
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 759
    .line 760
    .line 761
    const/high16 v17, 0x41600000    # 14.0f

    .line 762
    .line 763
    const/high16 v18, 0x40000000    # 2.0f

    .line 764
    .line 765
    const v13, 0x4175999a    # 15.35f

    .line 766
    .line 767
    .line 768
    const v14, 0x4017ae14    # 2.37f

    .line 769
    .line 770
    .line 771
    const v15, 0x416b3333    # 14.7f

    .line 772
    .line 773
    .line 774
    const/high16 v16, 0x40000000    # 2.0f

    .line 775
    .line 776
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 777
    .line 778
    .line 779
    const v0, -0x3f9e147b    # -3.53f

    .line 780
    .line 781
    .line 782
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 783
    .line 784
    .line 785
    const v0, 0x4047ae14    # 3.12f

    .line 786
    .line 787
    .line 788
    const v2, 0x40a66666    # 5.2f

    .line 789
    .line 790
    .line 791
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 792
    .line 793
    .line 794
    const v0, 0x414e6666    # 12.9f

    .line 795
    .line 796
    .line 797
    const v2, 0x40f3851f    # 7.61f

    .line 798
    .line 799
    .line 800
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 801
    .line 802
    .line 803
    const v17, 0x3e0f5c29    # 0.14f

    .line 804
    .line 805
    .line 806
    const v18, 0x3f68f5c3    # 0.91f

    .line 807
    .line 808
    .line 809
    const v13, -0x413d70a4    # -0.38f

    .line 810
    .line 811
    .line 812
    const v14, 0x3e6b851f    # 0.23f

    .line 813
    .line 814
    .line 815
    const v15, -0x41666666    # -0.3f

    .line 816
    .line 817
    .line 818
    const v16, 0x3f4f5c29    # 0.81f

    .line 819
    .line 820
    .line 821
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 822
    .line 823
    .line 824
    const v0, 0x40751eb8    # 3.83f

    .line 825
    .line 826
    .line 827
    const v2, 0x3f75c28f    # 0.96f

    .line 828
    .line 829
    .line 830
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 831
    .line 832
    .line 833
    const v17, 0x3f1c28f6    # 0.61f

    .line 834
    .line 835
    .line 836
    const v18, -0x4147ae14    # -0.36f

    .line 837
    .line 838
    .line 839
    const v13, 0x3e8a3d71    # 0.27f

    .line 840
    .line 841
    .line 842
    const v14, 0x3d8f5c29    # 0.07f

    .line 843
    .line 844
    .line 845
    const v15, 0x3f0a3d71    # 0.54f

    .line 846
    .line 847
    .line 848
    const v16, -0x42333333    # -0.1f

    .line 849
    .line 850
    .line 851
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 852
    .line 853
    .line 854
    const v0, -0x3f8ae148    # -3.83f

    .line 855
    .line 856
    .line 857
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 858
    .line 859
    .line 860
    const v17, -0x40c28f5c    # -0.74f

    .line 861
    .line 862
    .line 863
    const v18, -0x40f33333    # -0.55f

    .line 864
    .line 865
    .line 866
    const v13, 0x3de147ae    # 0.11f

    .line 867
    .line 868
    .line 869
    const v14, -0x4123d70a    # -0.43f

    .line 870
    .line 871
    .line 872
    const v15, -0x4147ae14    # -0.36f

    .line 873
    .line 874
    .line 875
    const v16, -0x40b851ec    # -0.78f

    .line 876
    .line 877
    .line 878
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 879
    .line 880
    .line 881
    const v0, 0x40a47ae1    # 5.14f

    .line 882
    .line 883
    .line 884
    const v2, 0x418828f6    # 17.02f

    .line 885
    .line 886
    .line 887
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 888
    .line 889
    .line 890
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 891
    .line 892
    .line 893
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 894
    .line 895
    .line 896
    move-result-object v2

    .line 897
    const/16 v16, 0x3800

    .line 898
    .line 899
    const/16 v17, 0x0

    .line 900
    .line 901
    const/high16 v6, 0x3f800000    # 1.0f

    .line 902
    .line 903
    const/high16 v8, 0x3f800000    # 1.0f

    .line 904
    .line 905
    const/4 v7, 0x0

    .line 906
    const/high16 v9, 0x3f800000    # 1.0f

    .line 907
    .line 908
    const/high16 v12, 0x3f800000    # 1.0f

    .line 909
    .line 910
    const/4 v13, 0x0

    .line 911
    const/4 v14, 0x0

    .line 912
    const/4 v15, 0x0

    .line 913
    const-string v4, ""

    .line 914
    .line 915
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 916
    .line 917
    .line 918
    move-result-object v0

    .line 919
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 920
    .line 921
    .line 922
    move-result-object v0

    .line 923
    sput-object v0, Landroidx/compose/material/icons/rounded/RecyclingKt;->_recycling:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 924
    .line 925
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 926
    .line 927
    .line 928
    return-object v0
.end method
