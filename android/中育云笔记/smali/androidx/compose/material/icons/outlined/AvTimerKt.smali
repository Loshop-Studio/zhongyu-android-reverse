.class public final Landroidx/compose/material/icons/outlined/AvTimerKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _avTimer:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getAvTimer(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/outlined/AvTimerKt;->_avTimer:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Outlined.AvTimer"

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
    const/high16 v0, 0x41880000    # 17.0f

    .line 71
    .line 72
    const/high16 v2, 0x41300000    # 11.0f

    .line 73
    .line 74
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v17, 0x3f800000    # 1.0f

    .line 78
    .line 79
    const/high16 v18, 0x3f800000    # 1.0f

    .line 80
    .line 81
    const/4 v13, 0x0

    .line 82
    const v14, 0x3f0ccccd    # 0.55f

    .line 83
    .line 84
    .line 85
    const v15, 0x3ee66666    # 0.45f

    .line 86
    .line 87
    .line 88
    const/high16 v16, 0x3f800000    # 1.0f

    .line 89
    .line 90
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 91
    .line 92
    .line 93
    const v0, -0x4119999a    # -0.45f

    .line 94
    .line 95
    .line 96
    const/high16 v2, 0x3f800000    # 1.0f

    .line 97
    .line 98
    const/high16 v4, -0x40800000    # -1.0f

    .line 99
    .line 100
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 101
    .line 102
    .line 103
    const/high16 v2, -0x40800000    # -1.0f

    .line 104
    .line 105
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 106
    .line 107
    .line 108
    const v0, 0x3ee66666    # 0.45f

    .line 109
    .line 110
    .line 111
    const/high16 v2, 0x3f800000    # 1.0f

    .line 112
    .line 113
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 114
    .line 115
    .line 116
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 117
    .line 118
    .line 119
    const/high16 v0, 0x40400000    # 3.0f

    .line 120
    .line 121
    const/high16 v2, 0x41300000    # 11.0f

    .line 122
    .line 123
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 124
    .line 125
    .line 126
    const/high16 v0, 0x40800000    # 4.0f

    .line 127
    .line 128
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 129
    .line 130
    .line 131
    const/high16 v0, 0x40000000    # 2.0f

    .line 132
    .line 133
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 134
    .line 135
    .line 136
    const v0, 0x40a28f5c    # 5.08f

    .line 137
    .line 138
    .line 139
    const/high16 v2, 0x41500000    # 13.0f

    .line 140
    .line 141
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 142
    .line 143
    .line 144
    const/high16 v17, 0x40c00000    # 6.0f

    .line 145
    .line 146
    const v18, 0x40dd70a4    # 6.92f

    .line 147
    .line 148
    .line 149
    const v13, 0x4058f5c3    # 3.39f

    .line 150
    .line 151
    .line 152
    const v14, 0x3efae148    # 0.49f

    .line 153
    .line 154
    .line 155
    const/high16 v15, 0x40c00000    # 6.0f

    .line 156
    .line 157
    const v16, 0x4058f5c3    # 3.39f

    .line 158
    .line 159
    .line 160
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 161
    .line 162
    .line 163
    const/high16 v17, -0x3f200000    # -7.0f

    .line 164
    .line 165
    const/high16 v18, 0x40e00000    # 7.0f

    .line 166
    .line 167
    const/4 v13, 0x0

    .line 168
    const v14, 0x4077ae14    # 3.87f

    .line 169
    .line 170
    .line 171
    const v15, -0x3fb7ae14    # -3.13f

    .line 172
    .line 173
    .line 174
    const/high16 v16, 0x40e00000    # 7.0f

    .line 175
    .line 176
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 177
    .line 178
    .line 179
    const v0, -0x3fb7ae14    # -3.13f

    .line 180
    .line 181
    .line 182
    const/high16 v2, -0x3f200000    # -7.0f

    .line 183
    .line 184
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 185
    .line 186
    .line 187
    const v17, 0x3fca3d71    # 1.58f

    .line 188
    .line 189
    .line 190
    const v18, -0x3f728f5c    # -4.42f

    .line 191
    .line 192
    .line 193
    const v14, -0x4028f5c3    # -1.68f

    .line 194
    .line 195
    .line 196
    const v15, 0x3f170a3d    # 0.59f

    .line 197
    .line 198
    .line 199
    const v16, -0x3fb1eb85    # -3.22f

    .line 200
    .line 201
    .line 202
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 203
    .line 204
    .line 205
    const/high16 v0, 0x41500000    # 13.0f

    .line 206
    .line 207
    const/high16 v2, 0x41400000    # 12.0f

    .line 208
    .line 209
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 210
    .line 211
    .line 212
    const v0, 0x3fb47ae1    # 1.41f

    .line 213
    .line 214
    .line 215
    const v2, -0x404b851f    # -1.41f

    .line 216
    .line 217
    .line 218
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 219
    .line 220
    .line 221
    const v0, -0x3f266666    # -6.8f

    .line 222
    .line 223
    .line 224
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 225
    .line 226
    .line 227
    const v0, 0x3ca3d70a    # 0.02f

    .line 228
    .line 229
    .line 230
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 231
    .line 232
    .line 233
    const/high16 v17, 0x40400000    # 3.0f

    .line 234
    .line 235
    const/high16 v18, 0x41400000    # 12.0f

    .line 236
    .line 237
    const v13, 0x408d70a4    # 4.42f

    .line 238
    .line 239
    .line 240
    const v14, 0x40ce6666    # 6.45f

    .line 241
    .line 242
    .line 243
    const/high16 v15, 0x40400000    # 3.0f

    .line 244
    .line 245
    const v16, 0x4110cccd    # 9.05f

    .line 246
    .line 247
    .line 248
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 249
    .line 250
    .line 251
    const/high16 v17, 0x41100000    # 9.0f

    .line 252
    .line 253
    const/high16 v18, 0x41100000    # 9.0f

    .line 254
    .line 255
    const/4 v13, 0x0

    .line 256
    const v14, 0x409f0a3d    # 4.97f

    .line 257
    .line 258
    .line 259
    const v15, 0x4080a3d7    # 4.02f

    .line 260
    .line 261
    .line 262
    const/high16 v16, 0x41100000    # 9.0f

    .line 263
    .line 264
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 265
    .line 266
    .line 267
    const/high16 v18, -0x3ef00000    # -9.0f

    .line 268
    .line 269
    const v13, 0x409f0a3d    # 4.97f

    .line 270
    .line 271
    .line 272
    const/4 v14, 0x0

    .line 273
    const/high16 v15, 0x41100000    # 9.0f

    .line 274
    .line 275
    const v16, -0x3f7f0a3d    # -4.03f

    .line 276
    .line 277
    .line 278
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 279
    .line 280
    .line 281
    const v0, -0x3f7f0a3d    # -4.03f

    .line 282
    .line 283
    .line 284
    const/high16 v2, -0x3ef00000    # -9.0f

    .line 285
    .line 286
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 287
    .line 288
    .line 289
    const/high16 v0, -0x40800000    # -1.0f

    .line 290
    .line 291
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 292
    .line 293
    .line 294
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 295
    .line 296
    .line 297
    const/high16 v0, 0x41900000    # 18.0f

    .line 298
    .line 299
    const/high16 v2, 0x41400000    # 12.0f

    .line 300
    .line 301
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 302
    .line 303
    .line 304
    const/high16 v17, -0x40800000    # -1.0f

    .line 305
    .line 306
    const/high16 v18, -0x40800000    # -1.0f

    .line 307
    .line 308
    const/4 v13, 0x0

    .line 309
    const v14, -0x40f33333    # -0.55f

    .line 310
    .line 311
    .line 312
    const v15, -0x4119999a    # -0.45f

    .line 313
    .line 314
    .line 315
    const/high16 v16, -0x40800000    # -1.0f

    .line 316
    .line 317
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 318
    .line 319
    .line 320
    const v0, 0x3ee66666    # 0.45f

    .line 321
    .line 322
    .line 323
    const/high16 v2, 0x3f800000    # 1.0f

    .line 324
    .line 325
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 326
    .line 327
    .line 328
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 329
    .line 330
    .line 331
    const v0, -0x4119999a    # -0.45f

    .line 332
    .line 333
    .line 334
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 335
    .line 336
    .line 337
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 338
    .line 339
    .line 340
    const/high16 v0, 0x40c00000    # 6.0f

    .line 341
    .line 342
    const/high16 v2, 0x41400000    # 12.0f

    .line 343
    .line 344
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 345
    .line 346
    .line 347
    const/high16 v17, 0x3f800000    # 1.0f

    .line 348
    .line 349
    const/high16 v18, 0x3f800000    # 1.0f

    .line 350
    .line 351
    const v14, 0x3f0ccccd    # 0.55f

    .line 352
    .line 353
    .line 354
    const v15, 0x3ee66666    # 0.45f

    .line 355
    .line 356
    .line 357
    const/high16 v16, 0x3f800000    # 1.0f

    .line 358
    .line 359
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 360
    .line 361
    .line 362
    const v0, -0x4119999a    # -0.45f

    .line 363
    .line 364
    .line 365
    const/high16 v2, 0x3f800000    # 1.0f

    .line 366
    .line 367
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 368
    .line 369
    .line 370
    const/high16 v2, -0x40800000    # -1.0f

    .line 371
    .line 372
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 373
    .line 374
    .line 375
    const v0, 0x3ee66666    # 0.45f

    .line 376
    .line 377
    .line 378
    const/high16 v2, 0x3f800000    # 1.0f

    .line 379
    .line 380
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 381
    .line 382
    .line 383
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 384
    .line 385
    .line 386
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 387
    .line 388
    .line 389
    move-result-object v2

    .line 390
    const/16 v16, 0x3800

    .line 391
    .line 392
    const/16 v17, 0x0

    .line 393
    .line 394
    const/high16 v6, 0x3f800000    # 1.0f

    .line 395
    .line 396
    const/high16 v8, 0x3f800000    # 1.0f

    .line 397
    .line 398
    const/4 v7, 0x0

    .line 399
    const/high16 v9, 0x3f800000    # 1.0f

    .line 400
    .line 401
    const/high16 v12, 0x3f800000    # 1.0f

    .line 402
    .line 403
    const/4 v14, 0x0

    .line 404
    const/4 v15, 0x0

    .line 405
    const-string v4, ""

    .line 406
    .line 407
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 408
    .line 409
    .line 410
    move-result-object v0

    .line 411
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 412
    .line 413
    .line 414
    move-result-object v0

    .line 415
    sput-object v0, Landroidx/compose/material/icons/outlined/AvTimerKt;->_avTimer:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 416
    .line 417
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 418
    .line 419
    .line 420
    return-object v0
.end method
