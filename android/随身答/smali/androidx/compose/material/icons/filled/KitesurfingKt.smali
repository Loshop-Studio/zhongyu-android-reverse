.class public final Landroidx/compose/material/icons/filled/KitesurfingKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_kitesurfing",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "Kitesurfing",
        "Landroidx/compose/material/icons/Icons$Filled;",
        "getKitesurfing",
        "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;",
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
        "SMAP\nKitesurfing.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Kitesurfing.kt\nandroidx/compose/material/icons/filled/KitesurfingKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,94:1\n212#2,12:95\n233#2,18:108\n253#2:145\n174#3:107\n705#4,2:126\n717#4,2:128\n719#4,11:134\n72#5,4:130\n*S KotlinDebug\n*F\n+ 1 Kitesurfing.kt\nandroidx/compose/material/icons/filled/KitesurfingKt\n*L\n29#1:95,12\n30#1:108,18\n30#1:145\n29#1:107\n30#1:126,2\n30#1:128,2\n30#1:134,11\n30#1:130,4\n*E\n"
    }
.end annotation


# static fields
.field private static _kitesurfing:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getKitesurfing(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/filled/KitesurfingKt;->_kitesurfing:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Filled.Kitesurfing"

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
    const/high16 v0, 0x40400000    # 3.0f

    .line 71
    .line 72
    const/high16 v2, 0x40c00000    # 6.0f

    .line 73
    .line 74
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v17, 0x40000000    # 2.0f

    .line 78
    .line 79
    const/high16 v18, -0x40000000    # -2.0f

    .line 80
    .line 81
    const/4 v13, 0x0

    .line 82
    const v14, -0x40733333    # -1.1f

    .line 83
    .line 84
    .line 85
    const v15, 0x3f666666    # 0.9f

    .line 86
    .line 87
    .line 88
    const/high16 v16, -0x40000000    # -2.0f

    .line 89
    .line 90
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 91
    .line 92
    .line 93
    const v0, 0x3f666666    # 0.9f

    .line 94
    .line 95
    .line 96
    const/high16 v2, 0x40000000    # 2.0f

    .line 97
    .line 98
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 99
    .line 100
    .line 101
    const/high16 v17, -0x40000000    # -2.0f

    .line 102
    .line 103
    const/high16 v18, 0x40000000    # 2.0f

    .line 104
    .line 105
    const v14, 0x3f8ccccd    # 1.1f

    .line 106
    .line 107
    .line 108
    const v15, -0x4099999a    # -0.9f

    .line 109
    .line 110
    .line 111
    const/high16 v16, 0x40000000    # 2.0f

    .line 112
    .line 113
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 114
    .line 115
    .line 116
    const v0, 0x40833333    # 4.1f

    .line 117
    .line 118
    .line 119
    const/high16 v2, 0x40400000    # 3.0f

    .line 120
    .line 121
    const/high16 v4, 0x40c00000    # 6.0f

    .line 122
    .line 123
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 124
    .line 125
    .line 126
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 127
    .line 128
    .line 129
    const v0, 0x41a07ae1    # 20.06f

    .line 130
    .line 131
    .line 132
    const/high16 v2, 0x3f800000    # 1.0f

    .line 133
    .line 134
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 135
    .line 136
    .line 137
    const v0, -0x3ff851ec    # -2.12f

    .line 138
    .line 139
    .line 140
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 141
    .line 142
    .line 143
    const/high16 v0, 0x41780000    # 15.5f

    .line 144
    .line 145
    const v2, 0x405c28f6    # 3.44f

    .line 146
    .line 147
    .line 148
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 149
    .line 150
    .line 151
    const v0, 0x3f87ae14    # 1.06f

    .line 152
    .line 153
    .line 154
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 155
    .line 156
    .line 157
    const v0, 0x41a07ae1    # 20.06f

    .line 158
    .line 159
    .line 160
    const/high16 v2, 0x3f800000    # 1.0f

    .line 161
    .line 162
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 163
    .line 164
    .line 165
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 166
    .line 167
    .line 168
    const/high16 v0, 0x41b80000    # 23.0f

    .line 169
    .line 170
    const/high16 v2, 0x41b00000    # 22.0f

    .line 171
    .line 172
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 173
    .line 174
    .line 175
    const/high16 v0, -0x40000000    # -2.0f

    .line 176
    .line 177
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 178
    .line 179
    .line 180
    const/high16 v0, -0x40800000    # -1.0f

    .line 181
    .line 182
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 183
    .line 184
    .line 185
    const/high16 v17, -0x3fc00000    # -3.0f

    .line 186
    .line 187
    const/high16 v18, -0x40800000    # -1.0f

    .line 188
    .line 189
    const v13, -0x407ae148    # -1.04f

    .line 190
    .line 191
    .line 192
    const/4 v14, 0x0

    .line 193
    const v15, -0x3ffae148    # -2.08f

    .line 194
    .line 195
    .line 196
    const v16, -0x414ccccd    # -0.35f

    .line 197
    .line 198
    .line 199
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 200
    .line 201
    .line 202
    const/high16 v17, -0x3f400000    # -6.0f

    .line 203
    .line 204
    const/16 v18, 0x0

    .line 205
    .line 206
    const v13, -0x4015c28f    # -1.83f

    .line 207
    .line 208
    .line 209
    const v14, 0x3fa66666    # 1.3f

    .line 210
    .line 211
    .line 212
    const v15, -0x3f7a8f5c    # -4.17f

    .line 213
    .line 214
    .line 215
    const v16, 0x3fa66666    # 1.3f

    .line 216
    .line 217
    .line 218
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 219
    .line 220
    .line 221
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 222
    .line 223
    .line 224
    const/high16 v17, -0x3fc00000    # -3.0f

    .line 225
    .line 226
    const/high16 v18, 0x3f800000    # 1.0f

    .line 227
    .line 228
    const v13, -0x40970a3d    # -0.91f

    .line 229
    .line 230
    .line 231
    const v14, 0x3f266666    # 0.65f

    .line 232
    .line 233
    .line 234
    const v15, -0x40051eb8    # -1.96f

    .line 235
    .line 236
    .line 237
    const/high16 v16, 0x3f800000    # 1.0f

    .line 238
    .line 239
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 240
    .line 241
    .line 242
    const/high16 v0, 0x40000000    # 2.0f

    .line 243
    .line 244
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 245
    .line 246
    .line 247
    const/4 v0, 0x0

    .line 248
    const/high16 v2, 0x40000000    # 2.0f

    .line 249
    .line 250
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 251
    .line 252
    .line 253
    const/high16 v0, 0x3f800000    # 1.0f

    .line 254
    .line 255
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 256
    .line 257
    .line 258
    const/high16 v17, 0x40400000    # 3.0f

    .line 259
    .line 260
    const/high16 v18, -0x40c00000    # -0.75f

    .line 261
    .line 262
    const v13, 0x3f83d70a    # 1.03f

    .line 263
    .line 264
    .line 265
    const/4 v14, 0x0

    .line 266
    const v15, 0x40033333    # 2.05f

    .line 267
    .line 268
    .line 269
    const/high16 v16, -0x41800000    # -0.25f

    .line 270
    .line 271
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 272
    .line 273
    .line 274
    const/high16 v17, 0x40c00000    # 6.0f

    .line 275
    .line 276
    const/16 v18, 0x0

    .line 277
    .line 278
    const v13, 0x3ff1eb85    # 1.89f

    .line 279
    .line 280
    .line 281
    const/high16 v14, 0x3f800000    # 1.0f

    .line 282
    .line 283
    const v15, 0x4083851f    # 4.11f

    .line 284
    .line 285
    .line 286
    const/high16 v16, 0x3f800000    # 1.0f

    .line 287
    .line 288
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 289
    .line 290
    .line 291
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 292
    .line 293
    .line 294
    const/4 v0, 0x0

    .line 295
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 296
    .line 297
    .line 298
    const/high16 v17, 0x40400000    # 3.0f

    .line 299
    .line 300
    const/high16 v18, 0x3f400000    # 0.75f

    .line 301
    .line 302
    const v13, 0x3f733333    # 0.95f

    .line 303
    .line 304
    .line 305
    const/high16 v14, 0x3f000000    # 0.5f

    .line 306
    .line 307
    const v15, 0x3ffc28f6    # 1.97f

    .line 308
    .line 309
    .line 310
    const/high16 v16, 0x3f400000    # 0.75f

    .line 311
    .line 312
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 313
    .line 314
    .line 315
    const/high16 v0, 0x41b00000    # 22.0f

    .line 316
    .line 317
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 318
    .line 319
    .line 320
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 321
    .line 322
    .line 323
    const/high16 v0, 0x41a80000    # 21.0f

    .line 324
    .line 325
    const v2, 0x41547ae1    # 13.28f

    .line 326
    .line 327
    .line 328
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 329
    .line 330
    .line 331
    const v17, -0x3f5eb852    # -5.04f

    .line 332
    .line 333
    .line 334
    const v18, 0x40b28f5c    # 5.58f

    .line 335
    .line 336
    .line 337
    const/4 v13, 0x0

    .line 338
    const v14, 0x3fb851ec    # 1.44f

    .line 339
    .line 340
    .line 341
    const v15, -0x3ff3d70a    # -2.19f

    .line 342
    .line 343
    .line 344
    const v16, 0x4067ae14    # 3.62f

    .line 345
    .line 346
    .line 347
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 348
    .line 349
    .line 350
    const/high16 v17, 0x41700000    # 15.0f

    .line 351
    .line 352
    const/high16 v18, 0x41980000    # 19.0f

    .line 353
    .line 354
    const v13, 0x417a6666    # 15.65f

    .line 355
    .line 356
    .line 357
    const v14, 0x4197999a    # 18.95f

    .line 358
    .line 359
    .line 360
    const v15, 0x417547ae    # 15.33f

    .line 361
    .line 362
    .line 363
    const/high16 v16, 0x41980000    # 19.0f

    .line 364
    .line 365
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 366
    .line 367
    .line 368
    const/high16 v17, -0x3fc00000    # -3.0f

    .line 369
    .line 370
    const/high16 v18, -0x40400000    # -1.5f

    .line 371
    .line 372
    const v13, -0x40666666    # -1.2f

    .line 373
    .line 374
    .line 375
    const/4 v14, 0x0

    .line 376
    const v15, -0x3feeb852    # -2.27f

    .line 377
    .line 378
    .line 379
    const v16, -0x40d70a3d    # -0.66f

    .line 380
    .line 381
    .line 382
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 383
    .line 384
    .line 385
    const/high16 v18, 0x3fc00000    # 1.5f

    .line 386
    .line 387
    const v13, -0x40c51eb8    # -0.73f

    .line 388
    .line 389
    .line 390
    const v14, 0x3f570a3d    # 0.84f

    .line 391
    .line 392
    .line 393
    const v15, -0x4019999a    # -1.8f

    .line 394
    .line 395
    .line 396
    const/high16 v16, 0x3fc00000    # 1.5f

    .line 397
    .line 398
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 399
    .line 400
    .line 401
    const v17, -0x3fe0a3d7    # -2.49f

    .line 402
    .line 403
    .line 404
    const v18, -0x40828f5c    # -0.99f

    .line 405
    .line 406
    .line 407
    const v13, -0x408f5c29    # -0.94f

    .line 408
    .line 409
    .line 410
    const/4 v14, 0x0

    .line 411
    const v15, -0x401851ec    # -1.81f

    .line 412
    .line 413
    .line 414
    const v16, -0x412e147b    # -0.41f

    .line 415
    .line 416
    .line 417
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 418
    .line 419
    .line 420
    const v17, 0x3fbeb852    # 1.49f

    .line 421
    .line 422
    .line 423
    const v18, -0x406a3d71    # -1.17f

    .line 424
    .line 425
    .line 426
    const v13, 0x3eeb851f    # 0.46f

    .line 427
    .line 428
    .line 429
    const v14, -0x413851ec    # -0.39f

    .line 430
    .line 431
    .line 432
    const v15, 0x3f75c28f    # 0.96f

    .line 433
    .line 434
    .line 435
    const v16, -0x40b851ec    # -0.78f

    .line 436
    .line 437
    .line 438
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 439
    .line 440
    .line 441
    const v0, -0x4039999a    # -1.55f

    .line 442
    .line 443
    .line 444
    const v2, -0x3fc1eb85    # -2.97f

    .line 445
    .line 446
    .line 447
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 448
    .line 449
    .line 450
    const/high16 v17, 0x40c00000    # 6.0f

    .line 451
    .line 452
    const/high16 v18, 0x41400000    # 12.0f

    .line 453
    .line 454
    const v13, 0x40c4cccd    # 6.15f

    .line 455
    .line 456
    .line 457
    const v14, 0x4154cccd    # 13.3f

    .line 458
    .line 459
    .line 460
    const/high16 v15, 0x40c00000    # 6.0f

    .line 461
    .line 462
    const v16, 0x414a3d71    # 12.64f

    .line 463
    .line 464
    .line 465
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 466
    .line 467
    .line 468
    const/high16 v0, 0x41000000    # 8.0f

    .line 469
    .line 470
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 471
    .line 472
    .line 473
    const/high16 v17, 0x40000000    # 2.0f

    .line 474
    .line 475
    const/high16 v18, -0x40000000    # -2.0f

    .line 476
    .line 477
    const/4 v13, 0x0

    .line 478
    const v14, -0x40733333    # -1.1f

    .line 479
    .line 480
    .line 481
    const v15, 0x3f666666    # 0.9f

    .line 482
    .line 483
    .line 484
    const/high16 v16, -0x40000000    # -2.0f

    .line 485
    .line 486
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 487
    .line 488
    .line 489
    const/high16 v0, 0x40400000    # 3.0f

    .line 490
    .line 491
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 492
    .line 493
    .line 494
    const v17, 0x40628f5c    # 3.54f

    .line 495
    .line 496
    .line 497
    const v18, -0x40451eb8    # -1.46f

    .line 498
    .line 499
    .line 500
    const v13, 0x3fb0a3d7    # 1.38f

    .line 501
    .line 502
    .line 503
    const/4 v14, 0x0

    .line 504
    const v15, 0x402851ec    # 2.63f

    .line 505
    .line 506
    .line 507
    const v16, -0x40f0a3d7    # -0.56f

    .line 508
    .line 509
    .line 510
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 511
    .line 512
    .line 513
    const v0, 0x3fb47ae1    # 1.41f

    .line 514
    .line 515
    .line 516
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 517
    .line 518
    .line 519
    const/high16 v17, 0x41300000    # 11.0f

    .line 520
    .line 521
    const/high16 v18, 0x41000000    # 8.0f

    .line 522
    .line 523
    const v13, 0x416ae148    # 14.68f

    .line 524
    .line 525
    .line 526
    const v14, 0x40e6b852    # 7.21f

    .line 527
    .line 528
    .line 529
    const v15, 0x414ee148    # 12.93f

    .line 530
    .line 531
    .line 532
    const/high16 v16, 0x41000000    # 8.0f

    .line 533
    .line 534
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 535
    .line 536
    .line 537
    const v0, 0x4119999a    # 9.6f

    .line 538
    .line 539
    .line 540
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 541
    .line 542
    .line 543
    const/high16 v0, 0x40600000    # 3.5f

    .line 544
    .line 545
    const/4 v2, 0x0

    .line 546
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 547
    .line 548
    .line 549
    const v0, 0x40333333    # 2.8f

    .line 550
    .line 551
    .line 552
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 553
    .line 554
    .line 555
    const v0, 0x3fd851ec    # 1.69f

    .line 556
    .line 557
    .line 558
    const v2, 0x3ff0a3d7    # 1.88f

    .line 559
    .line 560
    .line 561
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 562
    .line 563
    .line 564
    const v17, 0x40a1eb85    # 5.06f

    .line 565
    .line 566
    .line 567
    const v18, -0x404f5c29    # -1.38f

    .line 568
    .line 569
    .line 570
    const v13, 0x3ff9999a    # 1.95f

    .line 571
    .line 572
    .line 573
    const v14, -0x40a8f5c3    # -0.84f

    .line 574
    .line 575
    .line 576
    const v15, 0x407147ae    # 3.77f

    .line 577
    .line 578
    .line 579
    const v16, -0x404f5c29    # -1.38f

    .line 580
    .line 581
    .line 582
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 583
    .line 584
    .line 585
    const/high16 v17, 0x41a80000    # 21.0f

    .line 586
    .line 587
    const v18, 0x41547ae1    # 13.28f

    .line 588
    .line 589
    .line 590
    const v13, 0x419feb85    # 19.99f

    .line 591
    .line 592
    .line 593
    const/high16 v14, 0x41400000    # 12.0f

    .line 594
    .line 595
    const/high16 v15, 0x41a80000    # 21.0f

    .line 596
    .line 597
    const/high16 v16, 0x41440000    # 12.25f

    .line 598
    .line 599
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 600
    .line 601
    .line 602
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 603
    .line 604
    .line 605
    const v0, 0x41433333    # 12.2f

    .line 606
    .line 607
    .line 608
    const v2, 0x416451ec    # 14.27f

    .line 609
    .line 610
    .line 611
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 612
    .line 613
    .line 614
    const v0, -0x40cccccd    # -0.7f

    .line 615
    .line 616
    .line 617
    const v2, -0x40bae148    # -0.77f

    .line 618
    .line 619
    .line 620
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 621
    .line 622
    .line 623
    const/high16 v0, 0x41100000    # 9.0f

    .line 624
    .line 625
    const v2, 0x4159999a    # 13.6f

    .line 626
    .line 627
    .line 628
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 629
    .line 630
    .line 631
    const v0, 0x3f547ae1    # 0.83f

    .line 632
    .line 633
    .line 634
    const v2, 0x4000a3d7    # 2.01f

    .line 635
    .line 636
    .line 637
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 638
    .line 639
    .line 640
    const v17, 0x41433333    # 12.2f

    .line 641
    .line 642
    .line 643
    const v18, 0x416451ec    # 14.27f

    .line 644
    .line 645
    .line 646
    const v13, 0x4126b852    # 10.42f

    .line 647
    .line 648
    .line 649
    const v14, 0x4173ae14    # 15.23f

    .line 650
    .line 651
    .line 652
    const v15, 0x413a3d71    # 11.64f

    .line 653
    .line 654
    .line 655
    const v16, 0x4168cccd    # 14.55f

    .line 656
    .line 657
    .line 658
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 659
    .line 660
    .line 661
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 662
    .line 663
    .line 664
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 665
    .line 666
    .line 667
    move-result-object v2

    .line 668
    const/16 v16, 0x3800

    .line 669
    .line 670
    const/16 v17, 0x0

    .line 671
    .line 672
    const/high16 v6, 0x3f800000    # 1.0f

    .line 673
    .line 674
    const/high16 v8, 0x3f800000    # 1.0f

    .line 675
    .line 676
    const/4 v7, 0x0

    .line 677
    const/high16 v9, 0x3f800000    # 1.0f

    .line 678
    .line 679
    const/high16 v12, 0x3f800000    # 1.0f

    .line 680
    .line 681
    const/4 v13, 0x0

    .line 682
    const/4 v14, 0x0

    .line 683
    const/4 v15, 0x0

    .line 684
    const-string v4, ""

    .line 685
    .line 686
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 687
    .line 688
    .line 689
    move-result-object v0

    .line 690
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 691
    .line 692
    .line 693
    move-result-object v0

    .line 694
    sput-object v0, Landroidx/compose/material/icons/filled/KitesurfingKt;->_kitesurfing:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 695
    .line 696
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 697
    .line 698
    .line 699
    return-object v0
.end method
