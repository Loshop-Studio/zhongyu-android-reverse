.class public final Landroidx/compose/material/icons/twotone/DeviceUnknownKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _deviceUnknown:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getDeviceUnknown(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/DeviceUnknownKt;->_deviceUnknown:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.DeviceUnknown"

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
    const/high16 v4, 0x41980000    # 19.0f

    .line 71
    .line 72
    const/high16 v6, 0x40e00000    # 7.0f

    .line 73
    .line 74
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v4, 0x41200000    # 10.0f

    .line 78
    .line 79
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 80
    .line 81
    .line 82
    const/high16 v4, 0x40a00000    # 5.0f

    .line 83
    .line 84
    const/high16 v6, 0x41880000    # 17.0f

    .line 85
    .line 86
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 87
    .line 88
    .line 89
    const/high16 v6, 0x40e00000    # 7.0f

    .line 90
    .line 91
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 92
    .line 93
    .line 94
    const/high16 v4, 0x41600000    # 14.0f

    .line 95
    .line 96
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 97
    .line 98
    .line 99
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 100
    .line 101
    .line 102
    const/high16 v4, 0x41500000    # 13.0f

    .line 103
    .line 104
    const/high16 v6, 0x41900000    # 18.0f

    .line 105
    .line 106
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 107
    .line 108
    .line 109
    const/high16 v4, -0x40000000    # -2.0f

    .line 110
    .line 111
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 112
    .line 113
    .line 114
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 115
    .line 116
    .line 117
    const/high16 v4, 0x40000000    # 2.0f

    .line 118
    .line 119
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 120
    .line 121
    .line 122
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 123
    .line 124
    .line 125
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 126
    .line 127
    .line 128
    const v4, 0x40d70a3d    # 6.72f

    .line 129
    .line 130
    .line 131
    const/high16 v6, 0x41400000    # 12.0f

    .line 132
    .line 133
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 134
    .line 135
    .line 136
    const/high16 v25, 0x40600000    # 3.5f

    .line 137
    .line 138
    const v26, 0x405e147b    # 3.47f

    .line 139
    .line 140
    .line 141
    const v21, 0x3ffae148    # 1.96f

    .line 142
    .line 143
    .line 144
    const/16 v22, 0x0

    .line 145
    .line 146
    const/high16 v23, 0x40600000    # 3.5f

    .line 147
    .line 148
    const v24, 0x3fc147ae    # 1.51f

    .line 149
    .line 150
    .line 151
    move-object/from16 v20, v2

    .line 152
    .line 153
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 154
    .line 155
    .line 156
    const v25, -0x3fd851ec    # -2.62f

    .line 157
    .line 158
    .line 159
    const v26, 0x408e6666    # 4.45f

    .line 160
    .line 161
    .line 162
    const/16 v21, 0x0

    .line 163
    .line 164
    const v22, 0x4010a3d7    # 2.26f

    .line 165
    .line 166
    .line 167
    const v23, -0x3fd851ec    # -2.62f

    .line 168
    .line 169
    .line 170
    const v24, 0x401f5c29    # 2.49f

    .line 171
    .line 172
    .line 173
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 174
    .line 175
    .line 176
    const v4, -0x401eb852    # -1.76f

    .line 177
    .line 178
    .line 179
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 180
    .line 181
    .line 182
    const v25, 0x402851ec    # 2.63f

    .line 183
    .line 184
    .line 185
    const v26, -0x3f71999a    # -4.45f

    .line 186
    .line 187
    .line 188
    const v22, -0x3fc7ae14    # -2.88f

    .line 189
    .line 190
    .line 191
    const v23, 0x402851ec    # 2.63f

    .line 192
    .line 193
    .line 194
    const v24, -0x3fd33333    # -2.7f

    .line 195
    .line 196
    .line 197
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 198
    .line 199
    .line 200
    const/high16 v25, -0x40200000    # -1.75f

    .line 201
    .line 202
    const/high16 v26, -0x40200000    # -1.75f

    .line 203
    .line 204
    const v22, -0x4091eb85    # -0.93f

    .line 205
    .line 206
    .line 207
    const v23, -0x40ae147b    # -0.82f

    .line 208
    .line 209
    .line 210
    const/high16 v24, -0x40200000    # -1.75f

    .line 211
    .line 212
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 213
    .line 214
    .line 215
    const v4, 0x3f51eb85    # 0.82f

    .line 216
    .line 217
    .line 218
    const/high16 v6, 0x3fe00000    # 1.75f

    .line 219
    .line 220
    const/high16 v7, -0x40200000    # -1.75f

    .line 221
    .line 222
    invoke-virtual {v2, v7, v4, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 223
    .line 224
    .line 225
    const/high16 v4, 0x41080000    # 8.5f

    .line 226
    .line 227
    const v6, 0x41230a3d    # 10.19f

    .line 228
    .line 229
    .line 230
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 231
    .line 232
    .line 233
    const/high16 v25, 0x40600000    # 3.5f

    .line 234
    .line 235
    const v26, -0x3fa1eb85    # -3.47f

    .line 236
    .line 237
    .line 238
    const v22, -0x40066666    # -1.95f

    .line 239
    .line 240
    .line 241
    const v23, 0x3fc51eb8    # 1.54f

    .line 242
    .line 243
    .line 244
    const v24, -0x3fa1eb85    # -3.47f

    .line 245
    .line 246
    .line 247
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 248
    .line 249
    .line 250
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 251
    .line 252
    .line 253
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 254
    .line 255
    .line 256
    move-result-object v2

    .line 257
    const/16 v16, 0x3800

    .line 258
    .line 259
    const/16 v17, 0x0

    .line 260
    .line 261
    const v6, 0x3e99999a    # 0.3f

    .line 262
    .line 263
    .line 264
    const v8, 0x3e99999a    # 0.3f

    .line 265
    .line 266
    .line 267
    const/4 v7, 0x0

    .line 268
    const/high16 v9, 0x3f800000    # 1.0f

    .line 269
    .line 270
    const/high16 v12, 0x3f800000    # 1.0f

    .line 271
    .line 272
    const/4 v13, 0x0

    .line 273
    const/4 v14, 0x0

    .line 274
    const/4 v15, 0x0

    .line 275
    const-string v4, ""

    .line 276
    .line 277
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 278
    .line 279
    .line 280
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 281
    .line 282
    .line 283
    move-result v3

    .line 284
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 285
    .line 286
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 287
    .line 288
    .line 289
    move-result-wide v6

    .line 290
    const/4 v0, 0x0

    .line 291
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 292
    .line 293
    .line 294
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 295
    .line 296
    .line 297
    move-result v10

    .line 298
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 299
    .line 300
    .line 301
    move-result v11

    .line 302
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 303
    .line 304
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 305
    .line 306
    .line 307
    const/high16 v0, 0x41300000    # 11.0f

    .line 308
    .line 309
    const/high16 v2, 0x41800000    # 16.0f

    .line 310
    .line 311
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 312
    .line 313
    .line 314
    const/high16 v0, 0x40000000    # 2.0f

    .line 315
    .line 316
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 317
    .line 318
    .line 319
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 320
    .line 321
    .line 322
    const/high16 v0, -0x40000000    # -2.0f

    .line 323
    .line 324
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 325
    .line 326
    .line 327
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 328
    .line 329
    .line 330
    const/high16 v0, 0x3f800000    # 1.0f

    .line 331
    .line 332
    const/high16 v2, 0x41880000    # 17.0f

    .line 333
    .line 334
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 335
    .line 336
    .line 337
    const/high16 v2, 0x40e00000    # 7.0f

    .line 338
    .line 339
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 340
    .line 341
    .line 342
    const/high16 v17, -0x40000000    # -2.0f

    .line 343
    .line 344
    const/high16 v18, 0x40000000    # 2.0f

    .line 345
    .line 346
    const v13, -0x40733333    # -1.1f

    .line 347
    .line 348
    .line 349
    const/high16 v15, -0x40000000    # -2.0f

    .line 350
    .line 351
    const v16, 0x3f666666    # 0.9f

    .line 352
    .line 353
    .line 354
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 355
    .line 356
    .line 357
    const/high16 v0, 0x41900000    # 18.0f

    .line 358
    .line 359
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 360
    .line 361
    .line 362
    const/high16 v17, 0x40000000    # 2.0f

    .line 363
    .line 364
    const/4 v13, 0x0

    .line 365
    const v14, 0x3f8ccccd    # 1.1f

    .line 366
    .line 367
    .line 368
    const v15, 0x3f666666    # 0.9f

    .line 369
    .line 370
    .line 371
    const/high16 v16, 0x40000000    # 2.0f

    .line 372
    .line 373
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 374
    .line 375
    .line 376
    const/high16 v0, 0x41200000    # 10.0f

    .line 377
    .line 378
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 379
    .line 380
    .line 381
    const/high16 v18, -0x40000000    # -2.0f

    .line 382
    .line 383
    const v13, 0x3f8ccccd    # 1.1f

    .line 384
    .line 385
    .line 386
    const/4 v14, 0x0

    .line 387
    const/high16 v15, 0x40000000    # 2.0f

    .line 388
    .line 389
    const v16, -0x4099999a    # -0.9f

    .line 390
    .line 391
    .line 392
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 393
    .line 394
    .line 395
    const/high16 v0, 0x40400000    # 3.0f

    .line 396
    .line 397
    const/high16 v2, 0x41980000    # 19.0f

    .line 398
    .line 399
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 400
    .line 401
    .line 402
    const/high16 v17, -0x40000000    # -2.0f

    .line 403
    .line 404
    const/4 v13, 0x0

    .line 405
    const v14, -0x40733333    # -1.1f

    .line 406
    .line 407
    .line 408
    const v15, -0x4099999a    # -0.9f

    .line 409
    .line 410
    .line 411
    const/high16 v16, -0x40000000    # -2.0f

    .line 412
    .line 413
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 414
    .line 415
    .line 416
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 417
    .line 418
    .line 419
    const/high16 v0, 0x41880000    # 17.0f

    .line 420
    .line 421
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 422
    .line 423
    .line 424
    const/high16 v0, 0x41980000    # 19.0f

    .line 425
    .line 426
    const/high16 v2, 0x40e00000    # 7.0f

    .line 427
    .line 428
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 429
    .line 430
    .line 431
    const/high16 v0, 0x40a00000    # 5.0f

    .line 432
    .line 433
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 434
    .line 435
    .line 436
    const/high16 v0, 0x41200000    # 10.0f

    .line 437
    .line 438
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 439
    .line 440
    .line 441
    const/high16 v0, 0x41600000    # 14.0f

    .line 442
    .line 443
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 444
    .line 445
    .line 446
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 447
    .line 448
    .line 449
    const v0, 0x41070a3d    # 8.44f

    .line 450
    .line 451
    .line 452
    const/high16 v2, 0x41400000    # 12.0f

    .line 453
    .line 454
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 455
    .line 456
    .line 457
    const/high16 v17, 0x3fe00000    # 1.75f

    .line 458
    .line 459
    const/high16 v18, 0x3fe00000    # 1.75f

    .line 460
    .line 461
    const v13, 0x3f6e147b    # 0.93f

    .line 462
    .line 463
    .line 464
    const/4 v14, 0x0

    .line 465
    const/high16 v15, 0x3fe00000    # 1.75f

    .line 466
    .line 467
    const v16, 0x3f51eb85    # 0.82f

    .line 468
    .line 469
    .line 470
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 471
    .line 472
    .line 473
    const v17, -0x3fd7ae14    # -2.63f

    .line 474
    .line 475
    .line 476
    const v18, 0x408e6666    # 4.45f

    .line 477
    .line 478
    .line 479
    const/4 v13, 0x0

    .line 480
    const/high16 v14, 0x3fe00000    # 1.75f

    .line 481
    .line 482
    const v15, -0x3fd7ae14    # -2.63f

    .line 483
    .line 484
    .line 485
    const v16, 0x3fc8f5c3    # 1.57f

    .line 486
    .line 487
    .line 488
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 489
    .line 490
    .line 491
    const v0, 0x3fe147ae    # 1.76f

    .line 492
    .line 493
    .line 494
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 495
    .line 496
    .line 497
    const v17, 0x4027ae14    # 2.62f

    .line 498
    .line 499
    .line 500
    const v18, -0x3f71999a    # -4.45f

    .line 501
    .line 502
    .line 503
    const v14, -0x40051eb8    # -1.96f

    .line 504
    .line 505
    .line 506
    const v15, 0x4027ae14    # 2.62f

    .line 507
    .line 508
    .line 509
    const v16, -0x3ff3d70a    # -2.19f

    .line 510
    .line 511
    .line 512
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 513
    .line 514
    .line 515
    const/high16 v17, -0x3fa00000    # -3.5f

    .line 516
    .line 517
    const v18, -0x3fa1eb85    # -3.47f

    .line 518
    .line 519
    .line 520
    const v15, -0x403ae148    # -1.54f

    .line 521
    .line 522
    .line 523
    const v16, -0x3fa1eb85    # -3.47f

    .line 524
    .line 525
    .line 526
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 527
    .line 528
    .line 529
    const v0, 0x3fc28f5c    # 1.52f

    .line 530
    .line 531
    .line 532
    const v2, 0x405e147b    # 3.47f

    .line 533
    .line 534
    .line 535
    const/high16 v4, -0x3fa00000    # -3.5f

    .line 536
    .line 537
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 538
    .line 539
    .line 540
    const/high16 v0, 0x3fe00000    # 1.75f

    .line 541
    .line 542
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 543
    .line 544
    .line 545
    const/high16 v17, 0x3fe00000    # 1.75f

    .line 546
    .line 547
    const/high16 v18, -0x40200000    # -1.75f

    .line 548
    .line 549
    const v14, -0x4091eb85    # -0.93f

    .line 550
    .line 551
    .line 552
    const v15, 0x3f51eb85    # 0.82f

    .line 553
    .line 554
    .line 555
    const/high16 v16, -0x40200000    # -1.75f

    .line 556
    .line 557
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 558
    .line 559
    .line 560
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 561
    .line 562
    .line 563
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 564
    .line 565
    .line 566
    move-result-object v2

    .line 567
    const/16 v16, 0x3800

    .line 568
    .line 569
    const/16 v17, 0x0

    .line 570
    .line 571
    const/high16 v6, 0x3f800000    # 1.0f

    .line 572
    .line 573
    const/high16 v8, 0x3f800000    # 1.0f

    .line 574
    .line 575
    const/4 v7, 0x0

    .line 576
    const/high16 v12, 0x3f800000    # 1.0f

    .line 577
    .line 578
    const/4 v14, 0x0

    .line 579
    const/4 v15, 0x0

    .line 580
    const-string v4, ""

    .line 581
    .line 582
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 583
    .line 584
    .line 585
    move-result-object v0

    .line 586
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 587
    .line 588
    .line 589
    move-result-object v0

    .line 590
    sput-object v0, Landroidx/compose/material/icons/twotone/DeviceUnknownKt;->_deviceUnknown:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 591
    .line 592
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 593
    .line 594
    .line 595
    return-object v0
.end method
