.class public final Landroidx/compose/material/icons/twotone/WifiTetheringErrorRoundedKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_wifiTetheringErrorRounded",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "WifiTetheringErrorRounded",
        "Landroidx/compose/material/icons/Icons$TwoTone;",
        "getWifiTetheringErrorRounded",
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
        "SMAP\nWifiTetheringErrorRounded.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WifiTetheringErrorRounded.kt\nandroidx/compose/material/icons/twotone/WifiTetheringErrorRoundedKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,79:1\n212#2,12:80\n233#2,18:93\n253#2:130\n174#3:92\n705#4,2:111\n717#4,2:113\n719#4,11:119\n72#5,4:115\n*S KotlinDebug\n*F\n+ 1 WifiTetheringErrorRounded.kt\nandroidx/compose/material/icons/twotone/WifiTetheringErrorRoundedKt\n*L\n29#1:80,12\n30#1:93,18\n30#1:130\n29#1:92\n30#1:111,2\n30#1:113,2\n30#1:119,11\n30#1:115,4\n*E\n"
    }
.end annotation


# static fields
.field private static _wifiTetheringErrorRounded:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getWifiTetheringErrorRounded(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/WifiTetheringErrorRoundedKt;->_wifiTetheringErrorRounded:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.WifiTetheringErrorRounded"

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
    const/high16 v0, 0x40e00000    # 7.0f

    .line 71
    .line 72
    const/high16 v2, 0x41400000    # 12.0f

    .line 73
    .line 74
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v17, -0x3f400000    # -6.0f

    .line 78
    .line 79
    const/high16 v18, 0x40c00000    # 6.0f

    .line 80
    .line 81
    const v13, -0x3fac28f6    # -3.31f

    .line 82
    .line 83
    .line 84
    const/4 v14, 0x0

    .line 85
    const/high16 v15, -0x3f400000    # -6.0f

    .line 86
    .line 87
    const v16, 0x402c28f6    # 2.69f

    .line 88
    .line 89
    .line 90
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 91
    .line 92
    .line 93
    const v17, 0x3fe147ae    # 1.76f

    .line 94
    .line 95
    .line 96
    const v18, 0x4087ae14    # 4.24f

    .line 97
    .line 98
    .line 99
    const/4 v13, 0x0

    .line 100
    const v14, 0x3fd47ae1    # 1.66f

    .line 101
    .line 102
    .line 103
    const v15, 0x3f2e147b    # 0.68f

    .line 104
    .line 105
    .line 106
    const v16, 0x4049999a    # 3.15f

    .line 107
    .line 108
    .line 109
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 110
    .line 111
    .line 112
    const v0, -0x404a3d71    # -1.42f

    .line 113
    .line 114
    .line 115
    const v2, 0x3fb5c28f    # 1.42f

    .line 116
    .line 117
    .line 118
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 119
    .line 120
    .line 121
    const/high16 v17, 0x41000000    # 8.0f

    .line 122
    .line 123
    const/high16 v18, 0x41500000    # 13.0f

    .line 124
    .line 125
    const v13, 0x41073333    # 8.45f

    .line 126
    .line 127
    .line 128
    const v14, 0x4171999a    # 15.1f

    .line 129
    .line 130
    .line 131
    const/high16 v15, 0x41000000    # 8.0f

    .line 132
    .line 133
    const v16, 0x4161c28f    # 14.11f

    .line 134
    .line 135
    .line 136
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 137
    .line 138
    .line 139
    const/high16 v17, 0x40800000    # 4.0f

    .line 140
    .line 141
    const/high16 v18, -0x3f800000    # -4.0f

    .line 142
    .line 143
    const/4 v13, 0x0

    .line 144
    const v14, -0x3ff28f5c    # -2.21f

    .line 145
    .line 146
    .line 147
    const v15, 0x3fe51eb8    # 1.79f

    .line 148
    .line 149
    .line 150
    const/high16 v16, -0x3f800000    # -4.0f

    .line 151
    .line 152
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 153
    .line 154
    .line 155
    const v0, 0x3fe51eb8    # 1.79f

    .line 156
    .line 157
    .line 158
    const/high16 v2, 0x40800000    # 4.0f

    .line 159
    .line 160
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 161
    .line 162
    .line 163
    const v17, -0x4068f5c3    # -1.18f

    .line 164
    .line 165
    .line 166
    const v18, 0x40347ae1    # 2.82f

    .line 167
    .line 168
    .line 169
    const v14, 0x3f8e147b    # 1.11f

    .line 170
    .line 171
    .line 172
    const v15, -0x4119999a    # -0.45f

    .line 173
    .line 174
    .line 175
    const v16, 0x40066666    # 2.1f

    .line 176
    .line 177
    .line 178
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 179
    .line 180
    .line 181
    const v0, 0x3fb5c28f    # 1.42f

    .line 182
    .line 183
    .line 184
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 185
    .line 186
    .line 187
    const/high16 v17, 0x41900000    # 18.0f

    .line 188
    .line 189
    const/high16 v18, 0x41500000    # 13.0f

    .line 190
    .line 191
    const v13, 0x418a8f5c    # 17.32f

    .line 192
    .line 193
    .line 194
    const v14, 0x41813333    # 16.15f

    .line 195
    .line 196
    .line 197
    const/high16 v15, 0x41900000    # 18.0f

    .line 198
    .line 199
    const v16, 0x416a8f5c    # 14.66f

    .line 200
    .line 201
    .line 202
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 203
    .line 204
    .line 205
    const/high16 v17, 0x41400000    # 12.0f

    .line 206
    .line 207
    const/high16 v18, 0x40e00000    # 7.0f

    .line 208
    .line 209
    const/high16 v13, 0x41900000    # 18.0f

    .line 210
    .line 211
    const v14, 0x411b0a3d    # 9.69f

    .line 212
    .line 213
    .line 214
    const v15, 0x4174f5c3    # 15.31f

    .line 215
    .line 216
    .line 217
    const/high16 v16, 0x40e00000    # 7.0f

    .line 218
    .line 219
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 220
    .line 221
    .line 222
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 223
    .line 224
    .line 225
    const/high16 v0, 0x40400000    # 3.0f

    .line 226
    .line 227
    const/high16 v2, 0x41400000    # 12.0f

    .line 228
    .line 229
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 230
    .line 231
    .line 232
    const/high16 v17, 0x40000000    # 2.0f

    .line 233
    .line 234
    const/high16 v18, 0x41500000    # 13.0f

    .line 235
    .line 236
    const v13, 0x40cf5c29    # 6.48f

    .line 237
    .line 238
    .line 239
    const/high16 v14, 0x40400000    # 3.0f

    .line 240
    .line 241
    const/high16 v15, 0x40000000    # 2.0f

    .line 242
    .line 243
    const v16, 0x40ef5c29    # 7.48f

    .line 244
    .line 245
    .line 246
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 247
    .line 248
    .line 249
    const v17, 0x403b851f    # 2.93f

    .line 250
    .line 251
    .line 252
    const v18, 0x40e23d71    # 7.07f

    .line 253
    .line 254
    .line 255
    const/4 v13, 0x0

    .line 256
    const v14, 0x4030a3d7    # 2.76f

    .line 257
    .line 258
    .line 259
    const v15, 0x3f8f5c29    # 1.12f

    .line 260
    .line 261
    .line 262
    const v16, 0x40a851ec    # 5.26f

    .line 263
    .line 264
    .line 265
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 266
    .line 267
    .line 268
    const v0, -0x404a3d71    # -1.42f

    .line 269
    .line 270
    .line 271
    const v2, 0x3fb5c28f    # 1.42f

    .line 272
    .line 273
    .line 274
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 275
    .line 276
    .line 277
    const/high16 v17, 0x40800000    # 4.0f

    .line 278
    .line 279
    const/high16 v18, 0x41500000    # 13.0f

    .line 280
    .line 281
    const v13, 0x409ccccd    # 4.9f

    .line 282
    .line 283
    .line 284
    const v14, 0x4189ae14    # 17.21f

    .line 285
    .line 286
    .line 287
    const/high16 v15, 0x40800000    # 4.0f

    .line 288
    .line 289
    const v16, 0x41735c29    # 15.21f

    .line 290
    .line 291
    .line 292
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 293
    .line 294
    .line 295
    const/high16 v17, 0x41000000    # 8.0f

    .line 296
    .line 297
    const/high16 v18, -0x3f000000    # -8.0f

    .line 298
    .line 299
    const/4 v13, 0x0

    .line 300
    const v14, -0x3f728f5c    # -4.42f

    .line 301
    .line 302
    .line 303
    const v15, 0x40651eb8    # 3.58f

    .line 304
    .line 305
    .line 306
    const/high16 v16, -0x3f000000    # -8.0f

    .line 307
    .line 308
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 309
    .line 310
    .line 311
    const v17, 0x40c7ae14    # 6.24f

    .line 312
    .line 313
    .line 314
    const/high16 v18, 0x40400000    # 3.0f

    .line 315
    .line 316
    const v13, 0x4021eb85    # 2.53f

    .line 317
    .line 318
    .line 319
    const/4 v14, 0x0

    .line 320
    const v15, 0x4098f5c3    # 4.78f

    .line 321
    .line 322
    .line 323
    const v16, 0x3f95c28f    # 1.17f

    .line 324
    .line 325
    .line 326
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 327
    .line 328
    .line 329
    const v0, 0x401ae148    # 2.42f

    .line 330
    .line 331
    .line 332
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 333
    .line 334
    .line 335
    const/high16 v17, 0x41400000    # 12.0f

    .line 336
    .line 337
    const v13, 0x419770a4    # 18.93f

    .line 338
    .line 339
    .line 340
    const v14, 0x40a051ec    # 5.01f

    .line 341
    .line 342
    .line 343
    const v15, 0x417b3333    # 15.7f

    .line 344
    .line 345
    .line 346
    const/high16 v16, 0x40400000    # 3.0f

    .line 347
    .line 348
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 349
    .line 350
    .line 351
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 352
    .line 353
    .line 354
    const/high16 v0, 0x41300000    # 11.0f

    .line 355
    .line 356
    const/high16 v2, 0x41400000    # 12.0f

    .line 357
    .line 358
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 359
    .line 360
    .line 361
    const/high16 v17, -0x40000000    # -2.0f

    .line 362
    .line 363
    const/high16 v18, 0x40000000    # 2.0f

    .line 364
    .line 365
    const v13, -0x40733333    # -1.1f

    .line 366
    .line 367
    .line 368
    const/4 v14, 0x0

    .line 369
    const/high16 v15, -0x40000000    # -2.0f

    .line 370
    .line 371
    const v16, 0x3f666666    # 0.9f

    .line 372
    .line 373
    .line 374
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 375
    .line 376
    .line 377
    const v17, 0x3f170a3d    # 0.59f

    .line 378
    .line 379
    .line 380
    const v18, 0x3fb47ae1    # 1.41f

    .line 381
    .line 382
    .line 383
    const/4 v13, 0x0

    .line 384
    const v14, 0x3f0ccccd    # 0.55f

    .line 385
    .line 386
    .line 387
    const v15, 0x3e6b851f    # 0.23f

    .line 388
    .line 389
    .line 390
    const v16, 0x3f866666    # 1.05f

    .line 391
    .line 392
    .line 393
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 394
    .line 395
    .line 396
    const/high16 v17, 0x41400000    # 12.0f

    .line 397
    .line 398
    const/high16 v18, 0x41700000    # 15.0f

    .line 399
    .line 400
    const v13, 0x412f3333    # 10.95f

    .line 401
    .line 402
    .line 403
    const v14, 0x416c51ec    # 14.77f

    .line 404
    .line 405
    .line 406
    const v15, 0x41373333    # 11.45f

    .line 407
    .line 408
    .line 409
    const/high16 v16, 0x41700000    # 15.0f

    .line 410
    .line 411
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 412
    .line 413
    .line 414
    const v0, 0x3fb47ae1    # 1.41f

    .line 415
    .line 416
    .line 417
    const v2, -0x40e8f5c3    # -0.59f

    .line 418
    .line 419
    .line 420
    const v4, 0x3f866666    # 1.05f

    .line 421
    .line 422
    .line 423
    const v6, -0x41947ae1    # -0.23f

    .line 424
    .line 425
    .line 426
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 427
    .line 428
    .line 429
    const/high16 v17, 0x41600000    # 14.0f

    .line 430
    .line 431
    const/high16 v18, 0x41500000    # 13.0f

    .line 432
    .line 433
    const v13, 0x415c51ec    # 13.77f

    .line 434
    .line 435
    .line 436
    const v14, 0x4160cccd    # 14.05f

    .line 437
    .line 438
    .line 439
    const/high16 v15, 0x41600000    # 14.0f

    .line 440
    .line 441
    const v16, 0x4158cccd    # 13.55f

    .line 442
    .line 443
    .line 444
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 445
    .line 446
    .line 447
    const/high16 v17, 0x41400000    # 12.0f

    .line 448
    .line 449
    const/high16 v18, 0x41300000    # 11.0f

    .line 450
    .line 451
    const/high16 v13, 0x41600000    # 14.0f

    .line 452
    .line 453
    const v14, 0x413e6666    # 11.9f

    .line 454
    .line 455
    .line 456
    const v15, 0x4151999a    # 13.1f

    .line 457
    .line 458
    .line 459
    const/high16 v16, 0x41300000    # 11.0f

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
    const/high16 v0, 0x41200000    # 10.0f

    .line 468
    .line 469
    const/high16 v2, 0x41a00000    # 20.0f

    .line 470
    .line 471
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 472
    .line 473
    .line 474
    const/high16 v0, 0x40000000    # 2.0f

    .line 475
    .line 476
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 477
    .line 478
    .line 479
    const/high16 v0, 0x40c00000    # 6.0f

    .line 480
    .line 481
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 482
    .line 483
    .line 484
    const/high16 v0, -0x40000000    # -2.0f

    .line 485
    .line 486
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 487
    .line 488
    .line 489
    const/high16 v0, 0x41200000    # 10.0f

    .line 490
    .line 491
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 492
    .line 493
    .line 494
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 495
    .line 496
    .line 497
    const/high16 v0, 0x41900000    # 18.0f

    .line 498
    .line 499
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 500
    .line 501
    .line 502
    const/high16 v0, 0x40000000    # 2.0f

    .line 503
    .line 504
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 505
    .line 506
    .line 507
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 508
    .line 509
    .line 510
    const/high16 v0, -0x40000000    # -2.0f

    .line 511
    .line 512
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 513
    .line 514
    .line 515
    const/high16 v0, 0x41900000    # 18.0f

    .line 516
    .line 517
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 518
    .line 519
    .line 520
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 521
    .line 522
    .line 523
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 524
    .line 525
    .line 526
    move-result-object v2

    .line 527
    const/16 v16, 0x3800

    .line 528
    .line 529
    const/16 v17, 0x0

    .line 530
    .line 531
    const/high16 v6, 0x3f800000    # 1.0f

    .line 532
    .line 533
    const/high16 v8, 0x3f800000    # 1.0f

    .line 534
    .line 535
    const/4 v7, 0x0

    .line 536
    const/high16 v9, 0x3f800000    # 1.0f

    .line 537
    .line 538
    const/high16 v12, 0x3f800000    # 1.0f

    .line 539
    .line 540
    const/4 v13, 0x0

    .line 541
    const/4 v14, 0x0

    .line 542
    const/4 v15, 0x0

    .line 543
    const-string v4, ""

    .line 544
    .line 545
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 546
    .line 547
    .line 548
    move-result-object v0

    .line 549
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 550
    .line 551
    .line 552
    move-result-object v0

    .line 553
    sput-object v0, Landroidx/compose/material/icons/twotone/WifiTetheringErrorRoundedKt;->_wifiTetheringErrorRounded:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 554
    .line 555
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 556
    .line 557
    .line 558
    return-object v0
.end method
