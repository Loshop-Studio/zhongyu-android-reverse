.class public final Landroidx/compose/material/icons/rounded/GridOffKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _gridOff:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getGridOff(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/GridOffKt;->_gridOff:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.GridOff"

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
    const/high16 v0, 0x41000000    # 8.0f

    .line 71
    .line 72
    const/high16 v2, 0x40800000    # 4.0f

    .line 73
    .line 74
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const v0, 0x3f63d70a    # 0.89f

    .line 78
    .line 79
    .line 80
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 81
    .line 82
    .line 83
    const/high16 v0, 0x40000000    # 2.0f

    .line 84
    .line 85
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 86
    .line 87
    .line 88
    const/high16 v0, 0x41200000    # 10.0f

    .line 89
    .line 90
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 91
    .line 92
    .line 93
    const/high16 v0, 0x40800000    # 4.0f

    .line 94
    .line 95
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 96
    .line 97
    .line 98
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 99
    .line 100
    .line 101
    const v0, -0x3fc70a3d    # -2.89f

    .line 102
    .line 103
    .line 104
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 105
    .line 106
    .line 107
    const/high16 v0, 0x40000000    # 2.0f

    .line 108
    .line 109
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 110
    .line 111
    .line 112
    const/high16 v0, 0x41200000    # 10.0f

    .line 113
    .line 114
    const/high16 v2, 0x41600000    # 14.0f

    .line 115
    .line 116
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 117
    .line 118
    .line 119
    const v0, 0x3f63d70a    # 0.89f

    .line 120
    .line 121
    .line 122
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 123
    .line 124
    .line 125
    const/high16 v0, 0x40000000    # 2.0f

    .line 126
    .line 127
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 128
    .line 129
    .line 130
    const/high16 v0, 0x41200000    # 10.0f

    .line 131
    .line 132
    const/high16 v2, 0x41800000    # 16.0f

    .line 133
    .line 134
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 135
    .line 136
    .line 137
    const/high16 v0, 0x40800000    # 4.0f

    .line 138
    .line 139
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 140
    .line 141
    .line 142
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 143
    .line 144
    .line 145
    const v0, -0x3fc70a3d    # -2.89f

    .line 146
    .line 147
    .line 148
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 149
    .line 150
    .line 151
    const/high16 v0, 0x40000000    # 2.0f

    .line 152
    .line 153
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 154
    .line 155
    .line 156
    const/high16 v0, 0x41800000    # 16.0f

    .line 157
    .line 158
    const/high16 v2, 0x41a00000    # 20.0f

    .line 159
    .line 160
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 161
    .line 162
    .line 163
    const v0, 0x3f63d70a    # 0.89f

    .line 164
    .line 165
    .line 166
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 167
    .line 168
    .line 169
    const/high16 v0, 0x40000000    # 2.0f

    .line 170
    .line 171
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 172
    .line 173
    .line 174
    const/high16 v0, 0x41b00000    # 22.0f

    .line 175
    .line 176
    const/high16 v2, 0x40800000    # 4.0f

    .line 177
    .line 178
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 179
    .line 180
    .line 181
    const/high16 v17, -0x40000000    # -2.0f

    .line 182
    .line 183
    const/high16 v18, -0x40000000    # -2.0f

    .line 184
    .line 185
    const/4 v13, 0x0

    .line 186
    const v14, -0x40733333    # -1.1f

    .line 187
    .line 188
    .line 189
    const v15, -0x4099999a    # -0.9f

    .line 190
    .line 191
    .line 192
    const/high16 v16, -0x40000000    # -2.0f

    .line 193
    .line 194
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 195
    .line 196
    .line 197
    const v0, 0x40a3851f    # 5.11f

    .line 198
    .line 199
    .line 200
    const/high16 v2, 0x40000000    # 2.0f

    .line 201
    .line 202
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 203
    .line 204
    .line 205
    const/high16 v0, 0x40000000    # 2.0f

    .line 206
    .line 207
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 208
    .line 209
    .line 210
    const/high16 v0, 0x41000000    # 8.0f

    .line 211
    .line 212
    const/high16 v2, 0x40800000    # 4.0f

    .line 213
    .line 214
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 215
    .line 216
    .line 217
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 218
    .line 219
    .line 220
    const/high16 v0, 0x41800000    # 16.0f

    .line 221
    .line 222
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 223
    .line 224
    .line 225
    const/high16 v0, 0x40400000    # 3.0f

    .line 226
    .line 227
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 228
    .line 229
    .line 230
    const/high16 v17, 0x3f800000    # 1.0f

    .line 231
    .line 232
    const/high16 v18, 0x3f800000    # 1.0f

    .line 233
    .line 234
    const v13, 0x3f0ccccd    # 0.55f

    .line 235
    .line 236
    .line 237
    const/4 v14, 0x0

    .line 238
    const/high16 v15, 0x3f800000    # 1.0f

    .line 239
    .line 240
    const v16, 0x3ee66666    # 0.45f

    .line 241
    .line 242
    .line 243
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 244
    .line 245
    .line 246
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 247
    .line 248
    .line 249
    const/high16 v0, -0x3f800000    # -4.0f

    .line 250
    .line 251
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 252
    .line 253
    .line 254
    const/high16 v0, 0x41800000    # 16.0f

    .line 255
    .line 256
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 257
    .line 258
    .line 259
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 260
    .line 261
    .line 262
    const v0, 0x41b147ae    # 22.16f

    .line 263
    .line 264
    .line 265
    const v2, 0x41af0a3d    # 21.88f

    .line 266
    .line 267
    .line 268
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 269
    .line 270
    .line 271
    const v0, 0x4007ae14    # 2.12f

    .line 272
    .line 273
    .line 274
    const v2, 0x3feb851f    # 1.84f

    .line 275
    .line 276
    .line 277
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 278
    .line 279
    .line 280
    const v17, -0x404b851f    # -1.41f

    .line 281
    .line 282
    .line 283
    const/16 v18, 0x0

    .line 284
    .line 285
    const v13, -0x413851ec    # -0.39f

    .line 286
    .line 287
    .line 288
    const v14, -0x413851ec    # -0.39f

    .line 289
    .line 290
    .line 291
    const v15, -0x407d70a4    # -1.02f

    .line 292
    .line 293
    .line 294
    const v16, -0x413851ec    # -0.39f

    .line 295
    .line 296
    .line 297
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 298
    .line 299
    .line 300
    const/16 v17, 0x0

    .line 301
    .line 302
    const v18, 0x3fb47ae1    # 1.41f

    .line 303
    .line 304
    .line 305
    const v14, 0x3ec7ae14    # 0.39f

    .line 306
    .line 307
    .line 308
    const v15, -0x413851ec    # -0.39f

    .line 309
    .line 310
    .line 311
    const v16, 0x3f828f5c    # 1.02f

    .line 312
    .line 313
    .line 314
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 315
    .line 316
    .line 317
    const v0, 0x4091999a    # 4.55f

    .line 318
    .line 319
    .line 320
    const/high16 v2, 0x40000000    # 2.0f

    .line 321
    .line 322
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 323
    .line 324
    .line 325
    const/high16 v0, 0x41a00000    # 20.0f

    .line 326
    .line 327
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 328
    .line 329
    .line 330
    const/high16 v17, 0x40000000    # 2.0f

    .line 331
    .line 332
    const/high16 v18, 0x40000000    # 2.0f

    .line 333
    .line 334
    const/4 v13, 0x0

    .line 335
    const v14, 0x3f8ccccd    # 1.1f

    .line 336
    .line 337
    .line 338
    const v15, 0x3f666666    # 0.9f

    .line 339
    .line 340
    .line 341
    const/high16 v16, 0x40000000    # 2.0f

    .line 342
    .line 343
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 344
    .line 345
    .line 346
    const v0, 0x41773333    # 15.45f

    .line 347
    .line 348
    .line 349
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 350
    .line 351
    .line 352
    const v0, 0x3fa66666    # 1.3f

    .line 353
    .line 354
    .line 355
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 356
    .line 357
    .line 358
    const v17, 0x3fb47ae1    # 1.41f

    .line 359
    .line 360
    .line 361
    const/16 v18, 0x0

    .line 362
    .line 363
    const v13, 0x3ec7ae14    # 0.39f

    .line 364
    .line 365
    .line 366
    const v14, 0x3ec7ae14    # 0.39f

    .line 367
    .line 368
    .line 369
    const v15, 0x3f828f5c    # 1.02f

    .line 370
    .line 371
    .line 372
    const v16, 0x3ec7ae14    # 0.39f

    .line 373
    .line 374
    .line 375
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 376
    .line 377
    .line 378
    const/16 v17, 0x0

    .line 379
    .line 380
    const v18, -0x404a3d71    # -1.42f

    .line 381
    .line 382
    .line 383
    const v14, -0x413851ec    # -0.39f

    .line 384
    .line 385
    .line 386
    const v15, 0x3ec7ae14    # 0.39f

    .line 387
    .line 388
    .line 389
    const v16, -0x407c28f6    # -1.03f

    .line 390
    .line 391
    .line 392
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 393
    .line 394
    .line 395
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 396
    .line 397
    .line 398
    const v0, 0x4148cccd    # 12.55f

    .line 399
    .line 400
    .line 401
    const/high16 v2, 0x41200000    # 10.0f

    .line 402
    .line 403
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 404
    .line 405
    .line 406
    const v0, 0x41373333    # 11.45f

    .line 407
    .line 408
    .line 409
    const/high16 v2, 0x41600000    # 14.0f

    .line 410
    .line 411
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 412
    .line 413
    .line 414
    const/high16 v0, 0x41200000    # 10.0f

    .line 415
    .line 416
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 417
    .line 418
    .line 419
    const v0, -0x40466666    # -1.45f

    .line 420
    .line 421
    .line 422
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 423
    .line 424
    .line 425
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 426
    .line 427
    .line 428
    const v0, 0x40d1999a    # 6.55f

    .line 429
    .line 430
    .line 431
    const/high16 v2, 0x40800000    # 4.0f

    .line 432
    .line 433
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 434
    .line 435
    .line 436
    const v0, 0x40ae6666    # 5.45f

    .line 437
    .line 438
    .line 439
    const/high16 v2, 0x41000000    # 8.0f

    .line 440
    .line 441
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 442
    .line 443
    .line 444
    const/high16 v0, 0x41000000    # 8.0f

    .line 445
    .line 446
    const/high16 v2, 0x40800000    # 4.0f

    .line 447
    .line 448
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 449
    .line 450
    .line 451
    const v0, 0x40d1999a    # 6.55f

    .line 452
    .line 453
    .line 454
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 455
    .line 456
    .line 457
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 458
    .line 459
    .line 460
    const/high16 v0, 0x41000000    # 8.0f

    .line 461
    .line 462
    const/high16 v2, 0x41a00000    # 20.0f

    .line 463
    .line 464
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 465
    .line 466
    .line 467
    const/high16 v0, 0x40a00000    # 5.0f

    .line 468
    .line 469
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 470
    .line 471
    .line 472
    const/high16 v17, -0x40800000    # -1.0f

    .line 473
    .line 474
    const/high16 v18, -0x40800000    # -1.0f

    .line 475
    .line 476
    const v13, -0x40f33333    # -0.55f

    .line 477
    .line 478
    .line 479
    const/4 v14, 0x0

    .line 480
    const/high16 v15, -0x40800000    # -1.0f

    .line 481
    .line 482
    const v16, -0x4119999a    # -0.45f

    .line 483
    .line 484
    .line 485
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 486
    .line 487
    .line 488
    const/high16 v0, -0x3fc00000    # -3.0f

    .line 489
    .line 490
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 491
    .line 492
    .line 493
    const/high16 v0, 0x40800000    # 4.0f

    .line 494
    .line 495
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 496
    .line 497
    .line 498
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 499
    .line 500
    .line 501
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 502
    .line 503
    .line 504
    const/high16 v0, 0x41000000    # 8.0f

    .line 505
    .line 506
    const/high16 v2, 0x41600000    # 14.0f

    .line 507
    .line 508
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 509
    .line 510
    .line 511
    const/high16 v0, 0x41600000    # 14.0f

    .line 512
    .line 513
    const/high16 v2, 0x40800000    # 4.0f

    .line 514
    .line 515
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 516
    .line 517
    .line 518
    const/high16 v0, -0x3f800000    # -4.0f

    .line 519
    .line 520
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 521
    .line 522
    .line 523
    const v0, 0x405ccccd    # 3.45f

    .line 524
    .line 525
    .line 526
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 527
    .line 528
    .line 529
    const v0, 0x3f0ccccd    # 0.55f

    .line 530
    .line 531
    .line 532
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 533
    .line 534
    .line 535
    const/high16 v0, 0x41000000    # 8.0f

    .line 536
    .line 537
    const/high16 v2, 0x41600000    # 14.0f

    .line 538
    .line 539
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 540
    .line 541
    .line 542
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 543
    .line 544
    .line 545
    const/high16 v0, 0x41600000    # 14.0f

    .line 546
    .line 547
    const/high16 v2, 0x41a00000    # 20.0f

    .line 548
    .line 549
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 550
    .line 551
    .line 552
    const/high16 v0, -0x3f800000    # -4.0f

    .line 553
    .line 554
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 555
    .line 556
    .line 557
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 558
    .line 559
    .line 560
    const v0, 0x405ccccd    # 3.45f

    .line 561
    .line 562
    .line 563
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 564
    .line 565
    .line 566
    const v0, 0x3f0ccccd    # 0.55f

    .line 567
    .line 568
    .line 569
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 570
    .line 571
    .line 572
    const/high16 v0, 0x41600000    # 14.0f

    .line 573
    .line 574
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 575
    .line 576
    .line 577
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 578
    .line 579
    .line 580
    const/high16 v0, 0x41800000    # 16.0f

    .line 581
    .line 582
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 583
    .line 584
    .line 585
    const v0, -0x40466666    # -1.45f

    .line 586
    .line 587
    .line 588
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 589
    .line 590
    .line 591
    const v0, 0x418b999a    # 17.45f

    .line 592
    .line 593
    .line 594
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 595
    .line 596
    .line 597
    const/high16 v0, 0x41800000    # 16.0f

    .line 598
    .line 599
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 600
    .line 601
    .line 602
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 603
    .line 604
    .line 605
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 606
    .line 607
    .line 608
    move-result-object v2

    .line 609
    const/16 v16, 0x3800

    .line 610
    .line 611
    const/16 v17, 0x0

    .line 612
    .line 613
    const/high16 v6, 0x3f800000    # 1.0f

    .line 614
    .line 615
    const/high16 v8, 0x3f800000    # 1.0f

    .line 616
    .line 617
    const/4 v7, 0x0

    .line 618
    const/high16 v9, 0x3f800000    # 1.0f

    .line 619
    .line 620
    const/high16 v12, 0x3f800000    # 1.0f

    .line 621
    .line 622
    const/4 v13, 0x0

    .line 623
    const/4 v15, 0x0

    .line 624
    const-string v4, ""

    .line 625
    .line 626
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 627
    .line 628
    .line 629
    move-result-object v0

    .line 630
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 631
    .line 632
    .line 633
    move-result-object v0

    .line 634
    sput-object v0, Landroidx/compose/material/icons/rounded/GridOffKt;->_gridOff:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 635
    .line 636
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 637
    .line 638
    .line 639
    return-object v0
.end method
