.class public final Landroidx/compose/material/icons/twotone/PaidKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_paid",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "Paid",
        "Landroidx/compose/material/icons/Icons$TwoTone;",
        "getPaid",
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
        "SMAP\nPaid.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Paid.kt\nandroidx/compose/material/icons/twotone/PaidKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,103:1\n212#2,12:104\n233#2,18:117\n253#2:154\n233#2,18:155\n253#2:192\n233#2,18:193\n253#2:230\n174#3:116\n705#4,2:135\n717#4,2:137\n719#4,11:143\n705#4,2:173\n717#4,2:175\n719#4,11:181\n705#4,2:211\n717#4,2:213\n719#4,11:219\n72#5,4:139\n72#5,4:177\n72#5,4:215\n*S KotlinDebug\n*F\n+ 1 Paid.kt\nandroidx/compose/material/icons/twotone/PaidKt\n*L\n29#1:104,12\n30#1:117,18\n30#1:154\n60#1:155,18\n60#1:192\n84#1:193,18\n84#1:230\n29#1:116\n30#1:135,2\n30#1:137,2\n30#1:143,11\n60#1:173,2\n60#1:175,2\n60#1:181,11\n84#1:211,2\n84#1:213,2\n84#1:219,11\n30#1:139,4\n60#1:177,4\n84#1:215,4\n*E\n"
    }
.end annotation


# static fields
.field private static _paid:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getPaid(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/PaidKt;->_paid:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.Paid"

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
    const/high16 v4, 0x40800000    # 4.0f

    .line 71
    .line 72
    const/high16 v6, 0x41400000    # 12.0f

    .line 73
    .line 74
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v25, -0x3f000000    # -8.0f

    .line 78
    .line 79
    const/high16 v26, 0x41000000    # 8.0f

    .line 80
    .line 81
    const v21, -0x3f72e148    # -4.41f

    .line 82
    .line 83
    .line 84
    const/16 v22, 0x0

    .line 85
    .line 86
    const/high16 v23, -0x3f000000    # -8.0f

    .line 87
    .line 88
    const v24, 0x4065c28f    # 3.59f

    .line 89
    .line 90
    .line 91
    move-object/from16 v20, v2

    .line 92
    .line 93
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 94
    .line 95
    .line 96
    const/high16 v25, 0x41000000    # 8.0f

    .line 97
    .line 98
    const/16 v21, 0x0

    .line 99
    .line 100
    const v22, 0x408d1eb8    # 4.41f

    .line 101
    .line 102
    .line 103
    const v23, 0x4065c28f    # 3.59f

    .line 104
    .line 105
    .line 106
    const/high16 v24, 0x41000000    # 8.0f

    .line 107
    .line 108
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 109
    .line 110
    .line 111
    const v4, -0x3f9a3d71    # -3.59f

    .line 112
    .line 113
    .line 114
    const/high16 v6, -0x3f000000    # -8.0f

    .line 115
    .line 116
    const/high16 v7, 0x41000000    # 8.0f

    .line 117
    .line 118
    invoke-virtual {v2, v7, v4, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 119
    .line 120
    .line 121
    const/high16 v25, 0x41400000    # 12.0f

    .line 122
    .line 123
    const/high16 v26, 0x40800000    # 4.0f

    .line 124
    .line 125
    const/high16 v21, 0x41a00000    # 20.0f

    .line 126
    .line 127
    const v22, 0x40f2e148    # 7.59f

    .line 128
    .line 129
    .line 130
    const v23, 0x418347ae    # 16.41f

    .line 131
    .line 132
    .line 133
    const/high16 v24, 0x40800000    # 4.0f

    .line 134
    .line 135
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 136
    .line 137
    .line 138
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 139
    .line 140
    .line 141
    const v4, 0x414e147b    # 12.88f

    .line 142
    .line 143
    .line 144
    const v6, 0x418e147b    # 17.76f

    .line 145
    .line 146
    .line 147
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 148
    .line 149
    .line 150
    const/high16 v4, 0x41980000    # 19.0f

    .line 151
    .line 152
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 153
    .line 154
    .line 155
    const/high16 v4, -0x40200000    # -1.75f

    .line 156
    .line 157
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 158
    .line 159
    .line 160
    const v4, -0x405ae148    # -1.29f

    .line 161
    .line 162
    .line 163
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 164
    .line 165
    .line 166
    const v25, -0x3fbeb852    # -3.02f

    .line 167
    .line 168
    .line 169
    const v26, -0x3fc28f5c    # -2.96f

    .line 170
    .line 171
    .line 172
    const v21, -0x40c28f5c    # -0.74f

    .line 173
    .line 174
    .line 175
    const v22, -0x41c7ae14    # -0.18f

    .line 176
    .line 177
    .line 178
    const v23, -0x3fe70a3d    # -2.39f

    .line 179
    .line 180
    .line 181
    const v24, -0x40bae148    # -0.77f

    .line 182
    .line 183
    .line 184
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 185
    .line 186
    .line 187
    const v4, 0x3fd33333    # 1.65f

    .line 188
    .line 189
    .line 190
    const v6, -0x40d47ae1    # -0.67f

    .line 191
    .line 192
    .line 193
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 194
    .line 195
    .line 196
    const v25, 0x4019999a    # 2.4f

    .line 197
    .line 198
    .line 199
    const v26, 0x4005c28f    # 2.09f

    .line 200
    .line 201
    .line 202
    const v21, 0x3d75c28f    # 0.06f

    .line 203
    .line 204
    .line 205
    const v22, 0x3e6147ae    # 0.22f

    .line 206
    .line 207
    .line 208
    const v23, 0x3f147ae1    # 0.58f

    .line 209
    .line 210
    .line 211
    const v24, 0x4005c28f    # 2.09f

    .line 212
    .line 213
    .line 214
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 215
    .line 216
    .line 217
    const v25, 0x3ffd70a4    # 1.98f

    .line 218
    .line 219
    .line 220
    const v26, -0x4031eb85    # -1.61f

    .line 221
    .line 222
    .line 223
    const v21, 0x3f6e147b    # 0.93f

    .line 224
    .line 225
    .line 226
    const/16 v22, 0x0

    .line 227
    .line 228
    const v23, 0x3ffd70a4    # 1.98f

    .line 229
    .line 230
    .line 231
    const v24, -0x410a3d71    # -0.48f

    .line 232
    .line 233
    .line 234
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 235
    .line 236
    .line 237
    const v25, -0x3fee147b    # -2.28f

    .line 238
    .line 239
    .line 240
    const v26, -0x3ffe147b    # -2.03f

    .line 241
    .line 242
    .line 243
    const/16 v21, 0x0

    .line 244
    .line 245
    const v22, -0x408a3d71    # -0.96f

    .line 246
    .line 247
    .line 248
    const v23, -0x40cccccd    # -0.7f

    .line 249
    .line 250
    .line 251
    const v24, -0x40451eb8    # -1.46f

    .line 252
    .line 253
    .line 254
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 255
    .line 256
    .line 257
    const v25, -0x3fa9999a    # -3.35f

    .line 258
    .line 259
    .line 260
    const v26, -0x3fac28f6    # -3.31f

    .line 261
    .line 262
    .line 263
    const v21, -0x40733333    # -1.1f

    .line 264
    .line 265
    .line 266
    const v22, -0x413851ec    # -0.39f

    .line 267
    .line 268
    .line 269
    const v23, -0x3fa9999a    # -3.35f

    .line 270
    .line 271
    .line 272
    const v24, -0x407c28f6    # -1.03f

    .line 273
    .line 274
    .line 275
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 276
    .line 277
    .line 278
    const v25, 0x4027ae14    # 2.62f

    .line 279
    .line 280
    .line 281
    const v26, -0x3fc28f5c    # -2.96f

    .line 282
    .line 283
    .line 284
    const/16 v21, 0x0

    .line 285
    .line 286
    const v22, -0x42333333    # -0.1f

    .line 287
    .line 288
    .line 289
    const v23, 0x3c23d70a    # 0.01f

    .line 290
    .line 291
    .line 292
    const v24, -0x3fe66666    # -2.4f

    .line 293
    .line 294
    .line 295
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 296
    .line 297
    .line 298
    const/high16 v4, 0x40a00000    # 5.0f

    .line 299
    .line 300
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 301
    .line 302
    .line 303
    const/high16 v4, 0x3fe00000    # 1.75f

    .line 304
    .line 305
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 306
    .line 307
    .line 308
    const v4, 0x3f9eb852    # 1.24f

    .line 309
    .line 310
    .line 311
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 312
    .line 313
    .line 314
    const v25, 0x402a3d71    # 2.66f

    .line 315
    .line 316
    .line 317
    const v26, 0x400eb852    # 2.23f

    .line 318
    .line 319
    .line 320
    const v21, 0x3feb851f    # 1.84f

    .line 321
    .line 322
    .line 323
    const v22, 0x3ea3d70a    # 0.32f

    .line 324
    .line 325
    .line 326
    const v23, 0x4020a3d7    # 2.51f

    .line 327
    .line 328
    .line 329
    const v24, 0x3fe51eb8    # 1.79f

    .line 330
    .line 331
    .line 332
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 333
    .line 334
    .line 335
    const v4, -0x4035c28f    # -1.58f

    .line 336
    .line 337
    .line 338
    const v6, 0x3f2b851f    # 0.67f

    .line 339
    .line 340
    .line 341
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 342
    .line 343
    .line 344
    const v25, -0x400ccccd    # -1.9f

    .line 345
    .line 346
    .line 347
    const v26, -0x40547ae1    # -1.34f

    .line 348
    .line 349
    .line 350
    const v21, -0x421eb852    # -0.11f

    .line 351
    .line 352
    .line 353
    const v22, -0x414ccccd    # -0.35f

    .line 354
    .line 355
    .line 356
    const v23, -0x40e8f5c3    # -0.59f

    .line 357
    .line 358
    .line 359
    const v24, -0x40547ae1    # -1.34f

    .line 360
    .line 361
    .line 362
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 363
    .line 364
    .line 365
    const v25, -0x401851ec    # -1.81f

    .line 366
    .line 367
    .line 368
    const v26, 0x3fb1eb85    # 1.39f

    .line 369
    .line 370
    .line 371
    const v21, -0x40cccccd    # -0.7f

    .line 372
    .line 373
    .line 374
    const/16 v22, 0x0

    .line 375
    .line 376
    const v23, -0x401851ec    # -1.81f

    .line 377
    .line 378
    .line 379
    const v24, 0x3ebd70a4    # 0.37f

    .line 380
    .line 381
    .line 382
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 383
    .line 384
    .line 385
    const v25, 0x4028f5c3    # 2.64f

    .line 386
    .line 387
    .line 388
    const v26, 0x3ff33333    # 1.9f

    .line 389
    .line 390
    .line 391
    const/16 v21, 0x0

    .line 392
    .line 393
    const v22, 0x3f733333    # 0.95f

    .line 394
    .line 395
    .line 396
    const v23, 0x3f5c28f6    # 0.86f

    .line 397
    .line 398
    .line 399
    const v24, 0x3fa7ae14    # 1.31f

    .line 400
    .line 401
    .line 402
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 403
    .line 404
    .line 405
    const v25, 0x4040a3d7    # 3.01f

    .line 406
    .line 407
    .line 408
    const v26, 0x405ccccd    # 3.45f

    .line 409
    .line 410
    .line 411
    const v21, 0x4019999a    # 2.4f

    .line 412
    .line 413
    .line 414
    const v22, 0x3f547ae1    # 0.83f

    .line 415
    .line 416
    .line 417
    const v23, 0x4040a3d7    # 3.01f

    .line 418
    .line 419
    .line 420
    const v24, 0x40033333    # 2.05f

    .line 421
    .line 422
    .line 423
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 424
    .line 425
    .line 426
    const v25, 0x414e147b    # 12.88f

    .line 427
    .line 428
    .line 429
    const v26, 0x418e147b    # 17.76f

    .line 430
    .line 431
    .line 432
    const v21, 0x417e6666    # 15.9f

    .line 433
    .line 434
    .line 435
    const v22, 0x41895c29    # 17.17f

    .line 436
    .line 437
    .line 438
    const v23, 0x41566666    # 13.4f

    .line 439
    .line 440
    .line 441
    const v24, 0x418d5c29    # 17.67f

    .line 442
    .line 443
    .line 444
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 445
    .line 446
    .line 447
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 448
    .line 449
    .line 450
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 451
    .line 452
    .line 453
    move-result-object v2

    .line 454
    const/16 v16, 0x3800

    .line 455
    .line 456
    const/16 v17, 0x0

    .line 457
    .line 458
    const v6, 0x3e99999a    # 0.3f

    .line 459
    .line 460
    .line 461
    const v8, 0x3e99999a    # 0.3f

    .line 462
    .line 463
    .line 464
    const/4 v7, 0x0

    .line 465
    const/high16 v9, 0x3f800000    # 1.0f

    .line 466
    .line 467
    const/high16 v12, 0x3f800000    # 1.0f

    .line 468
    .line 469
    const/4 v13, 0x0

    .line 470
    const/4 v14, 0x0

    .line 471
    const/4 v15, 0x0

    .line 472
    const-string v4, ""

    .line 473
    .line 474
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 475
    .line 476
    .line 477
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 478
    .line 479
    .line 480
    move-result v3

    .line 481
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 482
    .line 483
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 484
    .line 485
    .line 486
    move-result-wide v6

    .line 487
    const/4 v2, 0x0

    .line 488
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 489
    .line 490
    .line 491
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 492
    .line 493
    .line 494
    move-result v10

    .line 495
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 496
    .line 497
    .line 498
    move-result v11

    .line 499
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 500
    .line 501
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 502
    .line 503
    .line 504
    const v4, 0x414e3d71    # 12.89f

    .line 505
    .line 506
    .line 507
    const v6, 0x4131999a    # 11.1f

    .line 508
    .line 509
    .line 510
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 511
    .line 512
    .line 513
    const v25, -0x3fd70a3d    # -2.64f

    .line 514
    .line 515
    .line 516
    const v26, -0x400ccccd    # -1.9f

    .line 517
    .line 518
    .line 519
    const v21, -0x401c28f6    # -1.78f

    .line 520
    .line 521
    .line 522
    const v22, -0x40e8f5c3    # -0.59f

    .line 523
    .line 524
    .line 525
    const v23, -0x3fd70a3d    # -2.64f

    .line 526
    .line 527
    .line 528
    const v24, -0x408a3d71    # -0.96f

    .line 529
    .line 530
    .line 531
    move-object/from16 v20, v2

    .line 532
    .line 533
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 534
    .line 535
    .line 536
    const v25, 0x3fe7ae14    # 1.81f

    .line 537
    .line 538
    .line 539
    const v26, -0x404e147b    # -1.39f

    .line 540
    .line 541
    .line 542
    const/16 v21, 0x0

    .line 543
    .line 544
    const v22, -0x407d70a4    # -1.02f

    .line 545
    .line 546
    .line 547
    const v23, 0x3f8e147b    # 1.11f

    .line 548
    .line 549
    .line 550
    const v24, -0x404e147b    # -1.39f

    .line 551
    .line 552
    .line 553
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 554
    .line 555
    .line 556
    const v25, 0x3ff33333    # 1.9f

    .line 557
    .line 558
    .line 559
    const v26, 0x3fab851f    # 1.34f

    .line 560
    .line 561
    .line 562
    const v21, 0x3fa7ae14    # 1.31f

    .line 563
    .line 564
    .line 565
    const/16 v22, 0x0

    .line 566
    .line 567
    const v23, 0x3fe51eb8    # 1.79f

    .line 568
    .line 569
    .line 570
    const v24, 0x3f7d70a4    # 0.99f

    .line 571
    .line 572
    .line 573
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 574
    .line 575
    .line 576
    const v4, 0x3fca3d71    # 1.58f

    .line 577
    .line 578
    .line 579
    const v6, -0x40d47ae1    # -0.67f

    .line 580
    .line 581
    .line 582
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 583
    .line 584
    .line 585
    const v25, -0x3fd5c28f    # -2.66f

    .line 586
    .line 587
    .line 588
    const v26, -0x3ff147ae    # -2.23f

    .line 589
    .line 590
    .line 591
    const v21, -0x41e66666    # -0.15f

    .line 592
    .line 593
    .line 594
    const v22, -0x411eb852    # -0.44f

    .line 595
    .line 596
    .line 597
    const v23, -0x40ae147b    # -0.82f

    .line 598
    .line 599
    .line 600
    const v24, -0x400b851f    # -1.91f

    .line 601
    .line 602
    .line 603
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 604
    .line 605
    .line 606
    const/high16 v4, 0x40a00000    # 5.0f

    .line 607
    .line 608
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 609
    .line 610
    .line 611
    const/high16 v4, -0x40200000    # -1.75f

    .line 612
    .line 613
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 614
    .line 615
    .line 616
    const v4, 0x3fa147ae    # 1.26f

    .line 617
    .line 618
    .line 619
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 620
    .line 621
    .line 622
    const v25, -0x3fd851ec    # -2.62f

    .line 623
    .line 624
    .line 625
    const v26, 0x403d70a4    # 2.96f

    .line 626
    .line 627
    .line 628
    const v21, -0x3fd9999a    # -2.6f

    .line 629
    .line 630
    .line 631
    const v22, 0x3f0f5c29    # 0.56f

    .line 632
    .line 633
    .line 634
    const v23, -0x3fd851ec    # -2.62f

    .line 635
    .line 636
    .line 637
    const v24, 0x40366666    # 2.85f

    .line 638
    .line 639
    .line 640
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 641
    .line 642
    .line 643
    const v25, 0x40566666    # 3.35f

    .line 644
    .line 645
    .line 646
    const v26, 0x4053d70a    # 3.31f

    .line 647
    .line 648
    .line 649
    const/16 v21, 0x0

    .line 650
    .line 651
    const v22, 0x401147ae    # 2.27f

    .line 652
    .line 653
    .line 654
    const/high16 v23, 0x40100000    # 2.25f

    .line 655
    .line 656
    const v24, 0x403a3d71    # 2.91f

    .line 657
    .line 658
    .line 659
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 660
    .line 661
    .line 662
    const v25, 0x4011eb85    # 2.28f

    .line 663
    .line 664
    .line 665
    const v26, 0x4001eb85    # 2.03f

    .line 666
    .line 667
    .line 668
    const v21, 0x3fca3d71    # 1.58f

    .line 669
    .line 670
    .line 671
    const v22, 0x3f0f5c29    # 0.56f

    .line 672
    .line 673
    .line 674
    const v23, 0x4011eb85    # 2.28f

    .line 675
    .line 676
    .line 677
    const v24, 0x3f88f5c3    # 1.07f

    .line 678
    .line 679
    .line 680
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 681
    .line 682
    .line 683
    const v25, -0x40028f5c    # -1.98f

    .line 684
    .line 685
    .line 686
    const v26, 0x3fce147b    # 1.61f

    .line 687
    .line 688
    .line 689
    const/16 v21, 0x0

    .line 690
    .line 691
    const v22, 0x3f90a3d7    # 1.13f

    .line 692
    .line 693
    .line 694
    const v23, -0x4079999a    # -1.05f

    .line 695
    .line 696
    .line 697
    const v24, 0x3fce147b    # 1.61f

    .line 698
    .line 699
    .line 700
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 701
    .line 702
    .line 703
    const v25, -0x3fe66666    # -2.4f

    .line 704
    .line 705
    .line 706
    const v26, -0x3ffa3d71    # -2.09f

    .line 707
    .line 708
    .line 709
    const v21, -0x40170a3d    # -1.82f

    .line 710
    .line 711
    .line 712
    const/16 v22, 0x0

    .line 713
    .line 714
    const v23, -0x3fea3d71    # -2.34f

    .line 715
    .line 716
    .line 717
    const v24, -0x4010a3d7    # -1.87f

    .line 718
    .line 719
    .line 720
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 721
    .line 722
    .line 723
    const v4, 0x4101999a    # 8.1f

    .line 724
    .line 725
    .line 726
    const/high16 v6, 0x416c0000    # 14.75f

    .line 727
    .line 728
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 729
    .line 730
    .line 731
    const v25, 0x404147ae    # 3.02f

    .line 732
    .line 733
    .line 734
    const v26, 0x403d70a4    # 2.96f

    .line 735
    .line 736
    .line 737
    const v21, 0x3f2147ae    # 0.63f

    .line 738
    .line 739
    .line 740
    const v22, 0x400c28f6    # 2.19f

    .line 741
    .line 742
    .line 743
    const v23, 0x4011eb85    # 2.28f

    .line 744
    .line 745
    .line 746
    const v24, 0x4031eb85    # 2.78f

    .line 747
    .line 748
    .line 749
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 750
    .line 751
    .line 752
    const/high16 v4, 0x41980000    # 19.0f

    .line 753
    .line 754
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 755
    .line 756
    .line 757
    const/high16 v4, 0x3fe00000    # 1.75f

    .line 758
    .line 759
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 760
    .line 761
    .line 762
    const v4, -0x406147ae    # -1.24f

    .line 763
    .line 764
    .line 765
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 766
    .line 767
    .line 768
    const v26, -0x3fb1eb85    # -3.22f

    .line 769
    .line 770
    .line 771
    const v21, 0x3f051eb8    # 0.52f

    .line 772
    .line 773
    .line 774
    const v22, -0x4247ae14    # -0.09f

    .line 775
    .line 776
    .line 777
    const v23, 0x404147ae    # 3.02f

    .line 778
    .line 779
    .line 780
    const v24, -0x40e8f5c3    # -0.59f

    .line 781
    .line 782
    .line 783
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 784
    .line 785
    .line 786
    const v25, 0x414e3d71    # 12.89f

    .line 787
    .line 788
    .line 789
    const v26, 0x4131999a    # 11.1f

    .line 790
    .line 791
    .line 792
    const v21, 0x417e6666    # 15.9f

    .line 793
    .line 794
    .line 795
    const v22, 0x41526666    # 13.15f

    .line 796
    .line 797
    .line 798
    const v23, 0x4174a3d7    # 15.29f

    .line 799
    .line 800
    .line 801
    const v24, 0x413ee148    # 11.93f

    .line 802
    .line 803
    .line 804
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 805
    .line 806
    .line 807
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 808
    .line 809
    .line 810
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 811
    .line 812
    .line 813
    move-result-object v2

    .line 814
    const/high16 v6, 0x3f800000    # 1.0f

    .line 815
    .line 816
    const/high16 v8, 0x3f800000    # 1.0f

    .line 817
    .line 818
    const/4 v7, 0x0

    .line 819
    const-string v4, ""

    .line 820
    .line 821
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 822
    .line 823
    .line 824
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 825
    .line 826
    .line 827
    move-result v3

    .line 828
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 829
    .line 830
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 831
    .line 832
    .line 833
    move-result-wide v6

    .line 834
    const/4 v0, 0x0

    .line 835
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 836
    .line 837
    .line 838
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 839
    .line 840
    .line 841
    move-result v10

    .line 842
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 843
    .line 844
    .line 845
    move-result v11

    .line 846
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 847
    .line 848
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 849
    .line 850
    .line 851
    const/high16 v0, 0x40000000    # 2.0f

    .line 852
    .line 853
    const/high16 v2, 0x41400000    # 12.0f

    .line 854
    .line 855
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 856
    .line 857
    .line 858
    const/high16 v17, 0x40000000    # 2.0f

    .line 859
    .line 860
    const/high16 v18, 0x41400000    # 12.0f

    .line 861
    .line 862
    const v13, 0x40cf5c29    # 6.48f

    .line 863
    .line 864
    .line 865
    const/high16 v14, 0x40000000    # 2.0f

    .line 866
    .line 867
    const/high16 v15, 0x40000000    # 2.0f

    .line 868
    .line 869
    const v16, 0x40cf5c29    # 6.48f

    .line 870
    .line 871
    .line 872
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 873
    .line 874
    .line 875
    const v0, 0x408f5c29    # 4.48f

    .line 876
    .line 877
    .line 878
    const/high16 v2, 0x41200000    # 10.0f

    .line 879
    .line 880
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 881
    .line 882
    .line 883
    const v0, -0x3f70a3d7    # -4.48f

    .line 884
    .line 885
    .line 886
    const/high16 v2, -0x3ee00000    # -10.0f

    .line 887
    .line 888
    const/high16 v4, 0x41200000    # 10.0f

    .line 889
    .line 890
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 891
    .line 892
    .line 893
    const v0, 0x418c28f6    # 17.52f

    .line 894
    .line 895
    .line 896
    const/high16 v2, 0x40000000    # 2.0f

    .line 897
    .line 898
    const/high16 v4, 0x41400000    # 12.0f

    .line 899
    .line 900
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 901
    .line 902
    .line 903
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 904
    .line 905
    .line 906
    const/high16 v0, 0x41a00000    # 20.0f

    .line 907
    .line 908
    const/high16 v2, 0x41400000    # 12.0f

    .line 909
    .line 910
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 911
    .line 912
    .line 913
    const/high16 v17, -0x3f000000    # -8.0f

    .line 914
    .line 915
    const/high16 v18, -0x3f000000    # -8.0f

    .line 916
    .line 917
    const v13, -0x3f72e148    # -4.41f

    .line 918
    .line 919
    .line 920
    const/4 v14, 0x0

    .line 921
    const/high16 v15, -0x3f000000    # -8.0f

    .line 922
    .line 923
    const v16, -0x3f9a3d71    # -3.59f

    .line 924
    .line 925
    .line 926
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 927
    .line 928
    .line 929
    const/high16 v17, 0x41000000    # 8.0f

    .line 930
    .line 931
    const/4 v13, 0x0

    .line 932
    const v14, -0x3f72e148    # -4.41f

    .line 933
    .line 934
    .line 935
    const v15, 0x4065c28f    # 3.59f

    .line 936
    .line 937
    .line 938
    const/high16 v16, -0x3f000000    # -8.0f

    .line 939
    .line 940
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 941
    .line 942
    .line 943
    const v0, 0x4065c28f    # 3.59f

    .line 944
    .line 945
    .line 946
    const/high16 v2, 0x41000000    # 8.0f

    .line 947
    .line 948
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 949
    .line 950
    .line 951
    const/high16 v17, 0x41400000    # 12.0f

    .line 952
    .line 953
    const/high16 v18, 0x41a00000    # 20.0f

    .line 954
    .line 955
    const/high16 v13, 0x41a00000    # 20.0f

    .line 956
    .line 957
    const v14, 0x418347ae    # 16.41f

    .line 958
    .line 959
    .line 960
    const v15, 0x418347ae    # 16.41f

    .line 961
    .line 962
    .line 963
    const/high16 v16, 0x41a00000    # 20.0f

    .line 964
    .line 965
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 966
    .line 967
    .line 968
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 969
    .line 970
    .line 971
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 972
    .line 973
    .line 974
    move-result-object v2

    .line 975
    const/16 v16, 0x3800

    .line 976
    .line 977
    const/16 v17, 0x0

    .line 978
    .line 979
    const/high16 v6, 0x3f800000    # 1.0f

    .line 980
    .line 981
    const/4 v7, 0x0

    .line 982
    const/high16 v12, 0x3f800000    # 1.0f

    .line 983
    .line 984
    const/4 v13, 0x0

    .line 985
    const/4 v14, 0x0

    .line 986
    const/4 v15, 0x0

    .line 987
    const-string v4, ""

    .line 988
    .line 989
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 990
    .line 991
    .line 992
    move-result-object v0

    .line 993
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 994
    .line 995
    .line 996
    move-result-object v0

    .line 997
    sput-object v0, Landroidx/compose/material/icons/twotone/PaidKt;->_paid:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 998
    .line 999
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 1000
    .line 1001
    .line 1002
    return-object v0
.end method
