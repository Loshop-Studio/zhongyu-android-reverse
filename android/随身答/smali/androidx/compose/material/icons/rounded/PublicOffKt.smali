.class public final Landroidx/compose/material/icons/rounded/PublicOffKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_publicOff",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "PublicOff",
        "Landroidx/compose/material/icons/Icons$Rounded;",
        "getPublicOff",
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
        "SMAP\nPublicOff.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PublicOff.kt\nandroidx/compose/material/icons/rounded/PublicOffKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,72:1\n212#2,12:73\n233#2,18:86\n253#2:123\n174#3:85\n705#4,2:104\n717#4,2:106\n719#4,11:112\n72#5,4:108\n*S KotlinDebug\n*F\n+ 1 PublicOff.kt\nandroidx/compose/material/icons/rounded/PublicOffKt\n*L\n29#1:73,12\n30#1:86,18\n30#1:123\n29#1:85\n30#1:104,2\n30#1:106,2\n30#1:112,11\n30#1:108,4\n*E\n"
    }
.end annotation


# static fields
.field private static _publicOff:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getPublicOff(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/PublicOffKt;->_publicOff:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.PublicOff"

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
    const v0, 0x4102b852    # 8.17f

    .line 71
    .line 72
    .line 73
    const/high16 v2, 0x41300000    # 11.0f

    .line 74
    .line 75
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    const v0, 0x40cfae14    # 6.49f

    .line 79
    .line 80
    .line 81
    const v2, 0x406a3d71    # 3.66f

    .line 82
    .line 83
    .line 84
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 85
    .line 86
    .line 87
    const/high16 v17, 0x41400000    # 12.0f

    .line 88
    .line 89
    const/high16 v18, 0x40000000    # 2.0f

    .line 90
    .line 91
    const v13, 0x41011eb8    # 8.07f

    .line 92
    .line 93
    .line 94
    const v14, 0x40270a3d    # 2.61f

    .line 95
    .line 96
    .line 97
    const v15, 0x411f5c29    # 9.96f

    .line 98
    .line 99
    .line 100
    const/high16 v16, 0x40000000    # 2.0f

    .line 101
    .line 102
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 103
    .line 104
    .line 105
    const/high16 v17, 0x41200000    # 10.0f

    .line 106
    .line 107
    const/high16 v18, 0x41200000    # 10.0f

    .line 108
    .line 109
    const v13, 0x40b0a3d7    # 5.52f

    .line 110
    .line 111
    .line 112
    const/4 v14, 0x0

    .line 113
    const/high16 v15, 0x41200000    # 10.0f

    .line 114
    .line 115
    const v16, 0x408f5c29    # 4.48f

    .line 116
    .line 117
    .line 118
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 119
    .line 120
    .line 121
    const v17, -0x402b851f    # -1.66f

    .line 122
    .line 123
    .line 124
    const v18, 0x40b051ec    # 5.51f

    .line 125
    .line 126
    .line 127
    const/4 v13, 0x0

    .line 128
    const v14, 0x40028f5c    # 2.04f

    .line 129
    .line 130
    .line 131
    const v15, -0x40e3d70a    # -0.61f

    .line 132
    .line 133
    .line 134
    const v16, 0x407b851f    # 3.93f

    .line 135
    .line 136
    .line 137
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 138
    .line 139
    .line 140
    const v0, -0x40451eb8    # -1.46f

    .line 141
    .line 142
    .line 143
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 144
    .line 145
    .line 146
    const/high16 v17, 0x41a00000    # 20.0f

    .line 147
    .line 148
    const/high16 v18, 0x41400000    # 12.0f

    .line 149
    .line 150
    const v13, 0x419cb852    # 19.59f

    .line 151
    .line 152
    .line 153
    const v14, 0x416deb85    # 14.87f

    .line 154
    .line 155
    .line 156
    const/high16 v15, 0x41a00000    # 20.0f

    .line 157
    .line 158
    const v16, 0x4157ae14    # 13.48f

    .line 159
    .line 160
    .line 161
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 162
    .line 163
    .line 164
    const/high16 v17, -0x3f600000    # -5.0f

    .line 165
    .line 166
    const v18, -0x3f12e148    # -7.41f

    .line 167
    .line 168
    .line 169
    const/4 v13, 0x0

    .line 170
    const v14, -0x3fa9999a    # -3.35f

    .line 171
    .line 172
    .line 173
    const v15, -0x3ffb851f    # -2.07f

    .line 174
    .line 175
    .line 176
    const v16, -0x3f38f5c3    # -6.22f

    .line 177
    .line 178
    .line 179
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 180
    .line 181
    .line 182
    const/high16 v0, 0x40a00000    # 5.0f

    .line 183
    .line 184
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 185
    .line 186
    .line 187
    const/high16 v17, -0x40000000    # -2.0f

    .line 188
    .line 189
    const/high16 v18, 0x40000000    # 2.0f

    .line 190
    .line 191
    const v14, 0x3f8ccccd    # 1.1f

    .line 192
    .line 193
    .line 194
    const v15, -0x4099999a    # -0.9f

    .line 195
    .line 196
    .line 197
    const/high16 v16, 0x40000000    # 2.0f

    .line 198
    .line 199
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 200
    .line 201
    .line 202
    const/high16 v0, -0x40000000    # -2.0f

    .line 203
    .line 204
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 205
    .line 206
    .line 207
    const v0, 0x4102b852    # 8.17f

    .line 208
    .line 209
    .line 210
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 211
    .line 212
    .line 213
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 214
    .line 215
    .line 216
    const v0, 0x41af3333    # 21.9f

    .line 217
    .line 218
    .line 219
    const v2, 0x41a3eb85    # 20.49f

    .line 220
    .line 221
    .line 222
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 223
    .line 224
    .line 225
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 226
    .line 227
    .line 228
    const v17, -0x404b851f    # -1.41f

    .line 229
    .line 230
    .line 231
    const/16 v18, 0x0

    .line 232
    .line 233
    const v13, -0x413851ec    # -0.39f

    .line 234
    .line 235
    .line 236
    const v14, 0x3ec7ae14    # 0.39f

    .line 237
    .line 238
    .line 239
    const v15, -0x407d70a4    # -1.02f

    .line 240
    .line 241
    .line 242
    const v16, 0x3ec7ae14    # 0.39f

    .line 243
    .line 244
    .line 245
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 246
    .line 247
    .line 248
    const v0, -0x403851ec    # -1.56f

    .line 249
    .line 250
    .line 251
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 252
    .line 253
    .line 254
    const v17, -0x3f11999a    # -7.45f

    .line 255
    .line 256
    .line 257
    const v18, 0x3fbd70a4    # 1.48f

    .line 258
    .line 259
    .line 260
    const v13, -0x3ffb851f    # -2.07f

    .line 261
    .line 262
    .line 263
    const v14, 0x3faf5c29    # 1.37f

    .line 264
    .line 265
    .line 266
    const v15, -0x3f6a3d71    # -4.68f

    .line 267
    .line 268
    .line 269
    const/high16 v16, 0x40000000    # 2.0f

    .line 270
    .line 271
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 272
    .line 273
    .line 274
    const v17, -0x3f03d70a    # -7.88f

    .line 275
    .line 276
    .line 277
    const v18, -0x3f03d70a    # -7.88f

    .line 278
    .line 279
    .line 280
    const v13, -0x3f833333    # -3.95f

    .line 281
    .line 282
    .line 283
    const/high16 v14, -0x40c00000    # -0.75f

    .line 284
    .line 285
    const v15, -0x3f1bd70a    # -7.13f

    .line 286
    .line 287
    .line 288
    const v16, -0x3f851eb8    # -3.92f

    .line 289
    .line 290
    .line 291
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 292
    .line 293
    .line 294
    const v17, 0x3fbd70a4    # 1.48f

    .line 295
    .line 296
    .line 297
    const v18, -0x3f11999a    # -7.45f

    .line 298
    .line 299
    .line 300
    const v13, -0x40fae148    # -0.52f

    .line 301
    .line 302
    .line 303
    const v14, -0x3fceb852    # -2.77f

    .line 304
    .line 305
    .line 306
    const v15, 0x3dcccccd    # 0.1f

    .line 307
    .line 308
    .line 309
    const v16, -0x3f53d70a    # -5.38f

    .line 310
    .line 311
    .line 312
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 313
    .line 314
    .line 315
    const v0, 0x40066666    # 2.1f

    .line 316
    .line 317
    .line 318
    const v2, 0x409dc28f    # 4.93f

    .line 319
    .line 320
    .line 321
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 322
    .line 323
    .line 324
    const/16 v17, 0x0

    .line 325
    .line 326
    const v18, -0x404b851f    # -1.41f

    .line 327
    .line 328
    .line 329
    const v13, -0x413851ec    # -0.39f

    .line 330
    .line 331
    .line 332
    const v14, -0x413851ec    # -0.39f

    .line 333
    .line 334
    .line 335
    const v15, -0x413851ec    # -0.39f

    .line 336
    .line 337
    .line 338
    const v16, -0x407d70a4    # -1.02f

    .line 339
    .line 340
    .line 341
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 342
    .line 343
    .line 344
    const/4 v0, 0x0

    .line 345
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 346
    .line 347
    .line 348
    const v17, 0x3fb47ae1    # 1.41f

    .line 349
    .line 350
    .line 351
    const/16 v18, 0x0

    .line 352
    .line 353
    const v13, 0x3ec7ae14    # 0.39f

    .line 354
    .line 355
    .line 356
    const v15, 0x3f828f5c    # 1.02f

    .line 357
    .line 358
    .line 359
    const v16, -0x413851ec    # -0.39f

    .line 360
    .line 361
    .line 362
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 363
    .line 364
    .line 365
    const v0, 0x4187c28f    # 16.97f

    .line 366
    .line 367
    .line 368
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 369
    .line 370
    .line 371
    const v17, 0x41a3eb85    # 20.49f

    .line 372
    .line 373
    .line 374
    const v18, 0x41af3333    # 21.9f

    .line 375
    .line 376
    .line 377
    const v13, 0x41a70a3d    # 20.88f

    .line 378
    .line 379
    .line 380
    const v14, 0x41a70a3d    # 20.88f

    .line 381
    .line 382
    .line 383
    const v15, 0x41a70a3d    # 20.88f

    .line 384
    .line 385
    .line 386
    const v16, 0x41ac147b    # 21.51f

    .line 387
    .line 388
    .line 389
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 390
    .line 391
    .line 392
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 393
    .line 394
    .line 395
    const/high16 v0, 0x41900000    # 18.0f

    .line 396
    .line 397
    const/high16 v2, 0x41300000    # 11.0f

    .line 398
    .line 399
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 400
    .line 401
    .line 402
    const/high16 v17, -0x40000000    # -2.0f

    .line 403
    .line 404
    const/high16 v18, -0x40000000    # -2.0f

    .line 405
    .line 406
    const v13, -0x40733333    # -1.1f

    .line 407
    .line 408
    .line 409
    const/4 v14, 0x0

    .line 410
    const/high16 v15, -0x40000000    # -2.0f

    .line 411
    .line 412
    const v16, -0x4099999a    # -0.9f

    .line 413
    .line 414
    .line 415
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 416
    .line 417
    .line 418
    const/high16 v0, -0x40800000    # -1.0f

    .line 419
    .line 420
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 421
    .line 422
    .line 423
    const v0, -0x3f66b852    # -4.79f

    .line 424
    .line 425
    .line 426
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 427
    .line 428
    .line 429
    const/high16 v17, 0x40800000    # 4.0f

    .line 430
    .line 431
    const/high16 v18, 0x41400000    # 12.0f

    .line 432
    .line 433
    const v13, 0x40828f5c    # 4.08f

    .line 434
    .line 435
    .line 436
    const v14, 0x412ca3d7    # 10.79f

    .line 437
    .line 438
    .line 439
    const/high16 v15, 0x40800000    # 4.0f

    .line 440
    .line 441
    const v16, 0x4136147b    # 11.38f

    .line 442
    .line 443
    .line 444
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 445
    .line 446
    .line 447
    const/high16 v17, 0x40e00000    # 7.0f

    .line 448
    .line 449
    const v18, 0x40fdc28f    # 7.93f

    .line 450
    .line 451
    .line 452
    const/4 v13, 0x0

    .line 453
    const v14, 0x40828f5c    # 4.08f

    .line 454
    .line 455
    .line 456
    const v15, 0x40433333    # 3.05f

    .line 457
    .line 458
    .line 459
    const v16, 0x40ee147b    # 7.44f

    .line 460
    .line 461
    .line 462
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 463
    .line 464
    .line 465
    const/high16 v0, 0x41900000    # 18.0f

    .line 466
    .line 467
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 468
    .line 469
    .line 470
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 471
    .line 472
    .line 473
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 474
    .line 475
    .line 476
    move-result-object v2

    .line 477
    const/16 v16, 0x3800

    .line 478
    .line 479
    const/16 v17, 0x0

    .line 480
    .line 481
    const/high16 v6, 0x3f800000    # 1.0f

    .line 482
    .line 483
    const/high16 v8, 0x3f800000    # 1.0f

    .line 484
    .line 485
    const/4 v7, 0x0

    .line 486
    const/high16 v9, 0x3f800000    # 1.0f

    .line 487
    .line 488
    const/high16 v12, 0x3f800000    # 1.0f

    .line 489
    .line 490
    const/4 v14, 0x0

    .line 491
    const/4 v15, 0x0

    .line 492
    const-string v4, ""

    .line 493
    .line 494
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 495
    .line 496
    .line 497
    move-result-object v0

    .line 498
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 499
    .line 500
    .line 501
    move-result-object v0

    .line 502
    sput-object v0, Landroidx/compose/material/icons/rounded/PublicOffKt;->_publicOff:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 503
    .line 504
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 505
    .line 506
    .line 507
    return-object v0
.end method
