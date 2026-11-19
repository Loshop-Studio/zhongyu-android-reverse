.class public final Landroidx/compose/material/icons/rounded/OtherHousesKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_otherHouses",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "OtherHouses",
        "Landroidx/compose/material/icons/Icons$Rounded;",
        "getOtherHouses",
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
        "SMAP\nOtherHouses.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OtherHouses.kt\nandroidx/compose/material/icons/rounded/OtherHousesKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,71:1\n212#2,12:72\n233#2,18:85\n253#2:122\n174#3:84\n705#4,2:103\n717#4,2:105\n719#4,11:111\n72#5,4:107\n*S KotlinDebug\n*F\n+ 1 OtherHouses.kt\nandroidx/compose/material/icons/rounded/OtherHousesKt\n*L\n29#1:72,12\n30#1:85,18\n30#1:122\n29#1:84\n30#1:103,2\n30#1:105,2\n30#1:111,11\n30#1:107,4\n*E\n"
    }
.end annotation


# static fields
.field private static _otherHouses:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getOtherHouses(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/OtherHousesKt;->_otherHouses:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.OtherHouses"

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
    const v0, 0x3fce147b    # 1.61f

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
    const v17, 0x3fb33333    # 1.4f

    .line 80
    .line 81
    .line 82
    const v18, 0x3e428f5c    # 0.19f

    .line 83
    .line 84
    .line 85
    const v13, 0x3eae147b    # 0.34f

    .line 86
    .line 87
    .line 88
    const v14, 0x3ee147ae    # 0.44f

    .line 89
    .line 90
    .line 91
    const v15, 0x3f75c28f    # 0.96f

    .line 92
    .line 93
    .line 94
    const v16, 0x3f051eb8    # 0.52f

    .line 95
    .line 96
    .line 97
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 98
    .line 99
    .line 100
    const/high16 v0, 0x40800000    # 4.0f

    .line 101
    .line 102
    const v2, 0x4139eb85    # 11.62f

    .line 103
    .line 104
    .line 105
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 106
    .line 107
    .line 108
    const/high16 v0, 0x41a00000    # 20.0f

    .line 109
    .line 110
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 111
    .line 112
    .line 113
    const/high16 v17, 0x3f800000    # 1.0f

    .line 114
    .line 115
    const/high16 v18, 0x3f800000    # 1.0f

    .line 116
    .line 117
    const/4 v13, 0x0

    .line 118
    const v14, 0x3f0ccccd    # 0.55f

    .line 119
    .line 120
    .line 121
    const v15, 0x3ee66666    # 0.45f

    .line 122
    .line 123
    .line 124
    const/high16 v16, 0x3f800000    # 1.0f

    .line 125
    .line 126
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 127
    .line 128
    .line 129
    const/high16 v0, 0x41600000    # 14.0f

    .line 130
    .line 131
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 132
    .line 133
    .line 134
    const/high16 v18, -0x40800000    # -1.0f

    .line 135
    .line 136
    const v13, 0x3f0ccccd    # 0.55f

    .line 137
    .line 138
    .line 139
    const/4 v14, 0x0

    .line 140
    const/high16 v15, 0x3f800000    # 1.0f

    .line 141
    .line 142
    const v16, -0x4119999a    # -0.45f

    .line 143
    .line 144
    .line 145
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 146
    .line 147
    .line 148
    const v0, -0x3ef9eb85    # -8.38f

    .line 149
    .line 150
    .line 151
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 152
    .line 153
    .line 154
    const v0, 0x3f7d70a4    # 0.99f

    .line 155
    .line 156
    .line 157
    const v2, 0x3f428f5c    # 0.76f

    .line 158
    .line 159
    .line 160
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 161
    .line 162
    .line 163
    const v17, 0x3fb33333    # 1.4f

    .line 164
    .line 165
    .line 166
    const v18, -0x41bd70a4    # -0.19f

    .line 167
    .line 168
    .line 169
    const v13, 0x3ee147ae    # 0.44f

    .line 170
    .line 171
    .line 172
    const v14, 0x3eae147b    # 0.34f

    .line 173
    .line 174
    .line 175
    const v15, 0x3f88f5c3    # 1.07f

    .line 176
    .line 177
    .line 178
    const/high16 v16, 0x3e800000    # 0.25f

    .line 179
    .line 180
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 181
    .line 182
    .line 183
    const v17, -0x41bd70a4    # -0.19f

    .line 184
    .line 185
    .line 186
    const v18, -0x404ccccd    # -1.4f

    .line 187
    .line 188
    .line 189
    const v13, 0x3eae147b    # 0.34f

    .line 190
    .line 191
    .line 192
    const v14, -0x411eb852    # -0.44f

    .line 193
    .line 194
    .line 195
    const/high16 v15, 0x3e800000    # 0.25f

    .line 196
    .line 197
    const v16, -0x40770a3d    # -1.07f

    .line 198
    .line 199
    .line 200
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 201
    .line 202
    .line 203
    const v0, -0x3f1570a4    # -7.33f

    .line 204
    .line 205
    .line 206
    const v2, -0x3ee66666    # -9.6f

    .line 207
    .line 208
    .line 209
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 210
    .line 211
    .line 212
    const v17, -0x40651eb8    # -1.21f

    .line 213
    .line 214
    .line 215
    const/16 v18, 0x0

    .line 216
    .line 217
    const v13, -0x4147ae14    # -0.36f

    .line 218
    .line 219
    .line 220
    const v14, -0x4175c28f    # -0.27f

    .line 221
    .line 222
    .line 223
    const v15, -0x40a3d70a    # -0.86f

    .line 224
    .line 225
    .line 226
    const v16, -0x4175c28f    # -0.27f

    .line 227
    .line 228
    .line 229
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 230
    .line 231
    .line 232
    const v0, 0x40ea8f5c    # 7.33f

    .line 233
    .line 234
    .line 235
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 236
    .line 237
    .line 238
    const v17, 0x3fce147b    # 1.61f

    .line 239
    .line 240
    .line 241
    const v18, 0x41430a3d    # 12.19f

    .line 242
    .line 243
    .line 244
    const v13, 0x3fae147b    # 1.36f

    .line 245
    .line 246
    .line 247
    const v14, 0x4132147b    # 11.13f

    .line 248
    .line 249
    .line 250
    const v15, 0x3fa28f5c    # 1.27f

    .line 251
    .line 252
    .line 253
    const v16, 0x413c28f6    # 11.76f

    .line 254
    .line 255
    .line 256
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 257
    .line 258
    .line 259
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 260
    .line 261
    .line 262
    const/high16 v0, 0x41000000    # 8.0f

    .line 263
    .line 264
    const/high16 v2, 0x41700000    # 15.0f

    .line 265
    .line 266
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 267
    .line 268
    .line 269
    const/high16 v17, -0x40800000    # -1.0f

    .line 270
    .line 271
    const/high16 v18, -0x40800000    # -1.0f

    .line 272
    .line 273
    const v13, -0x40f33333    # -0.55f

    .line 274
    .line 275
    .line 276
    const/4 v14, 0x0

    .line 277
    const/high16 v15, -0x40800000    # -1.0f

    .line 278
    .line 279
    const v16, -0x4119999a    # -0.45f

    .line 280
    .line 281
    .line 282
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 283
    .line 284
    .line 285
    const/high16 v17, 0x3f800000    # 1.0f

    .line 286
    .line 287
    const/4 v13, 0x0

    .line 288
    const v14, -0x40f33333    # -0.55f

    .line 289
    .line 290
    .line 291
    const v15, 0x3ee66666    # 0.45f

    .line 292
    .line 293
    .line 294
    const/high16 v16, -0x40800000    # -1.0f

    .line 295
    .line 296
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 297
    .line 298
    .line 299
    const v0, 0x3ee66666    # 0.45f

    .line 300
    .line 301
    .line 302
    const/high16 v2, 0x3f800000    # 1.0f

    .line 303
    .line 304
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 305
    .line 306
    .line 307
    const/high16 v17, 0x41000000    # 8.0f

    .line 308
    .line 309
    const/high16 v18, 0x41700000    # 15.0f

    .line 310
    .line 311
    const/high16 v13, 0x41100000    # 9.0f

    .line 312
    .line 313
    const v14, 0x4168cccd    # 14.55f

    .line 314
    .line 315
    .line 316
    const v15, 0x4108cccd    # 8.55f

    .line 317
    .line 318
    .line 319
    const/high16 v16, 0x41700000    # 15.0f

    .line 320
    .line 321
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 322
    .line 323
    .line 324
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 325
    .line 326
    .line 327
    const/high16 v0, 0x41400000    # 12.0f

    .line 328
    .line 329
    const/high16 v2, 0x41700000    # 15.0f

    .line 330
    .line 331
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 332
    .line 333
    .line 334
    const/high16 v17, -0x40800000    # -1.0f

    .line 335
    .line 336
    const/high16 v18, -0x40800000    # -1.0f

    .line 337
    .line 338
    const v13, -0x40f33333    # -0.55f

    .line 339
    .line 340
    .line 341
    const/4 v14, 0x0

    .line 342
    const/high16 v15, -0x40800000    # -1.0f

    .line 343
    .line 344
    const v16, -0x4119999a    # -0.45f

    .line 345
    .line 346
    .line 347
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 348
    .line 349
    .line 350
    const/high16 v17, 0x3f800000    # 1.0f

    .line 351
    .line 352
    const/4 v13, 0x0

    .line 353
    const v14, -0x40f33333    # -0.55f

    .line 354
    .line 355
    .line 356
    const v15, 0x3ee66666    # 0.45f

    .line 357
    .line 358
    .line 359
    const/high16 v16, -0x40800000    # -1.0f

    .line 360
    .line 361
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 362
    .line 363
    .line 364
    const v0, 0x3ee66666    # 0.45f

    .line 365
    .line 366
    .line 367
    const/high16 v2, 0x3f800000    # 1.0f

    .line 368
    .line 369
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 370
    .line 371
    .line 372
    const/high16 v17, 0x41400000    # 12.0f

    .line 373
    .line 374
    const/high16 v18, 0x41700000    # 15.0f

    .line 375
    .line 376
    const/high16 v13, 0x41500000    # 13.0f

    .line 377
    .line 378
    const v14, 0x4168cccd    # 14.55f

    .line 379
    .line 380
    .line 381
    const v15, 0x4148cccd    # 12.55f

    .line 382
    .line 383
    .line 384
    const/high16 v16, 0x41700000    # 15.0f

    .line 385
    .line 386
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 387
    .line 388
    .line 389
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 390
    .line 391
    .line 392
    const/high16 v0, 0x41800000    # 16.0f

    .line 393
    .line 394
    const/high16 v2, 0x41700000    # 15.0f

    .line 395
    .line 396
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 397
    .line 398
    .line 399
    const/high16 v17, -0x40800000    # -1.0f

    .line 400
    .line 401
    const/high16 v18, -0x40800000    # -1.0f

    .line 402
    .line 403
    const v13, -0x40f33333    # -0.55f

    .line 404
    .line 405
    .line 406
    const/4 v14, 0x0

    .line 407
    const/high16 v15, -0x40800000    # -1.0f

    .line 408
    .line 409
    const v16, -0x4119999a    # -0.45f

    .line 410
    .line 411
    .line 412
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 413
    .line 414
    .line 415
    const/high16 v17, 0x3f800000    # 1.0f

    .line 416
    .line 417
    const/4 v13, 0x0

    .line 418
    const v14, -0x40f33333    # -0.55f

    .line 419
    .line 420
    .line 421
    const v15, 0x3ee66666    # 0.45f

    .line 422
    .line 423
    .line 424
    const/high16 v16, -0x40800000    # -1.0f

    .line 425
    .line 426
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 427
    .line 428
    .line 429
    const v0, 0x3ee66666    # 0.45f

    .line 430
    .line 431
    .line 432
    const/high16 v2, 0x3f800000    # 1.0f

    .line 433
    .line 434
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 435
    .line 436
    .line 437
    const/high16 v17, 0x41800000    # 16.0f

    .line 438
    .line 439
    const/high16 v18, 0x41700000    # 15.0f

    .line 440
    .line 441
    const/high16 v13, 0x41880000    # 17.0f

    .line 442
    .line 443
    const v14, 0x4168cccd    # 14.55f

    .line 444
    .line 445
    .line 446
    const v15, 0x41846666    # 16.55f

    .line 447
    .line 448
    .line 449
    const/high16 v16, 0x41700000    # 15.0f

    .line 450
    .line 451
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 452
    .line 453
    .line 454
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 455
    .line 456
    .line 457
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 458
    .line 459
    .line 460
    move-result-object v2

    .line 461
    const/16 v16, 0x3800

    .line 462
    .line 463
    const/16 v17, 0x0

    .line 464
    .line 465
    const/high16 v6, 0x3f800000    # 1.0f

    .line 466
    .line 467
    const/high16 v8, 0x3f800000    # 1.0f

    .line 468
    .line 469
    const/4 v7, 0x0

    .line 470
    const/high16 v9, 0x3f800000    # 1.0f

    .line 471
    .line 472
    const/high16 v12, 0x3f800000    # 1.0f

    .line 473
    .line 474
    const/4 v13, 0x0

    .line 475
    const/4 v14, 0x0

    .line 476
    const/4 v15, 0x0

    .line 477
    const-string v4, ""

    .line 478
    .line 479
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 480
    .line 481
    .line 482
    move-result-object v0

    .line 483
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 484
    .line 485
    .line 486
    move-result-object v0

    .line 487
    sput-object v0, Landroidx/compose/material/icons/rounded/OtherHousesKt;->_otherHouses:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 488
    .line 489
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 490
    .line 491
    .line 492
    return-object v0
.end method
