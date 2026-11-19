.class public final Landroidx/compose/material/icons/rounded/MultipleStopKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_multipleStop",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "MultipleStop",
        "Landroidx/compose/material/icons/Icons$Rounded;",
        "getMultipleStop",
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
        "SMAP\nMultipleStop.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultipleStop.kt\nandroidx/compose/material/icons/rounded/MultipleStopKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,89:1\n212#2,12:90\n233#2,18:103\n253#2:140\n174#3:102\n705#4,2:121\n717#4,2:123\n719#4,11:129\n72#5,4:125\n*S KotlinDebug\n*F\n+ 1 MultipleStop.kt\nandroidx/compose/material/icons/rounded/MultipleStopKt\n*L\n29#1:90,12\n30#1:103,18\n30#1:140\n29#1:102\n30#1:121,2\n30#1:123,2\n30#1:129,11\n30#1:125,4\n*E\n"
    }
.end annotation


# static fields
.field private static _multipleStop:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getMultipleStop(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/MultipleStopKt;->_multipleStop:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.MultipleStop"

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
    const v0, 0x40a6b852    # 5.21f

    .line 71
    .line 72
    .line 73
    const/high16 v2, 0x41880000    # 17.0f

    .line 74
    .line 75
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    const v17, 0x3f59999a    # 0.85f

    .line 79
    .line 80
    .line 81
    const v18, -0x414ccccd    # -0.35f

    .line 82
    .line 83
    .line 84
    const/4 v13, 0x0

    .line 85
    const v14, -0x4119999a    # -0.45f

    .line 86
    .line 87
    .line 88
    const v15, 0x3f0a3d71    # 0.54f

    .line 89
    .line 90
    .line 91
    const v16, -0x40d47ae1    # -0.67f

    .line 92
    .line 93
    .line 94
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 95
    .line 96
    .line 97
    const v0, 0x40328f5c    # 2.79f

    .line 98
    .line 99
    .line 100
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 101
    .line 102
    .line 103
    const/16 v17, 0x0

    .line 104
    .line 105
    const v18, 0x3f35c28f    # 0.71f

    .line 106
    .line 107
    .line 108
    const v13, 0x3e4ccccd    # 0.2f

    .line 109
    .line 110
    .line 111
    const v14, 0x3e4ccccd    # 0.2f

    .line 112
    .line 113
    .line 114
    const v15, 0x3e4ccccd    # 0.2f

    .line 115
    .line 116
    .line 117
    const v16, 0x3f028f5c    # 0.51f

    .line 118
    .line 119
    .line 120
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 121
    .line 122
    .line 123
    const v0, -0x3fcd70a4    # -2.79f

    .line 124
    .line 125
    .line 126
    const v2, 0x40328f5c    # 2.79f

    .line 127
    .line 128
    .line 129
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 130
    .line 131
    .line 132
    const/high16 v17, 0x41880000    # 17.0f

    .line 133
    .line 134
    const v18, 0x412ca3d7    # 10.79f

    .line 135
    .line 136
    .line 137
    const v13, 0x418c51ec    # 17.54f

    .line 138
    .line 139
    .line 140
    const v14, 0x41375c29    # 11.46f

    .line 141
    .line 142
    .line 143
    const/high16 v15, 0x41880000    # 17.0f

    .line 144
    .line 145
    const v16, 0x4133d70a    # 11.24f

    .line 146
    .line 147
    .line 148
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 149
    .line 150
    .line 151
    const/high16 v0, 0x41100000    # 9.0f

    .line 152
    .line 153
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 154
    .line 155
    .line 156
    const/high16 v0, -0x3fc00000    # -3.0f

    .line 157
    .line 158
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 159
    .line 160
    .line 161
    const/high16 v17, -0x40800000    # -1.0f

    .line 162
    .line 163
    const/high16 v18, -0x40800000    # -1.0f

    .line 164
    .line 165
    const v13, -0x40f33333    # -0.55f

    .line 166
    .line 167
    .line 168
    const/4 v14, 0x0

    .line 169
    const/high16 v15, -0x40800000    # -1.0f

    .line 170
    .line 171
    const v16, -0x4119999a    # -0.45f

    .line 172
    .line 173
    .line 174
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 175
    .line 176
    .line 177
    const/4 v0, 0x0

    .line 178
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 179
    .line 180
    .line 181
    const/high16 v17, 0x3f800000    # 1.0f

    .line 182
    .line 183
    const/4 v13, 0x0

    .line 184
    const v14, -0x40f33333    # -0.55f

    .line 185
    .line 186
    .line 187
    const v15, 0x3ee66666    # 0.45f

    .line 188
    .line 189
    .line 190
    const/high16 v16, -0x40800000    # -1.0f

    .line 191
    .line 192
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 193
    .line 194
    .line 195
    const/high16 v0, 0x40400000    # 3.0f

    .line 196
    .line 197
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 198
    .line 199
    .line 200
    const v0, 0x40a6b852    # 5.21f

    .line 201
    .line 202
    .line 203
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 204
    .line 205
    .line 206
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 207
    .line 208
    .line 209
    const/high16 v0, 0x41200000    # 10.0f

    .line 210
    .line 211
    const/high16 v2, 0x40e00000    # 7.0f

    .line 212
    .line 213
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 214
    .line 215
    .line 216
    const/high16 v17, 0x41100000    # 9.0f

    .line 217
    .line 218
    const/high16 v18, 0x41000000    # 8.0f

    .line 219
    .line 220
    const v13, 0x41173333    # 9.45f

    .line 221
    .line 222
    .line 223
    const/high16 v14, 0x40e00000    # 7.0f

    .line 224
    .line 225
    const/high16 v15, 0x41100000    # 9.0f

    .line 226
    .line 227
    const v16, 0x40ee6666    # 7.45f

    .line 228
    .line 229
    .line 230
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 231
    .line 232
    .line 233
    const v0, 0x3ee66666    # 0.45f

    .line 234
    .line 235
    .line 236
    const/high16 v2, 0x3f800000    # 1.0f

    .line 237
    .line 238
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 239
    .line 240
    .line 241
    const v0, -0x4119999a    # -0.45f

    .line 242
    .line 243
    .line 244
    const/high16 v2, -0x40800000    # -1.0f

    .line 245
    .line 246
    const/high16 v4, 0x3f800000    # 1.0f

    .line 247
    .line 248
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 249
    .line 250
    .line 251
    const v0, 0x4128cccd    # 10.55f

    .line 252
    .line 253
    .line 254
    const/high16 v2, 0x41200000    # 10.0f

    .line 255
    .line 256
    const/high16 v4, 0x40e00000    # 7.0f

    .line 257
    .line 258
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 259
    .line 260
    .line 261
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 262
    .line 263
    .line 264
    const/high16 v0, 0x40c00000    # 6.0f

    .line 265
    .line 266
    const/high16 v2, 0x40e00000    # 7.0f

    .line 267
    .line 268
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 269
    .line 270
    .line 271
    const/high16 v17, 0x40a00000    # 5.0f

    .line 272
    .line 273
    const v13, 0x40ae6666    # 5.45f

    .line 274
    .line 275
    .line 276
    const/high16 v15, 0x40a00000    # 5.0f

    .line 277
    .line 278
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 279
    .line 280
    .line 281
    const v0, 0x3ee66666    # 0.45f

    .line 282
    .line 283
    .line 284
    const/high16 v2, 0x3f800000    # 1.0f

    .line 285
    .line 286
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 287
    .line 288
    .line 289
    const v0, -0x4119999a    # -0.45f

    .line 290
    .line 291
    .line 292
    const/high16 v2, -0x40800000    # -1.0f

    .line 293
    .line 294
    const/high16 v4, 0x3f800000    # 1.0f

    .line 295
    .line 296
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 297
    .line 298
    .line 299
    const v0, 0x40d1999a    # 6.55f

    .line 300
    .line 301
    .line 302
    const/high16 v2, 0x40c00000    # 6.0f

    .line 303
    .line 304
    const/high16 v4, 0x40e00000    # 7.0f

    .line 305
    .line 306
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 307
    .line 308
    .line 309
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 310
    .line 311
    .line 312
    const/high16 v0, 0x41880000    # 17.0f

    .line 313
    .line 314
    const/high16 v2, 0x40e00000    # 7.0f

    .line 315
    .line 316
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 317
    .line 318
    .line 319
    const/high16 v0, 0x40400000    # 3.0f

    .line 320
    .line 321
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 322
    .line 323
    .line 324
    const/high16 v17, 0x3f800000    # 1.0f

    .line 325
    .line 326
    const/high16 v18, -0x40800000    # -1.0f

    .line 327
    .line 328
    const v13, 0x3f0ccccd    # 0.55f

    .line 329
    .line 330
    .line 331
    const/4 v14, 0x0

    .line 332
    const/high16 v15, 0x3f800000    # 1.0f

    .line 333
    .line 334
    const v16, -0x4119999a    # -0.45f

    .line 335
    .line 336
    .line 337
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 338
    .line 339
    .line 340
    const/4 v0, 0x0

    .line 341
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 342
    .line 343
    .line 344
    const/high16 v17, -0x40800000    # -1.0f

    .line 345
    .line 346
    const/4 v13, 0x0

    .line 347
    const v14, -0x40f33333    # -0.55f

    .line 348
    .line 349
    .line 350
    const v15, -0x4119999a    # -0.45f

    .line 351
    .line 352
    .line 353
    const/high16 v16, -0x40800000    # -1.0f

    .line 354
    .line 355
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 356
    .line 357
    .line 358
    const/high16 v0, 0x40e00000    # 7.0f

    .line 359
    .line 360
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 361
    .line 362
    .line 363
    const v0, -0x401ae148    # -1.79f

    .line 364
    .line 365
    .line 366
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 367
    .line 368
    .line 369
    const v17, -0x40a66666    # -0.85f

    .line 370
    .line 371
    .line 372
    const v18, -0x414ccccd    # -0.35f

    .line 373
    .line 374
    .line 375
    const v14, -0x4119999a    # -0.45f

    .line 376
    .line 377
    .line 378
    const v15, -0x40f5c28f    # -0.54f

    .line 379
    .line 380
    .line 381
    const v16, -0x40d47ae1    # -0.67f

    .line 382
    .line 383
    .line 384
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 385
    .line 386
    .line 387
    const v0, -0x3fcd70a4    # -2.79f

    .line 388
    .line 389
    .line 390
    const v2, 0x40328f5c    # 2.79f

    .line 391
    .line 392
    .line 393
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 394
    .line 395
    .line 396
    const/16 v17, 0x0

    .line 397
    .line 398
    const v18, 0x3f35c28f    # 0.71f

    .line 399
    .line 400
    .line 401
    const v13, -0x41b33333    # -0.2f

    .line 402
    .line 403
    .line 404
    const v14, 0x3e4ccccd    # 0.2f

    .line 405
    .line 406
    .line 407
    const v15, -0x41b33333    # -0.2f

    .line 408
    .line 409
    .line 410
    const v16, 0x3f028f5c    # 0.51f

    .line 411
    .line 412
    .line 413
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 414
    .line 415
    .line 416
    const v0, 0x40328f5c    # 2.79f

    .line 417
    .line 418
    .line 419
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 420
    .line 421
    .line 422
    const/high16 v17, 0x40e00000    # 7.0f

    .line 423
    .line 424
    const v18, 0x419651ec    # 18.79f

    .line 425
    .line 426
    .line 427
    const v13, 0x40ceb852    # 6.46f

    .line 428
    .line 429
    .line 430
    const v14, 0x419bae14    # 19.46f

    .line 431
    .line 432
    .line 433
    const/high16 v15, 0x40e00000    # 7.0f

    .line 434
    .line 435
    const v16, 0x4199eb85    # 19.24f

    .line 436
    .line 437
    .line 438
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 439
    .line 440
    .line 441
    const/high16 v0, 0x41880000    # 17.0f

    .line 442
    .line 443
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 444
    .line 445
    .line 446
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 447
    .line 448
    .line 449
    const/high16 v0, 0x41600000    # 14.0f

    .line 450
    .line 451
    const/high16 v2, 0x41880000    # 17.0f

    .line 452
    .line 453
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 454
    .line 455
    .line 456
    const/high16 v17, 0x3f800000    # 1.0f

    .line 457
    .line 458
    const/high16 v18, -0x40800000    # -1.0f

    .line 459
    .line 460
    const v13, 0x3f0ccccd    # 0.55f

    .line 461
    .line 462
    .line 463
    const/4 v14, 0x0

    .line 464
    const/high16 v15, 0x3f800000    # 1.0f

    .line 465
    .line 466
    const v16, -0x4119999a    # -0.45f

    .line 467
    .line 468
    .line 469
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 470
    .line 471
    .line 472
    const/high16 v17, -0x40800000    # -1.0f

    .line 473
    .line 474
    const/4 v13, 0x0

    .line 475
    const v14, -0x40f33333    # -0.55f

    .line 476
    .line 477
    .line 478
    const v15, -0x4119999a    # -0.45f

    .line 479
    .line 480
    .line 481
    const/high16 v16, -0x40800000    # -1.0f

    .line 482
    .line 483
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 484
    .line 485
    .line 486
    const v0, 0x3ee66666    # 0.45f

    .line 487
    .line 488
    .line 489
    const/high16 v2, -0x40800000    # -1.0f

    .line 490
    .line 491
    const/high16 v4, 0x3f800000    # 1.0f

    .line 492
    .line 493
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 494
    .line 495
    .line 496
    const/high16 v17, 0x41600000    # 14.0f

    .line 497
    .line 498
    const/high16 v18, 0x41880000    # 17.0f

    .line 499
    .line 500
    const/high16 v13, 0x41500000    # 13.0f

    .line 501
    .line 502
    const v14, 0x41846666    # 16.55f

    .line 503
    .line 504
    .line 505
    const v15, 0x41573333    # 13.45f

    .line 506
    .line 507
    .line 508
    const/high16 v16, 0x41880000    # 17.0f

    .line 509
    .line 510
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 511
    .line 512
    .line 513
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 514
    .line 515
    .line 516
    const/high16 v0, 0x41900000    # 18.0f

    .line 517
    .line 518
    const/high16 v2, 0x41880000    # 17.0f

    .line 519
    .line 520
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 521
    .line 522
    .line 523
    const/high16 v17, 0x3f800000    # 1.0f

    .line 524
    .line 525
    const/high16 v18, -0x40800000    # -1.0f

    .line 526
    .line 527
    const v13, 0x3f0ccccd    # 0.55f

    .line 528
    .line 529
    .line 530
    const/4 v14, 0x0

    .line 531
    const/high16 v15, 0x3f800000    # 1.0f

    .line 532
    .line 533
    const v16, -0x4119999a    # -0.45f

    .line 534
    .line 535
    .line 536
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 537
    .line 538
    .line 539
    const/high16 v17, -0x40800000    # -1.0f

    .line 540
    .line 541
    const/4 v13, 0x0

    .line 542
    const v14, -0x40f33333    # -0.55f

    .line 543
    .line 544
    .line 545
    const v15, -0x4119999a    # -0.45f

    .line 546
    .line 547
    .line 548
    const/high16 v16, -0x40800000    # -1.0f

    .line 549
    .line 550
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 551
    .line 552
    .line 553
    const v0, 0x3ee66666    # 0.45f

    .line 554
    .line 555
    .line 556
    const/high16 v2, -0x40800000    # -1.0f

    .line 557
    .line 558
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 559
    .line 560
    .line 561
    const/high16 v17, 0x41900000    # 18.0f

    .line 562
    .line 563
    const/high16 v18, 0x41880000    # 17.0f

    .line 564
    .line 565
    const/high16 v13, 0x41880000    # 17.0f

    .line 566
    .line 567
    const v14, 0x41846666    # 16.55f

    .line 568
    .line 569
    .line 570
    const v15, 0x418b999a    # 17.45f

    .line 571
    .line 572
    .line 573
    const/high16 v16, 0x41880000    # 17.0f

    .line 574
    .line 575
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 576
    .line 577
    .line 578
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 579
    .line 580
    .line 581
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 582
    .line 583
    .line 584
    move-result-object v2

    .line 585
    const/16 v16, 0x3800

    .line 586
    .line 587
    const/16 v17, 0x0

    .line 588
    .line 589
    const/high16 v6, 0x3f800000    # 1.0f

    .line 590
    .line 591
    const/high16 v8, 0x3f800000    # 1.0f

    .line 592
    .line 593
    const/4 v7, 0x0

    .line 594
    const/high16 v9, 0x3f800000    # 1.0f

    .line 595
    .line 596
    const/high16 v12, 0x3f800000    # 1.0f

    .line 597
    .line 598
    const/4 v13, 0x0

    .line 599
    const/4 v14, 0x0

    .line 600
    const/4 v15, 0x0

    .line 601
    const-string v4, ""

    .line 602
    .line 603
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 604
    .line 605
    .line 606
    move-result-object v0

    .line 607
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 608
    .line 609
    .line 610
    move-result-object v0

    .line 611
    sput-object v0, Landroidx/compose/material/icons/rounded/MultipleStopKt;->_multipleStop:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 612
    .line 613
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 614
    .line 615
    .line 616
    return-object v0
.end method
