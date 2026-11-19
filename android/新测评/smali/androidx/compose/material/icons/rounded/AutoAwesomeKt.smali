.class public final Landroidx/compose/material/icons/rounded/AutoAwesomeKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_autoAwesome",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "AutoAwesome",
        "Landroidx/compose/material/icons/Icons$Rounded;",
        "getAutoAwesome",
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
        "SMAP\nAutoAwesome.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AutoAwesome.kt\nandroidx/compose/material/icons/rounded/AutoAwesomeKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,79:1\n212#2,12:80\n233#2,18:93\n253#2:130\n174#3:92\n705#4,2:111\n717#4,2:113\n719#4,11:119\n72#5,4:115\n*S KotlinDebug\n*F\n+ 1 AutoAwesome.kt\nandroidx/compose/material/icons/rounded/AutoAwesomeKt\n*L\n29#1:80,12\n30#1:93,18\n30#1:130\n29#1:92\n30#1:111,2\n30#1:113,2\n30#1:119,11\n30#1:115,4\n*E\n"
    }
.end annotation


# static fields
.field private static _autoAwesome:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getAutoAwesome(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/AutoAwesomeKt;->_autoAwesome:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.AutoAwesome"

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
    const/high16 v0, 0x41000000    # 8.0f

    .line 71
    .line 72
    const v2, 0x419bae14    # 19.46f

    .line 73
    .line 74
    .line 75
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    const/high16 v0, -0x40200000    # -1.75f

    .line 79
    .line 80
    const v2, 0x3f4a3d71    # 0.79f

    .line 81
    .line 82
    .line 83
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 84
    .line 85
    .line 86
    const v0, 0x40aeb852    # 5.46f

    .line 87
    .line 88
    .line 89
    const/high16 v2, 0x41b00000    # 22.0f

    .line 90
    .line 91
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 92
    .line 93
    .line 94
    const/16 v17, 0x0

    .line 95
    .line 96
    const v18, -0x40970a3d    # -0.91f

    .line 97
    .line 98
    .line 99
    const v13, 0x3ec7ae14    # 0.39f

    .line 100
    .line 101
    .line 102
    const v14, -0x41c7ae14    # -0.18f

    .line 103
    .line 104
    .line 105
    const v15, 0x3ec7ae14    # 0.39f

    .line 106
    .line 107
    .line 108
    const v16, -0x40c51eb8    # -0.73f

    .line 109
    .line 110
    .line 111
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 112
    .line 113
    .line 114
    const v0, -0x40b5c28f    # -0.79f

    .line 115
    .line 116
    .line 117
    const/high16 v2, -0x40200000    # -1.75f

    .line 118
    .line 119
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 120
    .line 121
    .line 122
    const/high16 v0, 0x40000000    # 2.0f

    .line 123
    .line 124
    const v2, 0x419bae14    # 19.46f

    .line 125
    .line 126
    .line 127
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 128
    .line 129
    .line 130
    const v17, -0x40970a3d    # -0.91f

    .line 131
    .line 132
    .line 133
    const/16 v18, 0x0

    .line 134
    .line 135
    const v13, -0x41c7ae14    # -0.18f

    .line 136
    .line 137
    .line 138
    const v14, -0x413851ec    # -0.39f

    .line 139
    .line 140
    .line 141
    const v15, -0x40c51eb8    # -0.73f

    .line 142
    .line 143
    .line 144
    const v16, -0x413851ec    # -0.39f

    .line 145
    .line 146
    .line 147
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 148
    .line 149
    .line 150
    const/high16 v0, 0x3fe00000    # 1.75f

    .line 151
    .line 152
    const v2, -0x40b5c28f    # -0.79f

    .line 153
    .line 154
    .line 155
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 156
    .line 157
    .line 158
    const v0, 0x409147ae    # 4.54f

    .line 159
    .line 160
    .line 161
    const/high16 v2, 0x41800000    # 16.0f

    .line 162
    .line 163
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 164
    .line 165
    .line 166
    const/16 v17, 0x0

    .line 167
    .line 168
    const v18, 0x3f68f5c3    # 0.91f

    .line 169
    .line 170
    .line 171
    const v13, -0x413851ec    # -0.39f

    .line 172
    .line 173
    .line 174
    const v14, 0x3e3851ec    # 0.18f

    .line 175
    .line 176
    .line 177
    const v15, -0x413851ec    # -0.39f

    .line 178
    .line 179
    .line 180
    const v16, 0x3f3ae148    # 0.73f

    .line 181
    .line 182
    .line 183
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 184
    .line 185
    .line 186
    const/high16 v0, 0x3fe00000    # 1.75f

    .line 187
    .line 188
    const v2, 0x3f4a3d71    # 0.79f

    .line 189
    .line 190
    .line 191
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 192
    .line 193
    .line 194
    const/high16 v0, 0x41000000    # 8.0f

    .line 195
    .line 196
    const v2, 0x419451ec    # 18.54f

    .line 197
    .line 198
    .line 199
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 200
    .line 201
    .line 202
    const v17, 0x419bae14    # 19.46f

    .line 203
    .line 204
    .line 205
    const/high16 v18, 0x41000000    # 8.0f

    .line 206
    .line 207
    const v13, 0x4195c28f    # 18.72f

    .line 208
    .line 209
    .line 210
    const v14, 0x41063d71    # 8.39f

    .line 211
    .line 212
    .line 213
    const v15, 0x419a3d71    # 19.28f

    .line 214
    .line 215
    .line 216
    const v16, 0x41063d71    # 8.39f

    .line 217
    .line 218
    .line 219
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 220
    .line 221
    .line 222
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 223
    .line 224
    .line 225
    const/high16 v0, 0x41380000    # 11.5f

    .line 226
    .line 227
    const/high16 v2, 0x41180000    # 9.5f

    .line 228
    .line 229
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 230
    .line 231
    .line 232
    const v0, 0x411e8f5c    # 9.91f

    .line 233
    .line 234
    .line 235
    const/high16 v2, 0x40c00000    # 6.0f

    .line 236
    .line 237
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 238
    .line 239
    .line 240
    const v17, 0x410170a4    # 8.09f

    .line 241
    .line 242
    .line 243
    const/high16 v18, 0x40c00000    # 6.0f

    .line 244
    .line 245
    const v13, 0x4118f5c3    # 9.56f

    .line 246
    .line 247
    .line 248
    const v14, 0x40a70a3d    # 5.22f

    .line 249
    .line 250
    .line 251
    const v15, 0x41070a3d    # 8.44f

    .line 252
    .line 253
    .line 254
    const v16, 0x40a70a3d    # 5.22f

    .line 255
    .line 256
    .line 257
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 258
    .line 259
    .line 260
    const/high16 v0, 0x40d00000    # 6.5f

    .line 261
    .line 262
    const/high16 v2, 0x41180000    # 9.5f

    .line 263
    .line 264
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 265
    .line 266
    .line 267
    const/high16 v0, 0x40400000    # 3.0f

    .line 268
    .line 269
    const v2, 0x413170a4    # 11.09f

    .line 270
    .line 271
    .line 272
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 273
    .line 274
    .line 275
    const/16 v17, 0x0

    .line 276
    .line 277
    const v18, 0x3fe8f5c3    # 1.82f

    .line 278
    .line 279
    .line 280
    const v13, -0x40b851ec    # -0.78f

    .line 281
    .line 282
    .line 283
    const v14, 0x3eb851ec    # 0.36f

    .line 284
    .line 285
    .line 286
    const v15, -0x40b851ec    # -0.78f

    .line 287
    .line 288
    .line 289
    const v16, 0x3fbc28f6    # 1.47f

    .line 290
    .line 291
    .line 292
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 293
    .line 294
    .line 295
    const v0, 0x3fcb851f    # 1.59f

    .line 296
    .line 297
    .line 298
    const/high16 v2, 0x40600000    # 3.5f

    .line 299
    .line 300
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 301
    .line 302
    .line 303
    const v0, 0x410170a4    # 8.09f

    .line 304
    .line 305
    .line 306
    const/high16 v2, 0x41900000    # 18.0f

    .line 307
    .line 308
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 309
    .line 310
    .line 311
    const v17, 0x3fe8f5c3    # 1.82f

    .line 312
    .line 313
    .line 314
    const/16 v18, 0x0

    .line 315
    .line 316
    const v13, 0x3eb851ec    # 0.36f

    .line 317
    .line 318
    .line 319
    const v14, 0x3f47ae14    # 0.78f

    .line 320
    .line 321
    .line 322
    const v15, 0x3fbc28f6    # 1.47f

    .line 323
    .line 324
    .line 325
    const v16, 0x3f47ae14    # 0.78f

    .line 326
    .line 327
    .line 328
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 329
    .line 330
    .line 331
    const/high16 v0, -0x3fa00000    # -3.5f

    .line 332
    .line 333
    const v2, 0x3fcb851f    # 1.59f

    .line 334
    .line 335
    .line 336
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 337
    .line 338
    .line 339
    const v0, -0x40347ae1    # -1.59f

    .line 340
    .line 341
    .line 342
    const/high16 v2, 0x40600000    # 3.5f

    .line 343
    .line 344
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 345
    .line 346
    .line 347
    const/16 v17, 0x0

    .line 348
    .line 349
    const v18, -0x40170a3d    # -1.82f

    .line 350
    .line 351
    .line 352
    const v13, 0x3f47ae14    # 0.78f

    .line 353
    .line 354
    .line 355
    const v14, -0x4147ae14    # -0.36f

    .line 356
    .line 357
    .line 358
    const v15, 0x3f47ae14    # 0.78f

    .line 359
    .line 360
    .line 361
    const v16, -0x4043d70a    # -1.47f

    .line 362
    .line 363
    .line 364
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 365
    .line 366
    .line 367
    const/high16 v0, 0x41380000    # 11.5f

    .line 368
    .line 369
    const/high16 v2, 0x41180000    # 9.5f

    .line 370
    .line 371
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 372
    .line 373
    .line 374
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 375
    .line 376
    .line 377
    const v0, 0x419451ec    # 18.54f

    .line 378
    .line 379
    .line 380
    const/high16 v2, 0x41800000    # 16.0f

    .line 381
    .line 382
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 383
    .line 384
    .line 385
    const/high16 v0, 0x3fe00000    # 1.75f

    .line 386
    .line 387
    const v2, -0x40b5c28f    # -0.79f

    .line 388
    .line 389
    .line 390
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 391
    .line 392
    .line 393
    const v0, 0x419451ec    # 18.54f

    .line 394
    .line 395
    .line 396
    const/high16 v2, 0x41800000    # 16.0f

    .line 397
    .line 398
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 399
    .line 400
    .line 401
    const v18, 0x3f68f5c3    # 0.91f

    .line 402
    .line 403
    .line 404
    const v13, -0x413851ec    # -0.39f

    .line 405
    .line 406
    .line 407
    const v14, 0x3e3851ec    # 0.18f

    .line 408
    .line 409
    .line 410
    const v15, -0x413851ec    # -0.39f

    .line 411
    .line 412
    .line 413
    const v16, 0x3f3ae148    # 0.73f

    .line 414
    .line 415
    .line 416
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 417
    .line 418
    .line 419
    const/high16 v0, 0x3fe00000    # 1.75f

    .line 420
    .line 421
    const v2, 0x3f4a3d71    # 0.79f

    .line 422
    .line 423
    .line 424
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 425
    .line 426
    .line 427
    const/high16 v0, 0x41b00000    # 22.0f

    .line 428
    .line 429
    const v2, 0x419451ec    # 18.54f

    .line 430
    .line 431
    .line 432
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 433
    .line 434
    .line 435
    const v17, 0x3f68f5c3    # 0.91f

    .line 436
    .line 437
    .line 438
    const/16 v18, 0x0

    .line 439
    .line 440
    const v13, 0x3e3851ec    # 0.18f

    .line 441
    .line 442
    .line 443
    const v14, 0x3ec7ae14    # 0.39f

    .line 444
    .line 445
    .line 446
    const v15, 0x3f3ae148    # 0.73f

    .line 447
    .line 448
    .line 449
    const v16, 0x3ec7ae14    # 0.39f

    .line 450
    .line 451
    .line 452
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 453
    .line 454
    .line 455
    const/high16 v0, -0x40200000    # -1.75f

    .line 456
    .line 457
    const v2, 0x3f4a3d71    # 0.79f

    .line 458
    .line 459
    .line 460
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 461
    .line 462
    .line 463
    const/high16 v0, 0x41b00000    # 22.0f

    .line 464
    .line 465
    const v2, 0x419bae14    # 19.46f

    .line 466
    .line 467
    .line 468
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 469
    .line 470
    .line 471
    const/16 v17, 0x0

    .line 472
    .line 473
    const v18, -0x40970a3d    # -0.91f

    .line 474
    .line 475
    .line 476
    const v13, 0x3ec7ae14    # 0.39f

    .line 477
    .line 478
    .line 479
    const v14, -0x41c7ae14    # -0.18f

    .line 480
    .line 481
    .line 482
    const v15, 0x3ec7ae14    # 0.39f

    .line 483
    .line 484
    .line 485
    const v16, -0x40c51eb8    # -0.73f

    .line 486
    .line 487
    .line 488
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 489
    .line 490
    .line 491
    const v0, -0x40b5c28f    # -0.79f

    .line 492
    .line 493
    .line 494
    const/high16 v2, -0x40200000    # -1.75f

    .line 495
    .line 496
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 497
    .line 498
    .line 499
    const/high16 v0, 0x41800000    # 16.0f

    .line 500
    .line 501
    const v2, 0x419bae14    # 19.46f

    .line 502
    .line 503
    .line 504
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 505
    .line 506
    .line 507
    const v17, 0x419451ec    # 18.54f

    .line 508
    .line 509
    .line 510
    const/high16 v18, 0x41800000    # 16.0f

    .line 511
    .line 512
    const v13, 0x419a3d71    # 19.28f

    .line 513
    .line 514
    .line 515
    const v14, 0x4179c28f    # 15.61f

    .line 516
    .line 517
    .line 518
    const v15, 0x4195c28f    # 18.72f

    .line 519
    .line 520
    .line 521
    const v16, 0x4179c28f    # 15.61f

    .line 522
    .line 523
    .line 524
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 525
    .line 526
    .line 527
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 528
    .line 529
    .line 530
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 531
    .line 532
    .line 533
    move-result-object v2

    .line 534
    const/16 v16, 0x3800

    .line 535
    .line 536
    const/16 v17, 0x0

    .line 537
    .line 538
    const/high16 v6, 0x3f800000    # 1.0f

    .line 539
    .line 540
    const/high16 v8, 0x3f800000    # 1.0f

    .line 541
    .line 542
    const/4 v7, 0x0

    .line 543
    const/high16 v9, 0x3f800000    # 1.0f

    .line 544
    .line 545
    const/high16 v12, 0x3f800000    # 1.0f

    .line 546
    .line 547
    const/4 v13, 0x0

    .line 548
    const/4 v14, 0x0

    .line 549
    const/4 v15, 0x0

    .line 550
    const-string v4, ""

    .line 551
    .line 552
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 553
    .line 554
    .line 555
    move-result-object v0

    .line 556
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 557
    .line 558
    .line 559
    move-result-object v0

    .line 560
    sput-object v0, Landroidx/compose/material/icons/rounded/AutoAwesomeKt;->_autoAwesome:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 561
    .line 562
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 563
    .line 564
    .line 565
    return-object v0
.end method
