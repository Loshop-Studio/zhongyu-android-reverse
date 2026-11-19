.class public final Landroidx/compose/material/icons/rounded/MpKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _mp:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getMp(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/MpKt;->_mp:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.Mp"

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
    const/high16 v0, 0x41980000    # 19.0f

    .line 71
    .line 72
    const/high16 v2, 0x40400000    # 3.0f

    .line 73
    .line 74
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v0, 0x40a00000    # 5.0f

    .line 78
    .line 79
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 80
    .line 81
    .line 82
    const/high16 v17, 0x40400000    # 3.0f

    .line 83
    .line 84
    const/high16 v18, 0x40a00000    # 5.0f

    .line 85
    .line 86
    const v13, 0x4079999a    # 3.9f

    .line 87
    .line 88
    .line 89
    const/high16 v14, 0x40400000    # 3.0f

    .line 90
    .line 91
    const/high16 v15, 0x40400000    # 3.0f

    .line 92
    .line 93
    const v16, 0x4079999a    # 3.9f

    .line 94
    .line 95
    .line 96
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 97
    .line 98
    .line 99
    const/high16 v0, 0x41600000    # 14.0f

    .line 100
    .line 101
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 102
    .line 103
    .line 104
    const/high16 v17, 0x40000000    # 2.0f

    .line 105
    .line 106
    const/high16 v18, 0x40000000    # 2.0f

    .line 107
    .line 108
    const/4 v13, 0x0

    .line 109
    const v14, 0x3f8ccccd    # 1.1f

    .line 110
    .line 111
    .line 112
    const v15, 0x3f666666    # 0.9f

    .line 113
    .line 114
    .line 115
    const/high16 v16, 0x40000000    # 2.0f

    .line 116
    .line 117
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 118
    .line 119
    .line 120
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 121
    .line 122
    .line 123
    const/high16 v18, -0x40000000    # -2.0f

    .line 124
    .line 125
    const v13, 0x3f8ccccd    # 1.1f

    .line 126
    .line 127
    .line 128
    const/4 v14, 0x0

    .line 129
    const/high16 v15, 0x40000000    # 2.0f

    .line 130
    .line 131
    const v16, -0x4099999a    # -0.9f

    .line 132
    .line 133
    .line 134
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 135
    .line 136
    .line 137
    const/high16 v0, 0x40a00000    # 5.0f

    .line 138
    .line 139
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 140
    .line 141
    .line 142
    const/high16 v17, 0x41980000    # 19.0f

    .line 143
    .line 144
    const/high16 v18, 0x40400000    # 3.0f

    .line 145
    .line 146
    const/high16 v13, 0x41a80000    # 21.0f

    .line 147
    .line 148
    const v14, 0x4079999a    # 3.9f

    .line 149
    .line 150
    .line 151
    const v15, 0x41a0cccd    # 20.1f

    .line 152
    .line 153
    .line 154
    const/high16 v16, 0x40400000    # 3.0f

    .line 155
    .line 156
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 157
    .line 158
    .line 159
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 160
    .line 161
    .line 162
    const/high16 v0, 0x40e00000    # 7.0f

    .line 163
    .line 164
    const/high16 v2, 0x41100000    # 9.0f

    .line 165
    .line 166
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 167
    .line 168
    .line 169
    const/high16 v0, 0x40900000    # 4.5f

    .line 170
    .line 171
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 172
    .line 173
    .line 174
    const/high16 v17, 0x3f800000    # 1.0f

    .line 175
    .line 176
    const/high16 v18, 0x3f800000    # 1.0f

    .line 177
    .line 178
    const v13, 0x3f0ccccd    # 0.55f

    .line 179
    .line 180
    .line 181
    const/4 v14, 0x0

    .line 182
    const/high16 v15, 0x3f800000    # 1.0f

    .line 183
    .line 184
    const v16, 0x3ee66666    # 0.45f

    .line 185
    .line 186
    .line 187
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 188
    .line 189
    .line 190
    const/high16 v0, 0x40880000    # 4.25f

    .line 191
    .line 192
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 193
    .line 194
    .line 195
    const/high16 v17, -0x40c00000    # -0.75f

    .line 196
    .line 197
    const/high16 v18, 0x3f400000    # 0.75f

    .line 198
    .line 199
    const/4 v13, 0x0

    .line 200
    const v14, 0x3ed1eb85    # 0.41f

    .line 201
    .line 202
    .line 203
    const v15, -0x4151eb85    # -0.34f

    .line 204
    .line 205
    .line 206
    const/high16 v16, 0x3f400000    # 0.75f

    .line 207
    .line 208
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 209
    .line 210
    .line 211
    const/4 v0, 0x0

    .line 212
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 213
    .line 214
    .line 215
    const/high16 v17, 0x41300000    # 11.0f

    .line 216
    .line 217
    const/high16 v18, 0x41640000    # 14.25f

    .line 218
    .line 219
    const v13, 0x413570a4    # 11.34f

    .line 220
    .line 221
    .line 222
    const/high16 v14, 0x41700000    # 15.0f

    .line 223
    .line 224
    const/high16 v15, 0x41300000    # 11.0f

    .line 225
    .line 226
    const v16, 0x416a8f5c    # 14.66f

    .line 227
    .line 228
    .line 229
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 230
    .line 231
    .line 232
    const/high16 v0, 0x41280000    # 10.5f

    .line 233
    .line 234
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 235
    .line 236
    .line 237
    const/high16 v0, -0x40800000    # -1.0f

    .line 238
    .line 239
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 240
    .line 241
    .line 242
    const/high16 v0, 0x40100000    # 2.25f

    .line 243
    .line 244
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 245
    .line 246
    .line 247
    const/high16 v17, -0x40c00000    # -0.75f

    .line 248
    .line 249
    const/high16 v18, 0x3f400000    # 0.75f

    .line 250
    .line 251
    const/4 v13, 0x0

    .line 252
    const v14, 0x3ed1eb85    # 0.41f

    .line 253
    .line 254
    .line 255
    const v15, -0x4151eb85    # -0.34f

    .line 256
    .line 257
    .line 258
    const/high16 v16, 0x3f400000    # 0.75f

    .line 259
    .line 260
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 261
    .line 262
    .line 263
    const/4 v0, 0x0

    .line 264
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 265
    .line 266
    .line 267
    const/high16 v18, -0x40c00000    # -0.75f

    .line 268
    .line 269
    const v13, -0x412e147b    # -0.41f

    .line 270
    .line 271
    .line 272
    const/4 v14, 0x0

    .line 273
    const/high16 v15, -0x40c00000    # -0.75f

    .line 274
    .line 275
    const v16, -0x4151eb85    # -0.34f

    .line 276
    .line 277
    .line 278
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 279
    .line 280
    .line 281
    const/high16 v0, 0x41280000    # 10.5f

    .line 282
    .line 283
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 284
    .line 285
    .line 286
    const/high16 v0, -0x40800000    # -1.0f

    .line 287
    .line 288
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 289
    .line 290
    .line 291
    const/high16 v0, 0x40700000    # 3.75f

    .line 292
    .line 293
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 294
    .line 295
    .line 296
    const/high16 v17, 0x40d80000    # 6.75f

    .line 297
    .line 298
    const/high16 v18, 0x41700000    # 15.0f

    .line 299
    .line 300
    const/high16 v13, 0x40f00000    # 7.5f

    .line 301
    .line 302
    const v14, 0x416a8f5c    # 14.66f

    .line 303
    .line 304
    .line 305
    const v15, 0x40e51eb8    # 7.16f

    .line 306
    .line 307
    .line 308
    const/high16 v16, 0x41700000    # 15.0f

    .line 309
    .line 310
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 311
    .line 312
    .line 313
    const/4 v0, 0x0

    .line 314
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 315
    .line 316
    .line 317
    const/high16 v17, 0x40c00000    # 6.0f

    .line 318
    .line 319
    const/high16 v18, 0x41640000    # 14.25f

    .line 320
    .line 321
    const v13, 0x40cae148    # 6.34f

    .line 322
    .line 323
    .line 324
    const/high16 v14, 0x41700000    # 15.0f

    .line 325
    .line 326
    const/high16 v15, 0x40c00000    # 6.0f

    .line 327
    .line 328
    const v16, 0x416a8f5c    # 14.66f

    .line 329
    .line 330
    .line 331
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 332
    .line 333
    .line 334
    const/high16 v0, 0x41200000    # 10.0f

    .line 335
    .line 336
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 337
    .line 338
    .line 339
    const/high16 v17, 0x40e00000    # 7.0f

    .line 340
    .line 341
    const/high16 v18, 0x41100000    # 9.0f

    .line 342
    .line 343
    const/high16 v13, 0x40c00000    # 6.0f

    .line 344
    .line 345
    const v14, 0x41173333    # 9.45f

    .line 346
    .line 347
    .line 348
    const v15, 0x40ce6666    # 6.45f

    .line 349
    .line 350
    .line 351
    const/high16 v16, 0x41100000    # 9.0f

    .line 352
    .line 353
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 354
    .line 355
    .line 356
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 357
    .line 358
    .line 359
    const/high16 v0, 0x41640000    # 14.25f

    .line 360
    .line 361
    const/high16 v2, 0x41700000    # 15.0f

    .line 362
    .line 363
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 364
    .line 365
    .line 366
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 367
    .line 368
    .line 369
    const/high16 v17, -0x40c00000    # -0.75f

    .line 370
    .line 371
    const/high16 v18, -0x40c00000    # -0.75f

    .line 372
    .line 373
    const v13, -0x412e147b    # -0.41f

    .line 374
    .line 375
    .line 376
    const/4 v14, 0x0

    .line 377
    const/high16 v15, -0x40c00000    # -0.75f

    .line 378
    .line 379
    const v16, -0x41570a3d    # -0.33f

    .line 380
    .line 381
    .line 382
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 383
    .line 384
    .line 385
    const/high16 v0, 0x41200000    # 10.0f

    .line 386
    .line 387
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 388
    .line 389
    .line 390
    const/high16 v17, 0x3f800000    # 1.0f

    .line 391
    .line 392
    const/high16 v18, -0x40800000    # -1.0f

    .line 393
    .line 394
    const/4 v13, 0x0

    .line 395
    const v14, -0x40f33333    # -0.55f

    .line 396
    .line 397
    .line 398
    const v15, 0x3ee66666    # 0.45f

    .line 399
    .line 400
    .line 401
    const/high16 v16, -0x40800000    # -1.0f

    .line 402
    .line 403
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 404
    .line 405
    .line 406
    const/high16 v0, 0x41880000    # 17.0f

    .line 407
    .line 408
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 409
    .line 410
    .line 411
    const/high16 v18, 0x3f800000    # 1.0f

    .line 412
    .line 413
    const v13, 0x3f0ccccd    # 0.55f

    .line 414
    .line 415
    .line 416
    const/4 v14, 0x0

    .line 417
    const/high16 v15, 0x3f800000    # 1.0f

    .line 418
    .line 419
    const v16, 0x3ee66666    # 0.45f

    .line 420
    .line 421
    .line 422
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 423
    .line 424
    .line 425
    const/high16 v0, 0x40200000    # 2.5f

    .line 426
    .line 427
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 428
    .line 429
    .line 430
    const/high16 v17, -0x40800000    # -1.0f

    .line 431
    .line 432
    const/4 v13, 0x0

    .line 433
    const v14, 0x3f0ccccd    # 0.55f

    .line 434
    .line 435
    .line 436
    const v15, -0x4119999a    # -0.45f

    .line 437
    .line 438
    .line 439
    const/high16 v16, 0x3f800000    # 1.0f

    .line 440
    .line 441
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 442
    .line 443
    .line 444
    const/high16 v0, -0x40000000    # -2.0f

    .line 445
    .line 446
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 447
    .line 448
    .line 449
    const/high16 v0, 0x3f400000    # 0.75f

    .line 450
    .line 451
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 452
    .line 453
    .line 454
    const/high16 v17, 0x41640000    # 14.25f

    .line 455
    .line 456
    const/high16 v18, 0x41700000    # 15.0f

    .line 457
    .line 458
    const/high16 v13, 0x41700000    # 15.0f

    .line 459
    .line 460
    const v14, 0x416a8f5c    # 14.66f

    .line 461
    .line 462
    .line 463
    const v15, 0x416a8f5c    # 14.66f

    .line 464
    .line 465
    .line 466
    const/high16 v16, 0x41700000    # 15.0f

    .line 467
    .line 468
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 469
    .line 470
    .line 471
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 472
    .line 473
    .line 474
    const/high16 v0, 0x41400000    # 12.0f

    .line 475
    .line 476
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 477
    .line 478
    .line 479
    const/high16 v0, 0x3fc00000    # 1.5f

    .line 480
    .line 481
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 482
    .line 483
    .line 484
    const/high16 v0, -0x40400000    # -1.5f

    .line 485
    .line 486
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 487
    .line 488
    .line 489
    const/high16 v0, 0x41700000    # 15.0f

    .line 490
    .line 491
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 492
    .line 493
    .line 494
    const/high16 v0, 0x41400000    # 12.0f

    .line 495
    .line 496
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

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
    const/4 v14, 0x0

    .line 521
    const/4 v15, 0x0

    .line 522
    const-string v4, ""

    .line 523
    .line 524
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 525
    .line 526
    .line 527
    move-result-object v0

    .line 528
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 529
    .line 530
    .line 531
    move-result-object v0

    .line 532
    sput-object v0, Landroidx/compose/material/icons/rounded/MpKt;->_mp:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 533
    .line 534
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 535
    .line 536
    .line 537
    return-object v0
.end method
