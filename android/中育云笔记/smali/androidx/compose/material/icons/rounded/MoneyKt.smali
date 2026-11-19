.class public final Landroidx/compose/material/icons/rounded/MoneyKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _money:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getMoney(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/MoneyKt;->_money:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.Money"

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
    const/high16 v0, 0x41700000    # 15.0f

    .line 71
    .line 72
    const/high16 v2, 0x41800000    # 16.0f

    .line 73
    .line 74
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

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
    const/high16 v0, 0x41980000    # 19.0f

    .line 99
    .line 100
    const/high16 v2, 0x41100000    # 9.0f

    .line 101
    .line 102
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 103
    .line 104
    .line 105
    const/high16 v17, -0x40800000    # -1.0f

    .line 106
    .line 107
    const/4 v13, 0x0

    .line 108
    const v14, -0x40f33333    # -0.55f

    .line 109
    .line 110
    .line 111
    const v15, -0x4119999a    # -0.45f

    .line 112
    .line 113
    .line 114
    const/high16 v16, -0x40800000    # -1.0f

    .line 115
    .line 116
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 117
    .line 118
    .line 119
    const/high16 v0, -0x3fc00000    # -3.0f

    .line 120
    .line 121
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 122
    .line 123
    .line 124
    const/high16 v18, 0x3f800000    # 1.0f

    .line 125
    .line 126
    const v13, -0x40f33333    # -0.55f

    .line 127
    .line 128
    .line 129
    const/4 v14, 0x0

    .line 130
    const/high16 v15, -0x40800000    # -1.0f

    .line 131
    .line 132
    const v16, 0x3ee66666    # 0.45f

    .line 133
    .line 134
    .line 135
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 136
    .line 137
    .line 138
    const/high16 v0, 0x40c00000    # 6.0f

    .line 139
    .line 140
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 141
    .line 142
    .line 143
    const/high16 v17, 0x3f800000    # 1.0f

    .line 144
    .line 145
    const/4 v13, 0x0

    .line 146
    const v14, 0x3f0ccccd    # 0.55f

    .line 147
    .line 148
    .line 149
    const v15, 0x3ee66666    # 0.45f

    .line 150
    .line 151
    .line 152
    const/high16 v16, 0x3f800000    # 1.0f

    .line 153
    .line 154
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 155
    .line 156
    .line 157
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 158
    .line 159
    .line 160
    const/high16 v0, 0x41200000    # 10.0f

    .line 161
    .line 162
    const/high16 v2, 0x41800000    # 16.0f

    .line 163
    .line 164
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 165
    .line 166
    .line 167
    const/high16 v0, 0x3f800000    # 1.0f

    .line 168
    .line 169
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 170
    .line 171
    .line 172
    const/high16 v0, 0x40800000    # 4.0f

    .line 173
    .line 174
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 175
    .line 176
    .line 177
    const/high16 v0, -0x40800000    # -1.0f

    .line 178
    .line 179
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 180
    .line 181
    .line 182
    const/high16 v0, -0x3f800000    # -4.0f

    .line 183
    .line 184
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 185
    .line 186
    .line 187
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 188
    .line 189
    .line 190
    const/high16 v0, 0x41800000    # 16.0f

    .line 191
    .line 192
    const/high16 v2, 0x41100000    # 9.0f

    .line 193
    .line 194
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 195
    .line 196
    .line 197
    const/high16 v0, 0x40400000    # 3.0f

    .line 198
    .line 199
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 200
    .line 201
    .line 202
    const/high16 v18, -0x40800000    # -1.0f

    .line 203
    .line 204
    const v13, 0x3f0ccccd    # 0.55f

    .line 205
    .line 206
    .line 207
    const/4 v14, 0x0

    .line 208
    const/high16 v15, 0x3f800000    # 1.0f

    .line 209
    .line 210
    const v16, -0x4119999a    # -0.45f

    .line 211
    .line 212
    .line 213
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 214
    .line 215
    .line 216
    const/high16 v0, 0x41500000    # 13.0f

    .line 217
    .line 218
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 219
    .line 220
    .line 221
    const/high16 v17, -0x40800000    # -1.0f

    .line 222
    .line 223
    const/4 v13, 0x0

    .line 224
    const v14, -0x40f33333    # -0.55f

    .line 225
    .line 226
    .line 227
    const v15, -0x4119999a    # -0.45f

    .line 228
    .line 229
    .line 230
    const/high16 v16, -0x40800000    # -1.0f

    .line 231
    .line 232
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 233
    .line 234
    .line 235
    const/high16 v0, 0x41000000    # 8.0f

    .line 236
    .line 237
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 238
    .line 239
    .line 240
    const/high16 v18, 0x3f800000    # 1.0f

    .line 241
    .line 242
    const v13, -0x40f33333    # -0.55f

    .line 243
    .line 244
    .line 245
    const/4 v14, 0x0

    .line 246
    const/high16 v15, -0x40800000    # -1.0f

    .line 247
    .line 248
    const v16, 0x3ee66666    # 0.45f

    .line 249
    .line 250
    .line 251
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 252
    .line 253
    .line 254
    const/high16 v0, 0x40c00000    # 6.0f

    .line 255
    .line 256
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 257
    .line 258
    .line 259
    const/high16 v17, 0x3f800000    # 1.0f

    .line 260
    .line 261
    const/4 v13, 0x0

    .line 262
    const v14, 0x3f0ccccd    # 0.55f

    .line 263
    .line 264
    .line 265
    const v15, 0x3ee66666    # 0.45f

    .line 266
    .line 267
    .line 268
    const/high16 v16, 0x3f800000    # 1.0f

    .line 269
    .line 270
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 271
    .line 272
    .line 273
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 274
    .line 275
    .line 276
    const/high16 v0, 0x41200000    # 10.0f

    .line 277
    .line 278
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 279
    .line 280
    .line 281
    const/high16 v0, 0x3f800000    # 1.0f

    .line 282
    .line 283
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 284
    .line 285
    .line 286
    const/high16 v0, 0x40800000    # 4.0f

    .line 287
    .line 288
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 289
    .line 290
    .line 291
    const/high16 v0, -0x40800000    # -1.0f

    .line 292
    .line 293
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 294
    .line 295
    .line 296
    const/high16 v0, -0x3f800000    # -4.0f

    .line 297
    .line 298
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 299
    .line 300
    .line 301
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 302
    .line 303
    .line 304
    const/high16 v0, 0x41000000    # 8.0f

    .line 305
    .line 306
    const/high16 v2, 0x40c00000    # 6.0f

    .line 307
    .line 308
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 309
    .line 310
    .line 311
    const/high16 v17, -0x40800000    # -1.0f

    .line 312
    .line 313
    const v13, -0x40f33333    # -0.55f

    .line 314
    .line 315
    .line 316
    const/4 v14, 0x0

    .line 317
    const/high16 v15, -0x40800000    # -1.0f

    .line 318
    .line 319
    const v16, 0x3ee66666    # 0.45f

    .line 320
    .line 321
    .line 322
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 323
    .line 324
    .line 325
    const/high16 v0, 0x40c00000    # 6.0f

    .line 326
    .line 327
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 328
    .line 329
    .line 330
    const/high16 v17, 0x3f800000    # 1.0f

    .line 331
    .line 332
    const/4 v13, 0x0

    .line 333
    const v14, 0x3f0ccccd    # 0.55f

    .line 334
    .line 335
    .line 336
    const v15, 0x3ee66666    # 0.45f

    .line 337
    .line 338
    .line 339
    const/high16 v16, 0x3f800000    # 1.0f

    .line 340
    .line 341
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 342
    .line 343
    .line 344
    const v0, -0x4119999a    # -0.45f

    .line 345
    .line 346
    .line 347
    const/high16 v2, -0x40800000    # -1.0f

    .line 348
    .line 349
    const/high16 v4, 0x3f800000    # 1.0f

    .line 350
    .line 351
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 352
    .line 353
    .line 354
    const/high16 v0, 0x40e00000    # 7.0f

    .line 355
    .line 356
    const/high16 v2, 0x41100000    # 9.0f

    .line 357
    .line 358
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 359
    .line 360
    .line 361
    const/high16 v17, -0x40800000    # -1.0f

    .line 362
    .line 363
    const/high16 v18, -0x40800000    # -1.0f

    .line 364
    .line 365
    const v14, -0x40f33333    # -0.55f

    .line 366
    .line 367
    .line 368
    const v15, -0x4119999a    # -0.45f

    .line 369
    .line 370
    .line 371
    const/high16 v16, -0x40800000    # -1.0f

    .line 372
    .line 373
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 374
    .line 375
    .line 376
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 377
    .line 378
    .line 379
    const/high16 v0, 0x40000000    # 2.0f

    .line 380
    .line 381
    const/high16 v2, 0x40c00000    # 6.0f

    .line 382
    .line 383
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 384
    .line 385
    .line 386
    const/high16 v0, 0x41400000    # 12.0f

    .line 387
    .line 388
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 389
    .line 390
    .line 391
    const/high16 v17, 0x40000000    # 2.0f

    .line 392
    .line 393
    const/high16 v18, 0x40000000    # 2.0f

    .line 394
    .line 395
    const v14, 0x3f8ccccd    # 1.1f

    .line 396
    .line 397
    .line 398
    const v15, 0x3f666666    # 0.9f

    .line 399
    .line 400
    .line 401
    const/high16 v16, 0x40000000    # 2.0f

    .line 402
    .line 403
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 404
    .line 405
    .line 406
    const/high16 v0, 0x41800000    # 16.0f

    .line 407
    .line 408
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 409
    .line 410
    .line 411
    const/high16 v18, -0x40000000    # -2.0f

    .line 412
    .line 413
    const v13, 0x3f8ccccd    # 1.1f

    .line 414
    .line 415
    .line 416
    const/4 v14, 0x0

    .line 417
    const/high16 v15, 0x40000000    # 2.0f

    .line 418
    .line 419
    const v16, -0x4099999a    # -0.9f

    .line 420
    .line 421
    .line 422
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 423
    .line 424
    .line 425
    const/high16 v0, 0x41b00000    # 22.0f

    .line 426
    .line 427
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 428
    .line 429
    .line 430
    const/high16 v17, -0x40000000    # -2.0f

    .line 431
    .line 432
    const/4 v13, 0x0

    .line 433
    const v14, -0x40733333    # -1.1f

    .line 434
    .line 435
    .line 436
    const v15, -0x4099999a    # -0.9f

    .line 437
    .line 438
    .line 439
    const/high16 v16, -0x40000000    # -2.0f

    .line 440
    .line 441
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 442
    .line 443
    .line 444
    const/high16 v0, 0x40800000    # 4.0f

    .line 445
    .line 446
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 447
    .line 448
    .line 449
    const/high16 v18, 0x40000000    # 2.0f

    .line 450
    .line 451
    const v13, -0x40733333    # -1.1f

    .line 452
    .line 453
    .line 454
    const/4 v14, 0x0

    .line 455
    const/high16 v15, -0x40000000    # -2.0f

    .line 456
    .line 457
    const v16, 0x3f666666    # 0.9f

    .line 458
    .line 459
    .line 460
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 461
    .line 462
    .line 463
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 464
    .line 465
    .line 466
    const/high16 v0, 0x41900000    # 18.0f

    .line 467
    .line 468
    const/high16 v2, 0x41980000    # 19.0f

    .line 469
    .line 470
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 471
    .line 472
    .line 473
    const/high16 v0, 0x40a00000    # 5.0f

    .line 474
    .line 475
    const/high16 v2, 0x41900000    # 18.0f

    .line 476
    .line 477
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 478
    .line 479
    .line 480
    const/high16 v17, -0x40800000    # -1.0f

    .line 481
    .line 482
    const/high16 v18, -0x40800000    # -1.0f

    .line 483
    .line 484
    const v13, -0x40f33333    # -0.55f

    .line 485
    .line 486
    .line 487
    const/high16 v15, -0x40800000    # -1.0f

    .line 488
    .line 489
    const v16, -0x4119999a    # -0.45f

    .line 490
    .line 491
    .line 492
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 493
    .line 494
    .line 495
    const/high16 v0, 0x40e00000    # 7.0f

    .line 496
    .line 497
    const/high16 v2, 0x40800000    # 4.0f

    .line 498
    .line 499
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 500
    .line 501
    .line 502
    const/high16 v17, 0x3f800000    # 1.0f

    .line 503
    .line 504
    const/4 v13, 0x0

    .line 505
    const v14, -0x40f33333    # -0.55f

    .line 506
    .line 507
    .line 508
    const v15, 0x3ee66666    # 0.45f

    .line 509
    .line 510
    .line 511
    const/high16 v16, -0x40800000    # -1.0f

    .line 512
    .line 513
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 514
    .line 515
    .line 516
    const/high16 v0, 0x41600000    # 14.0f

    .line 517
    .line 518
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 519
    .line 520
    .line 521
    const/high16 v18, 0x3f800000    # 1.0f

    .line 522
    .line 523
    const v13, 0x3f0ccccd    # 0.55f

    .line 524
    .line 525
    .line 526
    const/4 v14, 0x0

    .line 527
    const/high16 v15, 0x3f800000    # 1.0f

    .line 528
    .line 529
    const v16, 0x3ee66666    # 0.45f

    .line 530
    .line 531
    .line 532
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 533
    .line 534
    .line 535
    const/high16 v0, 0x41200000    # 10.0f

    .line 536
    .line 537
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 538
    .line 539
    .line 540
    const/high16 v17, -0x40800000    # -1.0f

    .line 541
    .line 542
    const/4 v13, 0x0

    .line 543
    const v14, 0x3f0ccccd    # 0.55f

    .line 544
    .line 545
    .line 546
    const v15, -0x4119999a    # -0.45f

    .line 547
    .line 548
    .line 549
    const/high16 v16, 0x3f800000    # 1.0f

    .line 550
    .line 551
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 552
    .line 553
    .line 554
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 555
    .line 556
    .line 557
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 558
    .line 559
    .line 560
    move-result-object v2

    .line 561
    const/16 v16, 0x3800

    .line 562
    .line 563
    const/16 v17, 0x0

    .line 564
    .line 565
    const/high16 v6, 0x3f800000    # 1.0f

    .line 566
    .line 567
    const/high16 v8, 0x3f800000    # 1.0f

    .line 568
    .line 569
    const/4 v7, 0x0

    .line 570
    const/high16 v9, 0x3f800000    # 1.0f

    .line 571
    .line 572
    const/high16 v12, 0x3f800000    # 1.0f

    .line 573
    .line 574
    const/4 v14, 0x0

    .line 575
    const/4 v15, 0x0

    .line 576
    const-string v4, ""

    .line 577
    .line 578
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 579
    .line 580
    .line 581
    move-result-object v0

    .line 582
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 583
    .line 584
    .line 585
    move-result-object v0

    .line 586
    sput-object v0, Landroidx/compose/material/icons/rounded/MoneyKt;->_money:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 587
    .line 588
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 589
    .line 590
    .line 591
    return-object v0
.end method
