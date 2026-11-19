.class public final Landroidx/compose/material/icons/rounded/IntegrationInstructionsKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_integrationInstructions",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "IntegrationInstructions",
        "Landroidx/compose/material/icons/Icons$Rounded;",
        "getIntegrationInstructions",
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
        "SMAP\nIntegrationInstructions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntegrationInstructions.kt\nandroidx/compose/material/icons/rounded/IntegrationInstructionsKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,88:1\n212#2,12:89\n233#2,18:102\n253#2:139\n174#3:101\n705#4,2:120\n717#4,2:122\n719#4,11:128\n72#5,4:124\n*S KotlinDebug\n*F\n+ 1 IntegrationInstructions.kt\nandroidx/compose/material/icons/rounded/IntegrationInstructionsKt\n*L\n29#1:89,12\n30#1:102,18\n30#1:139\n29#1:101\n30#1:120,2\n30#1:122,2\n30#1:128,11\n30#1:124,4\n*E\n"
    }
.end annotation


# static fields
.field private static _integrationInstructions:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getIntegrationInstructions(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/IntegrationInstructionsKt;->_integrationInstructions:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.IntegrationInstructions"

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
    const v0, -0x3f7a3d71    # -4.18f

    .line 78
    .line 79
    .line 80
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 81
    .line 82
    .line 83
    const/high16 v17, 0x41400000    # 12.0f

    .line 84
    .line 85
    const/high16 v18, 0x3f800000    # 1.0f

    .line 86
    .line 87
    const v13, 0x41666666    # 14.4f

    .line 88
    .line 89
    .line 90
    const v14, 0x3feb851f    # 1.84f

    .line 91
    .line 92
    .line 93
    const v15, 0x4154cccd    # 13.3f

    .line 94
    .line 95
    .line 96
    const/high16 v16, 0x3f800000    # 1.0f

    .line 97
    .line 98
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 99
    .line 100
    .line 101
    const v0, 0x3feb851f    # 1.84f

    .line 102
    .line 103
    .line 104
    const v2, 0x4112e148    # 9.18f

    .line 105
    .line 106
    .line 107
    const/high16 v4, 0x40400000    # 3.0f

    .line 108
    .line 109
    const v6, 0x4119999a    # 9.6f

    .line 110
    .line 111
    .line 112
    invoke-virtual {v12, v6, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 113
    .line 114
    .line 115
    const/high16 v0, 0x40a00000    # 5.0f

    .line 116
    .line 117
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 118
    .line 119
    .line 120
    const v17, 0x40933333    # 4.6f

    .line 121
    .line 122
    .line 123
    const v18, 0x40428f5c    # 3.04f

    .line 124
    .line 125
    .line 126
    const v13, 0x409b851f    # 4.86f

    .line 127
    .line 128
    .line 129
    const/high16 v14, 0x40400000    # 3.0f

    .line 130
    .line 131
    const v15, 0x40975c29    # 4.73f

    .line 132
    .line 133
    .line 134
    const v16, 0x4040a3d7    # 3.01f

    .line 135
    .line 136
    .line 137
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 138
    .line 139
    .line 140
    const v17, 0x4065c28f    # 3.59f

    .line 141
    .line 142
    .line 143
    const v18, 0x4065c28f    # 3.59f

    .line 144
    .line 145
    .line 146
    const v13, 0x4086b852    # 4.21f

    .line 147
    .line 148
    .line 149
    const v14, 0x4047ae14    # 3.12f

    .line 150
    .line 151
    .line 152
    const v15, 0x40770a3d    # 3.86f

    .line 153
    .line 154
    .line 155
    const v16, 0x40547ae1    # 3.32f

    .line 156
    .line 157
    .line 158
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 159
    .line 160
    .line 161
    const v17, -0x4123d70a    # -0.43f

    .line 162
    .line 163
    .line 164
    const v18, 0x3f23d70a    # 0.64f

    .line 165
    .line 166
    .line 167
    const v13, -0x41c7ae14    # -0.18f

    .line 168
    .line 169
    .line 170
    const v14, 0x3e3851ec    # 0.18f

    .line 171
    .line 172
    .line 173
    const v15, -0x41570a3d    # -0.33f

    .line 174
    .line 175
    .line 176
    const v16, 0x3ecccccd    # 0.4f

    .line 177
    .line 178
    .line 179
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 180
    .line 181
    .line 182
    const/high16 v17, 0x40400000    # 3.0f

    .line 183
    .line 184
    const/high16 v18, 0x40a00000    # 5.0f

    .line 185
    .line 186
    const v13, 0x4043d70a    # 3.06f

    .line 187
    .line 188
    .line 189
    const v14, 0x408eb852    # 4.46f

    .line 190
    .line 191
    .line 192
    const/high16 v15, 0x40400000    # 3.0f

    .line 193
    .line 194
    const v16, 0x40970a3d    # 4.72f

    .line 195
    .line 196
    .line 197
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 198
    .line 199
    .line 200
    const/high16 v0, 0x41600000    # 14.0f

    .line 201
    .line 202
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 203
    .line 204
    .line 205
    const v17, 0x3e23d70a    # 0.16f

    .line 206
    .line 207
    .line 208
    const v18, 0x3f47ae14    # 0.78f

    .line 209
    .line 210
    .line 211
    const/4 v13, 0x0

    .line 212
    const v14, 0x3e8a3d71    # 0.27f

    .line 213
    .line 214
    .line 215
    const v15, 0x3d75c28f    # 0.06f

    .line 216
    .line 217
    .line 218
    const v16, 0x3f0a3d71    # 0.54f

    .line 219
    .line 220
    .line 221
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 222
    .line 223
    .line 224
    const v17, 0x3edc28f6    # 0.43f

    .line 225
    .line 226
    .line 227
    const v18, 0x3f23d70a    # 0.64f

    .line 228
    .line 229
    .line 230
    const v13, 0x3dcccccd    # 0.1f

    .line 231
    .line 232
    .line 233
    const v14, 0x3e75c28f    # 0.24f

    .line 234
    .line 235
    .line 236
    const/high16 v15, 0x3e800000    # 0.25f

    .line 237
    .line 238
    const v16, 0x3ee66666    # 0.45f

    .line 239
    .line 240
    .line 241
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 242
    .line 243
    .line 244
    const v17, 0x3f8147ae    # 1.01f

    .line 245
    .line 246
    .line 247
    const v18, 0x3f0ccccd    # 0.55f

    .line 248
    .line 249
    .line 250
    const v13, 0x3e8a3d71    # 0.27f

    .line 251
    .line 252
    .line 253
    const v14, 0x3e8a3d71    # 0.27f

    .line 254
    .line 255
    .line 256
    const v15, 0x3f1eb852    # 0.62f

    .line 257
    .line 258
    .line 259
    const v16, 0x3ef0a3d7    # 0.47f

    .line 260
    .line 261
    .line 262
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 263
    .line 264
    .line 265
    const/high16 v17, 0x40a00000    # 5.0f

    .line 266
    .line 267
    const/high16 v18, 0x41a80000    # 21.0f

    .line 268
    .line 269
    const v13, 0x40975c29    # 4.73f

    .line 270
    .line 271
    .line 272
    const v14, 0x41a7eb85    # 20.99f

    .line 273
    .line 274
    .line 275
    const v15, 0x409b851f    # 4.86f

    .line 276
    .line 277
    .line 278
    const/high16 v16, 0x41a80000    # 21.0f

    .line 279
    .line 280
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 281
    .line 282
    .line 283
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 284
    .line 285
    .line 286
    const/high16 v17, 0x40000000    # 2.0f

    .line 287
    .line 288
    const/high16 v18, -0x40000000    # -2.0f

    .line 289
    .line 290
    const v13, 0x3f8ccccd    # 1.1f

    .line 291
    .line 292
    .line 293
    const/4 v14, 0x0

    .line 294
    const/high16 v15, 0x40000000    # 2.0f

    .line 295
    .line 296
    const v16, -0x4099999a    # -0.9f

    .line 297
    .line 298
    .line 299
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 300
    .line 301
    .line 302
    const/high16 v0, 0x40a00000    # 5.0f

    .line 303
    .line 304
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 305
    .line 306
    .line 307
    const/high16 v17, 0x41980000    # 19.0f

    .line 308
    .line 309
    const/high16 v18, 0x40400000    # 3.0f

    .line 310
    .line 311
    const/high16 v13, 0x41a80000    # 21.0f

    .line 312
    .line 313
    const v14, 0x4079999a    # 3.9f

    .line 314
    .line 315
    .line 316
    const v15, 0x41a0cccd    # 20.1f

    .line 317
    .line 318
    .line 319
    const/high16 v16, 0x40400000    # 3.0f

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
    const v0, 0x4124cccd    # 10.3f

    .line 328
    .line 329
    .line 330
    const v2, 0x416e147b    # 14.88f

    .line 331
    .line 332
    .line 333
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 334
    .line 335
    .line 336
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 337
    .line 338
    .line 339
    const v17, -0x404a3d71    # -1.42f

    .line 340
    .line 341
    .line 342
    const/16 v18, 0x0

    .line 343
    .line 344
    const v13, -0x413851ec    # -0.39f

    .line 345
    .line 346
    .line 347
    const v14, 0x3ec7ae14    # 0.39f

    .line 348
    .line 349
    .line 350
    const v15, -0x407c28f6    # -1.03f

    .line 351
    .line 352
    .line 353
    const v16, 0x3ec7ae14    # 0.39f

    .line 354
    .line 355
    .line 356
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 357
    .line 358
    .line 359
    const v0, -0x3ff51eb8    # -2.17f

    .line 360
    .line 361
    .line 362
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 363
    .line 364
    .line 365
    const/16 v17, 0x0

    .line 366
    .line 367
    const v18, -0x404b851f    # -1.41f

    .line 368
    .line 369
    .line 370
    const v14, -0x413851ec    # -0.39f

    .line 371
    .line 372
    .line 373
    const v15, -0x413851ec    # -0.39f

    .line 374
    .line 375
    .line 376
    const v16, -0x407d70a4    # -1.02f

    .line 377
    .line 378
    .line 379
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 380
    .line 381
    .line 382
    const v0, 0x400ae148    # 2.17f

    .line 383
    .line 384
    .line 385
    const v2, -0x3ff51eb8    # -2.17f

    .line 386
    .line 387
    .line 388
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 389
    .line 390
    .line 391
    const v17, 0x3fb5c28f    # 1.42f

    .line 392
    .line 393
    .line 394
    const/16 v18, 0x0

    .line 395
    .line 396
    const v13, 0x3ec7ae14    # 0.39f

    .line 397
    .line 398
    .line 399
    const v15, 0x3f83d70a    # 1.03f

    .line 400
    .line 401
    .line 402
    const v16, -0x413851ec    # -0.39f

    .line 403
    .line 404
    .line 405
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 406
    .line 407
    .line 408
    const/4 v0, 0x0

    .line 409
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 410
    .line 411
    .line 412
    const/16 v17, 0x0

    .line 413
    .line 414
    const v18, 0x3fb47ae1    # 1.41f

    .line 415
    .line 416
    .line 417
    const v14, 0x3ec7ae14    # 0.39f

    .line 418
    .line 419
    .line 420
    const v15, 0x3ec7ae14    # 0.39f

    .line 421
    .line 422
    .line 423
    const v16, 0x3f828f5c    # 1.02f

    .line 424
    .line 425
    .line 426
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 427
    .line 428
    .line 429
    const v0, 0x410d47ae    # 8.83f

    .line 430
    .line 431
    .line 432
    const/high16 v2, 0x41400000    # 12.0f

    .line 433
    .line 434
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 435
    .line 436
    .line 437
    const v0, 0x3fbae148    # 1.46f

    .line 438
    .line 439
    .line 440
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 441
    .line 442
    .line 443
    const v17, 0x4124cccd    # 10.3f

    .line 444
    .line 445
    .line 446
    const v18, 0x416e147b    # 14.88f

    .line 447
    .line 448
    .line 449
    const v13, 0x412ae148    # 10.68f

    .line 450
    .line 451
    .line 452
    const v14, 0x415d999a    # 13.85f

    .line 453
    .line 454
    .line 455
    const v15, 0x412b0a3d    # 10.69f

    .line 456
    .line 457
    .line 458
    const v16, 0x4167d70a    # 14.49f

    .line 459
    .line 460
    .line 461
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 462
    .line 463
    .line 464
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 465
    .line 466
    .line 467
    const/high16 v0, 0x40880000    # 4.25f

    .line 468
    .line 469
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 470
    .line 471
    .line 472
    const/high16 v17, -0x40c00000    # -0.75f

    .line 473
    .line 474
    const/high16 v18, -0x40c00000    # -0.75f

    .line 475
    .line 476
    const v13, -0x412e147b    # -0.41f

    .line 477
    .line 478
    .line 479
    const/4 v14, 0x0

    .line 480
    const/high16 v15, -0x40c00000    # -0.75f

    .line 481
    .line 482
    const v16, -0x4151eb85    # -0.34f

    .line 483
    .line 484
    .line 485
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 486
    .line 487
    .line 488
    const v0, 0x413970a4    # 11.59f

    .line 489
    .line 490
    .line 491
    const/high16 v2, 0x40300000    # 2.75f

    .line 492
    .line 493
    const/high16 v4, 0x41400000    # 12.0f

    .line 494
    .line 495
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 496
    .line 497
    .line 498
    const v0, 0x3eae147b    # 0.34f

    .line 499
    .line 500
    .line 501
    const/high16 v2, 0x3f400000    # 0.75f

    .line 502
    .line 503
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 504
    .line 505
    .line 506
    const v0, 0x41468f5c    # 12.41f

    .line 507
    .line 508
    .line 509
    const/high16 v2, 0x40880000    # 4.25f

    .line 510
    .line 511
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 512
    .line 513
    .line 514
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 515
    .line 516
    .line 517
    const v0, 0x415b3333    # 13.7f

    .line 518
    .line 519
    .line 520
    const v2, 0x416e147b    # 14.88f

    .line 521
    .line 522
    .line 523
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 524
    .line 525
    .line 526
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 527
    .line 528
    .line 529
    const/16 v17, 0x0

    .line 530
    .line 531
    const v18, -0x404b851f    # -1.41f

    .line 532
    .line 533
    .line 534
    const v13, -0x413851ec    # -0.39f

    .line 535
    .line 536
    .line 537
    const v14, -0x413851ec    # -0.39f

    .line 538
    .line 539
    .line 540
    const v15, -0x413851ec    # -0.39f

    .line 541
    .line 542
    .line 543
    const v16, -0x407d70a4    # -1.02f

    .line 544
    .line 545
    .line 546
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 547
    .line 548
    .line 549
    const v0, 0x4172b852    # 15.17f

    .line 550
    .line 551
    .line 552
    const/high16 v2, 0x41400000    # 12.0f

    .line 553
    .line 554
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 555
    .line 556
    .line 557
    const v0, -0x4043d70a    # -1.47f

    .line 558
    .line 559
    .line 560
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 561
    .line 562
    .line 563
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 564
    .line 565
    .line 566
    const/4 v0, 0x0

    .line 567
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 568
    .line 569
    .line 570
    const v17, 0x3fb5c28f    # 1.42f

    .line 571
    .line 572
    .line 573
    const/16 v18, 0x0

    .line 574
    .line 575
    const v13, 0x3ec7ae14    # 0.39f

    .line 576
    .line 577
    .line 578
    const v15, 0x3f83d70a    # 1.03f

    .line 579
    .line 580
    .line 581
    const v16, -0x413851ec    # -0.39f

    .line 582
    .line 583
    .line 584
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 585
    .line 586
    .line 587
    const v0, 0x400ae148    # 2.17f

    .line 588
    .line 589
    .line 590
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 591
    .line 592
    .line 593
    const/16 v17, 0x0

    .line 594
    .line 595
    const v18, 0x3fb47ae1    # 1.41f

    .line 596
    .line 597
    .line 598
    const v14, 0x3ec7ae14    # 0.39f

    .line 599
    .line 600
    .line 601
    const v15, 0x3ec7ae14    # 0.39f

    .line 602
    .line 603
    .line 604
    const v16, 0x3f828f5c    # 1.02f

    .line 605
    .line 606
    .line 607
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 608
    .line 609
    .line 610
    const v2, -0x3ff51eb8    # -2.17f

    .line 611
    .line 612
    .line 613
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 614
    .line 615
    .line 616
    const v17, 0x415b3333    # 13.7f

    .line 617
    .line 618
    .line 619
    const v18, 0x416e147b    # 14.88f

    .line 620
    .line 621
    .line 622
    const v13, 0x416bae14    # 14.73f

    .line 623
    .line 624
    .line 625
    const v14, 0x417451ec    # 15.27f

    .line 626
    .line 627
    .line 628
    const v15, 0x416170a4    # 14.09f

    .line 629
    .line 630
    .line 631
    const v16, 0x417451ec    # 15.27f

    .line 632
    .line 633
    .line 634
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 635
    .line 636
    .line 637
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 638
    .line 639
    .line 640
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 641
    .line 642
    .line 643
    move-result-object v2

    .line 644
    const/16 v16, 0x3800

    .line 645
    .line 646
    const/16 v17, 0x0

    .line 647
    .line 648
    const/high16 v6, 0x3f800000    # 1.0f

    .line 649
    .line 650
    const/high16 v8, 0x3f800000    # 1.0f

    .line 651
    .line 652
    const/4 v7, 0x0

    .line 653
    const/high16 v9, 0x3f800000    # 1.0f

    .line 654
    .line 655
    const/high16 v12, 0x3f800000    # 1.0f

    .line 656
    .line 657
    const/4 v13, 0x0

    .line 658
    const/4 v14, 0x0

    .line 659
    const/4 v15, 0x0

    .line 660
    const-string v4, ""

    .line 661
    .line 662
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 663
    .line 664
    .line 665
    move-result-object v0

    .line 666
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 667
    .line 668
    .line 669
    move-result-object v0

    .line 670
    sput-object v0, Landroidx/compose/material/icons/rounded/IntegrationInstructionsKt;->_integrationInstructions:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 671
    .line 672
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 673
    .line 674
    .line 675
    return-object v0
.end method
