.class public final Landroidx/compose/material/icons/twotone/MoneyKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _money:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getMoney(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/MoneyKt;->_money:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.Money"

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
    const/high16 v4, 0x41200000    # 10.0f

    .line 71
    .line 72
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 73
    .line 74
    .line 75
    const/high16 v4, 0x3f800000    # 1.0f

    .line 76
    .line 77
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 78
    .line 79
    .line 80
    const/high16 v4, 0x40800000    # 4.0f

    .line 81
    .line 82
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 83
    .line 84
    .line 85
    const/high16 v4, -0x40800000    # -1.0f

    .line 86
    .line 87
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 88
    .line 89
    .line 90
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 91
    .line 92
    .line 93
    const/high16 v4, 0x41200000    # 10.0f

    .line 94
    .line 95
    const/high16 v6, 0x41800000    # 16.0f

    .line 96
    .line 97
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 98
    .line 99
    .line 100
    const/high16 v4, 0x3f800000    # 1.0f

    .line 101
    .line 102
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 103
    .line 104
    .line 105
    const/high16 v4, 0x40800000    # 4.0f

    .line 106
    .line 107
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 108
    .line 109
    .line 110
    const/high16 v4, -0x40800000    # -1.0f

    .line 111
    .line 112
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 113
    .line 114
    .line 115
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 116
    .line 117
    .line 118
    const/high16 v4, 0x41900000    # 18.0f

    .line 119
    .line 120
    const/high16 v6, 0x40800000    # 4.0f

    .line 121
    .line 122
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 123
    .line 124
    .line 125
    const/high16 v4, 0x41800000    # 16.0f

    .line 126
    .line 127
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 128
    .line 129
    .line 130
    const/high16 v4, 0x41a00000    # 20.0f

    .line 131
    .line 132
    const/high16 v6, 0x40c00000    # 6.0f

    .line 133
    .line 134
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 135
    .line 136
    .line 137
    const/high16 v4, 0x40c00000    # 6.0f

    .line 138
    .line 139
    const/high16 v6, 0x40800000    # 4.0f

    .line 140
    .line 141
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 142
    .line 143
    .line 144
    const/high16 v4, 0x41400000    # 12.0f

    .line 145
    .line 146
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 147
    .line 148
    .line 149
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 150
    .line 151
    .line 152
    const/high16 v4, 0x41600000    # 14.0f

    .line 153
    .line 154
    const/high16 v6, 0x41100000    # 9.0f

    .line 155
    .line 156
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 157
    .line 158
    .line 159
    const/high16 v25, 0x3f800000    # 1.0f

    .line 160
    .line 161
    const/high16 v26, -0x40800000    # -1.0f

    .line 162
    .line 163
    const/16 v21, 0x0

    .line 164
    .line 165
    const v22, -0x40f33333    # -0.55f

    .line 166
    .line 167
    .line 168
    const v23, 0x3ee66666    # 0.45f

    .line 169
    .line 170
    .line 171
    const/high16 v24, -0x40800000    # -1.0f

    .line 172
    .line 173
    move-object/from16 v20, v2

    .line 174
    .line 175
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 176
    .line 177
    .line 178
    const/high16 v4, 0x40400000    # 3.0f

    .line 179
    .line 180
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 181
    .line 182
    .line 183
    const/high16 v26, 0x3f800000    # 1.0f

    .line 184
    .line 185
    const v21, 0x3f0ccccd    # 0.55f

    .line 186
    .line 187
    .line 188
    const/16 v22, 0x0

    .line 189
    .line 190
    const/high16 v23, 0x3f800000    # 1.0f

    .line 191
    .line 192
    const v24, 0x3ee66666    # 0.45f

    .line 193
    .line 194
    .line 195
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 196
    .line 197
    .line 198
    const/high16 v4, 0x40c00000    # 6.0f

    .line 199
    .line 200
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 201
    .line 202
    .line 203
    const/high16 v25, -0x40800000    # -1.0f

    .line 204
    .line 205
    const/16 v21, 0x0

    .line 206
    .line 207
    const v22, 0x3f0ccccd    # 0.55f

    .line 208
    .line 209
    .line 210
    const v23, -0x4119999a    # -0.45f

    .line 211
    .line 212
    .line 213
    const/high16 v24, 0x3f800000    # 1.0f

    .line 214
    .line 215
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 216
    .line 217
    .line 218
    const/high16 v4, -0x3fc00000    # -3.0f

    .line 219
    .line 220
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 221
    .line 222
    .line 223
    const/high16 v26, -0x40800000    # -1.0f

    .line 224
    .line 225
    const v21, -0x40f33333    # -0.55f

    .line 226
    .line 227
    .line 228
    const/16 v22, 0x0

    .line 229
    .line 230
    const/high16 v23, -0x40800000    # -1.0f

    .line 231
    .line 232
    const v24, -0x4119999a    # -0.45f

    .line 233
    .line 234
    .line 235
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 236
    .line 237
    .line 238
    const/high16 v4, 0x41600000    # 14.0f

    .line 239
    .line 240
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 241
    .line 242
    .line 243
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 244
    .line 245
    .line 246
    const/high16 v4, 0x41000000    # 8.0f

    .line 247
    .line 248
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 249
    .line 250
    .line 251
    const/high16 v25, 0x3f800000    # 1.0f

    .line 252
    .line 253
    const/16 v21, 0x0

    .line 254
    .line 255
    const v22, -0x40f33333    # -0.55f

    .line 256
    .line 257
    .line 258
    const v23, 0x3ee66666    # 0.45f

    .line 259
    .line 260
    .line 261
    const/high16 v24, -0x40800000    # -1.0f

    .line 262
    .line 263
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 264
    .line 265
    .line 266
    const/high16 v4, 0x40400000    # 3.0f

    .line 267
    .line 268
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 269
    .line 270
    .line 271
    const/high16 v26, 0x3f800000    # 1.0f

    .line 272
    .line 273
    const v21, 0x3f0ccccd    # 0.55f

    .line 274
    .line 275
    .line 276
    const/16 v22, 0x0

    .line 277
    .line 278
    const/high16 v23, 0x3f800000    # 1.0f

    .line 279
    .line 280
    const v24, 0x3ee66666    # 0.45f

    .line 281
    .line 282
    .line 283
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 284
    .line 285
    .line 286
    const/high16 v4, 0x40c00000    # 6.0f

    .line 287
    .line 288
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 289
    .line 290
    .line 291
    const/high16 v25, -0x40800000    # -1.0f

    .line 292
    .line 293
    const/16 v21, 0x0

    .line 294
    .line 295
    const v22, 0x3f0ccccd    # 0.55f

    .line 296
    .line 297
    .line 298
    const v23, -0x4119999a    # -0.45f

    .line 299
    .line 300
    .line 301
    const/high16 v24, 0x3f800000    # 1.0f

    .line 302
    .line 303
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 304
    .line 305
    .line 306
    const/high16 v4, 0x41100000    # 9.0f

    .line 307
    .line 308
    const/high16 v6, 0x41800000    # 16.0f

    .line 309
    .line 310
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 311
    .line 312
    .line 313
    const/high16 v26, -0x40800000    # -1.0f

    .line 314
    .line 315
    const v21, -0x40f33333    # -0.55f

    .line 316
    .line 317
    .line 318
    const/16 v22, 0x0

    .line 319
    .line 320
    const/high16 v23, -0x40800000    # -1.0f

    .line 321
    .line 322
    const v24, -0x4119999a    # -0.45f

    .line 323
    .line 324
    .line 325
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 326
    .line 327
    .line 328
    const/high16 v4, 0x41000000    # 8.0f

    .line 329
    .line 330
    const/high16 v6, 0x41100000    # 9.0f

    .line 331
    .line 332
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 333
    .line 334
    .line 335
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 336
    .line 337
    .line 338
    const/high16 v4, 0x40a00000    # 5.0f

    .line 339
    .line 340
    const/high16 v6, 0x41000000    # 8.0f

    .line 341
    .line 342
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 343
    .line 344
    .line 345
    const/high16 v4, 0x40000000    # 2.0f

    .line 346
    .line 347
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 348
    .line 349
    .line 350
    const/high16 v4, 0x41000000    # 8.0f

    .line 351
    .line 352
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 353
    .line 354
    .line 355
    const/high16 v4, 0x40a00000    # 5.0f

    .line 356
    .line 357
    const/high16 v6, 0x41800000    # 16.0f

    .line 358
    .line 359
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 360
    .line 361
    .line 362
    const/high16 v6, 0x41000000    # 8.0f

    .line 363
    .line 364
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 365
    .line 366
    .line 367
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 368
    .line 369
    .line 370
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 371
    .line 372
    .line 373
    move-result-object v2

    .line 374
    const/16 v16, 0x3800

    .line 375
    .line 376
    const/16 v17, 0x0

    .line 377
    .line 378
    const v6, 0x3e99999a    # 0.3f

    .line 379
    .line 380
    .line 381
    const v8, 0x3e99999a    # 0.3f

    .line 382
    .line 383
    .line 384
    const/4 v7, 0x0

    .line 385
    const/high16 v9, 0x3f800000    # 1.0f

    .line 386
    .line 387
    const/high16 v12, 0x3f800000    # 1.0f

    .line 388
    .line 389
    const/4 v13, 0x0

    .line 390
    const/4 v14, 0x0

    .line 391
    const/4 v15, 0x0

    .line 392
    const-string v4, ""

    .line 393
    .line 394
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 395
    .line 396
    .line 397
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 398
    .line 399
    .line 400
    move-result v3

    .line 401
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 402
    .line 403
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 404
    .line 405
    .line 406
    move-result-wide v6

    .line 407
    const/4 v0, 0x0

    .line 408
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 409
    .line 410
    .line 411
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 412
    .line 413
    .line 414
    move-result v10

    .line 415
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 416
    .line 417
    .line 418
    move-result v11

    .line 419
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 420
    .line 421
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 422
    .line 423
    .line 424
    const/high16 v0, 0x41700000    # 15.0f

    .line 425
    .line 426
    const/high16 v2, 0x41800000    # 16.0f

    .line 427
    .line 428
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 429
    .line 430
    .line 431
    const/high16 v0, 0x40400000    # 3.0f

    .line 432
    .line 433
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 434
    .line 435
    .line 436
    const/high16 v17, 0x3f800000    # 1.0f

    .line 437
    .line 438
    const/high16 v18, -0x40800000    # -1.0f

    .line 439
    .line 440
    const v13, 0x3f0ccccd    # 0.55f

    .line 441
    .line 442
    .line 443
    const/high16 v15, 0x3f800000    # 1.0f

    .line 444
    .line 445
    const v16, -0x4119999a    # -0.45f

    .line 446
    .line 447
    .line 448
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 449
    .line 450
    .line 451
    const/high16 v0, 0x41980000    # 19.0f

    .line 452
    .line 453
    const/high16 v2, 0x41100000    # 9.0f

    .line 454
    .line 455
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 456
    .line 457
    .line 458
    const/high16 v17, -0x40800000    # -1.0f

    .line 459
    .line 460
    const/4 v13, 0x0

    .line 461
    const v14, -0x40f33333    # -0.55f

    .line 462
    .line 463
    .line 464
    const v15, -0x4119999a    # -0.45f

    .line 465
    .line 466
    .line 467
    const/high16 v16, -0x40800000    # -1.0f

    .line 468
    .line 469
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 470
    .line 471
    .line 472
    const/high16 v0, -0x3fc00000    # -3.0f

    .line 473
    .line 474
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 475
    .line 476
    .line 477
    const/high16 v18, 0x3f800000    # 1.0f

    .line 478
    .line 479
    const v13, -0x40f33333    # -0.55f

    .line 480
    .line 481
    .line 482
    const/4 v14, 0x0

    .line 483
    const/high16 v15, -0x40800000    # -1.0f

    .line 484
    .line 485
    const v16, 0x3ee66666    # 0.45f

    .line 486
    .line 487
    .line 488
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 489
    .line 490
    .line 491
    const/high16 v0, 0x40c00000    # 6.0f

    .line 492
    .line 493
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 494
    .line 495
    .line 496
    const/high16 v17, 0x3f800000    # 1.0f

    .line 497
    .line 498
    const/4 v13, 0x0

    .line 499
    const v14, 0x3f0ccccd    # 0.55f

    .line 500
    .line 501
    .line 502
    const v15, 0x3ee66666    # 0.45f

    .line 503
    .line 504
    .line 505
    const/high16 v16, 0x3f800000    # 1.0f

    .line 506
    .line 507
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 508
    .line 509
    .line 510
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 511
    .line 512
    .line 513
    const/high16 v0, 0x41200000    # 10.0f

    .line 514
    .line 515
    const/high16 v2, 0x41800000    # 16.0f

    .line 516
    .line 517
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 518
    .line 519
    .line 520
    const/high16 v0, 0x3f800000    # 1.0f

    .line 521
    .line 522
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 523
    .line 524
    .line 525
    const/high16 v0, 0x40800000    # 4.0f

    .line 526
    .line 527
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 528
    .line 529
    .line 530
    const/high16 v0, -0x40800000    # -1.0f

    .line 531
    .line 532
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 533
    .line 534
    .line 535
    const/high16 v0, -0x3f800000    # -4.0f

    .line 536
    .line 537
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 538
    .line 539
    .line 540
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 541
    .line 542
    .line 543
    const/high16 v0, 0x41100000    # 9.0f

    .line 544
    .line 545
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 546
    .line 547
    .line 548
    const/high16 v0, 0x40400000    # 3.0f

    .line 549
    .line 550
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 551
    .line 552
    .line 553
    const/high16 v18, -0x40800000    # -1.0f

    .line 554
    .line 555
    const v13, 0x3f0ccccd    # 0.55f

    .line 556
    .line 557
    .line 558
    const/4 v14, 0x0

    .line 559
    const/high16 v15, 0x3f800000    # 1.0f

    .line 560
    .line 561
    const v16, -0x4119999a    # -0.45f

    .line 562
    .line 563
    .line 564
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 565
    .line 566
    .line 567
    const/high16 v0, 0x41500000    # 13.0f

    .line 568
    .line 569
    const/high16 v2, 0x41100000    # 9.0f

    .line 570
    .line 571
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 572
    .line 573
    .line 574
    const/high16 v17, -0x40800000    # -1.0f

    .line 575
    .line 576
    const/4 v13, 0x0

    .line 577
    const v14, -0x40f33333    # -0.55f

    .line 578
    .line 579
    .line 580
    const v15, -0x4119999a    # -0.45f

    .line 581
    .line 582
    .line 583
    const/high16 v16, -0x40800000    # -1.0f

    .line 584
    .line 585
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 586
    .line 587
    .line 588
    const/high16 v0, 0x41000000    # 8.0f

    .line 589
    .line 590
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 591
    .line 592
    .line 593
    const/high16 v18, 0x3f800000    # 1.0f

    .line 594
    .line 595
    const v13, -0x40f33333    # -0.55f

    .line 596
    .line 597
    .line 598
    const/4 v14, 0x0

    .line 599
    const/high16 v15, -0x40800000    # -1.0f

    .line 600
    .line 601
    const v16, 0x3ee66666    # 0.45f

    .line 602
    .line 603
    .line 604
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 605
    .line 606
    .line 607
    const/high16 v0, 0x40c00000    # 6.0f

    .line 608
    .line 609
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 610
    .line 611
    .line 612
    const/high16 v17, 0x3f800000    # 1.0f

    .line 613
    .line 614
    const/4 v13, 0x0

    .line 615
    const v14, 0x3f0ccccd    # 0.55f

    .line 616
    .line 617
    .line 618
    const v15, 0x3ee66666    # 0.45f

    .line 619
    .line 620
    .line 621
    const/high16 v16, 0x3f800000    # 1.0f

    .line 622
    .line 623
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 624
    .line 625
    .line 626
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 627
    .line 628
    .line 629
    const/high16 v0, 0x41200000    # 10.0f

    .line 630
    .line 631
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 632
    .line 633
    .line 634
    const/high16 v0, 0x3f800000    # 1.0f

    .line 635
    .line 636
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 637
    .line 638
    .line 639
    const/high16 v0, 0x40800000    # 4.0f

    .line 640
    .line 641
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 642
    .line 643
    .line 644
    const/high16 v0, -0x40800000    # -1.0f

    .line 645
    .line 646
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 647
    .line 648
    .line 649
    const/high16 v0, -0x3f800000    # -4.0f

    .line 650
    .line 651
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 652
    .line 653
    .line 654
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 655
    .line 656
    .line 657
    const/high16 v0, 0x40a00000    # 5.0f

    .line 658
    .line 659
    const/high16 v2, 0x41000000    # 8.0f

    .line 660
    .line 661
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 662
    .line 663
    .line 664
    const/high16 v0, 0x40000000    # 2.0f

    .line 665
    .line 666
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 667
    .line 668
    .line 669
    const/high16 v0, 0x41000000    # 8.0f

    .line 670
    .line 671
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 672
    .line 673
    .line 674
    const/high16 v0, 0x40a00000    # 5.0f

    .line 675
    .line 676
    const/high16 v2, 0x41800000    # 16.0f

    .line 677
    .line 678
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 679
    .line 680
    .line 681
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 682
    .line 683
    .line 684
    const/high16 v0, 0x40000000    # 2.0f

    .line 685
    .line 686
    const/high16 v2, 0x40800000    # 4.0f

    .line 687
    .line 688
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 689
    .line 690
    .line 691
    const/high16 v0, 0x41800000    # 16.0f

    .line 692
    .line 693
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 694
    .line 695
    .line 696
    const/high16 v0, 0x41a00000    # 20.0f

    .line 697
    .line 698
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 699
    .line 700
    .line 701
    const/high16 v0, 0x41b00000    # 22.0f

    .line 702
    .line 703
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 704
    .line 705
    .line 706
    const/high16 v0, 0x40000000    # 2.0f

    .line 707
    .line 708
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 709
    .line 710
    .line 711
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 712
    .line 713
    .line 714
    const/high16 v0, 0x41a00000    # 20.0f

    .line 715
    .line 716
    const/high16 v2, 0x41900000    # 18.0f

    .line 717
    .line 718
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 719
    .line 720
    .line 721
    const/high16 v0, 0x41900000    # 18.0f

    .line 722
    .line 723
    const/high16 v2, 0x40800000    # 4.0f

    .line 724
    .line 725
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 726
    .line 727
    .line 728
    const/high16 v0, 0x40c00000    # 6.0f

    .line 729
    .line 730
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 731
    .line 732
    .line 733
    const/high16 v0, 0x41800000    # 16.0f

    .line 734
    .line 735
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 736
    .line 737
    .line 738
    const/high16 v0, 0x41400000    # 12.0f

    .line 739
    .line 740
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 741
    .line 742
    .line 743
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 744
    .line 745
    .line 746
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 747
    .line 748
    .line 749
    move-result-object v2

    .line 750
    const/16 v16, 0x3800

    .line 751
    .line 752
    const/16 v17, 0x0

    .line 753
    .line 754
    const/high16 v6, 0x3f800000    # 1.0f

    .line 755
    .line 756
    const/high16 v8, 0x3f800000    # 1.0f

    .line 757
    .line 758
    const/4 v7, 0x0

    .line 759
    const/high16 v12, 0x3f800000    # 1.0f

    .line 760
    .line 761
    const/4 v14, 0x0

    .line 762
    const/4 v15, 0x0

    .line 763
    const-string v4, ""

    .line 764
    .line 765
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 766
    .line 767
    .line 768
    move-result-object v0

    .line 769
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 770
    .line 771
    .line 772
    move-result-object v0

    .line 773
    sput-object v0, Landroidx/compose/material/icons/twotone/MoneyKt;->_money:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 774
    .line 775
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 776
    .line 777
    .line 778
    return-object v0
.end method
