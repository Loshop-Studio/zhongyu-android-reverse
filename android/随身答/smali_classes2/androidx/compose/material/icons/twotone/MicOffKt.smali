.class public final Landroidx/compose/material/icons/twotone/MicOffKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_micOff",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "MicOff",
        "Landroidx/compose/material/icons/Icons$TwoTone;",
        "getMicOff",
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
        "SMAP\nMicOff.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MicOff.kt\nandroidx/compose/material/icons/twotone/MicOffKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,82:1\n212#2,12:83\n233#2,18:96\n253#2:133\n233#2,18:134\n253#2:171\n174#3:95\n705#4,2:114\n717#4,2:116\n719#4,11:122\n705#4,2:152\n717#4,2:154\n719#4,11:160\n72#5,4:118\n72#5,4:156\n*S KotlinDebug\n*F\n+ 1 MicOff.kt\nandroidx/compose/material/icons/twotone/MicOffKt\n*L\n29#1:83,12\n30#1:96,18\n30#1:133\n39#1:134,18\n39#1:171\n29#1:95\n30#1:114,2\n30#1:116,2\n30#1:122,11\n39#1:152,2\n39#1:154,2\n39#1:160,11\n30#1:118,4\n39#1:156,4\n*E\n"
    }
.end annotation


# static fields
.field private static _micOff:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getMicOff(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/MicOffKt;->_micOff:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.MicOff"

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
    const/high16 v4, 0x41400000    # 12.0f

    .line 71
    .line 72
    const v6, 0x406ccccd    # 3.7f

    .line 73
    .line 74
    .line 75
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    const v25, -0x40666666    # -1.2f

    .line 79
    .line 80
    .line 81
    const v26, 0x3f99999a    # 1.2f

    .line 82
    .line 83
    .line 84
    const v21, -0x40d70a3d    # -0.66f

    .line 85
    .line 86
    .line 87
    const/16 v22, 0x0

    .line 88
    .line 89
    const v23, -0x40666666    # -1.2f

    .line 90
    .line 91
    .line 92
    const v24, 0x3f0a3d71    # 0.54f

    .line 93
    .line 94
    .line 95
    move-object/from16 v20, v2

    .line 96
    .line 97
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 98
    .line 99
    .line 100
    const v4, 0x3fc147ae    # 1.51f

    .line 101
    .line 102
    .line 103
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 104
    .line 105
    .line 106
    const v4, 0x4018f5c3    # 2.39f

    .line 107
    .line 108
    .line 109
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 110
    .line 111
    .line 112
    const v4, 0x3c23d70a    # 0.01f

    .line 113
    .line 114
    .line 115
    const v6, -0x3f866666    # -3.9f

    .line 116
    .line 117
    .line 118
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 119
    .line 120
    .line 121
    const v26, -0x40666666    # -1.2f

    .line 122
    .line 123
    .line 124
    const/16 v21, 0x0

    .line 125
    .line 126
    const v22, -0x40d70a3d    # -0.66f

    .line 127
    .line 128
    .line 129
    const v23, -0x40f5c28f    # -0.54f

    .line 130
    .line 131
    .line 132
    const v24, -0x40666666    # -1.2f

    .line 133
    .line 134
    .line 135
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 136
    .line 137
    .line 138
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 139
    .line 140
    .line 141
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 142
    .line 143
    .line 144
    move-result-object v2

    .line 145
    const/16 v16, 0x3800

    .line 146
    .line 147
    const/16 v17, 0x0

    .line 148
    .line 149
    const v6, 0x3e99999a    # 0.3f

    .line 150
    .line 151
    .line 152
    const v8, 0x3e99999a    # 0.3f

    .line 153
    .line 154
    .line 155
    const/4 v7, 0x0

    .line 156
    const/high16 v9, 0x3f800000    # 1.0f

    .line 157
    .line 158
    const/high16 v12, 0x3f800000    # 1.0f

    .line 159
    .line 160
    const/4 v13, 0x0

    .line 161
    const/4 v14, 0x0

    .line 162
    const/4 v15, 0x0

    .line 163
    const-string v4, ""

    .line 164
    .line 165
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 166
    .line 167
    .line 168
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 169
    .line 170
    .line 171
    move-result v3

    .line 172
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 173
    .line 174
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 175
    .line 176
    .line 177
    move-result-wide v6

    .line 178
    const/4 v0, 0x0

    .line 179
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 180
    .line 181
    .line 182
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 183
    .line 184
    .line 185
    move-result v10

    .line 186
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 187
    .line 188
    .line 189
    move-result v11

    .line 190
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 191
    .line 192
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 193
    .line 194
    .line 195
    const/high16 v0, 0x41980000    # 19.0f

    .line 196
    .line 197
    const/high16 v2, 0x41300000    # 11.0f

    .line 198
    .line 199
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 200
    .line 201
    .line 202
    const v0, -0x40266666    # -1.7f

    .line 203
    .line 204
    .line 205
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 206
    .line 207
    .line 208
    const v17, -0x4175c28f    # -0.27f

    .line 209
    .line 210
    .line 211
    const v18, 0x3fd1eb85    # 1.64f

    .line 212
    .line 213
    .line 214
    const v14, 0x3f147ae1    # 0.58f

    .line 215
    .line 216
    .line 217
    const v15, -0x42333333    # -0.1f

    .line 218
    .line 219
    .line 220
    const v16, 0x3f90a3d7    # 1.13f

    .line 221
    .line 222
    .line 223
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 224
    .line 225
    .line 226
    const v0, 0x3fa28f5c    # 1.27f

    .line 227
    .line 228
    .line 229
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 230
    .line 231
    .line 232
    const v17, 0x3f333333    # 0.7f

    .line 233
    .line 234
    .line 235
    const v18, -0x3fc5c28f    # -2.91f

    .line 236
    .line 237
    .line 238
    const v13, 0x3ee147ae    # 0.44f

    .line 239
    .line 240
    .line 241
    const v14, -0x409eb852    # -0.88f

    .line 242
    .line 243
    .line 244
    const v15, 0x3f333333    # 0.7f

    .line 245
    .line 246
    .line 247
    const v16, -0x4010a3d7    # -1.87f

    .line 248
    .line 249
    .line 250
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 251
    .line 252
    .line 253
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 254
    .line 255
    .line 256
    const v0, 0x40370a3d    # 2.86f

    .line 257
    .line 258
    .line 259
    const v2, 0x408d1eb8    # 4.41f

    .line 260
    .line 261
    .line 262
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 263
    .line 264
    .line 265
    const/high16 v0, 0x40400000    # 3.0f

    .line 266
    .line 267
    const v2, 0x4088a3d7    # 4.27f

    .line 268
    .line 269
    .line 270
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 271
    .line 272
    .line 273
    const/high16 v0, 0x40c00000    # 6.0f

    .line 274
    .line 275
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 276
    .line 277
    .line 278
    const/high16 v0, 0x41300000    # 11.0f

    .line 279
    .line 280
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 281
    .line 282
    .line 283
    const/high16 v17, 0x40400000    # 3.0f

    .line 284
    .line 285
    const/high16 v18, 0x40400000    # 3.0f

    .line 286
    .line 287
    const/4 v13, 0x0

    .line 288
    const v14, 0x3fd47ae1    # 1.66f

    .line 289
    .line 290
    .line 291
    const v15, 0x3fab851f    # 1.34f

    .line 292
    .line 293
    .line 294
    const/high16 v16, 0x40400000    # 3.0f

    .line 295
    .line 296
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 297
    .line 298
    .line 299
    const v17, 0x3f266666    # 0.65f

    .line 300
    .line 301
    .line 302
    const v18, -0x425c28f6    # -0.08f

    .line 303
    .line 304
    .line 305
    const v13, 0x3e6b851f    # 0.23f

    .line 306
    .line 307
    .line 308
    const/4 v14, 0x0

    .line 309
    const v15, 0x3ee147ae    # 0.44f

    .line 310
    .line 311
    .line 312
    const v16, -0x430a3d71    # -0.03f

    .line 313
    .line 314
    .line 315
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 316
    .line 317
    .line 318
    const v0, 0x3fd47ae1    # 1.66f

    .line 319
    .line 320
    .line 321
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 322
    .line 323
    .line 324
    const v17, -0x3fec28f6    # -2.31f

    .line 325
    .line 326
    .line 327
    const v18, 0x3f051eb8    # 0.52f

    .line 328
    .line 329
    .line 330
    const v13, -0x40ca3d71    # -0.71f

    .line 331
    .line 332
    .line 333
    const v14, 0x3ea8f5c3    # 0.33f

    .line 334
    .line 335
    .line 336
    const/high16 v15, -0x40400000    # -1.5f

    .line 337
    .line 338
    const v16, 0x3f051eb8    # 0.52f

    .line 339
    .line 340
    .line 341
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 342
    .line 343
    .line 344
    const v17, -0x3f566666    # -5.3f

    .line 345
    .line 346
    .line 347
    const v18, -0x3f5ccccd    # -5.1f

    .line 348
    .line 349
    .line 350
    const v13, -0x3fcf5c29    # -2.76f

    .line 351
    .line 352
    .line 353
    const/4 v14, 0x0

    .line 354
    const v15, -0x3f566666    # -5.3f

    .line 355
    .line 356
    .line 357
    const v16, -0x3ff9999a    # -2.1f

    .line 358
    .line 359
    .line 360
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 361
    .line 362
    .line 363
    const/high16 v0, 0x40a00000    # 5.0f

    .line 364
    .line 365
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 366
    .line 367
    .line 368
    const/high16 v17, 0x40c00000    # 6.0f

    .line 369
    .line 370
    const v18, 0x40d70a3d    # 6.72f

    .line 371
    .line 372
    .line 373
    const/4 v13, 0x0

    .line 374
    const v14, 0x405a3d71    # 3.41f

    .line 375
    .line 376
    .line 377
    const v15, 0x402e147b    # 2.72f

    .line 378
    .line 379
    .line 380
    const v16, 0x40c75c29    # 6.23f

    .line 381
    .line 382
    .line 383
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 384
    .line 385
    .line 386
    const/high16 v0, 0x41a80000    # 21.0f

    .line 387
    .line 388
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 389
    .line 390
    .line 391
    const/high16 v0, 0x40000000    # 2.0f

    .line 392
    .line 393
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 394
    .line 395
    .line 396
    const v0, -0x3fae147b    # -3.28f

    .line 397
    .line 398
    .line 399
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 400
    .line 401
    .line 402
    const v17, 0x40233333    # 2.55f

    .line 403
    .line 404
    .line 405
    const v18, -0x4099999a    # -0.9f

    .line 406
    .line 407
    .line 408
    const v13, 0x3f68f5c3    # 0.91f

    .line 409
    .line 410
    .line 411
    const v14, -0x41fae148    # -0.13f

    .line 412
    .line 413
    .line 414
    const v15, 0x3fe28f5c    # 1.77f

    .line 415
    .line 416
    .line 417
    const v16, -0x4119999a    # -0.45f

    .line 418
    .line 419
    .line 420
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 421
    .line 422
    .line 423
    const v0, 0x40866666    # 4.2f

    .line 424
    .line 425
    .line 426
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 427
    .line 428
    .line 429
    const v0, 0x3fb47ae1    # 1.41f

    .line 430
    .line 431
    .line 432
    const v2, -0x404b851f    # -1.41f

    .line 433
    .line 434
    .line 435
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 436
    .line 437
    .line 438
    const v0, 0x40370a3d    # 2.86f

    .line 439
    .line 440
    .line 441
    const v2, 0x408d1eb8    # 4.41f

    .line 442
    .line 443
    .line 444
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 445
    .line 446
    .line 447
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 448
    .line 449
    .line 450
    const v0, 0x412ccccd    # 10.8f

    .line 451
    .line 452
    .line 453
    const v2, 0x409ccccd    # 4.9f

    .line 454
    .line 455
    .line 456
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 457
    .line 458
    .line 459
    const v17, 0x3f99999a    # 1.2f

    .line 460
    .line 461
    .line 462
    const v18, -0x40666666    # -1.2f

    .line 463
    .line 464
    .line 465
    const/4 v13, 0x0

    .line 466
    const v14, -0x40d70a3d    # -0.66f

    .line 467
    .line 468
    .line 469
    const v15, 0x3f0a3d71    # 0.54f

    .line 470
    .line 471
    .line 472
    const v16, -0x40666666    # -1.2f

    .line 473
    .line 474
    .line 475
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 476
    .line 477
    .line 478
    const v0, 0x3f0a3d71    # 0.54f

    .line 479
    .line 480
    .line 481
    const v2, 0x3f99999a    # 1.2f

    .line 482
    .line 483
    .line 484
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 485
    .line 486
    .line 487
    const v0, -0x43dc28f6    # -0.01f

    .line 488
    .line 489
    .line 490
    const v2, 0x407a3d71    # 3.91f

    .line 491
    .line 492
    .line 493
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 494
    .line 495
    .line 496
    const/high16 v0, 0x41700000    # 15.0f

    .line 497
    .line 498
    const v2, 0x4129999a    # 10.6f

    .line 499
    .line 500
    .line 501
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 502
    .line 503
    .line 504
    const/high16 v0, 0x40a00000    # 5.0f

    .line 505
    .line 506
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 507
    .line 508
    .line 509
    const/high16 v17, -0x3fc00000    # -3.0f

    .line 510
    .line 511
    const/high16 v18, -0x3fc00000    # -3.0f

    .line 512
    .line 513
    const v14, -0x402b851f    # -1.66f

    .line 514
    .line 515
    .line 516
    const v15, -0x40547ae1    # -1.34f

    .line 517
    .line 518
    .line 519
    const/high16 v16, -0x3fc00000    # -3.0f

    .line 520
    .line 521
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 522
    .line 523
    .line 524
    const v17, -0x3fc28f5c    # -2.96f

    .line 525
    .line 526
    .line 527
    const v18, 0x4029999a    # 2.65f

    .line 528
    .line 529
    .line 530
    const v13, -0x403ae148    # -1.54f

    .line 531
    .line 532
    .line 533
    const/4 v14, 0x0

    .line 534
    const v15, -0x3fcd70a4    # -2.79f

    .line 535
    .line 536
    .line 537
    const v16, 0x3f947ae1    # 1.16f

    .line 538
    .line 539
    .line 540
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 541
    .line 542
    .line 543
    const v0, 0x3fe147ae    # 1.76f

    .line 544
    .line 545
    .line 546
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 547
    .line 548
    .line 549
    const v0, 0x409ccccd    # 4.9f

    .line 550
    .line 551
    .line 552
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 553
    .line 554
    .line 555
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 556
    .line 557
    .line 558
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 559
    .line 560
    .line 561
    move-result-object v2

    .line 562
    const/16 v16, 0x3800

    .line 563
    .line 564
    const/16 v17, 0x0

    .line 565
    .line 566
    const/high16 v6, 0x3f800000    # 1.0f

    .line 567
    .line 568
    const/high16 v8, 0x3f800000    # 1.0f

    .line 569
    .line 570
    const/4 v7, 0x0

    .line 571
    const/high16 v12, 0x3f800000    # 1.0f

    .line 572
    .line 573
    const/4 v13, 0x0

    .line 574
    const/4 v15, 0x0

    .line 575
    const-string v4, ""

    .line 576
    .line 577
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 578
    .line 579
    .line 580
    move-result-object v0

    .line 581
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 582
    .line 583
    .line 584
    move-result-object v0

    .line 585
    sput-object v0, Landroidx/compose/material/icons/twotone/MicOffKt;->_micOff:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 586
    .line 587
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 588
    .line 589
    .line 590
    return-object v0
.end method
