.class public final Landroidx/compose/material/icons/twotone/Face6Kt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_face6",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "Face6",
        "Landroidx/compose/material/icons/Icons$TwoTone;",
        "getFace6",
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
        "SMAP\nFace6.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Face6.kt\nandroidx/compose/material/icons/twotone/Face6Kt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,86:1\n212#2,12:87\n233#2,18:100\n253#2:137\n233#2,18:138\n253#2:175\n233#2,18:176\n253#2:213\n233#2,18:214\n253#2:251\n174#3:99\n705#4,2:118\n717#4,2:120\n719#4,11:126\n705#4,2:156\n717#4,2:158\n719#4,11:164\n705#4,2:194\n717#4,2:196\n719#4,11:202\n705#4,2:232\n717#4,2:234\n719#4,11:240\n72#5,4:122\n72#5,4:160\n72#5,4:198\n72#5,4:236\n*S KotlinDebug\n*F\n+ 1 Face6.kt\nandroidx/compose/material/icons/twotone/Face6Kt\n*L\n29#1:87,12\n30#1:100,18\n30#1:137\n41#1:138,18\n41#1:175\n69#1:176,18\n69#1:213\n75#1:214,18\n75#1:251\n29#1:99\n30#1:118,2\n30#1:120,2\n30#1:126,11\n41#1:156,2\n41#1:158,2\n41#1:164,11\n69#1:194,2\n69#1:196,2\n69#1:202,11\n75#1:232,2\n75#1:234,2\n75#1:240,11\n30#1:122,4\n41#1:160,4\n69#1:198,4\n75#1:236,4\n*E\n"
    }
.end annotation


# static fields
.field private static _face6:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getFace6(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 28

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/Face6Kt;->_face6:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.Face6"

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
    const v4, 0x40d1999a    # 6.55f

    .line 71
    .line 72
    .line 73
    const v6, 0x40f51eb8    # 7.66f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v25, 0x4113d70a    # 9.24f

    .line 80
    .line 81
    .line 82
    const/high16 v26, 0x40c00000    # 6.0f

    .line 83
    .line 84
    const v21, 0x40e1eb85    # 7.06f

    .line 85
    .line 86
    .line 87
    const v22, 0x40d47ae1    # 6.64f

    .line 88
    .line 89
    .line 90
    const v23, 0x410170a4    # 8.09f

    .line 91
    .line 92
    .line 93
    const/high16 v24, 0x40c00000    # 6.0f

    .line 94
    .line 95
    move-object/from16 v20, v2

    .line 96
    .line 97
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 98
    .line 99
    .line 100
    const v4, 0x40b0f5c3    # 5.53f

    .line 101
    .line 102
    .line 103
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 104
    .line 105
    .line 106
    const v25, 0x402b851f    # 2.68f

    .line 107
    .line 108
    .line 109
    const v26, 0x3fd47ae1    # 1.66f

    .line 110
    .line 111
    .line 112
    const v21, 0x3f91eb85    # 1.14f

    .line 113
    .line 114
    .line 115
    const/16 v22, 0x0

    .line 116
    .line 117
    const v23, 0x400ae148    # 2.17f

    .line 118
    .line 119
    .line 120
    const v24, 0x3f23d70a    # 0.64f

    .line 121
    .line 122
    .line 123
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 124
    .line 125
    .line 126
    const v25, 0x4010a3d7    # 2.26f

    .line 127
    .line 128
    .line 129
    const v26, 0x400f5c29    # 2.24f

    .line 130
    .line 131
    .line 132
    const v21, 0x3f70a3d7    # 0.94f

    .line 133
    .line 134
    .line 135
    const v22, 0x3fef5c29    # 1.87f

    .line 136
    .line 137
    .line 138
    const v23, 0x3fd47ae1    # 1.66f

    .line 139
    .line 140
    .line 141
    const v24, 0x40051eb8    # 2.08f

    .line 142
    .line 143
    .line 144
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 145
    .line 146
    .line 147
    const/high16 v25, 0x41400000    # 12.0f

    .line 148
    .line 149
    const/high16 v26, 0x40800000    # 4.0f

    .line 150
    .line 151
    const v21, 0x41963d71    # 18.78f

    .line 152
    .line 153
    .line 154
    const v22, 0x40d051ec    # 6.51f

    .line 155
    .line 156
    .line 157
    const v23, 0x417ae148    # 15.68f

    .line 158
    .line 159
    .line 160
    const/high16 v24, 0x40800000    # 4.0f

    .line 161
    .line 162
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 163
    .line 164
    .line 165
    const v4, 0x408947ae    # 4.29f

    .line 166
    .line 167
    .line 168
    const v6, 0x411e6666    # 9.9f

    .line 169
    .line 170
    .line 171
    const v7, 0x40a70a3d    # 5.22f

    .line 172
    .line 173
    .line 174
    const v8, 0x40d051ec    # 6.51f

    .line 175
    .line 176
    .line 177
    invoke-virtual {v2, v7, v8, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 178
    .line 179
    .line 180
    const v25, 0x40d1999a    # 6.55f

    .line 181
    .line 182
    .line 183
    const v26, 0x40f51eb8    # 7.66f

    .line 184
    .line 185
    .line 186
    const v21, 0x409f0a3d    # 4.97f

    .line 187
    .line 188
    .line 189
    const v22, 0x411b851f    # 9.72f

    .line 190
    .line 191
    .line 192
    const v23, 0x40b3d70a    # 5.62f

    .line 193
    .line 194
    .line 195
    const v24, 0x411851ec    # 9.52f

    .line 196
    .line 197
    .line 198
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 199
    .line 200
    .line 201
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 202
    .line 203
    .line 204
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 205
    .line 206
    .line 207
    move-result-object v2

    .line 208
    const/16 v16, 0x3800

    .line 209
    .line 210
    const/16 v17, 0x0

    .line 211
    .line 212
    const v6, 0x3e99999a    # 0.3f

    .line 213
    .line 214
    .line 215
    const v8, 0x3e99999a    # 0.3f

    .line 216
    .line 217
    .line 218
    const/4 v7, 0x0

    .line 219
    const/high16 v9, 0x3f800000    # 1.0f

    .line 220
    .line 221
    const/high16 v12, 0x3f800000    # 1.0f

    .line 222
    .line 223
    const/4 v13, 0x0

    .line 224
    const/4 v14, 0x0

    .line 225
    const/4 v15, 0x0

    .line 226
    const-string v4, ""

    .line 227
    .line 228
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 229
    .line 230
    .line 231
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 232
    .line 233
    .line 234
    move-result v3

    .line 235
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 236
    .line 237
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 238
    .line 239
    .line 240
    move-result-wide v6

    .line 241
    const/4 v2, 0x0

    .line 242
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 243
    .line 244
    .line 245
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 246
    .line 247
    .line 248
    move-result v10

    .line 249
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 250
    .line 251
    .line 252
    move-result v11

    .line 253
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 254
    .line 255
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 256
    .line 257
    .line 258
    const/high16 v4, 0x40000000    # 2.0f

    .line 259
    .line 260
    const/high16 v6, 0x41400000    # 12.0f

    .line 261
    .line 262
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 263
    .line 264
    .line 265
    const/high16 v25, 0x40000000    # 2.0f

    .line 266
    .line 267
    const/high16 v26, 0x41400000    # 12.0f

    .line 268
    .line 269
    const v21, 0x40cf5c29    # 6.48f

    .line 270
    .line 271
    .line 272
    const/high16 v22, 0x40000000    # 2.0f

    .line 273
    .line 274
    const/high16 v23, 0x40000000    # 2.0f

    .line 275
    .line 276
    const v24, 0x40cf5c29    # 6.48f

    .line 277
    .line 278
    .line 279
    move-object/from16 v20, v2

    .line 280
    .line 281
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 282
    .line 283
    .line 284
    const v4, 0x408f5c29    # 4.48f

    .line 285
    .line 286
    .line 287
    const/high16 v6, 0x41200000    # 10.0f

    .line 288
    .line 289
    invoke-virtual {v2, v4, v6, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 290
    .line 291
    .line 292
    const v4, -0x3f70a3d7    # -4.48f

    .line 293
    .line 294
    .line 295
    const/high16 v6, -0x3ee00000    # -10.0f

    .line 296
    .line 297
    const/high16 v7, 0x41200000    # 10.0f

    .line 298
    .line 299
    invoke-virtual {v2, v7, v4, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 300
    .line 301
    .line 302
    const v4, 0x418c28f6    # 17.52f

    .line 303
    .line 304
    .line 305
    const/high16 v6, 0x40000000    # 2.0f

    .line 306
    .line 307
    const/high16 v7, 0x41400000    # 12.0f

    .line 308
    .line 309
    invoke-virtual {v2, v4, v6, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 310
    .line 311
    .line 312
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 313
    .line 314
    .line 315
    const/high16 v4, 0x40800000    # 4.0f

    .line 316
    .line 317
    const/high16 v6, 0x41400000    # 12.0f

    .line 318
    .line 319
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 320
    .line 321
    .line 322
    const v25, 0x40f6b852    # 7.71f

    .line 323
    .line 324
    .line 325
    const v26, 0x40bccccd    # 5.9f

    .line 326
    .line 327
    .line 328
    const v21, 0x406b851f    # 3.68f

    .line 329
    .line 330
    .line 331
    const/16 v22, 0x0

    .line 332
    .line 333
    const v23, 0x40d8f5c3    # 6.78f

    .line 334
    .line 335
    .line 336
    const v24, 0x4020a3d7    # 2.51f

    .line 337
    .line 338
    .line 339
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 340
    .line 341
    .line 342
    const v25, -0x3fef5c29    # -2.26f

    .line 343
    .line 344
    .line 345
    const v26, -0x3ff0a3d7    # -2.24f

    .line 346
    .line 347
    .line 348
    const v21, -0x40e66666    # -0.6f

    .line 349
    .line 350
    .line 351
    const v22, -0x41dc28f6    # -0.16f

    .line 352
    .line 353
    .line 354
    const v23, -0x4055c28f    # -1.33f

    .line 355
    .line 356
    .line 357
    const v24, -0x41428f5c    # -0.37f

    .line 358
    .line 359
    .line 360
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 361
    .line 362
    .line 363
    const v25, 0x416c28f6    # 14.76f

    .line 364
    .line 365
    .line 366
    const/high16 v26, 0x40c00000    # 6.0f

    .line 367
    .line 368
    const v21, 0x4187851f    # 16.94f

    .line 369
    .line 370
    .line 371
    const v22, 0x40d47ae1    # 6.64f

    .line 372
    .line 373
    .line 374
    const v23, 0x417e8f5c    # 15.91f

    .line 375
    .line 376
    .line 377
    const/high16 v24, 0x40c00000    # 6.0f

    .line 378
    .line 379
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 380
    .line 381
    .line 382
    const v4, 0x4113d70a    # 9.24f

    .line 383
    .line 384
    .line 385
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 386
    .line 387
    .line 388
    const v25, 0x40d1999a    # 6.55f

    .line 389
    .line 390
    .line 391
    const v26, 0x40f51eb8    # 7.66f

    .line 392
    .line 393
    .line 394
    const v21, 0x410170a4    # 8.09f

    .line 395
    .line 396
    .line 397
    const/high16 v22, 0x40c00000    # 6.0f

    .line 398
    .line 399
    const v23, 0x40e1eb85    # 7.06f

    .line 400
    .line 401
    .line 402
    const v24, 0x40d47ae1    # 6.64f

    .line 403
    .line 404
    .line 405
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 406
    .line 407
    .line 408
    const v25, 0x408947ae    # 4.29f

    .line 409
    .line 410
    .line 411
    const v26, 0x411e6666    # 9.9f

    .line 412
    .line 413
    .line 414
    const v21, 0x40b3d70a    # 5.62f

    .line 415
    .line 416
    .line 417
    const v22, 0x411851ec    # 9.52f

    .line 418
    .line 419
    .line 420
    const v23, 0x409f0a3d    # 4.97f

    .line 421
    .line 422
    .line 423
    const v24, 0x411b851f    # 9.72f

    .line 424
    .line 425
    .line 426
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 427
    .line 428
    .line 429
    const/high16 v25, 0x41400000    # 12.0f

    .line 430
    .line 431
    const/high16 v26, 0x40800000    # 4.0f

    .line 432
    .line 433
    const v21, 0x40a70a3d    # 5.22f

    .line 434
    .line 435
    .line 436
    const v22, 0x40d051ec    # 6.51f

    .line 437
    .line 438
    .line 439
    const v23, 0x41051eb8    # 8.32f

    .line 440
    .line 441
    .line 442
    const/high16 v24, 0x40800000    # 4.0f

    .line 443
    .line 444
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 445
    .line 446
    .line 447
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 448
    .line 449
    .line 450
    const/high16 v4, 0x41a00000    # 20.0f

    .line 451
    .line 452
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 453
    .line 454
    .line 455
    const/high16 v25, -0x3f000000    # -8.0f

    .line 456
    .line 457
    const/high16 v26, -0x3f000000    # -8.0f

    .line 458
    .line 459
    const v21, -0x3f72e148    # -4.41f

    .line 460
    .line 461
    .line 462
    const/16 v22, 0x0

    .line 463
    .line 464
    const/high16 v23, -0x3f000000    # -8.0f

    .line 465
    .line 466
    const v24, -0x3f9a3d71    # -3.59f

    .line 467
    .line 468
    .line 469
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 470
    .line 471
    .line 472
    const/16 v25, 0x0

    .line 473
    .line 474
    const v26, -0x430a3d71    # -0.03f

    .line 475
    .line 476
    .line 477
    const/16 v21, 0x0

    .line 478
    .line 479
    const v22, -0x43dc28f6    # -0.01f

    .line 480
    .line 481
    .line 482
    const/16 v23, 0x0

    .line 483
    .line 484
    const v24, -0x435c28f6    # -0.02f

    .line 485
    .line 486
    .line 487
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 488
    .line 489
    .line 490
    const v25, 0x408ae148    # 4.34f

    .line 491
    .line 492
    .line 493
    const v26, -0x3fa5c28f    # -3.41f

    .line 494
    .line 495
    .line 496
    const v21, 0x4013d70a    # 2.31f

    .line 497
    .line 498
    .line 499
    const v22, -0x419eb852    # -0.22f

    .line 500
    .line 501
    .line 502
    const v23, 0x405b851f    # 3.43f

    .line 503
    .line 504
    .line 505
    const v24, -0x40347ae1    # -1.59f

    .line 506
    .line 507
    .line 508
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 509
    .line 510
    .line 511
    const v25, 0x4113d70a    # 9.24f

    .line 512
    .line 513
    .line 514
    const/high16 v26, 0x41000000    # 8.0f

    .line 515
    .line 516
    const v21, 0x410828f6    # 8.51f

    .line 517
    .line 518
    .line 519
    const v22, 0x41035c29    # 8.21f

    .line 520
    .line 521
    .line 522
    const v23, 0x410d999a    # 8.85f

    .line 523
    .line 524
    .line 525
    const/high16 v24, 0x41000000    # 8.0f

    .line 526
    .line 527
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 528
    .line 529
    .line 530
    const v4, 0x40b0f5c3    # 5.53f

    .line 531
    .line 532
    .line 533
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 534
    .line 535
    .line 536
    const v25, 0x3f63d70a    # 0.89f

    .line 537
    .line 538
    .line 539
    const v26, 0x3f0ccccd    # 0.55f

    .line 540
    .line 541
    .line 542
    const v21, 0x3ec28f5c    # 0.38f

    .line 543
    .line 544
    .line 545
    const/16 v22, 0x0

    .line 546
    .line 547
    const v23, 0x3f3851ec    # 0.72f

    .line 548
    .line 549
    .line 550
    const v24, 0x3e570a3d    # 0.21f

    .line 551
    .line 552
    .line 553
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 554
    .line 555
    .line 556
    const v25, 0x408ae148    # 4.34f

    .line 557
    .line 558
    .line 559
    const v26, 0x405a3d71    # 3.41f

    .line 560
    .line 561
    .line 562
    const v21, 0x3f666666    # 0.9f

    .line 563
    .line 564
    .line 565
    const v22, 0x3fe66666    # 1.8f

    .line 566
    .line 567
    .line 568
    const v23, 0x3ffeb852    # 1.99f

    .line 569
    .line 570
    .line 571
    const v24, 0x404c28f6    # 3.19f

    .line 572
    .line 573
    .line 574
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 575
    .line 576
    .line 577
    const/16 v25, 0x0

    .line 578
    .line 579
    const v26, 0x3cf5c28f    # 0.03f

    .line 580
    .line 581
    .line 582
    const/16 v21, 0x0

    .line 583
    .line 584
    const v22, 0x3c23d70a    # 0.01f

    .line 585
    .line 586
    .line 587
    const/16 v23, 0x0

    .line 588
    .line 589
    const v24, 0x3ca3d70a    # 0.02f

    .line 590
    .line 591
    .line 592
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 593
    .line 594
    .line 595
    const/high16 v25, 0x41400000    # 12.0f

    .line 596
    .line 597
    const/high16 v26, 0x41a00000    # 20.0f

    .line 598
    .line 599
    const/high16 v21, 0x41a00000    # 20.0f

    .line 600
    .line 601
    const v22, 0x418347ae    # 16.41f

    .line 602
    .line 603
    .line 604
    const v23, 0x418347ae    # 16.41f

    .line 605
    .line 606
    .line 607
    const/high16 v24, 0x41a00000    # 20.0f

    .line 608
    .line 609
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 610
    .line 611
    .line 612
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 613
    .line 614
    .line 615
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 616
    .line 617
    .line 618
    move-result-object v2

    .line 619
    const/high16 v6, 0x3f800000    # 1.0f

    .line 620
    .line 621
    const/high16 v8, 0x3f800000    # 1.0f

    .line 622
    .line 623
    const/4 v7, 0x0

    .line 624
    const-string v4, ""

    .line 625
    .line 626
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 627
    .line 628
    .line 629
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 630
    .line 631
    .line 632
    move-result v3

    .line 633
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 634
    .line 635
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 636
    .line 637
    .line 638
    move-result-wide v6

    .line 639
    const/4 v2, 0x0

    .line 640
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 641
    .line 642
    .line 643
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 644
    .line 645
    .line 646
    move-result v10

    .line 647
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 648
    .line 649
    .line 650
    move-result v11

    .line 651
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 652
    .line 653
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 654
    .line 655
    .line 656
    const/high16 v4, 0x41100000    # 9.0f

    .line 657
    .line 658
    const/high16 v6, 0x41500000    # 13.0f

    .line 659
    .line 660
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 661
    .line 662
    .line 663
    const/4 v4, 0x0

    .line 664
    const/high16 v6, -0x40600000    # -1.25f

    .line 665
    .line 666
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 667
    .line 668
    .line 669
    const/high16 v26, 0x40200000    # 2.5f

    .line 670
    .line 671
    const/16 v27, 0x0

    .line 672
    .line 673
    const/high16 v21, 0x3fa00000    # 1.25f

    .line 674
    .line 675
    const/high16 v22, 0x3fa00000    # 1.25f

    .line 676
    .line 677
    const/16 v23, 0x0

    .line 678
    .line 679
    const/16 v24, 0x1

    .line 680
    .line 681
    const/16 v25, 0x1

    .line 682
    .line 683
    move-object/from16 v20, v2

    .line 684
    .line 685
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 686
    .line 687
    .line 688
    const/high16 v26, -0x3fe00000    # -2.5f

    .line 689
    .line 690
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 691
    .line 692
    .line 693
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 694
    .line 695
    .line 696
    move-result-object v2

    .line 697
    const/high16 v6, 0x3f800000    # 1.0f

    .line 698
    .line 699
    const/4 v7, 0x0

    .line 700
    const-string v4, ""

    .line 701
    .line 702
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 703
    .line 704
    .line 705
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 706
    .line 707
    .line 708
    move-result v3

    .line 709
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 710
    .line 711
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 712
    .line 713
    .line 714
    move-result-wide v6

    .line 715
    const/4 v0, 0x0

    .line 716
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 717
    .line 718
    .line 719
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 720
    .line 721
    .line 722
    move-result v10

    .line 723
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 724
    .line 725
    .line 726
    move-result v11

    .line 727
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 728
    .line 729
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 730
    .line 731
    .line 732
    const/high16 v0, 0x41700000    # 15.0f

    .line 733
    .line 734
    const/high16 v2, 0x41500000    # 13.0f

    .line 735
    .line 736
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 737
    .line 738
    .line 739
    const/4 v0, 0x0

    .line 740
    const/high16 v2, -0x40600000    # -1.25f

    .line 741
    .line 742
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 743
    .line 744
    .line 745
    const/high16 v18, 0x40200000    # 2.5f

    .line 746
    .line 747
    const/16 v19, 0x0

    .line 748
    .line 749
    const/high16 v13, 0x3fa00000    # 1.25f

    .line 750
    .line 751
    const/high16 v14, 0x3fa00000    # 1.25f

    .line 752
    .line 753
    const/16 v16, 0x1

    .line 754
    .line 755
    const/16 v17, 0x1

    .line 756
    .line 757
    invoke-virtual/range {v12 .. v19}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 758
    .line 759
    .line 760
    const/high16 v18, -0x3fe00000    # -2.5f

    .line 761
    .line 762
    invoke-virtual/range {v12 .. v19}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 763
    .line 764
    .line 765
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 766
    .line 767
    .line 768
    move-result-object v2

    .line 769
    const/16 v16, 0x3800

    .line 770
    .line 771
    const/16 v17, 0x0

    .line 772
    .line 773
    const/high16 v6, 0x3f800000    # 1.0f

    .line 774
    .line 775
    const/4 v7, 0x0

    .line 776
    const/high16 v12, 0x3f800000    # 1.0f

    .line 777
    .line 778
    const/4 v13, 0x0

    .line 779
    const/4 v14, 0x0

    .line 780
    const-string v4, ""

    .line 781
    .line 782
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 783
    .line 784
    .line 785
    move-result-object v0

    .line 786
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 787
    .line 788
    .line 789
    move-result-object v0

    .line 790
    sput-object v0, Landroidx/compose/material/icons/twotone/Face6Kt;->_face6:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 791
    .line 792
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 793
    .line 794
    .line 795
    return-object v0
.end method
