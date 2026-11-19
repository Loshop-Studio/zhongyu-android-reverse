.class public final Landroidx/compose/material/icons/rounded/NoStrollerKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_noStroller",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "NoStroller",
        "Landroidx/compose/material/icons/Icons$Rounded;",
        "getNoStroller",
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
        "SMAP\nNoStroller.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NoStroller.kt\nandroidx/compose/material/icons/rounded/NoStrollerKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,81:1\n212#2,12:82\n233#2,18:95\n253#2:132\n174#3:94\n705#4,2:113\n717#4,2:115\n719#4,11:121\n72#5,4:117\n*S KotlinDebug\n*F\n+ 1 NoStroller.kt\nandroidx/compose/material/icons/rounded/NoStrollerKt\n*L\n29#1:82,12\n30#1:95,18\n30#1:132\n29#1:94\n30#1:113,2\n30#1:115,2\n30#1:121,11\n30#1:117,4\n*E\n"
    }
.end annotation


# static fields
.field private static _noStroller:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getNoStroller(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/NoStrollerKt;->_noStroller:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.NoStroller"

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
    const/high16 v0, 0x41a00000    # 20.0f

    .line 71
    .line 72
    const/high16 v2, 0x41000000    # 8.0f

    .line 73
    .line 74
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v17, -0x40000000    # -2.0f

    .line 78
    .line 79
    const/high16 v18, 0x40000000    # 2.0f

    .line 80
    .line 81
    const/4 v13, 0x0

    .line 82
    const v14, 0x3f8ccccd    # 1.1f

    .line 83
    .line 84
    .line 85
    const v15, -0x4099999a    # -0.9f

    .line 86
    .line 87
    .line 88
    const/high16 v16, 0x40000000    # 2.0f

    .line 89
    .line 90
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 91
    .line 92
    .line 93
    const v0, -0x4099999a    # -0.9f

    .line 94
    .line 95
    .line 96
    const/high16 v2, -0x40000000    # -2.0f

    .line 97
    .line 98
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 99
    .line 100
    .line 101
    const v0, 0x3f666666    # 0.9f

    .line 102
    .line 103
    .line 104
    const/high16 v2, 0x40000000    # 2.0f

    .line 105
    .line 106
    const/high16 v4, -0x40000000    # -2.0f

    .line 107
    .line 108
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 109
    .line 110
    .line 111
    const v0, 0x41973333    # 18.9f

    .line 112
    .line 113
    .line 114
    const/high16 v2, 0x41a00000    # 20.0f

    .line 115
    .line 116
    const/high16 v4, 0x41000000    # 8.0f

    .line 117
    .line 118
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 119
    .line 120
    .line 121
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 122
    .line 123
    .line 124
    const v0, 0x40833333    # 4.1f

    .line 125
    .line 126
    .line 127
    const v2, 0x4164cccd    # 14.3f

    .line 128
    .line 129
    .line 130
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 131
    .line 132
    .line 133
    const/high16 v17, 0x41200000    # 10.0f

    .line 134
    .line 135
    const/high16 v18, 0x40400000    # 3.0f

    .line 136
    .line 137
    const v13, 0x41507ae1    # 13.03f

    .line 138
    .line 139
    .line 140
    const v14, 0x4059999a    # 3.4f

    .line 141
    .line 142
    .line 143
    const v15, 0x4138f5c3    # 11.56f

    .line 144
    .line 145
    .line 146
    const/high16 v16, 0x40400000    # 3.0f

    .line 147
    .line 148
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 149
    .line 150
    .line 151
    const v17, 0x40d147ae    # 6.54f

    .line 152
    .line 153
    .line 154
    const v18, 0x406d70a4    # 3.71f

    .line 155
    .line 156
    .line 157
    const v13, 0x410c51ec    # 8.77f

    .line 158
    .line 159
    .line 160
    const/high16 v14, 0x40400000    # 3.0f

    .line 161
    .line 162
    const v15, 0x40f3851f    # 7.61f

    .line 163
    .line 164
    .line 165
    const v16, 0x4050a3d7    # 3.26f

    .line 166
    .line 167
    .line 168
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 169
    .line 170
    .line 171
    const v0, 0x408bd70a    # 4.37f

    .line 172
    .line 173
    .line 174
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 175
    .line 176
    .line 177
    const v0, 0x40833333    # 4.1f

    .line 178
    .line 179
    .line 180
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 181
    .line 182
    .line 183
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 184
    .line 185
    .line 186
    const v0, 0x41af3333    # 21.9f

    .line 187
    .line 188
    .line 189
    const v2, 0x41a3eb85    # 20.49f

    .line 190
    .line 191
    .line 192
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 193
    .line 194
    .line 195
    const/16 v17, 0x0

    .line 196
    .line 197
    const v18, -0x404b851f    # -1.41f

    .line 198
    .line 199
    .line 200
    const v13, 0x3ec7ae14    # 0.39f

    .line 201
    .line 202
    .line 203
    const v14, -0x413851ec    # -0.39f

    .line 204
    .line 205
    .line 206
    const v15, 0x3ec7ae14    # 0.39f

    .line 207
    .line 208
    .line 209
    const v16, -0x407d70a4    # -1.02f

    .line 210
    .line 211
    .line 212
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 213
    .line 214
    .line 215
    const v0, -0x3ee2e148    # -9.82f

    .line 216
    .line 217
    .line 218
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 219
    .line 220
    .line 221
    const v0, 0x4060a3d7    # 3.51f

    .line 222
    .line 223
    .line 224
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 225
    .line 226
    .line 227
    const v17, -0x404b851f    # -1.41f

    .line 228
    .line 229
    .line 230
    const/16 v18, 0x0

    .line 231
    .line 232
    const v13, -0x413851ec    # -0.39f

    .line 233
    .line 234
    .line 235
    const v15, -0x407d70a4    # -1.02f

    .line 236
    .line 237
    .line 238
    const v16, -0x413851ec    # -0.39f

    .line 239
    .line 240
    .line 241
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 242
    .line 243
    .line 244
    const/4 v0, 0x0

    .line 245
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 246
    .line 247
    .line 248
    const/16 v17, 0x0

    .line 249
    .line 250
    const v18, 0x3fb47ae1    # 1.41f

    .line 251
    .line 252
    .line 253
    const v14, 0x3ec7ae14    # 0.39f

    .line 254
    .line 255
    .line 256
    const v15, -0x413851ec    # -0.39f

    .line 257
    .line 258
    .line 259
    const v16, 0x3f828f5c    # 1.02f

    .line 260
    .line 261
    .line 262
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 263
    .line 264
    .line 265
    const v0, 0x40e851ec    # 7.26f

    .line 266
    .line 267
    .line 268
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 269
    .line 270
    .line 271
    const v0, -0x3fd5c28f    # -2.66f

    .line 272
    .line 273
    .line 274
    const v2, 0x4047ae14    # 3.12f

    .line 275
    .line 276
    .line 277
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 278
    .line 279
    .line 280
    const v17, 0x3f428f5c    # 0.76f

    .line 281
    .line 282
    .line 283
    const v18, 0x3fd33333    # 1.65f

    .line 284
    .line 285
    .line 286
    const v13, -0x40f33333    # -0.55f

    .line 287
    .line 288
    .line 289
    const v14, 0x3f266666    # 0.65f

    .line 290
    .line 291
    .line 292
    const v15, -0x4247ae14    # -0.09f

    .line 293
    .line 294
    .line 295
    const v16, 0x3fd33333    # 1.65f

    .line 296
    .line 297
    .line 298
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 299
    .line 300
    .line 301
    const v0, 0x40d51eb8    # 6.66f

    .line 302
    .line 303
    .line 304
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 305
    .line 306
    .line 307
    const v0, 0x3f95c28f    # 1.17f

    .line 308
    .line 309
    .line 310
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 311
    .line 312
    .line 313
    const v17, -0x405eb852    # -1.26f

    .line 314
    .line 315
    .line 316
    const v18, 0x4011eb85    # 2.28f

    .line 317
    .line 318
    .line 319
    const v13, -0x409eb852    # -0.88f

    .line 320
    .line 321
    .line 322
    const v14, 0x3ea8f5c3    # 0.33f

    .line 323
    .line 324
    .line 325
    const v15, -0x4043d70a    # -1.47f

    .line 326
    .line 327
    .line 328
    const/high16 v16, 0x3fa00000    # 1.25f

    .line 329
    .line 330
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 331
    .line 332
    .line 333
    const v17, 0x3fc51eb8    # 1.54f

    .line 334
    .line 335
    .line 336
    const v18, 0x3fc51eb8    # 1.54f

    .line 337
    .line 338
    .line 339
    const v13, 0x3e19999a    # 0.15f

    .line 340
    .line 341
    .line 342
    const v14, 0x3f428f5c    # 0.76f

    .line 343
    .line 344
    .line 345
    const v15, 0x3f47ae14    # 0.78f

    .line 346
    .line 347
    .line 348
    const v16, 0x3fb1eb85    # 1.39f

    .line 349
    .line 350
    .line 351
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 352
    .line 353
    .line 354
    const v17, 0x4011eb85    # 2.28f

    .line 355
    .line 356
    .line 357
    const v18, -0x405eb852    # -1.26f

    .line 358
    .line 359
    .line 360
    const v13, 0x3f83d70a    # 1.03f

    .line 361
    .line 362
    .line 363
    const v14, 0x3e570a3d    # 0.21f

    .line 364
    .line 365
    .line 366
    const v15, 0x3ff9999a    # 1.95f

    .line 367
    .line 368
    .line 369
    const v16, -0x413d70a4    # -0.38f

    .line 370
    .line 371
    .line 372
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 373
    .line 374
    .line 375
    const v0, 0x3f99999a    # 1.2f

    .line 376
    .line 377
    .line 378
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 379
    .line 380
    .line 381
    const v17, 0x41a3eb85    # 20.49f

    .line 382
    .line 383
    .line 384
    const v18, 0x41af3333    # 21.9f

    .line 385
    .line 386
    .line 387
    const v13, 0x419bae14    # 19.46f

    .line 388
    .line 389
    .line 390
    const v14, 0x41b251ec    # 22.29f

    .line 391
    .line 392
    .line 393
    const v15, 0x41a0b852    # 20.09f

    .line 394
    .line 395
    .line 396
    const v16, 0x41b251ec    # 22.29f

    .line 397
    .line 398
    .line 399
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 400
    .line 401
    .line 402
    const v0, 0x41af3333    # 21.9f

    .line 403
    .line 404
    .line 405
    const v2, 0x41a3eb85    # 20.49f

    .line 406
    .line 407
    .line 408
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 409
    .line 410
    .line 411
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 412
    .line 413
    .line 414
    const v0, 0x40c8a3d7    # 6.27f

    .line 415
    .line 416
    .line 417
    const/high16 v2, 0x41880000    # 17.0f

    .line 418
    .line 419
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 420
    .line 421
    .line 422
    const v17, 0x41953333    # 18.65f

    .line 423
    .line 424
    .line 425
    const/high16 v18, 0x40a00000    # 5.0f

    .line 426
    .line 427
    const v13, 0x418ca3d7    # 17.58f

    .line 428
    .line 429
    .line 430
    const v14, 0x40b2e148    # 5.59f

    .line 431
    .line 432
    .line 433
    const v15, 0x418fc28f    # 17.97f

    .line 434
    .line 435
    .line 436
    const/high16 v16, 0x40a00000    # 5.0f

    .line 437
    .line 438
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 439
    .line 440
    .line 441
    const v17, 0x3faa3d71    # 1.33f

    .line 442
    .line 443
    .line 444
    const v18, 0x3f9ae148    # 1.21f

    .line 445
    .line 446
    .line 447
    const v13, 0x3f2e147b    # 0.68f

    .line 448
    .line 449
    .line 450
    const/4 v14, 0x0

    .line 451
    const v15, 0x3f9c28f6    # 1.22f

    .line 452
    .line 453
    .line 454
    const v16, 0x3f051eb8    # 0.52f

    .line 455
    .line 456
    .line 457
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 458
    .line 459
    .line 460
    const v17, 0x41a7ae14    # 20.96f

    .line 461
    .line 462
    .line 463
    const/high16 v18, 0x40e00000    # 7.0f

    .line 464
    .line 465
    const v13, 0x41a0a3d7    # 20.08f

    .line 466
    .line 467
    .line 468
    const v14, 0x40d51eb8    # 6.66f

    .line 469
    .line 470
    .line 471
    const v15, 0x41a3d70a    # 20.48f

    .line 472
    .line 473
    .line 474
    const/high16 v16, 0x40e00000    # 7.0f

    .line 475
    .line 476
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 477
    .line 478
    .line 479
    const/high16 v17, 0x3f800000    # 1.0f

    .line 480
    .line 481
    const/high16 v18, -0x40800000    # -1.0f

    .line 482
    .line 483
    const v13, 0x3f0ccccd    # 0.55f

    .line 484
    .line 485
    .line 486
    const/4 v14, 0x0

    .line 487
    const/high16 v15, 0x3f800000    # 1.0f

    .line 488
    .line 489
    const v16, -0x4119999a    # -0.45f

    .line 490
    .line 491
    .line 492
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 493
    .line 494
    .line 495
    const v17, -0x43dc28f6    # -0.01f

    .line 496
    .line 497
    .line 498
    const v18, -0x41dc28f6    # -0.16f

    .line 499
    .line 500
    .line 501
    const/4 v13, 0x0

    .line 502
    const v14, -0x428a3d71    # -0.06f

    .line 503
    .line 504
    .line 505
    const/4 v15, 0x0

    .line 506
    const v16, -0x421eb852    # -0.11f

    .line 507
    .line 508
    .line 509
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 510
    .line 511
    .line 512
    const v0, -0x43dc28f6    # -0.01f

    .line 513
    .line 514
    .line 515
    const/4 v2, 0x0

    .line 516
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 517
    .line 518
    .line 519
    const v17, 0x41953333    # 18.65f

    .line 520
    .line 521
    .line 522
    const/high16 v18, 0x40400000    # 3.0f

    .line 523
    .line 524
    const v13, 0x41ad3333    # 21.65f

    .line 525
    .line 526
    .line 527
    const v14, 0x40870a3d    # 4.22f

    .line 528
    .line 529
    .line 530
    const v15, 0x41a26666    # 20.3f

    .line 531
    .line 532
    .line 533
    const/high16 v16, 0x40400000    # 3.0f

    .line 534
    .line 535
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 536
    .line 537
    .line 538
    const v17, -0x3fb47ae1    # -3.18f

    .line 539
    .line 540
    .line 541
    const v18, 0x4001eb85    # 2.03f

    .line 542
    .line 543
    .line 544
    const v13, -0x402b851f    # -1.66f

    .line 545
    .line 546
    .line 547
    const/4 v14, 0x0

    .line 548
    const v15, -0x3fdd70a4    # -2.54f

    .line 549
    .line 550
    .line 551
    const v16, 0x3fa28f5c    # 1.27f

    .line 552
    .line 553
    .line 554
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 555
    .line 556
    .line 557
    const/high16 v0, -0x3fa00000    # -3.5f

    .line 558
    .line 559
    const v2, 0x4083851f    # 4.11f

    .line 560
    .line 561
    .line 562
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 563
    .line 564
    .line 565
    const v0, 0x4162b852    # 14.17f

    .line 566
    .line 567
    .line 568
    const/high16 v2, 0x41880000    # 17.0f

    .line 569
    .line 570
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 571
    .line 572
    .line 573
    const v0, 0x40c8a3d7    # 6.27f

    .line 574
    .line 575
    .line 576
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 577
    .line 578
    .line 579
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 580
    .line 581
    .line 582
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 583
    .line 584
    .line 585
    move-result-object v2

    .line 586
    const/16 v16, 0x3800

    .line 587
    .line 588
    const/16 v17, 0x0

    .line 589
    .line 590
    const/high16 v6, 0x3f800000    # 1.0f

    .line 591
    .line 592
    const/high16 v8, 0x3f800000    # 1.0f

    .line 593
    .line 594
    const/4 v7, 0x0

    .line 595
    const/high16 v9, 0x3f800000    # 1.0f

    .line 596
    .line 597
    const/high16 v12, 0x3f800000    # 1.0f

    .line 598
    .line 599
    const/4 v13, 0x0

    .line 600
    const/4 v15, 0x0

    .line 601
    const-string v4, ""

    .line 602
    .line 603
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 604
    .line 605
    .line 606
    move-result-object v0

    .line 607
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 608
    .line 609
    .line 610
    move-result-object v0

    .line 611
    sput-object v0, Landroidx/compose/material/icons/rounded/NoStrollerKt;->_noStroller:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 612
    .line 613
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 614
    .line 615
    .line 616
    return-object v0
.end method
