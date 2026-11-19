.class public final Landroidx/compose/material/icons/rounded/DryCleaningKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_dryCleaning",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "DryCleaning",
        "Landroidx/compose/material/icons/Icons$Rounded;",
        "getDryCleaning",
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
        "SMAP\nDryCleaning.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DryCleaning.kt\nandroidx/compose/material/icons/rounded/DryCleaningKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,76:1\n212#2,12:77\n233#2,18:90\n253#2:127\n174#3:89\n705#4,2:108\n717#4,2:110\n719#4,11:116\n72#5,4:112\n*S KotlinDebug\n*F\n+ 1 DryCleaning.kt\nandroidx/compose/material/icons/rounded/DryCleaningKt\n*L\n29#1:77,12\n30#1:90,18\n30#1:127\n29#1:89\n30#1:108,2\n30#1:110,2\n30#1:116,11\n30#1:112,4\n*E\n"
    }
.end annotation


# static fields
.field private static _dryCleaning:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getDryCleaning(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/DryCleaningKt;->_dryCleaning:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.DryCleaning"

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
    const v0, 0x419c7ae1    # 19.56f

    .line 71
    .line 72
    .line 73
    const v2, 0x4135c28f    # 11.36f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const/high16 v0, 0x41500000    # 13.0f

    .line 80
    .line 81
    const v2, 0x41070a3d    # 8.44f

    .line 82
    .line 83
    .line 84
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 85
    .line 86
    .line 87
    const/high16 v0, 0x40e00000    # 7.0f

    .line 88
    .line 89
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 90
    .line 91
    .line 92
    const/high16 v17, -0x40800000    # -1.0f

    .line 93
    .line 94
    const/high16 v18, -0x40800000    # -1.0f

    .line 95
    .line 96
    const/4 v13, 0x0

    .line 97
    const v14, -0x40f33333    # -0.55f

    .line 98
    .line 99
    .line 100
    const v15, -0x4119999a    # -0.45f

    .line 101
    .line 102
    .line 103
    const/high16 v16, -0x40800000    # -1.0f

    .line 104
    .line 105
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 106
    .line 107
    .line 108
    const v0, -0x4119999a    # -0.45f

    .line 109
    .line 110
    .line 111
    const/high16 v2, -0x40800000    # -1.0f

    .line 112
    .line 113
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 114
    .line 115
    .line 116
    const v0, 0x3ee66666    # 0.45f

    .line 117
    .line 118
    .line 119
    const/high16 v2, 0x3f800000    # 1.0f

    .line 120
    .line 121
    const/high16 v4, -0x40800000    # -1.0f

    .line 122
    .line 123
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 124
    .line 125
    .line 126
    const v17, 0x3f6147ae    # 0.88f

    .line 127
    .line 128
    .line 129
    const v18, 0x3f07ae14    # 0.53f

    .line 130
    .line 131
    .line 132
    const v13, 0x3ec28f5c    # 0.38f

    .line 133
    .line 134
    .line 135
    const/4 v14, 0x0

    .line 136
    const v15, 0x3f3851ec    # 0.72f

    .line 137
    .line 138
    .line 139
    const v16, 0x3e6147ae    # 0.22f

    .line 140
    .line 141
    .line 142
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 143
    .line 144
    .line 145
    const v17, 0x415bae14    # 13.73f

    .line 146
    .line 147
    .line 148
    const/high16 v18, 0x40a00000    # 5.0f

    .line 149
    .line 150
    const v13, 0x4150a3d7    # 13.04f

    .line 151
    .line 152
    .line 153
    const v14, 0x409ae148    # 4.84f

    .line 154
    .line 155
    .line 156
    const v15, 0x41563d71    # 13.39f

    .line 157
    .line 158
    .line 159
    const/high16 v16, 0x40a00000    # 5.0f

    .line 160
    .line 161
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 162
    .line 163
    .line 164
    const v17, 0x3f68f5c3    # 0.91f

    .line 165
    .line 166
    .line 167
    const v18, -0x4047ae14    # -1.44f

    .line 168
    .line 169
    .line 170
    const v13, 0x3f3d70a4    # 0.74f

    .line 171
    .line 172
    .line 173
    const/4 v14, 0x0

    .line 174
    const v15, 0x3fa147ae    # 1.26f

    .line 175
    .line 176
    .line 177
    const v16, -0x40b5c28f    # -0.79f

    .line 178
    .line 179
    .line 180
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 181
    .line 182
    .line 183
    const v17, -0x3fb0a3d7    # -3.24f

    .line 184
    .line 185
    .line 186
    const v18, -0x403eb852    # -1.51f

    .line 187
    .line 188
    .line 189
    const v13, -0x40e66666    # -0.6f

    .line 190
    .line 191
    .line 192
    const v14, -0x40733333    # -1.1f

    .line 193
    .line 194
    .line 195
    const v15, -0x4011eb85    # -1.86f

    .line 196
    .line 197
    .line 198
    const v16, -0x401c28f6    # -1.78f

    .line 199
    .line 200
    .line 201
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 202
    .line 203
    .line 204
    const v17, -0x3fea3d71    # -2.34f

    .line 205
    .line 206
    .line 207
    const v18, 0x4017ae14    # 2.37f

    .line 208
    .line 209
    .line 210
    const v13, -0x406a3d71    # -1.17f

    .line 211
    .line 212
    .line 213
    const v14, 0x3e6b851f    # 0.23f

    .line 214
    .line 215
    .line 216
    const v15, -0x3ff851ec    # -2.12f

    .line 217
    .line 218
    .line 219
    const v16, 0x3f99999a    # 1.2f

    .line 220
    .line 221
    .line 222
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 223
    .line 224
    .line 225
    const/high16 v17, 0x41300000    # 11.0f

    .line 226
    .line 227
    const v18, 0x40fa3d71    # 7.82f

    .line 228
    .line 229
    .line 230
    const v13, 0x410c51ec    # 8.77f

    .line 231
    .line 232
    .line 233
    const v14, 0x40bf5c29    # 5.98f

    .line 234
    .line 235
    .line 236
    const v15, 0x411ab852    # 9.67f

    .line 237
    .line 238
    .line 239
    const v16, 0x40eb3333    # 7.35f

    .line 240
    .line 241
    .line 242
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 243
    .line 244
    .line 245
    const v0, 0x3f2147ae    # 0.63f

    .line 246
    .line 247
    .line 248
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 249
    .line 250
    .line 251
    const v0, -0x3f2e147b    # -6.56f

    .line 252
    .line 253
    .line 254
    const v2, 0x403ae148    # 2.92f

    .line 255
    .line 256
    .line 257
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 258
    .line 259
    .line 260
    const/high16 v17, 0x40400000    # 3.0f

    .line 261
    .line 262
    const v18, 0x41591eb8    # 13.57f

    .line 263
    .line 264
    .line 265
    const v13, 0x4063d70a    # 3.56f

    .line 266
    .line 267
    .line 268
    const/high16 v14, 0x413c0000    # 11.75f

    .line 269
    .line 270
    const/high16 v15, 0x40400000    # 3.0f

    .line 271
    .line 272
    const v16, 0x4149eb85    # 12.62f

    .line 273
    .line 274
    .line 275
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 276
    .line 277
    .line 278
    const v0, 0x3c23d70a    # 0.01f

    .line 279
    .line 280
    .line 281
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 282
    .line 283
    .line 284
    const v17, 0x40ad70a4    # 5.42f

    .line 285
    .line 286
    .line 287
    const/high16 v18, 0x41800000    # 16.0f

    .line 288
    .line 289
    const/high16 v13, 0x40400000    # 3.0f

    .line 290
    .line 291
    const v14, 0x416eb852    # 14.92f

    .line 292
    .line 293
    .line 294
    const v15, 0x40828f5c    # 4.08f

    .line 295
    .line 296
    .line 297
    const/high16 v16, 0x41800000    # 16.0f

    .line 298
    .line 299
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 300
    .line 301
    .line 302
    const/high16 v0, 0x40e00000    # 7.0f

    .line 303
    .line 304
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 305
    .line 306
    .line 307
    const/high16 v0, 0x40800000    # 4.0f

    .line 308
    .line 309
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 310
    .line 311
    .line 312
    const/high16 v17, 0x40000000    # 2.0f

    .line 313
    .line 314
    const/high16 v18, 0x40000000    # 2.0f

    .line 315
    .line 316
    const/4 v13, 0x0

    .line 317
    const v14, 0x3f8ccccd    # 1.1f

    .line 318
    .line 319
    .line 320
    const v15, 0x3f666666    # 0.9f

    .line 321
    .line 322
    .line 323
    const/high16 v16, 0x40000000    # 2.0f

    .line 324
    .line 325
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 326
    .line 327
    .line 328
    const/high16 v0, 0x40c00000    # 6.0f

    .line 329
    .line 330
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 331
    .line 332
    .line 333
    const/high16 v18, -0x40000000    # -2.0f

    .line 334
    .line 335
    const v13, 0x3f8ccccd    # 1.1f

    .line 336
    .line 337
    .line 338
    const/4 v14, 0x0

    .line 339
    const/high16 v15, 0x40000000    # 2.0f

    .line 340
    .line 341
    const v16, -0x4099999a    # -0.9f

    .line 342
    .line 343
    .line 344
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 345
    .line 346
    .line 347
    const/high16 v0, -0x3f800000    # -4.0f

    .line 348
    .line 349
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 350
    .line 351
    .line 352
    const v0, 0x3fca3d71    # 1.58f

    .line 353
    .line 354
    .line 355
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 356
    .line 357
    .line 358
    const v17, 0x401ae148    # 2.42f

    .line 359
    .line 360
    .line 361
    const v18, -0x3fe51eb8    # -2.42f

    .line 362
    .line 363
    .line 364
    const v13, 0x3fab851f    # 1.34f

    .line 365
    .line 366
    .line 367
    const v15, 0x401ae148    # 2.42f

    .line 368
    .line 369
    .line 370
    const v16, -0x4075c28f    # -1.08f

    .line 371
    .line 372
    .line 373
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 374
    .line 375
    .line 376
    const v0, -0x43dc28f6    # -0.01f

    .line 377
    .line 378
    .line 379
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 380
    .line 381
    .line 382
    const v17, 0x419c7ae1    # 19.56f

    .line 383
    .line 384
    .line 385
    const v18, 0x4135c28f    # 11.36f

    .line 386
    .line 387
    .line 388
    const/high16 v13, 0x41a80000    # 21.0f

    .line 389
    .line 390
    const v14, 0x4149eb85    # 12.62f

    .line 391
    .line 392
    .line 393
    const v15, 0x41a3851f    # 20.44f

    .line 394
    .line 395
    .line 396
    const/high16 v16, 0x413c0000    # 11.75f

    .line 397
    .line 398
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 399
    .line 400
    .line 401
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 402
    .line 403
    .line 404
    const v0, 0x4194a3d7    # 18.58f

    .line 405
    .line 406
    .line 407
    const/high16 v2, 0x41600000    # 14.0f

    .line 408
    .line 409
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 410
    .line 411
    .line 412
    const v0, -0x4011eb85    # -1.86f

    .line 413
    .line 414
    .line 415
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 416
    .line 417
    .line 418
    const v17, -0x4023d70a    # -1.72f

    .line 419
    .line 420
    .line 421
    const/high16 v18, -0x40800000    # -1.0f

    .line 422
    .line 423
    const v13, -0x414ccccd    # -0.35f

    .line 424
    .line 425
    .line 426
    const v14, -0x40e66666    # -0.6f

    .line 427
    .line 428
    .line 429
    const v15, -0x40851eb8    # -0.98f

    .line 430
    .line 431
    .line 432
    const/high16 v16, -0x40800000    # -1.0f

    .line 433
    .line 434
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 435
    .line 436
    .line 437
    const/high16 v0, 0x41100000    # 9.0f

    .line 438
    .line 439
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 440
    .line 441
    .line 442
    const/high16 v18, 0x3f800000    # 1.0f

    .line 443
    .line 444
    const v13, -0x40c28f5c    # -0.74f

    .line 445
    .line 446
    .line 447
    const/4 v14, 0x0

    .line 448
    const v15, -0x404f5c29    # -1.38f

    .line 449
    .line 450
    .line 451
    const v16, 0x3ecccccd    # 0.4f

    .line 452
    .line 453
    .line 454
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 455
    .line 456
    .line 457
    const v0, 0x40ad70a4    # 5.42f

    .line 458
    .line 459
    .line 460
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 461
    .line 462
    .line 463
    const v17, -0x41d1eb85    # -0.17f

    .line 464
    .line 465
    .line 466
    const v18, -0x40b0a3d7    # -0.81f

    .line 467
    .line 468
    .line 469
    const v13, -0x41147ae1    # -0.46f

    .line 470
    .line 471
    .line 472
    const v15, -0x40eb851f    # -0.58f

    .line 473
    .line 474
    .line 475
    const v16, -0x40d9999a    # -0.65f

    .line 476
    .line 477
    .line 478
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 479
    .line 480
    .line 481
    const/high16 v0, -0x3fc00000    # -3.0f

    .line 482
    .line 483
    const/high16 v2, 0x40d80000    # 6.75f

    .line 484
    .line 485
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 486
    .line 487
    .line 488
    const/high16 v0, 0x40400000    # 3.0f

    .line 489
    .line 490
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 491
    .line 492
    .line 493
    const v17, 0x4194a3d7    # 18.58f

    .line 494
    .line 495
    .line 496
    const/high16 v18, 0x41600000    # 14.0f

    .line 497
    .line 498
    const v13, 0x41995c29    # 19.17f

    .line 499
    .line 500
    .line 501
    const v14, 0x4156147b    # 13.38f

    .line 502
    .line 503
    .line 504
    const v15, 0x41983d71    # 19.03f

    .line 505
    .line 506
    .line 507
    const/high16 v16, 0x41600000    # 14.0f

    .line 508
    .line 509
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 510
    .line 511
    .line 512
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 513
    .line 514
    .line 515
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 516
    .line 517
    .line 518
    move-result-object v2

    .line 519
    const/16 v16, 0x3800

    .line 520
    .line 521
    const/16 v17, 0x0

    .line 522
    .line 523
    const/high16 v6, 0x3f800000    # 1.0f

    .line 524
    .line 525
    const/high16 v8, 0x3f800000    # 1.0f

    .line 526
    .line 527
    const/4 v7, 0x0

    .line 528
    const/high16 v9, 0x3f800000    # 1.0f

    .line 529
    .line 530
    const/high16 v12, 0x3f800000    # 1.0f

    .line 531
    .line 532
    const/4 v13, 0x0

    .line 533
    const/4 v14, 0x0

    .line 534
    const/4 v15, 0x0

    .line 535
    const-string v4, ""

    .line 536
    .line 537
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 538
    .line 539
    .line 540
    move-result-object v0

    .line 541
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 542
    .line 543
    .line 544
    move-result-object v0

    .line 545
    sput-object v0, Landroidx/compose/material/icons/rounded/DryCleaningKt;->_dryCleaning:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 546
    .line 547
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 548
    .line 549
    .line 550
    return-object v0
.end method
