.class public final Landroidx/compose/material/icons/sharp/WifiProtectedSetupKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _wifiProtectedSetup:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getWifiProtectedSetup(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/sharp/WifiProtectedSetupKt;->_wifiProtectedSetup:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

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
    const-string v2, "Sharp.WifiProtectedSetup"

    .line 33
    .line 34
    invoke-direct/range {v1 .. v12}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;-><init>(Ljava/lang/String;FFFFJIZILkotlin/jvm/internal/n;)V

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
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

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
    const v4, 0x4185ae14    # 16.71f

    .line 71
    .line 72
    .line 73
    const v6, 0x40a947ae    # 5.29f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const/high16 v4, 0x41980000    # 19.0f

    .line 80
    .line 81
    const/high16 v6, 0x40400000    # 3.0f

    .line 82
    .line 83
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 84
    .line 85
    .line 86
    const/high16 v4, -0x3f000000    # -8.0f

    .line 87
    .line 88
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 89
    .line 90
    .line 91
    const/high16 v4, 0x41000000    # 8.0f

    .line 92
    .line 93
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 94
    .line 95
    .line 96
    const v4, -0x3feccccd    # -2.3f

    .line 97
    .line 98
    .line 99
    const v6, 0x40133333    # 2.3f

    .line 100
    .line 101
    .line 102
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 103
    .line 104
    .line 105
    const/high16 v25, 0x40500000    # 3.25f

    .line 106
    .line 107
    const v26, 0x40cd70a4    # 6.42f

    .line 108
    .line 109
    .line 110
    const v21, 0x3ffc28f6    # 1.97f

    .line 111
    .line 112
    .line 113
    const v22, 0x3fbae148    # 1.46f

    .line 114
    .line 115
    .line 116
    const/high16 v23, 0x40500000    # 3.25f

    .line 117
    .line 118
    const v24, 0x4071eb85    # 3.78f

    .line 119
    .line 120
    .line 121
    move-object/from16 v20, v2

    .line 122
    .line 123
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 124
    .line 125
    .line 126
    const v25, -0x409eb852    # -0.88f

    .line 127
    .line 128
    .line 129
    const v26, 0x406851ec    # 3.63f

    .line 130
    .line 131
    .line 132
    const/16 v21, 0x0

    .line 133
    .line 134
    const v22, 0x3fa7ae14    # 1.31f

    .line 135
    .line 136
    .line 137
    const v23, -0x415c28f6    # -0.32f

    .line 138
    .line 139
    .line 140
    const v24, 0x40228f5c    # 2.54f

    .line 141
    .line 142
    .line 143
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 144
    .line 145
    .line 146
    const v25, 0x407851ec    # 3.88f

    .line 147
    .line 148
    .line 149
    const v26, -0x3f1bd70a    # -7.13f

    .line 150
    .line 151
    .line 152
    const v21, 0x40151eb8    # 2.33f

    .line 153
    .line 154
    .line 155
    const v22, -0x403d70a4    # -1.52f

    .line 156
    .line 157
    .line 158
    const v23, 0x407851ec    # 3.88f

    .line 159
    .line 160
    .line 161
    const v24, -0x3f7b851f    # -4.14f

    .line 162
    .line 163
    .line 164
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 165
    .line 166
    .line 167
    const v25, 0x4185ae14    # 16.71f

    .line 168
    .line 169
    .line 170
    const v26, 0x40a947ae    # 5.29f

    .line 171
    .line 172
    .line 173
    const v21, 0x419c6666    # 19.55f

    .line 174
    .line 175
    .line 176
    const v22, 0x4111999a    # 9.1f

    .line 177
    .line 178
    .line 179
    const v23, 0x4193851f    # 18.44f

    .line 180
    .line 181
    .line 182
    const v24, 0x40db3333    # 6.85f

    .line 183
    .line 184
    .line 185
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 186
    .line 187
    .line 188
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 189
    .line 190
    .line 191
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 192
    .line 193
    .line 194
    move-result-object v2

    .line 195
    const/16 v16, 0x3800

    .line 196
    .line 197
    const/16 v17, 0x0

    .line 198
    .line 199
    const/high16 v6, 0x3f800000    # 1.0f

    .line 200
    .line 201
    const/high16 v8, 0x3f800000    # 1.0f

    .line 202
    .line 203
    const/4 v7, 0x0

    .line 204
    const/high16 v9, 0x3f800000    # 1.0f

    .line 205
    .line 206
    const/high16 v12, 0x3f800000    # 1.0f

    .line 207
    .line 208
    const/4 v13, 0x0

    .line 209
    const/4 v14, 0x0

    .line 210
    const/4 v15, 0x0

    .line 211
    const-string v4, ""

    .line 212
    .line 213
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 214
    .line 215
    .line 216
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 217
    .line 218
    .line 219
    move-result v3

    .line 220
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 221
    .line 222
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 223
    .line 224
    .line 225
    move-result-wide v6

    .line 226
    const/4 v0, 0x0

    .line 227
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 228
    .line 229
    .line 230
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 231
    .line 232
    .line 233
    move-result v10

    .line 234
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 235
    .line 236
    .line 237
    move-result v11

    .line 238
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 239
    .line 240
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 241
    .line 242
    .line 243
    const v0, 0x40eeb852    # 7.46f

    .line 244
    .line 245
    .line 246
    const v2, 0x410e147b    # 8.88f

    .line 247
    .line 248
    .line 249
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 250
    .line 251
    .line 252
    const v17, 0x3f6147ae    # 0.88f

    .line 253
    .line 254
    .line 255
    const v18, -0x3f97ae14    # -3.63f

    .line 256
    .line 257
    .line 258
    const v14, -0x405851ec    # -1.31f

    .line 259
    .line 260
    .line 261
    const v15, 0x3ea3d70a    # 0.32f

    .line 262
    .line 263
    .line 264
    const v16, -0x3fdd70a4    # -2.54f

    .line 265
    .line 266
    .line 267
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 268
    .line 269
    .line 270
    const v17, 0x408eb852    # 4.46f

    .line 271
    .line 272
    .line 273
    const v18, 0x4146147b    # 12.38f

    .line 274
    .line 275
    .line 276
    const/high16 v13, 0x40c00000    # 6.0f

    .line 277
    .line 278
    const v14, 0x40d8a3d7    # 6.77f

    .line 279
    .line 280
    .line 281
    const v15, 0x408eb852    # 4.46f

    .line 282
    .line 283
    .line 284
    const v16, 0x41163d71    # 9.39f

    .line 285
    .line 286
    .line 287
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 288
    .line 289
    .line 290
    const v17, 0x4035c28f    # 2.84f

    .line 291
    .line 292
    .line 293
    const v18, 0x40ca8f5c    # 6.33f

    .line 294
    .line 295
    .line 296
    const/4 v13, 0x0

    .line 297
    const v14, 0x402147ae    # 2.52f

    .line 298
    .line 299
    .line 300
    const v15, 0x3f8ccccd    # 1.1f

    .line 301
    .line 302
    .line 303
    const v16, 0x4098a3d7    # 4.77f

    .line 304
    .line 305
    .line 306
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 307
    .line 308
    .line 309
    const/high16 v0, 0x40a00000    # 5.0f

    .line 310
    .line 311
    const/high16 v2, 0x41a80000    # 21.0f

    .line 312
    .line 313
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 314
    .line 315
    .line 316
    const/high16 v0, 0x41000000    # 8.0f

    .line 317
    .line 318
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 319
    .line 320
    .line 321
    const/high16 v0, -0x3f000000    # -8.0f

    .line 322
    .line 323
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 324
    .line 325
    .line 326
    const v0, -0x3feccccd    # -2.3f

    .line 327
    .line 328
    .line 329
    const v2, 0x40133333    # 2.3f

    .line 330
    .line 331
    .line 332
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 333
    .line 334
    .line 335
    const v17, 0x40eeb852    # 7.46f

    .line 336
    .line 337
    .line 338
    const v18, 0x410e147b    # 8.88f

    .line 339
    .line 340
    .line 341
    const v13, 0x410bd70a    # 8.74f

    .line 342
    .line 343
    .line 344
    const v14, 0x415d70a4    # 13.84f

    .line 345
    .line 346
    .line 347
    const v15, 0x40eeb852    # 7.46f

    .line 348
    .line 349
    .line 350
    const v16, 0x413851ec    # 11.52f

    .line 351
    .line 352
    .line 353
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 354
    .line 355
    .line 356
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 357
    .line 358
    .line 359
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 360
    .line 361
    .line 362
    move-result-object v2

    .line 363
    const/16 v16, 0x3800

    .line 364
    .line 365
    const/16 v17, 0x0

    .line 366
    .line 367
    const/high16 v6, 0x3f800000    # 1.0f

    .line 368
    .line 369
    const/4 v7, 0x0

    .line 370
    const/high16 v12, 0x3f800000    # 1.0f

    .line 371
    .line 372
    const/4 v13, 0x0

    .line 373
    const/4 v14, 0x0

    .line 374
    const/4 v15, 0x0

    .line 375
    const-string v4, ""

    .line 376
    .line 377
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 378
    .line 379
    .line 380
    move-result-object v0

    .line 381
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 382
    .line 383
    .line 384
    move-result-object v0

    .line 385
    sput-object v0, Landroidx/compose/material/icons/sharp/WifiProtectedSetupKt;->_wifiProtectedSetup:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 386
    .line 387
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 388
    .line 389
    .line 390
    return-object v0
.end method
