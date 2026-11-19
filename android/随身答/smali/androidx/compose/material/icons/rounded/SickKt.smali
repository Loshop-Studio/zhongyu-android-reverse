.class public final Landroidx/compose/material/icons/rounded/SickKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_sick",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "Sick",
        "Landroidx/compose/material/icons/Icons$Rounded;",
        "getSick",
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
        "SMAP\nSick.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sick.kt\nandroidx/compose/material/icons/rounded/SickKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,94:1\n212#2,12:95\n233#2,18:108\n253#2:145\n174#3:107\n705#4,2:126\n717#4,2:128\n719#4,11:134\n72#5,4:130\n*S KotlinDebug\n*F\n+ 1 Sick.kt\nandroidx/compose/material/icons/rounded/SickKt\n*L\n29#1:95,12\n30#1:108,18\n30#1:145\n29#1:107\n30#1:126,2\n30#1:128,2\n30#1:134,11\n30#1:130,4\n*E\n"
    }
.end annotation


# static fields
.field private static _sick:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getSick(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/SickKt;->_sick:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.Sick"

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
    const/high16 v0, 0x41b80000    # 23.0f

    .line 71
    .line 72
    const/high16 v2, 0x40e00000    # 7.0f

    .line 73
    .line 74
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v17, -0x40000000    # -2.0f

    .line 78
    .line 79
    const/high16 v18, 0x40000000    # 2.0f

    .line 80
    .line 81
    const/4 v13, 0x0

    .line 82
    const v14, 0x3f8ccccd    # 1.1f

    .line 83
    .line 84
    .line 85
    const v15, -0x4099999a    # -0.9f

    .line 86
    .line 87
    .line 88
    const/high16 v16, 0x40000000    # 2.0f

    .line 89
    .line 90
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 91
    .line 92
    .line 93
    const v0, -0x4099999a    # -0.9f

    .line 94
    .line 95
    .line 96
    const/high16 v2, -0x40000000    # -2.0f

    .line 97
    .line 98
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 99
    .line 100
    .line 101
    const v17, 0x3fca3d71    # 1.58f

    .line 102
    .line 103
    .line 104
    const v18, -0x3fa8f5c3    # -3.36f

    .line 105
    .line 106
    .line 107
    const v14, -0x40b851ec    # -0.78f

    .line 108
    .line 109
    .line 110
    const v15, 0x3f7d70a4    # 0.99f

    .line 111
    .line 112
    .line 113
    const v16, -0x3fe3d70a    # -2.44f

    .line 114
    .line 115
    .line 116
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 117
    .line 118
    .line 119
    const v17, 0x3f570a3d    # 0.84f

    .line 120
    .line 121
    .line 122
    const/16 v18, 0x0

    .line 123
    .line 124
    const v13, 0x3e4ccccd    # 0.2f

    .line 125
    .line 126
    .line 127
    const v14, -0x416147ae    # -0.31f

    .line 128
    .line 129
    .line 130
    const v15, 0x3f23d70a    # 0.64f

    .line 131
    .line 132
    .line 133
    const v16, -0x416147ae    # -0.31f

    .line 134
    .line 135
    .line 136
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 137
    .line 138
    .line 139
    const/high16 v17, 0x41b80000    # 23.0f

    .line 140
    .line 141
    const/high16 v18, 0x40e00000    # 7.0f

    .line 142
    .line 143
    const v13, 0x41b0147b    # 22.01f

    .line 144
    .line 145
    .line 146
    const v14, 0x4091eb85    # 4.56f

    .line 147
    .line 148
    .line 149
    const/high16 v15, 0x41b80000    # 23.0f

    .line 150
    .line 151
    const v16, 0x40c70a3d    # 6.22f

    .line 152
    .line 153
    .line 154
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 155
    .line 156
    .line 157
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 158
    .line 159
    .line 160
    const v0, 0x41aee148    # 21.86f

    .line 161
    .line 162
    .line 163
    const v2, 0x4126147b    # 10.38f

    .line 164
    .line 165
    .line 166
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 167
    .line 168
    .line 169
    const/high16 v17, 0x41b00000    # 22.0f

    .line 170
    .line 171
    const/high16 v18, 0x41400000    # 12.0f

    .line 172
    .line 173
    const v13, 0x41af851f    # 21.94f

    .line 174
    .line 175
    .line 176
    const v14, 0x412e8f5c    # 10.91f

    .line 177
    .line 178
    .line 179
    const/high16 v15, 0x41b00000    # 22.0f

    .line 180
    .line 181
    const v16, 0x41373333    # 11.45f

    .line 182
    .line 183
    .line 184
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 185
    .line 186
    .line 187
    const v17, -0x3edfd70a    # -10.01f

    .line 188
    .line 189
    .line 190
    const/high16 v18, 0x41200000    # 10.0f

    .line 191
    .line 192
    const/4 v13, 0x0

    .line 193
    const v14, 0x40b0a3d7    # 5.52f

    .line 194
    .line 195
    .line 196
    const v15, -0x3f70a3d7    # -4.48f

    .line 197
    .line 198
    .line 199
    const/high16 v16, 0x41200000    # 10.0f

    .line 200
    .line 201
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 202
    .line 203
    .line 204
    const/high16 v17, 0x40000000    # 2.0f

    .line 205
    .line 206
    const/high16 v18, 0x41400000    # 12.0f

    .line 207
    .line 208
    const v13, 0x40cf0a3d    # 6.47f

    .line 209
    .line 210
    .line 211
    const/high16 v14, 0x41b00000    # 22.0f

    .line 212
    .line 213
    const/high16 v15, 0x40000000    # 2.0f

    .line 214
    .line 215
    const v16, 0x418c28f6    # 17.52f

    .line 216
    .line 217
    .line 218
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 219
    .line 220
    .line 221
    const v17, 0x413fd70a    # 11.99f

    .line 222
    .line 223
    .line 224
    const/high16 v18, 0x40000000    # 2.0f

    .line 225
    .line 226
    const/high16 v13, 0x40000000    # 2.0f

    .line 227
    .line 228
    const v14, 0x40cf5c29    # 6.48f

    .line 229
    .line 230
    .line 231
    const v15, 0x40cf0a3d    # 6.47f

    .line 232
    .line 233
    .line 234
    const/high16 v16, 0x40000000    # 2.0f

    .line 235
    .line 236
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 237
    .line 238
    .line 239
    const v17, 0x40cdc28f    # 6.43f

    .line 240
    .line 241
    .line 242
    const v18, 0x4015c28f    # 2.34f

    .line 243
    .line 244
    .line 245
    const v13, 0x401ccccd    # 2.45f

    .line 246
    .line 247
    .line 248
    const/4 v14, 0x0

    .line 249
    const v15, 0x4096147b    # 4.69f

    .line 250
    .line 251
    .line 252
    const v16, 0x3f6147ae    # 0.88f

    .line 253
    .line 254
    .line 255
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 256
    .line 257
    .line 258
    const/high16 v17, 0x418c0000    # 17.5f

    .line 259
    .line 260
    const/high16 v18, 0x40e00000    # 7.0f

    .line 261
    .line 262
    const v13, 0x418f47ae    # 17.91f

    .line 263
    .line 264
    .line 265
    const v14, 0x40a947ae    # 5.29f

    .line 266
    .line 267
    .line 268
    const/high16 v15, 0x418c0000    # 17.5f

    .line 269
    .line 270
    const v16, 0x40c8a3d7    # 6.27f

    .line 271
    .line 272
    .line 273
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 274
    .line 275
    .line 276
    const/high16 v17, 0x40600000    # 3.5f

    .line 277
    .line 278
    const/high16 v18, 0x40600000    # 3.5f

    .line 279
    .line 280
    const/4 v13, 0x0

    .line 281
    const v14, 0x3ff70a3d    # 1.93f

    .line 282
    .line 283
    .line 284
    const v15, 0x3fc8f5c3    # 1.57f

    .line 285
    .line 286
    .line 287
    const/high16 v16, 0x40600000    # 3.5f

    .line 288
    .line 289
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 290
    .line 291
    .line 292
    const v17, 0x41aee148    # 21.86f

    .line 293
    .line 294
    .line 295
    const v18, 0x4126147b    # 10.38f

    .line 296
    .line 297
    .line 298
    const v13, 0x41aa6666    # 21.3f

    .line 299
    .line 300
    .line 301
    const/high16 v14, 0x41280000    # 10.5f

    .line 302
    .line 303
    const v15, 0x41aca3d7    # 21.58f

    .line 304
    .line 305
    .line 306
    const v16, 0x41273333    # 10.45f

    .line 307
    .line 308
    .line 309
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 310
    .line 311
    .line 312
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 313
    .line 314
    .line 315
    const v0, 0x41607ae1    # 14.03f

    .line 316
    .line 317
    .line 318
    const v2, 0x41207ae1    # 10.03f

    .line 319
    .line 320
    .line 321
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 322
    .line 323
    .line 324
    const v0, 0x3f87ae14    # 1.06f

    .line 325
    .line 326
    .line 327
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 328
    .line 329
    .line 330
    const v17, 0x3f87ae14    # 1.06f

    .line 331
    .line 332
    .line 333
    const/16 v18, 0x0

    .line 334
    .line 335
    const v13, 0x3e947ae1    # 0.29f

    .line 336
    .line 337
    .line 338
    const v14, 0x3e947ae1    # 0.29f

    .line 339
    .line 340
    .line 341
    const v15, 0x3f451eb8    # 0.77f

    .line 342
    .line 343
    .line 344
    const v16, 0x3e947ae1    # 0.29f

    .line 345
    .line 346
    .line 347
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 348
    .line 349
    .line 350
    const/16 v17, 0x0

    .line 351
    .line 352
    const v18, -0x407851ec    # -1.06f

    .line 353
    .line 354
    .line 355
    const v14, -0x416b851f    # -0.29f

    .line 356
    .line 357
    .line 358
    const v15, 0x3e947ae1    # 0.29f

    .line 359
    .line 360
    .line 361
    const v16, -0x40bae148    # -0.77f

    .line 362
    .line 363
    .line 364
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 365
    .line 366
    .line 367
    const v0, 0x4179eb85    # 15.62f

    .line 368
    .line 369
    .line 370
    const/high16 v2, 0x41180000    # 9.5f

    .line 371
    .line 372
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 373
    .line 374
    .line 375
    const v0, -0x40f851ec    # -0.53f

    .line 376
    .line 377
    .line 378
    const v2, 0x3f07ae14    # 0.53f

    .line 379
    .line 380
    .line 381
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 382
    .line 383
    .line 384
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 385
    .line 386
    .line 387
    const v0, -0x40bae148    # -0.77f

    .line 388
    .line 389
    .line 390
    const v2, -0x416b851f    # -0.29f

    .line 391
    .line 392
    .line 393
    const/4 v4, 0x0

    .line 394
    const v6, -0x407851ec    # -1.06f

    .line 395
    .line 396
    .line 397
    invoke-virtual {v12, v0, v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 398
    .line 399
    .line 400
    const v0, -0x407851ec    # -1.06f

    .line 401
    .line 402
    .line 403
    const v2, 0x3f87ae14    # 1.06f

    .line 404
    .line 405
    .line 406
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 407
    .line 408
    .line 409
    const v17, 0x41607ae1    # 14.03f

    .line 410
    .line 411
    .line 412
    const v18, 0x41207ae1    # 10.03f

    .line 413
    .line 414
    .line 415
    const v13, 0x415bd70a    # 13.74f

    .line 416
    .line 417
    .line 418
    const v14, 0x411428f6    # 9.26f

    .line 419
    .line 420
    .line 421
    const v15, 0x415bd70a    # 13.74f

    .line 422
    .line 423
    .line 424
    const v16, 0x411bd70a    # 9.74f

    .line 425
    .line 426
    .line 427
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 428
    .line 429
    .line 430
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 431
    .line 432
    .line 433
    const v0, 0x4106147b    # 8.38f

    .line 434
    .line 435
    .line 436
    const/high16 v2, 0x41180000    # 9.5f

    .line 437
    .line 438
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 439
    .line 440
    .line 441
    const v0, -0x40f851ec    # -0.53f

    .line 442
    .line 443
    .line 444
    const v2, 0x3f07ae14    # 0.53f

    .line 445
    .line 446
    .line 447
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 448
    .line 449
    .line 450
    const/16 v17, 0x0

    .line 451
    .line 452
    const v18, 0x3f87ae14    # 1.06f

    .line 453
    .line 454
    .line 455
    const v13, -0x416b851f    # -0.29f

    .line 456
    .line 457
    .line 458
    const v14, 0x3e947ae1    # 0.29f

    .line 459
    .line 460
    .line 461
    const v15, -0x416b851f    # -0.29f

    .line 462
    .line 463
    .line 464
    const v16, 0x3f451eb8    # 0.77f

    .line 465
    .line 466
    .line 467
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 468
    .line 469
    .line 470
    const v17, 0x3f87ae14    # 1.06f

    .line 471
    .line 472
    .line 473
    const/16 v18, 0x0

    .line 474
    .line 475
    const v13, 0x3e947ae1    # 0.29f

    .line 476
    .line 477
    .line 478
    const v15, 0x3f451eb8    # 0.77f

    .line 479
    .line 480
    .line 481
    const v16, 0x3e947ae1    # 0.29f

    .line 482
    .line 483
    .line 484
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 485
    .line 486
    .line 487
    const v0, -0x407851ec    # -1.06f

    .line 488
    .line 489
    .line 490
    const v2, 0x3f87ae14    # 1.06f

    .line 491
    .line 492
    .line 493
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 494
    .line 495
    .line 496
    const/16 v17, 0x0

    .line 497
    .line 498
    const v18, -0x407851ec    # -1.06f

    .line 499
    .line 500
    .line 501
    const v14, -0x416b851f    # -0.29f

    .line 502
    .line 503
    .line 504
    const v15, 0x3e947ae1    # 0.29f

    .line 505
    .line 506
    .line 507
    const v16, -0x40bae148    # -0.77f

    .line 508
    .line 509
    .line 510
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 511
    .line 512
    .line 513
    const v0, 0x410e8f5c    # 8.91f

    .line 514
    .line 515
    .line 516
    const v2, 0x40fd1eb8    # 7.91f

    .line 517
    .line 518
    .line 519
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 520
    .line 521
    .line 522
    const v17, -0x407851ec    # -1.06f

    .line 523
    .line 524
    .line 525
    const/16 v18, 0x0

    .line 526
    .line 527
    const v13, -0x416b851f    # -0.29f

    .line 528
    .line 529
    .line 530
    const v15, -0x40bae148    # -0.77f

    .line 531
    .line 532
    .line 533
    const v16, -0x416b851f    # -0.29f

    .line 534
    .line 535
    .line 536
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 537
    .line 538
    .line 539
    const v0, 0x3f451eb8    # 0.77f

    .line 540
    .line 541
    .line 542
    const v2, -0x416b851f    # -0.29f

    .line 543
    .line 544
    .line 545
    const v6, 0x3f87ae14    # 1.06f

    .line 546
    .line 547
    .line 548
    invoke-virtual {v12, v2, v0, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 549
    .line 550
    .line 551
    const v0, 0x4106147b    # 8.38f

    .line 552
    .line 553
    .line 554
    const/high16 v2, 0x41180000    # 9.5f

    .line 555
    .line 556
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 557
    .line 558
    .line 559
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 560
    .line 561
    .line 562
    const v0, 0x4183c28f    # 16.47f

    .line 563
    .line 564
    .line 565
    const v2, 0x417ccccd    # 15.8f

    .line 566
    .line 567
    .line 568
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 569
    .line 570
    .line 571
    const v17, -0x3f70f5c3    # -4.47f

    .line 572
    .line 573
    .line 574
    const v18, -0x3feccccd    # -2.3f

    .line 575
    .line 576
    .line 577
    const/high16 v13, -0x40800000    # -1.0f

    .line 578
    .line 579
    const v14, -0x404e147b    # -1.39f

    .line 580
    .line 581
    .line 582
    const v15, -0x3fd851ec    # -2.62f

    .line 583
    .line 584
    .line 585
    const v16, -0x3feccccd    # -2.3f

    .line 586
    .line 587
    .line 588
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 589
    .line 590
    .line 591
    const v17, -0x3fe47ae1    # -2.43f

    .line 592
    .line 593
    .line 594
    const v18, 0x3f0f5c29    # 0.56f

    .line 595
    .line 596
    .line 597
    const v13, -0x40a147ae    # -0.87f

    .line 598
    .line 599
    .line 600
    const/4 v14, 0x0

    .line 601
    const v15, -0x4027ae14    # -1.69f

    .line 602
    .line 603
    .line 604
    const v16, 0x3e4ccccd    # 0.2f

    .line 605
    .line 606
    .line 607
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 608
    .line 609
    .line 610
    const v0, 0x40bfae14    # 5.99f

    .line 611
    .line 612
    .line 613
    const/high16 v2, 0x41400000    # 12.0f

    .line 614
    .line 615
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 616
    .line 617
    .line 618
    const v17, -0x40c28f5c    # -0.74f

    .line 619
    .line 620
    .line 621
    const v18, -0x405ae148    # -1.29f

    .line 622
    .line 623
    .line 624
    const/4 v13, 0x0

    .line 625
    const v14, -0x40fae148    # -0.52f

    .line 626
    .line 627
    .line 628
    const v15, -0x417ae148    # -0.26f

    .line 629
    .line 630
    .line 631
    const v16, -0x407d70a4    # -1.02f

    .line 632
    .line 633
    .line 634
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 635
    .line 636
    .line 637
    const v17, -0x3ff51eb8    # -2.17f

    .line 638
    .line 639
    .line 640
    const v18, 0x3f4ccccd    # 0.8f

    .line 641
    .line 642
    .line 643
    const v13, -0x40b33333    # -0.8f

    .line 644
    .line 645
    .line 646
    const v14, -0x41147ae1    # -0.46f

    .line 647
    .line 648
    .line 649
    const v15, -0x40147ae1    # -1.84f

    .line 650
    .line 651
    .line 652
    const v16, -0x421eb852    # -0.11f

    .line 653
    .line 654
    .line 655
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 656
    .line 657
    .line 658
    const v17, 0x3ee147ae    # 0.44f

    .line 659
    .line 660
    .line 661
    const v18, 0x3fd1eb85    # 1.64f

    .line 662
    .line 663
    .line 664
    const v13, -0x41a8f5c3    # -0.21f

    .line 665
    .line 666
    .line 667
    const v14, 0x3f11eb85    # 0.57f

    .line 668
    .line 669
    .line 670
    const v15, -0x430a3d71    # -0.03f

    .line 671
    .line 672
    .line 673
    const/high16 v16, 0x3fa00000    # 1.25f

    .line 674
    .line 675
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 676
    .line 677
    .line 678
    const v17, 0x3fdc28f6    # 1.72f

    .line 679
    .line 680
    .line 681
    const v18, 0x3e23d70a    # 0.16f

    .line 682
    .line 683
    .line 684
    const v13, 0x3f051eb8    # 0.52f

    .line 685
    .line 686
    .line 687
    const v14, 0x3ee147ae    # 0.44f

    .line 688
    .line 689
    .line 690
    const v15, 0x3f99999a    # 1.2f

    .line 691
    .line 692
    .line 693
    const v16, 0x3ee66666    # 0.45f

    .line 694
    .line 695
    .line 696
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 697
    .line 698
    .line 699
    const v0, 0x403e147b    # 2.97f

    .line 700
    .line 701
    .line 702
    const v2, 0x3fdc28f6    # 1.72f

    .line 703
    .line 704
    .line 705
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 706
    .line 707
    .line 708
    const v17, -0x40d1eb85    # -0.68f

    .line 709
    .line 710
    .line 711
    const v18, 0x3f47ae14    # 0.78f

    .line 712
    .line 713
    .line 714
    const/high16 v13, -0x41800000    # -0.25f

    .line 715
    .line 716
    const v14, 0x3e75c28f    # 0.24f

    .line 717
    .line 718
    .line 719
    const v15, -0x410a3d71    # -0.48f

    .line 720
    .line 721
    .line 722
    const/high16 v16, 0x3f000000    # 0.5f

    .line 723
    .line 724
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 725
    .line 726
    .line 727
    const v17, 0x41026666    # 8.15f

    .line 728
    .line 729
    .line 730
    const/high16 v18, 0x41880000    # 17.0f

    .line 731
    .line 732
    const v13, 0x40e570a4    # 7.17f

    .line 733
    .line 734
    .line 735
    const v14, 0x41826666    # 16.3f

    .line 736
    .line 737
    .line 738
    const v15, 0x40f0f5c3    # 7.53f

    .line 739
    .line 740
    .line 741
    const/high16 v16, 0x41880000    # 17.0f

    .line 742
    .line 743
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 744
    .line 745
    .line 746
    const v17, 0x3f19999a    # 0.6f

    .line 747
    .line 748
    .line 749
    const v18, -0x41666666    # -0.3f

    .line 750
    .line 751
    .line 752
    const v13, 0x3e6b851f    # 0.23f

    .line 753
    .line 754
    .line 755
    const/4 v14, 0x0

    .line 756
    const v15, 0x3eeb851f    # 0.46f

    .line 757
    .line 758
    .line 759
    const v16, -0x42333333    # -0.1f

    .line 760
    .line 761
    .line 762
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 763
    .line 764
    .line 765
    const/high16 v17, 0x41400000    # 12.0f

    .line 766
    .line 767
    const/high16 v18, 0x41700000    # 15.0f

    .line 768
    .line 769
    const v13, 0x4117851f    # 9.47f

    .line 770
    .line 771
    .line 772
    const v14, 0x417ae148    # 15.68f

    .line 773
    .line 774
    .line 775
    const v15, 0x412a6666    # 10.65f

    .line 776
    .line 777
    .line 778
    const/high16 v16, 0x41700000    # 15.0f

    .line 779
    .line 780
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 781
    .line 782
    .line 783
    const/high16 v0, 0x40500000    # 3.25f

    .line 784
    .line 785
    const v2, 0x3fd9999a    # 1.7f

    .line 786
    .line 787
    .line 788
    const v4, 0x4021eb85    # 2.53f

    .line 789
    .line 790
    .line 791
    const v6, 0x3f2e147b    # 0.68f

    .line 792
    .line 793
    .line 794
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 795
    .line 796
    .line 797
    const v17, 0x3f19999a    # 0.6f

    .line 798
    .line 799
    .line 800
    const v18, 0x3e99999a    # 0.3f

    .line 801
    .line 802
    .line 803
    const v13, 0x3e0f5c29    # 0.14f

    .line 804
    .line 805
    .line 806
    const v14, 0x3e428f5c    # 0.19f

    .line 807
    .line 808
    .line 809
    const v15, 0x3eb851ec    # 0.36f

    .line 810
    .line 811
    .line 812
    const v16, 0x3e99999a    # 0.3f

    .line 813
    .line 814
    .line 815
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 816
    .line 817
    .line 818
    const/4 v0, 0x0

    .line 819
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 820
    .line 821
    .line 822
    const v17, 0x4183c28f    # 16.47f

    .line 823
    .line 824
    .line 825
    const v18, 0x417ccccd    # 15.8f

    .line 826
    .line 827
    .line 828
    const v13, 0x4183c28f    # 16.47f

    .line 829
    .line 830
    .line 831
    const/high16 v14, 0x41880000    # 17.0f

    .line 832
    .line 833
    const v15, 0x4186a3d7    # 16.83f

    .line 834
    .line 835
    .line 836
    const v16, 0x41826666    # 16.3f

    .line 837
    .line 838
    .line 839
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 840
    .line 841
    .line 842
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 843
    .line 844
    .line 845
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 846
    .line 847
    .line 848
    move-result-object v2

    .line 849
    const/16 v16, 0x3800

    .line 850
    .line 851
    const/16 v17, 0x0

    .line 852
    .line 853
    const/high16 v6, 0x3f800000    # 1.0f

    .line 854
    .line 855
    const/high16 v8, 0x3f800000    # 1.0f

    .line 856
    .line 857
    const/4 v7, 0x0

    .line 858
    const/high16 v9, 0x3f800000    # 1.0f

    .line 859
    .line 860
    const/high16 v12, 0x3f800000    # 1.0f

    .line 861
    .line 862
    const/4 v13, 0x0

    .line 863
    const/4 v14, 0x0

    .line 864
    const/4 v15, 0x0

    .line 865
    const-string v4, ""

    .line 866
    .line 867
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 868
    .line 869
    .line 870
    move-result-object v0

    .line 871
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 872
    .line 873
    .line 874
    move-result-object v0

    .line 875
    sput-object v0, Landroidx/compose/material/icons/rounded/SickKt;->_sick:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 876
    .line 877
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 878
    .line 879
    .line 880
    return-object v0
.end method
