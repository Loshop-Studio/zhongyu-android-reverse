.class public final Landroidx/compose/material/icons/sharp/Forward30Kt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_forward30",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "Forward30",
        "Landroidx/compose/material/icons/Icons$Sharp;",
        "getForward30",
        "(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;",
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
        "SMAP\nForward30.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Forward30.kt\nandroidx/compose/material/icons/sharp/Forward30Kt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,141:1\n212#2,12:142\n233#2,18:155\n253#2:192\n174#3:154\n705#4,2:173\n717#4,2:175\n719#4,11:181\n72#5,4:177\n*S KotlinDebug\n*F\n+ 1 Forward30.kt\nandroidx/compose/material/icons/sharp/Forward30Kt\n*L\n29#1:142,12\n30#1:155,18\n30#1:192\n29#1:154\n30#1:173,2\n30#1:175,2\n30#1:181,11\n30#1:177,4\n*E\n"
    }
.end annotation


# static fields
.field private static _forward30:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getForward30(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/sharp/Forward30Kt;->_forward30:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Sharp.Forward30"

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
    const/high16 v0, 0x41900000    # 18.0f

    .line 71
    .line 72
    const/high16 v2, 0x41500000    # 13.0f

    .line 73
    .line 74
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v17, -0x3f400000    # -6.0f

    .line 78
    .line 79
    const/high16 v18, 0x40c00000    # 6.0f

    .line 80
    .line 81
    const/4 v13, 0x0

    .line 82
    const v14, 0x4053d70a    # 3.31f

    .line 83
    .line 84
    .line 85
    const v15, -0x3fd3d70a    # -2.69f

    .line 86
    .line 87
    .line 88
    const/high16 v16, 0x40c00000    # 6.0f

    .line 89
    .line 90
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 91
    .line 92
    .line 93
    const v0, -0x3fd3d70a    # -2.69f

    .line 94
    .line 95
    .line 96
    const/high16 v2, -0x3f400000    # -6.0f

    .line 97
    .line 98
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 99
    .line 100
    .line 101
    const v0, 0x402c28f6    # 2.69f

    .line 102
    .line 103
    .line 104
    const/high16 v2, 0x40c00000    # 6.0f

    .line 105
    .line 106
    const/high16 v4, -0x3f400000    # -6.0f

    .line 107
    .line 108
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 109
    .line 110
    .line 111
    const/high16 v0, 0x40800000    # 4.0f

    .line 112
    .line 113
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 114
    .line 115
    .line 116
    const/high16 v0, 0x40a00000    # 5.0f

    .line 117
    .line 118
    const/high16 v2, -0x3f600000    # -5.0f

    .line 119
    .line 120
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 121
    .line 122
    .line 123
    const/high16 v0, -0x3f600000    # -5.0f

    .line 124
    .line 125
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 126
    .line 127
    .line 128
    const/high16 v0, 0x40800000    # 4.0f

    .line 129
    .line 130
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 131
    .line 132
    .line 133
    const/high16 v17, -0x3f000000    # -8.0f

    .line 134
    .line 135
    const/high16 v18, 0x41000000    # 8.0f

    .line 136
    .line 137
    const v13, -0x3f728f5c    # -4.42f

    .line 138
    .line 139
    .line 140
    const/4 v14, 0x0

    .line 141
    const/high16 v15, -0x3f000000    # -8.0f

    .line 142
    .line 143
    const v16, 0x40651eb8    # 3.58f

    .line 144
    .line 145
    .line 146
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 147
    .line 148
    .line 149
    const v0, 0x40651eb8    # 3.58f

    .line 150
    .line 151
    .line 152
    const/high16 v2, 0x41000000    # 8.0f

    .line 153
    .line 154
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 155
    .line 156
    .line 157
    const v0, -0x3f9ae148    # -3.58f

    .line 158
    .line 159
    .line 160
    const/high16 v2, -0x3f000000    # -8.0f

    .line 161
    .line 162
    const/high16 v4, 0x41000000    # 8.0f

    .line 163
    .line 164
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 165
    .line 166
    .line 167
    const/high16 v0, -0x40000000    # -2.0f

    .line 168
    .line 169
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 170
    .line 171
    .line 172
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 173
    .line 174
    .line 175
    const v0, 0x4128a3d7    # 10.54f

    .line 176
    .line 177
    .line 178
    const v2, 0x4173851f    # 15.22f

    .line 179
    .line 180
    .line 181
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 182
    .line 183
    .line 184
    const v17, -0x41b33333    # -0.2f

    .line 185
    .line 186
    .line 187
    const v18, 0x3df5c28f    # 0.12f

    .line 188
    .line 189
    .line 190
    const v13, -0x428a3d71    # -0.06f

    .line 191
    .line 192
    .line 193
    const v14, 0x3d4ccccd    # 0.05f

    .line 194
    .line 195
    .line 196
    const v15, -0x420a3d71    # -0.12f

    .line 197
    .line 198
    .line 199
    const v16, 0x3db851ec    # 0.09f

    .line 200
    .line 201
    .line 202
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 203
    .line 204
    .line 205
    const v0, -0x4175c28f    # -0.27f

    .line 206
    .line 207
    .line 208
    const v2, -0x41d1eb85    # -0.17f

    .line 209
    .line 210
    .line 211
    const v4, 0x3d23d70a    # 0.04f

    .line 212
    .line 213
    .line 214
    invoke-virtual {v12, v2, v4, v0, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 215
    .line 216
    .line 217
    const/high16 v17, -0x41800000    # -0.25f

    .line 218
    .line 219
    const v18, -0x42dc28f6    # -0.04f

    .line 220
    .line 221
    .line 222
    const v13, -0x4247ae14    # -0.09f

    .line 223
    .line 224
    .line 225
    const/4 v14, 0x0

    .line 226
    const v15, -0x41d1eb85    # -0.17f

    .line 227
    .line 228
    .line 229
    const v16, -0x43dc28f6    # -0.01f

    .line 230
    .line 231
    .line 232
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 233
    .line 234
    .line 235
    const v0, -0x428a3d71    # -0.06f

    .line 236
    .line 237
    .line 238
    const v2, -0x41b33333    # -0.2f

    .line 239
    .line 240
    .line 241
    const v4, -0x421eb852    # -0.11f

    .line 242
    .line 243
    .line 244
    const v6, -0x41f0a3d7    # -0.14f

    .line 245
    .line 246
    .line 247
    invoke-virtual {v12, v6, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 248
    .line 249
    .line 250
    const v0, -0x41fae148    # -0.13f

    .line 251
    .line 252
    .line 253
    const v2, -0x42333333    # -0.1f

    .line 254
    .line 255
    .line 256
    const v4, -0x41d1eb85    # -0.17f

    .line 257
    .line 258
    .line 259
    invoke-virtual {v12, v2, v2, v0, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 260
    .line 261
    .line 262
    const v0, -0x419eb852    # -0.22f

    .line 263
    .line 264
    .line 265
    const v2, -0x42b33333    # -0.05f

    .line 266
    .line 267
    .line 268
    const v4, -0x41f0a3d7    # -0.14f

    .line 269
    .line 270
    .line 271
    invoke-virtual {v12, v2, v4, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 272
    .line 273
    .line 274
    const v0, -0x40a66666    # -0.85f

    .line 275
    .line 276
    .line 277
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 278
    .line 279
    .line 280
    const v17, 0x3df5c28f    # 0.12f

    .line 281
    .line 282
    .line 283
    const v18, 0x3f0ccccd    # 0.55f

    .line 284
    .line 285
    .line 286
    const/4 v13, 0x0

    .line 287
    const v14, 0x3e570a3d    # 0.21f

    .line 288
    .line 289
    .line 290
    const v15, 0x3d23d70a    # 0.04f

    .line 291
    .line 292
    .line 293
    const v16, 0x3ec7ae14    # 0.39f

    .line 294
    .line 295
    .line 296
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 297
    .line 298
    .line 299
    const v0, 0x3e8f5c29    # 0.28f

    .line 300
    .line 301
    .line 302
    const v2, 0x3ec28f5c    # 0.38f

    .line 303
    .line 304
    .line 305
    const v4, 0x3ea8f5c3    # 0.33f

    .line 306
    .line 307
    .line 308
    const v6, 0x3e428f5c    # 0.19f

    .line 309
    .line 310
    .line 311
    invoke-virtual {v12, v6, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 312
    .line 313
    .line 314
    const v0, 0x3eeb851f    # 0.46f

    .line 315
    .line 316
    .line 317
    const v2, 0x3e6b851f    # 0.23f

    .line 318
    .line 319
    .line 320
    const v4, 0x3e947ae1    # 0.29f

    .line 321
    .line 322
    .line 323
    const v6, 0x3e3851ec    # 0.18f

    .line 324
    .line 325
    .line 326
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 327
    .line 328
    .line 329
    const v0, 0x3f07ae14    # 0.53f

    .line 330
    .line 331
    .line 332
    const v2, 0x3d8f5c29    # 0.07f

    .line 333
    .line 334
    .line 335
    const v4, 0x3eb33333    # 0.35f

    .line 336
    .line 337
    .line 338
    const v6, 0x3d8f5c29    # 0.07f

    .line 339
    .line 340
    .line 341
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 342
    .line 343
    .line 344
    const v17, 0x3f19999a    # 0.6f

    .line 345
    .line 346
    .line 347
    const v18, -0x425c28f6    # -0.08f

    .line 348
    .line 349
    .line 350
    const v13, 0x3e570a3d    # 0.21f

    .line 351
    .line 352
    .line 353
    const/4 v14, 0x0

    .line 354
    const v15, 0x3ed1eb85    # 0.41f

    .line 355
    .line 356
    .line 357
    const v16, -0x430a3d71    # -0.03f

    .line 358
    .line 359
    .line 360
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 361
    .line 362
    .line 363
    const v0, 0x3ef5c28f    # 0.48f

    .line 364
    .line 365
    .line 366
    const v2, -0x418a3d71    # -0.24f

    .line 367
    .line 368
    .line 369
    const v4, -0x41f0a3d7    # -0.14f

    .line 370
    .line 371
    .line 372
    const v6, 0x3eae147b    # 0.34f

    .line 373
    .line 374
    .line 375
    invoke-virtual {v12, v6, v4, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 376
    .line 377
    .line 378
    const v0, 0x3ea3d70a    # 0.32f

    .line 379
    .line 380
    .line 381
    const v2, -0x413851ec    # -0.39f

    .line 382
    .line 383
    .line 384
    const v4, 0x3e75c28f    # 0.24f

    .line 385
    .line 386
    .line 387
    const v6, -0x418a3d71    # -0.24f

    .line 388
    .line 389
    .line 390
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 391
    .line 392
    .line 393
    const v0, -0x40f851ec    # -0.53f

    .line 394
    .line 395
    .line 396
    const v2, -0x41570a3d    # -0.33f

    .line 397
    .line 398
    .line 399
    const v4, 0x3df5c28f    # 0.12f

    .line 400
    .line 401
    .line 402
    invoke-virtual {v12, v4, v2, v4, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 403
    .line 404
    .line 405
    const v17, -0x41c7ae14    # -0.18f

    .line 406
    .line 407
    .line 408
    const v18, -0x40e3d70a    # -0.61f

    .line 409
    .line 410
    .line 411
    const/4 v13, 0x0

    .line 412
    const v14, -0x41947ae1    # -0.23f

    .line 413
    .line 414
    .line 415
    const v15, -0x428a3d71    # -0.06f

    .line 416
    .line 417
    .line 418
    const v16, -0x411eb852    # -0.44f

    .line 419
    .line 420
    .line 421
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 422
    .line 423
    .line 424
    const v0, -0x40f5c28f    # -0.54f

    .line 425
    .line 426
    .line 427
    const v2, -0x413851ec    # -0.39f

    .line 428
    .line 429
    .line 430
    const v4, -0x41666666    # -0.3f

    .line 431
    .line 432
    .line 433
    invoke-virtual {v12, v4, v4, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 434
    .line 435
    .line 436
    const v17, 0x3e8f5c29    # 0.28f

    .line 437
    .line 438
    .line 439
    const v18, -0x41d1eb85    # -0.17f

    .line 440
    .line 441
    .line 442
    const v13, 0x3dcccccd    # 0.1f

    .line 443
    .line 444
    .line 445
    const v14, -0x42b33333    # -0.05f

    .line 446
    .line 447
    .line 448
    const v15, 0x3e4ccccd    # 0.2f

    .line 449
    .line 450
    .line 451
    const v16, -0x42333333    # -0.1f

    .line 452
    .line 453
    .line 454
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 455
    .line 456
    .line 457
    const v0, 0x3e4ccccd    # 0.2f

    .line 458
    .line 459
    .line 460
    const v2, -0x419eb852    # -0.22f

    .line 461
    .line 462
    .line 463
    const v4, -0x41f0a3d7    # -0.14f

    .line 464
    .line 465
    .line 466
    const v6, 0x3e19999a    # 0.15f

    .line 467
    .line 468
    .line 469
    invoke-virtual {v12, v6, v4, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 470
    .line 471
    .line 472
    const v0, 0x3e051eb8    # 0.13f

    .line 473
    .line 474
    .line 475
    const/high16 v2, -0x41800000    # -0.25f

    .line 476
    .line 477
    const v4, 0x3dcccccd    # 0.1f

    .line 478
    .line 479
    .line 480
    const v6, -0x41dc28f6    # -0.16f

    .line 481
    .line 482
    .line 483
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 484
    .line 485
    .line 486
    const v0, -0x4175c28f    # -0.27f

    .line 487
    .line 488
    .line 489
    const v2, -0x41c7ae14    # -0.18f

    .line 490
    .line 491
    .line 492
    const v4, 0x3d23d70a    # 0.04f

    .line 493
    .line 494
    .line 495
    invoke-virtual {v12, v4, v2, v4, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 496
    .line 497
    .line 498
    const v17, -0x421eb852    # -0.11f

    .line 499
    .line 500
    .line 501
    const v18, -0x40f851ec    # -0.53f

    .line 502
    .line 503
    .line 504
    const/4 v13, 0x0

    .line 505
    const v14, -0x41b33333    # -0.2f

    .line 506
    .line 507
    .line 508
    const v15, -0x42dc28f6    # -0.04f

    .line 509
    .line 510
    .line 511
    const v16, -0x41428f5c    # -0.37f

    .line 512
    .line 513
    .line 514
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 515
    .line 516
    .line 517
    const v0, -0x4170a3d7    # -0.28f

    .line 518
    .line 519
    .line 520
    const v2, -0x413d70a4    # -0.38f

    .line 521
    .line 522
    .line 523
    const v4, -0x41666666    # -0.3f

    .line 524
    .line 525
    .line 526
    const v6, -0x41d1eb85    # -0.17f

    .line 527
    .line 528
    .line 529
    invoke-virtual {v12, v6, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 530
    .line 531
    .line 532
    const v2, -0x41147ae1    # -0.46f

    .line 533
    .line 534
    .line 535
    const v4, -0x41947ae1    # -0.23f

    .line 536
    .line 537
    .line 538
    const v6, -0x41c7ae14    # -0.18f

    .line 539
    .line 540
    .line 541
    invoke-virtual {v12, v0, v6, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 542
    .line 543
    .line 544
    const v0, -0x40e8f5c3    # -0.59f

    .line 545
    .line 546
    .line 547
    const v2, -0x425c28f6    # -0.08f

    .line 548
    .line 549
    .line 550
    const v4, -0x41428f5c    # -0.37f

    .line 551
    .line 552
    .line 553
    const v6, -0x425c28f6    # -0.08f

    .line 554
    .line 555
    .line 556
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 557
    .line 558
    .line 559
    const v17, -0x40f5c28f    # -0.54f

    .line 560
    .line 561
    .line 562
    const v18, 0x3da3d70a    # 0.08f

    .line 563
    .line 564
    .line 565
    const v13, -0x41bd70a4    # -0.19f

    .line 566
    .line 567
    .line 568
    const/4 v14, 0x0

    .line 569
    const v15, -0x413d70a4    # -0.38f

    .line 570
    .line 571
    .line 572
    const v16, 0x3cf5c28f    # 0.03f

    .line 573
    .line 574
    .line 575
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 576
    .line 577
    .line 578
    const v0, -0x411eb852    # -0.44f

    .line 579
    .line 580
    .line 581
    const v2, 0x3e6b851f    # 0.23f

    .line 582
    .line 583
    .line 584
    const v4, -0x415c28f6    # -0.32f

    .line 585
    .line 586
    .line 587
    const v6, 0x3e051eb8    # 0.13f

    .line 588
    .line 589
    .line 590
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 591
    .line 592
    .line 593
    const v0, 0x3ebd70a4    # 0.37f

    .line 594
    .line 595
    .line 596
    const v2, -0x41947ae1    # -0.23f

    .line 597
    .line 598
    .line 599
    const v4, 0x3e6147ae    # 0.22f

    .line 600
    .line 601
    .line 602
    const v6, -0x41666666    # -0.3f

    .line 603
    .line 604
    .line 605
    invoke-virtual {v12, v2, v4, v6, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 606
    .line 607
    .line 608
    const v0, 0x3e99999a    # 0.3f

    .line 609
    .line 610
    .line 611
    const v2, 0x3ef5c28f    # 0.48f

    .line 612
    .line 613
    .line 614
    const v4, -0x421eb852    # -0.11f

    .line 615
    .line 616
    .line 617
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 618
    .line 619
    .line 620
    const v0, 0x3f59999a    # 0.85f

    .line 621
    .line 622
    .line 623
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 624
    .line 625
    .line 626
    const v17, 0x3d4ccccd    # 0.05f

    .line 627
    .line 628
    .line 629
    const v18, -0x41b33333    # -0.2f

    .line 630
    .line 631
    .line 632
    const/4 v13, 0x0

    .line 633
    const v14, -0x4270a3d7    # -0.07f

    .line 634
    .line 635
    .line 636
    const v15, 0x3ca3d70a    # 0.02f

    .line 637
    .line 638
    .line 639
    const v16, -0x41f0a3d7    # -0.14f

    .line 640
    .line 641
    .line 642
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 643
    .line 644
    .line 645
    const v0, 0x3d8f5c29    # 0.07f

    .line 646
    .line 647
    .line 648
    const v2, -0x41e66666    # -0.15f

    .line 649
    .line 650
    .line 651
    const v4, 0x3df5c28f    # 0.12f

    .line 652
    .line 653
    .line 654
    const v6, -0x421eb852    # -0.11f

    .line 655
    .line 656
    .line 657
    invoke-virtual {v12, v0, v6, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 658
    .line 659
    .line 660
    const v0, -0x4270a3d7    # -0.07f

    .line 661
    .line 662
    .line 663
    const v2, -0x42333333    # -0.1f

    .line 664
    .line 665
    .line 666
    const v4, 0x3e3851ec    # 0.18f

    .line 667
    .line 668
    .line 669
    const v6, 0x3de147ae    # 0.11f

    .line 670
    .line 671
    .line 672
    invoke-virtual {v12, v6, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 673
    .line 674
    .line 675
    const v0, -0x430a3d71    # -0.03f

    .line 676
    .line 677
    .line 678
    const v2, -0x430a3d71    # -0.03f

    .line 679
    .line 680
    .line 681
    const v4, 0x3e0f5c29    # 0.14f

    .line 682
    .line 683
    .line 684
    const v6, 0x3e6147ae    # 0.22f

    .line 685
    .line 686
    .line 687
    invoke-virtual {v12, v4, v0, v6, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 688
    .line 689
    .line 690
    const/high16 v17, 0x3e800000    # 0.25f

    .line 691
    .line 692
    const v18, 0x3d23d70a    # 0.04f

    .line 693
    .line 694
    .line 695
    const v13, 0x3dcccccd    # 0.1f

    .line 696
    .line 697
    .line 698
    const/4 v14, 0x0

    .line 699
    const v15, 0x3e3851ec    # 0.18f

    .line 700
    .line 701
    .line 702
    const v16, 0x3c23d70a    # 0.01f

    .line 703
    .line 704
    .line 705
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 706
    .line 707
    .line 708
    const v0, 0x3e051eb8    # 0.13f

    .line 709
    .line 710
    .line 711
    const v2, 0x3d75c28f    # 0.06f

    .line 712
    .line 713
    .line 714
    const v4, 0x3e3851ec    # 0.18f

    .line 715
    .line 716
    .line 717
    const v6, 0x3de147ae    # 0.11f

    .line 718
    .line 719
    .line 720
    invoke-virtual {v12, v0, v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 721
    .line 722
    .line 723
    const v0, 0x3da3d70a    # 0.08f

    .line 724
    .line 725
    .line 726
    const v2, 0x3e2e147b    # 0.17f

    .line 727
    .line 728
    .line 729
    const v4, 0x3de147ae    # 0.11f

    .line 730
    .line 731
    .line 732
    invoke-virtual {v12, v0, v4, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 733
    .line 734
    .line 735
    const v0, 0x3e0f5c29    # 0.14f

    .line 736
    .line 737
    .line 738
    const v2, 0x3e6147ae    # 0.22f

    .line 739
    .line 740
    .line 741
    const v4, 0x3d23d70a    # 0.04f

    .line 742
    .line 743
    .line 744
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 745
    .line 746
    .line 747
    const v17, -0x41dc28f6    # -0.16f

    .line 748
    .line 749
    .line 750
    const v18, 0x3edc28f6    # 0.43f

    .line 751
    .line 752
    .line 753
    const/4 v13, 0x0

    .line 754
    const v14, 0x3e3851ec    # 0.18f

    .line 755
    .line 756
    .line 757
    const v15, -0x42b33333    # -0.05f

    .line 758
    .line 759
    .line 760
    const v16, 0x3ea3d70a    # 0.32f

    .line 761
    .line 762
    .line 763
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 764
    .line 765
    .line 766
    const v0, -0x410a3d71    # -0.48f

    .line 767
    .line 768
    .line 769
    const v2, 0x3e23d70a    # 0.16f

    .line 770
    .line 771
    .line 772
    const v4, -0x417ae148    # -0.26f

    .line 773
    .line 774
    .line 775
    const v6, 0x3e23d70a    # 0.16f

    .line 776
    .line 777
    .line 778
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 779
    .line 780
    .line 781
    const v0, -0x4123d70a    # -0.43f

    .line 782
    .line 783
    .line 784
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 785
    .line 786
    .line 787
    const v0, 0x3f28f5c3    # 0.66f

    .line 788
    .line 789
    .line 790
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 791
    .line 792
    .line 793
    const v0, 0x3ee66666    # 0.45f

    .line 794
    .line 795
    .line 796
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 797
    .line 798
    .line 799
    const v17, 0x3e947ae1    # 0.29f

    .line 800
    .line 801
    .line 802
    const v18, 0x3d23d70a    # 0.04f

    .line 803
    .line 804
    .line 805
    const v13, 0x3de147ae    # 0.11f

    .line 806
    .line 807
    .line 808
    const/4 v14, 0x0

    .line 809
    const v15, 0x3e4ccccd    # 0.2f

    .line 810
    .line 811
    .line 812
    const v16, 0x3c23d70a    # 0.01f

    .line 813
    .line 814
    .line 815
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 816
    .line 817
    .line 818
    const v0, 0x3e23d70a    # 0.16f

    .line 819
    .line 820
    .line 821
    const v2, 0x3d75c28f    # 0.06f

    .line 822
    .line 823
    .line 824
    const v4, 0x3e6147ae    # 0.22f

    .line 825
    .line 826
    .line 827
    const v6, 0x3de147ae    # 0.11f

    .line 828
    .line 829
    .line 830
    invoke-virtual {v12, v0, v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 831
    .line 832
    .line 833
    const v0, 0x3e4ccccd    # 0.2f

    .line 834
    .line 835
    .line 836
    const v2, 0x3e0f5c29    # 0.14f

    .line 837
    .line 838
    .line 839
    const v4, 0x3df5c28f    # 0.12f

    .line 840
    .line 841
    .line 842
    invoke-virtual {v12, v6, v4, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 843
    .line 844
    .line 845
    const v0, 0x3e947ae1    # 0.29f

    .line 846
    .line 847
    .line 848
    const v2, 0x3d4ccccd    # 0.05f

    .line 849
    .line 850
    .line 851
    const v4, 0x3e3851ec    # 0.18f

    .line 852
    .line 853
    .line 854
    invoke-virtual {v12, v2, v4, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 855
    .line 856
    .line 857
    const v17, -0x42dc28f6    # -0.04f

    .line 858
    .line 859
    .line 860
    const v18, 0x3e75c28f    # 0.24f

    .line 861
    .line 862
    .line 863
    const/4 v13, 0x0

    .line 864
    const v14, 0x3db851ec    # 0.09f

    .line 865
    .line 866
    .line 867
    const v15, -0x43dc28f6    # -0.01f

    .line 868
    .line 869
    .line 870
    const v16, 0x3e2e147b    # 0.17f

    .line 871
    .line 872
    .line 873
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 874
    .line 875
    .line 876
    const v0, -0x425c28f6    # -0.08f

    .line 877
    .line 878
    .line 879
    const v2, -0x41fae148    # -0.13f

    .line 880
    .line 881
    .line 882
    const v4, 0x3e2e147b    # 0.17f

    .line 883
    .line 884
    .line 885
    invoke-virtual {v12, v0, v6, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 886
    .line 887
    .line 888
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 889
    .line 890
    .line 891
    const v0, 0x41670a3d    # 14.44f

    .line 892
    .line 893
    .line 894
    const v2, 0x413c7ae1    # 11.78f

    .line 895
    .line 896
    .line 897
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 898
    .line 899
    .line 900
    const v17, -0x40e8f5c3    # -0.59f

    .line 901
    .line 902
    .line 903
    const v18, -0x42333333    # -0.1f

    .line 904
    .line 905
    .line 906
    const v13, -0x41c7ae14    # -0.18f

    .line 907
    .line 908
    .line 909
    const v14, -0x4270a3d7    # -0.07f

    .line 910
    .line 911
    .line 912
    const v15, -0x41428f5c    # -0.37f

    .line 913
    .line 914
    .line 915
    const v16, -0x42333333    # -0.1f

    .line 916
    .line 917
    .line 918
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 919
    .line 920
    .line 921
    const v0, 0x3cf5c28f    # 0.03f

    .line 922
    .line 923
    .line 924
    const v2, -0x40e8f5c3    # -0.59f

    .line 925
    .line 926
    .line 927
    const v4, 0x3dcccccd    # 0.1f

    .line 928
    .line 929
    .line 930
    const v6, -0x412e147b    # -0.41f

    .line 931
    .line 932
    .line 933
    invoke-virtual {v12, v6, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 934
    .line 935
    .line 936
    const v0, -0x4119999a    # -0.45f

    .line 937
    .line 938
    .line 939
    const v2, -0x41570a3d    # -0.33f

    .line 940
    .line 941
    .line 942
    const v4, 0x3ea8f5c3    # 0.33f

    .line 943
    .line 944
    .line 945
    const v6, 0x3e3851ec    # 0.18f

    .line 946
    .line 947
    .line 948
    invoke-virtual {v12, v2, v6, v0, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 949
    .line 950
    .line 951
    const v0, -0x416b851f    # -0.29f

    .line 952
    .line 953
    .line 954
    const v2, 0x3f11eb85    # 0.57f

    .line 955
    .line 956
    .line 957
    const v4, -0x41947ae1    # -0.23f

    .line 958
    .line 959
    .line 960
    const v6, 0x3eae147b    # 0.34f

    .line 961
    .line 962
    .line 963
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 964
    .line 965
    .line 966
    const/high16 v0, 0x3f000000    # 0.5f

    .line 967
    .line 968
    const v2, 0x3f51eb85    # 0.82f

    .line 969
    .line 970
    .line 971
    const v4, -0x42333333    # -0.1f

    .line 972
    .line 973
    .line 974
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 975
    .line 976
    .line 977
    const v0, 0x3f3d70a4    # 0.74f

    .line 978
    .line 979
    .line 980
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 981
    .line 982
    .line 983
    const v17, 0x3de147ae    # 0.11f

    .line 984
    .line 985
    .line 986
    const v18, 0x3f51eb85    # 0.82f

    .line 987
    .line 988
    .line 989
    const/4 v13, 0x0

    .line 990
    const v14, 0x3ea3d70a    # 0.32f

    .line 991
    .line 992
    .line 993
    const v15, 0x3d23d70a    # 0.04f

    .line 994
    .line 995
    .line 996
    const v16, 0x3f19999a    # 0.6f

    .line 997
    .line 998
    .line 999
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1000
    .line 1001
    .line 1002
    const v0, 0x3e99999a    # 0.3f

    .line 1003
    .line 1004
    .line 1005
    const v2, 0x3f11eb85    # 0.57f

    .line 1006
    .line 1007
    .line 1008
    const v4, 0x3e2e147b    # 0.17f

    .line 1009
    .line 1010
    .line 1011
    const v6, 0x3ed70a3d    # 0.42f

    .line 1012
    .line 1013
    .line 1014
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1015
    .line 1016
    .line 1017
    const v0, 0x3e851eb8    # 0.26f

    .line 1018
    .line 1019
    .line 1020
    const v2, 0x3eeb851f    # 0.46f

    .line 1021
    .line 1022
    .line 1023
    const v4, 0x3ea8f5c3    # 0.33f

    .line 1024
    .line 1025
    .line 1026
    const v6, 0x3e8f5c29    # 0.28f

    .line 1027
    .line 1028
    .line 1029
    invoke-virtual {v12, v6, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1030
    .line 1031
    .line 1032
    const v0, 0x3ebd70a4    # 0.37f

    .line 1033
    .line 1034
    .line 1035
    const v2, 0x3f170a3d    # 0.59f

    .line 1036
    .line 1037
    .line 1038
    const v4, 0x3dcccccd    # 0.1f

    .line 1039
    .line 1040
    .line 1041
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1042
    .line 1043
    .line 1044
    const v0, -0x430a3d71    # -0.03f

    .line 1045
    .line 1046
    .line 1047
    const v4, -0x42333333    # -0.1f

    .line 1048
    .line 1049
    .line 1050
    const v6, 0x3ed1eb85    # 0.41f

    .line 1051
    .line 1052
    .line 1053
    invoke-virtual {v12, v6, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1054
    .line 1055
    .line 1056
    const v0, 0x3ee66666    # 0.45f

    .line 1057
    .line 1058
    .line 1059
    const v2, -0x41c7ae14    # -0.18f

    .line 1060
    .line 1061
    .line 1062
    const v4, -0x41570a3d    # -0.33f

    .line 1063
    .line 1064
    .line 1065
    const v6, 0x3ea8f5c3    # 0.33f

    .line 1066
    .line 1067
    .line 1068
    invoke-virtual {v12, v6, v2, v0, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1069
    .line 1070
    .line 1071
    const v0, -0x4151eb85    # -0.34f

    .line 1072
    .line 1073
    .line 1074
    const v2, -0x40ee147b    # -0.57f

    .line 1075
    .line 1076
    .line 1077
    const v4, 0x3e947ae1    # 0.29f

    .line 1078
    .line 1079
    .line 1080
    const v6, 0x3e6147ae    # 0.22f

    .line 1081
    .line 1082
    .line 1083
    invoke-virtual {v12, v6, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1084
    .line 1085
    .line 1086
    const/high16 v0, -0x41000000    # -0.5f

    .line 1087
    .line 1088
    const v2, -0x40ae147b    # -0.82f

    .line 1089
    .line 1090
    .line 1091
    const v4, 0x3dcccccd    # 0.1f

    .line 1092
    .line 1093
    .line 1094
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1095
    .line 1096
    .line 1097
    const v0, -0x40c28f5c    # -0.74f

    .line 1098
    .line 1099
    .line 1100
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1101
    .line 1102
    .line 1103
    const v17, -0x421eb852    # -0.11f

    .line 1104
    .line 1105
    .line 1106
    const v18, -0x40ae147b    # -0.82f

    .line 1107
    .line 1108
    .line 1109
    const v14, -0x415c28f6    # -0.32f

    .line 1110
    .line 1111
    .line 1112
    const v15, -0x42dc28f6    # -0.04f

    .line 1113
    .line 1114
    .line 1115
    const v16, -0x40e66666    # -0.6f

    .line 1116
    .line 1117
    .line 1118
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1119
    .line 1120
    .line 1121
    const v0, -0x4128f5c3    # -0.42f

    .line 1122
    .line 1123
    .line 1124
    const v2, -0x40ee147b    # -0.57f

    .line 1125
    .line 1126
    .line 1127
    const v4, -0x41666666    # -0.3f

    .line 1128
    .line 1129
    .line 1130
    const v6, -0x41d1eb85    # -0.17f

    .line 1131
    .line 1132
    .line 1133
    invoke-virtual {v12, v6, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1134
    .line 1135
    .line 1136
    const v0, -0x417ae148    # -0.26f

    .line 1137
    .line 1138
    .line 1139
    const v2, -0x41147ae1    # -0.46f

    .line 1140
    .line 1141
    .line 1142
    const v4, -0x41570a3d    # -0.33f

    .line 1143
    .line 1144
    .line 1145
    const v6, -0x4170a3d7    # -0.28f

    .line 1146
    .line 1147
    .line 1148
    invoke-virtual {v12, v6, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1149
    .line 1150
    .line 1151
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1152
    .line 1153
    .line 1154
    const v0, 0x41673333    # 14.45f

    .line 1155
    .line 1156
    .line 1157
    const v2, 0x4165999a    # 14.35f

    .line 1158
    .line 1159
    .line 1160
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1161
    .line 1162
    .line 1163
    const v17, -0x42dc28f6    # -0.04f

    .line 1164
    .line 1165
    .line 1166
    const v18, 0x3ef5c28f    # 0.48f

    .line 1167
    .line 1168
    .line 1169
    const v14, 0x3e428f5c    # 0.19f

    .line 1170
    .line 1171
    .line 1172
    const v15, -0x43dc28f6    # -0.01f

    .line 1173
    .line 1174
    .line 1175
    const v16, 0x3eb33333    # 0.35f

    .line 1176
    .line 1177
    .line 1178
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1179
    .line 1180
    .line 1181
    const v0, 0x3e75c28f    # 0.24f

    .line 1182
    .line 1183
    .line 1184
    const v2, 0x3ea3d70a    # 0.32f

    .line 1185
    .line 1186
    .line 1187
    const v4, -0x421eb852    # -0.11f

    .line 1188
    .line 1189
    .line 1190
    const v6, -0x428a3d71    # -0.06f

    .line 1191
    .line 1192
    .line 1193
    invoke-virtual {v12, v6, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1194
    .line 1195
    .line 1196
    const v0, -0x41bd70a4    # -0.19f

    .line 1197
    .line 1198
    .line 1199
    const v2, 0x3e2e147b    # 0.17f

    .line 1200
    .line 1201
    .line 1202
    const v4, 0x3e0f5c29    # 0.14f

    .line 1203
    .line 1204
    .line 1205
    const v6, -0x421eb852    # -0.11f

    .line 1206
    .line 1207
    .line 1208
    invoke-virtual {v12, v6, v4, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1209
    .line 1210
    .line 1211
    const v0, -0x41dc28f6    # -0.16f

    .line 1212
    .line 1213
    .line 1214
    const/high16 v2, -0x41800000    # -0.25f

    .line 1215
    .line 1216
    const v4, 0x3d4ccccd    # 0.05f

    .line 1217
    .line 1218
    .line 1219
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1220
    .line 1221
    .line 1222
    const v0, -0x435c28f6    # -0.02f

    .line 1223
    .line 1224
    .line 1225
    const v4, -0x41c7ae14    # -0.18f

    .line 1226
    .line 1227
    .line 1228
    const v6, -0x42b33333    # -0.05f

    .line 1229
    .line 1230
    .line 1231
    invoke-virtual {v12, v4, v0, v2, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1232
    .line 1233
    .line 1234
    const v0, -0x4247ae14    # -0.09f

    .line 1235
    .line 1236
    .line 1237
    const v2, -0x41bd70a4    # -0.19f

    .line 1238
    .line 1239
    .line 1240
    const v4, -0x41f0a3d7    # -0.14f

    .line 1241
    .line 1242
    .line 1243
    const v6, -0x41d1eb85    # -0.17f

    .line 1244
    .line 1245
    .line 1246
    invoke-virtual {v12, v4, v0, v2, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1247
    .line 1248
    .line 1249
    const v0, -0x420a3d71    # -0.12f

    .line 1250
    .line 1251
    .line 1252
    const v2, -0x415c28f6    # -0.32f

    .line 1253
    .line 1254
    .line 1255
    const v4, -0x4247ae14    # -0.09f

    .line 1256
    .line 1257
    .line 1258
    const v6, -0x41bd70a4    # -0.19f

    .line 1259
    .line 1260
    .line 1261
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1262
    .line 1263
    .line 1264
    const v0, -0x42dc28f6    # -0.04f

    .line 1265
    .line 1266
    .line 1267
    const v2, -0x410a3d71    # -0.48f

    .line 1268
    .line 1269
    .line 1270
    const v4, -0x42dc28f6    # -0.04f

    .line 1271
    .line 1272
    .line 1273
    const v6, -0x416b851f    # -0.29f

    .line 1274
    .line 1275
    .line 1276
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1277
    .line 1278
    .line 1279
    const v0, -0x4087ae14    # -0.97f

    .line 1280
    .line 1281
    .line 1282
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1283
    .line 1284
    .line 1285
    const v17, 0x3d23d70a    # 0.04f

    .line 1286
    .line 1287
    .line 1288
    const v18, -0x410a3d71    # -0.48f

    .line 1289
    .line 1290
    .line 1291
    const v14, -0x41bd70a4    # -0.19f

    .line 1292
    .line 1293
    .line 1294
    const v15, 0x3c23d70a    # 0.01f

    .line 1295
    .line 1296
    .line 1297
    const v16, -0x414ccccd    # -0.35f

    .line 1298
    .line 1299
    .line 1300
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1301
    .line 1302
    .line 1303
    const v0, 0x3d75c28f    # 0.06f

    .line 1304
    .line 1305
    .line 1306
    const v2, -0x416147ae    # -0.31f

    .line 1307
    .line 1308
    .line 1309
    const v4, -0x41947ae1    # -0.23f

    .line 1310
    .line 1311
    .line 1312
    const v6, 0x3df5c28f    # 0.12f

    .line 1313
    .line 1314
    .line 1315
    invoke-virtual {v12, v0, v4, v6, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1316
    .line 1317
    .line 1318
    const v0, 0x3e428f5c    # 0.19f

    .line 1319
    .line 1320
    .line 1321
    const v2, -0x41f0a3d7    # -0.14f

    .line 1322
    .line 1323
    .line 1324
    const v4, -0x41d1eb85    # -0.17f

    .line 1325
    .line 1326
    .line 1327
    const v6, 0x3de147ae    # 0.11f

    .line 1328
    .line 1329
    .line 1330
    invoke-virtual {v12, v6, v2, v0, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1331
    .line 1332
    .line 1333
    const v0, 0x3e23d70a    # 0.16f

    .line 1334
    .line 1335
    .line 1336
    const/high16 v2, 0x3e800000    # 0.25f

    .line 1337
    .line 1338
    const v4, -0x42b33333    # -0.05f

    .line 1339
    .line 1340
    .line 1341
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1342
    .line 1343
    .line 1344
    const v0, 0x3ca3d70a    # 0.02f

    .line 1345
    .line 1346
    .line 1347
    const v4, 0x3d4ccccd    # 0.05f

    .line 1348
    .line 1349
    .line 1350
    const v6, 0x3e3851ec    # 0.18f

    .line 1351
    .line 1352
    .line 1353
    invoke-virtual {v12, v6, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1354
    .line 1355
    .line 1356
    const v0, 0x3db851ec    # 0.09f

    .line 1357
    .line 1358
    .line 1359
    const v2, 0x3e428f5c    # 0.19f

    .line 1360
    .line 1361
    .line 1362
    const v4, 0x3e2e147b    # 0.17f

    .line 1363
    .line 1364
    .line 1365
    const v6, 0x3e0f5c29    # 0.14f

    .line 1366
    .line 1367
    .line 1368
    invoke-virtual {v12, v6, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1369
    .line 1370
    .line 1371
    const v2, 0x3e9eb852    # 0.31f

    .line 1372
    .line 1373
    .line 1374
    const v4, 0x3df5c28f    # 0.12f

    .line 1375
    .line 1376
    .line 1377
    const v6, 0x3e3851ec    # 0.18f

    .line 1378
    .line 1379
    .line 1380
    invoke-virtual {v12, v0, v6, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1381
    .line 1382
    .line 1383
    const v0, 0x3ef5c28f    # 0.48f

    .line 1384
    .line 1385
    .line 1386
    const v2, 0x3e947ae1    # 0.29f

    .line 1387
    .line 1388
    .line 1389
    const v4, 0x3d23d70a    # 0.04f

    .line 1390
    .line 1391
    .line 1392
    invoke-virtual {v12, v4, v2, v4, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1393
    .line 1394
    .line 1395
    const v0, 0x3f7851ec    # 0.97f

    .line 1396
    .line 1397
    .line 1398
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1399
    .line 1400
    .line 1401
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1402
    .line 1403
    .line 1404
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 1405
    .line 1406
    .line 1407
    move-result-object v2

    .line 1408
    const/16 v16, 0x3800

    .line 1409
    .line 1410
    const/16 v17, 0x0

    .line 1411
    .line 1412
    const/high16 v6, 0x3f800000    # 1.0f

    .line 1413
    .line 1414
    const/high16 v8, 0x3f800000    # 1.0f

    .line 1415
    .line 1416
    const/4 v7, 0x0

    .line 1417
    const/high16 v9, 0x3f800000    # 1.0f

    .line 1418
    .line 1419
    const/high16 v12, 0x3f800000    # 1.0f

    .line 1420
    .line 1421
    const/4 v14, 0x0

    .line 1422
    const/4 v15, 0x0

    .line 1423
    const-string v4, ""

    .line 1424
    .line 1425
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 1426
    .line 1427
    .line 1428
    move-result-object v0

    .line 1429
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1430
    .line 1431
    .line 1432
    move-result-object v0

    .line 1433
    sput-object v0, Landroidx/compose/material/icons/sharp/Forward30Kt;->_forward30:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1434
    .line 1435
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 1436
    .line 1437
    .line 1438
    return-object v0
.end method
