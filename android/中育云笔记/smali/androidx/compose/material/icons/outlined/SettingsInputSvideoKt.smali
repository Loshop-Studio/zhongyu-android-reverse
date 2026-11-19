.class public final Landroidx/compose/material/icons/outlined/SettingsInputSvideoKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _settingsInputSvideo:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getSettingsInputSvideo(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/outlined/SettingsInputSvideoKt;->_settingsInputSvideo:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Outlined.SettingsInputSvideo"

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
    const/high16 v0, 0x41380000    # 11.5f

    .line 71
    .line 72
    const/high16 v2, 0x41000000    # 8.0f

    .line 73
    .line 74
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v17, -0x40400000    # -1.5f

    .line 78
    .line 79
    const/high16 v18, -0x40400000    # -1.5f

    .line 80
    .line 81
    const/4 v13, 0x0

    .line 82
    const v14, -0x40ab851f    # -0.83f

    .line 83
    .line 84
    .line 85
    const v15, -0x40d47ae1    # -0.67f

    .line 86
    .line 87
    .line 88
    const/high16 v16, -0x40400000    # -1.5f

    .line 89
    .line 90
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 91
    .line 92
    .line 93
    const v0, 0x412ab852    # 10.67f

    .line 94
    .line 95
    .line 96
    const/high16 v2, 0x40a00000    # 5.0f

    .line 97
    .line 98
    const/high16 v4, 0x41380000    # 11.5f

    .line 99
    .line 100
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 101
    .line 102
    .line 103
    const v0, 0x40b570a4    # 5.67f

    .line 104
    .line 105
    .line 106
    const/high16 v2, 0x40d00000    # 6.5f

    .line 107
    .line 108
    const/high16 v4, 0x41500000    # 13.0f

    .line 109
    .line 110
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 111
    .line 112
    .line 113
    const v0, 0x414547ae    # 12.33f

    .line 114
    .line 115
    .line 116
    const/high16 v2, 0x41380000    # 11.5f

    .line 117
    .line 118
    const/high16 v4, 0x41000000    # 8.0f

    .line 119
    .line 120
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 121
    .line 122
    .line 123
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 124
    .line 125
    .line 126
    const/high16 v0, 0x40d00000    # 6.5f

    .line 127
    .line 128
    const/high16 v2, 0x41700000    # 15.0f

    .line 129
    .line 130
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 131
    .line 132
    .line 133
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 134
    .line 135
    .line 136
    const/high16 v0, -0x3fc00000    # -3.0f

    .line 137
    .line 138
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 139
    .line 140
    .line 141
    const/high16 v17, 0x41100000    # 9.0f

    .line 142
    .line 143
    const/high16 v18, 0x40d00000    # 6.5f

    .line 144
    .line 145
    const v13, 0x411ab852    # 9.67f

    .line 146
    .line 147
    .line 148
    const/high16 v14, 0x40a00000    # 5.0f

    .line 149
    .line 150
    const/high16 v15, 0x41100000    # 9.0f

    .line 151
    .line 152
    const v16, 0x40b570a4    # 5.67f

    .line 153
    .line 154
    .line 155
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 156
    .line 157
    .line 158
    const v0, 0x411ab852    # 9.67f

    .line 159
    .line 160
    .line 161
    const/high16 v2, 0x41280000    # 10.5f

    .line 162
    .line 163
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 164
    .line 165
    .line 166
    const/high16 v0, 0x40400000    # 3.0f

    .line 167
    .line 168
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 169
    .line 170
    .line 171
    const/high16 v17, 0x3fc00000    # 1.5f

    .line 172
    .line 173
    const/high16 v18, -0x40400000    # -1.5f

    .line 174
    .line 175
    const v13, 0x3f547ae1    # 0.83f

    .line 176
    .line 177
    .line 178
    const/4 v14, 0x0

    .line 179
    const/high16 v15, 0x3fc00000    # 1.5f

    .line 180
    .line 181
    const v16, -0x40d47ae1    # -0.67f

    .line 182
    .line 183
    .line 184
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 185
    .line 186
    .line 187
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 188
    .line 189
    .line 190
    const/high16 v0, 0x41080000    # 8.5f

    .line 191
    .line 192
    const/high16 v2, 0x41700000    # 15.0f

    .line 193
    .line 194
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 195
    .line 196
    .line 197
    const/high16 v17, -0x40400000    # -1.5f

    .line 198
    .line 199
    const/high16 v18, 0x3fc00000    # 1.5f

    .line 200
    .line 201
    const v13, -0x40ab851f    # -0.83f

    .line 202
    .line 203
    .line 204
    const/high16 v15, -0x40400000    # -1.5f

    .line 205
    .line 206
    const v16, 0x3f2b851f    # 0.67f

    .line 207
    .line 208
    .line 209
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 210
    .line 211
    .line 212
    const v0, 0x40f570a4    # 7.67f

    .line 213
    .line 214
    .line 215
    const/high16 v2, 0x41900000    # 18.0f

    .line 216
    .line 217
    const/high16 v4, 0x41080000    # 8.5f

    .line 218
    .line 219
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 220
    .line 221
    .line 222
    const v0, -0x40d47ae1    # -0.67f

    .line 223
    .line 224
    .line 225
    const/high16 v2, -0x40400000    # -1.5f

    .line 226
    .line 227
    const/high16 v4, 0x3fc00000    # 1.5f

    .line 228
    .line 229
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 230
    .line 231
    .line 232
    const v0, 0x411547ae    # 9.33f

    .line 233
    .line 234
    .line 235
    const/high16 v2, 0x41080000    # 8.5f

    .line 236
    .line 237
    const/high16 v4, 0x41700000    # 15.0f

    .line 238
    .line 239
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 240
    .line 241
    .line 242
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 243
    .line 244
    .line 245
    const/high16 v0, 0x3f800000    # 1.0f

    .line 246
    .line 247
    const/high16 v2, 0x41400000    # 12.0f

    .line 248
    .line 249
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 250
    .line 251
    .line 252
    const/high16 v17, 0x3f800000    # 1.0f

    .line 253
    .line 254
    const/high16 v18, 0x41400000    # 12.0f

    .line 255
    .line 256
    const v13, 0x40bdc28f    # 5.93f

    .line 257
    .line 258
    .line 259
    const/high16 v14, 0x3f800000    # 1.0f

    .line 260
    .line 261
    const/high16 v15, 0x3f800000    # 1.0f

    .line 262
    .line 263
    const v16, 0x40bdc28f    # 5.93f

    .line 264
    .line 265
    .line 266
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 267
    .line 268
    .line 269
    const v0, 0x409dc28f    # 4.93f

    .line 270
    .line 271
    .line 272
    const/high16 v2, 0x41300000    # 11.0f

    .line 273
    .line 274
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 275
    .line 276
    .line 277
    const v0, -0x3f623d71    # -4.93f

    .line 278
    .line 279
    .line 280
    const/high16 v2, -0x3ed00000    # -11.0f

    .line 281
    .line 282
    const/high16 v4, 0x41300000    # 11.0f

    .line 283
    .line 284
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 285
    .line 286
    .line 287
    const v0, 0x41908f5c    # 18.07f

    .line 288
    .line 289
    .line 290
    const/high16 v2, 0x3f800000    # 1.0f

    .line 291
    .line 292
    const/high16 v4, 0x41400000    # 12.0f

    .line 293
    .line 294
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 295
    .line 296
    .line 297
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 298
    .line 299
    .line 300
    const/high16 v0, 0x41a80000    # 21.0f

    .line 301
    .line 302
    const/high16 v2, 0x41400000    # 12.0f

    .line 303
    .line 304
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 305
    .line 306
    .line 307
    const/high16 v17, -0x3ef00000    # -9.0f

    .line 308
    .line 309
    const/high16 v18, -0x3ef00000    # -9.0f

    .line 310
    .line 311
    const v13, -0x3f6147ae    # -4.96f

    .line 312
    .line 313
    .line 314
    const/4 v14, 0x0

    .line 315
    const/high16 v15, -0x3ef00000    # -9.0f

    .line 316
    .line 317
    const v16, -0x3f7eb852    # -4.04f

    .line 318
    .line 319
    .line 320
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 321
    .line 322
    .line 323
    const v0, 0x408147ae    # 4.04f

    .line 324
    .line 325
    .line 326
    const/high16 v2, -0x3ef00000    # -9.0f

    .line 327
    .line 328
    const/high16 v4, 0x41100000    # 9.0f

    .line 329
    .line 330
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 331
    .line 332
    .line 333
    const/high16 v2, 0x41100000    # 9.0f

    .line 334
    .line 335
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 336
    .line 337
    .line 338
    const v0, -0x3f7eb852    # -4.04f

    .line 339
    .line 340
    .line 341
    const/high16 v2, -0x3ef00000    # -9.0f

    .line 342
    .line 343
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 344
    .line 345
    .line 346
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 347
    .line 348
    .line 349
    const/high16 v0, 0x418c0000    # 17.5f

    .line 350
    .line 351
    const/high16 v2, 0x41200000    # 10.0f

    .line 352
    .line 353
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 354
    .line 355
    .line 356
    const/high16 v17, -0x40400000    # -1.5f

    .line 357
    .line 358
    const/high16 v18, 0x3fc00000    # 1.5f

    .line 359
    .line 360
    const v13, -0x40ab851f    # -0.83f

    .line 361
    .line 362
    .line 363
    const/high16 v15, -0x40400000    # -1.5f

    .line 364
    .line 365
    const v16, 0x3f2b851f    # 0.67f

    .line 366
    .line 367
    .line 368
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 369
    .line 370
    .line 371
    const v0, 0x3f2b851f    # 0.67f

    .line 372
    .line 373
    .line 374
    const/high16 v2, 0x3fc00000    # 1.5f

    .line 375
    .line 376
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 377
    .line 378
    .line 379
    const v0, -0x40d47ae1    # -0.67f

    .line 380
    .line 381
    .line 382
    const/high16 v2, -0x40400000    # -1.5f

    .line 383
    .line 384
    const/high16 v4, 0x3fc00000    # 1.5f

    .line 385
    .line 386
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 387
    .line 388
    .line 389
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 390
    .line 391
    .line 392
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 393
    .line 394
    .line 395
    const/high16 v0, 0x41780000    # 15.5f

    .line 396
    .line 397
    const/high16 v2, 0x41700000    # 15.0f

    .line 398
    .line 399
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 400
    .line 401
    .line 402
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 403
    .line 404
    .line 405
    const v0, 0x3f2b851f    # 0.67f

    .line 406
    .line 407
    .line 408
    const/high16 v2, 0x3fc00000    # 1.5f

    .line 409
    .line 410
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 411
    .line 412
    .line 413
    const v0, -0x40d47ae1    # -0.67f

    .line 414
    .line 415
    .line 416
    const/high16 v2, -0x40400000    # -1.5f

    .line 417
    .line 418
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 419
    .line 420
    .line 421
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 422
    .line 423
    .line 424
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 425
    .line 426
    .line 427
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 428
    .line 429
    .line 430
    move-result-object v2

    .line 431
    const/16 v16, 0x3800

    .line 432
    .line 433
    const/16 v17, 0x0

    .line 434
    .line 435
    const/high16 v6, 0x3f800000    # 1.0f

    .line 436
    .line 437
    const/high16 v8, 0x3f800000    # 1.0f

    .line 438
    .line 439
    const/4 v7, 0x0

    .line 440
    const/high16 v9, 0x3f800000    # 1.0f

    .line 441
    .line 442
    const/high16 v12, 0x3f800000    # 1.0f

    .line 443
    .line 444
    const/4 v13, 0x0

    .line 445
    const/4 v15, 0x0

    .line 446
    const-string v4, ""

    .line 447
    .line 448
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 449
    .line 450
    .line 451
    move-result-object v0

    .line 452
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 453
    .line 454
    .line 455
    move-result-object v0

    .line 456
    sput-object v0, Landroidx/compose/material/icons/outlined/SettingsInputSvideoKt;->_settingsInputSvideo:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 457
    .line 458
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 459
    .line 460
    .line 461
    return-object v0
.end method
