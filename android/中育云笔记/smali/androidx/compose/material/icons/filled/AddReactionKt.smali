.class public final Landroidx/compose/material/icons/filled/AddReactionKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _addReaction:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getAddReaction(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/filled/AddReactionKt;->_addReaction:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Filled.AddReaction"

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
    const/high16 v0, 0x41100000    # 9.0f

    .line 71
    .line 72
    const/high16 v2, 0x41900000    # 18.0f

    .line 73
    .line 74
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v0, 0x40e00000    # 7.0f

    .line 78
    .line 79
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 80
    .line 81
    .line 82
    const/high16 v0, -0x40000000    # -2.0f

    .line 83
    .line 84
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 85
    .line 86
    .line 87
    const v0, 0x4035c28f    # 2.84f

    .line 88
    .line 89
    .line 90
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 91
    .line 92
    .line 93
    const v17, 0x413fd70a    # 11.99f

    .line 94
    .line 95
    .line 96
    const/high16 v18, 0x40000000    # 2.0f

    .line 97
    .line 98
    const v13, 0x416c51ec    # 14.77f

    .line 99
    .line 100
    .line 101
    const v14, 0x40133333    # 2.3f

    .line 102
    .line 103
    .line 104
    const v15, 0x4156b852    # 13.42f

    .line 105
    .line 106
    .line 107
    const/high16 v16, 0x40000000    # 2.0f

    .line 108
    .line 109
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 110
    .line 111
    .line 112
    const/high16 v17, 0x40000000    # 2.0f

    .line 113
    .line 114
    const/high16 v18, 0x41400000    # 12.0f

    .line 115
    .line 116
    const v13, 0x40cf0a3d    # 6.47f

    .line 117
    .line 118
    .line 119
    const/high16 v14, 0x40000000    # 2.0f

    .line 120
    .line 121
    const/high16 v15, 0x40000000    # 2.0f

    .line 122
    .line 123
    const v16, 0x40cf5c29    # 6.48f

    .line 124
    .line 125
    .line 126
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 127
    .line 128
    .line 129
    const v0, 0x408f0a3d    # 4.47f

    .line 130
    .line 131
    .line 132
    const v2, 0x411fd70a    # 9.99f

    .line 133
    .line 134
    .line 135
    const/high16 v4, 0x41200000    # 10.0f

    .line 136
    .line 137
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 138
    .line 139
    .line 140
    const/high16 v17, 0x41b00000    # 22.0f

    .line 141
    .line 142
    const v13, 0x418c28f6    # 17.52f

    .line 143
    .line 144
    .line 145
    const/high16 v14, 0x41b00000    # 22.0f

    .line 146
    .line 147
    const/high16 v15, 0x41b00000    # 22.0f

    .line 148
    .line 149
    const v16, 0x418c28f6    # 17.52f

    .line 150
    .line 151
    .line 152
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 153
    .line 154
    .line 155
    const v17, -0x410f5c29    # -0.47f

    .line 156
    .line 157
    .line 158
    const/high16 v18, -0x3fc00000    # -3.0f

    .line 159
    .line 160
    const/4 v13, 0x0

    .line 161
    const v14, -0x4079999a    # -1.05f

    .line 162
    .line 163
    .line 164
    const v15, -0x41d1eb85    # -0.17f

    .line 165
    .line 166
    .line 167
    const v16, -0x3ffccccd    # -2.05f

    .line 168
    .line 169
    .line 170
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 171
    .line 172
    .line 173
    const/high16 v0, 0x41900000    # 18.0f

    .line 174
    .line 175
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 176
    .line 177
    .line 178
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 179
    .line 180
    .line 181
    const/high16 v0, 0x41780000    # 15.5f

    .line 182
    .line 183
    const/high16 v2, 0x41000000    # 8.0f

    .line 184
    .line 185
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 186
    .line 187
    .line 188
    const/high16 v17, 0x41880000    # 17.0f

    .line 189
    .line 190
    const/high16 v18, 0x41180000    # 9.5f

    .line 191
    .line 192
    const v13, 0x4182a3d7    # 16.33f

    .line 193
    .line 194
    .line 195
    const/high16 v14, 0x41000000    # 8.0f

    .line 196
    .line 197
    const/high16 v15, 0x41880000    # 17.0f

    .line 198
    .line 199
    const v16, 0x410ab852    # 8.67f

    .line 200
    .line 201
    .line 202
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 203
    .line 204
    .line 205
    const v0, 0x4182a3d7    # 16.33f

    .line 206
    .line 207
    .line 208
    const/high16 v2, 0x41780000    # 15.5f

    .line 209
    .line 210
    const/high16 v4, 0x41300000    # 11.0f

    .line 211
    .line 212
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 213
    .line 214
    .line 215
    const/high16 v0, 0x41180000    # 9.5f

    .line 216
    .line 217
    const v2, 0x412547ae    # 10.33f

    .line 218
    .line 219
    .line 220
    const/high16 v4, 0x41600000    # 14.0f

    .line 221
    .line 222
    invoke-virtual {v12, v4, v2, v4, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 223
    .line 224
    .line 225
    const v0, 0x416ab852    # 14.67f

    .line 226
    .line 227
    .line 228
    const/high16 v2, 0x41780000    # 15.5f

    .line 229
    .line 230
    const/high16 v4, 0x41000000    # 8.0f

    .line 231
    .line 232
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 233
    .line 234
    .line 235
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 236
    .line 237
    .line 238
    const/high16 v0, 0x41080000    # 8.5f

    .line 239
    .line 240
    const/high16 v2, 0x41000000    # 8.0f

    .line 241
    .line 242
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 243
    .line 244
    .line 245
    const/high16 v17, 0x41200000    # 10.0f

    .line 246
    .line 247
    const v13, 0x411547ae    # 9.33f

    .line 248
    .line 249
    .line 250
    const/high16 v15, 0x41200000    # 10.0f

    .line 251
    .line 252
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 253
    .line 254
    .line 255
    const v0, 0x411547ae    # 9.33f

    .line 256
    .line 257
    .line 258
    const/high16 v2, 0x41080000    # 8.5f

    .line 259
    .line 260
    const/high16 v4, 0x41300000    # 11.0f

    .line 261
    .line 262
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 263
    .line 264
    .line 265
    const/high16 v0, 0x41180000    # 9.5f

    .line 266
    .line 267
    const v2, 0x412547ae    # 10.33f

    .line 268
    .line 269
    .line 270
    const/high16 v4, 0x40e00000    # 7.0f

    .line 271
    .line 272
    invoke-virtual {v12, v4, v2, v4, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 273
    .line 274
    .line 275
    const v0, 0x40f570a4    # 7.67f

    .line 276
    .line 277
    .line 278
    const/high16 v2, 0x41080000    # 8.5f

    .line 279
    .line 280
    const/high16 v4, 0x41000000    # 8.0f

    .line 281
    .line 282
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 283
    .line 284
    .line 285
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 286
    .line 287
    .line 288
    const/high16 v0, 0x41400000    # 12.0f

    .line 289
    .line 290
    const/high16 v2, 0x418c0000    # 17.5f

    .line 291
    .line 292
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 293
    .line 294
    .line 295
    const v17, -0x3f5c7ae1    # -5.11f

    .line 296
    .line 297
    .line 298
    const/high16 v18, -0x3fa00000    # -3.5f

    .line 299
    .line 300
    const v13, -0x3feae148    # -2.33f

    .line 301
    .line 302
    .line 303
    const/4 v14, 0x0

    .line 304
    const v15, -0x3f76147b    # -4.31f

    .line 305
    .line 306
    .line 307
    const v16, -0x40451eb8    # -1.46f

    .line 308
    .line 309
    .line 310
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 311
    .line 312
    .line 313
    const v0, 0x4123851f    # 10.22f

    .line 314
    .line 315
    .line 316
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 317
    .line 318
    .line 319
    const/high16 v17, 0x41400000    # 12.0f

    .line 320
    .line 321
    const/high16 v18, 0x418c0000    # 17.5f

    .line 322
    .line 323
    const v13, 0x41827ae1    # 16.31f

    .line 324
    .line 325
    .line 326
    const v14, 0x418051ec    # 16.04f

    .line 327
    .line 328
    .line 329
    const v15, 0x416547ae    # 14.33f

    .line 330
    .line 331
    .line 332
    const/high16 v16, 0x418c0000    # 17.5f

    .line 333
    .line 334
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 335
    .line 336
    .line 337
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 338
    .line 339
    .line 340
    const/high16 v0, 0x41b00000    # 22.0f

    .line 341
    .line 342
    const/high16 v2, 0x40400000    # 3.0f

    .line 343
    .line 344
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 345
    .line 346
    .line 347
    const/high16 v0, 0x40000000    # 2.0f

    .line 348
    .line 349
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 350
    .line 351
    .line 352
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 353
    .line 354
    .line 355
    const/high16 v0, -0x40000000    # -2.0f

    .line 356
    .line 357
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 358
    .line 359
    .line 360
    const/high16 v0, 0x40000000    # 2.0f

    .line 361
    .line 362
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 363
    .line 364
    .line 365
    const/high16 v0, -0x40000000    # -2.0f

    .line 366
    .line 367
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 368
    .line 369
    .line 370
    const/high16 v0, 0x40a00000    # 5.0f

    .line 371
    .line 372
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 373
    .line 374
    .line 375
    const/high16 v0, -0x40000000    # -2.0f

    .line 376
    .line 377
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 378
    .line 379
    .line 380
    const/high16 v0, 0x40400000    # 3.0f

    .line 381
    .line 382
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 383
    .line 384
    .line 385
    const/high16 v0, 0x40000000    # 2.0f

    .line 386
    .line 387
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 388
    .line 389
    .line 390
    const/high16 v0, 0x3f800000    # 1.0f

    .line 391
    .line 392
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 393
    .line 394
    .line 395
    const/high16 v0, 0x40000000    # 2.0f

    .line 396
    .line 397
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 398
    .line 399
    .line 400
    const/high16 v0, 0x40400000    # 3.0f

    .line 401
    .line 402
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 403
    .line 404
    .line 405
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 406
    .line 407
    .line 408
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 409
    .line 410
    .line 411
    move-result-object v2

    .line 412
    const/16 v16, 0x3800

    .line 413
    .line 414
    const/16 v17, 0x0

    .line 415
    .line 416
    const/high16 v6, 0x3f800000    # 1.0f

    .line 417
    .line 418
    const/high16 v8, 0x3f800000    # 1.0f

    .line 419
    .line 420
    const/4 v7, 0x0

    .line 421
    const/high16 v9, 0x3f800000    # 1.0f

    .line 422
    .line 423
    const/high16 v12, 0x3f800000    # 1.0f

    .line 424
    .line 425
    const/4 v13, 0x0

    .line 426
    const/4 v14, 0x0

    .line 427
    const/4 v15, 0x0

    .line 428
    const-string v4, ""

    .line 429
    .line 430
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 431
    .line 432
    .line 433
    move-result-object v0

    .line 434
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 435
    .line 436
    .line 437
    move-result-object v0

    .line 438
    sput-object v0, Landroidx/compose/material/icons/filled/AddReactionKt;->_addReaction:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 439
    .line 440
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 441
    .line 442
    .line 443
    return-object v0
.end method
