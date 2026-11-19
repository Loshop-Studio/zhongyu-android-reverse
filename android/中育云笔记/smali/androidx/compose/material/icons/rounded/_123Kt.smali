.class public final Landroidx/compose/material/icons/rounded/_123Kt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static __123:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final get_123(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/_123Kt;->__123:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded._123"

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
    const/high16 v0, 0x41280000    # 10.5f

    .line 71
    .line 72
    const/high16 v2, 0x40980000    # 4.75f

    .line 73
    .line 74
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v17, 0x40800000    # 4.0f

    .line 78
    .line 79
    const/high16 v18, 0x411c0000    # 9.75f

    .line 80
    .line 81
    const v13, 0x408ae148    # 4.34f

    .line 82
    .line 83
    .line 84
    const/high16 v14, 0x41280000    # 10.5f

    .line 85
    .line 86
    const/high16 v15, 0x40800000    # 4.0f

    .line 87
    .line 88
    const v16, 0x41228f5c    # 10.16f

    .line 89
    .line 90
    .line 91
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 92
    .line 93
    .line 94
    const v0, 0x408ae148    # 4.34f

    .line 95
    .line 96
    .line 97
    const/high16 v2, 0x41100000    # 9.0f

    .line 98
    .line 99
    const/high16 v4, 0x40980000    # 4.75f

    .line 100
    .line 101
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 102
    .line 103
    .line 104
    const/high16 v0, 0x40c00000    # 6.0f

    .line 105
    .line 106
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 107
    .line 108
    .line 109
    const/high16 v17, 0x3f800000    # 1.0f

    .line 110
    .line 111
    const/high16 v18, 0x3f800000    # 1.0f

    .line 112
    .line 113
    const v13, 0x3f0ccccd    # 0.55f

    .line 114
    .line 115
    .line 116
    const/4 v14, 0x0

    .line 117
    const/high16 v15, 0x3f800000    # 1.0f

    .line 118
    .line 119
    const v16, 0x3ee66666    # 0.45f

    .line 120
    .line 121
    .line 122
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 123
    .line 124
    .line 125
    const/high16 v0, 0x40880000    # 4.25f

    .line 126
    .line 127
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 128
    .line 129
    .line 130
    const/high16 v17, 0x40c80000    # 6.25f

    .line 131
    .line 132
    const/high16 v18, 0x41700000    # 15.0f

    .line 133
    .line 134
    const/high16 v13, 0x40e00000    # 7.0f

    .line 135
    .line 136
    const v14, 0x416a8f5c    # 14.66f

    .line 137
    .line 138
    .line 139
    const v15, 0x40d51eb8    # 6.66f

    .line 140
    .line 141
    .line 142
    const/high16 v16, 0x41700000    # 15.0f

    .line 143
    .line 144
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 145
    .line 146
    .line 147
    const v0, 0x416a8f5c    # 14.66f

    .line 148
    .line 149
    .line 150
    const/high16 v2, 0x41640000    # 14.25f

    .line 151
    .line 152
    const/high16 v4, 0x40b00000    # 5.5f

    .line 153
    .line 154
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 155
    .line 156
    .line 157
    const/high16 v0, 0x41280000    # 10.5f

    .line 158
    .line 159
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 160
    .line 161
    .line 162
    const/high16 v0, 0x40980000    # 4.75f

    .line 163
    .line 164
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 165
    .line 166
    .line 167
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 168
    .line 169
    .line 170
    const/high16 v0, 0x411c0000    # 9.75f

    .line 171
    .line 172
    const/high16 v2, 0x41100000    # 9.0f

    .line 173
    .line 174
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 175
    .line 176
    .line 177
    const/high16 v17, 0x41100000    # 9.0f

    .line 178
    .line 179
    const/high16 v18, 0x411c0000    # 9.75f

    .line 180
    .line 181
    const v13, 0x411570a4    # 9.34f

    .line 182
    .line 183
    .line 184
    const/high16 v14, 0x41100000    # 9.0f

    .line 185
    .line 186
    const/high16 v15, 0x41100000    # 9.0f

    .line 187
    .line 188
    const v16, 0x411570a4    # 9.34f

    .line 189
    .line 190
    .line 191
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 192
    .line 193
    .line 194
    const v0, 0x3eae147b    # 0.34f

    .line 195
    .line 196
    .line 197
    const/high16 v2, 0x3f400000    # 0.75f

    .line 198
    .line 199
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 200
    .line 201
    .line 202
    const/high16 v0, 0x41400000    # 12.0f

    .line 203
    .line 204
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 205
    .line 206
    .line 207
    const/high16 v0, 0x3f800000    # 1.0f

    .line 208
    .line 209
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 210
    .line 211
    .line 212
    const/high16 v0, -0x40000000    # -2.0f

    .line 213
    .line 214
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 215
    .line 216
    .line 217
    const/high16 v17, -0x40800000    # -1.0f

    .line 218
    .line 219
    const/high16 v18, 0x3f800000    # 1.0f

    .line 220
    .line 221
    const v13, -0x40f33333    # -0.55f

    .line 222
    .line 223
    .line 224
    const/4 v14, 0x0

    .line 225
    const/high16 v15, -0x40800000    # -1.0f

    .line 226
    .line 227
    const v16, 0x3ee66666    # 0.45f

    .line 228
    .line 229
    .line 230
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 231
    .line 232
    .line 233
    const/high16 v0, 0x41600000    # 14.0f

    .line 234
    .line 235
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 236
    .line 237
    .line 238
    const/high16 v17, 0x3f800000    # 1.0f

    .line 239
    .line 240
    const/4 v13, 0x0

    .line 241
    const v14, 0x3f0ccccd    # 0.55f

    .line 242
    .line 243
    .line 244
    const v15, 0x3ee66666    # 0.45f

    .line 245
    .line 246
    .line 247
    const/high16 v16, 0x3f800000    # 1.0f

    .line 248
    .line 249
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 250
    .line 251
    .line 252
    const/high16 v0, 0x40300000    # 2.75f

    .line 253
    .line 254
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 255
    .line 256
    .line 257
    const/high16 v17, 0x3f400000    # 0.75f

    .line 258
    .line 259
    const/high16 v18, -0x40c00000    # -0.75f

    .line 260
    .line 261
    const v13, 0x3ed1eb85    # 0.41f

    .line 262
    .line 263
    .line 264
    const/4 v14, 0x0

    .line 265
    const/high16 v15, 0x3f400000    # 0.75f

    .line 266
    .line 267
    const v16, -0x4151eb85    # -0.34f

    .line 268
    .line 269
    .line 270
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 271
    .line 272
    .line 273
    const/high16 v17, -0x40c00000    # -0.75f

    .line 274
    .line 275
    const/4 v13, 0x0

    .line 276
    const v14, -0x412e147b    # -0.41f

    .line 277
    .line 278
    .line 279
    const v15, -0x4151eb85    # -0.34f

    .line 280
    .line 281
    .line 282
    const/high16 v16, -0x40c00000    # -0.75f

    .line 283
    .line 284
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 285
    .line 286
    .line 287
    const/high16 v0, 0x41280000    # 10.5f

    .line 288
    .line 289
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 290
    .line 291
    .line 292
    const/high16 v0, -0x40800000    # -1.0f

    .line 293
    .line 294
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 295
    .line 296
    .line 297
    const/high16 v0, 0x40000000    # 2.0f

    .line 298
    .line 299
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 300
    .line 301
    .line 302
    const/high16 v17, 0x3f800000    # 1.0f

    .line 303
    .line 304
    const/high16 v18, -0x40800000    # -1.0f

    .line 305
    .line 306
    const v13, 0x3f0ccccd    # 0.55f

    .line 307
    .line 308
    .line 309
    const/4 v14, 0x0

    .line 310
    const/high16 v15, 0x3f800000    # 1.0f

    .line 311
    .line 312
    const v16, -0x4119999a    # -0.45f

    .line 313
    .line 314
    .line 315
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 316
    .line 317
    .line 318
    const/high16 v0, 0x41200000    # 10.0f

    .line 319
    .line 320
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 321
    .line 322
    .line 323
    const/high16 v17, -0x40800000    # -1.0f

    .line 324
    .line 325
    const/4 v13, 0x0

    .line 326
    const v14, -0x40f33333    # -0.55f

    .line 327
    .line 328
    .line 329
    const v15, -0x4119999a    # -0.45f

    .line 330
    .line 331
    .line 332
    const/high16 v16, -0x40800000    # -1.0f

    .line 333
    .line 334
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 335
    .line 336
    .line 337
    const/high16 v0, 0x411c0000    # 9.75f

    .line 338
    .line 339
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 340
    .line 341
    .line 342
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 343
    .line 344
    .line 345
    const/high16 v0, 0x41940000    # 18.5f

    .line 346
    .line 347
    const/high16 v2, 0x41700000    # 15.0f

    .line 348
    .line 349
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 350
    .line 351
    .line 352
    const/high16 v17, 0x3f800000    # 1.0f

    .line 353
    .line 354
    const v13, 0x3f0ccccd    # 0.55f

    .line 355
    .line 356
    .line 357
    const/4 v14, 0x0

    .line 358
    const/high16 v15, 0x3f800000    # 1.0f

    .line 359
    .line 360
    const v16, -0x4119999a    # -0.45f

    .line 361
    .line 362
    .line 363
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 364
    .line 365
    .line 366
    const/high16 v0, -0x3f800000    # -4.0f

    .line 367
    .line 368
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 369
    .line 370
    .line 371
    const/high16 v17, -0x40800000    # -1.0f

    .line 372
    .line 373
    const/4 v13, 0x0

    .line 374
    const v14, -0x40f33333    # -0.55f

    .line 375
    .line 376
    .line 377
    const v15, -0x4119999a    # -0.45f

    .line 378
    .line 379
    .line 380
    const/high16 v16, -0x40800000    # -1.0f

    .line 381
    .line 382
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 383
    .line 384
    .line 385
    const/high16 v0, -0x3fd00000    # -2.75f

    .line 386
    .line 387
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 388
    .line 389
    .line 390
    const/high16 v17, 0x41700000    # 15.0f

    .line 391
    .line 392
    const/high16 v18, 0x411c0000    # 9.75f

    .line 393
    .line 394
    const v13, 0x417570a4    # 15.34f

    .line 395
    .line 396
    .line 397
    const/high16 v14, 0x41100000    # 9.0f

    .line 398
    .line 399
    const/high16 v15, 0x41700000    # 15.0f

    .line 400
    .line 401
    const v16, 0x411570a4    # 9.34f

    .line 402
    .line 403
    .line 404
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 405
    .line 406
    .line 407
    const v0, 0x3eae147b    # 0.34f

    .line 408
    .line 409
    .line 410
    const/high16 v2, 0x3f400000    # 0.75f

    .line 411
    .line 412
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 413
    .line 414
    .line 415
    const/high16 v0, 0x41900000    # 18.0f

    .line 416
    .line 417
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 418
    .line 419
    .line 420
    const/high16 v0, 0x3f800000    # 1.0f

    .line 421
    .line 422
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 423
    .line 424
    .line 425
    const/high16 v0, -0x40400000    # -1.5f

    .line 426
    .line 427
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 428
    .line 429
    .line 430
    const/high16 v17, -0x41000000    # -0.5f

    .line 431
    .line 432
    const/high16 v18, 0x3f000000    # 0.5f

    .line 433
    .line 434
    const v13, -0x4170a3d7    # -0.28f

    .line 435
    .line 436
    .line 437
    const/4 v14, 0x0

    .line 438
    const/high16 v15, -0x41000000    # -0.5f

    .line 439
    .line 440
    const v16, 0x3e6147ae    # 0.22f

    .line 441
    .line 442
    .line 443
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 444
    .line 445
    .line 446
    const v0, 0x3e6147ae    # 0.22f

    .line 447
    .line 448
    .line 449
    const/high16 v2, 0x3f000000    # 0.5f

    .line 450
    .line 451
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 452
    .line 453
    .line 454
    const/high16 v0, 0x41900000    # 18.0f

    .line 455
    .line 456
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 457
    .line 458
    .line 459
    const/high16 v0, 0x3f800000    # 1.0f

    .line 460
    .line 461
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 462
    .line 463
    .line 464
    const/high16 v0, -0x3ff00000    # -2.25f

    .line 465
    .line 466
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 467
    .line 468
    .line 469
    const/high16 v17, -0x40c00000    # -0.75f

    .line 470
    .line 471
    const/high16 v18, 0x3f400000    # 0.75f

    .line 472
    .line 473
    const v13, -0x412e147b    # -0.41f

    .line 474
    .line 475
    .line 476
    const/high16 v15, -0x40c00000    # -0.75f

    .line 477
    .line 478
    const v16, 0x3eae147b    # 0.34f

    .line 479
    .line 480
    .line 481
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 482
    .line 483
    .line 484
    const v0, 0x417570a4    # 15.34f

    .line 485
    .line 486
    .line 487
    const/high16 v2, 0x417c0000    # 15.75f

    .line 488
    .line 489
    const/high16 v4, 0x41700000    # 15.0f

    .line 490
    .line 491
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 492
    .line 493
    .line 494
    const/high16 v0, 0x41940000    # 18.5f

    .line 495
    .line 496
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 497
    .line 498
    .line 499
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 500
    .line 501
    .line 502
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 503
    .line 504
    .line 505
    move-result-object v2

    .line 506
    const/16 v16, 0x3800

    .line 507
    .line 508
    const/16 v17, 0x0

    .line 509
    .line 510
    const/high16 v6, 0x3f800000    # 1.0f

    .line 511
    .line 512
    const/high16 v8, 0x3f800000    # 1.0f

    .line 513
    .line 514
    const/4 v7, 0x0

    .line 515
    const/high16 v9, 0x3f800000    # 1.0f

    .line 516
    .line 517
    const/high16 v12, 0x3f800000    # 1.0f

    .line 518
    .line 519
    const/4 v13, 0x0

    .line 520
    const/4 v15, 0x0

    .line 521
    const-string v4, ""

    .line 522
    .line 523
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 524
    .line 525
    .line 526
    move-result-object v0

    .line 527
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 528
    .line 529
    .line 530
    move-result-object v0

    .line 531
    sput-object v0, Landroidx/compose/material/icons/rounded/_123Kt;->__123:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 532
    .line 533
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 534
    .line 535
    .line 536
    return-object v0
.end method
