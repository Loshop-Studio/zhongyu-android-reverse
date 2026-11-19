.class public final Landroidx/compose/material/icons/outlined/_22mpKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static __22mp:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final get_22mp(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/outlined/_22mpKt;->__22mp:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Outlined._22mp"

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
    const/high16 v4, 0x40f00000    # 7.5f

    .line 71
    .line 72
    const/high16 v6, 0x41600000    # 14.0f

    .line 73
    .line 74
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v4, 0x3f800000    # 1.0f

    .line 78
    .line 79
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 80
    .line 81
    .line 82
    const/high16 v4, 0x40400000    # 3.0f

    .line 83
    .line 84
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 85
    .line 86
    .line 87
    const/high16 v4, 0x41200000    # 10.0f

    .line 88
    .line 89
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 90
    .line 91
    .line 92
    const/high16 v4, -0x3fc00000    # -3.0f

    .line 93
    .line 94
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 95
    .line 96
    .line 97
    const/high16 v4, 0x3f800000    # 1.0f

    .line 98
    .line 99
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 100
    .line 101
    .line 102
    const/high16 v4, 0x40900000    # 4.5f

    .line 103
    .line 104
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 105
    .line 106
    .line 107
    const/high16 v4, 0x3fc00000    # 1.5f

    .line 108
    .line 109
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 110
    .line 111
    .line 112
    const/high16 v4, -0x3f600000    # -5.0f

    .line 113
    .line 114
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 115
    .line 116
    .line 117
    const/high16 v25, -0x40800000    # -1.0f

    .line 118
    .line 119
    const/high16 v26, -0x40800000    # -1.0f

    .line 120
    .line 121
    const/16 v21, 0x0

    .line 122
    .line 123
    const v22, -0x40f33333    # -0.55f

    .line 124
    .line 125
    .line 126
    const v23, -0x4119999a    # -0.45f

    .line 127
    .line 128
    .line 129
    const/high16 v24, -0x40800000    # -1.0f

    .line 130
    .line 131
    move-object/from16 v20, v2

    .line 132
    .line 133
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 134
    .line 135
    .line 136
    const/high16 v4, 0x40e00000    # 7.0f

    .line 137
    .line 138
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 139
    .line 140
    .line 141
    const/high16 v26, 0x3f800000    # 1.0f

    .line 142
    .line 143
    const v21, -0x40f33333    # -0.55f

    .line 144
    .line 145
    .line 146
    const/16 v22, 0x0

    .line 147
    .line 148
    const/high16 v23, -0x40800000    # -1.0f

    .line 149
    .line 150
    const v24, 0x3ee66666    # 0.45f

    .line 151
    .line 152
    .line 153
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 154
    .line 155
    .line 156
    const/high16 v4, 0x40a00000    # 5.0f

    .line 157
    .line 158
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 159
    .line 160
    .line 161
    const/high16 v4, 0x3fc00000    # 1.5f

    .line 162
    .line 163
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 164
    .line 165
    .line 166
    const/high16 v4, 0x41600000    # 14.0f

    .line 167
    .line 168
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 169
    .line 170
    .line 171
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 172
    .line 173
    .line 174
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 175
    .line 176
    .line 177
    move-result-object v2

    .line 178
    const/16 v16, 0x3800

    .line 179
    .line 180
    const/16 v17, 0x0

    .line 181
    .line 182
    const/high16 v6, 0x3f800000    # 1.0f

    .line 183
    .line 184
    const/high16 v8, 0x3f800000    # 1.0f

    .line 185
    .line 186
    const/4 v7, 0x0

    .line 187
    const/high16 v9, 0x3f800000    # 1.0f

    .line 188
    .line 189
    const/high16 v12, 0x3f800000    # 1.0f

    .line 190
    .line 191
    const/4 v13, 0x0

    .line 192
    const/4 v14, 0x0

    .line 193
    const/4 v15, 0x0

    .line 194
    const-string v4, ""

    .line 195
    .line 196
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 197
    .line 198
    .line 199
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 200
    .line 201
    .line 202
    move-result v3

    .line 203
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 204
    .line 205
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 206
    .line 207
    .line 208
    move-result-wide v6

    .line 209
    const/4 v2, 0x0

    .line 210
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 211
    .line 212
    .line 213
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 214
    .line 215
    .line 216
    move-result v10

    .line 217
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 218
    .line 219
    .line 220
    move-result v11

    .line 221
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 222
    .line 223
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 224
    .line 225
    .line 226
    const/high16 v4, 0x41480000    # 12.5f

    .line 227
    .line 228
    const/high16 v6, 0x41580000    # 13.5f

    .line 229
    .line 230
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 231
    .line 232
    .line 233
    const/high16 v4, 0x40c00000    # 6.0f

    .line 234
    .line 235
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 236
    .line 237
    .line 238
    const/high16 v4, 0x41700000    # 15.0f

    .line 239
    .line 240
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 241
    .line 242
    .line 243
    const/high16 v4, 0x41880000    # 17.0f

    .line 244
    .line 245
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 246
    .line 247
    .line 248
    const/high16 v4, 0x40000000    # 2.0f

    .line 249
    .line 250
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 251
    .line 252
    .line 253
    const/high16 v25, 0x3f800000    # 1.0f

    .line 254
    .line 255
    const/high16 v26, -0x40800000    # -1.0f

    .line 256
    .line 257
    const v21, 0x3f0ccccd    # 0.55f

    .line 258
    .line 259
    .line 260
    const/high16 v23, 0x3f800000    # 1.0f

    .line 261
    .line 262
    const v24, -0x4119999a    # -0.45f

    .line 263
    .line 264
    .line 265
    move-object/from16 v20, v2

    .line 266
    .line 267
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 268
    .line 269
    .line 270
    const/high16 v4, -0x3fe00000    # -2.5f

    .line 271
    .line 272
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 273
    .line 274
    .line 275
    const/high16 v25, -0x40800000    # -1.0f

    .line 276
    .line 277
    const/16 v21, 0x0

    .line 278
    .line 279
    const v22, -0x40f33333    # -0.55f

    .line 280
    .line 281
    .line 282
    const v23, -0x4119999a    # -0.45f

    .line 283
    .line 284
    .line 285
    const/high16 v24, -0x40800000    # -1.0f

    .line 286
    .line 287
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 288
    .line 289
    .line 290
    const/high16 v4, 0x41580000    # 13.5f

    .line 291
    .line 292
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 293
    .line 294
    .line 295
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 296
    .line 297
    .line 298
    const/high16 v4, 0x41840000    # 16.5f

    .line 299
    .line 300
    const/high16 v6, 0x41780000    # 15.5f

    .line 301
    .line 302
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 303
    .line 304
    .line 305
    const/high16 v4, 0x41700000    # 15.0f

    .line 306
    .line 307
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 308
    .line 309
    .line 310
    const/high16 v4, 0x41600000    # 14.0f

    .line 311
    .line 312
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 313
    .line 314
    .line 315
    const/high16 v4, 0x3fc00000    # 1.5f

    .line 316
    .line 317
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 318
    .line 319
    .line 320
    const/high16 v4, 0x41780000    # 15.5f

    .line 321
    .line 322
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 323
    .line 324
    .line 325
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 326
    .line 327
    .line 328
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 329
    .line 330
    .line 331
    move-result-object v2

    .line 332
    const/high16 v6, 0x3f800000    # 1.0f

    .line 333
    .line 334
    const/4 v7, 0x0

    .line 335
    const-string v4, ""

    .line 336
    .line 337
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 338
    .line 339
    .line 340
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 341
    .line 342
    .line 343
    move-result v3

    .line 344
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 345
    .line 346
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 347
    .line 348
    .line 349
    move-result-wide v6

    .line 350
    const/4 v2, 0x0

    .line 351
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 352
    .line 353
    .line 354
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 355
    .line 356
    .line 357
    move-result v10

    .line 358
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 359
    .line 360
    .line 361
    move-result v11

    .line 362
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 363
    .line 364
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 365
    .line 366
    .line 367
    const/high16 v4, 0x41980000    # 19.0f

    .line 368
    .line 369
    const/high16 v6, 0x40400000    # 3.0f

    .line 370
    .line 371
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 372
    .line 373
    .line 374
    const/high16 v4, 0x40a00000    # 5.0f

    .line 375
    .line 376
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 377
    .line 378
    .line 379
    const/high16 v25, 0x40400000    # 3.0f

    .line 380
    .line 381
    const/high16 v26, 0x40a00000    # 5.0f

    .line 382
    .line 383
    const v21, 0x4079999a    # 3.9f

    .line 384
    .line 385
    .line 386
    const/high16 v22, 0x40400000    # 3.0f

    .line 387
    .line 388
    const/high16 v23, 0x40400000    # 3.0f

    .line 389
    .line 390
    const v24, 0x4079999a    # 3.9f

    .line 391
    .line 392
    .line 393
    move-object/from16 v20, v2

    .line 394
    .line 395
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 396
    .line 397
    .line 398
    const/high16 v4, 0x41600000    # 14.0f

    .line 399
    .line 400
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 401
    .line 402
    .line 403
    const/high16 v25, 0x40000000    # 2.0f

    .line 404
    .line 405
    const/high16 v26, 0x40000000    # 2.0f

    .line 406
    .line 407
    const/16 v21, 0x0

    .line 408
    .line 409
    const v22, 0x3f8ccccd    # 1.1f

    .line 410
    .line 411
    .line 412
    const v23, 0x3f666666    # 0.9f

    .line 413
    .line 414
    .line 415
    const/high16 v24, 0x40000000    # 2.0f

    .line 416
    .line 417
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 418
    .line 419
    .line 420
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 421
    .line 422
    .line 423
    const/high16 v26, -0x40000000    # -2.0f

    .line 424
    .line 425
    const v21, 0x3f8ccccd    # 1.1f

    .line 426
    .line 427
    .line 428
    const/16 v22, 0x0

    .line 429
    .line 430
    const/high16 v23, 0x40000000    # 2.0f

    .line 431
    .line 432
    const v24, -0x4099999a    # -0.9f

    .line 433
    .line 434
    .line 435
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 436
    .line 437
    .line 438
    const/high16 v4, 0x40a00000    # 5.0f

    .line 439
    .line 440
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 441
    .line 442
    .line 443
    const/high16 v25, 0x41980000    # 19.0f

    .line 444
    .line 445
    const/high16 v26, 0x40400000    # 3.0f

    .line 446
    .line 447
    const/high16 v21, 0x41a80000    # 21.0f

    .line 448
    .line 449
    const v22, 0x4079999a    # 3.9f

    .line 450
    .line 451
    .line 452
    const v23, 0x41a0cccd    # 20.1f

    .line 453
    .line 454
    .line 455
    const/high16 v24, 0x40400000    # 3.0f

    .line 456
    .line 457
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 458
    .line 459
    .line 460
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 461
    .line 462
    .line 463
    const/high16 v4, 0x41980000    # 19.0f

    .line 464
    .line 465
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 466
    .line 467
    .line 468
    const/high16 v4, 0x40a00000    # 5.0f

    .line 469
    .line 470
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 471
    .line 472
    .line 473
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 474
    .line 475
    .line 476
    const/high16 v4, 0x41600000    # 14.0f

    .line 477
    .line 478
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 479
    .line 480
    .line 481
    const/high16 v4, 0x41980000    # 19.0f

    .line 482
    .line 483
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 484
    .line 485
    .line 486
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 487
    .line 488
    .line 489
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 490
    .line 491
    .line 492
    move-result-object v2

    .line 493
    const/high16 v6, 0x3f800000    # 1.0f

    .line 494
    .line 495
    const/4 v7, 0x0

    .line 496
    const-string v4, ""

    .line 497
    .line 498
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 499
    .line 500
    .line 501
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 502
    .line 503
    .line 504
    move-result v3

    .line 505
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 506
    .line 507
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 508
    .line 509
    .line 510
    move-result-wide v6

    .line 511
    const/4 v2, 0x0

    .line 512
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 513
    .line 514
    .line 515
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 516
    .line 517
    .line 518
    move-result v10

    .line 519
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 520
    .line 521
    .line 522
    move-result v11

    .line 523
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 524
    .line 525
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 526
    .line 527
    .line 528
    const/high16 v4, 0x41300000    # 11.0f

    .line 529
    .line 530
    const/high16 v6, 0x41200000    # 10.0f

    .line 531
    .line 532
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 533
    .line 534
    .line 535
    const/high16 v4, 0x41000000    # 8.0f

    .line 536
    .line 537
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 538
    .line 539
    .line 540
    const/high16 v4, 0x41100000    # 9.0f

    .line 541
    .line 542
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 543
    .line 544
    .line 545
    const/high16 v4, 0x40000000    # 2.0f

    .line 546
    .line 547
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 548
    .line 549
    .line 550
    const/high16 v25, 0x3f800000    # 1.0f

    .line 551
    .line 552
    const/high16 v26, -0x40800000    # -1.0f

    .line 553
    .line 554
    const v21, 0x3f0ccccd    # 0.55f

    .line 555
    .line 556
    .line 557
    const/16 v22, 0x0

    .line 558
    .line 559
    const/high16 v23, 0x3f800000    # 1.0f

    .line 560
    .line 561
    const v24, -0x4119999a    # -0.45f

    .line 562
    .line 563
    .line 564
    move-object/from16 v20, v2

    .line 565
    .line 566
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 567
    .line 568
    .line 569
    const/high16 v4, 0x40d00000    # 6.5f

    .line 570
    .line 571
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 572
    .line 573
    .line 574
    const/high16 v25, -0x40800000    # -1.0f

    .line 575
    .line 576
    const/16 v21, 0x0

    .line 577
    .line 578
    const v22, -0x40f33333    # -0.55f

    .line 579
    .line 580
    .line 581
    const v23, -0x4119999a    # -0.45f

    .line 582
    .line 583
    .line 584
    const/high16 v24, -0x40800000    # -1.0f

    .line 585
    .line 586
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 587
    .line 588
    .line 589
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 590
    .line 591
    .line 592
    const/high16 v4, 0x40e00000    # 7.0f

    .line 593
    .line 594
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 595
    .line 596
    .line 597
    const/high16 v4, 0x40400000    # 3.0f

    .line 598
    .line 599
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 600
    .line 601
    .line 602
    const/high16 v4, 0x3f800000    # 1.0f

    .line 603
    .line 604
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 605
    .line 606
    .line 607
    const/high16 v4, -0x40000000    # -2.0f

    .line 608
    .line 609
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 610
    .line 611
    .line 612
    const/high16 v26, 0x3f800000    # 1.0f

    .line 613
    .line 614
    const v21, -0x40f33333    # -0.55f

    .line 615
    .line 616
    .line 617
    const/16 v22, 0x0

    .line 618
    .line 619
    const/high16 v23, -0x40800000    # -1.0f

    .line 620
    .line 621
    const v24, 0x3ee66666    # 0.45f

    .line 622
    .line 623
    .line 624
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 625
    .line 626
    .line 627
    const/high16 v4, 0x40200000    # 2.5f

    .line 628
    .line 629
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 630
    .line 631
    .line 632
    const/high16 v4, 0x41300000    # 11.0f

    .line 633
    .line 634
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 635
    .line 636
    .line 637
    const/high16 v4, 0x41200000    # 10.0f

    .line 638
    .line 639
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 640
    .line 641
    .line 642
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 643
    .line 644
    .line 645
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 646
    .line 647
    .line 648
    move-result-object v2

    .line 649
    const/high16 v6, 0x3f800000    # 1.0f

    .line 650
    .line 651
    const/4 v7, 0x0

    .line 652
    const-string v4, ""

    .line 653
    .line 654
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 655
    .line 656
    .line 657
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 658
    .line 659
    .line 660
    move-result v3

    .line 661
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 662
    .line 663
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 664
    .line 665
    .line 666
    move-result-wide v6

    .line 667
    const/4 v0, 0x0

    .line 668
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 669
    .line 670
    .line 671
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 672
    .line 673
    .line 674
    move-result v10

    .line 675
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 676
    .line 677
    .line 678
    move-result v11

    .line 679
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 680
    .line 681
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 682
    .line 683
    .line 684
    const/high16 v0, 0x418c0000    # 17.5f

    .line 685
    .line 686
    const/high16 v2, 0x41200000    # 10.0f

    .line 687
    .line 688
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 689
    .line 690
    .line 691
    const/high16 v0, -0x3fc00000    # -3.0f

    .line 692
    .line 693
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 694
    .line 695
    .line 696
    const/high16 v0, 0x41100000    # 9.0f

    .line 697
    .line 698
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 699
    .line 700
    .line 701
    const/high16 v0, 0x40000000    # 2.0f

    .line 702
    .line 703
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 704
    .line 705
    .line 706
    const/high16 v17, 0x3f800000    # 1.0f

    .line 707
    .line 708
    const/high16 v18, -0x40800000    # -1.0f

    .line 709
    .line 710
    const v13, 0x3f0ccccd    # 0.55f

    .line 711
    .line 712
    .line 713
    const/high16 v15, 0x3f800000    # 1.0f

    .line 714
    .line 715
    const v16, -0x4119999a    # -0.45f

    .line 716
    .line 717
    .line 718
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 719
    .line 720
    .line 721
    const/high16 v0, 0x40d00000    # 6.5f

    .line 722
    .line 723
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 724
    .line 725
    .line 726
    const/high16 v17, -0x40800000    # -1.0f

    .line 727
    .line 728
    const/4 v13, 0x0

    .line 729
    const v14, -0x40f33333    # -0.55f

    .line 730
    .line 731
    .line 732
    const v15, -0x4119999a    # -0.45f

    .line 733
    .line 734
    .line 735
    const/high16 v16, -0x40800000    # -1.0f

    .line 736
    .line 737
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 738
    .line 739
    .line 740
    const/high16 v0, 0x41500000    # 13.0f

    .line 741
    .line 742
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 743
    .line 744
    .line 745
    const/high16 v0, 0x40e00000    # 7.0f

    .line 746
    .line 747
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 748
    .line 749
    .line 750
    const/high16 v0, 0x40400000    # 3.0f

    .line 751
    .line 752
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 753
    .line 754
    .line 755
    const/high16 v0, 0x3f800000    # 1.0f

    .line 756
    .line 757
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 758
    .line 759
    .line 760
    const/high16 v0, -0x40000000    # -2.0f

    .line 761
    .line 762
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 763
    .line 764
    .line 765
    const/high16 v18, 0x3f800000    # 1.0f

    .line 766
    .line 767
    const v13, -0x40f33333    # -0.55f

    .line 768
    .line 769
    .line 770
    const/4 v14, 0x0

    .line 771
    const/high16 v15, -0x40800000    # -1.0f

    .line 772
    .line 773
    const v16, 0x3ee66666    # 0.45f

    .line 774
    .line 775
    .line 776
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 777
    .line 778
    .line 779
    const/high16 v0, 0x40200000    # 2.5f

    .line 780
    .line 781
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 782
    .line 783
    .line 784
    const/high16 v0, 0x40900000    # 4.5f

    .line 785
    .line 786
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 787
    .line 788
    .line 789
    const/high16 v0, 0x41200000    # 10.0f

    .line 790
    .line 791
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 792
    .line 793
    .line 794
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 795
    .line 796
    .line 797
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 798
    .line 799
    .line 800
    move-result-object v2

    .line 801
    const/16 v16, 0x3800

    .line 802
    .line 803
    const/16 v17, 0x0

    .line 804
    .line 805
    const/high16 v6, 0x3f800000    # 1.0f

    .line 806
    .line 807
    const/4 v7, 0x0

    .line 808
    const/high16 v12, 0x3f800000    # 1.0f

    .line 809
    .line 810
    const/4 v13, 0x0

    .line 811
    const/4 v15, 0x0

    .line 812
    const-string v4, ""

    .line 813
    .line 814
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 815
    .line 816
    .line 817
    move-result-object v0

    .line 818
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 819
    .line 820
    .line 821
    move-result-object v0

    .line 822
    sput-object v0, Landroidx/compose/material/icons/outlined/_22mpKt;->__22mp:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 823
    .line 824
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 825
    .line 826
    .line 827
    return-object v0
.end method
