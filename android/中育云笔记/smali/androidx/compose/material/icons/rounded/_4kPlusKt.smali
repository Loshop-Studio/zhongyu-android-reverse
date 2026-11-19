.class public final Landroidx/compose/material/icons/rounded/_4kPlusKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static __4kPlus:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final get_4kPlus(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/_4kPlusKt;->__4kPlus:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded._4kPlus"

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
    const/high16 v0, 0x41980000    # 19.0f

    .line 71
    .line 72
    const/high16 v2, 0x40400000    # 3.0f

    .line 73
    .line 74
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v0, 0x40a00000    # 5.0f

    .line 78
    .line 79
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 80
    .line 81
    .line 82
    const/high16 v17, 0x40400000    # 3.0f

    .line 83
    .line 84
    const/high16 v18, 0x40a00000    # 5.0f

    .line 85
    .line 86
    const v13, 0x4079999a    # 3.9f

    .line 87
    .line 88
    .line 89
    const/high16 v14, 0x40400000    # 3.0f

    .line 90
    .line 91
    const/high16 v15, 0x40400000    # 3.0f

    .line 92
    .line 93
    const v16, 0x4079999a    # 3.9f

    .line 94
    .line 95
    .line 96
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 97
    .line 98
    .line 99
    const/high16 v0, 0x41600000    # 14.0f

    .line 100
    .line 101
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 102
    .line 103
    .line 104
    const/high16 v17, 0x40000000    # 2.0f

    .line 105
    .line 106
    const/high16 v18, 0x40000000    # 2.0f

    .line 107
    .line 108
    const/4 v13, 0x0

    .line 109
    const v14, 0x3f8ccccd    # 1.1f

    .line 110
    .line 111
    .line 112
    const v15, 0x3f666666    # 0.9f

    .line 113
    .line 114
    .line 115
    const/high16 v16, 0x40000000    # 2.0f

    .line 116
    .line 117
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 118
    .line 119
    .line 120
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 121
    .line 122
    .line 123
    const/high16 v18, -0x40000000    # -2.0f

    .line 124
    .line 125
    const v13, 0x3f8ccccd    # 1.1f

    .line 126
    .line 127
    .line 128
    const/4 v14, 0x0

    .line 129
    const/high16 v15, 0x40000000    # 2.0f

    .line 130
    .line 131
    const v16, -0x4099999a    # -0.9f

    .line 132
    .line 133
    .line 134
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 135
    .line 136
    .line 137
    const/high16 v0, 0x40a00000    # 5.0f

    .line 138
    .line 139
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 140
    .line 141
    .line 142
    const/high16 v17, 0x41980000    # 19.0f

    .line 143
    .line 144
    const/high16 v18, 0x40400000    # 3.0f

    .line 145
    .line 146
    const/high16 v13, 0x41a80000    # 21.0f

    .line 147
    .line 148
    const v14, 0x4079999a    # 3.9f

    .line 149
    .line 150
    .line 151
    const v15, 0x41a0cccd    # 20.1f

    .line 152
    .line 153
    .line 154
    const/high16 v16, 0x40400000    # 3.0f

    .line 155
    .line 156
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 157
    .line 158
    .line 159
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 160
    .line 161
    .line 162
    const/high16 v0, 0x41240000    # 10.25f

    .line 163
    .line 164
    const/high16 v2, 0x41580000    # 13.5f

    .line 165
    .line 166
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 167
    .line 168
    .line 169
    const/high16 v0, 0x41200000    # 10.0f

    .line 170
    .line 171
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 172
    .line 173
    .line 174
    const/high16 v0, 0x3f400000    # 0.75f

    .line 175
    .line 176
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 177
    .line 178
    .line 179
    const/high16 v17, 0x41140000    # 9.25f

    .line 180
    .line 181
    const/high16 v18, 0x41700000    # 15.0f

    .line 182
    .line 183
    const/high16 v13, 0x41200000    # 10.0f

    .line 184
    .line 185
    const v14, 0x416a8f5c    # 14.66f

    .line 186
    .line 187
    .line 188
    const v15, 0x411a8f5c    # 9.66f

    .line 189
    .line 190
    .line 191
    const/high16 v16, 0x41700000    # 15.0f

    .line 192
    .line 193
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 194
    .line 195
    .line 196
    const/4 v0, 0x0

    .line 197
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 198
    .line 199
    .line 200
    const/high16 v17, -0x40c00000    # -0.75f

    .line 201
    .line 202
    const/high16 v18, -0x40c00000    # -0.75f

    .line 203
    .line 204
    const v13, -0x412e147b    # -0.41f

    .line 205
    .line 206
    .line 207
    const/4 v14, 0x0

    .line 208
    const/high16 v15, -0x40c00000    # -0.75f

    .line 209
    .line 210
    const v16, -0x4151eb85    # -0.34f

    .line 211
    .line 212
    .line 213
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 214
    .line 215
    .line 216
    const/high16 v0, 0x41580000    # 13.5f

    .line 217
    .line 218
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 219
    .line 220
    .line 221
    const/high16 v0, -0x40000000    # -2.0f

    .line 222
    .line 223
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 224
    .line 225
    .line 226
    const/high16 v17, -0x40800000    # -1.0f

    .line 227
    .line 228
    const/high16 v18, -0x40800000    # -1.0f

    .line 229
    .line 230
    const v13, -0x40f33333    # -0.55f

    .line 231
    .line 232
    .line 233
    const/high16 v15, -0x40800000    # -1.0f

    .line 234
    .line 235
    const v16, -0x4119999a    # -0.45f

    .line 236
    .line 237
    .line 238
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 239
    .line 240
    .line 241
    const/high16 v0, 0x411c0000    # 9.75f

    .line 242
    .line 243
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 244
    .line 245
    .line 246
    const/high16 v17, 0x40c80000    # 6.25f

    .line 247
    .line 248
    const/high16 v18, 0x41100000    # 9.0f

    .line 249
    .line 250
    const/high16 v13, 0x40b00000    # 5.5f

    .line 251
    .line 252
    const v14, 0x411570a4    # 9.34f

    .line 253
    .line 254
    .line 255
    const v15, 0x40bae148    # 5.84f

    .line 256
    .line 257
    .line 258
    const/high16 v16, 0x41100000    # 9.0f

    .line 259
    .line 260
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 261
    .line 262
    .line 263
    const/4 v0, 0x0

    .line 264
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 265
    .line 266
    .line 267
    const/high16 v17, 0x40e00000    # 7.0f

    .line 268
    .line 269
    const/high16 v18, 0x411c0000    # 9.75f

    .line 270
    .line 271
    const v13, 0x40d51eb8    # 6.66f

    .line 272
    .line 273
    .line 274
    const/high16 v14, 0x41100000    # 9.0f

    .line 275
    .line 276
    const/high16 v15, 0x40e00000    # 7.0f

    .line 277
    .line 278
    const v16, 0x411570a4    # 9.34f

    .line 279
    .line 280
    .line 281
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 282
    .line 283
    .line 284
    const/high16 v0, 0x41400000    # 12.0f

    .line 285
    .line 286
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 287
    .line 288
    .line 289
    const/high16 v0, 0x3fc00000    # 1.5f

    .line 290
    .line 291
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 292
    .line 293
    .line 294
    const/high16 v0, 0x411c0000    # 9.75f

    .line 295
    .line 296
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 297
    .line 298
    .line 299
    const/high16 v17, 0x41140000    # 9.25f

    .line 300
    .line 301
    const/high16 v18, 0x41100000    # 9.0f

    .line 302
    .line 303
    const/high16 v13, 0x41080000    # 8.5f

    .line 304
    .line 305
    const v14, 0x411570a4    # 9.34f

    .line 306
    .line 307
    .line 308
    const v15, 0x410d70a4    # 8.84f

    .line 309
    .line 310
    .line 311
    const/high16 v16, 0x41100000    # 9.0f

    .line 312
    .line 313
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 314
    .line 315
    .line 316
    const/4 v0, 0x0

    .line 317
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 318
    .line 319
    .line 320
    const/high16 v17, 0x41200000    # 10.0f

    .line 321
    .line 322
    const/high16 v18, 0x411c0000    # 9.75f

    .line 323
    .line 324
    const v13, 0x411a8f5c    # 9.66f

    .line 325
    .line 326
    .line 327
    const/high16 v14, 0x41100000    # 9.0f

    .line 328
    .line 329
    const/high16 v15, 0x41200000    # 10.0f

    .line 330
    .line 331
    const v16, 0x411570a4    # 9.34f

    .line 332
    .line 333
    .line 334
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 335
    .line 336
    .line 337
    const/high16 v0, 0x41400000    # 12.0f

    .line 338
    .line 339
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 340
    .line 341
    .line 342
    const/high16 v0, 0x3e800000    # 0.25f

    .line 343
    .line 344
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 345
    .line 346
    .line 347
    const/high16 v17, 0x3f400000    # 0.75f

    .line 348
    .line 349
    const/high16 v18, 0x3f400000    # 0.75f

    .line 350
    .line 351
    const v13, 0x3ed1eb85    # 0.41f

    .line 352
    .line 353
    .line 354
    const/4 v14, 0x0

    .line 355
    const/high16 v15, 0x3f400000    # 0.75f

    .line 356
    .line 357
    const v16, 0x3eae147b    # 0.34f

    .line 358
    .line 359
    .line 360
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 361
    .line 362
    .line 363
    const/4 v0, 0x0

    .line 364
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 365
    .line 366
    .line 367
    const/high16 v17, 0x41240000    # 10.25f

    .line 368
    .line 369
    const/high16 v18, 0x41580000    # 13.5f

    .line 370
    .line 371
    const/high16 v13, 0x41300000    # 11.0f

    .line 372
    .line 373
    const v14, 0x41528f5c    # 13.16f

    .line 374
    .line 375
    .line 376
    const v15, 0x412a8f5c    # 10.66f

    .line 377
    .line 378
    .line 379
    const/high16 v16, 0x41580000    # 13.5f

    .line 380
    .line 381
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 382
    .line 383
    .line 384
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 385
    .line 386
    .line 387
    const/high16 v0, 0x41700000    # 15.0f

    .line 388
    .line 389
    const v2, 0x417170a4    # 15.09f

    .line 390
    .line 391
    .line 392
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 393
    .line 394
    .line 395
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 396
    .line 397
    .line 398
    const v17, -0x40f33333    # -0.55f

    .line 399
    .line 400
    .line 401
    const v18, -0x4175c28f    # -0.27f

    .line 402
    .line 403
    .line 404
    const v13, -0x419eb852    # -0.22f

    .line 405
    .line 406
    .line 407
    const/4 v14, 0x0

    .line 408
    const v15, -0x4128f5c3    # -0.42f

    .line 409
    .line 410
    .line 411
    const v16, -0x42333333    # -0.1f

    .line 412
    .line 413
    .line 414
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 415
    .line 416
    .line 417
    const/high16 v0, 0x41500000    # 13.0f

    .line 418
    .line 419
    const/high16 v2, 0x414c0000    # 12.75f

    .line 420
    .line 421
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 422
    .line 423
    .line 424
    const v0, 0x3fc66666    # 1.55f

    .line 425
    .line 426
    .line 427
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 428
    .line 429
    .line 430
    const v17, -0x40cccccd    # -0.7f

    .line 431
    .line 432
    .line 433
    const v18, 0x3f333333    # 0.7f

    .line 434
    .line 435
    .line 436
    const/4 v13, 0x0

    .line 437
    const v14, 0x3ec7ae14    # 0.39f

    .line 438
    .line 439
    .line 440
    const v15, -0x416147ae    # -0.31f

    .line 441
    .line 442
    .line 443
    const v16, 0x3f333333    # 0.7f

    .line 444
    .line 445
    .line 446
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 447
    .line 448
    .line 449
    const v0, 0x41433333    # 12.2f

    .line 450
    .line 451
    .line 452
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 453
    .line 454
    .line 455
    const v18, -0x40cccccd    # -0.7f

    .line 456
    .line 457
    .line 458
    const v13, -0x413851ec    # -0.39f

    .line 459
    .line 460
    .line 461
    const/4 v14, 0x0

    .line 462
    const v15, -0x40cccccd    # -0.7f

    .line 463
    .line 464
    .line 465
    const v16, -0x416147ae    # -0.31f

    .line 466
    .line 467
    .line 468
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 469
    .line 470
    .line 471
    const v0, 0x411b3333    # 9.7f

    .line 472
    .line 473
    .line 474
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 475
    .line 476
    .line 477
    const v17, 0x3f333333    # 0.7f

    .line 478
    .line 479
    .line 480
    const/4 v13, 0x0

    .line 481
    const v14, -0x413851ec    # -0.39f

    .line 482
    .line 483
    .line 484
    const v15, 0x3e9eb852    # 0.31f

    .line 485
    .line 486
    .line 487
    const v16, -0x40cccccd    # -0.7f

    .line 488
    .line 489
    .line 490
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 491
    .line 492
    .line 493
    const v0, 0x3db851ec    # 0.09f

    .line 494
    .line 495
    .line 496
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 497
    .line 498
    .line 499
    const/high16 v17, 0x41500000    # 13.0f

    .line 500
    .line 501
    const v18, 0x411b3333    # 9.7f

    .line 502
    .line 503
    .line 504
    const v13, 0x414b0a3d    # 12.69f

    .line 505
    .line 506
    .line 507
    const/high16 v14, 0x41100000    # 9.0f

    .line 508
    .line 509
    const/high16 v15, 0x41500000    # 13.0f

    .line 510
    .line 511
    const v16, 0x4114f5c3    # 9.31f

    .line 512
    .line 513
    .line 514
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 515
    .line 516
    .line 517
    const v0, 0x3fc66666    # 1.55f

    .line 518
    .line 519
    .line 520
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 521
    .line 522
    .line 523
    const v0, 0x3fc51eb8    # 1.54f

    .line 524
    .line 525
    .line 526
    const v2, -0x40028f5c    # -1.98f

    .line 527
    .line 528
    .line 529
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 530
    .line 531
    .line 532
    const v17, 0x417170a4    # 15.09f

    .line 533
    .line 534
    .line 535
    const/high16 v18, 0x41100000    # 9.0f

    .line 536
    .line 537
    const v13, 0x416ab852    # 14.67f

    .line 538
    .line 539
    .line 540
    const v14, 0x4111999a    # 9.1f

    .line 541
    .line 542
    .line 543
    const v15, 0x416e147b    # 14.88f

    .line 544
    .line 545
    .line 546
    const/high16 v16, 0x41100000    # 9.0f

    .line 547
    .line 548
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 549
    .line 550
    .line 551
    const/4 v0, 0x0

    .line 552
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 553
    .line 554
    .line 555
    const v17, 0x3f0f5c29    # 0.56f

    .line 556
    .line 557
    .line 558
    const v18, 0x3f8f5c29    # 1.12f

    .line 559
    .line 560
    .line 561
    const v13, 0x3f147ae1    # 0.58f

    .line 562
    .line 563
    .line 564
    const/4 v14, 0x0

    .line 565
    const v15, 0x3f68f5c3    # 0.91f

    .line 566
    .line 567
    .line 568
    const v16, 0x3f28f5c3    # 0.66f

    .line 569
    .line 570
    .line 571
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 572
    .line 573
    .line 574
    const/high16 v0, 0x41640000    # 14.25f

    .line 575
    .line 576
    const/high16 v2, 0x41400000    # 12.0f

    .line 577
    .line 578
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 579
    .line 580
    .line 581
    const v0, 0x3fb47ae1    # 1.41f

    .line 582
    .line 583
    .line 584
    const v2, 0x3ff0a3d7    # 1.88f

    .line 585
    .line 586
    .line 587
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 588
    .line 589
    .line 590
    const v17, 0x417170a4    # 15.09f

    .line 591
    .line 592
    .line 593
    const/high16 v18, 0x41700000    # 15.0f

    .line 594
    .line 595
    const/high16 v13, 0x41800000    # 16.0f

    .line 596
    .line 597
    const v14, 0x416570a4    # 14.34f

    .line 598
    .line 599
    .line 600
    const v15, 0x417ab852    # 15.67f

    .line 601
    .line 602
    .line 603
    const/high16 v16, 0x41700000    # 15.0f

    .line 604
    .line 605
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 606
    .line 607
    .line 608
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 609
    .line 610
    .line 611
    const/high16 v0, 0x41940000    # 18.5f

    .line 612
    .line 613
    const/high16 v2, 0x41480000    # 12.5f

    .line 614
    .line 615
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 616
    .line 617
    .line 618
    const/high16 v0, -0x40800000    # -1.0f

    .line 619
    .line 620
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 621
    .line 622
    .line 623
    const/high16 v0, 0x3f800000    # 1.0f

    .line 624
    .line 625
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 626
    .line 627
    .line 628
    const/high16 v17, -0x41000000    # -0.5f

    .line 629
    .line 630
    const/high16 v18, 0x3f000000    # 0.5f

    .line 631
    .line 632
    const/4 v13, 0x0

    .line 633
    const v14, 0x3e8f5c29    # 0.28f

    .line 634
    .line 635
    .line 636
    const v15, -0x419eb852    # -0.22f

    .line 637
    .line 638
    .line 639
    const/high16 v16, 0x3f000000    # 0.5f

    .line 640
    .line 641
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 642
    .line 643
    .line 644
    const/4 v0, 0x0

    .line 645
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 646
    .line 647
    .line 648
    const/high16 v18, -0x41000000    # -0.5f

    .line 649
    .line 650
    const v13, -0x4170a3d7    # -0.28f

    .line 651
    .line 652
    .line 653
    const/4 v14, 0x0

    .line 654
    const/high16 v15, -0x41000000    # -0.5f

    .line 655
    .line 656
    const v16, -0x419eb852    # -0.22f

    .line 657
    .line 658
    .line 659
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 660
    .line 661
    .line 662
    const/high16 v0, -0x40800000    # -1.0f

    .line 663
    .line 664
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 665
    .line 666
    .line 667
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 668
    .line 669
    .line 670
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 671
    .line 672
    .line 673
    const/4 v0, 0x0

    .line 674
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 675
    .line 676
    .line 677
    const/high16 v17, 0x3f000000    # 0.5f

    .line 678
    .line 679
    const/4 v13, 0x0

    .line 680
    const v14, -0x4170a3d7    # -0.28f

    .line 681
    .line 682
    .line 683
    const v15, 0x3e6147ae    # 0.22f

    .line 684
    .line 685
    .line 686
    const/high16 v16, -0x41000000    # -0.5f

    .line 687
    .line 688
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 689
    .line 690
    .line 691
    const/high16 v0, 0x3f800000    # 1.0f

    .line 692
    .line 693
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 694
    .line 695
    .line 696
    const/high16 v0, -0x40800000    # -1.0f

    .line 697
    .line 698
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 699
    .line 700
    .line 701
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 702
    .line 703
    .line 704
    const/4 v0, 0x0

    .line 705
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 706
    .line 707
    .line 708
    const/high16 v18, 0x3f000000    # 0.5f

    .line 709
    .line 710
    const v13, 0x3e8f5c29    # 0.28f

    .line 711
    .line 712
    .line 713
    const/4 v14, 0x0

    .line 714
    const/high16 v15, 0x3f000000    # 0.5f

    .line 715
    .line 716
    const v16, 0x3e6147ae    # 0.22f

    .line 717
    .line 718
    .line 719
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 720
    .line 721
    .line 722
    const/high16 v0, 0x3f800000    # 1.0f

    .line 723
    .line 724
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 725
    .line 726
    .line 727
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 728
    .line 729
    .line 730
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 731
    .line 732
    .line 733
    const/4 v0, 0x0

    .line 734
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 735
    .line 736
    .line 737
    const/high16 v17, 0x41940000    # 18.5f

    .line 738
    .line 739
    const/high16 v18, 0x41480000    # 12.5f

    .line 740
    .line 741
    const/high16 v13, 0x41980000    # 19.0f

    .line 742
    .line 743
    const v14, 0x41447ae1    # 12.28f

    .line 744
    .line 745
    .line 746
    const v15, 0x41963d71    # 18.78f

    .line 747
    .line 748
    .line 749
    const/high16 v16, 0x41480000    # 12.5f

    .line 750
    .line 751
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 752
    .line 753
    .line 754
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 755
    .line 756
    .line 757
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 758
    .line 759
    .line 760
    move-result-object v2

    .line 761
    const/16 v16, 0x3800

    .line 762
    .line 763
    const/16 v17, 0x0

    .line 764
    .line 765
    const/high16 v6, 0x3f800000    # 1.0f

    .line 766
    .line 767
    const/high16 v8, 0x3f800000    # 1.0f

    .line 768
    .line 769
    const/4 v7, 0x0

    .line 770
    const/high16 v9, 0x3f800000    # 1.0f

    .line 771
    .line 772
    const/high16 v12, 0x3f800000    # 1.0f

    .line 773
    .line 774
    const/4 v13, 0x0

    .line 775
    const/4 v14, 0x0

    .line 776
    const/4 v15, 0x0

    .line 777
    const-string v4, ""

    .line 778
    .line 779
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 780
    .line 781
    .line 782
    move-result-object v0

    .line 783
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 784
    .line 785
    .line 786
    move-result-object v0

    .line 787
    sput-object v0, Landroidx/compose/material/icons/rounded/_4kPlusKt;->__4kPlus:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 788
    .line 789
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 790
    .line 791
    .line 792
    return-object v0
.end method
