.class public final Landroidx/compose/material/icons/sharp/MediationKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _mediation:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getMediation(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/sharp/MediationKt;->_mediation:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Sharp.Mediation"

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
    const/high16 v0, 0x41500000    # 13.0f

    .line 71
    .line 72
    const/high16 v2, 0x41900000    # 18.0f

    .line 73
    .line 74
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const v0, -0x3f5e147b    # -5.06f

    .line 78
    .line 79
    .line 80
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 81
    .line 82
    .line 83
    const v17, -0x3f61eb85    # -4.94f

    .line 84
    .line 85
    .line 86
    const v18, 0x40e1999a    # 7.05f

    .line 87
    .line 88
    .line 89
    const v13, -0x4151eb85    # -0.34f

    .line 90
    .line 91
    .line 92
    const v14, 0x40466666    # 3.1f

    .line 93
    .line 94
    .line 95
    const v15, -0x3fef5c29    # -2.26f

    .line 96
    .line 97
    .line 98
    const v16, 0x40b70a3d    # 5.72f

    .line 99
    .line 100
    .line 101
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 102
    .line 103
    .line 104
    const/high16 v17, 0x40a00000    # 5.0f

    .line 105
    .line 106
    const/high16 v18, 0x41b80000    # 23.0f

    .line 107
    .line 108
    const v13, 0x40feb852    # 7.96f

    .line 109
    .line 110
    .line 111
    const v14, 0x41ad851f    # 21.69f

    .line 112
    .line 113
    .line 114
    const v15, 0x40d47ae1    # 6.64f

    .line 115
    .line 116
    .line 117
    const/high16 v16, 0x41b80000    # 23.0f

    .line 118
    .line 119
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 120
    .line 121
    .line 122
    const/high16 v17, -0x3fc00000    # -3.0f

    .line 123
    .line 124
    const/high16 v18, -0x3fc00000    # -3.0f

    .line 125
    .line 126
    const v13, -0x402b851f    # -1.66f

    .line 127
    .line 128
    .line 129
    const/4 v14, 0x0

    .line 130
    const/high16 v15, -0x3fc00000    # -3.0f

    .line 131
    .line 132
    const v16, -0x40547ae1    # -1.34f

    .line 133
    .line 134
    .line 135
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 136
    .line 137
    .line 138
    const/high16 v0, 0x40400000    # 3.0f

    .line 139
    .line 140
    const v2, 0x3fab851f    # 1.34f

    .line 141
    .line 142
    .line 143
    const/high16 v4, -0x3fc00000    # -3.0f

    .line 144
    .line 145
    invoke-virtual {v12, v2, v4, v0, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 146
    .line 147
    .line 148
    const v17, 0x40151eb8    # 2.33f

    .line 149
    .line 150
    .line 151
    const v18, 0x3f91eb85    # 1.14f

    .line 152
    .line 153
    .line 154
    const v13, 0x3f733333    # 0.95f

    .line 155
    .line 156
    .line 157
    const v15, 0x3fe3d70a    # 1.78f

    .line 158
    .line 159
    .line 160
    const v16, 0x3ee66666    # 0.45f

    .line 161
    .line 162
    .line 163
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 164
    .line 165
    .line 166
    const v17, 0x40651eb8    # 3.58f

    .line 167
    .line 168
    .line 169
    const v18, -0x3f5b851f    # -5.14f

    .line 170
    .line 171
    .line 172
    const v13, 0x3ff33333    # 1.9f

    .line 173
    .line 174
    .line 175
    const v14, -0x407c28f6    # -1.03f

    .line 176
    .line 177
    .line 178
    const v15, 0x4050a3d7    # 3.26f

    .line 179
    .line 180
    .line 181
    const v16, -0x3fc5c28f    # -2.91f

    .line 182
    .line 183
    .line 184
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 185
    .line 186
    .line 187
    const v0, -0x3fb9999a    # -3.1f

    .line 188
    .line 189
    .line 190
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 191
    .line 192
    .line 193
    const/high16 v17, 0x40a00000    # 5.0f

    .line 194
    .line 195
    const/high16 v18, 0x41700000    # 15.0f

    .line 196
    .line 197
    const v13, 0x40eccccd    # 7.4f

    .line 198
    .line 199
    .line 200
    const v14, 0x41628f5c    # 14.16f

    .line 201
    .line 202
    .line 203
    const v15, 0x40c9999a    # 6.3f

    .line 204
    .line 205
    .line 206
    const/high16 v16, 0x41700000    # 15.0f

    .line 207
    .line 208
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 209
    .line 210
    .line 211
    const/high16 v17, -0x3fc00000    # -3.0f

    .line 212
    .line 213
    const/high16 v18, -0x3fc00000    # -3.0f

    .line 214
    .line 215
    const v13, -0x402b851f    # -1.66f

    .line 216
    .line 217
    .line 218
    const/4 v14, 0x0

    .line 219
    const/high16 v15, -0x3fc00000    # -3.0f

    .line 220
    .line 221
    const v16, -0x40547ae1    # -1.34f

    .line 222
    .line 223
    .line 224
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 225
    .line 226
    .line 227
    const/high16 v0, 0x40400000    # 3.0f

    .line 228
    .line 229
    invoke-virtual {v12, v2, v4, v0, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 230
    .line 231
    .line 232
    const v17, 0x40347ae1    # 2.82f

    .line 233
    .line 234
    .line 235
    const/high16 v18, 0x40000000    # 2.0f

    .line 236
    .line 237
    const v13, 0x3fa66666    # 1.3f

    .line 238
    .line 239
    .line 240
    const v15, 0x4019999a    # 2.4f

    .line 241
    .line 242
    .line 243
    const v16, 0x3f570a3d    # 0.84f

    .line 244
    .line 245
    .line 246
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 247
    .line 248
    .line 249
    const v0, 0x40466666    # 3.1f

    .line 250
    .line 251
    .line 252
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 253
    .line 254
    .line 255
    const v17, 0x40ea8f5c    # 7.33f

    .line 256
    .line 257
    .line 258
    const v18, 0x40bb851f    # 5.86f

    .line 259
    .line 260
    .line 261
    const v13, 0x4129999a    # 10.6f

    .line 262
    .line 263
    .line 264
    const v14, 0x410c51ec    # 8.77f

    .line 265
    .line 266
    .line 267
    const v15, 0x4113ae14    # 9.23f

    .line 268
    .line 269
    .line 270
    const v16, 0x40dccccd    # 6.9f

    .line 271
    .line 272
    .line 273
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 274
    .line 275
    .line 276
    const/high16 v17, 0x40a00000    # 5.0f

    .line 277
    .line 278
    const/high16 v18, 0x40e00000    # 7.0f

    .line 279
    .line 280
    const v13, 0x40d8f5c3    # 6.78f

    .line 281
    .line 282
    .line 283
    const v14, 0x40d1999a    # 6.55f

    .line 284
    .line 285
    .line 286
    const v15, 0x40be6666    # 5.95f

    .line 287
    .line 288
    .line 289
    const/high16 v16, 0x40e00000    # 7.0f

    .line 290
    .line 291
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 292
    .line 293
    .line 294
    const/high16 v17, 0x40000000    # 2.0f

    .line 295
    .line 296
    const/high16 v18, 0x40800000    # 4.0f

    .line 297
    .line 298
    const v13, 0x4055c28f    # 3.34f

    .line 299
    .line 300
    .line 301
    const/high16 v14, 0x40e00000    # 7.0f

    .line 302
    .line 303
    const/high16 v15, 0x40000000    # 2.0f

    .line 304
    .line 305
    const v16, 0x40b51eb8    # 5.66f

    .line 306
    .line 307
    .line 308
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 309
    .line 310
    .line 311
    const/high16 v0, 0x40400000    # 3.0f

    .line 312
    .line 313
    invoke-virtual {v12, v2, v4, v0, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 314
    .line 315
    .line 316
    const v17, 0x403f5c29    # 2.99f

    .line 317
    .line 318
    .line 319
    const v18, 0x403ccccd    # 2.95f

    .line 320
    .line 321
    .line 322
    const v13, 0x3fd1eb85    # 1.64f

    .line 323
    .line 324
    .line 325
    const/4 v14, 0x0

    .line 326
    const v15, 0x403d70a4    # 2.96f

    .line 327
    .line 328
    .line 329
    const v16, 0x3fa7ae14    # 1.31f

    .line 330
    .line 331
    .line 332
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 333
    .line 334
    .line 335
    const v17, 0x409e147b    # 4.94f

    .line 336
    .line 337
    .line 338
    const v18, 0x40e1999a    # 7.05f

    .line 339
    .line 340
    .line 341
    const v13, 0x402b851f    # 2.68f

    .line 342
    .line 343
    .line 344
    const v14, 0x3faa3d71    # 1.33f

    .line 345
    .line 346
    .line 347
    const v15, 0x40933333    # 4.6f

    .line 348
    .line 349
    .line 350
    const v16, 0x407ccccd    # 3.95f

    .line 351
    .line 352
    .line 353
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 354
    .line 355
    .line 356
    const/high16 v0, 0x41900000    # 18.0f

    .line 357
    .line 358
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 359
    .line 360
    .line 361
    const/high16 v0, 0x41000000    # 8.0f

    .line 362
    .line 363
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 364
    .line 365
    .line 366
    const/high16 v0, 0x40800000    # 4.0f

    .line 367
    .line 368
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 369
    .line 370
    .line 371
    const/high16 v0, -0x3f800000    # -4.0f

    .line 372
    .line 373
    const/high16 v2, 0x40800000    # 4.0f

    .line 374
    .line 375
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 376
    .line 377
    .line 378
    const/high16 v0, 0x41500000    # 13.0f

    .line 379
    .line 380
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

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
    const/4 v13, 0x0

    .line 404
    const/4 v14, 0x0

    .line 405
    const/4 v15, 0x0

    .line 406
    const-string v4, ""

    .line 407
    .line 408
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 409
    .line 410
    .line 411
    move-result-object v0

    .line 412
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 413
    .line 414
    .line 415
    move-result-object v0

    .line 416
    sput-object v0, Landroidx/compose/material/icons/sharp/MediationKt;->_mediation:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 417
    .line 418
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 419
    .line 420
    .line 421
    return-object v0
.end method
