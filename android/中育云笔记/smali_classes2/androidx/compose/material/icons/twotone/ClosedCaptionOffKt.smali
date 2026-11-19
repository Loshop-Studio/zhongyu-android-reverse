.class public final Landroidx/compose/material/icons/twotone/ClosedCaptionOffKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _closedCaptionOff:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getClosedCaptionOff(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/ClosedCaptionOffKt;->_closedCaptionOff:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.ClosedCaptionOff"

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
    const/high16 v6, 0x40c00000    # 6.0f

    .line 73
    .line 74
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v4, 0x40a00000    # 5.0f

    .line 78
    .line 79
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 80
    .line 81
    .line 82
    const/high16 v4, 0x41400000    # 12.0f

    .line 83
    .line 84
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 85
    .line 86
    .line 87
    const/high16 v4, 0x41600000    # 14.0f

    .line 88
    .line 89
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 90
    .line 91
    .line 92
    const/high16 v4, 0x40c00000    # 6.0f

    .line 93
    .line 94
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 95
    .line 96
    .line 97
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 98
    .line 99
    .line 100
    const/high16 v4, 0x41300000    # 11.0f

    .line 101
    .line 102
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 103
    .line 104
    .line 105
    const/high16 v4, 0x41180000    # 9.5f

    .line 106
    .line 107
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 108
    .line 109
    .line 110
    const/high16 v4, -0x41000000    # -0.5f

    .line 111
    .line 112
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 113
    .line 114
    .line 115
    const/high16 v4, -0x40000000    # -2.0f

    .line 116
    .line 117
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 118
    .line 119
    .line 120
    const/high16 v4, 0x40400000    # 3.0f

    .line 121
    .line 122
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 123
    .line 124
    .line 125
    const/high16 v4, 0x40000000    # 2.0f

    .line 126
    .line 127
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 128
    .line 129
    .line 130
    const/high16 v4, 0x41500000    # 13.0f

    .line 131
    .line 132
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 133
    .line 134
    .line 135
    const/high16 v4, 0x41300000    # 11.0f

    .line 136
    .line 137
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 138
    .line 139
    .line 140
    const/high16 v4, 0x3f800000    # 1.0f

    .line 141
    .line 142
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 143
    .line 144
    .line 145
    const/high16 v25, -0x40800000    # -1.0f

    .line 146
    .line 147
    const/high16 v26, 0x3f800000    # 1.0f

    .line 148
    .line 149
    const/16 v21, 0x0

    .line 150
    .line 151
    const v22, 0x3f0ccccd    # 0.55f

    .line 152
    .line 153
    .line 154
    const v23, -0x4119999a    # -0.45f

    .line 155
    .line 156
    .line 157
    const/high16 v24, 0x3f800000    # 1.0f

    .line 158
    .line 159
    move-object/from16 v20, v2

    .line 160
    .line 161
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 162
    .line 163
    .line 164
    const/high16 v4, 0x40e00000    # 7.0f

    .line 165
    .line 166
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 167
    .line 168
    .line 169
    const/high16 v26, -0x40800000    # -1.0f

    .line 170
    .line 171
    const v21, -0x40f33333    # -0.55f

    .line 172
    .line 173
    .line 174
    const/16 v22, 0x0

    .line 175
    .line 176
    const/high16 v23, -0x40800000    # -1.0f

    .line 177
    .line 178
    const v24, -0x4119999a    # -0.45f

    .line 179
    .line 180
    .line 181
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 182
    .line 183
    .line 184
    const/high16 v4, -0x3f800000    # -4.0f

    .line 185
    .line 186
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 187
    .line 188
    .line 189
    const/high16 v25, 0x3f800000    # 1.0f

    .line 190
    .line 191
    const/16 v21, 0x0

    .line 192
    .line 193
    const v22, -0x40f33333    # -0.55f

    .line 194
    .line 195
    .line 196
    const v23, 0x3ee66666    # 0.45f

    .line 197
    .line 198
    .line 199
    const/high16 v24, -0x40800000    # -1.0f

    .line 200
    .line 201
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 202
    .line 203
    .line 204
    const/high16 v4, 0x40400000    # 3.0f

    .line 205
    .line 206
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 207
    .line 208
    .line 209
    const/high16 v26, 0x3f800000    # 1.0f

    .line 210
    .line 211
    const v21, 0x3f0ccccd    # 0.55f

    .line 212
    .line 213
    .line 214
    const/16 v22, 0x0

    .line 215
    .line 216
    const/high16 v23, 0x3f800000    # 1.0f

    .line 217
    .line 218
    const v24, 0x3ee66666    # 0.45f

    .line 219
    .line 220
    .line 221
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 222
    .line 223
    .line 224
    const/high16 v4, 0x41300000    # 11.0f

    .line 225
    .line 226
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 227
    .line 228
    .line 229
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 230
    .line 231
    .line 232
    const/high16 v4, 0x41900000    # 18.0f

    .line 233
    .line 234
    const/high16 v6, 0x41300000    # 11.0f

    .line 235
    .line 236
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 237
    .line 238
    .line 239
    const/high16 v4, -0x40400000    # -1.5f

    .line 240
    .line 241
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 242
    .line 243
    .line 244
    const/high16 v4, -0x41000000    # -0.5f

    .line 245
    .line 246
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 247
    .line 248
    .line 249
    const/high16 v4, -0x40000000    # -2.0f

    .line 250
    .line 251
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 252
    .line 253
    .line 254
    const/high16 v4, 0x40400000    # 3.0f

    .line 255
    .line 256
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 257
    .line 258
    .line 259
    const/high16 v4, 0x40000000    # 2.0f

    .line 260
    .line 261
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 262
    .line 263
    .line 264
    const/high16 v4, 0x41500000    # 13.0f

    .line 265
    .line 266
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 267
    .line 268
    .line 269
    const/high16 v4, 0x41900000    # 18.0f

    .line 270
    .line 271
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 272
    .line 273
    .line 274
    const/high16 v4, 0x3f800000    # 1.0f

    .line 275
    .line 276
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 277
    .line 278
    .line 279
    const/high16 v25, -0x40800000    # -1.0f

    .line 280
    .line 281
    const/16 v21, 0x0

    .line 282
    .line 283
    const v22, 0x3f0ccccd    # 0.55f

    .line 284
    .line 285
    .line 286
    const v23, -0x4119999a    # -0.45f

    .line 287
    .line 288
    .line 289
    const/high16 v24, 0x3f800000    # 1.0f

    .line 290
    .line 291
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 292
    .line 293
    .line 294
    const/high16 v4, -0x3fc00000    # -3.0f

    .line 295
    .line 296
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 297
    .line 298
    .line 299
    const/high16 v26, -0x40800000    # -1.0f

    .line 300
    .line 301
    const v21, -0x40f33333    # -0.55f

    .line 302
    .line 303
    .line 304
    const/16 v22, 0x0

    .line 305
    .line 306
    const/high16 v23, -0x40800000    # -1.0f

    .line 307
    .line 308
    const v24, -0x4119999a    # -0.45f

    .line 309
    .line 310
    .line 311
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 312
    .line 313
    .line 314
    const/high16 v4, -0x3f800000    # -4.0f

    .line 315
    .line 316
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 317
    .line 318
    .line 319
    const/high16 v25, 0x3f800000    # 1.0f

    .line 320
    .line 321
    const/16 v21, 0x0

    .line 322
    .line 323
    const v22, -0x40f33333    # -0.55f

    .line 324
    .line 325
    .line 326
    const v23, 0x3ee66666    # 0.45f

    .line 327
    .line 328
    .line 329
    const/high16 v24, -0x40800000    # -1.0f

    .line 330
    .line 331
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 332
    .line 333
    .line 334
    const/high16 v4, 0x40400000    # 3.0f

    .line 335
    .line 336
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 337
    .line 338
    .line 339
    const/high16 v26, 0x3f800000    # 1.0f

    .line 340
    .line 341
    const v21, 0x3f0ccccd    # 0.55f

    .line 342
    .line 343
    .line 344
    const/16 v22, 0x0

    .line 345
    .line 346
    const/high16 v23, 0x3f800000    # 1.0f

    .line 347
    .line 348
    const v24, 0x3ee66666    # 0.45f

    .line 349
    .line 350
    .line 351
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 352
    .line 353
    .line 354
    const/high16 v4, 0x41300000    # 11.0f

    .line 355
    .line 356
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 357
    .line 358
    .line 359
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 360
    .line 361
    .line 362
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 363
    .line 364
    .line 365
    move-result-object v2

    .line 366
    const/16 v16, 0x3800

    .line 367
    .line 368
    const/16 v17, 0x0

    .line 369
    .line 370
    const v6, 0x3e99999a    # 0.3f

    .line 371
    .line 372
    .line 373
    const v8, 0x3e99999a    # 0.3f

    .line 374
    .line 375
    .line 376
    const/4 v7, 0x0

    .line 377
    const/high16 v9, 0x3f800000    # 1.0f

    .line 378
    .line 379
    const/high16 v12, 0x3f800000    # 1.0f

    .line 380
    .line 381
    const/4 v13, 0x0

    .line 382
    const/4 v14, 0x0

    .line 383
    const/4 v15, 0x0

    .line 384
    const-string v4, ""

    .line 385
    .line 386
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 387
    .line 388
    .line 389
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 390
    .line 391
    .line 392
    move-result v3

    .line 393
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 394
    .line 395
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 396
    .line 397
    .line 398
    move-result-wide v6

    .line 399
    const/4 v2, 0x0

    .line 400
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 401
    .line 402
    .line 403
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 404
    .line 405
    .line 406
    move-result v10

    .line 407
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 408
    .line 409
    .line 410
    move-result v11

    .line 411
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 412
    .line 413
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 414
    .line 415
    .line 416
    const/high16 v4, 0x41a00000    # 20.0f

    .line 417
    .line 418
    const/high16 v6, 0x40a00000    # 5.0f

    .line 419
    .line 420
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 421
    .line 422
    .line 423
    const/high16 v4, 0x41600000    # 14.0f

    .line 424
    .line 425
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 426
    .line 427
    .line 428
    const/high16 v25, 0x40000000    # 2.0f

    .line 429
    .line 430
    const/high16 v26, -0x40000000    # -2.0f

    .line 431
    .line 432
    const v21, 0x3f8ccccd    # 1.1f

    .line 433
    .line 434
    .line 435
    const/high16 v23, 0x40000000    # 2.0f

    .line 436
    .line 437
    const v24, -0x4099999a    # -0.9f

    .line 438
    .line 439
    .line 440
    move-object/from16 v20, v2

    .line 441
    .line 442
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 443
    .line 444
    .line 445
    const/high16 v4, 0x40c00000    # 6.0f

    .line 446
    .line 447
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 448
    .line 449
    .line 450
    const/high16 v25, -0x40000000    # -2.0f

    .line 451
    .line 452
    const/16 v21, 0x0

    .line 453
    .line 454
    const v22, -0x40733333    # -1.1f

    .line 455
    .line 456
    .line 457
    const v23, -0x4099999a    # -0.9f

    .line 458
    .line 459
    .line 460
    const/high16 v24, -0x40000000    # -2.0f

    .line 461
    .line 462
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 463
    .line 464
    .line 465
    const/high16 v4, 0x40a00000    # 5.0f

    .line 466
    .line 467
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 468
    .line 469
    .line 470
    const/high16 v25, 0x40400000    # 3.0f

    .line 471
    .line 472
    const/high16 v26, 0x40c00000    # 6.0f

    .line 473
    .line 474
    const v21, 0x4078f5c3    # 3.89f

    .line 475
    .line 476
    .line 477
    const/high16 v22, 0x40800000    # 4.0f

    .line 478
    .line 479
    const/high16 v23, 0x40400000    # 3.0f

    .line 480
    .line 481
    const v24, 0x409ccccd    # 4.9f

    .line 482
    .line 483
    .line 484
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 485
    .line 486
    .line 487
    const/high16 v4, 0x41400000    # 12.0f

    .line 488
    .line 489
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 490
    .line 491
    .line 492
    const/high16 v25, 0x40a00000    # 5.0f

    .line 493
    .line 494
    const/high16 v26, 0x41a00000    # 20.0f

    .line 495
    .line 496
    const/high16 v21, 0x40400000    # 3.0f

    .line 497
    .line 498
    const v22, 0x4198cccd    # 19.1f

    .line 499
    .line 500
    .line 501
    const v23, 0x4078f5c3    # 3.89f

    .line 502
    .line 503
    .line 504
    const/high16 v24, 0x41a00000    # 20.0f

    .line 505
    .line 506
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 507
    .line 508
    .line 509
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 510
    .line 511
    .line 512
    const/high16 v4, 0x40a00000    # 5.0f

    .line 513
    .line 514
    const/high16 v6, 0x40c00000    # 6.0f

    .line 515
    .line 516
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 517
    .line 518
    .line 519
    const/high16 v4, 0x41600000    # 14.0f

    .line 520
    .line 521
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 522
    .line 523
    .line 524
    const/high16 v4, 0x41400000    # 12.0f

    .line 525
    .line 526
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 527
    .line 528
    .line 529
    const/high16 v4, 0x40a00000    # 5.0f

    .line 530
    .line 531
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 532
    .line 533
    .line 534
    const/high16 v4, 0x40c00000    # 6.0f

    .line 535
    .line 536
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 537
    .line 538
    .line 539
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 540
    .line 541
    .line 542
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 543
    .line 544
    .line 545
    move-result-object v2

    .line 546
    const/high16 v6, 0x3f800000    # 1.0f

    .line 547
    .line 548
    const/high16 v8, 0x3f800000    # 1.0f

    .line 549
    .line 550
    const/4 v7, 0x0

    .line 551
    const-string v4, ""

    .line 552
    .line 553
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 554
    .line 555
    .line 556
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 557
    .line 558
    .line 559
    move-result v3

    .line 560
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 561
    .line 562
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 563
    .line 564
    .line 565
    move-result-wide v6

    .line 566
    const/4 v2, 0x0

    .line 567
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 568
    .line 569
    .line 570
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 571
    .line 572
    .line 573
    move-result v10

    .line 574
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 575
    .line 576
    .line 577
    move-result v11

    .line 578
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 579
    .line 580
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 581
    .line 582
    .line 583
    const/high16 v4, 0x41200000    # 10.0f

    .line 584
    .line 585
    const/high16 v6, 0x41100000    # 9.0f

    .line 586
    .line 587
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 588
    .line 589
    .line 590
    const/high16 v4, 0x40e00000    # 7.0f

    .line 591
    .line 592
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 593
    .line 594
    .line 595
    const/high16 v25, -0x40800000    # -1.0f

    .line 596
    .line 597
    const/high16 v26, 0x3f800000    # 1.0f

    .line 598
    .line 599
    const v21, -0x40f33333    # -0.55f

    .line 600
    .line 601
    .line 602
    const/16 v22, 0x0

    .line 603
    .line 604
    const/high16 v23, -0x40800000    # -1.0f

    .line 605
    .line 606
    const v24, 0x3ee66666    # 0.45f

    .line 607
    .line 608
    .line 609
    move-object/from16 v20, v2

    .line 610
    .line 611
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 612
    .line 613
    .line 614
    const/high16 v4, 0x40800000    # 4.0f

    .line 615
    .line 616
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 617
    .line 618
    .line 619
    const/high16 v25, 0x3f800000    # 1.0f

    .line 620
    .line 621
    const/16 v21, 0x0

    .line 622
    .line 623
    const v22, 0x3f0ccccd    # 0.55f

    .line 624
    .line 625
    .line 626
    const v23, 0x3ee66666    # 0.45f

    .line 627
    .line 628
    .line 629
    const/high16 v24, 0x3f800000    # 1.0f

    .line 630
    .line 631
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 632
    .line 633
    .line 634
    const/high16 v4, 0x40400000    # 3.0f

    .line 635
    .line 636
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 637
    .line 638
    .line 639
    const/high16 v26, -0x40800000    # -1.0f

    .line 640
    .line 641
    const v21, 0x3f0ccccd    # 0.55f

    .line 642
    .line 643
    .line 644
    const/16 v22, 0x0

    .line 645
    .line 646
    const/high16 v23, 0x3f800000    # 1.0f

    .line 647
    .line 648
    const v24, -0x4119999a    # -0.45f

    .line 649
    .line 650
    .line 651
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 652
    .line 653
    .line 654
    const/high16 v4, -0x40800000    # -1.0f

    .line 655
    .line 656
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 657
    .line 658
    .line 659
    const/high16 v4, 0x41180000    # 9.5f

    .line 660
    .line 661
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 662
    .line 663
    .line 664
    const/high16 v4, 0x3f000000    # 0.5f

    .line 665
    .line 666
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 667
    .line 668
    .line 669
    const/high16 v4, -0x40000000    # -2.0f

    .line 670
    .line 671
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 672
    .line 673
    .line 674
    const/high16 v4, -0x3fc00000    # -3.0f

    .line 675
    .line 676
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 677
    .line 678
    .line 679
    const/high16 v4, 0x40000000    # 2.0f

    .line 680
    .line 681
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 682
    .line 683
    .line 684
    const/high16 v4, 0x41300000    # 11.0f

    .line 685
    .line 686
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 687
    .line 688
    .line 689
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 690
    .line 691
    .line 692
    const/high16 v4, -0x40800000    # -1.0f

    .line 693
    .line 694
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 695
    .line 696
    .line 697
    const/high16 v25, 0x41200000    # 10.0f

    .line 698
    .line 699
    const/high16 v26, 0x41100000    # 9.0f

    .line 700
    .line 701
    const/high16 v21, 0x41300000    # 11.0f

    .line 702
    .line 703
    const v22, 0x41173333    # 9.45f

    .line 704
    .line 705
    .line 706
    const v23, 0x4128cccd    # 10.55f

    .line 707
    .line 708
    .line 709
    const/high16 v24, 0x41100000    # 9.0f

    .line 710
    .line 711
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 712
    .line 713
    .line 714
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 715
    .line 716
    .line 717
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 718
    .line 719
    .line 720
    move-result-object v2

    .line 721
    const/high16 v6, 0x3f800000    # 1.0f

    .line 722
    .line 723
    const/4 v7, 0x0

    .line 724
    const-string v4, ""

    .line 725
    .line 726
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 727
    .line 728
    .line 729
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 730
    .line 731
    .line 732
    move-result v3

    .line 733
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 734
    .line 735
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 736
    .line 737
    .line 738
    move-result-wide v6

    .line 739
    const/4 v0, 0x0

    .line 740
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 741
    .line 742
    .line 743
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 744
    .line 745
    .line 746
    move-result v10

    .line 747
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 748
    .line 749
    .line 750
    move-result v11

    .line 751
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 752
    .line 753
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 754
    .line 755
    .line 756
    const/high16 v0, 0x41880000    # 17.0f

    .line 757
    .line 758
    const/high16 v2, 0x41100000    # 9.0f

    .line 759
    .line 760
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 761
    .line 762
    .line 763
    const/high16 v0, -0x3fc00000    # -3.0f

    .line 764
    .line 765
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 766
    .line 767
    .line 768
    const/high16 v17, -0x40800000    # -1.0f

    .line 769
    .line 770
    const/high16 v18, 0x3f800000    # 1.0f

    .line 771
    .line 772
    const v13, -0x40f33333    # -0.55f

    .line 773
    .line 774
    .line 775
    const/high16 v15, -0x40800000    # -1.0f

    .line 776
    .line 777
    const v16, 0x3ee66666    # 0.45f

    .line 778
    .line 779
    .line 780
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 781
    .line 782
    .line 783
    const/high16 v0, 0x40800000    # 4.0f

    .line 784
    .line 785
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 786
    .line 787
    .line 788
    const/high16 v17, 0x3f800000    # 1.0f

    .line 789
    .line 790
    const/4 v13, 0x0

    .line 791
    const v14, 0x3f0ccccd    # 0.55f

    .line 792
    .line 793
    .line 794
    const v15, 0x3ee66666    # 0.45f

    .line 795
    .line 796
    .line 797
    const/high16 v16, 0x3f800000    # 1.0f

    .line 798
    .line 799
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 800
    .line 801
    .line 802
    const/high16 v0, 0x40400000    # 3.0f

    .line 803
    .line 804
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 805
    .line 806
    .line 807
    const/high16 v18, -0x40800000    # -1.0f

    .line 808
    .line 809
    const v13, 0x3f0ccccd    # 0.55f

    .line 810
    .line 811
    .line 812
    const/4 v14, 0x0

    .line 813
    const/high16 v15, 0x3f800000    # 1.0f

    .line 814
    .line 815
    const v16, -0x4119999a    # -0.45f

    .line 816
    .line 817
    .line 818
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 819
    .line 820
    .line 821
    const/high16 v0, -0x40800000    # -1.0f

    .line 822
    .line 823
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 824
    .line 825
    .line 826
    const/high16 v0, -0x40400000    # -1.5f

    .line 827
    .line 828
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 829
    .line 830
    .line 831
    const/high16 v0, 0x3f000000    # 0.5f

    .line 832
    .line 833
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 834
    .line 835
    .line 836
    const/high16 v0, -0x40000000    # -2.0f

    .line 837
    .line 838
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 839
    .line 840
    .line 841
    const/high16 v0, -0x3fc00000    # -3.0f

    .line 842
    .line 843
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 844
    .line 845
    .line 846
    const/high16 v0, 0x40000000    # 2.0f

    .line 847
    .line 848
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 849
    .line 850
    .line 851
    const/high16 v0, 0x41300000    # 11.0f

    .line 852
    .line 853
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 854
    .line 855
    .line 856
    const/high16 v0, 0x41900000    # 18.0f

    .line 857
    .line 858
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 859
    .line 860
    .line 861
    const/high16 v0, -0x40800000    # -1.0f

    .line 862
    .line 863
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 864
    .line 865
    .line 866
    const/high16 v17, 0x41880000    # 17.0f

    .line 867
    .line 868
    const/high16 v18, 0x41100000    # 9.0f

    .line 869
    .line 870
    const/high16 v13, 0x41900000    # 18.0f

    .line 871
    .line 872
    const v14, 0x41173333    # 9.45f

    .line 873
    .line 874
    .line 875
    const v15, 0x418c6666    # 17.55f

    .line 876
    .line 877
    .line 878
    const/high16 v16, 0x41100000    # 9.0f

    .line 879
    .line 880
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 881
    .line 882
    .line 883
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 884
    .line 885
    .line 886
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 887
    .line 888
    .line 889
    move-result-object v2

    .line 890
    const/16 v16, 0x3800

    .line 891
    .line 892
    const/16 v17, 0x0

    .line 893
    .line 894
    const/high16 v6, 0x3f800000    # 1.0f

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
    sput-object v0, Landroidx/compose/material/icons/twotone/ClosedCaptionOffKt;->_closedCaptionOff:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 913
    .line 914
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 915
    .line 916
    .line 917
    return-object v0
.end method
