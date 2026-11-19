.class public final Landroidx/compose/material/icons/filled/WifiTetheringOffKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_wifiTetheringOff",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "WifiTetheringOff",
        "Landroidx/compose/material/icons/Icons$Filled;",
        "getWifiTetheringOff",
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
        "SMAP\nWifiTetheringOff.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WifiTetheringOff.kt\nandroidx/compose/material/icons/filled/WifiTetheringOffKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,80:1\n212#2,12:81\n233#2,18:94\n253#2:131\n174#3:93\n705#4,2:112\n717#4,2:114\n719#4,11:120\n72#5,4:116\n*S KotlinDebug\n*F\n+ 1 WifiTetheringOff.kt\nandroidx/compose/material/icons/filled/WifiTetheringOffKt\n*L\n29#1:81,12\n30#1:94,18\n30#1:131\n29#1:93\n30#1:112,2\n30#1:114,2\n30#1:120,11\n30#1:116,4\n*E\n"
    }
.end annotation


# static fields
.field private static _wifiTetheringOff:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getWifiTetheringOff(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/filled/WifiTetheringOffKt;->_wifiTetheringOff:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Filled.WifiTetheringOff"

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
    const v0, 0x4033d70a    # 2.81f

    .line 71
    .line 72
    .line 73
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 74
    .line 75
    .line 76
    const v0, 0x3fb1eb85    # 1.39f

    .line 77
    .line 78
    .line 79
    const v2, 0x40870a3d    # 4.22f

    .line 80
    .line 81
    .line 82
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 83
    .line 84
    .line 85
    const v0, 0x402c28f6    # 2.69f

    .line 86
    .line 87
    .line 88
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 89
    .line 90
    .line 91
    const/high16 v17, 0x40000000    # 2.0f

    .line 92
    .line 93
    const/high16 v18, 0x41500000    # 13.0f

    .line 94
    .line 95
    const v13, 0x4031eb85    # 2.78f

    .line 96
    .line 97
    .line 98
    const v14, 0x4109999a    # 8.6f

    .line 99
    .line 100
    .line 101
    const/high16 v15, 0x40000000    # 2.0f

    .line 102
    .line 103
    const v16, 0x412b5c29    # 10.71f

    .line 104
    .line 105
    .line 106
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 107
    .line 108
    .line 109
    const v17, 0x403b851f    # 2.93f

    .line 110
    .line 111
    .line 112
    const v18, 0x40e23d71    # 7.07f

    .line 113
    .line 114
    .line 115
    const/4 v13, 0x0

    .line 116
    const v14, 0x4030a3d7    # 2.76f

    .line 117
    .line 118
    .line 119
    const v15, 0x3f8f5c29    # 1.12f

    .line 120
    .line 121
    .line 122
    const v16, 0x40a851ec    # 5.26f

    .line 123
    .line 124
    .line 125
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 126
    .line 127
    .line 128
    const v0, -0x404a3d71    # -1.42f

    .line 129
    .line 130
    .line 131
    const v2, 0x3fb5c28f    # 1.42f

    .line 132
    .line 133
    .line 134
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 135
    .line 136
    .line 137
    const/high16 v17, 0x40800000    # 4.0f

    .line 138
    .line 139
    const/high16 v18, 0x41500000    # 13.0f

    .line 140
    .line 141
    const v13, 0x409ccccd    # 4.9f

    .line 142
    .line 143
    .line 144
    const v14, 0x4189ae14    # 17.21f

    .line 145
    .line 146
    .line 147
    const/high16 v15, 0x40800000    # 4.0f

    .line 148
    .line 149
    const v16, 0x41735c29    # 15.21f

    .line 150
    .line 151
    .line 152
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 153
    .line 154
    .line 155
    const v17, 0x3fc147ae    # 1.51f

    .line 156
    .line 157
    .line 158
    const v18, -0x3f6ae148    # -4.66f

    .line 159
    .line 160
    .line 161
    const/4 v13, 0x0

    .line 162
    const/high16 v14, -0x40200000    # -1.75f

    .line 163
    .line 164
    const v15, 0x3f11eb85    # 0.57f

    .line 165
    .line 166
    .line 167
    const v16, -0x3fa9999a    # -3.35f

    .line 168
    .line 169
    .line 170
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 171
    .line 172
    .line 173
    const v0, 0x3fb70a3d    # 1.43f

    .line 174
    .line 175
    .line 176
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 177
    .line 178
    .line 179
    const/high16 v17, 0x40c00000    # 6.0f

    .line 180
    .line 181
    const/high16 v18, 0x41500000    # 13.0f

    .line 182
    .line 183
    const v13, 0x40cb3333    # 6.35f

    .line 184
    .line 185
    .line 186
    const v14, 0x412b3333    # 10.7f

    .line 187
    .line 188
    .line 189
    const/high16 v15, 0x40c00000    # 6.0f

    .line 190
    .line 191
    const v16, 0x413cf5c3    # 11.81f

    .line 192
    .line 193
    .line 194
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 195
    .line 196
    .line 197
    const v17, 0x3fe147ae    # 1.76f

    .line 198
    .line 199
    .line 200
    const v18, 0x4087ae14    # 4.24f

    .line 201
    .line 202
    .line 203
    const/4 v13, 0x0

    .line 204
    const v14, 0x3fd47ae1    # 1.66f

    .line 205
    .line 206
    .line 207
    const v15, 0x3f2e147b    # 0.68f

    .line 208
    .line 209
    .line 210
    const v16, 0x4049999a    # 3.15f

    .line 211
    .line 212
    .line 213
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 214
    .line 215
    .line 216
    const v0, -0x404a3d71    # -1.42f

    .line 217
    .line 218
    .line 219
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 220
    .line 221
    .line 222
    const/high16 v17, 0x41000000    # 8.0f

    .line 223
    .line 224
    const/high16 v18, 0x41500000    # 13.0f

    .line 225
    .line 226
    const v13, 0x41073333    # 8.45f

    .line 227
    .line 228
    .line 229
    const v14, 0x4171999a    # 15.1f

    .line 230
    .line 231
    .line 232
    const/high16 v15, 0x41000000    # 8.0f

    .line 233
    .line 234
    const v16, 0x4161c28f    # 14.11f

    .line 235
    .line 236
    .line 237
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 238
    .line 239
    .line 240
    const v17, 0x3ed1eb85    # 0.41f

    .line 241
    .line 242
    .line 243
    const v18, -0x401eb852    # -1.76f

    .line 244
    .line 245
    .line 246
    const/4 v13, 0x0

    .line 247
    const v14, -0x40deb852    # -0.63f

    .line 248
    .line 249
    .line 250
    const v15, 0x3e19999a    # 0.15f

    .line 251
    .line 252
    .line 253
    const v16, -0x40628f5c    # -1.23f

    .line 254
    .line 255
    .line 256
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 257
    .line 258
    .line 259
    const v0, 0x3fce147b    # 1.61f

    .line 260
    .line 261
    .line 262
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 263
    .line 264
    .line 265
    const v17, -0x435c28f6    # -0.02f

    .line 266
    .line 267
    .line 268
    const v18, 0x3e19999a    # 0.15f

    .line 269
    .line 270
    .line 271
    const v14, 0x3d4ccccd    # 0.05f

    .line 272
    .line 273
    .line 274
    const v15, -0x435c28f6    # -0.02f

    .line 275
    .line 276
    .line 277
    const v16, 0x3dcccccd    # 0.1f

    .line 278
    .line 279
    .line 280
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 281
    .line 282
    .line 283
    const v17, 0x3f170a3d    # 0.59f

    .line 284
    .line 285
    .line 286
    const v18, 0x3fb47ae1    # 1.41f

    .line 287
    .line 288
    .line 289
    const v14, 0x3f0ccccd    # 0.55f

    .line 290
    .line 291
    .line 292
    const v15, 0x3e6b851f    # 0.23f

    .line 293
    .line 294
    .line 295
    const v16, 0x3f866666    # 1.05f

    .line 296
    .line 297
    .line 298
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 299
    .line 300
    .line 301
    const/high16 v17, 0x41400000    # 12.0f

    .line 302
    .line 303
    const/high16 v18, 0x41700000    # 15.0f

    .line 304
    .line 305
    const v13, 0x412f3333    # 10.95f

    .line 306
    .line 307
    .line 308
    const v14, 0x416c51ec    # 14.77f

    .line 309
    .line 310
    .line 311
    const v15, 0x41373333    # 11.45f

    .line 312
    .line 313
    .line 314
    const/high16 v16, 0x41700000    # 15.0f

    .line 315
    .line 316
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 317
    .line 318
    .line 319
    const v17, 0x3e23d70a    # 0.16f

    .line 320
    .line 321
    .line 322
    const v18, -0x435c28f6    # -0.02f

    .line 323
    .line 324
    .line 325
    const v13, 0x3d4ccccd    # 0.05f

    .line 326
    .line 327
    .line 328
    const/4 v14, 0x0

    .line 329
    const v15, 0x3dcccccd    # 0.1f

    .line 330
    .line 331
    .line 332
    const v16, -0x43dc28f6    # -0.01f

    .line 333
    .line 334
    .line 335
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 336
    .line 337
    .line 338
    const v0, 0x40f3d70a    # 7.62f

    .line 339
    .line 340
    .line 341
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 342
    .line 343
    .line 344
    const v0, 0x3fb47ae1    # 1.41f

    .line 345
    .line 346
    .line 347
    const v2, -0x404b851f    # -1.41f

    .line 348
    .line 349
    .line 350
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 351
    .line 352
    .line 353
    const v0, 0x4033d70a    # 2.81f

    .line 354
    .line 355
    .line 356
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 357
    .line 358
    .line 359
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 360
    .line 361
    .line 362
    const v0, 0x416deb85    # 14.87f

    .line 363
    .line 364
    .line 365
    const v2, 0x418d999a    # 17.7f

    .line 366
    .line 367
    .line 368
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 369
    .line 370
    .line 371
    const/high16 v17, 0x41900000    # 18.0f

    .line 372
    .line 373
    const/high16 v18, 0x41500000    # 13.0f

    .line 374
    .line 375
    const v13, 0x418f1eb8    # 17.89f

    .line 376
    .line 377
    .line 378
    const v14, 0x41647ae1    # 14.28f

    .line 379
    .line 380
    .line 381
    const/high16 v15, 0x41900000    # 18.0f

    .line 382
    .line 383
    const v16, 0x415a6666    # 13.65f

    .line 384
    .line 385
    .line 386
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 387
    .line 388
    .line 389
    const/high16 v17, -0x3f400000    # -6.0f

    .line 390
    .line 391
    const/high16 v18, -0x3f400000    # -6.0f

    .line 392
    .line 393
    const/4 v13, 0x0

    .line 394
    const v14, -0x3fac28f6    # -3.31f

    .line 395
    .line 396
    .line 397
    const v15, -0x3fd3d70a    # -2.69f

    .line 398
    .line 399
    .line 400
    const/high16 v16, -0x3f400000    # -6.0f

    .line 401
    .line 402
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 403
    .line 404
    .line 405
    const v17, -0x4010a3d7    # -1.87f

    .line 406
    .line 407
    .line 408
    const v18, 0x3e99999a    # 0.3f

    .line 409
    .line 410
    .line 411
    const v13, -0x40d9999a    # -0.65f

    .line 412
    .line 413
    .line 414
    const/4 v14, 0x0

    .line 415
    const v15, -0x405c28f6    # -1.28f

    .line 416
    .line 417
    .line 418
    const v16, 0x3dcccccd    # 0.1f

    .line 419
    .line 420
    .line 421
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 422
    .line 423
    .line 424
    const v0, 0x3fdae148    # 1.71f

    .line 425
    .line 426
    .line 427
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 428
    .line 429
    .line 430
    const/high16 v17, 0x41400000    # 12.0f

    .line 431
    .line 432
    const/high16 v18, 0x41100000    # 9.0f

    .line 433
    .line 434
    const v13, 0x413e3d71    # 11.89f

    .line 435
    .line 436
    .line 437
    const/high16 v14, 0x41100000    # 9.0f

    .line 438
    .line 439
    const v15, 0x413f3333    # 11.95f

    .line 440
    .line 441
    .line 442
    const/high16 v16, 0x41100000    # 9.0f

    .line 443
    .line 444
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 445
    .line 446
    .line 447
    const/high16 v17, 0x40800000    # 4.0f

    .line 448
    .line 449
    const/high16 v18, 0x40800000    # 4.0f

    .line 450
    .line 451
    const v13, 0x400d70a4    # 2.21f

    .line 452
    .line 453
    .line 454
    const/4 v14, 0x0

    .line 455
    const/high16 v15, 0x40800000    # 4.0f

    .line 456
    .line 457
    const v16, 0x3fe51eb8    # 1.79f

    .line 458
    .line 459
    .line 460
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 461
    .line 462
    .line 463
    const v17, -0x43dc28f6    # -0.01f

    .line 464
    .line 465
    .line 466
    const v18, 0x3e23d70a    # 0.16f

    .line 467
    .line 468
    .line 469
    const/4 v13, 0x0

    .line 470
    const v14, 0x3d4ccccd    # 0.05f

    .line 471
    .line 472
    .line 473
    const/4 v15, 0x0

    .line 474
    const v16, 0x3de147ae    # 0.11f

    .line 475
    .line 476
    .line 477
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 478
    .line 479
    .line 480
    const v0, 0x416deb85    # 14.87f

    .line 481
    .line 482
    .line 483
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 484
    .line 485
    .line 486
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 487
    .line 488
    .line 489
    const/high16 v0, 0x41400000    # 12.0f

    .line 490
    .line 491
    const/high16 v2, 0x40a00000    # 5.0f

    .line 492
    .line 493
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 494
    .line 495
    .line 496
    const/high16 v17, 0x41000000    # 8.0f

    .line 497
    .line 498
    const/high16 v18, 0x41000000    # 8.0f

    .line 499
    .line 500
    const v13, 0x408d70a4    # 4.42f

    .line 501
    .line 502
    .line 503
    const/4 v14, 0x0

    .line 504
    const/high16 v15, 0x41000000    # 8.0f

    .line 505
    .line 506
    const v16, 0x40651eb8    # 3.58f

    .line 507
    .line 508
    .line 509
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 510
    .line 511
    .line 512
    const v17, -0x40bae148    # -0.77f

    .line 513
    .line 514
    .line 515
    const v18, 0x4059999a    # 3.4f

    .line 516
    .line 517
    .line 518
    const/4 v13, 0x0

    .line 519
    const v14, 0x3f9c28f6    # 1.22f

    .line 520
    .line 521
    .line 522
    const v15, -0x4175c28f    # -0.27f

    .line 523
    .line 524
    .line 525
    const v16, 0x4017ae14    # 2.37f

    .line 526
    .line 527
    .line 528
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 529
    .line 530
    .line 531
    const v0, 0x3fbeb852    # 1.49f

    .line 532
    .line 533
    .line 534
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 535
    .line 536
    .line 537
    const/high16 v17, 0x41b00000    # 22.0f

    .line 538
    .line 539
    const/high16 v18, 0x41500000    # 13.0f

    .line 540
    .line 541
    const v13, 0x41ac3d71    # 21.53f

    .line 542
    .line 543
    .line 544
    const v14, 0x4183999a    # 16.45f

    .line 545
    .line 546
    .line 547
    const/high16 v15, 0x41b00000    # 22.0f

    .line 548
    .line 549
    const v16, 0x416c7ae1    # 14.78f

    .line 550
    .line 551
    .line 552
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 553
    .line 554
    .line 555
    const/high16 v17, -0x3ee00000    # -10.0f

    .line 556
    .line 557
    const/high16 v18, -0x3ee00000    # -10.0f

    .line 558
    .line 559
    const/4 v13, 0x0

    .line 560
    const v14, -0x3f4f5c29    # -5.52f

    .line 561
    .line 562
    .line 563
    const v15, -0x3f70a3d7    # -4.48f

    .line 564
    .line 565
    .line 566
    const/high16 v16, -0x3ee00000    # -10.0f

    .line 567
    .line 568
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 569
    .line 570
    .line 571
    const v17, -0x3f63851f    # -4.89f

    .line 572
    .line 573
    .line 574
    const v18, 0x3fa3d70a    # 1.28f

    .line 575
    .line 576
    .line 577
    const v13, -0x401c28f6    # -1.78f

    .line 578
    .line 579
    .line 580
    const/4 v14, 0x0

    .line 581
    const v15, -0x3fa3d70a    # -3.44f

    .line 582
    .line 583
    .line 584
    const v16, 0x3eeb851f    # 0.46f

    .line 585
    .line 586
    .line 587
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 588
    .line 589
    .line 590
    const v0, 0x3fbd70a4    # 1.48f

    .line 591
    .line 592
    .line 593
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 594
    .line 595
    .line 596
    const/high16 v17, 0x41400000    # 12.0f

    .line 597
    .line 598
    const/high16 v18, 0x40a00000    # 5.0f

    .line 599
    .line 600
    const v13, 0x411a147b    # 9.63f

    .line 601
    .line 602
    .line 603
    const v14, 0x40a8a3d7    # 5.27f

    .line 604
    .line 605
    .line 606
    const v15, 0x412c7ae1    # 10.78f

    .line 607
    .line 608
    .line 609
    const/high16 v16, 0x40a00000    # 5.0f

    .line 610
    .line 611
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 612
    .line 613
    .line 614
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 615
    .line 616
    .line 617
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 618
    .line 619
    .line 620
    move-result-object v2

    .line 621
    const/16 v16, 0x3800

    .line 622
    .line 623
    const/16 v17, 0x0

    .line 624
    .line 625
    const/high16 v6, 0x3f800000    # 1.0f

    .line 626
    .line 627
    const/high16 v8, 0x3f800000    # 1.0f

    .line 628
    .line 629
    const/4 v7, 0x0

    .line 630
    const/high16 v9, 0x3f800000    # 1.0f

    .line 631
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
    sput-object v0, Landroidx/compose/material/icons/filled/WifiTetheringOffKt;->_wifiTetheringOff:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 648
    .line 649
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 650
    .line 651
    .line 652
    return-object v0
.end method
