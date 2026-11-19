.class public final Landroidx/compose/material/icons/rounded/SettingsSystemDaydreamKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _settingsSystemDaydream:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getSettingsSystemDaydream(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/SettingsSystemDaydreamKt;->_settingsSystemDaydream:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.SettingsSystemDaydream"

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
    const/4 v0, 0x0

    .line 50
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 51
    .line 52
    .line 53
    sget-object v0, Landroidx/compose/ui/graphics/StrokeCap;->Companion:Landroidx/compose/ui/graphics/StrokeCap$Companion;

    .line 54
    .line 55
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 56
    .line 57
    .line 58
    move-result v10

    .line 59
    sget-object v0, Landroidx/compose/ui/graphics/StrokeJoin;->Companion:Landroidx/compose/ui/graphics/StrokeJoin$Companion;

    .line 60
    .line 61
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 62
    .line 63
    .line 64
    move-result v11

    .line 65
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 66
    .line 67
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 68
    .line 69
    .line 70
    const/high16 v0, 0x41100000    # 9.0f

    .line 71
    .line 72
    const/high16 v2, 0x41800000    # 16.0f

    .line 73
    .line 74
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v0, 0x40d00000    # 6.5f

    .line 78
    .line 79
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 80
    .line 81
    .line 82
    const/high16 v17, 0x40200000    # 2.5f

    .line 83
    .line 84
    const/high16 v18, -0x3fe00000    # -2.5f

    .line 85
    .line 86
    const v13, 0x3fb0a3d7    # 1.38f

    .line 87
    .line 88
    .line 89
    const/4 v14, 0x0

    .line 90
    const/high16 v15, 0x40200000    # 2.5f

    .line 91
    .line 92
    const v16, -0x4070a3d7    # -1.12f

    .line 93
    .line 94
    .line 95
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 96
    .line 97
    .line 98
    const v0, 0x41870a3d    # 16.88f

    .line 99
    .line 100
    .line 101
    const/high16 v2, 0x41780000    # 15.5f

    .line 102
    .line 103
    const/high16 v4, 0x41300000    # 11.0f

    .line 104
    .line 105
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 106
    .line 107
    .line 108
    const v0, -0x42b33333    # -0.05f

    .line 109
    .line 110
    .line 111
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 112
    .line 113
    .line 114
    const v17, -0x3fa33333    # -3.45f

    .line 115
    .line 116
    .line 117
    const/high16 v18, -0x3fc00000    # -3.0f

    .line 118
    .line 119
    const v13, -0x418a3d71    # -0.24f

    .line 120
    .line 121
    .line 122
    const v14, -0x4027ae14    # -1.69f

    .line 123
    .line 124
    .line 125
    const v15, -0x4027ae14    # -1.69f

    .line 126
    .line 127
    .line 128
    const/high16 v16, -0x3fc00000    # -3.0f

    .line 129
    .line 130
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 131
    .line 132
    .line 133
    const v17, -0x3fb5c28f    # -3.16f

    .line 134
    .line 135
    .line 136
    const v18, 0x400147ae    # 2.02f

    .line 137
    .line 138
    .line 139
    const v13, -0x404ccccd    # -1.4f

    .line 140
    .line 141
    .line 142
    const/4 v14, 0x0

    .line 143
    const v15, -0x3fd9999a    # -2.6f

    .line 144
    .line 145
    .line 146
    const v16, 0x3f547ae1    # 0.83f

    .line 147
    .line 148
    .line 149
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 150
    .line 151
    .line 152
    const v0, -0x41dc28f6    # -0.16f

    .line 153
    .line 154
    .line 155
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 156
    .line 157
    .line 158
    const/high16 v17, 0x40c00000    # 6.0f

    .line 159
    .line 160
    const/high16 v18, 0x41500000    # 13.0f

    .line 161
    .line 162
    const v13, 0x40e570a4    # 7.17f

    .line 163
    .line 164
    .line 165
    const v14, 0x4122e148    # 10.18f

    .line 166
    .line 167
    .line 168
    const/high16 v15, 0x40c00000    # 6.0f

    .line 169
    .line 170
    const v16, 0x41373333    # 11.45f

    .line 171
    .line 172
    .line 173
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 174
    .line 175
    .line 176
    const/high16 v17, 0x40400000    # 3.0f

    .line 177
    .line 178
    const/high16 v18, 0x40400000    # 3.0f

    .line 179
    .line 180
    const/4 v13, 0x0

    .line 181
    const v14, 0x3fd47ae1    # 1.66f

    .line 182
    .line 183
    .line 184
    const v15, 0x3fab851f    # 1.34f

    .line 185
    .line 186
    .line 187
    const/high16 v16, 0x40400000    # 3.0f

    .line 188
    .line 189
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 190
    .line 191
    .line 192
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 193
    .line 194
    .line 195
    const/high16 v0, 0x41a80000    # 21.0f

    .line 196
    .line 197
    const/high16 v2, 0x40400000    # 3.0f

    .line 198
    .line 199
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 200
    .line 201
    .line 202
    const/high16 v0, 0x40400000    # 3.0f

    .line 203
    .line 204
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 205
    .line 206
    .line 207
    const/high16 v17, -0x40000000    # -2.0f

    .line 208
    .line 209
    const/high16 v18, 0x40000000    # 2.0f

    .line 210
    .line 211
    const v13, -0x40733333    # -1.1f

    .line 212
    .line 213
    .line 214
    const/4 v14, 0x0

    .line 215
    const/high16 v15, -0x40000000    # -2.0f

    .line 216
    .line 217
    const v16, 0x3f666666    # 0.9f

    .line 218
    .line 219
    .line 220
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 221
    .line 222
    .line 223
    const/high16 v0, 0x41600000    # 14.0f

    .line 224
    .line 225
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 226
    .line 227
    .line 228
    const/high16 v17, 0x40000000    # 2.0f

    .line 229
    .line 230
    const/4 v13, 0x0

    .line 231
    const v14, 0x3f8ccccd    # 1.1f

    .line 232
    .line 233
    .line 234
    const v15, 0x3f666666    # 0.9f

    .line 235
    .line 236
    .line 237
    const/high16 v16, 0x40000000    # 2.0f

    .line 238
    .line 239
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 240
    .line 241
    .line 242
    const/high16 v0, 0x41900000    # 18.0f

    .line 243
    .line 244
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 245
    .line 246
    .line 247
    const/high16 v18, -0x40000000    # -2.0f

    .line 248
    .line 249
    const v13, 0x3f8ccccd    # 1.1f

    .line 250
    .line 251
    .line 252
    const/4 v14, 0x0

    .line 253
    const/high16 v15, 0x40000000    # 2.0f

    .line 254
    .line 255
    const v16, -0x4099999a    # -0.9f

    .line 256
    .line 257
    .line 258
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 259
    .line 260
    .line 261
    const/high16 v0, 0x41b80000    # 23.0f

    .line 262
    .line 263
    const/high16 v2, 0x40a00000    # 5.0f

    .line 264
    .line 265
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 266
    .line 267
    .line 268
    const/high16 v17, -0x40000000    # -2.0f

    .line 269
    .line 270
    const/4 v13, 0x0

    .line 271
    const v14, -0x40733333    # -1.1f

    .line 272
    .line 273
    .line 274
    const v15, -0x4099999a    # -0.9f

    .line 275
    .line 276
    .line 277
    const/high16 v16, -0x40000000    # -2.0f

    .line 278
    .line 279
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 280
    .line 281
    .line 282
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 283
    .line 284
    .line 285
    const/high16 v0, 0x41a00000    # 20.0f

    .line 286
    .line 287
    const v2, 0x4198147b    # 19.01f

    .line 288
    .line 289
    .line 290
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 291
    .line 292
    .line 293
    const/high16 v0, 0x40800000    # 4.0f

    .line 294
    .line 295
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 296
    .line 297
    .line 298
    const/high16 v17, -0x40800000    # -1.0f

    .line 299
    .line 300
    const/high16 v18, -0x40800000    # -1.0f

    .line 301
    .line 302
    const v13, -0x40f33333    # -0.55f

    .line 303
    .line 304
    .line 305
    const/4 v14, 0x0

    .line 306
    const/high16 v15, -0x40800000    # -1.0f

    .line 307
    .line 308
    const v16, -0x4119999a    # -0.45f

    .line 309
    .line 310
    .line 311
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 312
    .line 313
    .line 314
    const v0, 0x40bfae14    # 5.99f

    .line 315
    .line 316
    .line 317
    const/high16 v2, 0x40400000    # 3.0f

    .line 318
    .line 319
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 320
    .line 321
    .line 322
    const/high16 v17, 0x3f800000    # 1.0f

    .line 323
    .line 324
    const/4 v13, 0x0

    .line 325
    const v14, -0x40f33333    # -0.55f

    .line 326
    .line 327
    .line 328
    const v15, 0x3ee66666    # 0.45f

    .line 329
    .line 330
    .line 331
    const/high16 v16, -0x40800000    # -1.0f

    .line 332
    .line 333
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 334
    .line 335
    .line 336
    const/high16 v0, 0x41800000    # 16.0f

    .line 337
    .line 338
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 339
    .line 340
    .line 341
    const/high16 v18, 0x3f800000    # 1.0f

    .line 342
    .line 343
    const v13, 0x3f0ccccd    # 0.55f

    .line 344
    .line 345
    .line 346
    const/4 v14, 0x0

    .line 347
    const/high16 v15, 0x3f800000    # 1.0f

    .line 348
    .line 349
    const v16, 0x3ee66666    # 0.45f

    .line 350
    .line 351
    .line 352
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 353
    .line 354
    .line 355
    const v0, 0x414051ec    # 12.02f

    .line 356
    .line 357
    .line 358
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 359
    .line 360
    .line 361
    const/high16 v17, -0x40800000    # -1.0f

    .line 362
    .line 363
    const/4 v13, 0x0

    .line 364
    const v14, 0x3f0ccccd    # 0.55f

    .line 365
    .line 366
    .line 367
    const v15, -0x4119999a    # -0.45f

    .line 368
    .line 369
    .line 370
    const/high16 v16, 0x3f800000    # 1.0f

    .line 371
    .line 372
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 373
    .line 374
    .line 375
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 376
    .line 377
    .line 378
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 379
    .line 380
    .line 381
    move-result-object v2

    .line 382
    const/16 v16, 0x3800

    .line 383
    .line 384
    const/16 v17, 0x0

    .line 385
    .line 386
    const/high16 v6, 0x3f800000    # 1.0f

    .line 387
    .line 388
    const/high16 v8, 0x3f800000    # 1.0f

    .line 389
    .line 390
    const/4 v7, 0x0

    .line 391
    const/high16 v9, 0x3f800000    # 1.0f

    .line 392
    .line 393
    const/high16 v12, 0x3f800000    # 1.0f

    .line 394
    .line 395
    const/4 v14, 0x0

    .line 396
    const/4 v15, 0x0

    .line 397
    const-string v4, ""

    .line 398
    .line 399
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 400
    .line 401
    .line 402
    move-result-object v0

    .line 403
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 404
    .line 405
    .line 406
    move-result-object v0

    .line 407
    sput-object v0, Landroidx/compose/material/icons/rounded/SettingsSystemDaydreamKt;->_settingsSystemDaydream:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 408
    .line 409
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 410
    .line 411
    .line 412
    return-object v0
.end method
