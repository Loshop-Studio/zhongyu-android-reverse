.class public final Landroidx/compose/material/icons/rounded/BallotKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _ballot:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getBallot(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/BallotKt;->_ballot:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.Ballot"

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
    const/high16 v0, 0x41180000    # 9.5f

    .line 71
    .line 72
    const/high16 v2, 0x41600000    # 14.0f

    .line 73
    .line 74
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v0, 0x40400000    # 3.0f

    .line 78
    .line 79
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 80
    .line 81
    .line 82
    const/high16 v17, 0x3f800000    # 1.0f

    .line 83
    .line 84
    const/high16 v18, -0x40800000    # -1.0f

    .line 85
    .line 86
    const v13, 0x3f0ccccd    # 0.55f

    .line 87
    .line 88
    .line 89
    const/4 v14, 0x0

    .line 90
    const/high16 v15, 0x3f800000    # 1.0f

    .line 91
    .line 92
    const v16, -0x4119999a    # -0.45f

    .line 93
    .line 94
    .line 95
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 96
    .line 97
    .line 98
    const v0, -0x4119999a    # -0.45f

    .line 99
    .line 100
    .line 101
    const/high16 v2, -0x40800000    # -1.0f

    .line 102
    .line 103
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 104
    .line 105
    .line 106
    const/high16 v0, -0x3fc00000    # -3.0f

    .line 107
    .line 108
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 109
    .line 110
    .line 111
    const/high16 v17, -0x40800000    # -1.0f

    .line 112
    .line 113
    const/high16 v18, 0x3f800000    # 1.0f

    .line 114
    .line 115
    const v13, -0x40f33333    # -0.55f

    .line 116
    .line 117
    .line 118
    const/high16 v15, -0x40800000    # -1.0f

    .line 119
    .line 120
    const v16, 0x3ee66666    # 0.45f

    .line 121
    .line 122
    .line 123
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 124
    .line 125
    .line 126
    const v0, 0x3ee66666    # 0.45f

    .line 127
    .line 128
    .line 129
    const/high16 v2, 0x3f800000    # 1.0f

    .line 130
    .line 131
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 132
    .line 133
    .line 134
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 135
    .line 136
    .line 137
    const/high16 v0, 0x41840000    # 16.5f

    .line 138
    .line 139
    const/high16 v2, 0x41600000    # 14.0f

    .line 140
    .line 141
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 142
    .line 143
    .line 144
    const/high16 v0, 0x40400000    # 3.0f

    .line 145
    .line 146
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 147
    .line 148
    .line 149
    const/high16 v17, 0x3f800000    # 1.0f

    .line 150
    .line 151
    const/high16 v18, -0x40800000    # -1.0f

    .line 152
    .line 153
    const v13, 0x3f0ccccd    # 0.55f

    .line 154
    .line 155
    .line 156
    const/high16 v15, 0x3f800000    # 1.0f

    .line 157
    .line 158
    const v16, -0x4119999a    # -0.45f

    .line 159
    .line 160
    .line 161
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 162
    .line 163
    .line 164
    const v0, -0x4119999a    # -0.45f

    .line 165
    .line 166
    .line 167
    const/high16 v2, -0x40800000    # -1.0f

    .line 168
    .line 169
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 170
    .line 171
    .line 172
    const/high16 v0, -0x3fc00000    # -3.0f

    .line 173
    .line 174
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 175
    .line 176
    .line 177
    const/high16 v17, -0x40800000    # -1.0f

    .line 178
    .line 179
    const/high16 v18, 0x3f800000    # 1.0f

    .line 180
    .line 181
    const v13, -0x40f33333    # -0.55f

    .line 182
    .line 183
    .line 184
    const/high16 v15, -0x40800000    # -1.0f

    .line 185
    .line 186
    const v16, 0x3ee66666    # 0.45f

    .line 187
    .line 188
    .line 189
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 190
    .line 191
    .line 192
    const v0, 0x3ee66666    # 0.45f

    .line 193
    .line 194
    .line 195
    const/high16 v2, 0x3f800000    # 1.0f

    .line 196
    .line 197
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 198
    .line 199
    .line 200
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 201
    .line 202
    .line 203
    const/high16 v0, 0x41980000    # 19.0f

    .line 204
    .line 205
    const/high16 v2, 0x41a80000    # 21.0f

    .line 206
    .line 207
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 208
    .line 209
    .line 210
    const/high16 v0, 0x40a00000    # 5.0f

    .line 211
    .line 212
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 213
    .line 214
    .line 215
    const/high16 v17, -0x40000000    # -2.0f

    .line 216
    .line 217
    const/high16 v18, -0x40000000    # -2.0f

    .line 218
    .line 219
    const v13, -0x40733333    # -1.1f

    .line 220
    .line 221
    .line 222
    const/high16 v15, -0x40000000    # -2.0f

    .line 223
    .line 224
    const v16, -0x4099999a    # -0.9f

    .line 225
    .line 226
    .line 227
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 228
    .line 229
    .line 230
    const/high16 v2, 0x40400000    # 3.0f

    .line 231
    .line 232
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 233
    .line 234
    .line 235
    const/high16 v17, 0x40000000    # 2.0f

    .line 236
    .line 237
    const/4 v13, 0x0

    .line 238
    const v14, -0x40733333    # -1.1f

    .line 239
    .line 240
    .line 241
    const v15, 0x3f666666    # 0.9f

    .line 242
    .line 243
    .line 244
    const/high16 v16, -0x40000000    # -2.0f

    .line 245
    .line 246
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 247
    .line 248
    .line 249
    const/high16 v0, 0x41600000    # 14.0f

    .line 250
    .line 251
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 252
    .line 253
    .line 254
    const/high16 v18, 0x40000000    # 2.0f

    .line 255
    .line 256
    const v13, 0x3f8ccccd    # 1.1f

    .line 257
    .line 258
    .line 259
    const/4 v14, 0x0

    .line 260
    const/high16 v15, 0x40000000    # 2.0f

    .line 261
    .line 262
    const v16, 0x3f666666    # 0.9f

    .line 263
    .line 264
    .line 265
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 266
    .line 267
    .line 268
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 269
    .line 270
    .line 271
    const/high16 v17, -0x40000000    # -2.0f

    .line 272
    .line 273
    const/4 v13, 0x0

    .line 274
    const v14, 0x3f8ccccd    # 1.1f

    .line 275
    .line 276
    .line 277
    const v15, -0x4099999a    # -0.9f

    .line 278
    .line 279
    .line 280
    const/high16 v16, 0x40000000    # 2.0f

    .line 281
    .line 282
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 283
    .line 284
    .line 285
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 286
    .line 287
    .line 288
    const/high16 v0, 0x41300000    # 11.0f

    .line 289
    .line 290
    const/high16 v2, 0x40e00000    # 7.0f

    .line 291
    .line 292
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 293
    .line 294
    .line 295
    const/high16 v0, 0x40400000    # 3.0f

    .line 296
    .line 297
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 298
    .line 299
    .line 300
    const/high16 v17, 0x3f800000    # 1.0f

    .line 301
    .line 302
    const/high16 v18, -0x40800000    # -1.0f

    .line 303
    .line 304
    const v13, 0x3f0ccccd    # 0.55f

    .line 305
    .line 306
    .line 307
    const/4 v14, 0x0

    .line 308
    const/high16 v15, 0x3f800000    # 1.0f

    .line 309
    .line 310
    const v16, -0x4119999a    # -0.45f

    .line 311
    .line 312
    .line 313
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 314
    .line 315
    .line 316
    const/high16 v0, 0x41300000    # 11.0f

    .line 317
    .line 318
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 319
    .line 320
    .line 321
    const/high16 v17, -0x40800000    # -1.0f

    .line 322
    .line 323
    const/4 v13, 0x0

    .line 324
    const v14, -0x40f33333    # -0.55f

    .line 325
    .line 326
    .line 327
    const v15, -0x4119999a    # -0.45f

    .line 328
    .line 329
    .line 330
    const/high16 v16, -0x40800000    # -1.0f

    .line 331
    .line 332
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 333
    .line 334
    .line 335
    const/high16 v0, 0x40c00000    # 6.0f

    .line 336
    .line 337
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 338
    .line 339
    .line 340
    const/high16 v18, 0x3f800000    # 1.0f

    .line 341
    .line 342
    const v13, -0x40f33333    # -0.55f

    .line 343
    .line 344
    .line 345
    const/4 v14, 0x0

    .line 346
    const/high16 v15, -0x40800000    # -1.0f

    .line 347
    .line 348
    const v16, 0x3ee66666    # 0.45f

    .line 349
    .line 350
    .line 351
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 352
    .line 353
    .line 354
    const/high16 v0, 0x40400000    # 3.0f

    .line 355
    .line 356
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 357
    .line 358
    .line 359
    const/high16 v17, 0x3f800000    # 1.0f

    .line 360
    .line 361
    const/4 v13, 0x0

    .line 362
    const v14, 0x3f0ccccd    # 0.55f

    .line 363
    .line 364
    .line 365
    const v15, 0x3ee66666    # 0.45f

    .line 366
    .line 367
    .line 368
    const/high16 v16, 0x3f800000    # 1.0f

    .line 369
    .line 370
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 371
    .line 372
    .line 373
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 374
    .line 375
    .line 376
    const/high16 v0, 0x40e00000    # 7.0f

    .line 377
    .line 378
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 379
    .line 380
    .line 381
    const/high16 v0, 0x40400000    # 3.0f

    .line 382
    .line 383
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 384
    .line 385
    .line 386
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 387
    .line 388
    .line 389
    const/high16 v0, 0x41200000    # 10.0f

    .line 390
    .line 391
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 392
    .line 393
    .line 394
    const/high16 v0, 0x40e00000    # 7.0f

    .line 395
    .line 396
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 397
    .line 398
    .line 399
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 400
    .line 401
    .line 402
    const/high16 v0, 0x41900000    # 18.0f

    .line 403
    .line 404
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 405
    .line 406
    .line 407
    const/high16 v0, 0x40400000    # 3.0f

    .line 408
    .line 409
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 410
    .line 411
    .line 412
    const/high16 v18, -0x40800000    # -1.0f

    .line 413
    .line 414
    const v13, 0x3f0ccccd    # 0.55f

    .line 415
    .line 416
    .line 417
    const/4 v14, 0x0

    .line 418
    const/high16 v15, 0x3f800000    # 1.0f

    .line 419
    .line 420
    const v16, -0x4119999a    # -0.45f

    .line 421
    .line 422
    .line 423
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 424
    .line 425
    .line 426
    const/high16 v0, -0x3fc00000    # -3.0f

    .line 427
    .line 428
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 429
    .line 430
    .line 431
    const/high16 v17, -0x40800000    # -1.0f

    .line 432
    .line 433
    const/4 v13, 0x0

    .line 434
    const v14, -0x40f33333    # -0.55f

    .line 435
    .line 436
    .line 437
    const v15, -0x4119999a    # -0.45f

    .line 438
    .line 439
    .line 440
    const/high16 v16, -0x40800000    # -1.0f

    .line 441
    .line 442
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 443
    .line 444
    .line 445
    const/high16 v0, 0x41500000    # 13.0f

    .line 446
    .line 447
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 448
    .line 449
    .line 450
    const/high16 v18, 0x3f800000    # 1.0f

    .line 451
    .line 452
    const v13, -0x40f33333    # -0.55f

    .line 453
    .line 454
    .line 455
    const/4 v14, 0x0

    .line 456
    const/high16 v15, -0x40800000    # -1.0f

    .line 457
    .line 458
    const v16, 0x3ee66666    # 0.45f

    .line 459
    .line 460
    .line 461
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 462
    .line 463
    .line 464
    const/high16 v0, 0x40400000    # 3.0f

    .line 465
    .line 466
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 467
    .line 468
    .line 469
    const/high16 v17, 0x3f800000    # 1.0f

    .line 470
    .line 471
    const/4 v13, 0x0

    .line 472
    const v14, 0x3f0ccccd    # 0.55f

    .line 473
    .line 474
    .line 475
    const v15, 0x3ee66666    # 0.45f

    .line 476
    .line 477
    .line 478
    const/high16 v16, 0x3f800000    # 1.0f

    .line 479
    .line 480
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 481
    .line 482
    .line 483
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 484
    .line 485
    .line 486
    const/high16 v0, 0x41600000    # 14.0f

    .line 487
    .line 488
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 489
    .line 490
    .line 491
    const/high16 v0, 0x40400000    # 3.0f

    .line 492
    .line 493
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 494
    .line 495
    .line 496
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 497
    .line 498
    .line 499
    const/high16 v0, 0x41880000    # 17.0f

    .line 500
    .line 501
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 502
    .line 503
    .line 504
    const/high16 v0, -0x3fc00000    # -3.0f

    .line 505
    .line 506
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 507
    .line 508
    .line 509
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 510
    .line 511
    .line 512
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 513
    .line 514
    .line 515
    move-result-object v2

    .line 516
    const/16 v16, 0x3800

    .line 517
    .line 518
    const/16 v17, 0x0

    .line 519
    .line 520
    const/high16 v6, 0x3f800000    # 1.0f

    .line 521
    .line 522
    const/high16 v8, 0x3f800000    # 1.0f

    .line 523
    .line 524
    const/4 v7, 0x0

    .line 525
    const/high16 v9, 0x3f800000    # 1.0f

    .line 526
    .line 527
    const/high16 v12, 0x3f800000    # 1.0f

    .line 528
    .line 529
    const/4 v14, 0x0

    .line 530
    const/4 v15, 0x0

    .line 531
    const-string v4, ""

    .line 532
    .line 533
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 534
    .line 535
    .line 536
    move-result-object v0

    .line 537
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 538
    .line 539
    .line 540
    move-result-object v0

    .line 541
    sput-object v0, Landroidx/compose/material/icons/rounded/BallotKt;->_ballot:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 542
    .line 543
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 544
    .line 545
    .line 546
    return-object v0
.end method
