.class public final Landroidx/compose/material/icons/twotone/_6mpKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static __6mp:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final get_6mp(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/_6mpKt;->__6mp:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone._6mp"

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
    const v6, 0x3e99999a    # 0.3f

    .line 102
    .line 103
    .line 104
    const v8, 0x3e99999a    # 0.3f

    .line 105
    .line 106
    .line 107
    const/4 v7, 0x0

    .line 108
    const/high16 v9, 0x3f800000    # 1.0f

    .line 109
    .line 110
    const/high16 v12, 0x3f800000    # 1.0f

    .line 111
    .line 112
    const/4 v13, 0x0

    .line 113
    const/4 v14, 0x0

    .line 114
    const/4 v15, 0x0

    .line 115
    const-string v4, ""

    .line 116
    .line 117
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 118
    .line 119
    .line 120
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 121
    .line 122
    .line 123
    move-result v3

    .line 124
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 125
    .line 126
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 127
    .line 128
    .line 129
    move-result-wide v6

    .line 130
    const/4 v2, 0x0

    .line 131
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 132
    .line 133
    .line 134
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 135
    .line 136
    .line 137
    move-result v10

    .line 138
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 139
    .line 140
    .line 141
    move-result v11

    .line 142
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 143
    .line 144
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 145
    .line 146
    .line 147
    const/high16 v4, 0x41380000    # 11.5f

    .line 148
    .line 149
    const/high16 v6, 0x41100000    # 9.0f

    .line 150
    .line 151
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 152
    .line 153
    .line 154
    const/high16 v4, 0x3fc00000    # 1.5f

    .line 155
    .line 156
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 157
    .line 158
    .line 159
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 160
    .line 161
    .line 162
    const/high16 v4, -0x40400000    # -1.5f

    .line 163
    .line 164
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 165
    .line 166
    .line 167
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 168
    .line 169
    .line 170
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 171
    .line 172
    .line 173
    move-result-object v2

    .line 174
    const v6, 0x3e99999a    # 0.3f

    .line 175
    .line 176
    .line 177
    const/4 v7, 0x0

    .line 178
    const-string v4, ""

    .line 179
    .line 180
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 181
    .line 182
    .line 183
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 184
    .line 185
    .line 186
    move-result v3

    .line 187
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 188
    .line 189
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 190
    .line 191
    .line 192
    move-result-wide v6

    .line 193
    const/4 v2, 0x0

    .line 194
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 195
    .line 196
    .line 197
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 198
    .line 199
    .line 200
    move-result v10

    .line 201
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 202
    .line 203
    .line 204
    move-result v11

    .line 205
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 206
    .line 207
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 208
    .line 209
    .line 210
    const/high16 v4, 0x41980000    # 19.0f

    .line 211
    .line 212
    const/high16 v6, 0x40a00000    # 5.0f

    .line 213
    .line 214
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 215
    .line 216
    .line 217
    const/high16 v4, 0x41600000    # 14.0f

    .line 218
    .line 219
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 220
    .line 221
    .line 222
    const/high16 v4, 0x40a00000    # 5.0f

    .line 223
    .line 224
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 225
    .line 226
    .line 227
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 228
    .line 229
    .line 230
    const/high16 v4, 0x41980000    # 19.0f

    .line 231
    .line 232
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 233
    .line 234
    .line 235
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 236
    .line 237
    .line 238
    const/high16 v4, 0x41900000    # 18.0f

    .line 239
    .line 240
    const/high16 v6, 0x41580000    # 13.5f

    .line 241
    .line 242
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 243
    .line 244
    .line 245
    const/high16 v4, 0x41800000    # 16.0f

    .line 246
    .line 247
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 248
    .line 249
    .line 250
    const/high16 v25, -0x40800000    # -1.0f

    .line 251
    .line 252
    const/high16 v26, 0x3f800000    # 1.0f

    .line 253
    .line 254
    const/16 v21, 0x0

    .line 255
    .line 256
    const v22, 0x3f0ccccd    # 0.55f

    .line 257
    .line 258
    .line 259
    const v23, -0x4119999a    # -0.45f

    .line 260
    .line 261
    .line 262
    const/high16 v24, 0x3f800000    # 1.0f

    .line 263
    .line 264
    move-object/from16 v20, v2

    .line 265
    .line 266
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 267
    .line 268
    .line 269
    const/high16 v4, -0x40000000    # -2.0f

    .line 270
    .line 271
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 272
    .line 273
    .line 274
    const/high16 v4, 0x3fc00000    # 1.5f

    .line 275
    .line 276
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 277
    .line 278
    .line 279
    const/high16 v4, -0x40400000    # -1.5f

    .line 280
    .line 281
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 282
    .line 283
    .line 284
    const/high16 v4, -0x3f400000    # -6.0f

    .line 285
    .line 286
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 287
    .line 288
    .line 289
    const/high16 v4, 0x41880000    # 17.0f

    .line 290
    .line 291
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 292
    .line 293
    .line 294
    const/high16 v25, 0x41900000    # 18.0f

    .line 295
    .line 296
    const/high16 v26, 0x41580000    # 13.5f

    .line 297
    .line 298
    const v21, 0x418c6666    # 17.55f

    .line 299
    .line 300
    .line 301
    const/high16 v22, 0x41480000    # 12.5f

    .line 302
    .line 303
    const/high16 v23, 0x41900000    # 18.0f

    .line 304
    .line 305
    const v24, 0x414f3333    # 12.95f

    .line 306
    .line 307
    .line 308
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 309
    .line 310
    .line 311
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 312
    .line 313
    .line 314
    const/high16 v4, 0x40d00000    # 6.5f

    .line 315
    .line 316
    const/high16 v6, 0x41200000    # 10.0f

    .line 317
    .line 318
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 319
    .line 320
    .line 321
    const/high16 v25, 0x3f800000    # 1.0f

    .line 322
    .line 323
    const/high16 v26, -0x40800000    # -1.0f

    .line 324
    .line 325
    const/16 v21, 0x0

    .line 326
    .line 327
    const v22, -0x40f33333    # -0.55f

    .line 328
    .line 329
    .line 330
    const v23, 0x3ee66666    # 0.45f

    .line 331
    .line 332
    .line 333
    const/high16 v24, -0x40800000    # -1.0f

    .line 334
    .line 335
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 336
    .line 337
    .line 338
    const/high16 v4, 0x40600000    # 3.5f

    .line 339
    .line 340
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 341
    .line 342
    .line 343
    const/high16 v4, 0x40e00000    # 7.0f

    .line 344
    .line 345
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 346
    .line 347
    .line 348
    const/high16 v4, -0x3fc00000    # -3.0f

    .line 349
    .line 350
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 351
    .line 352
    .line 353
    const/high16 v4, 0x3f800000    # 1.0f

    .line 354
    .line 355
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 356
    .line 357
    .line 358
    const/high16 v4, 0x40000000    # 2.0f

    .line 359
    .line 360
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 361
    .line 362
    .line 363
    const/high16 v26, 0x3f800000    # 1.0f

    .line 364
    .line 365
    const v21, 0x3f0ccccd    # 0.55f

    .line 366
    .line 367
    .line 368
    const/16 v22, 0x0

    .line 369
    .line 370
    const/high16 v23, 0x3f800000    # 1.0f

    .line 371
    .line 372
    const v24, 0x3ee66666    # 0.45f

    .line 373
    .line 374
    .line 375
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 376
    .line 377
    .line 378
    const/high16 v4, 0x3fc00000    # 1.5f

    .line 379
    .line 380
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 381
    .line 382
    .line 383
    const/high16 v25, -0x40800000    # -1.0f

    .line 384
    .line 385
    const/16 v21, 0x0

    .line 386
    .line 387
    const v22, 0x3f0ccccd    # 0.55f

    .line 388
    .line 389
    .line 390
    const v23, -0x4119999a    # -0.45f

    .line 391
    .line 392
    .line 393
    const/high16 v24, 0x3f800000    # 1.0f

    .line 394
    .line 395
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 396
    .line 397
    .line 398
    const/high16 v4, 0x41300000    # 11.0f

    .line 399
    .line 400
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 401
    .line 402
    .line 403
    const/high16 v26, -0x40800000    # -1.0f

    .line 404
    .line 405
    const v21, -0x40f33333    # -0.55f

    .line 406
    .line 407
    .line 408
    const/16 v22, 0x0

    .line 409
    .line 410
    const/high16 v23, -0x40800000    # -1.0f

    .line 411
    .line 412
    const v24, -0x4119999a    # -0.45f

    .line 413
    .line 414
    .line 415
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 416
    .line 417
    .line 418
    const/high16 v4, 0x40d00000    # 6.5f

    .line 419
    .line 420
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 421
    .line 422
    .line 423
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 424
    .line 425
    .line 426
    const/high16 v4, 0x40c00000    # 6.0f

    .line 427
    .line 428
    const/high16 v6, 0x41580000    # 13.5f

    .line 429
    .line 430
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 431
    .line 432
    .line 433
    const/high16 v25, 0x3f800000    # 1.0f

    .line 434
    .line 435
    const/16 v21, 0x0

    .line 436
    .line 437
    const v22, -0x40f33333    # -0.55f

    .line 438
    .line 439
    .line 440
    const v23, 0x3ee66666    # 0.45f

    .line 441
    .line 442
    .line 443
    const/high16 v24, -0x40800000    # -1.0f

    .line 444
    .line 445
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 446
    .line 447
    .line 448
    const/high16 v4, 0x40900000    # 4.5f

    .line 449
    .line 450
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 451
    .line 452
    .line 453
    const/high16 v26, 0x3f800000    # 1.0f

    .line 454
    .line 455
    const v21, 0x3f0ccccd    # 0.55f

    .line 456
    .line 457
    .line 458
    const/16 v22, 0x0

    .line 459
    .line 460
    const/high16 v23, 0x3f800000    # 1.0f

    .line 461
    .line 462
    const v24, 0x3ee66666    # 0.45f

    .line 463
    .line 464
    .line 465
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 466
    .line 467
    .line 468
    const/high16 v4, 0x40a00000    # 5.0f

    .line 469
    .line 470
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 471
    .line 472
    .line 473
    const/high16 v4, 0x41300000    # 11.0f

    .line 474
    .line 475
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 476
    .line 477
    .line 478
    const/high16 v4, 0x41600000    # 14.0f

    .line 479
    .line 480
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 481
    .line 482
    .line 483
    const/high16 v4, -0x40800000    # -1.0f

    .line 484
    .line 485
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 486
    .line 487
    .line 488
    const/high16 v4, 0x40400000    # 3.0f

    .line 489
    .line 490
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 491
    .line 492
    .line 493
    const/high16 v4, 0x41080000    # 8.5f

    .line 494
    .line 495
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 496
    .line 497
    .line 498
    const/high16 v4, -0x3fc00000    # -3.0f

    .line 499
    .line 500
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 501
    .line 502
    .line 503
    const/high16 v4, -0x40800000    # -1.0f

    .line 504
    .line 505
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 506
    .line 507
    .line 508
    const/high16 v4, 0x40900000    # 4.5f

    .line 509
    .line 510
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 511
    .line 512
    .line 513
    const/high16 v4, 0x40c00000    # 6.0f

    .line 514
    .line 515
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 516
    .line 517
    .line 518
    const/high16 v4, 0x41580000    # 13.5f

    .line 519
    .line 520
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 521
    .line 522
    .line 523
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 524
    .line 525
    .line 526
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 527
    .line 528
    .line 529
    move-result-object v2

    .line 530
    const v6, 0x3e99999a    # 0.3f

    .line 531
    .line 532
    .line 533
    const/4 v7, 0x0

    .line 534
    const-string v4, ""

    .line 535
    .line 536
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 537
    .line 538
    .line 539
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 540
    .line 541
    .line 542
    move-result v3

    .line 543
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 544
    .line 545
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 546
    .line 547
    .line 548
    move-result-wide v6

    .line 549
    const/4 v2, 0x0

    .line 550
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 551
    .line 552
    .line 553
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 554
    .line 555
    .line 556
    move-result v10

    .line 557
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 558
    .line 559
    .line 560
    move-result v11

    .line 561
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 562
    .line 563
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 564
    .line 565
    .line 566
    const/high16 v4, 0x40f00000    # 7.5f

    .line 567
    .line 568
    const/high16 v6, 0x41600000    # 14.0f

    .line 569
    .line 570
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 571
    .line 572
    .line 573
    const/high16 v4, 0x3f800000    # 1.0f

    .line 574
    .line 575
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 576
    .line 577
    .line 578
    const/high16 v4, 0x40400000    # 3.0f

    .line 579
    .line 580
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 581
    .line 582
    .line 583
    const/high16 v4, 0x41200000    # 10.0f

    .line 584
    .line 585
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 586
    .line 587
    .line 588
    const/high16 v4, -0x3fc00000    # -3.0f

    .line 589
    .line 590
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 591
    .line 592
    .line 593
    const/high16 v4, 0x3f800000    # 1.0f

    .line 594
    .line 595
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 596
    .line 597
    .line 598
    const/high16 v4, 0x40900000    # 4.5f

    .line 599
    .line 600
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 601
    .line 602
    .line 603
    const/high16 v4, 0x3fc00000    # 1.5f

    .line 604
    .line 605
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 606
    .line 607
    .line 608
    const/high16 v4, -0x3f600000    # -5.0f

    .line 609
    .line 610
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 611
    .line 612
    .line 613
    const/high16 v25, -0x40800000    # -1.0f

    .line 614
    .line 615
    const/high16 v26, -0x40800000    # -1.0f

    .line 616
    .line 617
    const/16 v21, 0x0

    .line 618
    .line 619
    const v22, -0x40f33333    # -0.55f

    .line 620
    .line 621
    .line 622
    const v23, -0x4119999a    # -0.45f

    .line 623
    .line 624
    .line 625
    const/high16 v24, -0x40800000    # -1.0f

    .line 626
    .line 627
    move-object/from16 v20, v2

    .line 628
    .line 629
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 630
    .line 631
    .line 632
    const/high16 v4, 0x40e00000    # 7.0f

    .line 633
    .line 634
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 635
    .line 636
    .line 637
    const/high16 v26, 0x3f800000    # 1.0f

    .line 638
    .line 639
    const v21, -0x40f33333    # -0.55f

    .line 640
    .line 641
    .line 642
    const/16 v22, 0x0

    .line 643
    .line 644
    const/high16 v23, -0x40800000    # -1.0f

    .line 645
    .line 646
    const v24, 0x3ee66666    # 0.45f

    .line 647
    .line 648
    .line 649
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 650
    .line 651
    .line 652
    const/high16 v4, 0x40a00000    # 5.0f

    .line 653
    .line 654
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 655
    .line 656
    .line 657
    const/high16 v4, 0x3fc00000    # 1.5f

    .line 658
    .line 659
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 660
    .line 661
    .line 662
    const/high16 v4, 0x41600000    # 14.0f

    .line 663
    .line 664
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 665
    .line 666
    .line 667
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 668
    .line 669
    .line 670
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 671
    .line 672
    .line 673
    move-result-object v2

    .line 674
    const/high16 v6, 0x3f800000    # 1.0f

    .line 675
    .line 676
    const/high16 v8, 0x3f800000    # 1.0f

    .line 677
    .line 678
    const/4 v7, 0x0

    .line 679
    const-string v4, ""

    .line 680
    .line 681
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 682
    .line 683
    .line 684
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 685
    .line 686
    .line 687
    move-result v3

    .line 688
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 689
    .line 690
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 691
    .line 692
    .line 693
    move-result-wide v6

    .line 694
    const/4 v2, 0x0

    .line 695
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 696
    .line 697
    .line 698
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 699
    .line 700
    .line 701
    move-result v10

    .line 702
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 703
    .line 704
    .line 705
    move-result v11

    .line 706
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 707
    .line 708
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 709
    .line 710
    .line 711
    const/high16 v4, 0x41940000    # 18.5f

    .line 712
    .line 713
    const/high16 v6, 0x41580000    # 13.5f

    .line 714
    .line 715
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 716
    .line 717
    .line 718
    const/high16 v4, 0x41700000    # 15.0f

    .line 719
    .line 720
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 721
    .line 722
    .line 723
    const/high16 v4, 0x41880000    # 17.0f

    .line 724
    .line 725
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 726
    .line 727
    .line 728
    const/high16 v4, 0x40000000    # 2.0f

    .line 729
    .line 730
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 731
    .line 732
    .line 733
    const/high16 v25, 0x3f800000    # 1.0f

    .line 734
    .line 735
    const/high16 v26, -0x40800000    # -1.0f

    .line 736
    .line 737
    const v21, 0x3f0ccccd    # 0.55f

    .line 738
    .line 739
    .line 740
    const/high16 v23, 0x3f800000    # 1.0f

    .line 741
    .line 742
    const v24, -0x4119999a    # -0.45f

    .line 743
    .line 744
    .line 745
    move-object/from16 v20, v2

    .line 746
    .line 747
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 748
    .line 749
    .line 750
    const/high16 v4, -0x3fe00000    # -2.5f

    .line 751
    .line 752
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 753
    .line 754
    .line 755
    const/high16 v25, -0x40800000    # -1.0f

    .line 756
    .line 757
    const/16 v21, 0x0

    .line 758
    .line 759
    const v22, -0x40f33333    # -0.55f

    .line 760
    .line 761
    .line 762
    const v23, -0x4119999a    # -0.45f

    .line 763
    .line 764
    .line 765
    const/high16 v24, -0x40800000    # -1.0f

    .line 766
    .line 767
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 768
    .line 769
    .line 770
    const/high16 v4, -0x3fa00000    # -3.5f

    .line 771
    .line 772
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 773
    .line 774
    .line 775
    const/high16 v4, 0x41940000    # 18.5f

    .line 776
    .line 777
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 778
    .line 779
    .line 780
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 781
    .line 782
    .line 783
    const/high16 v4, 0x41700000    # 15.0f

    .line 784
    .line 785
    const/high16 v6, 0x41600000    # 14.0f

    .line 786
    .line 787
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 788
    .line 789
    .line 790
    const/high16 v4, 0x3fc00000    # 1.5f

    .line 791
    .line 792
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 793
    .line 794
    .line 795
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 796
    .line 797
    .line 798
    const/high16 v4, 0x41700000    # 15.0f

    .line 799
    .line 800
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 801
    .line 802
    .line 803
    const/high16 v4, 0x41600000    # 14.0f

    .line 804
    .line 805
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 806
    .line 807
    .line 808
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 809
    .line 810
    .line 811
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 812
    .line 813
    .line 814
    move-result-object v2

    .line 815
    const/high16 v6, 0x3f800000    # 1.0f

    .line 816
    .line 817
    const/4 v7, 0x0

    .line 818
    const-string v4, ""

    .line 819
    .line 820
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 821
    .line 822
    .line 823
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 824
    .line 825
    .line 826
    move-result v3

    .line 827
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 828
    .line 829
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 830
    .line 831
    .line 832
    move-result-wide v6

    .line 833
    const/4 v2, 0x0

    .line 834
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 835
    .line 836
    .line 837
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 838
    .line 839
    .line 840
    move-result v10

    .line 841
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 842
    .line 843
    .line 844
    move-result v11

    .line 845
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 846
    .line 847
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 848
    .line 849
    .line 850
    const/high16 v4, 0x40400000    # 3.0f

    .line 851
    .line 852
    const/high16 v6, 0x41980000    # 19.0f

    .line 853
    .line 854
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 855
    .line 856
    .line 857
    const/high16 v4, 0x40a00000    # 5.0f

    .line 858
    .line 859
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 860
    .line 861
    .line 862
    const/high16 v25, 0x40400000    # 3.0f

    .line 863
    .line 864
    const/high16 v26, 0x40a00000    # 5.0f

    .line 865
    .line 866
    const v21, 0x4079999a    # 3.9f

    .line 867
    .line 868
    .line 869
    const/high16 v22, 0x40400000    # 3.0f

    .line 870
    .line 871
    const/high16 v23, 0x40400000    # 3.0f

    .line 872
    .line 873
    const v24, 0x4079999a    # 3.9f

    .line 874
    .line 875
    .line 876
    move-object/from16 v20, v2

    .line 877
    .line 878
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 879
    .line 880
    .line 881
    const/high16 v4, 0x41600000    # 14.0f

    .line 882
    .line 883
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 884
    .line 885
    .line 886
    const/high16 v25, 0x40000000    # 2.0f

    .line 887
    .line 888
    const/high16 v26, 0x40000000    # 2.0f

    .line 889
    .line 890
    const/16 v21, 0x0

    .line 891
    .line 892
    const v22, 0x3f8ccccd    # 1.1f

    .line 893
    .line 894
    .line 895
    const v23, 0x3f666666    # 0.9f

    .line 896
    .line 897
    .line 898
    const/high16 v24, 0x40000000    # 2.0f

    .line 899
    .line 900
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 901
    .line 902
    .line 903
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 904
    .line 905
    .line 906
    const/high16 v26, -0x40000000    # -2.0f

    .line 907
    .line 908
    const v21, 0x3f8ccccd    # 1.1f

    .line 909
    .line 910
    .line 911
    const/16 v22, 0x0

    .line 912
    .line 913
    const/high16 v23, 0x40000000    # 2.0f

    .line 914
    .line 915
    const v24, -0x4099999a    # -0.9f

    .line 916
    .line 917
    .line 918
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 919
    .line 920
    .line 921
    const/high16 v4, 0x40a00000    # 5.0f

    .line 922
    .line 923
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 924
    .line 925
    .line 926
    const/high16 v25, 0x41980000    # 19.0f

    .line 927
    .line 928
    const/high16 v26, 0x40400000    # 3.0f

    .line 929
    .line 930
    const/high16 v21, 0x41a80000    # 21.0f

    .line 931
    .line 932
    const v22, 0x4079999a    # 3.9f

    .line 933
    .line 934
    .line 935
    const v23, 0x41a0cccd    # 20.1f

    .line 936
    .line 937
    .line 938
    const/high16 v24, 0x40400000    # 3.0f

    .line 939
    .line 940
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 941
    .line 942
    .line 943
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 944
    .line 945
    .line 946
    const/high16 v4, 0x41980000    # 19.0f

    .line 947
    .line 948
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 949
    .line 950
    .line 951
    const/high16 v4, 0x40a00000    # 5.0f

    .line 952
    .line 953
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 954
    .line 955
    .line 956
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 957
    .line 958
    .line 959
    const/high16 v4, 0x41600000    # 14.0f

    .line 960
    .line 961
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 962
    .line 963
    .line 964
    const/high16 v4, 0x41980000    # 19.0f

    .line 965
    .line 966
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 967
    .line 968
    .line 969
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 970
    .line 971
    .line 972
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 973
    .line 974
    .line 975
    move-result-object v2

    .line 976
    const/high16 v6, 0x3f800000    # 1.0f

    .line 977
    .line 978
    const/4 v7, 0x0

    .line 979
    const-string v4, ""

    .line 980
    .line 981
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 982
    .line 983
    .line 984
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 985
    .line 986
    .line 987
    move-result v3

    .line 988
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 989
    .line 990
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 991
    .line 992
    .line 993
    move-result-wide v6

    .line 994
    const/4 v0, 0x0

    .line 995
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 996
    .line 997
    .line 998
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 999
    .line 1000
    .line 1001
    move-result v10

    .line 1002
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 1003
    .line 1004
    .line 1005
    move-result v11

    .line 1006
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1007
    .line 1008
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 1009
    .line 1010
    .line 1011
    const/high16 v0, 0x41380000    # 11.5f

    .line 1012
    .line 1013
    const/high16 v2, 0x41300000    # 11.0f

    .line 1014
    .line 1015
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1016
    .line 1017
    .line 1018
    const/high16 v0, 0x40200000    # 2.5f

    .line 1019
    .line 1020
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1021
    .line 1022
    .line 1023
    const/high16 v17, 0x3f800000    # 1.0f

    .line 1024
    .line 1025
    const/high16 v18, -0x40800000    # -1.0f

    .line 1026
    .line 1027
    const v13, 0x3f0ccccd    # 0.55f

    .line 1028
    .line 1029
    .line 1030
    const/high16 v15, 0x3f800000    # 1.0f

    .line 1031
    .line 1032
    const v16, -0x4119999a    # -0.45f

    .line 1033
    .line 1034
    .line 1035
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1036
    .line 1037
    .line 1038
    const/high16 v0, 0x41100000    # 9.0f

    .line 1039
    .line 1040
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1041
    .line 1042
    .line 1043
    const/high16 v17, -0x40800000    # -1.0f

    .line 1044
    .line 1045
    const/4 v13, 0x0

    .line 1046
    const v14, -0x40f33333    # -0.55f

    .line 1047
    .line 1048
    .line 1049
    const v15, -0x4119999a    # -0.45f

    .line 1050
    .line 1051
    .line 1052
    const/high16 v16, -0x40800000    # -1.0f

    .line 1053
    .line 1054
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1055
    .line 1056
    .line 1057
    const/high16 v0, -0x40000000    # -2.0f

    .line 1058
    .line 1059
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1060
    .line 1061
    .line 1062
    const/high16 v0, 0x40e00000    # 7.0f

    .line 1063
    .line 1064
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1065
    .line 1066
    .line 1067
    const/high16 v0, 0x40400000    # 3.0f

    .line 1068
    .line 1069
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1070
    .line 1071
    .line 1072
    const/high16 v0, 0x40b00000    # 5.5f

    .line 1073
    .line 1074
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1075
    .line 1076
    .line 1077
    const/high16 v0, 0x41300000    # 11.0f

    .line 1078
    .line 1079
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1080
    .line 1081
    .line 1082
    const/high16 v18, 0x3f800000    # 1.0f

    .line 1083
    .line 1084
    const v13, -0x40f33333    # -0.55f

    .line 1085
    .line 1086
    .line 1087
    const/4 v14, 0x0

    .line 1088
    const/high16 v15, -0x40800000    # -1.0f

    .line 1089
    .line 1090
    const v16, 0x3ee66666    # 0.45f

    .line 1091
    .line 1092
    .line 1093
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1094
    .line 1095
    .line 1096
    const/high16 v0, 0x40800000    # 4.0f

    .line 1097
    .line 1098
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1099
    .line 1100
    .line 1101
    const/high16 v17, 0x41300000    # 11.0f

    .line 1102
    .line 1103
    const/high16 v18, 0x41380000    # 11.5f

    .line 1104
    .line 1105
    const/high16 v13, 0x41200000    # 10.0f

    .line 1106
    .line 1107
    const v14, 0x4130cccd    # 11.05f

    .line 1108
    .line 1109
    .line 1110
    const v15, 0x41273333    # 10.45f

    .line 1111
    .line 1112
    .line 1113
    const/high16 v16, 0x41380000    # 11.5f

    .line 1114
    .line 1115
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1116
    .line 1117
    .line 1118
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1119
    .line 1120
    .line 1121
    const/high16 v0, 0x41380000    # 11.5f

    .line 1122
    .line 1123
    const/high16 v2, 0x41100000    # 9.0f

    .line 1124
    .line 1125
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1126
    .line 1127
    .line 1128
    const/high16 v0, 0x41500000    # 13.0f

    .line 1129
    .line 1130
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1131
    .line 1132
    .line 1133
    const/high16 v0, 0x3fc00000    # 1.5f

    .line 1134
    .line 1135
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1136
    .line 1137
    .line 1138
    const/high16 v0, -0x40400000    # -1.5f

    .line 1139
    .line 1140
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1141
    .line 1142
    .line 1143
    const/high16 v0, 0x41100000    # 9.0f

    .line 1144
    .line 1145
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1146
    .line 1147
    .line 1148
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1149
    .line 1150
    .line 1151
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 1152
    .line 1153
    .line 1154
    move-result-object v2

    .line 1155
    const/16 v16, 0x3800

    .line 1156
    .line 1157
    const/16 v17, 0x0

    .line 1158
    .line 1159
    const/high16 v6, 0x3f800000    # 1.0f

    .line 1160
    .line 1161
    const/4 v7, 0x0

    .line 1162
    const/high16 v12, 0x3f800000    # 1.0f

    .line 1163
    .line 1164
    const/4 v13, 0x0

    .line 1165
    const/4 v14, 0x0

    .line 1166
    const/4 v15, 0x0

    .line 1167
    const-string v4, ""

    .line 1168
    .line 1169
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 1170
    .line 1171
    .line 1172
    move-result-object v0

    .line 1173
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1174
    .line 1175
    .line 1176
    move-result-object v0

    .line 1177
    sput-object v0, Landroidx/compose/material/icons/twotone/_6mpKt;->__6mp:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1178
    .line 1179
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 1180
    .line 1181
    .line 1182
    return-object v0
.end method
