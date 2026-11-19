.class public final Landroidx/compose/material/icons/twotone/MovieFilterKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _movieFilter:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getMovieFilter(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 20

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/MovieFilterKt;->_movieFilter:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.MovieFilter"

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
    const v4, 0x41850a3d    # 16.63f

    .line 71
    .line 72
    .line 73
    const v6, 0x4135eb85    # 11.37f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const/high16 v4, 0x41900000    # 18.0f

    .line 80
    .line 81
    const/high16 v6, 0x41400000    # 12.0f

    .line 82
    .line 83
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 84
    .line 85
    .line 86
    const v4, 0x3f2147ae    # 0.63f

    .line 87
    .line 88
    .line 89
    const v6, -0x4050a3d7    # -1.37f

    .line 90
    .line 91
    .line 92
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 93
    .line 94
    .line 95
    const/high16 v4, 0x41600000    # 14.0f

    .line 96
    .line 97
    const/high16 v6, 0x41800000    # 16.0f

    .line 98
    .line 99
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 100
    .line 101
    .line 102
    const v4, -0x40deb852    # -0.63f

    .line 103
    .line 104
    .line 105
    const v6, -0x4050a3d7    # -1.37f

    .line 106
    .line 107
    .line 108
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 109
    .line 110
    .line 111
    const/high16 v4, 0x41400000    # 12.0f

    .line 112
    .line 113
    const/high16 v6, 0x41600000    # 14.0f

    .line 114
    .line 115
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 116
    .line 117
    .line 118
    const v4, 0x3faf5c29    # 1.37f

    .line 119
    .line 120
    .line 121
    const v6, -0x40deb852    # -0.63f

    .line 122
    .line 123
    .line 124
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 125
    .line 126
    .line 127
    const/high16 v4, 0x41800000    # 16.0f

    .line 128
    .line 129
    const/high16 v6, 0x41200000    # 10.0f

    .line 130
    .line 131
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 132
    .line 133
    .line 134
    const v4, 0x40b8a3d7    # 5.77f

    .line 135
    .line 136
    .line 137
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 138
    .line 139
    .line 140
    const v4, 0x40cf0a3d    # 6.47f

    .line 141
    .line 142
    .line 143
    const v6, 0x408051ec    # 4.01f

    .line 144
    .line 145
    .line 146
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 147
    .line 148
    .line 149
    const v4, 0x408051ec    # 4.01f

    .line 150
    .line 151
    .line 152
    const/high16 v6, 0x41900000    # 18.0f

    .line 153
    .line 154
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 155
    .line 156
    .line 157
    const/high16 v4, 0x41800000    # 16.0f

    .line 158
    .line 159
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 160
    .line 161
    .line 162
    const/high16 v4, -0x3f000000    # -8.0f

    .line 163
    .line 164
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 165
    .line 166
    .line 167
    const/high16 v4, 0x41800000    # 16.0f

    .line 168
    .line 169
    const/high16 v6, 0x41200000    # 10.0f

    .line 170
    .line 171
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 172
    .line 173
    .line 174
    const v4, 0x3faf5c29    # 1.37f

    .line 175
    .line 176
    .line 177
    const v6, 0x3f2147ae    # 0.63f

    .line 178
    .line 179
    .line 180
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 181
    .line 182
    .line 183
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 184
    .line 185
    .line 186
    const v4, 0x412f0a3d    # 10.94f

    .line 187
    .line 188
    .line 189
    const v6, 0x416f0a3d    # 14.94f

    .line 190
    .line 191
    .line 192
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 193
    .line 194
    .line 195
    const/high16 v4, 0x41880000    # 17.0f

    .line 196
    .line 197
    const/high16 v6, 0x41200000    # 10.0f

    .line 198
    .line 199
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 200
    .line 201
    .line 202
    const v4, -0x3ffc28f6    # -2.06f

    .line 203
    .line 204
    .line 205
    const v6, -0x408f5c29    # -0.94f

    .line 206
    .line 207
    .line 208
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 209
    .line 210
    .line 211
    const/high16 v4, 0x40e00000    # 7.0f

    .line 212
    .line 213
    const/high16 v6, 0x41600000    # 14.0f

    .line 214
    .line 215
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 216
    .line 217
    .line 218
    const v4, 0x4003d70a    # 2.06f

    .line 219
    .line 220
    .line 221
    const v6, -0x408f5c29    # -0.94f

    .line 222
    .line 223
    .line 224
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 225
    .line 226
    .line 227
    const/high16 v4, 0x41300000    # 11.0f

    .line 228
    .line 229
    const/high16 v6, 0x41200000    # 10.0f

    .line 230
    .line 231
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 232
    .line 233
    .line 234
    const v4, 0x3f70a3d7    # 0.94f

    .line 235
    .line 236
    .line 237
    const v6, 0x4003d70a    # 2.06f

    .line 238
    .line 239
    .line 240
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 241
    .line 242
    .line 243
    const/high16 v4, 0x41500000    # 13.0f

    .line 244
    .line 245
    const/high16 v6, 0x41600000    # 14.0f

    .line 246
    .line 247
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 248
    .line 249
    .line 250
    const v4, 0x3f70a3d7    # 0.94f

    .line 251
    .line 252
    .line 253
    const v6, -0x3ffc28f6    # -2.06f

    .line 254
    .line 255
    .line 256
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 257
    .line 258
    .line 259
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 260
    .line 261
    .line 262
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 263
    .line 264
    .line 265
    move-result-object v2

    .line 266
    const/16 v16, 0x3800

    .line 267
    .line 268
    const/16 v17, 0x0

    .line 269
    .line 270
    const v6, 0x3e99999a    # 0.3f

    .line 271
    .line 272
    .line 273
    const v8, 0x3e99999a    # 0.3f

    .line 274
    .line 275
    .line 276
    const/4 v7, 0x0

    .line 277
    const/high16 v9, 0x3f800000    # 1.0f

    .line 278
    .line 279
    const/high16 v12, 0x3f800000    # 1.0f

    .line 280
    .line 281
    const/4 v13, 0x0

    .line 282
    const/4 v14, 0x0

    .line 283
    const/4 v15, 0x0

    .line 284
    const-string v4, ""

    .line 285
    .line 286
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 287
    .line 288
    .line 289
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 290
    .line 291
    .line 292
    move-result v3

    .line 293
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 294
    .line 295
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 296
    .line 297
    .line 298
    move-result-wide v6

    .line 299
    const/4 v0, 0x0

    .line 300
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 301
    .line 302
    .line 303
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 304
    .line 305
    .line 306
    move-result v10

    .line 307
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 308
    .line 309
    .line 310
    move-result v11

    .line 311
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 312
    .line 313
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 314
    .line 315
    .line 316
    const/high16 v0, 0x41300000    # 11.0f

    .line 317
    .line 318
    const/high16 v2, 0x41200000    # 10.0f

    .line 319
    .line 320
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 321
    .line 322
    .line 323
    const v0, 0x4003d70a    # 2.06f

    .line 324
    .line 325
    .line 326
    const v2, -0x408f5c29    # -0.94f

    .line 327
    .line 328
    .line 329
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 330
    .line 331
    .line 332
    const/high16 v0, 0x40e00000    # 7.0f

    .line 333
    .line 334
    const/high16 v2, 0x41600000    # 14.0f

    .line 335
    .line 336
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 337
    .line 338
    .line 339
    const v0, 0x3f70a3d7    # 0.94f

    .line 340
    .line 341
    .line 342
    const v2, 0x4003d70a    # 2.06f

    .line 343
    .line 344
    .line 345
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 346
    .line 347
    .line 348
    const/high16 v0, 0x41880000    # 17.0f

    .line 349
    .line 350
    const/high16 v2, 0x41200000    # 10.0f

    .line 351
    .line 352
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 353
    .line 354
    .line 355
    const v0, 0x3f70a3d7    # 0.94f

    .line 356
    .line 357
    .line 358
    const v2, -0x3ffc28f6    # -2.06f

    .line 359
    .line 360
    .line 361
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 362
    .line 363
    .line 364
    const/high16 v0, 0x41500000    # 13.0f

    .line 365
    .line 366
    const/high16 v2, 0x41600000    # 14.0f

    .line 367
    .line 368
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 369
    .line 370
    .line 371
    const v0, -0x3ffc28f6    # -2.06f

    .line 372
    .line 373
    .line 374
    const v2, -0x408f5c29    # -0.94f

    .line 375
    .line 376
    .line 377
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 378
    .line 379
    .line 380
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 381
    .line 382
    .line 383
    const v0, 0x4190147b    # 18.01f

    .line 384
    .line 385
    .line 386
    const/high16 v2, 0x40800000    # 4.0f

    .line 387
    .line 388
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 389
    .line 390
    .line 391
    const/high16 v0, 0x40000000    # 2.0f

    .line 392
    .line 393
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 394
    .line 395
    .line 396
    const/high16 v0, -0x3fc00000    # -3.0f

    .line 397
    .line 398
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 399
    .line 400
    .line 401
    const/high16 v0, -0x3f800000    # -4.0f

    .line 402
    .line 403
    const/high16 v2, -0x40000000    # -2.0f

    .line 404
    .line 405
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 406
    .line 407
    .line 408
    const/high16 v0, -0x40000000    # -2.0f

    .line 409
    .line 410
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 411
    .line 412
    .line 413
    const/high16 v0, 0x40000000    # 2.0f

    .line 414
    .line 415
    const/high16 v2, 0x40800000    # 4.0f

    .line 416
    .line 417
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 418
    .line 419
    .line 420
    const/high16 v0, -0x3fc00000    # -3.0f

    .line 421
    .line 422
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 423
    .line 424
    .line 425
    const/high16 v0, -0x3f800000    # -4.0f

    .line 426
    .line 427
    const/high16 v2, -0x40000000    # -2.0f

    .line 428
    .line 429
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 430
    .line 431
    .line 432
    const/high16 v0, -0x40000000    # -2.0f

    .line 433
    .line 434
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 435
    .line 436
    .line 437
    const/high16 v0, 0x40000000    # 2.0f

    .line 438
    .line 439
    const/high16 v2, 0x40800000    # 4.0f

    .line 440
    .line 441
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 442
    .line 443
    .line 444
    const/high16 v0, -0x3fc00000    # -3.0f

    .line 445
    .line 446
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 447
    .line 448
    .line 449
    const/high16 v0, -0x3f800000    # -4.0f

    .line 450
    .line 451
    const/high16 v2, -0x40000000    # -2.0f

    .line 452
    .line 453
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 454
    .line 455
    .line 456
    const/high16 v0, -0x40800000    # -1.0f

    .line 457
    .line 458
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 459
    .line 460
    .line 461
    const v17, -0x400147ae    # -1.99f

    .line 462
    .line 463
    .line 464
    const/high16 v18, 0x40000000    # 2.0f

    .line 465
    .line 466
    const v13, -0x40733333    # -1.1f

    .line 467
    .line 468
    .line 469
    const v15, -0x400147ae    # -1.99f

    .line 470
    .line 471
    .line 472
    const v16, 0x3f666666    # 0.9f

    .line 473
    .line 474
    .line 475
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 476
    .line 477
    .line 478
    const v0, -0x43dc28f6    # -0.01f

    .line 479
    .line 480
    .line 481
    const/high16 v2, 0x41400000    # 12.0f

    .line 482
    .line 483
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 484
    .line 485
    .line 486
    const/high16 v17, 0x40000000    # 2.0f

    .line 487
    .line 488
    const/4 v13, 0x0

    .line 489
    const v14, 0x3f8ccccd    # 1.1f

    .line 490
    .line 491
    .line 492
    const v15, 0x3f666666    # 0.9f

    .line 493
    .line 494
    .line 495
    const/high16 v16, 0x40000000    # 2.0f

    .line 496
    .line 497
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 498
    .line 499
    .line 500
    const/high16 v0, 0x41800000    # 16.0f

    .line 501
    .line 502
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 503
    .line 504
    .line 505
    const v17, 0x3ffeb852    # 1.99f

    .line 506
    .line 507
    .line 508
    const/high16 v18, -0x40000000    # -2.0f

    .line 509
    .line 510
    const v13, 0x3f8ccccd    # 1.1f

    .line 511
    .line 512
    .line 513
    const/4 v14, 0x0

    .line 514
    const v15, 0x3ffeb852    # 1.99f

    .line 515
    .line 516
    .line 517
    const v16, -0x4099999a    # -0.9f

    .line 518
    .line 519
    .line 520
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 521
    .line 522
    .line 523
    const/high16 v0, 0x41b00000    # 22.0f

    .line 524
    .line 525
    const/high16 v2, 0x40800000    # 4.0f

    .line 526
    .line 527
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 528
    .line 529
    .line 530
    const v0, -0x3f80a3d7    # -3.99f

    .line 531
    .line 532
    .line 533
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 534
    .line 535
    .line 536
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 537
    .line 538
    .line 539
    const v0, 0x41a0147b    # 20.01f

    .line 540
    .line 541
    .line 542
    const/high16 v2, 0x41900000    # 18.0f

    .line 543
    .line 544
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 545
    .line 546
    .line 547
    const/high16 v0, -0x3e800000    # -16.0f

    .line 548
    .line 549
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 550
    .line 551
    .line 552
    const v0, 0x40cf0a3d    # 6.47f

    .line 553
    .line 554
    .line 555
    const v2, 0x408051ec    # 4.01f

    .line 556
    .line 557
    .line 558
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 559
    .line 560
    .line 561
    const v0, 0x40b8a3d7    # 5.77f

    .line 562
    .line 563
    .line 564
    const/high16 v2, 0x41200000    # 10.0f

    .line 565
    .line 566
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 567
    .line 568
    .line 569
    const/high16 v0, 0x41800000    # 16.0f

    .line 570
    .line 571
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 572
    .line 573
    .line 574
    const v0, 0x3faf5c29    # 1.37f

    .line 575
    .line 576
    .line 577
    const v2, -0x40deb852    # -0.63f

    .line 578
    .line 579
    .line 580
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 581
    .line 582
    .line 583
    const/high16 v0, 0x41400000    # 12.0f

    .line 584
    .line 585
    const/high16 v2, 0x41600000    # 14.0f

    .line 586
    .line 587
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 588
    .line 589
    .line 590
    const v0, 0x3faf5c29    # 1.37f

    .line 591
    .line 592
    .line 593
    const v2, 0x3f2147ae    # 0.63f

    .line 594
    .line 595
    .line 596
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 597
    .line 598
    .line 599
    const/high16 v0, 0x41600000    # 14.0f

    .line 600
    .line 601
    const/high16 v2, 0x41800000    # 16.0f

    .line 602
    .line 603
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 604
    .line 605
    .line 606
    const v0, 0x3f2147ae    # 0.63f

    .line 607
    .line 608
    .line 609
    const v2, -0x4050a3d7    # -1.37f

    .line 610
    .line 611
    .line 612
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 613
    .line 614
    .line 615
    const/high16 v0, 0x41900000    # 18.0f

    .line 616
    .line 617
    const/high16 v2, 0x41400000    # 12.0f

    .line 618
    .line 619
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 620
    .line 621
    .line 622
    const v0, -0x40deb852    # -0.63f

    .line 623
    .line 624
    .line 625
    const v2, -0x4050a3d7    # -1.37f

    .line 626
    .line 627
    .line 628
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 629
    .line 630
    .line 631
    const/high16 v0, 0x41800000    # 16.0f

    .line 632
    .line 633
    const/high16 v2, 0x41200000    # 10.0f

    .line 634
    .line 635
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 636
    .line 637
    .line 638
    const v0, 0x408051ec    # 4.01f

    .line 639
    .line 640
    .line 641
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 642
    .line 643
    .line 644
    const/high16 v0, 0x41000000    # 8.0f

    .line 645
    .line 646
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 647
    .line 648
    .line 649
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 650
    .line 651
    .line 652
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 653
    .line 654
    .line 655
    move-result-object v2

    .line 656
    const/16 v16, 0x3800

    .line 657
    .line 658
    const/16 v17, 0x0

    .line 659
    .line 660
    const/high16 v6, 0x3f800000    # 1.0f

    .line 661
    .line 662
    const/high16 v8, 0x3f800000    # 1.0f

    .line 663
    .line 664
    const/4 v7, 0x0

    .line 665
    const/high16 v12, 0x3f800000    # 1.0f

    .line 666
    .line 667
    const/4 v13, 0x0

    .line 668
    const/4 v15, 0x0

    .line 669
    const-string v4, ""

    .line 670
    .line 671
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 672
    .line 673
    .line 674
    move-result-object v0

    .line 675
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 676
    .line 677
    .line 678
    move-result-object v0

    .line 679
    sput-object v0, Landroidx/compose/material/icons/twotone/MovieFilterKt;->_movieFilter:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 680
    .line 681
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 682
    .line 683
    .line 684
    return-object v0
.end method
