.class public final Landroidx/compose/material/icons/rounded/MicExternalOnKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_micExternalOn",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "MicExternalOn",
        "Landroidx/compose/material/icons/Icons$Rounded;",
        "getMicExternalOn",
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
        "SMAP\nMicExternalOn.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MicExternalOn.kt\nandroidx/compose/material/icons/rounded/MicExternalOnKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,70:1\n212#2,12:71\n233#2,18:84\n253#2:121\n174#3:83\n705#4,2:102\n717#4,2:104\n719#4,11:110\n72#5,4:106\n*S KotlinDebug\n*F\n+ 1 MicExternalOn.kt\nandroidx/compose/material/icons/rounded/MicExternalOnKt\n*L\n29#1:71,12\n30#1:84,18\n30#1:121\n29#1:83\n30#1:102,2\n30#1:104,2\n30#1:110,11\n30#1:106,4\n*E\n"
    }
.end annotation


# static fields
.field private static _micExternalOn:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getMicExternalOn(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/MicExternalOnKt;->_micExternalOn:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.MicExternalOn"

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
    const v0, 0x4113851f    # 9.22f

    .line 71
    .line 72
    .line 73
    const/high16 v2, 0x40e00000    # 7.0f

    .line 74
    .line 75
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    const v0, 0x4098f5c3    # 4.78f

    .line 79
    .line 80
    .line 81
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 82
    .line 83
    .line 84
    const/high16 v17, 0x40800000    # 4.0f

    .line 85
    .line 86
    const/high16 v18, 0x40a00000    # 5.0f

    .line 87
    .line 88
    const v13, 0x4089999a    # 4.3f

    .line 89
    .line 90
    .line 91
    const v14, 0x40cf0a3d    # 6.47f

    .line 92
    .line 93
    .line 94
    const/high16 v15, 0x40800000    # 4.0f

    .line 95
    .line 96
    const v16, 0x40b8a3d7    # 5.77f

    .line 97
    .line 98
    .line 99
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 100
    .line 101
    .line 102
    const/high16 v17, 0x40400000    # 3.0f

    .line 103
    .line 104
    const/high16 v18, -0x3fc00000    # -3.0f

    .line 105
    .line 106
    const/4 v13, 0x0

    .line 107
    const v14, -0x402b851f    # -1.66f

    .line 108
    .line 109
    .line 110
    const v15, 0x3fab851f    # 1.34f

    .line 111
    .line 112
    .line 113
    const/high16 v16, -0x3fc00000    # -3.0f

    .line 114
    .line 115
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 116
    .line 117
    .line 118
    const v0, 0x3fab851f    # 1.34f

    .line 119
    .line 120
    .line 121
    const/high16 v2, 0x40400000    # 3.0f

    .line 122
    .line 123
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 124
    .line 125
    .line 126
    const v17, 0x4113851f    # 9.22f

    .line 127
    .line 128
    .line 129
    const/high16 v18, 0x40e00000    # 7.0f

    .line 130
    .line 131
    const/high16 v13, 0x41200000    # 10.0f

    .line 132
    .line 133
    const v14, 0x40b8a3d7    # 5.77f

    .line 134
    .line 135
    .line 136
    const v15, 0x411b3333    # 9.7f

    .line 137
    .line 138
    .line 139
    const v16, 0x40cf0a3d    # 6.47f

    .line 140
    .line 141
    .line 142
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 143
    .line 144
    .line 145
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 146
    .line 147
    .line 148
    const v0, 0x4181eb85    # 16.24f

    .line 149
    .line 150
    .line 151
    const v2, 0x4000a3d7    # 2.01f

    .line 152
    .line 153
    .line 154
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 155
    .line 156
    .line 157
    const/high16 v17, 0x41a00000    # 20.0f

    .line 158
    .line 159
    const v18, 0x40c51eb8    # 6.16f

    .line 160
    .line 161
    .line 162
    const v13, 0x41928f5c    # 18.32f

    .line 163
    .line 164
    .line 165
    const v14, 0x400851ec    # 2.13f

    .line 166
    .line 167
    .line 168
    const/high16 v15, 0x41a00000    # 20.0f

    .line 169
    .line 170
    const v16, 0x40828f5c    # 4.08f

    .line 171
    .line 172
    .line 173
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 174
    .line 175
    .line 176
    const/high16 v0, 0x41a00000    # 20.0f

    .line 177
    .line 178
    const/high16 v2, 0x41a80000    # 21.0f

    .line 179
    .line 180
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 181
    .line 182
    .line 183
    const/high16 v17, -0x40800000    # -1.0f

    .line 184
    .line 185
    const/high16 v18, 0x3f800000    # 1.0f

    .line 186
    .line 187
    const/4 v13, 0x0

    .line 188
    const v14, 0x3f0ccccd    # 0.55f

    .line 189
    .line 190
    .line 191
    const v15, -0x4119999a    # -0.45f

    .line 192
    .line 193
    .line 194
    const/high16 v16, 0x3f800000    # 1.0f

    .line 195
    .line 196
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 197
    .line 198
    .line 199
    const/4 v0, 0x0

    .line 200
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 201
    .line 202
    .line 203
    const/high16 v18, -0x40800000    # -1.0f

    .line 204
    .line 205
    const v13, -0x40f33333    # -0.55f

    .line 206
    .line 207
    .line 208
    const/4 v14, 0x0

    .line 209
    const/high16 v15, -0x40800000    # -1.0f

    .line 210
    .line 211
    const v16, -0x4119999a    # -0.45f

    .line 212
    .line 213
    .line 214
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 215
    .line 216
    .line 217
    const v0, -0x3e9170a4    # -14.91f

    .line 218
    .line 219
    .line 220
    const/4 v2, 0x0

    .line 221
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 222
    .line 223
    .line 224
    const v17, -0x4035c28f    # -1.58f

    .line 225
    .line 226
    .line 227
    const v18, -0x3ffccccd    # -2.05f

    .line 228
    .line 229
    .line 230
    const/4 v13, 0x0

    .line 231
    const v14, -0x408a3d71    # -0.96f

    .line 232
    .line 233
    .line 234
    const v15, -0x40dc28f6    # -0.64f

    .line 235
    .line 236
    .line 237
    const v16, -0x4011eb85    # -1.86f

    .line 238
    .line 239
    .line 240
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 241
    .line 242
    .line 243
    const/high16 v17, 0x41600000    # 14.0f

    .line 244
    .line 245
    const/high16 v18, 0x40c00000    # 6.0f

    .line 246
    .line 247
    const v13, 0x41723d71    # 15.14f

    .line 248
    .line 249
    .line 250
    const v14, 0x4071eb85    # 3.78f

    .line 251
    .line 252
    .line 253
    const/high16 v15, 0x41600000    # 14.0f

    .line 254
    .line 255
    const v16, 0x409851ec    # 4.76f

    .line 256
    .line 257
    .line 258
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 259
    .line 260
    .line 261
    const v0, 0x413d70a4    # 11.84f

    .line 262
    .line 263
    .line 264
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 265
    .line 266
    .line 267
    const v17, -0x3f8f5c29    # -3.76f

    .line 268
    .line 269
    .line 270
    const v18, 0x4084cccd    # 4.15f

    .line 271
    .line 272
    .line 273
    const/4 v13, 0x0

    .line 274
    const v14, 0x40051eb8    # 2.08f

    .line 275
    .line 276
    .line 277
    const v15, -0x4028f5c3    # -1.68f

    .line 278
    .line 279
    .line 280
    const v16, 0x4080f5c3    # 4.03f

    .line 281
    .line 282
    .line 283
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 284
    .line 285
    .line 286
    const/high16 v17, 0x40c00000    # 6.0f

    .line 287
    .line 288
    const/high16 v18, 0x41900000    # 18.0f

    .line 289
    .line 290
    const v13, 0x40fd70a4    # 7.92f

    .line 291
    .line 292
    .line 293
    const v14, 0x41b10a3d    # 22.13f

    .line 294
    .line 295
    .line 296
    const/high16 v15, 0x40c00000    # 6.0f

    .line 297
    .line 298
    const v16, 0x41a251ec    # 20.29f

    .line 299
    .line 300
    .line 301
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 302
    .line 303
    .line 304
    const v0, 0x40ae6666    # 5.45f

    .line 305
    .line 306
    .line 307
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 308
    .line 309
    .line 310
    const/high16 v17, -0x41000000    # -0.5f

    .line 311
    .line 312
    const v18, -0x4119999a    # -0.45f

    .line 313
    .line 314
    .line 315
    const v13, -0x417ae148    # -0.26f

    .line 316
    .line 317
    .line 318
    const/4 v14, 0x0

    .line 319
    const v15, -0x410f5c29    # -0.47f

    .line 320
    .line 321
    .line 322
    const v16, -0x41bd70a4    # -0.19f

    .line 323
    .line 324
    .line 325
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 326
    .line 327
    .line 328
    const v0, 0x4083851f    # 4.11f

    .line 329
    .line 330
    .line 331
    const v2, 0x4111999a    # 9.1f

    .line 332
    .line 333
    .line 334
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 335
    .line 336
    .line 337
    const v17, 0x40a33333    # 5.1f

    .line 338
    .line 339
    .line 340
    const/high16 v18, 0x41000000    # 8.0f

    .line 341
    .line 342
    const v13, 0x4081999a    # 4.05f

    .line 343
    .line 344
    .line 345
    const v14, 0x410828f6    # 8.51f

    .line 346
    .line 347
    .line 348
    const v15, 0x409051ec    # 4.51f

    .line 349
    .line 350
    .line 351
    const/high16 v16, 0x41000000    # 8.0f

    .line 352
    .line 353
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 354
    .line 355
    .line 356
    const v0, 0x410e6666    # 8.9f

    .line 357
    .line 358
    .line 359
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 360
    .line 361
    .line 362
    const/high16 v17, 0x3f800000    # 1.0f

    .line 363
    .line 364
    const v18, 0x3f8ccccd    # 1.1f

    .line 365
    .line 366
    .line 367
    const v13, 0x3f170a3d    # 0.59f

    .line 368
    .line 369
    .line 370
    const/4 v14, 0x0

    .line 371
    const v15, 0x3f866666    # 1.05f

    .line 372
    .line 373
    .line 374
    const v16, 0x3f028f5c    # 0.51f

    .line 375
    .line 376
    .line 377
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 378
    .line 379
    .line 380
    const v0, -0x40a66666    # -0.85f

    .line 381
    .line 382
    .line 383
    const v2, 0x41073333    # 8.45f

    .line 384
    .line 385
    .line 386
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 387
    .line 388
    .line 389
    const v17, 0x4108cccd    # 8.55f

    .line 390
    .line 391
    .line 392
    const/high16 v18, 0x41900000    # 18.0f

    .line 393
    .line 394
    const v13, 0x411051ec    # 9.02f

    .line 395
    .line 396
    .line 397
    const v14, 0x418e7ae1    # 17.81f

    .line 398
    .line 399
    .line 400
    const v15, 0x410ccccd    # 8.8f

    .line 401
    .line 402
    .line 403
    const/high16 v16, 0x41900000    # 18.0f

    .line 404
    .line 405
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 406
    .line 407
    .line 408
    const/high16 v0, 0x41000000    # 8.0f

    .line 409
    .line 410
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 411
    .line 412
    .line 413
    const v17, 0x401ae148    # 2.42f

    .line 414
    .line 415
    .line 416
    const v18, 0x3ffae148    # 1.96f

    .line 417
    .line 418
    .line 419
    const/4 v13, 0x0

    .line 420
    const v14, 0x3f9eb852    # 1.24f

    .line 421
    .line 422
    .line 423
    const v15, 0x3f91eb85    # 1.14f

    .line 424
    .line 425
    .line 426
    const v16, 0x400e147b    # 2.22f

    .line 427
    .line 428
    .line 429
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 430
    .line 431
    .line 432
    const v17, 0x3fca3d71    # 1.58f

    .line 433
    .line 434
    .line 435
    const v18, -0x3ffccccd    # -2.05f

    .line 436
    .line 437
    .line 438
    const v13, 0x3f70a3d7    # 0.94f

    .line 439
    .line 440
    .line 441
    const v14, -0x41bd70a4    # -0.19f

    .line 442
    .line 443
    .line 444
    const v15, 0x3fca3d71    # 1.58f

    .line 445
    .line 446
    .line 447
    const v16, -0x40747ae1    # -1.09f

    .line 448
    .line 449
    .line 450
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 451
    .line 452
    .line 453
    const/high16 v0, 0x41400000    # 12.0f

    .line 454
    .line 455
    const/high16 v2, 0x40c00000    # 6.0f

    .line 456
    .line 457
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 458
    .line 459
    .line 460
    const v17, 0x4181eb85    # 16.24f

    .line 461
    .line 462
    .line 463
    const v18, 0x4000a3d7    # 2.01f

    .line 464
    .line 465
    .line 466
    const/high16 v13, 0x41400000    # 12.0f

    .line 467
    .line 468
    const v14, 0x406d70a4    # 3.71f

    .line 469
    .line 470
    .line 471
    const v15, 0x415eb852    # 13.92f

    .line 472
    .line 473
    .line 474
    const v16, 0x3fef5c29    # 1.87f

    .line 475
    .line 476
    .line 477
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 478
    .line 479
    .line 480
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 481
    .line 482
    .line 483
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 484
    .line 485
    .line 486
    move-result-object v2

    .line 487
    const/16 v16, 0x3800

    .line 488
    .line 489
    const/16 v17, 0x0

    .line 490
    .line 491
    const/high16 v6, 0x3f800000    # 1.0f

    .line 492
    .line 493
    const/high16 v8, 0x3f800000    # 1.0f

    .line 494
    .line 495
    const/4 v7, 0x0

    .line 496
    const/high16 v9, 0x3f800000    # 1.0f

    .line 497
    .line 498
    const/high16 v12, 0x3f800000    # 1.0f

    .line 499
    .line 500
    const/4 v13, 0x0

    .line 501
    const/4 v14, 0x0

    .line 502
    const/4 v15, 0x0

    .line 503
    const-string v4, ""

    .line 504
    .line 505
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 506
    .line 507
    .line 508
    move-result-object v0

    .line 509
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 510
    .line 511
    .line 512
    move-result-object v0

    .line 513
    sput-object v0, Landroidx/compose/material/icons/rounded/MicExternalOnKt;->_micExternalOn:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 514
    .line 515
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 516
    .line 517
    .line 518
    return-object v0
.end method
