.class public final Landroidx/compose/material/icons/rounded/ReceiptLongKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _receiptLong:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getReceiptLong(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 28

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/ReceiptLongKt;->_receiptLong:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.ReceiptLong"

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
    const/high16 v4, 0x41100000    # 9.0f

    .line 71
    .line 72
    const/high16 v6, 0x41600000    # 14.0f

    .line 73
    .line 74
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v4, -0x3f800000    # -4.0f

    .line 78
    .line 79
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 80
    .line 81
    .line 82
    const/high16 v25, 0x41100000    # 9.0f

    .line 83
    .line 84
    const/high16 v26, 0x41000000    # 8.0f

    .line 85
    .line 86
    const v21, 0x41173333    # 9.45f

    .line 87
    .line 88
    .line 89
    const/high16 v22, 0x41100000    # 9.0f

    .line 90
    .line 91
    const/high16 v23, 0x41100000    # 9.0f

    .line 92
    .line 93
    const v24, 0x4108cccd    # 8.55f

    .line 94
    .line 95
    .line 96
    move-object/from16 v20, v2

    .line 97
    .line 98
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 99
    .line 100
    .line 101
    const/4 v4, 0x0

    .line 102
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 103
    .line 104
    .line 105
    const/high16 v25, 0x3f800000    # 1.0f

    .line 106
    .line 107
    const/high16 v26, -0x40800000    # -1.0f

    .line 108
    .line 109
    const/16 v21, 0x0

    .line 110
    .line 111
    const v22, -0x40f33333    # -0.55f

    .line 112
    .line 113
    .line 114
    const v23, 0x3ee66666    # 0.45f

    .line 115
    .line 116
    .line 117
    const/high16 v24, -0x40800000    # -1.0f

    .line 118
    .line 119
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 120
    .line 121
    .line 122
    const/high16 v4, 0x40800000    # 4.0f

    .line 123
    .line 124
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 125
    .line 126
    .line 127
    const/high16 v26, 0x3f800000    # 1.0f

    .line 128
    .line 129
    const v21, 0x3f0ccccd    # 0.55f

    .line 130
    .line 131
    .line 132
    const/16 v22, 0x0

    .line 133
    .line 134
    const/high16 v23, 0x3f800000    # 1.0f

    .line 135
    .line 136
    const v24, 0x3ee66666    # 0.45f

    .line 137
    .line 138
    .line 139
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 140
    .line 141
    .line 142
    const/4 v4, 0x0

    .line 143
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 144
    .line 145
    .line 146
    const/high16 v25, 0x41600000    # 14.0f

    .line 147
    .line 148
    const/high16 v26, 0x41100000    # 9.0f

    .line 149
    .line 150
    const/high16 v21, 0x41700000    # 15.0f

    .line 151
    .line 152
    const v22, 0x4108cccd    # 8.55f

    .line 153
    .line 154
    .line 155
    const v23, 0x4168cccd    # 14.55f

    .line 156
    .line 157
    .line 158
    const/high16 v24, 0x41100000    # 9.0f

    .line 159
    .line 160
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 161
    .line 162
    .line 163
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 164
    .line 165
    .line 166
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 167
    .line 168
    .line 169
    move-result-object v2

    .line 170
    const/16 v16, 0x3800

    .line 171
    .line 172
    const/16 v17, 0x0

    .line 173
    .line 174
    const/high16 v6, 0x3f800000    # 1.0f

    .line 175
    .line 176
    const/high16 v8, 0x3f800000    # 1.0f

    .line 177
    .line 178
    const/4 v7, 0x0

    .line 179
    const/high16 v9, 0x3f800000    # 1.0f

    .line 180
    .line 181
    const/high16 v12, 0x3f800000    # 1.0f

    .line 182
    .line 183
    const/4 v13, 0x0

    .line 184
    const/4 v14, 0x0

    .line 185
    const/4 v15, 0x0

    .line 186
    const-string v4, ""

    .line 187
    .line 188
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 189
    .line 190
    .line 191
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 192
    .line 193
    .line 194
    move-result v3

    .line 195
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 196
    .line 197
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 198
    .line 199
    .line 200
    move-result-wide v6

    .line 201
    const/4 v2, 0x0

    .line 202
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 203
    .line 204
    .line 205
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 206
    .line 207
    .line 208
    move-result v10

    .line 209
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 210
    .line 211
    .line 212
    move-result v11

    .line 213
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 214
    .line 215
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 216
    .line 217
    .line 218
    const/high16 v4, 0x41400000    # 12.0f

    .line 219
    .line 220
    const/high16 v6, 0x41600000    # 14.0f

    .line 221
    .line 222
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 223
    .line 224
    .line 225
    const/high16 v4, -0x3f800000    # -4.0f

    .line 226
    .line 227
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 228
    .line 229
    .line 230
    const/high16 v25, -0x40800000    # -1.0f

    .line 231
    .line 232
    const/high16 v26, -0x40800000    # -1.0f

    .line 233
    .line 234
    const v21, -0x40f33333    # -0.55f

    .line 235
    .line 236
    .line 237
    const/16 v22, 0x0

    .line 238
    .line 239
    const/high16 v23, -0x40800000    # -1.0f

    .line 240
    .line 241
    const v24, -0x4119999a    # -0.45f

    .line 242
    .line 243
    .line 244
    move-object/from16 v20, v2

    .line 245
    .line 246
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 247
    .line 248
    .line 249
    const/4 v4, 0x0

    .line 250
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 251
    .line 252
    .line 253
    const/high16 v25, 0x3f800000    # 1.0f

    .line 254
    .line 255
    const/16 v21, 0x0

    .line 256
    .line 257
    const v22, -0x40f33333    # -0.55f

    .line 258
    .line 259
    .line 260
    const v23, 0x3ee66666    # 0.45f

    .line 261
    .line 262
    .line 263
    const/high16 v24, -0x40800000    # -1.0f

    .line 264
    .line 265
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 266
    .line 267
    .line 268
    const/high16 v4, 0x40800000    # 4.0f

    .line 269
    .line 270
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 271
    .line 272
    .line 273
    const/high16 v26, 0x3f800000    # 1.0f

    .line 274
    .line 275
    const v21, 0x3f0ccccd    # 0.55f

    .line 276
    .line 277
    .line 278
    const/16 v22, 0x0

    .line 279
    .line 280
    const/high16 v23, 0x3f800000    # 1.0f

    .line 281
    .line 282
    const v24, 0x3ee66666    # 0.45f

    .line 283
    .line 284
    .line 285
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 286
    .line 287
    .line 288
    const/4 v4, 0x0

    .line 289
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 290
    .line 291
    .line 292
    const/high16 v25, 0x41600000    # 14.0f

    .line 293
    .line 294
    const/high16 v26, 0x41400000    # 12.0f

    .line 295
    .line 296
    const/high16 v21, 0x41700000    # 15.0f

    .line 297
    .line 298
    const v22, 0x4138cccd    # 11.55f

    .line 299
    .line 300
    .line 301
    const v23, 0x4168cccd    # 14.55f

    .line 302
    .line 303
    .line 304
    const/high16 v24, 0x41400000    # 12.0f

    .line 305
    .line 306
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 307
    .line 308
    .line 309
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 310
    .line 311
    .line 312
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 313
    .line 314
    .line 315
    move-result-object v2

    .line 316
    const/high16 v6, 0x3f800000    # 1.0f

    .line 317
    .line 318
    const/4 v7, 0x0

    .line 319
    const-string v4, ""

    .line 320
    .line 321
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 322
    .line 323
    .line 324
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 325
    .line 326
    .line 327
    move-result v3

    .line 328
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 329
    .line 330
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 331
    .line 332
    .line 333
    move-result-wide v6

    .line 334
    const/4 v2, 0x0

    .line 335
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 336
    .line 337
    .line 338
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 339
    .line 340
    .line 341
    move-result v10

    .line 342
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 343
    .line 344
    .line 345
    move-result v11

    .line 346
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 347
    .line 348
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 349
    .line 350
    .line 351
    const/high16 v4, 0x419c0000    # 19.5f

    .line 352
    .line 353
    const/high16 v6, 0x40600000    # 3.5f

    .line 354
    .line 355
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 356
    .line 357
    .line 358
    const/high16 v4, 0x41900000    # 18.0f

    .line 359
    .line 360
    const/high16 v6, 0x40000000    # 2.0f

    .line 361
    .line 362
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 363
    .line 364
    .line 365
    const/high16 v4, 0x3fc00000    # 1.5f

    .line 366
    .line 367
    const/high16 v6, -0x40400000    # -1.5f

    .line 368
    .line 369
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 370
    .line 371
    .line 372
    const/high16 v4, 0x41700000    # 15.0f

    .line 373
    .line 374
    const/high16 v6, 0x40000000    # 2.0f

    .line 375
    .line 376
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 377
    .line 378
    .line 379
    const/high16 v4, 0x3fc00000    # 1.5f

    .line 380
    .line 381
    const/high16 v6, -0x40400000    # -1.5f

    .line 382
    .line 383
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 384
    .line 385
    .line 386
    const/high16 v4, 0x41400000    # 12.0f

    .line 387
    .line 388
    const/high16 v6, 0x40000000    # 2.0f

    .line 389
    .line 390
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 391
    .line 392
    .line 393
    const/high16 v4, 0x3fc00000    # 1.5f

    .line 394
    .line 395
    const/high16 v6, -0x40400000    # -1.5f

    .line 396
    .line 397
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 398
    .line 399
    .line 400
    const/high16 v4, 0x41100000    # 9.0f

    .line 401
    .line 402
    const/high16 v6, 0x40000000    # 2.0f

    .line 403
    .line 404
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 405
    .line 406
    .line 407
    const/high16 v4, 0x40f00000    # 7.5f

    .line 408
    .line 409
    const/high16 v6, 0x40600000    # 3.5f

    .line 410
    .line 411
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 412
    .line 413
    .line 414
    const/high16 v4, 0x40c00000    # 6.0f

    .line 415
    .line 416
    const/high16 v6, 0x40000000    # 2.0f

    .line 417
    .line 418
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 419
    .line 420
    .line 421
    const/high16 v4, 0x41600000    # 14.0f

    .line 422
    .line 423
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 424
    .line 425
    .line 426
    const/high16 v4, 0x40800000    # 4.0f

    .line 427
    .line 428
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 429
    .line 430
    .line 431
    const/high16 v25, -0x40800000    # -1.0f

    .line 432
    .line 433
    const/high16 v26, 0x3f800000    # 1.0f

    .line 434
    .line 435
    const v21, -0x40f33333    # -0.55f

    .line 436
    .line 437
    .line 438
    const/16 v22, 0x0

    .line 439
    .line 440
    const/high16 v23, -0x40800000    # -1.0f

    .line 441
    .line 442
    const v24, 0x3ee66666    # 0.45f

    .line 443
    .line 444
    .line 445
    move-object/from16 v20, v2

    .line 446
    .line 447
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 448
    .line 449
    .line 450
    const/high16 v4, 0x40000000    # 2.0f

    .line 451
    .line 452
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 453
    .line 454
    .line 455
    const/high16 v25, 0x40400000    # 3.0f

    .line 456
    .line 457
    const/high16 v26, 0x40400000    # 3.0f

    .line 458
    .line 459
    const/16 v21, 0x0

    .line 460
    .line 461
    const v22, 0x3fd47ae1    # 1.66f

    .line 462
    .line 463
    .line 464
    const v23, 0x3fab851f    # 1.34f

    .line 465
    .line 466
    .line 467
    const/high16 v24, 0x40400000    # 3.0f

    .line 468
    .line 469
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 470
    .line 471
    .line 472
    const/high16 v4, 0x41400000    # 12.0f

    .line 473
    .line 474
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 475
    .line 476
    .line 477
    const/high16 v26, -0x3fc00000    # -3.0f

    .line 478
    .line 479
    const v21, 0x3fd47ae1    # 1.66f

    .line 480
    .line 481
    .line 482
    const/16 v22, 0x0

    .line 483
    .line 484
    const/high16 v23, 0x40400000    # 3.0f

    .line 485
    .line 486
    const v24, -0x40547ae1    # -1.34f

    .line 487
    .line 488
    .line 489
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 490
    .line 491
    .line 492
    const/high16 v4, 0x40000000    # 2.0f

    .line 493
    .line 494
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 495
    .line 496
    .line 497
    const/high16 v4, 0x419c0000    # 19.5f

    .line 498
    .line 499
    const/high16 v6, 0x40600000    # 3.5f

    .line 500
    .line 501
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 502
    .line 503
    .line 504
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 505
    .line 506
    .line 507
    const/high16 v4, 0x41a00000    # 20.0f

    .line 508
    .line 509
    const/high16 v6, 0x41700000    # 15.0f

    .line 510
    .line 511
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 512
    .line 513
    .line 514
    const/high16 v4, 0x40c00000    # 6.0f

    .line 515
    .line 516
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 517
    .line 518
    .line 519
    const/high16 v25, -0x40800000    # -1.0f

    .line 520
    .line 521
    const/high16 v26, -0x40800000    # -1.0f

    .line 522
    .line 523
    const v21, -0x40f33333    # -0.55f

    .line 524
    .line 525
    .line 526
    const/high16 v23, -0x40800000    # -1.0f

    .line 527
    .line 528
    const v24, -0x4119999a    # -0.45f

    .line 529
    .line 530
    .line 531
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 532
    .line 533
    .line 534
    const/high16 v4, -0x40800000    # -1.0f

    .line 535
    .line 536
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 537
    .line 538
    .line 539
    const/high16 v4, 0x40400000    # 3.0f

    .line 540
    .line 541
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 542
    .line 543
    .line 544
    const/high16 v4, 0x40800000    # 4.0f

    .line 545
    .line 546
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 547
    .line 548
    .line 549
    const/high16 v4, 0x40400000    # 3.0f

    .line 550
    .line 551
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 552
    .line 553
    .line 554
    const/high16 v4, 0x41a00000    # 20.0f

    .line 555
    .line 556
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 557
    .line 558
    .line 559
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 560
    .line 561
    .line 562
    const/high16 v4, 0x41980000    # 19.0f

    .line 563
    .line 564
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 565
    .line 566
    .line 567
    const/high16 v26, 0x3f800000    # 1.0f

    .line 568
    .line 569
    const/16 v21, 0x0

    .line 570
    .line 571
    const v22, 0x3f0ccccd    # 0.55f

    .line 572
    .line 573
    .line 574
    const v23, -0x4119999a    # -0.45f

    .line 575
    .line 576
    .line 577
    const/high16 v24, 0x3f800000    # 1.0f

    .line 578
    .line 579
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 580
    .line 581
    .line 582
    const v4, -0x4119999a    # -0.45f

    .line 583
    .line 584
    .line 585
    const/high16 v6, -0x40800000    # -1.0f

    .line 586
    .line 587
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 588
    .line 589
    .line 590
    const/high16 v4, -0x40000000    # -2.0f

    .line 591
    .line 592
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 593
    .line 594
    .line 595
    const/high16 v26, -0x40800000    # -1.0f

    .line 596
    .line 597
    const v22, -0x40f33333    # -0.55f

    .line 598
    .line 599
    .line 600
    const/high16 v24, -0x40800000    # -1.0f

    .line 601
    .line 602
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 603
    .line 604
    .line 605
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 606
    .line 607
    .line 608
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 609
    .line 610
    .line 611
    const/high16 v4, 0x41000000    # 8.0f

    .line 612
    .line 613
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 614
    .line 615
    .line 616
    const/high16 v4, 0x40a00000    # 5.0f

    .line 617
    .line 618
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 619
    .line 620
    .line 621
    const/high16 v4, 0x41300000    # 11.0f

    .line 622
    .line 623
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 624
    .line 625
    .line 626
    const/high16 v4, 0x41980000    # 19.0f

    .line 627
    .line 628
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 629
    .line 630
    .line 631
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 632
    .line 633
    .line 634
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 635
    .line 636
    .line 637
    move-result-object v2

    .line 638
    const/high16 v6, 0x3f800000    # 1.0f

    .line 639
    .line 640
    const/4 v7, 0x0

    .line 641
    const-string v4, ""

    .line 642
    .line 643
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 644
    .line 645
    .line 646
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 647
    .line 648
    .line 649
    move-result v3

    .line 650
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 651
    .line 652
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 653
    .line 654
    .line 655
    move-result-wide v6

    .line 656
    const/4 v2, 0x0

    .line 657
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 658
    .line 659
    .line 660
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 661
    .line 662
    .line 663
    move-result v10

    .line 664
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 665
    .line 666
    .line 667
    move-result v11

    .line 668
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 669
    .line 670
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 671
    .line 672
    .line 673
    const/high16 v4, 0x41880000    # 17.0f

    .line 674
    .line 675
    const/high16 v6, 0x41000000    # 8.0f

    .line 676
    .line 677
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 678
    .line 679
    .line 680
    const/high16 v4, -0x40800000    # -1.0f

    .line 681
    .line 682
    const/4 v6, 0x0

    .line 683
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 684
    .line 685
    .line 686
    const/high16 v26, 0x40000000    # 2.0f

    .line 687
    .line 688
    const/16 v27, 0x0

    .line 689
    .line 690
    const/high16 v21, 0x3f800000    # 1.0f

    .line 691
    .line 692
    const/high16 v22, 0x3f800000    # 1.0f

    .line 693
    .line 694
    const/16 v23, 0x0

    .line 695
    .line 696
    const/16 v24, 0x1

    .line 697
    .line 698
    const/16 v25, 0x1

    .line 699
    .line 700
    move-object/from16 v20, v2

    .line 701
    .line 702
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 703
    .line 704
    .line 705
    const/high16 v26, -0x40000000    # -2.0f

    .line 706
    .line 707
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 708
    .line 709
    .line 710
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 711
    .line 712
    .line 713
    move-result-object v2

    .line 714
    const/high16 v6, 0x3f800000    # 1.0f

    .line 715
    .line 716
    const/4 v7, 0x0

    .line 717
    const-string v4, ""

    .line 718
    .line 719
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 720
    .line 721
    .line 722
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 723
    .line 724
    .line 725
    move-result v3

    .line 726
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 727
    .line 728
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 729
    .line 730
    .line 731
    move-result-wide v6

    .line 732
    const/4 v0, 0x0

    .line 733
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 734
    .line 735
    .line 736
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 737
    .line 738
    .line 739
    move-result v10

    .line 740
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 741
    .line 742
    .line 743
    move-result v11

    .line 744
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 745
    .line 746
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 747
    .line 748
    .line 749
    const/high16 v0, 0x41880000    # 17.0f

    .line 750
    .line 751
    const/high16 v2, 0x41300000    # 11.0f

    .line 752
    .line 753
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 754
    .line 755
    .line 756
    const/high16 v0, -0x40800000    # -1.0f

    .line 757
    .line 758
    const/4 v2, 0x0

    .line 759
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 760
    .line 761
    .line 762
    const/high16 v18, 0x40000000    # 2.0f

    .line 763
    .line 764
    const/16 v19, 0x0

    .line 765
    .line 766
    const/high16 v13, 0x3f800000    # 1.0f

    .line 767
    .line 768
    const/high16 v14, 0x3f800000    # 1.0f

    .line 769
    .line 770
    const/16 v16, 0x1

    .line 771
    .line 772
    const/16 v17, 0x1

    .line 773
    .line 774
    invoke-virtual/range {v12 .. v19}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 775
    .line 776
    .line 777
    const/high16 v18, -0x40000000    # -2.0f

    .line 778
    .line 779
    invoke-virtual/range {v12 .. v19}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 780
    .line 781
    .line 782
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 783
    .line 784
    .line 785
    move-result-object v2

    .line 786
    const/16 v16, 0x3800

    .line 787
    .line 788
    const/16 v17, 0x0

    .line 789
    .line 790
    const/high16 v6, 0x3f800000    # 1.0f

    .line 791
    .line 792
    const/4 v7, 0x0

    .line 793
    const/high16 v12, 0x3f800000    # 1.0f

    .line 794
    .line 795
    const/4 v13, 0x0

    .line 796
    const/4 v14, 0x0

    .line 797
    const-string v4, ""

    .line 798
    .line 799
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 800
    .line 801
    .line 802
    move-result-object v0

    .line 803
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 804
    .line 805
    .line 806
    move-result-object v0

    .line 807
    sput-object v0, Landroidx/compose/material/icons/rounded/ReceiptLongKt;->_receiptLong:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 808
    .line 809
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 810
    .line 811
    .line 812
    return-object v0
.end method

.method public static synthetic getReceiptLong$annotations(Landroidx/compose/material/icons/Icons$Rounded;)V
    .locals 0
    .annotation runtime Lqc/a;
    .end annotation

    return-void
.end method
