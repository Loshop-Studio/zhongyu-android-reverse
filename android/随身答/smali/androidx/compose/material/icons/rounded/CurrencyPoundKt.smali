.class public final Landroidx/compose/material/icons/rounded/CurrencyPoundKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_currencyPound",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "CurrencyPound",
        "Landroidx/compose/material/icons/Icons$Rounded;",
        "getCurrencyPound",
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
        "SMAP\nCurrencyPound.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CurrencyPound.kt\nandroidx/compose/material/icons/rounded/CurrencyPoundKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,68:1\n212#2,12:69\n233#2,18:82\n253#2:119\n174#3:81\n705#4,2:100\n717#4,2:102\n719#4,11:108\n72#5,4:104\n*S KotlinDebug\n*F\n+ 1 CurrencyPound.kt\nandroidx/compose/material/icons/rounded/CurrencyPoundKt\n*L\n29#1:69,12\n30#1:82,18\n30#1:119\n29#1:81\n30#1:100,2\n30#1:102,2\n30#1:108,11\n30#1:104,4\n*E\n"
    }
.end annotation


# static fields
.field private static _currencyPound:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getCurrencyPound(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/CurrencyPoundKt;->_currencyPound:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.CurrencyPound"

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
    const v0, 0x4189ae14    # 17.21f

    .line 71
    .line 72
    .line 73
    const v2, 0x418ce148    # 17.61f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v17, -0x405851ec    # -1.31f

    .line 80
    .line 81
    .line 82
    const v18, 0x3ecccccd    # 0.4f

    .line 83
    .line 84
    .line 85
    const v13, -0x410f5c29    # -0.47f

    .line 86
    .line 87
    .line 88
    const v14, -0x418a3d71    # -0.24f

    .line 89
    .line 90
    .line 91
    const v15, -0x407c28f6    # -1.03f

    .line 92
    .line 93
    .line 94
    const v16, -0x42b33333    # -0.05f

    .line 95
    .line 96
    .line 97
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 98
    .line 99
    .line 100
    const/high16 v17, 0x41600000    # 14.0f

    .line 101
    .line 102
    const/high16 v18, 0x41980000    # 19.0f

    .line 103
    .line 104
    const v13, 0x4178a3d7    # 15.54f

    .line 105
    .line 106
    .line 107
    const v14, 0x4194e148    # 18.61f

    .line 108
    .line 109
    .line 110
    const v15, 0x416ee148    # 14.93f

    .line 111
    .line 112
    .line 113
    const/high16 v16, 0x41980000    # 19.0f

    .line 114
    .line 115
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 116
    .line 117
    .line 118
    const v0, -0x3f633333    # -4.9f

    .line 119
    .line 120
    .line 121
    const/4 v2, 0x0

    .line 122
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 123
    .line 124
    .line 125
    const/high16 v17, 0x3fc00000    # 1.5f

    .line 126
    .line 127
    const/high16 v18, -0x3f800000    # -4.0f

    .line 128
    .line 129
    const v13, 0x3f547ae1    # 0.83f

    .line 130
    .line 131
    .line 132
    const/high16 v14, -0x40800000    # -1.0f

    .line 133
    .line 134
    const/high16 v15, 0x3fc00000    # 1.5f

    .line 135
    .line 136
    const v16, -0x3fea3d71    # -2.34f

    .line 137
    .line 138
    .line 139
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 140
    .line 141
    .line 142
    const v17, -0x425c28f6    # -0.08f

    .line 143
    .line 144
    .line 145
    const/high16 v18, -0x40800000    # -1.0f

    .line 146
    .line 147
    const/4 v13, 0x0

    .line 148
    const v14, -0x414ccccd    # -0.35f

    .line 149
    .line 150
    .line 151
    const v15, -0x430a3d71    # -0.03f

    .line 152
    .line 153
    .line 154
    const v16, -0x40cf5c29    # -0.69f

    .line 155
    .line 156
    .line 157
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 158
    .line 159
    .line 160
    const/high16 v0, 0x41500000    # 13.0f

    .line 161
    .line 162
    const/high16 v2, 0x41600000    # 14.0f

    .line 163
    .line 164
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 165
    .line 166
    .line 167
    const/high16 v17, 0x3f800000    # 1.0f

    .line 168
    .line 169
    const v13, 0x3f0ccccd    # 0.55f

    .line 170
    .line 171
    .line 172
    const/4 v14, 0x0

    .line 173
    const/high16 v15, 0x3f800000    # 1.0f

    .line 174
    .line 175
    const v16, -0x4119999a    # -0.45f

    .line 176
    .line 177
    .line 178
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 179
    .line 180
    .line 181
    const v0, -0x4119999a    # -0.45f

    .line 182
    .line 183
    .line 184
    const/high16 v2, -0x40800000    # -1.0f

    .line 185
    .line 186
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 187
    .line 188
    .line 189
    const v0, -0x3fb47ae1    # -3.18f

    .line 190
    .line 191
    .line 192
    const/4 v2, 0x0

    .line 193
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 194
    .line 195
    .line 196
    const/high16 v17, 0x41000000    # 8.0f

    .line 197
    .line 198
    const/high16 v18, 0x41000000    # 8.0f

    .line 199
    .line 200
    const/high16 v13, 0x41100000    # 9.0f

    .line 201
    .line 202
    const v14, 0x4126b852    # 10.42f

    .line 203
    .line 204
    .line 205
    const/high16 v15, 0x41000000    # 8.0f

    .line 206
    .line 207
    const v16, 0x4119999a    # 9.6f

    .line 208
    .line 209
    .line 210
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 211
    .line 212
    .line 213
    const/high16 v17, 0x40600000    # 3.5f

    .line 214
    .line 215
    const/high16 v18, -0x3fa00000    # -3.5f

    .line 216
    .line 217
    const/4 v13, 0x0

    .line 218
    const v14, -0x4008f5c3    # -1.93f

    .line 219
    .line 220
    .line 221
    const v15, 0x3fc8f5c3    # 1.57f

    .line 222
    .line 223
    .line 224
    const/high16 v16, -0x3fa00000    # -3.5f

    .line 225
    .line 226
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 227
    .line 228
    .line 229
    const v17, 0x4038f5c3    # 2.89f

    .line 230
    .line 231
    .line 232
    const v18, 0x3fc3d70a    # 1.53f

    .line 233
    .line 234
    .line 235
    const v13, 0x3f99999a    # 1.2f

    .line 236
    .line 237
    .line 238
    const/4 v14, 0x0

    .line 239
    const v15, 0x4010a3d7    # 2.26f

    .line 240
    .line 241
    .line 242
    const v16, 0x3f1c28f6    # 0.61f

    .line 243
    .line 244
    .line 245
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 246
    .line 247
    .line 248
    const v17, 0x3f9c28f6    # 1.22f

    .line 249
    .line 250
    .line 251
    const v18, 0x3ecccccd    # 0.4f

    .line 252
    .line 253
    .line 254
    const v13, 0x3e8a3d71    # 0.27f

    .line 255
    .line 256
    .line 257
    const v14, 0x3ecccccd    # 0.4f

    .line 258
    .line 259
    .line 260
    const v15, 0x3f451eb8    # 0.77f

    .line 261
    .line 262
    .line 263
    const v16, 0x3f170a3d    # 0.59f

    .line 264
    .line 265
    .line 266
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 267
    .line 268
    .line 269
    const v17, 0x3edc28f6    # 0.43f

    .line 270
    .line 271
    .line 272
    const v18, -0x403c28f6    # -1.53f

    .line 273
    .line 274
    .line 275
    const v13, 0x3f19999a    # 0.6f

    .line 276
    .line 277
    .line 278
    const/high16 v14, -0x41800000    # -0.25f

    .line 279
    .line 280
    const v15, 0x3f4ccccd    # 0.8f

    .line 281
    .line 282
    .line 283
    const v16, -0x40828f5c    # -0.99f

    .line 284
    .line 285
    .line 286
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 287
    .line 288
    .line 289
    const v17, -0x3f6eb852    # -4.54f

    .line 290
    .line 291
    .line 292
    const v18, -0x3fe66666    # -2.4f

    .line 293
    .line 294
    .line 295
    const v13, -0x40828f5c    # -0.99f

    .line 296
    .line 297
    .line 298
    const v14, -0x40466666    # -1.45f

    .line 299
    .line 300
    .line 301
    const v15, -0x3fd5c28f    # -2.66f

    .line 302
    .line 303
    .line 304
    const v16, -0x3fe66666    # -2.4f

    .line 305
    .line 306
    .line 307
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 308
    .line 309
    .line 310
    const/high16 v17, 0x40c00000    # 6.0f

    .line 311
    .line 312
    const/high16 v18, 0x41000000    # 8.0f

    .line 313
    .line 314
    const v13, 0x41075c29    # 8.46f

    .line 315
    .line 316
    .line 317
    const/high16 v14, 0x40200000    # 2.5f

    .line 318
    .line 319
    const/high16 v15, 0x40c00000    # 6.0f

    .line 320
    .line 321
    const v16, 0x409eb852    # 4.96f

    .line 322
    .line 323
    .line 324
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 325
    .line 326
    .line 327
    const v17, 0x3fbeb852    # 1.49f

    .line 328
    .line 329
    .line 330
    const/high16 v18, 0x40800000    # 4.0f

    .line 331
    .line 332
    const/4 v13, 0x0

    .line 333
    const v14, 0x3fe3d70a    # 1.78f

    .line 334
    .line 335
    .line 336
    const v15, 0x3f4a3d71    # 0.79f

    .line 337
    .line 338
    .line 339
    const v16, 0x4039999a    # 2.9f

    .line 340
    .line 341
    .line 342
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 343
    .line 344
    .line 345
    const/high16 v0, 0x40e00000    # 7.0f

    .line 346
    .line 347
    const/high16 v2, 0x41400000    # 12.0f

    .line 348
    .line 349
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 350
    .line 351
    .line 352
    const/high16 v17, -0x40800000    # -1.0f

    .line 353
    .line 354
    const/high16 v18, 0x3f800000    # 1.0f

    .line 355
    .line 356
    const v13, -0x40f33333    # -0.55f

    .line 357
    .line 358
    .line 359
    const/4 v14, 0x0

    .line 360
    const/high16 v15, -0x40800000    # -1.0f

    .line 361
    .line 362
    const v16, 0x3ee66666    # 0.45f

    .line 363
    .line 364
    .line 365
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 366
    .line 367
    .line 368
    const v0, 0x3ee66666    # 0.45f

    .line 369
    .line 370
    .line 371
    const/high16 v2, 0x3f800000    # 1.0f

    .line 372
    .line 373
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 374
    .line 375
    .line 376
    const v0, 0x3fbc28f6    # 1.47f

    .line 377
    .line 378
    .line 379
    const/4 v2, 0x0

    .line 380
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 381
    .line 382
    .line 383
    const v17, 0x3e051eb8    # 0.13f

    .line 384
    .line 385
    .line 386
    const v13, 0x3da3d70a    # 0.08f

    .line 387
    .line 388
    .line 389
    const v14, 0x3e9eb852    # 0.31f

    .line 390
    .line 391
    .line 392
    const v15, 0x3e051eb8    # 0.13f

    .line 393
    .line 394
    .line 395
    const v16, 0x3f23d70a    # 0.64f

    .line 396
    .line 397
    .line 398
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 399
    .line 400
    .line 401
    const v17, -0x3ffc28f6    # -2.06f

    .line 402
    .line 403
    .line 404
    const v18, 0x406a3d71    # 3.66f

    .line 405
    .line 406
    .line 407
    const/4 v13, 0x0

    .line 408
    const v14, 0x3ff33333    # 1.9f

    .line 409
    .line 410
    .line 411
    const v15, -0x405ae148    # -1.29f

    .line 412
    .line 413
    .line 414
    const v16, 0x40470a3d    # 3.11f

    .line 415
    .line 416
    .line 417
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 418
    .line 419
    .line 420
    const/high16 v17, 0x40c00000    # 6.0f

    .line 421
    .line 422
    const v18, 0x419dae14    # 19.71f

    .line 423
    .line 424
    .line 425
    const v13, 0x40c66666    # 6.2f

    .line 426
    .line 427
    .line 428
    const v14, 0x41973333    # 18.9f

    .line 429
    .line 430
    .line 431
    const/high16 v15, 0x40c00000    # 6.0f

    .line 432
    .line 433
    const v16, 0x419a51ec    # 19.29f

    .line 434
    .line 435
    .line 436
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 437
    .line 438
    .line 439
    const/4 v0, 0x0

    .line 440
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 441
    .line 442
    .line 443
    const v17, 0x40e947ae    # 7.29f

    .line 444
    .line 445
    .line 446
    const/high16 v18, 0x41a80000    # 21.0f

    .line 447
    .line 448
    const/high16 v13, 0x40c00000    # 6.0f

    .line 449
    .line 450
    const v14, 0x41a35c29    # 20.42f

    .line 451
    .line 452
    .line 453
    const v15, 0x40d28f5c    # 6.58f

    .line 454
    .line 455
    .line 456
    const/high16 v16, 0x41a80000    # 21.0f

    .line 457
    .line 458
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 459
    .line 460
    .line 461
    const/high16 v0, 0x41600000    # 14.0f

    .line 462
    .line 463
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 464
    .line 465
    .line 466
    const v17, 0x406851ec    # 3.63f

    .line 467
    .line 468
    .line 469
    const/high16 v18, -0x40000000    # -2.0f

    .line 470
    .line 471
    const v13, 0x3fc66666    # 1.55f

    .line 472
    .line 473
    .line 474
    const/4 v14, 0x0

    .line 475
    const v15, 0x403ccccd    # 2.95f

    .line 476
    .line 477
    .line 478
    const v16, -0x40bd70a4    # -0.76f

    .line 479
    .line 480
    .line 481
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 482
    .line 483
    .line 484
    const v17, 0x4189ae14    # 17.21f

    .line 485
    .line 486
    .line 487
    const v18, 0x418ce148    # 17.61f

    .line 488
    .line 489
    .line 490
    const v13, 0x418f47ae    # 17.91f

    .line 491
    .line 492
    .line 493
    const v14, 0x4193eb85    # 18.49f

    .line 494
    .line 495
    .line 496
    const v15, 0x418dc28f    # 17.72f

    .line 497
    .line 498
    .line 499
    const v16, 0x418ee148    # 17.86f

    .line 500
    .line 501
    .line 502
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 503
    .line 504
    .line 505
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 506
    .line 507
    .line 508
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 509
    .line 510
    .line 511
    move-result-object v2

    .line 512
    const/16 v16, 0x3800

    .line 513
    .line 514
    const/16 v17, 0x0

    .line 515
    .line 516
    const/high16 v6, 0x3f800000    # 1.0f

    .line 517
    .line 518
    const/high16 v8, 0x3f800000    # 1.0f

    .line 519
    .line 520
    const/4 v7, 0x0

    .line 521
    const/high16 v9, 0x3f800000    # 1.0f

    .line 522
    .line 523
    const/high16 v12, 0x3f800000    # 1.0f

    .line 524
    .line 525
    const/4 v13, 0x0

    .line 526
    const/4 v14, 0x0

    .line 527
    const/4 v15, 0x0

    .line 528
    const-string v4, ""

    .line 529
    .line 530
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 531
    .line 532
    .line 533
    move-result-object v0

    .line 534
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 535
    .line 536
    .line 537
    move-result-object v0

    .line 538
    sput-object v0, Landroidx/compose/material/icons/rounded/CurrencyPoundKt;->_currencyPound:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 539
    .line 540
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 541
    .line 542
    .line 543
    return-object v0
.end method
