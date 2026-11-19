.class public final Landroidx/compose/material/icons/rounded/LocalPoliceKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _localPolice:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getLocalPolice(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/LocalPoliceKt;->_localPolice:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.LocalPolice"

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
    const v0, 0x414970a4    # 12.59f

    .line 71
    .line 72
    .line 73
    const/high16 v2, 0x41680000    # 14.5f

    .line 74
    .line 75
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    const v0, 0x3f2147ae    # 0.63f

    .line 79
    .line 80
    .line 81
    const v2, 0x402eb852    # 2.73f

    .line 82
    .line 83
    .line 84
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 85
    .line 86
    .line 87
    const/high16 v17, -0x40c00000    # -0.75f

    .line 88
    .line 89
    const v18, 0x3f0a3d71    # 0.54f

    .line 90
    .line 91
    .line 92
    const v13, 0x3dcccccd    # 0.1f

    .line 93
    .line 94
    .line 95
    const v14, 0x3edc28f6    # 0.43f

    .line 96
    .line 97
    .line 98
    const v15, -0x41428f5c    # -0.37f

    .line 99
    .line 100
    .line 101
    const v16, 0x3f451eb8    # 0.77f

    .line 102
    .line 103
    .line 104
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 105
    .line 106
    .line 107
    const/high16 v0, 0x41400000    # 12.0f

    .line 108
    .line 109
    const v2, 0x4166b852    # 14.42f

    .line 110
    .line 111
    .line 112
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 113
    .line 114
    .line 115
    const v0, -0x3fe70a3d    # -2.39f

    .line 116
    .line 117
    .line 118
    const v2, 0x3fb851ec    # 1.44f

    .line 119
    .line 120
    .line 121
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 122
    .line 123
    .line 124
    const v18, -0x40f5c28f    # -0.54f

    .line 125
    .line 126
    .line 127
    const v13, -0x413d70a4    # -0.38f

    .line 128
    .line 129
    .line 130
    const v14, 0x3e6b851f    # 0.23f

    .line 131
    .line 132
    .line 133
    const v15, -0x40a66666    # -0.85f

    .line 134
    .line 135
    .line 136
    const v16, -0x421eb852    # -0.11f

    .line 137
    .line 138
    .line 139
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 140
    .line 141
    .line 142
    const/high16 v0, 0x41180000    # 9.5f

    .line 143
    .line 144
    const v2, 0x4149999a    # 12.6f

    .line 145
    .line 146
    .line 147
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 148
    .line 149
    .line 150
    const v0, -0x3ff9999a    # -2.1f

    .line 151
    .line 152
    .line 153
    const v2, -0x401851ec    # -1.81f

    .line 154
    .line 155
    .line 156
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 157
    .line 158
    .line 159
    const v17, 0x40f5c28f    # 7.68f

    .line 160
    .line 161
    .line 162
    const v18, 0x411e8f5c    # 9.91f

    .line 163
    .line 164
    .line 165
    const v13, 0x40e1eb85    # 7.06f

    .line 166
    .line 167
    .line 168
    const/high16 v14, 0x41280000    # 10.5f

    .line 169
    .line 170
    const v15, 0x40e7ae14    # 7.24f

    .line 171
    .line 172
    .line 173
    const v16, 0x411f3333    # 9.95f

    .line 174
    .line 175
    .line 176
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 177
    .line 178
    .line 179
    const v0, -0x418a3d71    # -0.24f

    .line 180
    .line 181
    .line 182
    const v2, 0x4031eb85    # 2.78f

    .line 183
    .line 184
    .line 185
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 186
    .line 187
    .line 188
    const v0, -0x3fdc28f6    # -2.56f

    .line 189
    .line 190
    .line 191
    const v2, 0x3f8a3d71    # 1.08f

    .line 192
    .line 193
    .line 194
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 195
    .line 196
    .line 197
    const v17, 0x3f6b851f    # 0.92f

    .line 198
    .line 199
    .line 200
    const/16 v18, 0x0

    .line 201
    .line 202
    const v13, 0x3e2e147b    # 0.17f

    .line 203
    .line 204
    .line 205
    const v14, -0x412e147b    # -0.41f

    .line 206
    .line 207
    .line 208
    const/high16 v15, 0x3f400000    # 0.75f

    .line 209
    .line 210
    const v16, -0x412e147b    # -0.41f

    .line 211
    .line 212
    .line 213
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 214
    .line 215
    .line 216
    const v0, 0x40233333    # 2.55f

    .line 217
    .line 218
    .line 219
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 220
    .line 221
    .line 222
    const v0, 0x3e75c28f    # 0.24f

    .line 223
    .line 224
    .line 225
    const v2, 0x4031eb85    # 2.78f

    .line 226
    .line 227
    .line 228
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 229
    .line 230
    .line 231
    const v17, 0x3e8f5c29    # 0.28f

    .line 232
    .line 233
    .line 234
    const v18, 0x3f6147ae    # 0.88f

    .line 235
    .line 236
    .line 237
    const v13, 0x3ee147ae    # 0.44f

    .line 238
    .line 239
    .line 240
    const v14, 0x3d23d70a    # 0.04f

    .line 241
    .line 242
    .line 243
    const v15, 0x3f1eb852    # 0.62f

    .line 244
    .line 245
    .line 246
    const v16, 0x3f170a3d    # 0.59f

    .line 247
    .line 248
    .line 249
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 250
    .line 251
    .line 252
    const v0, 0x414970a4    # 12.59f

    .line 253
    .line 254
    .line 255
    const/high16 v2, 0x41680000    # 14.5f

    .line 256
    .line 257
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 258
    .line 259
    .line 260
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 261
    .line 262
    .line 263
    const v0, 0x408f0a3d    # 4.47f

    .line 264
    .line 265
    .line 266
    const v2, 0x4086147b    # 4.19f

    .line 267
    .line 268
    .line 269
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 270
    .line 271
    .line 272
    const/high16 v17, 0x40400000    # 3.0f

    .line 273
    .line 274
    const v18, 0x40c9999a    # 6.3f

    .line 275
    .line 276
    .line 277
    const v13, 0x405e147b    # 3.47f

    .line 278
    .line 279
    .line 280
    const v14, 0x409947ae    # 4.79f

    .line 281
    .line 282
    .line 283
    const/high16 v15, 0x40400000    # 3.0f

    .line 284
    .line 285
    const v16, 0x40b051ec    # 5.51f

    .line 286
    .line 287
    .line 288
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 289
    .line 290
    .line 291
    const/high16 v0, 0x41300000    # 11.0f

    .line 292
    .line 293
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 294
    .line 295
    .line 296
    const/high16 v17, 0x41100000    # 9.0f

    .line 297
    .line 298
    const/high16 v18, 0x41400000    # 12.0f

    .line 299
    .line 300
    const/4 v13, 0x0

    .line 301
    const v14, 0x40b1999a    # 5.55f

    .line 302
    .line 303
    .line 304
    const v15, 0x4075c28f    # 3.84f

    .line 305
    .line 306
    .line 307
    const v16, 0x412bd70a    # 10.74f

    .line 308
    .line 309
    .line 310
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 311
    .line 312
    .line 313
    const/high16 v18, -0x3ec00000    # -12.0f

    .line 314
    .line 315
    const v13, 0x40a51eb8    # 5.16f

    .line 316
    .line 317
    .line 318
    const v14, -0x405eb852    # -1.26f

    .line 319
    .line 320
    .line 321
    const/high16 v15, 0x41100000    # 9.0f

    .line 322
    .line 323
    const v16, -0x3f31999a    # -6.45f

    .line 324
    .line 325
    .line 326
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 327
    .line 328
    .line 329
    const v0, 0x40c9999a    # 6.3f

    .line 330
    .line 331
    .line 332
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 333
    .line 334
    .line 335
    const v17, -0x4067ae14    # -1.19f

    .line 336
    .line 337
    .line 338
    const v18, -0x4015c28f    # -1.83f

    .line 339
    .line 340
    .line 341
    const/4 v13, 0x0

    .line 342
    const v14, -0x40b5c28f    # -0.79f

    .line 343
    .line 344
    .line 345
    const v15, -0x410f5c29    # -0.47f

    .line 346
    .line 347
    .line 348
    const v16, -0x403eb852    # -1.51f

    .line 349
    .line 350
    .line 351
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 352
    .line 353
    .line 354
    const/high16 v0, -0x3f200000    # -7.0f

    .line 355
    .line 356
    const v2, -0x3fb8f5c3    # -3.11f

    .line 357
    .line 358
    .line 359
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 360
    .line 361
    .line 362
    const v17, -0x4030a3d7    # -1.62f

    .line 363
    .line 364
    .line 365
    const/16 v18, 0x0

    .line 366
    .line 367
    const v13, -0x40fae148    # -0.52f

    .line 368
    .line 369
    .line 370
    const v14, -0x41947ae1    # -0.23f

    .line 371
    .line 372
    .line 373
    const v15, -0x4071eb85    # -1.11f

    .line 374
    .line 375
    .line 376
    const v16, -0x41947ae1    # -0.23f

    .line 377
    .line 378
    .line 379
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 380
    .line 381
    .line 382
    const v0, 0x408f0a3d    # 4.47f

    .line 383
    .line 384
    .line 385
    const v2, 0x4086147b    # 4.19f

    .line 386
    .line 387
    .line 388
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 389
    .line 390
    .line 391
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 392
    .line 393
    .line 394
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 395
    .line 396
    .line 397
    move-result-object v2

    .line 398
    const/16 v16, 0x3800

    .line 399
    .line 400
    const/16 v17, 0x0

    .line 401
    .line 402
    const/high16 v6, 0x3f800000    # 1.0f

    .line 403
    .line 404
    const/high16 v8, 0x3f800000    # 1.0f

    .line 405
    .line 406
    const/4 v7, 0x0

    .line 407
    const/high16 v9, 0x3f800000    # 1.0f

    .line 408
    .line 409
    const/high16 v12, 0x3f800000    # 1.0f

    .line 410
    .line 411
    const/4 v13, 0x0

    .line 412
    const/4 v14, 0x0

    .line 413
    const/4 v15, 0x0

    .line 414
    const-string v4, ""

    .line 415
    .line 416
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 417
    .line 418
    .line 419
    move-result-object v0

    .line 420
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 421
    .line 422
    .line 423
    move-result-object v0

    .line 424
    sput-object v0, Landroidx/compose/material/icons/rounded/LocalPoliceKt;->_localPolice:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 425
    .line 426
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 427
    .line 428
    .line 429
    return-object v0
.end method
