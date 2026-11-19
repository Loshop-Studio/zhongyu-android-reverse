.class public final Landroidx/compose/material/icons/rounded/NearbyOffKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_nearbyOff",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "NearbyOff",
        "Landroidx/compose/material/icons/Icons$Rounded;",
        "getNearbyOff",
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
        "SMAP\nNearbyOff.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NearbyOff.kt\nandroidx/compose/material/icons/rounded/NearbyOffKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,85:1\n212#2,12:86\n233#2,18:99\n253#2:136\n174#3:98\n705#4,2:117\n717#4,2:119\n719#4,11:125\n72#5,4:121\n*S KotlinDebug\n*F\n+ 1 NearbyOff.kt\nandroidx/compose/material/icons/rounded/NearbyOffKt\n*L\n29#1:86,12\n30#1:99,18\n30#1:136\n29#1:98\n30#1:117,2\n30#1:119,2\n30#1:125,11\n30#1:121,4\n*E\n"
    }
.end annotation


# static fields
.field private static _nearbyOff:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getNearbyOff(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/NearbyOffKt;->_nearbyOff:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.NearbyOff"

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
    const v0, 0x41ab47ae    # 21.41f

    .line 71
    .line 72
    .line 73
    const v2, 0x4156b852    # 13.42f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const/high16 v0, 0x41800000    # 16.0f

    .line 80
    .line 81
    const v2, 0x4196a3d7    # 18.83f

    .line 82
    .line 83
    .line 84
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 85
    .line 86
    .line 87
    const v0, -0x401851ec    # -1.81f

    .line 88
    .line 89
    .line 90
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 91
    .line 92
    .line 93
    const v0, 0x4199999a    # 19.2f

    .line 94
    .line 95
    .line 96
    const/high16 v2, 0x41400000    # 12.0f

    .line 97
    .line 98
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 99
    .line 100
    .line 101
    const v0, 0x4099999a    # 4.8f

    .line 102
    .line 103
    .line 104
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 105
    .line 106
    .line 107
    const v0, 0x411cf5c3    # 9.81f

    .line 108
    .line 109
    .line 110
    const v2, 0x40dfae14    # 6.99f

    .line 111
    .line 112
    .line 113
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 114
    .line 115
    .line 116
    const v0, 0x40a570a4    # 5.17f

    .line 117
    .line 118
    .line 119
    const/high16 v2, 0x41000000    # 8.0f

    .line 120
    .line 121
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 122
    .line 123
    .line 124
    const v0, -0x3fdae148    # -2.58f

    .line 125
    .line 126
    .line 127
    const v2, 0x40251eb8    # 2.58f

    .line 128
    .line 129
    .line 130
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 131
    .line 132
    .line 133
    const v17, 0x40351eb8    # 2.83f

    .line 134
    .line 135
    .line 136
    const/16 v18, 0x0

    .line 137
    .line 138
    const v13, 0x3f47ae14    # 0.78f

    .line 139
    .line 140
    .line 141
    const v14, -0x40b851ec    # -0.78f

    .line 142
    .line 143
    .line 144
    const v15, 0x40033333    # 2.05f

    .line 145
    .line 146
    .line 147
    const v16, -0x40b851ec    # -0.78f

    .line 148
    .line 149
    .line 150
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 151
    .line 152
    .line 153
    const/high16 v0, 0x41000000    # 8.0f

    .line 154
    .line 155
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 156
    .line 157
    .line 158
    const v17, 0x41ab47ae    # 21.41f

    .line 159
    .line 160
    .line 161
    const v18, 0x4156b852    # 13.42f

    .line 162
    .line 163
    .line 164
    const v13, 0x41b1999a    # 22.2f

    .line 165
    .line 166
    .line 167
    const v14, 0x4135eb85    # 11.37f

    .line 168
    .line 169
    .line 170
    const v15, 0x41b1999a    # 22.2f

    .line 171
    .line 172
    .line 173
    const v16, 0x414a147b    # 12.63f

    .line 174
    .line 175
    .line 176
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 177
    .line 178
    .line 179
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 180
    .line 181
    .line 182
    const v0, 0x41af3333    # 21.9f

    .line 183
    .line 184
    .line 185
    const v2, 0x41a3d70a    # 20.48f

    .line 186
    .line 187
    .line 188
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 189
    .line 190
    .line 191
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 192
    .line 193
    .line 194
    const v17, -0x404b851f    # -1.41f

    .line 195
    .line 196
    .line 197
    const/16 v18, 0x0

    .line 198
    .line 199
    const v13, -0x413851ec    # -0.39f

    .line 200
    .line 201
    .line 202
    const v14, 0x3ec7ae14    # 0.39f

    .line 203
    .line 204
    .line 205
    const v15, -0x407d70a4    # -1.02f

    .line 206
    .line 207
    .line 208
    const v16, 0x3ec7ae14    # 0.39f

    .line 209
    .line 210
    .line 211
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 212
    .line 213
    .line 214
    const/high16 v0, 0x41800000    # 16.0f

    .line 215
    .line 216
    const v2, 0x4196a3d7    # 18.83f

    .line 217
    .line 218
    .line 219
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 220
    .line 221
    .line 222
    const v0, -0x3fdae148    # -2.58f

    .line 223
    .line 224
    .line 225
    const v2, 0x40251eb8    # 2.58f

    .line 226
    .line 227
    .line 228
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 229
    .line 230
    .line 231
    const v17, -0x3fcae148    # -2.83f

    .line 232
    .line 233
    .line 234
    const v13, -0x40b851ec    # -0.78f

    .line 235
    .line 236
    .line 237
    const v14, 0x3f47ae14    # 0.78f

    .line 238
    .line 239
    .line 240
    const v15, -0x3ffccccd    # -2.05f

    .line 241
    .line 242
    .line 243
    const v16, 0x3f47ae14    # 0.78f

    .line 244
    .line 245
    .line 246
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 247
    .line 248
    .line 249
    const/high16 v0, -0x3f000000    # -8.0f

    .line 250
    .line 251
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 252
    .line 253
    .line 254
    const/16 v17, 0x0

    .line 255
    .line 256
    const v18, -0x3fcae148    # -2.83f

    .line 257
    .line 258
    .line 259
    const v14, -0x40b851ec    # -0.78f

    .line 260
    .line 261
    .line 262
    const v15, -0x40b851ec    # -0.78f

    .line 263
    .line 264
    .line 265
    const v16, -0x3ffccccd    # -2.05f

    .line 266
    .line 267
    .line 268
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 269
    .line 270
    .line 271
    const v0, 0x40a570a4    # 5.17f

    .line 272
    .line 273
    .line 274
    const/high16 v2, 0x41000000    # 8.0f

    .line 275
    .line 276
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 277
    .line 278
    .line 279
    const v0, 0x40066666    # 2.1f

    .line 280
    .line 281
    .line 282
    const v2, 0x409dc28f    # 4.93f

    .line 283
    .line 284
    .line 285
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 286
    .line 287
    .line 288
    const v18, -0x404b851f    # -1.41f

    .line 289
    .line 290
    .line 291
    const v13, -0x413851ec    # -0.39f

    .line 292
    .line 293
    .line 294
    const v14, -0x413851ec    # -0.39f

    .line 295
    .line 296
    .line 297
    const v15, -0x413851ec    # -0.39f

    .line 298
    .line 299
    .line 300
    const v16, -0x407d70a4    # -1.02f

    .line 301
    .line 302
    .line 303
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 304
    .line 305
    .line 306
    const/4 v0, 0x0

    .line 307
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 308
    .line 309
    .line 310
    const v17, 0x3fb47ae1    # 1.41f

    .line 311
    .line 312
    .line 313
    const/16 v18, 0x0

    .line 314
    .line 315
    const v13, 0x3ec7ae14    # 0.39f

    .line 316
    .line 317
    .line 318
    const v15, 0x3f828f5c    # 1.02f

    .line 319
    .line 320
    .line 321
    const v16, -0x413851ec    # -0.39f

    .line 322
    .line 323
    .line 324
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 325
    .line 326
    .line 327
    const v0, 0x4187d70a    # 16.98f

    .line 328
    .line 329
    .line 330
    const v2, 0x4187c28f    # 16.97f

    .line 331
    .line 332
    .line 333
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 334
    .line 335
    .line 336
    const v17, 0x41a3d70a    # 20.48f

    .line 337
    .line 338
    .line 339
    const v18, 0x41af3333    # 21.9f

    .line 340
    .line 341
    .line 342
    const v13, 0x41a6f5c3    # 20.87f

    .line 343
    .line 344
    .line 345
    const v14, 0x41a6f5c3    # 20.87f

    .line 346
    .line 347
    .line 348
    const v15, 0x41a6f5c3    # 20.87f

    .line 349
    .line 350
    .line 351
    const v16, 0x41ac147b    # 21.51f

    .line 352
    .line 353
    .line 354
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 355
    .line 356
    .line 357
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 358
    .line 359
    .line 360
    const v0, 0x418828f6    # 17.02f

    .line 361
    .line 362
    .line 363
    const v2, 0x41630a3d    # 14.19f

    .line 364
    .line 365
    .line 366
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 367
    .line 368
    .line 369
    const v0, -0x404e147b    # -1.39f

    .line 370
    .line 371
    .line 372
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 373
    .line 374
    .line 375
    const v0, 0x3db851ec    # 0.09f

    .line 376
    .line 377
    .line 378
    const v2, -0x4247ae14    # -0.09f

    .line 379
    .line 380
    .line 381
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 382
    .line 383
    .line 384
    const v17, -0x404a3d71    # -1.42f

    .line 385
    .line 386
    .line 387
    const/16 v18, 0x0

    .line 388
    .line 389
    const v13, -0x413851ec    # -0.39f

    .line 390
    .line 391
    .line 392
    const v14, 0x3ec7ae14    # 0.39f

    .line 393
    .line 394
    .line 395
    const v15, -0x407d70a4    # -1.02f

    .line 396
    .line 397
    .line 398
    const v16, 0x3ec7ae14    # 0.39f

    .line 399
    .line 400
    .line 401
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 402
    .line 403
    .line 404
    const v0, -0x3fbf5c29    # -3.01f

    .line 405
    .line 406
    .line 407
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 408
    .line 409
    .line 410
    const/16 v17, 0x0

    .line 411
    .line 412
    const v18, -0x404b851f    # -1.41f

    .line 413
    .line 414
    .line 415
    const v14, -0x413851ec    # -0.39f

    .line 416
    .line 417
    .line 418
    const v15, -0x413851ec    # -0.39f

    .line 419
    .line 420
    .line 421
    const v16, -0x407d70a4    # -1.02f

    .line 422
    .line 423
    .line 424
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 425
    .line 426
    .line 427
    const v0, 0x3db851ec    # 0.09f

    .line 428
    .line 429
    .line 430
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 431
    .line 432
    .line 433
    const v0, -0x404ccccd    # -1.4f

    .line 434
    .line 435
    .line 436
    const v2, -0x404e147b    # -1.39f

    .line 437
    .line 438
    .line 439
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 440
    .line 441
    .line 442
    const v0, 0x4099999a    # 4.8f

    .line 443
    .line 444
    .line 445
    const/high16 v2, 0x41400000    # 12.0f

    .line 446
    .line 447
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 448
    .line 449
    .line 450
    const v0, 0x40e66666    # 7.2f

    .line 451
    .line 452
    .line 453
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 454
    .line 455
    .line 456
    const v0, 0x418828f6    # 17.02f

    .line 457
    .line 458
    .line 459
    const v2, 0x41630a3d    # 14.19f

    .line 460
    .line 461
    .line 462
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 463
    .line 464
    .line 465
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 466
    .line 467
    .line 468
    const v0, 0x417b5c29    # 15.71f

    .line 469
    .line 470
    .line 471
    const v2, 0x4134a3d7    # 11.29f

    .line 472
    .line 473
    .line 474
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 475
    .line 476
    .line 477
    const v0, -0x3fbf5c29    # -3.01f

    .line 478
    .line 479
    .line 480
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 481
    .line 482
    .line 483
    const v17, -0x404b851f    # -1.41f

    .line 484
    .line 485
    .line 486
    const/16 v18, 0x0

    .line 487
    .line 488
    const v15, -0x407d70a4    # -1.02f

    .line 489
    .line 490
    .line 491
    const v16, -0x413851ec    # -0.39f

    .line 492
    .line 493
    .line 494
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 495
    .line 496
    .line 497
    const v0, 0x41333333    # 11.2f

    .line 498
    .line 499
    .line 500
    const v2, 0x4106147b    # 8.38f

    .line 501
    .line 502
    .line 503
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 504
    .line 505
    .line 506
    const v0, 0x408d70a4    # 4.42f

    .line 507
    .line 508
    .line 509
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 510
    .line 511
    .line 512
    const v0, 0x3db851ec    # 0.09f

    .line 513
    .line 514
    .line 515
    const v2, -0x4247ae14    # -0.09f

    .line 516
    .line 517
    .line 518
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 519
    .line 520
    .line 521
    const v17, 0x417b5c29    # 15.71f

    .line 522
    .line 523
    .line 524
    const v18, 0x4134a3d7    # 11.29f

    .line 525
    .line 526
    .line 527
    const v13, 0x4180cccd    # 16.1f

    .line 528
    .line 529
    .line 530
    const v14, 0x41451eb8    # 12.32f

    .line 531
    .line 532
    .line 533
    const v15, 0x4180cccd    # 16.1f

    .line 534
    .line 535
    .line 536
    const v16, 0x413ae148    # 11.68f

    .line 537
    .line 538
    .line 539
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 540
    .line 541
    .line 542
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 543
    .line 544
    .line 545
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 546
    .line 547
    .line 548
    move-result-object v2

    .line 549
    const/16 v16, 0x3800

    .line 550
    .line 551
    const/16 v17, 0x0

    .line 552
    .line 553
    const/high16 v6, 0x3f800000    # 1.0f

    .line 554
    .line 555
    const/high16 v8, 0x3f800000    # 1.0f

    .line 556
    .line 557
    const/4 v7, 0x0

    .line 558
    const/high16 v9, 0x3f800000    # 1.0f

    .line 559
    .line 560
    const/high16 v12, 0x3f800000    # 1.0f

    .line 561
    .line 562
    const/4 v13, 0x0

    .line 563
    const/4 v14, 0x0

    .line 564
    const/4 v15, 0x0

    .line 565
    const-string v4, ""

    .line 566
    .line 567
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 568
    .line 569
    .line 570
    move-result-object v0

    .line 571
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 572
    .line 573
    .line 574
    move-result-object v0

    .line 575
    sput-object v0, Landroidx/compose/material/icons/rounded/NearbyOffKt;->_nearbyOff:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 576
    .line 577
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 578
    .line 579
    .line 580
    return-object v0
.end method
