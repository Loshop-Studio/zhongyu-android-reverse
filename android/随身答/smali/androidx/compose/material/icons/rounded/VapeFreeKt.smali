.class public final Landroidx/compose/material/icons/rounded/VapeFreeKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_vapeFree",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "VapeFree",
        "Landroidx/compose/material/icons/Icons$Rounded;",
        "getVapeFree",
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
        "SMAP\nVapeFree.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VapeFree.kt\nandroidx/compose/material/icons/rounded/VapeFreeKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,102:1\n212#2,12:103\n233#2,18:116\n253#2:153\n174#3:115\n705#4,2:134\n717#4,2:136\n719#4,11:142\n72#5,4:138\n*S KotlinDebug\n*F\n+ 1 VapeFree.kt\nandroidx/compose/material/icons/rounded/VapeFreeKt\n*L\n29#1:103,12\n30#1:116,18\n30#1:153\n29#1:115\n30#1:134,2\n30#1:136,2\n30#1:142,11\n30#1:138,4\n*E\n"
    }
.end annotation


# static fields
.field private static _vapeFree:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getVapeFree(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/VapeFreeKt;->_vapeFree:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.VapeFree"

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
    const v0, 0x41a3eb85    # 20.49f

    .line 71
    .line 72
    .line 73
    const v2, 0x41af3333    # 21.9f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v17, -0x404b851f    # -1.41f

    .line 80
    .line 81
    .line 82
    const/16 v18, 0x0

    .line 83
    .line 84
    const v13, -0x413851ec    # -0.39f

    .line 85
    .line 86
    .line 87
    const v14, 0x3ec7ae14    # 0.39f

    .line 88
    .line 89
    .line 90
    const v15, -0x407d70a4    # -1.02f

    .line 91
    .line 92
    .line 93
    const v16, 0x3ec7ae14    # 0.39f

    .line 94
    .line 95
    .line 96
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 97
    .line 98
    .line 99
    const v0, -0x3fc66666    # -2.9f

    .line 100
    .line 101
    .line 102
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 103
    .line 104
    .line 105
    const/high16 v0, 0x41000000    # 8.0f

    .line 106
    .line 107
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 108
    .line 109
    .line 110
    const/high16 v0, -0x3fc00000    # -3.0f

    .line 111
    .line 112
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 113
    .line 114
    .line 115
    const v0, 0x40a570a4    # 5.17f

    .line 116
    .line 117
    .line 118
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 119
    .line 120
    .line 121
    const v0, 0x40066666    # 2.1f

    .line 122
    .line 123
    .line 124
    const v2, 0x409dc28f    # 4.93f

    .line 125
    .line 126
    .line 127
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 128
    .line 129
    .line 130
    const/16 v17, 0x0

    .line 131
    .line 132
    const v18, -0x404b851f    # -1.41f

    .line 133
    .line 134
    .line 135
    const v14, -0x413851ec    # -0.39f

    .line 136
    .line 137
    .line 138
    const v15, -0x413851ec    # -0.39f

    .line 139
    .line 140
    .line 141
    const v16, -0x407d70a4    # -1.02f

    .line 142
    .line 143
    .line 144
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 145
    .line 146
    .line 147
    const v0, 0x3fb47ae1    # 1.41f

    .line 148
    .line 149
    .line 150
    const/4 v2, 0x0

    .line 151
    const v4, 0x3f828f5c    # 1.02f

    .line 152
    .line 153
    .line 154
    const v6, -0x413851ec    # -0.39f

    .line 155
    .line 156
    .line 157
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 158
    .line 159
    .line 160
    const v0, 0x4187c28f    # 16.97f

    .line 161
    .line 162
    .line 163
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 164
    .line 165
    .line 166
    const v17, 0x41a3eb85    # 20.49f

    .line 167
    .line 168
    .line 169
    const v18, 0x41af3333    # 21.9f

    .line 170
    .line 171
    .line 172
    const v13, 0x41a70a3d    # 20.88f

    .line 173
    .line 174
    .line 175
    const v14, 0x41a70a3d    # 20.88f

    .line 176
    .line 177
    .line 178
    const v15, 0x41a70a3d    # 20.88f

    .line 179
    .line 180
    .line 181
    const v16, 0x41ac147b    # 21.51f

    .line 182
    .line 183
    .line 184
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 185
    .line 186
    .line 187
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 188
    .line 189
    .line 190
    const/high16 v0, 0x41800000    # 16.0f

    .line 191
    .line 192
    const v2, 0x4196a3d7    # 18.83f

    .line 193
    .line 194
    .line 195
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 196
    .line 197
    .line 198
    const v0, 0x3fd5c28f    # 1.67f

    .line 199
    .line 200
    .line 201
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 202
    .line 203
    .line 204
    const/high16 v17, 0x3fc00000    # 1.5f

    .line 205
    .line 206
    const/high16 v18, 0x3fc00000    # 1.5f

    .line 207
    .line 208
    const v13, 0x3f547ae1    # 0.83f

    .line 209
    .line 210
    .line 211
    const/4 v14, 0x0

    .line 212
    const/high16 v15, 0x3fc00000    # 1.5f

    .line 213
    .line 214
    const v16, 0x3f2b851f    # 0.67f

    .line 215
    .line 216
    .line 217
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 218
    .line 219
    .line 220
    const v17, -0x40f851ec    # -0.53f

    .line 221
    .line 222
    .line 223
    const v18, 0x3f91eb85    # 1.14f

    .line 224
    .line 225
    .line 226
    const/4 v13, 0x0

    .line 227
    const v14, 0x3eeb851f    # 0.46f

    .line 228
    .line 229
    .line 230
    const v15, -0x41a8f5c3    # -0.21f

    .line 231
    .line 232
    .line 233
    const v16, 0x3f5eb852    # 0.87f

    .line 234
    .line 235
    .line 236
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 237
    .line 238
    .line 239
    const/high16 v0, 0x41800000    # 16.0f

    .line 240
    .line 241
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 242
    .line 243
    .line 244
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 245
    .line 246
    .line 247
    const/high16 v0, 0x41280000    # 10.5f

    .line 248
    .line 249
    const/high16 v2, 0x41880000    # 17.0f

    .line 250
    .line 251
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 252
    .line 253
    .line 254
    const/high16 v17, -0x41000000    # -0.5f

    .line 255
    .line 256
    const/high16 v18, 0x3f000000    # 0.5f

    .line 257
    .line 258
    const v13, -0x4170a3d7    # -0.28f

    .line 259
    .line 260
    .line 261
    const/4 v14, 0x0

    .line 262
    const/high16 v15, -0x41000000    # -0.5f

    .line 263
    .line 264
    const v16, 0x3e6147ae    # 0.22f

    .line 265
    .line 266
    .line 267
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 268
    .line 269
    .line 270
    const v0, 0x3e6147ae    # 0.22f

    .line 271
    .line 272
    .line 273
    const/high16 v2, 0x3f000000    # 0.5f

    .line 274
    .line 275
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 276
    .line 277
    .line 278
    const v0, -0x419eb852    # -0.22f

    .line 279
    .line 280
    .line 281
    const/high16 v2, -0x41000000    # -0.5f

    .line 282
    .line 283
    const/high16 v4, 0x3f000000    # 0.5f

    .line 284
    .line 285
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 286
    .line 287
    .line 288
    const v0, 0x412c7ae1    # 10.78f

    .line 289
    .line 290
    .line 291
    const/high16 v2, 0x41280000    # 10.5f

    .line 292
    .line 293
    const/high16 v4, 0x41880000    # 17.0f

    .line 294
    .line 295
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 296
    .line 297
    .line 298
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 299
    .line 300
    .line 301
    const v0, 0x4196cccd    # 18.85f

    .line 302
    .line 303
    .line 304
    const v2, 0x40f75c29    # 7.73f

    .line 305
    .line 306
    .line 307
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 308
    .line 309
    .line 310
    const/high16 v17, 0x3f800000    # 1.0f

    .line 311
    .line 312
    const v18, -0x3fe7ae14    # -2.38f

    .line 313
    .line 314
    .line 315
    const v13, 0x3f1eb852    # 0.62f

    .line 316
    .line 317
    .line 318
    const v14, -0x40e3d70a    # -0.61f

    .line 319
    .line 320
    .line 321
    const/high16 v15, 0x3f800000    # 1.0f

    .line 322
    .line 323
    const v16, -0x40466666    # -1.45f

    .line 324
    .line 325
    .line 326
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 327
    .line 328
    .line 329
    const v17, -0x3fe7ae14    # -2.38f

    .line 330
    .line 331
    .line 332
    const v18, -0x3fb28f5c    # -3.21f

    .line 333
    .line 334
    .line 335
    const/4 v13, 0x0

    .line 336
    const v14, -0x403eb852    # -1.51f

    .line 337
    .line 338
    .line 339
    const/high16 v15, -0x40800000    # -1.0f

    .line 340
    .line 341
    const v16, -0x3fcd70a4    # -2.79f

    .line 342
    .line 343
    .line 344
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 345
    .line 346
    .line 347
    const/high16 v17, 0x41840000    # 16.5f

    .line 348
    .line 349
    const v18, 0x40370a3d    # 2.86f

    .line 350
    .line 351
    .line 352
    const v13, 0x4187eb85    # 16.99f

    .line 353
    .line 354
    .line 355
    const/high16 v14, 0x40000000    # 2.0f

    .line 356
    .line 357
    const/high16 v15, 0x41840000    # 16.5f

    .line 358
    .line 359
    const v16, 0x40170a3d    # 2.36f

    .line 360
    .line 361
    .line 362
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 363
    .line 364
    .line 365
    const v17, 0x3f051eb8    # 0.52f

    .line 366
    .line 367
    .line 368
    const v18, 0x3f35c28f    # 0.71f

    .line 369
    .line 370
    .line 371
    const/4 v13, 0x0

    .line 372
    const v14, 0x3ea8f5c3    # 0.33f

    .line 373
    .line 374
    .line 375
    const v15, 0x3e570a3d    # 0.21f

    .line 376
    .line 377
    .line 378
    const v16, 0x3f1eb852    # 0.62f

    .line 379
    .line 380
    .line 381
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 382
    .line 383
    .line 384
    const v17, 0x3faa3d71    # 1.33f

    .line 385
    .line 386
    .line 387
    const v18, 0x3fe3d70a    # 1.78f

    .line 388
    .line 389
    .line 390
    const v13, 0x3f451eb8    # 0.77f

    .line 391
    .line 392
    .line 393
    const v14, 0x3e6b851f    # 0.23f

    .line 394
    .line 395
    .line 396
    const v15, 0x3faa3d71    # 1.33f

    .line 397
    .line 398
    .line 399
    const v16, 0x3f70a3d7    # 0.94f

    .line 400
    .line 401
    .line 402
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 403
    .line 404
    .line 405
    const v17, -0x405d70a4    # -1.27f

    .line 406
    .line 407
    .line 408
    const v18, 0x3fe147ae    # 1.76f

    .line 409
    .line 410
    .line 411
    const/4 v13, 0x0

    .line 412
    const v14, 0x3f51eb85    # 0.82f

    .line 413
    .line 414
    .line 415
    const v15, -0x40f851ec    # -0.53f

    .line 416
    .line 417
    .line 418
    const v16, 0x3fc147ae    # 1.51f

    .line 419
    .line 420
    .line 421
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 422
    .line 423
    .line 424
    const/high16 v17, 0x41840000    # 16.5f

    .line 425
    .line 426
    const v18, 0x40fb3333    # 7.85f

    .line 427
    .line 428
    .line 429
    const/high16 v13, 0x41860000    # 16.75f

    .line 430
    .line 431
    const v14, 0x40e70a3d    # 7.22f

    .line 432
    .line 433
    .line 434
    const/high16 v15, 0x41840000    # 16.5f

    .line 435
    .line 436
    const/high16 v16, 0x40f00000    # 7.5f

    .line 437
    .line 438
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 439
    .line 440
    .line 441
    const/high16 v0, 0x41000000    # 8.0f

    .line 442
    .line 443
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 444
    .line 445
    .line 446
    const v17, 0x3f23d70a    # 0.64f

    .line 447
    .line 448
    .line 449
    const/high16 v18, 0x3f400000    # 0.75f

    .line 450
    .line 451
    const/4 v13, 0x0

    .line 452
    const v14, 0x3ebd70a4    # 0.37f

    .line 453
    .line 454
    .line 455
    const v15, 0x3e8a3d71    # 0.27f

    .line 456
    .line 457
    .line 458
    const v16, 0x3f30a3d7    # 0.69f

    .line 459
    .line 460
    .line 461
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 462
    .line 463
    .line 464
    const v17, 0x40570a3d    # 3.36f

    .line 465
    .line 466
    .line 467
    const v18, 0x4080a3d7    # 4.02f

    .line 468
    .line 469
    .line 470
    const v13, 0x3ff70a3d    # 1.93f

    .line 471
    .line 472
    .line 473
    const v14, 0x3e9eb852    # 0.31f

    .line 474
    .line 475
    .line 476
    const v15, 0x40570a3d    # 3.36f

    .line 477
    .line 478
    .line 479
    const/high16 v16, 0x40000000    # 2.0f

    .line 480
    .line 481
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 482
    .line 483
    .line 484
    const v0, 0x3fbd70a4    # 1.48f

    .line 485
    .line 486
    .line 487
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 488
    .line 489
    .line 490
    const/high16 v17, 0x3f400000    # 0.75f

    .line 491
    .line 492
    const/high16 v18, 0x3f400000    # 0.75f

    .line 493
    .line 494
    const/4 v13, 0x0

    .line 495
    const v14, 0x3ed1eb85    # 0.41f

    .line 496
    .line 497
    .line 498
    const v15, 0x3eae147b    # 0.34f

    .line 499
    .line 500
    .line 501
    const/high16 v16, 0x3f400000    # 0.75f

    .line 502
    .line 503
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 504
    .line 505
    .line 506
    const v0, 0x416a8f5c    # 14.66f

    .line 507
    .line 508
    .line 509
    const/high16 v2, 0x41640000    # 14.25f

    .line 510
    .line 511
    const/high16 v4, 0x41b00000    # 22.0f

    .line 512
    .line 513
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 514
    .line 515
    .line 516
    const v0, -0x404147ae    # -1.49f

    .line 517
    .line 518
    .line 519
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 520
    .line 521
    .line 522
    const v17, 0x4196cccd    # 18.85f

    .line 523
    .line 524
    .line 525
    const v18, 0x40f75c29    # 7.73f

    .line 526
    .line 527
    .line 528
    const/high16 v13, 0x41b00000    # 22.0f

    .line 529
    .line 530
    const v14, 0x4128a3d7    # 10.54f

    .line 531
    .line 532
    .line 533
    const v15, 0x41a5c28f    # 20.72f

    .line 534
    .line 535
    .line 536
    const v16, 0x4109eb85    # 8.62f

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
    const v0, 0x413a6666    # 11.65f

    .line 546
    .line 547
    .line 548
    const v2, 0x4167ae14    # 14.48f

    .line 549
    .line 550
    .line 551
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 552
    .line 553
    .line 554
    const v17, 0x3e051eb8    # 0.13f

    .line 555
    .line 556
    .line 557
    const/16 v18, 0x0

    .line 558
    .line 559
    const v13, 0x3d23d70a    # 0.04f

    .line 560
    .line 561
    .line 562
    const/4 v14, 0x0

    .line 563
    const v15, 0x3db851ec    # 0.09f

    .line 564
    .line 565
    .line 566
    const/16 v16, 0x0

    .line 567
    .line 568
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 569
    .line 570
    .line 571
    const v0, 0x3fb5c28f    # 1.42f

    .line 572
    .line 573
    .line 574
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 575
    .line 576
    .line 577
    const v17, 0x3ffc28f6    # 1.97f

    .line 578
    .line 579
    .line 580
    const v18, 0x40033333    # 2.05f

    .line 581
    .line 582
    .line 583
    const v13, 0x3f866666    # 1.05f

    .line 584
    .line 585
    .line 586
    const v15, 0x3ffc28f6    # 1.97f

    .line 587
    .line 588
    .line 589
    const v16, 0x3f3d70a4    # 0.74f

    .line 590
    .line 591
    .line 592
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 593
    .line 594
    .line 595
    const v0, 0x3f0ccccd    # 0.55f

    .line 596
    .line 597
    .line 598
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 599
    .line 600
    .line 601
    const v17, 0x3f428f5c    # 0.76f

    .line 602
    .line 603
    .line 604
    const/high16 v18, 0x3f400000    # 0.75f

    .line 605
    .line 606
    const/4 v13, 0x0

    .line 607
    const v14, 0x3ed1eb85    # 0.41f

    .line 608
    .line 609
    .line 610
    const v15, 0x3eae147b    # 0.34f

    .line 611
    .line 612
    .line 613
    const/high16 v16, 0x3f400000    # 0.75f

    .line 614
    .line 615
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 616
    .line 617
    .line 618
    const/high16 v17, 0x3f400000    # 0.75f

    .line 619
    .line 620
    const/high16 v18, -0x40c00000    # -0.75f

    .line 621
    .line 622
    const v13, 0x3ed1eb85    # 0.41f

    .line 623
    .line 624
    .line 625
    const/4 v14, 0x0

    .line 626
    const/high16 v15, 0x3f400000    # 0.75f

    .line 627
    .line 628
    const v16, -0x41570a3d    # -0.33f

    .line 629
    .line 630
    .line 631
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 632
    .line 633
    .line 634
    const v0, -0x409c28f6    # -0.89f

    .line 635
    .line 636
    .line 637
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 638
    .line 639
    .line 640
    const v17, -0x3fa147ae    # -3.48f

    .line 641
    .line 642
    .line 643
    const v18, -0x3fb5c28f    # -3.16f

    .line 644
    .line 645
    .line 646
    const v13, -0x43dc28f6    # -0.01f

    .line 647
    .line 648
    .line 649
    const v14, -0x401851ec    # -1.81f

    .line 650
    .line 651
    .line 652
    const v15, -0x4031eb85    # -1.61f

    .line 653
    .line 654
    .line 655
    const v16, -0x3fb5c28f    # -3.16f

    .line 656
    .line 657
    .line 658
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 659
    .line 660
    .line 661
    const v0, -0x4059999a    # -1.3f

    .line 662
    .line 663
    .line 664
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 665
    .line 666
    .line 667
    const v17, -0x3ffb851f    # -2.07f

    .line 668
    .line 669
    .line 670
    const/high16 v18, -0x40200000    # -1.75f

    .line 671
    .line 672
    const v13, -0x407d70a4    # -1.02f

    .line 673
    .line 674
    .line 675
    const/4 v14, 0x0

    .line 676
    const v15, -0x4007ae14    # -1.94f

    .line 677
    .line 678
    .line 679
    const v16, -0x40c51eb8    # -0.73f

    .line 680
    .line 681
    .line 682
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 683
    .line 684
    .line 685
    const v17, 0x3fa66666    # 1.3f

    .line 686
    .line 687
    .line 688
    const v18, -0x4008f5c3    # -1.93f

    .line 689
    .line 690
    .line 691
    const v13, -0x420a3d71    # -0.12f

    .line 692
    .line 693
    .line 694
    const v14, -0x408ccccd    # -0.95f

    .line 695
    .line 696
    .line 697
    const v15, 0x3eeb851f    # 0.46f

    .line 698
    .line 699
    .line 700
    const v16, -0x40266666    # -1.7f

    .line 701
    .line 702
    .line 703
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 704
    .line 705
    .line 706
    const v17, 0x3f0a3d71    # 0.54f

    .line 707
    .line 708
    .line 709
    const v18, -0x40c7ae14    # -0.72f

    .line 710
    .line 711
    .line 712
    const v13, 0x3ea3d70a    # 0.32f

    .line 713
    .line 714
    .line 715
    const v14, -0x4247ae14    # -0.09f

    .line 716
    .line 717
    .line 718
    const v15, 0x3f0a3d71    # 0.54f

    .line 719
    .line 720
    .line 721
    const v16, -0x413d70a4    # -0.38f

    .line 722
    .line 723
    .line 724
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 725
    .line 726
    .line 727
    const v17, -0x4091eb85    # -0.93f

    .line 728
    .line 729
    .line 730
    const/4 v13, 0x0

    .line 731
    const v14, -0x41051eb8    # -0.49f

    .line 732
    .line 733
    .line 734
    const v15, -0x41147ae1    # -0.46f

    .line 735
    .line 736
    .line 737
    const v16, -0x40a3d70a    # -0.86f

    .line 738
    .line 739
    .line 740
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 741
    .line 742
    .line 743
    const v17, -0x3fe51eb8    # -2.42f

    .line 744
    .line 745
    .line 746
    const v18, 0x404f5c29    # 3.24f

    .line 747
    .line 748
    .line 749
    const v13, -0x404b851f    # -1.41f

    .line 750
    .line 751
    .line 752
    const v14, 0x3ed1eb85    # 0.41f

    .line 753
    .line 754
    .line 755
    const v15, -0x3fe47ae1    # -2.43f

    .line 756
    .line 757
    .line 758
    const v16, 0x3fdae148    # 1.71f

    .line 759
    .line 760
    .line 761
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 762
    .line 763
    .line 764
    const v0, 0x413a6666    # 11.65f

    .line 765
    .line 766
    .line 767
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 768
    .line 769
    .line 770
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 771
    .line 772
    .line 773
    const/high16 v0, 0x40400000    # 3.0f

    .line 774
    .line 775
    const/high16 v2, 0x41940000    # 18.5f

    .line 776
    .line 777
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 778
    .line 779
    .line 780
    const/high16 v17, 0x40800000    # 4.0f

    .line 781
    .line 782
    const/high16 v18, 0x3f000000    # 0.5f

    .line 783
    .line 784
    const v13, 0x3faa3d71    # 1.33f

    .line 785
    .line 786
    .line 787
    const/4 v14, 0x0

    .line 788
    const v15, 0x402d70a4    # 2.71f

    .line 789
    .line 790
    .line 791
    const v16, 0x3e3851ec    # 0.18f

    .line 792
    .line 793
    .line 794
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 795
    .line 796
    .line 797
    const/high16 v0, -0x3fc00000    # -3.0f

    .line 798
    .line 799
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 800
    .line 801
    .line 802
    const/high16 v17, -0x3f800000    # -4.0f

    .line 803
    .line 804
    const v13, -0x405ae148    # -1.29f

    .line 805
    .line 806
    .line 807
    const v14, 0x3ea3d70a    # 0.32f

    .line 808
    .line 809
    .line 810
    const v15, -0x3fd51eb8    # -2.67f

    .line 811
    .line 812
    .line 813
    const/high16 v16, 0x3f000000    # 0.5f

    .line 814
    .line 815
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 816
    .line 817
    .line 818
    const/high16 v17, -0x40800000    # -1.0f

    .line 819
    .line 820
    const/high16 v18, 0x3f800000    # 1.0f

    .line 821
    .line 822
    const v13, -0x40f33333    # -0.55f

    .line 823
    .line 824
    .line 825
    const/4 v14, 0x0

    .line 826
    const/high16 v15, -0x40800000    # -1.0f

    .line 827
    .line 828
    const v16, 0x3ee66666    # 0.45f

    .line 829
    .line 830
    .line 831
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 832
    .line 833
    .line 834
    const v0, 0x401ccccd    # 2.45f

    .line 835
    .line 836
    .line 837
    const/high16 v2, 0x40400000    # 3.0f

    .line 838
    .line 839
    const/high16 v4, 0x41940000    # 18.5f

    .line 840
    .line 841
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 842
    .line 843
    .line 844
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 845
    .line 846
    .line 847
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 848
    .line 849
    .line 850
    move-result-object v2

    .line 851
    const/16 v16, 0x3800

    .line 852
    .line 853
    const/16 v17, 0x0

    .line 854
    .line 855
    const/high16 v6, 0x3f800000    # 1.0f

    .line 856
    .line 857
    const/high16 v8, 0x3f800000    # 1.0f

    .line 858
    .line 859
    const/4 v7, 0x0

    .line 860
    const/high16 v9, 0x3f800000    # 1.0f

    .line 861
    .line 862
    const/high16 v12, 0x3f800000    # 1.0f

    .line 863
    .line 864
    const/4 v13, 0x0

    .line 865
    const/4 v15, 0x0

    .line 866
    const-string v4, ""

    .line 867
    .line 868
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 869
    .line 870
    .line 871
    move-result-object v0

    .line 872
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 873
    .line 874
    .line 875
    move-result-object v0

    .line 876
    sput-object v0, Landroidx/compose/material/icons/rounded/VapeFreeKt;->_vapeFree:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 877
    .line 878
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 879
    .line 880
    .line 881
    return-object v0
.end method
