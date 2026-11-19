.class public final Landroidx/compose/material/icons/twotone/Brightness3Kt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_brightness3",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "Brightness3",
        "Landroidx/compose/material/icons/Icons$TwoTone;",
        "getBrightness3",
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
        "SMAP\nBrightness3.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Brightness3.kt\nandroidx/compose/material/icons/twotone/Brightness3Kt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,59:1\n212#2,12:60\n233#2,18:73\n253#2:110\n233#2,18:111\n253#2:148\n174#3:72\n705#4,2:91\n717#4,2:93\n719#4,11:99\n705#4,2:129\n717#4,2:131\n719#4,11:137\n72#5,4:95\n72#5,4:133\n*S KotlinDebug\n*F\n+ 1 Brightness3.kt\nandroidx/compose/material/icons/twotone/Brightness3Kt\n*L\n29#1:60,12\n30#1:73,18\n30#1:110\n38#1:111,18\n38#1:148\n29#1:72\n30#1:91,2\n30#1:93,2\n30#1:99,11\n38#1:129,2\n38#1:131,2\n38#1:137,11\n30#1:95,4\n38#1:133,4\n*E\n"
    }
.end annotation


# static fields
.field private static _brightness3:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getBrightness3(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/Brightness3Kt;->_brightness3:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.Brightness3"

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
    const v4, 0x409d1eb8    # 4.91f

    .line 71
    .line 72
    .line 73
    const v6, 0x414b3333    # 12.7f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v25, 0x40133333    # 2.3f

    .line 80
    .line 81
    .line 82
    const v26, 0x40e2e148    # 7.09f

    .line 83
    .line 84
    .line 85
    const v21, 0x3fbae148    # 1.46f

    .line 86
    .line 87
    .line 88
    const/high16 v22, 0x40000000    # 2.0f

    .line 89
    .line 90
    const v23, 0x40133333    # 2.3f

    .line 91
    .line 92
    .line 93
    const v24, 0x408eb852    # 4.46f

    .line 94
    .line 95
    .line 96
    move-object/from16 v20, v2

    .line 97
    .line 98
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 99
    .line 100
    .line 101
    const v4, 0x40a2e148    # 5.09f

    .line 102
    .line 103
    .line 104
    const v6, 0x40e2e148    # 7.09f

    .line 105
    .line 106
    .line 107
    const v7, -0x3feccccd    # -2.3f

    .line 108
    .line 109
    .line 110
    const v8, -0x40a8f5c3    # -0.84f

    .line 111
    .line 112
    .line 113
    invoke-virtual {v2, v8, v4, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 114
    .line 115
    .line 116
    const/high16 v25, 0x41880000    # 17.0f

    .line 117
    .line 118
    const/high16 v26, 0x41400000    # 12.0f

    .line 119
    .line 120
    const/high16 v21, 0x41740000    # 15.25f

    .line 121
    .line 122
    const v22, 0x418e147b    # 17.76f

    .line 123
    .line 124
    .line 125
    const/high16 v23, 0x41880000    # 17.0f

    .line 126
    .line 127
    const v24, 0x417147ae    # 15.08f

    .line 128
    .line 129
    .line 130
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 131
    .line 132
    .line 133
    const v4, -0x3f47ae14    # -5.76f

    .line 134
    .line 135
    .line 136
    const v6, -0x3f1d1eb8    # -7.09f

    .line 137
    .line 138
    .line 139
    const v7, -0x3f766666    # -4.3f

    .line 140
    .line 141
    .line 142
    const/high16 v8, -0x40200000    # -1.75f

    .line 143
    .line 144
    invoke-virtual {v2, v8, v4, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 145
    .line 146
    .line 147
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 148
    .line 149
    .line 150
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 151
    .line 152
    .line 153
    move-result-object v2

    .line 154
    const/16 v16, 0x3800

    .line 155
    .line 156
    const/16 v17, 0x0

    .line 157
    .line 158
    const v6, 0x3e99999a    # 0.3f

    .line 159
    .line 160
    .line 161
    const v8, 0x3e99999a    # 0.3f

    .line 162
    .line 163
    .line 164
    const/4 v7, 0x0

    .line 165
    const/high16 v9, 0x3f800000    # 1.0f

    .line 166
    .line 167
    const/high16 v12, 0x3f800000    # 1.0f

    .line 168
    .line 169
    const/4 v13, 0x0

    .line 170
    const/4 v14, 0x0

    .line 171
    const/4 v15, 0x0

    .line 172
    const-string v4, ""

    .line 173
    .line 174
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 175
    .line 176
    .line 177
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 178
    .line 179
    .line 180
    move-result v3

    .line 181
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 182
    .line 183
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 184
    .line 185
    .line 186
    move-result-wide v6

    .line 187
    const/4 v0, 0x0

    .line 188
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 189
    .line 190
    .line 191
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 192
    .line 193
    .line 194
    move-result v10

    .line 195
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 196
    .line 197
    .line 198
    move-result v11

    .line 199
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 200
    .line 201
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 202
    .line 203
    .line 204
    const/high16 v0, 0x41100000    # 9.0f

    .line 205
    .line 206
    const/high16 v2, 0x40000000    # 2.0f

    .line 207
    .line 208
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 209
    .line 210
    .line 211
    const/high16 v17, -0x3fc00000    # -3.0f

    .line 212
    .line 213
    const v18, 0x3eeb851f    # 0.46f

    .line 214
    .line 215
    .line 216
    const v13, -0x4079999a    # -1.05f

    .line 217
    .line 218
    .line 219
    const v15, -0x3ffccccd    # -2.05f

    .line 220
    .line 221
    .line 222
    const v16, 0x3e23d70a    # 0.16f

    .line 223
    .line 224
    .line 225
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 226
    .line 227
    .line 228
    const/high16 v17, 0x40e00000    # 7.0f

    .line 229
    .line 230
    const v18, 0x4118a3d7    # 9.54f

    .line 231
    .line 232
    .line 233
    const v13, 0x4081eb85    # 4.06f

    .line 234
    .line 235
    .line 236
    const v14, 0x3fa28f5c    # 1.27f

    .line 237
    .line 238
    .line 239
    const/high16 v15, 0x40e00000    # 7.0f

    .line 240
    .line 241
    const v16, 0x40a1eb85    # 5.06f

    .line 242
    .line 243
    .line 244
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 245
    .line 246
    .line 247
    const/high16 v17, -0x3f200000    # -7.0f

    .line 248
    .line 249
    const/4 v13, 0x0

    .line 250
    const v14, 0x408f5c29    # 4.48f

    .line 251
    .line 252
    .line 253
    const v15, -0x3fc3d70a    # -2.94f

    .line 254
    .line 255
    .line 256
    const v16, 0x410451ec    # 8.27f

    .line 257
    .line 258
    .line 259
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 260
    .line 261
    .line 262
    const/high16 v17, 0x40400000    # 3.0f

    .line 263
    .line 264
    const v18, 0x3eeb851f    # 0.46f

    .line 265
    .line 266
    .line 267
    const v13, 0x3f733333    # 0.95f

    .line 268
    .line 269
    .line 270
    const v14, 0x3e99999a    # 0.3f

    .line 271
    .line 272
    .line 273
    const v15, 0x3ff9999a    # 1.95f

    .line 274
    .line 275
    .line 276
    const v16, 0x3eeb851f    # 0.46f

    .line 277
    .line 278
    .line 279
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 280
    .line 281
    .line 282
    const/high16 v17, 0x41200000    # 10.0f

    .line 283
    .line 284
    const/high16 v18, -0x3ee00000    # -10.0f

    .line 285
    .line 286
    const v13, 0x40b0a3d7    # 5.52f

    .line 287
    .line 288
    .line 289
    const/4 v14, 0x0

    .line 290
    const/high16 v15, 0x41200000    # 10.0f

    .line 291
    .line 292
    const v16, -0x3f70a3d7    # -4.48f

    .line 293
    .line 294
    .line 295
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 296
    .line 297
    .line 298
    const v0, 0x416851ec    # 14.52f

    .line 299
    .line 300
    .line 301
    const/high16 v2, 0x41100000    # 9.0f

    .line 302
    .line 303
    const/high16 v4, 0x40000000    # 2.0f

    .line 304
    .line 305
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 306
    .line 307
    .line 308
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 309
    .line 310
    .line 311
    const v0, 0x4198b852    # 19.09f

    .line 312
    .line 313
    .line 314
    const v2, 0x414b3333    # 12.7f

    .line 315
    .line 316
    .line 317
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 318
    .line 319
    .line 320
    const v17, 0x40133333    # 2.3f

    .line 321
    .line 322
    .line 323
    const v18, -0x3f1d1eb8    # -7.09f

    .line 324
    .line 325
    .line 326
    const v13, 0x3fbae148    # 1.46f

    .line 327
    .line 328
    .line 329
    const/high16 v14, -0x40000000    # -2.0f

    .line 330
    .line 331
    const v15, 0x40133333    # 2.3f

    .line 332
    .line 333
    .line 334
    const v16, -0x3f7147ae    # -4.46f

    .line 335
    .line 336
    .line 337
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 338
    .line 339
    .line 340
    const v0, -0x3f5d1eb8    # -5.09f

    .line 341
    .line 342
    .line 343
    const v2, -0x3f1d1eb8    # -7.09f

    .line 344
    .line 345
    .line 346
    const v4, -0x3feccccd    # -2.3f

    .line 347
    .line 348
    .line 349
    const v6, -0x40a8f5c3    # -0.84f

    .line 350
    .line 351
    .line 352
    invoke-virtual {v12, v6, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 353
    .line 354
    .line 355
    const/high16 v17, 0x41880000    # 17.0f

    .line 356
    .line 357
    const/high16 v18, 0x41400000    # 12.0f

    .line 358
    .line 359
    const/high16 v13, 0x41740000    # 15.25f

    .line 360
    .line 361
    const v14, 0x40c7ae14    # 6.24f

    .line 362
    .line 363
    .line 364
    const/high16 v15, 0x41880000    # 17.0f

    .line 365
    .line 366
    const v16, 0x410eb852    # 8.92f

    .line 367
    .line 368
    .line 369
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 370
    .line 371
    .line 372
    const v0, 0x40b851ec    # 5.76f

    .line 373
    .line 374
    .line 375
    const v2, -0x3f766666    # -4.3f

    .line 376
    .line 377
    .line 378
    const/high16 v4, -0x40200000    # -1.75f

    .line 379
    .line 380
    const v6, 0x40e2e148    # 7.09f

    .line 381
    .line 382
    .line 383
    invoke-virtual {v12, v4, v0, v2, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 384
    .line 385
    .line 386
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 387
    .line 388
    .line 389
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 390
    .line 391
    .line 392
    move-result-object v2

    .line 393
    const/16 v16, 0x3800

    .line 394
    .line 395
    const/16 v17, 0x0

    .line 396
    .line 397
    const/high16 v6, 0x3f800000    # 1.0f

    .line 398
    .line 399
    const/high16 v8, 0x3f800000    # 1.0f

    .line 400
    .line 401
    const/4 v7, 0x0

    .line 402
    const/high16 v12, 0x3f800000    # 1.0f

    .line 403
    .line 404
    const/4 v13, 0x0

    .line 405
    const/4 v14, 0x0

    .line 406
    const/4 v15, 0x0

    .line 407
    const-string v4, ""

    .line 408
    .line 409
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 410
    .line 411
    .line 412
    move-result-object v0

    .line 413
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 414
    .line 415
    .line 416
    move-result-object v0

    .line 417
    sput-object v0, Landroidx/compose/material/icons/twotone/Brightness3Kt;->_brightness3:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 418
    .line 419
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 420
    .line 421
    .line 422
    return-object v0
.end method
