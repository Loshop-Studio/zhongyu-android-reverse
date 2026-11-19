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
        "SMAP\nFace.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Face.kt\nandroidx/compose/material/icons/outlined/FaceKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,74:1\n122#2:75\n116#2,3:76\n119#2,3:80\n132#2,18:83\n152#2:120\n175#3:79\n694#4,2:101\n706#4,2:103\n708#4,11:109\n53#5,4:105\n*S KotlinDebug\n*F\n+ 1 Face.kt\nandroidx/compose/material/icons/outlined/FaceKt\n*L\n29#1:75\n29#1:76,3\n29#1:80,3\n30#1:83,18\n30#1:120\n29#1:79\n30#1:101,2\n30#1:103,2\n30#1:109,11\n30#1:105,4\n*E\n"
    }
.end annotation


# static fields
.field private static _face:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getFace(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 30

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    move-object/from16 v1, p0

    .line 4
    .line 5
    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    sget-object v0, Landroidx/compose/material/icons/outlined/FaceKt;->_face:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    return-object v0

    .line 16
    :cond_0
    const-string v2, "Outlined.Face"

    .line 17
    .line 18
    new-instance v1, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 19
    .line 20
    move-object v13, v1

    .line 21
    const/high16 v0, 0x41c00000    # 24.0f

    .line 22
    .line 23
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 28
    .line 29
    .line 30
    move-result v4

    .line 31
    const/high16 v5, 0x41c00000    # 24.0f

    .line 32
    .line 33
    const/high16 v6, 0x41c00000    # 24.0f

    .line 34
    .line 35
    const-wide/16 v7, 0x0

    .line 36
    .line 37
    const/4 v9, 0x0

    .line 38
    const/4 v10, 0x0

    .line 39
    const/16 v11, 0xe0

    .line 40
    .line 41
    const/4 v12, 0x0

    .line 42
    invoke-direct/range {v1 .. v12}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;-><init>(Ljava/lang/String;FFFFJIZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 43
    .line 44
    .line 45
    const/high16 v18, 0x3f800000    # 1.0f

    .line 46
    .line 47
    const/high16 v20, 0x3f800000    # 1.0f

    .line 48
    .line 49
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 50
    .line 51
    .line 52
    move-result v15

    .line 53
    new-instance v0, Landroidx/compose/ui/graphics/SolidColor;

    .line 54
    .line 55
    move-object/from16 v17, v0

    .line 56
    .line 57
    sget-object v1, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    .line 58
    .line 59
    invoke-virtual {v1}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 60
    .line 61
    .line 62
    move-result-wide v1

    .line 63
    const/4 v3, 0x0

    .line 64
    invoke-direct {v0, v1, v2, v3}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 65
    .line 66
    .line 67
    const/16 v19, 0x0

    .line 68
    .line 69
    const/high16 v21, 0x3f800000    # 1.0f

    .line 70
    .line 71
    sget-object v0, Landroidx/compose/ui/graphics/StrokeCap;->Companion:Landroidx/compose/ui/graphics/StrokeCap$Companion;

    .line 72
    .line 73
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 74
    .line 75
    .line 76
    move-result v22

    .line 77
    sget-object v0, Landroidx/compose/ui/graphics/StrokeJoin;->Companion:Landroidx/compose/ui/graphics/StrokeJoin$Companion;

    .line 78
    .line 79
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 80
    .line 81
    .line 82
    move-result v23

    .line 83
    const/high16 v24, 0x3f800000    # 1.0f

    .line 84
    .line 85
    const-string v16, ""

    .line 86
    .line 87
    new-instance v7, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 88
    .line 89
    invoke-direct {v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 90
    .line 91
    .line 92
    const/high16 v0, 0x41240000    # 10.25f

    .line 93
    .line 94
    const/high16 v8, 0x41500000    # 13.0f

    .line 95
    .line 96
    invoke-virtual {v7, v0, v8}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 97
    .line 98
    .line 99
    const/4 v1, 0x0

    .line 100
    const v2, 0x3f30a3d7    # 0.69f

    .line 101
    .line 102
    .line 103
    const v3, -0x40f0a3d7    # -0.56f

    .line 104
    .line 105
    .line 106
    const/high16 v4, 0x3fa00000    # 1.25f

    .line 107
    .line 108
    const/high16 v5, -0x40600000    # -1.25f

    .line 109
    .line 110
    const/high16 v6, 0x3fa00000    # 1.25f

    .line 111
    .line 112
    move-object v0, v7

    .line 113
    invoke-virtual/range {v0 .. v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 114
    .line 115
    .line 116
    const v0, 0x415b0a3d    # 13.69f

    .line 117
    .line 118
    .line 119
    const/high16 v1, 0x40f80000    # 7.75f

    .line 120
    .line 121
    invoke-virtual {v7, v1, v0, v1, v8}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 122
    .line 123
    .line 124
    const v8, 0x3f0f5c29    # 0.56f

    .line 125
    .line 126
    .line 127
    const/high16 v9, -0x40600000    # -1.25f

    .line 128
    .line 129
    const/high16 v10, 0x3fa00000    # 1.25f

    .line 130
    .line 131
    invoke-virtual {v7, v8, v9, v10, v9}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 132
    .line 133
    .line 134
    invoke-virtual {v7, v10, v8, v10, v10}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 135
    .line 136
    .line 137
    invoke-virtual {v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 138
    .line 139
    .line 140
    const/high16 v0, 0x41700000    # 15.0f

    .line 141
    .line 142
    const/high16 v1, 0x413c0000    # 11.75f

    .line 143
    .line 144
    invoke-virtual {v7, v0, v1}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 145
    .line 146
    .line 147
    const v1, -0x40cf5c29    # -0.69f

    .line 148
    .line 149
    .line 150
    const/4 v2, 0x0

    .line 151
    const/high16 v3, -0x40600000    # -1.25f

    .line 152
    .line 153
    const v4, 0x3f0f5c29    # 0.56f

    .line 154
    .line 155
    .line 156
    move-object v0, v7

    .line 157
    invoke-virtual/range {v0 .. v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 158
    .line 159
    .line 160
    invoke-virtual {v7, v8, v10, v10, v10}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 161
    .line 162
    .line 163
    const v0, -0x40f0a3d7    # -0.56f

    .line 164
    .line 165
    .line 166
    invoke-virtual {v7, v10, v0, v10, v9}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 167
    .line 168
    .line 169
    invoke-virtual {v7, v0, v9, v9, v9}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 170
    .line 171
    .line 172
    invoke-virtual {v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 173
    .line 174
    .line 175
    const/high16 v0, 0x41b00000    # 22.0f

    .line 176
    .line 177
    const/high16 v8, 0x41400000    # 12.0f

    .line 178
    .line 179
    invoke-virtual {v7, v0, v8}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 180
    .line 181
    .line 182
    const/4 v1, 0x0

    .line 183
    const v2, 0x40b0a3d7    # 5.52f

    .line 184
    .line 185
    .line 186
    const v3, -0x3f70a3d7    # -4.48f

    .line 187
    .line 188
    .line 189
    const/high16 v4, 0x41200000    # 10.0f

    .line 190
    .line 191
    const/high16 v5, -0x3ee00000    # -10.0f

    .line 192
    .line 193
    const/high16 v6, 0x41200000    # 10.0f

    .line 194
    .line 195
    move-object v0, v7

    .line 196
    invoke-virtual/range {v0 .. v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 197
    .line 198
    .line 199
    const v0, 0x418c28f6    # 17.52f

    .line 200
    .line 201
    .line 202
    const/high16 v1, 0x40000000    # 2.0f

    .line 203
    .line 204
    invoke-virtual {v7, v1, v0, v1, v8}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 205
    .line 206
    .line 207
    const v0, 0x40cf5c29    # 6.48f

    .line 208
    .line 209
    .line 210
    invoke-virtual {v7, v0, v1, v8, v1}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 211
    .line 212
    .line 213
    const v0, 0x408f5c29    # 4.48f

    .line 214
    .line 215
    .line 216
    const/high16 v1, 0x41200000    # 10.0f

    .line 217
    .line 218
    invoke-virtual {v7, v1, v0, v1, v1}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 219
    .line 220
    .line 221
    invoke-virtual {v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 222
    .line 223
    .line 224
    const v0, 0x412a8f5c    # 10.66f

    .line 225
    .line 226
    .line 227
    const v1, 0x4083d70a    # 4.12f

    .line 228
    .line 229
    .line 230
    invoke-virtual {v7, v0, v1}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 231
    .line 232
    .line 233
    const v1, 0x4140f5c3    # 12.06f

    .line 234
    .line 235
    .line 236
    const v2, 0x40ce147b    # 6.44f

    .line 237
    .line 238
    .line 239
    const v3, 0x4169999a    # 14.6f

    .line 240
    .line 241
    .line 242
    const/high16 v4, 0x41000000    # 8.0f

    .line 243
    .line 244
    const/high16 v5, 0x418c0000    # 17.5f

    .line 245
    .line 246
    const/high16 v6, 0x41000000    # 8.0f

    .line 247
    .line 248
    move-object v0, v7

    .line 249
    invoke-virtual/range {v0 .. v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 250
    .line 251
    .line 252
    const v1, 0x3eeb851f    # 0.46f

    .line 253
    .line 254
    .line 255
    const/4 v2, 0x0

    .line 256
    const v3, 0x3f68f5c3    # 0.91f

    .line 257
    .line 258
    .line 259
    const v4, -0x42b33333    # -0.05f

    .line 260
    .line 261
    .line 262
    const v5, 0x3fab851f    # 1.34f

    .line 263
    .line 264
    .line 265
    const v6, -0x420a3d71    # -0.12f

    .line 266
    .line 267
    .line 268
    invoke-virtual/range {v0 .. v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 269
    .line 270
    .line 271
    const v1, 0x418b851f    # 17.44f

    .line 272
    .line 273
    .line 274
    const v2, 0x40b1eb85    # 5.56f

    .line 275
    .line 276
    .line 277
    const v3, 0x416e6666    # 14.9f

    .line 278
    .line 279
    .line 280
    const/high16 v4, 0x40800000    # 4.0f

    .line 281
    .line 282
    const/high16 v5, 0x41400000    # 12.0f

    .line 283
    .line 284
    const/high16 v6, 0x40800000    # 4.0f

    .line 285
    .line 286
    invoke-virtual/range {v0 .. v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 287
    .line 288
    .line 289
    const v1, -0x41147ae1    # -0.46f

    .line 290
    .line 291
    .line 292
    const/4 v2, 0x0

    .line 293
    const v3, -0x40970a3d    # -0.91f

    .line 294
    .line 295
    .line 296
    const v4, 0x3d4ccccd    # 0.05f

    .line 297
    .line 298
    .line 299
    const v5, -0x40547ae1    # -1.34f

    .line 300
    .line 301
    .line 302
    const v6, 0x3df5c28f    # 0.12f

    .line 303
    .line 304
    .line 305
    invoke-virtual/range {v0 .. v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 306
    .line 307
    .line 308
    invoke-virtual {v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 309
    .line 310
    .line 311
    const v0, 0x408d70a4    # 4.42f

    .line 312
    .line 313
    .line 314
    const v1, 0x4117851f    # 9.47f

    .line 315
    .line 316
    .line 317
    invoke-virtual {v7, v0, v1}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 318
    .line 319
    .line 320
    const v1, 0x3fdae148    # 1.71f

    .line 321
    .line 322
    .line 323
    const v2, -0x4087ae14    # -0.97f

    .line 324
    .line 325
    .line 326
    const v3, 0x4041eb85    # 3.03f

    .line 327
    .line 328
    .line 329
    const v4, -0x3fdccccd    # -2.55f

    .line 330
    .line 331
    .line 332
    const v5, 0x406a3d71    # 3.66f

    .line 333
    .line 334
    .line 335
    const v6, -0x3f71eb85    # -4.44f

    .line 336
    .line 337
    .line 338
    move-object v0, v7

    .line 339
    invoke-virtual/range {v0 .. v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 340
    .line 341
    .line 342
    const v1, 0x40cbd70a    # 6.37f

    .line 343
    .line 344
    .line 345
    const/high16 v2, 0x40c00000    # 6.0f

    .line 346
    .line 347
    const v3, 0x40a1999a    # 5.05f

    .line 348
    .line 349
    .line 350
    const v4, 0x40f28f5c    # 7.58f

    .line 351
    .line 352
    .line 353
    const v5, 0x408d70a4    # 4.42f

    .line 354
    .line 355
    .line 356
    const v6, 0x4117851f    # 9.47f

    .line 357
    .line 358
    .line 359
    invoke-virtual/range {v0 .. v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 360
    .line 361
    .line 362
    invoke-virtual {v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 363
    .line 364
    .line 365
    const/high16 v0, 0x41a00000    # 20.0f

    .line 366
    .line 367
    invoke-virtual {v7, v0, v8}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 368
    .line 369
    .line 370
    const/4 v1, 0x0

    .line 371
    const v2, -0x40b851ec    # -0.78f

    .line 372
    .line 373
    .line 374
    const v3, -0x420a3d71    # -0.12f

    .line 375
    .line 376
    .line 377
    const v4, -0x403c28f6    # -1.53f

    .line 378
    .line 379
    .line 380
    const v5, -0x41570a3d    # -0.33f

    .line 381
    .line 382
    .line 383
    const v6, -0x3ff0a3d7    # -2.24f

    .line 384
    .line 385
    .line 386
    move-object v0, v7

    .line 387
    invoke-virtual/range {v0 .. v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 388
    .line 389
    .line 390
    const v1, -0x40cccccd    # -0.7f

    .line 391
    .line 392
    .line 393
    const v2, 0x3e19999a    # 0.15f

    .line 394
    .line 395
    .line 396
    const v3, -0x404a3d71    # -1.42f

    .line 397
    .line 398
    .line 399
    const v4, 0x3e75c28f    # 0.24f

    .line 400
    .line 401
    .line 402
    const v5, -0x3ff51eb8    # -2.17f

    .line 403
    .line 404
    .line 405
    const v6, 0x3e75c28f    # 0.24f

    .line 406
    .line 407
    .line 408
    invoke-virtual/range {v0 .. v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 409
    .line 410
    .line 411
    const v1, -0x3fb7ae14    # -3.13f

    .line 412
    .line 413
    .line 414
    const/4 v2, 0x0

    .line 415
    const v3, -0x3f428f5c    # -5.92f

    .line 416
    .line 417
    .line 418
    const v4, -0x4047ae14    # -1.44f

    .line 419
    .line 420
    .line 421
    const v5, -0x3f07ae14    # -7.76f

    .line 422
    .line 423
    .line 424
    const v6, -0x3f93d70a    # -3.69f

    .line 425
    .line 426
    .line 427
    invoke-virtual/range {v0 .. v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 428
    .line 429
    .line 430
    const v1, 0x410b0a3d    # 8.69f

    .line 431
    .line 432
    .line 433
    const v2, 0x410deb85    # 8.87f

    .line 434
    .line 435
    .line 436
    const v3, 0x40d33333    # 6.6f

    .line 437
    .line 438
    .line 439
    const v4, 0x412e147b    # 10.88f

    .line 440
    .line 441
    .line 442
    const/high16 v5, 0x40800000    # 4.0f

    .line 443
    .line 444
    const v6, 0x413dc28f    # 11.86f

    .line 445
    .line 446
    .line 447
    invoke-virtual/range {v0 .. v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 448
    .line 449
    .line 450
    const v1, 0x3c23d70a    # 0.01f

    .line 451
    .line 452
    .line 453
    const v2, 0x3d23d70a    # 0.04f

    .line 454
    .line 455
    .line 456
    const/4 v3, 0x0

    .line 457
    const v4, 0x3db851ec    # 0.09f

    .line 458
    .line 459
    .line 460
    const/4 v5, 0x0

    .line 461
    const v6, 0x3e0f5c29    # 0.14f

    .line 462
    .line 463
    .line 464
    invoke-virtual/range {v0 .. v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 465
    .line 466
    .line 467
    const/4 v1, 0x0

    .line 468
    const v2, 0x408d1eb8    # 4.41f

    .line 469
    .line 470
    .line 471
    const v3, 0x4065c28f    # 3.59f

    .line 472
    .line 473
    .line 474
    const/high16 v4, 0x41000000    # 8.0f

    .line 475
    .line 476
    const/high16 v5, 0x41000000    # 8.0f

    .line 477
    .line 478
    const/high16 v6, 0x41000000    # 8.0f

    .line 479
    .line 480
    invoke-virtual/range {v0 .. v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 481
    .line 482
    .line 483
    const v0, -0x3f9a3d71    # -3.59f

    .line 484
    .line 485
    .line 486
    const/high16 v1, -0x3f000000    # -8.0f

    .line 487
    .line 488
    const/high16 v2, 0x41000000    # 8.0f

    .line 489
    .line 490
    invoke-virtual {v7, v2, v0, v2, v1}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 491
    .line 492
    .line 493
    invoke-virtual {v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 494
    .line 495
    .line 496
    invoke-virtual {v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 497
    .line 498
    .line 499
    move-result-object v14

    .line 500
    const/16 v25, 0x0

    .line 501
    .line 502
    const/16 v26, 0x0

    .line 503
    .line 504
    const/16 v27, 0x0

    .line 505
    .line 506
    const/16 v28, 0x3800

    .line 507
    .line 508
    const/16 v29, 0x0

    .line 509
    .line 510
    invoke-static/range {v13 .. v29}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 511
    .line 512
    .line 513
    move-result-object v0

    .line 514
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 515
    .line 516
    .line 517
    move-result-object v0

    .line 518
    sput-object v0, Landroidx/compose/material/icons/outlined/FaceKt;->_face:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 519
    .line 520
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 521
    .line 522
    .line 523
    return-object v0
.end method
