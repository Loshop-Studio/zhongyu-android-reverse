.class public final Landroidx/compose/material/icons/twotone/AutoFixHighKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _autoFixHigh:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getAutoFixHigh(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 20

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/AutoFixHighKt;->_autoFixHigh:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.AutoFixHigh"

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
    const v4, 0x408d47ae    # 4.415f

    .line 71
    .line 72
    .line 73
    const v6, 0x41915604    # 18.167f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v4, -0x3f1a8f5c    # -7.17f

    .line 80
    .line 81
    .line 82
    const v6, 0x40e570a4    # 7.17f

    .line 83
    .line 84
    .line 85
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 86
    .line 87
    .line 88
    const v4, 0x3fb4fdf4    # 1.414f

    .line 89
    .line 90
    .line 91
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 92
    .line 93
    .line 94
    const v4, -0x3f1a8f5c    # -7.17f

    .line 95
    .line 96
    .line 97
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 98
    .line 99
    .line 100
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 101
    .line 102
    .line 103
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 104
    .line 105
    .line 106
    move-result-object v2

    .line 107
    const/16 v16, 0x3800

    .line 108
    .line 109
    const/16 v17, 0x0

    .line 110
    .line 111
    const v6, 0x3e99999a    # 0.3f

    .line 112
    .line 113
    .line 114
    const v8, 0x3e99999a    # 0.3f

    .line 115
    .line 116
    .line 117
    const/4 v7, 0x0

    .line 118
    const/high16 v9, 0x3f800000    # 1.0f

    .line 119
    .line 120
    const/high16 v12, 0x3f800000    # 1.0f

    .line 121
    .line 122
    const/4 v13, 0x0

    .line 123
    const/4 v14, 0x0

    .line 124
    const/4 v15, 0x0

    .line 125
    const-string v4, ""

    .line 126
    .line 127
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 128
    .line 129
    .line 130
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 131
    .line 132
    .line 133
    move-result v3

    .line 134
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 135
    .line 136
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 137
    .line 138
    .line 139
    move-result-wide v6

    .line 140
    const/4 v2, 0x0

    .line 141
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 142
    .line 143
    .line 144
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 145
    .line 146
    .line 147
    move-result v10

    .line 148
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 149
    .line 150
    .line 151
    move-result v11

    .line 152
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 153
    .line 154
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 155
    .line 156
    .line 157
    const/high16 v4, 0x40e00000    # 7.0f

    .line 158
    .line 159
    const/high16 v6, 0x41a00000    # 20.0f

    .line 160
    .line 161
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 162
    .line 163
    .line 164
    const v4, 0x3f70a3d7    # 0.94f

    .line 165
    .line 166
    .line 167
    const v6, -0x3ffc28f6    # -2.06f

    .line 168
    .line 169
    .line 170
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 171
    .line 172
    .line 173
    const v4, 0x4003d70a    # 2.06f

    .line 174
    .line 175
    .line 176
    const v6, -0x408f5c29    # -0.94f

    .line 177
    .line 178
    .line 179
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 180
    .line 181
    .line 182
    const v4, -0x408f5c29    # -0.94f

    .line 183
    .line 184
    .line 185
    const v6, -0x3ffc28f6    # -2.06f

    .line 186
    .line 187
    .line 188
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 189
    .line 190
    .line 191
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 192
    .line 193
    .line 194
    const v4, 0x4003d70a    # 2.06f

    .line 195
    .line 196
    .line 197
    const v6, -0x408f5c29    # -0.94f

    .line 198
    .line 199
    .line 200
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 201
    .line 202
    .line 203
    const v4, 0x3f70a3d7    # 0.94f

    .line 204
    .line 205
    .line 206
    const v6, -0x3ffc28f6    # -2.06f

    .line 207
    .line 208
    .line 209
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 210
    .line 211
    .line 212
    const v4, 0x4003d70a    # 2.06f

    .line 213
    .line 214
    .line 215
    const v6, 0x3f70a3d7    # 0.94f

    .line 216
    .line 217
    .line 218
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 219
    .line 220
    .line 221
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 222
    .line 223
    .line 224
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 225
    .line 226
    .line 227
    move-result-object v2

    .line 228
    const/high16 v6, 0x3f800000    # 1.0f

    .line 229
    .line 230
    const/high16 v8, 0x3f800000    # 1.0f

    .line 231
    .line 232
    const/4 v7, 0x0

    .line 233
    const-string v4, ""

    .line 234
    .line 235
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 236
    .line 237
    .line 238
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 239
    .line 240
    .line 241
    move-result v3

    .line 242
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 243
    .line 244
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 245
    .line 246
    .line 247
    move-result-wide v6

    .line 248
    const/4 v2, 0x0

    .line 249
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 250
    .line 251
    .line 252
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 253
    .line 254
    .line 255
    move-result v10

    .line 256
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 257
    .line 258
    .line 259
    move-result v11

    .line 260
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 261
    .line 262
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 263
    .line 264
    .line 265
    const/high16 v4, 0x41080000    # 8.5f

    .line 266
    .line 267
    const/high16 v6, 0x40e00000    # 7.0f

    .line 268
    .line 269
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 270
    .line 271
    .line 272
    const v4, 0x3f70a3d7    # 0.94f

    .line 273
    .line 274
    .line 275
    const v6, -0x3ffc28f6    # -2.06f

    .line 276
    .line 277
    .line 278
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 279
    .line 280
    .line 281
    const v4, 0x4003d70a    # 2.06f

    .line 282
    .line 283
    .line 284
    const v6, -0x408f5c29    # -0.94f

    .line 285
    .line 286
    .line 287
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 288
    .line 289
    .line 290
    const v4, -0x408f5c29    # -0.94f

    .line 291
    .line 292
    .line 293
    const v6, -0x3ffc28f6    # -2.06f

    .line 294
    .line 295
    .line 296
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 297
    .line 298
    .line 299
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 300
    .line 301
    .line 302
    const v4, 0x4003d70a    # 2.06f

    .line 303
    .line 304
    .line 305
    const v6, -0x408f5c29    # -0.94f

    .line 306
    .line 307
    .line 308
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 309
    .line 310
    .line 311
    const v4, 0x3f70a3d7    # 0.94f

    .line 312
    .line 313
    .line 314
    const v6, -0x3ffc28f6    # -2.06f

    .line 315
    .line 316
    .line 317
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 318
    .line 319
    .line 320
    const v4, 0x4003d70a    # 2.06f

    .line 321
    .line 322
    .line 323
    const v6, 0x3f70a3d7    # 0.94f

    .line 324
    .line 325
    .line 326
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 327
    .line 328
    .line 329
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 330
    .line 331
    .line 332
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 333
    .line 334
    .line 335
    move-result-object v2

    .line 336
    const/high16 v6, 0x3f800000    # 1.0f

    .line 337
    .line 338
    const/4 v7, 0x0

    .line 339
    const-string v4, ""

    .line 340
    .line 341
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 342
    .line 343
    .line 344
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 345
    .line 346
    .line 347
    move-result v3

    .line 348
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 349
    .line 350
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 351
    .line 352
    .line 353
    move-result-wide v6

    .line 354
    const/4 v2, 0x0

    .line 355
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 356
    .line 357
    .line 358
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 359
    .line 360
    .line 361
    move-result v10

    .line 362
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 363
    .line 364
    .line 365
    move-result v11

    .line 366
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 367
    .line 368
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 369
    .line 370
    .line 371
    const/high16 v4, 0x41480000    # 12.5f

    .line 372
    .line 373
    const/high16 v6, 0x41a00000    # 20.0f

    .line 374
    .line 375
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 376
    .line 377
    .line 378
    const v4, 0x4003d70a    # 2.06f

    .line 379
    .line 380
    .line 381
    const v6, -0x408f5c29    # -0.94f

    .line 382
    .line 383
    .line 384
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 385
    .line 386
    .line 387
    const v4, 0x3f70a3d7    # 0.94f

    .line 388
    .line 389
    .line 390
    const v6, -0x3ffc28f6    # -2.06f

    .line 391
    .line 392
    .line 393
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 394
    .line 395
    .line 396
    const v4, 0x4003d70a    # 2.06f

    .line 397
    .line 398
    .line 399
    const v6, 0x3f70a3d7    # 0.94f

    .line 400
    .line 401
    .line 402
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 403
    .line 404
    .line 405
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 406
    .line 407
    .line 408
    const v4, 0x3f70a3d7    # 0.94f

    .line 409
    .line 410
    .line 411
    const v6, -0x3ffc28f6    # -2.06f

    .line 412
    .line 413
    .line 414
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 415
    .line 416
    .line 417
    const v4, 0x4003d70a    # 2.06f

    .line 418
    .line 419
    .line 420
    const v6, -0x408f5c29    # -0.94f

    .line 421
    .line 422
    .line 423
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 424
    .line 425
    .line 426
    const v4, -0x408f5c29    # -0.94f

    .line 427
    .line 428
    .line 429
    const v6, -0x3ffc28f6    # -2.06f

    .line 430
    .line 431
    .line 432
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 433
    .line 434
    .line 435
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 436
    .line 437
    .line 438
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 439
    .line 440
    .line 441
    move-result-object v2

    .line 442
    const/high16 v6, 0x3f800000    # 1.0f

    .line 443
    .line 444
    const/4 v7, 0x0

    .line 445
    const-string v4, ""

    .line 446
    .line 447
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 448
    .line 449
    .line 450
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 451
    .line 452
    .line 453
    move-result v3

    .line 454
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 455
    .line 456
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 457
    .line 458
    .line 459
    move-result-wide v6

    .line 460
    const/4 v0, 0x0

    .line 461
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 462
    .line 463
    .line 464
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 465
    .line 466
    .line 467
    move-result v10

    .line 468
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 469
    .line 470
    .line 471
    move-result v11

    .line 472
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 473
    .line 474
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 475
    .line 476
    .line 477
    const v0, 0x418dae14    # 17.71f

    .line 478
    .line 479
    .line 480
    const v2, 0x4111eb85    # 9.12f

    .line 481
    .line 482
    .line 483
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 484
    .line 485
    .line 486
    const v0, -0x3fcae148    # -2.83f

    .line 487
    .line 488
    .line 489
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 490
    .line 491
    .line 492
    const v17, 0x4162b852    # 14.17f

    .line 493
    .line 494
    .line 495
    const/high16 v18, 0x40c00000    # 6.0f

    .line 496
    .line 497
    const v13, 0x416ae148    # 14.68f

    .line 498
    .line 499
    .line 500
    const v14, 0x40c33333    # 6.1f

    .line 501
    .line 502
    .line 503
    const v15, 0x4166e148    # 14.43f

    .line 504
    .line 505
    .line 506
    const/high16 v16, 0x40c00000    # 6.0f

    .line 507
    .line 508
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 509
    .line 510
    .line 511
    const v17, -0x40ca3d71    # -0.71f

    .line 512
    .line 513
    .line 514
    const v18, 0x3e947ae1    # 0.29f

    .line 515
    .line 516
    .line 517
    const v13, -0x417ae148    # -0.26f

    .line 518
    .line 519
    .line 520
    const/4 v14, 0x0

    .line 521
    const v15, -0x40fd70a4    # -0.51f

    .line 522
    .line 523
    .line 524
    const v16, 0x3dcccccd    # 0.1f

    .line 525
    .line 526
    .line 527
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 528
    .line 529
    .line 530
    const v0, 0x40128f5c    # 2.29f

    .line 531
    .line 532
    .line 533
    const v2, 0x418bae14    # 17.46f

    .line 534
    .line 535
    .line 536
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 537
    .line 538
    .line 539
    const/16 v17, 0x0

    .line 540
    .line 541
    const v18, 0x3fb47ae1    # 1.41f

    .line 542
    .line 543
    .line 544
    const v13, -0x413851ec    # -0.39f

    .line 545
    .line 546
    .line 547
    const v14, 0x3ec7ae14    # 0.39f

    .line 548
    .line 549
    .line 550
    const v15, -0x413851ec    # -0.39f

    .line 551
    .line 552
    .line 553
    const v16, 0x3f828f5c    # 1.02f

    .line 554
    .line 555
    .line 556
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 557
    .line 558
    .line 559
    const v0, 0x40351eb8    # 2.83f

    .line 560
    .line 561
    .line 562
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 563
    .line 564
    .line 565
    const v17, 0x40ba8f5c    # 5.83f

    .line 566
    .line 567
    .line 568
    const/high16 v18, 0x41b00000    # 22.0f

    .line 569
    .line 570
    const v13, 0x40aa3d71    # 5.32f

    .line 571
    .line 572
    .line 573
    const v14, 0x41af3333    # 21.9f

    .line 574
    .line 575
    .line 576
    const v15, 0x40b23d71    # 5.57f

    .line 577
    .line 578
    .line 579
    const/high16 v16, 0x41b00000    # 22.0f

    .line 580
    .line 581
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 582
    .line 583
    .line 584
    const v0, 0x3f35c28f    # 0.71f

    .line 585
    .line 586
    .line 587
    const v2, -0x416b851f    # -0.29f

    .line 588
    .line 589
    .line 590
    const v4, 0x3f028f5c    # 0.51f

    .line 591
    .line 592
    .line 593
    const v6, -0x42333333    # -0.1f

    .line 594
    .line 595
    .line 596
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 597
    .line 598
    .line 599
    const v0, 0x4132b852    # 11.17f

    .line 600
    .line 601
    .line 602
    const v2, -0x3ecd47ae    # -11.17f

    .line 603
    .line 604
    .line 605
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 606
    .line 607
    .line 608
    const v17, 0x418dae14    # 17.71f

    .line 609
    .line 610
    .line 611
    const v18, 0x4111eb85    # 9.12f

    .line 612
    .line 613
    .line 614
    const v13, 0x4190cccd    # 18.1f

    .line 615
    .line 616
    .line 617
    const v14, 0x41226666    # 10.15f

    .line 618
    .line 619
    .line 620
    const v15, 0x4190cccd    # 18.1f

    .line 621
    .line 622
    .line 623
    const v16, 0x411828f6    # 9.51f

    .line 624
    .line 625
    .line 626
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 627
    .line 628
    .line 629
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 630
    .line 631
    .line 632
    const v0, 0x419cb852    # 19.59f

    .line 633
    .line 634
    .line 635
    const v2, 0x40ba8f5c    # 5.83f

    .line 636
    .line 637
    .line 638
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 639
    .line 640
    .line 641
    const v0, -0x404b851f    # -1.41f

    .line 642
    .line 643
    .line 644
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 645
    .line 646
    .line 647
    const v0, 0x413970a4    # 11.59f

    .line 648
    .line 649
    .line 650
    const/high16 v2, 0x41300000    # 11.0f

    .line 651
    .line 652
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 653
    .line 654
    .line 655
    const v0, 0x41468f5c    # 12.41f

    .line 656
    .line 657
    .line 658
    const/high16 v2, 0x41500000    # 13.0f

    .line 659
    .line 660
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 661
    .line 662
    .line 663
    const v0, 0x419cb852    # 19.59f

    .line 664
    .line 665
    .line 666
    const v2, 0x40ba8f5c    # 5.83f

    .line 667
    .line 668
    .line 669
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 670
    .line 671
    .line 672
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 673
    .line 674
    .line 675
    const v0, 0x41668f5c    # 14.41f

    .line 676
    .line 677
    .line 678
    const/high16 v2, 0x41300000    # 11.0f

    .line 679
    .line 680
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 681
    .line 682
    .line 683
    const v0, 0x411970a4    # 9.59f

    .line 684
    .line 685
    .line 686
    const/high16 v2, 0x41500000    # 13.0f

    .line 687
    .line 688
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 689
    .line 690
    .line 691
    const v0, 0x3f95c28f    # 1.17f

    .line 692
    .line 693
    .line 694
    const v2, -0x406a3d71    # -1.17f

    .line 695
    .line 696
    .line 697
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 698
    .line 699
    .line 700
    const v0, 0x3fb47ae1    # 1.41f

    .line 701
    .line 702
    .line 703
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 704
    .line 705
    .line 706
    const v0, 0x41668f5c    # 14.41f

    .line 707
    .line 708
    .line 709
    const/high16 v2, 0x41300000    # 11.0f

    .line 710
    .line 711
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 712
    .line 713
    .line 714
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 715
    .line 716
    .line 717
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 718
    .line 719
    .line 720
    move-result-object v2

    .line 721
    const/16 v16, 0x3800

    .line 722
    .line 723
    const/16 v17, 0x0

    .line 724
    .line 725
    const/high16 v6, 0x3f800000    # 1.0f

    .line 726
    .line 727
    const/4 v7, 0x0

    .line 728
    const/high16 v12, 0x3f800000    # 1.0f

    .line 729
    .line 730
    const/4 v13, 0x0

    .line 731
    const/4 v14, 0x0

    .line 732
    const/4 v15, 0x0

    .line 733
    const-string v4, ""

    .line 734
    .line 735
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 736
    .line 737
    .line 738
    move-result-object v0

    .line 739
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 740
    .line 741
    .line 742
    move-result-object v0

    .line 743
    sput-object v0, Landroidx/compose/material/icons/twotone/AutoFixHighKt;->_autoFixHigh:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 744
    .line 745
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 746
    .line 747
    .line 748
    return-object v0
.end method
