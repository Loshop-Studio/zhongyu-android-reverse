.class public final Landroidx/compose/material/icons/twotone/GppMaybeKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _gppMaybe:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getGppMaybe(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/GppMaybeKt;->_gppMaybe:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.GppMaybe"

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
    const v4, 0x40cc7ae1    # 6.39f

    .line 71
    .line 72
    .line 73
    const/high16 v6, 0x40c00000    # 6.0f

    .line 74
    .line 75
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    const v4, 0x40966666    # 4.7f

    .line 79
    .line 80
    .line 81
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 82
    .line 83
    .line 84
    const/high16 v25, 0x40c00000    # 6.0f

    .line 85
    .line 86
    const v26, 0x410d47ae    # 8.83f

    .line 87
    .line 88
    .line 89
    const/16 v21, 0x0

    .line 90
    .line 91
    const/high16 v22, 0x40800000    # 4.0f

    .line 92
    .line 93
    const v23, 0x40233333    # 2.55f

    .line 94
    .line 95
    .line 96
    const v24, 0x40f66666    # 7.7f

    .line 97
    .line 98
    .line 99
    move-object/from16 v20, v2

    .line 100
    .line 101
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 102
    .line 103
    .line 104
    const v26, -0x3ef2b852    # -8.83f

    .line 105
    .line 106
    .line 107
    const v21, 0x405ccccd    # 3.45f

    .line 108
    .line 109
    .line 110
    const v22, -0x406f5c29    # -1.13f

    .line 111
    .line 112
    .line 113
    const/high16 v23, 0x40c00000    # 6.0f

    .line 114
    .line 115
    const v24, -0x3f65c28f    # -4.82f

    .line 116
    .line 117
    .line 118
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 119
    .line 120
    .line 121
    const v4, -0x3f69999a    # -4.7f

    .line 122
    .line 123
    .line 124
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 125
    .line 126
    .line 127
    const/high16 v4, -0x3f400000    # -6.0f

    .line 128
    .line 129
    const/high16 v6, -0x3ff00000    # -2.25f

    .line 130
    .line 131
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 132
    .line 133
    .line 134
    const v4, 0x40cc7ae1    # 6.39f

    .line 135
    .line 136
    .line 137
    const/high16 v6, 0x40c00000    # 6.0f

    .line 138
    .line 139
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 140
    .line 141
    .line 142
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 143
    .line 144
    .line 145
    const/high16 v4, 0x41500000    # 13.0f

    .line 146
    .line 147
    const/high16 v6, 0x41800000    # 16.0f

    .line 148
    .line 149
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 150
    .line 151
    .line 152
    const/high16 v4, -0x40000000    # -2.0f

    .line 153
    .line 154
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 155
    .line 156
    .line 157
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 158
    .line 159
    .line 160
    const/high16 v4, 0x40000000    # 2.0f

    .line 161
    .line 162
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 163
    .line 164
    .line 165
    const/high16 v4, 0x41800000    # 16.0f

    .line 166
    .line 167
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 168
    .line 169
    .line 170
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 171
    .line 172
    .line 173
    const/high16 v4, 0x41500000    # 13.0f

    .line 174
    .line 175
    const/high16 v6, 0x41400000    # 12.0f

    .line 176
    .line 177
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 178
    .line 179
    .line 180
    const/high16 v4, -0x40000000    # -2.0f

    .line 181
    .line 182
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 183
    .line 184
    .line 185
    const/high16 v4, 0x40e00000    # 7.0f

    .line 186
    .line 187
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 188
    .line 189
    .line 190
    const/high16 v4, 0x40000000    # 2.0f

    .line 191
    .line 192
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 193
    .line 194
    .line 195
    const/high16 v4, 0x41400000    # 12.0f

    .line 196
    .line 197
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 198
    .line 199
    .line 200
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 201
    .line 202
    .line 203
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 204
    .line 205
    .line 206
    move-result-object v2

    .line 207
    const/16 v16, 0x3800

    .line 208
    .line 209
    const/16 v17, 0x0

    .line 210
    .line 211
    const v6, 0x3e99999a    # 0.3f

    .line 212
    .line 213
    .line 214
    const v8, 0x3e99999a    # 0.3f

    .line 215
    .line 216
    .line 217
    const/4 v7, 0x0

    .line 218
    const/high16 v9, 0x3f800000    # 1.0f

    .line 219
    .line 220
    const/high16 v12, 0x3f800000    # 1.0f

    .line 221
    .line 222
    const/4 v13, 0x0

    .line 223
    const/4 v14, 0x0

    .line 224
    const/4 v15, 0x0

    .line 225
    const-string v4, ""

    .line 226
    .line 227
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 228
    .line 229
    .line 230
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 231
    .line 232
    .line 233
    move-result v3

    .line 234
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 235
    .line 236
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 237
    .line 238
    .line 239
    move-result-wide v6

    .line 240
    const/4 v0, 0x0

    .line 241
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 242
    .line 243
    .line 244
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 245
    .line 246
    .line 247
    move-result v10

    .line 248
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 249
    .line 250
    .line 251
    move-result v11

    .line 252
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 253
    .line 254
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 255
    .line 256
    .line 257
    const/high16 v0, 0x41400000    # 12.0f

    .line 258
    .line 259
    const/high16 v2, 0x40000000    # 2.0f

    .line 260
    .line 261
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 262
    .line 263
    .line 264
    const/high16 v0, 0x40800000    # 4.0f

    .line 265
    .line 266
    const/high16 v2, 0x40a00000    # 5.0f

    .line 267
    .line 268
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 269
    .line 270
    .line 271
    const v0, 0x40c2e148    # 6.09f

    .line 272
    .line 273
    .line 274
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 275
    .line 276
    .line 277
    const/high16 v17, 0x41000000    # 8.0f

    .line 278
    .line 279
    const v18, 0x412e8f5c    # 10.91f

    .line 280
    .line 281
    .line 282
    const v14, 0x40a1999a    # 5.05f

    .line 283
    .line 284
    .line 285
    const v15, 0x405a3d71    # 3.41f

    .line 286
    .line 287
    .line 288
    const v16, 0x411c28f6    # 9.76f

    .line 289
    .line 290
    .line 291
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 292
    .line 293
    .line 294
    const v18, -0x3ed170a4    # -10.91f

    .line 295
    .line 296
    .line 297
    const v13, 0x4092e148    # 4.59f

    .line 298
    .line 299
    .line 300
    const v14, -0x406ccccd    # -1.15f

    .line 301
    .line 302
    .line 303
    const/high16 v15, 0x41000000    # 8.0f

    .line 304
    .line 305
    const v16, -0x3f447ae1    # -5.86f

    .line 306
    .line 307
    .line 308
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 309
    .line 310
    .line 311
    const/high16 v0, 0x40a00000    # 5.0f

    .line 312
    .line 313
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 314
    .line 315
    .line 316
    const/high16 v0, 0x41400000    # 12.0f

    .line 317
    .line 318
    const/high16 v2, 0x40000000    # 2.0f

    .line 319
    .line 320
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 321
    .line 322
    .line 323
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 324
    .line 325
    .line 326
    const/high16 v0, 0x41900000    # 18.0f

    .line 327
    .line 328
    const v2, 0x413170a4    # 11.09f

    .line 329
    .line 330
    .line 331
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 332
    .line 333
    .line 334
    const/high16 v17, -0x3f400000    # -6.0f

    .line 335
    .line 336
    const v18, 0x410d47ae    # 8.83f

    .line 337
    .line 338
    .line 339
    const/4 v13, 0x0

    .line 340
    const/high16 v14, 0x40800000    # 4.0f

    .line 341
    .line 342
    const v15, -0x3fdccccd    # -2.55f

    .line 343
    .line 344
    .line 345
    const v16, 0x40f66666    # 7.7f

    .line 346
    .line 347
    .line 348
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 349
    .line 350
    .line 351
    const v18, -0x3ef2b852    # -8.83f

    .line 352
    .line 353
    .line 354
    const v13, -0x3fa33333    # -3.45f

    .line 355
    .line 356
    .line 357
    const v14, -0x406f5c29    # -1.13f

    .line 358
    .line 359
    .line 360
    const/high16 v15, -0x3f400000    # -6.0f

    .line 361
    .line 362
    const v16, -0x3f65c28f    # -4.82f

    .line 363
    .line 364
    .line 365
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 366
    .line 367
    .line 368
    const v0, -0x3f69999a    # -4.7f

    .line 369
    .line 370
    .line 371
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 372
    .line 373
    .line 374
    const/high16 v0, -0x3ff00000    # -2.25f

    .line 375
    .line 376
    const/high16 v2, 0x40c00000    # 6.0f

    .line 377
    .line 378
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 379
    .line 380
    .line 381
    const/high16 v0, 0x40100000    # 2.25f

    .line 382
    .line 383
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 384
    .line 385
    .line 386
    const v0, 0x413170a4    # 11.09f

    .line 387
    .line 388
    .line 389
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 390
    .line 391
    .line 392
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 393
    .line 394
    .line 395
    const/high16 v0, 0x41300000    # 11.0f

    .line 396
    .line 397
    const/high16 v2, 0x41800000    # 16.0f

    .line 398
    .line 399
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 400
    .line 401
    .line 402
    const/high16 v0, 0x40000000    # 2.0f

    .line 403
    .line 404
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 405
    .line 406
    .line 407
    const/high16 v0, -0x40000000    # -2.0f

    .line 408
    .line 409
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 410
    .line 411
    .line 412
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 413
    .line 414
    .line 415
    const/high16 v0, 0x41800000    # 16.0f

    .line 416
    .line 417
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 418
    .line 419
    .line 420
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 421
    .line 422
    .line 423
    const/high16 v0, 0x41300000    # 11.0f

    .line 424
    .line 425
    const/high16 v2, 0x41400000    # 12.0f

    .line 426
    .line 427
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 428
    .line 429
    .line 430
    const/high16 v0, 0x40000000    # 2.0f

    .line 431
    .line 432
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 433
    .line 434
    .line 435
    const/high16 v0, 0x40e00000    # 7.0f

    .line 436
    .line 437
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 438
    .line 439
    .line 440
    const/high16 v0, -0x40000000    # -2.0f

    .line 441
    .line 442
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 443
    .line 444
    .line 445
    const/high16 v0, 0x41400000    # 12.0f

    .line 446
    .line 447
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 448
    .line 449
    .line 450
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 451
    .line 452
    .line 453
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 454
    .line 455
    .line 456
    move-result-object v2

    .line 457
    const/16 v16, 0x3800

    .line 458
    .line 459
    const/16 v17, 0x0

    .line 460
    .line 461
    const/high16 v6, 0x3f800000    # 1.0f

    .line 462
    .line 463
    const/high16 v8, 0x3f800000    # 1.0f

    .line 464
    .line 465
    const/4 v7, 0x0

    .line 466
    const/high16 v12, 0x3f800000    # 1.0f

    .line 467
    .line 468
    const/4 v13, 0x0

    .line 469
    const/4 v14, 0x0

    .line 470
    const/4 v15, 0x0

    .line 471
    const-string v4, ""

    .line 472
    .line 473
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 474
    .line 475
    .line 476
    move-result-object v0

    .line 477
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 478
    .line 479
    .line 480
    move-result-object v0

    .line 481
    sput-object v0, Landroidx/compose/material/icons/twotone/GppMaybeKt;->_gppMaybe:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 482
    .line 483
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 484
    .line 485
    .line 486
    return-object v0
.end method
