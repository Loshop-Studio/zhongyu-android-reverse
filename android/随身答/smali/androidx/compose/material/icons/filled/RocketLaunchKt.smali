.class public final Landroidx/compose/material/icons/filled/RocketLaunchKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_rocketLaunch",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "RocketLaunch",
        "Landroidx/compose/material/icons/Icons$Filled;",
        "getRocketLaunch",
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
        "SMAP\nRocketLaunch.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RocketLaunch.kt\nandroidx/compose/material/icons/filled/RocketLaunchKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,73:1\n212#2,12:74\n233#2,18:87\n253#2:124\n174#3:86\n705#4,2:105\n717#4,2:107\n719#4,11:113\n72#5,4:109\n*S KotlinDebug\n*F\n+ 1 RocketLaunch.kt\nandroidx/compose/material/icons/filled/RocketLaunchKt\n*L\n29#1:74,12\n30#1:87,18\n30#1:124\n29#1:86\n30#1:105,2\n30#1:107,2\n30#1:113,11\n30#1:109,4\n*E\n"
    }
.end annotation


# static fields
.field private static _rocketLaunch:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getRocketLaunch(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/filled/RocketLaunchKt;->_rocketLaunch:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Filled.RocketLaunch"

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
    const v0, 0x40cb3333    # 6.35f

    .line 71
    .line 72
    .line 73
    const v2, 0x41130a3d    # 9.19f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v17, -0x3f9b851f    # -3.57f

    .line 80
    .line 81
    .line 82
    const v18, 0x40bc7ae1    # 5.89f

    .line 83
    .line 84
    .line 85
    const v13, -0x3ffd70a4    # -2.04f

    .line 86
    .line 87
    .line 88
    const v14, 0x40128f5c    # 2.29f

    .line 89
    .line 90
    .line 91
    const v15, -0x3fa3d70a    # -3.44f

    .line 92
    .line 93
    .line 94
    const v16, 0x40b28f5c    # 5.58f

    .line 95
    .line 96
    .line 97
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 98
    .line 99
    .line 100
    const v0, 0x412b0a3d    # 10.69f

    .line 101
    .line 102
    .line 103
    const/high16 v2, 0x40000000    # 2.0f

    .line 104
    .line 105
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 106
    .line 107
    .line 108
    const v0, -0x3f7e6666    # -4.05f

    .line 109
    .line 110
    .line 111
    const v2, 0x4081999a    # 4.05f

    .line 112
    .line 113
    .line 114
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 115
    .line 116
    .line 117
    const v17, 0x3fe7ae14    # 1.81f

    .line 118
    .line 119
    .line 120
    const v18, -0x40f33333    # -0.55f

    .line 121
    .line 122
    .line 123
    const v13, 0x3ef0a3d7    # 0.47f

    .line 124
    .line 125
    .line 126
    const v14, -0x410f5c29    # -0.47f

    .line 127
    .line 128
    .line 129
    const v15, 0x3f933333    # 1.15f

    .line 130
    .line 131
    .line 132
    const v16, -0x40d1eb85    # -0.68f

    .line 133
    .line 134
    .line 135
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 136
    .line 137
    .line 138
    const v0, 0x40cb3333    # 6.35f

    .line 139
    .line 140
    .line 141
    const v2, 0x41130a3d    # 9.19f

    .line 142
    .line 143
    .line 144
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 145
    .line 146
    .line 147
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 148
    .line 149
    .line 150
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 151
    .line 152
    .line 153
    const/high16 v0, 0x41880000    # 17.0f

    .line 154
    .line 155
    const v2, 0x4132b852    # 11.17f

    .line 156
    .line 157
    .line 158
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 159
    .line 160
    .line 161
    const v17, 0x40bc7ae1    # 5.89f

    .line 162
    .line 163
    .line 164
    const v18, -0x3f933333    # -3.7f

    .line 165
    .line 166
    .line 167
    const/4 v13, 0x0

    .line 168
    const/4 v14, 0x0

    .line 169
    const v15, 0x406f5c29    # 3.74f

    .line 170
    .line 171
    .line 172
    const v16, -0x4039999a    # -1.55f

    .line 173
    .line 174
    .line 175
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 176
    .line 177
    .line 178
    const v17, 0x4086b852    # 4.21f

    .line 179
    .line 180
    .line 181
    const v18, -0x3ed6e148    # -10.57f

    .line 182
    .line 183
    .line 184
    const v13, 0x40accccd    # 5.4f

    .line 185
    .line 186
    .line 187
    const v14, -0x3f533333    # -5.4f

    .line 188
    .line 189
    .line 190
    const/high16 v15, 0x40900000    # 4.5f

    .line 191
    .line 192
    const v16, -0x3ee6147b    # -9.62f

    .line 193
    .line 194
    .line 195
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 196
    .line 197
    .line 198
    const v17, -0x3ed6e148    # -10.57f

    .line 199
    .line 200
    .line 201
    const v18, 0x4086b852    # 4.21f

    .line 202
    .line 203
    .line 204
    const v13, -0x408ccccd    # -0.95f

    .line 205
    .line 206
    .line 207
    const v14, -0x41666666    # -0.3f

    .line 208
    .line 209
    .line 210
    const v15, -0x3f5a8f5c    # -5.17f

    .line 211
    .line 212
    .line 213
    const v16, -0x4067ae14    # -1.19f

    .line 214
    .line 215
    .line 216
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 217
    .line 218
    .line 219
    const/high16 v17, 0x40e00000    # 7.0f

    .line 220
    .line 221
    const v18, 0x414d47ae    # 12.83f

    .line 222
    .line 223
    .line 224
    const v13, 0x4108cccd    # 8.55f

    .line 225
    .line 226
    .line 227
    const v14, 0x411170a4    # 9.09f

    .line 228
    .line 229
    .line 230
    const/high16 v15, 0x40e00000    # 7.0f

    .line 231
    .line 232
    const v16, 0x414d47ae    # 12.83f

    .line 233
    .line 234
    .line 235
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 236
    .line 237
    .line 238
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 239
    .line 240
    .line 241
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 242
    .line 243
    .line 244
    const v0, 0x416cf5c3    # 14.81f

    .line 245
    .line 246
    .line 247
    const v2, 0x418d3333    # 17.65f

    .line 248
    .line 249
    .line 250
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 251
    .line 252
    .line 253
    const v17, -0x3f43851f    # -5.89f

    .line 254
    .line 255
    .line 256
    const v18, 0x40647ae1    # 3.57f

    .line 257
    .line 258
    .line 259
    const v13, -0x3fed70a4    # -2.29f

    .line 260
    .line 261
    .line 262
    const v14, 0x40028f5c    # 2.04f

    .line 263
    .line 264
    .line 265
    const v15, -0x3f4d70a4    # -5.58f

    .line 266
    .line 267
    .line 268
    const v16, 0x405c28f6    # 3.44f

    .line 269
    .line 270
    .line 271
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 272
    .line 273
    .line 274
    const v0, 0x4154f5c3    # 13.31f

    .line 275
    .line 276
    .line 277
    const/high16 v2, 0x41b00000    # 22.0f

    .line 278
    .line 279
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 280
    .line 281
    .line 282
    const v0, -0x3f7e6666    # -4.05f

    .line 283
    .line 284
    .line 285
    const v2, 0x4081999a    # 4.05f

    .line 286
    .line 287
    .line 288
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 289
    .line 290
    .line 291
    const v17, 0x3f0ccccd    # 0.55f

    .line 292
    .line 293
    .line 294
    const v18, -0x401851ec    # -1.81f

    .line 295
    .line 296
    .line 297
    const v13, 0x3ef0a3d7    # 0.47f

    .line 298
    .line 299
    .line 300
    const v14, -0x410f5c29    # -0.47f

    .line 301
    .line 302
    .line 303
    const v15, 0x3f2e147b    # 0.68f

    .line 304
    .line 305
    .line 306
    const v16, -0x406ccccd    # -1.15f

    .line 307
    .line 308
    .line 309
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 310
    .line 311
    .line 312
    const v0, 0x416cf5c3    # 14.81f

    .line 313
    .line 314
    .line 315
    const v2, 0x418d3333    # 17.65f

    .line 316
    .line 317
    .line 318
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 319
    .line 320
    .line 321
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 322
    .line 323
    .line 324
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 325
    .line 326
    .line 327
    const/high16 v0, 0x41900000    # 18.0f

    .line 328
    .line 329
    const/high16 v2, 0x41100000    # 9.0f

    .line 330
    .line 331
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 332
    .line 333
    .line 334
    const v17, -0x409eb852    # -0.88f

    .line 335
    .line 336
    .line 337
    const v18, 0x4007ae14    # 2.12f

    .line 338
    .line 339
    .line 340
    const/4 v13, 0x0

    .line 341
    const v14, 0x3f547ae1    # 0.83f

    .line 342
    .line 343
    .line 344
    const v15, -0x4151eb85    # -0.34f

    .line 345
    .line 346
    .line 347
    const v16, 0x3fca3d71    # 1.58f

    .line 348
    .line 349
    .line 350
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 351
    .line 352
    .line 353
    const/high16 v17, 0x40000000    # 2.0f

    .line 354
    .line 355
    const/high16 v18, 0x41b00000    # 22.0f

    .line 356
    .line 357
    const v13, 0x40de147b    # 6.94f

    .line 358
    .line 359
    .line 360
    const v14, 0x41aa6666    # 21.3f

    .line 361
    .line 362
    .line 363
    const/high16 v15, 0x40000000    # 2.0f

    .line 364
    .line 365
    const/high16 v16, 0x41b00000    # 22.0f

    .line 366
    .line 367
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 368
    .line 369
    .line 370
    const v0, 0x3ff0a3d7    # 1.88f

    .line 371
    .line 372
    .line 373
    const v2, -0x3f3c28f6    # -6.12f

    .line 374
    .line 375
    .line 376
    const v4, 0x3f333333    # 0.7f

    .line 377
    .line 378
    .line 379
    const v6, -0x3f61eb85    # -4.94f

    .line 380
    .line 381
    .line 382
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 383
    .line 384
    .line 385
    const/high16 v17, 0x40c00000    # 6.0f

    .line 386
    .line 387
    const/high16 v18, 0x41700000    # 15.0f

    .line 388
    .line 389
    const v13, 0x408d70a4    # 4.42f

    .line 390
    .line 391
    .line 392
    const v14, 0x417570a4    # 15.34f

    .line 393
    .line 394
    .line 395
    const v15, 0x40a570a4    # 5.17f

    .line 396
    .line 397
    .line 398
    const/high16 v16, 0x41700000    # 15.0f

    .line 399
    .line 400
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 401
    .line 402
    .line 403
    const/high16 v17, 0x41100000    # 9.0f

    .line 404
    .line 405
    const/high16 v18, 0x41900000    # 18.0f

    .line 406
    .line 407
    const v13, 0x40f51eb8    # 7.66f

    .line 408
    .line 409
    .line 410
    const/high16 v14, 0x41700000    # 15.0f

    .line 411
    .line 412
    const/high16 v15, 0x41100000    # 9.0f

    .line 413
    .line 414
    const v16, 0x4182b852    # 16.34f

    .line 415
    .line 416
    .line 417
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 418
    .line 419
    .line 420
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 421
    .line 422
    .line 423
    const/high16 v0, 0x41500000    # 13.0f

    .line 424
    .line 425
    const/high16 v2, 0x41100000    # 9.0f

    .line 426
    .line 427
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 428
    .line 429
    .line 430
    const/high16 v17, 0x40000000    # 2.0f

    .line 431
    .line 432
    const/high16 v18, -0x40000000    # -2.0f

    .line 433
    .line 434
    const/4 v13, 0x0

    .line 435
    const v14, -0x40733333    # -1.1f

    .line 436
    .line 437
    .line 438
    const v15, 0x3f666666    # 0.9f

    .line 439
    .line 440
    .line 441
    const/high16 v16, -0x40000000    # -2.0f

    .line 442
    .line 443
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 444
    .line 445
    .line 446
    const v0, 0x3f666666    # 0.9f

    .line 447
    .line 448
    .line 449
    const/high16 v2, 0x40000000    # 2.0f

    .line 450
    .line 451
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 452
    .line 453
    .line 454
    const v0, -0x4099999a    # -0.9f

    .line 455
    .line 456
    .line 457
    const/high16 v2, -0x40000000    # -2.0f

    .line 458
    .line 459
    const/high16 v4, 0x40000000    # 2.0f

    .line 460
    .line 461
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 462
    .line 463
    .line 464
    const v0, 0x4121999a    # 10.1f

    .line 465
    .line 466
    .line 467
    const/high16 v2, 0x41500000    # 13.0f

    .line 468
    .line 469
    const/high16 v4, 0x41100000    # 9.0f

    .line 470
    .line 471
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 472
    .line 473
    .line 474
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 475
    .line 476
    .line 477
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 478
    .line 479
    .line 480
    move-result-object v2

    .line 481
    const/16 v16, 0x3800

    .line 482
    .line 483
    const/16 v17, 0x0

    .line 484
    .line 485
    const/high16 v6, 0x3f800000    # 1.0f

    .line 486
    .line 487
    const/high16 v8, 0x3f800000    # 1.0f

    .line 488
    .line 489
    const/4 v7, 0x0

    .line 490
    const/high16 v9, 0x3f800000    # 1.0f

    .line 491
    .line 492
    const/high16 v12, 0x3f800000    # 1.0f

    .line 493
    .line 494
    const/4 v14, 0x0

    .line 495
    const/4 v15, 0x0

    .line 496
    const-string v4, ""

    .line 497
    .line 498
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 499
    .line 500
    .line 501
    move-result-object v0

    .line 502
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 503
    .line 504
    .line 505
    move-result-object v0

    .line 506
    sput-object v0, Landroidx/compose/material/icons/filled/RocketLaunchKt;->_rocketLaunch:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 507
    .line 508
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 509
    .line 510
    .line 511
    return-object v0
.end method
