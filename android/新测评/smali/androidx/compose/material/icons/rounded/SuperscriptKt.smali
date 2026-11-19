.class public final Landroidx/compose/material/icons/rounded/SuperscriptKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_superscript",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "Superscript",
        "Landroidx/compose/material/icons/Icons$Rounded;",
        "getSuperscript",
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
        "SMAP\nSuperscript.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Superscript.kt\nandroidx/compose/material/icons/rounded/SuperscriptKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,84:1\n212#2,12:85\n233#2,18:98\n253#2:135\n174#3:97\n705#4,2:116\n717#4,2:118\n719#4,11:124\n72#5,4:120\n*S KotlinDebug\n*F\n+ 1 Superscript.kt\nandroidx/compose/material/icons/rounded/SuperscriptKt\n*L\n29#1:85,12\n30#1:98,18\n30#1:135\n29#1:97\n30#1:116,2\n30#1:118,2\n30#1:124,11\n30#1:120,4\n*E\n"
    }
.end annotation


# static fields
.field private static _superscript:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getSuperscript(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/SuperscriptKt;->_superscript:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.Superscript"

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
    const v0, 0x414bae14    # 12.73f

    .line 71
    .line 72
    .line 73
    const v2, 0x412828f6    # 10.51f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v0, 0x40e9999a    # 7.3f

    .line 80
    .line 81
    .line 82
    const v2, 0x40f70a3d    # 7.72f

    .line 83
    .line 84
    .line 85
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 86
    .line 87
    .line 88
    const v17, 0x4103ae14    # 8.23f

    .line 89
    .line 90
    .line 91
    const/high16 v18, 0x40c00000    # 6.0f

    .line 92
    .line 93
    const v13, 0x40da3d71    # 6.82f

    .line 94
    .line 95
    .line 96
    const v14, 0x40df0a3d    # 6.97f

    .line 97
    .line 98
    .line 99
    const v15, 0x40eb3333    # 7.35f

    .line 100
    .line 101
    .line 102
    const/high16 v16, 0x40c00000    # 6.0f

    .line 103
    .line 104
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 105
    .line 106
    .line 107
    const/4 v0, 0x0

    .line 108
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 109
    .line 110
    .line 111
    const v17, 0x3f733333    # 0.95f

    .line 112
    .line 113
    .line 114
    const v18, 0x3f07ae14    # 0.53f

    .line 115
    .line 116
    .line 117
    const v13, 0x3ec7ae14    # 0.39f

    .line 118
    .line 119
    .line 120
    const/4 v14, 0x0

    .line 121
    const v15, 0x3f3d70a4    # 0.74f

    .line 122
    .line 123
    .line 124
    const v16, 0x3e4ccccd    # 0.2f

    .line 125
    .line 126
    .line 127
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 128
    .line 129
    .line 130
    const v0, 0x4030a3d7    # 2.76f

    .line 131
    .line 132
    .line 133
    const v2, 0x408eb852    # 4.46f

    .line 134
    .line 135
    .line 136
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 137
    .line 138
    .line 139
    const v0, 0x3df5c28f    # 0.12f

    .line 140
    .line 141
    .line 142
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 143
    .line 144
    .line 145
    const v0, 0x402f5c29    # 2.74f

    .line 146
    .line 147
    .line 148
    const v2, -0x3f71999a    # -4.45f

    .line 149
    .line 150
    .line 151
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 152
    .line 153
    .line 154
    const/high16 v17, 0x417c0000    # 15.75f

    .line 155
    .line 156
    const/high16 v18, 0x40c00000    # 6.0f

    .line 157
    .line 158
    const/high16 v13, 0x41700000    # 15.0f

    .line 159
    .line 160
    const v14, 0x40c66666    # 6.2f

    .line 161
    .line 162
    .line 163
    const v15, 0x4175c28f    # 15.36f

    .line 164
    .line 165
    .line 166
    const/high16 v16, 0x40c00000    # 6.0f

    .line 167
    .line 168
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 169
    .line 170
    .line 171
    const/4 v0, 0x0

    .line 172
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 173
    .line 174
    .line 175
    const v17, 0x3f70a3d7    # 0.94f

    .line 176
    .line 177
    .line 178
    const v18, 0x3fdc28f6    # 1.72f

    .line 179
    .line 180
    .line 181
    const v13, 0x3f6147ae    # 0.88f

    .line 182
    .line 183
    .line 184
    const/4 v14, 0x0

    .line 185
    const v15, 0x3fb5c28f    # 1.42f

    .line 186
    .line 187
    .line 188
    const v16, 0x3f7ae148    # 0.98f

    .line 189
    .line 190
    .line 191
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 192
    .line 193
    .line 194
    const v0, -0x3fb147ae    # -3.23f

    .line 195
    .line 196
    .line 197
    const/high16 v2, 0x40a00000    # 5.0f

    .line 198
    .line 199
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 200
    .line 201
    .line 202
    const v0, 0x40633333    # 3.55f

    .line 203
    .line 204
    .line 205
    const v2, 0x40b1999a    # 5.55f

    .line 206
    .line 207
    .line 208
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 209
    .line 210
    .line 211
    const v17, 0x4180a3d7    # 16.08f

    .line 212
    .line 213
    .line 214
    const/high16 v18, 0x41a00000    # 20.0f

    .line 215
    .line 216
    const/high16 v13, 0x418c0000    # 17.5f

    .line 217
    .line 218
    const v14, 0x419828f6    # 19.02f

    .line 219
    .line 220
    .line 221
    const v15, 0x4187ae14    # 16.96f

    .line 222
    .line 223
    .line 224
    const/high16 v16, 0x41a00000    # 20.0f

    .line 225
    .line 226
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 227
    .line 228
    .line 229
    const/4 v0, 0x0

    .line 230
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 231
    .line 232
    .line 233
    const v17, -0x408ccccd    # -0.95f

    .line 234
    .line 235
    .line 236
    const v18, -0x40fae148    # -0.52f

    .line 237
    .line 238
    .line 239
    const v13, -0x413d70a4    # -0.38f

    .line 240
    .line 241
    .line 242
    const/4 v14, 0x0

    .line 243
    const v15, -0x40c28f5c    # -0.74f

    .line 244
    .line 245
    .line 246
    const v16, -0x41b33333    # -0.2f

    .line 247
    .line 248
    .line 249
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 250
    .line 251
    .line 252
    const v0, -0x3f63851f    # -4.89f

    .line 253
    .line 254
    .line 255
    const v2, -0x3fbb851f    # -3.07f

    .line 256
    .line 257
    .line 258
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 259
    .line 260
    .line 261
    const v0, -0x420a3d71    # -0.12f

    .line 262
    .line 263
    .line 264
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 265
    .line 266
    .line 267
    const v0, 0x409c7ae1    # 4.89f

    .line 268
    .line 269
    .line 270
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 271
    .line 272
    .line 273
    const v17, 0x40fd70a4    # 7.92f

    .line 274
    .line 275
    .line 276
    const/high16 v18, 0x41a00000    # 20.0f

    .line 277
    .line 278
    const v13, 0x410a8f5c    # 8.66f

    .line 279
    .line 280
    .line 281
    const v14, 0x419e6666    # 19.8f

    .line 282
    .line 283
    .line 284
    const v15, 0x4104f5c3    # 8.31f

    .line 285
    .line 286
    .line 287
    const/high16 v16, 0x41a00000    # 20.0f

    .line 288
    .line 289
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 290
    .line 291
    .line 292
    const/4 v0, 0x0

    .line 293
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 294
    .line 295
    .line 296
    const v17, -0x408f5c29    # -0.94f

    .line 297
    .line 298
    .line 299
    const v18, -0x4023d70a    # -1.72f

    .line 300
    .line 301
    .line 302
    const v13, -0x409eb852    # -0.88f

    .line 303
    .line 304
    .line 305
    const/4 v14, 0x0

    .line 306
    const v15, -0x404a3d71    # -1.42f

    .line 307
    .line 308
    .line 309
    const v16, -0x4087ae14    # -0.97f

    .line 310
    .line 311
    .line 312
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 313
    .line 314
    .line 315
    const v0, 0x414bae14    # 12.73f

    .line 316
    .line 317
    .line 318
    const v2, 0x412828f6    # 10.51f

    .line 319
    .line 320
    .line 321
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 322
    .line 323
    .line 324
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 325
    .line 326
    .line 327
    const/high16 v0, 0x41080000    # 8.5f

    .line 328
    .line 329
    const/high16 v2, 0x41b80000    # 23.0f

    .line 330
    .line 331
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 332
    .line 333
    .line 334
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 335
    .line 336
    .line 337
    const/high16 v17, 0x41b40000    # 22.5f

    .line 338
    .line 339
    const/high16 v18, 0x41000000    # 8.0f

    .line 340
    .line 341
    const/high16 v13, 0x41b80000    # 23.0f

    .line 342
    .line 343
    const v14, 0x4103851f    # 8.22f

    .line 344
    .line 345
    .line 346
    const v15, 0x41b63d71    # 22.78f

    .line 347
    .line 348
    .line 349
    const/high16 v16, 0x41000000    # 8.0f

    .line 350
    .line 351
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 352
    .line 353
    .line 354
    const/16 v17, 0x0

    .line 355
    .line 356
    const/16 v18, 0x0

    .line 357
    .line 358
    const/4 v13, 0x0

    .line 359
    const/4 v14, 0x0

    .line 360
    const/4 v15, 0x0

    .line 361
    const/16 v16, 0x0

    .line 362
    .line 363
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 364
    .line 365
    .line 366
    const/high16 v0, 0x41a00000    # 20.0f

    .line 367
    .line 368
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 369
    .line 370
    .line 371
    const/high16 v0, 0x40e00000    # 7.0f

    .line 372
    .line 373
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 374
    .line 375
    .line 376
    const/high16 v0, 0x40000000    # 2.0f

    .line 377
    .line 378
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 379
    .line 380
    .line 381
    const/high16 v17, 0x3f800000    # 1.0f

    .line 382
    .line 383
    const/high16 v18, -0x40800000    # -1.0f

    .line 384
    .line 385
    const v13, 0x3f0ccccd    # 0.55f

    .line 386
    .line 387
    .line 388
    const/high16 v15, 0x3f800000    # 1.0f

    .line 389
    .line 390
    const v16, -0x4119999a    # -0.45f

    .line 391
    .line 392
    .line 393
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 394
    .line 395
    .line 396
    const/high16 v0, 0x40a00000    # 5.0f

    .line 397
    .line 398
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 399
    .line 400
    .line 401
    const/high16 v17, -0x40800000    # -1.0f

    .line 402
    .line 403
    const/4 v13, 0x0

    .line 404
    const v14, -0x40f33333    # -0.55f

    .line 405
    .line 406
    .line 407
    const v15, -0x4119999a    # -0.45f

    .line 408
    .line 409
    .line 410
    const/high16 v16, -0x40800000    # -1.0f

    .line 411
    .line 412
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 413
    .line 414
    .line 415
    const/high16 v0, -0x3fe00000    # -2.5f

    .line 416
    .line 417
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 418
    .line 419
    .line 420
    const/high16 v17, 0x41980000    # 19.0f

    .line 421
    .line 422
    const/high16 v18, 0x40900000    # 4.5f

    .line 423
    .line 424
    const v13, 0x4199c28f    # 19.22f

    .line 425
    .line 426
    .line 427
    const/high16 v14, 0x40800000    # 4.0f

    .line 428
    .line 429
    const/high16 v15, 0x41980000    # 19.0f

    .line 430
    .line 431
    const v16, 0x40870a3d    # 4.22f

    .line 432
    .line 433
    .line 434
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 435
    .line 436
    .line 437
    const/4 v0, 0x0

    .line 438
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 439
    .line 440
    .line 441
    const/high16 v17, 0x419c0000    # 19.5f

    .line 442
    .line 443
    const/high16 v18, 0x40a00000    # 5.0f

    .line 444
    .line 445
    const/high16 v13, 0x41980000    # 19.0f

    .line 446
    .line 447
    const v14, 0x4098f5c3    # 4.78f

    .line 448
    .line 449
    .line 450
    const v15, 0x4199c28f    # 19.22f

    .line 451
    .line 452
    .line 453
    const/high16 v16, 0x40a00000    # 5.0f

    .line 454
    .line 455
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 456
    .line 457
    .line 458
    const/high16 v0, 0x41b00000    # 22.0f

    .line 459
    .line 460
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 461
    .line 462
    .line 463
    const/high16 v0, 0x3f800000    # 1.0f

    .line 464
    .line 465
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 466
    .line 467
    .line 468
    const/high16 v0, -0x40000000    # -2.0f

    .line 469
    .line 470
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 471
    .line 472
    .line 473
    const/high16 v17, -0x40800000    # -1.0f

    .line 474
    .line 475
    const/high16 v18, 0x3f800000    # 1.0f

    .line 476
    .line 477
    const v13, -0x40f33333    # -0.55f

    .line 478
    .line 479
    .line 480
    const/4 v14, 0x0

    .line 481
    const/high16 v15, -0x40800000    # -1.0f

    .line 482
    .line 483
    const v16, 0x3ee66666    # 0.45f

    .line 484
    .line 485
    .line 486
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 487
    .line 488
    .line 489
    const/high16 v0, 0x3f800000    # 1.0f

    .line 490
    .line 491
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 492
    .line 493
    .line 494
    const/high16 v17, 0x3f800000    # 1.0f

    .line 495
    .line 496
    const/4 v13, 0x0

    .line 497
    const v14, 0x3f0ccccd    # 0.55f

    .line 498
    .line 499
    .line 500
    const v15, 0x3ee66666    # 0.45f

    .line 501
    .line 502
    .line 503
    const/high16 v16, 0x3f800000    # 1.0f

    .line 504
    .line 505
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 506
    .line 507
    .line 508
    const/high16 v0, 0x40200000    # 2.5f

    .line 509
    .line 510
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 511
    .line 512
    .line 513
    const/high16 v17, 0x41b80000    # 23.0f

    .line 514
    .line 515
    const/high16 v18, 0x41080000    # 8.5f

    .line 516
    .line 517
    const v13, 0x41b63d71    # 22.78f

    .line 518
    .line 519
    .line 520
    const/high16 v14, 0x41100000    # 9.0f

    .line 521
    .line 522
    const/high16 v15, 0x41b80000    # 23.0f

    .line 523
    .line 524
    const v16, 0x410c7ae1    # 8.78f

    .line 525
    .line 526
    .line 527
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 528
    .line 529
    .line 530
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 531
    .line 532
    .line 533
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 534
    .line 535
    .line 536
    move-result-object v2

    .line 537
    const/16 v16, 0x3800

    .line 538
    .line 539
    const/16 v17, 0x0

    .line 540
    .line 541
    const/high16 v6, 0x3f800000    # 1.0f

    .line 542
    .line 543
    const/high16 v8, 0x3f800000    # 1.0f

    .line 544
    .line 545
    const/4 v7, 0x0

    .line 546
    const/high16 v9, 0x3f800000    # 1.0f

    .line 547
    .line 548
    const/high16 v12, 0x3f800000    # 1.0f

    .line 549
    .line 550
    const/4 v13, 0x0

    .line 551
    const/4 v14, 0x0

    .line 552
    const/4 v15, 0x0

    .line 553
    const-string v4, ""

    .line 554
    .line 555
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 556
    .line 557
    .line 558
    move-result-object v0

    .line 559
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 560
    .line 561
    .line 562
    move-result-object v0

    .line 563
    sput-object v0, Landroidx/compose/material/icons/rounded/SuperscriptKt;->_superscript:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 564
    .line 565
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 566
    .line 567
    .line 568
    return-object v0
.end method
