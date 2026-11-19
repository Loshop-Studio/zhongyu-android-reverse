.class public final Landroidx/compose/material/icons/rounded/DeveloperBoardKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _developerBoard:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getDeveloperBoard(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/DeveloperBoardKt;->_developerBoard:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.DeveloperBoard"

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
    const/high16 v0, 0x41b00000    # 22.0f

    .line 71
    .line 72
    const/high16 v2, 0x41000000    # 8.0f

    .line 73
    .line 74
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v17, -0x40800000    # -1.0f

    .line 78
    .line 79
    const/high16 v18, -0x40800000    # -1.0f

    .line 80
    .line 81
    const/4 v13, 0x0

    .line 82
    const v14, -0x40f33333    # -0.55f

    .line 83
    .line 84
    .line 85
    const v15, -0x4119999a    # -0.45f

    .line 86
    .line 87
    .line 88
    const/high16 v16, -0x40800000    # -1.0f

    .line 89
    .line 90
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 91
    .line 92
    .line 93
    const/high16 v0, -0x40800000    # -1.0f

    .line 94
    .line 95
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 96
    .line 97
    .line 98
    const/high16 v0, 0x41a00000    # 20.0f

    .line 99
    .line 100
    const/high16 v2, 0x40a00000    # 5.0f

    .line 101
    .line 102
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 103
    .line 104
    .line 105
    const/high16 v17, -0x40000000    # -2.0f

    .line 106
    .line 107
    const/high16 v18, -0x40000000    # -2.0f

    .line 108
    .line 109
    const v14, -0x40733333    # -1.1f

    .line 110
    .line 111
    .line 112
    const v15, -0x4099999a    # -0.9f

    .line 113
    .line 114
    .line 115
    const/high16 v16, -0x40000000    # -2.0f

    .line 116
    .line 117
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 118
    .line 119
    .line 120
    const/high16 v0, 0x40400000    # 3.0f

    .line 121
    .line 122
    const/high16 v2, 0x40800000    # 4.0f

    .line 123
    .line 124
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 125
    .line 126
    .line 127
    const/high16 v18, 0x40000000    # 2.0f

    .line 128
    .line 129
    const v13, -0x40733333    # -1.1f

    .line 130
    .line 131
    .line 132
    const/4 v14, 0x0

    .line 133
    const/high16 v15, -0x40000000    # -2.0f

    .line 134
    .line 135
    const v16, 0x3f666666    # 0.9f

    .line 136
    .line 137
    .line 138
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 139
    .line 140
    .line 141
    const/high16 v0, 0x41600000    # 14.0f

    .line 142
    .line 143
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 144
    .line 145
    .line 146
    const/high16 v17, 0x40000000    # 2.0f

    .line 147
    .line 148
    const/4 v13, 0x0

    .line 149
    const v14, 0x3f8ccccd    # 1.1f

    .line 150
    .line 151
    .line 152
    const v15, 0x3f666666    # 0.9f

    .line 153
    .line 154
    .line 155
    const/high16 v16, 0x40000000    # 2.0f

    .line 156
    .line 157
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 158
    .line 159
    .line 160
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 161
    .line 162
    .line 163
    const/high16 v18, -0x40000000    # -2.0f

    .line 164
    .line 165
    const v13, 0x3f8ccccd    # 1.1f

    .line 166
    .line 167
    .line 168
    const/4 v14, 0x0

    .line 169
    const/high16 v15, 0x40000000    # 2.0f

    .line 170
    .line 171
    const v16, -0x4099999a    # -0.9f

    .line 172
    .line 173
    .line 174
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 175
    .line 176
    .line 177
    const/high16 v0, -0x40000000    # -2.0f

    .line 178
    .line 179
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 180
    .line 181
    .line 182
    const/high16 v0, 0x3f800000    # 1.0f

    .line 183
    .line 184
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 185
    .line 186
    .line 187
    const/high16 v17, 0x3f800000    # 1.0f

    .line 188
    .line 189
    const/high16 v18, -0x40800000    # -1.0f

    .line 190
    .line 191
    const v13, 0x3f0ccccd    # 0.55f

    .line 192
    .line 193
    .line 194
    const/high16 v15, 0x3f800000    # 1.0f

    .line 195
    .line 196
    const v16, -0x4119999a    # -0.45f

    .line 197
    .line 198
    .line 199
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 200
    .line 201
    .line 202
    const v0, -0x4119999a    # -0.45f

    .line 203
    .line 204
    .line 205
    const/high16 v2, -0x40800000    # -1.0f

    .line 206
    .line 207
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 208
    .line 209
    .line 210
    const/high16 v0, -0x40800000    # -1.0f

    .line 211
    .line 212
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 213
    .line 214
    .line 215
    const/high16 v0, -0x40000000    # -2.0f

    .line 216
    .line 217
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 218
    .line 219
    .line 220
    const/high16 v0, 0x3f800000    # 1.0f

    .line 221
    .line 222
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 223
    .line 224
    .line 225
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 226
    .line 227
    .line 228
    const v0, -0x4119999a    # -0.45f

    .line 229
    .line 230
    .line 231
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 232
    .line 233
    .line 234
    const/high16 v0, -0x40800000    # -1.0f

    .line 235
    .line 236
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 237
    .line 238
    .line 239
    const/high16 v0, 0x41100000    # 9.0f

    .line 240
    .line 241
    const/high16 v2, 0x41a00000    # 20.0f

    .line 242
    .line 243
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 244
    .line 245
    .line 246
    const/high16 v0, 0x3f800000    # 1.0f

    .line 247
    .line 248
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 249
    .line 250
    .line 251
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 252
    .line 253
    .line 254
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 255
    .line 256
    .line 257
    const/high16 v0, 0x41880000    # 17.0f

    .line 258
    .line 259
    const/high16 v2, 0x41980000    # 19.0f

    .line 260
    .line 261
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 262
    .line 263
    .line 264
    const/high16 v0, 0x41980000    # 19.0f

    .line 265
    .line 266
    const/high16 v2, 0x40a00000    # 5.0f

    .line 267
    .line 268
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 269
    .line 270
    .line 271
    const/high16 v17, -0x40800000    # -1.0f

    .line 272
    .line 273
    const v13, -0x40f33333    # -0.55f

    .line 274
    .line 275
    .line 276
    const/high16 v15, -0x40800000    # -1.0f

    .line 277
    .line 278
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 279
    .line 280
    .line 281
    const/high16 v0, 0x40c00000    # 6.0f

    .line 282
    .line 283
    const/high16 v2, 0x40800000    # 4.0f

    .line 284
    .line 285
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 286
    .line 287
    .line 288
    const/high16 v17, 0x3f800000    # 1.0f

    .line 289
    .line 290
    const/4 v13, 0x0

    .line 291
    const v14, -0x40f33333    # -0.55f

    .line 292
    .line 293
    .line 294
    const v15, 0x3ee66666    # 0.45f

    .line 295
    .line 296
    .line 297
    const/high16 v16, -0x40800000    # -1.0f

    .line 298
    .line 299
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 300
    .line 301
    .line 302
    const/high16 v0, 0x41400000    # 12.0f

    .line 303
    .line 304
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 305
    .line 306
    .line 307
    const/high16 v18, 0x3f800000    # 1.0f

    .line 308
    .line 309
    const v13, 0x3f0ccccd    # 0.55f

    .line 310
    .line 311
    .line 312
    const/4 v14, 0x0

    .line 313
    const/high16 v15, 0x3f800000    # 1.0f

    .line 314
    .line 315
    const v16, 0x3ee66666    # 0.45f

    .line 316
    .line 317
    .line 318
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 319
    .line 320
    .line 321
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 322
    .line 323
    .line 324
    const/high16 v17, -0x40800000    # -1.0f

    .line 325
    .line 326
    const/4 v13, 0x0

    .line 327
    const v14, 0x3f0ccccd    # 0.55f

    .line 328
    .line 329
    .line 330
    const v15, -0x4119999a    # -0.45f

    .line 331
    .line 332
    .line 333
    const/high16 v16, 0x3f800000    # 1.0f

    .line 334
    .line 335
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 336
    .line 337
    .line 338
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 339
    .line 340
    .line 341
    const/high16 v0, 0x41500000    # 13.0f

    .line 342
    .line 343
    const/high16 v2, 0x40d00000    # 6.5f

    .line 344
    .line 345
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 346
    .line 347
    .line 348
    const/high16 v0, 0x40800000    # 4.0f

    .line 349
    .line 350
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 351
    .line 352
    .line 353
    const/high16 v17, 0x3f000000    # 0.5f

    .line 354
    .line 355
    const/high16 v18, 0x3f000000    # 0.5f

    .line 356
    .line 357
    const v13, 0x3e8f5c29    # 0.28f

    .line 358
    .line 359
    .line 360
    const/4 v14, 0x0

    .line 361
    const/high16 v15, 0x3f000000    # 0.5f

    .line 362
    .line 363
    const v16, 0x3e6147ae    # 0.22f

    .line 364
    .line 365
    .line 366
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 367
    .line 368
    .line 369
    const/high16 v0, 0x40400000    # 3.0f

    .line 370
    .line 371
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 372
    .line 373
    .line 374
    const/high16 v17, -0x41000000    # -0.5f

    .line 375
    .line 376
    const/4 v13, 0x0

    .line 377
    const v14, 0x3e8f5c29    # 0.28f

    .line 378
    .line 379
    .line 380
    const v15, -0x419eb852    # -0.22f

    .line 381
    .line 382
    .line 383
    const/high16 v16, 0x3f000000    # 0.5f

    .line 384
    .line 385
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 386
    .line 387
    .line 388
    const/high16 v0, -0x3f800000    # -4.0f

    .line 389
    .line 390
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 391
    .line 392
    .line 393
    const/high16 v18, -0x41000000    # -0.5f

    .line 394
    .line 395
    const v13, -0x4170a3d7    # -0.28f

    .line 396
    .line 397
    .line 398
    const/4 v14, 0x0

    .line 399
    const/high16 v15, -0x41000000    # -0.5f

    .line 400
    .line 401
    const v16, -0x419eb852    # -0.22f

    .line 402
    .line 403
    .line 404
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 405
    .line 406
    .line 407
    const/high16 v0, -0x3fc00000    # -3.0f

    .line 408
    .line 409
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 410
    .line 411
    .line 412
    const/high16 v17, 0x3f000000    # 0.5f

    .line 413
    .line 414
    const/4 v13, 0x0

    .line 415
    const v14, -0x4170a3d7    # -0.28f

    .line 416
    .line 417
    .line 418
    const v15, 0x3e6147ae    # 0.22f

    .line 419
    .line 420
    .line 421
    const/high16 v16, -0x41000000    # -0.5f

    .line 422
    .line 423
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 424
    .line 425
    .line 426
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 427
    .line 428
    .line 429
    const/high16 v0, 0x40e00000    # 7.0f

    .line 430
    .line 431
    const/high16 v2, 0x41480000    # 12.5f

    .line 432
    .line 433
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 434
    .line 435
    .line 436
    const/high16 v0, 0x40400000    # 3.0f

    .line 437
    .line 438
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 439
    .line 440
    .line 441
    const/high16 v18, 0x3f000000    # 0.5f

    .line 442
    .line 443
    const v13, 0x3e8f5c29    # 0.28f

    .line 444
    .line 445
    .line 446
    const/4 v14, 0x0

    .line 447
    const/high16 v15, 0x3f000000    # 0.5f

    .line 448
    .line 449
    const v16, 0x3e6147ae    # 0.22f

    .line 450
    .line 451
    .line 452
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 453
    .line 454
    .line 455
    const/high16 v0, 0x40000000    # 2.0f

    .line 456
    .line 457
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 458
    .line 459
    .line 460
    const/high16 v17, -0x41000000    # -0.5f

    .line 461
    .line 462
    const/4 v13, 0x0

    .line 463
    const v14, 0x3e8f5c29    # 0.28f

    .line 464
    .line 465
    .line 466
    const v15, -0x419eb852    # -0.22f

    .line 467
    .line 468
    .line 469
    const/high16 v16, 0x3f000000    # 0.5f

    .line 470
    .line 471
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 472
    .line 473
    .line 474
    const/high16 v0, -0x3fc00000    # -3.0f

    .line 475
    .line 476
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 477
    .line 478
    .line 479
    const/high16 v18, -0x41000000    # -0.5f

    .line 480
    .line 481
    const v13, -0x4170a3d7    # -0.28f

    .line 482
    .line 483
    .line 484
    const/4 v14, 0x0

    .line 485
    const/high16 v15, -0x41000000    # -0.5f

    .line 486
    .line 487
    const v16, -0x419eb852    # -0.22f

    .line 488
    .line 489
    .line 490
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 491
    .line 492
    .line 493
    const/high16 v0, -0x40000000    # -2.0f

    .line 494
    .line 495
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 496
    .line 497
    .line 498
    const/high16 v17, 0x3f000000    # 0.5f

    .line 499
    .line 500
    const/4 v13, 0x0

    .line 501
    const v14, -0x4170a3d7    # -0.28f

    .line 502
    .line 503
    .line 504
    const v15, 0x3e6147ae    # 0.22f

    .line 505
    .line 506
    .line 507
    const/high16 v16, -0x41000000    # -0.5f

    .line 508
    .line 509
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 510
    .line 511
    .line 512
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 513
    .line 514
    .line 515
    const/high16 v0, 0x40e00000    # 7.0f

    .line 516
    .line 517
    const/high16 v2, 0x40d00000    # 6.5f

    .line 518
    .line 519
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 520
    .line 521
    .line 522
    const/high16 v0, 0x40800000    # 4.0f

    .line 523
    .line 524
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 525
    .line 526
    .line 527
    const/high16 v18, 0x3f000000    # 0.5f

    .line 528
    .line 529
    const v13, 0x3e8f5c29    # 0.28f

    .line 530
    .line 531
    .line 532
    const/4 v14, 0x0

    .line 533
    const/high16 v15, 0x3f000000    # 0.5f

    .line 534
    .line 535
    const v16, 0x3e6147ae    # 0.22f

    .line 536
    .line 537
    .line 538
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 539
    .line 540
    .line 541
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 542
    .line 543
    .line 544
    const/high16 v17, -0x41000000    # -0.5f

    .line 545
    .line 546
    const/4 v13, 0x0

    .line 547
    const v14, 0x3e8f5c29    # 0.28f

    .line 548
    .line 549
    .line 550
    const v15, -0x419eb852    # -0.22f

    .line 551
    .line 552
    .line 553
    const/high16 v16, 0x3f000000    # 0.5f

    .line 554
    .line 555
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 556
    .line 557
    .line 558
    const/high16 v0, -0x3f800000    # -4.0f

    .line 559
    .line 560
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 561
    .line 562
    .line 563
    const/high16 v18, -0x41000000    # -0.5f

    .line 564
    .line 565
    const v13, -0x4170a3d7    # -0.28f

    .line 566
    .line 567
    .line 568
    const/4 v14, 0x0

    .line 569
    const/high16 v15, -0x41000000    # -0.5f

    .line 570
    .line 571
    const v16, -0x419eb852    # -0.22f

    .line 572
    .line 573
    .line 574
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 575
    .line 576
    .line 577
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 578
    .line 579
    .line 580
    const/high16 v17, 0x3f000000    # 0.5f

    .line 581
    .line 582
    const/4 v13, 0x0

    .line 583
    const v14, -0x4170a3d7    # -0.28f

    .line 584
    .line 585
    .line 586
    const v15, 0x3e6147ae    # 0.22f

    .line 587
    .line 588
    .line 589
    const/high16 v16, -0x41000000    # -0.5f

    .line 590
    .line 591
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 592
    .line 593
    .line 594
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 595
    .line 596
    .line 597
    const/high16 v0, 0x41300000    # 11.0f

    .line 598
    .line 599
    const/high16 v2, 0x41480000    # 12.5f

    .line 600
    .line 601
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 602
    .line 603
    .line 604
    const/high16 v0, 0x40400000    # 3.0f

    .line 605
    .line 606
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 607
    .line 608
    .line 609
    const/high16 v18, 0x3f000000    # 0.5f

    .line 610
    .line 611
    const v13, 0x3e8f5c29    # 0.28f

    .line 612
    .line 613
    .line 614
    const/4 v14, 0x0

    .line 615
    const/high16 v15, 0x3f000000    # 0.5f

    .line 616
    .line 617
    const v16, 0x3e6147ae    # 0.22f

    .line 618
    .line 619
    .line 620
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 621
    .line 622
    .line 623
    const/high16 v0, 0x40a00000    # 5.0f

    .line 624
    .line 625
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 626
    .line 627
    .line 628
    const/high16 v17, -0x41000000    # -0.5f

    .line 629
    .line 630
    const/4 v13, 0x0

    .line 631
    const v14, 0x3e8f5c29    # 0.28f

    .line 632
    .line 633
    .line 634
    const v15, -0x419eb852    # -0.22f

    .line 635
    .line 636
    .line 637
    const/high16 v16, 0x3f000000    # 0.5f

    .line 638
    .line 639
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 640
    .line 641
    .line 642
    const/high16 v0, -0x3fc00000    # -3.0f

    .line 643
    .line 644
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 645
    .line 646
    .line 647
    const/high16 v18, -0x41000000    # -0.5f

    .line 648
    .line 649
    const v13, -0x4170a3d7    # -0.28f

    .line 650
    .line 651
    .line 652
    const/4 v14, 0x0

    .line 653
    const/high16 v15, -0x41000000    # -0.5f

    .line 654
    .line 655
    const v16, -0x419eb852    # -0.22f

    .line 656
    .line 657
    .line 658
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 659
    .line 660
    .line 661
    const/high16 v0, -0x3f600000    # -5.0f

    .line 662
    .line 663
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 664
    .line 665
    .line 666
    const/high16 v17, 0x3f000000    # 0.5f

    .line 667
    .line 668
    const/4 v13, 0x0

    .line 669
    const v14, -0x4170a3d7    # -0.28f

    .line 670
    .line 671
    .line 672
    const v15, 0x3e6147ae    # 0.22f

    .line 673
    .line 674
    .line 675
    const/high16 v16, -0x41000000    # -0.5f

    .line 676
    .line 677
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 678
    .line 679
    .line 680
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 681
    .line 682
    .line 683
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 684
    .line 685
    .line 686
    move-result-object v2

    .line 687
    const/16 v16, 0x3800

    .line 688
    .line 689
    const/16 v17, 0x0

    .line 690
    .line 691
    const/high16 v6, 0x3f800000    # 1.0f

    .line 692
    .line 693
    const/high16 v8, 0x3f800000    # 1.0f

    .line 694
    .line 695
    const/4 v7, 0x0

    .line 696
    const/high16 v9, 0x3f800000    # 1.0f

    .line 697
    .line 698
    const/high16 v12, 0x3f800000    # 1.0f

    .line 699
    .line 700
    const/4 v14, 0x0

    .line 701
    const/4 v15, 0x0

    .line 702
    const-string v4, ""

    .line 703
    .line 704
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 705
    .line 706
    .line 707
    move-result-object v0

    .line 708
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 709
    .line 710
    .line 711
    move-result-object v0

    .line 712
    sput-object v0, Landroidx/compose/material/icons/rounded/DeveloperBoardKt;->_developerBoard:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 713
    .line 714
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 715
    .line 716
    .line 717
    return-object v0
.end method
