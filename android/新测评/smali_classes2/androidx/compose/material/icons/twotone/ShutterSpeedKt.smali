.class public final Landroidx/compose/material/icons/twotone/ShutterSpeedKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_shutterSpeed",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "ShutterSpeed",
        "Landroidx/compose/material/icons/Icons$TwoTone;",
        "getShutterSpeed",
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
        "SMAP\nShutterSpeed.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ShutterSpeed.kt\nandroidx/compose/material/icons/twotone/ShutterSpeedKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,136:1\n212#2,12:137\n233#2,18:150\n253#2:187\n233#2,18:188\n253#2:225\n174#3:149\n705#4,2:168\n717#4,2:170\n719#4,11:176\n705#4,2:206\n717#4,2:208\n719#4,11:214\n72#5,4:172\n72#5,4:210\n*S KotlinDebug\n*F\n+ 1 ShutterSpeed.kt\nandroidx/compose/material/icons/twotone/ShutterSpeedKt\n*L\n29#1:137,12\n30#1:150,18\n30#1:187\n73#1:188,18\n73#1:225\n29#1:149\n30#1:168,2\n30#1:170,2\n30#1:176,11\n73#1:206,2\n73#1:208,2\n73#1:214,11\n30#1:172,4\n73#1:210,4\n*E\n"
    }
.end annotation


# static fields
.field private static _shutterSpeed:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getShutterSpeed(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/ShutterSpeedKt;->_shutterSpeed:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.ShutterSpeed"

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
    const/high16 v4, 0x40c00000    # 6.0f

    .line 71
    .line 72
    const/high16 v6, 0x41400000    # 12.0f

    .line 73
    .line 74
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v25, -0x3f200000    # -7.0f

    .line 78
    .line 79
    const/high16 v26, 0x40e00000    # 7.0f

    .line 80
    .line 81
    const v21, -0x3f8851ec    # -3.87f

    .line 82
    .line 83
    .line 84
    const/16 v22, 0x0

    .line 85
    .line 86
    const/high16 v23, -0x3f200000    # -7.0f

    .line 87
    .line 88
    const v24, 0x404851ec    # 3.13f

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
    const v4, 0x404851ec    # 3.13f

    .line 97
    .line 98
    .line 99
    const/high16 v6, 0x40e00000    # 7.0f

    .line 100
    .line 101
    invoke-virtual {v2, v4, v6, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 102
    .line 103
    .line 104
    const v4, -0x3fb7ae14    # -3.13f

    .line 105
    .line 106
    .line 107
    const/high16 v6, -0x3f200000    # -7.0f

    .line 108
    .line 109
    const/high16 v7, 0x40e00000    # 7.0f

    .line 110
    .line 111
    invoke-virtual {v2, v7, v4, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 112
    .line 113
    .line 114
    invoke-virtual {v2, v4, v6, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 115
    .line 116
    .line 117
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 118
    .line 119
    .line 120
    const/high16 v4, 0x41400000    # 12.0f

    .line 121
    .line 122
    const/high16 v6, 0x40e00000    # 7.0f

    .line 123
    .line 124
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 125
    .line 126
    .line 127
    const v25, 0x3faa3d71    # 1.33f

    .line 128
    .line 129
    .line 130
    const v26, 0x3e19999a    # 0.15f

    .line 131
    .line 132
    .line 133
    const v21, 0x3eeb851f    # 0.46f

    .line 134
    .line 135
    .line 136
    const v23, 0x3f666666    # 0.9f

    .line 137
    .line 138
    .line 139
    const v24, 0x3d75c28f    # 0.06f

    .line 140
    .line 141
    .line 142
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 143
    .line 144
    .line 145
    const v4, -0x3fd1eb85    # -2.72f

    .line 146
    .line 147
    .line 148
    const v6, 0x40966666    # 4.7f

    .line 149
    .line 150
    .line 151
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 152
    .line 153
    .line 154
    const v4, -0x3feb851f    # -2.32f

    .line 155
    .line 156
    .line 157
    const v6, -0x3f9c28f6    # -3.56f

    .line 158
    .line 159
    .line 160
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 161
    .line 162
    .line 163
    const/high16 v25, 0x41400000    # 12.0f

    .line 164
    .line 165
    const/high16 v26, 0x40e00000    # 7.0f

    .line 166
    .line 167
    const v21, 0x4114f5c3    # 9.31f

    .line 168
    .line 169
    .line 170
    const v22, 0x40efae14    # 7.49f

    .line 171
    .line 172
    .line 173
    const v23, 0x4129999a    # 10.6f

    .line 174
    .line 175
    .line 176
    const/high16 v24, 0x40e00000    # 7.0f

    .line 177
    .line 178
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 179
    .line 180
    .line 181
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 182
    .line 183
    .line 184
    const/high16 v4, 0x41500000    # 13.0f

    .line 185
    .line 186
    const/high16 v6, 0x40c00000    # 6.0f

    .line 187
    .line 188
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 189
    .line 190
    .line 191
    const v25, 0x3fc66666    # 1.55f

    .line 192
    .line 193
    .line 194
    const v26, -0x3f7fae14    # -4.01f

    .line 195
    .line 196
    .line 197
    const/16 v21, 0x0

    .line 198
    .line 199
    const v22, -0x403ae148    # -1.54f

    .line 200
    .line 201
    .line 202
    const v23, 0x3f170a3d    # 0.59f

    .line 203
    .line 204
    .line 205
    const v24, -0x3fc33333    # -2.95f

    .line 206
    .line 207
    .line 208
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 209
    .line 210
    .line 211
    const v4, 0x412cf5c3    # 10.81f

    .line 212
    .line 213
    .line 214
    const/high16 v6, 0x41600000    # 14.0f

    .line 215
    .line 216
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 217
    .line 218
    .line 219
    const v4, 0x40c2e148    # 6.09f

    .line 220
    .line 221
    .line 222
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 223
    .line 224
    .line 225
    const v25, -0x4247ae14    # -0.09f

    .line 226
    .line 227
    .line 228
    const/high16 v26, -0x40800000    # -1.0f

    .line 229
    .line 230
    const v21, -0x42b33333    # -0.05f

    .line 231
    .line 232
    .line 233
    const v22, -0x41570a3d    # -0.33f

    .line 234
    .line 235
    .line 236
    const v23, -0x4247ae14    # -0.09f

    .line 237
    .line 238
    .line 239
    const v24, -0x40d70a3d    # -0.66f

    .line 240
    .line 241
    .line 242
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 243
    .line 244
    .line 245
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 246
    .line 247
    .line 248
    const v4, 0x40cb3333    # 6.35f

    .line 249
    .line 250
    .line 251
    const/high16 v6, 0x41700000    # 15.0f

    .line 252
    .line 253
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 254
    .line 255
    .line 256
    const v4, 0x40aa8f5c    # 5.33f

    .line 257
    .line 258
    .line 259
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 260
    .line 261
    .line 262
    const v4, -0x3ffe147b    # -2.03f

    .line 263
    .line 264
    .line 265
    const/high16 v6, 0x40600000    # 3.5f

    .line 266
    .line 267
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 268
    .line 269
    .line 270
    const v4, 0x3de147ae    # 0.11f

    .line 271
    .line 272
    .line 273
    const v6, 0x3d75c28f    # 0.06f

    .line 274
    .line 275
    .line 276
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 277
    .line 278
    .line 279
    const v25, -0x3fa5c28f    # -3.41f

    .line 280
    .line 281
    .line 282
    const v26, -0x3f9c28f6    # -3.56f

    .line 283
    .line 284
    .line 285
    const v21, -0x40347ae1    # -1.59f

    .line 286
    .line 287
    .line 288
    const v22, -0x40dc28f6    # -0.64f

    .line 289
    .line 290
    .line 291
    const v23, -0x3fca3d71    # -2.84f

    .line 292
    .line 293
    .line 294
    const v24, -0x4007ae14    # -1.94f

    .line 295
    .line 296
    .line 297
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 298
    .line 299
    .line 300
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 301
    .line 302
    .line 303
    const/high16 v4, 0x41980000    # 19.0f

    .line 304
    .line 305
    const/high16 v6, 0x41400000    # 12.0f

    .line 306
    .line 307
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 308
    .line 309
    .line 310
    const v25, -0x404e147b    # -1.39f

    .line 311
    .line 312
    .line 313
    const v26, -0x41d1eb85    # -0.17f

    .line 314
    .line 315
    .line 316
    const v21, -0x410a3d71    # -0.48f

    .line 317
    .line 318
    .line 319
    const/16 v22, 0x0

    .line 320
    .line 321
    const v23, -0x408f5c29    # -0.94f

    .line 322
    .line 323
    .line 324
    const v24, -0x428a3d71    # -0.06f

    .line 325
    .line 326
    .line 327
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 328
    .line 329
    .line 330
    const v4, 0x40366666    # 2.85f

    .line 331
    .line 332
    .line 333
    const v6, -0x3f628f5c    # -4.92f

    .line 334
    .line 335
    .line 336
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 337
    .line 338
    .line 339
    const v4, 0x40070a3d    # 2.11f

    .line 340
    .line 341
    .line 342
    const v6, 0x4079999a    # 3.9f

    .line 343
    .line 344
    .line 345
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 346
    .line 347
    .line 348
    const v25, -0x3f9b851f    # -3.57f

    .line 349
    .line 350
    .line 351
    const v26, 0x3f9851ec    # 1.19f

    .line 352
    .line 353
    .line 354
    const/high16 v21, -0x40800000    # -1.0f

    .line 355
    .line 356
    const v22, 0x3f3d70a4    # 0.74f

    .line 357
    .line 358
    .line 359
    const v23, -0x3ff147ae    # -2.23f

    .line 360
    .line 361
    .line 362
    const v24, 0x3f9851ec    # 1.19f

    .line 363
    .line 364
    .line 365
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 366
    .line 367
    .line 368
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 369
    .line 370
    .line 371
    const/high16 v4, 0x41900000    # 18.0f

    .line 372
    .line 373
    const/high16 v6, 0x41500000    # 13.0f

    .line 374
    .line 375
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 376
    .line 377
    .line 378
    const v25, -0x402b851f    # -1.66f

    .line 379
    .line 380
    .line 381
    const v26, 0x408428f6    # 4.13f

    .line 382
    .line 383
    .line 384
    const/16 v21, 0x0

    .line 385
    .line 386
    const v22, 0x3fcccccd    # 1.6f

    .line 387
    .line 388
    .line 389
    const v23, -0x40deb852    # -0.63f

    .line 390
    .line 391
    .line 392
    const v24, 0x4043d70a    # 3.06f

    .line 393
    .line 394
    .line 395
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 396
    .line 397
    .line 398
    const v4, 0x41591eb8    # 13.57f

    .line 399
    .line 400
    .line 401
    const/high16 v6, 0x41400000    # 12.0f

    .line 402
    .line 403
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 404
    .line 405
    .line 406
    const v4, 0x408ae148    # 4.34f

    .line 407
    .line 408
    .line 409
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 410
    .line 411
    .line 412
    const v25, 0x3db851ec    # 0.09f

    .line 413
    .line 414
    .line 415
    const/high16 v26, 0x3f800000    # 1.0f

    .line 416
    .line 417
    const v21, 0x3d4ccccd    # 0.05f

    .line 418
    .line 419
    .line 420
    const v22, 0x3ea8f5c3    # 0.33f

    .line 421
    .line 422
    .line 423
    const v23, 0x3db851ec    # 0.09f

    .line 424
    .line 425
    .line 426
    const v24, 0x3f28f5c3    # 0.66f

    .line 427
    .line 428
    .line 429
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 430
    .line 431
    .line 432
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 433
    .line 434
    .line 435
    const/high16 v4, 0x41300000    # 11.0f

    .line 436
    .line 437
    const v6, 0x414428f6    # 12.26f

    .line 438
    .line 439
    .line 440
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 441
    .line 442
    .line 443
    const v4, 0x40033333    # 2.05f

    .line 444
    .line 445
    .line 446
    const v6, -0x3f9d70a4    # -3.54f

    .line 447
    .line 448
    .line 449
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 450
    .line 451
    .line 452
    const v25, 0x4055c28f    # 3.34f

    .line 453
    .line 454
    .line 455
    const v26, 0x40628f5c    # 3.54f

    .line 456
    .line 457
    .line 458
    const v21, 0x3fc7ae14    # 1.56f

    .line 459
    .line 460
    .line 461
    const v22, 0x3f266666    # 0.65f

    .line 462
    .line 463
    .line 464
    const v23, 0x403147ae    # 2.77f

    .line 465
    .line 466
    .line 467
    const v24, 0x3ff851ec    # 1.94f

    .line 468
    .line 469
    .line 470
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 471
    .line 472
    .line 473
    const v4, -0x3f53851f    # -5.39f

    .line 474
    .line 475
    .line 476
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 477
    .line 478
    .line 479
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 480
    .line 481
    .line 482
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 483
    .line 484
    .line 485
    move-result-object v2

    .line 486
    const/16 v16, 0x3800

    .line 487
    .line 488
    const/16 v17, 0x0

    .line 489
    .line 490
    const v6, 0x3e99999a    # 0.3f

    .line 491
    .line 492
    .line 493
    const v8, 0x3e99999a    # 0.3f

    .line 494
    .line 495
    .line 496
    const/4 v7, 0x0

    .line 497
    const/high16 v9, 0x3f800000    # 1.0f

    .line 498
    .line 499
    const/high16 v12, 0x3f800000    # 1.0f

    .line 500
    .line 501
    const/4 v13, 0x0

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
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 510
    .line 511
    .line 512
    move-result v3

    .line 513
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 514
    .line 515
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 516
    .line 517
    .line 518
    move-result-wide v6

    .line 519
    const/4 v0, 0x0

    .line 520
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 521
    .line 522
    .line 523
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 524
    .line 525
    .line 526
    move-result v10

    .line 527
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 528
    .line 529
    .line 530
    move-result v11

    .line 531
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 532
    .line 533
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 534
    .line 535
    .line 536
    const v0, 0x410fd70a    # 8.99f

    .line 537
    .line 538
    .line 539
    const v2, 0x40f1999a    # 7.55f

    .line 540
    .line 541
    .line 542
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 543
    .line 544
    .line 545
    const/high16 v17, 0x40c00000    # 6.0f

    .line 546
    .line 547
    const/high16 v18, 0x41500000    # 13.0f

    .line 548
    .line 549
    const v13, 0x40d2e148    # 6.59f

    .line 550
    .line 551
    .line 552
    const v14, 0x4120cccd    # 10.05f

    .line 553
    .line 554
    .line 555
    const/high16 v15, 0x40c00000    # 6.0f

    .line 556
    .line 557
    const v16, 0x41375c29    # 11.46f

    .line 558
    .line 559
    .line 560
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 561
    .line 562
    .line 563
    const v17, 0x3db851ec    # 0.09f

    .line 564
    .line 565
    .line 566
    const/high16 v18, 0x3f800000    # 1.0f

    .line 567
    .line 568
    const/4 v13, 0x0

    .line 569
    const v14, 0x3eae147b    # 0.34f

    .line 570
    .line 571
    .line 572
    const v15, 0x3d23d70a    # 0.04f

    .line 573
    .line 574
    .line 575
    const v16, 0x3f2b851f    # 0.67f

    .line 576
    .line 577
    .line 578
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 579
    .line 580
    .line 581
    const v0, 0x40970a3d    # 4.72f

    .line 582
    .line 583
    .line 584
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 585
    .line 586
    .line 587
    const v0, 0x410fd70a    # 8.99f

    .line 588
    .line 589
    .line 590
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 591
    .line 592
    .line 593
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 594
    .line 595
    .line 596
    const v0, 0x4164f5c3    # 14.31f

    .line 597
    .line 598
    .line 599
    const v2, 0x40eeb852    # 7.46f

    .line 600
    .line 601
    .line 602
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 603
    .line 604
    .line 605
    const/high16 v0, 0x41300000    # 11.0f

    .line 606
    .line 607
    const v2, 0x414428f6    # 12.26f

    .line 608
    .line 609
    .line 610
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 611
    .line 612
    .line 613
    const v0, 0x40ac7ae1    # 5.39f

    .line 614
    .line 615
    .line 616
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 617
    .line 618
    .line 619
    const v17, -0x3faa3d71    # -3.34f

    .line 620
    .line 621
    .line 622
    const v18, -0x3f9d70a4    # -3.54f

    .line 623
    .line 624
    .line 625
    const v13, -0x40ee147b    # -0.57f

    .line 626
    .line 627
    .line 628
    const v14, -0x40333333    # -1.6f

    .line 629
    .line 630
    .line 631
    const v15, -0x401c28f6    # -1.78f

    .line 632
    .line 633
    .line 634
    const v16, -0x3fc70a3d    # -2.89f

    .line 635
    .line 636
    .line 637
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 638
    .line 639
    .line 640
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 641
    .line 642
    .line 643
    const v0, 0x415547ae    # 13.33f

    .line 644
    .line 645
    .line 646
    const v2, 0x40e4cccd    # 7.15f

    .line 647
    .line 648
    .line 649
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 650
    .line 651
    .line 652
    const/high16 v17, 0x41400000    # 12.0f

    .line 653
    .line 654
    const/high16 v18, 0x40e00000    # 7.0f

    .line 655
    .line 656
    const v13, 0x414e6666    # 12.9f

    .line 657
    .line 658
    .line 659
    const v14, 0x40e1eb85    # 7.06f

    .line 660
    .line 661
    .line 662
    const v15, 0x41475c29    # 12.46f

    .line 663
    .line 664
    .line 665
    const/high16 v16, 0x40e00000    # 7.0f

    .line 666
    .line 667
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 668
    .line 669
    .line 670
    const v17, -0x3f928f5c    # -3.71f

    .line 671
    .line 672
    .line 673
    const v18, 0x3fa51eb8    # 1.29f

    .line 674
    .line 675
    .line 676
    const v13, -0x404ccccd    # -1.4f

    .line 677
    .line 678
    .line 679
    const/4 v14, 0x0

    .line 680
    const v15, -0x3fd3d70a    # -2.69f

    .line 681
    .line 682
    .line 683
    const v16, 0x3efae148    # 0.49f

    .line 684
    .line 685
    .line 686
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 687
    .line 688
    .line 689
    const v0, 0x40147ae1    # 2.32f

    .line 690
    .line 691
    .line 692
    const v2, 0x4063d70a    # 3.56f

    .line 693
    .line 694
    .line 695
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 696
    .line 697
    .line 698
    const v0, 0x402e147b    # 2.72f

    .line 699
    .line 700
    .line 701
    const v2, -0x3f69999a    # -4.7f

    .line 702
    .line 703
    .line 704
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 705
    .line 706
    .line 707
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 708
    .line 709
    .line 710
    const v0, 0x413ae148    # 11.68f

    .line 711
    .line 712
    .line 713
    const/high16 v2, 0x41700000    # 15.0f

    .line 714
    .line 715
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 716
    .line 717
    .line 718
    const v0, 0x40cb3333    # 6.35f

    .line 719
    .line 720
    .line 721
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 722
    .line 723
    .line 724
    const v17, 0x405a3d71    # 3.41f

    .line 725
    .line 726
    .line 727
    const v18, 0x4063d70a    # 3.56f

    .line 728
    .line 729
    .line 730
    const v13, 0x3f11eb85    # 0.57f

    .line 731
    .line 732
    .line 733
    const v14, 0x3fcf5c29    # 1.62f

    .line 734
    .line 735
    .line 736
    const v15, 0x3fe8f5c3    # 1.82f

    .line 737
    .line 738
    .line 739
    const v16, 0x403ae148    # 2.92f

    .line 740
    .line 741
    .line 742
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 743
    .line 744
    .line 745
    const v0, -0x421eb852    # -0.11f

    .line 746
    .line 747
    .line 748
    const v2, -0x428a3d71    # -0.06f

    .line 749
    .line 750
    .line 751
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 752
    .line 753
    .line 754
    const v0, 0x4001eb85    # 2.03f

    .line 755
    .line 756
    .line 757
    const/high16 v2, -0x3fa00000    # -3.5f

    .line 758
    .line 759
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 760
    .line 761
    .line 762
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 763
    .line 764
    .line 765
    const v0, 0x41983d71    # 19.03f

    .line 766
    .line 767
    .line 768
    const v2, 0x40ec7ae1    # 7.39f

    .line 769
    .line 770
    .line 771
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 772
    .line 773
    .line 774
    const v0, -0x404a3d71    # -1.42f

    .line 775
    .line 776
    .line 777
    const v2, 0x3fb5c28f    # 1.42f

    .line 778
    .line 779
    .line 780
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 781
    .line 782
    .line 783
    const v17, -0x404b851f    # -1.41f

    .line 784
    .line 785
    .line 786
    const v18, -0x404b851f    # -1.41f

    .line 787
    .line 788
    .line 789
    const v13, -0x4123d70a    # -0.43f

    .line 790
    .line 791
    .line 792
    const v14, -0x40fd70a4    # -0.51f

    .line 793
    .line 794
    .line 795
    const v15, -0x4099999a    # -0.9f

    .line 796
    .line 797
    .line 798
    const v16, -0x40828f5c    # -0.99f

    .line 799
    .line 800
    .line 801
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 802
    .line 803
    .line 804
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 805
    .line 806
    .line 807
    const/high16 v17, 0x41400000    # 12.0f

    .line 808
    .line 809
    const/high16 v18, 0x40800000    # 4.0f

    .line 810
    .line 811
    const v13, 0x41808f5c    # 16.07f

    .line 812
    .line 813
    .line 814
    const v14, 0x4097ae14    # 4.74f

    .line 815
    .line 816
    .line 817
    const v15, 0x4161eb85    # 14.12f

    .line 818
    .line 819
    .line 820
    const/high16 v16, 0x40800000    # 4.0f

    .line 821
    .line 822
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 823
    .line 824
    .line 825
    const/high16 v17, -0x3ef00000    # -9.0f

    .line 826
    .line 827
    const/high16 v18, 0x41100000    # 9.0f

    .line 828
    .line 829
    const v13, -0x3f60f5c3    # -4.97f

    .line 830
    .line 831
    .line 832
    const/4 v14, 0x0

    .line 833
    const/high16 v15, -0x3ef00000    # -9.0f

    .line 834
    .line 835
    const v16, 0x4080f5c3    # 4.03f

    .line 836
    .line 837
    .line 838
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 839
    .line 840
    .line 841
    const v0, 0x4080a3d7    # 4.02f

    .line 842
    .line 843
    .line 844
    const/high16 v2, 0x41100000    # 9.0f

    .line 845
    .line 846
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 847
    .line 848
    .line 849
    const v0, -0x3f7f0a3d    # -4.03f

    .line 850
    .line 851
    .line 852
    const/high16 v2, -0x3ef00000    # -9.0f

    .line 853
    .line 854
    const/high16 v4, 0x41100000    # 9.0f

    .line 855
    .line 856
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 857
    .line 858
    .line 859
    const v17, -0x4003d70a    # -1.97f

    .line 860
    .line 861
    .line 862
    const v18, -0x3f4c7ae1    # -5.61f

    .line 863
    .line 864
    .line 865
    const/4 v13, 0x0

    .line 866
    const v14, -0x3ff851ec    # -2.12f

    .line 867
    .line 868
    .line 869
    const v15, -0x40c28f5c    # -0.74f

    .line 870
    .line 871
    .line 872
    const v16, -0x3f7dc28f    # -4.07f

    .line 873
    .line 874
    .line 875
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 876
    .line 877
    .line 878
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 879
    .line 880
    .line 881
    const/high16 v0, 0x41a00000    # 20.0f

    .line 882
    .line 883
    const/high16 v2, 0x41400000    # 12.0f

    .line 884
    .line 885
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 886
    .line 887
    .line 888
    const/high16 v17, -0x3f200000    # -7.0f

    .line 889
    .line 890
    const/high16 v18, -0x3f200000    # -7.0f

    .line 891
    .line 892
    const v13, -0x3f8851ec    # -3.87f

    .line 893
    .line 894
    .line 895
    const/4 v14, 0x0

    .line 896
    const/high16 v15, -0x3f200000    # -7.0f

    .line 897
    .line 898
    const v16, -0x3fb7ae14    # -3.13f

    .line 899
    .line 900
    .line 901
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 902
    .line 903
    .line 904
    const v0, 0x404851ec    # 3.13f

    .line 905
    .line 906
    .line 907
    const/high16 v2, -0x3f200000    # -7.0f

    .line 908
    .line 909
    const/high16 v4, 0x40e00000    # 7.0f

    .line 910
    .line 911
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 912
    .line 913
    .line 914
    const/high16 v2, 0x40e00000    # 7.0f

    .line 915
    .line 916
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 917
    .line 918
    .line 919
    const v0, -0x3fb7ae14    # -3.13f

    .line 920
    .line 921
    .line 922
    const/high16 v2, -0x3f200000    # -7.0f

    .line 923
    .line 924
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 925
    .line 926
    .line 927
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 928
    .line 929
    .line 930
    const/high16 v0, 0x3f800000    # 1.0f

    .line 931
    .line 932
    const/high16 v2, 0x41100000    # 9.0f

    .line 933
    .line 934
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 935
    .line 936
    .line 937
    const/high16 v0, 0x40c00000    # 6.0f

    .line 938
    .line 939
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 940
    .line 941
    .line 942
    const/high16 v0, 0x40000000    # 2.0f

    .line 943
    .line 944
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 945
    .line 946
    .line 947
    const/high16 v0, 0x40400000    # 3.0f

    .line 948
    .line 949
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 950
    .line 951
    .line 952
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 953
    .line 954
    .line 955
    const v0, 0x4182b852    # 16.34f

    .line 956
    .line 957
    .line 958
    const v2, 0x41890a3d    # 17.13f

    .line 959
    .line 960
    .line 961
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 962
    .line 963
    .line 964
    const/high16 v17, 0x41900000    # 18.0f

    .line 965
    .line 966
    const/high16 v18, 0x41500000    # 13.0f

    .line 967
    .line 968
    const v13, 0x418af5c3    # 17.37f

    .line 969
    .line 970
    .line 971
    const v14, 0x41807ae1    # 16.06f

    .line 972
    .line 973
    .line 974
    const/high16 v15, 0x41900000    # 18.0f

    .line 975
    .line 976
    const v16, 0x4169999a    # 14.6f

    .line 977
    .line 978
    .line 979
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 980
    .line 981
    .line 982
    const v17, -0x4247ae14    # -0.09f

    .line 983
    .line 984
    .line 985
    const/high16 v18, -0x40800000    # -1.0f

    .line 986
    .line 987
    const/4 v13, 0x0

    .line 988
    const v14, -0x4151eb85    # -0.34f

    .line 989
    .line 990
    .line 991
    const v15, -0x42dc28f6    # -0.04f

    .line 992
    .line 993
    .line 994
    const v16, -0x40d47ae1    # -0.67f

    .line 995
    .line 996
    .line 997
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 998
    .line 999
    .line 1000
    const v0, -0x3f751eb8    # -4.34f

    .line 1001
    .line 1002
    .line 1003
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1004
    .line 1005
    .line 1006
    const v0, 0x403147ae    # 2.77f

    .line 1007
    .line 1008
    .line 1009
    const v2, 0x40a428f6    # 5.13f

    .line 1010
    .line 1011
    .line 1012
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1013
    .line 1014
    .line 1015
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1016
    .line 1017
    .line 1018
    const v0, 0x4129c28f    # 10.61f

    .line 1019
    .line 1020
    .line 1021
    const v2, 0x4196a3d7    # 18.83f

    .line 1022
    .line 1023
    .line 1024
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1025
    .line 1026
    .line 1027
    const v17, 0x3fb1eb85    # 1.39f

    .line 1028
    .line 1029
    .line 1030
    const v18, 0x3e2e147b    # 0.17f

    .line 1031
    .line 1032
    .line 1033
    const v13, 0x3ee66666    # 0.45f

    .line 1034
    .line 1035
    .line 1036
    const v14, 0x3de147ae    # 0.11f

    .line 1037
    .line 1038
    .line 1039
    const v15, 0x3f68f5c3    # 0.91f

    .line 1040
    .line 1041
    .line 1042
    const v16, 0x3e2e147b    # 0.17f

    .line 1043
    .line 1044
    .line 1045
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1046
    .line 1047
    .line 1048
    const v17, 0x40647ae1    # 3.57f

    .line 1049
    .line 1050
    .line 1051
    const v18, -0x4067ae14    # -1.19f

    .line 1052
    .line 1053
    .line 1054
    const v13, 0x3fab851f    # 1.34f

    .line 1055
    .line 1056
    .line 1057
    const/4 v14, 0x0

    .line 1058
    const v15, 0x40247ae1    # 2.57f

    .line 1059
    .line 1060
    .line 1061
    const v16, -0x4119999a    # -0.45f

    .line 1062
    .line 1063
    .line 1064
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1065
    .line 1066
    .line 1067
    const v0, -0x3ff8f5c3    # -2.11f

    .line 1068
    .line 1069
    .line 1070
    const v2, -0x3f866666    # -3.9f

    .line 1071
    .line 1072
    .line 1073
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1074
    .line 1075
    .line 1076
    const v0, -0x3fc9999a    # -2.85f

    .line 1077
    .line 1078
    .line 1079
    const v2, 0x409d70a4    # 4.92f

    .line 1080
    .line 1081
    .line 1082
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1083
    .line 1084
    .line 1085
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1086
    .line 1087
    .line 1088
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 1089
    .line 1090
    .line 1091
    move-result-object v2

    .line 1092
    const/16 v16, 0x3800

    .line 1093
    .line 1094
    const/16 v17, 0x0

    .line 1095
    .line 1096
    const/high16 v6, 0x3f800000    # 1.0f

    .line 1097
    .line 1098
    const/high16 v8, 0x3f800000    # 1.0f

    .line 1099
    .line 1100
    const/4 v7, 0x0

    .line 1101
    const/high16 v12, 0x3f800000    # 1.0f

    .line 1102
    .line 1103
    const/4 v13, 0x0

    .line 1104
    const/4 v15, 0x0

    .line 1105
    const-string v4, ""

    .line 1106
    .line 1107
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 1108
    .line 1109
    .line 1110
    move-result-object v0

    .line 1111
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1112
    .line 1113
    .line 1114
    move-result-object v0

    .line 1115
    sput-object v0, Landroidx/compose/material/icons/twotone/ShutterSpeedKt;->_shutterSpeed:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1116
    .line 1117
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 1118
    .line 1119
    .line 1120
    return-object v0
.end method
