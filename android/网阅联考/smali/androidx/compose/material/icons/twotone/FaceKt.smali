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
        "SMAP\nFace.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Face.kt\nandroidx/compose/material/icons/twotone/FaceKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,86:1\n122#2:87\n116#2,3:88\n119#2,3:92\n132#2,18:95\n152#2:132\n132#2,18:133\n152#2:170\n132#2,18:171\n152#2:208\n132#2,18:209\n152#2:246\n175#3:91\n694#4,2:113\n706#4,2:115\n708#4,11:121\n694#4,2:151\n706#4,2:153\n708#4,11:159\n694#4,2:189\n706#4,2:191\n708#4,11:197\n694#4,2:227\n706#4,2:229\n708#4,11:235\n53#5,4:117\n53#5,4:155\n53#5,4:193\n53#5,4:231\n*S KotlinDebug\n*F\n+ 1 Face.kt\nandroidx/compose/material/icons/twotone/FaceKt\n*L\n29#1:87\n29#1:88,3\n29#1:92,3\n30#1:95,18\n30#1:132\n42#1:133,18\n42#1:170\n69#1:171,18\n69#1:208\n75#1:209,18\n75#1:246\n29#1:91\n30#1:113,2\n30#1:115,2\n30#1:121,11\n42#1:151,2\n42#1:153,2\n42#1:159,11\n69#1:189,2\n69#1:191,2\n69#1:197,11\n75#1:227,2\n75#1:229,2\n75#1:235,11\n30#1:117,4\n42#1:155,4\n69#1:193,4\n75#1:231,4\n*E\n"
    }
.end annotation


# static fields
.field private static _face:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getFace(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 81

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
    sget-object v0, Landroidx/compose/material/icons/twotone/FaceKt;->_face:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.Face"

    .line 17
    .line 18
    new-instance v1, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 19
    .line 20
    move-object/from16 v64, v1

    .line 21
    .line 22
    move-object/from16 v47, v1

    .line 23
    .line 24
    move-object/from16 v30, v1

    .line 25
    .line 26
    move-object v13, v1

    .line 27
    const/high16 v0, 0x41c00000    # 24.0f

    .line 28
    .line 29
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 30
    .line 31
    .line 32
    move-result v3

    .line 33
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 34
    .line 35
    .line 36
    move-result v4

    .line 37
    const/high16 v5, 0x41c00000    # 24.0f

    .line 38
    .line 39
    const/high16 v6, 0x41c00000    # 24.0f

    .line 40
    .line 41
    const-wide/16 v7, 0x0

    .line 42
    .line 43
    const/4 v9, 0x0

    .line 44
    const/4 v10, 0x0

    .line 45
    const/16 v11, 0xe0

    .line 46
    .line 47
    const/4 v12, 0x0

    .line 48
    invoke-direct/range {v1 .. v12}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;-><init>(Ljava/lang/String;FFFFJIZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 49
    .line 50
    .line 51
    const v18, 0x3e99999a    # 0.3f

    .line 52
    .line 53
    .line 54
    const v20, 0x3e99999a    # 0.3f

    .line 55
    .line 56
    .line 57
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 58
    .line 59
    .line 60
    move-result v15

    .line 61
    new-instance v0, Landroidx/compose/ui/graphics/SolidColor;

    .line 62
    .line 63
    move-object/from16 v17, v0

    .line 64
    .line 65
    sget-object v1, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    .line 66
    .line 67
    invoke-virtual {v1}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 68
    .line 69
    .line 70
    move-result-wide v2

    .line 71
    const/4 v4, 0x0

    .line 72
    invoke-direct {v0, v2, v3, v4}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 73
    .line 74
    .line 75
    const/16 v19, 0x0

    .line 76
    .line 77
    const/high16 v21, 0x3f800000    # 1.0f

    .line 78
    .line 79
    sget-object v0, Landroidx/compose/ui/graphics/StrokeCap;->Companion:Landroidx/compose/ui/graphics/StrokeCap$Companion;

    .line 80
    .line 81
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 82
    .line 83
    .line 84
    move-result v22

    .line 85
    sget-object v2, Landroidx/compose/ui/graphics/StrokeJoin;->Companion:Landroidx/compose/ui/graphics/StrokeJoin$Companion;

    .line 86
    .line 87
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 88
    .line 89
    .line 90
    move-result v23

    .line 91
    const/high16 v24, 0x3f800000    # 1.0f

    .line 92
    .line 93
    const-string v16, ""

    .line 94
    .line 95
    new-instance v3, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 96
    .line 97
    invoke-direct {v3}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 98
    .line 99
    .line 100
    const/high16 v5, 0x418c0000    # 17.5f

    .line 101
    .line 102
    const/high16 v6, 0x41000000    # 8.0f

    .line 103
    .line 104
    invoke-virtual {v3, v5, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 105
    .line 106
    .line 107
    const v6, 0x3eeb851f    # 0.46f

    .line 108
    .line 109
    .line 110
    const/4 v7, 0x0

    .line 111
    const v8, 0x3f68f5c3    # 0.91f

    .line 112
    .line 113
    .line 114
    const v9, -0x42b33333    # -0.05f

    .line 115
    .line 116
    .line 117
    const v10, 0x3fab851f    # 1.34f

    .line 118
    .line 119
    .line 120
    const v11, -0x420a3d71    # -0.12f

    .line 121
    .line 122
    .line 123
    move-object v5, v3

    .line 124
    invoke-virtual/range {v5 .. v11}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 125
    .line 126
    .line 127
    const v6, 0x418b851f    # 17.44f

    .line 128
    .line 129
    .line 130
    const v7, 0x40b1eb85    # 5.56f

    .line 131
    .line 132
    .line 133
    const v8, 0x416e6666    # 14.9f

    .line 134
    .line 135
    .line 136
    const/high16 v9, 0x40800000    # 4.0f

    .line 137
    .line 138
    const/high16 v10, 0x41400000    # 12.0f

    .line 139
    .line 140
    const/high16 v11, 0x40800000    # 4.0f

    .line 141
    .line 142
    invoke-virtual/range {v5 .. v11}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 143
    .line 144
    .line 145
    const v6, -0x41147ae1    # -0.46f

    .line 146
    .line 147
    .line 148
    const/4 v7, 0x0

    .line 149
    const v8, -0x40970a3d    # -0.91f

    .line 150
    .line 151
    .line 152
    const v9, 0x3d4ccccd    # 0.05f

    .line 153
    .line 154
    .line 155
    const v10, -0x40547ae1    # -1.34f

    .line 156
    .line 157
    .line 158
    const v11, 0x3df5c28f    # 0.12f

    .line 159
    .line 160
    .line 161
    invoke-virtual/range {v5 .. v11}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 162
    .line 163
    .line 164
    const v6, 0x4140f5c3    # 12.06f

    .line 165
    .line 166
    .line 167
    const v7, 0x40ce147b    # 6.44f

    .line 168
    .line 169
    .line 170
    const v8, 0x4169999a    # 14.6f

    .line 171
    .line 172
    .line 173
    const/high16 v9, 0x41000000    # 8.0f

    .line 174
    .line 175
    const/high16 v10, 0x418c0000    # 17.5f

    .line 176
    .line 177
    const/high16 v11, 0x41000000    # 8.0f

    .line 178
    .line 179
    invoke-virtual/range {v5 .. v11}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 180
    .line 181
    .line 182
    invoke-virtual {v3}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 183
    .line 184
    .line 185
    const v12, 0x410147ae    # 8.08f

    .line 186
    .line 187
    .line 188
    const v14, 0x40a0f5c3    # 5.03f

    .line 189
    .line 190
    .line 191
    invoke-virtual {v3, v12, v14}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 192
    .line 193
    .line 194
    const v6, 0x40cbd70a    # 6.37f

    .line 195
    .line 196
    .line 197
    const/high16 v7, 0x40c00000    # 6.0f

    .line 198
    .line 199
    const v8, 0x40a1999a    # 5.05f

    .line 200
    .line 201
    .line 202
    const v9, 0x40f28f5c    # 7.58f

    .line 203
    .line 204
    .line 205
    const v10, 0x408d70a4    # 4.42f

    .line 206
    .line 207
    .line 208
    const v11, 0x4117851f    # 9.47f

    .line 209
    .line 210
    .line 211
    invoke-virtual/range {v5 .. v11}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 212
    .line 213
    .line 214
    const v6, 0x3fdae148    # 1.71f

    .line 215
    .line 216
    .line 217
    const v7, -0x4087ae14    # -0.97f

    .line 218
    .line 219
    .line 220
    const v8, 0x4041eb85    # 3.03f

    .line 221
    .line 222
    .line 223
    const v9, -0x3fdccccd    # -2.55f

    .line 224
    .line 225
    .line 226
    const v10, 0x406a3d71    # 3.66f

    .line 227
    .line 228
    .line 229
    const v11, -0x3f71eb85    # -4.44f

    .line 230
    .line 231
    .line 232
    invoke-virtual/range {v5 .. v11}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 233
    .line 234
    .line 235
    invoke-virtual {v3}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 236
    .line 237
    .line 238
    invoke-virtual {v3}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 239
    .line 240
    .line 241
    move-result-object v3

    .line 242
    move v5, v14

    .line 243
    move-object v14, v3

    .line 244
    const/16 v25, 0x0

    .line 245
    .line 246
    const/16 v26, 0x0

    .line 247
    .line 248
    const/16 v27, 0x0

    .line 249
    .line 250
    const/16 v28, 0x3800

    .line 251
    .line 252
    const/16 v29, 0x0

    .line 253
    .line 254
    invoke-static/range {v13 .. v29}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 255
    .line 256
    .line 257
    const/high16 v35, 0x3f800000    # 1.0f

    .line 258
    .line 259
    const/high16 v37, 0x3f800000    # 1.0f

    .line 260
    .line 261
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 262
    .line 263
    .line 264
    move-result v32

    .line 265
    new-instance v3, Landroidx/compose/ui/graphics/SolidColor;

    .line 266
    .line 267
    move-object/from16 v34, v3

    .line 268
    .line 269
    invoke-virtual {v1}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 270
    .line 271
    .line 272
    move-result-wide v6

    .line 273
    invoke-direct {v3, v6, v7, v4}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 274
    .line 275
    .line 276
    const/16 v36, 0x0

    .line 277
    .line 278
    const/high16 v38, 0x3f800000    # 1.0f

    .line 279
    .line 280
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 281
    .line 282
    .line 283
    move-result v39

    .line 284
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 285
    .line 286
    .line 287
    move-result v40

    .line 288
    const/high16 v41, 0x3f800000    # 1.0f

    .line 289
    .line 290
    const-string v33, ""

    .line 291
    .line 292
    new-instance v3, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 293
    .line 294
    invoke-direct {v3}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 295
    .line 296
    .line 297
    const/high16 v6, 0x41400000    # 12.0f

    .line 298
    .line 299
    const/high16 v7, 0x40000000    # 2.0f

    .line 300
    .line 301
    invoke-virtual {v3, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 302
    .line 303
    .line 304
    const v14, 0x40cf5c29    # 6.48f

    .line 305
    .line 306
    .line 307
    const/high16 v15, 0x40000000    # 2.0f

    .line 308
    .line 309
    const/high16 v16, 0x40000000    # 2.0f

    .line 310
    .line 311
    const v17, 0x40cf5c29    # 6.48f

    .line 312
    .line 313
    .line 314
    const/high16 v18, 0x40000000    # 2.0f

    .line 315
    .line 316
    const/high16 v19, 0x41400000    # 12.0f

    .line 317
    .line 318
    move-object v13, v3

    .line 319
    invoke-virtual/range {v13 .. v19}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 320
    .line 321
    .line 322
    const v8, 0x408f5c29    # 4.48f

    .line 323
    .line 324
    .line 325
    const/high16 v9, 0x41200000    # 10.0f

    .line 326
    .line 327
    invoke-virtual {v3, v8, v9, v9, v9}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 328
    .line 329
    .line 330
    const v8, -0x3f70a3d7    # -4.48f

    .line 331
    .line 332
    .line 333
    const/high16 v10, -0x3ee00000    # -10.0f

    .line 334
    .line 335
    invoke-virtual {v3, v9, v8, v9, v10}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 336
    .line 337
    .line 338
    const v8, 0x418c28f6    # 17.52f

    .line 339
    .line 340
    .line 341
    invoke-virtual {v3, v8, v7, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 342
    .line 343
    .line 344
    invoke-virtual {v3}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 345
    .line 346
    .line 347
    const/high16 v7, 0x40800000    # 4.0f

    .line 348
    .line 349
    invoke-virtual {v3, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 350
    .line 351
    .line 352
    const v14, 0x4039999a    # 2.9f

    .line 353
    .line 354
    .line 355
    const/4 v15, 0x0

    .line 356
    const v16, 0x40ae147b    # 5.44f

    .line 357
    .line 358
    .line 359
    const v17, 0x3fc7ae14    # 1.56f

    .line 360
    .line 361
    .line 362
    const v18, 0x40dae148    # 6.84f

    .line 363
    .line 364
    .line 365
    const v19, 0x407851ec    # 3.88f

    .line 366
    .line 367
    .line 368
    invoke-virtual/range {v13 .. v19}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 369
    .line 370
    .line 371
    const v14, -0x4123d70a    # -0.43f

    .line 372
    .line 373
    .line 374
    const v15, 0x3d8f5c29    # 0.07f

    .line 375
    .line 376
    .line 377
    const v16, -0x409eb852    # -0.88f

    .line 378
    .line 379
    .line 380
    const v17, 0x3df5c28f    # 0.12f

    .line 381
    .line 382
    .line 383
    const v18, -0x40547ae1    # -1.34f

    .line 384
    .line 385
    .line 386
    const v19, 0x3df5c28f    # 0.12f

    .line 387
    .line 388
    .line 389
    invoke-virtual/range {v13 .. v19}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 390
    .line 391
    .line 392
    const v14, -0x3fc66666    # -2.9f

    .line 393
    .line 394
    .line 395
    const/4 v15, 0x0

    .line 396
    const v16, -0x3f51eb85    # -5.44f

    .line 397
    .line 398
    .line 399
    const v17, -0x403851ec    # -1.56f

    .line 400
    .line 401
    .line 402
    const v18, -0x3f251eb8    # -6.84f

    .line 403
    .line 404
    .line 405
    const v19, -0x3f87ae14    # -3.88f

    .line 406
    .line 407
    .line 408
    invoke-virtual/range {v13 .. v19}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 409
    .line 410
    .line 411
    const v14, 0x3edc28f6    # 0.43f

    .line 412
    .line 413
    .line 414
    const v15, -0x4270a3d7    # -0.07f

    .line 415
    .line 416
    .line 417
    const v16, 0x3f6147ae    # 0.88f

    .line 418
    .line 419
    .line 420
    const v17, -0x420a3d71    # -0.12f

    .line 421
    .line 422
    .line 423
    const v18, 0x3fab851f    # 1.34f

    .line 424
    .line 425
    .line 426
    const v19, -0x420a3d71    # -0.12f

    .line 427
    .line 428
    .line 429
    invoke-virtual/range {v13 .. v19}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 430
    .line 431
    .line 432
    invoke-virtual {v3}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 433
    .line 434
    .line 435
    invoke-virtual {v3, v12, v5}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 436
    .line 437
    .line 438
    const v14, 0x40ee6666    # 7.45f

    .line 439
    .line 440
    .line 441
    const v15, 0x40dd70a4    # 6.92f

    .line 442
    .line 443
    .line 444
    const v16, 0x40c428f6    # 6.13f

    .line 445
    .line 446
    .line 447
    const/high16 v17, 0x41080000    # 8.5f

    .line 448
    .line 449
    const v18, 0x408d70a4    # 4.42f

    .line 450
    .line 451
    .line 452
    const v19, 0x4117851f    # 9.47f

    .line 453
    .line 454
    .line 455
    invoke-virtual/range {v13 .. v19}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 456
    .line 457
    .line 458
    const v14, 0x40a1999a    # 5.05f

    .line 459
    .line 460
    .line 461
    const v15, 0x40f28f5c    # 7.58f

    .line 462
    .line 463
    .line 464
    const v16, 0x40cbd70a    # 6.37f

    .line 465
    .line 466
    .line 467
    const/high16 v17, 0x40c00000    # 6.0f

    .line 468
    .line 469
    const v18, 0x410147ae    # 8.08f

    .line 470
    .line 471
    .line 472
    const v19, 0x40a0f5c3    # 5.03f

    .line 473
    .line 474
    .line 475
    invoke-virtual/range {v13 .. v19}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 476
    .line 477
    .line 478
    invoke-virtual {v3}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 479
    .line 480
    .line 481
    const/high16 v5, 0x41a00000    # 20.0f

    .line 482
    .line 483
    invoke-virtual {v3, v6, v5}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 484
    .line 485
    .line 486
    const v14, -0x3f72e148    # -4.41f

    .line 487
    .line 488
    .line 489
    const/4 v15, 0x0

    .line 490
    const/high16 v16, -0x3f000000    # -8.0f

    .line 491
    .line 492
    const v17, -0x3f9a3d71    # -3.59f

    .line 493
    .line 494
    .line 495
    const/high16 v18, -0x3f000000    # -8.0f

    .line 496
    .line 497
    const/high16 v19, -0x3f000000    # -8.0f

    .line 498
    .line 499
    invoke-virtual/range {v13 .. v19}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 500
    .line 501
    .line 502
    const/4 v14, 0x0

    .line 503
    const v15, -0x42b33333    # -0.05f

    .line 504
    .line 505
    .line 506
    const v16, 0x3c23d70a    # 0.01f

    .line 507
    .line 508
    .line 509
    const v17, -0x42333333    # -0.1f

    .line 510
    .line 511
    .line 512
    const v18, 0x3c23d70a    # 0.01f

    .line 513
    .line 514
    .line 515
    const v19, -0x41e66666    # -0.15f

    .line 516
    .line 517
    .line 518
    invoke-virtual/range {v13 .. v19}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 519
    .line 520
    .line 521
    const v14, 0x40266666    # 2.6f

    .line 522
    .line 523
    .line 524
    const v15, -0x40851eb8    # -0.98f

    .line 525
    .line 526
    .line 527
    const v16, 0x4095c28f    # 4.68f

    .line 528
    .line 529
    .line 530
    const v17, -0x3fc0a3d7    # -2.99f

    .line 531
    .line 532
    .line 533
    const v18, 0x40b7ae14    # 5.74f

    .line 534
    .line 535
    .line 536
    const v19, -0x3f4e6666    # -5.55f

    .line 537
    .line 538
    .line 539
    invoke-virtual/range {v13 .. v19}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 540
    .line 541
    .line 542
    const v14, 0x3fea3d71    # 1.83f

    .line 543
    .line 544
    .line 545
    const v15, 0x4010a3d7    # 2.26f

    .line 546
    .line 547
    .line 548
    const v16, 0x4093d70a    # 4.62f

    .line 549
    .line 550
    .line 551
    const v17, 0x406ccccd    # 3.7f

    .line 552
    .line 553
    .line 554
    const/high16 v18, 0x40f80000    # 7.75f

    .line 555
    .line 556
    const v19, 0x406ccccd    # 3.7f

    .line 557
    .line 558
    .line 559
    invoke-virtual/range {v13 .. v19}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 560
    .line 561
    .line 562
    const/high16 v14, 0x3f400000    # 0.75f

    .line 563
    .line 564
    const/4 v15, 0x0

    .line 565
    const v16, 0x3fbc28f6    # 1.47f

    .line 566
    .line 567
    .line 568
    const v17, -0x4247ae14    # -0.09f

    .line 569
    .line 570
    .line 571
    const v18, 0x400ae148    # 2.17f

    .line 572
    .line 573
    .line 574
    const v19, -0x418a3d71    # -0.24f

    .line 575
    .line 576
    .line 577
    invoke-virtual/range {v13 .. v19}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 578
    .line 579
    .line 580
    const v14, 0x3e570a3d    # 0.21f

    .line 581
    .line 582
    .line 583
    const v15, 0x3f35c28f    # 0.71f

    .line 584
    .line 585
    .line 586
    const v16, 0x3ea8f5c3    # 0.33f

    .line 587
    .line 588
    .line 589
    const v17, 0x3fbae148    # 1.46f

    .line 590
    .line 591
    .line 592
    const v18, 0x3ea8f5c3    # 0.33f

    .line 593
    .line 594
    .line 595
    const v19, 0x400f5c29    # 2.24f

    .line 596
    .line 597
    .line 598
    invoke-virtual/range {v13 .. v19}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 599
    .line 600
    .line 601
    const/4 v14, 0x0

    .line 602
    const v15, 0x408d1eb8    # 4.41f

    .line 603
    .line 604
    .line 605
    const v16, -0x3f9a3d71    # -3.59f

    .line 606
    .line 607
    .line 608
    const/high16 v17, 0x41000000    # 8.0f

    .line 609
    .line 610
    const/high16 v18, -0x3f000000    # -8.0f

    .line 611
    .line 612
    const/high16 v19, 0x41000000    # 8.0f

    .line 613
    .line 614
    invoke-virtual/range {v13 .. v19}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 615
    .line 616
    .line 617
    invoke-virtual {v3}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 618
    .line 619
    .line 620
    invoke-virtual {v3}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 621
    .line 622
    .line 623
    move-result-object v31

    .line 624
    const/16 v42, 0x0

    .line 625
    .line 626
    const/16 v43, 0x0

    .line 627
    .line 628
    const/16 v44, 0x0

    .line 629
    .line 630
    const/16 v45, 0x3800

    .line 631
    .line 632
    const/16 v46, 0x0

    .line 633
    .line 634
    invoke-static/range {v30 .. v46}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 635
    .line 636
    .line 637
    const/high16 v52, 0x3f800000    # 1.0f

    .line 638
    .line 639
    const/high16 v54, 0x3f800000    # 1.0f

    .line 640
    .line 641
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 642
    .line 643
    .line 644
    move-result v49

    .line 645
    new-instance v3, Landroidx/compose/ui/graphics/SolidColor;

    .line 646
    .line 647
    move-object/from16 v51, v3

    .line 648
    .line 649
    invoke-virtual {v1}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 650
    .line 651
    .line 652
    move-result-wide v5

    .line 653
    invoke-direct {v3, v5, v6, v4}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 654
    .line 655
    .line 656
    const/16 v53, 0x0

    .line 657
    .line 658
    const/high16 v55, 0x3f800000    # 1.0f

    .line 659
    .line 660
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 661
    .line 662
    .line 663
    move-result v56

    .line 664
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 665
    .line 666
    .line 667
    move-result v57

    .line 668
    const/high16 v58, 0x3f800000    # 1.0f

    .line 669
    .line 670
    const-string v50, ""

    .line 671
    .line 672
    new-instance v3, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 673
    .line 674
    invoke-direct {v3}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 675
    .line 676
    .line 677
    const/high16 v5, 0x41100000    # 9.0f

    .line 678
    .line 679
    const/high16 v13, 0x41500000    # 13.0f

    .line 680
    .line 681
    invoke-virtual {v3, v5, v13}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 682
    .line 683
    .line 684
    const/high16 v14, -0x40600000    # -1.25f

    .line 685
    .line 686
    const/4 v15, 0x0

    .line 687
    invoke-virtual {v3, v14, v15}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 688
    .line 689
    .line 690
    const/high16 v6, 0x3fa00000    # 1.25f

    .line 691
    .line 692
    const/high16 v7, 0x3fa00000    # 1.25f

    .line 693
    .line 694
    const/4 v8, 0x0

    .line 695
    const/4 v9, 0x1

    .line 696
    const/4 v10, 0x1

    .line 697
    const/high16 v11, 0x40200000    # 2.5f

    .line 698
    .line 699
    const/4 v12, 0x0

    .line 700
    move-object v5, v3

    .line 701
    invoke-virtual/range {v5 .. v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 702
    .line 703
    .line 704
    const/high16 v11, -0x3fe00000    # -2.5f

    .line 705
    .line 706
    invoke-virtual/range {v5 .. v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 707
    .line 708
    .line 709
    invoke-virtual {v3}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 710
    .line 711
    .line 712
    move-result-object v48

    .line 713
    const/16 v59, 0x0

    .line 714
    .line 715
    const/16 v60, 0x0

    .line 716
    .line 717
    const/16 v61, 0x0

    .line 718
    .line 719
    const/16 v62, 0x3800

    .line 720
    .line 721
    const/16 v63, 0x0

    .line 722
    .line 723
    invoke-static/range {v47 .. v63}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 724
    .line 725
    .line 726
    const/high16 v69, 0x3f800000    # 1.0f

    .line 727
    .line 728
    const/high16 v71, 0x3f800000    # 1.0f

    .line 729
    .line 730
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 731
    .line 732
    .line 733
    move-result v66

    .line 734
    new-instance v3, Landroidx/compose/ui/graphics/SolidColor;

    .line 735
    .line 736
    move-object/from16 v68, v3

    .line 737
    .line 738
    invoke-virtual {v1}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 739
    .line 740
    .line 741
    move-result-wide v5

    .line 742
    invoke-direct {v3, v5, v6, v4}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 743
    .line 744
    .line 745
    const/16 v70, 0x0

    .line 746
    .line 747
    const/high16 v72, 0x3f800000    # 1.0f

    .line 748
    .line 749
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 750
    .line 751
    .line 752
    move-result v73

    .line 753
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 754
    .line 755
    .line 756
    move-result v74

    .line 757
    const/high16 v75, 0x3f800000    # 1.0f

    .line 758
    .line 759
    const-string v67, ""

    .line 760
    .line 761
    new-instance v8, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 762
    .line 763
    invoke-direct {v8}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 764
    .line 765
    .line 766
    const/high16 v0, 0x41700000    # 15.0f

    .line 767
    .line 768
    invoke-virtual {v8, v0, v13}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 769
    .line 770
    .line 771
    invoke-virtual {v8, v14, v15}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 772
    .line 773
    .line 774
    const/high16 v1, 0x3fa00000    # 1.25f

    .line 775
    .line 776
    const/high16 v2, 0x3fa00000    # 1.25f

    .line 777
    .line 778
    const/4 v3, 0x0

    .line 779
    const/4 v4, 0x1

    .line 780
    const/4 v5, 0x1

    .line 781
    const/high16 v6, 0x40200000    # 2.5f

    .line 782
    .line 783
    const/4 v7, 0x0

    .line 784
    move-object v0, v8

    .line 785
    invoke-virtual/range {v0 .. v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 786
    .line 787
    .line 788
    const/high16 v6, -0x3fe00000    # -2.5f

    .line 789
    .line 790
    invoke-virtual/range {v0 .. v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 791
    .line 792
    .line 793
    invoke-virtual {v8}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 794
    .line 795
    .line 796
    move-result-object v65

    .line 797
    const/16 v76, 0x0

    .line 798
    .line 799
    const/16 v77, 0x0

    .line 800
    .line 801
    const/16 v78, 0x0

    .line 802
    .line 803
    const/16 v79, 0x3800

    .line 804
    .line 805
    const/16 v80, 0x0

    .line 806
    .line 807
    invoke-static/range {v64 .. v80}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 808
    .line 809
    .line 810
    move-result-object v0

    .line 811
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 812
    .line 813
    .line 814
    move-result-object v0

    .line 815
    sput-object v0, Landroidx/compose/material/icons/twotone/FaceKt;->_face:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 816
    .line 817
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 818
    .line 819
    .line 820
    return-object v0
.end method
