.class public final Landroidx/compose/material/icons/twotone/WalletKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_wallet",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "Wallet",
        "Landroidx/compose/material/icons/Icons$TwoTone;",
        "getWallet",
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
        "SMAP\nWallet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Wallet.kt\nandroidx/compose/material/icons/twotone/WalletKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,87:1\n212#2,12:88\n233#2,18:101\n253#2:138\n233#2,18:139\n253#2:176\n233#2,18:177\n253#2:214\n174#3:100\n705#4,2:119\n717#4,2:121\n719#4,11:127\n705#4,2:157\n717#4,2:159\n719#4,11:165\n705#4,2:195\n717#4,2:197\n719#4,11:203\n72#5,4:123\n72#5,4:161\n72#5,4:199\n*S KotlinDebug\n*F\n+ 1 Wallet.kt\nandroidx/compose/material/icons/twotone/WalletKt\n*L\n29#1:88,12\n30#1:101,18\n30#1:138\n40#1:139,18\n40#1:176\n52#1:177,18\n52#1:214\n29#1:100\n30#1:119,2\n30#1:121,2\n30#1:127,11\n40#1:157,2\n40#1:159,2\n40#1:165,11\n52#1:195,2\n52#1:197,2\n52#1:203,11\n30#1:123,4\n40#1:161,4\n52#1:199,4\n*E\n"
    }
.end annotation


# static fields
.field private static _wallet:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getWallet(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/WalletKt;->_wallet:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.Wallet"

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
    const/high16 v4, 0x41200000    # 10.0f

    .line 71
    .line 72
    const/high16 v6, 0x41900000    # 18.0f

    .line 73
    .line 74
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v4, 0x40c00000    # 6.0f

    .line 78
    .line 79
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 80
    .line 81
    .line 82
    const v25, -0x40133333    # -1.85f

    .line 83
    .line 84
    .line 85
    const/high16 v26, 0x3fa00000    # 1.25f

    .line 86
    .line 87
    const v21, -0x40a8f5c3    # -0.84f

    .line 88
    .line 89
    .line 90
    const/16 v22, 0x0

    .line 91
    .line 92
    const v23, -0x4039999a    # -1.55f

    .line 93
    .line 94
    .line 95
    const v24, 0x3f051eb8    # 0.52f

    .line 96
    .line 97
    .line 98
    move-object/from16 v20, v2

    .line 99
    .line 100
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 101
    .line 102
    .line 103
    const v4, 0x4131c28f    # 11.11f

    .line 104
    .line 105
    .line 106
    const v6, 0x402e147b    # 2.72f

    .line 107
    .line 108
    .line 109
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 110
    .line 111
    .line 112
    const v25, 0x3f6147ae    # 0.88f

    .line 113
    .line 114
    .line 115
    const v26, -0x41b33333    # -0.2f

    .line 116
    .line 117
    .line 118
    const v21, 0x3e9eb852    # 0.31f

    .line 119
    .line 120
    .line 121
    const v22, 0x3da3d70a    # 0.08f

    .line 122
    .line 123
    .line 124
    const v23, 0x3f23d70a    # 0.64f

    .line 125
    .line 126
    .line 127
    const/16 v24, 0x0

    .line 128
    .line 129
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 130
    .line 131
    .line 132
    const v4, 0x405f5c29    # 3.49f

    .line 133
    .line 134
    .line 135
    const v6, -0x3fc51eb8    # -2.92f

    .line 136
    .line 137
    .line 138
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 139
    .line 140
    .line 141
    const/high16 v25, 0x41900000    # 18.0f

    .line 142
    .line 143
    const/high16 v26, 0x41200000    # 10.0f

    .line 144
    .line 145
    const v21, 0x419a147b    # 19.26f

    .line 146
    .line 147
    .line 148
    const v22, 0x412570a4    # 10.34f

    .line 149
    .line 150
    .line 151
    const v23, 0x41955c29    # 18.67f

    .line 152
    .line 153
    .line 154
    const/high16 v24, 0x41200000    # 10.0f

    .line 155
    .line 156
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 157
    .line 158
    .line 159
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 160
    .line 161
    .line 162
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 163
    .line 164
    .line 165
    move-result-object v2

    .line 166
    const/16 v16, 0x3800

    .line 167
    .line 168
    const/16 v17, 0x0

    .line 169
    .line 170
    const v6, 0x3e99999a    # 0.3f

    .line 171
    .line 172
    .line 173
    const v8, 0x3e99999a    # 0.3f

    .line 174
    .line 175
    .line 176
    const/4 v7, 0x0

    .line 177
    const/high16 v9, 0x3f800000    # 1.0f

    .line 178
    .line 179
    const/high16 v12, 0x3f800000    # 1.0f

    .line 180
    .line 181
    const/4 v13, 0x0

    .line 182
    const/4 v14, 0x0

    .line 183
    const/4 v15, 0x0

    .line 184
    const-string v4, ""

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
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 196
    .line 197
    .line 198
    move-result-wide v6

    .line 199
    const/4 v2, 0x0

    .line 200
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 201
    .line 202
    .line 203
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 204
    .line 205
    .line 206
    move-result v10

    .line 207
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 208
    .line 209
    .line 210
    move-result v11

    .line 211
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 212
    .line 213
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 214
    .line 215
    .line 216
    const/high16 v4, 0x41900000    # 18.0f

    .line 217
    .line 218
    const/high16 v6, 0x40c00000    # 6.0f

    .line 219
    .line 220
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 221
    .line 222
    .line 223
    const/high16 v4, 0x40c00000    # 6.0f

    .line 224
    .line 225
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 226
    .line 227
    .line 228
    const/high16 v25, 0x40800000    # 4.0f

    .line 229
    .line 230
    const/high16 v26, 0x41000000    # 8.0f

    .line 231
    .line 232
    const v21, 0x409ccccd    # 4.9f

    .line 233
    .line 234
    .line 235
    const/high16 v22, 0x40c00000    # 6.0f

    .line 236
    .line 237
    const/high16 v23, 0x40800000    # 4.0f

    .line 238
    .line 239
    const v24, 0x40dccccd    # 6.9f

    .line 240
    .line 241
    .line 242
    move-object/from16 v20, v2

    .line 243
    .line 244
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 245
    .line 246
    .line 247
    const v4, 0x3f0ccccd    # 0.55f

    .line 248
    .line 249
    .line 250
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 251
    .line 252
    .line 253
    const/high16 v25, 0x40c00000    # 6.0f

    .line 254
    .line 255
    const v21, 0x4092e148    # 4.59f

    .line 256
    .line 257
    .line 258
    const v22, 0x41035c29    # 8.21f

    .line 259
    .line 260
    .line 261
    const v23, 0x40a8a3d7    # 5.27f

    .line 262
    .line 263
    .line 264
    const/high16 v24, 0x41000000    # 8.0f

    .line 265
    .line 266
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 267
    .line 268
    .line 269
    const/high16 v4, 0x41400000    # 12.0f

    .line 270
    .line 271
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 272
    .line 273
    .line 274
    const/high16 v25, 0x40000000    # 2.0f

    .line 275
    .line 276
    const v26, 0x3f0ccccd    # 0.55f

    .line 277
    .line 278
    .line 279
    const v21, 0x3f3ae148    # 0.73f

    .line 280
    .line 281
    .line 282
    const/16 v22, 0x0

    .line 283
    .line 284
    const v23, 0x3fb47ae1    # 1.41f

    .line 285
    .line 286
    .line 287
    const v24, 0x3e570a3d    # 0.21f

    .line 288
    .line 289
    .line 290
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 291
    .line 292
    .line 293
    const/high16 v4, 0x41000000    # 8.0f

    .line 294
    .line 295
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 296
    .line 297
    .line 298
    const/high16 v25, 0x41900000    # 18.0f

    .line 299
    .line 300
    const/high16 v26, 0x40c00000    # 6.0f

    .line 301
    .line 302
    const/high16 v21, 0x41a00000    # 20.0f

    .line 303
    .line 304
    const v22, 0x40dccccd    # 6.9f

    .line 305
    .line 306
    .line 307
    const v23, 0x4198cccd    # 19.1f

    .line 308
    .line 309
    .line 310
    const/high16 v24, 0x40c00000    # 6.0f

    .line 311
    .line 312
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 313
    .line 314
    .line 315
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 316
    .line 317
    .line 318
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 319
    .line 320
    .line 321
    move-result-object v2

    .line 322
    const v6, 0x3e99999a    # 0.3f

    .line 323
    .line 324
    .line 325
    const/4 v7, 0x0

    .line 326
    const-string v4, ""

    .line 327
    .line 328
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 329
    .line 330
    .line 331
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 332
    .line 333
    .line 334
    move-result v3

    .line 335
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 336
    .line 337
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 338
    .line 339
    .line 340
    move-result-wide v6

    .line 341
    const/4 v0, 0x0

    .line 342
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 343
    .line 344
    .line 345
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 346
    .line 347
    .line 348
    move-result v10

    .line 349
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 350
    .line 351
    .line 352
    move-result v11

    .line 353
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 354
    .line 355
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 356
    .line 357
    .line 358
    const/high16 v0, 0x40800000    # 4.0f

    .line 359
    .line 360
    const/high16 v2, 0x41900000    # 18.0f

    .line 361
    .line 362
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 363
    .line 364
    .line 365
    const/high16 v0, 0x40c00000    # 6.0f

    .line 366
    .line 367
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 368
    .line 369
    .line 370
    const/high16 v17, 0x40000000    # 2.0f

    .line 371
    .line 372
    const/high16 v18, 0x41000000    # 8.0f

    .line 373
    .line 374
    const v13, 0x40728f5c    # 3.79f

    .line 375
    .line 376
    .line 377
    const/high16 v14, 0x40800000    # 4.0f

    .line 378
    .line 379
    const/high16 v15, 0x40000000    # 2.0f

    .line 380
    .line 381
    const v16, 0x40b947ae    # 5.79f

    .line 382
    .line 383
    .line 384
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 385
    .line 386
    .line 387
    const/high16 v0, 0x41000000    # 8.0f

    .line 388
    .line 389
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 390
    .line 391
    .line 392
    const/high16 v17, 0x40800000    # 4.0f

    .line 393
    .line 394
    const/high16 v18, 0x40800000    # 4.0f

    .line 395
    .line 396
    const/4 v13, 0x0

    .line 397
    const v14, 0x400d70a4    # 2.21f

    .line 398
    .line 399
    .line 400
    const v15, 0x3fe51eb8    # 1.79f

    .line 401
    .line 402
    .line 403
    const/high16 v16, 0x40800000    # 4.0f

    .line 404
    .line 405
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 406
    .line 407
    .line 408
    const/high16 v0, 0x41400000    # 12.0f

    .line 409
    .line 410
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 411
    .line 412
    .line 413
    const/high16 v18, -0x3f800000    # -4.0f

    .line 414
    .line 415
    const v13, 0x400d70a4    # 2.21f

    .line 416
    .line 417
    .line 418
    const/4 v14, 0x0

    .line 419
    const/high16 v15, 0x40800000    # 4.0f

    .line 420
    .line 421
    const v16, -0x401ae148    # -1.79f

    .line 422
    .line 423
    .line 424
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 425
    .line 426
    .line 427
    const/high16 v0, 0x41000000    # 8.0f

    .line 428
    .line 429
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 430
    .line 431
    .line 432
    const/high16 v17, 0x41900000    # 18.0f

    .line 433
    .line 434
    const/high16 v18, 0x40800000    # 4.0f

    .line 435
    .line 436
    const/high16 v13, 0x41b00000    # 22.0f

    .line 437
    .line 438
    const v14, 0x40b947ae    # 5.79f

    .line 439
    .line 440
    .line 441
    const v15, 0x41a1ae14    # 20.21f

    .line 442
    .line 443
    .line 444
    const/high16 v16, 0x40800000    # 4.0f

    .line 445
    .line 446
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 447
    .line 448
    .line 449
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 450
    .line 451
    .line 452
    const v0, 0x415c51ec    # 13.77f

    .line 453
    .line 454
    .line 455
    const v2, 0x41811eb8    # 16.14f

    .line 456
    .line 457
    .line 458
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 459
    .line 460
    .line 461
    const v17, -0x409eb852    # -0.88f

    .line 462
    .line 463
    .line 464
    const v18, 0x3e4ccccd    # 0.2f

    .line 465
    .line 466
    .line 467
    const v13, -0x418a3d71    # -0.24f

    .line 468
    .line 469
    .line 470
    const v14, 0x3e4ccccd    # 0.2f

    .line 471
    .line 472
    .line 473
    const v15, -0x40ee147b    # -0.57f

    .line 474
    .line 475
    .line 476
    const v16, 0x3e8f5c29    # 0.28f

    .line 477
    .line 478
    .line 479
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 480
    .line 481
    .line 482
    const v0, 0x4084cccd    # 4.15f

    .line 483
    .line 484
    .line 485
    const/high16 v2, 0x41340000    # 11.25f

    .line 486
    .line 487
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 488
    .line 489
    .line 490
    const/high16 v17, 0x40c00000    # 6.0f

    .line 491
    .line 492
    const/high16 v18, 0x41200000    # 10.0f

    .line 493
    .line 494
    const v13, 0x408e6666    # 4.45f

    .line 495
    .line 496
    .line 497
    const v14, 0x412851ec    # 10.52f

    .line 498
    .line 499
    .line 500
    const v15, 0x40a51eb8    # 5.16f

    .line 501
    .line 502
    .line 503
    const/high16 v16, 0x41200000    # 10.0f

    .line 504
    .line 505
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 506
    .line 507
    .line 508
    const/high16 v0, 0x41400000    # 12.0f

    .line 509
    .line 510
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 511
    .line 512
    .line 513
    const v17, 0x3fd0a3d7    # 1.63f

    .line 514
    .line 515
    .line 516
    const v18, 0x3f570a3d    # 0.84f

    .line 517
    .line 518
    .line 519
    const v13, 0x3f2b851f    # 0.67f

    .line 520
    .line 521
    .line 522
    const/4 v14, 0x0

    .line 523
    const v15, 0x3fa147ae    # 1.26f

    .line 524
    .line 525
    .line 526
    const v16, 0x3eae147b    # 0.34f

    .line 527
    .line 528
    .line 529
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 530
    .line 531
    .line 532
    const v0, 0x415c51ec    # 13.77f

    .line 533
    .line 534
    .line 535
    const v2, 0x41811eb8    # 16.14f

    .line 536
    .line 537
    .line 538
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 539
    .line 540
    .line 541
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 542
    .line 543
    .line 544
    const/high16 v0, 0x41a00000    # 20.0f

    .line 545
    .line 546
    const v2, 0x4108cccd    # 8.55f

    .line 547
    .line 548
    .line 549
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 550
    .line 551
    .line 552
    const/high16 v17, 0x41900000    # 18.0f

    .line 553
    .line 554
    const/high16 v18, 0x41000000    # 8.0f

    .line 555
    .line 556
    const v13, 0x419b47ae    # 19.41f

    .line 557
    .line 558
    .line 559
    const v14, 0x41035c29    # 8.21f

    .line 560
    .line 561
    .line 562
    const v15, 0x4195d70a    # 18.73f

    .line 563
    .line 564
    .line 565
    const/high16 v16, 0x41000000    # 8.0f

    .line 566
    .line 567
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 568
    .line 569
    .line 570
    const/high16 v0, 0x40c00000    # 6.0f

    .line 571
    .line 572
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 573
    .line 574
    .line 575
    const/high16 v17, 0x40800000    # 4.0f

    .line 576
    .line 577
    const v18, 0x4108cccd    # 8.55f

    .line 578
    .line 579
    .line 580
    const v13, 0x40a8a3d7    # 5.27f

    .line 581
    .line 582
    .line 583
    const/high16 v14, 0x41000000    # 8.0f

    .line 584
    .line 585
    const v15, 0x4092e148    # 4.59f

    .line 586
    .line 587
    .line 588
    const v16, 0x41035c29    # 8.21f

    .line 589
    .line 590
    .line 591
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 592
    .line 593
    .line 594
    const/high16 v0, 0x41000000    # 8.0f

    .line 595
    .line 596
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 597
    .line 598
    .line 599
    const/high16 v17, 0x40000000    # 2.0f

    .line 600
    .line 601
    const/high16 v18, -0x40000000    # -2.0f

    .line 602
    .line 603
    const/4 v13, 0x0

    .line 604
    const v14, -0x40733333    # -1.1f

    .line 605
    .line 606
    .line 607
    const v15, 0x3f666666    # 0.9f

    .line 608
    .line 609
    .line 610
    const/high16 v16, -0x40000000    # -2.0f

    .line 611
    .line 612
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 613
    .line 614
    .line 615
    const/high16 v0, 0x41400000    # 12.0f

    .line 616
    .line 617
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 618
    .line 619
    .line 620
    const/high16 v18, 0x40000000    # 2.0f

    .line 621
    .line 622
    const v13, 0x3f8ccccd    # 1.1f

    .line 623
    .line 624
    .line 625
    const/4 v14, 0x0

    .line 626
    const/high16 v15, 0x40000000    # 2.0f

    .line 627
    .line 628
    const v16, 0x3f666666    # 0.9f

    .line 629
    .line 630
    .line 631
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 632
    .line 633
    .line 634
    const v0, 0x4108cccd    # 8.55f

    .line 635
    .line 636
    .line 637
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 638
    .line 639
    .line 640
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 641
    .line 642
    .line 643
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 644
    .line 645
    .line 646
    move-result-object v2

    .line 647
    const/16 v16, 0x3800

    .line 648
    .line 649
    const/16 v17, 0x0

    .line 650
    .line 651
    const/high16 v6, 0x3f800000    # 1.0f

    .line 652
    .line 653
    const/high16 v8, 0x3f800000    # 1.0f

    .line 654
    .line 655
    const/4 v7, 0x0

    .line 656
    const/high16 v12, 0x3f800000    # 1.0f

    .line 657
    .line 658
    const/4 v13, 0x0

    .line 659
    const/4 v15, 0x0

    .line 660
    const-string v4, ""

    .line 661
    .line 662
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 663
    .line 664
    .line 665
    move-result-object v0

    .line 666
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 667
    .line 668
    .line 669
    move-result-object v0

    .line 670
    sput-object v0, Landroidx/compose/material/icons/twotone/WalletKt;->_wallet:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 671
    .line 672
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 673
    .line 674
    .line 675
    return-object v0
.end method
