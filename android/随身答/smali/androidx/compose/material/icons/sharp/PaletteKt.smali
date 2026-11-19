.class public final Landroidx/compose/material/icons/sharp/PaletteKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_palette",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "Palette",
        "Landroidx/compose/material/icons/Icons$Sharp;",
        "getPalette",
        "(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;",
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
        "SMAP\nPalette.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Palette.kt\nandroidx/compose/material/icons/sharp/PaletteKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,72:1\n212#2,12:73\n233#2,18:86\n253#2:123\n174#3:85\n705#4,2:104\n717#4,2:106\n719#4,11:112\n72#5,4:108\n*S KotlinDebug\n*F\n+ 1 Palette.kt\nandroidx/compose/material/icons/sharp/PaletteKt\n*L\n29#1:73,12\n30#1:86,18\n30#1:123\n29#1:85\n30#1:104,2\n30#1:106,2\n30#1:112,11\n30#1:108,4\n*E\n"
    }
.end annotation


# static fields
.field private static _palette:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getPalette(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/sharp/PaletteKt;->_palette:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Sharp.Palette"

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
    const/high16 v0, 0x41400000    # 12.0f

    .line 71
    .line 72
    const/high16 v2, 0x40000000    # 2.0f

    .line 73
    .line 74
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v17, 0x40000000    # 2.0f

    .line 78
    .line 79
    const/high16 v18, 0x41400000    # 12.0f

    .line 80
    .line 81
    const v13, 0x40cfae14    # 6.49f

    .line 82
    .line 83
    .line 84
    const/high16 v14, 0x40000000    # 2.0f

    .line 85
    .line 86
    const/high16 v15, 0x40000000    # 2.0f

    .line 87
    .line 88
    const v16, 0x40cfae14    # 6.49f

    .line 89
    .line 90
    .line 91
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 92
    .line 93
    .line 94
    const v0, 0x408fae14    # 4.49f

    .line 95
    .line 96
    .line 97
    const/high16 v2, 0x41200000    # 10.0f

    .line 98
    .line 99
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 100
    .line 101
    .line 102
    const/high16 v17, 0x40200000    # 2.5f

    .line 103
    .line 104
    const/high16 v18, -0x3fe00000    # -2.5f

    .line 105
    .line 106
    const v13, 0x3fb0a3d7    # 1.38f

    .line 107
    .line 108
    .line 109
    const/4 v14, 0x0

    .line 110
    const/high16 v15, 0x40200000    # 2.5f

    .line 111
    .line 112
    const v16, -0x4070a3d7    # -1.12f

    .line 113
    .line 114
    .line 115
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 116
    .line 117
    .line 118
    const v17, -0x40dc28f6    # -0.64f

    .line 119
    .line 120
    .line 121
    const v18, -0x402a3d71    # -1.67f

    .line 122
    .line 123
    .line 124
    const/4 v13, 0x0

    .line 125
    const v14, -0x40e3d70a    # -0.61f

    .line 126
    .line 127
    .line 128
    const v15, -0x41947ae1    # -0.23f

    .line 129
    .line 130
    .line 131
    const v16, -0x40666666    # -1.2f

    .line 132
    .line 133
    .line 134
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 135
    .line 136
    .line 137
    const v17, -0x41fae148    # -0.13f

    .line 138
    .line 139
    .line 140
    const v18, -0x41570a3d    # -0.33f

    .line 141
    .line 142
    .line 143
    const v13, -0x425c28f6    # -0.08f

    .line 144
    .line 145
    .line 146
    const v14, -0x42333333    # -0.1f

    .line 147
    .line 148
    .line 149
    const v15, -0x41fae148    # -0.13f

    .line 150
    .line 151
    .line 152
    const v16, -0x41a8f5c3    # -0.21f

    .line 153
    .line 154
    .line 155
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 156
    .line 157
    .line 158
    const/high16 v17, 0x3f000000    # 0.5f

    .line 159
    .line 160
    const/high16 v18, -0x41000000    # -0.5f

    .line 161
    .line 162
    const/4 v13, 0x0

    .line 163
    const v14, -0x4170a3d7    # -0.28f

    .line 164
    .line 165
    .line 166
    const v15, 0x3e6147ae    # 0.22f

    .line 167
    .line 168
    .line 169
    const/high16 v16, -0x41000000    # -0.5f

    .line 170
    .line 171
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 172
    .line 173
    .line 174
    const/high16 v0, 0x41800000    # 16.0f

    .line 175
    .line 176
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 177
    .line 178
    .line 179
    const/high16 v17, 0x40c00000    # 6.0f

    .line 180
    .line 181
    const/high16 v18, -0x3f400000    # -6.0f

    .line 182
    .line 183
    const v13, 0x4053d70a    # 3.31f

    .line 184
    .line 185
    .line 186
    const/4 v14, 0x0

    .line 187
    const/high16 v15, 0x40c00000    # 6.0f

    .line 188
    .line 189
    const v16, -0x3fd3d70a    # -2.69f

    .line 190
    .line 191
    .line 192
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 193
    .line 194
    .line 195
    const/high16 v17, 0x41400000    # 12.0f

    .line 196
    .line 197
    const/high16 v18, 0x40000000    # 2.0f

    .line 198
    .line 199
    const/high16 v13, 0x41b00000    # 22.0f

    .line 200
    .line 201
    const v14, 0x40c147ae    # 6.04f

    .line 202
    .line 203
    .line 204
    const v15, 0x418c147b    # 17.51f

    .line 205
    .line 206
    .line 207
    const/high16 v16, 0x40000000    # 2.0f

    .line 208
    .line 209
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 210
    .line 211
    .line 212
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 213
    .line 214
    .line 215
    const/high16 v0, 0x418c0000    # 17.5f

    .line 216
    .line 217
    const/high16 v2, 0x41500000    # 13.0f

    .line 218
    .line 219
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 220
    .line 221
    .line 222
    const/high16 v17, -0x40400000    # -1.5f

    .line 223
    .line 224
    const/high16 v18, -0x40400000    # -1.5f

    .line 225
    .line 226
    const v13, -0x40ab851f    # -0.83f

    .line 227
    .line 228
    .line 229
    const/4 v14, 0x0

    .line 230
    const/high16 v15, -0x40400000    # -1.5f

    .line 231
    .line 232
    const v16, -0x40d47ae1    # -0.67f

    .line 233
    .line 234
    .line 235
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 236
    .line 237
    .line 238
    const/high16 v17, 0x3fc00000    # 1.5f

    .line 239
    .line 240
    const/4 v13, 0x0

    .line 241
    const v14, -0x40ab851f    # -0.83f

    .line 242
    .line 243
    .line 244
    const v15, 0x3f2b851f    # 0.67f

    .line 245
    .line 246
    .line 247
    const/high16 v16, -0x40400000    # -1.5f

    .line 248
    .line 249
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 250
    .line 251
    .line 252
    const v0, 0x3f2b851f    # 0.67f

    .line 253
    .line 254
    .line 255
    const/high16 v2, 0x3fc00000    # 1.5f

    .line 256
    .line 257
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 258
    .line 259
    .line 260
    const/high16 v17, 0x418c0000    # 17.5f

    .line 261
    .line 262
    const/high16 v18, 0x41500000    # 13.0f

    .line 263
    .line 264
    const/high16 v13, 0x41980000    # 19.0f

    .line 265
    .line 266
    const v14, 0x414547ae    # 12.33f

    .line 267
    .line 268
    .line 269
    const v15, 0x4192a3d7    # 18.33f

    .line 270
    .line 271
    .line 272
    const/high16 v16, 0x41500000    # 13.0f

    .line 273
    .line 274
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 275
    .line 276
    .line 277
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 278
    .line 279
    .line 280
    const/high16 v0, 0x41680000    # 14.5f

    .line 281
    .line 282
    const/high16 v2, 0x41100000    # 9.0f

    .line 283
    .line 284
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 285
    .line 286
    .line 287
    const/high16 v17, 0x41500000    # 13.0f

    .line 288
    .line 289
    const/high16 v18, 0x40f00000    # 7.5f

    .line 290
    .line 291
    const v13, 0x415ab852    # 13.67f

    .line 292
    .line 293
    .line 294
    const/high16 v14, 0x41100000    # 9.0f

    .line 295
    .line 296
    const/high16 v15, 0x41500000    # 13.0f

    .line 297
    .line 298
    const v16, 0x410547ae    # 8.33f

    .line 299
    .line 300
    .line 301
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 302
    .line 303
    .line 304
    const/high16 v17, 0x41680000    # 14.5f

    .line 305
    .line 306
    const/high16 v18, 0x40c00000    # 6.0f

    .line 307
    .line 308
    const/high16 v13, 0x41500000    # 13.0f

    .line 309
    .line 310
    const v14, 0x40d570a4    # 6.67f

    .line 311
    .line 312
    .line 313
    const v15, 0x415ab852    # 13.67f

    .line 314
    .line 315
    .line 316
    const/high16 v16, 0x40c00000    # 6.0f

    .line 317
    .line 318
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 319
    .line 320
    .line 321
    const v0, 0x40d570a4    # 6.67f

    .line 322
    .line 323
    .line 324
    const/high16 v2, 0x41800000    # 16.0f

    .line 325
    .line 326
    const/high16 v4, 0x40f00000    # 7.5f

    .line 327
    .line 328
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 329
    .line 330
    .line 331
    const/high16 v18, 0x41100000    # 9.0f

    .line 332
    .line 333
    const/high16 v13, 0x41800000    # 16.0f

    .line 334
    .line 335
    const v14, 0x410547ae    # 8.33f

    .line 336
    .line 337
    .line 338
    const v15, 0x417547ae    # 15.33f

    .line 339
    .line 340
    .line 341
    const/high16 v16, 0x41100000    # 9.0f

    .line 342
    .line 343
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 344
    .line 345
    .line 346
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 347
    .line 348
    .line 349
    const/high16 v0, 0x41380000    # 11.5f

    .line 350
    .line 351
    const/high16 v2, 0x40a00000    # 5.0f

    .line 352
    .line 353
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 354
    .line 355
    .line 356
    const/high16 v17, 0x40d00000    # 6.5f

    .line 357
    .line 358
    const/high16 v18, 0x41200000    # 10.0f

    .line 359
    .line 360
    const/high16 v13, 0x40a00000    # 5.0f

    .line 361
    .line 362
    const v14, 0x412ab852    # 10.67f

    .line 363
    .line 364
    .line 365
    const v15, 0x40b570a4    # 5.67f

    .line 366
    .line 367
    .line 368
    const/high16 v16, 0x41200000    # 10.0f

    .line 369
    .line 370
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 371
    .line 372
    .line 373
    const v0, 0x412ab852    # 10.67f

    .line 374
    .line 375
    .line 376
    const/high16 v2, 0x41380000    # 11.5f

    .line 377
    .line 378
    const/high16 v4, 0x41000000    # 8.0f

    .line 379
    .line 380
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 381
    .line 382
    .line 383
    const/high16 v18, 0x41500000    # 13.0f

    .line 384
    .line 385
    const/high16 v13, 0x41000000    # 8.0f

    .line 386
    .line 387
    const v14, 0x414547ae    # 12.33f

    .line 388
    .line 389
    .line 390
    const v15, 0x40ea8f5c    # 7.33f

    .line 391
    .line 392
    .line 393
    const/high16 v16, 0x41500000    # 13.0f

    .line 394
    .line 395
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 396
    .line 397
    .line 398
    const v0, 0x414547ae    # 12.33f

    .line 399
    .line 400
    .line 401
    const/high16 v4, 0x40a00000    # 5.0f

    .line 402
    .line 403
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 404
    .line 405
    .line 406
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 407
    .line 408
    .line 409
    const/high16 v0, 0x41300000    # 11.0f

    .line 410
    .line 411
    const/high16 v2, 0x40f00000    # 7.5f

    .line 412
    .line 413
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 414
    .line 415
    .line 416
    const/high16 v17, 0x41180000    # 9.5f

    .line 417
    .line 418
    const/high16 v18, 0x41100000    # 9.0f

    .line 419
    .line 420
    const/high16 v13, 0x41300000    # 11.0f

    .line 421
    .line 422
    const v14, 0x410547ae    # 8.33f

    .line 423
    .line 424
    .line 425
    const v15, 0x412547ae    # 10.33f

    .line 426
    .line 427
    .line 428
    const/high16 v16, 0x41100000    # 9.0f

    .line 429
    .line 430
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 431
    .line 432
    .line 433
    const v0, 0x410547ae    # 8.33f

    .line 434
    .line 435
    .line 436
    const/high16 v2, 0x41000000    # 8.0f

    .line 437
    .line 438
    const/high16 v4, 0x40f00000    # 7.5f

    .line 439
    .line 440
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 441
    .line 442
    .line 443
    const/high16 v18, 0x40c00000    # 6.0f

    .line 444
    .line 445
    const/high16 v13, 0x41000000    # 8.0f

    .line 446
    .line 447
    const v14, 0x40d570a4    # 6.67f

    .line 448
    .line 449
    .line 450
    const v15, 0x410ab852    # 8.67f

    .line 451
    .line 452
    .line 453
    const/high16 v16, 0x40c00000    # 6.0f

    .line 454
    .line 455
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 456
    .line 457
    .line 458
    const v0, 0x40d570a4    # 6.67f

    .line 459
    .line 460
    .line 461
    const/high16 v2, 0x41300000    # 11.0f

    .line 462
    .line 463
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 464
    .line 465
    .line 466
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 467
    .line 468
    .line 469
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 470
    .line 471
    .line 472
    move-result-object v2

    .line 473
    const/16 v16, 0x3800

    .line 474
    .line 475
    const/16 v17, 0x0

    .line 476
    .line 477
    const/high16 v6, 0x3f800000    # 1.0f

    .line 478
    .line 479
    const/high16 v8, 0x3f800000    # 1.0f

    .line 480
    .line 481
    const/4 v7, 0x0

    .line 482
    const/high16 v9, 0x3f800000    # 1.0f

    .line 483
    .line 484
    const/high16 v12, 0x3f800000    # 1.0f

    .line 485
    .line 486
    const/4 v13, 0x0

    .line 487
    const/4 v14, 0x0

    .line 488
    const/4 v15, 0x0

    .line 489
    const-string v4, ""

    .line 490
    .line 491
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 492
    .line 493
    .line 494
    move-result-object v0

    .line 495
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 496
    .line 497
    .line 498
    move-result-object v0

    .line 499
    sput-object v0, Landroidx/compose/material/icons/sharp/PaletteKt;->_palette:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 500
    .line 501
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 502
    .line 503
    .line 504
    return-object v0
.end method
