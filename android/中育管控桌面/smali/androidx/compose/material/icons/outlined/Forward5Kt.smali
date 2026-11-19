.class public final Landroidx/compose/material/icons/outlined/Forward5Kt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_forward5",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "Forward5",
        "Landroidx/compose/material/icons/Icons$Outlined;",
        "getForward5",
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
        "SMAP\nForward5.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Forward5.kt\nandroidx/compose/material/icons/outlined/Forward5Kt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,89:1\n212#2,12:90\n233#2,18:103\n253#2:140\n174#3:102\n705#4,2:121\n717#4,2:123\n719#4,11:129\n72#5,4:125\n*S KotlinDebug\n*F\n+ 1 Forward5.kt\nandroidx/compose/material/icons/outlined/Forward5Kt\n*L\n29#1:90,12\n30#1:103,18\n30#1:140\n29#1:102\n30#1:121,2\n30#1:123,2\n30#1:129,11\n30#1:125,4\n*E\n"
    }
.end annotation


# static fields
.field private static _forward5:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getForward5(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/outlined/Forward5Kt;->_forward5:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Outlined.Forward5"

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
    const v0, 0x418f999a    # 17.95f

    .line 71
    .line 72
    .line 73
    const/high16 v2, 0x41500000    # 13.0f

    .line 74
    .line 75
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    const/high16 v17, -0x3f400000    # -6.0f

    .line 79
    .line 80
    const/high16 v18, 0x40c00000    # 6.0f

    .line 81
    .line 82
    const/4 v13, 0x0

    .line 83
    const v14, 0x4053d70a    # 3.31f

    .line 84
    .line 85
    .line 86
    const v15, -0x3fd3d70a    # -2.69f

    .line 87
    .line 88
    .line 89
    const/high16 v16, 0x40c00000    # 6.0f

    .line 90
    .line 91
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 92
    .line 93
    .line 94
    const v0, -0x3fd3d70a    # -2.69f

    .line 95
    .line 96
    .line 97
    const/high16 v2, -0x3f400000    # -6.0f

    .line 98
    .line 99
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 100
    .line 101
    .line 102
    const v0, 0x402c28f6    # 2.69f

    .line 103
    .line 104
    .line 105
    const/high16 v2, 0x40c00000    # 6.0f

    .line 106
    .line 107
    const/high16 v4, -0x3f400000    # -6.0f

    .line 108
    .line 109
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 110
    .line 111
    .line 112
    const/high16 v0, 0x40800000    # 4.0f

    .line 113
    .line 114
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 115
    .line 116
    .line 117
    const/high16 v0, 0x40a00000    # 5.0f

    .line 118
    .line 119
    const/high16 v2, -0x3f600000    # -5.0f

    .line 120
    .line 121
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 122
    .line 123
    .line 124
    const/high16 v0, -0x3f600000    # -5.0f

    .line 125
    .line 126
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 127
    .line 128
    .line 129
    const/high16 v0, 0x40800000    # 4.0f

    .line 130
    .line 131
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 132
    .line 133
    .line 134
    const/high16 v17, -0x3f000000    # -8.0f

    .line 135
    .line 136
    const/high16 v18, 0x41000000    # 8.0f

    .line 137
    .line 138
    const v13, -0x3f728f5c    # -4.42f

    .line 139
    .line 140
    .line 141
    const/4 v14, 0x0

    .line 142
    const/high16 v15, -0x3f000000    # -8.0f

    .line 143
    .line 144
    const v16, 0x40651eb8    # 3.58f

    .line 145
    .line 146
    .line 147
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 148
    .line 149
    .line 150
    const v0, 0x40651eb8    # 3.58f

    .line 151
    .line 152
    .line 153
    const/high16 v2, 0x41000000    # 8.0f

    .line 154
    .line 155
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 156
    .line 157
    .line 158
    const v0, -0x3f9ae148    # -3.58f

    .line 159
    .line 160
    .line 161
    const/high16 v2, -0x3f000000    # -8.0f

    .line 162
    .line 163
    const/high16 v4, 0x41000000    # 8.0f

    .line 164
    .line 165
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 166
    .line 167
    .line 168
    const/high16 v0, -0x40000000    # -2.0f

    .line 169
    .line 170
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 171
    .line 172
    .line 173
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 174
    .line 175
    .line 176
    const v0, 0x4146e148    # 12.43f

    .line 177
    .line 178
    .line 179
    const v2, 0x41726666    # 15.15f

    .line 180
    .line 181
    .line 182
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 183
    .line 184
    .line 185
    const v17, -0x41c7ae14    # -0.18f

    .line 186
    .line 187
    .line 188
    const v18, 0x3e2e147b    # 0.17f

    .line 189
    .line 190
    .line 191
    const v13, -0x42b33333    # -0.05f

    .line 192
    .line 193
    .line 194
    const v14, 0x3d8f5c29    # 0.07f

    .line 195
    .line 196
    .line 197
    const v15, -0x421eb852    # -0.11f

    .line 198
    .line 199
    .line 200
    const v16, 0x3e051eb8    # 0.13f

    .line 201
    .line 202
    .line 203
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 204
    .line 205
    .line 206
    const v0, -0x4175c28f    # -0.27f

    .line 207
    .line 208
    .line 209
    const v2, 0x3d75c28f    # 0.06f

    .line 210
    .line 211
    .line 212
    const v4, -0x41d1eb85    # -0.17f

    .line 213
    .line 214
    .line 215
    invoke-virtual {v12, v4, v2, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 216
    .line 217
    .line 218
    const v17, -0x4128f5c3    # -0.42f

    .line 219
    .line 220
    .line 221
    const v18, -0x41e66666    # -0.15f

    .line 222
    .line 223
    .line 224
    const v13, -0x41d1eb85    # -0.17f

    .line 225
    .line 226
    .line 227
    const/4 v14, 0x0

    .line 228
    const v15, -0x416147ae    # -0.31f

    .line 229
    .line 230
    .line 231
    const v16, -0x42b33333    # -0.05f

    .line 232
    .line 233
    .line 234
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 235
    .line 236
    .line 237
    const v0, -0x418a3d71    # -0.24f

    .line 238
    .line 239
    .line 240
    const v2, -0x41bd70a4    # -0.19f

    .line 241
    .line 242
    .line 243
    const v4, -0x412e147b    # -0.41f

    .line 244
    .line 245
    .line 246
    const v6, -0x41d1eb85    # -0.17f

    .line 247
    .line 248
    .line 249
    invoke-virtual {v12, v6, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 250
    .line 251
    .line 252
    const v0, -0x40a8f5c3    # -0.84f

    .line 253
    .line 254
    .line 255
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 256
    .line 257
    .line 258
    const v17, 0x3e051eb8    # 0.13f

    .line 259
    .line 260
    .line 261
    const v18, 0x3f07ae14    # 0.53f

    .line 262
    .line 263
    .line 264
    const v13, 0x3c23d70a    # 0.01f

    .line 265
    .line 266
    .line 267
    const v14, 0x3e4ccccd    # 0.2f

    .line 268
    .line 269
    .line 270
    const v15, 0x3d4ccccd    # 0.05f

    .line 271
    .line 272
    .line 273
    const v16, 0x3ebd70a4    # 0.37f

    .line 274
    .line 275
    .line 276
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 277
    .line 278
    .line 279
    const v0, 0x3ea3d70a    # 0.32f

    .line 280
    .line 281
    .line 282
    const v2, 0x3ec7ae14    # 0.39f

    .line 283
    .line 284
    .line 285
    const v4, 0x3e428f5c    # 0.19f

    .line 286
    .line 287
    .line 288
    const v6, 0x3e8f5c29    # 0.28f

    .line 289
    .line 290
    .line 291
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 292
    .line 293
    .line 294
    const v0, 0x3e947ae1    # 0.29f

    .line 295
    .line 296
    .line 297
    const v2, 0x3eeb851f    # 0.46f

    .line 298
    .line 299
    .line 300
    const v4, 0x3e75c28f    # 0.24f

    .line 301
    .line 302
    .line 303
    const v6, 0x3e428f5c    # 0.19f

    .line 304
    .line 305
    .line 306
    invoke-virtual {v12, v0, v6, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 307
    .line 308
    .line 309
    const v0, 0x3eb33333    # 0.35f

    .line 310
    .line 311
    .line 312
    const v2, 0x3f07ae14    # 0.53f

    .line 313
    .line 314
    .line 315
    const v4, 0x3da3d70a    # 0.08f

    .line 316
    .line 317
    .line 318
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 319
    .line 320
    .line 321
    const v17, 0x3f23d70a    # 0.64f

    .line 322
    .line 323
    .line 324
    const v18, -0x420a3d71    # -0.12f

    .line 325
    .line 326
    .line 327
    const v13, 0x3e75c28f    # 0.24f

    .line 328
    .line 329
    .line 330
    const/4 v14, 0x0

    .line 331
    const v15, 0x3eeb851f    # 0.46f

    .line 332
    .line 333
    .line 334
    const v16, -0x42dc28f6    # -0.04f

    .line 335
    .line 336
    .line 337
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 338
    .line 339
    .line 340
    const v0, 0x3ee66666    # 0.45f

    .line 341
    .line 342
    .line 343
    const v2, -0x416147ae    # -0.31f

    .line 344
    .line 345
    .line 346
    const v4, -0x41c7ae14    # -0.18f

    .line 347
    .line 348
    .line 349
    const v6, 0x3ea8f5c3    # 0.33f

    .line 350
    .line 351
    .line 352
    invoke-virtual {v12, v6, v4, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 353
    .line 354
    .line 355
    const v0, 0x3e8a3d71    # 0.27f

    .line 356
    .line 357
    .line 358
    const v2, -0x4119999a    # -0.45f

    .line 359
    .line 360
    .line 361
    const v4, -0x4170a3d7    # -0.28f

    .line 362
    .line 363
    .line 364
    const v6, 0x3e570a3d    # 0.21f

    .line 365
    .line 366
    .line 367
    invoke-virtual {v12, v6, v4, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 368
    .line 369
    .line 370
    const v0, -0x414ccccd    # -0.35f

    .line 371
    .line 372
    .line 373
    const v2, -0x40f5c28f    # -0.54f

    .line 374
    .line 375
    .line 376
    const v4, 0x3db851ec    # 0.09f

    .line 377
    .line 378
    .line 379
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 380
    .line 381
    .line 382
    const v17, -0x4247ae14    # -0.09f

    .line 383
    .line 384
    .line 385
    const v18, -0x40e66666    # -0.6f

    .line 386
    .line 387
    .line 388
    const/4 v13, 0x0

    .line 389
    const v14, -0x419eb852    # -0.22f

    .line 390
    .line 391
    .line 392
    const v15, -0x430a3d71    # -0.03f

    .line 393
    .line 394
    .line 395
    const v16, -0x4123d70a    # -0.43f

    .line 396
    .line 397
    .line 398
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 399
    .line 400
    .line 401
    const v0, -0x41f0a3d7    # -0.14f

    .line 402
    .line 403
    .line 404
    const v2, -0x41570a3d    # -0.33f

    .line 405
    .line 406
    .line 407
    const v4, -0x4119999a    # -0.45f

    .line 408
    .line 409
    .line 410
    const/high16 v6, -0x41800000    # -0.25f

    .line 411
    .line 412
    invoke-virtual {v12, v0, v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 413
    .line 414
    .line 415
    const v0, -0x419eb852    # -0.22f

    .line 416
    .line 417
    .line 418
    const v2, -0x4170a3d7    # -0.28f

    .line 419
    .line 420
    .line 421
    const v4, -0x412e147b    # -0.41f

    .line 422
    .line 423
    .line 424
    invoke-virtual {v12, v6, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 425
    .line 426
    .line 427
    const v0, -0x4151eb85    # -0.34f

    .line 428
    .line 429
    .line 430
    const v2, -0x40f33333    # -0.55f

    .line 431
    .line 432
    .line 433
    const v4, -0x42333333    # -0.1f

    .line 434
    .line 435
    .line 436
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 437
    .line 438
    .line 439
    const v17, -0x41b33333    # -0.2f

    .line 440
    .line 441
    .line 442
    const v18, 0x3ca3d70a    # 0.02f

    .line 443
    .line 444
    .line 445
    const v13, -0x4270a3d7    # -0.07f

    .line 446
    .line 447
    .line 448
    const/4 v14, 0x0

    .line 449
    const v15, -0x41f0a3d7    # -0.14f

    .line 450
    .line 451
    .line 452
    const v16, 0x3c23d70a    # 0.01f

    .line 453
    .line 454
    .line 455
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 456
    .line 457
    .line 458
    const v0, -0x41fae148    # -0.13f

    .line 459
    .line 460
    .line 461
    const v2, 0x3ca3d70a    # 0.02f

    .line 462
    .line 463
    .line 464
    const v4, -0x41c7ae14    # -0.18f

    .line 465
    .line 466
    .line 467
    const v6, 0x3d23d70a    # 0.04f

    .line 468
    .line 469
    .line 470
    invoke-virtual {v12, v0, v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 471
    .line 472
    .line 473
    const v0, 0x3cf5c28f    # 0.03f

    .line 474
    .line 475
    .line 476
    const v2, -0x41e66666    # -0.15f

    .line 477
    .line 478
    .line 479
    const v4, 0x3d4ccccd    # 0.05f

    .line 480
    .line 481
    .line 482
    const v6, -0x42333333    # -0.1f

    .line 483
    .line 484
    .line 485
    invoke-virtual {v12, v6, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 486
    .line 487
    .line 488
    const v0, -0x425c28f6    # -0.08f

    .line 489
    .line 490
    .line 491
    const v2, -0x421eb852    # -0.11f

    .line 492
    .line 493
    .line 494
    const v6, 0x3d23d70a    # 0.04f

    .line 495
    .line 496
    .line 497
    invoke-virtual {v12, v0, v6, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 498
    .line 499
    .line 500
    const v0, 0x3de147ae    # 0.11f

    .line 501
    .line 502
    .line 503
    const v2, -0x40947ae1    # -0.92f

    .line 504
    .line 505
    .line 506
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 507
    .line 508
    .line 509
    const v0, 0x3fd9999a    # 1.7f

    .line 510
    .line 511
    .line 512
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 513
    .line 514
    .line 515
    const v0, -0x40ca3d71    # -0.71f

    .line 516
    .line 517
    .line 518
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 519
    .line 520
    .line 521
    const v0, 0x412e6666    # 10.9f

    .line 522
    .line 523
    .line 524
    const v2, 0x413bd70a    # 11.74f

    .line 525
    .line 526
    .line 527
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 528
    .line 529
    .line 530
    const v0, 0x400ae148    # 2.17f

    .line 531
    .line 532
    .line 533
    const/high16 v2, -0x41800000    # -0.25f

    .line 534
    .line 535
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 536
    .line 537
    .line 538
    const v0, 0x3f2b851f    # 0.67f

    .line 539
    .line 540
    .line 541
    const v2, 0x3e2e147b    # 0.17f

    .line 542
    .line 543
    .line 544
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 545
    .line 546
    .line 547
    const v17, 0x3dcccccd    # 0.1f

    .line 548
    .line 549
    .line 550
    const v18, -0x4247ae14    # -0.09f

    .line 551
    .line 552
    .line 553
    const v13, 0x3cf5c28f    # 0.03f

    .line 554
    .line 555
    .line 556
    const v14, -0x430a3d71    # -0.03f

    .line 557
    .line 558
    .line 559
    const v15, 0x3d75c28f    # 0.06f

    .line 560
    .line 561
    .line 562
    const v16, -0x428a3d71    # -0.06f

    .line 563
    .line 564
    .line 565
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 566
    .line 567
    .line 568
    const v0, 0x3df5c28f    # 0.12f

    .line 569
    .line 570
    .line 571
    const v2, -0x4270a3d7    # -0.07f

    .line 572
    .line 573
    .line 574
    const v4, 0x3d8f5c29    # 0.07f

    .line 575
    .line 576
    .line 577
    const v6, -0x42b33333    # -0.05f

    .line 578
    .line 579
    .line 580
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 581
    .line 582
    .line 583
    const v0, 0x3e19999a    # 0.15f

    .line 584
    .line 585
    .line 586
    const v2, -0x42b33333    # -0.05f

    .line 587
    .line 588
    .line 589
    const v4, 0x3dcccccd    # 0.1f

    .line 590
    .line 591
    .line 592
    const v6, -0x42dc28f6    # -0.04f

    .line 593
    .line 594
    .line 595
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 596
    .line 597
    .line 598
    const v0, 0x3e4ccccd    # 0.2f

    .line 599
    .line 600
    .line 601
    const v2, -0x435c28f6    # -0.02f

    .line 602
    .line 603
    .line 604
    const v4, 0x3e051eb8    # 0.13f

    .line 605
    .line 606
    .line 607
    const v6, -0x435c28f6    # -0.02f

    .line 608
    .line 609
    .line 610
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 611
    .line 612
    .line 613
    const v17, 0x3e99999a    # 0.3f

    .line 614
    .line 615
    .line 616
    const v18, 0x3d4ccccd    # 0.05f

    .line 617
    .line 618
    .line 619
    const v13, 0x3df5c28f    # 0.12f

    .line 620
    .line 621
    .line 622
    const/4 v14, 0x0

    .line 623
    const v15, 0x3e6147ae    # 0.22f

    .line 624
    .line 625
    .line 626
    const v16, 0x3ca3d70a    # 0.02f

    .line 627
    .line 628
    .line 629
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 630
    .line 631
    .line 632
    const v0, 0x3e23d70a    # 0.16f

    .line 633
    .line 634
    .line 635
    const v2, 0x3e19999a    # 0.15f

    .line 636
    .line 637
    .line 638
    const v4, 0x3e570a3d    # 0.21f

    .line 639
    .line 640
    .line 641
    const v6, 0x3db851ec    # 0.09f

    .line 642
    .line 643
    .line 644
    invoke-virtual {v12, v0, v6, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 645
    .line 646
    .line 647
    const v0, 0x3e0f5c29    # 0.14f

    .line 648
    .line 649
    .line 650
    const v2, 0x3e051eb8    # 0.13f

    .line 651
    .line 652
    .line 653
    const v4, 0x3e75c28f    # 0.24f

    .line 654
    .line 655
    .line 656
    const v6, 0x3dcccccd    # 0.1f

    .line 657
    .line 658
    .line 659
    invoke-virtual {v12, v6, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 660
    .line 661
    .line 662
    const v0, 0x3e9eb852    # 0.31f

    .line 663
    .line 664
    .line 665
    const v2, 0x3e428f5c    # 0.19f

    .line 666
    .line 667
    .line 668
    const v4, 0x3d23d70a    # 0.04f

    .line 669
    .line 670
    .line 671
    invoke-virtual {v12, v4, v2, v4, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 672
    .line 673
    .line 674
    const v0, -0x430a3d71    # -0.03f

    .line 675
    .line 676
    .line 677
    const v2, 0x3e9eb852    # 0.31f

    .line 678
    .line 679
    .line 680
    const v4, -0x43dc28f6    # -0.01f

    .line 681
    .line 682
    .line 683
    const v6, 0x3e6147ae    # 0.22f

    .line 684
    .line 685
    .line 686
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 687
    .line 688
    .line 689
    const v0, -0x428a3d71    # -0.06f

    .line 690
    .line 691
    .line 692
    const v2, 0x3e2e147b    # 0.17f

    .line 693
    .line 694
    .line 695
    const v4, -0x421eb852    # -0.11f

    .line 696
    .line 697
    .line 698
    const v6, 0x3e75c28f    # 0.24f

    .line 699
    .line 700
    .line 701
    invoke-virtual {v12, v0, v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 702
    .line 703
    .line 704
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 705
    .line 706
    .line 707
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 708
    .line 709
    .line 710
    move-result-object v2

    .line 711
    const/16 v16, 0x3800

    .line 712
    .line 713
    const/16 v17, 0x0

    .line 714
    .line 715
    const/high16 v6, 0x3f800000    # 1.0f

    .line 716
    .line 717
    const/high16 v8, 0x3f800000    # 1.0f

    .line 718
    .line 719
    const/4 v7, 0x0

    .line 720
    const/high16 v9, 0x3f800000    # 1.0f

    .line 721
    .line 722
    const/high16 v12, 0x3f800000    # 1.0f

    .line 723
    .line 724
    const/4 v13, 0x0

    .line 725
    const/4 v15, 0x0

    .line 726
    const-string v4, ""

    .line 727
    .line 728
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 729
    .line 730
    .line 731
    move-result-object v0

    .line 732
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 733
    .line 734
    .line 735
    move-result-object v0

    .line 736
    sput-object v0, Landroidx/compose/material/icons/outlined/Forward5Kt;->_forward5:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 737
    .line 738
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 739
    .line 740
    .line 741
    return-object v0
.end method
