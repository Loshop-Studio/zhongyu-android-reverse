.class public final Landroidx/compose/material/icons/twotone/_2kKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static __2k:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final get_2k(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/_2kKt;->__2k:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone._2k"

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
    const/high16 v4, 0x41980000    # 19.0f

    .line 71
    .line 72
    const/high16 v6, 0x40a00000    # 5.0f

    .line 73
    .line 74
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v4, 0x41600000    # 14.0f

    .line 78
    .line 79
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 80
    .line 81
    .line 82
    const/high16 v4, 0x40a00000    # 5.0f

    .line 83
    .line 84
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 85
    .line 86
    .line 87
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 88
    .line 89
    .line 90
    const/high16 v4, 0x41980000    # 19.0f

    .line 91
    .line 92
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 93
    .line 94
    .line 95
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 96
    .line 97
    .line 98
    const/high16 v4, 0x41500000    # 13.0f

    .line 99
    .line 100
    const/high16 v6, 0x41100000    # 9.0f

    .line 101
    .line 102
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 103
    .line 104
    .line 105
    const/high16 v4, 0x3fc00000    # 1.5f

    .line 106
    .line 107
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 108
    .line 109
    .line 110
    const/high16 v4, 0x40100000    # 2.25f

    .line 111
    .line 112
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 113
    .line 114
    .line 115
    const/high16 v4, 0x41820000    # 16.25f

    .line 116
    .line 117
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 118
    .line 119
    .line 120
    const/high16 v4, 0x41900000    # 18.0f

    .line 121
    .line 122
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 123
    .line 124
    .line 125
    const/high16 v4, 0x40400000    # 3.0f

    .line 126
    .line 127
    const/high16 v6, -0x3ff00000    # -2.25f

    .line 128
    .line 129
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 130
    .line 131
    .line 132
    const/high16 v4, 0x41900000    # 18.0f

    .line 133
    .line 134
    const/high16 v6, 0x41700000    # 15.0f

    .line 135
    .line 136
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 137
    .line 138
    .line 139
    const/high16 v4, -0x40200000    # -1.75f

    .line 140
    .line 141
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 142
    .line 143
    .line 144
    const/high16 v6, -0x3ff00000    # -2.25f

    .line 145
    .line 146
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 147
    .line 148
    .line 149
    const/high16 v4, 0x41700000    # 15.0f

    .line 150
    .line 151
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 152
    .line 153
    .line 154
    const/high16 v4, 0x41500000    # 13.0f

    .line 155
    .line 156
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 157
    .line 158
    .line 159
    const/high16 v4, 0x41100000    # 9.0f

    .line 160
    .line 161
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 162
    .line 163
    .line 164
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 165
    .line 166
    .line 167
    const/high16 v4, 0x41480000    # 12.5f

    .line 168
    .line 169
    const/high16 v6, 0x40d00000    # 6.5f

    .line 170
    .line 171
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 172
    .line 173
    .line 174
    const/high16 v25, 0x3f800000    # 1.0f

    .line 175
    .line 176
    const/high16 v26, -0x40800000    # -1.0f

    .line 177
    .line 178
    const/16 v21, 0x0

    .line 179
    .line 180
    const v22, -0x40f33333    # -0.55f

    .line 181
    .line 182
    .line 183
    const v23, 0x3ee66666    # 0.45f

    .line 184
    .line 185
    .line 186
    const/high16 v24, -0x40800000    # -1.0f

    .line 187
    .line 188
    move-object/from16 v20, v2

    .line 189
    .line 190
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 191
    .line 192
    .line 193
    const/high16 v4, 0x40000000    # 2.0f

    .line 194
    .line 195
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 196
    .line 197
    .line 198
    const/high16 v4, -0x40800000    # -1.0f

    .line 199
    .line 200
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 201
    .line 202
    .line 203
    const/high16 v4, -0x3fc00000    # -3.0f

    .line 204
    .line 205
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 206
    .line 207
    .line 208
    const/high16 v4, 0x41100000    # 9.0f

    .line 209
    .line 210
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 211
    .line 212
    .line 213
    const/high16 v4, 0x41200000    # 10.0f

    .line 214
    .line 215
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 216
    .line 217
    .line 218
    const/high16 v26, 0x3f800000    # 1.0f

    .line 219
    .line 220
    const v21, 0x3f0ccccd    # 0.55f

    .line 221
    .line 222
    .line 223
    const/16 v22, 0x0

    .line 224
    .line 225
    const/high16 v23, 0x3f800000    # 1.0f

    .line 226
    .line 227
    const v24, 0x3ee66666    # 0.45f

    .line 228
    .line 229
    .line 230
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 231
    .line 232
    .line 233
    const/high16 v4, 0x3fc00000    # 1.5f

    .line 234
    .line 235
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 236
    .line 237
    .line 238
    const/high16 v25, -0x40800000    # -1.0f

    .line 239
    .line 240
    const/16 v21, 0x0

    .line 241
    .line 242
    const v22, 0x3f0ccccd    # 0.55f

    .line 243
    .line 244
    .line 245
    const v23, -0x4119999a    # -0.45f

    .line 246
    .line 247
    .line 248
    const/high16 v24, 0x3f800000    # 1.0f

    .line 249
    .line 250
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 251
    .line 252
    .line 253
    const/high16 v4, 0x41000000    # 8.0f

    .line 254
    .line 255
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 256
    .line 257
    .line 258
    const/high16 v4, 0x3f800000    # 1.0f

    .line 259
    .line 260
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 261
    .line 262
    .line 263
    const/high16 v4, 0x40400000    # 3.0f

    .line 264
    .line 265
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 266
    .line 267
    .line 268
    const/high16 v4, 0x41700000    # 15.0f

    .line 269
    .line 270
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 271
    .line 272
    .line 273
    const/high16 v4, 0x40d00000    # 6.5f

    .line 274
    .line 275
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 276
    .line 277
    .line 278
    const/high16 v4, 0x41480000    # 12.5f

    .line 279
    .line 280
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 281
    .line 282
    .line 283
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 284
    .line 285
    .line 286
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 287
    .line 288
    .line 289
    move-result-object v2

    .line 290
    const/16 v16, 0x3800

    .line 291
    .line 292
    const/16 v17, 0x0

    .line 293
    .line 294
    const v6, 0x3e99999a    # 0.3f

    .line 295
    .line 296
    .line 297
    const v8, 0x3e99999a    # 0.3f

    .line 298
    .line 299
    .line 300
    const/4 v7, 0x0

    .line 301
    const/high16 v9, 0x3f800000    # 1.0f

    .line 302
    .line 303
    const/high16 v12, 0x3f800000    # 1.0f

    .line 304
    .line 305
    const/4 v13, 0x0

    .line 306
    const/4 v14, 0x0

    .line 307
    const/4 v15, 0x0

    .line 308
    const-string v4, ""

    .line 309
    .line 310
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 311
    .line 312
    .line 313
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 314
    .line 315
    .line 316
    move-result v3

    .line 317
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 318
    .line 319
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 320
    .line 321
    .line 322
    move-result-wide v6

    .line 323
    const/4 v2, 0x0

    .line 324
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 325
    .line 326
    .line 327
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 328
    .line 329
    .line 330
    move-result v10

    .line 331
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 332
    .line 333
    .line 334
    move-result v11

    .line 335
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 336
    .line 337
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 338
    .line 339
    .line 340
    const/high16 v4, 0x40400000    # 3.0f

    .line 341
    .line 342
    const/high16 v6, 0x41980000    # 19.0f

    .line 343
    .line 344
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 345
    .line 346
    .line 347
    const/high16 v4, 0x40a00000    # 5.0f

    .line 348
    .line 349
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 350
    .line 351
    .line 352
    const/high16 v25, 0x40400000    # 3.0f

    .line 353
    .line 354
    const/high16 v26, 0x40a00000    # 5.0f

    .line 355
    .line 356
    const v21, 0x4079999a    # 3.9f

    .line 357
    .line 358
    .line 359
    const/high16 v22, 0x40400000    # 3.0f

    .line 360
    .line 361
    const/high16 v23, 0x40400000    # 3.0f

    .line 362
    .line 363
    const v24, 0x4079999a    # 3.9f

    .line 364
    .line 365
    .line 366
    move-object/from16 v20, v2

    .line 367
    .line 368
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 369
    .line 370
    .line 371
    const/high16 v4, 0x41600000    # 14.0f

    .line 372
    .line 373
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 374
    .line 375
    .line 376
    const/high16 v25, 0x40000000    # 2.0f

    .line 377
    .line 378
    const/high16 v26, 0x40000000    # 2.0f

    .line 379
    .line 380
    const/16 v21, 0x0

    .line 381
    .line 382
    const v22, 0x3f8ccccd    # 1.1f

    .line 383
    .line 384
    .line 385
    const v23, 0x3f666666    # 0.9f

    .line 386
    .line 387
    .line 388
    const/high16 v24, 0x40000000    # 2.0f

    .line 389
    .line 390
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 391
    .line 392
    .line 393
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 394
    .line 395
    .line 396
    const/high16 v26, -0x40000000    # -2.0f

    .line 397
    .line 398
    const v21, 0x3f8ccccd    # 1.1f

    .line 399
    .line 400
    .line 401
    const/16 v22, 0x0

    .line 402
    .line 403
    const/high16 v23, 0x40000000    # 2.0f

    .line 404
    .line 405
    const v24, -0x4099999a    # -0.9f

    .line 406
    .line 407
    .line 408
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 409
    .line 410
    .line 411
    const/high16 v4, 0x40a00000    # 5.0f

    .line 412
    .line 413
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 414
    .line 415
    .line 416
    const/high16 v25, 0x41980000    # 19.0f

    .line 417
    .line 418
    const/high16 v26, 0x40400000    # 3.0f

    .line 419
    .line 420
    const/high16 v21, 0x41a80000    # 21.0f

    .line 421
    .line 422
    const v22, 0x4079999a    # 3.9f

    .line 423
    .line 424
    .line 425
    const v23, 0x41a0cccd    # 20.1f

    .line 426
    .line 427
    .line 428
    const/high16 v24, 0x40400000    # 3.0f

    .line 429
    .line 430
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 431
    .line 432
    .line 433
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 434
    .line 435
    .line 436
    const/high16 v4, 0x41980000    # 19.0f

    .line 437
    .line 438
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 439
    .line 440
    .line 441
    const/high16 v4, 0x40a00000    # 5.0f

    .line 442
    .line 443
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 444
    .line 445
    .line 446
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 447
    .line 448
    .line 449
    const/high16 v4, 0x41600000    # 14.0f

    .line 450
    .line 451
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 452
    .line 453
    .line 454
    const/high16 v4, 0x41980000    # 19.0f

    .line 455
    .line 456
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 457
    .line 458
    .line 459
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 460
    .line 461
    .line 462
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 463
    .line 464
    .line 465
    move-result-object v2

    .line 466
    const/high16 v6, 0x3f800000    # 1.0f

    .line 467
    .line 468
    const/high16 v8, 0x3f800000    # 1.0f

    .line 469
    .line 470
    const/4 v7, 0x0

    .line 471
    const-string v4, ""

    .line 472
    .line 473
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 474
    .line 475
    .line 476
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 477
    .line 478
    .line 479
    move-result v3

    .line 480
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 481
    .line 482
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 483
    .line 484
    .line 485
    move-result-wide v6

    .line 486
    const/4 v2, 0x0

    .line 487
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 488
    .line 489
    .line 490
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 491
    .line 492
    .line 493
    move-result v10

    .line 494
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 495
    .line 496
    .line 497
    move-result v11

    .line 498
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 499
    .line 500
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 501
    .line 502
    .line 503
    const/high16 v4, 0x41300000    # 11.0f

    .line 504
    .line 505
    const/high16 v6, 0x41580000    # 13.5f

    .line 506
    .line 507
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 508
    .line 509
    .line 510
    const/high16 v4, 0x41000000    # 8.0f

    .line 511
    .line 512
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 513
    .line 514
    .line 515
    const/high16 v4, -0x40800000    # -1.0f

    .line 516
    .line 517
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 518
    .line 519
    .line 520
    const/high16 v4, 0x40000000    # 2.0f

    .line 521
    .line 522
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 523
    .line 524
    .line 525
    const/high16 v25, 0x3f800000    # 1.0f

    .line 526
    .line 527
    const/high16 v26, -0x40800000    # -1.0f

    .line 528
    .line 529
    const v21, 0x3f0ccccd    # 0.55f

    .line 530
    .line 531
    .line 532
    const/16 v22, 0x0

    .line 533
    .line 534
    const/high16 v23, 0x3f800000    # 1.0f

    .line 535
    .line 536
    const v24, -0x4119999a    # -0.45f

    .line 537
    .line 538
    .line 539
    move-object/from16 v20, v2

    .line 540
    .line 541
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 542
    .line 543
    .line 544
    const/high16 v4, 0x41200000    # 10.0f

    .line 545
    .line 546
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 547
    .line 548
    .line 549
    const/high16 v25, -0x40800000    # -1.0f

    .line 550
    .line 551
    const/16 v21, 0x0

    .line 552
    .line 553
    const v22, -0x40f33333    # -0.55f

    .line 554
    .line 555
    .line 556
    const v23, -0x4119999a    # -0.45f

    .line 557
    .line 558
    .line 559
    const/high16 v24, -0x40800000    # -1.0f

    .line 560
    .line 561
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 562
    .line 563
    .line 564
    const/high16 v4, 0x40d00000    # 6.5f

    .line 565
    .line 566
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 567
    .line 568
    .line 569
    const/high16 v4, 0x3fc00000    # 1.5f

    .line 570
    .line 571
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 572
    .line 573
    .line 574
    const/high16 v4, 0x40400000    # 3.0f

    .line 575
    .line 576
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 577
    .line 578
    .line 579
    const/high16 v4, 0x3f800000    # 1.0f

    .line 580
    .line 581
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 582
    .line 583
    .line 584
    const/high16 v4, -0x40000000    # -2.0f

    .line 585
    .line 586
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 587
    .line 588
    .line 589
    const/high16 v26, 0x3f800000    # 1.0f

    .line 590
    .line 591
    const v21, -0x40f33333    # -0.55f

    .line 592
    .line 593
    .line 594
    const/16 v22, 0x0

    .line 595
    .line 596
    const/high16 v23, -0x40800000    # -1.0f

    .line 597
    .line 598
    const v24, 0x3ee66666    # 0.45f

    .line 599
    .line 600
    .line 601
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 602
    .line 603
    .line 604
    const/high16 v4, 0x41700000    # 15.0f

    .line 605
    .line 606
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 607
    .line 608
    .line 609
    const/high16 v4, 0x41300000    # 11.0f

    .line 610
    .line 611
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 612
    .line 613
    .line 614
    const/high16 v4, 0x41580000    # 13.5f

    .line 615
    .line 616
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 617
    .line 618
    .line 619
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 620
    .line 621
    .line 622
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 623
    .line 624
    .line 625
    move-result-object v2

    .line 626
    const/high16 v6, 0x3f800000    # 1.0f

    .line 627
    .line 628
    const/4 v7, 0x0

    .line 629
    const-string v4, ""

    .line 630
    .line 631
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 632
    .line 633
    .line 634
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 635
    .line 636
    .line 637
    move-result v3

    .line 638
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 639
    .line 640
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 641
    .line 642
    .line 643
    move-result-wide v6

    .line 644
    const/4 v0, 0x0

    .line 645
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 646
    .line 647
    .line 648
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 649
    .line 650
    .line 651
    move-result v10

    .line 652
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 653
    .line 654
    .line 655
    move-result v11

    .line 656
    new-instance v0, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 657
    .line 658
    invoke-direct {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 659
    .line 660
    .line 661
    const/high16 v2, 0x41680000    # 14.5f

    .line 662
    .line 663
    const/high16 v4, 0x414c0000    # 12.75f

    .line 664
    .line 665
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 666
    .line 667
    .line 668
    const/high16 v2, 0x3fe00000    # 1.75f

    .line 669
    .line 670
    const/high16 v4, 0x40100000    # 2.25f

    .line 671
    .line 672
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 673
    .line 674
    .line 675
    const/4 v4, 0x0

    .line 676
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 677
    .line 678
    .line 679
    const/high16 v2, -0x3fc00000    # -3.0f

    .line 680
    .line 681
    const/high16 v4, -0x3ff00000    # -2.25f

    .line 682
    .line 683
    invoke-virtual {v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 684
    .line 685
    .line 686
    const/high16 v4, 0x40100000    # 2.25f

    .line 687
    .line 688
    invoke-virtual {v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 689
    .line 690
    .line 691
    const/high16 v2, -0x40200000    # -1.75f

    .line 692
    .line 693
    const/4 v4, 0x0

    .line 694
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 695
    .line 696
    .line 697
    const/high16 v4, 0x40100000    # 2.25f

    .line 698
    .line 699
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 700
    .line 701
    .line 702
    const/high16 v2, -0x3ff00000    # -2.25f

    .line 703
    .line 704
    const/4 v4, 0x0

    .line 705
    invoke-virtual {v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 706
    .line 707
    .line 708
    const/high16 v2, -0x40400000    # -1.5f

    .line 709
    .line 710
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 711
    .line 712
    .line 713
    const/high16 v2, 0x40c00000    # 6.0f

    .line 714
    .line 715
    invoke-virtual {v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 716
    .line 717
    .line 718
    const/high16 v2, 0x3fc00000    # 1.5f

    .line 719
    .line 720
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 721
    .line 722
    .line 723
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 724
    .line 725
    .line 726
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 727
    .line 728
    .line 729
    move-result-object v2

    .line 730
    const/high16 v6, 0x3f800000    # 1.0f

    .line 731
    .line 732
    const/4 v7, 0x0

    .line 733
    const-string v4, ""

    .line 734
    .line 735
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 736
    .line 737
    .line 738
    move-result-object v0

    .line 739
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 740
    .line 741
    .line 742
    move-result-object v0

    .line 743
    sput-object v0, Landroidx/compose/material/icons/twotone/_2kKt;->__2k:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 744
    .line 745
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 746
    .line 747
    .line 748
    return-object v0
.end method
