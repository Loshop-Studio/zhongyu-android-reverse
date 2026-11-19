.class public final Landroidx/compose/material/icons/rounded/TheaterComedyKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_theaterComedy",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "TheaterComedy",
        "Landroidx/compose/material/icons/Icons$Rounded;",
        "getTheaterComedy",
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
        "SMAP\nTheaterComedy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TheaterComedy.kt\nandroidx/compose/material/icons/rounded/TheaterComedyKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,98:1\n212#2,12:99\n233#2,18:112\n253#2:149\n233#2,18:150\n253#2:187\n174#3:111\n705#4,2:130\n717#4,2:132\n719#4,11:138\n705#4,2:168\n717#4,2:170\n719#4,11:176\n72#5,4:134\n72#5,4:172\n*S KotlinDebug\n*F\n+ 1 TheaterComedy.kt\nandroidx/compose/material/icons/rounded/TheaterComedyKt\n*L\n29#1:99,12\n30#1:112,18\n30#1:149\n63#1:150,18\n63#1:187\n29#1:111\n30#1:130,2\n30#1:132,2\n30#1:138,11\n63#1:168,2\n63#1:170,2\n63#1:176,11\n30#1:134,4\n63#1:172,4\n*E\n"
    }
.end annotation


# static fields
.field private static _theaterComedy:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getTheaterComedy(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/TheaterComedyKt;->_theaterComedy:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.TheaterComedy"

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
    const/4 v2, 0x0

    .line 50
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 51
    .line 52
    .line 53
    sget-object v18, Landroidx/compose/ui/graphics/StrokeCap;->Companion:Landroidx/compose/ui/graphics/StrokeCap$Companion;

    .line 54
    .line 55
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 56
    .line 57
    .line 58
    move-result v10

    .line 59
    sget-object v19, Landroidx/compose/ui/graphics/StrokeJoin;->Companion:Landroidx/compose/ui/graphics/StrokeJoin$Companion;

    .line 60
    .line 61
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 62
    .line 63
    .line 64
    move-result v11

    .line 65
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 66
    .line 67
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 68
    .line 69
    .line 70
    const/high16 v4, 0x41a80000    # 21.0f

    .line 71
    .line 72
    const/high16 v6, 0x40000000    # 2.0f

    .line 73
    .line 74
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v4, -0x3f000000    # -8.0f

    .line 78
    .line 79
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 80
    .line 81
    .line 82
    const/high16 v25, -0x40000000    # -2.0f

    .line 83
    .line 84
    const/high16 v26, 0x40000000    # 2.0f

    .line 85
    .line 86
    const v21, -0x40733333    # -1.1f

    .line 87
    .line 88
    .line 89
    const/16 v22, 0x0

    .line 90
    .line 91
    const/high16 v23, -0x40000000    # -2.0f

    .line 92
    .line 93
    const v24, 0x3f666666    # 0.9f

    .line 94
    .line 95
    .line 96
    move-object/from16 v20, v2

    .line 97
    .line 98
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 99
    .line 100
    .line 101
    const/high16 v4, 0x40600000    # 3.5f

    .line 102
    .line 103
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 104
    .line 105
    .line 106
    const/high16 v4, 0x3fc00000    # 1.5f

    .line 107
    .line 108
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 109
    .line 110
    .line 111
    const/high16 v25, 0x40000000    # 2.0f

    .line 112
    .line 113
    const v21, 0x3f8ccccd    # 1.1f

    .line 114
    .line 115
    .line 116
    const/high16 v23, 0x40000000    # 2.0f

    .line 117
    .line 118
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 119
    .line 120
    .line 121
    const v4, 0x409e6666    # 4.95f

    .line 122
    .line 123
    .line 124
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 125
    .line 126
    .line 127
    const/high16 v25, 0x40600000    # 3.5f

    .line 128
    .line 129
    const v26, 0x3ef0a3d7    # 0.47f

    .line 130
    .line 131
    .line 132
    const v21, 0x3f851eb8    # 1.04f

    .line 133
    .line 134
    .line 135
    const v22, 0x3ef5c28f    # 0.48f

    .line 136
    .line 137
    .line 138
    const v23, 0x400f5c29    # 2.24f

    .line 139
    .line 140
    .line 141
    const v24, 0x3f2e147b    # 0.68f

    .line 142
    .line 143
    .line 144
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 145
    .line 146
    .line 147
    const/high16 v25, 0x40a00000    # 5.0f

    .line 148
    .line 149
    const v26, -0x3f3b851f    # -6.14f

    .line 150
    .line 151
    .line 152
    const v21, 0x403b851f    # 2.93f

    .line 153
    .line 154
    .line 155
    const v22, -0x41051eb8    # -0.49f

    .line 156
    .line 157
    .line 158
    const/high16 v23, 0x40a00000    # 5.0f

    .line 159
    .line 160
    const v24, -0x3fb51eb8    # -3.17f

    .line 161
    .line 162
    .line 163
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 164
    .line 165
    .line 166
    const/high16 v4, 0x40800000    # 4.0f

    .line 167
    .line 168
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 169
    .line 170
    .line 171
    const/high16 v25, 0x41a80000    # 21.0f

    .line 172
    .line 173
    const/high16 v26, 0x40000000    # 2.0f

    .line 174
    .line 175
    const/high16 v21, 0x41b80000    # 23.0f

    .line 176
    .line 177
    const v22, 0x4039999a    # 2.9f

    .line 178
    .line 179
    .line 180
    const v23, 0x41b0cccd    # 22.1f

    .line 181
    .line 182
    .line 183
    const/high16 v24, 0x40000000    # 2.0f

    .line 184
    .line 185
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 186
    .line 187
    .line 188
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 189
    .line 190
    .line 191
    const/high16 v4, 0x40d00000    # 6.5f

    .line 192
    .line 193
    const/high16 v6, 0x41600000    # 14.0f

    .line 194
    .line 195
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 196
    .line 197
    .line 198
    const/high16 v25, 0x3f800000    # 1.0f

    .line 199
    .line 200
    const/high16 v26, -0x40800000    # -1.0f

    .line 201
    .line 202
    const/16 v21, 0x0

    .line 203
    .line 204
    const v22, -0x40f33333    # -0.55f

    .line 205
    .line 206
    .line 207
    const v23, 0x3ee66666    # 0.45f

    .line 208
    .line 209
    .line 210
    const/high16 v24, -0x40800000    # -1.0f

    .line 211
    .line 212
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 213
    .line 214
    .line 215
    const v4, 0x3ee66666    # 0.45f

    .line 216
    .line 217
    .line 218
    const/high16 v6, 0x3f800000    # 1.0f

    .line 219
    .line 220
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 221
    .line 222
    .line 223
    const v4, -0x4119999a    # -0.45f

    .line 224
    .line 225
    .line 226
    const/high16 v6, -0x40800000    # -1.0f

    .line 227
    .line 228
    const/high16 v7, 0x3f800000    # 1.0f

    .line 229
    .line 230
    invoke-virtual {v2, v4, v7, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 231
    .line 232
    .line 233
    const v4, 0x40e1999a    # 7.05f

    .line 234
    .line 235
    .line 236
    const/high16 v6, 0x40d00000    # 6.5f

    .line 237
    .line 238
    const/high16 v7, 0x41600000    # 14.0f

    .line 239
    .line 240
    invoke-virtual {v2, v7, v4, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 241
    .line 242
    .line 243
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 244
    .line 245
    .line 246
    const v4, 0x4196cccd    # 18.85f

    .line 247
    .line 248
    .line 249
    const v6, 0x412e147b    # 10.88f

    .line 250
    .line 251
    .line 252
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 253
    .line 254
    .line 255
    const v4, -0x3f91eb85    # -3.72f

    .line 256
    .line 257
    .line 258
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 259
    .line 260
    .line 261
    const v25, -0x411eb852    # -0.44f

    .line 262
    .line 263
    .line 264
    const/high16 v26, -0x40c00000    # -0.75f

    .line 265
    .line 266
    const v21, -0x413d70a4    # -0.38f

    .line 267
    .line 268
    .line 269
    const/16 v22, 0x0

    .line 270
    .line 271
    const v23, -0x40deb852    # -0.63f

    .line 272
    .line 273
    .line 274
    const v24, -0x412e147b    # -0.41f

    .line 275
    .line 276
    .line 277
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 278
    .line 279
    .line 280
    const v25, 0x4187eb85    # 16.99f

    .line 281
    .line 282
    .line 283
    const/high16 v26, 0x41100000    # 9.0f

    .line 284
    .line 285
    const v21, 0x417147ae    # 15.08f

    .line 286
    .line 287
    .line 288
    const v22, 0x4117851f    # 9.47f

    .line 289
    .line 290
    .line 291
    const v23, 0x417f5c29    # 15.96f

    .line 292
    .line 293
    .line 294
    const/high16 v24, 0x41100000    # 9.0f

    .line 295
    .line 296
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 297
    .line 298
    .line 299
    const v4, 0x40133333    # 2.3f

    .line 300
    .line 301
    .line 302
    const v6, 0x3f91eb85    # 1.14f

    .line 303
    .line 304
    .line 305
    const v7, 0x3ff47ae1    # 1.91f

    .line 306
    .line 307
    .line 308
    const v8, 0x3ef0a3d7    # 0.47f

    .line 309
    .line 310
    .line 311
    invoke-virtual {v2, v7, v8, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 312
    .line 313
    .line 314
    const v25, 0x4196cccd    # 18.85f

    .line 315
    .line 316
    .line 317
    const v26, 0x412e147b    # 10.88f

    .line 318
    .line 319
    .line 320
    const v21, 0x419bd70a    # 19.48f

    .line 321
    .line 322
    .line 323
    const v22, 0x4127851f    # 10.47f

    .line 324
    .line 325
    .line 326
    const v23, 0x4199d70a    # 19.23f

    .line 327
    .line 328
    .line 329
    const v24, 0x412e147b    # 10.88f

    .line 330
    .line 331
    .line 332
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 333
    .line 334
    .line 335
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 336
    .line 337
    .line 338
    const/high16 v4, 0x41980000    # 19.0f

    .line 339
    .line 340
    const/high16 v6, 0x40f00000    # 7.5f

    .line 341
    .line 342
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 343
    .line 344
    .line 345
    const/high16 v25, -0x40800000    # -1.0f

    .line 346
    .line 347
    const/high16 v26, -0x40800000    # -1.0f

    .line 348
    .line 349
    const v21, -0x40f33333    # -0.55f

    .line 350
    .line 351
    .line 352
    const/16 v22, 0x0

    .line 353
    .line 354
    const/high16 v23, -0x40800000    # -1.0f

    .line 355
    .line 356
    const v24, -0x4119999a    # -0.45f

    .line 357
    .line 358
    .line 359
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 360
    .line 361
    .line 362
    const/high16 v4, -0x40800000    # -1.0f

    .line 363
    .line 364
    const v6, 0x3ee66666    # 0.45f

    .line 365
    .line 366
    .line 367
    const/high16 v7, 0x3f800000    # 1.0f

    .line 368
    .line 369
    invoke-virtual {v2, v6, v4, v7, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 370
    .line 371
    .line 372
    const v4, 0x3ee66666    # 0.45f

    .line 373
    .line 374
    .line 375
    const/high16 v6, 0x3f800000    # 1.0f

    .line 376
    .line 377
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 378
    .line 379
    .line 380
    const v4, 0x419c6666    # 19.55f

    .line 381
    .line 382
    .line 383
    const/high16 v6, 0x41980000    # 19.0f

    .line 384
    .line 385
    const/high16 v7, 0x40f00000    # 7.5f

    .line 386
    .line 387
    invoke-virtual {v2, v4, v7, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 388
    .line 389
    .line 390
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 391
    .line 392
    .line 393
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 394
    .line 395
    .line 396
    move-result-object v2

    .line 397
    const/16 v16, 0x3800

    .line 398
    .line 399
    const/16 v17, 0x0

    .line 400
    .line 401
    const/high16 v6, 0x3f800000    # 1.0f

    .line 402
    .line 403
    const/high16 v8, 0x3f800000    # 1.0f

    .line 404
    .line 405
    const/4 v7, 0x0

    .line 406
    const/high16 v9, 0x3f800000    # 1.0f

    .line 407
    .line 408
    const/high16 v12, 0x3f800000    # 1.0f

    .line 409
    .line 410
    const/4 v13, 0x0

    .line 411
    const/4 v14, 0x0

    .line 412
    const/4 v15, 0x0

    .line 413
    const-string v4, ""

    .line 414
    .line 415
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 416
    .line 417
    .line 418
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 419
    .line 420
    .line 421
    move-result v3

    .line 422
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 423
    .line 424
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 425
    .line 426
    .line 427
    move-result-wide v6

    .line 428
    const/4 v0, 0x0

    .line 429
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 430
    .line 431
    .line 432
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 433
    .line 434
    .line 435
    move-result v10

    .line 436
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 437
    .line 438
    .line 439
    move-result v11

    .line 440
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 441
    .line 442
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 443
    .line 444
    .line 445
    const/high16 v0, 0x41300000    # 11.0f

    .line 446
    .line 447
    const/high16 v2, 0x41100000    # 9.0f

    .line 448
    .line 449
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 450
    .line 451
    .line 452
    const/high16 v0, 0x40400000    # 3.0f

    .line 453
    .line 454
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 455
    .line 456
    .line 457
    const/high16 v17, -0x40000000    # -2.0f

    .line 458
    .line 459
    const/high16 v18, 0x40000000    # 2.0f

    .line 460
    .line 461
    const v13, -0x40733333    # -1.1f

    .line 462
    .line 463
    .line 464
    const/high16 v15, -0x40000000    # -2.0f

    .line 465
    .line 466
    const v16, 0x3f666666    # 0.9f

    .line 467
    .line 468
    .line 469
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 470
    .line 471
    .line 472
    const v0, 0x409947ae    # 4.79f

    .line 473
    .line 474
    .line 475
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 476
    .line 477
    .line 478
    const v17, 0x40a6b852    # 5.21f

    .line 479
    .line 480
    .line 481
    const v18, 0x40c51eb8    # 6.16f

    .line 482
    .line 483
    .line 484
    const/4 v13, 0x0

    .line 485
    const v14, 0x40433333    # 3.05f

    .line 486
    .line 487
    .line 488
    const v15, 0x400c28f6    # 2.19f

    .line 489
    .line 490
    .line 491
    const v16, 0x40b8a3d7    # 5.77f

    .line 492
    .line 493
    .line 494
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 495
    .line 496
    .line 497
    const/high16 v17, 0x41500000    # 13.0f

    .line 498
    .line 499
    const/high16 v18, 0x41800000    # 16.0f

    .line 500
    .line 501
    const v13, 0x411deb85    # 9.87f

    .line 502
    .line 503
    .line 504
    const v14, 0x41b35c29    # 22.42f

    .line 505
    .line 506
    .line 507
    const/high16 v15, 0x41500000    # 13.0f

    .line 508
    .line 509
    const v16, 0x419c8f5c    # 19.57f

    .line 510
    .line 511
    .line 512
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 513
    .line 514
    .line 515
    const/high16 v0, -0x3f600000    # -5.0f

    .line 516
    .line 517
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 518
    .line 519
    .line 520
    const/high16 v17, 0x41300000    # 11.0f

    .line 521
    .line 522
    const/high16 v18, 0x41100000    # 9.0f

    .line 523
    .line 524
    const/high16 v13, 0x41500000    # 13.0f

    .line 525
    .line 526
    const v14, 0x411e6666    # 9.9f

    .line 527
    .line 528
    .line 529
    const v15, 0x4141999a    # 12.1f

    .line 530
    .line 531
    .line 532
    const/high16 v16, 0x41100000    # 9.0f

    .line 533
    .line 534
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 535
    .line 536
    .line 537
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 538
    .line 539
    .line 540
    const/high16 v0, 0x41580000    # 13.5f

    .line 541
    .line 542
    const/high16 v2, 0x40800000    # 4.0f

    .line 543
    .line 544
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 545
    .line 546
    .line 547
    const/high16 v17, 0x3f800000    # 1.0f

    .line 548
    .line 549
    const/high16 v18, -0x40800000    # -1.0f

    .line 550
    .line 551
    const/4 v13, 0x0

    .line 552
    const v14, -0x40f33333    # -0.55f

    .line 553
    .line 554
    .line 555
    const v15, 0x3ee66666    # 0.45f

    .line 556
    .line 557
    .line 558
    const/high16 v16, -0x40800000    # -1.0f

    .line 559
    .line 560
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 561
    .line 562
    .line 563
    const v0, 0x3ee66666    # 0.45f

    .line 564
    .line 565
    .line 566
    const/high16 v2, 0x3f800000    # 1.0f

    .line 567
    .line 568
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 569
    .line 570
    .line 571
    const v0, -0x4119999a    # -0.45f

    .line 572
    .line 573
    .line 574
    const/high16 v2, -0x40800000    # -1.0f

    .line 575
    .line 576
    const/high16 v4, 0x3f800000    # 1.0f

    .line 577
    .line 578
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 579
    .line 580
    .line 581
    const v0, 0x4160cccd    # 14.05f

    .line 582
    .line 583
    .line 584
    const/high16 v2, 0x41580000    # 13.5f

    .line 585
    .line 586
    const/high16 v4, 0x40800000    # 4.0f

    .line 587
    .line 588
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 589
    .line 590
    .line 591
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 592
    .line 593
    .line 594
    const v0, 0x4114cccd    # 9.3f

    .line 595
    .line 596
    .line 597
    const/high16 v2, 0x41860000    # 16.75f

    .line 598
    .line 599
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 600
    .line 601
    .line 602
    const v17, -0x3feccccd    # -2.3f

    .line 603
    .line 604
    .line 605
    const v18, 0x3f91eb85    # 1.14f

    .line 606
    .line 607
    .line 608
    const v13, -0x413d70a4    # -0.38f

    .line 609
    .line 610
    .line 611
    const v14, 0x3f2b851f    # 0.67f

    .line 612
    .line 613
    .line 614
    const v15, -0x405d70a4    # -1.27f

    .line 615
    .line 616
    .line 617
    const v16, 0x3f91eb85    # 1.14f

    .line 618
    .line 619
    .line 620
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 621
    .line 622
    .line 623
    const v0, -0x3feccccd    # -2.3f

    .line 624
    .line 625
    .line 626
    const v2, -0x406e147b    # -1.14f

    .line 627
    .line 628
    .line 629
    const v4, -0x400b851f    # -1.91f

    .line 630
    .line 631
    .line 632
    const v6, -0x410f5c29    # -0.47f

    .line 633
    .line 634
    .line 635
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 636
    .line 637
    .line 638
    const v17, 0x40a47ae1    # 5.14f

    .line 639
    .line 640
    .line 641
    const/high16 v18, 0x41800000    # 16.0f

    .line 642
    .line 643
    const v13, 0x409051ec    # 4.51f

    .line 644
    .line 645
    .line 646
    const v14, 0x418347ae    # 16.41f

    .line 647
    .line 648
    .line 649
    const v15, 0x409851ec    # 4.76f

    .line 650
    .line 651
    .line 652
    const/high16 v16, 0x41800000    # 16.0f

    .line 653
    .line 654
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 655
    .line 656
    .line 657
    const v0, 0x406e147b    # 3.72f

    .line 658
    .line 659
    .line 660
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 661
    .line 662
    .line 663
    const v17, 0x4114cccd    # 9.3f

    .line 664
    .line 665
    .line 666
    const/high16 v18, 0x41860000    # 16.75f

    .line 667
    .line 668
    const v13, 0x4113d70a    # 9.24f

    .line 669
    .line 670
    .line 671
    const/high16 v14, 0x41800000    # 16.0f

    .line 672
    .line 673
    const v15, 0x4117d70a    # 9.49f

    .line 674
    .line 675
    .line 676
    const v16, 0x418347ae    # 16.41f

    .line 677
    .line 678
    .line 679
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 680
    .line 681
    .line 682
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 683
    .line 684
    .line 685
    const/high16 v0, 0x41680000    # 14.5f

    .line 686
    .line 687
    const/high16 v2, 0x41100000    # 9.0f

    .line 688
    .line 689
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 690
    .line 691
    .line 692
    const/high16 v17, -0x40800000    # -1.0f

    .line 693
    .line 694
    const/high16 v18, -0x40800000    # -1.0f

    .line 695
    .line 696
    const v13, -0x40f33333    # -0.55f

    .line 697
    .line 698
    .line 699
    const/4 v14, 0x0

    .line 700
    const/high16 v15, -0x40800000    # -1.0f

    .line 701
    .line 702
    const v16, -0x4119999a    # -0.45f

    .line 703
    .line 704
    .line 705
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 706
    .line 707
    .line 708
    const/high16 v0, -0x40800000    # -1.0f

    .line 709
    .line 710
    const v2, 0x3ee66666    # 0.45f

    .line 711
    .line 712
    .line 713
    const/high16 v4, 0x3f800000    # 1.0f

    .line 714
    .line 715
    invoke-virtual {v12, v2, v0, v4, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 716
    .line 717
    .line 718
    const v0, 0x3ee66666    # 0.45f

    .line 719
    .line 720
    .line 721
    const/high16 v2, 0x3f800000    # 1.0f

    .line 722
    .line 723
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 724
    .line 725
    .line 726
    const v0, 0x4118cccd    # 9.55f

    .line 727
    .line 728
    .line 729
    const/high16 v2, 0x41680000    # 14.5f

    .line 730
    .line 731
    const/high16 v4, 0x41100000    # 9.0f

    .line 732
    .line 733
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 734
    .line 735
    .line 736
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 737
    .line 738
    .line 739
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 740
    .line 741
    .line 742
    move-result-object v2

    .line 743
    const/16 v16, 0x3800

    .line 744
    .line 745
    const/16 v17, 0x0

    .line 746
    .line 747
    const/high16 v6, 0x3f800000    # 1.0f

    .line 748
    .line 749
    const/4 v7, 0x0

    .line 750
    const/high16 v12, 0x3f800000    # 1.0f

    .line 751
    .line 752
    const/4 v13, 0x0

    .line 753
    const/4 v15, 0x0

    .line 754
    const-string v4, ""

    .line 755
    .line 756
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 757
    .line 758
    .line 759
    move-result-object v0

    .line 760
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 761
    .line 762
    .line 763
    move-result-object v0

    .line 764
    sput-object v0, Landroidx/compose/material/icons/rounded/TheaterComedyKt;->_theaterComedy:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 765
    .line 766
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 767
    .line 768
    .line 769
    return-object v0
.end method
