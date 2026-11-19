.class public final Landroidx/compose/material/icons/twotone/StarKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_star",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "Star",
        "Landroidx/compose/material/icons/Icons$TwoTone;",
        "getStar",
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
        "SMAP\nStar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Star.kt\nandroidx/compose/material/icons/twotone/StarKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,74:1\n212#2,12:75\n233#2,18:88\n253#2:125\n233#2,18:126\n253#2:163\n174#3:87\n705#4,2:106\n717#4,2:108\n719#4,11:114\n705#4,2:144\n717#4,2:146\n719#4,11:152\n72#5,4:110\n72#5,4:148\n*S KotlinDebug\n*F\n+ 1 Star.kt\nandroidx/compose/material/icons/twotone/StarKt\n*L\n29#1:75,12\n30#1:88,18\n30#1:125\n43#1:126,18\n43#1:163\n29#1:87\n30#1:106,2\n30#1:108,2\n30#1:114,11\n43#1:144,2\n43#1:146,2\n43#1:152,11\n30#1:110,4\n43#1:148,4\n*E\n"
    }
.end annotation


# static fields
.field private static _star:Landroidx/compose/ui/graphics/vector/ImageVector;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field


# direct methods
.method public static final getStar(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 32
    .param p0    # Landroidx/compose/material/icons/Icons$TwoTone;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/StarKt;->_star:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.Star"

    .line 25
    .line 26
    const/high16 v5, 0x41c00000    # 24.0f

    .line 27
    .line 28
    const/high16 v6, 0x41c00000    # 24.0f

    .line 29
    .line 30
    const-wide/16 v7, 0x0

    .line 31
    .line 32
    const/4 v9, 0x0

    .line 33
    const/4 v10, 0x0

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
    const/high16 v4, 0x41400000    # 12.0f

    .line 66
    .line 67
    const v6, 0x41766666    # 15.4f

    .line 68
    .line 69
    .line 70
    const v7, -0x3f8f5c29    # -3.76f

    .line 71
    .line 72
    .line 73
    const v8, 0x401147ae    # 2.27f

    .line 74
    .line 75
    .line 76
    invoke-static {v4, v6, v7, v8}, Landroidx/compose/material3/c;->g(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    move-result-object v9

    .line 80
    const/high16 v12, 0x3f800000    # 1.0f

    .line 81
    .line 82
    const v13, -0x3f770a3d    # -4.28f

    .line 83
    .line 84
    .line 85
    invoke-virtual {v9, v12, v13}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 86
    .line 87
    .line 88
    const v14, -0x3fab851f    # -3.32f

    .line 89
    .line 90
    .line 91
    const v15, -0x3fc7ae14    # -2.88f

    .line 92
    .line 93
    .line 94
    invoke-virtual {v9, v14, v15}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 95
    .line 96
    .line 97
    const v6, 0x408c28f6    # 4.38f

    .line 98
    .line 99
    .line 100
    const v7, -0x413d70a4    # -0.38f

    .line 101
    .line 102
    .line 103
    invoke-virtual {v9, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 104
    .line 105
    .line 106
    const v2, 0x3fd9999a    # 1.7f

    .line 107
    .line 108
    .line 109
    const v4, -0x3f7f0a3d    # -4.03f

    .line 110
    .line 111
    .line 112
    invoke-virtual {v9, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 113
    .line 114
    .line 115
    const v2, 0x3fdae148    # 1.71f

    .line 116
    .line 117
    .line 118
    const v4, 0x408147ae    # 4.04f

    .line 119
    .line 120
    .line 121
    invoke-virtual {v9, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 122
    .line 123
    .line 124
    const v7, 0x3ec28f5c    # 0.38f

    .line 125
    .line 126
    .line 127
    invoke-virtual {v9, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 128
    .line 129
    .line 130
    const v6, 0x403851ec    # 2.88f

    .line 131
    .line 132
    .line 133
    const v7, 0x4088f5c3    # 4.28f

    .line 134
    .line 135
    .line 136
    invoke-static {v9, v14, v6, v12, v7}, Landroidx/compose/material3/c;->o(Landroidx/compose/ui/graphics/vector/PathBuilder;FFFF)Ljava/util/List;

    .line 137
    .line 138
    .line 139
    move-result-object v9

    .line 140
    const v20, -0x3f8f5c29    # -3.76f

    .line 141
    .line 142
    .line 143
    const/16 v16, 0x3800

    .line 144
    .line 145
    const/16 v21, 0x0

    .line 146
    .line 147
    const/16 v17, 0x0

    .line 148
    .line 149
    move/from16 v22, v4

    .line 150
    .line 151
    const-string v4, ""

    .line 152
    .line 153
    move/from16 v23, v6

    .line 154
    .line 155
    const v6, 0x3e99999a    # 0.3f

    .line 156
    .line 157
    .line 158
    move/from16 v24, v7

    .line 159
    .line 160
    const/4 v7, 0x0

    .line 161
    move/from16 v25, v8

    .line 162
    .line 163
    const v8, 0x3e99999a    # 0.3f

    .line 164
    .line 165
    .line 166
    move/from16 v26, v2

    .line 167
    .line 168
    move-object v2, v9

    .line 169
    const/high16 v9, 0x3f800000    # 1.0f

    .line 170
    .line 171
    move/from16 v27, v12

    .line 172
    .line 173
    move/from16 v28, v13

    .line 174
    .line 175
    const/4 v13, 0x0

    .line 176
    move/from16 v29, v14

    .line 177
    .line 178
    const/4 v14, 0x0

    .line 179
    move/from16 v30, v15

    .line 180
    .line 181
    const/4 v15, 0x0

    .line 182
    move-object/from16 v31, v0

    .line 183
    .line 184
    move-object/from16 v0, v21

    .line 185
    .line 186
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 187
    .line 188
    .line 189
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 190
    .line 191
    .line 192
    move-result v3

    .line 193
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 194
    .line 195
    invoke-virtual/range {v31 .. v31}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 196
    .line 197
    .line 198
    move-result-wide v6

    .line 199
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/e;)V

    .line 200
    .line 201
    .line 202
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 203
    .line 204
    .line 205
    move-result v10

    .line 206
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 207
    .line 208
    .line 209
    move-result v11

    .line 210
    const v0, -0x3f19eb85    # -7.19f

    .line 211
    .line 212
    .line 213
    const v2, -0x40e147ae    # -0.62f

    .line 214
    .line 215
    .line 216
    const/high16 v4, 0x41b00000    # 22.0f

    .line 217
    .line 218
    const v6, 0x4113d70a    # 9.24f

    .line 219
    .line 220
    .line 221
    invoke-static {v4, v6, v0, v2}, Landroidx/compose/material3/c;->g(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 222
    .line 223
    .line 224
    move-result-object v0

    .line 225
    const/high16 v2, 0x40000000    # 2.0f

    .line 226
    .line 227
    const/high16 v7, 0x41400000    # 12.0f

    .line 228
    .line 229
    invoke-virtual {v0, v7, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 230
    .line 231
    .line 232
    const v8, 0x41130a3d    # 9.19f

    .line 233
    .line 234
    .line 235
    const v9, 0x410a147b    # 8.63f

    .line 236
    .line 237
    .line 238
    invoke-virtual {v0, v8, v9}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 239
    .line 240
    .line 241
    invoke-virtual {v0, v2, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 242
    .line 243
    .line 244
    const v2, 0x40aeb852    # 5.46f

    .line 245
    .line 246
    .line 247
    const v8, 0x40975c29    # 4.73f

    .line 248
    .line 249
    .line 250
    invoke-virtual {v0, v2, v8}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 251
    .line 252
    .line 253
    const v2, 0x40ba3d71    # 5.82f

    .line 254
    .line 255
    .line 256
    const/high16 v8, 0x41a80000    # 21.0f

    .line 257
    .line 258
    invoke-virtual {v0, v2, v8}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 259
    .line 260
    .line 261
    const v2, 0x418a28f6    # 17.27f

    .line 262
    .line 263
    .line 264
    invoke-virtual {v0, v7, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 265
    .line 266
    .line 267
    const v2, 0x419170a4    # 18.18f

    .line 268
    .line 269
    .line 270
    invoke-virtual {v0, v2, v8}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 271
    .line 272
    .line 273
    const v2, -0x402f5c29    # -1.63f

    .line 274
    .line 275
    .line 276
    const v8, -0x3f1f0a3d    # -7.03f

    .line 277
    .line 278
    .line 279
    invoke-virtual {v0, v2, v8}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 280
    .line 281
    .line 282
    invoke-virtual {v0, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 283
    .line 284
    .line 285
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 286
    .line 287
    .line 288
    const v2, 0x41766666    # 15.4f

    .line 289
    .line 290
    .line 291
    invoke-virtual {v0, v7, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 292
    .line 293
    .line 294
    const v4, 0x401147ae    # 2.27f

    .line 295
    .line 296
    .line 297
    const v6, -0x3f8f5c29    # -3.76f

    .line 298
    .line 299
    .line 300
    invoke-virtual {v0, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 301
    .line 302
    .line 303
    const v4, -0x3f770a3d    # -4.28f

    .line 304
    .line 305
    .line 306
    const/high16 v6, 0x3f800000    # 1.0f

    .line 307
    .line 308
    invoke-virtual {v0, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 309
    .line 310
    .line 311
    const v4, -0x3fc7ae14    # -2.88f

    .line 312
    .line 313
    .line 314
    const v8, -0x3fab851f    # -3.32f

    .line 315
    .line 316
    .line 317
    invoke-virtual {v0, v8, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 318
    .line 319
    .line 320
    const v4, -0x413d70a4    # -0.38f

    .line 321
    .line 322
    .line 323
    const v9, 0x408c28f6    # 4.38f

    .line 324
    .line 325
    .line 326
    invoke-virtual {v0, v9, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 327
    .line 328
    .line 329
    const v4, 0x40c33333    # 6.1f

    .line 330
    .line 331
    .line 332
    invoke-virtual {v0, v7, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 333
    .line 334
    .line 335
    const v4, 0x408147ae    # 4.04f

    .line 336
    .line 337
    .line 338
    const v12, 0x3fdae148    # 1.71f

    .line 339
    .line 340
    .line 341
    invoke-virtual {v0, v12, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 342
    .line 343
    .line 344
    const v4, 0x3ec28f5c    # 0.38f

    .line 345
    .line 346
    .line 347
    invoke-virtual {v0, v9, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 348
    .line 349
    .line 350
    const v4, 0x403851ec    # 2.88f

    .line 351
    .line 352
    .line 353
    invoke-virtual {v0, v8, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 354
    .line 355
    .line 356
    const v4, 0x4088f5c3    # 4.28f

    .line 357
    .line 358
    .line 359
    invoke-virtual {v0, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 360
    .line 361
    .line 362
    invoke-virtual {v0, v7, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 363
    .line 364
    .line 365
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 366
    .line 367
    .line 368
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 369
    .line 370
    .line 371
    move-result-object v2

    .line 372
    const-string v4, ""

    .line 373
    .line 374
    const/high16 v6, 0x3f800000    # 1.0f

    .line 375
    .line 376
    const/4 v7, 0x0

    .line 377
    const/high16 v8, 0x3f800000    # 1.0f

    .line 378
    .line 379
    const/high16 v9, 0x3f800000    # 1.0f

    .line 380
    .line 381
    const/high16 v12, 0x3f800000    # 1.0f

    .line 382
    .line 383
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 384
    .line 385
    .line 386
    move-result-object v0

    .line 387
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 388
    .line 389
    .line 390
    move-result-object v0

    .line 391
    sput-object v0, Landroidx/compose/material/icons/twotone/StarKt;->_star:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 392
    .line 393
    invoke-static {v0}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 394
    .line 395
    .line 396
    return-object v0
.end method
