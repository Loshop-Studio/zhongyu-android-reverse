.class public final Landroidx/compose/material/icons/twotone/FiberPinKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _fiberPin:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getFiberPin(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/FiberPinKt;->_fiberPin:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.FiberPin"

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
    const/high16 v4, 0x40a00000    # 5.0f

    .line 71
    .line 72
    const v6, 0x4169eb85    # 14.62f

    .line 73
    .line 74
    .line 75
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    const v4, 0x3fa7ae14    # 1.31f

    .line 79
    .line 80
    .line 81
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 82
    .line 83
    .line 84
    const/high16 v4, -0x40200000    # -1.75f

    .line 85
    .line 86
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 87
    .line 88
    .line 89
    const/high16 v4, 0x3fe00000    # 1.75f

    .line 90
    .line 91
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 92
    .line 93
    .line 94
    const v25, 0x3fa7ae14    # 1.31f

    .line 95
    .line 96
    .line 97
    const v26, -0x405851ec    # -1.31f

    .line 98
    .line 99
    .line 100
    const v21, 0x3f3d70a4    # 0.74f

    .line 101
    .line 102
    .line 103
    const/16 v22, 0x0

    .line 104
    .line 105
    const v23, 0x3fa7ae14    # 1.31f

    .line 106
    .line 107
    .line 108
    const v24, -0x40ee147b    # -0.57f

    .line 109
    .line 110
    .line 111
    move-object/from16 v20, v2

    .line 112
    .line 113
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 114
    .line 115
    .line 116
    const v4, -0x409eb852    # -0.88f

    .line 117
    .line 118
    .line 119
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 120
    .line 121
    .line 122
    const v25, -0x405851ec    # -1.31f

    .line 123
    .line 124
    .line 125
    const/16 v21, 0x0

    .line 126
    .line 127
    const v22, -0x40c28f5c    # -0.74f

    .line 128
    .line 129
    .line 130
    const v23, -0x40ee147b    # -0.57f

    .line 131
    .line 132
    .line 133
    const v24, -0x405851ec    # -1.31f

    .line 134
    .line 135
    .line 136
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 137
    .line 138
    .line 139
    const v4, 0x4115eb85    # 9.37f

    .line 140
    .line 141
    .line 142
    const/high16 v6, 0x40a00000    # 5.0f

    .line 143
    .line 144
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 145
    .line 146
    .line 147
    const/high16 v4, 0x40a80000    # 5.25f

    .line 148
    .line 149
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 150
    .line 151
    .line 152
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 153
    .line 154
    .line 155
    const v4, 0x412b0a3d    # 10.69f

    .line 156
    .line 157
    .line 158
    const v6, 0x40c9eb85    # 6.31f

    .line 159
    .line 160
    .line 161
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 162
    .line 163
    .line 164
    const/high16 v4, 0x3fe00000    # 1.75f

    .line 165
    .line 166
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 167
    .line 168
    .line 169
    const v4, 0x3f6147ae    # 0.88f

    .line 170
    .line 171
    .line 172
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 173
    .line 174
    .line 175
    const v4, 0x41391eb8    # 11.57f

    .line 176
    .line 177
    .line 178
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 179
    .line 180
    .line 181
    const v4, -0x409eb852    # -0.88f

    .line 182
    .line 183
    .line 184
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 185
    .line 186
    .line 187
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 188
    .line 189
    .line 190
    const v4, 0x413570a4    # 11.34f

    .line 191
    .line 192
    .line 193
    const v6, 0x4116147b    # 9.38f

    .line 194
    .line 195
    .line 196
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 197
    .line 198
    .line 199
    const v4, 0x3fa7ae14    # 1.31f

    .line 200
    .line 201
    .line 202
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 203
    .line 204
    .line 205
    const/high16 v4, 0x40a80000    # 5.25f

    .line 206
    .line 207
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 208
    .line 209
    .line 210
    const v4, -0x405851ec    # -1.31f

    .line 211
    .line 212
    .line 213
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 214
    .line 215
    .line 216
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 217
    .line 218
    .line 219
    const v4, 0x4169eb85    # 14.62f

    .line 220
    .line 221
    .line 222
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 223
    .line 224
    .line 225
    const v4, 0x3f8ccccd    # 1.1f

    .line 226
    .line 227
    .line 228
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 229
    .line 230
    .line 231
    const v4, -0x3fbc28f6    # -3.06f

    .line 232
    .line 233
    .line 234
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 235
    .line 236
    .line 237
    const v4, 0x400eb852    # 2.23f

    .line 238
    .line 239
    .line 240
    const v6, 0x4043d70a    # 3.06f

    .line 241
    .line 242
    .line 243
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 244
    .line 245
    .line 246
    const/high16 v4, 0x41980000    # 19.0f

    .line 247
    .line 248
    const v6, 0x4169eb85    # 14.62f

    .line 249
    .line 250
    .line 251
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 252
    .line 253
    .line 254
    const v6, 0x4116147b    # 9.38f

    .line 255
    .line 256
    .line 257
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 258
    .line 259
    .line 260
    const v4, -0x40747ae1    # -1.09f

    .line 261
    .line 262
    .line 263
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 264
    .line 265
    .line 266
    const v4, 0x4043d70a    # 3.06f

    .line 267
    .line 268
    .line 269
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 270
    .line 271
    .line 272
    const v4, -0x3ff3d70a    # -2.19f

    .line 273
    .line 274
    .line 275
    const v6, -0x3fbc28f6    # -3.06f

    .line 276
    .line 277
    .line 278
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 279
    .line 280
    .line 281
    const v4, -0x40733333    # -1.1f

    .line 282
    .line 283
    .line 284
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 285
    .line 286
    .line 287
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 288
    .line 289
    .line 290
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 291
    .line 292
    .line 293
    move-result-object v2

    .line 294
    const/16 v16, 0x3800

    .line 295
    .line 296
    const/16 v17, 0x0

    .line 297
    .line 298
    const/high16 v6, 0x3f800000    # 1.0f

    .line 299
    .line 300
    const/high16 v8, 0x3f800000    # 1.0f

    .line 301
    .line 302
    const/4 v7, 0x0

    .line 303
    const/high16 v9, 0x3f800000    # 1.0f

    .line 304
    .line 305
    const/high16 v12, 0x3f800000    # 1.0f

    .line 306
    .line 307
    const/4 v13, 0x0

    .line 308
    const/4 v14, 0x0

    .line 309
    const/4 v15, 0x0

    .line 310
    const-string v4, ""

    .line 311
    .line 312
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 313
    .line 314
    .line 315
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 316
    .line 317
    .line 318
    move-result v3

    .line 319
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 320
    .line 321
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 322
    .line 323
    .line 324
    move-result-wide v6

    .line 325
    const/4 v2, 0x0

    .line 326
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 327
    .line 328
    .line 329
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 330
    .line 331
    .line 332
    move-result v10

    .line 333
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 334
    .line 335
    .line 336
    move-result v11

    .line 337
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 338
    .line 339
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 340
    .line 341
    .line 342
    const/high16 v4, 0x40c00000    # 6.0f

    .line 343
    .line 344
    const/high16 v6, 0x40800000    # 4.0f

    .line 345
    .line 346
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 347
    .line 348
    .line 349
    const/high16 v4, 0x41800000    # 16.0f

    .line 350
    .line 351
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 352
    .line 353
    .line 354
    const/high16 v4, 0x41400000    # 12.0f

    .line 355
    .line 356
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 357
    .line 358
    .line 359
    const/high16 v4, 0x40800000    # 4.0f

    .line 360
    .line 361
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 362
    .line 363
    .line 364
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 365
    .line 366
    .line 367
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 368
    .line 369
    .line 370
    move-result-object v2

    .line 371
    const v6, 0x3e99999a    # 0.3f

    .line 372
    .line 373
    .line 374
    const v8, 0x3e99999a    # 0.3f

    .line 375
    .line 376
    .line 377
    const/4 v7, 0x0

    .line 378
    const-string v4, ""

    .line 379
    .line 380
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 381
    .line 382
    .line 383
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 384
    .line 385
    .line 386
    move-result v3

    .line 387
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 388
    .line 389
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 390
    .line 391
    .line 392
    move-result-wide v6

    .line 393
    const/4 v0, 0x0

    .line 394
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 395
    .line 396
    .line 397
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 398
    .line 399
    .line 400
    move-result v10

    .line 401
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 402
    .line 403
    .line 404
    move-result v11

    .line 405
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 406
    .line 407
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 408
    .line 409
    .line 410
    const/high16 v0, 0x41a00000    # 20.0f

    .line 411
    .line 412
    const/high16 v2, 0x40800000    # 4.0f

    .line 413
    .line 414
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 415
    .line 416
    .line 417
    const/high16 v0, 0x40800000    # 4.0f

    .line 418
    .line 419
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 420
    .line 421
    .line 422
    const v17, -0x400147ae    # -1.99f

    .line 423
    .line 424
    .line 425
    const/high16 v18, 0x40000000    # 2.0f

    .line 426
    .line 427
    const v13, -0x4071eb85    # -1.11f

    .line 428
    .line 429
    .line 430
    const v15, -0x400147ae    # -1.99f

    .line 431
    .line 432
    .line 433
    const v16, 0x3f63d70a    # 0.89f

    .line 434
    .line 435
    .line 436
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 437
    .line 438
    .line 439
    const/high16 v0, 0x40000000    # 2.0f

    .line 440
    .line 441
    const/high16 v2, 0x41900000    # 18.0f

    .line 442
    .line 443
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 444
    .line 445
    .line 446
    const/high16 v17, 0x40000000    # 2.0f

    .line 447
    .line 448
    const/4 v13, 0x0

    .line 449
    const v14, 0x3f8e147b    # 1.11f

    .line 450
    .line 451
    .line 452
    const v15, 0x3f63d70a    # 0.89f

    .line 453
    .line 454
    .line 455
    const/high16 v16, 0x40000000    # 2.0f

    .line 456
    .line 457
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 458
    .line 459
    .line 460
    const/high16 v0, 0x41800000    # 16.0f

    .line 461
    .line 462
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 463
    .line 464
    .line 465
    const/high16 v18, -0x40000000    # -2.0f

    .line 466
    .line 467
    const v13, 0x3f8e147b    # 1.11f

    .line 468
    .line 469
    .line 470
    const/4 v14, 0x0

    .line 471
    const/high16 v15, 0x40000000    # 2.0f

    .line 472
    .line 473
    const v16, -0x409c28f6    # -0.89f

    .line 474
    .line 475
    .line 476
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 477
    .line 478
    .line 479
    const/high16 v0, 0x41b00000    # 22.0f

    .line 480
    .line 481
    const/high16 v2, 0x40c00000    # 6.0f

    .line 482
    .line 483
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 484
    .line 485
    .line 486
    const/high16 v17, -0x40000000    # -2.0f

    .line 487
    .line 488
    const/4 v13, 0x0

    .line 489
    const v14, -0x4071eb85    # -1.11f

    .line 490
    .line 491
    .line 492
    const v15, -0x409c28f6    # -0.89f

    .line 493
    .line 494
    .line 495
    const/high16 v16, -0x40000000    # -2.0f

    .line 496
    .line 497
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 498
    .line 499
    .line 500
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 501
    .line 502
    .line 503
    const/high16 v0, 0x41a00000    # 20.0f

    .line 504
    .line 505
    const/high16 v2, 0x41900000    # 18.0f

    .line 506
    .line 507
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 508
    .line 509
    .line 510
    const/high16 v0, 0x41900000    # 18.0f

    .line 511
    .line 512
    const/high16 v2, 0x40800000    # 4.0f

    .line 513
    .line 514
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 515
    .line 516
    .line 517
    const/high16 v0, 0x40c00000    # 6.0f

    .line 518
    .line 519
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 520
    .line 521
    .line 522
    const/high16 v0, 0x41800000    # 16.0f

    .line 523
    .line 524
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 525
    .line 526
    .line 527
    const/high16 v0, 0x41400000    # 12.0f

    .line 528
    .line 529
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 530
    .line 531
    .line 532
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 533
    .line 534
    .line 535
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 536
    .line 537
    .line 538
    move-result-object v2

    .line 539
    const/16 v16, 0x3800

    .line 540
    .line 541
    const/16 v17, 0x0

    .line 542
    .line 543
    const/high16 v6, 0x3f800000    # 1.0f

    .line 544
    .line 545
    const/high16 v8, 0x3f800000    # 1.0f

    .line 546
    .line 547
    const/4 v7, 0x0

    .line 548
    const/high16 v12, 0x3f800000    # 1.0f

    .line 549
    .line 550
    const/4 v14, 0x0

    .line 551
    const/4 v15, 0x0

    .line 552
    const-string v4, ""

    .line 553
    .line 554
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 555
    .line 556
    .line 557
    move-result-object v0

    .line 558
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 559
    .line 560
    .line 561
    move-result-object v0

    .line 562
    sput-object v0, Landroidx/compose/material/icons/twotone/FiberPinKt;->_fiberPin:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 563
    .line 564
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 565
    .line 566
    .line 567
    return-object v0
.end method
