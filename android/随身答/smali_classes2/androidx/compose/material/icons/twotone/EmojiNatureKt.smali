.class public final Landroidx/compose/material/icons/twotone/EmojiNatureKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_emojiNature",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "EmojiNature",
        "Landroidx/compose/material/icons/Icons$TwoTone;",
        "getEmojiNature",
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
        "SMAP\nEmojiNature.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EmojiNature.kt\nandroidx/compose/material/icons/twotone/EmojiNatureKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,138:1\n212#2,12:139\n233#2,18:152\n253#2:189\n233#2,18:190\n253#2:227\n233#2,18:228\n253#2:265\n233#2,18:266\n253#2:303\n233#2,18:304\n253#2:341\n174#3:151\n705#4,2:170\n717#4,2:172\n719#4,11:178\n705#4,2:208\n717#4,2:210\n719#4,11:216\n705#4,2:246\n717#4,2:248\n719#4,11:254\n705#4,2:284\n717#4,2:286\n719#4,11:292\n705#4,2:322\n717#4,2:324\n719#4,11:330\n72#5,4:174\n72#5,4:212\n72#5,4:250\n72#5,4:288\n72#5,4:326\n*S KotlinDebug\n*F\n+ 1 EmojiNature.kt\nandroidx/compose/material/icons/twotone/EmojiNatureKt\n*L\n29#1:139,12\n30#1:152,18\n30#1:189\n36#1:190,18\n36#1:227\n67#1:228,18\n67#1:265\n75#1:266,18\n75#1:303\n84#1:304,18\n84#1:341\n29#1:151\n30#1:170,2\n30#1:172,2\n30#1:178,11\n36#1:208,2\n36#1:210,2\n36#1:216,11\n67#1:246,2\n67#1:248,2\n67#1:254,11\n75#1:284,2\n75#1:286,2\n75#1:292,11\n84#1:322,2\n84#1:324,2\n84#1:330,11\n30#1:174,4\n36#1:212,4\n67#1:250,4\n75#1:288,4\n84#1:326,4\n*E\n"
    }
.end annotation


# static fields
.field private static _emojiNature:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getEmojiNature(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 28

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/EmojiNatureKt;->_emojiNature:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.EmojiNature"

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
    const/high16 v4, 0x40c00000    # 6.0f

    .line 71
    .line 72
    const/high16 v6, 0x41900000    # 18.0f

    .line 73
    .line 74
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/4 v4, 0x0

    .line 78
    const/high16 v6, -0x40800000    # -1.0f

    .line 79
    .line 80
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 81
    .line 82
    .line 83
    const/high16 v26, 0x40000000    # 2.0f

    .line 84
    .line 85
    const/16 v27, 0x0

    .line 86
    .line 87
    const/high16 v21, 0x3f800000    # 1.0f

    .line 88
    .line 89
    const/high16 v22, 0x3f800000    # 1.0f

    .line 90
    .line 91
    const/16 v23, 0x0

    .line 92
    .line 93
    const/16 v24, 0x1

    .line 94
    .line 95
    const/16 v25, 0x1

    .line 96
    .line 97
    move-object/from16 v20, v2

    .line 98
    .line 99
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 100
    .line 101
    .line 102
    const/high16 v26, -0x40000000    # -2.0f

    .line 103
    .line 104
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 105
    .line 106
    .line 107
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 108
    .line 109
    .line 110
    move-result-object v2

    .line 111
    const/16 v16, 0x3800

    .line 112
    .line 113
    const/16 v17, 0x0

    .line 114
    .line 115
    const v6, 0x3e99999a    # 0.3f

    .line 116
    .line 117
    .line 118
    const v8, 0x3e99999a    # 0.3f

    .line 119
    .line 120
    .line 121
    const/4 v7, 0x0

    .line 122
    const/high16 v9, 0x3f800000    # 1.0f

    .line 123
    .line 124
    const/high16 v12, 0x3f800000    # 1.0f

    .line 125
    .line 126
    const/4 v13, 0x0

    .line 127
    const/4 v14, 0x0

    .line 128
    const/4 v15, 0x0

    .line 129
    const-string v4, ""

    .line 130
    .line 131
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 132
    .line 133
    .line 134
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 135
    .line 136
    .line 137
    move-result v3

    .line 138
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 139
    .line 140
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 141
    .line 142
    .line 143
    move-result-wide v6

    .line 144
    const/4 v2, 0x0

    .line 145
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 146
    .line 147
    .line 148
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 149
    .line 150
    .line 151
    move-result v10

    .line 152
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 153
    .line 154
    .line 155
    move-result v11

    .line 156
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 157
    .line 158
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 159
    .line 160
    .line 161
    const v4, 0x41af851f    # 21.94f

    .line 162
    .line 163
    .line 164
    const v6, 0x409c28f6    # 4.88f

    .line 165
    .line 166
    .line 167
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 168
    .line 169
    .line 170
    const v25, 0x41a4a3d7    # 20.58f

    .line 171
    .line 172
    .line 173
    const/high16 v26, 0x40800000    # 4.0f

    .line 174
    .line 175
    const/high16 v21, 0x41ae0000    # 21.75f

    .line 176
    .line 177
    const v22, 0x408a8f5c    # 4.33f

    .line 178
    .line 179
    .line 180
    const v23, 0x41a9851f    # 21.19f

    .line 181
    .line 182
    .line 183
    const v24, 0x407d70a4    # 3.96f

    .line 184
    .line 185
    .line 186
    move-object/from16 v20, v2

    .line 187
    .line 188
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 189
    .line 190
    .line 191
    const v4, 0x419ccccd    # 19.6f

    .line 192
    .line 193
    .line 194
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 195
    .line 196
    .line 197
    const v4, -0x416147ae    # -0.31f

    .line 198
    .line 199
    .line 200
    const v6, -0x4087ae14    # -0.97f

    .line 201
    .line 202
    .line 203
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 204
    .line 205
    .line 206
    const/high16 v25, 0x41900000    # 18.0f

    .line 207
    .line 208
    const/high16 v26, 0x40000000    # 2.0f

    .line 209
    .line 210
    const v21, 0x41993333    # 19.15f

    .line 211
    .line 212
    .line 213
    const v22, 0x401b851f    # 2.43f

    .line 214
    .line 215
    .line 216
    const v23, 0x4194e148    # 18.61f

    .line 217
    .line 218
    .line 219
    const/high16 v24, 0x40000000    # 2.0f

    .line 220
    .line 221
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 222
    .line 223
    .line 224
    const/4 v4, 0x0

    .line 225
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 226
    .line 227
    .line 228
    const v25, -0x405ae148    # -1.29f

    .line 229
    .line 230
    .line 231
    const v26, 0x3f851eb8    # 1.04f

    .line 232
    .line 233
    .line 234
    const v21, -0x40e3d70a    # -0.61f

    .line 235
    .line 236
    .line 237
    const/16 v22, 0x0

    .line 238
    .line 239
    const v23, -0x406ccccd    # -1.15f

    .line 240
    .line 241
    .line 242
    const v24, 0x3edc28f6    # 0.43f

    .line 243
    .line 244
    .line 245
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 246
    .line 247
    .line 248
    const v4, 0x41833333    # 16.4f

    .line 249
    .line 250
    .line 251
    const/high16 v6, 0x40800000    # 4.0f

    .line 252
    .line 253
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 254
    .line 255
    .line 256
    const v4, -0x40851eb8    # -0.98f

    .line 257
    .line 258
    .line 259
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 260
    .line 261
    .line 262
    const v25, -0x40533333    # -1.35f

    .line 263
    .line 264
    .line 265
    const v26, 0x3f6147ae    # 0.88f

    .line 266
    .line 267
    .line 268
    const v22, -0x42dc28f6    # -0.04f

    .line 269
    .line 270
    .line 271
    const v23, -0x406b851f    # -1.16f

    .line 272
    .line 273
    .line 274
    const v24, 0x3ea3d70a    # 0.32f

    .line 275
    .line 276
    .line 277
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 278
    .line 279
    .line 280
    const v25, 0x3f0f5c29    # 0.56f

    .line 281
    .line 282
    .line 283
    const v26, 0x3fbd70a4    # 1.48f

    .line 284
    .line 285
    .line 286
    const v21, -0x41bd70a4    # -0.19f

    .line 287
    .line 288
    .line 289
    const v22, 0x3f0f5c29    # 0.56f

    .line 290
    .line 291
    .line 292
    const v23, 0x3d23d70a    # 0.04f

    .line 293
    .line 294
    .line 295
    const v24, 0x3f95c28f    # 1.17f

    .line 296
    .line 297
    .line 298
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 299
    .line 300
    .line 301
    const v4, 0x3f051eb8    # 0.52f

    .line 302
    .line 303
    .line 304
    const v6, 0x3f5eb852    # 0.87f

    .line 305
    .line 306
    .line 307
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 308
    .line 309
    .line 310
    const v4, 0x4171999a    # 15.1f

    .line 311
    .line 312
    .line 313
    const v6, 0x4101eb85    # 8.12f

    .line 314
    .line 315
    .line 316
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 317
    .line 318
    .line 319
    const v25, 0x3ee66666    # 0.45f

    .line 320
    .line 321
    .line 322
    const v26, 0x3fcf5c29    # 1.62f

    .line 323
    .line 324
    .line 325
    const v21, -0x41947ae1    # -0.23f

    .line 326
    .line 327
    .line 328
    const v22, 0x3f147ae1    # 0.58f

    .line 329
    .line 330
    .line 331
    const v23, -0x42dc28f6    # -0.04f

    .line 332
    .line 333
    .line 334
    const/high16 v24, 0x3fa00000    # 1.25f

    .line 335
    .line 336
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 337
    .line 338
    .line 339
    const v25, 0x3fd1eb85    # 1.64f

    .line 340
    .line 341
    .line 342
    const v26, -0x428a3d71    # -0.06f

    .line 343
    .line 344
    .line 345
    const/high16 v21, 0x3f000000    # 0.5f

    .line 346
    .line 347
    const v22, 0x3ebd70a4    # 0.37f

    .line 348
    .line 349
    .line 350
    const v23, 0x3f95c28f    # 1.17f

    .line 351
    .line 352
    .line 353
    const v24, 0x3eb33333    # 0.35f

    .line 354
    .line 355
    .line 356
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 357
    .line 358
    .line 359
    const v4, 0x410fae14    # 8.98f

    .line 360
    .line 361
    .line 362
    const/high16 v6, 0x41900000    # 18.0f

    .line 363
    .line 364
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 365
    .line 366
    .line 367
    const v4, 0x3f4f5c29    # 0.81f

    .line 368
    .line 369
    .line 370
    const v6, 0x3f333333    # 0.7f

    .line 371
    .line 372
    .line 373
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 374
    .line 375
    .line 376
    const v26, 0x3d75c28f    # 0.06f

    .line 377
    .line 378
    .line 379
    const v21, 0x3ef0a3d7    # 0.47f

    .line 380
    .line 381
    .line 382
    const v22, 0x3ecccccd    # 0.4f

    .line 383
    .line 384
    .line 385
    const v23, 0x3f933333    # 1.15f

    .line 386
    .line 387
    .line 388
    const v24, 0x3edc28f6    # 0.43f

    .line 389
    .line 390
    .line 391
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 392
    .line 393
    .line 394
    const v25, 0x3ee66666    # 0.45f

    .line 395
    .line 396
    .line 397
    const v26, -0x4030a3d7    # -1.62f

    .line 398
    .line 399
    .line 400
    const/high16 v21, 0x3f000000    # 0.5f

    .line 401
    .line 402
    const v22, -0x41428f5c    # -0.37f

    .line 403
    .line 404
    .line 405
    const v23, 0x3f2e147b    # 0.68f

    .line 406
    .line 407
    .line 408
    const v24, -0x407ae148    # -1.04f

    .line 409
    .line 410
    .line 411
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 412
    .line 413
    .line 414
    const v4, -0x413851ec    # -0.39f

    .line 415
    .line 416
    .line 417
    const v6, -0x406147ae    # -1.24f

    .line 418
    .line 419
    .line 420
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 421
    .line 422
    .line 423
    const v4, -0x40fae148    # -0.52f

    .line 424
    .line 425
    .line 426
    const v6, 0x3f5eb852    # 0.87f

    .line 427
    .line 428
    .line 429
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 430
    .line 431
    .line 432
    const v25, 0x41af851f    # 21.94f

    .line 433
    .line 434
    .line 435
    const v26, 0x409c28f6    # 4.88f

    .line 436
    .line 437
    .line 438
    const v21, 0x41af1eb8    # 21.89f

    .line 439
    .line 440
    .line 441
    const v22, 0x40c1999a    # 6.05f

    .line 442
    .line 443
    .line 444
    const v23, 0x41b0f5c3    # 22.12f

    .line 445
    .line 446
    .line 447
    const v24, 0x40ae147b    # 5.44f

    .line 448
    .line 449
    .line 450
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 451
    .line 452
    .line 453
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 454
    .line 455
    .line 456
    const/high16 v4, 0x40e00000    # 7.0f

    .line 457
    .line 458
    const/high16 v6, 0x41900000    # 18.0f

    .line 459
    .line 460
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 461
    .line 462
    .line 463
    const/high16 v25, -0x40800000    # -1.0f

    .line 464
    .line 465
    const/high16 v26, -0x40800000    # -1.0f

    .line 466
    .line 467
    const v21, -0x40f33333    # -0.55f

    .line 468
    .line 469
    .line 470
    const/16 v22, 0x0

    .line 471
    .line 472
    const/high16 v23, -0x40800000    # -1.0f

    .line 473
    .line 474
    const v24, -0x4119999a    # -0.45f

    .line 475
    .line 476
    .line 477
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 478
    .line 479
    .line 480
    const/high16 v25, 0x3f800000    # 1.0f

    .line 481
    .line 482
    const/16 v21, 0x0

    .line 483
    .line 484
    const v22, -0x40f33333    # -0.55f

    .line 485
    .line 486
    .line 487
    const v23, 0x3ee66666    # 0.45f

    .line 488
    .line 489
    .line 490
    const/high16 v24, -0x40800000    # -1.0f

    .line 491
    .line 492
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 493
    .line 494
    .line 495
    const v4, 0x3ee66666    # 0.45f

    .line 496
    .line 497
    .line 498
    const/high16 v6, 0x3f800000    # 1.0f

    .line 499
    .line 500
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 501
    .line 502
    .line 503
    const/high16 v25, 0x41900000    # 18.0f

    .line 504
    .line 505
    const/high16 v26, 0x40e00000    # 7.0f

    .line 506
    .line 507
    const/high16 v21, 0x41980000    # 19.0f

    .line 508
    .line 509
    const v22, 0x40d1999a    # 6.55f

    .line 510
    .line 511
    .line 512
    const v23, 0x41946666    # 18.55f

    .line 513
    .line 514
    .line 515
    const/high16 v24, 0x40e00000    # 7.0f

    .line 516
    .line 517
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 518
    .line 519
    .line 520
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 521
    .line 522
    .line 523
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 524
    .line 525
    .line 526
    move-result-object v2

    .line 527
    const/high16 v8, 0x3f800000    # 1.0f

    .line 528
    .line 529
    const/4 v7, 0x0

    .line 530
    const-string v4, ""

    .line 531
    .line 532
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 533
    .line 534
    .line 535
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 536
    .line 537
    .line 538
    move-result v3

    .line 539
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 540
    .line 541
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 542
    .line 543
    .line 544
    move-result-wide v6

    .line 545
    const/4 v2, 0x0

    .line 546
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 547
    .line 548
    .line 549
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 550
    .line 551
    .line 552
    move-result v10

    .line 553
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 554
    .line 555
    .line 556
    move-result v11

    .line 557
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 558
    .line 559
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 560
    .line 561
    .line 562
    const v4, 0x40c33333    # 6.1f

    .line 563
    .line 564
    .line 565
    const v6, 0x418f3333    # 17.9f

    .line 566
    .line 567
    .line 568
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 569
    .line 570
    .line 571
    const v25, 0x3ff851ec    # 1.94f

    .line 572
    .line 573
    .line 574
    const/high16 v26, 0x3f000000    # 0.5f

    .line 575
    .line 576
    const v21, 0x3f07ae14    # 0.53f

    .line 577
    .line 578
    .line 579
    const v22, 0x3f07ae14    # 0.53f

    .line 580
    .line 581
    .line 582
    const v23, 0x3fa28f5c    # 1.27f

    .line 583
    .line 584
    .line 585
    const v24, 0x3f30a3d7    # 0.69f

    .line 586
    .line 587
    .line 588
    move-object/from16 v20, v2

    .line 589
    .line 590
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 591
    .line 592
    .line 593
    const v25, 0x3f6b851f    # 0.92f

    .line 594
    .line 595
    .line 596
    const v26, -0x3fa8f5c3    # -3.36f

    .line 597
    .line 598
    .line 599
    const v21, -0x430a3d71    # -0.03f

    .line 600
    .line 601
    .line 602
    const v22, -0x4067ae14    # -1.19f

    .line 603
    .line 604
    .line 605
    const v23, 0x3eb33333    # 0.35f

    .line 606
    .line 607
    .line 608
    const v24, -0x3fe851ec    # -2.37f

    .line 609
    .line 610
    .line 611
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 612
    .line 613
    .line 614
    const v25, -0x3fa8f5c3    # -3.36f

    .line 615
    .line 616
    .line 617
    const v26, 0x3f6b851f    # 0.92f

    .line 618
    .line 619
    .line 620
    const/high16 v21, -0x40800000    # -1.0f

    .line 621
    .line 622
    const v22, 0x3f11eb85    # 0.57f

    .line 623
    .line 624
    .line 625
    const v23, -0x3ff51eb8    # -2.17f

    .line 626
    .line 627
    .line 628
    const v24, 0x3f733333    # 0.95f

    .line 629
    .line 630
    .line 631
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 632
    .line 633
    .line 634
    const v25, 0x40c33333    # 6.1f

    .line 635
    .line 636
    .line 637
    const v26, 0x418f3333    # 17.9f

    .line 638
    .line 639
    .line 640
    const v21, 0x40ad1eb8    # 5.41f

    .line 641
    .line 642
    .line 643
    const v22, 0x41850a3d    # 16.63f

    .line 644
    .line 645
    .line 646
    const v23, 0x40b28f5c    # 5.58f

    .line 647
    .line 648
    .line 649
    const v24, 0x418af5c3    # 17.37f

    .line 650
    .line 651
    .line 652
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 653
    .line 654
    .line 655
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 656
    .line 657
    .line 658
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 659
    .line 660
    .line 661
    move-result-object v2

    .line 662
    const v6, 0x3e99999a    # 0.3f

    .line 663
    .line 664
    .line 665
    const v8, 0x3e99999a    # 0.3f

    .line 666
    .line 667
    .line 668
    const/4 v7, 0x0

    .line 669
    const-string v4, ""

    .line 670
    .line 671
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 672
    .line 673
    .line 674
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 675
    .line 676
    .line 677
    move-result v3

    .line 678
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 679
    .line 680
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 681
    .line 682
    .line 683
    move-result-wide v6

    .line 684
    const/4 v2, 0x0

    .line 685
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 686
    .line 687
    .line 688
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 689
    .line 690
    .line 691
    move-result v10

    .line 692
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 693
    .line 694
    .line 695
    move-result v11

    .line 696
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 697
    .line 698
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 699
    .line 700
    .line 701
    const v4, 0x411a6666    # 9.65f

    .line 702
    .line 703
    .line 704
    const v6, 0x4138cccd    # 11.55f

    .line 705
    .line 706
    .line 707
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 708
    .line 709
    .line 710
    const v4, 0x3f28f5c3    # 0.66f

    .line 711
    .line 712
    .line 713
    const v6, 0x3fce147b    # 1.61f

    .line 714
    .line 715
    .line 716
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 717
    .line 718
    .line 719
    const v25, 0x3f0a3d71    # 0.54f

    .line 720
    .line 721
    .line 722
    const v26, 0x3f0a3d71    # 0.54f

    .line 723
    .line 724
    .line 725
    const/high16 v21, 0x3e800000    # 0.25f

    .line 726
    .line 727
    const v22, 0x3dcccccd    # 0.1f

    .line 728
    .line 729
    .line 730
    const v23, 0x3ee147ae    # 0.44f

    .line 731
    .line 732
    .line 733
    const v24, 0x3e99999a    # 0.3f

    .line 734
    .line 735
    .line 736
    move-object/from16 v20, v2

    .line 737
    .line 738
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 739
    .line 740
    .line 741
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 742
    .line 743
    .line 744
    const v25, -0x430a3d71    # -0.03f

    .line 745
    .line 746
    .line 747
    const v26, -0x3fce147b    # -2.78f

    .line 748
    .line 749
    .line 750
    const/high16 v21, 0x3f400000    # 0.75f

    .line 751
    .line 752
    const v22, -0x40b851ec    # -0.78f

    .line 753
    .line 754
    .line 755
    const v23, 0x3f3d70a4    # 0.74f

    .line 756
    .line 757
    .line 758
    const v24, -0x3fff5c29    # -2.01f

    .line 759
    .line 760
    .line 761
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 762
    .line 763
    .line 764
    const v25, 0x411a6666    # 9.65f

    .line 765
    .line 766
    .line 767
    const v26, 0x4138cccd    # 11.55f

    .line 768
    .line 769
    .line 770
    const v21, 0x413a8f5c    # 11.66f

    .line 771
    .line 772
    .line 773
    const v22, 0x412ccccd    # 10.8f

    .line 774
    .line 775
    .line 776
    const v23, 0x4126e148    # 10.43f

    .line 777
    .line 778
    .line 779
    const v24, 0x412ccccd    # 10.8f

    .line 780
    .line 781
    .line 782
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 783
    .line 784
    .line 785
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 786
    .line 787
    .line 788
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 789
    .line 790
    .line 791
    move-result-object v2

    .line 792
    const v6, 0x3e99999a    # 0.3f

    .line 793
    .line 794
    .line 795
    const/4 v7, 0x0

    .line 796
    const-string v4, ""

    .line 797
    .line 798
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 799
    .line 800
    .line 801
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 802
    .line 803
    .line 804
    move-result v3

    .line 805
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 806
    .line 807
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 808
    .line 809
    .line 810
    move-result-wide v6

    .line 811
    const/4 v0, 0x0

    .line 812
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 813
    .line 814
    .line 815
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 816
    .line 817
    .line 818
    move-result v10

    .line 819
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 820
    .line 821
    .line 822
    move-result v11

    .line 823
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 824
    .line 825
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 826
    .line 827
    .line 828
    const/high16 v0, 0x41400000    # 12.0f

    .line 829
    .line 830
    const v2, 0x416dc28f    # 14.86f

    .line 831
    .line 832
    .line 833
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 834
    .line 835
    .line 836
    const v17, -0x407c28f6    # -1.03f

    .line 837
    .line 838
    .line 839
    const v18, -0x40147ae1    # -1.84f

    .line 840
    .line 841
    .line 842
    const v13, -0x41d1eb85    # -0.17f

    .line 843
    .line 844
    .line 845
    const v14, -0x40d47ae1    # -0.67f

    .line 846
    .line 847
    .line 848
    const/high16 v15, -0x41000000    # -0.5f

    .line 849
    .line 850
    const v16, -0x405851ec    # -1.31f

    .line 851
    .line 852
    .line 853
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 854
    .line 855
    .line 856
    const/high16 v17, 0x41400000    # 12.0f

    .line 857
    .line 858
    const v18, 0x41123d71    # 9.14f

    .line 859
    .line 860
    .line 861
    const v13, 0x4154f5c3    # 13.31f

    .line 862
    .line 863
    .line 864
    const v14, 0x411a3d71    # 9.64f

    .line 865
    .line 866
    .line 867
    const v15, 0x414ab852    # 12.67f

    .line 868
    .line 869
    .line 870
    const v16, 0x4114f5c3    # 9.31f

    .line 871
    .line 872
    .line 873
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 874
    .line 875
    .line 876
    const/high16 v0, 0x40e00000    # 7.0f

    .line 877
    .line 878
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 879
    .line 880
    .line 881
    const/high16 v0, -0x40800000    # -1.0f

    .line 882
    .line 883
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 884
    .line 885
    .line 886
    const/high16 v0, 0x40000000    # 2.0f

    .line 887
    .line 888
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 889
    .line 890
    .line 891
    const v17, -0x3fcd70a4    # -2.79f

    .line 892
    .line 893
    .line 894
    const v18, 0x3f947ae1    # 1.16f

    .line 895
    .line 896
    .line 897
    const v13, -0x407eb852    # -1.01f

    .line 898
    .line 899
    .line 900
    const v14, 0x3c23d70a    # 0.01f

    .line 901
    .line 902
    .line 903
    const v15, -0x3ffeb852    # -2.02f

    .line 904
    .line 905
    .line 906
    const v16, 0x3ec7ae14    # 0.39f

    .line 907
    .line 908
    .line 909
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 910
    .line 911
    .line 912
    const v17, -0x40f0a3d7    # -0.56f

    .line 913
    .line 914
    .line 915
    const v18, 0x3f0f5c29    # 0.56f

    .line 916
    .line 917
    .line 918
    const v13, -0x41fae148    # -0.13f

    .line 919
    .line 920
    .line 921
    const v14, 0x3e051eb8    # 0.13f

    .line 922
    .line 923
    .line 924
    const v15, -0x41570a3d    # -0.33f

    .line 925
    .line 926
    .line 927
    const v16, 0x3ea8f5c3    # 0.33f

    .line 928
    .line 929
    .line 930
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 931
    .line 932
    .line 933
    const v0, -0x40deb852    # -0.63f

    .line 934
    .line 935
    .line 936
    const v2, -0x403c28f6    # -1.53f

    .line 937
    .line 938
    .line 939
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 940
    .line 941
    .line 942
    const v17, -0x3f870a3d    # -3.89f

    .line 943
    .line 944
    .line 945
    const v18, 0x3fcf5c29    # 1.62f

    .line 946
    .line 947
    .line 948
    const v13, -0x403d70a4    # -1.52f

    .line 949
    .line 950
    .line 951
    const v14, -0x40deb852    # -0.63f

    .line 952
    .line 953
    .line 954
    const v15, -0x3faeb852    # -3.27f

    .line 955
    .line 956
    .line 957
    const v16, 0x3dcccccd    # 0.1f

    .line 958
    .line 959
    .line 960
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 961
    .line 962
    .line 963
    const v17, 0x3fb851ec    # 1.44f

    .line 964
    .line 965
    .line 966
    const v18, 0x40733333    # 3.8f

    .line 967
    .line 968
    .line 969
    const v13, -0x40e66666    # -0.6f

    .line 970
    .line 971
    .line 972
    const v14, 0x3fbae148    # 1.46f

    .line 973
    .line 974
    .line 975
    const v15, 0x3d4ccccd    # 0.05f

    .line 976
    .line 977
    .line 978
    const v16, 0x40470a3d    # 3.11f

    .line 979
    .line 980
    .line 981
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 982
    .line 983
    .line 984
    const v17, 0x3f83d70a    # 1.03f

    .line 985
    .line 986
    .line 987
    const v18, 0x40728f5c    # 3.79f

    .line 988
    .line 989
    .line 990
    const v13, -0x41570a3d    # -0.33f

    .line 991
    .line 992
    .line 993
    const v14, 0x3fa7ae14    # 1.31f

    .line 994
    .line 995
    .line 996
    const/4 v15, 0x0

    .line 997
    const v16, 0x4030a3d7    # 2.76f

    .line 998
    .line 999
    .line 1000
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1001
    .line 1002
    .line 1003
    const v17, 0x40728f5c    # 3.79f

    .line 1004
    .line 1005
    .line 1006
    const v18, 0x3f83d70a    # 1.03f

    .line 1007
    .line 1008
    .line 1009
    const v13, 0x3f83d70a    # 1.03f

    .line 1010
    .line 1011
    .line 1012
    const v14, 0x3f83d70a    # 1.03f

    .line 1013
    .line 1014
    .line 1015
    const v15, 0x401eb852    # 2.48f

    .line 1016
    .line 1017
    .line 1018
    const v16, 0x3fae147b    # 1.36f

    .line 1019
    .line 1020
    .line 1021
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1022
    .line 1023
    .line 1024
    const v17, 0x40733333    # 3.8f

    .line 1025
    .line 1026
    .line 1027
    const v18, 0x3fb851ec    # 1.44f

    .line 1028
    .line 1029
    .line 1030
    const v13, 0x3f30a3d7    # 0.69f

    .line 1031
    .line 1032
    .line 1033
    const v14, 0x3fb1eb85    # 1.39f

    .line 1034
    .line 1035
    .line 1036
    const v15, 0x4015c28f    # 2.34f

    .line 1037
    .line 1038
    .line 1039
    const v16, 0x40028f5c    # 2.04f

    .line 1040
    .line 1041
    .line 1042
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1043
    .line 1044
    .line 1045
    const v17, 0x3fcf5c29    # 1.62f

    .line 1046
    .line 1047
    .line 1048
    const v18, -0x3f870a3d    # -3.89f

    .line 1049
    .line 1050
    .line 1051
    const v13, 0x3fc28f5c    # 1.52f

    .line 1052
    .line 1053
    .line 1054
    const v14, -0x40deb852    # -0.63f

    .line 1055
    .line 1056
    .line 1057
    const/high16 v15, 0x40100000    # 2.25f

    .line 1058
    .line 1059
    const v16, -0x3fe851ec    # -2.37f

    .line 1060
    .line 1061
    .line 1062
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1063
    .line 1064
    .line 1065
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1066
    .line 1067
    .line 1068
    const v17, 0x3f0f5c29    # 0.56f

    .line 1069
    .line 1070
    .line 1071
    const v18, -0x40f0a3d7    # -0.56f

    .line 1072
    .line 1073
    .line 1074
    const v13, 0x3e6b851f    # 0.23f

    .line 1075
    .line 1076
    .line 1077
    const v14, -0x41947ae1    # -0.23f

    .line 1078
    .line 1079
    .line 1080
    const v15, 0x3edc28f6    # 0.43f

    .line 1081
    .line 1082
    .line 1083
    const v16, -0x4123d70a    # -0.43f

    .line 1084
    .line 1085
    .line 1086
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1087
    .line 1088
    .line 1089
    const v17, 0x3f947ae1    # 1.16f

    .line 1090
    .line 1091
    .line 1092
    const v18, -0x3fcd70a4    # -2.79f

    .line 1093
    .line 1094
    .line 1095
    const v13, 0x3f451eb8    # 0.77f

    .line 1096
    .line 1097
    .line 1098
    const v14, -0x40bae148    # -0.77f

    .line 1099
    .line 1100
    .line 1101
    const v15, 0x3f947ae1    # 1.16f

    .line 1102
    .line 1103
    .line 1104
    const v16, -0x401c28f6    # -1.78f

    .line 1105
    .line 1106
    .line 1107
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1108
    .line 1109
    .line 1110
    const/high16 v0, 0x40000000    # 2.0f

    .line 1111
    .line 1112
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1113
    .line 1114
    .line 1115
    const/high16 v0, -0x40800000    # -1.0f

    .line 1116
    .line 1117
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1118
    .line 1119
    .line 1120
    const v0, 0x416dc28f    # 14.86f

    .line 1121
    .line 1122
    .line 1123
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1124
    .line 1125
    .line 1126
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1127
    .line 1128
    .line 1129
    const v0, 0x40928f5c    # 4.58f

    .line 1130
    .line 1131
    .line 1132
    const v2, 0x415ccccd    # 13.8f

    .line 1133
    .line 1134
    .line 1135
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1136
    .line 1137
    .line 1138
    const v17, -0x40f5c28f    # -0.54f

    .line 1139
    .line 1140
    .line 1141
    const v18, -0x4059999a    # -1.3f

    .line 1142
    .line 1143
    .line 1144
    const v13, -0x40fd70a4    # -0.51f

    .line 1145
    .line 1146
    .line 1147
    const v14, -0x41a8f5c3    # -0.21f

    .line 1148
    .line 1149
    .line 1150
    const/high16 v15, -0x40c00000    # -0.75f

    .line 1151
    .line 1152
    const v16, -0x40b5c28f    # -0.79f

    .line 1153
    .line 1154
    .line 1155
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1156
    .line 1157
    .line 1158
    const v17, 0x3fa66666    # 1.3f

    .line 1159
    .line 1160
    .line 1161
    const v18, -0x40f5c28f    # -0.54f

    .line 1162
    .line 1163
    .line 1164
    const v13, 0x3e570a3d    # 0.21f

    .line 1165
    .line 1166
    .line 1167
    const v14, -0x40fd70a4    # -0.51f

    .line 1168
    .line 1169
    .line 1170
    const v15, 0x3f4a3d71    # 0.79f

    .line 1171
    .line 1172
    .line 1173
    const/high16 v16, -0x40c00000    # -0.75f

    .line 1174
    .line 1175
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1176
    .line 1177
    .line 1178
    const v0, 0x3f99999a    # 1.2f

    .line 1179
    .line 1180
    .line 1181
    const v2, 0x403ae148    # 2.92f

    .line 1182
    .line 1183
    .line 1184
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1185
    .line 1186
    .line 1187
    const v17, 0x40928f5c    # 4.58f

    .line 1188
    .line 1189
    .line 1190
    const v18, 0x415ccccd    # 13.8f

    .line 1191
    .line 1192
    .line 1193
    const v13, 0x40e70a3d    # 7.22f

    .line 1194
    .line 1195
    .line 1196
    const v14, 0x415d70a4    # 13.84f

    .line 1197
    .line 1198
    .line 1199
    const v15, 0x40ba8f5c    # 5.83f

    .line 1200
    .line 1201
    .line 1202
    const v16, 0x4164f5c3    # 14.31f

    .line 1203
    .line 1204
    .line 1205
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1206
    .line 1207
    .line 1208
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1209
    .line 1210
    .line 1211
    const v0, 0x4100a3d7    # 8.04f

    .line 1212
    .line 1213
    .line 1214
    const v2, 0x41933333    # 18.4f

    .line 1215
    .line 1216
    .line 1217
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1218
    .line 1219
    .line 1220
    const v17, -0x4007ae14    # -1.94f

    .line 1221
    .line 1222
    .line 1223
    const/high16 v18, -0x41000000    # -0.5f

    .line 1224
    .line 1225
    const v13, -0x40d47ae1    # -0.67f

    .line 1226
    .line 1227
    .line 1228
    const v14, 0x3e428f5c    # 0.19f

    .line 1229
    .line 1230
    .line 1231
    const v15, -0x404b851f    # -1.41f

    .line 1232
    .line 1233
    .line 1234
    const v16, 0x3ca3d70a    # 0.02f

    .line 1235
    .line 1236
    .line 1237
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1238
    .line 1239
    .line 1240
    const/high16 v17, -0x41000000    # -0.5f

    .line 1241
    .line 1242
    const v18, -0x4007ae14    # -1.94f

    .line 1243
    .line 1244
    .line 1245
    const v13, -0x40f851ec    # -0.53f

    .line 1246
    .line 1247
    .line 1248
    const v14, -0x40f851ec    # -0.53f

    .line 1249
    .line 1250
    .line 1251
    const v15, -0x40cf5c29    # -0.69f

    .line 1252
    .line 1253
    .line 1254
    const v16, -0x405d70a4    # -1.27f

    .line 1255
    .line 1256
    .line 1257
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1258
    .line 1259
    .line 1260
    const v17, 0x40570a3d    # 3.36f

    .line 1261
    .line 1262
    .line 1263
    const v18, -0x40947ae1    # -0.92f

    .line 1264
    .line 1265
    .line 1266
    const v13, 0x3f9851ec    # 1.19f

    .line 1267
    .line 1268
    .line 1269
    const v14, 0x3cf5c28f    # 0.03f

    .line 1270
    .line 1271
    .line 1272
    const v15, 0x4017ae14    # 2.37f

    .line 1273
    .line 1274
    .line 1275
    const v16, -0x414ccccd    # -0.35f

    .line 1276
    .line 1277
    .line 1278
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1279
    .line 1280
    .line 1281
    const v17, 0x4100a3d7    # 8.04f

    .line 1282
    .line 1283
    .line 1284
    const v18, 0x41933333    # 18.4f

    .line 1285
    .line 1286
    .line 1287
    const v13, 0x41063d71    # 8.39f

    .line 1288
    .line 1289
    .line 1290
    const v14, 0x41803d71    # 16.03f

    .line 1291
    .line 1292
    .line 1293
    const v15, 0x410028f6    # 8.01f

    .line 1294
    .line 1295
    .line 1296
    const v16, 0x4189ae14    # 17.21f

    .line 1297
    .line 1298
    .line 1299
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1300
    .line 1301
    .line 1302
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1303
    .line 1304
    .line 1305
    const/high16 v0, 0x41380000    # 11.5f

    .line 1306
    .line 1307
    const v2, 0x419fae14    # 19.96f

    .line 1308
    .line 1309
    .line 1310
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1311
    .line 1312
    .line 1313
    const v17, -0x4059999a    # -1.3f

    .line 1314
    .line 1315
    .line 1316
    const v18, -0x40f5c28f    # -0.54f

    .line 1317
    .line 1318
    .line 1319
    const v13, -0x40fd70a4    # -0.51f

    .line 1320
    .line 1321
    .line 1322
    const v14, 0x3e570a3d    # 0.21f

    .line 1323
    .line 1324
    .line 1325
    const v15, -0x40747ae1    # -1.09f

    .line 1326
    .line 1327
    .line 1328
    const v16, -0x430a3d71    # -0.03f

    .line 1329
    .line 1330
    .line 1331
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1332
    .line 1333
    .line 1334
    const v17, 0x3f23d70a    # 0.64f

    .line 1335
    .line 1336
    .line 1337
    const v18, -0x3f951eb8    # -3.67f

    .line 1338
    .line 1339
    .line 1340
    const/high16 v14, -0x40600000    # -1.25f

    .line 1341
    .line 1342
    const v15, -0x42dc28f6    # -0.04f

    .line 1343
    .line 1344
    .line 1345
    const v16, -0x3fd70a3d    # -2.64f

    .line 1346
    .line 1347
    .line 1348
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1349
    .line 1350
    .line 1351
    const v0, 0x3f99999a    # 1.2f

    .line 1352
    .line 1353
    .line 1354
    const v2, 0x403ae148    # 2.92f

    .line 1355
    .line 1356
    .line 1357
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1358
    .line 1359
    .line 1360
    const/high16 v17, 0x41380000    # 11.5f

    .line 1361
    .line 1362
    const v18, 0x419fae14    # 19.96f

    .line 1363
    .line 1364
    .line 1365
    const/high16 v13, 0x41440000    # 12.25f

    .line 1366
    .line 1367
    const v14, 0x41995c29    # 19.17f

    .line 1368
    .line 1369
    .line 1370
    const v15, 0x414028f6    # 12.01f

    .line 1371
    .line 1372
    .line 1373
    const v16, 0x419e147b    # 19.76f

    .line 1374
    .line 1375
    .line 1376
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1377
    .line 1378
    .line 1379
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1380
    .line 1381
    .line 1382
    const v0, 0x41473333    # 12.45f

    .line 1383
    .line 1384
    .line 1385
    const v2, 0x4165999a    # 14.35f

    .line 1386
    .line 1387
    .line 1388
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1389
    .line 1390
    .line 1391
    const v0, -0x4031eb85    # -1.61f

    .line 1392
    .line 1393
    .line 1394
    const v2, -0x40d70a3d    # -0.66f

    .line 1395
    .line 1396
    .line 1397
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1398
    .line 1399
    .line 1400
    const v17, -0x40f5c28f    # -0.54f

    .line 1401
    .line 1402
    .line 1403
    const v18, -0x40f5c28f    # -0.54f

    .line 1404
    .line 1405
    .line 1406
    const v13, -0x42333333    # -0.1f

    .line 1407
    .line 1408
    .line 1409
    const/high16 v14, -0x41800000    # -0.25f

    .line 1410
    .line 1411
    const v15, -0x41666666    # -0.3f

    .line 1412
    .line 1413
    .line 1414
    const v16, -0x411eb852    # -0.44f

    .line 1415
    .line 1416
    .line 1417
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1418
    .line 1419
    .line 1420
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1421
    .line 1422
    .line 1423
    const v17, 0x4031eb85    # 2.78f

    .line 1424
    .line 1425
    .line 1426
    const v18, 0x3cf5c28f    # 0.03f

    .line 1427
    .line 1428
    .line 1429
    const v13, 0x3f47ae14    # 0.78f

    .line 1430
    .line 1431
    .line 1432
    const/high16 v14, -0x40c00000    # -0.75f

    .line 1433
    .line 1434
    const v15, 0x4000a3d7    # 2.01f

    .line 1435
    .line 1436
    .line 1437
    const v16, -0x40c28f5c    # -0.74f

    .line 1438
    .line 1439
    .line 1440
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1441
    .line 1442
    .line 1443
    const v17, 0x41473333    # 12.45f

    .line 1444
    .line 1445
    .line 1446
    const v18, 0x4165999a    # 14.35f

    .line 1447
    .line 1448
    .line 1449
    const v13, 0x41533333    # 13.2f

    .line 1450
    .line 1451
    .line 1452
    const v14, 0x414570a4    # 12.34f

    .line 1453
    .line 1454
    .line 1455
    const v15, 0x41533333    # 13.2f

    .line 1456
    .line 1457
    .line 1458
    const v16, 0x41591eb8    # 13.57f

    .line 1459
    .line 1460
    .line 1461
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1462
    .line 1463
    .line 1464
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1465
    .line 1466
    .line 1467
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 1468
    .line 1469
    .line 1470
    move-result-object v2

    .line 1471
    const/16 v16, 0x3800

    .line 1472
    .line 1473
    const/16 v17, 0x0

    .line 1474
    .line 1475
    const/high16 v6, 0x3f800000    # 1.0f

    .line 1476
    .line 1477
    const/high16 v8, 0x3f800000    # 1.0f

    .line 1478
    .line 1479
    const/4 v7, 0x0

    .line 1480
    const/high16 v12, 0x3f800000    # 1.0f

    .line 1481
    .line 1482
    const/4 v13, 0x0

    .line 1483
    const/4 v14, 0x0

    .line 1484
    const/4 v15, 0x0

    .line 1485
    const-string v4, ""

    .line 1486
    .line 1487
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 1488
    .line 1489
    .line 1490
    move-result-object v0

    .line 1491
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1492
    .line 1493
    .line 1494
    move-result-object v0

    .line 1495
    sput-object v0, Landroidx/compose/material/icons/twotone/EmojiNatureKt;->_emojiNature:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1496
    .line 1497
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 1498
    .line 1499
    .line 1500
    return-object v0
.end method
