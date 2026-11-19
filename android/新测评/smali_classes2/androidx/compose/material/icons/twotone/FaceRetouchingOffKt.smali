.class public final Landroidx/compose/material/icons/twotone/FaceRetouchingOffKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_faceRetouchingOff",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "FaceRetouchingOff",
        "Landroidx/compose/material/icons/Icons$TwoTone;",
        "getFaceRetouchingOff",
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
        "SMAP\nFaceRetouchingOff.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FaceRetouchingOff.kt\nandroidx/compose/material/icons/twotone/FaceRetouchingOffKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,95:1\n212#2,12:96\n233#2,18:109\n253#2:146\n233#2,18:147\n253#2:184\n174#3:108\n705#4,2:127\n717#4,2:129\n719#4,11:135\n705#4,2:165\n717#4,2:167\n719#4,11:173\n72#5,4:131\n72#5,4:169\n*S KotlinDebug\n*F\n+ 1 FaceRetouchingOff.kt\nandroidx/compose/material/icons/twotone/FaceRetouchingOffKt\n*L\n29#1:96,12\n30#1:109,18\n30#1:146\n43#1:147,18\n43#1:184\n29#1:108\n30#1:127,2\n30#1:129,2\n30#1:135,11\n43#1:165,2\n43#1:167,2\n43#1:173,11\n30#1:131,4\n43#1:169,4\n*E\n"
    }
.end annotation


# static fields
.field private static _faceRetouchingOff:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getFaceRetouchingOff(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/FaceRetouchingOffKt;->_faceRetouchingOff:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.FaceRetouchingOff"

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
    const/high16 v6, 0x40800000    # 4.0f

    .line 73
    .line 74
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const v25, -0x40547ae1    # -1.34f

    .line 78
    .line 79
    .line 80
    const v26, 0x3df5c28f    # 0.12f

    .line 81
    .line 82
    .line 83
    const v21, -0x41147ae1    # -0.46f

    .line 84
    .line 85
    .line 86
    const/16 v22, 0x0

    .line 87
    .line 88
    const v23, -0x40970a3d    # -0.91f

    .line 89
    .line 90
    .line 91
    const v24, 0x3d4ccccd    # 0.05f

    .line 92
    .line 93
    .line 94
    move-object/from16 v20, v2

    .line 95
    .line 96
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 97
    .line 98
    .line 99
    const/high16 v25, 0x418c0000    # 17.5f

    .line 100
    .line 101
    const/high16 v26, 0x41000000    # 8.0f

    .line 102
    .line 103
    const v21, 0x4140f5c3    # 12.06f

    .line 104
    .line 105
    .line 106
    const v22, 0x40ce147b    # 6.44f

    .line 107
    .line 108
    .line 109
    const v23, 0x4169999a    # 14.6f

    .line 110
    .line 111
    .line 112
    const/high16 v24, 0x41000000    # 8.0f

    .line 113
    .line 114
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 115
    .line 116
    .line 117
    const v25, 0x3fab851f    # 1.34f

    .line 118
    .line 119
    .line 120
    const v26, -0x420a3d71    # -0.12f

    .line 121
    .line 122
    .line 123
    const v21, 0x3eeb851f    # 0.46f

    .line 124
    .line 125
    .line 126
    const/16 v22, 0x0

    .line 127
    .line 128
    const v23, 0x3f68f5c3    # 0.91f

    .line 129
    .line 130
    .line 131
    const v24, -0x42b33333    # -0.05f

    .line 132
    .line 133
    .line 134
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 135
    .line 136
    .line 137
    const/high16 v25, 0x41400000    # 12.0f

    .line 138
    .line 139
    const/high16 v26, 0x40800000    # 4.0f

    .line 140
    .line 141
    const v21, 0x418b851f    # 17.44f

    .line 142
    .line 143
    .line 144
    const v22, 0x40b1eb85    # 5.56f

    .line 145
    .line 146
    .line 147
    const v23, 0x416e6666    # 14.9f

    .line 148
    .line 149
    .line 150
    const/high16 v24, 0x40800000    # 4.0f

    .line 151
    .line 152
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 153
    .line 154
    .line 155
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 156
    .line 157
    .line 158
    const v4, 0x408d70a4    # 4.42f

    .line 159
    .line 160
    .line 161
    const v6, 0x4117851f    # 9.47f

    .line 162
    .line 163
    .line 164
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 165
    .line 166
    .line 167
    const v25, 0x40c75c29    # 6.23f

    .line 168
    .line 169
    .line 170
    const v26, 0x4100f5c3    # 8.06f

    .line 171
    .line 172
    .line 173
    const v21, 0x40a2e148    # 5.09f

    .line 174
    .line 175
    .line 176
    const v22, 0x411170a4    # 9.09f

    .line 177
    .line 178
    .line 179
    const v23, 0x40b66666    # 5.7f

    .line 180
    .line 181
    .line 182
    const v24, 0x4109c28f    # 8.61f

    .line 183
    .line 184
    .line 185
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 186
    .line 187
    .line 188
    const v4, 0x40eae148    # 7.34f

    .line 189
    .line 190
    .line 191
    const v6, 0x40b051ec    # 5.51f

    .line 192
    .line 193
    .line 194
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 195
    .line 196
    .line 197
    const v25, 0x408d70a4    # 4.42f

    .line 198
    .line 199
    .line 200
    const v26, 0x4117851f    # 9.47f

    .line 201
    .line 202
    .line 203
    const v21, 0x40a1999a    # 5.05f

    .line 204
    .line 205
    .line 206
    const v22, 0x40ffae14    # 7.99f

    .line 207
    .line 208
    .line 209
    const v23, 0x4095c28f    # 4.68f

    .line 210
    .line 211
    .line 212
    const v24, 0x410b3333    # 8.7f

    .line 213
    .line 214
    .line 215
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 216
    .line 217
    .line 218
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 219
    .line 220
    .line 221
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 222
    .line 223
    .line 224
    move-result-object v2

    .line 225
    const/16 v16, 0x3800

    .line 226
    .line 227
    const/16 v17, 0x0

    .line 228
    .line 229
    const v6, 0x3e99999a    # 0.3f

    .line 230
    .line 231
    .line 232
    const v8, 0x3e99999a    # 0.3f

    .line 233
    .line 234
    .line 235
    const/4 v7, 0x0

    .line 236
    const/high16 v9, 0x3f800000    # 1.0f

    .line 237
    .line 238
    const/high16 v12, 0x3f800000    # 1.0f

    .line 239
    .line 240
    const/4 v13, 0x0

    .line 241
    const/4 v14, 0x0

    .line 242
    const/4 v15, 0x0

    .line 243
    const-string v4, ""

    .line 244
    .line 245
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 246
    .line 247
    .line 248
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 249
    .line 250
    .line 251
    move-result v3

    .line 252
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 253
    .line 254
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 255
    .line 256
    .line 257
    move-result-wide v6

    .line 258
    const/4 v0, 0x0

    .line 259
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 260
    .line 261
    .line 262
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 263
    .line 264
    .line 265
    move-result v10

    .line 266
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 267
    .line 268
    .line 269
    move-result v11

    .line 270
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 271
    .line 272
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 273
    .line 274
    .line 275
    const/high16 v0, 0x41640000    # 14.25f

    .line 276
    .line 277
    const/high16 v2, 0x41100000    # 9.0f

    .line 278
    .line 279
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 280
    .line 281
    .line 282
    const/high16 v17, 0x3fa00000    # 1.25f

    .line 283
    .line 284
    const/high16 v18, -0x40600000    # -1.25f

    .line 285
    .line 286
    const v13, 0x3f30a3d7    # 0.69f

    .line 287
    .line 288
    .line 289
    const/high16 v15, 0x3fa00000    # 1.25f

    .line 290
    .line 291
    const v16, -0x40f0a3d7    # -0.56f

    .line 292
    .line 293
    .line 294
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 295
    .line 296
    .line 297
    const v0, 0x411b0a3d    # 9.69f

    .line 298
    .line 299
    .line 300
    const/high16 v2, 0x413c0000    # 11.75f

    .line 301
    .line 302
    const/high16 v4, 0x41100000    # 9.0f

    .line 303
    .line 304
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 305
    .line 306
    .line 307
    const v0, 0x4144f5c3    # 12.31f

    .line 308
    .line 309
    .line 310
    const/high16 v2, 0x41500000    # 13.0f

    .line 311
    .line 312
    const/high16 v4, 0x40f80000    # 7.75f

    .line 313
    .line 314
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 315
    .line 316
    .line 317
    const v0, 0x4104f5c3    # 8.31f

    .line 318
    .line 319
    .line 320
    const/high16 v2, 0x41640000    # 14.25f

    .line 321
    .line 322
    const/high16 v4, 0x41100000    # 9.0f

    .line 323
    .line 324
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 325
    .line 326
    .line 327
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 328
    .line 329
    .line 330
    const/high16 v0, 0x418c0000    # 17.5f

    .line 331
    .line 332
    const/high16 v2, 0x41200000    # 10.0f

    .line 333
    .line 334
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 335
    .line 336
    .line 337
    const v17, 0x400ae148    # 2.17f

    .line 338
    .line 339
    .line 340
    const v18, -0x418a3d71    # -0.24f

    .line 341
    .line 342
    .line 343
    const/high16 v13, 0x3f400000    # 0.75f

    .line 344
    .line 345
    const v15, 0x3fbc28f6    # 1.47f

    .line 346
    .line 347
    .line 348
    const v16, -0x4247ae14    # -0.09f

    .line 349
    .line 350
    .line 351
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 352
    .line 353
    .line 354
    const/high16 v17, 0x41a00000    # 20.0f

    .line 355
    .line 356
    const/high16 v18, 0x41400000    # 12.0f

    .line 357
    .line 358
    const v13, 0x419f0a3d    # 19.88f

    .line 359
    .line 360
    .line 361
    const v14, 0x4127851f    # 10.47f

    .line 362
    .line 363
    .line 364
    const/high16 v15, 0x41a00000    # 20.0f

    .line 365
    .line 366
    const v16, 0x4133851f    # 11.22f

    .line 367
    .line 368
    .line 369
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 370
    .line 371
    .line 372
    const v17, -0x40bae148    # -0.77f

    .line 373
    .line 374
    .line 375
    const v18, 0x4059999a    # 3.4f

    .line 376
    .line 377
    .line 378
    const/4 v13, 0x0

    .line 379
    const v14, 0x3f9c28f6    # 1.22f

    .line 380
    .line 381
    .line 382
    const v15, -0x4170a3d7    # -0.28f

    .line 383
    .line 384
    .line 385
    const v16, 0x4017ae14    # 2.37f

    .line 386
    .line 387
    .line 388
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 389
    .line 390
    .line 391
    const v0, 0x3fbeb852    # 1.49f

    .line 392
    .line 393
    .line 394
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 395
    .line 396
    .line 397
    const/high16 v17, 0x41b00000    # 22.0f

    .line 398
    .line 399
    const/high16 v18, 0x41400000    # 12.0f

    .line 400
    .line 401
    const v13, 0x41ac3d71    # 21.53f

    .line 402
    .line 403
    .line 404
    const v14, 0x41770a3d    # 15.44f

    .line 405
    .line 406
    .line 407
    const/high16 v15, 0x41b00000    # 22.0f

    .line 408
    .line 409
    const v16, 0x415c7ae1    # 13.78f

    .line 410
    .line 411
    .line 412
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 413
    .line 414
    .line 415
    const/high16 v17, -0x3ee00000    # -10.0f

    .line 416
    .line 417
    const/high16 v18, -0x3ee00000    # -10.0f

    .line 418
    .line 419
    const/4 v13, 0x0

    .line 420
    const v14, -0x3f4f5c29    # -5.52f

    .line 421
    .line 422
    .line 423
    const v15, -0x3f70a3d7    # -4.48f

    .line 424
    .line 425
    .line 426
    const/high16 v16, -0x3ee00000    # -10.0f

    .line 427
    .line 428
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 429
    .line 430
    .line 431
    const v17, -0x3f63851f    # -4.89f

    .line 432
    .line 433
    .line 434
    const v18, 0x3fa3d70a    # 1.28f

    .line 435
    .line 436
    .line 437
    const v13, -0x401c28f6    # -1.78f

    .line 438
    .line 439
    .line 440
    const/4 v14, 0x0

    .line 441
    const v15, -0x3fa3d70a    # -3.44f

    .line 442
    .line 443
    .line 444
    const v16, 0x3ef0a3d7    # 0.47f

    .line 445
    .line 446
    .line 447
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 448
    .line 449
    .line 450
    const v0, 0x40aa8f5c    # 5.33f

    .line 451
    .line 452
    .line 453
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 454
    .line 455
    .line 456
    const/high16 v17, 0x418c0000    # 17.5f

    .line 457
    .line 458
    const/high16 v18, 0x41200000    # 10.0f

    .line 459
    .line 460
    const v13, 0x415ee148    # 13.93f

    .line 461
    .line 462
    .line 463
    const v14, 0x4117d70a    # 9.49f

    .line 464
    .line 465
    .line 466
    const v15, 0x417a6666    # 15.65f

    .line 467
    .line 468
    .line 469
    const/high16 v16, 0x41200000    # 10.0f

    .line 470
    .line 471
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 472
    .line 473
    .line 474
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 475
    .line 476
    .line 477
    const v0, 0x412a8f5c    # 10.66f

    .line 478
    .line 479
    .line 480
    const v2, 0x4083d70a    # 4.12f

    .line 481
    .line 482
    .line 483
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 484
    .line 485
    .line 486
    const/high16 v17, 0x41400000    # 12.0f

    .line 487
    .line 488
    const/high16 v18, 0x40800000    # 4.0f

    .line 489
    .line 490
    const v13, 0x413170a4    # 11.09f

    .line 491
    .line 492
    .line 493
    const v14, 0x4081999a    # 4.05f

    .line 494
    .line 495
    .line 496
    const v15, 0x4138a3d7    # 11.54f

    .line 497
    .line 498
    .line 499
    const/high16 v16, 0x40800000    # 4.0f

    .line 500
    .line 501
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 502
    .line 503
    .line 504
    const v17, 0x40dae148    # 6.84f

    .line 505
    .line 506
    .line 507
    const v18, 0x407851ec    # 3.88f

    .line 508
    .line 509
    .line 510
    const v13, 0x4039999a    # 2.9f

    .line 511
    .line 512
    .line 513
    const/4 v14, 0x0

    .line 514
    const v15, 0x40ae147b    # 5.44f

    .line 515
    .line 516
    .line 517
    const v16, 0x3fc7ae14    # 1.56f

    .line 518
    .line 519
    .line 520
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 521
    .line 522
    .line 523
    const/high16 v17, 0x418c0000    # 17.5f

    .line 524
    .line 525
    const/high16 v18, 0x41000000    # 8.0f

    .line 526
    .line 527
    const v13, 0x419347ae    # 18.41f

    .line 528
    .line 529
    .line 530
    const v14, 0x40fe6666    # 7.95f

    .line 531
    .line 532
    .line 533
    const v15, 0x418fae14    # 17.96f

    .line 534
    .line 535
    .line 536
    const/high16 v16, 0x41000000    # 8.0f

    .line 537
    .line 538
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 539
    .line 540
    .line 541
    const v17, 0x412a8f5c    # 10.66f

    .line 542
    .line 543
    .line 544
    const v18, 0x4083d70a    # 4.12f

    .line 545
    .line 546
    .line 547
    const v13, 0x4169999a    # 14.6f

    .line 548
    .line 549
    .line 550
    const/high16 v14, 0x41000000    # 8.0f

    .line 551
    .line 552
    const v15, 0x4140f5c3    # 12.06f

    .line 553
    .line 554
    .line 555
    const v16, 0x40ce147b    # 6.44f

    .line 556
    .line 557
    .line 558
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 559
    .line 560
    .line 561
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 562
    .line 563
    .line 564
    const v0, 0x406e147b    # 3.72f

    .line 565
    .line 566
    .line 567
    const v2, 0x3ff1eb85    # 1.89f

    .line 568
    .line 569
    .line 570
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 571
    .line 572
    .line 573
    const v0, 0x400c28f6    # 2.19f

    .line 574
    .line 575
    .line 576
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 577
    .line 578
    .line 579
    const/high16 v17, 0x40000000    # 2.0f

    .line 580
    .line 581
    const/high16 v18, 0x41400000    # 12.0f

    .line 582
    .line 583
    const v13, 0x4031eb85    # 2.78f

    .line 584
    .line 585
    .line 586
    const v14, 0x40f33333    # 7.6f

    .line 587
    .line 588
    .line 589
    const/high16 v15, 0x40000000    # 2.0f

    .line 590
    .line 591
    const v16, 0x411b5c29    # 9.71f

    .line 592
    .line 593
    .line 594
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 595
    .line 596
    .line 597
    const/high16 v17, 0x41200000    # 10.0f

    .line 598
    .line 599
    const/high16 v18, 0x41200000    # 10.0f

    .line 600
    .line 601
    const/4 v13, 0x0

    .line 602
    const v14, 0x40b0a3d7    # 5.52f

    .line 603
    .line 604
    .line 605
    const v15, 0x408f5c29    # 4.48f

    .line 606
    .line 607
    .line 608
    const/high16 v16, 0x41200000    # 10.0f

    .line 609
    .line 610
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 611
    .line 612
    .line 613
    const v17, 0x40c2e148    # 6.09f

    .line 614
    .line 615
    .line 616
    const v18, -0x3ffae148    # -2.08f

    .line 617
    .line 618
    .line 619
    const v13, 0x40128f5c    # 2.29f

    .line 620
    .line 621
    .line 622
    const/4 v14, 0x0

    .line 623
    const v15, 0x408ccccd    # 4.4f

    .line 624
    .line 625
    .line 626
    const v16, -0x40b851ec    # -0.78f

    .line 627
    .line 628
    .line 629
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 630
    .line 631
    .line 632
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 633
    .line 634
    .line 635
    const v0, 0x3fb47ae1    # 1.41f

    .line 636
    .line 637
    .line 638
    const v2, -0x404b851f    # -1.41f

    .line 639
    .line 640
    .line 641
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 642
    .line 643
    .line 644
    const v0, 0x4053d70a    # 3.31f

    .line 645
    .line 646
    .line 647
    const v2, 0x4013d70a    # 2.31f

    .line 648
    .line 649
    .line 650
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 651
    .line 652
    .line 653
    const v0, 0x406e147b    # 3.72f

    .line 654
    .line 655
    .line 656
    const v2, 0x3ff1eb85    # 1.89f

    .line 657
    .line 658
    .line 659
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 660
    .line 661
    .line 662
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 663
    .line 664
    .line 665
    const v0, 0x4193eb85    # 18.49f

    .line 666
    .line 667
    .line 668
    const v2, 0x418547ae    # 16.66f

    .line 669
    .line 670
    .line 671
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 672
    .line 673
    .line 674
    const/high16 v17, 0x41400000    # 12.0f

    .line 675
    .line 676
    const/high16 v18, 0x41a00000    # 20.0f

    .line 677
    .line 678
    const v13, 0x4175999a    # 15.35f

    .line 679
    .line 680
    .line 681
    const v14, 0x419b851f    # 19.44f

    .line 682
    .line 683
    .line 684
    const v15, 0x415bd70a    # 13.74f

    .line 685
    .line 686
    .line 687
    const/high16 v16, 0x41a00000    # 20.0f

    .line 688
    .line 689
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 690
    .line 691
    .line 692
    const/high16 v17, -0x3f000000    # -8.0f

    .line 693
    .line 694
    const/high16 v18, -0x3f000000    # -8.0f

    .line 695
    .line 696
    const v13, -0x3f72e148    # -4.41f

    .line 697
    .line 698
    .line 699
    const/4 v14, 0x0

    .line 700
    const/high16 v15, -0x3f000000    # -8.0f

    .line 701
    .line 702
    const v16, -0x3f9a3d71    # -3.59f

    .line 703
    .line 704
    .line 705
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 706
    .line 707
    .line 708
    const/16 v17, 0x0

    .line 709
    .line 710
    const v18, -0x41f0a3d7    # -0.14f

    .line 711
    .line 712
    .line 713
    const/4 v13, 0x0

    .line 714
    const v14, -0x42b33333    # -0.05f

    .line 715
    .line 716
    .line 717
    const v15, 0x3c23d70a    # 0.01f

    .line 718
    .line 719
    .line 720
    const v16, -0x42333333    # -0.1f

    .line 721
    .line 722
    .line 723
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 724
    .line 725
    .line 726
    const v17, 0x4068f5c3    # 3.64f

    .line 727
    .line 728
    .line 729
    const v18, -0x3fe70a3d    # -2.39f

    .line 730
    .line 731
    .line 732
    const v13, 0x3fb1eb85    # 1.39f

    .line 733
    .line 734
    .line 735
    const v14, -0x40fae148    # -0.52f

    .line 736
    .line 737
    .line 738
    const v15, 0x402851ec    # 2.63f

    .line 739
    .line 740
    .line 741
    const v16, -0x40533333    # -1.35f

    .line 742
    .line 743
    .line 744
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 745
    .line 746
    .line 747
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 748
    .line 749
    .line 750
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 751
    .line 752
    .line 753
    const v0, 0x40eae148    # 7.34f

    .line 754
    .line 755
    .line 756
    const v2, 0x40b051ec    # 5.51f

    .line 757
    .line 758
    .line 759
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 760
    .line 761
    .line 762
    const v0, 0x3f3851ec    # 0.72f

    .line 763
    .line 764
    .line 765
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 766
    .line 767
    .line 768
    const v17, 0x408d70a4    # 4.42f

    .line 769
    .line 770
    .line 771
    const v18, 0x4117851f    # 9.47f

    .line 772
    .line 773
    .line 774
    const v13, 0x40b66666    # 5.7f

    .line 775
    .line 776
    .line 777
    const v14, 0x4109c28f    # 8.61f

    .line 778
    .line 779
    .line 780
    const v15, 0x40a2e148    # 5.09f

    .line 781
    .line 782
    .line 783
    const v16, 0x411170a4    # 9.09f

    .line 784
    .line 785
    .line 786
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 787
    .line 788
    .line 789
    const v17, 0x40b051ec    # 5.51f

    .line 790
    .line 791
    .line 792
    const v18, 0x40eae148    # 7.34f

    .line 793
    .line 794
    .line 795
    const v13, 0x4095c28f    # 4.68f

    .line 796
    .line 797
    .line 798
    const v14, 0x410b3333    # 8.7f

    .line 799
    .line 800
    .line 801
    const v15, 0x40a1999a    # 5.05f

    .line 802
    .line 803
    .line 804
    const v16, 0x40ffae14    # 7.99f

    .line 805
    .line 806
    .line 807
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 808
    .line 809
    .line 810
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 811
    .line 812
    .line 813
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 814
    .line 815
    .line 816
    move-result-object v2

    .line 817
    const/16 v16, 0x3800

    .line 818
    .line 819
    const/16 v17, 0x0

    .line 820
    .line 821
    const/high16 v6, 0x3f800000    # 1.0f

    .line 822
    .line 823
    const/high16 v8, 0x3f800000    # 1.0f

    .line 824
    .line 825
    const/4 v7, 0x0

    .line 826
    const/high16 v12, 0x3f800000    # 1.0f

    .line 827
    .line 828
    const/4 v13, 0x0

    .line 829
    const/4 v14, 0x0

    .line 830
    const/4 v15, 0x0

    .line 831
    const-string v4, ""

    .line 832
    .line 833
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 834
    .line 835
    .line 836
    move-result-object v0

    .line 837
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 838
    .line 839
    .line 840
    move-result-object v0

    .line 841
    sput-object v0, Landroidx/compose/material/icons/twotone/FaceRetouchingOffKt;->_faceRetouchingOff:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 842
    .line 843
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 844
    .line 845
    .line 846
    return-object v0
.end method
