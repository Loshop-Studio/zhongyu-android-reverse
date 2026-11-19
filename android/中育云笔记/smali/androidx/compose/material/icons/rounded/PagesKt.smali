.class public final Landroidx/compose/material/icons/rounded/PagesKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _pages:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getPages(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/PagesKt;->_pages:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.Pages"

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
    const/high16 v0, 0x40400000    # 3.0f

    .line 71
    .line 72
    const/high16 v2, 0x40a00000    # 5.0f

    .line 73
    .line 74
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v0, 0x40c00000    # 6.0f

    .line 78
    .line 79
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 80
    .line 81
    .line 82
    const/high16 v0, 0x40a00000    # 5.0f

    .line 83
    .line 84
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 85
    .line 86
    .line 87
    const v0, -0x3fe7ae14    # -2.38f

    .line 88
    .line 89
    .line 90
    const v2, -0x40e66666    # -0.6f

    .line 91
    .line 92
    .line 93
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 94
    .line 95
    .line 96
    const v17, 0x3f9c28f6    # 1.22f

    .line 97
    .line 98
    .line 99
    const v18, -0x4063d70a    # -1.22f

    .line 100
    .line 101
    .line 102
    const v13, -0x41c7ae14    # -0.18f

    .line 103
    .line 104
    .line 105
    const v14, -0x40c28f5c    # -0.74f

    .line 106
    .line 107
    .line 108
    const v15, 0x3ef5c28f    # 0.48f

    .line 109
    .line 110
    .line 111
    const v16, -0x404ccccd    # -1.4f

    .line 112
    .line 113
    .line 114
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 115
    .line 116
    .line 117
    const/high16 v0, 0x41000000    # 8.0f

    .line 118
    .line 119
    const/high16 v2, 0x41300000    # 11.0f

    .line 120
    .line 121
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 122
    .line 123
    .line 124
    const/high16 v0, 0x41300000    # 11.0f

    .line 125
    .line 126
    const/high16 v2, 0x40400000    # 3.0f

    .line 127
    .line 128
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 129
    .line 130
    .line 131
    const/high16 v0, 0x40400000    # 3.0f

    .line 132
    .line 133
    const/high16 v2, 0x40a00000    # 5.0f

    .line 134
    .line 135
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 136
    .line 137
    .line 138
    const/high16 v17, -0x40000000    # -2.0f

    .line 139
    .line 140
    const/high16 v18, 0x40000000    # 2.0f

    .line 141
    .line 142
    const v13, -0x40733333    # -1.1f

    .line 143
    .line 144
    .line 145
    const/4 v14, 0x0

    .line 146
    const/high16 v15, -0x40000000    # -2.0f

    .line 147
    .line 148
    const v16, 0x3f666666    # 0.9f

    .line 149
    .line 150
    .line 151
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 152
    .line 153
    .line 154
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 155
    .line 156
    .line 157
    const/high16 v0, 0x41000000    # 8.0f

    .line 158
    .line 159
    const/high16 v2, 0x41500000    # 13.0f

    .line 160
    .line 161
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 162
    .line 163
    .line 164
    const/high16 v0, 0x41500000    # 13.0f

    .line 165
    .line 166
    const/high16 v2, 0x40400000    # 3.0f

    .line 167
    .line 168
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 169
    .line 170
    .line 171
    const/high16 v0, 0x40c00000    # 6.0f

    .line 172
    .line 173
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 174
    .line 175
    .line 176
    const/high16 v17, 0x40000000    # 2.0f

    .line 177
    .line 178
    const/4 v13, 0x0

    .line 179
    const v14, 0x3f8ccccd    # 1.1f

    .line 180
    .line 181
    .line 182
    const v15, 0x3f666666    # 0.9f

    .line 183
    .line 184
    .line 185
    const/high16 v16, 0x40000000    # 2.0f

    .line 186
    .line 187
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 188
    .line 189
    .line 190
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 191
    .line 192
    .line 193
    const/high16 v0, -0x3f600000    # -5.0f

    .line 194
    .line 195
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 196
    .line 197
    .line 198
    const v0, 0x3f19999a    # 0.6f

    .line 199
    .line 200
    .line 201
    const v2, -0x3fe7ae14    # -2.38f

    .line 202
    .line 203
    .line 204
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 205
    .line 206
    .line 207
    const v17, -0x40651eb8    # -1.21f

    .line 208
    .line 209
    .line 210
    const v18, -0x40651eb8    # -1.21f

    .line 211
    .line 212
    .line 213
    const v13, -0x40c51eb8    # -0.73f

    .line 214
    .line 215
    .line 216
    const v14, 0x3e3851ec    # 0.18f

    .line 217
    .line 218
    .line 219
    const v15, -0x404ccccd    # -1.4f

    .line 220
    .line 221
    .line 222
    const v16, -0x410a3d71    # -0.48f

    .line 223
    .line 224
    .line 225
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 226
    .line 227
    .line 228
    const/high16 v0, 0x41000000    # 8.0f

    .line 229
    .line 230
    const/high16 v2, 0x41500000    # 13.0f

    .line 231
    .line 232
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 233
    .line 234
    .line 235
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 236
    .line 237
    .line 238
    const v0, 0x4176147b    # 15.38f

    .line 239
    .line 240
    .line 241
    const v2, 0x4184cccd    # 16.6f

    .line 242
    .line 243
    .line 244
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 245
    .line 246
    .line 247
    const/high16 v0, 0x41800000    # 16.0f

    .line 248
    .line 249
    const/high16 v2, 0x41500000    # 13.0f

    .line 250
    .line 251
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 252
    .line 253
    .line 254
    const/high16 v0, 0x40a00000    # 5.0f

    .line 255
    .line 256
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 257
    .line 258
    .line 259
    const/high16 v0, 0x40c00000    # 6.0f

    .line 260
    .line 261
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 262
    .line 263
    .line 264
    const/high16 v17, 0x40000000    # 2.0f

    .line 265
    .line 266
    const/high16 v18, -0x40000000    # -2.0f

    .line 267
    .line 268
    const v13, 0x3f8ccccd    # 1.1f

    .line 269
    .line 270
    .line 271
    const/4 v14, 0x0

    .line 272
    const/high16 v15, 0x40000000    # 2.0f

    .line 273
    .line 274
    const v16, -0x4099999a    # -0.9f

    .line 275
    .line 276
    .line 277
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 278
    .line 279
    .line 280
    const/high16 v0, -0x3f400000    # -6.0f

    .line 281
    .line 282
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 283
    .line 284
    .line 285
    const/high16 v0, -0x3f600000    # -5.0f

    .line 286
    .line 287
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 288
    .line 289
    .line 290
    const v0, 0x401851ec    # 2.38f

    .line 291
    .line 292
    .line 293
    const v2, 0x3f19999a    # 0.6f

    .line 294
    .line 295
    .line 296
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 297
    .line 298
    .line 299
    const v17, -0x4063d70a    # -1.22f

    .line 300
    .line 301
    .line 302
    const v18, 0x3f9c28f6    # 1.22f

    .line 303
    .line 304
    .line 305
    const v13, 0x3e3851ec    # 0.18f

    .line 306
    .line 307
    .line 308
    const v14, 0x3f3d70a4    # 0.74f

    .line 309
    .line 310
    .line 311
    const v15, -0x410a3d71    # -0.48f

    .line 312
    .line 313
    .line 314
    const v16, 0x3fb33333    # 1.4f

    .line 315
    .line 316
    .line 317
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 318
    .line 319
    .line 320
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 321
    .line 322
    .line 323
    const/high16 v0, 0x41980000    # 19.0f

    .line 324
    .line 325
    const/high16 v2, 0x40400000    # 3.0f

    .line 326
    .line 327
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 328
    .line 329
    .line 330
    const/high16 v0, -0x3f400000    # -6.0f

    .line 331
    .line 332
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 333
    .line 334
    .line 335
    const/high16 v0, 0x40a00000    # 5.0f

    .line 336
    .line 337
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 338
    .line 339
    .line 340
    const v0, 0x401851ec    # 2.38f

    .line 341
    .line 342
    .line 343
    const v2, -0x40e66666    # -0.6f

    .line 344
    .line 345
    .line 346
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 347
    .line 348
    .line 349
    const v17, 0x3f9ae148    # 1.21f

    .line 350
    .line 351
    .line 352
    const v18, 0x3f9ae148    # 1.21f

    .line 353
    .line 354
    .line 355
    const v13, 0x3f3ae148    # 0.73f

    .line 356
    .line 357
    .line 358
    const v14, -0x41c7ae14    # -0.18f

    .line 359
    .line 360
    .line 361
    const v15, 0x3fb33333    # 1.4f

    .line 362
    .line 363
    .line 364
    const v16, 0x3ef5c28f    # 0.48f

    .line 365
    .line 366
    .line 367
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 368
    .line 369
    .line 370
    const/high16 v0, 0x41800000    # 16.0f

    .line 371
    .line 372
    const/high16 v2, 0x41300000    # 11.0f

    .line 373
    .line 374
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 375
    .line 376
    .line 377
    const/high16 v0, 0x40a00000    # 5.0f

    .line 378
    .line 379
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 380
    .line 381
    .line 382
    const/high16 v0, 0x41a80000    # 21.0f

    .line 383
    .line 384
    const/high16 v2, 0x40a00000    # 5.0f

    .line 385
    .line 386
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 387
    .line 388
    .line 389
    const/high16 v17, -0x40000000    # -2.0f

    .line 390
    .line 391
    const/high16 v18, -0x40000000    # -2.0f

    .line 392
    .line 393
    const/4 v13, 0x0

    .line 394
    const v14, -0x40733333    # -1.1f

    .line 395
    .line 396
    .line 397
    const v15, -0x4099999a    # -0.9f

    .line 398
    .line 399
    .line 400
    const/high16 v16, -0x40000000    # -2.0f

    .line 401
    .line 402
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 403
    .line 404
    .line 405
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 406
    .line 407
    .line 408
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 409
    .line 410
    .line 411
    move-result-object v2

    .line 412
    const/16 v16, 0x3800

    .line 413
    .line 414
    const/16 v17, 0x0

    .line 415
    .line 416
    const/high16 v6, 0x3f800000    # 1.0f

    .line 417
    .line 418
    const/high16 v8, 0x3f800000    # 1.0f

    .line 419
    .line 420
    const/4 v7, 0x0

    .line 421
    const/high16 v9, 0x3f800000    # 1.0f

    .line 422
    .line 423
    const/high16 v12, 0x3f800000    # 1.0f

    .line 424
    .line 425
    const/4 v14, 0x0

    .line 426
    const/4 v15, 0x0

    .line 427
    const-string v4, ""

    .line 428
    .line 429
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 430
    .line 431
    .line 432
    move-result-object v0

    .line 433
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 434
    .line 435
    .line 436
    move-result-object v0

    .line 437
    sput-object v0, Landroidx/compose/material/icons/rounded/PagesKt;->_pages:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 438
    .line 439
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 440
    .line 441
    .line 442
    return-object v0
.end method
