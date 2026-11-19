.class public final Landroidx/compose/material/icons/rounded/ScreenLockRotationKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_screenLockRotation",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "ScreenLockRotation",
        "Landroidx/compose/material/icons/Icons$Rounded;",
        "getScreenLockRotation",
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
        "SMAP\nScreenLockRotation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScreenLockRotation.kt\nandroidx/compose/material/icons/rounded/ScreenLockRotationKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,92:1\n212#2,12:93\n233#2,18:106\n253#2:143\n233#2,18:144\n253#2:181\n233#2,18:182\n253#2:219\n174#3:105\n705#4,2:124\n717#4,2:126\n719#4,11:132\n705#4,2:162\n717#4,2:164\n719#4,11:170\n705#4,2:200\n717#4,2:202\n719#4,11:208\n72#5,4:128\n72#5,4:166\n72#5,4:204\n*S KotlinDebug\n*F\n+ 1 ScreenLockRotation.kt\nandroidx/compose/material/icons/rounded/ScreenLockRotationKt\n*L\n29#1:93,12\n30#1:106,18\n30#1:143\n52#1:144,18\n52#1:181\n65#1:182,18\n65#1:219\n29#1:105\n30#1:124,2\n30#1:126,2\n30#1:132,11\n52#1:162,2\n52#1:164,2\n52#1:170,11\n65#1:200,2\n65#1:202,2\n65#1:208,11\n30#1:128,4\n52#1:166,4\n65#1:204,4\n*E\n"
    }
.end annotation


# static fields
.field private static _screenLockRotation:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getScreenLockRotation(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/ScreenLockRotationKt;->_screenLockRotation:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.ScreenLockRotation"

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
    const v4, 0x41a347ae    # 20.41f

    .line 71
    .line 72
    .line 73
    const v6, 0x4135c28f    # 11.36f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v4, -0x414ccccd    # -0.35f

    .line 80
    .line 81
    .line 82
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 83
    .line 84
    .line 85
    const v25, -0x404b851f    # -1.41f

    .line 86
    .line 87
    .line 88
    const/16 v26, 0x0

    .line 89
    .line 90
    const v21, -0x413851ec    # -0.39f

    .line 91
    .line 92
    .line 93
    const v22, -0x413851ec    # -0.39f

    .line 94
    .line 95
    .line 96
    const v23, -0x407d70a4    # -1.02f

    .line 97
    .line 98
    .line 99
    const v24, -0x413851ec    # -0.39f

    .line 100
    .line 101
    .line 102
    move-object/from16 v20, v2

    .line 103
    .line 104
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 105
    .line 106
    .line 107
    const/16 v25, 0x0

    .line 108
    .line 109
    const v26, 0x3fb47ae1    # 1.41f

    .line 110
    .line 111
    .line 112
    const v22, 0x3ec7ae14    # 0.39f

    .line 113
    .line 114
    .line 115
    const v23, -0x413851ec    # -0.39f

    .line 116
    .line 117
    .line 118
    const v24, 0x3f828f5c    # 1.02f

    .line 119
    .line 120
    .line 121
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 122
    .line 123
    .line 124
    const/high16 v4, 0x41980000    # 19.0f

    .line 125
    .line 126
    const v6, 0x414c51ec    # 12.77f

    .line 127
    .line 128
    .line 129
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 130
    .line 131
    .line 132
    const v4, 0x4087ae14    # 4.24f

    .line 133
    .line 134
    .line 135
    const v6, -0x3f7851ec    # -4.24f

    .line 136
    .line 137
    .line 138
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 139
    .line 140
    .line 141
    const v4, 0x40df5c29    # 6.98f

    .line 142
    .line 143
    .line 144
    const v6, 0x4113ae14    # 9.23f

    .line 145
    .line 146
    .line 147
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 148
    .line 149
    .line 150
    const v4, 0x4087ae14    # 4.24f

    .line 151
    .line 152
    .line 153
    const v6, -0x3f7851ec    # -4.24f

    .line 154
    .line 155
    .line 156
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 157
    .line 158
    .line 159
    const v4, 0x3eb33333    # 0.35f

    .line 160
    .line 161
    .line 162
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 163
    .line 164
    .line 165
    const v25, 0x3fb47ae1    # 1.41f

    .line 166
    .line 167
    .line 168
    const/16 v26, 0x0

    .line 169
    .line 170
    const v21, 0x3ec7ae14    # 0.39f

    .line 171
    .line 172
    .line 173
    const v23, 0x3f828f5c    # 1.02f

    .line 174
    .line 175
    .line 176
    const v24, 0x3ec7ae14    # 0.39f

    .line 177
    .line 178
    .line 179
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 180
    .line 181
    .line 182
    const/16 v25, 0x0

    .line 183
    .line 184
    const v26, -0x404b851f    # -1.41f

    .line 185
    .line 186
    .line 187
    const v22, -0x413851ec    # -0.39f

    .line 188
    .line 189
    .line 190
    const v23, 0x3ec7ae14    # 0.39f

    .line 191
    .line 192
    .line 193
    const v24, -0x407d70a4    # -1.02f

    .line 194
    .line 195
    .line 196
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 197
    .line 198
    .line 199
    const v4, -0x4147ae14    # -0.36f

    .line 200
    .line 201
    .line 202
    const v6, -0x414ccccd    # -0.35f

    .line 203
    .line 204
    .line 205
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 206
    .line 207
    .line 208
    const v25, -0x3fcb851f    # -2.82f

    .line 209
    .line 210
    .line 211
    const/16 v26, 0x0

    .line 212
    .line 213
    const v21, -0x40b5c28f    # -0.79f

    .line 214
    .line 215
    .line 216
    const v22, -0x40b5c28f    # -0.79f

    .line 217
    .line 218
    .line 219
    const v23, -0x3ffe147b    # -2.03f

    .line 220
    .line 221
    .line 222
    const v24, -0x40b5c28f    # -0.79f

    .line 223
    .line 224
    .line 225
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 226
    .line 227
    .line 228
    const v4, 0x40b23d71    # 5.57f

    .line 229
    .line 230
    .line 231
    const v6, 0x40fa3d71    # 7.82f

    .line 232
    .line 233
    .line 234
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 235
    .line 236
    .line 237
    const/16 v25, 0x0

    .line 238
    .line 239
    const v26, 0x40351eb8    # 2.83f

    .line 240
    .line 241
    .line 242
    const v21, -0x40b851ec    # -0.78f

    .line 243
    .line 244
    .line 245
    const v22, 0x3f47ae14    # 0.78f

    .line 246
    .line 247
    .line 248
    const v23, -0x40b851ec    # -0.78f

    .line 249
    .line 250
    .line 251
    const v24, 0x40033333    # 2.05f

    .line 252
    .line 253
    .line 254
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 255
    .line 256
    .line 257
    const v4, 0x40f8f5c3    # 7.78f

    .line 258
    .line 259
    .line 260
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 261
    .line 262
    .line 263
    const v25, 0x40347ae1    # 2.82f

    .line 264
    .line 265
    .line 266
    const/16 v26, 0x0

    .line 267
    .line 268
    const v21, 0x3f4a3d71    # 0.79f

    .line 269
    .line 270
    .line 271
    const v22, 0x3f4a3d71    # 0.79f

    .line 272
    .line 273
    .line 274
    const v23, 0x4001eb85    # 2.03f

    .line 275
    .line 276
    .line 277
    const v24, 0x3f4a3d71    # 0.79f

    .line 278
    .line 279
    .line 280
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 281
    .line 282
    .line 283
    const v4, 0x4087ae14    # 4.24f

    .line 284
    .line 285
    .line 286
    const v6, -0x3f7851ec    # -4.24f

    .line 287
    .line 288
    .line 289
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 290
    .line 291
    .line 292
    const v25, 0x41a347ae    # 20.41f

    .line 293
    .line 294
    .line 295
    const v26, 0x4135c28f    # 11.36f

    .line 296
    .line 297
    .line 298
    const v21, 0x41a9999a    # 21.2f

    .line 299
    .line 300
    .line 301
    const v22, 0x41568f5c    # 13.41f

    .line 302
    .line 303
    .line 304
    const v23, 0x41a9999a    # 21.2f

    .line 305
    .line 306
    .line 307
    const v24, 0x41423d71    # 12.14f

    .line 308
    .line 309
    .line 310
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 311
    .line 312
    .line 313
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 314
    .line 315
    .line 316
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 317
    .line 318
    .line 319
    move-result-object v2

    .line 320
    const/16 v16, 0x3800

    .line 321
    .line 322
    const/16 v17, 0x0

    .line 323
    .line 324
    const/high16 v6, 0x3f800000    # 1.0f

    .line 325
    .line 326
    const/high16 v8, 0x3f800000    # 1.0f

    .line 327
    .line 328
    const/4 v7, 0x0

    .line 329
    const/high16 v9, 0x3f800000    # 1.0f

    .line 330
    .line 331
    const/high16 v12, 0x3f800000    # 1.0f

    .line 332
    .line 333
    const/4 v13, 0x0

    .line 334
    const/4 v14, 0x0

    .line 335
    const/4 v15, 0x0

    .line 336
    const-string v4, ""

    .line 337
    .line 338
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 339
    .line 340
    .line 341
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 342
    .line 343
    .line 344
    move-result v3

    .line 345
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 346
    .line 347
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 348
    .line 349
    .line 350
    move-result-wide v6

    .line 351
    const/4 v2, 0x0

    .line 352
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 353
    .line 354
    .line 355
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 356
    .line 357
    .line 358
    move-result v10

    .line 359
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 360
    .line 361
    .line 362
    move-result v11

    .line 363
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 364
    .line 365
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 366
    .line 367
    .line 368
    const v4, 0x418ecccd    # 17.85f

    .line 369
    .line 370
    .line 371
    const v6, 0x412d999a    # 10.85f

    .line 372
    .line 373
    .line 374
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 375
    .line 376
    .line 377
    const/high16 v25, 0x41200000    # 10.0f

    .line 378
    .line 379
    const v26, 0x4191ae14    # 18.21f

    .line 380
    .line 381
    .line 382
    const v21, 0x4128a3d7    # 10.54f

    .line 383
    .line 384
    .line 385
    const v22, 0x418c51ec    # 17.54f

    .line 386
    .line 387
    .line 388
    const/high16 v23, 0x41200000    # 10.0f

    .line 389
    .line 390
    const v24, 0x418e147b    # 17.76f

    .line 391
    .line 392
    .line 393
    move-object/from16 v20, v2

    .line 394
    .line 395
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 396
    .line 397
    .line 398
    const v4, 0x3fc3d70a    # 1.53f

    .line 399
    .line 400
    .line 401
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 402
    .line 403
    .line 404
    const v25, -0x3f41999a    # -5.95f

    .line 405
    .line 406
    .line 407
    const v26, -0x3f247ae1    # -6.86f

    .line 408
    .line 409
    .line 410
    const v21, -0x3fb51eb8    # -3.17f

    .line 411
    .line 412
    .line 413
    const v22, -0x40ae147b    # -0.82f

    .line 414
    .line 415
    .line 416
    const v23, -0x3f4d1eb8    # -5.59f

    .line 417
    .line 418
    .line 419
    const v24, -0x3f9d70a4    # -3.54f

    .line 420
    .line 421
    .line 422
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 423
    .line 424
    .line 425
    const v25, 0x4043d70a    # 3.06f

    .line 426
    .line 427
    .line 428
    const/high16 v26, 0x41400000    # 12.0f

    .line 429
    .line 430
    const v21, 0x407f5c29    # 3.99f

    .line 431
    .line 432
    .line 433
    const v22, 0x4145eb85    # 12.37f

    .line 434
    .line 435
    .line 436
    const v23, 0x4063d70a    # 3.56f

    .line 437
    .line 438
    .line 439
    const/high16 v24, 0x41400000    # 12.0f

    .line 440
    .line 441
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 442
    .line 443
    .line 444
    const/high16 v25, -0x40800000    # -1.0f

    .line 445
    .line 446
    const v26, 0x3f8f5c29    # 1.12f

    .line 447
    .line 448
    .line 449
    const v21, -0x40e66666    # -0.6f

    .line 450
    .line 451
    .line 452
    const/16 v22, 0x0

    .line 453
    .line 454
    const v23, -0x40770a3d    # -1.07f

    .line 455
    .line 456
    .line 457
    const v24, 0x3f07ae14    # 0.53f

    .line 458
    .line 459
    .line 460
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 461
    .line 462
    .line 463
    const/high16 v25, 0x41400000    # 12.0f

    .line 464
    .line 465
    const/high16 v26, 0x41b00000    # 22.0f

    .line 466
    .line 467
    const v21, 0x4027ae14    # 2.62f

    .line 468
    .line 469
    .line 470
    const v22, 0x4190e148    # 18.11f

    .line 471
    .line 472
    .line 473
    const v23, 0x40dbd70a    # 6.87f

    .line 474
    .line 475
    .line 476
    const/high16 v24, 0x41b00000    # 22.0f

    .line 477
    .line 478
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 479
    .line 480
    .line 481
    const v25, 0x3fdd70a4    # 1.73f

    .line 482
    .line 483
    .line 484
    const v26, -0x41dc28f6    # -0.16f

    .line 485
    .line 486
    .line 487
    const v21, 0x3f170a3d    # 0.59f

    .line 488
    .line 489
    .line 490
    const/16 v22, 0x0

    .line 491
    .line 492
    const v23, 0x3f95c28f    # 1.17f

    .line 493
    .line 494
    .line 495
    const v24, -0x428a3d71    # -0.06f

    .line 496
    .line 497
    .line 498
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 499
    .line 500
    .line 501
    const v25, 0x3e8a3d71    # 0.27f

    .line 502
    .line 503
    .line 504
    const v26, -0x40a66666    # -0.85f

    .line 505
    .line 506
    .line 507
    const v21, 0x3ecccccd    # 0.4f

    .line 508
    .line 509
    .line 510
    const v22, -0x4270a3d7    # -0.07f

    .line 511
    .line 512
    .line 513
    const v23, 0x3f0ccccd    # 0.55f

    .line 514
    .line 515
    .line 516
    const v24, -0x40f0a3d7    # -0.56f

    .line 517
    .line 518
    .line 519
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 520
    .line 521
    .line 522
    const v4, 0x418ecccd    # 17.85f

    .line 523
    .line 524
    .line 525
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 526
    .line 527
    .line 528
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 529
    .line 530
    .line 531
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 532
    .line 533
    .line 534
    move-result-object v2

    .line 535
    const/high16 v6, 0x3f800000    # 1.0f

    .line 536
    .line 537
    const/4 v7, 0x0

    .line 538
    const-string v4, ""

    .line 539
    .line 540
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 541
    .line 542
    .line 543
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 544
    .line 545
    .line 546
    move-result v3

    .line 547
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 548
    .line 549
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 550
    .line 551
    .line 552
    move-result-wide v6

    .line 553
    const/4 v0, 0x0

    .line 554
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 555
    .line 556
    .line 557
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 558
    .line 559
    .line 560
    move-result v10

    .line 561
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 562
    .line 563
    .line 564
    move-result v11

    .line 565
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 566
    .line 567
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 568
    .line 569
    .line 570
    const/high16 v0, 0x41800000    # 16.0f

    .line 571
    .line 572
    const/high16 v2, 0x41100000    # 9.0f

    .line 573
    .line 574
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 575
    .line 576
    .line 577
    const/high16 v0, 0x40800000    # 4.0f

    .line 578
    .line 579
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 580
    .line 581
    .line 582
    const/high16 v17, 0x3f800000    # 1.0f

    .line 583
    .line 584
    const/high16 v18, -0x40800000    # -1.0f

    .line 585
    .line 586
    const v13, 0x3f0ccccd    # 0.55f

    .line 587
    .line 588
    .line 589
    const/high16 v15, 0x3f800000    # 1.0f

    .line 590
    .line 591
    const v16, -0x4119999a    # -0.45f

    .line 592
    .line 593
    .line 594
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 595
    .line 596
    .line 597
    const/high16 v0, 0x40a00000    # 5.0f

    .line 598
    .line 599
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 600
    .line 601
    .line 602
    const/high16 v17, -0x40800000    # -1.0f

    .line 603
    .line 604
    const/4 v13, 0x0

    .line 605
    const v14, -0x40f33333    # -0.55f

    .line 606
    .line 607
    .line 608
    const v15, -0x4119999a    # -0.45f

    .line 609
    .line 610
    .line 611
    const/high16 v16, -0x40800000    # -1.0f

    .line 612
    .line 613
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 614
    .line 615
    .line 616
    const v0, 0x40470a3d    # 3.11f

    .line 617
    .line 618
    .line 619
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 620
    .line 621
    .line 622
    const v17, -0x402b851f    # -1.66f

    .line 623
    .line 624
    .line 625
    const v18, -0x3ffae148    # -2.08f

    .line 626
    .line 627
    .line 628
    const/high16 v14, -0x40800000    # -1.0f

    .line 629
    .line 630
    const v15, -0x40d1eb85    # -0.68f

    .line 631
    .line 632
    .line 633
    const v16, -0x400a3d71    # -1.92f

    .line 634
    .line 635
    .line 636
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 637
    .line 638
    .line 639
    const/high16 v17, 0x41800000    # 16.0f

    .line 640
    .line 641
    const/high16 v18, 0x40400000    # 3.0f

    .line 642
    .line 643
    const v13, 0x4188a3d7    # 17.08f

    .line 644
    .line 645
    .line 646
    const v14, 0x3f51eb85    # 0.82f

    .line 647
    .line 648
    .line 649
    const/high16 v15, 0x41800000    # 16.0f

    .line 650
    .line 651
    const v16, 0x3fe51eb8    # 1.79f

    .line 652
    .line 653
    .line 654
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 655
    .line 656
    .line 657
    const/high16 v0, 0x3f800000    # 1.0f

    .line 658
    .line 659
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 660
    .line 661
    .line 662
    const/high16 v17, -0x40800000    # -1.0f

    .line 663
    .line 664
    const/high16 v18, 0x3f800000    # 1.0f

    .line 665
    .line 666
    const v13, -0x40f33333    # -0.55f

    .line 667
    .line 668
    .line 669
    const/4 v14, 0x0

    .line 670
    const/high16 v15, -0x40800000    # -1.0f

    .line 671
    .line 672
    const v16, 0x3ee66666    # 0.45f

    .line 673
    .line 674
    .line 675
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 676
    .line 677
    .line 678
    const/high16 v0, 0x40400000    # 3.0f

    .line 679
    .line 680
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 681
    .line 682
    .line 683
    const/high16 v17, 0x41800000    # 16.0f

    .line 684
    .line 685
    const/high16 v18, 0x41100000    # 9.0f

    .line 686
    .line 687
    const/high16 v13, 0x41700000    # 15.0f

    .line 688
    .line 689
    const v14, 0x4108cccd    # 8.55f

    .line 690
    .line 691
    .line 692
    const v15, 0x41773333    # 15.45f

    .line 693
    .line 694
    .line 695
    const/high16 v16, 0x41100000    # 9.0f

    .line 696
    .line 697
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 698
    .line 699
    .line 700
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 701
    .line 702
    .line 703
    const/high16 v0, 0x41880000    # 17.0f

    .line 704
    .line 705
    const/high16 v2, 0x40400000    # 3.0f

    .line 706
    .line 707
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 708
    .line 709
    .line 710
    const/high16 v17, 0x3f800000    # 1.0f

    .line 711
    .line 712
    const/high16 v18, -0x40800000    # -1.0f

    .line 713
    .line 714
    const/4 v13, 0x0

    .line 715
    const v14, -0x40f33333    # -0.55f

    .line 716
    .line 717
    .line 718
    const v15, 0x3ee66666    # 0.45f

    .line 719
    .line 720
    .line 721
    const/high16 v16, -0x40800000    # -1.0f

    .line 722
    .line 723
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 724
    .line 725
    .line 726
    const v0, 0x3ee66666    # 0.45f

    .line 727
    .line 728
    .line 729
    const/high16 v2, 0x3f800000    # 1.0f

    .line 730
    .line 731
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 732
    .line 733
    .line 734
    const/high16 v0, 0x3f800000    # 1.0f

    .line 735
    .line 736
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 737
    .line 738
    .line 739
    const/high16 v0, -0x40000000    # -2.0f

    .line 740
    .line 741
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 742
    .line 743
    .line 744
    const/high16 v0, 0x40400000    # 3.0f

    .line 745
    .line 746
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 747
    .line 748
    .line 749
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 750
    .line 751
    .line 752
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 753
    .line 754
    .line 755
    move-result-object v2

    .line 756
    const/16 v16, 0x3800

    .line 757
    .line 758
    const/16 v17, 0x0

    .line 759
    .line 760
    const/high16 v6, 0x3f800000    # 1.0f

    .line 761
    .line 762
    const/4 v7, 0x0

    .line 763
    const/high16 v12, 0x3f800000    # 1.0f

    .line 764
    .line 765
    const/4 v14, 0x0

    .line 766
    const/4 v15, 0x0

    .line 767
    const-string v4, ""

    .line 768
    .line 769
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 770
    .line 771
    .line 772
    move-result-object v0

    .line 773
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 774
    .line 775
    .line 776
    move-result-object v0

    .line 777
    sput-object v0, Landroidx/compose/material/icons/rounded/ScreenLockRotationKt;->_screenLockRotation:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 778
    .line 779
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 780
    .line 781
    .line 782
    return-object v0
.end method
