.class public final Landroidx/compose/material/icons/rounded/ScoreKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_score",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "Score",
        "Landroidx/compose/material/icons/Icons$Rounded;",
        "getScore",
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
        "SMAP\nScore.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Score.kt\nandroidx/compose/material/icons/rounded/ScoreKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,98:1\n212#2,12:99\n233#2,18:112\n253#2:149\n174#3:111\n705#4,2:130\n717#4,2:132\n719#4,11:138\n72#5,4:134\n*S KotlinDebug\n*F\n+ 1 Score.kt\nandroidx/compose/material/icons/rounded/ScoreKt\n*L\n29#1:99,12\n30#1:112,18\n30#1:149\n29#1:111\n30#1:130,2\n30#1:132,2\n30#1:138,11\n30#1:134,4\n*E\n"
    }
.end annotation


# static fields
.field private static _score:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getScore(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/ScoreKt;->_score:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.Score"

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
    const/high16 v0, 0x41980000    # 19.0f

    .line 71
    .line 72
    const/high16 v2, 0x40400000    # 3.0f

    .line 73
    .line 74
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v0, 0x40400000    # 3.0f

    .line 78
    .line 79
    const/high16 v2, 0x40a00000    # 5.0f

    .line 80
    .line 81
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 82
    .line 83
    .line 84
    const/high16 v17, -0x40000000    # -2.0f

    .line 85
    .line 86
    const/high16 v18, 0x40000000    # 2.0f

    .line 87
    .line 88
    const v13, -0x40733333    # -1.1f

    .line 89
    .line 90
    .line 91
    const/4 v14, 0x0

    .line 92
    const/high16 v15, -0x40000000    # -2.0f

    .line 93
    .line 94
    const v16, 0x3f666666    # 0.9f

    .line 95
    .line 96
    .line 97
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 98
    .line 99
    .line 100
    const/high16 v0, 0x41600000    # 14.0f

    .line 101
    .line 102
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 103
    .line 104
    .line 105
    const/high16 v17, 0x40000000    # 2.0f

    .line 106
    .line 107
    const/4 v13, 0x0

    .line 108
    const v14, 0x3f8ccccd    # 1.1f

    .line 109
    .line 110
    .line 111
    const v15, 0x3f666666    # 0.9f

    .line 112
    .line 113
    .line 114
    const/high16 v16, 0x40000000    # 2.0f

    .line 115
    .line 116
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 117
    .line 118
    .line 119
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 120
    .line 121
    .line 122
    const/high16 v18, -0x40000000    # -2.0f

    .line 123
    .line 124
    const v13, 0x3f8ccccd    # 1.1f

    .line 125
    .line 126
    .line 127
    const/4 v14, 0x0

    .line 128
    const/high16 v15, 0x40000000    # 2.0f

    .line 129
    .line 130
    const v16, -0x4099999a    # -0.9f

    .line 131
    .line 132
    .line 133
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 134
    .line 135
    .line 136
    const/high16 v0, 0x41a80000    # 21.0f

    .line 137
    .line 138
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 139
    .line 140
    .line 141
    const/high16 v17, -0x40000000    # -2.0f

    .line 142
    .line 143
    const/4 v13, 0x0

    .line 144
    const v14, -0x40733333    # -1.1f

    .line 145
    .line 146
    .line 147
    const v15, -0x4099999a    # -0.9f

    .line 148
    .line 149
    .line 150
    const/high16 v16, -0x40000000    # -2.0f

    .line 151
    .line 152
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 153
    .line 154
    .line 155
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 156
    .line 157
    .line 158
    const/high16 v0, 0x41400000    # 12.0f

    .line 159
    .line 160
    const/high16 v2, 0x40b80000    # 5.75f

    .line 161
    .line 162
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 163
    .line 164
    .line 165
    const/high16 v17, 0x3f400000    # 0.75f

    .line 166
    .line 167
    const/high16 v18, -0x40c00000    # -0.75f

    .line 168
    .line 169
    const v14, -0x412e147b    # -0.41f

    .line 170
    .line 171
    .line 172
    const v15, 0x3eae147b    # 0.34f

    .line 173
    .line 174
    .line 175
    const/high16 v16, -0x40c00000    # -0.75f

    .line 176
    .line 177
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 178
    .line 179
    .line 180
    const v0, 0x3eae147b    # 0.34f

    .line 181
    .line 182
    .line 183
    const/high16 v2, 0x3f400000    # 0.75f

    .line 184
    .line 185
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 186
    .line 187
    .line 188
    const/high16 v0, 0x41580000    # 13.5f

    .line 189
    .line 190
    const/high16 v2, 0x41000000    # 8.0f

    .line 191
    .line 192
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 193
    .line 194
    .line 195
    const v0, 0x3fe51eb8    # 1.79f

    .line 196
    .line 197
    .line 198
    const v2, -0x3fd3d70a    # -2.69f

    .line 199
    .line 200
    .line 201
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 202
    .line 203
    .line 204
    const v17, 0x3f170a3d    # 0.59f

    .line 205
    .line 206
    .line 207
    const v18, -0x416147ae    # -0.31f

    .line 208
    .line 209
    .line 210
    const v13, 0x3e051eb8    # 0.13f

    .line 211
    .line 212
    .line 213
    const v14, -0x41bd70a4    # -0.19f

    .line 214
    .line 215
    .line 216
    const v15, 0x3eb33333    # 0.35f

    .line 217
    .line 218
    .line 219
    const v16, -0x416147ae    # -0.31f

    .line 220
    .line 221
    .line 222
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 223
    .line 224
    .line 225
    const v18, 0x3f8ccccd    # 1.1f

    .line 226
    .line 227
    .line 228
    const v13, 0x3f0f5c29    # 0.56f

    .line 229
    .line 230
    .line 231
    const/4 v14, 0x0

    .line 232
    const v15, 0x3f666666    # 0.9f

    .line 233
    .line 234
    .line 235
    const v16, 0x3f2147ae    # 0.63f

    .line 236
    .line 237
    .line 238
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 239
    .line 240
    .line 241
    const v0, 0x41733333    # 15.2f

    .line 242
    .line 243
    .line 244
    const/high16 v2, 0x41000000    # 8.0f

    .line 245
    .line 246
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 247
    .line 248
    .line 249
    const v0, 0x3fa28f5c    # 1.27f

    .line 250
    .line 251
    .line 252
    const v2, 0x3ff33333    # 1.9f

    .line 253
    .line 254
    .line 255
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 256
    .line 257
    .line 258
    const v17, -0x40e8f5c3    # -0.59f

    .line 259
    .line 260
    .line 261
    const v13, 0x3e9eb852    # 0.31f

    .line 262
    .line 263
    .line 264
    const v14, 0x3ef0a3d7    # 0.47f

    .line 265
    .line 266
    .line 267
    const v15, -0x435c28f6    # -0.02f

    .line 268
    .line 269
    .line 270
    const v16, 0x3f8ccccd    # 1.1f

    .line 271
    .line 272
    .line 273
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 274
    .line 275
    .line 276
    const v18, -0x416147ae    # -0.31f

    .line 277
    .line 278
    .line 279
    const v13, -0x418a3d71    # -0.24f

    .line 280
    .line 281
    .line 282
    const/4 v14, 0x0

    .line 283
    const v15, -0x41147ae1    # -0.46f

    .line 284
    .line 285
    .line 286
    const v16, -0x420a3d71    # -0.12f

    .line 287
    .line 288
    .line 289
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 290
    .line 291
    .line 292
    const/high16 v0, 0x41580000    # 13.5f

    .line 293
    .line 294
    const/high16 v2, 0x41000000    # 8.0f

    .line 295
    .line 296
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 297
    .line 298
    .line 299
    const/high16 v0, 0x40100000    # 2.25f

    .line 300
    .line 301
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 302
    .line 303
    .line 304
    const/high16 v17, -0x40c00000    # -0.75f

    .line 305
    .line 306
    const/high16 v18, 0x3f400000    # 0.75f

    .line 307
    .line 308
    const/4 v13, 0x0

    .line 309
    const v14, 0x3ed1eb85    # 0.41f

    .line 310
    .line 311
    .line 312
    const v15, -0x4151eb85    # -0.34f

    .line 313
    .line 314
    .line 315
    const/high16 v16, 0x3f400000    # 0.75f

    .line 316
    .line 317
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 318
    .line 319
    .line 320
    const v0, -0x4151eb85    # -0.34f

    .line 321
    .line 322
    .line 323
    const/high16 v2, -0x40c00000    # -0.75f

    .line 324
    .line 325
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 326
    .line 327
    .line 328
    const/high16 v0, -0x3f700000    # -4.5f

    .line 329
    .line 330
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 331
    .line 332
    .line 333
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 334
    .line 335
    .line 336
    const/high16 v0, 0x41040000    # 8.25f

    .line 337
    .line 338
    const/high16 v2, 0x40e00000    # 7.0f

    .line 339
    .line 340
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 341
    .line 342
    .line 343
    const/high16 v17, 0x3f800000    # 1.0f

    .line 344
    .line 345
    const/high16 v18, -0x40800000    # -1.0f

    .line 346
    .line 347
    const v14, -0x40f33333    # -0.55f

    .line 348
    .line 349
    .line 350
    const v15, 0x3ee66666    # 0.45f

    .line 351
    .line 352
    .line 353
    const/high16 v16, -0x40800000    # -1.0f

    .line 354
    .line 355
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 356
    .line 357
    .line 358
    const/high16 v0, 0x3fc00000    # 1.5f

    .line 359
    .line 360
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 361
    .line 362
    .line 363
    const/high16 v0, 0x41180000    # 9.5f

    .line 364
    .line 365
    const/high16 v2, 0x40d00000    # 6.5f

    .line 366
    .line 367
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 368
    .line 369
    .line 370
    const/high16 v0, 0x40f80000    # 7.75f

    .line 371
    .line 372
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 373
    .line 374
    .line 375
    const/high16 v17, -0x40c00000    # -0.75f

    .line 376
    .line 377
    const/high16 v18, -0x40c00000    # -0.75f

    .line 378
    .line 379
    const v13, -0x412e147b    # -0.41f

    .line 380
    .line 381
    .line 382
    const/4 v14, 0x0

    .line 383
    const/high16 v15, -0x40c00000    # -0.75f

    .line 384
    .line 385
    const v16, -0x4151eb85    # -0.34f

    .line 386
    .line 387
    .line 388
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 389
    .line 390
    .line 391
    const v0, 0x40eae148    # 7.34f

    .line 392
    .line 393
    .line 394
    const/high16 v2, 0x40f80000    # 7.75f

    .line 395
    .line 396
    const/high16 v4, 0x40a00000    # 5.0f

    .line 397
    .line 398
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 399
    .line 400
    .line 401
    const/high16 v0, 0x41200000    # 10.0f

    .line 402
    .line 403
    const/high16 v2, 0x40a00000    # 5.0f

    .line 404
    .line 405
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 406
    .line 407
    .line 408
    const/high16 v17, 0x3f800000    # 1.0f

    .line 409
    .line 410
    const/high16 v18, 0x3f800000    # 1.0f

    .line 411
    .line 412
    const v13, 0x3f0ccccd    # 0.55f

    .line 413
    .line 414
    .line 415
    const/high16 v15, 0x3f800000    # 1.0f

    .line 416
    .line 417
    const v16, 0x3ee66666    # 0.45f

    .line 418
    .line 419
    .line 420
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 421
    .line 422
    .line 423
    const/high16 v0, 0x3fe00000    # 1.75f

    .line 424
    .line 425
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 426
    .line 427
    .line 428
    const/high16 v17, -0x40800000    # -1.0f

    .line 429
    .line 430
    const/4 v13, 0x0

    .line 431
    const v14, 0x3f0ccccd    # 0.55f

    .line 432
    .line 433
    .line 434
    const v15, -0x4119999a    # -0.45f

    .line 435
    .line 436
    .line 437
    const/high16 v16, 0x3f800000    # 1.0f

    .line 438
    .line 439
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 440
    .line 441
    .line 442
    const/high16 v0, 0x41080000    # 8.5f

    .line 443
    .line 444
    const/high16 v2, 0x410c0000    # 8.75f

    .line 445
    .line 446
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 447
    .line 448
    .line 449
    const/high16 v0, 0x3f400000    # 0.75f

    .line 450
    .line 451
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 452
    .line 453
    .line 454
    const/high16 v0, 0x3fe00000    # 1.75f

    .line 455
    .line 456
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 457
    .line 458
    .line 459
    const/high16 v17, 0x3f400000    # 0.75f

    .line 460
    .line 461
    const/high16 v18, 0x3f400000    # 0.75f

    .line 462
    .line 463
    const v13, 0x3ed1eb85    # 0.41f

    .line 464
    .line 465
    .line 466
    const/4 v14, 0x0

    .line 467
    const/high16 v15, 0x3f400000    # 0.75f

    .line 468
    .line 469
    const v16, 0x3eae147b    # 0.34f

    .line 470
    .line 471
    .line 472
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 473
    .line 474
    .line 475
    const v0, -0x4151eb85    # -0.34f

    .line 476
    .line 477
    .line 478
    const/high16 v2, -0x40c00000    # -0.75f

    .line 479
    .line 480
    const/high16 v4, 0x3f400000    # 0.75f

    .line 481
    .line 482
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 483
    .line 484
    .line 485
    const/high16 v0, 0x41300000    # 11.0f

    .line 486
    .line 487
    const/high16 v2, 0x41000000    # 8.0f

    .line 488
    .line 489
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 490
    .line 491
    .line 492
    const/high16 v17, -0x40800000    # -1.0f

    .line 493
    .line 494
    const/high16 v18, -0x40800000    # -1.0f

    .line 495
    .line 496
    const v13, -0x40f33333    # -0.55f

    .line 497
    .line 498
    .line 499
    const/high16 v15, -0x40800000    # -1.0f

    .line 500
    .line 501
    const v16, -0x4119999a    # -0.45f

    .line 502
    .line 503
    .line 504
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 505
    .line 506
    .line 507
    const/high16 v0, 0x41040000    # 8.25f

    .line 508
    .line 509
    const/high16 v2, 0x40e00000    # 7.0f

    .line 510
    .line 511
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 512
    .line 513
    .line 514
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 515
    .line 516
    .line 517
    const v0, 0x4195eb85    # 18.74f

    .line 518
    .line 519
    .line 520
    const v2, 0x415428f6    # 13.26f

    .line 521
    .line 522
    .line 523
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 524
    .line 525
    .line 526
    const v0, -0x3f5f0a3d    # -5.03f

    .line 527
    .line 528
    .line 529
    const v2, 0x40a0f5c3    # 5.03f

    .line 530
    .line 531
    .line 532
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 533
    .line 534
    .line 535
    const v17, -0x404b851f    # -1.41f

    .line 536
    .line 537
    .line 538
    const/16 v18, 0x0

    .line 539
    .line 540
    const v13, -0x413851ec    # -0.39f

    .line 541
    .line 542
    .line 543
    const v14, 0x3ec7ae14    # 0.39f

    .line 544
    .line 545
    .line 546
    const v15, -0x407d70a4    # -1.02f

    .line 547
    .line 548
    .line 549
    const v16, 0x3ec7ae14    # 0.39f

    .line 550
    .line 551
    .line 552
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 553
    .line 554
    .line 555
    const/high16 v0, 0x41100000    # 9.0f

    .line 556
    .line 557
    const/high16 v2, 0x41700000    # 15.0f

    .line 558
    .line 559
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 560
    .line 561
    .line 562
    const v0, -0x3fe0a3d7    # -2.49f

    .line 563
    .line 564
    .line 565
    const v2, 0x401f5c29    # 2.49f

    .line 566
    .line 567
    .line 568
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 569
    .line 570
    .line 571
    const v17, -0x403eb852    # -1.51f

    .line 572
    .line 573
    .line 574
    const v18, -0x40e147ae    # -0.62f

    .line 575
    .line 576
    .line 577
    const v13, -0x40f0a3d7    # -0.56f

    .line 578
    .line 579
    .line 580
    const v14, 0x3f0f5c29    # 0.56f

    .line 581
    .line 582
    .line 583
    const v15, -0x403eb852    # -1.51f

    .line 584
    .line 585
    .line 586
    const v16, 0x3e23d70a    # 0.16f

    .line 587
    .line 588
    .line 589
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 590
    .line 591
    .line 592
    const v17, 0x3e851eb8    # 0.26f

    .line 593
    .line 594
    .line 595
    const/4 v13, 0x0

    .line 596
    const v14, -0x41947ae1    # -0.23f

    .line 597
    .line 598
    .line 599
    const v15, 0x3db851ec    # 0.09f

    .line 600
    .line 601
    .line 602
    const v16, -0x41147ae1    # -0.46f

    .line 603
    .line 604
    .line 605
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 606
    .line 607
    .line 608
    const v0, 0x4041eb85    # 3.03f

    .line 609
    .line 610
    .line 611
    const v2, -0x3fbe147b    # -3.03f

    .line 612
    .line 613
    .line 614
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 615
    .line 616
    .line 617
    const v17, 0x3fb47ae1    # 1.41f

    .line 618
    .line 619
    .line 620
    const/16 v18, 0x0

    .line 621
    .line 622
    const v13, 0x3ec7ae14    # 0.39f

    .line 623
    .line 624
    .line 625
    const v14, -0x413851ec    # -0.39f

    .line 626
    .line 627
    .line 628
    const v15, 0x3f828f5c    # 1.02f

    .line 629
    .line 630
    .line 631
    const v16, -0x413851ec    # -0.39f

    .line 632
    .line 633
    .line 634
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 635
    .line 636
    .line 637
    const/high16 v0, 0x41500000    # 13.0f

    .line 638
    .line 639
    const/high16 v2, 0x41840000    # 16.5f

    .line 640
    .line 641
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 642
    .line 643
    .line 644
    const v0, 0x408fae14    # 4.49f

    .line 645
    .line 646
    .line 647
    const v2, -0x3f7051ec    # -4.49f

    .line 648
    .line 649
    .line 650
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 651
    .line 652
    .line 653
    const v17, 0x3fc147ae    # 1.51f

    .line 654
    .line 655
    .line 656
    const v18, 0x3f1eb852    # 0.62f

    .line 657
    .line 658
    .line 659
    const v13, 0x3f0f5c29    # 0.56f

    .line 660
    .line 661
    .line 662
    const v14, -0x40f0a3d7    # -0.56f

    .line 663
    .line 664
    .line 665
    const v15, 0x3fc147ae    # 1.51f

    .line 666
    .line 667
    .line 668
    const v16, -0x41dc28f6    # -0.16f

    .line 669
    .line 670
    .line 671
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 672
    .line 673
    .line 674
    const v17, -0x417ae148    # -0.26f

    .line 675
    .line 676
    .line 677
    const v18, 0x3f2147ae    # 0.63f

    .line 678
    .line 679
    .line 680
    const/4 v13, 0x0

    .line 681
    const v14, 0x3e75c28f    # 0.24f

    .line 682
    .line 683
    .line 684
    const v15, -0x4247ae14    # -0.09f

    .line 685
    .line 686
    .line 687
    const v16, 0x3eeb851f    # 0.46f

    .line 688
    .line 689
    .line 690
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 691
    .line 692
    .line 693
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 694
    .line 695
    .line 696
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 697
    .line 698
    .line 699
    move-result-object v2

    .line 700
    const/16 v16, 0x3800

    .line 701
    .line 702
    const/16 v17, 0x0

    .line 703
    .line 704
    const/high16 v6, 0x3f800000    # 1.0f

    .line 705
    .line 706
    const/high16 v8, 0x3f800000    # 1.0f

    .line 707
    .line 708
    const/4 v7, 0x0

    .line 709
    const/high16 v9, 0x3f800000    # 1.0f

    .line 710
    .line 711
    const/high16 v12, 0x3f800000    # 1.0f

    .line 712
    .line 713
    const/4 v14, 0x0

    .line 714
    const/4 v15, 0x0

    .line 715
    const-string v4, ""

    .line 716
    .line 717
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 718
    .line 719
    .line 720
    move-result-object v0

    .line 721
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 722
    .line 723
    .line 724
    move-result-object v0

    .line 725
    sput-object v0, Landroidx/compose/material/icons/rounded/ScoreKt;->_score:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 726
    .line 727
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 728
    .line 729
    .line 730
    return-object v0
.end method
