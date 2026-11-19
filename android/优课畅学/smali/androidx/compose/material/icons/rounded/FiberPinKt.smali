.class public final Landroidx/compose/material/icons/rounded/FiberPinKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _fiberPin:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getFiberPin(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/FiberPinKt;->_fiberPin:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.FiberPin"

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
    const/high16 v0, 0x41a00000    # 20.0f

    .line 71
    .line 72
    const/high16 v2, 0x40800000    # 4.0f

    .line 73
    .line 74
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v0, 0x40800000    # 4.0f

    .line 78
    .line 79
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 80
    .line 81
    .line 82
    const v17, -0x400147ae    # -1.99f

    .line 83
    .line 84
    .line 85
    const/high16 v18, 0x40000000    # 2.0f

    .line 86
    .line 87
    const v13, -0x4071eb85    # -1.11f

    .line 88
    .line 89
    .line 90
    const/4 v14, 0x0

    .line 91
    const v15, -0x400147ae    # -1.99f

    .line 92
    .line 93
    .line 94
    const v16, 0x3f63d70a    # 0.89f

    .line 95
    .line 96
    .line 97
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 98
    .line 99
    .line 100
    const/high16 v0, 0x41900000    # 18.0f

    .line 101
    .line 102
    const/high16 v2, 0x40000000    # 2.0f

    .line 103
    .line 104
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 105
    .line 106
    .line 107
    const/high16 v17, 0x40000000    # 2.0f

    .line 108
    .line 109
    const/4 v13, 0x0

    .line 110
    const v14, 0x3f8e147b    # 1.11f

    .line 111
    .line 112
    .line 113
    const v15, 0x3f63d70a    # 0.89f

    .line 114
    .line 115
    .line 116
    const/high16 v16, 0x40000000    # 2.0f

    .line 117
    .line 118
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 119
    .line 120
    .line 121
    const/high16 v0, 0x41800000    # 16.0f

    .line 122
    .line 123
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 124
    .line 125
    .line 126
    const/high16 v18, -0x40000000    # -2.0f

    .line 127
    .line 128
    const v13, 0x3f8e147b    # 1.11f

    .line 129
    .line 130
    .line 131
    const/4 v14, 0x0

    .line 132
    const/high16 v15, 0x40000000    # 2.0f

    .line 133
    .line 134
    const v16, -0x409c28f6    # -0.89f

    .line 135
    .line 136
    .line 137
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 138
    .line 139
    .line 140
    const/high16 v0, 0x41b00000    # 22.0f

    .line 141
    .line 142
    const/high16 v2, 0x40c00000    # 6.0f

    .line 143
    .line 144
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 145
    .line 146
    .line 147
    const/high16 v17, -0x40000000    # -2.0f

    .line 148
    .line 149
    const/4 v13, 0x0

    .line 150
    const v14, -0x4071eb85    # -1.11f

    .line 151
    .line 152
    .line 153
    const v15, -0x409c28f6    # -0.89f

    .line 154
    .line 155
    .line 156
    const/high16 v16, -0x40000000    # -2.0f

    .line 157
    .line 158
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 159
    .line 160
    .line 161
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 162
    .line 163
    .line 164
    const/high16 v0, 0x41100000    # 9.0f

    .line 165
    .line 166
    const/high16 v2, 0x41380000    # 11.5f

    .line 167
    .line 168
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 169
    .line 170
    .line 171
    const/high16 v17, -0x40400000    # -1.5f

    .line 172
    .line 173
    const/high16 v18, 0x3fc00000    # 1.5f

    .line 174
    .line 175
    const v14, 0x3f547ae1    # 0.83f

    .line 176
    .line 177
    .line 178
    const v15, -0x40d47ae1    # -0.67f

    .line 179
    .line 180
    .line 181
    const/high16 v16, 0x3fc00000    # 1.5f

    .line 182
    .line 183
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 184
    .line 185
    .line 186
    const/high16 v0, -0x40000000    # -2.0f

    .line 187
    .line 188
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 189
    .line 190
    .line 191
    const/high16 v0, 0x3fa00000    # 1.25f

    .line 192
    .line 193
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 194
    .line 195
    .line 196
    const/high16 v17, -0x40c00000    # -0.75f

    .line 197
    .line 198
    const/high16 v18, 0x3f400000    # 0.75f

    .line 199
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
    const v0, 0x416a8f5c    # 14.66f

    .line 212
    .line 213
    .line 214
    const/high16 v2, 0x41640000    # 14.25f

    .line 215
    .line 216
    const/high16 v4, 0x40800000    # 4.0f

    .line 217
    .line 218
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 219
    .line 220
    .line 221
    const/high16 v0, 0x41200000    # 10.0f

    .line 222
    .line 223
    const/high16 v2, 0x40800000    # 4.0f

    .line 224
    .line 225
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 226
    .line 227
    .line 228
    const/high16 v17, 0x3f800000    # 1.0f

    .line 229
    .line 230
    const/high16 v18, -0x40800000    # -1.0f

    .line 231
    .line 232
    const v14, -0x40f33333    # -0.55f

    .line 233
    .line 234
    .line 235
    const v15, 0x3ee66666    # 0.45f

    .line 236
    .line 237
    .line 238
    const/high16 v16, -0x40800000    # -1.0f

    .line 239
    .line 240
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 241
    .line 242
    .line 243
    const/high16 v0, 0x40200000    # 2.5f

    .line 244
    .line 245
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 246
    .line 247
    .line 248
    const/high16 v17, 0x3fc00000    # 1.5f

    .line 249
    .line 250
    const/high16 v18, 0x3fc00000    # 1.5f

    .line 251
    .line 252
    const v13, 0x3f547ae1    # 0.83f

    .line 253
    .line 254
    .line 255
    const/4 v14, 0x0

    .line 256
    const/high16 v15, 0x3fc00000    # 1.5f

    .line 257
    .line 258
    const v16, 0x3f2b851f    # 0.67f

    .line 259
    .line 260
    .line 261
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 262
    .line 263
    .line 264
    const/high16 v0, 0x3f800000    # 1.0f

    .line 265
    .line 266
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 267
    .line 268
    .line 269
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 270
    .line 271
    .line 272
    const/high16 v0, 0x41480000    # 12.5f

    .line 273
    .line 274
    const/high16 v2, 0x41640000    # 14.25f

    .line 275
    .line 276
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 277
    .line 278
    .line 279
    const/high16 v17, -0x40c00000    # -0.75f

    .line 280
    .line 281
    const/high16 v18, 0x3f400000    # 0.75f

    .line 282
    .line 283
    const/4 v13, 0x0

    .line 284
    const v14, 0x3ed1eb85    # 0.41f

    .line 285
    .line 286
    .line 287
    const v15, -0x4151eb85    # -0.34f

    .line 288
    .line 289
    .line 290
    const/high16 v16, 0x3f400000    # 0.75f

    .line 291
    .line 292
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 293
    .line 294
    .line 295
    const v0, -0x4151eb85    # -0.34f

    .line 296
    .line 297
    .line 298
    const/high16 v2, -0x40c00000    # -0.75f

    .line 299
    .line 300
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 301
    .line 302
    .line 303
    const/high16 v0, -0x3f700000    # -4.5f

    .line 304
    .line 305
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 306
    .line 307
    .line 308
    const/high16 v17, 0x3f400000    # 0.75f

    .line 309
    .line 310
    const/high16 v18, -0x40c00000    # -0.75f

    .line 311
    .line 312
    const v14, -0x412e147b    # -0.41f

    .line 313
    .line 314
    .line 315
    const v15, 0x3eae147b    # 0.34f

    .line 316
    .line 317
    .line 318
    const/high16 v16, -0x40c00000    # -0.75f

    .line 319
    .line 320
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 321
    .line 322
    .line 323
    const v0, 0x3eae147b    # 0.34f

    .line 324
    .line 325
    .line 326
    const/high16 v2, 0x3f400000    # 0.75f

    .line 327
    .line 328
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 329
    .line 330
    .line 331
    const/high16 v0, 0x40900000    # 4.5f

    .line 332
    .line 333
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 334
    .line 335
    .line 336
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 337
    .line 338
    .line 339
    const v0, 0x41635c29    # 14.21f

    .line 340
    .line 341
    .line 342
    const/high16 v2, 0x41a00000    # 20.0f

    .line 343
    .line 344
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 345
    .line 346
    .line 347
    const v17, -0x40b5c28f    # -0.79f

    .line 348
    .line 349
    .line 350
    const v18, 0x3f4a3d71    # 0.79f

    .line 351
    .line 352
    .line 353
    const v14, 0x3ee147ae    # 0.44f

    .line 354
    .line 355
    .line 356
    const v15, -0x414ccccd    # -0.35f

    .line 357
    .line 358
    .line 359
    const v16, 0x3f4a3d71    # 0.79f

    .line 360
    .line 361
    .line 362
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 363
    .line 364
    .line 365
    const v17, -0x40dc28f6    # -0.64f

    .line 366
    .line 367
    .line 368
    const v18, -0x41570a3d    # -0.33f

    .line 369
    .line 370
    .line 371
    const/high16 v13, -0x41800000    # -0.25f

    .line 372
    .line 373
    const/4 v14, 0x0

    .line 374
    const v15, -0x41051eb8    # -0.49f

    .line 375
    .line 376
    .line 377
    const v16, -0x420a3d71    # -0.12f

    .line 378
    .line 379
    .line 380
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 381
    .line 382
    .line 383
    const v0, -0x3fec28f6    # -2.31f

    .line 384
    .line 385
    .line 386
    const v2, -0x3fb51eb8    # -3.17f

    .line 387
    .line 388
    .line 389
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 390
    .line 391
    .line 392
    const v0, 0x403851ec    # 2.88f

    .line 393
    .line 394
    .line 395
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 396
    .line 397
    .line 398
    const v17, -0x40e147ae    # -0.62f

    .line 399
    .line 400
    .line 401
    const v18, 0x3f1eb852    # 0.62f

    .line 402
    .line 403
    .line 404
    const/4 v13, 0x0

    .line 405
    const v14, 0x3eae147b    # 0.34f

    .line 406
    .line 407
    .line 408
    const v15, -0x4170a3d7    # -0.28f

    .line 409
    .line 410
    .line 411
    const v16, 0x3f1eb852    # 0.62f

    .line 412
    .line 413
    .line 414
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 415
    .line 416
    .line 417
    const v0, -0x43dc28f6    # -0.01f

    .line 418
    .line 419
    .line 420
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 421
    .line 422
    .line 423
    const v17, -0x40deb852    # -0.63f

    .line 424
    .line 425
    .line 426
    const v18, -0x40e147ae    # -0.62f

    .line 427
    .line 428
    .line 429
    const v13, -0x414ccccd    # -0.35f

    .line 430
    .line 431
    .line 432
    const/4 v14, 0x0

    .line 433
    const v15, -0x40deb852    # -0.63f

    .line 434
    .line 435
    .line 436
    const v16, -0x4170a3d7    # -0.28f

    .line 437
    .line 438
    .line 439
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 440
    .line 441
    .line 442
    const/high16 v0, 0x41700000    # 15.0f

    .line 443
    .line 444
    const v2, 0x411d47ae    # 9.83f

    .line 445
    .line 446
    .line 447
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 448
    .line 449
    .line 450
    const v17, 0x3f547ae1    # 0.83f

    .line 451
    .line 452
    .line 453
    const v18, -0x40ab851f    # -0.83f

    .line 454
    .line 455
    .line 456
    const/4 v13, 0x0

    .line 457
    const v14, -0x41147ae1    # -0.46f

    .line 458
    .line 459
    .line 460
    const v15, 0x3ebd70a4    # 0.37f

    .line 461
    .line 462
    .line 463
    const v16, -0x40ab851f    # -0.83f

    .line 464
    .line 465
    .line 466
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 467
    .line 468
    .line 469
    const v17, 0x3f2b851f    # 0.67f

    .line 470
    .line 471
    .line 472
    const v18, 0x3eb33333    # 0.35f

    .line 473
    .line 474
    .line 475
    const v13, 0x3e8a3d71    # 0.27f

    .line 476
    .line 477
    .line 478
    const/4 v14, 0x0

    .line 479
    const v15, 0x3f051eb8    # 0.52f

    .line 480
    .line 481
    .line 482
    const v16, 0x3e051eb8    # 0.13f

    .line 483
    .line 484
    .line 485
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 486
    .line 487
    .line 488
    const/high16 v0, 0x40100000    # 2.25f

    .line 489
    .line 490
    const v2, 0x4049999a    # 3.15f

    .line 491
    .line 492
    .line 493
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 494
    .line 495
    .line 496
    const/high16 v0, 0x41960000    # 18.75f

    .line 497
    .line 498
    const v2, 0x4119eb85    # 9.62f

    .line 499
    .line 500
    .line 501
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 502
    .line 503
    .line 504
    const v17, 0x3f1eb852    # 0.62f

    .line 505
    .line 506
    .line 507
    const v18, -0x40e147ae    # -0.62f

    .line 508
    .line 509
    .line 510
    const/4 v13, 0x0

    .line 511
    const v14, -0x4151eb85    # -0.34f

    .line 512
    .line 513
    .line 514
    const v15, 0x3e8f5c29    # 0.28f

    .line 515
    .line 516
    .line 517
    const v16, -0x40e147ae    # -0.62f

    .line 518
    .line 519
    .line 520
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 521
    .line 522
    .line 523
    const v0, 0x3c23d70a    # 0.01f

    .line 524
    .line 525
    .line 526
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 527
    .line 528
    .line 529
    const v18, 0x3f1eb852    # 0.62f

    .line 530
    .line 531
    .line 532
    const v13, 0x3eae147b    # 0.34f

    .line 533
    .line 534
    .line 535
    const/4 v14, 0x0

    .line 536
    const v15, 0x3f1eb852    # 0.62f

    .line 537
    .line 538
    .line 539
    const v16, 0x3e8f5c29    # 0.28f

    .line 540
    .line 541
    .line 542
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 543
    .line 544
    .line 545
    const v0, 0x4092e148    # 4.59f

    .line 546
    .line 547
    .line 548
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 549
    .line 550
    .line 551
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 552
    .line 553
    .line 554
    const/high16 v0, 0x40b00000    # 5.5f

    .line 555
    .line 556
    const/high16 v2, 0x41280000    # 10.5f

    .line 557
    .line 558
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 559
    .line 560
    .line 561
    const/high16 v0, 0x40000000    # 2.0f

    .line 562
    .line 563
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 564
    .line 565
    .line 566
    const/high16 v0, 0x3f800000    # 1.0f

    .line 567
    .line 568
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 569
    .line 570
    .line 571
    const/high16 v0, -0x40000000    # -2.0f

    .line 572
    .line 573
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 574
    .line 575
    .line 576
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 577
    .line 578
    .line 579
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 580
    .line 581
    .line 582
    move-result-object v2

    .line 583
    const/16 v16, 0x3800

    .line 584
    .line 585
    const/16 v17, 0x0

    .line 586
    .line 587
    const/high16 v6, 0x3f800000    # 1.0f

    .line 588
    .line 589
    const/high16 v8, 0x3f800000    # 1.0f

    .line 590
    .line 591
    const/4 v7, 0x0

    .line 592
    const/high16 v9, 0x3f800000    # 1.0f

    .line 593
    .line 594
    const/high16 v12, 0x3f800000    # 1.0f

    .line 595
    .line 596
    const/4 v13, 0x0

    .line 597
    const/4 v15, 0x0

    .line 598
    const-string v4, ""

    .line 599
    .line 600
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 601
    .line 602
    .line 603
    move-result-object v0

    .line 604
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 605
    .line 606
    .line 607
    move-result-object v0

    .line 608
    sput-object v0, Landroidx/compose/material/icons/rounded/FiberPinKt;->_fiberPin:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 609
    .line 610
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 611
    .line 612
    .line 613
    return-object v0
.end method
