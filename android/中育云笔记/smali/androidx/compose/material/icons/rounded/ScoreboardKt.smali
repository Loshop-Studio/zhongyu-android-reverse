.class public final Landroidx/compose/material/icons/rounded/ScoreboardKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _scoreboard:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getScoreboard(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/ScoreboardKt;->_scoreboard:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.Scoreboard"

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
    const/high16 v0, 0x418c0000    # 17.5f

    .line 71
    .line 72
    const/high16 v2, 0x41580000    # 13.5f

    .line 73
    .line 74
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v0, 0x41800000    # 16.0f

    .line 78
    .line 79
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 80
    .line 81
    .line 82
    const/high16 v0, -0x3fc00000    # -3.0f

    .line 83
    .line 84
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 85
    .line 86
    .line 87
    const/high16 v0, 0x3fc00000    # 1.5f

    .line 88
    .line 89
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 90
    .line 91
    .line 92
    const/high16 v0, 0x41580000    # 13.5f

    .line 93
    .line 94
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 95
    .line 96
    .line 97
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 98
    .line 99
    .line 100
    const/high16 v0, 0x40000000    # 2.0f

    .line 101
    .line 102
    const/high16 v2, 0x41800000    # 16.0f

    .line 103
    .line 104
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 105
    .line 106
    .line 107
    const/high16 v17, -0x40800000    # -1.0f

    .line 108
    .line 109
    const/high16 v18, 0x3f800000    # 1.0f

    .line 110
    .line 111
    const v13, -0x40f33333    # -0.55f

    .line 112
    .line 113
    .line 114
    const/4 v14, 0x0

    .line 115
    const/high16 v15, -0x40800000    # -1.0f

    .line 116
    .line 117
    const v16, 0x3ee66666    # 0.45f

    .line 118
    .line 119
    .line 120
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 121
    .line 122
    .line 123
    const/high16 v0, 0x3f800000    # 1.0f

    .line 124
    .line 125
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 126
    .line 127
    .line 128
    const/high16 v0, 0x41100000    # 9.0f

    .line 129
    .line 130
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 131
    .line 132
    .line 133
    const/high16 v0, 0x40400000    # 3.0f

    .line 134
    .line 135
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 136
    .line 137
    .line 138
    const/high16 v18, -0x40800000    # -1.0f

    .line 139
    .line 140
    const/4 v13, 0x0

    .line 141
    const v14, -0x40f33333    # -0.55f

    .line 142
    .line 143
    .line 144
    const v15, -0x4119999a    # -0.45f

    .line 145
    .line 146
    .line 147
    const/high16 v16, -0x40800000    # -1.0f

    .line 148
    .line 149
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 150
    .line 151
    .line 152
    const v0, 0x401ccccd    # 2.45f

    .line 153
    .line 154
    .line 155
    const/high16 v2, 0x40e00000    # 7.0f

    .line 156
    .line 157
    const/high16 v4, 0x40400000    # 3.0f

    .line 158
    .line 159
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 160
    .line 161
    .line 162
    const/high16 v0, 0x3f800000    # 1.0f

    .line 163
    .line 164
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 165
    .line 166
    .line 167
    const/high16 v0, 0x40800000    # 4.0f

    .line 168
    .line 169
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 170
    .line 171
    .line 172
    const/high16 v17, 0x40000000    # 2.0f

    .line 173
    .line 174
    const/high16 v18, 0x40c00000    # 6.0f

    .line 175
    .line 176
    const v13, 0x4039999a    # 2.9f

    .line 177
    .line 178
    .line 179
    const/high16 v14, 0x40800000    # 4.0f

    .line 180
    .line 181
    const/high16 v15, 0x40000000    # 2.0f

    .line 182
    .line 183
    const v16, 0x409ccccd    # 4.9f

    .line 184
    .line 185
    .line 186
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 187
    .line 188
    .line 189
    const/high16 v0, 0x41400000    # 12.0f

    .line 190
    .line 191
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 192
    .line 193
    .line 194
    const/high16 v18, 0x40000000    # 2.0f

    .line 195
    .line 196
    const/4 v13, 0x0

    .line 197
    const v14, 0x3f8ccccd    # 1.1f

    .line 198
    .line 199
    .line 200
    const v15, 0x3f666666    # 0.9f

    .line 201
    .line 202
    .line 203
    const/high16 v16, 0x40000000    # 2.0f

    .line 204
    .line 205
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 206
    .line 207
    .line 208
    const/high16 v0, 0x41800000    # 16.0f

    .line 209
    .line 210
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 211
    .line 212
    .line 213
    const/high16 v18, -0x40000000    # -2.0f

    .line 214
    .line 215
    const v13, 0x3f8ccccd    # 1.1f

    .line 216
    .line 217
    .line 218
    const/4 v14, 0x0

    .line 219
    const/high16 v15, 0x40000000    # 2.0f

    .line 220
    .line 221
    const v16, -0x4099999a    # -0.9f

    .line 222
    .line 223
    .line 224
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 225
    .line 226
    .line 227
    const/high16 v0, 0x40c00000    # 6.0f

    .line 228
    .line 229
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 230
    .line 231
    .line 232
    const/high16 v17, -0x40000000    # -2.0f

    .line 233
    .line 234
    const/4 v13, 0x0

    .line 235
    const v14, -0x40733333    # -1.1f

    .line 236
    .line 237
    .line 238
    const v15, -0x4099999a    # -0.9f

    .line 239
    .line 240
    .line 241
    const/high16 v16, -0x40000000    # -2.0f

    .line 242
    .line 243
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 244
    .line 245
    .line 246
    const/high16 v0, -0x3fc00000    # -3.0f

    .line 247
    .line 248
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 249
    .line 250
    .line 251
    const/high16 v0, 0x40400000    # 3.0f

    .line 252
    .line 253
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 254
    .line 255
    .line 256
    const/high16 v17, 0x41800000    # 16.0f

    .line 257
    .line 258
    const/high16 v18, 0x40000000    # 2.0f

    .line 259
    .line 260
    const/high16 v13, 0x41880000    # 17.0f

    .line 261
    .line 262
    const v14, 0x401ccccd    # 2.45f

    .line 263
    .line 264
    .line 265
    const v15, 0x41846666    # 16.55f

    .line 266
    .line 267
    .line 268
    const/high16 v16, 0x40000000    # 2.0f

    .line 269
    .line 270
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 271
    .line 272
    .line 273
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 274
    .line 275
    .line 276
    const/high16 v0, 0x41640000    # 14.25f

    .line 277
    .line 278
    const/high16 v2, 0x41180000    # 9.5f

    .line 279
    .line 280
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 281
    .line 282
    .line 283
    const/high16 v17, 0x410c0000    # 8.75f

    .line 284
    .line 285
    const/high16 v18, 0x41700000    # 15.0f

    .line 286
    .line 287
    const/high16 v13, 0x41180000    # 9.5f

    .line 288
    .line 289
    const v14, 0x416a8f5c    # 14.66f

    .line 290
    .line 291
    .line 292
    const v15, 0x41128f5c    # 9.16f

    .line 293
    .line 294
    .line 295
    const/high16 v16, 0x41700000    # 15.0f

    .line 296
    .line 297
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 298
    .line 299
    .line 300
    const/high16 v0, 0x40c00000    # 6.0f

    .line 301
    .line 302
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 303
    .line 304
    .line 305
    const/high16 v17, -0x40800000    # -1.0f

    .line 306
    .line 307
    const/high16 v18, -0x40800000    # -1.0f

    .line 308
    .line 309
    const v13, -0x40f33333    # -0.55f

    .line 310
    .line 311
    .line 312
    const/4 v14, 0x0

    .line 313
    const/high16 v15, -0x40800000    # -1.0f

    .line 314
    .line 315
    const v16, -0x4119999a    # -0.45f

    .line 316
    .line 317
    .line 318
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 319
    .line 320
    .line 321
    const/high16 v0, -0x40400000    # -1.5f

    .line 322
    .line 323
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 324
    .line 325
    .line 326
    const/high16 v17, 0x3f800000    # 1.0f

    .line 327
    .line 328
    const/4 v13, 0x0

    .line 329
    const v14, -0x40f33333    # -0.55f

    .line 330
    .line 331
    .line 332
    const v15, 0x3ee66666    # 0.45f

    .line 333
    .line 334
    .line 335
    const/high16 v16, -0x40800000    # -1.0f

    .line 336
    .line 337
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 338
    .line 339
    .line 340
    const/high16 v0, 0x40000000    # 2.0f

    .line 341
    .line 342
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 343
    .line 344
    .line 345
    const/high16 v0, -0x40800000    # -1.0f

    .line 346
    .line 347
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 348
    .line 349
    .line 350
    const/high16 v0, 0x40b80000    # 5.75f

    .line 351
    .line 352
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 353
    .line 354
    .line 355
    const/high16 v17, 0x40a00000    # 5.0f

    .line 356
    .line 357
    const/high16 v18, 0x411c0000    # 9.75f

    .line 358
    .line 359
    const v13, 0x40aae148    # 5.34f

    .line 360
    .line 361
    .line 362
    const/high16 v14, 0x41280000    # 10.5f

    .line 363
    .line 364
    const/high16 v15, 0x40a00000    # 5.0f

    .line 365
    .line 366
    const v16, 0x41228f5c    # 10.16f

    .line 367
    .line 368
    .line 369
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 370
    .line 371
    .line 372
    const v0, 0x40aae148    # 5.34f

    .line 373
    .line 374
    .line 375
    const/high16 v2, 0x40b80000    # 5.75f

    .line 376
    .line 377
    const/high16 v4, 0x41100000    # 9.0f

    .line 378
    .line 379
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 380
    .line 381
    .line 382
    const/high16 v0, 0x41080000    # 8.5f

    .line 383
    .line 384
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 385
    .line 386
    .line 387
    const/high16 v17, 0x3f800000    # 1.0f

    .line 388
    .line 389
    const/high16 v18, 0x3f800000    # 1.0f

    .line 390
    .line 391
    const v13, 0x3f0ccccd    # 0.55f

    .line 392
    .line 393
    .line 394
    const/4 v14, 0x0

    .line 395
    const/high16 v15, 0x3f800000    # 1.0f

    .line 396
    .line 397
    const v16, 0x3ee66666    # 0.45f

    .line 398
    .line 399
    .line 400
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 401
    .line 402
    .line 403
    const/high16 v0, 0x3fc00000    # 1.5f

    .line 404
    .line 405
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 406
    .line 407
    .line 408
    const/high16 v17, -0x40800000    # -1.0f

    .line 409
    .line 410
    const/4 v13, 0x0

    .line 411
    const v14, 0x3f0ccccd    # 0.55f

    .line 412
    .line 413
    .line 414
    const v15, -0x4119999a    # -0.45f

    .line 415
    .line 416
    .line 417
    const/high16 v16, 0x3f800000    # 1.0f

    .line 418
    .line 419
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 420
    .line 421
    .line 422
    const/high16 v0, -0x40000000    # -2.0f

    .line 423
    .line 424
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 425
    .line 426
    .line 427
    const/high16 v0, 0x3f800000    # 1.0f

    .line 428
    .line 429
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 430
    .line 431
    .line 432
    const/high16 v0, 0x40100000    # 2.25f

    .line 433
    .line 434
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 435
    .line 436
    .line 437
    const/high16 v17, 0x41180000    # 9.5f

    .line 438
    .line 439
    const/high16 v18, 0x41640000    # 14.25f

    .line 440
    .line 441
    const v13, 0x41128f5c    # 9.16f

    .line 442
    .line 443
    .line 444
    const/high16 v14, 0x41580000    # 13.5f

    .line 445
    .line 446
    const/high16 v15, 0x41180000    # 9.5f

    .line 447
    .line 448
    const v16, 0x415d70a4    # 13.84f

    .line 449
    .line 450
    .line 451
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 452
    .line 453
    .line 454
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 455
    .line 456
    .line 457
    const/high16 v0, 0x41980000    # 19.0f

    .line 458
    .line 459
    const/high16 v2, 0x41600000    # 14.0f

    .line 460
    .line 461
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 462
    .line 463
    .line 464
    const/high16 v17, -0x40800000    # -1.0f

    .line 465
    .line 466
    const/high16 v18, 0x3f800000    # 1.0f

    .line 467
    .line 468
    const/4 v13, 0x0

    .line 469
    const v14, 0x3f0ccccd    # 0.55f

    .line 470
    .line 471
    .line 472
    const v15, -0x4119999a    # -0.45f

    .line 473
    .line 474
    .line 475
    const/high16 v16, 0x3f800000    # 1.0f

    .line 476
    .line 477
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 478
    .line 479
    .line 480
    const/high16 v0, -0x3fe00000    # -2.5f

    .line 481
    .line 482
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 483
    .line 484
    .line 485
    const/high16 v18, -0x40800000    # -1.0f

    .line 486
    .line 487
    const v13, -0x40f33333    # -0.55f

    .line 488
    .line 489
    .line 490
    const/4 v14, 0x0

    .line 491
    const/high16 v15, -0x40800000    # -1.0f

    .line 492
    .line 493
    const v16, -0x4119999a    # -0.45f

    .line 494
    .line 495
    .line 496
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 497
    .line 498
    .line 499
    const/high16 v0, -0x3f800000    # -4.0f

    .line 500
    .line 501
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 502
    .line 503
    .line 504
    const/high16 v17, 0x3f800000    # 1.0f

    .line 505
    .line 506
    const/4 v13, 0x0

    .line 507
    const v14, -0x40f33333    # -0.55f

    .line 508
    .line 509
    .line 510
    const v15, 0x3ee66666    # 0.45f

    .line 511
    .line 512
    .line 513
    const/high16 v16, -0x40800000    # -1.0f

    .line 514
    .line 515
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 516
    .line 517
    .line 518
    const/high16 v0, 0x41900000    # 18.0f

    .line 519
    .line 520
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 521
    .line 522
    .line 523
    const/high16 v18, 0x3f800000    # 1.0f

    .line 524
    .line 525
    const v13, 0x3f0ccccd    # 0.55f

    .line 526
    .line 527
    .line 528
    const/4 v14, 0x0

    .line 529
    const/high16 v15, 0x3f800000    # 1.0f

    .line 530
    .line 531
    const v16, 0x3ee66666    # 0.45f

    .line 532
    .line 533
    .line 534
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 535
    .line 536
    .line 537
    const/high16 v0, 0x41600000    # 14.0f

    .line 538
    .line 539
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 540
    .line 541
    .line 542
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 543
    .line 544
    .line 545
    const/high16 v0, 0x40d80000    # 6.75f

    .line 546
    .line 547
    const/high16 v2, 0x414c0000    # 12.75f

    .line 548
    .line 549
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 550
    .line 551
    .line 552
    const/high16 v17, -0x40c00000    # -0.75f

    .line 553
    .line 554
    const/high16 v18, 0x3f400000    # 0.75f

    .line 555
    .line 556
    const/4 v13, 0x0

    .line 557
    const v14, 0x3ed1eb85    # 0.41f

    .line 558
    .line 559
    .line 560
    const v15, -0x4151eb85    # -0.34f

    .line 561
    .line 562
    .line 563
    const/high16 v16, 0x3f400000    # 0.75f

    .line 564
    .line 565
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 566
    .line 567
    .line 568
    const v0, -0x4151eb85    # -0.34f

    .line 569
    .line 570
    .line 571
    const/high16 v2, -0x40c00000    # -0.75f

    .line 572
    .line 573
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 574
    .line 575
    .line 576
    const v0, 0x413970a4    # 11.59f

    .line 577
    .line 578
    .line 579
    const/high16 v2, 0x40c00000    # 6.0f

    .line 580
    .line 581
    const/high16 v4, 0x41400000    # 12.0f

    .line 582
    .line 583
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 584
    .line 585
    .line 586
    const v0, 0x40cae148    # 6.34f

    .line 587
    .line 588
    .line 589
    const/high16 v2, 0x40d80000    # 6.75f

    .line 590
    .line 591
    const/high16 v4, 0x414c0000    # 12.75f

    .line 592
    .line 593
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 594
    .line 595
    .line 596
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 597
    .line 598
    .line 599
    const/high16 v0, 0x41240000    # 10.25f

    .line 600
    .line 601
    const/high16 v2, 0x414c0000    # 12.75f

    .line 602
    .line 603
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 604
    .line 605
    .line 606
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 607
    .line 608
    .line 609
    const v0, -0x4151eb85    # -0.34f

    .line 610
    .line 611
    .line 612
    const/high16 v2, -0x40c00000    # -0.75f

    .line 613
    .line 614
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 615
    .line 616
    .line 617
    const/high16 v0, 0x41180000    # 9.5f

    .line 618
    .line 619
    const v2, 0x413970a4    # 11.59f

    .line 620
    .line 621
    .line 622
    const/high16 v4, 0x41400000    # 12.0f

    .line 623
    .line 624
    invoke-virtual {v12, v2, v0, v4, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 625
    .line 626
    .line 627
    const v0, 0x411d70a4    # 9.84f

    .line 628
    .line 629
    .line 630
    const/high16 v2, 0x41240000    # 10.25f

    .line 631
    .line 632
    const/high16 v4, 0x414c0000    # 12.75f

    .line 633
    .line 634
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 635
    .line 636
    .line 637
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 638
    .line 639
    .line 640
    const/high16 v0, 0x415c0000    # 13.75f

    .line 641
    .line 642
    const/high16 v2, 0x414c0000    # 12.75f

    .line 643
    .line 644
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 645
    .line 646
    .line 647
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 648
    .line 649
    .line 650
    const v0, -0x4151eb85    # -0.34f

    .line 651
    .line 652
    .line 653
    const/high16 v2, -0x40c00000    # -0.75f

    .line 654
    .line 655
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 656
    .line 657
    .line 658
    const/high16 v0, 0x41500000    # 13.0f

    .line 659
    .line 660
    const/high16 v2, 0x41500000    # 13.0f

    .line 661
    .line 662
    const v4, 0x413970a4    # 11.59f

    .line 663
    .line 664
    .line 665
    const/high16 v6, 0x41400000    # 12.0f

    .line 666
    .line 667
    invoke-virtual {v12, v4, v0, v6, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 668
    .line 669
    .line 670
    const v0, 0x415570a4    # 13.34f

    .line 671
    .line 672
    .line 673
    const/high16 v2, 0x415c0000    # 13.75f

    .line 674
    .line 675
    const/high16 v4, 0x414c0000    # 12.75f

    .line 676
    .line 677
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 678
    .line 679
    .line 680
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 681
    .line 682
    .line 683
    const/high16 v0, 0x418a0000    # 17.25f

    .line 684
    .line 685
    const/high16 v2, 0x414c0000    # 12.75f

    .line 686
    .line 687
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 688
    .line 689
    .line 690
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 691
    .line 692
    .line 693
    const v0, -0x4151eb85    # -0.34f

    .line 694
    .line 695
    .line 696
    const/high16 v2, -0x40c00000    # -0.75f

    .line 697
    .line 698
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 699
    .line 700
    .line 701
    const/high16 v0, 0x41840000    # 16.5f

    .line 702
    .line 703
    const/high16 v2, 0x41840000    # 16.5f

    .line 704
    .line 705
    const v4, 0x413970a4    # 11.59f

    .line 706
    .line 707
    .line 708
    invoke-virtual {v12, v4, v0, v6, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 709
    .line 710
    .line 711
    const v0, 0x4186b852    # 16.84f

    .line 712
    .line 713
    .line 714
    const/high16 v2, 0x418a0000    # 17.25f

    .line 715
    .line 716
    const/high16 v4, 0x414c0000    # 12.75f

    .line 717
    .line 718
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 719
    .line 720
    .line 721
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 722
    .line 723
    .line 724
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 725
    .line 726
    .line 727
    move-result-object v2

    .line 728
    const/16 v16, 0x3800

    .line 729
    .line 730
    const/16 v17, 0x0

    .line 731
    .line 732
    const/high16 v6, 0x3f800000    # 1.0f

    .line 733
    .line 734
    const/high16 v8, 0x3f800000    # 1.0f

    .line 735
    .line 736
    const/4 v7, 0x0

    .line 737
    const/high16 v9, 0x3f800000    # 1.0f

    .line 738
    .line 739
    const/high16 v12, 0x3f800000    # 1.0f

    .line 740
    .line 741
    const/4 v14, 0x0

    .line 742
    const/4 v15, 0x0

    .line 743
    const-string v4, ""

    .line 744
    .line 745
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 746
    .line 747
    .line 748
    move-result-object v0

    .line 749
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 750
    .line 751
    .line 752
    move-result-object v0

    .line 753
    sput-object v0, Landroidx/compose/material/icons/rounded/ScoreboardKt;->_scoreboard:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 754
    .line 755
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 756
    .line 757
    .line 758
    return-object v0
.end method
