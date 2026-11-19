.class public final Landroidx/compose/material/icons/twotone/TrackChangesKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_trackChanges",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "TrackChanges",
        "Landroidx/compose/material/icons/Icons$TwoTone;",
        "getTrackChanges",
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
        "SMAP\nTrackChanges.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TrackChanges.kt\nandroidx/compose/material/icons/twotone/TrackChangesKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,65:1\n212#2,12:66\n233#2,18:79\n253#2:116\n174#3:78\n705#4,2:97\n717#4,2:99\n719#4,11:105\n72#5,4:101\n*S KotlinDebug\n*F\n+ 1 TrackChanges.kt\nandroidx/compose/material/icons/twotone/TrackChangesKt\n*L\n29#1:66,12\n30#1:79,18\n30#1:116\n29#1:78\n30#1:97,2\n30#1:99,2\n30#1:105,11\n30#1:101,4\n*E\n"
    }
.end annotation


# static fields
.field private static _trackChanges:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getTrackChanges(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/TrackChangesKt;->_trackChanges:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.TrackChanges"

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
    const v0, 0x41988f5c    # 19.07f

    .line 71
    .line 72
    .line 73
    const v2, 0x409dc28f    # 4.93f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v0, 0x3fb47ae1    # 1.41f

    .line 80
    .line 81
    .line 82
    const v2, -0x404b851f    # -1.41f

    .line 83
    .line 84
    .line 85
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 86
    .line 87
    .line 88
    const/high16 v17, 0x41a00000    # 20.0f

    .line 89
    .line 90
    const/high16 v18, 0x41400000    # 12.0f

    .line 91
    .line 92
    const v13, 0x4198cccd    # 19.1f

    .line 93
    .line 94
    .line 95
    const v14, 0x40f947ae    # 7.79f

    .line 96
    .line 97
    .line 98
    const/high16 v15, 0x41a00000    # 20.0f

    .line 99
    .line 100
    const v16, 0x411ca3d7    # 9.79f

    .line 101
    .line 102
    .line 103
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 104
    .line 105
    .line 106
    const/high16 v17, -0x3f000000    # -8.0f

    .line 107
    .line 108
    const/high16 v18, 0x41000000    # 8.0f

    .line 109
    .line 110
    const/4 v13, 0x0

    .line 111
    const v14, 0x408d70a4    # 4.42f

    .line 112
    .line 113
    .line 114
    const v15, -0x3f9ae148    # -3.58f

    .line 115
    .line 116
    .line 117
    const/high16 v16, 0x41000000    # 8.0f

    .line 118
    .line 119
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 120
    .line 121
    .line 122
    const v0, -0x3f9ae148    # -3.58f

    .line 123
    .line 124
    .line 125
    const/high16 v2, -0x3f000000    # -8.0f

    .line 126
    .line 127
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 128
    .line 129
    .line 130
    const/high16 v17, 0x40e00000    # 7.0f

    .line 131
    .line 132
    const v18, -0x3f023d71    # -7.93f

    .line 133
    .line 134
    .line 135
    const v14, -0x3f7d70a4    # -4.08f

    .line 136
    .line 137
    .line 138
    const v15, 0x40433333    # 3.05f

    .line 139
    .line 140
    .line 141
    const v16, -0x3f11eb85    # -7.44f

    .line 142
    .line 143
    .line 144
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 145
    .line 146
    .line 147
    const v0, 0x400147ae    # 2.02f

    .line 148
    .line 149
    .line 150
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 151
    .line 152
    .line 153
    const/high16 v17, 0x40c00000    # 6.0f

    .line 154
    .line 155
    const/high16 v18, 0x41400000    # 12.0f

    .line 156
    .line 157
    const v13, 0x41028f5c    # 8.16f

    .line 158
    .line 159
    .line 160
    const v14, 0x40d23d71    # 6.57f

    .line 161
    .line 162
    .line 163
    const/high16 v15, 0x40c00000    # 6.0f

    .line 164
    .line 165
    const v16, 0x41107ae1    # 9.03f

    .line 166
    .line 167
    .line 168
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 169
    .line 170
    .line 171
    const/high16 v18, 0x40c00000    # 6.0f

    .line 172
    .line 173
    const/4 v13, 0x0

    .line 174
    const v14, 0x4053d70a    # 3.31f

    .line 175
    .line 176
    .line 177
    const v15, 0x402c28f6    # 2.69f

    .line 178
    .line 179
    .line 180
    const/high16 v16, 0x40c00000    # 6.0f

    .line 181
    .line 182
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 183
    .line 184
    .line 185
    const v0, -0x3fd3d70a    # -2.69f

    .line 186
    .line 187
    .line 188
    const/high16 v2, -0x3f400000    # -6.0f

    .line 189
    .line 190
    const/high16 v4, 0x40c00000    # 6.0f

    .line 191
    .line 192
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 193
    .line 194
    .line 195
    const v17, -0x401eb852    # -1.76f

    .line 196
    .line 197
    .line 198
    const v18, -0x3f7851ec    # -4.24f

    .line 199
    .line 200
    .line 201
    const v14, -0x402b851f    # -1.66f

    .line 202
    .line 203
    .line 204
    const v15, -0x40d47ae1    # -0.67f

    .line 205
    .line 206
    .line 207
    const v16, -0x3fb5c28f    # -3.16f

    .line 208
    .line 209
    .line 210
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 211
    .line 212
    .line 213
    const v0, 0x3fb47ae1    # 1.41f

    .line 214
    .line 215
    .line 216
    const v2, -0x404b851f    # -1.41f

    .line 217
    .line 218
    .line 219
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 220
    .line 221
    .line 222
    const/high16 v17, 0x41800000    # 16.0f

    .line 223
    .line 224
    const/high16 v18, 0x41400000    # 12.0f

    .line 225
    .line 226
    const v13, 0x4178cccd    # 15.55f

    .line 227
    .line 228
    .line 229
    const v14, 0x411e6666    # 9.9f

    .line 230
    .line 231
    .line 232
    const/high16 v15, 0x41800000    # 16.0f

    .line 233
    .line 234
    const v16, 0x412e6666    # 10.9f

    .line 235
    .line 236
    .line 237
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 238
    .line 239
    .line 240
    const/high16 v17, -0x3f800000    # -4.0f

    .line 241
    .line 242
    const/high16 v18, 0x40800000    # 4.0f

    .line 243
    .line 244
    const/4 v13, 0x0

    .line 245
    const v14, 0x400d70a4    # 2.21f

    .line 246
    .line 247
    .line 248
    const v15, -0x401ae148    # -1.79f

    .line 249
    .line 250
    .line 251
    const/high16 v16, 0x40800000    # 4.0f

    .line 252
    .line 253
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 254
    .line 255
    .line 256
    const v0, -0x401ae148    # -1.79f

    .line 257
    .line 258
    .line 259
    const/high16 v2, -0x3f800000    # -4.0f

    .line 260
    .line 261
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 262
    .line 263
    .line 264
    const/high16 v17, 0x40400000    # 3.0f

    .line 265
    .line 266
    const v18, -0x3f88f5c3    # -3.86f

    .line 267
    .line 268
    .line 269
    const v14, -0x4011eb85    # -1.86f

    .line 270
    .line 271
    .line 272
    const v15, 0x3fa3d70a    # 1.28f

    .line 273
    .line 274
    .line 275
    const v16, -0x3fa5c28f    # -3.41f

    .line 276
    .line 277
    .line 278
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 279
    .line 280
    .line 281
    const v0, 0x4008f5c3    # 2.14f

    .line 282
    .line 283
    .line 284
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 285
    .line 286
    .line 287
    const/high16 v17, -0x40800000    # -1.0f

    .line 288
    .line 289
    const v18, 0x3fdc28f6    # 1.72f

    .line 290
    .line 291
    .line 292
    const v13, -0x40e66666    # -0.6f

    .line 293
    .line 294
    .line 295
    const v14, 0x3eb33333    # 0.35f

    .line 296
    .line 297
    .line 298
    const/high16 v15, -0x40800000    # -1.0f

    .line 299
    .line 300
    const v16, 0x3f7ae148    # 0.98f

    .line 301
    .line 302
    .line 303
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 304
    .line 305
    .line 306
    const/high16 v17, 0x40000000    # 2.0f

    .line 307
    .line 308
    const/high16 v18, 0x40000000    # 2.0f

    .line 309
    .line 310
    const/4 v13, 0x0

    .line 311
    const v14, 0x3f8ccccd    # 1.1f

    .line 312
    .line 313
    .line 314
    const v15, 0x3f666666    # 0.9f

    .line 315
    .line 316
    .line 317
    const/high16 v16, 0x40000000    # 2.0f

    .line 318
    .line 319
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 320
    .line 321
    .line 322
    const v0, -0x4099999a    # -0.9f

    .line 323
    .line 324
    .line 325
    const/high16 v2, -0x40000000    # -2.0f

    .line 326
    .line 327
    const/high16 v4, 0x40000000    # 2.0f

    .line 328
    .line 329
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 330
    .line 331
    .line 332
    const/high16 v17, -0x40800000    # -1.0f

    .line 333
    .line 334
    const v18, -0x4023d70a    # -1.72f

    .line 335
    .line 336
    .line 337
    const v14, -0x40c28f5c    # -0.74f

    .line 338
    .line 339
    .line 340
    const v15, -0x41333333    # -0.4f

    .line 341
    .line 342
    .line 343
    const v16, -0x404f5c29    # -1.38f

    .line 344
    .line 345
    .line 346
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 347
    .line 348
    .line 349
    const/high16 v0, 0x40000000    # 2.0f

    .line 350
    .line 351
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 352
    .line 353
    .line 354
    const/high16 v0, -0x40800000    # -1.0f

    .line 355
    .line 356
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 357
    .line 358
    .line 359
    const/high16 v17, 0x40000000    # 2.0f

    .line 360
    .line 361
    const/high16 v18, 0x41400000    # 12.0f

    .line 362
    .line 363
    const v13, 0x40cf5c29    # 6.48f

    .line 364
    .line 365
    .line 366
    const/high16 v14, 0x40000000    # 2.0f

    .line 367
    .line 368
    const/high16 v15, 0x40000000    # 2.0f

    .line 369
    .line 370
    const v16, 0x40cf5c29    # 6.48f

    .line 371
    .line 372
    .line 373
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 374
    .line 375
    .line 376
    const v0, 0x408f5c29    # 4.48f

    .line 377
    .line 378
    .line 379
    const/high16 v2, 0x41200000    # 10.0f

    .line 380
    .line 381
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 382
    .line 383
    .line 384
    const v0, -0x3f70a3d7    # -4.48f

    .line 385
    .line 386
    .line 387
    const/high16 v2, -0x3ee00000    # -10.0f

    .line 388
    .line 389
    const/high16 v4, 0x41200000    # 10.0f

    .line 390
    .line 391
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 392
    .line 393
    .line 394
    const v17, -0x3fc47ae1    # -2.93f

    .line 395
    .line 396
    .line 397
    const v18, -0x3f1dc28f    # -7.07f

    .line 398
    .line 399
    .line 400
    const/4 v13, 0x0

    .line 401
    const v14, -0x3fcf5c29    # -2.76f

    .line 402
    .line 403
    .line 404
    const v15, -0x4070a3d7    # -1.12f

    .line 405
    .line 406
    .line 407
    const v16, -0x3f57ae14    # -5.26f

    .line 408
    .line 409
    .line 410
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 411
    .line 412
    .line 413
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 414
    .line 415
    .line 416
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 417
    .line 418
    .line 419
    move-result-object v2

    .line 420
    const/16 v16, 0x3800

    .line 421
    .line 422
    const/16 v17, 0x0

    .line 423
    .line 424
    const/high16 v6, 0x3f800000    # 1.0f

    .line 425
    .line 426
    const/high16 v8, 0x3f800000    # 1.0f

    .line 427
    .line 428
    const/4 v7, 0x0

    .line 429
    const/high16 v9, 0x3f800000    # 1.0f

    .line 430
    .line 431
    const/high16 v12, 0x3f800000    # 1.0f

    .line 432
    .line 433
    const/4 v14, 0x0

    .line 434
    const/4 v15, 0x0

    .line 435
    const-string v4, ""

    .line 436
    .line 437
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 438
    .line 439
    .line 440
    move-result-object v0

    .line 441
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 442
    .line 443
    .line 444
    move-result-object v0

    .line 445
    sput-object v0, Landroidx/compose/material/icons/twotone/TrackChangesKt;->_trackChanges:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 446
    .line 447
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 448
    .line 449
    .line 450
    return-object v0
.end method
