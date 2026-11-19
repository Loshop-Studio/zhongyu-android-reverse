.class public final Landroidx/compose/material/icons/twotone/FaceKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_face",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "Face",
        "Landroidx/compose/material/icons/Icons$TwoTone;",
        "getFace",
        "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;",
        "material-icons-core_release"
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
        "SMAP\nFace.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Face.kt\nandroidx/compose/material/icons/twotone/FaceKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,86:1\n212#2,12:87\n233#2,18:100\n253#2:137\n233#2,18:138\n253#2:175\n233#2,18:176\n253#2:213\n233#2,18:214\n253#2:251\n174#3:99\n705#4,2:118\n717#4,2:120\n719#4,11:126\n705#4,2:156\n717#4,2:158\n719#4,11:164\n705#4,2:194\n717#4,2:196\n719#4,11:202\n705#4,2:232\n717#4,2:234\n719#4,11:240\n72#5,4:122\n72#5,4:160\n72#5,4:198\n72#5,4:236\n*S KotlinDebug\n*F\n+ 1 Face.kt\nandroidx/compose/material/icons/twotone/FaceKt\n*L\n29#1:87,12\n30#1:100,18\n30#1:137\n42#1:138,18\n42#1:175\n69#1:176,18\n69#1:213\n75#1:214,18\n75#1:251\n29#1:99\n30#1:118,2\n30#1:120,2\n30#1:126,11\n42#1:156,2\n42#1:158,2\n42#1:164,11\n69#1:194,2\n69#1:196,2\n69#1:202,11\n75#1:232,2\n75#1:234,2\n75#1:240,11\n30#1:122,4\n42#1:160,4\n69#1:198,4\n75#1:236,4\n*E\n"
    }
.end annotation


# static fields
.field private static _face:Landroidx/compose/ui/graphics/vector/ImageVector;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field


# direct methods
.method public static final getFace(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 28
    .param p0    # Landroidx/compose/material/icons/Icons$TwoTone;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/FaceKt;->_face:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-static {v0}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

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
    const-string v2, "TwoTone.Face"

    .line 33
    .line 34
    invoke-direct/range {v1 .. v12}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;-><init>(Ljava/lang/String;FFFFJIZILkotlin/jvm/internal/e;)V

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
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/e;)V

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
    const/high16 v2, 0x418c0000    # 17.5f

    .line 66
    .line 67
    const/high16 v4, 0x41000000    # 8.0f

    .line 68
    .line 69
    invoke-static {v2, v4}, Lg/a;->a(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 70
    .line 71
    .line 72
    move-result-object v20

    .line 73
    const v25, 0x3fab851f    # 1.34f

    .line 74
    .line 75
    .line 76
    const v26, -0x420a3d71    # -0.12f

    .line 77
    .line 78
    .line 79
    const v21, 0x3eeb851f    # 0.46f

    .line 80
    .line 81
    .line 82
    const/16 v22, 0x0

    .line 83
    .line 84
    const v23, 0x3f68f5c3    # 0.91f

    .line 85
    .line 86
    .line 87
    const v24, -0x42b33333    # -0.05f

    .line 88
    .line 89
    .line 90
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 91
    .line 92
    .line 93
    const/high16 v25, 0x41400000    # 12.0f

    .line 94
    .line 95
    const/high16 v26, 0x40800000    # 4.0f

    .line 96
    .line 97
    const v21, 0x418b851f    # 17.44f

    .line 98
    .line 99
    .line 100
    const v22, 0x40b1eb85    # 5.56f

    .line 101
    .line 102
    .line 103
    const v23, 0x416e6666    # 14.9f

    .line 104
    .line 105
    .line 106
    const/high16 v24, 0x40800000    # 4.0f

    .line 107
    .line 108
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 109
    .line 110
    .line 111
    const v25, -0x40547ae1    # -1.34f

    .line 112
    .line 113
    .line 114
    const v26, 0x3df5c28f    # 0.12f

    .line 115
    .line 116
    .line 117
    const v21, -0x41147ae1    # -0.46f

    .line 118
    .line 119
    .line 120
    const/16 v22, 0x0

    .line 121
    .line 122
    const v23, -0x40970a3d    # -0.91f

    .line 123
    .line 124
    .line 125
    const v24, 0x3d4ccccd    # 0.05f

    .line 126
    .line 127
    .line 128
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 129
    .line 130
    .line 131
    const/high16 v25, 0x418c0000    # 17.5f

    .line 132
    .line 133
    const/high16 v26, 0x41000000    # 8.0f

    .line 134
    .line 135
    const v21, 0x4140f5c3    # 12.06f

    .line 136
    .line 137
    .line 138
    const v22, 0x40ce147b    # 6.44f

    .line 139
    .line 140
    .line 141
    const v23, 0x4169999a    # 14.6f

    .line 142
    .line 143
    .line 144
    const/high16 v24, 0x41000000    # 8.0f

    .line 145
    .line 146
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 147
    .line 148
    .line 149
    move-object/from16 v2, v20

    .line 150
    .line 151
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 152
    .line 153
    .line 154
    const v4, 0x40a0f5c3    # 5.03f

    .line 155
    .line 156
    .line 157
    const v6, 0x410147ae    # 8.08f

    .line 158
    .line 159
    .line 160
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 161
    .line 162
    .line 163
    const v25, 0x408d70a4    # 4.42f

    .line 164
    .line 165
    .line 166
    const v26, 0x4117851f    # 9.47f

    .line 167
    .line 168
    .line 169
    const v21, 0x40cbd70a    # 6.37f

    .line 170
    .line 171
    .line 172
    const/high16 v22, 0x40c00000    # 6.0f

    .line 173
    .line 174
    const v23, 0x40a1999a    # 5.05f

    .line 175
    .line 176
    .line 177
    const v24, 0x40f28f5c    # 7.58f

    .line 178
    .line 179
    .line 180
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 181
    .line 182
    .line 183
    const v25, 0x406a3d71    # 3.66f

    .line 184
    .line 185
    .line 186
    const v26, -0x3f71eb85    # -4.44f

    .line 187
    .line 188
    .line 189
    const v21, 0x3fdae148    # 1.71f

    .line 190
    .line 191
    .line 192
    const v22, -0x4087ae14    # -0.97f

    .line 193
    .line 194
    .line 195
    const v23, 0x4041eb85    # 3.03f

    .line 196
    .line 197
    .line 198
    const v24, -0x3fdccccd    # -2.55f

    .line 199
    .line 200
    .line 201
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 202
    .line 203
    .line 204
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 205
    .line 206
    .line 207
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 208
    .line 209
    .line 210
    move-result-object v2

    .line 211
    const/16 v16, 0x3800

    .line 212
    .line 213
    const/16 v17, 0x0

    .line 214
    .line 215
    const v6, 0x3e99999a    # 0.3f

    .line 216
    .line 217
    .line 218
    const v8, 0x3e99999a    # 0.3f

    .line 219
    .line 220
    .line 221
    const/4 v7, 0x0

    .line 222
    const/high16 v9, 0x3f800000    # 1.0f

    .line 223
    .line 224
    const/high16 v12, 0x3f800000    # 1.0f

    .line 225
    .line 226
    const/4 v13, 0x0

    .line 227
    const/4 v14, 0x0

    .line 228
    const/4 v15, 0x0

    .line 229
    const-string v4, ""

    .line 230
    .line 231
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 232
    .line 233
    .line 234
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 235
    .line 236
    .line 237
    move-result v3

    .line 238
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 239
    .line 240
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 241
    .line 242
    .line 243
    move-result-wide v6

    .line 244
    const/4 v2, 0x0

    .line 245
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/e;)V

    .line 246
    .line 247
    .line 248
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 249
    .line 250
    .line 251
    move-result v10

    .line 252
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 253
    .line 254
    .line 255
    move-result v11

    .line 256
    const/high16 v2, 0x40000000    # 2.0f

    .line 257
    .line 258
    const/high16 v4, 0x41400000    # 12.0f

    .line 259
    .line 260
    invoke-static {v4, v2}, Lg/a;->a(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 261
    .line 262
    .line 263
    move-result-object v20

    .line 264
    const/high16 v25, 0x40000000    # 2.0f

    .line 265
    .line 266
    const/high16 v26, 0x41400000    # 12.0f

    .line 267
    .line 268
    const v21, 0x40cf5c29    # 6.48f

    .line 269
    .line 270
    .line 271
    const/high16 v22, 0x40000000    # 2.0f

    .line 272
    .line 273
    const/high16 v23, 0x40000000    # 2.0f

    .line 274
    .line 275
    const v24, 0x40cf5c29    # 6.48f

    .line 276
    .line 277
    .line 278
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 279
    .line 280
    .line 281
    move-object/from16 v2, v20

    .line 282
    .line 283
    const v4, 0x408f5c29    # 4.48f

    .line 284
    .line 285
    .line 286
    const/high16 v6, 0x41200000    # 10.0f

    .line 287
    .line 288
    invoke-virtual {v2, v4, v6, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 289
    .line 290
    .line 291
    const v4, -0x3f70a3d7    # -4.48f

    .line 292
    .line 293
    .line 294
    const/high16 v6, -0x3ee00000    # -10.0f

    .line 295
    .line 296
    const/high16 v7, 0x41200000    # 10.0f

    .line 297
    .line 298
    invoke-virtual {v2, v7, v4, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 299
    .line 300
    .line 301
    const v4, 0x418c28f6    # 17.52f

    .line 302
    .line 303
    .line 304
    const/high16 v6, 0x40000000    # 2.0f

    .line 305
    .line 306
    const/high16 v7, 0x41400000    # 12.0f

    .line 307
    .line 308
    invoke-virtual {v2, v4, v6, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 309
    .line 310
    .line 311
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 312
    .line 313
    .line 314
    const/high16 v4, 0x40800000    # 4.0f

    .line 315
    .line 316
    const/high16 v6, 0x41400000    # 12.0f

    .line 317
    .line 318
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 319
    .line 320
    .line 321
    const v25, 0x40dae148    # 6.84f

    .line 322
    .line 323
    .line 324
    const v26, 0x407851ec    # 3.88f

    .line 325
    .line 326
    .line 327
    const v21, 0x4039999a    # 2.9f

    .line 328
    .line 329
    .line 330
    const/16 v22, 0x0

    .line 331
    .line 332
    const v23, 0x40ae147b    # 5.44f

    .line 333
    .line 334
    .line 335
    const v24, 0x3fc7ae14    # 1.56f

    .line 336
    .line 337
    .line 338
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 339
    .line 340
    .line 341
    const v25, -0x40547ae1    # -1.34f

    .line 342
    .line 343
    .line 344
    const v26, 0x3df5c28f    # 0.12f

    .line 345
    .line 346
    .line 347
    const v21, -0x4123d70a    # -0.43f

    .line 348
    .line 349
    .line 350
    const v22, 0x3d8f5c29    # 0.07f

    .line 351
    .line 352
    .line 353
    const v23, -0x409eb852    # -0.88f

    .line 354
    .line 355
    .line 356
    const v24, 0x3df5c28f    # 0.12f

    .line 357
    .line 358
    .line 359
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 360
    .line 361
    .line 362
    const v25, -0x3f251eb8    # -6.84f

    .line 363
    .line 364
    .line 365
    const v26, -0x3f87ae14    # -3.88f

    .line 366
    .line 367
    .line 368
    const v21, -0x3fc66666    # -2.9f

    .line 369
    .line 370
    .line 371
    const/16 v22, 0x0

    .line 372
    .line 373
    const v23, -0x3f51eb85    # -5.44f

    .line 374
    .line 375
    .line 376
    const v24, -0x403851ec    # -1.56f

    .line 377
    .line 378
    .line 379
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 380
    .line 381
    .line 382
    const v25, 0x3fab851f    # 1.34f

    .line 383
    .line 384
    .line 385
    const v26, -0x420a3d71    # -0.12f

    .line 386
    .line 387
    .line 388
    const v21, 0x3edc28f6    # 0.43f

    .line 389
    .line 390
    .line 391
    const v22, -0x4270a3d7    # -0.07f

    .line 392
    .line 393
    .line 394
    const v23, 0x3f6147ae    # 0.88f

    .line 395
    .line 396
    .line 397
    const v24, -0x420a3d71    # -0.12f

    .line 398
    .line 399
    .line 400
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 401
    .line 402
    .line 403
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 404
    .line 405
    .line 406
    const v4, 0x40a0f5c3    # 5.03f

    .line 407
    .line 408
    .line 409
    const v6, 0x410147ae    # 8.08f

    .line 410
    .line 411
    .line 412
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 413
    .line 414
    .line 415
    const v25, 0x408d70a4    # 4.42f

    .line 416
    .line 417
    .line 418
    const v26, 0x4117851f    # 9.47f

    .line 419
    .line 420
    .line 421
    const v21, 0x40ee6666    # 7.45f

    .line 422
    .line 423
    .line 424
    const v22, 0x40dd70a4    # 6.92f

    .line 425
    .line 426
    .line 427
    const v23, 0x40c428f6    # 6.13f

    .line 428
    .line 429
    .line 430
    const/high16 v24, 0x41080000    # 8.5f

    .line 431
    .line 432
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 433
    .line 434
    .line 435
    const v25, 0x410147ae    # 8.08f

    .line 436
    .line 437
    .line 438
    const v26, 0x40a0f5c3    # 5.03f

    .line 439
    .line 440
    .line 441
    const v21, 0x40a1999a    # 5.05f

    .line 442
    .line 443
    .line 444
    const v22, 0x40f28f5c    # 7.58f

    .line 445
    .line 446
    .line 447
    const v23, 0x40cbd70a    # 6.37f

    .line 448
    .line 449
    .line 450
    const/high16 v24, 0x40c00000    # 6.0f

    .line 451
    .line 452
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 453
    .line 454
    .line 455
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 456
    .line 457
    .line 458
    const/high16 v4, 0x41a00000    # 20.0f

    .line 459
    .line 460
    const/high16 v6, 0x41400000    # 12.0f

    .line 461
    .line 462
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 463
    .line 464
    .line 465
    const/high16 v25, -0x3f000000    # -8.0f

    .line 466
    .line 467
    const/high16 v26, -0x3f000000    # -8.0f

    .line 468
    .line 469
    const v21, -0x3f72e148    # -4.41f

    .line 470
    .line 471
    .line 472
    const/16 v22, 0x0

    .line 473
    .line 474
    const/high16 v23, -0x3f000000    # -8.0f

    .line 475
    .line 476
    const v24, -0x3f9a3d71    # -3.59f

    .line 477
    .line 478
    .line 479
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 480
    .line 481
    .line 482
    const v25, 0x3c23d70a    # 0.01f

    .line 483
    .line 484
    .line 485
    const v26, -0x41e66666    # -0.15f

    .line 486
    .line 487
    .line 488
    const/16 v21, 0x0

    .line 489
    .line 490
    const v22, -0x42b33333    # -0.05f

    .line 491
    .line 492
    .line 493
    const v23, 0x3c23d70a    # 0.01f

    .line 494
    .line 495
    .line 496
    const v24, -0x42333333    # -0.1f

    .line 497
    .line 498
    .line 499
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 500
    .line 501
    .line 502
    const v25, 0x40b7ae14    # 5.74f

    .line 503
    .line 504
    .line 505
    const v26, -0x3f4e6666    # -5.55f

    .line 506
    .line 507
    .line 508
    const v21, 0x40266666    # 2.6f

    .line 509
    .line 510
    .line 511
    const v22, -0x40851eb8    # -0.98f

    .line 512
    .line 513
    .line 514
    const v23, 0x4095c28f    # 4.68f

    .line 515
    .line 516
    .line 517
    const v24, -0x3fc0a3d7    # -2.99f

    .line 518
    .line 519
    .line 520
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 521
    .line 522
    .line 523
    const/high16 v25, 0x40f80000    # 7.75f

    .line 524
    .line 525
    const v26, 0x406ccccd    # 3.7f

    .line 526
    .line 527
    .line 528
    const v21, 0x3fea3d71    # 1.83f

    .line 529
    .line 530
    .line 531
    const v22, 0x4010a3d7    # 2.26f

    .line 532
    .line 533
    .line 534
    const v23, 0x4093d70a    # 4.62f

    .line 535
    .line 536
    .line 537
    const v24, 0x406ccccd    # 3.7f

    .line 538
    .line 539
    .line 540
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 541
    .line 542
    .line 543
    const v25, 0x400ae148    # 2.17f

    .line 544
    .line 545
    .line 546
    const v26, -0x418a3d71    # -0.24f

    .line 547
    .line 548
    .line 549
    const/high16 v21, 0x3f400000    # 0.75f

    .line 550
    .line 551
    const/16 v22, 0x0

    .line 552
    .line 553
    const v23, 0x3fbc28f6    # 1.47f

    .line 554
    .line 555
    .line 556
    const v24, -0x4247ae14    # -0.09f

    .line 557
    .line 558
    .line 559
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 560
    .line 561
    .line 562
    const v25, 0x3ea8f5c3    # 0.33f

    .line 563
    .line 564
    .line 565
    const v26, 0x400f5c29    # 2.24f

    .line 566
    .line 567
    .line 568
    const v21, 0x3e570a3d    # 0.21f

    .line 569
    .line 570
    .line 571
    const v22, 0x3f35c28f    # 0.71f

    .line 572
    .line 573
    .line 574
    const v23, 0x3ea8f5c3    # 0.33f

    .line 575
    .line 576
    .line 577
    const v24, 0x3fbae148    # 1.46f

    .line 578
    .line 579
    .line 580
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 581
    .line 582
    .line 583
    const/high16 v25, -0x3f000000    # -8.0f

    .line 584
    .line 585
    const/high16 v26, 0x41000000    # 8.0f

    .line 586
    .line 587
    const/16 v21, 0x0

    .line 588
    .line 589
    const v22, 0x408d1eb8    # 4.41f

    .line 590
    .line 591
    .line 592
    const v23, -0x3f9a3d71    # -3.59f

    .line 593
    .line 594
    .line 595
    const/high16 v24, 0x41000000    # 8.0f

    .line 596
    .line 597
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 598
    .line 599
    .line 600
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 601
    .line 602
    .line 603
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 604
    .line 605
    .line 606
    move-result-object v2

    .line 607
    const/high16 v6, 0x3f800000    # 1.0f

    .line 608
    .line 609
    const/high16 v8, 0x3f800000    # 1.0f

    .line 610
    .line 611
    const/4 v7, 0x0

    .line 612
    const-string v4, ""

    .line 613
    .line 614
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 615
    .line 616
    .line 617
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 618
    .line 619
    .line 620
    move-result v3

    .line 621
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 622
    .line 623
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 624
    .line 625
    .line 626
    move-result-wide v6

    .line 627
    const/4 v2, 0x0

    .line 628
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/e;)V

    .line 629
    .line 630
    .line 631
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 632
    .line 633
    .line 634
    move-result v10

    .line 635
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 636
    .line 637
    .line 638
    move-result v11

    .line 639
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 640
    .line 641
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 642
    .line 643
    .line 644
    const/high16 v4, 0x41100000    # 9.0f

    .line 645
    .line 646
    const/high16 v6, 0x41500000    # 13.0f

    .line 647
    .line 648
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 649
    .line 650
    .line 651
    const/4 v4, 0x0

    .line 652
    const/high16 v6, -0x40600000    # -1.25f

    .line 653
    .line 654
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 655
    .line 656
    .line 657
    const/high16 v26, 0x40200000    # 2.5f

    .line 658
    .line 659
    const/16 v27, 0x0

    .line 660
    .line 661
    const/high16 v21, 0x3fa00000    # 1.25f

    .line 662
    .line 663
    const/high16 v22, 0x3fa00000    # 1.25f

    .line 664
    .line 665
    const/16 v23, 0x0

    .line 666
    .line 667
    const/16 v24, 0x1

    .line 668
    .line 669
    const/16 v25, 0x1

    .line 670
    .line 671
    move-object/from16 v20, v2

    .line 672
    .line 673
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 674
    .line 675
    .line 676
    const/high16 v26, -0x3fe00000    # -2.5f

    .line 677
    .line 678
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 679
    .line 680
    .line 681
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 682
    .line 683
    .line 684
    move-result-object v2

    .line 685
    const/high16 v6, 0x3f800000    # 1.0f

    .line 686
    .line 687
    const/4 v7, 0x0

    .line 688
    const-string v4, ""

    .line 689
    .line 690
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 691
    .line 692
    .line 693
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 694
    .line 695
    .line 696
    move-result v3

    .line 697
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 698
    .line 699
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 700
    .line 701
    .line 702
    move-result-wide v6

    .line 703
    const/4 v0, 0x0

    .line 704
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/e;)V

    .line 705
    .line 706
    .line 707
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 708
    .line 709
    .line 710
    move-result v10

    .line 711
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 712
    .line 713
    .line 714
    move-result v11

    .line 715
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 716
    .line 717
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 718
    .line 719
    .line 720
    const/high16 v0, 0x41700000    # 15.0f

    .line 721
    .line 722
    const/high16 v2, 0x41500000    # 13.0f

    .line 723
    .line 724
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 725
    .line 726
    .line 727
    const/4 v0, 0x0

    .line 728
    const/high16 v2, -0x40600000    # -1.25f

    .line 729
    .line 730
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 731
    .line 732
    .line 733
    const/high16 v18, 0x40200000    # 2.5f

    .line 734
    .line 735
    const/16 v19, 0x0

    .line 736
    .line 737
    const/high16 v13, 0x3fa00000    # 1.25f

    .line 738
    .line 739
    const/high16 v14, 0x3fa00000    # 1.25f

    .line 740
    .line 741
    const/16 v16, 0x1

    .line 742
    .line 743
    const/16 v17, 0x1

    .line 744
    .line 745
    invoke-virtual/range {v12 .. v19}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 746
    .line 747
    .line 748
    const/high16 v18, -0x3fe00000    # -2.5f

    .line 749
    .line 750
    invoke-virtual/range {v12 .. v19}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 751
    .line 752
    .line 753
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 754
    .line 755
    .line 756
    move-result-object v2

    .line 757
    const/16 v16, 0x3800

    .line 758
    .line 759
    const/16 v17, 0x0

    .line 760
    .line 761
    const/high16 v6, 0x3f800000    # 1.0f

    .line 762
    .line 763
    const/4 v7, 0x0

    .line 764
    const/high16 v12, 0x3f800000    # 1.0f

    .line 765
    .line 766
    const/4 v13, 0x0

    .line 767
    const/4 v14, 0x0

    .line 768
    const-string v4, ""

    .line 769
    .line 770
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 771
    .line 772
    .line 773
    move-result-object v0

    .line 774
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 775
    .line 776
    .line 777
    move-result-object v0

    .line 778
    sput-object v0, Landroidx/compose/material/icons/twotone/FaceKt;->_face:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 779
    .line 780
    invoke-static {v0}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 781
    .line 782
    .line 783
    return-object v0
.end method
