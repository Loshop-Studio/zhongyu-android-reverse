.class public final Landroidx/compose/material/icons/twotone/MiscellaneousServicesKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_miscellaneousServices",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "MiscellaneousServices",
        "Landroidx/compose/material/icons/Icons$TwoTone;",
        "getMiscellaneousServices",
        "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;",
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
        "SMAP\nMiscellaneousServices.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MiscellaneousServices.kt\nandroidx/compose/material/icons/twotone/MiscellaneousServicesKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,131:1\n212#2,12:132\n233#2,18:145\n253#2:182\n233#2,18:183\n253#2:220\n174#3:144\n705#4,2:163\n717#4,2:165\n719#4,11:171\n705#4,2:201\n717#4,2:203\n719#4,11:209\n72#5,4:167\n72#5,4:205\n*S KotlinDebug\n*F\n+ 1 MiscellaneousServices.kt\nandroidx/compose/material/icons/twotone/MiscellaneousServicesKt\n*L\n29#1:132,12\n30#1:145,18\n30#1:182\n78#1:183,18\n78#1:220\n29#1:144\n30#1:163,2\n30#1:165,2\n30#1:171,11\n78#1:201,2\n78#1:203,2\n78#1:209,11\n30#1:167,4\n78#1:205,4\n*E\n"
    }
.end annotation


# static fields
.field private static _miscellaneousServices:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getMiscellaneousServices(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/MiscellaneousServicesKt;->_miscellaneousServices:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.MiscellaneousServices"

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
    const v4, 0x4162b852    # 14.17f

    .line 71
    .line 72
    .line 73
    const v6, 0x415b5c29    # 13.71f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v4, -0x3fe51eb8    # -2.42f

    .line 80
    .line 81
    .line 82
    const v6, 0x3fb33333    # 1.4f

    .line 83
    .line 84
    .line 85
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 86
    .line 87
    .line 88
    const v25, -0x425c28f6    # -0.08f

    .line 89
    .line 90
    .line 91
    const v26, -0x4119999a    # -0.45f

    .line 92
    .line 93
    .line 94
    const v21, 0x3db851ec    # 0.09f

    .line 95
    .line 96
    .line 97
    const v22, -0x41e66666    # -0.15f

    .line 98
    .line 99
    .line 100
    const v23, 0x3d4ccccd    # 0.05f

    .line 101
    .line 102
    .line 103
    const v24, -0x4151eb85    # -0.34f

    .line 104
    .line 105
    .line 106
    move-object/from16 v20, v2

    .line 107
    .line 108
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 109
    .line 110
    .line 111
    const v4, -0x406b851f    # -1.16f

    .line 112
    .line 113
    .line 114
    const v6, -0x40428f5c    # -1.48f

    .line 115
    .line 116
    .line 117
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 118
    .line 119
    .line 120
    const v25, 0x3d4ccccd    # 0.05f

    .line 121
    .line 122
    .line 123
    const v26, -0x40d1eb85    # -0.68f

    .line 124
    .line 125
    .line 126
    const v21, 0x3cf5c28f    # 0.03f

    .line 127
    .line 128
    .line 129
    const v22, -0x419eb852    # -0.22f

    .line 130
    .line 131
    .line 132
    const v24, -0x4119999a    # -0.45f

    .line 133
    .line 134
    .line 135
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 136
    .line 137
    .line 138
    const v4, -0x42b33333    # -0.05f

    .line 139
    .line 140
    .line 141
    const v6, -0x40cf5c29    # -0.69f

    .line 142
    .line 143
    .line 144
    const v7, -0x435c28f6    # -0.02f

    .line 145
    .line 146
    .line 147
    const v8, -0x41147ae1    # -0.46f

    .line 148
    .line 149
    .line 150
    invoke-virtual {v2, v7, v8, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 151
    .line 152
    .line 153
    const v4, 0x3fbd70a4    # 1.48f

    .line 154
    .line 155
    .line 156
    const v6, -0x406b851f    # -1.16f

    .line 157
    .line 158
    .line 159
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 160
    .line 161
    .line 162
    const v25, 0x3da3d70a    # 0.08f

    .line 163
    .line 164
    .line 165
    const v26, -0x4119999a    # -0.45f

    .line 166
    .line 167
    .line 168
    const v21, 0x3e051eb8    # 0.13f

    .line 169
    .line 170
    .line 171
    const v22, -0x421eb852    # -0.11f

    .line 172
    .line 173
    .line 174
    const v23, 0x3e2e147b    # 0.17f

    .line 175
    .line 176
    .line 177
    const v24, -0x41666666    # -0.3f

    .line 178
    .line 179
    .line 180
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 181
    .line 182
    .line 183
    const v4, -0x404ccccd    # -1.4f

    .line 184
    .line 185
    .line 186
    const v6, -0x3fe51eb8    # -2.42f

    .line 187
    .line 188
    .line 189
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 190
    .line 191
    .line 192
    const v25, -0x4123d70a    # -0.43f

    .line 193
    .line 194
    .line 195
    const v26, -0x41e66666    # -0.15f

    .line 196
    .line 197
    .line 198
    const v21, -0x4247ae14    # -0.09f

    .line 199
    .line 200
    .line 201
    const v22, -0x41e66666    # -0.15f

    .line 202
    .line 203
    .line 204
    const v23, -0x4175c28f    # -0.27f

    .line 205
    .line 206
    .line 207
    const v24, -0x41a8f5c3    # -0.21f

    .line 208
    .line 209
    .line 210
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 211
    .line 212
    .line 213
    const/high16 v4, 0x41400000    # 12.0f

    .line 214
    .line 215
    const v6, 0x409a8f5c    # 4.83f

    .line 216
    .line 217
    .line 218
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 219
    .line 220
    .line 221
    const v25, -0x4068f5c3    # -1.18f

    .line 222
    .line 223
    .line 224
    const v26, -0x40cf5c29    # -0.69f

    .line 225
    .line 226
    .line 227
    const v21, -0x4147ae14    # -0.36f

    .line 228
    .line 229
    .line 230
    const v22, -0x4170a3d7    # -0.28f

    .line 231
    .line 232
    .line 233
    const/high16 v23, -0x40c00000    # -0.75f

    .line 234
    .line 235
    const v24, -0x40fd70a4    # -0.51f

    .line 236
    .line 237
    .line 238
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 239
    .line 240
    .line 241
    const v4, -0x417ae148    # -0.26f

    .line 242
    .line 243
    .line 244
    const v6, -0x40133333    # -1.85f

    .line 245
    .line 246
    .line 247
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 248
    .line 249
    .line 250
    const v25, 0x41235c29    # 10.21f

    .line 251
    .line 252
    .line 253
    const/high16 v26, 0x40000000    # 2.0f

    .line 254
    .line 255
    const v21, 0x41287ae1    # 10.53f

    .line 256
    .line 257
    .line 258
    const v22, 0x400851ec    # 2.13f

    .line 259
    .line 260
    .line 261
    const v23, 0x4126147b    # 10.38f

    .line 262
    .line 263
    .line 264
    const/high16 v24, 0x40000000    # 2.0f

    .line 265
    .line 266
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 267
    .line 268
    .line 269
    const v4, -0x3fcccccd    # -2.8f

    .line 270
    .line 271
    .line 272
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 273
    .line 274
    .line 275
    const v25, 0x40e1eb85    # 7.06f

    .line 276
    .line 277
    .line 278
    const v26, 0x40133333    # 2.3f

    .line 279
    .line 280
    .line 281
    const v21, 0x40e7ae14    # 7.24f

    .line 282
    .line 283
    .line 284
    const/high16 v22, 0x40000000    # 2.0f

    .line 285
    .line 286
    const v23, 0x40e2e148    # 7.09f

    .line 287
    .line 288
    .line 289
    const v24, 0x400851ec    # 2.13f

    .line 290
    .line 291
    .line 292
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 293
    .line 294
    .line 295
    const v4, 0x40d9999a    # 6.8f

    .line 296
    .line 297
    .line 298
    const v6, 0x4084cccd    # 4.15f

    .line 299
    .line 300
    .line 301
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 302
    .line 303
    .line 304
    const v25, 0x40b3d70a    # 5.62f

    .line 305
    .line 306
    .line 307
    const v26, 0x409ae148    # 4.84f

    .line 308
    .line 309
    .line 310
    const v21, 0x40cc28f6    # 6.38f

    .line 311
    .line 312
    .line 313
    const v22, 0x408a8f5c    # 4.33f

    .line 314
    .line 315
    .line 316
    const v23, 0x40bf5c29    # 5.98f

    .line 317
    .line 318
    .line 319
    const v24, 0x4091eb85    # 4.56f

    .line 320
    .line 321
    .line 322
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 323
    .line 324
    .line 325
    const v4, -0x402147ae    # -1.74f

    .line 326
    .line 327
    .line 328
    const v6, -0x40cccccd    # -0.7f

    .line 329
    .line 330
    .line 331
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 332
    .line 333
    .line 334
    const v25, -0x4123d70a    # -0.43f

    .line 335
    .line 336
    .line 337
    const v26, 0x3e19999a    # 0.15f

    .line 338
    .line 339
    .line 340
    const v21, -0x41dc28f6    # -0.16f

    .line 341
    .line 342
    .line 343
    const v22, -0x428a3d71    # -0.06f

    .line 344
    .line 345
    .line 346
    const v23, -0x4151eb85    # -0.34f

    .line 347
    .line 348
    .line 349
    const/16 v24, 0x0

    .line 350
    .line 351
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 352
    .line 353
    .line 354
    const v4, 0x401ae148    # 2.42f

    .line 355
    .line 356
    .line 357
    const v6, -0x404ccccd    # -1.4f

    .line 358
    .line 359
    .line 360
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 361
    .line 362
    .line 363
    const v25, 0x400851ec    # 2.13f

    .line 364
    .line 365
    .line 366
    const v26, 0x40e51eb8    # 7.16f

    .line 367
    .line 368
    .line 369
    const v21, 0x3ffae148    # 1.96f

    .line 370
    .line 371
    .line 372
    const v22, 0x40db851f    # 6.86f

    .line 373
    .line 374
    .line 375
    const/high16 v23, 0x40000000    # 2.0f

    .line 376
    .line 377
    const v24, 0x40e1999a    # 7.05f

    .line 378
    .line 379
    .line 380
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 381
    .line 382
    .line 383
    const v4, 0x3f947ae1    # 1.16f

    .line 384
    .line 385
    .line 386
    const v6, 0x3fbd70a4    # 1.48f

    .line 387
    .line 388
    .line 389
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 390
    .line 391
    .line 392
    const v25, 0x4063d70a    # 3.56f

    .line 393
    .line 394
    .line 395
    const/high16 v26, 0x41100000    # 9.0f

    .line 396
    .line 397
    const v21, 0x40651eb8    # 3.58f

    .line 398
    .line 399
    .line 400
    const v22, 0x4108a3d7    # 8.54f

    .line 401
    .line 402
    .line 403
    const v23, 0x4063d70a    # 3.56f

    .line 404
    .line 405
    .line 406
    const v24, 0x410c51ec    # 8.77f

    .line 407
    .line 408
    .line 409
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 410
    .line 411
    .line 412
    const v4, 0x3d4ccccd    # 0.05f

    .line 413
    .line 414
    .line 415
    const v6, 0x3f30a3d7    # 0.69f

    .line 416
    .line 417
    .line 418
    const v7, 0x3ca3d70a    # 0.02f

    .line 419
    .line 420
    .line 421
    const v8, 0x3eeb851f    # 0.46f

    .line 422
    .line 423
    .line 424
    invoke-virtual {v2, v7, v8, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 425
    .line 426
    .line 427
    const v4, 0x3f947ae1    # 1.16f

    .line 428
    .line 429
    .line 430
    const v6, -0x40428f5c    # -1.48f

    .line 431
    .line 432
    .line 433
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 434
    .line 435
    .line 436
    const v25, 0x40033333    # 2.05f

    .line 437
    .line 438
    .line 439
    const v26, 0x4134cccd    # 11.3f

    .line 440
    .line 441
    .line 442
    const/high16 v21, 0x40000000    # 2.0f

    .line 443
    .line 444
    const v22, 0x412f5c29    # 10.96f

    .line 445
    .line 446
    .line 447
    const v23, 0x3ffae148    # 1.96f

    .line 448
    .line 449
    .line 450
    const v24, 0x41326666    # 11.15f

    .line 451
    .line 452
    .line 453
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 454
    .line 455
    .line 456
    const v4, 0x401ae148    # 2.42f

    .line 457
    .line 458
    .line 459
    const v6, 0x3fb33333    # 1.4f

    .line 460
    .line 461
    .line 462
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 463
    .line 464
    .line 465
    const v25, 0x3edc28f6    # 0.43f

    .line 466
    .line 467
    .line 468
    const v26, 0x3e19999a    # 0.15f

    .line 469
    .line 470
    .line 471
    const v21, 0x3db851ec    # 0.09f

    .line 472
    .line 473
    .line 474
    const v22, 0x3e19999a    # 0.15f

    .line 475
    .line 476
    .line 477
    const v23, 0x3e8a3d71    # 0.27f

    .line 478
    .line 479
    .line 480
    const v24, 0x3e570a3d    # 0.21f

    .line 481
    .line 482
    .line 483
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 484
    .line 485
    .line 486
    const v4, 0x3fdeb852    # 1.74f

    .line 487
    .line 488
    .line 489
    const v6, -0x40cccccd    # -0.7f

    .line 490
    .line 491
    .line 492
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 493
    .line 494
    .line 495
    const v25, 0x3f970a3d    # 1.18f

    .line 496
    .line 497
    .line 498
    const v26, 0x3f30a3d7    # 0.69f

    .line 499
    .line 500
    .line 501
    const v21, 0x3eb851ec    # 0.36f

    .line 502
    .line 503
    .line 504
    const v22, 0x3e8f5c29    # 0.28f

    .line 505
    .line 506
    .line 507
    const/high16 v23, 0x3f400000    # 0.75f

    .line 508
    .line 509
    const v24, 0x3f028f5c    # 0.51f

    .line 510
    .line 511
    .line 512
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 513
    .line 514
    .line 515
    const v4, 0x3feccccd    # 1.85f

    .line 516
    .line 517
    .line 518
    const v6, 0x3e851eb8    # 0.26f

    .line 519
    .line 520
    .line 521
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 522
    .line 523
    .line 524
    const v25, 0x40ed1eb8    # 7.41f

    .line 525
    .line 526
    .line 527
    const/high16 v26, 0x41800000    # 16.0f

    .line 528
    .line 529
    const v21, 0x40e2e148    # 7.09f

    .line 530
    .line 531
    .line 532
    const v22, 0x417deb85    # 15.87f

    .line 533
    .line 534
    .line 535
    const v23, 0x40e7ae14    # 7.24f

    .line 536
    .line 537
    .line 538
    const/high16 v24, 0x41800000    # 16.0f

    .line 539
    .line 540
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 541
    .line 542
    .line 543
    const v4, 0x40333333    # 2.8f

    .line 544
    .line 545
    .line 546
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 547
    .line 548
    .line 549
    const v25, 0x3eb33333    # 0.35f

    .line 550
    .line 551
    .line 552
    const v26, -0x41666666    # -0.3f

    .line 553
    .line 554
    .line 555
    const v21, 0x3e2e147b    # 0.17f

    .line 556
    .line 557
    .line 558
    const/16 v22, 0x0

    .line 559
    .line 560
    const v23, 0x3ea3d70a    # 0.32f

    .line 561
    .line 562
    .line 563
    const v24, -0x41fae148    # -0.13f

    .line 564
    .line 565
    .line 566
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 567
    .line 568
    .line 569
    const v4, 0x3e851eb8    # 0.26f

    .line 570
    .line 571
    .line 572
    const v6, -0x40133333    # -1.85f

    .line 573
    .line 574
    .line 575
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 576
    .line 577
    .line 578
    const v25, 0x3f970a3d    # 1.18f

    .line 579
    .line 580
    .line 581
    const v26, -0x40cf5c29    # -0.69f

    .line 582
    .line 583
    .line 584
    const v21, 0x3ed70a3d    # 0.42f

    .line 585
    .line 586
    .line 587
    const v22, -0x41c7ae14    # -0.18f

    .line 588
    .line 589
    .line 590
    const v23, 0x3f51eb85    # 0.82f

    .line 591
    .line 592
    .line 593
    const v24, -0x412e147b    # -0.41f

    .line 594
    .line 595
    .line 596
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 597
    .line 598
    .line 599
    const v4, 0x3f333333    # 0.7f

    .line 600
    .line 601
    .line 602
    const v6, 0x3fdeb852    # 1.74f

    .line 603
    .line 604
    .line 605
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 606
    .line 607
    .line 608
    const v25, 0x4162b852    # 14.17f

    .line 609
    .line 610
    .line 611
    const v26, 0x415b5c29    # 13.71f

    .line 612
    .line 613
    .line 614
    const v21, 0x415e6666    # 13.9f

    .line 615
    .line 616
    .line 617
    const v22, 0x415eb852    # 13.92f

    .line 618
    .line 619
    .line 620
    const v23, 0x416147ae    # 14.08f

    .line 621
    .line 622
    .line 623
    const v24, 0x415dc28f    # 13.86f

    .line 624
    .line 625
    .line 626
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 627
    .line 628
    .line 629
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 630
    .line 631
    .line 632
    const v4, 0x410cf5c3    # 8.81f

    .line 633
    .line 634
    .line 635
    const/high16 v6, 0x41300000    # 11.0f

    .line 636
    .line 637
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 638
    .line 639
    .line 640
    const/high16 v25, -0x40000000    # -2.0f

    .line 641
    .line 642
    const/high16 v26, -0x40000000    # -2.0f

    .line 643
    .line 644
    const v21, -0x40733333    # -1.1f

    .line 645
    .line 646
    .line 647
    const/16 v22, 0x0

    .line 648
    .line 649
    const/high16 v23, -0x40000000    # -2.0f

    .line 650
    .line 651
    const v24, -0x4099999a    # -0.9f

    .line 652
    .line 653
    .line 654
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 655
    .line 656
    .line 657
    const/high16 v25, 0x40000000    # 2.0f

    .line 658
    .line 659
    const/16 v21, 0x0

    .line 660
    .line 661
    const v22, -0x40733333    # -1.1f

    .line 662
    .line 663
    .line 664
    const v23, 0x3f666666    # 0.9f

    .line 665
    .line 666
    .line 667
    const/high16 v24, -0x40000000    # -2.0f

    .line 668
    .line 669
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 670
    .line 671
    .line 672
    const v4, 0x3f666666    # 0.9f

    .line 673
    .line 674
    .line 675
    const/high16 v6, 0x40000000    # 2.0f

    .line 676
    .line 677
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 678
    .line 679
    .line 680
    const v25, 0x410cf5c3    # 8.81f

    .line 681
    .line 682
    .line 683
    const/high16 v26, 0x41300000    # 11.0f

    .line 684
    .line 685
    const v21, 0x412cf5c3    # 10.81f

    .line 686
    .line 687
    .line 688
    const v22, 0x4121999a    # 10.1f

    .line 689
    .line 690
    .line 691
    const v23, 0x411e8f5c    # 9.91f

    .line 692
    .line 693
    .line 694
    const/high16 v24, 0x41300000    # 11.0f

    .line 695
    .line 696
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 697
    .line 698
    .line 699
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 700
    .line 701
    .line 702
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 703
    .line 704
    .line 705
    move-result-object v2

    .line 706
    const/16 v16, 0x3800

    .line 707
    .line 708
    const/16 v17, 0x0

    .line 709
    .line 710
    const/high16 v6, 0x3f800000    # 1.0f

    .line 711
    .line 712
    const/high16 v8, 0x3f800000    # 1.0f

    .line 713
    .line 714
    const/4 v7, 0x0

    .line 715
    const/high16 v9, 0x3f800000    # 1.0f

    .line 716
    .line 717
    const/high16 v12, 0x3f800000    # 1.0f

    .line 718
    .line 719
    const/4 v13, 0x0

    .line 720
    const/4 v14, 0x0

    .line 721
    const/4 v15, 0x0

    .line 722
    const-string v4, ""

    .line 723
    .line 724
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 725
    .line 726
    .line 727
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 728
    .line 729
    .line 730
    move-result v3

    .line 731
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 732
    .line 733
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 734
    .line 735
    .line 736
    move-result-wide v6

    .line 737
    const/4 v0, 0x0

    .line 738
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 739
    .line 740
    .line 741
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 742
    .line 743
    .line 744
    move-result v10

    .line 745
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 746
    .line 747
    .line 748
    move-result v11

    .line 749
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 750
    .line 751
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 752
    .line 753
    .line 754
    const v0, 0x41af5c29    # 21.92f

    .line 755
    .line 756
    .line 757
    const v2, 0x41955c29    # 18.67f

    .line 758
    .line 759
    .line 760
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 761
    .line 762
    .line 763
    const v0, -0x408a3d71    # -0.96f

    .line 764
    .line 765
    .line 766
    const v2, -0x40c28f5c    # -0.74f

    .line 767
    .line 768
    .line 769
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 770
    .line 771
    .line 772
    const v17, 0x3d23d70a    # 0.04f

    .line 773
    .line 774
    .line 775
    const v18, -0x411eb852    # -0.44f

    .line 776
    .line 777
    .line 778
    const v13, 0x3ca3d70a    # 0.02f

    .line 779
    .line 780
    .line 781
    const v14, -0x41f0a3d7    # -0.14f

    .line 782
    .line 783
    .line 784
    const v15, 0x3d23d70a    # 0.04f

    .line 785
    .line 786
    .line 787
    const v16, -0x416b851f    # -0.29f

    .line 788
    .line 789
    .line 790
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 791
    .line 792
    .line 793
    const v17, -0x42dc28f6    # -0.04f

    .line 794
    .line 795
    .line 796
    const/4 v13, 0x0

    .line 797
    const v14, -0x41e66666    # -0.15f

    .line 798
    .line 799
    .line 800
    const v15, -0x43dc28f6    # -0.01f

    .line 801
    .line 802
    .line 803
    const v16, -0x41666666    # -0.3f

    .line 804
    .line 805
    .line 806
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 807
    .line 808
    .line 809
    const v0, 0x3f733333    # 0.95f

    .line 810
    .line 811
    .line 812
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 813
    .line 814
    .line 815
    const v17, 0x3d4ccccd    # 0.05f

    .line 816
    .line 817
    .line 818
    const v18, -0x416b851f    # -0.29f

    .line 819
    .line 820
    .line 821
    const v13, 0x3da3d70a    # 0.08f

    .line 822
    .line 823
    .line 824
    const v14, -0x4270a3d7    # -0.07f

    .line 825
    .line 826
    .line 827
    const v15, 0x3de147ae    # 0.11f

    .line 828
    .line 829
    .line 830
    const v16, -0x41bd70a4    # -0.19f

    .line 831
    .line 832
    .line 833
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 834
    .line 835
    .line 836
    const v0, -0x4039999a    # -1.55f

    .line 837
    .line 838
    .line 839
    const v2, -0x4099999a    # -0.9f

    .line 840
    .line 841
    .line 842
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 843
    .line 844
    .line 845
    const v17, -0x4170a3d7    # -0.28f

    .line 846
    .line 847
    .line 848
    const v18, -0x42333333    # -0.1f

    .line 849
    .line 850
    .line 851
    const v13, -0x42b33333    # -0.05f

    .line 852
    .line 853
    .line 854
    const v14, -0x42333333    # -0.1f

    .line 855
    .line 856
    .line 857
    const v15, -0x41d1eb85    # -0.17f

    .line 858
    .line 859
    .line 860
    const v16, -0x41fae148    # -0.13f

    .line 861
    .line 862
    .line 863
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 864
    .line 865
    .line 866
    const v0, -0x4071eb85    # -1.11f

    .line 867
    .line 868
    .line 869
    const v2, 0x3ee66666    # 0.45f

    .line 870
    .line 871
    .line 872
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 873
    .line 874
    .line 875
    const v17, -0x40bd70a4    # -0.76f

    .line 876
    .line 877
    .line 878
    const v18, -0x411eb852    # -0.44f

    .line 879
    .line 880
    .line 881
    const v13, -0x41947ae1    # -0.23f

    .line 882
    .line 883
    .line 884
    const v14, -0x41c7ae14    # -0.18f

    .line 885
    .line 886
    .line 887
    const v15, -0x410a3d71    # -0.48f

    .line 888
    .line 889
    .line 890
    const v16, -0x41570a3d    # -0.33f

    .line 891
    .line 892
    .line 893
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 894
    .line 895
    .line 896
    const v0, -0x41d1eb85    # -0.17f

    .line 897
    .line 898
    .line 899
    const v2, -0x4068f5c3    # -1.18f

    .line 900
    .line 901
    .line 902
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 903
    .line 904
    .line 905
    const v17, 0x41943d71    # 18.53f

    .line 906
    .line 907
    .line 908
    const/high16 v18, 0x41500000    # 13.0f

    .line 909
    .line 910
    const v13, 0x4195d70a    # 18.73f

    .line 911
    .line 912
    .line 913
    const v14, 0x415147ae    # 13.08f

    .line 914
    .line 915
    .line 916
    const v15, 0x41950a3d    # 18.63f

    .line 917
    .line 918
    .line 919
    const/high16 v16, 0x41500000    # 13.0f

    .line 920
    .line 921
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 922
    .line 923
    .line 924
    const v0, -0x401ae148    # -1.79f

    .line 925
    .line 926
    .line 927
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 928
    .line 929
    .line 930
    const v17, -0x419eb852    # -0.22f

    .line 931
    .line 932
    .line 933
    const v18, 0x3e428f5c    # 0.19f

    .line 934
    .line 935
    .line 936
    const v13, -0x421eb852    # -0.11f

    .line 937
    .line 938
    .line 939
    const/4 v14, 0x0

    .line 940
    const v15, -0x41a8f5c3    # -0.21f

    .line 941
    .line 942
    .line 943
    const v16, 0x3da3d70a    # 0.08f

    .line 944
    .line 945
    .line 946
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 947
    .line 948
    .line 949
    const v0, -0x41d1eb85    # -0.17f

    .line 950
    .line 951
    .line 952
    const v2, 0x3f970a3d    # 1.18f

    .line 953
    .line 954
    .line 955
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 956
    .line 957
    .line 958
    const v17, -0x40bd70a4    # -0.76f

    .line 959
    .line 960
    .line 961
    const v18, 0x3ee147ae    # 0.44f

    .line 962
    .line 963
    .line 964
    const v13, -0x4175c28f    # -0.27f

    .line 965
    .line 966
    .line 967
    const v14, 0x3df5c28f    # 0.12f

    .line 968
    .line 969
    .line 970
    const v15, -0x40f851ec    # -0.53f

    .line 971
    .line 972
    .line 973
    const v16, 0x3e851eb8    # 0.26f

    .line 974
    .line 975
    .line 976
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 977
    .line 978
    .line 979
    const v0, -0x4071eb85    # -1.11f

    .line 980
    .line 981
    .line 982
    const v2, -0x4119999a    # -0.45f

    .line 983
    .line 984
    .line 985
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 986
    .line 987
    .line 988
    const v17, -0x4170a3d7    # -0.28f

    .line 989
    .line 990
    .line 991
    const v18, 0x3dcccccd    # 0.1f

    .line 992
    .line 993
    .line 994
    const v13, -0x42333333    # -0.1f

    .line 995
    .line 996
    .line 997
    const v14, -0x42dc28f6    # -0.04f

    .line 998
    .line 999
    .line 1000
    const v15, -0x419eb852    # -0.22f

    .line 1001
    .line 1002
    .line 1003
    const/16 v16, 0x0

    .line 1004
    .line 1005
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1006
    .line 1007
    .line 1008
    const v0, 0x3fc66666    # 1.55f

    .line 1009
    .line 1010
    .line 1011
    const v2, -0x4099999a    # -0.9f

    .line 1012
    .line 1013
    .line 1014
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1015
    .line 1016
    .line 1017
    const v17, 0x3d4ccccd    # 0.05f

    .line 1018
    .line 1019
    .line 1020
    const v18, 0x3e947ae1    # 0.29f

    .line 1021
    .line 1022
    .line 1023
    const v13, -0x42b33333    # -0.05f

    .line 1024
    .line 1025
    .line 1026
    const v14, 0x3dcccccd    # 0.1f

    .line 1027
    .line 1028
    .line 1029
    const v15, -0x42dc28f6    # -0.04f

    .line 1030
    .line 1031
    .line 1032
    const v16, 0x3e6147ae    # 0.22f

    .line 1033
    .line 1034
    .line 1035
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1036
    .line 1037
    .line 1038
    const v0, 0x3f3d70a4    # 0.74f

    .line 1039
    .line 1040
    .line 1041
    const v2, 0x3f733333    # 0.95f

    .line 1042
    .line 1043
    .line 1044
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1045
    .line 1046
    .line 1047
    const v17, -0x430a3d71    # -0.03f

    .line 1048
    .line 1049
    .line 1050
    const v18, 0x3ee147ae    # 0.44f

    .line 1051
    .line 1052
    .line 1053
    const v13, -0x435c28f6    # -0.02f

    .line 1054
    .line 1055
    .line 1056
    const v14, 0x3e0f5c29    # 0.14f

    .line 1057
    .line 1058
    .line 1059
    const v15, -0x430a3d71    # -0.03f

    .line 1060
    .line 1061
    .line 1062
    const v16, 0x3e947ae1    # 0.29f

    .line 1063
    .line 1064
    .line 1065
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1066
    .line 1067
    .line 1068
    const v17, 0x3cf5c28f    # 0.03f

    .line 1069
    .line 1070
    .line 1071
    const/4 v13, 0x0

    .line 1072
    const v14, 0x3e19999a    # 0.15f

    .line 1073
    .line 1074
    .line 1075
    const v15, 0x3c23d70a    # 0.01f

    .line 1076
    .line 1077
    .line 1078
    const v16, 0x3e99999a    # 0.3f

    .line 1079
    .line 1080
    .line 1081
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1082
    .line 1083
    .line 1084
    const v0, -0x408ccccd    # -0.95f

    .line 1085
    .line 1086
    .line 1087
    const v2, 0x3f3d70a4    # 0.74f

    .line 1088
    .line 1089
    .line 1090
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1091
    .line 1092
    .line 1093
    const v17, -0x42b33333    # -0.05f

    .line 1094
    .line 1095
    .line 1096
    const v18, 0x3e947ae1    # 0.29f

    .line 1097
    .line 1098
    .line 1099
    const v13, -0x425c28f6    # -0.08f

    .line 1100
    .line 1101
    .line 1102
    const v14, 0x3d8f5c29    # 0.07f

    .line 1103
    .line 1104
    .line 1105
    const v15, -0x421eb852    # -0.11f

    .line 1106
    .line 1107
    .line 1108
    const v16, 0x3e428f5c    # 0.19f

    .line 1109
    .line 1110
    .line 1111
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1112
    .line 1113
    .line 1114
    const v0, 0x3fc66666    # 1.55f

    .line 1115
    .line 1116
    .line 1117
    const v2, 0x3f666666    # 0.9f

    .line 1118
    .line 1119
    .line 1120
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1121
    .line 1122
    .line 1123
    const v17, 0x3e8f5c29    # 0.28f

    .line 1124
    .line 1125
    .line 1126
    const v18, 0x3dcccccd    # 0.1f

    .line 1127
    .line 1128
    .line 1129
    const v13, 0x3d4ccccd    # 0.05f

    .line 1130
    .line 1131
    .line 1132
    const v14, 0x3dcccccd    # 0.1f

    .line 1133
    .line 1134
    .line 1135
    const v15, 0x3e2e147b    # 0.17f

    .line 1136
    .line 1137
    .line 1138
    const v16, 0x3e051eb8    # 0.13f

    .line 1139
    .line 1140
    .line 1141
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1142
    .line 1143
    .line 1144
    const v0, 0x3f8e147b    # 1.11f

    .line 1145
    .line 1146
    .line 1147
    const v2, -0x4119999a    # -0.45f

    .line 1148
    .line 1149
    .line 1150
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1151
    .line 1152
    .line 1153
    const v17, 0x3f428f5c    # 0.76f

    .line 1154
    .line 1155
    .line 1156
    const v18, 0x3ee147ae    # 0.44f

    .line 1157
    .line 1158
    .line 1159
    const v13, 0x3e6b851f    # 0.23f

    .line 1160
    .line 1161
    .line 1162
    const v14, 0x3e3851ec    # 0.18f

    .line 1163
    .line 1164
    .line 1165
    const v15, 0x3ef5c28f    # 0.48f

    .line 1166
    .line 1167
    .line 1168
    const v16, 0x3ea8f5c3    # 0.33f

    .line 1169
    .line 1170
    .line 1171
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1172
    .line 1173
    .line 1174
    const v0, 0x3e2e147b    # 0.17f

    .line 1175
    .line 1176
    .line 1177
    const v2, 0x3f970a3d    # 1.18f

    .line 1178
    .line 1179
    .line 1180
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1181
    .line 1182
    .line 1183
    const v17, 0x3e6147ae    # 0.22f

    .line 1184
    .line 1185
    .line 1186
    const v18, 0x3e428f5c    # 0.19f

    .line 1187
    .line 1188
    .line 1189
    const v13, 0x3ca3d70a    # 0.02f

    .line 1190
    .line 1191
    .line 1192
    const v14, 0x3de147ae    # 0.11f

    .line 1193
    .line 1194
    .line 1195
    const v15, 0x3de147ae    # 0.11f

    .line 1196
    .line 1197
    .line 1198
    const v16, 0x3e428f5c    # 0.19f

    .line 1199
    .line 1200
    .line 1201
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1202
    .line 1203
    .line 1204
    const v0, 0x3fe51eb8    # 1.79f

    .line 1205
    .line 1206
    .line 1207
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1208
    .line 1209
    .line 1210
    const v18, -0x41bd70a4    # -0.19f

    .line 1211
    .line 1212
    .line 1213
    const v13, 0x3de147ae    # 0.11f

    .line 1214
    .line 1215
    .line 1216
    const/4 v14, 0x0

    .line 1217
    const v15, 0x3e570a3d    # 0.21f

    .line 1218
    .line 1219
    .line 1220
    const v16, -0x425c28f6    # -0.08f

    .line 1221
    .line 1222
    .line 1223
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1224
    .line 1225
    .line 1226
    const v0, 0x3e2e147b    # 0.17f

    .line 1227
    .line 1228
    .line 1229
    const v2, -0x4068f5c3    # -1.18f

    .line 1230
    .line 1231
    .line 1232
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1233
    .line 1234
    .line 1235
    const/high16 v17, 0x3f400000    # 0.75f

    .line 1236
    .line 1237
    const v18, -0x411eb852    # -0.44f

    .line 1238
    .line 1239
    .line 1240
    const v13, 0x3e8a3d71    # 0.27f

    .line 1241
    .line 1242
    .line 1243
    const v14, -0x420a3d71    # -0.12f

    .line 1244
    .line 1245
    .line 1246
    const v15, 0x3f07ae14    # 0.53f

    .line 1247
    .line 1248
    .line 1249
    const v16, -0x417ae148    # -0.26f

    .line 1250
    .line 1251
    .line 1252
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1253
    .line 1254
    .line 1255
    const v0, 0x3f8f5c29    # 1.12f

    .line 1256
    .line 1257
    .line 1258
    const v2, 0x3ee66666    # 0.45f

    .line 1259
    .line 1260
    .line 1261
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1262
    .line 1263
    .line 1264
    const v17, 0x3e8f5c29    # 0.28f

    .line 1265
    .line 1266
    .line 1267
    const v18, -0x42333333    # -0.1f

    .line 1268
    .line 1269
    .line 1270
    const v13, 0x3dcccccd    # 0.1f

    .line 1271
    .line 1272
    .line 1273
    const v14, 0x3d23d70a    # 0.04f

    .line 1274
    .line 1275
    .line 1276
    const v15, 0x3e6147ae    # 0.22f

    .line 1277
    .line 1278
    .line 1279
    const/16 v16, 0x0

    .line 1280
    .line 1281
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1282
    .line 1283
    .line 1284
    const v0, -0x4039999a    # -1.55f

    .line 1285
    .line 1286
    .line 1287
    const v2, 0x3f666666    # 0.9f

    .line 1288
    .line 1289
    .line 1290
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1291
    .line 1292
    .line 1293
    const v17, 0x41af5c29    # 21.92f

    .line 1294
    .line 1295
    .line 1296
    const v18, 0x41955c29    # 18.67f

    .line 1297
    .line 1298
    .line 1299
    const v13, 0x41b03d71    # 22.03f

    .line 1300
    .line 1301
    .line 1302
    const v14, 0x4196e148    # 18.86f

    .line 1303
    .line 1304
    .line 1305
    const/high16 v15, 0x41b00000    # 22.0f

    .line 1306
    .line 1307
    const v16, 0x4195eb85    # 18.74f

    .line 1308
    .line 1309
    .line 1310
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1311
    .line 1312
    .line 1313
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1314
    .line 1315
    .line 1316
    const v0, 0x418d0a3d    # 17.63f

    .line 1317
    .line 1318
    .line 1319
    const v2, 0x4196a3d7    # 18.83f

    .line 1320
    .line 1321
    .line 1322
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1323
    .line 1324
    .line 1325
    const v17, -0x40533333    # -1.35f

    .line 1326
    .line 1327
    .line 1328
    const v18, -0x40533333    # -1.35f

    .line 1329
    .line 1330
    .line 1331
    const v13, -0x40c28f5c    # -0.74f

    .line 1332
    .line 1333
    .line 1334
    const/4 v14, 0x0

    .line 1335
    const v15, -0x40533333    # -1.35f

    .line 1336
    .line 1337
    .line 1338
    const v16, -0x40e66666    # -0.6f

    .line 1339
    .line 1340
    .line 1341
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1342
    .line 1343
    .line 1344
    const v0, -0x40533333    # -1.35f

    .line 1345
    .line 1346
    .line 1347
    const v2, -0x40533333    # -1.35f

    .line 1348
    .line 1349
    .line 1350
    const v4, 0x3faccccd    # 1.35f

    .line 1351
    .line 1352
    .line 1353
    const v6, 0x3f19999a    # 0.6f

    .line 1354
    .line 1355
    .line 1356
    invoke-virtual {v12, v6, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1357
    .line 1358
    .line 1359
    const v0, 0x3f19999a    # 0.6f

    .line 1360
    .line 1361
    .line 1362
    const v2, 0x3faccccd    # 1.35f

    .line 1363
    .line 1364
    .line 1365
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1366
    .line 1367
    .line 1368
    const v0, 0x4192f5c3    # 18.37f

    .line 1369
    .line 1370
    .line 1371
    const v2, 0x418d0a3d    # 17.63f

    .line 1372
    .line 1373
    .line 1374
    const v4, 0x4196a3d7    # 18.83f

    .line 1375
    .line 1376
    .line 1377
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1378
    .line 1379
    .line 1380
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1381
    .line 1382
    .line 1383
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 1384
    .line 1385
    .line 1386
    move-result-object v2

    .line 1387
    const/16 v16, 0x3800

    .line 1388
    .line 1389
    const/16 v17, 0x0

    .line 1390
    .line 1391
    const/high16 v6, 0x3f800000    # 1.0f

    .line 1392
    .line 1393
    const/4 v7, 0x0

    .line 1394
    const/high16 v12, 0x3f800000    # 1.0f

    .line 1395
    .line 1396
    const/4 v13, 0x0

    .line 1397
    const/4 v15, 0x0

    .line 1398
    const-string v4, ""

    .line 1399
    .line 1400
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 1401
    .line 1402
    .line 1403
    move-result-object v0

    .line 1404
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1405
    .line 1406
    .line 1407
    move-result-object v0

    .line 1408
    sput-object v0, Landroidx/compose/material/icons/twotone/MiscellaneousServicesKt;->_miscellaneousServices:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1409
    .line 1410
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 1411
    .line 1412
    .line 1413
    return-object v0
.end method
