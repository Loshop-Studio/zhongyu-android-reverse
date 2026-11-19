.class public final Landroidx/compose/material/icons/twotone/ParaglidingKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_paragliding",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "Paragliding",
        "Landroidx/compose/material/icons/Icons$TwoTone;",
        "getParagliding",
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
        "SMAP\nParagliding.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Paragliding.kt\nandroidx/compose/material/icons/twotone/ParaglidingKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,104:1\n212#2,12:105\n233#2,18:118\n253#2:155\n233#2,18:156\n253#2:193\n174#3:117\n705#4,2:136\n717#4,2:138\n719#4,11:144\n705#4,2:174\n717#4,2:176\n719#4,11:182\n72#5,4:140\n72#5,4:178\n*S KotlinDebug\n*F\n+ 1 Paragliding.kt\nandroidx/compose/material/icons/twotone/ParaglidingKt\n*L\n29#1:105,12\n30#1:118,18\n30#1:155\n40#1:156,18\n40#1:193\n29#1:117\n30#1:136,2\n30#1:138,2\n30#1:144,11\n40#1:174,2\n40#1:176,2\n40#1:182,11\n30#1:140,4\n40#1:178,4\n*E\n"
    }
.end annotation


# static fields
.field private static _paragliding:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getParagliding(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/ParaglidingKt;->_paragliding:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.Paragliding"

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
    const/high16 v4, 0x41a80000    # 21.0f

    .line 71
    .line 72
    const v6, 0x4089eb85    # 4.31f

    .line 73
    .line 74
    .line 75
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    const/high16 v25, 0x41400000    # 12.0f

    .line 79
    .line 80
    const/high16 v26, 0x40000000    # 2.0f

    .line 81
    .line 82
    const v21, 0x41a53333    # 20.65f

    .line 83
    .line 84
    .line 85
    const v22, 0x406851ec    # 3.63f

    .line 86
    .line 87
    .line 88
    const v23, 0x418c8f5c    # 17.57f

    .line 89
    .line 90
    .line 91
    const/high16 v24, 0x40000000    # 2.0f

    .line 92
    .line 93
    move-object/from16 v20, v2

    .line 94
    .line 95
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 96
    .line 97
    .line 98
    const v4, 0x406851ec    # 3.63f

    .line 99
    .line 100
    .line 101
    const v6, 0x40566666    # 3.35f

    .line 102
    .line 103
    .line 104
    const/high16 v7, 0x40400000    # 3.0f

    .line 105
    .line 106
    const v8, 0x4089eb85    # 4.31f

    .line 107
    .line 108
    .line 109
    invoke-virtual {v2, v6, v4, v7, v8}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 110
    .line 111
    .line 112
    const v4, 0x3fe28f5c    # 1.77f

    .line 113
    .line 114
    .line 115
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 116
    .line 117
    .line 118
    const/high16 v26, 0x40900000    # 4.5f

    .line 119
    .line 120
    const v21, 0x40aae148    # 5.34f

    .line 121
    .line 122
    .line 123
    const v22, 0x40a23d71    # 5.07f

    .line 124
    .line 125
    .line 126
    const v23, 0x4108f5c3    # 8.56f

    .line 127
    .line 128
    .line 129
    const/high16 v24, 0x40900000    # 4.5f

    .line 130
    .line 131
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 132
    .line 133
    .line 134
    const v4, 0x3fca3d71    # 1.58f

    .line 135
    .line 136
    .line 137
    const/high16 v6, 0x41100000    # 9.0f

    .line 138
    .line 139
    const v7, 0x3f11eb85    # 0.57f

    .line 140
    .line 141
    .line 142
    const v8, 0x40d51eb8    # 6.66f

    .line 143
    .line 144
    .line 145
    invoke-virtual {v2, v8, v7, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 146
    .line 147
    .line 148
    const v4, 0x4089eb85    # 4.31f

    .line 149
    .line 150
    .line 151
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 152
    .line 153
    .line 154
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 155
    .line 156
    .line 157
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 158
    .line 159
    .line 160
    move-result-object v2

    .line 161
    const/16 v16, 0x3800

    .line 162
    .line 163
    const/16 v17, 0x0

    .line 164
    .line 165
    const v6, 0x3e99999a    # 0.3f

    .line 166
    .line 167
    .line 168
    const v8, 0x3e99999a    # 0.3f

    .line 169
    .line 170
    .line 171
    const/4 v7, 0x0

    .line 172
    const/high16 v9, 0x3f800000    # 1.0f

    .line 173
    .line 174
    const/high16 v12, 0x3f800000    # 1.0f

    .line 175
    .line 176
    const/4 v13, 0x0

    .line 177
    const/4 v14, 0x0

    .line 178
    const/4 v15, 0x0

    .line 179
    const-string v4, ""

    .line 180
    .line 181
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 182
    .line 183
    .line 184
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 185
    .line 186
    .line 187
    move-result v3

    .line 188
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 189
    .line 190
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 191
    .line 192
    .line 193
    move-result-wide v6

    .line 194
    const/4 v0, 0x0

    .line 195
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 196
    .line 197
    .line 198
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 199
    .line 200
    .line 201
    move-result v10

    .line 202
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 203
    .line 204
    .line 205
    move-result v11

    .line 206
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 207
    .line 208
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 209
    .line 210
    .line 211
    const/high16 v0, 0x41400000    # 12.0f

    .line 212
    .line 213
    const/high16 v2, 0x41880000    # 17.0f

    .line 214
    .line 215
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 216
    .line 217
    .line 218
    const/high16 v17, -0x40000000    # -2.0f

    .line 219
    .line 220
    const/high16 v18, -0x40000000    # -2.0f

    .line 221
    .line 222
    const v13, -0x40733333    # -1.1f

    .line 223
    .line 224
    .line 225
    const/high16 v15, -0x40000000    # -2.0f

    .line 226
    .line 227
    const v16, -0x4099999a    # -0.9f

    .line 228
    .line 229
    .line 230
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 231
    .line 232
    .line 233
    const/high16 v17, 0x40000000    # 2.0f

    .line 234
    .line 235
    const/4 v13, 0x0

    .line 236
    const v14, -0x40733333    # -1.1f

    .line 237
    .line 238
    .line 239
    const v15, 0x3f666666    # 0.9f

    .line 240
    .line 241
    .line 242
    const/high16 v16, -0x40000000    # -2.0f

    .line 243
    .line 244
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 245
    .line 246
    .line 247
    const v0, 0x3f666666    # 0.9f

    .line 248
    .line 249
    .line 250
    const/high16 v2, 0x40000000    # 2.0f

    .line 251
    .line 252
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 253
    .line 254
    .line 255
    const/high16 v17, 0x41400000    # 12.0f

    .line 256
    .line 257
    const/high16 v18, 0x41880000    # 17.0f

    .line 258
    .line 259
    const/high16 v13, 0x41600000    # 14.0f

    .line 260
    .line 261
    const v14, 0x4180cccd    # 16.1f

    .line 262
    .line 263
    .line 264
    const v15, 0x4151999a    # 13.1f

    .line 265
    .line 266
    .line 267
    const/high16 v16, 0x41880000    # 17.0f

    .line 268
    .line 269
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 270
    .line 271
    .line 272
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 273
    .line 274
    .line 275
    const v0, 0x4177ae14    # 15.48f

    .line 276
    .line 277
    .line 278
    const v2, 0x418f851f    # 17.94f

    .line 279
    .line 280
    .line 281
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 282
    .line 283
    .line 284
    const/high16 v18, 0x41980000    # 19.0f

    .line 285
    .line 286
    const v13, 0x416ae148    # 14.68f

    .line 287
    .line 288
    .line 289
    const v14, 0x419451ec    # 18.54f

    .line 290
    .line 291
    .line 292
    const/high16 v15, 0x41600000    # 14.0f

    .line 293
    .line 294
    const/high16 v16, 0x41980000    # 19.0f

    .line 295
    .line 296
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 297
    .line 298
    .line 299
    const v0, -0x3fa147ae    # -3.48f

    .line 300
    .line 301
    .line 302
    const v2, -0x407851ec    # -1.06f

    .line 303
    .line 304
    .line 305
    const v4, -0x3fd47ae1    # -2.68f

    .line 306
    .line 307
    .line 308
    const v6, -0x41147ae1    # -0.46f

    .line 309
    .line 310
    .line 311
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 312
    .line 313
    .line 314
    const/high16 v17, 0x40e00000    # 7.0f

    .line 315
    .line 316
    const/high16 v18, 0x41600000    # 14.0f

    .line 317
    .line 318
    const v13, 0x4100a3d7    # 8.04f

    .line 319
    .line 320
    .line 321
    const v14, 0x418c6666    # 17.55f

    .line 322
    .line 323
    .line 324
    const/high16 v15, 0x40e00000    # 7.0f

    .line 325
    .line 326
    const v16, 0x4186147b    # 16.76f

    .line 327
    .line 328
    .line 329
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 330
    .line 331
    .line 332
    const/high16 v0, 0x40a00000    # 5.0f

    .line 333
    .line 334
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 335
    .line 336
    .line 337
    const v17, 0x40133333    # 2.3f

    .line 338
    .line 339
    .line 340
    const/high16 v18, 0x40b00000    # 5.5f

    .line 341
    .line 342
    const/4 v13, 0x0

    .line 343
    const v14, 0x402ccccd    # 2.7f

    .line 344
    .line 345
    .line 346
    const v15, 0x3f6e147b    # 0.93f

    .line 347
    .line 348
    .line 349
    const v16, 0x408d1eb8    # 4.41f

    .line 350
    .line 351
    .line 352
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 353
    .line 354
    .line 355
    const v17, 0x3fd9999a    # 1.7f

    .line 356
    .line 357
    .line 358
    const v18, 0x3f666666    # 0.9f

    .line 359
    .line 360
    .line 361
    const/high16 v13, 0x3f000000    # 0.5f

    .line 362
    .line 363
    const v14, 0x3ecccccd    # 0.4f

    .line 364
    .line 365
    .line 366
    const v15, 0x3f8ccccd    # 1.1f

    .line 367
    .line 368
    .line 369
    const v16, 0x3f333333    # 0.7f

    .line 370
    .line 371
    .line 372
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 373
    .line 374
    .line 375
    const/high16 v0, 0x41c00000    # 24.0f

    .line 376
    .line 377
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 378
    .line 379
    .line 380
    const/high16 v0, 0x40c00000    # 6.0f

    .line 381
    .line 382
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 383
    .line 384
    .line 385
    const v0, -0x3f99999a    # -3.6f

    .line 386
    .line 387
    .line 388
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 389
    .line 390
    .line 391
    const v18, -0x4099999a    # -0.9f

    .line 392
    .line 393
    .line 394
    const v13, 0x3f19999a    # 0.6f

    .line 395
    .line 396
    .line 397
    const v14, -0x41b33333    # -0.2f

    .line 398
    .line 399
    .line 400
    const v15, 0x3f99999a    # 1.2f

    .line 401
    .line 402
    .line 403
    const/high16 v16, -0x41000000    # -0.5f

    .line 404
    .line 405
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 406
    .line 407
    .line 408
    const v17, 0x40133333    # 2.3f

    .line 409
    .line 410
    .line 411
    const/high16 v18, -0x3f500000    # -5.5f

    .line 412
    .line 413
    const v13, 0x3faf5c29    # 1.37f

    .line 414
    .line 415
    .line 416
    const v14, -0x40747ae1    # -1.09f

    .line 417
    .line 418
    .line 419
    const v15, 0x40133333    # 2.3f

    .line 420
    .line 421
    .line 422
    const v16, -0x3fcccccd    # -2.8f

    .line 423
    .line 424
    .line 425
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 426
    .line 427
    .line 428
    const/high16 v0, -0x40000000    # -2.0f

    .line 429
    .line 430
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 431
    .line 432
    .line 433
    const v17, 0x4177ae14    # 15.48f

    .line 434
    .line 435
    .line 436
    const v18, 0x418f851f    # 17.94f

    .line 437
    .line 438
    .line 439
    const/high16 v13, 0x41880000    # 17.0f

    .line 440
    .line 441
    const v14, 0x4186147b    # 16.76f

    .line 442
    .line 443
    .line 444
    const v15, 0x417f5c29    # 15.96f

    .line 445
    .line 446
    .line 447
    const v16, 0x418c6666    # 17.55f

    .line 448
    .line 449
    .line 450
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 451
    .line 452
    .line 453
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 454
    .line 455
    .line 456
    const/high16 v0, 0x41b80000    # 23.0f

    .line 457
    .line 458
    const/high16 v2, 0x40880000    # 4.25f

    .line 459
    .line 460
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 461
    .line 462
    .line 463
    const v0, 0x405f5c29    # 3.49f

    .line 464
    .line 465
    .line 466
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 467
    .line 468
    .line 469
    const v17, -0x403851ec    # -1.56f

    .line 470
    .line 471
    .line 472
    const v18, 0x3f547ae1    # 0.83f

    .line 473
    .line 474
    .line 475
    const/4 v13, 0x0

    .line 476
    const v14, 0x3f4ccccd    # 0.8f

    .line 477
    .line 478
    .line 479
    const v15, -0x409eb852    # -0.88f

    .line 480
    .line 481
    .line 482
    const v16, 0x3fa147ae    # 1.26f

    .line 483
    .line 484
    .line 485
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 486
    .line 487
    .line 488
    const/high16 v17, 0x41a80000    # 21.0f

    .line 489
    .line 490
    const v18, 0x4104f5c3    # 8.31f

    .line 491
    .line 492
    .line 493
    const v13, 0x41aa6666    # 21.3f

    .line 494
    .line 495
    .line 496
    const v14, 0x4107ae14    # 8.48f

    .line 497
    .line 498
    .line 499
    const v15, 0x41a947ae    # 21.16f

    .line 500
    .line 501
    .line 502
    const v16, 0x41063d71    # 8.39f

    .line 503
    .line 504
    .line 505
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 506
    .line 507
    .line 508
    const/high16 v0, 0x41980000    # 19.0f

    .line 509
    .line 510
    const/high16 v2, 0x41500000    # 13.0f

    .line 511
    .line 512
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 513
    .line 514
    .line 515
    const/high16 v0, -0x40000000    # -2.0f

    .line 516
    .line 517
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 518
    .line 519
    .line 520
    const/high16 v0, -0x40400000    # -1.5f

    .line 521
    .line 522
    const v2, -0x3f370a3d    # -6.28f

    .line 523
    .line 524
    .line 525
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 526
    .line 527
    .line 528
    const/high16 v17, 0x41400000    # 12.0f

    .line 529
    .line 530
    const/high16 v18, 0x40d00000    # 6.5f

    .line 531
    .line 532
    const v13, 0x41666666    # 14.4f

    .line 533
    .line 534
    .line 535
    const v14, 0x40d28f5c    # 6.58f

    .line 536
    .line 537
    .line 538
    const v15, 0x4153851f    # 13.22f

    .line 539
    .line 540
    .line 541
    const/high16 v16, 0x40d00000    # 6.5f

    .line 542
    .line 543
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 544
    .line 545
    .line 546
    const/high16 v0, 0x41080000    # 8.5f

    .line 547
    .line 548
    const v2, 0x40d70a3d    # 6.72f

    .line 549
    .line 550
    .line 551
    const v4, 0x4119999a    # 9.6f

    .line 552
    .line 553
    .line 554
    const v6, 0x40d28f5c    # 6.58f

    .line 555
    .line 556
    .line 557
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 558
    .line 559
    .line 560
    const/high16 v0, 0x40e00000    # 7.0f

    .line 561
    .line 562
    const/high16 v2, 0x41500000    # 13.0f

    .line 563
    .line 564
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 565
    .line 566
    .line 567
    const/high16 v0, 0x40a00000    # 5.0f

    .line 568
    .line 569
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 570
    .line 571
    .line 572
    const v0, 0x4104f5c3    # 8.31f

    .line 573
    .line 574
    .line 575
    const/high16 v2, 0x40400000    # 3.0f

    .line 576
    .line 577
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 578
    .line 579
    .line 580
    const v17, 0x4023d70a    # 2.56f

    .line 581
    .line 582
    .line 583
    const v18, 0x41091eb8    # 8.57f

    .line 584
    .line 585
    .line 586
    const v13, 0x4035c28f    # 2.84f

    .line 587
    .line 588
    .line 589
    const v14, 0x41063d71    # 8.39f

    .line 590
    .line 591
    .line 592
    const v15, 0x402ccccd    # 2.7f

    .line 593
    .line 594
    .line 595
    const v16, 0x4107ae14    # 8.48f

    .line 596
    .line 597
    .line 598
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 599
    .line 600
    .line 601
    const/high16 v17, 0x3f800000    # 1.0f

    .line 602
    .line 603
    const v18, 0x40f7ae14    # 7.74f

    .line 604
    .line 605
    .line 606
    const v13, 0x3ff0a3d7    # 1.88f

    .line 607
    .line 608
    .line 609
    const/high16 v14, 0x41100000    # 9.0f

    .line 610
    .line 611
    const/high16 v15, 0x3f800000    # 1.0f

    .line 612
    .line 613
    const v16, 0x4108cccd    # 8.55f

    .line 614
    .line 615
    .line 616
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 617
    .line 618
    .line 619
    const/high16 v0, 0x40880000    # 4.25f

    .line 620
    .line 621
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 622
    .line 623
    .line 624
    const/high16 v17, 0x41400000    # 12.0f

    .line 625
    .line 626
    const/16 v18, 0x0

    .line 627
    .line 628
    const/high16 v13, 0x3f800000    # 1.0f

    .line 629
    .line 630
    const v14, 0x3ff33333    # 1.9f

    .line 631
    .line 632
    .line 633
    const v15, 0x40bd70a4    # 5.92f

    .line 634
    .line 635
    .line 636
    const/16 v16, 0x0

    .line 637
    .line 638
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 639
    .line 640
    .line 641
    const v0, 0x3ff33333    # 1.9f

    .line 642
    .line 643
    .line 644
    const/high16 v2, 0x41b80000    # 23.0f

    .line 645
    .line 646
    const/high16 v4, 0x40880000    # 4.25f

    .line 647
    .line 648
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 649
    .line 650
    .line 651
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 652
    .line 653
    .line 654
    const v0, 0x40df5c29    # 6.98f

    .line 655
    .line 656
    .line 657
    const v2, 0x40dccccd    # 6.9f

    .line 658
    .line 659
    .line 660
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 661
    .line 662
    .line 663
    const v17, 0x408bd70a    # 4.37f

    .line 664
    .line 665
    .line 666
    const v18, 0x40f6147b    # 7.69f

    .line 667
    .line 668
    .line 669
    const v13, 0x40bf0a3d    # 5.97f

    .line 670
    .line 671
    .line 672
    const v14, 0x40e570a4    # 7.17f

    .line 673
    .line 674
    .line 675
    const v15, 0x40a3d70a    # 5.12f

    .line 676
    .line 677
    .line 678
    const v16, 0x40ed1eb8    # 7.41f

    .line 679
    .line 680
    .line 681
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 682
    .line 683
    .line 684
    const v0, 0x3fc147ae    # 1.51f

    .line 685
    .line 686
    .line 687
    const v2, 0x40633333    # 3.55f

    .line 688
    .line 689
    .line 690
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 691
    .line 692
    .line 693
    const v0, 0x40df5c29    # 6.98f

    .line 694
    .line 695
    .line 696
    const v2, 0x40dccccd    # 6.9f

    .line 697
    .line 698
    .line 699
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 700
    .line 701
    .line 702
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 703
    .line 704
    .line 705
    const v0, 0x40f6147b    # 7.69f

    .line 706
    .line 707
    .line 708
    const v2, 0x419d0a3d    # 19.63f

    .line 709
    .line 710
    .line 711
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 712
    .line 713
    .line 714
    const v17, -0x3fde147b    # -2.53f

    .line 715
    .line 716
    .line 717
    const v18, -0x40ca3d71    # -0.71f

    .line 718
    .line 719
    .line 720
    const/high16 v13, -0x40c00000    # -0.75f

    .line 721
    .line 722
    const v14, -0x4170a3d7    # -0.28f

    .line 723
    .line 724
    .line 725
    const v15, -0x40333333    # -1.6f

    .line 726
    .line 727
    .line 728
    const v16, -0x40fae148    # -0.52f

    .line 729
    .line 730
    .line 731
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 732
    .line 733
    .line 734
    const v0, 0x3f828f5c    # 1.02f

    .line 735
    .line 736
    .line 737
    const/high16 v2, 0x40880000    # 4.25f

    .line 738
    .line 739
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 740
    .line 741
    .line 742
    const v0, 0x40f6147b    # 7.69f

    .line 743
    .line 744
    .line 745
    const v2, 0x419d0a3d    # 19.63f

    .line 746
    .line 747
    .line 748
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 749
    .line 750
    .line 751
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 752
    .line 753
    .line 754
    const/high16 v0, 0x41a80000    # 21.0f

    .line 755
    .line 756
    const v2, 0x4089eb85    # 4.31f

    .line 757
    .line 758
    .line 759
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 760
    .line 761
    .line 762
    const/high16 v17, 0x41400000    # 12.0f

    .line 763
    .line 764
    const/high16 v18, 0x40000000    # 2.0f

    .line 765
    .line 766
    const v13, 0x41a53333    # 20.65f

    .line 767
    .line 768
    .line 769
    const v14, 0x406851ec    # 3.63f

    .line 770
    .line 771
    .line 772
    const v15, 0x418c8f5c    # 17.57f

    .line 773
    .line 774
    .line 775
    const/high16 v16, 0x40000000    # 2.0f

    .line 776
    .line 777
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 778
    .line 779
    .line 780
    const v0, 0x406851ec    # 3.63f

    .line 781
    .line 782
    .line 783
    const v2, 0x40566666    # 3.35f

    .line 784
    .line 785
    .line 786
    const/high16 v4, 0x40400000    # 3.0f

    .line 787
    .line 788
    const v6, 0x4089eb85    # 4.31f

    .line 789
    .line 790
    .line 791
    invoke-virtual {v12, v2, v0, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 792
    .line 793
    .line 794
    const v0, 0x3fe28f5c    # 1.77f

    .line 795
    .line 796
    .line 797
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 798
    .line 799
    .line 800
    const/high16 v18, 0x40900000    # 4.5f

    .line 801
    .line 802
    const v13, 0x40aae148    # 5.34f

    .line 803
    .line 804
    .line 805
    const v14, 0x40a23d71    # 5.07f

    .line 806
    .line 807
    .line 808
    const v15, 0x4108f5c3    # 8.56f

    .line 809
    .line 810
    .line 811
    const/high16 v16, 0x40900000    # 4.5f

    .line 812
    .line 813
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 814
    .line 815
    .line 816
    const v0, 0x3fca3d71    # 1.58f

    .line 817
    .line 818
    .line 819
    const/high16 v2, 0x41100000    # 9.0f

    .line 820
    .line 821
    const v4, 0x3f11eb85    # 0.57f

    .line 822
    .line 823
    .line 824
    const v6, 0x40d51eb8    # 6.66f

    .line 825
    .line 826
    .line 827
    invoke-virtual {v12, v6, v4, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 828
    .line 829
    .line 830
    const v0, 0x4089eb85    # 4.31f

    .line 831
    .line 832
    .line 833
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 834
    .line 835
    .line 836
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 837
    .line 838
    .line 839
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 840
    .line 841
    .line 842
    move-result-object v2

    .line 843
    const/16 v16, 0x3800

    .line 844
    .line 845
    const/16 v17, 0x0

    .line 846
    .line 847
    const/high16 v6, 0x3f800000    # 1.0f

    .line 848
    .line 849
    const/high16 v8, 0x3f800000    # 1.0f

    .line 850
    .line 851
    const/4 v7, 0x0

    .line 852
    const/high16 v12, 0x3f800000    # 1.0f

    .line 853
    .line 854
    const/4 v13, 0x0

    .line 855
    const/4 v14, 0x0

    .line 856
    const/4 v15, 0x0

    .line 857
    const-string v4, ""

    .line 858
    .line 859
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 860
    .line 861
    .line 862
    move-result-object v0

    .line 863
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 864
    .line 865
    .line 866
    move-result-object v0

    .line 867
    sput-object v0, Landroidx/compose/material/icons/twotone/ParaglidingKt;->_paragliding:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 868
    .line 869
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 870
    .line 871
    .line 872
    return-object v0
.end method
