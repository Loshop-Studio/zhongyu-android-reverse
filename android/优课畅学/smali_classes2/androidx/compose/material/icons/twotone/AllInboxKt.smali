.class public final Landroidx/compose/material/icons/twotone/AllInboxKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _allInbox:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getAllInbox(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/AllInboxKt;->_allInbox:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.AllInbox"

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
    const/high16 v4, 0x40400000    # 3.0f

    .line 71
    .line 72
    const/high16 v6, 0x41980000    # 19.0f

    .line 73
    .line 74
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v6, 0x40a00000    # 5.0f

    .line 78
    .line 79
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 80
    .line 81
    .line 82
    const/high16 v25, -0x40000000    # -2.0f

    .line 83
    .line 84
    const/high16 v26, 0x40000000    # 2.0f

    .line 85
    .line 86
    const v21, -0x40733333    # -1.1f

    .line 87
    .line 88
    .line 89
    const/16 v22, 0x0

    .line 90
    .line 91
    const/high16 v23, -0x40000000    # -2.0f

    .line 92
    .line 93
    const v24, 0x3f666666    # 0.9f

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
    const/high16 v4, 0x40e00000    # 7.0f

    .line 102
    .line 103
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 104
    .line 105
    .line 106
    const/high16 v25, 0x40000000    # 2.0f

    .line 107
    .line 108
    const/16 v21, 0x0

    .line 109
    .line 110
    const v22, 0x3f8ccccd    # 1.1f

    .line 111
    .line 112
    .line 113
    const v23, 0x3f666666    # 0.9f

    .line 114
    .line 115
    .line 116
    const/high16 v24, 0x40000000    # 2.0f

    .line 117
    .line 118
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 119
    .line 120
    .line 121
    const/high16 v4, 0x41600000    # 14.0f

    .line 122
    .line 123
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 124
    .line 125
    .line 126
    const/high16 v26, -0x40000000    # -2.0f

    .line 127
    .line 128
    const v21, 0x3f8ccccd    # 1.1f

    .line 129
    .line 130
    .line 131
    const/16 v22, 0x0

    .line 132
    .line 133
    const/high16 v23, 0x40000000    # 2.0f

    .line 134
    .line 135
    const v24, -0x4099999a    # -0.9f

    .line 136
    .line 137
    .line 138
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 139
    .line 140
    .line 141
    const/high16 v4, 0x41a80000    # 21.0f

    .line 142
    .line 143
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 144
    .line 145
    .line 146
    const/high16 v25, -0x40000000    # -2.0f

    .line 147
    .line 148
    const/16 v21, 0x0

    .line 149
    .line 150
    const v22, -0x40733333    # -1.1f

    .line 151
    .line 152
    .line 153
    const v23, -0x4099999a    # -0.9f

    .line 154
    .line 155
    .line 156
    const/high16 v24, -0x40000000    # -2.0f

    .line 157
    .line 158
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 159
    .line 160
    .line 161
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 162
    .line 163
    .line 164
    const/high16 v4, 0x41200000    # 10.0f

    .line 165
    .line 166
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 167
    .line 168
    .line 169
    const v4, 0x404851ec    # 3.13f

    .line 170
    .line 171
    .line 172
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 173
    .line 174
    .line 175
    const v25, 0x3fa28f5c    # 1.27f

    .line 176
    .line 177
    .line 178
    const/high16 v26, 0x40000000    # 2.0f

    .line 179
    .line 180
    const v21, 0x3e570a3d    # 0.21f

    .line 181
    .line 182
    .line 183
    const v22, 0x3f47ae14    # 0.78f

    .line 184
    .line 185
    .line 186
    const v23, 0x3f2b851f    # 0.67f

    .line 187
    .line 188
    .line 189
    const v24, 0x3fbc28f6    # 1.47f

    .line 190
    .line 191
    .line 192
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 193
    .line 194
    .line 195
    const/high16 v4, 0x41400000    # 12.0f

    .line 196
    .line 197
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 198
    .line 199
    .line 200
    const/high16 v4, -0x40000000    # -2.0f

    .line 201
    .line 202
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 203
    .line 204
    .line 205
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 206
    .line 207
    .line 208
    const/high16 v4, 0x41400000    # 12.0f

    .line 209
    .line 210
    const/high16 v6, 0x41980000    # 19.0f

    .line 211
    .line 212
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 213
    .line 214
    .line 215
    const v4, -0x3f733333    # -4.4f

    .line 216
    .line 217
    .line 218
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 219
    .line 220
    .line 221
    const/high16 v26, -0x40000000    # -2.0f

    .line 222
    .line 223
    const v21, 0x3f19999a    # 0.6f

    .line 224
    .line 225
    .line 226
    const v22, -0x40f851ec    # -0.53f

    .line 227
    .line 228
    .line 229
    const v23, 0x3f87ae14    # 1.06f

    .line 230
    .line 231
    .line 232
    const v24, -0x4063d70a    # -1.22f

    .line 233
    .line 234
    .line 235
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 236
    .line 237
    .line 238
    const/high16 v4, 0x41200000    # 10.0f

    .line 239
    .line 240
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 241
    .line 242
    .line 243
    const/high16 v4, 0x40000000    # 2.0f

    .line 244
    .line 245
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 246
    .line 247
    .line 248
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 249
    .line 250
    .line 251
    const/high16 v4, 0x41000000    # 8.0f

    .line 252
    .line 253
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 254
    .line 255
    .line 256
    const/high16 v4, -0x3f600000    # -5.0f

    .line 257
    .line 258
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 259
    .line 260
    .line 261
    const/high16 v4, 0x3f800000    # 1.0f

    .line 262
    .line 263
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 264
    .line 265
    .line 266
    const/high16 v25, -0x40000000    # -2.0f

    .line 267
    .line 268
    const/high16 v26, 0x40000000    # 2.0f

    .line 269
    .line 270
    const/16 v21, 0x0

    .line 271
    .line 272
    const v22, 0x3f88f5c3    # 1.07f

    .line 273
    .line 274
    .line 275
    const v23, -0x4091eb85    # -0.93f

    .line 276
    .line 277
    .line 278
    const/high16 v24, 0x40000000    # 2.0f

    .line 279
    .line 280
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 281
    .line 282
    .line 283
    const v4, -0x4091eb85    # -0.93f

    .line 284
    .line 285
    .line 286
    const/high16 v6, -0x40000000    # -2.0f

    .line 287
    .line 288
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 289
    .line 290
    .line 291
    const/high16 v4, 0x41000000    # 8.0f

    .line 292
    .line 293
    const/high16 v6, 0x41200000    # 10.0f

    .line 294
    .line 295
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 296
    .line 297
    .line 298
    const/high16 v6, 0x40a00000    # 5.0f

    .line 299
    .line 300
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 301
    .line 302
    .line 303
    const/high16 v4, 0x40a00000    # 5.0f

    .line 304
    .line 305
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 306
    .line 307
    .line 308
    const/high16 v4, 0x41600000    # 14.0f

    .line 309
    .line 310
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 311
    .line 312
    .line 313
    const/high16 v4, 0x40400000    # 3.0f

    .line 314
    .line 315
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 316
    .line 317
    .line 318
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 319
    .line 320
    .line 321
    const/high16 v4, 0x41700000    # 15.0f

    .line 322
    .line 323
    const/high16 v6, 0x41600000    # 14.0f

    .line 324
    .line 325
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 326
    .line 327
    .line 328
    const/high16 v4, 0x3f800000    # 1.0f

    .line 329
    .line 330
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 331
    .line 332
    .line 333
    const v25, -0x410a3d71    # -0.48f

    .line 334
    .line 335
    .line 336
    const/high16 v26, 0x3fa00000    # 1.25f

    .line 337
    .line 338
    const v22, 0x3ef0a3d7    # 0.47f

    .line 339
    .line 340
    .line 341
    const v23, -0x41bd70a4    # -0.19f

    .line 342
    .line 343
    .line 344
    const v24, 0x3f666666    # 0.9f

    .line 345
    .line 346
    .line 347
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 348
    .line 349
    .line 350
    const v25, -0x403d70a4    # -1.52f

    .line 351
    .line 352
    .line 353
    const/high16 v26, 0x3f400000    # 0.75f

    .line 354
    .line 355
    const v21, -0x41428f5c    # -0.37f

    .line 356
    .line 357
    .line 358
    const v22, 0x3ee66666    # 0.45f

    .line 359
    .line 360
    .line 361
    const v23, -0x40947ae1    # -0.92f

    .line 362
    .line 363
    .line 364
    const/high16 v24, 0x3f400000    # 0.75f

    .line 365
    .line 366
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 367
    .line 368
    .line 369
    const v4, -0x403d70a4    # -1.52f

    .line 370
    .line 371
    .line 372
    const/high16 v6, -0x40c00000    # -0.75f

    .line 373
    .line 374
    const v7, -0x406ccccd    # -1.15f

    .line 375
    .line 376
    .line 377
    const v8, -0x41666666    # -0.3f

    .line 378
    .line 379
    .line 380
    invoke-virtual {v2, v7, v8, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 381
    .line 382
    .line 383
    const v25, -0x410a3d71    # -0.48f

    .line 384
    .line 385
    .line 386
    const/high16 v26, -0x40600000    # -1.25f

    .line 387
    .line 388
    const v21, -0x416b851f    # -0.29f

    .line 389
    .line 390
    .line 391
    const v22, -0x414ccccd    # -0.35f

    .line 392
    .line 393
    .line 394
    const v23, -0x410a3d71    # -0.48f

    .line 395
    .line 396
    .line 397
    const v24, -0x40b851ec    # -0.78f

    .line 398
    .line 399
    .line 400
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 401
    .line 402
    .line 403
    const/high16 v4, -0x40800000    # -1.0f

    .line 404
    .line 405
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 406
    .line 407
    .line 408
    const/high16 v4, 0x41700000    # 15.0f

    .line 409
    .line 410
    const/high16 v6, 0x40400000    # 3.0f

    .line 411
    .line 412
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 413
    .line 414
    .line 415
    const/high16 v4, 0x40800000    # 4.0f

    .line 416
    .line 417
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 418
    .line 419
    .line 420
    const/high16 v25, 0x40000000    # 2.0f

    .line 421
    .line 422
    const/high16 v26, 0x40000000    # 2.0f

    .line 423
    .line 424
    const/16 v21, 0x0

    .line 425
    .line 426
    const v22, 0x3f8ccccd    # 1.1f

    .line 427
    .line 428
    .line 429
    const v23, 0x3f666666    # 0.9f

    .line 430
    .line 431
    .line 432
    const/high16 v24, 0x40000000    # 2.0f

    .line 433
    .line 434
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 435
    .line 436
    .line 437
    const/high16 v4, 0x41600000    # 14.0f

    .line 438
    .line 439
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 440
    .line 441
    .line 442
    const/high16 v26, -0x40000000    # -2.0f

    .line 443
    .line 444
    const v21, 0x3f8ccccd    # 1.1f

    .line 445
    .line 446
    .line 447
    const/16 v22, 0x0

    .line 448
    .line 449
    const/high16 v23, 0x40000000    # 2.0f

    .line 450
    .line 451
    const v24, -0x4099999a    # -0.9f

    .line 452
    .line 453
    .line 454
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 455
    .line 456
    .line 457
    const/high16 v4, -0x3f800000    # -4.0f

    .line 458
    .line 459
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 460
    .line 461
    .line 462
    const/high16 v4, -0x3f200000    # -7.0f

    .line 463
    .line 464
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 465
    .line 466
    .line 467
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 468
    .line 469
    .line 470
    const/high16 v4, 0x41880000    # 17.0f

    .line 471
    .line 472
    const/high16 v6, 0x40a00000    # 5.0f

    .line 473
    .line 474
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 475
    .line 476
    .line 477
    const v4, 0x404851ec    # 3.13f

    .line 478
    .line 479
    .line 480
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 481
    .line 482
    .line 483
    const v25, 0x3db851ec    # 0.09f

    .line 484
    .line 485
    .line 486
    const/high16 v26, 0x3e800000    # 0.25f

    .line 487
    .line 488
    const v21, 0x3ca3d70a    # 0.02f

    .line 489
    .line 490
    .line 491
    const v22, 0x3db851ec    # 0.09f

    .line 492
    .line 493
    .line 494
    const v23, 0x3d75c28f    # 0.06f

    .line 495
    .line 496
    .line 497
    const v24, 0x3e2e147b    # 0.17f

    .line 498
    .line 499
    .line 500
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 501
    .line 502
    .line 503
    const v25, 0x3f970a3d    # 1.18f

    .line 504
    .line 505
    .line 506
    const/high16 v26, 0x3fe00000    # 1.75f

    .line 507
    .line 508
    const v21, 0x3e75c28f    # 0.24f

    .line 509
    .line 510
    .line 511
    const v22, 0x3f2e147b    # 0.68f

    .line 512
    .line 513
    .line 514
    const v23, 0x3f266666    # 0.65f

    .line 515
    .line 516
    .line 517
    const v24, 0x3fa3d70a    # 1.28f

    .line 518
    .line 519
    .line 520
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 521
    .line 522
    .line 523
    const/high16 v4, 0x40a00000    # 5.0f

    .line 524
    .line 525
    const/high16 v6, 0x41980000    # 19.0f

    .line 526
    .line 527
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 528
    .line 529
    .line 530
    const/high16 v4, -0x40000000    # -2.0f

    .line 531
    .line 532
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 533
    .line 534
    .line 535
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 536
    .line 537
    .line 538
    const/high16 v4, 0x41980000    # 19.0f

    .line 539
    .line 540
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 541
    .line 542
    .line 543
    const v4, -0x3f733333    # -4.4f

    .line 544
    .line 545
    .line 546
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 547
    .line 548
    .line 549
    const/high16 v26, -0x40200000    # -1.75f

    .line 550
    .line 551
    const v21, 0x3f0a3d71    # 0.54f

    .line 552
    .line 553
    .line 554
    const v22, -0x410f5c29    # -0.47f

    .line 555
    .line 556
    .line 557
    const v23, 0x3f733333    # 0.95f

    .line 558
    .line 559
    .line 560
    const v24, -0x40770a3d    # -1.07f

    .line 561
    .line 562
    .line 563
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 564
    .line 565
    .line 566
    const v25, 0x3db851ec    # 0.09f

    .line 567
    .line 568
    .line 569
    const/high16 v26, -0x41800000    # -0.25f

    .line 570
    .line 571
    const v21, 0x3cf5c28f    # 0.03f

    .line 572
    .line 573
    .line 574
    const v22, -0x425c28f6    # -0.08f

    .line 575
    .line 576
    .line 577
    const v23, 0x3d8f5c29    # 0.07f

    .line 578
    .line 579
    .line 580
    const v24, -0x41dc28f6    # -0.16f

    .line 581
    .line 582
    .line 583
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 584
    .line 585
    .line 586
    const/high16 v4, 0x41880000    # 17.0f

    .line 587
    .line 588
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 589
    .line 590
    .line 591
    const/high16 v4, 0x40000000    # 2.0f

    .line 592
    .line 593
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 594
    .line 595
    .line 596
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 597
    .line 598
    .line 599
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 600
    .line 601
    .line 602
    move-result-object v2

    .line 603
    const/16 v16, 0x3800

    .line 604
    .line 605
    const/16 v17, 0x0

    .line 606
    .line 607
    const/high16 v6, 0x3f800000    # 1.0f

    .line 608
    .line 609
    const/high16 v8, 0x3f800000    # 1.0f

    .line 610
    .line 611
    const/4 v7, 0x0

    .line 612
    const/high16 v9, 0x3f800000    # 1.0f

    .line 613
    .line 614
    const/high16 v12, 0x3f800000    # 1.0f

    .line 615
    .line 616
    const/4 v13, 0x0

    .line 617
    const/4 v14, 0x0

    .line 618
    const/4 v15, 0x0

    .line 619
    const-string v4, ""

    .line 620
    .line 621
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 622
    .line 623
    .line 624
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 625
    .line 626
    .line 627
    move-result v3

    .line 628
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 629
    .line 630
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 631
    .line 632
    .line 633
    move-result-wide v6

    .line 634
    const/4 v0, 0x0

    .line 635
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 636
    .line 637
    .line 638
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 639
    .line 640
    .line 641
    move-result v10

    .line 642
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 643
    .line 644
    .line 645
    move-result v11

    .line 646
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 647
    .line 648
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 649
    .line 650
    .line 651
    const v0, 0x4102147b    # 8.13f

    .line 652
    .line 653
    .line 654
    const/high16 v2, 0x41200000    # 10.0f

    .line 655
    .line 656
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 657
    .line 658
    .line 659
    const/high16 v0, 0x41200000    # 10.0f

    .line 660
    .line 661
    const/high16 v2, 0x40a00000    # 5.0f

    .line 662
    .line 663
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 664
    .line 665
    .line 666
    const/high16 v0, 0x40000000    # 2.0f

    .line 667
    .line 668
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 669
    .line 670
    .line 671
    const v0, 0x408ccccd    # 4.4f

    .line 672
    .line 673
    .line 674
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 675
    .line 676
    .line 677
    const v17, -0x405d70a4    # -1.27f

    .line 678
    .line 679
    .line 680
    const/high16 v18, -0x40000000    # -2.0f

    .line 681
    .line 682
    const v13, -0x40e66666    # -0.6f

    .line 683
    .line 684
    .line 685
    const v14, -0x40f851ec    # -0.53f

    .line 686
    .line 687
    .line 688
    const v15, -0x407851ec    # -1.06f

    .line 689
    .line 690
    .line 691
    const v16, -0x4063d70a    # -1.22f

    .line 692
    .line 693
    .line 694
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 695
    .line 696
    .line 697
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 698
    .line 699
    .line 700
    const v0, 0x4169999a    # 14.6f

    .line 701
    .line 702
    .line 703
    const/high16 v2, 0x41400000    # 12.0f

    .line 704
    .line 705
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 706
    .line 707
    .line 708
    const/high16 v0, 0x41400000    # 12.0f

    .line 709
    .line 710
    const/high16 v2, 0x41980000    # 19.0f

    .line 711
    .line 712
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 713
    .line 714
    .line 715
    const/high16 v0, -0x40000000    # -2.0f

    .line 716
    .line 717
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 718
    .line 719
    .line 720
    const v0, -0x3fb7ae14    # -3.13f

    .line 721
    .line 722
    .line 723
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 724
    .line 725
    .line 726
    const/high16 v18, 0x40000000    # 2.0f

    .line 727
    .line 728
    const v13, -0x41a8f5c3    # -0.21f

    .line 729
    .line 730
    .line 731
    const v14, 0x3f47ae14    # 0.78f

    .line 732
    .line 733
    .line 734
    const v15, -0x40d47ae1    # -0.67f

    .line 735
    .line 736
    .line 737
    const v16, 0x3fbc28f6    # 1.47f

    .line 738
    .line 739
    .line 740
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 741
    .line 742
    .line 743
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 744
    .line 745
    .line 746
    const v0, 0x4103851f    # 8.22f

    .line 747
    .line 748
    .line 749
    const/high16 v2, 0x418a0000    # 17.25f

    .line 750
    .line 751
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 752
    .line 753
    .line 754
    const v17, -0x4247ae14    # -0.09f

    .line 755
    .line 756
    .line 757
    const/high16 v18, -0x41800000    # -0.25f

    .line 758
    .line 759
    const v13, -0x430a3d71    # -0.03f

    .line 760
    .line 761
    .line 762
    const v14, -0x425c28f6    # -0.08f

    .line 763
    .line 764
    .line 765
    const v15, -0x428a3d71    # -0.06f

    .line 766
    .line 767
    .line 768
    const v16, -0x41dc28f6    # -0.16f

    .line 769
    .line 770
    .line 771
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 772
    .line 773
    .line 774
    const/high16 v0, 0x41880000    # 17.0f

    .line 775
    .line 776
    const/high16 v2, 0x40a00000    # 5.0f

    .line 777
    .line 778
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 779
    .line 780
    .line 781
    const/high16 v0, 0x40000000    # 2.0f

    .line 782
    .line 783
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 784
    .line 785
    .line 786
    const v0, 0x408ccccd    # 4.4f

    .line 787
    .line 788
    .line 789
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 790
    .line 791
    .line 792
    const v17, -0x4068f5c3    # -1.18f

    .line 793
    .line 794
    .line 795
    const/high16 v18, -0x40200000    # -1.75f

    .line 796
    .line 797
    const v13, -0x40f851ec    # -0.53f

    .line 798
    .line 799
    .line 800
    const v14, -0x410f5c29    # -0.47f

    .line 801
    .line 802
    .line 803
    const v15, -0x408f5c29    # -0.94f

    .line 804
    .line 805
    .line 806
    const v16, -0x40770a3d    # -1.07f

    .line 807
    .line 808
    .line 809
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 810
    .line 811
    .line 812
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 813
    .line 814
    .line 815
    const v0, 0x417deb85    # 15.87f

    .line 816
    .line 817
    .line 818
    const/high16 v2, 0x41880000    # 17.0f

    .line 819
    .line 820
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 821
    .line 822
    .line 823
    const v17, -0x4247ae14    # -0.09f

    .line 824
    .line 825
    .line 826
    const/high16 v18, 0x3e800000    # 0.25f

    .line 827
    .line 828
    const v13, -0x435c28f6    # -0.02f

    .line 829
    .line 830
    .line 831
    const v14, 0x3db851ec    # 0.09f

    .line 832
    .line 833
    .line 834
    const v15, -0x428a3d71    # -0.06f

    .line 835
    .line 836
    .line 837
    const v16, 0x3e2e147b    # 0.17f

    .line 838
    .line 839
    .line 840
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 841
    .line 842
    .line 843
    const v17, -0x4068f5c3    # -1.18f

    .line 844
    .line 845
    .line 846
    const/high16 v18, 0x3fe00000    # 1.75f

    .line 847
    .line 848
    const v13, -0x41947ae1    # -0.23f

    .line 849
    .line 850
    .line 851
    const v14, 0x3f2e147b    # 0.68f

    .line 852
    .line 853
    .line 854
    const v15, -0x40dc28f6    # -0.64f

    .line 855
    .line 856
    .line 857
    const v16, 0x3fa3d70a    # 1.28f

    .line 858
    .line 859
    .line 860
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 861
    .line 862
    .line 863
    const/high16 v0, 0x41980000    # 19.0f

    .line 864
    .line 865
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 866
    .line 867
    .line 868
    const/high16 v0, -0x40000000    # -2.0f

    .line 869
    .line 870
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 871
    .line 872
    .line 873
    const v0, -0x3fb7ae14    # -3.13f

    .line 874
    .line 875
    .line 876
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 877
    .line 878
    .line 879
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 880
    .line 881
    .line 882
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 883
    .line 884
    .line 885
    move-result-object v2

    .line 886
    const/16 v16, 0x3800

    .line 887
    .line 888
    const/16 v17, 0x0

    .line 889
    .line 890
    const v6, 0x3e99999a    # 0.3f

    .line 891
    .line 892
    .line 893
    const v8, 0x3e99999a    # 0.3f

    .line 894
    .line 895
    .line 896
    const/4 v7, 0x0

    .line 897
    const/high16 v12, 0x3f800000    # 1.0f

    .line 898
    .line 899
    const/4 v13, 0x0

    .line 900
    const/4 v14, 0x0

    .line 901
    const/4 v15, 0x0

    .line 902
    const-string v4, ""

    .line 903
    .line 904
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 905
    .line 906
    .line 907
    move-result-object v0

    .line 908
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 909
    .line 910
    .line 911
    move-result-object v0

    .line 912
    sput-object v0, Landroidx/compose/material/icons/twotone/AllInboxKt;->_allInbox:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 913
    .line 914
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 915
    .line 916
    .line 917
    return-object v0
.end method
