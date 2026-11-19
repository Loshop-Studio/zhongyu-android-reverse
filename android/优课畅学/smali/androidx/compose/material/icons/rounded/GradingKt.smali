.class public final Landroidx/compose/material/icons/rounded/GradingKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _grading:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getGrading(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/GradingKt;->_grading:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.Grading"

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
    const/high16 v4, 0x40e00000    # 7.0f

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
    const/high16 v25, 0x3f800000    # 1.0f

    .line 83
    .line 84
    const/high16 v26, 0x3f800000    # 1.0f

    .line 85
    .line 86
    const v21, 0x3f0ccccd    # 0.55f

    .line 87
    .line 88
    .line 89
    const/16 v22, 0x0

    .line 90
    .line 91
    const/high16 v23, 0x3f800000    # 1.0f

    .line 92
    .line 93
    const v24, 0x3ee66666    # 0.45f

    .line 94
    .line 95
    .line 96
    move-object/from16 v20, v2

    .line 97
    .line 98
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 99
    .line 100
    .line 101
    const/4 v4, 0x0

    .line 102
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 103
    .line 104
    .line 105
    const/high16 v25, -0x40800000    # -1.0f

    .line 106
    .line 107
    const/16 v21, 0x0

    .line 108
    .line 109
    const v22, 0x3f0ccccd    # 0.55f

    .line 110
    .line 111
    .line 112
    const v23, -0x4119999a    # -0.45f

    .line 113
    .line 114
    .line 115
    const/high16 v24, 0x3f800000    # 1.0f

    .line 116
    .line 117
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 118
    .line 119
    .line 120
    const/high16 v4, 0x40a00000    # 5.0f

    .line 121
    .line 122
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 123
    .line 124
    .line 125
    const/high16 v25, 0x40800000    # 4.0f

    .line 126
    .line 127
    const/high16 v26, 0x41000000    # 8.0f

    .line 128
    .line 129
    const v21, 0x408e6666    # 4.45f

    .line 130
    .line 131
    .line 132
    const/high16 v22, 0x41100000    # 9.0f

    .line 133
    .line 134
    const/high16 v23, 0x40800000    # 4.0f

    .line 135
    .line 136
    const v24, 0x4108cccd    # 8.55f

    .line 137
    .line 138
    .line 139
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 140
    .line 141
    .line 142
    const/4 v4, 0x0

    .line 143
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 144
    .line 145
    .line 146
    const/high16 v25, 0x40a00000    # 5.0f

    .line 147
    .line 148
    const/high16 v26, 0x40e00000    # 7.0f

    .line 149
    .line 150
    const/high16 v21, 0x40800000    # 4.0f

    .line 151
    .line 152
    const v22, 0x40ee6666    # 7.45f

    .line 153
    .line 154
    .line 155
    const v23, 0x408e6666    # 4.45f

    .line 156
    .line 157
    .line 158
    const/high16 v24, 0x40e00000    # 7.0f

    .line 159
    .line 160
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 161
    .line 162
    .line 163
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 164
    .line 165
    .line 166
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 167
    .line 168
    .line 169
    move-result-object v2

    .line 170
    const/16 v16, 0x3800

    .line 171
    .line 172
    const/16 v17, 0x0

    .line 173
    .line 174
    const/high16 v6, 0x3f800000    # 1.0f

    .line 175
    .line 176
    const/high16 v8, 0x3f800000    # 1.0f

    .line 177
    .line 178
    const/4 v7, 0x0

    .line 179
    const/high16 v9, 0x3f800000    # 1.0f

    .line 180
    .line 181
    const/high16 v12, 0x3f800000    # 1.0f

    .line 182
    .line 183
    const/4 v13, 0x0

    .line 184
    const/4 v14, 0x0

    .line 185
    const/4 v15, 0x0

    .line 186
    const-string v4, ""

    .line 187
    .line 188
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 189
    .line 190
    .line 191
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 192
    .line 193
    .line 194
    move-result v3

    .line 195
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 196
    .line 197
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 198
    .line 199
    .line 200
    move-result-wide v6

    .line 201
    const/4 v2, 0x0

    .line 202
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 203
    .line 204
    .line 205
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 206
    .line 207
    .line 208
    move-result v10

    .line 209
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 210
    .line 211
    .line 212
    move-result v11

    .line 213
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 214
    .line 215
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 216
    .line 217
    .line 218
    const/high16 v4, 0x41500000    # 13.0f

    .line 219
    .line 220
    const/high16 v6, 0x40a00000    # 5.0f

    .line 221
    .line 222
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 223
    .line 224
    .line 225
    const/high16 v4, 0x41600000    # 14.0f

    .line 226
    .line 227
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 228
    .line 229
    .line 230
    const/high16 v25, 0x3f800000    # 1.0f

    .line 231
    .line 232
    const/high16 v26, -0x40800000    # -1.0f

    .line 233
    .line 234
    const v21, 0x3f0ccccd    # 0.55f

    .line 235
    .line 236
    .line 237
    const/16 v22, 0x0

    .line 238
    .line 239
    const/high16 v23, 0x3f800000    # 1.0f

    .line 240
    .line 241
    const v24, -0x4119999a    # -0.45f

    .line 242
    .line 243
    .line 244
    move-object/from16 v20, v2

    .line 245
    .line 246
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 247
    .line 248
    .line 249
    const/4 v4, 0x0

    .line 250
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 251
    .line 252
    .line 253
    const/high16 v25, -0x40800000    # -1.0f

    .line 254
    .line 255
    const/16 v21, 0x0

    .line 256
    .line 257
    const v22, -0x40f33333    # -0.55f

    .line 258
    .line 259
    .line 260
    const v23, -0x4119999a    # -0.45f

    .line 261
    .line 262
    .line 263
    const/high16 v24, -0x40800000    # -1.0f

    .line 264
    .line 265
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 266
    .line 267
    .line 268
    const/high16 v4, 0x40a00000    # 5.0f

    .line 269
    .line 270
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 271
    .line 272
    .line 273
    const/high16 v26, 0x3f800000    # 1.0f

    .line 274
    .line 275
    const v21, -0x40f33333    # -0.55f

    .line 276
    .line 277
    .line 278
    const/16 v22, 0x0

    .line 279
    .line 280
    const/high16 v23, -0x40800000    # -1.0f

    .line 281
    .line 282
    const v24, 0x3ee66666    # 0.45f

    .line 283
    .line 284
    .line 285
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 286
    .line 287
    .line 288
    const/4 v4, 0x0

    .line 289
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 290
    .line 291
    .line 292
    const/high16 v25, 0x40a00000    # 5.0f

    .line 293
    .line 294
    const/high16 v26, 0x41500000    # 13.0f

    .line 295
    .line 296
    const/high16 v21, 0x40800000    # 4.0f

    .line 297
    .line 298
    const v22, 0x4148cccd    # 12.55f

    .line 299
    .line 300
    .line 301
    const v23, 0x408e6666    # 4.45f

    .line 302
    .line 303
    .line 304
    const/high16 v24, 0x41500000    # 13.0f

    .line 305
    .line 306
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 307
    .line 308
    .line 309
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 310
    .line 311
    .line 312
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 313
    .line 314
    .line 315
    move-result-object v2

    .line 316
    const/high16 v6, 0x3f800000    # 1.0f

    .line 317
    .line 318
    const/4 v7, 0x0

    .line 319
    const-string v4, ""

    .line 320
    .line 321
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 322
    .line 323
    .line 324
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 325
    .line 326
    .line 327
    move-result v3

    .line 328
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 329
    .line 330
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 331
    .line 332
    .line 333
    move-result-wide v6

    .line 334
    const/4 v2, 0x0

    .line 335
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 336
    .line 337
    .line 338
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 339
    .line 340
    .line 341
    move-result v10

    .line 342
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 343
    .line 344
    .line 345
    move-result v11

    .line 346
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 347
    .line 348
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 349
    .line 350
    .line 351
    const/high16 v4, 0x41880000    # 17.0f

    .line 352
    .line 353
    const/high16 v6, 0x40a00000    # 5.0f

    .line 354
    .line 355
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 356
    .line 357
    .line 358
    const/high16 v4, 0x40a00000    # 5.0f

    .line 359
    .line 360
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 361
    .line 362
    .line 363
    const/high16 v25, 0x3f800000    # 1.0f

    .line 364
    .line 365
    const/high16 v26, -0x40800000    # -1.0f

    .line 366
    .line 367
    const v21, 0x3f0ccccd    # 0.55f

    .line 368
    .line 369
    .line 370
    const/16 v22, 0x0

    .line 371
    .line 372
    const/high16 v23, 0x3f800000    # 1.0f

    .line 373
    .line 374
    const v24, -0x4119999a    # -0.45f

    .line 375
    .line 376
    .line 377
    move-object/from16 v20, v2

    .line 378
    .line 379
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 380
    .line 381
    .line 382
    const/4 v4, 0x0

    .line 383
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 384
    .line 385
    .line 386
    const/high16 v25, -0x40800000    # -1.0f

    .line 387
    .line 388
    const/16 v21, 0x0

    .line 389
    .line 390
    const v22, -0x40f33333    # -0.55f

    .line 391
    .line 392
    .line 393
    const v23, -0x4119999a    # -0.45f

    .line 394
    .line 395
    .line 396
    const/high16 v24, -0x40800000    # -1.0f

    .line 397
    .line 398
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 399
    .line 400
    .line 401
    const/high16 v4, 0x40a00000    # 5.0f

    .line 402
    .line 403
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 404
    .line 405
    .line 406
    const/high16 v26, 0x3f800000    # 1.0f

    .line 407
    .line 408
    const v21, -0x40f33333    # -0.55f

    .line 409
    .line 410
    .line 411
    const/16 v22, 0x0

    .line 412
    .line 413
    const/high16 v23, -0x40800000    # -1.0f

    .line 414
    .line 415
    const v24, 0x3ee66666    # 0.45f

    .line 416
    .line 417
    .line 418
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 419
    .line 420
    .line 421
    const/4 v4, 0x0

    .line 422
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 423
    .line 424
    .line 425
    const/high16 v25, 0x40a00000    # 5.0f

    .line 426
    .line 427
    const/high16 v26, 0x41880000    # 17.0f

    .line 428
    .line 429
    const/high16 v21, 0x40800000    # 4.0f

    .line 430
    .line 431
    const v22, 0x41846666    # 16.55f

    .line 432
    .line 433
    .line 434
    const v23, 0x408e6666    # 4.45f

    .line 435
    .line 436
    .line 437
    const/high16 v24, 0x41880000    # 17.0f

    .line 438
    .line 439
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 440
    .line 441
    .line 442
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 443
    .line 444
    .line 445
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 446
    .line 447
    .line 448
    move-result-object v2

    .line 449
    const/high16 v6, 0x3f800000    # 1.0f

    .line 450
    .line 451
    const/4 v7, 0x0

    .line 452
    const-string v4, ""

    .line 453
    .line 454
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 455
    .line 456
    .line 457
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 458
    .line 459
    .line 460
    move-result v3

    .line 461
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 462
    .line 463
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 464
    .line 465
    .line 466
    move-result-wide v6

    .line 467
    const/4 v2, 0x0

    .line 468
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 469
    .line 470
    .line 471
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 472
    .line 473
    .line 474
    move-result v10

    .line 475
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 476
    .line 477
    .line 478
    move-result v11

    .line 479
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 480
    .line 481
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 482
    .line 483
    .line 484
    const/high16 v4, 0x41a80000    # 21.0f

    .line 485
    .line 486
    const/high16 v6, 0x40a00000    # 5.0f

    .line 487
    .line 488
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 489
    .line 490
    .line 491
    const/high16 v4, 0x40a00000    # 5.0f

    .line 492
    .line 493
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 494
    .line 495
    .line 496
    const/high16 v25, 0x3f800000    # 1.0f

    .line 497
    .line 498
    const/high16 v26, -0x40800000    # -1.0f

    .line 499
    .line 500
    const v21, 0x3f0ccccd    # 0.55f

    .line 501
    .line 502
    .line 503
    const/16 v22, 0x0

    .line 504
    .line 505
    const/high16 v23, 0x3f800000    # 1.0f

    .line 506
    .line 507
    const v24, -0x4119999a    # -0.45f

    .line 508
    .line 509
    .line 510
    move-object/from16 v20, v2

    .line 511
    .line 512
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 513
    .line 514
    .line 515
    const/4 v4, 0x0

    .line 516
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 517
    .line 518
    .line 519
    const/high16 v25, -0x40800000    # -1.0f

    .line 520
    .line 521
    const/16 v21, 0x0

    .line 522
    .line 523
    const v22, -0x40f33333    # -0.55f

    .line 524
    .line 525
    .line 526
    const v23, -0x4119999a    # -0.45f

    .line 527
    .line 528
    .line 529
    const/high16 v24, -0x40800000    # -1.0f

    .line 530
    .line 531
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 532
    .line 533
    .line 534
    const/high16 v4, 0x40a00000    # 5.0f

    .line 535
    .line 536
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 537
    .line 538
    .line 539
    const/high16 v26, 0x3f800000    # 1.0f

    .line 540
    .line 541
    const v21, -0x40f33333    # -0.55f

    .line 542
    .line 543
    .line 544
    const/16 v22, 0x0

    .line 545
    .line 546
    const/high16 v23, -0x40800000    # -1.0f

    .line 547
    .line 548
    const v24, 0x3ee66666    # 0.45f

    .line 549
    .line 550
    .line 551
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 552
    .line 553
    .line 554
    const/4 v4, 0x0

    .line 555
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 556
    .line 557
    .line 558
    const/high16 v25, 0x40a00000    # 5.0f

    .line 559
    .line 560
    const/high16 v26, 0x41a80000    # 21.0f

    .line 561
    .line 562
    const/high16 v21, 0x40800000    # 4.0f

    .line 563
    .line 564
    const v22, 0x41a46666    # 20.55f

    .line 565
    .line 566
    .line 567
    const v23, 0x408e6666    # 4.45f

    .line 568
    .line 569
    .line 570
    const/high16 v24, 0x41a80000    # 21.0f

    .line 571
    .line 572
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 573
    .line 574
    .line 575
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 576
    .line 577
    .line 578
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 579
    .line 580
    .line 581
    move-result-object v2

    .line 582
    const/high16 v6, 0x3f800000    # 1.0f

    .line 583
    .line 584
    const/4 v7, 0x0

    .line 585
    const-string v4, ""

    .line 586
    .line 587
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 588
    .line 589
    .line 590
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 591
    .line 592
    .line 593
    move-result v3

    .line 594
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 595
    .line 596
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 597
    .line 598
    .line 599
    move-result-wide v6

    .line 600
    const/4 v2, 0x0

    .line 601
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 602
    .line 603
    .line 604
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 605
    .line 606
    .line 607
    move-result v10

    .line 608
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 609
    .line 610
    .line 611
    move-result v11

    .line 612
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 613
    .line 614
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 615
    .line 616
    .line 617
    const v4, 0x41915c29    # 18.17f

    .line 618
    .line 619
    .line 620
    const v6, 0x41768f5c    # 15.41f

    .line 621
    .line 622
    .line 623
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 624
    .line 625
    .line 626
    const v4, -0x40ca3d71    # -0.71f

    .line 627
    .line 628
    .line 629
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 630
    .line 631
    .line 632
    const v25, -0x404b851f    # -1.41f

    .line 633
    .line 634
    .line 635
    const/16 v26, 0x0

    .line 636
    .line 637
    const v21, -0x413851ec    # -0.39f

    .line 638
    .line 639
    .line 640
    const v22, -0x413851ec    # -0.39f

    .line 641
    .line 642
    .line 643
    const v23, -0x407d70a4    # -1.02f

    .line 644
    .line 645
    .line 646
    const v24, -0x413851ec    # -0.39f

    .line 647
    .line 648
    .line 649
    move-object/from16 v20, v2

    .line 650
    .line 651
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 652
    .line 653
    .line 654
    const/4 v4, 0x0

    .line 655
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 656
    .line 657
    .line 658
    const/16 v25, 0x0

    .line 659
    .line 660
    const v26, 0x3fb47ae1    # 1.41f

    .line 661
    .line 662
    .line 663
    const v22, 0x3ec7ae14    # 0.39f

    .line 664
    .line 665
    .line 666
    const v23, -0x413851ec    # -0.39f

    .line 667
    .line 668
    .line 669
    const v24, 0x3f828f5c    # 1.02f

    .line 670
    .line 671
    .line 672
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 673
    .line 674
    .line 675
    const v4, 0x3fb5c28f    # 1.42f

    .line 676
    .line 677
    .line 678
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 679
    .line 680
    .line 681
    const v25, 0x3fb47ae1    # 1.41f

    .line 682
    .line 683
    .line 684
    const/16 v26, 0x0

    .line 685
    .line 686
    const v21, 0x3ec7ae14    # 0.39f

    .line 687
    .line 688
    .line 689
    const v23, 0x3f828f5c    # 1.02f

    .line 690
    .line 691
    .line 692
    const v24, 0x3ec7ae14    # 0.39f

    .line 693
    .line 694
    .line 695
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 696
    .line 697
    .line 698
    const v4, 0x404ae148    # 3.17f

    .line 699
    .line 700
    .line 701
    const v6, -0x3fb51eb8    # -3.17f

    .line 702
    .line 703
    .line 704
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 705
    .line 706
    .line 707
    const/16 v25, 0x0

    .line 708
    .line 709
    const v26, -0x404b851f    # -1.41f

    .line 710
    .line 711
    .line 712
    const v22, -0x413851ec    # -0.39f

    .line 713
    .line 714
    .line 715
    const v23, 0x3ec7ae14    # 0.39f

    .line 716
    .line 717
    .line 718
    const v24, -0x407d70a4    # -1.02f

    .line 719
    .line 720
    .line 721
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 722
    .line 723
    .line 724
    const/4 v4, 0x0

    .line 725
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 726
    .line 727
    .line 728
    const v25, -0x404b851f    # -1.41f

    .line 729
    .line 730
    .line 731
    const/16 v26, 0x0

    .line 732
    .line 733
    const v21, -0x413851ec    # -0.39f

    .line 734
    .line 735
    .line 736
    const v23, -0x407d70a4    # -1.02f

    .line 737
    .line 738
    .line 739
    const v24, -0x413851ec    # -0.39f

    .line 740
    .line 741
    .line 742
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 743
    .line 744
    .line 745
    const v4, 0x41915c29    # 18.17f

    .line 746
    .line 747
    .line 748
    const v6, 0x41768f5c    # 15.41f

    .line 749
    .line 750
    .line 751
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 752
    .line 753
    .line 754
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 755
    .line 756
    .line 757
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 758
    .line 759
    .line 760
    move-result-object v2

    .line 761
    const/high16 v6, 0x3f800000    # 1.0f

    .line 762
    .line 763
    const/4 v7, 0x0

    .line 764
    const-string v4, ""

    .line 765
    .line 766
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 767
    .line 768
    .line 769
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 770
    .line 771
    .line 772
    move-result v3

    .line 773
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 774
    .line 775
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 776
    .line 777
    .line 778
    move-result-wide v6

    .line 779
    const/4 v0, 0x0

    .line 780
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 781
    .line 782
    .line 783
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 784
    .line 785
    .line 786
    move-result v10

    .line 787
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 788
    .line 789
    .line 790
    move-result v11

    .line 791
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 792
    .line 793
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 794
    .line 795
    .line 796
    const/high16 v0, 0x40800000    # 4.0f

    .line 797
    .line 798
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 799
    .line 800
    .line 801
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 802
    .line 803
    .line 804
    const/high16 v17, 0x3f800000    # 1.0f

    .line 805
    .line 806
    const/high16 v18, 0x3f800000    # 1.0f

    .line 807
    .line 808
    const v14, 0x3f0ccccd    # 0.55f

    .line 809
    .line 810
    .line 811
    const v15, 0x3ee66666    # 0.45f

    .line 812
    .line 813
    .line 814
    const/high16 v16, 0x3f800000    # 1.0f

    .line 815
    .line 816
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 817
    .line 818
    .line 819
    const/high16 v0, 0x41600000    # 14.0f

    .line 820
    .line 821
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 822
    .line 823
    .line 824
    const/high16 v18, -0x40800000    # -1.0f

    .line 825
    .line 826
    const v13, 0x3f0ccccd    # 0.55f

    .line 827
    .line 828
    .line 829
    const/4 v14, 0x0

    .line 830
    const/high16 v15, 0x3f800000    # 1.0f

    .line 831
    .line 832
    const v16, -0x4119999a    # -0.45f

    .line 833
    .line 834
    .line 835
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 836
    .line 837
    .line 838
    const/4 v0, 0x0

    .line 839
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 840
    .line 841
    .line 842
    const/high16 v17, -0x40800000    # -1.0f

    .line 843
    .line 844
    const/4 v13, 0x0

    .line 845
    const v14, -0x40f33333    # -0.55f

    .line 846
    .line 847
    .line 848
    const v15, -0x4119999a    # -0.45f

    .line 849
    .line 850
    .line 851
    const/high16 v16, -0x40800000    # -1.0f

    .line 852
    .line 853
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 854
    .line 855
    .line 856
    const/high16 v0, 0x40a00000    # 5.0f

    .line 857
    .line 858
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 859
    .line 860
    .line 861
    const/high16 v17, 0x40800000    # 4.0f

    .line 862
    .line 863
    const/high16 v18, 0x40800000    # 4.0f

    .line 864
    .line 865
    const v13, 0x408e6666    # 4.45f

    .line 866
    .line 867
    .line 868
    const/high16 v14, 0x40400000    # 3.0f

    .line 869
    .line 870
    const/high16 v15, 0x40800000    # 4.0f

    .line 871
    .line 872
    const v16, 0x405ccccd    # 3.45f

    .line 873
    .line 874
    .line 875
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 876
    .line 877
    .line 878
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 879
    .line 880
    .line 881
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 882
    .line 883
    .line 884
    move-result-object v2

    .line 885
    const/16 v16, 0x3800

    .line 886
    .line 887
    const/16 v17, 0x0

    .line 888
    .line 889
    const/high16 v6, 0x3f800000    # 1.0f

    .line 890
    .line 891
    const/4 v7, 0x0

    .line 892
    const/high16 v12, 0x3f800000    # 1.0f

    .line 893
    .line 894
    const/4 v13, 0x0

    .line 895
    const/4 v14, 0x0

    .line 896
    const/4 v15, 0x0

    .line 897
    const-string v4, ""

    .line 898
    .line 899
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 900
    .line 901
    .line 902
    move-result-object v0

    .line 903
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 904
    .line 905
    .line 906
    move-result-object v0

    .line 907
    sput-object v0, Landroidx/compose/material/icons/rounded/GradingKt;->_grading:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 908
    .line 909
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 910
    .line 911
    .line 912
    return-object v0
.end method

.method public static synthetic getGrading$annotations(Landroidx/compose/material/icons/Icons$Rounded;)V
    .locals 0
    .annotation runtime Lh7/a;
    .end annotation

    return-void
.end method
