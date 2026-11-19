.class public final Landroidx/compose/material/icons/rounded/SignalWifi4BarLockKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_signalWifi4BarLock",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "SignalWifi4BarLock",
        "Landroidx/compose/material/icons/Icons$Rounded;",
        "getSignalWifi4BarLock",
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
        "SMAP\nSignalWifi4BarLock.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SignalWifi4BarLock.kt\nandroidx/compose/material/icons/rounded/SignalWifi4BarLockKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,74:1\n212#2,12:75\n233#2,18:88\n253#2:125\n233#2,18:126\n253#2:163\n174#3:87\n705#4,2:106\n717#4,2:108\n719#4,11:114\n705#4,2:144\n717#4,2:146\n719#4,11:152\n72#5,4:110\n72#5,4:148\n*S KotlinDebug\n*F\n+ 1 SignalWifi4BarLock.kt\nandroidx/compose/material/icons/rounded/SignalWifi4BarLockKt\n*L\n29#1:75,12\n30#1:88,18\n30#1:125\n47#1:126,18\n47#1:163\n29#1:87\n30#1:106,2\n30#1:108,2\n30#1:114,11\n47#1:144,2\n47#1:146,2\n47#1:152,11\n30#1:110,4\n47#1:148,4\n*E\n"
    }
.end annotation


# static fields
.field private static _signalWifi4BarLock:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getSignalWifi4BarLock(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/SignalWifi4BarLockKt;->_signalWifi4BarLock:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.SignalWifi4BarLock"

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
    const v4, 0x41b9ae14    # 23.21f

    .line 71
    .line 72
    .line 73
    const v6, 0x4103d70a    # 8.24f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const/high16 v25, 0x41400000    # 12.0f

    .line 80
    .line 81
    const/high16 v26, 0x40800000    # 4.0f

    .line 82
    .line 83
    const v21, 0x41a1c28f    # 20.22f

    .line 84
    .line 85
    .line 86
    const v22, 0x40b33333    # 5.6f

    .line 87
    .line 88
    .line 89
    const v23, 0x41826666    # 16.3f

    .line 90
    .line 91
    .line 92
    const/high16 v24, 0x40800000    # 4.0f

    .line 93
    .line 94
    move-object/from16 v20, v2

    .line 95
    .line 96
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 97
    .line 98
    .line 99
    const v4, 0x40b33333    # 5.6f

    .line 100
    .line 101
    .line 102
    const v6, 0x3f4a3d71    # 0.79f

    .line 103
    .line 104
    .line 105
    const v7, 0x4103d70a    # 8.24f

    .line 106
    .line 107
    .line 108
    const v8, 0x4071eb85    # 3.78f

    .line 109
    .line 110
    .line 111
    invoke-virtual {v2, v8, v4, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 112
    .line 113
    .line 114
    const v25, 0x3f3ae148    # 0.73f

    .line 115
    .line 116
    .line 117
    const v26, 0x411b5c29    # 9.71f

    .line 118
    .line 119
    .line 120
    const v21, 0x3eb33333    # 0.35f

    .line 121
    .line 122
    .line 123
    const v22, 0x410a147b    # 8.63f

    .line 124
    .line 125
    .line 126
    const v23, 0x3ea3d70a    # 0.32f

    .line 127
    .line 128
    .line 129
    const v24, 0x4114cccd    # 9.3f

    .line 130
    .line 131
    .line 132
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 133
    .line 134
    .line 135
    const v4, 0x40b3d70a    # 5.62f

    .line 136
    .line 137
    .line 138
    const v6, 0x40b428f6    # 5.63f

    .line 139
    .line 140
    .line 141
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 142
    .line 143
    .line 144
    const v4, 0x409e147b    # 4.94f

    .line 145
    .line 146
    .line 147
    const v6, 0x409e6666    # 4.95f

    .line 148
    .line 149
    .line 150
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 151
    .line 152
    .line 153
    const v25, 0x3fb5c28f    # 1.42f

    .line 154
    .line 155
    .line 156
    const/16 v26, 0x0

    .line 157
    .line 158
    const v21, 0x3ec7ae14    # 0.39f

    .line 159
    .line 160
    .line 161
    const v22, 0x3ec7ae14    # 0.39f

    .line 162
    .line 163
    .line 164
    const v23, 0x3f828f5c    # 1.02f

    .line 165
    .line 166
    .line 167
    const v24, 0x3ec7ae14    # 0.39f

    .line 168
    .line 169
    .line 170
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 171
    .line 172
    .line 173
    const v4, 0x4015c28f    # 2.34f

    .line 174
    .line 175
    .line 176
    const v6, -0x3fea3d71    # -2.34f

    .line 177
    .line 178
    .line 179
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 180
    .line 181
    .line 182
    const/high16 v4, 0x41700000    # 15.0f

    .line 183
    .line 184
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 185
    .line 186
    .line 187
    const v25, 0x3e6b851f    # 0.23f

    .line 188
    .line 189
    .line 190
    const v26, -0x405ae148    # -1.29f

    .line 191
    .line 192
    .line 193
    const/16 v21, 0x0

    .line 194
    .line 195
    const v22, -0x4119999a    # -0.45f

    .line 196
    .line 197
    .line 198
    const v23, 0x3db851ec    # 0.09f

    .line 199
    .line 200
    .line 201
    const v24, -0x409eb852    # -0.88f

    .line 202
    .line 203
    .line 204
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 205
    .line 206
    .line 207
    const v25, 0x407147ae    # 3.77f

    .line 208
    .line 209
    .line 210
    const v26, -0x3fd28f5c    # -2.71f

    .line 211
    .line 212
    .line 213
    const v21, 0x3f0a3d71    # 0.54f

    .line 214
    .line 215
    .line 216
    const v22, -0x40370a3d    # -1.57f

    .line 217
    .line 218
    .line 219
    const v23, 0x4000a3d7    # 2.01f

    .line 220
    .line 221
    .line 222
    const v24, -0x3fd28f5c    # -2.71f

    .line 223
    .line 224
    .line 225
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 226
    .line 227
    .line 228
    const v4, 0x403c28f6    # 2.94f

    .line 229
    .line 230
    .line 231
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 232
    .line 233
    .line 234
    const v4, 0x3fa51eb8    # 1.29f

    .line 235
    .line 236
    .line 237
    const v6, -0x405ae148    # -1.29f

    .line 238
    .line 239
    .line 240
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 241
    .line 242
    .line 243
    const v25, 0x41b9ae14    # 23.21f

    .line 244
    .line 245
    .line 246
    const v26, 0x4103d70a    # 8.24f

    .line 247
    .line 248
    .line 249
    const v21, 0x41bd70a4    # 23.68f

    .line 250
    .line 251
    .line 252
    const v22, 0x4114cccd    # 9.3f

    .line 253
    .line 254
    .line 255
    const v23, 0x41bd3333    # 23.65f

    .line 256
    .line 257
    .line 258
    const v24, 0x410a147b    # 8.63f

    .line 259
    .line 260
    .line 261
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 262
    .line 263
    .line 264
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 265
    .line 266
    .line 267
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 268
    .line 269
    .line 270
    move-result-object v2

    .line 271
    const/16 v16, 0x3800

    .line 272
    .line 273
    const/16 v17, 0x0

    .line 274
    .line 275
    const/high16 v6, 0x3f800000    # 1.0f

    .line 276
    .line 277
    const/high16 v8, 0x3f800000    # 1.0f

    .line 278
    .line 279
    const/4 v7, 0x0

    .line 280
    const/high16 v9, 0x3f800000    # 1.0f

    .line 281
    .line 282
    const/high16 v12, 0x3f800000    # 1.0f

    .line 283
    .line 284
    const/4 v13, 0x0

    .line 285
    const/4 v14, 0x0

    .line 286
    const/4 v15, 0x0

    .line 287
    const-string v4, ""

    .line 288
    .line 289
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 290
    .line 291
    .line 292
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 293
    .line 294
    .line 295
    move-result v3

    .line 296
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 297
    .line 298
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 299
    .line 300
    .line 301
    move-result-wide v6

    .line 302
    const/4 v0, 0x0

    .line 303
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 304
    .line 305
    .line 306
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 307
    .line 308
    .line 309
    move-result v10

    .line 310
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 311
    .line 312
    .line 313
    move-result v11

    .line 314
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 315
    .line 316
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 317
    .line 318
    .line 319
    const/high16 v0, 0x41b00000    # 22.0f

    .line 320
    .line 321
    const/high16 v2, 0x41800000    # 16.0f

    .line 322
    .line 323
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 324
    .line 325
    .line 326
    const/high16 v0, -0x40800000    # -1.0f

    .line 327
    .line 328
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 329
    .line 330
    .line 331
    const/high16 v17, -0x40000000    # -2.0f

    .line 332
    .line 333
    const/high16 v18, -0x40000000    # -2.0f

    .line 334
    .line 335
    const v14, -0x40733333    # -1.1f

    .line 336
    .line 337
    .line 338
    const v15, -0x4099999a    # -0.9f

    .line 339
    .line 340
    .line 341
    const/high16 v16, -0x40000000    # -2.0f

    .line 342
    .line 343
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 344
    .line 345
    .line 346
    const v0, 0x3f666666    # 0.9f

    .line 347
    .line 348
    .line 349
    const/high16 v2, 0x40000000    # 2.0f

    .line 350
    .line 351
    const/high16 v4, -0x40000000    # -2.0f

    .line 352
    .line 353
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 354
    .line 355
    .line 356
    const/high16 v0, 0x3f800000    # 1.0f

    .line 357
    .line 358
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 359
    .line 360
    .line 361
    const/high16 v17, -0x40800000    # -1.0f

    .line 362
    .line 363
    const/high16 v18, 0x3f800000    # 1.0f

    .line 364
    .line 365
    const v13, -0x40f33333    # -0.55f

    .line 366
    .line 367
    .line 368
    const/4 v14, 0x0

    .line 369
    const/high16 v15, -0x40800000    # -1.0f

    .line 370
    .line 371
    const v16, 0x3ee66666    # 0.45f

    .line 372
    .line 373
    .line 374
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 375
    .line 376
    .line 377
    const/high16 v0, 0x40400000    # 3.0f

    .line 378
    .line 379
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 380
    .line 381
    .line 382
    const/high16 v17, 0x3f800000    # 1.0f

    .line 383
    .line 384
    const/4 v13, 0x0

    .line 385
    const v14, 0x3f0ccccd    # 0.55f

    .line 386
    .line 387
    .line 388
    const v15, 0x3ee66666    # 0.45f

    .line 389
    .line 390
    .line 391
    const/high16 v16, 0x3f800000    # 1.0f

    .line 392
    .line 393
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 394
    .line 395
    .line 396
    const/high16 v0, 0x40800000    # 4.0f

    .line 397
    .line 398
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 399
    .line 400
    .line 401
    const/high16 v18, -0x40800000    # -1.0f

    .line 402
    .line 403
    const v13, 0x3f0ccccd    # 0.55f

    .line 404
    .line 405
    .line 406
    const/4 v14, 0x0

    .line 407
    const/high16 v15, 0x3f800000    # 1.0f

    .line 408
    .line 409
    const v16, -0x4119999a    # -0.45f

    .line 410
    .line 411
    .line 412
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 413
    .line 414
    .line 415
    const/high16 v0, -0x3fc00000    # -3.0f

    .line 416
    .line 417
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 418
    .line 419
    .line 420
    const/high16 v17, 0x41b00000    # 22.0f

    .line 421
    .line 422
    const/high16 v18, 0x41800000    # 16.0f

    .line 423
    .line 424
    const/high16 v13, 0x41b80000    # 23.0f

    .line 425
    .line 426
    const v14, 0x4183999a    # 16.45f

    .line 427
    .line 428
    .line 429
    const v15, 0x41b46666    # 22.55f

    .line 430
    .line 431
    .line 432
    const/high16 v16, 0x41800000    # 16.0f

    .line 433
    .line 434
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 435
    .line 436
    .line 437
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 438
    .line 439
    .line 440
    const/high16 v0, 0x41a80000    # 21.0f

    .line 441
    .line 442
    const/high16 v2, 0x41800000    # 16.0f

    .line 443
    .line 444
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 445
    .line 446
    .line 447
    const/high16 v0, -0x40000000    # -2.0f

    .line 448
    .line 449
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 450
    .line 451
    .line 452
    const/high16 v0, -0x40800000    # -1.0f

    .line 453
    .line 454
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 455
    .line 456
    .line 457
    const/high16 v17, 0x3f800000    # 1.0f

    .line 458
    .line 459
    const/high16 v18, -0x40800000    # -1.0f

    .line 460
    .line 461
    const/4 v13, 0x0

    .line 462
    const v14, -0x40f33333    # -0.55f

    .line 463
    .line 464
    .line 465
    const v15, 0x3ee66666    # 0.45f

    .line 466
    .line 467
    .line 468
    const/high16 v16, -0x40800000    # -1.0f

    .line 469
    .line 470
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 471
    .line 472
    .line 473
    const v0, 0x3ee66666    # 0.45f

    .line 474
    .line 475
    .line 476
    const/high16 v2, 0x3f800000    # 1.0f

    .line 477
    .line 478
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 479
    .line 480
    .line 481
    const/high16 v0, 0x41800000    # 16.0f

    .line 482
    .line 483
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 484
    .line 485
    .line 486
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 487
    .line 488
    .line 489
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 490
    .line 491
    .line 492
    move-result-object v2

    .line 493
    const/16 v16, 0x3800

    .line 494
    .line 495
    const/16 v17, 0x0

    .line 496
    .line 497
    const/high16 v6, 0x3f800000    # 1.0f

    .line 498
    .line 499
    const/4 v7, 0x0

    .line 500
    const/high16 v12, 0x3f800000    # 1.0f

    .line 501
    .line 502
    const/4 v14, 0x0

    .line 503
    const/4 v15, 0x0

    .line 504
    const-string v4, ""

    .line 505
    .line 506
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 507
    .line 508
    .line 509
    move-result-object v0

    .line 510
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 511
    .line 512
    .line 513
    move-result-object v0

    .line 514
    sput-object v0, Landroidx/compose/material/icons/rounded/SignalWifi4BarLockKt;->_signalWifi4BarLock:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 515
    .line 516
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 517
    .line 518
    .line 519
    return-object v0
.end method
