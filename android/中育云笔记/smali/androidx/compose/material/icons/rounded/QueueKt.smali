.class public final Landroidx/compose/material/icons/rounded/QueueKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _queue:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getQueue(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/QueueKt;->_queue:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.Queue"

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
    const/high16 v0, 0x40c00000    # 6.0f

    .line 71
    .line 72
    const/high16 v2, 0x40400000    # 3.0f

    .line 73
    .line 74
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v17, -0x40800000    # -1.0f

    .line 78
    .line 79
    const/high16 v18, 0x3f800000    # 1.0f

    .line 80
    .line 81
    const v13, -0x40f33333    # -0.55f

    .line 82
    .line 83
    .line 84
    const/4 v14, 0x0

    .line 85
    const/high16 v15, -0x40800000    # -1.0f

    .line 86
    .line 87
    const v16, 0x3ee66666    # 0.45f

    .line 88
    .line 89
    .line 90
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 91
    .line 92
    .line 93
    const/high16 v0, 0x41500000    # 13.0f

    .line 94
    .line 95
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 96
    .line 97
    .line 98
    const/high16 v17, 0x40000000    # 2.0f

    .line 99
    .line 100
    const/high16 v18, 0x40000000    # 2.0f

    .line 101
    .line 102
    const/4 v13, 0x0

    .line 103
    const v14, 0x3f8ccccd    # 1.1f

    .line 104
    .line 105
    .line 106
    const v15, 0x3f666666    # 0.9f

    .line 107
    .line 108
    .line 109
    const/high16 v16, 0x40000000    # 2.0f

    .line 110
    .line 111
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 112
    .line 113
    .line 114
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 115
    .line 116
    .line 117
    const/high16 v17, 0x3f800000    # 1.0f

    .line 118
    .line 119
    const/high16 v18, -0x40800000    # -1.0f

    .line 120
    .line 121
    const v13, 0x3f0ccccd    # 0.55f

    .line 122
    .line 123
    .line 124
    const/4 v14, 0x0

    .line 125
    const/high16 v15, 0x3f800000    # 1.0f

    .line 126
    .line 127
    const v16, -0x4119999a    # -0.45f

    .line 128
    .line 129
    .line 130
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 131
    .line 132
    .line 133
    const v0, -0x4119999a    # -0.45f

    .line 134
    .line 135
    .line 136
    const/high16 v2, -0x40800000    # -1.0f

    .line 137
    .line 138
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 139
    .line 140
    .line 141
    const/high16 v0, 0x40a00000    # 5.0f

    .line 142
    .line 143
    const/high16 v2, 0x41a00000    # 20.0f

    .line 144
    .line 145
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 146
    .line 147
    .line 148
    const/high16 v17, -0x40800000    # -1.0f

    .line 149
    .line 150
    const v13, -0x40f33333    # -0.55f

    .line 151
    .line 152
    .line 153
    const/high16 v15, -0x40800000    # -1.0f

    .line 154
    .line 155
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 156
    .line 157
    .line 158
    const/high16 v0, 0x40e00000    # 7.0f

    .line 159
    .line 160
    const/high16 v2, 0x40800000    # 4.0f

    .line 161
    .line 162
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 163
    .line 164
    .line 165
    const/4 v13, 0x0

    .line 166
    const v14, -0x40f33333    # -0.55f

    .line 167
    .line 168
    .line 169
    const v15, -0x4119999a    # -0.45f

    .line 170
    .line 171
    .line 172
    const/high16 v16, -0x40800000    # -1.0f

    .line 173
    .line 174
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 175
    .line 176
    .line 177
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 178
    .line 179
    .line 180
    const/high16 v0, 0x40000000    # 2.0f

    .line 181
    .line 182
    const/high16 v2, 0x41a00000    # 20.0f

    .line 183
    .line 184
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 185
    .line 186
    .line 187
    const/high16 v0, 0x41000000    # 8.0f

    .line 188
    .line 189
    const/high16 v2, 0x40000000    # 2.0f

    .line 190
    .line 191
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 192
    .line 193
    .line 194
    const/high16 v17, -0x40000000    # -2.0f

    .line 195
    .line 196
    const/high16 v18, 0x40000000    # 2.0f

    .line 197
    .line 198
    const v13, -0x40733333    # -1.1f

    .line 199
    .line 200
    .line 201
    const/4 v14, 0x0

    .line 202
    const/high16 v15, -0x40000000    # -2.0f

    .line 203
    .line 204
    const v16, 0x3f666666    # 0.9f

    .line 205
    .line 206
    .line 207
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 208
    .line 209
    .line 210
    const/high16 v0, 0x41400000    # 12.0f

    .line 211
    .line 212
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 213
    .line 214
    .line 215
    const/high16 v17, 0x40000000    # 2.0f

    .line 216
    .line 217
    const/4 v13, 0x0

    .line 218
    const v14, 0x3f8ccccd    # 1.1f

    .line 219
    .line 220
    .line 221
    const v15, 0x3f666666    # 0.9f

    .line 222
    .line 223
    .line 224
    const/high16 v16, 0x40000000    # 2.0f

    .line 225
    .line 226
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 227
    .line 228
    .line 229
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 230
    .line 231
    .line 232
    const/high16 v18, -0x40000000    # -2.0f

    .line 233
    .line 234
    const v13, 0x3f8ccccd    # 1.1f

    .line 235
    .line 236
    .line 237
    const/4 v14, 0x0

    .line 238
    const/high16 v15, 0x40000000    # 2.0f

    .line 239
    .line 240
    const v16, -0x4099999a    # -0.9f

    .line 241
    .line 242
    .line 243
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 244
    .line 245
    .line 246
    const/high16 v0, 0x41b00000    # 22.0f

    .line 247
    .line 248
    const/high16 v2, 0x40800000    # 4.0f

    .line 249
    .line 250
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 251
    .line 252
    .line 253
    const/high16 v17, -0x40000000    # -2.0f

    .line 254
    .line 255
    const/4 v13, 0x0

    .line 256
    const v14, -0x40733333    # -1.1f

    .line 257
    .line 258
    .line 259
    const v15, -0x4099999a    # -0.9f

    .line 260
    .line 261
    .line 262
    const/high16 v16, -0x40000000    # -2.0f

    .line 263
    .line 264
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 265
    .line 266
    .line 267
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 268
    .line 269
    .line 270
    const/high16 v0, 0x41900000    # 18.0f

    .line 271
    .line 272
    const/high16 v2, 0x41300000    # 11.0f

    .line 273
    .line 274
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 275
    .line 276
    .line 277
    const/high16 v0, -0x3fc00000    # -3.0f

    .line 278
    .line 279
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 280
    .line 281
    .line 282
    const/high16 v0, 0x40400000    # 3.0f

    .line 283
    .line 284
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 285
    .line 286
    .line 287
    const/high16 v17, -0x40800000    # -1.0f

    .line 288
    .line 289
    const/high16 v18, 0x3f800000    # 1.0f

    .line 290
    .line 291
    const v14, 0x3f0ccccd    # 0.55f

    .line 292
    .line 293
    .line 294
    const v15, -0x4119999a    # -0.45f

    .line 295
    .line 296
    .line 297
    const/high16 v16, 0x3f800000    # 1.0f

    .line 298
    .line 299
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 300
    .line 301
    .line 302
    const v0, -0x4119999a    # -0.45f

    .line 303
    .line 304
    .line 305
    const/high16 v2, -0x40800000    # -1.0f

    .line 306
    .line 307
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 308
    .line 309
    .line 310
    const/high16 v0, -0x3fc00000    # -3.0f

    .line 311
    .line 312
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 313
    .line 314
    .line 315
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 316
    .line 317
    .line 318
    const/high16 v18, -0x40800000    # -1.0f

    .line 319
    .line 320
    const v13, -0x40f33333    # -0.55f

    .line 321
    .line 322
    .line 323
    const/4 v14, 0x0

    .line 324
    const/high16 v15, -0x40800000    # -1.0f

    .line 325
    .line 326
    const v16, -0x4119999a    # -0.45f

    .line 327
    .line 328
    .line 329
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 330
    .line 331
    .line 332
    const v0, 0x3ee66666    # 0.45f

    .line 333
    .line 334
    .line 335
    const/high16 v2, 0x3f800000    # 1.0f

    .line 336
    .line 337
    const/high16 v4, -0x40800000    # -1.0f

    .line 338
    .line 339
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 340
    .line 341
    .line 342
    const/high16 v0, 0x40400000    # 3.0f

    .line 343
    .line 344
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 345
    .line 346
    .line 347
    const/high16 v0, 0x40c00000    # 6.0f

    .line 348
    .line 349
    const/high16 v2, 0x41500000    # 13.0f

    .line 350
    .line 351
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 352
    .line 353
    .line 354
    const/high16 v17, 0x3f800000    # 1.0f

    .line 355
    .line 356
    const/4 v13, 0x0

    .line 357
    const v14, -0x40f33333    # -0.55f

    .line 358
    .line 359
    .line 360
    const v15, 0x3ee66666    # 0.45f

    .line 361
    .line 362
    .line 363
    const/high16 v16, -0x40800000    # -1.0f

    .line 364
    .line 365
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 366
    .line 367
    .line 368
    const v0, 0x3ee66666    # 0.45f

    .line 369
    .line 370
    .line 371
    const/high16 v2, 0x3f800000    # 1.0f

    .line 372
    .line 373
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 374
    .line 375
    .line 376
    const/high16 v0, 0x40400000    # 3.0f

    .line 377
    .line 378
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 379
    .line 380
    .line 381
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 382
    .line 383
    .line 384
    const/high16 v18, 0x3f800000    # 1.0f

    .line 385
    .line 386
    const v13, 0x3f0ccccd    # 0.55f

    .line 387
    .line 388
    .line 389
    const/4 v14, 0x0

    .line 390
    const/high16 v15, 0x3f800000    # 1.0f

    .line 391
    .line 392
    const v16, 0x3ee66666    # 0.45f

    .line 393
    .line 394
    .line 395
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 396
    .line 397
    .line 398
    const v0, -0x4119999a    # -0.45f

    .line 399
    .line 400
    .line 401
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 402
    .line 403
    .line 404
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 405
    .line 406
    .line 407
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 408
    .line 409
    .line 410
    move-result-object v2

    .line 411
    const/16 v16, 0x3800

    .line 412
    .line 413
    const/16 v17, 0x0

    .line 414
    .line 415
    const/high16 v6, 0x3f800000    # 1.0f

    .line 416
    .line 417
    const/high16 v8, 0x3f800000    # 1.0f

    .line 418
    .line 419
    const/4 v7, 0x0

    .line 420
    const/high16 v9, 0x3f800000    # 1.0f

    .line 421
    .line 422
    const/high16 v12, 0x3f800000    # 1.0f

    .line 423
    .line 424
    const/4 v13, 0x0

    .line 425
    const/4 v15, 0x0

    .line 426
    const-string v4, ""

    .line 427
    .line 428
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 429
    .line 430
    .line 431
    move-result-object v0

    .line 432
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 433
    .line 434
    .line 435
    move-result-object v0

    .line 436
    sput-object v0, Landroidx/compose/material/icons/rounded/QueueKt;->_queue:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 437
    .line 438
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 439
    .line 440
    .line 441
    return-object v0
.end method
