.class public final Landroidx/compose/material/icons/rounded/CottageKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_cottage",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "Cottage",
        "Landroidx/compose/material/icons/Icons$Rounded;",
        "getCottage",
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
        "SMAP\nCottage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Cottage.kt\nandroidx/compose/material/icons/rounded/CottageKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,73:1\n212#2,12:74\n233#2,18:87\n253#2:124\n174#3:86\n705#4,2:105\n717#4,2:107\n719#4,11:113\n72#5,4:109\n*S KotlinDebug\n*F\n+ 1 Cottage.kt\nandroidx/compose/material/icons/rounded/CottageKt\n*L\n29#1:74,12\n30#1:87,18\n30#1:124\n29#1:86\n30#1:105,2\n30#1:107,2\n30#1:113,11\n30#1:109,4\n*E\n"
    }
.end annotation


# static fields
.field private static _cottage:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getCottage(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/CottageKt;->_cottage:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.Cottage"

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
    const v0, 0x41b31eb8    # 22.39f

    .line 71
    .line 72
    .line 73
    const v2, 0x41430a3d    # 12.19f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v17, -0x41bd70a4    # -0.19f

    .line 80
    .line 81
    .line 82
    const v18, -0x404ccccd    # -1.4f

    .line 83
    .line 84
    .line 85
    const v13, 0x3eae147b    # 0.34f

    .line 86
    .line 87
    .line 88
    const v14, -0x411eb852    # -0.44f

    .line 89
    .line 90
    .line 91
    const/high16 v15, 0x3e800000    # 0.25f

    .line 92
    .line 93
    const v16, -0x40770a3d    # -1.07f

    .line 94
    .line 95
    .line 96
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 97
    .line 98
    .line 99
    const v0, -0x3ee66666    # -9.6f

    .line 100
    .line 101
    .line 102
    const v2, -0x3f1570a4    # -7.33f

    .line 103
    .line 104
    .line 105
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 106
    .line 107
    .line 108
    const v17, -0x40651eb8    # -1.21f

    .line 109
    .line 110
    .line 111
    const/16 v18, 0x0

    .line 112
    .line 113
    const v13, -0x4147ae14    # -0.36f

    .line 114
    .line 115
    .line 116
    const v14, -0x4175c28f    # -0.27f

    .line 117
    .line 118
    .line 119
    const v15, -0x40a3d70a    # -0.86f

    .line 120
    .line 121
    .line 122
    const v16, -0x4175c28f    # -0.27f

    .line 123
    .line 124
    .line 125
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 126
    .line 127
    .line 128
    const v0, 0x40f28f5c    # 7.58f

    .line 129
    .line 130
    .line 131
    const/high16 v2, 0x40c00000    # 6.0f

    .line 132
    .line 133
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 134
    .line 135
    .line 136
    const/high16 v0, 0x40e00000    # 7.0f

    .line 137
    .line 138
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 139
    .line 140
    .line 141
    const/high16 v17, -0x40800000    # -1.0f

    .line 142
    .line 143
    const/high16 v18, -0x40800000    # -1.0f

    .line 144
    .line 145
    const/4 v13, 0x0

    .line 146
    const v14, -0x40f33333    # -0.55f

    .line 147
    .line 148
    .line 149
    const v15, -0x4119999a    # -0.45f

    .line 150
    .line 151
    .line 152
    const/high16 v16, -0x40800000    # -1.0f

    .line 153
    .line 154
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 155
    .line 156
    .line 157
    const v0, 0x40ce6666    # 6.45f

    .line 158
    .line 159
    .line 160
    const/high16 v2, 0x40e00000    # 7.0f

    .line 161
    .line 162
    const/high16 v4, 0x40800000    # 4.0f

    .line 163
    .line 164
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 165
    .line 166
    .line 167
    const v0, 0x40070a3d    # 2.11f

    .line 168
    .line 169
    .line 170
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 171
    .line 172
    .line 173
    const v0, -0x3ff28f5c    # -2.21f

    .line 174
    .line 175
    .line 176
    const v2, 0x3fd70a3d    # 1.68f

    .line 177
    .line 178
    .line 179
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 180
    .line 181
    .line 182
    const v17, -0x41bd70a4    # -0.19f

    .line 183
    .line 184
    .line 185
    const v18, 0x3fb33333    # 1.4f

    .line 186
    .line 187
    .line 188
    const v13, -0x411eb852    # -0.44f

    .line 189
    .line 190
    .line 191
    const v14, 0x3ea8f5c3    # 0.33f

    .line 192
    .line 193
    .line 194
    const v15, -0x40fae148    # -0.52f

    .line 195
    .line 196
    .line 197
    const v16, 0x3f75c28f    # 0.96f

    .line 198
    .line 199
    .line 200
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 201
    .line 202
    .line 203
    const v17, 0x3fb33333    # 1.4f

    .line 204
    .line 205
    .line 206
    const v18, 0x3e428f5c    # 0.19f

    .line 207
    .line 208
    .line 209
    const v13, 0x3eae147b    # 0.34f

    .line 210
    .line 211
    .line 212
    const v14, 0x3ee147ae    # 0.44f

    .line 213
    .line 214
    .line 215
    const v15, 0x3f75c28f    # 0.96f

    .line 216
    .line 217
    .line 218
    const v16, 0x3f051eb8    # 0.52f

    .line 219
    .line 220
    .line 221
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 222
    .line 223
    .line 224
    const v0, 0x4139eb85    # 11.62f

    .line 225
    .line 226
    .line 227
    const/high16 v2, 0x40800000    # 4.0f

    .line 228
    .line 229
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 230
    .line 231
    .line 232
    const/high16 v0, 0x41a00000    # 20.0f

    .line 233
    .line 234
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 235
    .line 236
    .line 237
    const/high16 v17, 0x3f800000    # 1.0f

    .line 238
    .line 239
    const/high16 v18, 0x3f800000    # 1.0f

    .line 240
    .line 241
    const/4 v13, 0x0

    .line 242
    const v14, 0x3f0ccccd    # 0.55f

    .line 243
    .line 244
    .line 245
    const v15, 0x3ee66666    # 0.45f

    .line 246
    .line 247
    .line 248
    const/high16 v16, 0x3f800000    # 1.0f

    .line 249
    .line 250
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 251
    .line 252
    .line 253
    const/high16 v0, 0x40c00000    # 6.0f

    .line 254
    .line 255
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 256
    .line 257
    .line 258
    const/high16 v0, -0x3f600000    # -5.0f

    .line 259
    .line 260
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 261
    .line 262
    .line 263
    const/high16 v18, -0x40800000    # -1.0f

    .line 264
    .line 265
    const v14, -0x40f33333    # -0.55f

    .line 266
    .line 267
    .line 268
    const/high16 v16, -0x40800000    # -1.0f

    .line 269
    .line 270
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 271
    .line 272
    .line 273
    const v0, 0x3ee66666    # 0.45f

    .line 274
    .line 275
    .line 276
    const/high16 v2, 0x3f800000    # 1.0f

    .line 277
    .line 278
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 279
    .line 280
    .line 281
    const/high16 v0, 0x40a00000    # 5.0f

    .line 282
    .line 283
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 284
    .line 285
    .line 286
    const/high16 v0, 0x40c00000    # 6.0f

    .line 287
    .line 288
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 289
    .line 290
    .line 291
    const v13, 0x3f0ccccd    # 0.55f

    .line 292
    .line 293
    .line 294
    const/4 v14, 0x0

    .line 295
    const/high16 v15, 0x3f800000    # 1.0f

    .line 296
    .line 297
    const v16, -0x4119999a    # -0.45f

    .line 298
    .line 299
    .line 300
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 301
    .line 302
    .line 303
    const v0, -0x3ef9eb85    # -8.38f

    .line 304
    .line 305
    .line 306
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 307
    .line 308
    .line 309
    const v0, 0x3f7d70a4    # 0.99f

    .line 310
    .line 311
    .line 312
    const v2, 0x3f428f5c    # 0.76f

    .line 313
    .line 314
    .line 315
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 316
    .line 317
    .line 318
    const v17, 0x41b31eb8    # 22.39f

    .line 319
    .line 320
    .line 321
    const v18, 0x41430a3d    # 12.19f

    .line 322
    .line 323
    .line 324
    const v13, 0x41ab70a4    # 21.43f

    .line 325
    .line 326
    .line 327
    const v14, 0x414b851f    # 12.72f

    .line 328
    .line 329
    .line 330
    const v15, 0x41b07ae1    # 22.06f

    .line 331
    .line 332
    .line 333
    const v16, 0x414a147b    # 12.63f

    .line 334
    .line 335
    .line 336
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 337
    .line 338
    .line 339
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 340
    .line 341
    .line 342
    const v0, 0x40a8a3d7    # 5.27f

    .line 343
    .line 344
    .line 345
    const/high16 v2, 0x40a00000    # 5.0f

    .line 346
    .line 347
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 348
    .line 349
    .line 350
    const v17, -0x4099999a    # -0.9f

    .line 351
    .line 352
    .line 353
    const v18, -0x40466666    # -1.45f

    .line 354
    .line 355
    .line 356
    const v13, -0x40c28f5c    # -0.74f

    .line 357
    .line 358
    .line 359
    const/4 v14, 0x0

    .line 360
    const v15, -0x405eb852    # -1.26f

    .line 361
    .line 362
    .line 363
    const v16, -0x40b33333    # -0.8f

    .line 364
    .line 365
    .line 366
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 367
    .line 368
    .line 369
    const/high16 v17, 0x40e00000    # 7.0f

    .line 370
    .line 371
    const/high16 v18, 0x40000000    # 2.0f

    .line 372
    .line 373
    const v13, 0x409c7ae1    # 4.89f

    .line 374
    .line 375
    .line 376
    const v14, 0x4027ae14    # 2.62f

    .line 377
    .line 378
    .line 379
    const v15, 0x40bbd70a    # 5.87f

    .line 380
    .line 381
    .line 382
    const/high16 v16, 0x40000000    # 2.0f

    .line 383
    .line 384
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 385
    .line 386
    .line 387
    const v17, 0x3f63d70a    # 0.89f

    .line 388
    .line 389
    .line 390
    const v18, -0x40f851ec    # -0.53f

    .line 391
    .line 392
    .line 393
    const v13, 0x3ec28f5c    # 0.38f

    .line 394
    .line 395
    .line 396
    const/4 v14, 0x0

    .line 397
    const v15, 0x3f3851ec    # 0.72f

    .line 398
    .line 399
    .line 400
    const v16, -0x419eb852    # -0.22f

    .line 401
    .line 402
    .line 403
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 404
    .line 405
    .line 406
    const v17, 0x410bae14    # 8.73f

    .line 407
    .line 408
    .line 409
    const/high16 v18, 0x3f800000    # 1.0f

    .line 410
    .line 411
    const v13, 0x4100a3d7    # 8.04f

    .line 412
    .line 413
    .line 414
    const v14, 0x3f947ae1    # 1.16f

    .line 415
    .line 416
    .line 417
    const v15, 0x41063d71    # 8.39f

    .line 418
    .line 419
    .line 420
    const/high16 v16, 0x3f800000    # 1.0f

    .line 421
    .line 422
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 423
    .line 424
    .line 425
    const v17, 0x3f666666    # 0.9f

    .line 426
    .line 427
    .line 428
    const v18, 0x3fb9999a    # 1.45f

    .line 429
    .line 430
    .line 431
    const v13, 0x3f3d70a4    # 0.74f

    .line 432
    .line 433
    .line 434
    const/4 v14, 0x0

    .line 435
    const v15, 0x3fa147ae    # 1.26f

    .line 436
    .line 437
    .line 438
    const v16, 0x3f4ccccd    # 0.8f

    .line 439
    .line 440
    .line 441
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 442
    .line 443
    .line 444
    const/high16 v17, 0x40e00000    # 7.0f

    .line 445
    .line 446
    const/high16 v18, 0x40800000    # 4.0f

    .line 447
    .line 448
    const v13, 0x4111c28f    # 9.11f

    .line 449
    .line 450
    .line 451
    const v14, 0x405851ec    # 3.38f

    .line 452
    .line 453
    .line 454
    const v15, 0x4102147b    # 8.13f

    .line 455
    .line 456
    .line 457
    const/high16 v16, 0x40800000    # 4.0f

    .line 458
    .line 459
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 460
    .line 461
    .line 462
    const v17, 0x40c3851f    # 6.11f

    .line 463
    .line 464
    .line 465
    const v18, 0x4090f5c3    # 4.53f

    .line 466
    .line 467
    .line 468
    const v13, 0x40d3d70a    # 6.62f

    .line 469
    .line 470
    .line 471
    const/high16 v14, 0x40800000    # 4.0f

    .line 472
    .line 473
    const v15, 0x40c8f5c3    # 6.28f

    .line 474
    .line 475
    .line 476
    const v16, 0x40870a3d    # 4.22f

    .line 477
    .line 478
    .line 479
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 480
    .line 481
    .line 482
    const v17, 0x40a8a3d7    # 5.27f

    .line 483
    .line 484
    .line 485
    const/high16 v18, 0x40a00000    # 5.0f

    .line 486
    .line 487
    const v13, 0x40beb852    # 5.96f

    .line 488
    .line 489
    .line 490
    const v14, 0x409ae148    # 4.84f

    .line 491
    .line 492
    .line 493
    const v15, 0x40b3851f    # 5.61f

    .line 494
    .line 495
    .line 496
    const/high16 v16, 0x40a00000    # 5.0f

    .line 497
    .line 498
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 499
    .line 500
    .line 501
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 502
    .line 503
    .line 504
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 505
    .line 506
    .line 507
    move-result-object v2

    .line 508
    const/16 v16, 0x3800

    .line 509
    .line 510
    const/16 v17, 0x0

    .line 511
    .line 512
    const/high16 v6, 0x3f800000    # 1.0f

    .line 513
    .line 514
    const/high16 v8, 0x3f800000    # 1.0f

    .line 515
    .line 516
    const/4 v7, 0x0

    .line 517
    const/high16 v9, 0x3f800000    # 1.0f

    .line 518
    .line 519
    const/high16 v12, 0x3f800000    # 1.0f

    .line 520
    .line 521
    const/4 v13, 0x0

    .line 522
    const/4 v14, 0x0

    .line 523
    const/4 v15, 0x0

    .line 524
    const-string v4, ""

    .line 525
    .line 526
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 527
    .line 528
    .line 529
    move-result-object v0

    .line 530
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 531
    .line 532
    .line 533
    move-result-object v0

    .line 534
    sput-object v0, Landroidx/compose/material/icons/rounded/CottageKt;->_cottage:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 535
    .line 536
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 537
    .line 538
    .line 539
    return-object v0
.end method
