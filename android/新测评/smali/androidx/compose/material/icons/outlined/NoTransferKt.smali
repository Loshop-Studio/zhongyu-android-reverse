.class public final Landroidx/compose/material/icons/outlined/NoTransferKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_noTransfer",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "NoTransfer",
        "Landroidx/compose/material/icons/Icons$Outlined;",
        "getNoTransfer",
        "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;",
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
        "SMAP\nNoTransfer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NoTransfer.kt\nandroidx/compose/material/icons/outlined/NoTransferKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,93:1\n212#2,12:94\n233#2,18:107\n253#2:144\n174#3:106\n705#4,2:125\n717#4,2:127\n719#4,11:133\n72#5,4:129\n*S KotlinDebug\n*F\n+ 1 NoTransfer.kt\nandroidx/compose/material/icons/outlined/NoTransferKt\n*L\n29#1:94,12\n30#1:107,18\n30#1:144\n29#1:106\n30#1:125,2\n30#1:127,2\n30#1:133,11\n30#1:129,4\n*E\n"
    }
.end annotation


# static fields
.field private static _noTransfer:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getNoTransfer(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/outlined/NoTransferKt;->_noTransfer:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Outlined.NoTransfer"

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
    const/high16 v0, 0x41500000    # 13.0f

    .line 71
    .line 72
    const/high16 v2, 0x41080000    # 8.5f

    .line 73
    .line 74
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v17, 0x3fc00000    # 1.5f

    .line 78
    .line 79
    const/high16 v18, 0x3fc00000    # 1.5f

    .line 80
    .line 81
    const v13, 0x3f547ae1    # 0.83f

    .line 82
    .line 83
    .line 84
    const/4 v14, 0x0

    .line 85
    const/high16 v15, 0x3fc00000    # 1.5f

    .line 86
    .line 87
    const v16, 0x3f2b851f    # 0.67f

    .line 88
    .line 89
    .line 90
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 91
    .line 92
    .line 93
    const v0, 0x411547ae    # 9.33f

    .line 94
    .line 95
    .line 96
    const/high16 v2, 0x41800000    # 16.0f

    .line 97
    .line 98
    const/high16 v4, 0x41080000    # 8.5f

    .line 99
    .line 100
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 101
    .line 102
    .line 103
    const v0, 0x417547ae    # 15.33f

    .line 104
    .line 105
    .line 106
    const/high16 v2, 0x41680000    # 14.5f

    .line 107
    .line 108
    const/high16 v4, 0x40e00000    # 7.0f

    .line 109
    .line 110
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 111
    .line 112
    .line 113
    const v0, 0x40f570a4    # 7.67f

    .line 114
    .line 115
    .line 116
    const/high16 v2, 0x41500000    # 13.0f

    .line 117
    .line 118
    const/high16 v4, 0x41080000    # 8.5f

    .line 119
    .line 120
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 121
    .line 122
    .line 123
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 124
    .line 125
    .line 126
    const v0, 0x41b4e148    # 22.61f

    .line 127
    .line 128
    .line 129
    const v2, 0x419e3d71    # 19.78f

    .line 130
    .line 131
    .line 132
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 133
    .line 134
    .line 135
    const v0, -0x402e147b    # -1.64f

    .line 136
    .line 137
    .line 138
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 139
    .line 140
    .line 141
    const/high16 v17, 0x41900000    # 18.0f

    .line 142
    .line 143
    const/high16 v18, 0x41a80000    # 21.0f

    .line 144
    .line 145
    const v13, 0x4190b852    # 18.09f

    .line 146
    .line 147
    .line 148
    const v14, 0x41a7d70a    # 20.98f

    .line 149
    .line 150
    .line 151
    const v15, 0x41906666    # 18.05f

    .line 152
    .line 153
    .line 154
    const/high16 v16, 0x41a80000    # 21.0f

    .line 155
    .line 156
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 157
    .line 158
    .line 159
    const/high16 v0, -0x40800000    # -1.0f

    .line 160
    .line 161
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 162
    .line 163
    .line 164
    const/high16 v17, -0x40800000    # -1.0f

    .line 165
    .line 166
    const/high16 v18, -0x40800000    # -1.0f

    .line 167
    .line 168
    const v13, -0x40f33333    # -0.55f

    .line 169
    .line 170
    .line 171
    const/4 v14, 0x0

    .line 172
    const/high16 v15, -0x40800000    # -1.0f

    .line 173
    .line 174
    const v16, -0x4119999a    # -0.45f

    .line 175
    .line 176
    .line 177
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 178
    .line 179
    .line 180
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 181
    .line 182
    .line 183
    const/high16 v0, 0x41000000    # 8.0f

    .line 184
    .line 185
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 186
    .line 187
    .line 188
    const/high16 v0, 0x3f800000    # 1.0f

    .line 189
    .line 190
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 191
    .line 192
    .line 193
    const/high16 v18, 0x3f800000    # 1.0f

    .line 194
    .line 195
    const/4 v13, 0x0

    .line 196
    const v14, 0x3f0ccccd    # 0.55f

    .line 197
    .line 198
    .line 199
    const v15, -0x4119999a    # -0.45f

    .line 200
    .line 201
    .line 202
    const/high16 v16, 0x3f800000    # 1.0f

    .line 203
    .line 204
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 205
    .line 206
    .line 207
    const/high16 v0, 0x40c00000    # 6.0f

    .line 208
    .line 209
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 210
    .line 211
    .line 212
    const/high16 v18, -0x40800000    # -1.0f

    .line 213
    .line 214
    const v13, -0x40f33333    # -0.55f

    .line 215
    .line 216
    .line 217
    const/4 v14, 0x0

    .line 218
    const/high16 v15, -0x40800000    # -1.0f

    .line 219
    .line 220
    const v16, -0x4119999a    # -0.45f

    .line 221
    .line 222
    .line 223
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 224
    .line 225
    .line 226
    const v0, -0x401c28f6    # -1.78f

    .line 227
    .line 228
    .line 229
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 230
    .line 231
    .line 232
    const/high16 v17, 0x40800000    # 4.0f

    .line 233
    .line 234
    const/high16 v18, 0x41800000    # 16.0f

    .line 235
    .line 236
    const v13, 0x408c7ae1    # 4.39f

    .line 237
    .line 238
    .line 239
    const v14, 0x418d5c29    # 17.67f

    .line 240
    .line 241
    .line 242
    const/high16 v15, 0x40800000    # 4.0f

    .line 243
    .line 244
    const v16, 0x41870a3d    # 16.88f

    .line 245
    .line 246
    .line 247
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 248
    .line 249
    .line 250
    const v0, 0x40da8f5c    # 6.83f

    .line 251
    .line 252
    .line 253
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 254
    .line 255
    .line 256
    const v0, 0x3fb1eb85    # 1.39f

    .line 257
    .line 258
    .line 259
    const v2, 0x40870a3d    # 4.22f

    .line 260
    .line 261
    .line 262
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 263
    .line 264
    .line 265
    const v0, 0x3fb47ae1    # 1.41f

    .line 266
    .line 267
    .line 268
    const v2, -0x404b851f    # -1.41f

    .line 269
    .line 270
    .line 271
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 272
    .line 273
    .line 274
    const v0, 0x41930a3d    # 18.38f

    .line 275
    .line 276
    .line 277
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 278
    .line 279
    .line 280
    const v0, 0x41b4e148    # 22.61f

    .line 281
    .line 282
    .line 283
    const v2, 0x419e3d71    # 19.78f

    .line 284
    .line 285
    .line 286
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 287
    .line 288
    .line 289
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 290
    .line 291
    .line 292
    const v0, 0x410d47ae    # 8.83f

    .line 293
    .line 294
    .line 295
    const/high16 v2, 0x40c00000    # 6.0f

    .line 296
    .line 297
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 298
    .line 299
    .line 300
    const/high16 v0, 0x41200000    # 10.0f

    .line 301
    .line 302
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 303
    .line 304
    .line 305
    const v0, 0x3f95c28f    # 1.17f

    .line 306
    .line 307
    .line 308
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 309
    .line 310
    .line 311
    const v0, 0x410d47ae    # 8.83f

    .line 312
    .line 313
    .line 314
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 315
    .line 316
    .line 317
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 318
    .line 319
    .line 320
    const/high16 v0, 0x41880000    # 17.0f

    .line 321
    .line 322
    const v2, 0x4162b852    # 14.17f

    .line 323
    .line 324
    .line 325
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 326
    .line 327
    .line 328
    const/high16 v0, -0x3f600000    # -5.0f

    .line 329
    .line 330
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 331
    .line 332
    .line 333
    const/high16 v0, 0x40c00000    # 6.0f

    .line 334
    .line 335
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 336
    .line 337
    .line 338
    const/high16 v0, 0x40800000    # 4.0f

    .line 339
    .line 340
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 341
    .line 342
    .line 343
    const v17, 0x3eae147b    # 0.34f

    .line 344
    .line 345
    .line 346
    const v18, 0x3f3ae148    # 0.73f

    .line 347
    .line 348
    .line 349
    const/4 v13, 0x0

    .line 350
    const v14, 0x3ebd70a4    # 0.37f

    .line 351
    .line 352
    .line 353
    const v15, 0x3e570a3d    # 0.21f

    .line 354
    .line 355
    .line 356
    const v16, 0x3f1eb852    # 0.62f

    .line 357
    .line 358
    .line 359
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 360
    .line 361
    .line 362
    const v0, 0x40d428f6    # 6.63f

    .line 363
    .line 364
    .line 365
    const/high16 v2, 0x41880000    # 17.0f

    .line 366
    .line 367
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 368
    .line 369
    .line 370
    const v0, 0x4162b852    # 14.17f

    .line 371
    .line 372
    .line 373
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 374
    .line 375
    .line 376
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 377
    .line 378
    .line 379
    const/high16 v0, 0x41400000    # 12.0f

    .line 380
    .line 381
    const/high16 v2, 0x40800000    # 4.0f

    .line 382
    .line 383
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 384
    .line 385
    .line 386
    const v17, 0x40b51eb8    # 5.66f

    .line 387
    .line 388
    .line 389
    const v18, 0x3f7d70a4    # 0.99f

    .line 390
    .line 391
    .line 392
    const v13, 0x406c28f6    # 3.69f

    .line 393
    .line 394
    .line 395
    const/4 v14, 0x0

    .line 396
    const v15, 0x40a3851f    # 5.11f

    .line 397
    .line 398
    .line 399
    const v16, 0x3eeb851f    # 0.46f

    .line 400
    .line 401
    .line 402
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 403
    .line 404
    .line 405
    const v0, 0x40fa3d71    # 7.82f

    .line 406
    .line 407
    .line 408
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 409
    .line 410
    .line 411
    const/high16 v0, 0x40000000    # 2.0f

    .line 412
    .line 413
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 414
    .line 415
    .line 416
    const/high16 v0, 0x41900000    # 18.0f

    .line 417
    .line 418
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 419
    .line 420
    .line 421
    const/high16 v0, 0x41200000    # 10.0f

    .line 422
    .line 423
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 424
    .line 425
    .line 426
    const v0, -0x3f5a8f5c    # -5.17f

    .line 427
    .line 428
    .line 429
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 430
    .line 431
    .line 432
    const/high16 v0, 0x40000000    # 2.0f

    .line 433
    .line 434
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 435
    .line 436
    .line 437
    const/high16 v0, 0x41900000    # 18.0f

    .line 438
    .line 439
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 440
    .line 441
    .line 442
    const v0, 0x404ae148    # 3.17f

    .line 443
    .line 444
    .line 445
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 446
    .line 447
    .line 448
    const v0, 0x3fe7ae14    # 1.81f

    .line 449
    .line 450
    .line 451
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 452
    .line 453
    .line 454
    const/high16 v17, 0x41a00000    # 20.0f

    .line 455
    .line 456
    const/high16 v18, 0x41800000    # 16.0f

    .line 457
    .line 458
    const v13, 0x419f5c29    # 19.92f

    .line 459
    .line 460
    .line 461
    const v14, 0x41855c29    # 16.67f

    .line 462
    .line 463
    .line 464
    const/high16 v15, 0x41a00000    # 20.0f

    .line 465
    .line 466
    const v16, 0x4182cccd    # 16.35f

    .line 467
    .line 468
    .line 469
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 470
    .line 471
    .line 472
    const/high16 v0, 0x40c00000    # 6.0f

    .line 473
    .line 474
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 475
    .line 476
    .line 477
    const/high16 v17, -0x3f000000    # -8.0f

    .line 478
    .line 479
    const/high16 v18, -0x3f800000    # -4.0f

    .line 480
    .line 481
    const/4 v13, 0x0

    .line 482
    const/high16 v14, -0x3fa00000    # -3.5f

    .line 483
    .line 484
    const v15, -0x3f9ae148    # -3.58f

    .line 485
    .line 486
    .line 487
    const/high16 v16, -0x3f800000    # -4.0f

    .line 488
    .line 489
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 490
    .line 491
    .line 492
    const v17, 0x40b8f5c3    # 5.78f

    .line 493
    .line 494
    .line 495
    const v18, 0x403ccccd    # 2.95f

    .line 496
    .line 497
    .line 498
    const v13, 0x4117ae14    # 9.48f

    .line 499
    .line 500
    .line 501
    const/high16 v14, 0x40000000    # 2.0f

    .line 502
    .line 503
    const v15, 0x40e7ae14    # 7.24f

    .line 504
    .line 505
    .line 506
    const v16, 0x400a3d71    # 2.16f

    .line 507
    .line 508
    .line 509
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 510
    .line 511
    .line 512
    const v0, 0x3fc3d70a    # 1.53f

    .line 513
    .line 514
    .line 515
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 516
    .line 517
    .line 518
    const/high16 v17, 0x41400000    # 12.0f

    .line 519
    .line 520
    const/high16 v18, 0x40800000    # 4.0f

    .line 521
    .line 522
    const v13, 0x4102b852    # 8.17f

    .line 523
    .line 524
    .line 525
    const v14, 0x40866666    # 4.2f

    .line 526
    .line 527
    .line 528
    const v15, 0x4119999a    # 9.6f

    .line 529
    .line 530
    .line 531
    const/high16 v16, 0x40800000    # 4.0f

    .line 532
    .line 533
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 534
    .line 535
    .line 536
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 537
    .line 538
    .line 539
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 540
    .line 541
    .line 542
    move-result-object v2

    .line 543
    const/16 v16, 0x3800

    .line 544
    .line 545
    const/16 v17, 0x0

    .line 546
    .line 547
    const/high16 v6, 0x3f800000    # 1.0f

    .line 548
    .line 549
    const/high16 v8, 0x3f800000    # 1.0f

    .line 550
    .line 551
    const/4 v7, 0x0

    .line 552
    const/high16 v9, 0x3f800000    # 1.0f

    .line 553
    .line 554
    const/high16 v12, 0x3f800000    # 1.0f

    .line 555
    .line 556
    const/4 v13, 0x0

    .line 557
    const/4 v14, 0x0

    .line 558
    const/4 v15, 0x0

    .line 559
    const-string v4, ""

    .line 560
    .line 561
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 562
    .line 563
    .line 564
    move-result-object v0

    .line 565
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 566
    .line 567
    .line 568
    move-result-object v0

    .line 569
    sput-object v0, Landroidx/compose/material/icons/outlined/NoTransferKt;->_noTransfer:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 570
    .line 571
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 572
    .line 573
    .line 574
    return-object v0
.end method
