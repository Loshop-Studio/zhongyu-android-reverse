.class public final Landroidx/compose/material/icons/sharp/MicOffKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _micOff:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getMicOff(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/sharp/MicOffKt;->_micOff:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Sharp.MicOff"

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
    const v0, 0x4129999a    # 10.6f

    .line 71
    .line 72
    .line 73
    const/high16 v2, 0x41700000    # 15.0f

    .line 74
    .line 75
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    const/high16 v0, 0x40a00000    # 5.0f

    .line 79
    .line 80
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 81
    .line 82
    .line 83
    const/high16 v17, -0x3fc00000    # -3.0f

    .line 84
    .line 85
    const/high16 v18, -0x3fc00000    # -3.0f

    .line 86
    .line 87
    const/4 v13, 0x0

    .line 88
    const v14, -0x402b851f    # -1.66f

    .line 89
    .line 90
    .line 91
    const v15, -0x40547ae1    # -1.34f

    .line 92
    .line 93
    .line 94
    const/high16 v16, -0x3fc00000    # -3.0f

    .line 95
    .line 96
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 97
    .line 98
    .line 99
    const v17, -0x3fc28f5c    # -2.96f

    .line 100
    .line 101
    .line 102
    const v18, 0x4029999a    # 2.65f

    .line 103
    .line 104
    .line 105
    const v13, -0x403ae148    # -1.54f

    .line 106
    .line 107
    .line 108
    const/4 v14, 0x0

    .line 109
    const v15, -0x3fcd70a4    # -2.79f

    .line 110
    .line 111
    .line 112
    const v16, 0x3f947ae1    # 1.16f

    .line 113
    .line 114
    .line 115
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 116
    .line 117
    .line 118
    const v0, 0x4129999a    # 10.6f

    .line 119
    .line 120
    .line 121
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 122
    .line 123
    .line 124
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 125
    .line 126
    .line 127
    const/high16 v0, 0x41980000    # 19.0f

    .line 128
    .line 129
    const/high16 v2, 0x41300000    # 11.0f

    .line 130
    .line 131
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 132
    .line 133
    .line 134
    const v0, -0x40266666    # -1.7f

    .line 135
    .line 136
    .line 137
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 138
    .line 139
    .line 140
    const v17, -0x4175c28f    # -0.27f

    .line 141
    .line 142
    .line 143
    const v18, 0x3fd1eb85    # 1.64f

    .line 144
    .line 145
    .line 146
    const/4 v13, 0x0

    .line 147
    const v14, 0x3f147ae1    # 0.58f

    .line 148
    .line 149
    .line 150
    const v15, -0x42333333    # -0.1f

    .line 151
    .line 152
    .line 153
    const v16, 0x3f90a3d7    # 1.13f

    .line 154
    .line 155
    .line 156
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 157
    .line 158
    .line 159
    const v0, 0x3fa28f5c    # 1.27f

    .line 160
    .line 161
    .line 162
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 163
    .line 164
    .line 165
    const v17, 0x3f333333    # 0.7f

    .line 166
    .line 167
    .line 168
    const v18, -0x3fc5c28f    # -2.91f

    .line 169
    .line 170
    .line 171
    const v13, 0x3ee147ae    # 0.44f

    .line 172
    .line 173
    .line 174
    const v14, -0x409eb852    # -0.88f

    .line 175
    .line 176
    .line 177
    const v15, 0x3f333333    # 0.7f

    .line 178
    .line 179
    .line 180
    const v16, -0x4010a3d7    # -1.87f

    .line 181
    .line 182
    .line 183
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 184
    .line 185
    .line 186
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 187
    .line 188
    .line 189
    const v0, 0x40370a3d    # 2.86f

    .line 190
    .line 191
    .line 192
    const v2, 0x408d1eb8    # 4.41f

    .line 193
    .line 194
    .line 195
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 196
    .line 197
    .line 198
    const/high16 v0, 0x40400000    # 3.0f

    .line 199
    .line 200
    const v2, 0x4088a3d7    # 4.27f

    .line 201
    .line 202
    .line 203
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 204
    .line 205
    .line 206
    const/high16 v0, 0x40c00000    # 6.0f

    .line 207
    .line 208
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 209
    .line 210
    .line 211
    const/high16 v0, 0x41100000    # 9.0f

    .line 212
    .line 213
    const/high16 v2, 0x41300000    # 11.0f

    .line 214
    .line 215
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 216
    .line 217
    .line 218
    const/high16 v17, 0x40400000    # 3.0f

    .line 219
    .line 220
    const/high16 v18, 0x40400000    # 3.0f

    .line 221
    .line 222
    const/4 v13, 0x0

    .line 223
    const v14, 0x3fd47ae1    # 1.66f

    .line 224
    .line 225
    .line 226
    const v15, 0x3fab851f    # 1.34f

    .line 227
    .line 228
    .line 229
    const/high16 v16, 0x40400000    # 3.0f

    .line 230
    .line 231
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 232
    .line 233
    .line 234
    const v17, 0x3f266666    # 0.65f

    .line 235
    .line 236
    .line 237
    const v18, -0x425c28f6    # -0.08f

    .line 238
    .line 239
    .line 240
    const v13, 0x3e6b851f    # 0.23f

    .line 241
    .line 242
    .line 243
    const/4 v14, 0x0

    .line 244
    const v15, 0x3ee147ae    # 0.44f

    .line 245
    .line 246
    .line 247
    const v16, -0x430a3d71    # -0.03f

    .line 248
    .line 249
    .line 250
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 251
    .line 252
    .line 253
    const v0, 0x3fd47ae1    # 1.66f

    .line 254
    .line 255
    .line 256
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 257
    .line 258
    .line 259
    const v17, -0x3fec28f6    # -2.31f

    .line 260
    .line 261
    .line 262
    const v18, 0x3f051eb8    # 0.52f

    .line 263
    .line 264
    .line 265
    const v13, -0x40ca3d71    # -0.71f

    .line 266
    .line 267
    .line 268
    const v14, 0x3ea8f5c3    # 0.33f

    .line 269
    .line 270
    .line 271
    const/high16 v15, -0x40400000    # -1.5f

    .line 272
    .line 273
    const v16, 0x3f051eb8    # 0.52f

    .line 274
    .line 275
    .line 276
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 277
    .line 278
    .line 279
    const v17, -0x3f566666    # -5.3f

    .line 280
    .line 281
    .line 282
    const v18, -0x3f5ccccd    # -5.1f

    .line 283
    .line 284
    .line 285
    const v13, -0x3fcf5c29    # -2.76f

    .line 286
    .line 287
    .line 288
    const/4 v14, 0x0

    .line 289
    const v15, -0x3f566666    # -5.3f

    .line 290
    .line 291
    .line 292
    const v16, -0x3ff9999a    # -2.1f

    .line 293
    .line 294
    .line 295
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 296
    .line 297
    .line 298
    const/high16 v0, 0x40a00000    # 5.0f

    .line 299
    .line 300
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 301
    .line 302
    .line 303
    const/high16 v17, 0x40c00000    # 6.0f

    .line 304
    .line 305
    const v18, 0x40d70a3d    # 6.72f

    .line 306
    .line 307
    .line 308
    const/4 v13, 0x0

    .line 309
    const v14, 0x405a3d71    # 3.41f

    .line 310
    .line 311
    .line 312
    const v15, 0x402e147b    # 2.72f

    .line 313
    .line 314
    .line 315
    const v16, 0x40c75c29    # 6.23f

    .line 316
    .line 317
    .line 318
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 319
    .line 320
    .line 321
    const/high16 v0, 0x41a80000    # 21.0f

    .line 322
    .line 323
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 324
    .line 325
    .line 326
    const/high16 v0, 0x40000000    # 2.0f

    .line 327
    .line 328
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 329
    .line 330
    .line 331
    const v0, -0x3fae147b    # -3.28f

    .line 332
    .line 333
    .line 334
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 335
    .line 336
    .line 337
    const v17, 0x40233333    # 2.55f

    .line 338
    .line 339
    .line 340
    const v18, -0x4099999a    # -0.9f

    .line 341
    .line 342
    .line 343
    const v13, 0x3f68f5c3    # 0.91f

    .line 344
    .line 345
    .line 346
    const v14, -0x41fae148    # -0.13f

    .line 347
    .line 348
    .line 349
    const v15, 0x3fe28f5c    # 1.77f

    .line 350
    .line 351
    .line 352
    const v16, -0x4119999a    # -0.45f

    .line 353
    .line 354
    .line 355
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 356
    .line 357
    .line 358
    const v0, 0x40866666    # 4.2f

    .line 359
    .line 360
    .line 361
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 362
    .line 363
    .line 364
    const v0, 0x3fb47ae1    # 1.41f

    .line 365
    .line 366
    .line 367
    const v2, -0x404b851f    # -1.41f

    .line 368
    .line 369
    .line 370
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 371
    .line 372
    .line 373
    const v0, 0x40370a3d    # 2.86f

    .line 374
    .line 375
    .line 376
    const v2, 0x408d1eb8    # 4.41f

    .line 377
    .line 378
    .line 379
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 380
    .line 381
    .line 382
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 383
    .line 384
    .line 385
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 386
    .line 387
    .line 388
    move-result-object v2

    .line 389
    const/16 v16, 0x3800

    .line 390
    .line 391
    const/16 v17, 0x0

    .line 392
    .line 393
    const/high16 v6, 0x3f800000    # 1.0f

    .line 394
    .line 395
    const/high16 v8, 0x3f800000    # 1.0f

    .line 396
    .line 397
    const/4 v7, 0x0

    .line 398
    const/high16 v9, 0x3f800000    # 1.0f

    .line 399
    .line 400
    const/high16 v12, 0x3f800000    # 1.0f

    .line 401
    .line 402
    const/4 v13, 0x0

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
    sput-object v0, Landroidx/compose/material/icons/sharp/MicOffKt;->_micOff:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 416
    .line 417
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 418
    .line 419
    .line 420
    return-object v0
.end method
