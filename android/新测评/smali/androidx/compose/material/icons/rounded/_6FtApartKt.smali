.class public final Landroidx/compose/material/icons/rounded/_6FtApartKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "__6FtApart",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "_6FtApart",
        "Landroidx/compose/material/icons/Icons$Rounded;",
        "get_6FtApart",
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
        "SMAP\n_6FtApart.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _6FtApart.kt\nandroidx/compose/material/icons/rounded/_6FtApartKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,139:1\n212#2,12:140\n233#2,18:153\n253#2:190\n174#3:152\n705#4,2:171\n717#4,2:173\n719#4,11:179\n72#5,4:175\n*S KotlinDebug\n*F\n+ 1 _6FtApart.kt\nandroidx/compose/material/icons/rounded/_6FtApartKt\n*L\n29#1:140,12\n30#1:153,18\n30#1:190\n29#1:152\n30#1:171,2\n30#1:173,2\n30#1:179,11\n30#1:175,4\n*E\n"
    }
.end annotation


# static fields
.field private static __6FtApart:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final get_6FtApart(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/_6FtApartKt;->__6FtApart:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded._6FtApart"

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
    const/high16 v0, 0x40c00000    # 6.0f

    .line 71
    .line 72
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 73
    .line 74
    .line 75
    const/high16 v17, 0x40000000    # 2.0f

    .line 76
    .line 77
    const/high16 v18, -0x40000000    # -2.0f

    .line 78
    .line 79
    const v13, 0x3f8ccccd    # 1.1f

    .line 80
    .line 81
    .line 82
    const/4 v14, 0x0

    .line 83
    const/high16 v15, 0x40000000    # 2.0f

    .line 84
    .line 85
    const v16, -0x4099999a    # -0.9f

    .line 86
    .line 87
    .line 88
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 89
    .line 90
    .line 91
    const v0, 0x40e33333    # 7.1f

    .line 92
    .line 93
    .line 94
    const/high16 v2, 0x40000000    # 2.0f

    .line 95
    .line 96
    const/high16 v4, 0x40c00000    # 6.0f

    .line 97
    .line 98
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 99
    .line 100
    .line 101
    const v0, 0x4039999a    # 2.9f

    .line 102
    .line 103
    .line 104
    const/high16 v2, 0x40800000    # 4.0f

    .line 105
    .line 106
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 107
    .line 108
    .line 109
    const v0, 0x409ccccd    # 4.9f

    .line 110
    .line 111
    .line 112
    const/high16 v2, 0x40c00000    # 6.0f

    .line 113
    .line 114
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 115
    .line 116
    .line 117
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 118
    .line 119
    .line 120
    const v0, 0x4116e148    # 9.43f

    .line 121
    .line 122
    .line 123
    const/high16 v2, 0x41200000    # 10.0f

    .line 124
    .line 125
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 126
    .line 127
    .line 128
    const v17, -0x4063d70a    # -1.22f

    .line 129
    .line 130
    .line 131
    const v18, -0x40133333    # -1.85f

    .line 132
    .line 133
    .line 134
    const/4 v13, 0x0

    .line 135
    const v14, -0x40b0a3d7    # -0.81f

    .line 136
    .line 137
    .line 138
    const v15, -0x410a3d71    # -0.48f

    .line 139
    .line 140
    .line 141
    const v16, -0x403c28f6    # -1.53f

    .line 142
    .line 143
    .line 144
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 145
    .line 146
    .line 147
    const/high16 v17, 0x40c00000    # 6.0f

    .line 148
    .line 149
    const/high16 v18, 0x40e00000    # 7.0f

    .line 150
    .line 151
    const v13, 0x40fdc28f    # 7.93f

    .line 152
    .line 153
    .line 154
    const v14, 0x40e6b852    # 7.21f

    .line 155
    .line 156
    .line 157
    const v15, 0x40dfae14    # 6.99f

    .line 158
    .line 159
    .line 160
    const/high16 v16, 0x40e00000    # 7.0f

    .line 161
    .line 162
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 163
    .line 164
    .line 165
    const v17, 0x404e147b    # 3.22f

    .line 166
    .line 167
    .line 168
    const v18, 0x40f28f5c    # 7.58f

    .line 169
    .line 170
    .line 171
    const v13, 0x40a051ec    # 5.01f

    .line 172
    .line 173
    .line 174
    const/high16 v14, 0x40e00000    # 7.0f

    .line 175
    .line 176
    const v15, 0x40823d71    # 4.07f

    .line 177
    .line 178
    .line 179
    const v16, 0x40e6b852    # 7.21f

    .line 180
    .line 181
    .line 182
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 183
    .line 184
    .line 185
    const/high16 v17, 0x40000000    # 2.0f

    .line 186
    .line 187
    const v18, 0x4116e148    # 9.43f

    .line 188
    .line 189
    .line 190
    const v13, 0x401eb852    # 2.48f

    .line 191
    .line 192
    .line 193
    const v14, 0x40fccccd    # 7.9f

    .line 194
    .line 195
    .line 196
    const/high16 v15, 0x40000000    # 2.0f

    .line 197
    .line 198
    const v16, 0x4109eb85    # 8.62f

    .line 199
    .line 200
    .line 201
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 202
    .line 203
    .line 204
    const/high16 v0, 0x41200000    # 10.0f

    .line 205
    .line 206
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 207
    .line 208
    .line 209
    const/high16 v0, 0x41000000    # 8.0f

    .line 210
    .line 211
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 212
    .line 213
    .line 214
    const v0, 0x4116e148    # 9.43f

    .line 215
    .line 216
    .line 217
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 218
    .line 219
    .line 220
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 221
    .line 222
    .line 223
    const/high16 v0, 0x41900000    # 18.0f

    .line 224
    .line 225
    const/high16 v2, 0x40c00000    # 6.0f

    .line 226
    .line 227
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 228
    .line 229
    .line 230
    const/high16 v18, -0x40000000    # -2.0f

    .line 231
    .line 232
    const v13, 0x3f8ccccd    # 1.1f

    .line 233
    .line 234
    .line 235
    const/4 v14, 0x0

    .line 236
    const v16, -0x4099999a    # -0.9f

    .line 237
    .line 238
    .line 239
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 240
    .line 241
    .line 242
    const v0, -0x4099999a    # -0.9f

    .line 243
    .line 244
    .line 245
    const/high16 v2, -0x40000000    # -2.0f

    .line 246
    .line 247
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 248
    .line 249
    .line 250
    const v0, 0x3f666666    # 0.9f

    .line 251
    .line 252
    .line 253
    const/high16 v2, 0x40000000    # 2.0f

    .line 254
    .line 255
    const/high16 v4, -0x40000000    # -2.0f

    .line 256
    .line 257
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 258
    .line 259
    .line 260
    const v0, 0x41873333    # 16.9f

    .line 261
    .line 262
    .line 263
    const/high16 v2, 0x41900000    # 18.0f

    .line 264
    .line 265
    const/high16 v4, 0x40c00000    # 6.0f

    .line 266
    .line 267
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 268
    .line 269
    .line 270
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 271
    .line 272
    .line 273
    const/high16 v0, 0x41b00000    # 22.0f

    .line 274
    .line 275
    const v2, 0x4116e148    # 9.43f

    .line 276
    .line 277
    .line 278
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 279
    .line 280
    .line 281
    const v17, -0x4063d70a    # -1.22f

    .line 282
    .line 283
    .line 284
    const v18, -0x40133333    # -1.85f

    .line 285
    .line 286
    .line 287
    const/4 v13, 0x0

    .line 288
    const v14, -0x40b0a3d7    # -0.81f

    .line 289
    .line 290
    .line 291
    const v15, -0x410a3d71    # -0.48f

    .line 292
    .line 293
    .line 294
    const v16, -0x403c28f6    # -1.53f

    .line 295
    .line 296
    .line 297
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 298
    .line 299
    .line 300
    const/high16 v17, 0x41900000    # 18.0f

    .line 301
    .line 302
    const/high16 v18, 0x40e00000    # 7.0f

    .line 303
    .line 304
    const v13, 0x419f70a4    # 19.93f

    .line 305
    .line 306
    .line 307
    const v14, 0x40e6b852    # 7.21f

    .line 308
    .line 309
    .line 310
    const v15, 0x4197eb85    # 18.99f

    .line 311
    .line 312
    .line 313
    const/high16 v16, 0x40e00000    # 7.0f

    .line 314
    .line 315
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 316
    .line 317
    .line 318
    const v17, -0x3fce147b    # -2.78f

    .line 319
    .line 320
    .line 321
    const v18, 0x3f147ae1    # 0.58f

    .line 322
    .line 323
    .line 324
    const v13, -0x40828f5c    # -0.99f

    .line 325
    .line 326
    .line 327
    const/4 v14, 0x0

    .line 328
    const v15, -0x4008f5c3    # -1.93f

    .line 329
    .line 330
    .line 331
    const v16, 0x3e570a3d    # 0.21f

    .line 332
    .line 333
    .line 334
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 335
    .line 336
    .line 337
    const/high16 v17, 0x41600000    # 14.0f

    .line 338
    .line 339
    const v18, 0x4116e148    # 9.43f

    .line 340
    .line 341
    .line 342
    const v13, 0x4167ae14    # 14.48f

    .line 343
    .line 344
    .line 345
    const v14, 0x40fccccd    # 7.9f

    .line 346
    .line 347
    .line 348
    const/high16 v15, 0x41600000    # 14.0f

    .line 349
    .line 350
    const v16, 0x4109eb85    # 8.62f

    .line 351
    .line 352
    .line 353
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 354
    .line 355
    .line 356
    const/high16 v0, 0x41200000    # 10.0f

    .line 357
    .line 358
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 359
    .line 360
    .line 361
    const/high16 v0, 0x41000000    # 8.0f

    .line 362
    .line 363
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 364
    .line 365
    .line 366
    const v0, 0x4116e148    # 9.43f

    .line 367
    .line 368
    .line 369
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 370
    .line 371
    .line 372
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 373
    .line 374
    .line 375
    const v0, 0x41ad3333    # 21.65f

    .line 376
    .line 377
    .line 378
    const v2, 0x4165999a    # 14.35f

    .line 379
    .line 380
    .line 381
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 382
    .line 383
    .line 384
    const v0, 0x3fe51eb8    # 1.79f

    .line 385
    .line 386
    .line 387
    const v2, -0x401ae148    # -1.79f

    .line 388
    .line 389
    .line 390
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 391
    .line 392
    .line 393
    const/high16 v17, 0x41980000    # 19.0f

    .line 394
    .line 395
    const v18, 0x417ca3d7    # 15.79f

    .line 396
    .line 397
    .line 398
    const v13, 0x419c51ec    # 19.54f

    .line 399
    .line 400
    .line 401
    const v14, 0x4183ae14    # 16.46f

    .line 402
    .line 403
    .line 404
    const/high16 v15, 0x41980000    # 19.0f

    .line 405
    .line 406
    const v16, 0x4181eb85    # 16.24f

    .line 407
    .line 408
    .line 409
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 410
    .line 411
    .line 412
    const v0, -0x40b33333    # -0.8f

    .line 413
    .line 414
    .line 415
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 416
    .line 417
    .line 418
    const/high16 v0, 0x40a00000    # 5.0f

    .line 419
    .line 420
    const/high16 v2, 0x41700000    # 15.0f

    .line 421
    .line 422
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 423
    .line 424
    .line 425
    const v0, 0x3f4a3d71    # 0.79f

    .line 426
    .line 427
    .line 428
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 429
    .line 430
    .line 431
    const v17, -0x40a66666    # -0.85f

    .line 432
    .line 433
    .line 434
    const v18, 0x3eb33333    # 0.35f

    .line 435
    .line 436
    .line 437
    const/4 v13, 0x0

    .line 438
    const v14, 0x3ee66666    # 0.45f

    .line 439
    .line 440
    .line 441
    const v15, -0x40f5c28f    # -0.54f

    .line 442
    .line 443
    .line 444
    const v16, 0x3f2b851f    # 0.67f

    .line 445
    .line 446
    .line 447
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 448
    .line 449
    .line 450
    const v0, -0x401ae148    # -1.79f

    .line 451
    .line 452
    .line 453
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 454
    .line 455
    .line 456
    const/16 v17, 0x0

    .line 457
    .line 458
    const v18, -0x40ca3d71    # -0.71f

    .line 459
    .line 460
    .line 461
    const v13, -0x41b33333    # -0.2f

    .line 462
    .line 463
    .line 464
    const v14, -0x41b33333    # -0.2f

    .line 465
    .line 466
    .line 467
    const v15, -0x41b33333    # -0.2f

    .line 468
    .line 469
    .line 470
    const v16, -0x40fd70a4    # -0.51f

    .line 471
    .line 472
    .line 473
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 474
    .line 475
    .line 476
    const v0, 0x3fe51eb8    # 1.79f

    .line 477
    .line 478
    .line 479
    const v2, -0x401ae148    # -1.79f

    .line 480
    .line 481
    .line 482
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 483
    .line 484
    .line 485
    const/high16 v17, 0x40a00000    # 5.0f

    .line 486
    .line 487
    const v18, 0x41435c29    # 12.21f

    .line 488
    .line 489
    .line 490
    const v13, 0x408eb852    # 4.46f

    .line 491
    .line 492
    .line 493
    const v14, 0x4138a3d7    # 11.54f

    .line 494
    .line 495
    .line 496
    const/high16 v15, 0x40a00000    # 5.0f

    .line 497
    .line 498
    const v16, 0x413c28f6    # 11.76f

    .line 499
    .line 500
    .line 501
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 502
    .line 503
    .line 504
    const v0, 0x3f4ccccd    # 0.8f

    .line 505
    .line 506
    .line 507
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 508
    .line 509
    .line 510
    const/high16 v0, 0x41500000    # 13.0f

    .line 511
    .line 512
    const/high16 v2, 0x41980000    # 19.0f

    .line 513
    .line 514
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 515
    .line 516
    .line 517
    const v0, -0x40b5c28f    # -0.79f

    .line 518
    .line 519
    .line 520
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 521
    .line 522
    .line 523
    const v17, 0x3f59999a    # 0.85f

    .line 524
    .line 525
    .line 526
    const v18, -0x414ccccd    # -0.35f

    .line 527
    .line 528
    .line 529
    const/4 v13, 0x0

    .line 530
    const v14, -0x4119999a    # -0.45f

    .line 531
    .line 532
    .line 533
    const v15, 0x3f0a3d71    # 0.54f

    .line 534
    .line 535
    .line 536
    const v16, -0x40d47ae1    # -0.67f

    .line 537
    .line 538
    .line 539
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 540
    .line 541
    .line 542
    const v0, 0x3fe51eb8    # 1.79f

    .line 543
    .line 544
    .line 545
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 546
    .line 547
    .line 548
    const v17, 0x41ad3333    # 21.65f

    .line 549
    .line 550
    .line 551
    const v18, 0x4165999a    # 14.35f

    .line 552
    .line 553
    .line 554
    const v13, 0x41aeb852    # 21.84f

    .line 555
    .line 556
    .line 557
    const v14, 0x415d70a4    # 13.84f

    .line 558
    .line 559
    .line 560
    const v15, 0x41aeb852    # 21.84f

    .line 561
    .line 562
    .line 563
    const v16, 0x41628f5c    # 14.16f

    .line 564
    .line 565
    .line 566
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 567
    .line 568
    .line 569
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 570
    .line 571
    .line 572
    const/high16 v0, 0x41940000    # 18.5f

    .line 573
    .line 574
    const/high16 v2, 0x41200000    # 10.0f

    .line 575
    .line 576
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 577
    .line 578
    .line 579
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 580
    .line 581
    .line 582
    const/high16 v17, -0x41000000    # -0.5f

    .line 583
    .line 584
    const/high16 v18, -0x41000000    # -0.5f

    .line 585
    .line 586
    const/4 v13, 0x0

    .line 587
    const v14, -0x4170a3d7    # -0.28f

    .line 588
    .line 589
    .line 590
    const v15, -0x419eb852    # -0.22f

    .line 591
    .line 592
    .line 593
    const/high16 v16, -0x41000000    # -0.5f

    .line 594
    .line 595
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 596
    .line 597
    .line 598
    const/high16 v0, -0x40000000    # -2.0f

    .line 599
    .line 600
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 601
    .line 602
    .line 603
    const/high16 v17, 0x40e00000    # 7.0f

    .line 604
    .line 605
    const/high16 v18, 0x41940000    # 18.5f

    .line 606
    .line 607
    const v13, 0x40e70a3d    # 7.22f

    .line 608
    .line 609
    .line 610
    const/high16 v14, 0x41900000    # 18.0f

    .line 611
    .line 612
    const/high16 v15, 0x40e00000    # 7.0f

    .line 613
    .line 614
    const v16, 0x4191c28f    # 18.22f

    .line 615
    .line 616
    .line 617
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 618
    .line 619
    .line 620
    const/high16 v0, 0x40400000    # 3.0f

    .line 621
    .line 622
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 623
    .line 624
    .line 625
    const/high16 v17, 0x40f00000    # 7.5f

    .line 626
    .line 627
    const/high16 v18, 0x41b00000    # 22.0f

    .line 628
    .line 629
    const/high16 v13, 0x40e00000    # 7.0f

    .line 630
    .line 631
    const v14, 0x41ae3d71    # 21.78f

    .line 632
    .line 633
    .line 634
    const v15, 0x40e70a3d    # 7.22f

    .line 635
    .line 636
    .line 637
    const/high16 v16, 0x41b00000    # 22.0f

    .line 638
    .line 639
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 640
    .line 641
    .line 642
    const/high16 v0, 0x40000000    # 2.0f

    .line 643
    .line 644
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 645
    .line 646
    .line 647
    const/high16 v17, 0x3f000000    # 0.5f

    .line 648
    .line 649
    const/high16 v18, -0x41000000    # -0.5f

    .line 650
    .line 651
    const v13, 0x3e8f5c29    # 0.28f

    .line 652
    .line 653
    .line 654
    const/4 v14, 0x0

    .line 655
    const/high16 v15, 0x3f000000    # 0.5f

    .line 656
    .line 657
    const v16, -0x419eb852    # -0.22f

    .line 658
    .line 659
    .line 660
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 661
    .line 662
    .line 663
    const/high16 v0, 0x41a00000    # 20.0f

    .line 664
    .line 665
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 666
    .line 667
    .line 668
    const/high16 v17, -0x41000000    # -0.5f

    .line 669
    .line 670
    const/4 v13, 0x0

    .line 671
    const v14, -0x4170a3d7    # -0.28f

    .line 672
    .line 673
    .line 674
    const v15, -0x419eb852    # -0.22f

    .line 675
    .line 676
    .line 677
    const/high16 v16, -0x41000000    # -0.5f

    .line 678
    .line 679
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 680
    .line 681
    .line 682
    const/high16 v0, 0x41000000    # 8.0f

    .line 683
    .line 684
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 685
    .line 686
    .line 687
    const/high16 v0, 0x41980000    # 19.0f

    .line 688
    .line 689
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 690
    .line 691
    .line 692
    const/high16 v0, 0x3fc00000    # 1.5f

    .line 693
    .line 694
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 695
    .line 696
    .line 697
    const/high16 v17, 0x41200000    # 10.0f

    .line 698
    .line 699
    const/high16 v18, 0x41940000    # 18.5f

    .line 700
    .line 701
    const v13, 0x411c7ae1    # 9.78f

    .line 702
    .line 703
    .line 704
    const/high16 v14, 0x41980000    # 19.0f

    .line 705
    .line 706
    const/high16 v15, 0x41200000    # 10.0f

    .line 707
    .line 708
    const v16, 0x41963d71    # 18.78f

    .line 709
    .line 710
    .line 711
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 712
    .line 713
    .line 714
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 715
    .line 716
    .line 717
    const/high16 v0, 0x41a40000    # 20.5f

    .line 718
    .line 719
    const/high16 v2, 0x41100000    # 9.0f

    .line 720
    .line 721
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 722
    .line 723
    .line 724
    const/high16 v0, 0x41a80000    # 21.0f

    .line 725
    .line 726
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 727
    .line 728
    .line 729
    const/high16 v0, 0x41000000    # 8.0f

    .line 730
    .line 731
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 732
    .line 733
    .line 734
    const/high16 v0, -0x41000000    # -0.5f

    .line 735
    .line 736
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 737
    .line 738
    .line 739
    const/high16 v0, 0x41100000    # 9.0f

    .line 740
    .line 741
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 742
    .line 743
    .line 744
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 745
    .line 746
    .line 747
    const/high16 v0, 0x41880000    # 17.0f

    .line 748
    .line 749
    const/high16 v2, 0x41980000    # 19.0f

    .line 750
    .line 751
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 752
    .line 753
    .line 754
    const/high16 v0, -0x41000000    # -0.5f

    .line 755
    .line 756
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 757
    .line 758
    .line 759
    const/high16 v0, 0x40200000    # 2.5f

    .line 760
    .line 761
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 762
    .line 763
    .line 764
    const/high16 v17, -0x41000000    # -0.5f

    .line 765
    .line 766
    const/high16 v18, 0x3f000000    # 0.5f

    .line 767
    .line 768
    const/4 v13, 0x0

    .line 769
    const v14, 0x3e8f5c29    # 0.28f

    .line 770
    .line 771
    .line 772
    const v15, -0x419eb852    # -0.22f

    .line 773
    .line 774
    .line 775
    const/high16 v16, 0x3f000000    # 0.5f

    .line 776
    .line 777
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 778
    .line 779
    .line 780
    const/4 v0, 0x0

    .line 781
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 782
    .line 783
    .line 784
    const/high16 v18, -0x41000000    # -0.5f

    .line 785
    .line 786
    const v13, -0x4170a3d7    # -0.28f

    .line 787
    .line 788
    .line 789
    const/4 v14, 0x0

    .line 790
    const/high16 v15, -0x41000000    # -0.5f

    .line 791
    .line 792
    const v16, -0x419eb852    # -0.22f

    .line 793
    .line 794
    .line 795
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 796
    .line 797
    .line 798
    const/high16 v0, 0x41980000    # 19.0f

    .line 799
    .line 800
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 801
    .line 802
    .line 803
    const/high16 v0, 0x41700000    # 15.0f

    .line 804
    .line 805
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 806
    .line 807
    .line 808
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 809
    .line 810
    .line 811
    const/4 v0, 0x0

    .line 812
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 813
    .line 814
    .line 815
    const/high16 v17, 0x3f000000    # 0.5f

    .line 816
    .line 817
    const/4 v13, 0x0

    .line 818
    const v14, -0x4170a3d7    # -0.28f

    .line 819
    .line 820
    .line 821
    const v15, 0x3e6147ae    # 0.22f

    .line 822
    .line 823
    .line 824
    const/high16 v16, -0x41000000    # -0.5f

    .line 825
    .line 826
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 827
    .line 828
    .line 829
    const/high16 v0, 0x40000000    # 2.0f

    .line 830
    .line 831
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 832
    .line 833
    .line 834
    const/high16 v18, 0x3f000000    # 0.5f

    .line 835
    .line 836
    const v13, 0x3e8f5c29    # 0.28f

    .line 837
    .line 838
    .line 839
    const/4 v14, 0x0

    .line 840
    const/high16 v15, 0x3f000000    # 0.5f

    .line 841
    .line 842
    const v16, 0x3e6147ae    # 0.22f

    .line 843
    .line 844
    .line 845
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 846
    .line 847
    .line 848
    const/4 v0, 0x0

    .line 849
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 850
    .line 851
    .line 852
    const/high16 v17, 0x41880000    # 17.0f

    .line 853
    .line 854
    const/high16 v18, 0x41980000    # 19.0f

    .line 855
    .line 856
    const/high16 v13, 0x418c0000    # 17.5f

    .line 857
    .line 858
    const v14, 0x41963d71    # 18.78f

    .line 859
    .line 860
    .line 861
    const v15, 0x418a3d71    # 17.28f

    .line 862
    .line 863
    .line 864
    const/high16 v16, 0x41980000    # 19.0f

    .line 865
    .line 866
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 867
    .line 868
    .line 869
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 870
    .line 871
    .line 872
    const/high16 v0, 0x41600000    # 14.0f

    .line 873
    .line 874
    const/high16 v2, 0x41940000    # 18.5f

    .line 875
    .line 876
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 877
    .line 878
    .line 879
    const/high16 v17, -0x41000000    # -0.5f

    .line 880
    .line 881
    const/high16 v18, 0x3f000000    # 0.5f

    .line 882
    .line 883
    const/4 v13, 0x0

    .line 884
    const v14, 0x3e8f5c29    # 0.28f

    .line 885
    .line 886
    .line 887
    const v15, -0x419eb852    # -0.22f

    .line 888
    .line 889
    .line 890
    const/high16 v16, 0x3f000000    # 0.5f

    .line 891
    .line 892
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 893
    .line 894
    .line 895
    const/high16 v0, -0x40800000    # -1.0f

    .line 896
    .line 897
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 898
    .line 899
    .line 900
    const/high16 v0, 0x3f000000    # 0.5f

    .line 901
    .line 902
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 903
    .line 904
    .line 905
    const/high16 v0, 0x41500000    # 13.0f

    .line 906
    .line 907
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 908
    .line 909
    .line 910
    const/high16 v17, 0x3f000000    # 0.5f

    .line 911
    .line 912
    const v13, 0x3e8f5c29    # 0.28f

    .line 913
    .line 914
    .line 915
    const/4 v14, 0x0

    .line 916
    const/high16 v15, 0x3f000000    # 0.5f

    .line 917
    .line 918
    const v16, 0x3e6147ae    # 0.22f

    .line 919
    .line 920
    .line 921
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 922
    .line 923
    .line 924
    const/high16 v17, -0x41000000    # -0.5f

    .line 925
    .line 926
    const/4 v13, 0x0

    .line 927
    const v14, 0x3e8f5c29    # 0.28f

    .line 928
    .line 929
    .line 930
    const v15, -0x419eb852    # -0.22f

    .line 931
    .line 932
    .line 933
    const/high16 v16, 0x3f000000    # 0.5f

    .line 934
    .line 935
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 936
    .line 937
    .line 938
    const/high16 v0, -0x41000000    # -0.5f

    .line 939
    .line 940
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 941
    .line 942
    .line 943
    const/high16 v0, 0x3f800000    # 1.0f

    .line 944
    .line 945
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 946
    .line 947
    .line 948
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 949
    .line 950
    .line 951
    const/high16 v18, -0x41000000    # -0.5f

    .line 952
    .line 953
    const v13, -0x4170a3d7    # -0.28f

    .line 954
    .line 955
    .line 956
    const/4 v14, 0x0

    .line 957
    const/high16 v15, -0x41000000    # -0.5f

    .line 958
    .line 959
    const v16, -0x419eb852    # -0.22f

    .line 960
    .line 961
    .line 962
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 963
    .line 964
    .line 965
    const/high16 v0, -0x3fc00000    # -3.0f

    .line 966
    .line 967
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 968
    .line 969
    .line 970
    const/high16 v17, 0x3f000000    # 0.5f

    .line 971
    .line 972
    const/4 v13, 0x0

    .line 973
    const v14, -0x4170a3d7    # -0.28f

    .line 974
    .line 975
    .line 976
    const v15, 0x3e6147ae    # 0.22f

    .line 977
    .line 978
    .line 979
    const/high16 v16, -0x41000000    # -0.5f

    .line 980
    .line 981
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 982
    .line 983
    .line 984
    const/high16 v0, 0x3fc00000    # 1.5f

    .line 985
    .line 986
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 987
    .line 988
    .line 989
    const/high16 v17, 0x41600000    # 14.0f

    .line 990
    .line 991
    const/high16 v18, 0x41940000    # 18.5f

    .line 992
    .line 993
    const v13, 0x415c7ae1    # 13.78f

    .line 994
    .line 995
    .line 996
    const/high16 v14, 0x41900000    # 18.0f

    .line 997
    .line 998
    const/high16 v15, 0x41600000    # 14.0f

    .line 999
    .line 1000
    const v16, 0x4191c28f    # 18.22f

    .line 1001
    .line 1002
    .line 1003
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1004
    .line 1005
    .line 1006
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1007
    .line 1008
    .line 1009
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 1010
    .line 1011
    .line 1012
    move-result-object v2

    .line 1013
    const/16 v16, 0x3800

    .line 1014
    .line 1015
    const/16 v17, 0x0

    .line 1016
    .line 1017
    const/high16 v6, 0x3f800000    # 1.0f

    .line 1018
    .line 1019
    const/high16 v8, 0x3f800000    # 1.0f

    .line 1020
    .line 1021
    const/4 v7, 0x0

    .line 1022
    const/high16 v9, 0x3f800000    # 1.0f

    .line 1023
    .line 1024
    const/high16 v12, 0x3f800000    # 1.0f

    .line 1025
    .line 1026
    const/4 v13, 0x0

    .line 1027
    const/4 v14, 0x0

    .line 1028
    const/4 v15, 0x0

    .line 1029
    const-string v4, ""

    .line 1030
    .line 1031
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 1032
    .line 1033
    .line 1034
    move-result-object v0

    .line 1035
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1036
    .line 1037
    .line 1038
    move-result-object v0

    .line 1039
    sput-object v0, Landroidx/compose/material/icons/rounded/_6FtApartKt;->__6FtApart:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1040
    .line 1041
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 1042
    .line 1043
    .line 1044
    return-object v0
.end method
