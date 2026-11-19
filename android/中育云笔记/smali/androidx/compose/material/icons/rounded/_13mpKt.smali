.class public final Landroidx/compose/material/icons/rounded/_13mpKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static __13mp:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final get_13mp(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 20

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/_13mpKt;->__13mp:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded._13mp"

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
    const/high16 v4, 0x41700000    # 15.0f

    .line 71
    .line 72
    const/high16 v6, 0x41600000    # 14.0f

    .line 73
    .line 74
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v4, 0x3fc00000    # 1.5f

    .line 78
    .line 79
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 80
    .line 81
    .line 82
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 83
    .line 84
    .line 85
    const/high16 v4, -0x40400000    # -1.5f

    .line 86
    .line 87
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 88
    .line 89
    .line 90
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 91
    .line 92
    .line 93
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 94
    .line 95
    .line 96
    move-result-object v2

    .line 97
    const/16 v16, 0x3800

    .line 98
    .line 99
    const/16 v17, 0x0

    .line 100
    .line 101
    const/high16 v6, 0x3f800000    # 1.0f

    .line 102
    .line 103
    const/high16 v8, 0x3f800000    # 1.0f

    .line 104
    .line 105
    const/4 v7, 0x0

    .line 106
    const/high16 v9, 0x3f800000    # 1.0f

    .line 107
    .line 108
    const/high16 v12, 0x3f800000    # 1.0f

    .line 109
    .line 110
    const/4 v13, 0x0

    .line 111
    const/4 v14, 0x0

    .line 112
    const/4 v15, 0x0

    .line 113
    const-string v4, ""

    .line 114
    .line 115
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 116
    .line 117
    .line 118
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 119
    .line 120
    .line 121
    move-result v3

    .line 122
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 123
    .line 124
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 125
    .line 126
    .line 127
    move-result-wide v6

    .line 128
    const/4 v0, 0x0

    .line 129
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 130
    .line 131
    .line 132
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 133
    .line 134
    .line 135
    move-result v10

    .line 136
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 137
    .line 138
    .line 139
    move-result v11

    .line 140
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 141
    .line 142
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 143
    .line 144
    .line 145
    const/high16 v0, 0x41980000    # 19.0f

    .line 146
    .line 147
    const/high16 v2, 0x40400000    # 3.0f

    .line 148
    .line 149
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 150
    .line 151
    .line 152
    const/high16 v0, 0x40a00000    # 5.0f

    .line 153
    .line 154
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 155
    .line 156
    .line 157
    const/high16 v17, 0x40400000    # 3.0f

    .line 158
    .line 159
    const/high16 v18, 0x40a00000    # 5.0f

    .line 160
    .line 161
    const v13, 0x4079999a    # 3.9f

    .line 162
    .line 163
    .line 164
    const/high16 v14, 0x40400000    # 3.0f

    .line 165
    .line 166
    const/high16 v15, 0x40400000    # 3.0f

    .line 167
    .line 168
    const v16, 0x4079999a    # 3.9f

    .line 169
    .line 170
    .line 171
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 172
    .line 173
    .line 174
    const/high16 v0, 0x41600000    # 14.0f

    .line 175
    .line 176
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 177
    .line 178
    .line 179
    const/high16 v17, 0x40000000    # 2.0f

    .line 180
    .line 181
    const/high16 v18, 0x40000000    # 2.0f

    .line 182
    .line 183
    const/4 v13, 0x0

    .line 184
    const v14, 0x3f8ccccd    # 1.1f

    .line 185
    .line 186
    .line 187
    const v15, 0x3f666666    # 0.9f

    .line 188
    .line 189
    .line 190
    const/high16 v16, 0x40000000    # 2.0f

    .line 191
    .line 192
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 193
    .line 194
    .line 195
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 196
    .line 197
    .line 198
    const/high16 v18, -0x40000000    # -2.0f

    .line 199
    .line 200
    const v13, 0x3f8ccccd    # 1.1f

    .line 201
    .line 202
    .line 203
    const/4 v14, 0x0

    .line 204
    const/high16 v15, 0x40000000    # 2.0f

    .line 205
    .line 206
    const v16, -0x4099999a    # -0.9f

    .line 207
    .line 208
    .line 209
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 210
    .line 211
    .line 212
    const/high16 v0, 0x40a00000    # 5.0f

    .line 213
    .line 214
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 215
    .line 216
    .line 217
    const/high16 v17, 0x41980000    # 19.0f

    .line 218
    .line 219
    const/high16 v18, 0x40400000    # 3.0f

    .line 220
    .line 221
    const/high16 v13, 0x41a80000    # 21.0f

    .line 222
    .line 223
    const v14, 0x4079999a    # 3.9f

    .line 224
    .line 225
    .line 226
    const v15, 0x41a0cccd    # 20.1f

    .line 227
    .line 228
    .line 229
    const/high16 v16, 0x40400000    # 3.0f

    .line 230
    .line 231
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 232
    .line 233
    .line 234
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 235
    .line 236
    .line 237
    const/high16 v0, 0x40b00000    # 5.5f

    .line 238
    .line 239
    const/high16 v2, 0x40f80000    # 7.75f

    .line 240
    .line 241
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 242
    .line 243
    .line 244
    const/high16 v0, 0x41100000    # 9.0f

    .line 245
    .line 246
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 247
    .line 248
    .line 249
    const/high16 v17, 0x3f800000    # 1.0f

    .line 250
    .line 251
    const/high16 v18, 0x3f800000    # 1.0f

    .line 252
    .line 253
    const v13, 0x3f0ccccd    # 0.55f

    .line 254
    .line 255
    .line 256
    const/4 v14, 0x0

    .line 257
    const/high16 v15, 0x3f800000    # 1.0f

    .line 258
    .line 259
    const v16, 0x3ee66666    # 0.45f

    .line 260
    .line 261
    .line 262
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 263
    .line 264
    .line 265
    const/high16 v0, 0x40880000    # 4.25f

    .line 266
    .line 267
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 268
    .line 269
    .line 270
    const/high16 v17, -0x40c00000    # -0.75f

    .line 271
    .line 272
    const/high16 v18, 0x3f400000    # 0.75f

    .line 273
    .line 274
    const/4 v13, 0x0

    .line 275
    const v14, 0x3ed1eb85    # 0.41f

    .line 276
    .line 277
    .line 278
    const v15, -0x4151eb85    # -0.34f

    .line 279
    .line 280
    .line 281
    const/high16 v16, 0x3f400000    # 0.75f

    .line 282
    .line 283
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 284
    .line 285
    .line 286
    const v0, 0x41328f5c    # 11.16f

    .line 287
    .line 288
    .line 289
    const/high16 v2, 0x412c0000    # 10.75f

    .line 290
    .line 291
    const/high16 v4, 0x41080000    # 8.5f

    .line 292
    .line 293
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 294
    .line 295
    .line 296
    const/high16 v0, 0x40e00000    # 7.0f

    .line 297
    .line 298
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 299
    .line 300
    .line 301
    const/high16 v0, 0x40f80000    # 7.75f

    .line 302
    .line 303
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 304
    .line 305
    .line 306
    const/high16 v17, 0x40e00000    # 7.0f

    .line 307
    .line 308
    const/high16 v18, 0x40c80000    # 6.25f

    .line 309
    .line 310
    const v13, 0x40eae148    # 7.34f

    .line 311
    .line 312
    .line 313
    const/high16 v14, 0x40e00000    # 7.0f

    .line 314
    .line 315
    const/high16 v15, 0x40e00000    # 7.0f

    .line 316
    .line 317
    const v16, 0x40d51eb8    # 6.66f

    .line 318
    .line 319
    .line 320
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 321
    .line 322
    .line 323
    const v0, 0x40eae148    # 7.34f

    .line 324
    .line 325
    .line 326
    const/high16 v2, 0x40b00000    # 5.5f

    .line 327
    .line 328
    const/high16 v4, 0x40f80000    # 7.75f

    .line 329
    .line 330
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 331
    .line 332
    .line 333
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 334
    .line 335
    .line 336
    const/high16 v0, 0x41480000    # 12.5f

    .line 337
    .line 338
    const/high16 v2, 0x418e0000    # 17.75f

    .line 339
    .line 340
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 341
    .line 342
    .line 343
    const/high16 v17, -0x40c00000    # -0.75f

    .line 344
    .line 345
    const/high16 v18, 0x3f400000    # 0.75f

    .line 346
    .line 347
    const/4 v13, 0x0

    .line 348
    const v14, 0x3ed1eb85    # 0.41f

    .line 349
    .line 350
    .line 351
    const v15, -0x4151eb85    # -0.34f

    .line 352
    .line 353
    .line 354
    const/high16 v16, 0x3f400000    # 0.75f

    .line 355
    .line 356
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 357
    .line 358
    .line 359
    const v0, 0x419147ae    # 18.16f

    .line 360
    .line 361
    .line 362
    const/high16 v2, 0x41300000    # 11.0f

    .line 363
    .line 364
    const/high16 v4, 0x418e0000    # 17.75f

    .line 365
    .line 366
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 367
    .line 368
    .line 369
    const/high16 v0, 0x41600000    # 14.0f

    .line 370
    .line 371
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 372
    .line 373
    .line 374
    const/high16 v0, -0x40800000    # -1.0f

    .line 375
    .line 376
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 377
    .line 378
    .line 379
    const/high16 v0, 0x40100000    # 2.25f

    .line 380
    .line 381
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 382
    .line 383
    .line 384
    const/high16 v17, 0x41140000    # 9.25f

    .line 385
    .line 386
    const/high16 v18, 0x41880000    # 17.0f

    .line 387
    .line 388
    const/high16 v13, 0x41200000    # 10.0f

    .line 389
    .line 390
    const v14, 0x418547ae    # 16.66f

    .line 391
    .line 392
    .line 393
    const v15, 0x411a8f5c    # 9.66f

    .line 394
    .line 395
    .line 396
    const/high16 v16, 0x41880000    # 17.0f

    .line 397
    .line 398
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 399
    .line 400
    .line 401
    const v0, 0x418547ae    # 16.66f

    .line 402
    .line 403
    .line 404
    const/high16 v2, 0x41820000    # 16.25f

    .line 405
    .line 406
    const/high16 v4, 0x41080000    # 8.5f

    .line 407
    .line 408
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 409
    .line 410
    .line 411
    const/high16 v0, 0x41600000    # 14.0f

    .line 412
    .line 413
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 414
    .line 415
    .line 416
    const/high16 v0, -0x40800000    # -1.0f

    .line 417
    .line 418
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 419
    .line 420
    .line 421
    const/high16 v0, 0x40700000    # 3.75f

    .line 422
    .line 423
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 424
    .line 425
    .line 426
    const/high16 v17, -0x40c00000    # -0.75f

    .line 427
    .line 428
    const/high16 v18, 0x3f400000    # 0.75f

    .line 429
    .line 430
    const/4 v13, 0x0

    .line 431
    const v14, 0x3ed1eb85    # 0.41f

    .line 432
    .line 433
    .line 434
    const v15, -0x4151eb85    # -0.34f

    .line 435
    .line 436
    .line 437
    const/high16 v16, 0x3f400000    # 0.75f

    .line 438
    .line 439
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 440
    .line 441
    .line 442
    const/high16 v0, 0x40c00000    # 6.0f

    .line 443
    .line 444
    const v2, 0x419147ae    # 18.16f

    .line 445
    .line 446
    .line 447
    const/high16 v4, 0x418e0000    # 17.75f

    .line 448
    .line 449
    invoke-virtual {v12, v0, v2, v0, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 450
    .line 451
    .line 452
    const/high16 v0, 0x41580000    # 13.5f

    .line 453
    .line 454
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 455
    .line 456
    .line 457
    const/high16 v17, 0x3f800000    # 1.0f

    .line 458
    .line 459
    const/high16 v18, -0x40800000    # -1.0f

    .line 460
    .line 461
    const v14, -0x40f33333    # -0.55f

    .line 462
    .line 463
    .line 464
    const v15, 0x3ee66666    # 0.45f

    .line 465
    .line 466
    .line 467
    const/high16 v16, -0x40800000    # -1.0f

    .line 468
    .line 469
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 470
    .line 471
    .line 472
    const/high16 v0, 0x40900000    # 4.5f

    .line 473
    .line 474
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 475
    .line 476
    .line 477
    const/high16 v18, 0x3f800000    # 1.0f

    .line 478
    .line 479
    const v13, 0x3f0ccccd    # 0.55f

    .line 480
    .line 481
    .line 482
    const/4 v14, 0x0

    .line 483
    const/high16 v15, 0x3f800000    # 1.0f

    .line 484
    .line 485
    const v16, 0x3ee66666    # 0.45f

    .line 486
    .line 487
    .line 488
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 489
    .line 490
    .line 491
    const/high16 v0, 0x418e0000    # 17.75f

    .line 492
    .line 493
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 494
    .line 495
    .line 496
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 497
    .line 498
    .line 499
    const/high16 v0, 0x41400000    # 12.0f

    .line 500
    .line 501
    const/high16 v2, 0x412c0000    # 10.75f

    .line 502
    .line 503
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 504
    .line 505
    .line 506
    const/high16 v17, 0x3f400000    # 0.75f

    .line 507
    .line 508
    const/high16 v18, -0x40c00000    # -0.75f

    .line 509
    .line 510
    const/4 v13, 0x0

    .line 511
    const v14, -0x412e147b    # -0.41f

    .line 512
    .line 513
    .line 514
    const v15, 0x3eae147b    # 0.34f

    .line 515
    .line 516
    .line 517
    const/high16 v16, -0x40c00000    # -0.75f

    .line 518
    .line 519
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 520
    .line 521
    .line 522
    const/high16 v0, 0x41700000    # 15.0f

    .line 523
    .line 524
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 525
    .line 526
    .line 527
    const/high16 v0, 0x41100000    # 9.0f

    .line 528
    .line 529
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 530
    .line 531
    .line 532
    const/high16 v0, -0x40400000    # -1.5f

    .line 533
    .line 534
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 535
    .line 536
    .line 537
    const/high16 v17, 0x41500000    # 13.0f

    .line 538
    .line 539
    const/high16 v18, 0x41080000    # 8.5f

    .line 540
    .line 541
    const v13, 0x4153851f    # 13.22f

    .line 542
    .line 543
    .line 544
    const/high16 v14, 0x41100000    # 9.0f

    .line 545
    .line 546
    const/high16 v15, 0x41500000    # 13.0f

    .line 547
    .line 548
    const v16, 0x410c7ae1    # 8.78f

    .line 549
    .line 550
    .line 551
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 552
    .line 553
    .line 554
    const v0, 0x4153851f    # 13.22f

    .line 555
    .line 556
    .line 557
    const/high16 v2, 0x41000000    # 8.0f

    .line 558
    .line 559
    const/high16 v4, 0x41580000    # 13.5f

    .line 560
    .line 561
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 562
    .line 563
    .line 564
    const/high16 v0, 0x41700000    # 15.0f

    .line 565
    .line 566
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 567
    .line 568
    .line 569
    const/high16 v0, 0x40e00000    # 7.0f

    .line 570
    .line 571
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 572
    .line 573
    .line 574
    const/high16 v0, -0x3ff00000    # -2.25f

    .line 575
    .line 576
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 577
    .line 578
    .line 579
    const/high16 v17, 0x41400000    # 12.0f

    .line 580
    .line 581
    const/high16 v18, 0x40c80000    # 6.25f

    .line 582
    .line 583
    const v13, 0x414570a4    # 12.34f

    .line 584
    .line 585
    .line 586
    const/high16 v14, 0x40e00000    # 7.0f

    .line 587
    .line 588
    const/high16 v15, 0x41400000    # 12.0f

    .line 589
    .line 590
    const v16, 0x40d51eb8    # 6.66f

    .line 591
    .line 592
    .line 593
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 594
    .line 595
    .line 596
    const v0, 0x3eae147b    # 0.34f

    .line 597
    .line 598
    .line 599
    const/high16 v2, 0x3f400000    # 0.75f

    .line 600
    .line 601
    const/high16 v4, -0x40c00000    # -0.75f

    .line 602
    .line 603
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 604
    .line 605
    .line 606
    const/high16 v0, 0x40300000    # 2.75f

    .line 607
    .line 608
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 609
    .line 610
    .line 611
    const/high16 v17, 0x3f800000    # 1.0f

    .line 612
    .line 613
    const/high16 v18, 0x3f800000    # 1.0f

    .line 614
    .line 615
    const v13, 0x3f0ccccd    # 0.55f

    .line 616
    .line 617
    .line 618
    const/4 v14, 0x0

    .line 619
    const/high16 v15, 0x3f800000    # 1.0f

    .line 620
    .line 621
    const v16, 0x3ee66666    # 0.45f

    .line 622
    .line 623
    .line 624
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 625
    .line 626
    .line 627
    const/high16 v0, 0x40800000    # 4.0f

    .line 628
    .line 629
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 630
    .line 631
    .line 632
    const/high16 v17, -0x40800000    # -1.0f

    .line 633
    .line 634
    const/4 v13, 0x0

    .line 635
    const v14, 0x3f0ccccd    # 0.55f

    .line 636
    .line 637
    .line 638
    const v15, -0x4119999a    # -0.45f

    .line 639
    .line 640
    .line 641
    const/high16 v16, 0x3f800000    # 1.0f

    .line 642
    .line 643
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 644
    .line 645
    .line 646
    const/high16 v0, -0x3fd00000    # -2.75f

    .line 647
    .line 648
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 649
    .line 650
    .line 651
    const/high16 v17, 0x41400000    # 12.0f

    .line 652
    .line 653
    const/high16 v18, 0x412c0000    # 10.75f

    .line 654
    .line 655
    const v13, 0x414570a4    # 12.34f

    .line 656
    .line 657
    .line 658
    const/high16 v14, 0x41380000    # 11.5f

    .line 659
    .line 660
    const/high16 v15, 0x41400000    # 12.0f

    .line 661
    .line 662
    const v16, 0x41328f5c    # 11.16f

    .line 663
    .line 664
    .line 665
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 666
    .line 667
    .line 668
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 669
    .line 670
    .line 671
    const/high16 v0, 0x41900000    # 18.0f

    .line 672
    .line 673
    const/high16 v2, 0x41800000    # 16.0f

    .line 674
    .line 675
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 676
    .line 677
    .line 678
    const/high16 v17, -0x40800000    # -1.0f

    .line 679
    .line 680
    const/high16 v18, 0x3f800000    # 1.0f

    .line 681
    .line 682
    const/4 v13, 0x0

    .line 683
    const v14, 0x3f0ccccd    # 0.55f

    .line 684
    .line 685
    .line 686
    const v15, -0x4119999a    # -0.45f

    .line 687
    .line 688
    .line 689
    const/high16 v16, 0x3f800000    # 1.0f

    .line 690
    .line 691
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 692
    .line 693
    .line 694
    const/high16 v0, -0x40000000    # -2.0f

    .line 695
    .line 696
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 697
    .line 698
    .line 699
    const/high16 v0, 0x3f400000    # 0.75f

    .line 700
    .line 701
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 702
    .line 703
    .line 704
    const/high16 v17, -0x40c00000    # -0.75f

    .line 705
    .line 706
    const/high16 v18, 0x3f400000    # 0.75f

    .line 707
    .line 708
    const v14, 0x3ed1eb85    # 0.41f

    .line 709
    .line 710
    .line 711
    const v15, -0x4151eb85    # -0.34f

    .line 712
    .line 713
    .line 714
    const/high16 v16, 0x3f400000    # 0.75f

    .line 715
    .line 716
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 717
    .line 718
    .line 719
    const v0, -0x4151eb85    # -0.34f

    .line 720
    .line 721
    .line 722
    const/high16 v2, -0x40c00000    # -0.75f

    .line 723
    .line 724
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 725
    .line 726
    .line 727
    const/high16 v0, 0x41580000    # 13.5f

    .line 728
    .line 729
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 730
    .line 731
    .line 732
    const/high16 v17, 0x3f800000    # 1.0f

    .line 733
    .line 734
    const/high16 v18, -0x40800000    # -1.0f

    .line 735
    .line 736
    const v14, -0x40f33333    # -0.55f

    .line 737
    .line 738
    .line 739
    const v15, 0x3ee66666    # 0.45f

    .line 740
    .line 741
    .line 742
    const/high16 v16, -0x40800000    # -1.0f

    .line 743
    .line 744
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 745
    .line 746
    .line 747
    const/high16 v0, 0x41880000    # 17.0f

    .line 748
    .line 749
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 750
    .line 751
    .line 752
    const/high16 v18, 0x3f800000    # 1.0f

    .line 753
    .line 754
    const v13, 0x3f0ccccd    # 0.55f

    .line 755
    .line 756
    .line 757
    const/4 v14, 0x0

    .line 758
    const/high16 v15, 0x3f800000    # 1.0f

    .line 759
    .line 760
    const v16, 0x3ee66666    # 0.45f

    .line 761
    .line 762
    .line 763
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 764
    .line 765
    .line 766
    const/high16 v0, 0x41800000    # 16.0f

    .line 767
    .line 768
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 769
    .line 770
    .line 771
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 772
    .line 773
    .line 774
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 775
    .line 776
    .line 777
    move-result-object v2

    .line 778
    const/16 v16, 0x3800

    .line 779
    .line 780
    const/16 v17, 0x0

    .line 781
    .line 782
    const/high16 v6, 0x3f800000    # 1.0f

    .line 783
    .line 784
    const/4 v7, 0x0

    .line 785
    const/high16 v12, 0x3f800000    # 1.0f

    .line 786
    .line 787
    const/4 v13, 0x0

    .line 788
    const/4 v15, 0x0

    .line 789
    const-string v4, ""

    .line 790
    .line 791
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 792
    .line 793
    .line 794
    move-result-object v0

    .line 795
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 796
    .line 797
    .line 798
    move-result-object v0

    .line 799
    sput-object v0, Landroidx/compose/material/icons/rounded/_13mpKt;->__13mp:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 800
    .line 801
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 802
    .line 803
    .line 804
    return-object v0
.end method
