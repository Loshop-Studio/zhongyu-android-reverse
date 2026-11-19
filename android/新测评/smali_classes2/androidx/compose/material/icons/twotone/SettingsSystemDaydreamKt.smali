.class public final Landroidx/compose/material/icons/twotone/SettingsSystemDaydreamKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_settingsSystemDaydream",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "SettingsSystemDaydream",
        "Landroidx/compose/material/icons/Icons$TwoTone;",
        "getSettingsSystemDaydream",
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
        "SMAP\nSettingsSystemDaydream.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SettingsSystemDaydream.kt\nandroidx/compose/material/icons/twotone/SettingsSystemDaydreamKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,90:1\n212#2,12:91\n233#2,18:104\n253#2:141\n233#2,18:142\n253#2:179\n174#3:103\n705#4,2:122\n717#4,2:124\n719#4,11:130\n705#4,2:160\n717#4,2:162\n719#4,11:168\n72#5,4:126\n72#5,4:164\n*S KotlinDebug\n*F\n+ 1 SettingsSystemDaydream.kt\nandroidx/compose/material/icons/twotone/SettingsSystemDaydreamKt\n*L\n29#1:91,12\n30#1:104,18\n30#1:141\n45#1:142,18\n45#1:179\n29#1:103\n30#1:122,2\n30#1:124,2\n30#1:130,11\n45#1:160,2\n45#1:162,2\n45#1:168,11\n30#1:126,4\n45#1:164,4\n*E\n"
    }
.end annotation


# static fields
.field private static _settingsSystemDaydream:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getSettingsSystemDaydream(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/SettingsSystemDaydreamKt;->_settingsSystemDaydream:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.SettingsSystemDaydream"

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
    const/high16 v4, 0x41700000    # 15.0f

    .line 71
    .line 72
    const/high16 v6, 0x41100000    # 9.0f

    .line 73
    .line 74
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v4, 0x40d00000    # 6.5f

    .line 78
    .line 79
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 80
    .line 81
    .line 82
    const/high16 v25, 0x3fc00000    # 1.5f

    .line 83
    .line 84
    const/high16 v26, -0x40400000    # -1.5f

    .line 85
    .line 86
    const v21, 0x3f547ae1    # 0.83f

    .line 87
    .line 88
    .line 89
    const/16 v22, 0x0

    .line 90
    .line 91
    const/high16 v23, 0x3fc00000    # 1.5f

    .line 92
    .line 93
    const v24, -0x40d47ae1    # -0.67f

    .line 94
    .line 95
    .line 96
    move-object/from16 v20, v2

    .line 97
    .line 98
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 99
    .line 100
    .line 101
    const v4, -0x40d47ae1    # -0.67f

    .line 102
    .line 103
    .line 104
    const/high16 v6, -0x40400000    # -1.5f

    .line 105
    .line 106
    invoke-virtual {v2, v4, v6, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 107
    .line 108
    .line 109
    const v4, -0x40a147ae    # -0.87f

    .line 110
    .line 111
    .line 112
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 113
    .line 114
    .line 115
    const v4, -0x41d1eb85    # -0.17f

    .line 116
    .line 117
    .line 118
    const v6, -0x40a3d70a    # -0.86f

    .line 119
    .line 120
    .line 121
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 122
    .line 123
    .line 124
    const/high16 v25, 0x41400000    # 12.0f

    .line 125
    .line 126
    const/high16 v26, 0x41100000    # 9.0f

    .line 127
    .line 128
    const v21, 0x4164a3d7    # 14.29f

    .line 129
    .line 130
    .line 131
    const v22, 0x411eb852    # 9.92f

    .line 132
    .line 133
    .line 134
    const v23, 0x4153ae14    # 13.23f

    .line 135
    .line 136
    .line 137
    const/high16 v24, 0x41100000    # 9.0f

    .line 138
    .line 139
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 140
    .line 141
    .line 142
    const v25, -0x3fef5c29    # -2.26f

    .line 143
    .line 144
    .line 145
    const v26, 0x3fb9999a    # 1.45f

    .line 146
    .line 147
    .line 148
    const v21, -0x408a3d71    # -0.96f

    .line 149
    .line 150
    .line 151
    const/16 v22, 0x0

    .line 152
    .line 153
    const v23, -0x40147ae1    # -1.84f

    .line 154
    .line 155
    .line 156
    const v24, 0x3f11eb85    # 0.57f

    .line 157
    .line 158
    .line 159
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 160
    .line 161
    .line 162
    const v4, -0x4175c28f    # -0.27f

    .line 163
    .line 164
    .line 165
    const v6, 0x3f11eb85    # 0.57f

    .line 166
    .line 167
    .line 168
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 169
    .line 170
    .line 171
    const v4, -0x40c51eb8    # -0.73f

    .line 172
    .line 173
    .line 174
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 175
    .line 176
    .line 177
    const/high16 v25, 0x40e00000    # 7.0f

    .line 178
    .line 179
    const/high16 v26, 0x41500000    # 13.0f

    .line 180
    .line 181
    const v21, 0x40f7ae14    # 7.74f

    .line 182
    .line 183
    .line 184
    const v22, 0x41326666    # 11.15f

    .line 185
    .line 186
    .line 187
    const/high16 v23, 0x40e00000    # 7.0f

    .line 188
    .line 189
    const v24, 0x413fd70a    # 11.99f

    .line 190
    .line 191
    .line 192
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 193
    .line 194
    .line 195
    const/high16 v25, 0x40000000    # 2.0f

    .line 196
    .line 197
    const/high16 v26, 0x40000000    # 2.0f

    .line 198
    .line 199
    const/16 v21, 0x0

    .line 200
    .line 201
    const v22, 0x3f8ccccd    # 1.1f

    .line 202
    .line 203
    .line 204
    const v23, 0x3f666666    # 0.9f

    .line 205
    .line 206
    .line 207
    const/high16 v24, 0x40000000    # 2.0f

    .line 208
    .line 209
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 210
    .line 211
    .line 212
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 213
    .line 214
    .line 215
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 216
    .line 217
    .line 218
    move-result-object v2

    .line 219
    const/16 v16, 0x3800

    .line 220
    .line 221
    const/16 v17, 0x0

    .line 222
    .line 223
    const v6, 0x3e99999a    # 0.3f

    .line 224
    .line 225
    .line 226
    const v8, 0x3e99999a    # 0.3f

    .line 227
    .line 228
    .line 229
    const/4 v7, 0x0

    .line 230
    const/high16 v9, 0x3f800000    # 1.0f

    .line 231
    .line 232
    const/high16 v12, 0x3f800000    # 1.0f

    .line 233
    .line 234
    const/4 v13, 0x0

    .line 235
    const/4 v14, 0x0

    .line 236
    const/4 v15, 0x0

    .line 237
    const-string v4, ""

    .line 238
    .line 239
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 240
    .line 241
    .line 242
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 243
    .line 244
    .line 245
    move-result v3

    .line 246
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 247
    .line 248
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 249
    .line 250
    .line 251
    move-result-wide v6

    .line 252
    const/4 v0, 0x0

    .line 253
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 254
    .line 255
    .line 256
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 257
    .line 258
    .line 259
    move-result v10

    .line 260
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 261
    .line 262
    .line 263
    move-result v11

    .line 264
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 265
    .line 266
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 267
    .line 268
    .line 269
    const/high16 v0, 0x41880000    # 17.0f

    .line 270
    .line 271
    const/high16 v2, 0x41100000    # 9.0f

    .line 272
    .line 273
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 274
    .line 275
    .line 276
    const/high16 v0, 0x40d00000    # 6.5f

    .line 277
    .line 278
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 279
    .line 280
    .line 281
    const/high16 v17, 0x40600000    # 3.5f

    .line 282
    .line 283
    const/high16 v18, -0x3fa00000    # -3.5f

    .line 284
    .line 285
    const v13, 0x3ff70a3d    # 1.93f

    .line 286
    .line 287
    .line 288
    const/high16 v15, 0x40600000    # 3.5f

    .line 289
    .line 290
    const v16, -0x40370a3d    # -1.57f

    .line 291
    .line 292
    .line 293
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 294
    .line 295
    .line 296
    const v17, -0x3fd0a3d7    # -2.74f

    .line 297
    .line 298
    .line 299
    const v18, -0x3fa5c28f    # -3.41f

    .line 300
    .line 301
    .line 302
    const/4 v13, 0x0

    .line 303
    const v14, -0x402b851f    # -1.66f

    .line 304
    .line 305
    .line 306
    const v15, -0x406b851f    # -1.16f

    .line 307
    .line 308
    .line 309
    const v16, -0x3fbccccd    # -3.05f

    .line 310
    .line 311
    .line 312
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 313
    .line 314
    .line 315
    const/high16 v17, 0x41400000    # 12.0f

    .line 316
    .line 317
    const/high16 v18, 0x40e00000    # 7.0f

    .line 318
    .line 319
    const v13, 0x417a8f5c    # 15.66f

    .line 320
    .line 321
    .line 322
    const v14, 0x41047ae1    # 8.28f

    .line 323
    .line 324
    .line 325
    const v15, 0x415f3333    # 13.95f

    .line 326
    .line 327
    .line 328
    const/high16 v16, 0x40e00000    # 7.0f

    .line 329
    .line 330
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 331
    .line 332
    .line 333
    const v17, -0x3f8e147b    # -3.78f

    .line 334
    .line 335
    .line 336
    const v18, 0x40051eb8    # 2.08f

    .line 337
    .line 338
    .line 339
    const v13, -0x403c28f6    # -1.53f

    .line 340
    .line 341
    .line 342
    const/4 v14, 0x0

    .line 343
    const v15, -0x3fc28f5c    # -2.96f

    .line 344
    .line 345
    .line 346
    const v16, 0x3f4ccccd    # 0.8f

    .line 347
    .line 348
    .line 349
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 350
    .line 351
    .line 352
    const/high16 v17, 0x40a00000    # 5.0f

    .line 353
    .line 354
    const/high16 v18, 0x41500000    # 13.0f

    .line 355
    .line 356
    const v13, 0x40cb851f    # 6.36f

    .line 357
    .line 358
    .line 359
    const v14, 0x41170a3d    # 9.44f

    .line 360
    .line 361
    .line 362
    const/high16 v15, 0x40a00000    # 5.0f

    .line 363
    .line 364
    const v16, 0x41311eb8    # 11.07f

    .line 365
    .line 366
    .line 367
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 368
    .line 369
    .line 370
    const/high16 v17, 0x40800000    # 4.0f

    .line 371
    .line 372
    const/high16 v18, 0x40800000    # 4.0f

    .line 373
    .line 374
    const/4 v13, 0x0

    .line 375
    const v14, 0x400d70a4    # 2.21f

    .line 376
    .line 377
    .line 378
    const v15, 0x3fe51eb8    # 1.79f

    .line 379
    .line 380
    .line 381
    const/high16 v16, 0x40800000    # 4.0f

    .line 382
    .line 383
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 384
    .line 385
    .line 386
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 387
    .line 388
    .line 389
    const v0, 0x410bd70a    # 8.74f

    .line 390
    .line 391
    .line 392
    const v2, 0x413051ec    # 11.02f

    .line 393
    .line 394
    .line 395
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 396
    .line 397
    .line 398
    const v0, 0x3f3d70a4    # 0.74f

    .line 399
    .line 400
    .line 401
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 402
    .line 403
    .line 404
    const v0, 0x3e8a3d71    # 0.27f

    .line 405
    .line 406
    .line 407
    const v2, -0x40ee147b    # -0.57f

    .line 408
    .line 409
    .line 410
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 411
    .line 412
    .line 413
    const/high16 v17, 0x41400000    # 12.0f

    .line 414
    .line 415
    const/high16 v18, 0x41100000    # 9.0f

    .line 416
    .line 417
    const v13, 0x41228f5c    # 10.16f

    .line 418
    .line 419
    .line 420
    const v14, 0x41191eb8    # 9.57f

    .line 421
    .line 422
    .line 423
    const v15, 0x4130a3d7    # 11.04f

    .line 424
    .line 425
    .line 426
    const/high16 v16, 0x41100000    # 9.0f

    .line 427
    .line 428
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 429
    .line 430
    .line 431
    const v17, 0x401d70a4    # 2.46f

    .line 432
    .line 433
    .line 434
    const v18, 0x4008f5c3    # 2.14f

    .line 435
    .line 436
    .line 437
    const v13, 0x3f9d70a4    # 1.23f

    .line 438
    .line 439
    .line 440
    const/4 v14, 0x0

    .line 441
    const v15, 0x40128f5c    # 2.29f

    .line 442
    .line 443
    .line 444
    const v16, 0x3f6b851f    # 0.92f

    .line 445
    .line 446
    .line 447
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 448
    .line 449
    .line 450
    const v0, 0x3e2e147b    # 0.17f

    .line 451
    .line 452
    .line 453
    const v2, 0x3f5c28f6    # 0.86f

    .line 454
    .line 455
    .line 456
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 457
    .line 458
    .line 459
    const v0, 0x3f5eb852    # 0.87f

    .line 460
    .line 461
    .line 462
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 463
    .line 464
    .line 465
    const/high16 v17, 0x3fc00000    # 1.5f

    .line 466
    .line 467
    const/high16 v18, 0x3fc00000    # 1.5f

    .line 468
    .line 469
    const v13, 0x3f547ae1    # 0.83f

    .line 470
    .line 471
    .line 472
    const/high16 v15, 0x3fc00000    # 1.5f

    .line 473
    .line 474
    const v16, 0x3f2b851f    # 0.67f

    .line 475
    .line 476
    .line 477
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 478
    .line 479
    .line 480
    const/high16 v0, 0x3fc00000    # 1.5f

    .line 481
    .line 482
    const v2, -0x40d47ae1    # -0.67f

    .line 483
    .line 484
    .line 485
    const/high16 v4, -0x40400000    # -1.5f

    .line 486
    .line 487
    invoke-virtual {v12, v2, v0, v4, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 488
    .line 489
    .line 490
    const/high16 v0, 0x41700000    # 15.0f

    .line 491
    .line 492
    const/high16 v2, 0x41100000    # 9.0f

    .line 493
    .line 494
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 495
    .line 496
    .line 497
    const/high16 v17, -0x40000000    # -2.0f

    .line 498
    .line 499
    const/high16 v18, -0x40000000    # -2.0f

    .line 500
    .line 501
    const v13, -0x40733333    # -1.1f

    .line 502
    .line 503
    .line 504
    const/high16 v15, -0x40000000    # -2.0f

    .line 505
    .line 506
    const v16, -0x4099999a    # -0.9f

    .line 507
    .line 508
    .line 509
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 510
    .line 511
    .line 512
    const v17, 0x3fdeb852    # 1.74f

    .line 513
    .line 514
    .line 515
    const v18, -0x40028f5c    # -1.98f

    .line 516
    .line 517
    .line 518
    const/4 v13, 0x0

    .line 519
    const v14, -0x407eb852    # -1.01f

    .line 520
    .line 521
    .line 522
    const v15, 0x3f3d70a4    # 0.74f

    .line 523
    .line 524
    .line 525
    const v16, -0x40133333    # -1.85f

    .line 526
    .line 527
    .line 528
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 529
    .line 530
    .line 531
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 532
    .line 533
    .line 534
    const/high16 v0, 0x41a80000    # 21.0f

    .line 535
    .line 536
    const/high16 v2, 0x40400000    # 3.0f

    .line 537
    .line 538
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 539
    .line 540
    .line 541
    const/high16 v0, 0x40400000    # 3.0f

    .line 542
    .line 543
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 544
    .line 545
    .line 546
    const/high16 v17, -0x40000000    # -2.0f

    .line 547
    .line 548
    const/high16 v18, 0x40000000    # 2.0f

    .line 549
    .line 550
    const v13, -0x40733333    # -1.1f

    .line 551
    .line 552
    .line 553
    const/4 v14, 0x0

    .line 554
    const/high16 v15, -0x40000000    # -2.0f

    .line 555
    .line 556
    const v16, 0x3f666666    # 0.9f

    .line 557
    .line 558
    .line 559
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 560
    .line 561
    .line 562
    const/high16 v0, 0x41600000    # 14.0f

    .line 563
    .line 564
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 565
    .line 566
    .line 567
    const/high16 v17, 0x40000000    # 2.0f

    .line 568
    .line 569
    const/4 v13, 0x0

    .line 570
    const v14, 0x3f8ccccd    # 1.1f

    .line 571
    .line 572
    .line 573
    const v15, 0x3f666666    # 0.9f

    .line 574
    .line 575
    .line 576
    const/high16 v16, 0x40000000    # 2.0f

    .line 577
    .line 578
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 579
    .line 580
    .line 581
    const/high16 v0, 0x41900000    # 18.0f

    .line 582
    .line 583
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 584
    .line 585
    .line 586
    const/high16 v18, -0x40000000    # -2.0f

    .line 587
    .line 588
    const v13, 0x3f8ccccd    # 1.1f

    .line 589
    .line 590
    .line 591
    const/4 v14, 0x0

    .line 592
    const/high16 v15, 0x40000000    # 2.0f

    .line 593
    .line 594
    const v16, -0x4099999a    # -0.9f

    .line 595
    .line 596
    .line 597
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 598
    .line 599
    .line 600
    const/high16 v0, 0x41b80000    # 23.0f

    .line 601
    .line 602
    const/high16 v2, 0x40a00000    # 5.0f

    .line 603
    .line 604
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 605
    .line 606
    .line 607
    const/high16 v17, -0x40000000    # -2.0f

    .line 608
    .line 609
    const/4 v13, 0x0

    .line 610
    const v14, -0x40733333    # -1.1f

    .line 611
    .line 612
    .line 613
    const v15, -0x4099999a    # -0.9f

    .line 614
    .line 615
    .line 616
    const/high16 v16, -0x40000000    # -2.0f

    .line 617
    .line 618
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 619
    .line 620
    .line 621
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 622
    .line 623
    .line 624
    const v0, 0x4198147b    # 19.01f

    .line 625
    .line 626
    .line 627
    const/high16 v2, 0x41a80000    # 21.0f

    .line 628
    .line 629
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 630
    .line 631
    .line 632
    const/high16 v2, 0x40400000    # 3.0f

    .line 633
    .line 634
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 635
    .line 636
    .line 637
    const v0, 0x409fae14    # 4.99f

    .line 638
    .line 639
    .line 640
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 641
    .line 642
    .line 643
    const/high16 v0, 0x41900000    # 18.0f

    .line 644
    .line 645
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 646
    .line 647
    .line 648
    const v0, 0x416051ec    # 14.02f

    .line 649
    .line 650
    .line 651
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 652
    .line 653
    .line 654
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 655
    .line 656
    .line 657
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 658
    .line 659
    .line 660
    move-result-object v2

    .line 661
    const/16 v16, 0x3800

    .line 662
    .line 663
    const/16 v17, 0x0

    .line 664
    .line 665
    const/high16 v6, 0x3f800000    # 1.0f

    .line 666
    .line 667
    const/high16 v8, 0x3f800000    # 1.0f

    .line 668
    .line 669
    const/4 v7, 0x0

    .line 670
    const/high16 v12, 0x3f800000    # 1.0f

    .line 671
    .line 672
    const/4 v14, 0x0

    .line 673
    const/4 v15, 0x0

    .line 674
    const-string v4, ""

    .line 675
    .line 676
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 677
    .line 678
    .line 679
    move-result-object v0

    .line 680
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 681
    .line 682
    .line 683
    move-result-object v0

    .line 684
    sput-object v0, Landroidx/compose/material/icons/twotone/SettingsSystemDaydreamKt;->_settingsSystemDaydream:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 685
    .line 686
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 687
    .line 688
    .line 689
    return-object v0
.end method
