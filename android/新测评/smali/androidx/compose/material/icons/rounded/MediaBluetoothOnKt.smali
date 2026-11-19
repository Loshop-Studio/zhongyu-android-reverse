.class public final Landroidx/compose/material/icons/rounded/MediaBluetoothOnKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_mediaBluetoothOn",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "MediaBluetoothOn",
        "Landroidx/compose/material/icons/Icons$Rounded;",
        "getMediaBluetoothOn",
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
        "SMAP\nMediaBluetoothOn.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MediaBluetoothOn.kt\nandroidx/compose/material/icons/rounded/MediaBluetoothOnKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,83:1\n212#2,12:84\n233#2,18:97\n253#2:134\n174#3:96\n705#4,2:115\n717#4,2:117\n719#4,11:123\n72#5,4:119\n*S KotlinDebug\n*F\n+ 1 MediaBluetoothOn.kt\nandroidx/compose/material/icons/rounded/MediaBluetoothOnKt\n*L\n29#1:84,12\n30#1:97,18\n30#1:134\n29#1:96\n30#1:115,2\n30#1:117,2\n30#1:123,11\n30#1:119,4\n*E\n"
    }
.end annotation


# static fields
.field private static _mediaBluetoothOn:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getMediaBluetoothOn(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/MediaBluetoothOnKt;->_mediaBluetoothOn:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.MediaBluetoothOn"

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
    const/high16 v0, 0x41100000    # 9.0f

    .line 71
    .line 72
    const/high16 v2, 0x40a00000    # 5.0f

    .line 73
    .line 74
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const v0, 0x3c23d70a    # 0.01f

    .line 78
    .line 79
    .line 80
    const v2, 0x4108cccd    # 8.55f

    .line 81
    .line 82
    .line 83
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 84
    .line 85
    .line 86
    const/high16 v17, -0x40000000    # -2.0f

    .line 87
    .line 88
    const v18, -0x40f33333    # -0.55f

    .line 89
    .line 90
    .line 91
    const v13, -0x40e66666    # -0.6f

    .line 92
    .line 93
    .line 94
    const v14, -0x4151eb85    # -0.34f

    .line 95
    .line 96
    .line 97
    const v15, -0x405c28f6    # -1.28f

    .line 98
    .line 99
    .line 100
    const v16, -0x40f33333    # -0.55f

    .line 101
    .line 102
    .line 103
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 104
    .line 105
    .line 106
    const/high16 v17, 0x40400000    # 3.0f

    .line 107
    .line 108
    const/high16 v18, 0x41880000    # 17.0f

    .line 109
    .line 110
    const v13, 0x409947ae    # 4.79f

    .line 111
    .line 112
    .line 113
    const/high16 v14, 0x41500000    # 13.0f

    .line 114
    .line 115
    const/high16 v15, 0x40400000    # 3.0f

    .line 116
    .line 117
    const v16, 0x416ca3d7    # 14.79f

    .line 118
    .line 119
    .line 120
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 121
    .line 122
    .line 123
    const v0, 0x3fe51eb8    # 1.79f

    .line 124
    .line 125
    .line 126
    const v2, 0x408051ec    # 4.01f

    .line 127
    .line 128
    .line 129
    const/high16 v4, 0x40800000    # 4.0f

    .line 130
    .line 131
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 132
    .line 133
    .line 134
    const v0, 0x4199ae14    # 19.21f

    .line 135
    .line 136
    .line 137
    const/high16 v2, 0x41880000    # 17.0f

    .line 138
    .line 139
    const/high16 v4, 0x41300000    # 11.0f

    .line 140
    .line 141
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 142
    .line 143
    .line 144
    const/high16 v0, 0x40e00000    # 7.0f

    .line 145
    .line 146
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 147
    .line 148
    .line 149
    const/high16 v0, 0x40000000    # 2.0f

    .line 150
    .line 151
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 152
    .line 153
    .line 154
    const/high16 v17, 0x40000000    # 2.0f

    .line 155
    .line 156
    const/high16 v18, -0x40000000    # -2.0f

    .line 157
    .line 158
    const v13, 0x3f8ccccd    # 1.1f

    .line 159
    .line 160
    .line 161
    const/4 v14, 0x0

    .line 162
    const/high16 v15, 0x40000000    # 2.0f

    .line 163
    .line 164
    const v16, -0x4099999a    # -0.9f

    .line 165
    .line 166
    .line 167
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 168
    .line 169
    .line 170
    const/4 v0, 0x0

    .line 171
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 172
    .line 173
    .line 174
    const/high16 v17, -0x40000000    # -2.0f

    .line 175
    .line 176
    const/4 v13, 0x0

    .line 177
    const v14, -0x40733333    # -1.1f

    .line 178
    .line 179
    .line 180
    const v15, -0x4099999a    # -0.9f

    .line 181
    .line 182
    .line 183
    const/high16 v16, -0x40000000    # -2.0f

    .line 184
    .line 185
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 186
    .line 187
    .line 188
    const/high16 v0, -0x40000000    # -2.0f

    .line 189
    .line 190
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 191
    .line 192
    .line 193
    const/high16 v17, 0x41100000    # 9.0f

    .line 194
    .line 195
    const/high16 v18, 0x40a00000    # 5.0f

    .line 196
    .line 197
    const v13, 0x411e6666    # 9.9f

    .line 198
    .line 199
    .line 200
    const/high16 v14, 0x40400000    # 3.0f

    .line 201
    .line 202
    const/high16 v15, 0x41100000    # 9.0f

    .line 203
    .line 204
    const v16, 0x4079999a    # 3.9f

    .line 205
    .line 206
    .line 207
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 208
    .line 209
    .line 210
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 211
    .line 212
    .line 213
    const v0, 0x41a251ec    # 20.29f

    .line 214
    .line 215
    .line 216
    const v2, 0x413b851f    # 11.72f

    .line 217
    .line 218
    .line 219
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 220
    .line 221
    .line 222
    const v0, -0x3fe1eb85    # -2.47f

    .line 223
    .line 224
    .line 225
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 226
    .line 227
    .line 228
    const v17, -0x40a66666    # -0.85f

    .line 229
    .line 230
    .line 231
    const v18, 0x3eb33333    # 0.35f

    .line 232
    .line 233
    .line 234
    const v13, -0x415c28f6    # -0.32f

    .line 235
    .line 236
    .line 237
    const v14, -0x416147ae    # -0.31f

    .line 238
    .line 239
    .line 240
    const v15, -0x40a66666    # -0.85f

    .line 241
    .line 242
    .line 243
    const v16, -0x4247ae14    # -0.09f

    .line 244
    .line 245
    .line 246
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 247
    .line 248
    .line 249
    const v0, 0x407c28f6    # 3.94f

    .line 250
    .line 251
    .line 252
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 253
    .line 254
    .line 255
    const v0, -0x3feae148    # -2.33f

    .line 256
    .line 257
    .line 258
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 259
    .line 260
    .line 261
    const/16 v18, 0x0

    .line 262
    .line 263
    const v13, -0x41947ae1    # -0.23f

    .line 264
    .line 265
    .line 266
    const v14, -0x41947ae1    # -0.23f

    .line 267
    .line 268
    .line 269
    const v15, -0x40e3d70a    # -0.61f

    .line 270
    .line 271
    .line 272
    const v16, -0x41947ae1    # -0.23f

    .line 273
    .line 274
    .line 275
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 276
    .line 277
    .line 278
    const/4 v0, 0x0

    .line 279
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 280
    .line 281
    .line 282
    const/16 v17, 0x0

    .line 283
    .line 284
    const v18, 0x3f59999a    # 0.85f

    .line 285
    .line 286
    .line 287
    const v14, 0x3e6b851f    # 0.23f

    .line 288
    .line 289
    .line 290
    const v15, -0x41947ae1    # -0.23f

    .line 291
    .line 292
    .line 293
    const v16, 0x3f1eb852    # 0.62f

    .line 294
    .line 295
    .line 296
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 297
    .line 298
    .line 299
    const v0, 0x4185d70a    # 16.73f

    .line 300
    .line 301
    .line 302
    const/high16 v2, 0x41700000    # 15.0f

    .line 303
    .line 304
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 305
    .line 306
    .line 307
    const v0, -0x3fc47ae1    # -2.93f

    .line 308
    .line 309
    .line 310
    const v2, 0x403b851f    # 2.93f

    .line 311
    .line 312
    .line 313
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 314
    .line 315
    .line 316
    const v16, 0x3f1c28f6    # 0.61f

    .line 317
    .line 318
    .line 319
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 320
    .line 321
    .line 322
    const/4 v0, 0x0

    .line 323
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 324
    .line 325
    .line 326
    const v17, 0x3f59999a    # 0.85f

    .line 327
    .line 328
    .line 329
    const/16 v18, 0x0

    .line 330
    .line 331
    const v13, 0x3e6b851f    # 0.23f

    .line 332
    .line 333
    .line 334
    const v15, 0x3f1c28f6    # 0.61f

    .line 335
    .line 336
    .line 337
    const v16, 0x3e6b851f    # 0.23f

    .line 338
    .line 339
    .line 340
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 341
    .line 342
    .line 343
    const v0, 0x40151eb8    # 2.33f

    .line 344
    .line 345
    .line 346
    const v2, -0x3feae148    # -2.33f

    .line 347
    .line 348
    .line 349
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 350
    .line 351
    .line 352
    const v0, 0x407c28f6    # 3.94f

    .line 353
    .line 354
    .line 355
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 356
    .line 357
    .line 358
    const v18, 0x3eb33333    # 0.35f

    .line 359
    .line 360
    .line 361
    const/4 v13, 0x0

    .line 362
    const v14, 0x3ee66666    # 0.45f

    .line 363
    .line 364
    .line 365
    const v15, 0x3f0a3d71    # 0.54f

    .line 366
    .line 367
    .line 368
    const v16, 0x3f2b851f    # 0.67f

    .line 369
    .line 370
    .line 371
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 372
    .line 373
    .line 374
    const v0, 0x401d70a4    # 2.46f

    .line 375
    .line 376
    .line 377
    const v2, -0x3fe28f5c    # -2.46f

    .line 378
    .line 379
    .line 380
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 381
    .line 382
    .line 383
    const/16 v17, 0x0

    .line 384
    .line 385
    const v18, -0x404b851f    # -1.41f

    .line 386
    .line 387
    .line 388
    const v13, 0x3ec7ae14    # 0.39f

    .line 389
    .line 390
    .line 391
    const v14, -0x413851ec    # -0.39f

    .line 392
    .line 393
    .line 394
    const v15, 0x3ec7ae14    # 0.39f

    .line 395
    .line 396
    .line 397
    const v16, -0x407d70a4    # -1.02f

    .line 398
    .line 399
    .line 400
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 401
    .line 402
    .line 403
    const v0, 0x41935c29    # 18.42f

    .line 404
    .line 405
    .line 406
    const/high16 v2, 0x41700000    # 15.0f

    .line 407
    .line 408
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 409
    .line 410
    .line 411
    const v0, 0x3fef5c29    # 1.87f

    .line 412
    .line 413
    .line 414
    const v2, -0x4011eb85    # -1.86f

    .line 415
    .line 416
    .line 417
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 418
    .line 419
    .line 420
    const v17, 0x41a251ec    # 20.29f

    .line 421
    .line 422
    .line 423
    const v18, 0x413b851f    # 11.72f

    .line 424
    .line 425
    .line 426
    const v13, 0x41a570a4    # 20.68f

    .line 427
    .line 428
    .line 429
    const/high16 v14, 0x414c0000    # 12.75f

    .line 430
    .line 431
    const v15, 0x41a570a4    # 20.68f

    .line 432
    .line 433
    .line 434
    const v16, 0x4141c28f    # 12.11f

    .line 435
    .line 436
    .line 437
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 438
    .line 439
    .line 440
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 441
    .line 442
    .line 443
    const v0, 0x41915c29    # 18.17f

    .line 444
    .line 445
    .line 446
    const v2, 0x4134cccd    # 11.3f

    .line 447
    .line 448
    .line 449
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 450
    .line 451
    .line 452
    const v0, 0x3f90a3d7    # 1.13f

    .line 453
    .line 454
    .line 455
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 456
    .line 457
    .line 458
    const v0, -0x406f5c29    # -1.13f

    .line 459
    .line 460
    .line 461
    const v2, 0x3f90a3d7    # 1.13f

    .line 462
    .line 463
    .line 464
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 465
    .line 466
    .line 467
    const v0, 0x4134cccd    # 11.3f

    .line 468
    .line 469
    .line 470
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 471
    .line 472
    .line 473
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 474
    .line 475
    .line 476
    const v0, 0x418c8f5c    # 17.57f

    .line 477
    .line 478
    .line 479
    const v2, 0x419a6666    # 19.3f

    .line 480
    .line 481
    .line 482
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 483
    .line 484
    .line 485
    const v0, -0x406f5c29    # -1.13f

    .line 486
    .line 487
    .line 488
    const v2, 0x3f90a3d7    # 1.13f

    .line 489
    .line 490
    .line 491
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 492
    .line 493
    .line 494
    const v0, -0x3fef5c29    # -2.26f

    .line 495
    .line 496
    .line 497
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 498
    .line 499
    .line 500
    const v0, 0x418c8f5c    # 17.57f

    .line 501
    .line 502
    .line 503
    const v2, 0x419a6666    # 19.3f

    .line 504
    .line 505
    .line 506
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 507
    .line 508
    .line 509
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 510
    .line 511
    .line 512
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 513
    .line 514
    .line 515
    move-result-object v2

    .line 516
    const/16 v16, 0x3800

    .line 517
    .line 518
    const/16 v17, 0x0

    .line 519
    .line 520
    const/high16 v6, 0x3f800000    # 1.0f

    .line 521
    .line 522
    const/high16 v8, 0x3f800000    # 1.0f

    .line 523
    .line 524
    const/4 v7, 0x0

    .line 525
    const/high16 v9, 0x3f800000    # 1.0f

    .line 526
    .line 527
    const/high16 v12, 0x3f800000    # 1.0f

    .line 528
    .line 529
    const/4 v13, 0x0

    .line 530
    const/4 v14, 0x0

    .line 531
    const/4 v15, 0x0

    .line 532
    const-string v4, ""

    .line 533
    .line 534
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 535
    .line 536
    .line 537
    move-result-object v0

    .line 538
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 539
    .line 540
    .line 541
    move-result-object v0

    .line 542
    sput-object v0, Landroidx/compose/material/icons/rounded/MediaBluetoothOnKt;->_mediaBluetoothOn:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 543
    .line 544
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 545
    .line 546
    .line 547
    return-object v0
.end method
