.class public final Landroidx/compose/material/icons/outlined/FaceKt;
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
        "Landroidx/compose/material/icons/Icons$Outlined;",
        "getFace",
        "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;",
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
        "SMAP\nFace.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Face.kt\nandroidx/compose/material/icons/outlined/FaceKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,74:1\n212#2,12:75\n233#2,18:88\n253#2:125\n174#3:87\n705#4,2:106\n717#4,2:108\n719#4,11:114\n72#5,4:110\n*S KotlinDebug\n*F\n+ 1 Face.kt\nandroidx/compose/material/icons/outlined/FaceKt\n*L\n29#1:75,12\n30#1:88,18\n30#1:125\n29#1:87\n30#1:106,2\n30#1:108,2\n30#1:114,11\n30#1:110,4\n*E\n"
    }
.end annotation


# static fields
.field private static _face:Landroidx/compose/ui/graphics/vector/ImageVector;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field


# direct methods
.method public static final getFace(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19
    .param p0    # Landroidx/compose/material/icons/Icons$Outlined;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    sget-object v0, Landroidx/compose/material/icons/outlined/FaceKt;->_face:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Outlined.Face"

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
    const/4 v0, 0x0

    .line 50
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/e;)V

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
    const/high16 v0, 0x41240000    # 10.25f

    .line 66
    .line 67
    const/high16 v2, 0x41500000    # 13.0f

    .line 68
    .line 69
    invoke-static {v0, v2}, Lg/a;->a(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 70
    .line 71
    .line 72
    move-result-object v12

    .line 73
    const/high16 v17, -0x40600000    # -1.25f

    .line 74
    .line 75
    const/high16 v18, 0x3fa00000    # 1.25f

    .line 76
    .line 77
    const/4 v13, 0x0

    .line 78
    const v14, 0x3f30a3d7    # 0.69f

    .line 79
    .line 80
    .line 81
    const v15, -0x40f0a3d7    # -0.56f

    .line 82
    .line 83
    .line 84
    const/high16 v16, 0x3fa00000    # 1.25f

    .line 85
    .line 86
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 87
    .line 88
    .line 89
    const v0, 0x415b0a3d    # 13.69f

    .line 90
    .line 91
    .line 92
    const/high16 v2, 0x40f80000    # 7.75f

    .line 93
    .line 94
    const/high16 v4, 0x41500000    # 13.0f

    .line 95
    .line 96
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 97
    .line 98
    .line 99
    const v0, 0x3f0f5c29    # 0.56f

    .line 100
    .line 101
    .line 102
    const/high16 v2, -0x40600000    # -1.25f

    .line 103
    .line 104
    const/high16 v4, 0x3fa00000    # 1.25f

    .line 105
    .line 106
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 107
    .line 108
    .line 109
    const/high16 v2, 0x3fa00000    # 1.25f

    .line 110
    .line 111
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 112
    .line 113
    .line 114
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 115
    .line 116
    .line 117
    const/high16 v0, 0x41700000    # 15.0f

    .line 118
    .line 119
    const/high16 v2, 0x413c0000    # 11.75f

    .line 120
    .line 121
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 122
    .line 123
    .line 124
    const v13, -0x40cf5c29    # -0.69f

    .line 125
    .line 126
    .line 127
    const/4 v14, 0x0

    .line 128
    const/high16 v15, -0x40600000    # -1.25f

    .line 129
    .line 130
    const v16, 0x3f0f5c29    # 0.56f

    .line 131
    .line 132
    .line 133
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 134
    .line 135
    .line 136
    const v0, 0x3f0f5c29    # 0.56f

    .line 137
    .line 138
    .line 139
    const/high16 v2, 0x3fa00000    # 1.25f

    .line 140
    .line 141
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 142
    .line 143
    .line 144
    const v0, -0x40f0a3d7    # -0.56f

    .line 145
    .line 146
    .line 147
    const/high16 v2, -0x40600000    # -1.25f

    .line 148
    .line 149
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 150
    .line 151
    .line 152
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 153
    .line 154
    .line 155
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 156
    .line 157
    .line 158
    const/high16 v0, 0x41b00000    # 22.0f

    .line 159
    .line 160
    const/high16 v2, 0x41400000    # 12.0f

    .line 161
    .line 162
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 163
    .line 164
    .line 165
    const/high16 v17, -0x3ee00000    # -10.0f

    .line 166
    .line 167
    const/high16 v18, 0x41200000    # 10.0f

    .line 168
    .line 169
    const/4 v13, 0x0

    .line 170
    const v14, 0x40b0a3d7    # 5.52f

    .line 171
    .line 172
    .line 173
    const v15, -0x3f70a3d7    # -4.48f

    .line 174
    .line 175
    .line 176
    const/high16 v16, 0x41200000    # 10.0f

    .line 177
    .line 178
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 179
    .line 180
    .line 181
    const v0, 0x418c28f6    # 17.52f

    .line 182
    .line 183
    .line 184
    const/high16 v2, 0x40000000    # 2.0f

    .line 185
    .line 186
    const/high16 v4, 0x41400000    # 12.0f

    .line 187
    .line 188
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 189
    .line 190
    .line 191
    const v0, 0x40cf5c29    # 6.48f

    .line 192
    .line 193
    .line 194
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 195
    .line 196
    .line 197
    const v0, 0x408f5c29    # 4.48f

    .line 198
    .line 199
    .line 200
    const/high16 v2, 0x41200000    # 10.0f

    .line 201
    .line 202
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 203
    .line 204
    .line 205
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 206
    .line 207
    .line 208
    const v0, 0x412a8f5c    # 10.66f

    .line 209
    .line 210
    .line 211
    const v2, 0x4083d70a    # 4.12f

    .line 212
    .line 213
    .line 214
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 215
    .line 216
    .line 217
    const/high16 v17, 0x418c0000    # 17.5f

    .line 218
    .line 219
    const/high16 v18, 0x41000000    # 8.0f

    .line 220
    .line 221
    const v13, 0x4140f5c3    # 12.06f

    .line 222
    .line 223
    .line 224
    const v14, 0x40ce147b    # 6.44f

    .line 225
    .line 226
    .line 227
    const v15, 0x4169999a    # 14.6f

    .line 228
    .line 229
    .line 230
    const/high16 v16, 0x41000000    # 8.0f

    .line 231
    .line 232
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 233
    .line 234
    .line 235
    const v17, 0x3fab851f    # 1.34f

    .line 236
    .line 237
    .line 238
    const v18, -0x420a3d71    # -0.12f

    .line 239
    .line 240
    .line 241
    const v13, 0x3eeb851f    # 0.46f

    .line 242
    .line 243
    .line 244
    const/4 v14, 0x0

    .line 245
    const v15, 0x3f68f5c3    # 0.91f

    .line 246
    .line 247
    .line 248
    const v16, -0x42b33333    # -0.05f

    .line 249
    .line 250
    .line 251
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 252
    .line 253
    .line 254
    const/high16 v17, 0x41400000    # 12.0f

    .line 255
    .line 256
    const/high16 v18, 0x40800000    # 4.0f

    .line 257
    .line 258
    const v13, 0x418b851f    # 17.44f

    .line 259
    .line 260
    .line 261
    const v14, 0x40b1eb85    # 5.56f

    .line 262
    .line 263
    .line 264
    const v15, 0x416e6666    # 14.9f

    .line 265
    .line 266
    .line 267
    const/high16 v16, 0x40800000    # 4.0f

    .line 268
    .line 269
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 270
    .line 271
    .line 272
    const v17, -0x40547ae1    # -1.34f

    .line 273
    .line 274
    .line 275
    const v18, 0x3df5c28f    # 0.12f

    .line 276
    .line 277
    .line 278
    const v13, -0x41147ae1    # -0.46f

    .line 279
    .line 280
    .line 281
    const/4 v14, 0x0

    .line 282
    const v15, -0x40970a3d    # -0.91f

    .line 283
    .line 284
    .line 285
    const v16, 0x3d4ccccd    # 0.05f

    .line 286
    .line 287
    .line 288
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 289
    .line 290
    .line 291
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 292
    .line 293
    .line 294
    const v0, 0x408d70a4    # 4.42f

    .line 295
    .line 296
    .line 297
    const v2, 0x4117851f    # 9.47f

    .line 298
    .line 299
    .line 300
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 301
    .line 302
    .line 303
    const v17, 0x406a3d71    # 3.66f

    .line 304
    .line 305
    .line 306
    const v18, -0x3f71eb85    # -4.44f

    .line 307
    .line 308
    .line 309
    const v13, 0x3fdae148    # 1.71f

    .line 310
    .line 311
    .line 312
    const v14, -0x4087ae14    # -0.97f

    .line 313
    .line 314
    .line 315
    const v15, 0x4041eb85    # 3.03f

    .line 316
    .line 317
    .line 318
    const v16, -0x3fdccccd    # -2.55f

    .line 319
    .line 320
    .line 321
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 322
    .line 323
    .line 324
    const v17, 0x408d70a4    # 4.42f

    .line 325
    .line 326
    .line 327
    const v18, 0x4117851f    # 9.47f

    .line 328
    .line 329
    .line 330
    const v13, 0x40cbd70a    # 6.37f

    .line 331
    .line 332
    .line 333
    const/high16 v14, 0x40c00000    # 6.0f

    .line 334
    .line 335
    const v15, 0x40a1999a    # 5.05f

    .line 336
    .line 337
    .line 338
    const v16, 0x40f28f5c    # 7.58f

    .line 339
    .line 340
    .line 341
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 342
    .line 343
    .line 344
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 345
    .line 346
    .line 347
    const/high16 v0, 0x41a00000    # 20.0f

    .line 348
    .line 349
    const/high16 v2, 0x41400000    # 12.0f

    .line 350
    .line 351
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 352
    .line 353
    .line 354
    const v17, -0x41570a3d    # -0.33f

    .line 355
    .line 356
    .line 357
    const v18, -0x3ff0a3d7    # -2.24f

    .line 358
    .line 359
    .line 360
    const/4 v13, 0x0

    .line 361
    const v14, -0x40b851ec    # -0.78f

    .line 362
    .line 363
    .line 364
    const v15, -0x420a3d71    # -0.12f

    .line 365
    .line 366
    .line 367
    const v16, -0x403c28f6    # -1.53f

    .line 368
    .line 369
    .line 370
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 371
    .line 372
    .line 373
    const v17, -0x3ff51eb8    # -2.17f

    .line 374
    .line 375
    .line 376
    const v18, 0x3e75c28f    # 0.24f

    .line 377
    .line 378
    .line 379
    const v13, -0x40cccccd    # -0.7f

    .line 380
    .line 381
    .line 382
    const v14, 0x3e19999a    # 0.15f

    .line 383
    .line 384
    .line 385
    const v15, -0x404a3d71    # -1.42f

    .line 386
    .line 387
    .line 388
    const v16, 0x3e75c28f    # 0.24f

    .line 389
    .line 390
    .line 391
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 392
    .line 393
    .line 394
    const v17, -0x3f07ae14    # -7.76f

    .line 395
    .line 396
    .line 397
    const v18, -0x3f93d70a    # -3.69f

    .line 398
    .line 399
    .line 400
    const v13, -0x3fb7ae14    # -3.13f

    .line 401
    .line 402
    .line 403
    const/4 v14, 0x0

    .line 404
    const v15, -0x3f428f5c    # -5.92f

    .line 405
    .line 406
    .line 407
    const v16, -0x4047ae14    # -1.44f

    .line 408
    .line 409
    .line 410
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 411
    .line 412
    .line 413
    const/high16 v17, 0x40800000    # 4.0f

    .line 414
    .line 415
    const v18, 0x413dc28f    # 11.86f

    .line 416
    .line 417
    .line 418
    const v13, 0x410b0a3d    # 8.69f

    .line 419
    .line 420
    .line 421
    const v14, 0x410deb85    # 8.87f

    .line 422
    .line 423
    .line 424
    const v15, 0x40d33333    # 6.6f

    .line 425
    .line 426
    .line 427
    const v16, 0x412e147b    # 10.88f

    .line 428
    .line 429
    .line 430
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 431
    .line 432
    .line 433
    const/16 v17, 0x0

    .line 434
    .line 435
    const v18, 0x3e0f5c29    # 0.14f

    .line 436
    .line 437
    .line 438
    const v13, 0x3c23d70a    # 0.01f

    .line 439
    .line 440
    .line 441
    const v14, 0x3d23d70a    # 0.04f

    .line 442
    .line 443
    .line 444
    const/4 v15, 0x0

    .line 445
    const v16, 0x3db851ec    # 0.09f

    .line 446
    .line 447
    .line 448
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 449
    .line 450
    .line 451
    const/high16 v17, 0x41000000    # 8.0f

    .line 452
    .line 453
    const/high16 v18, 0x41000000    # 8.0f

    .line 454
    .line 455
    const/4 v13, 0x0

    .line 456
    const v14, 0x408d1eb8    # 4.41f

    .line 457
    .line 458
    .line 459
    const v15, 0x4065c28f    # 3.59f

    .line 460
    .line 461
    .line 462
    const/high16 v16, 0x41000000    # 8.0f

    .line 463
    .line 464
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 465
    .line 466
    .line 467
    const v0, -0x3f9a3d71    # -3.59f

    .line 468
    .line 469
    .line 470
    const/high16 v2, -0x3f000000    # -8.0f

    .line 471
    .line 472
    const/high16 v4, 0x41000000    # 8.0f

    .line 473
    .line 474
    invoke-static {v12, v4, v0, v4, v2}, Lg/a;->h(Landroidx/compose/ui/graphics/vector/PathBuilder;FFFF)Ljava/util/List;

    .line 475
    .line 476
    .line 477
    move-result-object v2

    .line 478
    const/16 v16, 0x3800

    .line 479
    .line 480
    const/16 v17, 0x0

    .line 481
    .line 482
    const/high16 v6, 0x3f800000    # 1.0f

    .line 483
    .line 484
    const/high16 v8, 0x3f800000    # 1.0f

    .line 485
    .line 486
    const/4 v7, 0x0

    .line 487
    const/high16 v9, 0x3f800000    # 1.0f

    .line 488
    .line 489
    const/high16 v12, 0x3f800000    # 1.0f

    .line 490
    .line 491
    const/4 v14, 0x0

    .line 492
    const/4 v15, 0x0

    .line 493
    const-string v4, ""

    .line 494
    .line 495
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 496
    .line 497
    .line 498
    move-result-object v0

    .line 499
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 500
    .line 501
    .line 502
    move-result-object v0

    .line 503
    sput-object v0, Landroidx/compose/material/icons/outlined/FaceKt;->_face:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 504
    .line 505
    invoke-static {v0}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 506
    .line 507
    .line 508
    return-object v0
.end method
