.class public final Landroidx/compose/material/icons/rounded/CelebrationKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_celebration",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "Celebration",
        "Landroidx/compose/material/icons/Icons$Rounded;",
        "getCelebration",
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
        "SMAP\nCelebration.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Celebration.kt\nandroidx/compose/material/icons/rounded/CelebrationKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,109:1\n212#2,12:110\n233#2,18:123\n253#2:160\n233#2,18:161\n253#2:198\n233#2,18:199\n253#2:236\n233#2,18:237\n253#2:274\n233#2,18:275\n253#2:312\n174#3:122\n705#4,2:141\n717#4,2:143\n719#4,11:149\n705#4,2:179\n717#4,2:181\n719#4,11:187\n705#4,2:217\n717#4,2:219\n719#4,11:225\n705#4,2:255\n717#4,2:257\n719#4,11:263\n705#4,2:293\n717#4,2:295\n719#4,11:301\n72#5,4:145\n72#5,4:183\n72#5,4:221\n72#5,4:259\n72#5,4:297\n*S KotlinDebug\n*F\n+ 1 Celebration.kt\nandroidx/compose/material/icons/rounded/CelebrationKt\n*L\n29#1:110,12\n30#1:123,18\n30#1:160\n40#1:161,18\n40#1:198\n56#1:199,18\n56#1:236\n72#1:237,18\n72#1:274\n88#1:275,18\n88#1:312\n29#1:122\n30#1:141,2\n30#1:143,2\n30#1:149,11\n40#1:179,2\n40#1:181,2\n40#1:187,11\n56#1:217,2\n56#1:219,2\n56#1:225,11\n72#1:255,2\n72#1:257,2\n72#1:263,11\n88#1:293,2\n88#1:295,2\n88#1:301,11\n30#1:145,4\n40#1:183,4\n56#1:221,4\n72#1:259,4\n88#1:297,4\n*E\n"
    }
.end annotation


# static fields
.field private static _celebration:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getCelebration(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/CelebrationKt;->_celebration:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.Celebration"

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
    const v4, 0x407f5c29    # 3.99f

    .line 71
    .line 72
    .line 73
    const v6, 0x41aa51ec    # 21.29f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v4, -0x3fb147ae    # -3.23f

    .line 80
    .line 81
    .line 82
    const v6, 0x4110a3d7    # 9.04f

    .line 83
    .line 84
    .line 85
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 86
    .line 87
    .line 88
    const v25, 0x3f3d70a4    # 0.74f

    .line 89
    .line 90
    .line 91
    const v26, -0x3faccccd    # -3.3f

    .line 92
    .line 93
    .line 94
    const v21, 0x3fb0a3d7    # 1.38f

    .line 95
    .line 96
    .line 97
    const v22, -0x41051eb8    # -0.49f

    .line 98
    .line 99
    .line 100
    const v23, 0x3fe3d70a    # 1.78f

    .line 101
    .line 102
    .line 103
    const v24, -0x3fef5c29    # -2.26f

    .line 104
    .line 105
    .line 106
    move-object/from16 v20, v2

    .line 107
    .line 108
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 109
    .line 110
    .line 111
    const v4, -0x3f6f0a3d    # -4.53f

    .line 112
    .line 113
    .line 114
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 115
    .line 116
    .line 117
    const v25, -0x3faccccd    # -3.3f

    .line 118
    .line 119
    .line 120
    const v26, 0x3f3d70a4    # 0.74f

    .line 121
    .line 122
    .line 123
    const v21, -0x407ae148    # -1.04f

    .line 124
    .line 125
    .line 126
    const v22, -0x407ae148    # -1.04f

    .line 127
    .line 128
    .line 129
    const v23, -0x3fcccccd    # -2.8f

    .line 130
    .line 131
    .line 132
    const v24, -0x40dc28f6    # -0.64f

    .line 133
    .line 134
    .line 135
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 136
    .line 137
    .line 138
    const v4, -0x3fb147ae    # -3.23f

    .line 139
    .line 140
    .line 141
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 142
    .line 143
    .line 144
    const v25, 0x407f5c29    # 3.99f

    .line 145
    .line 146
    .line 147
    const v26, 0x41aa51ec    # 21.29f

    .line 148
    .line 149
    .line 150
    const v21, 0x401b851f    # 2.43f

    .line 151
    .line 152
    .line 153
    const v22, 0x41a67ae1    # 20.81f

    .line 154
    .line 155
    .line 156
    const v23, 0x404c28f6    # 3.19f

    .line 157
    .line 158
    .line 159
    const v24, 0x41ac8f5c    # 21.57f

    .line 160
    .line 161
    .line 162
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 163
    .line 164
    .line 165
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 166
    .line 167
    .line 168
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 169
    .line 170
    .line 171
    move-result-object v2

    .line 172
    const/16 v16, 0x3800

    .line 173
    .line 174
    const/16 v17, 0x0

    .line 175
    .line 176
    const/high16 v6, 0x3f800000    # 1.0f

    .line 177
    .line 178
    const/high16 v8, 0x3f800000    # 1.0f

    .line 179
    .line 180
    const/4 v7, 0x0

    .line 181
    const/high16 v9, 0x3f800000    # 1.0f

    .line 182
    .line 183
    const/high16 v12, 0x3f800000    # 1.0f

    .line 184
    .line 185
    const/4 v13, 0x0

    .line 186
    const/4 v14, 0x0

    .line 187
    const/4 v15, 0x0

    .line 188
    const-string v4, ""

    .line 189
    .line 190
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 191
    .line 192
    .line 193
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 194
    .line 195
    .line 196
    move-result v3

    .line 197
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 198
    .line 199
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 200
    .line 201
    .line 202
    move-result-wide v6

    .line 203
    const/4 v2, 0x0

    .line 204
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 205
    .line 206
    .line 207
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 208
    .line 209
    .line 210
    move-result v10

    .line 211
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 212
    .line 213
    .line 214
    move-result v11

    .line 215
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 216
    .line 217
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 218
    .line 219
    .line 220
    const/high16 v4, 0x41400000    # 12.0f

    .line 221
    .line 222
    const v6, 0x4170f5c3    # 15.06f

    .line 223
    .line 224
    .line 225
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 226
    .line 227
    .line 228
    const v4, 0x40a1eb85    # 5.06f

    .line 229
    .line 230
    .line 231
    const v6, -0x3f5e147b    # -5.06f

    .line 232
    .line 233
    .line 234
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 235
    .line 236
    .line 237
    const v25, 0x3fe28f5c    # 1.77f

    .line 238
    .line 239
    .line 240
    const/16 v26, 0x0

    .line 241
    .line 242
    const v21, 0x3efae148    # 0.49f

    .line 243
    .line 244
    .line 245
    const v22, -0x41051eb8    # -0.49f

    .line 246
    .line 247
    .line 248
    const v23, 0x3fa3d70a    # 1.28f

    .line 249
    .line 250
    .line 251
    const v24, -0x41051eb8    # -0.49f

    .line 252
    .line 253
    .line 254
    move-object/from16 v20, v2

    .line 255
    .line 256
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 257
    .line 258
    .line 259
    const v4, 0x41af999a    # 21.95f

    .line 260
    .line 261
    .line 262
    const/high16 v6, 0x40e00000    # 7.0f

    .line 263
    .line 264
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 265
    .line 266
    .line 267
    const v25, 0x3f87ae14    # 1.06f

    .line 268
    .line 269
    .line 270
    const v21, 0x3e947ae1    # 0.29f

    .line 271
    .line 272
    .line 273
    const v22, 0x3e947ae1    # 0.29f

    .line 274
    .line 275
    .line 276
    const v23, 0x3f451eb8    # 0.77f

    .line 277
    .line 278
    .line 279
    const v24, 0x3e947ae1    # 0.29f

    .line 280
    .line 281
    .line 282
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 283
    .line 284
    .line 285
    const/4 v4, 0x0

    .line 286
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 287
    .line 288
    .line 289
    const/16 v25, 0x0

    .line 290
    .line 291
    const v26, -0x407851ec    # -1.06f

    .line 292
    .line 293
    .line 294
    const v22, -0x416b851f    # -0.29f

    .line 295
    .line 296
    .line 297
    const v23, 0x3e947ae1    # 0.29f

    .line 298
    .line 299
    .line 300
    const v24, -0x40bae148    # -0.77f

    .line 301
    .line 302
    .line 303
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 304
    .line 305
    .line 306
    const v4, -0x428a3d71    # -0.06f

    .line 307
    .line 308
    .line 309
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 310
    .line 311
    .line 312
    const v25, -0x3f870a3d    # -3.89f

    .line 313
    .line 314
    .line 315
    const/16 v26, 0x0

    .line 316
    .line 317
    const v21, -0x40770a3d    # -1.07f

    .line 318
    .line 319
    .line 320
    const v22, -0x40770a3d    # -1.07f

    .line 321
    .line 322
    .line 323
    const v23, -0x3fcb851f    # -2.82f

    .line 324
    .line 325
    .line 326
    const v24, -0x40770a3d    # -1.07f

    .line 327
    .line 328
    .line 329
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 330
    .line 331
    .line 332
    const/high16 v4, 0x41600000    # 14.0f

    .line 333
    .line 334
    const v6, 0x412f0a3d    # 10.94f

    .line 335
    .line 336
    .line 337
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 338
    .line 339
    .line 340
    const/16 v25, 0x0

    .line 341
    .line 342
    const v26, 0x3f87ae14    # 1.06f

    .line 343
    .line 344
    .line 345
    const v21, -0x416b851f    # -0.29f

    .line 346
    .line 347
    .line 348
    const v22, 0x3e947ae1    # 0.29f

    .line 349
    .line 350
    .line 351
    const v23, -0x416b851f    # -0.29f

    .line 352
    .line 353
    .line 354
    const v24, 0x3f451eb8    # 0.77f

    .line 355
    .line 356
    .line 357
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 358
    .line 359
    .line 360
    const/4 v4, 0x0

    .line 361
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 362
    .line 363
    .line 364
    const v25, 0x4170f5c3    # 15.06f

    .line 365
    .line 366
    .line 367
    const/high16 v26, 0x41400000    # 12.0f

    .line 368
    .line 369
    const v21, 0x4164a3d7    # 14.29f

    .line 370
    .line 371
    .line 372
    const v22, 0x4144a3d7    # 12.29f

    .line 373
    .line 374
    .line 375
    const v23, 0x416c51ec    # 14.77f

    .line 376
    .line 377
    .line 378
    const v24, 0x4144a3d7    # 12.29f

    .line 379
    .line 380
    .line 381
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 382
    .line 383
    .line 384
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 385
    .line 386
    .line 387
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 388
    .line 389
    .line 390
    move-result-object v2

    .line 391
    const/high16 v6, 0x3f800000    # 1.0f

    .line 392
    .line 393
    const/4 v7, 0x0

    .line 394
    const-string v4, ""

    .line 395
    .line 396
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 397
    .line 398
    .line 399
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 400
    .line 401
    .line 402
    move-result v3

    .line 403
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 404
    .line 405
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 406
    .line 407
    .line 408
    move-result-wide v6

    .line 409
    const/4 v2, 0x0

    .line 410
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 411
    .line 412
    .line 413
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 414
    .line 415
    .line 416
    move-result v10

    .line 417
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 418
    .line 419
    .line 420
    move-result v11

    .line 421
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 422
    .line 423
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 424
    .line 425
    .line 426
    const v4, 0x4120f5c3    # 10.06f

    .line 427
    .line 428
    .line 429
    const v6, 0x40dc28f6    # 6.88f

    .line 430
    .line 431
    .line 432
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 433
    .line 434
    .line 435
    const/high16 v4, 0x41200000    # 10.0f

    .line 436
    .line 437
    const v6, 0x40de147b    # 6.94f

    .line 438
    .line 439
    .line 440
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 441
    .line 442
    .line 443
    const/high16 v25, 0x41200000    # 10.0f

    .line 444
    .line 445
    const/high16 v26, 0x41000000    # 8.0f

    .line 446
    .line 447
    const v21, 0x411b5c29    # 9.71f

    .line 448
    .line 449
    .line 450
    const v22, 0x40e75c29    # 7.23f

    .line 451
    .line 452
    .line 453
    const v23, 0x411b5c29    # 9.71f

    .line 454
    .line 455
    .line 456
    const v24, 0x40f6b852    # 7.71f

    .line 457
    .line 458
    .line 459
    move-object/from16 v20, v2

    .line 460
    .line 461
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 462
    .line 463
    .line 464
    const/4 v4, 0x0

    .line 465
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 466
    .line 467
    .line 468
    const v25, 0x3f87ae14    # 1.06f

    .line 469
    .line 470
    .line 471
    const/16 v26, 0x0

    .line 472
    .line 473
    const v21, 0x3e947ae1    # 0.29f

    .line 474
    .line 475
    .line 476
    const v22, 0x3e947ae1    # 0.29f

    .line 477
    .line 478
    .line 479
    const v23, 0x3f451eb8    # 0.77f

    .line 480
    .line 481
    .line 482
    const v24, 0x3e947ae1    # 0.29f

    .line 483
    .line 484
    .line 485
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 486
    .line 487
    .line 488
    const v4, 0x3d75c28f    # 0.06f

    .line 489
    .line 490
    .line 491
    const v6, -0x428a3d71    # -0.06f

    .line 492
    .line 493
    .line 494
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 495
    .line 496
    .line 497
    const/16 v25, 0x0

    .line 498
    .line 499
    const v26, -0x3f870a3d    # -3.89f

    .line 500
    .line 501
    .line 502
    const v21, 0x3f88f5c3    # 1.07f

    .line 503
    .line 504
    .line 505
    const v22, -0x40770a3d    # -1.07f

    .line 506
    .line 507
    .line 508
    const v23, 0x3f88f5c3    # 1.07f

    .line 509
    .line 510
    .line 511
    const v24, -0x3fcb851f    # -2.82f

    .line 512
    .line 513
    .line 514
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 515
    .line 516
    .line 517
    const v4, 0x41311eb8    # 11.07f

    .line 518
    .line 519
    .line 520
    const/high16 v6, 0x40800000    # 4.0f

    .line 521
    .line 522
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 523
    .line 524
    .line 525
    const/high16 v25, 0x41200000    # 10.0f

    .line 526
    .line 527
    const/high16 v26, 0x40800000    # 4.0f

    .line 528
    .line 529
    const v21, 0x412c51ec    # 10.77f

    .line 530
    .line 531
    .line 532
    const v22, 0x406ccccd    # 3.7f

    .line 533
    .line 534
    .line 535
    const v23, 0x4124a3d7    # 10.29f

    .line 536
    .line 537
    .line 538
    const v24, 0x406ccccd    # 3.7f

    .line 539
    .line 540
    .line 541
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 542
    .line 543
    .line 544
    const/4 v4, 0x0

    .line 545
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 546
    .line 547
    .line 548
    const/16 v25, 0x0

    .line 549
    .line 550
    const v26, 0x3f87ae14    # 1.06f

    .line 551
    .line 552
    .line 553
    const v21, -0x416b851f    # -0.29f

    .line 554
    .line 555
    .line 556
    const v22, 0x3e947ae1    # 0.29f

    .line 557
    .line 558
    .line 559
    const v23, -0x416b851f    # -0.29f

    .line 560
    .line 561
    .line 562
    const v24, 0x3f451eb8    # 0.77f

    .line 563
    .line 564
    .line 565
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 566
    .line 567
    .line 568
    const v4, 0x3d75c28f    # 0.06f

    .line 569
    .line 570
    .line 571
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 572
    .line 573
    .line 574
    const v25, 0x4120f5c3    # 10.06f

    .line 575
    .line 576
    .line 577
    const v26, 0x40dc28f6    # 6.88f

    .line 578
    .line 579
    .line 580
    const v21, 0x4128a3d7    # 10.54f

    .line 581
    .line 582
    .line 583
    const v22, 0x40b33333    # 5.6f

    .line 584
    .line 585
    .line 586
    const v23, 0x4128a3d7    # 10.54f

    .line 587
    .line 588
    .line 589
    const v24, 0x40cccccd    # 6.4f

    .line 590
    .line 591
    .line 592
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 593
    .line 594
    .line 595
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 596
    .line 597
    .line 598
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 599
    .line 600
    .line 601
    move-result-object v2

    .line 602
    const/high16 v6, 0x3f800000    # 1.0f

    .line 603
    .line 604
    const/4 v7, 0x0

    .line 605
    const-string v4, ""

    .line 606
    .line 607
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 608
    .line 609
    .line 610
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 611
    .line 612
    .line 613
    move-result v3

    .line 614
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 615
    .line 616
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 617
    .line 618
    .line 619
    move-result-wide v6

    .line 620
    const/4 v2, 0x0

    .line 621
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 622
    .line 623
    .line 624
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 625
    .line 626
    .line 627
    move-result v10

    .line 628
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 629
    .line 630
    .line 631
    move-result v11

    .line 632
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 633
    .line 634
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 635
    .line 636
    .line 637
    const v4, 0x41887ae1    # 17.06f

    .line 638
    .line 639
    .line 640
    const v6, 0x413e147b    # 11.88f

    .line 641
    .line 642
    .line 643
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 644
    .line 645
    .line 646
    const/high16 v4, 0x41800000    # 16.0f

    .line 647
    .line 648
    const v6, 0x414f0a3d    # 12.94f

    .line 649
    .line 650
    .line 651
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 652
    .line 653
    .line 654
    const/16 v25, 0x0

    .line 655
    .line 656
    const v26, 0x3f87ae14    # 1.06f

    .line 657
    .line 658
    .line 659
    const v21, -0x416b851f    # -0.29f

    .line 660
    .line 661
    .line 662
    const v22, 0x3e947ae1    # 0.29f

    .line 663
    .line 664
    .line 665
    const v23, -0x416b851f    # -0.29f

    .line 666
    .line 667
    .line 668
    const v24, 0x3f451eb8    # 0.77f

    .line 669
    .line 670
    .line 671
    move-object/from16 v20, v2

    .line 672
    .line 673
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 674
    .line 675
    .line 676
    const/4 v4, 0x0

    .line 677
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 678
    .line 679
    .line 680
    const v25, 0x3f87ae14    # 1.06f

    .line 681
    .line 682
    .line 683
    const/16 v26, 0x0

    .line 684
    .line 685
    const v21, 0x3e947ae1    # 0.29f

    .line 686
    .line 687
    .line 688
    const v23, 0x3f451eb8    # 0.77f

    .line 689
    .line 690
    .line 691
    const v24, 0x3e947ae1    # 0.29f

    .line 692
    .line 693
    .line 694
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 695
    .line 696
    .line 697
    const v4, -0x407851ec    # -1.06f

    .line 698
    .line 699
    .line 700
    const v6, 0x3f87ae14    # 1.06f

    .line 701
    .line 702
    .line 703
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 704
    .line 705
    .line 706
    const v25, 0x3fe28f5c    # 1.77f

    .line 707
    .line 708
    .line 709
    const v21, 0x3efae148    # 0.49f

    .line 710
    .line 711
    .line 712
    const v22, -0x41051eb8    # -0.49f

    .line 713
    .line 714
    .line 715
    const v23, 0x3fa3d70a    # 1.28f

    .line 716
    .line 717
    .line 718
    const v24, -0x41051eb8    # -0.49f

    .line 719
    .line 720
    .line 721
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 722
    .line 723
    .line 724
    const v4, 0x3f8a3d71    # 1.08f

    .line 725
    .line 726
    .line 727
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 728
    .line 729
    .line 730
    const v25, 0x3f87ae14    # 1.06f

    .line 731
    .line 732
    .line 733
    const v21, 0x3e947ae1    # 0.29f

    .line 734
    .line 735
    .line 736
    const v22, 0x3e947ae1    # 0.29f

    .line 737
    .line 738
    .line 739
    const v23, 0x3f451eb8    # 0.77f

    .line 740
    .line 741
    .line 742
    const v24, 0x3e947ae1    # 0.29f

    .line 743
    .line 744
    .line 745
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 746
    .line 747
    .line 748
    const/4 v4, 0x0

    .line 749
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 750
    .line 751
    .line 752
    const/16 v25, 0x0

    .line 753
    .line 754
    const v26, -0x407851ec    # -1.06f

    .line 755
    .line 756
    .line 757
    const v22, -0x416b851f    # -0.29f

    .line 758
    .line 759
    .line 760
    const v23, 0x3e947ae1    # 0.29f

    .line 761
    .line 762
    .line 763
    const v24, -0x40bae148    # -0.77f

    .line 764
    .line 765
    .line 766
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 767
    .line 768
    .line 769
    const v4, -0x4075c28f    # -1.08f

    .line 770
    .line 771
    .line 772
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 773
    .line 774
    .line 775
    const v25, 0x41887ae1    # 17.06f

    .line 776
    .line 777
    .line 778
    const v26, 0x413e147b    # 11.88f

    .line 779
    .line 780
    .line 781
    const v21, 0x419ef5c3    # 19.87f

    .line 782
    .line 783
    .line 784
    const v22, 0x412cf5c3    # 10.81f

    .line 785
    .line 786
    .line 787
    const v23, 0x41910a3d    # 18.13f

    .line 788
    .line 789
    .line 790
    const v24, 0x412cf5c3    # 10.81f

    .line 791
    .line 792
    .line 793
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 794
    .line 795
    .line 796
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 797
    .line 798
    .line 799
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 800
    .line 801
    .line 802
    move-result-object v2

    .line 803
    const/high16 v6, 0x3f800000    # 1.0f

    .line 804
    .line 805
    const/4 v7, 0x0

    .line 806
    const-string v4, ""

    .line 807
    .line 808
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 809
    .line 810
    .line 811
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 812
    .line 813
    .line 814
    move-result v3

    .line 815
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 816
    .line 817
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 818
    .line 819
    .line 820
    move-result-wide v6

    .line 821
    const/4 v0, 0x0

    .line 822
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 823
    .line 824
    .line 825
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 826
    .line 827
    .line 828
    move-result v10

    .line 829
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 830
    .line 831
    .line 832
    move-result v11

    .line 833
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 834
    .line 835
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 836
    .line 837
    .line 838
    const v0, 0x40bc28f6    # 5.88f

    .line 839
    .line 840
    .line 841
    const v2, 0x4170f5c3    # 15.06f

    .line 842
    .line 843
    .line 844
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 845
    .line 846
    .line 847
    const v0, 0x410f0a3d    # 8.94f

    .line 848
    .line 849
    .line 850
    const/high16 v2, 0x41400000    # 12.0f

    .line 851
    .line 852
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 853
    .line 854
    .line 855
    const/16 v17, 0x0

    .line 856
    .line 857
    const v18, 0x3f87ae14    # 1.06f

    .line 858
    .line 859
    .line 860
    const v13, -0x416b851f    # -0.29f

    .line 861
    .line 862
    .line 863
    const v14, 0x3e947ae1    # 0.29f

    .line 864
    .line 865
    .line 866
    const v15, -0x416b851f    # -0.29f

    .line 867
    .line 868
    .line 869
    const v16, 0x3f451eb8    # 0.77f

    .line 870
    .line 871
    .line 872
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 873
    .line 874
    .line 875
    const/4 v0, 0x0

    .line 876
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 877
    .line 878
    .line 879
    const v17, 0x3f87ae14    # 1.06f

    .line 880
    .line 881
    .line 882
    const/16 v18, 0x0

    .line 883
    .line 884
    const v13, 0x3e947ae1    # 0.29f

    .line 885
    .line 886
    .line 887
    const v15, 0x3f451eb8    # 0.77f

    .line 888
    .line 889
    .line 890
    const v16, 0x3e947ae1    # 0.29f

    .line 891
    .line 892
    .line 893
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 894
    .line 895
    .line 896
    const v0, 0x4043d70a    # 3.06f

    .line 897
    .line 898
    .line 899
    const v2, -0x3fbc28f6    # -3.06f

    .line 900
    .line 901
    .line 902
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 903
    .line 904
    .line 905
    const/16 v17, 0x0

    .line 906
    .line 907
    const v18, -0x3f870a3d    # -3.89f

    .line 908
    .line 909
    .line 910
    const v13, 0x3f88f5c3    # 1.07f

    .line 911
    .line 912
    .line 913
    const v14, -0x40770a3d    # -1.07f

    .line 914
    .line 915
    .line 916
    const v15, 0x3f88f5c3    # 1.07f

    .line 917
    .line 918
    .line 919
    const v16, -0x3fcb851f    # -2.82f

    .line 920
    .line 921
    .line 922
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 923
    .line 924
    .line 925
    const v0, -0x407851ec    # -1.06f

    .line 926
    .line 927
    .line 928
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 929
    .line 930
    .line 931
    const v17, -0x407851ec    # -1.06f

    .line 932
    .line 933
    .line 934
    const/16 v18, 0x0

    .line 935
    .line 936
    const v13, -0x416b851f    # -0.29f

    .line 937
    .line 938
    .line 939
    const v14, -0x416b851f    # -0.29f

    .line 940
    .line 941
    .line 942
    const v15, -0x40bae148    # -0.77f

    .line 943
    .line 944
    .line 945
    const v16, -0x416b851f    # -0.29f

    .line 946
    .line 947
    .line 948
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 949
    .line 950
    .line 951
    const/4 v0, 0x0

    .line 952
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 953
    .line 954
    .line 955
    const/16 v17, 0x0

    .line 956
    .line 957
    const v18, 0x3f87ae14    # 1.06f

    .line 958
    .line 959
    .line 960
    const v14, 0x3e947ae1    # 0.29f

    .line 961
    .line 962
    .line 963
    const v15, -0x416b851f    # -0.29f

    .line 964
    .line 965
    .line 966
    const v16, 0x3f451eb8    # 0.77f

    .line 967
    .line 968
    .line 969
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 970
    .line 971
    .line 972
    const v0, 0x3f87ae14    # 1.06f

    .line 973
    .line 974
    .line 975
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 976
    .line 977
    .line 978
    const v17, 0x4170f5c3    # 15.06f

    .line 979
    .line 980
    .line 981
    const v18, 0x40bc28f6    # 5.88f

    .line 982
    .line 983
    .line 984
    const v13, 0x4178a3d7    # 15.54f

    .line 985
    .line 986
    .line 987
    const v14, 0x40933333    # 4.6f

    .line 988
    .line 989
    .line 990
    const v15, 0x4178a3d7    # 15.54f

    .line 991
    .line 992
    .line 993
    const v16, 0x40accccd    # 5.4f

    .line 994
    .line 995
    .line 996
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 997
    .line 998
    .line 999
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1000
    .line 1001
    .line 1002
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 1003
    .line 1004
    .line 1005
    move-result-object v2

    .line 1006
    const/16 v16, 0x3800

    .line 1007
    .line 1008
    const/16 v17, 0x0

    .line 1009
    .line 1010
    const/high16 v6, 0x3f800000    # 1.0f

    .line 1011
    .line 1012
    const/4 v7, 0x0

    .line 1013
    const/high16 v12, 0x3f800000    # 1.0f

    .line 1014
    .line 1015
    const/4 v13, 0x0

    .line 1016
    const/4 v14, 0x0

    .line 1017
    const/4 v15, 0x0

    .line 1018
    const-string v4, ""

    .line 1019
    .line 1020
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 1021
    .line 1022
    .line 1023
    move-result-object v0

    .line 1024
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1025
    .line 1026
    .line 1027
    move-result-object v0

    .line 1028
    sput-object v0, Landroidx/compose/material/icons/rounded/CelebrationKt;->_celebration:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1029
    .line 1030
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 1031
    .line 1032
    .line 1033
    return-object v0
.end method
