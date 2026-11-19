.class public final Landroidx/compose/material/icons/outlined/FireExtinguisherKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _fireExtinguisher:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getFireExtinguisher(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/outlined/FireExtinguisherKt;->_fireExtinguisher:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Outlined.FireExtinguisher"

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
    const/high16 v0, 0x41980000    # 19.0f

    .line 71
    .line 72
    const/high16 v2, 0x40e00000    # 7.0f

    .line 73
    .line 74
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v0, 0x41200000    # 10.0f

    .line 78
    .line 79
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 80
    .line 81
    .line 82
    const/high16 v0, 0x3f800000    # 1.0f

    .line 83
    .line 84
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 85
    .line 86
    .line 87
    const/high16 v17, -0x40000000    # -2.0f

    .line 88
    .line 89
    const/high16 v18, 0x40000000    # 2.0f

    .line 90
    .line 91
    const/4 v13, 0x0

    .line 92
    const v14, 0x3f8ccccd    # 1.1f

    .line 93
    .line 94
    .line 95
    const v15, -0x4099999a    # -0.9f

    .line 96
    .line 97
    .line 98
    const/high16 v16, 0x40000000    # 2.0f

    .line 99
    .line 100
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 101
    .line 102
    .line 103
    const/high16 v0, 0x41100000    # 9.0f

    .line 104
    .line 105
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 106
    .line 107
    .line 108
    const/high16 v18, -0x40000000    # -2.0f

    .line 109
    .line 110
    const v13, -0x40733333    # -1.1f

    .line 111
    .line 112
    .line 113
    const/4 v14, 0x0

    .line 114
    const/high16 v15, -0x40000000    # -2.0f

    .line 115
    .line 116
    const v16, -0x4099999a    # -0.9f

    .line 117
    .line 118
    .line 119
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 120
    .line 121
    .line 122
    const/high16 v0, 0x41980000    # 19.0f

    .line 123
    .line 124
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 125
    .line 126
    .line 127
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 128
    .line 129
    .line 130
    const/high16 v0, 0x41900000    # 18.0f

    .line 131
    .line 132
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 133
    .line 134
    .line 135
    const/high16 v0, 0x41200000    # 10.0f

    .line 136
    .line 137
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 138
    .line 139
    .line 140
    const/high16 v0, -0x3f600000    # -5.0f

    .line 141
    .line 142
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 143
    .line 144
    .line 145
    const/high16 v0, 0x40e00000    # 7.0f

    .line 146
    .line 147
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 148
    .line 149
    .line 150
    const/high16 v0, 0x41900000    # 18.0f

    .line 151
    .line 152
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 153
    .line 154
    .line 155
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 156
    .line 157
    .line 158
    const/high16 v0, 0x40400000    # 3.0f

    .line 159
    .line 160
    const/high16 v2, 0x41880000    # 17.0f

    .line 161
    .line 162
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 163
    .line 164
    .line 165
    const/high16 v0, 0x40c00000    # 6.0f

    .line 166
    .line 167
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 168
    .line 169
    .line 170
    const v0, -0x3fb66666    # -3.15f

    .line 171
    .line 172
    .line 173
    const v2, -0x40d70a3d    # -0.66f

    .line 174
    .line 175
    .line 176
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 177
    .line 178
    .line 179
    const v17, -0x435c28f6    # -0.02f

    .line 180
    .line 181
    .line 182
    const v18, 0x3ca3d70a    # 0.02f

    .line 183
    .line 184
    .line 185
    const v13, -0x43dc28f6    # -0.01f

    .line 186
    .line 187
    .line 188
    const v15, -0x43dc28f6    # -0.01f

    .line 189
    .line 190
    .line 191
    const v16, 0x3c23d70a    # 0.01f

    .line 192
    .line 193
    .line 194
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 195
    .line 196
    .line 197
    const v17, 0x40447ae1    # 3.07f

    .line 198
    .line 199
    .line 200
    const v18, 0x4068f5c3    # 3.64f

    .line 201
    .line 202
    .line 203
    const v13, 0x3fc66666    # 1.55f

    .line 204
    .line 205
    .line 206
    const v14, 0x3f1eb852    # 0.62f

    .line 207
    .line 208
    .line 209
    const v15, 0x402e147b    # 2.72f

    .line 210
    .line 211
    .line 212
    const v16, 0x3ffd70a4    # 1.98f

    .line 213
    .line 214
    .line 215
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 216
    .line 217
    .line 218
    const v0, 0x40e33333    # 7.1f

    .line 219
    .line 220
    .line 221
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 222
    .line 223
    .line 224
    const v18, -0x3f970a3d    # -3.64f

    .line 225
    .line 226
    .line 227
    const v13, 0x3eae147b    # 0.34f

    .line 228
    .line 229
    .line 230
    const v14, -0x402b851f    # -1.66f

    .line 231
    .line 232
    .line 233
    const v15, 0x3fc28f5c    # 1.52f

    .line 234
    .line 235
    .line 236
    const v16, -0x3fbeb852    # -3.02f

    .line 237
    .line 238
    .line 239
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 240
    .line 241
    .line 242
    const v17, -0x40b33333    # -0.8f

    .line 243
    .line 244
    .line 245
    const v18, -0x408ccccd    # -0.95f

    .line 246
    .line 247
    .line 248
    const v13, -0x41570a3d    # -0.33f

    .line 249
    .line 250
    .line 251
    const v14, -0x417ae148    # -0.26f

    .line 252
    .line 253
    .line 254
    const v15, -0x40e66666    # -0.6f

    .line 255
    .line 256
    .line 257
    const v16, -0x40eb851f    # -0.58f

    .line 258
    .line 259
    .line 260
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 261
    .line 262
    .line 263
    const/high16 v0, 0x40a00000    # 5.0f

    .line 264
    .line 265
    const/high16 v2, 0x40d00000    # 6.5f

    .line 266
    .line 267
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 268
    .line 269
    .line 270
    const/high16 v0, -0x40800000    # -1.0f

    .line 271
    .line 272
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 273
    .line 274
    .line 275
    const v0, 0x408bd70a    # 4.37f

    .line 276
    .line 277
    .line 278
    const v2, -0x40970a3d    # -0.91f

    .line 279
    .line 280
    .line 281
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 282
    .line 283
    .line 284
    const/high16 v17, 0x41400000    # 12.0f

    .line 285
    .line 286
    const/high16 v18, 0x40400000    # 3.0f

    .line 287
    .line 288
    const v13, 0x411deb85    # 9.87f

    .line 289
    .line 290
    .line 291
    const v14, 0x4069999a    # 3.65f

    .line 292
    .line 293
    .line 294
    const v15, 0x412dc28f    # 10.86f

    .line 295
    .line 296
    .line 297
    const/high16 v16, 0x40400000    # 3.0f

    .line 298
    .line 299
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 300
    .line 301
    .line 302
    const v17, 0x3feccccd    # 1.85f

    .line 303
    .line 304
    .line 305
    const v18, 0x3f28f5c3    # 0.66f

    .line 306
    .line 307
    .line 308
    const v13, 0x3f333333    # 0.7f

    .line 309
    .line 310
    .line 311
    const/4 v14, 0x0

    .line 312
    const v15, 0x3fab851f    # 1.34f

    .line 313
    .line 314
    .line 315
    const/high16 v16, 0x3e800000    # 0.25f

    .line 316
    .line 317
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 318
    .line 319
    .line 320
    const/high16 v0, 0x40400000    # 3.0f

    .line 321
    .line 322
    const/high16 v2, 0x41880000    # 17.0f

    .line 323
    .line 324
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 325
    .line 326
    .line 327
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 328
    .line 329
    .line 330
    const/high16 v0, 0x41500000    # 13.0f

    .line 331
    .line 332
    const/high16 v2, 0x40c00000    # 6.0f

    .line 333
    .line 334
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 335
    .line 336
    .line 337
    const/high16 v17, -0x40800000    # -1.0f

    .line 338
    .line 339
    const/high16 v18, -0x40800000    # -1.0f

    .line 340
    .line 341
    const v13, -0x430a3d71    # -0.03f

    .line 342
    .line 343
    .line 344
    const v14, -0x40e8f5c3    # -0.59f

    .line 345
    .line 346
    .line 347
    const v15, -0x4119999a    # -0.45f

    .line 348
    .line 349
    .line 350
    const/high16 v16, -0x40800000    # -1.0f

    .line 351
    .line 352
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 353
    .line 354
    .line 355
    const v0, 0x3ee66666    # 0.45f

    .line 356
    .line 357
    .line 358
    const/high16 v2, -0x40800000    # -1.0f

    .line 359
    .line 360
    const/high16 v4, 0x3f800000    # 1.0f

    .line 361
    .line 362
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 363
    .line 364
    .line 365
    const/high16 v2, 0x3f800000    # 1.0f

    .line 366
    .line 367
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 368
    .line 369
    .line 370
    const v0, 0x40d1999a    # 6.55f

    .line 371
    .line 372
    .line 373
    const/high16 v2, 0x41500000    # 13.0f

    .line 374
    .line 375
    const/high16 v4, 0x40c00000    # 6.0f

    .line 376
    .line 377
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 378
    .line 379
    .line 380
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 381
    .line 382
    .line 383
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 384
    .line 385
    .line 386
    move-result-object v2

    .line 387
    const/16 v16, 0x3800

    .line 388
    .line 389
    const/16 v17, 0x0

    .line 390
    .line 391
    const/high16 v6, 0x3f800000    # 1.0f

    .line 392
    .line 393
    const/high16 v8, 0x3f800000    # 1.0f

    .line 394
    .line 395
    const/4 v7, 0x0

    .line 396
    const/high16 v9, 0x3f800000    # 1.0f

    .line 397
    .line 398
    const/high16 v12, 0x3f800000    # 1.0f

    .line 399
    .line 400
    const/4 v13, 0x0

    .line 401
    const/4 v14, 0x0

    .line 402
    const/4 v15, 0x0

    .line 403
    const-string v4, ""

    .line 404
    .line 405
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 406
    .line 407
    .line 408
    move-result-object v0

    .line 409
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 410
    .line 411
    .line 412
    move-result-object v0

    .line 413
    sput-object v0, Landroidx/compose/material/icons/outlined/FireExtinguisherKt;->_fireExtinguisher:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 414
    .line 415
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 416
    .line 417
    .line 418
    return-object v0
.end method
