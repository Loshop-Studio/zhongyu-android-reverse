.class public final Landroidx/compose/material/icons/sharp/AirlineSeatReclineNormalKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _airlineSeatReclineNormal:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getAirlineSeatReclineNormal(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/sharp/AirlineSeatReclineNormalKt;->_airlineSeatReclineNormal:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Sharp.AirlineSeatReclineNormal"

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
    const v0, 0x40f2e148    # 7.59f

    .line 71
    .line 72
    .line 73
    const v2, 0x40ad1eb8    # 5.41f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const/16 v17, 0x0

    .line 80
    .line 81
    const v18, -0x3fcae148    # -2.83f

    .line 82
    .line 83
    .line 84
    const v13, -0x40b851ec    # -0.78f

    .line 85
    .line 86
    .line 87
    const v14, -0x40b851ec    # -0.78f

    .line 88
    .line 89
    .line 90
    const v15, -0x40b851ec    # -0.78f

    .line 91
    .line 92
    .line 93
    const v16, -0x3ffccccd    # -2.05f

    .line 94
    .line 95
    .line 96
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 97
    .line 98
    .line 99
    const v0, -0x40b851ec    # -0.78f

    .line 100
    .line 101
    .line 102
    const/4 v2, 0x0

    .line 103
    const v4, 0x40351eb8    # 2.83f

    .line 104
    .line 105
    .line 106
    const v6, 0x40033333    # 2.05f

    .line 107
    .line 108
    .line 109
    invoke-virtual {v12, v6, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 110
    .line 111
    .line 112
    const v0, 0x3f47ae14    # 0.78f

    .line 113
    .line 114
    .line 115
    invoke-virtual {v12, v0, v6, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 116
    .line 117
    .line 118
    const v17, -0x3fcae148    # -2.83f

    .line 119
    .line 120
    .line 121
    const/16 v18, 0x0

    .line 122
    .line 123
    const v13, -0x40b5c28f    # -0.79f

    .line 124
    .line 125
    .line 126
    const v14, 0x3f4a3d71    # 0.79f

    .line 127
    .line 128
    .line 129
    const v15, -0x3ffccccd    # -2.05f

    .line 130
    .line 131
    .line 132
    const v16, 0x3f4a3d71    # 0.79f

    .line 133
    .line 134
    .line 135
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 136
    .line 137
    .line 138
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 139
    .line 140
    .line 141
    const/high16 v0, 0x41980000    # 19.0f

    .line 142
    .line 143
    const/high16 v2, 0x40c00000    # 6.0f

    .line 144
    .line 145
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 146
    .line 147
    .line 148
    const/high16 v0, 0x40e00000    # 7.0f

    .line 149
    .line 150
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 151
    .line 152
    .line 153
    const/high16 v0, 0x40800000    # 4.0f

    .line 154
    .line 155
    const/high16 v2, 0x40e00000    # 7.0f

    .line 156
    .line 157
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 158
    .line 159
    .line 160
    const/high16 v0, 0x41600000    # 14.0f

    .line 161
    .line 162
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 163
    .line 164
    .line 165
    const/high16 v0, 0x41300000    # 11.0f

    .line 166
    .line 167
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 168
    .line 169
    .line 170
    const/high16 v0, -0x40000000    # -2.0f

    .line 171
    .line 172
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 173
    .line 174
    .line 175
    const/high16 v0, 0x41980000    # 19.0f

    .line 176
    .line 177
    const/high16 v2, 0x40c00000    # 6.0f

    .line 178
    .line 179
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 180
    .line 181
    .line 182
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 183
    .line 184
    .line 185
    const v0, 0x41a08f5c    # 20.07f

    .line 186
    .line 187
    .line 188
    const/high16 v2, 0x41a00000    # 20.0f

    .line 189
    .line 190
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 191
    .line 192
    .line 193
    const v0, 0x416ee148    # 14.93f

    .line 194
    .line 195
    .line 196
    const/high16 v2, 0x41700000    # 15.0f

    .line 197
    .line 198
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 199
    .line 200
    .line 201
    const/high16 v0, 0x41380000    # 11.5f

    .line 202
    .line 203
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 204
    .line 205
    .line 206
    const v0, -0x3f947ae1    # -3.68f

    .line 207
    .line 208
    .line 209
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 210
    .line 211
    .line 212
    const/high16 v17, 0x40b00000    # 5.5f

    .line 213
    .line 214
    const v18, 0x400a3d71    # 2.16f

    .line 215
    .line 216
    .line 217
    const v13, 0x3fb33333    # 1.4f

    .line 218
    .line 219
    .line 220
    const v14, 0x3f933333    # 1.15f

    .line 221
    .line 222
    .line 223
    const v15, 0x40666666    # 3.6f

    .line 224
    .line 225
    .line 226
    const v16, 0x400a3d71    # 2.16f

    .line 227
    .line 228
    .line 229
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 230
    .line 231
    .line 232
    const v0, -0x3ff5c28f    # -2.16f

    .line 233
    .line 234
    .line 235
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 236
    .line 237
    .line 238
    const v17, -0x3f6a8f5c    # -4.67f

    .line 239
    .line 240
    .line 241
    const v18, -0x3ffd70a4    # -2.04f

    .line 242
    .line 243
    .line 244
    const v13, -0x402b851f    # -1.66f

    .line 245
    .line 246
    .line 247
    const v14, 0x3ca3d70a    # 0.02f

    .line 248
    .line 249
    .line 250
    const v15, -0x3f98f5c3    # -3.61f

    .line 251
    .line 252
    .line 253
    const v16, -0x40a147ae    # -0.87f

    .line 254
    .line 255
    .line 256
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 257
    .line 258
    .line 259
    const v0, -0x404ccccd    # -1.4f

    .line 260
    .line 261
    .line 262
    const v2, -0x4039999a    # -1.55f

    .line 263
    .line 264
    .line 265
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 266
    .line 267
    .line 268
    const v17, -0x40cf5c29    # -0.69f

    .line 269
    .line 270
    .line 271
    const/high16 v18, -0x41000000    # -0.5f

    .line 272
    .line 273
    const v13, -0x41bd70a4    # -0.19f

    .line 274
    .line 275
    .line 276
    const v14, -0x41a8f5c3    # -0.21f

    .line 277
    .line 278
    .line 279
    const v15, -0x4123d70a    # -0.43f

    .line 280
    .line 281
    .line 282
    const v16, -0x413d70a4    # -0.38f

    .line 283
    .line 284
    .line 285
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 286
    .line 287
    .line 288
    const v17, -0x408a3d71    # -0.96f

    .line 289
    .line 290
    .line 291
    const v18, -0x41947ae1    # -0.23f

    .line 292
    .line 293
    .line 294
    const v13, -0x416b851f    # -0.29f

    .line 295
    .line 296
    .line 297
    const v14, -0x41f0a3d7    # -0.14f

    .line 298
    .line 299
    .line 300
    const v15, -0x40e147ae    # -0.62f

    .line 301
    .line 302
    .line 303
    const v16, -0x41947ae1    # -0.23f

    .line 304
    .line 305
    .line 306
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 307
    .line 308
    .line 309
    const v0, -0x430a3d71    # -0.03f

    .line 310
    .line 311
    .line 312
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 313
    .line 314
    .line 315
    const/high16 v17, 0x40e00000    # 7.0f

    .line 316
    .line 317
    const/high16 v18, 0x41140000    # 9.25f

    .line 318
    .line 319
    const v13, 0x410028f6    # 8.01f

    .line 320
    .line 321
    .line 322
    const/high16 v14, 0x40e00000    # 7.0f

    .line 323
    .line 324
    const/high16 v15, 0x40e00000    # 7.0f

    .line 325
    .line 326
    const v16, 0x410028f6    # 8.01f

    .line 327
    .line 328
    .line 329
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 330
    .line 331
    .line 332
    const/high16 v0, 0x41900000    # 18.0f

    .line 333
    .line 334
    const/high16 v2, 0x40e00000    # 7.0f

    .line 335
    .line 336
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 337
    .line 338
    .line 339
    const v0, 0x41011eb8    # 8.07f

    .line 340
    .line 341
    .line 342
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 343
    .line 344
    .line 345
    const/high16 v0, 0x40600000    # 3.5f

    .line 346
    .line 347
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 348
    .line 349
    .line 350
    const v0, 0x41a08f5c    # 20.07f

    .line 351
    .line 352
    .line 353
    const/high16 v2, 0x41a00000    # 20.0f

    .line 354
    .line 355
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 356
    .line 357
    .line 358
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 359
    .line 360
    .line 361
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 362
    .line 363
    .line 364
    move-result-object v2

    .line 365
    const/16 v16, 0x3800

    .line 366
    .line 367
    const/16 v17, 0x0

    .line 368
    .line 369
    const/high16 v6, 0x3f800000    # 1.0f

    .line 370
    .line 371
    const/high16 v8, 0x3f800000    # 1.0f

    .line 372
    .line 373
    const/4 v7, 0x0

    .line 374
    const/high16 v9, 0x3f800000    # 1.0f

    .line 375
    .line 376
    const/high16 v12, 0x3f800000    # 1.0f

    .line 377
    .line 378
    const/4 v13, 0x0

    .line 379
    const/4 v14, 0x0

    .line 380
    const/4 v15, 0x0

    .line 381
    const-string v4, ""

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
    sput-object v0, Landroidx/compose/material/icons/sharp/AirlineSeatReclineNormalKt;->_airlineSeatReclineNormal:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 392
    .line 393
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 394
    .line 395
    .line 396
    return-object v0
.end method
