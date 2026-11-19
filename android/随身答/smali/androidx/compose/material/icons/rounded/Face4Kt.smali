.class public final Landroidx/compose/material/icons/rounded/Face4Kt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_face4",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "Face4",
        "Landroidx/compose/material/icons/Icons$Rounded;",
        "getFace4",
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
        "SMAP\nFace4.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Face4.kt\nandroidx/compose/material/icons/rounded/Face4Kt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,68:1\n212#2,12:69\n233#2,18:82\n253#2:119\n233#2,18:120\n253#2:157\n233#2,18:158\n253#2:195\n174#3:81\n705#4,2:100\n717#4,2:102\n719#4,11:108\n705#4,2:138\n717#4,2:140\n719#4,11:146\n705#4,2:176\n717#4,2:178\n719#4,11:184\n72#5,4:104\n72#5,4:142\n72#5,4:180\n*S KotlinDebug\n*F\n+ 1 Face4.kt\nandroidx/compose/material/icons/rounded/Face4Kt\n*L\n29#1:69,12\n30#1:82,18\n30#1:119\n51#1:120,18\n51#1:157\n57#1:158,18\n57#1:195\n29#1:81\n30#1:100,2\n30#1:102,2\n30#1:108,11\n51#1:138,2\n51#1:140,2\n51#1:146,11\n57#1:176,2\n57#1:178,2\n57#1:184,11\n30#1:104,4\n51#1:142,4\n57#1:180,4\n*E\n"
    }
.end annotation


# static fields
.field private static _face4:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getFace4(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 28

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/Face4Kt;->_face4:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.Face4"

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
    const/high16 v4, 0x40000000    # 2.0f

    .line 71
    .line 72
    const/high16 v6, 0x41400000    # 12.0f

    .line 73
    .line 74
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v25, -0x3fd00000    # -2.75f

    .line 78
    .line 79
    const v26, 0x3ec7ae14    # 0.39f

    .line 80
    .line 81
    .line 82
    const v21, -0x408a3d71    # -0.96f

    .line 83
    .line 84
    .line 85
    const/16 v22, 0x0

    .line 86
    .line 87
    const v23, -0x400f5c29    # -1.88f

    .line 88
    .line 89
    .line 90
    const v24, 0x3e0f5c29    # 0.14f

    .line 91
    .line 92
    .line 93
    move-object/from16 v20, v2

    .line 94
    .line 95
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 96
    .line 97
    .line 98
    const/high16 v25, 0x40a00000    # 5.0f

    .line 99
    .line 100
    const/16 v26, 0x0

    .line 101
    .line 102
    const v21, 0x4105eb85    # 8.37f

    .line 103
    .line 104
    .line 105
    const v22, 0x3f75c28f    # 0.96f

    .line 106
    .line 107
    .line 108
    const v23, 0x40d9999a    # 6.8f

    .line 109
    .line 110
    .line 111
    const/16 v24, 0x0

    .line 112
    .line 113
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 114
    .line 115
    .line 116
    const/16 v25, 0x0

    .line 117
    .line 118
    const/high16 v26, 0x40a00000    # 5.0f

    .line 119
    .line 120
    const v21, 0x400f5c29    # 2.24f

    .line 121
    .line 122
    .line 123
    const/16 v22, 0x0

    .line 124
    .line 125
    const/16 v23, 0x0

    .line 126
    .line 127
    const v24, 0x400f5c29    # 2.24f

    .line 128
    .line 129
    .line 130
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 131
    .line 132
    .line 133
    const v25, 0x4018f5c3    # 2.39f

    .line 134
    .line 135
    .line 136
    const/high16 v26, 0x40880000    # 4.25f

    .line 137
    .line 138
    const/16 v21, 0x0

    .line 139
    .line 140
    const v22, 0x3fe66666    # 1.8f

    .line 141
    .line 142
    .line 143
    const v23, 0x3f75c28f    # 0.96f

    .line 144
    .line 145
    .line 146
    const v24, 0x4057ae14    # 3.37f

    .line 147
    .line 148
    .line 149
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 150
    .line 151
    .line 152
    const/high16 v25, 0x40000000    # 2.0f

    .line 153
    .line 154
    const/high16 v26, 0x41400000    # 12.0f

    .line 155
    .line 156
    const v21, 0x4008f5c3    # 2.14f

    .line 157
    .line 158
    .line 159
    const v22, 0x4121eb85    # 10.12f

    .line 160
    .line 161
    .line 162
    const/high16 v23, 0x40000000    # 2.0f

    .line 163
    .line 164
    const v24, 0x4130a3d7    # 11.04f

    .line 165
    .line 166
    .line 167
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 168
    .line 169
    .line 170
    const/high16 v25, 0x41200000    # 10.0f

    .line 171
    .line 172
    const/high16 v26, 0x41200000    # 10.0f

    .line 173
    .line 174
    const/16 v21, 0x0

    .line 175
    .line 176
    const v22, 0x40b0a3d7    # 5.52f

    .line 177
    .line 178
    .line 179
    const v23, 0x408f5c29    # 4.48f

    .line 180
    .line 181
    .line 182
    const/high16 v24, 0x41200000    # 10.0f

    .line 183
    .line 184
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 185
    .line 186
    .line 187
    const v4, -0x3f70a3d7    # -4.48f

    .line 188
    .line 189
    .line 190
    const/high16 v6, -0x3ee00000    # -10.0f

    .line 191
    .line 192
    const/high16 v7, 0x41200000    # 10.0f

    .line 193
    .line 194
    invoke-virtual {v2, v7, v4, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 195
    .line 196
    .line 197
    const v4, 0x418c28f6    # 17.52f

    .line 198
    .line 199
    .line 200
    const/high16 v6, 0x40000000    # 2.0f

    .line 201
    .line 202
    const/high16 v7, 0x41400000    # 12.0f

    .line 203
    .line 204
    invoke-virtual {v2, v4, v6, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 205
    .line 206
    .line 207
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 208
    .line 209
    .line 210
    const/high16 v4, 0x41a00000    # 20.0f

    .line 211
    .line 212
    const/high16 v6, 0x41400000    # 12.0f

    .line 213
    .line 214
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 215
    .line 216
    .line 217
    const/high16 v25, -0x3f000000    # -8.0f

    .line 218
    .line 219
    const/high16 v26, -0x3f000000    # -8.0f

    .line 220
    .line 221
    const v21, -0x3f72e148    # -4.41f

    .line 222
    .line 223
    .line 224
    const/16 v22, 0x0

    .line 225
    .line 226
    const/high16 v23, -0x3f000000    # -8.0f

    .line 227
    .line 228
    const v24, -0x3f9a3d71    # -3.59f

    .line 229
    .line 230
    .line 231
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 232
    .line 233
    .line 234
    const v25, 0x3c23d70a    # 0.01f

    .line 235
    .line 236
    .line 237
    const v26, -0x41e66666    # -0.15f

    .line 238
    .line 239
    .line 240
    const/16 v21, 0x0

    .line 241
    .line 242
    const v22, -0x42b33333    # -0.05f

    .line 243
    .line 244
    .line 245
    const v23, 0x3c23d70a    # 0.01f

    .line 246
    .line 247
    .line 248
    const v24, -0x42333333    # -0.1f

    .line 249
    .line 250
    .line 251
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 252
    .line 253
    .line 254
    const v25, 0x40b7ae14    # 5.74f

    .line 255
    .line 256
    .line 257
    const v26, -0x3f4e6666    # -5.55f

    .line 258
    .line 259
    .line 260
    const v21, 0x40266666    # 2.6f

    .line 261
    .line 262
    .line 263
    const v22, -0x40851eb8    # -0.98f

    .line 264
    .line 265
    .line 266
    const v23, 0x4095c28f    # 4.68f

    .line 267
    .line 268
    .line 269
    const v24, -0x3fc0a3d7    # -2.99f

    .line 270
    .line 271
    .line 272
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 273
    .line 274
    .line 275
    const/high16 v25, 0x418c0000    # 17.5f

    .line 276
    .line 277
    const/high16 v26, 0x41200000    # 10.0f

    .line 278
    .line 279
    const v21, 0x413947ae    # 11.58f

    .line 280
    .line 281
    .line 282
    const v22, 0x4108f5c3    # 8.56f

    .line 283
    .line 284
    .line 285
    const v23, 0x4165eb85    # 14.37f

    .line 286
    .line 287
    .line 288
    const/high16 v24, 0x41200000    # 10.0f

    .line 289
    .line 290
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 291
    .line 292
    .line 293
    const v25, 0x400ae148    # 2.17f

    .line 294
    .line 295
    .line 296
    const v26, -0x418a3d71    # -0.24f

    .line 297
    .line 298
    .line 299
    const/high16 v21, 0x3f400000    # 0.75f

    .line 300
    .line 301
    const/16 v22, 0x0

    .line 302
    .line 303
    const v23, 0x3fbc28f6    # 1.47f

    .line 304
    .line 305
    .line 306
    const v24, -0x4247ae14    # -0.09f

    .line 307
    .line 308
    .line 309
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 310
    .line 311
    .line 312
    const/high16 v25, 0x41a00000    # 20.0f

    .line 313
    .line 314
    const/high16 v26, 0x41400000    # 12.0f

    .line 315
    .line 316
    const v21, 0x419f0a3d    # 19.88f

    .line 317
    .line 318
    .line 319
    const v22, 0x4127851f    # 10.47f

    .line 320
    .line 321
    .line 322
    const/high16 v23, 0x41a00000    # 20.0f

    .line 323
    .line 324
    const v24, 0x4133851f    # 11.22f

    .line 325
    .line 326
    .line 327
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 328
    .line 329
    .line 330
    const/high16 v25, 0x41400000    # 12.0f

    .line 331
    .line 332
    const/high16 v26, 0x41a00000    # 20.0f

    .line 333
    .line 334
    const/high16 v21, 0x41a00000    # 20.0f

    .line 335
    .line 336
    const v22, 0x418347ae    # 16.41f

    .line 337
    .line 338
    .line 339
    const v23, 0x418347ae    # 16.41f

    .line 340
    .line 341
    .line 342
    const/high16 v24, 0x41a00000    # 20.0f

    .line 343
    .line 344
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 345
    .line 346
    .line 347
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 348
    .line 349
    .line 350
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 351
    .line 352
    .line 353
    move-result-object v2

    .line 354
    const/16 v16, 0x3800

    .line 355
    .line 356
    const/16 v17, 0x0

    .line 357
    .line 358
    const/high16 v6, 0x3f800000    # 1.0f

    .line 359
    .line 360
    const/high16 v8, 0x3f800000    # 1.0f

    .line 361
    .line 362
    const/4 v7, 0x0

    .line 363
    const/high16 v9, 0x3f800000    # 1.0f

    .line 364
    .line 365
    const/high16 v12, 0x3f800000    # 1.0f

    .line 366
    .line 367
    const/4 v13, 0x0

    .line 368
    const/4 v14, 0x0

    .line 369
    const/4 v15, 0x0

    .line 370
    const-string v4, ""

    .line 371
    .line 372
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 373
    .line 374
    .line 375
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 376
    .line 377
    .line 378
    move-result v3

    .line 379
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 380
    .line 381
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 382
    .line 383
    .line 384
    move-result-wide v6

    .line 385
    const/4 v2, 0x0

    .line 386
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 387
    .line 388
    .line 389
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 390
    .line 391
    .line 392
    move-result v10

    .line 393
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 394
    .line 395
    .line 396
    move-result v11

    .line 397
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 398
    .line 399
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 400
    .line 401
    .line 402
    const/high16 v4, 0x41100000    # 9.0f

    .line 403
    .line 404
    const/high16 v6, 0x41500000    # 13.0f

    .line 405
    .line 406
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 407
    .line 408
    .line 409
    const/4 v4, 0x0

    .line 410
    const/high16 v6, -0x40600000    # -1.25f

    .line 411
    .line 412
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 413
    .line 414
    .line 415
    const/high16 v26, 0x40200000    # 2.5f

    .line 416
    .line 417
    const/16 v27, 0x0

    .line 418
    .line 419
    const/high16 v21, 0x3fa00000    # 1.25f

    .line 420
    .line 421
    const/high16 v22, 0x3fa00000    # 1.25f

    .line 422
    .line 423
    const/16 v23, 0x0

    .line 424
    .line 425
    const/16 v24, 0x1

    .line 426
    .line 427
    const/16 v25, 0x1

    .line 428
    .line 429
    move-object/from16 v20, v2

    .line 430
    .line 431
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 432
    .line 433
    .line 434
    const/high16 v26, -0x3fe00000    # -2.5f

    .line 435
    .line 436
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 437
    .line 438
    .line 439
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 440
    .line 441
    .line 442
    move-result-object v2

    .line 443
    const/high16 v6, 0x3f800000    # 1.0f

    .line 444
    .line 445
    const/4 v7, 0x0

    .line 446
    const-string v4, ""

    .line 447
    .line 448
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 449
    .line 450
    .line 451
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 452
    .line 453
    .line 454
    move-result v3

    .line 455
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 456
    .line 457
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 458
    .line 459
    .line 460
    move-result-wide v6

    .line 461
    const/4 v0, 0x0

    .line 462
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 463
    .line 464
    .line 465
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 466
    .line 467
    .line 468
    move-result v10

    .line 469
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 470
    .line 471
    .line 472
    move-result v11

    .line 473
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 474
    .line 475
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 476
    .line 477
    .line 478
    const/high16 v0, 0x41700000    # 15.0f

    .line 479
    .line 480
    const/high16 v2, 0x41500000    # 13.0f

    .line 481
    .line 482
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 483
    .line 484
    .line 485
    const/4 v0, 0x0

    .line 486
    const/high16 v2, -0x40600000    # -1.25f

    .line 487
    .line 488
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 489
    .line 490
    .line 491
    const/high16 v18, 0x40200000    # 2.5f

    .line 492
    .line 493
    const/16 v19, 0x0

    .line 494
    .line 495
    const/high16 v13, 0x3fa00000    # 1.25f

    .line 496
    .line 497
    const/high16 v14, 0x3fa00000    # 1.25f

    .line 498
    .line 499
    const/16 v16, 0x1

    .line 500
    .line 501
    const/16 v17, 0x1

    .line 502
    .line 503
    invoke-virtual/range {v12 .. v19}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 504
    .line 505
    .line 506
    const/high16 v18, -0x3fe00000    # -2.5f

    .line 507
    .line 508
    invoke-virtual/range {v12 .. v19}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 509
    .line 510
    .line 511
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 512
    .line 513
    .line 514
    move-result-object v2

    .line 515
    const/16 v16, 0x3800

    .line 516
    .line 517
    const/16 v17, 0x0

    .line 518
    .line 519
    const/high16 v6, 0x3f800000    # 1.0f

    .line 520
    .line 521
    const/4 v7, 0x0

    .line 522
    const/high16 v12, 0x3f800000    # 1.0f

    .line 523
    .line 524
    const/4 v13, 0x0

    .line 525
    const/4 v14, 0x0

    .line 526
    const-string v4, ""

    .line 527
    .line 528
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 529
    .line 530
    .line 531
    move-result-object v0

    .line 532
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 533
    .line 534
    .line 535
    move-result-object v0

    .line 536
    sput-object v0, Landroidx/compose/material/icons/rounded/Face4Kt;->_face4:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 537
    .line 538
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 539
    .line 540
    .line 541
    return-object v0
.end method
