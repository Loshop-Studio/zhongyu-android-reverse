.class public final Landroidx/compose/material/icons/rounded/AutoModeKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_autoMode",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "AutoMode",
        "Landroidx/compose/material/icons/Icons$Rounded;",
        "getAutoMode",
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
        "SMAP\nAutoMode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AutoMode.kt\nandroidx/compose/material/icons/rounded/AutoModeKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,121:1\n212#2,12:122\n233#2,18:135\n253#2:172\n233#2,18:173\n253#2:210\n233#2,18:211\n253#2:248\n233#2,18:249\n253#2:286\n233#2,18:287\n253#2:324\n233#2,18:325\n253#2:362\n174#3:134\n705#4,2:153\n717#4,2:155\n719#4,11:161\n705#4,2:191\n717#4,2:193\n719#4,11:199\n705#4,2:229\n717#4,2:231\n719#4,11:237\n705#4,2:267\n717#4,2:269\n719#4,11:275\n705#4,2:305\n717#4,2:307\n719#4,11:313\n705#4,2:343\n717#4,2:345\n719#4,11:351\n72#5,4:157\n72#5,4:195\n72#5,4:233\n72#5,4:271\n72#5,4:309\n72#5,4:347\n*S KotlinDebug\n*F\n+ 1 AutoMode.kt\nandroidx/compose/material/icons/rounded/AutoModeKt\n*L\n29#1:122,12\n30#1:135,18\n30#1:172\n42#1:173,18\n42#1:210\n54#1:211,18\n54#1:248\n66#1:249,18\n66#1:286\n78#1:287,18\n78#1:324\n94#1:325,18\n94#1:362\n29#1:134\n30#1:153,2\n30#1:155,2\n30#1:161,11\n42#1:191,2\n42#1:193,2\n42#1:199,11\n54#1:229,2\n54#1:231,2\n54#1:237,11\n66#1:267,2\n66#1:269,2\n66#1:275,11\n78#1:305,2\n78#1:307,2\n78#1:313,11\n94#1:343,2\n94#1:345,2\n94#1:351,11\n30#1:157,4\n42#1:195,4\n54#1:233,4\n66#1:271,4\n78#1:309,4\n94#1:347,4\n*E\n"
    }
.end annotation


# static fields
.field private static _autoMode:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getAutoMode(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/AutoModeKt;->_autoMode:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.AutoMode"

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
    const v4, 0x41907ae1    # 18.06f

    .line 71
    .line 72
    .line 73
    const v6, 0x40351eb8    # 2.83f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v25, -0x3f88f5c3    # -3.86f

    .line 80
    .line 81
    .line 82
    const v26, -0x4031eb85    # -1.61f

    .line 83
    .line 84
    .line 85
    const v21, -0x406ccccd    # -1.15f

    .line 86
    .line 87
    .line 88
    const v22, -0x40bae148    # -0.77f

    .line 89
    .line 90
    .line 91
    const v23, -0x3fe28f5c    # -2.46f

    .line 92
    .line 93
    .line 94
    const v24, -0x40570a3d    # -1.32f

    .line 95
    .line 96
    .line 97
    move-object/from16 v20, v2

    .line 98
    .line 99
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 100
    .line 101
    .line 102
    const/high16 v25, 0x41500000    # 13.0f

    .line 103
    .line 104
    const v26, 0x400d70a4    # 2.21f

    .line 105
    .line 106
    .line 107
    const v21, 0x415947ae    # 13.58f

    .line 108
    .line 109
    .line 110
    const v22, 0x3f8ccccd    # 1.1f

    .line 111
    .line 112
    .line 113
    const/high16 v23, 0x41500000    # 13.0f

    .line 114
    .line 115
    const v24, 0x3fc8f5c3    # 1.57f

    .line 116
    .line 117
    .line 118
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 119
    .line 120
    .line 121
    const/4 v4, 0x0

    .line 122
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 123
    .line 124
    .line 125
    const v25, 0x3f428f5c    # 0.76f

    .line 126
    .line 127
    .line 128
    const v26, 0x3f7851ec    # 0.97f

    .line 129
    .line 130
    .line 131
    const/16 v21, 0x0

    .line 132
    .line 133
    const v22, 0x3eeb851f    # 0.46f

    .line 134
    .line 135
    .line 136
    const v23, 0x3e9eb852    # 0.31f

    .line 137
    .line 138
    .line 139
    const v24, 0x3f6147ae    # 0.88f

    .line 140
    .line 141
    .line 142
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 143
    .line 144
    .line 145
    const v25, 0x404d70a4    # 3.21f

    .line 146
    .line 147
    .line 148
    const v26, 0x3fab851f    # 1.34f

    .line 149
    .line 150
    .line 151
    const v21, 0x3f95c28f    # 1.17f

    .line 152
    .line 153
    .line 154
    const v22, 0x3e6b851f    # 0.23f

    .line 155
    .line 156
    .line 157
    const v23, 0x4010a3d7    # 2.26f

    .line 158
    .line 159
    .line 160
    const v24, 0x3f333333    # 0.7f

    .line 161
    .line 162
    .line 163
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 164
    .line 165
    .line 166
    const v25, 0x3f9d70a4    # 1.23f

    .line 167
    .line 168
    .line 169
    const v26, -0x41f0a3d7    # -0.14f

    .line 170
    .line 171
    .line 172
    const v21, 0x3ec7ae14    # 0.39f

    .line 173
    .line 174
    .line 175
    const v22, 0x3e851eb8    # 0.26f

    .line 176
    .line 177
    .line 178
    const v23, 0x3f666666    # 0.9f

    .line 179
    .line 180
    .line 181
    const v24, 0x3e428f5c    # 0.19f

    .line 182
    .line 183
    .line 184
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 185
    .line 186
    .line 187
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 188
    .line 189
    .line 190
    const v25, 0x41907ae1    # 18.06f

    .line 191
    .line 192
    .line 193
    const v26, 0x40351eb8    # 2.83f

    .line 194
    .line 195
    .line 196
    const v21, 0x419547ae    # 18.66f

    .line 197
    .line 198
    .line 199
    const v22, 0x407b851f    # 3.93f

    .line 200
    .line 201
    .line 202
    const v23, 0x4194b852    # 18.59f

    .line 203
    .line 204
    .line 205
    const v24, 0x404b851f    # 3.18f

    .line 206
    .line 207
    .line 208
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 209
    .line 210
    .line 211
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 212
    .line 213
    .line 214
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 215
    .line 216
    .line 217
    move-result-object v2

    .line 218
    const/16 v16, 0x3800

    .line 219
    .line 220
    const/16 v17, 0x0

    .line 221
    .line 222
    const/high16 v6, 0x3f800000    # 1.0f

    .line 223
    .line 224
    const/high16 v8, 0x3f800000    # 1.0f

    .line 225
    .line 226
    const/4 v7, 0x0

    .line 227
    const/high16 v9, 0x3f800000    # 1.0f

    .line 228
    .line 229
    const/high16 v12, 0x3f800000    # 1.0f

    .line 230
    .line 231
    const/4 v13, 0x0

    .line 232
    const/4 v14, 0x0

    .line 233
    const/4 v15, 0x0

    .line 234
    const-string v4, ""

    .line 235
    .line 236
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 237
    .line 238
    .line 239
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 240
    .line 241
    .line 242
    move-result v3

    .line 243
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 244
    .line 245
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 246
    .line 247
    .line 248
    move-result-wide v6

    .line 249
    const/4 v2, 0x0

    .line 250
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 251
    .line 252
    .line 253
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 254
    .line 255
    .line 256
    move-result v10

    .line 257
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 258
    .line 259
    .line 260
    move-result v11

    .line 261
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 262
    .line 263
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 264
    .line 265
    .line 266
    const v4, 0x400d70a4    # 2.21f

    .line 267
    .line 268
    .line 269
    const/high16 v6, 0x41300000    # 11.0f

    .line 270
    .line 271
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 272
    .line 273
    .line 274
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 275
    .line 276
    .line 277
    const v25, -0x40666666    # -1.2f

    .line 278
    .line 279
    .line 280
    const v26, -0x40828f5c    # -0.99f

    .line 281
    .line 282
    .line 283
    const/16 v21, 0x0

    .line 284
    .line 285
    const v22, -0x40dc28f6    # -0.64f

    .line 286
    .line 287
    .line 288
    const v23, -0x40eb851f    # -0.58f

    .line 289
    .line 290
    .line 291
    const v24, -0x4071eb85    # -1.11f

    .line 292
    .line 293
    .line 294
    move-object/from16 v20, v2

    .line 295
    .line 296
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 297
    .line 298
    .line 299
    const v25, -0x3f88f5c3    # -3.86f

    .line 300
    .line 301
    .line 302
    const v26, 0x3fce147b    # 1.61f

    .line 303
    .line 304
    .line 305
    const v21, -0x404ccccd    # -1.4f

    .line 306
    .line 307
    .line 308
    const v22, 0x3e947ae1    # 0.29f

    .line 309
    .line 310
    .line 311
    const v23, -0x3fd28f5c    # -2.71f

    .line 312
    .line 313
    .line 314
    const v24, 0x3f570a3d    # 0.84f

    .line 315
    .line 316
    .line 317
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 318
    .line 319
    .line 320
    const v25, -0x41e66666    # -0.15f

    .line 321
    .line 322
    .line 323
    const v26, 0x3fc51eb8    # 1.54f

    .line 324
    .line 325
    .line 326
    const v21, -0x40fae148    # -0.52f

    .line 327
    .line 328
    .line 329
    const v22, 0x3eb33333    # 0.35f

    .line 330
    .line 331
    .line 332
    const v23, -0x40e8f5c3    # -0.59f

    .line 333
    .line 334
    .line 335
    const v24, 0x3f8ccccd    # 1.1f

    .line 336
    .line 337
    .line 338
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 339
    .line 340
    .line 341
    const/4 v4, 0x0

    .line 342
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 343
    .line 344
    .line 345
    const v25, 0x3f9d70a4    # 1.23f

    .line 346
    .line 347
    .line 348
    const v26, 0x3e0f5c29    # 0.14f

    .line 349
    .line 350
    .line 351
    const v21, 0x3ea8f5c3    # 0.33f

    .line 352
    .line 353
    .line 354
    const v22, 0x3ea8f5c3    # 0.33f

    .line 355
    .line 356
    .line 357
    const v23, 0x3f570a3d    # 0.84f

    .line 358
    .line 359
    .line 360
    const v24, 0x3ecccccd    # 0.4f

    .line 361
    .line 362
    .line 363
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 364
    .line 365
    .line 366
    const v25, 0x404d70a4    # 3.21f

    .line 367
    .line 368
    .line 369
    const v26, -0x40547ae1    # -1.34f

    .line 370
    .line 371
    .line 372
    const v21, 0x3f75c28f    # 0.96f

    .line 373
    .line 374
    .line 375
    const v22, -0x40dc28f6    # -0.64f

    .line 376
    .line 377
    .line 378
    const v23, 0x40028f5c    # 2.04f

    .line 379
    .line 380
    .line 381
    const v24, -0x40733333    # -1.1f

    .line 382
    .line 383
    .line 384
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 385
    .line 386
    .line 387
    const/high16 v25, 0x41300000    # 11.0f

    .line 388
    .line 389
    const v26, 0x400d70a4    # 2.21f

    .line 390
    .line 391
    .line 392
    const v21, 0x412b0a3d    # 10.69f

    .line 393
    .line 394
    .line 395
    const v22, 0x4045c28f    # 3.09f

    .line 396
    .line 397
    .line 398
    const/high16 v23, 0x41300000    # 11.0f

    .line 399
    .line 400
    const v24, 0x402ae148    # 2.67f

    .line 401
    .line 402
    .line 403
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 404
    .line 405
    .line 406
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 407
    .line 408
    .line 409
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 410
    .line 411
    .line 412
    move-result-object v2

    .line 413
    const/high16 v6, 0x3f800000    # 1.0f

    .line 414
    .line 415
    const/4 v7, 0x0

    .line 416
    const-string v4, ""

    .line 417
    .line 418
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 419
    .line 420
    .line 421
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 422
    .line 423
    .line 424
    move-result v3

    .line 425
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 426
    .line 427
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 428
    .line 429
    .line 430
    move-result-wide v6

    .line 431
    const/4 v2, 0x0

    .line 432
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 433
    .line 434
    .line 435
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 436
    .line 437
    .line 438
    move-result v10

    .line 439
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 440
    .line 441
    .line 442
    move-result v11

    .line 443
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 444
    .line 445
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 446
    .line 447
    .line 448
    const v4, 0x40b947ae    # 5.79f

    .line 449
    .line 450
    .line 451
    const v6, 0x408c28f6    # 4.38f

    .line 452
    .line 453
    .line 454
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 455
    .line 456
    .line 457
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 458
    .line 459
    .line 460
    const v25, 0x4035c28f    # 2.84f

    .line 461
    .line 462
    .line 463
    const v26, 0x40be147b    # 5.94f

    .line 464
    .line 465
    .line 466
    const v21, 0x407b851f    # 3.93f

    .line 467
    .line 468
    .line 469
    const v22, 0x40aae148    # 5.34f

    .line 470
    .line 471
    .line 472
    const v23, 0x404b851f    # 3.18f

    .line 473
    .line 474
    .line 475
    const v24, 0x40ad70a4    # 5.42f

    .line 476
    .line 477
    .line 478
    move-object/from16 v20, v2

    .line 479
    .line 480
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 481
    .line 482
    .line 483
    const v25, 0x3f9d70a4    # 1.23f

    .line 484
    .line 485
    .line 486
    const v26, 0x411ccccd    # 9.8f

    .line 487
    .line 488
    .line 489
    const v21, 0x40047ae1    # 2.07f

    .line 490
    .line 491
    .line 492
    const v22, 0x40e2e148    # 7.09f

    .line 493
    .line 494
    .line 495
    const v23, 0x3fc147ae    # 1.51f

    .line 496
    .line 497
    .line 498
    const v24, 0x41063d71    # 8.39f

    .line 499
    .line 500
    .line 501
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 502
    .line 503
    .line 504
    const v25, 0x400d70a4    # 2.21f

    .line 505
    .line 506
    .line 507
    const/high16 v26, 0x41300000    # 11.0f

    .line 508
    .line 509
    const v21, 0x3f8ccccd    # 1.1f

    .line 510
    .line 511
    .line 512
    const v22, 0x4126b852    # 10.42f

    .line 513
    .line 514
    .line 515
    const v23, 0x3fca3d71    # 1.58f

    .line 516
    .line 517
    .line 518
    const/high16 v24, 0x41300000    # 11.0f

    .line 519
    .line 520
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 521
    .line 522
    .line 523
    const/4 v4, 0x0

    .line 524
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 525
    .line 526
    .line 527
    const v25, 0x3f7851ec    # 0.97f

    .line 528
    .line 529
    .line 530
    const v26, -0x40bd70a4    # -0.76f

    .line 531
    .line 532
    .line 533
    const v21, 0x3eeb851f    # 0.46f

    .line 534
    .line 535
    .line 536
    const/16 v22, 0x0

    .line 537
    .line 538
    const v23, 0x3f6147ae    # 0.88f

    .line 539
    .line 540
    .line 541
    const v24, -0x416147ae    # -0.31f

    .line 542
    .line 543
    .line 544
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 545
    .line 546
    .line 547
    const v25, 0x3fab851f    # 1.34f

    .line 548
    .line 549
    .line 550
    const v26, -0x3fb1eb85    # -3.22f

    .line 551
    .line 552
    .line 553
    const v21, 0x3e6b851f    # 0.23f

    .line 554
    .line 555
    .line 556
    const v22, -0x406a3d71    # -1.17f

    .line 557
    .line 558
    .line 559
    const v23, 0x3f333333    # 0.7f

    .line 560
    .line 561
    .line 562
    const v24, -0x3fef5c29    # -2.26f

    .line 563
    .line 564
    .line 565
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 566
    .line 567
    .line 568
    const v25, 0x408c28f6    # 4.38f

    .line 569
    .line 570
    .line 571
    const v26, 0x40b947ae    # 5.79f

    .line 572
    .line 573
    .line 574
    const v21, 0x4098a3d7    # 4.77f

    .line 575
    .line 576
    .line 577
    const v22, 0x40d47ae1    # 6.64f

    .line 578
    .line 579
    .line 580
    const v23, 0x40966666    # 4.7f

    .line 581
    .line 582
    .line 583
    const v24, 0x40c3d70a    # 6.12f

    .line 584
    .line 585
    .line 586
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 587
    .line 588
    .line 589
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 590
    .line 591
    .line 592
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 593
    .line 594
    .line 595
    move-result-object v2

    .line 596
    const/high16 v6, 0x3f800000    # 1.0f

    .line 597
    .line 598
    const/4 v7, 0x0

    .line 599
    const-string v4, ""

    .line 600
    .line 601
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 602
    .line 603
    .line 604
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 605
    .line 606
    .line 607
    move-result v3

    .line 608
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 609
    .line 610
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 611
    .line 612
    .line 613
    move-result-wide v6

    .line 614
    const/4 v2, 0x0

    .line 615
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 616
    .line 617
    .line 618
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 619
    .line 620
    .line 621
    move-result v10

    .line 622
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 623
    .line 624
    .line 625
    move-result v11

    .line 626
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 627
    .line 628
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 629
    .line 630
    .line 631
    const v4, 0x41ae51ec    # 21.79f

    .line 632
    .line 633
    .line 634
    const/high16 v6, 0x41300000    # 11.0f

    .line 635
    .line 636
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 637
    .line 638
    .line 639
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 640
    .line 641
    .line 642
    const v25, 0x3f7ae148    # 0.98f

    .line 643
    .line 644
    .line 645
    const v26, -0x40666666    # -1.2f

    .line 646
    .line 647
    .line 648
    const v21, 0x3f2147ae    # 0.63f

    .line 649
    .line 650
    .line 651
    const/16 v22, 0x0

    .line 652
    .line 653
    const v23, 0x3f8e147b    # 1.11f

    .line 654
    .line 655
    .line 656
    const v24, -0x40eb851f    # -0.58f

    .line 657
    .line 658
    .line 659
    move-object/from16 v20, v2

    .line 660
    .line 661
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 662
    .line 663
    .line 664
    const v25, -0x4031eb85    # -1.61f

    .line 665
    .line 666
    .line 667
    const v26, -0x3f88f5c3    # -3.86f

    .line 668
    .line 669
    .line 670
    const v21, -0x416b851f    # -0.29f

    .line 671
    .line 672
    .line 673
    const v22, -0x404ccccd    # -1.4f

    .line 674
    .line 675
    .line 676
    const v23, -0x40a8f5c3    # -0.84f

    .line 677
    .line 678
    .line 679
    const v24, -0x3fd33333    # -2.7f

    .line 680
    .line 681
    .line 682
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 683
    .line 684
    .line 685
    const v25, -0x403ae148    # -1.54f

    .line 686
    .line 687
    .line 688
    const v26, -0x41e66666    # -0.15f

    .line 689
    .line 690
    .line 691
    const v21, -0x414ccccd    # -0.35f

    .line 692
    .line 693
    .line 694
    const v22, -0x40fae148    # -0.52f

    .line 695
    .line 696
    .line 697
    const v23, -0x40733333    # -1.1f

    .line 698
    .line 699
    .line 700
    const v24, -0x40e66666    # -0.6f

    .line 701
    .line 702
    .line 703
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 704
    .line 705
    .line 706
    const/4 v4, 0x0

    .line 707
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 708
    .line 709
    .line 710
    const v25, -0x41f0a3d7    # -0.14f

    .line 711
    .line 712
    .line 713
    const v26, 0x3f9d70a4    # 1.23f

    .line 714
    .line 715
    .line 716
    const v21, -0x41570a3d    # -0.33f

    .line 717
    .line 718
    .line 719
    const v22, 0x3ea8f5c3    # 0.33f

    .line 720
    .line 721
    .line 722
    const v23, -0x41333333    # -0.4f

    .line 723
    .line 724
    .line 725
    const v24, 0x3f570a3d    # 0.84f

    .line 726
    .line 727
    .line 728
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 729
    .line 730
    .line 731
    const v25, 0x3fab851f    # 1.34f

    .line 732
    .line 733
    .line 734
    const v26, 0x404e147b    # 3.22f

    .line 735
    .line 736
    .line 737
    const v21, 0x3f23d70a    # 0.64f

    .line 738
    .line 739
    .line 740
    const v22, 0x3f75c28f    # 0.96f

    .line 741
    .line 742
    .line 743
    const v23, 0x3f8ccccd    # 1.1f

    .line 744
    .line 745
    .line 746
    const v24, 0x40033333    # 2.05f

    .line 747
    .line 748
    .line 749
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 750
    .line 751
    .line 752
    const v25, 0x41ae51ec    # 21.79f

    .line 753
    .line 754
    .line 755
    const/high16 v26, 0x41300000    # 11.0f

    .line 756
    .line 757
    const v21, 0x41a747ae    # 20.91f

    .line 758
    .line 759
    .line 760
    const v22, 0x412b0a3d    # 10.69f

    .line 761
    .line 762
    .line 763
    const v23, 0x41aaa3d7    # 21.33f

    .line 764
    .line 765
    .line 766
    const/high16 v24, 0x41300000    # 11.0f

    .line 767
    .line 768
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 769
    .line 770
    .line 771
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 772
    .line 773
    .line 774
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 775
    .line 776
    .line 777
    move-result-object v2

    .line 778
    const/high16 v6, 0x3f800000    # 1.0f

    .line 779
    .line 780
    const/4 v7, 0x0

    .line 781
    const-string v4, ""

    .line 782
    .line 783
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 784
    .line 785
    .line 786
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 787
    .line 788
    .line 789
    move-result v3

    .line 790
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 791
    .line 792
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 793
    .line 794
    .line 795
    move-result-wide v6

    .line 796
    const/4 v2, 0x0

    .line 797
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 798
    .line 799
    .line 800
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 801
    .line 802
    .line 803
    move-result v10

    .line 804
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 805
    .line 806
    .line 807
    move-result v11

    .line 808
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 809
    .line 810
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 811
    .line 812
    .line 813
    const v4, 0x41475c29    # 12.46f

    .line 814
    .line 815
    .line 816
    const/high16 v6, 0x41000000    # 8.0f

    .line 817
    .line 818
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 819
    .line 820
    .line 821
    const v4, 0x3f8e147b    # 1.11f

    .line 822
    .line 823
    .line 824
    const v6, 0x401c28f6    # 2.44f

    .line 825
    .line 826
    .line 827
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 828
    .line 829
    .line 830
    const/high16 v4, 0x41800000    # 16.0f

    .line 831
    .line 832
    const v6, 0x4138a3d7    # 11.54f

    .line 833
    .line 834
    .line 835
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 836
    .line 837
    .line 838
    const v25, 0x3f68f5c3    # 0.91f

    .line 839
    .line 840
    .line 841
    const/16 v26, 0x0

    .line 842
    .line 843
    const v21, 0x3e3851ec    # 0.18f

    .line 844
    .line 845
    .line 846
    const v22, 0x3ec7ae14    # 0.39f

    .line 847
    .line 848
    .line 849
    const v23, 0x3f3ae148    # 0.73f

    .line 850
    .line 851
    .line 852
    const v24, 0x3ec7ae14    # 0.39f

    .line 853
    .line 854
    .line 855
    move-object/from16 v20, v2

    .line 856
    .line 857
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 858
    .line 859
    .line 860
    const v4, -0x3fe3d70a    # -2.44f

    .line 861
    .line 862
    .line 863
    const v6, 0x3f8e147b    # 1.11f

    .line 864
    .line 865
    .line 866
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 867
    .line 868
    .line 869
    const/high16 v4, 0x41800000    # 16.0f

    .line 870
    .line 871
    const v6, 0x41475c29    # 12.46f

    .line 872
    .line 873
    .line 874
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 875
    .line 876
    .line 877
    const/16 v25, 0x0

    .line 878
    .line 879
    const v26, -0x40970a3d    # -0.91f

    .line 880
    .line 881
    .line 882
    const v21, 0x3ec7ae14    # 0.39f

    .line 883
    .line 884
    .line 885
    const v22, -0x41c7ae14    # -0.18f

    .line 886
    .line 887
    .line 888
    const v23, 0x3ec7ae14    # 0.39f

    .line 889
    .line 890
    .line 891
    const v24, -0x40c51eb8    # -0.73f

    .line 892
    .line 893
    .line 894
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 895
    .line 896
    .line 897
    const v4, -0x4071eb85    # -1.11f

    .line 898
    .line 899
    .line 900
    const v6, -0x3fe3d70a    # -2.44f

    .line 901
    .line 902
    .line 903
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 904
    .line 905
    .line 906
    const v4, 0x41475c29    # 12.46f

    .line 907
    .line 908
    .line 909
    const/high16 v6, 0x41000000    # 8.0f

    .line 910
    .line 911
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 912
    .line 913
    .line 914
    const v25, -0x40970a3d    # -0.91f

    .line 915
    .line 916
    .line 917
    const/16 v26, 0x0

    .line 918
    .line 919
    const v21, -0x41c7ae14    # -0.18f

    .line 920
    .line 921
    .line 922
    const v22, -0x413851ec    # -0.39f

    .line 923
    .line 924
    .line 925
    const v23, -0x40c51eb8    # -0.73f

    .line 926
    .line 927
    .line 928
    const v24, -0x413851ec    # -0.39f

    .line 929
    .line 930
    .line 931
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 932
    .line 933
    .line 934
    const v4, -0x4071eb85    # -1.11f

    .line 935
    .line 936
    .line 937
    const v6, 0x401c28f6    # 2.44f

    .line 938
    .line 939
    .line 940
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 941
    .line 942
    .line 943
    const v4, 0x4138a3d7    # 11.54f

    .line 944
    .line 945
    .line 946
    const/high16 v6, 0x41000000    # 8.0f

    .line 947
    .line 948
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 949
    .line 950
    .line 951
    const/high16 v25, 0x41000000    # 8.0f

    .line 952
    .line 953
    const v26, 0x41475c29    # 12.46f

    .line 954
    .line 955
    .line 956
    const v21, 0x40f3851f    # 7.61f

    .line 957
    .line 958
    .line 959
    const v22, 0x413b851f    # 11.72f

    .line 960
    .line 961
    .line 962
    const v23, 0x40f3851f    # 7.61f

    .line 963
    .line 964
    .line 965
    const v24, 0x41447ae1    # 12.28f

    .line 966
    .line 967
    .line 968
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 969
    .line 970
    .line 971
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 972
    .line 973
    .line 974
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 975
    .line 976
    .line 977
    move-result-object v2

    .line 978
    const/high16 v6, 0x3f800000    # 1.0f

    .line 979
    .line 980
    const/4 v7, 0x0

    .line 981
    const-string v4, ""

    .line 982
    .line 983
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 984
    .line 985
    .line 986
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 987
    .line 988
    .line 989
    move-result v3

    .line 990
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 991
    .line 992
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 993
    .line 994
    .line 995
    move-result-wide v6

    .line 996
    const/4 v0, 0x0

    .line 997
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 998
    .line 999
    .line 1000
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 1001
    .line 1002
    .line 1003
    move-result v10

    .line 1004
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 1005
    .line 1006
    .line 1007
    move-result v11

    .line 1008
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1009
    .line 1010
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 1011
    .line 1012
    .line 1013
    const/high16 v0, 0x41400000    # 12.0f

    .line 1014
    .line 1015
    const/high16 v2, 0x41a80000    # 21.0f

    .line 1016
    .line 1017
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1018
    .line 1019
    .line 1020
    const v17, -0x3f1147ae    # -7.46f

    .line 1021
    .line 1022
    .line 1023
    const/high16 v18, -0x3f800000    # -4.0f

    .line 1024
    .line 1025
    const v13, -0x3fb8f5c3    # -3.11f

    .line 1026
    .line 1027
    .line 1028
    const v15, -0x3f44cccd    # -5.85f

    .line 1029
    .line 1030
    .line 1031
    const v16, -0x40347ae1    # -1.59f

    .line 1032
    .line 1033
    .line 1034
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1035
    .line 1036
    .line 1037
    const/high16 v0, 0x40c00000    # 6.0f

    .line 1038
    .line 1039
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1040
    .line 1041
    .line 1042
    const/high16 v17, 0x3f800000    # 1.0f

    .line 1043
    .line 1044
    const/high16 v18, -0x40800000    # -1.0f

    .line 1045
    .line 1046
    const v13, 0x3f0ccccd    # 0.55f

    .line 1047
    .line 1048
    .line 1049
    const/high16 v15, 0x3f800000    # 1.0f

    .line 1050
    .line 1051
    const v16, -0x4119999a    # -0.45f

    .line 1052
    .line 1053
    .line 1054
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1055
    .line 1056
    .line 1057
    const/4 v0, 0x0

    .line 1058
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1059
    .line 1060
    .line 1061
    const/high16 v17, -0x40800000    # -1.0f

    .line 1062
    .line 1063
    const/4 v13, 0x0

    .line 1064
    const v14, -0x40f33333    # -0.55f

    .line 1065
    .line 1066
    .line 1067
    const v15, -0x4119999a    # -0.45f

    .line 1068
    .line 1069
    .line 1070
    const/high16 v16, -0x40800000    # -1.0f

    .line 1071
    .line 1072
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1073
    .line 1074
    .line 1075
    const/high16 v0, 0x40000000    # 2.0f

    .line 1076
    .line 1077
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1078
    .line 1079
    .line 1080
    const/high16 v18, 0x3f800000    # 1.0f

    .line 1081
    .line 1082
    const v13, -0x40f33333    # -0.55f

    .line 1083
    .line 1084
    .line 1085
    const/4 v14, 0x0

    .line 1086
    const/high16 v15, -0x40800000    # -1.0f

    .line 1087
    .line 1088
    const v16, 0x3ee66666    # 0.45f

    .line 1089
    .line 1090
    .line 1091
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1092
    .line 1093
    .line 1094
    const/high16 v0, 0x40800000    # 4.0f

    .line 1095
    .line 1096
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1097
    .line 1098
    .line 1099
    const/high16 v17, 0x3f800000    # 1.0f

    .line 1100
    .line 1101
    const/4 v13, 0x0

    .line 1102
    const v14, 0x3f0ccccd    # 0.55f

    .line 1103
    .line 1104
    .line 1105
    const v15, 0x3ee66666    # 0.45f

    .line 1106
    .line 1107
    .line 1108
    const/high16 v16, 0x3f800000    # 1.0f

    .line 1109
    .line 1110
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1111
    .line 1112
    .line 1113
    const/4 v0, 0x0

    .line 1114
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1115
    .line 1116
    .line 1117
    const/high16 v18, -0x40800000    # -1.0f

    .line 1118
    .line 1119
    const v13, 0x3f0ccccd    # 0.55f

    .line 1120
    .line 1121
    .line 1122
    const/4 v14, 0x0

    .line 1123
    const/high16 v15, 0x3f800000    # 1.0f

    .line 1124
    .line 1125
    const v16, -0x4119999a    # -0.45f

    .line 1126
    .line 1127
    .line 1128
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1129
    .line 1130
    .line 1131
    const v0, -0x40266666    # -1.7f

    .line 1132
    .line 1133
    .line 1134
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1135
    .line 1136
    .line 1137
    const/high16 v17, 0x41100000    # 9.0f

    .line 1138
    .line 1139
    const v18, 0x40966666    # 4.7f

    .line 1140
    .line 1141
    .line 1142
    const v13, 0x3ffeb852    # 1.99f

    .line 1143
    .line 1144
    .line 1145
    const v14, 0x4035c28f    # 2.84f

    .line 1146
    .line 1147
    .line 1148
    const v15, 0x40a8a3d7    # 5.27f

    .line 1149
    .line 1150
    .line 1151
    const v16, 0x40966666    # 4.7f

    .line 1152
    .line 1153
    .line 1154
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1155
    .line 1156
    .line 1157
    const/high16 v17, 0x41200000    # 10.0f

    .line 1158
    .line 1159
    const v18, -0x3f323d71    # -6.43f

    .line 1160
    .line 1161
    .line 1162
    const v13, 0x408e6666    # 4.45f

    .line 1163
    .line 1164
    .line 1165
    const/4 v14, 0x0

    .line 1166
    const v15, 0x410451ec    # 8.27f

    .line 1167
    .line 1168
    .line 1169
    const v16, -0x3fd70a3d    # -2.64f

    .line 1170
    .line 1171
    .line 1172
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1173
    .line 1174
    .line 1175
    const v17, -0x40cf5c29    # -0.69f

    .line 1176
    .line 1177
    .line 1178
    const v18, -0x404e147b    # -1.39f

    .line 1179
    .line 1180
    .line 1181
    const v13, 0x3e851eb8    # 0.26f

    .line 1182
    .line 1183
    .line 1184
    const v14, -0x40ee147b    # -0.57f

    .line 1185
    .line 1186
    .line 1187
    const v15, -0x425c28f6    # -0.08f

    .line 1188
    .line 1189
    .line 1190
    const/high16 v16, -0x40600000    # -1.25f

    .line 1191
    .line 1192
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1193
    .line 1194
    .line 1195
    const/4 v0, 0x0

    .line 1196
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1197
    .line 1198
    .line 1199
    const v17, -0x4070a3d7    # -1.12f

    .line 1200
    .line 1201
    .line 1202
    const v18, 0x3f0a3d71    # 0.54f

    .line 1203
    .line 1204
    .line 1205
    const v13, -0x4119999a    # -0.45f

    .line 1206
    .line 1207
    .line 1208
    const v14, -0x42333333    # -0.1f

    .line 1209
    .line 1210
    .line 1211
    const v15, -0x4091eb85    # -0.93f

    .line 1212
    .line 1213
    .line 1214
    const v16, 0x3de147ae    # 0.11f

    .line 1215
    .line 1216
    .line 1217
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1218
    .line 1219
    .line 1220
    const/high16 v17, 0x41400000    # 12.0f

    .line 1221
    .line 1222
    const/high16 v18, 0x41a80000    # 21.0f

    .line 1223
    .line 1224
    const v13, 0x419628f6    # 18.77f

    .line 1225
    .line 1226
    .line 1227
    const v14, 0x4196a3d7    # 18.83f

    .line 1228
    .line 1229
    .line 1230
    const v15, 0x417a3d71    # 15.64f

    .line 1231
    .line 1232
    .line 1233
    const/high16 v16, 0x41a80000    # 21.0f

    .line 1234
    .line 1235
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1236
    .line 1237
    .line 1238
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1239
    .line 1240
    .line 1241
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 1242
    .line 1243
    .line 1244
    move-result-object v2

    .line 1245
    const/16 v16, 0x3800

    .line 1246
    .line 1247
    const/16 v17, 0x0

    .line 1248
    .line 1249
    const/high16 v6, 0x3f800000    # 1.0f

    .line 1250
    .line 1251
    const/4 v7, 0x0

    .line 1252
    const/high16 v12, 0x3f800000    # 1.0f

    .line 1253
    .line 1254
    const/4 v13, 0x0

    .line 1255
    const/4 v14, 0x0

    .line 1256
    const/4 v15, 0x0

    .line 1257
    const-string v4, ""

    .line 1258
    .line 1259
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 1260
    .line 1261
    .line 1262
    move-result-object v0

    .line 1263
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1264
    .line 1265
    .line 1266
    move-result-object v0

    .line 1267
    sput-object v0, Landroidx/compose/material/icons/rounded/AutoModeKt;->_autoMode:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1268
    .line 1269
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 1270
    .line 1271
    .line 1272
    return-object v0
.end method
