.class public final Landroidx/compose/material/icons/rounded/JavascriptKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _javascript:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getJavascript(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/JavascriptKt;->_javascript:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.Javascript"

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
    const v2, 0x4178a3d7    # 15.54f

    .line 73
    .line 74
    .line 75
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    const v17, 0x3f35c28f    # 0.71f

    .line 79
    .line 80
    .line 81
    const/high16 v18, 0x3f000000    # 0.5f

    .line 82
    .line 83
    const v13, 0x3dcccccd    # 0.1f

    .line 84
    .line 85
    .line 86
    const v14, 0x3e947ae1    # 0.29f

    .line 87
    .line 88
    .line 89
    const v15, 0x3ec28f5c    # 0.38f

    .line 90
    .line 91
    .line 92
    const/high16 v16, 0x3f000000    # 0.5f

    .line 93
    .line 94
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 95
    .line 96
    .line 97
    const/high16 v17, 0x3f400000    # 0.75f

    .line 98
    .line 99
    const/high16 v18, -0x40c00000    # -0.75f

    .line 100
    .line 101
    const v13, 0x3ed1eb85    # 0.41f

    .line 102
    .line 103
    .line 104
    const/4 v14, 0x0

    .line 105
    const/high16 v15, 0x3f400000    # 0.75f

    .line 106
    .line 107
    const v16, -0x4151eb85    # -0.34f

    .line 108
    .line 109
    .line 110
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 111
    .line 112
    .line 113
    const/high16 v0, 0x41200000    # 10.0f

    .line 114
    .line 115
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 116
    .line 117
    .line 118
    const/high16 v17, -0x40800000    # -1.0f

    .line 119
    .line 120
    const/high16 v18, -0x40800000    # -1.0f

    .line 121
    .line 122
    const/4 v13, 0x0

    .line 123
    const v14, -0x40f33333    # -0.55f

    .line 124
    .line 125
    .line 126
    const v15, -0x4119999a    # -0.45f

    .line 127
    .line 128
    .line 129
    const/high16 v16, -0x40800000    # -1.0f

    .line 130
    .line 131
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 132
    .line 133
    .line 134
    const/high16 v0, -0x3fc00000    # -3.0f

    .line 135
    .line 136
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 137
    .line 138
    .line 139
    const/high16 v18, 0x3f800000    # 1.0f

    .line 140
    .line 141
    const v13, -0x40f33333    # -0.55f

    .line 142
    .line 143
    .line 144
    const/4 v14, 0x0

    .line 145
    const/high16 v15, -0x40800000    # -1.0f

    .line 146
    .line 147
    const v16, 0x3ee66666    # 0.45f

    .line 148
    .line 149
    .line 150
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 151
    .line 152
    .line 153
    const/high16 v0, 0x3fc00000    # 1.5f

    .line 154
    .line 155
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 156
    .line 157
    .line 158
    const/high16 v17, 0x3f800000    # 1.0f

    .line 159
    .line 160
    const/4 v13, 0x0

    .line 161
    const v14, 0x3f0ccccd    # 0.55f

    .line 162
    .line 163
    .line 164
    const v15, 0x3ee66666    # 0.45f

    .line 165
    .line 166
    .line 167
    const/high16 v16, 0x3f800000    # 1.0f

    .line 168
    .line 169
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 170
    .line 171
    .line 172
    const/high16 v0, 0x40200000    # 2.5f

    .line 173
    .line 174
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 175
    .line 176
    .line 177
    const/high16 v0, 0x3f800000    # 1.0f

    .line 178
    .line 179
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 180
    .line 181
    .line 182
    const v0, -0x3ffd70a4    # -2.04f

    .line 183
    .line 184
    .line 185
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 186
    .line 187
    .line 188
    const/4 v0, 0x0

    .line 189
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 190
    .line 191
    .line 192
    const v17, -0x40ca3d71    # -0.71f

    .line 193
    .line 194
    .line 195
    const/high16 v18, -0x41000000    # -0.5f

    .line 196
    .line 197
    const v13, -0x42333333    # -0.1f

    .line 198
    .line 199
    .line 200
    const v14, -0x416b851f    # -0.29f

    .line 201
    .line 202
    .line 203
    const v15, -0x413d70a4    # -0.38f

    .line 204
    .line 205
    .line 206
    const/high16 v16, -0x41000000    # -0.5f

    .line 207
    .line 208
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 209
    .line 210
    .line 211
    const/high16 v17, 0x41400000    # 12.0f

    .line 212
    .line 213
    const/high16 v18, 0x415c0000    # 13.75f

    .line 214
    .line 215
    const v13, 0x414570a4    # 12.34f

    .line 216
    .line 217
    .line 218
    const/high16 v14, 0x41500000    # 13.0f

    .line 219
    .line 220
    const/high16 v15, 0x41400000    # 12.0f

    .line 221
    .line 222
    const v16, 0x415570a4    # 13.34f

    .line 223
    .line 224
    .line 225
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 226
    .line 227
    .line 228
    const/high16 v0, 0x41600000    # 14.0f

    .line 229
    .line 230
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 231
    .line 232
    .line 233
    const/high16 v17, 0x3f800000    # 1.0f

    .line 234
    .line 235
    const/high16 v18, 0x3f800000    # 1.0f

    .line 236
    .line 237
    const/4 v13, 0x0

    .line 238
    const v14, 0x3f0ccccd    # 0.55f

    .line 239
    .line 240
    .line 241
    const v15, 0x3ee66666    # 0.45f

    .line 242
    .line 243
    .line 244
    const/high16 v16, 0x3f800000    # 1.0f

    .line 245
    .line 246
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 247
    .line 248
    .line 249
    const/high16 v0, 0x40400000    # 3.0f

    .line 250
    .line 251
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 252
    .line 253
    .line 254
    const/high16 v18, -0x40800000    # -1.0f

    .line 255
    .line 256
    const v13, 0x3f0ccccd    # 0.55f

    .line 257
    .line 258
    .line 259
    const/4 v14, 0x0

    .line 260
    const/high16 v15, 0x3f800000    # 1.0f

    .line 261
    .line 262
    const v16, -0x4119999a    # -0.45f

    .line 263
    .line 264
    .line 265
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 266
    .line 267
    .line 268
    const/high16 v0, -0x40400000    # -1.5f

    .line 269
    .line 270
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 271
    .line 272
    .line 273
    const/high16 v17, -0x40800000    # -1.0f

    .line 274
    .line 275
    const/4 v13, 0x0

    .line 276
    const v14, -0x40f33333    # -0.55f

    .line 277
    .line 278
    .line 279
    const v15, -0x4119999a    # -0.45f

    .line 280
    .line 281
    .line 282
    const/high16 v16, -0x40800000    # -1.0f

    .line 283
    .line 284
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 285
    .line 286
    .line 287
    const/high16 v0, -0x3fe00000    # -2.5f

    .line 288
    .line 289
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

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
    const/high16 v0, 0x41280000    # 10.5f

    .line 298
    .line 299
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 300
    .line 301
    .line 302
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 303
    .line 304
    .line 305
    const/high16 v0, 0x41580000    # 13.5f

    .line 306
    .line 307
    const/high16 v2, 0x40f00000    # 7.5f

    .line 308
    .line 309
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 310
    .line 311
    .line 312
    const/high16 v0, 0x41100000    # 9.0f

    .line 313
    .line 314
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 315
    .line 316
    .line 317
    const/high16 v0, 0x411c0000    # 9.75f

    .line 318
    .line 319
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 320
    .line 321
    .line 322
    const/high16 v17, 0x411c0000    # 9.75f

    .line 323
    .line 324
    const/high16 v18, 0x41100000    # 9.0f

    .line 325
    .line 326
    const/high16 v13, 0x41100000    # 9.0f

    .line 327
    .line 328
    const v14, 0x411570a4    # 9.34f

    .line 329
    .line 330
    .line 331
    const v15, 0x411570a4    # 9.34f

    .line 332
    .line 333
    .line 334
    const/high16 v16, 0x41100000    # 9.0f

    .line 335
    .line 336
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 337
    .line 338
    .line 339
    const/high16 v17, 0x3f400000    # 0.75f

    .line 340
    .line 341
    const/high16 v18, 0x3f400000    # 0.75f

    .line 342
    .line 343
    const v13, 0x3ed1eb85    # 0.41f

    .line 344
    .line 345
    .line 346
    const/4 v14, 0x0

    .line 347
    const/high16 v15, 0x3f400000    # 0.75f

    .line 348
    .line 349
    const v16, 0x3eae147b    # 0.34f

    .line 350
    .line 351
    .line 352
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 353
    .line 354
    .line 355
    const/high16 v0, 0x40700000    # 3.75f

    .line 356
    .line 357
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 358
    .line 359
    .line 360
    const/high16 v17, -0x40400000    # -1.5f

    .line 361
    .line 362
    const/high16 v18, 0x3fc00000    # 1.5f

    .line 363
    .line 364
    const/4 v13, 0x0

    .line 365
    const v14, 0x3f547ae1    # 0.83f

    .line 366
    .line 367
    .line 368
    const v15, -0x40d47ae1    # -0.67f

    .line 369
    .line 370
    .line 371
    const/high16 v16, 0x3fc00000    # 1.5f

    .line 372
    .line 373
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 374
    .line 375
    .line 376
    const/high16 v0, 0x40f00000    # 7.5f

    .line 377
    .line 378
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 379
    .line 380
    .line 381
    const/high16 v17, 0x40c00000    # 6.0f

    .line 382
    .line 383
    const/high16 v18, 0x41580000    # 13.5f

    .line 384
    .line 385
    const v13, 0x40d570a4    # 6.67f

    .line 386
    .line 387
    .line 388
    const/high16 v14, 0x41700000    # 15.0f

    .line 389
    .line 390
    const/high16 v15, 0x40c00000    # 6.0f

    .line 391
    .line 392
    const v16, 0x416547ae    # 14.33f

    .line 393
    .line 394
    .line 395
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 396
    .line 397
    .line 398
    const/high16 v0, -0x41800000    # -0.25f

    .line 399
    .line 400
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 401
    .line 402
    .line 403
    const/high16 v17, 0x3f400000    # 0.75f

    .line 404
    .line 405
    const/high16 v18, -0x40c00000    # -0.75f

    .line 406
    .line 407
    const/4 v13, 0x0

    .line 408
    const v14, -0x412e147b    # -0.41f

    .line 409
    .line 410
    .line 411
    const v15, 0x3eae147b    # 0.34f

    .line 412
    .line 413
    .line 414
    const/high16 v16, -0x40c00000    # -0.75f

    .line 415
    .line 416
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 417
    .line 418
    .line 419
    const/high16 v18, 0x3f400000    # 0.75f

    .line 420
    .line 421
    const v13, 0x3ed1eb85    # 0.41f

    .line 422
    .line 423
    .line 424
    const/4 v14, 0x0

    .line 425
    const/high16 v15, 0x3f400000    # 0.75f

    .line 426
    .line 427
    const v16, 0x3eae147b    # 0.34f

    .line 428
    .line 429
    .line 430
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 431
    .line 432
    .line 433
    const/high16 v0, 0x41580000    # 13.5f

    .line 434
    .line 435
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 436
    .line 437
    .line 438
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 439
    .line 440
    .line 441
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 442
    .line 443
    .line 444
    move-result-object v2

    .line 445
    const/16 v16, 0x3800

    .line 446
    .line 447
    const/16 v17, 0x0

    .line 448
    .line 449
    const/high16 v6, 0x3f800000    # 1.0f

    .line 450
    .line 451
    const/high16 v8, 0x3f800000    # 1.0f

    .line 452
    .line 453
    const/4 v7, 0x0

    .line 454
    const/high16 v9, 0x3f800000    # 1.0f

    .line 455
    .line 456
    const/high16 v12, 0x3f800000    # 1.0f

    .line 457
    .line 458
    const/4 v13, 0x0

    .line 459
    const/4 v15, 0x0

    .line 460
    const-string v4, ""

    .line 461
    .line 462
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 463
    .line 464
    .line 465
    move-result-object v0

    .line 466
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 467
    .line 468
    .line 469
    move-result-object v0

    .line 470
    sput-object v0, Landroidx/compose/material/icons/rounded/JavascriptKt;->_javascript:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 471
    .line 472
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 473
    .line 474
    .line 475
    return-object v0
.end method
