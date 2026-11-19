.class public final Landroidx/compose/material/icons/rounded/ElderlyWomanKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_elderlyWoman",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "ElderlyWoman",
        "Landroidx/compose/material/icons/Icons$Rounded;",
        "getElderlyWoman",
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
        "SMAP\nElderlyWoman.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ElderlyWoman.kt\nandroidx/compose/material/icons/rounded/ElderlyWomanKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,83:1\n212#2,12:84\n233#2,18:97\n253#2:134\n233#2,18:135\n253#2:172\n174#3:96\n705#4,2:115\n717#4,2:117\n719#4,11:123\n705#4,2:153\n717#4,2:155\n719#4,11:161\n72#5,4:119\n72#5,4:157\n*S KotlinDebug\n*F\n+ 1 ElderlyWoman.kt\nandroidx/compose/material/icons/rounded/ElderlyWomanKt\n*L\n29#1:84,12\n30#1:97,18\n30#1:134\n66#1:135,18\n66#1:172\n29#1:96\n30#1:115,2\n30#1:117,2\n30#1:123,11\n66#1:153,2\n66#1:155,2\n66#1:161,11\n30#1:119,4\n66#1:157,4\n*E\n"
    }
.end annotation


# static fields
.field private static _elderlyWoman:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getElderlyWoman(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/ElderlyWomanKt;->_elderlyWoman:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.ElderlyWoman"

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
    const v4, 0x419428f6    # 18.52f

    .line 71
    .line 72
    .line 73
    const/high16 v6, 0x41300000    # 11.0f

    .line 74
    .line 75
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    const v25, -0x3f99999a    # -3.6f

    .line 79
    .line 80
    .line 81
    const v26, -0x3ff28f5c    # -2.21f

    .line 82
    .line 83
    .line 84
    const v21, -0x40370a3d    # -1.57f

    .line 85
    .line 86
    .line 87
    const/16 v22, 0x0

    .line 88
    .line 89
    const v23, -0x3fc3d70a    # -2.94f

    .line 90
    .line 91
    .line 92
    const v24, -0x4099999a    # -0.9f

    .line 93
    .line 94
    .line 95
    move-object/from16 v20, v2

    .line 96
    .line 97
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 98
    .line 99
    .line 100
    const v4, -0x40b5c28f    # -0.79f

    .line 101
    .line 102
    .line 103
    const v6, -0x402a3d71    # -1.67f

    .line 104
    .line 105
    .line 106
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 107
    .line 108
    .line 109
    const/4 v4, 0x0

    .line 110
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 111
    .line 112
    .line 113
    const v25, 0x414570a4    # 12.34f

    .line 114
    .line 115
    .line 116
    const/high16 v26, 0x40c00000    # 6.0f

    .line 117
    .line 118
    const v21, 0x4161eb85    # 14.12f

    .line 119
    .line 120
    .line 121
    const v22, 0x40e33333    # 7.1f

    .line 122
    .line 123
    .line 124
    const v23, 0x415a147b    # 13.63f

    .line 125
    .line 126
    .line 127
    const/high16 v24, 0x40c00000    # 6.0f

    .line 128
    .line 129
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 130
    .line 131
    .line 132
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 133
    .line 134
    .line 135
    const/high16 v25, 0x40c00000    # 6.0f

    .line 136
    .line 137
    const/high16 v26, 0x41980000    # 19.0f

    .line 138
    .line 139
    const v21, 0x410b851f    # 8.72f

    .line 140
    .line 141
    .line 142
    const/high16 v22, 0x40c00000    # 6.0f

    .line 143
    .line 144
    const/high16 v23, 0x40c00000    # 6.0f

    .line 145
    .line 146
    const v24, 0x4185851f    # 16.69f

    .line 147
    .line 148
    .line 149
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 150
    .line 151
    .line 152
    const/high16 v4, 0x40200000    # 2.5f

    .line 153
    .line 154
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 155
    .line 156
    .line 157
    const/high16 v4, 0x40e00000    # 7.0f

    .line 158
    .line 159
    const/high16 v6, 0x41a80000    # 21.0f

    .line 160
    .line 161
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 162
    .line 163
    .line 164
    const v25, 0x3e4ccccd    # 0.2f

    .line 165
    .line 166
    .line 167
    const v26, 0x3fb33333    # 1.4f

    .line 168
    .line 169
    .line 170
    const v21, -0x41570a3d    # -0.33f

    .line 171
    .line 172
    .line 173
    const v22, 0x3ee147ae    # 0.44f

    .line 174
    .line 175
    .line 176
    const v23, -0x418a3d71    # -0.24f

    .line 177
    .line 178
    .line 179
    const v24, 0x3f88f5c3    # 1.07f

    .line 180
    .line 181
    .line 182
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 183
    .line 184
    .line 185
    const v25, 0x3fb33333    # 1.4f

    .line 186
    .line 187
    .line 188
    const v26, -0x41b33333    # -0.2f

    .line 189
    .line 190
    .line 191
    const v21, 0x3ee147ae    # 0.44f

    .line 192
    .line 193
    .line 194
    const v22, 0x3ea8f5c3    # 0.33f

    .line 195
    .line 196
    .line 197
    const v23, 0x3f88f5c3    # 1.07f

    .line 198
    .line 199
    .line 200
    const v24, 0x3e75c28f    # 0.24f

    .line 201
    .line 202
    .line 203
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 204
    .line 205
    .line 206
    const/high16 v4, 0x41980000    # 19.0f

    .line 207
    .line 208
    const/high16 v6, 0x41300000    # 11.0f

    .line 209
    .line 210
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 211
    .line 212
    .line 213
    const/high16 v4, 0x40000000    # 2.0f

    .line 214
    .line 215
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 216
    .line 217
    .line 218
    const/high16 v4, 0x40400000    # 3.0f

    .line 219
    .line 220
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 221
    .line 222
    .line 223
    const/high16 v25, 0x3f800000    # 1.0f

    .line 224
    .line 225
    const/high16 v26, 0x3f800000    # 1.0f

    .line 226
    .line 227
    const/16 v21, 0x0

    .line 228
    .line 229
    const v22, 0x3f0ccccd    # 0.55f

    .line 230
    .line 231
    .line 232
    const v23, 0x3ee66666    # 0.45f

    .line 233
    .line 234
    .line 235
    const/high16 v24, 0x3f800000    # 1.0f

    .line 236
    .line 237
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 238
    .line 239
    .line 240
    const/4 v4, 0x0

    .line 241
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 242
    .line 243
    .line 244
    const/high16 v26, -0x40800000    # -1.0f

    .line 245
    .line 246
    const v21, 0x3f0ccccd    # 0.55f

    .line 247
    .line 248
    .line 249
    const/16 v22, 0x0

    .line 250
    .line 251
    const/high16 v23, 0x3f800000    # 1.0f

    .line 252
    .line 253
    const v24, -0x4119999a    # -0.45f

    .line 254
    .line 255
    .line 256
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 257
    .line 258
    .line 259
    const v4, -0x3fd28f5c    # -2.71f

    .line 260
    .line 261
    .line 262
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 263
    .line 264
    .line 265
    const v25, -0x42333333    # -0.1f

    .line 266
    .line 267
    .line 268
    const v26, -0x40dc28f6    # -0.64f

    .line 269
    .line 270
    .line 271
    const/16 v21, 0x0

    .line 272
    .line 273
    const v22, -0x419eb852    # -0.22f

    .line 274
    .line 275
    .line 276
    const v23, -0x42dc28f6    # -0.04f

    .line 277
    .line 278
    .line 279
    const v24, -0x4123d70a    # -0.43f

    .line 280
    .line 281
    .line 282
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 283
    .line 284
    .line 285
    const/high16 v4, 0x41500000    # 13.0f

    .line 286
    .line 287
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 288
    .line 289
    .line 290
    const v4, 0x3efae148    # 0.49f

    .line 291
    .line 292
    .line 293
    const v6, -0x3fd28f5c    # -2.71f

    .line 294
    .line 295
    .line 296
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 297
    .line 298
    .line 299
    const v25, 0x4060a3d7    # 3.51f

    .line 300
    .line 301
    .line 302
    const v26, 0x402147ae    # 2.52f

    .line 303
    .line 304
    .line 305
    const v21, 0x3f4f5c29    # 0.81f

    .line 306
    .line 307
    .line 308
    const v22, 0x3f9d70a4    # 1.23f

    .line 309
    .line 310
    .line 311
    const v23, 0x40033333    # 2.05f

    .line 312
    .line 313
    .line 314
    const v24, 0x4008f5c3    # 2.14f

    .line 315
    .line 316
    .line 317
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 318
    .line 319
    .line 320
    const/high16 v4, 0x41500000    # 13.0f

    .line 321
    .line 322
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 323
    .line 324
    .line 325
    const/high16 v25, 0x3f000000    # 0.5f

    .line 326
    .line 327
    const/high16 v26, 0x3f000000    # 0.5f

    .line 328
    .line 329
    const/16 v21, 0x0

    .line 330
    .line 331
    const v22, 0x3e8f5c29    # 0.28f

    .line 332
    .line 333
    .line 334
    const v23, 0x3e6147ae    # 0.22f

    .line 335
    .line 336
    .line 337
    const/high16 v24, 0x3f000000    # 0.5f

    .line 338
    .line 339
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 340
    .line 341
    .line 342
    const v4, 0x41547ae1    # 13.28f

    .line 343
    .line 344
    .line 345
    const/high16 v6, 0x41900000    # 18.0f

    .line 346
    .line 347
    const/high16 v7, 0x41500000    # 13.0f

    .line 348
    .line 349
    invoke-virtual {v2, v6, v4, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 350
    .line 351
    .line 352
    const/high16 v4, -0x41000000    # -0.5f

    .line 353
    .line 354
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 355
    .line 356
    .line 357
    const/high16 v26, -0x41000000    # -0.5f

    .line 358
    .line 359
    const v22, -0x4170a3d7    # -0.28f

    .line 360
    .line 361
    .line 362
    const/high16 v24, -0x41000000    # -0.5f

    .line 363
    .line 364
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 365
    .line 366
    .line 367
    const v4, 0x3e6147ae    # 0.22f

    .line 368
    .line 369
    .line 370
    const/high16 v6, 0x3f000000    # 0.5f

    .line 371
    .line 372
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 373
    .line 374
    .line 375
    const/high16 v4, 0x41200000    # 10.0f

    .line 376
    .line 377
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 378
    .line 379
    .line 380
    const/high16 v26, 0x3f000000    # 0.5f

    .line 381
    .line 382
    const v22, 0x3e8f5c29    # 0.28f

    .line 383
    .line 384
    .line 385
    const/high16 v24, 0x3f000000    # 0.5f

    .line 386
    .line 387
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 388
    .line 389
    .line 390
    const v4, -0x419eb852    # -0.22f

    .line 391
    .line 392
    .line 393
    const/high16 v6, -0x41000000    # -0.5f

    .line 394
    .line 395
    const/high16 v7, 0x3f000000    # 0.5f

    .line 396
    .line 397
    invoke-virtual {v2, v7, v4, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 398
    .line 399
    .line 400
    const/high16 v4, -0x3ee00000    # -10.0f

    .line 401
    .line 402
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 403
    .line 404
    .line 405
    const v25, 0x419428f6    # 18.52f

    .line 406
    .line 407
    .line 408
    const/high16 v26, 0x41300000    # 11.0f

    .line 409
    .line 410
    const/high16 v21, 0x41a00000    # 20.0f

    .line 411
    .line 412
    const v22, 0x413b5c29    # 11.71f

    .line 413
    .line 414
    .line 415
    const v23, 0x419b0a3d    # 19.38f

    .line 416
    .line 417
    .line 418
    const/high16 v24, 0x41300000    # 11.0f

    .line 419
    .line 420
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 421
    .line 422
    .line 423
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 424
    .line 425
    .line 426
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 427
    .line 428
    .line 429
    move-result-object v2

    .line 430
    const/16 v16, 0x3800

    .line 431
    .line 432
    const/16 v17, 0x0

    .line 433
    .line 434
    const/high16 v6, 0x3f800000    # 1.0f

    .line 435
    .line 436
    const/high16 v8, 0x3f800000    # 1.0f

    .line 437
    .line 438
    const/4 v7, 0x0

    .line 439
    const/high16 v9, 0x3f800000    # 1.0f

    .line 440
    .line 441
    const/high16 v12, 0x3f800000    # 1.0f

    .line 442
    .line 443
    const/4 v13, 0x0

    .line 444
    const/4 v14, 0x0

    .line 445
    const/4 v15, 0x0

    .line 446
    const-string v4, ""

    .line 447
    .line 448
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 449
    .line 450
    .line 451
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 452
    .line 453
    .line 454
    move-result v3

    .line 455
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 456
    .line 457
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 458
    .line 459
    .line 460
    move-result-wide v6

    .line 461
    const/4 v0, 0x0

    .line 462
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 463
    .line 464
    .line 465
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 466
    .line 467
    .line 468
    move-result v10

    .line 469
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 470
    .line 471
    .line 472
    move-result v11

    .line 473
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 474
    .line 475
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 476
    .line 477
    .line 478
    const v0, 0x4139999a    # 11.6f

    .line 479
    .line 480
    .line 481
    const v2, 0x403a3d71    # 2.91f

    .line 482
    .line 483
    .line 484
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 485
    .line 486
    .line 487
    const v17, -0x42333333    # -0.1f

    .line 488
    .line 489
    .line 490
    const v18, 0x3f170a3d    # 0.59f

    .line 491
    .line 492
    .line 493
    const v13, -0x428a3d71    # -0.06f

    .line 494
    .line 495
    .line 496
    const v14, 0x3e428f5c    # 0.19f

    .line 497
    .line 498
    .line 499
    const v15, -0x42333333    # -0.1f

    .line 500
    .line 501
    .line 502
    const v16, 0x3ec28f5c    # 0.38f

    .line 503
    .line 504
    .line 505
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 506
    .line 507
    .line 508
    const/high16 v17, 0x40000000    # 2.0f

    .line 509
    .line 510
    const/high16 v18, 0x40000000    # 2.0f

    .line 511
    .line 512
    const/4 v13, 0x0

    .line 513
    const v14, 0x3f8ccccd    # 1.1f

    .line 514
    .line 515
    .line 516
    const v15, 0x3f666666    # 0.9f

    .line 517
    .line 518
    .line 519
    const/high16 v16, 0x40000000    # 2.0f

    .line 520
    .line 521
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 522
    .line 523
    .line 524
    const v0, -0x4099999a    # -0.9f

    .line 525
    .line 526
    .line 527
    const/high16 v2, -0x40000000    # -2.0f

    .line 528
    .line 529
    const/high16 v4, 0x40000000    # 2.0f

    .line 530
    .line 531
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 532
    .line 533
    .line 534
    const/high16 v17, -0x40000000    # -2.0f

    .line 535
    .line 536
    const/high16 v18, -0x40000000    # -2.0f

    .line 537
    .line 538
    const v14, -0x40733333    # -1.1f

    .line 539
    .line 540
    .line 541
    const v15, -0x4099999a    # -0.9f

    .line 542
    .line 543
    .line 544
    const/high16 v16, -0x40000000    # -2.0f

    .line 545
    .line 546
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 547
    .line 548
    .line 549
    const v17, -0x40e8f5c3    # -0.59f

    .line 550
    .line 551
    .line 552
    const v18, 0x3dcccccd    # 0.1f

    .line 553
    .line 554
    .line 555
    const v13, -0x41a8f5c3    # -0.21f

    .line 556
    .line 557
    .line 558
    const/4 v14, 0x0

    .line 559
    const v15, -0x41333333    # -0.4f

    .line 560
    .line 561
    .line 562
    const v16, 0x3d23d70a    # 0.04f

    .line 563
    .line 564
    .line 565
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 566
    .line 567
    .line 568
    const/high16 v17, 0x41400000    # 12.0f

    .line 569
    .line 570
    const/high16 v18, 0x3f800000    # 1.0f

    .line 571
    .line 572
    const v13, 0x414c28f6    # 12.76f

    .line 573
    .line 574
    .line 575
    const/high16 v14, 0x3fa00000    # 1.25f

    .line 576
    .line 577
    const v15, 0x41468f5c    # 12.41f

    .line 578
    .line 579
    .line 580
    const/high16 v16, 0x3f800000    # 1.0f

    .line 581
    .line 582
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 583
    .line 584
    .line 585
    const/high16 v17, -0x40800000    # -1.0f

    .line 586
    .line 587
    const v13, -0x40f33333    # -0.55f

    .line 588
    .line 589
    .line 590
    const/4 v14, 0x0

    .line 591
    const/high16 v15, -0x40800000    # -1.0f

    .line 592
    .line 593
    const v16, 0x3ee66666    # 0.45f

    .line 594
    .line 595
    .line 596
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 597
    .line 598
    .line 599
    const v17, 0x4139999a    # 11.6f

    .line 600
    .line 601
    .line 602
    const v18, 0x403a3d71    # 2.91f

    .line 603
    .line 604
    .line 605
    const/high16 v13, 0x41300000    # 11.0f

    .line 606
    .line 607
    const v14, 0x401a3d71    # 2.41f

    .line 608
    .line 609
    .line 610
    const/high16 v15, 0x41340000    # 11.25f

    .line 611
    .line 612
    const v16, 0x4030a3d7    # 2.76f

    .line 613
    .line 614
    .line 615
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 616
    .line 617
    .line 618
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 619
    .line 620
    .line 621
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 622
    .line 623
    .line 624
    move-result-object v2

    .line 625
    const/16 v16, 0x3800

    .line 626
    .line 627
    const/16 v17, 0x0

    .line 628
    .line 629
    const/high16 v6, 0x3f800000    # 1.0f

    .line 630
    .line 631
    const/4 v7, 0x0

    .line 632
    const/high16 v12, 0x3f800000    # 1.0f

    .line 633
    .line 634
    const/4 v13, 0x0

    .line 635
    const/4 v14, 0x0

    .line 636
    const/4 v15, 0x0

    .line 637
    const-string v4, ""

    .line 638
    .line 639
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 640
    .line 641
    .line 642
    move-result-object v0

    .line 643
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 644
    .line 645
    .line 646
    move-result-object v0

    .line 647
    sput-object v0, Landroidx/compose/material/icons/rounded/ElderlyWomanKt;->_elderlyWoman:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 648
    .line 649
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 650
    .line 651
    .line 652
    return-object v0
.end method
