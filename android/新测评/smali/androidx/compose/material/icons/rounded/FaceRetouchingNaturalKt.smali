.class public final Landroidx/compose/material/icons/rounded/FaceRetouchingNaturalKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_faceRetouchingNatural",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "FaceRetouchingNatural",
        "Landroidx/compose/material/icons/Icons$Rounded;",
        "getFaceRetouchingNatural",
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
        "SMAP\nFaceRetouchingNatural.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FaceRetouchingNatural.kt\nandroidx/compose/material/icons/rounded/FaceRetouchingNaturalKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,87:1\n212#2,12:88\n233#2,18:101\n253#2:138\n233#2,18:139\n253#2:176\n233#2,18:177\n253#2:214\n233#2,18:215\n253#2:252\n174#3:100\n705#4,2:119\n717#4,2:121\n719#4,11:127\n705#4,2:157\n717#4,2:159\n719#4,11:165\n705#4,2:195\n717#4,2:197\n719#4,11:203\n705#4,2:233\n717#4,2:235\n719#4,11:241\n72#5,4:123\n72#5,4:161\n72#5,4:199\n72#5,4:237\n*S KotlinDebug\n*F\n+ 1 FaceRetouchingNatural.kt\nandroidx/compose/material/icons/rounded/FaceRetouchingNaturalKt\n*L\n29#1:88,12\n30#1:101,18\n30#1:138\n46#1:139,18\n46#1:176\n52#1:177,18\n52#1:214\n58#1:215,18\n58#1:252\n29#1:100\n30#1:119,2\n30#1:121,2\n30#1:127,11\n46#1:157,2\n46#1:159,2\n46#1:165,11\n52#1:195,2\n52#1:197,2\n52#1:203,11\n58#1:233,2\n58#1:235,2\n58#1:241,11\n30#1:123,4\n46#1:161,4\n52#1:199,4\n58#1:237,4\n*E\n"
    }
.end annotation


# static fields
.field private static _faceRetouchingNatural:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getFaceRetouchingNatural(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 28

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/FaceRetouchingNaturalKt;->_faceRetouchingNatural:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.FaceRetouchingNatural"

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
    const v4, 0x41b0147b    # 22.01f

    .line 71
    .line 72
    .line 73
    const v6, 0x4081999a    # 4.05f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v4, 0x4059999a    # 3.4f

    .line 80
    .line 81
    .line 82
    const v6, 0x41a4cccd    # 20.6f

    .line 83
    .line 84
    .line 85
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 86
    .line 87
    .line 88
    const v4, -0x404b851f    # -1.41f

    .line 89
    .line 90
    .line 91
    const v6, -0x40d9999a    # -0.65f

    .line 92
    .line 93
    .line 94
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 95
    .line 96
    .line 97
    const v25, -0x40970a3d    # -0.91f

    .line 98
    .line 99
    .line 100
    const/16 v26, 0x0

    .line 101
    .line 102
    const v21, -0x41c7ae14    # -0.18f

    .line 103
    .line 104
    .line 105
    const v22, -0x413851ec    # -0.39f

    .line 106
    .line 107
    .line 108
    const v23, -0x40c51eb8    # -0.73f

    .line 109
    .line 110
    .line 111
    const v24, -0x413851ec    # -0.39f

    .line 112
    .line 113
    .line 114
    move-object/from16 v20, v2

    .line 115
    .line 116
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 117
    .line 118
    .line 119
    const v4, 0x41933333    # 18.4f

    .line 120
    .line 121
    .line 122
    const v6, 0x4059999a    # 3.4f

    .line 123
    .line 124
    .line 125
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 126
    .line 127
    .line 128
    const v4, 0x3f266666    # 0.65f

    .line 129
    .line 130
    .line 131
    const v6, -0x404b851f    # -1.41f

    .line 132
    .line 133
    .line 134
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 135
    .line 136
    .line 137
    const/16 v25, 0x0

    .line 138
    .line 139
    const v26, 0x3f68f5c3    # 0.91f

    .line 140
    .line 141
    .line 142
    const v21, -0x413851ec    # -0.39f

    .line 143
    .line 144
    .line 145
    const v22, 0x3e3851ec    # 0.18f

    .line 146
    .line 147
    .line 148
    const v23, -0x413851ec    # -0.39f

    .line 149
    .line 150
    .line 151
    const v24, 0x3f3ae148    # 0.73f

    .line 152
    .line 153
    .line 154
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 155
    .line 156
    .line 157
    const v4, 0x40b33333    # 5.6f

    .line 158
    .line 159
    .line 160
    const v6, 0x41933333    # 18.4f

    .line 161
    .line 162
    .line 163
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 164
    .line 165
    .line 166
    const v4, 0x3fb47ae1    # 1.41f

    .line 167
    .line 168
    .line 169
    const v6, 0x3f266666    # 0.65f

    .line 170
    .line 171
    .line 172
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 173
    .line 174
    .line 175
    const v25, 0x3f68f5c3    # 0.91f

    .line 176
    .line 177
    .line 178
    const/16 v26, 0x0

    .line 179
    .line 180
    const v21, 0x3e3851ec    # 0.18f

    .line 181
    .line 182
    .line 183
    const v22, 0x3ec7ae14    # 0.39f

    .line 184
    .line 185
    .line 186
    const v23, 0x3f3ae148    # 0.73f

    .line 187
    .line 188
    .line 189
    const v24, 0x3ec7ae14    # 0.39f

    .line 190
    .line 191
    .line 192
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 193
    .line 194
    .line 195
    const v4, 0x40b33333    # 5.6f

    .line 196
    .line 197
    .line 198
    const v6, 0x41a4cccd    # 20.6f

    .line 199
    .line 200
    .line 201
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 202
    .line 203
    .line 204
    const v4, 0x3fb47ae1    # 1.41f

    .line 205
    .line 206
    .line 207
    const v6, -0x40d9999a    # -0.65f

    .line 208
    .line 209
    .line 210
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 211
    .line 212
    .line 213
    const v25, 0x41b0147b    # 22.01f

    .line 214
    .line 215
    .line 216
    const v26, 0x4081999a    # 4.05f

    .line 217
    .line 218
    .line 219
    const v21, 0x41b33333    # 22.4f

    .line 220
    .line 221
    .line 222
    const v22, 0x4098f5c3    # 4.78f

    .line 223
    .line 224
    .line 225
    const v23, 0x41b33333    # 22.4f

    .line 226
    .line 227
    .line 228
    const v24, 0x40870a3d    # 4.22f

    .line 229
    .line 230
    .line 231
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 232
    .line 233
    .line 234
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 235
    .line 236
    .line 237
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 238
    .line 239
    .line 240
    move-result-object v2

    .line 241
    const/16 v16, 0x3800

    .line 242
    .line 243
    const/16 v17, 0x0

    .line 244
    .line 245
    const/high16 v6, 0x3f800000    # 1.0f

    .line 246
    .line 247
    const/high16 v8, 0x3f800000    # 1.0f

    .line 248
    .line 249
    const/4 v7, 0x0

    .line 250
    const/high16 v9, 0x3f800000    # 1.0f

    .line 251
    .line 252
    const/high16 v12, 0x3f800000    # 1.0f

    .line 253
    .line 254
    const/4 v13, 0x0

    .line 255
    const/4 v14, 0x0

    .line 256
    const/4 v15, 0x0

    .line 257
    const-string v4, ""

    .line 258
    .line 259
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 260
    .line 261
    .line 262
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 263
    .line 264
    .line 265
    move-result v3

    .line 266
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 267
    .line 268
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 269
    .line 270
    .line 271
    move-result-wide v6

    .line 272
    const/4 v2, 0x0

    .line 273
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 274
    .line 275
    .line 276
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 277
    .line 278
    .line 279
    move-result v10

    .line 280
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 281
    .line 282
    .line 283
    move-result v11

    .line 284
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 285
    .line 286
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 287
    .line 288
    .line 289
    const/high16 v4, 0x41100000    # 9.0f

    .line 290
    .line 291
    const/high16 v6, 0x41500000    # 13.0f

    .line 292
    .line 293
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 294
    .line 295
    .line 296
    const/4 v4, 0x0

    .line 297
    const/high16 v6, -0x40600000    # -1.25f

    .line 298
    .line 299
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 300
    .line 301
    .line 302
    const/high16 v26, 0x40200000    # 2.5f

    .line 303
    .line 304
    const/16 v27, 0x0

    .line 305
    .line 306
    const/high16 v21, 0x3fa00000    # 1.25f

    .line 307
    .line 308
    const/high16 v22, 0x3fa00000    # 1.25f

    .line 309
    .line 310
    const/16 v23, 0x0

    .line 311
    .line 312
    const/16 v24, 0x1

    .line 313
    .line 314
    const/16 v25, 0x1

    .line 315
    .line 316
    move-object/from16 v20, v2

    .line 317
    .line 318
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 319
    .line 320
    .line 321
    const/high16 v26, -0x3fe00000    # -2.5f

    .line 322
    .line 323
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 324
    .line 325
    .line 326
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 327
    .line 328
    .line 329
    move-result-object v2

    .line 330
    const/high16 v6, 0x3f800000    # 1.0f

    .line 331
    .line 332
    const/4 v7, 0x0

    .line 333
    const-string v4, ""

    .line 334
    .line 335
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 336
    .line 337
    .line 338
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 339
    .line 340
    .line 341
    move-result v3

    .line 342
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 343
    .line 344
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 345
    .line 346
    .line 347
    move-result-wide v6

    .line 348
    const/4 v2, 0x0

    .line 349
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 350
    .line 351
    .line 352
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 353
    .line 354
    .line 355
    move-result v10

    .line 356
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 357
    .line 358
    .line 359
    move-result v11

    .line 360
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 361
    .line 362
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 363
    .line 364
    .line 365
    const/high16 v4, 0x41700000    # 15.0f

    .line 366
    .line 367
    const/high16 v6, 0x41500000    # 13.0f

    .line 368
    .line 369
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 370
    .line 371
    .line 372
    const/4 v4, 0x0

    .line 373
    const/high16 v6, -0x40600000    # -1.25f

    .line 374
    .line 375
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 376
    .line 377
    .line 378
    const/high16 v26, 0x40200000    # 2.5f

    .line 379
    .line 380
    move-object/from16 v20, v2

    .line 381
    .line 382
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 383
    .line 384
    .line 385
    const/high16 v26, -0x3fe00000    # -2.5f

    .line 386
    .line 387
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 388
    .line 389
    .line 390
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 391
    .line 392
    .line 393
    move-result-object v2

    .line 394
    const/high16 v6, 0x3f800000    # 1.0f

    .line 395
    .line 396
    const/4 v7, 0x0

    .line 397
    const-string v4, ""

    .line 398
    .line 399
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 400
    .line 401
    .line 402
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 403
    .line 404
    .line 405
    move-result v3

    .line 406
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 407
    .line 408
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 409
    .line 410
    .line 411
    move-result-wide v6

    .line 412
    const/4 v0, 0x0

    .line 413
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 414
    .line 415
    .line 416
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 417
    .line 418
    .line 419
    move-result v10

    .line 420
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 421
    .line 422
    .line 423
    move-result v11

    .line 424
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 425
    .line 426
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 427
    .line 428
    .line 429
    const/high16 v0, 0x419c0000    # 19.5f

    .line 430
    .line 431
    const v2, 0x410ccccd    # 8.8f

    .line 432
    .line 433
    .line 434
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 435
    .line 436
    .line 437
    const v17, -0x40170a3d    # -1.82f

    .line 438
    .line 439
    .line 440
    const v18, -0x406a3d71    # -1.17f

    .line 441
    .line 442
    .line 443
    const v13, -0x40b851ec    # -0.78f

    .line 444
    .line 445
    .line 446
    const v15, -0x404147ae    # -1.49f

    .line 447
    .line 448
    .line 449
    const v16, -0x41147ae1    # -0.46f

    .line 450
    .line 451
    .line 452
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 453
    .line 454
    .line 455
    const v0, -0x4099999a    # -0.9f

    .line 456
    .line 457
    .line 458
    const v2, -0x412e147b    # -0.41f

    .line 459
    .line 460
    .line 461
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 462
    .line 463
    .line 464
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 465
    .line 466
    .line 467
    const v17, 0x41733333    # 15.2f

    .line 468
    .line 469
    .line 470
    const/high16 v18, 0x40900000    # 4.5f

    .line 471
    .line 472
    const v13, 0x417a8f5c    # 15.66f

    .line 473
    .line 474
    .line 475
    const v14, 0x40bfae14    # 5.99f

    .line 476
    .line 477
    .line 478
    const v15, 0x41733333    # 15.2f

    .line 479
    .line 480
    .line 481
    const v16, 0x40a8f5c3    # 5.28f

    .line 482
    .line 483
    .line 484
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 485
    .line 486
    .line 487
    const v17, 0x3f5eb852    # 0.87f

    .line 488
    .line 489
    .line 490
    const v18, -0x402f5c29    # -1.63f

    .line 491
    .line 492
    .line 493
    const/4 v13, 0x0

    .line 494
    const v14, -0x40d70a3d    # -0.66f

    .line 495
    .line 496
    .line 497
    const v15, 0x3eae147b    # 0.34f

    .line 498
    .line 499
    .line 500
    const v16, -0x405eb852    # -1.26f

    .line 501
    .line 502
    .line 503
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 504
    .line 505
    .line 506
    const/high16 v17, 0x41400000    # 12.0f

    .line 507
    .line 508
    const/high16 v18, 0x40000000    # 2.0f

    .line 509
    .line 510
    const v13, 0x416d47ae    # 14.83f

    .line 511
    .line 512
    .line 513
    const v14, 0x40147ae1    # 2.32f

    .line 514
    .line 515
    .line 516
    const v15, 0x41573333    # 13.45f

    .line 517
    .line 518
    .line 519
    const/high16 v16, 0x40000000    # 2.0f

    .line 520
    .line 521
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 522
    .line 523
    .line 524
    const/high16 v17, 0x40000000    # 2.0f

    .line 525
    .line 526
    const/high16 v18, 0x41400000    # 12.0f

    .line 527
    .line 528
    const v13, 0x40cf5c29    # 6.48f

    .line 529
    .line 530
    .line 531
    const/high16 v14, 0x40000000    # 2.0f

    .line 532
    .line 533
    const/high16 v15, 0x40000000    # 2.0f

    .line 534
    .line 535
    const v16, 0x40cf5c29    # 6.48f

    .line 536
    .line 537
    .line 538
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 539
    .line 540
    .line 541
    const v0, 0x408f5c29    # 4.48f

    .line 542
    .line 543
    .line 544
    const/high16 v2, 0x41200000    # 10.0f

    .line 545
    .line 546
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 547
    .line 548
    .line 549
    const v0, -0x3f70a3d7    # -4.48f

    .line 550
    .line 551
    .line 552
    const/high16 v2, -0x3ee00000    # -10.0f

    .line 553
    .line 554
    const/high16 v4, 0x41200000    # 10.0f

    .line 555
    .line 556
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 557
    .line 558
    .line 559
    const v17, -0x40a147ae    # -0.87f

    .line 560
    .line 561
    .line 562
    const v18, -0x3f7dc28f    # -4.07f

    .line 563
    .line 564
    .line 565
    const/4 v13, 0x0

    .line 566
    const v14, -0x40466666    # -1.45f

    .line 567
    .line 568
    .line 569
    const v15, -0x415c28f6    # -0.32f

    .line 570
    .line 571
    .line 572
    const v16, -0x3fcae148    # -2.83f

    .line 573
    .line 574
    .line 575
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 576
    .line 577
    .line 578
    const/high16 v17, 0x419c0000    # 19.5f

    .line 579
    .line 580
    const v18, 0x410ccccd    # 8.8f

    .line 581
    .line 582
    .line 583
    const v13, 0x41a6147b    # 20.76f

    .line 584
    .line 585
    .line 586
    const v14, 0x41075c29    # 8.46f

    .line 587
    .line 588
    .line 589
    const v15, 0x41a147ae    # 20.16f

    .line 590
    .line 591
    .line 592
    const v16, 0x410ccccd    # 8.8f

    .line 593
    .line 594
    .line 595
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 596
    .line 597
    .line 598
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 599
    .line 600
    .line 601
    const/high16 v0, 0x41400000    # 12.0f

    .line 602
    .line 603
    const/high16 v2, 0x41a00000    # 20.0f

    .line 604
    .line 605
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 606
    .line 607
    .line 608
    const/high16 v17, -0x3f000000    # -8.0f

    .line 609
    .line 610
    const/high16 v18, -0x3f000000    # -8.0f

    .line 611
    .line 612
    const v13, -0x3f72e148    # -4.41f

    .line 613
    .line 614
    .line 615
    const/4 v14, 0x0

    .line 616
    const/high16 v15, -0x3f000000    # -8.0f

    .line 617
    .line 618
    const v16, -0x3f9a3d71    # -3.59f

    .line 619
    .line 620
    .line 621
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 622
    .line 623
    .line 624
    const/16 v17, 0x0

    .line 625
    .line 626
    const v18, -0x41f0a3d7    # -0.14f

    .line 627
    .line 628
    .line 629
    const/4 v13, 0x0

    .line 630
    const v14, -0x42b33333    # -0.05f

    .line 631
    .line 632
    .line 633
    const v15, 0x3c23d70a    # 0.01f

    .line 634
    .line 635
    .line 636
    const v16, -0x42333333    # -0.1f

    .line 637
    .line 638
    .line 639
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 640
    .line 641
    .line 642
    const v17, 0x40b7ae14    # 5.74f

    .line 643
    .line 644
    .line 645
    const v18, -0x3f4e6666    # -5.55f

    .line 646
    .line 647
    .line 648
    const v13, 0x40266666    # 2.6f

    .line 649
    .line 650
    .line 651
    const v14, -0x40851eb8    # -0.98f

    .line 652
    .line 653
    .line 654
    const v15, 0x4096147b    # 4.69f

    .line 655
    .line 656
    .line 657
    const v16, -0x3fc0a3d7    # -2.99f

    .line 658
    .line 659
    .line 660
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 661
    .line 662
    .line 663
    const/high16 v17, 0x418c0000    # 17.5f

    .line 664
    .line 665
    const/high16 v18, 0x41200000    # 10.0f

    .line 666
    .line 667
    const v13, 0x413947ae    # 11.58f

    .line 668
    .line 669
    .line 670
    const v14, 0x4108f5c3    # 8.56f

    .line 671
    .line 672
    .line 673
    const v15, 0x4165eb85    # 14.37f

    .line 674
    .line 675
    .line 676
    const/high16 v16, 0x41200000    # 10.0f

    .line 677
    .line 678
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 679
    .line 680
    .line 681
    const v17, 0x400ae148    # 2.17f

    .line 682
    .line 683
    .line 684
    const v18, -0x418a3d71    # -0.24f

    .line 685
    .line 686
    .line 687
    const/high16 v13, 0x3f400000    # 0.75f

    .line 688
    .line 689
    const/4 v14, 0x0

    .line 690
    const v15, 0x3fbc28f6    # 1.47f

    .line 691
    .line 692
    .line 693
    const v16, -0x4247ae14    # -0.09f

    .line 694
    .line 695
    .line 696
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 697
    .line 698
    .line 699
    const/high16 v17, 0x41a00000    # 20.0f

    .line 700
    .line 701
    const/high16 v18, 0x41400000    # 12.0f

    .line 702
    .line 703
    const v13, 0x419f0a3d    # 19.88f

    .line 704
    .line 705
    .line 706
    const v14, 0x4127851f    # 10.47f

    .line 707
    .line 708
    .line 709
    const/high16 v15, 0x41a00000    # 20.0f

    .line 710
    .line 711
    const v16, 0x4133851f    # 11.22f

    .line 712
    .line 713
    .line 714
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 715
    .line 716
    .line 717
    const/high16 v17, 0x41400000    # 12.0f

    .line 718
    .line 719
    const/high16 v18, 0x41a00000    # 20.0f

    .line 720
    .line 721
    const/high16 v13, 0x41a00000    # 20.0f

    .line 722
    .line 723
    const v14, 0x418347ae    # 16.41f

    .line 724
    .line 725
    .line 726
    const v15, 0x418347ae    # 16.41f

    .line 727
    .line 728
    .line 729
    const/high16 v16, 0x41a00000    # 20.0f

    .line 730
    .line 731
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 732
    .line 733
    .line 734
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 735
    .line 736
    .line 737
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 738
    .line 739
    .line 740
    move-result-object v2

    .line 741
    const/16 v16, 0x3800

    .line 742
    .line 743
    const/16 v17, 0x0

    .line 744
    .line 745
    const/high16 v6, 0x3f800000    # 1.0f

    .line 746
    .line 747
    const/4 v7, 0x0

    .line 748
    const/high16 v12, 0x3f800000    # 1.0f

    .line 749
    .line 750
    const/4 v13, 0x0

    .line 751
    const/4 v14, 0x0

    .line 752
    const/4 v15, 0x0

    .line 753
    const-string v4, ""

    .line 754
    .line 755
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 756
    .line 757
    .line 758
    move-result-object v0

    .line 759
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 760
    .line 761
    .line 762
    move-result-object v0

    .line 763
    sput-object v0, Landroidx/compose/material/icons/rounded/FaceRetouchingNaturalKt;->_faceRetouchingNatural:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 764
    .line 765
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 766
    .line 767
    .line 768
    return-object v0
.end method
